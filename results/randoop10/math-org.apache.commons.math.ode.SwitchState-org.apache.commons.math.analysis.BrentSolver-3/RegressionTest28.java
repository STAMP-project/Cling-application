import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class RegressionTest28 {

    public static boolean debug = false;

    @Test
    public void test14001() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest28.test14001");
        org.apache.commons.math.MathException mathException2 = new org.apache.commons.math.MathException("org.apache.commons.math.MathException: org.apache.commons.math.MathException");
        org.apache.commons.math.ConvergenceException convergenceException3 = new org.apache.commons.math.ConvergenceException("org.apache.commons.math.FunctionEvaluationException: org.apache.commons.math.ConvergenceException: org.apache.commons.math.MaxIterationsExceededException: org.apache.commons.math.ConvergenceException: hi!", (java.lang.Throwable) mathException2);
        org.apache.commons.math.ode.DerivativeException derivativeException4 = new org.apache.commons.math.ode.DerivativeException((java.lang.Throwable) mathException2);
    }

    @Test
    public void test14002() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest28.test14002");
        java.lang.Object[] objArray10 = new java.lang.Object[] { (-1.0d) };
        java.lang.Throwable throwable11 = null;
        org.apache.commons.math.MathException mathException12 = new org.apache.commons.math.MathException("hi!", objArray10, throwable11);
        java.lang.Object[] objArray16 = new java.lang.Object[] { (-1.0d) };
        java.lang.Throwable throwable17 = null;
        org.apache.commons.math.MathException mathException18 = new org.apache.commons.math.MathException("hi!", objArray16, throwable17);
        org.apache.commons.math.FunctionEvaluationException functionEvaluationException19 = new org.apache.commons.math.FunctionEvaluationException((double) 100.0f, throwable17);
        org.apache.commons.math.FunctionEvaluationException functionEvaluationException20 = new org.apache.commons.math.FunctionEvaluationException((double) 1.0f, "", objArray10, throwable17);
        java.lang.Object[] objArray21 = functionEvaluationException20.getArguments();
        org.apache.commons.math.MathException mathException22 = new org.apache.commons.math.MathException("hi!", (java.lang.Throwable) functionEvaluationException20);
        java.lang.Object[] objArray29 = new java.lang.Object[] { (-1.0d) };
        java.lang.Throwable throwable30 = null;
        org.apache.commons.math.MathException mathException31 = new org.apache.commons.math.MathException("hi!", objArray29, throwable30);
        java.lang.Object[] objArray35 = new java.lang.Object[] { (-1.0d) };
        java.lang.Throwable throwable36 = null;
        org.apache.commons.math.MathException mathException37 = new org.apache.commons.math.MathException("hi!", objArray35, throwable36);
        org.apache.commons.math.FunctionEvaluationException functionEvaluationException38 = new org.apache.commons.math.FunctionEvaluationException((double) 100.0f, throwable36);
        org.apache.commons.math.FunctionEvaluationException functionEvaluationException39 = new org.apache.commons.math.FunctionEvaluationException((double) 1.0f, "", objArray29, throwable36);
        org.apache.commons.math.ConvergenceException convergenceException40 = new org.apache.commons.math.ConvergenceException("", (java.lang.Throwable) functionEvaluationException39);
        org.apache.commons.math.FunctionEvaluationException functionEvaluationException41 = new org.apache.commons.math.FunctionEvaluationException((-1.0d), (java.lang.Throwable) functionEvaluationException39);
        functionEvaluationException20.addSuppressed((java.lang.Throwable) functionEvaluationException39);
        org.apache.commons.math.MathException mathException43 = new org.apache.commons.math.MathException((java.lang.Throwable) functionEvaluationException20);
        org.apache.commons.math.ConvergenceException convergenceException44 = new org.apache.commons.math.ConvergenceException((java.lang.Throwable) functionEvaluationException20);
        double double45 = functionEvaluationException20.getArgument();
        org.apache.commons.math.FunctionEvaluationException functionEvaluationException46 = new org.apache.commons.math.FunctionEvaluationException((double) 100L, (java.lang.Throwable) functionEvaluationException20);
        org.apache.commons.math.FunctionEvaluationException functionEvaluationException47 = new org.apache.commons.math.FunctionEvaluationException((double) 100L, (java.lang.Throwable) functionEvaluationException20);
        org.apache.commons.math.MathException mathException48 = new org.apache.commons.math.MathException((java.lang.Throwable) functionEvaluationException20);
        java.lang.Object[] objArray49 = functionEvaluationException20.getArguments();
        org.apache.commons.math.MathException mathException50 = new org.apache.commons.math.MathException("org.apache.commons.math.MathException: org.apache.commons.math.MathException: org.apache.commons.math.MaxIterationsExceededException: Maximal number of iterations (0) exceeded", objArray49);
        org.apache.commons.math.MaxIterationsExceededException maxIterationsExceededException51 = new org.apache.commons.math.MaxIterationsExceededException((int) (short) 100, "org.apache.commons.math.MathException: Maximal number of iterations ({0}) exceeded", objArray49);
        java.lang.String str52 = maxIterationsExceededException51.toString();
        org.junit.Assert.assertNotNull(objArray10);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray10), "[-1.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray10), "[-1.0]");
        org.junit.Assert.assertNotNull(objArray16);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray16), "[-1.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray16), "[-1.0]");
        org.junit.Assert.assertNotNull(objArray21);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray21), "[-1.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray21), "[-1.0]");
        org.junit.Assert.assertNotNull(objArray29);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray29), "[-1.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray29), "[-1.0]");
        org.junit.Assert.assertNotNull(objArray35);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray35), "[-1.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray35), "[-1.0]");
        org.junit.Assert.assertTrue("'" + double45 + "' != '" + 1.0d + "'", double45 == 1.0d);
        org.junit.Assert.assertNotNull(objArray49);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray49), "[-1.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray49), "[-1.0]");
        org.junit.Assert.assertEquals("'" + str52 + "' != '" + "org.apache.commons.math.MaxIterationsExceededException: org.apache.commons.math.MathException: Maximal number of iterations (-1) exceeded" + "'", str52, "org.apache.commons.math.MaxIterationsExceededException: org.apache.commons.math.MathException: Maximal number of iterations (-1) exceeded");
    }

    @Test
    public void test14003() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest28.test14003");
        java.lang.Object[] objArray11 = new java.lang.Object[] { (-1.0d) };
        java.lang.Throwable throwable12 = null;
        org.apache.commons.math.MathException mathException13 = new org.apache.commons.math.MathException("hi!", objArray11, throwable12);
        org.apache.commons.math.MathException mathException14 = new org.apache.commons.math.MathException("", objArray11);
        java.lang.Object[] objArray17 = new java.lang.Object[] { (-1.0d) };
        java.lang.Throwable throwable18 = null;
        org.apache.commons.math.MathException mathException19 = new org.apache.commons.math.MathException("hi!", objArray17, throwable18);
        java.lang.Object[] objArray20 = mathException19.getArguments();
        java.lang.Object[] objArray22 = new java.lang.Object[] { mathException14, objArray20, 10.0f };
        org.apache.commons.math.MathException mathException23 = new org.apache.commons.math.MathException("hi!", objArray20);
        org.apache.commons.math.ode.DerivativeException derivativeException24 = new org.apache.commons.math.ode.DerivativeException((java.lang.Throwable) mathException23);
        org.apache.commons.math.ConvergenceException convergenceException25 = new org.apache.commons.math.ConvergenceException("hi!", (java.lang.Throwable) derivativeException24);
        java.lang.Throwable[] throwableArray26 = derivativeException24.getSuppressed();
        java.lang.Object[] objArray27 = derivativeException24.getArguments();
        org.apache.commons.math.FunctionEvaluationException functionEvaluationException28 = new org.apache.commons.math.FunctionEvaluationException((double) 0, "org.apache.commons.math.MathException: hi!", objArray27);
        org.apache.commons.math.ConvergenceException convergenceException30 = new org.apache.commons.math.ConvergenceException("org.apache.commons.math.FunctionEvaluationException: org.apache.commons.math.ConvergenceException: hi!");
        org.apache.commons.math.MathException mathException31 = new org.apache.commons.math.MathException((java.lang.Throwable) convergenceException30);
        org.apache.commons.math.MathException mathException32 = new org.apache.commons.math.MathException("Evaluation failed for argument = 100", objArray27, (java.lang.Throwable) convergenceException30);
        org.apache.commons.math.FunctionEvaluationException functionEvaluationException33 = new org.apache.commons.math.FunctionEvaluationException((double) ' ', (java.lang.Throwable) mathException32);
        org.apache.commons.math.FunctionEvaluationException functionEvaluationException34 = new org.apache.commons.math.FunctionEvaluationException((double) 'a', "org.apache.commons.math.FunctionEvaluationException: ", (java.lang.Throwable) mathException32);
        org.apache.commons.math.MathException mathException35 = new org.apache.commons.math.MathException((java.lang.Throwable) functionEvaluationException34);
        java.lang.Throwable[] throwableArray36 = functionEvaluationException34.getSuppressed();
        java.lang.Class<?> wildcardClass37 = throwableArray36.getClass();
        org.junit.Assert.assertNotNull(objArray11);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray11), "[-1.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray11), "[-1.0]");
        org.junit.Assert.assertNotNull(objArray17);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray17), "[-1.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray17), "[-1.0]");
        org.junit.Assert.assertNotNull(objArray20);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray20), "[-1.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray20), "[-1.0]");
        org.junit.Assert.assertNotNull(objArray22);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray22), "[org.apache.commons.math.MathException: , [-1.0], 10.0]");
        org.junit.Assert.assertNotNull(throwableArray26);
        org.junit.Assert.assertNotNull(objArray27);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray27), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray27), "[]");
        org.junit.Assert.assertNotNull(throwableArray36);
        org.junit.Assert.assertNotNull(wildcardClass37);
    }

    @Test
    public void test14004() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest28.test14004");
        java.lang.Object[] objArray8 = new java.lang.Object[] { (-1.0d) };
        java.lang.Throwable throwable9 = null;
        org.apache.commons.math.MathException mathException10 = new org.apache.commons.math.MathException("hi!", objArray8, throwable9);
        org.apache.commons.math.MathException mathException11 = new org.apache.commons.math.MathException("", objArray8);
        org.apache.commons.math.MathException mathException12 = new org.apache.commons.math.MathException("", (java.lang.Throwable) mathException11);
        org.apache.commons.math.MathException mathException13 = new org.apache.commons.math.MathException((java.lang.Throwable) mathException11);
        org.apache.commons.math.ConvergenceException convergenceException14 = new org.apache.commons.math.ConvergenceException("org.apache.commons.math.FunctionEvaluationException: org.apache.commons.math.ConvergenceException: hi!", (java.lang.Throwable) mathException11);
        java.lang.Object[] objArray15 = mathException11.getArguments();
        java.lang.Object[] objArray20 = new java.lang.Object[] { (-1.0d) };
        java.lang.Throwable throwable21 = null;
        org.apache.commons.math.MathException mathException22 = new org.apache.commons.math.MathException("hi!", objArray20, throwable21);
        org.apache.commons.math.ConvergenceException convergenceException23 = new org.apache.commons.math.ConvergenceException("hi!", objArray20);
        java.lang.Object[] objArray28 = new java.lang.Object[] { (-1.0d) };
        java.lang.Throwable throwable29 = null;
        org.apache.commons.math.MathException mathException30 = new org.apache.commons.math.MathException("hi!", objArray28, throwable29);
        java.lang.Object[] objArray34 = new java.lang.Object[] { (-1.0d) };
        java.lang.Throwable throwable35 = null;
        org.apache.commons.math.MathException mathException36 = new org.apache.commons.math.MathException("hi!", objArray34, throwable35);
        org.apache.commons.math.FunctionEvaluationException functionEvaluationException37 = new org.apache.commons.math.FunctionEvaluationException((double) 100.0f, throwable35);
        org.apache.commons.math.FunctionEvaluationException functionEvaluationException38 = new org.apache.commons.math.FunctionEvaluationException((double) 1.0f, "", objArray28, throwable35);
        java.lang.Object[] objArray39 = functionEvaluationException38.getArguments();
        org.apache.commons.math.ConvergenceException convergenceException40 = new org.apache.commons.math.ConvergenceException("", objArray20, (java.lang.Throwable) functionEvaluationException38);
        mathException11.addSuppressed((java.lang.Throwable) convergenceException40);
        java.lang.Throwable[] throwableArray42 = mathException11.getSuppressed();
        org.apache.commons.math.ConvergenceException convergenceException43 = new org.apache.commons.math.ConvergenceException("org.apache.commons.math.FunctionEvaluationException: Evaluation failed for argument = 0", (java.lang.Object[]) throwableArray42);
        org.apache.commons.math.MaxIterationsExceededException maxIterationsExceededException44 = new org.apache.commons.math.MaxIterationsExceededException((int) (byte) 100, "org.apache.commons.math.ConvergenceException: org.apache.commons.math.ode.DerivativeException: org.apache.commons.math.ConvergenceException: hi!", (java.lang.Object[]) throwableArray42);
        java.lang.Throwable[] throwableArray45 = maxIterationsExceededException44.getSuppressed();
        org.junit.Assert.assertNotNull(objArray8);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray8), "[-1.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray8), "[-1.0]");
        org.junit.Assert.assertNotNull(objArray15);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray15), "[-1.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray15), "[-1.0]");
        org.junit.Assert.assertNotNull(objArray20);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray20), "[-1.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray20), "[-1.0]");
        org.junit.Assert.assertNotNull(objArray28);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray28), "[-1.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray28), "[-1.0]");
        org.junit.Assert.assertNotNull(objArray34);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray34), "[-1.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray34), "[-1.0]");
        org.junit.Assert.assertNotNull(objArray39);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray39), "[-1.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray39), "[-1.0]");
        org.junit.Assert.assertNotNull(throwableArray42);
        org.junit.Assert.assertNotNull(throwableArray45);
    }

    @Test
    public void test14005() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest28.test14005");
        org.apache.commons.math.ConvergenceException convergenceException8 = new org.apache.commons.math.ConvergenceException();
        java.lang.Object[] objArray14 = new java.lang.Object[] { (-1.0d) };
        java.lang.Throwable throwable15 = null;
        org.apache.commons.math.MathException mathException16 = new org.apache.commons.math.MathException("hi!", objArray14, throwable15);
        org.apache.commons.math.MathException mathException17 = new org.apache.commons.math.MathException("", objArray14);
        org.apache.commons.math.MathException mathException18 = new org.apache.commons.math.MathException("", (java.lang.Throwable) mathException17);
        org.apache.commons.math.MathException mathException19 = new org.apache.commons.math.MathException((java.lang.Throwable) mathException17);
        org.apache.commons.math.ConvergenceException convergenceException20 = new org.apache.commons.math.ConvergenceException("org.apache.commons.math.FunctionEvaluationException: org.apache.commons.math.ConvergenceException: hi!", (java.lang.Throwable) mathException17);
        org.apache.commons.math.MaxIterationsExceededException maxIterationsExceededException22 = new org.apache.commons.math.MaxIterationsExceededException(0);
        java.lang.Object[] objArray23 = maxIterationsExceededException22.getArguments();
        java.lang.Object[] objArray32 = new java.lang.Object[] { (-1.0d) };
        java.lang.Throwable throwable33 = null;
        org.apache.commons.math.MathException mathException34 = new org.apache.commons.math.MathException("hi!", objArray32, throwable33);
        org.apache.commons.math.MathException mathException35 = new org.apache.commons.math.MathException("", objArray32);
        java.lang.Object[] objArray38 = new java.lang.Object[] { (-1.0d) };
        java.lang.Throwable throwable39 = null;
        org.apache.commons.math.MathException mathException40 = new org.apache.commons.math.MathException("hi!", objArray38, throwable39);
        java.lang.Object[] objArray41 = mathException40.getArguments();
        java.lang.Object[] objArray43 = new java.lang.Object[] { mathException35, objArray41, 10.0f };
        org.apache.commons.math.MathException mathException44 = new org.apache.commons.math.MathException("hi!", objArray41);
        org.apache.commons.math.MaxIterationsExceededException maxIterationsExceededException45 = new org.apache.commons.math.MaxIterationsExceededException((int) (short) 1, "hi!", objArray41);
        java.lang.Object[] objArray52 = new java.lang.Object[] { (-1.0d) };
        java.lang.Throwable throwable53 = null;
        org.apache.commons.math.MathException mathException54 = new org.apache.commons.math.MathException("hi!", objArray52, throwable53);
        java.lang.Object[] objArray58 = new java.lang.Object[] { (-1.0d) };
        java.lang.Throwable throwable59 = null;
        org.apache.commons.math.MathException mathException60 = new org.apache.commons.math.MathException("hi!", objArray58, throwable59);
        org.apache.commons.math.FunctionEvaluationException functionEvaluationException61 = new org.apache.commons.math.FunctionEvaluationException((double) 100.0f, throwable59);
        org.apache.commons.math.FunctionEvaluationException functionEvaluationException62 = new org.apache.commons.math.FunctionEvaluationException((double) 1.0f, "", objArray52, throwable59);
        java.lang.Object[] objArray63 = functionEvaluationException62.getArguments();
        org.apache.commons.math.MathException mathException64 = new org.apache.commons.math.MathException("hi!", (java.lang.Throwable) functionEvaluationException62);
        org.apache.commons.math.MathException mathException65 = new org.apache.commons.math.MathException("hi!", (java.lang.Throwable) functionEvaluationException62);
        java.lang.String str66 = mathException65.getPattern();
        org.apache.commons.math.ode.DerivativeException derivativeException67 = new org.apache.commons.math.ode.DerivativeException((java.lang.Throwable) mathException65);
        org.apache.commons.math.FunctionEvaluationException functionEvaluationException68 = new org.apache.commons.math.FunctionEvaluationException((double) 1.0f, "org.apache.commons.math.ConvergenceException: hi!", objArray41, (java.lang.Throwable) derivativeException67);
        java.lang.Object[] objArray69 = new java.lang.Object[] { convergenceException8, "org.apache.commons.math.FunctionEvaluationException: org.apache.commons.math.ConvergenceException: hi!", objArray23, functionEvaluationException68 };
        org.apache.commons.math.FunctionEvaluationException functionEvaluationException70 = new org.apache.commons.math.FunctionEvaluationException((double) (byte) -1, "org.apache.commons.math.ConvergenceException: hi!", objArray23);
        org.apache.commons.math.MathException mathException71 = new org.apache.commons.math.MathException();
        org.apache.commons.math.ConvergenceException convergenceException72 = new org.apache.commons.math.ConvergenceException();
        mathException71.addSuppressed((java.lang.Throwable) convergenceException72);
        org.apache.commons.math.MathException mathException74 = new org.apache.commons.math.MathException("org.apache.commons.math.ConvergenceException: Convergence failed", objArray23, (java.lang.Throwable) convergenceException72);
        org.apache.commons.math.MathException mathException75 = new org.apache.commons.math.MathException("org.apache.commons.math.ConvergenceException: Convergence failed", objArray23);
        java.lang.Object[] objArray80 = new java.lang.Object[] { (-1.0d) };
        java.lang.Throwable throwable81 = null;
        org.apache.commons.math.MathException mathException82 = new org.apache.commons.math.MathException("hi!", objArray80, throwable81);
        org.apache.commons.math.MathException mathException83 = new org.apache.commons.math.MathException("", objArray80);
        java.lang.Object[] objArray86 = new java.lang.Object[] { (-1.0d) };
        java.lang.Throwable throwable87 = null;
        org.apache.commons.math.MathException mathException88 = new org.apache.commons.math.MathException("hi!", objArray86, throwable87);
        java.lang.Object[] objArray89 = mathException88.getArguments();
        java.lang.Object[] objArray91 = new java.lang.Object[] { mathException83, objArray89, 10.0f };
        org.apache.commons.math.MathException mathException92 = new org.apache.commons.math.MathException("hi!", objArray89);
        org.apache.commons.math.MathException mathException93 = new org.apache.commons.math.MathException((java.lang.Throwable) mathException92);
        org.apache.commons.math.MathException mathException94 = new org.apache.commons.math.MathException("org.apache.commons.math.MathException: org.apache.commons.math.ode.DerivativeException: org.apache.commons.math.FunctionEvaluationException: org.apache.commons.math.ConvergenceException: hi!", objArray23, (java.lang.Throwable) mathException92);
        org.apache.commons.math.FunctionEvaluationException functionEvaluationException95 = new org.apache.commons.math.FunctionEvaluationException((double) (byte) 0, "org.apache.commons.math.ConvergenceException: org.apache.commons.math.FunctionEvaluationException: Maximal number of iterations ({0}) exceeded", objArray23);
        java.lang.Throwable[] throwableArray96 = functionEvaluationException95.getSuppressed();
        java.lang.Throwable[] throwableArray97 = functionEvaluationException95.getSuppressed();
        org.apache.commons.math.ConvergenceException convergenceException98 = new org.apache.commons.math.ConvergenceException("org.apache.commons.math.MaxIterationsExceededException: org.apache.commons.math.FunctionEvaluationException: org.apache.commons.math.MathException: org.apache.commons.math.ode.DerivativeException: org.apache.commons.math.FunctionEvaluationException: org.apache.commons.math.ConvergenceException: hi!", (java.lang.Object[]) throwableArray97);
        org.junit.Assert.assertNotNull(objArray14);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray14), "[-1.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray14), "[-1.0]");
        org.junit.Assert.assertNotNull(objArray23);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray23), "[0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray23), "[0]");
        org.junit.Assert.assertNotNull(objArray32);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray32), "[-1.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray32), "[-1.0]");
        org.junit.Assert.assertNotNull(objArray38);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray38), "[-1.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray38), "[-1.0]");
        org.junit.Assert.assertNotNull(objArray41);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray41), "[-1.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray41), "[-1.0]");
        org.junit.Assert.assertNotNull(objArray43);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray43), "[org.apache.commons.math.MathException: , [-1.0], 10.0]");
        org.junit.Assert.assertNotNull(objArray52);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray52), "[-1.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray52), "[-1.0]");
        org.junit.Assert.assertNotNull(objArray58);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray58), "[-1.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray58), "[-1.0]");
        org.junit.Assert.assertNotNull(objArray63);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray63), "[-1.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray63), "[-1.0]");
        org.junit.Assert.assertEquals("'" + str66 + "' != '" + "hi!" + "'", str66, "hi!");
        org.junit.Assert.assertNotNull(objArray69);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray69), "[org.apache.commons.math.ConvergenceException: Convergence failed, org.apache.commons.math.FunctionEvaluationException: org.apache.commons.math.ConvergenceException: hi!, [0], org.apache.commons.math.FunctionEvaluationException: org.apache.commons.math.ConvergenceException: hi!]");
        org.junit.Assert.assertNotNull(objArray80);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray80), "[-1.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray80), "[-1.0]");
        org.junit.Assert.assertNotNull(objArray86);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray86), "[-1.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray86), "[-1.0]");
        org.junit.Assert.assertNotNull(objArray89);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray89), "[-1.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray89), "[-1.0]");
        org.junit.Assert.assertNotNull(objArray91);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray91), "[org.apache.commons.math.MathException: , [-1.0], 10.0]");
        org.junit.Assert.assertNotNull(throwableArray96);
        org.junit.Assert.assertNotNull(throwableArray97);
    }

    @Test
    public void test14006() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest28.test14006");
        java.lang.Object[] objArray14 = new java.lang.Object[] { (-1.0d) };
        java.lang.Throwable throwable15 = null;
        org.apache.commons.math.MathException mathException16 = new org.apache.commons.math.MathException("hi!", objArray14, throwable15);
        org.apache.commons.math.MathException mathException17 = new org.apache.commons.math.MathException("", objArray14);
        java.lang.Object[] objArray20 = new java.lang.Object[] { (-1.0d) };
        java.lang.Throwable throwable21 = null;
        org.apache.commons.math.MathException mathException22 = new org.apache.commons.math.MathException("hi!", objArray20, throwable21);
        java.lang.Object[] objArray23 = mathException22.getArguments();
        java.lang.Object[] objArray25 = new java.lang.Object[] { mathException17, objArray23, 10.0f };
        org.apache.commons.math.MathException mathException26 = new org.apache.commons.math.MathException("hi!", objArray23);
        org.apache.commons.math.MaxIterationsExceededException maxIterationsExceededException27 = new org.apache.commons.math.MaxIterationsExceededException((int) (short) 1, "hi!", objArray23);
        java.lang.Object[] objArray34 = new java.lang.Object[] { (-1.0d) };
        java.lang.Throwable throwable35 = null;
        org.apache.commons.math.MathException mathException36 = new org.apache.commons.math.MathException("hi!", objArray34, throwable35);
        java.lang.Object[] objArray40 = new java.lang.Object[] { (-1.0d) };
        java.lang.Throwable throwable41 = null;
        org.apache.commons.math.MathException mathException42 = new org.apache.commons.math.MathException("hi!", objArray40, throwable41);
        org.apache.commons.math.FunctionEvaluationException functionEvaluationException43 = new org.apache.commons.math.FunctionEvaluationException((double) 100.0f, throwable41);
        org.apache.commons.math.FunctionEvaluationException functionEvaluationException44 = new org.apache.commons.math.FunctionEvaluationException((double) 1.0f, "", objArray34, throwable41);
        java.lang.Object[] objArray45 = functionEvaluationException44.getArguments();
        org.apache.commons.math.MathException mathException46 = new org.apache.commons.math.MathException("hi!", (java.lang.Throwable) functionEvaluationException44);
        org.apache.commons.math.MathException mathException47 = new org.apache.commons.math.MathException("hi!", (java.lang.Throwable) functionEvaluationException44);
        java.lang.String str48 = mathException47.getPattern();
        org.apache.commons.math.ode.DerivativeException derivativeException49 = new org.apache.commons.math.ode.DerivativeException((java.lang.Throwable) mathException47);
        org.apache.commons.math.FunctionEvaluationException functionEvaluationException50 = new org.apache.commons.math.FunctionEvaluationException((double) 1.0f, "org.apache.commons.math.ConvergenceException: hi!", objArray23, (java.lang.Throwable) derivativeException49);
        java.lang.Object[] objArray51 = derivativeException49.getArguments();
        org.apache.commons.math.ConvergenceException convergenceException52 = new org.apache.commons.math.ConvergenceException("org.apache.commons.math.FunctionEvaluationException: ", (java.lang.Throwable) derivativeException49);
        java.lang.String str53 = convergenceException52.getPattern();
        org.apache.commons.math.ConvergenceException convergenceException54 = new org.apache.commons.math.ConvergenceException((java.lang.Throwable) convergenceException52);
        java.lang.Throwable[] throwableArray55 = convergenceException52.getSuppressed();
        org.apache.commons.math.MathException mathException56 = new org.apache.commons.math.MathException("org.apache.commons.math.MathException: org.apache.commons.math.ode.DerivativeException: org.apache.commons.math.FunctionEvaluationException: org.apache.commons.math.ConvergenceException: hi!", (java.lang.Object[]) throwableArray55);
        java.lang.String[] strArray65 = new java.lang.String[] { "", "hi!", "hi!" };
        org.apache.commons.math.ode.DerivativeException derivativeException66 = new org.apache.commons.math.ode.DerivativeException("", strArray65);
        org.apache.commons.math.ode.DerivativeException derivativeException67 = new org.apache.commons.math.ode.DerivativeException("hi!", strArray65);
        java.lang.Throwable[] throwableArray68 = derivativeException67.getSuppressed();
        org.apache.commons.math.ConvergenceException convergenceException69 = new org.apache.commons.math.ConvergenceException("hi!", (java.lang.Object[]) throwableArray68);
        org.apache.commons.math.FunctionEvaluationException functionEvaluationException70 = new org.apache.commons.math.FunctionEvaluationException(97.0d, "org.apache.commons.math.MathException: org.apache.commons.math.MathException: hi!", (java.lang.Object[]) throwableArray68);
        org.apache.commons.math.ConvergenceException convergenceException71 = new org.apache.commons.math.ConvergenceException("org.apache.commons.math.ode.DerivativeException: hi!", (java.lang.Object[]) throwableArray55, (java.lang.Throwable) functionEvaluationException70);
        org.apache.commons.math.MaxIterationsExceededException maxIterationsExceededException72 = new org.apache.commons.math.MaxIterationsExceededException(10, "org.apache.commons.math.ConvergenceException: hi!", (java.lang.Object[]) throwableArray55);
        org.apache.commons.math.FunctionEvaluationException functionEvaluationException75 = new org.apache.commons.math.FunctionEvaluationException(0.0d, "org.apache.commons.math.FunctionEvaluationException: org.apache.commons.math.FunctionEvaluationException: Evaluation failed for argument = 100");
        org.apache.commons.math.ConvergenceException convergenceException76 = new org.apache.commons.math.ConvergenceException("org.apache.commons.math.MathException: org.apache.commons.math.MaxIterationsExceededException: Maximal number of iterations (0) exceeded", (java.lang.Object[]) throwableArray55, (java.lang.Throwable) functionEvaluationException75);
        java.lang.Class<?> wildcardClass77 = throwableArray55.getClass();
        org.junit.Assert.assertNotNull(objArray14);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray14), "[-1.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray14), "[-1.0]");
        org.junit.Assert.assertNotNull(objArray20);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray20), "[-1.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray20), "[-1.0]");
        org.junit.Assert.assertNotNull(objArray23);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray23), "[-1.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray23), "[-1.0]");
        org.junit.Assert.assertNotNull(objArray25);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray25), "[org.apache.commons.math.MathException: , [-1.0], 10.0]");
        org.junit.Assert.assertNotNull(objArray34);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray34), "[-1.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray34), "[-1.0]");
        org.junit.Assert.assertNotNull(objArray40);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray40), "[-1.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray40), "[-1.0]");
        org.junit.Assert.assertNotNull(objArray45);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray45), "[-1.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray45), "[-1.0]");
        org.junit.Assert.assertEquals("'" + str48 + "' != '" + "hi!" + "'", str48, "hi!");
        org.junit.Assert.assertNotNull(objArray51);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray51), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray51), "[]");
        org.junit.Assert.assertEquals("'" + str53 + "' != '" + "org.apache.commons.math.FunctionEvaluationException: " + "'", str53, "org.apache.commons.math.FunctionEvaluationException: ");
        org.junit.Assert.assertNotNull(throwableArray55);
        org.junit.Assert.assertNotNull(strArray65);
        org.junit.Assert.assertNotNull(throwableArray68);
        org.junit.Assert.assertNotNull(wildcardClass77);
    }

    @Test
    public void test14007() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest28.test14007");
        java.lang.Object[] objArray9 = new java.lang.Object[] { (-1.0d) };
        java.lang.Throwable throwable10 = null;
        org.apache.commons.math.MathException mathException11 = new org.apache.commons.math.MathException("hi!", objArray9, throwable10);
        org.apache.commons.math.MathException mathException12 = new org.apache.commons.math.MathException("", objArray9);
        java.lang.Throwable throwable13 = null;
        org.apache.commons.math.FunctionEvaluationException functionEvaluationException14 = new org.apache.commons.math.FunctionEvaluationException((double) 100L, "hi!", objArray9, throwable13);
        org.apache.commons.math.MathException mathException15 = new org.apache.commons.math.MathException("hi!", objArray9);
        java.lang.String[] strArray21 = new java.lang.String[] { "", "hi!", "hi!" };
        org.apache.commons.math.ode.DerivativeException derivativeException22 = new org.apache.commons.math.ode.DerivativeException("", strArray21);
        org.apache.commons.math.MathException mathException23 = new org.apache.commons.math.MathException("hi!", (java.lang.Throwable) derivativeException22);
        java.lang.Throwable[] throwableArray24 = derivativeException22.getSuppressed();
        org.apache.commons.math.MathException mathException25 = new org.apache.commons.math.MathException("org.apache.commons.math.FunctionEvaluationException: ", objArray9, (java.lang.Throwable) derivativeException22);
        org.apache.commons.math.MaxIterationsExceededException maxIterationsExceededException26 = new org.apache.commons.math.MaxIterationsExceededException((int) '#', "hi!", objArray9);
        java.lang.Object[] objArray27 = maxIterationsExceededException26.getArguments();
        org.junit.Assert.assertNotNull(objArray9);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray9), "[-1.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray9), "[-1.0]");
        org.junit.Assert.assertNotNull(strArray21);
        org.junit.Assert.assertNotNull(throwableArray24);
        org.junit.Assert.assertNotNull(objArray27);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray27), "[-1.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray27), "[-1.0]");
    }

    @Test
    public void test14008() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest28.test14008");
        org.apache.commons.math.ConvergenceException convergenceException1 = new org.apache.commons.math.ConvergenceException("org.apache.commons.math.FunctionEvaluationException: org.apache.commons.math.ode.DerivativeException: org.apache.commons.math.FunctionEvaluationException: org.apache.commons.math.ConvergenceException: hi!");
    }

    @Test
    public void test14009() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest28.test14009");
        java.lang.Object[] objArray12 = new java.lang.Object[] { (-1.0d) };
        java.lang.Throwable throwable13 = null;
        org.apache.commons.math.MathException mathException14 = new org.apache.commons.math.MathException("hi!", objArray12, throwable13);
        org.apache.commons.math.MathException mathException15 = new org.apache.commons.math.MathException("", objArray12);
        java.lang.Throwable throwable16 = null;
        org.apache.commons.math.FunctionEvaluationException functionEvaluationException17 = new org.apache.commons.math.FunctionEvaluationException((double) 100L, "hi!", objArray12, throwable16);
        org.apache.commons.math.MathException mathException18 = new org.apache.commons.math.MathException("org.apache.commons.math.ConvergenceException: hi!", objArray12);
        org.apache.commons.math.FunctionEvaluationException functionEvaluationException19 = new org.apache.commons.math.FunctionEvaluationException((double) 10L, "hi!", objArray12);
        org.apache.commons.math.FunctionEvaluationException functionEvaluationException20 = new org.apache.commons.math.FunctionEvaluationException((double) (byte) -1, (java.lang.Throwable) functionEvaluationException19);
        org.apache.commons.math.ConvergenceException convergenceException21 = new org.apache.commons.math.ConvergenceException((java.lang.Throwable) functionEvaluationException19);
        java.lang.Object[] objArray22 = functionEvaluationException19.getArguments();
        org.apache.commons.math.ConvergenceException convergenceException26 = new org.apache.commons.math.ConvergenceException("hi!");
        java.lang.Object[] objArray32 = new java.lang.Object[] { (-1.0d) };
        java.lang.Throwable throwable33 = null;
        org.apache.commons.math.MathException mathException34 = new org.apache.commons.math.MathException("hi!", objArray32, throwable33);
        java.lang.Object[] objArray38 = new java.lang.Object[] { (-1.0d) };
        java.lang.Throwable throwable39 = null;
        org.apache.commons.math.MathException mathException40 = new org.apache.commons.math.MathException("hi!", objArray38, throwable39);
        org.apache.commons.math.FunctionEvaluationException functionEvaluationException41 = new org.apache.commons.math.FunctionEvaluationException((double) 100.0f, throwable39);
        org.apache.commons.math.FunctionEvaluationException functionEvaluationException42 = new org.apache.commons.math.FunctionEvaluationException((double) 1.0f, "", objArray32, throwable39);
        java.lang.Object[] objArray43 = functionEvaluationException42.getArguments();
        org.apache.commons.math.MathException mathException44 = new org.apache.commons.math.MathException("hi!", (java.lang.Throwable) functionEvaluationException42);
        java.lang.Object[] objArray51 = new java.lang.Object[] { (-1.0d) };
        java.lang.Throwable throwable52 = null;
        org.apache.commons.math.MathException mathException53 = new org.apache.commons.math.MathException("hi!", objArray51, throwable52);
        java.lang.Object[] objArray57 = new java.lang.Object[] { (-1.0d) };
        java.lang.Throwable throwable58 = null;
        org.apache.commons.math.MathException mathException59 = new org.apache.commons.math.MathException("hi!", objArray57, throwable58);
        org.apache.commons.math.FunctionEvaluationException functionEvaluationException60 = new org.apache.commons.math.FunctionEvaluationException((double) 100.0f, throwable58);
        org.apache.commons.math.FunctionEvaluationException functionEvaluationException61 = new org.apache.commons.math.FunctionEvaluationException((double) 1.0f, "", objArray51, throwable58);
        org.apache.commons.math.ConvergenceException convergenceException62 = new org.apache.commons.math.ConvergenceException("", (java.lang.Throwable) functionEvaluationException61);
        org.apache.commons.math.FunctionEvaluationException functionEvaluationException63 = new org.apache.commons.math.FunctionEvaluationException((-1.0d), (java.lang.Throwable) functionEvaluationException61);
        functionEvaluationException42.addSuppressed((java.lang.Throwable) functionEvaluationException61);
        org.apache.commons.math.MathException mathException65 = new org.apache.commons.math.MathException((java.lang.Throwable) functionEvaluationException42);
        org.apache.commons.math.ConvergenceException convergenceException66 = new org.apache.commons.math.ConvergenceException((java.lang.Throwable) functionEvaluationException42);
        convergenceException26.addSuppressed((java.lang.Throwable) convergenceException66);
        org.apache.commons.math.FunctionEvaluationException functionEvaluationException68 = new org.apache.commons.math.FunctionEvaluationException(0.0d, "org.apache.commons.math.FunctionEvaluationException: Evaluation failed for argument = 100", (java.lang.Throwable) convergenceException26);
        org.apache.commons.math.ConvergenceException convergenceException69 = new org.apache.commons.math.ConvergenceException("", objArray22, (java.lang.Throwable) convergenceException26);
        org.apache.commons.math.FunctionEvaluationException functionEvaluationException70 = new org.apache.commons.math.FunctionEvaluationException((double) (-1.0f), "org.apache.commons.math.FunctionEvaluationException: Maximal number of iterations (-1) exceeded", (java.lang.Throwable) convergenceException26);
        org.apache.commons.math.ConvergenceException convergenceException71 = new org.apache.commons.math.ConvergenceException((java.lang.Throwable) functionEvaluationException70);
        org.junit.Assert.assertNotNull(objArray12);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray12), "[-1.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray12), "[-1.0]");
        org.junit.Assert.assertNotNull(objArray22);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray22), "[-1.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray22), "[-1.0]");
        org.junit.Assert.assertNotNull(objArray32);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray32), "[-1.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray32), "[-1.0]");
        org.junit.Assert.assertNotNull(objArray38);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray38), "[-1.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray38), "[-1.0]");
        org.junit.Assert.assertNotNull(objArray43);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray43), "[-1.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray43), "[-1.0]");
        org.junit.Assert.assertNotNull(objArray51);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray51), "[-1.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray51), "[-1.0]");
        org.junit.Assert.assertNotNull(objArray57);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray57), "[-1.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray57), "[-1.0]");
    }

    @Test
    public void test14010() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest28.test14010");
        java.lang.Object[] objArray14 = new java.lang.Object[] { (-1.0d) };
        java.lang.Throwable throwable15 = null;
        org.apache.commons.math.MathException mathException16 = new org.apache.commons.math.MathException("hi!", objArray14, throwable15);
        org.apache.commons.math.MathException mathException17 = new org.apache.commons.math.MathException("", objArray14);
        java.lang.Object[] objArray20 = new java.lang.Object[] { (-1.0d) };
        java.lang.Throwable throwable21 = null;
        org.apache.commons.math.MathException mathException22 = new org.apache.commons.math.MathException("hi!", objArray20, throwable21);
        java.lang.Object[] objArray23 = mathException22.getArguments();
        java.lang.Object[] objArray25 = new java.lang.Object[] { mathException17, objArray23, 10.0f };
        org.apache.commons.math.MathException mathException26 = new org.apache.commons.math.MathException("hi!", objArray23);
        org.apache.commons.math.ode.DerivativeException derivativeException27 = new org.apache.commons.math.ode.DerivativeException((java.lang.Throwable) mathException26);
        org.apache.commons.math.ConvergenceException convergenceException28 = new org.apache.commons.math.ConvergenceException("org.apache.commons.math.ConvergenceException: ", (java.lang.Throwable) derivativeException27);
        org.apache.commons.math.FunctionEvaluationException functionEvaluationException29 = new org.apache.commons.math.FunctionEvaluationException(0.0d, (java.lang.Throwable) convergenceException28);
        java.lang.String str30 = convergenceException28.getPattern();
        java.lang.Throwable[] throwableArray31 = convergenceException28.getSuppressed();
        org.apache.commons.math.FunctionEvaluationException functionEvaluationException32 = new org.apache.commons.math.FunctionEvaluationException((double) (byte) 0, "org.apache.commons.math.FunctionEvaluationException: hi!", (java.lang.Object[]) throwableArray31);
        org.apache.commons.math.ConvergenceException convergenceException33 = new org.apache.commons.math.ConvergenceException("org.apache.commons.math.MathException: org.apache.commons.math.FunctionEvaluationException: org.apache.commons.math.MathException: ", (java.lang.Object[]) throwableArray31);
        org.apache.commons.math.ConvergenceException convergenceException34 = new org.apache.commons.math.ConvergenceException("org.apache.commons.math.ode.DerivativeException: ", (java.lang.Object[]) throwableArray31);
        org.apache.commons.math.FunctionEvaluationException functionEvaluationException35 = new org.apache.commons.math.FunctionEvaluationException((double) (-1.0f), "org.apache.commons.math.MaxIterationsExceededException: org.apache.commons.math.FunctionEvaluationException: org.apache.commons.math.ConvergenceException: Convergence failed", (java.lang.Object[]) throwableArray31);
        org.apache.commons.math.FunctionEvaluationException functionEvaluationException36 = new org.apache.commons.math.FunctionEvaluationException((double) (byte) 10, "org.apache.commons.math.ode.DerivativeException: org.apache.commons.math.MaxIterationsExceededException: Maximal number of iterations (0) exceeded", (java.lang.Object[]) throwableArray31);
        org.junit.Assert.assertNotNull(objArray14);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray14), "[-1.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray14), "[-1.0]");
        org.junit.Assert.assertNotNull(objArray20);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray20), "[-1.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray20), "[-1.0]");
        org.junit.Assert.assertNotNull(objArray23);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray23), "[-1.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray23), "[-1.0]");
        org.junit.Assert.assertNotNull(objArray25);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray25), "[org.apache.commons.math.MathException: , [-1.0], 10.0]");
        org.junit.Assert.assertEquals("'" + str30 + "' != '" + "org.apache.commons.math.ConvergenceException: " + "'", str30, "org.apache.commons.math.ConvergenceException: ");
        org.junit.Assert.assertNotNull(throwableArray31);
    }

    @Test
    public void test14011() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest28.test14011");
        java.lang.String[] strArray16 = new java.lang.String[] { "", "hi!", "hi!" };
        org.apache.commons.math.ode.DerivativeException derivativeException17 = new org.apache.commons.math.ode.DerivativeException("", strArray16);
        org.apache.commons.math.ode.DerivativeException derivativeException18 = new org.apache.commons.math.ode.DerivativeException("hi!", strArray16);
        org.apache.commons.math.ode.DerivativeException derivativeException19 = new org.apache.commons.math.ode.DerivativeException("org.apache.commons.math.ConvergenceException: hi!", strArray16);
        java.lang.Object[] objArray24 = new java.lang.Object[] { (-1.0d) };
        java.lang.Throwable throwable25 = null;
        org.apache.commons.math.MathException mathException26 = new org.apache.commons.math.MathException("hi!", objArray24, throwable25);
        org.apache.commons.math.MathException mathException27 = new org.apache.commons.math.MathException("", objArray24);
        java.lang.Object[] objArray30 = new java.lang.Object[] { (-1.0d) };
        java.lang.Throwable throwable31 = null;
        org.apache.commons.math.MathException mathException32 = new org.apache.commons.math.MathException("hi!", objArray30, throwable31);
        java.lang.Object[] objArray33 = mathException32.getArguments();
        java.lang.Object[] objArray35 = new java.lang.Object[] { mathException27, objArray33, 10.0f };
        org.apache.commons.math.MathException mathException36 = new org.apache.commons.math.MathException("hi!", objArray33);
        org.apache.commons.math.ode.DerivativeException derivativeException37 = new org.apache.commons.math.ode.DerivativeException((java.lang.Throwable) mathException36);
        org.apache.commons.math.ConvergenceException convergenceException38 = new org.apache.commons.math.ConvergenceException("org.apache.commons.math.ConvergenceException: hi!", (java.lang.Object[]) strArray16, (java.lang.Throwable) mathException36);
        org.apache.commons.math.ode.DerivativeException derivativeException39 = new org.apache.commons.math.ode.DerivativeException("org.apache.commons.math.ConvergenceException: ", strArray16);
        org.apache.commons.math.ode.DerivativeException derivativeException40 = new org.apache.commons.math.ode.DerivativeException("org.apache.commons.math.ConvergenceException: hi!", strArray16);
        org.apache.commons.math.ConvergenceException convergenceException41 = new org.apache.commons.math.ConvergenceException("org.apache.commons.math.ConvergenceException: Convergence failed", (java.lang.Object[]) strArray16);
        org.apache.commons.math.ode.DerivativeException derivativeException42 = new org.apache.commons.math.ode.DerivativeException("", strArray16);
        org.apache.commons.math.FunctionEvaluationException functionEvaluationException45 = new org.apache.commons.math.FunctionEvaluationException((double) 100, "");
        org.apache.commons.math.MathException mathException46 = new org.apache.commons.math.MathException("", (java.lang.Object[]) strArray16, (java.lang.Throwable) functionEvaluationException45);
        java.lang.String[] strArray59 = new java.lang.String[] { "", "hi!", "hi!" };
        org.apache.commons.math.ode.DerivativeException derivativeException60 = new org.apache.commons.math.ode.DerivativeException("", strArray59);
        org.apache.commons.math.ode.DerivativeException derivativeException61 = new org.apache.commons.math.ode.DerivativeException("hi!", strArray59);
        org.apache.commons.math.ode.DerivativeException derivativeException62 = new org.apache.commons.math.ode.DerivativeException("org.apache.commons.math.ConvergenceException: hi!", strArray59);
        java.lang.Object[] objArray67 = new java.lang.Object[] { (-1.0d) };
        java.lang.Throwable throwable68 = null;
        org.apache.commons.math.MathException mathException69 = new org.apache.commons.math.MathException("hi!", objArray67, throwable68);
        org.apache.commons.math.MathException mathException70 = new org.apache.commons.math.MathException("", objArray67);
        java.lang.Object[] objArray73 = new java.lang.Object[] { (-1.0d) };
        java.lang.Throwable throwable74 = null;
        org.apache.commons.math.MathException mathException75 = new org.apache.commons.math.MathException("hi!", objArray73, throwable74);
        java.lang.Object[] objArray76 = mathException75.getArguments();
        java.lang.Object[] objArray78 = new java.lang.Object[] { mathException70, objArray76, 10.0f };
        org.apache.commons.math.MathException mathException79 = new org.apache.commons.math.MathException("hi!", objArray76);
        org.apache.commons.math.ode.DerivativeException derivativeException80 = new org.apache.commons.math.ode.DerivativeException((java.lang.Throwable) mathException79);
        org.apache.commons.math.ConvergenceException convergenceException81 = new org.apache.commons.math.ConvergenceException("org.apache.commons.math.ConvergenceException: hi!", (java.lang.Object[]) strArray59, (java.lang.Throwable) mathException79);
        org.apache.commons.math.ode.DerivativeException derivativeException82 = new org.apache.commons.math.ode.DerivativeException("org.apache.commons.math.ConvergenceException: ", strArray59);
        org.apache.commons.math.ode.DerivativeException derivativeException83 = new org.apache.commons.math.ode.DerivativeException("org.apache.commons.math.ConvergenceException: hi!", strArray59);
        org.apache.commons.math.ode.DerivativeException derivativeException84 = new org.apache.commons.math.ode.DerivativeException("org.apache.commons.math.ConvergenceException: org.apache.commons.math.FunctionEvaluationException: ", strArray59);
        org.apache.commons.math.ode.DerivativeException derivativeException85 = new org.apache.commons.math.ode.DerivativeException("org.apache.commons.math.FunctionEvaluationException: org.apache.commons.math.FunctionEvaluationException: org.apache.commons.math.ConvergenceException: hi!", strArray59);
        org.apache.commons.math.ode.DerivativeException derivativeException86 = new org.apache.commons.math.ode.DerivativeException("org.apache.commons.math.FunctionEvaluationException: ", strArray59);
        org.apache.commons.math.ConvergenceException convergenceException87 = new org.apache.commons.math.ConvergenceException("org.apache.commons.math.ConvergenceException: Maximal number of iterations (97) exceeded", (java.lang.Object[]) strArray16, (java.lang.Throwable) derivativeException86);
        org.apache.commons.math.MathException mathException88 = new org.apache.commons.math.MathException("org.apache.commons.math.FunctionEvaluationException: org.apache.commons.math.MathException: org.apache.commons.math.ode.DerivativeException: org.apache.commons.math.MaxIterationsExceededException: Maximal number of iterations (0) exceeded", (java.lang.Object[]) strArray16);
        org.apache.commons.math.ode.DerivativeException derivativeException89 = new org.apache.commons.math.ode.DerivativeException("org.apache.commons.math.FunctionEvaluationException: Maximal number of iterations (1) exceeded", strArray16);
        org.apache.commons.math.ode.DerivativeException derivativeException90 = new org.apache.commons.math.ode.DerivativeException("org.apache.commons.math.FunctionEvaluationException: Evaluation failed for argument = -1", strArray16);
        org.junit.Assert.assertNotNull(strArray16);
        org.junit.Assert.assertNotNull(objArray24);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray24), "[-1.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray24), "[-1.0]");
        org.junit.Assert.assertNotNull(objArray30);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray30), "[-1.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray30), "[-1.0]");
        org.junit.Assert.assertNotNull(objArray33);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray33), "[-1.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray33), "[-1.0]");
        org.junit.Assert.assertNotNull(objArray35);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray35), "[org.apache.commons.math.MathException: , [-1.0], 10.0]");
        org.junit.Assert.assertNotNull(strArray59);
        org.junit.Assert.assertNotNull(objArray67);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray67), "[-1.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray67), "[-1.0]");
        org.junit.Assert.assertNotNull(objArray73);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray73), "[-1.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray73), "[-1.0]");
        org.junit.Assert.assertNotNull(objArray76);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray76), "[-1.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray76), "[-1.0]");
        org.junit.Assert.assertNotNull(objArray78);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray78), "[org.apache.commons.math.MathException: , [-1.0], 10.0]");
    }

    @Test
    public void test14012() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest28.test14012");
        org.apache.commons.math.FunctionEvaluationException functionEvaluationException2 = new org.apache.commons.math.FunctionEvaluationException(0.0d, "Evaluation failed for argument = {0}");
        java.lang.String str3 = functionEvaluationException2.toString();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "org.apache.commons.math.FunctionEvaluationException: Evaluation failed for argument = {0}" + "'", str3, "org.apache.commons.math.FunctionEvaluationException: Evaluation failed for argument = {0}");
    }

    @Test
    public void test14013() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest28.test14013");
        java.lang.Object[] objArray17 = new java.lang.Object[] { (-1.0d) };
        java.lang.Throwable throwable18 = null;
        org.apache.commons.math.MathException mathException19 = new org.apache.commons.math.MathException("hi!", objArray17, throwable18);
        org.apache.commons.math.MathException mathException20 = new org.apache.commons.math.MathException("", objArray17);
        java.lang.Throwable throwable21 = null;
        org.apache.commons.math.FunctionEvaluationException functionEvaluationException22 = new org.apache.commons.math.FunctionEvaluationException((double) 100L, "hi!", objArray17, throwable21);
        org.apache.commons.math.FunctionEvaluationException functionEvaluationException23 = new org.apache.commons.math.FunctionEvaluationException((double) 100, "hi!", objArray17);
        org.apache.commons.math.MathException mathException24 = new org.apache.commons.math.MathException("org.apache.commons.math.FunctionEvaluationException: org.apache.commons.math.ode.DerivativeException: ", objArray17);
        org.apache.commons.math.MaxIterationsExceededException maxIterationsExceededException25 = new org.apache.commons.math.MaxIterationsExceededException((int) (byte) 10, "org.apache.commons.math.MathException: org.apache.commons.math.ConvergenceException: hi!", objArray17);
        org.apache.commons.math.MathException mathException26 = new org.apache.commons.math.MathException("org.apache.commons.math.MathException: org.apache.commons.math.ConvergenceException: org.apache.commons.math.FunctionEvaluationException: ", objArray17);
        java.lang.Throwable throwable27 = null;
        org.apache.commons.math.ConvergenceException convergenceException28 = new org.apache.commons.math.ConvergenceException(throwable27);
        org.apache.commons.math.MathException mathException29 = new org.apache.commons.math.MathException("org.apache.commons.math.FunctionEvaluationException: org.apache.commons.math.ode.DerivativeException: ", objArray17, (java.lang.Throwable) convergenceException28);
        java.lang.Object[] objArray37 = new java.lang.Object[] { (-1.0d) };
        java.lang.Throwable throwable38 = null;
        org.apache.commons.math.MathException mathException39 = new org.apache.commons.math.MathException("hi!", objArray37, throwable38);
        org.apache.commons.math.MathException mathException40 = new org.apache.commons.math.MathException("", objArray37);
        java.lang.Object[] objArray43 = new java.lang.Object[] { (-1.0d) };
        java.lang.Throwable throwable44 = null;
        org.apache.commons.math.MathException mathException45 = new org.apache.commons.math.MathException("hi!", objArray43, throwable44);
        java.lang.Object[] objArray46 = mathException45.getArguments();
        java.lang.Object[] objArray48 = new java.lang.Object[] { mathException40, objArray46, 10.0f };
        org.apache.commons.math.MathException mathException49 = new org.apache.commons.math.MathException("hi!", objArray46);
        org.apache.commons.math.ode.DerivativeException derivativeException50 = new org.apache.commons.math.ode.DerivativeException((java.lang.Throwable) mathException49);
        org.apache.commons.math.ConvergenceException convergenceException51 = new org.apache.commons.math.ConvergenceException("hi!", (java.lang.Throwable) derivativeException50);
        java.lang.Throwable[] throwableArray52 = derivativeException50.getSuppressed();
        org.apache.commons.math.ConvergenceException convergenceException53 = new org.apache.commons.math.ConvergenceException("org.apache.commons.math.ConvergenceException: org.apache.commons.math.ConvergenceException: ", (java.lang.Object[]) throwableArray52);
        java.lang.Object[] objArray62 = new java.lang.Object[] { (-1.0d) };
        java.lang.Throwable throwable63 = null;
        org.apache.commons.math.MathException mathException64 = new org.apache.commons.math.MathException("hi!", objArray62, throwable63);
        org.apache.commons.math.MathException mathException65 = new org.apache.commons.math.MathException("", objArray62);
        java.lang.Throwable throwable66 = null;
        org.apache.commons.math.FunctionEvaluationException functionEvaluationException67 = new org.apache.commons.math.FunctionEvaluationException((double) 100L, "hi!", objArray62, throwable66);
        org.apache.commons.math.MathException mathException68 = new org.apache.commons.math.MathException("org.apache.commons.math.ConvergenceException: hi!", objArray62);
        org.apache.commons.math.MaxIterationsExceededException maxIterationsExceededException69 = new org.apache.commons.math.MaxIterationsExceededException(2, "org.apache.commons.math.ConvergenceException: hi!", objArray62);
        org.apache.commons.math.ode.DerivativeException derivativeException70 = new org.apache.commons.math.ode.DerivativeException((java.lang.Throwable) maxIterationsExceededException69);
        java.lang.String str71 = maxIterationsExceededException69.getPattern();
        int int72 = maxIterationsExceededException69.getMaxIterations();
        org.apache.commons.math.MathException mathException73 = new org.apache.commons.math.MathException("Evaluation failed for argument = 100", (java.lang.Object[]) throwableArray52, (java.lang.Throwable) maxIterationsExceededException69);
        org.apache.commons.math.MathException mathException74 = new org.apache.commons.math.MathException("org.apache.commons.math.ode.DerivativeException: org.apache.commons.math.MathException: hi!", objArray17, (java.lang.Throwable) maxIterationsExceededException69);
        org.apache.commons.math.MaxIterationsExceededException maxIterationsExceededException75 = new org.apache.commons.math.MaxIterationsExceededException((int) (short) 100, "Maximal number of iterations (0) exceeded", objArray17);
        org.apache.commons.math.MaxIterationsExceededException maxIterationsExceededException76 = new org.apache.commons.math.MaxIterationsExceededException((int) '#', "org.apache.commons.math.MathException: org.apache.commons.math.FunctionEvaluationException: org.apache.commons.math.FunctionEvaluationException: org.apache.commons.math.ConvergenceException: hi!", objArray17);
        java.lang.String str77 = maxIterationsExceededException76.getPattern();
        int int78 = maxIterationsExceededException76.getMaxIterations();
        org.junit.Assert.assertNotNull(objArray17);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray17), "[-1.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray17), "[-1.0]");
        org.junit.Assert.assertNotNull(objArray37);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray37), "[-1.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray37), "[-1.0]");
        org.junit.Assert.assertNotNull(objArray43);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray43), "[-1.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray43), "[-1.0]");
        org.junit.Assert.assertNotNull(objArray46);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray46), "[-1.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray46), "[-1.0]");
        org.junit.Assert.assertNotNull(objArray48);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray48), "[org.apache.commons.math.MathException: , [-1.0], 10.0]");
        org.junit.Assert.assertNotNull(throwableArray52);
        org.junit.Assert.assertNotNull(objArray62);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray62), "[-1.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray62), "[-1.0]");
        org.junit.Assert.assertEquals("'" + str71 + "' != '" + "org.apache.commons.math.ConvergenceException: hi!" + "'", str71, "org.apache.commons.math.ConvergenceException: hi!");
        org.junit.Assert.assertTrue("'" + int72 + "' != '" + 2 + "'", int72 == 2);
        org.junit.Assert.assertEquals("'" + str77 + "' != '" + "org.apache.commons.math.MathException: org.apache.commons.math.FunctionEvaluationException: org.apache.commons.math.FunctionEvaluationException: org.apache.commons.math.ConvergenceException: hi!" + "'", str77, "org.apache.commons.math.MathException: org.apache.commons.math.FunctionEvaluationException: org.apache.commons.math.FunctionEvaluationException: org.apache.commons.math.ConvergenceException: hi!");
        org.junit.Assert.assertTrue("'" + int78 + "' != '" + 35 + "'", int78 == 35);
    }

    @Test
    public void test14014() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest28.test14014");
        java.lang.String[] strArray14 = new java.lang.String[] { "", "hi!", "hi!" };
        org.apache.commons.math.ode.DerivativeException derivativeException15 = new org.apache.commons.math.ode.DerivativeException("", strArray14);
        org.apache.commons.math.ode.DerivativeException derivativeException16 = new org.apache.commons.math.ode.DerivativeException("hi!", strArray14);
        org.apache.commons.math.ode.DerivativeException derivativeException17 = new org.apache.commons.math.ode.DerivativeException("org.apache.commons.math.ConvergenceException: hi!", strArray14);
        java.lang.Object[] objArray22 = new java.lang.Object[] { (-1.0d) };
        java.lang.Throwable throwable23 = null;
        org.apache.commons.math.MathException mathException24 = new org.apache.commons.math.MathException("hi!", objArray22, throwable23);
        org.apache.commons.math.MathException mathException25 = new org.apache.commons.math.MathException("", objArray22);
        java.lang.Object[] objArray28 = new java.lang.Object[] { (-1.0d) };
        java.lang.Throwable throwable29 = null;
        org.apache.commons.math.MathException mathException30 = new org.apache.commons.math.MathException("hi!", objArray28, throwable29);
        java.lang.Object[] objArray31 = mathException30.getArguments();
        java.lang.Object[] objArray33 = new java.lang.Object[] { mathException25, objArray31, 10.0f };
        org.apache.commons.math.MathException mathException34 = new org.apache.commons.math.MathException("hi!", objArray31);
        org.apache.commons.math.ode.DerivativeException derivativeException35 = new org.apache.commons.math.ode.DerivativeException((java.lang.Throwable) mathException34);
        org.apache.commons.math.ConvergenceException convergenceException36 = new org.apache.commons.math.ConvergenceException("org.apache.commons.math.ConvergenceException: hi!", (java.lang.Object[]) strArray14, (java.lang.Throwable) mathException34);
        org.apache.commons.math.ode.DerivativeException derivativeException37 = new org.apache.commons.math.ode.DerivativeException("org.apache.commons.math.MathException: ", strArray14);
        org.apache.commons.math.ode.DerivativeException derivativeException38 = new org.apache.commons.math.ode.DerivativeException("org.apache.commons.math.FunctionEvaluationException: ", strArray14);
        org.apache.commons.math.MathException mathException39 = new org.apache.commons.math.MathException("Evaluation failed for argument = 100", (java.lang.Object[]) strArray14);
        org.apache.commons.math.ConvergenceException convergenceException40 = new org.apache.commons.math.ConvergenceException("org.apache.commons.math.ode.DerivativeException: org.apache.commons.math.ConvergenceException: hi!", (java.lang.Object[]) strArray14);
        org.apache.commons.math.ode.DerivativeException derivativeException41 = new org.apache.commons.math.ode.DerivativeException("org.apache.commons.math.FunctionEvaluationException: org.apache.commons.math.ConvergenceException: org.apache.commons.math.ode.DerivativeException: hi!", strArray14);
        org.apache.commons.math.MaxIterationsExceededException maxIterationsExceededException42 = new org.apache.commons.math.MaxIterationsExceededException(52, "org.apache.commons.math.MathException: org.apache.commons.math.FunctionEvaluationException: org.apache.commons.math.MathException: org.apache.commons.math.ConvergenceException: ", (java.lang.Object[]) strArray14);
        org.junit.Assert.assertNotNull(strArray14);
        org.junit.Assert.assertNotNull(objArray22);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray22), "[-1.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray22), "[-1.0]");
        org.junit.Assert.assertNotNull(objArray28);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray28), "[-1.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray28), "[-1.0]");
        org.junit.Assert.assertNotNull(objArray31);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray31), "[-1.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray31), "[-1.0]");
        org.junit.Assert.assertNotNull(objArray33);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray33), "[org.apache.commons.math.MathException: , [-1.0], 10.0]");
    }

    @Test
    public void test14015() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest28.test14015");
        java.lang.Object[] objArray10 = new java.lang.Object[] { (-1.0d) };
        java.lang.Throwable throwable11 = null;
        org.apache.commons.math.MathException mathException12 = new org.apache.commons.math.MathException("hi!", objArray10, throwable11);
        org.apache.commons.math.ConvergenceException convergenceException13 = new org.apache.commons.math.ConvergenceException("hi!", objArray10);
        org.apache.commons.math.FunctionEvaluationException functionEvaluationException14 = new org.apache.commons.math.FunctionEvaluationException((double) 1, "", objArray10);
        org.apache.commons.math.MathException mathException15 = new org.apache.commons.math.MathException("org.apache.commons.math.ConvergenceException: hi!", objArray10);
        java.lang.Object[] objArray21 = new java.lang.Object[] { (-1.0d) };
        java.lang.Throwable throwable22 = null;
        org.apache.commons.math.MathException mathException23 = new org.apache.commons.math.MathException("hi!", objArray21, throwable22);
        org.apache.commons.math.MathException mathException24 = new org.apache.commons.math.MathException("", objArray21);
        java.lang.Object[] objArray27 = new java.lang.Object[] { (-1.0d) };
        java.lang.Throwable throwable28 = null;
        org.apache.commons.math.MathException mathException29 = new org.apache.commons.math.MathException("hi!", objArray27, throwable28);
        java.lang.Object[] objArray30 = mathException29.getArguments();
        java.lang.Object[] objArray32 = new java.lang.Object[] { mathException24, objArray30, 10.0f };
        org.apache.commons.math.MathException mathException33 = new org.apache.commons.math.MathException("hi!", objArray30);
        org.apache.commons.math.ode.DerivativeException derivativeException34 = new org.apache.commons.math.ode.DerivativeException((java.lang.Throwable) mathException33);
        org.apache.commons.math.ConvergenceException convergenceException35 = new org.apache.commons.math.ConvergenceException("hi!", (java.lang.Throwable) derivativeException34);
        org.apache.commons.math.FunctionEvaluationException functionEvaluationException36 = new org.apache.commons.math.FunctionEvaluationException((double) (short) 100, "org.apache.commons.math.ConvergenceException: hi!", objArray10, (java.lang.Throwable) convergenceException35);
        org.apache.commons.math.MathException mathException37 = new org.apache.commons.math.MathException("org.apache.commons.math.ConvergenceException: hi!", objArray10);
        java.lang.Object[] objArray50 = new java.lang.Object[] { (-1.0d) };
        java.lang.Throwable throwable51 = null;
        org.apache.commons.math.MathException mathException52 = new org.apache.commons.math.MathException("hi!", objArray50, throwable51);
        org.apache.commons.math.MathException mathException53 = new org.apache.commons.math.MathException("", objArray50);
        java.lang.Throwable throwable54 = null;
        org.apache.commons.math.FunctionEvaluationException functionEvaluationException55 = new org.apache.commons.math.FunctionEvaluationException((double) 100L, "hi!", objArray50, throwable54);
        org.apache.commons.math.MathException mathException56 = new org.apache.commons.math.MathException("org.apache.commons.math.ConvergenceException: hi!", objArray50);
        org.apache.commons.math.MaxIterationsExceededException maxIterationsExceededException57 = new org.apache.commons.math.MaxIterationsExceededException(2, "org.apache.commons.math.ConvergenceException: hi!", objArray50);
        java.lang.Object[] objArray66 = new java.lang.Object[] { (-1.0d) };
        java.lang.Throwable throwable67 = null;
        org.apache.commons.math.MathException mathException68 = new org.apache.commons.math.MathException("hi!", objArray66, throwable67);
        org.apache.commons.math.MathException mathException69 = new org.apache.commons.math.MathException("", objArray66);
        java.lang.Object[] objArray72 = new java.lang.Object[] { (-1.0d) };
        java.lang.Throwable throwable73 = null;
        org.apache.commons.math.MathException mathException74 = new org.apache.commons.math.MathException("hi!", objArray72, throwable73);
        java.lang.Object[] objArray75 = mathException74.getArguments();
        java.lang.Object[] objArray77 = new java.lang.Object[] { mathException69, objArray75, 10.0f };
        org.apache.commons.math.MathException mathException78 = new org.apache.commons.math.MathException("hi!", objArray75);
        org.apache.commons.math.MaxIterationsExceededException maxIterationsExceededException79 = new org.apache.commons.math.MaxIterationsExceededException((int) '4', "org.apache.commons.math.ConvergenceException: hi!", objArray75);
        org.apache.commons.math.MaxIterationsExceededException maxIterationsExceededException80 = new org.apache.commons.math.MaxIterationsExceededException((int) (short) 0, "org.apache.commons.math.ConvergenceException: hi!", objArray75);
        org.apache.commons.math.FunctionEvaluationException functionEvaluationException81 = new org.apache.commons.math.FunctionEvaluationException((double) (short) 10, "", objArray50, (java.lang.Throwable) maxIterationsExceededException80);
        org.apache.commons.math.FunctionEvaluationException functionEvaluationException82 = new org.apache.commons.math.FunctionEvaluationException((double) 2, "org.apache.commons.math.ConvergenceException: hi!", (java.lang.Throwable) maxIterationsExceededException80);
        org.apache.commons.math.MathException mathException83 = new org.apache.commons.math.MathException("", objArray10, (java.lang.Throwable) maxIterationsExceededException80);
        org.apache.commons.math.ConvergenceException convergenceException84 = new org.apache.commons.math.ConvergenceException((java.lang.Throwable) maxIterationsExceededException80);
        int int85 = maxIterationsExceededException80.getMaxIterations();
        java.lang.String str86 = maxIterationsExceededException80.getPattern();
        org.apache.commons.math.ConvergenceException convergenceException87 = new org.apache.commons.math.ConvergenceException((java.lang.Throwable) maxIterationsExceededException80);
        org.junit.Assert.assertNotNull(objArray10);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray10), "[-1.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray10), "[-1.0]");
        org.junit.Assert.assertNotNull(objArray21);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray21), "[-1.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray21), "[-1.0]");
        org.junit.Assert.assertNotNull(objArray27);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray27), "[-1.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray27), "[-1.0]");
        org.junit.Assert.assertNotNull(objArray30);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray30), "[-1.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray30), "[-1.0]");
        org.junit.Assert.assertNotNull(objArray32);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray32), "[org.apache.commons.math.MathException: , [-1.0], 10.0]");
        org.junit.Assert.assertNotNull(objArray50);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray50), "[-1.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray50), "[-1.0]");
        org.junit.Assert.assertNotNull(objArray66);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray66), "[-1.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray66), "[-1.0]");
        org.junit.Assert.assertNotNull(objArray72);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray72), "[-1.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray72), "[-1.0]");
        org.junit.Assert.assertNotNull(objArray75);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray75), "[-1.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray75), "[-1.0]");
        org.junit.Assert.assertNotNull(objArray77);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray77), "[org.apache.commons.math.MathException: , [-1.0], 10.0]");
        org.junit.Assert.assertTrue("'" + int85 + "' != '" + 0 + "'", int85 == 0);
        org.junit.Assert.assertEquals("'" + str86 + "' != '" + "org.apache.commons.math.ConvergenceException: hi!" + "'", str86, "org.apache.commons.math.ConvergenceException: hi!");
    }

    @Test
    public void test14016() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest28.test14016");
        java.lang.Object[] objArray14 = new java.lang.Object[] { (-1.0d) };
        java.lang.Throwable throwable15 = null;
        org.apache.commons.math.MathException mathException16 = new org.apache.commons.math.MathException("hi!", objArray14, throwable15);
        org.apache.commons.math.MathException mathException17 = new org.apache.commons.math.MathException("", objArray14);
        java.lang.Throwable throwable18 = null;
        org.apache.commons.math.FunctionEvaluationException functionEvaluationException19 = new org.apache.commons.math.FunctionEvaluationException((double) 100L, "hi!", objArray14, throwable18);
        org.apache.commons.math.MathException mathException20 = new org.apache.commons.math.MathException("org.apache.commons.math.ConvergenceException: hi!", objArray14);
        org.apache.commons.math.MaxIterationsExceededException maxIterationsExceededException21 = new org.apache.commons.math.MaxIterationsExceededException(2, "org.apache.commons.math.ConvergenceException: hi!", objArray14);
        org.apache.commons.math.ConvergenceException convergenceException22 = new org.apache.commons.math.ConvergenceException("", objArray14);
        org.apache.commons.math.FunctionEvaluationException functionEvaluationException23 = new org.apache.commons.math.FunctionEvaluationException((double) (-1), "org.apache.commons.math.ConvergenceException: hi!", objArray14);
        org.apache.commons.math.MaxIterationsExceededException maxIterationsExceededException25 = new org.apache.commons.math.MaxIterationsExceededException(0);
        org.apache.commons.math.ode.DerivativeException derivativeException26 = new org.apache.commons.math.ode.DerivativeException((java.lang.Throwable) maxIterationsExceededException25);
        org.apache.commons.math.ConvergenceException convergenceException27 = new org.apache.commons.math.ConvergenceException("org.apache.commons.math.FunctionEvaluationException: org.apache.commons.math.ConvergenceException: hi!", objArray14, (java.lang.Throwable) maxIterationsExceededException25);
        org.apache.commons.math.MathException mathException28 = new org.apache.commons.math.MathException("Maximal number of iterations ({0}) exceeded", objArray14);
        org.apache.commons.math.MathException mathException29 = new org.apache.commons.math.MathException("org.apache.commons.math.FunctionEvaluationException: org.apache.commons.math.ConvergenceException: org.apache.commons.math.MaxIterationsExceededException: org.apache.commons.math.MathException: org.apache.commons.math.ConvergenceException: hi!", objArray14);
        org.junit.Assert.assertNotNull(objArray14);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray14), "[-1.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray14), "[-1.0]");
    }

    @Test
    public void test14017() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest28.test14017");
        org.apache.commons.math.MathException mathException1 = new org.apache.commons.math.MathException("org.apache.commons.math.MathException: org.apache.commons.math.MaxIterationsExceededException: org.apache.commons.math.FunctionEvaluationException: org.apache.commons.math.FunctionEvaluationException: org.apache.commons.math.ConvergenceException: hi!");
    }

    @Test
    public void test14018() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest28.test14018");
        java.lang.String[] strArray12 = new java.lang.String[] { "", "org.apache.commons.math.FunctionEvaluationException: org.apache.commons.math.ConvergenceException: hi!", "org.apache.commons.math.ConvergenceException: hi!", "hi!", "org.apache.commons.math.FunctionEvaluationException: ", "" };
        org.apache.commons.math.ode.DerivativeException derivativeException13 = new org.apache.commons.math.ode.DerivativeException("org.apache.commons.math.FunctionEvaluationException: org.apache.commons.math.ConvergenceException: hi!", strArray12);
        org.apache.commons.math.MathException mathException14 = new org.apache.commons.math.MathException("org.apache.commons.math.ConvergenceException: ", (java.lang.Object[]) strArray12);
        org.apache.commons.math.ode.DerivativeException derivativeException15 = new org.apache.commons.math.ode.DerivativeException("org.apache.commons.math.ode.DerivativeException: org.apache.commons.math.ConvergenceException: ", strArray12);
        org.apache.commons.math.ode.DerivativeException derivativeException16 = new org.apache.commons.math.ode.DerivativeException("org.apache.commons.math.MathException: org.apache.commons.math.ConvergenceException: org.apache.commons.math.ode.DerivativeException: hi!", strArray12);
        org.apache.commons.math.MathException mathException17 = new org.apache.commons.math.MathException("org.apache.commons.math.ConvergenceException: org.apache.commons.math.FunctionEvaluationException: org.apache.commons.math.MathException: hi!", (java.lang.Object[]) strArray12);
        org.apache.commons.math.MathException mathException18 = new org.apache.commons.math.MathException("org.apache.commons.math.ode.DerivativeException: hi!", (java.lang.Object[]) strArray12);
        org.junit.Assert.assertNotNull(strArray12);
    }

    @Test
    public void test14019() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest28.test14019");
        java.lang.String[] strArray1 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math.ode.DerivativeException derivativeException2 = new org.apache.commons.math.ode.DerivativeException("org.apache.commons.math.FunctionEvaluationException: org.apache.commons.math.MathException: Evaluation failed for argument = 1", strArray1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test14020() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest28.test14020");
        java.lang.Object[] objArray12 = new java.lang.Object[] { (-1.0d) };
        java.lang.Throwable throwable13 = null;
        org.apache.commons.math.MathException mathException14 = new org.apache.commons.math.MathException("hi!", objArray12, throwable13);
        org.apache.commons.math.ConvergenceException convergenceException15 = new org.apache.commons.math.ConvergenceException("hi!", objArray12);
        org.apache.commons.math.FunctionEvaluationException functionEvaluationException16 = new org.apache.commons.math.FunctionEvaluationException((double) 1, "", objArray12);
        org.apache.commons.math.MathException mathException17 = new org.apache.commons.math.MathException("org.apache.commons.math.ConvergenceException: hi!", objArray12);
        java.lang.Object[] objArray27 = new java.lang.Object[] { (-1.0d) };
        java.lang.Throwable throwable28 = null;
        org.apache.commons.math.MathException mathException29 = new org.apache.commons.math.MathException("hi!", objArray27, throwable28);
        org.apache.commons.math.MathException mathException30 = new org.apache.commons.math.MathException("", objArray27);
        java.lang.Throwable throwable31 = null;
        org.apache.commons.math.FunctionEvaluationException functionEvaluationException32 = new org.apache.commons.math.FunctionEvaluationException((double) 100L, "hi!", objArray27, throwable31);
        org.apache.commons.math.MathException mathException33 = new org.apache.commons.math.MathException("org.apache.commons.math.ConvergenceException: hi!", objArray27);
        org.apache.commons.math.FunctionEvaluationException functionEvaluationException34 = new org.apache.commons.math.FunctionEvaluationException((double) 10L, "hi!", objArray27);
        org.apache.commons.math.FunctionEvaluationException functionEvaluationException35 = new org.apache.commons.math.FunctionEvaluationException((double) (byte) -1, (java.lang.Throwable) functionEvaluationException34);
        org.apache.commons.math.ConvergenceException convergenceException36 = new org.apache.commons.math.ConvergenceException((java.lang.Throwable) functionEvaluationException34);
        org.apache.commons.math.FunctionEvaluationException functionEvaluationException37 = new org.apache.commons.math.FunctionEvaluationException((double) ' ', "org.apache.commons.math.ConvergenceException: Convergence failed", objArray12, (java.lang.Throwable) functionEvaluationException34);
        java.lang.Object[] objArray46 = new java.lang.Object[] { (-1.0d) };
        java.lang.Throwable throwable47 = null;
        org.apache.commons.math.MathException mathException48 = new org.apache.commons.math.MathException("hi!", objArray46, throwable47);
        org.apache.commons.math.ConvergenceException convergenceException49 = new org.apache.commons.math.ConvergenceException("hi!", objArray46);
        org.apache.commons.math.FunctionEvaluationException functionEvaluationException50 = new org.apache.commons.math.FunctionEvaluationException((double) 1, "", objArray46);
        org.apache.commons.math.MathException mathException51 = new org.apache.commons.math.MathException("org.apache.commons.math.ConvergenceException: hi!", objArray46);
        java.lang.Object[] objArray59 = new java.lang.Object[] { (-1.0d) };
        java.lang.Throwable throwable60 = null;
        org.apache.commons.math.MathException mathException61 = new org.apache.commons.math.MathException("hi!", objArray59, throwable60);
        org.apache.commons.math.MathException mathException62 = new org.apache.commons.math.MathException("", objArray59);
        java.lang.Throwable throwable63 = null;
        org.apache.commons.math.FunctionEvaluationException functionEvaluationException64 = new org.apache.commons.math.FunctionEvaluationException((double) 100L, "hi!", objArray59, throwable63);
        org.apache.commons.math.MathException mathException65 = new org.apache.commons.math.MathException("org.apache.commons.math.ConvergenceException: hi!", objArray59);
        org.apache.commons.math.ConvergenceException convergenceException66 = new org.apache.commons.math.ConvergenceException("", objArray59);
        org.apache.commons.math.ConvergenceException convergenceException67 = new org.apache.commons.math.ConvergenceException("org.apache.commons.math.FunctionEvaluationException: ", objArray46, (java.lang.Throwable) convergenceException66);
        org.apache.commons.math.MathException mathException68 = new org.apache.commons.math.MathException("", objArray46);
        org.apache.commons.math.MathException mathException69 = new org.apache.commons.math.MathException("org.apache.commons.math.MathException: hi!", objArray12, (java.lang.Throwable) mathException68);
        org.apache.commons.math.FunctionEvaluationException functionEvaluationException71 = new org.apache.commons.math.FunctionEvaluationException((double) 100L);
        org.apache.commons.math.ConvergenceException convergenceException72 = new org.apache.commons.math.ConvergenceException("", objArray12, (java.lang.Throwable) functionEvaluationException71);
        java.lang.Throwable[] throwableArray73 = functionEvaluationException71.getSuppressed();
        org.apache.commons.math.FunctionEvaluationException functionEvaluationException74 = new org.apache.commons.math.FunctionEvaluationException((double) 0L, "org.apache.commons.math.FunctionEvaluationException: org.apache.commons.math.ConvergenceException: org.apache.commons.math.ode.DerivativeException: hi!", (java.lang.Object[]) throwableArray73);
        java.lang.Throwable[] throwableArray75 = functionEvaluationException74.getSuppressed();
        double double76 = functionEvaluationException74.getArgument();
        java.lang.Object[] objArray77 = functionEvaluationException74.getArguments();
        java.lang.Class<?> wildcardClass78 = objArray77.getClass();
        org.junit.Assert.assertNotNull(objArray12);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray12), "[-1.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray12), "[-1.0]");
        org.junit.Assert.assertNotNull(objArray27);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray27), "[-1.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray27), "[-1.0]");
        org.junit.Assert.assertNotNull(objArray46);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray46), "[-1.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray46), "[-1.0]");
        org.junit.Assert.assertNotNull(objArray59);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray59), "[-1.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray59), "[-1.0]");
        org.junit.Assert.assertNotNull(throwableArray73);
        org.junit.Assert.assertNotNull(throwableArray75);
        org.junit.Assert.assertTrue("'" + double76 + "' != '" + 0.0d + "'", double76 == 0.0d);
        org.junit.Assert.assertNotNull(objArray77);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray77), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray77), "[]");
        org.junit.Assert.assertNotNull(wildcardClass78);
    }

    @Test
    public void test14021() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest28.test14021");
        java.lang.String[] strArray16 = new java.lang.String[] { "", "hi!", "hi!" };
        org.apache.commons.math.ode.DerivativeException derivativeException17 = new org.apache.commons.math.ode.DerivativeException("", strArray16);
        org.apache.commons.math.ode.DerivativeException derivativeException18 = new org.apache.commons.math.ode.DerivativeException("hi!", strArray16);
        org.apache.commons.math.ode.DerivativeException derivativeException19 = new org.apache.commons.math.ode.DerivativeException("org.apache.commons.math.ConvergenceException: hi!", strArray16);
        java.lang.Object[] objArray24 = new java.lang.Object[] { (-1.0d) };
        java.lang.Throwable throwable25 = null;
        org.apache.commons.math.MathException mathException26 = new org.apache.commons.math.MathException("hi!", objArray24, throwable25);
        org.apache.commons.math.MathException mathException27 = new org.apache.commons.math.MathException("", objArray24);
        java.lang.Object[] objArray30 = new java.lang.Object[] { (-1.0d) };
        java.lang.Throwable throwable31 = null;
        org.apache.commons.math.MathException mathException32 = new org.apache.commons.math.MathException("hi!", objArray30, throwable31);
        java.lang.Object[] objArray33 = mathException32.getArguments();
        java.lang.Object[] objArray35 = new java.lang.Object[] { mathException27, objArray33, 10.0f };
        org.apache.commons.math.MathException mathException36 = new org.apache.commons.math.MathException("hi!", objArray33);
        org.apache.commons.math.ode.DerivativeException derivativeException37 = new org.apache.commons.math.ode.DerivativeException((java.lang.Throwable) mathException36);
        org.apache.commons.math.ConvergenceException convergenceException38 = new org.apache.commons.math.ConvergenceException("org.apache.commons.math.ConvergenceException: hi!", (java.lang.Object[]) strArray16, (java.lang.Throwable) mathException36);
        org.apache.commons.math.ode.DerivativeException derivativeException39 = new org.apache.commons.math.ode.DerivativeException("org.apache.commons.math.FunctionEvaluationException: org.apache.commons.math.ConvergenceException: hi!", strArray16);
        org.apache.commons.math.MaxIterationsExceededException maxIterationsExceededException40 = new org.apache.commons.math.MaxIterationsExceededException((int) '#', "", (java.lang.Object[]) strArray16);
        org.apache.commons.math.ode.DerivativeException derivativeException41 = new org.apache.commons.math.ode.DerivativeException("org.apache.commons.math.ConvergenceException: ", strArray16);
        java.lang.Throwable throwable43 = null;
        org.apache.commons.math.ConvergenceException convergenceException44 = new org.apache.commons.math.ConvergenceException("org.apache.commons.math.ConvergenceException: org.apache.commons.math.ConvergenceException: ", throwable43);
        org.apache.commons.math.ConvergenceException convergenceException45 = new org.apache.commons.math.ConvergenceException("org.apache.commons.math.MaxIterationsExceededException: org.apache.commons.math.MathException: org.apache.commons.math.ode.DerivativeException: ", (java.lang.Object[]) strArray16, throwable43);
        org.apache.commons.math.ConvergenceException convergenceException46 = new org.apache.commons.math.ConvergenceException("org.apache.commons.math.FunctionEvaluationException: hi!", (java.lang.Object[]) strArray16);
        org.apache.commons.math.ode.DerivativeException derivativeException47 = new org.apache.commons.math.ode.DerivativeException("org.apache.commons.math.ConvergenceException: org.apache.commons.math.FunctionEvaluationException: org.apache.commons.math.ConvergenceException: hi!", strArray16);
        java.lang.Object[] objArray58 = new java.lang.Object[] { (-1.0d) };
        java.lang.Throwable throwable59 = null;
        org.apache.commons.math.MathException mathException60 = new org.apache.commons.math.MathException("hi!", objArray58, throwable59);
        org.apache.commons.math.MathException mathException61 = new org.apache.commons.math.MathException("", objArray58);
        java.lang.Throwable throwable62 = null;
        org.apache.commons.math.FunctionEvaluationException functionEvaluationException63 = new org.apache.commons.math.FunctionEvaluationException((double) 100L, "hi!", objArray58, throwable62);
        org.apache.commons.math.MathException mathException64 = new org.apache.commons.math.MathException("org.apache.commons.math.ConvergenceException: hi!", objArray58);
        org.apache.commons.math.FunctionEvaluationException functionEvaluationException65 = new org.apache.commons.math.FunctionEvaluationException(0.0d, "org.apache.commons.math.ConvergenceException: ", objArray58);
        java.lang.String[] strArray74 = new java.lang.String[] { "", "org.apache.commons.math.FunctionEvaluationException: org.apache.commons.math.ConvergenceException: hi!", "org.apache.commons.math.ConvergenceException: hi!", "hi!", "org.apache.commons.math.FunctionEvaluationException: ", "" };
        org.apache.commons.math.ode.DerivativeException derivativeException75 = new org.apache.commons.math.ode.DerivativeException("org.apache.commons.math.FunctionEvaluationException: org.apache.commons.math.ConvergenceException: hi!", strArray74);
        org.apache.commons.math.MathException mathException76 = new org.apache.commons.math.MathException("org.apache.commons.math.ConvergenceException: ", (java.lang.Object[]) strArray74);
        org.apache.commons.math.FunctionEvaluationException functionEvaluationException77 = new org.apache.commons.math.FunctionEvaluationException((double) 10, "hi!", objArray58, (java.lang.Throwable) mathException76);
        org.apache.commons.math.ode.DerivativeException derivativeException78 = new org.apache.commons.math.ode.DerivativeException((java.lang.Throwable) mathException76);
        org.apache.commons.math.ode.DerivativeException derivativeException79 = new org.apache.commons.math.ode.DerivativeException((java.lang.Throwable) mathException76);
        org.apache.commons.math.ConvergenceException convergenceException80 = new org.apache.commons.math.ConvergenceException("org.apache.commons.math.ConvergenceException: org.apache.commons.math.MathException: org.apache.commons.math.MaxIterationsExceededException: Maximal number of iterations (0) exceeded", (java.lang.Object[]) strArray16, (java.lang.Throwable) mathException76);
        org.apache.commons.math.ConvergenceException convergenceException81 = new org.apache.commons.math.ConvergenceException("org.apache.commons.math.FunctionEvaluationException: org.apache.commons.math.MathException: org.apache.commons.math.ConvergenceException: hi!", (java.lang.Throwable) mathException76);
        java.lang.String str82 = mathException76.getPattern();
        org.junit.Assert.assertNotNull(strArray16);
        org.junit.Assert.assertNotNull(objArray24);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray24), "[-1.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray24), "[-1.0]");
        org.junit.Assert.assertNotNull(objArray30);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray30), "[-1.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray30), "[-1.0]");
        org.junit.Assert.assertNotNull(objArray33);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray33), "[-1.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray33), "[-1.0]");
        org.junit.Assert.assertNotNull(objArray35);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray35), "[org.apache.commons.math.MathException: , [-1.0], 10.0]");
        org.junit.Assert.assertNotNull(objArray58);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray58), "[-1.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray58), "[-1.0]");
        org.junit.Assert.assertNotNull(strArray74);
        org.junit.Assert.assertEquals("'" + str82 + "' != '" + "org.apache.commons.math.ConvergenceException: " + "'", str82, "org.apache.commons.math.ConvergenceException: ");
    }

    @Test
    public void test14022() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest28.test14022");
        java.lang.Throwable throwable2 = null;
        org.apache.commons.math.MathException mathException3 = new org.apache.commons.math.MathException("hi!", throwable2);
        org.apache.commons.math.ConvergenceException convergenceException4 = new org.apache.commons.math.ConvergenceException((java.lang.Throwable) mathException3);
        org.apache.commons.math.ConvergenceException convergenceException5 = new org.apache.commons.math.ConvergenceException("org.apache.commons.math.FunctionEvaluationException: org.apache.commons.math.ConvergenceException: org.apache.commons.math.ConvergenceException: ", (java.lang.Throwable) mathException3);
        org.apache.commons.math.ConvergenceException convergenceException6 = new org.apache.commons.math.ConvergenceException((java.lang.Throwable) mathException3);
    }

    @Test
    public void test14023() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest28.test14023");
        java.lang.String[] strArray16 = new java.lang.String[] { "", "hi!", "hi!" };
        org.apache.commons.math.ode.DerivativeException derivativeException17 = new org.apache.commons.math.ode.DerivativeException("", strArray16);
        org.apache.commons.math.ode.DerivativeException derivativeException18 = new org.apache.commons.math.ode.DerivativeException("hi!", strArray16);
        org.apache.commons.math.ode.DerivativeException derivativeException19 = new org.apache.commons.math.ode.DerivativeException("org.apache.commons.math.ConvergenceException: hi!", strArray16);
        java.lang.Object[] objArray24 = new java.lang.Object[] { (-1.0d) };
        java.lang.Throwable throwable25 = null;
        org.apache.commons.math.MathException mathException26 = new org.apache.commons.math.MathException("hi!", objArray24, throwable25);
        org.apache.commons.math.MathException mathException27 = new org.apache.commons.math.MathException("", objArray24);
        java.lang.Object[] objArray30 = new java.lang.Object[] { (-1.0d) };
        java.lang.Throwable throwable31 = null;
        org.apache.commons.math.MathException mathException32 = new org.apache.commons.math.MathException("hi!", objArray30, throwable31);
        java.lang.Object[] objArray33 = mathException32.getArguments();
        java.lang.Object[] objArray35 = new java.lang.Object[] { mathException27, objArray33, 10.0f };
        org.apache.commons.math.MathException mathException36 = new org.apache.commons.math.MathException("hi!", objArray33);
        org.apache.commons.math.ode.DerivativeException derivativeException37 = new org.apache.commons.math.ode.DerivativeException((java.lang.Throwable) mathException36);
        org.apache.commons.math.ConvergenceException convergenceException38 = new org.apache.commons.math.ConvergenceException("org.apache.commons.math.ConvergenceException: hi!", (java.lang.Object[]) strArray16, (java.lang.Throwable) mathException36);
        org.apache.commons.math.ode.DerivativeException derivativeException39 = new org.apache.commons.math.ode.DerivativeException("org.apache.commons.math.ConvergenceException: ", strArray16);
        org.apache.commons.math.ode.DerivativeException derivativeException40 = new org.apache.commons.math.ode.DerivativeException("org.apache.commons.math.ConvergenceException: hi!", strArray16);
        org.apache.commons.math.ode.DerivativeException derivativeException41 = new org.apache.commons.math.ode.DerivativeException("org.apache.commons.math.ConvergenceException: org.apache.commons.math.FunctionEvaluationException: ", strArray16);
        org.apache.commons.math.ode.DerivativeException derivativeException42 = new org.apache.commons.math.ode.DerivativeException("org.apache.commons.math.FunctionEvaluationException: org.apache.commons.math.FunctionEvaluationException: org.apache.commons.math.ConvergenceException: hi!", strArray16);
        java.lang.Object[] objArray48 = new java.lang.Object[] { (-1.0d) };
        java.lang.Throwable throwable49 = null;
        org.apache.commons.math.MathException mathException50 = new org.apache.commons.math.MathException("hi!", objArray48, throwable49);
        org.apache.commons.math.MathException mathException51 = new org.apache.commons.math.MathException("", objArray48);
        java.lang.Throwable throwable52 = null;
        org.apache.commons.math.FunctionEvaluationException functionEvaluationException53 = new org.apache.commons.math.FunctionEvaluationException((double) 100L, "hi!", objArray48, throwable52);
        org.apache.commons.math.MathException mathException54 = new org.apache.commons.math.MathException("org.apache.commons.math.FunctionEvaluationException: org.apache.commons.math.MaxIterationsExceededException: Maximal number of iterations (-1) exceeded", (java.lang.Object[]) strArray16, throwable52);
        org.apache.commons.math.ConvergenceException convergenceException55 = new org.apache.commons.math.ConvergenceException("org.apache.commons.math.MaxIterationsExceededException: org.apache.commons.math.MathException: org.apache.commons.math.ode.DerivativeException: ", (java.lang.Object[]) strArray16);
        org.apache.commons.math.FunctionEvaluationException functionEvaluationException58 = new org.apache.commons.math.FunctionEvaluationException((double) 52, "org.apache.commons.math.ode.DerivativeException: ");
        org.apache.commons.math.FunctionEvaluationException functionEvaluationException59 = new org.apache.commons.math.FunctionEvaluationException(0.0d, "org.apache.commons.math.MathException: org.apache.commons.math.MaxIterationsExceededException: org.apache.commons.math.ConvergenceException: hi!", (java.lang.Object[]) strArray16, (java.lang.Throwable) functionEvaluationException58);
        org.apache.commons.math.ConvergenceException convergenceException60 = new org.apache.commons.math.ConvergenceException("org.apache.commons.math.MaxIterationsExceededException: Maximal number of iterations (32) exceeded", (java.lang.Object[]) strArray16);
        org.junit.Assert.assertNotNull(strArray16);
        org.junit.Assert.assertNotNull(objArray24);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray24), "[-1.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray24), "[-1.0]");
        org.junit.Assert.assertNotNull(objArray30);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray30), "[-1.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray30), "[-1.0]");
        org.junit.Assert.assertNotNull(objArray33);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray33), "[-1.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray33), "[-1.0]");
        org.junit.Assert.assertNotNull(objArray35);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray35), "[org.apache.commons.math.MathException: , [-1.0], 10.0]");
        org.junit.Assert.assertNotNull(objArray48);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray48), "[-1.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray48), "[-1.0]");
    }

    @Test
    public void test14024() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest28.test14024");
        java.lang.Object[] objArray6 = new java.lang.Object[] { (-1.0d) };
        java.lang.Throwable throwable7 = null;
        org.apache.commons.math.MathException mathException8 = new org.apache.commons.math.MathException("hi!", objArray6, throwable7);
        org.apache.commons.math.ConvergenceException convergenceException9 = new org.apache.commons.math.ConvergenceException("hi!", objArray6);
        java.lang.Object[] objArray14 = new java.lang.Object[] { (-1.0d) };
        java.lang.Throwable throwable15 = null;
        org.apache.commons.math.MathException mathException16 = new org.apache.commons.math.MathException("hi!", objArray14, throwable15);
        java.lang.Object[] objArray20 = new java.lang.Object[] { (-1.0d) };
        java.lang.Throwable throwable21 = null;
        org.apache.commons.math.MathException mathException22 = new org.apache.commons.math.MathException("hi!", objArray20, throwable21);
        org.apache.commons.math.FunctionEvaluationException functionEvaluationException23 = new org.apache.commons.math.FunctionEvaluationException((double) 100.0f, throwable21);
        org.apache.commons.math.FunctionEvaluationException functionEvaluationException24 = new org.apache.commons.math.FunctionEvaluationException((double) 1.0f, "", objArray14, throwable21);
        java.lang.Object[] objArray25 = functionEvaluationException24.getArguments();
        org.apache.commons.math.ConvergenceException convergenceException26 = new org.apache.commons.math.ConvergenceException("", objArray6, (java.lang.Throwable) functionEvaluationException24);
        org.apache.commons.math.ode.DerivativeException derivativeException27 = new org.apache.commons.math.ode.DerivativeException((java.lang.Throwable) convergenceException26);
        java.lang.String str28 = convergenceException26.getPattern();
        org.apache.commons.math.MathException mathException29 = new org.apache.commons.math.MathException((java.lang.Throwable) convergenceException26);
        org.apache.commons.math.FunctionEvaluationException functionEvaluationException30 = new org.apache.commons.math.FunctionEvaluationException((double) 100, (java.lang.Throwable) convergenceException26);
        org.apache.commons.math.MathException mathException31 = new org.apache.commons.math.MathException((java.lang.Throwable) functionEvaluationException30);
        org.apache.commons.math.MathException mathException32 = new org.apache.commons.math.MathException("org.apache.commons.math.MathException: org.apache.commons.math.FunctionEvaluationException: hi!", (java.lang.Throwable) functionEvaluationException30);
        org.junit.Assert.assertNotNull(objArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray6), "[-1.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray6), "[-1.0]");
        org.junit.Assert.assertNotNull(objArray14);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray14), "[-1.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray14), "[-1.0]");
        org.junit.Assert.assertNotNull(objArray20);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray20), "[-1.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray20), "[-1.0]");
        org.junit.Assert.assertNotNull(objArray25);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray25), "[-1.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray25), "[-1.0]");
        org.junit.Assert.assertEquals("'" + str28 + "' != '" + "" + "'", str28, "");
    }

    @Test
    public void test14025() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest28.test14025");
        java.lang.String[] strArray18 = new java.lang.String[] { "", "hi!", "hi!" };
        org.apache.commons.math.ode.DerivativeException derivativeException19 = new org.apache.commons.math.ode.DerivativeException("", strArray18);
        org.apache.commons.math.ode.DerivativeException derivativeException20 = new org.apache.commons.math.ode.DerivativeException("hi!", strArray18);
        org.apache.commons.math.ode.DerivativeException derivativeException21 = new org.apache.commons.math.ode.DerivativeException("org.apache.commons.math.ConvergenceException: hi!", strArray18);
        java.lang.Object[] objArray26 = new java.lang.Object[] { (-1.0d) };
        java.lang.Throwable throwable27 = null;
        org.apache.commons.math.MathException mathException28 = new org.apache.commons.math.MathException("hi!", objArray26, throwable27);
        org.apache.commons.math.MathException mathException29 = new org.apache.commons.math.MathException("", objArray26);
        java.lang.Object[] objArray32 = new java.lang.Object[] { (-1.0d) };
        java.lang.Throwable throwable33 = null;
        org.apache.commons.math.MathException mathException34 = new org.apache.commons.math.MathException("hi!", objArray32, throwable33);
        java.lang.Object[] objArray35 = mathException34.getArguments();
        java.lang.Object[] objArray37 = new java.lang.Object[] { mathException29, objArray35, 10.0f };
        org.apache.commons.math.MathException mathException38 = new org.apache.commons.math.MathException("hi!", objArray35);
        org.apache.commons.math.ode.DerivativeException derivativeException39 = new org.apache.commons.math.ode.DerivativeException((java.lang.Throwable) mathException38);
        org.apache.commons.math.ConvergenceException convergenceException40 = new org.apache.commons.math.ConvergenceException("org.apache.commons.math.ConvergenceException: hi!", (java.lang.Object[]) strArray18, (java.lang.Throwable) mathException38);
        org.apache.commons.math.ode.DerivativeException derivativeException41 = new org.apache.commons.math.ode.DerivativeException("org.apache.commons.math.FunctionEvaluationException: org.apache.commons.math.ConvergenceException: hi!", strArray18);
        org.apache.commons.math.MaxIterationsExceededException maxIterationsExceededException42 = new org.apache.commons.math.MaxIterationsExceededException((int) '#', "", (java.lang.Object[]) strArray18);
        org.apache.commons.math.ode.DerivativeException derivativeException43 = new org.apache.commons.math.ode.DerivativeException("org.apache.commons.math.ConvergenceException: ", strArray18);
        java.lang.Throwable throwable45 = null;
        org.apache.commons.math.ConvergenceException convergenceException46 = new org.apache.commons.math.ConvergenceException("org.apache.commons.math.ConvergenceException: org.apache.commons.math.ConvergenceException: ", throwable45);
        org.apache.commons.math.ConvergenceException convergenceException47 = new org.apache.commons.math.ConvergenceException("org.apache.commons.math.MaxIterationsExceededException: org.apache.commons.math.MathException: org.apache.commons.math.ode.DerivativeException: ", (java.lang.Object[]) strArray18, throwable45);
        org.apache.commons.math.ConvergenceException convergenceException48 = new org.apache.commons.math.ConvergenceException("org.apache.commons.math.FunctionEvaluationException: hi!", (java.lang.Object[]) strArray18);
        org.apache.commons.math.MaxIterationsExceededException maxIterationsExceededException49 = new org.apache.commons.math.MaxIterationsExceededException(32, "org.apache.commons.math.ConvergenceException: ", (java.lang.Object[]) strArray18);
        java.lang.String[] strArray62 = new java.lang.String[] { "", "hi!", "hi!" };
        org.apache.commons.math.ode.DerivativeException derivativeException63 = new org.apache.commons.math.ode.DerivativeException("", strArray62);
        org.apache.commons.math.ode.DerivativeException derivativeException64 = new org.apache.commons.math.ode.DerivativeException("", strArray62);
        org.apache.commons.math.ConvergenceException convergenceException65 = new org.apache.commons.math.ConvergenceException((java.lang.Throwable) derivativeException64);
        java.lang.Throwable[] throwableArray66 = convergenceException65.getSuppressed();
        org.apache.commons.math.FunctionEvaluationException functionEvaluationException67 = new org.apache.commons.math.FunctionEvaluationException((double) (byte) 10, "org.apache.commons.math.ConvergenceException: org.apache.commons.math.ConvergenceException: ", (java.lang.Object[]) throwableArray66);
        org.apache.commons.math.FunctionEvaluationException functionEvaluationException68 = new org.apache.commons.math.FunctionEvaluationException((double) 10L, "org.apache.commons.math.FunctionEvaluationException: org.apache.commons.math.FunctionEvaluationException: Evaluation failed for argument = 100", (java.lang.Object[]) throwableArray66);
        org.apache.commons.math.MaxIterationsExceededException maxIterationsExceededException71 = new org.apache.commons.math.MaxIterationsExceededException(3);
        org.apache.commons.math.ConvergenceException convergenceException72 = new org.apache.commons.math.ConvergenceException("org.apache.commons.math.ConvergenceException: Convergence failed", (java.lang.Throwable) maxIterationsExceededException71);
        int int73 = maxIterationsExceededException71.getMaxIterations();
        org.apache.commons.math.ConvergenceException convergenceException74 = new org.apache.commons.math.ConvergenceException("org.apache.commons.math.MathException: org.apache.commons.math.ConvergenceException: org.apache.commons.math.FunctionEvaluationException: ", (java.lang.Object[]) throwableArray66, (java.lang.Throwable) maxIterationsExceededException71);
        org.apache.commons.math.ConvergenceException convergenceException75 = new org.apache.commons.math.ConvergenceException("org.apache.commons.math.ConvergenceException: org.apache.commons.math.ConvergenceException: hi!", (java.lang.Object[]) throwableArray66);
        org.apache.commons.math.ConvergenceException convergenceException76 = new org.apache.commons.math.ConvergenceException("org.apache.commons.math.FunctionEvaluationException: org.apache.commons.math.ConvergenceException: org.apache.commons.math.FunctionEvaluationException: org.apache.commons.math.FunctionEvaluationException: Evaluation failed for argument = 100", (java.lang.Object[]) throwableArray66);
        org.apache.commons.math.MathException mathException77 = new org.apache.commons.math.MathException("org.apache.commons.math.MathException: org.apache.commons.math.ConvergenceException: org.apache.commons.math.ConvergenceException: org.apache.commons.math.ConvergenceException: ", (java.lang.Object[]) strArray18, (java.lang.Throwable) convergenceException76);
        org.apache.commons.math.ode.DerivativeException derivativeException78 = new org.apache.commons.math.ode.DerivativeException("", strArray18);
        org.apache.commons.math.ConvergenceException convergenceException79 = new org.apache.commons.math.ConvergenceException("org.apache.commons.math.FunctionEvaluationException: Evaluation failed for argument = -1", (java.lang.Object[]) strArray18);
        org.junit.Assert.assertNotNull(strArray18);
        org.junit.Assert.assertNotNull(objArray26);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray26), "[-1.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray26), "[-1.0]");
        org.junit.Assert.assertNotNull(objArray32);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray32), "[-1.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray32), "[-1.0]");
        org.junit.Assert.assertNotNull(objArray35);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray35), "[-1.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray35), "[-1.0]");
        org.junit.Assert.assertNotNull(objArray37);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray37), "[org.apache.commons.math.MathException: , [-1.0], 10.0]");
        org.junit.Assert.assertNotNull(strArray62);
        org.junit.Assert.assertNotNull(throwableArray66);
        org.junit.Assert.assertTrue("'" + int73 + "' != '" + 3 + "'", int73 == 3);
    }

    @Test
    public void test14026() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest28.test14026");
        java.lang.Object[] objArray1 = null;
        java.lang.String[] strArray14 = new java.lang.String[] { "", "hi!", "hi!" };
        org.apache.commons.math.ode.DerivativeException derivativeException15 = new org.apache.commons.math.ode.DerivativeException("", strArray14);
        org.apache.commons.math.ode.DerivativeException derivativeException16 = new org.apache.commons.math.ode.DerivativeException("", strArray14);
        org.apache.commons.math.ConvergenceException convergenceException17 = new org.apache.commons.math.ConvergenceException((java.lang.Throwable) derivativeException16);
        java.lang.Throwable[] throwableArray18 = convergenceException17.getSuppressed();
        org.apache.commons.math.FunctionEvaluationException functionEvaluationException19 = new org.apache.commons.math.FunctionEvaluationException((double) (byte) 10, "org.apache.commons.math.ConvergenceException: org.apache.commons.math.ConvergenceException: ", (java.lang.Object[]) throwableArray18);
        org.apache.commons.math.MaxIterationsExceededException maxIterationsExceededException20 = new org.apache.commons.math.MaxIterationsExceededException((int) (byte) 1, "org.apache.commons.math.FunctionEvaluationException: org.apache.commons.math.MathException: ", (java.lang.Object[]) throwableArray18);
        java.lang.Object[] objArray28 = new java.lang.Object[] { (-1.0d) };
        java.lang.Throwable throwable29 = null;
        org.apache.commons.math.MathException mathException30 = new org.apache.commons.math.MathException("hi!", objArray28, throwable29);
        java.lang.Object[] objArray34 = new java.lang.Object[] { (-1.0d) };
        java.lang.Throwable throwable35 = null;
        org.apache.commons.math.MathException mathException36 = new org.apache.commons.math.MathException("hi!", objArray34, throwable35);
        org.apache.commons.math.FunctionEvaluationException functionEvaluationException37 = new org.apache.commons.math.FunctionEvaluationException((double) 100.0f, throwable35);
        org.apache.commons.math.FunctionEvaluationException functionEvaluationException38 = new org.apache.commons.math.FunctionEvaluationException((double) 1.0f, "", objArray28, throwable35);
        java.lang.Object[] objArray39 = functionEvaluationException38.getArguments();
        org.apache.commons.math.MathException mathException40 = new org.apache.commons.math.MathException("hi!", (java.lang.Throwable) functionEvaluationException38);
        org.apache.commons.math.ConvergenceException convergenceException41 = new org.apache.commons.math.ConvergenceException((java.lang.Throwable) functionEvaluationException38);
        java.lang.Object[] objArray49 = new java.lang.Object[] { (-1.0d) };
        java.lang.Throwable throwable50 = null;
        org.apache.commons.math.MathException mathException51 = new org.apache.commons.math.MathException("hi!", objArray49, throwable50);
        org.apache.commons.math.MathException mathException52 = new org.apache.commons.math.MathException("", objArray49);
        java.lang.Throwable throwable53 = null;
        org.apache.commons.math.FunctionEvaluationException functionEvaluationException54 = new org.apache.commons.math.FunctionEvaluationException((double) 100L, "hi!", objArray49, throwable53);
        org.apache.commons.math.MathException mathException55 = new org.apache.commons.math.MathException("org.apache.commons.math.ConvergenceException: hi!", objArray49);
        org.apache.commons.math.ConvergenceException convergenceException56 = new org.apache.commons.math.ConvergenceException("", objArray49);
        convergenceException41.addSuppressed((java.lang.Throwable) convergenceException56);
        java.lang.Object[] objArray58 = convergenceException41.getArguments();
        java.lang.Object[] objArray63 = new java.lang.Object[] { (-1.0d) };
        java.lang.Throwable throwable64 = null;
        org.apache.commons.math.MathException mathException65 = new org.apache.commons.math.MathException("hi!", objArray63, throwable64);
        org.apache.commons.math.MathException mathException66 = new org.apache.commons.math.MathException("", objArray63);
        org.apache.commons.math.MathException mathException67 = new org.apache.commons.math.MathException("", (java.lang.Throwable) mathException66);
        org.apache.commons.math.MathException mathException68 = new org.apache.commons.math.MathException((java.lang.Throwable) mathException67);
        org.apache.commons.math.MathException mathException69 = new org.apache.commons.math.MathException("org.apache.commons.math.MathException: ", objArray58, (java.lang.Throwable) mathException67);
        org.apache.commons.math.ConvergenceException convergenceException70 = new org.apache.commons.math.ConvergenceException("org.apache.commons.math.MaxIterationsExceededException: Maximal number of iterations (0) exceeded", objArray58);
        org.apache.commons.math.MathException mathException71 = new org.apache.commons.math.MathException((java.lang.Throwable) convergenceException70);
        org.apache.commons.math.ConvergenceException convergenceException72 = new org.apache.commons.math.ConvergenceException((java.lang.Throwable) convergenceException70);
        org.apache.commons.math.FunctionEvaluationException functionEvaluationException73 = new org.apache.commons.math.FunctionEvaluationException(0.0d, "org.apache.commons.math.FunctionEvaluationException: org.apache.commons.math.ConvergenceException: org.apache.commons.math.ode.DerivativeException: hi!", (java.lang.Object[]) throwableArray18, (java.lang.Throwable) convergenceException70);
        org.apache.commons.math.MathException mathException74 = new org.apache.commons.math.MathException((java.lang.Throwable) functionEvaluationException73);
        org.apache.commons.math.ConvergenceException convergenceException75 = new org.apache.commons.math.ConvergenceException("org.apache.commons.math.MaxIterationsExceededException: org.apache.commons.math.MathException: Evaluation failed for argument = 1", (java.lang.Throwable) mathException74);
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math.MathException mathException76 = new org.apache.commons.math.MathException("org.apache.commons.math.MaxIterationsExceededException: org.apache.commons.math.ConvergenceException: org.apache.commons.math.FunctionEvaluationException: hi!", objArray1, (java.lang.Throwable) mathException74);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(strArray14);
        org.junit.Assert.assertNotNull(throwableArray18);
        org.junit.Assert.assertNotNull(objArray28);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray28), "[-1.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray28), "[-1.0]");
        org.junit.Assert.assertNotNull(objArray34);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray34), "[-1.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray34), "[-1.0]");
        org.junit.Assert.assertNotNull(objArray39);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray39), "[-1.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray39), "[-1.0]");
        org.junit.Assert.assertNotNull(objArray49);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray49), "[-1.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray49), "[-1.0]");
        org.junit.Assert.assertNotNull(objArray58);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray58), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray58), "[]");
        org.junit.Assert.assertNotNull(objArray63);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray63), "[-1.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray63), "[-1.0]");
    }

    @Test
    public void test14027() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest28.test14027");
        java.lang.String[] strArray19 = new java.lang.String[] { "", "hi!", "hi!" };
        org.apache.commons.math.ode.DerivativeException derivativeException20 = new org.apache.commons.math.ode.DerivativeException("", strArray19);
        org.apache.commons.math.ode.DerivativeException derivativeException21 = new org.apache.commons.math.ode.DerivativeException("hi!", strArray19);
        org.apache.commons.math.ode.DerivativeException derivativeException22 = new org.apache.commons.math.ode.DerivativeException("org.apache.commons.math.ConvergenceException: hi!", strArray19);
        java.lang.Object[] objArray27 = new java.lang.Object[] { (-1.0d) };
        java.lang.Throwable throwable28 = null;
        org.apache.commons.math.MathException mathException29 = new org.apache.commons.math.MathException("hi!", objArray27, throwable28);
        org.apache.commons.math.MathException mathException30 = new org.apache.commons.math.MathException("", objArray27);
        java.lang.Object[] objArray33 = new java.lang.Object[] { (-1.0d) };
        java.lang.Throwable throwable34 = null;
        org.apache.commons.math.MathException mathException35 = new org.apache.commons.math.MathException("hi!", objArray33, throwable34);
        java.lang.Object[] objArray36 = mathException35.getArguments();
        java.lang.Object[] objArray38 = new java.lang.Object[] { mathException30, objArray36, 10.0f };
        org.apache.commons.math.MathException mathException39 = new org.apache.commons.math.MathException("hi!", objArray36);
        org.apache.commons.math.ode.DerivativeException derivativeException40 = new org.apache.commons.math.ode.DerivativeException((java.lang.Throwable) mathException39);
        org.apache.commons.math.ConvergenceException convergenceException41 = new org.apache.commons.math.ConvergenceException("org.apache.commons.math.ConvergenceException: hi!", (java.lang.Object[]) strArray19, (java.lang.Throwable) mathException39);
        org.apache.commons.math.ode.DerivativeException derivativeException42 = new org.apache.commons.math.ode.DerivativeException("org.apache.commons.math.FunctionEvaluationException: org.apache.commons.math.ConvergenceException: hi!", strArray19);
        org.apache.commons.math.MaxIterationsExceededException maxIterationsExceededException43 = new org.apache.commons.math.MaxIterationsExceededException((int) '#', "", (java.lang.Object[]) strArray19);
        org.apache.commons.math.FunctionEvaluationException functionEvaluationException44 = new org.apache.commons.math.FunctionEvaluationException(0.0d, "org.apache.commons.math.FunctionEvaluationException: Evaluation failed for argument = 52", (java.lang.Object[]) strArray19);
        org.apache.commons.math.ode.DerivativeException derivativeException45 = new org.apache.commons.math.ode.DerivativeException("org.apache.commons.math.ConvergenceException: org.apache.commons.math.ode.DerivativeException: hi!", strArray19);
        java.lang.Object[] objArray54 = new java.lang.Object[] { (-1.0d) };
        java.lang.Throwable throwable55 = null;
        org.apache.commons.math.MathException mathException56 = new org.apache.commons.math.MathException("hi!", objArray54, throwable55);
        org.apache.commons.math.MathException mathException57 = new org.apache.commons.math.MathException("", objArray54);
        java.lang.Object[] objArray60 = new java.lang.Object[] { (-1.0d) };
        java.lang.Throwable throwable61 = null;
        org.apache.commons.math.MathException mathException62 = new org.apache.commons.math.MathException("hi!", objArray60, throwable61);
        java.lang.Object[] objArray63 = mathException62.getArguments();
        java.lang.Object[] objArray65 = new java.lang.Object[] { mathException57, objArray63, 10.0f };
        org.apache.commons.math.MathException mathException66 = new org.apache.commons.math.MathException("hi!", objArray63);
        org.apache.commons.math.ode.DerivativeException derivativeException67 = new org.apache.commons.math.ode.DerivativeException((java.lang.Throwable) mathException66);
        org.apache.commons.math.ConvergenceException convergenceException68 = new org.apache.commons.math.ConvergenceException("hi!", (java.lang.Throwable) derivativeException67);
        org.apache.commons.math.FunctionEvaluationException functionEvaluationException69 = new org.apache.commons.math.FunctionEvaluationException(0.0d, "hi!", (java.lang.Throwable) convergenceException68);
        java.lang.Throwable[] throwableArray70 = functionEvaluationException69.getSuppressed();
        org.apache.commons.math.FunctionEvaluationException functionEvaluationException73 = new org.apache.commons.math.FunctionEvaluationException((double) 1, "org.apache.commons.math.MathException: hi!");
        org.apache.commons.math.ConvergenceException convergenceException74 = new org.apache.commons.math.ConvergenceException("org.apache.commons.math.FunctionEvaluationException: org.apache.commons.math.ConvergenceException: org.apache.commons.math.ode.DerivativeException: hi!", (java.lang.Object[]) throwableArray70, (java.lang.Throwable) functionEvaluationException73);
        org.apache.commons.math.FunctionEvaluationException functionEvaluationException75 = new org.apache.commons.math.FunctionEvaluationException(0.0d, "org.apache.commons.math.MathException: org.apache.commons.math.ConvergenceException: hi!", (java.lang.Object[]) strArray19, (java.lang.Throwable) convergenceException74);
        org.apache.commons.math.FunctionEvaluationException functionEvaluationException76 = new org.apache.commons.math.FunctionEvaluationException(0.0d, "org.apache.commons.math.ConvergenceException: Convergence failed", (java.lang.Object[]) strArray19);
        org.apache.commons.math.ConvergenceException convergenceException77 = new org.apache.commons.math.ConvergenceException((java.lang.Throwable) functionEvaluationException76);
        org.apache.commons.math.MathException mathException78 = new org.apache.commons.math.MathException("org.apache.commons.math.ConvergenceException: org.apache.commons.math.ConvergenceException: Convergence failed", (java.lang.Throwable) convergenceException77);
        org.apache.commons.math.ConvergenceException convergenceException79 = new org.apache.commons.math.ConvergenceException("org.apache.commons.math.ConvergenceException: org.apache.commons.math.ConvergenceException: hi!", (java.lang.Throwable) convergenceException77);
        org.junit.Assert.assertNotNull(strArray19);
        org.junit.Assert.assertNotNull(objArray27);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray27), "[-1.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray27), "[-1.0]");
        org.junit.Assert.assertNotNull(objArray33);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray33), "[-1.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray33), "[-1.0]");
        org.junit.Assert.assertNotNull(objArray36);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray36), "[-1.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray36), "[-1.0]");
        org.junit.Assert.assertNotNull(objArray38);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray38), "[org.apache.commons.math.MathException: , [-1.0], 10.0]");
        org.junit.Assert.assertNotNull(objArray54);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray54), "[-1.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray54), "[-1.0]");
        org.junit.Assert.assertNotNull(objArray60);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray60), "[-1.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray60), "[-1.0]");
        org.junit.Assert.assertNotNull(objArray63);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray63), "[-1.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray63), "[-1.0]");
        org.junit.Assert.assertNotNull(objArray65);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray65), "[org.apache.commons.math.MathException: , [-1.0], 10.0]");
        org.junit.Assert.assertNotNull(throwableArray70);
    }

    @Test
    public void test14028() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest28.test14028");
        java.lang.Object[] objArray13 = new java.lang.Object[] { (-1.0d) };
        java.lang.Throwable throwable14 = null;
        org.apache.commons.math.MathException mathException15 = new org.apache.commons.math.MathException("hi!", objArray13, throwable14);
        org.apache.commons.math.MathException mathException16 = new org.apache.commons.math.MathException("", objArray13);
        java.lang.Throwable throwable17 = null;
        org.apache.commons.math.FunctionEvaluationException functionEvaluationException18 = new org.apache.commons.math.FunctionEvaluationException((double) 100L, "hi!", objArray13, throwable17);
        org.apache.commons.math.MathException mathException19 = new org.apache.commons.math.MathException("org.apache.commons.math.ConvergenceException: hi!", objArray13);
        org.apache.commons.math.MaxIterationsExceededException maxIterationsExceededException20 = new org.apache.commons.math.MaxIterationsExceededException((int) ' ', "org.apache.commons.math.FunctionEvaluationException: org.apache.commons.math.ConvergenceException: hi!", objArray13);
        int int21 = maxIterationsExceededException20.getMaxIterations();
        java.lang.Object[] objArray22 = maxIterationsExceededException20.getArguments();
        org.apache.commons.math.FunctionEvaluationException functionEvaluationException23 = new org.apache.commons.math.FunctionEvaluationException((double) 2, "org.apache.commons.math.FunctionEvaluationException: org.apache.commons.math.ode.DerivativeException: ", objArray22);
        java.lang.Throwable throwable24 = null;
        org.apache.commons.math.FunctionEvaluationException functionEvaluationException25 = new org.apache.commons.math.FunctionEvaluationException(32.0d, "org.apache.commons.math.MathException: hi!", objArray22, throwable24);
        java.lang.String[] strArray36 = new java.lang.String[] { "", "hi!", "hi!" };
        org.apache.commons.math.ode.DerivativeException derivativeException37 = new org.apache.commons.math.ode.DerivativeException("", strArray36);
        org.apache.commons.math.ode.DerivativeException derivativeException38 = new org.apache.commons.math.ode.DerivativeException("org.apache.commons.math.ode.DerivativeException: ", strArray36);
        org.apache.commons.math.ode.DerivativeException derivativeException39 = new org.apache.commons.math.ode.DerivativeException("org.apache.commons.math.ConvergenceException: Convergence failed", strArray36);
        org.apache.commons.math.ode.DerivativeException derivativeException40 = new org.apache.commons.math.ode.DerivativeException("org.apache.commons.math.MathException: org.apache.commons.math.ConvergenceException: hi!", strArray36);
        org.apache.commons.math.ode.DerivativeException derivativeException41 = new org.apache.commons.math.ode.DerivativeException("org.apache.commons.math.MathException: hi!", strArray36);
        org.apache.commons.math.ode.DerivativeException derivativeException42 = new org.apache.commons.math.ode.DerivativeException("org.apache.commons.math.ConvergenceException: Convergence failed", strArray36);
        org.apache.commons.math.ConvergenceException convergenceException43 = new org.apache.commons.math.ConvergenceException("org.apache.commons.math.FunctionEvaluationException: org.apache.commons.math.FunctionEvaluationException: org.apache.commons.math.ode.DerivativeException: ", (java.lang.Object[]) strArray36);
        org.apache.commons.math.MathException mathException44 = new org.apache.commons.math.MathException((java.lang.Throwable) convergenceException43);
        org.apache.commons.math.ode.DerivativeException derivativeException45 = new org.apache.commons.math.ode.DerivativeException((java.lang.Throwable) convergenceException43);
        org.apache.commons.math.ConvergenceException convergenceException46 = new org.apache.commons.math.ConvergenceException("org.apache.commons.math.MaxIterationsExceededException: org.apache.commons.math.ode.DerivativeException: org.apache.commons.math.FunctionEvaluationException: org.apache.commons.math.ConvergenceException: hi!", objArray22, (java.lang.Throwable) convergenceException43);
        org.apache.commons.math.ode.DerivativeException derivativeException47 = new org.apache.commons.math.ode.DerivativeException((java.lang.Throwable) convergenceException46);
        org.junit.Assert.assertNotNull(objArray13);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray13), "[-1.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray13), "[-1.0]");
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 32 + "'", int21 == 32);
        org.junit.Assert.assertNotNull(objArray22);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray22), "[-1.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray22), "[-1.0]");
        org.junit.Assert.assertNotNull(strArray36);
    }

    @Test
    public void test14029() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest28.test14029");
        org.apache.commons.math.FunctionEvaluationException functionEvaluationException2 = new org.apache.commons.math.FunctionEvaluationException((double) ' ', "org.apache.commons.math.ode.DerivativeException: ");
        double double3 = functionEvaluationException2.getArgument();
        java.lang.Class<?> wildcardClass4 = functionEvaluationException2.getClass();
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 32.0d + "'", double3 == 32.0d);
        org.junit.Assert.assertNotNull(wildcardClass4);
    }

    @Test
    public void test14030() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest28.test14030");
        org.apache.commons.math.MaxIterationsExceededException maxIterationsExceededException3 = new org.apache.commons.math.MaxIterationsExceededException((int) (byte) -1);
        int int4 = maxIterationsExceededException3.getMaxIterations();
        int int5 = maxIterationsExceededException3.getMaxIterations();
        java.lang.Object[] objArray6 = maxIterationsExceededException3.getArguments();
        java.lang.Object[] objArray13 = new java.lang.Object[] { (-1.0d) };
        java.lang.Throwable throwable14 = null;
        org.apache.commons.math.MathException mathException15 = new org.apache.commons.math.MathException("hi!", objArray13, throwable14);
        java.lang.Object[] objArray19 = new java.lang.Object[] { (-1.0d) };
        java.lang.Throwable throwable20 = null;
        org.apache.commons.math.MathException mathException21 = new org.apache.commons.math.MathException("hi!", objArray19, throwable20);
        org.apache.commons.math.FunctionEvaluationException functionEvaluationException22 = new org.apache.commons.math.FunctionEvaluationException((double) 100.0f, throwable20);
        org.apache.commons.math.FunctionEvaluationException functionEvaluationException23 = new org.apache.commons.math.FunctionEvaluationException((double) 1.0f, "", objArray13, throwable20);
        java.lang.Object[] objArray24 = functionEvaluationException23.getArguments();
        java.lang.Object[] objArray25 = functionEvaluationException23.getArguments();
        java.lang.String str26 = functionEvaluationException23.getPattern();
        org.apache.commons.math.FunctionEvaluationException functionEvaluationException27 = new org.apache.commons.math.FunctionEvaluationException((double) 100.0f, "org.apache.commons.math.FunctionEvaluationException: org.apache.commons.math.ConvergenceException: hi!", (java.lang.Throwable) functionEvaluationException23);
        org.apache.commons.math.ConvergenceException convergenceException28 = new org.apache.commons.math.ConvergenceException("org.apache.commons.math.FunctionEvaluationException: org.apache.commons.math.MathException: org.apache.commons.math.ode.DerivativeException: hi!", objArray6, (java.lang.Throwable) functionEvaluationException27);
        java.lang.String[] strArray45 = new java.lang.String[] { "", "hi!", "hi!" };
        org.apache.commons.math.ode.DerivativeException derivativeException46 = new org.apache.commons.math.ode.DerivativeException("", strArray45);
        org.apache.commons.math.ode.DerivativeException derivativeException47 = new org.apache.commons.math.ode.DerivativeException("hi!", strArray45);
        org.apache.commons.math.ode.DerivativeException derivativeException48 = new org.apache.commons.math.ode.DerivativeException("org.apache.commons.math.ConvergenceException: hi!", strArray45);
        java.lang.Object[] objArray53 = new java.lang.Object[] { (-1.0d) };
        java.lang.Throwable throwable54 = null;
        org.apache.commons.math.MathException mathException55 = new org.apache.commons.math.MathException("hi!", objArray53, throwable54);
        org.apache.commons.math.MathException mathException56 = new org.apache.commons.math.MathException("", objArray53);
        java.lang.Object[] objArray59 = new java.lang.Object[] { (-1.0d) };
        java.lang.Throwable throwable60 = null;
        org.apache.commons.math.MathException mathException61 = new org.apache.commons.math.MathException("hi!", objArray59, throwable60);
        java.lang.Object[] objArray62 = mathException61.getArguments();
        java.lang.Object[] objArray64 = new java.lang.Object[] { mathException56, objArray62, 10.0f };
        org.apache.commons.math.MathException mathException65 = new org.apache.commons.math.MathException("hi!", objArray62);
        org.apache.commons.math.ode.DerivativeException derivativeException66 = new org.apache.commons.math.ode.DerivativeException((java.lang.Throwable) mathException65);
        org.apache.commons.math.ConvergenceException convergenceException67 = new org.apache.commons.math.ConvergenceException("org.apache.commons.math.ConvergenceException: hi!", (java.lang.Object[]) strArray45, (java.lang.Throwable) mathException65);
        org.apache.commons.math.ode.DerivativeException derivativeException68 = new org.apache.commons.math.ode.DerivativeException("org.apache.commons.math.FunctionEvaluationException: org.apache.commons.math.ConvergenceException: hi!", strArray45);
        org.apache.commons.math.MaxIterationsExceededException maxIterationsExceededException69 = new org.apache.commons.math.MaxIterationsExceededException((int) '#', "", (java.lang.Object[]) strArray45);
        org.apache.commons.math.ode.DerivativeException derivativeException70 = new org.apache.commons.math.ode.DerivativeException("org.apache.commons.math.ConvergenceException: ", strArray45);
        java.lang.Throwable throwable72 = null;
        org.apache.commons.math.ConvergenceException convergenceException73 = new org.apache.commons.math.ConvergenceException("org.apache.commons.math.ConvergenceException: org.apache.commons.math.ConvergenceException: ", throwable72);
        org.apache.commons.math.ConvergenceException convergenceException74 = new org.apache.commons.math.ConvergenceException("org.apache.commons.math.MaxIterationsExceededException: org.apache.commons.math.MathException: org.apache.commons.math.ode.DerivativeException: ", (java.lang.Object[]) strArray45, throwable72);
        org.apache.commons.math.ode.DerivativeException derivativeException75 = new org.apache.commons.math.ode.DerivativeException("org.apache.commons.math.MathException: org.apache.commons.math.ConvergenceException: hi!", strArray45);
        org.apache.commons.math.ode.DerivativeException derivativeException76 = new org.apache.commons.math.ode.DerivativeException("org.apache.commons.math.ConvergenceException: org.apache.commons.math.ConvergenceException: org.apache.commons.math.ConvergenceException: org.apache.commons.math.ConvergenceException: ", strArray45);
        org.apache.commons.math.ConvergenceException convergenceException77 = new org.apache.commons.math.ConvergenceException("org.apache.commons.math.MathException: ", (java.lang.Object[]) strArray45);
        org.apache.commons.math.ode.DerivativeException derivativeException78 = new org.apache.commons.math.ode.DerivativeException("org.apache.commons.math.ode.DerivativeException: org.apache.commons.math.ConvergenceException: org.apache.commons.math.FunctionEvaluationException: org.apache.commons.math.ConvergenceException: org.apache.commons.math.ConvergenceException: ", strArray45);
        org.apache.commons.math.MathException mathException79 = new org.apache.commons.math.MathException("org.apache.commons.math.MaxIterationsExceededException: org.apache.commons.math.ode.DerivativeException: ", objArray6, (java.lang.Throwable) derivativeException78);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + (-1) + "'", int5 == (-1));
        org.junit.Assert.assertNotNull(objArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray6), "[-1]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray6), "[-1]");
        org.junit.Assert.assertNotNull(objArray13);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray13), "[-1.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray13), "[-1.0]");
        org.junit.Assert.assertNotNull(objArray19);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray19), "[-1.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray19), "[-1.0]");
        org.junit.Assert.assertNotNull(objArray24);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray24), "[-1.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray24), "[-1.0]");
        org.junit.Assert.assertNotNull(objArray25);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray25), "[-1.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray25), "[-1.0]");
        org.junit.Assert.assertEquals("'" + str26 + "' != '" + "" + "'", str26, "");
        org.junit.Assert.assertNotNull(strArray45);
        org.junit.Assert.assertNotNull(objArray53);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray53), "[-1.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray53), "[-1.0]");
        org.junit.Assert.assertNotNull(objArray59);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray59), "[-1.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray59), "[-1.0]");
        org.junit.Assert.assertNotNull(objArray62);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray62), "[-1.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray62), "[-1.0]");
        org.junit.Assert.assertNotNull(objArray64);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray64), "[org.apache.commons.math.MathException: , [-1.0], 10.0]");
    }

    @Test
    public void test14031() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest28.test14031");
        java.lang.Object[] objArray10 = new java.lang.Object[] { (-1.0d) };
        java.lang.Throwable throwable11 = null;
        org.apache.commons.math.MathException mathException12 = new org.apache.commons.math.MathException("hi!", objArray10, throwable11);
        org.apache.commons.math.MathException mathException13 = new org.apache.commons.math.MathException("", objArray10);
        java.lang.Object[] objArray16 = new java.lang.Object[] { (-1.0d) };
        java.lang.Throwable throwable17 = null;
        org.apache.commons.math.MathException mathException18 = new org.apache.commons.math.MathException("hi!", objArray16, throwable17);
        java.lang.Object[] objArray19 = mathException18.getArguments();
        java.lang.Object[] objArray21 = new java.lang.Object[] { mathException13, objArray19, 10.0f };
        org.apache.commons.math.MathException mathException22 = new org.apache.commons.math.MathException("hi!", objArray19);
        org.apache.commons.math.MaxIterationsExceededException maxIterationsExceededException23 = new org.apache.commons.math.MaxIterationsExceededException((int) (short) 1, "hi!", objArray19);
        java.lang.Object[] objArray30 = new java.lang.Object[] { (-1.0d) };
        java.lang.Throwable throwable31 = null;
        org.apache.commons.math.MathException mathException32 = new org.apache.commons.math.MathException("hi!", objArray30, throwable31);
        java.lang.Object[] objArray36 = new java.lang.Object[] { (-1.0d) };
        java.lang.Throwable throwable37 = null;
        org.apache.commons.math.MathException mathException38 = new org.apache.commons.math.MathException("hi!", objArray36, throwable37);
        org.apache.commons.math.FunctionEvaluationException functionEvaluationException39 = new org.apache.commons.math.FunctionEvaluationException((double) 100.0f, throwable37);
        org.apache.commons.math.FunctionEvaluationException functionEvaluationException40 = new org.apache.commons.math.FunctionEvaluationException((double) 1.0f, "", objArray30, throwable37);
        java.lang.Object[] objArray41 = functionEvaluationException40.getArguments();
        org.apache.commons.math.MathException mathException42 = new org.apache.commons.math.MathException("hi!", (java.lang.Throwable) functionEvaluationException40);
        org.apache.commons.math.MathException mathException43 = new org.apache.commons.math.MathException("hi!", (java.lang.Throwable) functionEvaluationException40);
        java.lang.String str44 = mathException43.getPattern();
        org.apache.commons.math.ode.DerivativeException derivativeException45 = new org.apache.commons.math.ode.DerivativeException((java.lang.Throwable) mathException43);
        org.apache.commons.math.FunctionEvaluationException functionEvaluationException46 = new org.apache.commons.math.FunctionEvaluationException((double) 1.0f, "org.apache.commons.math.ConvergenceException: hi!", objArray19, (java.lang.Throwable) derivativeException45);
        java.lang.Object[] objArray47 = derivativeException45.getArguments();
        org.apache.commons.math.ConvergenceException convergenceException48 = new org.apache.commons.math.ConvergenceException("org.apache.commons.math.FunctionEvaluationException: ", (java.lang.Throwable) derivativeException45);
        org.apache.commons.math.ConvergenceException convergenceException49 = new org.apache.commons.math.ConvergenceException((java.lang.Throwable) derivativeException45);
        org.apache.commons.math.MathException mathException50 = new org.apache.commons.math.MathException("org.apache.commons.math.FunctionEvaluationException: org.apache.commons.math.ConvergenceException: org.apache.commons.math.ConvergenceException: ", (java.lang.Throwable) convergenceException49);
        org.apache.commons.math.MathException mathException51 = new org.apache.commons.math.MathException((java.lang.Throwable) mathException50);
        java.lang.String str52 = mathException51.getPattern();
        org.apache.commons.math.MathException mathException53 = new org.apache.commons.math.MathException((java.lang.Throwable) mathException51);
        org.junit.Assert.assertNotNull(objArray10);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray10), "[-1.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray10), "[-1.0]");
        org.junit.Assert.assertNotNull(objArray16);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray16), "[-1.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray16), "[-1.0]");
        org.junit.Assert.assertNotNull(objArray19);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray19), "[-1.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray19), "[-1.0]");
        org.junit.Assert.assertNotNull(objArray21);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray21), "[org.apache.commons.math.MathException: , [-1.0], 10.0]");
        org.junit.Assert.assertNotNull(objArray30);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray30), "[-1.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray30), "[-1.0]");
        org.junit.Assert.assertNotNull(objArray36);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray36), "[-1.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray36), "[-1.0]");
        org.junit.Assert.assertNotNull(objArray41);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray41), "[-1.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray41), "[-1.0]");
        org.junit.Assert.assertEquals("'" + str44 + "' != '" + "hi!" + "'", str44, "hi!");
        org.junit.Assert.assertNotNull(objArray47);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray47), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray47), "[]");
        org.junit.Assert.assertEquals("'" + str52 + "' != '" + "org.apache.commons.math.FunctionEvaluationException: org.apache.commons.math.ConvergenceException: org.apache.commons.math.ConvergenceException: " + "'", str52, "org.apache.commons.math.FunctionEvaluationException: org.apache.commons.math.ConvergenceException: org.apache.commons.math.ConvergenceException: ");
    }

    @Test
    public void test14032() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest28.test14032");
        org.apache.commons.math.FunctionEvaluationException functionEvaluationException4 = new org.apache.commons.math.FunctionEvaluationException((double) (-1.0f), "org.apache.commons.math.FunctionEvaluationException: org.apache.commons.math.FunctionEvaluationException: Evaluation failed for argument = 100");
        double double5 = functionEvaluationException4.getArgument();
        java.lang.Throwable[] throwableArray6 = functionEvaluationException4.getSuppressed();
        org.apache.commons.math.FunctionEvaluationException functionEvaluationException10 = new org.apache.commons.math.FunctionEvaluationException((double) 100.0f);
        org.apache.commons.math.FunctionEvaluationException functionEvaluationException11 = new org.apache.commons.math.FunctionEvaluationException((double) 0.0f, "org.apache.commons.math.ConvergenceException: org.apache.commons.math.ConvergenceException: org.apache.commons.math.ConvergenceException: ", (java.lang.Throwable) functionEvaluationException10);
        org.apache.commons.math.ConvergenceException convergenceException12 = new org.apache.commons.math.ConvergenceException((java.lang.Throwable) functionEvaluationException10);
        org.apache.commons.math.MathException mathException13 = new org.apache.commons.math.MathException((java.lang.Throwable) functionEvaluationException10);
        org.apache.commons.math.FunctionEvaluationException functionEvaluationException14 = new org.apache.commons.math.FunctionEvaluationException((double) 1.0f, "org.apache.commons.math.MaxIterationsExceededException: org.apache.commons.math.ConvergenceException: org.apache.commons.math.ConvergenceException: org.apache.commons.math.ConvergenceException: hi!", (java.lang.Object[]) throwableArray6, (java.lang.Throwable) functionEvaluationException10);
        java.lang.String str15 = functionEvaluationException14.toString();
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + (-1.0d) + "'", double5 == (-1.0d));
        org.junit.Assert.assertNotNull(throwableArray6);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "org.apache.commons.math.FunctionEvaluationException: org.apache.commons.math.MaxIterationsExceededException: org.apache.commons.math.ConvergenceException: org.apache.commons.math.ConvergenceException: org.apache.commons.math.ConvergenceException: hi!" + "'", str15, "org.apache.commons.math.FunctionEvaluationException: org.apache.commons.math.MaxIterationsExceededException: org.apache.commons.math.ConvergenceException: org.apache.commons.math.ConvergenceException: org.apache.commons.math.ConvergenceException: hi!");
    }

    @Test
    public void test14033() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest28.test14033");
        java.lang.Object[] objArray13 = new java.lang.Object[] { (-1.0d) };
        java.lang.Throwable throwable14 = null;
        org.apache.commons.math.MathException mathException15 = new org.apache.commons.math.MathException("hi!", objArray13, throwable14);
        org.apache.commons.math.MathException mathException16 = new org.apache.commons.math.MathException("", objArray13);
        java.lang.Throwable throwable17 = null;
        org.apache.commons.math.FunctionEvaluationException functionEvaluationException18 = new org.apache.commons.math.FunctionEvaluationException((double) 100L, "hi!", objArray13, throwable17);
        org.apache.commons.math.MathException mathException19 = new org.apache.commons.math.MathException("org.apache.commons.math.ConvergenceException: hi!", objArray13);
        org.apache.commons.math.MaxIterationsExceededException maxIterationsExceededException20 = new org.apache.commons.math.MaxIterationsExceededException(2, "org.apache.commons.math.ConvergenceException: hi!", objArray13);
        org.apache.commons.math.ConvergenceException convergenceException21 = new org.apache.commons.math.ConvergenceException("", objArray13);
        org.apache.commons.math.FunctionEvaluationException functionEvaluationException22 = new org.apache.commons.math.FunctionEvaluationException(1.0d, "org.apache.commons.math.FunctionEvaluationException: hi!", objArray13);
        org.apache.commons.math.ConvergenceException convergenceException23 = new org.apache.commons.math.ConvergenceException("org.apache.commons.math.MathException: Evaluation failed for argument = 100", (java.lang.Throwable) functionEvaluationException22);
        org.apache.commons.math.ConvergenceException convergenceException24 = new org.apache.commons.math.ConvergenceException((java.lang.Throwable) functionEvaluationException22);
        double double25 = functionEvaluationException22.getArgument();
        java.lang.Throwable[] throwableArray26 = functionEvaluationException22.getSuppressed();
        org.apache.commons.math.FunctionEvaluationException functionEvaluationException27 = new org.apache.commons.math.FunctionEvaluationException((double) 0, (java.lang.Throwable) functionEvaluationException22);
        org.junit.Assert.assertNotNull(objArray13);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray13), "[-1.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray13), "[-1.0]");
        org.junit.Assert.assertTrue("'" + double25 + "' != '" + 1.0d + "'", double25 == 1.0d);
        org.junit.Assert.assertNotNull(throwableArray26);
    }

    @Test
    public void test14034() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest28.test14034");
        java.lang.Object[] objArray12 = new java.lang.Object[] { (-1.0d) };
        java.lang.Throwable throwable13 = null;
        org.apache.commons.math.MathException mathException14 = new org.apache.commons.math.MathException("hi!", objArray12, throwable13);
        org.apache.commons.math.MathException mathException15 = new org.apache.commons.math.MathException("", objArray12);
        java.lang.Throwable throwable16 = null;
        org.apache.commons.math.FunctionEvaluationException functionEvaluationException17 = new org.apache.commons.math.FunctionEvaluationException((double) 100L, "hi!", objArray12, throwable16);
        org.apache.commons.math.MathException mathException18 = new org.apache.commons.math.MathException("org.apache.commons.math.ConvergenceException: hi!", objArray12);
        org.apache.commons.math.FunctionEvaluationException functionEvaluationException19 = new org.apache.commons.math.FunctionEvaluationException((double) 10L, "hi!", objArray12);
        java.lang.Throwable[] throwableArray20 = functionEvaluationException19.getSuppressed();
        org.apache.commons.math.FunctionEvaluationException functionEvaluationException23 = new org.apache.commons.math.FunctionEvaluationException((double) (-1), "org.apache.commons.math.FunctionEvaluationException: ");
        java.lang.Throwable[] throwableArray24 = functionEvaluationException23.getSuppressed();
        org.apache.commons.math.MathException mathException25 = new org.apache.commons.math.MathException("org.apache.commons.math.MathException: hi!", (java.lang.Object[]) throwableArray20, (java.lang.Throwable) functionEvaluationException23);
        double double26 = functionEvaluationException23.getArgument();
        java.lang.Object[] objArray27 = functionEvaluationException23.getArguments();
        java.lang.Object[] objArray34 = new java.lang.Object[] { (-1.0d) };
        java.lang.Throwable throwable35 = null;
        org.apache.commons.math.MathException mathException36 = new org.apache.commons.math.MathException("hi!", objArray34, throwable35);
        org.apache.commons.math.MathException mathException37 = new org.apache.commons.math.MathException("", objArray34);
        java.lang.Object[] objArray40 = new java.lang.Object[] { (-1.0d) };
        java.lang.Throwable throwable41 = null;
        org.apache.commons.math.MathException mathException42 = new org.apache.commons.math.MathException("hi!", objArray40, throwable41);
        java.lang.Object[] objArray43 = mathException42.getArguments();
        java.lang.Object[] objArray45 = new java.lang.Object[] { mathException37, objArray43, 10.0f };
        org.apache.commons.math.MathException mathException46 = new org.apache.commons.math.MathException("hi!", objArray43);
        org.apache.commons.math.ode.DerivativeException derivativeException47 = new org.apache.commons.math.ode.DerivativeException((java.lang.Throwable) mathException46);
        org.apache.commons.math.ConvergenceException convergenceException48 = new org.apache.commons.math.ConvergenceException("org.apache.commons.math.ConvergenceException: ", (java.lang.Throwable) derivativeException47);
        org.apache.commons.math.FunctionEvaluationException functionEvaluationException49 = new org.apache.commons.math.FunctionEvaluationException(0.0d, (java.lang.Throwable) convergenceException48);
        java.lang.Throwable[] throwableArray50 = functionEvaluationException49.getSuppressed();
        org.apache.commons.math.FunctionEvaluationException functionEvaluationException51 = new org.apache.commons.math.FunctionEvaluationException(2.0d, "org.apache.commons.math.FunctionEvaluationException: org.apache.commons.math.ConvergenceException: org.apache.commons.math.ode.DerivativeException: hi!", objArray27, (java.lang.Throwable) functionEvaluationException49);
        org.apache.commons.math.ConvergenceException convergenceException52 = new org.apache.commons.math.ConvergenceException("org.apache.commons.math.FunctionEvaluationException: org.apache.commons.math.FunctionEvaluationException: org.apache.commons.math.ConvergenceException: Convergence failed", objArray27);
        org.junit.Assert.assertNotNull(objArray12);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray12), "[-1.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray12), "[-1.0]");
        org.junit.Assert.assertNotNull(throwableArray20);
        org.junit.Assert.assertNotNull(throwableArray24);
        org.junit.Assert.assertTrue("'" + double26 + "' != '" + (-1.0d) + "'", double26 == (-1.0d));
        org.junit.Assert.assertNotNull(objArray27);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray27), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray27), "[]");
        org.junit.Assert.assertNotNull(objArray34);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray34), "[-1.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray34), "[-1.0]");
        org.junit.Assert.assertNotNull(objArray40);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray40), "[-1.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray40), "[-1.0]");
        org.junit.Assert.assertNotNull(objArray43);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray43), "[-1.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray43), "[-1.0]");
        org.junit.Assert.assertNotNull(objArray45);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray45), "[org.apache.commons.math.MathException: , [-1.0], 10.0]");
        org.junit.Assert.assertNotNull(throwableArray50);
    }

    @Test
    public void test14035() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest28.test14035");
        java.lang.String[] strArray12 = new java.lang.String[] { "", "hi!", "hi!" };
        org.apache.commons.math.ode.DerivativeException derivativeException13 = new org.apache.commons.math.ode.DerivativeException("", strArray12);
        org.apache.commons.math.ode.DerivativeException derivativeException14 = new org.apache.commons.math.ode.DerivativeException("", strArray12);
        java.lang.Object[] objArray21 = new java.lang.Object[] { (-1.0d) };
        java.lang.Throwable throwable22 = null;
        org.apache.commons.math.MathException mathException23 = new org.apache.commons.math.MathException("hi!", objArray21, throwable22);
        org.apache.commons.math.MathException mathException24 = new org.apache.commons.math.MathException("", objArray21);
        java.lang.Object[] objArray27 = new java.lang.Object[] { (-1.0d) };
        java.lang.Throwable throwable28 = null;
        org.apache.commons.math.MathException mathException29 = new org.apache.commons.math.MathException("hi!", objArray27, throwable28);
        java.lang.Object[] objArray30 = mathException29.getArguments();
        java.lang.Object[] objArray32 = new java.lang.Object[] { mathException24, objArray30, 10.0f };
        org.apache.commons.math.MathException mathException33 = new org.apache.commons.math.MathException("hi!", objArray30);
        org.apache.commons.math.MaxIterationsExceededException maxIterationsExceededException34 = new org.apache.commons.math.MaxIterationsExceededException((int) (short) 1, "hi!", objArray30);
        int int35 = maxIterationsExceededException34.getMaxIterations();
        org.apache.commons.math.ConvergenceException convergenceException36 = new org.apache.commons.math.ConvergenceException("", (java.lang.Object[]) strArray12, (java.lang.Throwable) maxIterationsExceededException34);
        org.apache.commons.math.MathException mathException38 = new org.apache.commons.math.MathException("org.apache.commons.math.FunctionEvaluationException: ");
        org.apache.commons.math.ConvergenceException convergenceException39 = new org.apache.commons.math.ConvergenceException("org.apache.commons.math.ConvergenceException: ", (java.lang.Object[]) strArray12, (java.lang.Throwable) mathException38);
        java.lang.Object[] objArray46 = new java.lang.Object[] { (-1.0d) };
        java.lang.Throwable throwable47 = null;
        org.apache.commons.math.MathException mathException48 = new org.apache.commons.math.MathException("hi!", objArray46, throwable47);
        java.lang.Object[] objArray52 = new java.lang.Object[] { (-1.0d) };
        java.lang.Throwable throwable53 = null;
        org.apache.commons.math.MathException mathException54 = new org.apache.commons.math.MathException("hi!", objArray52, throwable53);
        org.apache.commons.math.FunctionEvaluationException functionEvaluationException55 = new org.apache.commons.math.FunctionEvaluationException((double) 100.0f, throwable53);
        org.apache.commons.math.FunctionEvaluationException functionEvaluationException56 = new org.apache.commons.math.FunctionEvaluationException((double) 1.0f, "", objArray46, throwable53);
        java.lang.Object[] objArray57 = functionEvaluationException56.getArguments();
        org.apache.commons.math.MathException mathException58 = new org.apache.commons.math.MathException("hi!", (java.lang.Throwable) functionEvaluationException56);
        org.apache.commons.math.MathException mathException59 = new org.apache.commons.math.MathException("hi!", (java.lang.Throwable) functionEvaluationException56);
        java.lang.String str60 = mathException59.getPattern();
        org.apache.commons.math.ode.DerivativeException derivativeException61 = new org.apache.commons.math.ode.DerivativeException((java.lang.Throwable) mathException59);
        java.lang.Throwable[] throwableArray62 = mathException59.getSuppressed();
        org.apache.commons.math.MathException mathException63 = new org.apache.commons.math.MathException("org.apache.commons.math.FunctionEvaluationException: org.apache.commons.math.FunctionEvaluationException: org.apache.commons.math.ConvergenceException: hi!", (java.lang.Object[]) strArray12, (java.lang.Throwable) mathException59);
        org.apache.commons.math.FunctionEvaluationException functionEvaluationException64 = new org.apache.commons.math.FunctionEvaluationException((double) 0.0f, "Maximal number of iterations (-1) exceeded", (java.lang.Object[]) strArray12);
        java.lang.Throwable[] throwableArray65 = functionEvaluationException64.getSuppressed();
        org.apache.commons.math.FunctionEvaluationException functionEvaluationException66 = new org.apache.commons.math.FunctionEvaluationException((double) (-1L), "org.apache.commons.math.MathException: org.apache.commons.math.MathException: Maximal number of iterations ({0}) exceeded", (java.lang.Object[]) throwableArray65);
        java.lang.String[] strArray80 = new java.lang.String[] { "", "org.apache.commons.math.FunctionEvaluationException: org.apache.commons.math.ConvergenceException: hi!", "org.apache.commons.math.ConvergenceException: hi!", "hi!", "org.apache.commons.math.FunctionEvaluationException: ", "" };
        org.apache.commons.math.ode.DerivativeException derivativeException81 = new org.apache.commons.math.ode.DerivativeException("org.apache.commons.math.FunctionEvaluationException: org.apache.commons.math.ConvergenceException: hi!", strArray80);
        org.apache.commons.math.FunctionEvaluationException functionEvaluationException82 = new org.apache.commons.math.FunctionEvaluationException(10.0d, "org.apache.commons.math.ConvergenceException: Convergence failed", (java.lang.Object[]) strArray80);
        org.apache.commons.math.ode.DerivativeException derivativeException83 = new org.apache.commons.math.ode.DerivativeException("org.apache.commons.math.FunctionEvaluationException: org.apache.commons.math.ode.DerivativeException: ", strArray80);
        org.apache.commons.math.ode.DerivativeException derivativeException84 = new org.apache.commons.math.ode.DerivativeException("org.apache.commons.math.MathException: ", strArray80);
        org.apache.commons.math.ode.DerivativeException derivativeException85 = new org.apache.commons.math.ode.DerivativeException("", strArray80);
        org.apache.commons.math.ConvergenceException convergenceException86 = new org.apache.commons.math.ConvergenceException("org.apache.commons.math.ConvergenceException: org.apache.commons.math.ConvergenceException: org.apache.commons.math.FunctionEvaluationException: org.apache.commons.math.ConvergenceException: hi!", (java.lang.Throwable) derivativeException85);
        functionEvaluationException66.addSuppressed((java.lang.Throwable) convergenceException86);
        java.lang.Object[] objArray88 = functionEvaluationException66.getArguments();
        java.lang.Class<?> wildcardClass89 = functionEvaluationException66.getClass();
        org.junit.Assert.assertNotNull(strArray12);
        org.junit.Assert.assertNotNull(objArray21);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray21), "[-1.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray21), "[-1.0]");
        org.junit.Assert.assertNotNull(objArray27);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray27), "[-1.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray27), "[-1.0]");
        org.junit.Assert.assertNotNull(objArray30);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray30), "[-1.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray30), "[-1.0]");
        org.junit.Assert.assertNotNull(objArray32);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray32), "[org.apache.commons.math.MathException: , [-1.0], 10.0]");
        org.junit.Assert.assertTrue("'" + int35 + "' != '" + 1 + "'", int35 == 1);
        org.junit.Assert.assertNotNull(objArray46);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray46), "[-1.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray46), "[-1.0]");
        org.junit.Assert.assertNotNull(objArray52);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray52), "[-1.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray52), "[-1.0]");
        org.junit.Assert.assertNotNull(objArray57);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray57), "[-1.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray57), "[-1.0]");
        org.junit.Assert.assertEquals("'" + str60 + "' != '" + "hi!" + "'", str60, "hi!");
        org.junit.Assert.assertNotNull(throwableArray62);
        org.junit.Assert.assertNotNull(throwableArray65);
        org.junit.Assert.assertNotNull(strArray80);
        org.junit.Assert.assertNotNull(objArray88);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray88), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray88), "[]");
        org.junit.Assert.assertNotNull(wildcardClass89);
    }
}

