import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class RegressionTest31 {

    public static boolean debug = false;

    @Test
    public void test15501() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest31.test15501");
        org.apache.commons.math.MathException mathException6 = new org.apache.commons.math.MathException("org.apache.commons.math.FunctionEvaluationException: Maximal number of iterations ({0}) exceeded");
        org.apache.commons.math.ConvergenceException convergenceException7 = new org.apache.commons.math.ConvergenceException((java.lang.Throwable) mathException6);
        org.apache.commons.math.FunctionEvaluationException functionEvaluationException8 = new org.apache.commons.math.FunctionEvaluationException((double) 1, "", (java.lang.Throwable) mathException6);
        java.lang.String str9 = mathException6.getPattern();
        org.apache.commons.math.MathException mathException10 = new org.apache.commons.math.MathException("org.apache.commons.math.MaxIterationsExceededException: org.apache.commons.math.MaxIterationsExceededException: ", (java.lang.Throwable) mathException6);
        org.apache.commons.math.FunctionEvaluationException functionEvaluationException11 = new org.apache.commons.math.FunctionEvaluationException((double) '#', "org.apache.commons.math.MaxIterationsExceededException: org.apache.commons.math.MaxIterationsExceededException: org.apache.commons.math.MathException: org.apache.commons.math.FunctionEvaluationException: hi!", (java.lang.Throwable) mathException6);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "org.apache.commons.math.FunctionEvaluationException: Maximal number of iterations ({0}) exceeded" + "'", str9, "org.apache.commons.math.FunctionEvaluationException: Maximal number of iterations ({0}) exceeded");
    }

    @Test
    public void test15502() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest31.test15502");
        java.lang.Object[] objArray14 = new java.lang.Object[] {};
        java.lang.Throwable throwable17 = null;
        org.apache.commons.math.FunctionEvaluationException functionEvaluationException18 = new org.apache.commons.math.FunctionEvaluationException((double) 'a', "hi!", throwable17);
        org.apache.commons.math.FunctionEvaluationException functionEvaluationException19 = new org.apache.commons.math.FunctionEvaluationException((-1.0d), "", objArray14, (java.lang.Throwable) functionEvaluationException18);
        org.apache.commons.math.FunctionEvaluationException functionEvaluationException20 = new org.apache.commons.math.FunctionEvaluationException((double) (byte) 0, "hi!", objArray14);
        org.apache.commons.math.MaxIterationsExceededException maxIterationsExceededException21 = new org.apache.commons.math.MaxIterationsExceededException(0, "", objArray14);
        org.apache.commons.math.MathException mathException22 = new org.apache.commons.math.MathException("hi!", objArray14);
        org.apache.commons.math.ConvergenceException convergenceException23 = new org.apache.commons.math.ConvergenceException("org.apache.commons.math.FunctionEvaluationException: org.apache.commons.math.FunctionEvaluationException: org.apache.commons.math.FunctionEvaluationException: hi!", objArray14);
        org.apache.commons.math.MathException mathException24 = new org.apache.commons.math.MathException("org.apache.commons.math.MathException: org.apache.commons.math.MaxIterationsExceededException: org.apache.commons.math.FunctionEvaluationException: Evaluation failed for argument = -1", objArray14);
        org.apache.commons.math.ConvergenceException convergenceException25 = new org.apache.commons.math.ConvergenceException("org.apache.commons.math.ConvergenceException: org.apache.commons.math.FunctionEvaluationException: hi!", objArray14);
        org.apache.commons.math.MathException mathException26 = new org.apache.commons.math.MathException("", objArray14);
        org.apache.commons.math.MathException mathException27 = new org.apache.commons.math.MathException("org.apache.commons.math.MaxIterationsExceededException: org.apache.commons.math.MathException: org.apache.commons.math.FunctionEvaluationException: hi!", objArray14);
        org.apache.commons.math.MathException mathException28 = new org.apache.commons.math.MathException("org.apache.commons.math.ConvergenceException: org.apache.commons.math.MaxIterationsExceededException: org.apache.commons.math.MaxIterationsExceededException: ", objArray14);
        org.apache.commons.math.ConvergenceException convergenceException29 = new org.apache.commons.math.ConvergenceException("org.apache.commons.math.FunctionEvaluationException: org.apache.commons.math.FunctionEvaluationException: Evaluation failed for argument = {0}", objArray14);
        org.junit.Assert.assertNotNull(objArray14);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray14), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray14), "[]");
    }

    @Test
    public void test15503() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest31.test15503");
        java.lang.Throwable throwable8 = null;
        org.apache.commons.math.FunctionEvaluationException functionEvaluationException9 = new org.apache.commons.math.FunctionEvaluationException((double) 'a', "hi!", throwable8);
        java.lang.String str10 = functionEvaluationException9.getPattern();
        org.apache.commons.math.ConvergenceException convergenceException11 = new org.apache.commons.math.ConvergenceException((java.lang.Throwable) functionEvaluationException9);
        org.apache.commons.math.MathException mathException12 = new org.apache.commons.math.MathException((java.lang.Throwable) functionEvaluationException9);
        org.apache.commons.math.ConvergenceException convergenceException13 = new org.apache.commons.math.ConvergenceException((java.lang.Throwable) mathException12);
        org.apache.commons.math.MathException mathException14 = new org.apache.commons.math.MathException("org.apache.commons.math.MaxIterationsExceededException: org.apache.commons.math.MaxIterationsExceededException: ", (java.lang.Throwable) convergenceException13);
        org.apache.commons.math.FunctionEvaluationException functionEvaluationException15 = new org.apache.commons.math.FunctionEvaluationException((double) (byte) 1, (java.lang.Throwable) mathException14);
        org.apache.commons.math.FunctionEvaluationException functionEvaluationException16 = new org.apache.commons.math.FunctionEvaluationException(97.0d, "org.apache.commons.math.FunctionEvaluationException: hi!", (java.lang.Throwable) mathException14);
        org.apache.commons.math.MathException mathException17 = new org.apache.commons.math.MathException("", (java.lang.Throwable) mathException14);
        java.lang.Throwable[] throwableArray18 = mathException17.getSuppressed();
        org.apache.commons.math.FunctionEvaluationException functionEvaluationException19 = new org.apache.commons.math.FunctionEvaluationException((double) (short) 10, (java.lang.Throwable) mathException17);
        java.lang.Throwable[] throwableArray20 = functionEvaluationException19.getSuppressed();
        java.lang.Class<?> wildcardClass21 = functionEvaluationException19.getClass();
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertNotNull(throwableArray18);
        org.junit.Assert.assertNotNull(throwableArray20);
        org.junit.Assert.assertNotNull(wildcardClass21);
    }

    @Test
    public void test15504() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest31.test15504");
        org.apache.commons.math.MaxIterationsExceededException maxIterationsExceededException2 = new org.apache.commons.math.MaxIterationsExceededException((int) (byte) 0);
        int int3 = maxIterationsExceededException2.getMaxIterations();
        int int4 = maxIterationsExceededException2.getMaxIterations();
        java.lang.Throwable[] throwableArray5 = maxIterationsExceededException2.getSuppressed();
        org.apache.commons.math.MathException mathException6 = new org.apache.commons.math.MathException("org.apache.commons.math.FunctionEvaluationException: org.apache.commons.math.ConvergenceException: org.apache.commons.math.FunctionEvaluationException: ", (java.lang.Object[]) throwableArray5);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertNotNull(throwableArray5);
    }

    @Test
    public void test15505() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest31.test15505");
        java.lang.Throwable throwable11 = null;
        org.apache.commons.math.FunctionEvaluationException functionEvaluationException12 = new org.apache.commons.math.FunctionEvaluationException((double) 'a', "hi!", throwable11);
        java.lang.String str13 = functionEvaluationException12.getPattern();
        org.apache.commons.math.ConvergenceException convergenceException14 = new org.apache.commons.math.ConvergenceException((java.lang.Throwable) functionEvaluationException12);
        org.apache.commons.math.MathException mathException15 = new org.apache.commons.math.MathException((java.lang.Throwable) functionEvaluationException12);
        org.apache.commons.math.ConvergenceException convergenceException16 = new org.apache.commons.math.ConvergenceException((java.lang.Throwable) mathException15);
        org.apache.commons.math.MathException mathException17 = new org.apache.commons.math.MathException("org.apache.commons.math.MaxIterationsExceededException: org.apache.commons.math.MaxIterationsExceededException: ", (java.lang.Throwable) convergenceException16);
        org.apache.commons.math.FunctionEvaluationException functionEvaluationException18 = new org.apache.commons.math.FunctionEvaluationException((double) (byte) 1, (java.lang.Throwable) mathException17);
        org.apache.commons.math.FunctionEvaluationException functionEvaluationException19 = new org.apache.commons.math.FunctionEvaluationException(97.0d, "org.apache.commons.math.FunctionEvaluationException: hi!", (java.lang.Throwable) mathException17);
        org.apache.commons.math.MathException mathException20 = new org.apache.commons.math.MathException("", (java.lang.Throwable) mathException17);
        java.lang.Throwable[] throwableArray21 = mathException20.getSuppressed();
        org.apache.commons.math.FunctionEvaluationException functionEvaluationException22 = new org.apache.commons.math.FunctionEvaluationException((double) (short) 10, (java.lang.Throwable) mathException20);
        java.lang.Throwable[] throwableArray23 = functionEvaluationException22.getSuppressed();
        java.lang.Object[] objArray28 = new java.lang.Object[] {};
        java.lang.Throwable throwable31 = null;
        org.apache.commons.math.FunctionEvaluationException functionEvaluationException32 = new org.apache.commons.math.FunctionEvaluationException((double) 'a', "hi!", throwable31);
        org.apache.commons.math.FunctionEvaluationException functionEvaluationException33 = new org.apache.commons.math.FunctionEvaluationException((-1.0d), "", objArray28, (java.lang.Throwable) functionEvaluationException32);
        java.lang.Object[] objArray34 = functionEvaluationException32.getArguments();
        java.lang.Throwable throwable39 = null;
        org.apache.commons.math.FunctionEvaluationException functionEvaluationException40 = new org.apache.commons.math.FunctionEvaluationException((double) 'a', "hi!", throwable39);
        java.lang.String str41 = functionEvaluationException40.getPattern();
        org.apache.commons.math.ConvergenceException convergenceException42 = new org.apache.commons.math.ConvergenceException((java.lang.Throwable) functionEvaluationException40);
        org.apache.commons.math.FunctionEvaluationException functionEvaluationException43 = new org.apache.commons.math.FunctionEvaluationException((double) 0, "", (java.lang.Throwable) functionEvaluationException40);
        org.apache.commons.math.ConvergenceException convergenceException44 = new org.apache.commons.math.ConvergenceException("org.apache.commons.math.MaxIterationsExceededException: ", objArray34, (java.lang.Throwable) functionEvaluationException43);
        org.apache.commons.math.ConvergenceException convergenceException45 = new org.apache.commons.math.ConvergenceException("org.apache.commons.math.FunctionEvaluationException: Evaluation failed for argument = 1", objArray34);
        java.lang.String str46 = convergenceException45.getPattern();
        org.apache.commons.math.ConvergenceException convergenceException47 = new org.apache.commons.math.ConvergenceException("org.apache.commons.math.FunctionEvaluationException: org.apache.commons.math.ConvergenceException: org.apache.commons.math.MathException: ", (java.lang.Object[]) throwableArray23, (java.lang.Throwable) convergenceException45);
        org.apache.commons.math.FunctionEvaluationException functionEvaluationException48 = new org.apache.commons.math.FunctionEvaluationException((double) 10, "org.apache.commons.math.ConvergenceException: org.apache.commons.math.ConvergenceException: org.apache.commons.math.ConvergenceException: org.apache.commons.math.MaxIterationsExceededException: ", (java.lang.Throwable) convergenceException45);
        org.apache.commons.math.MathException mathException49 = new org.apache.commons.math.MathException((java.lang.Throwable) functionEvaluationException48);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "hi!" + "'", str13, "hi!");
        org.junit.Assert.assertNotNull(throwableArray21);
        org.junit.Assert.assertNotNull(throwableArray23);
        org.junit.Assert.assertNotNull(objArray28);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray28), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray28), "[]");
        org.junit.Assert.assertNotNull(objArray34);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray34), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray34), "[]");
        org.junit.Assert.assertEquals("'" + str41 + "' != '" + "hi!" + "'", str41, "hi!");
        org.junit.Assert.assertEquals("'" + str46 + "' != '" + "org.apache.commons.math.FunctionEvaluationException: Evaluation failed for argument = 1" + "'", str46, "org.apache.commons.math.FunctionEvaluationException: Evaluation failed for argument = 1");
    }

    @Test
    public void test15506() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest31.test15506");
        java.lang.Object[] objArray14 = new java.lang.Object[] {};
        java.lang.Throwable throwable17 = null;
        org.apache.commons.math.FunctionEvaluationException functionEvaluationException18 = new org.apache.commons.math.FunctionEvaluationException((double) 'a', "hi!", throwable17);
        org.apache.commons.math.FunctionEvaluationException functionEvaluationException19 = new org.apache.commons.math.FunctionEvaluationException((-1.0d), "", objArray14, (java.lang.Throwable) functionEvaluationException18);
        java.lang.Object[] objArray22 = new java.lang.Object[] {};
        java.lang.Throwable throwable25 = null;
        org.apache.commons.math.FunctionEvaluationException functionEvaluationException26 = new org.apache.commons.math.FunctionEvaluationException((double) 'a', "hi!", throwable25);
        org.apache.commons.math.FunctionEvaluationException functionEvaluationException27 = new org.apache.commons.math.FunctionEvaluationException((-1.0d), "", objArray22, (java.lang.Throwable) functionEvaluationException26);
        java.lang.Object[] objArray28 = functionEvaluationException26.getArguments();
        org.apache.commons.math.ConvergenceException convergenceException29 = new org.apache.commons.math.ConvergenceException("", objArray14, (java.lang.Throwable) functionEvaluationException26);
        org.apache.commons.math.FunctionEvaluationException functionEvaluationException30 = new org.apache.commons.math.FunctionEvaluationException((double) 1L, "", (java.lang.Throwable) convergenceException29);
        org.apache.commons.math.FunctionEvaluationException functionEvaluationException31 = new org.apache.commons.math.FunctionEvaluationException((double) (byte) -1, (java.lang.Throwable) convergenceException29);
        java.lang.Throwable[] throwableArray32 = convergenceException29.getSuppressed();
        org.apache.commons.math.MathException mathException33 = new org.apache.commons.math.MathException("", (java.lang.Object[]) throwableArray32);
        java.lang.Object[] objArray39 = new java.lang.Object[] {};
        java.lang.Throwable throwable42 = null;
        org.apache.commons.math.FunctionEvaluationException functionEvaluationException43 = new org.apache.commons.math.FunctionEvaluationException((double) 'a', "hi!", throwable42);
        org.apache.commons.math.FunctionEvaluationException functionEvaluationException44 = new org.apache.commons.math.FunctionEvaluationException((-1.0d), "", objArray39, (java.lang.Throwable) functionEvaluationException43);
        org.apache.commons.math.FunctionEvaluationException functionEvaluationException45 = new org.apache.commons.math.FunctionEvaluationException((double) (byte) -1, (java.lang.Throwable) functionEvaluationException43);
        java.lang.Throwable[] throwableArray46 = functionEvaluationException43.getSuppressed();
        org.apache.commons.math.ConvergenceException convergenceException47 = new org.apache.commons.math.ConvergenceException("hi!", (java.lang.Object[]) throwableArray46);
        org.apache.commons.math.FunctionEvaluationException functionEvaluationException50 = new org.apache.commons.math.FunctionEvaluationException((double) (short) 0, "");
        org.apache.commons.math.ConvergenceException convergenceException51 = new org.apache.commons.math.ConvergenceException("", (java.lang.Object[]) throwableArray46, (java.lang.Throwable) functionEvaluationException50);
        double double52 = functionEvaluationException50.getArgument();
        org.apache.commons.math.FunctionEvaluationException functionEvaluationException53 = new org.apache.commons.math.FunctionEvaluationException((double) (short) 10, "org.apache.commons.math.FunctionEvaluationException: org.apache.commons.math.FunctionEvaluationException: hi!", (java.lang.Object[]) throwableArray32, (java.lang.Throwable) functionEvaluationException50);
        org.apache.commons.math.ConvergenceException convergenceException54 = new org.apache.commons.math.ConvergenceException("org.apache.commons.math.MathException: hi!", (java.lang.Object[]) throwableArray32);
        java.lang.Object[] objArray55 = convergenceException54.getArguments();
        org.apache.commons.math.FunctionEvaluationException functionEvaluationException58 = new org.apache.commons.math.FunctionEvaluationException((double) 0.0f, "org.apache.commons.math.FunctionEvaluationException: org.apache.commons.math.FunctionEvaluationException: hi!");
        java.lang.Object[] objArray59 = functionEvaluationException58.getArguments();
        org.apache.commons.math.ConvergenceException convergenceException60 = new org.apache.commons.math.ConvergenceException("org.apache.commons.math.MaxIterationsExceededException: org.apache.commons.math.MathException: Evaluation failed for argument = 0", objArray55, (java.lang.Throwable) functionEvaluationException58);
        org.apache.commons.math.ConvergenceException convergenceException61 = new org.apache.commons.math.ConvergenceException("org.apache.commons.math.MathException: Evaluation failed for argument = 0", (java.lang.Throwable) convergenceException60);
        org.apache.commons.math.MathException mathException62 = new org.apache.commons.math.MathException((java.lang.Throwable) convergenceException61);
        org.apache.commons.math.ConvergenceException convergenceException63 = new org.apache.commons.math.ConvergenceException("org.apache.commons.math.ConvergenceException: org.apache.commons.math.FunctionEvaluationException: Evaluation failed for argument = {0}", (java.lang.Throwable) convergenceException61);
        org.apache.commons.math.MathException mathException64 = new org.apache.commons.math.MathException((java.lang.Throwable) convergenceException61);
        org.apache.commons.math.MathException mathException65 = new org.apache.commons.math.MathException("org.apache.commons.math.MaxIterationsExceededException: org.apache.commons.math.MathException: ", (java.lang.Throwable) mathException64);
        org.apache.commons.math.ConvergenceException convergenceException66 = new org.apache.commons.math.ConvergenceException((java.lang.Throwable) mathException65);
        java.lang.Object[] objArray67 = mathException65.getArguments();
        org.junit.Assert.assertNotNull(objArray14);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray14), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray14), "[]");
        org.junit.Assert.assertNotNull(objArray22);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray22), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray22), "[]");
        org.junit.Assert.assertNotNull(objArray28);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray28), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray28), "[]");
        org.junit.Assert.assertNotNull(throwableArray32);
        org.junit.Assert.assertNotNull(objArray39);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray39), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray39), "[]");
        org.junit.Assert.assertNotNull(throwableArray46);
        org.junit.Assert.assertTrue("'" + double52 + "' != '" + 0.0d + "'", double52 == 0.0d);
        org.junit.Assert.assertNotNull(objArray55);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray55), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray55), "[]");
        org.junit.Assert.assertNotNull(objArray59);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray59), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray59), "[]");
        org.junit.Assert.assertNotNull(objArray67);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray67), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray67), "[]");
    }

    @Test
    public void test15507() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest31.test15507");
        java.lang.Object[] objArray13 = new java.lang.Object[] {};
        java.lang.Throwable throwable16 = null;
        org.apache.commons.math.FunctionEvaluationException functionEvaluationException17 = new org.apache.commons.math.FunctionEvaluationException((double) 'a', "hi!", throwable16);
        org.apache.commons.math.FunctionEvaluationException functionEvaluationException18 = new org.apache.commons.math.FunctionEvaluationException((-1.0d), "", objArray13, (java.lang.Throwable) functionEvaluationException17);
        java.lang.Object[] objArray21 = new java.lang.Object[] {};
        java.lang.Throwable throwable24 = null;
        org.apache.commons.math.FunctionEvaluationException functionEvaluationException25 = new org.apache.commons.math.FunctionEvaluationException((double) 'a', "hi!", throwable24);
        org.apache.commons.math.FunctionEvaluationException functionEvaluationException26 = new org.apache.commons.math.FunctionEvaluationException((-1.0d), "", objArray21, (java.lang.Throwable) functionEvaluationException25);
        java.lang.Object[] objArray27 = functionEvaluationException25.getArguments();
        org.apache.commons.math.ConvergenceException convergenceException28 = new org.apache.commons.math.ConvergenceException("", objArray13, (java.lang.Throwable) functionEvaluationException25);
        org.apache.commons.math.FunctionEvaluationException functionEvaluationException29 = new org.apache.commons.math.FunctionEvaluationException((double) 1L, "", (java.lang.Throwable) convergenceException28);
        org.apache.commons.math.FunctionEvaluationException functionEvaluationException30 = new org.apache.commons.math.FunctionEvaluationException((double) (byte) -1, (java.lang.Throwable) convergenceException28);
        java.lang.Throwable[] throwableArray31 = convergenceException28.getSuppressed();
        org.apache.commons.math.MathException mathException32 = new org.apache.commons.math.MathException("", (java.lang.Object[]) throwableArray31);
        org.apache.commons.math.MaxIterationsExceededException maxIterationsExceededException33 = new org.apache.commons.math.MaxIterationsExceededException(0, "org.apache.commons.math.MathException: Evaluation failed for argument = 0", (java.lang.Object[]) throwableArray31);
        org.apache.commons.math.MaxIterationsExceededException maxIterationsExceededException34 = new org.apache.commons.math.MaxIterationsExceededException((int) (short) -1, "org.apache.commons.math.MathException: org.apache.commons.math.FunctionEvaluationException: Evaluation failed for argument = 100", (java.lang.Object[]) throwableArray31);
        org.apache.commons.math.FunctionEvaluationException functionEvaluationException35 = new org.apache.commons.math.FunctionEvaluationException((double) (-1), "org.apache.commons.math.MathException: org.apache.commons.math.ConvergenceException: org.apache.commons.math.MathException: org.apache.commons.math.MaxIterationsExceededException: org.apache.commons.math.FunctionEvaluationException: Maximal number of iterations ({0}) exceeded", (java.lang.Throwable) maxIterationsExceededException34);
        org.junit.Assert.assertNotNull(objArray13);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray13), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray13), "[]");
        org.junit.Assert.assertNotNull(objArray21);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray21), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray21), "[]");
        org.junit.Assert.assertNotNull(objArray27);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray27), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray27), "[]");
        org.junit.Assert.assertNotNull(throwableArray31);
    }

    @Test
    public void test15508() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest31.test15508");
        org.apache.commons.math.ConvergenceException convergenceException1 = new org.apache.commons.math.ConvergenceException("Evaluation failed for argument = 1");
        java.lang.Throwable[] throwableArray2 = convergenceException1.getSuppressed();
        org.junit.Assert.assertNotNull(throwableArray2);
    }

    @Test
    public void test15509() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest31.test15509");
        java.lang.Object[] objArray14 = new java.lang.Object[] {};
        java.lang.Object[] objArray18 = new java.lang.Object[] {};
        java.lang.Throwable throwable21 = null;
        org.apache.commons.math.FunctionEvaluationException functionEvaluationException22 = new org.apache.commons.math.FunctionEvaluationException((double) 'a', "hi!", throwable21);
        org.apache.commons.math.FunctionEvaluationException functionEvaluationException23 = new org.apache.commons.math.FunctionEvaluationException((-1.0d), "", objArray18, (java.lang.Throwable) functionEvaluationException22);
        org.apache.commons.math.FunctionEvaluationException functionEvaluationException24 = new org.apache.commons.math.FunctionEvaluationException((double) (byte) -1, (java.lang.Throwable) functionEvaluationException22);
        org.apache.commons.math.ConvergenceException convergenceException25 = new org.apache.commons.math.ConvergenceException((java.lang.Throwable) functionEvaluationException24);
        org.apache.commons.math.FunctionEvaluationException functionEvaluationException26 = new org.apache.commons.math.FunctionEvaluationException((double) (byte) 10, "", objArray14, (java.lang.Throwable) convergenceException25);
        org.apache.commons.math.MathException mathException27 = new org.apache.commons.math.MathException("", objArray14);
        org.apache.commons.math.MaxIterationsExceededException maxIterationsExceededException28 = new org.apache.commons.math.MaxIterationsExceededException(10, "Evaluation failed for argument = {0}", objArray14);
        org.apache.commons.math.MaxIterationsExceededException maxIterationsExceededException29 = new org.apache.commons.math.MaxIterationsExceededException((-1), "Evaluation failed for argument = {0}", objArray14);
        java.lang.Throwable throwable35 = null;
        org.apache.commons.math.FunctionEvaluationException functionEvaluationException36 = new org.apache.commons.math.FunctionEvaluationException((double) 'a', "hi!", throwable35);
        java.lang.String str37 = functionEvaluationException36.getPattern();
        java.lang.Object[] objArray41 = new java.lang.Object[] { functionEvaluationException36, (byte) 0, (short) -1, 1.0f };
        java.lang.Throwable throwable42 = null;
        org.apache.commons.math.ConvergenceException convergenceException43 = new org.apache.commons.math.ConvergenceException("hi!", objArray41, throwable42);
        java.lang.Throwable throwable49 = null;
        org.apache.commons.math.FunctionEvaluationException functionEvaluationException50 = new org.apache.commons.math.FunctionEvaluationException((double) 'a', "hi!", throwable49);
        java.lang.String str51 = functionEvaluationException50.getPattern();
        java.lang.Object[] objArray55 = new java.lang.Object[] { functionEvaluationException50, (byte) 0, (short) -1, 1.0f };
        java.lang.Throwable throwable56 = null;
        org.apache.commons.math.ConvergenceException convergenceException57 = new org.apache.commons.math.ConvergenceException("hi!", objArray55, throwable56);
        org.apache.commons.math.MaxIterationsExceededException maxIterationsExceededException58 = new org.apache.commons.math.MaxIterationsExceededException((int) ' ', "hi!", objArray55);
        org.apache.commons.math.ConvergenceException convergenceException59 = new org.apache.commons.math.ConvergenceException("hi!", objArray41, (java.lang.Throwable) maxIterationsExceededException58);
        org.apache.commons.math.FunctionEvaluationException functionEvaluationException60 = new org.apache.commons.math.FunctionEvaluationException(0.0d, (java.lang.Throwable) maxIterationsExceededException58);
        org.apache.commons.math.FunctionEvaluationException functionEvaluationException61 = new org.apache.commons.math.FunctionEvaluationException((double) (short) 0, "org.apache.commons.math.FunctionEvaluationException: org.apache.commons.math.MaxIterationsExceededException: ", objArray14, (java.lang.Throwable) functionEvaluationException60);
        org.apache.commons.math.ConvergenceException convergenceException62 = new org.apache.commons.math.ConvergenceException("org.apache.commons.math.MathException: org.apache.commons.math.FunctionEvaluationException: hi!", objArray14);
        org.apache.commons.math.ConvergenceException convergenceException63 = new org.apache.commons.math.ConvergenceException("org.apache.commons.math.FunctionEvaluationException: org.apache.commons.math.FunctionEvaluationException: Maximal number of iterations ({0}) exceeded", objArray14);
        org.apache.commons.math.FunctionEvaluationException functionEvaluationException64 = new org.apache.commons.math.FunctionEvaluationException((-1.0d), (java.lang.Throwable) convergenceException63);
        java.lang.Object[] objArray65 = functionEvaluationException64.getArguments();
        org.apache.commons.math.FunctionEvaluationException functionEvaluationException66 = new org.apache.commons.math.FunctionEvaluationException((double) (short) 100, "org.apache.commons.math.ConvergenceException: org.apache.commons.math.FunctionEvaluationException: Evaluation failed for argument = 1", objArray65);
        java.lang.Object[] objArray67 = functionEvaluationException66.getArguments();
        org.junit.Assert.assertNotNull(objArray14);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray14), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray14), "[]");
        org.junit.Assert.assertNotNull(objArray18);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray18), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray18), "[]");
        org.junit.Assert.assertEquals("'" + str37 + "' != '" + "hi!" + "'", str37, "hi!");
        org.junit.Assert.assertNotNull(objArray41);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray41), "[org.apache.commons.math.FunctionEvaluationException: hi!, 0, -1, 1.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray41), "[org.apache.commons.math.FunctionEvaluationException: hi!, 0, -1, 1.0]");
        org.junit.Assert.assertEquals("'" + str51 + "' != '" + "hi!" + "'", str51, "hi!");
        org.junit.Assert.assertNotNull(objArray55);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray55), "[org.apache.commons.math.FunctionEvaluationException: hi!, 0, -1, 1.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray55), "[org.apache.commons.math.FunctionEvaluationException: hi!, 0, -1, 1.0]");
        org.junit.Assert.assertNotNull(objArray65);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray65), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray65), "[]");
        org.junit.Assert.assertNotNull(objArray67);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray67), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray67), "[]");
    }

    @Test
    public void test15510() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest31.test15510");
        org.apache.commons.math.FunctionEvaluationException functionEvaluationException8 = new org.apache.commons.math.FunctionEvaluationException((double) 1);
        org.apache.commons.math.FunctionEvaluationException functionEvaluationException9 = new org.apache.commons.math.FunctionEvaluationException((double) (short) -1, (java.lang.Throwable) functionEvaluationException8);
        java.lang.Throwable[] throwableArray10 = functionEvaluationException8.getSuppressed();
        java.lang.Object[] objArray11 = functionEvaluationException8.getArguments();
        java.lang.Throwable[] throwableArray12 = functionEvaluationException8.getSuppressed();
        org.apache.commons.math.MaxIterationsExceededException maxIterationsExceededException13 = new org.apache.commons.math.MaxIterationsExceededException((int) 'a', "org.apache.commons.math.FunctionEvaluationException: org.apache.commons.math.FunctionEvaluationException: Maximal number of iterations ({0}) exceeded", (java.lang.Object[]) throwableArray12);
        org.apache.commons.math.MathException mathException14 = new org.apache.commons.math.MathException((java.lang.Throwable) maxIterationsExceededException13);
        int int15 = maxIterationsExceededException13.getMaxIterations();
        org.apache.commons.math.MathException mathException16 = new org.apache.commons.math.MathException("Evaluation failed for argument = 1", (java.lang.Throwable) maxIterationsExceededException13);
        int int17 = maxIterationsExceededException13.getMaxIterations();
        java.lang.Throwable[] throwableArray18 = maxIterationsExceededException13.getSuppressed();
        java.lang.Object[] objArray27 = new java.lang.Object[] {};
        java.lang.Object[] objArray31 = new java.lang.Object[] {};
        java.lang.Throwable throwable34 = null;
        org.apache.commons.math.FunctionEvaluationException functionEvaluationException35 = new org.apache.commons.math.FunctionEvaluationException((double) 'a', "hi!", throwable34);
        org.apache.commons.math.FunctionEvaluationException functionEvaluationException36 = new org.apache.commons.math.FunctionEvaluationException((-1.0d), "", objArray31, (java.lang.Throwable) functionEvaluationException35);
        org.apache.commons.math.FunctionEvaluationException functionEvaluationException37 = new org.apache.commons.math.FunctionEvaluationException((double) (byte) -1, (java.lang.Throwable) functionEvaluationException35);
        org.apache.commons.math.ConvergenceException convergenceException38 = new org.apache.commons.math.ConvergenceException((java.lang.Throwable) functionEvaluationException37);
        org.apache.commons.math.FunctionEvaluationException functionEvaluationException39 = new org.apache.commons.math.FunctionEvaluationException((double) (byte) 10, "", objArray27, (java.lang.Throwable) convergenceException38);
        java.lang.Throwable throwable43 = null;
        org.apache.commons.math.FunctionEvaluationException functionEvaluationException44 = new org.apache.commons.math.FunctionEvaluationException((double) 'a', "hi!", throwable43);
        java.lang.String str45 = functionEvaluationException44.getPattern();
        java.lang.Object[] objArray49 = new java.lang.Object[] { functionEvaluationException44, (byte) 0, (short) -1, 1.0f };
        java.lang.Throwable throwable50 = null;
        org.apache.commons.math.ConvergenceException convergenceException51 = new org.apache.commons.math.ConvergenceException("hi!", objArray49, throwable50);
        org.apache.commons.math.ConvergenceException convergenceException52 = new org.apache.commons.math.ConvergenceException("", objArray27, (java.lang.Throwable) convergenceException51);
        org.apache.commons.math.MathException mathException53 = new org.apache.commons.math.MathException("", objArray27);
        org.apache.commons.math.FunctionEvaluationException functionEvaluationException54 = new org.apache.commons.math.FunctionEvaluationException((double) (short) 0, "", objArray27);
        java.lang.Throwable[] throwableArray55 = functionEvaluationException54.getSuppressed();
        double double56 = functionEvaluationException54.getArgument();
        java.lang.Object[] objArray62 = new java.lang.Object[] {};
        java.lang.Object[] objArray66 = new java.lang.Object[] {};
        java.lang.Throwable throwable69 = null;
        org.apache.commons.math.FunctionEvaluationException functionEvaluationException70 = new org.apache.commons.math.FunctionEvaluationException((double) 'a', "hi!", throwable69);
        org.apache.commons.math.FunctionEvaluationException functionEvaluationException71 = new org.apache.commons.math.FunctionEvaluationException((-1.0d), "", objArray66, (java.lang.Throwable) functionEvaluationException70);
        org.apache.commons.math.FunctionEvaluationException functionEvaluationException72 = new org.apache.commons.math.FunctionEvaluationException((double) (byte) -1, (java.lang.Throwable) functionEvaluationException70);
        org.apache.commons.math.ConvergenceException convergenceException73 = new org.apache.commons.math.ConvergenceException((java.lang.Throwable) functionEvaluationException72);
        org.apache.commons.math.FunctionEvaluationException functionEvaluationException74 = new org.apache.commons.math.FunctionEvaluationException((double) (byte) 10, "", objArray62, (java.lang.Throwable) convergenceException73);
        org.apache.commons.math.MathException mathException75 = new org.apache.commons.math.MathException("", objArray62);
        java.lang.Throwable throwable78 = null;
        org.apache.commons.math.FunctionEvaluationException functionEvaluationException79 = new org.apache.commons.math.FunctionEvaluationException((double) 'a', "hi!", throwable78);
        java.lang.String str80 = functionEvaluationException79.getPattern();
        org.apache.commons.math.ConvergenceException convergenceException81 = new org.apache.commons.math.ConvergenceException((java.lang.Throwable) functionEvaluationException79);
        org.apache.commons.math.MathException mathException82 = new org.apache.commons.math.MathException((java.lang.Throwable) functionEvaluationException79);
        org.apache.commons.math.MathException mathException83 = new org.apache.commons.math.MathException((java.lang.Throwable) functionEvaluationException79);
        org.apache.commons.math.FunctionEvaluationException functionEvaluationException84 = new org.apache.commons.math.FunctionEvaluationException((double) (-1L), "Evaluation failed for argument = {0}", objArray62, (java.lang.Throwable) functionEvaluationException79);
        org.apache.commons.math.ConvergenceException convergenceException85 = new org.apache.commons.math.ConvergenceException((java.lang.Throwable) functionEvaluationException79);
        functionEvaluationException54.addSuppressed((java.lang.Throwable) convergenceException85);
        org.apache.commons.math.ConvergenceException convergenceException87 = new org.apache.commons.math.ConvergenceException("org.apache.commons.math.FunctionEvaluationException: hi!", (java.lang.Throwable) functionEvaluationException54);
        java.lang.String str88 = convergenceException87.getPattern();
        java.lang.Object[] objArray89 = convergenceException87.getArguments();
        org.apache.commons.math.MathException mathException90 = new org.apache.commons.math.MathException("org.apache.commons.math.MaxIterationsExceededException: hi!", (java.lang.Throwable) convergenceException87);
        org.apache.commons.math.ConvergenceException convergenceException91 = new org.apache.commons.math.ConvergenceException("org.apache.commons.math.MathException: org.apache.commons.math.MaxIterationsExceededException: org.apache.commons.math.MathException: org.apache.commons.math.FunctionEvaluationException: ", (java.lang.Object[]) throwableArray18, (java.lang.Throwable) mathException90);
        org.apache.commons.math.MaxIterationsExceededException maxIterationsExceededException92 = new org.apache.commons.math.MaxIterationsExceededException(97, "org.apache.commons.math.FunctionEvaluationException: org.apache.commons.math.ConvergenceException: org.apache.commons.math.MaxIterationsExceededException: Evaluation failed for argument = {0}", (java.lang.Object[]) throwableArray18);
        org.junit.Assert.assertNotNull(throwableArray10);
        org.junit.Assert.assertNotNull(objArray11);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray11), "[1.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray11), "[1.0]");
        org.junit.Assert.assertNotNull(throwableArray12);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 97 + "'", int15 == 97);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 97 + "'", int17 == 97);
        org.junit.Assert.assertNotNull(throwableArray18);
        org.junit.Assert.assertNotNull(objArray27);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray27), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray27), "[]");
        org.junit.Assert.assertNotNull(objArray31);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray31), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray31), "[]");
        org.junit.Assert.assertEquals("'" + str45 + "' != '" + "hi!" + "'", str45, "hi!");
        org.junit.Assert.assertNotNull(objArray49);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray49), "[org.apache.commons.math.FunctionEvaluationException: hi!, 0, -1, 1.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray49), "[org.apache.commons.math.FunctionEvaluationException: hi!, 0, -1, 1.0]");
        org.junit.Assert.assertNotNull(throwableArray55);
        org.junit.Assert.assertTrue("'" + double56 + "' != '" + 0.0d + "'", double56 == 0.0d);
        org.junit.Assert.assertNotNull(objArray62);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray62), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray62), "[]");
        org.junit.Assert.assertNotNull(objArray66);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray66), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray66), "[]");
        org.junit.Assert.assertEquals("'" + str80 + "' != '" + "hi!" + "'", str80, "hi!");
        org.junit.Assert.assertEquals("'" + str88 + "' != '" + "org.apache.commons.math.FunctionEvaluationException: hi!" + "'", str88, "org.apache.commons.math.FunctionEvaluationException: hi!");
        org.junit.Assert.assertNotNull(objArray89);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray89), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray89), "[]");
    }

    @Test
    public void test15511() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest31.test15511");
        org.apache.commons.math.MaxIterationsExceededException maxIterationsExceededException6 = new org.apache.commons.math.MaxIterationsExceededException(1);
        java.lang.String str7 = maxIterationsExceededException6.getPattern();
        org.apache.commons.math.ConvergenceException convergenceException8 = new org.apache.commons.math.ConvergenceException((java.lang.Throwable) maxIterationsExceededException6);
        java.lang.Object[] objArray9 = convergenceException8.getArguments();
        org.apache.commons.math.FunctionEvaluationException functionEvaluationException13 = new org.apache.commons.math.FunctionEvaluationException((double) (byte) 100);
        org.apache.commons.math.ConvergenceException convergenceException14 = new org.apache.commons.math.ConvergenceException("hi!", (java.lang.Throwable) functionEvaluationException13);
        java.lang.Throwable[] throwableArray15 = functionEvaluationException13.getSuppressed();
        org.apache.commons.math.ConvergenceException convergenceException16 = new org.apache.commons.math.ConvergenceException("org.apache.commons.math.ConvergenceException: org.apache.commons.math.MaxIterationsExceededException: ", (java.lang.Throwable) functionEvaluationException13);
        org.apache.commons.math.MathException mathException17 = new org.apache.commons.math.MathException("org.apache.commons.math.MathException: org.apache.commons.math.ConvergenceException: hi!", objArray9, (java.lang.Throwable) convergenceException16);
        java.lang.Object[] objArray28 = new java.lang.Object[] {};
        java.lang.Object[] objArray32 = new java.lang.Object[] {};
        java.lang.Throwable throwable35 = null;
        org.apache.commons.math.FunctionEvaluationException functionEvaluationException36 = new org.apache.commons.math.FunctionEvaluationException((double) 'a', "hi!", throwable35);
        org.apache.commons.math.FunctionEvaluationException functionEvaluationException37 = new org.apache.commons.math.FunctionEvaluationException((-1.0d), "", objArray32, (java.lang.Throwable) functionEvaluationException36);
        org.apache.commons.math.FunctionEvaluationException functionEvaluationException38 = new org.apache.commons.math.FunctionEvaluationException((double) (byte) -1, (java.lang.Throwable) functionEvaluationException36);
        org.apache.commons.math.ConvergenceException convergenceException39 = new org.apache.commons.math.ConvergenceException((java.lang.Throwable) functionEvaluationException38);
        org.apache.commons.math.FunctionEvaluationException functionEvaluationException40 = new org.apache.commons.math.FunctionEvaluationException((double) (byte) 10, "", objArray28, (java.lang.Throwable) convergenceException39);
        java.lang.Throwable throwable44 = null;
        org.apache.commons.math.FunctionEvaluationException functionEvaluationException45 = new org.apache.commons.math.FunctionEvaluationException((double) 'a', "hi!", throwable44);
        java.lang.String str46 = functionEvaluationException45.getPattern();
        java.lang.Object[] objArray50 = new java.lang.Object[] { functionEvaluationException45, (byte) 0, (short) -1, 1.0f };
        java.lang.Throwable throwable51 = null;
        org.apache.commons.math.ConvergenceException convergenceException52 = new org.apache.commons.math.ConvergenceException("hi!", objArray50, throwable51);
        org.apache.commons.math.ConvergenceException convergenceException53 = new org.apache.commons.math.ConvergenceException("", objArray28, (java.lang.Throwable) convergenceException52);
        org.apache.commons.math.MathException mathException54 = new org.apache.commons.math.MathException("", objArray28);
        org.apache.commons.math.FunctionEvaluationException functionEvaluationException55 = new org.apache.commons.math.FunctionEvaluationException((double) (short) 0, "", objArray28);
        java.lang.Throwable[] throwableArray56 = functionEvaluationException55.getSuppressed();
        double double57 = functionEvaluationException55.getArgument();
        org.apache.commons.math.MathException mathException58 = new org.apache.commons.math.MathException("org.apache.commons.math.FunctionEvaluationException: ", (java.lang.Throwable) functionEvaluationException55);
        org.apache.commons.math.FunctionEvaluationException functionEvaluationException59 = new org.apache.commons.math.FunctionEvaluationException((double) '4', (java.lang.Throwable) functionEvaluationException55);
        org.apache.commons.math.MathException mathException60 = new org.apache.commons.math.MathException((java.lang.Throwable) functionEvaluationException59);
        org.apache.commons.math.FunctionEvaluationException functionEvaluationException61 = new org.apache.commons.math.FunctionEvaluationException(0.0d, "", (java.lang.Throwable) mathException60);
        org.apache.commons.math.FunctionEvaluationException functionEvaluationException62 = new org.apache.commons.math.FunctionEvaluationException(100.0d, "org.apache.commons.math.ConvergenceException: org.apache.commons.math.FunctionEvaluationException: org.apache.commons.math.FunctionEvaluationException: Maximal number of iterations ({0}) exceeded", objArray9, (java.lang.Throwable) mathException60);
        org.apache.commons.math.MaxIterationsExceededException maxIterationsExceededException63 = new org.apache.commons.math.MaxIterationsExceededException(1, "org.apache.commons.math.MaxIterationsExceededException: org.apache.commons.math.FunctionEvaluationException: org.apache.commons.math.FunctionEvaluationException: Evaluation failed for argument = 1", objArray9);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "Maximal number of iterations ({0}) exceeded" + "'", str7, "Maximal number of iterations ({0}) exceeded");
        org.junit.Assert.assertNotNull(objArray9);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray9), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray9), "[]");
        org.junit.Assert.assertNotNull(throwableArray15);
        org.junit.Assert.assertNotNull(objArray28);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray28), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray28), "[]");
        org.junit.Assert.assertNotNull(objArray32);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray32), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray32), "[]");
        org.junit.Assert.assertEquals("'" + str46 + "' != '" + "hi!" + "'", str46, "hi!");
        org.junit.Assert.assertNotNull(objArray50);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray50), "[org.apache.commons.math.FunctionEvaluationException: hi!, 0, -1, 1.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray50), "[org.apache.commons.math.FunctionEvaluationException: hi!, 0, -1, 1.0]");
        org.junit.Assert.assertNotNull(throwableArray56);
        org.junit.Assert.assertTrue("'" + double57 + "' != '" + 0.0d + "'", double57 == 0.0d);
    }

    @Test
    public void test15512() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest31.test15512");
        org.apache.commons.math.ConvergenceException convergenceException1 = new org.apache.commons.math.ConvergenceException("org.apache.commons.math.ConvergenceException: org.apache.commons.math.ConvergenceException: org.apache.commons.math.FunctionEvaluationException: org.apache.commons.math.FunctionEvaluationException: Evaluation failed for argument = {0}");
    }

    @Test
    public void test15513() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest31.test15513");
        org.apache.commons.math.FunctionEvaluationException functionEvaluationException14 = new org.apache.commons.math.FunctionEvaluationException((double) (-1L));
        org.apache.commons.math.ConvergenceException convergenceException15 = new org.apache.commons.math.ConvergenceException("", (java.lang.Throwable) functionEvaluationException14);
        org.apache.commons.math.ConvergenceException convergenceException16 = new org.apache.commons.math.ConvergenceException((java.lang.Throwable) convergenceException15);
        java.lang.Object[] objArray17 = convergenceException16.getArguments();
        org.apache.commons.math.MathException mathException18 = new org.apache.commons.math.MathException("org.apache.commons.math.ConvergenceException: hi!", objArray17);
        java.lang.Throwable throwable24 = null;
        org.apache.commons.math.FunctionEvaluationException functionEvaluationException25 = new org.apache.commons.math.FunctionEvaluationException((double) 'a', "hi!", throwable24);
        java.lang.String str26 = functionEvaluationException25.getPattern();
        org.apache.commons.math.ConvergenceException convergenceException27 = new org.apache.commons.math.ConvergenceException((java.lang.Throwable) functionEvaluationException25);
        org.apache.commons.math.MathException mathException28 = new org.apache.commons.math.MathException((java.lang.Throwable) functionEvaluationException25);
        org.apache.commons.math.MathException mathException29 = new org.apache.commons.math.MathException((java.lang.Throwable) functionEvaluationException25);
        org.apache.commons.math.FunctionEvaluationException functionEvaluationException30 = new org.apache.commons.math.FunctionEvaluationException((double) (byte) 1, (java.lang.Throwable) functionEvaluationException25);
        org.apache.commons.math.FunctionEvaluationException functionEvaluationException31 = new org.apache.commons.math.FunctionEvaluationException((double) 1.0f, "hi!", (java.lang.Throwable) functionEvaluationException25);
        java.lang.String str32 = functionEvaluationException31.getPattern();
        org.apache.commons.math.ConvergenceException convergenceException33 = new org.apache.commons.math.ConvergenceException("hi!", objArray17, (java.lang.Throwable) functionEvaluationException31);
        org.apache.commons.math.MaxIterationsExceededException maxIterationsExceededException34 = new org.apache.commons.math.MaxIterationsExceededException(35, "", objArray17);
        org.apache.commons.math.MathException mathException35 = new org.apache.commons.math.MathException("org.apache.commons.math.MaxIterationsExceededException: org.apache.commons.math.MathException: Evaluation failed for argument = 0", objArray17);
        org.apache.commons.math.MaxIterationsExceededException maxIterationsExceededException36 = new org.apache.commons.math.MaxIterationsExceededException((int) ' ', "org.apache.commons.math.FunctionEvaluationException: org.apache.commons.math.FunctionEvaluationException: org.apache.commons.math.MaxIterationsExceededException: ", objArray17);
        java.lang.Object[] objArray46 = new java.lang.Object[] {};
        java.lang.Object[] objArray50 = new java.lang.Object[] {};
        java.lang.Throwable throwable53 = null;
        org.apache.commons.math.FunctionEvaluationException functionEvaluationException54 = new org.apache.commons.math.FunctionEvaluationException((double) 'a', "hi!", throwable53);
        org.apache.commons.math.FunctionEvaluationException functionEvaluationException55 = new org.apache.commons.math.FunctionEvaluationException((-1.0d), "", objArray50, (java.lang.Throwable) functionEvaluationException54);
        org.apache.commons.math.FunctionEvaluationException functionEvaluationException56 = new org.apache.commons.math.FunctionEvaluationException((double) (byte) -1, (java.lang.Throwable) functionEvaluationException54);
        org.apache.commons.math.ConvergenceException convergenceException57 = new org.apache.commons.math.ConvergenceException((java.lang.Throwable) functionEvaluationException56);
        org.apache.commons.math.FunctionEvaluationException functionEvaluationException58 = new org.apache.commons.math.FunctionEvaluationException((double) (byte) 10, "", objArray46, (java.lang.Throwable) convergenceException57);
        java.lang.Throwable throwable62 = null;
        org.apache.commons.math.FunctionEvaluationException functionEvaluationException63 = new org.apache.commons.math.FunctionEvaluationException((double) 'a', "hi!", throwable62);
        java.lang.String str64 = functionEvaluationException63.getPattern();
        java.lang.Object[] objArray68 = new java.lang.Object[] { functionEvaluationException63, (byte) 0, (short) -1, 1.0f };
        java.lang.Throwable throwable69 = null;
        org.apache.commons.math.ConvergenceException convergenceException70 = new org.apache.commons.math.ConvergenceException("hi!", objArray68, throwable69);
        org.apache.commons.math.ConvergenceException convergenceException71 = new org.apache.commons.math.ConvergenceException("", objArray46, (java.lang.Throwable) convergenceException70);
        org.apache.commons.math.MathException mathException72 = new org.apache.commons.math.MathException("", objArray46);
        org.apache.commons.math.FunctionEvaluationException functionEvaluationException73 = new org.apache.commons.math.FunctionEvaluationException((double) (short) 0, "", objArray46);
        java.lang.Throwable[] throwableArray74 = functionEvaluationException73.getSuppressed();
        double double75 = functionEvaluationException73.getArgument();
        org.apache.commons.math.MathException mathException76 = new org.apache.commons.math.MathException("org.apache.commons.math.FunctionEvaluationException: ", (java.lang.Throwable) functionEvaluationException73);
        java.lang.Object[] objArray77 = mathException76.getArguments();
        org.apache.commons.math.MaxIterationsExceededException maxIterationsExceededException78 = new org.apache.commons.math.MaxIterationsExceededException(52, "org.apache.commons.math.MaxIterationsExceededException: Maximal number of iterations (32) exceeded", objArray77);
        org.apache.commons.math.ConvergenceException convergenceException79 = new org.apache.commons.math.ConvergenceException((java.lang.Throwable) maxIterationsExceededException78);
        int int80 = maxIterationsExceededException78.getMaxIterations();
        java.lang.Object[] objArray81 = maxIterationsExceededException78.getArguments();
        int int82 = maxIterationsExceededException78.getMaxIterations();
        org.apache.commons.math.FunctionEvaluationException functionEvaluationException83 = new org.apache.commons.math.FunctionEvaluationException((double) (byte) 1, "org.apache.commons.math.MathException: org.apache.commons.math.FunctionEvaluationException: org.apache.commons.math.FunctionEvaluationException: org.apache.commons.math.FunctionEvaluationException: hi!", objArray17, (java.lang.Throwable) maxIterationsExceededException78);
        org.apache.commons.math.FunctionEvaluationException functionEvaluationException84 = new org.apache.commons.math.FunctionEvaluationException(52.0d, "org.apache.commons.math.MathException: org.apache.commons.math.FunctionEvaluationException: org.apache.commons.math.FunctionEvaluationException: org.apache.commons.math.FunctionEvaluationException: org.apache.commons.math.FunctionEvaluationException: Evaluation failed for argument = 100", objArray17);
        org.apache.commons.math.MathException mathException85 = new org.apache.commons.math.MathException("org.apache.commons.math.MathException: org.apache.commons.math.FunctionEvaluationException: org.apache.commons.math.FunctionEvaluationException: ", objArray17);
        org.junit.Assert.assertNotNull(objArray17);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray17), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray17), "[]");
        org.junit.Assert.assertEquals("'" + str26 + "' != '" + "hi!" + "'", str26, "hi!");
        org.junit.Assert.assertEquals("'" + str32 + "' != '" + "hi!" + "'", str32, "hi!");
        org.junit.Assert.assertNotNull(objArray46);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray46), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray46), "[]");
        org.junit.Assert.assertNotNull(objArray50);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray50), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray50), "[]");
        org.junit.Assert.assertEquals("'" + str64 + "' != '" + "hi!" + "'", str64, "hi!");
        org.junit.Assert.assertNotNull(objArray68);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray68), "[org.apache.commons.math.FunctionEvaluationException: hi!, 0, -1, 1.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray68), "[org.apache.commons.math.FunctionEvaluationException: hi!, 0, -1, 1.0]");
        org.junit.Assert.assertNotNull(throwableArray74);
        org.junit.Assert.assertTrue("'" + double75 + "' != '" + 0.0d + "'", double75 == 0.0d);
        org.junit.Assert.assertNotNull(objArray77);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray77), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray77), "[]");
        org.junit.Assert.assertTrue("'" + int80 + "' != '" + 52 + "'", int80 == 52);
        org.junit.Assert.assertNotNull(objArray81);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray81), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray81), "[]");
        org.junit.Assert.assertTrue("'" + int82 + "' != '" + 52 + "'", int82 == 52);
    }

    @Test
    public void test15514() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest31.test15514");
        java.lang.Object[] objArray10 = new java.lang.Object[] {};
        java.lang.Throwable throwable13 = null;
        org.apache.commons.math.FunctionEvaluationException functionEvaluationException14 = new org.apache.commons.math.FunctionEvaluationException((double) 'a', "hi!", throwable13);
        org.apache.commons.math.FunctionEvaluationException functionEvaluationException15 = new org.apache.commons.math.FunctionEvaluationException((-1.0d), "", objArray10, (java.lang.Throwable) functionEvaluationException14);
        java.lang.Object[] objArray18 = new java.lang.Object[] {};
        java.lang.Throwable throwable21 = null;
        org.apache.commons.math.FunctionEvaluationException functionEvaluationException22 = new org.apache.commons.math.FunctionEvaluationException((double) 'a', "hi!", throwable21);
        org.apache.commons.math.FunctionEvaluationException functionEvaluationException23 = new org.apache.commons.math.FunctionEvaluationException((-1.0d), "", objArray18, (java.lang.Throwable) functionEvaluationException22);
        java.lang.Object[] objArray24 = functionEvaluationException22.getArguments();
        org.apache.commons.math.ConvergenceException convergenceException25 = new org.apache.commons.math.ConvergenceException("", objArray10, (java.lang.Throwable) functionEvaluationException22);
        org.apache.commons.math.ConvergenceException convergenceException28 = new org.apache.commons.math.ConvergenceException("");
        org.apache.commons.math.FunctionEvaluationException functionEvaluationException29 = new org.apache.commons.math.FunctionEvaluationException((double) 0, (java.lang.Throwable) convergenceException28);
        org.apache.commons.math.FunctionEvaluationException functionEvaluationException30 = new org.apache.commons.math.FunctionEvaluationException((double) 100.0f, "", objArray10, (java.lang.Throwable) functionEvaluationException29);
        org.apache.commons.math.MaxIterationsExceededException maxIterationsExceededException32 = new org.apache.commons.math.MaxIterationsExceededException((int) (short) 0);
        org.apache.commons.math.ConvergenceException convergenceException33 = new org.apache.commons.math.ConvergenceException("hi!", objArray10, (java.lang.Throwable) maxIterationsExceededException32);
        java.lang.Throwable[] throwableArray34 = maxIterationsExceededException32.getSuppressed();
        org.apache.commons.math.ConvergenceException convergenceException35 = new org.apache.commons.math.ConvergenceException((java.lang.Throwable) maxIterationsExceededException32);
        org.apache.commons.math.ConvergenceException convergenceException36 = new org.apache.commons.math.ConvergenceException("org.apache.commons.math.MaxIterationsExceededException: org.apache.commons.math.MaxIterationsExceededException: ", (java.lang.Throwable) convergenceException35);
        java.lang.String str37 = convergenceException35.getPattern();
        java.lang.Object[] objArray38 = convergenceException35.getArguments();
        org.apache.commons.math.FunctionEvaluationException functionEvaluationException39 = new org.apache.commons.math.FunctionEvaluationException((double) (-1L), "", (java.lang.Throwable) convergenceException35);
        java.lang.Throwable[] throwableArray40 = functionEvaluationException39.getSuppressed();
        org.apache.commons.math.MathException mathException41 = new org.apache.commons.math.MathException("org.apache.commons.math.MaxIterationsExceededException: Maximal number of iterations (52) exceeded", (java.lang.Throwable) functionEvaluationException39);
        org.junit.Assert.assertNotNull(objArray10);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray10), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray10), "[]");
        org.junit.Assert.assertNotNull(objArray18);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray18), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray18), "[]");
        org.junit.Assert.assertNotNull(objArray24);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray24), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray24), "[]");
        org.junit.Assert.assertNotNull(throwableArray34);
        org.junit.Assert.assertEquals("'" + str37 + "' != '" + "Maximal number of iterations (0) exceeded" + "'", str37, "Maximal number of iterations (0) exceeded");
        org.junit.Assert.assertNotNull(objArray38);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray38), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray38), "[]");
        org.junit.Assert.assertNotNull(throwableArray40);
    }

    @Test
    public void test15515() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest31.test15515");
        java.lang.Throwable throwable6 = null;
        org.apache.commons.math.ConvergenceException convergenceException7 = new org.apache.commons.math.ConvergenceException("org.apache.commons.math.MathException: Evaluation failed for argument = {0}", throwable6);
        java.lang.Throwable[] throwableArray8 = convergenceException7.getSuppressed();
        org.apache.commons.math.ConvergenceException convergenceException9 = new org.apache.commons.math.ConvergenceException("org.apache.commons.math.ConvergenceException: org.apache.commons.math.FunctionEvaluationException: org.apache.commons.math.FunctionEvaluationException: Evaluation failed for argument = 100", (java.lang.Object[]) throwableArray8);
        org.apache.commons.math.MathException mathException10 = new org.apache.commons.math.MathException("org.apache.commons.math.FunctionEvaluationException: org.apache.commons.math.ConvergenceException: org.apache.commons.math.MathException: Evaluation failed for argument = 0", (java.lang.Object[]) throwableArray8);
        org.apache.commons.math.MaxIterationsExceededException maxIterationsExceededException11 = new org.apache.commons.math.MaxIterationsExceededException(35, "org.apache.commons.math.MathException: org.apache.commons.math.MathException: org.apache.commons.math.MaxIterationsExceededException: org.apache.commons.math.MaxIterationsExceededException: ", (java.lang.Object[]) throwableArray8);
        org.apache.commons.math.ConvergenceException convergenceException12 = new org.apache.commons.math.ConvergenceException("org.apache.commons.math.MathException: org.apache.commons.math.MathException: org.apache.commons.math.FunctionEvaluationException: Evaluation failed for argument = -1", (java.lang.Object[]) throwableArray8);
        org.junit.Assert.assertNotNull(throwableArray8);
    }

    @Test
    public void test15516() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest31.test15516");
        java.lang.Object[] objArray15 = new java.lang.Object[] {};
        java.lang.Throwable throwable18 = null;
        org.apache.commons.math.FunctionEvaluationException functionEvaluationException19 = new org.apache.commons.math.FunctionEvaluationException((double) 'a', "hi!", throwable18);
        org.apache.commons.math.FunctionEvaluationException functionEvaluationException20 = new org.apache.commons.math.FunctionEvaluationException((-1.0d), "", objArray15, (java.lang.Throwable) functionEvaluationException19);
        java.lang.Object[] objArray23 = new java.lang.Object[] {};
        java.lang.Throwable throwable26 = null;
        org.apache.commons.math.FunctionEvaluationException functionEvaluationException27 = new org.apache.commons.math.FunctionEvaluationException((double) 'a', "hi!", throwable26);
        org.apache.commons.math.FunctionEvaluationException functionEvaluationException28 = new org.apache.commons.math.FunctionEvaluationException((-1.0d), "", objArray23, (java.lang.Throwable) functionEvaluationException27);
        java.lang.Object[] objArray29 = functionEvaluationException27.getArguments();
        org.apache.commons.math.ConvergenceException convergenceException30 = new org.apache.commons.math.ConvergenceException("", objArray15, (java.lang.Throwable) functionEvaluationException27);
        org.apache.commons.math.FunctionEvaluationException functionEvaluationException31 = new org.apache.commons.math.FunctionEvaluationException((double) 1L, "", (java.lang.Throwable) convergenceException30);
        org.apache.commons.math.FunctionEvaluationException functionEvaluationException32 = new org.apache.commons.math.FunctionEvaluationException((double) (byte) -1, (java.lang.Throwable) convergenceException30);
        java.lang.Throwable[] throwableArray33 = convergenceException30.getSuppressed();
        org.apache.commons.math.MathException mathException34 = new org.apache.commons.math.MathException("", (java.lang.Object[]) throwableArray33);
        java.lang.Object[] objArray40 = new java.lang.Object[] {};
        java.lang.Throwable throwable43 = null;
        org.apache.commons.math.FunctionEvaluationException functionEvaluationException44 = new org.apache.commons.math.FunctionEvaluationException((double) 'a', "hi!", throwable43);
        org.apache.commons.math.FunctionEvaluationException functionEvaluationException45 = new org.apache.commons.math.FunctionEvaluationException((-1.0d), "", objArray40, (java.lang.Throwable) functionEvaluationException44);
        org.apache.commons.math.FunctionEvaluationException functionEvaluationException46 = new org.apache.commons.math.FunctionEvaluationException((double) (byte) -1, (java.lang.Throwable) functionEvaluationException44);
        java.lang.Throwable[] throwableArray47 = functionEvaluationException44.getSuppressed();
        org.apache.commons.math.ConvergenceException convergenceException48 = new org.apache.commons.math.ConvergenceException("hi!", (java.lang.Object[]) throwableArray47);
        org.apache.commons.math.FunctionEvaluationException functionEvaluationException51 = new org.apache.commons.math.FunctionEvaluationException((double) (short) 0, "");
        org.apache.commons.math.ConvergenceException convergenceException52 = new org.apache.commons.math.ConvergenceException("", (java.lang.Object[]) throwableArray47, (java.lang.Throwable) functionEvaluationException51);
        double double53 = functionEvaluationException51.getArgument();
        org.apache.commons.math.FunctionEvaluationException functionEvaluationException54 = new org.apache.commons.math.FunctionEvaluationException((double) (short) 10, "org.apache.commons.math.FunctionEvaluationException: org.apache.commons.math.FunctionEvaluationException: hi!", (java.lang.Object[]) throwableArray33, (java.lang.Throwable) functionEvaluationException51);
        org.apache.commons.math.ConvergenceException convergenceException55 = new org.apache.commons.math.ConvergenceException("org.apache.commons.math.FunctionEvaluationException: hi!", (java.lang.Object[]) throwableArray33);
        java.lang.String str56 = convergenceException55.getPattern();
        java.lang.Throwable throwable65 = null;
        org.apache.commons.math.FunctionEvaluationException functionEvaluationException66 = new org.apache.commons.math.FunctionEvaluationException((double) 'a', "hi!", throwable65);
        java.lang.String str67 = functionEvaluationException66.getPattern();
        java.lang.Object[] objArray71 = new java.lang.Object[] { functionEvaluationException66, (byte) 0, (short) -1, 1.0f };
        java.lang.Throwable throwable72 = null;
        org.apache.commons.math.ConvergenceException convergenceException73 = new org.apache.commons.math.ConvergenceException("hi!", objArray71, throwable72);
        org.apache.commons.math.MaxIterationsExceededException maxIterationsExceededException74 = new org.apache.commons.math.MaxIterationsExceededException((int) (byte) -1, "", objArray71);
        org.apache.commons.math.FunctionEvaluationException functionEvaluationException75 = new org.apache.commons.math.FunctionEvaluationException(10.0d, "hi!", objArray71);
        org.apache.commons.math.MathException mathException76 = new org.apache.commons.math.MathException("org.apache.commons.math.MaxIterationsExceededException: ", (java.lang.Throwable) functionEvaluationException75);
        org.apache.commons.math.ConvergenceException convergenceException77 = new org.apache.commons.math.ConvergenceException((java.lang.Throwable) functionEvaluationException75);
        convergenceException55.addSuppressed((java.lang.Throwable) convergenceException77);
        org.apache.commons.math.ConvergenceException convergenceException79 = new org.apache.commons.math.ConvergenceException("org.apache.commons.math.FunctionEvaluationException: ", (java.lang.Throwable) convergenceException55);
        org.apache.commons.math.ConvergenceException convergenceException80 = new org.apache.commons.math.ConvergenceException("org.apache.commons.math.ConvergenceException: org.apache.commons.math.MathException: org.apache.commons.math.MaxIterationsExceededException: org.apache.commons.math.FunctionEvaluationException: Maximal number of iterations ({0}) exceeded", (java.lang.Throwable) convergenceException79);
        org.apache.commons.math.MathException mathException81 = new org.apache.commons.math.MathException("org.apache.commons.math.FunctionEvaluationException: org.apache.commons.math.FunctionEvaluationException: org.apache.commons.math.FunctionEvaluationException: Evaluation failed for argument = -1", (java.lang.Throwable) convergenceException80);
        java.lang.Object[] objArray82 = convergenceException80.getArguments();
        org.apache.commons.math.FunctionEvaluationException functionEvaluationException83 = new org.apache.commons.math.FunctionEvaluationException(100.0d, "org.apache.commons.math.MaxIterationsExceededException: org.apache.commons.math.MathException: org.apache.commons.math.FunctionEvaluationException: org.apache.commons.math.FunctionEvaluationException: org.apache.commons.math.FunctionEvaluationException: Evaluation failed for argument = 100", objArray82);
        org.junit.Assert.assertNotNull(objArray15);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray15), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray15), "[]");
        org.junit.Assert.assertNotNull(objArray23);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray23), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray23), "[]");
        org.junit.Assert.assertNotNull(objArray29);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray29), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray29), "[]");
        org.junit.Assert.assertNotNull(throwableArray33);
        org.junit.Assert.assertNotNull(objArray40);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray40), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray40), "[]");
        org.junit.Assert.assertNotNull(throwableArray47);
        org.junit.Assert.assertTrue("'" + double53 + "' != '" + 0.0d + "'", double53 == 0.0d);
        org.junit.Assert.assertEquals("'" + str56 + "' != '" + "org.apache.commons.math.FunctionEvaluationException: hi!" + "'", str56, "org.apache.commons.math.FunctionEvaluationException: hi!");
        org.junit.Assert.assertEquals("'" + str67 + "' != '" + "hi!" + "'", str67, "hi!");
        org.junit.Assert.assertNotNull(objArray71);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray71), "[org.apache.commons.math.FunctionEvaluationException: hi!, 0, -1, 1.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray71), "[org.apache.commons.math.FunctionEvaluationException: hi!, 0, -1, 1.0]");
        org.junit.Assert.assertNotNull(objArray82);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray82), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray82), "[]");
    }

    @Test
    public void test15517() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest31.test15517");
        java.lang.Object[] objArray13 = new java.lang.Object[] {};
        java.lang.Throwable throwable16 = null;
        org.apache.commons.math.FunctionEvaluationException functionEvaluationException17 = new org.apache.commons.math.FunctionEvaluationException((double) 'a', "hi!", throwable16);
        org.apache.commons.math.FunctionEvaluationException functionEvaluationException18 = new org.apache.commons.math.FunctionEvaluationException((-1.0d), "", objArray13, (java.lang.Throwable) functionEvaluationException17);
        org.apache.commons.math.MathException mathException19 = new org.apache.commons.math.MathException("hi!", objArray13);
        org.apache.commons.math.FunctionEvaluationException functionEvaluationException22 = new org.apache.commons.math.FunctionEvaluationException((double) (-1L), "");
        java.lang.Object[] objArray28 = new java.lang.Object[] {};
        java.lang.Throwable throwable31 = null;
        org.apache.commons.math.FunctionEvaluationException functionEvaluationException32 = new org.apache.commons.math.FunctionEvaluationException((double) 'a', "hi!", throwable31);
        org.apache.commons.math.FunctionEvaluationException functionEvaluationException33 = new org.apache.commons.math.FunctionEvaluationException((-1.0d), "", objArray28, (java.lang.Throwable) functionEvaluationException32);
        java.lang.Object[] objArray36 = new java.lang.Object[] {};
        java.lang.Throwable throwable39 = null;
        org.apache.commons.math.FunctionEvaluationException functionEvaluationException40 = new org.apache.commons.math.FunctionEvaluationException((double) 'a', "hi!", throwable39);
        org.apache.commons.math.FunctionEvaluationException functionEvaluationException41 = new org.apache.commons.math.FunctionEvaluationException((-1.0d), "", objArray36, (java.lang.Throwable) functionEvaluationException40);
        java.lang.Object[] objArray42 = functionEvaluationException40.getArguments();
        org.apache.commons.math.ConvergenceException convergenceException43 = new org.apache.commons.math.ConvergenceException("", objArray28, (java.lang.Throwable) functionEvaluationException40);
        org.apache.commons.math.ConvergenceException convergenceException46 = new org.apache.commons.math.ConvergenceException("");
        org.apache.commons.math.FunctionEvaluationException functionEvaluationException47 = new org.apache.commons.math.FunctionEvaluationException((double) 0, (java.lang.Throwable) convergenceException46);
        org.apache.commons.math.FunctionEvaluationException functionEvaluationException48 = new org.apache.commons.math.FunctionEvaluationException((double) 100.0f, "", objArray28, (java.lang.Throwable) functionEvaluationException47);
        functionEvaluationException22.addSuppressed((java.lang.Throwable) functionEvaluationException47);
        org.apache.commons.math.ConvergenceException convergenceException50 = new org.apache.commons.math.ConvergenceException("", objArray13, (java.lang.Throwable) functionEvaluationException22);
        org.apache.commons.math.ConvergenceException convergenceException51 = new org.apache.commons.math.ConvergenceException("hi!", objArray13);
        java.lang.Object[] objArray52 = convergenceException51.getArguments();
        org.apache.commons.math.MathException mathException53 = new org.apache.commons.math.MathException("Maximal number of iterations ({0}) exceeded", objArray52);
        java.lang.Object[] objArray60 = new java.lang.Object[] {};
        java.lang.Throwable throwable63 = null;
        org.apache.commons.math.FunctionEvaluationException functionEvaluationException64 = new org.apache.commons.math.FunctionEvaluationException((double) 'a', "hi!", throwable63);
        org.apache.commons.math.FunctionEvaluationException functionEvaluationException65 = new org.apache.commons.math.FunctionEvaluationException((-1.0d), "", objArray60, (java.lang.Throwable) functionEvaluationException64);
        org.apache.commons.math.FunctionEvaluationException functionEvaluationException66 = new org.apache.commons.math.FunctionEvaluationException((double) (byte) -1, (java.lang.Throwable) functionEvaluationException64);
        java.lang.Throwable[] throwableArray67 = functionEvaluationException64.getSuppressed();
        org.apache.commons.math.ConvergenceException convergenceException68 = new org.apache.commons.math.ConvergenceException("hi!", (java.lang.Object[]) throwableArray67);
        org.apache.commons.math.FunctionEvaluationException functionEvaluationException71 = new org.apache.commons.math.FunctionEvaluationException((double) (short) 0, "");
        org.apache.commons.math.ConvergenceException convergenceException72 = new org.apache.commons.math.ConvergenceException("", (java.lang.Object[]) throwableArray67, (java.lang.Throwable) functionEvaluationException71);
        org.apache.commons.math.ConvergenceException convergenceException73 = new org.apache.commons.math.ConvergenceException("org.apache.commons.math.FunctionEvaluationException: hi!", (java.lang.Throwable) functionEvaluationException71);
        org.apache.commons.math.FunctionEvaluationException functionEvaluationException74 = new org.apache.commons.math.FunctionEvaluationException((double) (short) 10, "org.apache.commons.math.MaxIterationsExceededException: Maximal number of iterations (32) exceeded", objArray52, (java.lang.Throwable) functionEvaluationException71);
        org.apache.commons.math.ConvergenceException convergenceException75 = new org.apache.commons.math.ConvergenceException("org.apache.commons.math.ConvergenceException: hi!", objArray52);
        org.apache.commons.math.ConvergenceException convergenceException76 = new org.apache.commons.math.ConvergenceException("org.apache.commons.math.MathException: org.apache.commons.math.MaxIterationsExceededException: org.apache.commons.math.MaxIterationsExceededException: ", objArray52);
        org.apache.commons.math.ConvergenceException convergenceException77 = new org.apache.commons.math.ConvergenceException("org.apache.commons.math.ConvergenceException: Maximal number of iterations (0) exceeded", objArray52);
        org.apache.commons.math.ConvergenceException convergenceException78 = new org.apache.commons.math.ConvergenceException("org.apache.commons.math.MathException: org.apache.commons.math.MaxIterationsExceededException: org.apache.commons.math.FunctionEvaluationException: Maximal number of iterations ({0}) exceeded", (java.lang.Throwable) convergenceException77);
        org.apache.commons.math.FunctionEvaluationException functionEvaluationException79 = new org.apache.commons.math.FunctionEvaluationException(100.0d, (java.lang.Throwable) convergenceException78);
        org.apache.commons.math.ConvergenceException convergenceException80 = new org.apache.commons.math.ConvergenceException((java.lang.Throwable) convergenceException78);
        java.lang.String str81 = convergenceException78.getPattern();
        org.junit.Assert.assertNotNull(objArray13);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray13), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray13), "[]");
        org.junit.Assert.assertNotNull(objArray28);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray28), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray28), "[]");
        org.junit.Assert.assertNotNull(objArray36);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray36), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray36), "[]");
        org.junit.Assert.assertNotNull(objArray42);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray42), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray42), "[]");
        org.junit.Assert.assertNotNull(objArray52);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray52), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray52), "[]");
        org.junit.Assert.assertNotNull(objArray60);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray60), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray60), "[]");
        org.junit.Assert.assertNotNull(throwableArray67);
        org.junit.Assert.assertEquals("'" + str81 + "' != '" + "org.apache.commons.math.MathException: org.apache.commons.math.MaxIterationsExceededException: org.apache.commons.math.FunctionEvaluationException: Maximal number of iterations ({0}) exceeded" + "'", str81, "org.apache.commons.math.MathException: org.apache.commons.math.MaxIterationsExceededException: org.apache.commons.math.FunctionEvaluationException: Maximal number of iterations ({0}) exceeded");
    }

    @Test
    public void test15518() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest31.test15518");
        org.apache.commons.math.FunctionEvaluationException functionEvaluationException3 = new org.apache.commons.math.FunctionEvaluationException((double) (byte) 0, "org.apache.commons.math.FunctionEvaluationException: Evaluation failed for argument = 100");
        org.apache.commons.math.ConvergenceException convergenceException4 = new org.apache.commons.math.ConvergenceException("hi!", (java.lang.Throwable) functionEvaluationException3);
        org.apache.commons.math.ConvergenceException convergenceException5 = new org.apache.commons.math.ConvergenceException((java.lang.Throwable) convergenceException4);
        java.lang.String str6 = convergenceException5.toString();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "org.apache.commons.math.ConvergenceException: hi!" + "'", str6, "org.apache.commons.math.ConvergenceException: hi!");
    }

    @Test
    public void test15519() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest31.test15519");
        java.lang.Throwable throwable2 = null;
        org.apache.commons.math.FunctionEvaluationException functionEvaluationException3 = new org.apache.commons.math.FunctionEvaluationException((double) (short) 1, "org.apache.commons.math.FunctionEvaluationException: ", throwable2);
        double double4 = functionEvaluationException3.getArgument();
        java.lang.Throwable[] throwableArray5 = functionEvaluationException3.getSuppressed();
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 1.0d + "'", double4 == 1.0d);
        org.junit.Assert.assertNotNull(throwableArray5);
    }

    @Test
    public void test15520() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest31.test15520");
        java.lang.Object[] objArray15 = new java.lang.Object[] {};
        java.lang.Throwable throwable18 = null;
        org.apache.commons.math.FunctionEvaluationException functionEvaluationException19 = new org.apache.commons.math.FunctionEvaluationException((double) 'a', "hi!", throwable18);
        org.apache.commons.math.FunctionEvaluationException functionEvaluationException20 = new org.apache.commons.math.FunctionEvaluationException((-1.0d), "", objArray15, (java.lang.Throwable) functionEvaluationException19);
        java.lang.Object[] objArray23 = new java.lang.Object[] {};
        java.lang.Throwable throwable26 = null;
        org.apache.commons.math.FunctionEvaluationException functionEvaluationException27 = new org.apache.commons.math.FunctionEvaluationException((double) 'a', "hi!", throwable26);
        org.apache.commons.math.FunctionEvaluationException functionEvaluationException28 = new org.apache.commons.math.FunctionEvaluationException((-1.0d), "", objArray23, (java.lang.Throwable) functionEvaluationException27);
        java.lang.Object[] objArray29 = functionEvaluationException27.getArguments();
        org.apache.commons.math.ConvergenceException convergenceException30 = new org.apache.commons.math.ConvergenceException("", objArray15, (java.lang.Throwable) functionEvaluationException27);
        org.apache.commons.math.FunctionEvaluationException functionEvaluationException31 = new org.apache.commons.math.FunctionEvaluationException((double) 1L, "", (java.lang.Throwable) convergenceException30);
        org.apache.commons.math.FunctionEvaluationException functionEvaluationException32 = new org.apache.commons.math.FunctionEvaluationException((double) (byte) -1, (java.lang.Throwable) convergenceException30);
        java.lang.Throwable[] throwableArray33 = convergenceException30.getSuppressed();
        org.apache.commons.math.MathException mathException34 = new org.apache.commons.math.MathException("", (java.lang.Object[]) throwableArray33);
        java.lang.Throwable throwable41 = null;
        org.apache.commons.math.FunctionEvaluationException functionEvaluationException42 = new org.apache.commons.math.FunctionEvaluationException((double) 'a', "hi!", throwable41);
        java.lang.String str43 = functionEvaluationException42.getPattern();
        java.lang.Object[] objArray47 = new java.lang.Object[] { functionEvaluationException42, (byte) 0, (short) -1, 1.0f };
        java.lang.Throwable throwable48 = null;
        org.apache.commons.math.ConvergenceException convergenceException49 = new org.apache.commons.math.ConvergenceException("hi!", objArray47, throwable48);
        org.apache.commons.math.MaxIterationsExceededException maxIterationsExceededException50 = new org.apache.commons.math.MaxIterationsExceededException((int) (byte) -1, "", objArray47);
        org.apache.commons.math.MathException mathException51 = new org.apache.commons.math.MathException("", objArray47);
        java.lang.Object[] objArray52 = mathException51.getArguments();
        org.apache.commons.math.FunctionEvaluationException functionEvaluationException53 = new org.apache.commons.math.FunctionEvaluationException((double) (byte) 10, "org.apache.commons.math.MaxIterationsExceededException: ", (java.lang.Object[]) throwableArray33, (java.lang.Throwable) mathException51);
        java.lang.Object[] objArray54 = functionEvaluationException53.getArguments();
        org.apache.commons.math.FunctionEvaluationException functionEvaluationException55 = new org.apache.commons.math.FunctionEvaluationException((double) (short) 1, "org.apache.commons.math.MaxIterationsExceededException: org.apache.commons.math.FunctionEvaluationException: Evaluation failed for argument = -1", (java.lang.Throwable) functionEvaluationException53);
        org.apache.commons.math.FunctionEvaluationException functionEvaluationException56 = new org.apache.commons.math.FunctionEvaluationException((double) 100L, "org.apache.commons.math.ConvergenceException: hi!", (java.lang.Throwable) functionEvaluationException53);
        org.apache.commons.math.MathException mathException57 = new org.apache.commons.math.MathException((java.lang.Throwable) functionEvaluationException56);
        org.apache.commons.math.MathException mathException58 = new org.apache.commons.math.MathException((java.lang.Throwable) mathException57);
        java.lang.Throwable[] throwableArray59 = mathException58.getSuppressed();
        org.apache.commons.math.ConvergenceException convergenceException60 = new org.apache.commons.math.ConvergenceException("org.apache.commons.math.MathException: org.apache.commons.math.FunctionEvaluationException: org.apache.commons.math.FunctionEvaluationException: org.apache.commons.math.FunctionEvaluationException: Evaluation failed for argument = -1", (java.lang.Object[]) throwableArray59);
        org.apache.commons.math.FunctionEvaluationException functionEvaluationException61 = new org.apache.commons.math.FunctionEvaluationException(0.0d, (java.lang.Throwable) convergenceException60);
        org.junit.Assert.assertNotNull(objArray15);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray15), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray15), "[]");
        org.junit.Assert.assertNotNull(objArray23);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray23), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray23), "[]");
        org.junit.Assert.assertNotNull(objArray29);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray29), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray29), "[]");
        org.junit.Assert.assertNotNull(throwableArray33);
        org.junit.Assert.assertEquals("'" + str43 + "' != '" + "hi!" + "'", str43, "hi!");
        org.junit.Assert.assertNotNull(objArray47);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray47), "[org.apache.commons.math.FunctionEvaluationException: hi!, 0, -1, 1.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray47), "[org.apache.commons.math.FunctionEvaluationException: hi!, 0, -1, 1.0]");
        org.junit.Assert.assertNotNull(objArray52);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray52), "[org.apache.commons.math.FunctionEvaluationException: hi!, 0, -1, 1.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray52), "[org.apache.commons.math.FunctionEvaluationException: hi!, 0, -1, 1.0]");
        org.junit.Assert.assertNotNull(objArray54);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray54), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray54), "[]");
        org.junit.Assert.assertNotNull(throwableArray59);
    }

    @Test
    public void test15521() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest31.test15521");
        java.lang.Object[] objArray10 = new java.lang.Object[] {};
        java.lang.Throwable throwable13 = null;
        org.apache.commons.math.FunctionEvaluationException functionEvaluationException14 = new org.apache.commons.math.FunctionEvaluationException((double) 'a', "hi!", throwable13);
        org.apache.commons.math.FunctionEvaluationException functionEvaluationException15 = new org.apache.commons.math.FunctionEvaluationException((-1.0d), "", objArray10, (java.lang.Throwable) functionEvaluationException14);
        org.apache.commons.math.FunctionEvaluationException functionEvaluationException16 = new org.apache.commons.math.FunctionEvaluationException((double) (byte) 0, "hi!", objArray10);
        org.apache.commons.math.FunctionEvaluationException functionEvaluationException17 = new org.apache.commons.math.FunctionEvaluationException((double) ' ', "hi!", objArray10);
        org.apache.commons.math.ConvergenceException convergenceException18 = new org.apache.commons.math.ConvergenceException("", objArray10);
        org.apache.commons.math.MathException mathException19 = new org.apache.commons.math.MathException("org.apache.commons.math.MathException: org.apache.commons.math.FunctionEvaluationException: Evaluation failed for argument = 1", objArray10);
        org.apache.commons.math.MaxIterationsExceededException maxIterationsExceededException20 = new org.apache.commons.math.MaxIterationsExceededException((int) (short) 10, "org.apache.commons.math.MaxIterationsExceededException: Maximal number of iterations (100) exceeded", objArray10);
        java.lang.Object[] objArray21 = maxIterationsExceededException20.getArguments();
        java.lang.Throwable[] throwableArray22 = maxIterationsExceededException20.getSuppressed();
        org.junit.Assert.assertNotNull(objArray10);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray10), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray10), "[]");
        org.junit.Assert.assertNotNull(objArray21);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray21), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray21), "[]");
        org.junit.Assert.assertNotNull(throwableArray22);
    }

    @Test
    public void test15522() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest31.test15522");
        org.apache.commons.math.MaxIterationsExceededException maxIterationsExceededException2 = new org.apache.commons.math.MaxIterationsExceededException((int) (short) 0);
        org.apache.commons.math.MathException mathException3 = new org.apache.commons.math.MathException((java.lang.Throwable) maxIterationsExceededException2);
        org.apache.commons.math.MathException mathException4 = new org.apache.commons.math.MathException("org.apache.commons.math.ConvergenceException: hi!", (java.lang.Throwable) mathException3);
        java.lang.Object[] objArray5 = mathException4.getArguments();
        org.junit.Assert.assertNotNull(objArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray5), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray5), "[]");
    }

    @Test
    public void test15523() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest31.test15523");
        java.lang.Throwable throwable2 = null;
        org.apache.commons.math.FunctionEvaluationException functionEvaluationException3 = new org.apache.commons.math.FunctionEvaluationException(10.0d, "org.apache.commons.math.ConvergenceException: org.apache.commons.math.MaxIterationsExceededException: org.apache.commons.math.ConvergenceException: hi!", throwable2);
    }

    @Test
    public void test15524() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest31.test15524");
        org.apache.commons.math.FunctionEvaluationException functionEvaluationException2 = new org.apache.commons.math.FunctionEvaluationException(32.0d, "org.apache.commons.math.ConvergenceException: org.apache.commons.math.FunctionEvaluationException: org.apache.commons.math.ConvergenceException: hi!");
    }

    @Test
    public void test15525() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest31.test15525");
        org.apache.commons.math.FunctionEvaluationException functionEvaluationException7 = new org.apache.commons.math.FunctionEvaluationException((double) (-1L), "");
        java.lang.Object[] objArray13 = new java.lang.Object[] {};
        java.lang.Throwable throwable16 = null;
        org.apache.commons.math.FunctionEvaluationException functionEvaluationException17 = new org.apache.commons.math.FunctionEvaluationException((double) 'a', "hi!", throwable16);
        org.apache.commons.math.FunctionEvaluationException functionEvaluationException18 = new org.apache.commons.math.FunctionEvaluationException((-1.0d), "", objArray13, (java.lang.Throwable) functionEvaluationException17);
        java.lang.Object[] objArray21 = new java.lang.Object[] {};
        java.lang.Throwable throwable24 = null;
        org.apache.commons.math.FunctionEvaluationException functionEvaluationException25 = new org.apache.commons.math.FunctionEvaluationException((double) 'a', "hi!", throwable24);
        org.apache.commons.math.FunctionEvaluationException functionEvaluationException26 = new org.apache.commons.math.FunctionEvaluationException((-1.0d), "", objArray21, (java.lang.Throwable) functionEvaluationException25);
        java.lang.Object[] objArray27 = functionEvaluationException25.getArguments();
        org.apache.commons.math.ConvergenceException convergenceException28 = new org.apache.commons.math.ConvergenceException("", objArray13, (java.lang.Throwable) functionEvaluationException25);
        org.apache.commons.math.ConvergenceException convergenceException31 = new org.apache.commons.math.ConvergenceException("");
        org.apache.commons.math.FunctionEvaluationException functionEvaluationException32 = new org.apache.commons.math.FunctionEvaluationException((double) 0, (java.lang.Throwable) convergenceException31);
        org.apache.commons.math.FunctionEvaluationException functionEvaluationException33 = new org.apache.commons.math.FunctionEvaluationException((double) 100.0f, "", objArray13, (java.lang.Throwable) functionEvaluationException32);
        functionEvaluationException7.addSuppressed((java.lang.Throwable) functionEvaluationException32);
        double double35 = functionEvaluationException7.getArgument();
        java.lang.Throwable[] throwableArray36 = functionEvaluationException7.getSuppressed();
        double double37 = functionEvaluationException7.getArgument();
        java.lang.Object[] objArray38 = functionEvaluationException7.getArguments();
        org.apache.commons.math.MathException mathException39 = new org.apache.commons.math.MathException("org.apache.commons.math.MathException: org.apache.commons.math.FunctionEvaluationException: org.apache.commons.math.FunctionEvaluationException: Maximal number of iterations ({0}) exceeded", objArray38);
        org.apache.commons.math.MaxIterationsExceededException maxIterationsExceededException40 = new org.apache.commons.math.MaxIterationsExceededException((int) (short) 10, "org.apache.commons.math.MathException: org.apache.commons.math.MathException: org.apache.commons.math.MaxIterationsExceededException: org.apache.commons.math.MaxIterationsExceededException: ", objArray38);
        org.apache.commons.math.MaxIterationsExceededException maxIterationsExceededException41 = new org.apache.commons.math.MaxIterationsExceededException(52, "org.apache.commons.math.ConvergenceException: Maximal number of iterations (0) exceeded", objArray38);
        org.junit.Assert.assertNotNull(objArray13);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray13), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray13), "[]");
        org.junit.Assert.assertNotNull(objArray21);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray21), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray21), "[]");
        org.junit.Assert.assertNotNull(objArray27);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray27), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray27), "[]");
        org.junit.Assert.assertTrue("'" + double35 + "' != '" + (-1.0d) + "'", double35 == (-1.0d));
        org.junit.Assert.assertNotNull(throwableArray36);
        org.junit.Assert.assertTrue("'" + double37 + "' != '" + (-1.0d) + "'", double37 == (-1.0d));
        org.junit.Assert.assertNotNull(objArray38);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray38), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray38), "[]");
    }

    @Test
    public void test15526() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest31.test15526");
        org.apache.commons.math.ConvergenceException convergenceException1 = new org.apache.commons.math.ConvergenceException("org.apache.commons.math.MaxIterationsExceededException: org.apache.commons.math.MathException: org.apache.commons.math.ConvergenceException: org.apache.commons.math.FunctionEvaluationException: Evaluation failed for argument = {0}");
    }

    @Test
    public void test15527() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest31.test15527");
        java.lang.Object[] objArray9 = new java.lang.Object[] {};
        java.lang.Throwable throwable12 = null;
        org.apache.commons.math.FunctionEvaluationException functionEvaluationException13 = new org.apache.commons.math.FunctionEvaluationException((double) 'a', "hi!", throwable12);
        org.apache.commons.math.FunctionEvaluationException functionEvaluationException14 = new org.apache.commons.math.FunctionEvaluationException((-1.0d), "", objArray9, (java.lang.Throwable) functionEvaluationException13);
        java.lang.Object[] objArray17 = new java.lang.Object[] {};
        java.lang.Throwable throwable20 = null;
        org.apache.commons.math.FunctionEvaluationException functionEvaluationException21 = new org.apache.commons.math.FunctionEvaluationException((double) 'a', "hi!", throwable20);
        org.apache.commons.math.FunctionEvaluationException functionEvaluationException22 = new org.apache.commons.math.FunctionEvaluationException((-1.0d), "", objArray17, (java.lang.Throwable) functionEvaluationException21);
        java.lang.Object[] objArray23 = functionEvaluationException21.getArguments();
        org.apache.commons.math.ConvergenceException convergenceException24 = new org.apache.commons.math.ConvergenceException("", objArray9, (java.lang.Throwable) functionEvaluationException21);
        org.apache.commons.math.ConvergenceException convergenceException27 = new org.apache.commons.math.ConvergenceException("");
        org.apache.commons.math.FunctionEvaluationException functionEvaluationException28 = new org.apache.commons.math.FunctionEvaluationException((double) 0, (java.lang.Throwable) convergenceException27);
        org.apache.commons.math.FunctionEvaluationException functionEvaluationException29 = new org.apache.commons.math.FunctionEvaluationException((double) 100.0f, "", objArray9, (java.lang.Throwable) functionEvaluationException28);
        org.apache.commons.math.MaxIterationsExceededException maxIterationsExceededException31 = new org.apache.commons.math.MaxIterationsExceededException((int) (short) 0);
        org.apache.commons.math.ConvergenceException convergenceException32 = new org.apache.commons.math.ConvergenceException("hi!", objArray9, (java.lang.Throwable) maxIterationsExceededException31);
        java.lang.Throwable[] throwableArray33 = maxIterationsExceededException31.getSuppressed();
        org.apache.commons.math.ConvergenceException convergenceException34 = new org.apache.commons.math.ConvergenceException((java.lang.Throwable) maxIterationsExceededException31);
        org.apache.commons.math.ConvergenceException convergenceException35 = new org.apache.commons.math.ConvergenceException("org.apache.commons.math.MaxIterationsExceededException: org.apache.commons.math.MaxIterationsExceededException: ", (java.lang.Throwable) convergenceException34);
        java.lang.String str36 = convergenceException34.getPattern();
        java.lang.Object[] objArray37 = convergenceException34.getArguments();
        org.apache.commons.math.FunctionEvaluationException functionEvaluationException38 = new org.apache.commons.math.FunctionEvaluationException((double) (-1.0f), "org.apache.commons.math.FunctionEvaluationException: org.apache.commons.math.FunctionEvaluationException: org.apache.commons.math.FunctionEvaluationException: Maximal number of iterations ({0}) exceeded", (java.lang.Throwable) convergenceException34);
        java.lang.Object[] objArray39 = convergenceException34.getArguments();
        org.junit.Assert.assertNotNull(objArray9);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray9), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray9), "[]");
        org.junit.Assert.assertNotNull(objArray17);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray17), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray17), "[]");
        org.junit.Assert.assertNotNull(objArray23);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray23), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray23), "[]");
        org.junit.Assert.assertNotNull(throwableArray33);
        org.junit.Assert.assertEquals("'" + str36 + "' != '" + "Maximal number of iterations (0) exceeded" + "'", str36, "Maximal number of iterations (0) exceeded");
        org.junit.Assert.assertNotNull(objArray37);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray37), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray37), "[]");
        org.junit.Assert.assertNotNull(objArray39);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray39), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray39), "[]");
    }

    @Test
    public void test15528() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest31.test15528");
        java.lang.Throwable throwable8 = null;
        org.apache.commons.math.FunctionEvaluationException functionEvaluationException9 = new org.apache.commons.math.FunctionEvaluationException((double) 'a', "hi!", throwable8);
        java.lang.String str10 = functionEvaluationException9.getPattern();
        org.apache.commons.math.ConvergenceException convergenceException11 = new org.apache.commons.math.ConvergenceException((java.lang.Throwable) functionEvaluationException9);
        org.apache.commons.math.FunctionEvaluationException functionEvaluationException12 = new org.apache.commons.math.FunctionEvaluationException((double) 0, "", (java.lang.Throwable) functionEvaluationException9);
        java.lang.Object[] objArray13 = functionEvaluationException12.getArguments();
        java.lang.Throwable[] throwableArray14 = functionEvaluationException12.getSuppressed();
        java.lang.Object[] objArray26 = new java.lang.Object[] {};
        java.lang.Throwable throwable29 = null;
        org.apache.commons.math.FunctionEvaluationException functionEvaluationException30 = new org.apache.commons.math.FunctionEvaluationException((double) 'a', "hi!", throwable29);
        org.apache.commons.math.FunctionEvaluationException functionEvaluationException31 = new org.apache.commons.math.FunctionEvaluationException((-1.0d), "", objArray26, (java.lang.Throwable) functionEvaluationException30);
        org.apache.commons.math.FunctionEvaluationException functionEvaluationException32 = new org.apache.commons.math.FunctionEvaluationException((double) (byte) 0, "hi!", objArray26);
        org.apache.commons.math.FunctionEvaluationException functionEvaluationException33 = new org.apache.commons.math.FunctionEvaluationException((double) ' ', "hi!", objArray26);
        org.apache.commons.math.ConvergenceException convergenceException34 = new org.apache.commons.math.ConvergenceException("", objArray26);
        java.lang.Throwable throwable42 = null;
        org.apache.commons.math.FunctionEvaluationException functionEvaluationException43 = new org.apache.commons.math.FunctionEvaluationException((double) 'a', "hi!", throwable42);
        java.lang.String str44 = functionEvaluationException43.getPattern();
        java.lang.Object[] objArray48 = new java.lang.Object[] { functionEvaluationException43, (byte) 0, (short) -1, 1.0f };
        java.lang.Throwable throwable49 = null;
        org.apache.commons.math.ConvergenceException convergenceException50 = new org.apache.commons.math.ConvergenceException("hi!", objArray48, throwable49);
        org.apache.commons.math.MaxIterationsExceededException maxIterationsExceededException51 = new org.apache.commons.math.MaxIterationsExceededException((int) (byte) -1, "", objArray48);
        java.lang.String str52 = maxIterationsExceededException51.getPattern();
        org.apache.commons.math.FunctionEvaluationException functionEvaluationException53 = new org.apache.commons.math.FunctionEvaluationException((double) (byte) 10, "org.apache.commons.math.FunctionEvaluationException: ", (java.lang.Throwable) maxIterationsExceededException51);
        org.apache.commons.math.ConvergenceException convergenceException54 = new org.apache.commons.math.ConvergenceException("", objArray26, (java.lang.Throwable) maxIterationsExceededException51);
        java.lang.Throwable throwable56 = null;
        org.apache.commons.math.FunctionEvaluationException functionEvaluationException57 = new org.apache.commons.math.FunctionEvaluationException((double) (short) 10, throwable56);
        org.apache.commons.math.FunctionEvaluationException functionEvaluationException58 = new org.apache.commons.math.FunctionEvaluationException((double) (byte) 1, "org.apache.commons.math.FunctionEvaluationException: org.apache.commons.math.MaxIterationsExceededException: ", objArray26, throwable56);
        java.lang.Object[] objArray62 = new java.lang.Object[] {};
        java.lang.Object[] objArray66 = new java.lang.Object[] {};
        java.lang.Throwable throwable69 = null;
        org.apache.commons.math.FunctionEvaluationException functionEvaluationException70 = new org.apache.commons.math.FunctionEvaluationException((double) 'a', "hi!", throwable69);
        org.apache.commons.math.FunctionEvaluationException functionEvaluationException71 = new org.apache.commons.math.FunctionEvaluationException((-1.0d), "", objArray66, (java.lang.Throwable) functionEvaluationException70);
        org.apache.commons.math.FunctionEvaluationException functionEvaluationException72 = new org.apache.commons.math.FunctionEvaluationException((double) (byte) -1, (java.lang.Throwable) functionEvaluationException70);
        org.apache.commons.math.ConvergenceException convergenceException73 = new org.apache.commons.math.ConvergenceException((java.lang.Throwable) functionEvaluationException72);
        org.apache.commons.math.FunctionEvaluationException functionEvaluationException74 = new org.apache.commons.math.FunctionEvaluationException((double) (byte) 10, "", objArray62, (java.lang.Throwable) convergenceException73);
        java.lang.Throwable throwable78 = null;
        org.apache.commons.math.FunctionEvaluationException functionEvaluationException79 = new org.apache.commons.math.FunctionEvaluationException((double) 'a', "hi!", throwable78);
        java.lang.String str80 = functionEvaluationException79.getPattern();
        java.lang.Object[] objArray84 = new java.lang.Object[] { functionEvaluationException79, (byte) 0, (short) -1, 1.0f };
        java.lang.Throwable throwable85 = null;
        org.apache.commons.math.ConvergenceException convergenceException86 = new org.apache.commons.math.ConvergenceException("hi!", objArray84, throwable85);
        org.apache.commons.math.ConvergenceException convergenceException87 = new org.apache.commons.math.ConvergenceException("", objArray62, (java.lang.Throwable) convergenceException86);
        org.apache.commons.math.ConvergenceException convergenceException88 = new org.apache.commons.math.ConvergenceException("org.apache.commons.math.MathException: ", objArray26, (java.lang.Throwable) convergenceException87);
        org.apache.commons.math.ConvergenceException convergenceException89 = new org.apache.commons.math.ConvergenceException("org.apache.commons.math.FunctionEvaluationException: Maximal number of iterations ({0}) exceeded", (java.lang.Object[]) throwableArray14, (java.lang.Throwable) convergenceException87);
        org.apache.commons.math.MathException mathException90 = new org.apache.commons.math.MathException("org.apache.commons.math.ConvergenceException: org.apache.commons.math.MaxIterationsExceededException: ", (java.lang.Object[]) throwableArray14);
        org.apache.commons.math.FunctionEvaluationException functionEvaluationException91 = new org.apache.commons.math.FunctionEvaluationException((double) 35, "org.apache.commons.math.FunctionEvaluationException: org.apache.commons.math.FunctionEvaluationException: Maximal number of iterations (52) exceeded", (java.lang.Object[]) throwableArray14);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertNotNull(objArray13);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray13), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray13), "[]");
        org.junit.Assert.assertNotNull(throwableArray14);
        org.junit.Assert.assertNotNull(objArray26);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray26), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray26), "[]");
        org.junit.Assert.assertEquals("'" + str44 + "' != '" + "hi!" + "'", str44, "hi!");
        org.junit.Assert.assertNotNull(objArray48);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray48), "[org.apache.commons.math.FunctionEvaluationException: hi!, 0, -1, 1.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray48), "[org.apache.commons.math.FunctionEvaluationException: hi!, 0, -1, 1.0]");
        org.junit.Assert.assertEquals("'" + str52 + "' != '" + "" + "'", str52, "");
        org.junit.Assert.assertNotNull(objArray62);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray62), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray62), "[]");
        org.junit.Assert.assertNotNull(objArray66);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray66), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray66), "[]");
        org.junit.Assert.assertEquals("'" + str80 + "' != '" + "hi!" + "'", str80, "hi!");
        org.junit.Assert.assertNotNull(objArray84);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray84), "[org.apache.commons.math.FunctionEvaluationException: hi!, 0, -1, 1.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray84), "[org.apache.commons.math.FunctionEvaluationException: hi!, 0, -1, 1.0]");
    }
}

