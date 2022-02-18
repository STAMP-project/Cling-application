import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class RegressionTest33 {

    public static boolean debug = false;

    @Test
    public void test16501() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest33.test16501");
        java.lang.String[] strArray19 = new java.lang.String[] { "hi!", "", "hi!", "hi!", "hi!" };
        org.apache.commons.math.ode.DerivativeException derivativeException20 = new org.apache.commons.math.ode.DerivativeException("", strArray19);
        org.apache.commons.math.ode.DerivativeException derivativeException21 = new org.apache.commons.math.ode.DerivativeException("", strArray19);
        org.apache.commons.math.ConvergenceException convergenceException22 = new org.apache.commons.math.ConvergenceException("org.apache.commons.math.FunctionEvaluationException: hi!", (java.lang.Object[]) strArray19);
        org.apache.commons.math.ConvergenceException convergenceException23 = new org.apache.commons.math.ConvergenceException("", (java.lang.Object[]) strArray19);
        org.apache.commons.math.FunctionEvaluationException functionEvaluationException24 = new org.apache.commons.math.FunctionEvaluationException((double) (-1L), "org.apache.commons.math.ConvergenceException: org.apache.commons.math.FunctionEvaluationException: hi!", (java.lang.Object[]) strArray19);
        org.apache.commons.math.MaxIterationsExceededException maxIterationsExceededException25 = new org.apache.commons.math.MaxIterationsExceededException((int) (byte) 1, "org.apache.commons.math.FunctionEvaluationException: ", (java.lang.Object[]) strArray19);
        java.lang.String[] strArray36 = new java.lang.String[] { "hi!", "", "hi!", "hi!", "hi!" };
        org.apache.commons.math.ode.DerivativeException derivativeException37 = new org.apache.commons.math.ode.DerivativeException("", strArray36);
        org.apache.commons.math.ode.DerivativeException derivativeException38 = new org.apache.commons.math.ode.DerivativeException("", strArray36);
        java.lang.Throwable throwable41 = null;
        org.apache.commons.math.ConvergenceException convergenceException42 = new org.apache.commons.math.ConvergenceException("hi!", throwable41);
        org.apache.commons.math.ode.DerivativeException derivativeException43 = new org.apache.commons.math.ode.DerivativeException((java.lang.Throwable) convergenceException42);
        java.lang.Throwable[] throwableArray44 = derivativeException43.getSuppressed();
        org.apache.commons.math.ConvergenceException convergenceException45 = new org.apache.commons.math.ConvergenceException("hi!", (java.lang.Throwable) derivativeException43);
        derivativeException38.addSuppressed((java.lang.Throwable) convergenceException45);
        org.apache.commons.math.FunctionEvaluationException functionEvaluationException47 = new org.apache.commons.math.FunctionEvaluationException((double) (short) 100, "org.apache.commons.math.ConvergenceException: hi!", (java.lang.Throwable) convergenceException45);
        org.apache.commons.math.FunctionEvaluationException functionEvaluationException48 = new org.apache.commons.math.FunctionEvaluationException((double) 1, (java.lang.Throwable) convergenceException45);
        org.apache.commons.math.FunctionEvaluationException functionEvaluationException49 = new org.apache.commons.math.FunctionEvaluationException(1.0d, "", (java.lang.Object[]) strArray19, (java.lang.Throwable) convergenceException45);
        org.apache.commons.math.MaxIterationsExceededException maxIterationsExceededException50 = new org.apache.commons.math.MaxIterationsExceededException((int) (short) -1, "org.apache.commons.math.MaxIterationsExceededException: Evaluation failed for argument = {0}", (java.lang.Object[]) strArray19);
        org.apache.commons.math.ode.DerivativeException derivativeException51 = new org.apache.commons.math.ode.DerivativeException("org.apache.commons.math.MaxIterationsExceededException: org.apache.commons.math.ode.DerivativeException: org.apache.commons.math.ConvergenceException: ", strArray19);
        org.apache.commons.math.ode.DerivativeException derivativeException52 = new org.apache.commons.math.ode.DerivativeException("org.apache.commons.math.FunctionEvaluationException: org.apache.commons.math.ConvergenceException: Evaluation failed for argument = 0", strArray19);
        org.junit.Assert.assertNotNull(strArray19);
        org.junit.Assert.assertNotNull(strArray36);
        org.junit.Assert.assertNotNull(throwableArray44);
    }

    @Test
    public void test16502() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest33.test16502");
        java.lang.Object[] objArray1 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math.ConvergenceException convergenceException2 = new org.apache.commons.math.ConvergenceException("org.apache.commons.math.ode.DerivativeException: hi!", objArray1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test16503() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest33.test16503");
        java.lang.String[] strArray11 = new java.lang.String[] { "org.apache.commons.math.FunctionEvaluationException: hi!", "org.apache.commons.math.FunctionEvaluationException: hi!", "org.apache.commons.math.ode.DerivativeException: ", "hi!" };
        org.apache.commons.math.ode.DerivativeException derivativeException12 = new org.apache.commons.math.ode.DerivativeException("org.apache.commons.math.ode.DerivativeException: ", strArray11);
        java.lang.String[] strArray22 = new java.lang.String[] { "hi!", "", "hi!", "hi!", "hi!" };
        org.apache.commons.math.ode.DerivativeException derivativeException23 = new org.apache.commons.math.ode.DerivativeException("", strArray22);
        org.apache.commons.math.ode.DerivativeException derivativeException24 = new org.apache.commons.math.ode.DerivativeException("", strArray22);
        org.apache.commons.math.ConvergenceException convergenceException25 = new org.apache.commons.math.ConvergenceException("org.apache.commons.math.FunctionEvaluationException: hi!", (java.lang.Object[]) strArray22);
        org.apache.commons.math.ConvergenceException convergenceException26 = new org.apache.commons.math.ConvergenceException("", (java.lang.Object[]) strArray22);
        org.apache.commons.math.FunctionEvaluationException functionEvaluationException27 = new org.apache.commons.math.FunctionEvaluationException((double) '#', "org.apache.commons.math.FunctionEvaluationException: Evaluation failed for argument = 0", (java.lang.Object[]) strArray11, (java.lang.Throwable) convergenceException26);
        org.apache.commons.math.ode.DerivativeException derivativeException28 = new org.apache.commons.math.ode.DerivativeException("org.apache.commons.math.ConvergenceException: org.apache.commons.math.FunctionEvaluationException: hi!", strArray11);
        org.apache.commons.math.ConvergenceException convergenceException29 = new org.apache.commons.math.ConvergenceException((java.lang.Throwable) derivativeException28);
        org.apache.commons.math.ConvergenceException convergenceException30 = new org.apache.commons.math.ConvergenceException((java.lang.Throwable) derivativeException28);
        java.lang.Throwable[] throwableArray31 = convergenceException30.getSuppressed();
        java.lang.Throwable throwable35 = null;
        org.apache.commons.math.ConvergenceException convergenceException36 = new org.apache.commons.math.ConvergenceException("hi!", throwable35);
        org.apache.commons.math.ode.DerivativeException derivativeException37 = new org.apache.commons.math.ode.DerivativeException((java.lang.Throwable) convergenceException36);
        java.lang.Object[] objArray38 = derivativeException37.getArguments();
        org.apache.commons.math.ConvergenceException convergenceException39 = new org.apache.commons.math.ConvergenceException("Evaluation failed for argument = 52", objArray38);
        org.apache.commons.math.FunctionEvaluationException functionEvaluationException40 = new org.apache.commons.math.FunctionEvaluationException((double) 32, (java.lang.Throwable) convergenceException39);
        org.apache.commons.math.ConvergenceException convergenceException41 = new org.apache.commons.math.ConvergenceException((java.lang.Throwable) functionEvaluationException40);
        org.apache.commons.math.FunctionEvaluationException functionEvaluationException42 = new org.apache.commons.math.FunctionEvaluationException(32.0d, "org.apache.commons.math.ode.DerivativeException: org.apache.commons.math.MaxIterationsExceededException: org.apache.commons.math.FunctionEvaluationException: Maximal number of iterations (0) exceeded", (java.lang.Object[]) throwableArray31, (java.lang.Throwable) functionEvaluationException40);
        java.lang.Throwable throwable43 = null;
        org.apache.commons.math.ConvergenceException convergenceException44 = new org.apache.commons.math.ConvergenceException("org.apache.commons.math.ConvergenceException: hi!", (java.lang.Object[]) throwableArray31, throwable43);
        java.lang.Throwable[] throwableArray45 = convergenceException44.getSuppressed();
        org.junit.Assert.assertNotNull(strArray11);
        org.junit.Assert.assertNotNull(strArray22);
        org.junit.Assert.assertNotNull(throwableArray31);
        org.junit.Assert.assertNotNull(objArray38);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray38), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray38), "[]");
        org.junit.Assert.assertNotNull(throwableArray45);
    }

    @Test
    public void test16504() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest33.test16504");
        java.lang.String[] strArray15 = new java.lang.String[] { "hi!", "", "hi!", "hi!", "hi!" };
        org.apache.commons.math.ode.DerivativeException derivativeException16 = new org.apache.commons.math.ode.DerivativeException("", strArray15);
        org.apache.commons.math.ode.DerivativeException derivativeException17 = new org.apache.commons.math.ode.DerivativeException("", strArray15);
        java.lang.String[] strArray24 = new java.lang.String[] { "hi!", "", "hi!", "hi!", "hi!" };
        org.apache.commons.math.ode.DerivativeException derivativeException25 = new org.apache.commons.math.ode.DerivativeException("", strArray24);
        org.apache.commons.math.ode.DerivativeException derivativeException26 = new org.apache.commons.math.ode.DerivativeException((java.lang.Throwable) derivativeException25);
        org.apache.commons.math.ConvergenceException convergenceException27 = new org.apache.commons.math.ConvergenceException("hi!", (java.lang.Object[]) strArray15, (java.lang.Throwable) derivativeException25);
        org.apache.commons.math.ode.DerivativeException derivativeException28 = new org.apache.commons.math.ode.DerivativeException("hi!", strArray15);
        org.apache.commons.math.ode.DerivativeException derivativeException29 = new org.apache.commons.math.ode.DerivativeException("org.apache.commons.math.FunctionEvaluationException: Evaluation failed for argument = 52", strArray15);
        java.lang.Throwable[] throwableArray30 = derivativeException29.getSuppressed();
        org.apache.commons.math.FunctionEvaluationException functionEvaluationException31 = new org.apache.commons.math.FunctionEvaluationException((double) 32, "org.apache.commons.math.MaxIterationsExceededException: org.apache.commons.math.ConvergenceException: org.apache.commons.math.ode.DerivativeException: ", (java.lang.Object[]) throwableArray30);
        org.apache.commons.math.ConvergenceException convergenceException32 = new org.apache.commons.math.ConvergenceException("org.apache.commons.math.FunctionEvaluationException: org.apache.commons.math.ode.DerivativeException: org.apache.commons.math.FunctionEvaluationException: Evaluation failed for argument = org.apache.commons.math.FunctionEvaluationException: hi!", (java.lang.Object[]) throwableArray30);
        org.apache.commons.math.FunctionEvaluationException functionEvaluationException33 = new org.apache.commons.math.FunctionEvaluationException((double) '#', "org.apache.commons.math.MaxIterationsExceededException: org.apache.commons.math.ConvergenceException: org.apache.commons.math.ConvergenceException: org.apache.commons.math.MaxIterationsExceededException: Evaluation failed for argument = hi!", (java.lang.Object[]) throwableArray30);
        org.junit.Assert.assertNotNull(strArray15);
        org.junit.Assert.assertNotNull(strArray24);
        org.junit.Assert.assertNotNull(throwableArray30);
    }

    @Test
    public void test16505() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest33.test16505");
        java.lang.String[] strArray12 = new java.lang.String[] { "hi!", "", "hi!", "hi!", "hi!" };
        org.apache.commons.math.ode.DerivativeException derivativeException13 = new org.apache.commons.math.ode.DerivativeException("", strArray12);
        org.apache.commons.math.ode.DerivativeException derivativeException14 = new org.apache.commons.math.ode.DerivativeException("", strArray12);
        java.lang.String[] strArray21 = new java.lang.String[] { "hi!", "", "hi!", "hi!", "hi!" };
        org.apache.commons.math.ode.DerivativeException derivativeException22 = new org.apache.commons.math.ode.DerivativeException("", strArray21);
        org.apache.commons.math.ode.DerivativeException derivativeException23 = new org.apache.commons.math.ode.DerivativeException((java.lang.Throwable) derivativeException22);
        org.apache.commons.math.ConvergenceException convergenceException24 = new org.apache.commons.math.ConvergenceException("hi!", (java.lang.Object[]) strArray12, (java.lang.Throwable) derivativeException22);
        java.lang.Object[] objArray25 = derivativeException22.getArguments();
        org.apache.commons.math.FunctionEvaluationException functionEvaluationException28 = new org.apache.commons.math.FunctionEvaluationException(0.0d, "org.apache.commons.math.ConvergenceException: org.apache.commons.math.FunctionEvaluationException: hi!");
        org.apache.commons.math.FunctionEvaluationException functionEvaluationException29 = new org.apache.commons.math.FunctionEvaluationException(32.0d, "org.apache.commons.math.ConvergenceException: ", objArray25, (java.lang.Throwable) functionEvaluationException28);
        double double30 = functionEvaluationException29.getArgument();
        double double31 = functionEvaluationException29.getArgument();
        double double32 = functionEvaluationException29.getArgument();
        double double33 = functionEvaluationException29.getArgument();
        org.apache.commons.math.FunctionEvaluationException functionEvaluationException34 = new org.apache.commons.math.FunctionEvaluationException((double) 35, "org.apache.commons.math.ConvergenceException: org.apache.commons.math.FunctionEvaluationException: org.apache.commons.math.FunctionEvaluationException: Evaluation failed for argument = hi!", (java.lang.Throwable) functionEvaluationException29);
        org.junit.Assert.assertNotNull(strArray12);
        org.junit.Assert.assertNotNull(strArray21);
        org.junit.Assert.assertNotNull(objArray25);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray25), "[hi!, , hi!, hi!, hi!]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray25), "[hi!, , hi!, hi!, hi!]");
        org.junit.Assert.assertTrue("'" + double30 + "' != '" + 32.0d + "'", double30 == 32.0d);
        org.junit.Assert.assertTrue("'" + double31 + "' != '" + 32.0d + "'", double31 == 32.0d);
        org.junit.Assert.assertTrue("'" + double32 + "' != '" + 32.0d + "'", double32 == 32.0d);
        org.junit.Assert.assertTrue("'" + double33 + "' != '" + 32.0d + "'", double33 == 32.0d);
    }

    @Test
    public void test16506() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest33.test16506");
        java.lang.Object[] objArray15 = new java.lang.Object[] { 1L, (byte) 10, (short) 1 };
        org.apache.commons.math.FunctionEvaluationException functionEvaluationException16 = new org.apache.commons.math.FunctionEvaluationException((-1.0d), "hi!", objArray15);
        org.apache.commons.math.FunctionEvaluationException functionEvaluationException17 = new org.apache.commons.math.FunctionEvaluationException((double) 0L, "", objArray15);
        java.lang.Object[] objArray29 = new java.lang.Object[] { 1L, (byte) 10, (short) 1 };
        org.apache.commons.math.FunctionEvaluationException functionEvaluationException30 = new org.apache.commons.math.FunctionEvaluationException((-1.0d), "hi!", objArray29);
        org.apache.commons.math.FunctionEvaluationException functionEvaluationException31 = new org.apache.commons.math.FunctionEvaluationException((double) 0L, "", objArray29);
        java.lang.Object[] objArray36 = new java.lang.Object[] { "", (short) 1, "org.apache.commons.math.FunctionEvaluationException: hi!", 10.0d, 0.0f };
        java.lang.Throwable throwable38 = null;
        org.apache.commons.math.ConvergenceException convergenceException39 = new org.apache.commons.math.ConvergenceException("hi!", throwable38);
        org.apache.commons.math.ode.DerivativeException derivativeException40 = new org.apache.commons.math.ode.DerivativeException((java.lang.Throwable) convergenceException39);
        java.lang.Throwable[] throwableArray41 = derivativeException40.getSuppressed();
        org.apache.commons.math.FunctionEvaluationException functionEvaluationException42 = new org.apache.commons.math.FunctionEvaluationException((double) 100, "", objArray36, (java.lang.Throwable) derivativeException40);
        java.lang.Object[] objArray54 = new java.lang.Object[] { 1L, (byte) 10, (short) 1 };
        org.apache.commons.math.FunctionEvaluationException functionEvaluationException55 = new org.apache.commons.math.FunctionEvaluationException((-1.0d), "hi!", objArray54);
        org.apache.commons.math.FunctionEvaluationException functionEvaluationException56 = new org.apache.commons.math.FunctionEvaluationException((double) 0L, "", objArray54);
        java.lang.Object[] objArray61 = new java.lang.Object[] { "", (short) 1, "org.apache.commons.math.FunctionEvaluationException: hi!", 10.0d, 0.0f };
        java.lang.Throwable throwable63 = null;
        org.apache.commons.math.ConvergenceException convergenceException64 = new org.apache.commons.math.ConvergenceException("hi!", throwable63);
        org.apache.commons.math.ode.DerivativeException derivativeException65 = new org.apache.commons.math.ode.DerivativeException((java.lang.Throwable) convergenceException64);
        java.lang.Throwable[] throwableArray66 = derivativeException65.getSuppressed();
        org.apache.commons.math.FunctionEvaluationException functionEvaluationException67 = new org.apache.commons.math.FunctionEvaluationException((double) 100, "", objArray61, (java.lang.Throwable) derivativeException65);
        java.lang.Object[] objArray75 = new java.lang.Object[] { 1L, (byte) 10, (short) 1 };
        org.apache.commons.math.FunctionEvaluationException functionEvaluationException76 = new org.apache.commons.math.FunctionEvaluationException((-1.0d), "hi!", objArray75);
        org.apache.commons.math.FunctionEvaluationException functionEvaluationException77 = new org.apache.commons.math.FunctionEvaluationException((double) 0L, "", objArray75);
        org.apache.commons.math.ode.DerivativeException derivativeException78 = new org.apache.commons.math.ode.DerivativeException((java.lang.Throwable) functionEvaluationException77);
        org.apache.commons.math.FunctionEvaluationException functionEvaluationException79 = new org.apache.commons.math.FunctionEvaluationException((double) '#', "hi!", objArray61, (java.lang.Throwable) derivativeException78);
        org.apache.commons.math.FunctionEvaluationException functionEvaluationException80 = new org.apache.commons.math.FunctionEvaluationException((double) (byte) -1, "", objArray36, (java.lang.Throwable) functionEvaluationException79);
        double double81 = functionEvaluationException80.getArgument();
        org.apache.commons.math.FunctionEvaluationException functionEvaluationException82 = new org.apache.commons.math.FunctionEvaluationException((double) 100L, "", objArray15, (java.lang.Throwable) functionEvaluationException80);
        org.apache.commons.math.MaxIterationsExceededException maxIterationsExceededException83 = new org.apache.commons.math.MaxIterationsExceededException(10, "org.apache.commons.math.ConvergenceException: org.apache.commons.math.ConvergenceException: org.apache.commons.math.FunctionEvaluationException: hi!", objArray15);
        org.apache.commons.math.ConvergenceException convergenceException84 = new org.apache.commons.math.ConvergenceException("hi!", (java.lang.Throwable) maxIterationsExceededException83);
        org.apache.commons.math.ode.DerivativeException derivativeException85 = new org.apache.commons.math.ode.DerivativeException((java.lang.Throwable) maxIterationsExceededException83);
        int int86 = maxIterationsExceededException83.getMaxIterations();
        org.apache.commons.math.ConvergenceException convergenceException87 = new org.apache.commons.math.ConvergenceException("org.apache.commons.math.MaxIterationsExceededException: org.apache.commons.math.ode.DerivativeException: ", (java.lang.Throwable) maxIterationsExceededException83);
        java.lang.Throwable[] throwableArray88 = maxIterationsExceededException83.getSuppressed();
        org.apache.commons.math.ConvergenceException convergenceException89 = new org.apache.commons.math.ConvergenceException("org.apache.commons.math.ConvergenceException: org.apache.commons.math.FunctionEvaluationException: ", (java.lang.Throwable) maxIterationsExceededException83);
        org.apache.commons.math.ode.DerivativeException derivativeException90 = new org.apache.commons.math.ode.DerivativeException((java.lang.Throwable) maxIterationsExceededException83);
        java.lang.Object[] objArray91 = derivativeException90.getArguments();
        org.apache.commons.math.ConvergenceException convergenceException92 = new org.apache.commons.math.ConvergenceException("org.apache.commons.math.ConvergenceException: org.apache.commons.math.ConvergenceException: org.apache.commons.math.ConvergenceException: Maximal number of iterations (10) exceeded", objArray91);
        org.junit.Assert.assertNotNull(objArray15);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray15), "[1, 10, 1]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray15), "[1, 10, 1]");
        org.junit.Assert.assertNotNull(objArray29);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray29), "[1, 10, 1]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray29), "[1, 10, 1]");
        org.junit.Assert.assertNotNull(objArray36);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray36), "[, 1, org.apache.commons.math.FunctionEvaluationException: hi!, 10.0, 0.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray36), "[, 1, org.apache.commons.math.FunctionEvaluationException: hi!, 10.0, 0.0]");
        org.junit.Assert.assertNotNull(throwableArray41);
        org.junit.Assert.assertNotNull(objArray54);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray54), "[1, 10, 1]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray54), "[1, 10, 1]");
        org.junit.Assert.assertNotNull(objArray61);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray61), "[, 1, org.apache.commons.math.FunctionEvaluationException: hi!, 10.0, 0.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray61), "[, 1, org.apache.commons.math.FunctionEvaluationException: hi!, 10.0, 0.0]");
        org.junit.Assert.assertNotNull(throwableArray66);
        org.junit.Assert.assertNotNull(objArray75);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray75), "[1, 10, 1]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray75), "[1, 10, 1]");
        org.junit.Assert.assertTrue("'" + double81 + "' != '" + (-1.0d) + "'", double81 == (-1.0d));
        org.junit.Assert.assertTrue("'" + int86 + "' != '" + 10 + "'", int86 == 10);
        org.junit.Assert.assertNotNull(throwableArray88);
        org.junit.Assert.assertNotNull(objArray91);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray91), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray91), "[]");
    }

    @Test
    public void test16507() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest33.test16507");
        java.lang.String[] strArray23 = new java.lang.String[] { "hi!", "", "hi!", "hi!", "hi!" };
        org.apache.commons.math.ode.DerivativeException derivativeException24 = new org.apache.commons.math.ode.DerivativeException("", strArray23);
        org.apache.commons.math.ode.DerivativeException derivativeException25 = new org.apache.commons.math.ode.DerivativeException("", strArray23);
        java.lang.String[] strArray32 = new java.lang.String[] { "hi!", "", "hi!", "hi!", "hi!" };
        org.apache.commons.math.ode.DerivativeException derivativeException33 = new org.apache.commons.math.ode.DerivativeException("", strArray32);
        org.apache.commons.math.ode.DerivativeException derivativeException34 = new org.apache.commons.math.ode.DerivativeException((java.lang.Throwable) derivativeException33);
        org.apache.commons.math.ConvergenceException convergenceException35 = new org.apache.commons.math.ConvergenceException("hi!", (java.lang.Object[]) strArray23, (java.lang.Throwable) derivativeException33);
        org.apache.commons.math.ode.DerivativeException derivativeException36 = new org.apache.commons.math.ode.DerivativeException("hi!", strArray23);
        java.lang.Object[] objArray44 = new java.lang.Object[] { 1L, (byte) 10, (short) 1 };
        org.apache.commons.math.FunctionEvaluationException functionEvaluationException45 = new org.apache.commons.math.FunctionEvaluationException((-1.0d), "hi!", objArray44);
        java.lang.Throwable throwable46 = null;
        org.apache.commons.math.FunctionEvaluationException functionEvaluationException47 = new org.apache.commons.math.FunctionEvaluationException((double) (short) 1, "hi!", objArray44, throwable46);
        org.apache.commons.math.ConvergenceException convergenceException48 = new org.apache.commons.math.ConvergenceException("org.apache.commons.math.FunctionEvaluationException: hi!", (java.lang.Object[]) strArray23, throwable46);
        org.apache.commons.math.FunctionEvaluationException functionEvaluationException49 = new org.apache.commons.math.FunctionEvaluationException((double) 10L, "org.apache.commons.math.ConvergenceException: org.apache.commons.math.FunctionEvaluationException: hi!", (java.lang.Object[]) strArray23);
        org.apache.commons.math.ode.DerivativeException derivativeException50 = new org.apache.commons.math.ode.DerivativeException("org.apache.commons.math.ConvergenceException: org.apache.commons.math.FunctionEvaluationException: hi!", strArray23);
        org.apache.commons.math.MaxIterationsExceededException maxIterationsExceededException51 = new org.apache.commons.math.MaxIterationsExceededException((int) (byte) 1, "org.apache.commons.math.ConvergenceException: org.apache.commons.math.ConvergenceException: org.apache.commons.math.FunctionEvaluationException: hi!", (java.lang.Object[]) strArray23);
        org.apache.commons.math.FunctionEvaluationException functionEvaluationException52 = new org.apache.commons.math.FunctionEvaluationException(1.0d, "Evaluation failed for argument = 100", (java.lang.Object[]) strArray23);
        org.apache.commons.math.MaxIterationsExceededException maxIterationsExceededException53 = new org.apache.commons.math.MaxIterationsExceededException((int) (short) 0, "org.apache.commons.math.ode.DerivativeException: org.apache.commons.math.ConvergenceException: org.apache.commons.math.FunctionEvaluationException: hi!", (java.lang.Object[]) strArray23);
        org.apache.commons.math.MaxIterationsExceededException maxIterationsExceededException61 = new org.apache.commons.math.MaxIterationsExceededException(0);
        java.lang.Throwable[] throwableArray62 = maxIterationsExceededException61.getSuppressed();
        org.apache.commons.math.ConvergenceException convergenceException63 = new org.apache.commons.math.ConvergenceException("org.apache.commons.math.ConvergenceException: org.apache.commons.math.FunctionEvaluationException: hi!", (java.lang.Object[]) throwableArray62);
        org.apache.commons.math.MaxIterationsExceededException maxIterationsExceededException64 = new org.apache.commons.math.MaxIterationsExceededException(2, "Evaluation failed for argument = {0}", (java.lang.Object[]) throwableArray62);
        org.apache.commons.math.FunctionEvaluationException functionEvaluationException65 = new org.apache.commons.math.FunctionEvaluationException((double) (-1L), (java.lang.Throwable) maxIterationsExceededException64);
        java.lang.Object[] objArray66 = maxIterationsExceededException64.getArguments();
        org.apache.commons.math.ConvergenceException convergenceException68 = new org.apache.commons.math.ConvergenceException("org.apache.commons.math.ConvergenceException: hi!");
        org.apache.commons.math.FunctionEvaluationException functionEvaluationException69 = new org.apache.commons.math.FunctionEvaluationException((double) 0.0f, "org.apache.commons.math.ode.DerivativeException: org.apache.commons.math.ConvergenceException: hi!", objArray66, (java.lang.Throwable) convergenceException68);
        double double70 = functionEvaluationException69.getArgument();
        org.apache.commons.math.FunctionEvaluationException functionEvaluationException71 = new org.apache.commons.math.FunctionEvaluationException((double) ' ', "org.apache.commons.math.MaxIterationsExceededException: org.apache.commons.math.ConvergenceException: org.apache.commons.math.FunctionEvaluationException: Evaluation failed for argument = 0", (java.lang.Object[]) strArray23, (java.lang.Throwable) functionEvaluationException69);
        org.apache.commons.math.ode.DerivativeException derivativeException72 = new org.apache.commons.math.ode.DerivativeException("org.apache.commons.math.ode.DerivativeException: org.apache.commons.math.ode.DerivativeException: org.apache.commons.math.ConvergenceException: org.apache.commons.math.ode.DerivativeException: ", strArray23);
        org.apache.commons.math.ode.DerivativeException derivativeException73 = new org.apache.commons.math.ode.DerivativeException("org.apache.commons.math.FunctionEvaluationException: Evaluation failed for argument = {0}", strArray23);
        org.junit.Assert.assertNotNull(strArray23);
        org.junit.Assert.assertNotNull(strArray32);
        org.junit.Assert.assertNotNull(objArray44);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray44), "[1, 10, 1]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray44), "[1, 10, 1]");
        org.junit.Assert.assertNotNull(throwableArray62);
        org.junit.Assert.assertNotNull(objArray66);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray66), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray66), "[]");
        org.junit.Assert.assertTrue("'" + double70 + "' != '" + 0.0d + "'", double70 == 0.0d);
    }

    @Test
    public void test16508() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest33.test16508");
        java.lang.Throwable throwable5 = null;
        org.apache.commons.math.ConvergenceException convergenceException6 = new org.apache.commons.math.ConvergenceException("hi!", throwable5);
        org.apache.commons.math.ConvergenceException convergenceException7 = new org.apache.commons.math.ConvergenceException(throwable5);
        org.apache.commons.math.FunctionEvaluationException functionEvaluationException8 = new org.apache.commons.math.FunctionEvaluationException((double) ' ', (java.lang.Throwable) convergenceException7);
        java.lang.Throwable[] throwableArray9 = functionEvaluationException8.getSuppressed();
        org.apache.commons.math.ConvergenceException convergenceException10 = new org.apache.commons.math.ConvergenceException("org.apache.commons.math.ConvergenceException: org.apache.commons.math.ConvergenceException: org.apache.commons.math.FunctionEvaluationException: hi!", (java.lang.Throwable) functionEvaluationException8);
        java.lang.Object[] objArray11 = convergenceException10.getArguments();
        org.apache.commons.math.ConvergenceException convergenceException12 = new org.apache.commons.math.ConvergenceException("org.apache.commons.math.FunctionEvaluationException: Evaluation failed for argument = 10", (java.lang.Throwable) convergenceException10);
        org.apache.commons.math.ConvergenceException convergenceException13 = new org.apache.commons.math.ConvergenceException("Evaluation failed for argument = 100", (java.lang.Throwable) convergenceException10);
        org.junit.Assert.assertNotNull(throwableArray9);
        org.junit.Assert.assertNotNull(objArray11);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray11), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray11), "[]");
    }

    @Test
    public void test16509() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest33.test16509");
        org.apache.commons.math.FunctionEvaluationException functionEvaluationException4 = new org.apache.commons.math.FunctionEvaluationException((double) (byte) -1, "org.apache.commons.math.ConvergenceException: hi!");
        org.apache.commons.math.ConvergenceException convergenceException5 = new org.apache.commons.math.ConvergenceException((java.lang.Throwable) functionEvaluationException4);
        java.lang.Object[] objArray6 = functionEvaluationException4.getArguments();
        java.lang.String str7 = functionEvaluationException4.getPattern();
        org.apache.commons.math.ConvergenceException convergenceException8 = new org.apache.commons.math.ConvergenceException((java.lang.Throwable) functionEvaluationException4);
        org.apache.commons.math.ConvergenceException convergenceException9 = new org.apache.commons.math.ConvergenceException("org.apache.commons.math.ConvergenceException: org.apache.commons.math.FunctionEvaluationException: org.apache.commons.math.ConvergenceException: hi!", (java.lang.Throwable) convergenceException8);
        org.apache.commons.math.ode.DerivativeException derivativeException10 = new org.apache.commons.math.ode.DerivativeException((java.lang.Throwable) convergenceException9);
        org.apache.commons.math.FunctionEvaluationException functionEvaluationException11 = new org.apache.commons.math.FunctionEvaluationException((double) (byte) -1, (java.lang.Throwable) convergenceException9);
        org.junit.Assert.assertNotNull(objArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray6), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray6), "[]");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "org.apache.commons.math.ConvergenceException: hi!" + "'", str7, "org.apache.commons.math.ConvergenceException: hi!");
    }

    @Test
    public void test16510() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest33.test16510");
        java.lang.Throwable throwable7 = null;
        org.apache.commons.math.ConvergenceException convergenceException8 = new org.apache.commons.math.ConvergenceException("hi!", throwable7);
        org.apache.commons.math.ode.DerivativeException derivativeException9 = new org.apache.commons.math.ode.DerivativeException((java.lang.Throwable) convergenceException8);
        java.lang.Throwable[] throwableArray10 = derivativeException9.getSuppressed();
        org.apache.commons.math.ConvergenceException convergenceException11 = new org.apache.commons.math.ConvergenceException("hi!", (java.lang.Throwable) derivativeException9);
        org.apache.commons.math.FunctionEvaluationException functionEvaluationException12 = new org.apache.commons.math.FunctionEvaluationException((double) 1, "org.apache.commons.math.ConvergenceException: hi!", (java.lang.Throwable) derivativeException9);
        org.apache.commons.math.FunctionEvaluationException functionEvaluationException13 = new org.apache.commons.math.FunctionEvaluationException((double) (byte) 0, (java.lang.Throwable) derivativeException9);
        org.apache.commons.math.FunctionEvaluationException functionEvaluationException14 = new org.apache.commons.math.FunctionEvaluationException((double) 100, "", (java.lang.Throwable) functionEvaluationException13);
        java.lang.Class<?> wildcardClass15 = functionEvaluationException13.getClass();
        org.junit.Assert.assertNotNull(throwableArray10);
        org.junit.Assert.assertNotNull(wildcardClass15);
    }

    @Test
    public void test16511() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest33.test16511");
        org.apache.commons.math.MaxIterationsExceededException maxIterationsExceededException6 = new org.apache.commons.math.MaxIterationsExceededException((int) (byte) -1);
        java.lang.Object[] objArray7 = maxIterationsExceededException6.getArguments();
        org.apache.commons.math.FunctionEvaluationException functionEvaluationException11 = new org.apache.commons.math.FunctionEvaluationException((double) '4');
        org.apache.commons.math.FunctionEvaluationException functionEvaluationException12 = new org.apache.commons.math.FunctionEvaluationException((double) (short) 100, "", (java.lang.Throwable) functionEvaluationException11);
        org.apache.commons.math.FunctionEvaluationException functionEvaluationException13 = new org.apache.commons.math.FunctionEvaluationException(35.0d, "org.apache.commons.math.FunctionEvaluationException: org.apache.commons.math.ode.DerivativeException: org.apache.commons.math.ConvergenceException: org.apache.commons.math.ConvergenceException: org.apache.commons.math.FunctionEvaluationException: hi!", objArray7, (java.lang.Throwable) functionEvaluationException12);
        org.apache.commons.math.ConvergenceException convergenceException14 = new org.apache.commons.math.ConvergenceException("org.apache.commons.math.MaxIterationsExceededException: org.apache.commons.math.ConvergenceException: org.apache.commons.math.FunctionEvaluationException: org.apache.commons.math.ode.DerivativeException: ", objArray7);
        org.apache.commons.math.FunctionEvaluationException functionEvaluationException15 = new org.apache.commons.math.FunctionEvaluationException((double) '#', "org.apache.commons.math.ConvergenceException: hi!", (java.lang.Throwable) convergenceException14);
        org.apache.commons.math.ode.DerivativeException derivativeException16 = new org.apache.commons.math.ode.DerivativeException((java.lang.Throwable) convergenceException14);
        java.lang.Throwable throwable19 = null;
        org.apache.commons.math.ConvergenceException convergenceException20 = new org.apache.commons.math.ConvergenceException("hi!", throwable19);
        java.lang.Throwable throwable22 = null;
        org.apache.commons.math.ConvergenceException convergenceException23 = new org.apache.commons.math.ConvergenceException("hi!", throwable22);
        convergenceException20.addSuppressed((java.lang.Throwable) convergenceException23);
        org.apache.commons.math.FunctionEvaluationException functionEvaluationException25 = new org.apache.commons.math.FunctionEvaluationException(1.0d, (java.lang.Throwable) convergenceException23);
        double double26 = functionEvaluationException25.getArgument();
        org.apache.commons.math.ode.DerivativeException derivativeException27 = new org.apache.commons.math.ode.DerivativeException((java.lang.Throwable) functionEvaluationException25);
        double double28 = functionEvaluationException25.getArgument();
        convergenceException14.addSuppressed((java.lang.Throwable) functionEvaluationException25);
        org.junit.Assert.assertNotNull(objArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray7), "[-1]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray7), "[-1]");
        org.junit.Assert.assertTrue("'" + double26 + "' != '" + 1.0d + "'", double26 == 1.0d);
        org.junit.Assert.assertTrue("'" + double28 + "' != '" + 1.0d + "'", double28 == 1.0d);
    }

    @Test
    public void test16512() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest33.test16512");
        org.apache.commons.math.FunctionEvaluationException functionEvaluationException2 = new org.apache.commons.math.FunctionEvaluationException((double) (byte) 0, "org.apache.commons.math.ode.DerivativeException: org.apache.commons.math.ConvergenceException");
    }

    @Test
    public void test16513() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest33.test16513");
        java.lang.Object[] objArray16 = new java.lang.Object[] { 1L, (byte) 10, (short) 1 };
        org.apache.commons.math.FunctionEvaluationException functionEvaluationException17 = new org.apache.commons.math.FunctionEvaluationException((-1.0d), "hi!", objArray16);
        org.apache.commons.math.FunctionEvaluationException functionEvaluationException18 = new org.apache.commons.math.FunctionEvaluationException((double) 0L, "", objArray16);
        java.lang.Object[] objArray30 = new java.lang.Object[] { 1L, (byte) 10, (short) 1 };
        org.apache.commons.math.FunctionEvaluationException functionEvaluationException31 = new org.apache.commons.math.FunctionEvaluationException((-1.0d), "hi!", objArray30);
        org.apache.commons.math.FunctionEvaluationException functionEvaluationException32 = new org.apache.commons.math.FunctionEvaluationException((double) 0L, "", objArray30);
        java.lang.Object[] objArray37 = new java.lang.Object[] { "", (short) 1, "org.apache.commons.math.FunctionEvaluationException: hi!", 10.0d, 0.0f };
        java.lang.Throwable throwable39 = null;
        org.apache.commons.math.ConvergenceException convergenceException40 = new org.apache.commons.math.ConvergenceException("hi!", throwable39);
        org.apache.commons.math.ode.DerivativeException derivativeException41 = new org.apache.commons.math.ode.DerivativeException((java.lang.Throwable) convergenceException40);
        java.lang.Throwable[] throwableArray42 = derivativeException41.getSuppressed();
        org.apache.commons.math.FunctionEvaluationException functionEvaluationException43 = new org.apache.commons.math.FunctionEvaluationException((double) 100, "", objArray37, (java.lang.Throwable) derivativeException41);
        java.lang.Object[] objArray55 = new java.lang.Object[] { 1L, (byte) 10, (short) 1 };
        org.apache.commons.math.FunctionEvaluationException functionEvaluationException56 = new org.apache.commons.math.FunctionEvaluationException((-1.0d), "hi!", objArray55);
        org.apache.commons.math.FunctionEvaluationException functionEvaluationException57 = new org.apache.commons.math.FunctionEvaluationException((double) 0L, "", objArray55);
        java.lang.Object[] objArray62 = new java.lang.Object[] { "", (short) 1, "org.apache.commons.math.FunctionEvaluationException: hi!", 10.0d, 0.0f };
        java.lang.Throwable throwable64 = null;
        org.apache.commons.math.ConvergenceException convergenceException65 = new org.apache.commons.math.ConvergenceException("hi!", throwable64);
        org.apache.commons.math.ode.DerivativeException derivativeException66 = new org.apache.commons.math.ode.DerivativeException((java.lang.Throwable) convergenceException65);
        java.lang.Throwable[] throwableArray67 = derivativeException66.getSuppressed();
        org.apache.commons.math.FunctionEvaluationException functionEvaluationException68 = new org.apache.commons.math.FunctionEvaluationException((double) 100, "", objArray62, (java.lang.Throwable) derivativeException66);
        java.lang.Object[] objArray76 = new java.lang.Object[] { 1L, (byte) 10, (short) 1 };
        org.apache.commons.math.FunctionEvaluationException functionEvaluationException77 = new org.apache.commons.math.FunctionEvaluationException((-1.0d), "hi!", objArray76);
        org.apache.commons.math.FunctionEvaluationException functionEvaluationException78 = new org.apache.commons.math.FunctionEvaluationException((double) 0L, "", objArray76);
        org.apache.commons.math.ode.DerivativeException derivativeException79 = new org.apache.commons.math.ode.DerivativeException((java.lang.Throwable) functionEvaluationException78);
        org.apache.commons.math.FunctionEvaluationException functionEvaluationException80 = new org.apache.commons.math.FunctionEvaluationException((double) '#', "hi!", objArray62, (java.lang.Throwable) derivativeException79);
        org.apache.commons.math.FunctionEvaluationException functionEvaluationException81 = new org.apache.commons.math.FunctionEvaluationException((double) (byte) -1, "", objArray37, (java.lang.Throwable) functionEvaluationException80);
        double double82 = functionEvaluationException81.getArgument();
        org.apache.commons.math.FunctionEvaluationException functionEvaluationException83 = new org.apache.commons.math.FunctionEvaluationException((double) 100L, "", objArray16, (java.lang.Throwable) functionEvaluationException81);
        org.apache.commons.math.MaxIterationsExceededException maxIterationsExceededException84 = new org.apache.commons.math.MaxIterationsExceededException(10, "org.apache.commons.math.ConvergenceException: org.apache.commons.math.ConvergenceException: org.apache.commons.math.FunctionEvaluationException: hi!", objArray16);
        org.apache.commons.math.ConvergenceException convergenceException85 = new org.apache.commons.math.ConvergenceException("hi!", (java.lang.Throwable) maxIterationsExceededException84);
        java.lang.Throwable[] throwableArray86 = maxIterationsExceededException84.getSuppressed();
        java.lang.Object[] objArray87 = maxIterationsExceededException84.getArguments();
        org.apache.commons.math.ode.DerivativeException derivativeException88 = new org.apache.commons.math.ode.DerivativeException((java.lang.Throwable) maxIterationsExceededException84);
        java.lang.Object[] objArray89 = maxIterationsExceededException84.getArguments();
        org.apache.commons.math.ConvergenceException convergenceException90 = new org.apache.commons.math.ConvergenceException("Evaluation failed for argument = 100", objArray89);
        java.lang.Throwable throwable92 = null;
        org.apache.commons.math.ConvergenceException convergenceException93 = new org.apache.commons.math.ConvergenceException("", throwable92);
        org.apache.commons.math.ode.DerivativeException derivativeException94 = new org.apache.commons.math.ode.DerivativeException((java.lang.Throwable) convergenceException93);
        org.apache.commons.math.ode.DerivativeException derivativeException95 = new org.apache.commons.math.ode.DerivativeException((java.lang.Throwable) derivativeException94);
        org.apache.commons.math.FunctionEvaluationException functionEvaluationException96 = new org.apache.commons.math.FunctionEvaluationException(0.0d, "org.apache.commons.math.MaxIterationsExceededException: org.apache.commons.math.FunctionEvaluationException: org.apache.commons.math.ConvergenceException: hi!", objArray89, (java.lang.Throwable) derivativeException95);
        org.apache.commons.math.FunctionEvaluationException functionEvaluationException97 = new org.apache.commons.math.FunctionEvaluationException((double) 0.0f, (java.lang.Throwable) functionEvaluationException96);
        java.lang.Object[] objArray98 = functionEvaluationException97.getArguments();
        org.junit.Assert.assertNotNull(objArray16);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray16), "[1, 10, 1]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray16), "[1, 10, 1]");
        org.junit.Assert.assertNotNull(objArray30);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray30), "[1, 10, 1]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray30), "[1, 10, 1]");
        org.junit.Assert.assertNotNull(objArray37);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray37), "[, 1, org.apache.commons.math.FunctionEvaluationException: hi!, 10.0, 0.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray37), "[, 1, org.apache.commons.math.FunctionEvaluationException: hi!, 10.0, 0.0]");
        org.junit.Assert.assertNotNull(throwableArray42);
        org.junit.Assert.assertNotNull(objArray55);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray55), "[1, 10, 1]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray55), "[1, 10, 1]");
        org.junit.Assert.assertNotNull(objArray62);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray62), "[, 1, org.apache.commons.math.FunctionEvaluationException: hi!, 10.0, 0.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray62), "[, 1, org.apache.commons.math.FunctionEvaluationException: hi!, 10.0, 0.0]");
        org.junit.Assert.assertNotNull(throwableArray67);
        org.junit.Assert.assertNotNull(objArray76);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray76), "[1, 10, 1]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray76), "[1, 10, 1]");
        org.junit.Assert.assertTrue("'" + double82 + "' != '" + (-1.0d) + "'", double82 == (-1.0d));
        org.junit.Assert.assertNotNull(throwableArray86);
        org.junit.Assert.assertNotNull(objArray87);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray87), "[1, 10, 1]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray87), "[1, 10, 1]");
        org.junit.Assert.assertNotNull(objArray89);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray89), "[1, 10, 1]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray89), "[1, 10, 1]");
        org.junit.Assert.assertNotNull(objArray98);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray98), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray98), "[]");
    }

    @Test
    public void test16514() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest33.test16514");
        java.lang.String[] strArray12 = new java.lang.String[] { "hi!", "", "hi!", "hi!", "hi!" };
        org.apache.commons.math.ode.DerivativeException derivativeException13 = new org.apache.commons.math.ode.DerivativeException("", strArray12);
        org.apache.commons.math.ode.DerivativeException derivativeException14 = new org.apache.commons.math.ode.DerivativeException("", strArray12);
        java.lang.String[] strArray21 = new java.lang.String[] { "hi!", "", "hi!", "hi!", "hi!" };
        org.apache.commons.math.ode.DerivativeException derivativeException22 = new org.apache.commons.math.ode.DerivativeException("", strArray21);
        org.apache.commons.math.ode.DerivativeException derivativeException23 = new org.apache.commons.math.ode.DerivativeException((java.lang.Throwable) derivativeException22);
        org.apache.commons.math.ConvergenceException convergenceException24 = new org.apache.commons.math.ConvergenceException("hi!", (java.lang.Object[]) strArray12, (java.lang.Throwable) derivativeException22);
        java.lang.Object[] objArray25 = derivativeException22.getArguments();
        java.lang.Throwable throwable26 = null;
        org.apache.commons.math.ConvergenceException convergenceException27 = new org.apache.commons.math.ConvergenceException("org.apache.commons.math.ode.DerivativeException: ", objArray25, throwable26);
        java.lang.Throwable throwable31 = null;
        org.apache.commons.math.ConvergenceException convergenceException32 = new org.apache.commons.math.ConvergenceException("hi!", throwable31);
        org.apache.commons.math.ode.DerivativeException derivativeException33 = new org.apache.commons.math.ode.DerivativeException((java.lang.Throwable) convergenceException32);
        java.lang.Throwable[] throwableArray34 = derivativeException33.getSuppressed();
        org.apache.commons.math.ConvergenceException convergenceException35 = new org.apache.commons.math.ConvergenceException("org.apache.commons.math.FunctionEvaluationException: org.apache.commons.math.ode.DerivativeException: ", (java.lang.Object[]) throwableArray34);
        org.apache.commons.math.ConvergenceException convergenceException36 = new org.apache.commons.math.ConvergenceException("org.apache.commons.math.ConvergenceException: org.apache.commons.math.ConvergenceException: org.apache.commons.math.FunctionEvaluationException: hi!", (java.lang.Object[]) throwableArray34);
        org.apache.commons.math.ConvergenceException convergenceException37 = new org.apache.commons.math.ConvergenceException("org.apache.commons.math.FunctionEvaluationException", objArray25, (java.lang.Throwable) convergenceException36);
        org.apache.commons.math.MaxIterationsExceededException maxIterationsExceededException41 = new org.apache.commons.math.MaxIterationsExceededException((int) (short) 1);
        int int42 = maxIterationsExceededException41.getMaxIterations();
        java.lang.Object[] objArray43 = maxIterationsExceededException41.getArguments();
        java.lang.String[] strArray62 = new java.lang.String[] { "hi!", "", "hi!", "hi!", "hi!" };
        org.apache.commons.math.ode.DerivativeException derivativeException63 = new org.apache.commons.math.ode.DerivativeException("", strArray62);
        org.apache.commons.math.ode.DerivativeException derivativeException64 = new org.apache.commons.math.ode.DerivativeException("", strArray62);
        java.lang.String[] strArray71 = new java.lang.String[] { "hi!", "", "hi!", "hi!", "hi!" };
        org.apache.commons.math.ode.DerivativeException derivativeException72 = new org.apache.commons.math.ode.DerivativeException("", strArray71);
        org.apache.commons.math.ode.DerivativeException derivativeException73 = new org.apache.commons.math.ode.DerivativeException((java.lang.Throwable) derivativeException72);
        org.apache.commons.math.ConvergenceException convergenceException74 = new org.apache.commons.math.ConvergenceException("hi!", (java.lang.Object[]) strArray62, (java.lang.Throwable) derivativeException72);
        org.apache.commons.math.ode.DerivativeException derivativeException75 = new org.apache.commons.math.ode.DerivativeException("hi!", strArray62);
        java.lang.Object[] objArray83 = new java.lang.Object[] { 1L, (byte) 10, (short) 1 };
        org.apache.commons.math.FunctionEvaluationException functionEvaluationException84 = new org.apache.commons.math.FunctionEvaluationException((-1.0d), "hi!", objArray83);
        java.lang.Throwable throwable85 = null;
        org.apache.commons.math.FunctionEvaluationException functionEvaluationException86 = new org.apache.commons.math.FunctionEvaluationException((double) (short) 1, "hi!", objArray83, throwable85);
        org.apache.commons.math.ConvergenceException convergenceException87 = new org.apache.commons.math.ConvergenceException("org.apache.commons.math.FunctionEvaluationException: hi!", (java.lang.Object[]) strArray62, throwable85);
        org.apache.commons.math.FunctionEvaluationException functionEvaluationException88 = new org.apache.commons.math.FunctionEvaluationException((double) 10L, "org.apache.commons.math.ConvergenceException: org.apache.commons.math.FunctionEvaluationException: hi!", (java.lang.Object[]) strArray62);
        org.apache.commons.math.ode.DerivativeException derivativeException89 = new org.apache.commons.math.ode.DerivativeException("org.apache.commons.math.ConvergenceException: org.apache.commons.math.FunctionEvaluationException: hi!", strArray62);
        java.lang.Throwable[] throwableArray90 = derivativeException89.getSuppressed();
        org.apache.commons.math.ConvergenceException convergenceException91 = new org.apache.commons.math.ConvergenceException("org.apache.commons.math.ode.DerivativeException: hi!", (java.lang.Object[]) throwableArray90);
        org.apache.commons.math.MaxIterationsExceededException maxIterationsExceededException92 = new org.apache.commons.math.MaxIterationsExceededException((int) (short) -1, "org.apache.commons.math.FunctionEvaluationException: org.apache.commons.math.ConvergenceException: org.apache.commons.math.FunctionEvaluationException: hi!", (java.lang.Object[]) throwableArray90);
        org.apache.commons.math.FunctionEvaluationException functionEvaluationException93 = new org.apache.commons.math.FunctionEvaluationException((double) (short) -1, "org.apache.commons.math.FunctionEvaluationException: Evaluation failed for argument = -1", (java.lang.Object[]) throwableArray90);
        org.apache.commons.math.FunctionEvaluationException functionEvaluationException94 = new org.apache.commons.math.FunctionEvaluationException(0.0d, "Evaluation failed for argument = 100", objArray43, (java.lang.Throwable) functionEvaluationException93);
        org.apache.commons.math.FunctionEvaluationException functionEvaluationException95 = new org.apache.commons.math.FunctionEvaluationException((double) 97, "org.apache.commons.math.MaxIterationsExceededException: org.apache.commons.math.ConvergenceException: org.apache.commons.math.ConvergenceException: org.apache.commons.math.MaxIterationsExceededException: Evaluation failed for argument = hi!", objArray25, (java.lang.Throwable) functionEvaluationException93);
        org.junit.Assert.assertNotNull(strArray12);
        org.junit.Assert.assertNotNull(strArray21);
        org.junit.Assert.assertNotNull(objArray25);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray25), "[hi!, , hi!, hi!, hi!]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray25), "[hi!, , hi!, hi!, hi!]");
        org.junit.Assert.assertNotNull(throwableArray34);
        org.junit.Assert.assertTrue("'" + int42 + "' != '" + 1 + "'", int42 == 1);
        org.junit.Assert.assertNotNull(objArray43);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray43), "[1]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray43), "[1]");
        org.junit.Assert.assertNotNull(strArray62);
        org.junit.Assert.assertNotNull(strArray71);
        org.junit.Assert.assertNotNull(objArray83);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray83), "[1, 10, 1]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray83), "[1, 10, 1]");
        org.junit.Assert.assertNotNull(throwableArray90);
    }

    @Test
    public void test16515() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest33.test16515");
        java.lang.String[] strArray15 = new java.lang.String[] { "Evaluation failed for argument = {0}", "Evaluation failed for argument = {0}", "Evaluation failed for argument = {0}", "", "", "org.apache.commons.math.ConvergenceException: org.apache.commons.math.FunctionEvaluationException: hi!" };
        org.apache.commons.math.ode.DerivativeException derivativeException16 = new org.apache.commons.math.ode.DerivativeException("Evaluation failed for argument = {0}", strArray15);
        org.apache.commons.math.MaxIterationsExceededException maxIterationsExceededException17 = new org.apache.commons.math.MaxIterationsExceededException((int) (byte) 0, "org.apache.commons.math.ConvergenceException: org.apache.commons.math.ConvergenceException: org.apache.commons.math.FunctionEvaluationException: hi!", (java.lang.Object[]) strArray15);
        org.apache.commons.math.FunctionEvaluationException functionEvaluationException19 = new org.apache.commons.math.FunctionEvaluationException(0.0d);
        org.apache.commons.math.ConvergenceException convergenceException20 = new org.apache.commons.math.ConvergenceException("", (java.lang.Object[]) strArray15, (java.lang.Throwable) functionEvaluationException19);
        org.apache.commons.math.ConvergenceException convergenceException21 = new org.apache.commons.math.ConvergenceException("org.apache.commons.math.MaxIterationsExceededException: Maximal number of iterations (0) exceeded", (java.lang.Throwable) functionEvaluationException19);
        java.lang.Object[] objArray22 = convergenceException21.getArguments();
        org.apache.commons.math.MaxIterationsExceededException maxIterationsExceededException23 = new org.apache.commons.math.MaxIterationsExceededException(1, "org.apache.commons.math.ConvergenceException: org.apache.commons.math.MaxIterationsExceededException: Evaluation failed for argument = {0}", objArray22);
        org.apache.commons.math.FunctionEvaluationException functionEvaluationException24 = new org.apache.commons.math.FunctionEvaluationException((double) ' ', "org.apache.commons.math.MaxIterationsExceededException: org.apache.commons.math.MaxIterationsExceededException: Maximal number of iterations (3) exceeded", objArray22);
        java.lang.Class<?> wildcardClass25 = objArray22.getClass();
        org.junit.Assert.assertNotNull(strArray15);
        org.junit.Assert.assertNotNull(objArray22);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray22), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray22), "[]");
        org.junit.Assert.assertNotNull(wildcardClass25);
    }

    @Test
    public void test16516() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest33.test16516");
        java.lang.String[] strArray13 = new java.lang.String[] { "org.apache.commons.math.FunctionEvaluationException: hi!", "org.apache.commons.math.FunctionEvaluationException: hi!", "org.apache.commons.math.ode.DerivativeException: ", "hi!" };
        org.apache.commons.math.ode.DerivativeException derivativeException14 = new org.apache.commons.math.ode.DerivativeException("org.apache.commons.math.ode.DerivativeException: ", strArray13);
        java.lang.Object[] objArray23 = new java.lang.Object[] { 1L, (byte) 10, (short) 1 };
        org.apache.commons.math.FunctionEvaluationException functionEvaluationException24 = new org.apache.commons.math.FunctionEvaluationException((-1.0d), "hi!", objArray23);
        org.apache.commons.math.FunctionEvaluationException functionEvaluationException25 = new org.apache.commons.math.FunctionEvaluationException((double) 0L, "", objArray23);
        java.lang.String str26 = functionEvaluationException25.getPattern();
        org.apache.commons.math.ode.DerivativeException derivativeException27 = new org.apache.commons.math.ode.DerivativeException((java.lang.Throwable) functionEvaluationException25);
        java.lang.Object[] objArray28 = derivativeException27.getArguments();
        org.apache.commons.math.ConvergenceException convergenceException29 = new org.apache.commons.math.ConvergenceException("hi!", (java.lang.Throwable) derivativeException27);
        org.apache.commons.math.ConvergenceException convergenceException30 = new org.apache.commons.math.ConvergenceException("org.apache.commons.math.ode.DerivativeException: ", (java.lang.Object[]) strArray13, (java.lang.Throwable) convergenceException29);
        org.apache.commons.math.FunctionEvaluationException functionEvaluationException33 = new org.apache.commons.math.FunctionEvaluationException((double) 0.0f, "org.apache.commons.math.MaxIterationsExceededException: org.apache.commons.math.ConvergenceException: org.apache.commons.math.ConvergenceException: org.apache.commons.math.FunctionEvaluationException: hi!");
        org.apache.commons.math.ConvergenceException convergenceException34 = new org.apache.commons.math.ConvergenceException("org.apache.commons.math.ConvergenceException: org.apache.commons.math.FunctionEvaluationException: Evaluation failed for argument = 0", (java.lang.Object[]) strArray13, (java.lang.Throwable) functionEvaluationException33);
        org.apache.commons.math.ode.DerivativeException derivativeException35 = new org.apache.commons.math.ode.DerivativeException("org.apache.commons.math.ode.DerivativeException: org.apache.commons.math.ode.DerivativeException: ", strArray13);
        org.apache.commons.math.ConvergenceException convergenceException36 = new org.apache.commons.math.ConvergenceException("org.apache.commons.math.FunctionEvaluationException: Evaluation failed for argument = 52", (java.lang.Object[]) strArray13);
        org.apache.commons.math.ode.DerivativeException derivativeException37 = new org.apache.commons.math.ode.DerivativeException("org.apache.commons.math.ConvergenceException: org.apache.commons.math.ConvergenceException: org.apache.commons.math.ConvergenceException: org.apache.commons.math.FunctionEvaluationException: hi!", strArray13);
        org.apache.commons.math.ode.DerivativeException derivativeException38 = new org.apache.commons.math.ode.DerivativeException("org.apache.commons.math.ConvergenceException: org.apache.commons.math.FunctionEvaluationException: org.apache.commons.math.MaxIterationsExceededException: org.apache.commons.math.ode.DerivativeException: ", strArray13);
        org.apache.commons.math.ode.DerivativeException derivativeException39 = new org.apache.commons.math.ode.DerivativeException("org.apache.commons.math.ConvergenceException: org.apache.commons.math.FunctionEvaluationException: org.apache.commons.math.FunctionEvaluationException: Evaluation failed for argument = {0}", strArray13);
        org.apache.commons.math.ConvergenceException convergenceException40 = new org.apache.commons.math.ConvergenceException("org.apache.commons.math.ConvergenceException: org.apache.commons.math.FunctionEvaluationException: org.apache.commons.math.MaxIterationsExceededException: Maximal number of iterations (0) exceeded", (java.lang.Object[]) strArray13);
        org.junit.Assert.assertNotNull(strArray13);
        org.junit.Assert.assertNotNull(objArray23);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray23), "[1, 10, 1]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray23), "[1, 10, 1]");
        org.junit.Assert.assertEquals("'" + str26 + "' != '" + "" + "'", str26, "");
        org.junit.Assert.assertNotNull(objArray28);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray28), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray28), "[]");
    }

    @Test
    public void test16517() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest33.test16517");
        org.apache.commons.math.FunctionEvaluationException functionEvaluationException4 = new org.apache.commons.math.FunctionEvaluationException(0.0d, "org.apache.commons.math.MaxIterationsExceededException: Evaluation failed for argument = {0}");
        double double5 = functionEvaluationException4.getArgument();
        org.apache.commons.math.ode.DerivativeException derivativeException6 = new org.apache.commons.math.ode.DerivativeException((java.lang.Throwable) functionEvaluationException4);
        double double7 = functionEvaluationException4.getArgument();
        org.apache.commons.math.ode.DerivativeException derivativeException8 = new org.apache.commons.math.ode.DerivativeException((java.lang.Throwable) functionEvaluationException4);
        org.apache.commons.math.ConvergenceException convergenceException9 = new org.apache.commons.math.ConvergenceException((java.lang.Throwable) derivativeException8);
        org.apache.commons.math.FunctionEvaluationException functionEvaluationException10 = new org.apache.commons.math.FunctionEvaluationException(100.0d, "org.apache.commons.math.ode.DerivativeException: org.apache.commons.math.ConvergenceException: org.apache.commons.math.ConvergenceException: org.apache.commons.math.FunctionEvaluationException: hi!", (java.lang.Throwable) derivativeException8);
        java.lang.String str11 = derivativeException8.toString();
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 0.0d + "'", double7 == 0.0d);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "org.apache.commons.math.ode.DerivativeException: org.apache.commons.math.MaxIterationsExceededException: Evaluation failed for argument = {0}" + "'", str11, "org.apache.commons.math.ode.DerivativeException: org.apache.commons.math.MaxIterationsExceededException: Evaluation failed for argument = {0}");
    }

    @Test
    public void test16518() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest33.test16518");
        java.lang.String[] strArray14 = new java.lang.String[] { "org.apache.commons.math.FunctionEvaluationException: hi!", "org.apache.commons.math.FunctionEvaluationException: hi!", "org.apache.commons.math.ode.DerivativeException: ", "hi!" };
        org.apache.commons.math.ode.DerivativeException derivativeException15 = new org.apache.commons.math.ode.DerivativeException("org.apache.commons.math.ode.DerivativeException: ", strArray14);
        java.lang.String[] strArray25 = new java.lang.String[] { "hi!", "", "hi!", "hi!", "hi!" };
        org.apache.commons.math.ode.DerivativeException derivativeException26 = new org.apache.commons.math.ode.DerivativeException("", strArray25);
        org.apache.commons.math.ode.DerivativeException derivativeException27 = new org.apache.commons.math.ode.DerivativeException("", strArray25);
        org.apache.commons.math.ConvergenceException convergenceException28 = new org.apache.commons.math.ConvergenceException("org.apache.commons.math.FunctionEvaluationException: hi!", (java.lang.Object[]) strArray25);
        org.apache.commons.math.ConvergenceException convergenceException29 = new org.apache.commons.math.ConvergenceException("", (java.lang.Object[]) strArray25);
        org.apache.commons.math.FunctionEvaluationException functionEvaluationException30 = new org.apache.commons.math.FunctionEvaluationException((double) '#', "org.apache.commons.math.FunctionEvaluationException: Evaluation failed for argument = 0", (java.lang.Object[]) strArray14, (java.lang.Throwable) convergenceException29);
        org.apache.commons.math.FunctionEvaluationException functionEvaluationException31 = new org.apache.commons.math.FunctionEvaluationException((double) 3, "org.apache.commons.math.ode.DerivativeException: hi!", (java.lang.Object[]) strArray14);
        org.apache.commons.math.ode.DerivativeException derivativeException32 = new org.apache.commons.math.ode.DerivativeException("org.apache.commons.math.FunctionEvaluationException: Evaluation failed for argument = 0", strArray14);
        org.apache.commons.math.ode.DerivativeException derivativeException33 = new org.apache.commons.math.ode.DerivativeException("org.apache.commons.math.FunctionEvaluationException: Evaluation failed for argument = 52", strArray14);
        org.apache.commons.math.ode.DerivativeException derivativeException34 = new org.apache.commons.math.ode.DerivativeException("org.apache.commons.math.FunctionEvaluationException: org.apache.commons.math.MaxIterationsExceededException: Maximal number of iterations (3) exceeded", strArray14);
        org.apache.commons.math.FunctionEvaluationException functionEvaluationException35 = new org.apache.commons.math.FunctionEvaluationException((double) 2, "org.apache.commons.math.ConvergenceException: Maximal number of iterations (10) exceeded", (java.lang.Throwable) derivativeException34);
        org.apache.commons.math.ConvergenceException convergenceException36 = new org.apache.commons.math.ConvergenceException((java.lang.Throwable) functionEvaluationException35);
        java.lang.String str37 = convergenceException36.toString();
        org.junit.Assert.assertNotNull(strArray14);
        org.junit.Assert.assertNotNull(strArray25);
        org.junit.Assert.assertEquals("'" + str37 + "' != '" + "org.apache.commons.math.ConvergenceException: org.apache.commons.math.ConvergenceException: Maximal number of iterations (10) exceeded" + "'", str37, "org.apache.commons.math.ConvergenceException: org.apache.commons.math.ConvergenceException: Maximal number of iterations (10) exceeded");
    }

    @Test
    public void test16519() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest33.test16519");
        org.apache.commons.math.FunctionEvaluationException functionEvaluationException6 = new org.apache.commons.math.FunctionEvaluationException(2.0d);
        java.lang.String str7 = functionEvaluationException6.getPattern();
        org.apache.commons.math.FunctionEvaluationException functionEvaluationException8 = new org.apache.commons.math.FunctionEvaluationException((double) 100L, (java.lang.Throwable) functionEvaluationException6);
        java.lang.Object[] objArray9 = functionEvaluationException6.getArguments();
        java.lang.String[] strArray21 = new java.lang.String[] { "hi!", "", "hi!", "hi!", "hi!" };
        org.apache.commons.math.ode.DerivativeException derivativeException22 = new org.apache.commons.math.ode.DerivativeException("", strArray21);
        org.apache.commons.math.ode.DerivativeException derivativeException23 = new org.apache.commons.math.ode.DerivativeException("org.apache.commons.math.FunctionEvaluationException: hi!", strArray21);
        org.apache.commons.math.MaxIterationsExceededException maxIterationsExceededException26 = new org.apache.commons.math.MaxIterationsExceededException(0);
        org.apache.commons.math.ConvergenceException convergenceException27 = new org.apache.commons.math.ConvergenceException("org.apache.commons.math.ConvergenceException: org.apache.commons.math.FunctionEvaluationException: hi!", (java.lang.Throwable) maxIterationsExceededException26);
        org.apache.commons.math.ConvergenceException convergenceException28 = new org.apache.commons.math.ConvergenceException("", (java.lang.Object[]) strArray21, (java.lang.Throwable) maxIterationsExceededException26);
        org.apache.commons.math.ode.DerivativeException derivativeException29 = new org.apache.commons.math.ode.DerivativeException("org.apache.commons.math.FunctionEvaluationException: org.apache.commons.math.FunctionEvaluationException: org.apache.commons.math.ConvergenceException: org.apache.commons.math.FunctionEvaluationException: hi!", strArray21);
        org.apache.commons.math.MaxIterationsExceededException maxIterationsExceededException30 = new org.apache.commons.math.MaxIterationsExceededException(3, "", (java.lang.Object[]) strArray21);
        java.lang.Object[] objArray31 = maxIterationsExceededException30.getArguments();
        org.apache.commons.math.FunctionEvaluationException functionEvaluationException32 = new org.apache.commons.math.FunctionEvaluationException((double) 97, "org.apache.commons.math.FunctionEvaluationException: org.apache.commons.math.FunctionEvaluationException: org.apache.commons.math.FunctionEvaluationException: hi!", objArray9, (java.lang.Throwable) maxIterationsExceededException30);
        org.apache.commons.math.ConvergenceException convergenceException33 = new org.apache.commons.math.ConvergenceException("org.apache.commons.math.ConvergenceException: Maximal number of iterations (10) exceeded", objArray9);
        org.apache.commons.math.ConvergenceException convergenceException34 = new org.apache.commons.math.ConvergenceException("org.apache.commons.math.MaxIterationsExceededException: org.apache.commons.math.ode.DerivativeException: org.apache.commons.math.ConvergenceException: org.apache.commons.math.FunctionEvaluationException: hi!", objArray9);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "Evaluation failed for argument = {0}" + "'", str7, "Evaluation failed for argument = {0}");
        org.junit.Assert.assertNotNull(objArray9);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray9), "[2.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray9), "[2.0]");
        org.junit.Assert.assertNotNull(strArray21);
        org.junit.Assert.assertNotNull(objArray31);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray31), "[hi!, , hi!, hi!, hi!]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray31), "[hi!, , hi!, hi!, hi!]");
    }

    @Test
    public void test16520() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest33.test16520");
        java.lang.Object[] objArray19 = new java.lang.Object[] { 1L, (byte) 10, (short) 1 };
        org.apache.commons.math.FunctionEvaluationException functionEvaluationException20 = new org.apache.commons.math.FunctionEvaluationException((-1.0d), "hi!", objArray19);
        org.apache.commons.math.FunctionEvaluationException functionEvaluationException21 = new org.apache.commons.math.FunctionEvaluationException((double) 0L, "", objArray19);
        java.lang.Object[] objArray26 = new java.lang.Object[] { "", (short) 1, "org.apache.commons.math.FunctionEvaluationException: hi!", 10.0d, 0.0f };
        java.lang.Throwable throwable28 = null;
        org.apache.commons.math.ConvergenceException convergenceException29 = new org.apache.commons.math.ConvergenceException("hi!", throwable28);
        org.apache.commons.math.ode.DerivativeException derivativeException30 = new org.apache.commons.math.ode.DerivativeException((java.lang.Throwable) convergenceException29);
        java.lang.Throwable[] throwableArray31 = derivativeException30.getSuppressed();
        org.apache.commons.math.FunctionEvaluationException functionEvaluationException32 = new org.apache.commons.math.FunctionEvaluationException((double) 100, "", objArray26, (java.lang.Throwable) derivativeException30);
        java.lang.Object[] objArray44 = new java.lang.Object[] { 1L, (byte) 10, (short) 1 };
        org.apache.commons.math.FunctionEvaluationException functionEvaluationException45 = new org.apache.commons.math.FunctionEvaluationException((-1.0d), "hi!", objArray44);
        org.apache.commons.math.FunctionEvaluationException functionEvaluationException46 = new org.apache.commons.math.FunctionEvaluationException((double) 0L, "", objArray44);
        java.lang.Object[] objArray51 = new java.lang.Object[] { "", (short) 1, "org.apache.commons.math.FunctionEvaluationException: hi!", 10.0d, 0.0f };
        java.lang.Throwable throwable53 = null;
        org.apache.commons.math.ConvergenceException convergenceException54 = new org.apache.commons.math.ConvergenceException("hi!", throwable53);
        org.apache.commons.math.ode.DerivativeException derivativeException55 = new org.apache.commons.math.ode.DerivativeException((java.lang.Throwable) convergenceException54);
        java.lang.Throwable[] throwableArray56 = derivativeException55.getSuppressed();
        org.apache.commons.math.FunctionEvaluationException functionEvaluationException57 = new org.apache.commons.math.FunctionEvaluationException((double) 100, "", objArray51, (java.lang.Throwable) derivativeException55);
        java.lang.Object[] objArray65 = new java.lang.Object[] { 1L, (byte) 10, (short) 1 };
        org.apache.commons.math.FunctionEvaluationException functionEvaluationException66 = new org.apache.commons.math.FunctionEvaluationException((-1.0d), "hi!", objArray65);
        org.apache.commons.math.FunctionEvaluationException functionEvaluationException67 = new org.apache.commons.math.FunctionEvaluationException((double) 0L, "", objArray65);
        org.apache.commons.math.ode.DerivativeException derivativeException68 = new org.apache.commons.math.ode.DerivativeException((java.lang.Throwable) functionEvaluationException67);
        org.apache.commons.math.FunctionEvaluationException functionEvaluationException69 = new org.apache.commons.math.FunctionEvaluationException((double) '#', "hi!", objArray51, (java.lang.Throwable) derivativeException68);
        org.apache.commons.math.FunctionEvaluationException functionEvaluationException70 = new org.apache.commons.math.FunctionEvaluationException((double) (byte) -1, "", objArray26, (java.lang.Throwable) functionEvaluationException69);
        java.lang.String str71 = functionEvaluationException69.getPattern();
        org.apache.commons.math.FunctionEvaluationException functionEvaluationException72 = new org.apache.commons.math.FunctionEvaluationException((double) (byte) 10, (java.lang.Throwable) functionEvaluationException69);
        org.apache.commons.math.FunctionEvaluationException functionEvaluationException73 = new org.apache.commons.math.FunctionEvaluationException((double) 0, "Evaluation failed for argument = {0}", (java.lang.Throwable) functionEvaluationException72);
        java.lang.Throwable[] throwableArray74 = functionEvaluationException72.getSuppressed();
        org.apache.commons.math.ConvergenceException convergenceException75 = new org.apache.commons.math.ConvergenceException("", (java.lang.Object[]) throwableArray74);
        java.lang.Object[] objArray83 = new java.lang.Object[] { 1L, (byte) 10, (short) 1 };
        org.apache.commons.math.FunctionEvaluationException functionEvaluationException84 = new org.apache.commons.math.FunctionEvaluationException((-1.0d), "hi!", objArray83);
        org.apache.commons.math.FunctionEvaluationException functionEvaluationException85 = new org.apache.commons.math.FunctionEvaluationException((double) 0L, "", objArray83);
        java.lang.String str86 = functionEvaluationException85.getPattern();
        org.apache.commons.math.ConvergenceException convergenceException87 = new org.apache.commons.math.ConvergenceException((java.lang.Throwable) functionEvaluationException85);
        convergenceException75.addSuppressed((java.lang.Throwable) convergenceException87);
        java.lang.String str89 = convergenceException75.getPattern();
        java.lang.Throwable[] throwableArray90 = convergenceException75.getSuppressed();
        org.apache.commons.math.MaxIterationsExceededException maxIterationsExceededException91 = new org.apache.commons.math.MaxIterationsExceededException(0, "org.apache.commons.math.ConvergenceException: org.apache.commons.math.FunctionEvaluationException: org.apache.commons.math.ConvergenceException: hi!", (java.lang.Object[]) throwableArray90);
        org.apache.commons.math.FunctionEvaluationException functionEvaluationException92 = new org.apache.commons.math.FunctionEvaluationException((double) (byte) 100, (java.lang.Throwable) maxIterationsExceededException91);
        double double93 = functionEvaluationException92.getArgument();
        double double94 = functionEvaluationException92.getArgument();
        org.apache.commons.math.ConvergenceException convergenceException95 = new org.apache.commons.math.ConvergenceException((java.lang.Throwable) functionEvaluationException92);
        org.apache.commons.math.FunctionEvaluationException functionEvaluationException96 = new org.apache.commons.math.FunctionEvaluationException((double) 100, (java.lang.Throwable) functionEvaluationException92);
        org.junit.Assert.assertNotNull(objArray19);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray19), "[1, 10, 1]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray19), "[1, 10, 1]");
        org.junit.Assert.assertNotNull(objArray26);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray26), "[, 1, org.apache.commons.math.FunctionEvaluationException: hi!, 10.0, 0.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray26), "[, 1, org.apache.commons.math.FunctionEvaluationException: hi!, 10.0, 0.0]");
        org.junit.Assert.assertNotNull(throwableArray31);
        org.junit.Assert.assertNotNull(objArray44);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray44), "[1, 10, 1]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray44), "[1, 10, 1]");
        org.junit.Assert.assertNotNull(objArray51);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray51), "[, 1, org.apache.commons.math.FunctionEvaluationException: hi!, 10.0, 0.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray51), "[, 1, org.apache.commons.math.FunctionEvaluationException: hi!, 10.0, 0.0]");
        org.junit.Assert.assertNotNull(throwableArray56);
        org.junit.Assert.assertNotNull(objArray65);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray65), "[1, 10, 1]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray65), "[1, 10, 1]");
        org.junit.Assert.assertEquals("'" + str71 + "' != '" + "hi!" + "'", str71, "hi!");
        org.junit.Assert.assertNotNull(throwableArray74);
        org.junit.Assert.assertNotNull(objArray83);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray83), "[1, 10, 1]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray83), "[1, 10, 1]");
        org.junit.Assert.assertEquals("'" + str86 + "' != '" + "" + "'", str86, "");
        org.junit.Assert.assertEquals("'" + str89 + "' != '" + "" + "'", str89, "");
        org.junit.Assert.assertNotNull(throwableArray90);
        org.junit.Assert.assertTrue("'" + double93 + "' != '" + 100.0d + "'", double93 == 100.0d);
        org.junit.Assert.assertTrue("'" + double94 + "' != '" + 100.0d + "'", double94 == 100.0d);
    }

    @Test
    public void test16521() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest33.test16521");
        java.lang.Object[] objArray13 = new java.lang.Object[] { 1L, (byte) 10, (short) 1 };
        org.apache.commons.math.FunctionEvaluationException functionEvaluationException14 = new org.apache.commons.math.FunctionEvaluationException((-1.0d), "hi!", objArray13);
        java.lang.Throwable throwable15 = null;
        org.apache.commons.math.FunctionEvaluationException functionEvaluationException16 = new org.apache.commons.math.FunctionEvaluationException((double) (short) 1, "hi!", objArray13, throwable15);
        java.lang.String str17 = functionEvaluationException16.getPattern();
        java.lang.Throwable[] throwableArray18 = functionEvaluationException16.getSuppressed();
        java.lang.String str19 = functionEvaluationException16.getPattern();
        org.apache.commons.math.FunctionEvaluationException functionEvaluationException20 = new org.apache.commons.math.FunctionEvaluationException((double) 100L, "org.apache.commons.math.ConvergenceException: org.apache.commons.math.FunctionEvaluationException: hi!", (java.lang.Throwable) functionEvaluationException16);
        java.lang.Object[] objArray21 = functionEvaluationException16.getArguments();
        org.apache.commons.math.MaxIterationsExceededException maxIterationsExceededException22 = new org.apache.commons.math.MaxIterationsExceededException((int) (short) 100, "org.apache.commons.math.MaxIterationsExceededException: Maximal number of iterations (3) exceeded", objArray21);
        java.lang.String[] strArray29 = new java.lang.String[] { "org.apache.commons.math.FunctionEvaluationException: hi!" };
        org.apache.commons.math.ode.DerivativeException derivativeException30 = new org.apache.commons.math.ode.DerivativeException("hi!", strArray29);
        org.apache.commons.math.ode.DerivativeException derivativeException31 = new org.apache.commons.math.ode.DerivativeException("", strArray29);
        org.apache.commons.math.ode.DerivativeException derivativeException32 = new org.apache.commons.math.ode.DerivativeException("Evaluation failed for argument = {0}", strArray29);
        org.apache.commons.math.ode.DerivativeException derivativeException33 = new org.apache.commons.math.ode.DerivativeException("org.apache.commons.math.ode.DerivativeException: org.apache.commons.math.ode.DerivativeException: ", strArray29);
        java.lang.Throwable throwable38 = null;
        org.apache.commons.math.ConvergenceException convergenceException39 = new org.apache.commons.math.ConvergenceException("hi!", throwable38);
        org.apache.commons.math.ConvergenceException convergenceException40 = new org.apache.commons.math.ConvergenceException(throwable38);
        org.apache.commons.math.FunctionEvaluationException functionEvaluationException41 = new org.apache.commons.math.FunctionEvaluationException((double) ' ', (java.lang.Throwable) convergenceException40);
        java.lang.Throwable[] throwableArray42 = functionEvaluationException41.getSuppressed();
        org.apache.commons.math.MaxIterationsExceededException maxIterationsExceededException43 = new org.apache.commons.math.MaxIterationsExceededException((int) (short) 100, "org.apache.commons.math.ConvergenceException: org.apache.commons.math.FunctionEvaluationException: hi!", (java.lang.Object[]) throwableArray42);
        org.apache.commons.math.ConvergenceException convergenceException44 = new org.apache.commons.math.ConvergenceException((java.lang.Throwable) maxIterationsExceededException43);
        org.apache.commons.math.ConvergenceException convergenceException45 = new org.apache.commons.math.ConvergenceException("org.apache.commons.math.FunctionEvaluationException: Evaluation failed for argument = 0", (java.lang.Object[]) strArray29, (java.lang.Throwable) maxIterationsExceededException43);
        java.lang.String[] strArray56 = new java.lang.String[] { "hi!", "", "hi!", "hi!", "hi!" };
        org.apache.commons.math.ode.DerivativeException derivativeException57 = new org.apache.commons.math.ode.DerivativeException("", strArray56);
        org.apache.commons.math.ode.DerivativeException derivativeException58 = new org.apache.commons.math.ode.DerivativeException("org.apache.commons.math.FunctionEvaluationException: hi!", strArray56);
        org.apache.commons.math.ode.DerivativeException derivativeException59 = new org.apache.commons.math.ode.DerivativeException("org.apache.commons.math.FunctionEvaluationException: ", strArray56);
        java.lang.String[] strArray68 = new java.lang.String[] { "hi!", "", "hi!", "hi!", "hi!" };
        org.apache.commons.math.ode.DerivativeException derivativeException69 = new org.apache.commons.math.ode.DerivativeException("", strArray68);
        org.apache.commons.math.ode.DerivativeException derivativeException70 = new org.apache.commons.math.ode.DerivativeException("", strArray68);
        org.apache.commons.math.ConvergenceException convergenceException71 = new org.apache.commons.math.ConvergenceException("org.apache.commons.math.FunctionEvaluationException: hi!", (java.lang.Object[]) strArray68);
        org.apache.commons.math.FunctionEvaluationException functionEvaluationException72 = new org.apache.commons.math.FunctionEvaluationException((double) 1L, "org.apache.commons.math.ConvergenceException: org.apache.commons.math.FunctionEvaluationException: hi!", (java.lang.Object[]) strArray56, (java.lang.Throwable) convergenceException71);
        maxIterationsExceededException43.addSuppressed((java.lang.Throwable) convergenceException71);
        org.apache.commons.math.FunctionEvaluationException functionEvaluationException74 = new org.apache.commons.math.FunctionEvaluationException(35.0d, "org.apache.commons.math.ode.DerivativeException: org.apache.commons.math.ConvergenceException: org.apache.commons.math.FunctionEvaluationException: hi!", objArray21, (java.lang.Throwable) maxIterationsExceededException43);
        java.lang.Throwable[] throwableArray75 = maxIterationsExceededException43.getSuppressed();
        int int76 = maxIterationsExceededException43.getMaxIterations();
        org.apache.commons.math.ConvergenceException convergenceException77 = new org.apache.commons.math.ConvergenceException((java.lang.Throwable) maxIterationsExceededException43);
        org.junit.Assert.assertNotNull(objArray13);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray13), "[1, 10, 1]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray13), "[1, 10, 1]");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "hi!" + "'", str17, "hi!");
        org.junit.Assert.assertNotNull(throwableArray18);
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "hi!" + "'", str19, "hi!");
        org.junit.Assert.assertNotNull(objArray21);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray21), "[1, 10, 1]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray21), "[1, 10, 1]");
        org.junit.Assert.assertNotNull(strArray29);
        org.junit.Assert.assertNotNull(throwableArray42);
        org.junit.Assert.assertNotNull(strArray56);
        org.junit.Assert.assertNotNull(strArray68);
        org.junit.Assert.assertNotNull(throwableArray75);
        org.junit.Assert.assertTrue("'" + int76 + "' != '" + 100 + "'", int76 == 100);
    }

    @Test
    public void test16522() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest33.test16522");
        java.lang.String[] strArray9 = new java.lang.String[] { "org.apache.commons.math.FunctionEvaluationException: hi!" };
        org.apache.commons.math.ode.DerivativeException derivativeException10 = new org.apache.commons.math.ode.DerivativeException("hi!", strArray9);
        org.apache.commons.math.ode.DerivativeException derivativeException11 = new org.apache.commons.math.ode.DerivativeException("", strArray9);
        org.apache.commons.math.MaxIterationsExceededException maxIterationsExceededException12 = new org.apache.commons.math.MaxIterationsExceededException((-1), "org.apache.commons.math.MaxIterationsExceededException: org.apache.commons.math.ode.DerivativeException: ", (java.lang.Object[]) strArray9);
        org.apache.commons.math.ode.DerivativeException derivativeException13 = new org.apache.commons.math.ode.DerivativeException("org.apache.commons.math.FunctionEvaluationException: Evaluation failed for argument = {0}", strArray9);
        org.apache.commons.math.ConvergenceException convergenceException14 = new org.apache.commons.math.ConvergenceException("org.apache.commons.math.FunctionEvaluationException: org.apache.commons.math.ode.DerivativeException: org.apache.commons.math.ConvergenceException: org.apache.commons.math.ConvergenceException: org.apache.commons.math.FunctionEvaluationException: hi!", (java.lang.Object[]) strArray9);
        java.lang.Object[] objArray25 = new java.lang.Object[] { 1L, (byte) 10, (short) 1 };
        org.apache.commons.math.FunctionEvaluationException functionEvaluationException26 = new org.apache.commons.math.FunctionEvaluationException((-1.0d), "hi!", objArray25);
        org.apache.commons.math.FunctionEvaluationException functionEvaluationException27 = new org.apache.commons.math.FunctionEvaluationException((double) 0L, "", objArray25);
        java.lang.String str28 = functionEvaluationException27.getPattern();
        org.apache.commons.math.ode.DerivativeException derivativeException29 = new org.apache.commons.math.ode.DerivativeException((java.lang.Throwable) functionEvaluationException27);
        org.apache.commons.math.FunctionEvaluationException functionEvaluationException30 = new org.apache.commons.math.FunctionEvaluationException((double) '#', (java.lang.Throwable) functionEvaluationException27);
        double double31 = functionEvaluationException30.getArgument();
        org.apache.commons.math.FunctionEvaluationException functionEvaluationException32 = new org.apache.commons.math.FunctionEvaluationException((double) (byte) 1, (java.lang.Throwable) functionEvaluationException30);
        org.apache.commons.math.ConvergenceException convergenceException33 = new org.apache.commons.math.ConvergenceException("org.apache.commons.math.ConvergenceException: hi!", (java.lang.Throwable) functionEvaluationException32);
        double double34 = functionEvaluationException32.getArgument();
        org.apache.commons.math.ConvergenceException convergenceException35 = new org.apache.commons.math.ConvergenceException("org.apache.commons.math.MaxIterationsExceededException: org.apache.commons.math.MaxIterationsExceededException: org.apache.commons.math.FunctionEvaluationException: Evaluation failed for argument = 0", (java.lang.Object[]) strArray9, (java.lang.Throwable) functionEvaluationException32);
        org.apache.commons.math.ode.DerivativeException derivativeException36 = new org.apache.commons.math.ode.DerivativeException("org.apache.commons.math.FunctionEvaluationException: org.apache.commons.math.FunctionEvaluationException", strArray9);
        org.apache.commons.math.ode.DerivativeException derivativeException37 = new org.apache.commons.math.ode.DerivativeException((java.lang.Throwable) derivativeException36);
        java.lang.String str38 = derivativeException37.getPattern();
        org.junit.Assert.assertNotNull(strArray9);
        org.junit.Assert.assertNotNull(objArray25);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray25), "[1, 10, 1]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray25), "[1, 10, 1]");
        org.junit.Assert.assertEquals("'" + str28 + "' != '" + "" + "'", str28, "");
        org.junit.Assert.assertTrue("'" + double31 + "' != '" + 35.0d + "'", double31 == 35.0d);
        org.junit.Assert.assertTrue("'" + double34 + "' != '" + 1.0d + "'", double34 == 1.0d);
        org.junit.Assert.assertEquals("'" + str38 + "' != '" + "org.apache.commons.math.FunctionEvaluationException: org.apache.commons.math.FunctionEvaluationException" + "'", str38, "org.apache.commons.math.FunctionEvaluationException: org.apache.commons.math.FunctionEvaluationException");
    }

    @Test
    public void test16523() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest33.test16523");
        java.lang.String[] strArray13 = new java.lang.String[] { "hi!", "", "hi!", "hi!", "hi!" };
        org.apache.commons.math.ode.DerivativeException derivativeException14 = new org.apache.commons.math.ode.DerivativeException("", strArray13);
        org.apache.commons.math.ode.DerivativeException derivativeException15 = new org.apache.commons.math.ode.DerivativeException("org.apache.commons.math.FunctionEvaluationException: hi!", strArray13);
        org.apache.commons.math.MaxIterationsExceededException maxIterationsExceededException18 = new org.apache.commons.math.MaxIterationsExceededException(0);
        org.apache.commons.math.ConvergenceException convergenceException19 = new org.apache.commons.math.ConvergenceException("org.apache.commons.math.ConvergenceException: org.apache.commons.math.FunctionEvaluationException: hi!", (java.lang.Throwable) maxIterationsExceededException18);
        org.apache.commons.math.ConvergenceException convergenceException20 = new org.apache.commons.math.ConvergenceException("", (java.lang.Object[]) strArray13, (java.lang.Throwable) maxIterationsExceededException18);
        org.apache.commons.math.ode.DerivativeException derivativeException21 = new org.apache.commons.math.ode.DerivativeException("org.apache.commons.math.ConvergenceException: org.apache.commons.math.FunctionEvaluationException: hi!", strArray13);
        java.lang.String[] strArray32 = new java.lang.String[] { "hi!", "", "hi!", "hi!", "hi!" };
        org.apache.commons.math.ode.DerivativeException derivativeException33 = new org.apache.commons.math.ode.DerivativeException("", strArray32);
        org.apache.commons.math.MaxIterationsExceededException maxIterationsExceededException34 = new org.apache.commons.math.MaxIterationsExceededException(10, "org.apache.commons.math.FunctionEvaluationException: Evaluation failed for argument = 0", (java.lang.Object[]) strArray32);
        org.apache.commons.math.MaxIterationsExceededException maxIterationsExceededException36 = new org.apache.commons.math.MaxIterationsExceededException(3);
        org.apache.commons.math.FunctionEvaluationException functionEvaluationException37 = new org.apache.commons.math.FunctionEvaluationException((double) 0, "hi!", (java.lang.Object[]) strArray32, (java.lang.Throwable) maxIterationsExceededException36);
        org.apache.commons.math.FunctionEvaluationException functionEvaluationException38 = new org.apache.commons.math.FunctionEvaluationException((double) 100L, "org.apache.commons.math.ode.DerivativeException: org.apache.commons.math.ConvergenceException: org.apache.commons.math.ode.DerivativeException: ", (java.lang.Object[]) strArray13, (java.lang.Throwable) maxIterationsExceededException36);
        org.apache.commons.math.ode.DerivativeException derivativeException39 = new org.apache.commons.math.ode.DerivativeException("org.apache.commons.math.FunctionEvaluationException: org.apache.commons.math.FunctionEvaluationException: org.apache.commons.math.ConvergenceException: ", strArray13);
        org.apache.commons.math.ode.DerivativeException derivativeException40 = new org.apache.commons.math.ode.DerivativeException("org.apache.commons.math.MaxIterationsExceededException: org.apache.commons.math.FunctionEvaluationException: org.apache.commons.math.MaxIterationsExceededException: org.apache.commons.math.ConvergenceException: ", strArray13);
        org.junit.Assert.assertNotNull(strArray13);
        org.junit.Assert.assertNotNull(strArray32);
    }

    @Test
    public void test16524() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest33.test16524");
        java.lang.String[] strArray20 = new java.lang.String[] { "hi!", "", "hi!", "hi!", "hi!" };
        org.apache.commons.math.ode.DerivativeException derivativeException21 = new org.apache.commons.math.ode.DerivativeException("", strArray20);
        org.apache.commons.math.ode.DerivativeException derivativeException22 = new org.apache.commons.math.ode.DerivativeException("", strArray20);
        java.lang.String[] strArray29 = new java.lang.String[] { "hi!", "", "hi!", "hi!", "hi!" };
        org.apache.commons.math.ode.DerivativeException derivativeException30 = new org.apache.commons.math.ode.DerivativeException("", strArray29);
        org.apache.commons.math.ode.DerivativeException derivativeException31 = new org.apache.commons.math.ode.DerivativeException((java.lang.Throwable) derivativeException30);
        org.apache.commons.math.ConvergenceException convergenceException32 = new org.apache.commons.math.ConvergenceException("hi!", (java.lang.Object[]) strArray20, (java.lang.Throwable) derivativeException30);
        org.apache.commons.math.ode.DerivativeException derivativeException33 = new org.apache.commons.math.ode.DerivativeException("hi!", strArray20);
        java.lang.Object[] objArray41 = new java.lang.Object[] { 1L, (byte) 10, (short) 1 };
        org.apache.commons.math.FunctionEvaluationException functionEvaluationException42 = new org.apache.commons.math.FunctionEvaluationException((-1.0d), "hi!", objArray41);
        java.lang.Throwable throwable43 = null;
        org.apache.commons.math.FunctionEvaluationException functionEvaluationException44 = new org.apache.commons.math.FunctionEvaluationException((double) (short) 1, "hi!", objArray41, throwable43);
        org.apache.commons.math.ConvergenceException convergenceException45 = new org.apache.commons.math.ConvergenceException("org.apache.commons.math.FunctionEvaluationException: hi!", (java.lang.Object[]) strArray20, throwable43);
        org.apache.commons.math.FunctionEvaluationException functionEvaluationException46 = new org.apache.commons.math.FunctionEvaluationException((double) 10L, "org.apache.commons.math.ConvergenceException: org.apache.commons.math.FunctionEvaluationException: hi!", (java.lang.Object[]) strArray20);
        org.apache.commons.math.MaxIterationsExceededException maxIterationsExceededException49 = new org.apache.commons.math.MaxIterationsExceededException(0);
        org.apache.commons.math.ConvergenceException convergenceException50 = new org.apache.commons.math.ConvergenceException("org.apache.commons.math.ConvergenceException: org.apache.commons.math.FunctionEvaluationException: hi!", (java.lang.Throwable) maxIterationsExceededException49);
        org.apache.commons.math.FunctionEvaluationException functionEvaluationException51 = new org.apache.commons.math.FunctionEvaluationException((double) 0.0f, "org.apache.commons.math.ode.DerivativeException: ", (java.lang.Object[]) strArray20, (java.lang.Throwable) maxIterationsExceededException49);
        org.apache.commons.math.FunctionEvaluationException functionEvaluationException52 = new org.apache.commons.math.FunctionEvaluationException((double) '#', "org.apache.commons.math.FunctionEvaluationException: ", (java.lang.Object[]) strArray20);
        org.apache.commons.math.ConvergenceException convergenceException53 = new org.apache.commons.math.ConvergenceException("org.apache.commons.math.ConvergenceException: org.apache.commons.math.FunctionEvaluationException: Evaluation failed for argument = 0", (java.lang.Object[]) strArray20);
        org.apache.commons.math.ode.DerivativeException derivativeException54 = new org.apache.commons.math.ode.DerivativeException("org.apache.commons.math.ConvergenceException: org.apache.commons.math.FunctionEvaluationException: org.apache.commons.math.ode.DerivativeException: ", strArray20);
        org.apache.commons.math.ode.DerivativeException derivativeException55 = new org.apache.commons.math.ode.DerivativeException("org.apache.commons.math.FunctionEvaluationException: org.apache.commons.math.MaxIterationsExceededException: org.apache.commons.math.ConvergenceException: org.apache.commons.math.FunctionEvaluationException: org.apache.commons.math.ode.DerivativeException: ", strArray20);
        org.apache.commons.math.ode.DerivativeException derivativeException56 = new org.apache.commons.math.ode.DerivativeException("org.apache.commons.math.ConvergenceException: org.apache.commons.math.ConvergenceException: org.apache.commons.math.FunctionEvaluationException: org.apache.commons.math.ode.DerivativeException: ", strArray20);
        org.junit.Assert.assertNotNull(strArray20);
        org.junit.Assert.assertNotNull(strArray29);
        org.junit.Assert.assertNotNull(objArray41);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray41), "[1, 10, 1]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray41), "[1, 10, 1]");
    }

    @Test
    public void test16525() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest33.test16525");
        java.lang.String[] strArray12 = new java.lang.String[] { "hi!", "", "hi!", "hi!", "hi!" };
        org.apache.commons.math.ode.DerivativeException derivativeException13 = new org.apache.commons.math.ode.DerivativeException("", strArray12);
        org.apache.commons.math.MaxIterationsExceededException maxIterationsExceededException14 = new org.apache.commons.math.MaxIterationsExceededException(10, "org.apache.commons.math.FunctionEvaluationException: Evaluation failed for argument = 0", (java.lang.Object[]) strArray12);
        org.apache.commons.math.MaxIterationsExceededException maxIterationsExceededException15 = new org.apache.commons.math.MaxIterationsExceededException((int) (short) 10, "org.apache.commons.math.FunctionEvaluationException", (java.lang.Object[]) strArray12);
        org.apache.commons.math.ode.DerivativeException derivativeException16 = new org.apache.commons.math.ode.DerivativeException("org.apache.commons.math.FunctionEvaluationException: org.apache.commons.math.MaxIterationsExceededException: org.apache.commons.math.ConvergenceException: org.apache.commons.math.ConvergenceException: org.apache.commons.math.FunctionEvaluationException: hi!", strArray12);
        java.lang.Throwable throwable21 = null;
        org.apache.commons.math.ConvergenceException convergenceException22 = new org.apache.commons.math.ConvergenceException("hi!", throwable21);
        org.apache.commons.math.ode.DerivativeException derivativeException23 = new org.apache.commons.math.ode.DerivativeException((java.lang.Throwable) convergenceException22);
        java.lang.Throwable[] throwableArray24 = derivativeException23.getSuppressed();
        org.apache.commons.math.ConvergenceException convergenceException25 = new org.apache.commons.math.ConvergenceException("hi!", (java.lang.Throwable) derivativeException23);
        org.apache.commons.math.FunctionEvaluationException functionEvaluationException26 = new org.apache.commons.math.FunctionEvaluationException(0.0d, "", (java.lang.Throwable) convergenceException25);
        org.apache.commons.math.ConvergenceException convergenceException27 = new org.apache.commons.math.ConvergenceException("org.apache.commons.math.FunctionEvaluationException: org.apache.commons.math.FunctionEvaluationException: ", (java.lang.Object[]) strArray12, (java.lang.Throwable) convergenceException25);
        org.apache.commons.math.ConvergenceException convergenceException28 = new org.apache.commons.math.ConvergenceException((java.lang.Throwable) convergenceException25);
        java.lang.Object[] objArray29 = convergenceException25.getArguments();
        org.junit.Assert.assertNotNull(strArray12);
        org.junit.Assert.assertNotNull(throwableArray24);
        org.junit.Assert.assertNotNull(objArray29);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray29), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray29), "[]");
    }

    @Test
    public void test16526() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest33.test16526");
        java.lang.String[] strArray17 = new java.lang.String[] { "hi!", "", "hi!", "hi!", "hi!" };
        org.apache.commons.math.ode.DerivativeException derivativeException18 = new org.apache.commons.math.ode.DerivativeException("", strArray17);
        org.apache.commons.math.ode.DerivativeException derivativeException19 = new org.apache.commons.math.ode.DerivativeException("org.apache.commons.math.FunctionEvaluationException: hi!", strArray17);
        org.apache.commons.math.MaxIterationsExceededException maxIterationsExceededException22 = new org.apache.commons.math.MaxIterationsExceededException(0);
        org.apache.commons.math.ConvergenceException convergenceException23 = new org.apache.commons.math.ConvergenceException("org.apache.commons.math.ConvergenceException: org.apache.commons.math.FunctionEvaluationException: hi!", (java.lang.Throwable) maxIterationsExceededException22);
        org.apache.commons.math.ConvergenceException convergenceException24 = new org.apache.commons.math.ConvergenceException("", (java.lang.Object[]) strArray17, (java.lang.Throwable) maxIterationsExceededException22);
        java.lang.Object[] objArray32 = new java.lang.Object[] { 1L, (byte) 10, (short) 1 };
        org.apache.commons.math.FunctionEvaluationException functionEvaluationException33 = new org.apache.commons.math.FunctionEvaluationException((-1.0d), "hi!", objArray32);
        org.apache.commons.math.FunctionEvaluationException functionEvaluationException34 = new org.apache.commons.math.FunctionEvaluationException((double) 0L, "", objArray32);
        java.lang.String str35 = functionEvaluationException34.getPattern();
        org.apache.commons.math.FunctionEvaluationException functionEvaluationException36 = new org.apache.commons.math.FunctionEvaluationException((double) (-1.0f), "Evaluation failed for argument = {0}", (java.lang.Object[]) strArray17, (java.lang.Throwable) functionEvaluationException34);
        org.apache.commons.math.MaxIterationsExceededException maxIterationsExceededException39 = new org.apache.commons.math.MaxIterationsExceededException((int) (byte) 10);
        int int40 = maxIterationsExceededException39.getMaxIterations();
        org.apache.commons.math.FunctionEvaluationException functionEvaluationException41 = new org.apache.commons.math.FunctionEvaluationException(0.0d, (java.lang.Throwable) maxIterationsExceededException39);
        org.apache.commons.math.FunctionEvaluationException functionEvaluationException42 = new org.apache.commons.math.FunctionEvaluationException((double) 100, "org.apache.commons.math.FunctionEvaluationException: hi!", (java.lang.Object[]) strArray17, (java.lang.Throwable) functionEvaluationException41);
        org.apache.commons.math.FunctionEvaluationException functionEvaluationException43 = new org.apache.commons.math.FunctionEvaluationException((double) 100, "org.apache.commons.math.ConvergenceException: org.apache.commons.math.FunctionEvaluationException: org.apache.commons.math.ConvergenceException: hi!", (java.lang.Object[]) strArray17);
        org.apache.commons.math.ode.DerivativeException derivativeException44 = new org.apache.commons.math.ode.DerivativeException("", strArray17);
        org.apache.commons.math.FunctionEvaluationException functionEvaluationException45 = new org.apache.commons.math.FunctionEvaluationException(52.0d, "org.apache.commons.math.ode.DerivativeException: org.apache.commons.math.FunctionEvaluationException: org.apache.commons.math.FunctionEvaluationException: Evaluation failed for argument = 2", (java.lang.Object[]) strArray17);
        java.lang.Class<?> wildcardClass46 = functionEvaluationException45.getClass();
        org.junit.Assert.assertNotNull(strArray17);
        org.junit.Assert.assertNotNull(objArray32);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray32), "[1, 10, 1]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray32), "[1, 10, 1]");
        org.junit.Assert.assertEquals("'" + str35 + "' != '" + "" + "'", str35, "");
        org.junit.Assert.assertTrue("'" + int40 + "' != '" + 10 + "'", int40 == 10);
        org.junit.Assert.assertNotNull(wildcardClass46);
    }

    @Test
    public void test16527() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest33.test16527");
        org.apache.commons.math.FunctionEvaluationException functionEvaluationException2 = new org.apache.commons.math.FunctionEvaluationException((double) 100, "org.apache.commons.math.ConvergenceException: org.apache.commons.math.ConvergenceException: org.apache.commons.math.ConvergenceException: org.apache.commons.math.ConvergenceException: org.apache.commons.math.FunctionEvaluationException: hi!");
    }

    @Test
    public void test16528() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest33.test16528");
        java.lang.Object[] objArray18 = new java.lang.Object[] { 1L, (byte) 10, (short) 1 };
        org.apache.commons.math.FunctionEvaluationException functionEvaluationException19 = new org.apache.commons.math.FunctionEvaluationException((-1.0d), "hi!", objArray18);
        org.apache.commons.math.FunctionEvaluationException functionEvaluationException20 = new org.apache.commons.math.FunctionEvaluationException((double) 0L, "", objArray18);
        java.lang.String str21 = functionEvaluationException20.getPattern();
        org.apache.commons.math.ode.DerivativeException derivativeException22 = new org.apache.commons.math.ode.DerivativeException((java.lang.Throwable) functionEvaluationException20);
        org.apache.commons.math.FunctionEvaluationException functionEvaluationException23 = new org.apache.commons.math.FunctionEvaluationException((double) '#', (java.lang.Throwable) functionEvaluationException20);
        java.lang.Object[] objArray24 = functionEvaluationException20.getArguments();
        java.lang.String[] strArray39 = new java.lang.String[] { "hi!", "", "hi!", "hi!", "hi!" };
        org.apache.commons.math.ode.DerivativeException derivativeException40 = new org.apache.commons.math.ode.DerivativeException("", strArray39);
        org.apache.commons.math.ode.DerivativeException derivativeException41 = new org.apache.commons.math.ode.DerivativeException("", strArray39);
        java.lang.String[] strArray48 = new java.lang.String[] { "hi!", "", "hi!", "hi!", "hi!" };
        org.apache.commons.math.ode.DerivativeException derivativeException49 = new org.apache.commons.math.ode.DerivativeException("", strArray48);
        org.apache.commons.math.ode.DerivativeException derivativeException50 = new org.apache.commons.math.ode.DerivativeException((java.lang.Throwable) derivativeException49);
        org.apache.commons.math.ConvergenceException convergenceException51 = new org.apache.commons.math.ConvergenceException("hi!", (java.lang.Object[]) strArray39, (java.lang.Throwable) derivativeException49);
        org.apache.commons.math.ode.DerivativeException derivativeException52 = new org.apache.commons.math.ode.DerivativeException("hi!", strArray39);
        java.lang.Object[] objArray60 = new java.lang.Object[] { 1L, (byte) 10, (short) 1 };
        org.apache.commons.math.FunctionEvaluationException functionEvaluationException61 = new org.apache.commons.math.FunctionEvaluationException((-1.0d), "hi!", objArray60);
        java.lang.Throwable throwable62 = null;
        org.apache.commons.math.FunctionEvaluationException functionEvaluationException63 = new org.apache.commons.math.FunctionEvaluationException((double) (short) 1, "hi!", objArray60, throwable62);
        org.apache.commons.math.ConvergenceException convergenceException64 = new org.apache.commons.math.ConvergenceException("org.apache.commons.math.FunctionEvaluationException: hi!", (java.lang.Object[]) strArray39, throwable62);
        org.apache.commons.math.FunctionEvaluationException functionEvaluationException65 = new org.apache.commons.math.FunctionEvaluationException((double) 10L, "org.apache.commons.math.ConvergenceException: org.apache.commons.math.FunctionEvaluationException: hi!", (java.lang.Object[]) strArray39);
        org.apache.commons.math.ode.DerivativeException derivativeException66 = new org.apache.commons.math.ode.DerivativeException("org.apache.commons.math.ConvergenceException: org.apache.commons.math.FunctionEvaluationException: hi!", strArray39);
        org.apache.commons.math.FunctionEvaluationException functionEvaluationException67 = new org.apache.commons.math.FunctionEvaluationException(35.0d, (java.lang.Throwable) derivativeException66);
        java.lang.Throwable[] throwableArray68 = functionEvaluationException67.getSuppressed();
        org.apache.commons.math.ConvergenceException convergenceException69 = new org.apache.commons.math.ConvergenceException("org.apache.commons.math.FunctionEvaluationException: org.apache.commons.math.ConvergenceException: org.apache.commons.math.FunctionEvaluationException: hi!", objArray24, (java.lang.Throwable) functionEvaluationException67);
        org.apache.commons.math.FunctionEvaluationException functionEvaluationException70 = new org.apache.commons.math.FunctionEvaluationException(100.0d, "Evaluation failed for argument = {0}", objArray24);
        org.apache.commons.math.ConvergenceException convergenceException71 = new org.apache.commons.math.ConvergenceException("org.apache.commons.math.ConvergenceException: org.apache.commons.math.FunctionEvaluationException: Maximal number of iterations (0) exceeded", objArray24);
        org.apache.commons.math.ConvergenceException convergenceException73 = new org.apache.commons.math.ConvergenceException("org.apache.commons.math.FunctionEvaluationException: ");
        java.lang.String str74 = convergenceException73.getPattern();
        java.lang.Object[] objArray75 = convergenceException73.getArguments();
        org.apache.commons.math.FunctionEvaluationException functionEvaluationException76 = new org.apache.commons.math.FunctionEvaluationException((double) 1.0f, "org.apache.commons.math.FunctionEvaluationException: org.apache.commons.math.FunctionEvaluationException: org.apache.commons.math.ConvergenceException: Evaluation failed for argument = {0}", objArray24, (java.lang.Throwable) convergenceException73);
        org.apache.commons.math.ConvergenceException convergenceException77 = new org.apache.commons.math.ConvergenceException("org.apache.commons.math.FunctionEvaluationException: org.apache.commons.math.MaxIterationsExceededException: org.apache.commons.math.ConvergenceException: org.apache.commons.math.ode.DerivativeException: ", objArray24);
        org.apache.commons.math.ConvergenceException convergenceException78 = new org.apache.commons.math.ConvergenceException("Evaluation failed for argument = 10", objArray24);
        java.lang.String str79 = convergenceException78.getPattern();
        org.apache.commons.math.FunctionEvaluationException functionEvaluationException80 = new org.apache.commons.math.FunctionEvaluationException(100.0d, "org.apache.commons.math.ConvergenceException: Maximal number of iterations (32) exceeded", (java.lang.Throwable) convergenceException78);
        org.junit.Assert.assertNotNull(objArray18);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray18), "[1, 10, 1]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray18), "[1, 10, 1]");
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "" + "'", str21, "");
        org.junit.Assert.assertNotNull(objArray24);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray24), "[1, 10, 1]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray24), "[1, 10, 1]");
        org.junit.Assert.assertNotNull(strArray39);
        org.junit.Assert.assertNotNull(strArray48);
        org.junit.Assert.assertNotNull(objArray60);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray60), "[1, 10, 1]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray60), "[1, 10, 1]");
        org.junit.Assert.assertNotNull(throwableArray68);
        org.junit.Assert.assertEquals("'" + str74 + "' != '" + "org.apache.commons.math.FunctionEvaluationException: " + "'", str74, "org.apache.commons.math.FunctionEvaluationException: ");
        org.junit.Assert.assertNotNull(objArray75);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray75), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray75), "[]");
        org.junit.Assert.assertEquals("'" + str79 + "' != '" + "Evaluation failed for argument = 10" + "'", str79, "Evaluation failed for argument = 10");
    }

    @Test
    public void test16529() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest33.test16529");
        java.lang.Throwable throwable6 = null;
        org.apache.commons.math.ConvergenceException convergenceException7 = new org.apache.commons.math.ConvergenceException("hi!", throwable6);
        org.apache.commons.math.ode.DerivativeException derivativeException8 = new org.apache.commons.math.ode.DerivativeException((java.lang.Throwable) convergenceException7);
        java.lang.Throwable[] throwableArray9 = derivativeException8.getSuppressed();
        org.apache.commons.math.ConvergenceException convergenceException10 = new org.apache.commons.math.ConvergenceException("org.apache.commons.math.FunctionEvaluationException: hi!", (java.lang.Object[]) throwableArray9);
        org.apache.commons.math.FunctionEvaluationException functionEvaluationException11 = new org.apache.commons.math.FunctionEvaluationException((double) (short) -1, "org.apache.commons.math.FunctionEvaluationException: hi!", (java.lang.Object[]) throwableArray9);
        java.lang.Object[] objArray23 = new java.lang.Object[] { 1L, (byte) 10, (short) 1 };
        org.apache.commons.math.FunctionEvaluationException functionEvaluationException24 = new org.apache.commons.math.FunctionEvaluationException((-1.0d), "hi!", objArray23);
        org.apache.commons.math.FunctionEvaluationException functionEvaluationException25 = new org.apache.commons.math.FunctionEvaluationException((double) 0L, "", objArray23);
        java.lang.String str26 = functionEvaluationException25.getPattern();
        org.apache.commons.math.ode.DerivativeException derivativeException27 = new org.apache.commons.math.ode.DerivativeException((java.lang.Throwable) functionEvaluationException25);
        java.lang.Object[] objArray28 = derivativeException27.getArguments();
        java.lang.String[] strArray36 = new java.lang.String[] { "hi!", "", "hi!", "hi!", "hi!" };
        org.apache.commons.math.ode.DerivativeException derivativeException37 = new org.apache.commons.math.ode.DerivativeException("", strArray36);
        org.apache.commons.math.ode.DerivativeException derivativeException38 = new org.apache.commons.math.ode.DerivativeException("org.apache.commons.math.ConvergenceException: org.apache.commons.math.FunctionEvaluationException: hi!", strArray36);
        org.apache.commons.math.FunctionEvaluationException functionEvaluationException39 = new org.apache.commons.math.FunctionEvaluationException((double) (byte) -1, "org.apache.commons.math.FunctionEvaluationException: Evaluation failed for argument = 0", objArray28, (java.lang.Throwable) derivativeException38);
        org.apache.commons.math.MaxIterationsExceededException maxIterationsExceededException40 = new org.apache.commons.math.MaxIterationsExceededException((int) 'a', "", objArray28);
        org.apache.commons.math.ConvergenceException convergenceException41 = new org.apache.commons.math.ConvergenceException("org.apache.commons.math.ode.DerivativeException: ", (java.lang.Object[]) throwableArray9, (java.lang.Throwable) maxIterationsExceededException40);
        java.lang.String[] strArray44 = new java.lang.String[] { "org.apache.commons.math.FunctionEvaluationException: hi!" };
        org.apache.commons.math.ode.DerivativeException derivativeException45 = new org.apache.commons.math.ode.DerivativeException("hi!", strArray44);
        org.apache.commons.math.ConvergenceException convergenceException46 = new org.apache.commons.math.ConvergenceException("org.apache.commons.math.ode.DerivativeException: org.apache.commons.math.ode.DerivativeException: org.apache.commons.math.ConvergenceException: hi!", (java.lang.Object[]) throwableArray9, (java.lang.Throwable) derivativeException45);
        java.lang.Class<?> wildcardClass47 = throwableArray9.getClass();
        org.junit.Assert.assertNotNull(throwableArray9);
        org.junit.Assert.assertNotNull(objArray23);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray23), "[1, 10, 1]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray23), "[1, 10, 1]");
        org.junit.Assert.assertEquals("'" + str26 + "' != '" + "" + "'", str26, "");
        org.junit.Assert.assertNotNull(objArray28);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray28), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray28), "[]");
        org.junit.Assert.assertNotNull(strArray36);
        org.junit.Assert.assertNotNull(strArray44);
        org.junit.Assert.assertNotNull(wildcardClass47);
    }

    @Test
    public void test16530() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest33.test16530");
        org.apache.commons.math.MaxIterationsExceededException maxIterationsExceededException1 = new org.apache.commons.math.MaxIterationsExceededException(3);
        int int2 = maxIterationsExceededException1.getMaxIterations();
        int int3 = maxIterationsExceededException1.getMaxIterations();
        org.apache.commons.math.MaxIterationsExceededException maxIterationsExceededException6 = new org.apache.commons.math.MaxIterationsExceededException((int) (byte) 10);
        org.apache.commons.math.ConvergenceException convergenceException7 = new org.apache.commons.math.ConvergenceException("Evaluation failed for argument = {0}", (java.lang.Throwable) maxIterationsExceededException6);
        int int8 = maxIterationsExceededException6.getMaxIterations();
        org.apache.commons.math.ConvergenceException convergenceException9 = new org.apache.commons.math.ConvergenceException((java.lang.Throwable) maxIterationsExceededException6);
        org.apache.commons.math.ode.DerivativeException derivativeException10 = new org.apache.commons.math.ode.DerivativeException((java.lang.Throwable) convergenceException9);
        maxIterationsExceededException1.addSuppressed((java.lang.Throwable) convergenceException9);
        org.apache.commons.math.ConvergenceException convergenceException12 = new org.apache.commons.math.ConvergenceException((java.lang.Throwable) maxIterationsExceededException1);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 3 + "'", int2 == 3);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 3 + "'", int3 == 3);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 10 + "'", int8 == 10);
    }

    @Test
    public void test16531() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest33.test16531");
        org.apache.commons.math.FunctionEvaluationException functionEvaluationException3 = new org.apache.commons.math.FunctionEvaluationException(0.0d, "org.apache.commons.math.MaxIterationsExceededException: Evaluation failed for argument = {0}");
        double double4 = functionEvaluationException3.getArgument();
        org.apache.commons.math.ode.DerivativeException derivativeException5 = new org.apache.commons.math.ode.DerivativeException((java.lang.Throwable) functionEvaluationException3);
        double double6 = functionEvaluationException3.getArgument();
        org.apache.commons.math.ode.DerivativeException derivativeException7 = new org.apache.commons.math.ode.DerivativeException((java.lang.Throwable) functionEvaluationException3);
        org.apache.commons.math.ConvergenceException convergenceException8 = new org.apache.commons.math.ConvergenceException("org.apache.commons.math.FunctionEvaluationException: org.apache.commons.math.ConvergenceException: org.apache.commons.math.FunctionEvaluationException: org.apache.commons.math.ConvergenceException: org.apache.commons.math.ConvergenceException: org.apache.commons.math.FunctionEvaluationException: hi!", (java.lang.Throwable) functionEvaluationException3);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 0.0d + "'", double4 == 0.0d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.0d + "'", double6 == 0.0d);
    }

    @Test
    public void test16532() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest33.test16532");
        org.apache.commons.math.MaxIterationsExceededException maxIterationsExceededException11 = new org.apache.commons.math.MaxIterationsExceededException(0);
        java.lang.Throwable[] throwableArray12 = maxIterationsExceededException11.getSuppressed();
        org.apache.commons.math.ConvergenceException convergenceException13 = new org.apache.commons.math.ConvergenceException("org.apache.commons.math.ConvergenceException: org.apache.commons.math.FunctionEvaluationException: hi!", (java.lang.Object[]) throwableArray12);
        org.apache.commons.math.ConvergenceException convergenceException14 = new org.apache.commons.math.ConvergenceException("hi!", (java.lang.Object[]) throwableArray12);
        org.apache.commons.math.MaxIterationsExceededException maxIterationsExceededException15 = new org.apache.commons.math.MaxIterationsExceededException((int) (short) 0, "Evaluation failed for argument = {0}", (java.lang.Object[]) throwableArray12);
        org.apache.commons.math.FunctionEvaluationException functionEvaluationException16 = new org.apache.commons.math.FunctionEvaluationException(35.0d, "org.apache.commons.math.MaxIterationsExceededException: org.apache.commons.math.ode.DerivativeException: ", (java.lang.Object[]) throwableArray12);
        org.apache.commons.math.FunctionEvaluationException functionEvaluationException17 = new org.apache.commons.math.FunctionEvaluationException((double) (byte) 10, "org.apache.commons.math.FunctionEvaluationException: Evaluation failed for argument = 2", (java.lang.Object[]) throwableArray12);
        java.lang.String[] strArray28 = new java.lang.String[] { "hi!", "", "hi!", "hi!", "hi!" };
        org.apache.commons.math.ode.DerivativeException derivativeException29 = new org.apache.commons.math.ode.DerivativeException("", strArray28);
        org.apache.commons.math.ode.DerivativeException derivativeException30 = new org.apache.commons.math.ode.DerivativeException("", strArray28);
        java.lang.Throwable throwable33 = null;
        org.apache.commons.math.ConvergenceException convergenceException34 = new org.apache.commons.math.ConvergenceException("hi!", throwable33);
        org.apache.commons.math.ode.DerivativeException derivativeException35 = new org.apache.commons.math.ode.DerivativeException((java.lang.Throwable) convergenceException34);
        java.lang.Throwable[] throwableArray36 = derivativeException35.getSuppressed();
        org.apache.commons.math.ConvergenceException convergenceException37 = new org.apache.commons.math.ConvergenceException("hi!", (java.lang.Throwable) derivativeException35);
        derivativeException30.addSuppressed((java.lang.Throwable) convergenceException37);
        java.lang.Throwable[] throwableArray39 = derivativeException30.getSuppressed();
        java.lang.Object[] objArray46 = new java.lang.Object[] { 1L, (byte) 10, (short) 1 };
        org.apache.commons.math.FunctionEvaluationException functionEvaluationException47 = new org.apache.commons.math.FunctionEvaluationException((-1.0d), "hi!", objArray46);
        java.lang.Object[] objArray53 = new java.lang.Object[] { 10L, (-1L), 10, 0.0d };
        java.lang.Throwable throwable54 = null;
        org.apache.commons.math.ConvergenceException convergenceException55 = new org.apache.commons.math.ConvergenceException("hi!", objArray53, throwable54);
        org.apache.commons.math.ConvergenceException convergenceException56 = new org.apache.commons.math.ConvergenceException("Evaluation failed for argument = {0}", objArray46, (java.lang.Throwable) convergenceException55);
        org.apache.commons.math.ConvergenceException convergenceException57 = new org.apache.commons.math.ConvergenceException((java.lang.Throwable) convergenceException55);
        org.apache.commons.math.ConvergenceException convergenceException58 = new org.apache.commons.math.ConvergenceException("org.apache.commons.math.ode.DerivativeException: org.apache.commons.math.ConvergenceException: org.apache.commons.math.FunctionEvaluationException: hi!", (java.lang.Object[]) throwableArray39, (java.lang.Throwable) convergenceException55);
        java.lang.Throwable[] throwableArray59 = convergenceException58.getSuppressed();
        org.apache.commons.math.FunctionEvaluationException functionEvaluationException60 = new org.apache.commons.math.FunctionEvaluationException((double) 0.0f, "org.apache.commons.math.MaxIterationsExceededException: org.apache.commons.math.ConvergenceException: org.apache.commons.math.ConvergenceException: org.apache.commons.math.FunctionEvaluationException: Evaluation failed for argument = 0", (java.lang.Object[]) throwableArray59);
        org.apache.commons.math.ConvergenceException convergenceException61 = new org.apache.commons.math.ConvergenceException("Evaluation failed for argument = 10", (java.lang.Object[]) throwableArray12, (java.lang.Throwable) functionEvaluationException60);
        org.apache.commons.math.ConvergenceException convergenceException62 = new org.apache.commons.math.ConvergenceException("org.apache.commons.math.ConvergenceException: org.apache.commons.math.FunctionEvaluationException: org.apache.commons.math.MaxIterationsExceededException: Maximal number of iterations (0) exceeded", (java.lang.Object[]) throwableArray12);
        org.junit.Assert.assertNotNull(throwableArray12);
        org.junit.Assert.assertNotNull(strArray28);
        org.junit.Assert.assertNotNull(throwableArray36);
        org.junit.Assert.assertNotNull(throwableArray39);
        org.junit.Assert.assertNotNull(objArray46);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray46), "[1, 10, 1]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray46), "[1, 10, 1]");
        org.junit.Assert.assertNotNull(objArray53);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray53), "[10, -1, 10, 0.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray53), "[10, -1, 10, 0.0]");
        org.junit.Assert.assertNotNull(throwableArray59);
    }

    @Test
    public void test16533() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest33.test16533");
        org.apache.commons.math.MaxIterationsExceededException maxIterationsExceededException6 = new org.apache.commons.math.MaxIterationsExceededException(0);
        java.lang.Throwable[] throwableArray7 = maxIterationsExceededException6.getSuppressed();
        org.apache.commons.math.ConvergenceException convergenceException8 = new org.apache.commons.math.ConvergenceException((java.lang.Throwable) maxIterationsExceededException6);
        java.lang.Throwable[] throwableArray9 = convergenceException8.getSuppressed();
        java.lang.Object[] objArray25 = new java.lang.Object[] { 1L, (byte) 10, (short) 1 };
        org.apache.commons.math.FunctionEvaluationException functionEvaluationException26 = new org.apache.commons.math.FunctionEvaluationException((-1.0d), "hi!", objArray25);
        org.apache.commons.math.FunctionEvaluationException functionEvaluationException27 = new org.apache.commons.math.FunctionEvaluationException((double) 0L, "", objArray25);
        java.lang.Object[] objArray32 = new java.lang.Object[] { "", (short) 1, "org.apache.commons.math.FunctionEvaluationException: hi!", 10.0d, 0.0f };
        java.lang.Throwable throwable34 = null;
        org.apache.commons.math.ConvergenceException convergenceException35 = new org.apache.commons.math.ConvergenceException("hi!", throwable34);
        org.apache.commons.math.ode.DerivativeException derivativeException36 = new org.apache.commons.math.ode.DerivativeException((java.lang.Throwable) convergenceException35);
        java.lang.Throwable[] throwableArray37 = derivativeException36.getSuppressed();
        org.apache.commons.math.FunctionEvaluationException functionEvaluationException38 = new org.apache.commons.math.FunctionEvaluationException((double) 100, "", objArray32, (java.lang.Throwable) derivativeException36);
        java.lang.Object[] objArray50 = new java.lang.Object[] { 1L, (byte) 10, (short) 1 };
        org.apache.commons.math.FunctionEvaluationException functionEvaluationException51 = new org.apache.commons.math.FunctionEvaluationException((-1.0d), "hi!", objArray50);
        org.apache.commons.math.FunctionEvaluationException functionEvaluationException52 = new org.apache.commons.math.FunctionEvaluationException((double) 0L, "", objArray50);
        java.lang.Object[] objArray57 = new java.lang.Object[] { "", (short) 1, "org.apache.commons.math.FunctionEvaluationException: hi!", 10.0d, 0.0f };
        java.lang.Throwable throwable59 = null;
        org.apache.commons.math.ConvergenceException convergenceException60 = new org.apache.commons.math.ConvergenceException("hi!", throwable59);
        org.apache.commons.math.ode.DerivativeException derivativeException61 = new org.apache.commons.math.ode.DerivativeException((java.lang.Throwable) convergenceException60);
        java.lang.Throwable[] throwableArray62 = derivativeException61.getSuppressed();
        org.apache.commons.math.FunctionEvaluationException functionEvaluationException63 = new org.apache.commons.math.FunctionEvaluationException((double) 100, "", objArray57, (java.lang.Throwable) derivativeException61);
        java.lang.Object[] objArray71 = new java.lang.Object[] { 1L, (byte) 10, (short) 1 };
        org.apache.commons.math.FunctionEvaluationException functionEvaluationException72 = new org.apache.commons.math.FunctionEvaluationException((-1.0d), "hi!", objArray71);
        org.apache.commons.math.FunctionEvaluationException functionEvaluationException73 = new org.apache.commons.math.FunctionEvaluationException((double) 0L, "", objArray71);
        org.apache.commons.math.ode.DerivativeException derivativeException74 = new org.apache.commons.math.ode.DerivativeException((java.lang.Throwable) functionEvaluationException73);
        org.apache.commons.math.FunctionEvaluationException functionEvaluationException75 = new org.apache.commons.math.FunctionEvaluationException((double) '#', "hi!", objArray57, (java.lang.Throwable) derivativeException74);
        org.apache.commons.math.FunctionEvaluationException functionEvaluationException76 = new org.apache.commons.math.FunctionEvaluationException((double) (byte) -1, "", objArray32, (java.lang.Throwable) functionEvaluationException75);
        java.lang.String str77 = functionEvaluationException75.getPattern();
        org.apache.commons.math.FunctionEvaluationException functionEvaluationException78 = new org.apache.commons.math.FunctionEvaluationException((double) (byte) 10, (java.lang.Throwable) functionEvaluationException75);
        java.lang.Object[] objArray79 = functionEvaluationException78.getArguments();
        org.apache.commons.math.ConvergenceException convergenceException80 = new org.apache.commons.math.ConvergenceException("", objArray79);
        org.apache.commons.math.MaxIterationsExceededException maxIterationsExceededException81 = new org.apache.commons.math.MaxIterationsExceededException((int) (short) 1, "org.apache.commons.math.FunctionEvaluationException: Evaluation failed for argument = 0", objArray79);
        int int82 = maxIterationsExceededException81.getMaxIterations();
        org.apache.commons.math.ConvergenceException convergenceException83 = new org.apache.commons.math.ConvergenceException("org.apache.commons.math.ode.DerivativeException: org.apache.commons.math.ode.DerivativeException: org.apache.commons.math.ode.DerivativeException: ", (java.lang.Object[]) throwableArray9, (java.lang.Throwable) maxIterationsExceededException81);
        org.apache.commons.math.FunctionEvaluationException functionEvaluationException84 = new org.apache.commons.math.FunctionEvaluationException((double) (short) -1, "org.apache.commons.math.MaxIterationsExceededException: Evaluation failed for argument = {0}", (java.lang.Object[]) throwableArray9);
        java.lang.Object[] objArray85 = functionEvaluationException84.getArguments();
        java.lang.Object[] objArray86 = functionEvaluationException84.getArguments();
        org.apache.commons.math.MaxIterationsExceededException maxIterationsExceededException88 = new org.apache.commons.math.MaxIterationsExceededException((int) (short) 0);
        int int89 = maxIterationsExceededException88.getMaxIterations();
        int int90 = maxIterationsExceededException88.getMaxIterations();
        org.apache.commons.math.FunctionEvaluationException functionEvaluationException91 = new org.apache.commons.math.FunctionEvaluationException(32.0d, "org.apache.commons.math.FunctionEvaluationException: org.apache.commons.math.ode.DerivativeException: org.apache.commons.math.MaxIterationsExceededException: Maximal number of iterations (0) exceeded", objArray86, (java.lang.Throwable) maxIterationsExceededException88);
        org.junit.Assert.assertNotNull(throwableArray7);
        org.junit.Assert.assertNotNull(throwableArray9);
        org.junit.Assert.assertNotNull(objArray25);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray25), "[1, 10, 1]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray25), "[1, 10, 1]");
        org.junit.Assert.assertNotNull(objArray32);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray32), "[, 1, org.apache.commons.math.FunctionEvaluationException: hi!, 10.0, 0.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray32), "[, 1, org.apache.commons.math.FunctionEvaluationException: hi!, 10.0, 0.0]");
        org.junit.Assert.assertNotNull(throwableArray37);
        org.junit.Assert.assertNotNull(objArray50);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray50), "[1, 10, 1]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray50), "[1, 10, 1]");
        org.junit.Assert.assertNotNull(objArray57);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray57), "[, 1, org.apache.commons.math.FunctionEvaluationException: hi!, 10.0, 0.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray57), "[, 1, org.apache.commons.math.FunctionEvaluationException: hi!, 10.0, 0.0]");
        org.junit.Assert.assertNotNull(throwableArray62);
        org.junit.Assert.assertNotNull(objArray71);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray71), "[1, 10, 1]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray71), "[1, 10, 1]");
        org.junit.Assert.assertEquals("'" + str77 + "' != '" + "hi!" + "'", str77, "hi!");
        org.junit.Assert.assertNotNull(objArray79);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray79), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray79), "[]");
        org.junit.Assert.assertTrue("'" + int82 + "' != '" + 1 + "'", int82 == 1);
        org.junit.Assert.assertNotNull(objArray85);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray85), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray85), "[]");
        org.junit.Assert.assertNotNull(objArray86);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray86), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray86), "[]");
        org.junit.Assert.assertTrue("'" + int89 + "' != '" + 0 + "'", int89 == 0);
        org.junit.Assert.assertTrue("'" + int90 + "' != '" + 0 + "'", int90 == 0);
    }

    @Test
    public void test16534() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest33.test16534");
        java.lang.String[] strArray11 = new java.lang.String[] { "hi!", "", "hi!", "hi!", "hi!" };
        org.apache.commons.math.ode.DerivativeException derivativeException12 = new org.apache.commons.math.ode.DerivativeException("", strArray11);
        org.apache.commons.math.ode.DerivativeException derivativeException13 = new org.apache.commons.math.ode.DerivativeException("", strArray11);
        java.lang.Throwable throwable16 = null;
        org.apache.commons.math.ConvergenceException convergenceException17 = new org.apache.commons.math.ConvergenceException("hi!", throwable16);
        org.apache.commons.math.ode.DerivativeException derivativeException18 = new org.apache.commons.math.ode.DerivativeException((java.lang.Throwable) convergenceException17);
        java.lang.Throwable[] throwableArray19 = derivativeException18.getSuppressed();
        org.apache.commons.math.ConvergenceException convergenceException20 = new org.apache.commons.math.ConvergenceException("hi!", (java.lang.Throwable) derivativeException18);
        derivativeException13.addSuppressed((java.lang.Throwable) convergenceException20);
        java.lang.Throwable[] throwableArray22 = derivativeException13.getSuppressed();
        org.apache.commons.math.ConvergenceException convergenceException23 = new org.apache.commons.math.ConvergenceException("org.apache.commons.math.FunctionEvaluationException: org.apache.commons.math.ConvergenceException: hi!", (java.lang.Object[]) throwableArray22);
        org.apache.commons.math.ConvergenceException convergenceException24 = new org.apache.commons.math.ConvergenceException("", (java.lang.Object[]) throwableArray22);
        java.lang.String[] strArray34 = new java.lang.String[] { "hi!", "", "hi!", "hi!", "hi!" };
        org.apache.commons.math.ode.DerivativeException derivativeException35 = new org.apache.commons.math.ode.DerivativeException("", strArray34);
        org.apache.commons.math.ode.DerivativeException derivativeException36 = new org.apache.commons.math.ode.DerivativeException("", strArray34);
        java.lang.Throwable throwable39 = null;
        org.apache.commons.math.ConvergenceException convergenceException40 = new org.apache.commons.math.ConvergenceException("hi!", throwable39);
        org.apache.commons.math.ode.DerivativeException derivativeException41 = new org.apache.commons.math.ode.DerivativeException((java.lang.Throwable) convergenceException40);
        java.lang.Throwable[] throwableArray42 = derivativeException41.getSuppressed();
        org.apache.commons.math.ConvergenceException convergenceException43 = new org.apache.commons.math.ConvergenceException("hi!", (java.lang.Throwable) derivativeException41);
        derivativeException36.addSuppressed((java.lang.Throwable) convergenceException43);
        org.apache.commons.math.FunctionEvaluationException functionEvaluationException45 = new org.apache.commons.math.FunctionEvaluationException((double) (short) 100, "org.apache.commons.math.ConvergenceException: hi!", (java.lang.Throwable) convergenceException43);
        org.apache.commons.math.ConvergenceException convergenceException46 = new org.apache.commons.math.ConvergenceException("org.apache.commons.math.FunctionEvaluationException: ", (java.lang.Object[]) throwableArray22, (java.lang.Throwable) functionEvaluationException45);
        org.apache.commons.math.ConvergenceException convergenceException47 = new org.apache.commons.math.ConvergenceException("org.apache.commons.math.MaxIterationsExceededException: org.apache.commons.math.ConvergenceException: org.apache.commons.math.FunctionEvaluationException: Evaluation failed for argument = 0", (java.lang.Object[]) throwableArray22);
        java.lang.Throwable[] throwableArray48 = convergenceException47.getSuppressed();
        org.apache.commons.math.ConvergenceException convergenceException49 = new org.apache.commons.math.ConvergenceException((java.lang.Throwable) convergenceException47);
        org.junit.Assert.assertNotNull(strArray11);
        org.junit.Assert.assertNotNull(throwableArray19);
        org.junit.Assert.assertNotNull(throwableArray22);
        org.junit.Assert.assertNotNull(strArray34);
        org.junit.Assert.assertNotNull(throwableArray42);
        org.junit.Assert.assertNotNull(throwableArray48);
    }

    @Test
    public void test16535() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest33.test16535");
        java.lang.String[] strArray12 = new java.lang.String[] { "org.apache.commons.math.FunctionEvaluationException: hi!" };
        org.apache.commons.math.ode.DerivativeException derivativeException13 = new org.apache.commons.math.ode.DerivativeException("hi!", strArray12);
        org.apache.commons.math.MaxIterationsExceededException maxIterationsExceededException14 = new org.apache.commons.math.MaxIterationsExceededException((int) (short) 10, "org.apache.commons.math.ode.DerivativeException: org.apache.commons.math.ConvergenceException: org.apache.commons.math.FunctionEvaluationException: hi!", (java.lang.Object[]) strArray12);
        org.apache.commons.math.FunctionEvaluationException functionEvaluationException15 = new org.apache.commons.math.FunctionEvaluationException((double) 3, "org.apache.commons.math.FunctionEvaluationException: org.apache.commons.math.ConvergenceException: hi!", (java.lang.Object[]) strArray12);
        org.apache.commons.math.ConvergenceException convergenceException16 = new org.apache.commons.math.ConvergenceException("org.apache.commons.math.MaxIterationsExceededException: org.apache.commons.math.FunctionEvaluationException: Evaluation failed for argument = 0", (java.lang.Object[]) strArray12);
        org.apache.commons.math.MaxIterationsExceededException maxIterationsExceededException17 = new org.apache.commons.math.MaxIterationsExceededException((int) (byte) 0, "org.apache.commons.math.ode.DerivativeException: org.apache.commons.math.MaxIterationsExceededException: org.apache.commons.math.ConvergenceException: org.apache.commons.math.ConvergenceException: org.apache.commons.math.FunctionEvaluationException: hi!", (java.lang.Object[]) strArray12);
        org.apache.commons.math.ConvergenceException convergenceException20 = new org.apache.commons.math.ConvergenceException("");
        org.apache.commons.math.ode.DerivativeException derivativeException21 = new org.apache.commons.math.ode.DerivativeException((java.lang.Throwable) convergenceException20);
        org.apache.commons.math.FunctionEvaluationException functionEvaluationException22 = new org.apache.commons.math.FunctionEvaluationException(3.0d, (java.lang.Throwable) convergenceException20);
        org.apache.commons.math.FunctionEvaluationException functionEvaluationException23 = new org.apache.commons.math.FunctionEvaluationException((double) (short) 0, "org.apache.commons.math.FunctionEvaluationException: org.apache.commons.math.MaxIterationsExceededException: org.apache.commons.math.ConvergenceException: org.apache.commons.math.ode.DerivativeException: ", (java.lang.Object[]) strArray12, (java.lang.Throwable) functionEvaluationException22);
        org.apache.commons.math.MaxIterationsExceededException maxIterationsExceededException29 = new org.apache.commons.math.MaxIterationsExceededException((int) (byte) 100);
        int int30 = maxIterationsExceededException29.getMaxIterations();
        org.apache.commons.math.FunctionEvaluationException functionEvaluationException31 = new org.apache.commons.math.FunctionEvaluationException(10.0d, "org.apache.commons.math.MaxIterationsExceededException: Evaluation failed for argument = {0}", (java.lang.Throwable) maxIterationsExceededException29);
        org.apache.commons.math.ode.DerivativeException derivativeException32 = new org.apache.commons.math.ode.DerivativeException((java.lang.Throwable) maxIterationsExceededException29);
        org.apache.commons.math.FunctionEvaluationException functionEvaluationException33 = new org.apache.commons.math.FunctionEvaluationException((double) 1.0f, "Evaluation failed for argument = {0}", (java.lang.Throwable) derivativeException32);
        org.apache.commons.math.ConvergenceException convergenceException34 = new org.apache.commons.math.ConvergenceException("org.apache.commons.math.FunctionEvaluationException: org.apache.commons.math.MaxIterationsExceededException: hi!", (java.lang.Object[]) strArray12, (java.lang.Throwable) functionEvaluationException33);
        java.lang.Throwable[] throwableArray35 = functionEvaluationException33.getSuppressed();
        java.lang.Class<?> wildcardClass36 = throwableArray35.getClass();
        org.junit.Assert.assertNotNull(strArray12);
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 100 + "'", int30 == 100);
        org.junit.Assert.assertNotNull(throwableArray35);
        org.junit.Assert.assertNotNull(wildcardClass36);
    }

    @Test
    public void test16536() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest33.test16536");
        java.lang.String[] strArray17 = new java.lang.String[] { "hi!", "", "hi!", "hi!", "hi!" };
        org.apache.commons.math.ode.DerivativeException derivativeException18 = new org.apache.commons.math.ode.DerivativeException("", strArray17);
        org.apache.commons.math.ode.DerivativeException derivativeException19 = new org.apache.commons.math.ode.DerivativeException("", strArray17);
        org.apache.commons.math.ConvergenceException convergenceException20 = new org.apache.commons.math.ConvergenceException("org.apache.commons.math.FunctionEvaluationException: hi!", (java.lang.Object[]) strArray17);
        org.apache.commons.math.ConvergenceException convergenceException21 = new org.apache.commons.math.ConvergenceException("", (java.lang.Object[]) strArray17);
        org.apache.commons.math.ode.DerivativeException derivativeException22 = new org.apache.commons.math.ode.DerivativeException("org.apache.commons.math.FunctionEvaluationException: org.apache.commons.math.FunctionEvaluationException: org.apache.commons.math.ode.DerivativeException: ", strArray17);
        org.apache.commons.math.FunctionEvaluationException functionEvaluationException23 = new org.apache.commons.math.FunctionEvaluationException((double) (short) -1, "org.apache.commons.math.FunctionEvaluationException: hi!", (java.lang.Object[]) strArray17);
        org.apache.commons.math.ode.DerivativeException derivativeException24 = new org.apache.commons.math.ode.DerivativeException("org.apache.commons.math.ConvergenceException: org.apache.commons.math.FunctionEvaluationException: hi!", strArray17);
        java.lang.String[] strArray37 = new java.lang.String[] { "hi!", "", "hi!", "hi!", "hi!" };
        org.apache.commons.math.ode.DerivativeException derivativeException38 = new org.apache.commons.math.ode.DerivativeException("", strArray37);
        org.apache.commons.math.ode.DerivativeException derivativeException39 = new org.apache.commons.math.ode.DerivativeException("", strArray37);
        java.lang.String[] strArray46 = new java.lang.String[] { "hi!", "", "hi!", "hi!", "hi!" };
        org.apache.commons.math.ode.DerivativeException derivativeException47 = new org.apache.commons.math.ode.DerivativeException("", strArray46);
        org.apache.commons.math.ode.DerivativeException derivativeException48 = new org.apache.commons.math.ode.DerivativeException((java.lang.Throwable) derivativeException47);
        org.apache.commons.math.ConvergenceException convergenceException49 = new org.apache.commons.math.ConvergenceException("hi!", (java.lang.Object[]) strArray37, (java.lang.Throwable) derivativeException47);
        org.apache.commons.math.ode.DerivativeException derivativeException50 = new org.apache.commons.math.ode.DerivativeException("hi!", strArray37);
        org.apache.commons.math.ConvergenceException convergenceException51 = new org.apache.commons.math.ConvergenceException("org.apache.commons.math.ConvergenceException: org.apache.commons.math.ConvergenceException: org.apache.commons.math.FunctionEvaluationException: Evaluation failed for argument = 0", (java.lang.Object[]) strArray37);
        org.apache.commons.math.FunctionEvaluationException functionEvaluationException52 = new org.apache.commons.math.FunctionEvaluationException(52.0d, "org.apache.commons.math.ode.DerivativeException: org.apache.commons.math.MaxIterationsExceededException: org.apache.commons.math.FunctionEvaluationException: hi!", (java.lang.Object[]) strArray37);
        org.apache.commons.math.FunctionEvaluationException functionEvaluationException53 = new org.apache.commons.math.FunctionEvaluationException(0.0d, "org.apache.commons.math.ConvergenceException: org.apache.commons.math.ConvergenceException: org.apache.commons.math.FunctionEvaluationException: org.apache.commons.math.ConvergenceException: hi!", (java.lang.Object[]) strArray17, (java.lang.Throwable) functionEvaluationException52);
        java.lang.Object[] objArray64 = new java.lang.Object[] { 1L, (byte) 10, (short) 1 };
        org.apache.commons.math.FunctionEvaluationException functionEvaluationException65 = new org.apache.commons.math.FunctionEvaluationException((-1.0d), "hi!", objArray64);
        org.apache.commons.math.FunctionEvaluationException functionEvaluationException66 = new org.apache.commons.math.FunctionEvaluationException((double) 0L, "", objArray64);
        java.lang.Object[] objArray71 = new java.lang.Object[] { "", (short) 1, "org.apache.commons.math.FunctionEvaluationException: hi!", 10.0d, 0.0f };
        java.lang.Throwable throwable73 = null;
        org.apache.commons.math.ConvergenceException convergenceException74 = new org.apache.commons.math.ConvergenceException("hi!", throwable73);
        org.apache.commons.math.ode.DerivativeException derivativeException75 = new org.apache.commons.math.ode.DerivativeException((java.lang.Throwable) convergenceException74);
        java.lang.Throwable[] throwableArray76 = derivativeException75.getSuppressed();
        org.apache.commons.math.FunctionEvaluationException functionEvaluationException77 = new org.apache.commons.math.FunctionEvaluationException((double) 100, "", objArray71, (java.lang.Throwable) derivativeException75);
        org.apache.commons.math.FunctionEvaluationException functionEvaluationException78 = new org.apache.commons.math.FunctionEvaluationException((double) 10.0f, (java.lang.Throwable) functionEvaluationException77);
        double double79 = functionEvaluationException78.getArgument();
        double double80 = functionEvaluationException78.getArgument();
        org.apache.commons.math.ode.DerivativeException derivativeException81 = new org.apache.commons.math.ode.DerivativeException((java.lang.Throwable) functionEvaluationException78);
        double double82 = functionEvaluationException78.getArgument();
        org.apache.commons.math.ConvergenceException convergenceException83 = new org.apache.commons.math.ConvergenceException("org.apache.commons.math.ode.DerivativeException: org.apache.commons.math.MaxIterationsExceededException: Maximal number of iterations (3) exceeded", (java.lang.Object[]) strArray17, (java.lang.Throwable) functionEvaluationException78);
        org.apache.commons.math.ode.DerivativeException derivativeException84 = new org.apache.commons.math.ode.DerivativeException("org.apache.commons.math.ode.DerivativeException: org.apache.commons.math.FunctionEvaluationException: Maximal number of iterations (0) exceeded", strArray17);
        org.junit.Assert.assertNotNull(strArray17);
        org.junit.Assert.assertNotNull(strArray37);
        org.junit.Assert.assertNotNull(strArray46);
        org.junit.Assert.assertNotNull(objArray64);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray64), "[1, 10, 1]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray64), "[1, 10, 1]");
        org.junit.Assert.assertNotNull(objArray71);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray71), "[, 1, org.apache.commons.math.FunctionEvaluationException: hi!, 10.0, 0.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray71), "[, 1, org.apache.commons.math.FunctionEvaluationException: hi!, 10.0, 0.0]");
        org.junit.Assert.assertNotNull(throwableArray76);
        org.junit.Assert.assertTrue("'" + double79 + "' != '" + 10.0d + "'", double79 == 10.0d);
        org.junit.Assert.assertTrue("'" + double80 + "' != '" + 10.0d + "'", double80 == 10.0d);
        org.junit.Assert.assertTrue("'" + double82 + "' != '" + 10.0d + "'", double82 == 10.0d);
    }

    @Test
    public void test16537() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest33.test16537");
        org.apache.commons.math.MaxIterationsExceededException maxIterationsExceededException1 = new org.apache.commons.math.MaxIterationsExceededException(52);
        org.apache.commons.math.FunctionEvaluationException functionEvaluationException5 = new org.apache.commons.math.FunctionEvaluationException((double) '4');
        java.lang.String str6 = functionEvaluationException5.getPattern();
        java.lang.Object[] objArray7 = functionEvaluationException5.getArguments();
        org.apache.commons.math.FunctionEvaluationException functionEvaluationException8 = new org.apache.commons.math.FunctionEvaluationException(0.0d, "org.apache.commons.math.FunctionEvaluationException: hi!", objArray7);
        maxIterationsExceededException1.addSuppressed((java.lang.Throwable) functionEvaluationException8);
        org.apache.commons.math.ode.DerivativeException derivativeException10 = new org.apache.commons.math.ode.DerivativeException((java.lang.Throwable) maxIterationsExceededException1);
        java.lang.String str11 = derivativeException10.toString();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Evaluation failed for argument = {0}" + "'", str6, "Evaluation failed for argument = {0}");
        org.junit.Assert.assertNotNull(objArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray7), "[52.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray7), "[52.0]");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "org.apache.commons.math.ode.DerivativeException: Maximal number of iterations (52) exceeded" + "'", str11, "org.apache.commons.math.ode.DerivativeException: Maximal number of iterations (52) exceeded");
    }

    @Test
    public void test16538() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest33.test16538");
        java.lang.Object[] objArray11 = new java.lang.Object[] { 10L, (-1L), 10, 0.0d };
        java.lang.Throwable throwable12 = null;
        org.apache.commons.math.ConvergenceException convergenceException13 = new org.apache.commons.math.ConvergenceException("hi!", objArray11, throwable12);
        java.lang.Throwable[] throwableArray14 = convergenceException13.getSuppressed();
        org.apache.commons.math.ConvergenceException convergenceException15 = new org.apache.commons.math.ConvergenceException((java.lang.Throwable) convergenceException13);
        java.lang.Throwable[] throwableArray16 = convergenceException15.getSuppressed();
        org.apache.commons.math.MaxIterationsExceededException maxIterationsExceededException17 = new org.apache.commons.math.MaxIterationsExceededException((int) (byte) 100, "org.apache.commons.math.ConvergenceException: org.apache.commons.math.ode.DerivativeException: ", (java.lang.Object[]) throwableArray16);
        org.apache.commons.math.MaxIterationsExceededException maxIterationsExceededException18 = new org.apache.commons.math.MaxIterationsExceededException(1, "org.apache.commons.math.ode.DerivativeException: org.apache.commons.math.MaxIterationsExceededException: org.apache.commons.math.ConvergenceException: org.apache.commons.math.ode.DerivativeException: ", (java.lang.Object[]) throwableArray16);
        org.apache.commons.math.FunctionEvaluationException functionEvaluationException19 = new org.apache.commons.math.FunctionEvaluationException((double) 10, "org.apache.commons.math.FunctionEvaluationException: org.apache.commons.math.FunctionEvaluationException: org.apache.commons.math.FunctionEvaluationException: org.apache.commons.math.ConvergenceException: org.apache.commons.math.FunctionEvaluationException: hi!", (java.lang.Throwable) maxIterationsExceededException18);
        org.junit.Assert.assertNotNull(objArray11);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray11), "[10, -1, 10, 0.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray11), "[10, -1, 10, 0.0]");
        org.junit.Assert.assertNotNull(throwableArray14);
        org.junit.Assert.assertNotNull(throwableArray16);
    }

    @Test
    public void test16539() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest33.test16539");
        org.apache.commons.math.ConvergenceException convergenceException3 = new org.apache.commons.math.ConvergenceException("org.apache.commons.math.ConvergenceException: org.apache.commons.math.ConvergenceException: Maximal number of iterations (10) exceeded");
        org.apache.commons.math.FunctionEvaluationException functionEvaluationException4 = new org.apache.commons.math.FunctionEvaluationException((double) 100.0f, "org.apache.commons.math.MaxIterationsExceededException: org.apache.commons.math.ConvergenceException: org.apache.commons.math.FunctionEvaluationException: org.apache.commons.math.ode.DerivativeException: org.apache.commons.math.ConvergenceException: org.apache.commons.math.ConvergenceException: org.apache.commons.math.FunctionEvaluationException: hi!", (java.lang.Throwable) convergenceException3);
    }

    @Test
    public void test16540() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest33.test16540");
        org.apache.commons.math.FunctionEvaluationException functionEvaluationException5 = new org.apache.commons.math.FunctionEvaluationException(52.0d, "org.apache.commons.math.ConvergenceException: org.apache.commons.math.ConvergenceException: org.apache.commons.math.FunctionEvaluationException: org.apache.commons.math.ode.DerivativeException: ");
        java.lang.Throwable[] throwableArray6 = functionEvaluationException5.getSuppressed();
        java.lang.Object[] objArray7 = functionEvaluationException5.getArguments();
        java.lang.String[] strArray16 = new java.lang.String[] { "org.apache.commons.math.FunctionEvaluationException: hi!" };
        org.apache.commons.math.ode.DerivativeException derivativeException17 = new org.apache.commons.math.ode.DerivativeException("hi!", strArray16);
        java.lang.String[] strArray26 = new java.lang.String[] { "hi!", "", "hi!", "hi!", "hi!" };
        org.apache.commons.math.ode.DerivativeException derivativeException27 = new org.apache.commons.math.ode.DerivativeException("", strArray26);
        org.apache.commons.math.ode.DerivativeException derivativeException28 = new org.apache.commons.math.ode.DerivativeException("", strArray26);
        java.lang.String[] strArray35 = new java.lang.String[] { "hi!", "", "hi!", "hi!", "hi!" };
        org.apache.commons.math.ode.DerivativeException derivativeException36 = new org.apache.commons.math.ode.DerivativeException("", strArray35);
        org.apache.commons.math.ode.DerivativeException derivativeException37 = new org.apache.commons.math.ode.DerivativeException((java.lang.Throwable) derivativeException36);
        org.apache.commons.math.ConvergenceException convergenceException38 = new org.apache.commons.math.ConvergenceException("hi!", (java.lang.Object[]) strArray26, (java.lang.Throwable) derivativeException36);
        java.lang.Object[] objArray39 = derivativeException36.getArguments();
        org.apache.commons.math.ConvergenceException convergenceException40 = new org.apache.commons.math.ConvergenceException("org.apache.commons.math.FunctionEvaluationException: hi!", (java.lang.Object[]) strArray16, (java.lang.Throwable) derivativeException36);
        org.apache.commons.math.MaxIterationsExceededException maxIterationsExceededException41 = new org.apache.commons.math.MaxIterationsExceededException((int) (short) 0, "org.apache.commons.math.FunctionEvaluationException: org.apache.commons.math.ConvergenceException: hi!", (java.lang.Object[]) strArray16);
        org.apache.commons.math.ode.DerivativeException derivativeException42 = new org.apache.commons.math.ode.DerivativeException("org.apache.commons.math.ConvergenceException: ", strArray16);
        org.apache.commons.math.MaxIterationsExceededException maxIterationsExceededException43 = new org.apache.commons.math.MaxIterationsExceededException(1, "org.apache.commons.math.FunctionEvaluationException: ", (java.lang.Object[]) strArray16);
        int int44 = maxIterationsExceededException43.getMaxIterations();
        org.apache.commons.math.FunctionEvaluationException functionEvaluationException45 = new org.apache.commons.math.FunctionEvaluationException((double) '#', "org.apache.commons.math.MaxIterationsExceededException: org.apache.commons.math.FunctionEvaluationException: org.apache.commons.math.MaxIterationsExceededException: Maximal number of iterations (3) exceeded", objArray7, (java.lang.Throwable) maxIterationsExceededException43);
        org.apache.commons.math.ConvergenceException convergenceException46 = new org.apache.commons.math.ConvergenceException("org.apache.commons.math.ConvergenceException: Evaluation failed for argument = {0}", (java.lang.Throwable) functionEvaluationException45);
        org.junit.Assert.assertNotNull(throwableArray6);
        org.junit.Assert.assertNotNull(objArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray7), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray7), "[]");
        org.junit.Assert.assertNotNull(strArray16);
        org.junit.Assert.assertNotNull(strArray26);
        org.junit.Assert.assertNotNull(strArray35);
        org.junit.Assert.assertNotNull(objArray39);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray39), "[hi!, , hi!, hi!, hi!]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray39), "[hi!, , hi!, hi!, hi!]");
        org.junit.Assert.assertTrue("'" + int44 + "' != '" + 1 + "'", int44 == 1);
    }

    @Test
    public void test16541() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest33.test16541");
        java.lang.Object[] objArray12 = new java.lang.Object[] { 1L, (byte) 10, (short) 1 };
        org.apache.commons.math.FunctionEvaluationException functionEvaluationException13 = new org.apache.commons.math.FunctionEvaluationException((-1.0d), "hi!", objArray12);
        java.lang.Throwable throwable14 = null;
        org.apache.commons.math.FunctionEvaluationException functionEvaluationException15 = new org.apache.commons.math.FunctionEvaluationException((double) (short) 1, "hi!", objArray12, throwable14);
        java.lang.String str16 = functionEvaluationException15.getPattern();
        java.lang.Throwable[] throwableArray17 = functionEvaluationException15.getSuppressed();
        org.apache.commons.math.MaxIterationsExceededException maxIterationsExceededException18 = new org.apache.commons.math.MaxIterationsExceededException((int) (short) 1, "org.apache.commons.math.FunctionEvaluationException: Evaluation failed for argument = 0", (java.lang.Object[]) throwableArray17);
        java.lang.Object[] objArray27 = new java.lang.Object[] { 1L, (byte) 10, (short) 1 };
        org.apache.commons.math.FunctionEvaluationException functionEvaluationException28 = new org.apache.commons.math.FunctionEvaluationException((-1.0d), "hi!", objArray27);
        java.lang.Throwable throwable29 = null;
        org.apache.commons.math.FunctionEvaluationException functionEvaluationException30 = new org.apache.commons.math.FunctionEvaluationException((double) (short) 1, "hi!", objArray27, throwable29);
        org.apache.commons.math.ConvergenceException convergenceException31 = new org.apache.commons.math.ConvergenceException("org.apache.commons.math.FunctionEvaluationException: org.apache.commons.math.ode.DerivativeException: ", objArray27);
        org.apache.commons.math.ConvergenceException convergenceException32 = new org.apache.commons.math.ConvergenceException("org.apache.commons.math.ode.DerivativeException: hi!", (java.lang.Object[]) throwableArray17, (java.lang.Throwable) convergenceException31);
        java.lang.String[] strArray43 = new java.lang.String[] { "org.apache.commons.math.FunctionEvaluationException: hi!" };
        org.apache.commons.math.ode.DerivativeException derivativeException44 = new org.apache.commons.math.ode.DerivativeException("hi!", strArray43);
        org.apache.commons.math.FunctionEvaluationException functionEvaluationException47 = new org.apache.commons.math.FunctionEvaluationException((double) (-1.0f), "");
        org.apache.commons.math.ConvergenceException convergenceException48 = new org.apache.commons.math.ConvergenceException("org.apache.commons.math.FunctionEvaluationException: hi!", (java.lang.Object[]) strArray43, (java.lang.Throwable) functionEvaluationException47);
        java.lang.Throwable throwable51 = null;
        org.apache.commons.math.ConvergenceException convergenceException52 = new org.apache.commons.math.ConvergenceException("hi!", throwable51);
        org.apache.commons.math.ode.DerivativeException derivativeException53 = new org.apache.commons.math.ode.DerivativeException((java.lang.Throwable) convergenceException52);
        java.lang.Throwable[] throwableArray54 = derivativeException53.getSuppressed();
        org.apache.commons.math.ConvergenceException convergenceException55 = new org.apache.commons.math.ConvergenceException("org.apache.commons.math.ConvergenceException: org.apache.commons.math.FunctionEvaluationException: hi!", (java.lang.Throwable) derivativeException53);
        java.lang.String[] strArray59 = new java.lang.String[] { "org.apache.commons.math.FunctionEvaluationException: hi!" };
        org.apache.commons.math.ode.DerivativeException derivativeException60 = new org.apache.commons.math.ode.DerivativeException("hi!", strArray59);
        org.apache.commons.math.FunctionEvaluationException functionEvaluationException63 = new org.apache.commons.math.FunctionEvaluationException((double) (-1.0f), "");
        org.apache.commons.math.ConvergenceException convergenceException64 = new org.apache.commons.math.ConvergenceException("org.apache.commons.math.FunctionEvaluationException: hi!", (java.lang.Object[]) strArray59, (java.lang.Throwable) functionEvaluationException63);
        derivativeException53.addSuppressed((java.lang.Throwable) functionEvaluationException63);
        org.apache.commons.math.ConvergenceException convergenceException66 = new org.apache.commons.math.ConvergenceException("Evaluation failed for argument = {0}", (java.lang.Object[]) strArray43, (java.lang.Throwable) functionEvaluationException63);
        org.apache.commons.math.FunctionEvaluationException functionEvaluationException67 = new org.apache.commons.math.FunctionEvaluationException((double) 100, "org.apache.commons.math.ode.DerivativeException: hi!", (java.lang.Object[]) strArray43);
        double double68 = functionEvaluationException67.getArgument();
        java.lang.Object[] objArray69 = functionEvaluationException67.getArguments();
        org.apache.commons.math.MaxIterationsExceededException maxIterationsExceededException70 = new org.apache.commons.math.MaxIterationsExceededException((int) 'a', "org.apache.commons.math.ConvergenceException: org.apache.commons.math.FunctionEvaluationException", objArray69);
        org.apache.commons.math.MaxIterationsExceededException maxIterationsExceededException71 = new org.apache.commons.math.MaxIterationsExceededException((-1), "org.apache.commons.math.FunctionEvaluationException: org.apache.commons.math.ode.DerivativeException: org.apache.commons.math.ode.DerivativeException: ", objArray69);
        org.apache.commons.math.FunctionEvaluationException functionEvaluationException72 = new org.apache.commons.math.FunctionEvaluationException((double) (short) 1, "org.apache.commons.math.MaxIterationsExceededException: org.apache.commons.math.FunctionEvaluationException: Maximal number of iterations (0) exceeded", (java.lang.Object[]) throwableArray17, (java.lang.Throwable) maxIterationsExceededException71);
        org.apache.commons.math.ode.DerivativeException derivativeException73 = new org.apache.commons.math.ode.DerivativeException((java.lang.Throwable) maxIterationsExceededException71);
        org.junit.Assert.assertNotNull(objArray12);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray12), "[1, 10, 1]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray12), "[1, 10, 1]");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "hi!" + "'", str16, "hi!");
        org.junit.Assert.assertNotNull(throwableArray17);
        org.junit.Assert.assertNotNull(objArray27);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray27), "[1, 10, 1]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray27), "[1, 10, 1]");
        org.junit.Assert.assertNotNull(strArray43);
        org.junit.Assert.assertNotNull(throwableArray54);
        org.junit.Assert.assertNotNull(strArray59);
        org.junit.Assert.assertTrue("'" + double68 + "' != '" + 100.0d + "'", double68 == 100.0d);
        org.junit.Assert.assertNotNull(objArray69);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray69), "[org.apache.commons.math.FunctionEvaluationException: hi!]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray69), "[org.apache.commons.math.FunctionEvaluationException: hi!]");
    }

    @Test
    public void test16542() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest33.test16542");
        java.lang.String[] strArray13 = new java.lang.String[] { "org.apache.commons.math.FunctionEvaluationException: hi!" };
        org.apache.commons.math.ode.DerivativeException derivativeException14 = new org.apache.commons.math.ode.DerivativeException("hi!", strArray13);
        java.lang.String[] strArray23 = new java.lang.String[] { "hi!", "", "hi!", "hi!", "hi!" };
        org.apache.commons.math.ode.DerivativeException derivativeException24 = new org.apache.commons.math.ode.DerivativeException("", strArray23);
        org.apache.commons.math.ode.DerivativeException derivativeException25 = new org.apache.commons.math.ode.DerivativeException("", strArray23);
        java.lang.String[] strArray32 = new java.lang.String[] { "hi!", "", "hi!", "hi!", "hi!" };
        org.apache.commons.math.ode.DerivativeException derivativeException33 = new org.apache.commons.math.ode.DerivativeException("", strArray32);
        org.apache.commons.math.ode.DerivativeException derivativeException34 = new org.apache.commons.math.ode.DerivativeException((java.lang.Throwable) derivativeException33);
        org.apache.commons.math.ConvergenceException convergenceException35 = new org.apache.commons.math.ConvergenceException("hi!", (java.lang.Object[]) strArray23, (java.lang.Throwable) derivativeException33);
        java.lang.Object[] objArray36 = derivativeException33.getArguments();
        org.apache.commons.math.ConvergenceException convergenceException37 = new org.apache.commons.math.ConvergenceException("org.apache.commons.math.FunctionEvaluationException: hi!", (java.lang.Object[]) strArray13, (java.lang.Throwable) derivativeException33);
        org.apache.commons.math.ode.DerivativeException derivativeException38 = new org.apache.commons.math.ode.DerivativeException("org.apache.commons.math.ode.DerivativeException: ", strArray13);
        org.apache.commons.math.ode.DerivativeException derivativeException39 = new org.apache.commons.math.ode.DerivativeException("org.apache.commons.math.MaxIterationsExceededException: org.apache.commons.math.ode.DerivativeException: ", strArray13);
        org.apache.commons.math.FunctionEvaluationException functionEvaluationException40 = new org.apache.commons.math.FunctionEvaluationException((double) 0L, "", (java.lang.Object[]) strArray13);
        org.apache.commons.math.FunctionEvaluationException functionEvaluationException41 = new org.apache.commons.math.FunctionEvaluationException((double) (byte) 10, "org.apache.commons.math.FunctionEvaluationException", (java.lang.Object[]) strArray13);
        org.apache.commons.math.ode.DerivativeException derivativeException42 = new org.apache.commons.math.ode.DerivativeException("org.apache.commons.math.ConvergenceException: ", strArray13);
        org.apache.commons.math.ConvergenceException convergenceException43 = new org.apache.commons.math.ConvergenceException("org.apache.commons.math.MaxIterationsExceededException: org.apache.commons.math.FunctionEvaluationException: Evaluation failed for argument = 97", (java.lang.Object[]) strArray13);
        org.apache.commons.math.ConvergenceException convergenceException45 = new org.apache.commons.math.ConvergenceException("org.apache.commons.math.ConvergenceException: hi!");
        org.apache.commons.math.ode.DerivativeException derivativeException46 = new org.apache.commons.math.ode.DerivativeException((java.lang.Throwable) convergenceException45);
        org.apache.commons.math.ConvergenceException convergenceException47 = new org.apache.commons.math.ConvergenceException("org.apache.commons.math.ConvergenceException: org.apache.commons.math.ConvergenceException: org.apache.commons.math.FunctionEvaluationException: org.apache.commons.math.ConvergenceException: hi!", (java.lang.Object[]) strArray13, (java.lang.Throwable) convergenceException45);
        org.apache.commons.math.ode.DerivativeException derivativeException48 = new org.apache.commons.math.ode.DerivativeException("org.apache.commons.math.ode.DerivativeException: org.apache.commons.math.ConvergenceException: org.apache.commons.math.ConvergenceException: org.apache.commons.math.ConvergenceException: org.apache.commons.math.ConvergenceException: org.apache.commons.math.FunctionEvaluationException: hi!", strArray13);
        java.lang.String str49 = derivativeException48.getPattern();
        org.junit.Assert.assertNotNull(strArray13);
        org.junit.Assert.assertNotNull(strArray23);
        org.junit.Assert.assertNotNull(strArray32);
        org.junit.Assert.assertNotNull(objArray36);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray36), "[hi!, , hi!, hi!, hi!]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray36), "[hi!, , hi!, hi!, hi!]");
        org.junit.Assert.assertEquals("'" + str49 + "' != '" + "org.apache.commons.math.ode.DerivativeException: org.apache.commons.math.ConvergenceException: org.apache.commons.math.ConvergenceException: org.apache.commons.math.ConvergenceException: org.apache.commons.math.ConvergenceException: org.apache.commons.math.FunctionEvaluationException: hi!" + "'", str49, "org.apache.commons.math.ode.DerivativeException: org.apache.commons.math.ConvergenceException: org.apache.commons.math.ConvergenceException: org.apache.commons.math.ConvergenceException: org.apache.commons.math.ConvergenceException: org.apache.commons.math.FunctionEvaluationException: hi!");
    }

    @Test
    public void test16543() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest33.test16543");
        org.apache.commons.math.FunctionEvaluationException functionEvaluationException2 = new org.apache.commons.math.FunctionEvaluationException((double) 1L, "org.apache.commons.math.MaxIterationsExceededException: org.apache.commons.math.ConvergenceException: ");
        java.lang.String str3 = functionEvaluationException2.getPattern();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "org.apache.commons.math.MaxIterationsExceededException: org.apache.commons.math.ConvergenceException: " + "'", str3, "org.apache.commons.math.MaxIterationsExceededException: org.apache.commons.math.ConvergenceException: ");
    }

    @Test
    public void test16544() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest33.test16544");
        org.apache.commons.math.FunctionEvaluationException functionEvaluationException3 = new org.apache.commons.math.FunctionEvaluationException(97.0d, "");
        org.apache.commons.math.ConvergenceException convergenceException4 = new org.apache.commons.math.ConvergenceException("org.apache.commons.math.ConvergenceException: org.apache.commons.math.FunctionEvaluationException: org.apache.commons.math.MaxIterationsExceededException: Evaluation failed for argument = {0}", (java.lang.Throwable) functionEvaluationException3);
    }

    @Test
    public void test16545() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest33.test16545");
        java.lang.String[] strArray14 = new java.lang.String[] { "org.apache.commons.math.FunctionEvaluationException: hi!", "org.apache.commons.math.FunctionEvaluationException: hi!", "org.apache.commons.math.ode.DerivativeException: ", "hi!" };
        org.apache.commons.math.ode.DerivativeException derivativeException15 = new org.apache.commons.math.ode.DerivativeException("org.apache.commons.math.ode.DerivativeException: ", strArray14);
        java.lang.String[] strArray25 = new java.lang.String[] { "hi!", "", "hi!", "hi!", "hi!" };
        org.apache.commons.math.ode.DerivativeException derivativeException26 = new org.apache.commons.math.ode.DerivativeException("", strArray25);
        org.apache.commons.math.ode.DerivativeException derivativeException27 = new org.apache.commons.math.ode.DerivativeException("", strArray25);
        org.apache.commons.math.ConvergenceException convergenceException28 = new org.apache.commons.math.ConvergenceException("org.apache.commons.math.FunctionEvaluationException: hi!", (java.lang.Object[]) strArray25);
        org.apache.commons.math.ConvergenceException convergenceException29 = new org.apache.commons.math.ConvergenceException("", (java.lang.Object[]) strArray25);
        org.apache.commons.math.FunctionEvaluationException functionEvaluationException30 = new org.apache.commons.math.FunctionEvaluationException((double) '#', "org.apache.commons.math.FunctionEvaluationException: Evaluation failed for argument = 0", (java.lang.Object[]) strArray14, (java.lang.Throwable) convergenceException29);
        org.apache.commons.math.FunctionEvaluationException functionEvaluationException31 = new org.apache.commons.math.FunctionEvaluationException((double) 3, "org.apache.commons.math.ode.DerivativeException: hi!", (java.lang.Object[]) strArray14);
        org.apache.commons.math.ode.DerivativeException derivativeException32 = new org.apache.commons.math.ode.DerivativeException("org.apache.commons.math.ConvergenceException: org.apache.commons.math.ConvergenceException: org.apache.commons.math.FunctionEvaluationException: hi!", strArray14);
        org.apache.commons.math.MaxIterationsExceededException maxIterationsExceededException36 = new org.apache.commons.math.MaxIterationsExceededException(0);
        org.apache.commons.math.FunctionEvaluationException functionEvaluationException37 = new org.apache.commons.math.FunctionEvaluationException((double) 10, "org.apache.commons.math.FunctionEvaluationException: Evaluation failed for argument = 0", (java.lang.Throwable) maxIterationsExceededException36);
        int int38 = maxIterationsExceededException36.getMaxIterations();
        org.apache.commons.math.ConvergenceException convergenceException39 = new org.apache.commons.math.ConvergenceException((java.lang.Throwable) maxIterationsExceededException36);
        org.apache.commons.math.FunctionEvaluationException functionEvaluationException40 = new org.apache.commons.math.FunctionEvaluationException((double) 35, "org.apache.commons.math.FunctionEvaluationException: org.apache.commons.math.ode.DerivativeException: org.apache.commons.math.ConvergenceException: org.apache.commons.math.FunctionEvaluationException: hi!", (java.lang.Object[]) strArray14, (java.lang.Throwable) maxIterationsExceededException36);
        org.apache.commons.math.FunctionEvaluationException functionEvaluationException41 = new org.apache.commons.math.FunctionEvaluationException((double) 35, "org.apache.commons.math.FunctionEvaluationException: org.apache.commons.math.ConvergenceException: org.apache.commons.math.ode.DerivativeException: org.apache.commons.math.ConvergenceException: hi!", (java.lang.Throwable) maxIterationsExceededException36);
        org.junit.Assert.assertNotNull(strArray14);
        org.junit.Assert.assertNotNull(strArray25);
        org.junit.Assert.assertTrue("'" + int38 + "' != '" + 0 + "'", int38 == 0);
    }

    @Test
    public void test16546() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest33.test16546");
        java.lang.String[] strArray10 = new java.lang.String[] { "org.apache.commons.math.FunctionEvaluationException: hi!", "org.apache.commons.math.FunctionEvaluationException: hi!", "org.apache.commons.math.ode.DerivativeException: ", "hi!" };
        org.apache.commons.math.ode.DerivativeException derivativeException11 = new org.apache.commons.math.ode.DerivativeException("org.apache.commons.math.ode.DerivativeException: ", strArray10);
        java.lang.Object[] objArray20 = new java.lang.Object[] { 1L, (byte) 10, (short) 1 };
        org.apache.commons.math.FunctionEvaluationException functionEvaluationException21 = new org.apache.commons.math.FunctionEvaluationException((-1.0d), "hi!", objArray20);
        org.apache.commons.math.FunctionEvaluationException functionEvaluationException22 = new org.apache.commons.math.FunctionEvaluationException((double) 0L, "", objArray20);
        java.lang.String str23 = functionEvaluationException22.getPattern();
        org.apache.commons.math.ode.DerivativeException derivativeException24 = new org.apache.commons.math.ode.DerivativeException((java.lang.Throwable) functionEvaluationException22);
        java.lang.Object[] objArray25 = derivativeException24.getArguments();
        org.apache.commons.math.ConvergenceException convergenceException26 = new org.apache.commons.math.ConvergenceException("hi!", (java.lang.Throwable) derivativeException24);
        org.apache.commons.math.ConvergenceException convergenceException27 = new org.apache.commons.math.ConvergenceException("org.apache.commons.math.ode.DerivativeException: ", (java.lang.Object[]) strArray10, (java.lang.Throwable) convergenceException26);
        java.lang.Object[] objArray37 = new java.lang.Object[] { 1L, (byte) 10, (short) 1 };
        org.apache.commons.math.FunctionEvaluationException functionEvaluationException38 = new org.apache.commons.math.FunctionEvaluationException((-1.0d), "hi!", objArray37);
        java.lang.Throwable throwable39 = null;
        org.apache.commons.math.FunctionEvaluationException functionEvaluationException40 = new org.apache.commons.math.FunctionEvaluationException((double) (short) 1, "hi!", objArray37, throwable39);
        org.apache.commons.math.FunctionEvaluationException functionEvaluationException41 = new org.apache.commons.math.FunctionEvaluationException((-1.0d), "Evaluation failed for argument = {0}", throwable39);
        org.apache.commons.math.FunctionEvaluationException functionEvaluationException42 = new org.apache.commons.math.FunctionEvaluationException((double) 100.0f, "org.apache.commons.math.ode.DerivativeException: ", (java.lang.Object[]) strArray10, (java.lang.Throwable) functionEvaluationException41);
        org.apache.commons.math.FunctionEvaluationException functionEvaluationException43 = new org.apache.commons.math.FunctionEvaluationException((double) (byte) 1, "org.apache.commons.math.ConvergenceException: org.apache.commons.math.ode.DerivativeException: org.apache.commons.math.FunctionEvaluationException: org.apache.commons.math.MaxIterationsExceededException: org.apache.commons.math.ConvergenceException: ", (java.lang.Object[]) strArray10);
        org.junit.Assert.assertNotNull(strArray10);
        org.junit.Assert.assertNotNull(objArray20);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray20), "[1, 10, 1]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray20), "[1, 10, 1]");
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "" + "'", str23, "");
        org.junit.Assert.assertNotNull(objArray25);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray25), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray25), "[]");
        org.junit.Assert.assertNotNull(objArray37);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray37), "[1, 10, 1]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray37), "[1, 10, 1]");
    }

    @Test
    public void test16547() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest33.test16547");
        java.lang.String[] strArray9 = new java.lang.String[] { "Evaluation failed for argument = {0}", "Evaluation failed for argument = {0}", "Evaluation failed for argument = {0}", "", "", "org.apache.commons.math.ConvergenceException: org.apache.commons.math.FunctionEvaluationException: hi!" };
        org.apache.commons.math.ode.DerivativeException derivativeException10 = new org.apache.commons.math.ode.DerivativeException("Evaluation failed for argument = {0}", strArray9);
        org.apache.commons.math.ConvergenceException convergenceException11 = new org.apache.commons.math.ConvergenceException("org.apache.commons.math.FunctionEvaluationException: Evaluation failed for argument = hi!", (java.lang.Object[]) strArray9);
        org.apache.commons.math.ConvergenceException convergenceException12 = new org.apache.commons.math.ConvergenceException("org.apache.commons.math.ode.DerivativeException: org.apache.commons.math.MaxIterationsExceededException: org.apache.commons.math.FunctionEvaluationException: Evaluation failed for argument = 0", (java.lang.Throwable) convergenceException11);
        java.lang.String str13 = convergenceException12.toString();
        org.junit.Assert.assertNotNull(strArray9);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "org.apache.commons.math.ConvergenceException: org.apache.commons.math.ode.DerivativeException: org.apache.commons.math.MaxIterationsExceededException: org.apache.commons.math.FunctionEvaluationException: Evaluation failed for argument = 0" + "'", str13, "org.apache.commons.math.ConvergenceException: org.apache.commons.math.ode.DerivativeException: org.apache.commons.math.MaxIterationsExceededException: org.apache.commons.math.FunctionEvaluationException: Evaluation failed for argument = 0");
    }

    @Test
    public void test16548() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest33.test16548");
        java.lang.Object[] objArray11 = new java.lang.Object[] { 1L, (byte) 10, (short) 1 };
        org.apache.commons.math.FunctionEvaluationException functionEvaluationException12 = new org.apache.commons.math.FunctionEvaluationException((-1.0d), "hi!", objArray11);
        org.apache.commons.math.FunctionEvaluationException functionEvaluationException13 = new org.apache.commons.math.FunctionEvaluationException((double) 0L, "", objArray11);
        java.lang.String str14 = functionEvaluationException13.getPattern();
        org.apache.commons.math.ode.DerivativeException derivativeException15 = new org.apache.commons.math.ode.DerivativeException((java.lang.Throwable) functionEvaluationException13);
        org.apache.commons.math.FunctionEvaluationException functionEvaluationException16 = new org.apache.commons.math.FunctionEvaluationException((double) '#', (java.lang.Throwable) functionEvaluationException13);
        java.lang.Throwable[] throwableArray17 = functionEvaluationException13.getSuppressed();
        java.lang.Throwable throwable21 = null;
        org.apache.commons.math.ConvergenceException convergenceException22 = new org.apache.commons.math.ConvergenceException("hi!", throwable21);
        org.apache.commons.math.ode.DerivativeException derivativeException23 = new org.apache.commons.math.ode.DerivativeException((java.lang.Throwable) convergenceException22);
        java.lang.Throwable[] throwableArray24 = derivativeException23.getSuppressed();
        org.apache.commons.math.MaxIterationsExceededException maxIterationsExceededException25 = new org.apache.commons.math.MaxIterationsExceededException((int) (byte) 10, "org.apache.commons.math.ConvergenceException: org.apache.commons.math.FunctionEvaluationException: Evaluation failed for argument = 0", (java.lang.Object[]) throwableArray24);
        int int26 = maxIterationsExceededException25.getMaxIterations();
        org.apache.commons.math.ConvergenceException convergenceException27 = new org.apache.commons.math.ConvergenceException("org.apache.commons.math.ConvergenceException: org.apache.commons.math.FunctionEvaluationException: org.apache.commons.math.ode.DerivativeException: ", (java.lang.Object[]) throwableArray17, (java.lang.Throwable) maxIterationsExceededException25);
        org.apache.commons.math.ConvergenceException convergenceException28 = new org.apache.commons.math.ConvergenceException((java.lang.Throwable) convergenceException27);
        java.lang.Throwable[] throwableArray29 = convergenceException27.getSuppressed();
        java.lang.String str30 = convergenceException27.getPattern();
        java.lang.Throwable[] throwableArray31 = convergenceException27.getSuppressed();
        org.apache.commons.math.ConvergenceException convergenceException35 = new org.apache.commons.math.ConvergenceException("");
        java.lang.Object[] objArray43 = new java.lang.Object[] { 1L, (byte) 10, (short) 1 };
        org.apache.commons.math.FunctionEvaluationException functionEvaluationException44 = new org.apache.commons.math.FunctionEvaluationException((-1.0d), "hi!", objArray43);
        java.lang.Throwable throwable45 = null;
        org.apache.commons.math.FunctionEvaluationException functionEvaluationException46 = new org.apache.commons.math.FunctionEvaluationException((double) (short) 1, "hi!", objArray43, throwable45);
        java.lang.String str47 = functionEvaluationException46.getPattern();
        double double48 = functionEvaluationException46.getArgument();
        convergenceException35.addSuppressed((java.lang.Throwable) functionEvaluationException46);
        java.lang.Object[] objArray50 = functionEvaluationException46.getArguments();
        org.apache.commons.math.FunctionEvaluationException functionEvaluationException51 = new org.apache.commons.math.FunctionEvaluationException((double) 1, "org.apache.commons.math.FunctionEvaluationException: org.apache.commons.math.MaxIterationsExceededException: org.apache.commons.math.ConvergenceException: org.apache.commons.math.FunctionEvaluationException: Evaluation failed for argument = 0", objArray50);
        org.apache.commons.math.ode.DerivativeException derivativeException52 = new org.apache.commons.math.ode.DerivativeException((java.lang.Throwable) functionEvaluationException51);
        java.lang.Throwable[] throwableArray53 = functionEvaluationException51.getSuppressed();
        org.apache.commons.math.ConvergenceException convergenceException54 = new org.apache.commons.math.ConvergenceException((java.lang.Throwable) functionEvaluationException51);
        org.apache.commons.math.FunctionEvaluationException functionEvaluationException55 = new org.apache.commons.math.FunctionEvaluationException((double) 97, "org.apache.commons.math.FunctionEvaluationException: org.apache.commons.math.ConvergenceException: org.apache.commons.math.ConvergenceException: org.apache.commons.math.FunctionEvaluationException: Evaluation failed for argument = 0", (java.lang.Object[]) throwableArray31, (java.lang.Throwable) functionEvaluationException51);
        java.lang.String str56 = functionEvaluationException51.toString();
        org.junit.Assert.assertNotNull(objArray11);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray11), "[1, 10, 1]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray11), "[1, 10, 1]");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
        org.junit.Assert.assertNotNull(throwableArray17);
        org.junit.Assert.assertNotNull(throwableArray24);
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + 10 + "'", int26 == 10);
        org.junit.Assert.assertNotNull(throwableArray29);
        org.junit.Assert.assertEquals("'" + str30 + "' != '" + "org.apache.commons.math.ConvergenceException: org.apache.commons.math.FunctionEvaluationException: org.apache.commons.math.ode.DerivativeException: " + "'", str30, "org.apache.commons.math.ConvergenceException: org.apache.commons.math.FunctionEvaluationException: org.apache.commons.math.ode.DerivativeException: ");
        org.junit.Assert.assertNotNull(throwableArray31);
        org.junit.Assert.assertNotNull(objArray43);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray43), "[1, 10, 1]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray43), "[1, 10, 1]");
        org.junit.Assert.assertEquals("'" + str47 + "' != '" + "hi!" + "'", str47, "hi!");
        org.junit.Assert.assertTrue("'" + double48 + "' != '" + 1.0d + "'", double48 == 1.0d);
        org.junit.Assert.assertNotNull(objArray50);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray50), "[1, 10, 1]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray50), "[1, 10, 1]");
        org.junit.Assert.assertNotNull(throwableArray53);
        org.junit.Assert.assertEquals("'" + str56 + "' != '" + "org.apache.commons.math.FunctionEvaluationException: org.apache.commons.math.FunctionEvaluationException: org.apache.commons.math.MaxIterationsExceededException: org.apache.commons.math.ConvergenceException: org.apache.commons.math.FunctionEvaluationException: Evaluation failed for argument = 0" + "'", str56, "org.apache.commons.math.FunctionEvaluationException: org.apache.commons.math.FunctionEvaluationException: org.apache.commons.math.MaxIterationsExceededException: org.apache.commons.math.ConvergenceException: org.apache.commons.math.FunctionEvaluationException: Evaluation failed for argument = 0");
    }

    @Test
    public void test16549() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest33.test16549");
        org.apache.commons.math.FunctionEvaluationException functionEvaluationException2 = new org.apache.commons.math.FunctionEvaluationException((double) '4', "org.apache.commons.math.ode.DerivativeException: Maximal number of iterations (52) exceeded");
    }

    @Test
    public void test16550() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest33.test16550");
        java.lang.Object[] objArray5 = new java.lang.Object[] { 1L, (byte) 10, (short) 1 };
        org.apache.commons.math.FunctionEvaluationException functionEvaluationException6 = new org.apache.commons.math.FunctionEvaluationException((-1.0d), "hi!", objArray5);
        java.lang.Object[] objArray7 = functionEvaluationException6.getArguments();
        java.lang.Throwable[] throwableArray8 = functionEvaluationException6.getSuppressed();
        org.junit.Assert.assertNotNull(objArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray5), "[1, 10, 1]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray5), "[1, 10, 1]");
        org.junit.Assert.assertNotNull(objArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray7), "[1, 10, 1]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray7), "[1, 10, 1]");
        org.junit.Assert.assertNotNull(throwableArray8);
    }

    @Test
    public void test16551() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest33.test16551");
        java.lang.Throwable throwable8 = null;
        org.apache.commons.math.ConvergenceException convergenceException9 = new org.apache.commons.math.ConvergenceException("hi!", throwable8);
        org.apache.commons.math.ode.DerivativeException derivativeException10 = new org.apache.commons.math.ode.DerivativeException((java.lang.Throwable) convergenceException9);
        java.lang.Throwable[] throwableArray11 = derivativeException10.getSuppressed();
        org.apache.commons.math.MaxIterationsExceededException maxIterationsExceededException12 = new org.apache.commons.math.MaxIterationsExceededException((int) (byte) 1, "org.apache.commons.math.FunctionEvaluationException: Evaluation failed for argument = 0", (java.lang.Object[]) throwableArray11);
        org.apache.commons.math.ConvergenceException convergenceException13 = new org.apache.commons.math.ConvergenceException("org.apache.commons.math.FunctionEvaluationException: hi!", (java.lang.Object[]) throwableArray11);
        java.lang.String[] strArray20 = new java.lang.String[] { "org.apache.commons.math.FunctionEvaluationException: hi!" };
        org.apache.commons.math.ode.DerivativeException derivativeException21 = new org.apache.commons.math.ode.DerivativeException("hi!", strArray20);
        org.apache.commons.math.ode.DerivativeException derivativeException22 = new org.apache.commons.math.ode.DerivativeException("", strArray20);
        org.apache.commons.math.ode.DerivativeException derivativeException23 = new org.apache.commons.math.ode.DerivativeException("org.apache.commons.math.FunctionEvaluationException: Evaluation failed for argument = 0", strArray20);
        org.apache.commons.math.FunctionEvaluationException functionEvaluationException24 = new org.apache.commons.math.FunctionEvaluationException(0.0d, "org.apache.commons.math.FunctionEvaluationException: Evaluation failed for argument = {0}", (java.lang.Object[]) strArray20);
        org.apache.commons.math.ode.DerivativeException derivativeException25 = new org.apache.commons.math.ode.DerivativeException((java.lang.Throwable) functionEvaluationException24);
        org.apache.commons.math.ConvergenceException convergenceException26 = new org.apache.commons.math.ConvergenceException("Evaluation failed for argument = {0}", (java.lang.Object[]) throwableArray11, (java.lang.Throwable) functionEvaluationException24);
        java.lang.String[] strArray40 = new java.lang.String[] { "hi!", "", "hi!", "hi!", "hi!" };
        org.apache.commons.math.ode.DerivativeException derivativeException41 = new org.apache.commons.math.ode.DerivativeException("", strArray40);
        org.apache.commons.math.ode.DerivativeException derivativeException42 = new org.apache.commons.math.ode.DerivativeException("", strArray40);
        java.lang.String[] strArray49 = new java.lang.String[] { "hi!", "", "hi!", "hi!", "hi!" };
        org.apache.commons.math.ode.DerivativeException derivativeException50 = new org.apache.commons.math.ode.DerivativeException("", strArray49);
        org.apache.commons.math.ode.DerivativeException derivativeException51 = new org.apache.commons.math.ode.DerivativeException((java.lang.Throwable) derivativeException50);
        org.apache.commons.math.ConvergenceException convergenceException52 = new org.apache.commons.math.ConvergenceException("hi!", (java.lang.Object[]) strArray40, (java.lang.Throwable) derivativeException50);
        org.apache.commons.math.ode.DerivativeException derivativeException53 = new org.apache.commons.math.ode.DerivativeException("hi!", strArray40);
        java.lang.Object[] objArray61 = new java.lang.Object[] { 1L, (byte) 10, (short) 1 };
        org.apache.commons.math.FunctionEvaluationException functionEvaluationException62 = new org.apache.commons.math.FunctionEvaluationException((-1.0d), "hi!", objArray61);
        java.lang.Throwable throwable63 = null;
        org.apache.commons.math.FunctionEvaluationException functionEvaluationException64 = new org.apache.commons.math.FunctionEvaluationException((double) (short) 1, "hi!", objArray61, throwable63);
        org.apache.commons.math.ConvergenceException convergenceException65 = new org.apache.commons.math.ConvergenceException("org.apache.commons.math.FunctionEvaluationException: hi!", (java.lang.Object[]) strArray40, throwable63);
        org.apache.commons.math.FunctionEvaluationException functionEvaluationException66 = new org.apache.commons.math.FunctionEvaluationException(1.0d, "org.apache.commons.math.ConvergenceException: hi!", (java.lang.Object[]) strArray40);
        org.apache.commons.math.ode.DerivativeException derivativeException67 = new org.apache.commons.math.ode.DerivativeException("org.apache.commons.math.ode.DerivativeException: org.apache.commons.math.ConvergenceException: org.apache.commons.math.ConvergenceException: org.apache.commons.math.FunctionEvaluationException: hi!", strArray40);
        org.apache.commons.math.ConvergenceException convergenceException69 = new org.apache.commons.math.ConvergenceException("Maximal number of iterations ({0}) exceeded");
        derivativeException67.addSuppressed((java.lang.Throwable) convergenceException69);
        org.apache.commons.math.ConvergenceException convergenceException71 = new org.apache.commons.math.ConvergenceException((java.lang.Throwable) convergenceException69);
        org.apache.commons.math.FunctionEvaluationException functionEvaluationException72 = new org.apache.commons.math.FunctionEvaluationException((double) 97, "org.apache.commons.math.ConvergenceException: org.apache.commons.math.ConvergenceException: org.apache.commons.math.ConvergenceException: org.apache.commons.math.ConvergenceException: org.apache.commons.math.FunctionEvaluationException: hi!", (java.lang.Object[]) throwableArray11, (java.lang.Throwable) convergenceException71);
        org.apache.commons.math.ConvergenceException convergenceException73 = new org.apache.commons.math.ConvergenceException("org.apache.commons.math.ConvergenceException: org.apache.commons.math.FunctionEvaluationException: org.apache.commons.math.FunctionEvaluationException: org.apache.commons.math.ode.DerivativeException: ", (java.lang.Object[]) throwableArray11);
        java.lang.String str74 = convergenceException73.toString();
        org.junit.Assert.assertNotNull(throwableArray11);
        org.junit.Assert.assertNotNull(strArray20);
        org.junit.Assert.assertNotNull(strArray40);
        org.junit.Assert.assertNotNull(strArray49);
        org.junit.Assert.assertNotNull(objArray61);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray61), "[1, 10, 1]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray61), "[1, 10, 1]");
        org.junit.Assert.assertEquals("'" + str74 + "' != '" + "org.apache.commons.math.ConvergenceException: org.apache.commons.math.ConvergenceException: org.apache.commons.math.FunctionEvaluationException: org.apache.commons.math.FunctionEvaluationException: org.apache.commons.math.ode.DerivativeException: " + "'", str74, "org.apache.commons.math.ConvergenceException: org.apache.commons.math.ConvergenceException: org.apache.commons.math.FunctionEvaluationException: org.apache.commons.math.FunctionEvaluationException: org.apache.commons.math.ode.DerivativeException: ");
    }

    @Test
    public void test16552() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest33.test16552");
        java.lang.String[] strArray7 = new java.lang.String[] { "org.apache.commons.math.FunctionEvaluationException: hi!" };
        org.apache.commons.math.ode.DerivativeException derivativeException8 = new org.apache.commons.math.ode.DerivativeException("hi!", strArray7);
        org.apache.commons.math.ode.DerivativeException derivativeException9 = new org.apache.commons.math.ode.DerivativeException("", strArray7);
        org.apache.commons.math.FunctionEvaluationException functionEvaluationException10 = new org.apache.commons.math.FunctionEvaluationException(0.0d, "hi!", (java.lang.Object[]) strArray7);
        org.apache.commons.math.ode.DerivativeException derivativeException11 = new org.apache.commons.math.ode.DerivativeException("org.apache.commons.math.ConvergenceException: org.apache.commons.math.ode.DerivativeException: hi!", strArray7);
        java.lang.String[] strArray22 = new java.lang.String[] { "hi!", "", "hi!", "hi!", "hi!" };
        org.apache.commons.math.ode.DerivativeException derivativeException23 = new org.apache.commons.math.ode.DerivativeException("", strArray22);
        org.apache.commons.math.ode.DerivativeException derivativeException24 = new org.apache.commons.math.ode.DerivativeException("", strArray22);
        java.lang.String[] strArray31 = new java.lang.String[] { "hi!", "", "hi!", "hi!", "hi!" };
        org.apache.commons.math.ode.DerivativeException derivativeException32 = new org.apache.commons.math.ode.DerivativeException("", strArray31);
        org.apache.commons.math.ode.DerivativeException derivativeException33 = new org.apache.commons.math.ode.DerivativeException((java.lang.Throwable) derivativeException32);
        org.apache.commons.math.ConvergenceException convergenceException34 = new org.apache.commons.math.ConvergenceException("hi!", (java.lang.Object[]) strArray22, (java.lang.Throwable) derivativeException32);
        org.apache.commons.math.ode.DerivativeException derivativeException35 = new org.apache.commons.math.ode.DerivativeException("org.apache.commons.math.ConvergenceException: hi!", strArray22);
        org.apache.commons.math.ConvergenceException convergenceException36 = new org.apache.commons.math.ConvergenceException((java.lang.Throwable) derivativeException35);
        org.apache.commons.math.FunctionEvaluationException functionEvaluationException37 = new org.apache.commons.math.FunctionEvaluationException((double) ' ', (java.lang.Throwable) derivativeException35);
        org.apache.commons.math.ConvergenceException convergenceException38 = new org.apache.commons.math.ConvergenceException("org.apache.commons.math.ode.DerivativeException: org.apache.commons.math.ConvergenceException: org.apache.commons.math.FunctionEvaluationException: Evaluation failed for argument = 0", (java.lang.Object[]) strArray7, (java.lang.Throwable) functionEvaluationException37);
        org.apache.commons.math.ode.DerivativeException derivativeException39 = new org.apache.commons.math.ode.DerivativeException((java.lang.Throwable) convergenceException38);
        org.junit.Assert.assertNotNull(strArray7);
        org.junit.Assert.assertNotNull(strArray22);
        org.junit.Assert.assertNotNull(strArray31);
    }

    @Test
    public void test16553() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest33.test16553");
        java.lang.String[] strArray13 = new java.lang.String[] { "hi!", "", "hi!", "hi!", "hi!" };
        org.apache.commons.math.ode.DerivativeException derivativeException14 = new org.apache.commons.math.ode.DerivativeException("", strArray13);
        org.apache.commons.math.ode.DerivativeException derivativeException15 = new org.apache.commons.math.ode.DerivativeException("", strArray13);
        java.lang.Throwable throwable18 = null;
        org.apache.commons.math.ConvergenceException convergenceException19 = new org.apache.commons.math.ConvergenceException("hi!", throwable18);
        org.apache.commons.math.ode.DerivativeException derivativeException20 = new org.apache.commons.math.ode.DerivativeException((java.lang.Throwable) convergenceException19);
        java.lang.Throwable[] throwableArray21 = derivativeException20.getSuppressed();
        org.apache.commons.math.ConvergenceException convergenceException22 = new org.apache.commons.math.ConvergenceException("hi!", (java.lang.Throwable) derivativeException20);
        derivativeException15.addSuppressed((java.lang.Throwable) convergenceException22);
        java.lang.Throwable[] throwableArray24 = derivativeException15.getSuppressed();
        java.lang.Object[] objArray31 = new java.lang.Object[] { 1L, (byte) 10, (short) 1 };
        org.apache.commons.math.FunctionEvaluationException functionEvaluationException32 = new org.apache.commons.math.FunctionEvaluationException((-1.0d), "hi!", objArray31);
        java.lang.Object[] objArray38 = new java.lang.Object[] { 10L, (-1L), 10, 0.0d };
        java.lang.Throwable throwable39 = null;
        org.apache.commons.math.ConvergenceException convergenceException40 = new org.apache.commons.math.ConvergenceException("hi!", objArray38, throwable39);
        org.apache.commons.math.ConvergenceException convergenceException41 = new org.apache.commons.math.ConvergenceException("Evaluation failed for argument = {0}", objArray31, (java.lang.Throwable) convergenceException40);
        org.apache.commons.math.ConvergenceException convergenceException42 = new org.apache.commons.math.ConvergenceException((java.lang.Throwable) convergenceException40);
        org.apache.commons.math.ConvergenceException convergenceException43 = new org.apache.commons.math.ConvergenceException("org.apache.commons.math.ode.DerivativeException: org.apache.commons.math.ConvergenceException: org.apache.commons.math.FunctionEvaluationException: hi!", (java.lang.Object[]) throwableArray24, (java.lang.Throwable) convergenceException40);
        java.lang.Throwable[] throwableArray44 = convergenceException43.getSuppressed();
        java.lang.String[] strArray56 = new java.lang.String[] { "hi!", "", "hi!", "hi!", "hi!" };
        org.apache.commons.math.ode.DerivativeException derivativeException57 = new org.apache.commons.math.ode.DerivativeException("", strArray56);
        org.apache.commons.math.ode.DerivativeException derivativeException58 = new org.apache.commons.math.ode.DerivativeException("", strArray56);
        org.apache.commons.math.ConvergenceException convergenceException59 = new org.apache.commons.math.ConvergenceException("org.apache.commons.math.FunctionEvaluationException: hi!", (java.lang.Object[]) strArray56);
        org.apache.commons.math.ConvergenceException convergenceException60 = new org.apache.commons.math.ConvergenceException("", (java.lang.Object[]) strArray56);
        org.apache.commons.math.MaxIterationsExceededException maxIterationsExceededException61 = new org.apache.commons.math.MaxIterationsExceededException(0, "org.apache.commons.math.ConvergenceException: org.apache.commons.math.FunctionEvaluationException: org.apache.commons.math.ode.DerivativeException: ", (java.lang.Object[]) strArray56);
        org.apache.commons.math.FunctionEvaluationException functionEvaluationException62 = new org.apache.commons.math.FunctionEvaluationException((double) (byte) -1, "org.apache.commons.math.FunctionEvaluationException: Evaluation failed for argument = 1", (java.lang.Object[]) throwableArray44, (java.lang.Throwable) maxIterationsExceededException61);
        org.apache.commons.math.FunctionEvaluationException functionEvaluationException63 = new org.apache.commons.math.FunctionEvaluationException((double) 10L, (java.lang.Throwable) maxIterationsExceededException61);
        org.apache.commons.math.ConvergenceException convergenceException64 = new org.apache.commons.math.ConvergenceException((java.lang.Throwable) functionEvaluationException63);
        org.apache.commons.math.FunctionEvaluationException functionEvaluationException65 = new org.apache.commons.math.FunctionEvaluationException((double) 100, "Maximal number of iterations ({0}) exceeded", (java.lang.Throwable) convergenceException64);
        org.junit.Assert.assertNotNull(strArray13);
        org.junit.Assert.assertNotNull(throwableArray21);
        org.junit.Assert.assertNotNull(throwableArray24);
        org.junit.Assert.assertNotNull(objArray31);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray31), "[1, 10, 1]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray31), "[1, 10, 1]");
        org.junit.Assert.assertNotNull(objArray38);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray38), "[10, -1, 10, 0.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray38), "[10, -1, 10, 0.0]");
        org.junit.Assert.assertNotNull(throwableArray44);
        org.junit.Assert.assertNotNull(strArray56);
    }

    @Test
    public void test16554() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest33.test16554");
        java.lang.String[] strArray16 = new java.lang.String[] { "hi!", "", "hi!", "hi!", "hi!" };
        org.apache.commons.math.ode.DerivativeException derivativeException17 = new org.apache.commons.math.ode.DerivativeException("", strArray16);
        org.apache.commons.math.ode.DerivativeException derivativeException18 = new org.apache.commons.math.ode.DerivativeException("", strArray16);
        org.apache.commons.math.ConvergenceException convergenceException19 = new org.apache.commons.math.ConvergenceException("org.apache.commons.math.FunctionEvaluationException: hi!", (java.lang.Object[]) strArray16);
        org.apache.commons.math.ConvergenceException convergenceException20 = new org.apache.commons.math.ConvergenceException("", (java.lang.Object[]) strArray16);
        org.apache.commons.math.FunctionEvaluationException functionEvaluationException21 = new org.apache.commons.math.FunctionEvaluationException((double) (-1L), "org.apache.commons.math.ConvergenceException: org.apache.commons.math.FunctionEvaluationException: hi!", (java.lang.Object[]) strArray16);
        org.apache.commons.math.MaxIterationsExceededException maxIterationsExceededException22 = new org.apache.commons.math.MaxIterationsExceededException((int) (byte) 1, "org.apache.commons.math.FunctionEvaluationException: ", (java.lang.Object[]) strArray16);
        org.apache.commons.math.FunctionEvaluationException functionEvaluationException23 = new org.apache.commons.math.FunctionEvaluationException((double) 10.0f, "org.apache.commons.math.MaxIterationsExceededException: ", (java.lang.Throwable) maxIterationsExceededException22);
        java.lang.Throwable[] throwableArray24 = maxIterationsExceededException22.getSuppressed();
        org.apache.commons.math.ConvergenceException convergenceException25 = new org.apache.commons.math.ConvergenceException("org.apache.commons.math.FunctionEvaluationException: Evaluation failed for argument = 100", (java.lang.Object[]) throwableArray24);
        org.junit.Assert.assertNotNull(strArray16);
        org.junit.Assert.assertNotNull(throwableArray24);
    }

    @Test
    public void test16555() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest33.test16555");
        java.lang.String[] strArray25 = new java.lang.String[] { "hi!", "", "hi!", "hi!", "hi!" };
        org.apache.commons.math.ode.DerivativeException derivativeException26 = new org.apache.commons.math.ode.DerivativeException("", strArray25);
        org.apache.commons.math.MaxIterationsExceededException maxIterationsExceededException27 = new org.apache.commons.math.MaxIterationsExceededException(10, "org.apache.commons.math.FunctionEvaluationException: Evaluation failed for argument = 0", (java.lang.Object[]) strArray25);
        org.apache.commons.math.MaxIterationsExceededException maxIterationsExceededException29 = new org.apache.commons.math.MaxIterationsExceededException(3);
        org.apache.commons.math.FunctionEvaluationException functionEvaluationException30 = new org.apache.commons.math.FunctionEvaluationException((double) 0, "hi!", (java.lang.Object[]) strArray25, (java.lang.Throwable) maxIterationsExceededException29);
        org.apache.commons.math.ConvergenceException convergenceException31 = new org.apache.commons.math.ConvergenceException("hi!", (java.lang.Object[]) strArray25);
        org.apache.commons.math.MaxIterationsExceededException maxIterationsExceededException32 = new org.apache.commons.math.MaxIterationsExceededException((int) '4', "org.apache.commons.math.ConvergenceException: org.apache.commons.math.FunctionEvaluationException: hi!", (java.lang.Object[]) strArray25);
        org.apache.commons.math.FunctionEvaluationException functionEvaluationException34 = new org.apache.commons.math.FunctionEvaluationException((double) (-1.0f));
        double double35 = functionEvaluationException34.getArgument();
        org.apache.commons.math.ConvergenceException convergenceException36 = new org.apache.commons.math.ConvergenceException("Maximal number of iterations ({0}) exceeded", (java.lang.Object[]) strArray25, (java.lang.Throwable) functionEvaluationException34);
        org.apache.commons.math.FunctionEvaluationException functionEvaluationException37 = new org.apache.commons.math.FunctionEvaluationException((double) (short) 1, "org.apache.commons.math.ConvergenceException: org.apache.commons.math.FunctionEvaluationException: hi!", (java.lang.Object[]) strArray25);
        org.apache.commons.math.ConvergenceException convergenceException38 = new org.apache.commons.math.ConvergenceException("org.apache.commons.math.ode.DerivativeException: org.apache.commons.math.ConvergenceException: org.apache.commons.math.FunctionEvaluationException: hi!", (java.lang.Object[]) strArray25);
        org.apache.commons.math.ode.DerivativeException derivativeException39 = new org.apache.commons.math.ode.DerivativeException("Maximal number of iterations (0) exceeded", strArray25);
        org.apache.commons.math.ode.DerivativeException derivativeException40 = new org.apache.commons.math.ode.DerivativeException("org.apache.commons.math.ode.DerivativeException: org.apache.commons.math.MaxIterationsExceededException: org.apache.commons.math.ConvergenceException: org.apache.commons.math.ode.DerivativeException: ", strArray25);
        org.apache.commons.math.ConvergenceException convergenceException41 = new org.apache.commons.math.ConvergenceException("org.apache.commons.math.ConvergenceException: org.apache.commons.math.ConvergenceException: org.apache.commons.math.ode.DerivativeException: ", (java.lang.Object[]) strArray25);
        org.apache.commons.math.ode.DerivativeException derivativeException42 = new org.apache.commons.math.ode.DerivativeException("org.apache.commons.math.FunctionEvaluationException: org.apache.commons.math.FunctionEvaluationException: org.apache.commons.math.MaxIterationsExceededException: org.apache.commons.math.ConvergenceException: ", strArray25);
        org.apache.commons.math.ode.DerivativeException derivativeException43 = new org.apache.commons.math.ode.DerivativeException("org.apache.commons.math.FunctionEvaluationException: org.apache.commons.math.FunctionEvaluationException", strArray25);
        org.apache.commons.math.ode.DerivativeException derivativeException44 = new org.apache.commons.math.ode.DerivativeException("org.apache.commons.math.FunctionEvaluationException: org.apache.commons.math.ConvergenceException: org.apache.commons.math.ConvergenceException: org.apache.commons.math.ConvergenceException: org.apache.commons.math.ConvergenceException: org.apache.commons.math.FunctionEvaluationException: hi!", strArray25);
        org.apache.commons.math.FunctionEvaluationException functionEvaluationException45 = new org.apache.commons.math.FunctionEvaluationException((double) 100L, "org.apache.commons.math.FunctionEvaluationException: org.apache.commons.math.ConvergenceException: org.apache.commons.math.FunctionEvaluationException: org.apache.commons.math.FunctionEvaluationException: Evaluation failed for argument = 2", (java.lang.Object[]) strArray25);
        org.junit.Assert.assertNotNull(strArray25);
        org.junit.Assert.assertTrue("'" + double35 + "' != '" + (-1.0d) + "'", double35 == (-1.0d));
    }

    @Test
    public void test16556() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest33.test16556");
        java.lang.Object[] objArray17 = new java.lang.Object[] { 1L, (byte) 10, (short) 1 };
        org.apache.commons.math.FunctionEvaluationException functionEvaluationException18 = new org.apache.commons.math.FunctionEvaluationException((-1.0d), "hi!", objArray17);
        org.apache.commons.math.FunctionEvaluationException functionEvaluationException19 = new org.apache.commons.math.FunctionEvaluationException((double) 0L, "", objArray17);
        java.lang.Object[] objArray28 = new java.lang.Object[] { 1L, (byte) 10, (short) 1 };
        org.apache.commons.math.FunctionEvaluationException functionEvaluationException29 = new org.apache.commons.math.FunctionEvaluationException((-1.0d), "hi!", objArray28);
        java.lang.Throwable throwable30 = null;
        org.apache.commons.math.FunctionEvaluationException functionEvaluationException31 = new org.apache.commons.math.FunctionEvaluationException((double) (short) 1, "hi!", objArray28, throwable30);
        java.lang.String str32 = functionEvaluationException31.getPattern();
        java.lang.Throwable[] throwableArray33 = functionEvaluationException31.getSuppressed();
        org.apache.commons.math.ode.DerivativeException derivativeException34 = new org.apache.commons.math.ode.DerivativeException((java.lang.Throwable) functionEvaluationException31);
        org.apache.commons.math.ConvergenceException convergenceException35 = new org.apache.commons.math.ConvergenceException("", (java.lang.Throwable) functionEvaluationException31);
        org.apache.commons.math.FunctionEvaluationException functionEvaluationException36 = new org.apache.commons.math.FunctionEvaluationException((double) (short) 1, "org.apache.commons.math.ConvergenceException: ", objArray17, (java.lang.Throwable) convergenceException35);
        org.apache.commons.math.FunctionEvaluationException functionEvaluationException37 = new org.apache.commons.math.FunctionEvaluationException((double) (short) 100, "org.apache.commons.math.FunctionEvaluationException: hi!", objArray17);
        org.apache.commons.math.MaxIterationsExceededException maxIterationsExceededException42 = new org.apache.commons.math.MaxIterationsExceededException((int) (byte) -1);
        java.lang.Object[] objArray43 = maxIterationsExceededException42.getArguments();
        org.apache.commons.math.FunctionEvaluationException functionEvaluationException47 = new org.apache.commons.math.FunctionEvaluationException((double) '4');
        org.apache.commons.math.FunctionEvaluationException functionEvaluationException48 = new org.apache.commons.math.FunctionEvaluationException((double) (short) 100, "", (java.lang.Throwable) functionEvaluationException47);
        org.apache.commons.math.FunctionEvaluationException functionEvaluationException49 = new org.apache.commons.math.FunctionEvaluationException(35.0d, "org.apache.commons.math.FunctionEvaluationException: org.apache.commons.math.ode.DerivativeException: org.apache.commons.math.ConvergenceException: org.apache.commons.math.ConvergenceException: org.apache.commons.math.FunctionEvaluationException: hi!", objArray43, (java.lang.Throwable) functionEvaluationException48);
        org.apache.commons.math.ConvergenceException convergenceException50 = new org.apache.commons.math.ConvergenceException("org.apache.commons.math.MaxIterationsExceededException: org.apache.commons.math.ConvergenceException: org.apache.commons.math.FunctionEvaluationException: org.apache.commons.math.ode.DerivativeException: ", objArray43);
        org.apache.commons.math.ConvergenceException convergenceException51 = new org.apache.commons.math.ConvergenceException("org.apache.commons.math.ConvergenceException: Evaluation failed for argument = 100", objArray17, (java.lang.Throwable) convergenceException50);
        org.apache.commons.math.ConvergenceException convergenceException52 = new org.apache.commons.math.ConvergenceException("org.apache.commons.math.FunctionEvaluationException: Evaluation failed for argument = 97", objArray17);
        org.apache.commons.math.MaxIterationsExceededException maxIterationsExceededException53 = new org.apache.commons.math.MaxIterationsExceededException((int) '#', "org.apache.commons.math.ode.DerivativeException: org.apache.commons.math.FunctionEvaluationException: Evaluation failed for argument = 52", objArray17);
        org.apache.commons.math.MaxIterationsExceededException maxIterationsExceededException54 = new org.apache.commons.math.MaxIterationsExceededException((int) 'a', "org.apache.commons.math.FunctionEvaluationException: org.apache.commons.math.ConvergenceException: org.apache.commons.math.ConvergenceException: org.apache.commons.math.MaxIterationsExceededException: Evaluation failed for argument = hi!", objArray17);
        java.lang.String str55 = maxIterationsExceededException54.getPattern();
        org.junit.Assert.assertNotNull(objArray17);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray17), "[1, 10, 1]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray17), "[1, 10, 1]");
        org.junit.Assert.assertNotNull(objArray28);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray28), "[1, 10, 1]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray28), "[1, 10, 1]");
        org.junit.Assert.assertEquals("'" + str32 + "' != '" + "hi!" + "'", str32, "hi!");
        org.junit.Assert.assertNotNull(throwableArray33);
        org.junit.Assert.assertNotNull(objArray43);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray43), "[-1]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray43), "[-1]");
        org.junit.Assert.assertEquals("'" + str55 + "' != '" + "org.apache.commons.math.FunctionEvaluationException: org.apache.commons.math.ConvergenceException: org.apache.commons.math.ConvergenceException: org.apache.commons.math.MaxIterationsExceededException: Evaluation failed for argument = hi!" + "'", str55, "org.apache.commons.math.FunctionEvaluationException: org.apache.commons.math.ConvergenceException: org.apache.commons.math.ConvergenceException: org.apache.commons.math.MaxIterationsExceededException: Evaluation failed for argument = hi!");
    }

    @Test
    public void test16557() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest33.test16557");
        java.lang.String[] strArray17 = new java.lang.String[] { "hi!", "", "hi!", "hi!", "hi!" };
        org.apache.commons.math.ode.DerivativeException derivativeException18 = new org.apache.commons.math.ode.DerivativeException("", strArray17);
        org.apache.commons.math.ode.DerivativeException derivativeException19 = new org.apache.commons.math.ode.DerivativeException("", strArray17);
        org.apache.commons.math.ConvergenceException convergenceException20 = new org.apache.commons.math.ConvergenceException("org.apache.commons.math.FunctionEvaluationException: hi!", (java.lang.Object[]) strArray17);
        org.apache.commons.math.ConvergenceException convergenceException21 = new org.apache.commons.math.ConvergenceException("", (java.lang.Object[]) strArray17);
        org.apache.commons.math.FunctionEvaluationException functionEvaluationException22 = new org.apache.commons.math.FunctionEvaluationException((double) (-1L), "org.apache.commons.math.ConvergenceException: org.apache.commons.math.FunctionEvaluationException: hi!", (java.lang.Object[]) strArray17);
        org.apache.commons.math.MaxIterationsExceededException maxIterationsExceededException23 = new org.apache.commons.math.MaxIterationsExceededException((int) (byte) 1, "org.apache.commons.math.FunctionEvaluationException: ", (java.lang.Object[]) strArray17);
        java.lang.String[] strArray34 = new java.lang.String[] { "hi!", "", "hi!", "hi!", "hi!" };
        org.apache.commons.math.ode.DerivativeException derivativeException35 = new org.apache.commons.math.ode.DerivativeException("", strArray34);
        org.apache.commons.math.ode.DerivativeException derivativeException36 = new org.apache.commons.math.ode.DerivativeException("", strArray34);
        java.lang.Throwable throwable39 = null;
        org.apache.commons.math.ConvergenceException convergenceException40 = new org.apache.commons.math.ConvergenceException("hi!", throwable39);
        org.apache.commons.math.ode.DerivativeException derivativeException41 = new org.apache.commons.math.ode.DerivativeException((java.lang.Throwable) convergenceException40);
        java.lang.Throwable[] throwableArray42 = derivativeException41.getSuppressed();
        org.apache.commons.math.ConvergenceException convergenceException43 = new org.apache.commons.math.ConvergenceException("hi!", (java.lang.Throwable) derivativeException41);
        derivativeException36.addSuppressed((java.lang.Throwable) convergenceException43);
        org.apache.commons.math.FunctionEvaluationException functionEvaluationException45 = new org.apache.commons.math.FunctionEvaluationException((double) (short) 100, "org.apache.commons.math.ConvergenceException: hi!", (java.lang.Throwable) convergenceException43);
        org.apache.commons.math.FunctionEvaluationException functionEvaluationException46 = new org.apache.commons.math.FunctionEvaluationException((double) 1, (java.lang.Throwable) convergenceException43);
        org.apache.commons.math.FunctionEvaluationException functionEvaluationException47 = new org.apache.commons.math.FunctionEvaluationException(1.0d, "", (java.lang.Object[]) strArray17, (java.lang.Throwable) convergenceException43);
        org.apache.commons.math.ode.DerivativeException derivativeException48 = new org.apache.commons.math.ode.DerivativeException("org.apache.commons.math.ConvergenceException: ", strArray17);
        org.apache.commons.math.ode.DerivativeException derivativeException49 = new org.apache.commons.math.ode.DerivativeException("org.apache.commons.math.FunctionEvaluationException: org.apache.commons.math.ode.DerivativeException: org.apache.commons.math.ConvergenceException: ", strArray17);
        org.junit.Assert.assertNotNull(strArray17);
        org.junit.Assert.assertNotNull(strArray34);
        org.junit.Assert.assertNotNull(throwableArray42);
    }

    @Test
    public void test16558() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest33.test16558");
        org.apache.commons.math.FunctionEvaluationException functionEvaluationException2 = new org.apache.commons.math.FunctionEvaluationException((double) '4', "org.apache.commons.math.ode.DerivativeException: org.apache.commons.math.FunctionEvaluationException: org.apache.commons.math.ConvergenceException: Evaluation failed for argument = {0}");
    }

    @Test
    public void test16559() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest33.test16559");
        java.lang.String[] strArray15 = new java.lang.String[] { "hi!", "", "hi!", "hi!", "hi!" };
        org.apache.commons.math.ode.DerivativeException derivativeException16 = new org.apache.commons.math.ode.DerivativeException("", strArray15);
        org.apache.commons.math.ode.DerivativeException derivativeException17 = new org.apache.commons.math.ode.DerivativeException("", strArray15);
        java.lang.String[] strArray24 = new java.lang.String[] { "hi!", "", "hi!", "hi!", "hi!" };
        org.apache.commons.math.ode.DerivativeException derivativeException25 = new org.apache.commons.math.ode.DerivativeException("", strArray24);
        org.apache.commons.math.ode.DerivativeException derivativeException26 = new org.apache.commons.math.ode.DerivativeException((java.lang.Throwable) derivativeException25);
        org.apache.commons.math.ConvergenceException convergenceException27 = new org.apache.commons.math.ConvergenceException("hi!", (java.lang.Object[]) strArray15, (java.lang.Throwable) derivativeException25);
        org.apache.commons.math.ode.DerivativeException derivativeException28 = new org.apache.commons.math.ode.DerivativeException("hi!", strArray15);
        org.apache.commons.math.ode.DerivativeException derivativeException29 = new org.apache.commons.math.ode.DerivativeException("hi!", strArray15);
        org.apache.commons.math.ConvergenceException convergenceException30 = new org.apache.commons.math.ConvergenceException("org.apache.commons.math.ConvergenceException: Evaluation failed for argument = {0}", (java.lang.Object[]) strArray15);
        java.lang.String[] strArray39 = new java.lang.String[] { "hi!", "", "hi!", "hi!", "hi!" };
        org.apache.commons.math.ode.DerivativeException derivativeException40 = new org.apache.commons.math.ode.DerivativeException("", strArray39);
        org.apache.commons.math.ode.DerivativeException derivativeException41 = new org.apache.commons.math.ode.DerivativeException("", strArray39);
        java.lang.String[] strArray48 = new java.lang.String[] { "hi!", "", "hi!", "hi!", "hi!" };
        org.apache.commons.math.ode.DerivativeException derivativeException49 = new org.apache.commons.math.ode.DerivativeException("", strArray48);
        org.apache.commons.math.ode.DerivativeException derivativeException50 = new org.apache.commons.math.ode.DerivativeException((java.lang.Throwable) derivativeException49);
        org.apache.commons.math.ConvergenceException convergenceException51 = new org.apache.commons.math.ConvergenceException("hi!", (java.lang.Object[]) strArray39, (java.lang.Throwable) derivativeException49);
        java.lang.String str52 = convergenceException51.getPattern();
        org.apache.commons.math.ConvergenceException convergenceException53 = new org.apache.commons.math.ConvergenceException("Evaluation failed for argument = 100", (java.lang.Object[]) strArray15, (java.lang.Throwable) convergenceException51);
        java.lang.String[] strArray67 = new java.lang.String[] { "hi!", "", "hi!", "hi!", "hi!" };
        org.apache.commons.math.ode.DerivativeException derivativeException68 = new org.apache.commons.math.ode.DerivativeException("", strArray67);
        org.apache.commons.math.ode.DerivativeException derivativeException69 = new org.apache.commons.math.ode.DerivativeException("org.apache.commons.math.FunctionEvaluationException: hi!", strArray67);
        org.apache.commons.math.MaxIterationsExceededException maxIterationsExceededException72 = new org.apache.commons.math.MaxIterationsExceededException(0);
        org.apache.commons.math.ConvergenceException convergenceException73 = new org.apache.commons.math.ConvergenceException("org.apache.commons.math.ConvergenceException: org.apache.commons.math.FunctionEvaluationException: hi!", (java.lang.Throwable) maxIterationsExceededException72);
        org.apache.commons.math.ConvergenceException convergenceException74 = new org.apache.commons.math.ConvergenceException("", (java.lang.Object[]) strArray67, (java.lang.Throwable) maxIterationsExceededException72);
        java.lang.Object[] objArray82 = new java.lang.Object[] { 1L, (byte) 10, (short) 1 };
        org.apache.commons.math.FunctionEvaluationException functionEvaluationException83 = new org.apache.commons.math.FunctionEvaluationException((-1.0d), "hi!", objArray82);
        org.apache.commons.math.FunctionEvaluationException functionEvaluationException84 = new org.apache.commons.math.FunctionEvaluationException((double) 0L, "", objArray82);
        java.lang.String str85 = functionEvaluationException84.getPattern();
        org.apache.commons.math.FunctionEvaluationException functionEvaluationException86 = new org.apache.commons.math.FunctionEvaluationException((double) (-1.0f), "Evaluation failed for argument = {0}", (java.lang.Object[]) strArray67, (java.lang.Throwable) functionEvaluationException84);
        org.apache.commons.math.MaxIterationsExceededException maxIterationsExceededException89 = new org.apache.commons.math.MaxIterationsExceededException((int) (byte) 10);
        int int90 = maxIterationsExceededException89.getMaxIterations();
        org.apache.commons.math.FunctionEvaluationException functionEvaluationException91 = new org.apache.commons.math.FunctionEvaluationException(0.0d, (java.lang.Throwable) maxIterationsExceededException89);
        org.apache.commons.math.FunctionEvaluationException functionEvaluationException92 = new org.apache.commons.math.FunctionEvaluationException((double) 100, "org.apache.commons.math.FunctionEvaluationException: hi!", (java.lang.Object[]) strArray67, (java.lang.Throwable) functionEvaluationException91);
        org.apache.commons.math.ConvergenceException convergenceException93 = new org.apache.commons.math.ConvergenceException("org.apache.commons.math.FunctionEvaluationException: org.apache.commons.math.FunctionEvaluationException: hi!", (java.lang.Throwable) functionEvaluationException91);
        java.lang.String str94 = functionEvaluationException91.getPattern();
        org.apache.commons.math.ConvergenceException convergenceException95 = new org.apache.commons.math.ConvergenceException("org.apache.commons.math.ConvergenceException: org.apache.commons.math.MaxIterationsExceededException: org.apache.commons.math.ConvergenceException: ", (java.lang.Object[]) strArray15, (java.lang.Throwable) functionEvaluationException91);
        org.apache.commons.math.MaxIterationsExceededException maxIterationsExceededException96 = new org.apache.commons.math.MaxIterationsExceededException(10, "org.apache.commons.math.FunctionEvaluationException: org.apache.commons.math.ConvergenceException: Evaluation failed for argument = 10", (java.lang.Object[]) strArray15);
        org.junit.Assert.assertNotNull(strArray15);
        org.junit.Assert.assertNotNull(strArray24);
        org.junit.Assert.assertNotNull(strArray39);
        org.junit.Assert.assertNotNull(strArray48);
        org.junit.Assert.assertEquals("'" + str52 + "' != '" + "hi!" + "'", str52, "hi!");
        org.junit.Assert.assertNotNull(strArray67);
        org.junit.Assert.assertNotNull(objArray82);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray82), "[1, 10, 1]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray82), "[1, 10, 1]");
        org.junit.Assert.assertEquals("'" + str85 + "' != '" + "" + "'", str85, "");
        org.junit.Assert.assertTrue("'" + int90 + "' != '" + 10 + "'", int90 == 10);
        org.junit.Assert.assertEquals("'" + str94 + "' != '" + "Maximal number of iterations (10) exceeded" + "'", str94, "Maximal number of iterations (10) exceeded");
    }

    @Test
    public void test16560() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest33.test16560");
        java.lang.String[] strArray16 = new java.lang.String[] { "hi!", "", "hi!", "hi!", "hi!" };
        org.apache.commons.math.ode.DerivativeException derivativeException17 = new org.apache.commons.math.ode.DerivativeException("", strArray16);
        org.apache.commons.math.ode.DerivativeException derivativeException18 = new org.apache.commons.math.ode.DerivativeException("", strArray16);
        org.apache.commons.math.ConvergenceException convergenceException19 = new org.apache.commons.math.ConvergenceException("org.apache.commons.math.FunctionEvaluationException: hi!", (java.lang.Object[]) strArray16);
        org.apache.commons.math.ConvergenceException convergenceException20 = new org.apache.commons.math.ConvergenceException("", (java.lang.Object[]) strArray16);
        org.apache.commons.math.FunctionEvaluationException functionEvaluationException21 = new org.apache.commons.math.FunctionEvaluationException((double) (-1L), "org.apache.commons.math.ConvergenceException: org.apache.commons.math.FunctionEvaluationException: hi!", (java.lang.Object[]) strArray16);
        java.lang.Throwable[] throwableArray22 = functionEvaluationException21.getSuppressed();
        org.apache.commons.math.MaxIterationsExceededException maxIterationsExceededException23 = new org.apache.commons.math.MaxIterationsExceededException(100, "org.apache.commons.math.FunctionEvaluationException: Evaluation failed for argument = 2", (java.lang.Object[]) throwableArray22);
        org.apache.commons.math.FunctionEvaluationException functionEvaluationException25 = new org.apache.commons.math.FunctionEvaluationException((double) (short) 0);
        double double26 = functionEvaluationException25.getArgument();
        org.apache.commons.math.ode.DerivativeException derivativeException27 = new org.apache.commons.math.ode.DerivativeException((java.lang.Throwable) functionEvaluationException25);
        org.apache.commons.math.ConvergenceException convergenceException28 = new org.apache.commons.math.ConvergenceException("org.apache.commons.math.FunctionEvaluationException: Evaluation failed for argument = 35", (java.lang.Object[]) throwableArray22, (java.lang.Throwable) derivativeException27);
        java.lang.Object[] objArray29 = derivativeException27.getArguments();
        org.apache.commons.math.FunctionEvaluationException functionEvaluationException30 = new org.apache.commons.math.FunctionEvaluationException(3.0d, "org.apache.commons.math.ConvergenceException: Maximal number of iterations (hi!) exceeded", objArray29);
        java.lang.Throwable[] throwableArray31 = functionEvaluationException30.getSuppressed();
        org.junit.Assert.assertNotNull(strArray16);
        org.junit.Assert.assertNotNull(throwableArray22);
        org.junit.Assert.assertTrue("'" + double26 + "' != '" + 0.0d + "'", double26 == 0.0d);
        org.junit.Assert.assertNotNull(objArray29);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray29), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray29), "[]");
        org.junit.Assert.assertNotNull(throwableArray31);
    }

    @Test
    public void test16561() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest33.test16561");
        java.lang.String[] strArray10 = new java.lang.String[] { "org.apache.commons.math.FunctionEvaluationException: hi!" };
        org.apache.commons.math.ode.DerivativeException derivativeException11 = new org.apache.commons.math.ode.DerivativeException("hi!", strArray10);
        org.apache.commons.math.ode.DerivativeException derivativeException12 = new org.apache.commons.math.ode.DerivativeException("", strArray10);
        org.apache.commons.math.ode.DerivativeException derivativeException13 = new org.apache.commons.math.ode.DerivativeException("Evaluation failed for argument = {0}", strArray10);
        org.apache.commons.math.ConvergenceException convergenceException14 = new org.apache.commons.math.ConvergenceException("org.apache.commons.math.ConvergenceException: hi!", (java.lang.Object[]) strArray10);
        org.apache.commons.math.ConvergenceException convergenceException15 = new org.apache.commons.math.ConvergenceException("org.apache.commons.math.ode.DerivativeException: ", (java.lang.Object[]) strArray10);
        org.apache.commons.math.MaxIterationsExceededException maxIterationsExceededException16 = new org.apache.commons.math.MaxIterationsExceededException((int) (short) 1, "org.apache.commons.math.ConvergenceException: org.apache.commons.math.ode.DerivativeException: ", (java.lang.Object[]) strArray10);
        int int17 = maxIterationsExceededException16.getMaxIterations();
        java.lang.Object[] objArray25 = new java.lang.Object[] { 1L, (byte) 10, (short) 1 };
        org.apache.commons.math.FunctionEvaluationException functionEvaluationException26 = new org.apache.commons.math.FunctionEvaluationException((-1.0d), "hi!", objArray25);
        org.apache.commons.math.FunctionEvaluationException functionEvaluationException27 = new org.apache.commons.math.FunctionEvaluationException((double) 0L, "", objArray25);
        java.lang.String str28 = functionEvaluationException27.getPattern();
        org.apache.commons.math.ConvergenceException convergenceException29 = new org.apache.commons.math.ConvergenceException((java.lang.Throwable) functionEvaluationException27);
        maxIterationsExceededException16.addSuppressed((java.lang.Throwable) convergenceException29);
        java.lang.Throwable[] throwableArray31 = convergenceException29.getSuppressed();
        org.apache.commons.math.FunctionEvaluationException functionEvaluationException32 = new org.apache.commons.math.FunctionEvaluationException((double) 100L, "org.apache.commons.math.ode.DerivativeException: Maximal number of iterations ({0}) exceeded", (java.lang.Object[]) throwableArray31);
        org.junit.Assert.assertNotNull(strArray10);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 1 + "'", int17 == 1);
        org.junit.Assert.assertNotNull(objArray25);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray25), "[1, 10, 1]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray25), "[1, 10, 1]");
        org.junit.Assert.assertEquals("'" + str28 + "' != '" + "" + "'", str28, "");
        org.junit.Assert.assertNotNull(throwableArray31);
    }

    @Test
    public void test16562() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest33.test16562");
        java.lang.Throwable throwable10 = null;
        org.apache.commons.math.ConvergenceException convergenceException11 = new org.apache.commons.math.ConvergenceException("hi!", throwable10);
        org.apache.commons.math.ode.DerivativeException derivativeException12 = new org.apache.commons.math.ode.DerivativeException((java.lang.Throwable) convergenceException11);
        java.lang.Throwable[] throwableArray13 = derivativeException12.getSuppressed();
        org.apache.commons.math.MaxIterationsExceededException maxIterationsExceededException14 = new org.apache.commons.math.MaxIterationsExceededException((int) (byte) 1, "org.apache.commons.math.FunctionEvaluationException: Evaluation failed for argument = 0", (java.lang.Object[]) throwableArray13);
        java.lang.String[] strArray23 = new java.lang.String[] { "hi!", "", "hi!", "hi!", "hi!" };
        org.apache.commons.math.ode.DerivativeException derivativeException24 = new org.apache.commons.math.ode.DerivativeException("", strArray23);
        org.apache.commons.math.ode.DerivativeException derivativeException25 = new org.apache.commons.math.ode.DerivativeException("org.apache.commons.math.FunctionEvaluationException: hi!", strArray23);
        org.apache.commons.math.MaxIterationsExceededException maxIterationsExceededException28 = new org.apache.commons.math.MaxIterationsExceededException(0);
        org.apache.commons.math.ConvergenceException convergenceException29 = new org.apache.commons.math.ConvergenceException("org.apache.commons.math.ConvergenceException: org.apache.commons.math.FunctionEvaluationException: hi!", (java.lang.Throwable) maxIterationsExceededException28);
        org.apache.commons.math.ConvergenceException convergenceException30 = new org.apache.commons.math.ConvergenceException("", (java.lang.Object[]) strArray23, (java.lang.Throwable) maxIterationsExceededException28);
        org.apache.commons.math.FunctionEvaluationException functionEvaluationException31 = new org.apache.commons.math.FunctionEvaluationException((double) (-1.0f), "org.apache.commons.math.ConvergenceException: org.apache.commons.math.ConvergenceException: org.apache.commons.math.FunctionEvaluationException: hi!", (java.lang.Object[]) throwableArray13, (java.lang.Throwable) maxIterationsExceededException28);
        org.apache.commons.math.MaxIterationsExceededException maxIterationsExceededException32 = new org.apache.commons.math.MaxIterationsExceededException((int) '#', "org.apache.commons.math.ode.DerivativeException: hi!", (java.lang.Object[]) throwableArray13);
        org.apache.commons.math.ConvergenceException convergenceException34 = new org.apache.commons.math.ConvergenceException("org.apache.commons.math.ode.DerivativeException: org.apache.commons.math.ConvergenceException: hi!");
        java.lang.String str35 = convergenceException34.getPattern();
        org.apache.commons.math.ConvergenceException convergenceException36 = new org.apache.commons.math.ConvergenceException("Evaluation failed for argument = 100", (java.lang.Object[]) throwableArray13, (java.lang.Throwable) convergenceException34);
        org.apache.commons.math.ConvergenceException convergenceException37 = new org.apache.commons.math.ConvergenceException("org.apache.commons.math.ode.DerivativeException: org.apache.commons.math.FunctionEvaluationException: Evaluation failed for argument = 97", (java.lang.Object[]) throwableArray13);
        org.apache.commons.math.ConvergenceException convergenceException38 = new org.apache.commons.math.ConvergenceException("org.apache.commons.math.ConvergenceException: org.apache.commons.math.FunctionEvaluationException: org.apache.commons.math.FunctionEvaluationException: org.apache.commons.math.FunctionEvaluationException: hi!", (java.lang.Object[]) throwableArray13);
        org.junit.Assert.assertNotNull(throwableArray13);
        org.junit.Assert.assertNotNull(strArray23);
        org.junit.Assert.assertEquals("'" + str35 + "' != '" + "org.apache.commons.math.ode.DerivativeException: org.apache.commons.math.ConvergenceException: hi!" + "'", str35, "org.apache.commons.math.ode.DerivativeException: org.apache.commons.math.ConvergenceException: hi!");
    }

    @Test
    public void test16563() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest33.test16563");
        java.lang.String[] strArray7 = new java.lang.String[] { "org.apache.commons.math.FunctionEvaluationException: hi!" };
        org.apache.commons.math.ode.DerivativeException derivativeException8 = new org.apache.commons.math.ode.DerivativeException("hi!", strArray7);
        org.apache.commons.math.ode.DerivativeException derivativeException9 = new org.apache.commons.math.ode.DerivativeException("", strArray7);
        org.apache.commons.math.ode.DerivativeException derivativeException10 = new org.apache.commons.math.ode.DerivativeException("Evaluation failed for argument = {0}", strArray7);
        org.apache.commons.math.ConvergenceException convergenceException11 = new org.apache.commons.math.ConvergenceException("org.apache.commons.math.ConvergenceException: hi!", (java.lang.Object[]) strArray7);
        org.apache.commons.math.ConvergenceException convergenceException12 = new org.apache.commons.math.ConvergenceException("org.apache.commons.math.ode.DerivativeException: ", (java.lang.Object[]) strArray7);
        java.lang.String[] strArray23 = new java.lang.String[] { "hi!", "", "hi!", "hi!", "hi!" };
        org.apache.commons.math.ode.DerivativeException derivativeException24 = new org.apache.commons.math.ode.DerivativeException("", strArray23);
        org.apache.commons.math.ode.DerivativeException derivativeException25 = new org.apache.commons.math.ode.DerivativeException("", strArray23);
        java.lang.String[] strArray32 = new java.lang.String[] { "hi!", "", "hi!", "hi!", "hi!" };
        org.apache.commons.math.ode.DerivativeException derivativeException33 = new org.apache.commons.math.ode.DerivativeException("", strArray32);
        org.apache.commons.math.ode.DerivativeException derivativeException34 = new org.apache.commons.math.ode.DerivativeException((java.lang.Throwable) derivativeException33);
        org.apache.commons.math.ConvergenceException convergenceException35 = new org.apache.commons.math.ConvergenceException("hi!", (java.lang.Object[]) strArray23, (java.lang.Throwable) derivativeException33);
        org.apache.commons.math.ConvergenceException convergenceException36 = new org.apache.commons.math.ConvergenceException("org.apache.commons.math.FunctionEvaluationException: hi!", (java.lang.Object[]) strArray23);
        org.apache.commons.math.ConvergenceException convergenceException37 = new org.apache.commons.math.ConvergenceException("org.apache.commons.math.ode.DerivativeException: org.apache.commons.math.ode.DerivativeException: ", (java.lang.Object[]) strArray23);
        org.apache.commons.math.ConvergenceException convergenceException38 = new org.apache.commons.math.ConvergenceException("", (java.lang.Object[]) strArray7, (java.lang.Throwable) convergenceException37);
        java.lang.Throwable[] throwableArray39 = convergenceException37.getSuppressed();
        org.junit.Assert.assertNotNull(strArray7);
        org.junit.Assert.assertNotNull(strArray23);
        org.junit.Assert.assertNotNull(strArray32);
        org.junit.Assert.assertNotNull(throwableArray39);
    }

    @Test
    public void test16564() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest33.test16564");
        java.lang.String[] strArray21 = new java.lang.String[] { "hi!", "", "hi!", "hi!", "hi!" };
        org.apache.commons.math.ode.DerivativeException derivativeException22 = new org.apache.commons.math.ode.DerivativeException("", strArray21);
        org.apache.commons.math.ode.DerivativeException derivativeException23 = new org.apache.commons.math.ode.DerivativeException("", strArray21);
        java.lang.String[] strArray30 = new java.lang.String[] { "hi!", "", "hi!", "hi!", "hi!" };
        org.apache.commons.math.ode.DerivativeException derivativeException31 = new org.apache.commons.math.ode.DerivativeException("", strArray30);
        org.apache.commons.math.ode.DerivativeException derivativeException32 = new org.apache.commons.math.ode.DerivativeException((java.lang.Throwable) derivativeException31);
        org.apache.commons.math.ConvergenceException convergenceException33 = new org.apache.commons.math.ConvergenceException("hi!", (java.lang.Object[]) strArray21, (java.lang.Throwable) derivativeException31);
        org.apache.commons.math.ode.DerivativeException derivativeException34 = new org.apache.commons.math.ode.DerivativeException("hi!", strArray21);
        java.lang.Object[] objArray42 = new java.lang.Object[] { 1L, (byte) 10, (short) 1 };
        org.apache.commons.math.FunctionEvaluationException functionEvaluationException43 = new org.apache.commons.math.FunctionEvaluationException((-1.0d), "hi!", objArray42);
        java.lang.Throwable throwable44 = null;
        org.apache.commons.math.FunctionEvaluationException functionEvaluationException45 = new org.apache.commons.math.FunctionEvaluationException((double) (short) 1, "hi!", objArray42, throwable44);
        org.apache.commons.math.ConvergenceException convergenceException46 = new org.apache.commons.math.ConvergenceException("org.apache.commons.math.FunctionEvaluationException: hi!", (java.lang.Object[]) strArray21, throwable44);
        org.apache.commons.math.FunctionEvaluationException functionEvaluationException47 = new org.apache.commons.math.FunctionEvaluationException((double) 10L, "org.apache.commons.math.ConvergenceException: org.apache.commons.math.FunctionEvaluationException: hi!", (java.lang.Object[]) strArray21);
        org.apache.commons.math.MaxIterationsExceededException maxIterationsExceededException50 = new org.apache.commons.math.MaxIterationsExceededException(0);
        org.apache.commons.math.ConvergenceException convergenceException51 = new org.apache.commons.math.ConvergenceException("org.apache.commons.math.ConvergenceException: org.apache.commons.math.FunctionEvaluationException: hi!", (java.lang.Throwable) maxIterationsExceededException50);
        org.apache.commons.math.FunctionEvaluationException functionEvaluationException52 = new org.apache.commons.math.FunctionEvaluationException((double) 0.0f, "org.apache.commons.math.ode.DerivativeException: ", (java.lang.Object[]) strArray21, (java.lang.Throwable) maxIterationsExceededException50);
        org.apache.commons.math.FunctionEvaluationException functionEvaluationException53 = new org.apache.commons.math.FunctionEvaluationException((double) '#', "org.apache.commons.math.FunctionEvaluationException: ", (java.lang.Object[]) strArray21);
        org.apache.commons.math.ode.DerivativeException derivativeException54 = new org.apache.commons.math.ode.DerivativeException("org.apache.commons.math.ConvergenceException: org.apache.commons.math.FunctionEvaluationException: hi!", strArray21);
        org.apache.commons.math.MaxIterationsExceededException maxIterationsExceededException55 = new org.apache.commons.math.MaxIterationsExceededException((int) (byte) 0, "org.apache.commons.math.FunctionEvaluationException: org.apache.commons.math.FunctionEvaluationException: Evaluation failed for argument = 2", (java.lang.Object[]) strArray21);
        org.apache.commons.math.MaxIterationsExceededException maxIterationsExceededException56 = new org.apache.commons.math.MaxIterationsExceededException((int) '4', "Maximal number of iterations (-1) exceeded", (java.lang.Object[]) strArray21);
        org.junit.Assert.assertNotNull(strArray21);
        org.junit.Assert.assertNotNull(strArray30);
        org.junit.Assert.assertNotNull(objArray42);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray42), "[1, 10, 1]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray42), "[1, 10, 1]");
    }

    @Test
    public void test16565() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest33.test16565");
        java.lang.Object[] objArray11 = new java.lang.Object[] { 1L, (byte) 10, (short) 1 };
        org.apache.commons.math.FunctionEvaluationException functionEvaluationException12 = new org.apache.commons.math.FunctionEvaluationException((-1.0d), "hi!", objArray11);
        org.apache.commons.math.FunctionEvaluationException functionEvaluationException13 = new org.apache.commons.math.FunctionEvaluationException((double) 0L, "", objArray11);
        java.lang.String str14 = functionEvaluationException13.getPattern();
        org.apache.commons.math.ode.DerivativeException derivativeException15 = new org.apache.commons.math.ode.DerivativeException((java.lang.Throwable) functionEvaluationException13);
        java.lang.Object[] objArray16 = derivativeException15.getArguments();
        java.lang.String[] strArray24 = new java.lang.String[] { "hi!", "", "hi!", "hi!", "hi!" };
        org.apache.commons.math.ode.DerivativeException derivativeException25 = new org.apache.commons.math.ode.DerivativeException("", strArray24);
        org.apache.commons.math.ode.DerivativeException derivativeException26 = new org.apache.commons.math.ode.DerivativeException("org.apache.commons.math.ConvergenceException: org.apache.commons.math.FunctionEvaluationException: hi!", strArray24);
        org.apache.commons.math.FunctionEvaluationException functionEvaluationException27 = new org.apache.commons.math.FunctionEvaluationException((double) (byte) -1, "org.apache.commons.math.FunctionEvaluationException: Evaluation failed for argument = 0", objArray16, (java.lang.Throwable) derivativeException26);
        java.lang.Object[] objArray39 = new java.lang.Object[] { 1L, (byte) 10, (short) 1 };
        org.apache.commons.math.FunctionEvaluationException functionEvaluationException40 = new org.apache.commons.math.FunctionEvaluationException((-1.0d), "hi!", objArray39);
        java.lang.Throwable throwable41 = null;
        org.apache.commons.math.FunctionEvaluationException functionEvaluationException42 = new org.apache.commons.math.FunctionEvaluationException((double) (short) 1, "hi!", objArray39, throwable41);
        java.lang.String str43 = functionEvaluationException42.getPattern();
        java.lang.Throwable[] throwableArray44 = functionEvaluationException42.getSuppressed();
        java.lang.String str45 = functionEvaluationException42.getPattern();
        org.apache.commons.math.FunctionEvaluationException functionEvaluationException46 = new org.apache.commons.math.FunctionEvaluationException((double) 100L, "org.apache.commons.math.ConvergenceException: org.apache.commons.math.FunctionEvaluationException: hi!", (java.lang.Throwable) functionEvaluationException42);
        double double47 = functionEvaluationException46.getArgument();
        org.apache.commons.math.ConvergenceException convergenceException48 = new org.apache.commons.math.ConvergenceException("org.apache.commons.math.MaxIterationsExceededException: org.apache.commons.math.FunctionEvaluationException: hi!", (java.lang.Throwable) functionEvaluationException46);
        org.apache.commons.math.FunctionEvaluationException functionEvaluationException49 = new org.apache.commons.math.FunctionEvaluationException(0.0d, (java.lang.Throwable) convergenceException48);
        org.apache.commons.math.FunctionEvaluationException functionEvaluationException50 = new org.apache.commons.math.FunctionEvaluationException((double) 10L, "org.apache.commons.math.FunctionEvaluationException: org.apache.commons.math.FunctionEvaluationException: hi!", objArray16, (java.lang.Throwable) functionEvaluationException49);
        java.lang.String str51 = functionEvaluationException50.toString();
        org.junit.Assert.assertNotNull(objArray11);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray11), "[1, 10, 1]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray11), "[1, 10, 1]");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
        org.junit.Assert.assertNotNull(objArray16);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray16), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray16), "[]");
        org.junit.Assert.assertNotNull(strArray24);
        org.junit.Assert.assertNotNull(objArray39);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray39), "[1, 10, 1]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray39), "[1, 10, 1]");
        org.junit.Assert.assertEquals("'" + str43 + "' != '" + "hi!" + "'", str43, "hi!");
        org.junit.Assert.assertNotNull(throwableArray44);
        org.junit.Assert.assertEquals("'" + str45 + "' != '" + "hi!" + "'", str45, "hi!");
        org.junit.Assert.assertTrue("'" + double47 + "' != '" + 100.0d + "'", double47 == 100.0d);
        org.junit.Assert.assertEquals("'" + str51 + "' != '" + "org.apache.commons.math.FunctionEvaluationException: org.apache.commons.math.FunctionEvaluationException: org.apache.commons.math.FunctionEvaluationException: hi!" + "'", str51, "org.apache.commons.math.FunctionEvaluationException: org.apache.commons.math.FunctionEvaluationException: org.apache.commons.math.FunctionEvaluationException: hi!");
    }

    @Test
    public void test16566() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest33.test16566");
        java.lang.String[] strArray11 = new java.lang.String[] { "org.apache.commons.math.FunctionEvaluationException: hi!" };
        org.apache.commons.math.ode.DerivativeException derivativeException12 = new org.apache.commons.math.ode.DerivativeException("hi!", strArray11);
        org.apache.commons.math.ode.DerivativeException derivativeException13 = new org.apache.commons.math.ode.DerivativeException("", strArray11);
        java.lang.Object[] objArray23 = new java.lang.Object[] { 1L, (byte) 10, (short) 1 };
        org.apache.commons.math.FunctionEvaluationException functionEvaluationException24 = new org.apache.commons.math.FunctionEvaluationException((-1.0d), "hi!", objArray23);
        java.lang.Throwable throwable25 = null;
        org.apache.commons.math.FunctionEvaluationException functionEvaluationException26 = new org.apache.commons.math.FunctionEvaluationException((double) (short) 1, "hi!", objArray23, throwable25);
        java.lang.String str27 = functionEvaluationException26.getPattern();
        double double28 = functionEvaluationException26.getArgument();
        org.apache.commons.math.FunctionEvaluationException functionEvaluationException29 = new org.apache.commons.math.FunctionEvaluationException((double) 0.0f, (java.lang.Throwable) functionEvaluationException26);
        org.apache.commons.math.FunctionEvaluationException functionEvaluationException30 = new org.apache.commons.math.FunctionEvaluationException((double) '#', (java.lang.Throwable) functionEvaluationException29);
        java.lang.Throwable throwable33 = null;
        org.apache.commons.math.ConvergenceException convergenceException34 = new org.apache.commons.math.ConvergenceException("hi!", throwable33);
        org.apache.commons.math.ode.DerivativeException derivativeException35 = new org.apache.commons.math.ode.DerivativeException((java.lang.Throwable) convergenceException34);
        java.lang.Throwable[] throwableArray36 = derivativeException35.getSuppressed();
        org.apache.commons.math.ConvergenceException convergenceException37 = new org.apache.commons.math.ConvergenceException("org.apache.commons.math.ConvergenceException: org.apache.commons.math.FunctionEvaluationException: hi!", (java.lang.Throwable) derivativeException35);
        java.lang.String[] strArray41 = new java.lang.String[] { "org.apache.commons.math.FunctionEvaluationException: hi!" };
        org.apache.commons.math.ode.DerivativeException derivativeException42 = new org.apache.commons.math.ode.DerivativeException("hi!", strArray41);
        org.apache.commons.math.FunctionEvaluationException functionEvaluationException45 = new org.apache.commons.math.FunctionEvaluationException((double) (-1.0f), "");
        org.apache.commons.math.ConvergenceException convergenceException46 = new org.apache.commons.math.ConvergenceException("org.apache.commons.math.FunctionEvaluationException: hi!", (java.lang.Object[]) strArray41, (java.lang.Throwable) functionEvaluationException45);
        derivativeException35.addSuppressed((java.lang.Throwable) functionEvaluationException45);
        functionEvaluationException30.addSuppressed((java.lang.Throwable) functionEvaluationException45);
        org.apache.commons.math.ConvergenceException convergenceException49 = new org.apache.commons.math.ConvergenceException("org.apache.commons.math.FunctionEvaluationException: org.apache.commons.math.ode.DerivativeException: ", (java.lang.Object[]) strArray11, (java.lang.Throwable) functionEvaluationException45);
        java.lang.String[] strArray57 = new java.lang.String[] { "hi!", "", "hi!", "hi!", "hi!" };
        org.apache.commons.math.ode.DerivativeException derivativeException58 = new org.apache.commons.math.ode.DerivativeException("", strArray57);
        org.apache.commons.math.ConvergenceException convergenceException59 = new org.apache.commons.math.ConvergenceException("org.apache.commons.math.FunctionEvaluationException: hi!", (java.lang.Throwable) derivativeException58);
        java.lang.Object[] objArray60 = derivativeException58.getArguments();
        org.apache.commons.math.ode.DerivativeException derivativeException61 = new org.apache.commons.math.ode.DerivativeException((java.lang.Throwable) derivativeException58);
        org.apache.commons.math.ConvergenceException convergenceException62 = new org.apache.commons.math.ConvergenceException("org.apache.commons.math.FunctionEvaluationException: Evaluation failed for argument = 0", (java.lang.Object[]) strArray11, (java.lang.Throwable) derivativeException61);
        org.apache.commons.math.MaxIterationsExceededException maxIterationsExceededException63 = new org.apache.commons.math.MaxIterationsExceededException(0, "org.apache.commons.math.FunctionEvaluationException: Evaluation failed for argument = 2", (java.lang.Object[]) strArray11);
        java.lang.String[] strArray70 = new java.lang.String[] { "org.apache.commons.math.FunctionEvaluationException: hi!" };
        org.apache.commons.math.ode.DerivativeException derivativeException71 = new org.apache.commons.math.ode.DerivativeException("hi!", strArray70);
        org.apache.commons.math.ode.DerivativeException derivativeException72 = new org.apache.commons.math.ode.DerivativeException("", strArray70);
        org.apache.commons.math.ode.DerivativeException derivativeException73 = new org.apache.commons.math.ode.DerivativeException("org.apache.commons.math.FunctionEvaluationException: Evaluation failed for argument = 0", strArray70);
        org.apache.commons.math.FunctionEvaluationException functionEvaluationException74 = new org.apache.commons.math.FunctionEvaluationException(0.0d, "org.apache.commons.math.FunctionEvaluationException: Evaluation failed for argument = {0}", (java.lang.Object[]) strArray70);
        org.apache.commons.math.ode.DerivativeException derivativeException75 = new org.apache.commons.math.ode.DerivativeException((java.lang.Throwable) functionEvaluationException74);
        java.lang.Throwable[] throwableArray76 = functionEvaluationException74.getSuppressed();
        org.apache.commons.math.FunctionEvaluationException functionEvaluationException77 = new org.apache.commons.math.FunctionEvaluationException((double) 100.0f, "org.apache.commons.math.FunctionEvaluationException: Evaluation failed for argument = hi!", (java.lang.Object[]) strArray11, (java.lang.Throwable) functionEvaluationException74);
        org.apache.commons.math.ode.DerivativeException derivativeException78 = new org.apache.commons.math.ode.DerivativeException("org.apache.commons.math.ConvergenceException: org.apache.commons.math.FunctionEvaluationException: org.apache.commons.math.ode.DerivativeException: org.apache.commons.math.ConvergenceException: org.apache.commons.math.ConvergenceException: org.apache.commons.math.FunctionEvaluationException: hi!", strArray11);
        org.apache.commons.math.ode.DerivativeException derivativeException79 = new org.apache.commons.math.ode.DerivativeException("org.apache.commons.math.MaxIterationsExceededException: ", strArray11);
        java.lang.Object[] objArray80 = derivativeException79.getArguments();
        org.junit.Assert.assertNotNull(strArray11);
        org.junit.Assert.assertNotNull(objArray23);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray23), "[1, 10, 1]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray23), "[1, 10, 1]");
        org.junit.Assert.assertEquals("'" + str27 + "' != '" + "hi!" + "'", str27, "hi!");
        org.junit.Assert.assertTrue("'" + double28 + "' != '" + 1.0d + "'", double28 == 1.0d);
        org.junit.Assert.assertNotNull(throwableArray36);
        org.junit.Assert.assertNotNull(strArray41);
        org.junit.Assert.assertNotNull(strArray57);
        org.junit.Assert.assertNotNull(objArray60);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray60), "[hi!, , hi!, hi!, hi!]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray60), "[hi!, , hi!, hi!, hi!]");
        org.junit.Assert.assertNotNull(strArray70);
        org.junit.Assert.assertNotNull(throwableArray76);
        org.junit.Assert.assertNotNull(objArray80);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray80), "[org.apache.commons.math.FunctionEvaluationException: hi!]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray80), "[org.apache.commons.math.FunctionEvaluationException: hi!]");
    }

    @Test
    public void test16567() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest33.test16567");
        java.lang.String[] strArray23 = new java.lang.String[] { "hi!", "", "hi!", "hi!", "hi!" };
        org.apache.commons.math.ode.DerivativeException derivativeException24 = new org.apache.commons.math.ode.DerivativeException("", strArray23);
        org.apache.commons.math.MaxIterationsExceededException maxIterationsExceededException25 = new org.apache.commons.math.MaxIterationsExceededException(10, "org.apache.commons.math.FunctionEvaluationException: Evaluation failed for argument = 0", (java.lang.Object[]) strArray23);
        org.apache.commons.math.MaxIterationsExceededException maxIterationsExceededException27 = new org.apache.commons.math.MaxIterationsExceededException(3);
        org.apache.commons.math.FunctionEvaluationException functionEvaluationException28 = new org.apache.commons.math.FunctionEvaluationException((double) 0, "hi!", (java.lang.Object[]) strArray23, (java.lang.Throwable) maxIterationsExceededException27);
        org.apache.commons.math.ConvergenceException convergenceException29 = new org.apache.commons.math.ConvergenceException("hi!", (java.lang.Object[]) strArray23);
        org.apache.commons.math.MaxIterationsExceededException maxIterationsExceededException30 = new org.apache.commons.math.MaxIterationsExceededException((int) (byte) 1, "org.apache.commons.math.MaxIterationsExceededException: org.apache.commons.math.ode.DerivativeException: ", (java.lang.Object[]) strArray23);
        org.apache.commons.math.MaxIterationsExceededException maxIterationsExceededException31 = new org.apache.commons.math.MaxIterationsExceededException((int) '4', "Evaluation failed for argument = {0}", (java.lang.Object[]) strArray23);
        org.apache.commons.math.FunctionEvaluationException functionEvaluationException32 = new org.apache.commons.math.FunctionEvaluationException((double) 100.0f, "org.apache.commons.math.ode.DerivativeException: ", (java.lang.Object[]) strArray23);
        org.apache.commons.math.FunctionEvaluationException functionEvaluationException33 = new org.apache.commons.math.FunctionEvaluationException((double) (short) -1, "Maximal number of iterations ({0}) exceeded", (java.lang.Object[]) strArray23);
        java.lang.String[] strArray42 = new java.lang.String[] { "hi!", "", "hi!", "hi!", "hi!" };
        org.apache.commons.math.ode.DerivativeException derivativeException43 = new org.apache.commons.math.ode.DerivativeException("", strArray42);
        org.apache.commons.math.ConvergenceException convergenceException44 = new org.apache.commons.math.ConvergenceException("org.apache.commons.math.FunctionEvaluationException: hi!", (java.lang.Throwable) derivativeException43);
        org.apache.commons.math.FunctionEvaluationException functionEvaluationException45 = new org.apache.commons.math.FunctionEvaluationException(0.0d, (java.lang.Throwable) convergenceException44);
        java.lang.Object[] objArray46 = functionEvaluationException45.getArguments();
        org.apache.commons.math.FunctionEvaluationException functionEvaluationException47 = new org.apache.commons.math.FunctionEvaluationException(0.0d, "org.apache.commons.math.FunctionEvaluationException: org.apache.commons.math.ConvergenceException: org.apache.commons.math.FunctionEvaluationException: hi!", (java.lang.Object[]) strArray23, (java.lang.Throwable) functionEvaluationException45);
        org.apache.commons.math.ode.DerivativeException derivativeException48 = new org.apache.commons.math.ode.DerivativeException("org.apache.commons.math.FunctionEvaluationException: org.apache.commons.math.ode.DerivativeException: org.apache.commons.math.ode.DerivativeException: ", strArray23);
        org.apache.commons.math.ode.DerivativeException derivativeException49 = new org.apache.commons.math.ode.DerivativeException("org.apache.commons.math.ConvergenceException: org.apache.commons.math.FunctionEvaluationException: org.apache.commons.math.MaxIterationsExceededException: org.apache.commons.math.ConvergenceException: org.apache.commons.math.ConvergenceException: org.apache.commons.math.FunctionEvaluationException: hi!", strArray23);
        org.junit.Assert.assertNotNull(strArray23);
        org.junit.Assert.assertNotNull(strArray42);
        org.junit.Assert.assertNotNull(objArray46);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray46), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray46), "[]");
    }

    @Test
    public void test16568() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest33.test16568");
        java.lang.String[] strArray12 = new java.lang.String[] { "org.apache.commons.math.FunctionEvaluationException: hi!" };
        org.apache.commons.math.ode.DerivativeException derivativeException13 = new org.apache.commons.math.ode.DerivativeException("hi!", strArray12);
        java.lang.Object[] objArray23 = new java.lang.Object[] { 1L, (byte) 10, (short) 1 };
        org.apache.commons.math.FunctionEvaluationException functionEvaluationException24 = new org.apache.commons.math.FunctionEvaluationException((-1.0d), "hi!", objArray23);
        java.lang.Throwable throwable25 = null;
        org.apache.commons.math.FunctionEvaluationException functionEvaluationException26 = new org.apache.commons.math.FunctionEvaluationException((double) (short) 1, "hi!", objArray23, throwable25);
        org.apache.commons.math.FunctionEvaluationException functionEvaluationException27 = new org.apache.commons.math.FunctionEvaluationException((-1.0d), "Evaluation failed for argument = {0}", throwable25);
        org.apache.commons.math.ConvergenceException convergenceException28 = new org.apache.commons.math.ConvergenceException("org.apache.commons.math.ConvergenceException: hi!", (java.lang.Object[]) strArray12, (java.lang.Throwable) functionEvaluationException27);
        org.apache.commons.math.FunctionEvaluationException functionEvaluationException29 = new org.apache.commons.math.FunctionEvaluationException((-1.0d), "org.apache.commons.math.MaxIterationsExceededException: org.apache.commons.math.FunctionEvaluationException: Evaluation failed for argument = 0", (java.lang.Object[]) strArray12);
        org.apache.commons.math.MaxIterationsExceededException maxIterationsExceededException30 = new org.apache.commons.math.MaxIterationsExceededException(2, "org.apache.commons.math.ConvergenceException: org.apache.commons.math.ConvergenceException: org.apache.commons.math.FunctionEvaluationException: org.apache.commons.math.ConvergenceException: hi!", (java.lang.Object[]) strArray12);
        org.apache.commons.math.MaxIterationsExceededException maxIterationsExceededException31 = new org.apache.commons.math.MaxIterationsExceededException((int) 'a', "org.apache.commons.math.ConvergenceException: org.apache.commons.math.ode.DerivativeException: org.apache.commons.math.ode.DerivativeException: ", (java.lang.Object[]) strArray12);
        org.apache.commons.math.FunctionEvaluationException functionEvaluationException32 = new org.apache.commons.math.FunctionEvaluationException(2.0d, "org.apache.commons.math.ode.DerivativeException: org.apache.commons.math.MaxIterationsExceededException: org.apache.commons.math.ConvergenceException: org.apache.commons.math.ConvergenceException: org.apache.commons.math.FunctionEvaluationException: hi!", (java.lang.Object[]) strArray12);
        double double33 = functionEvaluationException32.getArgument();
        org.apache.commons.math.ConvergenceException convergenceException34 = new org.apache.commons.math.ConvergenceException((java.lang.Throwable) functionEvaluationException32);
        org.apache.commons.math.ConvergenceException convergenceException35 = new org.apache.commons.math.ConvergenceException("org.apache.commons.math.FunctionEvaluationException: org.apache.commons.math.FunctionEvaluationException: Maximal number of iterations (org.apache.commons.math.ConvergenceException: hi!) exceeded", (java.lang.Throwable) functionEvaluationException32);
        org.junit.Assert.assertNotNull(strArray12);
        org.junit.Assert.assertNotNull(objArray23);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray23), "[1, 10, 1]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray23), "[1, 10, 1]");
        org.junit.Assert.assertTrue("'" + double33 + "' != '" + 2.0d + "'", double33 == 2.0d);
    }

    @Test
    public void test16569() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest33.test16569");
        java.lang.String[] strArray20 = new java.lang.String[] { "hi!", "", "hi!", "hi!", "hi!" };
        org.apache.commons.math.ode.DerivativeException derivativeException21 = new org.apache.commons.math.ode.DerivativeException("", strArray20);
        org.apache.commons.math.ode.DerivativeException derivativeException22 = new org.apache.commons.math.ode.DerivativeException("", strArray20);
        org.apache.commons.math.ConvergenceException convergenceException23 = new org.apache.commons.math.ConvergenceException("org.apache.commons.math.FunctionEvaluationException: hi!", (java.lang.Object[]) strArray20);
        org.apache.commons.math.ConvergenceException convergenceException24 = new org.apache.commons.math.ConvergenceException("", (java.lang.Object[]) strArray20);
        org.apache.commons.math.FunctionEvaluationException functionEvaluationException25 = new org.apache.commons.math.FunctionEvaluationException((double) (-1L), "org.apache.commons.math.ConvergenceException: org.apache.commons.math.FunctionEvaluationException: hi!", (java.lang.Object[]) strArray20);
        org.apache.commons.math.MaxIterationsExceededException maxIterationsExceededException26 = new org.apache.commons.math.MaxIterationsExceededException((int) (byte) 1, "org.apache.commons.math.FunctionEvaluationException: ", (java.lang.Object[]) strArray20);
        java.lang.String[] strArray37 = new java.lang.String[] { "hi!", "", "hi!", "hi!", "hi!" };
        org.apache.commons.math.ode.DerivativeException derivativeException38 = new org.apache.commons.math.ode.DerivativeException("", strArray37);
        org.apache.commons.math.ode.DerivativeException derivativeException39 = new org.apache.commons.math.ode.DerivativeException("", strArray37);
        java.lang.Throwable throwable42 = null;
        org.apache.commons.math.ConvergenceException convergenceException43 = new org.apache.commons.math.ConvergenceException("hi!", throwable42);
        org.apache.commons.math.ode.DerivativeException derivativeException44 = new org.apache.commons.math.ode.DerivativeException((java.lang.Throwable) convergenceException43);
        java.lang.Throwable[] throwableArray45 = derivativeException44.getSuppressed();
        org.apache.commons.math.ConvergenceException convergenceException46 = new org.apache.commons.math.ConvergenceException("hi!", (java.lang.Throwable) derivativeException44);
        derivativeException39.addSuppressed((java.lang.Throwable) convergenceException46);
        org.apache.commons.math.FunctionEvaluationException functionEvaluationException48 = new org.apache.commons.math.FunctionEvaluationException((double) (short) 100, "org.apache.commons.math.ConvergenceException: hi!", (java.lang.Throwable) convergenceException46);
        org.apache.commons.math.FunctionEvaluationException functionEvaluationException49 = new org.apache.commons.math.FunctionEvaluationException((double) 1, (java.lang.Throwable) convergenceException46);
        org.apache.commons.math.FunctionEvaluationException functionEvaluationException50 = new org.apache.commons.math.FunctionEvaluationException(1.0d, "", (java.lang.Object[]) strArray20, (java.lang.Throwable) convergenceException46);
        org.apache.commons.math.MaxIterationsExceededException maxIterationsExceededException51 = new org.apache.commons.math.MaxIterationsExceededException((int) (short) -1, "org.apache.commons.math.MaxIterationsExceededException: Evaluation failed for argument = {0}", (java.lang.Object[]) strArray20);
        org.apache.commons.math.MaxIterationsExceededException maxIterationsExceededException52 = new org.apache.commons.math.MaxIterationsExceededException((int) (byte) 1, "org.apache.commons.math.ConvergenceException: ", (java.lang.Object[]) strArray20);
        int int53 = maxIterationsExceededException52.getMaxIterations();
        java.lang.Object[] objArray54 = maxIterationsExceededException52.getArguments();
        int int55 = maxIterationsExceededException52.getMaxIterations();
        org.apache.commons.math.FunctionEvaluationException functionEvaluationException56 = new org.apache.commons.math.FunctionEvaluationException((double) 3, (java.lang.Throwable) maxIterationsExceededException52);
        org.junit.Assert.assertNotNull(strArray20);
        org.junit.Assert.assertNotNull(strArray37);
        org.junit.Assert.assertNotNull(throwableArray45);
        org.junit.Assert.assertTrue("'" + int53 + "' != '" + 1 + "'", int53 == 1);
        org.junit.Assert.assertNotNull(objArray54);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray54), "[hi!, , hi!, hi!, hi!]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray54), "[hi!, , hi!, hi!, hi!]");
        org.junit.Assert.assertTrue("'" + int55 + "' != '" + 1 + "'", int55 == 1);
    }

    @Test
    public void test16570() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest33.test16570");
        org.apache.commons.math.FunctionEvaluationException functionEvaluationException5 = new org.apache.commons.math.FunctionEvaluationException((double) 0L, "org.apache.commons.math.FunctionEvaluationException: hi!");
        java.lang.Throwable[] throwableArray6 = functionEvaluationException5.getSuppressed();
        org.apache.commons.math.FunctionEvaluationException functionEvaluationException7 = new org.apache.commons.math.FunctionEvaluationException((double) (short) 0, "org.apache.commons.math.FunctionEvaluationException: org.apache.commons.math.ConvergenceException: org.apache.commons.math.FunctionEvaluationException: hi!", (java.lang.Object[]) throwableArray6);
        java.lang.Object[] objArray16 = new java.lang.Object[] { 10L, (-1L), 10, 0.0d };
        java.lang.Throwable throwable17 = null;
        org.apache.commons.math.ConvergenceException convergenceException18 = new org.apache.commons.math.ConvergenceException("hi!", objArray16, throwable17);
        java.lang.Throwable[] throwableArray19 = convergenceException18.getSuppressed();
        org.apache.commons.math.ConvergenceException convergenceException20 = new org.apache.commons.math.ConvergenceException((java.lang.Throwable) convergenceException18);
        java.lang.Throwable[] throwableArray21 = convergenceException20.getSuppressed();
        org.apache.commons.math.MaxIterationsExceededException maxIterationsExceededException22 = new org.apache.commons.math.MaxIterationsExceededException(1, "org.apache.commons.math.ConvergenceException: org.apache.commons.math.FunctionEvaluationException: org.apache.commons.math.ode.DerivativeException: ", (java.lang.Object[]) throwableArray21);
        int int23 = maxIterationsExceededException22.getMaxIterations();
        int int24 = maxIterationsExceededException22.getMaxIterations();
        org.apache.commons.math.ConvergenceException convergenceException25 = new org.apache.commons.math.ConvergenceException((java.lang.Throwable) maxIterationsExceededException22);
        int int26 = maxIterationsExceededException22.getMaxIterations();
        org.apache.commons.math.FunctionEvaluationException functionEvaluationException27 = new org.apache.commons.math.FunctionEvaluationException(52.0d, (java.lang.Throwable) maxIterationsExceededException22);
        org.apache.commons.math.ConvergenceException convergenceException28 = new org.apache.commons.math.ConvergenceException("org.apache.commons.math.ConvergenceException: Maximal number of iterations (32) exceeded", (java.lang.Object[]) throwableArray6, (java.lang.Throwable) functionEvaluationException27);
        org.junit.Assert.assertNotNull(throwableArray6);
        org.junit.Assert.assertNotNull(objArray16);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray16), "[10, -1, 10, 0.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray16), "[10, -1, 10, 0.0]");
        org.junit.Assert.assertNotNull(throwableArray19);
        org.junit.Assert.assertNotNull(throwableArray21);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 1 + "'", int23 == 1);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 1 + "'", int24 == 1);
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + 1 + "'", int26 == 1);
    }

    @Test
    public void test16571() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest33.test16571");
        java.lang.String[] strArray22 = new java.lang.String[] { "hi!", "", "hi!", "hi!", "hi!" };
        org.apache.commons.math.ode.DerivativeException derivativeException23 = new org.apache.commons.math.ode.DerivativeException("", strArray22);
        org.apache.commons.math.ode.DerivativeException derivativeException24 = new org.apache.commons.math.ode.DerivativeException("", strArray22);
        java.lang.String[] strArray31 = new java.lang.String[] { "hi!", "", "hi!", "hi!", "hi!" };
        org.apache.commons.math.ode.DerivativeException derivativeException32 = new org.apache.commons.math.ode.DerivativeException("", strArray31);
        org.apache.commons.math.ode.DerivativeException derivativeException33 = new org.apache.commons.math.ode.DerivativeException((java.lang.Throwable) derivativeException32);
        org.apache.commons.math.ConvergenceException convergenceException34 = new org.apache.commons.math.ConvergenceException("hi!", (java.lang.Object[]) strArray22, (java.lang.Throwable) derivativeException32);
        org.apache.commons.math.ode.DerivativeException derivativeException35 = new org.apache.commons.math.ode.DerivativeException("hi!", strArray22);
        java.lang.Object[] objArray43 = new java.lang.Object[] { 1L, (byte) 10, (short) 1 };
        org.apache.commons.math.FunctionEvaluationException functionEvaluationException44 = new org.apache.commons.math.FunctionEvaluationException((-1.0d), "hi!", objArray43);
        java.lang.Throwable throwable45 = null;
        org.apache.commons.math.FunctionEvaluationException functionEvaluationException46 = new org.apache.commons.math.FunctionEvaluationException((double) (short) 1, "hi!", objArray43, throwable45);
        org.apache.commons.math.ConvergenceException convergenceException47 = new org.apache.commons.math.ConvergenceException("org.apache.commons.math.FunctionEvaluationException: hi!", (java.lang.Object[]) strArray22, throwable45);
        org.apache.commons.math.FunctionEvaluationException functionEvaluationException48 = new org.apache.commons.math.FunctionEvaluationException((double) 10L, "org.apache.commons.math.ConvergenceException: org.apache.commons.math.FunctionEvaluationException: hi!", (java.lang.Object[]) strArray22);
        org.apache.commons.math.ode.DerivativeException derivativeException49 = new org.apache.commons.math.ode.DerivativeException("org.apache.commons.math.ConvergenceException: org.apache.commons.math.FunctionEvaluationException: hi!", strArray22);
        org.apache.commons.math.MaxIterationsExceededException maxIterationsExceededException50 = new org.apache.commons.math.MaxIterationsExceededException((int) (byte) 1, "org.apache.commons.math.ConvergenceException: org.apache.commons.math.ConvergenceException: org.apache.commons.math.FunctionEvaluationException: hi!", (java.lang.Object[]) strArray22);
        org.apache.commons.math.MaxIterationsExceededException maxIterationsExceededException52 = new org.apache.commons.math.MaxIterationsExceededException((int) (short) 10);
        int int53 = maxIterationsExceededException52.getMaxIterations();
        java.lang.String str54 = maxIterationsExceededException52.getPattern();
        org.apache.commons.math.ConvergenceException convergenceException55 = new org.apache.commons.math.ConvergenceException("org.apache.commons.math.ConvergenceException: hi!", (java.lang.Object[]) strArray22, (java.lang.Throwable) maxIterationsExceededException52);
        java.lang.Object[] objArray63 = new java.lang.Object[] { 10L, (-1L), 10, 0.0d };
        java.lang.Throwable throwable64 = null;
        org.apache.commons.math.ConvergenceException convergenceException65 = new org.apache.commons.math.ConvergenceException("hi!", objArray63, throwable64);
        org.apache.commons.math.FunctionEvaluationException functionEvaluationException66 = new org.apache.commons.math.FunctionEvaluationException((double) 1L, throwable64);
        org.apache.commons.math.FunctionEvaluationException functionEvaluationException70 = new org.apache.commons.math.FunctionEvaluationException((double) '4');
        org.apache.commons.math.FunctionEvaluationException functionEvaluationException71 = new org.apache.commons.math.FunctionEvaluationException((double) (short) 100, "", (java.lang.Throwable) functionEvaluationException70);
        functionEvaluationException66.addSuppressed((java.lang.Throwable) functionEvaluationException70);
        org.apache.commons.math.FunctionEvaluationException functionEvaluationException73 = new org.apache.commons.math.FunctionEvaluationException((double) '#', (java.lang.Throwable) functionEvaluationException70);
        org.apache.commons.math.FunctionEvaluationException functionEvaluationException74 = new org.apache.commons.math.FunctionEvaluationException(52.0d, "org.apache.commons.math.FunctionEvaluationException: Evaluation failed for argument = {0}", (java.lang.Object[]) strArray22, (java.lang.Throwable) functionEvaluationException73);
        org.apache.commons.math.FunctionEvaluationException functionEvaluationException77 = new org.apache.commons.math.FunctionEvaluationException((double) (byte) 10, "org.apache.commons.math.FunctionEvaluationException: Evaluation failed for argument = 97");
        org.apache.commons.math.FunctionEvaluationException functionEvaluationException78 = new org.apache.commons.math.FunctionEvaluationException((double) 0L, "org.apache.commons.math.ConvergenceException: org.apache.commons.math.ode.DerivativeException: org.apache.commons.math.ConvergenceException: org.apache.commons.math.FunctionEvaluationException: hi!", (java.lang.Object[]) strArray22, (java.lang.Throwable) functionEvaluationException77);
        org.apache.commons.math.ode.DerivativeException derivativeException79 = new org.apache.commons.math.ode.DerivativeException("org.apache.commons.math.MaxIterationsExceededException: org.apache.commons.math.ode.DerivativeException: org.apache.commons.math.ode.DerivativeException: org.apache.commons.math.ode.DerivativeException: ", strArray22);
        org.apache.commons.math.ode.DerivativeException derivativeException80 = new org.apache.commons.math.ode.DerivativeException("org.apache.commons.math.ode.DerivativeException: org.apache.commons.math.FunctionEvaluationException: org.apache.commons.math.MaxIterationsExceededException: org.apache.commons.math.ConvergenceException: org.apache.commons.math.ConvergenceException: org.apache.commons.math.FunctionEvaluationException: hi!", strArray22);
        org.junit.Assert.assertNotNull(strArray22);
        org.junit.Assert.assertNotNull(strArray31);
        org.junit.Assert.assertNotNull(objArray43);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray43), "[1, 10, 1]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray43), "[1, 10, 1]");
        org.junit.Assert.assertTrue("'" + int53 + "' != '" + 10 + "'", int53 == 10);
        org.junit.Assert.assertEquals("'" + str54 + "' != '" + "Maximal number of iterations ({0}) exceeded" + "'", str54, "Maximal number of iterations ({0}) exceeded");
        org.junit.Assert.assertNotNull(objArray63);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray63), "[10, -1, 10, 0.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray63), "[10, -1, 10, 0.0]");
    }

    @Test
    public void test16572() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest33.test16572");
        java.lang.String[] strArray25 = new java.lang.String[] { "hi!", "", "hi!", "hi!", "hi!" };
        org.apache.commons.math.ode.DerivativeException derivativeException26 = new org.apache.commons.math.ode.DerivativeException("", strArray25);
        org.apache.commons.math.ode.DerivativeException derivativeException27 = new org.apache.commons.math.ode.DerivativeException("", strArray25);
        org.apache.commons.math.ConvergenceException convergenceException28 = new org.apache.commons.math.ConvergenceException("org.apache.commons.math.FunctionEvaluationException: hi!", (java.lang.Object[]) strArray25);
        org.apache.commons.math.ConvergenceException convergenceException29 = new org.apache.commons.math.ConvergenceException("", (java.lang.Object[]) strArray25);
        org.apache.commons.math.FunctionEvaluationException functionEvaluationException30 = new org.apache.commons.math.FunctionEvaluationException((double) (-1L), "org.apache.commons.math.ConvergenceException: org.apache.commons.math.FunctionEvaluationException: hi!", (java.lang.Object[]) strArray25);
        org.apache.commons.math.MaxIterationsExceededException maxIterationsExceededException31 = new org.apache.commons.math.MaxIterationsExceededException((int) (byte) 1, "org.apache.commons.math.FunctionEvaluationException: ", (java.lang.Object[]) strArray25);
        java.lang.Object[] objArray37 = new java.lang.Object[] { 10L, (-1L), 10, 0.0d };
        java.lang.Throwable throwable38 = null;
        org.apache.commons.math.ConvergenceException convergenceException39 = new org.apache.commons.math.ConvergenceException("hi!", objArray37, throwable38);
        java.lang.Throwable[] throwableArray40 = convergenceException39.getSuppressed();
        org.apache.commons.math.FunctionEvaluationException functionEvaluationException41 = new org.apache.commons.math.FunctionEvaluationException((double) '4', "org.apache.commons.math.ode.DerivativeException: org.apache.commons.math.ConvergenceException: org.apache.commons.math.ConvergenceException: org.apache.commons.math.FunctionEvaluationException: hi!", (java.lang.Object[]) strArray25, (java.lang.Throwable) convergenceException39);
        org.apache.commons.math.FunctionEvaluationException functionEvaluationException42 = new org.apache.commons.math.FunctionEvaluationException((double) ' ', "org.apache.commons.math.FunctionEvaluationException: Evaluation failed for argument = 2", (java.lang.Object[]) strArray25);
        org.apache.commons.math.MaxIterationsExceededException maxIterationsExceededException43 = new org.apache.commons.math.MaxIterationsExceededException((int) (byte) 10, "org.apache.commons.math.FunctionEvaluationException: org.apache.commons.math.FunctionEvaluationException: org.apache.commons.math.ode.DerivativeException: ", (java.lang.Object[]) strArray25);
        org.apache.commons.math.MaxIterationsExceededException maxIterationsExceededException44 = new org.apache.commons.math.MaxIterationsExceededException((int) '#', "org.apache.commons.math.MaxIterationsExceededException: org.apache.commons.math.FunctionEvaluationException: Evaluation failed for argument = 0", (java.lang.Object[]) strArray25);
        org.apache.commons.math.MaxIterationsExceededException maxIterationsExceededException45 = new org.apache.commons.math.MaxIterationsExceededException(2, "", (java.lang.Object[]) strArray25);
        org.apache.commons.math.ode.DerivativeException derivativeException46 = new org.apache.commons.math.ode.DerivativeException("org.apache.commons.math.ConvergenceException: org.apache.commons.math.ode.DerivativeException: org.apache.commons.math.ode.DerivativeException: org.apache.commons.math.ode.DerivativeException: ", strArray25);
        java.lang.String[] strArray61 = new java.lang.String[] { "hi!", "", "hi!", "hi!", "hi!" };
        org.apache.commons.math.ode.DerivativeException derivativeException62 = new org.apache.commons.math.ode.DerivativeException("", strArray61);
        org.apache.commons.math.ode.DerivativeException derivativeException63 = new org.apache.commons.math.ode.DerivativeException("org.apache.commons.math.FunctionEvaluationException: hi!", strArray61);
        org.apache.commons.math.MaxIterationsExceededException maxIterationsExceededException66 = new org.apache.commons.math.MaxIterationsExceededException(0);
        org.apache.commons.math.ConvergenceException convergenceException67 = new org.apache.commons.math.ConvergenceException("org.apache.commons.math.ConvergenceException: org.apache.commons.math.FunctionEvaluationException: hi!", (java.lang.Throwable) maxIterationsExceededException66);
        org.apache.commons.math.ConvergenceException convergenceException68 = new org.apache.commons.math.ConvergenceException("", (java.lang.Object[]) strArray61, (java.lang.Throwable) maxIterationsExceededException66);
        java.lang.Object[] objArray76 = new java.lang.Object[] { 1L, (byte) 10, (short) 1 };
        org.apache.commons.math.FunctionEvaluationException functionEvaluationException77 = new org.apache.commons.math.FunctionEvaluationException((-1.0d), "hi!", objArray76);
        org.apache.commons.math.FunctionEvaluationException functionEvaluationException78 = new org.apache.commons.math.FunctionEvaluationException((double) 0L, "", objArray76);
        java.lang.String str79 = functionEvaluationException78.getPattern();
        org.apache.commons.math.FunctionEvaluationException functionEvaluationException80 = new org.apache.commons.math.FunctionEvaluationException((double) (-1.0f), "Evaluation failed for argument = {0}", (java.lang.Object[]) strArray61, (java.lang.Throwable) functionEvaluationException78);
        org.apache.commons.math.ode.DerivativeException derivativeException81 = new org.apache.commons.math.ode.DerivativeException("org.apache.commons.math.ConvergenceException: org.apache.commons.math.ode.DerivativeException: ", strArray61);
        org.apache.commons.math.ode.DerivativeException derivativeException82 = new org.apache.commons.math.ode.DerivativeException("org.apache.commons.math.ConvergenceException: org.apache.commons.math.FunctionEvaluationException: Evaluation failed for argument = 1", strArray61);
        org.apache.commons.math.FunctionEvaluationException functionEvaluationException83 = new org.apache.commons.math.FunctionEvaluationException((double) ' ', "", (java.lang.Object[]) strArray61);
        org.apache.commons.math.ConvergenceException convergenceException84 = new org.apache.commons.math.ConvergenceException("org.apache.commons.math.FunctionEvaluationException: org.apache.commons.math.MaxIterationsExceededException: Maximal number of iterations (3) exceeded", (java.lang.Object[]) strArray25, (java.lang.Throwable) functionEvaluationException83);
        org.junit.Assert.assertNotNull(strArray25);
        org.junit.Assert.assertNotNull(objArray37);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray37), "[10, -1, 10, 0.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray37), "[10, -1, 10, 0.0]");
        org.junit.Assert.assertNotNull(throwableArray40);
        org.junit.Assert.assertNotNull(strArray61);
        org.junit.Assert.assertNotNull(objArray76);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray76), "[1, 10, 1]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray76), "[1, 10, 1]");
        org.junit.Assert.assertEquals("'" + str79 + "' != '" + "" + "'", str79, "");
    }

    @Test
    public void test16573() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest33.test16573");
        java.lang.String[] strArray17 = new java.lang.String[] { "hi!", "", "hi!", "hi!", "hi!" };
        org.apache.commons.math.ode.DerivativeException derivativeException18 = new org.apache.commons.math.ode.DerivativeException("", strArray17);
        org.apache.commons.math.ode.DerivativeException derivativeException19 = new org.apache.commons.math.ode.DerivativeException("", strArray17);
        java.lang.String[] strArray26 = new java.lang.String[] { "hi!", "", "hi!", "hi!", "hi!" };
        org.apache.commons.math.ode.DerivativeException derivativeException27 = new org.apache.commons.math.ode.DerivativeException("", strArray26);
        org.apache.commons.math.ode.DerivativeException derivativeException28 = new org.apache.commons.math.ode.DerivativeException((java.lang.Throwable) derivativeException27);
        org.apache.commons.math.ConvergenceException convergenceException29 = new org.apache.commons.math.ConvergenceException("hi!", (java.lang.Object[]) strArray17, (java.lang.Throwable) derivativeException27);
        org.apache.commons.math.ode.DerivativeException derivativeException30 = new org.apache.commons.math.ode.DerivativeException("hi!", strArray17);
        org.apache.commons.math.ode.DerivativeException derivativeException31 = new org.apache.commons.math.ode.DerivativeException("hi!", strArray17);
        org.apache.commons.math.ConvergenceException convergenceException32 = new org.apache.commons.math.ConvergenceException("org.apache.commons.math.ConvergenceException: Evaluation failed for argument = {0}", (java.lang.Object[]) strArray17);
        org.apache.commons.math.FunctionEvaluationException functionEvaluationException33 = new org.apache.commons.math.FunctionEvaluationException((double) (short) 10, "org.apache.commons.math.MaxIterationsExceededException: org.apache.commons.math.ConvergenceException: org.apache.commons.math.FunctionEvaluationException: hi!", (java.lang.Object[]) strArray17);
        org.apache.commons.math.ConvergenceException convergenceException34 = new org.apache.commons.math.ConvergenceException("org.apache.commons.math.ConvergenceException: org.apache.commons.math.ConvergenceException: org.apache.commons.math.ConvergenceException: org.apache.commons.math.FunctionEvaluationException: hi!", (java.lang.Object[]) strArray17);
        org.apache.commons.math.FunctionEvaluationException functionEvaluationException39 = new org.apache.commons.math.FunctionEvaluationException(52.0d, "org.apache.commons.math.ode.DerivativeException: org.apache.commons.math.ConvergenceException: org.apache.commons.math.FunctionEvaluationException: hi!");
        org.apache.commons.math.FunctionEvaluationException functionEvaluationException40 = new org.apache.commons.math.FunctionEvaluationException((double) 0, (java.lang.Throwable) functionEvaluationException39);
        org.apache.commons.math.ConvergenceException convergenceException41 = new org.apache.commons.math.ConvergenceException("org.apache.commons.math.MaxIterationsExceededException: ", (java.lang.Throwable) functionEvaluationException40);
        org.apache.commons.math.ConvergenceException convergenceException42 = new org.apache.commons.math.ConvergenceException("org.apache.commons.math.ConvergenceException: org.apache.commons.math.ode.DerivativeException: org.apache.commons.math.ConvergenceException: org.apache.commons.math.FunctionEvaluationException: hi!", (java.lang.Object[]) strArray17, (java.lang.Throwable) functionEvaluationException40);
        java.lang.Object[] objArray53 = new java.lang.Object[] { 1L, (byte) 10, (short) 1 };
        org.apache.commons.math.FunctionEvaluationException functionEvaluationException54 = new org.apache.commons.math.FunctionEvaluationException((-1.0d), "hi!", objArray53);
        org.apache.commons.math.FunctionEvaluationException functionEvaluationException55 = new org.apache.commons.math.FunctionEvaluationException((double) 0L, "", objArray53);
        java.lang.String str56 = functionEvaluationException55.getPattern();
        org.apache.commons.math.ode.DerivativeException derivativeException57 = new org.apache.commons.math.ode.DerivativeException((java.lang.Throwable) functionEvaluationException55);
        org.apache.commons.math.FunctionEvaluationException functionEvaluationException58 = new org.apache.commons.math.FunctionEvaluationException((double) '#', (java.lang.Throwable) functionEvaluationException55);
        double double59 = functionEvaluationException58.getArgument();
        org.apache.commons.math.FunctionEvaluationException functionEvaluationException60 = new org.apache.commons.math.FunctionEvaluationException((double) (byte) 1, (java.lang.Throwable) functionEvaluationException58);
        org.apache.commons.math.ConvergenceException convergenceException61 = new org.apache.commons.math.ConvergenceException("org.apache.commons.math.ConvergenceException: hi!", (java.lang.Throwable) functionEvaluationException60);
        double double62 = functionEvaluationException60.getArgument();
        java.lang.String[] strArray69 = new java.lang.String[] { "org.apache.commons.math.FunctionEvaluationException: hi!" };
        org.apache.commons.math.ode.DerivativeException derivativeException70 = new org.apache.commons.math.ode.DerivativeException("hi!", strArray69);
        java.lang.Object[] objArray80 = new java.lang.Object[] { 1L, (byte) 10, (short) 1 };
        org.apache.commons.math.FunctionEvaluationException functionEvaluationException81 = new org.apache.commons.math.FunctionEvaluationException((-1.0d), "hi!", objArray80);
        java.lang.Throwable throwable82 = null;
        org.apache.commons.math.FunctionEvaluationException functionEvaluationException83 = new org.apache.commons.math.FunctionEvaluationException((double) (short) 1, "hi!", objArray80, throwable82);
        org.apache.commons.math.FunctionEvaluationException functionEvaluationException84 = new org.apache.commons.math.FunctionEvaluationException((-1.0d), "Evaluation failed for argument = {0}", throwable82);
        org.apache.commons.math.ConvergenceException convergenceException85 = new org.apache.commons.math.ConvergenceException("org.apache.commons.math.ConvergenceException: hi!", (java.lang.Object[]) strArray69, (java.lang.Throwable) functionEvaluationException84);
        org.apache.commons.math.MaxIterationsExceededException maxIterationsExceededException86 = new org.apache.commons.math.MaxIterationsExceededException((int) ' ', "org.apache.commons.math.ConvergenceException: org.apache.commons.math.ConvergenceException: org.apache.commons.math.FunctionEvaluationException: hi!", (java.lang.Object[]) strArray69);
        org.apache.commons.math.ode.DerivativeException derivativeException87 = new org.apache.commons.math.ode.DerivativeException("org.apache.commons.math.MaxIterationsExceededException: Evaluation failed for argument = {0}", strArray69);
        functionEvaluationException60.addSuppressed((java.lang.Throwable) derivativeException87);
        org.apache.commons.math.ConvergenceException convergenceException89 = new org.apache.commons.math.ConvergenceException("org.apache.commons.math.ode.DerivativeException: Evaluation failed for argument = {0}", (java.lang.Object[]) strArray17, (java.lang.Throwable) functionEvaluationException60);
        org.apache.commons.math.FunctionEvaluationException functionEvaluationException90 = new org.apache.commons.math.FunctionEvaluationException(10.0d, (java.lang.Throwable) functionEvaluationException60);
        java.lang.Object[] objArray91 = functionEvaluationException60.getArguments();
        org.junit.Assert.assertNotNull(strArray17);
        org.junit.Assert.assertNotNull(strArray26);
        org.junit.Assert.assertNotNull(objArray53);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray53), "[1, 10, 1]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray53), "[1, 10, 1]");
        org.junit.Assert.assertEquals("'" + str56 + "' != '" + "" + "'", str56, "");
        org.junit.Assert.assertTrue("'" + double59 + "' != '" + 35.0d + "'", double59 == 35.0d);
        org.junit.Assert.assertTrue("'" + double62 + "' != '" + 1.0d + "'", double62 == 1.0d);
        org.junit.Assert.assertNotNull(strArray69);
        org.junit.Assert.assertNotNull(objArray80);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray80), "[1, 10, 1]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray80), "[1, 10, 1]");
        org.junit.Assert.assertNotNull(objArray91);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray91), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray91), "[]");
    }

    @Test
    public void test16574() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest33.test16574");
        org.apache.commons.math.ConvergenceException convergenceException2 = new org.apache.commons.math.ConvergenceException("org.apache.commons.math.FunctionEvaluationException: org.apache.commons.math.ConvergenceException: org.apache.commons.math.ConvergenceException: org.apache.commons.math.FunctionEvaluationException: hi!");
        org.apache.commons.math.ConvergenceException convergenceException3 = new org.apache.commons.math.ConvergenceException((java.lang.Throwable) convergenceException2);
        org.apache.commons.math.ConvergenceException convergenceException4 = new org.apache.commons.math.ConvergenceException("org.apache.commons.math.FunctionEvaluationException: org.apache.commons.math.ConvergenceException: org.apache.commons.math.FunctionEvaluationException: Evaluation failed for argument = 0", (java.lang.Throwable) convergenceException2);
        java.lang.Object[] objArray5 = convergenceException4.getArguments();
        org.apache.commons.math.ConvergenceException convergenceException6 = new org.apache.commons.math.ConvergenceException((java.lang.Throwable) convergenceException4);
        org.junit.Assert.assertNotNull(objArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray5), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray5), "[]");
    }

    @Test
    public void test16575() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest33.test16575");
        org.apache.commons.math.MaxIterationsExceededException maxIterationsExceededException10 = new org.apache.commons.math.MaxIterationsExceededException(0);
        java.lang.Throwable[] throwableArray11 = maxIterationsExceededException10.getSuppressed();
        org.apache.commons.math.ConvergenceException convergenceException12 = new org.apache.commons.math.ConvergenceException("org.apache.commons.math.ConvergenceException: org.apache.commons.math.FunctionEvaluationException: hi!", (java.lang.Object[]) throwableArray11);
        org.apache.commons.math.ConvergenceException convergenceException13 = new org.apache.commons.math.ConvergenceException("hi!", (java.lang.Object[]) throwableArray11);
        org.apache.commons.math.MaxIterationsExceededException maxIterationsExceededException14 = new org.apache.commons.math.MaxIterationsExceededException((int) (short) 0, "Evaluation failed for argument = {0}", (java.lang.Object[]) throwableArray11);
        org.apache.commons.math.FunctionEvaluationException functionEvaluationException15 = new org.apache.commons.math.FunctionEvaluationException(35.0d, "org.apache.commons.math.MaxIterationsExceededException: org.apache.commons.math.ode.DerivativeException: ", (java.lang.Object[]) throwableArray11);
        org.apache.commons.math.FunctionEvaluationException functionEvaluationException16 = new org.apache.commons.math.FunctionEvaluationException((double) (byte) 10, "org.apache.commons.math.FunctionEvaluationException: Evaluation failed for argument = 2", (java.lang.Object[]) throwableArray11);
        java.lang.String[] strArray27 = new java.lang.String[] { "hi!", "", "hi!", "hi!", "hi!" };
        org.apache.commons.math.ode.DerivativeException derivativeException28 = new org.apache.commons.math.ode.DerivativeException("", strArray27);
        org.apache.commons.math.ode.DerivativeException derivativeException29 = new org.apache.commons.math.ode.DerivativeException("", strArray27);
        java.lang.Throwable throwable32 = null;
        org.apache.commons.math.ConvergenceException convergenceException33 = new org.apache.commons.math.ConvergenceException("hi!", throwable32);
        org.apache.commons.math.ode.DerivativeException derivativeException34 = new org.apache.commons.math.ode.DerivativeException((java.lang.Throwable) convergenceException33);
        java.lang.Throwable[] throwableArray35 = derivativeException34.getSuppressed();
        org.apache.commons.math.ConvergenceException convergenceException36 = new org.apache.commons.math.ConvergenceException("hi!", (java.lang.Throwable) derivativeException34);
        derivativeException29.addSuppressed((java.lang.Throwable) convergenceException36);
        java.lang.Throwable[] throwableArray38 = derivativeException29.getSuppressed();
        java.lang.Object[] objArray45 = new java.lang.Object[] { 1L, (byte) 10, (short) 1 };
        org.apache.commons.math.FunctionEvaluationException functionEvaluationException46 = new org.apache.commons.math.FunctionEvaluationException((-1.0d), "hi!", objArray45);
        java.lang.Object[] objArray52 = new java.lang.Object[] { 10L, (-1L), 10, 0.0d };
        java.lang.Throwable throwable53 = null;
        org.apache.commons.math.ConvergenceException convergenceException54 = new org.apache.commons.math.ConvergenceException("hi!", objArray52, throwable53);
        org.apache.commons.math.ConvergenceException convergenceException55 = new org.apache.commons.math.ConvergenceException("Evaluation failed for argument = {0}", objArray45, (java.lang.Throwable) convergenceException54);
        org.apache.commons.math.ConvergenceException convergenceException56 = new org.apache.commons.math.ConvergenceException((java.lang.Throwable) convergenceException54);
        org.apache.commons.math.ConvergenceException convergenceException57 = new org.apache.commons.math.ConvergenceException("org.apache.commons.math.ode.DerivativeException: org.apache.commons.math.ConvergenceException: org.apache.commons.math.FunctionEvaluationException: hi!", (java.lang.Object[]) throwableArray38, (java.lang.Throwable) convergenceException54);
        java.lang.Throwable[] throwableArray58 = convergenceException57.getSuppressed();
        org.apache.commons.math.FunctionEvaluationException functionEvaluationException59 = new org.apache.commons.math.FunctionEvaluationException((double) 0.0f, "org.apache.commons.math.MaxIterationsExceededException: org.apache.commons.math.ConvergenceException: org.apache.commons.math.ConvergenceException: org.apache.commons.math.FunctionEvaluationException: Evaluation failed for argument = 0", (java.lang.Object[]) throwableArray58);
        org.apache.commons.math.ConvergenceException convergenceException60 = new org.apache.commons.math.ConvergenceException("Evaluation failed for argument = 10", (java.lang.Object[]) throwableArray11, (java.lang.Throwable) functionEvaluationException59);
        org.apache.commons.math.MaxIterationsExceededException maxIterationsExceededException73 = new org.apache.commons.math.MaxIterationsExceededException(0);
        java.lang.Throwable[] throwableArray74 = maxIterationsExceededException73.getSuppressed();
        org.apache.commons.math.ConvergenceException convergenceException75 = new org.apache.commons.math.ConvergenceException("org.apache.commons.math.ConvergenceException: org.apache.commons.math.FunctionEvaluationException: hi!", (java.lang.Object[]) throwableArray74);
        org.apache.commons.math.ConvergenceException convergenceException76 = new org.apache.commons.math.ConvergenceException("hi!", (java.lang.Object[]) throwableArray74);
        org.apache.commons.math.MaxIterationsExceededException maxIterationsExceededException77 = new org.apache.commons.math.MaxIterationsExceededException((int) (short) 0, "Evaluation failed for argument = {0}", (java.lang.Object[]) throwableArray74);
        org.apache.commons.math.FunctionEvaluationException functionEvaluationException78 = new org.apache.commons.math.FunctionEvaluationException(35.0d, "org.apache.commons.math.MaxIterationsExceededException: org.apache.commons.math.ode.DerivativeException: ", (java.lang.Object[]) throwableArray74);
        org.apache.commons.math.FunctionEvaluationException functionEvaluationException79 = new org.apache.commons.math.FunctionEvaluationException((double) (byte) 10, "org.apache.commons.math.FunctionEvaluationException: Evaluation failed for argument = 2", (java.lang.Object[]) throwableArray74);
        org.apache.commons.math.FunctionEvaluationException functionEvaluationException80 = new org.apache.commons.math.FunctionEvaluationException(35.0d, "org.apache.commons.math.FunctionEvaluationException: org.apache.commons.math.ode.DerivativeException: ", (java.lang.Object[]) throwableArray74);
        org.apache.commons.math.FunctionEvaluationException functionEvaluationException81 = new org.apache.commons.math.FunctionEvaluationException((-1.0d), (java.lang.Throwable) functionEvaluationException80);
        functionEvaluationException59.addSuppressed((java.lang.Throwable) functionEvaluationException80);
        double double83 = functionEvaluationException80.getArgument();
        java.lang.Class<?> wildcardClass84 = functionEvaluationException80.getClass();
        org.junit.Assert.assertNotNull(throwableArray11);
        org.junit.Assert.assertNotNull(strArray27);
        org.junit.Assert.assertNotNull(throwableArray35);
        org.junit.Assert.assertNotNull(throwableArray38);
        org.junit.Assert.assertNotNull(objArray45);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray45), "[1, 10, 1]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray45), "[1, 10, 1]");
        org.junit.Assert.assertNotNull(objArray52);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray52), "[10, -1, 10, 0.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray52), "[10, -1, 10, 0.0]");
        org.junit.Assert.assertNotNull(throwableArray58);
        org.junit.Assert.assertNotNull(throwableArray74);
        org.junit.Assert.assertTrue("'" + double83 + "' != '" + 35.0d + "'", double83 == 35.0d);
        org.junit.Assert.assertNotNull(wildcardClass84);
    }

    @Test
    public void test16576() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest33.test16576");
        org.apache.commons.math.FunctionEvaluationException functionEvaluationException10 = new org.apache.commons.math.FunctionEvaluationException(0.0d, "Evaluation failed for argument = {0}");
        org.apache.commons.math.ode.DerivativeException derivativeException11 = new org.apache.commons.math.ode.DerivativeException((java.lang.Throwable) functionEvaluationException10);
        java.lang.String str12 = functionEvaluationException10.getPattern();
        java.lang.Throwable[] throwableArray13 = functionEvaluationException10.getSuppressed();
        org.apache.commons.math.FunctionEvaluationException functionEvaluationException14 = new org.apache.commons.math.FunctionEvaluationException((double) (byte) 0, "org.apache.commons.math.ConvergenceException: org.apache.commons.math.FunctionEvaluationException: Evaluation failed for argument = 2", (java.lang.Object[]) throwableArray13);
        java.lang.Object[] objArray15 = functionEvaluationException14.getArguments();
        org.apache.commons.math.ConvergenceException convergenceException16 = new org.apache.commons.math.ConvergenceException("org.apache.commons.math.MaxIterationsExceededException: Maximal number of iterations (0) exceeded", objArray15);
        java.lang.String[] strArray32 = new java.lang.String[] { "hi!", "", "hi!", "hi!", "hi!" };
        org.apache.commons.math.ode.DerivativeException derivativeException33 = new org.apache.commons.math.ode.DerivativeException("", strArray32);
        org.apache.commons.math.MaxIterationsExceededException maxIterationsExceededException34 = new org.apache.commons.math.MaxIterationsExceededException(10, "org.apache.commons.math.FunctionEvaluationException: Evaluation failed for argument = 0", (java.lang.Object[]) strArray32);
        org.apache.commons.math.MaxIterationsExceededException maxIterationsExceededException36 = new org.apache.commons.math.MaxIterationsExceededException(3);
        org.apache.commons.math.FunctionEvaluationException functionEvaluationException37 = new org.apache.commons.math.FunctionEvaluationException((double) 0, "hi!", (java.lang.Object[]) strArray32, (java.lang.Throwable) maxIterationsExceededException36);
        org.apache.commons.math.ConvergenceException convergenceException38 = new org.apache.commons.math.ConvergenceException("hi!", (java.lang.Object[]) strArray32);
        java.lang.Object[] objArray48 = new java.lang.Object[] { 1L, (byte) 10, (short) 1 };
        org.apache.commons.math.FunctionEvaluationException functionEvaluationException49 = new org.apache.commons.math.FunctionEvaluationException((-1.0d), "hi!", objArray48);
        org.apache.commons.math.FunctionEvaluationException functionEvaluationException50 = new org.apache.commons.math.FunctionEvaluationException((double) 0L, "", objArray48);
        java.lang.String str51 = functionEvaluationException50.getPattern();
        org.apache.commons.math.ode.DerivativeException derivativeException52 = new org.apache.commons.math.ode.DerivativeException((java.lang.Throwable) functionEvaluationException50);
        java.lang.Object[] objArray53 = derivativeException52.getArguments();
        org.apache.commons.math.ConvergenceException convergenceException54 = new org.apache.commons.math.ConvergenceException("hi!", (java.lang.Throwable) derivativeException52);
        org.apache.commons.math.ConvergenceException convergenceException55 = new org.apache.commons.math.ConvergenceException((java.lang.Throwable) derivativeException52);
        org.apache.commons.math.ConvergenceException convergenceException56 = new org.apache.commons.math.ConvergenceException("org.apache.commons.math.MaxIterationsExceededException: org.apache.commons.math.ConvergenceException: org.apache.commons.math.ConvergenceException: org.apache.commons.math.FunctionEvaluationException: hi!", (java.lang.Throwable) derivativeException52);
        org.apache.commons.math.FunctionEvaluationException functionEvaluationException57 = new org.apache.commons.math.FunctionEvaluationException(0.0d, "org.apache.commons.math.FunctionEvaluationException: Evaluation failed for argument = 0", (java.lang.Object[]) strArray32, (java.lang.Throwable) derivativeException52);
        org.apache.commons.math.ConvergenceException convergenceException58 = new org.apache.commons.math.ConvergenceException("", (java.lang.Object[]) strArray32);
        org.apache.commons.math.ConvergenceException convergenceException59 = new org.apache.commons.math.ConvergenceException("org.apache.commons.math.ConvergenceException: org.apache.commons.math.FunctionEvaluationException: ", (java.lang.Throwable) convergenceException58);
        org.apache.commons.math.FunctionEvaluationException functionEvaluationException60 = new org.apache.commons.math.FunctionEvaluationException((double) (short) 0, "", objArray15, (java.lang.Throwable) convergenceException59);
        org.apache.commons.math.ConvergenceException convergenceException61 = new org.apache.commons.math.ConvergenceException("org.apache.commons.math.FunctionEvaluationException: Evaluation failed for argument = {0}", objArray15);
        java.lang.Throwable[] throwableArray62 = convergenceException61.getSuppressed();
        org.apache.commons.math.MaxIterationsExceededException maxIterationsExceededException63 = new org.apache.commons.math.MaxIterationsExceededException((-1), "org.apache.commons.math.ConvergenceException: org.apache.commons.math.FunctionEvaluationException: org.apache.commons.math.ConvergenceException: hi!", (java.lang.Object[]) throwableArray62);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "Evaluation failed for argument = {0}" + "'", str12, "Evaluation failed for argument = {0}");
        org.junit.Assert.assertNotNull(throwableArray13);
        org.junit.Assert.assertNotNull(objArray15);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray15), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray15), "[]");
        org.junit.Assert.assertNotNull(strArray32);
        org.junit.Assert.assertNotNull(objArray48);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray48), "[1, 10, 1]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray48), "[1, 10, 1]");
        org.junit.Assert.assertEquals("'" + str51 + "' != '" + "" + "'", str51, "");
        org.junit.Assert.assertNotNull(objArray53);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray53), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray53), "[]");
        org.junit.Assert.assertNotNull(throwableArray62);
    }

    @Test
    public void test16577() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest33.test16577");
        org.apache.commons.math.FunctionEvaluationException functionEvaluationException7 = new org.apache.commons.math.FunctionEvaluationException((double) '4');
        java.lang.String str8 = functionEvaluationException7.getPattern();
        java.lang.Object[] objArray9 = functionEvaluationException7.getArguments();
        org.apache.commons.math.ConvergenceException convergenceException10 = new org.apache.commons.math.ConvergenceException("org.apache.commons.math.FunctionEvaluationException: Evaluation failed for argument = -1", objArray9);
        org.apache.commons.math.ConvergenceException convergenceException11 = new org.apache.commons.math.ConvergenceException("org.apache.commons.math.ConvergenceException: org.apache.commons.math.ConvergenceException: org.apache.commons.math.FunctionEvaluationException: org.apache.commons.math.ode.DerivativeException: ", objArray9);
        org.apache.commons.math.ConvergenceException convergenceException12 = new org.apache.commons.math.ConvergenceException((java.lang.Throwable) convergenceException11);
        java.lang.String[] strArray27 = new java.lang.String[] { "hi!", "", "hi!", "hi!", "hi!" };
        org.apache.commons.math.ode.DerivativeException derivativeException28 = new org.apache.commons.math.ode.DerivativeException("", strArray27);
        org.apache.commons.math.ode.DerivativeException derivativeException29 = new org.apache.commons.math.ode.DerivativeException("", strArray27);
        java.lang.String[] strArray36 = new java.lang.String[] { "hi!", "", "hi!", "hi!", "hi!" };
        org.apache.commons.math.ode.DerivativeException derivativeException37 = new org.apache.commons.math.ode.DerivativeException("", strArray36);
        org.apache.commons.math.ode.DerivativeException derivativeException38 = new org.apache.commons.math.ode.DerivativeException((java.lang.Throwable) derivativeException37);
        org.apache.commons.math.ConvergenceException convergenceException39 = new org.apache.commons.math.ConvergenceException("hi!", (java.lang.Object[]) strArray27, (java.lang.Throwable) derivativeException37);
        org.apache.commons.math.ode.DerivativeException derivativeException40 = new org.apache.commons.math.ode.DerivativeException("hi!", strArray27);
        java.lang.Object[] objArray48 = new java.lang.Object[] { 1L, (byte) 10, (short) 1 };
        org.apache.commons.math.FunctionEvaluationException functionEvaluationException49 = new org.apache.commons.math.FunctionEvaluationException((-1.0d), "hi!", objArray48);
        java.lang.Throwable throwable50 = null;
        org.apache.commons.math.FunctionEvaluationException functionEvaluationException51 = new org.apache.commons.math.FunctionEvaluationException((double) (short) 1, "hi!", objArray48, throwable50);
        org.apache.commons.math.ConvergenceException convergenceException52 = new org.apache.commons.math.ConvergenceException("org.apache.commons.math.FunctionEvaluationException: hi!", (java.lang.Object[]) strArray27, throwable50);
        org.apache.commons.math.FunctionEvaluationException functionEvaluationException53 = new org.apache.commons.math.FunctionEvaluationException((double) 10L, "org.apache.commons.math.ConvergenceException: org.apache.commons.math.FunctionEvaluationException: hi!", (java.lang.Object[]) strArray27);
        org.apache.commons.math.ode.DerivativeException derivativeException54 = new org.apache.commons.math.ode.DerivativeException("org.apache.commons.math.FunctionEvaluationException: hi!", strArray27);
        org.apache.commons.math.ode.DerivativeException derivativeException55 = new org.apache.commons.math.ode.DerivativeException("org.apache.commons.math.FunctionEvaluationException: org.apache.commons.math.ode.DerivativeException: ", strArray27);
        org.apache.commons.math.ode.DerivativeException derivativeException56 = new org.apache.commons.math.ode.DerivativeException((java.lang.Throwable) derivativeException55);
        convergenceException11.addSuppressed((java.lang.Throwable) derivativeException55);
        org.apache.commons.math.ConvergenceException convergenceException58 = new org.apache.commons.math.ConvergenceException((java.lang.Throwable) derivativeException55);
        java.lang.Throwable[] throwableArray59 = derivativeException55.getSuppressed();
        java.lang.String[] strArray72 = new java.lang.String[] { "hi!", "", "hi!", "hi!", "hi!" };
        org.apache.commons.math.ode.DerivativeException derivativeException73 = new org.apache.commons.math.ode.DerivativeException("", strArray72);
        org.apache.commons.math.MaxIterationsExceededException maxIterationsExceededException74 = new org.apache.commons.math.MaxIterationsExceededException(10, "org.apache.commons.math.FunctionEvaluationException: Evaluation failed for argument = 0", (java.lang.Object[]) strArray72);
        org.apache.commons.math.ConvergenceException convergenceException75 = new org.apache.commons.math.ConvergenceException("org.apache.commons.math.MaxIterationsExceededException: org.apache.commons.math.ConvergenceException: org.apache.commons.math.ConvergenceException: org.apache.commons.math.FunctionEvaluationException: hi!", (java.lang.Object[]) strArray72);
        org.apache.commons.math.MaxIterationsExceededException maxIterationsExceededException76 = new org.apache.commons.math.MaxIterationsExceededException((int) (short) 0, "org.apache.commons.math.ode.DerivativeException: org.apache.commons.math.ode.DerivativeException: ", (java.lang.Object[]) strArray72);
        org.apache.commons.math.FunctionEvaluationException functionEvaluationException77 = new org.apache.commons.math.FunctionEvaluationException((double) 52, (java.lang.Throwable) maxIterationsExceededException76);
        org.apache.commons.math.FunctionEvaluationException functionEvaluationException78 = new org.apache.commons.math.FunctionEvaluationException((double) (byte) 10, "org.apache.commons.math.ConvergenceException: org.apache.commons.math.FunctionEvaluationException: org.apache.commons.math.FunctionEvaluationException: Evaluation failed for argument = 2", (java.lang.Object[]) throwableArray59, (java.lang.Throwable) functionEvaluationException77);
        org.apache.commons.math.FunctionEvaluationException functionEvaluationException81 = new org.apache.commons.math.FunctionEvaluationException((double) 35, "org.apache.commons.math.ConvergenceException: org.apache.commons.math.FunctionEvaluationException: org.apache.commons.math.MaxIterationsExceededException: org.apache.commons.math.FunctionEvaluationException: hi!");
        org.apache.commons.math.FunctionEvaluationException functionEvaluationException82 = new org.apache.commons.math.FunctionEvaluationException((double) 1, "org.apache.commons.math.ConvergenceException: org.apache.commons.math.FunctionEvaluationException: Evaluation failed for argument = 35", (java.lang.Object[]) throwableArray59, (java.lang.Throwable) functionEvaluationException81);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Evaluation failed for argument = {0}" + "'", str8, "Evaluation failed for argument = {0}");
        org.junit.Assert.assertNotNull(objArray9);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray9), "[52.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray9), "[52.0]");
        org.junit.Assert.assertNotNull(strArray27);
        org.junit.Assert.assertNotNull(strArray36);
        org.junit.Assert.assertNotNull(objArray48);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray48), "[1, 10, 1]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray48), "[1, 10, 1]");
        org.junit.Assert.assertNotNull(throwableArray59);
        org.junit.Assert.assertNotNull(strArray72);
    }

    @Test
    public void test16578() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest33.test16578");
        org.apache.commons.math.MaxIterationsExceededException maxIterationsExceededException3 = new org.apache.commons.math.MaxIterationsExceededException(0);
        org.apache.commons.math.FunctionEvaluationException functionEvaluationException4 = new org.apache.commons.math.FunctionEvaluationException((double) 10, "org.apache.commons.math.FunctionEvaluationException: Evaluation failed for argument = 0", (java.lang.Throwable) maxIterationsExceededException3);
        java.lang.String str5 = maxIterationsExceededException3.toString();
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "org.apache.commons.math.MaxIterationsExceededException: Maximal number of iterations (0) exceeded" + "'", str5, "org.apache.commons.math.MaxIterationsExceededException: Maximal number of iterations (0) exceeded");
    }

    @Test
    public void test16579() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest33.test16579");
        java.lang.String[] strArray12 = new java.lang.String[] { "Evaluation failed for argument = {0}", "Evaluation failed for argument = {0}", "Evaluation failed for argument = {0}", "", "", "org.apache.commons.math.ConvergenceException: org.apache.commons.math.FunctionEvaluationException: hi!" };
        org.apache.commons.math.ode.DerivativeException derivativeException13 = new org.apache.commons.math.ode.DerivativeException("Evaluation failed for argument = {0}", strArray12);
        org.apache.commons.math.ode.DerivativeException derivativeException14 = new org.apache.commons.math.ode.DerivativeException("org.apache.commons.math.FunctionEvaluationException: hi!", strArray12);
        org.apache.commons.math.ConvergenceException convergenceException15 = new org.apache.commons.math.ConvergenceException("org.apache.commons.math.ode.DerivativeException: ", (java.lang.Throwable) derivativeException14);
        org.apache.commons.math.ConvergenceException convergenceException16 = new org.apache.commons.math.ConvergenceException("org.apache.commons.math.ConvergenceException: hi!", (java.lang.Throwable) convergenceException15);
        org.apache.commons.math.FunctionEvaluationException functionEvaluationException17 = new org.apache.commons.math.FunctionEvaluationException(0.0d, (java.lang.Throwable) convergenceException16);
        java.lang.Throwable[] throwableArray18 = convergenceException16.getSuppressed();
        java.lang.Throwable throwable28 = null;
        org.apache.commons.math.ConvergenceException convergenceException29 = new org.apache.commons.math.ConvergenceException("hi!", throwable28);
        org.apache.commons.math.ode.DerivativeException derivativeException30 = new org.apache.commons.math.ode.DerivativeException((java.lang.Throwable) convergenceException29);
        java.lang.Throwable[] throwableArray31 = derivativeException30.getSuppressed();
        org.apache.commons.math.MaxIterationsExceededException maxIterationsExceededException32 = new org.apache.commons.math.MaxIterationsExceededException((int) (byte) 1, "org.apache.commons.math.FunctionEvaluationException: Evaluation failed for argument = 0", (java.lang.Object[]) throwableArray31);
        java.lang.String[] strArray41 = new java.lang.String[] { "hi!", "", "hi!", "hi!", "hi!" };
        org.apache.commons.math.ode.DerivativeException derivativeException42 = new org.apache.commons.math.ode.DerivativeException("", strArray41);
        org.apache.commons.math.ode.DerivativeException derivativeException43 = new org.apache.commons.math.ode.DerivativeException("org.apache.commons.math.FunctionEvaluationException: hi!", strArray41);
        org.apache.commons.math.MaxIterationsExceededException maxIterationsExceededException46 = new org.apache.commons.math.MaxIterationsExceededException(0);
        org.apache.commons.math.ConvergenceException convergenceException47 = new org.apache.commons.math.ConvergenceException("org.apache.commons.math.ConvergenceException: org.apache.commons.math.FunctionEvaluationException: hi!", (java.lang.Throwable) maxIterationsExceededException46);
        org.apache.commons.math.ConvergenceException convergenceException48 = new org.apache.commons.math.ConvergenceException("", (java.lang.Object[]) strArray41, (java.lang.Throwable) maxIterationsExceededException46);
        org.apache.commons.math.FunctionEvaluationException functionEvaluationException49 = new org.apache.commons.math.FunctionEvaluationException((double) (-1.0f), "org.apache.commons.math.ConvergenceException: org.apache.commons.math.ConvergenceException: org.apache.commons.math.FunctionEvaluationException: hi!", (java.lang.Object[]) throwableArray31, (java.lang.Throwable) maxIterationsExceededException46);
        org.apache.commons.math.FunctionEvaluationException functionEvaluationException50 = new org.apache.commons.math.FunctionEvaluationException((double) (short) 100, "org.apache.commons.math.FunctionEvaluationException: Evaluation failed for argument = 52", (java.lang.Object[]) throwableArray31);
        org.apache.commons.math.FunctionEvaluationException functionEvaluationException51 = new org.apache.commons.math.FunctionEvaluationException((double) 100.0f, "", (java.lang.Object[]) throwableArray31);
        java.lang.String str52 = functionEvaluationException51.getPattern();
        java.lang.String str53 = functionEvaluationException51.getPattern();
        org.apache.commons.math.ode.DerivativeException derivativeException54 = new org.apache.commons.math.ode.DerivativeException((java.lang.Throwable) functionEvaluationException51);
        org.apache.commons.math.ConvergenceException convergenceException55 = new org.apache.commons.math.ConvergenceException("org.apache.commons.math.FunctionEvaluationException: Evaluation failed for argument = 97", (java.lang.Object[]) throwableArray18, (java.lang.Throwable) derivativeException54);
        org.junit.Assert.assertNotNull(strArray12);
        org.junit.Assert.assertNotNull(throwableArray18);
        org.junit.Assert.assertNotNull(throwableArray31);
        org.junit.Assert.assertNotNull(strArray41);
        org.junit.Assert.assertEquals("'" + str52 + "' != '" + "" + "'", str52, "");
        org.junit.Assert.assertEquals("'" + str53 + "' != '" + "" + "'", str53, "");
    }

    @Test
    public void test16580() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest33.test16580");
        org.apache.commons.math.FunctionEvaluationException functionEvaluationException2 = new org.apache.commons.math.FunctionEvaluationException((double) (byte) 1, "org.apache.commons.math.MaxIterationsExceededException: org.apache.commons.math.ode.DerivativeException: org.apache.commons.math.ConvergenceException: org.apache.commons.math.ConvergenceException: org.apache.commons.math.FunctionEvaluationException: hi!");
    }

    @Test
    public void test16581() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest33.test16581");
        org.apache.commons.math.ConvergenceException convergenceException3 = new org.apache.commons.math.ConvergenceException();
        java.lang.Object[] objArray19 = new java.lang.Object[] { 1L, (byte) 10, (short) 1 };
        org.apache.commons.math.FunctionEvaluationException functionEvaluationException20 = new org.apache.commons.math.FunctionEvaluationException((-1.0d), "hi!", objArray19);
        org.apache.commons.math.FunctionEvaluationException functionEvaluationException21 = new org.apache.commons.math.FunctionEvaluationException((double) 0L, "", objArray19);
        java.lang.Object[] objArray26 = new java.lang.Object[] { "", (short) 1, "org.apache.commons.math.FunctionEvaluationException: hi!", 10.0d, 0.0f };
        java.lang.Throwable throwable28 = null;
        org.apache.commons.math.ConvergenceException convergenceException29 = new org.apache.commons.math.ConvergenceException("hi!", throwable28);
        org.apache.commons.math.ode.DerivativeException derivativeException30 = new org.apache.commons.math.ode.DerivativeException((java.lang.Throwable) convergenceException29);
        java.lang.Throwable[] throwableArray31 = derivativeException30.getSuppressed();
        org.apache.commons.math.FunctionEvaluationException functionEvaluationException32 = new org.apache.commons.math.FunctionEvaluationException((double) 100, "", objArray26, (java.lang.Throwable) derivativeException30);
        java.lang.Object[] objArray44 = new java.lang.Object[] { 1L, (byte) 10, (short) 1 };
        org.apache.commons.math.FunctionEvaluationException functionEvaluationException45 = new org.apache.commons.math.FunctionEvaluationException((-1.0d), "hi!", objArray44);
        org.apache.commons.math.FunctionEvaluationException functionEvaluationException46 = new org.apache.commons.math.FunctionEvaluationException((double) 0L, "", objArray44);
        java.lang.Object[] objArray51 = new java.lang.Object[] { "", (short) 1, "org.apache.commons.math.FunctionEvaluationException: hi!", 10.0d, 0.0f };
        java.lang.Throwable throwable53 = null;
        org.apache.commons.math.ConvergenceException convergenceException54 = new org.apache.commons.math.ConvergenceException("hi!", throwable53);
        org.apache.commons.math.ode.DerivativeException derivativeException55 = new org.apache.commons.math.ode.DerivativeException((java.lang.Throwable) convergenceException54);
        java.lang.Throwable[] throwableArray56 = derivativeException55.getSuppressed();
        org.apache.commons.math.FunctionEvaluationException functionEvaluationException57 = new org.apache.commons.math.FunctionEvaluationException((double) 100, "", objArray51, (java.lang.Throwable) derivativeException55);
        java.lang.Object[] objArray65 = new java.lang.Object[] { 1L, (byte) 10, (short) 1 };
        org.apache.commons.math.FunctionEvaluationException functionEvaluationException66 = new org.apache.commons.math.FunctionEvaluationException((-1.0d), "hi!", objArray65);
        org.apache.commons.math.FunctionEvaluationException functionEvaluationException67 = new org.apache.commons.math.FunctionEvaluationException((double) 0L, "", objArray65);
        org.apache.commons.math.ode.DerivativeException derivativeException68 = new org.apache.commons.math.ode.DerivativeException((java.lang.Throwable) functionEvaluationException67);
        org.apache.commons.math.FunctionEvaluationException functionEvaluationException69 = new org.apache.commons.math.FunctionEvaluationException((double) '#', "hi!", objArray51, (java.lang.Throwable) derivativeException68);
        org.apache.commons.math.FunctionEvaluationException functionEvaluationException70 = new org.apache.commons.math.FunctionEvaluationException((double) (byte) -1, "", objArray26, (java.lang.Throwable) functionEvaluationException69);
        org.apache.commons.math.FunctionEvaluationException functionEvaluationException71 = new org.apache.commons.math.FunctionEvaluationException(10.0d, "hi!", objArray26);
        java.lang.Throwable throwable73 = null;
        org.apache.commons.math.ConvergenceException convergenceException74 = new org.apache.commons.math.ConvergenceException("hi!", throwable73);
        org.apache.commons.math.FunctionEvaluationException functionEvaluationException75 = new org.apache.commons.math.FunctionEvaluationException((double) 100.0f, "org.apache.commons.math.FunctionEvaluationException: hi!", objArray26, (java.lang.Throwable) convergenceException74);
        org.apache.commons.math.ode.DerivativeException derivativeException76 = new org.apache.commons.math.ode.DerivativeException((java.lang.Throwable) convergenceException74);
        convergenceException3.addSuppressed((java.lang.Throwable) derivativeException76);
        java.lang.String str78 = derivativeException76.getPattern();
        java.lang.Throwable[] throwableArray79 = derivativeException76.getSuppressed();
        org.apache.commons.math.FunctionEvaluationException functionEvaluationException80 = new org.apache.commons.math.FunctionEvaluationException((double) 32, (java.lang.Throwable) derivativeException76);
        org.apache.commons.math.FunctionEvaluationException functionEvaluationException81 = new org.apache.commons.math.FunctionEvaluationException((double) (byte) 100, "org.apache.commons.math.FunctionEvaluationException: org.apache.commons.math.FunctionEvaluationException: org.apache.commons.math.ConvergenceException: org.apache.commons.math.FunctionEvaluationException: org.apache.commons.math.FunctionEvaluationException: Evaluation failed for argument = 2", (java.lang.Throwable) functionEvaluationException80);
        java.lang.Class<?> wildcardClass82 = functionEvaluationException81.getClass();
        org.junit.Assert.assertNotNull(objArray19);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray19), "[1, 10, 1]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray19), "[1, 10, 1]");
        org.junit.Assert.assertNotNull(objArray26);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray26), "[, 1, org.apache.commons.math.FunctionEvaluationException: hi!, 10.0, 0.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray26), "[, 1, org.apache.commons.math.FunctionEvaluationException: hi!, 10.0, 0.0]");
        org.junit.Assert.assertNotNull(throwableArray31);
        org.junit.Assert.assertNotNull(objArray44);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray44), "[1, 10, 1]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray44), "[1, 10, 1]");
        org.junit.Assert.assertNotNull(objArray51);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray51), "[, 1, org.apache.commons.math.FunctionEvaluationException: hi!, 10.0, 0.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray51), "[, 1, org.apache.commons.math.FunctionEvaluationException: hi!, 10.0, 0.0]");
        org.junit.Assert.assertNotNull(throwableArray56);
        org.junit.Assert.assertNotNull(objArray65);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray65), "[1, 10, 1]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray65), "[1, 10, 1]");
        org.junit.Assert.assertEquals("'" + str78 + "' != '" + "hi!" + "'", str78, "hi!");
        org.junit.Assert.assertNotNull(throwableArray79);
        org.junit.Assert.assertNotNull(wildcardClass82);
    }

    @Test
    public void test16582() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest33.test16582");
        java.lang.Throwable throwable2 = null;
        org.apache.commons.math.ConvergenceException convergenceException3 = new org.apache.commons.math.ConvergenceException("org.apache.commons.math.ConvergenceException: org.apache.commons.math.MaxIterationsExceededException: org.apache.commons.math.ConvergenceException: org.apache.commons.math.ConvergenceException: org.apache.commons.math.FunctionEvaluationException: hi!", throwable2);
        org.apache.commons.math.ConvergenceException convergenceException4 = new org.apache.commons.math.ConvergenceException("org.apache.commons.math.FunctionEvaluationException: org.apache.commons.math.MaxIterationsExceededException: org.apache.commons.math.ConvergenceException: org.apache.commons.math.FunctionEvaluationException: org.apache.commons.math.ConvergenceException: hi!", throwable2);
        org.apache.commons.math.ConvergenceException convergenceException5 = new org.apache.commons.math.ConvergenceException(throwable2);
    }

    @Test
    public void test16583() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest33.test16583");
        org.apache.commons.math.FunctionEvaluationException functionEvaluationException4 = new org.apache.commons.math.FunctionEvaluationException(2.0d);
        java.lang.String str5 = functionEvaluationException4.getPattern();
        org.apache.commons.math.FunctionEvaluationException functionEvaluationException6 = new org.apache.commons.math.FunctionEvaluationException((double) 100L, (java.lang.Throwable) functionEvaluationException4);
        java.lang.Object[] objArray7 = functionEvaluationException4.getArguments();
        java.lang.Object[] objArray18 = new java.lang.Object[] { 1L, (byte) 10, (short) 1 };
        org.apache.commons.math.FunctionEvaluationException functionEvaluationException19 = new org.apache.commons.math.FunctionEvaluationException((-1.0d), "hi!", objArray18);
        org.apache.commons.math.FunctionEvaluationException functionEvaluationException20 = new org.apache.commons.math.FunctionEvaluationException((double) 0L, "", objArray18);
        java.lang.String str21 = functionEvaluationException20.getPattern();
        org.apache.commons.math.ode.DerivativeException derivativeException22 = new org.apache.commons.math.ode.DerivativeException((java.lang.Throwable) functionEvaluationException20);
        java.lang.Object[] objArray23 = derivativeException22.getArguments();
        org.apache.commons.math.ConvergenceException convergenceException24 = new org.apache.commons.math.ConvergenceException("hi!", (java.lang.Throwable) derivativeException22);
        org.apache.commons.math.ConvergenceException convergenceException25 = new org.apache.commons.math.ConvergenceException((java.lang.Throwable) derivativeException22);
        org.apache.commons.math.ConvergenceException convergenceException26 = new org.apache.commons.math.ConvergenceException("org.apache.commons.math.MaxIterationsExceededException: org.apache.commons.math.ConvergenceException: org.apache.commons.math.ConvergenceException: org.apache.commons.math.FunctionEvaluationException: hi!", (java.lang.Throwable) derivativeException22);
        org.apache.commons.math.ConvergenceException convergenceException27 = new org.apache.commons.math.ConvergenceException("org.apache.commons.math.ConvergenceException: Evaluation failed for argument = {0}", (java.lang.Throwable) derivativeException22);
        org.apache.commons.math.FunctionEvaluationException functionEvaluationException28 = new org.apache.commons.math.FunctionEvaluationException(0.0d, "org.apache.commons.math.FunctionEvaluationException: org.apache.commons.math.FunctionEvaluationException: org.apache.commons.math.FunctionEvaluationException: org.apache.commons.math.ode.DerivativeException: ", objArray7, (java.lang.Throwable) convergenceException27);
        java.lang.Throwable throwable33 = null;
        org.apache.commons.math.ConvergenceException convergenceException34 = new org.apache.commons.math.ConvergenceException("hi!", throwable33);
        org.apache.commons.math.ConvergenceException convergenceException35 = new org.apache.commons.math.ConvergenceException(throwable33);
        org.apache.commons.math.FunctionEvaluationException functionEvaluationException36 = new org.apache.commons.math.FunctionEvaluationException((double) ' ', (java.lang.Throwable) convergenceException35);
        java.lang.Throwable[] throwableArray37 = functionEvaluationException36.getSuppressed();
        org.apache.commons.math.ConvergenceException convergenceException38 = new org.apache.commons.math.ConvergenceException("org.apache.commons.math.ConvergenceException: org.apache.commons.math.ConvergenceException: org.apache.commons.math.FunctionEvaluationException: hi!", (java.lang.Throwable) functionEvaluationException36);
        java.lang.Object[] objArray39 = convergenceException38.getArguments();
        org.apache.commons.math.MaxIterationsExceededException maxIterationsExceededException41 = new org.apache.commons.math.MaxIterationsExceededException((int) 'a');
        org.apache.commons.math.ConvergenceException convergenceException42 = new org.apache.commons.math.ConvergenceException("org.apache.commons.math.MaxIterationsExceededException: org.apache.commons.math.ConvergenceException: org.apache.commons.math.ConvergenceException: hi!", objArray39, (java.lang.Throwable) maxIterationsExceededException41);
        functionEvaluationException28.addSuppressed((java.lang.Throwable) maxIterationsExceededException41);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Evaluation failed for argument = {0}" + "'", str5, "Evaluation failed for argument = {0}");
        org.junit.Assert.assertNotNull(objArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray7), "[2.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray7), "[2.0]");
        org.junit.Assert.assertNotNull(objArray18);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray18), "[1, 10, 1]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray18), "[1, 10, 1]");
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "" + "'", str21, "");
        org.junit.Assert.assertNotNull(objArray23);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray23), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray23), "[]");
        org.junit.Assert.assertNotNull(throwableArray37);
        org.junit.Assert.assertNotNull(objArray39);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray39), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray39), "[]");
    }

    @Test
    public void test16584() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest33.test16584");
        java.lang.Throwable throwable8 = null;
        org.apache.commons.math.ConvergenceException convergenceException9 = new org.apache.commons.math.ConvergenceException("hi!", throwable8);
        org.apache.commons.math.ode.DerivativeException derivativeException10 = new org.apache.commons.math.ode.DerivativeException((java.lang.Throwable) convergenceException9);
        java.lang.Throwable[] throwableArray11 = derivativeException10.getSuppressed();
        org.apache.commons.math.ConvergenceException convergenceException12 = new org.apache.commons.math.ConvergenceException("org.apache.commons.math.FunctionEvaluationException: hi!", (java.lang.Object[]) throwableArray11);
        org.apache.commons.math.MaxIterationsExceededException maxIterationsExceededException13 = new org.apache.commons.math.MaxIterationsExceededException((int) (short) -1, "hi!", (java.lang.Object[]) throwableArray11);
        org.apache.commons.math.FunctionEvaluationException functionEvaluationException14 = new org.apache.commons.math.FunctionEvaluationException((double) 32, "org.apache.commons.math.FunctionEvaluationException: org.apache.commons.math.MaxIterationsExceededException: org.apache.commons.math.ConvergenceException: ", (java.lang.Object[]) throwableArray11);
        org.apache.commons.math.MaxIterationsExceededException maxIterationsExceededException15 = new org.apache.commons.math.MaxIterationsExceededException(32, "org.apache.commons.math.ode.DerivativeException: org.apache.commons.math.FunctionEvaluationException: org.apache.commons.math.FunctionEvaluationException: org.apache.commons.math.FunctionEvaluationException: org.apache.commons.math.ConvergenceException: org.apache.commons.math.FunctionEvaluationException: hi!", (java.lang.Object[]) throwableArray11);
        org.apache.commons.math.ode.DerivativeException derivativeException16 = new org.apache.commons.math.ode.DerivativeException((java.lang.Throwable) maxIterationsExceededException15);
        org.junit.Assert.assertNotNull(throwableArray11);
    }

    @Test
    public void test16585() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest33.test16585");
        java.lang.String[] strArray14 = new java.lang.String[] { "hi!", "", "hi!", "hi!", "hi!" };
        org.apache.commons.math.ode.DerivativeException derivativeException15 = new org.apache.commons.math.ode.DerivativeException("", strArray14);
        org.apache.commons.math.MaxIterationsExceededException maxIterationsExceededException16 = new org.apache.commons.math.MaxIterationsExceededException(10, "org.apache.commons.math.FunctionEvaluationException: Evaluation failed for argument = 0", (java.lang.Object[]) strArray14);
        org.apache.commons.math.ConvergenceException convergenceException17 = new org.apache.commons.math.ConvergenceException("org.apache.commons.math.MaxIterationsExceededException: org.apache.commons.math.ConvergenceException: org.apache.commons.math.ConvergenceException: org.apache.commons.math.FunctionEvaluationException: hi!", (java.lang.Object[]) strArray14);
        org.apache.commons.math.MaxIterationsExceededException maxIterationsExceededException18 = new org.apache.commons.math.MaxIterationsExceededException((int) (byte) 10, "org.apache.commons.math.MaxIterationsExceededException: org.apache.commons.math.FunctionEvaluationException: hi!", (java.lang.Object[]) strArray14);
        org.apache.commons.math.ode.DerivativeException derivativeException19 = new org.apache.commons.math.ode.DerivativeException("org.apache.commons.math.ConvergenceException: org.apache.commons.math.FunctionEvaluationException: Maximal number of iterations (0) exceeded", strArray14);
        org.apache.commons.math.MaxIterationsExceededException maxIterationsExceededException20 = new org.apache.commons.math.MaxIterationsExceededException((int) (byte) 1, "org.apache.commons.math.ConvergenceException: org.apache.commons.math.ode.DerivativeException: Evaluation failed for argument = hi!", (java.lang.Object[]) strArray14);
        org.junit.Assert.assertNotNull(strArray14);
    }

    @Test
    public void test16586() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest33.test16586");
        java.lang.Object[] objArray10 = new java.lang.Object[] { 1L, (byte) 10, (short) 1 };
        org.apache.commons.math.FunctionEvaluationException functionEvaluationException11 = new org.apache.commons.math.FunctionEvaluationException((-1.0d), "hi!", objArray10);
        org.apache.commons.math.FunctionEvaluationException functionEvaluationException12 = new org.apache.commons.math.FunctionEvaluationException((double) 0L, "", objArray10);
        java.lang.Object[] objArray24 = new java.lang.Object[] { 1L, (byte) 10, (short) 1 };
        org.apache.commons.math.FunctionEvaluationException functionEvaluationException25 = new org.apache.commons.math.FunctionEvaluationException((-1.0d), "hi!", objArray24);
        org.apache.commons.math.FunctionEvaluationException functionEvaluationException26 = new org.apache.commons.math.FunctionEvaluationException((double) 0L, "", objArray24);
        java.lang.Object[] objArray31 = new java.lang.Object[] { "", (short) 1, "org.apache.commons.math.FunctionEvaluationException: hi!", 10.0d, 0.0f };
        java.lang.Throwable throwable33 = null;
        org.apache.commons.math.ConvergenceException convergenceException34 = new org.apache.commons.math.ConvergenceException("hi!", throwable33);
        org.apache.commons.math.ode.DerivativeException derivativeException35 = new org.apache.commons.math.ode.DerivativeException((java.lang.Throwable) convergenceException34);
        java.lang.Throwable[] throwableArray36 = derivativeException35.getSuppressed();
        org.apache.commons.math.FunctionEvaluationException functionEvaluationException37 = new org.apache.commons.math.FunctionEvaluationException((double) 100, "", objArray31, (java.lang.Throwable) derivativeException35);
        java.lang.Object[] objArray49 = new java.lang.Object[] { 1L, (byte) 10, (short) 1 };
        org.apache.commons.math.FunctionEvaluationException functionEvaluationException50 = new org.apache.commons.math.FunctionEvaluationException((-1.0d), "hi!", objArray49);
        org.apache.commons.math.FunctionEvaluationException functionEvaluationException51 = new org.apache.commons.math.FunctionEvaluationException((double) 0L, "", objArray49);
        java.lang.Object[] objArray56 = new java.lang.Object[] { "", (short) 1, "org.apache.commons.math.FunctionEvaluationException: hi!", 10.0d, 0.0f };
        java.lang.Throwable throwable58 = null;
        org.apache.commons.math.ConvergenceException convergenceException59 = new org.apache.commons.math.ConvergenceException("hi!", throwable58);
        org.apache.commons.math.ode.DerivativeException derivativeException60 = new org.apache.commons.math.ode.DerivativeException((java.lang.Throwable) convergenceException59);
        java.lang.Throwable[] throwableArray61 = derivativeException60.getSuppressed();
        org.apache.commons.math.FunctionEvaluationException functionEvaluationException62 = new org.apache.commons.math.FunctionEvaluationException((double) 100, "", objArray56, (java.lang.Throwable) derivativeException60);
        java.lang.Object[] objArray70 = new java.lang.Object[] { 1L, (byte) 10, (short) 1 };
        org.apache.commons.math.FunctionEvaluationException functionEvaluationException71 = new org.apache.commons.math.FunctionEvaluationException((-1.0d), "hi!", objArray70);
        org.apache.commons.math.FunctionEvaluationException functionEvaluationException72 = new org.apache.commons.math.FunctionEvaluationException((double) 0L, "", objArray70);
        org.apache.commons.math.ode.DerivativeException derivativeException73 = new org.apache.commons.math.ode.DerivativeException((java.lang.Throwable) functionEvaluationException72);
        org.apache.commons.math.FunctionEvaluationException functionEvaluationException74 = new org.apache.commons.math.FunctionEvaluationException((double) '#', "hi!", objArray56, (java.lang.Throwable) derivativeException73);
        org.apache.commons.math.FunctionEvaluationException functionEvaluationException75 = new org.apache.commons.math.FunctionEvaluationException((double) (byte) -1, "", objArray31, (java.lang.Throwable) functionEvaluationException74);
        double double76 = functionEvaluationException75.getArgument();
        org.apache.commons.math.FunctionEvaluationException functionEvaluationException77 = new org.apache.commons.math.FunctionEvaluationException((double) 100L, "", objArray10, (java.lang.Throwable) functionEvaluationException75);
        java.lang.Object[] objArray78 = functionEvaluationException75.getArguments();
        org.apache.commons.math.ConvergenceException convergenceException79 = new org.apache.commons.math.ConvergenceException("org.apache.commons.math.ode.DerivativeException: org.apache.commons.math.FunctionEvaluationException", objArray78);
        org.junit.Assert.assertNotNull(objArray10);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray10), "[1, 10, 1]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray10), "[1, 10, 1]");
        org.junit.Assert.assertNotNull(objArray24);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray24), "[1, 10, 1]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray24), "[1, 10, 1]");
        org.junit.Assert.assertNotNull(objArray31);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray31), "[, 1, org.apache.commons.math.FunctionEvaluationException: hi!, 10.0, 0.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray31), "[, 1, org.apache.commons.math.FunctionEvaluationException: hi!, 10.0, 0.0]");
        org.junit.Assert.assertNotNull(throwableArray36);
        org.junit.Assert.assertNotNull(objArray49);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray49), "[1, 10, 1]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray49), "[1, 10, 1]");
        org.junit.Assert.assertNotNull(objArray56);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray56), "[, 1, org.apache.commons.math.FunctionEvaluationException: hi!, 10.0, 0.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray56), "[, 1, org.apache.commons.math.FunctionEvaluationException: hi!, 10.0, 0.0]");
        org.junit.Assert.assertNotNull(throwableArray61);
        org.junit.Assert.assertNotNull(objArray70);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray70), "[1, 10, 1]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray70), "[1, 10, 1]");
        org.junit.Assert.assertTrue("'" + double76 + "' != '" + (-1.0d) + "'", double76 == (-1.0d));
        org.junit.Assert.assertNotNull(objArray78);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray78), "[, 1, org.apache.commons.math.FunctionEvaluationException: hi!, 10.0, 0.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray78), "[, 1, org.apache.commons.math.FunctionEvaluationException: hi!, 10.0, 0.0]");
    }

    @Test
    public void test16587() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest33.test16587");
        java.lang.String[] strArray11 = new java.lang.String[] { "hi!", "", "hi!", "hi!", "hi!" };
        org.apache.commons.math.ode.DerivativeException derivativeException12 = new org.apache.commons.math.ode.DerivativeException("", strArray11);
        org.apache.commons.math.ode.DerivativeException derivativeException13 = new org.apache.commons.math.ode.DerivativeException("", strArray11);
        java.lang.String[] strArray20 = new java.lang.String[] { "hi!", "", "hi!", "hi!", "hi!" };
        org.apache.commons.math.ode.DerivativeException derivativeException21 = new org.apache.commons.math.ode.DerivativeException("", strArray20);
        org.apache.commons.math.ode.DerivativeException derivativeException22 = new org.apache.commons.math.ode.DerivativeException((java.lang.Throwable) derivativeException21);
        org.apache.commons.math.ConvergenceException convergenceException23 = new org.apache.commons.math.ConvergenceException("hi!", (java.lang.Object[]) strArray11, (java.lang.Throwable) derivativeException21);
        org.apache.commons.math.ode.DerivativeException derivativeException24 = new org.apache.commons.math.ode.DerivativeException("hi!", strArray11);
        java.lang.Throwable throwable29 = null;
        org.apache.commons.math.ConvergenceException convergenceException30 = new org.apache.commons.math.ConvergenceException("hi!", throwable29);
        org.apache.commons.math.ode.DerivativeException derivativeException31 = new org.apache.commons.math.ode.DerivativeException((java.lang.Throwable) convergenceException30);
        java.lang.Throwable[] throwableArray32 = derivativeException31.getSuppressed();
        org.apache.commons.math.ConvergenceException convergenceException33 = new org.apache.commons.math.ConvergenceException("org.apache.commons.math.FunctionEvaluationException: hi!", (java.lang.Object[]) throwableArray32);
        org.apache.commons.math.FunctionEvaluationException functionEvaluationException36 = new org.apache.commons.math.FunctionEvaluationException(0.0d, "org.apache.commons.math.ConvergenceException: org.apache.commons.math.FunctionEvaluationException: hi!");
        org.apache.commons.math.FunctionEvaluationException functionEvaluationException37 = new org.apache.commons.math.FunctionEvaluationException((double) (short) 1, "org.apache.commons.math.ConvergenceException: hi!", (java.lang.Object[]) throwableArray32, (java.lang.Throwable) functionEvaluationException36);
        org.apache.commons.math.ConvergenceException convergenceException38 = new org.apache.commons.math.ConvergenceException("org.apache.commons.math.ConvergenceException: hi!", (java.lang.Object[]) strArray11, (java.lang.Throwable) functionEvaluationException37);
        java.lang.String[] strArray47 = new java.lang.String[] { "hi!", "", "hi!", "hi!", "hi!" };
        org.apache.commons.math.ode.DerivativeException derivativeException48 = new org.apache.commons.math.ode.DerivativeException("", strArray47);
        org.apache.commons.math.ode.DerivativeException derivativeException49 = new org.apache.commons.math.ode.DerivativeException("org.apache.commons.math.FunctionEvaluationException: hi!", strArray47);
        org.apache.commons.math.MaxIterationsExceededException maxIterationsExceededException52 = new org.apache.commons.math.MaxIterationsExceededException(0);
        org.apache.commons.math.ConvergenceException convergenceException53 = new org.apache.commons.math.ConvergenceException("org.apache.commons.math.ConvergenceException: org.apache.commons.math.FunctionEvaluationException: hi!", (java.lang.Throwable) maxIterationsExceededException52);
        org.apache.commons.math.ConvergenceException convergenceException54 = new org.apache.commons.math.ConvergenceException("", (java.lang.Object[]) strArray47, (java.lang.Throwable) maxIterationsExceededException52);
        org.apache.commons.math.ConvergenceException convergenceException55 = new org.apache.commons.math.ConvergenceException("org.apache.commons.math.FunctionEvaluationException: Evaluation failed for argument = 52", (java.lang.Object[]) strArray11, (java.lang.Throwable) maxIterationsExceededException52);
        int int56 = maxIterationsExceededException52.getMaxIterations();
        java.lang.Throwable[] throwableArray57 = maxIterationsExceededException52.getSuppressed();
        org.junit.Assert.assertNotNull(strArray11);
        org.junit.Assert.assertNotNull(strArray20);
        org.junit.Assert.assertNotNull(throwableArray32);
        org.junit.Assert.assertNotNull(strArray47);
        org.junit.Assert.assertTrue("'" + int56 + "' != '" + 0 + "'", int56 == 0);
        org.junit.Assert.assertNotNull(throwableArray57);
    }

    @Test
    public void test16588() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest33.test16588");
        org.apache.commons.math.FunctionEvaluationException functionEvaluationException2 = new org.apache.commons.math.FunctionEvaluationException(35.0d, "");
        double double3 = functionEvaluationException2.getArgument();
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 35.0d + "'", double3 == 35.0d);
    }

    @Test
    public void test16589() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest33.test16589");
        org.apache.commons.math.MaxIterationsExceededException maxIterationsExceededException8 = new org.apache.commons.math.MaxIterationsExceededException((int) (byte) 10);
        org.apache.commons.math.ConvergenceException convergenceException9 = new org.apache.commons.math.ConvergenceException("Evaluation failed for argument = {0}", (java.lang.Throwable) maxIterationsExceededException8);
        int int10 = maxIterationsExceededException8.getMaxIterations();
        java.lang.Object[] objArray11 = maxIterationsExceededException8.getArguments();
        org.apache.commons.math.FunctionEvaluationException functionEvaluationException12 = new org.apache.commons.math.FunctionEvaluationException((double) '4', "org.apache.commons.math.ConvergenceException: org.apache.commons.math.FunctionEvaluationException: Evaluation failed for argument = 0", objArray11);
        org.apache.commons.math.FunctionEvaluationException functionEvaluationException15 = new org.apache.commons.math.FunctionEvaluationException((double) (short) 0, "org.apache.commons.math.ode.DerivativeException: org.apache.commons.math.ConvergenceException: org.apache.commons.math.FunctionEvaluationException: hi!");
        org.apache.commons.math.FunctionEvaluationException functionEvaluationException16 = new org.apache.commons.math.FunctionEvaluationException(0.0d, "org.apache.commons.math.MaxIterationsExceededException: org.apache.commons.math.ConvergenceException: org.apache.commons.math.ConvergenceException: org.apache.commons.math.FunctionEvaluationException: hi!", objArray11, (java.lang.Throwable) functionEvaluationException15);
        org.apache.commons.math.FunctionEvaluationException functionEvaluationException17 = new org.apache.commons.math.FunctionEvaluationException((double) 0.0f, "Evaluation failed for argument = 52", (java.lang.Throwable) functionEvaluationException16);
        double double18 = functionEvaluationException16.getArgument();
        double double19 = functionEvaluationException16.getArgument();
        java.lang.String str20 = functionEvaluationException16.toString();
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 10 + "'", int10 == 10);
        org.junit.Assert.assertNotNull(objArray11);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray11), "[10]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray11), "[10]");
        org.junit.Assert.assertTrue("'" + double18 + "' != '" + 0.0d + "'", double18 == 0.0d);
        org.junit.Assert.assertTrue("'" + double19 + "' != '" + 0.0d + "'", double19 == 0.0d);
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "org.apache.commons.math.FunctionEvaluationException: org.apache.commons.math.MaxIterationsExceededException: org.apache.commons.math.ConvergenceException: org.apache.commons.math.ConvergenceException: org.apache.commons.math.FunctionEvaluationException: hi!" + "'", str20, "org.apache.commons.math.FunctionEvaluationException: org.apache.commons.math.MaxIterationsExceededException: org.apache.commons.math.ConvergenceException: org.apache.commons.math.ConvergenceException: org.apache.commons.math.FunctionEvaluationException: hi!");
    }

    @Test
    public void test16590() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest33.test16590");
        java.lang.Object[] objArray2 = null;
        java.lang.Object[] objArray14 = new java.lang.Object[] { 10L, (-1L), 10, 0.0d };
        java.lang.Throwable throwable15 = null;
        org.apache.commons.math.ConvergenceException convergenceException16 = new org.apache.commons.math.ConvergenceException("hi!", objArray14, throwable15);
        org.apache.commons.math.MaxIterationsExceededException maxIterationsExceededException17 = new org.apache.commons.math.MaxIterationsExceededException(2, "org.apache.commons.math.ode.DerivativeException: ", objArray14);
        java.lang.Throwable throwable23 = null;
        org.apache.commons.math.ConvergenceException convergenceException24 = new org.apache.commons.math.ConvergenceException("hi!", throwable23);
        org.apache.commons.math.ode.DerivativeException derivativeException25 = new org.apache.commons.math.ode.DerivativeException((java.lang.Throwable) convergenceException24);
        java.lang.Throwable[] throwableArray26 = derivativeException25.getSuppressed();
        org.apache.commons.math.ConvergenceException convergenceException27 = new org.apache.commons.math.ConvergenceException("org.apache.commons.math.FunctionEvaluationException: hi!", (java.lang.Object[]) throwableArray26);
        org.apache.commons.math.FunctionEvaluationException functionEvaluationException30 = new org.apache.commons.math.FunctionEvaluationException(0.0d, "org.apache.commons.math.ConvergenceException: org.apache.commons.math.FunctionEvaluationException: hi!");
        org.apache.commons.math.FunctionEvaluationException functionEvaluationException31 = new org.apache.commons.math.FunctionEvaluationException((double) (short) 1, "org.apache.commons.math.ConvergenceException: hi!", (java.lang.Object[]) throwableArray26, (java.lang.Throwable) functionEvaluationException30);
        org.apache.commons.math.ConvergenceException convergenceException32 = new org.apache.commons.math.ConvergenceException("org.apache.commons.math.ConvergenceException: org.apache.commons.math.FunctionEvaluationException: hi!", (java.lang.Throwable) functionEvaluationException30);
        org.apache.commons.math.FunctionEvaluationException functionEvaluationException33 = new org.apache.commons.math.FunctionEvaluationException((double) 'a', "Evaluation failed for argument = {0}", objArray14, (java.lang.Throwable) functionEvaluationException30);
        org.apache.commons.math.FunctionEvaluationException functionEvaluationException34 = new org.apache.commons.math.FunctionEvaluationException((double) ' ', "org.apache.commons.math.FunctionEvaluationException: hi!", (java.lang.Throwable) functionEvaluationException33);
        java.lang.Throwable[] throwableArray35 = functionEvaluationException33.getSuppressed();
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math.FunctionEvaluationException functionEvaluationException36 = new org.apache.commons.math.FunctionEvaluationException((double) (byte) -1, "org.apache.commons.math.FunctionEvaluationException: org.apache.commons.math.FunctionEvaluationException: org.apache.commons.math.ConvergenceException: org.apache.commons.math.FunctionEvaluationException: Evaluation failed for argument = 2", objArray2, (java.lang.Throwable) functionEvaluationException33);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(objArray14);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray14), "[10, -1, 10, 0.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray14), "[10, -1, 10, 0.0]");
        org.junit.Assert.assertNotNull(throwableArray26);
        org.junit.Assert.assertNotNull(throwableArray35);
    }

    @Test
    public void test16591() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest33.test16591");
        java.lang.String[] strArray21 = new java.lang.String[] { "hi!", "", "hi!", "hi!", "hi!" };
        org.apache.commons.math.ode.DerivativeException derivativeException22 = new org.apache.commons.math.ode.DerivativeException("", strArray21);
        org.apache.commons.math.ode.DerivativeException derivativeException23 = new org.apache.commons.math.ode.DerivativeException("", strArray21);
        java.lang.String[] strArray30 = new java.lang.String[] { "hi!", "", "hi!", "hi!", "hi!" };
        org.apache.commons.math.ode.DerivativeException derivativeException31 = new org.apache.commons.math.ode.DerivativeException("", strArray30);
        org.apache.commons.math.ode.DerivativeException derivativeException32 = new org.apache.commons.math.ode.DerivativeException((java.lang.Throwable) derivativeException31);
        org.apache.commons.math.ConvergenceException convergenceException33 = new org.apache.commons.math.ConvergenceException("hi!", (java.lang.Object[]) strArray21, (java.lang.Throwable) derivativeException31);
        org.apache.commons.math.ode.DerivativeException derivativeException34 = new org.apache.commons.math.ode.DerivativeException("hi!", strArray21);
        java.lang.Object[] objArray42 = new java.lang.Object[] { 1L, (byte) 10, (short) 1 };
        org.apache.commons.math.FunctionEvaluationException functionEvaluationException43 = new org.apache.commons.math.FunctionEvaluationException((-1.0d), "hi!", objArray42);
        java.lang.Throwable throwable44 = null;
        org.apache.commons.math.FunctionEvaluationException functionEvaluationException45 = new org.apache.commons.math.FunctionEvaluationException((double) (short) 1, "hi!", objArray42, throwable44);
        org.apache.commons.math.ConvergenceException convergenceException46 = new org.apache.commons.math.ConvergenceException("org.apache.commons.math.FunctionEvaluationException: hi!", (java.lang.Object[]) strArray21, throwable44);
        org.apache.commons.math.FunctionEvaluationException functionEvaluationException47 = new org.apache.commons.math.FunctionEvaluationException((double) 10L, "org.apache.commons.math.ConvergenceException: org.apache.commons.math.FunctionEvaluationException: hi!", (java.lang.Object[]) strArray21);
        org.apache.commons.math.ode.DerivativeException derivativeException48 = new org.apache.commons.math.ode.DerivativeException("org.apache.commons.math.ConvergenceException: org.apache.commons.math.FunctionEvaluationException: hi!", strArray21);
        org.apache.commons.math.MaxIterationsExceededException maxIterationsExceededException49 = new org.apache.commons.math.MaxIterationsExceededException((int) (byte) 1, "org.apache.commons.math.ConvergenceException: org.apache.commons.math.ConvergenceException: org.apache.commons.math.FunctionEvaluationException: hi!", (java.lang.Object[]) strArray21);
        org.apache.commons.math.ode.DerivativeException derivativeException50 = new org.apache.commons.math.ode.DerivativeException("org.apache.commons.math.FunctionEvaluationException", strArray21);
        org.apache.commons.math.ode.DerivativeException derivativeException51 = new org.apache.commons.math.ode.DerivativeException("org.apache.commons.math.ode.DerivativeException: org.apache.commons.math.ConvergenceException: hi!", strArray21);
        org.apache.commons.math.ode.DerivativeException derivativeException52 = new org.apache.commons.math.ode.DerivativeException("hi!", strArray21);
        org.apache.commons.math.ode.DerivativeException derivativeException53 = new org.apache.commons.math.ode.DerivativeException("org.apache.commons.math.MaxIterationsExceededException: org.apache.commons.math.ConvergenceException: org.apache.commons.math.ConvergenceException: org.apache.commons.math.FunctionEvaluationException: hi!", strArray21);
        org.apache.commons.math.FunctionEvaluationException functionEvaluationException56 = new org.apache.commons.math.FunctionEvaluationException((double) 52, "org.apache.commons.math.ConvergenceException: org.apache.commons.math.MaxIterationsExceededException: org.apache.commons.math.MaxIterationsExceededException: org.apache.commons.math.FunctionEvaluationException: Evaluation failed for argument = 0");
        org.apache.commons.math.ConvergenceException convergenceException57 = new org.apache.commons.math.ConvergenceException((java.lang.Throwable) functionEvaluationException56);
        org.apache.commons.math.ConvergenceException convergenceException58 = new org.apache.commons.math.ConvergenceException("org.apache.commons.math.FunctionEvaluationException: org.apache.commons.math.MaxIterationsExceededException: org.apache.commons.math.FunctionEvaluationException: Evaluation failed for argument = 0", (java.lang.Object[]) strArray21, (java.lang.Throwable) functionEvaluationException56);
        org.apache.commons.math.ode.DerivativeException derivativeException59 = new org.apache.commons.math.ode.DerivativeException("org.apache.commons.math.FunctionEvaluationException: org.apache.commons.math.ConvergenceException: org.apache.commons.math.FunctionEvaluationException: Evaluation failed for argument = 2", strArray21);
        org.junit.Assert.assertNotNull(strArray21);
        org.junit.Assert.assertNotNull(strArray30);
        org.junit.Assert.assertNotNull(objArray42);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray42), "[1, 10, 1]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray42), "[1, 10, 1]");
    }

    @Test
    public void test16592() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest33.test16592");
        java.lang.String[] strArray13 = new java.lang.String[] { "hi!", "", "hi!", "hi!", "hi!" };
        org.apache.commons.math.ode.DerivativeException derivativeException14 = new org.apache.commons.math.ode.DerivativeException("", strArray13);
        org.apache.commons.math.ode.DerivativeException derivativeException15 = new org.apache.commons.math.ode.DerivativeException("", strArray13);
        java.lang.Throwable throwable18 = null;
        org.apache.commons.math.ConvergenceException convergenceException19 = new org.apache.commons.math.ConvergenceException("hi!", throwable18);
        org.apache.commons.math.ode.DerivativeException derivativeException20 = new org.apache.commons.math.ode.DerivativeException((java.lang.Throwable) convergenceException19);
        java.lang.Throwable[] throwableArray21 = derivativeException20.getSuppressed();
        org.apache.commons.math.ConvergenceException convergenceException22 = new org.apache.commons.math.ConvergenceException("hi!", (java.lang.Throwable) derivativeException20);
        derivativeException15.addSuppressed((java.lang.Throwable) convergenceException22);
        java.lang.Throwable[] throwableArray24 = derivativeException15.getSuppressed();
        org.apache.commons.math.MaxIterationsExceededException maxIterationsExceededException25 = new org.apache.commons.math.MaxIterationsExceededException((int) ' ', "org.apache.commons.math.ConvergenceException: org.apache.commons.math.FunctionEvaluationException: hi!", (java.lang.Object[]) throwableArray24);
        org.apache.commons.math.FunctionEvaluationException functionEvaluationException27 = new org.apache.commons.math.FunctionEvaluationException(100.0d);
        org.apache.commons.math.FunctionEvaluationException functionEvaluationException28 = new org.apache.commons.math.FunctionEvaluationException((double) 97, "org.apache.commons.math.ode.DerivativeException: org.apache.commons.math.ConvergenceException: org.apache.commons.math.ConvergenceException: org.apache.commons.math.FunctionEvaluationException: hi!", (java.lang.Object[]) throwableArray24, (java.lang.Throwable) functionEvaluationException27);
        org.apache.commons.math.MaxIterationsExceededException maxIterationsExceededException30 = new org.apache.commons.math.MaxIterationsExceededException(1);
        org.apache.commons.math.ConvergenceException convergenceException31 = new org.apache.commons.math.ConvergenceException("org.apache.commons.math.FunctionEvaluationException: Evaluation failed for argument = {0}", (java.lang.Object[]) throwableArray24, (java.lang.Throwable) maxIterationsExceededException30);
        java.lang.String[] strArray48 = new java.lang.String[] { "hi!", "", "hi!", "hi!", "hi!" };
        org.apache.commons.math.ode.DerivativeException derivativeException49 = new org.apache.commons.math.ode.DerivativeException("", strArray48);
        org.apache.commons.math.ode.DerivativeException derivativeException50 = new org.apache.commons.math.ode.DerivativeException("", strArray48);
        org.apache.commons.math.ConvergenceException convergenceException51 = new org.apache.commons.math.ConvergenceException("org.apache.commons.math.FunctionEvaluationException: hi!", (java.lang.Object[]) strArray48);
        org.apache.commons.math.ConvergenceException convergenceException52 = new org.apache.commons.math.ConvergenceException("", (java.lang.Object[]) strArray48);
        org.apache.commons.math.FunctionEvaluationException functionEvaluationException53 = new org.apache.commons.math.FunctionEvaluationException((double) (-1L), "org.apache.commons.math.ConvergenceException: org.apache.commons.math.FunctionEvaluationException: hi!", (java.lang.Object[]) strArray48);
        org.apache.commons.math.MaxIterationsExceededException maxIterationsExceededException54 = new org.apache.commons.math.MaxIterationsExceededException((int) (byte) 1, "org.apache.commons.math.FunctionEvaluationException: ", (java.lang.Object[]) strArray48);
        java.lang.String[] strArray65 = new java.lang.String[] { "hi!", "", "hi!", "hi!", "hi!" };
        org.apache.commons.math.ode.DerivativeException derivativeException66 = new org.apache.commons.math.ode.DerivativeException("", strArray65);
        org.apache.commons.math.ode.DerivativeException derivativeException67 = new org.apache.commons.math.ode.DerivativeException("", strArray65);
        java.lang.Throwable throwable70 = null;
        org.apache.commons.math.ConvergenceException convergenceException71 = new org.apache.commons.math.ConvergenceException("hi!", throwable70);
        org.apache.commons.math.ode.DerivativeException derivativeException72 = new org.apache.commons.math.ode.DerivativeException((java.lang.Throwable) convergenceException71);
        java.lang.Throwable[] throwableArray73 = derivativeException72.getSuppressed();
        org.apache.commons.math.ConvergenceException convergenceException74 = new org.apache.commons.math.ConvergenceException("hi!", (java.lang.Throwable) derivativeException72);
        derivativeException67.addSuppressed((java.lang.Throwable) convergenceException74);
        org.apache.commons.math.FunctionEvaluationException functionEvaluationException76 = new org.apache.commons.math.FunctionEvaluationException((double) (short) 100, "org.apache.commons.math.ConvergenceException: hi!", (java.lang.Throwable) convergenceException74);
        org.apache.commons.math.FunctionEvaluationException functionEvaluationException77 = new org.apache.commons.math.FunctionEvaluationException((double) 1, (java.lang.Throwable) convergenceException74);
        org.apache.commons.math.FunctionEvaluationException functionEvaluationException78 = new org.apache.commons.math.FunctionEvaluationException(1.0d, "", (java.lang.Object[]) strArray48, (java.lang.Throwable) convergenceException74);
        org.apache.commons.math.FunctionEvaluationException functionEvaluationException79 = new org.apache.commons.math.FunctionEvaluationException(52.0d, (java.lang.Throwable) convergenceException74);
        convergenceException31.addSuppressed((java.lang.Throwable) functionEvaluationException79);
        java.lang.Throwable[] throwableArray81 = functionEvaluationException79.getSuppressed();
        org.apache.commons.math.ConvergenceException convergenceException82 = new org.apache.commons.math.ConvergenceException("org.apache.commons.math.MaxIterationsExceededException: org.apache.commons.math.FunctionEvaluationException: Evaluation failed for argument = 2", (java.lang.Object[]) throwableArray81);
        org.junit.Assert.assertNotNull(strArray13);
        org.junit.Assert.assertNotNull(throwableArray21);
        org.junit.Assert.assertNotNull(throwableArray24);
        org.junit.Assert.assertNotNull(strArray48);
        org.junit.Assert.assertNotNull(strArray65);
        org.junit.Assert.assertNotNull(throwableArray73);
        org.junit.Assert.assertNotNull(throwableArray81);
    }

    @Test
    public void test16593() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest33.test16593");
        org.apache.commons.math.FunctionEvaluationException functionEvaluationException5 = new org.apache.commons.math.FunctionEvaluationException(52.0d);
        org.apache.commons.math.FunctionEvaluationException functionEvaluationException6 = new org.apache.commons.math.FunctionEvaluationException((double) (byte) -1, "", (java.lang.Throwable) functionEvaluationException5);
        org.apache.commons.math.FunctionEvaluationException functionEvaluationException7 = new org.apache.commons.math.FunctionEvaluationException((double) 10.0f, "org.apache.commons.math.ConvergenceException: org.apache.commons.math.ode.DerivativeException: org.apache.commons.math.ConvergenceException: org.apache.commons.math.ode.DerivativeException: ", (java.lang.Throwable) functionEvaluationException6);
    }

    @Test
    public void test16594() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest33.test16594");
        org.apache.commons.math.FunctionEvaluationException functionEvaluationException5 = new org.apache.commons.math.FunctionEvaluationException((double) (short) -1, "org.apache.commons.math.MaxIterationsExceededException: org.apache.commons.math.FunctionEvaluationException: Evaluation failed for argument = 52");
        java.lang.Object[] objArray6 = functionEvaluationException5.getArguments();
        java.lang.String[] strArray13 = new java.lang.String[] { "org.apache.commons.math.FunctionEvaluationException: hi!" };
        org.apache.commons.math.ode.DerivativeException derivativeException14 = new org.apache.commons.math.ode.DerivativeException("hi!", strArray13);
        org.apache.commons.math.MaxIterationsExceededException maxIterationsExceededException15 = new org.apache.commons.math.MaxIterationsExceededException((int) (short) 10, "org.apache.commons.math.ode.DerivativeException: org.apache.commons.math.ConvergenceException: org.apache.commons.math.FunctionEvaluationException: hi!", (java.lang.Object[]) strArray13);
        org.apache.commons.math.FunctionEvaluationException functionEvaluationException16 = new org.apache.commons.math.FunctionEvaluationException((double) 3, "org.apache.commons.math.FunctionEvaluationException: org.apache.commons.math.ConvergenceException: hi!", (java.lang.Object[]) strArray13);
        org.apache.commons.math.ConvergenceException convergenceException17 = new org.apache.commons.math.ConvergenceException("org.apache.commons.math.ConvergenceException: org.apache.commons.math.FunctionEvaluationException: org.apache.commons.math.FunctionEvaluationException: hi!", objArray6, (java.lang.Throwable) functionEvaluationException16);
        org.apache.commons.math.MaxIterationsExceededException maxIterationsExceededException18 = new org.apache.commons.math.MaxIterationsExceededException((int) (short) 0, "org.apache.commons.math.ConvergenceException: org.apache.commons.math.MaxIterationsExceededException: Maximal number of iterations (100) exceeded", objArray6);
        org.junit.Assert.assertNotNull(objArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray6), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray6), "[]");
        org.junit.Assert.assertNotNull(strArray13);
    }

    @Test
    public void test16595() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest33.test16595");
        org.apache.commons.math.FunctionEvaluationException functionEvaluationException2 = new org.apache.commons.math.FunctionEvaluationException((double) 3, "org.apache.commons.math.MaxIterationsExceededException: org.apache.commons.math.ode.DerivativeException: ");
    }

    @Test
    public void test16596() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest33.test16596");
        org.apache.commons.math.FunctionEvaluationException functionEvaluationException2 = new org.apache.commons.math.FunctionEvaluationException((double) (short) -1, "org.apache.commons.math.ConvergenceException: org.apache.commons.math.MaxIterationsExceededException: Evaluation failed for argument = {0}");
        java.lang.Object[] objArray20 = new java.lang.Object[] { 1L, (byte) 10, (short) 1 };
        org.apache.commons.math.FunctionEvaluationException functionEvaluationException21 = new org.apache.commons.math.FunctionEvaluationException((-1.0d), "hi!", objArray20);
        org.apache.commons.math.FunctionEvaluationException functionEvaluationException22 = new org.apache.commons.math.FunctionEvaluationException((double) 0L, "", objArray20);
        java.lang.Object[] objArray27 = new java.lang.Object[] { "", (short) 1, "org.apache.commons.math.FunctionEvaluationException: hi!", 10.0d, 0.0f };
        java.lang.Throwable throwable29 = null;
        org.apache.commons.math.ConvergenceException convergenceException30 = new org.apache.commons.math.ConvergenceException("hi!", throwable29);
        org.apache.commons.math.ode.DerivativeException derivativeException31 = new org.apache.commons.math.ode.DerivativeException((java.lang.Throwable) convergenceException30);
        java.lang.Throwable[] throwableArray32 = derivativeException31.getSuppressed();
        org.apache.commons.math.FunctionEvaluationException functionEvaluationException33 = new org.apache.commons.math.FunctionEvaluationException((double) 100, "", objArray27, (java.lang.Throwable) derivativeException31);
        java.lang.Object[] objArray45 = new java.lang.Object[] { 1L, (byte) 10, (short) 1 };
        org.apache.commons.math.FunctionEvaluationException functionEvaluationException46 = new org.apache.commons.math.FunctionEvaluationException((-1.0d), "hi!", objArray45);
        org.apache.commons.math.FunctionEvaluationException functionEvaluationException47 = new org.apache.commons.math.FunctionEvaluationException((double) 0L, "", objArray45);
        java.lang.Object[] objArray52 = new java.lang.Object[] { "", (short) 1, "org.apache.commons.math.FunctionEvaluationException: hi!", 10.0d, 0.0f };
        java.lang.Throwable throwable54 = null;
        org.apache.commons.math.ConvergenceException convergenceException55 = new org.apache.commons.math.ConvergenceException("hi!", throwable54);
        org.apache.commons.math.ode.DerivativeException derivativeException56 = new org.apache.commons.math.ode.DerivativeException((java.lang.Throwable) convergenceException55);
        java.lang.Throwable[] throwableArray57 = derivativeException56.getSuppressed();
        org.apache.commons.math.FunctionEvaluationException functionEvaluationException58 = new org.apache.commons.math.FunctionEvaluationException((double) 100, "", objArray52, (java.lang.Throwable) derivativeException56);
        java.lang.Object[] objArray66 = new java.lang.Object[] { 1L, (byte) 10, (short) 1 };
        org.apache.commons.math.FunctionEvaluationException functionEvaluationException67 = new org.apache.commons.math.FunctionEvaluationException((-1.0d), "hi!", objArray66);
        org.apache.commons.math.FunctionEvaluationException functionEvaluationException68 = new org.apache.commons.math.FunctionEvaluationException((double) 0L, "", objArray66);
        org.apache.commons.math.ode.DerivativeException derivativeException69 = new org.apache.commons.math.ode.DerivativeException((java.lang.Throwable) functionEvaluationException68);
        org.apache.commons.math.FunctionEvaluationException functionEvaluationException70 = new org.apache.commons.math.FunctionEvaluationException((double) '#', "hi!", objArray52, (java.lang.Throwable) derivativeException69);
        org.apache.commons.math.FunctionEvaluationException functionEvaluationException71 = new org.apache.commons.math.FunctionEvaluationException((double) (byte) -1, "", objArray27, (java.lang.Throwable) functionEvaluationException70);
        java.lang.Throwable throwable73 = null;
        org.apache.commons.math.ConvergenceException convergenceException74 = new org.apache.commons.math.ConvergenceException("hi!", throwable73);
        java.lang.Throwable throwable77 = null;
        org.apache.commons.math.ConvergenceException convergenceException78 = new org.apache.commons.math.ConvergenceException("hi!", throwable77);
        org.apache.commons.math.ode.DerivativeException derivativeException79 = new org.apache.commons.math.ode.DerivativeException((java.lang.Throwable) convergenceException78);
        java.lang.Throwable[] throwableArray80 = derivativeException79.getSuppressed();
        org.apache.commons.math.ConvergenceException convergenceException81 = new org.apache.commons.math.ConvergenceException("org.apache.commons.math.FunctionEvaluationException: hi!", (java.lang.Object[]) throwableArray80);
        convergenceException74.addSuppressed((java.lang.Throwable) convergenceException81);
        org.apache.commons.math.FunctionEvaluationException functionEvaluationException83 = new org.apache.commons.math.FunctionEvaluationException(0.0d, "", objArray27, (java.lang.Throwable) convergenceException81);
        org.apache.commons.math.FunctionEvaluationException functionEvaluationException84 = new org.apache.commons.math.FunctionEvaluationException(100.0d, "org.apache.commons.math.MaxIterationsExceededException: org.apache.commons.math.ode.DerivativeException: ", objArray27);
        org.apache.commons.math.MaxIterationsExceededException maxIterationsExceededException85 = new org.apache.commons.math.MaxIterationsExceededException((int) (byte) 100, "org.apache.commons.math.ConvergenceException: org.apache.commons.math.MaxIterationsExceededException: org.apache.commons.math.ConvergenceException: org.apache.commons.math.ConvergenceException: org.apache.commons.math.FunctionEvaluationException: hi!", objArray27);
        int int86 = maxIterationsExceededException85.getMaxIterations();
        functionEvaluationException2.addSuppressed((java.lang.Throwable) maxIterationsExceededException85);
        double double88 = functionEvaluationException2.getArgument();
        org.junit.Assert.assertNotNull(objArray20);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray20), "[1, 10, 1]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray20), "[1, 10, 1]");
        org.junit.Assert.assertNotNull(objArray27);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray27), "[, 1, org.apache.commons.math.FunctionEvaluationException: hi!, 10.0, 0.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray27), "[, 1, org.apache.commons.math.FunctionEvaluationException: hi!, 10.0, 0.0]");
        org.junit.Assert.assertNotNull(throwableArray32);
        org.junit.Assert.assertNotNull(objArray45);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray45), "[1, 10, 1]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray45), "[1, 10, 1]");
        org.junit.Assert.assertNotNull(objArray52);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray52), "[, 1, org.apache.commons.math.FunctionEvaluationException: hi!, 10.0, 0.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray52), "[, 1, org.apache.commons.math.FunctionEvaluationException: hi!, 10.0, 0.0]");
        org.junit.Assert.assertNotNull(throwableArray57);
        org.junit.Assert.assertNotNull(objArray66);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray66), "[1, 10, 1]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray66), "[1, 10, 1]");
        org.junit.Assert.assertNotNull(throwableArray80);
        org.junit.Assert.assertTrue("'" + int86 + "' != '" + 100 + "'", int86 == 100);
        org.junit.Assert.assertTrue("'" + double88 + "' != '" + (-1.0d) + "'", double88 == (-1.0d));
    }

    @Test
    public void test16597() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest33.test16597");
        java.lang.Object[] objArray20 = new java.lang.Object[] { 1L, (byte) 10, (short) 1 };
        org.apache.commons.math.FunctionEvaluationException functionEvaluationException21 = new org.apache.commons.math.FunctionEvaluationException((-1.0d), "hi!", objArray20);
        org.apache.commons.math.FunctionEvaluationException functionEvaluationException22 = new org.apache.commons.math.FunctionEvaluationException((double) 0L, "", objArray20);
        java.lang.Object[] objArray27 = new java.lang.Object[] { "", (short) 1, "org.apache.commons.math.FunctionEvaluationException: hi!", 10.0d, 0.0f };
        java.lang.Throwable throwable29 = null;
        org.apache.commons.math.ConvergenceException convergenceException30 = new org.apache.commons.math.ConvergenceException("hi!", throwable29);
        org.apache.commons.math.ode.DerivativeException derivativeException31 = new org.apache.commons.math.ode.DerivativeException((java.lang.Throwable) convergenceException30);
        java.lang.Throwable[] throwableArray32 = derivativeException31.getSuppressed();
        org.apache.commons.math.FunctionEvaluationException functionEvaluationException33 = new org.apache.commons.math.FunctionEvaluationException((double) 100, "", objArray27, (java.lang.Throwable) derivativeException31);
        java.lang.Object[] objArray45 = new java.lang.Object[] { 1L, (byte) 10, (short) 1 };
        org.apache.commons.math.FunctionEvaluationException functionEvaluationException46 = new org.apache.commons.math.FunctionEvaluationException((-1.0d), "hi!", objArray45);
        org.apache.commons.math.FunctionEvaluationException functionEvaluationException47 = new org.apache.commons.math.FunctionEvaluationException((double) 0L, "", objArray45);
        java.lang.Object[] objArray52 = new java.lang.Object[] { "", (short) 1, "org.apache.commons.math.FunctionEvaluationException: hi!", 10.0d, 0.0f };
        java.lang.Throwable throwable54 = null;
        org.apache.commons.math.ConvergenceException convergenceException55 = new org.apache.commons.math.ConvergenceException("hi!", throwable54);
        org.apache.commons.math.ode.DerivativeException derivativeException56 = new org.apache.commons.math.ode.DerivativeException((java.lang.Throwable) convergenceException55);
        java.lang.Throwable[] throwableArray57 = derivativeException56.getSuppressed();
        org.apache.commons.math.FunctionEvaluationException functionEvaluationException58 = new org.apache.commons.math.FunctionEvaluationException((double) 100, "", objArray52, (java.lang.Throwable) derivativeException56);
        java.lang.Object[] objArray66 = new java.lang.Object[] { 1L, (byte) 10, (short) 1 };
        org.apache.commons.math.FunctionEvaluationException functionEvaluationException67 = new org.apache.commons.math.FunctionEvaluationException((-1.0d), "hi!", objArray66);
        org.apache.commons.math.FunctionEvaluationException functionEvaluationException68 = new org.apache.commons.math.FunctionEvaluationException((double) 0L, "", objArray66);
        org.apache.commons.math.ode.DerivativeException derivativeException69 = new org.apache.commons.math.ode.DerivativeException((java.lang.Throwable) functionEvaluationException68);
        org.apache.commons.math.FunctionEvaluationException functionEvaluationException70 = new org.apache.commons.math.FunctionEvaluationException((double) '#', "hi!", objArray52, (java.lang.Throwable) derivativeException69);
        org.apache.commons.math.FunctionEvaluationException functionEvaluationException71 = new org.apache.commons.math.FunctionEvaluationException((double) (byte) -1, "", objArray27, (java.lang.Throwable) functionEvaluationException70);
        org.apache.commons.math.FunctionEvaluationException functionEvaluationException72 = new org.apache.commons.math.FunctionEvaluationException(10.0d, "hi!", objArray27);
        java.lang.Throwable throwable74 = null;
        org.apache.commons.math.ConvergenceException convergenceException75 = new org.apache.commons.math.ConvergenceException("hi!", throwable74);
        org.apache.commons.math.FunctionEvaluationException functionEvaluationException76 = new org.apache.commons.math.FunctionEvaluationException((double) 100.0f, "org.apache.commons.math.FunctionEvaluationException: hi!", objArray27, (java.lang.Throwable) convergenceException75);
        java.lang.Throwable throwable78 = null;
        org.apache.commons.math.ConvergenceException convergenceException79 = new org.apache.commons.math.ConvergenceException("hi!", throwable78);
        java.lang.Throwable throwable82 = null;
        org.apache.commons.math.ConvergenceException convergenceException83 = new org.apache.commons.math.ConvergenceException("hi!", throwable82);
        org.apache.commons.math.ode.DerivativeException derivativeException84 = new org.apache.commons.math.ode.DerivativeException((java.lang.Throwable) convergenceException83);
        java.lang.Throwable[] throwableArray85 = derivativeException84.getSuppressed();
        org.apache.commons.math.ConvergenceException convergenceException86 = new org.apache.commons.math.ConvergenceException("org.apache.commons.math.FunctionEvaluationException: hi!", (java.lang.Object[]) throwableArray85);
        convergenceException79.addSuppressed((java.lang.Throwable) convergenceException86);
        org.apache.commons.math.ConvergenceException convergenceException88 = new org.apache.commons.math.ConvergenceException("org.apache.commons.math.FunctionEvaluationException: hi!", objArray27, (java.lang.Throwable) convergenceException86);
        org.apache.commons.math.ConvergenceException convergenceException89 = new org.apache.commons.math.ConvergenceException((java.lang.Throwable) convergenceException86);
        org.apache.commons.math.FunctionEvaluationException functionEvaluationException90 = new org.apache.commons.math.FunctionEvaluationException(52.0d, (java.lang.Throwable) convergenceException86);
        org.apache.commons.math.FunctionEvaluationException functionEvaluationException91 = new org.apache.commons.math.FunctionEvaluationException((double) '4', "org.apache.commons.math.ConvergenceException: org.apache.commons.math.MaxIterationsExceededException: org.apache.commons.math.ConvergenceException: org.apache.commons.math.FunctionEvaluationException: Evaluation failed for argument = 0", (java.lang.Throwable) convergenceException86);
        org.apache.commons.math.ConvergenceException convergenceException92 = new org.apache.commons.math.ConvergenceException("org.apache.commons.math.FunctionEvaluationException: org.apache.commons.math.FunctionEvaluationException: org.apache.commons.math.ConvergenceException: org.apache.commons.math.FunctionEvaluationException: hi!", (java.lang.Throwable) functionEvaluationException91);
        org.junit.Assert.assertNotNull(objArray20);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray20), "[1, 10, 1]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray20), "[1, 10, 1]");
        org.junit.Assert.assertNotNull(objArray27);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray27), "[, 1, org.apache.commons.math.FunctionEvaluationException: hi!, 10.0, 0.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray27), "[, 1, org.apache.commons.math.FunctionEvaluationException: hi!, 10.0, 0.0]");
        org.junit.Assert.assertNotNull(throwableArray32);
        org.junit.Assert.assertNotNull(objArray45);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray45), "[1, 10, 1]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray45), "[1, 10, 1]");
        org.junit.Assert.assertNotNull(objArray52);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray52), "[, 1, org.apache.commons.math.FunctionEvaluationException: hi!, 10.0, 0.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray52), "[, 1, org.apache.commons.math.FunctionEvaluationException: hi!, 10.0, 0.0]");
        org.junit.Assert.assertNotNull(throwableArray57);
        org.junit.Assert.assertNotNull(objArray66);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray66), "[1, 10, 1]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray66), "[1, 10, 1]");
        org.junit.Assert.assertNotNull(throwableArray85);
    }

    @Test
    public void test16598() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest33.test16598");
        java.lang.Throwable throwable4 = null;
        org.apache.commons.math.ConvergenceException convergenceException5 = new org.apache.commons.math.ConvergenceException("org.apache.commons.math.FunctionEvaluationException: org.apache.commons.math.ConvergenceException: hi!", throwable4);
        org.apache.commons.math.ConvergenceException convergenceException6 = new org.apache.commons.math.ConvergenceException((java.lang.Throwable) convergenceException5);
        org.apache.commons.math.ConvergenceException convergenceException7 = new org.apache.commons.math.ConvergenceException((java.lang.Throwable) convergenceException6);
        org.apache.commons.math.FunctionEvaluationException functionEvaluationException8 = new org.apache.commons.math.FunctionEvaluationException(0.0d, (java.lang.Throwable) convergenceException7);
        java.lang.Object[] objArray9 = functionEvaluationException8.getArguments();
        org.apache.commons.math.ConvergenceException convergenceException10 = new org.apache.commons.math.ConvergenceException("org.apache.commons.math.ode.DerivativeException: org.apache.commons.math.ode.DerivativeException: org.apache.commons.math.ConvergenceException: hi!", (java.lang.Throwable) functionEvaluationException8);
        org.apache.commons.math.ConvergenceException convergenceException11 = new org.apache.commons.math.ConvergenceException("org.apache.commons.math.FunctionEvaluationException: Evaluation failed for argument = 35", (java.lang.Throwable) functionEvaluationException8);
        java.lang.Object[] objArray12 = functionEvaluationException8.getArguments();
        org.junit.Assert.assertNotNull(objArray9);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray9), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray9), "[]");
        org.junit.Assert.assertNotNull(objArray12);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray12), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray12), "[]");
    }

    @Test
    public void test16599() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest33.test16599");
        org.apache.commons.math.FunctionEvaluationException functionEvaluationException3 = new org.apache.commons.math.FunctionEvaluationException((double) 1, "org.apache.commons.math.FunctionEvaluationException: org.apache.commons.math.FunctionEvaluationException: ");
        org.apache.commons.math.ConvergenceException convergenceException4 = new org.apache.commons.math.ConvergenceException("org.apache.commons.math.FunctionEvaluationException: org.apache.commons.math.FunctionEvaluationException: org.apache.commons.math.ConvergenceException: org.apache.commons.math.FunctionEvaluationException: org.apache.commons.math.FunctionEvaluationException: Evaluation failed for argument = 2", (java.lang.Throwable) functionEvaluationException3);
    }

    @Test
    public void test16600() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest33.test16600");
        org.apache.commons.math.FunctionEvaluationException functionEvaluationException6 = new org.apache.commons.math.FunctionEvaluationException((double) 0L, "org.apache.commons.math.FunctionEvaluationException: hi!");
        java.lang.Throwable[] throwableArray7 = functionEvaluationException6.getSuppressed();
        org.apache.commons.math.FunctionEvaluationException functionEvaluationException10 = new org.apache.commons.math.FunctionEvaluationException((double) 'a', "Evaluation failed for argument = {0}");
        org.apache.commons.math.ConvergenceException convergenceException11 = new org.apache.commons.math.ConvergenceException("org.apache.commons.math.ode.DerivativeException: ", (java.lang.Object[]) throwableArray7, (java.lang.Throwable) functionEvaluationException10);
        org.apache.commons.math.ConvergenceException convergenceException12 = new org.apache.commons.math.ConvergenceException("org.apache.commons.math.ConvergenceException: org.apache.commons.math.ode.DerivativeException: ", (java.lang.Object[]) throwableArray7);
        org.apache.commons.math.MaxIterationsExceededException maxIterationsExceededException19 = new org.apache.commons.math.MaxIterationsExceededException(0);
        java.lang.Throwable[] throwableArray20 = maxIterationsExceededException19.getSuppressed();
        org.apache.commons.math.FunctionEvaluationException functionEvaluationException21 = new org.apache.commons.math.FunctionEvaluationException((double) (short) 0, "Evaluation failed for argument = {0}", (java.lang.Object[]) throwableArray20);
        org.apache.commons.math.FunctionEvaluationException functionEvaluationException26 = new org.apache.commons.math.FunctionEvaluationException((double) (short) -1);
        org.apache.commons.math.FunctionEvaluationException functionEvaluationException27 = new org.apache.commons.math.FunctionEvaluationException((double) (byte) 100, "org.apache.commons.math.ConvergenceException: org.apache.commons.math.FunctionEvaluationException: hi!", (java.lang.Throwable) functionEvaluationException26);
        org.apache.commons.math.FunctionEvaluationException functionEvaluationException28 = new org.apache.commons.math.FunctionEvaluationException((double) (-1.0f), (java.lang.Throwable) functionEvaluationException27);
        java.lang.Throwable[] throwableArray29 = functionEvaluationException27.getSuppressed();
        org.apache.commons.math.ConvergenceException convergenceException30 = new org.apache.commons.math.ConvergenceException("org.apache.commons.math.ConvergenceException: org.apache.commons.math.FunctionEvaluationException", (java.lang.Object[]) throwableArray20, (java.lang.Throwable) functionEvaluationException27);
        org.apache.commons.math.FunctionEvaluationException functionEvaluationException31 = new org.apache.commons.math.FunctionEvaluationException(10.0d, "org.apache.commons.math.ode.DerivativeException: org.apache.commons.math.ConvergenceException: ", (java.lang.Throwable) functionEvaluationException27);
        org.apache.commons.math.FunctionEvaluationException functionEvaluationException32 = new org.apache.commons.math.FunctionEvaluationException(1.0d, "org.apache.commons.math.FunctionEvaluationException: org.apache.commons.math.FunctionEvaluationException: org.apache.commons.math.ConvergenceException: org.apache.commons.math.FunctionEvaluationException: ", (java.lang.Object[]) throwableArray7, (java.lang.Throwable) functionEvaluationException31);
        org.junit.Assert.assertNotNull(throwableArray7);
        org.junit.Assert.assertNotNull(throwableArray20);
        org.junit.Assert.assertNotNull(throwableArray29);
    }

    @Test
    public void test16601() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest33.test16601");
        java.lang.String[] strArray6 = new java.lang.String[] { "org.apache.commons.math.FunctionEvaluationException: hi!" };
        org.apache.commons.math.ode.DerivativeException derivativeException7 = new org.apache.commons.math.ode.DerivativeException("hi!", strArray6);
        org.apache.commons.math.FunctionEvaluationException functionEvaluationException10 = new org.apache.commons.math.FunctionEvaluationException((double) (-1.0f), "");
        org.apache.commons.math.ConvergenceException convergenceException11 = new org.apache.commons.math.ConvergenceException("org.apache.commons.math.FunctionEvaluationException: hi!", (java.lang.Object[]) strArray6, (java.lang.Throwable) functionEvaluationException10);
        java.lang.Throwable throwable14 = null;
        org.apache.commons.math.ConvergenceException convergenceException15 = new org.apache.commons.math.ConvergenceException("hi!", throwable14);
        org.apache.commons.math.ode.DerivativeException derivativeException16 = new org.apache.commons.math.ode.DerivativeException((java.lang.Throwable) convergenceException15);
        java.lang.Throwable[] throwableArray17 = derivativeException16.getSuppressed();
        org.apache.commons.math.ConvergenceException convergenceException18 = new org.apache.commons.math.ConvergenceException("org.apache.commons.math.ConvergenceException: org.apache.commons.math.FunctionEvaluationException: hi!", (java.lang.Throwable) derivativeException16);
        java.lang.String[] strArray22 = new java.lang.String[] { "org.apache.commons.math.FunctionEvaluationException: hi!" };
        org.apache.commons.math.ode.DerivativeException derivativeException23 = new org.apache.commons.math.ode.DerivativeException("hi!", strArray22);
        org.apache.commons.math.FunctionEvaluationException functionEvaluationException26 = new org.apache.commons.math.FunctionEvaluationException((double) (-1.0f), "");
        org.apache.commons.math.ConvergenceException convergenceException27 = new org.apache.commons.math.ConvergenceException("org.apache.commons.math.FunctionEvaluationException: hi!", (java.lang.Object[]) strArray22, (java.lang.Throwable) functionEvaluationException26);
        derivativeException16.addSuppressed((java.lang.Throwable) functionEvaluationException26);
        org.apache.commons.math.ConvergenceException convergenceException29 = new org.apache.commons.math.ConvergenceException("Evaluation failed for argument = {0}", (java.lang.Object[]) strArray6, (java.lang.Throwable) functionEvaluationException26);
        org.apache.commons.math.FunctionEvaluationException functionEvaluationException30 = new org.apache.commons.math.FunctionEvaluationException((double) 100, "org.apache.commons.math.ode.DerivativeException: hi!", (java.lang.Object[]) strArray6);
        double double31 = functionEvaluationException30.getArgument();
        java.lang.Object[] objArray32 = functionEvaluationException30.getArguments();
        double double33 = functionEvaluationException30.getArgument();
        org.junit.Assert.assertNotNull(strArray6);
        org.junit.Assert.assertNotNull(throwableArray17);
        org.junit.Assert.assertNotNull(strArray22);
        org.junit.Assert.assertTrue("'" + double31 + "' != '" + 100.0d + "'", double31 == 100.0d);
        org.junit.Assert.assertNotNull(objArray32);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray32), "[org.apache.commons.math.FunctionEvaluationException: hi!]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray32), "[org.apache.commons.math.FunctionEvaluationException: hi!]");
        org.junit.Assert.assertTrue("'" + double33 + "' != '" + 100.0d + "'", double33 == 100.0d);
    }

    @Test
    public void test16602() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest33.test16602");
        java.lang.String[] strArray18 = new java.lang.String[] { "org.apache.commons.math.FunctionEvaluationException: hi!" };
        org.apache.commons.math.ode.DerivativeException derivativeException19 = new org.apache.commons.math.ode.DerivativeException("hi!", strArray18);
        java.lang.String[] strArray28 = new java.lang.String[] { "hi!", "", "hi!", "hi!", "hi!" };
        org.apache.commons.math.ode.DerivativeException derivativeException29 = new org.apache.commons.math.ode.DerivativeException("", strArray28);
        org.apache.commons.math.ode.DerivativeException derivativeException30 = new org.apache.commons.math.ode.DerivativeException("", strArray28);
        java.lang.String[] strArray37 = new java.lang.String[] { "hi!", "", "hi!", "hi!", "hi!" };
        org.apache.commons.math.ode.DerivativeException derivativeException38 = new org.apache.commons.math.ode.DerivativeException("", strArray37);
        org.apache.commons.math.ode.DerivativeException derivativeException39 = new org.apache.commons.math.ode.DerivativeException((java.lang.Throwable) derivativeException38);
        org.apache.commons.math.ConvergenceException convergenceException40 = new org.apache.commons.math.ConvergenceException("hi!", (java.lang.Object[]) strArray28, (java.lang.Throwable) derivativeException38);
        java.lang.Object[] objArray41 = derivativeException38.getArguments();
        org.apache.commons.math.ConvergenceException convergenceException42 = new org.apache.commons.math.ConvergenceException("org.apache.commons.math.FunctionEvaluationException: hi!", (java.lang.Object[]) strArray18, (java.lang.Throwable) derivativeException38);
        org.apache.commons.math.MaxIterationsExceededException maxIterationsExceededException43 = new org.apache.commons.math.MaxIterationsExceededException((int) (short) 0, "org.apache.commons.math.FunctionEvaluationException: org.apache.commons.math.ConvergenceException: hi!", (java.lang.Object[]) strArray18);
        java.lang.String[] strArray53 = new java.lang.String[] { "Evaluation failed for argument = {0}", "Evaluation failed for argument = {0}", "Evaluation failed for argument = {0}", "", "", "org.apache.commons.math.ConvergenceException: org.apache.commons.math.FunctionEvaluationException: hi!" };
        org.apache.commons.math.ode.DerivativeException derivativeException54 = new org.apache.commons.math.ode.DerivativeException("Evaluation failed for argument = {0}", strArray53);
        org.apache.commons.math.FunctionEvaluationException functionEvaluationException55 = new org.apache.commons.math.FunctionEvaluationException((double) 3, "", (java.lang.Throwable) derivativeException54);
        org.apache.commons.math.FunctionEvaluationException functionEvaluationException56 = new org.apache.commons.math.FunctionEvaluationException((double) 100L, "org.apache.commons.math.ode.DerivativeException: org.apache.commons.math.ConvergenceException: org.apache.commons.math.FunctionEvaluationException: hi!", (java.lang.Object[]) strArray18, (java.lang.Throwable) functionEvaluationException55);
        org.apache.commons.math.MaxIterationsExceededException maxIterationsExceededException57 = new org.apache.commons.math.MaxIterationsExceededException((int) 'a', "org.apache.commons.math.FunctionEvaluationException: org.apache.commons.math.ConvergenceException: hi!", (java.lang.Object[]) strArray18);
        org.apache.commons.math.ode.DerivativeException derivativeException58 = new org.apache.commons.math.ode.DerivativeException("org.apache.commons.math.FunctionEvaluationException: org.apache.commons.math.ode.DerivativeException: ", strArray18);
        java.lang.Object[] objArray66 = new java.lang.Object[] { 1L, (byte) 10, (short) 1 };
        org.apache.commons.math.FunctionEvaluationException functionEvaluationException67 = new org.apache.commons.math.FunctionEvaluationException((-1.0d), "hi!", objArray66);
        java.lang.Throwable throwable68 = null;
        org.apache.commons.math.FunctionEvaluationException functionEvaluationException69 = new org.apache.commons.math.FunctionEvaluationException((double) (short) 1, "hi!", objArray66, throwable68);
        java.lang.String str70 = functionEvaluationException69.getPattern();
        java.lang.Throwable[] throwableArray71 = functionEvaluationException69.getSuppressed();
        org.apache.commons.math.FunctionEvaluationException functionEvaluationException72 = new org.apache.commons.math.FunctionEvaluationException((double) (-1L), "Evaluation failed for argument = {0}", (java.lang.Object[]) strArray18, (java.lang.Throwable) functionEvaluationException69);
        java.lang.Object[] objArray73 = functionEvaluationException69.getArguments();
        org.apache.commons.math.MaxIterationsExceededException maxIterationsExceededException74 = new org.apache.commons.math.MaxIterationsExceededException(100, "org.apache.commons.math.FunctionEvaluationException: org.apache.commons.math.ConvergenceException: org.apache.commons.math.ConvergenceException: org.apache.commons.math.ConvergenceException: org.apache.commons.math.ConvergenceException: org.apache.commons.math.FunctionEvaluationException: hi!", objArray73);
        org.apache.commons.math.FunctionEvaluationException functionEvaluationException75 = new org.apache.commons.math.FunctionEvaluationException(0.0d, "org.apache.commons.math.ConvergenceException: org.apache.commons.math.ConvergenceException: org.apache.commons.math.ConvergenceException: Maximal number of iterations (10) exceeded", objArray73);
        org.apache.commons.math.MaxIterationsExceededException maxIterationsExceededException76 = new org.apache.commons.math.MaxIterationsExceededException((int) '#', "org.apache.commons.math.ode.DerivativeException: org.apache.commons.math.ode.DerivativeException: org.apache.commons.math.ConvergenceException: org.apache.commons.math.ode.DerivativeException: ", objArray73);
        org.junit.Assert.assertNotNull(strArray18);
        org.junit.Assert.assertNotNull(strArray28);
        org.junit.Assert.assertNotNull(strArray37);
        org.junit.Assert.assertNotNull(objArray41);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray41), "[hi!, , hi!, hi!, hi!]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray41), "[hi!, , hi!, hi!, hi!]");
        org.junit.Assert.assertNotNull(strArray53);
        org.junit.Assert.assertNotNull(objArray66);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray66), "[1, 10, 1]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray66), "[1, 10, 1]");
        org.junit.Assert.assertEquals("'" + str70 + "' != '" + "hi!" + "'", str70, "hi!");
        org.junit.Assert.assertNotNull(throwableArray71);
        org.junit.Assert.assertNotNull(objArray73);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray73), "[1, 10, 1]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray73), "[1, 10, 1]");
    }

    @Test
    public void test16603() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest33.test16603");
        java.lang.Object[] objArray9 = new java.lang.Object[] { 10L, (-1L), 10, 0.0d };
        java.lang.Throwable throwable10 = null;
        org.apache.commons.math.ConvergenceException convergenceException11 = new org.apache.commons.math.ConvergenceException("hi!", objArray9, throwable10);
        java.lang.Throwable[] throwableArray12 = convergenceException11.getSuppressed();
        org.apache.commons.math.ConvergenceException convergenceException13 = new org.apache.commons.math.ConvergenceException((java.lang.Throwable) convergenceException11);
        java.lang.Throwable[] throwableArray14 = convergenceException13.getSuppressed();
        org.apache.commons.math.MaxIterationsExceededException maxIterationsExceededException15 = new org.apache.commons.math.MaxIterationsExceededException(1, "org.apache.commons.math.ConvergenceException: org.apache.commons.math.FunctionEvaluationException: org.apache.commons.math.ode.DerivativeException: ", (java.lang.Object[]) throwableArray14);
        java.lang.Object[] objArray24 = new java.lang.Object[] { 1L, (byte) 10, (short) 1 };
        org.apache.commons.math.FunctionEvaluationException functionEvaluationException25 = new org.apache.commons.math.FunctionEvaluationException((-1.0d), "hi!", objArray24);
        org.apache.commons.math.FunctionEvaluationException functionEvaluationException26 = new org.apache.commons.math.FunctionEvaluationException((double) 0L, "", objArray24);
        java.lang.String str27 = functionEvaluationException26.getPattern();
        org.apache.commons.math.ConvergenceException convergenceException28 = new org.apache.commons.math.ConvergenceException("org.apache.commons.math.FunctionEvaluationException: hi!", (java.lang.Throwable) functionEvaluationException26);
        org.apache.commons.math.FunctionEvaluationException functionEvaluationException29 = new org.apache.commons.math.FunctionEvaluationException(0.0d, "org.apache.commons.math.ConvergenceException: org.apache.commons.math.FunctionEvaluationException: hi!", (java.lang.Object[]) throwableArray14, (java.lang.Throwable) functionEvaluationException26);
        org.apache.commons.math.ConvergenceException convergenceException30 = new org.apache.commons.math.ConvergenceException((java.lang.Throwable) functionEvaluationException29);
        org.junit.Assert.assertNotNull(objArray9);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray9), "[10, -1, 10, 0.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray9), "[10, -1, 10, 0.0]");
        org.junit.Assert.assertNotNull(throwableArray12);
        org.junit.Assert.assertNotNull(throwableArray14);
        org.junit.Assert.assertNotNull(objArray24);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray24), "[1, 10, 1]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray24), "[1, 10, 1]");
        org.junit.Assert.assertEquals("'" + str27 + "' != '" + "" + "'", str27, "");
    }

    @Test
    public void test16604() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest33.test16604");
        java.lang.String[] strArray20 = new java.lang.String[] { "org.apache.commons.math.FunctionEvaluationException: hi!" };
        org.apache.commons.math.ode.DerivativeException derivativeException21 = new org.apache.commons.math.ode.DerivativeException("hi!", strArray20);
        java.lang.String[] strArray30 = new java.lang.String[] { "hi!", "", "hi!", "hi!", "hi!" };
        org.apache.commons.math.ode.DerivativeException derivativeException31 = new org.apache.commons.math.ode.DerivativeException("", strArray30);
        org.apache.commons.math.ode.DerivativeException derivativeException32 = new org.apache.commons.math.ode.DerivativeException("", strArray30);
        java.lang.String[] strArray39 = new java.lang.String[] { "hi!", "", "hi!", "hi!", "hi!" };
        org.apache.commons.math.ode.DerivativeException derivativeException40 = new org.apache.commons.math.ode.DerivativeException("", strArray39);
        org.apache.commons.math.ode.DerivativeException derivativeException41 = new org.apache.commons.math.ode.DerivativeException((java.lang.Throwable) derivativeException40);
        org.apache.commons.math.ConvergenceException convergenceException42 = new org.apache.commons.math.ConvergenceException("hi!", (java.lang.Object[]) strArray30, (java.lang.Throwable) derivativeException40);
        java.lang.Object[] objArray43 = derivativeException40.getArguments();
        org.apache.commons.math.ConvergenceException convergenceException44 = new org.apache.commons.math.ConvergenceException("org.apache.commons.math.FunctionEvaluationException: hi!", (java.lang.Object[]) strArray20, (java.lang.Throwable) derivativeException40);
        org.apache.commons.math.MaxIterationsExceededException maxIterationsExceededException45 = new org.apache.commons.math.MaxIterationsExceededException((int) (short) 0, "org.apache.commons.math.FunctionEvaluationException: org.apache.commons.math.ConvergenceException: hi!", (java.lang.Object[]) strArray20);
        java.lang.String[] strArray55 = new java.lang.String[] { "Evaluation failed for argument = {0}", "Evaluation failed for argument = {0}", "Evaluation failed for argument = {0}", "", "", "org.apache.commons.math.ConvergenceException: org.apache.commons.math.FunctionEvaluationException: hi!" };
        org.apache.commons.math.ode.DerivativeException derivativeException56 = new org.apache.commons.math.ode.DerivativeException("Evaluation failed for argument = {0}", strArray55);
        org.apache.commons.math.FunctionEvaluationException functionEvaluationException57 = new org.apache.commons.math.FunctionEvaluationException((double) 3, "", (java.lang.Throwable) derivativeException56);
        org.apache.commons.math.FunctionEvaluationException functionEvaluationException58 = new org.apache.commons.math.FunctionEvaluationException((double) 100L, "org.apache.commons.math.ode.DerivativeException: org.apache.commons.math.ConvergenceException: org.apache.commons.math.FunctionEvaluationException: hi!", (java.lang.Object[]) strArray20, (java.lang.Throwable) functionEvaluationException57);
        org.apache.commons.math.MaxIterationsExceededException maxIterationsExceededException59 = new org.apache.commons.math.MaxIterationsExceededException((int) 'a', "org.apache.commons.math.FunctionEvaluationException: org.apache.commons.math.ConvergenceException: hi!", (java.lang.Object[]) strArray20);
        org.apache.commons.math.ode.DerivativeException derivativeException60 = new org.apache.commons.math.ode.DerivativeException("org.apache.commons.math.FunctionEvaluationException: org.apache.commons.math.ode.DerivativeException: ", strArray20);
        java.lang.Object[] objArray68 = new java.lang.Object[] { 1L, (byte) 10, (short) 1 };
        org.apache.commons.math.FunctionEvaluationException functionEvaluationException69 = new org.apache.commons.math.FunctionEvaluationException((-1.0d), "hi!", objArray68);
        java.lang.Throwable throwable70 = null;
        org.apache.commons.math.FunctionEvaluationException functionEvaluationException71 = new org.apache.commons.math.FunctionEvaluationException((double) (short) 1, "hi!", objArray68, throwable70);
        java.lang.String str72 = functionEvaluationException71.getPattern();
        java.lang.Throwable[] throwableArray73 = functionEvaluationException71.getSuppressed();
        org.apache.commons.math.FunctionEvaluationException functionEvaluationException74 = new org.apache.commons.math.FunctionEvaluationException((double) (-1L), "Evaluation failed for argument = {0}", (java.lang.Object[]) strArray20, (java.lang.Throwable) functionEvaluationException71);
        java.lang.Object[] objArray75 = functionEvaluationException71.getArguments();
        org.apache.commons.math.MaxIterationsExceededException maxIterationsExceededException76 = new org.apache.commons.math.MaxIterationsExceededException(100, "org.apache.commons.math.FunctionEvaluationException: org.apache.commons.math.ConvergenceException: org.apache.commons.math.ConvergenceException: org.apache.commons.math.ConvergenceException: org.apache.commons.math.ConvergenceException: org.apache.commons.math.FunctionEvaluationException: hi!", objArray75);
        java.lang.Throwable throwable77 = null;
        org.apache.commons.math.FunctionEvaluationException functionEvaluationException78 = new org.apache.commons.math.FunctionEvaluationException((double) (byte) 1, "org.apache.commons.math.ode.DerivativeException: org.apache.commons.math.ConvergenceException: org.apache.commons.math.ode.DerivativeException: ", objArray75, throwable77);
        org.apache.commons.math.FunctionEvaluationException functionEvaluationException79 = new org.apache.commons.math.FunctionEvaluationException((double) 1L, "hi!", objArray75);
        org.apache.commons.math.FunctionEvaluationException functionEvaluationException80 = new org.apache.commons.math.FunctionEvaluationException((double) 0L, "org.apache.commons.math.FunctionEvaluationException: org.apache.commons.math.ode.DerivativeException: Evaluation failed for argument = hi!", objArray75);
        org.junit.Assert.assertNotNull(strArray20);
        org.junit.Assert.assertNotNull(strArray30);
        org.junit.Assert.assertNotNull(strArray39);
        org.junit.Assert.assertNotNull(objArray43);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray43), "[hi!, , hi!, hi!, hi!]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray43), "[hi!, , hi!, hi!, hi!]");
        org.junit.Assert.assertNotNull(strArray55);
        org.junit.Assert.assertNotNull(objArray68);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray68), "[1, 10, 1]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray68), "[1, 10, 1]");
        org.junit.Assert.assertEquals("'" + str72 + "' != '" + "hi!" + "'", str72, "hi!");
        org.junit.Assert.assertNotNull(throwableArray73);
        org.junit.Assert.assertNotNull(objArray75);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray75), "[1, 10, 1]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray75), "[1, 10, 1]");
    }

    @Test
    public void test16605() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest33.test16605");
        org.apache.commons.math.MaxIterationsExceededException maxIterationsExceededException7 = new org.apache.commons.math.MaxIterationsExceededException(0);
        java.lang.Throwable[] throwableArray8 = maxIterationsExceededException7.getSuppressed();
        org.apache.commons.math.ConvergenceException convergenceException9 = new org.apache.commons.math.ConvergenceException("org.apache.commons.math.ConvergenceException: org.apache.commons.math.FunctionEvaluationException: hi!", (java.lang.Object[]) throwableArray8);
        org.apache.commons.math.MaxIterationsExceededException maxIterationsExceededException10 = new org.apache.commons.math.MaxIterationsExceededException(2, "Evaluation failed for argument = {0}", (java.lang.Object[]) throwableArray8);
        org.apache.commons.math.FunctionEvaluationException functionEvaluationException11 = new org.apache.commons.math.FunctionEvaluationException((double) (-1L), (java.lang.Throwable) maxIterationsExceededException10);
        java.lang.Object[] objArray12 = maxIterationsExceededException10.getArguments();
        int int13 = maxIterationsExceededException10.getMaxIterations();
        java.lang.Throwable[] throwableArray14 = maxIterationsExceededException10.getSuppressed();
        org.apache.commons.math.FunctionEvaluationException functionEvaluationException21 = new org.apache.commons.math.FunctionEvaluationException((double) '4');
        java.lang.String str22 = functionEvaluationException21.getPattern();
        java.lang.Object[] objArray23 = functionEvaluationException21.getArguments();
        org.apache.commons.math.MaxIterationsExceededException maxIterationsExceededException24 = new org.apache.commons.math.MaxIterationsExceededException(2, "org.apache.commons.math.ConvergenceException: org.apache.commons.math.FunctionEvaluationException: hi!", objArray23);
        int int25 = maxIterationsExceededException24.getMaxIterations();
        int int26 = maxIterationsExceededException24.getMaxIterations();
        org.apache.commons.math.ConvergenceException convergenceException27 = new org.apache.commons.math.ConvergenceException("org.apache.commons.math.ode.DerivativeException: org.apache.commons.math.FunctionEvaluationException: org.apache.commons.math.ode.DerivativeException: ", (java.lang.Throwable) maxIterationsExceededException24);
        org.apache.commons.math.FunctionEvaluationException functionEvaluationException28 = new org.apache.commons.math.FunctionEvaluationException((double) (short) 100, "org.apache.commons.math.FunctionEvaluationException: org.apache.commons.math.FunctionEvaluationException: ", (java.lang.Throwable) convergenceException27);
        org.apache.commons.math.FunctionEvaluationException functionEvaluationException29 = new org.apache.commons.math.FunctionEvaluationException((double) (byte) 10, "org.apache.commons.math.ConvergenceException: org.apache.commons.math.FunctionEvaluationException: org.apache.commons.math.MaxIterationsExceededException: org.apache.commons.math.ode.DerivativeException: ", (java.lang.Object[]) throwableArray14, (java.lang.Throwable) functionEvaluationException28);
        java.lang.Object[] objArray30 = functionEvaluationException29.getArguments();
        org.junit.Assert.assertNotNull(throwableArray8);
        org.junit.Assert.assertNotNull(objArray12);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray12), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray12), "[]");
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 2 + "'", int13 == 2);
        org.junit.Assert.assertNotNull(throwableArray14);
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "Evaluation failed for argument = {0}" + "'", str22, "Evaluation failed for argument = {0}");
        org.junit.Assert.assertNotNull(objArray23);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray23), "[52.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray23), "[52.0]");
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + 2 + "'", int25 == 2);
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + 2 + "'", int26 == 2);
        org.junit.Assert.assertNotNull(objArray30);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray30), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray30), "[]");
    }

    @Test
    public void test16606() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest33.test16606");
        org.apache.commons.math.MaxIterationsExceededException maxIterationsExceededException8 = new org.apache.commons.math.MaxIterationsExceededException(0);
        java.lang.Throwable[] throwableArray9 = maxIterationsExceededException8.getSuppressed();
        org.apache.commons.math.ConvergenceException convergenceException10 = new org.apache.commons.math.ConvergenceException("org.apache.commons.math.ConvergenceException: org.apache.commons.math.FunctionEvaluationException: hi!", (java.lang.Object[]) throwableArray9);
        org.apache.commons.math.MaxIterationsExceededException maxIterationsExceededException11 = new org.apache.commons.math.MaxIterationsExceededException(2, "Evaluation failed for argument = {0}", (java.lang.Object[]) throwableArray9);
        org.apache.commons.math.ConvergenceException convergenceException12 = new org.apache.commons.math.ConvergenceException("org.apache.commons.math.FunctionEvaluationException: org.apache.commons.math.ode.DerivativeException: ", (java.lang.Object[]) throwableArray9);
        java.lang.Throwable throwable13 = null;
        org.apache.commons.math.ConvergenceException convergenceException14 = new org.apache.commons.math.ConvergenceException("", (java.lang.Object[]) throwableArray9, throwable13);
        java.lang.Object[] objArray28 = new java.lang.Object[] { 1L, (byte) 10, (short) 1 };
        org.apache.commons.math.FunctionEvaluationException functionEvaluationException29 = new org.apache.commons.math.FunctionEvaluationException((-1.0d), "hi!", objArray28);
        org.apache.commons.math.FunctionEvaluationException functionEvaluationException30 = new org.apache.commons.math.FunctionEvaluationException((double) 0L, "", objArray28);
        java.lang.Object[] objArray35 = new java.lang.Object[] { "", (short) 1, "org.apache.commons.math.FunctionEvaluationException: hi!", 10.0d, 0.0f };
        java.lang.Throwable throwable37 = null;
        org.apache.commons.math.ConvergenceException convergenceException38 = new org.apache.commons.math.ConvergenceException("hi!", throwable37);
        org.apache.commons.math.ode.DerivativeException derivativeException39 = new org.apache.commons.math.ode.DerivativeException((java.lang.Throwable) convergenceException38);
        java.lang.Throwable[] throwableArray40 = derivativeException39.getSuppressed();
        org.apache.commons.math.FunctionEvaluationException functionEvaluationException41 = new org.apache.commons.math.FunctionEvaluationException((double) 100, "", objArray35, (java.lang.Throwable) derivativeException39);
        java.lang.Object[] objArray49 = new java.lang.Object[] { 1L, (byte) 10, (short) 1 };
        org.apache.commons.math.FunctionEvaluationException functionEvaluationException50 = new org.apache.commons.math.FunctionEvaluationException((-1.0d), "hi!", objArray49);
        org.apache.commons.math.FunctionEvaluationException functionEvaluationException51 = new org.apache.commons.math.FunctionEvaluationException((double) 0L, "", objArray49);
        org.apache.commons.math.ode.DerivativeException derivativeException52 = new org.apache.commons.math.ode.DerivativeException((java.lang.Throwable) functionEvaluationException51);
        org.apache.commons.math.FunctionEvaluationException functionEvaluationException53 = new org.apache.commons.math.FunctionEvaluationException((double) '#', "hi!", objArray35, (java.lang.Throwable) derivativeException52);
        org.apache.commons.math.FunctionEvaluationException functionEvaluationException57 = new org.apache.commons.math.FunctionEvaluationException((double) 1.0f, "org.apache.commons.math.MaxIterationsExceededException: org.apache.commons.math.ode.DerivativeException: ");
        org.apache.commons.math.ConvergenceException convergenceException58 = new org.apache.commons.math.ConvergenceException("org.apache.commons.math.ConvergenceException: org.apache.commons.math.ConvergenceException: org.apache.commons.math.FunctionEvaluationException: org.apache.commons.math.ode.DerivativeException: ", (java.lang.Throwable) functionEvaluationException57);
        org.apache.commons.math.FunctionEvaluationException functionEvaluationException59 = new org.apache.commons.math.FunctionEvaluationException((double) 100, "", objArray35, (java.lang.Throwable) convergenceException58);
        org.apache.commons.math.ConvergenceException convergenceException60 = new org.apache.commons.math.ConvergenceException("org.apache.commons.math.FunctionEvaluationException: Evaluation failed for argument = 1", (java.lang.Object[]) throwableArray9, (java.lang.Throwable) functionEvaluationException59);
        java.lang.Throwable[] throwableArray61 = functionEvaluationException59.getSuppressed();
        org.apache.commons.math.FunctionEvaluationException functionEvaluationException62 = new org.apache.commons.math.FunctionEvaluationException((double) '4', (java.lang.Throwable) functionEvaluationException59);
        java.lang.Throwable[] throwableArray63 = functionEvaluationException59.getSuppressed();
        org.junit.Assert.assertNotNull(throwableArray9);
        org.junit.Assert.assertNotNull(objArray28);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray28), "[1, 10, 1]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray28), "[1, 10, 1]");
        org.junit.Assert.assertNotNull(objArray35);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray35), "[, 1, org.apache.commons.math.FunctionEvaluationException: hi!, 10.0, 0.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray35), "[, 1, org.apache.commons.math.FunctionEvaluationException: hi!, 10.0, 0.0]");
        org.junit.Assert.assertNotNull(throwableArray40);
        org.junit.Assert.assertNotNull(objArray49);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray49), "[1, 10, 1]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray49), "[1, 10, 1]");
        org.junit.Assert.assertNotNull(throwableArray61);
        org.junit.Assert.assertNotNull(throwableArray63);
    }

    @Test
    public void test16607() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest33.test16607");
        java.lang.String[] strArray5 = new java.lang.String[] { "org.apache.commons.math.FunctionEvaluationException: hi!" };
        org.apache.commons.math.ode.DerivativeException derivativeException6 = new org.apache.commons.math.ode.DerivativeException("hi!", strArray5);
        org.apache.commons.math.ode.DerivativeException derivativeException7 = new org.apache.commons.math.ode.DerivativeException("", strArray5);
        org.apache.commons.math.MaxIterationsExceededException maxIterationsExceededException8 = new org.apache.commons.math.MaxIterationsExceededException((-1), "org.apache.commons.math.MaxIterationsExceededException: org.apache.commons.math.ode.DerivativeException: ", (java.lang.Object[]) strArray5);
        int int9 = maxIterationsExceededException8.getMaxIterations();
        int int10 = maxIterationsExceededException8.getMaxIterations();
        java.lang.String str11 = maxIterationsExceededException8.toString();
        org.junit.Assert.assertNotNull(strArray5);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-1) + "'", int9 == (-1));
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-1) + "'", int10 == (-1));
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "org.apache.commons.math.MaxIterationsExceededException: org.apache.commons.math.MaxIterationsExceededException: org.apache.commons.math.ode.DerivativeException: " + "'", str11, "org.apache.commons.math.MaxIterationsExceededException: org.apache.commons.math.MaxIterationsExceededException: org.apache.commons.math.ode.DerivativeException: ");
    }

    @Test
    public void test16608() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest33.test16608");
        java.lang.String[] strArray11 = new java.lang.String[] { "Evaluation failed for argument = {0}", "Evaluation failed for argument = {0}", "Evaluation failed for argument = {0}", "", "", "org.apache.commons.math.ConvergenceException: org.apache.commons.math.FunctionEvaluationException: hi!" };
        org.apache.commons.math.ode.DerivativeException derivativeException12 = new org.apache.commons.math.ode.DerivativeException("Evaluation failed for argument = {0}", strArray11);
        org.apache.commons.math.ode.DerivativeException derivativeException13 = new org.apache.commons.math.ode.DerivativeException("org.apache.commons.math.FunctionEvaluationException: hi!", strArray11);
        org.apache.commons.math.ode.DerivativeException derivativeException14 = new org.apache.commons.math.ode.DerivativeException("org.apache.commons.math.ode.DerivativeException: org.apache.commons.math.ConvergenceException: Evaluation failed for argument = hi!", strArray11);
        org.apache.commons.math.MaxIterationsExceededException maxIterationsExceededException15 = new org.apache.commons.math.MaxIterationsExceededException(10, "org.apache.commons.math.FunctionEvaluationException: org.apache.commons.math.ConvergenceException: org.apache.commons.math.FunctionEvaluationException: Evaluation failed for argument = 1", (java.lang.Object[]) strArray11);
        org.junit.Assert.assertNotNull(strArray11);
    }

    @Test
    public void test16609() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest33.test16609");
        java.lang.Object[] objArray14 = new java.lang.Object[] { 1L, (byte) 10, (short) 1 };
        org.apache.commons.math.FunctionEvaluationException functionEvaluationException15 = new org.apache.commons.math.FunctionEvaluationException((-1.0d), "hi!", objArray14);
        java.lang.Throwable throwable16 = null;
        org.apache.commons.math.FunctionEvaluationException functionEvaluationException17 = new org.apache.commons.math.FunctionEvaluationException((double) (short) 1, "hi!", objArray14, throwable16);
        java.lang.String str18 = functionEvaluationException17.getPattern();
        java.lang.Throwable[] throwableArray19 = functionEvaluationException17.getSuppressed();
        java.lang.String str20 = functionEvaluationException17.getPattern();
        org.apache.commons.math.FunctionEvaluationException functionEvaluationException21 = new org.apache.commons.math.FunctionEvaluationException((double) 100L, "org.apache.commons.math.ConvergenceException: org.apache.commons.math.FunctionEvaluationException: hi!", (java.lang.Throwable) functionEvaluationException17);
        java.lang.Object[] objArray22 = functionEvaluationException17.getArguments();
        org.apache.commons.math.MaxIterationsExceededException maxIterationsExceededException23 = new org.apache.commons.math.MaxIterationsExceededException((int) (short) 100, "org.apache.commons.math.MaxIterationsExceededException: Maximal number of iterations (3) exceeded", objArray22);
        java.lang.String[] strArray34 = new java.lang.String[] { "hi!", "", "hi!", "hi!", "hi!" };
        org.apache.commons.math.ode.DerivativeException derivativeException35 = new org.apache.commons.math.ode.DerivativeException("", strArray34);
        org.apache.commons.math.ode.DerivativeException derivativeException36 = new org.apache.commons.math.ode.DerivativeException("org.apache.commons.math.ConvergenceException: org.apache.commons.math.FunctionEvaluationException: hi!", strArray34);
        org.apache.commons.math.ConvergenceException convergenceException37 = new org.apache.commons.math.ConvergenceException((java.lang.Throwable) derivativeException36);
        java.lang.Object[] objArray38 = derivativeException36.getArguments();
        java.lang.String[] strArray45 = new java.lang.String[] { "org.apache.commons.math.FunctionEvaluationException: hi!" };
        org.apache.commons.math.ode.DerivativeException derivativeException46 = new org.apache.commons.math.ode.DerivativeException("hi!", strArray45);
        org.apache.commons.math.FunctionEvaluationException functionEvaluationException49 = new org.apache.commons.math.FunctionEvaluationException((double) (-1.0f), "");
        org.apache.commons.math.ConvergenceException convergenceException50 = new org.apache.commons.math.ConvergenceException("org.apache.commons.math.FunctionEvaluationException: hi!", (java.lang.Object[]) strArray45, (java.lang.Throwable) functionEvaluationException49);
        java.lang.Throwable throwable53 = null;
        org.apache.commons.math.ConvergenceException convergenceException54 = new org.apache.commons.math.ConvergenceException("hi!", throwable53);
        org.apache.commons.math.ode.DerivativeException derivativeException55 = new org.apache.commons.math.ode.DerivativeException((java.lang.Throwable) convergenceException54);
        java.lang.Throwable[] throwableArray56 = derivativeException55.getSuppressed();
        org.apache.commons.math.ConvergenceException convergenceException57 = new org.apache.commons.math.ConvergenceException("org.apache.commons.math.ConvergenceException: org.apache.commons.math.FunctionEvaluationException: hi!", (java.lang.Throwable) derivativeException55);
        java.lang.String[] strArray61 = new java.lang.String[] { "org.apache.commons.math.FunctionEvaluationException: hi!" };
        org.apache.commons.math.ode.DerivativeException derivativeException62 = new org.apache.commons.math.ode.DerivativeException("hi!", strArray61);
        org.apache.commons.math.FunctionEvaluationException functionEvaluationException65 = new org.apache.commons.math.FunctionEvaluationException((double) (-1.0f), "");
        org.apache.commons.math.ConvergenceException convergenceException66 = new org.apache.commons.math.ConvergenceException("org.apache.commons.math.FunctionEvaluationException: hi!", (java.lang.Object[]) strArray61, (java.lang.Throwable) functionEvaluationException65);
        derivativeException55.addSuppressed((java.lang.Throwable) functionEvaluationException65);
        org.apache.commons.math.ConvergenceException convergenceException68 = new org.apache.commons.math.ConvergenceException("Evaluation failed for argument = {0}", (java.lang.Object[]) strArray45, (java.lang.Throwable) functionEvaluationException65);
        org.apache.commons.math.ode.DerivativeException derivativeException69 = new org.apache.commons.math.ode.DerivativeException("org.apache.commons.math.ConvergenceException: org.apache.commons.math.FunctionEvaluationException: hi!", strArray45);
        org.apache.commons.math.ode.DerivativeException derivativeException70 = new org.apache.commons.math.ode.DerivativeException("org.apache.commons.math.ConvergenceException: org.apache.commons.math.FunctionEvaluationException: org.apache.commons.math.ode.DerivativeException: ", strArray45);
        org.apache.commons.math.FunctionEvaluationException functionEvaluationException71 = new org.apache.commons.math.FunctionEvaluationException((double) 10.0f, "org.apache.commons.math.FunctionEvaluationException: org.apache.commons.math.ConvergenceException: hi!", objArray38, (java.lang.Throwable) derivativeException70);
        org.apache.commons.math.ConvergenceException convergenceException72 = new org.apache.commons.math.ConvergenceException((java.lang.Throwable) derivativeException70);
        org.apache.commons.math.ConvergenceException convergenceException73 = new org.apache.commons.math.ConvergenceException((java.lang.Throwable) derivativeException70);
        org.apache.commons.math.ConvergenceException convergenceException74 = new org.apache.commons.math.ConvergenceException("org.apache.commons.math.ConvergenceException: org.apache.commons.math.FunctionEvaluationException: Maximal number of iterations (0) exceeded", (java.lang.Throwable) derivativeException70);
        java.lang.Object[] objArray75 = derivativeException70.getArguments();
        org.apache.commons.math.FunctionEvaluationException functionEvaluationException76 = new org.apache.commons.math.FunctionEvaluationException((double) 1.0f, "org.apache.commons.math.ConvergenceException: org.apache.commons.math.ConvergenceException: Maximal number of iterations (10) exceeded", objArray22, (java.lang.Throwable) derivativeException70);
        org.apache.commons.math.ConvergenceException convergenceException77 = new org.apache.commons.math.ConvergenceException("org.apache.commons.math.ode.DerivativeException: org.apache.commons.math.ConvergenceException: org.apache.commons.math.ConvergenceException: org.apache.commons.math.FunctionEvaluationException: hi!", objArray22);
        java.lang.Object[] objArray78 = convergenceException77.getArguments();
        org.junit.Assert.assertNotNull(objArray14);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray14), "[1, 10, 1]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray14), "[1, 10, 1]");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "hi!" + "'", str18, "hi!");
        org.junit.Assert.assertNotNull(throwableArray19);
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "hi!" + "'", str20, "hi!");
        org.junit.Assert.assertNotNull(objArray22);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray22), "[1, 10, 1]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray22), "[1, 10, 1]");
        org.junit.Assert.assertNotNull(strArray34);
        org.junit.Assert.assertNotNull(objArray38);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray38), "[hi!, , hi!, hi!, hi!]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray38), "[hi!, , hi!, hi!, hi!]");
        org.junit.Assert.assertNotNull(strArray45);
        org.junit.Assert.assertNotNull(throwableArray56);
        org.junit.Assert.assertNotNull(strArray61);
        org.junit.Assert.assertNotNull(objArray75);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray75), "[org.apache.commons.math.FunctionEvaluationException: hi!]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray75), "[org.apache.commons.math.FunctionEvaluationException: hi!]");
        org.junit.Assert.assertNotNull(objArray78);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray78), "[1, 10, 1]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray78), "[1, 10, 1]");
    }

    @Test
    public void test16610() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest33.test16610");
        java.lang.Object[] objArray8 = new java.lang.Object[] { 1L, (byte) 10, (short) 1 };
        org.apache.commons.math.FunctionEvaluationException functionEvaluationException9 = new org.apache.commons.math.FunctionEvaluationException((-1.0d), "hi!", objArray8);
        org.apache.commons.math.FunctionEvaluationException functionEvaluationException10 = new org.apache.commons.math.FunctionEvaluationException((double) 0L, "", objArray8);
        java.lang.String str11 = functionEvaluationException10.getPattern();
        org.apache.commons.math.ode.DerivativeException derivativeException12 = new org.apache.commons.math.ode.DerivativeException((java.lang.Throwable) functionEvaluationException10);
        org.apache.commons.math.FunctionEvaluationException functionEvaluationException13 = new org.apache.commons.math.FunctionEvaluationException((double) '#', (java.lang.Throwable) functionEvaluationException10);
        java.lang.String str14 = functionEvaluationException13.toString();
        org.junit.Assert.assertNotNull(objArray8);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray8), "[1, 10, 1]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray8), "[1, 10, 1]");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "org.apache.commons.math.FunctionEvaluationException: " + "'", str14, "org.apache.commons.math.FunctionEvaluationException: ");
    }

    @Test
    public void test16611() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest33.test16611");
        java.lang.String[] strArray12 = new java.lang.String[] { "org.apache.commons.math.FunctionEvaluationException: hi!" };
        org.apache.commons.math.ode.DerivativeException derivativeException13 = new org.apache.commons.math.ode.DerivativeException("hi!", strArray12);
        org.apache.commons.math.FunctionEvaluationException functionEvaluationException16 = new org.apache.commons.math.FunctionEvaluationException((double) (-1.0f), "");
        org.apache.commons.math.ConvergenceException convergenceException17 = new org.apache.commons.math.ConvergenceException("org.apache.commons.math.FunctionEvaluationException: hi!", (java.lang.Object[]) strArray12, (java.lang.Throwable) functionEvaluationException16);
        java.lang.Throwable throwable20 = null;
        org.apache.commons.math.ConvergenceException convergenceException21 = new org.apache.commons.math.ConvergenceException("hi!", throwable20);
        org.apache.commons.math.ode.DerivativeException derivativeException22 = new org.apache.commons.math.ode.DerivativeException((java.lang.Throwable) convergenceException21);
        java.lang.Throwable[] throwableArray23 = derivativeException22.getSuppressed();
        org.apache.commons.math.ConvergenceException convergenceException24 = new org.apache.commons.math.ConvergenceException("org.apache.commons.math.ConvergenceException: org.apache.commons.math.FunctionEvaluationException: hi!", (java.lang.Throwable) derivativeException22);
        java.lang.String[] strArray28 = new java.lang.String[] { "org.apache.commons.math.FunctionEvaluationException: hi!" };
        org.apache.commons.math.ode.DerivativeException derivativeException29 = new org.apache.commons.math.ode.DerivativeException("hi!", strArray28);
        org.apache.commons.math.FunctionEvaluationException functionEvaluationException32 = new org.apache.commons.math.FunctionEvaluationException((double) (-1.0f), "");
        org.apache.commons.math.ConvergenceException convergenceException33 = new org.apache.commons.math.ConvergenceException("org.apache.commons.math.FunctionEvaluationException: hi!", (java.lang.Object[]) strArray28, (java.lang.Throwable) functionEvaluationException32);
        derivativeException22.addSuppressed((java.lang.Throwable) functionEvaluationException32);
        org.apache.commons.math.ConvergenceException convergenceException35 = new org.apache.commons.math.ConvergenceException("Evaluation failed for argument = {0}", (java.lang.Object[]) strArray12, (java.lang.Throwable) functionEvaluationException32);
        org.apache.commons.math.FunctionEvaluationException functionEvaluationException36 = new org.apache.commons.math.FunctionEvaluationException((double) 100, "org.apache.commons.math.ode.DerivativeException: hi!", (java.lang.Object[]) strArray12);
        org.apache.commons.math.FunctionEvaluationException functionEvaluationException37 = new org.apache.commons.math.FunctionEvaluationException(100.0d, "org.apache.commons.math.FunctionEvaluationException: org.apache.commons.math.ConvergenceException: hi!", (java.lang.Object[]) strArray12);
        org.apache.commons.math.FunctionEvaluationException functionEvaluationException38 = new org.apache.commons.math.FunctionEvaluationException((double) 1L, "org.apache.commons.math.FunctionEvaluationException: org.apache.commons.math.FunctionEvaluationException: org.apache.commons.math.FunctionEvaluationException: hi!", (java.lang.Object[]) strArray12);
        org.apache.commons.math.ConvergenceException convergenceException39 = new org.apache.commons.math.ConvergenceException("org.apache.commons.math.MaxIterationsExceededException: org.apache.commons.math.ConvergenceException: org.apache.commons.math.FunctionEvaluationException: hi!", (java.lang.Object[]) strArray12);
        org.apache.commons.math.FunctionEvaluationException functionEvaluationException40 = new org.apache.commons.math.FunctionEvaluationException((double) 1.0f, (java.lang.Throwable) convergenceException39);
        org.apache.commons.math.FunctionEvaluationException functionEvaluationException43 = new org.apache.commons.math.FunctionEvaluationException((-1.0d), "org.apache.commons.math.ode.DerivativeException: hi!");
        functionEvaluationException40.addSuppressed((java.lang.Throwable) functionEvaluationException43);
        org.apache.commons.math.ode.DerivativeException derivativeException45 = new org.apache.commons.math.ode.DerivativeException((java.lang.Throwable) functionEvaluationException43);
        org.junit.Assert.assertNotNull(strArray12);
        org.junit.Assert.assertNotNull(throwableArray23);
        org.junit.Assert.assertNotNull(strArray28);
    }

    @Test
    public void test16612() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest33.test16612");
        java.lang.Throwable throwable6 = null;
        org.apache.commons.math.ConvergenceException convergenceException7 = new org.apache.commons.math.ConvergenceException("hi!", throwable6);
        org.apache.commons.math.ode.DerivativeException derivativeException8 = new org.apache.commons.math.ode.DerivativeException((java.lang.Throwable) convergenceException7);
        java.lang.Throwable[] throwableArray9 = derivativeException8.getSuppressed();
        org.apache.commons.math.ConvergenceException convergenceException10 = new org.apache.commons.math.ConvergenceException("org.apache.commons.math.FunctionEvaluationException: hi!", (java.lang.Object[]) throwableArray9);
        org.apache.commons.math.FunctionEvaluationException functionEvaluationException13 = new org.apache.commons.math.FunctionEvaluationException(0.0d, "org.apache.commons.math.ConvergenceException: org.apache.commons.math.FunctionEvaluationException: hi!");
        org.apache.commons.math.FunctionEvaluationException functionEvaluationException14 = new org.apache.commons.math.FunctionEvaluationException((double) (short) 1, "org.apache.commons.math.ConvergenceException: hi!", (java.lang.Object[]) throwableArray9, (java.lang.Throwable) functionEvaluationException13);
        org.apache.commons.math.MaxIterationsExceededException maxIterationsExceededException15 = new org.apache.commons.math.MaxIterationsExceededException(100, "", (java.lang.Object[]) throwableArray9);
        int int16 = maxIterationsExceededException15.getMaxIterations();
        java.lang.Object[] objArray17 = maxIterationsExceededException15.getArguments();
        org.apache.commons.math.ode.DerivativeException derivativeException18 = new org.apache.commons.math.ode.DerivativeException((java.lang.Throwable) maxIterationsExceededException15);
        org.apache.commons.math.ode.DerivativeException derivativeException19 = new org.apache.commons.math.ode.DerivativeException((java.lang.Throwable) derivativeException18);
        org.junit.Assert.assertNotNull(throwableArray9);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 100 + "'", int16 == 100);
        org.junit.Assert.assertNotNull(objArray17);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray17), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray17), "[]");
    }

    @Test
    public void test16613() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest33.test16613");
        java.lang.Object[] objArray7 = new java.lang.Object[] { 1L, (byte) 10, (short) 1 };
        org.apache.commons.math.FunctionEvaluationException functionEvaluationException8 = new org.apache.commons.math.FunctionEvaluationException((-1.0d), "hi!", objArray7);
        java.lang.Throwable throwable9 = null;
        org.apache.commons.math.FunctionEvaluationException functionEvaluationException10 = new org.apache.commons.math.FunctionEvaluationException((double) (short) 1, "hi!", objArray7, throwable9);
        java.lang.String str11 = functionEvaluationException10.getPattern();
        java.lang.String str12 = functionEvaluationException10.getPattern();
        java.lang.String str13 = functionEvaluationException10.getPattern();
        org.apache.commons.math.ConvergenceException convergenceException14 = new org.apache.commons.math.ConvergenceException((java.lang.Throwable) functionEvaluationException10);
        org.apache.commons.math.ConvergenceException convergenceException15 = new org.apache.commons.math.ConvergenceException((java.lang.Throwable) functionEvaluationException10);
        org.junit.Assert.assertNotNull(objArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray7), "[1, 10, 1]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray7), "[1, 10, 1]");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!" + "'", str11, "hi!");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!" + "'", str12, "hi!");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "hi!" + "'", str13, "hi!");
    }

    @Test
    public void test16614() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest33.test16614");
        org.apache.commons.math.MaxIterationsExceededException maxIterationsExceededException5 = new org.apache.commons.math.MaxIterationsExceededException(1);
        org.apache.commons.math.ConvergenceException convergenceException6 = new org.apache.commons.math.ConvergenceException((java.lang.Throwable) maxIterationsExceededException5);
        int int7 = maxIterationsExceededException5.getMaxIterations();
        java.lang.Object[] objArray8 = maxIterationsExceededException5.getArguments();
        java.lang.String[] strArray14 = new java.lang.String[] { "org.apache.commons.math.FunctionEvaluationException: hi!" };
        org.apache.commons.math.ode.DerivativeException derivativeException15 = new org.apache.commons.math.ode.DerivativeException("hi!", strArray14);
        org.apache.commons.math.FunctionEvaluationException functionEvaluationException18 = new org.apache.commons.math.FunctionEvaluationException((double) (-1.0f), "");
        org.apache.commons.math.ConvergenceException convergenceException19 = new org.apache.commons.math.ConvergenceException("org.apache.commons.math.FunctionEvaluationException: hi!", (java.lang.Object[]) strArray14, (java.lang.Throwable) functionEvaluationException18);
        java.lang.Throwable throwable22 = null;
        org.apache.commons.math.ConvergenceException convergenceException23 = new org.apache.commons.math.ConvergenceException("hi!", throwable22);
        org.apache.commons.math.ode.DerivativeException derivativeException24 = new org.apache.commons.math.ode.DerivativeException((java.lang.Throwable) convergenceException23);
        java.lang.Throwable[] throwableArray25 = derivativeException24.getSuppressed();
        org.apache.commons.math.ConvergenceException convergenceException26 = new org.apache.commons.math.ConvergenceException("org.apache.commons.math.ConvergenceException: org.apache.commons.math.FunctionEvaluationException: hi!", (java.lang.Throwable) derivativeException24);
        java.lang.String[] strArray30 = new java.lang.String[] { "org.apache.commons.math.FunctionEvaluationException: hi!" };
        org.apache.commons.math.ode.DerivativeException derivativeException31 = new org.apache.commons.math.ode.DerivativeException("hi!", strArray30);
        org.apache.commons.math.FunctionEvaluationException functionEvaluationException34 = new org.apache.commons.math.FunctionEvaluationException((double) (-1.0f), "");
        org.apache.commons.math.ConvergenceException convergenceException35 = new org.apache.commons.math.ConvergenceException("org.apache.commons.math.FunctionEvaluationException: hi!", (java.lang.Object[]) strArray30, (java.lang.Throwable) functionEvaluationException34);
        derivativeException24.addSuppressed((java.lang.Throwable) functionEvaluationException34);
        org.apache.commons.math.ConvergenceException convergenceException37 = new org.apache.commons.math.ConvergenceException("Evaluation failed for argument = {0}", (java.lang.Object[]) strArray14, (java.lang.Throwable) functionEvaluationException34);
        org.apache.commons.math.ode.DerivativeException derivativeException38 = new org.apache.commons.math.ode.DerivativeException("org.apache.commons.math.ConvergenceException: org.apache.commons.math.FunctionEvaluationException: hi!", strArray14);
        org.apache.commons.math.ode.DerivativeException derivativeException39 = new org.apache.commons.math.ode.DerivativeException((java.lang.Throwable) derivativeException38);
        org.apache.commons.math.ode.DerivativeException derivativeException40 = new org.apache.commons.math.ode.DerivativeException((java.lang.Throwable) derivativeException38);
        org.apache.commons.math.ode.DerivativeException derivativeException41 = new org.apache.commons.math.ode.DerivativeException((java.lang.Throwable) derivativeException38);
        java.lang.Object[] objArray42 = derivativeException38.getArguments();
        org.apache.commons.math.FunctionEvaluationException functionEvaluationException43 = new org.apache.commons.math.FunctionEvaluationException((double) 100, "org.apache.commons.math.ConvergenceException: org.apache.commons.math.ConvergenceException: org.apache.commons.math.ConvergenceException: org.apache.commons.math.ConvergenceException: org.apache.commons.math.FunctionEvaluationException: hi!", objArray8, (java.lang.Throwable) derivativeException38);
        org.apache.commons.math.MaxIterationsExceededException maxIterationsExceededException44 = new org.apache.commons.math.MaxIterationsExceededException(3, "org.apache.commons.math.MaxIterationsExceededException: org.apache.commons.math.FunctionEvaluationException: Maximal number of iterations (0) exceeded", objArray8);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 1 + "'", int7 == 1);
        org.junit.Assert.assertNotNull(objArray8);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray8), "[1]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray8), "[1]");
        org.junit.Assert.assertNotNull(strArray14);
        org.junit.Assert.assertNotNull(throwableArray25);
        org.junit.Assert.assertNotNull(strArray30);
        org.junit.Assert.assertNotNull(objArray42);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray42), "[org.apache.commons.math.FunctionEvaluationException: hi!]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray42), "[org.apache.commons.math.FunctionEvaluationException: hi!]");
    }

    @Test
    public void test16615() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest33.test16615");
        java.lang.Object[] objArray15 = new java.lang.Object[] { 10L, (-1L), 10, 0.0d };
        java.lang.Throwable throwable16 = null;
        org.apache.commons.math.ConvergenceException convergenceException17 = new org.apache.commons.math.ConvergenceException("hi!", objArray15, throwable16);
        org.apache.commons.math.MaxIterationsExceededException maxIterationsExceededException18 = new org.apache.commons.math.MaxIterationsExceededException(2, "org.apache.commons.math.ode.DerivativeException: ", objArray15);
        java.lang.Throwable throwable24 = null;
        org.apache.commons.math.ConvergenceException convergenceException25 = new org.apache.commons.math.ConvergenceException("hi!", throwable24);
        org.apache.commons.math.ode.DerivativeException derivativeException26 = new org.apache.commons.math.ode.DerivativeException((java.lang.Throwable) convergenceException25);
        java.lang.Throwable[] throwableArray27 = derivativeException26.getSuppressed();
        org.apache.commons.math.ConvergenceException convergenceException28 = new org.apache.commons.math.ConvergenceException("org.apache.commons.math.FunctionEvaluationException: hi!", (java.lang.Object[]) throwableArray27);
        org.apache.commons.math.FunctionEvaluationException functionEvaluationException31 = new org.apache.commons.math.FunctionEvaluationException(0.0d, "org.apache.commons.math.ConvergenceException: org.apache.commons.math.FunctionEvaluationException: hi!");
        org.apache.commons.math.FunctionEvaluationException functionEvaluationException32 = new org.apache.commons.math.FunctionEvaluationException((double) (short) 1, "org.apache.commons.math.ConvergenceException: hi!", (java.lang.Object[]) throwableArray27, (java.lang.Throwable) functionEvaluationException31);
        org.apache.commons.math.ConvergenceException convergenceException33 = new org.apache.commons.math.ConvergenceException("org.apache.commons.math.ConvergenceException: org.apache.commons.math.FunctionEvaluationException: hi!", (java.lang.Throwable) functionEvaluationException31);
        org.apache.commons.math.FunctionEvaluationException functionEvaluationException34 = new org.apache.commons.math.FunctionEvaluationException((double) 'a', "Evaluation failed for argument = {0}", objArray15, (java.lang.Throwable) functionEvaluationException31);
        org.apache.commons.math.FunctionEvaluationException functionEvaluationException35 = new org.apache.commons.math.FunctionEvaluationException((double) ' ', "org.apache.commons.math.FunctionEvaluationException: hi!", (java.lang.Throwable) functionEvaluationException34);
        java.lang.Throwable[] throwableArray36 = functionEvaluationException34.getSuppressed();
        java.lang.String str37 = functionEvaluationException34.getPattern();
        java.lang.Object[] objArray38 = functionEvaluationException34.getArguments();
        org.apache.commons.math.MaxIterationsExceededException maxIterationsExceededException39 = new org.apache.commons.math.MaxIterationsExceededException((int) (byte) 1, "org.apache.commons.math.ode.DerivativeException: org.apache.commons.math.ode.DerivativeException: hi!", objArray38);
        org.apache.commons.math.MaxIterationsExceededException maxIterationsExceededException40 = new org.apache.commons.math.MaxIterationsExceededException(32, "org.apache.commons.math.ConvergenceException: org.apache.commons.math.FunctionEvaluationException: hi!", objArray38);
        int int41 = maxIterationsExceededException40.getMaxIterations();
        org.junit.Assert.assertNotNull(objArray15);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray15), "[10, -1, 10, 0.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray15), "[10, -1, 10, 0.0]");
        org.junit.Assert.assertNotNull(throwableArray27);
        org.junit.Assert.assertNotNull(throwableArray36);
        org.junit.Assert.assertEquals("'" + str37 + "' != '" + "Evaluation failed for argument = {0}" + "'", str37, "Evaluation failed for argument = {0}");
        org.junit.Assert.assertNotNull(objArray38);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray38), "[10, -1, 10, 0.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray38), "[10, -1, 10, 0.0]");
        org.junit.Assert.assertTrue("'" + int41 + "' != '" + 32 + "'", int41 == 32);
    }

    @Test
    public void test16616() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest33.test16616");
        java.lang.String[] strArray11 = new java.lang.String[] { "hi!", "", "hi!", "hi!", "hi!" };
        org.apache.commons.math.ode.DerivativeException derivativeException12 = new org.apache.commons.math.ode.DerivativeException("", strArray11);
        org.apache.commons.math.ConvergenceException convergenceException13 = new org.apache.commons.math.ConvergenceException("org.apache.commons.math.FunctionEvaluationException: hi!", (java.lang.Throwable) derivativeException12);
        java.lang.Object[] objArray14 = derivativeException12.getArguments();
        java.lang.String[] strArray28 = new java.lang.String[] { "hi!", "", "hi!", "hi!", "hi!" };
        org.apache.commons.math.ode.DerivativeException derivativeException29 = new org.apache.commons.math.ode.DerivativeException("", strArray28);
        org.apache.commons.math.ode.DerivativeException derivativeException30 = new org.apache.commons.math.ode.DerivativeException("", strArray28);
        java.lang.String[] strArray37 = new java.lang.String[] { "hi!", "", "hi!", "hi!", "hi!" };
        org.apache.commons.math.ode.DerivativeException derivativeException38 = new org.apache.commons.math.ode.DerivativeException("", strArray37);
        org.apache.commons.math.ode.DerivativeException derivativeException39 = new org.apache.commons.math.ode.DerivativeException((java.lang.Throwable) derivativeException38);
        org.apache.commons.math.ConvergenceException convergenceException40 = new org.apache.commons.math.ConvergenceException("hi!", (java.lang.Object[]) strArray28, (java.lang.Throwable) derivativeException38);
        org.apache.commons.math.ode.DerivativeException derivativeException41 = new org.apache.commons.math.ode.DerivativeException("hi!", strArray28);
        java.lang.Object[] objArray49 = new java.lang.Object[] { 1L, (byte) 10, (short) 1 };
        org.apache.commons.math.FunctionEvaluationException functionEvaluationException50 = new org.apache.commons.math.FunctionEvaluationException((-1.0d), "hi!", objArray49);
        java.lang.Throwable throwable51 = null;
        org.apache.commons.math.FunctionEvaluationException functionEvaluationException52 = new org.apache.commons.math.FunctionEvaluationException((double) (short) 1, "hi!", objArray49, throwable51);
        org.apache.commons.math.ConvergenceException convergenceException53 = new org.apache.commons.math.ConvergenceException("org.apache.commons.math.FunctionEvaluationException: hi!", (java.lang.Object[]) strArray28, throwable51);
        org.apache.commons.math.FunctionEvaluationException functionEvaluationException54 = new org.apache.commons.math.FunctionEvaluationException((double) 10L, "org.apache.commons.math.ConvergenceException: org.apache.commons.math.FunctionEvaluationException: hi!", (java.lang.Object[]) strArray28);
        org.apache.commons.math.ode.DerivativeException derivativeException55 = new org.apache.commons.math.ode.DerivativeException("org.apache.commons.math.ConvergenceException: org.apache.commons.math.FunctionEvaluationException: hi!", strArray28);
        java.lang.Throwable[] throwableArray56 = derivativeException55.getSuppressed();
        derivativeException12.addSuppressed((java.lang.Throwable) derivativeException55);
        org.apache.commons.math.ConvergenceException convergenceException58 = new org.apache.commons.math.ConvergenceException("org.apache.commons.math.ConvergenceException: ", (java.lang.Throwable) derivativeException12);
        org.apache.commons.math.ConvergenceException convergenceException59 = new org.apache.commons.math.ConvergenceException((java.lang.Throwable) convergenceException58);
        org.apache.commons.math.FunctionEvaluationException functionEvaluationException60 = new org.apache.commons.math.FunctionEvaluationException((double) (byte) 0, (java.lang.Throwable) convergenceException59);
        java.lang.Object[] objArray61 = functionEvaluationException60.getArguments();
        double double62 = functionEvaluationException60.getArgument();
        org.apache.commons.math.FunctionEvaluationException functionEvaluationException63 = new org.apache.commons.math.FunctionEvaluationException((double) (short) 0, "org.apache.commons.math.FunctionEvaluationException: org.apache.commons.math.FunctionEvaluationException: org.apache.commons.math.MaxIterationsExceededException: org.apache.commons.math.ode.DerivativeException: org.apache.commons.math.ode.DerivativeException: org.apache.commons.math.ode.DerivativeException: ", (java.lang.Throwable) functionEvaluationException60);
        org.junit.Assert.assertNotNull(strArray11);
        org.junit.Assert.assertNotNull(objArray14);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray14), "[hi!, , hi!, hi!, hi!]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray14), "[hi!, , hi!, hi!, hi!]");
        org.junit.Assert.assertNotNull(strArray28);
        org.junit.Assert.assertNotNull(strArray37);
        org.junit.Assert.assertNotNull(objArray49);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray49), "[1, 10, 1]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray49), "[1, 10, 1]");
        org.junit.Assert.assertNotNull(throwableArray56);
        org.junit.Assert.assertNotNull(objArray61);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray61), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray61), "[]");
        org.junit.Assert.assertTrue("'" + double62 + "' != '" + 0.0d + "'", double62 == 0.0d);
    }

    @Test
    public void test16617() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest33.test16617");
        org.apache.commons.math.ConvergenceException convergenceException1 = new org.apache.commons.math.ConvergenceException("org.apache.commons.math.FunctionEvaluationException: org.apache.commons.math.FunctionEvaluationException: Evaluation failed for argument = -1");
        org.apache.commons.math.ode.DerivativeException derivativeException2 = new org.apache.commons.math.ode.DerivativeException((java.lang.Throwable) convergenceException1);
    }

    @Test
    public void test16618() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest33.test16618");
        org.apache.commons.math.MaxIterationsExceededException maxIterationsExceededException3 = new org.apache.commons.math.MaxIterationsExceededException(0);
        java.lang.Throwable[] throwableArray4 = maxIterationsExceededException3.getSuppressed();
        org.apache.commons.math.ConvergenceException convergenceException5 = new org.apache.commons.math.ConvergenceException((java.lang.Throwable) maxIterationsExceededException3);
        java.lang.Throwable[] throwableArray6 = convergenceException5.getSuppressed();
        java.lang.Throwable[] throwableArray7 = convergenceException5.getSuppressed();
        org.apache.commons.math.FunctionEvaluationException functionEvaluationException8 = new org.apache.commons.math.FunctionEvaluationException(0.0d, "org.apache.commons.math.ode.DerivativeException: org.apache.commons.math.FunctionEvaluationException", (java.lang.Object[]) throwableArray7);
        org.junit.Assert.assertNotNull(throwableArray4);
        org.junit.Assert.assertNotNull(throwableArray6);
        org.junit.Assert.assertNotNull(throwableArray7);
    }

    @Test
    public void test16619() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest33.test16619");
        java.lang.String[] strArray13 = new java.lang.String[] { "org.apache.commons.math.FunctionEvaluationException: hi!" };
        org.apache.commons.math.ode.DerivativeException derivativeException14 = new org.apache.commons.math.ode.DerivativeException("hi!", strArray13);
        org.apache.commons.math.FunctionEvaluationException functionEvaluationException17 = new org.apache.commons.math.FunctionEvaluationException((double) (-1.0f), "");
        org.apache.commons.math.ConvergenceException convergenceException18 = new org.apache.commons.math.ConvergenceException("org.apache.commons.math.FunctionEvaluationException: hi!", (java.lang.Object[]) strArray13, (java.lang.Throwable) functionEvaluationException17);
        java.lang.Throwable throwable21 = null;
        org.apache.commons.math.ConvergenceException convergenceException22 = new org.apache.commons.math.ConvergenceException("hi!", throwable21);
        org.apache.commons.math.ode.DerivativeException derivativeException23 = new org.apache.commons.math.ode.DerivativeException((java.lang.Throwable) convergenceException22);
        java.lang.Throwable[] throwableArray24 = derivativeException23.getSuppressed();
        org.apache.commons.math.ConvergenceException convergenceException25 = new org.apache.commons.math.ConvergenceException("org.apache.commons.math.ConvergenceException: org.apache.commons.math.FunctionEvaluationException: hi!", (java.lang.Throwable) derivativeException23);
        java.lang.String[] strArray29 = new java.lang.String[] { "org.apache.commons.math.FunctionEvaluationException: hi!" };
        org.apache.commons.math.ode.DerivativeException derivativeException30 = new org.apache.commons.math.ode.DerivativeException("hi!", strArray29);
        org.apache.commons.math.FunctionEvaluationException functionEvaluationException33 = new org.apache.commons.math.FunctionEvaluationException((double) (-1.0f), "");
        org.apache.commons.math.ConvergenceException convergenceException34 = new org.apache.commons.math.ConvergenceException("org.apache.commons.math.FunctionEvaluationException: hi!", (java.lang.Object[]) strArray29, (java.lang.Throwable) functionEvaluationException33);
        derivativeException23.addSuppressed((java.lang.Throwable) functionEvaluationException33);
        org.apache.commons.math.ConvergenceException convergenceException36 = new org.apache.commons.math.ConvergenceException("Evaluation failed for argument = {0}", (java.lang.Object[]) strArray13, (java.lang.Throwable) functionEvaluationException33);
        org.apache.commons.math.ode.DerivativeException derivativeException37 = new org.apache.commons.math.ode.DerivativeException("org.apache.commons.math.ConvergenceException: org.apache.commons.math.FunctionEvaluationException: hi!", strArray13);
        org.apache.commons.math.ode.DerivativeException derivativeException38 = new org.apache.commons.math.ode.DerivativeException("org.apache.commons.math.ConvergenceException: org.apache.commons.math.FunctionEvaluationException: org.apache.commons.math.ode.DerivativeException: ", strArray13);
        org.apache.commons.math.ode.DerivativeException derivativeException39 = new org.apache.commons.math.ode.DerivativeException("org.apache.commons.math.ode.DerivativeException: hi!", strArray13);
        org.apache.commons.math.ConvergenceException convergenceException42 = new org.apache.commons.math.ConvergenceException("hi!");
        org.apache.commons.math.FunctionEvaluationException functionEvaluationException43 = new org.apache.commons.math.FunctionEvaluationException((double) 'a', (java.lang.Throwable) convergenceException42);
        org.apache.commons.math.FunctionEvaluationException functionEvaluationException44 = new org.apache.commons.math.FunctionEvaluationException((double) 0L, "org.apache.commons.math.MaxIterationsExceededException: org.apache.commons.math.ode.DerivativeException: ", (java.lang.Object[]) strArray13, (java.lang.Throwable) convergenceException42);
        org.apache.commons.math.ode.DerivativeException derivativeException45 = new org.apache.commons.math.ode.DerivativeException("org.apache.commons.math.ConvergenceException: org.apache.commons.math.FunctionEvaluationException: hi!", strArray13);
        org.apache.commons.math.MaxIterationsExceededException maxIterationsExceededException46 = new org.apache.commons.math.MaxIterationsExceededException(10, "org.apache.commons.math.FunctionEvaluationException: hi!", (java.lang.Object[]) strArray13);
        org.apache.commons.math.ConvergenceException convergenceException47 = new org.apache.commons.math.ConvergenceException("org.apache.commons.math.FunctionEvaluationException: org.apache.commons.math.ConvergenceException: org.apache.commons.math.ConvergenceException: org.apache.commons.math.ConvergenceException: org.apache.commons.math.ConvergenceException: org.apache.commons.math.FunctionEvaluationException: hi!", (java.lang.Throwable) maxIterationsExceededException46);
        java.lang.String str48 = maxIterationsExceededException46.getPattern();
        int int49 = maxIterationsExceededException46.getMaxIterations();
        org.junit.Assert.assertNotNull(strArray13);
        org.junit.Assert.assertNotNull(throwableArray24);
        org.junit.Assert.assertNotNull(strArray29);
        org.junit.Assert.assertEquals("'" + str48 + "' != '" + "org.apache.commons.math.FunctionEvaluationException: hi!" + "'", str48, "org.apache.commons.math.FunctionEvaluationException: hi!");
        org.junit.Assert.assertTrue("'" + int49 + "' != '" + 10 + "'", int49 == 10);
    }

    @Test
    public void test16620() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest33.test16620");
        java.lang.String[] strArray26 = new java.lang.String[] { "hi!", "", "hi!", "hi!", "hi!" };
        org.apache.commons.math.ode.DerivativeException derivativeException27 = new org.apache.commons.math.ode.DerivativeException("", strArray26);
        org.apache.commons.math.ode.DerivativeException derivativeException28 = new org.apache.commons.math.ode.DerivativeException("", strArray26);
        org.apache.commons.math.ConvergenceException convergenceException29 = new org.apache.commons.math.ConvergenceException("org.apache.commons.math.FunctionEvaluationException: hi!", (java.lang.Object[]) strArray26);
        org.apache.commons.math.ConvergenceException convergenceException30 = new org.apache.commons.math.ConvergenceException("", (java.lang.Object[]) strArray26);
        org.apache.commons.math.FunctionEvaluationException functionEvaluationException31 = new org.apache.commons.math.FunctionEvaluationException((double) (-1L), "org.apache.commons.math.ConvergenceException: org.apache.commons.math.FunctionEvaluationException: hi!", (java.lang.Object[]) strArray26);
        org.apache.commons.math.MaxIterationsExceededException maxIterationsExceededException32 = new org.apache.commons.math.MaxIterationsExceededException((int) (byte) 1, "org.apache.commons.math.FunctionEvaluationException: ", (java.lang.Object[]) strArray26);
        java.lang.Object[] objArray38 = new java.lang.Object[] { 10L, (-1L), 10, 0.0d };
        java.lang.Throwable throwable39 = null;
        org.apache.commons.math.ConvergenceException convergenceException40 = new org.apache.commons.math.ConvergenceException("hi!", objArray38, throwable39);
        java.lang.Throwable[] throwableArray41 = convergenceException40.getSuppressed();
        org.apache.commons.math.FunctionEvaluationException functionEvaluationException42 = new org.apache.commons.math.FunctionEvaluationException((double) '4', "org.apache.commons.math.ode.DerivativeException: org.apache.commons.math.ConvergenceException: org.apache.commons.math.ConvergenceException: org.apache.commons.math.FunctionEvaluationException: hi!", (java.lang.Object[]) strArray26, (java.lang.Throwable) convergenceException40);
        org.apache.commons.math.FunctionEvaluationException functionEvaluationException43 = new org.apache.commons.math.FunctionEvaluationException((double) ' ', "org.apache.commons.math.FunctionEvaluationException: Evaluation failed for argument = 2", (java.lang.Object[]) strArray26);
        org.apache.commons.math.FunctionEvaluationException functionEvaluationException44 = new org.apache.commons.math.FunctionEvaluationException((double) 10.0f, "org.apache.commons.math.FunctionEvaluationException: Maximal number of iterations (0) exceeded", (java.lang.Object[]) strArray26);
        java.lang.String[] strArray63 = new java.lang.String[] { "hi!", "", "hi!", "hi!", "hi!" };
        org.apache.commons.math.ode.DerivativeException derivativeException64 = new org.apache.commons.math.ode.DerivativeException("", strArray63);
        org.apache.commons.math.MaxIterationsExceededException maxIterationsExceededException65 = new org.apache.commons.math.MaxIterationsExceededException(10, "org.apache.commons.math.FunctionEvaluationException: Evaluation failed for argument = 0", (java.lang.Object[]) strArray63);
        org.apache.commons.math.MaxIterationsExceededException maxIterationsExceededException67 = new org.apache.commons.math.MaxIterationsExceededException(3);
        org.apache.commons.math.FunctionEvaluationException functionEvaluationException68 = new org.apache.commons.math.FunctionEvaluationException((double) 0, "hi!", (java.lang.Object[]) strArray63, (java.lang.Throwable) maxIterationsExceededException67);
        org.apache.commons.math.ConvergenceException convergenceException69 = new org.apache.commons.math.ConvergenceException("hi!", (java.lang.Object[]) strArray63);
        org.apache.commons.math.MaxIterationsExceededException maxIterationsExceededException70 = new org.apache.commons.math.MaxIterationsExceededException((int) '4', "org.apache.commons.math.ConvergenceException: org.apache.commons.math.FunctionEvaluationException: hi!", (java.lang.Object[]) strArray63);
        org.apache.commons.math.FunctionEvaluationException functionEvaluationException72 = new org.apache.commons.math.FunctionEvaluationException((double) (-1.0f));
        double double73 = functionEvaluationException72.getArgument();
        org.apache.commons.math.ConvergenceException convergenceException74 = new org.apache.commons.math.ConvergenceException("Maximal number of iterations ({0}) exceeded", (java.lang.Object[]) strArray63, (java.lang.Throwable) functionEvaluationException72);
        org.apache.commons.math.FunctionEvaluationException functionEvaluationException75 = new org.apache.commons.math.FunctionEvaluationException((double) (short) 1, "org.apache.commons.math.ConvergenceException: org.apache.commons.math.FunctionEvaluationException: hi!", (java.lang.Object[]) strArray63);
        org.apache.commons.math.ConvergenceException convergenceException76 = new org.apache.commons.math.ConvergenceException("org.apache.commons.math.ode.DerivativeException: org.apache.commons.math.ConvergenceException: org.apache.commons.math.FunctionEvaluationException: hi!", (java.lang.Object[]) strArray63);
        org.apache.commons.math.ode.DerivativeException derivativeException77 = new org.apache.commons.math.ode.DerivativeException("Maximal number of iterations (0) exceeded", strArray63);
        org.apache.commons.math.FunctionEvaluationException functionEvaluationException78 = new org.apache.commons.math.FunctionEvaluationException((double) (byte) 100, "org.apache.commons.math.FunctionEvaluationException: Evaluation failed for argument = 52", (java.lang.Object[]) strArray26, (java.lang.Throwable) derivativeException77);
        org.apache.commons.math.ode.DerivativeException derivativeException79 = new org.apache.commons.math.ode.DerivativeException("org.apache.commons.math.ConvergenceException: org.apache.commons.math.FunctionEvaluationException: org.apache.commons.math.ConvergenceException: hi!", strArray26);
        org.apache.commons.math.MaxIterationsExceededException maxIterationsExceededException80 = new org.apache.commons.math.MaxIterationsExceededException((int) (short) 0, "org.apache.commons.math.ConvergenceException: org.apache.commons.math.ode.DerivativeException: org.apache.commons.math.ConvergenceException: hi!", (java.lang.Object[]) strArray26);
        org.apache.commons.math.MaxIterationsExceededException maxIterationsExceededException81 = new org.apache.commons.math.MaxIterationsExceededException((int) 'a', "org.apache.commons.math.ConvergenceException: org.apache.commons.math.ConvergenceException: org.apache.commons.math.ConvergenceException: org.apache.commons.math.FunctionEvaluationException: org.apache.commons.math.ConvergenceException: hi!", (java.lang.Object[]) strArray26);
        org.junit.Assert.assertNotNull(strArray26);
        org.junit.Assert.assertNotNull(objArray38);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray38), "[10, -1, 10, 0.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray38), "[10, -1, 10, 0.0]");
        org.junit.Assert.assertNotNull(throwableArray41);
        org.junit.Assert.assertNotNull(strArray63);
        org.junit.Assert.assertTrue("'" + double73 + "' != '" + (-1.0d) + "'", double73 == (-1.0d));
    }

    @Test
    public void test16621() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest33.test16621");
        java.lang.String[] strArray10 = new java.lang.String[] { "hi!", "", "hi!", "hi!", "hi!" };
        org.apache.commons.math.ode.DerivativeException derivativeException11 = new org.apache.commons.math.ode.DerivativeException("", strArray10);
        org.apache.commons.math.ode.DerivativeException derivativeException12 = new org.apache.commons.math.ode.DerivativeException("", strArray10);
        java.lang.String[] strArray19 = new java.lang.String[] { "hi!", "", "hi!", "hi!", "hi!" };
        org.apache.commons.math.ode.DerivativeException derivativeException20 = new org.apache.commons.math.ode.DerivativeException("", strArray19);
        org.apache.commons.math.ode.DerivativeException derivativeException21 = new org.apache.commons.math.ode.DerivativeException((java.lang.Throwable) derivativeException20);
        org.apache.commons.math.ConvergenceException convergenceException22 = new org.apache.commons.math.ConvergenceException("hi!", (java.lang.Object[]) strArray10, (java.lang.Throwable) derivativeException20);
        org.apache.commons.math.ode.DerivativeException derivativeException23 = new org.apache.commons.math.ode.DerivativeException("hi!", strArray10);
        java.lang.Throwable throwable28 = null;
        org.apache.commons.math.ConvergenceException convergenceException29 = new org.apache.commons.math.ConvergenceException("hi!", throwable28);
        org.apache.commons.math.ode.DerivativeException derivativeException30 = new org.apache.commons.math.ode.DerivativeException((java.lang.Throwable) convergenceException29);
        java.lang.Throwable[] throwableArray31 = derivativeException30.getSuppressed();
        org.apache.commons.math.ConvergenceException convergenceException32 = new org.apache.commons.math.ConvergenceException("org.apache.commons.math.FunctionEvaluationException: hi!", (java.lang.Object[]) throwableArray31);
        org.apache.commons.math.FunctionEvaluationException functionEvaluationException35 = new org.apache.commons.math.FunctionEvaluationException(0.0d, "org.apache.commons.math.ConvergenceException: org.apache.commons.math.FunctionEvaluationException: hi!");
        org.apache.commons.math.FunctionEvaluationException functionEvaluationException36 = new org.apache.commons.math.FunctionEvaluationException((double) (short) 1, "org.apache.commons.math.ConvergenceException: hi!", (java.lang.Object[]) throwableArray31, (java.lang.Throwable) functionEvaluationException35);
        org.apache.commons.math.ConvergenceException convergenceException37 = new org.apache.commons.math.ConvergenceException("org.apache.commons.math.ConvergenceException: hi!", (java.lang.Object[]) strArray10, (java.lang.Throwable) functionEvaluationException36);
        org.apache.commons.math.ode.DerivativeException derivativeException38 = new org.apache.commons.math.ode.DerivativeException((java.lang.Throwable) convergenceException37);
        org.apache.commons.math.ConvergenceException convergenceException39 = new org.apache.commons.math.ConvergenceException((java.lang.Throwable) derivativeException38);
        java.lang.String str40 = convergenceException39.getPattern();
        org.junit.Assert.assertNotNull(strArray10);
        org.junit.Assert.assertNotNull(strArray19);
        org.junit.Assert.assertNotNull(throwableArray31);
        org.junit.Assert.assertEquals("'" + str40 + "' != '" + "org.apache.commons.math.ConvergenceException: hi!" + "'", str40, "org.apache.commons.math.ConvergenceException: hi!");
    }

    @Test
    public void test16622() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest33.test16622");
        java.lang.String[] strArray13 = new java.lang.String[] { "hi!", "", "hi!", "hi!", "hi!" };
        org.apache.commons.math.ode.DerivativeException derivativeException14 = new org.apache.commons.math.ode.DerivativeException("", strArray13);
        org.apache.commons.math.MaxIterationsExceededException maxIterationsExceededException15 = new org.apache.commons.math.MaxIterationsExceededException(10, "org.apache.commons.math.FunctionEvaluationException: Evaluation failed for argument = 0", (java.lang.Object[]) strArray13);
        org.apache.commons.math.MaxIterationsExceededException maxIterationsExceededException17 = new org.apache.commons.math.MaxIterationsExceededException(3);
        org.apache.commons.math.FunctionEvaluationException functionEvaluationException18 = new org.apache.commons.math.FunctionEvaluationException((double) 0, "hi!", (java.lang.Object[]) strArray13, (java.lang.Throwable) maxIterationsExceededException17);
        org.apache.commons.math.ConvergenceException convergenceException19 = new org.apache.commons.math.ConvergenceException("hi!", (java.lang.Object[]) strArray13);
        org.apache.commons.math.MaxIterationsExceededException maxIterationsExceededException20 = new org.apache.commons.math.MaxIterationsExceededException((int) '4', "org.apache.commons.math.ConvergenceException: org.apache.commons.math.FunctionEvaluationException: hi!", (java.lang.Object[]) strArray13);
        int int21 = maxIterationsExceededException20.getMaxIterations();
        int int22 = maxIterationsExceededException20.getMaxIterations();
        org.junit.Assert.assertNotNull(strArray13);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 52 + "'", int21 == 52);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 52 + "'", int22 == 52);
    }

    @Test
    public void test16623() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest33.test16623");
        java.lang.Throwable throwable11 = null;
        org.apache.commons.math.ConvergenceException convergenceException12 = new org.apache.commons.math.ConvergenceException("hi!", throwable11);
        org.apache.commons.math.ode.DerivativeException derivativeException13 = new org.apache.commons.math.ode.DerivativeException((java.lang.Throwable) convergenceException12);
        java.lang.Throwable[] throwableArray14 = derivativeException13.getSuppressed();
        org.apache.commons.math.MaxIterationsExceededException maxIterationsExceededException15 = new org.apache.commons.math.MaxIterationsExceededException((int) (byte) 1, "org.apache.commons.math.FunctionEvaluationException: Evaluation failed for argument = 0", (java.lang.Object[]) throwableArray14);
        java.lang.String[] strArray24 = new java.lang.String[] { "hi!", "", "hi!", "hi!", "hi!" };
        org.apache.commons.math.ode.DerivativeException derivativeException25 = new org.apache.commons.math.ode.DerivativeException("", strArray24);
        org.apache.commons.math.ode.DerivativeException derivativeException26 = new org.apache.commons.math.ode.DerivativeException("org.apache.commons.math.FunctionEvaluationException: hi!", strArray24);
        org.apache.commons.math.MaxIterationsExceededException maxIterationsExceededException29 = new org.apache.commons.math.MaxIterationsExceededException(0);
        org.apache.commons.math.ConvergenceException convergenceException30 = new org.apache.commons.math.ConvergenceException("org.apache.commons.math.ConvergenceException: org.apache.commons.math.FunctionEvaluationException: hi!", (java.lang.Throwable) maxIterationsExceededException29);
        org.apache.commons.math.ConvergenceException convergenceException31 = new org.apache.commons.math.ConvergenceException("", (java.lang.Object[]) strArray24, (java.lang.Throwable) maxIterationsExceededException29);
        org.apache.commons.math.FunctionEvaluationException functionEvaluationException32 = new org.apache.commons.math.FunctionEvaluationException((double) (-1.0f), "org.apache.commons.math.ConvergenceException: org.apache.commons.math.ConvergenceException: org.apache.commons.math.FunctionEvaluationException: hi!", (java.lang.Object[]) throwableArray14, (java.lang.Throwable) maxIterationsExceededException29);
        org.apache.commons.math.FunctionEvaluationException functionEvaluationException33 = new org.apache.commons.math.FunctionEvaluationException((double) (short) 100, "org.apache.commons.math.FunctionEvaluationException: Evaluation failed for argument = 52", (java.lang.Object[]) throwableArray14);
        org.apache.commons.math.MaxIterationsExceededException maxIterationsExceededException34 = new org.apache.commons.math.MaxIterationsExceededException(32, "org.apache.commons.math.FunctionEvaluationException: Evaluation failed for argument = 0", (java.lang.Object[]) throwableArray14);
        java.lang.String[] strArray45 = new java.lang.String[] { "org.apache.commons.math.FunctionEvaluationException: hi!" };
        org.apache.commons.math.ode.DerivativeException derivativeException46 = new org.apache.commons.math.ode.DerivativeException("hi!", strArray45);
        org.apache.commons.math.ode.DerivativeException derivativeException47 = new org.apache.commons.math.ode.DerivativeException("", strArray45);
        org.apache.commons.math.ode.DerivativeException derivativeException48 = new org.apache.commons.math.ode.DerivativeException("Evaluation failed for argument = {0}", strArray45);
        org.apache.commons.math.ConvergenceException convergenceException49 = new org.apache.commons.math.ConvergenceException("org.apache.commons.math.ConvergenceException: hi!", (java.lang.Object[]) strArray45);
        org.apache.commons.math.ConvergenceException convergenceException50 = new org.apache.commons.math.ConvergenceException("org.apache.commons.math.ode.DerivativeException: ", (java.lang.Object[]) strArray45);
        org.apache.commons.math.MaxIterationsExceededException maxIterationsExceededException51 = new org.apache.commons.math.MaxIterationsExceededException((int) (short) 1, "org.apache.commons.math.ConvergenceException: org.apache.commons.math.ode.DerivativeException: ", (java.lang.Object[]) strArray45);
        int int52 = maxIterationsExceededException51.getMaxIterations();
        java.lang.Object[] objArray60 = new java.lang.Object[] { 1L, (byte) 10, (short) 1 };
        org.apache.commons.math.FunctionEvaluationException functionEvaluationException61 = new org.apache.commons.math.FunctionEvaluationException((-1.0d), "hi!", objArray60);
        org.apache.commons.math.FunctionEvaluationException functionEvaluationException62 = new org.apache.commons.math.FunctionEvaluationException((double) 0L, "", objArray60);
        java.lang.String str63 = functionEvaluationException62.getPattern();
        org.apache.commons.math.ConvergenceException convergenceException64 = new org.apache.commons.math.ConvergenceException((java.lang.Throwable) functionEvaluationException62);
        maxIterationsExceededException51.addSuppressed((java.lang.Throwable) convergenceException64);
        java.lang.Throwable[] throwableArray66 = convergenceException64.getSuppressed();
        org.apache.commons.math.FunctionEvaluationException functionEvaluationException67 = new org.apache.commons.math.FunctionEvaluationException((double) 2, "org.apache.commons.math.ode.DerivativeException: org.apache.commons.math.FunctionEvaluationException: hi!", (java.lang.Throwable) convergenceException64);
        org.apache.commons.math.FunctionEvaluationException functionEvaluationException68 = new org.apache.commons.math.FunctionEvaluationException((double) ' ', "org.apache.commons.math.MaxIterationsExceededException: org.apache.commons.math.ConvergenceException: org.apache.commons.math.FunctionEvaluationException: org.apache.commons.math.FunctionEvaluationException: org.apache.commons.math.ode.DerivativeException: ", (java.lang.Object[]) throwableArray14, (java.lang.Throwable) convergenceException64);
        org.junit.Assert.assertNotNull(throwableArray14);
        org.junit.Assert.assertNotNull(strArray24);
        org.junit.Assert.assertNotNull(strArray45);
        org.junit.Assert.assertTrue("'" + int52 + "' != '" + 1 + "'", int52 == 1);
        org.junit.Assert.assertNotNull(objArray60);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray60), "[1, 10, 1]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray60), "[1, 10, 1]");
        org.junit.Assert.assertEquals("'" + str63 + "' != '" + "" + "'", str63, "");
        org.junit.Assert.assertNotNull(throwableArray66);
    }

    @Test
    public void test16624() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest33.test16624");
        org.apache.commons.math.MaxIterationsExceededException maxIterationsExceededException4 = new org.apache.commons.math.MaxIterationsExceededException(3);
        org.apache.commons.math.ConvergenceException convergenceException5 = new org.apache.commons.math.ConvergenceException("org.apache.commons.math.ConvergenceException: org.apache.commons.math.FunctionEvaluationException: hi!", (java.lang.Throwable) maxIterationsExceededException4);
        int int6 = maxIterationsExceededException4.getMaxIterations();
        org.apache.commons.math.ode.DerivativeException derivativeException7 = new org.apache.commons.math.ode.DerivativeException((java.lang.Throwable) maxIterationsExceededException4);
        java.lang.Object[] objArray8 = derivativeException7.getArguments();
        java.lang.String[] strArray21 = new java.lang.String[] { "hi!", "", "hi!", "hi!", "hi!" };
        org.apache.commons.math.ode.DerivativeException derivativeException22 = new org.apache.commons.math.ode.DerivativeException("", strArray21);
        org.apache.commons.math.ode.DerivativeException derivativeException23 = new org.apache.commons.math.ode.DerivativeException("", strArray21);
        java.lang.Throwable throwable26 = null;
        org.apache.commons.math.ConvergenceException convergenceException27 = new org.apache.commons.math.ConvergenceException("hi!", throwable26);
        org.apache.commons.math.ode.DerivativeException derivativeException28 = new org.apache.commons.math.ode.DerivativeException((java.lang.Throwable) convergenceException27);
        java.lang.Throwable[] throwableArray29 = derivativeException28.getSuppressed();
        org.apache.commons.math.ConvergenceException convergenceException30 = new org.apache.commons.math.ConvergenceException("hi!", (java.lang.Throwable) derivativeException28);
        derivativeException23.addSuppressed((java.lang.Throwable) convergenceException30);
        java.lang.Throwable[] throwableArray32 = derivativeException23.getSuppressed();
        org.apache.commons.math.MaxIterationsExceededException maxIterationsExceededException33 = new org.apache.commons.math.MaxIterationsExceededException((int) ' ', "org.apache.commons.math.ConvergenceException: org.apache.commons.math.FunctionEvaluationException: hi!", (java.lang.Object[]) throwableArray32);
        org.apache.commons.math.FunctionEvaluationException functionEvaluationException35 = new org.apache.commons.math.FunctionEvaluationException(100.0d);
        org.apache.commons.math.FunctionEvaluationException functionEvaluationException36 = new org.apache.commons.math.FunctionEvaluationException((double) 97, "org.apache.commons.math.ode.DerivativeException: org.apache.commons.math.ConvergenceException: org.apache.commons.math.ConvergenceException: org.apache.commons.math.FunctionEvaluationException: hi!", (java.lang.Object[]) throwableArray32, (java.lang.Throwable) functionEvaluationException35);
        org.apache.commons.math.MaxIterationsExceededException maxIterationsExceededException38 = new org.apache.commons.math.MaxIterationsExceededException(1);
        org.apache.commons.math.ConvergenceException convergenceException39 = new org.apache.commons.math.ConvergenceException("org.apache.commons.math.FunctionEvaluationException: Evaluation failed for argument = {0}", (java.lang.Object[]) throwableArray32, (java.lang.Throwable) maxIterationsExceededException38);
        java.lang.String[] strArray56 = new java.lang.String[] { "hi!", "", "hi!", "hi!", "hi!" };
        org.apache.commons.math.ode.DerivativeException derivativeException57 = new org.apache.commons.math.ode.DerivativeException("", strArray56);
        org.apache.commons.math.ode.DerivativeException derivativeException58 = new org.apache.commons.math.ode.DerivativeException("", strArray56);
        org.apache.commons.math.ConvergenceException convergenceException59 = new org.apache.commons.math.ConvergenceException("org.apache.commons.math.FunctionEvaluationException: hi!", (java.lang.Object[]) strArray56);
        org.apache.commons.math.ConvergenceException convergenceException60 = new org.apache.commons.math.ConvergenceException("", (java.lang.Object[]) strArray56);
        org.apache.commons.math.FunctionEvaluationException functionEvaluationException61 = new org.apache.commons.math.FunctionEvaluationException((double) (-1L), "org.apache.commons.math.ConvergenceException: org.apache.commons.math.FunctionEvaluationException: hi!", (java.lang.Object[]) strArray56);
        org.apache.commons.math.MaxIterationsExceededException maxIterationsExceededException62 = new org.apache.commons.math.MaxIterationsExceededException((int) (byte) 1, "org.apache.commons.math.FunctionEvaluationException: ", (java.lang.Object[]) strArray56);
        java.lang.String[] strArray73 = new java.lang.String[] { "hi!", "", "hi!", "hi!", "hi!" };
        org.apache.commons.math.ode.DerivativeException derivativeException74 = new org.apache.commons.math.ode.DerivativeException("", strArray73);
        org.apache.commons.math.ode.DerivativeException derivativeException75 = new org.apache.commons.math.ode.DerivativeException("", strArray73);
        java.lang.Throwable throwable78 = null;
        org.apache.commons.math.ConvergenceException convergenceException79 = new org.apache.commons.math.ConvergenceException("hi!", throwable78);
        org.apache.commons.math.ode.DerivativeException derivativeException80 = new org.apache.commons.math.ode.DerivativeException((java.lang.Throwable) convergenceException79);
        java.lang.Throwable[] throwableArray81 = derivativeException80.getSuppressed();
        org.apache.commons.math.ConvergenceException convergenceException82 = new org.apache.commons.math.ConvergenceException("hi!", (java.lang.Throwable) derivativeException80);
        derivativeException75.addSuppressed((java.lang.Throwable) convergenceException82);
        org.apache.commons.math.FunctionEvaluationException functionEvaluationException84 = new org.apache.commons.math.FunctionEvaluationException((double) (short) 100, "org.apache.commons.math.ConvergenceException: hi!", (java.lang.Throwable) convergenceException82);
        org.apache.commons.math.FunctionEvaluationException functionEvaluationException85 = new org.apache.commons.math.FunctionEvaluationException((double) 1, (java.lang.Throwable) convergenceException82);
        org.apache.commons.math.FunctionEvaluationException functionEvaluationException86 = new org.apache.commons.math.FunctionEvaluationException(1.0d, "", (java.lang.Object[]) strArray56, (java.lang.Throwable) convergenceException82);
        org.apache.commons.math.FunctionEvaluationException functionEvaluationException87 = new org.apache.commons.math.FunctionEvaluationException(52.0d, (java.lang.Throwable) convergenceException82);
        convergenceException39.addSuppressed((java.lang.Throwable) functionEvaluationException87);
        org.apache.commons.math.ConvergenceException convergenceException89 = new org.apache.commons.math.ConvergenceException("org.apache.commons.math.ConvergenceException: org.apache.commons.math.ConvergenceException: org.apache.commons.math.ConvergenceException: org.apache.commons.math.ConvergenceException: org.apache.commons.math.FunctionEvaluationException: hi!", objArray8, (java.lang.Throwable) functionEvaluationException87);
        org.apache.commons.math.ode.DerivativeException derivativeException90 = new org.apache.commons.math.ode.DerivativeException((java.lang.Throwable) functionEvaluationException87);
        org.apache.commons.math.FunctionEvaluationException functionEvaluationException91 = new org.apache.commons.math.FunctionEvaluationException((double) (short) 1, (java.lang.Throwable) derivativeException90);
        double double92 = functionEvaluationException91.getArgument();
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 3 + "'", int6 == 3);
        org.junit.Assert.assertNotNull(objArray8);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray8), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray8), "[]");
        org.junit.Assert.assertNotNull(strArray21);
        org.junit.Assert.assertNotNull(throwableArray29);
        org.junit.Assert.assertNotNull(throwableArray32);
        org.junit.Assert.assertNotNull(strArray56);
        org.junit.Assert.assertNotNull(strArray73);
        org.junit.Assert.assertNotNull(throwableArray81);
        org.junit.Assert.assertTrue("'" + double92 + "' != '" + 1.0d + "'", double92 == 1.0d);
    }

    @Test
    public void test16625() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest33.test16625");
        org.apache.commons.math.MaxIterationsExceededException maxIterationsExceededException10 = new org.apache.commons.math.MaxIterationsExceededException(0);
        java.lang.Throwable[] throwableArray11 = maxIterationsExceededException10.getSuppressed();
        org.apache.commons.math.ConvergenceException convergenceException12 = new org.apache.commons.math.ConvergenceException("org.apache.commons.math.ConvergenceException: org.apache.commons.math.FunctionEvaluationException: hi!", (java.lang.Object[]) throwableArray11);
        org.apache.commons.math.ConvergenceException convergenceException13 = new org.apache.commons.math.ConvergenceException("hi!", (java.lang.Object[]) throwableArray11);
        org.apache.commons.math.MaxIterationsExceededException maxIterationsExceededException14 = new org.apache.commons.math.MaxIterationsExceededException((int) (short) 0, "Evaluation failed for argument = {0}", (java.lang.Object[]) throwableArray11);
        org.apache.commons.math.FunctionEvaluationException functionEvaluationException15 = new org.apache.commons.math.FunctionEvaluationException((double) 52, "org.apache.commons.math.FunctionEvaluationException: org.apache.commons.math.MaxIterationsExceededException: org.apache.commons.math.ConvergenceException: ", (java.lang.Object[]) throwableArray11);
        org.apache.commons.math.FunctionEvaluationException functionEvaluationException16 = new org.apache.commons.math.FunctionEvaluationException((double) 97, "org.apache.commons.math.ConvergenceException: org.apache.commons.math.FunctionEvaluationException: org.apache.commons.math.MaxIterationsExceededException: org.apache.commons.math.FunctionEvaluationException: hi!", (java.lang.Object[]) throwableArray11);
        java.lang.String[] strArray25 = new java.lang.String[] { "hi!", "", "hi!", "hi!", "hi!" };
        org.apache.commons.math.ode.DerivativeException derivativeException26 = new org.apache.commons.math.ode.DerivativeException("", strArray25);
        org.apache.commons.math.ode.DerivativeException derivativeException27 = new org.apache.commons.math.ode.DerivativeException("org.apache.commons.math.ConvergenceException: org.apache.commons.math.FunctionEvaluationException: hi!", strArray25);
        org.apache.commons.math.ConvergenceException convergenceException28 = new org.apache.commons.math.ConvergenceException((java.lang.Throwable) derivativeException27);
        java.lang.Object[] objArray29 = derivativeException27.getArguments();
        org.apache.commons.math.FunctionEvaluationException functionEvaluationException31 = new org.apache.commons.math.FunctionEvaluationException((double) 100L);
        java.lang.Throwable[] throwableArray32 = functionEvaluationException31.getSuppressed();
        org.apache.commons.math.ConvergenceException convergenceException33 = new org.apache.commons.math.ConvergenceException("org.apache.commons.math.ConvergenceException: org.apache.commons.math.FunctionEvaluationException: org.apache.commons.math.ode.DerivativeException: ", objArray29, (java.lang.Throwable) functionEvaluationException31);
        java.lang.Object[] objArray34 = convergenceException33.getArguments();
        java.lang.String str35 = convergenceException33.getPattern();
        org.apache.commons.math.ConvergenceException convergenceException36 = new org.apache.commons.math.ConvergenceException("org.apache.commons.math.ConvergenceException: org.apache.commons.math.ConvergenceException: org.apache.commons.math.ConvergenceException: org.apache.commons.math.ConvergenceException: org.apache.commons.math.FunctionEvaluationException: hi!", (java.lang.Object[]) throwableArray11, (java.lang.Throwable) convergenceException33);
        java.lang.Throwable[] throwableArray37 = convergenceException33.getSuppressed();
        java.lang.Throwable[] throwableArray38 = convergenceException33.getSuppressed();
        org.junit.Assert.assertNotNull(throwableArray11);
        org.junit.Assert.assertNotNull(strArray25);
        org.junit.Assert.assertNotNull(objArray29);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray29), "[hi!, , hi!, hi!, hi!]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray29), "[hi!, , hi!, hi!, hi!]");
        org.junit.Assert.assertNotNull(throwableArray32);
        org.junit.Assert.assertNotNull(objArray34);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray34), "[hi!, , hi!, hi!, hi!]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray34), "[hi!, , hi!, hi!, hi!]");
        org.junit.Assert.assertEquals("'" + str35 + "' != '" + "org.apache.commons.math.ConvergenceException: org.apache.commons.math.FunctionEvaluationException: org.apache.commons.math.ode.DerivativeException: " + "'", str35, "org.apache.commons.math.ConvergenceException: org.apache.commons.math.FunctionEvaluationException: org.apache.commons.math.ode.DerivativeException: ");
        org.junit.Assert.assertNotNull(throwableArray37);
        org.junit.Assert.assertNotNull(throwableArray38);
    }

    @Test
    public void test16626() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest33.test16626");
        java.lang.String[] strArray11 = new java.lang.String[] { "hi!", "", "hi!", "hi!", "hi!" };
        org.apache.commons.math.ode.DerivativeException derivativeException12 = new org.apache.commons.math.ode.DerivativeException("", strArray11);
        org.apache.commons.math.ode.DerivativeException derivativeException13 = new org.apache.commons.math.ode.DerivativeException("", strArray11);
        java.lang.String[] strArray20 = new java.lang.String[] { "hi!", "", "hi!", "hi!", "hi!" };
        org.apache.commons.math.ode.DerivativeException derivativeException21 = new org.apache.commons.math.ode.DerivativeException("", strArray20);
        org.apache.commons.math.ode.DerivativeException derivativeException22 = new org.apache.commons.math.ode.DerivativeException((java.lang.Throwable) derivativeException21);
        org.apache.commons.math.ConvergenceException convergenceException23 = new org.apache.commons.math.ConvergenceException("hi!", (java.lang.Object[]) strArray11, (java.lang.Throwable) derivativeException21);
        org.apache.commons.math.ode.DerivativeException derivativeException24 = new org.apache.commons.math.ode.DerivativeException("hi!", strArray11);
        org.apache.commons.math.ode.DerivativeException derivativeException25 = new org.apache.commons.math.ode.DerivativeException("hi!", strArray11);
        org.apache.commons.math.FunctionEvaluationException functionEvaluationException26 = new org.apache.commons.math.FunctionEvaluationException((double) (short) -1, (java.lang.Throwable) derivativeException25);
        java.lang.String[] strArray38 = new java.lang.String[] { "Evaluation failed for argument = {0}", "Evaluation failed for argument = {0}", "Evaluation failed for argument = {0}", "", "", "org.apache.commons.math.ConvergenceException: org.apache.commons.math.FunctionEvaluationException: hi!" };
        org.apache.commons.math.ode.DerivativeException derivativeException39 = new org.apache.commons.math.ode.DerivativeException("Evaluation failed for argument = {0}", strArray38);
        org.apache.commons.math.FunctionEvaluationException functionEvaluationException40 = new org.apache.commons.math.FunctionEvaluationException((double) 3, "", (java.lang.Throwable) derivativeException39);
        org.apache.commons.math.FunctionEvaluationException functionEvaluationException41 = new org.apache.commons.math.FunctionEvaluationException((double) 0, "org.apache.commons.math.MaxIterationsExceededException: org.apache.commons.math.ConvergenceException: ", (java.lang.Throwable) functionEvaluationException40);
        java.lang.String str42 = functionEvaluationException40.getPattern();
        derivativeException25.addSuppressed((java.lang.Throwable) functionEvaluationException40);
        double double44 = functionEvaluationException40.getArgument();
        org.junit.Assert.assertNotNull(strArray11);
        org.junit.Assert.assertNotNull(strArray20);
        org.junit.Assert.assertNotNull(strArray38);
        org.junit.Assert.assertEquals("'" + str42 + "' != '" + "" + "'", str42, "");
        org.junit.Assert.assertTrue("'" + double44 + "' != '" + 3.0d + "'", double44 == 3.0d);
    }

    @Test
    public void test16627() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest33.test16627");
        java.lang.String[] strArray12 = new java.lang.String[] { "org.apache.commons.math.FunctionEvaluationException: hi!" };
        org.apache.commons.math.ode.DerivativeException derivativeException13 = new org.apache.commons.math.ode.DerivativeException("hi!", strArray12);
        java.lang.Object[] objArray23 = new java.lang.Object[] { 1L, (byte) 10, (short) 1 };
        org.apache.commons.math.FunctionEvaluationException functionEvaluationException24 = new org.apache.commons.math.FunctionEvaluationException((-1.0d), "hi!", objArray23);
        java.lang.Throwable throwable25 = null;
        org.apache.commons.math.FunctionEvaluationException functionEvaluationException26 = new org.apache.commons.math.FunctionEvaluationException((double) (short) 1, "hi!", objArray23, throwable25);
        org.apache.commons.math.FunctionEvaluationException functionEvaluationException27 = new org.apache.commons.math.FunctionEvaluationException((-1.0d), "Evaluation failed for argument = {0}", throwable25);
        org.apache.commons.math.ConvergenceException convergenceException28 = new org.apache.commons.math.ConvergenceException("org.apache.commons.math.ConvergenceException: hi!", (java.lang.Object[]) strArray12, (java.lang.Throwable) functionEvaluationException27);
        org.apache.commons.math.FunctionEvaluationException functionEvaluationException29 = new org.apache.commons.math.FunctionEvaluationException((-1.0d), "org.apache.commons.math.MaxIterationsExceededException: org.apache.commons.math.FunctionEvaluationException: Evaluation failed for argument = 0", (java.lang.Object[]) strArray12);
        org.apache.commons.math.ConvergenceException convergenceException30 = new org.apache.commons.math.ConvergenceException("org.apache.commons.math.FunctionEvaluationException: hi!", (java.lang.Object[]) strArray12);
        org.apache.commons.math.FunctionEvaluationException functionEvaluationException31 = new org.apache.commons.math.FunctionEvaluationException((double) (-1.0f), "org.apache.commons.math.FunctionEvaluationException: org.apache.commons.math.ConvergenceException: org.apache.commons.math.ConvergenceException: org.apache.commons.math.FunctionEvaluationException: hi!", (java.lang.Object[]) strArray12);
        org.apache.commons.math.ode.DerivativeException derivativeException32 = new org.apache.commons.math.ode.DerivativeException("org.apache.commons.math.MaxIterationsExceededException: Maximal number of iterations (10) exceeded", strArray12);
        org.apache.commons.math.ConvergenceException convergenceException33 = new org.apache.commons.math.ConvergenceException("org.apache.commons.math.ConvergenceException: org.apache.commons.math.ConvergenceException: Evaluation failed for argument = 100", (java.lang.Object[]) strArray12);
        org.apache.commons.math.FunctionEvaluationException functionEvaluationException34 = new org.apache.commons.math.FunctionEvaluationException(32.0d, "org.apache.commons.math.FunctionEvaluationException: org.apache.commons.math.FunctionEvaluationException: org.apache.commons.math.FunctionEvaluationException: org.apache.commons.math.FunctionEvaluationException: org.apache.commons.math.FunctionEvaluationException: Evaluation failed for argument = 97", (java.lang.Object[]) strArray12);
        double double35 = functionEvaluationException34.getArgument();
        org.junit.Assert.assertNotNull(strArray12);
        org.junit.Assert.assertNotNull(objArray23);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray23), "[1, 10, 1]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray23), "[1, 10, 1]");
        org.junit.Assert.assertTrue("'" + double35 + "' != '" + 32.0d + "'", double35 == 32.0d);
    }
}

