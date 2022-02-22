import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class RegressionTest29 {

    public static boolean debug = false;

    @Test
    public void test14501() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest29.test14501");
        org.apache.commons.math.ode.SwitchingFunctionsHandler switchingFunctionsHandler0 = new org.apache.commons.math.ode.SwitchingFunctionsHandler();
        boolean boolean1 = switchingFunctionsHandler0.isEmpty();
        double[] doubleArray4 = new double[] { 100.0d };
        boolean boolean5 = switchingFunctionsHandler0.reset((double) 0L, doubleArray4);
        org.apache.commons.math.ode.SwitchingFunctionsHandler switchingFunctionsHandler7 = new org.apache.commons.math.ode.SwitchingFunctionsHandler();
        boolean boolean8 = switchingFunctionsHandler7.isEmpty();
        org.apache.commons.math.ode.StepInterpolator stepInterpolator9 = null;
        boolean boolean10 = switchingFunctionsHandler7.evaluateStep(stepInterpolator9);
        org.apache.commons.math.ode.SwitchingFunctionsHandler switchingFunctionsHandler12 = new org.apache.commons.math.ode.SwitchingFunctionsHandler();
        boolean boolean13 = switchingFunctionsHandler12.isEmpty();
        double[] doubleArray16 = new double[] { 100.0d };
        boolean boolean17 = switchingFunctionsHandler12.reset((double) 0L, doubleArray16);
        boolean boolean18 = switchingFunctionsHandler7.reset((double) 1, doubleArray16);
        boolean boolean19 = switchingFunctionsHandler0.reset((double) 100, doubleArray16);
        double double20 = switchingFunctionsHandler0.getEventTime();
        boolean boolean21 = switchingFunctionsHandler0.stop();
        double double22 = switchingFunctionsHandler0.getEventTime();
        boolean boolean23 = switchingFunctionsHandler0.stop();
        boolean boolean24 = switchingFunctionsHandler0.stop();
        boolean boolean25 = switchingFunctionsHandler0.isEmpty();
        org.apache.commons.math.ode.StepInterpolator stepInterpolator26 = null;
        boolean boolean27 = switchingFunctionsHandler0.evaluateStep(stepInterpolator26);
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertNotNull(doubleArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray4), "[100.0]");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertNotNull(doubleArray16);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray16), "[100.0]");
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertTrue(Double.isNaN(double20));
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertTrue(Double.isNaN(double22));
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + true + "'", boolean25 == true);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + false + "'", boolean27 == false);
    }

    @Test
    public void test14502() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest29.test14502");
        java.lang.String[] strArray17 = new java.lang.String[] { "hi!", "org.apache.commons.math.MathException: hi!", "", "hi!", "org.apache.commons.math.MathException: hi!" };
        org.apache.commons.math.ode.DerivativeException derivativeException18 = new org.apache.commons.math.ode.DerivativeException("hi!", strArray17);
        org.apache.commons.math.ode.IntegratorException integratorException19 = new org.apache.commons.math.ode.IntegratorException("", (java.lang.Object[]) strArray17);
        org.apache.commons.math.ode.DerivativeException derivativeException20 = new org.apache.commons.math.ode.DerivativeException("hi!", strArray17);
        org.apache.commons.math.ode.IntegratorException integratorException21 = new org.apache.commons.math.ode.IntegratorException("org.apache.commons.math.FunctionEvaluationException: hi!", (java.lang.Object[]) strArray17);
        java.lang.String[] strArray33 = new java.lang.String[] { "hi!", "org.apache.commons.math.MathException: hi!", "", "hi!", "org.apache.commons.math.MathException: hi!" };
        org.apache.commons.math.ode.DerivativeException derivativeException34 = new org.apache.commons.math.ode.DerivativeException("hi!", strArray33);
        org.apache.commons.math.MathException mathException35 = new org.apache.commons.math.MathException("hi!", (java.lang.Object[]) strArray33);
        org.apache.commons.math.ode.DerivativeException derivativeException36 = new org.apache.commons.math.ode.DerivativeException("", strArray33);
        org.apache.commons.math.FunctionEvaluationException functionEvaluationException37 = new org.apache.commons.math.FunctionEvaluationException((double) (byte) -1, "org.apache.commons.math.MathException: ", (java.lang.Object[]) strArray33);
        org.apache.commons.math.ode.DerivativeException derivativeException38 = new org.apache.commons.math.ode.DerivativeException("", strArray33);
        org.apache.commons.math.FunctionEvaluationException functionEvaluationException39 = new org.apache.commons.math.FunctionEvaluationException((double) 10.0f, "org.apache.commons.math.FunctionEvaluationException: org.apache.commons.math.MathException: hi!", (java.lang.Object[]) strArray17, (java.lang.Throwable) derivativeException38);
        org.apache.commons.math.FunctionEvaluationException functionEvaluationException40 = new org.apache.commons.math.FunctionEvaluationException((double) 10, "org.apache.commons.math.FunctionEvaluationException: org.apache.commons.math.FunctionEvaluationException: Evaluation failed for argument = 35", (java.lang.Object[]) strArray17);
        java.lang.String[] strArray50 = new java.lang.String[] { "hi!", "org.apache.commons.math.MathException: hi!", "", "hi!", "org.apache.commons.math.MathException: hi!" };
        org.apache.commons.math.ode.DerivativeException derivativeException51 = new org.apache.commons.math.ode.DerivativeException("hi!", strArray50);
        org.apache.commons.math.ConvergenceException convergenceException52 = new org.apache.commons.math.ConvergenceException("", (java.lang.Object[]) strArray50);
        org.apache.commons.math.ConvergenceException convergenceException53 = new org.apache.commons.math.ConvergenceException("", (java.lang.Object[]) strArray50);
        org.apache.commons.math.ode.IntegratorException integratorException54 = new org.apache.commons.math.ode.IntegratorException((java.lang.Throwable) convergenceException53);
        org.apache.commons.math.FunctionEvaluationException functionEvaluationException55 = new org.apache.commons.math.FunctionEvaluationException((double) (short) 10, (java.lang.Throwable) integratorException54);
        org.apache.commons.math.MathException mathException56 = new org.apache.commons.math.MathException((java.lang.Throwable) integratorException54);
        org.apache.commons.math.MathException mathException57 = new org.apache.commons.math.MathException("org.apache.commons.math.FunctionEvaluationException: org.apache.commons.math.FunctionEvaluationException: org.apache.commons.math.FunctionEvaluationException: hi!", (java.lang.Object[]) strArray17, (java.lang.Throwable) mathException56);
        org.apache.commons.math.ode.DerivativeException derivativeException58 = new org.apache.commons.math.ode.DerivativeException("org.apache.commons.math.MathException: org.apache.commons.math.MathException: org.apache.commons.math.FunctionEvaluationException: hi!", strArray17);
        org.apache.commons.math.ode.IntegratorException integratorException59 = new org.apache.commons.math.ode.IntegratorException("org.apache.commons.math.ConvergenceException: org.apache.commons.math.ode.DerivativeException: Evaluation failed for argument = 52", (java.lang.Object[]) strArray17);
        org.apache.commons.math.MathException mathException60 = new org.apache.commons.math.MathException("org.apache.commons.math.MathException: org.apache.commons.math.ode.IntegratorException: org.apache.commons.math.ode.IntegratorException: ", (java.lang.Object[]) strArray17);
        org.junit.Assert.assertNotNull(strArray17);
        org.junit.Assert.assertNotNull(strArray33);
        org.junit.Assert.assertNotNull(strArray50);
    }

    @Test
    public void test14503() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest29.test14503");
        java.lang.String[] strArray9 = new java.lang.String[] { "hi!", "org.apache.commons.math.MathException: hi!", "", "hi!", "org.apache.commons.math.MathException: hi!" };
        org.apache.commons.math.ode.DerivativeException derivativeException10 = new org.apache.commons.math.ode.DerivativeException("hi!", strArray9);
        org.apache.commons.math.ode.IntegratorException integratorException11 = new org.apache.commons.math.ode.IntegratorException("", (java.lang.Object[]) strArray9);
        org.apache.commons.math.ode.DerivativeException derivativeException12 = new org.apache.commons.math.ode.DerivativeException("hi!", strArray9);
        org.apache.commons.math.ode.IntegratorException integratorException13 = new org.apache.commons.math.ode.IntegratorException("org.apache.commons.math.FunctionEvaluationException: org.apache.commons.math.ode.DerivativeException: org.apache.commons.math.MathException", (java.lang.Object[]) strArray9);
        org.junit.Assert.assertNotNull(strArray9);
    }

    @Test
    public void test14504() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest29.test14504");
        org.apache.commons.math.ConvergenceException convergenceException1 = new org.apache.commons.math.ConvergenceException("org.apache.commons.math.FunctionEvaluationException: org.apache.commons.math.ConvergenceException: Evaluation failed for argument = 52");
        org.apache.commons.math.ConvergenceException convergenceException2 = new org.apache.commons.math.ConvergenceException((java.lang.Throwable) convergenceException1);
        org.apache.commons.math.ode.IntegratorException integratorException3 = new org.apache.commons.math.ode.IntegratorException((java.lang.Throwable) convergenceException2);
        org.apache.commons.math.MathException mathException4 = new org.apache.commons.math.MathException((java.lang.Throwable) integratorException3);
        org.apache.commons.math.ode.DerivativeException derivativeException5 = new org.apache.commons.math.ode.DerivativeException((java.lang.Throwable) mathException4);
    }

    @Test
    public void test14505() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest29.test14505");
        java.lang.String[] strArray12 = new java.lang.String[] { "hi!", "org.apache.commons.math.MathException: hi!", "", "hi!", "org.apache.commons.math.MathException: hi!" };
        org.apache.commons.math.ode.DerivativeException derivativeException13 = new org.apache.commons.math.ode.DerivativeException("hi!", strArray12);
        org.apache.commons.math.MathException mathException14 = new org.apache.commons.math.MathException("hi!", (java.lang.Object[]) strArray12);
        org.apache.commons.math.ode.DerivativeException derivativeException15 = new org.apache.commons.math.ode.DerivativeException("", strArray12);
        org.apache.commons.math.FunctionEvaluationException functionEvaluationException16 = new org.apache.commons.math.FunctionEvaluationException((double) (byte) -1, "org.apache.commons.math.MathException: ", (java.lang.Object[]) strArray12);
        org.apache.commons.math.MathException mathException17 = new org.apache.commons.math.MathException("org.apache.commons.math.ode.IntegratorException: ", (java.lang.Object[]) strArray12);
        org.apache.commons.math.MathException mathException18 = new org.apache.commons.math.MathException("", (java.lang.Throwable) mathException17);
        java.lang.Object[] objArray19 = mathException18.getArguments();
        org.junit.Assert.assertNotNull(strArray12);
        org.junit.Assert.assertNotNull(objArray19);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray19), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray19), "[]");
    }

    @Test
    public void test14506() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest29.test14506");
        org.apache.commons.math.FunctionEvaluationException functionEvaluationException2 = new org.apache.commons.math.FunctionEvaluationException((double) 10L, "org.apache.commons.math.FunctionEvaluationException: org.apache.commons.math.FunctionEvaluationException: org.apache.commons.math.FunctionEvaluationException: hi!");
    }

    @Test
    public void test14507() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest29.test14507");
        org.apache.commons.math.ConvergenceException convergenceException12 = new org.apache.commons.math.ConvergenceException("hi!");
        org.apache.commons.math.MathException mathException13 = new org.apache.commons.math.MathException("hi!", (java.lang.Throwable) convergenceException12);
        java.lang.Object[] objArray14 = mathException13.getArguments();
        java.lang.Throwable throwable15 = null;
        org.apache.commons.math.ConvergenceException convergenceException16 = new org.apache.commons.math.ConvergenceException("hi!", objArray14, throwable15);
        org.apache.commons.math.FunctionEvaluationException functionEvaluationException17 = new org.apache.commons.math.FunctionEvaluationException((double) 1L, "", objArray14);
        org.apache.commons.math.FunctionEvaluationException functionEvaluationException18 = new org.apache.commons.math.FunctionEvaluationException(0.0d, "org.apache.commons.math.ode.IntegratorException: ", objArray14);
        org.apache.commons.math.ode.IntegratorException integratorException19 = new org.apache.commons.math.ode.IntegratorException("org.apache.commons.math.ode.DerivativeException: org.apache.commons.math.MathException", objArray14);
        java.lang.Object[] objArray33 = new java.lang.Object[] { 1L, 'a', 10L, 'a', (-1) };
        org.apache.commons.math.ConvergenceException convergenceException34 = new org.apache.commons.math.ConvergenceException("", objArray33);
        org.apache.commons.math.FunctionEvaluationException functionEvaluationException35 = new org.apache.commons.math.FunctionEvaluationException((-1.0d), "", objArray33);
        org.apache.commons.math.ode.IntegratorException integratorException36 = new org.apache.commons.math.ode.IntegratorException("hi!", objArray33);
        org.apache.commons.math.MathException mathException37 = new org.apache.commons.math.MathException("org.apache.commons.math.MathException: hi!", objArray33);
        org.apache.commons.math.ConvergenceException convergenceException38 = new org.apache.commons.math.ConvergenceException("org.apache.commons.math.MathException: ", objArray33);
        java.lang.Object[] objArray49 = new java.lang.Object[] { 1L, 'a', 10L, 'a', (-1) };
        org.apache.commons.math.ConvergenceException convergenceException50 = new org.apache.commons.math.ConvergenceException("", objArray49);
        org.apache.commons.math.FunctionEvaluationException functionEvaluationException51 = new org.apache.commons.math.FunctionEvaluationException((-1.0d), "", objArray49);
        org.apache.commons.math.ode.IntegratorException integratorException52 = new org.apache.commons.math.ode.IntegratorException("hi!", objArray49);
        org.apache.commons.math.MathException mathException53 = new org.apache.commons.math.MathException("org.apache.commons.math.MathException: hi!", objArray49);
        org.apache.commons.math.FunctionEvaluationException functionEvaluationException54 = new org.apache.commons.math.FunctionEvaluationException(1.0d, "hi!", objArray33, (java.lang.Throwable) mathException53);
        org.apache.commons.math.ConvergenceException convergenceException55 = new org.apache.commons.math.ConvergenceException("org.apache.commons.math.FunctionEvaluationException: Evaluation failed for argument = 52", objArray14, (java.lang.Throwable) mathException53);
        org.apache.commons.math.FunctionEvaluationException functionEvaluationException56 = new org.apache.commons.math.FunctionEvaluationException(0.0d, "org.apache.commons.math.ode.IntegratorException: Evaluation failed for argument = 100", objArray14);
        org.apache.commons.math.ConvergenceException convergenceException57 = new org.apache.commons.math.ConvergenceException("org.apache.commons.math.ode.DerivativeException: Evaluation failed for argument = 100", (java.lang.Throwable) functionEvaluationException56);
        double double58 = functionEvaluationException56.getArgument();
        java.lang.String str59 = functionEvaluationException56.toString();
        org.junit.Assert.assertNotNull(objArray14);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray14), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray14), "[]");
        org.junit.Assert.assertNotNull(objArray33);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray33), "[1, a, 10, a, -1]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray33), "[1, a, 10, a, -1]");
        org.junit.Assert.assertNotNull(objArray49);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray49), "[1, a, 10, a, -1]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray49), "[1, a, 10, a, -1]");
        org.junit.Assert.assertTrue("'" + double58 + "' != '" + 0.0d + "'", double58 == 0.0d);
        org.junit.Assert.assertEquals("'" + str59 + "' != '" + "org.apache.commons.math.FunctionEvaluationException: org.apache.commons.math.ode.IntegratorException: Evaluation failed for argument = 100" + "'", str59, "org.apache.commons.math.FunctionEvaluationException: org.apache.commons.math.ode.IntegratorException: Evaluation failed for argument = 100");
    }

    @Test
    public void test14508() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest29.test14508");
        java.lang.Object[] objArray14 = new java.lang.Object[] { 1L, 'a', 10L, 'a', (-1) };
        org.apache.commons.math.ConvergenceException convergenceException15 = new org.apache.commons.math.ConvergenceException("", objArray14);
        org.apache.commons.math.ode.IntegratorException integratorException16 = new org.apache.commons.math.ode.IntegratorException("org.apache.commons.math.MathException: hi!", objArray14);
        org.apache.commons.math.MathException mathException17 = new org.apache.commons.math.MathException((java.lang.Throwable) integratorException16);
        java.lang.Throwable[] throwableArray18 = integratorException16.getSuppressed();
        org.apache.commons.math.MathException mathException19 = new org.apache.commons.math.MathException("", (java.lang.Object[]) throwableArray18);
        java.lang.Throwable[] throwableArray20 = mathException19.getSuppressed();
        org.apache.commons.math.ode.IntegratorException integratorException21 = new org.apache.commons.math.ode.IntegratorException("org.apache.commons.math.MathException: Evaluation failed for argument = 52", (java.lang.Object[]) throwableArray20);
        org.apache.commons.math.ConvergenceException convergenceException26 = new org.apache.commons.math.ConvergenceException("hi!");
        org.apache.commons.math.MathException mathException27 = new org.apache.commons.math.MathException("hi!", (java.lang.Throwable) convergenceException26);
        org.apache.commons.math.FunctionEvaluationException functionEvaluationException28 = new org.apache.commons.math.FunctionEvaluationException((double) 3, "org.apache.commons.math.MathException: ", (java.lang.Throwable) mathException27);
        org.apache.commons.math.MathException mathException29 = new org.apache.commons.math.MathException("org.apache.commons.math.FunctionEvaluationException: Evaluation failed for argument = 35", (java.lang.Object[]) throwableArray20, (java.lang.Throwable) functionEvaluationException28);
        org.apache.commons.math.MathException mathException30 = new org.apache.commons.math.MathException("org.apache.commons.math.FunctionEvaluationException: hi!", (java.lang.Object[]) throwableArray20);
        org.apache.commons.math.ConvergenceException convergenceException31 = new org.apache.commons.math.ConvergenceException("org.apache.commons.math.ode.DerivativeException: org.apache.commons.math.MathException: ", (java.lang.Object[]) throwableArray20);
        org.apache.commons.math.FunctionEvaluationException functionEvaluationException37 = new org.apache.commons.math.FunctionEvaluationException((double) (short) -1);
        org.apache.commons.math.ode.IntegratorException integratorException38 = new org.apache.commons.math.ode.IntegratorException((java.lang.Throwable) functionEvaluationException37);
        java.lang.Throwable[] throwableArray39 = functionEvaluationException37.getSuppressed();
        java.lang.Object[] objArray40 = functionEvaluationException37.getArguments();
        org.apache.commons.math.MathException mathException41 = new org.apache.commons.math.MathException("", objArray40);
        org.apache.commons.math.FunctionEvaluationException functionEvaluationException42 = new org.apache.commons.math.FunctionEvaluationException((double) (short) -1, "org.apache.commons.math.ConvergenceException: org.apache.commons.math.FunctionEvaluationException: hi!", objArray40);
        java.lang.String[] strArray51 = new java.lang.String[] { "hi!", "org.apache.commons.math.MathException: hi!", "", "hi!", "org.apache.commons.math.MathException: hi!" };
        org.apache.commons.math.ode.DerivativeException derivativeException52 = new org.apache.commons.math.ode.DerivativeException("hi!", strArray51);
        org.apache.commons.math.ConvergenceException convergenceException53 = new org.apache.commons.math.ConvergenceException("", (java.lang.Object[]) strArray51);
        org.apache.commons.math.ConvergenceException convergenceException54 = new org.apache.commons.math.ConvergenceException("", (java.lang.Object[]) strArray51);
        org.apache.commons.math.ode.IntegratorException integratorException55 = new org.apache.commons.math.ode.IntegratorException((java.lang.Throwable) convergenceException54);
        org.apache.commons.math.MathException mathException56 = new org.apache.commons.math.MathException("hi!", objArray40, (java.lang.Throwable) convergenceException54);
        org.apache.commons.math.MathException mathException57 = new org.apache.commons.math.MathException((java.lang.Throwable) mathException56);
        org.apache.commons.math.FunctionEvaluationException functionEvaluationException58 = new org.apache.commons.math.FunctionEvaluationException(3.0d, "org.apache.commons.math.MathException: org.apache.commons.math.MathException: org.apache.commons.math.ConvergenceException: org.apache.commons.math.MathException: ", (java.lang.Object[]) throwableArray20, (java.lang.Throwable) mathException56);
        java.lang.Class<?> wildcardClass59 = mathException56.getClass();
        org.junit.Assert.assertNotNull(objArray14);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray14), "[1, a, 10, a, -1]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray14), "[1, a, 10, a, -1]");
        org.junit.Assert.assertNotNull(throwableArray18);
        org.junit.Assert.assertNotNull(throwableArray20);
        org.junit.Assert.assertNotNull(throwableArray39);
        org.junit.Assert.assertNotNull(objArray40);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray40), "[-1.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray40), "[-1.0]");
        org.junit.Assert.assertNotNull(strArray51);
        org.junit.Assert.assertNotNull(wildcardClass59);
    }

    @Test
    public void test14509() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest29.test14509");
        org.apache.commons.math.ode.SwitchingFunctionsHandler switchingFunctionsHandler0 = new org.apache.commons.math.ode.SwitchingFunctionsHandler();
        org.apache.commons.math.ode.SwitchingFunction switchingFunction1 = null;
        switchingFunctionsHandler0.add(switchingFunction1, (double) (-1), (double) 3, 0);
        double[] doubleArray13 = new double[] { 0L, 10.0d, 'a', 0.0d, (-1.0d), 0 };
        boolean boolean14 = switchingFunctionsHandler0.reset((double) (-1), doubleArray13);
        boolean boolean15 = switchingFunctionsHandler0.isEmpty();
        double double16 = switchingFunctionsHandler0.getEventTime();
        org.apache.commons.math.ode.SwitchingFunction switchingFunction17 = null;
        switchingFunctionsHandler0.add(switchingFunction17, (double) (short) 10, 0.0d, 1);
        double double22 = switchingFunctionsHandler0.getEventTime();
        double double23 = switchingFunctionsHandler0.getEventTime();
        double double24 = switchingFunctionsHandler0.getEventTime();
        org.apache.commons.math.ode.StepInterpolator stepInterpolator25 = null;
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean26 = switchingFunctionsHandler0.evaluateStep(stepInterpolator25);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(doubleArray13);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray13), "[0.0, 10.0, 97.0, 0.0, -1.0, 0.0]");
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue(Double.isNaN(double16));
        org.junit.Assert.assertTrue(Double.isNaN(double22));
        org.junit.Assert.assertTrue(Double.isNaN(double23));
        org.junit.Assert.assertTrue(Double.isNaN(double24));
    }

    @Test
    public void test14510() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest29.test14510");
        java.lang.String[] strArray11 = new java.lang.String[] { "hi!", "org.apache.commons.math.MathException: hi!", "", "hi!", "org.apache.commons.math.MathException: hi!" };
        org.apache.commons.math.ode.DerivativeException derivativeException12 = new org.apache.commons.math.ode.DerivativeException("hi!", strArray11);
        org.apache.commons.math.ConvergenceException convergenceException13 = new org.apache.commons.math.ConvergenceException("org.apache.commons.math.FunctionEvaluationException: hi!", (java.lang.Object[]) strArray11);
        org.apache.commons.math.MathException mathException14 = new org.apache.commons.math.MathException("org.apache.commons.math.FunctionEvaluationException: ", (java.lang.Object[]) strArray11);
        org.apache.commons.math.MathException mathException15 = new org.apache.commons.math.MathException("org.apache.commons.math.FunctionEvaluationException: org.apache.commons.math.MathException: Evaluation failed for argument = 52", (java.lang.Object[]) strArray11);
        org.apache.commons.math.ode.DerivativeException derivativeException16 = new org.apache.commons.math.ode.DerivativeException("", strArray11);
        org.apache.commons.math.ConvergenceException convergenceException17 = new org.apache.commons.math.ConvergenceException("", (java.lang.Object[]) strArray11);
        org.junit.Assert.assertNotNull(strArray11);
    }

    @Test
    public void test14511() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest29.test14511");
        java.lang.String[] strArray12 = new java.lang.String[] { "hi!", "org.apache.commons.math.MathException: hi!", "", "hi!", "org.apache.commons.math.MathException: hi!" };
        org.apache.commons.math.ode.DerivativeException derivativeException13 = new org.apache.commons.math.ode.DerivativeException("hi!", strArray12);
        org.apache.commons.math.ConvergenceException convergenceException14 = new org.apache.commons.math.ConvergenceException("", (java.lang.Object[]) strArray12);
        org.apache.commons.math.ode.SwitchingFunctionsHandler switchingFunctionsHandler20 = new org.apache.commons.math.ode.SwitchingFunctionsHandler();
        java.lang.Object[] objArray29 = new java.lang.Object[] { 1L, 'a', 10L, 'a', (-1) };
        org.apache.commons.math.ConvergenceException convergenceException30 = new org.apache.commons.math.ConvergenceException("", objArray29);
        org.apache.commons.math.ode.IntegratorException integratorException31 = new org.apache.commons.math.ode.IntegratorException("org.apache.commons.math.MathException: hi!", objArray29);
        java.lang.Object[] objArray32 = new java.lang.Object[] { 2, switchingFunctionsHandler20, 1, objArray29 };
        org.apache.commons.math.ConvergenceException convergenceException35 = new org.apache.commons.math.ConvergenceException("hi!");
        org.apache.commons.math.MathException mathException36 = new org.apache.commons.math.MathException("hi!", (java.lang.Throwable) convergenceException35);
        org.apache.commons.math.FunctionEvaluationException functionEvaluationException37 = new org.apache.commons.math.FunctionEvaluationException((double) (short) 0, "org.apache.commons.math.MathException: hi!", objArray29, (java.lang.Throwable) mathException36);
        org.apache.commons.math.FunctionEvaluationException functionEvaluationException39 = new org.apache.commons.math.FunctionEvaluationException((double) 100L);
        org.apache.commons.math.ConvergenceException convergenceException40 = new org.apache.commons.math.ConvergenceException("org.apache.commons.math.MathException: hi!", objArray29, (java.lang.Throwable) functionEvaluationException39);
        org.apache.commons.math.FunctionEvaluationException functionEvaluationException42 = new org.apache.commons.math.FunctionEvaluationException((double) 100L);
        org.apache.commons.math.ConvergenceException convergenceException43 = new org.apache.commons.math.ConvergenceException("org.apache.commons.math.MathException: hi!", objArray29, (java.lang.Throwable) functionEvaluationException42);
        org.apache.commons.math.MathException mathException44 = new org.apache.commons.math.MathException("org.apache.commons.math.MathException: ", (java.lang.Object[]) strArray12, (java.lang.Throwable) functionEvaluationException42);
        java.lang.Throwable[] throwableArray45 = functionEvaluationException42.getSuppressed();
        org.apache.commons.math.FunctionEvaluationException functionEvaluationException46 = new org.apache.commons.math.FunctionEvaluationException(Double.NaN, (java.lang.Throwable) functionEvaluationException42);
        org.apache.commons.math.MathException mathException47 = new org.apache.commons.math.MathException((java.lang.Throwable) functionEvaluationException46);
        org.apache.commons.math.FunctionEvaluationException functionEvaluationException48 = new org.apache.commons.math.FunctionEvaluationException((double) 100, "org.apache.commons.math.ode.DerivativeException: org.apache.commons.math.ConvergenceException: Evaluation failed for argument = 52", (java.lang.Throwable) mathException47);
        org.apache.commons.math.MathException mathException49 = new org.apache.commons.math.MathException("Evaluation failed for argument = 100", (java.lang.Throwable) functionEvaluationException48);
        org.junit.Assert.assertNotNull(strArray12);
        org.junit.Assert.assertNotNull(objArray29);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray29), "[1, a, 10, a, -1]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray29), "[1, a, 10, a, -1]");
        org.junit.Assert.assertNotNull(objArray32);
        org.junit.Assert.assertNotNull(throwableArray45);
    }

    @Test
    public void test14512() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest29.test14512");
        java.lang.Object[] objArray10 = new java.lang.Object[] { 1L, 'a', 10L, 'a', (-1) };
        org.apache.commons.math.ConvergenceException convergenceException11 = new org.apache.commons.math.ConvergenceException("", objArray10);
        org.apache.commons.math.FunctionEvaluationException functionEvaluationException12 = new org.apache.commons.math.FunctionEvaluationException((-1.0d), "", objArray10);
        org.apache.commons.math.ode.IntegratorException integratorException13 = new org.apache.commons.math.ode.IntegratorException("hi!", objArray10);
        java.lang.Object[] objArray24 = new java.lang.Object[] { 1L, 'a', 10L, 'a', (-1) };
        org.apache.commons.math.ConvergenceException convergenceException25 = new org.apache.commons.math.ConvergenceException("", objArray24);
        org.apache.commons.math.FunctionEvaluationException functionEvaluationException26 = new org.apache.commons.math.FunctionEvaluationException((-1.0d), "", objArray24);
        org.apache.commons.math.ode.IntegratorException integratorException27 = new org.apache.commons.math.ode.IntegratorException("hi!", objArray24);
        org.apache.commons.math.FunctionEvaluationException functionEvaluationException30 = new org.apache.commons.math.FunctionEvaluationException((double) (short) 1, "");
        org.apache.commons.math.MathException mathException31 = new org.apache.commons.math.MathException("", objArray24, (java.lang.Throwable) functionEvaluationException30);
        integratorException13.addSuppressed((java.lang.Throwable) functionEvaluationException30);
        org.apache.commons.math.FunctionEvaluationException functionEvaluationException33 = new org.apache.commons.math.FunctionEvaluationException((double) (byte) 1, (java.lang.Throwable) functionEvaluationException30);
        org.apache.commons.math.MathException mathException34 = new org.apache.commons.math.MathException((java.lang.Throwable) functionEvaluationException33);
        org.junit.Assert.assertNotNull(objArray10);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray10), "[1, a, 10, a, -1]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray10), "[1, a, 10, a, -1]");
        org.junit.Assert.assertNotNull(objArray24);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray24), "[1, a, 10, a, -1]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray24), "[1, a, 10, a, -1]");
    }

    @Test
    public void test14513() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest29.test14513");
        org.apache.commons.math.ode.SwitchingFunctionsHandler switchingFunctionsHandler0 = new org.apache.commons.math.ode.SwitchingFunctionsHandler();
        boolean boolean1 = switchingFunctionsHandler0.isEmpty();
        double[] doubleArray4 = new double[] { 100.0d };
        boolean boolean5 = switchingFunctionsHandler0.reset((double) 0L, doubleArray4);
        org.apache.commons.math.ode.SwitchingFunctionsHandler switchingFunctionsHandler7 = new org.apache.commons.math.ode.SwitchingFunctionsHandler();
        boolean boolean8 = switchingFunctionsHandler7.isEmpty();
        org.apache.commons.math.ode.StepInterpolator stepInterpolator9 = null;
        boolean boolean10 = switchingFunctionsHandler7.evaluateStep(stepInterpolator9);
        org.apache.commons.math.ode.SwitchingFunctionsHandler switchingFunctionsHandler12 = new org.apache.commons.math.ode.SwitchingFunctionsHandler();
        boolean boolean13 = switchingFunctionsHandler12.isEmpty();
        double[] doubleArray16 = new double[] { 100.0d };
        boolean boolean17 = switchingFunctionsHandler12.reset((double) 0L, doubleArray16);
        boolean boolean18 = switchingFunctionsHandler7.reset((double) 1, doubleArray16);
        boolean boolean19 = switchingFunctionsHandler0.reset((double) 100, doubleArray16);
        double double20 = switchingFunctionsHandler0.getEventTime();
        boolean boolean21 = switchingFunctionsHandler0.stop();
        boolean boolean22 = switchingFunctionsHandler0.isEmpty();
        double double23 = switchingFunctionsHandler0.getEventTime();
        org.apache.commons.math.ode.StepInterpolator stepInterpolator24 = null;
        boolean boolean25 = switchingFunctionsHandler0.evaluateStep(stepInterpolator24);
        boolean boolean26 = switchingFunctionsHandler0.stop();
        boolean boolean27 = switchingFunctionsHandler0.stop();
        double double28 = switchingFunctionsHandler0.getEventTime();
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertNotNull(doubleArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray4), "[100.0]");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertNotNull(doubleArray16);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray16), "[100.0]");
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertTrue(Double.isNaN(double20));
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + true + "'", boolean22 == true);
        org.junit.Assert.assertTrue(Double.isNaN(double23));
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + false + "'", boolean27 == false);
        org.junit.Assert.assertTrue(Double.isNaN(double28));
    }

    @Test
    public void test14514() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest29.test14514");
        java.lang.String[] strArray13 = new java.lang.String[] { "hi!", "org.apache.commons.math.MathException: hi!", "", "hi!", "org.apache.commons.math.MathException: hi!" };
        org.apache.commons.math.ode.DerivativeException derivativeException14 = new org.apache.commons.math.ode.DerivativeException("hi!", strArray13);
        org.apache.commons.math.MathException mathException15 = new org.apache.commons.math.MathException("hi!", (java.lang.Object[]) strArray13);
        org.apache.commons.math.ode.DerivativeException derivativeException16 = new org.apache.commons.math.ode.DerivativeException("", strArray13);
        org.apache.commons.math.ode.DerivativeException derivativeException17 = new org.apache.commons.math.ode.DerivativeException("org.apache.commons.math.ode.IntegratorException: ", strArray13);
        org.apache.commons.math.ode.IntegratorException integratorException18 = new org.apache.commons.math.ode.IntegratorException("org.apache.commons.math.ode.IntegratorException: ", (java.lang.Object[]) strArray13);
        org.apache.commons.math.ode.DerivativeException derivativeException19 = new org.apache.commons.math.ode.DerivativeException("org.apache.commons.math.MathException", strArray13);
        org.apache.commons.math.ConvergenceException convergenceException20 = new org.apache.commons.math.ConvergenceException("org.apache.commons.math.FunctionEvaluationException: Evaluation failed for argument = 52", (java.lang.Object[]) strArray13);
        java.lang.Object[] objArray30 = new java.lang.Object[] { 1L, 'a', 10L, 'a', (-1) };
        org.apache.commons.math.ConvergenceException convergenceException31 = new org.apache.commons.math.ConvergenceException("", objArray30);
        org.apache.commons.math.FunctionEvaluationException functionEvaluationException32 = new org.apache.commons.math.FunctionEvaluationException((-1.0d), "", objArray30);
        java.lang.String[] strArray42 = new java.lang.String[] { "hi!", "org.apache.commons.math.MathException: hi!", "", "hi!", "org.apache.commons.math.MathException: hi!" };
        org.apache.commons.math.ode.DerivativeException derivativeException43 = new org.apache.commons.math.ode.DerivativeException("hi!", strArray42);
        org.apache.commons.math.ConvergenceException convergenceException44 = new org.apache.commons.math.ConvergenceException("", (java.lang.Object[]) strArray42);
        org.apache.commons.math.ode.SwitchingFunctionsHandler switchingFunctionsHandler50 = new org.apache.commons.math.ode.SwitchingFunctionsHandler();
        java.lang.Object[] objArray59 = new java.lang.Object[] { 1L, 'a', 10L, 'a', (-1) };
        org.apache.commons.math.ConvergenceException convergenceException60 = new org.apache.commons.math.ConvergenceException("", objArray59);
        org.apache.commons.math.ode.IntegratorException integratorException61 = new org.apache.commons.math.ode.IntegratorException("org.apache.commons.math.MathException: hi!", objArray59);
        java.lang.Object[] objArray62 = new java.lang.Object[] { 2, switchingFunctionsHandler50, 1, objArray59 };
        org.apache.commons.math.ConvergenceException convergenceException65 = new org.apache.commons.math.ConvergenceException("hi!");
        org.apache.commons.math.MathException mathException66 = new org.apache.commons.math.MathException("hi!", (java.lang.Throwable) convergenceException65);
        org.apache.commons.math.FunctionEvaluationException functionEvaluationException67 = new org.apache.commons.math.FunctionEvaluationException((double) (short) 0, "org.apache.commons.math.MathException: hi!", objArray59, (java.lang.Throwable) mathException66);
        org.apache.commons.math.FunctionEvaluationException functionEvaluationException69 = new org.apache.commons.math.FunctionEvaluationException((double) 100L);
        org.apache.commons.math.ConvergenceException convergenceException70 = new org.apache.commons.math.ConvergenceException("org.apache.commons.math.MathException: hi!", objArray59, (java.lang.Throwable) functionEvaluationException69);
        org.apache.commons.math.FunctionEvaluationException functionEvaluationException72 = new org.apache.commons.math.FunctionEvaluationException((double) 100L);
        org.apache.commons.math.ConvergenceException convergenceException73 = new org.apache.commons.math.ConvergenceException("org.apache.commons.math.MathException: hi!", objArray59, (java.lang.Throwable) functionEvaluationException72);
        org.apache.commons.math.MathException mathException74 = new org.apache.commons.math.MathException("org.apache.commons.math.MathException: ", (java.lang.Object[]) strArray42, (java.lang.Throwable) functionEvaluationException72);
        java.lang.Throwable[] throwableArray75 = functionEvaluationException72.getSuppressed();
        org.apache.commons.math.FunctionEvaluationException functionEvaluationException76 = new org.apache.commons.math.FunctionEvaluationException(Double.NaN, (java.lang.Throwable) functionEvaluationException72);
        functionEvaluationException32.addSuppressed((java.lang.Throwable) functionEvaluationException72);
        org.apache.commons.math.FunctionEvaluationException functionEvaluationException78 = new org.apache.commons.math.FunctionEvaluationException((double) 100, (java.lang.Throwable) functionEvaluationException72);
        java.lang.Throwable[] throwableArray79 = functionEvaluationException78.getSuppressed();
        org.apache.commons.math.MathException mathException80 = new org.apache.commons.math.MathException("org.apache.commons.math.ConvergenceException: org.apache.commons.math.ode.IntegratorException: org.apache.commons.math.ode.IntegratorException: hi!", (java.lang.Object[]) strArray13, (java.lang.Throwable) functionEvaluationException78);
        java.lang.String str81 = functionEvaluationException78.getPattern();
        org.apache.commons.math.ConvergenceException convergenceException82 = new org.apache.commons.math.ConvergenceException((java.lang.Throwable) functionEvaluationException78);
        org.junit.Assert.assertNotNull(strArray13);
        org.junit.Assert.assertNotNull(objArray30);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray30), "[1, a, 10, a, -1]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray30), "[1, a, 10, a, -1]");
        org.junit.Assert.assertNotNull(strArray42);
        org.junit.Assert.assertNotNull(objArray59);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray59), "[1, a, 10, a, -1]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray59), "[1, a, 10, a, -1]");
        org.junit.Assert.assertNotNull(objArray62);
        org.junit.Assert.assertNotNull(throwableArray75);
        org.junit.Assert.assertNotNull(throwableArray79);
        org.junit.Assert.assertEquals("'" + str81 + "' != '" + "Evaluation failed for argument = 100" + "'", str81, "Evaluation failed for argument = 100");
    }

    @Test
    public void test14515() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest29.test14515");
        java.lang.String[] strArray16 = new java.lang.String[] { "hi!", "org.apache.commons.math.MathException: hi!", "", "hi!", "org.apache.commons.math.MathException: hi!" };
        org.apache.commons.math.ode.DerivativeException derivativeException17 = new org.apache.commons.math.ode.DerivativeException("hi!", strArray16);
        org.apache.commons.math.MathException mathException18 = new org.apache.commons.math.MathException("hi!", (java.lang.Object[]) strArray16);
        org.apache.commons.math.ode.DerivativeException derivativeException19 = new org.apache.commons.math.ode.DerivativeException("", strArray16);
        org.apache.commons.math.FunctionEvaluationException functionEvaluationException20 = new org.apache.commons.math.FunctionEvaluationException((double) (byte) -1, "org.apache.commons.math.MathException: ", (java.lang.Object[]) strArray16);
        org.apache.commons.math.MathException mathException21 = new org.apache.commons.math.MathException("org.apache.commons.math.ode.IntegratorException: ", (java.lang.Object[]) strArray16);
        org.apache.commons.math.ode.IntegratorException integratorException22 = new org.apache.commons.math.ode.IntegratorException("org.apache.commons.math.ConvergenceException: Evaluation failed for argument = 52", (java.lang.Object[]) strArray16);
        org.apache.commons.math.ConvergenceException convergenceException26 = new org.apache.commons.math.ConvergenceException("Evaluation failed for argument = 52");
        java.lang.String str27 = convergenceException26.getPattern();
        org.apache.commons.math.FunctionEvaluationException functionEvaluationException28 = new org.apache.commons.math.FunctionEvaluationException((double) (short) 1, "org.apache.commons.math.MathException: org.apache.commons.math.FunctionEvaluationException: Evaluation failed for argument = 52", (java.lang.Throwable) convergenceException26);
        org.apache.commons.math.MathException mathException29 = new org.apache.commons.math.MathException((java.lang.Throwable) convergenceException26);
        org.apache.commons.math.ConvergenceException convergenceException30 = new org.apache.commons.math.ConvergenceException("Evaluation failed for argument = {0}", (java.lang.Object[]) strArray16, (java.lang.Throwable) convergenceException26);
        org.apache.commons.math.ConvergenceException convergenceException31 = new org.apache.commons.math.ConvergenceException("org.apache.commons.math.ode.DerivativeException: ", (java.lang.Object[]) strArray16);
        java.lang.String[] strArray46 = new java.lang.String[] { "hi!", "org.apache.commons.math.MathException: hi!", "", "hi!", "org.apache.commons.math.MathException: hi!" };
        org.apache.commons.math.ode.DerivativeException derivativeException47 = new org.apache.commons.math.ode.DerivativeException("hi!", strArray46);
        org.apache.commons.math.ode.IntegratorException integratorException48 = new org.apache.commons.math.ode.IntegratorException("", (java.lang.Object[]) strArray46);
        org.apache.commons.math.ode.IntegratorException integratorException49 = new org.apache.commons.math.ode.IntegratorException("org.apache.commons.math.MathException: hi!", (java.lang.Object[]) strArray46);
        org.apache.commons.math.ConvergenceException convergenceException50 = new org.apache.commons.math.ConvergenceException("hi!", (java.lang.Throwable) integratorException49);
        java.lang.Throwable[] throwableArray51 = convergenceException50.getSuppressed();
        org.apache.commons.math.MathException mathException52 = new org.apache.commons.math.MathException("org.apache.commons.math.FunctionEvaluationException: Evaluation failed for argument = 100", (java.lang.Object[]) throwableArray51);
        org.apache.commons.math.MathException mathException53 = new org.apache.commons.math.MathException("org.apache.commons.math.ConvergenceException: org.apache.commons.math.ode.IntegratorException: ", (java.lang.Object[]) throwableArray51);
        java.lang.Object[] objArray61 = new java.lang.Object[] { 1L, 'a', 10L, 'a', (-1) };
        org.apache.commons.math.ConvergenceException convergenceException62 = new org.apache.commons.math.ConvergenceException("", objArray61);
        org.apache.commons.math.ode.DerivativeException derivativeException63 = new org.apache.commons.math.ode.DerivativeException((java.lang.Throwable) convergenceException62);
        org.apache.commons.math.ode.IntegratorException integratorException64 = new org.apache.commons.math.ode.IntegratorException((java.lang.Throwable) derivativeException63);
        org.apache.commons.math.ConvergenceException convergenceException65 = new org.apache.commons.math.ConvergenceException("", (java.lang.Throwable) derivativeException63);
        org.apache.commons.math.FunctionEvaluationException functionEvaluationException66 = new org.apache.commons.math.FunctionEvaluationException(10.0d, "", (java.lang.Object[]) throwableArray51, (java.lang.Throwable) derivativeException63);
        org.apache.commons.math.ode.IntegratorException integratorException67 = new org.apache.commons.math.ode.IntegratorException("org.apache.commons.math.FunctionEvaluationException: org.apache.commons.math.FunctionEvaluationException: Evaluation failed for argument = -1", (java.lang.Object[]) throwableArray51);
        org.apache.commons.math.FunctionEvaluationException functionEvaluationException68 = new org.apache.commons.math.FunctionEvaluationException((double) 10.0f, "org.apache.commons.math.FunctionEvaluationException: org.apache.commons.math.ode.DerivativeException: org.apache.commons.math.ConvergenceException: org.apache.commons.math.MathException: ", (java.lang.Object[]) strArray16, (java.lang.Throwable) integratorException67);
        java.lang.String str69 = integratorException67.toString();
        org.junit.Assert.assertNotNull(strArray16);
        org.junit.Assert.assertEquals("'" + str27 + "' != '" + "Evaluation failed for argument = 52" + "'", str27, "Evaluation failed for argument = 52");
        org.junit.Assert.assertNotNull(strArray46);
        org.junit.Assert.assertNotNull(throwableArray51);
        org.junit.Assert.assertNotNull(objArray61);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray61), "[1, a, 10, a, -1]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray61), "[1, a, 10, a, -1]");
        org.junit.Assert.assertEquals("'" + str69 + "' != '" + "org.apache.commons.math.ode.IntegratorException: org.apache.commons.math.FunctionEvaluationException: org.apache.commons.math.FunctionEvaluationException: Evaluation failed for argument = -1" + "'", str69, "org.apache.commons.math.ode.IntegratorException: org.apache.commons.math.FunctionEvaluationException: org.apache.commons.math.FunctionEvaluationException: Evaluation failed for argument = -1");
    }

    @Test
    public void test14516() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest29.test14516");
        java.lang.Object[] objArray13 = new java.lang.Object[] { 1L, 'a', 10L, 'a', (-1) };
        org.apache.commons.math.ConvergenceException convergenceException14 = new org.apache.commons.math.ConvergenceException("", objArray13);
        org.apache.commons.math.ConvergenceException convergenceException15 = new org.apache.commons.math.ConvergenceException();
        org.apache.commons.math.MathException mathException16 = new org.apache.commons.math.MathException("org.apache.commons.math.FunctionEvaluationException: hi!", objArray13, (java.lang.Throwable) convergenceException15);
        java.lang.Object[] objArray17 = convergenceException15.getArguments();
        java.lang.String[] strArray29 = new java.lang.String[] { "hi!", "org.apache.commons.math.MathException: hi!", "", "hi!", "org.apache.commons.math.MathException: hi!" };
        org.apache.commons.math.ode.DerivativeException derivativeException30 = new org.apache.commons.math.ode.DerivativeException("hi!", strArray29);
        org.apache.commons.math.ode.IntegratorException integratorException31 = new org.apache.commons.math.ode.IntegratorException("", (java.lang.Object[]) strArray29);
        org.apache.commons.math.ode.IntegratorException integratorException32 = new org.apache.commons.math.ode.IntegratorException("org.apache.commons.math.MathException: hi!", (java.lang.Object[]) strArray29);
        org.apache.commons.math.MathException mathException33 = new org.apache.commons.math.MathException("org.apache.commons.math.FunctionEvaluationException: hi!", (java.lang.Object[]) strArray29);
        org.apache.commons.math.FunctionEvaluationException functionEvaluationException34 = new org.apache.commons.math.FunctionEvaluationException((double) 100.0f, (java.lang.Throwable) mathException33);
        org.apache.commons.math.FunctionEvaluationException functionEvaluationException35 = new org.apache.commons.math.FunctionEvaluationException((double) 10L, (java.lang.Throwable) functionEvaluationException34);
        org.apache.commons.math.MathException mathException36 = new org.apache.commons.math.MathException((java.lang.Throwable) functionEvaluationException34);
        org.apache.commons.math.ode.IntegratorException integratorException37 = new org.apache.commons.math.ode.IntegratorException((java.lang.Throwable) functionEvaluationException34);
        org.apache.commons.math.ConvergenceException convergenceException38 = new org.apache.commons.math.ConvergenceException("org.apache.commons.math.ode.DerivativeException: org.apache.commons.math.ode.IntegratorException: ", objArray17, (java.lang.Throwable) integratorException37);
        org.apache.commons.math.MathException mathException39 = new org.apache.commons.math.MathException("org.apache.commons.math.ConvergenceException: org.apache.commons.math.MathException: org.apache.commons.math.FunctionEvaluationException: hi!", objArray17);
        org.apache.commons.math.FunctionEvaluationException functionEvaluationException40 = new org.apache.commons.math.FunctionEvaluationException((double) 0, "org.apache.commons.math.MathException: Evaluation failed for argument = 100", objArray17);
        org.apache.commons.math.FunctionEvaluationException functionEvaluationException41 = new org.apache.commons.math.FunctionEvaluationException((double) (byte) -1, "org.apache.commons.math.ode.IntegratorException: Evaluation failed for argument = hi!", (java.lang.Throwable) functionEvaluationException40);
        org.junit.Assert.assertNotNull(objArray13);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray13), "[1, a, 10, a, -1]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray13), "[1, a, 10, a, -1]");
        org.junit.Assert.assertNotNull(objArray17);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray17), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray17), "[]");
        org.junit.Assert.assertNotNull(strArray29);
    }

    @Test
    public void test14517() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest29.test14517");
        java.lang.String[] strArray8 = new java.lang.String[] { "hi!", "org.apache.commons.math.MathException: hi!", "", "hi!", "org.apache.commons.math.MathException: hi!" };
        org.apache.commons.math.ode.DerivativeException derivativeException9 = new org.apache.commons.math.ode.DerivativeException("hi!", strArray8);
        org.apache.commons.math.MathException mathException10 = new org.apache.commons.math.MathException("hi!", (java.lang.Object[]) strArray8);
        org.apache.commons.math.ode.DerivativeException derivativeException11 = new org.apache.commons.math.ode.DerivativeException("org.apache.commons.math.ConvergenceException: org.apache.commons.math.FunctionEvaluationException: Evaluation failed for argument = 2", strArray8);
        org.junit.Assert.assertNotNull(strArray8);
    }

    @Test
    public void test14518() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest29.test14518");
        org.apache.commons.math.ode.SwitchingFunctionsHandler switchingFunctionsHandler0 = new org.apache.commons.math.ode.SwitchingFunctionsHandler();
        boolean boolean1 = switchingFunctionsHandler0.isEmpty();
        double[] doubleArray4 = new double[] { 100.0d };
        boolean boolean5 = switchingFunctionsHandler0.reset((double) 0L, doubleArray4);
        org.apache.commons.math.ode.SwitchingFunctionsHandler switchingFunctionsHandler7 = new org.apache.commons.math.ode.SwitchingFunctionsHandler();
        boolean boolean8 = switchingFunctionsHandler7.isEmpty();
        org.apache.commons.math.ode.StepInterpolator stepInterpolator9 = null;
        boolean boolean10 = switchingFunctionsHandler7.evaluateStep(stepInterpolator9);
        org.apache.commons.math.ode.SwitchingFunctionsHandler switchingFunctionsHandler12 = new org.apache.commons.math.ode.SwitchingFunctionsHandler();
        boolean boolean13 = switchingFunctionsHandler12.isEmpty();
        double[] doubleArray16 = new double[] { 100.0d };
        boolean boolean17 = switchingFunctionsHandler12.reset((double) 0L, doubleArray16);
        boolean boolean18 = switchingFunctionsHandler7.reset((double) 1, doubleArray16);
        boolean boolean19 = switchingFunctionsHandler0.reset((double) 100, doubleArray16);
        boolean boolean20 = switchingFunctionsHandler0.stop();
        boolean boolean21 = switchingFunctionsHandler0.stop();
        boolean boolean22 = switchingFunctionsHandler0.isEmpty();
        boolean boolean23 = switchingFunctionsHandler0.stop();
        org.apache.commons.math.ode.SwitchingFunctionsHandler switchingFunctionsHandler25 = new org.apache.commons.math.ode.SwitchingFunctionsHandler();
        boolean boolean26 = switchingFunctionsHandler25.isEmpty();
        double[] doubleArray29 = new double[] { 100.0d };
        boolean boolean30 = switchingFunctionsHandler25.reset((double) 0L, doubleArray29);
        org.apache.commons.math.ode.SwitchingFunctionsHandler switchingFunctionsHandler32 = new org.apache.commons.math.ode.SwitchingFunctionsHandler();
        boolean boolean33 = switchingFunctionsHandler32.isEmpty();
        org.apache.commons.math.ode.StepInterpolator stepInterpolator34 = null;
        boolean boolean35 = switchingFunctionsHandler32.evaluateStep(stepInterpolator34);
        org.apache.commons.math.ode.SwitchingFunctionsHandler switchingFunctionsHandler37 = new org.apache.commons.math.ode.SwitchingFunctionsHandler();
        boolean boolean38 = switchingFunctionsHandler37.isEmpty();
        double[] doubleArray41 = new double[] { 100.0d };
        boolean boolean42 = switchingFunctionsHandler37.reset((double) 0L, doubleArray41);
        boolean boolean43 = switchingFunctionsHandler32.reset((double) 1, doubleArray41);
        boolean boolean44 = switchingFunctionsHandler25.reset((double) 100, doubleArray41);
        double double45 = switchingFunctionsHandler25.getEventTime();
        boolean boolean46 = switchingFunctionsHandler25.stop();
        boolean boolean47 = switchingFunctionsHandler25.isEmpty();
        double double48 = switchingFunctionsHandler25.getEventTime();
        org.apache.commons.math.ode.StepInterpolator stepInterpolator49 = null;
        boolean boolean50 = switchingFunctionsHandler25.evaluateStep(stepInterpolator49);
        boolean boolean51 = switchingFunctionsHandler25.stop();
        org.apache.commons.math.ode.SwitchingFunctionsHandler switchingFunctionsHandler53 = new org.apache.commons.math.ode.SwitchingFunctionsHandler();
        boolean boolean54 = switchingFunctionsHandler53.isEmpty();
        org.apache.commons.math.ode.StepInterpolator stepInterpolator55 = null;
        boolean boolean56 = switchingFunctionsHandler53.evaluateStep(stepInterpolator55);
        boolean boolean57 = switchingFunctionsHandler53.stop();
        double double58 = switchingFunctionsHandler53.getEventTime();
        org.apache.commons.math.ode.SwitchingFunctionsHandler switchingFunctionsHandler60 = new org.apache.commons.math.ode.SwitchingFunctionsHandler();
        boolean boolean61 = switchingFunctionsHandler60.isEmpty();
        double[] doubleArray64 = new double[] { 100.0d };
        boolean boolean65 = switchingFunctionsHandler60.reset((double) 0L, doubleArray64);
        boolean boolean66 = switchingFunctionsHandler53.reset((double) 0L, doubleArray64);
        boolean boolean67 = switchingFunctionsHandler25.reset(0.0d, doubleArray64);
        switchingFunctionsHandler0.stepAccepted((double) (short) 10, doubleArray64);
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertNotNull(doubleArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray4), "[100.0]");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertNotNull(doubleArray16);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray16), "[100.0]");
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + true + "'", boolean22 == true);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + true + "'", boolean26 == true);
        org.junit.Assert.assertNotNull(doubleArray29);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray29), "[100.0]");
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + false + "'", boolean30 == false);
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + true + "'", boolean33 == true);
        org.junit.Assert.assertTrue("'" + boolean35 + "' != '" + false + "'", boolean35 == false);
        org.junit.Assert.assertTrue("'" + boolean38 + "' != '" + true + "'", boolean38 == true);
        org.junit.Assert.assertNotNull(doubleArray41);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray41), "[100.0]");
        org.junit.Assert.assertTrue("'" + boolean42 + "' != '" + false + "'", boolean42 == false);
        org.junit.Assert.assertTrue("'" + boolean43 + "' != '" + false + "'", boolean43 == false);
        org.junit.Assert.assertTrue("'" + boolean44 + "' != '" + false + "'", boolean44 == false);
        org.junit.Assert.assertTrue(Double.isNaN(double45));
        org.junit.Assert.assertTrue("'" + boolean46 + "' != '" + false + "'", boolean46 == false);
        org.junit.Assert.assertTrue("'" + boolean47 + "' != '" + true + "'", boolean47 == true);
        org.junit.Assert.assertTrue(Double.isNaN(double48));
        org.junit.Assert.assertTrue("'" + boolean50 + "' != '" + false + "'", boolean50 == false);
        org.junit.Assert.assertTrue("'" + boolean51 + "' != '" + false + "'", boolean51 == false);
        org.junit.Assert.assertTrue("'" + boolean54 + "' != '" + true + "'", boolean54 == true);
        org.junit.Assert.assertTrue("'" + boolean56 + "' != '" + false + "'", boolean56 == false);
        org.junit.Assert.assertTrue("'" + boolean57 + "' != '" + false + "'", boolean57 == false);
        org.junit.Assert.assertTrue(Double.isNaN(double58));
        org.junit.Assert.assertTrue("'" + boolean61 + "' != '" + true + "'", boolean61 == true);
        org.junit.Assert.assertNotNull(doubleArray64);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray64), "[100.0]");
        org.junit.Assert.assertTrue("'" + boolean65 + "' != '" + false + "'", boolean65 == false);
        org.junit.Assert.assertTrue("'" + boolean66 + "' != '" + false + "'", boolean66 == false);
        org.junit.Assert.assertTrue("'" + boolean67 + "' != '" + false + "'", boolean67 == false);
    }

    @Test
    public void test14519() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest29.test14519");
        java.lang.String[] strArray16 = new java.lang.String[] { "hi!", "org.apache.commons.math.MathException: hi!", "", "hi!", "org.apache.commons.math.MathException: hi!" };
        org.apache.commons.math.ode.DerivativeException derivativeException17 = new org.apache.commons.math.ode.DerivativeException("hi!", strArray16);
        org.apache.commons.math.ode.IntegratorException integratorException18 = new org.apache.commons.math.ode.IntegratorException("", (java.lang.Object[]) strArray16);
        org.apache.commons.math.ode.DerivativeException derivativeException19 = new org.apache.commons.math.ode.DerivativeException("hi!", strArray16);
        org.apache.commons.math.ode.SwitchingFunctionsHandler switchingFunctionsHandler26 = new org.apache.commons.math.ode.SwitchingFunctionsHandler();
        java.lang.Object[] objArray35 = new java.lang.Object[] { 1L, 'a', 10L, 'a', (-1) };
        org.apache.commons.math.ConvergenceException convergenceException36 = new org.apache.commons.math.ConvergenceException("", objArray35);
        org.apache.commons.math.ode.IntegratorException integratorException37 = new org.apache.commons.math.ode.IntegratorException("org.apache.commons.math.MathException: hi!", objArray35);
        java.lang.Object[] objArray38 = new java.lang.Object[] { 2, switchingFunctionsHandler26, 1, objArray35 };
        org.apache.commons.math.ConvergenceException convergenceException41 = new org.apache.commons.math.ConvergenceException("hi!");
        org.apache.commons.math.MathException mathException42 = new org.apache.commons.math.MathException("hi!", (java.lang.Throwable) convergenceException41);
        org.apache.commons.math.FunctionEvaluationException functionEvaluationException43 = new org.apache.commons.math.FunctionEvaluationException((double) (short) 0, "org.apache.commons.math.MathException: hi!", objArray35, (java.lang.Throwable) mathException42);
        org.apache.commons.math.FunctionEvaluationException functionEvaluationException45 = new org.apache.commons.math.FunctionEvaluationException((double) 100L);
        org.apache.commons.math.ConvergenceException convergenceException46 = new org.apache.commons.math.ConvergenceException("org.apache.commons.math.MathException: hi!", objArray35, (java.lang.Throwable) functionEvaluationException45);
        org.apache.commons.math.FunctionEvaluationException functionEvaluationException48 = new org.apache.commons.math.FunctionEvaluationException((double) 100L);
        org.apache.commons.math.ConvergenceException convergenceException49 = new org.apache.commons.math.ConvergenceException("org.apache.commons.math.MathException: hi!", objArray35, (java.lang.Throwable) functionEvaluationException48);
        org.apache.commons.math.ConvergenceException convergenceException50 = new org.apache.commons.math.ConvergenceException("org.apache.commons.math.MathException: hi!", objArray35);
        org.apache.commons.math.ConvergenceException convergenceException51 = new org.apache.commons.math.ConvergenceException((java.lang.Throwable) convergenceException50);
        org.apache.commons.math.FunctionEvaluationException functionEvaluationException52 = new org.apache.commons.math.FunctionEvaluationException((double) (byte) -1, "org.apache.commons.math.ConvergenceException: org.apache.commons.math.FunctionEvaluationException: hi!", (java.lang.Object[]) strArray16, (java.lang.Throwable) convergenceException51);
        org.apache.commons.math.ConvergenceException convergenceException53 = new org.apache.commons.math.ConvergenceException("org.apache.commons.math.ode.IntegratorException: ", (java.lang.Object[]) strArray16);
        org.apache.commons.math.ode.DerivativeException derivativeException54 = new org.apache.commons.math.ode.DerivativeException("", strArray16);
        java.lang.Object[] objArray72 = new java.lang.Object[] { 1L, 'a', 10L, 'a', (-1) };
        org.apache.commons.math.ConvergenceException convergenceException73 = new org.apache.commons.math.ConvergenceException("", objArray72);
        org.apache.commons.math.FunctionEvaluationException functionEvaluationException74 = new org.apache.commons.math.FunctionEvaluationException((-1.0d), "", objArray72);
        org.apache.commons.math.ode.IntegratorException integratorException75 = new org.apache.commons.math.ode.IntegratorException("hi!", objArray72);
        org.apache.commons.math.FunctionEvaluationException functionEvaluationException78 = new org.apache.commons.math.FunctionEvaluationException((double) (short) 1, "");
        org.apache.commons.math.MathException mathException79 = new org.apache.commons.math.MathException("", objArray72, (java.lang.Throwable) functionEvaluationException78);
        org.apache.commons.math.ConvergenceException convergenceException81 = new org.apache.commons.math.ConvergenceException("hi!");
        java.lang.String str82 = convergenceException81.getPattern();
        org.apache.commons.math.FunctionEvaluationException functionEvaluationException83 = new org.apache.commons.math.FunctionEvaluationException((double) 1L, "", objArray72, (java.lang.Throwable) convergenceException81);
        java.lang.String str84 = functionEvaluationException83.getPattern();
        org.apache.commons.math.FunctionEvaluationException functionEvaluationException85 = new org.apache.commons.math.FunctionEvaluationException((double) (byte) 0, "org.apache.commons.math.ConvergenceException: Evaluation failed for argument = 52", (java.lang.Throwable) functionEvaluationException83);
        org.apache.commons.math.MathException mathException86 = new org.apache.commons.math.MathException("org.apache.commons.math.ConvergenceException: org.apache.commons.math.MathException: ", (java.lang.Throwable) functionEvaluationException83);
        org.apache.commons.math.FunctionEvaluationException functionEvaluationException87 = new org.apache.commons.math.FunctionEvaluationException((double) 2, "org.apache.commons.math.FunctionEvaluationException: Evaluation failed for argument = 52", (java.lang.Throwable) functionEvaluationException83);
        org.apache.commons.math.MathException mathException88 = new org.apache.commons.math.MathException("org.apache.commons.math.ConvergenceException: org.apache.commons.math.MathException: org.apache.commons.math.FunctionEvaluationException: hi!", (java.lang.Object[]) strArray16, (java.lang.Throwable) functionEvaluationException87);
        org.apache.commons.math.MathException mathException89 = new org.apache.commons.math.MathException((java.lang.Throwable) functionEvaluationException87);
        org.apache.commons.math.FunctionEvaluationException functionEvaluationException90 = new org.apache.commons.math.FunctionEvaluationException((double) 0, "org.apache.commons.math.ConvergenceException: org.apache.commons.math.ConvergenceException: Evaluation failed for argument = 52", (java.lang.Throwable) mathException89);
        org.apache.commons.math.MathException mathException91 = new org.apache.commons.math.MathException("org.apache.commons.math.FunctionEvaluationException: org.apache.commons.math.ode.IntegratorException: org.apache.commons.math.MathException: ", (java.lang.Throwable) functionEvaluationException90);
        org.junit.Assert.assertNotNull(strArray16);
        org.junit.Assert.assertNotNull(objArray35);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray35), "[1, a, 10, a, -1]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray35), "[1, a, 10, a, -1]");
        org.junit.Assert.assertNotNull(objArray38);
        org.junit.Assert.assertNotNull(objArray72);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray72), "[1, a, 10, a, -1]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray72), "[1, a, 10, a, -1]");
        org.junit.Assert.assertEquals("'" + str82 + "' != '" + "hi!" + "'", str82, "hi!");
        org.junit.Assert.assertEquals("'" + str84 + "' != '" + "" + "'", str84, "");
    }

    @Test
    public void test14520() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest29.test14520");
        org.apache.commons.math.MathException mathException2 = new org.apache.commons.math.MathException("org.apache.commons.math.ConvergenceException: Evaluation failed for argument = 52");
        org.apache.commons.math.ConvergenceException convergenceException10 = new org.apache.commons.math.ConvergenceException("hi!");
        org.apache.commons.math.MathException mathException11 = new org.apache.commons.math.MathException("hi!", (java.lang.Throwable) convergenceException10);
        java.lang.Object[] objArray12 = mathException11.getArguments();
        java.lang.Throwable throwable13 = null;
        org.apache.commons.math.ConvergenceException convergenceException14 = new org.apache.commons.math.ConvergenceException("hi!", objArray12, throwable13);
        org.apache.commons.math.FunctionEvaluationException functionEvaluationException15 = new org.apache.commons.math.FunctionEvaluationException((double) 1L, "", objArray12);
        org.apache.commons.math.ode.IntegratorException integratorException16 = new org.apache.commons.math.ode.IntegratorException("", objArray12);
        org.apache.commons.math.ConvergenceException convergenceException17 = new org.apache.commons.math.ConvergenceException("hi!", objArray12);
        mathException2.addSuppressed((java.lang.Throwable) convergenceException17);
        java.lang.Object[] objArray19 = convergenceException17.getArguments();
        java.lang.String[] strArray32 = new java.lang.String[] { "hi!", "org.apache.commons.math.MathException: hi!", "", "hi!", "org.apache.commons.math.MathException: hi!" };
        org.apache.commons.math.ode.DerivativeException derivativeException33 = new org.apache.commons.math.ode.DerivativeException("hi!", strArray32);
        org.apache.commons.math.MathException mathException34 = new org.apache.commons.math.MathException("hi!", (java.lang.Object[]) strArray32);
        org.apache.commons.math.ode.DerivativeException derivativeException35 = new org.apache.commons.math.ode.DerivativeException("", strArray32);
        org.apache.commons.math.FunctionEvaluationException functionEvaluationException36 = new org.apache.commons.math.FunctionEvaluationException((double) (byte) -1, "org.apache.commons.math.MathException: ", (java.lang.Object[]) strArray32);
        org.apache.commons.math.MathException mathException37 = new org.apache.commons.math.MathException("org.apache.commons.math.ode.IntegratorException: ", (java.lang.Object[]) strArray32);
        org.apache.commons.math.ode.IntegratorException integratorException38 = new org.apache.commons.math.ode.IntegratorException("org.apache.commons.math.ConvergenceException: Evaluation failed for argument = 52", (java.lang.Object[]) strArray32);
        org.apache.commons.math.MathException mathException39 = new org.apache.commons.math.MathException("org.apache.commons.math.ConvergenceException: hi!", objArray19, (java.lang.Throwable) integratorException38);
        org.apache.commons.math.ConvergenceException convergenceException40 = new org.apache.commons.math.ConvergenceException((java.lang.Throwable) integratorException38);
        org.junit.Assert.assertNotNull(objArray12);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray12), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray12), "[]");
        org.junit.Assert.assertNotNull(objArray19);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray19), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray19), "[]");
        org.junit.Assert.assertNotNull(strArray32);
    }

    @Test
    public void test14521() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest29.test14521");
        java.lang.Object[] objArray18 = new java.lang.Object[] { 1L, 'a', 10L, 'a', (-1) };
        org.apache.commons.math.ConvergenceException convergenceException19 = new org.apache.commons.math.ConvergenceException("", objArray18);
        org.apache.commons.math.FunctionEvaluationException functionEvaluationException20 = new org.apache.commons.math.FunctionEvaluationException((-1.0d), "", objArray18);
        org.apache.commons.math.ode.IntegratorException integratorException21 = new org.apache.commons.math.ode.IntegratorException("hi!", objArray18);
        org.apache.commons.math.FunctionEvaluationException functionEvaluationException24 = new org.apache.commons.math.FunctionEvaluationException((double) (short) 1, "");
        org.apache.commons.math.MathException mathException25 = new org.apache.commons.math.MathException("", objArray18, (java.lang.Throwable) functionEvaluationException24);
        org.apache.commons.math.MathException mathException26 = new org.apache.commons.math.MathException((java.lang.Throwable) functionEvaluationException24);
        java.lang.Object[] objArray27 = functionEvaluationException24.getArguments();
        java.lang.Throwable[] throwableArray28 = functionEvaluationException24.getSuppressed();
        org.apache.commons.math.FunctionEvaluationException functionEvaluationException29 = new org.apache.commons.math.FunctionEvaluationException((double) 'a', "", (java.lang.Object[]) throwableArray28);
        org.apache.commons.math.MathException mathException30 = new org.apache.commons.math.MathException("org.apache.commons.math.ConvergenceException: org.apache.commons.math.MathException: ", (java.lang.Object[]) throwableArray28);
        org.apache.commons.math.FunctionEvaluationException functionEvaluationException31 = new org.apache.commons.math.FunctionEvaluationException(52.0d, (java.lang.Throwable) mathException30);
        org.apache.commons.math.ConvergenceException convergenceException32 = new org.apache.commons.math.ConvergenceException("org.apache.commons.math.FunctionEvaluationException: org.apache.commons.math.FunctionEvaluationException: org.apache.commons.math.FunctionEvaluationException: hi!", (java.lang.Throwable) mathException30);
        org.apache.commons.math.FunctionEvaluationException functionEvaluationException33 = new org.apache.commons.math.FunctionEvaluationException((double) 'a', (java.lang.Throwable) mathException30);
        org.apache.commons.math.ode.IntegratorException integratorException34 = new org.apache.commons.math.ode.IntegratorException((java.lang.Throwable) functionEvaluationException33);
        java.lang.Throwable[] throwableArray35 = functionEvaluationException33.getSuppressed();
        org.apache.commons.math.ConvergenceException convergenceException45 = new org.apache.commons.math.ConvergenceException("hi!");
        org.apache.commons.math.MathException mathException46 = new org.apache.commons.math.MathException("hi!", (java.lang.Throwable) convergenceException45);
        java.lang.Object[] objArray47 = mathException46.getArguments();
        java.lang.Throwable throwable50 = null;
        org.apache.commons.math.MathException mathException51 = new org.apache.commons.math.MathException("hi!", throwable50);
        org.apache.commons.math.MathException mathException52 = new org.apache.commons.math.MathException("org.apache.commons.math.MathException: hi!", throwable50);
        org.apache.commons.math.ConvergenceException convergenceException53 = new org.apache.commons.math.ConvergenceException("org.apache.commons.math.MathException: hi!", objArray47, throwable50);
        java.lang.Object[] objArray65 = new java.lang.Object[] { 1L, 'a', 10L, 'a', (-1) };
        org.apache.commons.math.ConvergenceException convergenceException66 = new org.apache.commons.math.ConvergenceException("", objArray65);
        org.apache.commons.math.FunctionEvaluationException functionEvaluationException67 = new org.apache.commons.math.FunctionEvaluationException((-1.0d), "", objArray65);
        org.apache.commons.math.ode.IntegratorException integratorException68 = new org.apache.commons.math.ode.IntegratorException("hi!", objArray65);
        org.apache.commons.math.MathException mathException69 = new org.apache.commons.math.MathException("org.apache.commons.math.MathException: hi!", objArray65);
        org.apache.commons.math.ConvergenceException convergenceException70 = new org.apache.commons.math.ConvergenceException("org.apache.commons.math.MathException: ", objArray65);
        org.apache.commons.math.ConvergenceException convergenceException71 = new org.apache.commons.math.ConvergenceException("org.apache.commons.math.MathException: hi!", objArray47, (java.lang.Throwable) convergenceException70);
        org.apache.commons.math.FunctionEvaluationException functionEvaluationException72 = new org.apache.commons.math.FunctionEvaluationException((double) '#', "hi!", objArray47);
        org.apache.commons.math.FunctionEvaluationException functionEvaluationException73 = new org.apache.commons.math.FunctionEvaluationException((double) (byte) -1, "org.apache.commons.math.FunctionEvaluationException: hi!", objArray47);
        org.apache.commons.math.MathException mathException75 = new org.apache.commons.math.MathException("org.apache.commons.math.ConvergenceException: Evaluation failed for argument = 52");
        org.apache.commons.math.MathException mathException76 = new org.apache.commons.math.MathException("org.apache.commons.math.FunctionEvaluationException: org.apache.commons.math.FunctionEvaluationException: Evaluation failed for argument = 35", objArray47, (java.lang.Throwable) mathException75);
        org.apache.commons.math.FunctionEvaluationException functionEvaluationException77 = new org.apache.commons.math.FunctionEvaluationException(0.0d, "org.apache.commons.math.ConvergenceException: org.apache.commons.math.ConvergenceException: org.apache.commons.math.ConvergenceException: hi!", (java.lang.Object[]) throwableArray35, (java.lang.Throwable) mathException75);
        double double78 = functionEvaluationException77.getArgument();
        org.junit.Assert.assertNotNull(objArray18);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray18), "[1, a, 10, a, -1]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray18), "[1, a, 10, a, -1]");
        org.junit.Assert.assertNotNull(objArray27);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray27), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray27), "[]");
        org.junit.Assert.assertNotNull(throwableArray28);
        org.junit.Assert.assertNotNull(throwableArray35);
        org.junit.Assert.assertNotNull(objArray47);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray47), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray47), "[]");
        org.junit.Assert.assertNotNull(objArray65);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray65), "[1, a, 10, a, -1]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray65), "[1, a, 10, a, -1]");
        org.junit.Assert.assertTrue("'" + double78 + "' != '" + 0.0d + "'", double78 == 0.0d);
    }

    @Test
    public void test14522() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest29.test14522");
        org.apache.commons.math.ode.SwitchingFunctionsHandler switchingFunctionsHandler0 = new org.apache.commons.math.ode.SwitchingFunctionsHandler();
        boolean boolean1 = switchingFunctionsHandler0.isEmpty();
        org.apache.commons.math.ode.SwitchingFunction switchingFunction2 = null;
        switchingFunctionsHandler0.add(switchingFunction2, (double) (-1), (double) 'a', (int) (short) 0);
        org.apache.commons.math.ode.SwitchingFunction switchingFunction7 = null;
        switchingFunctionsHandler0.add(switchingFunction7, (double) (byte) -1, 100.0d, (int) ' ');
        org.apache.commons.math.ode.SwitchingFunctionsHandler switchingFunctionsHandler13 = new org.apache.commons.math.ode.SwitchingFunctionsHandler();
        boolean boolean14 = switchingFunctionsHandler13.isEmpty();
        org.apache.commons.math.ode.SwitchingFunction switchingFunction15 = null;
        switchingFunctionsHandler13.add(switchingFunction15, (double) (-1), (double) 'a', (int) (short) 0);
        double[] doubleArray21 = null;
        boolean boolean22 = switchingFunctionsHandler13.reset((double) 3, doubleArray21);
        double double23 = switchingFunctionsHandler13.getEventTime();
        org.apache.commons.math.ode.SwitchingFunctionsHandler switchingFunctionsHandler25 = new org.apache.commons.math.ode.SwitchingFunctionsHandler();
        org.apache.commons.math.ode.SwitchingFunction switchingFunction26 = null;
        switchingFunctionsHandler25.add(switchingFunction26, (double) (-1), (double) 3, 0);
        double[] doubleArray38 = new double[] { 0L, 10.0d, 'a', 0.0d, (-1.0d), 0 };
        boolean boolean39 = switchingFunctionsHandler25.reset((double) (-1), doubleArray38);
        org.apache.commons.math.ode.SwitchingFunctionsHandler switchingFunctionsHandler41 = new org.apache.commons.math.ode.SwitchingFunctionsHandler();
        boolean boolean42 = switchingFunctionsHandler41.isEmpty();
        org.apache.commons.math.ode.StepInterpolator stepInterpolator43 = null;
        boolean boolean44 = switchingFunctionsHandler41.evaluateStep(stepInterpolator43);
        org.apache.commons.math.ode.SwitchingFunctionsHandler switchingFunctionsHandler46 = new org.apache.commons.math.ode.SwitchingFunctionsHandler();
        boolean boolean47 = switchingFunctionsHandler46.isEmpty();
        double[] doubleArray50 = new double[] { 100.0d };
        boolean boolean51 = switchingFunctionsHandler46.reset((double) 0L, doubleArray50);
        switchingFunctionsHandler41.stepAccepted((double) (byte) 10, doubleArray50);
        org.apache.commons.math.ode.SwitchingFunction switchingFunction53 = null;
        switchingFunctionsHandler41.add(switchingFunction53, (double) (-1), (double) 100.0f, 10);
        org.apache.commons.math.ode.SwitchingFunctionsHandler switchingFunctionsHandler59 = new org.apache.commons.math.ode.SwitchingFunctionsHandler();
        boolean boolean60 = switchingFunctionsHandler59.isEmpty();
        double[] doubleArray63 = new double[] { 100.0d };
        boolean boolean64 = switchingFunctionsHandler59.reset((double) 0L, doubleArray63);
        org.apache.commons.math.ode.SwitchingFunctionsHandler switchingFunctionsHandler66 = new org.apache.commons.math.ode.SwitchingFunctionsHandler();
        boolean boolean67 = switchingFunctionsHandler66.isEmpty();
        org.apache.commons.math.ode.StepInterpolator stepInterpolator68 = null;
        boolean boolean69 = switchingFunctionsHandler66.evaluateStep(stepInterpolator68);
        org.apache.commons.math.ode.SwitchingFunctionsHandler switchingFunctionsHandler71 = new org.apache.commons.math.ode.SwitchingFunctionsHandler();
        boolean boolean72 = switchingFunctionsHandler71.isEmpty();
        double[] doubleArray75 = new double[] { 100.0d };
        boolean boolean76 = switchingFunctionsHandler71.reset((double) 0L, doubleArray75);
        boolean boolean77 = switchingFunctionsHandler66.reset((double) 1, doubleArray75);
        boolean boolean78 = switchingFunctionsHandler59.reset((double) 100, doubleArray75);
        boolean boolean79 = switchingFunctionsHandler41.reset((double) (byte) -1, doubleArray75);
        boolean boolean80 = switchingFunctionsHandler25.reset((double) (byte) 1, doubleArray75);
        boolean boolean81 = switchingFunctionsHandler13.reset((double) (byte) 10, doubleArray75);
        boolean boolean82 = switchingFunctionsHandler0.reset((double) 10.0f, doubleArray75);
        org.apache.commons.math.ode.SwitchingFunction switchingFunction83 = null;
        switchingFunctionsHandler0.add(switchingFunction83, (double) 1.0f, (double) 0.0f, (int) '4');
        boolean boolean88 = switchingFunctionsHandler0.isEmpty();
        org.apache.commons.math.ode.SwitchingFunction switchingFunction89 = null;
        switchingFunctionsHandler0.add(switchingFunction89, (double) 2, (double) (-1.0f), 3);
        double double94 = switchingFunctionsHandler0.getEventTime();
        boolean boolean95 = switchingFunctionsHandler0.stop();
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertTrue(Double.isNaN(double23));
        org.junit.Assert.assertNotNull(doubleArray38);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray38), "[0.0, 10.0, 97.0, 0.0, -1.0, 0.0]");
        org.junit.Assert.assertTrue("'" + boolean39 + "' != '" + false + "'", boolean39 == false);
        org.junit.Assert.assertTrue("'" + boolean42 + "' != '" + true + "'", boolean42 == true);
        org.junit.Assert.assertTrue("'" + boolean44 + "' != '" + false + "'", boolean44 == false);
        org.junit.Assert.assertTrue("'" + boolean47 + "' != '" + true + "'", boolean47 == true);
        org.junit.Assert.assertNotNull(doubleArray50);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray50), "[100.0]");
        org.junit.Assert.assertTrue("'" + boolean51 + "' != '" + false + "'", boolean51 == false);
        org.junit.Assert.assertTrue("'" + boolean60 + "' != '" + true + "'", boolean60 == true);
        org.junit.Assert.assertNotNull(doubleArray63);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray63), "[100.0]");
        org.junit.Assert.assertTrue("'" + boolean64 + "' != '" + false + "'", boolean64 == false);
        org.junit.Assert.assertTrue("'" + boolean67 + "' != '" + true + "'", boolean67 == true);
        org.junit.Assert.assertTrue("'" + boolean69 + "' != '" + false + "'", boolean69 == false);
        org.junit.Assert.assertTrue("'" + boolean72 + "' != '" + true + "'", boolean72 == true);
        org.junit.Assert.assertNotNull(doubleArray75);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray75), "[100.0]");
        org.junit.Assert.assertTrue("'" + boolean76 + "' != '" + false + "'", boolean76 == false);
        org.junit.Assert.assertTrue("'" + boolean77 + "' != '" + false + "'", boolean77 == false);
        org.junit.Assert.assertTrue("'" + boolean78 + "' != '" + false + "'", boolean78 == false);
        org.junit.Assert.assertTrue("'" + boolean79 + "' != '" + false + "'", boolean79 == false);
        org.junit.Assert.assertTrue("'" + boolean80 + "' != '" + false + "'", boolean80 == false);
        org.junit.Assert.assertTrue("'" + boolean81 + "' != '" + false + "'", boolean81 == false);
        org.junit.Assert.assertTrue("'" + boolean82 + "' != '" + false + "'", boolean82 == false);
        org.junit.Assert.assertTrue("'" + boolean88 + "' != '" + false + "'", boolean88 == false);
        org.junit.Assert.assertTrue(Double.isNaN(double94));
        org.junit.Assert.assertTrue("'" + boolean95 + "' != '" + false + "'", boolean95 == false);
    }

    @Test
    public void test14523() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest29.test14523");
        org.apache.commons.math.ode.SwitchingFunctionsHandler switchingFunctionsHandler0 = new org.apache.commons.math.ode.SwitchingFunctionsHandler();
        boolean boolean1 = switchingFunctionsHandler0.isEmpty();
        double[] doubleArray4 = new double[] { 100.0d };
        boolean boolean5 = switchingFunctionsHandler0.reset((double) 0L, doubleArray4);
        org.apache.commons.math.ode.StepInterpolator stepInterpolator6 = null;
        boolean boolean7 = switchingFunctionsHandler0.evaluateStep(stepInterpolator6);
        org.apache.commons.math.ode.SwitchingFunctionsHandler switchingFunctionsHandler9 = new org.apache.commons.math.ode.SwitchingFunctionsHandler();
        boolean boolean10 = switchingFunctionsHandler9.isEmpty();
        org.apache.commons.math.ode.StepInterpolator stepInterpolator11 = null;
        boolean boolean12 = switchingFunctionsHandler9.evaluateStep(stepInterpolator11);
        org.apache.commons.math.ode.SwitchingFunctionsHandler switchingFunctionsHandler14 = new org.apache.commons.math.ode.SwitchingFunctionsHandler();
        boolean boolean15 = switchingFunctionsHandler14.isEmpty();
        double[] doubleArray18 = new double[] { 100.0d };
        boolean boolean19 = switchingFunctionsHandler14.reset((double) 0L, doubleArray18);
        boolean boolean20 = switchingFunctionsHandler9.reset((double) 1, doubleArray18);
        boolean boolean21 = switchingFunctionsHandler9.stop();
        double double22 = switchingFunctionsHandler9.getEventTime();
        org.apache.commons.math.ode.SwitchingFunctionsHandler switchingFunctionsHandler24 = new org.apache.commons.math.ode.SwitchingFunctionsHandler();
        boolean boolean25 = switchingFunctionsHandler24.isEmpty();
        double[] doubleArray28 = new double[] { 100.0d };
        boolean boolean29 = switchingFunctionsHandler24.reset((double) 0L, doubleArray28);
        boolean boolean30 = switchingFunctionsHandler24.stop();
        double double31 = switchingFunctionsHandler24.getEventTime();
        org.apache.commons.math.ode.SwitchingFunctionsHandler switchingFunctionsHandler33 = new org.apache.commons.math.ode.SwitchingFunctionsHandler();
        boolean boolean34 = switchingFunctionsHandler33.isEmpty();
        org.apache.commons.math.ode.StepInterpolator stepInterpolator35 = null;
        boolean boolean36 = switchingFunctionsHandler33.evaluateStep(stepInterpolator35);
        org.apache.commons.math.ode.SwitchingFunctionsHandler switchingFunctionsHandler38 = new org.apache.commons.math.ode.SwitchingFunctionsHandler();
        boolean boolean39 = switchingFunctionsHandler38.isEmpty();
        double[] doubleArray42 = new double[] { 100.0d };
        boolean boolean43 = switchingFunctionsHandler38.reset((double) 0L, doubleArray42);
        switchingFunctionsHandler33.stepAccepted((double) (byte) 10, doubleArray42);
        boolean boolean45 = switchingFunctionsHandler24.reset((double) 1.0f, doubleArray42);
        switchingFunctionsHandler9.stepAccepted((double) 2, doubleArray42);
        switchingFunctionsHandler0.stepAccepted((double) (-1.0f), doubleArray42);
        boolean boolean48 = switchingFunctionsHandler0.stop();
        double double49 = switchingFunctionsHandler0.getEventTime();
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertNotNull(doubleArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray4), "[100.0]");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertNotNull(doubleArray18);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray18), "[100.0]");
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertTrue(Double.isNaN(double22));
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + true + "'", boolean25 == true);
        org.junit.Assert.assertNotNull(doubleArray28);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray28), "[100.0]");
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + false + "'", boolean29 == false);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + false + "'", boolean30 == false);
        org.junit.Assert.assertTrue(Double.isNaN(double31));
        org.junit.Assert.assertTrue("'" + boolean34 + "' != '" + true + "'", boolean34 == true);
        org.junit.Assert.assertTrue("'" + boolean36 + "' != '" + false + "'", boolean36 == false);
        org.junit.Assert.assertTrue("'" + boolean39 + "' != '" + true + "'", boolean39 == true);
        org.junit.Assert.assertNotNull(doubleArray42);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray42), "[100.0]");
        org.junit.Assert.assertTrue("'" + boolean43 + "' != '" + false + "'", boolean43 == false);
        org.junit.Assert.assertTrue("'" + boolean45 + "' != '" + false + "'", boolean45 == false);
        org.junit.Assert.assertTrue("'" + boolean48 + "' != '" + false + "'", boolean48 == false);
        org.junit.Assert.assertTrue(Double.isNaN(double49));
    }

    @Test
    public void test14524() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest29.test14524");
        java.lang.String[] strArray13 = new java.lang.String[] { "hi!", "org.apache.commons.math.MathException: hi!", "", "hi!", "org.apache.commons.math.MathException: hi!" };
        org.apache.commons.math.ode.DerivativeException derivativeException14 = new org.apache.commons.math.ode.DerivativeException("hi!", strArray13);
        org.apache.commons.math.ConvergenceException convergenceException15 = new org.apache.commons.math.ConvergenceException("", (java.lang.Object[]) strArray13);
        org.apache.commons.math.ConvergenceException convergenceException16 = new org.apache.commons.math.ConvergenceException("", (java.lang.Object[]) strArray13);
        org.apache.commons.math.ode.DerivativeException derivativeException17 = new org.apache.commons.math.ode.DerivativeException("org.apache.commons.math.MathException: org.apache.commons.math.FunctionEvaluationException: hi!", strArray13);
        org.apache.commons.math.ode.IntegratorException integratorException18 = new org.apache.commons.math.ode.IntegratorException("org.apache.commons.math.ode.DerivativeException: Evaluation failed for argument = 52", (java.lang.Object[]) strArray13);
        org.apache.commons.math.ode.DerivativeException derivativeException19 = new org.apache.commons.math.ode.DerivativeException("org.apache.commons.math.FunctionEvaluationException: Evaluation failed for argument = 1", strArray13);
        org.apache.commons.math.ConvergenceException convergenceException26 = new org.apache.commons.math.ConvergenceException("hi!");
        org.apache.commons.math.MathException mathException27 = new org.apache.commons.math.MathException("hi!", (java.lang.Throwable) convergenceException26);
        java.lang.Throwable[] throwableArray28 = convergenceException26.getSuppressed();
        org.apache.commons.math.ode.IntegratorException integratorException29 = new org.apache.commons.math.ode.IntegratorException("", (java.lang.Object[]) throwableArray28);
        org.apache.commons.math.FunctionEvaluationException functionEvaluationException30 = new org.apache.commons.math.FunctionEvaluationException((double) 100L, "org.apache.commons.math.ode.IntegratorException: ", (java.lang.Throwable) integratorException29);
        org.apache.commons.math.FunctionEvaluationException functionEvaluationException31 = new org.apache.commons.math.FunctionEvaluationException((double) (byte) 0, (java.lang.Throwable) integratorException29);
        double double32 = functionEvaluationException31.getArgument();
        org.apache.commons.math.FunctionEvaluationException functionEvaluationException33 = new org.apache.commons.math.FunctionEvaluationException((double) (byte) 100, "org.apache.commons.math.MathException: org.apache.commons.math.FunctionEvaluationException: org.apache.commons.math.FunctionEvaluationException: Evaluation failed for argument = 35", (java.lang.Object[]) strArray13, (java.lang.Throwable) functionEvaluationException31);
        org.junit.Assert.assertNotNull(strArray13);
        org.junit.Assert.assertNotNull(throwableArray28);
        org.junit.Assert.assertTrue("'" + double32 + "' != '" + 0.0d + "'", double32 == 0.0d);
    }

    @Test
    public void test14525() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest29.test14525");
        java.lang.String[] strArray13 = new java.lang.String[] { "hi!", "org.apache.commons.math.MathException: hi!", "", "hi!", "org.apache.commons.math.MathException: hi!" };
        org.apache.commons.math.ode.DerivativeException derivativeException14 = new org.apache.commons.math.ode.DerivativeException("hi!", strArray13);
        org.apache.commons.math.ConvergenceException convergenceException15 = new org.apache.commons.math.ConvergenceException("", (java.lang.Object[]) strArray13);
        org.apache.commons.math.ConvergenceException convergenceException16 = new org.apache.commons.math.ConvergenceException("", (java.lang.Object[]) strArray13);
        org.apache.commons.math.ode.DerivativeException derivativeException17 = new org.apache.commons.math.ode.DerivativeException("org.apache.commons.math.MathException: org.apache.commons.math.FunctionEvaluationException: hi!", strArray13);
        java.lang.Object[] objArray28 = new java.lang.Object[] { 1L, 'a', 10L, 'a', (-1) };
        org.apache.commons.math.ConvergenceException convergenceException29 = new org.apache.commons.math.ConvergenceException("", objArray28);
        org.apache.commons.math.ode.IntegratorException integratorException30 = new org.apache.commons.math.ode.IntegratorException("org.apache.commons.math.MathException: hi!", objArray28);
        org.apache.commons.math.MathException mathException31 = new org.apache.commons.math.MathException((java.lang.Throwable) integratorException30);
        java.lang.Throwable[] throwableArray32 = integratorException30.getSuppressed();
        org.apache.commons.math.MathException mathException33 = new org.apache.commons.math.MathException("", (java.lang.Object[]) throwableArray32);
        org.apache.commons.math.MathException mathException34 = new org.apache.commons.math.MathException("org.apache.commons.math.FunctionEvaluationException: hi!", (java.lang.Throwable) mathException33);
        org.apache.commons.math.MathException mathException35 = new org.apache.commons.math.MathException("org.apache.commons.math.MathException: hi!", (java.lang.Throwable) mathException33);
        org.apache.commons.math.MathException mathException36 = new org.apache.commons.math.MathException("org.apache.commons.math.MathException: org.apache.commons.math.FunctionEvaluationException: hi!", (java.lang.Object[]) strArray13, (java.lang.Throwable) mathException33);
        org.apache.commons.math.ode.DerivativeException derivativeException37 = new org.apache.commons.math.ode.DerivativeException("org.apache.commons.math.FunctionEvaluationException: Evaluation failed for argument = 100", strArray13);
        org.apache.commons.math.ode.DerivativeException derivativeException38 = new org.apache.commons.math.ode.DerivativeException("org.apache.commons.math.ConvergenceException: org.apache.commons.math.FunctionEvaluationException: hi!", strArray13);
        org.apache.commons.math.MathException mathException39 = new org.apache.commons.math.MathException("hi!", (java.lang.Object[]) strArray13);
        org.apache.commons.math.ode.DerivativeException derivativeException40 = new org.apache.commons.math.ode.DerivativeException((java.lang.Throwable) mathException39);
        org.apache.commons.math.FunctionEvaluationException functionEvaluationException43 = new org.apache.commons.math.FunctionEvaluationException((double) ' ', "org.apache.commons.math.ConvergenceException: ");
        mathException39.addSuppressed((java.lang.Throwable) functionEvaluationException43);
        org.apache.commons.math.ode.DerivativeException derivativeException45 = new org.apache.commons.math.ode.DerivativeException((java.lang.Throwable) mathException39);
        org.junit.Assert.assertNotNull(strArray13);
        org.junit.Assert.assertNotNull(objArray28);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray28), "[1, a, 10, a, -1]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray28), "[1, a, 10, a, -1]");
        org.junit.Assert.assertNotNull(throwableArray32);
    }

    @Test
    public void test14526() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest29.test14526");
        java.lang.String[] strArray11 = new java.lang.String[] { "hi!", "org.apache.commons.math.MathException: hi!", "", "hi!", "org.apache.commons.math.MathException: hi!" };
        org.apache.commons.math.ode.DerivativeException derivativeException12 = new org.apache.commons.math.ode.DerivativeException("hi!", strArray11);
        org.apache.commons.math.MathException mathException13 = new org.apache.commons.math.MathException("hi!", (java.lang.Object[]) strArray11);
        org.apache.commons.math.ode.DerivativeException derivativeException14 = new org.apache.commons.math.ode.DerivativeException("", strArray11);
        org.apache.commons.math.ode.DerivativeException derivativeException15 = new org.apache.commons.math.ode.DerivativeException("org.apache.commons.math.ode.IntegratorException: ", strArray11);
        org.apache.commons.math.ode.IntegratorException integratorException16 = new org.apache.commons.math.ode.IntegratorException("org.apache.commons.math.ode.IntegratorException: ", (java.lang.Object[]) strArray11);
        java.lang.Object[] objArray21 = new java.lang.Object[] { 100.0f, (byte) 10 };
        org.apache.commons.math.MathException mathException22 = new org.apache.commons.math.MathException("org.apache.commons.math.MathException: hi!", objArray21);
        org.apache.commons.math.ConvergenceException convergenceException29 = new org.apache.commons.math.ConvergenceException("hi!");
        org.apache.commons.math.MathException mathException30 = new org.apache.commons.math.MathException("hi!", (java.lang.Throwable) convergenceException29);
        java.lang.Object[] objArray31 = mathException30.getArguments();
        java.lang.Throwable throwable34 = null;
        org.apache.commons.math.MathException mathException35 = new org.apache.commons.math.MathException("hi!", throwable34);
        org.apache.commons.math.MathException mathException36 = new org.apache.commons.math.MathException("org.apache.commons.math.MathException: hi!", throwable34);
        org.apache.commons.math.ConvergenceException convergenceException37 = new org.apache.commons.math.ConvergenceException("org.apache.commons.math.MathException: hi!", objArray31, throwable34);
        java.lang.Object[] objArray49 = new java.lang.Object[] { 1L, 'a', 10L, 'a', (-1) };
        org.apache.commons.math.ConvergenceException convergenceException50 = new org.apache.commons.math.ConvergenceException("", objArray49);
        org.apache.commons.math.FunctionEvaluationException functionEvaluationException51 = new org.apache.commons.math.FunctionEvaluationException((-1.0d), "", objArray49);
        org.apache.commons.math.ode.IntegratorException integratorException52 = new org.apache.commons.math.ode.IntegratorException("hi!", objArray49);
        org.apache.commons.math.MathException mathException53 = new org.apache.commons.math.MathException("org.apache.commons.math.MathException: hi!", objArray49);
        org.apache.commons.math.ConvergenceException convergenceException54 = new org.apache.commons.math.ConvergenceException("org.apache.commons.math.MathException: ", objArray49);
        org.apache.commons.math.ConvergenceException convergenceException55 = new org.apache.commons.math.ConvergenceException("org.apache.commons.math.MathException: hi!", objArray31, (java.lang.Throwable) convergenceException54);
        org.apache.commons.math.FunctionEvaluationException functionEvaluationException56 = new org.apache.commons.math.FunctionEvaluationException((double) '#', "hi!", objArray31);
        org.apache.commons.math.ConvergenceException convergenceException57 = new org.apache.commons.math.ConvergenceException("org.apache.commons.math.MathException: Evaluation failed for argument = 52", objArray21, (java.lang.Throwable) functionEvaluationException56);
        java.lang.Throwable[] throwableArray58 = functionEvaluationException56.getSuppressed();
        org.apache.commons.math.ConvergenceException convergenceException59 = new org.apache.commons.math.ConvergenceException("org.apache.commons.math.ConvergenceException: org.apache.commons.math.MathException: org.apache.commons.math.FunctionEvaluationException: org.apache.commons.math.MathException: hi!", (java.lang.Object[]) strArray11, (java.lang.Throwable) functionEvaluationException56);
        org.apache.commons.math.ode.IntegratorException integratorException60 = new org.apache.commons.math.ode.IntegratorException((java.lang.Throwable) functionEvaluationException56);
        org.junit.Assert.assertNotNull(strArray11);
        org.junit.Assert.assertNotNull(objArray21);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray21), "[100.0, 10]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray21), "[100.0, 10]");
        org.junit.Assert.assertNotNull(objArray31);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray31), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray31), "[]");
        org.junit.Assert.assertNotNull(objArray49);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray49), "[1, a, 10, a, -1]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray49), "[1, a, 10, a, -1]");
        org.junit.Assert.assertNotNull(throwableArray58);
    }

    @Test
    public void test14527() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest29.test14527");
        java.lang.Object[] objArray20 = new java.lang.Object[] { 1L, 'a', 10L, 'a', (-1) };
        org.apache.commons.math.ConvergenceException convergenceException21 = new org.apache.commons.math.ConvergenceException("", objArray20);
        org.apache.commons.math.FunctionEvaluationException functionEvaluationException22 = new org.apache.commons.math.FunctionEvaluationException((-1.0d), "", objArray20);
        org.apache.commons.math.ode.IntegratorException integratorException23 = new org.apache.commons.math.ode.IntegratorException("hi!", objArray20);
        org.apache.commons.math.FunctionEvaluationException functionEvaluationException26 = new org.apache.commons.math.FunctionEvaluationException((double) (short) 1, "");
        org.apache.commons.math.MathException mathException27 = new org.apache.commons.math.MathException("", objArray20, (java.lang.Throwable) functionEvaluationException26);
        org.apache.commons.math.MathException mathException28 = new org.apache.commons.math.MathException((java.lang.Throwable) functionEvaluationException26);
        java.lang.Object[] objArray29 = functionEvaluationException26.getArguments();
        java.lang.Throwable[] throwableArray30 = functionEvaluationException26.getSuppressed();
        java.lang.Object[] objArray31 = functionEvaluationException26.getArguments();
        org.apache.commons.math.ode.SwitchingFunctionsHandler switchingFunctionsHandler36 = new org.apache.commons.math.ode.SwitchingFunctionsHandler();
        java.lang.Object[] objArray45 = new java.lang.Object[] { 1L, 'a', 10L, 'a', (-1) };
        org.apache.commons.math.ConvergenceException convergenceException46 = new org.apache.commons.math.ConvergenceException("", objArray45);
        org.apache.commons.math.ode.IntegratorException integratorException47 = new org.apache.commons.math.ode.IntegratorException("org.apache.commons.math.MathException: hi!", objArray45);
        java.lang.Object[] objArray48 = new java.lang.Object[] { 2, switchingFunctionsHandler36, 1, objArray45 };
        org.apache.commons.math.ConvergenceException convergenceException51 = new org.apache.commons.math.ConvergenceException("hi!");
        org.apache.commons.math.MathException mathException52 = new org.apache.commons.math.MathException("hi!", (java.lang.Throwable) convergenceException51);
        org.apache.commons.math.FunctionEvaluationException functionEvaluationException53 = new org.apache.commons.math.FunctionEvaluationException((double) (short) 0, "org.apache.commons.math.MathException: hi!", objArray45, (java.lang.Throwable) mathException52);
        org.apache.commons.math.FunctionEvaluationException functionEvaluationException54 = new org.apache.commons.math.FunctionEvaluationException((double) (-1.0f), (java.lang.Throwable) functionEvaluationException53);
        java.lang.Object[] objArray55 = functionEvaluationException53.getArguments();
        double double56 = functionEvaluationException53.getArgument();
        org.apache.commons.math.FunctionEvaluationException functionEvaluationException57 = new org.apache.commons.math.FunctionEvaluationException((double) 10, "org.apache.commons.math.ode.IntegratorException: hi!", objArray31, (java.lang.Throwable) functionEvaluationException53);
        org.apache.commons.math.ConvergenceException convergenceException58 = new org.apache.commons.math.ConvergenceException("org.apache.commons.math.FunctionEvaluationException: hi!", objArray31);
        java.lang.Object[] objArray69 = new java.lang.Object[] { 1L, 'a', 10L, 'a', (-1) };
        org.apache.commons.math.ConvergenceException convergenceException70 = new org.apache.commons.math.ConvergenceException("", objArray69);
        org.apache.commons.math.FunctionEvaluationException functionEvaluationException71 = new org.apache.commons.math.FunctionEvaluationException((double) 'a', "", (java.lang.Throwable) convergenceException70);
        double double72 = functionEvaluationException71.getArgument();
        org.apache.commons.math.FunctionEvaluationException functionEvaluationException73 = new org.apache.commons.math.FunctionEvaluationException((double) (short) 1, "org.apache.commons.math.MathException", (java.lang.Throwable) functionEvaluationException71);
        org.apache.commons.math.ode.IntegratorException integratorException74 = new org.apache.commons.math.ode.IntegratorException((java.lang.Throwable) functionEvaluationException71);
        org.apache.commons.math.ode.IntegratorException integratorException75 = new org.apache.commons.math.ode.IntegratorException((java.lang.Throwable) integratorException74);
        org.apache.commons.math.FunctionEvaluationException functionEvaluationException76 = new org.apache.commons.math.FunctionEvaluationException((double) 0, "org.apache.commons.math.ode.DerivativeException: ", objArray31, (java.lang.Throwable) integratorException74);
        java.lang.String[] strArray88 = new java.lang.String[] { "hi!", "org.apache.commons.math.MathException: hi!", "", "hi!", "org.apache.commons.math.MathException: hi!" };
        org.apache.commons.math.ode.DerivativeException derivativeException89 = new org.apache.commons.math.ode.DerivativeException("hi!", strArray88);
        org.apache.commons.math.MathException mathException90 = new org.apache.commons.math.MathException("hi!", (java.lang.Object[]) strArray88);
        org.apache.commons.math.ode.DerivativeException derivativeException91 = new org.apache.commons.math.ode.DerivativeException("", strArray88);
        org.apache.commons.math.FunctionEvaluationException functionEvaluationException92 = new org.apache.commons.math.FunctionEvaluationException((double) (byte) -1, "org.apache.commons.math.MathException: ", (java.lang.Object[]) strArray88);
        org.apache.commons.math.ConvergenceException convergenceException93 = new org.apache.commons.math.ConvergenceException("org.apache.commons.math.FunctionEvaluationException: hi!", (java.lang.Throwable) functionEvaluationException92);
        org.apache.commons.math.MathException mathException94 = new org.apache.commons.math.MathException((java.lang.Throwable) functionEvaluationException92);
        org.apache.commons.math.FunctionEvaluationException functionEvaluationException95 = new org.apache.commons.math.FunctionEvaluationException((double) 2, "org.apache.commons.math.MathException: org.apache.commons.math.FunctionEvaluationException: org.apache.commons.math.FunctionEvaluationException: Evaluation failed for argument = 35", objArray31, (java.lang.Throwable) mathException94);
        org.apache.commons.math.FunctionEvaluationException functionEvaluationException96 = new org.apache.commons.math.FunctionEvaluationException((double) ' ', "org.apache.commons.math.ConvergenceException: org.apache.commons.math.MathException: org.apache.commons.math.ode.DerivativeException: hi!", objArray31);
        org.apache.commons.math.MathException mathException97 = new org.apache.commons.math.MathException("org.apache.commons.math.ode.IntegratorException: org.apache.commons.math.ode.DerivativeException: org.apache.commons.math.ode.IntegratorException: org.apache.commons.math.MathException: hi!", objArray31);
        org.junit.Assert.assertNotNull(objArray20);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray20), "[1, a, 10, a, -1]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray20), "[1, a, 10, a, -1]");
        org.junit.Assert.assertNotNull(objArray29);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray29), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray29), "[]");
        org.junit.Assert.assertNotNull(throwableArray30);
        org.junit.Assert.assertNotNull(objArray31);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray31), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray31), "[]");
        org.junit.Assert.assertNotNull(objArray45);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray45), "[1, a, 10, a, -1]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray45), "[1, a, 10, a, -1]");
        org.junit.Assert.assertNotNull(objArray48);
        org.junit.Assert.assertNotNull(objArray55);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray55), "[1, a, 10, a, -1]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray55), "[1, a, 10, a, -1]");
        org.junit.Assert.assertTrue("'" + double56 + "' != '" + 0.0d + "'", double56 == 0.0d);
        org.junit.Assert.assertNotNull(objArray69);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray69), "[1, a, 10, a, -1]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray69), "[1, a, 10, a, -1]");
        org.junit.Assert.assertTrue("'" + double72 + "' != '" + 97.0d + "'", double72 == 97.0d);
        org.junit.Assert.assertNotNull(strArray88);
    }

    @Test
    public void test14528() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest29.test14528");
        java.lang.String[] strArray11 = new java.lang.String[] { "hi!", "org.apache.commons.math.MathException: hi!", "", "hi!", "org.apache.commons.math.MathException: hi!" };
        org.apache.commons.math.ode.DerivativeException derivativeException12 = new org.apache.commons.math.ode.DerivativeException("hi!", strArray11);
        org.apache.commons.math.ConvergenceException convergenceException13 = new org.apache.commons.math.ConvergenceException("", (java.lang.Object[]) strArray11);
        org.apache.commons.math.ConvergenceException convergenceException14 = new org.apache.commons.math.ConvergenceException("", (java.lang.Object[]) strArray11);
        org.apache.commons.math.ode.DerivativeException derivativeException15 = new org.apache.commons.math.ode.DerivativeException("org.apache.commons.math.MathException: org.apache.commons.math.FunctionEvaluationException: hi!", strArray11);
        java.lang.Object[] objArray26 = new java.lang.Object[] { 1L, 'a', 10L, 'a', (-1) };
        org.apache.commons.math.ConvergenceException convergenceException27 = new org.apache.commons.math.ConvergenceException("", objArray26);
        org.apache.commons.math.ode.IntegratorException integratorException28 = new org.apache.commons.math.ode.IntegratorException("org.apache.commons.math.MathException: hi!", objArray26);
        org.apache.commons.math.MathException mathException29 = new org.apache.commons.math.MathException((java.lang.Throwable) integratorException28);
        java.lang.Throwable[] throwableArray30 = integratorException28.getSuppressed();
        org.apache.commons.math.MathException mathException31 = new org.apache.commons.math.MathException("", (java.lang.Object[]) throwableArray30);
        org.apache.commons.math.MathException mathException32 = new org.apache.commons.math.MathException("org.apache.commons.math.FunctionEvaluationException: hi!", (java.lang.Throwable) mathException31);
        org.apache.commons.math.MathException mathException33 = new org.apache.commons.math.MathException("org.apache.commons.math.MathException: hi!", (java.lang.Throwable) mathException31);
        org.apache.commons.math.MathException mathException34 = new org.apache.commons.math.MathException("org.apache.commons.math.MathException: org.apache.commons.math.FunctionEvaluationException: hi!", (java.lang.Object[]) strArray11, (java.lang.Throwable) mathException31);
        org.apache.commons.math.FunctionEvaluationException functionEvaluationException35 = new org.apache.commons.math.FunctionEvaluationException((double) 100.0f, (java.lang.Throwable) mathException31);
        java.lang.Object[] objArray36 = functionEvaluationException35.getArguments();
        java.lang.String str37 = functionEvaluationException35.getPattern();
        java.lang.Object[] objArray38 = functionEvaluationException35.getArguments();
        org.junit.Assert.assertNotNull(strArray11);
        org.junit.Assert.assertNotNull(objArray26);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray26), "[1, a, 10, a, -1]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray26), "[1, a, 10, a, -1]");
        org.junit.Assert.assertNotNull(throwableArray30);
        org.junit.Assert.assertNotNull(objArray36);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray36), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray36), "[]");
        org.junit.Assert.assertEquals("'" + str37 + "' != '" + "" + "'", str37, "");
        org.junit.Assert.assertNotNull(objArray38);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray38), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray38), "[]");
    }

    @Test
    public void test14529() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest29.test14529");
        java.lang.Throwable throwable6 = null;
        org.apache.commons.math.MathException mathException7 = new org.apache.commons.math.MathException(throwable6);
        org.apache.commons.math.MathException mathException9 = new org.apache.commons.math.MathException("hi!");
        mathException7.addSuppressed((java.lang.Throwable) mathException9);
        org.apache.commons.math.ode.DerivativeException derivativeException11 = new org.apache.commons.math.ode.DerivativeException((java.lang.Throwable) mathException7);
        java.lang.Throwable[] throwableArray12 = derivativeException11.getSuppressed();
        java.lang.Throwable[] throwableArray13 = derivativeException11.getSuppressed();
        java.lang.Throwable throwable14 = null;
        org.apache.commons.math.MathException mathException15 = new org.apache.commons.math.MathException("org.apache.commons.math.MathException: org.apache.commons.math.FunctionEvaluationException: Evaluation failed for argument = 52", (java.lang.Object[]) throwableArray13, throwable14);
        java.lang.Throwable throwable16 = null;
        org.apache.commons.math.FunctionEvaluationException functionEvaluationException17 = new org.apache.commons.math.FunctionEvaluationException(97.0d, "org.apache.commons.math.MathException: Evaluation failed for argument = 52", (java.lang.Object[]) throwableArray13, throwable16);
        java.lang.Throwable throwable20 = null;
        org.apache.commons.math.FunctionEvaluationException functionEvaluationException21 = new org.apache.commons.math.FunctionEvaluationException((double) (short) 0, "org.apache.commons.math.ode.DerivativeException: org.apache.commons.math.ode.IntegratorException: ", throwable20);
        org.apache.commons.math.FunctionEvaluationException functionEvaluationException22 = new org.apache.commons.math.FunctionEvaluationException((double) 100.0f, "org.apache.commons.math.MathException: org.apache.commons.math.FunctionEvaluationException: Evaluation failed for argument = 35", (java.lang.Object[]) throwableArray13, (java.lang.Throwable) functionEvaluationException21);
        org.apache.commons.math.ConvergenceException convergenceException23 = new org.apache.commons.math.ConvergenceException("org.apache.commons.math.MathException: org.apache.commons.math.FunctionEvaluationException: org.apache.commons.math.MathException: ", (java.lang.Object[]) throwableArray13);
        java.lang.Class<?> wildcardClass24 = throwableArray13.getClass();
        org.junit.Assert.assertNotNull(throwableArray12);
        org.junit.Assert.assertNotNull(throwableArray13);
        org.junit.Assert.assertNotNull(wildcardClass24);
    }

    @Test
    public void test14530() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest29.test14530");
        java.lang.String[] strArray15 = new java.lang.String[] { "hi!", "org.apache.commons.math.MathException: hi!", "", "hi!", "org.apache.commons.math.MathException: hi!" };
        org.apache.commons.math.ode.DerivativeException derivativeException16 = new org.apache.commons.math.ode.DerivativeException("hi!", strArray15);
        org.apache.commons.math.ode.IntegratorException integratorException17 = new org.apache.commons.math.ode.IntegratorException("", (java.lang.Object[]) strArray15);
        org.apache.commons.math.ode.IntegratorException integratorException18 = new org.apache.commons.math.ode.IntegratorException("org.apache.commons.math.MathException: hi!", (java.lang.Object[]) strArray15);
        org.apache.commons.math.MathException mathException19 = new org.apache.commons.math.MathException("org.apache.commons.math.FunctionEvaluationException: hi!", (java.lang.Object[]) strArray15);
        org.apache.commons.math.ode.DerivativeException derivativeException20 = new org.apache.commons.math.ode.DerivativeException("org.apache.commons.math.FunctionEvaluationException: Evaluation failed for argument = -1", strArray15);
        org.apache.commons.math.MathException mathException21 = new org.apache.commons.math.MathException("org.apache.commons.math.MathException: org.apache.commons.math.MathException: ", (java.lang.Object[]) strArray15);
        org.apache.commons.math.ode.DerivativeException derivativeException22 = new org.apache.commons.math.ode.DerivativeException("Evaluation failed for argument = 52", strArray15);
        org.apache.commons.math.ode.DerivativeException derivativeException23 = new org.apache.commons.math.ode.DerivativeException("Evaluation failed for argument = 100", strArray15);
        org.apache.commons.math.FunctionEvaluationException functionEvaluationException24 = new org.apache.commons.math.FunctionEvaluationException((-1.0d), "org.apache.commons.math.ode.IntegratorException: org.apache.commons.math.ode.IntegratorException: org.apache.commons.math.ode.DerivativeException: ", (java.lang.Object[]) strArray15);
        org.junit.Assert.assertNotNull(strArray15);
    }

    @Test
    public void test14531() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest29.test14531");
        java.lang.Object[] objArray1 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math.ode.IntegratorException integratorException2 = new org.apache.commons.math.ode.IntegratorException("org.apache.commons.math.MathException: org.apache.commons.math.MathException: Evaluation failed for argument = 52", objArray1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test14532() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest29.test14532");
        org.apache.commons.math.ode.SwitchingFunctionsHandler switchingFunctionsHandler0 = new org.apache.commons.math.ode.SwitchingFunctionsHandler();
        boolean boolean1 = switchingFunctionsHandler0.isEmpty();
        org.apache.commons.math.ode.StepInterpolator stepInterpolator2 = null;
        boolean boolean3 = switchingFunctionsHandler0.evaluateStep(stepInterpolator2);
        org.apache.commons.math.ode.SwitchingFunctionsHandler switchingFunctionsHandler5 = new org.apache.commons.math.ode.SwitchingFunctionsHandler();
        boolean boolean6 = switchingFunctionsHandler5.isEmpty();
        double[] doubleArray9 = new double[] { 100.0d };
        boolean boolean10 = switchingFunctionsHandler5.reset((double) 0L, doubleArray9);
        switchingFunctionsHandler0.stepAccepted((double) (byte) 10, doubleArray9);
        org.apache.commons.math.ode.SwitchingFunctionsHandler switchingFunctionsHandler13 = new org.apache.commons.math.ode.SwitchingFunctionsHandler();
        boolean boolean14 = switchingFunctionsHandler13.isEmpty();
        double[] doubleArray17 = new double[] { 100.0d };
        boolean boolean18 = switchingFunctionsHandler13.reset((double) 0L, doubleArray17);
        switchingFunctionsHandler0.stepAccepted(100.0d, doubleArray17);
        double double20 = switchingFunctionsHandler0.getEventTime();
        org.apache.commons.math.ode.SwitchingFunction switchingFunction21 = null;
        switchingFunctionsHandler0.add(switchingFunction21, (double) 10, (double) (byte) 0, 3);
        double double26 = switchingFunctionsHandler0.getEventTime();
        org.apache.commons.math.ode.SwitchingFunction switchingFunction27 = null;
        switchingFunctionsHandler0.add(switchingFunction27, (double) (short) 0, (double) 100L, 1);
        org.apache.commons.math.ode.SwitchingFunction switchingFunction32 = null;
        switchingFunctionsHandler0.add(switchingFunction32, (double) (short) 0, (double) 100L, (int) (short) -1);
        org.apache.commons.math.ode.SwitchingFunction switchingFunction37 = null;
        switchingFunctionsHandler0.add(switchingFunction37, 2.0d, (double) (-1), (int) (short) 10);
        org.apache.commons.math.ode.StepInterpolator stepInterpolator42 = null;
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean43 = switchingFunctionsHandler0.evaluateStep(stepInterpolator42);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertNotNull(doubleArray9);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray9), "[100.0]");
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertNotNull(doubleArray17);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray17), "[100.0]");
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertTrue(Double.isNaN(double20));
        org.junit.Assert.assertTrue(Double.isNaN(double26));
    }

    @Test
    public void test14533() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest29.test14533");
        org.apache.commons.math.FunctionEvaluationException functionEvaluationException3 = new org.apache.commons.math.FunctionEvaluationException((double) '4', "org.apache.commons.math.MathException: org.apache.commons.math.FunctionEvaluationException: org.apache.commons.math.MathException: Evaluation failed for argument = 100");
        org.apache.commons.math.FunctionEvaluationException functionEvaluationException4 = new org.apache.commons.math.FunctionEvaluationException(Double.NaN, (java.lang.Throwable) functionEvaluationException3);
    }

    @Test
    public void test14534() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest29.test14534");
        java.lang.String[] strArray13 = new java.lang.String[] { "hi!", "org.apache.commons.math.MathException: hi!", "", "hi!", "org.apache.commons.math.MathException: hi!" };
        org.apache.commons.math.ode.DerivativeException derivativeException14 = new org.apache.commons.math.ode.DerivativeException("hi!", strArray13);
        org.apache.commons.math.ode.IntegratorException integratorException15 = new org.apache.commons.math.ode.IntegratorException("", (java.lang.Object[]) strArray13);
        org.apache.commons.math.ode.DerivativeException derivativeException16 = new org.apache.commons.math.ode.DerivativeException("hi!", strArray13);
        org.apache.commons.math.ode.IntegratorException integratorException17 = new org.apache.commons.math.ode.IntegratorException("org.apache.commons.math.FunctionEvaluationException: hi!", (java.lang.Object[]) strArray13);
        org.apache.commons.math.ode.DerivativeException derivativeException18 = new org.apache.commons.math.ode.DerivativeException("org.apache.commons.math.MathException: org.apache.commons.math.ode.IntegratorException: org.apache.commons.math.MathException: ", strArray13);
        org.apache.commons.math.ode.IntegratorException integratorException19 = new org.apache.commons.math.ode.IntegratorException("org.apache.commons.math.ode.DerivativeException: hi!", (java.lang.Object[]) strArray13);
        java.lang.Object[] objArray28 = new java.lang.Object[] { 1L, 'a', 10L, 'a', (-1) };
        org.apache.commons.math.ConvergenceException convergenceException29 = new org.apache.commons.math.ConvergenceException("", objArray28);
        org.apache.commons.math.ode.DerivativeException derivativeException30 = new org.apache.commons.math.ode.DerivativeException((java.lang.Throwable) convergenceException29);
        java.lang.Throwable[] throwableArray31 = derivativeException30.getSuppressed();
        java.lang.String[] strArray40 = new java.lang.String[] { "hi!", "org.apache.commons.math.MathException: hi!", "", "hi!", "org.apache.commons.math.MathException: hi!" };
        org.apache.commons.math.ode.DerivativeException derivativeException41 = new org.apache.commons.math.ode.DerivativeException("hi!", strArray40);
        org.apache.commons.math.ConvergenceException convergenceException42 = new org.apache.commons.math.ConvergenceException("", (java.lang.Object[]) strArray40);
        org.apache.commons.math.ode.SwitchingFunctionsHandler switchingFunctionsHandler48 = new org.apache.commons.math.ode.SwitchingFunctionsHandler();
        java.lang.Object[] objArray57 = new java.lang.Object[] { 1L, 'a', 10L, 'a', (-1) };
        org.apache.commons.math.ConvergenceException convergenceException58 = new org.apache.commons.math.ConvergenceException("", objArray57);
        org.apache.commons.math.ode.IntegratorException integratorException59 = new org.apache.commons.math.ode.IntegratorException("org.apache.commons.math.MathException: hi!", objArray57);
        java.lang.Object[] objArray60 = new java.lang.Object[] { 2, switchingFunctionsHandler48, 1, objArray57 };
        org.apache.commons.math.ConvergenceException convergenceException63 = new org.apache.commons.math.ConvergenceException("hi!");
        org.apache.commons.math.MathException mathException64 = new org.apache.commons.math.MathException("hi!", (java.lang.Throwable) convergenceException63);
        org.apache.commons.math.FunctionEvaluationException functionEvaluationException65 = new org.apache.commons.math.FunctionEvaluationException((double) (short) 0, "org.apache.commons.math.MathException: hi!", objArray57, (java.lang.Throwable) mathException64);
        org.apache.commons.math.FunctionEvaluationException functionEvaluationException67 = new org.apache.commons.math.FunctionEvaluationException((double) 100L);
        org.apache.commons.math.ConvergenceException convergenceException68 = new org.apache.commons.math.ConvergenceException("org.apache.commons.math.MathException: hi!", objArray57, (java.lang.Throwable) functionEvaluationException67);
        org.apache.commons.math.FunctionEvaluationException functionEvaluationException70 = new org.apache.commons.math.FunctionEvaluationException((double) 100L);
        org.apache.commons.math.ConvergenceException convergenceException71 = new org.apache.commons.math.ConvergenceException("org.apache.commons.math.MathException: hi!", objArray57, (java.lang.Throwable) functionEvaluationException70);
        org.apache.commons.math.MathException mathException72 = new org.apache.commons.math.MathException("org.apache.commons.math.MathException: ", (java.lang.Object[]) strArray40, (java.lang.Throwable) functionEvaluationException70);
        org.apache.commons.math.MathException mathException73 = new org.apache.commons.math.MathException("", (java.lang.Object[]) throwableArray31, (java.lang.Throwable) mathException72);
        org.apache.commons.math.ConvergenceException convergenceException74 = new org.apache.commons.math.ConvergenceException((java.lang.Throwable) mathException72);
        org.apache.commons.math.FunctionEvaluationException functionEvaluationException75 = new org.apache.commons.math.FunctionEvaluationException((double) 0L, (java.lang.Throwable) convergenceException74);
        org.apache.commons.math.MathException mathException76 = new org.apache.commons.math.MathException((java.lang.Throwable) functionEvaluationException75);
        org.apache.commons.math.ConvergenceException convergenceException77 = new org.apache.commons.math.ConvergenceException("org.apache.commons.math.ConvergenceException: org.apache.commons.math.MathException: hi!", (java.lang.Object[]) strArray13, (java.lang.Throwable) mathException76);
        org.apache.commons.math.ode.DerivativeException derivativeException78 = new org.apache.commons.math.ode.DerivativeException((java.lang.Throwable) convergenceException77);
        org.apache.commons.math.ConvergenceException convergenceException79 = new org.apache.commons.math.ConvergenceException("org.apache.commons.math.FunctionEvaluationException: org.apache.commons.math.ode.DerivativeException: ", (java.lang.Throwable) convergenceException77);
        org.apache.commons.math.ode.IntegratorException integratorException80 = new org.apache.commons.math.ode.IntegratorException((java.lang.Throwable) convergenceException79);
        org.junit.Assert.assertNotNull(strArray13);
        org.junit.Assert.assertNotNull(objArray28);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray28), "[1, a, 10, a, -1]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray28), "[1, a, 10, a, -1]");
        org.junit.Assert.assertNotNull(throwableArray31);
        org.junit.Assert.assertNotNull(strArray40);
        org.junit.Assert.assertNotNull(objArray57);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray57), "[1, a, 10, a, -1]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray57), "[1, a, 10, a, -1]");
        org.junit.Assert.assertNotNull(objArray60);
    }

    @Test
    public void test14535() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest29.test14535");
        org.apache.commons.math.MathException mathException2 = new org.apache.commons.math.MathException("org.apache.commons.math.MathException");
        java.lang.Throwable[] throwableArray3 = mathException2.getSuppressed();
        java.lang.Throwable[] throwableArray4 = mathException2.getSuppressed();
        org.apache.commons.math.MathException mathException5 = new org.apache.commons.math.MathException("org.apache.commons.math.ode.DerivativeException", (java.lang.Object[]) throwableArray4);
        org.junit.Assert.assertNotNull(throwableArray3);
        org.junit.Assert.assertNotNull(throwableArray4);
    }

    @Test
    public void test14536() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest29.test14536");
        org.apache.commons.math.MathException mathException1 = new org.apache.commons.math.MathException("org.apache.commons.math.ode.IntegratorException: org.apache.commons.math.FunctionEvaluationException: org.apache.commons.math.MathException: ");
    }

    @Test
    public void test14537() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest29.test14537");
        org.apache.commons.math.ConvergenceException convergenceException6 = new org.apache.commons.math.ConvergenceException("org.apache.commons.math.MathException: org.apache.commons.math.FunctionEvaluationException: hi!");
        java.lang.Throwable[] throwableArray7 = convergenceException6.getSuppressed();
        org.apache.commons.math.ode.SwitchingFunctionsHandler switchingFunctionsHandler12 = new org.apache.commons.math.ode.SwitchingFunctionsHandler();
        java.lang.Object[] objArray21 = new java.lang.Object[] { 1L, 'a', 10L, 'a', (-1) };
        org.apache.commons.math.ConvergenceException convergenceException22 = new org.apache.commons.math.ConvergenceException("", objArray21);
        org.apache.commons.math.ode.IntegratorException integratorException23 = new org.apache.commons.math.ode.IntegratorException("org.apache.commons.math.MathException: hi!", objArray21);
        java.lang.Object[] objArray24 = new java.lang.Object[] { 2, switchingFunctionsHandler12, 1, objArray21 };
        org.apache.commons.math.ConvergenceException convergenceException27 = new org.apache.commons.math.ConvergenceException("hi!");
        org.apache.commons.math.MathException mathException28 = new org.apache.commons.math.MathException("hi!", (java.lang.Throwable) convergenceException27);
        org.apache.commons.math.FunctionEvaluationException functionEvaluationException29 = new org.apache.commons.math.FunctionEvaluationException((double) (short) 0, "org.apache.commons.math.MathException: hi!", objArray21, (java.lang.Throwable) mathException28);
        org.apache.commons.math.FunctionEvaluationException functionEvaluationException31 = new org.apache.commons.math.FunctionEvaluationException((double) 100L);
        org.apache.commons.math.ConvergenceException convergenceException32 = new org.apache.commons.math.ConvergenceException("org.apache.commons.math.MathException: hi!", objArray21, (java.lang.Throwable) functionEvaluationException31);
        org.apache.commons.math.ConvergenceException convergenceException33 = new org.apache.commons.math.ConvergenceException((java.lang.Throwable) functionEvaluationException31);
        org.apache.commons.math.MathException mathException34 = new org.apache.commons.math.MathException("org.apache.commons.math.ConvergenceException: org.apache.commons.math.FunctionEvaluationException: hi!", (java.lang.Object[]) throwableArray7, (java.lang.Throwable) functionEvaluationException31);
        org.apache.commons.math.FunctionEvaluationException functionEvaluationException35 = new org.apache.commons.math.FunctionEvaluationException(52.0d, "org.apache.commons.math.ConvergenceException: org.apache.commons.math.MathException: ", (java.lang.Object[]) throwableArray7);
        org.apache.commons.math.ode.IntegratorException integratorException36 = new org.apache.commons.math.ode.IntegratorException("org.apache.commons.math.FunctionEvaluationException: ", (java.lang.Object[]) throwableArray7);
        org.apache.commons.math.MathException mathException37 = new org.apache.commons.math.MathException((java.lang.Throwable) integratorException36);
        org.apache.commons.math.ConvergenceException convergenceException38 = new org.apache.commons.math.ConvergenceException("org.apache.commons.math.ode.DerivativeException: org.apache.commons.math.FunctionEvaluationException: Evaluation failed for argument = hi!", (java.lang.Throwable) mathException37);
        org.junit.Assert.assertNotNull(throwableArray7);
        org.junit.Assert.assertNotNull(objArray21);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray21), "[1, a, 10, a, -1]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray21), "[1, a, 10, a, -1]");
        org.junit.Assert.assertNotNull(objArray24);
    }

    @Test
    public void test14538() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest29.test14538");
        org.apache.commons.math.FunctionEvaluationException functionEvaluationException4 = new org.apache.commons.math.FunctionEvaluationException((double) '4');
        org.apache.commons.math.MathException mathException5 = new org.apache.commons.math.MathException((java.lang.Throwable) functionEvaluationException4);
        org.apache.commons.math.FunctionEvaluationException functionEvaluationException6 = new org.apache.commons.math.FunctionEvaluationException((-1.0d), "org.apache.commons.math.ode.IntegratorException: ", (java.lang.Throwable) functionEvaluationException4);
        java.lang.Throwable[] throwableArray7 = functionEvaluationException4.getSuppressed();
        org.apache.commons.math.ConvergenceException convergenceException8 = new org.apache.commons.math.ConvergenceException((java.lang.Throwable) functionEvaluationException4);
        org.apache.commons.math.ode.IntegratorException integratorException9 = new org.apache.commons.math.ode.IntegratorException((java.lang.Throwable) functionEvaluationException4);
        org.apache.commons.math.FunctionEvaluationException functionEvaluationException10 = new org.apache.commons.math.FunctionEvaluationException((double) 'a', (java.lang.Throwable) integratorException9);
        java.lang.String str11 = integratorException9.getPattern();
        org.apache.commons.math.ConvergenceException convergenceException12 = new org.apache.commons.math.ConvergenceException((java.lang.Throwable) integratorException9);
        org.apache.commons.math.ode.IntegratorException integratorException13 = new org.apache.commons.math.ode.IntegratorException((java.lang.Throwable) integratorException9);
        org.junit.Assert.assertNotNull(throwableArray7);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "Evaluation failed for argument = 52" + "'", str11, "Evaluation failed for argument = 52");
    }

    @Test
    public void test14539() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest29.test14539");
        java.lang.String[] strArray11 = new java.lang.String[] { "hi!", "org.apache.commons.math.MathException: hi!", "", "hi!", "org.apache.commons.math.MathException: hi!" };
        org.apache.commons.math.ode.DerivativeException derivativeException12 = new org.apache.commons.math.ode.DerivativeException("hi!", strArray11);
        org.apache.commons.math.ConvergenceException convergenceException13 = new org.apache.commons.math.ConvergenceException("", (java.lang.Object[]) strArray11);
        org.apache.commons.math.ode.SwitchingFunctionsHandler switchingFunctionsHandler19 = new org.apache.commons.math.ode.SwitchingFunctionsHandler();
        java.lang.Object[] objArray28 = new java.lang.Object[] { 1L, 'a', 10L, 'a', (-1) };
        org.apache.commons.math.ConvergenceException convergenceException29 = new org.apache.commons.math.ConvergenceException("", objArray28);
        org.apache.commons.math.ode.IntegratorException integratorException30 = new org.apache.commons.math.ode.IntegratorException("org.apache.commons.math.MathException: hi!", objArray28);
        java.lang.Object[] objArray31 = new java.lang.Object[] { 2, switchingFunctionsHandler19, 1, objArray28 };
        org.apache.commons.math.ConvergenceException convergenceException34 = new org.apache.commons.math.ConvergenceException("hi!");
        org.apache.commons.math.MathException mathException35 = new org.apache.commons.math.MathException("hi!", (java.lang.Throwable) convergenceException34);
        org.apache.commons.math.FunctionEvaluationException functionEvaluationException36 = new org.apache.commons.math.FunctionEvaluationException((double) (short) 0, "org.apache.commons.math.MathException: hi!", objArray28, (java.lang.Throwable) mathException35);
        org.apache.commons.math.FunctionEvaluationException functionEvaluationException38 = new org.apache.commons.math.FunctionEvaluationException((double) 100L);
        org.apache.commons.math.ConvergenceException convergenceException39 = new org.apache.commons.math.ConvergenceException("org.apache.commons.math.MathException: hi!", objArray28, (java.lang.Throwable) functionEvaluationException38);
        org.apache.commons.math.FunctionEvaluationException functionEvaluationException41 = new org.apache.commons.math.FunctionEvaluationException((double) 100L);
        org.apache.commons.math.ConvergenceException convergenceException42 = new org.apache.commons.math.ConvergenceException("org.apache.commons.math.MathException: hi!", objArray28, (java.lang.Throwable) functionEvaluationException41);
        org.apache.commons.math.MathException mathException43 = new org.apache.commons.math.MathException("org.apache.commons.math.MathException: ", (java.lang.Object[]) strArray11, (java.lang.Throwable) functionEvaluationException41);
        org.apache.commons.math.MathException mathException44 = new org.apache.commons.math.MathException("org.apache.commons.math.ode.IntegratorException: ", (java.lang.Object[]) strArray11);
        org.apache.commons.math.ode.DerivativeException derivativeException45 = new org.apache.commons.math.ode.DerivativeException("org.apache.commons.math.FunctionEvaluationException: Evaluation failed for argument = 100", strArray11);
        org.apache.commons.math.ode.DerivativeException derivativeException46 = new org.apache.commons.math.ode.DerivativeException("org.apache.commons.math.ode.IntegratorException: hi!", strArray11);
        org.junit.Assert.assertNotNull(strArray11);
        org.junit.Assert.assertNotNull(objArray28);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray28), "[1, a, 10, a, -1]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray28), "[1, a, 10, a, -1]");
        org.junit.Assert.assertNotNull(objArray31);
    }

    @Test
    public void test14540() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest29.test14540");
        org.apache.commons.math.ode.SwitchingFunctionsHandler switchingFunctionsHandler0 = new org.apache.commons.math.ode.SwitchingFunctionsHandler();
        boolean boolean1 = switchingFunctionsHandler0.isEmpty();
        org.apache.commons.math.ode.StepInterpolator stepInterpolator2 = null;
        boolean boolean3 = switchingFunctionsHandler0.evaluateStep(stepInterpolator2);
        boolean boolean4 = switchingFunctionsHandler0.isEmpty();
        boolean boolean5 = switchingFunctionsHandler0.isEmpty();
        org.apache.commons.math.ode.SwitchingFunction switchingFunction6 = null;
        switchingFunctionsHandler0.add(switchingFunction6, (double) 'a', (double) (short) -1, (int) (byte) 100);
        boolean boolean11 = switchingFunctionsHandler0.stop();
        boolean boolean12 = switchingFunctionsHandler0.isEmpty();
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
    }

    @Test
    public void test14541() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest29.test14541");
        java.lang.String[] strArray12 = new java.lang.String[] { "hi!", "org.apache.commons.math.MathException: hi!", "", "hi!", "org.apache.commons.math.MathException: hi!" };
        org.apache.commons.math.ode.DerivativeException derivativeException13 = new org.apache.commons.math.ode.DerivativeException("hi!", strArray12);
        org.apache.commons.math.ConvergenceException convergenceException14 = new org.apache.commons.math.ConvergenceException("", (java.lang.Object[]) strArray12);
        org.apache.commons.math.ConvergenceException convergenceException15 = new org.apache.commons.math.ConvergenceException("", (java.lang.Object[]) strArray12);
        org.apache.commons.math.FunctionEvaluationException functionEvaluationException16 = new org.apache.commons.math.FunctionEvaluationException((double) (short) 100, "", (java.lang.Object[]) strArray12);
        org.apache.commons.math.MathException mathException18 = new org.apache.commons.math.MathException("org.apache.commons.math.FunctionEvaluationException: org.apache.commons.math.ode.IntegratorException: Evaluation failed for argument = 100");
        java.lang.Object[] objArray23 = new java.lang.Object[] { 100.0f, (byte) 10 };
        org.apache.commons.math.MathException mathException24 = new org.apache.commons.math.MathException("org.apache.commons.math.MathException: hi!", objArray23);
        org.apache.commons.math.ConvergenceException convergenceException31 = new org.apache.commons.math.ConvergenceException("hi!");
        org.apache.commons.math.MathException mathException32 = new org.apache.commons.math.MathException("hi!", (java.lang.Throwable) convergenceException31);
        java.lang.Object[] objArray33 = mathException32.getArguments();
        java.lang.Throwable throwable36 = null;
        org.apache.commons.math.MathException mathException37 = new org.apache.commons.math.MathException("hi!", throwable36);
        org.apache.commons.math.MathException mathException38 = new org.apache.commons.math.MathException("org.apache.commons.math.MathException: hi!", throwable36);
        org.apache.commons.math.ConvergenceException convergenceException39 = new org.apache.commons.math.ConvergenceException("org.apache.commons.math.MathException: hi!", objArray33, throwable36);
        java.lang.Object[] objArray51 = new java.lang.Object[] { 1L, 'a', 10L, 'a', (-1) };
        org.apache.commons.math.ConvergenceException convergenceException52 = new org.apache.commons.math.ConvergenceException("", objArray51);
        org.apache.commons.math.FunctionEvaluationException functionEvaluationException53 = new org.apache.commons.math.FunctionEvaluationException((-1.0d), "", objArray51);
        org.apache.commons.math.ode.IntegratorException integratorException54 = new org.apache.commons.math.ode.IntegratorException("hi!", objArray51);
        org.apache.commons.math.MathException mathException55 = new org.apache.commons.math.MathException("org.apache.commons.math.MathException: hi!", objArray51);
        org.apache.commons.math.ConvergenceException convergenceException56 = new org.apache.commons.math.ConvergenceException("org.apache.commons.math.MathException: ", objArray51);
        org.apache.commons.math.ConvergenceException convergenceException57 = new org.apache.commons.math.ConvergenceException("org.apache.commons.math.MathException: hi!", objArray33, (java.lang.Throwable) convergenceException56);
        org.apache.commons.math.FunctionEvaluationException functionEvaluationException58 = new org.apache.commons.math.FunctionEvaluationException((double) '#', "hi!", objArray33);
        org.apache.commons.math.ConvergenceException convergenceException59 = new org.apache.commons.math.ConvergenceException("org.apache.commons.math.MathException: Evaluation failed for argument = 52", objArray23, (java.lang.Throwable) functionEvaluationException58);
        mathException18.addSuppressed((java.lang.Throwable) convergenceException59);
        org.apache.commons.math.ConvergenceException convergenceException61 = new org.apache.commons.math.ConvergenceException("", (java.lang.Object[]) strArray12, (java.lang.Throwable) mathException18);
        org.apache.commons.math.FunctionEvaluationException functionEvaluationException62 = new org.apache.commons.math.FunctionEvaluationException((double) 10.0f, (java.lang.Throwable) convergenceException61);
        org.junit.Assert.assertNotNull(strArray12);
        org.junit.Assert.assertNotNull(objArray23);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray23), "[100.0, 10]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray23), "[100.0, 10]");
        org.junit.Assert.assertNotNull(objArray33);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray33), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray33), "[]");
        org.junit.Assert.assertNotNull(objArray51);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray51), "[1, a, 10, a, -1]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray51), "[1, a, 10, a, -1]");
    }

    @Test
    public void test14542() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest29.test14542");
        org.apache.commons.math.ConvergenceException convergenceException12 = new org.apache.commons.math.ConvergenceException("hi!");
        org.apache.commons.math.MathException mathException13 = new org.apache.commons.math.MathException("hi!", (java.lang.Throwable) convergenceException12);
        java.lang.Object[] objArray14 = mathException13.getArguments();
        java.lang.Throwable throwable17 = null;
        org.apache.commons.math.MathException mathException18 = new org.apache.commons.math.MathException("hi!", throwable17);
        org.apache.commons.math.MathException mathException19 = new org.apache.commons.math.MathException("org.apache.commons.math.MathException: hi!", throwable17);
        org.apache.commons.math.ConvergenceException convergenceException20 = new org.apache.commons.math.ConvergenceException("org.apache.commons.math.MathException: hi!", objArray14, throwable17);
        java.lang.Object[] objArray32 = new java.lang.Object[] { 1L, 'a', 10L, 'a', (-1) };
        org.apache.commons.math.ConvergenceException convergenceException33 = new org.apache.commons.math.ConvergenceException("", objArray32);
        org.apache.commons.math.FunctionEvaluationException functionEvaluationException34 = new org.apache.commons.math.FunctionEvaluationException((-1.0d), "", objArray32);
        org.apache.commons.math.ode.IntegratorException integratorException35 = new org.apache.commons.math.ode.IntegratorException("hi!", objArray32);
        org.apache.commons.math.MathException mathException36 = new org.apache.commons.math.MathException("org.apache.commons.math.MathException: hi!", objArray32);
        org.apache.commons.math.ConvergenceException convergenceException37 = new org.apache.commons.math.ConvergenceException("org.apache.commons.math.MathException: ", objArray32);
        org.apache.commons.math.ConvergenceException convergenceException38 = new org.apache.commons.math.ConvergenceException("org.apache.commons.math.MathException: hi!", objArray14, (java.lang.Throwable) convergenceException37);
        org.apache.commons.math.FunctionEvaluationException functionEvaluationException39 = new org.apache.commons.math.FunctionEvaluationException((double) '#', "hi!", objArray14);
        org.apache.commons.math.FunctionEvaluationException functionEvaluationException40 = new org.apache.commons.math.FunctionEvaluationException((double) (byte) -1, "org.apache.commons.math.FunctionEvaluationException: hi!", objArray14);
        org.apache.commons.math.MathException mathException42 = new org.apache.commons.math.MathException("org.apache.commons.math.ConvergenceException: Evaluation failed for argument = 52");
        org.apache.commons.math.MathException mathException43 = new org.apache.commons.math.MathException("org.apache.commons.math.FunctionEvaluationException: org.apache.commons.math.FunctionEvaluationException: Evaluation failed for argument = 35", objArray14, (java.lang.Throwable) mathException42);
        org.apache.commons.math.MathException mathException45 = new org.apache.commons.math.MathException("org.apache.commons.math.MathException");
        java.lang.Throwable[] throwableArray46 = mathException45.getSuppressed();
        org.apache.commons.math.ConvergenceException convergenceException47 = new org.apache.commons.math.ConvergenceException("org.apache.commons.math.ode.DerivativeException: org.apache.commons.math.MathException", objArray14, (java.lang.Throwable) mathException45);
        org.apache.commons.math.ConvergenceException convergenceException48 = new org.apache.commons.math.ConvergenceException("org.apache.commons.math.FunctionEvaluationException: org.apache.commons.math.ode.IntegratorException: ", objArray14);
        org.apache.commons.math.FunctionEvaluationException functionEvaluationException52 = new org.apache.commons.math.FunctionEvaluationException((double) (byte) 100);
        org.apache.commons.math.ConvergenceException convergenceException53 = new org.apache.commons.math.ConvergenceException((java.lang.Throwable) functionEvaluationException52);
        java.lang.Object[] objArray54 = functionEvaluationException52.getArguments();
        java.lang.Throwable throwable55 = null;
        org.apache.commons.math.MathException mathException56 = new org.apache.commons.math.MathException("hi!", objArray54, throwable55);
        org.apache.commons.math.FunctionEvaluationException functionEvaluationException59 = new org.apache.commons.math.FunctionEvaluationException((double) '4');
        org.apache.commons.math.MathException mathException60 = new org.apache.commons.math.MathException((java.lang.Throwable) functionEvaluationException59);
        double double61 = functionEvaluationException59.getArgument();
        org.apache.commons.math.MathException mathException62 = new org.apache.commons.math.MathException("org.apache.commons.math.ode.DerivativeException: ", (java.lang.Throwable) functionEvaluationException59);
        org.apache.commons.math.ConvergenceException convergenceException63 = new org.apache.commons.math.ConvergenceException("org.apache.commons.math.MathException: ", objArray54, (java.lang.Throwable) functionEvaluationException59);
        convergenceException48.addSuppressed((java.lang.Throwable) functionEvaluationException59);
        java.lang.Object[] objArray65 = convergenceException48.getArguments();
        org.apache.commons.math.MathException mathException66 = new org.apache.commons.math.MathException("org.apache.commons.math.MathException: ", (java.lang.Throwable) convergenceException48);
        org.junit.Assert.assertNotNull(objArray14);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray14), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray14), "[]");
        org.junit.Assert.assertNotNull(objArray32);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray32), "[1, a, 10, a, -1]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray32), "[1, a, 10, a, -1]");
        org.junit.Assert.assertNotNull(throwableArray46);
        org.junit.Assert.assertNotNull(objArray54);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray54), "[100.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray54), "[100.0]");
        org.junit.Assert.assertTrue("'" + double61 + "' != '" + 52.0d + "'", double61 == 52.0d);
        org.junit.Assert.assertNotNull(objArray65);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray65), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray65), "[]");
    }

    @Test
    public void test14543() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest29.test14543");
        org.apache.commons.math.ConvergenceException convergenceException5 = new org.apache.commons.math.ConvergenceException("hi!");
        org.apache.commons.math.MathException mathException6 = new org.apache.commons.math.MathException("hi!", (java.lang.Throwable) convergenceException5);
        java.lang.Throwable[] throwableArray7 = convergenceException5.getSuppressed();
        org.apache.commons.math.ConvergenceException convergenceException8 = new org.apache.commons.math.ConvergenceException("org.apache.commons.math.MathException: org.apache.commons.math.FunctionEvaluationException: hi!", (java.lang.Object[]) throwableArray7);
        org.apache.commons.math.MathException mathException10 = new org.apache.commons.math.MathException("org.apache.commons.math.FunctionEvaluationException: org.apache.commons.math.MathException: org.apache.commons.math.ConvergenceException: org.apache.commons.math.MathException: ");
        org.apache.commons.math.ConvergenceException convergenceException11 = new org.apache.commons.math.ConvergenceException("", (java.lang.Object[]) throwableArray7, (java.lang.Throwable) mathException10);
        java.lang.Object[] objArray28 = new java.lang.Object[] { 1L, 'a', 10L, 'a', (-1) };
        org.apache.commons.math.ConvergenceException convergenceException29 = new org.apache.commons.math.ConvergenceException("", objArray28);
        org.apache.commons.math.FunctionEvaluationException functionEvaluationException30 = new org.apache.commons.math.FunctionEvaluationException((-1.0d), "", objArray28);
        org.apache.commons.math.ode.IntegratorException integratorException31 = new org.apache.commons.math.ode.IntegratorException("hi!", objArray28);
        org.apache.commons.math.MathException mathException32 = new org.apache.commons.math.MathException("org.apache.commons.math.MathException: hi!", objArray28);
        org.apache.commons.math.ConvergenceException convergenceException33 = new org.apache.commons.math.ConvergenceException("org.apache.commons.math.MathException: ", objArray28);
        java.lang.Object[] objArray44 = new java.lang.Object[] { 1L, 'a', 10L, 'a', (-1) };
        org.apache.commons.math.ConvergenceException convergenceException45 = new org.apache.commons.math.ConvergenceException("", objArray44);
        org.apache.commons.math.FunctionEvaluationException functionEvaluationException46 = new org.apache.commons.math.FunctionEvaluationException((-1.0d), "", objArray44);
        org.apache.commons.math.ode.IntegratorException integratorException47 = new org.apache.commons.math.ode.IntegratorException("hi!", objArray44);
        org.apache.commons.math.MathException mathException48 = new org.apache.commons.math.MathException("org.apache.commons.math.MathException: hi!", objArray44);
        org.apache.commons.math.FunctionEvaluationException functionEvaluationException49 = new org.apache.commons.math.FunctionEvaluationException(1.0d, "hi!", objArray28, (java.lang.Throwable) mathException48);
        org.apache.commons.math.MathException mathException50 = new org.apache.commons.math.MathException("org.apache.commons.math.MathException: hi!", objArray28);
        org.apache.commons.math.MathException mathException52 = new org.apache.commons.math.MathException("Evaluation failed for argument = {0}");
        org.apache.commons.math.ConvergenceException convergenceException53 = new org.apache.commons.math.ConvergenceException("org.apache.commons.math.ConvergenceException: org.apache.commons.math.MathException: org.apache.commons.math.FunctionEvaluationException: hi!", objArray28, (java.lang.Throwable) mathException52);
        org.apache.commons.math.ode.IntegratorException integratorException54 = new org.apache.commons.math.ode.IntegratorException("org.apache.commons.math.MathException: org.apache.commons.math.FunctionEvaluationException: org.apache.commons.math.FunctionEvaluationException: Evaluation failed for argument = 35", objArray28);
        org.apache.commons.math.ConvergenceException convergenceException55 = new org.apache.commons.math.ConvergenceException("org.apache.commons.math.ConvergenceException: org.apache.commons.math.FunctionEvaluationException: Evaluation failed for argument = 2", (java.lang.Object[]) throwableArray7, (java.lang.Throwable) integratorException54);
        org.junit.Assert.assertNotNull(throwableArray7);
        org.junit.Assert.assertNotNull(objArray28);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray28), "[1, a, 10, a, -1]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray28), "[1, a, 10, a, -1]");
        org.junit.Assert.assertNotNull(objArray44);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray44), "[1, a, 10, a, -1]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray44), "[1, a, 10, a, -1]");
    }

    @Test
    public void test14544() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest29.test14544");
        org.apache.commons.math.ode.SwitchingFunctionsHandler switchingFunctionsHandler0 = new org.apache.commons.math.ode.SwitchingFunctionsHandler();
        boolean boolean1 = switchingFunctionsHandler0.isEmpty();
        double[] doubleArray4 = new double[] { 100.0d };
        boolean boolean5 = switchingFunctionsHandler0.reset((double) 0L, doubleArray4);
        org.apache.commons.math.ode.SwitchingFunctionsHandler switchingFunctionsHandler7 = new org.apache.commons.math.ode.SwitchingFunctionsHandler();
        boolean boolean8 = switchingFunctionsHandler7.isEmpty();
        org.apache.commons.math.ode.StepInterpolator stepInterpolator9 = null;
        boolean boolean10 = switchingFunctionsHandler7.evaluateStep(stepInterpolator9);
        org.apache.commons.math.ode.SwitchingFunctionsHandler switchingFunctionsHandler12 = new org.apache.commons.math.ode.SwitchingFunctionsHandler();
        boolean boolean13 = switchingFunctionsHandler12.isEmpty();
        double[] doubleArray16 = new double[] { 100.0d };
        boolean boolean17 = switchingFunctionsHandler12.reset((double) 0L, doubleArray16);
        boolean boolean18 = switchingFunctionsHandler7.reset((double) 1, doubleArray16);
        boolean boolean19 = switchingFunctionsHandler0.reset((double) 100, doubleArray16);
        double double20 = switchingFunctionsHandler0.getEventTime();
        boolean boolean21 = switchingFunctionsHandler0.stop();
        boolean boolean22 = switchingFunctionsHandler0.isEmpty();
        org.apache.commons.math.ode.SwitchingFunctionsHandler switchingFunctionsHandler24 = new org.apache.commons.math.ode.SwitchingFunctionsHandler();
        org.apache.commons.math.ode.SwitchingFunction switchingFunction25 = null;
        switchingFunctionsHandler24.add(switchingFunction25, (double) (-1), (double) 3, 0);
        double[] doubleArray37 = new double[] { 0L, 10.0d, 'a', 0.0d, (-1.0d), 0 };
        boolean boolean38 = switchingFunctionsHandler24.reset((double) (-1), doubleArray37);
        boolean boolean39 = switchingFunctionsHandler24.isEmpty();
        org.apache.commons.math.ode.SwitchingFunctionsHandler switchingFunctionsHandler41 = new org.apache.commons.math.ode.SwitchingFunctionsHandler();
        boolean boolean42 = switchingFunctionsHandler41.isEmpty();
        org.apache.commons.math.ode.StepInterpolator stepInterpolator43 = null;
        boolean boolean44 = switchingFunctionsHandler41.evaluateStep(stepInterpolator43);
        org.apache.commons.math.ode.SwitchingFunctionsHandler switchingFunctionsHandler46 = new org.apache.commons.math.ode.SwitchingFunctionsHandler();
        boolean boolean47 = switchingFunctionsHandler46.isEmpty();
        double[] doubleArray50 = new double[] { 100.0d };
        boolean boolean51 = switchingFunctionsHandler46.reset((double) 0L, doubleArray50);
        switchingFunctionsHandler41.stepAccepted((double) (byte) 10, doubleArray50);
        org.apache.commons.math.ode.SwitchingFunctionsHandler switchingFunctionsHandler54 = new org.apache.commons.math.ode.SwitchingFunctionsHandler();
        boolean boolean55 = switchingFunctionsHandler54.isEmpty();
        double[] doubleArray58 = new double[] { 100.0d };
        boolean boolean59 = switchingFunctionsHandler54.reset((double) 0L, doubleArray58);
        switchingFunctionsHandler41.stepAccepted(100.0d, doubleArray58);
        boolean boolean61 = switchingFunctionsHandler24.reset((-1.0d), doubleArray58);
        boolean boolean62 = switchingFunctionsHandler0.reset((double) 100, doubleArray58);
        org.apache.commons.math.ode.StepInterpolator stepInterpolator63 = null;
        boolean boolean64 = switchingFunctionsHandler0.evaluateStep(stepInterpolator63);
        double double65 = switchingFunctionsHandler0.getEventTime();
        boolean boolean66 = switchingFunctionsHandler0.isEmpty();
        org.apache.commons.math.ode.StepInterpolator stepInterpolator67 = null;
        boolean boolean68 = switchingFunctionsHandler0.evaluateStep(stepInterpolator67);
        boolean boolean69 = switchingFunctionsHandler0.isEmpty();
        boolean boolean70 = switchingFunctionsHandler0.isEmpty();
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertNotNull(doubleArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray4), "[100.0]");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertNotNull(doubleArray16);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray16), "[100.0]");
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertTrue(Double.isNaN(double20));
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + true + "'", boolean22 == true);
        org.junit.Assert.assertNotNull(doubleArray37);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray37), "[0.0, 10.0, 97.0, 0.0, -1.0, 0.0]");
        org.junit.Assert.assertTrue("'" + boolean38 + "' != '" + false + "'", boolean38 == false);
        org.junit.Assert.assertTrue("'" + boolean39 + "' != '" + false + "'", boolean39 == false);
        org.junit.Assert.assertTrue("'" + boolean42 + "' != '" + true + "'", boolean42 == true);
        org.junit.Assert.assertTrue("'" + boolean44 + "' != '" + false + "'", boolean44 == false);
        org.junit.Assert.assertTrue("'" + boolean47 + "' != '" + true + "'", boolean47 == true);
        org.junit.Assert.assertNotNull(doubleArray50);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray50), "[100.0]");
        org.junit.Assert.assertTrue("'" + boolean51 + "' != '" + false + "'", boolean51 == false);
        org.junit.Assert.assertTrue("'" + boolean55 + "' != '" + true + "'", boolean55 == true);
        org.junit.Assert.assertNotNull(doubleArray58);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray58), "[100.0]");
        org.junit.Assert.assertTrue("'" + boolean59 + "' != '" + false + "'", boolean59 == false);
        org.junit.Assert.assertTrue("'" + boolean61 + "' != '" + false + "'", boolean61 == false);
        org.junit.Assert.assertTrue("'" + boolean62 + "' != '" + false + "'", boolean62 == false);
        org.junit.Assert.assertTrue("'" + boolean64 + "' != '" + false + "'", boolean64 == false);
        org.junit.Assert.assertTrue(Double.isNaN(double65));
        org.junit.Assert.assertTrue("'" + boolean66 + "' != '" + true + "'", boolean66 == true);
        org.junit.Assert.assertTrue("'" + boolean68 + "' != '" + false + "'", boolean68 == false);
        org.junit.Assert.assertTrue("'" + boolean69 + "' != '" + true + "'", boolean69 == true);
        org.junit.Assert.assertTrue("'" + boolean70 + "' != '" + true + "'", boolean70 == true);
    }

    @Test
    public void test14545() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest29.test14545");
        java.lang.String[] strArray12 = new java.lang.String[] { "hi!", "org.apache.commons.math.MathException: hi!", "", "hi!", "org.apache.commons.math.MathException: hi!" };
        org.apache.commons.math.ode.DerivativeException derivativeException13 = new org.apache.commons.math.ode.DerivativeException("hi!", strArray12);
        org.apache.commons.math.ode.IntegratorException integratorException14 = new org.apache.commons.math.ode.IntegratorException("", (java.lang.Object[]) strArray12);
        org.apache.commons.math.ode.DerivativeException derivativeException15 = new org.apache.commons.math.ode.DerivativeException("hi!", strArray12);
        org.apache.commons.math.ode.IntegratorException integratorException16 = new org.apache.commons.math.ode.IntegratorException("org.apache.commons.math.MathException: Evaluation failed for argument = 52", (java.lang.Object[]) strArray12);
        org.apache.commons.math.ode.DerivativeException derivativeException17 = new org.apache.commons.math.ode.DerivativeException("org.apache.commons.math.ode.DerivativeException: org.apache.commons.math.MathException: ", strArray12);
        org.apache.commons.math.ode.DerivativeException derivativeException18 = new org.apache.commons.math.ode.DerivativeException("org.apache.commons.math.ode.DerivativeException: org.apache.commons.math.ode.IntegratorException: ", strArray12);
        java.lang.String[] strArray28 = new java.lang.String[] { "hi!", "org.apache.commons.math.MathException: hi!", "", "hi!", "org.apache.commons.math.MathException: hi!" };
        org.apache.commons.math.ode.DerivativeException derivativeException29 = new org.apache.commons.math.ode.DerivativeException("hi!", strArray28);
        org.apache.commons.math.ode.IntegratorException integratorException30 = new org.apache.commons.math.ode.IntegratorException("", (java.lang.Object[]) strArray28);
        org.apache.commons.math.ode.IntegratorException integratorException31 = new org.apache.commons.math.ode.IntegratorException("org.apache.commons.math.MathException: hi!", (java.lang.Object[]) strArray28);
        org.apache.commons.math.FunctionEvaluationException functionEvaluationException32 = new org.apache.commons.math.FunctionEvaluationException((double) (byte) 1, (java.lang.Throwable) integratorException31);
        org.apache.commons.math.ConvergenceException convergenceException33 = new org.apache.commons.math.ConvergenceException("org.apache.commons.math.ode.DerivativeException: Evaluation failed for argument = 1", (java.lang.Object[]) strArray12, (java.lang.Throwable) integratorException31);
        org.junit.Assert.assertNotNull(strArray12);
        org.junit.Assert.assertNotNull(strArray28);
    }

    @Test
    public void test14546() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest29.test14546");
        org.apache.commons.math.ode.SwitchingFunctionsHandler switchingFunctionsHandler0 = new org.apache.commons.math.ode.SwitchingFunctionsHandler();
        boolean boolean1 = switchingFunctionsHandler0.isEmpty();
        double[] doubleArray4 = new double[] { 100.0d };
        boolean boolean5 = switchingFunctionsHandler0.reset((double) 0L, doubleArray4);
        org.apache.commons.math.ode.SwitchingFunctionsHandler switchingFunctionsHandler7 = new org.apache.commons.math.ode.SwitchingFunctionsHandler();
        boolean boolean8 = switchingFunctionsHandler7.isEmpty();
        org.apache.commons.math.ode.StepInterpolator stepInterpolator9 = null;
        boolean boolean10 = switchingFunctionsHandler7.evaluateStep(stepInterpolator9);
        org.apache.commons.math.ode.SwitchingFunctionsHandler switchingFunctionsHandler12 = new org.apache.commons.math.ode.SwitchingFunctionsHandler();
        boolean boolean13 = switchingFunctionsHandler12.isEmpty();
        double[] doubleArray16 = new double[] { 100.0d };
        boolean boolean17 = switchingFunctionsHandler12.reset((double) 0L, doubleArray16);
        boolean boolean18 = switchingFunctionsHandler7.reset((double) 1, doubleArray16);
        boolean boolean19 = switchingFunctionsHandler0.reset((double) 100, doubleArray16);
        double double20 = switchingFunctionsHandler0.getEventTime();
        boolean boolean21 = switchingFunctionsHandler0.stop();
        boolean boolean22 = switchingFunctionsHandler0.isEmpty();
        double double23 = switchingFunctionsHandler0.getEventTime();
        boolean boolean24 = switchingFunctionsHandler0.stop();
        org.apache.commons.math.ode.StepInterpolator stepInterpolator25 = null;
        boolean boolean26 = switchingFunctionsHandler0.evaluateStep(stepInterpolator25);
        boolean boolean27 = switchingFunctionsHandler0.isEmpty();
        org.apache.commons.math.ode.SwitchingFunction switchingFunction28 = null;
        switchingFunctionsHandler0.add(switchingFunction28, (double) 10.0f, (double) 100.0f, (int) (byte) 100);
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertNotNull(doubleArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray4), "[100.0]");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertNotNull(doubleArray16);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray16), "[100.0]");
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertTrue(Double.isNaN(double20));
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + true + "'", boolean22 == true);
        org.junit.Assert.assertTrue(Double.isNaN(double23));
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + true + "'", boolean27 == true);
    }

    @Test
    public void test14547() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest29.test14547");
        java.lang.Object[] objArray13 = new java.lang.Object[] { 1L, 'a', 10L, 'a', (-1) };
        org.apache.commons.math.ConvergenceException convergenceException14 = new org.apache.commons.math.ConvergenceException("", objArray13);
        org.apache.commons.math.FunctionEvaluationException functionEvaluationException15 = new org.apache.commons.math.FunctionEvaluationException((-1.0d), "", objArray13);
        org.apache.commons.math.ConvergenceException convergenceException16 = new org.apache.commons.math.ConvergenceException("org.apache.commons.math.MathException: ", objArray13);
        org.apache.commons.math.FunctionEvaluationException functionEvaluationException17 = new org.apache.commons.math.FunctionEvaluationException((double) 10.0f, "org.apache.commons.math.ConvergenceException: org.apache.commons.math.MathException: org.apache.commons.math.FunctionEvaluationException: hi!", objArray13);
        java.lang.Object[] objArray18 = functionEvaluationException17.getArguments();
        org.apache.commons.math.ode.IntegratorException integratorException19 = new org.apache.commons.math.ode.IntegratorException("org.apache.commons.math.ConvergenceException: Evaluation failed for argument = 52", objArray18);
        org.apache.commons.math.ConvergenceException convergenceException20 = new org.apache.commons.math.ConvergenceException("org.apache.commons.math.FunctionEvaluationException: org.apache.commons.math.ConvergenceException: Evaluation failed for argument = 52", objArray18);
        java.lang.Object[] objArray21 = convergenceException20.getArguments();
        org.apache.commons.math.MathException mathException22 = new org.apache.commons.math.MathException((java.lang.Throwable) convergenceException20);
        java.lang.String str23 = convergenceException20.getPattern();
        org.junit.Assert.assertNotNull(objArray13);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray13), "[1, a, 10, a, -1]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray13), "[1, a, 10, a, -1]");
        org.junit.Assert.assertNotNull(objArray18);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray18), "[1, a, 10, a, -1]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray18), "[1, a, 10, a, -1]");
        org.junit.Assert.assertNotNull(objArray21);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray21), "[1, a, 10, a, -1]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray21), "[1, a, 10, a, -1]");
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "org.apache.commons.math.FunctionEvaluationException: org.apache.commons.math.ConvergenceException: Evaluation failed for argument = 52" + "'", str23, "org.apache.commons.math.FunctionEvaluationException: org.apache.commons.math.ConvergenceException: Evaluation failed for argument = 52");
    }

    @Test
    public void test14548() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest29.test14548");
        java.lang.String[] strArray16 = new java.lang.String[] { "hi!", "org.apache.commons.math.MathException: hi!", "", "hi!", "org.apache.commons.math.MathException: hi!" };
        org.apache.commons.math.ode.DerivativeException derivativeException17 = new org.apache.commons.math.ode.DerivativeException("hi!", strArray16);
        org.apache.commons.math.ConvergenceException convergenceException18 = new org.apache.commons.math.ConvergenceException("org.apache.commons.math.FunctionEvaluationException: hi!", (java.lang.Object[]) strArray16);
        org.apache.commons.math.FunctionEvaluationException functionEvaluationException20 = new org.apache.commons.math.FunctionEvaluationException((double) '4');
        org.apache.commons.math.ConvergenceException convergenceException21 = new org.apache.commons.math.ConvergenceException((java.lang.Throwable) functionEvaluationException20);
        org.apache.commons.math.FunctionEvaluationException functionEvaluationException22 = new org.apache.commons.math.FunctionEvaluationException((double) (byte) 0, "org.apache.commons.math.FunctionEvaluationException: Evaluation failed for argument = -1", (java.lang.Object[]) strArray16, (java.lang.Throwable) functionEvaluationException20);
        org.apache.commons.math.ConvergenceException convergenceException23 = new org.apache.commons.math.ConvergenceException("org.apache.commons.math.ode.IntegratorException: hi!", (java.lang.Object[]) strArray16);
        org.apache.commons.math.FunctionEvaluationException functionEvaluationException26 = new org.apache.commons.math.FunctionEvaluationException((double) 0, "org.apache.commons.math.MathException: hi!");
        org.apache.commons.math.ode.IntegratorException integratorException27 = new org.apache.commons.math.ode.IntegratorException((java.lang.Throwable) functionEvaluationException26);
        org.apache.commons.math.ConvergenceException convergenceException28 = new org.apache.commons.math.ConvergenceException("org.apache.commons.math.ConvergenceException: org.apache.commons.math.MathException: org.apache.commons.math.FunctionEvaluationException: hi!", (java.lang.Object[]) strArray16, (java.lang.Throwable) integratorException27);
        org.apache.commons.math.ConvergenceException convergenceException38 = new org.apache.commons.math.ConvergenceException("hi!");
        org.apache.commons.math.MathException mathException39 = new org.apache.commons.math.MathException("hi!", (java.lang.Throwable) convergenceException38);
        java.lang.Object[] objArray40 = mathException39.getArguments();
        java.lang.Throwable throwable43 = null;
        org.apache.commons.math.MathException mathException44 = new org.apache.commons.math.MathException("hi!", throwable43);
        org.apache.commons.math.MathException mathException45 = new org.apache.commons.math.MathException("org.apache.commons.math.MathException: hi!", throwable43);
        org.apache.commons.math.ConvergenceException convergenceException46 = new org.apache.commons.math.ConvergenceException("org.apache.commons.math.MathException: hi!", objArray40, throwable43);
        java.lang.Object[] objArray58 = new java.lang.Object[] { 1L, 'a', 10L, 'a', (-1) };
        org.apache.commons.math.ConvergenceException convergenceException59 = new org.apache.commons.math.ConvergenceException("", objArray58);
        org.apache.commons.math.FunctionEvaluationException functionEvaluationException60 = new org.apache.commons.math.FunctionEvaluationException((-1.0d), "", objArray58);
        org.apache.commons.math.ode.IntegratorException integratorException61 = new org.apache.commons.math.ode.IntegratorException("hi!", objArray58);
        org.apache.commons.math.MathException mathException62 = new org.apache.commons.math.MathException("org.apache.commons.math.MathException: hi!", objArray58);
        org.apache.commons.math.ConvergenceException convergenceException63 = new org.apache.commons.math.ConvergenceException("org.apache.commons.math.MathException: ", objArray58);
        org.apache.commons.math.ConvergenceException convergenceException64 = new org.apache.commons.math.ConvergenceException("org.apache.commons.math.MathException: hi!", objArray40, (java.lang.Throwable) convergenceException63);
        org.apache.commons.math.ConvergenceException convergenceException70 = new org.apache.commons.math.ConvergenceException("hi!");
        org.apache.commons.math.MathException mathException71 = new org.apache.commons.math.MathException("hi!", (java.lang.Throwable) convergenceException70);
        java.lang.Object[] objArray72 = mathException71.getArguments();
        java.lang.Throwable throwable73 = null;
        org.apache.commons.math.ConvergenceException convergenceException74 = new org.apache.commons.math.ConvergenceException("hi!", objArray72, throwable73);
        org.apache.commons.math.FunctionEvaluationException functionEvaluationException75 = new org.apache.commons.math.FunctionEvaluationException((double) 1L, "", objArray72);
        org.apache.commons.math.ConvergenceException convergenceException76 = new org.apache.commons.math.ConvergenceException("org.apache.commons.math.FunctionEvaluationException: hi!", objArray40, (java.lang.Throwable) functionEvaluationException75);
        java.lang.String str77 = functionEvaluationException75.getPattern();
        java.lang.Throwable[] throwableArray78 = functionEvaluationException75.getSuppressed();
        org.apache.commons.math.ConvergenceException convergenceException79 = new org.apache.commons.math.ConvergenceException("org.apache.commons.math.MathException: ", (java.lang.Object[]) throwableArray78);
        org.apache.commons.math.ConvergenceException convergenceException87 = new org.apache.commons.math.ConvergenceException("hi!");
        org.apache.commons.math.MathException mathException88 = new org.apache.commons.math.MathException("hi!", (java.lang.Throwable) convergenceException87);
        java.lang.Object[] objArray89 = mathException88.getArguments();
        java.lang.Throwable throwable90 = null;
        org.apache.commons.math.ConvergenceException convergenceException91 = new org.apache.commons.math.ConvergenceException("hi!", objArray89, throwable90);
        org.apache.commons.math.FunctionEvaluationException functionEvaluationException92 = new org.apache.commons.math.FunctionEvaluationException((double) 1L, "", objArray89);
        org.apache.commons.math.ode.IntegratorException integratorException93 = new org.apache.commons.math.ode.IntegratorException("", objArray89);
        org.apache.commons.math.ConvergenceException convergenceException94 = new org.apache.commons.math.ConvergenceException("hi!", objArray89);
        org.apache.commons.math.FunctionEvaluationException functionEvaluationException95 = new org.apache.commons.math.FunctionEvaluationException((double) '#', "org.apache.commons.math.MathException", (java.lang.Object[]) throwableArray78, (java.lang.Throwable) convergenceException94);
        org.apache.commons.math.MathException mathException96 = new org.apache.commons.math.MathException("org.apache.commons.math.ode.IntegratorException: org.apache.commons.math.ConvergenceException: org.apache.commons.math.MathException: org.apache.commons.math.FunctionEvaluationException: hi!", (java.lang.Object[]) throwableArray78);
        org.apache.commons.math.FunctionEvaluationException functionEvaluationException97 = new org.apache.commons.math.FunctionEvaluationException((double) 10.0f, "org.apache.commons.math.ConvergenceException: org.apache.commons.math.FunctionEvaluationException: Evaluation failed for argument = 35", (java.lang.Object[]) strArray16, (java.lang.Throwable) mathException96);
        org.apache.commons.math.FunctionEvaluationException functionEvaluationException98 = new org.apache.commons.math.FunctionEvaluationException((double) 'a', "org.apache.commons.math.ConvergenceException: org.apache.commons.math.MathException: org.apache.commons.math.FunctionEvaluationException: org.apache.commons.math.MathException: hi!", (java.lang.Object[]) strArray16);
        org.apache.commons.math.ConvergenceException convergenceException99 = new org.apache.commons.math.ConvergenceException("org.apache.commons.math.MathException: org.apache.commons.math.FunctionEvaluationException: ", (java.lang.Object[]) strArray16);
        org.junit.Assert.assertNotNull(strArray16);
        org.junit.Assert.assertNotNull(objArray40);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray40), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray40), "[]");
        org.junit.Assert.assertNotNull(objArray58);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray58), "[1, a, 10, a, -1]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray58), "[1, a, 10, a, -1]");
        org.junit.Assert.assertNotNull(objArray72);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray72), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray72), "[]");
        org.junit.Assert.assertEquals("'" + str77 + "' != '" + "" + "'", str77, "");
        org.junit.Assert.assertNotNull(throwableArray78);
        org.junit.Assert.assertNotNull(objArray89);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray89), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray89), "[]");
    }

    @Test
    public void test14549() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest29.test14549");
        org.apache.commons.math.ode.SwitchingFunctionsHandler switchingFunctionsHandler7 = new org.apache.commons.math.ode.SwitchingFunctionsHandler();
        java.lang.Object[] objArray16 = new java.lang.Object[] { 1L, 'a', 10L, 'a', (-1) };
        org.apache.commons.math.ConvergenceException convergenceException17 = new org.apache.commons.math.ConvergenceException("", objArray16);
        org.apache.commons.math.ode.IntegratorException integratorException18 = new org.apache.commons.math.ode.IntegratorException("org.apache.commons.math.MathException: hi!", objArray16);
        java.lang.Object[] objArray19 = new java.lang.Object[] { 2, switchingFunctionsHandler7, 1, objArray16 };
        org.apache.commons.math.ConvergenceException convergenceException22 = new org.apache.commons.math.ConvergenceException("hi!");
        org.apache.commons.math.MathException mathException23 = new org.apache.commons.math.MathException("hi!", (java.lang.Throwable) convergenceException22);
        org.apache.commons.math.FunctionEvaluationException functionEvaluationException24 = new org.apache.commons.math.FunctionEvaluationException((double) (short) 0, "org.apache.commons.math.MathException: hi!", objArray16, (java.lang.Throwable) mathException23);
        org.apache.commons.math.FunctionEvaluationException functionEvaluationException26 = new org.apache.commons.math.FunctionEvaluationException((double) 100L);
        org.apache.commons.math.ConvergenceException convergenceException27 = new org.apache.commons.math.ConvergenceException("org.apache.commons.math.MathException: hi!", objArray16, (java.lang.Throwable) functionEvaluationException26);
        org.apache.commons.math.ConvergenceException convergenceException28 = new org.apache.commons.math.ConvergenceException((java.lang.Throwable) functionEvaluationException26);
        org.apache.commons.math.MathException mathException29 = new org.apache.commons.math.MathException("org.apache.commons.math.ode.IntegratorException: hi!", (java.lang.Throwable) convergenceException28);
        org.apache.commons.math.ode.IntegratorException integratorException30 = new org.apache.commons.math.ode.IntegratorException((java.lang.Throwable) mathException29);
        org.apache.commons.math.MathException mathException31 = new org.apache.commons.math.MathException("org.apache.commons.math.ode.DerivativeException: org.apache.commons.math.FunctionEvaluationException: Evaluation failed for argument = 0", (java.lang.Throwable) mathException29);
        java.lang.String str32 = mathException29.getPattern();
        org.apache.commons.math.MathException mathException33 = new org.apache.commons.math.MathException("org.apache.commons.math.MathException: Convergence failed", (java.lang.Throwable) mathException29);
        org.junit.Assert.assertNotNull(objArray16);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray16), "[1, a, 10, a, -1]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray16), "[1, a, 10, a, -1]");
        org.junit.Assert.assertNotNull(objArray19);
        org.junit.Assert.assertEquals("'" + str32 + "' != '" + "org.apache.commons.math.ode.IntegratorException: hi!" + "'", str32, "org.apache.commons.math.ode.IntegratorException: hi!");
    }

    @Test
    public void test14550() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest29.test14550");
        org.apache.commons.math.FunctionEvaluationException functionEvaluationException1 = new org.apache.commons.math.FunctionEvaluationException((double) (byte) 100);
        org.apache.commons.math.ode.DerivativeException derivativeException2 = new org.apache.commons.math.ode.DerivativeException((java.lang.Throwable) functionEvaluationException1);
        java.lang.Object[] objArray3 = functionEvaluationException1.getArguments();
        org.apache.commons.math.ode.IntegratorException integratorException4 = new org.apache.commons.math.ode.IntegratorException((java.lang.Throwable) functionEvaluationException1);
        org.junit.Assert.assertNotNull(objArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray3), "[100.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray3), "[100.0]");
    }

    @Test
    public void test14551() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest29.test14551");
        org.apache.commons.math.ode.SwitchingFunctionsHandler switchingFunctionsHandler0 = new org.apache.commons.math.ode.SwitchingFunctionsHandler();
        boolean boolean1 = switchingFunctionsHandler0.isEmpty();
        double[] doubleArray4 = new double[] { 100.0d };
        boolean boolean5 = switchingFunctionsHandler0.reset((double) 0L, doubleArray4);
        boolean boolean6 = switchingFunctionsHandler0.stop();
        double double7 = switchingFunctionsHandler0.getEventTime();
        double double8 = switchingFunctionsHandler0.getEventTime();
        boolean boolean9 = switchingFunctionsHandler0.stop();
        org.apache.commons.math.ode.StepInterpolator stepInterpolator10 = null;
        boolean boolean11 = switchingFunctionsHandler0.evaluateStep(stepInterpolator10);
        org.apache.commons.math.ode.SwitchingFunctionsHandler switchingFunctionsHandler13 = new org.apache.commons.math.ode.SwitchingFunctionsHandler();
        boolean boolean14 = switchingFunctionsHandler13.isEmpty();
        boolean boolean15 = switchingFunctionsHandler13.stop();
        double double16 = switchingFunctionsHandler13.getEventTime();
        boolean boolean17 = switchingFunctionsHandler13.stop();
        org.apache.commons.math.ode.SwitchingFunction switchingFunction18 = null;
        switchingFunctionsHandler13.add(switchingFunction18, (double) 0L, (double) 1.0f, (int) (short) 100);
        org.apache.commons.math.ode.SwitchingFunctionsHandler switchingFunctionsHandler24 = new org.apache.commons.math.ode.SwitchingFunctionsHandler();
        boolean boolean25 = switchingFunctionsHandler24.isEmpty();
        double[] doubleArray28 = new double[] { 100.0d };
        boolean boolean29 = switchingFunctionsHandler24.reset((double) 0L, doubleArray28);
        org.apache.commons.math.ode.SwitchingFunctionsHandler switchingFunctionsHandler31 = new org.apache.commons.math.ode.SwitchingFunctionsHandler();
        boolean boolean32 = switchingFunctionsHandler31.isEmpty();
        org.apache.commons.math.ode.StepInterpolator stepInterpolator33 = null;
        boolean boolean34 = switchingFunctionsHandler31.evaluateStep(stepInterpolator33);
        org.apache.commons.math.ode.SwitchingFunctionsHandler switchingFunctionsHandler36 = new org.apache.commons.math.ode.SwitchingFunctionsHandler();
        boolean boolean37 = switchingFunctionsHandler36.isEmpty();
        double[] doubleArray40 = new double[] { 100.0d };
        boolean boolean41 = switchingFunctionsHandler36.reset((double) 0L, doubleArray40);
        boolean boolean42 = switchingFunctionsHandler31.reset((double) 1, doubleArray40);
        boolean boolean43 = switchingFunctionsHandler24.reset((double) 100, doubleArray40);
        double double44 = switchingFunctionsHandler24.getEventTime();
        org.apache.commons.math.ode.SwitchingFunctionsHandler switchingFunctionsHandler46 = new org.apache.commons.math.ode.SwitchingFunctionsHandler();
        boolean boolean47 = switchingFunctionsHandler46.isEmpty();
        org.apache.commons.math.ode.StepInterpolator stepInterpolator48 = null;
        boolean boolean49 = switchingFunctionsHandler46.evaluateStep(stepInterpolator48);
        org.apache.commons.math.ode.SwitchingFunctionsHandler switchingFunctionsHandler51 = new org.apache.commons.math.ode.SwitchingFunctionsHandler();
        boolean boolean52 = switchingFunctionsHandler51.isEmpty();
        double[] doubleArray55 = new double[] { 100.0d };
        boolean boolean56 = switchingFunctionsHandler51.reset((double) 0L, doubleArray55);
        switchingFunctionsHandler46.stepAccepted((double) (byte) 10, doubleArray55);
        switchingFunctionsHandler24.stepAccepted(0.0d, doubleArray55);
        double double59 = switchingFunctionsHandler24.getEventTime();
        org.apache.commons.math.ode.SwitchingFunction switchingFunction60 = null;
        switchingFunctionsHandler24.add(switchingFunction60, (double) 10L, (double) 'a', (int) (byte) 0);
        org.apache.commons.math.ode.SwitchingFunctionsHandler switchingFunctionsHandler66 = new org.apache.commons.math.ode.SwitchingFunctionsHandler();
        boolean boolean67 = switchingFunctionsHandler66.isEmpty();
        double[] doubleArray70 = new double[] { 100.0d };
        boolean boolean71 = switchingFunctionsHandler66.reset((double) 0L, doubleArray70);
        boolean boolean72 = switchingFunctionsHandler24.reset((double) (byte) 1, doubleArray70);
        boolean boolean73 = switchingFunctionsHandler13.reset((double) (short) 100, doubleArray70);
        switchingFunctionsHandler0.stepAccepted((double) 0L, doubleArray70);
        double double75 = switchingFunctionsHandler0.getEventTime();
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertNotNull(doubleArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray4), "[100.0]");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue(Double.isNaN(double7));
        org.junit.Assert.assertTrue(Double.isNaN(double8));
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue(Double.isNaN(double16));
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + true + "'", boolean25 == true);
        org.junit.Assert.assertNotNull(doubleArray28);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray28), "[100.0]");
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + false + "'", boolean29 == false);
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + true + "'", boolean32 == true);
        org.junit.Assert.assertTrue("'" + boolean34 + "' != '" + false + "'", boolean34 == false);
        org.junit.Assert.assertTrue("'" + boolean37 + "' != '" + true + "'", boolean37 == true);
        org.junit.Assert.assertNotNull(doubleArray40);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray40), "[100.0]");
        org.junit.Assert.assertTrue("'" + boolean41 + "' != '" + false + "'", boolean41 == false);
        org.junit.Assert.assertTrue("'" + boolean42 + "' != '" + false + "'", boolean42 == false);
        org.junit.Assert.assertTrue("'" + boolean43 + "' != '" + false + "'", boolean43 == false);
        org.junit.Assert.assertTrue(Double.isNaN(double44));
        org.junit.Assert.assertTrue("'" + boolean47 + "' != '" + true + "'", boolean47 == true);
        org.junit.Assert.assertTrue("'" + boolean49 + "' != '" + false + "'", boolean49 == false);
        org.junit.Assert.assertTrue("'" + boolean52 + "' != '" + true + "'", boolean52 == true);
        org.junit.Assert.assertNotNull(doubleArray55);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray55), "[100.0]");
        org.junit.Assert.assertTrue("'" + boolean56 + "' != '" + false + "'", boolean56 == false);
        org.junit.Assert.assertTrue(Double.isNaN(double59));
        org.junit.Assert.assertTrue("'" + boolean67 + "' != '" + true + "'", boolean67 == true);
        org.junit.Assert.assertNotNull(doubleArray70);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray70), "[100.0]");
        org.junit.Assert.assertTrue("'" + boolean71 + "' != '" + false + "'", boolean71 == false);
        org.junit.Assert.assertTrue("'" + boolean72 + "' != '" + false + "'", boolean72 == false);
        org.junit.Assert.assertTrue("'" + boolean73 + "' != '" + false + "'", boolean73 == false);
        org.junit.Assert.assertTrue(Double.isNaN(double75));
    }

    @Test
    public void test14552() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest29.test14552");
        java.lang.String[] strArray10 = new java.lang.String[] { "hi!", "org.apache.commons.math.MathException: hi!", "", "hi!", "org.apache.commons.math.MathException: hi!" };
        org.apache.commons.math.ode.DerivativeException derivativeException11 = new org.apache.commons.math.ode.DerivativeException("hi!", strArray10);
        org.apache.commons.math.ConvergenceException convergenceException12 = new org.apache.commons.math.ConvergenceException("", (java.lang.Object[]) strArray10);
        org.apache.commons.math.ode.IntegratorException integratorException13 = new org.apache.commons.math.ode.IntegratorException("org.apache.commons.math.MathException: org.apache.commons.math.FunctionEvaluationException: Evaluation failed for argument = 52", (java.lang.Object[]) strArray10);
        org.apache.commons.math.ode.IntegratorException integratorException14 = new org.apache.commons.math.ode.IntegratorException("org.apache.commons.math.FunctionEvaluationException: Evaluation failed for argument = 0", (java.lang.Object[]) strArray10);
        java.lang.Throwable throwable15 = null;
        org.apache.commons.math.ConvergenceException convergenceException16 = new org.apache.commons.math.ConvergenceException("org.apache.commons.math.MathException: org.apache.commons.math.FunctionEvaluationException: org.apache.commons.math.MathException: Evaluation failed for argument = 100", (java.lang.Object[]) strArray10, throwable15);
        org.junit.Assert.assertNotNull(strArray10);
    }

    @Test
    public void test14553() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest29.test14553");
        org.apache.commons.math.MathException mathException7 = new org.apache.commons.math.MathException();
        org.apache.commons.math.FunctionEvaluationException functionEvaluationException8 = new org.apache.commons.math.FunctionEvaluationException((double) 10, "hi!", (java.lang.Throwable) mathException7);
        org.apache.commons.math.ConvergenceException convergenceException9 = new org.apache.commons.math.ConvergenceException("", (java.lang.Throwable) functionEvaluationException8);
        java.lang.Throwable[] throwableArray10 = convergenceException9.getSuppressed();
        org.apache.commons.math.ode.IntegratorException integratorException11 = new org.apache.commons.math.ode.IntegratorException("org.apache.commons.math.MathException: ", (java.lang.Object[]) throwableArray10);
        org.apache.commons.math.ode.IntegratorException integratorException12 = new org.apache.commons.math.ode.IntegratorException("org.apache.commons.math.MathException", (java.lang.Object[]) throwableArray10);
        org.apache.commons.math.ConvergenceException convergenceException13 = new org.apache.commons.math.ConvergenceException("org.apache.commons.math.ConvergenceException: org.apache.commons.math.MathException: org.apache.commons.math.FunctionEvaluationException: hi!", (java.lang.Throwable) integratorException12);
        org.apache.commons.math.ConvergenceException convergenceException14 = new org.apache.commons.math.ConvergenceException("", (java.lang.Throwable) convergenceException13);
        org.junit.Assert.assertNotNull(throwableArray10);
    }

    @Test
    public void test14554() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest29.test14554");
        org.apache.commons.math.MathException mathException1 = new org.apache.commons.math.MathException("org.apache.commons.math.ode.IntegratorException: org.apache.commons.math.MathException: ");
        java.lang.Throwable[] throwableArray2 = mathException1.getSuppressed();
        org.junit.Assert.assertNotNull(throwableArray2);
    }

    @Test
    public void test14555() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest29.test14555");
        java.lang.String[] strArray10 = new java.lang.String[] { "hi!", "org.apache.commons.math.MathException: hi!", "", "hi!", "org.apache.commons.math.MathException: hi!" };
        org.apache.commons.math.ode.DerivativeException derivativeException11 = new org.apache.commons.math.ode.DerivativeException("hi!", strArray10);
        org.apache.commons.math.ode.IntegratorException integratorException12 = new org.apache.commons.math.ode.IntegratorException("", (java.lang.Object[]) strArray10);
        org.apache.commons.math.ode.IntegratorException integratorException13 = new org.apache.commons.math.ode.IntegratorException("org.apache.commons.math.MathException: hi!", (java.lang.Object[]) strArray10);
        org.apache.commons.math.ConvergenceException convergenceException14 = new org.apache.commons.math.ConvergenceException("hi!", (java.lang.Throwable) integratorException13);
        java.lang.Throwable[] throwableArray15 = convergenceException14.getSuppressed();
        org.apache.commons.math.ConvergenceException convergenceException28 = new org.apache.commons.math.ConvergenceException("hi!");
        org.apache.commons.math.MathException mathException29 = new org.apache.commons.math.MathException("hi!", (java.lang.Throwable) convergenceException28);
        java.lang.Object[] objArray30 = mathException29.getArguments();
        java.lang.Throwable throwable31 = null;
        org.apache.commons.math.ConvergenceException convergenceException32 = new org.apache.commons.math.ConvergenceException("hi!", objArray30, throwable31);
        org.apache.commons.math.FunctionEvaluationException functionEvaluationException33 = new org.apache.commons.math.FunctionEvaluationException((double) 1L, "", objArray30);
        org.apache.commons.math.ode.IntegratorException integratorException34 = new org.apache.commons.math.ode.IntegratorException("", objArray30);
        org.apache.commons.math.ConvergenceException convergenceException40 = new org.apache.commons.math.ConvergenceException("hi!");
        org.apache.commons.math.MathException mathException41 = new org.apache.commons.math.MathException("hi!", (java.lang.Throwable) convergenceException40);
        java.lang.Object[] objArray42 = mathException41.getArguments();
        java.lang.Throwable throwable43 = null;
        org.apache.commons.math.ConvergenceException convergenceException44 = new org.apache.commons.math.ConvergenceException("hi!", objArray42, throwable43);
        org.apache.commons.math.ode.IntegratorException integratorException45 = new org.apache.commons.math.ode.IntegratorException("hi!", objArray42);
        org.apache.commons.math.ConvergenceException convergenceException48 = new org.apache.commons.math.ConvergenceException("hi!");
        org.apache.commons.math.MathException mathException49 = new org.apache.commons.math.MathException("hi!", (java.lang.Throwable) convergenceException48);
        java.lang.Throwable[] throwableArray50 = convergenceException48.getSuppressed();
        org.apache.commons.math.ode.DerivativeException derivativeException51 = new org.apache.commons.math.ode.DerivativeException((java.lang.Throwable) convergenceException48);
        org.apache.commons.math.ConvergenceException convergenceException52 = new org.apache.commons.math.ConvergenceException("org.apache.commons.math.ode.IntegratorException: hi!", objArray42, (java.lang.Throwable) convergenceException48);
        org.apache.commons.math.MathException mathException53 = new org.apache.commons.math.MathException("org.apache.commons.math.MathException: ", objArray30, (java.lang.Throwable) convergenceException48);
        org.apache.commons.math.FunctionEvaluationException functionEvaluationException54 = new org.apache.commons.math.FunctionEvaluationException((double) 10L, "", objArray30);
        java.lang.String[] strArray64 = new java.lang.String[] { "hi!", "org.apache.commons.math.MathException: hi!", "", "hi!", "org.apache.commons.math.MathException: hi!" };
        org.apache.commons.math.ode.DerivativeException derivativeException65 = new org.apache.commons.math.ode.DerivativeException("hi!", strArray64);
        org.apache.commons.math.ode.IntegratorException integratorException66 = new org.apache.commons.math.ode.IntegratorException("", (java.lang.Object[]) strArray64);
        org.apache.commons.math.ode.IntegratorException integratorException67 = new org.apache.commons.math.ode.IntegratorException("org.apache.commons.math.MathException: hi!", (java.lang.Object[]) strArray64);
        org.apache.commons.math.ConvergenceException convergenceException68 = new org.apache.commons.math.ConvergenceException("hi!", (java.lang.Throwable) integratorException67);
        org.apache.commons.math.FunctionEvaluationException functionEvaluationException69 = new org.apache.commons.math.FunctionEvaluationException((double) 100L, "", objArray30, (java.lang.Throwable) integratorException67);
        org.apache.commons.math.ode.IntegratorException integratorException70 = new org.apache.commons.math.ode.IntegratorException((java.lang.Throwable) functionEvaluationException69);
        org.apache.commons.math.ConvergenceException convergenceException71 = new org.apache.commons.math.ConvergenceException("org.apache.commons.math.MathException: Evaluation failed for argument = -1", (java.lang.Throwable) integratorException70);
        org.apache.commons.math.ode.IntegratorException integratorException72 = new org.apache.commons.math.ode.IntegratorException((java.lang.Throwable) integratorException70);
        org.apache.commons.math.MathException mathException73 = new org.apache.commons.math.MathException("org.apache.commons.math.MathException: org.apache.commons.math.FunctionEvaluationException: org.apache.commons.math.ode.DerivativeException: org.apache.commons.math.MathException: ", (java.lang.Object[]) throwableArray15, (java.lang.Throwable) integratorException72);
        java.lang.String str74 = integratorException72.toString();
        org.junit.Assert.assertNotNull(strArray10);
        org.junit.Assert.assertNotNull(throwableArray15);
        org.junit.Assert.assertNotNull(objArray30);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray30), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray30), "[]");
        org.junit.Assert.assertNotNull(objArray42);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray42), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray42), "[]");
        org.junit.Assert.assertNotNull(throwableArray50);
        org.junit.Assert.assertNotNull(strArray64);
        org.junit.Assert.assertEquals("'" + str74 + "' != '" + "org.apache.commons.math.ode.IntegratorException: " + "'", str74, "org.apache.commons.math.ode.IntegratorException: ");
    }

    @Test
    public void test14556() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest29.test14556");
        org.apache.commons.math.FunctionEvaluationException functionEvaluationException2 = new org.apache.commons.math.FunctionEvaluationException((double) 0.0f, "org.apache.commons.math.FunctionEvaluationException: org.apache.commons.math.FunctionEvaluationException: org.apache.commons.math.ConvergenceException: Evaluation failed for argument = 52");
    }

    @Test
    public void test14557() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest29.test14557");
        java.lang.String[] strArray1 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math.ode.DerivativeException derivativeException2 = new org.apache.commons.math.ode.DerivativeException("org.apache.commons.math.ode.DerivativeException: org.apache.commons.math.MathException: org.apache.commons.math.ode.DerivativeException", strArray1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test14558() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest29.test14558");
        org.apache.commons.math.ode.SwitchingFunctionsHandler switchingFunctionsHandler0 = new org.apache.commons.math.ode.SwitchingFunctionsHandler();
        boolean boolean1 = switchingFunctionsHandler0.isEmpty();
        boolean boolean2 = switchingFunctionsHandler0.stop();
        boolean boolean3 = switchingFunctionsHandler0.isEmpty();
        org.apache.commons.math.ode.SwitchingFunctionsHandler switchingFunctionsHandler5 = new org.apache.commons.math.ode.SwitchingFunctionsHandler();
        boolean boolean6 = switchingFunctionsHandler5.isEmpty();
        org.apache.commons.math.ode.StepInterpolator stepInterpolator7 = null;
        boolean boolean8 = switchingFunctionsHandler5.evaluateStep(stepInterpolator7);
        org.apache.commons.math.ode.SwitchingFunctionsHandler switchingFunctionsHandler10 = new org.apache.commons.math.ode.SwitchingFunctionsHandler();
        boolean boolean11 = switchingFunctionsHandler10.isEmpty();
        double[] doubleArray14 = new double[] { 100.0d };
        boolean boolean15 = switchingFunctionsHandler10.reset((double) 0L, doubleArray14);
        switchingFunctionsHandler5.stepAccepted((double) (byte) 10, doubleArray14);
        boolean boolean17 = switchingFunctionsHandler0.reset(0.0d, doubleArray14);
        org.apache.commons.math.ode.StepInterpolator stepInterpolator18 = null;
        boolean boolean19 = switchingFunctionsHandler0.evaluateStep(stepInterpolator18);
        boolean boolean20 = switchingFunctionsHandler0.isEmpty();
        org.apache.commons.math.ode.StepInterpolator stepInterpolator21 = null;
        boolean boolean22 = switchingFunctionsHandler0.evaluateStep(stepInterpolator21);
        org.apache.commons.math.ode.StepInterpolator stepInterpolator23 = null;
        boolean boolean24 = switchingFunctionsHandler0.evaluateStep(stepInterpolator23);
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertNotNull(doubleArray14);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray14), "[100.0]");
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + true + "'", boolean20 == true);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
    }

    @Test
    public void test14559() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest29.test14559");
        org.apache.commons.math.FunctionEvaluationException functionEvaluationException3 = new org.apache.commons.math.FunctionEvaluationException((double) 'a', "org.apache.commons.math.FunctionEvaluationException: Evaluation failed for argument = -1");
        org.apache.commons.math.ConvergenceException convergenceException4 = new org.apache.commons.math.ConvergenceException("org.apache.commons.math.MathException: org.apache.commons.math.MathException: ", (java.lang.Throwable) functionEvaluationException3);
    }

    @Test
    public void test14560() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest29.test14560");
        java.lang.String[] strArray14 = new java.lang.String[] { "hi!", "org.apache.commons.math.MathException: hi!", "", "hi!", "org.apache.commons.math.MathException: hi!" };
        org.apache.commons.math.ode.DerivativeException derivativeException15 = new org.apache.commons.math.ode.DerivativeException("hi!", strArray14);
        org.apache.commons.math.MathException mathException16 = new org.apache.commons.math.MathException("hi!", (java.lang.Object[]) strArray14);
        org.apache.commons.math.ode.DerivativeException derivativeException17 = new org.apache.commons.math.ode.DerivativeException("", strArray14);
        org.apache.commons.math.FunctionEvaluationException functionEvaluationException18 = new org.apache.commons.math.FunctionEvaluationException((double) (byte) -1, "org.apache.commons.math.MathException: ", (java.lang.Object[]) strArray14);
        org.apache.commons.math.ode.DerivativeException derivativeException19 = new org.apache.commons.math.ode.DerivativeException("", strArray14);
        org.apache.commons.math.ode.DerivativeException derivativeException20 = new org.apache.commons.math.ode.DerivativeException("org.apache.commons.math.MathException: org.apache.commons.math.FunctionEvaluationException: org.apache.commons.math.ode.IntegratorException: org.apache.commons.math.MathException: ", strArray14);
        org.apache.commons.math.ode.DerivativeException derivativeException21 = new org.apache.commons.math.ode.DerivativeException("org.apache.commons.math.FunctionEvaluationException: org.apache.commons.math.ode.IntegratorException: org.apache.commons.math.ConvergenceException: org.apache.commons.math.MathException: ", strArray14);
        java.lang.Object[] objArray22 = derivativeException21.getArguments();
        java.lang.String[] strArray34 = new java.lang.String[] { "hi!", "org.apache.commons.math.MathException: hi!", "", "hi!", "org.apache.commons.math.MathException: hi!" };
        org.apache.commons.math.ode.DerivativeException derivativeException35 = new org.apache.commons.math.ode.DerivativeException("hi!", strArray34);
        org.apache.commons.math.ConvergenceException convergenceException36 = new org.apache.commons.math.ConvergenceException("", (java.lang.Object[]) strArray34);
        org.apache.commons.math.ConvergenceException convergenceException37 = new org.apache.commons.math.ConvergenceException("", (java.lang.Object[]) strArray34);
        org.apache.commons.math.FunctionEvaluationException functionEvaluationException38 = new org.apache.commons.math.FunctionEvaluationException((double) (short) -1, "org.apache.commons.math.MathException: org.apache.commons.math.MathException: ", (java.lang.Object[]) strArray34);
        org.apache.commons.math.ode.IntegratorException integratorException39 = new org.apache.commons.math.ode.IntegratorException("org.apache.commons.math.MathException: org.apache.commons.math.ConvergenceException: hi!", (java.lang.Object[]) strArray34);
        org.apache.commons.math.ConvergenceException convergenceException40 = new org.apache.commons.math.ConvergenceException("org.apache.commons.math.MathException: org.apache.commons.math.ode.IntegratorException: ", objArray22, (java.lang.Throwable) integratorException39);
        org.apache.commons.math.ode.DerivativeException derivativeException41 = new org.apache.commons.math.ode.DerivativeException((java.lang.Throwable) integratorException39);
        org.apache.commons.math.ode.DerivativeException derivativeException42 = new org.apache.commons.math.ode.DerivativeException((java.lang.Throwable) derivativeException41);
        org.junit.Assert.assertNotNull(strArray14);
        org.junit.Assert.assertNotNull(objArray22);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray22), "[hi!, org.apache.commons.math.MathException: hi!, , hi!, org.apache.commons.math.MathException: hi!]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray22), "[hi!, org.apache.commons.math.MathException: hi!, , hi!, org.apache.commons.math.MathException: hi!]");
        org.junit.Assert.assertNotNull(strArray34);
    }

    @Test
    public void test14561() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest29.test14561");
        java.lang.Object[] objArray9 = new java.lang.Object[] { 1L, 'a', 10L, 'a', (-1) };
        org.apache.commons.math.ConvergenceException convergenceException10 = new org.apache.commons.math.ConvergenceException("", objArray9);
        org.apache.commons.math.ode.DerivativeException derivativeException11 = new org.apache.commons.math.ode.DerivativeException((java.lang.Throwable) convergenceException10);
        java.lang.Throwable[] throwableArray12 = derivativeException11.getSuppressed();
        java.lang.String[] strArray21 = new java.lang.String[] { "hi!", "org.apache.commons.math.MathException: hi!", "", "hi!", "org.apache.commons.math.MathException: hi!" };
        org.apache.commons.math.ode.DerivativeException derivativeException22 = new org.apache.commons.math.ode.DerivativeException("hi!", strArray21);
        org.apache.commons.math.ConvergenceException convergenceException23 = new org.apache.commons.math.ConvergenceException("", (java.lang.Object[]) strArray21);
        org.apache.commons.math.ode.SwitchingFunctionsHandler switchingFunctionsHandler29 = new org.apache.commons.math.ode.SwitchingFunctionsHandler();
        java.lang.Object[] objArray38 = new java.lang.Object[] { 1L, 'a', 10L, 'a', (-1) };
        org.apache.commons.math.ConvergenceException convergenceException39 = new org.apache.commons.math.ConvergenceException("", objArray38);
        org.apache.commons.math.ode.IntegratorException integratorException40 = new org.apache.commons.math.ode.IntegratorException("org.apache.commons.math.MathException: hi!", objArray38);
        java.lang.Object[] objArray41 = new java.lang.Object[] { 2, switchingFunctionsHandler29, 1, objArray38 };
        org.apache.commons.math.ConvergenceException convergenceException44 = new org.apache.commons.math.ConvergenceException("hi!");
        org.apache.commons.math.MathException mathException45 = new org.apache.commons.math.MathException("hi!", (java.lang.Throwable) convergenceException44);
        org.apache.commons.math.FunctionEvaluationException functionEvaluationException46 = new org.apache.commons.math.FunctionEvaluationException((double) (short) 0, "org.apache.commons.math.MathException: hi!", objArray38, (java.lang.Throwable) mathException45);
        org.apache.commons.math.FunctionEvaluationException functionEvaluationException48 = new org.apache.commons.math.FunctionEvaluationException((double) 100L);
        org.apache.commons.math.ConvergenceException convergenceException49 = new org.apache.commons.math.ConvergenceException("org.apache.commons.math.MathException: hi!", objArray38, (java.lang.Throwable) functionEvaluationException48);
        org.apache.commons.math.FunctionEvaluationException functionEvaluationException51 = new org.apache.commons.math.FunctionEvaluationException((double) 100L);
        org.apache.commons.math.ConvergenceException convergenceException52 = new org.apache.commons.math.ConvergenceException("org.apache.commons.math.MathException: hi!", objArray38, (java.lang.Throwable) functionEvaluationException51);
        org.apache.commons.math.MathException mathException53 = new org.apache.commons.math.MathException("org.apache.commons.math.MathException: ", (java.lang.Object[]) strArray21, (java.lang.Throwable) functionEvaluationException51);
        org.apache.commons.math.MathException mathException54 = new org.apache.commons.math.MathException("", (java.lang.Object[]) throwableArray12, (java.lang.Throwable) mathException53);
        org.apache.commons.math.FunctionEvaluationException functionEvaluationException55 = new org.apache.commons.math.FunctionEvaluationException(0.0d, "org.apache.commons.math.ode.IntegratorException: hi!", (java.lang.Throwable) mathException54);
        double double56 = functionEvaluationException55.getArgument();
        org.apache.commons.math.ConvergenceException convergenceException57 = new org.apache.commons.math.ConvergenceException((java.lang.Throwable) functionEvaluationException55);
        org.apache.commons.math.ode.IntegratorException integratorException58 = new org.apache.commons.math.ode.IntegratorException((java.lang.Throwable) functionEvaluationException55);
        org.apache.commons.math.MathException mathException59 = new org.apache.commons.math.MathException((java.lang.Throwable) functionEvaluationException55);
        org.junit.Assert.assertNotNull(objArray9);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray9), "[1, a, 10, a, -1]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray9), "[1, a, 10, a, -1]");
        org.junit.Assert.assertNotNull(throwableArray12);
        org.junit.Assert.assertNotNull(strArray21);
        org.junit.Assert.assertNotNull(objArray38);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray38), "[1, a, 10, a, -1]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray38), "[1, a, 10, a, -1]");
        org.junit.Assert.assertNotNull(objArray41);
        org.junit.Assert.assertTrue("'" + double56 + "' != '" + 0.0d + "'", double56 == 0.0d);
    }

    @Test
    public void test14562() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest29.test14562");
        java.lang.Object[] objArray15 = new java.lang.Object[] { 1L, 'a', 10L, 'a', (-1) };
        org.apache.commons.math.ConvergenceException convergenceException16 = new org.apache.commons.math.ConvergenceException("", objArray15);
        org.apache.commons.math.ode.IntegratorException integratorException17 = new org.apache.commons.math.ode.IntegratorException("org.apache.commons.math.MathException: hi!", objArray15);
        org.apache.commons.math.MathException mathException18 = new org.apache.commons.math.MathException((java.lang.Throwable) integratorException17);
        java.lang.Throwable[] throwableArray19 = integratorException17.getSuppressed();
        org.apache.commons.math.FunctionEvaluationException functionEvaluationException20 = new org.apache.commons.math.FunctionEvaluationException((double) (byte) 100, "", (java.lang.Object[]) throwableArray19);
        org.apache.commons.math.FunctionEvaluationException functionEvaluationException21 = new org.apache.commons.math.FunctionEvaluationException(97.0d, "org.apache.commons.math.FunctionEvaluationException: Evaluation failed for argument = {0}", (java.lang.Object[]) throwableArray19);
        java.lang.Throwable[] throwableArray22 = functionEvaluationException21.getSuppressed();
        org.apache.commons.math.ConvergenceException convergenceException23 = new org.apache.commons.math.ConvergenceException("org.apache.commons.math.FunctionEvaluationException: org.apache.commons.math.FunctionEvaluationException: org.apache.commons.math.FunctionEvaluationException: Evaluation failed for argument = {0}", (java.lang.Object[]) throwableArray22);
        org.apache.commons.math.FunctionEvaluationException functionEvaluationException27 = new org.apache.commons.math.FunctionEvaluationException((double) '4');
        double double28 = functionEvaluationException27.getArgument();
        org.apache.commons.math.ConvergenceException convergenceException29 = new org.apache.commons.math.ConvergenceException((java.lang.Throwable) functionEvaluationException27);
        org.apache.commons.math.MathException mathException30 = new org.apache.commons.math.MathException("org.apache.commons.math.FunctionEvaluationException: org.apache.commons.math.MathException: hi!", (java.lang.Throwable) convergenceException29);
        org.apache.commons.math.ConvergenceException convergenceException31 = new org.apache.commons.math.ConvergenceException("org.apache.commons.math.ode.IntegratorException: org.apache.commons.math.MathException: hi!", (java.lang.Throwable) mathException30);
        org.apache.commons.math.ConvergenceException convergenceException32 = new org.apache.commons.math.ConvergenceException("hi!", (java.lang.Object[]) throwableArray22, (java.lang.Throwable) mathException30);
        java.lang.String[] strArray46 = new java.lang.String[] { "hi!", "org.apache.commons.math.MathException: hi!", "", "hi!", "org.apache.commons.math.MathException: hi!" };
        org.apache.commons.math.ode.DerivativeException derivativeException47 = new org.apache.commons.math.ode.DerivativeException("hi!", strArray46);
        org.apache.commons.math.ode.IntegratorException integratorException48 = new org.apache.commons.math.ode.IntegratorException("", (java.lang.Object[]) strArray46);
        org.apache.commons.math.ode.DerivativeException derivativeException49 = new org.apache.commons.math.ode.DerivativeException("hi!", strArray46);
        org.apache.commons.math.ode.DerivativeException derivativeException50 = new org.apache.commons.math.ode.DerivativeException("org.apache.commons.math.ode.DerivativeException: org.apache.commons.math.MathException: ", strArray46);
        org.apache.commons.math.FunctionEvaluationException functionEvaluationException51 = new org.apache.commons.math.FunctionEvaluationException(0.0d, "org.apache.commons.math.FunctionEvaluationException: org.apache.commons.math.ode.IntegratorException: hi!", (java.lang.Object[]) strArray46);
        org.apache.commons.math.FunctionEvaluationException functionEvaluationException56 = new org.apache.commons.math.FunctionEvaluationException((double) (byte) 100);
        org.apache.commons.math.ConvergenceException convergenceException57 = new org.apache.commons.math.ConvergenceException((java.lang.Throwable) functionEvaluationException56);
        org.apache.commons.math.MathException mathException58 = new org.apache.commons.math.MathException("org.apache.commons.math.FunctionEvaluationException: Evaluation failed for argument = 35", (java.lang.Throwable) functionEvaluationException56);
        org.apache.commons.math.FunctionEvaluationException functionEvaluationException59 = new org.apache.commons.math.FunctionEvaluationException((double) (short) 0, (java.lang.Throwable) functionEvaluationException56);
        org.apache.commons.math.ode.DerivativeException derivativeException60 = new org.apache.commons.math.ode.DerivativeException((java.lang.Throwable) functionEvaluationException56);
        java.lang.Throwable[] throwableArray61 = derivativeException60.getSuppressed();
        org.apache.commons.math.ode.IntegratorException integratorException62 = new org.apache.commons.math.ode.IntegratorException("org.apache.commons.math.ode.DerivativeException: org.apache.commons.math.MathException: org.apache.commons.math.MathException: org.apache.commons.math.FunctionEvaluationException: hi!", (java.lang.Object[]) throwableArray61);
        org.apache.commons.math.FunctionEvaluationException functionEvaluationException63 = new org.apache.commons.math.FunctionEvaluationException((double) (short) 1, "org.apache.commons.math.ode.IntegratorException: org.apache.commons.math.FunctionEvaluationException: hi!", (java.lang.Object[]) strArray46, (java.lang.Throwable) integratorException62);
        org.apache.commons.math.MathException mathException64 = new org.apache.commons.math.MathException("org.apache.commons.math.ConvergenceException: org.apache.commons.math.ode.IntegratorException: Evaluation failed for argument = hi!", (java.lang.Object[]) throwableArray22, (java.lang.Throwable) integratorException62);
        java.lang.Throwable[] throwableArray65 = integratorException62.getSuppressed();
        org.apache.commons.math.FunctionEvaluationException functionEvaluationException68 = new org.apache.commons.math.FunctionEvaluationException(3.0d, "org.apache.commons.math.FunctionEvaluationException: org.apache.commons.math.FunctionEvaluationException: org.apache.commons.math.MathException");
        org.apache.commons.math.ConvergenceException convergenceException69 = new org.apache.commons.math.ConvergenceException("org.apache.commons.math.MathException: org.apache.commons.math.MathException: ", (java.lang.Object[]) throwableArray65, (java.lang.Throwable) functionEvaluationException68);
        org.junit.Assert.assertNotNull(objArray15);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray15), "[1, a, 10, a, -1]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray15), "[1, a, 10, a, -1]");
        org.junit.Assert.assertNotNull(throwableArray19);
        org.junit.Assert.assertNotNull(throwableArray22);
        org.junit.Assert.assertTrue("'" + double28 + "' != '" + 52.0d + "'", double28 == 52.0d);
        org.junit.Assert.assertNotNull(strArray46);
        org.junit.Assert.assertNotNull(throwableArray61);
        org.junit.Assert.assertNotNull(throwableArray65);
    }

    @Test
    public void test14563() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest29.test14563");
        java.lang.String[] strArray17 = new java.lang.String[] { "hi!", "org.apache.commons.math.MathException: hi!", "", "hi!", "org.apache.commons.math.MathException: hi!" };
        org.apache.commons.math.ode.DerivativeException derivativeException18 = new org.apache.commons.math.ode.DerivativeException("hi!", strArray17);
        org.apache.commons.math.ConvergenceException convergenceException19 = new org.apache.commons.math.ConvergenceException("org.apache.commons.math.FunctionEvaluationException: hi!", (java.lang.Object[]) strArray17);
        org.apache.commons.math.FunctionEvaluationException functionEvaluationException21 = new org.apache.commons.math.FunctionEvaluationException((double) '4');
        org.apache.commons.math.ConvergenceException convergenceException22 = new org.apache.commons.math.ConvergenceException((java.lang.Throwable) functionEvaluationException21);
        org.apache.commons.math.FunctionEvaluationException functionEvaluationException23 = new org.apache.commons.math.FunctionEvaluationException((double) (byte) 0, "org.apache.commons.math.FunctionEvaluationException: Evaluation failed for argument = -1", (java.lang.Object[]) strArray17, (java.lang.Throwable) functionEvaluationException21);
        org.apache.commons.math.ConvergenceException convergenceException24 = new org.apache.commons.math.ConvergenceException("org.apache.commons.math.ode.DerivativeException", (java.lang.Object[]) strArray17);
        org.apache.commons.math.FunctionEvaluationException functionEvaluationException25 = new org.apache.commons.math.FunctionEvaluationException((double) (short) -1, "org.apache.commons.math.FunctionEvaluationException: org.apache.commons.math.ode.IntegratorException: ", (java.lang.Object[]) strArray17);
        org.apache.commons.math.ode.DerivativeException derivativeException26 = new org.apache.commons.math.ode.DerivativeException("org.apache.commons.math.ConvergenceException: org.apache.commons.math.MathException: org.apache.commons.math.FunctionEvaluationException: org.apache.commons.math.MathException: hi!", strArray17);
        org.apache.commons.math.ode.DerivativeException derivativeException27 = new org.apache.commons.math.ode.DerivativeException("org.apache.commons.math.ode.DerivativeException: Evaluation failed for argument = 52", strArray17);
        org.apache.commons.math.ConvergenceException convergenceException28 = new org.apache.commons.math.ConvergenceException("org.apache.commons.math.FunctionEvaluationException: org.apache.commons.math.MathException: org.apache.commons.math.MathException: ", (java.lang.Object[]) strArray17);
        org.apache.commons.math.ode.DerivativeException derivativeException29 = new org.apache.commons.math.ode.DerivativeException("org.apache.commons.math.ode.DerivativeException: org.apache.commons.math.ode.IntegratorException: org.apache.commons.math.MathException: hi!", strArray17);
        org.apache.commons.math.ode.DerivativeException derivativeException30 = new org.apache.commons.math.ode.DerivativeException("", strArray17);
        org.junit.Assert.assertNotNull(strArray17);
    }

    @Test
    public void test14564() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest29.test14564");
        java.lang.Throwable throwable4 = null;
        org.apache.commons.math.MathException mathException5 = new org.apache.commons.math.MathException("hi!", throwable4);
        org.apache.commons.math.MathException mathException6 = new org.apache.commons.math.MathException("org.apache.commons.math.MathException: hi!", throwable4);
        org.apache.commons.math.ode.IntegratorException integratorException7 = new org.apache.commons.math.ode.IntegratorException(throwable4);
        java.lang.String str8 = integratorException7.getPattern();
        org.apache.commons.math.FunctionEvaluationException functionEvaluationException9 = new org.apache.commons.math.FunctionEvaluationException((double) 10.0f, "org.apache.commons.math.FunctionEvaluationException: org.apache.commons.math.ConvergenceException: org.apache.commons.math.FunctionEvaluationException: hi!", (java.lang.Throwable) integratorException7);
        org.apache.commons.math.ConvergenceException convergenceException10 = new org.apache.commons.math.ConvergenceException((java.lang.Throwable) functionEvaluationException9);
        org.apache.commons.math.MathException mathException11 = new org.apache.commons.math.MathException((java.lang.Throwable) convergenceException10);
        org.junit.Assert.assertNull(str8);
    }

    @Test
    public void test14565() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest29.test14565");
        org.apache.commons.math.ode.SwitchingFunctionsHandler switchingFunctionsHandler7 = new org.apache.commons.math.ode.SwitchingFunctionsHandler();
        java.lang.Object[] objArray16 = new java.lang.Object[] { 1L, 'a', 10L, 'a', (-1) };
        org.apache.commons.math.ConvergenceException convergenceException17 = new org.apache.commons.math.ConvergenceException("", objArray16);
        org.apache.commons.math.ode.IntegratorException integratorException18 = new org.apache.commons.math.ode.IntegratorException("org.apache.commons.math.MathException: hi!", objArray16);
        java.lang.Object[] objArray19 = new java.lang.Object[] { 2, switchingFunctionsHandler7, 1, objArray16 };
        org.apache.commons.math.ConvergenceException convergenceException22 = new org.apache.commons.math.ConvergenceException("hi!");
        org.apache.commons.math.MathException mathException23 = new org.apache.commons.math.MathException("hi!", (java.lang.Throwable) convergenceException22);
        org.apache.commons.math.FunctionEvaluationException functionEvaluationException24 = new org.apache.commons.math.FunctionEvaluationException((double) (short) 0, "org.apache.commons.math.MathException: hi!", objArray16, (java.lang.Throwable) mathException23);
        org.apache.commons.math.MathException mathException25 = new org.apache.commons.math.MathException("org.apache.commons.math.MathException: ", objArray16);
        org.apache.commons.math.MathException mathException26 = new org.apache.commons.math.MathException("org.apache.commons.math.FunctionEvaluationException: hi!", objArray16);
        org.apache.commons.math.ode.IntegratorException integratorException27 = new org.apache.commons.math.ode.IntegratorException("Evaluation failed for argument = {0}", objArray16);
        java.lang.String[] strArray40 = new java.lang.String[] { "hi!", "org.apache.commons.math.MathException: hi!", "", "hi!", "org.apache.commons.math.MathException: hi!" };
        org.apache.commons.math.ode.DerivativeException derivativeException41 = new org.apache.commons.math.ode.DerivativeException("hi!", strArray40);
        org.apache.commons.math.ode.IntegratorException integratorException42 = new org.apache.commons.math.ode.IntegratorException("", (java.lang.Object[]) strArray40);
        org.apache.commons.math.ode.DerivativeException derivativeException43 = new org.apache.commons.math.ode.DerivativeException("hi!", strArray40);
        org.apache.commons.math.ode.IntegratorException integratorException44 = new org.apache.commons.math.ode.IntegratorException("org.apache.commons.math.MathException: Evaluation failed for argument = 52", (java.lang.Object[]) strArray40);
        org.apache.commons.math.ode.DerivativeException derivativeException45 = new org.apache.commons.math.ode.DerivativeException("org.apache.commons.math.ode.DerivativeException: org.apache.commons.math.MathException: ", strArray40);
        java.lang.String[] strArray56 = new java.lang.String[] { "hi!", "org.apache.commons.math.MathException: hi!", "", "hi!", "org.apache.commons.math.MathException: hi!" };
        org.apache.commons.math.ode.DerivativeException derivativeException57 = new org.apache.commons.math.ode.DerivativeException("hi!", strArray56);
        org.apache.commons.math.ode.IntegratorException integratorException58 = new org.apache.commons.math.ode.IntegratorException("", (java.lang.Object[]) strArray56);
        org.apache.commons.math.ode.DerivativeException derivativeException59 = new org.apache.commons.math.ode.DerivativeException("hi!", strArray56);
        org.apache.commons.math.ode.DerivativeException derivativeException60 = new org.apache.commons.math.ode.DerivativeException("org.apache.commons.math.MathException: hi!", strArray56);
        java.lang.Object[] objArray64 = new java.lang.Object[] { (-1L) };
        java.lang.Object[] objArray72 = new java.lang.Object[] { 1L, 'a', 10L, 'a', (-1) };
        org.apache.commons.math.ConvergenceException convergenceException73 = new org.apache.commons.math.ConvergenceException("", objArray72);
        org.apache.commons.math.ode.IntegratorException integratorException74 = new org.apache.commons.math.ode.IntegratorException("org.apache.commons.math.MathException: hi!", objArray72);
        org.apache.commons.math.MathException mathException75 = new org.apache.commons.math.MathException((java.lang.Throwable) integratorException74);
        org.apache.commons.math.ConvergenceException convergenceException76 = new org.apache.commons.math.ConvergenceException("hi!", objArray64, (java.lang.Throwable) mathException75);
        org.apache.commons.math.ConvergenceException convergenceException77 = new org.apache.commons.math.ConvergenceException("org.apache.commons.math.MathException: ", (java.lang.Throwable) mathException75);
        org.apache.commons.math.ConvergenceException convergenceException78 = new org.apache.commons.math.ConvergenceException("hi!", (java.lang.Object[]) strArray56, (java.lang.Throwable) mathException75);
        org.apache.commons.math.ConvergenceException convergenceException79 = new org.apache.commons.math.ConvergenceException("Evaluation failed for argument = {0}", (java.lang.Object[]) strArray40, (java.lang.Throwable) mathException75);
        java.lang.Object[] objArray80 = mathException75.getArguments();
        org.apache.commons.math.ConvergenceException convergenceException81 = new org.apache.commons.math.ConvergenceException("org.apache.commons.math.MathException: org.apache.commons.math.FunctionEvaluationException: org.apache.commons.math.MathException: hi!", (java.lang.Throwable) mathException75);
        org.apache.commons.math.ConvergenceException convergenceException82 = new org.apache.commons.math.ConvergenceException("org.apache.commons.math.FunctionEvaluationException: Evaluation failed for argument = 0", objArray16, (java.lang.Throwable) mathException75);
        org.apache.commons.math.ode.DerivativeException derivativeException83 = new org.apache.commons.math.ode.DerivativeException((java.lang.Throwable) convergenceException82);
        org.apache.commons.math.ConvergenceException convergenceException84 = new org.apache.commons.math.ConvergenceException((java.lang.Throwable) convergenceException82);
        org.junit.Assert.assertNotNull(objArray16);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray16), "[1, a, 10, a, -1]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray16), "[1, a, 10, a, -1]");
        org.junit.Assert.assertNotNull(objArray19);
        org.junit.Assert.assertNotNull(strArray40);
        org.junit.Assert.assertNotNull(strArray56);
        org.junit.Assert.assertNotNull(objArray64);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray64), "[-1]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray64), "[-1]");
        org.junit.Assert.assertNotNull(objArray72);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray72), "[1, a, 10, a, -1]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray72), "[1, a, 10, a, -1]");
        org.junit.Assert.assertNotNull(objArray80);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray80), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray80), "[]");
    }

    @Test
    public void test14566() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest29.test14566");
        org.apache.commons.math.ode.SwitchingFunctionsHandler switchingFunctionsHandler0 = new org.apache.commons.math.ode.SwitchingFunctionsHandler();
        boolean boolean1 = switchingFunctionsHandler0.isEmpty();
        boolean boolean2 = switchingFunctionsHandler0.stop();
        boolean boolean3 = switchingFunctionsHandler0.isEmpty();
        org.apache.commons.math.ode.SwitchingFunctionsHandler switchingFunctionsHandler5 = new org.apache.commons.math.ode.SwitchingFunctionsHandler();
        org.apache.commons.math.ode.SwitchingFunction switchingFunction6 = null;
        switchingFunctionsHandler5.add(switchingFunction6, (double) (-1), (double) 3, 0);
        double[] doubleArray18 = new double[] { 0L, 10.0d, 'a', 0.0d, (-1.0d), 0 };
        boolean boolean19 = switchingFunctionsHandler5.reset((double) (-1), doubleArray18);
        boolean boolean20 = switchingFunctionsHandler5.isEmpty();
        boolean boolean21 = switchingFunctionsHandler5.isEmpty();
        org.apache.commons.math.ode.SwitchingFunction switchingFunction22 = null;
        switchingFunctionsHandler5.add(switchingFunction22, (double) (byte) 0, 0.0d, (int) ' ');
        double[] doubleArray31 = new double[] { 1.0f, (-1.0f), 100.0d };
        boolean boolean32 = switchingFunctionsHandler5.reset((double) 1L, doubleArray31);
        switchingFunctionsHandler0.stepAccepted(52.0d, doubleArray31);
        org.apache.commons.math.ode.StepInterpolator stepInterpolator34 = null;
        boolean boolean35 = switchingFunctionsHandler0.evaluateStep(stepInterpolator34);
        boolean boolean36 = switchingFunctionsHandler0.stop();
        double double37 = switchingFunctionsHandler0.getEventTime();
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertNotNull(doubleArray18);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray18), "[0.0, 10.0, 97.0, 0.0, -1.0, 0.0]");
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertNotNull(doubleArray31);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray31), "[1.0, -1.0, 100.0]");
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + false + "'", boolean32 == false);
        org.junit.Assert.assertTrue("'" + boolean35 + "' != '" + false + "'", boolean35 == false);
        org.junit.Assert.assertTrue("'" + boolean36 + "' != '" + false + "'", boolean36 == false);
        org.junit.Assert.assertTrue(Double.isNaN(double37));
    }

    @Test
    public void test14567() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest29.test14567");
        org.apache.commons.math.ode.SwitchingFunctionsHandler switchingFunctionsHandler0 = new org.apache.commons.math.ode.SwitchingFunctionsHandler();
        boolean boolean1 = switchingFunctionsHandler0.isEmpty();
        double[] doubleArray4 = new double[] { 100.0d };
        boolean boolean5 = switchingFunctionsHandler0.reset((double) 0L, doubleArray4);
        org.apache.commons.math.ode.SwitchingFunctionsHandler switchingFunctionsHandler7 = new org.apache.commons.math.ode.SwitchingFunctionsHandler();
        boolean boolean8 = switchingFunctionsHandler7.isEmpty();
        org.apache.commons.math.ode.StepInterpolator stepInterpolator9 = null;
        boolean boolean10 = switchingFunctionsHandler7.evaluateStep(stepInterpolator9);
        org.apache.commons.math.ode.SwitchingFunctionsHandler switchingFunctionsHandler12 = new org.apache.commons.math.ode.SwitchingFunctionsHandler();
        boolean boolean13 = switchingFunctionsHandler12.isEmpty();
        double[] doubleArray16 = new double[] { 100.0d };
        boolean boolean17 = switchingFunctionsHandler12.reset((double) 0L, doubleArray16);
        boolean boolean18 = switchingFunctionsHandler7.reset((double) 1, doubleArray16);
        boolean boolean19 = switchingFunctionsHandler0.reset((double) 100, doubleArray16);
        double double20 = switchingFunctionsHandler0.getEventTime();
        boolean boolean21 = switchingFunctionsHandler0.stop();
        boolean boolean22 = switchingFunctionsHandler0.isEmpty();
        double double23 = switchingFunctionsHandler0.getEventTime();
        boolean boolean24 = switchingFunctionsHandler0.stop();
        org.apache.commons.math.ode.StepInterpolator stepInterpolator25 = null;
        boolean boolean26 = switchingFunctionsHandler0.evaluateStep(stepInterpolator25);
        double double27 = switchingFunctionsHandler0.getEventTime();
        boolean boolean28 = switchingFunctionsHandler0.stop();
        org.apache.commons.math.ode.StepInterpolator stepInterpolator29 = null;
        boolean boolean30 = switchingFunctionsHandler0.evaluateStep(stepInterpolator29);
        boolean boolean31 = switchingFunctionsHandler0.stop();
        org.apache.commons.math.ode.StepInterpolator stepInterpolator32 = null;
        boolean boolean33 = switchingFunctionsHandler0.evaluateStep(stepInterpolator32);
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertNotNull(doubleArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray4), "[100.0]");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertNotNull(doubleArray16);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray16), "[100.0]");
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertTrue(Double.isNaN(double20));
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + true + "'", boolean22 == true);
        org.junit.Assert.assertTrue(Double.isNaN(double23));
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
        org.junit.Assert.assertTrue(Double.isNaN(double27));
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + false + "'", boolean28 == false);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + false + "'", boolean30 == false);
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + false + "'", boolean31 == false);
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + false + "'", boolean33 == false);
    }

    @Test
    public void test14568() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest29.test14568");
        org.apache.commons.math.ode.SwitchingFunctionsHandler switchingFunctionsHandler0 = new org.apache.commons.math.ode.SwitchingFunctionsHandler();
        boolean boolean1 = switchingFunctionsHandler0.isEmpty();
        org.apache.commons.math.ode.StepInterpolator stepInterpolator2 = null;
        boolean boolean3 = switchingFunctionsHandler0.evaluateStep(stepInterpolator2);
        org.apache.commons.math.ode.SwitchingFunctionsHandler switchingFunctionsHandler5 = new org.apache.commons.math.ode.SwitchingFunctionsHandler();
        boolean boolean6 = switchingFunctionsHandler5.isEmpty();
        double[] doubleArray9 = new double[] { 100.0d };
        boolean boolean10 = switchingFunctionsHandler5.reset((double) 0L, doubleArray9);
        switchingFunctionsHandler0.stepAccepted((double) (byte) 10, doubleArray9);
        org.apache.commons.math.ode.SwitchingFunctionsHandler switchingFunctionsHandler13 = new org.apache.commons.math.ode.SwitchingFunctionsHandler();
        boolean boolean14 = switchingFunctionsHandler13.isEmpty();
        double[] doubleArray17 = new double[] { 100.0d };
        boolean boolean18 = switchingFunctionsHandler13.reset((double) 0L, doubleArray17);
        switchingFunctionsHandler0.stepAccepted(100.0d, doubleArray17);
        org.apache.commons.math.ode.StepInterpolator stepInterpolator20 = null;
        boolean boolean21 = switchingFunctionsHandler0.evaluateStep(stepInterpolator20);
        org.apache.commons.math.ode.StepInterpolator stepInterpolator22 = null;
        boolean boolean23 = switchingFunctionsHandler0.evaluateStep(stepInterpolator22);
        double double24 = switchingFunctionsHandler0.getEventTime();
        double double25 = switchingFunctionsHandler0.getEventTime();
        org.apache.commons.math.ode.SwitchingFunction switchingFunction26 = null;
        switchingFunctionsHandler0.add(switchingFunction26, (double) 100L, 1.0d, (int) (byte) -1);
        boolean boolean31 = switchingFunctionsHandler0.isEmpty();
        org.apache.commons.math.ode.SwitchingFunction switchingFunction32 = null;
        switchingFunctionsHandler0.add(switchingFunction32, (double) 0, Double.NaN, (int) (short) -1);
        boolean boolean37 = switchingFunctionsHandler0.stop();
        double double38 = switchingFunctionsHandler0.getEventTime();
        double double39 = switchingFunctionsHandler0.getEventTime();
        boolean boolean40 = switchingFunctionsHandler0.stop();
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertNotNull(doubleArray9);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray9), "[100.0]");
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertNotNull(doubleArray17);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray17), "[100.0]");
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertTrue(Double.isNaN(double24));
        org.junit.Assert.assertTrue(Double.isNaN(double25));
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + false + "'", boolean31 == false);
        org.junit.Assert.assertTrue("'" + boolean37 + "' != '" + false + "'", boolean37 == false);
        org.junit.Assert.assertTrue(Double.isNaN(double38));
        org.junit.Assert.assertTrue(Double.isNaN(double39));
        org.junit.Assert.assertTrue("'" + boolean40 + "' != '" + false + "'", boolean40 == false);
    }

    @Test
    public void test14569() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest29.test14569");
        org.apache.commons.math.FunctionEvaluationException functionEvaluationException4 = new org.apache.commons.math.FunctionEvaluationException((double) 100.0f, "org.apache.commons.math.ode.IntegratorException: ");
        org.apache.commons.math.ConvergenceException convergenceException5 = new org.apache.commons.math.ConvergenceException("org.apache.commons.math.ode.DerivativeException: ", (java.lang.Throwable) functionEvaluationException4);
        org.apache.commons.math.MathException mathException6 = new org.apache.commons.math.MathException("org.apache.commons.math.MathException: org.apache.commons.math.ConvergenceException: org.apache.commons.math.FunctionEvaluationException: Evaluation failed for argument = -1", (java.lang.Throwable) convergenceException5);
    }

    @Test
    public void test14570() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest29.test14570");
        org.apache.commons.math.FunctionEvaluationException functionEvaluationException10 = new org.apache.commons.math.FunctionEvaluationException((double) '4');
        org.apache.commons.math.MathException mathException11 = new org.apache.commons.math.MathException((java.lang.Throwable) functionEvaluationException10);
        org.apache.commons.math.ConvergenceException convergenceException12 = new org.apache.commons.math.ConvergenceException("org.apache.commons.math.ode.IntegratorException: ", (java.lang.Throwable) functionEvaluationException10);
        org.apache.commons.math.ConvergenceException convergenceException16 = new org.apache.commons.math.ConvergenceException("hi!");
        org.apache.commons.math.MathException mathException17 = new org.apache.commons.math.MathException("hi!", (java.lang.Throwable) convergenceException16);
        java.lang.Object[] objArray18 = mathException17.getArguments();
        org.apache.commons.math.ConvergenceException convergenceException19 = new org.apache.commons.math.ConvergenceException("org.apache.commons.math.FunctionEvaluationException: hi!", objArray18);
        functionEvaluationException10.addSuppressed((java.lang.Throwable) convergenceException19);
        java.lang.Throwable[] throwableArray21 = convergenceException19.getSuppressed();
        org.apache.commons.math.ConvergenceException convergenceException29 = new org.apache.commons.math.ConvergenceException("hi!");
        org.apache.commons.math.MathException mathException30 = new org.apache.commons.math.MathException("hi!", (java.lang.Throwable) convergenceException29);
        java.lang.Object[] objArray31 = mathException30.getArguments();
        java.lang.Throwable throwable32 = null;
        org.apache.commons.math.ConvergenceException convergenceException33 = new org.apache.commons.math.ConvergenceException("hi!", objArray31, throwable32);
        org.apache.commons.math.FunctionEvaluationException functionEvaluationException34 = new org.apache.commons.math.FunctionEvaluationException((double) 1L, "", objArray31);
        org.apache.commons.math.ode.IntegratorException integratorException35 = new org.apache.commons.math.ode.IntegratorException("", objArray31);
        org.apache.commons.math.ConvergenceException convergenceException41 = new org.apache.commons.math.ConvergenceException("hi!");
        org.apache.commons.math.MathException mathException42 = new org.apache.commons.math.MathException("hi!", (java.lang.Throwable) convergenceException41);
        java.lang.Object[] objArray43 = mathException42.getArguments();
        java.lang.Throwable throwable44 = null;
        org.apache.commons.math.ConvergenceException convergenceException45 = new org.apache.commons.math.ConvergenceException("hi!", objArray43, throwable44);
        org.apache.commons.math.ode.IntegratorException integratorException46 = new org.apache.commons.math.ode.IntegratorException("hi!", objArray43);
        org.apache.commons.math.ConvergenceException convergenceException49 = new org.apache.commons.math.ConvergenceException("hi!");
        org.apache.commons.math.MathException mathException50 = new org.apache.commons.math.MathException("hi!", (java.lang.Throwable) convergenceException49);
        java.lang.Throwable[] throwableArray51 = convergenceException49.getSuppressed();
        org.apache.commons.math.ode.DerivativeException derivativeException52 = new org.apache.commons.math.ode.DerivativeException((java.lang.Throwable) convergenceException49);
        org.apache.commons.math.ConvergenceException convergenceException53 = new org.apache.commons.math.ConvergenceException("org.apache.commons.math.ode.IntegratorException: hi!", objArray43, (java.lang.Throwable) convergenceException49);
        org.apache.commons.math.MathException mathException54 = new org.apache.commons.math.MathException("org.apache.commons.math.MathException: ", objArray31, (java.lang.Throwable) convergenceException49);
        org.apache.commons.math.FunctionEvaluationException functionEvaluationException55 = new org.apache.commons.math.FunctionEvaluationException(52.0d, "org.apache.commons.math.ode.IntegratorException: hi!", (java.lang.Object[]) throwableArray21, (java.lang.Throwable) convergenceException49);
        org.apache.commons.math.MathException mathException56 = new org.apache.commons.math.MathException("org.apache.commons.math.FunctionEvaluationException: org.apache.commons.math.ode.IntegratorException: org.apache.commons.math.MathException: ", (java.lang.Throwable) convergenceException49);
        java.lang.Object[] objArray57 = mathException56.getArguments();
        org.apache.commons.math.ConvergenceException convergenceException66 = new org.apache.commons.math.ConvergenceException("hi!");
        org.apache.commons.math.MathException mathException67 = new org.apache.commons.math.MathException("hi!", (java.lang.Throwable) convergenceException66);
        java.lang.Object[] objArray68 = mathException67.getArguments();
        java.lang.Throwable throwable69 = null;
        org.apache.commons.math.ConvergenceException convergenceException70 = new org.apache.commons.math.ConvergenceException("hi!", objArray68, throwable69);
        org.apache.commons.math.FunctionEvaluationException functionEvaluationException71 = new org.apache.commons.math.FunctionEvaluationException((double) 1L, "", objArray68);
        org.apache.commons.math.ode.IntegratorException integratorException72 = new org.apache.commons.math.ode.IntegratorException("", objArray68);
        java.lang.Throwable throwable73 = null;
        org.apache.commons.math.FunctionEvaluationException functionEvaluationException74 = new org.apache.commons.math.FunctionEvaluationException(1.0d, "hi!", objArray68, throwable73);
        java.lang.Object[] objArray75 = functionEvaluationException74.getArguments();
        double double76 = functionEvaluationException74.getArgument();
        org.apache.commons.math.FunctionEvaluationException functionEvaluationException77 = new org.apache.commons.math.FunctionEvaluationException(97.0d, "org.apache.commons.math.MathException: org.apache.commons.math.FunctionEvaluationException: org.apache.commons.math.MathException: ", objArray57, (java.lang.Throwable) functionEvaluationException74);
        org.apache.commons.math.FunctionEvaluationException functionEvaluationException78 = new org.apache.commons.math.FunctionEvaluationException((double) ' ', "org.apache.commons.math.ConvergenceException: org.apache.commons.math.FunctionEvaluationException: Evaluation failed for argument = -1", (java.lang.Throwable) functionEvaluationException74);
        org.apache.commons.math.MathException mathException79 = new org.apache.commons.math.MathException("org.apache.commons.math.MathException: org.apache.commons.math.ConvergenceException: hi!", (java.lang.Throwable) functionEvaluationException78);
        org.junit.Assert.assertNotNull(objArray18);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray18), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray18), "[]");
        org.junit.Assert.assertNotNull(throwableArray21);
        org.junit.Assert.assertNotNull(objArray31);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray31), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray31), "[]");
        org.junit.Assert.assertNotNull(objArray43);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray43), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray43), "[]");
        org.junit.Assert.assertNotNull(throwableArray51);
        org.junit.Assert.assertNotNull(objArray57);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray57), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray57), "[]");
        org.junit.Assert.assertNotNull(objArray68);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray68), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray68), "[]");
        org.junit.Assert.assertNotNull(objArray75);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray75), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray75), "[]");
        org.junit.Assert.assertTrue("'" + double76 + "' != '" + 1.0d + "'", double76 == 1.0d);
    }

    @Test
    public void test14571() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest29.test14571");
        org.apache.commons.math.FunctionEvaluationException functionEvaluationException3 = new org.apache.commons.math.FunctionEvaluationException((double) (-1.0f));
        org.apache.commons.math.FunctionEvaluationException functionEvaluationException5 = new org.apache.commons.math.FunctionEvaluationException((double) (short) -1);
        org.apache.commons.math.ode.IntegratorException integratorException6 = new org.apache.commons.math.ode.IntegratorException((java.lang.Throwable) functionEvaluationException5);
        java.lang.Throwable[] throwableArray7 = functionEvaluationException5.getSuppressed();
        functionEvaluationException3.addSuppressed((java.lang.Throwable) functionEvaluationException5);
        java.lang.Throwable[] throwableArray9 = functionEvaluationException5.getSuppressed();
        java.lang.Object[] objArray16 = new java.lang.Object[] { 100.0f, (byte) 10 };
        org.apache.commons.math.MathException mathException17 = new org.apache.commons.math.MathException("org.apache.commons.math.MathException: hi!", objArray16);
        java.lang.Object[] objArray28 = new java.lang.Object[] { 1L, 'a', 10L, 'a', (-1) };
        org.apache.commons.math.ConvergenceException convergenceException29 = new org.apache.commons.math.ConvergenceException("", objArray28);
        org.apache.commons.math.FunctionEvaluationException functionEvaluationException30 = new org.apache.commons.math.FunctionEvaluationException((-1.0d), "", objArray28);
        org.apache.commons.math.ode.IntegratorException integratorException31 = new org.apache.commons.math.ode.IntegratorException("hi!", objArray28);
        org.apache.commons.math.FunctionEvaluationException functionEvaluationException34 = new org.apache.commons.math.FunctionEvaluationException((double) (short) 1, "");
        org.apache.commons.math.MathException mathException35 = new org.apache.commons.math.MathException("", objArray28, (java.lang.Throwable) functionEvaluationException34);
        org.apache.commons.math.MathException mathException36 = new org.apache.commons.math.MathException((java.lang.Throwable) functionEvaluationException34);
        org.apache.commons.math.ConvergenceException convergenceException37 = new org.apache.commons.math.ConvergenceException("", objArray16, (java.lang.Throwable) mathException36);
        org.apache.commons.math.FunctionEvaluationException functionEvaluationException38 = new org.apache.commons.math.FunctionEvaluationException((double) (byte) 1, "", (java.lang.Throwable) convergenceException37);
        org.apache.commons.math.ode.DerivativeException derivativeException39 = new org.apache.commons.math.ode.DerivativeException((java.lang.Throwable) functionEvaluationException38);
        org.apache.commons.math.FunctionEvaluationException functionEvaluationException40 = new org.apache.commons.math.FunctionEvaluationException((double) (byte) 1, "org.apache.commons.math.MathException: org.apache.commons.math.MathException: org.apache.commons.math.ode.IntegratorException: org.apache.commons.math.FunctionEvaluationException: hi!", (java.lang.Object[]) throwableArray9, (java.lang.Throwable) functionEvaluationException38);
        org.junit.Assert.assertNotNull(throwableArray7);
        org.junit.Assert.assertNotNull(throwableArray9);
        org.junit.Assert.assertNotNull(objArray16);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray16), "[100.0, 10]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray16), "[100.0, 10]");
        org.junit.Assert.assertNotNull(objArray28);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray28), "[1, a, 10, a, -1]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray28), "[1, a, 10, a, -1]");
    }

    @Test
    public void test14572() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest29.test14572");
        java.lang.String[] strArray14 = new java.lang.String[] { "hi!", "org.apache.commons.math.MathException: hi!", "", "hi!", "org.apache.commons.math.MathException: hi!" };
        org.apache.commons.math.ode.DerivativeException derivativeException15 = new org.apache.commons.math.ode.DerivativeException("hi!", strArray14);
        org.apache.commons.math.ConvergenceException convergenceException16 = new org.apache.commons.math.ConvergenceException("", (java.lang.Object[]) strArray14);
        org.apache.commons.math.ConvergenceException convergenceException17 = new org.apache.commons.math.ConvergenceException("", (java.lang.Object[]) strArray14);
        org.apache.commons.math.ode.DerivativeException derivativeException18 = new org.apache.commons.math.ode.DerivativeException("org.apache.commons.math.MathException: org.apache.commons.math.FunctionEvaluationException: hi!", strArray14);
        org.apache.commons.math.ode.DerivativeException derivativeException19 = new org.apache.commons.math.ode.DerivativeException("org.apache.commons.math.FunctionEvaluationException: org.apache.commons.math.FunctionEvaluationException: Evaluation failed for argument = 35", strArray14);
        java.lang.Object[] objArray30 = new java.lang.Object[] { 1L, 'a', 10L, 'a', (-1) };
        org.apache.commons.math.ConvergenceException convergenceException31 = new org.apache.commons.math.ConvergenceException("", objArray30);
        org.apache.commons.math.FunctionEvaluationException functionEvaluationException32 = new org.apache.commons.math.FunctionEvaluationException((-1.0d), "", objArray30);
        org.apache.commons.math.ode.IntegratorException integratorException33 = new org.apache.commons.math.ode.IntegratorException("hi!", objArray30);
        org.apache.commons.math.FunctionEvaluationException functionEvaluationException36 = new org.apache.commons.math.FunctionEvaluationException((double) (short) 1, "");
        org.apache.commons.math.MathException mathException37 = new org.apache.commons.math.MathException("", objArray30, (java.lang.Throwable) functionEvaluationException36);
        org.apache.commons.math.MathException mathException38 = new org.apache.commons.math.MathException((java.lang.Throwable) functionEvaluationException36);
        java.lang.Object[] objArray39 = functionEvaluationException36.getArguments();
        org.apache.commons.math.ConvergenceException convergenceException40 = new org.apache.commons.math.ConvergenceException((java.lang.Throwable) functionEvaluationException36);
        org.apache.commons.math.ConvergenceException convergenceException41 = new org.apache.commons.math.ConvergenceException("org.apache.commons.math.MathException: org.apache.commons.math.FunctionEvaluationException: Evaluation failed for argument = 35", (java.lang.Object[]) strArray14, (java.lang.Throwable) functionEvaluationException36);
        org.apache.commons.math.MathException mathException42 = new org.apache.commons.math.MathException("org.apache.commons.math.ode.IntegratorException: Evaluation failed for argument = 100", (java.lang.Object[]) strArray14);
        org.apache.commons.math.MathException mathException43 = new org.apache.commons.math.MathException("org.apache.commons.math.ode.DerivativeException: org.apache.commons.math.MathException: org.apache.commons.math.MathException: org.apache.commons.math.FunctionEvaluationException: hi!", (java.lang.Object[]) strArray14);
        org.apache.commons.math.ode.DerivativeException derivativeException44 = new org.apache.commons.math.ode.DerivativeException("org.apache.commons.math.MathException: org.apache.commons.math.MathException: hi!", strArray14);
        org.junit.Assert.assertNotNull(strArray14);
        org.junit.Assert.assertNotNull(objArray30);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray30), "[1, a, 10, a, -1]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray30), "[1, a, 10, a, -1]");
        org.junit.Assert.assertNotNull(objArray39);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray39), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray39), "[]");
    }

    @Test
    public void test14573() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest29.test14573");
        org.apache.commons.math.ode.SwitchingFunctionsHandler switchingFunctionsHandler0 = new org.apache.commons.math.ode.SwitchingFunctionsHandler();
        boolean boolean1 = switchingFunctionsHandler0.isEmpty();
        org.apache.commons.math.ode.StepInterpolator stepInterpolator2 = null;
        boolean boolean3 = switchingFunctionsHandler0.evaluateStep(stepInterpolator2);
        org.apache.commons.math.ode.StepInterpolator stepInterpolator4 = null;
        boolean boolean5 = switchingFunctionsHandler0.evaluateStep(stepInterpolator4);
        org.apache.commons.math.ode.SwitchingFunction switchingFunction6 = null;
        switchingFunctionsHandler0.add(switchingFunction6, (double) (short) -1, (double) (byte) 1, (int) (short) 10);
        boolean boolean11 = switchingFunctionsHandler0.stop();
        double double12 = switchingFunctionsHandler0.getEventTime();
        double[] doubleArray14 = null;
        // The following exception was thrown during execution in test generation
        try {
            switchingFunctionsHandler0.stepAccepted((double) 10L, doubleArray14);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue(Double.isNaN(double12));
    }

    @Test
    public void test14574() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest29.test14574");
        org.apache.commons.math.FunctionEvaluationException functionEvaluationException2 = new org.apache.commons.math.FunctionEvaluationException((double) (short) 100, "org.apache.commons.math.MathException: org.apache.commons.math.MathException: Evaluation failed for argument = 100");
    }

    @Test
    public void test14575() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest29.test14575");
        java.lang.String[] strArray12 = new java.lang.String[] { "hi!", "org.apache.commons.math.MathException: hi!", "", "hi!", "org.apache.commons.math.MathException: hi!" };
        org.apache.commons.math.ode.DerivativeException derivativeException13 = new org.apache.commons.math.ode.DerivativeException("hi!", strArray12);
        org.apache.commons.math.ConvergenceException convergenceException14 = new org.apache.commons.math.ConvergenceException("", (java.lang.Object[]) strArray12);
        org.apache.commons.math.ode.SwitchingFunctionsHandler switchingFunctionsHandler20 = new org.apache.commons.math.ode.SwitchingFunctionsHandler();
        java.lang.Object[] objArray29 = new java.lang.Object[] { 1L, 'a', 10L, 'a', (-1) };
        org.apache.commons.math.ConvergenceException convergenceException30 = new org.apache.commons.math.ConvergenceException("", objArray29);
        org.apache.commons.math.ode.IntegratorException integratorException31 = new org.apache.commons.math.ode.IntegratorException("org.apache.commons.math.MathException: hi!", objArray29);
        java.lang.Object[] objArray32 = new java.lang.Object[] { 2, switchingFunctionsHandler20, 1, objArray29 };
        org.apache.commons.math.ConvergenceException convergenceException35 = new org.apache.commons.math.ConvergenceException("hi!");
        org.apache.commons.math.MathException mathException36 = new org.apache.commons.math.MathException("hi!", (java.lang.Throwable) convergenceException35);
        org.apache.commons.math.FunctionEvaluationException functionEvaluationException37 = new org.apache.commons.math.FunctionEvaluationException((double) (short) 0, "org.apache.commons.math.MathException: hi!", objArray29, (java.lang.Throwable) mathException36);
        org.apache.commons.math.FunctionEvaluationException functionEvaluationException39 = new org.apache.commons.math.FunctionEvaluationException((double) 100L);
        org.apache.commons.math.ConvergenceException convergenceException40 = new org.apache.commons.math.ConvergenceException("org.apache.commons.math.MathException: hi!", objArray29, (java.lang.Throwable) functionEvaluationException39);
        org.apache.commons.math.FunctionEvaluationException functionEvaluationException42 = new org.apache.commons.math.FunctionEvaluationException((double) 100L);
        org.apache.commons.math.ConvergenceException convergenceException43 = new org.apache.commons.math.ConvergenceException("org.apache.commons.math.MathException: hi!", objArray29, (java.lang.Throwable) functionEvaluationException42);
        org.apache.commons.math.MathException mathException44 = new org.apache.commons.math.MathException("org.apache.commons.math.MathException: ", (java.lang.Object[]) strArray12, (java.lang.Throwable) functionEvaluationException42);
        java.lang.Throwable[] throwableArray45 = functionEvaluationException42.getSuppressed();
        org.apache.commons.math.ode.IntegratorException integratorException46 = new org.apache.commons.math.ode.IntegratorException("org.apache.commons.math.MathException: ", (java.lang.Object[]) throwableArray45);
        org.apache.commons.math.FunctionEvaluationException functionEvaluationException48 = new org.apache.commons.math.FunctionEvaluationException((double) (-1));
        org.apache.commons.math.MathException mathException49 = new org.apache.commons.math.MathException("org.apache.commons.math.ConvergenceException: org.apache.commons.math.FunctionEvaluationException: hi!", (java.lang.Object[]) throwableArray45, (java.lang.Throwable) functionEvaluationException48);
        org.apache.commons.math.MathException mathException50 = new org.apache.commons.math.MathException("org.apache.commons.math.FunctionEvaluationException: org.apache.commons.math.MathException: org.apache.commons.math.FunctionEvaluationException: hi!", (java.lang.Object[]) throwableArray45);
        org.apache.commons.math.ode.SwitchingFunctionsHandler switchingFunctionsHandler58 = new org.apache.commons.math.ode.SwitchingFunctionsHandler();
        java.lang.Object[] objArray67 = new java.lang.Object[] { 1L, 'a', 10L, 'a', (-1) };
        org.apache.commons.math.ConvergenceException convergenceException68 = new org.apache.commons.math.ConvergenceException("", objArray67);
        org.apache.commons.math.ode.IntegratorException integratorException69 = new org.apache.commons.math.ode.IntegratorException("org.apache.commons.math.MathException: hi!", objArray67);
        java.lang.Object[] objArray70 = new java.lang.Object[] { 2, switchingFunctionsHandler58, 1, objArray67 };
        org.apache.commons.math.ConvergenceException convergenceException73 = new org.apache.commons.math.ConvergenceException("hi!");
        org.apache.commons.math.MathException mathException74 = new org.apache.commons.math.MathException("hi!", (java.lang.Throwable) convergenceException73);
        org.apache.commons.math.FunctionEvaluationException functionEvaluationException75 = new org.apache.commons.math.FunctionEvaluationException((double) (short) 0, "org.apache.commons.math.MathException: hi!", objArray67, (java.lang.Throwable) mathException74);
        org.apache.commons.math.FunctionEvaluationException functionEvaluationException77 = new org.apache.commons.math.FunctionEvaluationException((double) 100L);
        org.apache.commons.math.ConvergenceException convergenceException78 = new org.apache.commons.math.ConvergenceException("org.apache.commons.math.MathException: hi!", objArray67, (java.lang.Throwable) functionEvaluationException77);
        org.apache.commons.math.FunctionEvaluationException functionEvaluationException80 = new org.apache.commons.math.FunctionEvaluationException((double) 100L);
        org.apache.commons.math.ConvergenceException convergenceException81 = new org.apache.commons.math.ConvergenceException("org.apache.commons.math.MathException: hi!", objArray67, (java.lang.Throwable) functionEvaluationException80);
        org.apache.commons.math.FunctionEvaluationException functionEvaluationException82 = new org.apache.commons.math.FunctionEvaluationException((double) 0.0f, "hi!", objArray67);
        org.apache.commons.math.MathException mathException83 = new org.apache.commons.math.MathException("org.apache.commons.math.ode.IntegratorException: org.apache.commons.math.FunctionEvaluationException: hi!", (java.lang.Object[]) throwableArray45, (java.lang.Throwable) functionEvaluationException82);
        java.lang.Throwable[] throwableArray84 = mathException83.getSuppressed();
        org.apache.commons.math.MathException mathException85 = new org.apache.commons.math.MathException((java.lang.Throwable) mathException83);
        org.junit.Assert.assertNotNull(strArray12);
        org.junit.Assert.assertNotNull(objArray29);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray29), "[1, a, 10, a, -1]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray29), "[1, a, 10, a, -1]");
        org.junit.Assert.assertNotNull(objArray32);
        org.junit.Assert.assertNotNull(throwableArray45);
        org.junit.Assert.assertNotNull(objArray67);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray67), "[1, a, 10, a, -1]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray67), "[1, a, 10, a, -1]");
        org.junit.Assert.assertNotNull(objArray70);
        org.junit.Assert.assertNotNull(throwableArray84);
    }

    @Test
    public void test14576() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest29.test14576");
        org.apache.commons.math.ode.SwitchingFunctionsHandler switchingFunctionsHandler0 = new org.apache.commons.math.ode.SwitchingFunctionsHandler();
        boolean boolean1 = switchingFunctionsHandler0.isEmpty();
        double[] doubleArray4 = new double[] { 100.0d };
        boolean boolean5 = switchingFunctionsHandler0.reset((double) 0L, doubleArray4);
        org.apache.commons.math.ode.SwitchingFunctionsHandler switchingFunctionsHandler7 = new org.apache.commons.math.ode.SwitchingFunctionsHandler();
        boolean boolean8 = switchingFunctionsHandler7.isEmpty();
        org.apache.commons.math.ode.StepInterpolator stepInterpolator9 = null;
        boolean boolean10 = switchingFunctionsHandler7.evaluateStep(stepInterpolator9);
        org.apache.commons.math.ode.SwitchingFunctionsHandler switchingFunctionsHandler12 = new org.apache.commons.math.ode.SwitchingFunctionsHandler();
        boolean boolean13 = switchingFunctionsHandler12.isEmpty();
        double[] doubleArray16 = new double[] { 100.0d };
        boolean boolean17 = switchingFunctionsHandler12.reset((double) 0L, doubleArray16);
        boolean boolean18 = switchingFunctionsHandler7.reset((double) 1, doubleArray16);
        boolean boolean19 = switchingFunctionsHandler0.reset((double) 100, doubleArray16);
        double double20 = switchingFunctionsHandler0.getEventTime();
        org.apache.commons.math.ode.SwitchingFunctionsHandler switchingFunctionsHandler22 = new org.apache.commons.math.ode.SwitchingFunctionsHandler();
        boolean boolean23 = switchingFunctionsHandler22.isEmpty();
        org.apache.commons.math.ode.StepInterpolator stepInterpolator24 = null;
        boolean boolean25 = switchingFunctionsHandler22.evaluateStep(stepInterpolator24);
        org.apache.commons.math.ode.SwitchingFunctionsHandler switchingFunctionsHandler27 = new org.apache.commons.math.ode.SwitchingFunctionsHandler();
        boolean boolean28 = switchingFunctionsHandler27.isEmpty();
        double[] doubleArray31 = new double[] { 100.0d };
        boolean boolean32 = switchingFunctionsHandler27.reset((double) 0L, doubleArray31);
        switchingFunctionsHandler22.stepAccepted((double) (byte) 10, doubleArray31);
        switchingFunctionsHandler0.stepAccepted(0.0d, doubleArray31);
        double double35 = switchingFunctionsHandler0.getEventTime();
        org.apache.commons.math.ode.SwitchingFunction switchingFunction36 = null;
        switchingFunctionsHandler0.add(switchingFunction36, (double) 10L, (double) 'a', (int) (byte) 0);
        org.apache.commons.math.ode.SwitchingFunctionsHandler switchingFunctionsHandler42 = new org.apache.commons.math.ode.SwitchingFunctionsHandler();
        boolean boolean43 = switchingFunctionsHandler42.isEmpty();
        double[] doubleArray46 = new double[] { 100.0d };
        boolean boolean47 = switchingFunctionsHandler42.reset((double) 0L, doubleArray46);
        boolean boolean48 = switchingFunctionsHandler0.reset((double) (byte) 1, doubleArray46);
        boolean boolean49 = switchingFunctionsHandler0.stop();
        org.apache.commons.math.ode.SwitchingFunctionsHandler switchingFunctionsHandler51 = new org.apache.commons.math.ode.SwitchingFunctionsHandler();
        boolean boolean52 = switchingFunctionsHandler51.isEmpty();
        org.apache.commons.math.ode.StepInterpolator stepInterpolator53 = null;
        boolean boolean54 = switchingFunctionsHandler51.evaluateStep(stepInterpolator53);
        org.apache.commons.math.ode.SwitchingFunctionsHandler switchingFunctionsHandler56 = new org.apache.commons.math.ode.SwitchingFunctionsHandler();
        boolean boolean57 = switchingFunctionsHandler56.isEmpty();
        double[] doubleArray60 = new double[] { 100.0d };
        boolean boolean61 = switchingFunctionsHandler56.reset((double) 0L, doubleArray60);
        boolean boolean62 = switchingFunctionsHandler51.reset((double) 1, doubleArray60);
        boolean boolean63 = switchingFunctionsHandler0.reset((double) (byte) -1, doubleArray60);
        double double64 = switchingFunctionsHandler0.getEventTime();
        boolean boolean65 = switchingFunctionsHandler0.stop();
        org.apache.commons.math.ode.SwitchingFunction switchingFunction66 = null;
        switchingFunctionsHandler0.add(switchingFunction66, (double) 10.0f, (double) 1L, 0);
        org.apache.commons.math.ode.SwitchingFunction switchingFunction71 = null;
        switchingFunctionsHandler0.add(switchingFunction71, (double) (short) 0, (double) 1, (int) (byte) 1);
        boolean boolean76 = switchingFunctionsHandler0.stop();
        double[] doubleArray78 = null;
        // The following exception was thrown during execution in test generation
        try {
            switchingFunctionsHandler0.stepAccepted((double) 10.0f, doubleArray78);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertNotNull(doubleArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray4), "[100.0]");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertNotNull(doubleArray16);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray16), "[100.0]");
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertTrue(Double.isNaN(double20));
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + true + "'", boolean23 == true);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + true + "'", boolean28 == true);
        org.junit.Assert.assertNotNull(doubleArray31);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray31), "[100.0]");
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + false + "'", boolean32 == false);
        org.junit.Assert.assertTrue(Double.isNaN(double35));
        org.junit.Assert.assertTrue("'" + boolean43 + "' != '" + true + "'", boolean43 == true);
        org.junit.Assert.assertNotNull(doubleArray46);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray46), "[100.0]");
        org.junit.Assert.assertTrue("'" + boolean47 + "' != '" + false + "'", boolean47 == false);
        org.junit.Assert.assertTrue("'" + boolean48 + "' != '" + false + "'", boolean48 == false);
        org.junit.Assert.assertTrue("'" + boolean49 + "' != '" + false + "'", boolean49 == false);
        org.junit.Assert.assertTrue("'" + boolean52 + "' != '" + true + "'", boolean52 == true);
        org.junit.Assert.assertTrue("'" + boolean54 + "' != '" + false + "'", boolean54 == false);
        org.junit.Assert.assertTrue("'" + boolean57 + "' != '" + true + "'", boolean57 == true);
        org.junit.Assert.assertNotNull(doubleArray60);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray60), "[100.0]");
        org.junit.Assert.assertTrue("'" + boolean61 + "' != '" + false + "'", boolean61 == false);
        org.junit.Assert.assertTrue("'" + boolean62 + "' != '" + false + "'", boolean62 == false);
        org.junit.Assert.assertTrue("'" + boolean63 + "' != '" + false + "'", boolean63 == false);
        org.junit.Assert.assertTrue(Double.isNaN(double64));
        org.junit.Assert.assertTrue("'" + boolean65 + "' != '" + false + "'", boolean65 == false);
        org.junit.Assert.assertTrue("'" + boolean76 + "' != '" + false + "'", boolean76 == false);
    }

    @Test
    public void test14577() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest29.test14577");
        java.lang.Object[] objArray13 = new java.lang.Object[] { 1L, 'a', 10L, 'a', (-1) };
        org.apache.commons.math.ConvergenceException convergenceException14 = new org.apache.commons.math.ConvergenceException("", objArray13);
        org.apache.commons.math.FunctionEvaluationException functionEvaluationException15 = new org.apache.commons.math.FunctionEvaluationException((-1.0d), "", objArray13);
        org.apache.commons.math.ode.IntegratorException integratorException16 = new org.apache.commons.math.ode.IntegratorException("hi!", objArray13);
        java.lang.Object[] objArray26 = new java.lang.Object[] { 1L, 'a', 10L, 'a', (-1) };
        org.apache.commons.math.ConvergenceException convergenceException27 = new org.apache.commons.math.ConvergenceException("", objArray26);
        org.apache.commons.math.FunctionEvaluationException functionEvaluationException28 = new org.apache.commons.math.FunctionEvaluationException((-1.0d), "", objArray26);
        org.apache.commons.math.ode.IntegratorException integratorException29 = new org.apache.commons.math.ode.IntegratorException("hi!", objArray26);
        integratorException16.addSuppressed((java.lang.Throwable) integratorException29);
        java.lang.Object[] objArray31 = integratorException29.getArguments();
        java.lang.Object[] objArray41 = new java.lang.Object[] { 1L, 'a', 10L, 'a', (-1) };
        org.apache.commons.math.ConvergenceException convergenceException42 = new org.apache.commons.math.ConvergenceException("", objArray41);
        org.apache.commons.math.ode.IntegratorException integratorException43 = new org.apache.commons.math.ode.IntegratorException("org.apache.commons.math.MathException: hi!", objArray41);
        org.apache.commons.math.MathException mathException44 = new org.apache.commons.math.MathException((java.lang.Throwable) integratorException43);
        java.lang.Throwable[] throwableArray45 = integratorException43.getSuppressed();
        java.lang.Object[] objArray56 = new java.lang.Object[] { 1L, 'a', 10L, 'a', (-1) };
        org.apache.commons.math.ConvergenceException convergenceException57 = new org.apache.commons.math.ConvergenceException("", objArray56);
        org.apache.commons.math.FunctionEvaluationException functionEvaluationException58 = new org.apache.commons.math.FunctionEvaluationException((-1.0d), "", objArray56);
        org.apache.commons.math.ode.IntegratorException integratorException59 = new org.apache.commons.math.ode.IntegratorException("hi!", objArray56);
        org.apache.commons.math.FunctionEvaluationException functionEvaluationException62 = new org.apache.commons.math.FunctionEvaluationException((double) (short) 1, "");
        org.apache.commons.math.MathException mathException63 = new org.apache.commons.math.MathException("", objArray56, (java.lang.Throwable) functionEvaluationException62);
        org.apache.commons.math.ConvergenceException convergenceException64 = new org.apache.commons.math.ConvergenceException("org.apache.commons.math.ode.DerivativeException: ", (java.lang.Object[]) throwableArray45, (java.lang.Throwable) functionEvaluationException62);
        org.apache.commons.math.MathException mathException65 = new org.apache.commons.math.MathException("org.apache.commons.math.ode.IntegratorException: org.apache.commons.math.MathException: hi!", (java.lang.Throwable) functionEvaluationException62);
        org.apache.commons.math.FunctionEvaluationException functionEvaluationException66 = new org.apache.commons.math.FunctionEvaluationException((double) (short) 10, "org.apache.commons.math.ode.IntegratorException: hi!", objArray31, (java.lang.Throwable) functionEvaluationException62);
        org.apache.commons.math.FunctionEvaluationException functionEvaluationException67 = new org.apache.commons.math.FunctionEvaluationException((double) '#', "org.apache.commons.math.FunctionEvaluationException: org.apache.commons.math.MathException: Evaluation failed for argument = -1", (java.lang.Throwable) functionEvaluationException66);
        org.apache.commons.math.MathException mathException68 = new org.apache.commons.math.MathException((java.lang.Throwable) functionEvaluationException67);
        org.junit.Assert.assertNotNull(objArray13);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray13), "[1, a, 10, a, -1]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray13), "[1, a, 10, a, -1]");
        org.junit.Assert.assertNotNull(objArray26);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray26), "[1, a, 10, a, -1]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray26), "[1, a, 10, a, -1]");
        org.junit.Assert.assertNotNull(objArray31);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray31), "[1, a, 10, a, -1]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray31), "[1, a, 10, a, -1]");
        org.junit.Assert.assertNotNull(objArray41);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray41), "[1, a, 10, a, -1]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray41), "[1, a, 10, a, -1]");
        org.junit.Assert.assertNotNull(throwableArray45);
        org.junit.Assert.assertNotNull(objArray56);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray56), "[1, a, 10, a, -1]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray56), "[1, a, 10, a, -1]");
    }

    @Test
    public void test14578() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest29.test14578");
        org.apache.commons.math.FunctionEvaluationException functionEvaluationException2 = new org.apache.commons.math.FunctionEvaluationException((double) (short) 10, "org.apache.commons.math.FunctionEvaluationException: org.apache.commons.math.MathException: org.apache.commons.math.ConvergenceException: ");
    }

    @Test
    public void test14579() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest29.test14579");
        java.lang.String[] strArray17 = new java.lang.String[] { "hi!", "org.apache.commons.math.MathException: hi!", "", "hi!", "org.apache.commons.math.MathException: hi!" };
        org.apache.commons.math.ode.DerivativeException derivativeException18 = new org.apache.commons.math.ode.DerivativeException("hi!", strArray17);
        org.apache.commons.math.ode.IntegratorException integratorException19 = new org.apache.commons.math.ode.IntegratorException("", (java.lang.Object[]) strArray17);
        org.apache.commons.math.ode.DerivativeException derivativeException20 = new org.apache.commons.math.ode.DerivativeException("hi!", strArray17);
        org.apache.commons.math.ode.SwitchingFunctionsHandler switchingFunctionsHandler27 = new org.apache.commons.math.ode.SwitchingFunctionsHandler();
        java.lang.Object[] objArray36 = new java.lang.Object[] { 1L, 'a', 10L, 'a', (-1) };
        org.apache.commons.math.ConvergenceException convergenceException37 = new org.apache.commons.math.ConvergenceException("", objArray36);
        org.apache.commons.math.ode.IntegratorException integratorException38 = new org.apache.commons.math.ode.IntegratorException("org.apache.commons.math.MathException: hi!", objArray36);
        java.lang.Object[] objArray39 = new java.lang.Object[] { 2, switchingFunctionsHandler27, 1, objArray36 };
        org.apache.commons.math.ConvergenceException convergenceException42 = new org.apache.commons.math.ConvergenceException("hi!");
        org.apache.commons.math.MathException mathException43 = new org.apache.commons.math.MathException("hi!", (java.lang.Throwable) convergenceException42);
        org.apache.commons.math.FunctionEvaluationException functionEvaluationException44 = new org.apache.commons.math.FunctionEvaluationException((double) (short) 0, "org.apache.commons.math.MathException: hi!", objArray36, (java.lang.Throwable) mathException43);
        org.apache.commons.math.FunctionEvaluationException functionEvaluationException46 = new org.apache.commons.math.FunctionEvaluationException((double) 100L);
        org.apache.commons.math.ConvergenceException convergenceException47 = new org.apache.commons.math.ConvergenceException("org.apache.commons.math.MathException: hi!", objArray36, (java.lang.Throwable) functionEvaluationException46);
        org.apache.commons.math.FunctionEvaluationException functionEvaluationException49 = new org.apache.commons.math.FunctionEvaluationException((double) 100L);
        org.apache.commons.math.ConvergenceException convergenceException50 = new org.apache.commons.math.ConvergenceException("org.apache.commons.math.MathException: hi!", objArray36, (java.lang.Throwable) functionEvaluationException49);
        org.apache.commons.math.ConvergenceException convergenceException51 = new org.apache.commons.math.ConvergenceException("org.apache.commons.math.MathException: hi!", objArray36);
        org.apache.commons.math.ConvergenceException convergenceException52 = new org.apache.commons.math.ConvergenceException((java.lang.Throwable) convergenceException51);
        org.apache.commons.math.FunctionEvaluationException functionEvaluationException53 = new org.apache.commons.math.FunctionEvaluationException((double) (byte) -1, "org.apache.commons.math.ConvergenceException: org.apache.commons.math.FunctionEvaluationException: hi!", (java.lang.Object[]) strArray17, (java.lang.Throwable) convergenceException52);
        org.apache.commons.math.ode.DerivativeException derivativeException54 = new org.apache.commons.math.ode.DerivativeException("", strArray17);
        org.apache.commons.math.ode.DerivativeException derivativeException55 = new org.apache.commons.math.ode.DerivativeException("", strArray17);
        org.apache.commons.math.ode.SwitchingFunctionsHandler switchingFunctionsHandler61 = new org.apache.commons.math.ode.SwitchingFunctionsHandler();
        java.lang.Object[] objArray70 = new java.lang.Object[] { 1L, 'a', 10L, 'a', (-1) };
        org.apache.commons.math.ConvergenceException convergenceException71 = new org.apache.commons.math.ConvergenceException("", objArray70);
        org.apache.commons.math.ode.IntegratorException integratorException72 = new org.apache.commons.math.ode.IntegratorException("org.apache.commons.math.MathException: hi!", objArray70);
        java.lang.Object[] objArray73 = new java.lang.Object[] { 2, switchingFunctionsHandler61, 1, objArray70 };
        org.apache.commons.math.ConvergenceException convergenceException76 = new org.apache.commons.math.ConvergenceException("hi!");
        org.apache.commons.math.MathException mathException77 = new org.apache.commons.math.MathException("hi!", (java.lang.Throwable) convergenceException76);
        org.apache.commons.math.FunctionEvaluationException functionEvaluationException78 = new org.apache.commons.math.FunctionEvaluationException((double) (short) 0, "org.apache.commons.math.MathException: hi!", objArray70, (java.lang.Throwable) mathException77);
        org.apache.commons.math.MathException mathException79 = new org.apache.commons.math.MathException("org.apache.commons.math.MathException: ", objArray70);
        org.apache.commons.math.MathException mathException80 = new org.apache.commons.math.MathException("org.apache.commons.math.FunctionEvaluationException: hi!", objArray70);
        org.apache.commons.math.ode.DerivativeException derivativeException81 = new org.apache.commons.math.ode.DerivativeException((java.lang.Throwable) mathException80);
        org.apache.commons.math.MathException mathException82 = new org.apache.commons.math.MathException("org.apache.commons.math.MathException: Evaluation failed for argument = 52", (java.lang.Object[]) strArray17, (java.lang.Throwable) derivativeException81);
        org.apache.commons.math.ode.DerivativeException derivativeException83 = new org.apache.commons.math.ode.DerivativeException("org.apache.commons.math.MathException: org.apache.commons.math.MathException: ", strArray17);
        org.apache.commons.math.ode.DerivativeException derivativeException84 = new org.apache.commons.math.ode.DerivativeException("org.apache.commons.math.FunctionEvaluationException: Evaluation failed for argument = 35", strArray17);
        org.apache.commons.math.ConvergenceException convergenceException85 = new org.apache.commons.math.ConvergenceException("org.apache.commons.math.FunctionEvaluationException", (java.lang.Throwable) derivativeException84);
        org.apache.commons.math.ConvergenceException convergenceException86 = new org.apache.commons.math.ConvergenceException("org.apache.commons.math.MathException: org.apache.commons.math.FunctionEvaluationException: org.apache.commons.math.ode.IntegratorException: org.apache.commons.math.MathException: ", (java.lang.Throwable) derivativeException84);
        org.apache.commons.math.ode.IntegratorException integratorException87 = new org.apache.commons.math.ode.IntegratorException((java.lang.Throwable) derivativeException84);
        org.junit.Assert.assertNotNull(strArray17);
        org.junit.Assert.assertNotNull(objArray36);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray36), "[1, a, 10, a, -1]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray36), "[1, a, 10, a, -1]");
        org.junit.Assert.assertNotNull(objArray39);
        org.junit.Assert.assertNotNull(objArray70);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray70), "[1, a, 10, a, -1]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray70), "[1, a, 10, a, -1]");
        org.junit.Assert.assertNotNull(objArray73);
    }

    @Test
    public void test14580() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest29.test14580");
        org.apache.commons.math.ConvergenceException convergenceException4 = new org.apache.commons.math.ConvergenceException("hi!");
        org.apache.commons.math.MathException mathException5 = new org.apache.commons.math.MathException("hi!", (java.lang.Throwable) convergenceException4);
        java.lang.Object[] objArray6 = mathException5.getArguments();
        java.lang.Throwable throwable7 = null;
        org.apache.commons.math.ConvergenceException convergenceException8 = new org.apache.commons.math.ConvergenceException("hi!", objArray6, throwable7);
        org.apache.commons.math.ConvergenceException convergenceException9 = new org.apache.commons.math.ConvergenceException((java.lang.Throwable) convergenceException8);
        java.lang.Object[] objArray10 = convergenceException8.getArguments();
        org.apache.commons.math.ode.IntegratorException integratorException11 = new org.apache.commons.math.ode.IntegratorException("org.apache.commons.math.ode.IntegratorException: org.apache.commons.math.MathException: Evaluation failed for argument = 52", objArray10);
        org.apache.commons.math.ode.IntegratorException integratorException12 = new org.apache.commons.math.ode.IntegratorException((java.lang.Throwable) integratorException11);
        org.junit.Assert.assertNotNull(objArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray6), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray6), "[]");
        org.junit.Assert.assertNotNull(objArray10);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray10), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray10), "[]");
    }

    @Test
    public void test14581() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest29.test14581");
        org.apache.commons.math.FunctionEvaluationException functionEvaluationException2 = new org.apache.commons.math.FunctionEvaluationException((double) (byte) 1, "");
        java.lang.Object[] objArray3 = functionEvaluationException2.getArguments();
        org.apache.commons.math.ode.IntegratorException integratorException4 = new org.apache.commons.math.ode.IntegratorException((java.lang.Throwable) functionEvaluationException2);
        java.lang.Object[] objArray13 = new java.lang.Object[] { 100.0f, (byte) 10 };
        org.apache.commons.math.MathException mathException14 = new org.apache.commons.math.MathException("org.apache.commons.math.MathException: hi!", objArray13);
        java.lang.Object[] objArray25 = new java.lang.Object[] { 1L, 'a', 10L, 'a', (-1) };
        org.apache.commons.math.ConvergenceException convergenceException26 = new org.apache.commons.math.ConvergenceException("", objArray25);
        org.apache.commons.math.FunctionEvaluationException functionEvaluationException27 = new org.apache.commons.math.FunctionEvaluationException((-1.0d), "", objArray25);
        org.apache.commons.math.ode.IntegratorException integratorException28 = new org.apache.commons.math.ode.IntegratorException("hi!", objArray25);
        org.apache.commons.math.FunctionEvaluationException functionEvaluationException31 = new org.apache.commons.math.FunctionEvaluationException((double) (short) 1, "");
        org.apache.commons.math.MathException mathException32 = new org.apache.commons.math.MathException("", objArray25, (java.lang.Throwable) functionEvaluationException31);
        org.apache.commons.math.MathException mathException33 = new org.apache.commons.math.MathException((java.lang.Throwable) functionEvaluationException31);
        org.apache.commons.math.ConvergenceException convergenceException34 = new org.apache.commons.math.ConvergenceException("", objArray13, (java.lang.Throwable) mathException33);
        org.apache.commons.math.FunctionEvaluationException functionEvaluationException35 = new org.apache.commons.math.FunctionEvaluationException((double) 100.0f, "org.apache.commons.math.MathException: ", (java.lang.Throwable) convergenceException34);
        org.apache.commons.math.FunctionEvaluationException functionEvaluationException36 = new org.apache.commons.math.FunctionEvaluationException(0.0d, "org.apache.commons.math.MathException: org.apache.commons.math.FunctionEvaluationException: hi!", (java.lang.Throwable) convergenceException34);
        integratorException4.addSuppressed((java.lang.Throwable) convergenceException34);
        org.apache.commons.math.ConvergenceException convergenceException38 = new org.apache.commons.math.ConvergenceException((java.lang.Throwable) integratorException4);
        org.apache.commons.math.MathException mathException39 = new org.apache.commons.math.MathException((java.lang.Throwable) convergenceException38);
        java.lang.String str40 = mathException39.toString();
        org.junit.Assert.assertNotNull(objArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray3), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray3), "[]");
        org.junit.Assert.assertNotNull(objArray13);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray13), "[100.0, 10]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray13), "[100.0, 10]");
        org.junit.Assert.assertNotNull(objArray25);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray25), "[1, a, 10, a, -1]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray25), "[1, a, 10, a, -1]");
        org.junit.Assert.assertEquals("'" + str40 + "' != '" + "org.apache.commons.math.MathException: " + "'", str40, "org.apache.commons.math.MathException: ");
    }

    @Test
    public void test14582() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest29.test14582");
        org.apache.commons.math.ConvergenceException convergenceException11 = new org.apache.commons.math.ConvergenceException("hi!");
        org.apache.commons.math.MathException mathException12 = new org.apache.commons.math.MathException("hi!", (java.lang.Throwable) convergenceException11);
        java.lang.Object[] objArray13 = mathException12.getArguments();
        java.lang.Throwable throwable14 = null;
        org.apache.commons.math.ConvergenceException convergenceException15 = new org.apache.commons.math.ConvergenceException("hi!", objArray13, throwable14);
        org.apache.commons.math.FunctionEvaluationException functionEvaluationException16 = new org.apache.commons.math.FunctionEvaluationException((double) 1L, "", objArray13);
        org.apache.commons.math.ode.IntegratorException integratorException17 = new org.apache.commons.math.ode.IntegratorException("", objArray13);
        java.lang.Throwable throwable18 = null;
        org.apache.commons.math.FunctionEvaluationException functionEvaluationException19 = new org.apache.commons.math.FunctionEvaluationException(1.0d, "hi!", objArray13, throwable18);
        java.lang.Object[] objArray20 = functionEvaluationException19.getArguments();
        org.apache.commons.math.ConvergenceException convergenceException21 = new org.apache.commons.math.ConvergenceException("org.apache.commons.math.ode.DerivativeException: org.apache.commons.math.MathException: ", objArray20);
        java.lang.String[] strArray32 = new java.lang.String[] { "hi!", "org.apache.commons.math.MathException: hi!", "", "hi!", "org.apache.commons.math.MathException: hi!" };
        org.apache.commons.math.ode.DerivativeException derivativeException33 = new org.apache.commons.math.ode.DerivativeException("hi!", strArray32);
        org.apache.commons.math.MathException mathException34 = new org.apache.commons.math.MathException("hi!", (java.lang.Object[]) strArray32);
        org.apache.commons.math.ode.DerivativeException derivativeException35 = new org.apache.commons.math.ode.DerivativeException("", strArray32);
        org.apache.commons.math.ode.DerivativeException derivativeException36 = new org.apache.commons.math.ode.DerivativeException("org.apache.commons.math.ode.IntegratorException: ", strArray32);
        org.apache.commons.math.ode.DerivativeException derivativeException37 = new org.apache.commons.math.ode.DerivativeException("org.apache.commons.math.FunctionEvaluationException: org.apache.commons.math.MathException: hi!", strArray32);
        convergenceException21.addSuppressed((java.lang.Throwable) derivativeException37);
        org.apache.commons.math.FunctionEvaluationException functionEvaluationException39 = new org.apache.commons.math.FunctionEvaluationException((double) (byte) 0, "org.apache.commons.math.FunctionEvaluationException: org.apache.commons.math.ode.IntegratorException: org.apache.commons.math.MathException: hi!", (java.lang.Throwable) derivativeException37);
        java.lang.String str40 = derivativeException37.getPattern();
        org.junit.Assert.assertNotNull(objArray13);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray13), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray13), "[]");
        org.junit.Assert.assertNotNull(objArray20);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray20), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray20), "[]");
        org.junit.Assert.assertNotNull(strArray32);
        org.junit.Assert.assertEquals("'" + str40 + "' != '" + "org.apache.commons.math.FunctionEvaluationException: org.apache.commons.math.MathException: hi!" + "'", str40, "org.apache.commons.math.FunctionEvaluationException: org.apache.commons.math.MathException: hi!");
    }

    @Test
    public void test14583() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest29.test14583");
        java.lang.Object[] objArray5 = new java.lang.Object[] { 100.0f, (byte) 10 };
        org.apache.commons.math.MathException mathException6 = new org.apache.commons.math.MathException("org.apache.commons.math.MathException: hi!", objArray5);
        org.apache.commons.math.FunctionEvaluationException functionEvaluationException7 = new org.apache.commons.math.FunctionEvaluationException(100.0d, "", objArray5);
        org.apache.commons.math.ode.DerivativeException derivativeException8 = new org.apache.commons.math.ode.DerivativeException((java.lang.Throwable) functionEvaluationException7);
        org.apache.commons.math.ode.DerivativeException derivativeException9 = new org.apache.commons.math.ode.DerivativeException((java.lang.Throwable) functionEvaluationException7);
        org.apache.commons.math.ConvergenceException convergenceException22 = new org.apache.commons.math.ConvergenceException("hi!");
        org.apache.commons.math.MathException mathException23 = new org.apache.commons.math.MathException("hi!", (java.lang.Throwable) convergenceException22);
        java.lang.Object[] objArray24 = mathException23.getArguments();
        java.lang.Throwable throwable25 = null;
        org.apache.commons.math.ConvergenceException convergenceException26 = new org.apache.commons.math.ConvergenceException("hi!", objArray24, throwable25);
        org.apache.commons.math.FunctionEvaluationException functionEvaluationException27 = new org.apache.commons.math.FunctionEvaluationException((double) 1L, "", objArray24);
        org.apache.commons.math.ode.IntegratorException integratorException28 = new org.apache.commons.math.ode.IntegratorException("", objArray24);
        java.lang.Throwable throwable29 = null;
        org.apache.commons.math.FunctionEvaluationException functionEvaluationException30 = new org.apache.commons.math.FunctionEvaluationException(1.0d, "hi!", objArray24, throwable29);
        java.lang.Object[] objArray31 = functionEvaluationException30.getArguments();
        org.apache.commons.math.ConvergenceException convergenceException32 = new org.apache.commons.math.ConvergenceException("org.apache.commons.math.ode.DerivativeException: org.apache.commons.math.MathException: ", objArray31);
        org.apache.commons.math.FunctionEvaluationException functionEvaluationException33 = new org.apache.commons.math.FunctionEvaluationException(10.0d, "org.apache.commons.math.ConvergenceException: Evaluation failed for argument = -1", objArray31);
        org.apache.commons.math.ConvergenceException convergenceException40 = new org.apache.commons.math.ConvergenceException("hi!");
        org.apache.commons.math.MathException mathException41 = new org.apache.commons.math.MathException("hi!", (java.lang.Throwable) convergenceException40);
        java.lang.Throwable[] throwableArray42 = convergenceException40.getSuppressed();
        org.apache.commons.math.FunctionEvaluationException functionEvaluationException43 = new org.apache.commons.math.FunctionEvaluationException((double) (byte) 10, "org.apache.commons.math.MathException: ", (java.lang.Object[]) throwableArray42);
        org.apache.commons.math.FunctionEvaluationException functionEvaluationException44 = new org.apache.commons.math.FunctionEvaluationException(0.0d, (java.lang.Throwable) functionEvaluationException43);
        org.apache.commons.math.FunctionEvaluationException functionEvaluationException45 = new org.apache.commons.math.FunctionEvaluationException(35.0d, (java.lang.Throwable) functionEvaluationException44);
        java.lang.Throwable[] throwableArray46 = functionEvaluationException44.getSuppressed();
        org.apache.commons.math.MathException mathException47 = new org.apache.commons.math.MathException("org.apache.commons.math.FunctionEvaluationException: org.apache.commons.math.MathException: org.apache.commons.math.FunctionEvaluationException: Evaluation failed for argument = 10", objArray31, (java.lang.Throwable) functionEvaluationException44);
        functionEvaluationException7.addSuppressed((java.lang.Throwable) functionEvaluationException44);
        org.junit.Assert.assertNotNull(objArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray5), "[100.0, 10]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray5), "[100.0, 10]");
        org.junit.Assert.assertNotNull(objArray24);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray24), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray24), "[]");
        org.junit.Assert.assertNotNull(objArray31);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray31), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray31), "[]");
        org.junit.Assert.assertNotNull(throwableArray42);
        org.junit.Assert.assertNotNull(throwableArray46);
    }

    @Test
    public void test14584() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest29.test14584");
        org.apache.commons.math.FunctionEvaluationException functionEvaluationException1 = new org.apache.commons.math.FunctionEvaluationException((double) (short) 100);
        org.apache.commons.math.ConvergenceException convergenceException2 = new org.apache.commons.math.ConvergenceException((java.lang.Throwable) functionEvaluationException1);
        org.apache.commons.math.ode.DerivativeException derivativeException3 = new org.apache.commons.math.ode.DerivativeException((java.lang.Throwable) convergenceException2);
        org.apache.commons.math.ode.DerivativeException derivativeException4 = new org.apache.commons.math.ode.DerivativeException((java.lang.Throwable) derivativeException3);
        org.apache.commons.math.ode.IntegratorException integratorException5 = new org.apache.commons.math.ode.IntegratorException((java.lang.Throwable) derivativeException4);
    }

    @Test
    public void test14585() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest29.test14585");
        java.lang.String[] strArray10 = new java.lang.String[] { "hi!", "org.apache.commons.math.MathException: hi!", "", "hi!", "org.apache.commons.math.MathException: hi!" };
        org.apache.commons.math.ode.DerivativeException derivativeException11 = new org.apache.commons.math.ode.DerivativeException("hi!", strArray10);
        org.apache.commons.math.ConvergenceException convergenceException12 = new org.apache.commons.math.ConvergenceException("", (java.lang.Object[]) strArray10);
        org.apache.commons.math.ConvergenceException convergenceException13 = new org.apache.commons.math.ConvergenceException("", (java.lang.Object[]) strArray10);
        org.apache.commons.math.FunctionEvaluationException functionEvaluationException14 = new org.apache.commons.math.FunctionEvaluationException((double) (short) -1, "org.apache.commons.math.MathException: org.apache.commons.math.MathException: ", (java.lang.Object[]) strArray10);
        java.lang.String str15 = functionEvaluationException14.getPattern();
        org.apache.commons.math.MathException mathException16 = new org.apache.commons.math.MathException((java.lang.Throwable) functionEvaluationException14);
        java.lang.String str17 = functionEvaluationException14.getPattern();
        org.junit.Assert.assertNotNull(strArray10);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "org.apache.commons.math.MathException: org.apache.commons.math.MathException: " + "'", str15, "org.apache.commons.math.MathException: org.apache.commons.math.MathException: ");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "org.apache.commons.math.MathException: org.apache.commons.math.MathException: " + "'", str17, "org.apache.commons.math.MathException: org.apache.commons.math.MathException: ");
    }

    @Test
    public void test14586() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest29.test14586");
        java.lang.Throwable throwable1 = null;
        org.apache.commons.math.MathException mathException2 = new org.apache.commons.math.MathException("", throwable1);
    }

    @Test
    public void test14587() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest29.test14587");
        org.apache.commons.math.FunctionEvaluationException functionEvaluationException4 = new org.apache.commons.math.FunctionEvaluationException((double) (short) -1);
        org.apache.commons.math.ode.IntegratorException integratorException5 = new org.apache.commons.math.ode.IntegratorException((java.lang.Throwable) functionEvaluationException4);
        java.lang.Throwable[] throwableArray6 = functionEvaluationException4.getSuppressed();
        java.lang.Object[] objArray7 = functionEvaluationException4.getArguments();
        org.apache.commons.math.MathException mathException8 = new org.apache.commons.math.MathException("org.apache.commons.math.ode.DerivativeException: org.apache.commons.math.ode.IntegratorException: ", objArray7);
        org.apache.commons.math.ode.IntegratorException integratorException9 = new org.apache.commons.math.ode.IntegratorException("org.apache.commons.math.FunctionEvaluationException: org.apache.commons.math.MathException: org.apache.commons.math.FunctionEvaluationException: hi!", objArray7);
        org.apache.commons.math.FunctionEvaluationException functionEvaluationException10 = new org.apache.commons.math.FunctionEvaluationException((double) (byte) 0, (java.lang.Throwable) integratorException9);
        org.junit.Assert.assertNotNull(throwableArray6);
        org.junit.Assert.assertNotNull(objArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray7), "[-1.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray7), "[-1.0]");
    }

    @Test
    public void test14588() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest29.test14588");
        java.lang.String[] strArray17 = new java.lang.String[] { "hi!", "org.apache.commons.math.MathException: hi!", "", "hi!", "org.apache.commons.math.MathException: hi!" };
        org.apache.commons.math.ode.DerivativeException derivativeException18 = new org.apache.commons.math.ode.DerivativeException("hi!", strArray17);
        org.apache.commons.math.ode.IntegratorException integratorException19 = new org.apache.commons.math.ode.IntegratorException("", (java.lang.Object[]) strArray17);
        org.apache.commons.math.ode.DerivativeException derivativeException20 = new org.apache.commons.math.ode.DerivativeException("hi!", strArray17);
        org.apache.commons.math.ode.SwitchingFunctionsHandler switchingFunctionsHandler27 = new org.apache.commons.math.ode.SwitchingFunctionsHandler();
        java.lang.Object[] objArray36 = new java.lang.Object[] { 1L, 'a', 10L, 'a', (-1) };
        org.apache.commons.math.ConvergenceException convergenceException37 = new org.apache.commons.math.ConvergenceException("", objArray36);
        org.apache.commons.math.ode.IntegratorException integratorException38 = new org.apache.commons.math.ode.IntegratorException("org.apache.commons.math.MathException: hi!", objArray36);
        java.lang.Object[] objArray39 = new java.lang.Object[] { 2, switchingFunctionsHandler27, 1, objArray36 };
        org.apache.commons.math.ConvergenceException convergenceException42 = new org.apache.commons.math.ConvergenceException("hi!");
        org.apache.commons.math.MathException mathException43 = new org.apache.commons.math.MathException("hi!", (java.lang.Throwable) convergenceException42);
        org.apache.commons.math.FunctionEvaluationException functionEvaluationException44 = new org.apache.commons.math.FunctionEvaluationException((double) (short) 0, "org.apache.commons.math.MathException: hi!", objArray36, (java.lang.Throwable) mathException43);
        org.apache.commons.math.FunctionEvaluationException functionEvaluationException46 = new org.apache.commons.math.FunctionEvaluationException((double) 100L);
        org.apache.commons.math.ConvergenceException convergenceException47 = new org.apache.commons.math.ConvergenceException("org.apache.commons.math.MathException: hi!", objArray36, (java.lang.Throwable) functionEvaluationException46);
        org.apache.commons.math.FunctionEvaluationException functionEvaluationException49 = new org.apache.commons.math.FunctionEvaluationException((double) 100L);
        org.apache.commons.math.ConvergenceException convergenceException50 = new org.apache.commons.math.ConvergenceException("org.apache.commons.math.MathException: hi!", objArray36, (java.lang.Throwable) functionEvaluationException49);
        org.apache.commons.math.ConvergenceException convergenceException51 = new org.apache.commons.math.ConvergenceException("org.apache.commons.math.MathException: hi!", objArray36);
        org.apache.commons.math.ConvergenceException convergenceException52 = new org.apache.commons.math.ConvergenceException((java.lang.Throwable) convergenceException51);
        org.apache.commons.math.FunctionEvaluationException functionEvaluationException53 = new org.apache.commons.math.FunctionEvaluationException((double) (byte) -1, "org.apache.commons.math.ConvergenceException: org.apache.commons.math.FunctionEvaluationException: hi!", (java.lang.Object[]) strArray17, (java.lang.Throwable) convergenceException52);
        org.apache.commons.math.ode.DerivativeException derivativeException54 = new org.apache.commons.math.ode.DerivativeException("", strArray17);
        org.apache.commons.math.ode.DerivativeException derivativeException55 = new org.apache.commons.math.ode.DerivativeException("", strArray17);
        org.apache.commons.math.ode.SwitchingFunctionsHandler switchingFunctionsHandler61 = new org.apache.commons.math.ode.SwitchingFunctionsHandler();
        java.lang.Object[] objArray70 = new java.lang.Object[] { 1L, 'a', 10L, 'a', (-1) };
        org.apache.commons.math.ConvergenceException convergenceException71 = new org.apache.commons.math.ConvergenceException("", objArray70);
        org.apache.commons.math.ode.IntegratorException integratorException72 = new org.apache.commons.math.ode.IntegratorException("org.apache.commons.math.MathException: hi!", objArray70);
        java.lang.Object[] objArray73 = new java.lang.Object[] { 2, switchingFunctionsHandler61, 1, objArray70 };
        org.apache.commons.math.ConvergenceException convergenceException76 = new org.apache.commons.math.ConvergenceException("hi!");
        org.apache.commons.math.MathException mathException77 = new org.apache.commons.math.MathException("hi!", (java.lang.Throwable) convergenceException76);
        org.apache.commons.math.FunctionEvaluationException functionEvaluationException78 = new org.apache.commons.math.FunctionEvaluationException((double) (short) 0, "org.apache.commons.math.MathException: hi!", objArray70, (java.lang.Throwable) mathException77);
        org.apache.commons.math.MathException mathException79 = new org.apache.commons.math.MathException("org.apache.commons.math.MathException: ", objArray70);
        org.apache.commons.math.MathException mathException80 = new org.apache.commons.math.MathException("org.apache.commons.math.FunctionEvaluationException: hi!", objArray70);
        org.apache.commons.math.ode.DerivativeException derivativeException81 = new org.apache.commons.math.ode.DerivativeException((java.lang.Throwable) mathException80);
        org.apache.commons.math.MathException mathException82 = new org.apache.commons.math.MathException("org.apache.commons.math.MathException: Evaluation failed for argument = 52", (java.lang.Object[]) strArray17, (java.lang.Throwable) derivativeException81);
        org.apache.commons.math.ode.DerivativeException derivativeException83 = new org.apache.commons.math.ode.DerivativeException("org.apache.commons.math.MathException: org.apache.commons.math.MathException: ", strArray17);
        org.apache.commons.math.ode.DerivativeException derivativeException84 = new org.apache.commons.math.ode.DerivativeException("org.apache.commons.math.FunctionEvaluationException: Evaluation failed for argument = 35", strArray17);
        org.apache.commons.math.ConvergenceException convergenceException85 = new org.apache.commons.math.ConvergenceException("org.apache.commons.math.FunctionEvaluationException", (java.lang.Throwable) derivativeException84);
        org.apache.commons.math.ode.DerivativeException derivativeException86 = new org.apache.commons.math.ode.DerivativeException((java.lang.Throwable) convergenceException85);
        org.apache.commons.math.ConvergenceException convergenceException87 = new org.apache.commons.math.ConvergenceException("org.apache.commons.math.MathException: org.apache.commons.math.FunctionEvaluationException: org.apache.commons.math.FunctionEvaluationException: Evaluation failed for argument = 35", (java.lang.Throwable) derivativeException86);
        org.junit.Assert.assertNotNull(strArray17);
        org.junit.Assert.assertNotNull(objArray36);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray36), "[1, a, 10, a, -1]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray36), "[1, a, 10, a, -1]");
        org.junit.Assert.assertNotNull(objArray39);
        org.junit.Assert.assertNotNull(objArray70);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray70), "[1, a, 10, a, -1]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray70), "[1, a, 10, a, -1]");
        org.junit.Assert.assertNotNull(objArray73);
    }

    @Test
    public void test14589() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest29.test14589");
        java.lang.String[] strArray14 = new java.lang.String[] { "hi!", "org.apache.commons.math.MathException: hi!", "", "hi!", "org.apache.commons.math.MathException: hi!" };
        org.apache.commons.math.ode.DerivativeException derivativeException15 = new org.apache.commons.math.ode.DerivativeException("hi!", strArray14);
        org.apache.commons.math.ConvergenceException convergenceException16 = new org.apache.commons.math.ConvergenceException("org.apache.commons.math.FunctionEvaluationException: hi!", (java.lang.Object[]) strArray14);
        org.apache.commons.math.ode.DerivativeException derivativeException17 = new org.apache.commons.math.ode.DerivativeException("", strArray14);
        org.apache.commons.math.ode.DerivativeException derivativeException18 = new org.apache.commons.math.ode.DerivativeException("org.apache.commons.math.FunctionEvaluationException: org.apache.commons.math.ode.IntegratorException: hi!", strArray14);
        org.apache.commons.math.ode.DerivativeException derivativeException19 = new org.apache.commons.math.ode.DerivativeException("org.apache.commons.math.ConvergenceException: Evaluation failed for argument = 52", strArray14);
        org.apache.commons.math.ode.IntegratorException integratorException20 = new org.apache.commons.math.ode.IntegratorException("org.apache.commons.math.MathException: org.apache.commons.math.MathException: org.apache.commons.math.FunctionEvaluationException: hi!", (java.lang.Object[]) strArray14);
        org.apache.commons.math.FunctionEvaluationException functionEvaluationException24 = new org.apache.commons.math.FunctionEvaluationException((double) 100L);
        org.apache.commons.math.MathException mathException25 = new org.apache.commons.math.MathException("hi!", (java.lang.Throwable) functionEvaluationException24);
        org.apache.commons.math.ode.IntegratorException integratorException26 = new org.apache.commons.math.ode.IntegratorException((java.lang.Throwable) mathException25);
        org.apache.commons.math.MathException mathException27 = new org.apache.commons.math.MathException("", (java.lang.Throwable) integratorException26);
        org.apache.commons.math.ConvergenceException convergenceException28 = new org.apache.commons.math.ConvergenceException("org.apache.commons.math.ode.IntegratorException: Evaluation failed for argument = -1", (java.lang.Object[]) strArray14, (java.lang.Throwable) mathException27);
        org.apache.commons.math.ode.DerivativeException derivativeException29 = new org.apache.commons.math.ode.DerivativeException("org.apache.commons.math.MathException: org.apache.commons.math.ConvergenceException: org.apache.commons.math.MathException: ", strArray14);
        org.apache.commons.math.ConvergenceException convergenceException30 = new org.apache.commons.math.ConvergenceException("org.apache.commons.math.ConvergenceException: org.apache.commons.math.FunctionEvaluationException: org.apache.commons.math.FunctionEvaluationException: Evaluation failed for argument = 35", (java.lang.Throwable) derivativeException29);
        org.junit.Assert.assertNotNull(strArray14);
    }

    @Test
    public void test14590() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest29.test14590");
        org.apache.commons.math.FunctionEvaluationException functionEvaluationException1 = new org.apache.commons.math.FunctionEvaluationException((double) (byte) 0);
        org.apache.commons.math.ConvergenceException convergenceException2 = new org.apache.commons.math.ConvergenceException((java.lang.Throwable) functionEvaluationException1);
        java.lang.Throwable[] throwableArray3 = convergenceException2.getSuppressed();
        org.junit.Assert.assertNotNull(throwableArray3);
    }

    @Test
    public void test14591() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest29.test14591");
        org.apache.commons.math.ode.SwitchingFunctionsHandler switchingFunctionsHandler7 = new org.apache.commons.math.ode.SwitchingFunctionsHandler();
        java.lang.Object[] objArray16 = new java.lang.Object[] { 1L, 'a', 10L, 'a', (-1) };
        org.apache.commons.math.ConvergenceException convergenceException17 = new org.apache.commons.math.ConvergenceException("", objArray16);
        org.apache.commons.math.ode.IntegratorException integratorException18 = new org.apache.commons.math.ode.IntegratorException("org.apache.commons.math.MathException: hi!", objArray16);
        java.lang.Object[] objArray19 = new java.lang.Object[] { 2, switchingFunctionsHandler7, 1, objArray16 };
        org.apache.commons.math.ConvergenceException convergenceException22 = new org.apache.commons.math.ConvergenceException("hi!");
        org.apache.commons.math.MathException mathException23 = new org.apache.commons.math.MathException("hi!", (java.lang.Throwable) convergenceException22);
        org.apache.commons.math.FunctionEvaluationException functionEvaluationException24 = new org.apache.commons.math.FunctionEvaluationException((double) (short) 0, "org.apache.commons.math.MathException: hi!", objArray16, (java.lang.Throwable) mathException23);
        org.apache.commons.math.FunctionEvaluationException functionEvaluationException26 = new org.apache.commons.math.FunctionEvaluationException((double) 100L);
        org.apache.commons.math.ConvergenceException convergenceException27 = new org.apache.commons.math.ConvergenceException("org.apache.commons.math.MathException: hi!", objArray16, (java.lang.Throwable) functionEvaluationException26);
        org.apache.commons.math.FunctionEvaluationException functionEvaluationException29 = new org.apache.commons.math.FunctionEvaluationException((double) 100L);
        org.apache.commons.math.ConvergenceException convergenceException30 = new org.apache.commons.math.ConvergenceException("org.apache.commons.math.MathException: hi!", objArray16, (java.lang.Throwable) functionEvaluationException29);
        java.lang.Object[] objArray38 = new java.lang.Object[] { 1L, 'a', 10L, 'a', (-1) };
        org.apache.commons.math.ConvergenceException convergenceException39 = new org.apache.commons.math.ConvergenceException("", objArray38);
        org.apache.commons.math.ode.IntegratorException integratorException40 = new org.apache.commons.math.ode.IntegratorException("org.apache.commons.math.MathException: hi!", objArray38);
        org.apache.commons.math.MathException mathException41 = new org.apache.commons.math.MathException((java.lang.Throwable) integratorException40);
        java.lang.Throwable[] throwableArray42 = integratorException40.getSuppressed();
        org.apache.commons.math.ode.IntegratorException integratorException43 = new org.apache.commons.math.ode.IntegratorException((java.lang.Throwable) integratorException40);
        functionEvaluationException29.addSuppressed((java.lang.Throwable) integratorException40);
        double double45 = functionEvaluationException29.getArgument();
        org.apache.commons.math.ConvergenceException convergenceException46 = new org.apache.commons.math.ConvergenceException();
        functionEvaluationException29.addSuppressed((java.lang.Throwable) convergenceException46);
        org.apache.commons.math.ConvergenceException convergenceException48 = new org.apache.commons.math.ConvergenceException("", (java.lang.Throwable) functionEvaluationException29);
        org.apache.commons.math.MathException mathException49 = new org.apache.commons.math.MathException((java.lang.Throwable) functionEvaluationException29);
        org.apache.commons.math.ConvergenceException convergenceException50 = new org.apache.commons.math.ConvergenceException((java.lang.Throwable) mathException49);
        org.apache.commons.math.ode.DerivativeException derivativeException51 = new org.apache.commons.math.ode.DerivativeException((java.lang.Throwable) mathException49);
        org.apache.commons.math.MathException mathException52 = new org.apache.commons.math.MathException((java.lang.Throwable) mathException49);
        org.apache.commons.math.MathException mathException53 = new org.apache.commons.math.MathException("org.apache.commons.math.FunctionEvaluationException: org.apache.commons.math.ode.DerivativeException: org.apache.commons.math.MathException", (java.lang.Throwable) mathException52);
        org.apache.commons.math.ode.DerivativeException derivativeException54 = new org.apache.commons.math.ode.DerivativeException((java.lang.Throwable) mathException53);
        java.lang.Class<?> wildcardClass55 = derivativeException54.getClass();
        org.junit.Assert.assertNotNull(objArray16);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray16), "[1, a, 10, a, -1]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray16), "[1, a, 10, a, -1]");
        org.junit.Assert.assertNotNull(objArray19);
        org.junit.Assert.assertNotNull(objArray38);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray38), "[1, a, 10, a, -1]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray38), "[1, a, 10, a, -1]");
        org.junit.Assert.assertNotNull(throwableArray42);
        org.junit.Assert.assertTrue("'" + double45 + "' != '" + 100.0d + "'", double45 == 100.0d);
        org.junit.Assert.assertNotNull(wildcardClass55);
    }

    @Test
    public void test14592() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest29.test14592");
        java.lang.Object[] objArray6 = new java.lang.Object[] { 100.0f, (byte) 10 };
        org.apache.commons.math.MathException mathException7 = new org.apache.commons.math.MathException("org.apache.commons.math.MathException: hi!", objArray6);
        org.apache.commons.math.ConvergenceException convergenceException8 = new org.apache.commons.math.ConvergenceException("org.apache.commons.math.FunctionEvaluationException: Evaluation failed for argument = 52", (java.lang.Throwable) mathException7);
        org.apache.commons.math.FunctionEvaluationException functionEvaluationException9 = new org.apache.commons.math.FunctionEvaluationException(Double.NaN, "org.apache.commons.math.ode.IntegratorException: org.apache.commons.math.MathException: org.apache.commons.math.FunctionEvaluationException: hi!", (java.lang.Throwable) mathException7);
        java.lang.Object[] objArray10 = mathException7.getArguments();
        org.junit.Assert.assertNotNull(objArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray6), "[100.0, 10]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray6), "[100.0, 10]");
        org.junit.Assert.assertNotNull(objArray10);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray10), "[100.0, 10]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray10), "[100.0, 10]");
    }

    @Test
    public void test14593() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest29.test14593");
        java.lang.Object[] objArray17 = new java.lang.Object[] { 1L, 'a', 10L, 'a', (-1) };
        org.apache.commons.math.ConvergenceException convergenceException18 = new org.apache.commons.math.ConvergenceException("", objArray17);
        org.apache.commons.math.FunctionEvaluationException functionEvaluationException19 = new org.apache.commons.math.FunctionEvaluationException((-1.0d), "", objArray17);
        org.apache.commons.math.ode.IntegratorException integratorException20 = new org.apache.commons.math.ode.IntegratorException("hi!", objArray17);
        org.apache.commons.math.FunctionEvaluationException functionEvaluationException23 = new org.apache.commons.math.FunctionEvaluationException((double) (short) 1, "");
        org.apache.commons.math.MathException mathException24 = new org.apache.commons.math.MathException("", objArray17, (java.lang.Throwable) functionEvaluationException23);
        org.apache.commons.math.MathException mathException25 = new org.apache.commons.math.MathException((java.lang.Throwable) functionEvaluationException23);
        java.lang.Object[] objArray26 = functionEvaluationException23.getArguments();
        java.lang.Throwable[] throwableArray27 = functionEvaluationException23.getSuppressed();
        java.lang.Object[] objArray28 = functionEvaluationException23.getArguments();
        org.apache.commons.math.ode.SwitchingFunctionsHandler switchingFunctionsHandler33 = new org.apache.commons.math.ode.SwitchingFunctionsHandler();
        java.lang.Object[] objArray42 = new java.lang.Object[] { 1L, 'a', 10L, 'a', (-1) };
        org.apache.commons.math.ConvergenceException convergenceException43 = new org.apache.commons.math.ConvergenceException("", objArray42);
        org.apache.commons.math.ode.IntegratorException integratorException44 = new org.apache.commons.math.ode.IntegratorException("org.apache.commons.math.MathException: hi!", objArray42);
        java.lang.Object[] objArray45 = new java.lang.Object[] { 2, switchingFunctionsHandler33, 1, objArray42 };
        org.apache.commons.math.ConvergenceException convergenceException48 = new org.apache.commons.math.ConvergenceException("hi!");
        org.apache.commons.math.MathException mathException49 = new org.apache.commons.math.MathException("hi!", (java.lang.Throwable) convergenceException48);
        org.apache.commons.math.FunctionEvaluationException functionEvaluationException50 = new org.apache.commons.math.FunctionEvaluationException((double) (short) 0, "org.apache.commons.math.MathException: hi!", objArray42, (java.lang.Throwable) mathException49);
        org.apache.commons.math.FunctionEvaluationException functionEvaluationException51 = new org.apache.commons.math.FunctionEvaluationException((double) (-1.0f), (java.lang.Throwable) functionEvaluationException50);
        java.lang.Object[] objArray52 = functionEvaluationException50.getArguments();
        double double53 = functionEvaluationException50.getArgument();
        org.apache.commons.math.FunctionEvaluationException functionEvaluationException54 = new org.apache.commons.math.FunctionEvaluationException((double) 10, "org.apache.commons.math.ode.IntegratorException: hi!", objArray28, (java.lang.Throwable) functionEvaluationException50);
        org.apache.commons.math.ConvergenceException convergenceException55 = new org.apache.commons.math.ConvergenceException("", objArray28);
        org.apache.commons.math.ode.IntegratorException integratorException56 = new org.apache.commons.math.ode.IntegratorException("org.apache.commons.math.FunctionEvaluationException: Evaluation failed for argument = -1", objArray28);
        org.apache.commons.math.FunctionEvaluationException functionEvaluationException57 = new org.apache.commons.math.FunctionEvaluationException(0.0d, "org.apache.commons.math.ConvergenceException: org.apache.commons.math.FunctionEvaluationException: Evaluation failed for argument = -1", objArray28);
        java.lang.String[] strArray69 = new java.lang.String[] { "hi!", "org.apache.commons.math.MathException: hi!", "", "hi!", "org.apache.commons.math.MathException: hi!" };
        org.apache.commons.math.ode.DerivativeException derivativeException70 = new org.apache.commons.math.ode.DerivativeException("hi!", strArray69);
        org.apache.commons.math.ode.IntegratorException integratorException71 = new org.apache.commons.math.ode.IntegratorException("", (java.lang.Object[]) strArray69);
        org.apache.commons.math.ode.DerivativeException derivativeException72 = new org.apache.commons.math.ode.DerivativeException("hi!", strArray69);
        org.apache.commons.math.ode.DerivativeException derivativeException73 = new org.apache.commons.math.ode.DerivativeException("org.apache.commons.math.ode.IntegratorException: ", strArray69);
        org.apache.commons.math.MathException mathException74 = new org.apache.commons.math.MathException((java.lang.Throwable) derivativeException73);
        org.apache.commons.math.FunctionEvaluationException functionEvaluationException75 = new org.apache.commons.math.FunctionEvaluationException(1.0d, "org.apache.commons.math.FunctionEvaluationException: ", (java.lang.Throwable) mathException74);
        java.lang.String str76 = mathException74.getPattern();
        org.apache.commons.math.MathException mathException77 = new org.apache.commons.math.MathException("org.apache.commons.math.ode.DerivativeException: org.apache.commons.math.ode.DerivativeException: ", objArray28, (java.lang.Throwable) mathException74);
        org.junit.Assert.assertNotNull(objArray17);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray17), "[1, a, 10, a, -1]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray17), "[1, a, 10, a, -1]");
        org.junit.Assert.assertNotNull(objArray26);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray26), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray26), "[]");
        org.junit.Assert.assertNotNull(throwableArray27);
        org.junit.Assert.assertNotNull(objArray28);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray28), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray28), "[]");
        org.junit.Assert.assertNotNull(objArray42);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray42), "[1, a, 10, a, -1]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray42), "[1, a, 10, a, -1]");
        org.junit.Assert.assertNotNull(objArray45);
        org.junit.Assert.assertNotNull(objArray52);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray52), "[1, a, 10, a, -1]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray52), "[1, a, 10, a, -1]");
        org.junit.Assert.assertTrue("'" + double53 + "' != '" + 0.0d + "'", double53 == 0.0d);
        org.junit.Assert.assertNotNull(strArray69);
        org.junit.Assert.assertEquals("'" + str76 + "' != '" + "org.apache.commons.math.ode.IntegratorException: " + "'", str76, "org.apache.commons.math.ode.IntegratorException: ");
    }

    @Test
    public void test14594() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest29.test14594");
        java.lang.Object[] objArray9 = new java.lang.Object[] { 1L, 'a', 10L, 'a', (-1) };
        org.apache.commons.math.ConvergenceException convergenceException10 = new org.apache.commons.math.ConvergenceException("", objArray9);
        org.apache.commons.math.ode.DerivativeException derivativeException11 = new org.apache.commons.math.ode.DerivativeException((java.lang.Throwable) convergenceException10);
        java.lang.Throwable[] throwableArray12 = derivativeException11.getSuppressed();
        org.apache.commons.math.ode.IntegratorException integratorException13 = new org.apache.commons.math.ode.IntegratorException("hi!", (java.lang.Object[]) throwableArray12);
        java.lang.Throwable[] throwableArray14 = integratorException13.getSuppressed();
        org.apache.commons.math.ode.IntegratorException integratorException15 = new org.apache.commons.math.ode.IntegratorException("Evaluation failed for argument = 52", (java.lang.Object[]) throwableArray14);
        java.lang.String[] strArray25 = new java.lang.String[] { "hi!", "org.apache.commons.math.MathException: hi!", "", "hi!", "org.apache.commons.math.MathException: hi!" };
        org.apache.commons.math.ode.DerivativeException derivativeException26 = new org.apache.commons.math.ode.DerivativeException("hi!", strArray25);
        org.apache.commons.math.ode.IntegratorException integratorException27 = new org.apache.commons.math.ode.IntegratorException("", (java.lang.Object[]) strArray25);
        org.apache.commons.math.ode.IntegratorException integratorException28 = new org.apache.commons.math.ode.IntegratorException("org.apache.commons.math.MathException: hi!", (java.lang.Object[]) strArray25);
        org.apache.commons.math.ode.IntegratorException integratorException29 = new org.apache.commons.math.ode.IntegratorException("org.apache.commons.math.MathException: hi!", (java.lang.Object[]) strArray25);
        org.apache.commons.math.ode.DerivativeException derivativeException30 = new org.apache.commons.math.ode.DerivativeException((java.lang.Throwable) integratorException29);
        java.lang.String[] strArray44 = new java.lang.String[] { "hi!", "org.apache.commons.math.MathException: hi!", "", "hi!", "org.apache.commons.math.MathException: hi!" };
        org.apache.commons.math.ode.DerivativeException derivativeException45 = new org.apache.commons.math.ode.DerivativeException("hi!", strArray44);
        org.apache.commons.math.MathException mathException46 = new org.apache.commons.math.MathException("hi!", (java.lang.Object[]) strArray44);
        org.apache.commons.math.ode.DerivativeException derivativeException47 = new org.apache.commons.math.ode.DerivativeException("", strArray44);
        org.apache.commons.math.ode.DerivativeException derivativeException48 = new org.apache.commons.math.ode.DerivativeException("org.apache.commons.math.ode.IntegratorException: ", strArray44);
        org.apache.commons.math.ode.IntegratorException integratorException49 = new org.apache.commons.math.ode.IntegratorException("org.apache.commons.math.ode.IntegratorException: ", (java.lang.Object[]) strArray44);
        org.apache.commons.math.ode.DerivativeException derivativeException50 = new org.apache.commons.math.ode.DerivativeException("org.apache.commons.math.MathException", strArray44);
        org.apache.commons.math.ode.DerivativeException derivativeException51 = new org.apache.commons.math.ode.DerivativeException("org.apache.commons.math.FunctionEvaluationException: Evaluation failed for argument = 100", strArray44);
        org.apache.commons.math.ConvergenceException convergenceException52 = new org.apache.commons.math.ConvergenceException("org.apache.commons.math.FunctionEvaluationException: Evaluation failed for argument = 100", (java.lang.Object[]) strArray44);
        derivativeException30.addSuppressed((java.lang.Throwable) convergenceException52);
        integratorException15.addSuppressed((java.lang.Throwable) derivativeException30);
        org.apache.commons.math.FunctionEvaluationException functionEvaluationException55 = new org.apache.commons.math.FunctionEvaluationException((double) 1L, (java.lang.Throwable) derivativeException30);
        org.apache.commons.math.ode.IntegratorException integratorException56 = new org.apache.commons.math.ode.IntegratorException((java.lang.Throwable) functionEvaluationException55);
        org.junit.Assert.assertNotNull(objArray9);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray9), "[1, a, 10, a, -1]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray9), "[1, a, 10, a, -1]");
        org.junit.Assert.assertNotNull(throwableArray12);
        org.junit.Assert.assertNotNull(throwableArray14);
        org.junit.Assert.assertNotNull(strArray25);
        org.junit.Assert.assertNotNull(strArray44);
    }

    @Test
    public void test14595() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest29.test14595");
        org.apache.commons.math.ConvergenceException convergenceException12 = new org.apache.commons.math.ConvergenceException("hi!");
        org.apache.commons.math.MathException mathException13 = new org.apache.commons.math.MathException("hi!", (java.lang.Throwable) convergenceException12);
        java.lang.Throwable[] throwableArray14 = convergenceException12.getSuppressed();
        org.apache.commons.math.ode.IntegratorException integratorException15 = new org.apache.commons.math.ode.IntegratorException("", (java.lang.Object[]) throwableArray14);
        java.lang.Object[] objArray29 = new java.lang.Object[] { 1L, 'a', 10L, 'a', (-1) };
        org.apache.commons.math.ConvergenceException convergenceException30 = new org.apache.commons.math.ConvergenceException("", objArray29);
        org.apache.commons.math.FunctionEvaluationException functionEvaluationException31 = new org.apache.commons.math.FunctionEvaluationException((-1.0d), "", objArray29);
        org.apache.commons.math.ode.IntegratorException integratorException32 = new org.apache.commons.math.ode.IntegratorException("hi!", objArray29);
        org.apache.commons.math.FunctionEvaluationException functionEvaluationException35 = new org.apache.commons.math.FunctionEvaluationException((double) (short) 1, "");
        org.apache.commons.math.MathException mathException36 = new org.apache.commons.math.MathException("", objArray29, (java.lang.Throwable) functionEvaluationException35);
        org.apache.commons.math.ConvergenceException convergenceException38 = new org.apache.commons.math.ConvergenceException("hi!");
        java.lang.String str39 = convergenceException38.getPattern();
        org.apache.commons.math.FunctionEvaluationException functionEvaluationException40 = new org.apache.commons.math.FunctionEvaluationException((double) 1L, "", objArray29, (java.lang.Throwable) convergenceException38);
        org.apache.commons.math.ConvergenceException convergenceException41 = new org.apache.commons.math.ConvergenceException("org.apache.commons.math.MathException: ", (java.lang.Throwable) functionEvaluationException40);
        org.apache.commons.math.ConvergenceException convergenceException42 = new org.apache.commons.math.ConvergenceException("org.apache.commons.math.FunctionEvaluationException: Evaluation failed for argument = -1", (java.lang.Object[]) throwableArray14, (java.lang.Throwable) functionEvaluationException40);
        org.apache.commons.math.FunctionEvaluationException functionEvaluationException43 = new org.apache.commons.math.FunctionEvaluationException((double) (short) -1, "org.apache.commons.math.ode.IntegratorException: hi!", (java.lang.Object[]) throwableArray14);
        org.apache.commons.math.FunctionEvaluationException functionEvaluationException44 = new org.apache.commons.math.FunctionEvaluationException((double) (byte) -1, "org.apache.commons.math.ConvergenceException: org.apache.commons.math.MathException: ", (java.lang.Object[]) throwableArray14);
        java.lang.Object[] objArray50 = new java.lang.Object[] { 100.0f, (byte) 10 };
        org.apache.commons.math.MathException mathException51 = new org.apache.commons.math.MathException("org.apache.commons.math.MathException: hi!", objArray50);
        org.apache.commons.math.FunctionEvaluationException functionEvaluationException52 = new org.apache.commons.math.FunctionEvaluationException(100.0d, "", objArray50);
        java.lang.Throwable[] throwableArray53 = functionEvaluationException52.getSuppressed();
        org.apache.commons.math.FunctionEvaluationException functionEvaluationException56 = new org.apache.commons.math.FunctionEvaluationException((double) (byte) 0, "org.apache.commons.math.MathException: ");
        functionEvaluationException52.addSuppressed((java.lang.Throwable) functionEvaluationException56);
        org.apache.commons.math.FunctionEvaluationException functionEvaluationException58 = new org.apache.commons.math.FunctionEvaluationException((double) (byte) 10, "org.apache.commons.math.MathException: Evaluation failed for argument = 52", (java.lang.Object[]) throwableArray14, (java.lang.Throwable) functionEvaluationException52);
        org.apache.commons.math.ConvergenceException convergenceException62 = new org.apache.commons.math.ConvergenceException("hi!");
        org.apache.commons.math.MathException mathException63 = new org.apache.commons.math.MathException("hi!", (java.lang.Throwable) convergenceException62);
        java.lang.Throwable[] throwableArray64 = convergenceException62.getSuppressed();
        java.lang.Object[] objArray76 = new java.lang.Object[] { 1L, 'a', 10L, 'a', (-1) };
        org.apache.commons.math.ConvergenceException convergenceException77 = new org.apache.commons.math.ConvergenceException("", objArray76);
        org.apache.commons.math.ode.IntegratorException integratorException78 = new org.apache.commons.math.ode.IntegratorException("org.apache.commons.math.MathException: hi!", objArray76);
        org.apache.commons.math.MathException mathException79 = new org.apache.commons.math.MathException((java.lang.Throwable) integratorException78);
        java.lang.Throwable[] throwableArray80 = integratorException78.getSuppressed();
        org.apache.commons.math.MathException mathException81 = new org.apache.commons.math.MathException("", (java.lang.Object[]) throwableArray80);
        java.lang.Throwable[] throwableArray82 = mathException81.getSuppressed();
        org.apache.commons.math.MathException mathException83 = new org.apache.commons.math.MathException("org.apache.commons.math.MathException: hi!", (java.lang.Object[]) throwableArray82);
        org.apache.commons.math.FunctionEvaluationException functionEvaluationException86 = new org.apache.commons.math.FunctionEvaluationException((double) 100L);
        org.apache.commons.math.MathException mathException87 = new org.apache.commons.math.MathException("hi!", (java.lang.Throwable) functionEvaluationException86);
        org.apache.commons.math.FunctionEvaluationException functionEvaluationException88 = new org.apache.commons.math.FunctionEvaluationException((double) (byte) 100, "", (java.lang.Object[]) throwableArray82, (java.lang.Throwable) functionEvaluationException86);
        org.apache.commons.math.ConvergenceException convergenceException89 = new org.apache.commons.math.ConvergenceException("org.apache.commons.math.ode.IntegratorException: hi!", (java.lang.Object[]) throwableArray64, (java.lang.Throwable) functionEvaluationException86);
        org.apache.commons.math.MathException mathException90 = new org.apache.commons.math.MathException("org.apache.commons.math.ode.DerivativeException: org.apache.commons.math.ode.DerivativeException: org.apache.commons.math.MathException: ", (java.lang.Object[]) throwableArray14, (java.lang.Throwable) convergenceException89);
        org.apache.commons.math.ode.IntegratorException integratorException91 = new org.apache.commons.math.ode.IntegratorException((java.lang.Throwable) mathException90);
        org.apache.commons.math.MathException mathException92 = new org.apache.commons.math.MathException("", (java.lang.Throwable) integratorException91);
        org.junit.Assert.assertNotNull(throwableArray14);
        org.junit.Assert.assertNotNull(objArray29);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray29), "[1, a, 10, a, -1]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray29), "[1, a, 10, a, -1]");
        org.junit.Assert.assertEquals("'" + str39 + "' != '" + "hi!" + "'", str39, "hi!");
        org.junit.Assert.assertNotNull(objArray50);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray50), "[100.0, 10]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray50), "[100.0, 10]");
        org.junit.Assert.assertNotNull(throwableArray53);
        org.junit.Assert.assertNotNull(throwableArray64);
        org.junit.Assert.assertNotNull(objArray76);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray76), "[1, a, 10, a, -1]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray76), "[1, a, 10, a, -1]");
        org.junit.Assert.assertNotNull(throwableArray80);
        org.junit.Assert.assertNotNull(throwableArray82);
    }

    @Test
    public void test14596() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest29.test14596");
        java.lang.String[] strArray16 = new java.lang.String[] { "hi!", "org.apache.commons.math.MathException: hi!", "", "hi!", "org.apache.commons.math.MathException: hi!" };
        org.apache.commons.math.ode.DerivativeException derivativeException17 = new org.apache.commons.math.ode.DerivativeException("hi!", strArray16);
        org.apache.commons.math.ode.IntegratorException integratorException18 = new org.apache.commons.math.ode.IntegratorException("", (java.lang.Object[]) strArray16);
        org.apache.commons.math.FunctionEvaluationException functionEvaluationException19 = new org.apache.commons.math.FunctionEvaluationException((double) (byte) -1, "hi!", (java.lang.Object[]) strArray16);
        org.apache.commons.math.ode.DerivativeException derivativeException20 = new org.apache.commons.math.ode.DerivativeException("org.apache.commons.math.FunctionEvaluationException: Evaluation failed for argument = 35", strArray16);
        org.apache.commons.math.MathException mathException21 = new org.apache.commons.math.MathException("", (java.lang.Object[]) strArray16);
        java.lang.String[] strArray33 = new java.lang.String[] { "hi!", "org.apache.commons.math.MathException: hi!", "", "hi!", "org.apache.commons.math.MathException: hi!" };
        org.apache.commons.math.ode.DerivativeException derivativeException34 = new org.apache.commons.math.ode.DerivativeException("hi!", strArray33);
        org.apache.commons.math.ConvergenceException convergenceException35 = new org.apache.commons.math.ConvergenceException("", (java.lang.Object[]) strArray33);
        org.apache.commons.math.ConvergenceException convergenceException36 = new org.apache.commons.math.ConvergenceException("", (java.lang.Object[]) strArray33);
        org.apache.commons.math.ode.IntegratorException integratorException37 = new org.apache.commons.math.ode.IntegratorException((java.lang.Throwable) convergenceException36);
        java.lang.String str38 = convergenceException36.getPattern();
        org.apache.commons.math.ConvergenceException convergenceException39 = new org.apache.commons.math.ConvergenceException("org.apache.commons.math.FunctionEvaluationException: org.apache.commons.math.FunctionEvaluationException: Evaluation failed for argument = 35", (java.lang.Throwable) convergenceException36);
        org.apache.commons.math.FunctionEvaluationException functionEvaluationException42 = new org.apache.commons.math.FunctionEvaluationException((double) (byte) 0, "org.apache.commons.math.MathException: org.apache.commons.math.ode.IntegratorException: org.apache.commons.math.MathException: ");
        convergenceException36.addSuppressed((java.lang.Throwable) functionEvaluationException42);
        org.apache.commons.math.FunctionEvaluationException functionEvaluationException44 = new org.apache.commons.math.FunctionEvaluationException((double) (short) 1, "org.apache.commons.math.FunctionEvaluationException", (java.lang.Throwable) convergenceException36);
        org.apache.commons.math.FunctionEvaluationException functionEvaluationException45 = new org.apache.commons.math.FunctionEvaluationException(1.0d, "org.apache.commons.math.ConvergenceException: org.apache.commons.math.MathException: Evaluation failed for argument = 52", (java.lang.Object[]) strArray16, (java.lang.Throwable) convergenceException36);
        org.apache.commons.math.ode.DerivativeException derivativeException46 = new org.apache.commons.math.ode.DerivativeException("Evaluation failed for argument = 100", strArray16);
        org.apache.commons.math.FunctionEvaluationException functionEvaluationException49 = new org.apache.commons.math.FunctionEvaluationException((double) (short) 10, "org.apache.commons.math.FunctionEvaluationException: Evaluation failed for argument = 0");
        java.lang.Object[] objArray62 = new java.lang.Object[] { 1L, 'a', 10L, 'a', (-1) };
        org.apache.commons.math.ConvergenceException convergenceException63 = new org.apache.commons.math.ConvergenceException("", objArray62);
        org.apache.commons.math.FunctionEvaluationException functionEvaluationException64 = new org.apache.commons.math.FunctionEvaluationException((-1.0d), "", objArray62);
        org.apache.commons.math.ode.IntegratorException integratorException65 = new org.apache.commons.math.ode.IntegratorException("hi!", objArray62);
        org.apache.commons.math.FunctionEvaluationException functionEvaluationException68 = new org.apache.commons.math.FunctionEvaluationException((double) (short) 1, "");
        org.apache.commons.math.MathException mathException69 = new org.apache.commons.math.MathException("", objArray62, (java.lang.Throwable) functionEvaluationException68);
        org.apache.commons.math.ConvergenceException convergenceException71 = new org.apache.commons.math.ConvergenceException("hi!");
        java.lang.String str72 = convergenceException71.getPattern();
        org.apache.commons.math.FunctionEvaluationException functionEvaluationException73 = new org.apache.commons.math.FunctionEvaluationException((double) 1L, "", objArray62, (java.lang.Throwable) convergenceException71);
        org.apache.commons.math.ConvergenceException convergenceException74 = new org.apache.commons.math.ConvergenceException((java.lang.Throwable) functionEvaluationException73);
        org.apache.commons.math.ConvergenceException convergenceException75 = new org.apache.commons.math.ConvergenceException((java.lang.Throwable) functionEvaluationException73);
        functionEvaluationException49.addSuppressed((java.lang.Throwable) functionEvaluationException73);
        org.apache.commons.math.MathException mathException77 = new org.apache.commons.math.MathException((java.lang.Throwable) functionEvaluationException49);
        org.apache.commons.math.FunctionEvaluationException functionEvaluationException78 = new org.apache.commons.math.FunctionEvaluationException((double) 0, "org.apache.commons.math.ode.IntegratorException: org.apache.commons.math.ConvergenceException: org.apache.commons.math.MathException: org.apache.commons.math.FunctionEvaluationException: hi!", (java.lang.Object[]) strArray16, (java.lang.Throwable) functionEvaluationException49);
        java.lang.Throwable[] throwableArray79 = functionEvaluationException49.getSuppressed();
        org.apache.commons.math.ConvergenceException convergenceException80 = new org.apache.commons.math.ConvergenceException((java.lang.Throwable) functionEvaluationException49);
        org.junit.Assert.assertNotNull(strArray16);
        org.junit.Assert.assertNotNull(strArray33);
        org.junit.Assert.assertEquals("'" + str38 + "' != '" + "" + "'", str38, "");
        org.junit.Assert.assertNotNull(objArray62);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray62), "[1, a, 10, a, -1]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray62), "[1, a, 10, a, -1]");
        org.junit.Assert.assertEquals("'" + str72 + "' != '" + "hi!" + "'", str72, "hi!");
        org.junit.Assert.assertNotNull(throwableArray79);
    }

    @Test
    public void test14597() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest29.test14597");
        java.lang.Object[] objArray11 = new java.lang.Object[] { 1L, 'a', 10L, 'a', (-1) };
        org.apache.commons.math.ConvergenceException convergenceException12 = new org.apache.commons.math.ConvergenceException("", objArray11);
        org.apache.commons.math.ode.IntegratorException integratorException13 = new org.apache.commons.math.ode.IntegratorException("org.apache.commons.math.MathException: hi!", objArray11);
        org.apache.commons.math.MathException mathException14 = new org.apache.commons.math.MathException((java.lang.Throwable) integratorException13);
        java.lang.Throwable[] throwableArray15 = integratorException13.getSuppressed();
        org.apache.commons.math.MathException mathException16 = new org.apache.commons.math.MathException("", (java.lang.Object[]) throwableArray15);
        org.apache.commons.math.MathException mathException17 = new org.apache.commons.math.MathException("org.apache.commons.math.FunctionEvaluationException: hi!", (java.lang.Throwable) mathException16);
        org.apache.commons.math.FunctionEvaluationException functionEvaluationException18 = new org.apache.commons.math.FunctionEvaluationException((double) (byte) 100, "org.apache.commons.math.ode.IntegratorException: org.apache.commons.math.MathException: hi!", (java.lang.Throwable) mathException17);
        java.lang.Object[] objArray29 = new java.lang.Object[] { 1L, 'a', 10L, 'a', (-1) };
        org.apache.commons.math.ConvergenceException convergenceException30 = new org.apache.commons.math.ConvergenceException("", objArray29);
        org.apache.commons.math.ode.DerivativeException derivativeException31 = new org.apache.commons.math.ode.DerivativeException((java.lang.Throwable) convergenceException30);
        org.apache.commons.math.ode.IntegratorException integratorException32 = new org.apache.commons.math.ode.IntegratorException((java.lang.Throwable) derivativeException31);
        org.apache.commons.math.FunctionEvaluationException functionEvaluationException33 = new org.apache.commons.math.FunctionEvaluationException(0.0d, (java.lang.Throwable) integratorException32);
        org.apache.commons.math.MathException mathException34 = new org.apache.commons.math.MathException("org.apache.commons.math.ConvergenceException: org.apache.commons.math.FunctionEvaluationException: Evaluation failed for argument = -1", (java.lang.Throwable) functionEvaluationException33);
        org.apache.commons.math.FunctionEvaluationException functionEvaluationException35 = new org.apache.commons.math.FunctionEvaluationException((double) 'a', (java.lang.Throwable) functionEvaluationException33);
        java.lang.String str36 = functionEvaluationException33.getPattern();
        org.apache.commons.math.ConvergenceException convergenceException37 = new org.apache.commons.math.ConvergenceException("org.apache.commons.math.MathException: ", (java.lang.Throwable) functionEvaluationException33);
        functionEvaluationException18.addSuppressed((java.lang.Throwable) functionEvaluationException33);
        org.apache.commons.math.MathException mathException39 = new org.apache.commons.math.MathException((java.lang.Throwable) functionEvaluationException18);
        org.junit.Assert.assertNotNull(objArray11);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray11), "[1, a, 10, a, -1]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray11), "[1, a, 10, a, -1]");
        org.junit.Assert.assertNotNull(throwableArray15);
        org.junit.Assert.assertNotNull(objArray29);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray29), "[1, a, 10, a, -1]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray29), "[1, a, 10, a, -1]");
        org.junit.Assert.assertEquals("'" + str36 + "' != '" + "" + "'", str36, "");
    }

    @Test
    public void test14598() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest29.test14598");
        org.apache.commons.math.ode.SwitchingFunctionsHandler switchingFunctionsHandler0 = new org.apache.commons.math.ode.SwitchingFunctionsHandler();
        boolean boolean1 = switchingFunctionsHandler0.isEmpty();
        double[] doubleArray4 = new double[] { 100.0d };
        boolean boolean5 = switchingFunctionsHandler0.reset((double) 0L, doubleArray4);
        org.apache.commons.math.ode.SwitchingFunctionsHandler switchingFunctionsHandler7 = new org.apache.commons.math.ode.SwitchingFunctionsHandler();
        boolean boolean8 = switchingFunctionsHandler7.isEmpty();
        org.apache.commons.math.ode.StepInterpolator stepInterpolator9 = null;
        boolean boolean10 = switchingFunctionsHandler7.evaluateStep(stepInterpolator9);
        org.apache.commons.math.ode.SwitchingFunctionsHandler switchingFunctionsHandler12 = new org.apache.commons.math.ode.SwitchingFunctionsHandler();
        boolean boolean13 = switchingFunctionsHandler12.isEmpty();
        double[] doubleArray16 = new double[] { 100.0d };
        boolean boolean17 = switchingFunctionsHandler12.reset((double) 0L, doubleArray16);
        boolean boolean18 = switchingFunctionsHandler7.reset((double) 1, doubleArray16);
        boolean boolean19 = switchingFunctionsHandler0.reset((double) 100, doubleArray16);
        double double20 = switchingFunctionsHandler0.getEventTime();
        boolean boolean21 = switchingFunctionsHandler0.stop();
        boolean boolean22 = switchingFunctionsHandler0.isEmpty();
        double double23 = switchingFunctionsHandler0.getEventTime();
        boolean boolean24 = switchingFunctionsHandler0.stop();
        org.apache.commons.math.ode.StepInterpolator stepInterpolator25 = null;
        boolean boolean26 = switchingFunctionsHandler0.evaluateStep(stepInterpolator25);
        double double27 = switchingFunctionsHandler0.getEventTime();
        java.lang.Class<?> wildcardClass28 = switchingFunctionsHandler0.getClass();
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertNotNull(doubleArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray4), "[100.0]");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertNotNull(doubleArray16);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray16), "[100.0]");
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertTrue(Double.isNaN(double20));
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + true + "'", boolean22 == true);
        org.junit.Assert.assertTrue(Double.isNaN(double23));
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
        org.junit.Assert.assertTrue(Double.isNaN(double27));
        org.junit.Assert.assertNotNull(wildcardClass28);
    }

    @Test
    public void test14599() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest29.test14599");
        java.lang.Object[] objArray14 = new java.lang.Object[] { 1L, 'a', 10L, 'a', (-1) };
        org.apache.commons.math.ConvergenceException convergenceException15 = new org.apache.commons.math.ConvergenceException("", objArray14);
        org.apache.commons.math.ode.DerivativeException derivativeException16 = new org.apache.commons.math.ode.DerivativeException((java.lang.Throwable) convergenceException15);
        java.lang.Throwable[] throwableArray17 = derivativeException16.getSuppressed();
        java.lang.String[] strArray26 = new java.lang.String[] { "hi!", "org.apache.commons.math.MathException: hi!", "", "hi!", "org.apache.commons.math.MathException: hi!" };
        org.apache.commons.math.ode.DerivativeException derivativeException27 = new org.apache.commons.math.ode.DerivativeException("hi!", strArray26);
        org.apache.commons.math.ConvergenceException convergenceException28 = new org.apache.commons.math.ConvergenceException("", (java.lang.Object[]) strArray26);
        org.apache.commons.math.ode.SwitchingFunctionsHandler switchingFunctionsHandler34 = new org.apache.commons.math.ode.SwitchingFunctionsHandler();
        java.lang.Object[] objArray43 = new java.lang.Object[] { 1L, 'a', 10L, 'a', (-1) };
        org.apache.commons.math.ConvergenceException convergenceException44 = new org.apache.commons.math.ConvergenceException("", objArray43);
        org.apache.commons.math.ode.IntegratorException integratorException45 = new org.apache.commons.math.ode.IntegratorException("org.apache.commons.math.MathException: hi!", objArray43);
        java.lang.Object[] objArray46 = new java.lang.Object[] { 2, switchingFunctionsHandler34, 1, objArray43 };
        org.apache.commons.math.ConvergenceException convergenceException49 = new org.apache.commons.math.ConvergenceException("hi!");
        org.apache.commons.math.MathException mathException50 = new org.apache.commons.math.MathException("hi!", (java.lang.Throwable) convergenceException49);
        org.apache.commons.math.FunctionEvaluationException functionEvaluationException51 = new org.apache.commons.math.FunctionEvaluationException((double) (short) 0, "org.apache.commons.math.MathException: hi!", objArray43, (java.lang.Throwable) mathException50);
        org.apache.commons.math.FunctionEvaluationException functionEvaluationException53 = new org.apache.commons.math.FunctionEvaluationException((double) 100L);
        org.apache.commons.math.ConvergenceException convergenceException54 = new org.apache.commons.math.ConvergenceException("org.apache.commons.math.MathException: hi!", objArray43, (java.lang.Throwable) functionEvaluationException53);
        org.apache.commons.math.FunctionEvaluationException functionEvaluationException56 = new org.apache.commons.math.FunctionEvaluationException((double) 100L);
        org.apache.commons.math.ConvergenceException convergenceException57 = new org.apache.commons.math.ConvergenceException("org.apache.commons.math.MathException: hi!", objArray43, (java.lang.Throwable) functionEvaluationException56);
        org.apache.commons.math.MathException mathException58 = new org.apache.commons.math.MathException("org.apache.commons.math.MathException: ", (java.lang.Object[]) strArray26, (java.lang.Throwable) functionEvaluationException56);
        org.apache.commons.math.MathException mathException59 = new org.apache.commons.math.MathException("", (java.lang.Object[]) throwableArray17, (java.lang.Throwable) mathException58);
        org.apache.commons.math.FunctionEvaluationException functionEvaluationException60 = new org.apache.commons.math.FunctionEvaluationException(0.0d, "org.apache.commons.math.ode.IntegratorException: hi!", (java.lang.Throwable) mathException59);
        org.apache.commons.math.ConvergenceException convergenceException61 = new org.apache.commons.math.ConvergenceException("org.apache.commons.math.FunctionEvaluationException: ", (java.lang.Throwable) functionEvaluationException60);
        org.apache.commons.math.FunctionEvaluationException functionEvaluationException62 = new org.apache.commons.math.FunctionEvaluationException((double) (-1), "org.apache.commons.math.FunctionEvaluationException: hi!", (java.lang.Throwable) convergenceException61);
        java.lang.String[] strArray72 = new java.lang.String[] { "hi!", "org.apache.commons.math.MathException: hi!", "", "hi!", "org.apache.commons.math.MathException: hi!" };
        org.apache.commons.math.ode.DerivativeException derivativeException73 = new org.apache.commons.math.ode.DerivativeException("hi!", strArray72);
        org.apache.commons.math.ConvergenceException convergenceException74 = new org.apache.commons.math.ConvergenceException("", (java.lang.Object[]) strArray72);
        org.apache.commons.math.ode.DerivativeException derivativeException75 = new org.apache.commons.math.ode.DerivativeException("hi!", strArray72);
        java.lang.Throwable throwable76 = null;
        org.apache.commons.math.MathException mathException77 = new org.apache.commons.math.MathException("org.apache.commons.math.ConvergenceException: org.apache.commons.math.FunctionEvaluationException: hi!", (java.lang.Object[]) strArray72, throwable76);
        convergenceException61.addSuppressed((java.lang.Throwable) mathException77);
        org.apache.commons.math.MathException mathException79 = new org.apache.commons.math.MathException("org.apache.commons.math.FunctionEvaluationException: org.apache.commons.math.ConvergenceException: org.apache.commons.math.FunctionEvaluationException: Evaluation failed for argument = 35", (java.lang.Throwable) convergenceException61);
        org.apache.commons.math.FunctionEvaluationException functionEvaluationException80 = new org.apache.commons.math.FunctionEvaluationException(0.0d, (java.lang.Throwable) convergenceException61);
        org.junit.Assert.assertNotNull(objArray14);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray14), "[1, a, 10, a, -1]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray14), "[1, a, 10, a, -1]");
        org.junit.Assert.assertNotNull(throwableArray17);
        org.junit.Assert.assertNotNull(strArray26);
        org.junit.Assert.assertNotNull(objArray43);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray43), "[1, a, 10, a, -1]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray43), "[1, a, 10, a, -1]");
        org.junit.Assert.assertNotNull(objArray46);
        org.junit.Assert.assertNotNull(strArray72);
    }

    @Test
    public void test14600() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest29.test14600");
        org.apache.commons.math.FunctionEvaluationException functionEvaluationException3 = new org.apache.commons.math.FunctionEvaluationException((double) (short) -1);
        org.apache.commons.math.ode.IntegratorException integratorException4 = new org.apache.commons.math.ode.IntegratorException((java.lang.Throwable) functionEvaluationException3);
        java.lang.Throwable[] throwableArray5 = functionEvaluationException3.getSuppressed();
        org.apache.commons.math.ode.IntegratorException integratorException6 = new org.apache.commons.math.ode.IntegratorException((java.lang.Throwable) functionEvaluationException3);
        org.apache.commons.math.ConvergenceException convergenceException7 = new org.apache.commons.math.ConvergenceException("org.apache.commons.math.MathException: org.apache.commons.math.FunctionEvaluationException: org.apache.commons.math.FunctionEvaluationException: hi!", (java.lang.Throwable) functionEvaluationException3);
        org.apache.commons.math.ConvergenceException convergenceException8 = new org.apache.commons.math.ConvergenceException("org.apache.commons.math.FunctionEvaluationException: org.apache.commons.math.ConvergenceException: org.apache.commons.math.FunctionEvaluationException: hi!", (java.lang.Throwable) functionEvaluationException3);
        org.apache.commons.math.MathException mathException9 = new org.apache.commons.math.MathException((java.lang.Throwable) convergenceException8);
        org.junit.Assert.assertNotNull(throwableArray5);
    }

    @Test
    public void test14601() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest29.test14601");
        org.apache.commons.math.ode.SwitchingFunctionsHandler switchingFunctionsHandler0 = new org.apache.commons.math.ode.SwitchingFunctionsHandler();
        org.apache.commons.math.ode.SwitchingFunction switchingFunction1 = null;
        switchingFunctionsHandler0.add(switchingFunction1, (double) (-1), (double) 3, 0);
        double[] doubleArray13 = new double[] { 0L, 10.0d, 'a', 0.0d, (-1.0d), 0 };
        boolean boolean14 = switchingFunctionsHandler0.reset((double) (-1), doubleArray13);
        boolean boolean15 = switchingFunctionsHandler0.isEmpty();
        double double16 = switchingFunctionsHandler0.getEventTime();
        org.apache.commons.math.ode.SwitchingFunction switchingFunction17 = null;
        switchingFunctionsHandler0.add(switchingFunction17, (double) (-1.0f), 0.0d, (int) (short) -1);
        boolean boolean22 = switchingFunctionsHandler0.stop();
        org.apache.commons.math.ode.SwitchingFunction switchingFunction23 = null;
        switchingFunctionsHandler0.add(switchingFunction23, (double) 1.0f, (double) 2, (int) 'a');
        org.apache.commons.math.ode.SwitchingFunctionsHandler switchingFunctionsHandler29 = new org.apache.commons.math.ode.SwitchingFunctionsHandler();
        boolean boolean30 = switchingFunctionsHandler29.isEmpty();
        boolean boolean31 = switchingFunctionsHandler29.stop();
        double double32 = switchingFunctionsHandler29.getEventTime();
        org.apache.commons.math.ode.SwitchingFunction switchingFunction33 = null;
        switchingFunctionsHandler29.add(switchingFunction33, (double) (-1.0f), (double) (short) 10, (int) (byte) 100);
        org.apache.commons.math.ode.SwitchingFunctionsHandler switchingFunctionsHandler39 = new org.apache.commons.math.ode.SwitchingFunctionsHandler();
        boolean boolean40 = switchingFunctionsHandler39.isEmpty();
        double[] doubleArray43 = new double[] { 100.0d };
        boolean boolean44 = switchingFunctionsHandler39.reset((double) 0L, doubleArray43);
        org.apache.commons.math.ode.SwitchingFunctionsHandler switchingFunctionsHandler46 = new org.apache.commons.math.ode.SwitchingFunctionsHandler();
        boolean boolean47 = switchingFunctionsHandler46.isEmpty();
        org.apache.commons.math.ode.StepInterpolator stepInterpolator48 = null;
        boolean boolean49 = switchingFunctionsHandler46.evaluateStep(stepInterpolator48);
        org.apache.commons.math.ode.SwitchingFunctionsHandler switchingFunctionsHandler51 = new org.apache.commons.math.ode.SwitchingFunctionsHandler();
        boolean boolean52 = switchingFunctionsHandler51.isEmpty();
        double[] doubleArray55 = new double[] { 100.0d };
        boolean boolean56 = switchingFunctionsHandler51.reset((double) 0L, doubleArray55);
        boolean boolean57 = switchingFunctionsHandler46.reset((double) 1, doubleArray55);
        boolean boolean58 = switchingFunctionsHandler39.reset((double) 100, doubleArray55);
        double double59 = switchingFunctionsHandler39.getEventTime();
        org.apache.commons.math.ode.SwitchingFunctionsHandler switchingFunctionsHandler61 = new org.apache.commons.math.ode.SwitchingFunctionsHandler();
        boolean boolean62 = switchingFunctionsHandler61.isEmpty();
        double[] doubleArray65 = new double[] { 100.0d };
        boolean boolean66 = switchingFunctionsHandler61.reset((double) 0L, doubleArray65);
        switchingFunctionsHandler39.stepAccepted(0.0d, doubleArray65);
        boolean boolean68 = switchingFunctionsHandler29.reset((double) 2, doubleArray65);
        boolean boolean69 = switchingFunctionsHandler0.reset((double) (byte) -1, doubleArray65);
        org.apache.commons.math.ode.SwitchingFunction switchingFunction70 = null;
        switchingFunctionsHandler0.add(switchingFunction70, 0.0d, (double) 100.0f, (int) (short) 1);
        org.junit.Assert.assertNotNull(doubleArray13);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray13), "[0.0, 10.0, 97.0, 0.0, -1.0, 0.0]");
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue(Double.isNaN(double16));
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + true + "'", boolean30 == true);
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + false + "'", boolean31 == false);
        org.junit.Assert.assertTrue(Double.isNaN(double32));
        org.junit.Assert.assertTrue("'" + boolean40 + "' != '" + true + "'", boolean40 == true);
        org.junit.Assert.assertNotNull(doubleArray43);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray43), "[100.0]");
        org.junit.Assert.assertTrue("'" + boolean44 + "' != '" + false + "'", boolean44 == false);
        org.junit.Assert.assertTrue("'" + boolean47 + "' != '" + true + "'", boolean47 == true);
        org.junit.Assert.assertTrue("'" + boolean49 + "' != '" + false + "'", boolean49 == false);
        org.junit.Assert.assertTrue("'" + boolean52 + "' != '" + true + "'", boolean52 == true);
        org.junit.Assert.assertNotNull(doubleArray55);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray55), "[100.0]");
        org.junit.Assert.assertTrue("'" + boolean56 + "' != '" + false + "'", boolean56 == false);
        org.junit.Assert.assertTrue("'" + boolean57 + "' != '" + false + "'", boolean57 == false);
        org.junit.Assert.assertTrue("'" + boolean58 + "' != '" + false + "'", boolean58 == false);
        org.junit.Assert.assertTrue(Double.isNaN(double59));
        org.junit.Assert.assertTrue("'" + boolean62 + "' != '" + true + "'", boolean62 == true);
        org.junit.Assert.assertNotNull(doubleArray65);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray65), "[100.0]");
        org.junit.Assert.assertTrue("'" + boolean66 + "' != '" + false + "'", boolean66 == false);
        org.junit.Assert.assertTrue("'" + boolean68 + "' != '" + false + "'", boolean68 == false);
        org.junit.Assert.assertTrue("'" + boolean69 + "' != '" + false + "'", boolean69 == false);
    }

    @Test
    public void test14602() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest29.test14602");
        org.apache.commons.math.FunctionEvaluationException functionEvaluationException3 = new org.apache.commons.math.FunctionEvaluationException((double) (-1.0f), "");
        org.apache.commons.math.FunctionEvaluationException functionEvaluationException7 = new org.apache.commons.math.FunctionEvaluationException((double) (byte) 100);
        org.apache.commons.math.ConvergenceException convergenceException8 = new org.apache.commons.math.ConvergenceException((java.lang.Throwable) functionEvaluationException7);
        java.lang.Object[] objArray9 = functionEvaluationException7.getArguments();
        java.lang.Throwable throwable10 = null;
        org.apache.commons.math.MathException mathException11 = new org.apache.commons.math.MathException("hi!", objArray9, throwable10);
        org.apache.commons.math.FunctionEvaluationException functionEvaluationException14 = new org.apache.commons.math.FunctionEvaluationException((double) '4');
        org.apache.commons.math.MathException mathException15 = new org.apache.commons.math.MathException((java.lang.Throwable) functionEvaluationException14);
        double double16 = functionEvaluationException14.getArgument();
        org.apache.commons.math.MathException mathException17 = new org.apache.commons.math.MathException("org.apache.commons.math.ode.DerivativeException: ", (java.lang.Throwable) functionEvaluationException14);
        org.apache.commons.math.ConvergenceException convergenceException18 = new org.apache.commons.math.ConvergenceException("org.apache.commons.math.MathException: ", objArray9, (java.lang.Throwable) functionEvaluationException14);
        org.apache.commons.math.ode.IntegratorException integratorException19 = new org.apache.commons.math.ode.IntegratorException((java.lang.Throwable) functionEvaluationException14);
        functionEvaluationException3.addSuppressed((java.lang.Throwable) functionEvaluationException14);
        java.lang.String[] strArray35 = new java.lang.String[] { "hi!", "org.apache.commons.math.MathException: hi!", "", "hi!", "org.apache.commons.math.MathException: hi!" };
        org.apache.commons.math.ode.DerivativeException derivativeException36 = new org.apache.commons.math.ode.DerivativeException("hi!", strArray35);
        org.apache.commons.math.ode.IntegratorException integratorException37 = new org.apache.commons.math.ode.IntegratorException("", (java.lang.Object[]) strArray35);
        org.apache.commons.math.ode.DerivativeException derivativeException38 = new org.apache.commons.math.ode.DerivativeException("hi!", strArray35);
        org.apache.commons.math.ode.SwitchingFunctionsHandler switchingFunctionsHandler45 = new org.apache.commons.math.ode.SwitchingFunctionsHandler();
        java.lang.Object[] objArray54 = new java.lang.Object[] { 1L, 'a', 10L, 'a', (-1) };
        org.apache.commons.math.ConvergenceException convergenceException55 = new org.apache.commons.math.ConvergenceException("", objArray54);
        org.apache.commons.math.ode.IntegratorException integratorException56 = new org.apache.commons.math.ode.IntegratorException("org.apache.commons.math.MathException: hi!", objArray54);
        java.lang.Object[] objArray57 = new java.lang.Object[] { 2, switchingFunctionsHandler45, 1, objArray54 };
        org.apache.commons.math.ConvergenceException convergenceException60 = new org.apache.commons.math.ConvergenceException("hi!");
        org.apache.commons.math.MathException mathException61 = new org.apache.commons.math.MathException("hi!", (java.lang.Throwable) convergenceException60);
        org.apache.commons.math.FunctionEvaluationException functionEvaluationException62 = new org.apache.commons.math.FunctionEvaluationException((double) (short) 0, "org.apache.commons.math.MathException: hi!", objArray54, (java.lang.Throwable) mathException61);
        org.apache.commons.math.FunctionEvaluationException functionEvaluationException64 = new org.apache.commons.math.FunctionEvaluationException((double) 100L);
        org.apache.commons.math.ConvergenceException convergenceException65 = new org.apache.commons.math.ConvergenceException("org.apache.commons.math.MathException: hi!", objArray54, (java.lang.Throwable) functionEvaluationException64);
        org.apache.commons.math.FunctionEvaluationException functionEvaluationException67 = new org.apache.commons.math.FunctionEvaluationException((double) 100L);
        org.apache.commons.math.ConvergenceException convergenceException68 = new org.apache.commons.math.ConvergenceException("org.apache.commons.math.MathException: hi!", objArray54, (java.lang.Throwable) functionEvaluationException67);
        org.apache.commons.math.ConvergenceException convergenceException69 = new org.apache.commons.math.ConvergenceException("org.apache.commons.math.MathException: hi!", objArray54);
        org.apache.commons.math.ConvergenceException convergenceException70 = new org.apache.commons.math.ConvergenceException((java.lang.Throwable) convergenceException69);
        org.apache.commons.math.FunctionEvaluationException functionEvaluationException71 = new org.apache.commons.math.FunctionEvaluationException((double) (byte) -1, "org.apache.commons.math.ConvergenceException: org.apache.commons.math.FunctionEvaluationException: hi!", (java.lang.Object[]) strArray35, (java.lang.Throwable) convergenceException70);
        org.apache.commons.math.ConvergenceException convergenceException72 = new org.apache.commons.math.ConvergenceException("org.apache.commons.math.ode.IntegratorException: ", (java.lang.Object[]) strArray35);
        org.apache.commons.math.ode.DerivativeException derivativeException73 = new org.apache.commons.math.ode.DerivativeException("", strArray35);
        org.apache.commons.math.FunctionEvaluationException functionEvaluationException74 = new org.apache.commons.math.FunctionEvaluationException((double) (-1.0f), "org.apache.commons.math.ConvergenceException: org.apache.commons.math.MathException: hi!", (java.lang.Object[]) strArray35);
        functionEvaluationException14.addSuppressed((java.lang.Throwable) functionEvaluationException74);
        double double76 = functionEvaluationException14.getArgument();
        org.apache.commons.math.FunctionEvaluationException functionEvaluationException77 = new org.apache.commons.math.FunctionEvaluationException(0.0d, (java.lang.Throwable) functionEvaluationException14);
        org.apache.commons.math.ode.IntegratorException integratorException78 = new org.apache.commons.math.ode.IntegratorException((java.lang.Throwable) functionEvaluationException77);
        java.lang.String str79 = functionEvaluationException77.toString();
        org.junit.Assert.assertNotNull(objArray9);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray9), "[100.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray9), "[100.0]");
        org.junit.Assert.assertTrue("'" + double16 + "' != '" + 52.0d + "'", double16 == 52.0d);
        org.junit.Assert.assertNotNull(strArray35);
        org.junit.Assert.assertNotNull(objArray54);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray54), "[1, a, 10, a, -1]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray54), "[1, a, 10, a, -1]");
        org.junit.Assert.assertNotNull(objArray57);
        org.junit.Assert.assertTrue("'" + double76 + "' != '" + 52.0d + "'", double76 == 52.0d);
        org.junit.Assert.assertEquals("'" + str79 + "' != '" + "org.apache.commons.math.FunctionEvaluationException: Evaluation failed for argument = 52" + "'", str79, "org.apache.commons.math.FunctionEvaluationException: Evaluation failed for argument = 52");
    }

    @Test
    public void test14603() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest29.test14603");
        org.apache.commons.math.FunctionEvaluationException functionEvaluationException3 = new org.apache.commons.math.FunctionEvaluationException((double) 1L, "org.apache.commons.math.MathException");
        org.apache.commons.math.MathException mathException4 = new org.apache.commons.math.MathException((java.lang.Throwable) functionEvaluationException3);
        org.apache.commons.math.FunctionEvaluationException functionEvaluationException5 = new org.apache.commons.math.FunctionEvaluationException((double) 1.0f, (java.lang.Throwable) functionEvaluationException3);
        org.apache.commons.math.ode.IntegratorException integratorException6 = new org.apache.commons.math.ode.IntegratorException((java.lang.Throwable) functionEvaluationException5);
        java.lang.String str7 = functionEvaluationException5.getPattern();
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "org.apache.commons.math.MathException" + "'", str7, "org.apache.commons.math.MathException");
    }

    @Test
    public void test14604() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest29.test14604");
        org.apache.commons.math.FunctionEvaluationException functionEvaluationException2 = new org.apache.commons.math.FunctionEvaluationException((double) (byte) 100, "org.apache.commons.math.ode.DerivativeException: org.apache.commons.math.MathException: org.apache.commons.math.MathException: org.apache.commons.math.FunctionEvaluationException: hi!");
    }

    @Test
    public void test14605() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest29.test14605");
        org.apache.commons.math.FunctionEvaluationException functionEvaluationException2 = new org.apache.commons.math.FunctionEvaluationException((double) (byte) 100, "org.apache.commons.math.ode.DerivativeException: org.apache.commons.math.MathException: org.apache.commons.math.ConvergenceException: org.apache.commons.math.MathException: Evaluation failed for argument = 52");
    }

    @Test
    public void test14606() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest29.test14606");
        java.lang.String[] strArray15 = new java.lang.String[] { "hi!", "org.apache.commons.math.MathException: hi!", "", "hi!", "org.apache.commons.math.MathException: hi!" };
        org.apache.commons.math.ode.DerivativeException derivativeException16 = new org.apache.commons.math.ode.DerivativeException("hi!", strArray15);
        org.apache.commons.math.MathException mathException17 = new org.apache.commons.math.MathException("hi!", (java.lang.Object[]) strArray15);
        org.apache.commons.math.ode.DerivativeException derivativeException18 = new org.apache.commons.math.ode.DerivativeException("", strArray15);
        org.apache.commons.math.FunctionEvaluationException functionEvaluationException19 = new org.apache.commons.math.FunctionEvaluationException(97.0d, "", (java.lang.Throwable) derivativeException18);
        org.apache.commons.math.MathException mathException20 = new org.apache.commons.math.MathException((java.lang.Throwable) functionEvaluationException19);
        java.lang.Throwable[] throwableArray21 = functionEvaluationException19.getSuppressed();
        org.apache.commons.math.FunctionEvaluationException functionEvaluationException22 = new org.apache.commons.math.FunctionEvaluationException((double) 0, "org.apache.commons.math.MathException: Evaluation failed for argument = 100", (java.lang.Object[]) throwableArray21);
        java.lang.Object[] objArray35 = new java.lang.Object[] { 1L, 'a', 10L, 'a', (-1) };
        org.apache.commons.math.ConvergenceException convergenceException36 = new org.apache.commons.math.ConvergenceException("", objArray35);
        org.apache.commons.math.ode.DerivativeException derivativeException37 = new org.apache.commons.math.ode.DerivativeException((java.lang.Throwable) convergenceException36);
        java.lang.Throwable[] throwableArray38 = derivativeException37.getSuppressed();
        org.apache.commons.math.ode.IntegratorException integratorException39 = new org.apache.commons.math.ode.IntegratorException("hi!", (java.lang.Object[]) throwableArray38);
        org.apache.commons.math.FunctionEvaluationException functionEvaluationException40 = new org.apache.commons.math.FunctionEvaluationException(Double.NaN, "hi!", (java.lang.Object[]) throwableArray38);
        org.apache.commons.math.ode.IntegratorException integratorException41 = new org.apache.commons.math.ode.IntegratorException("org.apache.commons.math.FunctionEvaluationException: Evaluation failed for argument = 35", (java.lang.Object[]) throwableArray38);
        java.lang.String[] strArray55 = new java.lang.String[] { "hi!", "org.apache.commons.math.MathException: hi!", "", "hi!", "org.apache.commons.math.MathException: hi!" };
        org.apache.commons.math.ode.DerivativeException derivativeException56 = new org.apache.commons.math.ode.DerivativeException("hi!", strArray55);
        org.apache.commons.math.ConvergenceException convergenceException57 = new org.apache.commons.math.ConvergenceException("org.apache.commons.math.FunctionEvaluationException: hi!", (java.lang.Object[]) strArray55);
        org.apache.commons.math.ode.DerivativeException derivativeException58 = new org.apache.commons.math.ode.DerivativeException("org.apache.commons.math.ConvergenceException: org.apache.commons.math.MathException: ", strArray55);
        org.apache.commons.math.ode.DerivativeException derivativeException59 = new org.apache.commons.math.ode.DerivativeException("org.apache.commons.math.ode.IntegratorException: ", strArray55);
        java.lang.String[] strArray68 = new java.lang.String[] { "hi!", "org.apache.commons.math.MathException: hi!", "", "hi!", "org.apache.commons.math.MathException: hi!" };
        org.apache.commons.math.ode.DerivativeException derivativeException69 = new org.apache.commons.math.ode.DerivativeException("hi!", strArray68);
        org.apache.commons.math.ode.IntegratorException integratorException70 = new org.apache.commons.math.ode.IntegratorException("", (java.lang.Object[]) strArray68);
        org.apache.commons.math.MathException mathException71 = new org.apache.commons.math.MathException("hi!", (java.lang.Throwable) integratorException70);
        java.lang.String str72 = mathException71.getPattern();
        org.apache.commons.math.MathException mathException73 = new org.apache.commons.math.MathException((java.lang.Throwable) mathException71);
        org.apache.commons.math.ode.IntegratorException integratorException74 = new org.apache.commons.math.ode.IntegratorException((java.lang.Throwable) mathException71);
        org.apache.commons.math.ConvergenceException convergenceException75 = new org.apache.commons.math.ConvergenceException("org.apache.commons.math.FunctionEvaluationException: org.apache.commons.math.ConvergenceException: org.apache.commons.math.FunctionEvaluationException: hi!", (java.lang.Object[]) strArray55, (java.lang.Throwable) mathException71);
        org.apache.commons.math.ode.DerivativeException derivativeException76 = new org.apache.commons.math.ode.DerivativeException("org.apache.commons.math.ConvergenceException: org.apache.commons.math.MathException: hi!", strArray55);
        org.apache.commons.math.MathException mathException79 = new org.apache.commons.math.MathException("Evaluation failed for argument = 100");
        org.apache.commons.math.ConvergenceException convergenceException80 = new org.apache.commons.math.ConvergenceException((java.lang.Throwable) mathException79);
        org.apache.commons.math.ConvergenceException convergenceException81 = new org.apache.commons.math.ConvergenceException("", (java.lang.Throwable) mathException79);
        org.apache.commons.math.FunctionEvaluationException functionEvaluationException82 = new org.apache.commons.math.FunctionEvaluationException((double) (short) 100, "org.apache.commons.math.MathException: org.apache.commons.math.ode.IntegratorException: org.apache.commons.math.FunctionEvaluationException: hi!", (java.lang.Object[]) strArray55, (java.lang.Throwable) mathException79);
        org.apache.commons.math.ConvergenceException convergenceException83 = new org.apache.commons.math.ConvergenceException("org.apache.commons.math.ode.DerivativeException: org.apache.commons.math.ConvergenceException: Evaluation failed for argument = 52", (java.lang.Object[]) throwableArray38, (java.lang.Throwable) mathException79);
        org.apache.commons.math.MathException mathException84 = new org.apache.commons.math.MathException("org.apache.commons.math.ConvergenceException: org.apache.commons.math.MathException: org.apache.commons.math.FunctionEvaluationException: org.apache.commons.math.MathException: hi!", (java.lang.Throwable) convergenceException83);
        org.apache.commons.math.FunctionEvaluationException functionEvaluationException85 = new org.apache.commons.math.FunctionEvaluationException((double) 0L, "org.apache.commons.math.ode.IntegratorException: org.apache.commons.math.ode.DerivativeException: org.apache.commons.math.MathException: org.apache.commons.math.ode.IntegratorException: org.apache.commons.math.MathException: ", (java.lang.Object[]) throwableArray21, (java.lang.Throwable) convergenceException83);
        org.apache.commons.math.MathException mathException86 = new org.apache.commons.math.MathException("org.apache.commons.math.FunctionEvaluationException: org.apache.commons.math.FunctionEvaluationException: ", (java.lang.Throwable) functionEvaluationException85);
        org.junit.Assert.assertNotNull(strArray15);
        org.junit.Assert.assertNotNull(throwableArray21);
        org.junit.Assert.assertNotNull(objArray35);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray35), "[1, a, 10, a, -1]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray35), "[1, a, 10, a, -1]");
        org.junit.Assert.assertNotNull(throwableArray38);
        org.junit.Assert.assertNotNull(strArray55);
        org.junit.Assert.assertNotNull(strArray68);
        org.junit.Assert.assertEquals("'" + str72 + "' != '" + "hi!" + "'", str72, "hi!");
    }

    @Test
    public void test14607() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest29.test14607");
        org.apache.commons.math.ode.SwitchingFunctionsHandler switchingFunctionsHandler0 = new org.apache.commons.math.ode.SwitchingFunctionsHandler();
        boolean boolean1 = switchingFunctionsHandler0.isEmpty();
        org.apache.commons.math.ode.StepInterpolator stepInterpolator2 = null;
        boolean boolean3 = switchingFunctionsHandler0.evaluateStep(stepInterpolator2);
        org.apache.commons.math.ode.SwitchingFunctionsHandler switchingFunctionsHandler5 = new org.apache.commons.math.ode.SwitchingFunctionsHandler();
        boolean boolean6 = switchingFunctionsHandler5.isEmpty();
        double[] doubleArray9 = new double[] { 100.0d };
        boolean boolean10 = switchingFunctionsHandler5.reset((double) 0L, doubleArray9);
        switchingFunctionsHandler0.stepAccepted((double) (byte) 10, doubleArray9);
        org.apache.commons.math.ode.SwitchingFunctionsHandler switchingFunctionsHandler13 = new org.apache.commons.math.ode.SwitchingFunctionsHandler();
        boolean boolean14 = switchingFunctionsHandler13.isEmpty();
        double[] doubleArray17 = new double[] { 100.0d };
        boolean boolean18 = switchingFunctionsHandler13.reset((double) 0L, doubleArray17);
        switchingFunctionsHandler0.stepAccepted(100.0d, doubleArray17);
        boolean boolean20 = switchingFunctionsHandler0.isEmpty();
        boolean boolean21 = switchingFunctionsHandler0.isEmpty();
        org.apache.commons.math.ode.StepInterpolator stepInterpolator22 = null;
        boolean boolean23 = switchingFunctionsHandler0.evaluateStep(stepInterpolator22);
        org.apache.commons.math.ode.StepInterpolator stepInterpolator24 = null;
        boolean boolean25 = switchingFunctionsHandler0.evaluateStep(stepInterpolator24);
        org.apache.commons.math.ode.SwitchingFunctionsHandler switchingFunctionsHandler27 = new org.apache.commons.math.ode.SwitchingFunctionsHandler();
        boolean boolean28 = switchingFunctionsHandler27.isEmpty();
        double double29 = switchingFunctionsHandler27.getEventTime();
        org.apache.commons.math.ode.SwitchingFunctionsHandler switchingFunctionsHandler31 = new org.apache.commons.math.ode.SwitchingFunctionsHandler();
        boolean boolean32 = switchingFunctionsHandler31.isEmpty();
        double[] doubleArray35 = new double[] { 100.0d };
        boolean boolean36 = switchingFunctionsHandler31.reset((double) 0L, doubleArray35);
        org.apache.commons.math.ode.SwitchingFunctionsHandler switchingFunctionsHandler38 = new org.apache.commons.math.ode.SwitchingFunctionsHandler();
        boolean boolean39 = switchingFunctionsHandler38.isEmpty();
        org.apache.commons.math.ode.StepInterpolator stepInterpolator40 = null;
        boolean boolean41 = switchingFunctionsHandler38.evaluateStep(stepInterpolator40);
        org.apache.commons.math.ode.SwitchingFunctionsHandler switchingFunctionsHandler43 = new org.apache.commons.math.ode.SwitchingFunctionsHandler();
        boolean boolean44 = switchingFunctionsHandler43.isEmpty();
        double[] doubleArray47 = new double[] { 100.0d };
        boolean boolean48 = switchingFunctionsHandler43.reset((double) 0L, doubleArray47);
        boolean boolean49 = switchingFunctionsHandler38.reset((double) 1, doubleArray47);
        boolean boolean50 = switchingFunctionsHandler31.reset((double) 100, doubleArray47);
        double double51 = switchingFunctionsHandler31.getEventTime();
        org.apache.commons.math.ode.SwitchingFunctionsHandler switchingFunctionsHandler53 = new org.apache.commons.math.ode.SwitchingFunctionsHandler();
        boolean boolean54 = switchingFunctionsHandler53.isEmpty();
        org.apache.commons.math.ode.StepInterpolator stepInterpolator55 = null;
        boolean boolean56 = switchingFunctionsHandler53.evaluateStep(stepInterpolator55);
        org.apache.commons.math.ode.SwitchingFunctionsHandler switchingFunctionsHandler58 = new org.apache.commons.math.ode.SwitchingFunctionsHandler();
        boolean boolean59 = switchingFunctionsHandler58.isEmpty();
        double[] doubleArray62 = new double[] { 100.0d };
        boolean boolean63 = switchingFunctionsHandler58.reset((double) 0L, doubleArray62);
        switchingFunctionsHandler53.stepAccepted((double) (byte) 10, doubleArray62);
        switchingFunctionsHandler31.stepAccepted(0.0d, doubleArray62);
        boolean boolean66 = switchingFunctionsHandler31.isEmpty();
        boolean boolean67 = switchingFunctionsHandler31.stop();
        org.apache.commons.math.ode.SwitchingFunctionsHandler switchingFunctionsHandler69 = new org.apache.commons.math.ode.SwitchingFunctionsHandler();
        org.apache.commons.math.ode.SwitchingFunction switchingFunction70 = null;
        switchingFunctionsHandler69.add(switchingFunction70, (double) (-1), (double) 3, 0);
        double[] doubleArray82 = new double[] { 0L, 10.0d, 'a', 0.0d, (-1.0d), 0 };
        boolean boolean83 = switchingFunctionsHandler69.reset((double) (-1), doubleArray82);
        switchingFunctionsHandler31.stepAccepted((double) 'a', doubleArray82);
        boolean boolean85 = switchingFunctionsHandler27.reset((double) 3, doubleArray82);
        switchingFunctionsHandler0.stepAccepted((double) (short) 0, doubleArray82);
        boolean boolean87 = switchingFunctionsHandler0.isEmpty();
        boolean boolean88 = switchingFunctionsHandler0.stop();
        org.apache.commons.math.ode.SwitchingFunction switchingFunction89 = null;
        switchingFunctionsHandler0.add(switchingFunction89, 0.0d, (double) (short) 100, (int) (short) -1);
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertNotNull(doubleArray9);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray9), "[100.0]");
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertNotNull(doubleArray17);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray17), "[100.0]");
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + true + "'", boolean20 == true);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + true + "'", boolean21 == true);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + true + "'", boolean28 == true);
        org.junit.Assert.assertTrue(Double.isNaN(double29));
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + true + "'", boolean32 == true);
        org.junit.Assert.assertNotNull(doubleArray35);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray35), "[100.0]");
        org.junit.Assert.assertTrue("'" + boolean36 + "' != '" + false + "'", boolean36 == false);
        org.junit.Assert.assertTrue("'" + boolean39 + "' != '" + true + "'", boolean39 == true);
        org.junit.Assert.assertTrue("'" + boolean41 + "' != '" + false + "'", boolean41 == false);
        org.junit.Assert.assertTrue("'" + boolean44 + "' != '" + true + "'", boolean44 == true);
        org.junit.Assert.assertNotNull(doubleArray47);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray47), "[100.0]");
        org.junit.Assert.assertTrue("'" + boolean48 + "' != '" + false + "'", boolean48 == false);
        org.junit.Assert.assertTrue("'" + boolean49 + "' != '" + false + "'", boolean49 == false);
        org.junit.Assert.assertTrue("'" + boolean50 + "' != '" + false + "'", boolean50 == false);
        org.junit.Assert.assertTrue(Double.isNaN(double51));
        org.junit.Assert.assertTrue("'" + boolean54 + "' != '" + true + "'", boolean54 == true);
        org.junit.Assert.assertTrue("'" + boolean56 + "' != '" + false + "'", boolean56 == false);
        org.junit.Assert.assertTrue("'" + boolean59 + "' != '" + true + "'", boolean59 == true);
        org.junit.Assert.assertNotNull(doubleArray62);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray62), "[100.0]");
        org.junit.Assert.assertTrue("'" + boolean63 + "' != '" + false + "'", boolean63 == false);
        org.junit.Assert.assertTrue("'" + boolean66 + "' != '" + true + "'", boolean66 == true);
        org.junit.Assert.assertTrue("'" + boolean67 + "' != '" + false + "'", boolean67 == false);
        org.junit.Assert.assertNotNull(doubleArray82);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray82), "[0.0, 10.0, 97.0, 0.0, -1.0, 0.0]");
        org.junit.Assert.assertTrue("'" + boolean83 + "' != '" + false + "'", boolean83 == false);
        org.junit.Assert.assertTrue("'" + boolean85 + "' != '" + false + "'", boolean85 == false);
        org.junit.Assert.assertTrue("'" + boolean87 + "' != '" + true + "'", boolean87 == true);
        org.junit.Assert.assertTrue("'" + boolean88 + "' != '" + false + "'", boolean88 == false);
    }

    @Test
    public void test14608() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest29.test14608");
        org.apache.commons.math.FunctionEvaluationException functionEvaluationException3 = new org.apache.commons.math.FunctionEvaluationException((double) (byte) -1);
        org.apache.commons.math.MathException mathException4 = new org.apache.commons.math.MathException("", (java.lang.Throwable) functionEvaluationException3);
        org.apache.commons.math.ConvergenceException convergenceException5 = new org.apache.commons.math.ConvergenceException("", (java.lang.Throwable) mathException4);
        java.lang.Object[] objArray6 = convergenceException5.getArguments();
        org.apache.commons.math.ode.IntegratorException integratorException7 = new org.apache.commons.math.ode.IntegratorException((java.lang.Throwable) convergenceException5);
        org.junit.Assert.assertNotNull(objArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray6), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray6), "[]");
    }

    @Test
    public void test14609() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest29.test14609");
        java.lang.String[] strArray17 = new java.lang.String[] { "hi!", "org.apache.commons.math.MathException: hi!", "", "hi!", "org.apache.commons.math.MathException: hi!" };
        org.apache.commons.math.ode.DerivativeException derivativeException18 = new org.apache.commons.math.ode.DerivativeException("hi!", strArray17);
        org.apache.commons.math.MathException mathException19 = new org.apache.commons.math.MathException("hi!", (java.lang.Object[]) strArray17);
        org.apache.commons.math.ode.DerivativeException derivativeException20 = new org.apache.commons.math.ode.DerivativeException("", strArray17);
        org.apache.commons.math.FunctionEvaluationException functionEvaluationException21 = new org.apache.commons.math.FunctionEvaluationException((double) (byte) -1, "org.apache.commons.math.MathException: ", (java.lang.Object[]) strArray17);
        org.apache.commons.math.MathException mathException22 = new org.apache.commons.math.MathException("org.apache.commons.math.ode.IntegratorException: ", (java.lang.Object[]) strArray17);
        org.apache.commons.math.ode.DerivativeException derivativeException23 = new org.apache.commons.math.ode.DerivativeException("org.apache.commons.math.ode.IntegratorException: org.apache.commons.math.MathException: ", strArray17);
        org.apache.commons.math.ode.DerivativeException derivativeException24 = new org.apache.commons.math.ode.DerivativeException("org.apache.commons.math.FunctionEvaluationException: org.apache.commons.math.FunctionEvaluationException: org.apache.commons.math.ode.IntegratorException: hi!", strArray17);
        org.apache.commons.math.ode.IntegratorException integratorException25 = new org.apache.commons.math.ode.IntegratorException("org.apache.commons.math.ConvergenceException: org.apache.commons.math.MathException: org.apache.commons.math.MathException: ", (java.lang.Object[]) strArray17);
        org.apache.commons.math.FunctionEvaluationException functionEvaluationException26 = new org.apache.commons.math.FunctionEvaluationException((double) (-1.0f), "org.apache.commons.math.FunctionEvaluationException: org.apache.commons.math.ConvergenceException: ", (java.lang.Object[]) strArray17);
        org.apache.commons.math.MathException mathException27 = new org.apache.commons.math.MathException("org.apache.commons.math.FunctionEvaluationException", (java.lang.Throwable) functionEvaluationException26);
        org.junit.Assert.assertNotNull(strArray17);
    }

    @Test
    public void test14610() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest29.test14610");
        java.lang.Throwable throwable1 = null;
        org.apache.commons.math.ConvergenceException convergenceException2 = new org.apache.commons.math.ConvergenceException("org.apache.commons.math.MathException: org.apache.commons.math.FunctionEvaluationException: Evaluation failed for argument = 35", throwable1);
    }

    @Test
    public void test14611() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest29.test14611");
        java.lang.String[] strArray15 = new java.lang.String[] { "hi!", "org.apache.commons.math.MathException: hi!", "", "hi!", "org.apache.commons.math.MathException: hi!" };
        org.apache.commons.math.ode.DerivativeException derivativeException16 = new org.apache.commons.math.ode.DerivativeException("hi!", strArray15);
        org.apache.commons.math.ode.IntegratorException integratorException17 = new org.apache.commons.math.ode.IntegratorException("", (java.lang.Object[]) strArray15);
        org.apache.commons.math.FunctionEvaluationException functionEvaluationException18 = new org.apache.commons.math.FunctionEvaluationException((double) (byte) -1, "hi!", (java.lang.Object[]) strArray15);
        org.apache.commons.math.ode.DerivativeException derivativeException19 = new org.apache.commons.math.ode.DerivativeException("", strArray15);
        org.apache.commons.math.ode.DerivativeException derivativeException20 = new org.apache.commons.math.ode.DerivativeException("org.apache.commons.math.ode.IntegratorException: org.apache.commons.math.MathException: ", strArray15);
        org.apache.commons.math.ode.IntegratorException integratorException21 = new org.apache.commons.math.ode.IntegratorException("org.apache.commons.math.MathException: org.apache.commons.math.ode.IntegratorException: org.apache.commons.math.FunctionEvaluationException: hi!", (java.lang.Object[]) strArray15);
        org.apache.commons.math.ode.DerivativeException derivativeException22 = new org.apache.commons.math.ode.DerivativeException("org.apache.commons.math.ConvergenceException: org.apache.commons.math.ode.DerivativeException: ", strArray15);
        java.lang.String[] strArray39 = new java.lang.String[] { "hi!", "org.apache.commons.math.MathException: hi!", "", "hi!", "org.apache.commons.math.MathException: hi!" };
        org.apache.commons.math.ode.DerivativeException derivativeException40 = new org.apache.commons.math.ode.DerivativeException("hi!", strArray39);
        org.apache.commons.math.MathException mathException41 = new org.apache.commons.math.MathException("hi!", (java.lang.Object[]) strArray39);
        org.apache.commons.math.ode.DerivativeException derivativeException42 = new org.apache.commons.math.ode.DerivativeException("", strArray39);
        org.apache.commons.math.FunctionEvaluationException functionEvaluationException43 = new org.apache.commons.math.FunctionEvaluationException((double) (byte) -1, "org.apache.commons.math.MathException: ", (java.lang.Object[]) strArray39);
        org.apache.commons.math.MathException mathException44 = new org.apache.commons.math.MathException("org.apache.commons.math.ode.IntegratorException: ", (java.lang.Object[]) strArray39);
        org.apache.commons.math.ConvergenceException convergenceException45 = new org.apache.commons.math.ConvergenceException("org.apache.commons.math.MathException: ", (java.lang.Object[]) strArray39);
        java.lang.String[] strArray56 = new java.lang.String[] { "hi!", "org.apache.commons.math.MathException: hi!", "", "hi!", "org.apache.commons.math.MathException: hi!" };
        org.apache.commons.math.ode.DerivativeException derivativeException57 = new org.apache.commons.math.ode.DerivativeException("hi!", strArray56);
        org.apache.commons.math.ode.IntegratorException integratorException58 = new org.apache.commons.math.ode.IntegratorException("", (java.lang.Object[]) strArray56);
        org.apache.commons.math.ode.DerivativeException derivativeException59 = new org.apache.commons.math.ode.DerivativeException("hi!", strArray56);
        org.apache.commons.math.ode.DerivativeException derivativeException60 = new org.apache.commons.math.ode.DerivativeException("org.apache.commons.math.MathException: hi!", strArray56);
        java.lang.Object[] objArray64 = new java.lang.Object[] { (-1L) };
        java.lang.Object[] objArray72 = new java.lang.Object[] { 1L, 'a', 10L, 'a', (-1) };
        org.apache.commons.math.ConvergenceException convergenceException73 = new org.apache.commons.math.ConvergenceException("", objArray72);
        org.apache.commons.math.ode.IntegratorException integratorException74 = new org.apache.commons.math.ode.IntegratorException("org.apache.commons.math.MathException: hi!", objArray72);
        org.apache.commons.math.MathException mathException75 = new org.apache.commons.math.MathException((java.lang.Throwable) integratorException74);
        org.apache.commons.math.ConvergenceException convergenceException76 = new org.apache.commons.math.ConvergenceException("hi!", objArray64, (java.lang.Throwable) mathException75);
        org.apache.commons.math.ConvergenceException convergenceException77 = new org.apache.commons.math.ConvergenceException("org.apache.commons.math.MathException: ", (java.lang.Throwable) mathException75);
        org.apache.commons.math.ConvergenceException convergenceException78 = new org.apache.commons.math.ConvergenceException("hi!", (java.lang.Object[]) strArray56, (java.lang.Throwable) mathException75);
        org.apache.commons.math.ode.DerivativeException derivativeException79 = new org.apache.commons.math.ode.DerivativeException((java.lang.Throwable) mathException75);
        org.apache.commons.math.FunctionEvaluationException functionEvaluationException80 = new org.apache.commons.math.FunctionEvaluationException((double) 10.0f, "org.apache.commons.math.ode.DerivativeException: ", (java.lang.Object[]) strArray39, (java.lang.Throwable) derivativeException79);
        java.lang.Object[] objArray81 = functionEvaluationException80.getArguments();
        org.apache.commons.math.FunctionEvaluationException functionEvaluationException84 = new org.apache.commons.math.FunctionEvaluationException((double) 100, "org.apache.commons.math.FunctionEvaluationException: Evaluation failed for argument = -1");
        java.lang.Throwable[] throwableArray85 = functionEvaluationException84.getSuppressed();
        functionEvaluationException80.addSuppressed((java.lang.Throwable) functionEvaluationException84);
        org.apache.commons.math.FunctionEvaluationException functionEvaluationException87 = new org.apache.commons.math.FunctionEvaluationException((double) (short) 100, "org.apache.commons.math.ConvergenceException: ", (java.lang.Throwable) functionEvaluationException80);
        org.apache.commons.math.FunctionEvaluationException functionEvaluationException88 = new org.apache.commons.math.FunctionEvaluationException(97.0d, "org.apache.commons.math.MathException: org.apache.commons.math.FunctionEvaluationException: Evaluation failed for argument = 52", (java.lang.Object[]) strArray15, (java.lang.Throwable) functionEvaluationException80);
        org.junit.Assert.assertNotNull(strArray15);
        org.junit.Assert.assertNotNull(strArray39);
        org.junit.Assert.assertNotNull(strArray56);
        org.junit.Assert.assertNotNull(objArray64);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray64), "[-1]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray64), "[-1]");
        org.junit.Assert.assertNotNull(objArray72);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray72), "[1, a, 10, a, -1]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray72), "[1, a, 10, a, -1]");
        org.junit.Assert.assertNotNull(objArray81);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray81), "[hi!, org.apache.commons.math.MathException: hi!, , hi!, org.apache.commons.math.MathException: hi!]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray81), "[hi!, org.apache.commons.math.MathException: hi!, , hi!, org.apache.commons.math.MathException: hi!]");
        org.junit.Assert.assertNotNull(throwableArray85);
    }

    @Test
    public void test14612() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest29.test14612");
        java.lang.Object[] objArray11 = new java.lang.Object[] { 1L, 'a', 10L, 'a', (-1) };
        org.apache.commons.math.ConvergenceException convergenceException12 = new org.apache.commons.math.ConvergenceException("", objArray11);
        org.apache.commons.math.ConvergenceException convergenceException13 = new org.apache.commons.math.ConvergenceException();
        org.apache.commons.math.MathException mathException14 = new org.apache.commons.math.MathException("org.apache.commons.math.FunctionEvaluationException: hi!", objArray11, (java.lang.Throwable) convergenceException13);
        java.lang.Object[] objArray15 = mathException14.getArguments();
        org.apache.commons.math.ode.SwitchingFunctionsHandler switchingFunctionsHandler23 = new org.apache.commons.math.ode.SwitchingFunctionsHandler();
        java.lang.Object[] objArray32 = new java.lang.Object[] { 1L, 'a', 10L, 'a', (-1) };
        org.apache.commons.math.ConvergenceException convergenceException33 = new org.apache.commons.math.ConvergenceException("", objArray32);
        org.apache.commons.math.ode.IntegratorException integratorException34 = new org.apache.commons.math.ode.IntegratorException("org.apache.commons.math.MathException: hi!", objArray32);
        java.lang.Object[] objArray35 = new java.lang.Object[] { 2, switchingFunctionsHandler23, 1, objArray32 };
        org.apache.commons.math.ConvergenceException convergenceException38 = new org.apache.commons.math.ConvergenceException("hi!");
        org.apache.commons.math.MathException mathException39 = new org.apache.commons.math.MathException("hi!", (java.lang.Throwable) convergenceException38);
        org.apache.commons.math.FunctionEvaluationException functionEvaluationException40 = new org.apache.commons.math.FunctionEvaluationException((double) (short) 0, "org.apache.commons.math.MathException: hi!", objArray32, (java.lang.Throwable) mathException39);
        org.apache.commons.math.FunctionEvaluationException functionEvaluationException42 = new org.apache.commons.math.FunctionEvaluationException((double) 100L);
        org.apache.commons.math.ConvergenceException convergenceException43 = new org.apache.commons.math.ConvergenceException("org.apache.commons.math.MathException: hi!", objArray32, (java.lang.Throwable) functionEvaluationException42);
        org.apache.commons.math.FunctionEvaluationException functionEvaluationException45 = new org.apache.commons.math.FunctionEvaluationException((double) 100L);
        org.apache.commons.math.ConvergenceException convergenceException46 = new org.apache.commons.math.ConvergenceException("org.apache.commons.math.MathException: hi!", objArray32, (java.lang.Throwable) functionEvaluationException45);
        org.apache.commons.math.ConvergenceException convergenceException47 = new org.apache.commons.math.ConvergenceException("org.apache.commons.math.MathException: hi!", objArray32);
        org.apache.commons.math.ConvergenceException convergenceException48 = new org.apache.commons.math.ConvergenceException((java.lang.Throwable) convergenceException47);
        org.apache.commons.math.ConvergenceException convergenceException49 = new org.apache.commons.math.ConvergenceException("org.apache.commons.math.FunctionEvaluationException: Evaluation failed for argument = 35", (java.lang.Throwable) convergenceException47);
        org.apache.commons.math.ConvergenceException convergenceException50 = new org.apache.commons.math.ConvergenceException("org.apache.commons.math.FunctionEvaluationException: Evaluation failed for argument = 35", objArray15, (java.lang.Throwable) convergenceException47);
        org.apache.commons.math.FunctionEvaluationException functionEvaluationException51 = new org.apache.commons.math.FunctionEvaluationException((double) 10.0f, "org.apache.commons.math.ConvergenceException: org.apache.commons.math.MathException: hi!", objArray15);
        java.lang.String[] strArray66 = new java.lang.String[] { "hi!", "org.apache.commons.math.MathException: hi!", "", "hi!", "org.apache.commons.math.MathException: hi!" };
        org.apache.commons.math.ode.DerivativeException derivativeException67 = new org.apache.commons.math.ode.DerivativeException("hi!", strArray66);
        org.apache.commons.math.ode.IntegratorException integratorException68 = new org.apache.commons.math.ode.IntegratorException("", (java.lang.Object[]) strArray66);
        org.apache.commons.math.ode.IntegratorException integratorException69 = new org.apache.commons.math.ode.IntegratorException("org.apache.commons.math.MathException: hi!", (java.lang.Object[]) strArray66);
        org.apache.commons.math.ode.IntegratorException integratorException70 = new org.apache.commons.math.ode.IntegratorException("org.apache.commons.math.MathException: hi!", (java.lang.Object[]) strArray66);
        org.apache.commons.math.ode.IntegratorException integratorException71 = new org.apache.commons.math.ode.IntegratorException("hi!", (java.lang.Object[]) strArray66);
        org.apache.commons.math.FunctionEvaluationException functionEvaluationException72 = new org.apache.commons.math.FunctionEvaluationException(97.0d, "org.apache.commons.math.ode.IntegratorException: ", (java.lang.Object[]) strArray66);
        org.apache.commons.math.FunctionEvaluationException functionEvaluationException75 = new org.apache.commons.math.FunctionEvaluationException((double) (-1.0f), "");
        org.apache.commons.math.FunctionEvaluationException functionEvaluationException79 = new org.apache.commons.math.FunctionEvaluationException((double) (byte) 100);
        org.apache.commons.math.ConvergenceException convergenceException80 = new org.apache.commons.math.ConvergenceException((java.lang.Throwable) functionEvaluationException79);
        java.lang.Object[] objArray81 = functionEvaluationException79.getArguments();
        java.lang.Throwable throwable82 = null;
        org.apache.commons.math.MathException mathException83 = new org.apache.commons.math.MathException("hi!", objArray81, throwable82);
        org.apache.commons.math.FunctionEvaluationException functionEvaluationException86 = new org.apache.commons.math.FunctionEvaluationException((double) '4');
        org.apache.commons.math.MathException mathException87 = new org.apache.commons.math.MathException((java.lang.Throwable) functionEvaluationException86);
        double double88 = functionEvaluationException86.getArgument();
        org.apache.commons.math.MathException mathException89 = new org.apache.commons.math.MathException("org.apache.commons.math.ode.DerivativeException: ", (java.lang.Throwable) functionEvaluationException86);
        org.apache.commons.math.ConvergenceException convergenceException90 = new org.apache.commons.math.ConvergenceException("org.apache.commons.math.MathException: ", objArray81, (java.lang.Throwable) functionEvaluationException86);
        org.apache.commons.math.ode.IntegratorException integratorException91 = new org.apache.commons.math.ode.IntegratorException((java.lang.Throwable) functionEvaluationException86);
        functionEvaluationException75.addSuppressed((java.lang.Throwable) functionEvaluationException86);
        double double93 = functionEvaluationException75.getArgument();
        org.apache.commons.math.ConvergenceException convergenceException94 = new org.apache.commons.math.ConvergenceException("", (java.lang.Object[]) strArray66, (java.lang.Throwable) functionEvaluationException75);
        org.apache.commons.math.MathException mathException95 = new org.apache.commons.math.MathException("org.apache.commons.math.ConvergenceException: org.apache.commons.math.FunctionEvaluationException: Evaluation failed for argument = 35", (java.lang.Throwable) convergenceException94);
        org.apache.commons.math.MathException mathException96 = new org.apache.commons.math.MathException("org.apache.commons.math.ode.IntegratorException: org.apache.commons.math.ode.IntegratorException: hi!", objArray15, (java.lang.Throwable) convergenceException94);
        java.lang.Object[] objArray97 = convergenceException94.getArguments();
        org.junit.Assert.assertNotNull(objArray11);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray11), "[1, a, 10, a, -1]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray11), "[1, a, 10, a, -1]");
        org.junit.Assert.assertNotNull(objArray15);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray15), "[1, a, 10, a, -1]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray15), "[1, a, 10, a, -1]");
        org.junit.Assert.assertNotNull(objArray32);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray32), "[1, a, 10, a, -1]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray32), "[1, a, 10, a, -1]");
        org.junit.Assert.assertNotNull(objArray35);
        org.junit.Assert.assertNotNull(strArray66);
        org.junit.Assert.assertNotNull(objArray81);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray81), "[100.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray81), "[100.0]");
        org.junit.Assert.assertTrue("'" + double88 + "' != '" + 52.0d + "'", double88 == 52.0d);
        org.junit.Assert.assertTrue("'" + double93 + "' != '" + (-1.0d) + "'", double93 == (-1.0d));
        org.junit.Assert.assertNotNull(objArray97);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray97), "[hi!, org.apache.commons.math.MathException: hi!, , hi!, org.apache.commons.math.MathException: hi!]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray97), "[hi!, org.apache.commons.math.MathException: hi!, , hi!, org.apache.commons.math.MathException: hi!]");
    }

    @Test
    public void test14613() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest29.test14613");
        java.lang.String[] strArray11 = new java.lang.String[] { "hi!", "org.apache.commons.math.MathException: hi!", "", "hi!", "org.apache.commons.math.MathException: hi!" };
        org.apache.commons.math.ode.DerivativeException derivativeException12 = new org.apache.commons.math.ode.DerivativeException("hi!", strArray11);
        org.apache.commons.math.ConvergenceException convergenceException13 = new org.apache.commons.math.ConvergenceException("org.apache.commons.math.FunctionEvaluationException: hi!", (java.lang.Object[]) strArray11);
        org.apache.commons.math.MathException mathException14 = new org.apache.commons.math.MathException("org.apache.commons.math.FunctionEvaluationException: ", (java.lang.Object[]) strArray11);
        java.lang.String[] strArray24 = new java.lang.String[] { "hi!", "org.apache.commons.math.MathException: hi!", "", "hi!", "org.apache.commons.math.MathException: hi!" };
        org.apache.commons.math.ode.DerivativeException derivativeException25 = new org.apache.commons.math.ode.DerivativeException("hi!", strArray24);
        org.apache.commons.math.ode.IntegratorException integratorException26 = new org.apache.commons.math.ode.IntegratorException("", (java.lang.Object[]) strArray24);
        org.apache.commons.math.ode.DerivativeException derivativeException27 = new org.apache.commons.math.ode.DerivativeException("hi!", strArray24);
        org.apache.commons.math.ode.IntegratorException integratorException28 = new org.apache.commons.math.ode.IntegratorException("org.apache.commons.math.MathException: Evaluation failed for argument = 52", (java.lang.Object[]) strArray24);
        org.apache.commons.math.MathException mathException29 = new org.apache.commons.math.MathException("org.apache.commons.math.ode.DerivativeException: org.apache.commons.math.ode.IntegratorException: ", (java.lang.Object[]) strArray11, (java.lang.Throwable) integratorException28);
        org.apache.commons.math.ode.DerivativeException derivativeException30 = new org.apache.commons.math.ode.DerivativeException("org.apache.commons.math.FunctionEvaluationException: org.apache.commons.math.ode.IntegratorException: hi!", strArray11);
        org.apache.commons.math.FunctionEvaluationException functionEvaluationException32 = new org.apache.commons.math.FunctionEvaluationException((double) '4');
        double double33 = functionEvaluationException32.getArgument();
        org.apache.commons.math.ode.IntegratorException integratorException34 = new org.apache.commons.math.ode.IntegratorException((java.lang.Throwable) functionEvaluationException32);
        org.apache.commons.math.MathException mathException35 = new org.apache.commons.math.MathException("org.apache.commons.math.FunctionEvaluationException: org.apache.commons.math.MathException: org.apache.commons.math.FunctionEvaluationException: hi!", (java.lang.Object[]) strArray11, (java.lang.Throwable) integratorException34);
        java.lang.String[] strArray47 = new java.lang.String[] { "hi!", "org.apache.commons.math.MathException: hi!", "", "hi!", "org.apache.commons.math.MathException: hi!" };
        org.apache.commons.math.ode.DerivativeException derivativeException48 = new org.apache.commons.math.ode.DerivativeException("hi!", strArray47);
        org.apache.commons.math.ode.IntegratorException integratorException49 = new org.apache.commons.math.ode.IntegratorException("", (java.lang.Object[]) strArray47);
        org.apache.commons.math.ode.DerivativeException derivativeException50 = new org.apache.commons.math.ode.DerivativeException("hi!", strArray47);
        org.apache.commons.math.ode.DerivativeException derivativeException51 = new org.apache.commons.math.ode.DerivativeException("org.apache.commons.math.MathException: hi!", strArray47);
        java.lang.Object[] objArray55 = new java.lang.Object[] { (-1L) };
        java.lang.Object[] objArray63 = new java.lang.Object[] { 1L, 'a', 10L, 'a', (-1) };
        org.apache.commons.math.ConvergenceException convergenceException64 = new org.apache.commons.math.ConvergenceException("", objArray63);
        org.apache.commons.math.ode.IntegratorException integratorException65 = new org.apache.commons.math.ode.IntegratorException("org.apache.commons.math.MathException: hi!", objArray63);
        org.apache.commons.math.MathException mathException66 = new org.apache.commons.math.MathException((java.lang.Throwable) integratorException65);
        org.apache.commons.math.ConvergenceException convergenceException67 = new org.apache.commons.math.ConvergenceException("hi!", objArray55, (java.lang.Throwable) mathException66);
        org.apache.commons.math.ConvergenceException convergenceException68 = new org.apache.commons.math.ConvergenceException("org.apache.commons.math.MathException: ", (java.lang.Throwable) mathException66);
        org.apache.commons.math.ConvergenceException convergenceException69 = new org.apache.commons.math.ConvergenceException("hi!", (java.lang.Object[]) strArray47, (java.lang.Throwable) mathException66);
        org.apache.commons.math.FunctionEvaluationException functionEvaluationException70 = new org.apache.commons.math.FunctionEvaluationException((double) (short) 1, (java.lang.Throwable) convergenceException69);
        mathException35.addSuppressed((java.lang.Throwable) functionEvaluationException70);
        java.lang.String str72 = functionEvaluationException70.getPattern();
        org.junit.Assert.assertNotNull(strArray11);
        org.junit.Assert.assertNotNull(strArray24);
        org.junit.Assert.assertTrue("'" + double33 + "' != '" + 52.0d + "'", double33 == 52.0d);
        org.junit.Assert.assertNotNull(strArray47);
        org.junit.Assert.assertNotNull(objArray55);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray55), "[-1]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray55), "[-1]");
        org.junit.Assert.assertNotNull(objArray63);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray63), "[1, a, 10, a, -1]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray63), "[1, a, 10, a, -1]");
        org.junit.Assert.assertEquals("'" + str72 + "' != '" + "hi!" + "'", str72, "hi!");
    }

    @Test
    public void test14614() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest29.test14614");
        org.apache.commons.math.FunctionEvaluationException functionEvaluationException5 = new org.apache.commons.math.FunctionEvaluationException((double) '#', "");
        org.apache.commons.math.MathException mathException6 = new org.apache.commons.math.MathException("org.apache.commons.math.FunctionEvaluationException: org.apache.commons.math.ode.IntegratorException: org.apache.commons.math.MathException: ", (java.lang.Throwable) functionEvaluationException5);
        java.lang.Object[] objArray7 = mathException6.getArguments();
        java.lang.String[] strArray22 = new java.lang.String[] { "hi!", "org.apache.commons.math.MathException: hi!", "", "hi!", "org.apache.commons.math.MathException: hi!" };
        org.apache.commons.math.ode.DerivativeException derivativeException23 = new org.apache.commons.math.ode.DerivativeException("hi!", strArray22);
        org.apache.commons.math.ode.IntegratorException integratorException24 = new org.apache.commons.math.ode.IntegratorException("", (java.lang.Object[]) strArray22);
        org.apache.commons.math.ode.DerivativeException derivativeException25 = new org.apache.commons.math.ode.DerivativeException("hi!", strArray22);
        org.apache.commons.math.ode.SwitchingFunctionsHandler switchingFunctionsHandler32 = new org.apache.commons.math.ode.SwitchingFunctionsHandler();
        java.lang.Object[] objArray41 = new java.lang.Object[] { 1L, 'a', 10L, 'a', (-1) };
        org.apache.commons.math.ConvergenceException convergenceException42 = new org.apache.commons.math.ConvergenceException("", objArray41);
        org.apache.commons.math.ode.IntegratorException integratorException43 = new org.apache.commons.math.ode.IntegratorException("org.apache.commons.math.MathException: hi!", objArray41);
        java.lang.Object[] objArray44 = new java.lang.Object[] { 2, switchingFunctionsHandler32, 1, objArray41 };
        org.apache.commons.math.ConvergenceException convergenceException47 = new org.apache.commons.math.ConvergenceException("hi!");
        org.apache.commons.math.MathException mathException48 = new org.apache.commons.math.MathException("hi!", (java.lang.Throwable) convergenceException47);
        org.apache.commons.math.FunctionEvaluationException functionEvaluationException49 = new org.apache.commons.math.FunctionEvaluationException((double) (short) 0, "org.apache.commons.math.MathException: hi!", objArray41, (java.lang.Throwable) mathException48);
        org.apache.commons.math.FunctionEvaluationException functionEvaluationException51 = new org.apache.commons.math.FunctionEvaluationException((double) 100L);
        org.apache.commons.math.ConvergenceException convergenceException52 = new org.apache.commons.math.ConvergenceException("org.apache.commons.math.MathException: hi!", objArray41, (java.lang.Throwable) functionEvaluationException51);
        org.apache.commons.math.FunctionEvaluationException functionEvaluationException54 = new org.apache.commons.math.FunctionEvaluationException((double) 100L);
        org.apache.commons.math.ConvergenceException convergenceException55 = new org.apache.commons.math.ConvergenceException("org.apache.commons.math.MathException: hi!", objArray41, (java.lang.Throwable) functionEvaluationException54);
        org.apache.commons.math.ConvergenceException convergenceException56 = new org.apache.commons.math.ConvergenceException("org.apache.commons.math.MathException: hi!", objArray41);
        org.apache.commons.math.ConvergenceException convergenceException57 = new org.apache.commons.math.ConvergenceException((java.lang.Throwable) convergenceException56);
        org.apache.commons.math.FunctionEvaluationException functionEvaluationException58 = new org.apache.commons.math.FunctionEvaluationException((double) (byte) -1, "org.apache.commons.math.ConvergenceException: org.apache.commons.math.FunctionEvaluationException: hi!", (java.lang.Object[]) strArray22, (java.lang.Throwable) convergenceException57);
        org.apache.commons.math.ConvergenceException convergenceException59 = new org.apache.commons.math.ConvergenceException("org.apache.commons.math.ode.IntegratorException: ", (java.lang.Object[]) strArray22);
        org.apache.commons.math.ode.DerivativeException derivativeException60 = new org.apache.commons.math.ode.DerivativeException("", strArray22);
        org.apache.commons.math.MathException mathException61 = new org.apache.commons.math.MathException("org.apache.commons.math.ode.IntegratorException: org.apache.commons.math.ConvergenceException: org.apache.commons.math.MathException: org.apache.commons.math.FunctionEvaluationException: hi!", (java.lang.Object[]) strArray22);
        org.apache.commons.math.FunctionEvaluationException functionEvaluationException65 = new org.apache.commons.math.FunctionEvaluationException((double) (short) 0, "hi!");
        java.lang.String str66 = functionEvaluationException65.getPattern();
        org.apache.commons.math.ConvergenceException convergenceException67 = new org.apache.commons.math.ConvergenceException("org.apache.commons.math.MathException: ", (java.lang.Throwable) functionEvaluationException65);
        org.apache.commons.math.ode.IntegratorException integratorException68 = new org.apache.commons.math.ode.IntegratorException((java.lang.Throwable) convergenceException67);
        org.apache.commons.math.ConvergenceException convergenceException69 = new org.apache.commons.math.ConvergenceException("org.apache.commons.math.ode.IntegratorException: org.apache.commons.math.ode.IntegratorException: org.apache.commons.math.MathException: hi!", (java.lang.Object[]) strArray22, (java.lang.Throwable) integratorException68);
        org.apache.commons.math.MathException mathException70 = new org.apache.commons.math.MathException("org.apache.commons.math.ode.DerivativeException: org.apache.commons.math.ode.IntegratorException: ", objArray7, (java.lang.Throwable) integratorException68);
        org.apache.commons.math.ConvergenceException convergenceException71 = new org.apache.commons.math.ConvergenceException("org.apache.commons.math.ConvergenceException: org.apache.commons.math.FunctionEvaluationException: org.apache.commons.math.FunctionEvaluationException: org.apache.commons.math.FunctionEvaluationException: Evaluation failed for argument = {0}", (java.lang.Throwable) mathException70);
        org.junit.Assert.assertNotNull(objArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray7), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray7), "[]");
        org.junit.Assert.assertNotNull(strArray22);
        org.junit.Assert.assertNotNull(objArray41);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray41), "[1, a, 10, a, -1]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray41), "[1, a, 10, a, -1]");
        org.junit.Assert.assertNotNull(objArray44);
        org.junit.Assert.assertEquals("'" + str66 + "' != '" + "hi!" + "'", str66, "hi!");
    }

    @Test
    public void test14615() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest29.test14615");
        java.lang.Throwable throwable4 = null;
        org.apache.commons.math.MathException mathException5 = new org.apache.commons.math.MathException(throwable4);
        org.apache.commons.math.MathException mathException7 = new org.apache.commons.math.MathException("hi!");
        mathException5.addSuppressed((java.lang.Throwable) mathException7);
        org.apache.commons.math.ode.DerivativeException derivativeException9 = new org.apache.commons.math.ode.DerivativeException((java.lang.Throwable) mathException5);
        java.lang.Object[] objArray10 = mathException5.getArguments();
        org.apache.commons.math.ode.SwitchingFunctionsHandler switchingFunctionsHandler17 = new org.apache.commons.math.ode.SwitchingFunctionsHandler();
        java.lang.Object[] objArray26 = new java.lang.Object[] { 1L, 'a', 10L, 'a', (-1) };
        org.apache.commons.math.ConvergenceException convergenceException27 = new org.apache.commons.math.ConvergenceException("", objArray26);
        org.apache.commons.math.ode.IntegratorException integratorException28 = new org.apache.commons.math.ode.IntegratorException("org.apache.commons.math.MathException: hi!", objArray26);
        java.lang.Object[] objArray29 = new java.lang.Object[] { 2, switchingFunctionsHandler17, 1, objArray26 };
        org.apache.commons.math.ConvergenceException convergenceException32 = new org.apache.commons.math.ConvergenceException("hi!");
        org.apache.commons.math.MathException mathException33 = new org.apache.commons.math.MathException("hi!", (java.lang.Throwable) convergenceException32);
        org.apache.commons.math.FunctionEvaluationException functionEvaluationException34 = new org.apache.commons.math.FunctionEvaluationException((double) (short) 0, "org.apache.commons.math.MathException: hi!", objArray26, (java.lang.Throwable) mathException33);
        org.apache.commons.math.MathException mathException35 = new org.apache.commons.math.MathException("org.apache.commons.math.MathException: ", objArray26);
        org.apache.commons.math.MathException mathException36 = new org.apache.commons.math.MathException("org.apache.commons.math.FunctionEvaluationException: hi!", objArray26);
        org.apache.commons.math.ode.IntegratorException integratorException37 = new org.apache.commons.math.ode.IntegratorException("org.apache.commons.math.FunctionEvaluationException: Evaluation failed for argument = -1", objArray26);
        org.apache.commons.math.FunctionEvaluationException functionEvaluationException38 = new org.apache.commons.math.FunctionEvaluationException(100.0d, "", objArray10, (java.lang.Throwable) integratorException37);
        java.lang.String[] strArray50 = new java.lang.String[] { "hi!", "org.apache.commons.math.MathException: hi!", "", "hi!", "org.apache.commons.math.MathException: hi!" };
        org.apache.commons.math.ode.DerivativeException derivativeException51 = new org.apache.commons.math.ode.DerivativeException("hi!", strArray50);
        org.apache.commons.math.ode.IntegratorException integratorException52 = new org.apache.commons.math.ode.IntegratorException("", (java.lang.Object[]) strArray50);
        org.apache.commons.math.ode.IntegratorException integratorException53 = new org.apache.commons.math.ode.IntegratorException("org.apache.commons.math.MathException: hi!", (java.lang.Object[]) strArray50);
        org.apache.commons.math.ConvergenceException convergenceException54 = new org.apache.commons.math.ConvergenceException("hi!", (java.lang.Throwable) integratorException53);
        java.lang.Throwable[] throwableArray55 = convergenceException54.getSuppressed();
        org.apache.commons.math.ConvergenceException convergenceException56 = new org.apache.commons.math.ConvergenceException("", (java.lang.Throwable) convergenceException54);
        org.apache.commons.math.ConvergenceException convergenceException57 = new org.apache.commons.math.ConvergenceException("org.apache.commons.math.ode.IntegratorException: org.apache.commons.math.FunctionEvaluationException: org.apache.commons.math.FunctionEvaluationException: Evaluation failed for argument = 35", (java.lang.Throwable) convergenceException56);
        org.apache.commons.math.MathException mathException58 = new org.apache.commons.math.MathException((java.lang.Throwable) convergenceException56);
        org.apache.commons.math.FunctionEvaluationException functionEvaluationException59 = new org.apache.commons.math.FunctionEvaluationException((double) 100, "org.apache.commons.math.ode.DerivativeException: Evaluation failed for argument = 1", objArray10, (java.lang.Throwable) mathException58);
        org.junit.Assert.assertNotNull(objArray10);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray10), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray10), "[]");
        org.junit.Assert.assertNotNull(objArray26);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray26), "[1, a, 10, a, -1]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray26), "[1, a, 10, a, -1]");
        org.junit.Assert.assertNotNull(objArray29);
        org.junit.Assert.assertNotNull(strArray50);
        org.junit.Assert.assertNotNull(throwableArray55);
    }

    @Test
    public void test14616() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest29.test14616");
        java.lang.String[] strArray10 = new java.lang.String[] { "hi!", "org.apache.commons.math.MathException: hi!", "", "hi!", "org.apache.commons.math.MathException: hi!" };
        org.apache.commons.math.ode.DerivativeException derivativeException11 = new org.apache.commons.math.ode.DerivativeException("hi!", strArray10);
        org.apache.commons.math.MathException mathException12 = new org.apache.commons.math.MathException("hi!", (java.lang.Object[]) strArray10);
        org.apache.commons.math.ode.DerivativeException derivativeException13 = new org.apache.commons.math.ode.DerivativeException("", strArray10);
        org.apache.commons.math.ode.DerivativeException derivativeException14 = new org.apache.commons.math.ode.DerivativeException("org.apache.commons.math.ode.IntegratorException: ", strArray10);
        java.lang.Throwable[] throwableArray15 = derivativeException14.getSuppressed();
        java.lang.Throwable[] throwableArray16 = derivativeException14.getSuppressed();
        org.apache.commons.math.ConvergenceException convergenceException17 = new org.apache.commons.math.ConvergenceException("org.apache.commons.math.MathException: org.apache.commons.math.FunctionEvaluationException: org.apache.commons.math.ode.IntegratorException: hi!", (java.lang.Object[]) throwableArray16);
        java.lang.String str18 = convergenceException17.getPattern();
        org.junit.Assert.assertNotNull(strArray10);
        org.junit.Assert.assertNotNull(throwableArray15);
        org.junit.Assert.assertNotNull(throwableArray16);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "org.apache.commons.math.MathException: org.apache.commons.math.FunctionEvaluationException: org.apache.commons.math.ode.IntegratorException: hi!" + "'", str18, "org.apache.commons.math.MathException: org.apache.commons.math.FunctionEvaluationException: org.apache.commons.math.ode.IntegratorException: hi!");
    }

    @Test
    public void test14617() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest29.test14617");
        org.apache.commons.math.ConvergenceException convergenceException8 = new org.apache.commons.math.ConvergenceException("hi!");
        org.apache.commons.math.MathException mathException9 = new org.apache.commons.math.MathException("hi!", (java.lang.Throwable) convergenceException8);
        java.lang.Object[] objArray10 = mathException9.getArguments();
        org.apache.commons.math.ode.IntegratorException integratorException11 = new org.apache.commons.math.ode.IntegratorException("org.apache.commons.math.ode.IntegratorException: org.apache.commons.math.MathException: ", objArray10);
        java.lang.Throwable throwable14 = null;
        org.apache.commons.math.MathException mathException15 = new org.apache.commons.math.MathException("hi!", throwable14);
        org.apache.commons.math.MathException mathException16 = new org.apache.commons.math.MathException("org.apache.commons.math.MathException: hi!", throwable14);
        org.apache.commons.math.ode.IntegratorException integratorException17 = new org.apache.commons.math.ode.IntegratorException(throwable14);
        java.lang.String str18 = integratorException17.getPattern();
        org.apache.commons.math.ConvergenceException convergenceException19 = new org.apache.commons.math.ConvergenceException("org.apache.commons.math.FunctionEvaluationException: org.apache.commons.math.ode.IntegratorException: org.apache.commons.math.MathException: ", objArray10, (java.lang.Throwable) integratorException17);
        org.apache.commons.math.MathException mathException20 = new org.apache.commons.math.MathException("org.apache.commons.math.ode.IntegratorException: ", objArray10);
        java.lang.Throwable[] throwableArray21 = mathException20.getSuppressed();
        java.lang.Object[] objArray31 = new java.lang.Object[] { 1L, 'a', 10L, 'a', (-1) };
        org.apache.commons.math.ConvergenceException convergenceException32 = new org.apache.commons.math.ConvergenceException("", objArray31);
        org.apache.commons.math.ode.IntegratorException integratorException33 = new org.apache.commons.math.ode.IntegratorException("org.apache.commons.math.MathException: hi!", objArray31);
        org.apache.commons.math.FunctionEvaluationException functionEvaluationException34 = new org.apache.commons.math.FunctionEvaluationException((double) (byte) 10, "org.apache.commons.math.MathException: ", objArray31);
        org.apache.commons.math.MathException mathException35 = new org.apache.commons.math.MathException("org.apache.commons.math.ConvergenceException: org.apache.commons.math.MathException: Evaluation failed for argument = 52", (java.lang.Object[]) throwableArray21, (java.lang.Throwable) functionEvaluationException34);
        org.apache.commons.math.ode.IntegratorException integratorException36 = new org.apache.commons.math.ode.IntegratorException("org.apache.commons.math.MathException: org.apache.commons.math.FunctionEvaluationException: org.apache.commons.math.MathException: ", (java.lang.Object[]) throwableArray21);
        org.apache.commons.math.ode.IntegratorException integratorException37 = new org.apache.commons.math.ode.IntegratorException("org.apache.commons.math.MathException: org.apache.commons.math.FunctionEvaluationException: org.apache.commons.math.ConvergenceException: org.apache.commons.math.FunctionEvaluationException: Evaluation failed for argument = 100", (java.lang.Object[]) throwableArray21);
        org.junit.Assert.assertNotNull(objArray10);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray10), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray10), "[]");
        org.junit.Assert.assertNull(str18);
        org.junit.Assert.assertNotNull(throwableArray21);
        org.junit.Assert.assertNotNull(objArray31);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray31), "[1, a, 10, a, -1]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray31), "[1, a, 10, a, -1]");
    }

    @Test
    public void test14618() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest29.test14618");
        org.apache.commons.math.FunctionEvaluationException functionEvaluationException2 = new org.apache.commons.math.FunctionEvaluationException(3.0d, "org.apache.commons.math.FunctionEvaluationException: org.apache.commons.math.FunctionEvaluationException: org.apache.commons.math.ode.DerivativeException: org.apache.commons.math.ode.IntegratorException: ");
    }

    @Test
    public void test14619() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest29.test14619");
        java.lang.Throwable throwable3 = null;
        org.apache.commons.math.MathException mathException4 = new org.apache.commons.math.MathException(throwable3);
        org.apache.commons.math.MathException mathException6 = new org.apache.commons.math.MathException("hi!");
        mathException4.addSuppressed((java.lang.Throwable) mathException6);
        org.apache.commons.math.ode.DerivativeException derivativeException8 = new org.apache.commons.math.ode.DerivativeException((java.lang.Throwable) mathException4);
        java.lang.Throwable[] throwableArray9 = derivativeException8.getSuppressed();
        org.apache.commons.math.ode.IntegratorException integratorException10 = new org.apache.commons.math.ode.IntegratorException("org.apache.commons.math.ConvergenceException: org.apache.commons.math.MathException: ", (java.lang.Object[]) throwableArray9);
        org.apache.commons.math.FunctionEvaluationException functionEvaluationException11 = new org.apache.commons.math.FunctionEvaluationException((double) (-1L), "org.apache.commons.math.ode.IntegratorException: org.apache.commons.math.ode.DerivativeException: org.apache.commons.math.MathException: org.apache.commons.math.ode.IntegratorException: org.apache.commons.math.MathException: ", (java.lang.Object[]) throwableArray9);
        org.junit.Assert.assertNotNull(throwableArray9);
    }

    @Test
    public void test14620() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest29.test14620");
        java.lang.Object[] objArray2 = null;
        java.lang.Object[] objArray18 = new java.lang.Object[] { 1L, 'a', 10L, 'a', (-1) };
        org.apache.commons.math.ConvergenceException convergenceException19 = new org.apache.commons.math.ConvergenceException("", objArray18);
        org.apache.commons.math.ode.IntegratorException integratorException20 = new org.apache.commons.math.ode.IntegratorException("org.apache.commons.math.MathException: hi!", objArray18);
        org.apache.commons.math.FunctionEvaluationException functionEvaluationException21 = new org.apache.commons.math.FunctionEvaluationException((double) (byte) 10, "org.apache.commons.math.MathException: ", objArray18);
        org.apache.commons.math.ode.DerivativeException derivativeException22 = new org.apache.commons.math.ode.DerivativeException((java.lang.Throwable) functionEvaluationException21);
        org.apache.commons.math.ode.DerivativeException derivativeException23 = new org.apache.commons.math.ode.DerivativeException((java.lang.Throwable) functionEvaluationException21);
        org.apache.commons.math.FunctionEvaluationException functionEvaluationException24 = new org.apache.commons.math.FunctionEvaluationException((double) (short) 100, "org.apache.commons.math.ode.IntegratorException: Evaluation failed for argument = 100", (java.lang.Throwable) functionEvaluationException21);
        java.lang.Throwable[] throwableArray25 = functionEvaluationException24.getSuppressed();
        org.apache.commons.math.FunctionEvaluationException functionEvaluationException26 = new org.apache.commons.math.FunctionEvaluationException((double) 1.0f, "org.apache.commons.math.ode.IntegratorException: Evaluation failed for argument = 100", (java.lang.Object[]) throwableArray25);
        org.apache.commons.math.FunctionEvaluationException functionEvaluationException27 = new org.apache.commons.math.FunctionEvaluationException((double) 1, "org.apache.commons.math.MathException: org.apache.commons.math.FunctionEvaluationException: Evaluation failed for argument = 35", (java.lang.Throwable) functionEvaluationException26);
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math.FunctionEvaluationException functionEvaluationException28 = new org.apache.commons.math.FunctionEvaluationException(1.0d, "org.apache.commons.math.ConvergenceException: org.apache.commons.math.FunctionEvaluationException: org.apache.commons.math.ConvergenceException: org.apache.commons.math.MathException: ", objArray2, (java.lang.Throwable) functionEvaluationException26);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(objArray18);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray18), "[1, a, 10, a, -1]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray18), "[1, a, 10, a, -1]");
        org.junit.Assert.assertNotNull(throwableArray25);
    }

    @Test
    public void test14621() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest29.test14621");
        java.lang.String[] strArray8 = new java.lang.String[] { "hi!", "org.apache.commons.math.MathException: hi!", "", "hi!", "org.apache.commons.math.MathException: hi!" };
        org.apache.commons.math.ode.DerivativeException derivativeException9 = new org.apache.commons.math.ode.DerivativeException("hi!", strArray8);
        org.apache.commons.math.ConvergenceException convergenceException10 = new org.apache.commons.math.ConvergenceException("org.apache.commons.math.FunctionEvaluationException: hi!", (java.lang.Object[]) strArray8);
        org.apache.commons.math.ode.DerivativeException derivativeException11 = new org.apache.commons.math.ode.DerivativeException("org.apache.commons.math.ConvergenceException: org.apache.commons.math.MathException: ", strArray8);
        org.apache.commons.math.ConvergenceException convergenceException22 = new org.apache.commons.math.ConvergenceException("hi!");
        org.apache.commons.math.MathException mathException23 = new org.apache.commons.math.MathException("hi!", (java.lang.Throwable) convergenceException22);
        java.lang.Object[] objArray24 = mathException23.getArguments();
        java.lang.Throwable throwable25 = null;
        org.apache.commons.math.ConvergenceException convergenceException26 = new org.apache.commons.math.ConvergenceException("hi!", objArray24, throwable25);
        org.apache.commons.math.FunctionEvaluationException functionEvaluationException27 = new org.apache.commons.math.FunctionEvaluationException((double) 1L, "", objArray24);
        org.apache.commons.math.FunctionEvaluationException functionEvaluationException28 = new org.apache.commons.math.FunctionEvaluationException(0.0d, "org.apache.commons.math.ode.IntegratorException: ", objArray24);
        org.apache.commons.math.ConvergenceException convergenceException29 = new org.apache.commons.math.ConvergenceException("org.apache.commons.math.ode.IntegratorException: hi!", objArray24);
        org.apache.commons.math.FunctionEvaluationException functionEvaluationException30 = new org.apache.commons.math.FunctionEvaluationException(35.0d, "org.apache.commons.math.ode.DerivativeException: org.apache.commons.math.MathException: ", objArray24);
        derivativeException11.addSuppressed((java.lang.Throwable) functionEvaluationException30);
        java.lang.Throwable[] throwableArray32 = derivativeException11.getSuppressed();
        org.apache.commons.math.MathException mathException33 = new org.apache.commons.math.MathException((java.lang.Throwable) derivativeException11);
        java.lang.Class<?> wildcardClass34 = derivativeException11.getClass();
        org.junit.Assert.assertNotNull(strArray8);
        org.junit.Assert.assertNotNull(objArray24);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray24), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray24), "[]");
        org.junit.Assert.assertNotNull(throwableArray32);
        org.junit.Assert.assertNotNull(wildcardClass34);
    }

    @Test
    public void test14622() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest29.test14622");
        org.apache.commons.math.ode.SwitchingFunctionsHandler switchingFunctionsHandler9 = new org.apache.commons.math.ode.SwitchingFunctionsHandler();
        java.lang.Object[] objArray18 = new java.lang.Object[] { 1L, 'a', 10L, 'a', (-1) };
        org.apache.commons.math.ConvergenceException convergenceException19 = new org.apache.commons.math.ConvergenceException("", objArray18);
        org.apache.commons.math.ode.IntegratorException integratorException20 = new org.apache.commons.math.ode.IntegratorException("org.apache.commons.math.MathException: hi!", objArray18);
        java.lang.Object[] objArray21 = new java.lang.Object[] { 2, switchingFunctionsHandler9, 1, objArray18 };
        org.apache.commons.math.ConvergenceException convergenceException24 = new org.apache.commons.math.ConvergenceException("hi!");
        org.apache.commons.math.MathException mathException25 = new org.apache.commons.math.MathException("hi!", (java.lang.Throwable) convergenceException24);
        org.apache.commons.math.FunctionEvaluationException functionEvaluationException26 = new org.apache.commons.math.FunctionEvaluationException((double) (short) 0, "org.apache.commons.math.MathException: hi!", objArray18, (java.lang.Throwable) mathException25);
        org.apache.commons.math.FunctionEvaluationException functionEvaluationException27 = new org.apache.commons.math.FunctionEvaluationException((double) (-1.0f), (java.lang.Throwable) functionEvaluationException26);
        java.lang.Object[] objArray28 = functionEvaluationException26.getArguments();
        org.apache.commons.math.ConvergenceException convergenceException29 = new org.apache.commons.math.ConvergenceException("org.apache.commons.math.MathException: hi!", objArray28);
        org.apache.commons.math.ConvergenceException convergenceException39 = new org.apache.commons.math.ConvergenceException("hi!");
        org.apache.commons.math.MathException mathException40 = new org.apache.commons.math.MathException("hi!", (java.lang.Throwable) convergenceException39);
        java.lang.Object[] objArray41 = mathException40.getArguments();
        java.lang.Throwable throwable42 = null;
        org.apache.commons.math.ConvergenceException convergenceException43 = new org.apache.commons.math.ConvergenceException("hi!", objArray41, throwable42);
        org.apache.commons.math.FunctionEvaluationException functionEvaluationException44 = new org.apache.commons.math.FunctionEvaluationException((double) 1L, "", objArray41);
        org.apache.commons.math.FunctionEvaluationException functionEvaluationException45 = new org.apache.commons.math.FunctionEvaluationException(0.0d, "org.apache.commons.math.ode.IntegratorException: ", objArray41);
        org.apache.commons.math.ode.IntegratorException integratorException46 = new org.apache.commons.math.ode.IntegratorException("org.apache.commons.math.ode.DerivativeException: org.apache.commons.math.MathException", objArray41);
        java.lang.Object[] objArray60 = new java.lang.Object[] { 1L, 'a', 10L, 'a', (-1) };
        org.apache.commons.math.ConvergenceException convergenceException61 = new org.apache.commons.math.ConvergenceException("", objArray60);
        org.apache.commons.math.FunctionEvaluationException functionEvaluationException62 = new org.apache.commons.math.FunctionEvaluationException((-1.0d), "", objArray60);
        org.apache.commons.math.ode.IntegratorException integratorException63 = new org.apache.commons.math.ode.IntegratorException("hi!", objArray60);
        org.apache.commons.math.MathException mathException64 = new org.apache.commons.math.MathException("org.apache.commons.math.MathException: hi!", objArray60);
        org.apache.commons.math.ConvergenceException convergenceException65 = new org.apache.commons.math.ConvergenceException("org.apache.commons.math.MathException: ", objArray60);
        java.lang.Object[] objArray76 = new java.lang.Object[] { 1L, 'a', 10L, 'a', (-1) };
        org.apache.commons.math.ConvergenceException convergenceException77 = new org.apache.commons.math.ConvergenceException("", objArray76);
        org.apache.commons.math.FunctionEvaluationException functionEvaluationException78 = new org.apache.commons.math.FunctionEvaluationException((-1.0d), "", objArray76);
        org.apache.commons.math.ode.IntegratorException integratorException79 = new org.apache.commons.math.ode.IntegratorException("hi!", objArray76);
        org.apache.commons.math.MathException mathException80 = new org.apache.commons.math.MathException("org.apache.commons.math.MathException: hi!", objArray76);
        org.apache.commons.math.FunctionEvaluationException functionEvaluationException81 = new org.apache.commons.math.FunctionEvaluationException(1.0d, "hi!", objArray60, (java.lang.Throwable) mathException80);
        org.apache.commons.math.ConvergenceException convergenceException82 = new org.apache.commons.math.ConvergenceException("org.apache.commons.math.FunctionEvaluationException: Evaluation failed for argument = 52", objArray41, (java.lang.Throwable) mathException80);
        org.apache.commons.math.MathException mathException83 = new org.apache.commons.math.MathException("org.apache.commons.math.ode.IntegratorException: org.apache.commons.math.ConvergenceException: org.apache.commons.math.MathException: org.apache.commons.math.FunctionEvaluationException: hi!", objArray28, (java.lang.Throwable) convergenceException82);
        org.apache.commons.math.ode.IntegratorException integratorException84 = new org.apache.commons.math.ode.IntegratorException("org.apache.commons.math.MathException: org.apache.commons.math.FunctionEvaluationException: org.apache.commons.math.MathException: hi!", objArray28);
        org.apache.commons.math.MathException mathException85 = new org.apache.commons.math.MathException("org.apache.commons.math.ConvergenceException: org.apache.commons.math.FunctionEvaluationException: org.apache.commons.math.FunctionEvaluationException: hi!", objArray28);
        org.apache.commons.math.ConvergenceException convergenceException86 = new org.apache.commons.math.ConvergenceException("", objArray28);
        org.junit.Assert.assertNotNull(objArray18);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray18), "[1, a, 10, a, -1]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray18), "[1, a, 10, a, -1]");
        org.junit.Assert.assertNotNull(objArray21);
        org.junit.Assert.assertNotNull(objArray28);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray28), "[1, a, 10, a, -1]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray28), "[1, a, 10, a, -1]");
        org.junit.Assert.assertNotNull(objArray41);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray41), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray41), "[]");
        org.junit.Assert.assertNotNull(objArray60);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray60), "[1, a, 10, a, -1]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray60), "[1, a, 10, a, -1]");
        org.junit.Assert.assertNotNull(objArray76);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray76), "[1, a, 10, a, -1]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray76), "[1, a, 10, a, -1]");
    }

    @Test
    public void test14623() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest29.test14623");
        org.apache.commons.math.ode.SwitchingFunctionsHandler switchingFunctionsHandler0 = new org.apache.commons.math.ode.SwitchingFunctionsHandler();
        boolean boolean1 = switchingFunctionsHandler0.isEmpty();
        double[] doubleArray4 = new double[] { 100.0d };
        boolean boolean5 = switchingFunctionsHandler0.reset((double) 0L, doubleArray4);
        org.apache.commons.math.ode.SwitchingFunctionsHandler switchingFunctionsHandler7 = new org.apache.commons.math.ode.SwitchingFunctionsHandler();
        boolean boolean8 = switchingFunctionsHandler7.isEmpty();
        org.apache.commons.math.ode.StepInterpolator stepInterpolator9 = null;
        boolean boolean10 = switchingFunctionsHandler7.evaluateStep(stepInterpolator9);
        org.apache.commons.math.ode.SwitchingFunctionsHandler switchingFunctionsHandler12 = new org.apache.commons.math.ode.SwitchingFunctionsHandler();
        boolean boolean13 = switchingFunctionsHandler12.isEmpty();
        double[] doubleArray16 = new double[] { 100.0d };
        boolean boolean17 = switchingFunctionsHandler12.reset((double) 0L, doubleArray16);
        boolean boolean18 = switchingFunctionsHandler7.reset((double) 1, doubleArray16);
        boolean boolean19 = switchingFunctionsHandler0.reset((double) 100, doubleArray16);
        double double20 = switchingFunctionsHandler0.getEventTime();
        org.apache.commons.math.ode.SwitchingFunctionsHandler switchingFunctionsHandler22 = new org.apache.commons.math.ode.SwitchingFunctionsHandler();
        boolean boolean23 = switchingFunctionsHandler22.isEmpty();
        org.apache.commons.math.ode.StepInterpolator stepInterpolator24 = null;
        boolean boolean25 = switchingFunctionsHandler22.evaluateStep(stepInterpolator24);
        org.apache.commons.math.ode.SwitchingFunctionsHandler switchingFunctionsHandler27 = new org.apache.commons.math.ode.SwitchingFunctionsHandler();
        boolean boolean28 = switchingFunctionsHandler27.isEmpty();
        double[] doubleArray31 = new double[] { 100.0d };
        boolean boolean32 = switchingFunctionsHandler27.reset((double) 0L, doubleArray31);
        switchingFunctionsHandler22.stepAccepted((double) (byte) 10, doubleArray31);
        switchingFunctionsHandler0.stepAccepted(0.0d, doubleArray31);
        boolean boolean35 = switchingFunctionsHandler0.isEmpty();
        boolean boolean36 = switchingFunctionsHandler0.isEmpty();
        org.apache.commons.math.ode.StepInterpolator stepInterpolator37 = null;
        boolean boolean38 = switchingFunctionsHandler0.evaluateStep(stepInterpolator37);
        org.apache.commons.math.ode.SwitchingFunction switchingFunction39 = null;
        switchingFunctionsHandler0.add(switchingFunction39, (double) (byte) 1, (double) 1, 100);
        org.apache.commons.math.ode.SwitchingFunction switchingFunction44 = null;
        switchingFunctionsHandler0.add(switchingFunction44, (double) (short) 1, (double) (-1), (int) (byte) -1);
        org.apache.commons.math.ode.StepInterpolator stepInterpolator49 = null;
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean50 = switchingFunctionsHandler0.evaluateStep(stepInterpolator49);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertNotNull(doubleArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray4), "[100.0]");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertNotNull(doubleArray16);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray16), "[100.0]");
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertTrue(Double.isNaN(double20));
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + true + "'", boolean23 == true);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + true + "'", boolean28 == true);
        org.junit.Assert.assertNotNull(doubleArray31);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray31), "[100.0]");
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + false + "'", boolean32 == false);
        org.junit.Assert.assertTrue("'" + boolean35 + "' != '" + true + "'", boolean35 == true);
        org.junit.Assert.assertTrue("'" + boolean36 + "' != '" + true + "'", boolean36 == true);
        org.junit.Assert.assertTrue("'" + boolean38 + "' != '" + false + "'", boolean38 == false);
    }

    @Test
    public void test14624() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest29.test14624");
        java.lang.Object[] objArray20 = new java.lang.Object[] { 1L, 'a', 10L, 'a', (-1) };
        org.apache.commons.math.ConvergenceException convergenceException21 = new org.apache.commons.math.ConvergenceException("", objArray20);
        org.apache.commons.math.FunctionEvaluationException functionEvaluationException22 = new org.apache.commons.math.FunctionEvaluationException((-1.0d), "", objArray20);
        org.apache.commons.math.ode.IntegratorException integratorException23 = new org.apache.commons.math.ode.IntegratorException("hi!", objArray20);
        org.apache.commons.math.FunctionEvaluationException functionEvaluationException26 = new org.apache.commons.math.FunctionEvaluationException((double) (short) 1, "");
        org.apache.commons.math.MathException mathException27 = new org.apache.commons.math.MathException("", objArray20, (java.lang.Throwable) functionEvaluationException26);
        org.apache.commons.math.MathException mathException28 = new org.apache.commons.math.MathException((java.lang.Throwable) functionEvaluationException26);
        java.lang.Object[] objArray29 = functionEvaluationException26.getArguments();
        java.lang.Throwable[] throwableArray30 = functionEvaluationException26.getSuppressed();
        java.lang.Object[] objArray31 = functionEvaluationException26.getArguments();
        org.apache.commons.math.ode.SwitchingFunctionsHandler switchingFunctionsHandler36 = new org.apache.commons.math.ode.SwitchingFunctionsHandler();
        java.lang.Object[] objArray45 = new java.lang.Object[] { 1L, 'a', 10L, 'a', (-1) };
        org.apache.commons.math.ConvergenceException convergenceException46 = new org.apache.commons.math.ConvergenceException("", objArray45);
        org.apache.commons.math.ode.IntegratorException integratorException47 = new org.apache.commons.math.ode.IntegratorException("org.apache.commons.math.MathException: hi!", objArray45);
        java.lang.Object[] objArray48 = new java.lang.Object[] { 2, switchingFunctionsHandler36, 1, objArray45 };
        org.apache.commons.math.ConvergenceException convergenceException51 = new org.apache.commons.math.ConvergenceException("hi!");
        org.apache.commons.math.MathException mathException52 = new org.apache.commons.math.MathException("hi!", (java.lang.Throwable) convergenceException51);
        org.apache.commons.math.FunctionEvaluationException functionEvaluationException53 = new org.apache.commons.math.FunctionEvaluationException((double) (short) 0, "org.apache.commons.math.MathException: hi!", objArray45, (java.lang.Throwable) mathException52);
        org.apache.commons.math.FunctionEvaluationException functionEvaluationException54 = new org.apache.commons.math.FunctionEvaluationException((double) (-1.0f), (java.lang.Throwable) functionEvaluationException53);
        java.lang.Object[] objArray55 = functionEvaluationException53.getArguments();
        double double56 = functionEvaluationException53.getArgument();
        org.apache.commons.math.FunctionEvaluationException functionEvaluationException57 = new org.apache.commons.math.FunctionEvaluationException((double) 10, "org.apache.commons.math.ode.IntegratorException: hi!", objArray31, (java.lang.Throwable) functionEvaluationException53);
        org.apache.commons.math.ConvergenceException convergenceException58 = new org.apache.commons.math.ConvergenceException("", objArray31);
        org.apache.commons.math.ode.IntegratorException integratorException59 = new org.apache.commons.math.ode.IntegratorException("org.apache.commons.math.FunctionEvaluationException: Evaluation failed for argument = -1", objArray31);
        org.apache.commons.math.FunctionEvaluationException functionEvaluationException60 = new org.apache.commons.math.FunctionEvaluationException(0.0d, "org.apache.commons.math.ConvergenceException: org.apache.commons.math.FunctionEvaluationException: Evaluation failed for argument = -1", objArray31);
        org.apache.commons.math.FunctionEvaluationException functionEvaluationException61 = new org.apache.commons.math.FunctionEvaluationException((double) 10, "", objArray31);
        org.apache.commons.math.ode.IntegratorException integratorException62 = new org.apache.commons.math.ode.IntegratorException((java.lang.Throwable) functionEvaluationException61);
        org.apache.commons.math.FunctionEvaluationException functionEvaluationException63 = new org.apache.commons.math.FunctionEvaluationException((double) 1.0f, "org.apache.commons.math.ode.IntegratorException: org.apache.commons.math.FunctionEvaluationException: org.apache.commons.math.MathException: Evaluation failed for argument = -1", (java.lang.Throwable) functionEvaluationException61);
        org.apache.commons.math.ConvergenceException convergenceException64 = new org.apache.commons.math.ConvergenceException((java.lang.Throwable) functionEvaluationException61);
        org.junit.Assert.assertNotNull(objArray20);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray20), "[1, a, 10, a, -1]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray20), "[1, a, 10, a, -1]");
        org.junit.Assert.assertNotNull(objArray29);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray29), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray29), "[]");
        org.junit.Assert.assertNotNull(throwableArray30);
        org.junit.Assert.assertNotNull(objArray31);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray31), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray31), "[]");
        org.junit.Assert.assertNotNull(objArray45);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray45), "[1, a, 10, a, -1]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray45), "[1, a, 10, a, -1]");
        org.junit.Assert.assertNotNull(objArray48);
        org.junit.Assert.assertNotNull(objArray55);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray55), "[1, a, 10, a, -1]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray55), "[1, a, 10, a, -1]");
        org.junit.Assert.assertTrue("'" + double56 + "' != '" + 0.0d + "'", double56 == 0.0d);
    }

    @Test
    public void test14625() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest29.test14625");
        java.lang.String[] strArray15 = new java.lang.String[] { "hi!", "org.apache.commons.math.MathException: hi!", "", "hi!", "org.apache.commons.math.MathException: hi!" };
        org.apache.commons.math.ode.DerivativeException derivativeException16 = new org.apache.commons.math.ode.DerivativeException("hi!", strArray15);
        org.apache.commons.math.ode.IntegratorException integratorException17 = new org.apache.commons.math.ode.IntegratorException("", (java.lang.Object[]) strArray15);
        org.apache.commons.math.ode.IntegratorException integratorException18 = new org.apache.commons.math.ode.IntegratorException("org.apache.commons.math.MathException: hi!", (java.lang.Object[]) strArray15);
        org.apache.commons.math.ode.IntegratorException integratorException19 = new org.apache.commons.math.ode.IntegratorException("org.apache.commons.math.MathException: hi!", (java.lang.Object[]) strArray15);
        org.apache.commons.math.MathException mathException20 = new org.apache.commons.math.MathException("org.apache.commons.math.FunctionEvaluationException: hi!", (java.lang.Throwable) integratorException19);
        org.apache.commons.math.FunctionEvaluationException functionEvaluationException21 = new org.apache.commons.math.FunctionEvaluationException(100.0d, (java.lang.Throwable) mathException20);
        java.lang.String str22 = functionEvaluationException21.getPattern();
        org.apache.commons.math.FunctionEvaluationException functionEvaluationException23 = new org.apache.commons.math.FunctionEvaluationException((double) 10, "org.apache.commons.math.FunctionEvaluationException: Evaluation failed for argument = 35", (java.lang.Throwable) functionEvaluationException21);
        java.lang.Throwable[] throwableArray24 = functionEvaluationException23.getSuppressed();
        java.lang.Object[] objArray25 = functionEvaluationException23.getArguments();
        org.apache.commons.math.FunctionEvaluationException functionEvaluationException26 = new org.apache.commons.math.FunctionEvaluationException((double) 2, "org.apache.commons.math.ode.DerivativeException: org.apache.commons.math.MathException: org.apache.commons.math.ConvergenceException: Evaluation failed for argument = 52", objArray25);
        java.lang.Throwable[] throwableArray27 = functionEvaluationException26.getSuppressed();
        org.apache.commons.math.ode.DerivativeException derivativeException28 = new org.apache.commons.math.ode.DerivativeException((java.lang.Throwable) functionEvaluationException26);
        org.junit.Assert.assertNotNull(strArray15);
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "org.apache.commons.math.FunctionEvaluationException: hi!" + "'", str22, "org.apache.commons.math.FunctionEvaluationException: hi!");
        org.junit.Assert.assertNotNull(throwableArray24);
        org.junit.Assert.assertNotNull(objArray25);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray25), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray25), "[]");
        org.junit.Assert.assertNotNull(throwableArray27);
    }

    @Test
    public void test14626() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest29.test14626");
        org.apache.commons.math.FunctionEvaluationException functionEvaluationException4 = new org.apache.commons.math.FunctionEvaluationException((double) '4');
        double double5 = functionEvaluationException4.getArgument();
        org.apache.commons.math.ConvergenceException convergenceException6 = new org.apache.commons.math.ConvergenceException((java.lang.Throwable) functionEvaluationException4);
        org.apache.commons.math.MathException mathException7 = new org.apache.commons.math.MathException("org.apache.commons.math.FunctionEvaluationException: org.apache.commons.math.MathException: hi!", (java.lang.Throwable) convergenceException6);
        org.apache.commons.math.ConvergenceException convergenceException8 = new org.apache.commons.math.ConvergenceException("org.apache.commons.math.ode.IntegratorException: org.apache.commons.math.MathException: hi!", (java.lang.Throwable) mathException7);
        org.apache.commons.math.ConvergenceException convergenceException9 = new org.apache.commons.math.ConvergenceException("org.apache.commons.math.MathException: org.apache.commons.math.ode.IntegratorException: ", (java.lang.Throwable) convergenceException8);
        org.apache.commons.math.ode.IntegratorException integratorException10 = new org.apache.commons.math.ode.IntegratorException((java.lang.Throwable) convergenceException9);
        org.apache.commons.math.MathException mathException11 = new org.apache.commons.math.MathException((java.lang.Throwable) convergenceException9);
        org.apache.commons.math.FunctionEvaluationException functionEvaluationException16 = new org.apache.commons.math.FunctionEvaluationException((double) (byte) -1);
        org.apache.commons.math.MathException mathException17 = new org.apache.commons.math.MathException("", (java.lang.Throwable) functionEvaluationException16);
        java.lang.Object[] objArray18 = mathException17.getArguments();
        org.apache.commons.math.FunctionEvaluationException functionEvaluationException19 = new org.apache.commons.math.FunctionEvaluationException(0.0d, "org.apache.commons.math.FunctionEvaluationException: ", objArray18);
        org.apache.commons.math.MathException mathException20 = new org.apache.commons.math.MathException((java.lang.Throwable) functionEvaluationException19);
        mathException11.addSuppressed((java.lang.Throwable) mathException20);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 52.0d + "'", double5 == 52.0d);
        org.junit.Assert.assertNotNull(objArray18);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray18), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray18), "[]");
    }

    @Test
    public void test14627() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest29.test14627");
        java.lang.Object[] objArray9 = new java.lang.Object[] { 1L, 'a', 10L, 'a', (-1) };
        org.apache.commons.math.ConvergenceException convergenceException10 = new org.apache.commons.math.ConvergenceException("", objArray9);
        org.apache.commons.math.FunctionEvaluationException functionEvaluationException11 = new org.apache.commons.math.FunctionEvaluationException((-1.0d), "", objArray9);
        org.apache.commons.math.ode.IntegratorException integratorException12 = new org.apache.commons.math.ode.IntegratorException("hi!", objArray9);
        java.lang.Object[] objArray23 = new java.lang.Object[] { 1L, 'a', 10L, 'a', (-1) };
        org.apache.commons.math.ConvergenceException convergenceException24 = new org.apache.commons.math.ConvergenceException("", objArray23);
        org.apache.commons.math.FunctionEvaluationException functionEvaluationException25 = new org.apache.commons.math.FunctionEvaluationException((-1.0d), "", objArray23);
        org.apache.commons.math.ode.IntegratorException integratorException26 = new org.apache.commons.math.ode.IntegratorException("hi!", objArray23);
        org.apache.commons.math.FunctionEvaluationException functionEvaluationException29 = new org.apache.commons.math.FunctionEvaluationException((double) (short) 1, "");
        org.apache.commons.math.MathException mathException30 = new org.apache.commons.math.MathException("", objArray23, (java.lang.Throwable) functionEvaluationException29);
        integratorException12.addSuppressed((java.lang.Throwable) functionEvaluationException29);
        java.lang.Throwable[] throwableArray32 = functionEvaluationException29.getSuppressed();
        java.lang.String str33 = functionEvaluationException29.getPattern();
        org.junit.Assert.assertNotNull(objArray9);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray9), "[1, a, 10, a, -1]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray9), "[1, a, 10, a, -1]");
        org.junit.Assert.assertNotNull(objArray23);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray23), "[1, a, 10, a, -1]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray23), "[1, a, 10, a, -1]");
        org.junit.Assert.assertNotNull(throwableArray32);
        org.junit.Assert.assertEquals("'" + str33 + "' != '" + "" + "'", str33, "");
    }

    @Test
    public void test14628() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest29.test14628");
        java.lang.String[] strArray15 = new java.lang.String[] { "hi!", "org.apache.commons.math.MathException: hi!", "", "hi!", "org.apache.commons.math.MathException: hi!" };
        org.apache.commons.math.ode.DerivativeException derivativeException16 = new org.apache.commons.math.ode.DerivativeException("hi!", strArray15);
        org.apache.commons.math.MathException mathException17 = new org.apache.commons.math.MathException("hi!", (java.lang.Object[]) strArray15);
        org.apache.commons.math.ode.DerivativeException derivativeException18 = new org.apache.commons.math.ode.DerivativeException("", strArray15);
        org.apache.commons.math.FunctionEvaluationException functionEvaluationException19 = new org.apache.commons.math.FunctionEvaluationException((double) (byte) -1, "org.apache.commons.math.MathException: ", (java.lang.Object[]) strArray15);
        org.apache.commons.math.MathException mathException20 = new org.apache.commons.math.MathException("org.apache.commons.math.ode.IntegratorException: ", (java.lang.Object[]) strArray15);
        org.apache.commons.math.ode.IntegratorException integratorException21 = new org.apache.commons.math.ode.IntegratorException("org.apache.commons.math.ConvergenceException: Evaluation failed for argument = 52", (java.lang.Object[]) strArray15);
        org.apache.commons.math.ConvergenceException convergenceException28 = new org.apache.commons.math.ConvergenceException("hi!");
        org.apache.commons.math.MathException mathException29 = new org.apache.commons.math.MathException("hi!", (java.lang.Throwable) convergenceException28);
        java.lang.Throwable[] throwableArray30 = convergenceException28.getSuppressed();
        org.apache.commons.math.FunctionEvaluationException functionEvaluationException31 = new org.apache.commons.math.FunctionEvaluationException((double) (byte) 10, "org.apache.commons.math.MathException: ", (java.lang.Object[]) throwableArray30);
        org.apache.commons.math.FunctionEvaluationException functionEvaluationException33 = new org.apache.commons.math.FunctionEvaluationException((double) '4');
        double double34 = functionEvaluationException33.getArgument();
        org.apache.commons.math.ConvergenceException convergenceException35 = new org.apache.commons.math.ConvergenceException((java.lang.Throwable) functionEvaluationException33);
        org.apache.commons.math.FunctionEvaluationException functionEvaluationException36 = new org.apache.commons.math.FunctionEvaluationException((double) (-1.0f), "org.apache.commons.math.MathException: ", (java.lang.Object[]) throwableArray30, (java.lang.Throwable) functionEvaluationException33);
        org.apache.commons.math.ConvergenceException convergenceException37 = new org.apache.commons.math.ConvergenceException((java.lang.Throwable) functionEvaluationException33);
        double double38 = functionEvaluationException33.getArgument();
        org.apache.commons.math.MathException mathException39 = new org.apache.commons.math.MathException("", (java.lang.Object[]) strArray15, (java.lang.Throwable) functionEvaluationException33);
        org.apache.commons.math.ConvergenceException convergenceException45 = new org.apache.commons.math.ConvergenceException("hi!");
        org.apache.commons.math.MathException mathException46 = new org.apache.commons.math.MathException("hi!", (java.lang.Throwable) convergenceException45);
        java.lang.Object[] objArray47 = mathException46.getArguments();
        java.lang.Throwable throwable48 = null;
        org.apache.commons.math.ConvergenceException convergenceException49 = new org.apache.commons.math.ConvergenceException("hi!", objArray47, throwable48);
        org.apache.commons.math.FunctionEvaluationException functionEvaluationException50 = new org.apache.commons.math.FunctionEvaluationException((double) 1L, "", objArray47);
        double double51 = functionEvaluationException50.getArgument();
        org.apache.commons.math.ConvergenceException convergenceException52 = new org.apache.commons.math.ConvergenceException("org.apache.commons.math.MathException: org.apache.commons.math.MathException: ", (java.lang.Object[]) strArray15, (java.lang.Throwable) functionEvaluationException50);
        java.lang.Object[] objArray53 = functionEvaluationException50.getArguments();
        java.lang.Throwable[] throwableArray54 = functionEvaluationException50.getSuppressed();
        org.apache.commons.math.MathException mathException55 = new org.apache.commons.math.MathException("", (java.lang.Throwable) functionEvaluationException50);
        org.junit.Assert.assertNotNull(strArray15);
        org.junit.Assert.assertNotNull(throwableArray30);
        org.junit.Assert.assertTrue("'" + double34 + "' != '" + 52.0d + "'", double34 == 52.0d);
        org.junit.Assert.assertTrue("'" + double38 + "' != '" + 52.0d + "'", double38 == 52.0d);
        org.junit.Assert.assertNotNull(objArray47);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray47), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray47), "[]");
        org.junit.Assert.assertTrue("'" + double51 + "' != '" + 1.0d + "'", double51 == 1.0d);
        org.junit.Assert.assertNotNull(objArray53);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray53), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray53), "[]");
        org.junit.Assert.assertNotNull(throwableArray54);
    }

    @Test
    public void test14629() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest29.test14629");
        org.apache.commons.math.ConvergenceException convergenceException1 = new org.apache.commons.math.ConvergenceException("org.apache.commons.math.ode.DerivativeException: org.apache.commons.math.MathException: ");
        org.apache.commons.math.ConvergenceException convergenceException2 = new org.apache.commons.math.ConvergenceException((java.lang.Throwable) convergenceException1);
    }

    @Test
    public void test14630() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest29.test14630");
        org.apache.commons.math.ode.SwitchingFunctionsHandler switchingFunctionsHandler0 = new org.apache.commons.math.ode.SwitchingFunctionsHandler();
        org.apache.commons.math.ode.SwitchingFunction switchingFunction1 = null;
        switchingFunctionsHandler0.add(switchingFunction1, (double) (-1), (double) 3, 0);
        double[] doubleArray13 = new double[] { 0L, 10.0d, 'a', 0.0d, (-1.0d), 0 };
        boolean boolean14 = switchingFunctionsHandler0.reset((double) (-1), doubleArray13);
        boolean boolean15 = switchingFunctionsHandler0.isEmpty();
        double double16 = switchingFunctionsHandler0.getEventTime();
        org.apache.commons.math.ode.SwitchingFunction switchingFunction17 = null;
        switchingFunctionsHandler0.add(switchingFunction17, (double) (-1.0f), 0.0d, (int) (short) -1);
        boolean boolean22 = switchingFunctionsHandler0.isEmpty();
        org.apache.commons.math.ode.SwitchingFunctionsHandler switchingFunctionsHandler24 = new org.apache.commons.math.ode.SwitchingFunctionsHandler();
        boolean boolean25 = switchingFunctionsHandler24.isEmpty();
        double[] doubleArray28 = new double[] { 100.0d };
        boolean boolean29 = switchingFunctionsHandler24.reset((double) 0L, doubleArray28);
        boolean boolean30 = switchingFunctionsHandler0.reset((double) 100L, doubleArray28);
        boolean boolean31 = switchingFunctionsHandler0.isEmpty();
        boolean boolean32 = switchingFunctionsHandler0.isEmpty();
        boolean boolean33 = switchingFunctionsHandler0.isEmpty();
        org.apache.commons.math.ode.SwitchingFunction switchingFunction34 = null;
        switchingFunctionsHandler0.add(switchingFunction34, (double) 1.0f, 100.0d, (int) 'a');
        double double39 = switchingFunctionsHandler0.getEventTime();
        org.junit.Assert.assertNotNull(doubleArray13);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray13), "[0.0, 10.0, 97.0, 0.0, -1.0, 0.0]");
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue(Double.isNaN(double16));
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + true + "'", boolean25 == true);
        org.junit.Assert.assertNotNull(doubleArray28);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray28), "[100.0]");
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + false + "'", boolean29 == false);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + false + "'", boolean30 == false);
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + false + "'", boolean31 == false);
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + false + "'", boolean32 == false);
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + false + "'", boolean33 == false);
        org.junit.Assert.assertTrue(Double.isNaN(double39));
    }

    @Test
    public void test14631() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest29.test14631");
        java.lang.String[] strArray10 = new java.lang.String[] { "hi!", "org.apache.commons.math.MathException: hi!", "", "hi!", "org.apache.commons.math.MathException: hi!" };
        org.apache.commons.math.ode.DerivativeException derivativeException11 = new org.apache.commons.math.ode.DerivativeException("hi!", strArray10);
        org.apache.commons.math.ConvergenceException convergenceException12 = new org.apache.commons.math.ConvergenceException("", (java.lang.Object[]) strArray10);
        org.apache.commons.math.ode.SwitchingFunctionsHandler switchingFunctionsHandler18 = new org.apache.commons.math.ode.SwitchingFunctionsHandler();
        java.lang.Object[] objArray27 = new java.lang.Object[] { 1L, 'a', 10L, 'a', (-1) };
        org.apache.commons.math.ConvergenceException convergenceException28 = new org.apache.commons.math.ConvergenceException("", objArray27);
        org.apache.commons.math.ode.IntegratorException integratorException29 = new org.apache.commons.math.ode.IntegratorException("org.apache.commons.math.MathException: hi!", objArray27);
        java.lang.Object[] objArray30 = new java.lang.Object[] { 2, switchingFunctionsHandler18, 1, objArray27 };
        org.apache.commons.math.ConvergenceException convergenceException33 = new org.apache.commons.math.ConvergenceException("hi!");
        org.apache.commons.math.MathException mathException34 = new org.apache.commons.math.MathException("hi!", (java.lang.Throwable) convergenceException33);
        org.apache.commons.math.FunctionEvaluationException functionEvaluationException35 = new org.apache.commons.math.FunctionEvaluationException((double) (short) 0, "org.apache.commons.math.MathException: hi!", objArray27, (java.lang.Throwable) mathException34);
        org.apache.commons.math.FunctionEvaluationException functionEvaluationException37 = new org.apache.commons.math.FunctionEvaluationException((double) 100L);
        org.apache.commons.math.ConvergenceException convergenceException38 = new org.apache.commons.math.ConvergenceException("org.apache.commons.math.MathException: hi!", objArray27, (java.lang.Throwable) functionEvaluationException37);
        org.apache.commons.math.FunctionEvaluationException functionEvaluationException40 = new org.apache.commons.math.FunctionEvaluationException((double) 100L);
        org.apache.commons.math.ConvergenceException convergenceException41 = new org.apache.commons.math.ConvergenceException("org.apache.commons.math.MathException: hi!", objArray27, (java.lang.Throwable) functionEvaluationException40);
        org.apache.commons.math.MathException mathException42 = new org.apache.commons.math.MathException("org.apache.commons.math.MathException: ", (java.lang.Object[]) strArray10, (java.lang.Throwable) functionEvaluationException40);
        java.lang.Throwable[] throwableArray43 = functionEvaluationException40.getSuppressed();
        org.apache.commons.math.ConvergenceException convergenceException45 = new org.apache.commons.math.ConvergenceException("org.apache.commons.math.FunctionEvaluationException: hi!");
        org.apache.commons.math.FunctionEvaluationException functionEvaluationException46 = new org.apache.commons.math.FunctionEvaluationException((double) 0, "org.apache.commons.math.MathException: ", (java.lang.Object[]) throwableArray43, (java.lang.Throwable) convergenceException45);
        java.lang.Class<?> wildcardClass47 = functionEvaluationException46.getClass();
        org.junit.Assert.assertNotNull(strArray10);
        org.junit.Assert.assertNotNull(objArray27);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray27), "[1, a, 10, a, -1]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray27), "[1, a, 10, a, -1]");
        org.junit.Assert.assertNotNull(objArray30);
        org.junit.Assert.assertNotNull(throwableArray43);
        org.junit.Assert.assertNotNull(wildcardClass47);
    }

    @Test
    public void test14632() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest29.test14632");
        java.lang.Object[] objArray14 = new java.lang.Object[] { 1L, 'a', 10L, 'a', (-1) };
        org.apache.commons.math.ConvergenceException convergenceException15 = new org.apache.commons.math.ConvergenceException("", objArray14);
        org.apache.commons.math.FunctionEvaluationException functionEvaluationException16 = new org.apache.commons.math.FunctionEvaluationException((-1.0d), "", objArray14);
        org.apache.commons.math.ConvergenceException convergenceException17 = new org.apache.commons.math.ConvergenceException("org.apache.commons.math.MathException: ", objArray14);
        org.apache.commons.math.FunctionEvaluationException functionEvaluationException18 = new org.apache.commons.math.FunctionEvaluationException((double) 10.0f, "org.apache.commons.math.ConvergenceException: org.apache.commons.math.MathException: org.apache.commons.math.FunctionEvaluationException: hi!", objArray14);
        java.lang.Object[] objArray19 = functionEvaluationException18.getArguments();
        org.apache.commons.math.ode.IntegratorException integratorException20 = new org.apache.commons.math.ode.IntegratorException("org.apache.commons.math.ConvergenceException: Evaluation failed for argument = 52", objArray19);
        org.apache.commons.math.ConvergenceException convergenceException21 = new org.apache.commons.math.ConvergenceException("org.apache.commons.math.FunctionEvaluationException: org.apache.commons.math.ConvergenceException: Evaluation failed for argument = 52", objArray19);
        org.apache.commons.math.ode.IntegratorException integratorException22 = new org.apache.commons.math.ode.IntegratorException((java.lang.Throwable) convergenceException21);
        java.lang.Throwable[] throwableArray23 = convergenceException21.getSuppressed();
        org.apache.commons.math.MathException mathException24 = new org.apache.commons.math.MathException("org.apache.commons.math.ode.DerivativeException: org.apache.commons.math.MathException", (java.lang.Throwable) convergenceException21);
        java.lang.Class<?> wildcardClass25 = convergenceException21.getClass();
        org.junit.Assert.assertNotNull(objArray14);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray14), "[1, a, 10, a, -1]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray14), "[1, a, 10, a, -1]");
        org.junit.Assert.assertNotNull(objArray19);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray19), "[1, a, 10, a, -1]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray19), "[1, a, 10, a, -1]");
        org.junit.Assert.assertNotNull(throwableArray23);
        org.junit.Assert.assertNotNull(wildcardClass25);
    }

    @Test
    public void test14633() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest29.test14633");
        java.lang.String[] strArray15 = new java.lang.String[] { "hi!", "org.apache.commons.math.MathException: hi!", "", "hi!", "org.apache.commons.math.MathException: hi!" };
        org.apache.commons.math.ode.DerivativeException derivativeException16 = new org.apache.commons.math.ode.DerivativeException("hi!", strArray15);
        org.apache.commons.math.ConvergenceException convergenceException17 = new org.apache.commons.math.ConvergenceException("", (java.lang.Object[]) strArray15);
        org.apache.commons.math.FunctionEvaluationException functionEvaluationException18 = new org.apache.commons.math.FunctionEvaluationException((double) 1, "org.apache.commons.math.ode.IntegratorException: ", (java.lang.Object[]) strArray15);
        org.apache.commons.math.ode.IntegratorException integratorException19 = new org.apache.commons.math.ode.IntegratorException("org.apache.commons.math.ConvergenceException: org.apache.commons.math.MathException: org.apache.commons.math.FunctionEvaluationException: hi!", (java.lang.Object[]) strArray15);
        org.apache.commons.math.ode.DerivativeException derivativeException20 = new org.apache.commons.math.ode.DerivativeException("org.apache.commons.math.ode.DerivativeException: ", strArray15);
        org.apache.commons.math.ode.IntegratorException integratorException21 = new org.apache.commons.math.ode.IntegratorException("org.apache.commons.math.MathException: org.apache.commons.math.FunctionEvaluationException: org.apache.commons.math.FunctionEvaluationException: hi!", (java.lang.Object[]) strArray15);
        org.apache.commons.math.MathException mathException22 = new org.apache.commons.math.MathException("org.apache.commons.math.ode.IntegratorException: org.apache.commons.math.FunctionEvaluationException: hi!", (java.lang.Object[]) strArray15);
        org.apache.commons.math.ConvergenceException convergenceException24 = new org.apache.commons.math.ConvergenceException("org.apache.commons.math.FunctionEvaluationException: Evaluation failed for argument = 52");
        org.apache.commons.math.FunctionEvaluationException functionEvaluationException25 = new org.apache.commons.math.FunctionEvaluationException((double) (-1L), "org.apache.commons.math.MathException: org.apache.commons.math.MathException: ", (java.lang.Object[]) strArray15, (java.lang.Throwable) convergenceException24);
        java.lang.String str26 = convergenceException24.toString();
        org.junit.Assert.assertNotNull(strArray15);
        org.junit.Assert.assertEquals("'" + str26 + "' != '" + "org.apache.commons.math.ConvergenceException: org.apache.commons.math.FunctionEvaluationException: Evaluation failed for argument = 52" + "'", str26, "org.apache.commons.math.ConvergenceException: org.apache.commons.math.FunctionEvaluationException: Evaluation failed for argument = 52");
    }

    @Test
    public void test14634() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest29.test14634");
        org.apache.commons.math.ode.SwitchingFunctionsHandler switchingFunctionsHandler8 = new org.apache.commons.math.ode.SwitchingFunctionsHandler();
        java.lang.Object[] objArray17 = new java.lang.Object[] { 1L, 'a', 10L, 'a', (-1) };
        org.apache.commons.math.ConvergenceException convergenceException18 = new org.apache.commons.math.ConvergenceException("", objArray17);
        org.apache.commons.math.ode.IntegratorException integratorException19 = new org.apache.commons.math.ode.IntegratorException("org.apache.commons.math.MathException: hi!", objArray17);
        java.lang.Object[] objArray20 = new java.lang.Object[] { 2, switchingFunctionsHandler8, 1, objArray17 };
        org.apache.commons.math.ConvergenceException convergenceException23 = new org.apache.commons.math.ConvergenceException("hi!");
        org.apache.commons.math.MathException mathException24 = new org.apache.commons.math.MathException("hi!", (java.lang.Throwable) convergenceException23);
        org.apache.commons.math.FunctionEvaluationException functionEvaluationException25 = new org.apache.commons.math.FunctionEvaluationException((double) (short) 0, "org.apache.commons.math.MathException: hi!", objArray17, (java.lang.Throwable) mathException24);
        org.apache.commons.math.FunctionEvaluationException functionEvaluationException27 = new org.apache.commons.math.FunctionEvaluationException((double) 100L);
        org.apache.commons.math.ConvergenceException convergenceException28 = new org.apache.commons.math.ConvergenceException("org.apache.commons.math.MathException: hi!", objArray17, (java.lang.Throwable) functionEvaluationException27);
        org.apache.commons.math.FunctionEvaluationException functionEvaluationException30 = new org.apache.commons.math.FunctionEvaluationException((double) 100L);
        org.apache.commons.math.ConvergenceException convergenceException31 = new org.apache.commons.math.ConvergenceException("org.apache.commons.math.MathException: hi!", objArray17, (java.lang.Throwable) functionEvaluationException30);
        java.lang.Object[] objArray39 = new java.lang.Object[] { 1L, 'a', 10L, 'a', (-1) };
        org.apache.commons.math.ConvergenceException convergenceException40 = new org.apache.commons.math.ConvergenceException("", objArray39);
        org.apache.commons.math.ode.IntegratorException integratorException41 = new org.apache.commons.math.ode.IntegratorException("org.apache.commons.math.MathException: hi!", objArray39);
        org.apache.commons.math.MathException mathException42 = new org.apache.commons.math.MathException((java.lang.Throwable) integratorException41);
        java.lang.Throwable[] throwableArray43 = integratorException41.getSuppressed();
        org.apache.commons.math.ode.IntegratorException integratorException44 = new org.apache.commons.math.ode.IntegratorException((java.lang.Throwable) integratorException41);
        functionEvaluationException30.addSuppressed((java.lang.Throwable) integratorException41);
        org.apache.commons.math.FunctionEvaluationException functionEvaluationException46 = new org.apache.commons.math.FunctionEvaluationException(100.0d, (java.lang.Throwable) integratorException41);
        org.apache.commons.math.ConvergenceException convergenceException53 = new org.apache.commons.math.ConvergenceException("hi!");
        org.apache.commons.math.MathException mathException54 = new org.apache.commons.math.MathException("hi!", (java.lang.Throwable) convergenceException53);
        java.lang.Object[] objArray55 = mathException54.getArguments();
        java.lang.Throwable throwable56 = null;
        org.apache.commons.math.ConvergenceException convergenceException57 = new org.apache.commons.math.ConvergenceException("hi!", objArray55, throwable56);
        org.apache.commons.math.FunctionEvaluationException functionEvaluationException58 = new org.apache.commons.math.FunctionEvaluationException((double) 1L, "", objArray55);
        org.apache.commons.math.ode.IntegratorException integratorException59 = new org.apache.commons.math.ode.IntegratorException("", objArray55);
        integratorException41.addSuppressed((java.lang.Throwable) integratorException59);
        java.lang.Object[] objArray61 = integratorException41.getArguments();
        org.apache.commons.math.ConvergenceException convergenceException62 = new org.apache.commons.math.ConvergenceException("org.apache.commons.math.ode.IntegratorException: hi!", objArray61);
        java.lang.String[] strArray72 = new java.lang.String[] { "hi!", "org.apache.commons.math.MathException: hi!", "", "hi!", "org.apache.commons.math.MathException: hi!" };
        org.apache.commons.math.ode.DerivativeException derivativeException73 = new org.apache.commons.math.ode.DerivativeException("hi!", strArray72);
        org.apache.commons.math.ConvergenceException convergenceException74 = new org.apache.commons.math.ConvergenceException("", (java.lang.Object[]) strArray72);
        org.apache.commons.math.ode.DerivativeException derivativeException75 = new org.apache.commons.math.ode.DerivativeException("org.apache.commons.math.MathException: ", strArray72);
        org.apache.commons.math.ode.DerivativeException derivativeException76 = new org.apache.commons.math.ode.DerivativeException("Evaluation failed for argument = {0}", strArray72);
        org.apache.commons.math.MathException mathException77 = new org.apache.commons.math.MathException((java.lang.Throwable) derivativeException76);
        org.apache.commons.math.ConvergenceException convergenceException78 = new org.apache.commons.math.ConvergenceException("org.apache.commons.math.FunctionEvaluationException: hi!", objArray61, (java.lang.Throwable) derivativeException76);
        java.lang.Class<?> wildcardClass79 = derivativeException76.getClass();
        org.junit.Assert.assertNotNull(objArray17);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray17), "[1, a, 10, a, -1]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray17), "[1, a, 10, a, -1]");
        org.junit.Assert.assertNotNull(objArray20);
        org.junit.Assert.assertNotNull(objArray39);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray39), "[1, a, 10, a, -1]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray39), "[1, a, 10, a, -1]");
        org.junit.Assert.assertNotNull(throwableArray43);
        org.junit.Assert.assertNotNull(objArray55);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray55), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray55), "[]");
        org.junit.Assert.assertNotNull(objArray61);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray61), "[1, a, 10, a, -1]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray61), "[1, a, 10, a, -1]");
        org.junit.Assert.assertNotNull(strArray72);
        org.junit.Assert.assertNotNull(wildcardClass79);
    }

    @Test
    public void test14635() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest29.test14635");
        org.apache.commons.math.ode.SwitchingFunctionsHandler switchingFunctionsHandler0 = new org.apache.commons.math.ode.SwitchingFunctionsHandler();
        boolean boolean1 = switchingFunctionsHandler0.isEmpty();
        double[] doubleArray4 = new double[] { 100.0d };
        boolean boolean5 = switchingFunctionsHandler0.reset((double) 0L, doubleArray4);
        org.apache.commons.math.ode.SwitchingFunctionsHandler switchingFunctionsHandler7 = new org.apache.commons.math.ode.SwitchingFunctionsHandler();
        boolean boolean8 = switchingFunctionsHandler7.isEmpty();
        org.apache.commons.math.ode.StepInterpolator stepInterpolator9 = null;
        boolean boolean10 = switchingFunctionsHandler7.evaluateStep(stepInterpolator9);
        org.apache.commons.math.ode.SwitchingFunctionsHandler switchingFunctionsHandler12 = new org.apache.commons.math.ode.SwitchingFunctionsHandler();
        boolean boolean13 = switchingFunctionsHandler12.isEmpty();
        double[] doubleArray16 = new double[] { 100.0d };
        boolean boolean17 = switchingFunctionsHandler12.reset((double) 0L, doubleArray16);
        boolean boolean18 = switchingFunctionsHandler7.reset((double) 1, doubleArray16);
        boolean boolean19 = switchingFunctionsHandler0.reset((double) 100, doubleArray16);
        double double20 = switchingFunctionsHandler0.getEventTime();
        org.apache.commons.math.ode.SwitchingFunctionsHandler switchingFunctionsHandler22 = new org.apache.commons.math.ode.SwitchingFunctionsHandler();
        boolean boolean23 = switchingFunctionsHandler22.isEmpty();
        org.apache.commons.math.ode.StepInterpolator stepInterpolator24 = null;
        boolean boolean25 = switchingFunctionsHandler22.evaluateStep(stepInterpolator24);
        org.apache.commons.math.ode.SwitchingFunctionsHandler switchingFunctionsHandler27 = new org.apache.commons.math.ode.SwitchingFunctionsHandler();
        boolean boolean28 = switchingFunctionsHandler27.isEmpty();
        double[] doubleArray31 = new double[] { 100.0d };
        boolean boolean32 = switchingFunctionsHandler27.reset((double) 0L, doubleArray31);
        switchingFunctionsHandler22.stepAccepted((double) (byte) 10, doubleArray31);
        switchingFunctionsHandler0.stepAccepted(0.0d, doubleArray31);
        double double35 = switchingFunctionsHandler0.getEventTime();
        org.apache.commons.math.ode.SwitchingFunction switchingFunction36 = null;
        switchingFunctionsHandler0.add(switchingFunction36, (double) 10L, (double) 'a', (int) (byte) 0);
        org.apache.commons.math.ode.SwitchingFunction switchingFunction41 = null;
        switchingFunctionsHandler0.add(switchingFunction41, (double) (short) -1, (double) (byte) -1, 0);
        org.apache.commons.math.ode.SwitchingFunction switchingFunction46 = null;
        switchingFunctionsHandler0.add(switchingFunction46, 2.0d, (double) 100.0f, (int) '#');
        org.apache.commons.math.ode.SwitchingFunction switchingFunction51 = null;
        switchingFunctionsHandler0.add(switchingFunction51, 97.0d, 0.0d, 100);
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertNotNull(doubleArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray4), "[100.0]");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertNotNull(doubleArray16);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray16), "[100.0]");
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertTrue(Double.isNaN(double20));
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + true + "'", boolean23 == true);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + true + "'", boolean28 == true);
        org.junit.Assert.assertNotNull(doubleArray31);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray31), "[100.0]");
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + false + "'", boolean32 == false);
        org.junit.Assert.assertTrue(Double.isNaN(double35));
    }

    @Test
    public void test14636() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest29.test14636");
        java.lang.Object[] objArray11 = new java.lang.Object[] { 1L, 'a', 10L, 'a', (-1) };
        org.apache.commons.math.ConvergenceException convergenceException12 = new org.apache.commons.math.ConvergenceException("", objArray11);
        org.apache.commons.math.ode.DerivativeException derivativeException13 = new org.apache.commons.math.ode.DerivativeException((java.lang.Throwable) convergenceException12);
        java.lang.Throwable[] throwableArray14 = derivativeException13.getSuppressed();
        java.lang.Throwable throwable15 = null;
        org.apache.commons.math.ConvergenceException convergenceException16 = new org.apache.commons.math.ConvergenceException("org.apache.commons.math.MathException", (java.lang.Object[]) throwableArray14, throwable15);
        org.apache.commons.math.MathException mathException17 = new org.apache.commons.math.MathException((java.lang.Throwable) convergenceException16);
        org.apache.commons.math.FunctionEvaluationException functionEvaluationException19 = new org.apache.commons.math.FunctionEvaluationException((double) '4');
        double double20 = functionEvaluationException19.getArgument();
        org.apache.commons.math.ode.IntegratorException integratorException21 = new org.apache.commons.math.ode.IntegratorException((java.lang.Throwable) functionEvaluationException19);
        convergenceException16.addSuppressed((java.lang.Throwable) functionEvaluationException19);
        org.apache.commons.math.FunctionEvaluationException functionEvaluationException23 = new org.apache.commons.math.FunctionEvaluationException((double) (short) 100, "org.apache.commons.math.ConvergenceException: org.apache.commons.math.ConvergenceException: Evaluation failed for argument = 52", (java.lang.Throwable) convergenceException16);
        org.apache.commons.math.FunctionEvaluationException functionEvaluationException24 = new org.apache.commons.math.FunctionEvaluationException((double) 10L, (java.lang.Throwable) convergenceException16);
        org.apache.commons.math.ConvergenceException convergenceException25 = new org.apache.commons.math.ConvergenceException("org.apache.commons.math.ode.IntegratorException: org.apache.commons.math.ConvergenceException: org.apache.commons.math.ode.DerivativeException: org.apache.commons.math.MathException: ", (java.lang.Throwable) convergenceException16);
        org.junit.Assert.assertNotNull(objArray11);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray11), "[1, a, 10, a, -1]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray11), "[1, a, 10, a, -1]");
        org.junit.Assert.assertNotNull(throwableArray14);
        org.junit.Assert.assertTrue("'" + double20 + "' != '" + 52.0d + "'", double20 == 52.0d);
    }

    @Test
    public void test14637() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest29.test14637");
        java.lang.Throwable throwable2 = null;
        org.apache.commons.math.FunctionEvaluationException functionEvaluationException3 = new org.apache.commons.math.FunctionEvaluationException((double) (-1L), "org.apache.commons.math.FunctionEvaluationException: org.apache.commons.math.FunctionEvaluationException: org.apache.commons.math.ode.IntegratorException: org.apache.commons.math.MathException: ", throwable2);
    }

    @Test
    public void test14638() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest29.test14638");
        org.apache.commons.math.FunctionEvaluationException functionEvaluationException2 = new org.apache.commons.math.FunctionEvaluationException(32.0d, "Evaluation failed for argument = 52");
        org.apache.commons.math.ConvergenceException convergenceException3 = new org.apache.commons.math.ConvergenceException((java.lang.Throwable) functionEvaluationException2);
        org.apache.commons.math.MathException mathException4 = new org.apache.commons.math.MathException((java.lang.Throwable) convergenceException3);
    }

    @Test
    public void test14639() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest29.test14639");
        org.apache.commons.math.ode.SwitchingFunctionsHandler switchingFunctionsHandler0 = new org.apache.commons.math.ode.SwitchingFunctionsHandler();
        boolean boolean1 = switchingFunctionsHandler0.isEmpty();
        org.apache.commons.math.ode.StepInterpolator stepInterpolator2 = null;
        boolean boolean3 = switchingFunctionsHandler0.evaluateStep(stepInterpolator2);
        org.apache.commons.math.ode.SwitchingFunctionsHandler switchingFunctionsHandler5 = new org.apache.commons.math.ode.SwitchingFunctionsHandler();
        boolean boolean6 = switchingFunctionsHandler5.isEmpty();
        double[] doubleArray9 = new double[] { 100.0d };
        boolean boolean10 = switchingFunctionsHandler5.reset((double) 0L, doubleArray9);
        switchingFunctionsHandler0.stepAccepted((double) (byte) 10, doubleArray9);
        org.apache.commons.math.ode.SwitchingFunctionsHandler switchingFunctionsHandler13 = new org.apache.commons.math.ode.SwitchingFunctionsHandler();
        boolean boolean14 = switchingFunctionsHandler13.isEmpty();
        double[] doubleArray17 = new double[] { 100.0d };
        boolean boolean18 = switchingFunctionsHandler13.reset((double) 0L, doubleArray17);
        switchingFunctionsHandler0.stepAccepted(100.0d, doubleArray17);
        org.apache.commons.math.ode.StepInterpolator stepInterpolator20 = null;
        boolean boolean21 = switchingFunctionsHandler0.evaluateStep(stepInterpolator20);
        double double22 = switchingFunctionsHandler0.getEventTime();
        org.apache.commons.math.ode.SwitchingFunction switchingFunction23 = null;
        switchingFunctionsHandler0.add(switchingFunction23, 52.0d, (double) ' ', 100);
        double double28 = switchingFunctionsHandler0.getEventTime();
        org.apache.commons.math.ode.SwitchingFunction switchingFunction29 = null;
        switchingFunctionsHandler0.add(switchingFunction29, 10.0d, (double) (byte) 10, (int) (byte) 0);
        boolean boolean34 = switchingFunctionsHandler0.isEmpty();
        double double35 = switchingFunctionsHandler0.getEventTime();
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertNotNull(doubleArray9);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray9), "[100.0]");
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertNotNull(doubleArray17);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray17), "[100.0]");
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertTrue(Double.isNaN(double22));
        org.junit.Assert.assertTrue(Double.isNaN(double28));
        org.junit.Assert.assertTrue("'" + boolean34 + "' != '" + false + "'", boolean34 == false);
        org.junit.Assert.assertTrue(Double.isNaN(double35));
    }

    @Test
    public void test14640() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest29.test14640");
        org.apache.commons.math.MathException mathException5 = new org.apache.commons.math.MathException();
        org.apache.commons.math.FunctionEvaluationException functionEvaluationException6 = new org.apache.commons.math.FunctionEvaluationException((double) 10, "hi!", (java.lang.Throwable) mathException5);
        org.apache.commons.math.ode.SwitchingFunctionsHandler switchingFunctionsHandler12 = new org.apache.commons.math.ode.SwitchingFunctionsHandler();
        java.lang.Object[] objArray21 = new java.lang.Object[] { 1L, 'a', 10L, 'a', (-1) };
        org.apache.commons.math.ConvergenceException convergenceException22 = new org.apache.commons.math.ConvergenceException("", objArray21);
        org.apache.commons.math.ode.IntegratorException integratorException23 = new org.apache.commons.math.ode.IntegratorException("org.apache.commons.math.MathException: hi!", objArray21);
        java.lang.Object[] objArray24 = new java.lang.Object[] { 2, switchingFunctionsHandler12, 1, objArray21 };
        org.apache.commons.math.ConvergenceException convergenceException27 = new org.apache.commons.math.ConvergenceException("hi!");
        org.apache.commons.math.MathException mathException28 = new org.apache.commons.math.MathException("hi!", (java.lang.Throwable) convergenceException27);
        org.apache.commons.math.FunctionEvaluationException functionEvaluationException29 = new org.apache.commons.math.FunctionEvaluationException((double) (short) 0, "org.apache.commons.math.MathException: hi!", objArray21, (java.lang.Throwable) mathException28);
        org.apache.commons.math.FunctionEvaluationException functionEvaluationException31 = new org.apache.commons.math.FunctionEvaluationException((double) 100L);
        org.apache.commons.math.ConvergenceException convergenceException32 = new org.apache.commons.math.ConvergenceException("org.apache.commons.math.MathException: hi!", objArray21, (java.lang.Throwable) functionEvaluationException31);
        org.apache.commons.math.FunctionEvaluationException functionEvaluationException34 = new org.apache.commons.math.FunctionEvaluationException((double) 100L);
        org.apache.commons.math.ConvergenceException convergenceException35 = new org.apache.commons.math.ConvergenceException("org.apache.commons.math.MathException: hi!", objArray21, (java.lang.Throwable) functionEvaluationException34);
        java.lang.Object[] objArray43 = new java.lang.Object[] { 1L, 'a', 10L, 'a', (-1) };
        org.apache.commons.math.ConvergenceException convergenceException44 = new org.apache.commons.math.ConvergenceException("", objArray43);
        org.apache.commons.math.ode.IntegratorException integratorException45 = new org.apache.commons.math.ode.IntegratorException("org.apache.commons.math.MathException: hi!", objArray43);
        org.apache.commons.math.MathException mathException46 = new org.apache.commons.math.MathException((java.lang.Throwable) integratorException45);
        java.lang.Throwable[] throwableArray47 = integratorException45.getSuppressed();
        org.apache.commons.math.ode.IntegratorException integratorException48 = new org.apache.commons.math.ode.IntegratorException((java.lang.Throwable) integratorException45);
        functionEvaluationException34.addSuppressed((java.lang.Throwable) integratorException45);
        functionEvaluationException6.addSuppressed((java.lang.Throwable) integratorException45);
        java.lang.Object[] objArray51 = functionEvaluationException6.getArguments();
        org.apache.commons.math.FunctionEvaluationException functionEvaluationException52 = new org.apache.commons.math.FunctionEvaluationException((double) 0.0f, "org.apache.commons.math.MathException: hi!", objArray51);
        org.apache.commons.math.FunctionEvaluationException functionEvaluationException53 = new org.apache.commons.math.FunctionEvaluationException(52.0d, (java.lang.Throwable) functionEvaluationException52);
        java.lang.String str54 = functionEvaluationException52.toString();
        org.junit.Assert.assertNotNull(objArray21);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray21), "[1, a, 10, a, -1]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray21), "[1, a, 10, a, -1]");
        org.junit.Assert.assertNotNull(objArray24);
        org.junit.Assert.assertNotNull(objArray43);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray43), "[1, a, 10, a, -1]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray43), "[1, a, 10, a, -1]");
        org.junit.Assert.assertNotNull(throwableArray47);
        org.junit.Assert.assertNotNull(objArray51);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray51), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray51), "[]");
        org.junit.Assert.assertEquals("'" + str54 + "' != '" + "org.apache.commons.math.FunctionEvaluationException: org.apache.commons.math.MathException: hi!" + "'", str54, "org.apache.commons.math.FunctionEvaluationException: org.apache.commons.math.MathException: hi!");
    }

    @Test
    public void test14641() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest29.test14641");
        org.apache.commons.math.FunctionEvaluationException functionEvaluationException4 = new org.apache.commons.math.FunctionEvaluationException((double) (short) 0, "hi!");
        java.lang.String str5 = functionEvaluationException4.getPattern();
        org.apache.commons.math.ConvergenceException convergenceException6 = new org.apache.commons.math.ConvergenceException("org.apache.commons.math.MathException: ", (java.lang.Throwable) functionEvaluationException4);
        org.apache.commons.math.ode.IntegratorException integratorException7 = new org.apache.commons.math.ode.IntegratorException((java.lang.Throwable) convergenceException6);
        java.lang.String[] strArray22 = new java.lang.String[] { "hi!", "org.apache.commons.math.MathException: hi!", "", "hi!", "org.apache.commons.math.MathException: hi!" };
        org.apache.commons.math.ode.DerivativeException derivativeException23 = new org.apache.commons.math.ode.DerivativeException("hi!", strArray22);
        org.apache.commons.math.MathException mathException24 = new org.apache.commons.math.MathException("hi!", (java.lang.Object[]) strArray22);
        org.apache.commons.math.ode.DerivativeException derivativeException25 = new org.apache.commons.math.ode.DerivativeException("", strArray22);
        org.apache.commons.math.FunctionEvaluationException functionEvaluationException26 = new org.apache.commons.math.FunctionEvaluationException((double) (byte) -1, "org.apache.commons.math.MathException: ", (java.lang.Object[]) strArray22);
        org.apache.commons.math.MathException mathException27 = new org.apache.commons.math.MathException("org.apache.commons.math.ode.IntegratorException: ", (java.lang.Object[]) strArray22);
        org.apache.commons.math.ode.IntegratorException integratorException28 = new org.apache.commons.math.ode.IntegratorException("org.apache.commons.math.ConvergenceException: Evaluation failed for argument = 52", (java.lang.Object[]) strArray22);
        org.apache.commons.math.FunctionEvaluationException functionEvaluationException29 = new org.apache.commons.math.FunctionEvaluationException((double) (-1L), "org.apache.commons.math.ode.IntegratorException: org.apache.commons.math.MathException: hi!", (java.lang.Throwable) integratorException28);
        integratorException7.addSuppressed((java.lang.Throwable) functionEvaluationException29);
        org.apache.commons.math.ConvergenceException convergenceException31 = new org.apache.commons.math.ConvergenceException("org.apache.commons.math.ConvergenceException: org.apache.commons.math.FunctionEvaluationException: org.apache.commons.math.MathException: hi!", (java.lang.Throwable) integratorException7);
        org.apache.commons.math.ode.DerivativeException derivativeException32 = new org.apache.commons.math.ode.DerivativeException((java.lang.Throwable) convergenceException31);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi!" + "'", str5, "hi!");
        org.junit.Assert.assertNotNull(strArray22);
    }

    @Test
    public void test14642() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest29.test14642");
        java.lang.String[] strArray15 = new java.lang.String[] { "hi!", "org.apache.commons.math.MathException: hi!", "", "hi!", "org.apache.commons.math.MathException: hi!" };
        org.apache.commons.math.ode.DerivativeException derivativeException16 = new org.apache.commons.math.ode.DerivativeException("hi!", strArray15);
        org.apache.commons.math.ode.IntegratorException integratorException17 = new org.apache.commons.math.ode.IntegratorException("", (java.lang.Object[]) strArray15);
        org.apache.commons.math.ode.DerivativeException derivativeException18 = new org.apache.commons.math.ode.DerivativeException("hi!", strArray15);
        org.apache.commons.math.ode.IntegratorException integratorException19 = new org.apache.commons.math.ode.IntegratorException("org.apache.commons.math.FunctionEvaluationException: hi!", (java.lang.Object[]) strArray15);
        java.lang.String[] strArray31 = new java.lang.String[] { "hi!", "org.apache.commons.math.MathException: hi!", "", "hi!", "org.apache.commons.math.MathException: hi!" };
        org.apache.commons.math.ode.DerivativeException derivativeException32 = new org.apache.commons.math.ode.DerivativeException("hi!", strArray31);
        org.apache.commons.math.MathException mathException33 = new org.apache.commons.math.MathException("hi!", (java.lang.Object[]) strArray31);
        org.apache.commons.math.ode.DerivativeException derivativeException34 = new org.apache.commons.math.ode.DerivativeException("", strArray31);
        org.apache.commons.math.FunctionEvaluationException functionEvaluationException35 = new org.apache.commons.math.FunctionEvaluationException((double) (byte) -1, "org.apache.commons.math.MathException: ", (java.lang.Object[]) strArray31);
        org.apache.commons.math.ode.DerivativeException derivativeException36 = new org.apache.commons.math.ode.DerivativeException("", strArray31);
        org.apache.commons.math.FunctionEvaluationException functionEvaluationException37 = new org.apache.commons.math.FunctionEvaluationException((double) 10.0f, "org.apache.commons.math.FunctionEvaluationException: org.apache.commons.math.MathException: hi!", (java.lang.Object[]) strArray15, (java.lang.Throwable) derivativeException36);
        org.apache.commons.math.FunctionEvaluationException functionEvaluationException38 = new org.apache.commons.math.FunctionEvaluationException((double) 10, "org.apache.commons.math.FunctionEvaluationException: org.apache.commons.math.FunctionEvaluationException: Evaluation failed for argument = 35", (java.lang.Object[]) strArray15);
        java.lang.String[] strArray48 = new java.lang.String[] { "hi!", "org.apache.commons.math.MathException: hi!", "", "hi!", "org.apache.commons.math.MathException: hi!" };
        org.apache.commons.math.ode.DerivativeException derivativeException49 = new org.apache.commons.math.ode.DerivativeException("hi!", strArray48);
        org.apache.commons.math.ConvergenceException convergenceException50 = new org.apache.commons.math.ConvergenceException("", (java.lang.Object[]) strArray48);
        org.apache.commons.math.ConvergenceException convergenceException51 = new org.apache.commons.math.ConvergenceException("", (java.lang.Object[]) strArray48);
        org.apache.commons.math.ode.IntegratorException integratorException52 = new org.apache.commons.math.ode.IntegratorException((java.lang.Throwable) convergenceException51);
        org.apache.commons.math.FunctionEvaluationException functionEvaluationException53 = new org.apache.commons.math.FunctionEvaluationException((double) (short) 10, (java.lang.Throwable) integratorException52);
        org.apache.commons.math.MathException mathException54 = new org.apache.commons.math.MathException((java.lang.Throwable) integratorException52);
        org.apache.commons.math.MathException mathException55 = new org.apache.commons.math.MathException("org.apache.commons.math.FunctionEvaluationException: org.apache.commons.math.FunctionEvaluationException: org.apache.commons.math.FunctionEvaluationException: hi!", (java.lang.Object[]) strArray15, (java.lang.Throwable) mathException54);
        org.apache.commons.math.ode.IntegratorException integratorException56 = new org.apache.commons.math.ode.IntegratorException("org.apache.commons.math.ConvergenceException: org.apache.commons.math.MathException: org.apache.commons.math.ode.DerivativeException: hi!", (java.lang.Object[]) strArray15);
        org.junit.Assert.assertNotNull(strArray15);
        org.junit.Assert.assertNotNull(strArray31);
        org.junit.Assert.assertNotNull(strArray48);
    }

    @Test
    public void test14643() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest29.test14643");
        org.apache.commons.math.MathException mathException1 = new org.apache.commons.math.MathException("org.apache.commons.math.ode.IntegratorException: org.apache.commons.math.FunctionEvaluationException: org.apache.commons.math.ode.IntegratorException: hi!");
    }

    @Test
    public void test14644() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest29.test14644");
        java.lang.String[] strArray12 = new java.lang.String[] { "hi!", "org.apache.commons.math.MathException: hi!", "", "hi!", "org.apache.commons.math.MathException: hi!" };
        org.apache.commons.math.ode.DerivativeException derivativeException13 = new org.apache.commons.math.ode.DerivativeException("hi!", strArray12);
        org.apache.commons.math.ConvergenceException convergenceException14 = new org.apache.commons.math.ConvergenceException("org.apache.commons.math.FunctionEvaluationException: hi!", (java.lang.Object[]) strArray12);
        org.apache.commons.math.ode.DerivativeException derivativeException15 = new org.apache.commons.math.ode.DerivativeException("", strArray12);
        org.apache.commons.math.ode.IntegratorException integratorException16 = new org.apache.commons.math.ode.IntegratorException("org.apache.commons.math.ode.IntegratorException: ", (java.lang.Object[]) strArray12);
        org.apache.commons.math.FunctionEvaluationException functionEvaluationException17 = new org.apache.commons.math.FunctionEvaluationException((double) 1.0f, "org.apache.commons.math.ode.DerivativeException: ", (java.lang.Object[]) strArray12);
        org.apache.commons.math.ode.IntegratorException integratorException18 = new org.apache.commons.math.ode.IntegratorException("org.apache.commons.math.ConvergenceException: org.apache.commons.math.ode.IntegratorException: Evaluation failed for argument = -1", (java.lang.Object[]) strArray12);
        org.junit.Assert.assertNotNull(strArray12);
    }

    @Test
    public void test14645() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest29.test14645");
        org.apache.commons.math.FunctionEvaluationException functionEvaluationException3 = new org.apache.commons.math.FunctionEvaluationException(97.0d, "org.apache.commons.math.ConvergenceException: Evaluation failed for argument = 52");
        java.lang.Throwable[] throwableArray4 = functionEvaluationException3.getSuppressed();
        org.apache.commons.math.FunctionEvaluationException functionEvaluationException5 = new org.apache.commons.math.FunctionEvaluationException((double) ' ', (java.lang.Throwable) functionEvaluationException3);
        org.junit.Assert.assertNotNull(throwableArray4);
    }

    @Test
    public void test14646() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest29.test14646");
        org.apache.commons.math.ConvergenceException convergenceException9 = new org.apache.commons.math.ConvergenceException("org.apache.commons.math.MathException: ");
        java.lang.Object[] objArray10 = convergenceException9.getArguments();
        org.apache.commons.math.MathException mathException11 = new org.apache.commons.math.MathException("org.apache.commons.math.MathException: ", objArray10);
        org.apache.commons.math.FunctionEvaluationException functionEvaluationException14 = new org.apache.commons.math.FunctionEvaluationException(Double.NaN, "org.apache.commons.math.FunctionEvaluationException: Evaluation failed for argument = 35");
        org.apache.commons.math.ConvergenceException convergenceException15 = new org.apache.commons.math.ConvergenceException("", objArray10, (java.lang.Throwable) functionEvaluationException14);
        org.apache.commons.math.ode.SwitchingFunctionsHandler switchingFunctionsHandler27 = new org.apache.commons.math.ode.SwitchingFunctionsHandler();
        java.lang.Object[] objArray36 = new java.lang.Object[] { 1L, 'a', 10L, 'a', (-1) };
        org.apache.commons.math.ConvergenceException convergenceException37 = new org.apache.commons.math.ConvergenceException("", objArray36);
        org.apache.commons.math.ode.IntegratorException integratorException38 = new org.apache.commons.math.ode.IntegratorException("org.apache.commons.math.MathException: hi!", objArray36);
        java.lang.Object[] objArray39 = new java.lang.Object[] { 2, switchingFunctionsHandler27, 1, objArray36 };
        org.apache.commons.math.ConvergenceException convergenceException42 = new org.apache.commons.math.ConvergenceException("hi!");
        org.apache.commons.math.MathException mathException43 = new org.apache.commons.math.MathException("hi!", (java.lang.Throwable) convergenceException42);
        org.apache.commons.math.FunctionEvaluationException functionEvaluationException44 = new org.apache.commons.math.FunctionEvaluationException((double) (short) 0, "org.apache.commons.math.MathException: hi!", objArray36, (java.lang.Throwable) mathException43);
        org.apache.commons.math.FunctionEvaluationException functionEvaluationException46 = new org.apache.commons.math.FunctionEvaluationException((double) 100L);
        org.apache.commons.math.ConvergenceException convergenceException47 = new org.apache.commons.math.ConvergenceException("org.apache.commons.math.MathException: hi!", objArray36, (java.lang.Throwable) functionEvaluationException46);
        org.apache.commons.math.FunctionEvaluationException functionEvaluationException49 = new org.apache.commons.math.FunctionEvaluationException((double) 100L);
        org.apache.commons.math.ConvergenceException convergenceException50 = new org.apache.commons.math.ConvergenceException("org.apache.commons.math.MathException: hi!", objArray36, (java.lang.Throwable) functionEvaluationException49);
        org.apache.commons.math.FunctionEvaluationException functionEvaluationException51 = new org.apache.commons.math.FunctionEvaluationException((double) 0.0f, "hi!", objArray36);
        java.lang.String str52 = functionEvaluationException51.getPattern();
        java.lang.Object[] objArray53 = functionEvaluationException51.getArguments();
        org.apache.commons.math.FunctionEvaluationException functionEvaluationException55 = new org.apache.commons.math.FunctionEvaluationException((double) (short) -1);
        double double56 = functionEvaluationException55.getArgument();
        org.apache.commons.math.FunctionEvaluationException functionEvaluationException57 = new org.apache.commons.math.FunctionEvaluationException((double) '#', "hi!", objArray53, (java.lang.Throwable) functionEvaluationException55);
        org.apache.commons.math.ode.IntegratorException integratorException58 = new org.apache.commons.math.ode.IntegratorException("org.apache.commons.math.MathException: ", objArray53);
        org.apache.commons.math.MathException mathException59 = new org.apache.commons.math.MathException("", objArray53);
        org.apache.commons.math.ode.DerivativeException derivativeException60 = new org.apache.commons.math.ode.DerivativeException((java.lang.Throwable) mathException59);
        org.apache.commons.math.MathException mathException61 = new org.apache.commons.math.MathException("org.apache.commons.math.MathException: org.apache.commons.math.ode.IntegratorException: org.apache.commons.math.MathException: ", objArray10, (java.lang.Throwable) mathException59);
        org.apache.commons.math.FunctionEvaluationException functionEvaluationException64 = new org.apache.commons.math.FunctionEvaluationException(0.0d, "org.apache.commons.math.ode.IntegratorException: org.apache.commons.math.MathException: ");
        org.apache.commons.math.FunctionEvaluationException functionEvaluationException65 = new org.apache.commons.math.FunctionEvaluationException((double) (short) 0, "org.apache.commons.math.ConvergenceException: org.apache.commons.math.FunctionEvaluationException: ", objArray10, (java.lang.Throwable) functionEvaluationException64);
        org.apache.commons.math.MathException mathException66 = new org.apache.commons.math.MathException("org.apache.commons.math.ode.IntegratorException: org.apache.commons.math.MathException: hi!", (java.lang.Throwable) functionEvaluationException65);
        org.apache.commons.math.ConvergenceException convergenceException67 = new org.apache.commons.math.ConvergenceException("org.apache.commons.math.ode.DerivativeException: org.apache.commons.math.FunctionEvaluationException: Evaluation failed for argument = 100", (java.lang.Throwable) mathException66);
        org.apache.commons.math.MathException mathException68 = new org.apache.commons.math.MathException("org.apache.commons.math.MathException: org.apache.commons.math.ode.DerivativeException: hi!", (java.lang.Throwable) mathException66);
        java.lang.Throwable[] throwableArray69 = mathException68.getSuppressed();
        org.junit.Assert.assertNotNull(objArray10);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray10), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray10), "[]");
        org.junit.Assert.assertNotNull(objArray36);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray36), "[1, a, 10, a, -1]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray36), "[1, a, 10, a, -1]");
        org.junit.Assert.assertNotNull(objArray39);
        org.junit.Assert.assertEquals("'" + str52 + "' != '" + "hi!" + "'", str52, "hi!");
        org.junit.Assert.assertNotNull(objArray53);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray53), "[1, a, 10, a, -1]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray53), "[1, a, 10, a, -1]");
        org.junit.Assert.assertTrue("'" + double56 + "' != '" + (-1.0d) + "'", double56 == (-1.0d));
        org.junit.Assert.assertNotNull(throwableArray69);
    }

    @Test
    public void test14647() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest29.test14647");
        org.apache.commons.math.MathException mathException1 = new org.apache.commons.math.MathException("org.apache.commons.math.FunctionEvaluationException: org.apache.commons.math.FunctionEvaluationException: org.apache.commons.math.MathException: org.apache.commons.math.FunctionEvaluationException: Evaluation failed for argument = 10");
    }

    @Test
    public void test14648() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest29.test14648");
        org.apache.commons.math.ConvergenceException convergenceException9 = new org.apache.commons.math.ConvergenceException("hi!");
        org.apache.commons.math.MathException mathException10 = new org.apache.commons.math.MathException("hi!", (java.lang.Throwable) convergenceException9);
        java.lang.Object[] objArray11 = mathException10.getArguments();
        java.lang.Throwable throwable14 = null;
        org.apache.commons.math.MathException mathException15 = new org.apache.commons.math.MathException("hi!", throwable14);
        org.apache.commons.math.MathException mathException16 = new org.apache.commons.math.MathException("org.apache.commons.math.MathException: hi!", throwable14);
        org.apache.commons.math.ConvergenceException convergenceException17 = new org.apache.commons.math.ConvergenceException("org.apache.commons.math.MathException: hi!", objArray11, throwable14);
        java.lang.Object[] objArray29 = new java.lang.Object[] { 1L, 'a', 10L, 'a', (-1) };
        org.apache.commons.math.ConvergenceException convergenceException30 = new org.apache.commons.math.ConvergenceException("", objArray29);
        org.apache.commons.math.FunctionEvaluationException functionEvaluationException31 = new org.apache.commons.math.FunctionEvaluationException((-1.0d), "", objArray29);
        org.apache.commons.math.ode.IntegratorException integratorException32 = new org.apache.commons.math.ode.IntegratorException("hi!", objArray29);
        org.apache.commons.math.MathException mathException33 = new org.apache.commons.math.MathException("org.apache.commons.math.MathException: hi!", objArray29);
        org.apache.commons.math.ConvergenceException convergenceException34 = new org.apache.commons.math.ConvergenceException("org.apache.commons.math.MathException: ", objArray29);
        org.apache.commons.math.ConvergenceException convergenceException35 = new org.apache.commons.math.ConvergenceException("org.apache.commons.math.MathException: hi!", objArray11, (java.lang.Throwable) convergenceException34);
        org.apache.commons.math.ConvergenceException convergenceException41 = new org.apache.commons.math.ConvergenceException("hi!");
        org.apache.commons.math.MathException mathException42 = new org.apache.commons.math.MathException("hi!", (java.lang.Throwable) convergenceException41);
        java.lang.Object[] objArray43 = mathException42.getArguments();
        java.lang.Throwable throwable44 = null;
        org.apache.commons.math.ConvergenceException convergenceException45 = new org.apache.commons.math.ConvergenceException("hi!", objArray43, throwable44);
        org.apache.commons.math.FunctionEvaluationException functionEvaluationException46 = new org.apache.commons.math.FunctionEvaluationException((double) 1L, "", objArray43);
        org.apache.commons.math.ConvergenceException convergenceException47 = new org.apache.commons.math.ConvergenceException("org.apache.commons.math.FunctionEvaluationException: hi!", objArray11, (java.lang.Throwable) functionEvaluationException46);
        java.lang.Object[] objArray48 = convergenceException47.getArguments();
        org.apache.commons.math.FunctionEvaluationException functionEvaluationException52 = new org.apache.commons.math.FunctionEvaluationException((double) (byte) 100);
        org.apache.commons.math.ConvergenceException convergenceException53 = new org.apache.commons.math.ConvergenceException((java.lang.Throwable) functionEvaluationException52);
        java.lang.Object[] objArray54 = functionEvaluationException52.getArguments();
        java.lang.Throwable throwable55 = null;
        org.apache.commons.math.MathException mathException56 = new org.apache.commons.math.MathException("hi!", objArray54, throwable55);
        org.apache.commons.math.FunctionEvaluationException functionEvaluationException59 = new org.apache.commons.math.FunctionEvaluationException((double) '4');
        org.apache.commons.math.MathException mathException60 = new org.apache.commons.math.MathException((java.lang.Throwable) functionEvaluationException59);
        double double61 = functionEvaluationException59.getArgument();
        org.apache.commons.math.MathException mathException62 = new org.apache.commons.math.MathException("org.apache.commons.math.ode.DerivativeException: ", (java.lang.Throwable) functionEvaluationException59);
        org.apache.commons.math.ConvergenceException convergenceException63 = new org.apache.commons.math.ConvergenceException("org.apache.commons.math.MathException: ", objArray54, (java.lang.Throwable) functionEvaluationException59);
        org.apache.commons.math.MathException mathException64 = new org.apache.commons.math.MathException((java.lang.Throwable) functionEvaluationException59);
        org.apache.commons.math.ConvergenceException convergenceException65 = new org.apache.commons.math.ConvergenceException("org.apache.commons.math.FunctionEvaluationException: hi!", objArray48, (java.lang.Throwable) mathException64);
        org.apache.commons.math.FunctionEvaluationException functionEvaluationException66 = new org.apache.commons.math.FunctionEvaluationException((double) (short) 100, "org.apache.commons.math.FunctionEvaluationException: org.apache.commons.math.ode.IntegratorException: org.apache.commons.math.MathException: ", objArray48);
        org.apache.commons.math.ode.IntegratorException integratorException67 = new org.apache.commons.math.ode.IntegratorException("org.apache.commons.math.ConvergenceException: org.apache.commons.math.FunctionEvaluationException: org.apache.commons.math.ode.DerivativeException: ", objArray48);
        org.junit.Assert.assertNotNull(objArray11);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray11), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray11), "[]");
        org.junit.Assert.assertNotNull(objArray29);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray29), "[1, a, 10, a, -1]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray29), "[1, a, 10, a, -1]");
        org.junit.Assert.assertNotNull(objArray43);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray43), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray43), "[]");
        org.junit.Assert.assertNotNull(objArray48);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray48), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray48), "[]");
        org.junit.Assert.assertNotNull(objArray54);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray54), "[100.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray54), "[100.0]");
        org.junit.Assert.assertTrue("'" + double61 + "' != '" + 52.0d + "'", double61 == 52.0d);
    }

    @Test
    public void test14649() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest29.test14649");
        org.apache.commons.math.ode.SwitchingFunctionsHandler switchingFunctionsHandler0 = new org.apache.commons.math.ode.SwitchingFunctionsHandler();
        boolean boolean1 = switchingFunctionsHandler0.isEmpty();
        boolean boolean2 = switchingFunctionsHandler0.stop();
        double double3 = switchingFunctionsHandler0.getEventTime();
        org.apache.commons.math.ode.SwitchingFunction switchingFunction4 = null;
        switchingFunctionsHandler0.add(switchingFunction4, (double) (-1.0f), (double) (short) 10, (int) (byte) 100);
        boolean boolean9 = switchingFunctionsHandler0.isEmpty();
        org.apache.commons.math.ode.SwitchingFunctionsHandler switchingFunctionsHandler11 = new org.apache.commons.math.ode.SwitchingFunctionsHandler();
        boolean boolean12 = switchingFunctionsHandler11.isEmpty();
        org.apache.commons.math.ode.StepInterpolator stepInterpolator13 = null;
        boolean boolean14 = switchingFunctionsHandler11.evaluateStep(stepInterpolator13);
        boolean boolean15 = switchingFunctionsHandler11.stop();
        double double16 = switchingFunctionsHandler11.getEventTime();
        org.apache.commons.math.ode.SwitchingFunction switchingFunction17 = null;
        switchingFunctionsHandler11.add(switchingFunction17, (double) 1L, (double) (short) 10, (int) (byte) 0);
        boolean boolean22 = switchingFunctionsHandler11.stop();
        org.apache.commons.math.ode.SwitchingFunctionsHandler switchingFunctionsHandler24 = new org.apache.commons.math.ode.SwitchingFunctionsHandler();
        boolean boolean25 = switchingFunctionsHandler24.isEmpty();
        org.apache.commons.math.ode.StepInterpolator stepInterpolator26 = null;
        boolean boolean27 = switchingFunctionsHandler24.evaluateStep(stepInterpolator26);
        org.apache.commons.math.ode.SwitchingFunctionsHandler switchingFunctionsHandler29 = new org.apache.commons.math.ode.SwitchingFunctionsHandler();
        boolean boolean30 = switchingFunctionsHandler29.isEmpty();
        double[] doubleArray33 = new double[] { 100.0d };
        boolean boolean34 = switchingFunctionsHandler29.reset((double) 0L, doubleArray33);
        switchingFunctionsHandler24.stepAccepted((double) (byte) 10, doubleArray33);
        org.apache.commons.math.ode.SwitchingFunctionsHandler switchingFunctionsHandler37 = new org.apache.commons.math.ode.SwitchingFunctionsHandler();
        boolean boolean38 = switchingFunctionsHandler37.isEmpty();
        double[] doubleArray41 = new double[] { 100.0d };
        boolean boolean42 = switchingFunctionsHandler37.reset((double) 0L, doubleArray41);
        switchingFunctionsHandler24.stepAccepted(100.0d, doubleArray41);
        boolean boolean44 = switchingFunctionsHandler24.isEmpty();
        org.apache.commons.math.ode.SwitchingFunctionsHandler switchingFunctionsHandler46 = new org.apache.commons.math.ode.SwitchingFunctionsHandler();
        org.apache.commons.math.ode.SwitchingFunction switchingFunction47 = null;
        switchingFunctionsHandler46.add(switchingFunction47, (double) (-1), (double) 3, 0);
        double[] doubleArray59 = new double[] { 0L, 10.0d, 'a', 0.0d, (-1.0d), 0 };
        boolean boolean60 = switchingFunctionsHandler46.reset((double) (-1), doubleArray59);
        boolean boolean61 = switchingFunctionsHandler46.isEmpty();
        double double62 = switchingFunctionsHandler46.getEventTime();
        org.apache.commons.math.ode.SwitchingFunction switchingFunction63 = null;
        switchingFunctionsHandler46.add(switchingFunction63, (double) (-1.0f), 0.0d, (int) (short) -1);
        boolean boolean68 = switchingFunctionsHandler46.isEmpty();
        org.apache.commons.math.ode.SwitchingFunctionsHandler switchingFunctionsHandler70 = new org.apache.commons.math.ode.SwitchingFunctionsHandler();
        boolean boolean71 = switchingFunctionsHandler70.isEmpty();
        double[] doubleArray74 = new double[] { 100.0d };
        boolean boolean75 = switchingFunctionsHandler70.reset((double) 0L, doubleArray74);
        boolean boolean76 = switchingFunctionsHandler46.reset((double) 100L, doubleArray74);
        switchingFunctionsHandler24.stepAccepted((double) (short) -1, doubleArray74);
        boolean boolean78 = switchingFunctionsHandler11.reset(3.0d, doubleArray74);
        boolean boolean79 = switchingFunctionsHandler0.reset(32.0d, doubleArray74);
        boolean boolean80 = switchingFunctionsHandler0.isEmpty();
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue(Double.isNaN(double3));
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue(Double.isNaN(double16));
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + true + "'", boolean25 == true);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + false + "'", boolean27 == false);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + true + "'", boolean30 == true);
        org.junit.Assert.assertNotNull(doubleArray33);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray33), "[100.0]");
        org.junit.Assert.assertTrue("'" + boolean34 + "' != '" + false + "'", boolean34 == false);
        org.junit.Assert.assertTrue("'" + boolean38 + "' != '" + true + "'", boolean38 == true);
        org.junit.Assert.assertNotNull(doubleArray41);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray41), "[100.0]");
        org.junit.Assert.assertTrue("'" + boolean42 + "' != '" + false + "'", boolean42 == false);
        org.junit.Assert.assertTrue("'" + boolean44 + "' != '" + true + "'", boolean44 == true);
        org.junit.Assert.assertNotNull(doubleArray59);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray59), "[0.0, 10.0, 97.0, 0.0, -1.0, 0.0]");
        org.junit.Assert.assertTrue("'" + boolean60 + "' != '" + false + "'", boolean60 == false);
        org.junit.Assert.assertTrue("'" + boolean61 + "' != '" + false + "'", boolean61 == false);
        org.junit.Assert.assertTrue(Double.isNaN(double62));
        org.junit.Assert.assertTrue("'" + boolean68 + "' != '" + false + "'", boolean68 == false);
        org.junit.Assert.assertTrue("'" + boolean71 + "' != '" + true + "'", boolean71 == true);
        org.junit.Assert.assertNotNull(doubleArray74);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray74), "[100.0]");
        org.junit.Assert.assertTrue("'" + boolean75 + "' != '" + false + "'", boolean75 == false);
        org.junit.Assert.assertTrue("'" + boolean76 + "' != '" + false + "'", boolean76 == false);
        org.junit.Assert.assertTrue("'" + boolean78 + "' != '" + false + "'", boolean78 == false);
        org.junit.Assert.assertTrue("'" + boolean79 + "' != '" + false + "'", boolean79 == false);
        org.junit.Assert.assertTrue("'" + boolean80 + "' != '" + false + "'", boolean80 == false);
    }

    @Test
    public void test14650() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest29.test14650");
        org.apache.commons.math.ode.SwitchingFunctionsHandler switchingFunctionsHandler0 = new org.apache.commons.math.ode.SwitchingFunctionsHandler();
        org.apache.commons.math.ode.SwitchingFunction switchingFunction1 = null;
        switchingFunctionsHandler0.add(switchingFunction1, (double) (-1), (double) 3, 0);
        double[] doubleArray13 = new double[] { 0L, 10.0d, 'a', 0.0d, (-1.0d), 0 };
        boolean boolean14 = switchingFunctionsHandler0.reset((double) (-1), doubleArray13);
        boolean boolean15 = switchingFunctionsHandler0.isEmpty();
        boolean boolean16 = switchingFunctionsHandler0.isEmpty();
        org.apache.commons.math.ode.SwitchingFunction switchingFunction17 = null;
        switchingFunctionsHandler0.add(switchingFunction17, (double) (byte) 0, 0.0d, (int) ' ');
        boolean boolean22 = switchingFunctionsHandler0.stop();
        boolean boolean23 = switchingFunctionsHandler0.isEmpty();
        boolean boolean24 = switchingFunctionsHandler0.stop();
        boolean boolean25 = switchingFunctionsHandler0.isEmpty();
        org.apache.commons.math.ode.StepInterpolator stepInterpolator26 = null;
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean27 = switchingFunctionsHandler0.evaluateStep(stepInterpolator26);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(doubleArray13);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray13), "[0.0, 10.0, 97.0, 0.0, -1.0, 0.0]");
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
    }

    @Test
    public void test14651() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest29.test14651");
        org.apache.commons.math.ode.SwitchingFunctionsHandler switchingFunctionsHandler10 = new org.apache.commons.math.ode.SwitchingFunctionsHandler();
        java.lang.Object[] objArray19 = new java.lang.Object[] { 1L, 'a', 10L, 'a', (-1) };
        org.apache.commons.math.ConvergenceException convergenceException20 = new org.apache.commons.math.ConvergenceException("", objArray19);
        org.apache.commons.math.ode.IntegratorException integratorException21 = new org.apache.commons.math.ode.IntegratorException("org.apache.commons.math.MathException: hi!", objArray19);
        java.lang.Object[] objArray22 = new java.lang.Object[] { 2, switchingFunctionsHandler10, 1, objArray19 };
        org.apache.commons.math.ConvergenceException convergenceException25 = new org.apache.commons.math.ConvergenceException("hi!");
        org.apache.commons.math.MathException mathException26 = new org.apache.commons.math.MathException("hi!", (java.lang.Throwable) convergenceException25);
        org.apache.commons.math.FunctionEvaluationException functionEvaluationException27 = new org.apache.commons.math.FunctionEvaluationException((double) (short) 0, "org.apache.commons.math.MathException: hi!", objArray19, (java.lang.Throwable) mathException26);
        org.apache.commons.math.FunctionEvaluationException functionEvaluationException29 = new org.apache.commons.math.FunctionEvaluationException((double) 100L);
        org.apache.commons.math.ConvergenceException convergenceException30 = new org.apache.commons.math.ConvergenceException("org.apache.commons.math.MathException: hi!", objArray19, (java.lang.Throwable) functionEvaluationException29);
        org.apache.commons.math.FunctionEvaluationException functionEvaluationException32 = new org.apache.commons.math.FunctionEvaluationException((double) 100L);
        org.apache.commons.math.ConvergenceException convergenceException33 = new org.apache.commons.math.ConvergenceException("org.apache.commons.math.MathException: hi!", objArray19, (java.lang.Throwable) functionEvaluationException32);
        java.lang.Object[] objArray41 = new java.lang.Object[] { 1L, 'a', 10L, 'a', (-1) };
        org.apache.commons.math.ConvergenceException convergenceException42 = new org.apache.commons.math.ConvergenceException("", objArray41);
        org.apache.commons.math.ode.IntegratorException integratorException43 = new org.apache.commons.math.ode.IntegratorException("org.apache.commons.math.MathException: hi!", objArray41);
        org.apache.commons.math.MathException mathException44 = new org.apache.commons.math.MathException((java.lang.Throwable) integratorException43);
        java.lang.Throwable[] throwableArray45 = integratorException43.getSuppressed();
        org.apache.commons.math.ode.IntegratorException integratorException46 = new org.apache.commons.math.ode.IntegratorException((java.lang.Throwable) integratorException43);
        functionEvaluationException32.addSuppressed((java.lang.Throwable) integratorException43);
        org.apache.commons.math.FunctionEvaluationException functionEvaluationException48 = new org.apache.commons.math.FunctionEvaluationException(100.0d, (java.lang.Throwable) integratorException43);
        org.apache.commons.math.ConvergenceException convergenceException55 = new org.apache.commons.math.ConvergenceException("hi!");
        org.apache.commons.math.MathException mathException56 = new org.apache.commons.math.MathException("hi!", (java.lang.Throwable) convergenceException55);
        java.lang.Object[] objArray57 = mathException56.getArguments();
        java.lang.Throwable throwable58 = null;
        org.apache.commons.math.ConvergenceException convergenceException59 = new org.apache.commons.math.ConvergenceException("hi!", objArray57, throwable58);
        org.apache.commons.math.FunctionEvaluationException functionEvaluationException60 = new org.apache.commons.math.FunctionEvaluationException((double) 1L, "", objArray57);
        org.apache.commons.math.ode.IntegratorException integratorException61 = new org.apache.commons.math.ode.IntegratorException("", objArray57);
        integratorException43.addSuppressed((java.lang.Throwable) integratorException61);
        org.apache.commons.math.ode.DerivativeException derivativeException63 = new org.apache.commons.math.ode.DerivativeException((java.lang.Throwable) integratorException43);
        org.apache.commons.math.ConvergenceException convergenceException64 = new org.apache.commons.math.ConvergenceException("org.apache.commons.math.MathException: hi!", (java.lang.Throwable) integratorException43);
        org.apache.commons.math.MathException mathException65 = new org.apache.commons.math.MathException((java.lang.Throwable) convergenceException64);
        java.lang.Object[] objArray66 = convergenceException64.getArguments();
        org.apache.commons.math.FunctionEvaluationException functionEvaluationException69 = new org.apache.commons.math.FunctionEvaluationException((double) (-1.0f), "org.apache.commons.math.MathException: hi!");
        org.apache.commons.math.ConvergenceException convergenceException70 = new org.apache.commons.math.ConvergenceException("org.apache.commons.math.ode.IntegratorException: org.apache.commons.math.MathException: ", objArray66, (java.lang.Throwable) functionEvaluationException69);
        org.apache.commons.math.FunctionEvaluationException functionEvaluationException71 = new org.apache.commons.math.FunctionEvaluationException(Double.NaN, "org.apache.commons.math.MathException: org.apache.commons.math.FunctionEvaluationException: Evaluation failed for argument = 100", (java.lang.Throwable) convergenceException70);
        org.junit.Assert.assertNotNull(objArray19);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray19), "[1, a, 10, a, -1]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray19), "[1, a, 10, a, -1]");
        org.junit.Assert.assertNotNull(objArray22);
        org.junit.Assert.assertNotNull(objArray41);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray41), "[1, a, 10, a, -1]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray41), "[1, a, 10, a, -1]");
        org.junit.Assert.assertNotNull(throwableArray45);
        org.junit.Assert.assertNotNull(objArray57);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray57), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray57), "[]");
        org.junit.Assert.assertNotNull(objArray66);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray66), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray66), "[]");
    }

    @Test
    public void test14652() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest29.test14652");
        java.lang.Object[] objArray7 = new java.lang.Object[] { (-1L) };
        java.lang.Object[] objArray15 = new java.lang.Object[] { 1L, 'a', 10L, 'a', (-1) };
        org.apache.commons.math.ConvergenceException convergenceException16 = new org.apache.commons.math.ConvergenceException("", objArray15);
        org.apache.commons.math.ode.IntegratorException integratorException17 = new org.apache.commons.math.ode.IntegratorException("org.apache.commons.math.MathException: hi!", objArray15);
        org.apache.commons.math.MathException mathException18 = new org.apache.commons.math.MathException((java.lang.Throwable) integratorException17);
        org.apache.commons.math.ConvergenceException convergenceException19 = new org.apache.commons.math.ConvergenceException("hi!", objArray7, (java.lang.Throwable) mathException18);
        org.apache.commons.math.ConvergenceException convergenceException20 = new org.apache.commons.math.ConvergenceException("org.apache.commons.math.MathException: ", (java.lang.Throwable) mathException18);
        org.apache.commons.math.ode.IntegratorException integratorException21 = new org.apache.commons.math.ode.IntegratorException((java.lang.Throwable) mathException18);
        org.apache.commons.math.ConvergenceException convergenceException22 = new org.apache.commons.math.ConvergenceException("org.apache.commons.math.ode.IntegratorException: ", (java.lang.Throwable) integratorException21);
        org.apache.commons.math.ode.IntegratorException integratorException23 = new org.apache.commons.math.ode.IntegratorException((java.lang.Throwable) integratorException21);
        org.apache.commons.math.FunctionEvaluationException functionEvaluationException24 = new org.apache.commons.math.FunctionEvaluationException((double) (-1L), "org.apache.commons.math.ode.IntegratorException: org.apache.commons.math.ConvergenceException: org.apache.commons.math.MathException: org.apache.commons.math.FunctionEvaluationException: hi!", (java.lang.Throwable) integratorException21);
        org.apache.commons.math.FunctionEvaluationException functionEvaluationException25 = new org.apache.commons.math.FunctionEvaluationException((double) (byte) 0, (java.lang.Throwable) functionEvaluationException24);
        org.junit.Assert.assertNotNull(objArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray7), "[-1]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray7), "[-1]");
        org.junit.Assert.assertNotNull(objArray15);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray15), "[1, a, 10, a, -1]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray15), "[1, a, 10, a, -1]");
    }

    @Test
    public void test14653() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest29.test14653");
        org.apache.commons.math.ode.SwitchingFunctionsHandler switchingFunctionsHandler8 = new org.apache.commons.math.ode.SwitchingFunctionsHandler();
        java.lang.Object[] objArray17 = new java.lang.Object[] { 1L, 'a', 10L, 'a', (-1) };
        org.apache.commons.math.ConvergenceException convergenceException18 = new org.apache.commons.math.ConvergenceException("", objArray17);
        org.apache.commons.math.ode.IntegratorException integratorException19 = new org.apache.commons.math.ode.IntegratorException("org.apache.commons.math.MathException: hi!", objArray17);
        java.lang.Object[] objArray20 = new java.lang.Object[] { 2, switchingFunctionsHandler8, 1, objArray17 };
        org.apache.commons.math.ConvergenceException convergenceException23 = new org.apache.commons.math.ConvergenceException("hi!");
        org.apache.commons.math.MathException mathException24 = new org.apache.commons.math.MathException("hi!", (java.lang.Throwable) convergenceException23);
        org.apache.commons.math.FunctionEvaluationException functionEvaluationException25 = new org.apache.commons.math.FunctionEvaluationException((double) (short) 0, "org.apache.commons.math.MathException: hi!", objArray17, (java.lang.Throwable) mathException24);
        org.apache.commons.math.FunctionEvaluationException functionEvaluationException27 = new org.apache.commons.math.FunctionEvaluationException((double) 100L);
        org.apache.commons.math.ConvergenceException convergenceException28 = new org.apache.commons.math.ConvergenceException("org.apache.commons.math.MathException: hi!", objArray17, (java.lang.Throwable) functionEvaluationException27);
        org.apache.commons.math.FunctionEvaluationException functionEvaluationException30 = new org.apache.commons.math.FunctionEvaluationException((double) 100L);
        org.apache.commons.math.ConvergenceException convergenceException31 = new org.apache.commons.math.ConvergenceException("org.apache.commons.math.MathException: hi!", objArray17, (java.lang.Throwable) functionEvaluationException30);
        java.lang.Object[] objArray39 = new java.lang.Object[] { 1L, 'a', 10L, 'a', (-1) };
        org.apache.commons.math.ConvergenceException convergenceException40 = new org.apache.commons.math.ConvergenceException("", objArray39);
        org.apache.commons.math.ode.IntegratorException integratorException41 = new org.apache.commons.math.ode.IntegratorException("org.apache.commons.math.MathException: hi!", objArray39);
        org.apache.commons.math.MathException mathException42 = new org.apache.commons.math.MathException((java.lang.Throwable) integratorException41);
        java.lang.Throwable[] throwableArray43 = integratorException41.getSuppressed();
        org.apache.commons.math.ode.IntegratorException integratorException44 = new org.apache.commons.math.ode.IntegratorException((java.lang.Throwable) integratorException41);
        functionEvaluationException30.addSuppressed((java.lang.Throwable) integratorException41);
        org.apache.commons.math.FunctionEvaluationException functionEvaluationException46 = new org.apache.commons.math.FunctionEvaluationException(100.0d, (java.lang.Throwable) integratorException41);
        org.apache.commons.math.ConvergenceException convergenceException53 = new org.apache.commons.math.ConvergenceException("hi!");
        org.apache.commons.math.MathException mathException54 = new org.apache.commons.math.MathException("hi!", (java.lang.Throwable) convergenceException53);
        java.lang.Object[] objArray55 = mathException54.getArguments();
        java.lang.Throwable throwable56 = null;
        org.apache.commons.math.ConvergenceException convergenceException57 = new org.apache.commons.math.ConvergenceException("hi!", objArray55, throwable56);
        org.apache.commons.math.FunctionEvaluationException functionEvaluationException58 = new org.apache.commons.math.FunctionEvaluationException((double) 1L, "", objArray55);
        org.apache.commons.math.ode.IntegratorException integratorException59 = new org.apache.commons.math.ode.IntegratorException("", objArray55);
        integratorException41.addSuppressed((java.lang.Throwable) integratorException59);
        org.apache.commons.math.ode.DerivativeException derivativeException61 = new org.apache.commons.math.ode.DerivativeException((java.lang.Throwable) integratorException41);
        org.apache.commons.math.ConvergenceException convergenceException62 = new org.apache.commons.math.ConvergenceException("org.apache.commons.math.MathException: hi!", (java.lang.Throwable) integratorException41);
        org.apache.commons.math.MathException mathException63 = new org.apache.commons.math.MathException("org.apache.commons.math.ode.IntegratorException: ", (java.lang.Throwable) integratorException41);
        java.lang.String[] strArray74 = new java.lang.String[] { "hi!", "org.apache.commons.math.MathException: hi!", "", "hi!", "org.apache.commons.math.MathException: hi!" };
        org.apache.commons.math.ode.DerivativeException derivativeException75 = new org.apache.commons.math.ode.DerivativeException("hi!", strArray74);
        org.apache.commons.math.MathException mathException76 = new org.apache.commons.math.MathException("hi!", (java.lang.Object[]) strArray74);
        org.apache.commons.math.ode.DerivativeException derivativeException77 = new org.apache.commons.math.ode.DerivativeException("", strArray74);
        org.apache.commons.math.MathException mathException78 = new org.apache.commons.math.MathException("org.apache.commons.math.FunctionEvaluationException: org.apache.commons.math.FunctionEvaluationException: hi!", (java.lang.Object[]) strArray74);
        org.apache.commons.math.ConvergenceException convergenceException79 = new org.apache.commons.math.ConvergenceException("", (java.lang.Object[]) strArray74);
        mathException63.addSuppressed((java.lang.Throwable) convergenceException79);
        org.junit.Assert.assertNotNull(objArray17);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray17), "[1, a, 10, a, -1]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray17), "[1, a, 10, a, -1]");
        org.junit.Assert.assertNotNull(objArray20);
        org.junit.Assert.assertNotNull(objArray39);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray39), "[1, a, 10, a, -1]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray39), "[1, a, 10, a, -1]");
        org.junit.Assert.assertNotNull(throwableArray43);
        org.junit.Assert.assertNotNull(objArray55);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray55), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray55), "[]");
        org.junit.Assert.assertNotNull(strArray74);
    }
}

