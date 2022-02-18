import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class RegressionTest32 {

    public static boolean debug = false;

    @Test
    public void test16001() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest32.test16001");
        org.apache.commons.math.ode.SwitchingFunctionsHandler switchingFunctionsHandler0 = new org.apache.commons.math.ode.SwitchingFunctionsHandler();
        double double1 = switchingFunctionsHandler0.getEventTime();
        double double2 = switchingFunctionsHandler0.getEventTime();
        org.apache.commons.math.ode.SwitchingFunctionsHandler switchingFunctionsHandler4 = new org.apache.commons.math.ode.SwitchingFunctionsHandler();
        double[] doubleArray8 = new double[] { (-1.0f), 1.0d };
        boolean boolean9 = switchingFunctionsHandler4.reset((double) (byte) 10, doubleArray8);
        boolean boolean10 = switchingFunctionsHandler4.isEmpty();
        double[] doubleArray18 = new double[] { Double.NaN, (short) 100, 100.0d, 100.0f, 0.0f, 10.0f };
        switchingFunctionsHandler4.stepAccepted((double) (-1L), doubleArray18);
        boolean boolean20 = switchingFunctionsHandler0.reset((double) 100L, doubleArray18);
        org.apache.commons.math.ode.SwitchingFunctionsHandler switchingFunctionsHandler22 = new org.apache.commons.math.ode.SwitchingFunctionsHandler();
        double double23 = switchingFunctionsHandler22.getEventTime();
        double double24 = switchingFunctionsHandler22.getEventTime();
        org.apache.commons.math.ode.SwitchingFunctionsHandler switchingFunctionsHandler26 = new org.apache.commons.math.ode.SwitchingFunctionsHandler();
        double[] doubleArray30 = new double[] { (-1.0f), 1.0d };
        boolean boolean31 = switchingFunctionsHandler26.reset((double) (byte) 10, doubleArray30);
        boolean boolean32 = switchingFunctionsHandler26.isEmpty();
        double[] doubleArray40 = new double[] { Double.NaN, (short) 100, 100.0d, 100.0f, 0.0f, 10.0f };
        switchingFunctionsHandler26.stepAccepted((double) (-1L), doubleArray40);
        boolean boolean42 = switchingFunctionsHandler22.reset((double) 100L, doubleArray40);
        boolean boolean43 = switchingFunctionsHandler0.reset((double) 100.0f, doubleArray40);
        boolean boolean44 = switchingFunctionsHandler0.stop();
        boolean boolean45 = switchingFunctionsHandler0.stop();
        org.apache.commons.math.ode.SwitchingFunction switchingFunction46 = null;
        switchingFunctionsHandler0.add(switchingFunction46, (double) 10.0f, (double) (short) 10, 100);
        org.junit.Assert.assertTrue(Double.isNaN(double1));
        org.junit.Assert.assertTrue(Double.isNaN(double2));
        org.junit.Assert.assertNotNull(doubleArray8);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray8), "[-1.0, 1.0]");
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertNotNull(doubleArray18);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray18), "[NaN, 100.0, 100.0, 100.0, 0.0, 10.0]");
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertTrue(Double.isNaN(double23));
        org.junit.Assert.assertTrue(Double.isNaN(double24));
        org.junit.Assert.assertNotNull(doubleArray30);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray30), "[-1.0, 1.0]");
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + false + "'", boolean31 == false);
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + true + "'", boolean32 == true);
        org.junit.Assert.assertNotNull(doubleArray40);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray40), "[NaN, 100.0, 100.0, 100.0, 0.0, 10.0]");
        org.junit.Assert.assertTrue("'" + boolean42 + "' != '" + false + "'", boolean42 == false);
        org.junit.Assert.assertTrue("'" + boolean43 + "' != '" + false + "'", boolean43 == false);
        org.junit.Assert.assertTrue("'" + boolean44 + "' != '" + false + "'", boolean44 == false);
        org.junit.Assert.assertTrue("'" + boolean45 + "' != '" + false + "'", boolean45 == false);
    }

    @Test
    public void test16002() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest32.test16002");
        org.apache.commons.math.FunctionEvaluationException functionEvaluationException2 = new org.apache.commons.math.FunctionEvaluationException((double) 1.0f);
        double double3 = functionEvaluationException2.getArgument();
        java.lang.String str4 = functionEvaluationException2.getPattern();
        double double5 = functionEvaluationException2.getArgument();
        java.lang.Throwable[] throwableArray6 = functionEvaluationException2.getSuppressed();
        org.apache.commons.math.ode.DerivativeException derivativeException7 = new org.apache.commons.math.ode.DerivativeException((java.lang.Throwable) functionEvaluationException2);
        org.apache.commons.math.FunctionEvaluationException functionEvaluationException8 = new org.apache.commons.math.FunctionEvaluationException((double) 100L, (java.lang.Throwable) functionEvaluationException2);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 1.0d + "'", double3 == 1.0d);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "Evaluation failed for argument = {0}" + "'", str4, "Evaluation failed for argument = {0}");
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 1.0d + "'", double5 == 1.0d);
        org.junit.Assert.assertNotNull(throwableArray6);
    }

    @Test
    public void test16003() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest32.test16003");
        org.apache.commons.math.FunctionEvaluationException functionEvaluationException2 = new org.apache.commons.math.FunctionEvaluationException((double) 100, "org.apache.commons.math.FunctionEvaluationException: Evaluation failed for argument = 0");
    }

    @Test
    public void test16004() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest32.test16004");
        java.lang.String[] strArray12 = new java.lang.String[] { "hi!" };
        org.apache.commons.math.ode.DerivativeException derivativeException13 = new org.apache.commons.math.ode.DerivativeException("hi!", strArray12);
        org.apache.commons.math.FunctionEvaluationException functionEvaluationException14 = new org.apache.commons.math.FunctionEvaluationException((double) (byte) 100, "", (java.lang.Object[]) strArray12);
        org.apache.commons.math.ConvergenceException convergenceException15 = new org.apache.commons.math.ConvergenceException("hi!", (java.lang.Object[]) strArray12);
        org.apache.commons.math.ode.DerivativeException derivativeException16 = new org.apache.commons.math.ode.DerivativeException("", strArray12);
        org.apache.commons.math.ode.IntegratorException integratorException17 = new org.apache.commons.math.ode.IntegratorException("", (java.lang.Object[]) strArray12);
        org.apache.commons.math.ode.DerivativeException derivativeException18 = new org.apache.commons.math.ode.DerivativeException("org.apache.commons.math.ode.DerivativeException: org.apache.commons.math.ode.DerivativeException: hi!", strArray12);
        org.apache.commons.math.ode.DerivativeException derivativeException19 = new org.apache.commons.math.ode.DerivativeException("org.apache.commons.math.ConvergenceException: org.apache.commons.math.ConvergenceException: org.apache.commons.math.FunctionEvaluationException: org.apache.commons.math.ode.DerivativeException: hi!", strArray12);
        org.apache.commons.math.ode.DerivativeException derivativeException20 = new org.apache.commons.math.ode.DerivativeException("org.apache.commons.math.FunctionEvaluationException: org.apache.commons.math.ode.IntegratorException: org.apache.commons.math.ConvergenceException: org.apache.commons.math.ConvergenceException: hi!", strArray12);
        org.apache.commons.math.ConvergenceException convergenceException21 = new org.apache.commons.math.ConvergenceException("org.apache.commons.math.ode.IntegratorException: org.apache.commons.math.ConvergenceException: org.apache.commons.math.ConvergenceException: hi!", (java.lang.Object[]) strArray12);
        org.apache.commons.math.ode.IntegratorException integratorException22 = new org.apache.commons.math.ode.IntegratorException("org.apache.commons.math.FunctionEvaluationException: org.apache.commons.math.FunctionEvaluationException: org.apache.commons.math.ode.IntegratorException: org.apache.commons.math.ode.IntegratorException: org.apache.commons.math.ConvergenceException: org.apache.commons.math.FunctionEvaluationException: ", (java.lang.Object[]) strArray12);
        org.junit.Assert.assertNotNull(strArray12);
    }

    @Test
    public void test16005() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest32.test16005");
        org.apache.commons.math.FunctionEvaluationException functionEvaluationException8 = new org.apache.commons.math.FunctionEvaluationException((double) 0.0f);
        org.apache.commons.math.FunctionEvaluationException functionEvaluationException9 = new org.apache.commons.math.FunctionEvaluationException((double) 100.0f, "org.apache.commons.math.ode.DerivativeException: hi!", (java.lang.Throwable) functionEvaluationException8);
        java.lang.Object[] objArray10 = functionEvaluationException8.getArguments();
        org.apache.commons.math.ode.DerivativeException derivativeException11 = new org.apache.commons.math.ode.DerivativeException((java.lang.Throwable) functionEvaluationException8);
        org.apache.commons.math.FunctionEvaluationException functionEvaluationException15 = new org.apache.commons.math.FunctionEvaluationException((double) 'a');
        java.lang.Throwable[] throwableArray16 = functionEvaluationException15.getSuppressed();
        org.apache.commons.math.FunctionEvaluationException functionEvaluationException18 = new org.apache.commons.math.FunctionEvaluationException((double) 'a');
        org.apache.commons.math.FunctionEvaluationException functionEvaluationException21 = new org.apache.commons.math.FunctionEvaluationException((double) 'a');
        org.apache.commons.math.ConvergenceException convergenceException22 = new org.apache.commons.math.ConvergenceException("hi!", (java.lang.Throwable) functionEvaluationException21);
        functionEvaluationException18.addSuppressed((java.lang.Throwable) convergenceException22);
        org.apache.commons.math.FunctionEvaluationException functionEvaluationException24 = new org.apache.commons.math.FunctionEvaluationException((double) (byte) -1, "org.apache.commons.math.ode.DerivativeException: hi!", (java.lang.Object[]) throwableArray16, (java.lang.Throwable) functionEvaluationException18);
        java.lang.Throwable[] throwableArray25 = functionEvaluationException18.getSuppressed();
        org.apache.commons.math.ConvergenceException convergenceException26 = new org.apache.commons.math.ConvergenceException((java.lang.Throwable) functionEvaluationException18);
        derivativeException11.addSuppressed((java.lang.Throwable) functionEvaluationException18);
        org.apache.commons.math.ConvergenceException convergenceException28 = new org.apache.commons.math.ConvergenceException("org.apache.commons.math.ode.DerivativeException: org.apache.commons.math.FunctionEvaluationException", (java.lang.Throwable) functionEvaluationException18);
        java.lang.Throwable[] throwableArray29 = convergenceException28.getSuppressed();
        org.apache.commons.math.FunctionEvaluationException functionEvaluationException32 = new org.apache.commons.math.FunctionEvaluationException(1.0d, "org.apache.commons.math.FunctionEvaluationException: org.apache.commons.math.ode.DerivativeException: org.apache.commons.math.FunctionEvaluationException: org.apache.commons.math.ode.DerivativeException: hi!");
        org.apache.commons.math.ConvergenceException convergenceException33 = new org.apache.commons.math.ConvergenceException("org.apache.commons.math.ConvergenceException: hi!", (java.lang.Object[]) throwableArray29, (java.lang.Throwable) functionEvaluationException32);
        java.lang.Throwable throwable34 = null;
        org.apache.commons.math.ConvergenceException convergenceException35 = new org.apache.commons.math.ConvergenceException("org.apache.commons.math.FunctionEvaluationException: org.apache.commons.math.ode.IntegratorException: org.apache.commons.math.ConvergenceException: org.apache.commons.math.ConvergenceException: hi!", (java.lang.Object[]) throwableArray29, throwable34);
        org.apache.commons.math.ode.IntegratorException integratorException36 = new org.apache.commons.math.ode.IntegratorException("org.apache.commons.math.ConvergenceException: org.apache.commons.math.ode.DerivativeException: org.apache.commons.math.ConvergenceException: org.apache.commons.math.ode.DerivativeException: hi!", (java.lang.Object[]) throwableArray29);
        org.apache.commons.math.ConvergenceException convergenceException37 = new org.apache.commons.math.ConvergenceException((java.lang.Throwable) integratorException36);
        org.apache.commons.math.ConvergenceException convergenceException38 = new org.apache.commons.math.ConvergenceException("org.apache.commons.math.FunctionEvaluationException: org.apache.commons.math.FunctionEvaluationException: org.apache.commons.math.FunctionEvaluationException: org.apache.commons.math.ode.IntegratorException: Evaluation failed for argument = 97", (java.lang.Throwable) convergenceException37);
        org.junit.Assert.assertNotNull(objArray10);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray10), "[0.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray10), "[0.0]");
        org.junit.Assert.assertNotNull(throwableArray16);
        org.junit.Assert.assertNotNull(throwableArray25);
        org.junit.Assert.assertNotNull(throwableArray29);
    }

    @Test
    public void test16006() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest32.test16006");
        java.lang.String[] strArray17 = new java.lang.String[] { "hi!" };
        org.apache.commons.math.ode.DerivativeException derivativeException18 = new org.apache.commons.math.ode.DerivativeException("hi!", strArray17);
        org.apache.commons.math.FunctionEvaluationException functionEvaluationException19 = new org.apache.commons.math.FunctionEvaluationException((double) (byte) 100, "", (java.lang.Object[]) strArray17);
        org.apache.commons.math.ConvergenceException convergenceException20 = new org.apache.commons.math.ConvergenceException("hi!", (java.lang.Object[]) strArray17);
        org.apache.commons.math.ode.DerivativeException derivativeException21 = new org.apache.commons.math.ode.DerivativeException("", strArray17);
        org.apache.commons.math.ode.IntegratorException integratorException22 = new org.apache.commons.math.ode.IntegratorException("", (java.lang.Object[]) strArray17);
        org.apache.commons.math.FunctionEvaluationException functionEvaluationException23 = new org.apache.commons.math.FunctionEvaluationException(10.0d, "", (java.lang.Object[]) strArray17);
        org.apache.commons.math.ode.IntegratorException integratorException24 = new org.apache.commons.math.ode.IntegratorException("hi!", (java.lang.Object[]) strArray17);
        org.apache.commons.math.FunctionEvaluationException functionEvaluationException25 = new org.apache.commons.math.FunctionEvaluationException((double) (byte) -1, "org.apache.commons.math.ConvergenceException: org.apache.commons.math.FunctionEvaluationException: ", (java.lang.Object[]) strArray17);
        org.apache.commons.math.ode.DerivativeException derivativeException26 = new org.apache.commons.math.ode.DerivativeException("org.apache.commons.math.FunctionEvaluationException", strArray17);
        org.apache.commons.math.ConvergenceException convergenceException27 = new org.apache.commons.math.ConvergenceException("org.apache.commons.math.ConvergenceException: org.apache.commons.math.ConvergenceException: hi!", (java.lang.Object[]) strArray17);
        org.apache.commons.math.ode.DerivativeException derivativeException28 = new org.apache.commons.math.ode.DerivativeException("org.apache.commons.math.ConvergenceException: org.apache.commons.math.FunctionEvaluationException: org.apache.commons.math.ode.DerivativeException: Evaluation failed for argument = 97", strArray17);
        org.apache.commons.math.ode.DerivativeException derivativeException29 = new org.apache.commons.math.ode.DerivativeException("org.apache.commons.math.ConvergenceException: org.apache.commons.math.ConvergenceException: org.apache.commons.math.ode.IntegratorException: org.apache.commons.math.FunctionEvaluationException: org.apache.commons.math.ode.DerivativeException: hi!", strArray17);
        org.apache.commons.math.ode.DerivativeException derivativeException30 = new org.apache.commons.math.ode.DerivativeException("org.apache.commons.math.ode.DerivativeException: Evaluation failed for argument = 97", strArray17);
        org.apache.commons.math.ode.IntegratorException integratorException31 = new org.apache.commons.math.ode.IntegratorException((java.lang.Throwable) derivativeException30);
        org.junit.Assert.assertNotNull(strArray17);
    }

    @Test
    public void test16007() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest32.test16007");
        org.apache.commons.math.FunctionEvaluationException functionEvaluationException4 = new org.apache.commons.math.FunctionEvaluationException((double) (byte) -1, "Evaluation failed for argument = 1");
        java.lang.Throwable throwable11 = null;
        org.apache.commons.math.ode.DerivativeException derivativeException12 = new org.apache.commons.math.ode.DerivativeException(throwable11);
        java.lang.String[] strArray15 = new java.lang.String[] { "hi!" };
        org.apache.commons.math.ode.DerivativeException derivativeException16 = new org.apache.commons.math.ode.DerivativeException("hi!", strArray15);
        org.apache.commons.math.ode.DerivativeException derivativeException17 = new org.apache.commons.math.ode.DerivativeException((java.lang.Throwable) derivativeException16);
        org.apache.commons.math.ode.IntegratorException integratorException18 = new org.apache.commons.math.ode.IntegratorException((java.lang.Throwable) derivativeException16);
        derivativeException12.addSuppressed((java.lang.Throwable) integratorException18);
        org.apache.commons.math.ode.IntegratorException integratorException20 = new org.apache.commons.math.ode.IntegratorException((java.lang.Throwable) integratorException18);
        org.apache.commons.math.ConvergenceException convergenceException21 = new org.apache.commons.math.ConvergenceException("", (java.lang.Throwable) integratorException20);
        java.lang.Object[] objArray22 = integratorException20.getArguments();
        org.apache.commons.math.FunctionEvaluationException functionEvaluationException23 = new org.apache.commons.math.FunctionEvaluationException((double) 10, "org.apache.commons.math.ConvergenceException: ", objArray22);
        org.apache.commons.math.FunctionEvaluationException functionEvaluationException24 = new org.apache.commons.math.FunctionEvaluationException((double) 10.0f, "org.apache.commons.math.ode.IntegratorException: Evaluation failed for argument = {0}", (java.lang.Throwable) functionEvaluationException23);
        java.lang.Throwable[] throwableArray25 = functionEvaluationException23.getSuppressed();
        org.apache.commons.math.FunctionEvaluationException functionEvaluationException26 = new org.apache.commons.math.FunctionEvaluationException((double) (byte) 0, (java.lang.Throwable) functionEvaluationException23);
        functionEvaluationException4.addSuppressed((java.lang.Throwable) functionEvaluationException26);
        org.apache.commons.math.FunctionEvaluationException functionEvaluationException28 = new org.apache.commons.math.FunctionEvaluationException(52.0d, "org.apache.commons.math.FunctionEvaluationException: org.apache.commons.math.FunctionEvaluationException: org.apache.commons.math.ConvergenceException: Evaluation failed for argument = 97", (java.lang.Throwable) functionEvaluationException26);
        org.junit.Assert.assertNotNull(strArray15);
        org.junit.Assert.assertNotNull(objArray22);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray22), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray22), "[]");
        org.junit.Assert.assertNotNull(throwableArray25);
    }

    @Test
    public void test16008() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest32.test16008");
        java.lang.Throwable throwable3 = null;
        org.apache.commons.math.ode.DerivativeException derivativeException4 = new org.apache.commons.math.ode.DerivativeException(throwable3);
        java.lang.String[] strArray7 = new java.lang.String[] { "hi!" };
        org.apache.commons.math.ode.DerivativeException derivativeException8 = new org.apache.commons.math.ode.DerivativeException("hi!", strArray7);
        org.apache.commons.math.ode.DerivativeException derivativeException9 = new org.apache.commons.math.ode.DerivativeException((java.lang.Throwable) derivativeException8);
        org.apache.commons.math.ode.IntegratorException integratorException10 = new org.apache.commons.math.ode.IntegratorException((java.lang.Throwable) derivativeException8);
        derivativeException4.addSuppressed((java.lang.Throwable) integratorException10);
        org.apache.commons.math.ode.IntegratorException integratorException12 = new org.apache.commons.math.ode.IntegratorException((java.lang.Throwable) integratorException10);
        org.apache.commons.math.ConvergenceException convergenceException13 = new org.apache.commons.math.ConvergenceException("", (java.lang.Throwable) integratorException12);
        org.apache.commons.math.FunctionEvaluationException functionEvaluationException14 = new org.apache.commons.math.FunctionEvaluationException((double) (byte) -1, "Evaluation failed for argument = 97", (java.lang.Throwable) convergenceException13);
        java.lang.Object[] objArray21 = new java.lang.Object[] { 10.0d };
        org.apache.commons.math.FunctionEvaluationException functionEvaluationException24 = new org.apache.commons.math.FunctionEvaluationException((double) 'a');
        org.apache.commons.math.ConvergenceException convergenceException25 = new org.apache.commons.math.ConvergenceException("hi!", (java.lang.Throwable) functionEvaluationException24);
        org.apache.commons.math.FunctionEvaluationException functionEvaluationException26 = new org.apache.commons.math.FunctionEvaluationException((double) 0L, "org.apache.commons.math.ode.DerivativeException: hi!", objArray21, (java.lang.Throwable) convergenceException25);
        org.apache.commons.math.ConvergenceException convergenceException27 = new org.apache.commons.math.ConvergenceException("org.apache.commons.math.ode.DerivativeException: hi!", objArray21);
        org.apache.commons.math.FunctionEvaluationException functionEvaluationException30 = new org.apache.commons.math.FunctionEvaluationException((double) 'a');
        org.apache.commons.math.FunctionEvaluationException functionEvaluationException33 = new org.apache.commons.math.FunctionEvaluationException((double) 'a');
        org.apache.commons.math.ConvergenceException convergenceException34 = new org.apache.commons.math.ConvergenceException("hi!", (java.lang.Throwable) functionEvaluationException33);
        functionEvaluationException30.addSuppressed((java.lang.Throwable) convergenceException34);
        org.apache.commons.math.ConvergenceException convergenceException36 = new org.apache.commons.math.ConvergenceException((java.lang.Throwable) functionEvaluationException30);
        org.apache.commons.math.FunctionEvaluationException functionEvaluationException37 = new org.apache.commons.math.FunctionEvaluationException((double) (short) 10, (java.lang.Throwable) convergenceException36);
        org.apache.commons.math.ConvergenceException convergenceException38 = new org.apache.commons.math.ConvergenceException("org.apache.commons.math.FunctionEvaluationException: ", objArray21, (java.lang.Throwable) functionEvaluationException37);
        java.lang.Throwable[] throwableArray39 = functionEvaluationException37.getSuppressed();
        java.lang.Throwable throwable41 = null;
        org.apache.commons.math.ode.DerivativeException derivativeException42 = new org.apache.commons.math.ode.DerivativeException(throwable41);
        java.lang.String[] strArray45 = new java.lang.String[] { "hi!" };
        org.apache.commons.math.ode.DerivativeException derivativeException46 = new org.apache.commons.math.ode.DerivativeException("hi!", strArray45);
        org.apache.commons.math.ode.DerivativeException derivativeException47 = new org.apache.commons.math.ode.DerivativeException((java.lang.Throwable) derivativeException46);
        org.apache.commons.math.ode.IntegratorException integratorException48 = new org.apache.commons.math.ode.IntegratorException((java.lang.Throwable) derivativeException46);
        derivativeException42.addSuppressed((java.lang.Throwable) integratorException48);
        org.apache.commons.math.ode.IntegratorException integratorException50 = new org.apache.commons.math.ode.IntegratorException((java.lang.Throwable) integratorException48);
        org.apache.commons.math.ConvergenceException convergenceException51 = new org.apache.commons.math.ConvergenceException("", (java.lang.Throwable) integratorException50);
        org.apache.commons.math.ConvergenceException convergenceException52 = new org.apache.commons.math.ConvergenceException("org.apache.commons.math.ConvergenceException: hi!", (java.lang.Object[]) throwableArray39, (java.lang.Throwable) integratorException50);
        convergenceException13.addSuppressed((java.lang.Throwable) integratorException50);
        org.apache.commons.math.ConvergenceException convergenceException54 = new org.apache.commons.math.ConvergenceException((java.lang.Throwable) convergenceException13);
        org.apache.commons.math.FunctionEvaluationException functionEvaluationException57 = new org.apache.commons.math.FunctionEvaluationException((double) (byte) 1, "org.apache.commons.math.ode.DerivativeException: org.apache.commons.math.FunctionEvaluationException: org.apache.commons.math.FunctionEvaluationException: hi!");
        convergenceException54.addSuppressed((java.lang.Throwable) functionEvaluationException57);
        java.lang.Class<?> wildcardClass59 = convergenceException54.getClass();
        org.junit.Assert.assertNotNull(strArray7);
        org.junit.Assert.assertNotNull(objArray21);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray21), "[10.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray21), "[10.0]");
        org.junit.Assert.assertNotNull(throwableArray39);
        org.junit.Assert.assertNotNull(strArray45);
        org.junit.Assert.assertNotNull(wildcardClass59);
    }

    @Test
    public void test16009() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest32.test16009");
        org.apache.commons.math.FunctionEvaluationException functionEvaluationException9 = new org.apache.commons.math.FunctionEvaluationException((double) 'a');
        java.lang.Throwable[] throwableArray10 = functionEvaluationException9.getSuppressed();
        org.apache.commons.math.FunctionEvaluationException functionEvaluationException12 = new org.apache.commons.math.FunctionEvaluationException((double) 'a');
        org.apache.commons.math.FunctionEvaluationException functionEvaluationException15 = new org.apache.commons.math.FunctionEvaluationException((double) 'a');
        org.apache.commons.math.ConvergenceException convergenceException16 = new org.apache.commons.math.ConvergenceException("hi!", (java.lang.Throwable) functionEvaluationException15);
        functionEvaluationException12.addSuppressed((java.lang.Throwable) convergenceException16);
        org.apache.commons.math.FunctionEvaluationException functionEvaluationException18 = new org.apache.commons.math.FunctionEvaluationException((double) (byte) -1, "org.apache.commons.math.ode.DerivativeException: hi!", (java.lang.Object[]) throwableArray10, (java.lang.Throwable) functionEvaluationException12);
        org.apache.commons.math.ode.DerivativeException derivativeException19 = new org.apache.commons.math.ode.DerivativeException((java.lang.Throwable) functionEvaluationException18);
        java.lang.Throwable[] throwableArray20 = functionEvaluationException18.getSuppressed();
        org.apache.commons.math.FunctionEvaluationException functionEvaluationException21 = new org.apache.commons.math.FunctionEvaluationException((-1.0d), "org.apache.commons.math.ode.DerivativeException: org.apache.commons.math.FunctionEvaluationException: org.apache.commons.math.ode.DerivativeException: hi!", (java.lang.Object[]) throwableArray20);
        org.apache.commons.math.ConvergenceException convergenceException22 = new org.apache.commons.math.ConvergenceException("org.apache.commons.math.ode.IntegratorException: Evaluation failed for argument = {0}", (java.lang.Object[]) throwableArray20);
        org.apache.commons.math.ode.IntegratorException integratorException23 = new org.apache.commons.math.ode.IntegratorException("org.apache.commons.math.ConvergenceException: org.apache.commons.math.ConvergenceException: org.apache.commons.math.ConvergenceException: hi!", (java.lang.Object[]) throwableArray20);
        org.apache.commons.math.ode.IntegratorException integratorException24 = new org.apache.commons.math.ode.IntegratorException("org.apache.commons.math.ConvergenceException: org.apache.commons.math.FunctionEvaluationException: org.apache.commons.math.ode.DerivativeException: org.apache.commons.math.ode.DerivativeException: hi!", (java.lang.Object[]) throwableArray20);
        org.apache.commons.math.ode.IntegratorException integratorException25 = new org.apache.commons.math.ode.IntegratorException("org.apache.commons.math.ConvergenceException: org.apache.commons.math.FunctionEvaluationException: Evaluation failed for argument = {0}", (java.lang.Object[]) throwableArray20);
        org.junit.Assert.assertNotNull(throwableArray10);
        org.junit.Assert.assertNotNull(throwableArray20);
    }

    @Test
    public void test16010() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest32.test16010");
        org.apache.commons.math.FunctionEvaluationException functionEvaluationException2 = new org.apache.commons.math.FunctionEvaluationException((double) 100L, "org.apache.commons.math.ConvergenceException: org.apache.commons.math.FunctionEvaluationException: Evaluation failed for argument = 0");
        java.lang.Object[] objArray14 = new java.lang.Object[] { 10.0d };
        org.apache.commons.math.FunctionEvaluationException functionEvaluationException17 = new org.apache.commons.math.FunctionEvaluationException((double) 'a');
        org.apache.commons.math.ConvergenceException convergenceException18 = new org.apache.commons.math.ConvergenceException("hi!", (java.lang.Throwable) functionEvaluationException17);
        org.apache.commons.math.FunctionEvaluationException functionEvaluationException19 = new org.apache.commons.math.FunctionEvaluationException((double) 0L, "org.apache.commons.math.ode.DerivativeException: hi!", objArray14, (java.lang.Throwable) convergenceException18);
        org.apache.commons.math.ConvergenceException convergenceException20 = new org.apache.commons.math.ConvergenceException("org.apache.commons.math.ode.DerivativeException: hi!", objArray14);
        org.apache.commons.math.FunctionEvaluationException functionEvaluationException23 = new org.apache.commons.math.FunctionEvaluationException((double) 'a');
        org.apache.commons.math.FunctionEvaluationException functionEvaluationException26 = new org.apache.commons.math.FunctionEvaluationException((double) 'a');
        org.apache.commons.math.ConvergenceException convergenceException27 = new org.apache.commons.math.ConvergenceException("hi!", (java.lang.Throwable) functionEvaluationException26);
        functionEvaluationException23.addSuppressed((java.lang.Throwable) convergenceException27);
        org.apache.commons.math.ConvergenceException convergenceException29 = new org.apache.commons.math.ConvergenceException((java.lang.Throwable) functionEvaluationException23);
        org.apache.commons.math.FunctionEvaluationException functionEvaluationException30 = new org.apache.commons.math.FunctionEvaluationException((double) (short) 10, (java.lang.Throwable) convergenceException29);
        org.apache.commons.math.ConvergenceException convergenceException31 = new org.apache.commons.math.ConvergenceException("org.apache.commons.math.FunctionEvaluationException: ", objArray14, (java.lang.Throwable) functionEvaluationException30);
        java.lang.Throwable[] throwableArray32 = functionEvaluationException30.getSuppressed();
        org.apache.commons.math.FunctionEvaluationException functionEvaluationException33 = new org.apache.commons.math.FunctionEvaluationException((double) 1L, "org.apache.commons.math.ConvergenceException: ", (java.lang.Throwable) functionEvaluationException30);
        org.apache.commons.math.FunctionEvaluationException functionEvaluationException34 = new org.apache.commons.math.FunctionEvaluationException((double) 'a', (java.lang.Throwable) functionEvaluationException33);
        java.lang.Throwable[] throwableArray35 = functionEvaluationException33.getSuppressed();
        java.lang.Throwable throwable36 = null;
        org.apache.commons.math.ConvergenceException convergenceException37 = new org.apache.commons.math.ConvergenceException("org.apache.commons.math.FunctionEvaluationException: org.apache.commons.math.FunctionEvaluationException: org.apache.commons.math.ode.DerivativeException: hi!", (java.lang.Object[]) throwableArray35, throwable36);
        org.apache.commons.math.FunctionEvaluationException functionEvaluationException38 = new org.apache.commons.math.FunctionEvaluationException((double) 100L, "org.apache.commons.math.ConvergenceException: org.apache.commons.math.FunctionEvaluationException: org.apache.commons.math.ode.DerivativeException: org.apache.commons.math.FunctionEvaluationException: org.apache.commons.math.ode.DerivativeException: hi!", throwable36);
        // The following exception was thrown during execution in test generation
        try {
            functionEvaluationException2.addSuppressed(throwable36);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot suppress a null exception.");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(objArray14);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray14), "[10.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray14), "[10.0]");
        org.junit.Assert.assertNotNull(throwableArray32);
        org.junit.Assert.assertNotNull(throwableArray35);
    }

    @Test
    public void test16011() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest32.test16011");
        java.lang.Object[] objArray8 = new java.lang.Object[] { 10.0d };
        org.apache.commons.math.FunctionEvaluationException functionEvaluationException11 = new org.apache.commons.math.FunctionEvaluationException((double) 'a');
        org.apache.commons.math.ConvergenceException convergenceException12 = new org.apache.commons.math.ConvergenceException("hi!", (java.lang.Throwable) functionEvaluationException11);
        org.apache.commons.math.FunctionEvaluationException functionEvaluationException13 = new org.apache.commons.math.FunctionEvaluationException((double) 0L, "org.apache.commons.math.ode.DerivativeException: hi!", objArray8, (java.lang.Throwable) convergenceException12);
        org.apache.commons.math.FunctionEvaluationException functionEvaluationException14 = new org.apache.commons.math.FunctionEvaluationException((double) 100L, "", objArray8);
        org.apache.commons.math.FunctionEvaluationException functionEvaluationException16 = new org.apache.commons.math.FunctionEvaluationException(1.0d);
        org.apache.commons.math.ConvergenceException convergenceException17 = new org.apache.commons.math.ConvergenceException("org.apache.commons.math.FunctionEvaluationException: Evaluation failed for argument = 1", objArray8, (java.lang.Throwable) functionEvaluationException16);
        java.lang.Throwable throwable18 = null;
        org.apache.commons.math.FunctionEvaluationException functionEvaluationException19 = new org.apache.commons.math.FunctionEvaluationException((double) 0.0f, "org.apache.commons.math.ode.IntegratorException: org.apache.commons.math.FunctionEvaluationException: org.apache.commons.math.FunctionEvaluationException: org.apache.commons.math.ode.DerivativeException: hi!", objArray8, throwable18);
        org.junit.Assert.assertNotNull(objArray8);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray8), "[10.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray8), "[10.0]");
    }

    @Test
    public void test16012() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest32.test16012");
        java.lang.Object[] objArray7 = new java.lang.Object[] { 10.0d };
        org.apache.commons.math.FunctionEvaluationException functionEvaluationException10 = new org.apache.commons.math.FunctionEvaluationException((double) 'a');
        org.apache.commons.math.ConvergenceException convergenceException11 = new org.apache.commons.math.ConvergenceException("hi!", (java.lang.Throwable) functionEvaluationException10);
        org.apache.commons.math.FunctionEvaluationException functionEvaluationException12 = new org.apache.commons.math.FunctionEvaluationException((double) 0L, "org.apache.commons.math.ode.DerivativeException: hi!", objArray7, (java.lang.Throwable) convergenceException11);
        org.apache.commons.math.FunctionEvaluationException functionEvaluationException13 = new org.apache.commons.math.FunctionEvaluationException((double) 100L, "", objArray7);
        org.apache.commons.math.ConvergenceException convergenceException14 = new org.apache.commons.math.ConvergenceException("org.apache.commons.math.ode.IntegratorException: org.apache.commons.math.ConvergenceException: ", objArray7);
        java.lang.Object[] objArray15 = convergenceException14.getArguments();
        org.apache.commons.math.ConvergenceException convergenceException16 = new org.apache.commons.math.ConvergenceException("org.apache.commons.math.ode.IntegratorException: org.apache.commons.math.ConvergenceException: org.apache.commons.math.FunctionEvaluationException: ", (java.lang.Throwable) convergenceException14);
        org.apache.commons.math.ode.IntegratorException integratorException17 = new org.apache.commons.math.ode.IntegratorException((java.lang.Throwable) convergenceException14);
        org.junit.Assert.assertNotNull(objArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray7), "[10.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray7), "[10.0]");
        org.junit.Assert.assertNotNull(objArray15);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray15), "[10.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray15), "[10.0]");
    }

    @Test
    public void test16013() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest32.test16013");
        java.lang.String[] strArray14 = new java.lang.String[] { "hi!" };
        org.apache.commons.math.ode.DerivativeException derivativeException15 = new org.apache.commons.math.ode.DerivativeException("hi!", strArray14);
        org.apache.commons.math.FunctionEvaluationException functionEvaluationException16 = new org.apache.commons.math.FunctionEvaluationException((double) (byte) 100, "", (java.lang.Object[]) strArray14);
        org.apache.commons.math.ConvergenceException convergenceException17 = new org.apache.commons.math.ConvergenceException("hi!", (java.lang.Object[]) strArray14);
        org.apache.commons.math.ode.DerivativeException derivativeException18 = new org.apache.commons.math.ode.DerivativeException("", strArray14);
        org.apache.commons.math.ode.IntegratorException integratorException19 = new org.apache.commons.math.ode.IntegratorException("", (java.lang.Object[]) strArray14);
        org.apache.commons.math.FunctionEvaluationException functionEvaluationException20 = new org.apache.commons.math.FunctionEvaluationException(10.0d, "", (java.lang.Object[]) strArray14);
        org.apache.commons.math.ode.DerivativeException derivativeException21 = new org.apache.commons.math.ode.DerivativeException("Evaluation failed for argument = {0}", strArray14);
        java.lang.String[] strArray27 = new java.lang.String[] { "hi!" };
        org.apache.commons.math.ode.DerivativeException derivativeException28 = new org.apache.commons.math.ode.DerivativeException("hi!", strArray27);
        org.apache.commons.math.FunctionEvaluationException functionEvaluationException29 = new org.apache.commons.math.FunctionEvaluationException((double) (byte) 100, "", (java.lang.Object[]) strArray27);
        org.apache.commons.math.ode.DerivativeException derivativeException30 = new org.apache.commons.math.ode.DerivativeException("org.apache.commons.math.ConvergenceException: ", strArray27);
        java.lang.Object[] objArray31 = derivativeException30.getArguments();
        org.apache.commons.math.ConvergenceException convergenceException32 = new org.apache.commons.math.ConvergenceException((java.lang.Throwable) derivativeException30);
        java.lang.String str33 = derivativeException30.getPattern();
        org.apache.commons.math.ConvergenceException convergenceException34 = new org.apache.commons.math.ConvergenceException("org.apache.commons.math.ConvergenceException: org.apache.commons.math.ConvergenceException: Evaluation failed for argument = 97", (java.lang.Object[]) strArray14, (java.lang.Throwable) derivativeException30);
        org.apache.commons.math.FunctionEvaluationException functionEvaluationException39 = new org.apache.commons.math.FunctionEvaluationException((double) 'a');
        java.lang.Throwable[] throwableArray40 = functionEvaluationException39.getSuppressed();
        org.apache.commons.math.FunctionEvaluationException functionEvaluationException42 = new org.apache.commons.math.FunctionEvaluationException((double) 'a');
        org.apache.commons.math.FunctionEvaluationException functionEvaluationException45 = new org.apache.commons.math.FunctionEvaluationException((double) 'a');
        org.apache.commons.math.ConvergenceException convergenceException46 = new org.apache.commons.math.ConvergenceException("hi!", (java.lang.Throwable) functionEvaluationException45);
        functionEvaluationException42.addSuppressed((java.lang.Throwable) convergenceException46);
        org.apache.commons.math.FunctionEvaluationException functionEvaluationException48 = new org.apache.commons.math.FunctionEvaluationException((double) (byte) -1, "org.apache.commons.math.ode.DerivativeException: hi!", (java.lang.Object[]) throwableArray40, (java.lang.Throwable) functionEvaluationException42);
        java.lang.Object[] objArray49 = functionEvaluationException42.getArguments();
        java.lang.Throwable[] throwableArray50 = functionEvaluationException42.getSuppressed();
        java.lang.String[] strArray53 = new java.lang.String[] { "hi!" };
        org.apache.commons.math.ode.DerivativeException derivativeException54 = new org.apache.commons.math.ode.DerivativeException("hi!", strArray53);
        org.apache.commons.math.ode.DerivativeException derivativeException55 = new org.apache.commons.math.ode.DerivativeException((java.lang.Throwable) derivativeException54);
        org.apache.commons.math.ode.IntegratorException integratorException56 = new org.apache.commons.math.ode.IntegratorException((java.lang.Throwable) derivativeException54);
        org.apache.commons.math.ode.IntegratorException integratorException57 = new org.apache.commons.math.ode.IntegratorException((java.lang.Throwable) derivativeException54);
        org.apache.commons.math.ode.IntegratorException integratorException58 = new org.apache.commons.math.ode.IntegratorException((java.lang.Throwable) integratorException57);
        org.apache.commons.math.ConvergenceException convergenceException59 = new org.apache.commons.math.ConvergenceException("org.apache.commons.math.FunctionEvaluationException", (java.lang.Object[]) throwableArray50, (java.lang.Throwable) integratorException57);
        java.lang.Throwable[] throwableArray60 = integratorException57.getSuppressed();
        org.apache.commons.math.FunctionEvaluationException functionEvaluationException61 = new org.apache.commons.math.FunctionEvaluationException((double) (short) 0, "org.apache.commons.math.ode.IntegratorException: org.apache.commons.math.ode.IntegratorException: org.apache.commons.math.ConvergenceException: ", (java.lang.Object[]) strArray14, (java.lang.Throwable) integratorException57);
        org.apache.commons.math.ConvergenceException convergenceException62 = new org.apache.commons.math.ConvergenceException("org.apache.commons.math.ode.IntegratorException: org.apache.commons.math.ConvergenceException: org.apache.commons.math.FunctionEvaluationException: ", (java.lang.Throwable) integratorException57);
        java.lang.String[] strArray69 = new java.lang.String[] { "hi!" };
        org.apache.commons.math.ode.DerivativeException derivativeException70 = new org.apache.commons.math.ode.DerivativeException("hi!", strArray69);
        org.apache.commons.math.FunctionEvaluationException functionEvaluationException71 = new org.apache.commons.math.FunctionEvaluationException((double) (byte) 100, "", (java.lang.Object[]) strArray69);
        org.apache.commons.math.ConvergenceException convergenceException72 = new org.apache.commons.math.ConvergenceException("hi!", (java.lang.Object[]) strArray69);
        org.apache.commons.math.FunctionEvaluationException functionEvaluationException74 = new org.apache.commons.math.FunctionEvaluationException((double) 'a');
        java.lang.Throwable[] throwableArray75 = functionEvaluationException74.getSuppressed();
        org.apache.commons.math.ode.DerivativeException derivativeException76 = new org.apache.commons.math.ode.DerivativeException((java.lang.Throwable) functionEvaluationException74);
        java.lang.String str77 = derivativeException76.getPattern();
        java.lang.String str78 = derivativeException76.getPattern();
        org.apache.commons.math.ConvergenceException convergenceException83 = new org.apache.commons.math.ConvergenceException();
        org.apache.commons.math.FunctionEvaluationException functionEvaluationException84 = new org.apache.commons.math.FunctionEvaluationException(97.0d, "org.apache.commons.math.ConvergenceException: Evaluation failed for argument = 97", (java.lang.Throwable) convergenceException83);
        org.apache.commons.math.FunctionEvaluationException functionEvaluationException85 = new org.apache.commons.math.FunctionEvaluationException((double) ' ', "org.apache.commons.math.ConvergenceException: org.apache.commons.math.ode.DerivativeException: hi!", (java.lang.Throwable) functionEvaluationException84);
        derivativeException76.addSuppressed((java.lang.Throwable) functionEvaluationException85);
        org.apache.commons.math.ConvergenceException convergenceException87 = new org.apache.commons.math.ConvergenceException("org.apache.commons.math.ConvergenceException: org.apache.commons.math.ode.DerivativeException: hi!", (java.lang.Object[]) strArray69, (java.lang.Throwable) derivativeException76);
        java.lang.String str88 = convergenceException87.getPattern();
        org.apache.commons.math.ConvergenceException convergenceException89 = new org.apache.commons.math.ConvergenceException((java.lang.Throwable) convergenceException87);
        convergenceException62.addSuppressed((java.lang.Throwable) convergenceException87);
        org.junit.Assert.assertNotNull(strArray14);
        org.junit.Assert.assertNotNull(strArray27);
        org.junit.Assert.assertNotNull(objArray31);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray31), "[hi!]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray31), "[hi!]");
        org.junit.Assert.assertEquals("'" + str33 + "' != '" + "org.apache.commons.math.ConvergenceException: " + "'", str33, "org.apache.commons.math.ConvergenceException: ");
        org.junit.Assert.assertNotNull(throwableArray40);
        org.junit.Assert.assertNotNull(objArray49);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray49), "[97.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray49), "[97.0]");
        org.junit.Assert.assertNotNull(throwableArray50);
        org.junit.Assert.assertNotNull(strArray53);
        org.junit.Assert.assertNotNull(throwableArray60);
        org.junit.Assert.assertNotNull(strArray69);
        org.junit.Assert.assertNotNull(throwableArray75);
        org.junit.Assert.assertEquals("'" + str77 + "' != '" + "Evaluation failed for argument = 97" + "'", str77, "Evaluation failed for argument = 97");
        org.junit.Assert.assertEquals("'" + str78 + "' != '" + "Evaluation failed for argument = 97" + "'", str78, "Evaluation failed for argument = 97");
        org.junit.Assert.assertEquals("'" + str88 + "' != '" + "org.apache.commons.math.ConvergenceException: org.apache.commons.math.ode.DerivativeException: hi!" + "'", str88, "org.apache.commons.math.ConvergenceException: org.apache.commons.math.ode.DerivativeException: hi!");
    }

    @Test
    public void test16014() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest32.test16014");
        java.lang.Object[] objArray2 = new java.lang.Object[] {};
        org.apache.commons.math.ode.IntegratorException integratorException3 = new org.apache.commons.math.ode.IntegratorException("hi!", objArray2);
        java.lang.Throwable[] throwableArray4 = integratorException3.getSuppressed();
        org.apache.commons.math.ConvergenceException convergenceException5 = new org.apache.commons.math.ConvergenceException((java.lang.Throwable) integratorException3);
        java.lang.Object[] objArray6 = convergenceException5.getArguments();
        org.apache.commons.math.FunctionEvaluationException functionEvaluationException9 = new org.apache.commons.math.FunctionEvaluationException((double) 0.0f, "org.apache.commons.math.ode.DerivativeException: org.apache.commons.math.ConvergenceException: org.apache.commons.math.FunctionEvaluationException: org.apache.commons.math.ode.DerivativeException: org.apache.commons.math.ode.DerivativeException: hi!");
        org.apache.commons.math.ConvergenceException convergenceException10 = new org.apache.commons.math.ConvergenceException("org.apache.commons.math.FunctionEvaluationException: org.apache.commons.math.FunctionEvaluationException: org.apache.commons.math.ode.DerivativeException: org.apache.commons.math.ode.DerivativeException: org.apache.commons.math.FunctionEvaluationException: org.apache.commons.math.ode.DerivativeException: hi!", objArray6, (java.lang.Throwable) functionEvaluationException9);
        org.junit.Assert.assertNotNull(objArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray2), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray2), "[]");
        org.junit.Assert.assertNotNull(throwableArray4);
        org.junit.Assert.assertNotNull(objArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray6), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray6), "[]");
    }

    @Test
    public void test16015() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest32.test16015");
        java.lang.String[] strArray9 = new java.lang.String[] { "hi!" };
        org.apache.commons.math.ode.DerivativeException derivativeException10 = new org.apache.commons.math.ode.DerivativeException("hi!", strArray9);
        org.apache.commons.math.FunctionEvaluationException functionEvaluationException11 = new org.apache.commons.math.FunctionEvaluationException((double) (byte) 100, "", (java.lang.Object[]) strArray9);
        org.apache.commons.math.FunctionEvaluationException functionEvaluationException14 = new org.apache.commons.math.FunctionEvaluationException((double) 'a');
        org.apache.commons.math.FunctionEvaluationException functionEvaluationException17 = new org.apache.commons.math.FunctionEvaluationException((double) 'a');
        org.apache.commons.math.ConvergenceException convergenceException18 = new org.apache.commons.math.ConvergenceException("hi!", (java.lang.Throwable) functionEvaluationException17);
        functionEvaluationException14.addSuppressed((java.lang.Throwable) convergenceException18);
        org.apache.commons.math.ConvergenceException convergenceException20 = new org.apache.commons.math.ConvergenceException("", (java.lang.Throwable) convergenceException18);
        java.lang.String str21 = convergenceException20.getPattern();
        org.apache.commons.math.ConvergenceException convergenceException22 = new org.apache.commons.math.ConvergenceException("Evaluation failed for argument = {0}", (java.lang.Object[]) strArray9, (java.lang.Throwable) convergenceException20);
        java.lang.Throwable[] throwableArray23 = convergenceException22.getSuppressed();
        org.apache.commons.math.ConvergenceException convergenceException24 = new org.apache.commons.math.ConvergenceException("org.apache.commons.math.ode.IntegratorException: org.apache.commons.math.ConvergenceException: org.apache.commons.math.ConvergenceException: hi!", (java.lang.Object[]) throwableArray23);
        org.apache.commons.math.FunctionEvaluationException functionEvaluationException30 = new org.apache.commons.math.FunctionEvaluationException((double) 'a');
        java.lang.Throwable[] throwableArray31 = functionEvaluationException30.getSuppressed();
        org.apache.commons.math.FunctionEvaluationException functionEvaluationException33 = new org.apache.commons.math.FunctionEvaluationException((double) 'a');
        org.apache.commons.math.FunctionEvaluationException functionEvaluationException36 = new org.apache.commons.math.FunctionEvaluationException((double) 'a');
        org.apache.commons.math.ConvergenceException convergenceException37 = new org.apache.commons.math.ConvergenceException("hi!", (java.lang.Throwable) functionEvaluationException36);
        functionEvaluationException33.addSuppressed((java.lang.Throwable) convergenceException37);
        org.apache.commons.math.FunctionEvaluationException functionEvaluationException39 = new org.apache.commons.math.FunctionEvaluationException((double) (byte) -1, "org.apache.commons.math.ode.DerivativeException: hi!", (java.lang.Object[]) throwableArray31, (java.lang.Throwable) functionEvaluationException33);
        java.lang.Object[] objArray40 = functionEvaluationException33.getArguments();
        org.apache.commons.math.ConvergenceException convergenceException41 = new org.apache.commons.math.ConvergenceException("hi!", objArray40);
        java.lang.Object[] objArray45 = new java.lang.Object[] { 10.0d };
        org.apache.commons.math.FunctionEvaluationException functionEvaluationException48 = new org.apache.commons.math.FunctionEvaluationException((double) 'a');
        org.apache.commons.math.ConvergenceException convergenceException49 = new org.apache.commons.math.ConvergenceException("hi!", (java.lang.Throwable) functionEvaluationException48);
        org.apache.commons.math.FunctionEvaluationException functionEvaluationException50 = new org.apache.commons.math.FunctionEvaluationException((double) 0L, "org.apache.commons.math.ode.DerivativeException: hi!", objArray45, (java.lang.Throwable) convergenceException49);
        org.apache.commons.math.ConvergenceException convergenceException51 = new org.apache.commons.math.ConvergenceException("", objArray40, (java.lang.Throwable) convergenceException49);
        java.lang.Object[] objArray54 = new java.lang.Object[] {};
        org.apache.commons.math.ode.IntegratorException integratorException55 = new org.apache.commons.math.ode.IntegratorException("hi!", objArray54);
        java.lang.Throwable[] throwableArray56 = integratorException55.getSuppressed();
        org.apache.commons.math.ConvergenceException convergenceException57 = new org.apache.commons.math.ConvergenceException((java.lang.Throwable) integratorException55);
        java.lang.Object[] objArray58 = convergenceException57.getArguments();
        org.apache.commons.math.FunctionEvaluationException functionEvaluationException59 = new org.apache.commons.math.FunctionEvaluationException((double) (byte) 0, (java.lang.Throwable) convergenceException57);
        convergenceException51.addSuppressed((java.lang.Throwable) convergenceException57);
        org.apache.commons.math.ConvergenceException convergenceException61 = new org.apache.commons.math.ConvergenceException("org.apache.commons.math.FunctionEvaluationException: Evaluation failed for argument = 1", (java.lang.Object[]) throwableArray23, (java.lang.Throwable) convergenceException57);
        java.lang.Throwable throwable62 = null;
        org.apache.commons.math.FunctionEvaluationException functionEvaluationException63 = new org.apache.commons.math.FunctionEvaluationException(0.0d, "org.apache.commons.math.ConvergenceException: org.apache.commons.math.FunctionEvaluationException: org.apache.commons.math.ode.IntegratorException: org.apache.commons.math.FunctionEvaluationException: Evaluation failed for argument = 97", (java.lang.Object[]) throwableArray23, throwable62);
        double double64 = functionEvaluationException63.getArgument();
        org.apache.commons.math.ode.DerivativeException derivativeException65 = new org.apache.commons.math.ode.DerivativeException((java.lang.Throwable) functionEvaluationException63);
        org.junit.Assert.assertNotNull(strArray9);
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "" + "'", str21, "");
        org.junit.Assert.assertNotNull(throwableArray23);
        org.junit.Assert.assertNotNull(throwableArray31);
        org.junit.Assert.assertNotNull(objArray40);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray40), "[97.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray40), "[97.0]");
        org.junit.Assert.assertNotNull(objArray45);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray45), "[10.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray45), "[10.0]");
        org.junit.Assert.assertNotNull(objArray54);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray54), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray54), "[]");
        org.junit.Assert.assertNotNull(throwableArray56);
        org.junit.Assert.assertNotNull(objArray58);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray58), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray58), "[]");
        org.junit.Assert.assertTrue("'" + double64 + "' != '" + 0.0d + "'", double64 == 0.0d);
    }

    @Test
    public void test16016() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest32.test16016");
        org.apache.commons.math.FunctionEvaluationException functionEvaluationException4 = new org.apache.commons.math.FunctionEvaluationException((double) 'a');
        org.apache.commons.math.ConvergenceException convergenceException5 = new org.apache.commons.math.ConvergenceException("hi!", (java.lang.Throwable) functionEvaluationException4);
        java.lang.Object[] objArray6 = convergenceException5.getArguments();
        org.apache.commons.math.FunctionEvaluationException functionEvaluationException11 = new org.apache.commons.math.FunctionEvaluationException((double) 'a');
        org.apache.commons.math.FunctionEvaluationException functionEvaluationException14 = new org.apache.commons.math.FunctionEvaluationException((double) 'a');
        org.apache.commons.math.ConvergenceException convergenceException15 = new org.apache.commons.math.ConvergenceException("hi!", (java.lang.Throwable) functionEvaluationException14);
        functionEvaluationException11.addSuppressed((java.lang.Throwable) convergenceException15);
        java.lang.Object[] objArray18 = new java.lang.Object[] { (byte) 1, functionEvaluationException11, 100.0d };
        org.apache.commons.math.FunctionEvaluationException functionEvaluationException19 = new org.apache.commons.math.FunctionEvaluationException((double) (byte) -1, "", objArray18);
        org.apache.commons.math.FunctionEvaluationException functionEvaluationException20 = new org.apache.commons.math.FunctionEvaluationException((double) 1.0f, "", objArray6, (java.lang.Throwable) functionEvaluationException19);
        org.apache.commons.math.FunctionEvaluationException functionEvaluationException23 = new org.apache.commons.math.FunctionEvaluationException((double) 100.0f, "org.apache.commons.math.ConvergenceException: ");
        functionEvaluationException20.addSuppressed((java.lang.Throwable) functionEvaluationException23);
        org.junit.Assert.assertNotNull(objArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray6), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray6), "[]");
        org.junit.Assert.assertNotNull(objArray18);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray18), "[1, org.apache.commons.math.FunctionEvaluationException: Evaluation failed for argument = 97, 100.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray18), "[1, org.apache.commons.math.FunctionEvaluationException: Evaluation failed for argument = 97, 100.0]");
    }

    @Test
    public void test16017() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest32.test16017");
        java.lang.Object[] objArray13 = new java.lang.Object[] { 10.0d };
        org.apache.commons.math.FunctionEvaluationException functionEvaluationException16 = new org.apache.commons.math.FunctionEvaluationException((double) 'a');
        org.apache.commons.math.ConvergenceException convergenceException17 = new org.apache.commons.math.ConvergenceException("hi!", (java.lang.Throwable) functionEvaluationException16);
        org.apache.commons.math.FunctionEvaluationException functionEvaluationException18 = new org.apache.commons.math.FunctionEvaluationException((double) 0L, "org.apache.commons.math.ode.DerivativeException: hi!", objArray13, (java.lang.Throwable) convergenceException17);
        org.apache.commons.math.ConvergenceException convergenceException19 = new org.apache.commons.math.ConvergenceException("org.apache.commons.math.ode.DerivativeException: hi!", objArray13);
        org.apache.commons.math.FunctionEvaluationException functionEvaluationException22 = new org.apache.commons.math.FunctionEvaluationException((double) 'a');
        org.apache.commons.math.FunctionEvaluationException functionEvaluationException25 = new org.apache.commons.math.FunctionEvaluationException((double) 'a');
        org.apache.commons.math.ConvergenceException convergenceException26 = new org.apache.commons.math.ConvergenceException("hi!", (java.lang.Throwable) functionEvaluationException25);
        functionEvaluationException22.addSuppressed((java.lang.Throwable) convergenceException26);
        org.apache.commons.math.ConvergenceException convergenceException28 = new org.apache.commons.math.ConvergenceException((java.lang.Throwable) functionEvaluationException22);
        org.apache.commons.math.FunctionEvaluationException functionEvaluationException29 = new org.apache.commons.math.FunctionEvaluationException((double) (short) 10, (java.lang.Throwable) convergenceException28);
        org.apache.commons.math.ConvergenceException convergenceException30 = new org.apache.commons.math.ConvergenceException("org.apache.commons.math.FunctionEvaluationException: ", objArray13, (java.lang.Throwable) functionEvaluationException29);
        org.apache.commons.math.FunctionEvaluationException functionEvaluationException31 = new org.apache.commons.math.FunctionEvaluationException(0.0d, "org.apache.commons.math.ConvergenceException: hi!", objArray13);
        org.apache.commons.math.ConvergenceException convergenceException32 = new org.apache.commons.math.ConvergenceException("org.apache.commons.math.ode.DerivativeException: org.apache.commons.math.FunctionEvaluationException: org.apache.commons.math.ode.DerivativeException: hi!", (java.lang.Throwable) functionEvaluationException31);
        java.lang.Throwable[] throwableArray33 = convergenceException32.getSuppressed();
        org.apache.commons.math.FunctionEvaluationException functionEvaluationException34 = new org.apache.commons.math.FunctionEvaluationException((double) (-1L), "org.apache.commons.math.FunctionEvaluationException: org.apache.commons.math.ode.DerivativeException: hi!", (java.lang.Object[]) throwableArray33);
        org.apache.commons.math.ConvergenceException convergenceException35 = new org.apache.commons.math.ConvergenceException((java.lang.Throwable) functionEvaluationException34);
        java.lang.Throwable[] throwableArray36 = functionEvaluationException34.getSuppressed();
        org.apache.commons.math.ConvergenceException convergenceException37 = new org.apache.commons.math.ConvergenceException("org.apache.commons.math.ConvergenceException: org.apache.commons.math.ConvergenceException: hi!", (java.lang.Object[]) throwableArray36);
        java.lang.String[] strArray42 = new java.lang.String[] { "hi!" };
        org.apache.commons.math.ode.DerivativeException derivativeException43 = new org.apache.commons.math.ode.DerivativeException("hi!", strArray42);
        java.lang.String[] strArray48 = new java.lang.String[] { "hi!" };
        org.apache.commons.math.ode.DerivativeException derivativeException49 = new org.apache.commons.math.ode.DerivativeException("hi!", strArray48);
        org.apache.commons.math.ConvergenceException convergenceException50 = new org.apache.commons.math.ConvergenceException("org.apache.commons.math.ode.DerivativeException: hi!", (java.lang.Throwable) derivativeException49);
        org.apache.commons.math.FunctionEvaluationException functionEvaluationException51 = new org.apache.commons.math.FunctionEvaluationException((double) 100, (java.lang.Throwable) convergenceException50);
        java.lang.String str52 = functionEvaluationException51.getPattern();
        org.apache.commons.math.FunctionEvaluationException functionEvaluationException53 = new org.apache.commons.math.FunctionEvaluationException((double) 0.0f, "hi!", (java.lang.Object[]) strArray42, (java.lang.Throwable) functionEvaluationException51);
        java.lang.Object[] objArray54 = functionEvaluationException51.getArguments();
        double double55 = functionEvaluationException51.getArgument();
        double double56 = functionEvaluationException51.getArgument();
        org.apache.commons.math.ConvergenceException convergenceException57 = new org.apache.commons.math.ConvergenceException((java.lang.Throwable) functionEvaluationException51);
        org.apache.commons.math.FunctionEvaluationException functionEvaluationException58 = new org.apache.commons.math.FunctionEvaluationException(3.0d, "org.apache.commons.math.FunctionEvaluationException", (java.lang.Object[]) throwableArray36, (java.lang.Throwable) functionEvaluationException51);
        org.junit.Assert.assertNotNull(objArray13);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray13), "[10.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray13), "[10.0]");
        org.junit.Assert.assertNotNull(throwableArray33);
        org.junit.Assert.assertNotNull(throwableArray36);
        org.junit.Assert.assertNotNull(strArray42);
        org.junit.Assert.assertNotNull(strArray48);
        org.junit.Assert.assertEquals("'" + str52 + "' != '" + "org.apache.commons.math.ode.DerivativeException: hi!" + "'", str52, "org.apache.commons.math.ode.DerivativeException: hi!");
        org.junit.Assert.assertNotNull(objArray54);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray54), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray54), "[]");
        org.junit.Assert.assertTrue("'" + double55 + "' != '" + 100.0d + "'", double55 == 100.0d);
        org.junit.Assert.assertTrue("'" + double56 + "' != '" + 100.0d + "'", double56 == 100.0d);
    }

    @Test
    public void test16018() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest32.test16018");
        java.lang.String[] strArray15 = new java.lang.String[] { "hi!" };
        org.apache.commons.math.ode.DerivativeException derivativeException16 = new org.apache.commons.math.ode.DerivativeException("hi!", strArray15);
        org.apache.commons.math.FunctionEvaluationException functionEvaluationException17 = new org.apache.commons.math.FunctionEvaluationException((double) (byte) 100, "", (java.lang.Object[]) strArray15);
        org.apache.commons.math.ConvergenceException convergenceException18 = new org.apache.commons.math.ConvergenceException("hi!", (java.lang.Object[]) strArray15);
        org.apache.commons.math.ode.DerivativeException derivativeException19 = new org.apache.commons.math.ode.DerivativeException("", strArray15);
        org.apache.commons.math.ode.DerivativeException derivativeException20 = new org.apache.commons.math.ode.DerivativeException("org.apache.commons.math.FunctionEvaluationException: Evaluation failed for argument = 97", strArray15);
        org.apache.commons.math.ode.DerivativeException derivativeException21 = new org.apache.commons.math.ode.DerivativeException("org.apache.commons.math.ode.IntegratorException: Evaluation failed for argument = {0}", strArray15);
        org.apache.commons.math.ode.IntegratorException integratorException22 = new org.apache.commons.math.ode.IntegratorException("org.apache.commons.math.ConvergenceException: hi!", (java.lang.Object[]) strArray15);
        org.apache.commons.math.FunctionEvaluationException functionEvaluationException23 = new org.apache.commons.math.FunctionEvaluationException((double) 10.0f, "org.apache.commons.math.FunctionEvaluationException: org.apache.commons.math.ode.IntegratorException: hi!", (java.lang.Object[]) strArray15);
        org.apache.commons.math.ode.DerivativeException derivativeException24 = new org.apache.commons.math.ode.DerivativeException("org.apache.commons.math.ode.IntegratorException: org.apache.commons.math.FunctionEvaluationException: org.apache.commons.math.ode.DerivativeException: org.apache.commons.math.ode.DerivativeException: hi!", strArray15);
        org.apache.commons.math.ode.IntegratorException integratorException25 = new org.apache.commons.math.ode.IntegratorException("org.apache.commons.math.ode.DerivativeException: org.apache.commons.math.ode.IntegratorException: Evaluation failed for argument = 97", (java.lang.Object[]) strArray15);
        org.apache.commons.math.FunctionEvaluationException functionEvaluationException26 = new org.apache.commons.math.FunctionEvaluationException(3.0d, "org.apache.commons.math.FunctionEvaluationException: ", (java.lang.Object[]) strArray15);
        org.junit.Assert.assertNotNull(strArray15);
    }

    @Test
    public void test16019() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest32.test16019");
        java.lang.String[] strArray16 = new java.lang.String[] { "hi!" };
        org.apache.commons.math.ode.DerivativeException derivativeException17 = new org.apache.commons.math.ode.DerivativeException("hi!", strArray16);
        org.apache.commons.math.FunctionEvaluationException functionEvaluationException18 = new org.apache.commons.math.FunctionEvaluationException((double) (byte) 100, "", (java.lang.Object[]) strArray16);
        org.apache.commons.math.ConvergenceException convergenceException19 = new org.apache.commons.math.ConvergenceException("hi!", (java.lang.Object[]) strArray16);
        org.apache.commons.math.ode.IntegratorException integratorException20 = new org.apache.commons.math.ode.IntegratorException("org.apache.commons.math.ConvergenceException: ", (java.lang.Object[]) strArray16);
        org.apache.commons.math.ode.DerivativeException derivativeException21 = new org.apache.commons.math.ode.DerivativeException("org.apache.commons.math.ConvergenceException: ", strArray16);
        org.apache.commons.math.ode.DerivativeException derivativeException22 = new org.apache.commons.math.ode.DerivativeException("org.apache.commons.math.ConvergenceException: ", strArray16);
        java.lang.Object[] objArray24 = new java.lang.Object[] {};
        org.apache.commons.math.ode.IntegratorException integratorException25 = new org.apache.commons.math.ode.IntegratorException("hi!", objArray24);
        java.lang.Object[] objArray26 = integratorException25.getArguments();
        org.apache.commons.math.FunctionEvaluationException functionEvaluationException27 = new org.apache.commons.math.FunctionEvaluationException((double) 10, "org.apache.commons.math.ConvergenceException: org.apache.commons.math.FunctionEvaluationException: ", (java.lang.Object[]) strArray16, (java.lang.Throwable) integratorException25);
        org.apache.commons.math.FunctionEvaluationException functionEvaluationException28 = new org.apache.commons.math.FunctionEvaluationException((double) '#', "org.apache.commons.math.FunctionEvaluationException: hi!", (java.lang.Object[]) strArray16);
        org.apache.commons.math.FunctionEvaluationException functionEvaluationException33 = new org.apache.commons.math.FunctionEvaluationException((double) 10.0f, "Evaluation failed for argument = 97");
        org.apache.commons.math.ConvergenceException convergenceException34 = new org.apache.commons.math.ConvergenceException("hi!", (java.lang.Throwable) functionEvaluationException33);
        org.apache.commons.math.FunctionEvaluationException functionEvaluationException35 = new org.apache.commons.math.FunctionEvaluationException(Double.NaN, (java.lang.Throwable) functionEvaluationException33);
        org.apache.commons.math.ode.IntegratorException integratorException36 = new org.apache.commons.math.ode.IntegratorException((java.lang.Throwable) functionEvaluationException35);
        org.apache.commons.math.FunctionEvaluationException functionEvaluationException37 = new org.apache.commons.math.FunctionEvaluationException((double) (short) 1, "org.apache.commons.math.ConvergenceException: Evaluation failed for argument = 1", (java.lang.Object[]) strArray16, (java.lang.Throwable) functionEvaluationException35);
        org.apache.commons.math.FunctionEvaluationException functionEvaluationException38 = new org.apache.commons.math.FunctionEvaluationException((double) ' ', "org.apache.commons.math.ConvergenceException: org.apache.commons.math.ConvergenceException: hi!", (java.lang.Throwable) functionEvaluationException35);
        java.lang.String str39 = functionEvaluationException35.toString();
        org.junit.Assert.assertNotNull(strArray16);
        org.junit.Assert.assertNotNull(objArray24);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray24), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray24), "[]");
        org.junit.Assert.assertNotNull(objArray26);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray26), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray26), "[]");
        org.junit.Assert.assertEquals("'" + str39 + "' != '" + "org.apache.commons.math.FunctionEvaluationException: Evaluation failed for argument = 97" + "'", str39, "org.apache.commons.math.FunctionEvaluationException: Evaluation failed for argument = 97");
    }

    @Test
    public void test16020() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest32.test16020");
        java.lang.String[] strArray6 = new java.lang.String[] { "hi!" };
        org.apache.commons.math.ode.DerivativeException derivativeException7 = new org.apache.commons.math.ode.DerivativeException("hi!", strArray6);
        org.apache.commons.math.ode.DerivativeException derivativeException8 = new org.apache.commons.math.ode.DerivativeException((java.lang.Throwable) derivativeException7);
        org.apache.commons.math.ode.IntegratorException integratorException9 = new org.apache.commons.math.ode.IntegratorException((java.lang.Throwable) derivativeException7);
        org.apache.commons.math.FunctionEvaluationException functionEvaluationException11 = new org.apache.commons.math.FunctionEvaluationException((double) 'a');
        java.lang.Throwable[] throwableArray12 = functionEvaluationException11.getSuppressed();
        org.apache.commons.math.ode.DerivativeException derivativeException13 = new org.apache.commons.math.ode.DerivativeException((java.lang.Throwable) functionEvaluationException11);
        derivativeException7.addSuppressed((java.lang.Throwable) functionEvaluationException11);
        java.lang.Throwable[] throwableArray15 = derivativeException7.getSuppressed();
        java.lang.String[] strArray25 = new java.lang.String[] { "hi!" };
        org.apache.commons.math.ode.DerivativeException derivativeException26 = new org.apache.commons.math.ode.DerivativeException("hi!", strArray25);
        org.apache.commons.math.FunctionEvaluationException functionEvaluationException27 = new org.apache.commons.math.FunctionEvaluationException((double) (byte) 100, "", (java.lang.Object[]) strArray25);
        org.apache.commons.math.ConvergenceException convergenceException28 = new org.apache.commons.math.ConvergenceException("hi!", (java.lang.Object[]) strArray25);
        org.apache.commons.math.ode.IntegratorException integratorException29 = new org.apache.commons.math.ode.IntegratorException("org.apache.commons.math.ConvergenceException: ", (java.lang.Object[]) strArray25);
        org.apache.commons.math.ode.DerivativeException derivativeException30 = new org.apache.commons.math.ode.DerivativeException("org.apache.commons.math.ConvergenceException: ", strArray25);
        org.apache.commons.math.ode.DerivativeException derivativeException31 = new org.apache.commons.math.ode.DerivativeException("org.apache.commons.math.ConvergenceException: ", strArray25);
        org.apache.commons.math.FunctionEvaluationException functionEvaluationException33 = new org.apache.commons.math.FunctionEvaluationException((double) 0.0f);
        org.apache.commons.math.ConvergenceException convergenceException34 = new org.apache.commons.math.ConvergenceException("org.apache.commons.math.FunctionEvaluationException: org.apache.commons.math.ode.DerivativeException: hi!", (java.lang.Object[]) strArray25, (java.lang.Throwable) functionEvaluationException33);
        org.apache.commons.math.FunctionEvaluationException functionEvaluationException35 = new org.apache.commons.math.FunctionEvaluationException((double) (short) 100, "org.apache.commons.math.ConvergenceException: org.apache.commons.math.FunctionEvaluationException: ", (java.lang.Object[]) throwableArray15, (java.lang.Throwable) functionEvaluationException33);
        org.apache.commons.math.ConvergenceException convergenceException36 = new org.apache.commons.math.ConvergenceException("", (java.lang.Throwable) functionEvaluationException35);
        java.lang.Throwable[] throwableArray37 = functionEvaluationException35.getSuppressed();
        org.apache.commons.math.ode.IntegratorException integratorException38 = new org.apache.commons.math.ode.IntegratorException("org.apache.commons.math.ConvergenceException: org.apache.commons.math.FunctionEvaluationException: org.apache.commons.math.FunctionEvaluationException: Evaluation failed for argument = 97", (java.lang.Object[]) throwableArray37);
        org.apache.commons.math.ode.IntegratorException integratorException39 = new org.apache.commons.math.ode.IntegratorException((java.lang.Throwable) integratorException38);
        org.junit.Assert.assertNotNull(strArray6);
        org.junit.Assert.assertNotNull(throwableArray12);
        org.junit.Assert.assertNotNull(throwableArray15);
        org.junit.Assert.assertNotNull(strArray25);
        org.junit.Assert.assertNotNull(throwableArray37);
    }

    @Test
    public void test16021() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest32.test16021");
        org.apache.commons.math.FunctionEvaluationException functionEvaluationException12 = new org.apache.commons.math.FunctionEvaluationException((double) 'a');
        java.lang.Throwable[] throwableArray13 = functionEvaluationException12.getSuppressed();
        org.apache.commons.math.FunctionEvaluationException functionEvaluationException15 = new org.apache.commons.math.FunctionEvaluationException((double) 'a');
        org.apache.commons.math.FunctionEvaluationException functionEvaluationException18 = new org.apache.commons.math.FunctionEvaluationException((double) 'a');
        org.apache.commons.math.ConvergenceException convergenceException19 = new org.apache.commons.math.ConvergenceException("hi!", (java.lang.Throwable) functionEvaluationException18);
        functionEvaluationException15.addSuppressed((java.lang.Throwable) convergenceException19);
        org.apache.commons.math.FunctionEvaluationException functionEvaluationException21 = new org.apache.commons.math.FunctionEvaluationException((double) (byte) -1, "org.apache.commons.math.ode.DerivativeException: hi!", (java.lang.Object[]) throwableArray13, (java.lang.Throwable) functionEvaluationException15);
        java.lang.Throwable throwable22 = null;
        org.apache.commons.math.ConvergenceException convergenceException23 = new org.apache.commons.math.ConvergenceException(throwable22);
        org.apache.commons.math.ConvergenceException convergenceException24 = new org.apache.commons.math.ConvergenceException("org.apache.commons.math.FunctionEvaluationException: ", (java.lang.Object[]) throwableArray13, throwable22);
        org.apache.commons.math.ode.IntegratorException integratorException25 = new org.apache.commons.math.ode.IntegratorException("Evaluation failed for argument = {0}", (java.lang.Object[]) throwableArray13);
        org.apache.commons.math.FunctionEvaluationException functionEvaluationException26 = new org.apache.commons.math.FunctionEvaluationException(97.0d, "Evaluation failed for argument = 97", (java.lang.Object[]) throwableArray13);
        org.apache.commons.math.FunctionEvaluationException functionEvaluationException30 = new org.apache.commons.math.FunctionEvaluationException((double) (byte) -1, "org.apache.commons.math.ConvergenceException: ");
        double double31 = functionEvaluationException30.getArgument();
        org.apache.commons.math.ConvergenceException convergenceException32 = new org.apache.commons.math.ConvergenceException("org.apache.commons.math.ConvergenceException: Evaluation failed for argument = 97", (java.lang.Throwable) functionEvaluationException30);
        org.apache.commons.math.ConvergenceException convergenceException33 = new org.apache.commons.math.ConvergenceException("org.apache.commons.math.ode.IntegratorException: org.apache.commons.math.ConvergenceException: ", (java.lang.Object[]) throwableArray13, (java.lang.Throwable) functionEvaluationException30);
        org.apache.commons.math.FunctionEvaluationException functionEvaluationException34 = new org.apache.commons.math.FunctionEvaluationException(0.0d, "org.apache.commons.math.ode.DerivativeException: org.apache.commons.math.FunctionEvaluationException", (java.lang.Object[]) throwableArray13);
        java.lang.Object[] objArray43 = new java.lang.Object[] { 10.0d };
        org.apache.commons.math.FunctionEvaluationException functionEvaluationException46 = new org.apache.commons.math.FunctionEvaluationException((double) 'a');
        org.apache.commons.math.ConvergenceException convergenceException47 = new org.apache.commons.math.ConvergenceException("hi!", (java.lang.Throwable) functionEvaluationException46);
        org.apache.commons.math.FunctionEvaluationException functionEvaluationException48 = new org.apache.commons.math.FunctionEvaluationException((double) 0L, "org.apache.commons.math.ode.DerivativeException: hi!", objArray43, (java.lang.Throwable) convergenceException47);
        org.apache.commons.math.FunctionEvaluationException functionEvaluationException49 = new org.apache.commons.math.FunctionEvaluationException(10.0d, "org.apache.commons.math.ConvergenceException: ", objArray43);
        org.apache.commons.math.FunctionEvaluationException functionEvaluationException50 = new org.apache.commons.math.FunctionEvaluationException((double) 10, "org.apache.commons.math.FunctionEvaluationException: ", (java.lang.Throwable) functionEvaluationException49);
        org.apache.commons.math.FunctionEvaluationException functionEvaluationException51 = new org.apache.commons.math.FunctionEvaluationException((double) (short) -1, (java.lang.Throwable) functionEvaluationException49);
        org.apache.commons.math.FunctionEvaluationException functionEvaluationException52 = new org.apache.commons.math.FunctionEvaluationException((-1.0d), "", (java.lang.Object[]) throwableArray13, (java.lang.Throwable) functionEvaluationException51);
        double double53 = functionEvaluationException51.getArgument();
        java.lang.Throwable[] throwableArray54 = functionEvaluationException51.getSuppressed();
        org.junit.Assert.assertNotNull(throwableArray13);
        org.junit.Assert.assertTrue("'" + double31 + "' != '" + (-1.0d) + "'", double31 == (-1.0d));
        org.junit.Assert.assertNotNull(objArray43);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray43), "[10.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray43), "[10.0]");
        org.junit.Assert.assertTrue("'" + double53 + "' != '" + (-1.0d) + "'", double53 == (-1.0d));
        org.junit.Assert.assertNotNull(throwableArray54);
    }

    @Test
    public void test16022() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest32.test16022");
        java.lang.String[] strArray7 = new java.lang.String[] { "hi!" };
        org.apache.commons.math.ode.DerivativeException derivativeException8 = new org.apache.commons.math.ode.DerivativeException("hi!", strArray7);
        org.apache.commons.math.ode.DerivativeException derivativeException9 = new org.apache.commons.math.ode.DerivativeException((java.lang.Throwable) derivativeException8);
        org.apache.commons.math.ode.IntegratorException integratorException10 = new org.apache.commons.math.ode.IntegratorException((java.lang.Throwable) derivativeException8);
        org.apache.commons.math.FunctionEvaluationException functionEvaluationException12 = new org.apache.commons.math.FunctionEvaluationException((double) 'a');
        java.lang.Throwable[] throwableArray13 = functionEvaluationException12.getSuppressed();
        org.apache.commons.math.ode.DerivativeException derivativeException14 = new org.apache.commons.math.ode.DerivativeException((java.lang.Throwable) functionEvaluationException12);
        derivativeException8.addSuppressed((java.lang.Throwable) functionEvaluationException12);
        java.lang.Throwable[] throwableArray16 = derivativeException8.getSuppressed();
        java.lang.String[] strArray26 = new java.lang.String[] { "hi!" };
        org.apache.commons.math.ode.DerivativeException derivativeException27 = new org.apache.commons.math.ode.DerivativeException("hi!", strArray26);
        org.apache.commons.math.FunctionEvaluationException functionEvaluationException28 = new org.apache.commons.math.FunctionEvaluationException((double) (byte) 100, "", (java.lang.Object[]) strArray26);
        org.apache.commons.math.ConvergenceException convergenceException29 = new org.apache.commons.math.ConvergenceException("hi!", (java.lang.Object[]) strArray26);
        org.apache.commons.math.ode.IntegratorException integratorException30 = new org.apache.commons.math.ode.IntegratorException("org.apache.commons.math.ConvergenceException: ", (java.lang.Object[]) strArray26);
        org.apache.commons.math.ode.DerivativeException derivativeException31 = new org.apache.commons.math.ode.DerivativeException("org.apache.commons.math.ConvergenceException: ", strArray26);
        org.apache.commons.math.ode.DerivativeException derivativeException32 = new org.apache.commons.math.ode.DerivativeException("org.apache.commons.math.ConvergenceException: ", strArray26);
        org.apache.commons.math.FunctionEvaluationException functionEvaluationException34 = new org.apache.commons.math.FunctionEvaluationException((double) 0.0f);
        org.apache.commons.math.ConvergenceException convergenceException35 = new org.apache.commons.math.ConvergenceException("org.apache.commons.math.FunctionEvaluationException: org.apache.commons.math.ode.DerivativeException: hi!", (java.lang.Object[]) strArray26, (java.lang.Throwable) functionEvaluationException34);
        org.apache.commons.math.FunctionEvaluationException functionEvaluationException36 = new org.apache.commons.math.FunctionEvaluationException((double) (short) 100, "org.apache.commons.math.ConvergenceException: org.apache.commons.math.FunctionEvaluationException: ", (java.lang.Object[]) throwableArray16, (java.lang.Throwable) functionEvaluationException34);
        org.apache.commons.math.ConvergenceException convergenceException37 = new org.apache.commons.math.ConvergenceException("", (java.lang.Throwable) functionEvaluationException36);
        java.lang.String str38 = functionEvaluationException36.getPattern();
        org.apache.commons.math.FunctionEvaluationException functionEvaluationException39 = new org.apache.commons.math.FunctionEvaluationException(2.0d, "Evaluation failed for argument = {0}", (java.lang.Throwable) functionEvaluationException36);
        double double40 = functionEvaluationException36.getArgument();
        org.apache.commons.math.FunctionEvaluationException functionEvaluationException42 = new org.apache.commons.math.FunctionEvaluationException((double) '4');
        functionEvaluationException36.addSuppressed((java.lang.Throwable) functionEvaluationException42);
        double double44 = functionEvaluationException36.getArgument();
        org.junit.Assert.assertNotNull(strArray7);
        org.junit.Assert.assertNotNull(throwableArray13);
        org.junit.Assert.assertNotNull(throwableArray16);
        org.junit.Assert.assertNotNull(strArray26);
        org.junit.Assert.assertEquals("'" + str38 + "' != '" + "org.apache.commons.math.ConvergenceException: org.apache.commons.math.FunctionEvaluationException: " + "'", str38, "org.apache.commons.math.ConvergenceException: org.apache.commons.math.FunctionEvaluationException: ");
        org.junit.Assert.assertTrue("'" + double40 + "' != '" + 100.0d + "'", double40 == 100.0d);
        org.junit.Assert.assertTrue("'" + double44 + "' != '" + 100.0d + "'", double44 == 100.0d);
    }

    @Test
    public void test16023() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest32.test16023");
        org.apache.commons.math.FunctionEvaluationException functionEvaluationException2 = new org.apache.commons.math.FunctionEvaluationException((double) (-1), "org.apache.commons.math.ConvergenceException: org.apache.commons.math.ode.DerivativeException: ");
    }

    @Test
    public void test16024() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest32.test16024");
        java.lang.String[] strArray10 = new java.lang.String[] { "hi!" };
        org.apache.commons.math.ode.DerivativeException derivativeException11 = new org.apache.commons.math.ode.DerivativeException("hi!", strArray10);
        org.apache.commons.math.FunctionEvaluationException functionEvaluationException12 = new org.apache.commons.math.FunctionEvaluationException((double) 1, "hi!", (java.lang.Object[]) strArray10);
        java.lang.Throwable throwable15 = null;
        org.apache.commons.math.ConvergenceException convergenceException16 = new org.apache.commons.math.ConvergenceException("hi!", throwable15);
        org.apache.commons.math.ConvergenceException convergenceException17 = new org.apache.commons.math.ConvergenceException("hi!", (java.lang.Throwable) convergenceException16);
        org.apache.commons.math.ConvergenceException convergenceException18 = new org.apache.commons.math.ConvergenceException("org.apache.commons.math.ConvergenceException: org.apache.commons.math.FunctionEvaluationException: ", (java.lang.Object[]) strArray10, (java.lang.Throwable) convergenceException16);
        org.apache.commons.math.ode.DerivativeException derivativeException19 = new org.apache.commons.math.ode.DerivativeException("org.apache.commons.math.ode.IntegratorException: Evaluation failed for argument = 2", strArray10);
        org.apache.commons.math.ode.DerivativeException derivativeException20 = new org.apache.commons.math.ode.DerivativeException("", strArray10);
        org.apache.commons.math.FunctionEvaluationException functionEvaluationException21 = new org.apache.commons.math.FunctionEvaluationException(Double.NaN, "org.apache.commons.math.ConvergenceException: org.apache.commons.math.ode.DerivativeException: hi!", (java.lang.Throwable) derivativeException20);
        org.apache.commons.math.FunctionEvaluationException functionEvaluationException22 = new org.apache.commons.math.FunctionEvaluationException((double) 2, (java.lang.Throwable) functionEvaluationException21);
        java.lang.String str23 = functionEvaluationException21.toString();
        org.junit.Assert.assertNotNull(strArray10);
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "org.apache.commons.math.FunctionEvaluationException: org.apache.commons.math.ConvergenceException: org.apache.commons.math.ode.DerivativeException: hi!" + "'", str23, "org.apache.commons.math.FunctionEvaluationException: org.apache.commons.math.ConvergenceException: org.apache.commons.math.ode.DerivativeException: hi!");
    }

    @Test
    public void test16025() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest32.test16025");
        java.lang.Object[] objArray11 = new java.lang.Object[] { 10.0d };
        org.apache.commons.math.FunctionEvaluationException functionEvaluationException14 = new org.apache.commons.math.FunctionEvaluationException((double) 'a');
        org.apache.commons.math.ConvergenceException convergenceException15 = new org.apache.commons.math.ConvergenceException("hi!", (java.lang.Throwable) functionEvaluationException14);
        org.apache.commons.math.FunctionEvaluationException functionEvaluationException16 = new org.apache.commons.math.FunctionEvaluationException((double) 0L, "org.apache.commons.math.ode.DerivativeException: hi!", objArray11, (java.lang.Throwable) convergenceException15);
        org.apache.commons.math.ConvergenceException convergenceException17 = new org.apache.commons.math.ConvergenceException("org.apache.commons.math.ode.DerivativeException: hi!", objArray11);
        org.apache.commons.math.FunctionEvaluationException functionEvaluationException18 = new org.apache.commons.math.FunctionEvaluationException(Double.NaN, "hi!", objArray11);
        org.apache.commons.math.ode.IntegratorException integratorException19 = new org.apache.commons.math.ode.IntegratorException("org.apache.commons.math.ode.IntegratorException: Evaluation failed for argument = 97", objArray11);
        java.lang.Object[] objArray23 = new java.lang.Object[] {};
        org.apache.commons.math.ode.IntegratorException integratorException24 = new org.apache.commons.math.ode.IntegratorException("hi!", objArray23);
        java.lang.Throwable throwable26 = null;
        org.apache.commons.math.ode.DerivativeException derivativeException27 = new org.apache.commons.math.ode.DerivativeException(throwable26);
        java.lang.String[] strArray30 = new java.lang.String[] { "hi!" };
        org.apache.commons.math.ode.DerivativeException derivativeException31 = new org.apache.commons.math.ode.DerivativeException("hi!", strArray30);
        org.apache.commons.math.ode.DerivativeException derivativeException32 = new org.apache.commons.math.ode.DerivativeException((java.lang.Throwable) derivativeException31);
        org.apache.commons.math.ode.IntegratorException integratorException33 = new org.apache.commons.math.ode.IntegratorException((java.lang.Throwable) derivativeException31);
        derivativeException27.addSuppressed((java.lang.Throwable) integratorException33);
        org.apache.commons.math.ode.IntegratorException integratorException35 = new org.apache.commons.math.ode.IntegratorException((java.lang.Throwable) integratorException33);
        org.apache.commons.math.ConvergenceException convergenceException36 = new org.apache.commons.math.ConvergenceException("", (java.lang.Throwable) integratorException35);
        org.apache.commons.math.ConvergenceException convergenceException37 = new org.apache.commons.math.ConvergenceException("org.apache.commons.math.FunctionEvaluationException: org.apache.commons.math.ode.DerivativeException: hi!", objArray23, (java.lang.Throwable) integratorException35);
        java.lang.Object[] objArray38 = integratorException35.getArguments();
        org.apache.commons.math.FunctionEvaluationException functionEvaluationException40 = new org.apache.commons.math.FunctionEvaluationException((double) 'a');
        org.apache.commons.math.ode.IntegratorException integratorException41 = new org.apache.commons.math.ode.IntegratorException((java.lang.Throwable) functionEvaluationException40);
        org.apache.commons.math.ode.DerivativeException derivativeException42 = new org.apache.commons.math.ode.DerivativeException((java.lang.Throwable) functionEvaluationException40);
        org.apache.commons.math.ode.DerivativeException derivativeException43 = new org.apache.commons.math.ode.DerivativeException((java.lang.Throwable) functionEvaluationException40);
        org.apache.commons.math.ConvergenceException convergenceException44 = new org.apache.commons.math.ConvergenceException("org.apache.commons.math.ode.DerivativeException: org.apache.commons.math.ode.DerivativeException: hi!", objArray38, (java.lang.Throwable) derivativeException43);
        org.apache.commons.math.FunctionEvaluationException functionEvaluationException45 = new org.apache.commons.math.FunctionEvaluationException((double) 1L, "", objArray11, (java.lang.Throwable) derivativeException43);
        org.apache.commons.math.FunctionEvaluationException functionEvaluationException47 = new org.apache.commons.math.FunctionEvaluationException(97.0d);
        double double48 = functionEvaluationException47.getArgument();
        derivativeException43.addSuppressed((java.lang.Throwable) functionEvaluationException47);
        org.apache.commons.math.ode.DerivativeException derivativeException50 = new org.apache.commons.math.ode.DerivativeException((java.lang.Throwable) functionEvaluationException47);
        java.lang.Throwable[] throwableArray51 = functionEvaluationException47.getSuppressed();
        org.apache.commons.math.ConvergenceException convergenceException52 = new org.apache.commons.math.ConvergenceException("org.apache.commons.math.ConvergenceException: org.apache.commons.math.ConvergenceException: Evaluation failed for argument = 97", (java.lang.Object[]) throwableArray51);
        org.apache.commons.math.ode.IntegratorException integratorException53 = new org.apache.commons.math.ode.IntegratorException("org.apache.commons.math.FunctionEvaluationException: org.apache.commons.math.ConvergenceException: org.apache.commons.math.ConvergenceException: hi!", (java.lang.Object[]) throwableArray51);
        java.lang.Object[] objArray54 = integratorException53.getArguments();
        org.junit.Assert.assertNotNull(objArray11);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray11), "[10.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray11), "[10.0]");
        org.junit.Assert.assertNotNull(objArray23);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray23), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray23), "[]");
        org.junit.Assert.assertNotNull(strArray30);
        org.junit.Assert.assertNotNull(objArray38);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray38), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray38), "[]");
        org.junit.Assert.assertTrue("'" + double48 + "' != '" + 97.0d + "'", double48 == 97.0d);
        org.junit.Assert.assertNotNull(throwableArray51);
        org.junit.Assert.assertNotNull(objArray54);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray54), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray54), "[]");
    }

    @Test
    public void test16026() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest32.test16026");
        org.apache.commons.math.ode.SwitchingFunctionsHandler switchingFunctionsHandler0 = new org.apache.commons.math.ode.SwitchingFunctionsHandler();
        boolean boolean1 = switchingFunctionsHandler0.stop();
        org.apache.commons.math.ode.SwitchingFunctionsHandler switchingFunctionsHandler3 = new org.apache.commons.math.ode.SwitchingFunctionsHandler();
        double[] doubleArray7 = new double[] { (-1.0f), 1.0d };
        boolean boolean8 = switchingFunctionsHandler3.reset((double) (byte) 10, doubleArray7);
        double[] doubleArray14 = new double[] { 10, 0.0d, '4', 1.0d };
        boolean boolean15 = switchingFunctionsHandler3.reset((double) (-1), doubleArray14);
        boolean boolean16 = switchingFunctionsHandler0.reset(97.0d, doubleArray14);
        boolean boolean17 = switchingFunctionsHandler0.isEmpty();
        org.apache.commons.math.ode.StepInterpolator stepInterpolator18 = null;
        boolean boolean19 = switchingFunctionsHandler0.evaluateStep(stepInterpolator18);
        org.apache.commons.math.ode.SwitchingFunctionsHandler switchingFunctionsHandler21 = new org.apache.commons.math.ode.SwitchingFunctionsHandler();
        double[] doubleArray27 = new double[] { 3, (byte) 0, 100.0d, 100 };
        switchingFunctionsHandler21.stepAccepted((double) (short) 0, doubleArray27);
        switchingFunctionsHandler0.stepAccepted(0.0d, doubleArray27);
        org.apache.commons.math.ode.SwitchingFunctionsHandler switchingFunctionsHandler31 = new org.apache.commons.math.ode.SwitchingFunctionsHandler();
        double[] doubleArray35 = new double[] { (-1.0f), 1.0d };
        boolean boolean36 = switchingFunctionsHandler31.reset((double) (byte) 10, doubleArray35);
        boolean boolean37 = switchingFunctionsHandler31.isEmpty();
        double double38 = switchingFunctionsHandler31.getEventTime();
        org.apache.commons.math.ode.StepInterpolator stepInterpolator39 = null;
        boolean boolean40 = switchingFunctionsHandler31.evaluateStep(stepInterpolator39);
        org.apache.commons.math.ode.SwitchingFunctionsHandler switchingFunctionsHandler42 = new org.apache.commons.math.ode.SwitchingFunctionsHandler();
        double[] doubleArray46 = new double[] { (-1.0f), 1.0d };
        boolean boolean47 = switchingFunctionsHandler42.reset((double) (byte) 10, doubleArray46);
        org.apache.commons.math.ode.SwitchingFunctionsHandler switchingFunctionsHandler49 = new org.apache.commons.math.ode.SwitchingFunctionsHandler();
        double[] doubleArray53 = new double[] { (-1.0f), 1.0d };
        boolean boolean54 = switchingFunctionsHandler49.reset((double) (byte) 10, doubleArray53);
        double[] doubleArray60 = new double[] { 10, 0.0d, '4', 1.0d };
        boolean boolean61 = switchingFunctionsHandler49.reset((double) (-1), doubleArray60);
        switchingFunctionsHandler42.stepAccepted((double) (byte) -1, doubleArray60);
        boolean boolean63 = switchingFunctionsHandler42.isEmpty();
        double double64 = switchingFunctionsHandler42.getEventTime();
        org.apache.commons.math.ode.SwitchingFunctionsHandler switchingFunctionsHandler66 = new org.apache.commons.math.ode.SwitchingFunctionsHandler();
        double double67 = switchingFunctionsHandler66.getEventTime();
        double double68 = switchingFunctionsHandler66.getEventTime();
        double double69 = switchingFunctionsHandler66.getEventTime();
        org.apache.commons.math.ode.SwitchingFunctionsHandler switchingFunctionsHandler71 = new org.apache.commons.math.ode.SwitchingFunctionsHandler();
        double[] doubleArray75 = new double[] { (-1.0f), 1.0d };
        boolean boolean76 = switchingFunctionsHandler71.reset((double) (byte) 10, doubleArray75);
        double[] doubleArray82 = new double[] { 10, 0.0d, '4', 1.0d };
        boolean boolean83 = switchingFunctionsHandler71.reset((double) (-1), doubleArray82);
        boolean boolean84 = switchingFunctionsHandler66.reset((double) 1, doubleArray82);
        switchingFunctionsHandler42.stepAccepted((double) 100.0f, doubleArray82);
        boolean boolean86 = switchingFunctionsHandler31.reset((double) 1L, doubleArray82);
        boolean boolean87 = switchingFunctionsHandler0.reset((double) (byte) 100, doubleArray82);
        boolean boolean88 = switchingFunctionsHandler0.isEmpty();
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertNotNull(doubleArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray7), "[-1.0, 1.0]");
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNotNull(doubleArray14);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray14), "[10.0, 0.0, 52.0, 1.0]");
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertNotNull(doubleArray27);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray27), "[3.0, 0.0, 100.0, 100.0]");
        org.junit.Assert.assertNotNull(doubleArray35);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray35), "[-1.0, 1.0]");
        org.junit.Assert.assertTrue("'" + boolean36 + "' != '" + false + "'", boolean36 == false);
        org.junit.Assert.assertTrue("'" + boolean37 + "' != '" + true + "'", boolean37 == true);
        org.junit.Assert.assertTrue(Double.isNaN(double38));
        org.junit.Assert.assertTrue("'" + boolean40 + "' != '" + false + "'", boolean40 == false);
        org.junit.Assert.assertNotNull(doubleArray46);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray46), "[-1.0, 1.0]");
        org.junit.Assert.assertTrue("'" + boolean47 + "' != '" + false + "'", boolean47 == false);
        org.junit.Assert.assertNotNull(doubleArray53);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray53), "[-1.0, 1.0]");
        org.junit.Assert.assertTrue("'" + boolean54 + "' != '" + false + "'", boolean54 == false);
        org.junit.Assert.assertNotNull(doubleArray60);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray60), "[10.0, 0.0, 52.0, 1.0]");
        org.junit.Assert.assertTrue("'" + boolean61 + "' != '" + false + "'", boolean61 == false);
        org.junit.Assert.assertTrue("'" + boolean63 + "' != '" + true + "'", boolean63 == true);
        org.junit.Assert.assertTrue(Double.isNaN(double64));
        org.junit.Assert.assertTrue(Double.isNaN(double67));
        org.junit.Assert.assertTrue(Double.isNaN(double68));
        org.junit.Assert.assertTrue(Double.isNaN(double69));
        org.junit.Assert.assertNotNull(doubleArray75);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray75), "[-1.0, 1.0]");
        org.junit.Assert.assertTrue("'" + boolean76 + "' != '" + false + "'", boolean76 == false);
        org.junit.Assert.assertNotNull(doubleArray82);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray82), "[10.0, 0.0, 52.0, 1.0]");
        org.junit.Assert.assertTrue("'" + boolean83 + "' != '" + false + "'", boolean83 == false);
        org.junit.Assert.assertTrue("'" + boolean84 + "' != '" + false + "'", boolean84 == false);
        org.junit.Assert.assertTrue("'" + boolean86 + "' != '" + false + "'", boolean86 == false);
        org.junit.Assert.assertTrue("'" + boolean87 + "' != '" + false + "'", boolean87 == false);
        org.junit.Assert.assertTrue("'" + boolean88 + "' != '" + true + "'", boolean88 == true);
    }

    @Test
    public void test16027() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest32.test16027");
        java.lang.String[] strArray8 = new java.lang.String[] { "hi!" };
        org.apache.commons.math.ode.DerivativeException derivativeException9 = new org.apache.commons.math.ode.DerivativeException("hi!", strArray8);
        org.apache.commons.math.FunctionEvaluationException functionEvaluationException10 = new org.apache.commons.math.FunctionEvaluationException((double) 1, "hi!", (java.lang.Object[]) strArray8);
        java.lang.Throwable throwable13 = null;
        org.apache.commons.math.ConvergenceException convergenceException14 = new org.apache.commons.math.ConvergenceException("hi!", throwable13);
        org.apache.commons.math.ConvergenceException convergenceException15 = new org.apache.commons.math.ConvergenceException("hi!", (java.lang.Throwable) convergenceException14);
        org.apache.commons.math.ConvergenceException convergenceException16 = new org.apache.commons.math.ConvergenceException("org.apache.commons.math.ConvergenceException: org.apache.commons.math.FunctionEvaluationException: ", (java.lang.Object[]) strArray8, (java.lang.Throwable) convergenceException14);
        org.apache.commons.math.FunctionEvaluationException functionEvaluationException17 = new org.apache.commons.math.FunctionEvaluationException((double) 100L, (java.lang.Throwable) convergenceException14);
        org.apache.commons.math.ode.IntegratorException integratorException18 = new org.apache.commons.math.ode.IntegratorException((java.lang.Throwable) functionEvaluationException17);
        java.lang.Object[] objArray19 = functionEvaluationException17.getArguments();
        java.lang.String[] strArray30 = new java.lang.String[] { "hi!" };
        org.apache.commons.math.ode.DerivativeException derivativeException31 = new org.apache.commons.math.ode.DerivativeException("hi!", strArray30);
        org.apache.commons.math.FunctionEvaluationException functionEvaluationException32 = new org.apache.commons.math.FunctionEvaluationException((double) (byte) 100, "", (java.lang.Object[]) strArray30);
        org.apache.commons.math.ConvergenceException convergenceException33 = new org.apache.commons.math.ConvergenceException("hi!", (java.lang.Object[]) strArray30);
        org.apache.commons.math.ode.DerivativeException derivativeException34 = new org.apache.commons.math.ode.DerivativeException("org.apache.commons.math.ConvergenceException: hi!", strArray30);
        org.apache.commons.math.FunctionEvaluationException functionEvaluationException35 = new org.apache.commons.math.FunctionEvaluationException((double) (-1.0f), "org.apache.commons.math.ode.DerivativeException: Evaluation failed for argument = 97", (java.lang.Object[]) strArray30);
        org.apache.commons.math.ode.DerivativeException derivativeException36 = new org.apache.commons.math.ode.DerivativeException("org.apache.commons.math.ConvergenceException: org.apache.commons.math.ode.DerivativeException: hi!", strArray30);
        org.apache.commons.math.ode.IntegratorException integratorException37 = new org.apache.commons.math.ode.IntegratorException((java.lang.Throwable) derivativeException36);
        org.apache.commons.math.ConvergenceException convergenceException38 = new org.apache.commons.math.ConvergenceException("org.apache.commons.math.FunctionEvaluationException: org.apache.commons.math.FunctionEvaluationException: ", (java.lang.Throwable) derivativeException36);
        org.apache.commons.math.ConvergenceException convergenceException39 = new org.apache.commons.math.ConvergenceException((java.lang.Throwable) derivativeException36);
        org.apache.commons.math.ConvergenceException convergenceException40 = new org.apache.commons.math.ConvergenceException("Evaluation failed for argument = 0", objArray19, (java.lang.Throwable) convergenceException39);
        org.apache.commons.math.ode.DerivativeException derivativeException41 = new org.apache.commons.math.ode.DerivativeException((java.lang.Throwable) convergenceException40);
        org.apache.commons.math.FunctionEvaluationException functionEvaluationException42 = new org.apache.commons.math.FunctionEvaluationException((double) 10.0f, (java.lang.Throwable) derivativeException41);
        org.junit.Assert.assertNotNull(strArray8);
        org.junit.Assert.assertNotNull(objArray19);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray19), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray19), "[]");
        org.junit.Assert.assertNotNull(strArray30);
    }

    @Test
    public void test16028() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest32.test16028");
        org.apache.commons.math.ode.SwitchingFunctionsHandler switchingFunctionsHandler0 = new org.apache.commons.math.ode.SwitchingFunctionsHandler();
        boolean boolean1 = switchingFunctionsHandler0.stop();
        org.apache.commons.math.ode.SwitchingFunctionsHandler switchingFunctionsHandler3 = new org.apache.commons.math.ode.SwitchingFunctionsHandler();
        double[] doubleArray7 = new double[] { (-1.0f), 1.0d };
        boolean boolean8 = switchingFunctionsHandler3.reset((double) (byte) 10, doubleArray7);
        double[] doubleArray14 = new double[] { 10, 0.0d, '4', 1.0d };
        boolean boolean15 = switchingFunctionsHandler3.reset((double) (-1), doubleArray14);
        boolean boolean16 = switchingFunctionsHandler0.reset(97.0d, doubleArray14);
        boolean boolean17 = switchingFunctionsHandler0.isEmpty();
        boolean boolean18 = switchingFunctionsHandler0.isEmpty();
        double double19 = switchingFunctionsHandler0.getEventTime();
        boolean boolean20 = switchingFunctionsHandler0.stop();
        boolean boolean21 = switchingFunctionsHandler0.stop();
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertNotNull(doubleArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray7), "[-1.0, 1.0]");
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNotNull(doubleArray14);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray14), "[10.0, 0.0, 52.0, 1.0]");
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
        org.junit.Assert.assertTrue(Double.isNaN(double19));
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
    }

    @Test
    public void test16029() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest32.test16029");
        org.apache.commons.math.FunctionEvaluationException functionEvaluationException6 = new org.apache.commons.math.FunctionEvaluationException((double) 'a');
        org.apache.commons.math.ConvergenceException convergenceException7 = new org.apache.commons.math.ConvergenceException("hi!", (java.lang.Throwable) functionEvaluationException6);
        org.apache.commons.math.FunctionEvaluationException functionEvaluationException8 = new org.apache.commons.math.FunctionEvaluationException(10.0d, "org.apache.commons.math.FunctionEvaluationException: ", (java.lang.Throwable) convergenceException7);
        org.apache.commons.math.ConvergenceException convergenceException9 = new org.apache.commons.math.ConvergenceException("org.apache.commons.math.ode.DerivativeException: hi!", (java.lang.Throwable) functionEvaluationException8);
        org.apache.commons.math.ode.DerivativeException derivativeException10 = new org.apache.commons.math.ode.DerivativeException((java.lang.Throwable) convergenceException9);
        org.apache.commons.math.ConvergenceException convergenceException11 = new org.apache.commons.math.ConvergenceException((java.lang.Throwable) convergenceException9);
        org.apache.commons.math.ode.IntegratorException integratorException12 = new org.apache.commons.math.ode.IntegratorException((java.lang.Throwable) convergenceException9);
        org.apache.commons.math.ConvergenceException convergenceException13 = new org.apache.commons.math.ConvergenceException("org.apache.commons.math.ConvergenceException", (java.lang.Throwable) convergenceException9);
    }

    @Test
    public void test16030() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest32.test16030");
        java.lang.String[] strArray15 = new java.lang.String[] { "hi!" };
        org.apache.commons.math.ode.DerivativeException derivativeException16 = new org.apache.commons.math.ode.DerivativeException("hi!", strArray15);
        org.apache.commons.math.FunctionEvaluationException functionEvaluationException17 = new org.apache.commons.math.FunctionEvaluationException((double) (byte) 100, "", (java.lang.Object[]) strArray15);
        org.apache.commons.math.ConvergenceException convergenceException18 = new org.apache.commons.math.ConvergenceException("hi!", (java.lang.Object[]) strArray15);
        org.apache.commons.math.ode.DerivativeException derivativeException19 = new org.apache.commons.math.ode.DerivativeException("", strArray15);
        org.apache.commons.math.ode.IntegratorException integratorException20 = new org.apache.commons.math.ode.IntegratorException("", (java.lang.Object[]) strArray15);
        org.apache.commons.math.FunctionEvaluationException functionEvaluationException21 = new org.apache.commons.math.FunctionEvaluationException(10.0d, "", (java.lang.Object[]) strArray15);
        org.apache.commons.math.ode.DerivativeException derivativeException22 = new org.apache.commons.math.ode.DerivativeException("Evaluation failed for argument = 97", strArray15);
        java.lang.String[] strArray30 = new java.lang.String[] { "hi!" };
        org.apache.commons.math.ode.DerivativeException derivativeException31 = new org.apache.commons.math.ode.DerivativeException("hi!", strArray30);
        org.apache.commons.math.FunctionEvaluationException functionEvaluationException32 = new org.apache.commons.math.FunctionEvaluationException((double) (byte) 100, "", (java.lang.Object[]) strArray30);
        org.apache.commons.math.ConvergenceException convergenceException33 = new org.apache.commons.math.ConvergenceException("hi!", (java.lang.Object[]) strArray30);
        org.apache.commons.math.ode.IntegratorException integratorException34 = new org.apache.commons.math.ode.IntegratorException("org.apache.commons.math.ConvergenceException: ", (java.lang.Object[]) strArray30);
        java.lang.Throwable[] throwableArray35 = integratorException34.getSuppressed();
        org.apache.commons.math.ConvergenceException convergenceException36 = new org.apache.commons.math.ConvergenceException("org.apache.commons.math.ode.IntegratorException: Evaluation failed for argument = 2", (java.lang.Throwable) integratorException34);
        org.apache.commons.math.FunctionEvaluationException functionEvaluationException37 = new org.apache.commons.math.FunctionEvaluationException((double) (byte) 10, "", (java.lang.Object[]) strArray15, (java.lang.Throwable) integratorException34);
        org.apache.commons.math.ode.IntegratorException integratorException38 = new org.apache.commons.math.ode.IntegratorException("org.apache.commons.math.FunctionEvaluationException: org.apache.commons.math.ode.DerivativeException: hi!", (java.lang.Object[]) strArray15);
        org.apache.commons.math.ode.DerivativeException derivativeException39 = new org.apache.commons.math.ode.DerivativeException("org.apache.commons.math.ode.DerivativeException: org.apache.commons.math.ode.DerivativeException: ", strArray15);
        org.apache.commons.math.ode.DerivativeException derivativeException40 = new org.apache.commons.math.ode.DerivativeException("org.apache.commons.math.ode.IntegratorException: org.apache.commons.math.ConvergenceException: org.apache.commons.math.ConvergenceException: org.apache.commons.math.FunctionEvaluationException: org.apache.commons.math.ode.DerivativeException: hi!", strArray15);
        org.junit.Assert.assertNotNull(strArray15);
        org.junit.Assert.assertNotNull(strArray30);
        org.junit.Assert.assertNotNull(throwableArray35);
    }

    @Test
    public void test16031() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest32.test16031");
        java.lang.String[] strArray15 = new java.lang.String[] { "hi!" };
        org.apache.commons.math.ode.DerivativeException derivativeException16 = new org.apache.commons.math.ode.DerivativeException("hi!", strArray15);
        org.apache.commons.math.FunctionEvaluationException functionEvaluationException17 = new org.apache.commons.math.FunctionEvaluationException((double) (byte) 100, "", (java.lang.Object[]) strArray15);
        org.apache.commons.math.ConvergenceException convergenceException18 = new org.apache.commons.math.ConvergenceException("hi!", (java.lang.Object[]) strArray15);
        org.apache.commons.math.FunctionEvaluationException functionEvaluationException19 = new org.apache.commons.math.FunctionEvaluationException((double) (-1L), "Evaluation failed for argument = 97", (java.lang.Object[]) strArray15);
        org.apache.commons.math.ode.IntegratorException integratorException20 = new org.apache.commons.math.ode.IntegratorException("org.apache.commons.math.FunctionEvaluationException: ", (java.lang.Object[]) strArray15);
        org.apache.commons.math.FunctionEvaluationException functionEvaluationException22 = new org.apache.commons.math.FunctionEvaluationException(1.0d);
        org.apache.commons.math.FunctionEvaluationException functionEvaluationException23 = new org.apache.commons.math.FunctionEvaluationException(100.0d, "org.apache.commons.math.FunctionEvaluationException: Evaluation failed for argument = 1", (java.lang.Object[]) strArray15, (java.lang.Throwable) functionEvaluationException22);
        java.lang.String[] strArray28 = new java.lang.String[] { "hi!" };
        org.apache.commons.math.ode.DerivativeException derivativeException29 = new org.apache.commons.math.ode.DerivativeException("hi!", strArray28);
        org.apache.commons.math.ode.DerivativeException derivativeException30 = new org.apache.commons.math.ode.DerivativeException((java.lang.Throwable) derivativeException29);
        org.apache.commons.math.ode.IntegratorException integratorException31 = new org.apache.commons.math.ode.IntegratorException((java.lang.Throwable) derivativeException29);
        org.apache.commons.math.FunctionEvaluationException functionEvaluationException33 = new org.apache.commons.math.FunctionEvaluationException((double) 'a');
        java.lang.Throwable[] throwableArray34 = functionEvaluationException33.getSuppressed();
        org.apache.commons.math.ode.DerivativeException derivativeException35 = new org.apache.commons.math.ode.DerivativeException((java.lang.Throwable) functionEvaluationException33);
        derivativeException29.addSuppressed((java.lang.Throwable) functionEvaluationException33);
        java.lang.Object[] objArray37 = functionEvaluationException33.getArguments();
        org.apache.commons.math.FunctionEvaluationException functionEvaluationException40 = new org.apache.commons.math.FunctionEvaluationException((double) 'a');
        org.apache.commons.math.ConvergenceException convergenceException41 = new org.apache.commons.math.ConvergenceException("hi!", (java.lang.Throwable) functionEvaluationException40);
        java.lang.Throwable[] throwableArray42 = functionEvaluationException40.getSuppressed();
        java.lang.Throwable[] throwableArray43 = functionEvaluationException40.getSuppressed();
        java.lang.Throwable[] throwableArray44 = functionEvaluationException40.getSuppressed();
        org.apache.commons.math.ode.IntegratorException integratorException45 = new org.apache.commons.math.ode.IntegratorException((java.lang.Throwable) functionEvaluationException40);
        org.apache.commons.math.FunctionEvaluationException functionEvaluationException46 = new org.apache.commons.math.FunctionEvaluationException((double) 10, "org.apache.commons.math.FunctionEvaluationException: org.apache.commons.math.FunctionEvaluationException: ", objArray37, (java.lang.Throwable) functionEvaluationException40);
        org.apache.commons.math.FunctionEvaluationException functionEvaluationException47 = new org.apache.commons.math.FunctionEvaluationException((double) '#', "org.apache.commons.math.ConvergenceException: org.apache.commons.math.ConvergenceException: Evaluation failed for argument = 97", (java.lang.Object[]) strArray15, (java.lang.Throwable) functionEvaluationException40);
        org.apache.commons.math.ode.DerivativeException derivativeException48 = new org.apache.commons.math.ode.DerivativeException("org.apache.commons.math.FunctionEvaluationException: Evaluation failed for argument = 1", strArray15);
        org.apache.commons.math.ode.DerivativeException derivativeException49 = new org.apache.commons.math.ode.DerivativeException("org.apache.commons.math.ode.IntegratorException: org.apache.commons.math.ode.IntegratorException: org.apache.commons.math.ConvergenceException: org.apache.commons.math.FunctionEvaluationException: ", strArray15);
        org.apache.commons.math.ode.DerivativeException derivativeException50 = new org.apache.commons.math.ode.DerivativeException("org.apache.commons.math.FunctionEvaluationException: org.apache.commons.math.FunctionEvaluationException: ", strArray15);
        org.junit.Assert.assertNotNull(strArray15);
        org.junit.Assert.assertNotNull(strArray28);
        org.junit.Assert.assertNotNull(throwableArray34);
        org.junit.Assert.assertNotNull(objArray37);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray37), "[97.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray37), "[97.0]");
        org.junit.Assert.assertNotNull(throwableArray42);
        org.junit.Assert.assertNotNull(throwableArray43);
        org.junit.Assert.assertNotNull(throwableArray44);
    }

    @Test
    public void test16032() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest32.test16032");
        org.apache.commons.math.FunctionEvaluationException functionEvaluationException8 = new org.apache.commons.math.FunctionEvaluationException((double) 'a');
        org.apache.commons.math.FunctionEvaluationException functionEvaluationException11 = new org.apache.commons.math.FunctionEvaluationException((double) 'a');
        org.apache.commons.math.ConvergenceException convergenceException12 = new org.apache.commons.math.ConvergenceException("hi!", (java.lang.Throwable) functionEvaluationException11);
        functionEvaluationException8.addSuppressed((java.lang.Throwable) convergenceException12);
        java.lang.Object[] objArray15 = new java.lang.Object[] { (byte) 1, functionEvaluationException8, 100.0d };
        org.apache.commons.math.FunctionEvaluationException functionEvaluationException16 = new org.apache.commons.math.FunctionEvaluationException((double) (byte) -1, "", objArray15);
        java.lang.Throwable[] throwableArray17 = functionEvaluationException16.getSuppressed();
        org.apache.commons.math.FunctionEvaluationException functionEvaluationException25 = new org.apache.commons.math.FunctionEvaluationException((double) 'a');
        java.lang.Throwable[] throwableArray26 = functionEvaluationException25.getSuppressed();
        org.apache.commons.math.FunctionEvaluationException functionEvaluationException28 = new org.apache.commons.math.FunctionEvaluationException((double) 'a');
        org.apache.commons.math.FunctionEvaluationException functionEvaluationException31 = new org.apache.commons.math.FunctionEvaluationException((double) 'a');
        org.apache.commons.math.ConvergenceException convergenceException32 = new org.apache.commons.math.ConvergenceException("hi!", (java.lang.Throwable) functionEvaluationException31);
        functionEvaluationException28.addSuppressed((java.lang.Throwable) convergenceException32);
        org.apache.commons.math.FunctionEvaluationException functionEvaluationException34 = new org.apache.commons.math.FunctionEvaluationException((double) (byte) -1, "org.apache.commons.math.ode.DerivativeException: hi!", (java.lang.Object[]) throwableArray26, (java.lang.Throwable) functionEvaluationException28);
        java.lang.Throwable throwable35 = null;
        org.apache.commons.math.ConvergenceException convergenceException36 = new org.apache.commons.math.ConvergenceException(throwable35);
        org.apache.commons.math.ConvergenceException convergenceException37 = new org.apache.commons.math.ConvergenceException("org.apache.commons.math.FunctionEvaluationException: ", (java.lang.Object[]) throwableArray26, throwable35);
        org.apache.commons.math.ode.IntegratorException integratorException38 = new org.apache.commons.math.ode.IntegratorException("Evaluation failed for argument = {0}", (java.lang.Object[]) throwableArray26);
        org.apache.commons.math.ConvergenceException convergenceException39 = new org.apache.commons.math.ConvergenceException("Evaluation failed for argument = {0}", (java.lang.Object[]) throwableArray26);
        org.apache.commons.math.ConvergenceException convergenceException40 = new org.apache.commons.math.ConvergenceException("org.apache.commons.math.FunctionEvaluationException: org.apache.commons.math.ode.DerivativeException: hi!", (java.lang.Object[]) throwableArray26);
        org.apache.commons.math.ConvergenceException convergenceException41 = new org.apache.commons.math.ConvergenceException("org.apache.commons.math.FunctionEvaluationException: ", (java.lang.Object[]) throwableArray17, (java.lang.Throwable) convergenceException40);
        java.lang.String[] strArray51 = new java.lang.String[] { "hi!" };
        org.apache.commons.math.ode.DerivativeException derivativeException52 = new org.apache.commons.math.ode.DerivativeException("hi!", strArray51);
        org.apache.commons.math.FunctionEvaluationException functionEvaluationException53 = new org.apache.commons.math.FunctionEvaluationException((double) (byte) 100, "", (java.lang.Object[]) strArray51);
        org.apache.commons.math.ConvergenceException convergenceException54 = new org.apache.commons.math.ConvergenceException("hi!", (java.lang.Object[]) strArray51);
        org.apache.commons.math.ode.DerivativeException derivativeException55 = new org.apache.commons.math.ode.DerivativeException("", strArray51);
        org.apache.commons.math.ode.IntegratorException integratorException56 = new org.apache.commons.math.ode.IntegratorException("", (java.lang.Object[]) strArray51);
        org.apache.commons.math.FunctionEvaluationException functionEvaluationException57 = new org.apache.commons.math.FunctionEvaluationException(10.0d, "", (java.lang.Object[]) strArray51);
        org.apache.commons.math.ConvergenceException convergenceException58 = new org.apache.commons.math.ConvergenceException("org.apache.commons.math.FunctionEvaluationException: Evaluation failed for argument = 97", (java.lang.Object[]) throwableArray17, (java.lang.Throwable) functionEvaluationException57);
        org.apache.commons.math.FunctionEvaluationException functionEvaluationException59 = new org.apache.commons.math.FunctionEvaluationException(100.0d, "", (java.lang.Throwable) convergenceException58);
        java.lang.Object[] objArray60 = functionEvaluationException59.getArguments();
        org.apache.commons.math.ConvergenceException convergenceException61 = new org.apache.commons.math.ConvergenceException((java.lang.Throwable) functionEvaluationException59);
        java.lang.String[] strArray76 = new java.lang.String[] { "hi!" };
        org.apache.commons.math.ode.DerivativeException derivativeException77 = new org.apache.commons.math.ode.DerivativeException("hi!", strArray76);
        org.apache.commons.math.FunctionEvaluationException functionEvaluationException78 = new org.apache.commons.math.FunctionEvaluationException((double) (byte) 100, "", (java.lang.Object[]) strArray76);
        org.apache.commons.math.ConvergenceException convergenceException79 = new org.apache.commons.math.ConvergenceException("hi!", (java.lang.Object[]) strArray76);
        org.apache.commons.math.ode.DerivativeException derivativeException80 = new org.apache.commons.math.ode.DerivativeException("", strArray76);
        org.apache.commons.math.ode.IntegratorException integratorException81 = new org.apache.commons.math.ode.IntegratorException("", (java.lang.Object[]) strArray76);
        org.apache.commons.math.FunctionEvaluationException functionEvaluationException82 = new org.apache.commons.math.FunctionEvaluationException(10.0d, "", (java.lang.Object[]) strArray76);
        org.apache.commons.math.ode.IntegratorException integratorException83 = new org.apache.commons.math.ode.IntegratorException("hi!", (java.lang.Object[]) strArray76);
        org.apache.commons.math.ode.DerivativeException derivativeException84 = new org.apache.commons.math.ode.DerivativeException("org.apache.commons.math.ode.DerivativeException: Evaluation failed for argument = 1", strArray76);
        org.apache.commons.math.ode.DerivativeException derivativeException85 = new org.apache.commons.math.ode.DerivativeException("org.apache.commons.math.ode.IntegratorException: org.apache.commons.math.FunctionEvaluationException: org.apache.commons.math.ode.DerivativeException: hi!", strArray76);
        org.apache.commons.math.ode.DerivativeException derivativeException86 = new org.apache.commons.math.ode.DerivativeException("", strArray76);
        org.apache.commons.math.ode.DerivativeException derivativeException87 = new org.apache.commons.math.ode.DerivativeException("Evaluation failed for argument = {0}", strArray76);
        convergenceException61.addSuppressed((java.lang.Throwable) derivativeException87);
        org.junit.Assert.assertNotNull(objArray15);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray15), "[1, org.apache.commons.math.FunctionEvaluationException: Evaluation failed for argument = 97, 100.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray15), "[1, org.apache.commons.math.FunctionEvaluationException: Evaluation failed for argument = 97, 100.0]");
        org.junit.Assert.assertNotNull(throwableArray17);
        org.junit.Assert.assertNotNull(throwableArray26);
        org.junit.Assert.assertNotNull(strArray51);
        org.junit.Assert.assertNotNull(objArray60);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray60), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray60), "[]");
        org.junit.Assert.assertNotNull(strArray76);
    }

    @Test
    public void test16033() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest32.test16033");
        org.apache.commons.math.FunctionEvaluationException functionEvaluationException11 = new org.apache.commons.math.FunctionEvaluationException((double) 'a');
        org.apache.commons.math.ConvergenceException convergenceException12 = new org.apache.commons.math.ConvergenceException("hi!", (java.lang.Throwable) functionEvaluationException11);
        java.lang.Object[] objArray13 = convergenceException12.getArguments();
        org.apache.commons.math.ConvergenceException convergenceException14 = new org.apache.commons.math.ConvergenceException("org.apache.commons.math.ConvergenceException: ", objArray13);
        org.apache.commons.math.FunctionEvaluationException functionEvaluationException26 = new org.apache.commons.math.FunctionEvaluationException((double) 'a');
        java.lang.Throwable[] throwableArray27 = functionEvaluationException26.getSuppressed();
        org.apache.commons.math.FunctionEvaluationException functionEvaluationException29 = new org.apache.commons.math.FunctionEvaluationException((double) 'a');
        org.apache.commons.math.FunctionEvaluationException functionEvaluationException32 = new org.apache.commons.math.FunctionEvaluationException((double) 'a');
        org.apache.commons.math.ConvergenceException convergenceException33 = new org.apache.commons.math.ConvergenceException("hi!", (java.lang.Throwable) functionEvaluationException32);
        functionEvaluationException29.addSuppressed((java.lang.Throwable) convergenceException33);
        org.apache.commons.math.FunctionEvaluationException functionEvaluationException35 = new org.apache.commons.math.FunctionEvaluationException((double) (byte) -1, "org.apache.commons.math.ode.DerivativeException: hi!", (java.lang.Object[]) throwableArray27, (java.lang.Throwable) functionEvaluationException29);
        java.lang.Object[] objArray36 = functionEvaluationException29.getArguments();
        org.apache.commons.math.ConvergenceException convergenceException37 = new org.apache.commons.math.ConvergenceException("hi!", objArray36);
        org.apache.commons.math.FunctionEvaluationException functionEvaluationException38 = new org.apache.commons.math.FunctionEvaluationException((double) '#', "org.apache.commons.math.ConvergenceException: ", objArray36);
        org.apache.commons.math.ode.IntegratorException integratorException39 = new org.apache.commons.math.ode.IntegratorException("org.apache.commons.math.FunctionEvaluationException: org.apache.commons.math.ode.DerivativeException: hi!", objArray36);
        org.apache.commons.math.FunctionEvaluationException functionEvaluationException41 = new org.apache.commons.math.FunctionEvaluationException(0.0d);
        org.apache.commons.math.FunctionEvaluationException functionEvaluationException42 = new org.apache.commons.math.FunctionEvaluationException((double) '#', "org.apache.commons.math.ConvergenceException: org.apache.commons.math.ode.DerivativeException: hi!", objArray36, (java.lang.Throwable) functionEvaluationException41);
        org.apache.commons.math.FunctionEvaluationException functionEvaluationException43 = new org.apache.commons.math.FunctionEvaluationException((double) (byte) 0, "Evaluation failed for argument = {0}", objArray36);
        org.apache.commons.math.FunctionEvaluationException functionEvaluationException44 = new org.apache.commons.math.FunctionEvaluationException((double) 100L, "org.apache.commons.math.ConvergenceException: org.apache.commons.math.FunctionEvaluationException: org.apache.commons.math.ode.DerivativeException: hi!", objArray13, (java.lang.Throwable) functionEvaluationException43);
        java.lang.Object[] objArray45 = functionEvaluationException44.getArguments();
        org.apache.commons.math.FunctionEvaluationException functionEvaluationException48 = new org.apache.commons.math.FunctionEvaluationException((double) 'a');
        org.apache.commons.math.ConvergenceException convergenceException49 = new org.apache.commons.math.ConvergenceException("hi!", (java.lang.Throwable) functionEvaluationException48);
        java.lang.Throwable[] throwableArray50 = functionEvaluationException48.getSuppressed();
        org.apache.commons.math.ConvergenceException convergenceException51 = new org.apache.commons.math.ConvergenceException((java.lang.Throwable) functionEvaluationException48);
        org.apache.commons.math.ode.DerivativeException derivativeException52 = new org.apache.commons.math.ode.DerivativeException((java.lang.Throwable) functionEvaluationException48);
        org.apache.commons.math.ode.DerivativeException derivativeException53 = new org.apache.commons.math.ode.DerivativeException((java.lang.Throwable) derivativeException52);
        org.apache.commons.math.ConvergenceException convergenceException54 = new org.apache.commons.math.ConvergenceException("org.apache.commons.math.ode.IntegratorException: Evaluation failed for argument = 2", objArray45, (java.lang.Throwable) derivativeException53);
        org.apache.commons.math.ConvergenceException convergenceException55 = new org.apache.commons.math.ConvergenceException("org.apache.commons.math.FunctionEvaluationException: org.apache.commons.math.ode.DerivativeException: org.apache.commons.math.FunctionEvaluationException: org.apache.commons.math.ode.DerivativeException: hi!", objArray45);
        org.apache.commons.math.FunctionEvaluationException functionEvaluationException60 = new org.apache.commons.math.FunctionEvaluationException((double) 'a');
        java.lang.Throwable[] throwableArray61 = functionEvaluationException60.getSuppressed();
        org.apache.commons.math.FunctionEvaluationException functionEvaluationException63 = new org.apache.commons.math.FunctionEvaluationException((double) 'a');
        org.apache.commons.math.FunctionEvaluationException functionEvaluationException66 = new org.apache.commons.math.FunctionEvaluationException((double) 'a');
        org.apache.commons.math.ConvergenceException convergenceException67 = new org.apache.commons.math.ConvergenceException("hi!", (java.lang.Throwable) functionEvaluationException66);
        functionEvaluationException63.addSuppressed((java.lang.Throwable) convergenceException67);
        org.apache.commons.math.FunctionEvaluationException functionEvaluationException69 = new org.apache.commons.math.FunctionEvaluationException((double) (byte) -1, "org.apache.commons.math.ode.DerivativeException: hi!", (java.lang.Object[]) throwableArray61, (java.lang.Throwable) functionEvaluationException63);
        java.lang.Object[] objArray70 = functionEvaluationException63.getArguments();
        org.apache.commons.math.ConvergenceException convergenceException71 = new org.apache.commons.math.ConvergenceException("org.apache.commons.math.ConvergenceException: hi!", objArray70);
        org.apache.commons.math.ConvergenceException convergenceException72 = new org.apache.commons.math.ConvergenceException("org.apache.commons.math.ConvergenceException: org.apache.commons.math.FunctionEvaluationException", objArray45, (java.lang.Throwable) convergenceException71);
        java.lang.String[] strArray78 = new java.lang.String[] { "hi!" };
        org.apache.commons.math.ode.DerivativeException derivativeException79 = new org.apache.commons.math.ode.DerivativeException("hi!", strArray78);
        java.lang.String[] strArray84 = new java.lang.String[] { "hi!" };
        org.apache.commons.math.ode.DerivativeException derivativeException85 = new org.apache.commons.math.ode.DerivativeException("hi!", strArray84);
        org.apache.commons.math.ConvergenceException convergenceException86 = new org.apache.commons.math.ConvergenceException("org.apache.commons.math.ode.DerivativeException: hi!", (java.lang.Throwable) derivativeException85);
        org.apache.commons.math.FunctionEvaluationException functionEvaluationException87 = new org.apache.commons.math.FunctionEvaluationException((double) 100, (java.lang.Throwable) convergenceException86);
        java.lang.String str88 = functionEvaluationException87.getPattern();
        org.apache.commons.math.FunctionEvaluationException functionEvaluationException89 = new org.apache.commons.math.FunctionEvaluationException((double) 0.0f, "hi!", (java.lang.Object[]) strArray78, (java.lang.Throwable) functionEvaluationException87);
        org.apache.commons.math.ConvergenceException convergenceException90 = new org.apache.commons.math.ConvergenceException("org.apache.commons.math.FunctionEvaluationException: org.apache.commons.math.ode.DerivativeException: org.apache.commons.math.ode.DerivativeException: hi!", (java.lang.Throwable) functionEvaluationException89);
        org.apache.commons.math.FunctionEvaluationException functionEvaluationException91 = new org.apache.commons.math.FunctionEvaluationException((double) 'a', "org.apache.commons.math.ConvergenceException: org.apache.commons.math.ode.DerivativeException: org.apache.commons.math.FunctionEvaluationException: ", objArray45, (java.lang.Throwable) functionEvaluationException89);
        org.apache.commons.math.FunctionEvaluationException functionEvaluationException92 = new org.apache.commons.math.FunctionEvaluationException((double) 10, (java.lang.Throwable) functionEvaluationException91);
        double double93 = functionEvaluationException91.getArgument();
        org.junit.Assert.assertNotNull(objArray13);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray13), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray13), "[]");
        org.junit.Assert.assertNotNull(throwableArray27);
        org.junit.Assert.assertNotNull(objArray36);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray36), "[97.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray36), "[97.0]");
        org.junit.Assert.assertNotNull(objArray45);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray45), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray45), "[]");
        org.junit.Assert.assertNotNull(throwableArray50);
        org.junit.Assert.assertNotNull(throwableArray61);
        org.junit.Assert.assertNotNull(objArray70);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray70), "[97.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray70), "[97.0]");
        org.junit.Assert.assertNotNull(strArray78);
        org.junit.Assert.assertNotNull(strArray84);
        org.junit.Assert.assertEquals("'" + str88 + "' != '" + "org.apache.commons.math.ode.DerivativeException: hi!" + "'", str88, "org.apache.commons.math.ode.DerivativeException: hi!");
        org.junit.Assert.assertTrue("'" + double93 + "' != '" + 97.0d + "'", double93 == 97.0d);
    }

    @Test
    public void test16034() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest32.test16034");
        org.apache.commons.math.ode.SwitchingFunctionsHandler switchingFunctionsHandler0 = new org.apache.commons.math.ode.SwitchingFunctionsHandler();
        boolean boolean1 = switchingFunctionsHandler0.stop();
        org.apache.commons.math.ode.SwitchingFunctionsHandler switchingFunctionsHandler3 = new org.apache.commons.math.ode.SwitchingFunctionsHandler();
        double[] doubleArray7 = new double[] { (-1.0f), 1.0d };
        boolean boolean8 = switchingFunctionsHandler3.reset((double) (byte) 10, doubleArray7);
        double[] doubleArray14 = new double[] { 10, 0.0d, '4', 1.0d };
        boolean boolean15 = switchingFunctionsHandler3.reset((double) (-1), doubleArray14);
        boolean boolean16 = switchingFunctionsHandler0.reset(97.0d, doubleArray14);
        double double17 = switchingFunctionsHandler0.getEventTime();
        double double18 = switchingFunctionsHandler0.getEventTime();
        boolean boolean19 = switchingFunctionsHandler0.isEmpty();
        org.apache.commons.math.ode.StepInterpolator stepInterpolator20 = null;
        boolean boolean21 = switchingFunctionsHandler0.evaluateStep(stepInterpolator20);
        org.apache.commons.math.ode.SwitchingFunctionsHandler switchingFunctionsHandler23 = new org.apache.commons.math.ode.SwitchingFunctionsHandler();
        double[] doubleArray27 = new double[] { (-1.0f), 1.0d };
        boolean boolean28 = switchingFunctionsHandler23.reset((double) (byte) 10, doubleArray27);
        org.apache.commons.math.ode.StepInterpolator stepInterpolator29 = null;
        boolean boolean30 = switchingFunctionsHandler23.evaluateStep(stepInterpolator29);
        org.apache.commons.math.ode.StepInterpolator stepInterpolator31 = null;
        boolean boolean32 = switchingFunctionsHandler23.evaluateStep(stepInterpolator31);
        double double33 = switchingFunctionsHandler23.getEventTime();
        boolean boolean34 = switchingFunctionsHandler23.isEmpty();
        boolean boolean35 = switchingFunctionsHandler23.stop();
        org.apache.commons.math.ode.SwitchingFunctionsHandler switchingFunctionsHandler37 = new org.apache.commons.math.ode.SwitchingFunctionsHandler();
        org.apache.commons.math.ode.SwitchingFunctionsHandler switchingFunctionsHandler39 = new org.apache.commons.math.ode.SwitchingFunctionsHandler();
        double[] doubleArray43 = new double[] { (-1.0f), 1.0d };
        boolean boolean44 = switchingFunctionsHandler39.reset((double) (byte) 10, doubleArray43);
        double[] doubleArray50 = new double[] { 10, 0.0d, '4', 1.0d };
        boolean boolean51 = switchingFunctionsHandler39.reset((double) (-1), doubleArray50);
        boolean boolean52 = switchingFunctionsHandler37.reset((double) 1L, doubleArray50);
        boolean boolean53 = switchingFunctionsHandler23.reset((-1.0d), doubleArray50);
        org.apache.commons.math.ode.SwitchingFunctionsHandler switchingFunctionsHandler55 = new org.apache.commons.math.ode.SwitchingFunctionsHandler();
        double[] doubleArray59 = new double[] { (-1.0f), 1.0d };
        boolean boolean60 = switchingFunctionsHandler55.reset((double) (byte) 10, doubleArray59);
        org.apache.commons.math.ode.SwitchingFunctionsHandler switchingFunctionsHandler62 = new org.apache.commons.math.ode.SwitchingFunctionsHandler();
        double[] doubleArray66 = new double[] { (-1.0f), 1.0d };
        boolean boolean67 = switchingFunctionsHandler62.reset((double) (byte) 10, doubleArray66);
        double[] doubleArray73 = new double[] { 10, 0.0d, '4', 1.0d };
        boolean boolean74 = switchingFunctionsHandler62.reset((double) (-1), doubleArray73);
        switchingFunctionsHandler55.stepAccepted((double) (byte) -1, doubleArray73);
        org.apache.commons.math.ode.SwitchingFunctionsHandler switchingFunctionsHandler77 = new org.apache.commons.math.ode.SwitchingFunctionsHandler();
        double[] doubleArray83 = new double[] { 3, (byte) 0, 100.0d, 100 };
        switchingFunctionsHandler77.stepAccepted((double) (short) 0, doubleArray83);
        boolean boolean85 = switchingFunctionsHandler55.reset((double) 10L, doubleArray83);
        boolean boolean86 = switchingFunctionsHandler23.reset((double) (-1.0f), doubleArray83);
        switchingFunctionsHandler0.stepAccepted((double) (byte) 1, doubleArray83);
        org.apache.commons.math.ode.SwitchingFunction switchingFunction88 = null;
        switchingFunctionsHandler0.add(switchingFunction88, (double) (short) 0, (double) (short) 100, 3);
        org.apache.commons.math.ode.SwitchingFunction switchingFunction93 = null;
        switchingFunctionsHandler0.add(switchingFunction93, (double) 10, (double) 0.0f, 1);
        boolean boolean98 = switchingFunctionsHandler0.isEmpty();
        java.lang.Class<?> wildcardClass99 = switchingFunctionsHandler0.getClass();
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertNotNull(doubleArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray7), "[-1.0, 1.0]");
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNotNull(doubleArray14);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray14), "[10.0, 0.0, 52.0, 1.0]");
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue(Double.isNaN(double17));
        org.junit.Assert.assertTrue(Double.isNaN(double18));
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + true + "'", boolean19 == true);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertNotNull(doubleArray27);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray27), "[-1.0, 1.0]");
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + false + "'", boolean28 == false);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + false + "'", boolean30 == false);
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + false + "'", boolean32 == false);
        org.junit.Assert.assertTrue(Double.isNaN(double33));
        org.junit.Assert.assertTrue("'" + boolean34 + "' != '" + true + "'", boolean34 == true);
        org.junit.Assert.assertTrue("'" + boolean35 + "' != '" + false + "'", boolean35 == false);
        org.junit.Assert.assertNotNull(doubleArray43);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray43), "[-1.0, 1.0]");
        org.junit.Assert.assertTrue("'" + boolean44 + "' != '" + false + "'", boolean44 == false);
        org.junit.Assert.assertNotNull(doubleArray50);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray50), "[10.0, 0.0, 52.0, 1.0]");
        org.junit.Assert.assertTrue("'" + boolean51 + "' != '" + false + "'", boolean51 == false);
        org.junit.Assert.assertTrue("'" + boolean52 + "' != '" + false + "'", boolean52 == false);
        org.junit.Assert.assertTrue("'" + boolean53 + "' != '" + false + "'", boolean53 == false);
        org.junit.Assert.assertNotNull(doubleArray59);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray59), "[-1.0, 1.0]");
        org.junit.Assert.assertTrue("'" + boolean60 + "' != '" + false + "'", boolean60 == false);
        org.junit.Assert.assertNotNull(doubleArray66);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray66), "[-1.0, 1.0]");
        org.junit.Assert.assertTrue("'" + boolean67 + "' != '" + false + "'", boolean67 == false);
        org.junit.Assert.assertNotNull(doubleArray73);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray73), "[10.0, 0.0, 52.0, 1.0]");
        org.junit.Assert.assertTrue("'" + boolean74 + "' != '" + false + "'", boolean74 == false);
        org.junit.Assert.assertNotNull(doubleArray83);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray83), "[3.0, 0.0, 100.0, 100.0]");
        org.junit.Assert.assertTrue("'" + boolean85 + "' != '" + false + "'", boolean85 == false);
        org.junit.Assert.assertTrue("'" + boolean86 + "' != '" + false + "'", boolean86 == false);
        org.junit.Assert.assertTrue("'" + boolean98 + "' != '" + false + "'", boolean98 == false);
        org.junit.Assert.assertNotNull(wildcardClass99);
    }

    @Test
    public void test16035() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest32.test16035");
        org.apache.commons.math.FunctionEvaluationException functionEvaluationException8 = new org.apache.commons.math.FunctionEvaluationException((double) 1L);
        java.lang.Object[] objArray9 = functionEvaluationException8.getArguments();
        org.apache.commons.math.ConvergenceException convergenceException14 = new org.apache.commons.math.ConvergenceException();
        org.apache.commons.math.FunctionEvaluationException functionEvaluationException15 = new org.apache.commons.math.FunctionEvaluationException(97.0d, "org.apache.commons.math.ConvergenceException: Evaluation failed for argument = 97", (java.lang.Throwable) convergenceException14);
        org.apache.commons.math.FunctionEvaluationException functionEvaluationException16 = new org.apache.commons.math.FunctionEvaluationException((double) ' ', "org.apache.commons.math.ConvergenceException: org.apache.commons.math.ode.DerivativeException: hi!", (java.lang.Throwable) functionEvaluationException15);
        org.apache.commons.math.ConvergenceException convergenceException17 = new org.apache.commons.math.ConvergenceException("org.apache.commons.math.ode.IntegratorException: org.apache.commons.math.FunctionEvaluationException: org.apache.commons.math.ode.DerivativeException: hi!", objArray9, (java.lang.Throwable) functionEvaluationException15);
        java.lang.Throwable throwable18 = null;
        org.apache.commons.math.FunctionEvaluationException functionEvaluationException19 = new org.apache.commons.math.FunctionEvaluationException((double) 0L, "org.apache.commons.math.ode.IntegratorException: Evaluation failed for argument = {0}", objArray9, throwable18);
        org.apache.commons.math.FunctionEvaluationException functionEvaluationException20 = new org.apache.commons.math.FunctionEvaluationException((double) (short) 0, "org.apache.commons.math.ode.IntegratorException: org.apache.commons.math.FunctionEvaluationException: ", throwable18);
        java.lang.Object[] objArray21 = functionEvaluationException20.getArguments();
        org.apache.commons.math.FunctionEvaluationException functionEvaluationException22 = new org.apache.commons.math.FunctionEvaluationException((double) 0L, "org.apache.commons.math.ConvergenceException: org.apache.commons.math.ode.IntegratorException: org.apache.commons.math.FunctionEvaluationException: Evaluation failed for argument = 0", (java.lang.Throwable) functionEvaluationException20);
        org.junit.Assert.assertNotNull(objArray9);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray9), "[1.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray9), "[1.0]");
        org.junit.Assert.assertNotNull(objArray21);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray21), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray21), "[]");
    }

    @Test
    public void test16036() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest32.test16036");
        java.lang.String[] strArray15 = new java.lang.String[] { "hi!" };
        org.apache.commons.math.ode.DerivativeException derivativeException16 = new org.apache.commons.math.ode.DerivativeException("hi!", strArray15);
        org.apache.commons.math.FunctionEvaluationException functionEvaluationException17 = new org.apache.commons.math.FunctionEvaluationException((double) (byte) 100, "", (java.lang.Object[]) strArray15);
        org.apache.commons.math.ConvergenceException convergenceException18 = new org.apache.commons.math.ConvergenceException("hi!", (java.lang.Object[]) strArray15);
        org.apache.commons.math.ode.DerivativeException derivativeException19 = new org.apache.commons.math.ode.DerivativeException("", strArray15);
        org.apache.commons.math.ode.IntegratorException integratorException20 = new org.apache.commons.math.ode.IntegratorException("", (java.lang.Object[]) strArray15);
        org.apache.commons.math.FunctionEvaluationException functionEvaluationException21 = new org.apache.commons.math.FunctionEvaluationException(10.0d, "", (java.lang.Object[]) strArray15);
        org.apache.commons.math.ode.IntegratorException integratorException22 = new org.apache.commons.math.ode.IntegratorException("hi!", (java.lang.Object[]) strArray15);
        org.apache.commons.math.ode.DerivativeException derivativeException23 = new org.apache.commons.math.ode.DerivativeException("org.apache.commons.math.ode.IntegratorException: Evaluation failed for argument = 2", strArray15);
        org.apache.commons.math.ode.DerivativeException derivativeException24 = new org.apache.commons.math.ode.DerivativeException("org.apache.commons.math.FunctionEvaluationException: hi!", strArray15);
        org.apache.commons.math.FunctionEvaluationException functionEvaluationException25 = new org.apache.commons.math.FunctionEvaluationException(0.0d, "org.apache.commons.math.ode.IntegratorException: org.apache.commons.math.ode.DerivativeException: hi!", (java.lang.Object[]) strArray15);
        org.apache.commons.math.ode.DerivativeException derivativeException26 = new org.apache.commons.math.ode.DerivativeException("org.apache.commons.math.ode.DerivativeException", strArray15);
        java.lang.Throwable[] throwableArray27 = derivativeException26.getSuppressed();
        java.lang.String[] strArray35 = new java.lang.String[] { "hi!" };
        org.apache.commons.math.ode.DerivativeException derivativeException36 = new org.apache.commons.math.ode.DerivativeException("hi!", strArray35);
        org.apache.commons.math.ode.DerivativeException derivativeException37 = new org.apache.commons.math.ode.DerivativeException((java.lang.Throwable) derivativeException36);
        org.apache.commons.math.ode.IntegratorException integratorException38 = new org.apache.commons.math.ode.IntegratorException((java.lang.Throwable) derivativeException36);
        org.apache.commons.math.FunctionEvaluationException functionEvaluationException40 = new org.apache.commons.math.FunctionEvaluationException((double) 'a');
        java.lang.Throwable[] throwableArray41 = functionEvaluationException40.getSuppressed();
        org.apache.commons.math.ode.DerivativeException derivativeException42 = new org.apache.commons.math.ode.DerivativeException((java.lang.Throwable) functionEvaluationException40);
        derivativeException36.addSuppressed((java.lang.Throwable) functionEvaluationException40);
        java.lang.Object[] objArray44 = functionEvaluationException40.getArguments();
        org.apache.commons.math.ConvergenceException convergenceException45 = new org.apache.commons.math.ConvergenceException("org.apache.commons.math.FunctionEvaluationException: org.apache.commons.math.ode.DerivativeException: hi!", objArray44);
        org.apache.commons.math.ConvergenceException convergenceException46 = new org.apache.commons.math.ConvergenceException("", objArray44);
        java.lang.String[] strArray55 = new java.lang.String[] { "hi!" };
        org.apache.commons.math.ode.DerivativeException derivativeException56 = new org.apache.commons.math.ode.DerivativeException("hi!", strArray55);
        org.apache.commons.math.FunctionEvaluationException functionEvaluationException57 = new org.apache.commons.math.FunctionEvaluationException((double) (byte) 100, "", (java.lang.Object[]) strArray55);
        org.apache.commons.math.ConvergenceException convergenceException58 = new org.apache.commons.math.ConvergenceException("hi!", (java.lang.Object[]) strArray55);
        org.apache.commons.math.FunctionEvaluationException functionEvaluationException59 = new org.apache.commons.math.FunctionEvaluationException((double) (-1L), "Evaluation failed for argument = 97", (java.lang.Object[]) strArray55);
        org.apache.commons.math.ConvergenceException convergenceException60 = new org.apache.commons.math.ConvergenceException("Evaluation failed for argument = 97", (java.lang.Object[]) strArray55);
        convergenceException46.addSuppressed((java.lang.Throwable) convergenceException60);
        java.lang.String str62 = convergenceException60.getPattern();
        org.apache.commons.math.FunctionEvaluationException functionEvaluationException63 = new org.apache.commons.math.FunctionEvaluationException((-1.0d), (java.lang.Throwable) convergenceException60);
        org.apache.commons.math.FunctionEvaluationException functionEvaluationException64 = new org.apache.commons.math.FunctionEvaluationException((double) (byte) 1, "org.apache.commons.math.ode.DerivativeException: org.apache.commons.math.FunctionEvaluationException", (java.lang.Throwable) functionEvaluationException63);
        derivativeException26.addSuppressed((java.lang.Throwable) functionEvaluationException64);
        org.apache.commons.math.ode.DerivativeException derivativeException66 = new org.apache.commons.math.ode.DerivativeException((java.lang.Throwable) functionEvaluationException64);
        org.junit.Assert.assertNotNull(strArray15);
        org.junit.Assert.assertNotNull(throwableArray27);
        org.junit.Assert.assertNotNull(strArray35);
        org.junit.Assert.assertNotNull(throwableArray41);
        org.junit.Assert.assertNotNull(objArray44);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray44), "[97.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray44), "[97.0]");
        org.junit.Assert.assertNotNull(strArray55);
        org.junit.Assert.assertEquals("'" + str62 + "' != '" + "Evaluation failed for argument = 97" + "'", str62, "Evaluation failed for argument = 97");
    }

    @Test
    public void test16037() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest32.test16037");
        org.apache.commons.math.ode.SwitchingFunctionsHandler switchingFunctionsHandler0 = new org.apache.commons.math.ode.SwitchingFunctionsHandler();
        double[] doubleArray6 = new double[] { 3, (byte) 0, 100.0d, 100 };
        switchingFunctionsHandler0.stepAccepted((double) (short) 0, doubleArray6);
        org.apache.commons.math.ode.SwitchingFunctionsHandler switchingFunctionsHandler9 = new org.apache.commons.math.ode.SwitchingFunctionsHandler();
        double[] doubleArray13 = new double[] { (-1.0f), 1.0d };
        boolean boolean14 = switchingFunctionsHandler9.reset((double) (byte) 10, doubleArray13);
        boolean boolean15 = switchingFunctionsHandler9.isEmpty();
        double[] doubleArray23 = new double[] { Double.NaN, (short) 100, 100.0d, 100.0f, 0.0f, 10.0f };
        switchingFunctionsHandler9.stepAccepted((double) (-1L), doubleArray23);
        switchingFunctionsHandler0.stepAccepted((double) (byte) 10, doubleArray23);
        boolean boolean26 = switchingFunctionsHandler0.stop();
        boolean boolean27 = switchingFunctionsHandler0.stop();
        org.apache.commons.math.ode.SwitchingFunctionsHandler switchingFunctionsHandler29 = new org.apache.commons.math.ode.SwitchingFunctionsHandler();
        org.apache.commons.math.ode.SwitchingFunction switchingFunction30 = null;
        switchingFunctionsHandler29.add(switchingFunction30, (double) (byte) 100, (double) (-1), (int) (byte) 0);
        org.apache.commons.math.ode.SwitchingFunction switchingFunction35 = null;
        switchingFunctionsHandler29.add(switchingFunction35, (double) (short) 0, (double) (short) 0, (int) '#');
        org.apache.commons.math.ode.SwitchingFunctionsHandler switchingFunctionsHandler41 = new org.apache.commons.math.ode.SwitchingFunctionsHandler();
        double[] doubleArray45 = new double[] { (-1.0f), 1.0d };
        boolean boolean46 = switchingFunctionsHandler41.reset((double) (byte) 10, doubleArray45);
        org.apache.commons.math.ode.StepInterpolator stepInterpolator47 = null;
        boolean boolean48 = switchingFunctionsHandler41.evaluateStep(stepInterpolator47);
        org.apache.commons.math.ode.StepInterpolator stepInterpolator49 = null;
        boolean boolean50 = switchingFunctionsHandler41.evaluateStep(stepInterpolator49);
        org.apache.commons.math.ode.SwitchingFunctionsHandler switchingFunctionsHandler52 = new org.apache.commons.math.ode.SwitchingFunctionsHandler();
        double[] doubleArray58 = new double[] { 3, (byte) 0, 100.0d, 100 };
        switchingFunctionsHandler52.stepAccepted((double) (short) 0, doubleArray58);
        switchingFunctionsHandler41.stepAccepted((double) (-1.0f), doubleArray58);
        org.apache.commons.math.ode.SwitchingFunctionsHandler switchingFunctionsHandler62 = new org.apache.commons.math.ode.SwitchingFunctionsHandler();
        double double63 = switchingFunctionsHandler62.getEventTime();
        double double64 = switchingFunctionsHandler62.getEventTime();
        org.apache.commons.math.ode.SwitchingFunctionsHandler switchingFunctionsHandler66 = new org.apache.commons.math.ode.SwitchingFunctionsHandler();
        double[] doubleArray70 = new double[] { (-1.0f), 1.0d };
        boolean boolean71 = switchingFunctionsHandler66.reset((double) (byte) 10, doubleArray70);
        org.apache.commons.math.ode.StepInterpolator stepInterpolator72 = null;
        boolean boolean73 = switchingFunctionsHandler66.evaluateStep(stepInterpolator72);
        org.apache.commons.math.ode.SwitchingFunctionsHandler switchingFunctionsHandler75 = new org.apache.commons.math.ode.SwitchingFunctionsHandler();
        double[] doubleArray79 = new double[] { (-1.0f), 1.0d };
        boolean boolean80 = switchingFunctionsHandler75.reset((double) (byte) 10, doubleArray79);
        double[] doubleArray86 = new double[] { 10, 0.0d, '4', 1.0d };
        boolean boolean87 = switchingFunctionsHandler75.reset((double) (-1), doubleArray86);
        switchingFunctionsHandler66.stepAccepted(0.0d, doubleArray86);
        switchingFunctionsHandler62.stepAccepted((double) (-1L), doubleArray86);
        boolean boolean90 = switchingFunctionsHandler41.reset((double) 2, doubleArray86);
        boolean boolean91 = switchingFunctionsHandler29.reset(0.0d, doubleArray86);
        boolean boolean92 = switchingFunctionsHandler0.reset((double) 1, doubleArray86);
        boolean boolean93 = switchingFunctionsHandler0.isEmpty();
        double double94 = switchingFunctionsHandler0.getEventTime();
        org.junit.Assert.assertNotNull(doubleArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray6), "[3.0, 0.0, 100.0, 100.0]");
        org.junit.Assert.assertNotNull(doubleArray13);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray13), "[-1.0, 1.0]");
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertNotNull(doubleArray23);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray23), "[NaN, 100.0, 100.0, 100.0, 0.0, 10.0]");
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + false + "'", boolean27 == false);
        org.junit.Assert.assertNotNull(doubleArray45);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray45), "[-1.0, 1.0]");
        org.junit.Assert.assertTrue("'" + boolean46 + "' != '" + false + "'", boolean46 == false);
        org.junit.Assert.assertTrue("'" + boolean48 + "' != '" + false + "'", boolean48 == false);
        org.junit.Assert.assertTrue("'" + boolean50 + "' != '" + false + "'", boolean50 == false);
        org.junit.Assert.assertNotNull(doubleArray58);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray58), "[3.0, 0.0, 100.0, 100.0]");
        org.junit.Assert.assertTrue(Double.isNaN(double63));
        org.junit.Assert.assertTrue(Double.isNaN(double64));
        org.junit.Assert.assertNotNull(doubleArray70);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray70), "[-1.0, 1.0]");
        org.junit.Assert.assertTrue("'" + boolean71 + "' != '" + false + "'", boolean71 == false);
        org.junit.Assert.assertTrue("'" + boolean73 + "' != '" + false + "'", boolean73 == false);
        org.junit.Assert.assertNotNull(doubleArray79);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray79), "[-1.0, 1.0]");
        org.junit.Assert.assertTrue("'" + boolean80 + "' != '" + false + "'", boolean80 == false);
        org.junit.Assert.assertNotNull(doubleArray86);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray86), "[10.0, 0.0, 52.0, 1.0]");
        org.junit.Assert.assertTrue("'" + boolean87 + "' != '" + false + "'", boolean87 == false);
        org.junit.Assert.assertTrue("'" + boolean90 + "' != '" + false + "'", boolean90 == false);
        org.junit.Assert.assertTrue("'" + boolean91 + "' != '" + false + "'", boolean91 == false);
        org.junit.Assert.assertTrue("'" + boolean92 + "' != '" + false + "'", boolean92 == false);
        org.junit.Assert.assertTrue("'" + boolean93 + "' != '" + true + "'", boolean93 == true);
        org.junit.Assert.assertTrue(Double.isNaN(double94));
    }

    @Test
    public void test16038() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest32.test16038");
        java.lang.String[] strArray6 = new java.lang.String[] { "hi!" };
        org.apache.commons.math.ode.DerivativeException derivativeException7 = new org.apache.commons.math.ode.DerivativeException("hi!", strArray6);
        org.apache.commons.math.ConvergenceException convergenceException8 = new org.apache.commons.math.ConvergenceException("org.apache.commons.math.ode.DerivativeException: hi!", (java.lang.Object[]) strArray6);
        org.apache.commons.math.FunctionEvaluationException functionEvaluationException9 = new org.apache.commons.math.FunctionEvaluationException((double) 10, "Evaluation failed for argument = {0}", (java.lang.Object[]) strArray6);
        org.apache.commons.math.ConvergenceException convergenceException10 = new org.apache.commons.math.ConvergenceException("org.apache.commons.math.ode.IntegratorException: org.apache.commons.math.ode.DerivativeException: hi!", (java.lang.Object[]) strArray6);
        org.apache.commons.math.ode.IntegratorException integratorException11 = new org.apache.commons.math.ode.IntegratorException((java.lang.Throwable) convergenceException10);
        java.lang.Class<?> wildcardClass12 = convergenceException10.getClass();
        org.junit.Assert.assertNotNull(strArray6);
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test16039() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest32.test16039");
        org.apache.commons.math.FunctionEvaluationException functionEvaluationException6 = new org.apache.commons.math.FunctionEvaluationException((double) 'a');
        java.lang.Throwable[] throwableArray7 = functionEvaluationException6.getSuppressed();
        org.apache.commons.math.FunctionEvaluationException functionEvaluationException9 = new org.apache.commons.math.FunctionEvaluationException((double) 'a');
        org.apache.commons.math.FunctionEvaluationException functionEvaluationException12 = new org.apache.commons.math.FunctionEvaluationException((double) 'a');
        org.apache.commons.math.ConvergenceException convergenceException13 = new org.apache.commons.math.ConvergenceException("hi!", (java.lang.Throwable) functionEvaluationException12);
        functionEvaluationException9.addSuppressed((java.lang.Throwable) convergenceException13);
        org.apache.commons.math.FunctionEvaluationException functionEvaluationException15 = new org.apache.commons.math.FunctionEvaluationException((double) (byte) -1, "org.apache.commons.math.ode.DerivativeException: hi!", (java.lang.Object[]) throwableArray7, (java.lang.Throwable) functionEvaluationException9);
        org.apache.commons.math.ode.DerivativeException derivativeException16 = new org.apache.commons.math.ode.DerivativeException((java.lang.Throwable) functionEvaluationException15);
        java.lang.Throwable[] throwableArray17 = functionEvaluationException15.getSuppressed();
        org.apache.commons.math.FunctionEvaluationException functionEvaluationException18 = new org.apache.commons.math.FunctionEvaluationException((double) 1, "hi!", (java.lang.Object[]) throwableArray17);
        java.lang.String[] strArray30 = new java.lang.String[] { "hi!" };
        org.apache.commons.math.ode.DerivativeException derivativeException31 = new org.apache.commons.math.ode.DerivativeException("hi!", strArray30);
        org.apache.commons.math.FunctionEvaluationException functionEvaluationException32 = new org.apache.commons.math.FunctionEvaluationException((double) (byte) 100, "", (java.lang.Object[]) strArray30);
        org.apache.commons.math.ConvergenceException convergenceException33 = new org.apache.commons.math.ConvergenceException("hi!", (java.lang.Object[]) strArray30);
        org.apache.commons.math.ode.IntegratorException integratorException34 = new org.apache.commons.math.ode.IntegratorException("org.apache.commons.math.ConvergenceException: ", (java.lang.Object[]) strArray30);
        org.apache.commons.math.ode.DerivativeException derivativeException35 = new org.apache.commons.math.ode.DerivativeException("org.apache.commons.math.ConvergenceException: ", strArray30);
        org.apache.commons.math.ode.DerivativeException derivativeException36 = new org.apache.commons.math.ode.DerivativeException("org.apache.commons.math.ConvergenceException: ", strArray30);
        org.apache.commons.math.FunctionEvaluationException functionEvaluationException38 = new org.apache.commons.math.FunctionEvaluationException((double) 0.0f);
        org.apache.commons.math.ConvergenceException convergenceException39 = new org.apache.commons.math.ConvergenceException("org.apache.commons.math.FunctionEvaluationException: org.apache.commons.math.ode.DerivativeException: hi!", (java.lang.Object[]) strArray30, (java.lang.Throwable) functionEvaluationException38);
        org.apache.commons.math.ConvergenceException convergenceException40 = new org.apache.commons.math.ConvergenceException("", (java.lang.Object[]) strArray30);
        org.apache.commons.math.ConvergenceException convergenceException41 = new org.apache.commons.math.ConvergenceException("org.apache.commons.math.ode.DerivativeException: hi!", (java.lang.Object[]) strArray30);
        functionEvaluationException18.addSuppressed((java.lang.Throwable) convergenceException41);
        org.apache.commons.math.ConvergenceException convergenceException43 = new org.apache.commons.math.ConvergenceException("", (java.lang.Throwable) convergenceException41);
        java.lang.Object[] objArray44 = convergenceException43.getArguments();
        java.lang.Throwable[] throwableArray45 = convergenceException43.getSuppressed();
        java.lang.String str46 = convergenceException43.getPattern();
        org.junit.Assert.assertNotNull(throwableArray7);
        org.junit.Assert.assertNotNull(throwableArray17);
        org.junit.Assert.assertNotNull(strArray30);
        org.junit.Assert.assertNotNull(objArray44);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray44), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray44), "[]");
        org.junit.Assert.assertNotNull(throwableArray45);
        org.junit.Assert.assertEquals("'" + str46 + "' != '" + "" + "'", str46, "");
    }

    @Test
    public void test16040() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest32.test16040");
        java.lang.String[] strArray8 = new java.lang.String[] { "hi!" };
        org.apache.commons.math.ode.DerivativeException derivativeException9 = new org.apache.commons.math.ode.DerivativeException("hi!", strArray8);
        org.apache.commons.math.ode.DerivativeException derivativeException10 = new org.apache.commons.math.ode.DerivativeException("org.apache.commons.math.ode.DerivativeException: Evaluation failed for argument = 1", strArray8);
        org.apache.commons.math.ode.IntegratorException integratorException11 = new org.apache.commons.math.ode.IntegratorException("org.apache.commons.math.ode.DerivativeException: Evaluation failed for argument = hi!", (java.lang.Object[]) strArray8);
        org.apache.commons.math.ode.IntegratorException integratorException12 = new org.apache.commons.math.ode.IntegratorException("org.apache.commons.math.ConvergenceException: org.apache.commons.math.FunctionEvaluationException", (java.lang.Object[]) strArray8);
        java.lang.String[] strArray27 = new java.lang.String[] { "hi!" };
        org.apache.commons.math.ode.DerivativeException derivativeException28 = new org.apache.commons.math.ode.DerivativeException("hi!", strArray27);
        org.apache.commons.math.FunctionEvaluationException functionEvaluationException29 = new org.apache.commons.math.FunctionEvaluationException((double) (byte) 100, "", (java.lang.Object[]) strArray27);
        org.apache.commons.math.ConvergenceException convergenceException30 = new org.apache.commons.math.ConvergenceException("hi!", (java.lang.Object[]) strArray27);
        org.apache.commons.math.ode.DerivativeException derivativeException31 = new org.apache.commons.math.ode.DerivativeException("", strArray27);
        org.apache.commons.math.ode.IntegratorException integratorException32 = new org.apache.commons.math.ode.IntegratorException("", (java.lang.Object[]) strArray27);
        org.apache.commons.math.FunctionEvaluationException functionEvaluationException33 = new org.apache.commons.math.FunctionEvaluationException(10.0d, "", (java.lang.Object[]) strArray27);
        org.apache.commons.math.ode.IntegratorException integratorException34 = new org.apache.commons.math.ode.IntegratorException("hi!", (java.lang.Object[]) strArray27);
        org.apache.commons.math.ode.DerivativeException derivativeException35 = new org.apache.commons.math.ode.DerivativeException("org.apache.commons.math.ode.DerivativeException: Evaluation failed for argument = 1", strArray27);
        java.lang.String[] strArray47 = new java.lang.String[] { "hi!" };
        org.apache.commons.math.ode.DerivativeException derivativeException48 = new org.apache.commons.math.ode.DerivativeException("hi!", strArray47);
        org.apache.commons.math.FunctionEvaluationException functionEvaluationException49 = new org.apache.commons.math.FunctionEvaluationException((double) (byte) 100, "", (java.lang.Object[]) strArray47);
        org.apache.commons.math.ConvergenceException convergenceException50 = new org.apache.commons.math.ConvergenceException("hi!", (java.lang.Object[]) strArray47);
        org.apache.commons.math.ode.DerivativeException derivativeException51 = new org.apache.commons.math.ode.DerivativeException("", strArray47);
        org.apache.commons.math.ode.IntegratorException integratorException52 = new org.apache.commons.math.ode.IntegratorException("", (java.lang.Object[]) strArray47);
        org.apache.commons.math.FunctionEvaluationException functionEvaluationException53 = new org.apache.commons.math.FunctionEvaluationException(10.0d, "", (java.lang.Object[]) strArray47);
        org.apache.commons.math.ode.IntegratorException integratorException54 = new org.apache.commons.math.ode.IntegratorException("hi!", (java.lang.Object[]) strArray47);
        org.apache.commons.math.ode.DerivativeException derivativeException55 = new org.apache.commons.math.ode.DerivativeException("org.apache.commons.math.ode.DerivativeException: Evaluation failed for argument = 1", strArray47);
        java.lang.Object[] objArray62 = new java.lang.Object[] { 10.0d };
        org.apache.commons.math.FunctionEvaluationException functionEvaluationException65 = new org.apache.commons.math.FunctionEvaluationException((double) 'a');
        org.apache.commons.math.ConvergenceException convergenceException66 = new org.apache.commons.math.ConvergenceException("hi!", (java.lang.Throwable) functionEvaluationException65);
        org.apache.commons.math.FunctionEvaluationException functionEvaluationException67 = new org.apache.commons.math.FunctionEvaluationException((double) 0L, "org.apache.commons.math.ode.DerivativeException: hi!", objArray62, (java.lang.Throwable) convergenceException66);
        org.apache.commons.math.ConvergenceException convergenceException68 = new org.apache.commons.math.ConvergenceException("org.apache.commons.math.FunctionEvaluationException: ", objArray62);
        org.apache.commons.math.ConvergenceException convergenceException69 = new org.apache.commons.math.ConvergenceException("", objArray62);
        org.apache.commons.math.ode.IntegratorException integratorException70 = new org.apache.commons.math.ode.IntegratorException("", objArray62);
        derivativeException55.addSuppressed((java.lang.Throwable) integratorException70);
        org.apache.commons.math.FunctionEvaluationException functionEvaluationException72 = new org.apache.commons.math.FunctionEvaluationException((double) 'a', "org.apache.commons.math.ode.DerivativeException: org.apache.commons.math.ConvergenceException: org.apache.commons.math.ode.DerivativeException: hi!", (java.lang.Object[]) strArray27, (java.lang.Throwable) integratorException70);
        org.apache.commons.math.FunctionEvaluationException functionEvaluationException75 = new org.apache.commons.math.FunctionEvaluationException((double) 'a');
        org.apache.commons.math.FunctionEvaluationException functionEvaluationException78 = new org.apache.commons.math.FunctionEvaluationException((double) 'a');
        org.apache.commons.math.ConvergenceException convergenceException79 = new org.apache.commons.math.ConvergenceException("hi!", (java.lang.Throwable) functionEvaluationException78);
        functionEvaluationException75.addSuppressed((java.lang.Throwable) convergenceException79);
        org.apache.commons.math.FunctionEvaluationException functionEvaluationException81 = new org.apache.commons.math.FunctionEvaluationException((double) (byte) 10, (java.lang.Throwable) functionEvaluationException75);
        org.apache.commons.math.ConvergenceException convergenceException82 = new org.apache.commons.math.ConvergenceException("org.apache.commons.math.ConvergenceException: org.apache.commons.math.ode.IntegratorException: Evaluation failed for argument = {0}", (java.lang.Object[]) strArray27, (java.lang.Throwable) functionEvaluationException81);
        double double83 = functionEvaluationException81.getArgument();
        org.apache.commons.math.FunctionEvaluationException functionEvaluationException84 = new org.apache.commons.math.FunctionEvaluationException((double) 'a', "org.apache.commons.math.ode.IntegratorException: Evaluation failed for argument = 97", (java.lang.Object[]) strArray8, (java.lang.Throwable) functionEvaluationException81);
        double double85 = functionEvaluationException81.getArgument();
        org.apache.commons.math.FunctionEvaluationException functionEvaluationException86 = new org.apache.commons.math.FunctionEvaluationException(0.0d, (java.lang.Throwable) functionEvaluationException81);
        org.junit.Assert.assertNotNull(strArray8);
        org.junit.Assert.assertNotNull(strArray27);
        org.junit.Assert.assertNotNull(strArray47);
        org.junit.Assert.assertNotNull(objArray62);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray62), "[10.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray62), "[10.0]");
        org.junit.Assert.assertTrue("'" + double83 + "' != '" + 10.0d + "'", double83 == 10.0d);
        org.junit.Assert.assertTrue("'" + double85 + "' != '" + 10.0d + "'", double85 == 10.0d);
    }

    @Test
    public void test16041() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest32.test16041");
        java.lang.Object[] objArray11 = new java.lang.Object[] { 10.0d };
        org.apache.commons.math.FunctionEvaluationException functionEvaluationException14 = new org.apache.commons.math.FunctionEvaluationException((double) 'a');
        org.apache.commons.math.ConvergenceException convergenceException15 = new org.apache.commons.math.ConvergenceException("hi!", (java.lang.Throwable) functionEvaluationException14);
        org.apache.commons.math.FunctionEvaluationException functionEvaluationException16 = new org.apache.commons.math.FunctionEvaluationException((double) 0L, "org.apache.commons.math.ode.DerivativeException: hi!", objArray11, (java.lang.Throwable) convergenceException15);
        org.apache.commons.math.FunctionEvaluationException functionEvaluationException17 = new org.apache.commons.math.FunctionEvaluationException((double) 100.0f, "org.apache.commons.math.ConvergenceException: hi!", (java.lang.Throwable) functionEvaluationException16);
        org.apache.commons.math.ode.DerivativeException derivativeException18 = new org.apache.commons.math.ode.DerivativeException((java.lang.Throwable) functionEvaluationException16);
        java.lang.Throwable[] throwableArray19 = functionEvaluationException16.getSuppressed();
        org.apache.commons.math.FunctionEvaluationException functionEvaluationException27 = new org.apache.commons.math.FunctionEvaluationException((double) 'a');
        org.apache.commons.math.ConvergenceException convergenceException28 = new org.apache.commons.math.ConvergenceException("hi!", (java.lang.Throwable) functionEvaluationException27);
        java.lang.Throwable[] throwableArray29 = functionEvaluationException27.getSuppressed();
        org.apache.commons.math.ConvergenceException convergenceException30 = new org.apache.commons.math.ConvergenceException("", (java.lang.Object[]) throwableArray29);
        org.apache.commons.math.FunctionEvaluationException functionEvaluationException31 = new org.apache.commons.math.FunctionEvaluationException((double) 10.0f, "org.apache.commons.math.ode.DerivativeException: hi!", (java.lang.Object[]) throwableArray29);
        org.apache.commons.math.FunctionEvaluationException functionEvaluationException36 = new org.apache.commons.math.FunctionEvaluationException((double) 'a');
        org.apache.commons.math.ode.IntegratorException integratorException37 = new org.apache.commons.math.ode.IntegratorException((java.lang.Throwable) functionEvaluationException36);
        java.lang.Object[] objArray38 = integratorException37.getArguments();
        org.apache.commons.math.FunctionEvaluationException functionEvaluationException40 = new org.apache.commons.math.FunctionEvaluationException((double) 10.0f);
        org.apache.commons.math.FunctionEvaluationException functionEvaluationException41 = new org.apache.commons.math.FunctionEvaluationException((double) 10.0f, "org.apache.commons.math.ConvergenceException: ", objArray38, (java.lang.Throwable) functionEvaluationException40);
        org.apache.commons.math.ode.IntegratorException integratorException42 = new org.apache.commons.math.ode.IntegratorException("org.apache.commons.math.ConvergenceException: org.apache.commons.math.FunctionEvaluationException: org.apache.commons.math.ode.DerivativeException: hi!", objArray38);
        org.apache.commons.math.ConvergenceException convergenceException43 = new org.apache.commons.math.ConvergenceException((java.lang.Throwable) integratorException42);
        org.apache.commons.math.FunctionEvaluationException functionEvaluationException44 = new org.apache.commons.math.FunctionEvaluationException(10.0d, "hi!", (java.lang.Object[]) throwableArray29, (java.lang.Throwable) integratorException42);
        org.apache.commons.math.FunctionEvaluationException functionEvaluationException45 = new org.apache.commons.math.FunctionEvaluationException((double) 0L, "org.apache.commons.math.ode.DerivativeException: hi!", (java.lang.Object[]) throwableArray19, (java.lang.Throwable) functionEvaluationException44);
        org.apache.commons.math.ode.IntegratorException integratorException46 = new org.apache.commons.math.ode.IntegratorException((java.lang.Throwable) functionEvaluationException44);
        java.lang.Throwable[] throwableArray47 = functionEvaluationException44.getSuppressed();
        org.apache.commons.math.FunctionEvaluationException functionEvaluationException48 = new org.apache.commons.math.FunctionEvaluationException((double) (byte) 1, "org.apache.commons.math.FunctionEvaluationException", (java.lang.Object[]) throwableArray47);
        java.lang.String[] strArray63 = new java.lang.String[] { "hi!" };
        org.apache.commons.math.ode.DerivativeException derivativeException64 = new org.apache.commons.math.ode.DerivativeException("hi!", strArray63);
        org.apache.commons.math.FunctionEvaluationException functionEvaluationException65 = new org.apache.commons.math.FunctionEvaluationException((double) (byte) 100, "", (java.lang.Object[]) strArray63);
        org.apache.commons.math.ConvergenceException convergenceException66 = new org.apache.commons.math.ConvergenceException("hi!", (java.lang.Object[]) strArray63);
        org.apache.commons.math.ode.DerivativeException derivativeException67 = new org.apache.commons.math.ode.DerivativeException("", strArray63);
        org.apache.commons.math.ode.IntegratorException integratorException68 = new org.apache.commons.math.ode.IntegratorException("", (java.lang.Object[]) strArray63);
        org.apache.commons.math.FunctionEvaluationException functionEvaluationException69 = new org.apache.commons.math.FunctionEvaluationException(10.0d, "", (java.lang.Object[]) strArray63);
        org.apache.commons.math.ode.IntegratorException integratorException70 = new org.apache.commons.math.ode.IntegratorException("hi!", (java.lang.Object[]) strArray63);
        org.apache.commons.math.FunctionEvaluationException functionEvaluationException71 = new org.apache.commons.math.FunctionEvaluationException(3.0d, "org.apache.commons.math.ode.IntegratorException: org.apache.commons.math.ConvergenceException: ", (java.lang.Object[]) strArray63);
        org.apache.commons.math.FunctionEvaluationException functionEvaluationException74 = new org.apache.commons.math.FunctionEvaluationException((double) (byte) 100, "");
        org.apache.commons.math.ConvergenceException convergenceException75 = new org.apache.commons.math.ConvergenceException("org.apache.commons.math.ConvergenceException: org.apache.commons.math.ConvergenceException: org.apache.commons.math.ConvergenceException: hi!", (java.lang.Object[]) strArray63, (java.lang.Throwable) functionEvaluationException74);
        org.apache.commons.math.ode.DerivativeException derivativeException76 = new org.apache.commons.math.ode.DerivativeException("org.apache.commons.math.ConvergenceException: org.apache.commons.math.ConvergenceException: org.apache.commons.math.FunctionEvaluationException: org.apache.commons.math.ode.DerivativeException: hi!", strArray63);
        org.apache.commons.math.ConvergenceException convergenceException77 = new org.apache.commons.math.ConvergenceException("org.apache.commons.math.FunctionEvaluationException: org.apache.commons.math.ode.IntegratorException: hi!", (java.lang.Object[]) throwableArray47, (java.lang.Throwable) derivativeException76);
        org.apache.commons.math.FunctionEvaluationException functionEvaluationException82 = new org.apache.commons.math.FunctionEvaluationException(32.0d, "org.apache.commons.math.ode.IntegratorException: Evaluation failed for argument = 2");
        org.apache.commons.math.FunctionEvaluationException functionEvaluationException83 = new org.apache.commons.math.FunctionEvaluationException(52.0d, "org.apache.commons.math.ConvergenceException: org.apache.commons.math.ConvergenceException: org.apache.commons.math.ConvergenceException: Evaluation failed for argument = 97", (java.lang.Throwable) functionEvaluationException82);
        java.lang.String str84 = functionEvaluationException83.getPattern();
        org.apache.commons.math.ConvergenceException convergenceException85 = new org.apache.commons.math.ConvergenceException("org.apache.commons.math.ode.IntegratorException: org.apache.commons.math.ConvergenceException", (java.lang.Object[]) throwableArray47, (java.lang.Throwable) functionEvaluationException83);
        org.junit.Assert.assertNotNull(objArray11);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray11), "[10.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray11), "[10.0]");
        org.junit.Assert.assertNotNull(throwableArray19);
        org.junit.Assert.assertNotNull(throwableArray29);
        org.junit.Assert.assertNotNull(objArray38);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray38), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray38), "[]");
        org.junit.Assert.assertNotNull(throwableArray47);
        org.junit.Assert.assertNotNull(strArray63);
        org.junit.Assert.assertEquals("'" + str84 + "' != '" + "org.apache.commons.math.ConvergenceException: org.apache.commons.math.ConvergenceException: org.apache.commons.math.ConvergenceException: Evaluation failed for argument = 97" + "'", str84, "org.apache.commons.math.ConvergenceException: org.apache.commons.math.ConvergenceException: org.apache.commons.math.ConvergenceException: Evaluation failed for argument = 97");
    }

    @Test
    public void test16042() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest32.test16042");
        java.lang.Object[] objArray11 = new java.lang.Object[] { 10.0d };
        org.apache.commons.math.FunctionEvaluationException functionEvaluationException14 = new org.apache.commons.math.FunctionEvaluationException((double) 'a');
        org.apache.commons.math.ConvergenceException convergenceException15 = new org.apache.commons.math.ConvergenceException("hi!", (java.lang.Throwable) functionEvaluationException14);
        org.apache.commons.math.FunctionEvaluationException functionEvaluationException16 = new org.apache.commons.math.FunctionEvaluationException((double) 0L, "org.apache.commons.math.ode.DerivativeException: hi!", objArray11, (java.lang.Throwable) convergenceException15);
        org.apache.commons.math.FunctionEvaluationException functionEvaluationException17 = new org.apache.commons.math.FunctionEvaluationException(10.0d, "org.apache.commons.math.ConvergenceException: ", objArray11);
        org.apache.commons.math.FunctionEvaluationException functionEvaluationException18 = new org.apache.commons.math.FunctionEvaluationException((double) 0L, "org.apache.commons.math.ConvergenceException: ", objArray11);
        org.apache.commons.math.FunctionEvaluationException functionEvaluationException22 = new org.apache.commons.math.FunctionEvaluationException((double) 10L, "Evaluation failed for argument = 97");
        org.apache.commons.math.ConvergenceException convergenceException23 = new org.apache.commons.math.ConvergenceException("", (java.lang.Throwable) functionEvaluationException22);
        org.apache.commons.math.ConvergenceException convergenceException24 = new org.apache.commons.math.ConvergenceException("org.apache.commons.math.ode.DerivativeException", objArray11, (java.lang.Throwable) functionEvaluationException22);
        org.apache.commons.math.FunctionEvaluationException functionEvaluationException25 = new org.apache.commons.math.FunctionEvaluationException((double) 10.0f, "org.apache.commons.math.FunctionEvaluationException: Evaluation failed for argument = 1", (java.lang.Throwable) functionEvaluationException22);
        org.apache.commons.math.ConvergenceException convergenceException26 = new org.apache.commons.math.ConvergenceException((java.lang.Throwable) functionEvaluationException25);
        java.lang.String str27 = functionEvaluationException25.getPattern();
        org.apache.commons.math.FunctionEvaluationException functionEvaluationException28 = new org.apache.commons.math.FunctionEvaluationException((double) (short) -1, (java.lang.Throwable) functionEvaluationException25);
        double double29 = functionEvaluationException25.getArgument();
        org.junit.Assert.assertNotNull(objArray11);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray11), "[10.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray11), "[10.0]");
        org.junit.Assert.assertEquals("'" + str27 + "' != '" + "org.apache.commons.math.FunctionEvaluationException: Evaluation failed for argument = 1" + "'", str27, "org.apache.commons.math.FunctionEvaluationException: Evaluation failed for argument = 1");
        org.junit.Assert.assertTrue("'" + double29 + "' != '" + 10.0d + "'", double29 == 10.0d);
    }

    @Test
    public void test16043() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest32.test16043");
        org.apache.commons.math.FunctionEvaluationException functionEvaluationException5 = new org.apache.commons.math.FunctionEvaluationException((double) 'a');
        org.apache.commons.math.ConvergenceException convergenceException6 = new org.apache.commons.math.ConvergenceException("hi!", (java.lang.Throwable) functionEvaluationException5);
        java.lang.Throwable[] throwableArray7 = functionEvaluationException5.getSuppressed();
        org.apache.commons.math.ConvergenceException convergenceException8 = new org.apache.commons.math.ConvergenceException("", (java.lang.Object[]) throwableArray7);
        java.lang.Object[] objArray14 = new java.lang.Object[] { 10.0d };
        org.apache.commons.math.FunctionEvaluationException functionEvaluationException17 = new org.apache.commons.math.FunctionEvaluationException((double) 'a');
        org.apache.commons.math.ConvergenceException convergenceException18 = new org.apache.commons.math.ConvergenceException("hi!", (java.lang.Throwable) functionEvaluationException17);
        org.apache.commons.math.FunctionEvaluationException functionEvaluationException19 = new org.apache.commons.math.FunctionEvaluationException((double) 0L, "org.apache.commons.math.ode.DerivativeException: hi!", objArray14, (java.lang.Throwable) convergenceException18);
        org.apache.commons.math.FunctionEvaluationException functionEvaluationException20 = new org.apache.commons.math.FunctionEvaluationException((double) 100L, "", objArray14);
        convergenceException8.addSuppressed((java.lang.Throwable) functionEvaluationException20);
        java.lang.String str22 = convergenceException8.getPattern();
        java.lang.Object[] objArray23 = convergenceException8.getArguments();
        org.apache.commons.math.ConvergenceException convergenceException24 = new org.apache.commons.math.ConvergenceException("org.apache.commons.math.ConvergenceException: org.apache.commons.math.ConvergenceException: ", objArray23);
        org.apache.commons.math.ode.DerivativeException derivativeException25 = new org.apache.commons.math.ode.DerivativeException((java.lang.Throwable) convergenceException24);
        org.apache.commons.math.ConvergenceException convergenceException26 = new org.apache.commons.math.ConvergenceException("org.apache.commons.math.ConvergenceException: org.apache.commons.math.ode.IntegratorException: org.apache.commons.math.FunctionEvaluationException: org.apache.commons.math.FunctionEvaluationException: org.apache.commons.math.FunctionEvaluationException: ", (java.lang.Throwable) convergenceException24);
        org.apache.commons.math.ode.IntegratorException integratorException27 = new org.apache.commons.math.ode.IntegratorException((java.lang.Throwable) convergenceException24);
        org.junit.Assert.assertNotNull(throwableArray7);
        org.junit.Assert.assertNotNull(objArray14);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray14), "[10.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray14), "[10.0]");
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "" + "'", str22, "");
        org.junit.Assert.assertNotNull(objArray23);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray23), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray23), "[]");
    }

    @Test
    public void test16044() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest32.test16044");
        java.lang.String[] strArray9 = new java.lang.String[] { "hi!" };
        org.apache.commons.math.ode.DerivativeException derivativeException10 = new org.apache.commons.math.ode.DerivativeException("hi!", strArray9);
        org.apache.commons.math.FunctionEvaluationException functionEvaluationException11 = new org.apache.commons.math.FunctionEvaluationException((double) (byte) 100, "", (java.lang.Object[]) strArray9);
        org.apache.commons.math.ConvergenceException convergenceException12 = new org.apache.commons.math.ConvergenceException("hi!", (java.lang.Object[]) strArray9);
        org.apache.commons.math.ode.DerivativeException derivativeException13 = new org.apache.commons.math.ode.DerivativeException("org.apache.commons.math.ConvergenceException: hi!", strArray9);
        org.apache.commons.math.ConvergenceException convergenceException14 = new org.apache.commons.math.ConvergenceException("", (java.lang.Object[]) strArray9);
        java.lang.String[] strArray28 = new java.lang.String[] { "hi!" };
        org.apache.commons.math.ode.DerivativeException derivativeException29 = new org.apache.commons.math.ode.DerivativeException("hi!", strArray28);
        org.apache.commons.math.FunctionEvaluationException functionEvaluationException30 = new org.apache.commons.math.FunctionEvaluationException((double) (byte) 100, "", (java.lang.Object[]) strArray28);
        org.apache.commons.math.ConvergenceException convergenceException31 = new org.apache.commons.math.ConvergenceException("hi!", (java.lang.Object[]) strArray28);
        org.apache.commons.math.ode.DerivativeException derivativeException32 = new org.apache.commons.math.ode.DerivativeException("", strArray28);
        org.apache.commons.math.ode.DerivativeException derivativeException33 = new org.apache.commons.math.ode.DerivativeException("org.apache.commons.math.FunctionEvaluationException: Evaluation failed for argument = 97", strArray28);
        java.lang.String[] strArray38 = new java.lang.String[] { "hi!" };
        org.apache.commons.math.ode.DerivativeException derivativeException39 = new org.apache.commons.math.ode.DerivativeException("hi!", strArray38);
        org.apache.commons.math.FunctionEvaluationException functionEvaluationException40 = new org.apache.commons.math.FunctionEvaluationException((double) (byte) 100, "", (java.lang.Object[]) strArray38);
        org.apache.commons.math.FunctionEvaluationException functionEvaluationException41 = new org.apache.commons.math.FunctionEvaluationException((double) (-1L), "Evaluation failed for argument = 97", (java.lang.Object[]) strArray28, (java.lang.Throwable) functionEvaluationException40);
        org.apache.commons.math.ode.IntegratorException integratorException42 = new org.apache.commons.math.ode.IntegratorException("org.apache.commons.math.ode.DerivativeException: org.apache.commons.math.ode.DerivativeException: hi!", (java.lang.Object[]) strArray28);
        java.lang.String[] strArray52 = new java.lang.String[] { "hi!" };
        org.apache.commons.math.ode.DerivativeException derivativeException53 = new org.apache.commons.math.ode.DerivativeException("hi!", strArray52);
        org.apache.commons.math.FunctionEvaluationException functionEvaluationException54 = new org.apache.commons.math.FunctionEvaluationException((double) (byte) 100, "", (java.lang.Object[]) strArray52);
        org.apache.commons.math.ConvergenceException convergenceException55 = new org.apache.commons.math.ConvergenceException("hi!", (java.lang.Object[]) strArray52);
        org.apache.commons.math.ode.DerivativeException derivativeException56 = new org.apache.commons.math.ode.DerivativeException("", strArray52);
        org.apache.commons.math.ode.IntegratorException integratorException57 = new org.apache.commons.math.ode.IntegratorException("", (java.lang.Object[]) strArray52);
        org.apache.commons.math.FunctionEvaluationException functionEvaluationException58 = new org.apache.commons.math.FunctionEvaluationException(10.0d, "", (java.lang.Object[]) strArray52);
        org.apache.commons.math.ConvergenceException convergenceException59 = new org.apache.commons.math.ConvergenceException((java.lang.Throwable) functionEvaluationException58);
        org.apache.commons.math.FunctionEvaluationException functionEvaluationException60 = new org.apache.commons.math.FunctionEvaluationException(0.0d, "org.apache.commons.math.FunctionEvaluationException: org.apache.commons.math.FunctionEvaluationException: ", (java.lang.Object[]) strArray28, (java.lang.Throwable) functionEvaluationException58);
        org.apache.commons.math.FunctionEvaluationException functionEvaluationException65 = new org.apache.commons.math.FunctionEvaluationException((double) 'a');
        org.apache.commons.math.ConvergenceException convergenceException66 = new org.apache.commons.math.ConvergenceException("hi!", (java.lang.Throwable) functionEvaluationException65);
        java.lang.Throwable[] throwableArray67 = functionEvaluationException65.getSuppressed();
        org.apache.commons.math.ConvergenceException convergenceException68 = new org.apache.commons.math.ConvergenceException("", (java.lang.Object[]) throwableArray67);
        org.apache.commons.math.ConvergenceException convergenceException69 = new org.apache.commons.math.ConvergenceException((java.lang.Throwable) convergenceException68);
        org.apache.commons.math.ConvergenceException convergenceException70 = new org.apache.commons.math.ConvergenceException("org.apache.commons.math.ode.IntegratorException: org.apache.commons.math.FunctionEvaluationException: org.apache.commons.math.ode.DerivativeException: hi!", (java.lang.Throwable) convergenceException69);
        java.lang.String str71 = convergenceException70.getPattern();
        java.lang.Throwable throwable72 = null;
        org.apache.commons.math.ode.DerivativeException derivativeException73 = new org.apache.commons.math.ode.DerivativeException(throwable72);
        org.apache.commons.math.ConvergenceException convergenceException74 = new org.apache.commons.math.ConvergenceException((java.lang.Throwable) derivativeException73);
        convergenceException70.addSuppressed((java.lang.Throwable) derivativeException73);
        org.apache.commons.math.ConvergenceException convergenceException76 = new org.apache.commons.math.ConvergenceException("org.apache.commons.math.FunctionEvaluationException: Evaluation failed for argument = 35", (java.lang.Object[]) strArray28, (java.lang.Throwable) convergenceException70);
        org.apache.commons.math.ConvergenceException convergenceException77 = new org.apache.commons.math.ConvergenceException((java.lang.Throwable) convergenceException70);
        org.apache.commons.math.ode.IntegratorException integratorException78 = new org.apache.commons.math.ode.IntegratorException((java.lang.Throwable) convergenceException70);
        org.apache.commons.math.FunctionEvaluationException functionEvaluationException79 = new org.apache.commons.math.FunctionEvaluationException((double) 1, "org.apache.commons.math.FunctionEvaluationException: org.apache.commons.math.ConvergenceException: org.apache.commons.math.ode.DerivativeException: org.apache.commons.math.FunctionEvaluationException: hi!", (java.lang.Object[]) strArray9, (java.lang.Throwable) convergenceException70);
        org.junit.Assert.assertNotNull(strArray9);
        org.junit.Assert.assertNotNull(strArray28);
        org.junit.Assert.assertNotNull(strArray38);
        org.junit.Assert.assertNotNull(strArray52);
        org.junit.Assert.assertNotNull(throwableArray67);
        org.junit.Assert.assertEquals("'" + str71 + "' != '" + "org.apache.commons.math.ode.IntegratorException: org.apache.commons.math.FunctionEvaluationException: org.apache.commons.math.ode.DerivativeException: hi!" + "'", str71, "org.apache.commons.math.ode.IntegratorException: org.apache.commons.math.FunctionEvaluationException: org.apache.commons.math.ode.DerivativeException: hi!");
    }

    @Test
    public void test16045() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest32.test16045");
        org.apache.commons.math.ode.SwitchingFunctionsHandler switchingFunctionsHandler0 = new org.apache.commons.math.ode.SwitchingFunctionsHandler();
        boolean boolean1 = switchingFunctionsHandler0.stop();
        org.apache.commons.math.ode.SwitchingFunctionsHandler switchingFunctionsHandler3 = new org.apache.commons.math.ode.SwitchingFunctionsHandler();
        double[] doubleArray7 = new double[] { (-1.0f), 1.0d };
        boolean boolean8 = switchingFunctionsHandler3.reset((double) (byte) 10, doubleArray7);
        double[] doubleArray14 = new double[] { 10, 0.0d, '4', 1.0d };
        boolean boolean15 = switchingFunctionsHandler3.reset((double) (-1), doubleArray14);
        boolean boolean16 = switchingFunctionsHandler0.reset(97.0d, doubleArray14);
        boolean boolean17 = switchingFunctionsHandler0.isEmpty();
        boolean boolean18 = switchingFunctionsHandler0.isEmpty();
        org.apache.commons.math.ode.SwitchingFunctionsHandler switchingFunctionsHandler20 = new org.apache.commons.math.ode.SwitchingFunctionsHandler();
        boolean boolean21 = switchingFunctionsHandler20.stop();
        org.apache.commons.math.ode.SwitchingFunctionsHandler switchingFunctionsHandler23 = new org.apache.commons.math.ode.SwitchingFunctionsHandler();
        double[] doubleArray27 = new double[] { (-1.0f), 1.0d };
        boolean boolean28 = switchingFunctionsHandler23.reset((double) (byte) 10, doubleArray27);
        double[] doubleArray34 = new double[] { 10, 0.0d, '4', 1.0d };
        boolean boolean35 = switchingFunctionsHandler23.reset((double) (-1), doubleArray34);
        boolean boolean36 = switchingFunctionsHandler20.reset(97.0d, doubleArray34);
        double double37 = switchingFunctionsHandler20.getEventTime();
        double[] doubleArray39 = null;
        boolean boolean40 = switchingFunctionsHandler20.reset((double) 10.0f, doubleArray39);
        org.apache.commons.math.ode.SwitchingFunction switchingFunction41 = null;
        switchingFunctionsHandler20.add(switchingFunction41, (double) 0L, (double) (byte) 1, (-1));
        org.apache.commons.math.ode.SwitchingFunctionsHandler switchingFunctionsHandler47 = new org.apache.commons.math.ode.SwitchingFunctionsHandler();
        double[] doubleArray51 = new double[] { (-1.0f), 1.0d };
        boolean boolean52 = switchingFunctionsHandler47.reset((double) (byte) 10, doubleArray51);
        boolean boolean53 = switchingFunctionsHandler47.isEmpty();
        org.apache.commons.math.ode.SwitchingFunction switchingFunction54 = null;
        switchingFunctionsHandler47.add(switchingFunction54, (double) 'a', 100.0d, 100);
        org.apache.commons.math.ode.SwitchingFunctionsHandler switchingFunctionsHandler60 = new org.apache.commons.math.ode.SwitchingFunctionsHandler();
        double[] doubleArray64 = new double[] { (-1.0f), 1.0d };
        boolean boolean65 = switchingFunctionsHandler60.reset((double) (byte) 10, doubleArray64);
        org.apache.commons.math.ode.StepInterpolator stepInterpolator66 = null;
        boolean boolean67 = switchingFunctionsHandler60.evaluateStep(stepInterpolator66);
        org.apache.commons.math.ode.StepInterpolator stepInterpolator68 = null;
        boolean boolean69 = switchingFunctionsHandler60.evaluateStep(stepInterpolator68);
        org.apache.commons.math.ode.SwitchingFunctionsHandler switchingFunctionsHandler71 = new org.apache.commons.math.ode.SwitchingFunctionsHandler();
        double[] doubleArray77 = new double[] { 3, (byte) 0, 100.0d, 100 };
        switchingFunctionsHandler71.stepAccepted((double) (short) 0, doubleArray77);
        switchingFunctionsHandler60.stepAccepted((double) (-1.0f), doubleArray77);
        boolean boolean80 = switchingFunctionsHandler47.reset((double) (short) -1, doubleArray77);
        boolean boolean81 = switchingFunctionsHandler20.reset((double) (byte) -1, doubleArray77);
        switchingFunctionsHandler0.stepAccepted((double) (short) -1, doubleArray77);
        org.apache.commons.math.ode.StepInterpolator stepInterpolator83 = null;
        boolean boolean84 = switchingFunctionsHandler0.evaluateStep(stepInterpolator83);
        org.apache.commons.math.ode.SwitchingFunction switchingFunction85 = null;
        switchingFunctionsHandler0.add(switchingFunction85, (double) 2, 10.0d, 100);
        double[] doubleArray91 = null;
        boolean boolean92 = switchingFunctionsHandler0.reset((double) 3, doubleArray91);
        double double93 = switchingFunctionsHandler0.getEventTime();
        double double94 = switchingFunctionsHandler0.getEventTime();
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertNotNull(doubleArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray7), "[-1.0, 1.0]");
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNotNull(doubleArray14);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray14), "[10.0, 0.0, 52.0, 1.0]");
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertNotNull(doubleArray27);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray27), "[-1.0, 1.0]");
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + false + "'", boolean28 == false);
        org.junit.Assert.assertNotNull(doubleArray34);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray34), "[10.0, 0.0, 52.0, 1.0]");
        org.junit.Assert.assertTrue("'" + boolean35 + "' != '" + false + "'", boolean35 == false);
        org.junit.Assert.assertTrue("'" + boolean36 + "' != '" + false + "'", boolean36 == false);
        org.junit.Assert.assertTrue(Double.isNaN(double37));
        org.junit.Assert.assertTrue("'" + boolean40 + "' != '" + false + "'", boolean40 == false);
        org.junit.Assert.assertNotNull(doubleArray51);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray51), "[-1.0, 1.0]");
        org.junit.Assert.assertTrue("'" + boolean52 + "' != '" + false + "'", boolean52 == false);
        org.junit.Assert.assertTrue("'" + boolean53 + "' != '" + true + "'", boolean53 == true);
        org.junit.Assert.assertNotNull(doubleArray64);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray64), "[-1.0, 1.0]");
        org.junit.Assert.assertTrue("'" + boolean65 + "' != '" + false + "'", boolean65 == false);
        org.junit.Assert.assertTrue("'" + boolean67 + "' != '" + false + "'", boolean67 == false);
        org.junit.Assert.assertTrue("'" + boolean69 + "' != '" + false + "'", boolean69 == false);
        org.junit.Assert.assertNotNull(doubleArray77);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray77), "[3.0, 0.0, 100.0, 100.0]");
        org.junit.Assert.assertTrue("'" + boolean80 + "' != '" + false + "'", boolean80 == false);
        org.junit.Assert.assertTrue("'" + boolean81 + "' != '" + false + "'", boolean81 == false);
        org.junit.Assert.assertTrue("'" + boolean84 + "' != '" + false + "'", boolean84 == false);
        org.junit.Assert.assertTrue("'" + boolean92 + "' != '" + false + "'", boolean92 == false);
        org.junit.Assert.assertTrue(Double.isNaN(double93));
        org.junit.Assert.assertTrue(Double.isNaN(double94));
    }

    @Test
    public void test16046() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest32.test16046");
        java.lang.String[] strArray6 = new java.lang.String[] { "hi!" };
        org.apache.commons.math.ode.DerivativeException derivativeException7 = new org.apache.commons.math.ode.DerivativeException("hi!", strArray6);
        org.apache.commons.math.ode.DerivativeException derivativeException8 = new org.apache.commons.math.ode.DerivativeException((java.lang.Throwable) derivativeException7);
        org.apache.commons.math.ode.IntegratorException integratorException9 = new org.apache.commons.math.ode.IntegratorException((java.lang.Throwable) derivativeException7);
        org.apache.commons.math.FunctionEvaluationException functionEvaluationException11 = new org.apache.commons.math.FunctionEvaluationException((double) 'a');
        java.lang.Throwable[] throwableArray12 = functionEvaluationException11.getSuppressed();
        org.apache.commons.math.ode.DerivativeException derivativeException13 = new org.apache.commons.math.ode.DerivativeException((java.lang.Throwable) functionEvaluationException11);
        derivativeException7.addSuppressed((java.lang.Throwable) functionEvaluationException11);
        java.lang.Throwable[] throwableArray15 = derivativeException7.getSuppressed();
        java.lang.String[] strArray25 = new java.lang.String[] { "hi!" };
        org.apache.commons.math.ode.DerivativeException derivativeException26 = new org.apache.commons.math.ode.DerivativeException("hi!", strArray25);
        org.apache.commons.math.FunctionEvaluationException functionEvaluationException27 = new org.apache.commons.math.FunctionEvaluationException((double) (byte) 100, "", (java.lang.Object[]) strArray25);
        org.apache.commons.math.ConvergenceException convergenceException28 = new org.apache.commons.math.ConvergenceException("hi!", (java.lang.Object[]) strArray25);
        org.apache.commons.math.ode.IntegratorException integratorException29 = new org.apache.commons.math.ode.IntegratorException("org.apache.commons.math.ConvergenceException: ", (java.lang.Object[]) strArray25);
        org.apache.commons.math.ode.DerivativeException derivativeException30 = new org.apache.commons.math.ode.DerivativeException("org.apache.commons.math.ConvergenceException: ", strArray25);
        org.apache.commons.math.ode.DerivativeException derivativeException31 = new org.apache.commons.math.ode.DerivativeException("org.apache.commons.math.ConvergenceException: ", strArray25);
        org.apache.commons.math.FunctionEvaluationException functionEvaluationException33 = new org.apache.commons.math.FunctionEvaluationException((double) 0.0f);
        org.apache.commons.math.ConvergenceException convergenceException34 = new org.apache.commons.math.ConvergenceException("org.apache.commons.math.FunctionEvaluationException: org.apache.commons.math.ode.DerivativeException: hi!", (java.lang.Object[]) strArray25, (java.lang.Throwable) functionEvaluationException33);
        org.apache.commons.math.FunctionEvaluationException functionEvaluationException35 = new org.apache.commons.math.FunctionEvaluationException((double) (short) 100, "org.apache.commons.math.ConvergenceException: org.apache.commons.math.FunctionEvaluationException: ", (java.lang.Object[]) throwableArray15, (java.lang.Throwable) functionEvaluationException33);
        org.apache.commons.math.ConvergenceException convergenceException36 = new org.apache.commons.math.ConvergenceException("org.apache.commons.math.ConvergenceException", (java.lang.Throwable) functionEvaluationException33);
        java.lang.Object[] objArray37 = functionEvaluationException33.getArguments();
        java.lang.Object[] objArray47 = new java.lang.Object[] { 10.0d };
        org.apache.commons.math.FunctionEvaluationException functionEvaluationException50 = new org.apache.commons.math.FunctionEvaluationException((double) 'a');
        org.apache.commons.math.ConvergenceException convergenceException51 = new org.apache.commons.math.ConvergenceException("hi!", (java.lang.Throwable) functionEvaluationException50);
        org.apache.commons.math.FunctionEvaluationException functionEvaluationException52 = new org.apache.commons.math.FunctionEvaluationException((double) 0L, "org.apache.commons.math.ode.DerivativeException: hi!", objArray47, (java.lang.Throwable) convergenceException51);
        org.apache.commons.math.FunctionEvaluationException functionEvaluationException53 = new org.apache.commons.math.FunctionEvaluationException(10.0d, "org.apache.commons.math.ConvergenceException: ", objArray47);
        org.apache.commons.math.ConvergenceException convergenceException54 = new org.apache.commons.math.ConvergenceException("org.apache.commons.math.FunctionEvaluationException: ", objArray47);
        org.apache.commons.math.ConvergenceException convergenceException55 = new org.apache.commons.math.ConvergenceException("org.apache.commons.math.ode.IntegratorException: Evaluation failed for argument = 2", objArray47);
        org.apache.commons.math.FunctionEvaluationException functionEvaluationException56 = new org.apache.commons.math.FunctionEvaluationException((double) (byte) 1, "org.apache.commons.math.ode.DerivativeException: org.apache.commons.math.FunctionEvaluationException: org.apache.commons.math.ode.DerivativeException: hi!", objArray47);
        functionEvaluationException33.addSuppressed((java.lang.Throwable) functionEvaluationException56);
        org.apache.commons.math.FunctionEvaluationException functionEvaluationException58 = new org.apache.commons.math.FunctionEvaluationException(35.0d, (java.lang.Throwable) functionEvaluationException33);
        double double59 = functionEvaluationException58.getArgument();
        org.junit.Assert.assertNotNull(strArray6);
        org.junit.Assert.assertNotNull(throwableArray12);
        org.junit.Assert.assertNotNull(throwableArray15);
        org.junit.Assert.assertNotNull(strArray25);
        org.junit.Assert.assertNotNull(objArray37);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray37), "[0.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray37), "[0.0]");
        org.junit.Assert.assertNotNull(objArray47);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray47), "[10.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray47), "[10.0]");
        org.junit.Assert.assertTrue("'" + double59 + "' != '" + 35.0d + "'", double59 == 35.0d);
    }

    @Test
    public void test16047() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest32.test16047");
        java.lang.String[] strArray6 = new java.lang.String[] { "hi!" };
        org.apache.commons.math.ode.DerivativeException derivativeException7 = new org.apache.commons.math.ode.DerivativeException("hi!", strArray6);
        org.apache.commons.math.ode.DerivativeException derivativeException8 = new org.apache.commons.math.ode.DerivativeException((java.lang.Throwable) derivativeException7);
        org.apache.commons.math.ode.IntegratorException integratorException9 = new org.apache.commons.math.ode.IntegratorException((java.lang.Throwable) derivativeException7);
        org.apache.commons.math.FunctionEvaluationException functionEvaluationException11 = new org.apache.commons.math.FunctionEvaluationException((double) 'a');
        java.lang.Throwable[] throwableArray12 = functionEvaluationException11.getSuppressed();
        org.apache.commons.math.ode.DerivativeException derivativeException13 = new org.apache.commons.math.ode.DerivativeException((java.lang.Throwable) functionEvaluationException11);
        derivativeException7.addSuppressed((java.lang.Throwable) functionEvaluationException11);
        org.apache.commons.math.ode.IntegratorException integratorException15 = new org.apache.commons.math.ode.IntegratorException((java.lang.Throwable) derivativeException7);
        org.apache.commons.math.ConvergenceException convergenceException16 = new org.apache.commons.math.ConvergenceException((java.lang.Throwable) integratorException15);
        org.apache.commons.math.ConvergenceException convergenceException17 = new org.apache.commons.math.ConvergenceException("org.apache.commons.math.ConvergenceException: Evaluation failed for argument = 97", (java.lang.Throwable) integratorException15);
        java.lang.Throwable[] throwableArray18 = integratorException15.getSuppressed();
        org.apache.commons.math.FunctionEvaluationException functionEvaluationException19 = new org.apache.commons.math.FunctionEvaluationException((double) 0.0f, "", (java.lang.Object[]) throwableArray18);
        org.apache.commons.math.ode.IntegratorException integratorException20 = new org.apache.commons.math.ode.IntegratorException("org.apache.commons.math.FunctionEvaluationException: org.apache.commons.math.FunctionEvaluationException: org.apache.commons.math.FunctionEvaluationException: org.apache.commons.math.FunctionEvaluationException: org.apache.commons.math.FunctionEvaluationException: Evaluation failed for argument = 97", (java.lang.Object[]) throwableArray18);
        java.lang.String str21 = integratorException20.getPattern();
        org.junit.Assert.assertNotNull(strArray6);
        org.junit.Assert.assertNotNull(throwableArray12);
        org.junit.Assert.assertNotNull(throwableArray18);
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "org.apache.commons.math.FunctionEvaluationException: org.apache.commons.math.FunctionEvaluationException: org.apache.commons.math.FunctionEvaluationException: org.apache.commons.math.FunctionEvaluationException: org.apache.commons.math.FunctionEvaluationException: Evaluation failed for argument = 97" + "'", str21, "org.apache.commons.math.FunctionEvaluationException: org.apache.commons.math.FunctionEvaluationException: org.apache.commons.math.FunctionEvaluationException: org.apache.commons.math.FunctionEvaluationException: org.apache.commons.math.FunctionEvaluationException: Evaluation failed for argument = 97");
    }

    @Test
    public void test16048() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest32.test16048");
        org.apache.commons.math.ode.SwitchingFunctionsHandler switchingFunctionsHandler0 = new org.apache.commons.math.ode.SwitchingFunctionsHandler();
        double[] doubleArray4 = new double[] { (-1.0f), 1.0d };
        boolean boolean5 = switchingFunctionsHandler0.reset((double) (byte) 10, doubleArray4);
        org.apache.commons.math.ode.SwitchingFunctionsHandler switchingFunctionsHandler7 = new org.apache.commons.math.ode.SwitchingFunctionsHandler();
        double[] doubleArray11 = new double[] { (-1.0f), 1.0d };
        boolean boolean12 = switchingFunctionsHandler7.reset((double) (byte) 10, doubleArray11);
        double[] doubleArray18 = new double[] { 10, 0.0d, '4', 1.0d };
        boolean boolean19 = switchingFunctionsHandler7.reset((double) (-1), doubleArray18);
        switchingFunctionsHandler0.stepAccepted((double) (byte) -1, doubleArray18);
        double double21 = switchingFunctionsHandler0.getEventTime();
        org.apache.commons.math.ode.StepInterpolator stepInterpolator22 = null;
        boolean boolean23 = switchingFunctionsHandler0.evaluateStep(stepInterpolator22);
        org.apache.commons.math.ode.SwitchingFunction switchingFunction24 = null;
        switchingFunctionsHandler0.add(switchingFunction24, (double) (short) 100, (double) ' ', (int) ' ');
        org.apache.commons.math.ode.SwitchingFunctionsHandler switchingFunctionsHandler30 = new org.apache.commons.math.ode.SwitchingFunctionsHandler();
        double[] doubleArray34 = new double[] { (-1.0f), 1.0d };
        boolean boolean35 = switchingFunctionsHandler30.reset((double) (byte) 10, doubleArray34);
        org.apache.commons.math.ode.StepInterpolator stepInterpolator36 = null;
        boolean boolean37 = switchingFunctionsHandler30.evaluateStep(stepInterpolator36);
        boolean boolean38 = switchingFunctionsHandler30.stop();
        double double39 = switchingFunctionsHandler30.getEventTime();
        org.apache.commons.math.ode.SwitchingFunctionsHandler switchingFunctionsHandler41 = new org.apache.commons.math.ode.SwitchingFunctionsHandler();
        double double42 = switchingFunctionsHandler41.getEventTime();
        boolean boolean43 = switchingFunctionsHandler41.stop();
        boolean boolean44 = switchingFunctionsHandler41.stop();
        org.apache.commons.math.ode.SwitchingFunctionsHandler switchingFunctionsHandler46 = new org.apache.commons.math.ode.SwitchingFunctionsHandler();
        double[] doubleArray50 = new double[] { (-1.0f), 1.0d };
        boolean boolean51 = switchingFunctionsHandler46.reset((double) (byte) 10, doubleArray50);
        double[] doubleArray57 = new double[] { 10, 0.0d, '4', 1.0d };
        boolean boolean58 = switchingFunctionsHandler46.reset((double) (-1), doubleArray57);
        switchingFunctionsHandler41.stepAccepted((double) 'a', doubleArray57);
        double double60 = switchingFunctionsHandler41.getEventTime();
        org.apache.commons.math.ode.SwitchingFunctionsHandler switchingFunctionsHandler62 = new org.apache.commons.math.ode.SwitchingFunctionsHandler();
        org.apache.commons.math.ode.SwitchingFunctionsHandler switchingFunctionsHandler64 = new org.apache.commons.math.ode.SwitchingFunctionsHandler();
        double[] doubleArray68 = new double[] { (-1.0f), 1.0d };
        boolean boolean69 = switchingFunctionsHandler64.reset((double) (byte) 10, doubleArray68);
        double[] doubleArray75 = new double[] { 10, 0.0d, '4', 1.0d };
        boolean boolean76 = switchingFunctionsHandler64.reset((double) (-1), doubleArray75);
        boolean boolean77 = switchingFunctionsHandler62.reset((double) 1L, doubleArray75);
        switchingFunctionsHandler41.stepAccepted((-1.0d), doubleArray75);
        switchingFunctionsHandler30.stepAccepted((double) 'a', doubleArray75);
        boolean boolean80 = switchingFunctionsHandler0.reset((double) 10L, doubleArray75);
        org.apache.commons.math.ode.SwitchingFunction switchingFunction81 = null;
        switchingFunctionsHandler0.add(switchingFunction81, 32.0d, (double) 100L, (-1));
        org.junit.Assert.assertNotNull(doubleArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray4), "[-1.0, 1.0]");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(doubleArray11);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray11), "[-1.0, 1.0]");
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNotNull(doubleArray18);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray18), "[10.0, 0.0, 52.0, 1.0]");
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertTrue(Double.isNaN(double21));
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertNotNull(doubleArray34);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray34), "[-1.0, 1.0]");
        org.junit.Assert.assertTrue("'" + boolean35 + "' != '" + false + "'", boolean35 == false);
        org.junit.Assert.assertTrue("'" + boolean37 + "' != '" + false + "'", boolean37 == false);
        org.junit.Assert.assertTrue("'" + boolean38 + "' != '" + false + "'", boolean38 == false);
        org.junit.Assert.assertTrue(Double.isNaN(double39));
        org.junit.Assert.assertTrue(Double.isNaN(double42));
        org.junit.Assert.assertTrue("'" + boolean43 + "' != '" + false + "'", boolean43 == false);
        org.junit.Assert.assertTrue("'" + boolean44 + "' != '" + false + "'", boolean44 == false);
        org.junit.Assert.assertNotNull(doubleArray50);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray50), "[-1.0, 1.0]");
        org.junit.Assert.assertTrue("'" + boolean51 + "' != '" + false + "'", boolean51 == false);
        org.junit.Assert.assertNotNull(doubleArray57);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray57), "[10.0, 0.0, 52.0, 1.0]");
        org.junit.Assert.assertTrue("'" + boolean58 + "' != '" + false + "'", boolean58 == false);
        org.junit.Assert.assertTrue(Double.isNaN(double60));
        org.junit.Assert.assertNotNull(doubleArray68);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray68), "[-1.0, 1.0]");
        org.junit.Assert.assertTrue("'" + boolean69 + "' != '" + false + "'", boolean69 == false);
        org.junit.Assert.assertNotNull(doubleArray75);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray75), "[10.0, 0.0, 52.0, 1.0]");
        org.junit.Assert.assertTrue("'" + boolean76 + "' != '" + false + "'", boolean76 == false);
        org.junit.Assert.assertTrue("'" + boolean77 + "' != '" + false + "'", boolean77 == false);
        org.junit.Assert.assertTrue("'" + boolean80 + "' != '" + false + "'", boolean80 == false);
    }

    @Test
    public void test16049() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest32.test16049");
        java.lang.String[] strArray8 = new java.lang.String[] { "hi!" };
        org.apache.commons.math.ode.DerivativeException derivativeException9 = new org.apache.commons.math.ode.DerivativeException("hi!", strArray8);
        org.apache.commons.math.FunctionEvaluationException functionEvaluationException10 = new org.apache.commons.math.FunctionEvaluationException((double) 1, "hi!", (java.lang.Object[]) strArray8);
        org.apache.commons.math.ode.DerivativeException derivativeException11 = new org.apache.commons.math.ode.DerivativeException("org.apache.commons.math.ConvergenceException: org.apache.commons.math.FunctionEvaluationException: ", strArray8);
        org.apache.commons.math.ConvergenceException convergenceException12 = new org.apache.commons.math.ConvergenceException("org.apache.commons.math.ode.IntegratorException: org.apache.commons.math.ode.DerivativeException: org.apache.commons.math.FunctionEvaluationException: ", (java.lang.Object[]) strArray8);
        org.apache.commons.math.FunctionEvaluationException functionEvaluationException13 = new org.apache.commons.math.FunctionEvaluationException((double) (-1), (java.lang.Throwable) convergenceException12);
        java.lang.Object[] objArray23 = new java.lang.Object[] { 10.0d };
        org.apache.commons.math.FunctionEvaluationException functionEvaluationException26 = new org.apache.commons.math.FunctionEvaluationException((double) 'a');
        org.apache.commons.math.ConvergenceException convergenceException27 = new org.apache.commons.math.ConvergenceException("hi!", (java.lang.Throwable) functionEvaluationException26);
        org.apache.commons.math.FunctionEvaluationException functionEvaluationException28 = new org.apache.commons.math.FunctionEvaluationException((double) 0L, "org.apache.commons.math.ode.DerivativeException: hi!", objArray23, (java.lang.Throwable) convergenceException27);
        org.apache.commons.math.ConvergenceException convergenceException29 = new org.apache.commons.math.ConvergenceException("org.apache.commons.math.ode.DerivativeException: hi!", objArray23);
        org.apache.commons.math.FunctionEvaluationException functionEvaluationException32 = new org.apache.commons.math.FunctionEvaluationException((double) 'a');
        org.apache.commons.math.FunctionEvaluationException functionEvaluationException35 = new org.apache.commons.math.FunctionEvaluationException((double) 'a');
        org.apache.commons.math.ConvergenceException convergenceException36 = new org.apache.commons.math.ConvergenceException("hi!", (java.lang.Throwable) functionEvaluationException35);
        functionEvaluationException32.addSuppressed((java.lang.Throwable) convergenceException36);
        org.apache.commons.math.ConvergenceException convergenceException38 = new org.apache.commons.math.ConvergenceException((java.lang.Throwable) functionEvaluationException32);
        org.apache.commons.math.FunctionEvaluationException functionEvaluationException39 = new org.apache.commons.math.FunctionEvaluationException((double) (short) 10, (java.lang.Throwable) convergenceException38);
        org.apache.commons.math.ConvergenceException convergenceException40 = new org.apache.commons.math.ConvergenceException("org.apache.commons.math.FunctionEvaluationException: ", objArray23, (java.lang.Throwable) functionEvaluationException39);
        java.lang.Throwable[] throwableArray41 = functionEvaluationException39.getSuppressed();
        java.lang.Throwable throwable43 = null;
        org.apache.commons.math.ode.DerivativeException derivativeException44 = new org.apache.commons.math.ode.DerivativeException(throwable43);
        java.lang.String[] strArray47 = new java.lang.String[] { "hi!" };
        org.apache.commons.math.ode.DerivativeException derivativeException48 = new org.apache.commons.math.ode.DerivativeException("hi!", strArray47);
        org.apache.commons.math.ode.DerivativeException derivativeException49 = new org.apache.commons.math.ode.DerivativeException((java.lang.Throwable) derivativeException48);
        org.apache.commons.math.ode.IntegratorException integratorException50 = new org.apache.commons.math.ode.IntegratorException((java.lang.Throwable) derivativeException48);
        derivativeException44.addSuppressed((java.lang.Throwable) integratorException50);
        org.apache.commons.math.ode.IntegratorException integratorException52 = new org.apache.commons.math.ode.IntegratorException((java.lang.Throwable) integratorException50);
        org.apache.commons.math.ConvergenceException convergenceException53 = new org.apache.commons.math.ConvergenceException("", (java.lang.Throwable) integratorException52);
        org.apache.commons.math.ConvergenceException convergenceException54 = new org.apache.commons.math.ConvergenceException("org.apache.commons.math.ConvergenceException: hi!", (java.lang.Object[]) throwableArray41, (java.lang.Throwable) integratorException52);
        org.apache.commons.math.FunctionEvaluationException functionEvaluationException55 = new org.apache.commons.math.FunctionEvaluationException((double) (short) 0, "org.apache.commons.math.ode.DerivativeException: hi!", (java.lang.Throwable) convergenceException54);
        double double56 = functionEvaluationException55.getArgument();
        org.apache.commons.math.FunctionEvaluationException functionEvaluationException57 = new org.apache.commons.math.FunctionEvaluationException(32.0d, (java.lang.Throwable) functionEvaluationException55);
        convergenceException12.addSuppressed((java.lang.Throwable) functionEvaluationException55);
        org.apache.commons.math.ConvergenceException convergenceException59 = new org.apache.commons.math.ConvergenceException("org.apache.commons.math.FunctionEvaluationException: org.apache.commons.math.ConvergenceException: hi!", (java.lang.Throwable) functionEvaluationException55);
        double double60 = functionEvaluationException55.getArgument();
        org.junit.Assert.assertNotNull(strArray8);
        org.junit.Assert.assertNotNull(objArray23);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray23), "[10.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray23), "[10.0]");
        org.junit.Assert.assertNotNull(throwableArray41);
        org.junit.Assert.assertNotNull(strArray47);
        org.junit.Assert.assertTrue("'" + double56 + "' != '" + 0.0d + "'", double56 == 0.0d);
        org.junit.Assert.assertTrue("'" + double60 + "' != '" + 0.0d + "'", double60 == 0.0d);
    }

    @Test
    public void test16050() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest32.test16050");
        java.lang.String[] strArray19 = new java.lang.String[] { "hi!" };
        org.apache.commons.math.ode.DerivativeException derivativeException20 = new org.apache.commons.math.ode.DerivativeException("hi!", strArray19);
        org.apache.commons.math.FunctionEvaluationException functionEvaluationException21 = new org.apache.commons.math.FunctionEvaluationException((double) 1, "hi!", (java.lang.Object[]) strArray19);
        java.lang.Throwable throwable24 = null;
        org.apache.commons.math.ConvergenceException convergenceException25 = new org.apache.commons.math.ConvergenceException("hi!", throwable24);
        org.apache.commons.math.ConvergenceException convergenceException26 = new org.apache.commons.math.ConvergenceException("hi!", (java.lang.Throwable) convergenceException25);
        org.apache.commons.math.ConvergenceException convergenceException27 = new org.apache.commons.math.ConvergenceException("org.apache.commons.math.ConvergenceException: org.apache.commons.math.FunctionEvaluationException: ", (java.lang.Object[]) strArray19, (java.lang.Throwable) convergenceException25);
        org.apache.commons.math.ode.DerivativeException derivativeException28 = new org.apache.commons.math.ode.DerivativeException("org.apache.commons.math.ode.IntegratorException: Evaluation failed for argument = 2", strArray19);
        org.apache.commons.math.ConvergenceException convergenceException29 = new org.apache.commons.math.ConvergenceException("org.apache.commons.math.ConvergenceException: org.apache.commons.math.FunctionEvaluationException: hi!", (java.lang.Object[]) strArray19);
        org.apache.commons.math.FunctionEvaluationException functionEvaluationException30 = new org.apache.commons.math.FunctionEvaluationException((double) 10.0f, "org.apache.commons.math.ConvergenceException: org.apache.commons.math.ode.DerivativeException: org.apache.commons.math.ode.DerivativeException: hi!", (java.lang.Object[]) strArray19);
        org.apache.commons.math.ode.DerivativeException derivativeException31 = new org.apache.commons.math.ode.DerivativeException("org.apache.commons.math.ode.DerivativeException: org.apache.commons.math.FunctionEvaluationException: org.apache.commons.math.ode.DerivativeException: hi!", strArray19);
        org.apache.commons.math.FunctionEvaluationException functionEvaluationException41 = new org.apache.commons.math.FunctionEvaluationException((double) 'a');
        java.lang.Throwable[] throwableArray42 = functionEvaluationException41.getSuppressed();
        org.apache.commons.math.FunctionEvaluationException functionEvaluationException44 = new org.apache.commons.math.FunctionEvaluationException((double) 'a');
        org.apache.commons.math.FunctionEvaluationException functionEvaluationException47 = new org.apache.commons.math.FunctionEvaluationException((double) 'a');
        org.apache.commons.math.ConvergenceException convergenceException48 = new org.apache.commons.math.ConvergenceException("hi!", (java.lang.Throwable) functionEvaluationException47);
        functionEvaluationException44.addSuppressed((java.lang.Throwable) convergenceException48);
        org.apache.commons.math.FunctionEvaluationException functionEvaluationException50 = new org.apache.commons.math.FunctionEvaluationException((double) (byte) -1, "org.apache.commons.math.ode.DerivativeException: hi!", (java.lang.Object[]) throwableArray42, (java.lang.Throwable) functionEvaluationException44);
        java.lang.Throwable throwable51 = null;
        org.apache.commons.math.ConvergenceException convergenceException52 = new org.apache.commons.math.ConvergenceException(throwable51);
        org.apache.commons.math.ConvergenceException convergenceException53 = new org.apache.commons.math.ConvergenceException("org.apache.commons.math.FunctionEvaluationException: ", (java.lang.Object[]) throwableArray42, throwable51);
        org.apache.commons.math.ode.IntegratorException integratorException54 = new org.apache.commons.math.ode.IntegratorException("Evaluation failed for argument = {0}", (java.lang.Object[]) throwableArray42);
        org.apache.commons.math.ConvergenceException convergenceException55 = new org.apache.commons.math.ConvergenceException("Evaluation failed for argument = {0}", (java.lang.Object[]) throwableArray42);
        org.apache.commons.math.ode.IntegratorException integratorException56 = new org.apache.commons.math.ode.IntegratorException((java.lang.Throwable) convergenceException55);
        java.lang.Object[] objArray57 = convergenceException55.getArguments();
        org.apache.commons.math.ConvergenceException convergenceException58 = new org.apache.commons.math.ConvergenceException("org.apache.commons.math.ConvergenceException: org.apache.commons.math.ode.DerivativeException: hi!", (java.lang.Throwable) convergenceException55);
        org.apache.commons.math.FunctionEvaluationException functionEvaluationException59 = new org.apache.commons.math.FunctionEvaluationException((double) 10.0f, "org.apache.commons.math.FunctionEvaluationException: org.apache.commons.math.ode.DerivativeException: hi!", (java.lang.Throwable) convergenceException55);
        org.apache.commons.math.FunctionEvaluationException functionEvaluationException60 = new org.apache.commons.math.FunctionEvaluationException(2.0d, "", (java.lang.Object[]) strArray19, (java.lang.Throwable) functionEvaluationException59);
        java.lang.Throwable throwable61 = null;
        org.apache.commons.math.ConvergenceException convergenceException62 = new org.apache.commons.math.ConvergenceException("", (java.lang.Object[]) strArray19, throwable61);
        org.apache.commons.math.ode.DerivativeException derivativeException63 = new org.apache.commons.math.ode.DerivativeException("org.apache.commons.math.FunctionEvaluationException: org.apache.commons.math.ode.DerivativeException: org.apache.commons.math.ConvergenceException: ", strArray19);
        java.lang.Throwable throwable66 = null;
        org.apache.commons.math.ConvergenceException convergenceException67 = new org.apache.commons.math.ConvergenceException("org.apache.commons.math.ConvergenceException: ", throwable66);
        org.apache.commons.math.FunctionEvaluationException functionEvaluationException68 = new org.apache.commons.math.FunctionEvaluationException((double) 1.0f, (java.lang.Throwable) convergenceException67);
        org.apache.commons.math.FunctionEvaluationException functionEvaluationException69 = new org.apache.commons.math.FunctionEvaluationException(0.0d, "org.apache.commons.math.FunctionEvaluationException: Evaluation failed for argument = hi!", (java.lang.Object[]) strArray19, (java.lang.Throwable) convergenceException67);
        java.lang.String[] strArray78 = new java.lang.String[] { "hi!" };
        org.apache.commons.math.ode.DerivativeException derivativeException79 = new org.apache.commons.math.ode.DerivativeException("hi!", strArray78);
        org.apache.commons.math.FunctionEvaluationException functionEvaluationException80 = new org.apache.commons.math.FunctionEvaluationException((double) 1, "hi!", (java.lang.Object[]) strArray78);
        java.lang.Throwable throwable83 = null;
        org.apache.commons.math.ConvergenceException convergenceException84 = new org.apache.commons.math.ConvergenceException("hi!", throwable83);
        org.apache.commons.math.ConvergenceException convergenceException85 = new org.apache.commons.math.ConvergenceException("hi!", (java.lang.Throwable) convergenceException84);
        org.apache.commons.math.ConvergenceException convergenceException86 = new org.apache.commons.math.ConvergenceException("org.apache.commons.math.ConvergenceException: org.apache.commons.math.FunctionEvaluationException: ", (java.lang.Object[]) strArray78, (java.lang.Throwable) convergenceException84);
        org.apache.commons.math.FunctionEvaluationException functionEvaluationException87 = new org.apache.commons.math.FunctionEvaluationException((double) 1.0f, "org.apache.commons.math.ConvergenceException: org.apache.commons.math.ode.IntegratorException: org.apache.commons.math.FunctionEvaluationException: org.apache.commons.math.ode.DerivativeException: hi!", (java.lang.Throwable) convergenceException86);
        java.lang.Throwable[] throwableArray88 = functionEvaluationException87.getSuppressed();
        org.apache.commons.math.ode.IntegratorException integratorException89 = new org.apache.commons.math.ode.IntegratorException("org.apache.commons.math.ode.IntegratorException: org.apache.commons.math.ode.IntegratorException: ", (java.lang.Object[]) throwableArray88);
        org.apache.commons.math.ConvergenceException convergenceException90 = new org.apache.commons.math.ConvergenceException("Evaluation failed for argument = 0", (java.lang.Object[]) strArray19, (java.lang.Throwable) integratorException89);
        org.apache.commons.math.ode.DerivativeException derivativeException91 = new org.apache.commons.math.ode.DerivativeException("org.apache.commons.math.FunctionEvaluationException: org.apache.commons.math.FunctionEvaluationException: org.apache.commons.math.ode.DerivativeException: hi!", strArray19);
        org.apache.commons.math.ode.DerivativeException derivativeException92 = new org.apache.commons.math.ode.DerivativeException("org.apache.commons.math.ode.DerivativeException: org.apache.commons.math.FunctionEvaluationException: org.apache.commons.math.ode.IntegratorException: Evaluation failed for argument = 2", strArray19);
        org.junit.Assert.assertNotNull(strArray19);
        org.junit.Assert.assertNotNull(throwableArray42);
        org.junit.Assert.assertNotNull(objArray57);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray57), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray57), "[]");
        org.junit.Assert.assertNotNull(strArray78);
        org.junit.Assert.assertNotNull(throwableArray88);
    }

    @Test
    public void test16051() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest32.test16051");
        java.lang.Throwable throwable1 = null;
        org.apache.commons.math.ConvergenceException convergenceException2 = new org.apache.commons.math.ConvergenceException("org.apache.commons.math.ConvergenceException: Evaluation failed for argument = hi!", throwable1);
    }

    @Test
    public void test16052() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest32.test16052");
        org.apache.commons.math.FunctionEvaluationException functionEvaluationException3 = new org.apache.commons.math.FunctionEvaluationException((double) (byte) 0, "org.apache.commons.math.ode.DerivativeException: org.apache.commons.math.ode.DerivativeException: hi!");
        org.apache.commons.math.ConvergenceException convergenceException4 = new org.apache.commons.math.ConvergenceException("org.apache.commons.math.FunctionEvaluationException: org.apache.commons.math.FunctionEvaluationException: ", (java.lang.Throwable) functionEvaluationException3);
        java.lang.Class<?> wildcardClass5 = convergenceException4.getClass();
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test16053() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest32.test16053");
        java.lang.String[] strArray8 = new java.lang.String[] { "hi!" };
        org.apache.commons.math.ode.DerivativeException derivativeException9 = new org.apache.commons.math.ode.DerivativeException("hi!", strArray8);
        org.apache.commons.math.FunctionEvaluationException functionEvaluationException10 = new org.apache.commons.math.FunctionEvaluationException((double) 1, "hi!", (java.lang.Object[]) strArray8);
        java.lang.Throwable throwable11 = null;
        org.apache.commons.math.FunctionEvaluationException functionEvaluationException12 = new org.apache.commons.math.FunctionEvaluationException(0.0d, "org.apache.commons.math.FunctionEvaluationException: Evaluation failed for argument = 1", (java.lang.Object[]) strArray8, throwable11);
        org.apache.commons.math.ode.DerivativeException derivativeException13 = new org.apache.commons.math.ode.DerivativeException("org.apache.commons.math.FunctionEvaluationException: org.apache.commons.math.ConvergenceException: org.apache.commons.math.ConvergenceException: hi!", strArray8);
        org.apache.commons.math.ode.DerivativeException derivativeException14 = new org.apache.commons.math.ode.DerivativeException("org.apache.commons.math.ConvergenceException: org.apache.commons.math.ConvergenceException: org.apache.commons.math.FunctionEvaluationException: org.apache.commons.math.ode.DerivativeException: org.apache.commons.math.FunctionEvaluationException: ", strArray8);
        org.junit.Assert.assertNotNull(strArray8);
    }

    @Test
    public void test16054() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest32.test16054");
        java.lang.Object[] objArray14 = new java.lang.Object[] { 10.0d };
        org.apache.commons.math.FunctionEvaluationException functionEvaluationException17 = new org.apache.commons.math.FunctionEvaluationException((double) 'a');
        org.apache.commons.math.ConvergenceException convergenceException18 = new org.apache.commons.math.ConvergenceException("hi!", (java.lang.Throwable) functionEvaluationException17);
        org.apache.commons.math.FunctionEvaluationException functionEvaluationException19 = new org.apache.commons.math.FunctionEvaluationException((double) 0L, "org.apache.commons.math.ode.DerivativeException: hi!", objArray14, (java.lang.Throwable) convergenceException18);
        org.apache.commons.math.ConvergenceException convergenceException20 = new org.apache.commons.math.ConvergenceException("org.apache.commons.math.ode.DerivativeException: hi!", objArray14);
        org.apache.commons.math.FunctionEvaluationException functionEvaluationException23 = new org.apache.commons.math.FunctionEvaluationException((double) 'a');
        org.apache.commons.math.FunctionEvaluationException functionEvaluationException26 = new org.apache.commons.math.FunctionEvaluationException((double) 'a');
        org.apache.commons.math.ConvergenceException convergenceException27 = new org.apache.commons.math.ConvergenceException("hi!", (java.lang.Throwable) functionEvaluationException26);
        functionEvaluationException23.addSuppressed((java.lang.Throwable) convergenceException27);
        org.apache.commons.math.ConvergenceException convergenceException29 = new org.apache.commons.math.ConvergenceException((java.lang.Throwable) functionEvaluationException23);
        org.apache.commons.math.FunctionEvaluationException functionEvaluationException30 = new org.apache.commons.math.FunctionEvaluationException((double) (short) 10, (java.lang.Throwable) convergenceException29);
        org.apache.commons.math.ConvergenceException convergenceException31 = new org.apache.commons.math.ConvergenceException("org.apache.commons.math.FunctionEvaluationException: ", objArray14, (java.lang.Throwable) functionEvaluationException30);
        java.lang.Throwable[] throwableArray32 = functionEvaluationException30.getSuppressed();
        java.lang.Throwable throwable34 = null;
        org.apache.commons.math.ode.DerivativeException derivativeException35 = new org.apache.commons.math.ode.DerivativeException(throwable34);
        java.lang.String[] strArray38 = new java.lang.String[] { "hi!" };
        org.apache.commons.math.ode.DerivativeException derivativeException39 = new org.apache.commons.math.ode.DerivativeException("hi!", strArray38);
        org.apache.commons.math.ode.DerivativeException derivativeException40 = new org.apache.commons.math.ode.DerivativeException((java.lang.Throwable) derivativeException39);
        org.apache.commons.math.ode.IntegratorException integratorException41 = new org.apache.commons.math.ode.IntegratorException((java.lang.Throwable) derivativeException39);
        derivativeException35.addSuppressed((java.lang.Throwable) integratorException41);
        org.apache.commons.math.ode.IntegratorException integratorException43 = new org.apache.commons.math.ode.IntegratorException((java.lang.Throwable) integratorException41);
        org.apache.commons.math.ConvergenceException convergenceException44 = new org.apache.commons.math.ConvergenceException("", (java.lang.Throwable) integratorException43);
        org.apache.commons.math.ConvergenceException convergenceException45 = new org.apache.commons.math.ConvergenceException("org.apache.commons.math.ConvergenceException: hi!", (java.lang.Object[]) throwableArray32, (java.lang.Throwable) integratorException43);
        org.apache.commons.math.FunctionEvaluationException functionEvaluationException51 = new org.apache.commons.math.FunctionEvaluationException((double) 'a');
        org.apache.commons.math.FunctionEvaluationException functionEvaluationException54 = new org.apache.commons.math.FunctionEvaluationException((double) 'a');
        org.apache.commons.math.ConvergenceException convergenceException55 = new org.apache.commons.math.ConvergenceException("hi!", (java.lang.Throwable) functionEvaluationException54);
        functionEvaluationException51.addSuppressed((java.lang.Throwable) convergenceException55);
        java.lang.Object[] objArray58 = new java.lang.Object[] { (byte) 1, functionEvaluationException51, 100.0d };
        org.apache.commons.math.FunctionEvaluationException functionEvaluationException59 = new org.apache.commons.math.FunctionEvaluationException((double) (byte) -1, "", objArray58);
        java.lang.Throwable[] throwableArray60 = functionEvaluationException59.getSuppressed();
        org.apache.commons.math.FunctionEvaluationException functionEvaluationException68 = new org.apache.commons.math.FunctionEvaluationException((double) 'a');
        java.lang.Throwable[] throwableArray69 = functionEvaluationException68.getSuppressed();
        org.apache.commons.math.FunctionEvaluationException functionEvaluationException71 = new org.apache.commons.math.FunctionEvaluationException((double) 'a');
        org.apache.commons.math.FunctionEvaluationException functionEvaluationException74 = new org.apache.commons.math.FunctionEvaluationException((double) 'a');
        org.apache.commons.math.ConvergenceException convergenceException75 = new org.apache.commons.math.ConvergenceException("hi!", (java.lang.Throwable) functionEvaluationException74);
        functionEvaluationException71.addSuppressed((java.lang.Throwable) convergenceException75);
        org.apache.commons.math.FunctionEvaluationException functionEvaluationException77 = new org.apache.commons.math.FunctionEvaluationException((double) (byte) -1, "org.apache.commons.math.ode.DerivativeException: hi!", (java.lang.Object[]) throwableArray69, (java.lang.Throwable) functionEvaluationException71);
        java.lang.Throwable throwable78 = null;
        org.apache.commons.math.ConvergenceException convergenceException79 = new org.apache.commons.math.ConvergenceException(throwable78);
        org.apache.commons.math.ConvergenceException convergenceException80 = new org.apache.commons.math.ConvergenceException("org.apache.commons.math.FunctionEvaluationException: ", (java.lang.Object[]) throwableArray69, throwable78);
        org.apache.commons.math.ode.IntegratorException integratorException81 = new org.apache.commons.math.ode.IntegratorException("Evaluation failed for argument = {0}", (java.lang.Object[]) throwableArray69);
        org.apache.commons.math.ConvergenceException convergenceException82 = new org.apache.commons.math.ConvergenceException("Evaluation failed for argument = {0}", (java.lang.Object[]) throwableArray69);
        org.apache.commons.math.ConvergenceException convergenceException83 = new org.apache.commons.math.ConvergenceException("org.apache.commons.math.FunctionEvaluationException: org.apache.commons.math.ode.DerivativeException: hi!", (java.lang.Object[]) throwableArray69);
        org.apache.commons.math.ConvergenceException convergenceException84 = new org.apache.commons.math.ConvergenceException("org.apache.commons.math.FunctionEvaluationException: ", (java.lang.Object[]) throwableArray60, (java.lang.Throwable) convergenceException83);
        org.apache.commons.math.FunctionEvaluationException functionEvaluationException85 = new org.apache.commons.math.FunctionEvaluationException((double) (-1L), "org.apache.commons.math.FunctionEvaluationException: org.apache.commons.math.ode.DerivativeException: hi!", (java.lang.Object[]) throwableArray32, (java.lang.Throwable) convergenceException83);
        org.apache.commons.math.ConvergenceException convergenceException86 = new org.apache.commons.math.ConvergenceException("Evaluation failed for argument = 97", (java.lang.Object[]) throwableArray32);
        org.apache.commons.math.ConvergenceException convergenceException87 = new org.apache.commons.math.ConvergenceException("org.apache.commons.math.ode.DerivativeException: Evaluation failed for argument = 97", (java.lang.Object[]) throwableArray32);
        org.apache.commons.math.ode.IntegratorException integratorException88 = new org.apache.commons.math.ode.IntegratorException("org.apache.commons.math.FunctionEvaluationException: org.apache.commons.math.ode.DerivativeException: org.apache.commons.math.FunctionEvaluationException: org.apache.commons.math.ode.DerivativeException: hi!", (java.lang.Object[]) throwableArray32);
        org.apache.commons.math.FunctionEvaluationException functionEvaluationException92 = new org.apache.commons.math.FunctionEvaluationException((double) 10L, "Evaluation failed for argument = 97");
        org.apache.commons.math.ConvergenceException convergenceException93 = new org.apache.commons.math.ConvergenceException("", (java.lang.Throwable) functionEvaluationException92);
        org.apache.commons.math.FunctionEvaluationException functionEvaluationException94 = new org.apache.commons.math.FunctionEvaluationException(0.0d, "org.apache.commons.math.ConvergenceException: hi!", (java.lang.Object[]) throwableArray32, (java.lang.Throwable) functionEvaluationException92);
        org.apache.commons.math.ConvergenceException convergenceException95 = new org.apache.commons.math.ConvergenceException("org.apache.commons.math.FunctionEvaluationException: org.apache.commons.math.FunctionEvaluationException: Evaluation failed for argument = 0", (java.lang.Object[]) throwableArray32);
        org.junit.Assert.assertNotNull(objArray14);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray14), "[10.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray14), "[10.0]");
        org.junit.Assert.assertNotNull(throwableArray32);
        org.junit.Assert.assertNotNull(strArray38);
        org.junit.Assert.assertNotNull(objArray58);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray58), "[1, org.apache.commons.math.FunctionEvaluationException: Evaluation failed for argument = 97, 100.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray58), "[1, org.apache.commons.math.FunctionEvaluationException: Evaluation failed for argument = 97, 100.0]");
        org.junit.Assert.assertNotNull(throwableArray60);
        org.junit.Assert.assertNotNull(throwableArray69);
    }

    @Test
    public void test16055() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest32.test16055");
        java.lang.Throwable throwable2 = null;
        org.apache.commons.math.ConvergenceException convergenceException3 = new org.apache.commons.math.ConvergenceException("hi!", throwable2);
        org.apache.commons.math.ConvergenceException convergenceException4 = new org.apache.commons.math.ConvergenceException("", throwable2);
        java.lang.String str5 = convergenceException4.getPattern();
        org.apache.commons.math.ConvergenceException convergenceException6 = new org.apache.commons.math.ConvergenceException((java.lang.Throwable) convergenceException4);
        java.lang.String str7 = convergenceException6.toString();
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "org.apache.commons.math.ConvergenceException: " + "'", str7, "org.apache.commons.math.ConvergenceException: ");
    }

    @Test
    public void test16056() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest32.test16056");
        org.apache.commons.math.ode.SwitchingFunctionsHandler switchingFunctionsHandler0 = new org.apache.commons.math.ode.SwitchingFunctionsHandler();
        double[] doubleArray4 = new double[] { (-1.0f), 1.0d };
        boolean boolean5 = switchingFunctionsHandler0.reset((double) (byte) 10, doubleArray4);
        org.apache.commons.math.ode.SwitchingFunctionsHandler switchingFunctionsHandler7 = new org.apache.commons.math.ode.SwitchingFunctionsHandler();
        double[] doubleArray11 = new double[] { (-1.0f), 1.0d };
        boolean boolean12 = switchingFunctionsHandler7.reset((double) (byte) 10, doubleArray11);
        double[] doubleArray18 = new double[] { 10, 0.0d, '4', 1.0d };
        boolean boolean19 = switchingFunctionsHandler7.reset((double) (-1), doubleArray18);
        switchingFunctionsHandler0.stepAccepted((double) (byte) -1, doubleArray18);
        boolean boolean21 = switchingFunctionsHandler0.isEmpty();
        double double22 = switchingFunctionsHandler0.getEventTime();
        double double23 = switchingFunctionsHandler0.getEventTime();
        boolean boolean24 = switchingFunctionsHandler0.stop();
        org.apache.commons.math.ode.SwitchingFunctionsHandler switchingFunctionsHandler26 = new org.apache.commons.math.ode.SwitchingFunctionsHandler();
        double[] doubleArray30 = new double[] { (-1.0f), 1.0d };
        boolean boolean31 = switchingFunctionsHandler26.reset((double) (byte) 10, doubleArray30);
        boolean boolean32 = switchingFunctionsHandler26.isEmpty();
        double[] doubleArray40 = new double[] { Double.NaN, (short) 100, 100.0d, 100.0f, 0.0f, 10.0f };
        switchingFunctionsHandler26.stepAccepted((double) (-1L), doubleArray40);
        boolean boolean42 = switchingFunctionsHandler26.stop();
        double double43 = switchingFunctionsHandler26.getEventTime();
        boolean boolean44 = switchingFunctionsHandler26.isEmpty();
        org.apache.commons.math.ode.SwitchingFunctionsHandler switchingFunctionsHandler46 = new org.apache.commons.math.ode.SwitchingFunctionsHandler();
        double[] doubleArray50 = new double[] { (-1.0f), 1.0d };
        boolean boolean51 = switchingFunctionsHandler46.reset((double) (byte) 10, doubleArray50);
        double[] doubleArray57 = new double[] { 10, 0.0d, '4', 1.0d };
        boolean boolean58 = switchingFunctionsHandler46.reset((double) (-1), doubleArray57);
        org.apache.commons.math.ode.StepInterpolator stepInterpolator59 = null;
        boolean boolean60 = switchingFunctionsHandler46.evaluateStep(stepInterpolator59);
        boolean boolean61 = switchingFunctionsHandler46.isEmpty();
        double[] doubleArray64 = new double[] { (byte) 1 };
        switchingFunctionsHandler46.stepAccepted(1.0d, doubleArray64);
        boolean boolean66 = switchingFunctionsHandler26.reset((double) (byte) 1, doubleArray64);
        boolean boolean67 = switchingFunctionsHandler0.reset((double) 3, doubleArray64);
        org.junit.Assert.assertNotNull(doubleArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray4), "[-1.0, 1.0]");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(doubleArray11);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray11), "[-1.0, 1.0]");
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNotNull(doubleArray18);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray18), "[10.0, 0.0, 52.0, 1.0]");
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + true + "'", boolean21 == true);
        org.junit.Assert.assertTrue(Double.isNaN(double22));
        org.junit.Assert.assertTrue(Double.isNaN(double23));
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertNotNull(doubleArray30);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray30), "[-1.0, 1.0]");
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + false + "'", boolean31 == false);
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + true + "'", boolean32 == true);
        org.junit.Assert.assertNotNull(doubleArray40);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray40), "[NaN, 100.0, 100.0, 100.0, 0.0, 10.0]");
        org.junit.Assert.assertTrue("'" + boolean42 + "' != '" + false + "'", boolean42 == false);
        org.junit.Assert.assertTrue(Double.isNaN(double43));
        org.junit.Assert.assertTrue("'" + boolean44 + "' != '" + true + "'", boolean44 == true);
        org.junit.Assert.assertNotNull(doubleArray50);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray50), "[-1.0, 1.0]");
        org.junit.Assert.assertTrue("'" + boolean51 + "' != '" + false + "'", boolean51 == false);
        org.junit.Assert.assertNotNull(doubleArray57);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray57), "[10.0, 0.0, 52.0, 1.0]");
        org.junit.Assert.assertTrue("'" + boolean58 + "' != '" + false + "'", boolean58 == false);
        org.junit.Assert.assertTrue("'" + boolean60 + "' != '" + false + "'", boolean60 == false);
        org.junit.Assert.assertTrue("'" + boolean61 + "' != '" + true + "'", boolean61 == true);
        org.junit.Assert.assertNotNull(doubleArray64);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray64), "[1.0]");
        org.junit.Assert.assertTrue("'" + boolean66 + "' != '" + false + "'", boolean66 == false);
        org.junit.Assert.assertTrue("'" + boolean67 + "' != '" + false + "'", boolean67 == false);
    }

    @Test
    public void test16057() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest32.test16057");
        org.apache.commons.math.FunctionEvaluationException functionEvaluationException4 = new org.apache.commons.math.FunctionEvaluationException((double) 'a');
        org.apache.commons.math.FunctionEvaluationException functionEvaluationException7 = new org.apache.commons.math.FunctionEvaluationException((double) 'a');
        org.apache.commons.math.ConvergenceException convergenceException8 = new org.apache.commons.math.ConvergenceException("hi!", (java.lang.Throwable) functionEvaluationException7);
        functionEvaluationException4.addSuppressed((java.lang.Throwable) convergenceException8);
        org.apache.commons.math.ConvergenceException convergenceException10 = new org.apache.commons.math.ConvergenceException((java.lang.Throwable) functionEvaluationException4);
        org.apache.commons.math.FunctionEvaluationException functionEvaluationException11 = new org.apache.commons.math.FunctionEvaluationException((double) 100, (java.lang.Throwable) functionEvaluationException4);
        java.lang.Object[] objArray12 = functionEvaluationException4.getArguments();
        org.apache.commons.math.ConvergenceException convergenceException13 = new org.apache.commons.math.ConvergenceException("org.apache.commons.math.ode.IntegratorException: Evaluation failed for argument = {0}", objArray12);
        org.apache.commons.math.ConvergenceException convergenceException14 = new org.apache.commons.math.ConvergenceException("org.apache.commons.math.ode.DerivativeException: org.apache.commons.math.ConvergenceException: org.apache.commons.math.ode.DerivativeException: hi!", (java.lang.Throwable) convergenceException13);
        org.apache.commons.math.ode.DerivativeException derivativeException15 = new org.apache.commons.math.ode.DerivativeException((java.lang.Throwable) convergenceException13);
        org.apache.commons.math.FunctionEvaluationException functionEvaluationException18 = new org.apache.commons.math.FunctionEvaluationException((double) (byte) 1);
        org.apache.commons.math.ode.DerivativeException derivativeException19 = new org.apache.commons.math.ode.DerivativeException((java.lang.Throwable) functionEvaluationException18);
        org.apache.commons.math.FunctionEvaluationException functionEvaluationException20 = new org.apache.commons.math.FunctionEvaluationException((double) 0.0f, (java.lang.Throwable) functionEvaluationException18);
        org.apache.commons.math.ode.DerivativeException derivativeException21 = new org.apache.commons.math.ode.DerivativeException((java.lang.Throwable) functionEvaluationException20);
        derivativeException15.addSuppressed((java.lang.Throwable) derivativeException21);
        org.junit.Assert.assertNotNull(objArray12);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray12), "[97.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray12), "[97.0]");
    }

    @Test
    public void test16058() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest32.test16058");
        org.apache.commons.math.FunctionEvaluationException functionEvaluationException8 = new org.apache.commons.math.FunctionEvaluationException((double) 0, "org.apache.commons.math.FunctionEvaluationException: Evaluation failed for argument = 97");
        java.lang.Object[] objArray9 = functionEvaluationException8.getArguments();
        org.apache.commons.math.FunctionEvaluationException functionEvaluationException10 = new org.apache.commons.math.FunctionEvaluationException((double) 10L, "org.apache.commons.math.ode.IntegratorException: org.apache.commons.math.ConvergenceException: hi!", objArray9);
        java.lang.Object[] objArray19 = new java.lang.Object[] { 10.0d };
        org.apache.commons.math.FunctionEvaluationException functionEvaluationException22 = new org.apache.commons.math.FunctionEvaluationException((double) 'a');
        org.apache.commons.math.ConvergenceException convergenceException23 = new org.apache.commons.math.ConvergenceException("hi!", (java.lang.Throwable) functionEvaluationException22);
        org.apache.commons.math.FunctionEvaluationException functionEvaluationException24 = new org.apache.commons.math.FunctionEvaluationException((double) 0L, "org.apache.commons.math.ode.DerivativeException: hi!", objArray19, (java.lang.Throwable) convergenceException23);
        org.apache.commons.math.ConvergenceException convergenceException25 = new org.apache.commons.math.ConvergenceException("org.apache.commons.math.ode.DerivativeException: hi!", objArray19);
        org.apache.commons.math.FunctionEvaluationException functionEvaluationException28 = new org.apache.commons.math.FunctionEvaluationException((double) 'a');
        org.apache.commons.math.FunctionEvaluationException functionEvaluationException31 = new org.apache.commons.math.FunctionEvaluationException((double) 'a');
        org.apache.commons.math.ConvergenceException convergenceException32 = new org.apache.commons.math.ConvergenceException("hi!", (java.lang.Throwable) functionEvaluationException31);
        functionEvaluationException28.addSuppressed((java.lang.Throwable) convergenceException32);
        org.apache.commons.math.ConvergenceException convergenceException34 = new org.apache.commons.math.ConvergenceException((java.lang.Throwable) functionEvaluationException28);
        org.apache.commons.math.FunctionEvaluationException functionEvaluationException35 = new org.apache.commons.math.FunctionEvaluationException((double) (short) 10, (java.lang.Throwable) convergenceException34);
        org.apache.commons.math.ConvergenceException convergenceException36 = new org.apache.commons.math.ConvergenceException("org.apache.commons.math.FunctionEvaluationException: ", objArray19, (java.lang.Throwable) functionEvaluationException35);
        org.apache.commons.math.FunctionEvaluationException functionEvaluationException37 = new org.apache.commons.math.FunctionEvaluationException(0.0d, "org.apache.commons.math.ConvergenceException: hi!", objArray19);
        org.apache.commons.math.ConvergenceException convergenceException38 = new org.apache.commons.math.ConvergenceException("org.apache.commons.math.ode.DerivativeException: org.apache.commons.math.FunctionEvaluationException: org.apache.commons.math.ode.DerivativeException: hi!", (java.lang.Throwable) functionEvaluationException37);
        java.lang.Throwable[] throwableArray39 = convergenceException38.getSuppressed();
        org.apache.commons.math.FunctionEvaluationException functionEvaluationException40 = new org.apache.commons.math.FunctionEvaluationException((double) ' ', "org.apache.commons.math.FunctionEvaluationException: Evaluation failed for argument = 3", objArray9, (java.lang.Throwable) convergenceException38);
        org.apache.commons.math.FunctionEvaluationException functionEvaluationException41 = new org.apache.commons.math.FunctionEvaluationException((double) 3, "org.apache.commons.math.FunctionEvaluationException: Evaluation failed for argument = 2", objArray9);
        org.apache.commons.math.ode.DerivativeException derivativeException42 = new org.apache.commons.math.ode.DerivativeException((java.lang.Throwable) functionEvaluationException41);
        org.apache.commons.math.FunctionEvaluationException functionEvaluationException49 = new org.apache.commons.math.FunctionEvaluationException((double) 10.0f, "Evaluation failed for argument = 97");
        org.apache.commons.math.ConvergenceException convergenceException50 = new org.apache.commons.math.ConvergenceException("hi!", (java.lang.Throwable) functionEvaluationException49);
        org.apache.commons.math.FunctionEvaluationException functionEvaluationException51 = new org.apache.commons.math.FunctionEvaluationException(Double.NaN, (java.lang.Throwable) functionEvaluationException49);
        org.apache.commons.math.FunctionEvaluationException functionEvaluationException52 = new org.apache.commons.math.FunctionEvaluationException((double) 0.0f, "org.apache.commons.math.ConvergenceException: org.apache.commons.math.ConvergenceException: Evaluation failed for argument = 97", (java.lang.Throwable) functionEvaluationException51);
        functionEvaluationException41.addSuppressed((java.lang.Throwable) functionEvaluationException51);
        org.junit.Assert.assertNotNull(objArray9);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray9), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray9), "[]");
        org.junit.Assert.assertNotNull(objArray19);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray19), "[10.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray19), "[10.0]");
        org.junit.Assert.assertNotNull(throwableArray39);
    }

    @Test
    public void test16059() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest32.test16059");
        java.lang.String[] strArray7 = new java.lang.String[] { "hi!" };
        org.apache.commons.math.ode.DerivativeException derivativeException8 = new org.apache.commons.math.ode.DerivativeException("hi!", strArray7);
        org.apache.commons.math.ode.DerivativeException derivativeException9 = new org.apache.commons.math.ode.DerivativeException((java.lang.Throwable) derivativeException8);
        org.apache.commons.math.ode.IntegratorException integratorException10 = new org.apache.commons.math.ode.IntegratorException((java.lang.Throwable) derivativeException8);
        org.apache.commons.math.FunctionEvaluationException functionEvaluationException12 = new org.apache.commons.math.FunctionEvaluationException((double) 'a');
        java.lang.Throwable[] throwableArray13 = functionEvaluationException12.getSuppressed();
        org.apache.commons.math.ode.DerivativeException derivativeException14 = new org.apache.commons.math.ode.DerivativeException((java.lang.Throwable) functionEvaluationException12);
        derivativeException8.addSuppressed((java.lang.Throwable) functionEvaluationException12);
        java.lang.Throwable[] throwableArray16 = derivativeException8.getSuppressed();
        java.lang.String[] strArray26 = new java.lang.String[] { "hi!" };
        org.apache.commons.math.ode.DerivativeException derivativeException27 = new org.apache.commons.math.ode.DerivativeException("hi!", strArray26);
        org.apache.commons.math.FunctionEvaluationException functionEvaluationException28 = new org.apache.commons.math.FunctionEvaluationException((double) (byte) 100, "", (java.lang.Object[]) strArray26);
        org.apache.commons.math.ConvergenceException convergenceException29 = new org.apache.commons.math.ConvergenceException("hi!", (java.lang.Object[]) strArray26);
        org.apache.commons.math.ode.IntegratorException integratorException30 = new org.apache.commons.math.ode.IntegratorException("org.apache.commons.math.ConvergenceException: ", (java.lang.Object[]) strArray26);
        org.apache.commons.math.ode.DerivativeException derivativeException31 = new org.apache.commons.math.ode.DerivativeException("org.apache.commons.math.ConvergenceException: ", strArray26);
        org.apache.commons.math.ode.DerivativeException derivativeException32 = new org.apache.commons.math.ode.DerivativeException("org.apache.commons.math.ConvergenceException: ", strArray26);
        org.apache.commons.math.FunctionEvaluationException functionEvaluationException34 = new org.apache.commons.math.FunctionEvaluationException((double) 0.0f);
        org.apache.commons.math.ConvergenceException convergenceException35 = new org.apache.commons.math.ConvergenceException("org.apache.commons.math.FunctionEvaluationException: org.apache.commons.math.ode.DerivativeException: hi!", (java.lang.Object[]) strArray26, (java.lang.Throwable) functionEvaluationException34);
        org.apache.commons.math.FunctionEvaluationException functionEvaluationException36 = new org.apache.commons.math.FunctionEvaluationException((double) (short) 100, "org.apache.commons.math.ConvergenceException: org.apache.commons.math.FunctionEvaluationException: ", (java.lang.Object[]) throwableArray16, (java.lang.Throwable) functionEvaluationException34);
        org.apache.commons.math.ConvergenceException convergenceException37 = new org.apache.commons.math.ConvergenceException("", (java.lang.Throwable) functionEvaluationException36);
        java.lang.String str38 = functionEvaluationException36.getPattern();
        org.apache.commons.math.FunctionEvaluationException functionEvaluationException39 = new org.apache.commons.math.FunctionEvaluationException(35.0d, "org.apache.commons.math.FunctionEvaluationException: org.apache.commons.math.FunctionEvaluationException: org.apache.commons.math.ode.DerivativeException: hi!", (java.lang.Throwable) functionEvaluationException36);
        java.lang.Object[] objArray40 = functionEvaluationException39.getArguments();
        java.lang.Object[] objArray41 = functionEvaluationException39.getArguments();
        org.junit.Assert.assertNotNull(strArray7);
        org.junit.Assert.assertNotNull(throwableArray13);
        org.junit.Assert.assertNotNull(throwableArray16);
        org.junit.Assert.assertNotNull(strArray26);
        org.junit.Assert.assertEquals("'" + str38 + "' != '" + "org.apache.commons.math.ConvergenceException: org.apache.commons.math.FunctionEvaluationException: " + "'", str38, "org.apache.commons.math.ConvergenceException: org.apache.commons.math.FunctionEvaluationException: ");
        org.junit.Assert.assertNotNull(objArray40);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray40), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray40), "[]");
        org.junit.Assert.assertNotNull(objArray41);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray41), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray41), "[]");
    }

    @Test
    public void test16060() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest32.test16060");
        org.apache.commons.math.ode.SwitchingFunctionsHandler switchingFunctionsHandler0 = new org.apache.commons.math.ode.SwitchingFunctionsHandler();
        boolean boolean1 = switchingFunctionsHandler0.stop();
        org.apache.commons.math.ode.SwitchingFunctionsHandler switchingFunctionsHandler3 = new org.apache.commons.math.ode.SwitchingFunctionsHandler();
        double[] doubleArray7 = new double[] { (-1.0f), 1.0d };
        boolean boolean8 = switchingFunctionsHandler3.reset((double) (byte) 10, doubleArray7);
        double[] doubleArray14 = new double[] { 10, 0.0d, '4', 1.0d };
        boolean boolean15 = switchingFunctionsHandler3.reset((double) (-1), doubleArray14);
        boolean boolean16 = switchingFunctionsHandler0.reset(97.0d, doubleArray14);
        org.apache.commons.math.ode.SwitchingFunctionsHandler switchingFunctionsHandler18 = new org.apache.commons.math.ode.SwitchingFunctionsHandler();
        boolean boolean19 = switchingFunctionsHandler18.stop();
        org.apache.commons.math.ode.SwitchingFunctionsHandler switchingFunctionsHandler21 = new org.apache.commons.math.ode.SwitchingFunctionsHandler();
        double[] doubleArray25 = new double[] { (-1.0f), 1.0d };
        boolean boolean26 = switchingFunctionsHandler21.reset((double) (byte) 10, doubleArray25);
        double[] doubleArray32 = new double[] { 10, 0.0d, '4', 1.0d };
        boolean boolean33 = switchingFunctionsHandler21.reset((double) (-1), doubleArray32);
        boolean boolean34 = switchingFunctionsHandler18.reset(97.0d, doubleArray32);
        boolean boolean35 = switchingFunctionsHandler18.isEmpty();
        org.apache.commons.math.ode.StepInterpolator stepInterpolator36 = null;
        boolean boolean37 = switchingFunctionsHandler18.evaluateStep(stepInterpolator36);
        org.apache.commons.math.ode.SwitchingFunctionsHandler switchingFunctionsHandler39 = new org.apache.commons.math.ode.SwitchingFunctionsHandler();
        double[] doubleArray45 = new double[] { 3, (byte) 0, 100.0d, 100 };
        switchingFunctionsHandler39.stepAccepted((double) (short) 0, doubleArray45);
        switchingFunctionsHandler18.stepAccepted(0.0d, doubleArray45);
        switchingFunctionsHandler0.stepAccepted((double) (byte) -1, doubleArray45);
        boolean boolean49 = switchingFunctionsHandler0.stop();
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertNotNull(doubleArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray7), "[-1.0, 1.0]");
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNotNull(doubleArray14);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray14), "[10.0, 0.0, 52.0, 1.0]");
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertNotNull(doubleArray25);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray25), "[-1.0, 1.0]");
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
        org.junit.Assert.assertNotNull(doubleArray32);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray32), "[10.0, 0.0, 52.0, 1.0]");
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + false + "'", boolean33 == false);
        org.junit.Assert.assertTrue("'" + boolean34 + "' != '" + false + "'", boolean34 == false);
        org.junit.Assert.assertTrue("'" + boolean35 + "' != '" + true + "'", boolean35 == true);
        org.junit.Assert.assertTrue("'" + boolean37 + "' != '" + false + "'", boolean37 == false);
        org.junit.Assert.assertNotNull(doubleArray45);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray45), "[3.0, 0.0, 100.0, 100.0]");
        org.junit.Assert.assertTrue("'" + boolean49 + "' != '" + false + "'", boolean49 == false);
    }

    @Test
    public void test16061() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest32.test16061");
        org.apache.commons.math.ode.SwitchingFunctionsHandler switchingFunctionsHandler0 = new org.apache.commons.math.ode.SwitchingFunctionsHandler();
        double[] doubleArray6 = new double[] { 3, (byte) 0, 100.0d, 100 };
        switchingFunctionsHandler0.stepAccepted((double) (short) 0, doubleArray6);
        org.apache.commons.math.ode.SwitchingFunctionsHandler switchingFunctionsHandler9 = new org.apache.commons.math.ode.SwitchingFunctionsHandler();
        double[] doubleArray13 = new double[] { (-1.0f), 1.0d };
        boolean boolean14 = switchingFunctionsHandler9.reset((double) (byte) 10, doubleArray13);
        boolean boolean15 = switchingFunctionsHandler9.isEmpty();
        double[] doubleArray23 = new double[] { Double.NaN, (short) 100, 100.0d, 100.0f, 0.0f, 10.0f };
        switchingFunctionsHandler9.stepAccepted((double) (-1L), doubleArray23);
        switchingFunctionsHandler0.stepAccepted((double) (byte) 10, doubleArray23);
        boolean boolean26 = switchingFunctionsHandler0.stop();
        boolean boolean27 = switchingFunctionsHandler0.isEmpty();
        org.apache.commons.math.ode.SwitchingFunctionsHandler switchingFunctionsHandler29 = new org.apache.commons.math.ode.SwitchingFunctionsHandler();
        double[] doubleArray33 = new double[] { (-1.0f), 1.0d };
        boolean boolean34 = switchingFunctionsHandler29.reset((double) (byte) 10, doubleArray33);
        org.apache.commons.math.ode.SwitchingFunctionsHandler switchingFunctionsHandler36 = new org.apache.commons.math.ode.SwitchingFunctionsHandler();
        double[] doubleArray40 = new double[] { (-1.0f), 1.0d };
        boolean boolean41 = switchingFunctionsHandler36.reset((double) (byte) 10, doubleArray40);
        double[] doubleArray47 = new double[] { 10, 0.0d, '4', 1.0d };
        boolean boolean48 = switchingFunctionsHandler36.reset((double) (-1), doubleArray47);
        switchingFunctionsHandler29.stepAccepted((double) (byte) -1, doubleArray47);
        boolean boolean50 = switchingFunctionsHandler0.reset((double) (-1L), doubleArray47);
        boolean boolean51 = switchingFunctionsHandler0.stop();
        double double52 = switchingFunctionsHandler0.getEventTime();
        boolean boolean53 = switchingFunctionsHandler0.isEmpty();
        boolean boolean54 = switchingFunctionsHandler0.isEmpty();
        org.apache.commons.math.ode.StepInterpolator stepInterpolator55 = null;
        boolean boolean56 = switchingFunctionsHandler0.evaluateStep(stepInterpolator55);
        org.apache.commons.math.ode.StepInterpolator stepInterpolator57 = null;
        boolean boolean58 = switchingFunctionsHandler0.evaluateStep(stepInterpolator57);
        org.apache.commons.math.ode.SwitchingFunctionsHandler switchingFunctionsHandler60 = new org.apache.commons.math.ode.SwitchingFunctionsHandler();
        double[] doubleArray64 = new double[] { (-1.0f), 1.0d };
        boolean boolean65 = switchingFunctionsHandler60.reset((double) (byte) 10, doubleArray64);
        boolean boolean66 = switchingFunctionsHandler60.isEmpty();
        double[] doubleArray74 = new double[] { Double.NaN, (short) 100, 100.0d, 100.0f, 0.0f, 10.0f };
        switchingFunctionsHandler60.stepAccepted((double) (-1L), doubleArray74);
        double double76 = switchingFunctionsHandler60.getEventTime();
        double[] doubleArray79 = new double[] { 0L };
        boolean boolean80 = switchingFunctionsHandler60.reset(97.0d, doubleArray79);
        boolean boolean81 = switchingFunctionsHandler0.reset(32.0d, doubleArray79);
        org.junit.Assert.assertNotNull(doubleArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray6), "[3.0, 0.0, 100.0, 100.0]");
        org.junit.Assert.assertNotNull(doubleArray13);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray13), "[-1.0, 1.0]");
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertNotNull(doubleArray23);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray23), "[NaN, 100.0, 100.0, 100.0, 0.0, 10.0]");
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + true + "'", boolean27 == true);
        org.junit.Assert.assertNotNull(doubleArray33);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray33), "[-1.0, 1.0]");
        org.junit.Assert.assertTrue("'" + boolean34 + "' != '" + false + "'", boolean34 == false);
        org.junit.Assert.assertNotNull(doubleArray40);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray40), "[-1.0, 1.0]");
        org.junit.Assert.assertTrue("'" + boolean41 + "' != '" + false + "'", boolean41 == false);
        org.junit.Assert.assertNotNull(doubleArray47);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray47), "[10.0, 0.0, 52.0, 1.0]");
        org.junit.Assert.assertTrue("'" + boolean48 + "' != '" + false + "'", boolean48 == false);
        org.junit.Assert.assertTrue("'" + boolean50 + "' != '" + false + "'", boolean50 == false);
        org.junit.Assert.assertTrue("'" + boolean51 + "' != '" + false + "'", boolean51 == false);
        org.junit.Assert.assertTrue(Double.isNaN(double52));
        org.junit.Assert.assertTrue("'" + boolean53 + "' != '" + true + "'", boolean53 == true);
        org.junit.Assert.assertTrue("'" + boolean54 + "' != '" + true + "'", boolean54 == true);
        org.junit.Assert.assertTrue("'" + boolean56 + "' != '" + false + "'", boolean56 == false);
        org.junit.Assert.assertTrue("'" + boolean58 + "' != '" + false + "'", boolean58 == false);
        org.junit.Assert.assertNotNull(doubleArray64);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray64), "[-1.0, 1.0]");
        org.junit.Assert.assertTrue("'" + boolean65 + "' != '" + false + "'", boolean65 == false);
        org.junit.Assert.assertTrue("'" + boolean66 + "' != '" + true + "'", boolean66 == true);
        org.junit.Assert.assertNotNull(doubleArray74);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray74), "[NaN, 100.0, 100.0, 100.0, 0.0, 10.0]");
        org.junit.Assert.assertTrue(Double.isNaN(double76));
        org.junit.Assert.assertNotNull(doubleArray79);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray79), "[0.0]");
        org.junit.Assert.assertTrue("'" + boolean80 + "' != '" + false + "'", boolean80 == false);
        org.junit.Assert.assertTrue("'" + boolean81 + "' != '" + false + "'", boolean81 == false);
    }

    @Test
    public void test16062() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest32.test16062");
        org.apache.commons.math.FunctionEvaluationException functionEvaluationException7 = new org.apache.commons.math.FunctionEvaluationException((double) (byte) 10, "org.apache.commons.math.ConvergenceException: Evaluation failed for argument = 1");
        org.apache.commons.math.FunctionEvaluationException functionEvaluationException8 = new org.apache.commons.math.FunctionEvaluationException((double) 10, "org.apache.commons.math.ode.DerivativeException: hi!", (java.lang.Throwable) functionEvaluationException7);
        double double9 = functionEvaluationException7.getArgument();
        org.apache.commons.math.FunctionEvaluationException functionEvaluationException10 = new org.apache.commons.math.FunctionEvaluationException(52.0d, "org.apache.commons.math.ode.IntegratorException: org.apache.commons.math.FunctionEvaluationException: org.apache.commons.math.ode.DerivativeException: org.apache.commons.math.ode.DerivativeException: hi!", (java.lang.Throwable) functionEvaluationException7);
        org.apache.commons.math.ode.DerivativeException derivativeException11 = new org.apache.commons.math.ode.DerivativeException((java.lang.Throwable) functionEvaluationException10);
        org.apache.commons.math.FunctionEvaluationException functionEvaluationException12 = new org.apache.commons.math.FunctionEvaluationException((double) 'a', (java.lang.Throwable) functionEvaluationException10);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 10.0d + "'", double9 == 10.0d);
    }

    @Test
    public void test16063() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest32.test16063");
        java.lang.String[] strArray8 = new java.lang.String[] { "hi!" };
        org.apache.commons.math.ode.DerivativeException derivativeException9 = new org.apache.commons.math.ode.DerivativeException("hi!", strArray8);
        org.apache.commons.math.FunctionEvaluationException functionEvaluationException10 = new org.apache.commons.math.FunctionEvaluationException((double) (byte) 100, "", (java.lang.Object[]) strArray8);
        org.apache.commons.math.ode.DerivativeException derivativeException11 = new org.apache.commons.math.ode.DerivativeException("org.apache.commons.math.ConvergenceException: org.apache.commons.math.ode.DerivativeException: hi!", strArray8);
        org.apache.commons.math.ConvergenceException convergenceException12 = new org.apache.commons.math.ConvergenceException("org.apache.commons.math.ode.DerivativeException: ", (java.lang.Object[]) strArray8);
        org.apache.commons.math.ode.DerivativeException derivativeException13 = new org.apache.commons.math.ode.DerivativeException("org.apache.commons.math.ConvergenceException: org.apache.commons.math.ode.IntegratorException: Evaluation failed for argument = 97", strArray8);
        org.apache.commons.math.ConvergenceException convergenceException14 = new org.apache.commons.math.ConvergenceException("org.apache.commons.math.FunctionEvaluationException: org.apache.commons.math.FunctionEvaluationException: org.apache.commons.math.ode.IntegratorException: org.apache.commons.math.ConvergenceException: ", (java.lang.Object[]) strArray8);
        org.junit.Assert.assertNotNull(strArray8);
    }

    @Test
    public void test16064() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest32.test16064");
        java.lang.String[] strArray13 = new java.lang.String[] { "hi!" };
        org.apache.commons.math.ode.DerivativeException derivativeException14 = new org.apache.commons.math.ode.DerivativeException("hi!", strArray13);
        org.apache.commons.math.FunctionEvaluationException functionEvaluationException15 = new org.apache.commons.math.FunctionEvaluationException((double) (byte) 100, "", (java.lang.Object[]) strArray13);
        org.apache.commons.math.ConvergenceException convergenceException16 = new org.apache.commons.math.ConvergenceException("hi!", (java.lang.Object[]) strArray13);
        org.apache.commons.math.ode.IntegratorException integratorException17 = new org.apache.commons.math.ode.IntegratorException("org.apache.commons.math.ConvergenceException: ", (java.lang.Object[]) strArray13);
        org.apache.commons.math.ode.DerivativeException derivativeException18 = new org.apache.commons.math.ode.DerivativeException("org.apache.commons.math.ConvergenceException: ", strArray13);
        org.apache.commons.math.ode.DerivativeException derivativeException19 = new org.apache.commons.math.ode.DerivativeException("org.apache.commons.math.ConvergenceException: ", strArray13);
        org.apache.commons.math.FunctionEvaluationException functionEvaluationException21 = new org.apache.commons.math.FunctionEvaluationException((double) 0.0f);
        org.apache.commons.math.ConvergenceException convergenceException22 = new org.apache.commons.math.ConvergenceException("org.apache.commons.math.FunctionEvaluationException: org.apache.commons.math.ode.DerivativeException: hi!", (java.lang.Object[]) strArray13, (java.lang.Throwable) functionEvaluationException21);
        org.apache.commons.math.ConvergenceException convergenceException23 = new org.apache.commons.math.ConvergenceException("", (java.lang.Object[]) strArray13);
        java.lang.String[] strArray30 = new java.lang.String[] { "hi!" };
        org.apache.commons.math.ode.DerivativeException derivativeException31 = new org.apache.commons.math.ode.DerivativeException("hi!", strArray30);
        org.apache.commons.math.FunctionEvaluationException functionEvaluationException32 = new org.apache.commons.math.FunctionEvaluationException((double) (byte) 100, "", (java.lang.Object[]) strArray30);
        org.apache.commons.math.ConvergenceException convergenceException33 = new org.apache.commons.math.ConvergenceException("hi!", (java.lang.Object[]) strArray30);
        org.apache.commons.math.ode.IntegratorException integratorException34 = new org.apache.commons.math.ode.IntegratorException("org.apache.commons.math.ConvergenceException: ", (java.lang.Object[]) strArray30);
        java.lang.Throwable[] throwableArray35 = integratorException34.getSuppressed();
        org.apache.commons.math.ConvergenceException convergenceException36 = new org.apache.commons.math.ConvergenceException((java.lang.Throwable) integratorException34);
        org.apache.commons.math.ode.IntegratorException integratorException37 = new org.apache.commons.math.ode.IntegratorException((java.lang.Throwable) convergenceException36);
        org.apache.commons.math.ConvergenceException convergenceException38 = new org.apache.commons.math.ConvergenceException("org.apache.commons.math.ode.DerivativeException: org.apache.commons.math.FunctionEvaluationException: ", (java.lang.Object[]) strArray13, (java.lang.Throwable) integratorException37);
        org.apache.commons.math.ConvergenceException convergenceException39 = new org.apache.commons.math.ConvergenceException("org.apache.commons.math.FunctionEvaluationException: org.apache.commons.math.FunctionEvaluationException: org.apache.commons.math.ode.IntegratorException: Evaluation failed for argument = 97", (java.lang.Object[]) strArray13);
        org.apache.commons.math.ode.DerivativeException derivativeException40 = new org.apache.commons.math.ode.DerivativeException("org.apache.commons.math.ode.IntegratorException: org.apache.commons.math.ConvergenceException: ", strArray13);
        org.junit.Assert.assertNotNull(strArray13);
        org.junit.Assert.assertNotNull(strArray30);
        org.junit.Assert.assertNotNull(throwableArray35);
    }

    @Test
    public void test16065() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest32.test16065");
        java.lang.String[] strArray9 = new java.lang.String[] { "hi!" };
        org.apache.commons.math.ode.DerivativeException derivativeException10 = new org.apache.commons.math.ode.DerivativeException("hi!", strArray9);
        org.apache.commons.math.FunctionEvaluationException functionEvaluationException11 = new org.apache.commons.math.FunctionEvaluationException((double) 1, "hi!", (java.lang.Object[]) strArray9);
        org.apache.commons.math.ode.DerivativeException derivativeException12 = new org.apache.commons.math.ode.DerivativeException("org.apache.commons.math.FunctionEvaluationException: ", strArray9);
        org.apache.commons.math.ConvergenceException convergenceException13 = new org.apache.commons.math.ConvergenceException("org.apache.commons.math.ode.DerivativeException: Evaluation failed for argument = hi!", (java.lang.Object[]) strArray9);
        org.apache.commons.math.ConvergenceException convergenceException14 = new org.apache.commons.math.ConvergenceException("org.apache.commons.math.ode.IntegratorException: org.apache.commons.math.ConvergenceException: Evaluation failed for argument = 1", (java.lang.Object[]) strArray9);
        org.apache.commons.math.FunctionEvaluationException functionEvaluationException15 = new org.apache.commons.math.FunctionEvaluationException((double) (-1), "org.apache.commons.math.ConvergenceException: org.apache.commons.math.ConvergenceException: org.apache.commons.math.ode.DerivativeException: hi!", (java.lang.Throwable) convergenceException14);
        org.junit.Assert.assertNotNull(strArray9);
    }

    @Test
    public void test16066() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest32.test16066");
        java.lang.Object[] objArray6 = new java.lang.Object[] { 10.0d };
        org.apache.commons.math.FunctionEvaluationException functionEvaluationException9 = new org.apache.commons.math.FunctionEvaluationException((double) 'a');
        org.apache.commons.math.ConvergenceException convergenceException10 = new org.apache.commons.math.ConvergenceException("hi!", (java.lang.Throwable) functionEvaluationException9);
        org.apache.commons.math.FunctionEvaluationException functionEvaluationException11 = new org.apache.commons.math.FunctionEvaluationException((double) 0L, "org.apache.commons.math.ode.DerivativeException: hi!", objArray6, (java.lang.Throwable) convergenceException10);
        org.apache.commons.math.ConvergenceException convergenceException12 = new org.apache.commons.math.ConvergenceException("org.apache.commons.math.FunctionEvaluationException: ", objArray6);
        org.apache.commons.math.ConvergenceException convergenceException13 = new org.apache.commons.math.ConvergenceException("", objArray6);
        java.lang.Throwable throwable16 = null;
        org.apache.commons.math.ode.IntegratorException integratorException17 = new org.apache.commons.math.ode.IntegratorException(throwable16);
        java.lang.String[] strArray24 = new java.lang.String[] { "hi!" };
        org.apache.commons.math.ode.DerivativeException derivativeException25 = new org.apache.commons.math.ode.DerivativeException("hi!", strArray24);
        org.apache.commons.math.FunctionEvaluationException functionEvaluationException26 = new org.apache.commons.math.FunctionEvaluationException((double) (byte) 100, "", (java.lang.Object[]) strArray24);
        org.apache.commons.math.ConvergenceException convergenceException27 = new org.apache.commons.math.ConvergenceException("hi!", (java.lang.Object[]) strArray24);
        org.apache.commons.math.ode.IntegratorException integratorException28 = new org.apache.commons.math.ode.IntegratorException("org.apache.commons.math.ConvergenceException: ", (java.lang.Object[]) strArray24);
        integratorException17.addSuppressed((java.lang.Throwable) integratorException28);
        org.apache.commons.math.FunctionEvaluationException functionEvaluationException30 = new org.apache.commons.math.FunctionEvaluationException((double) (-1L), "org.apache.commons.math.ode.DerivativeException: Evaluation failed for argument = 97", (java.lang.Throwable) integratorException28);
        org.apache.commons.math.ConvergenceException convergenceException31 = new org.apache.commons.math.ConvergenceException("org.apache.commons.math.ConvergenceException: org.apache.commons.math.ode.DerivativeException: hi!", objArray6, (java.lang.Throwable) integratorException28);
        org.apache.commons.math.ode.DerivativeException derivativeException32 = new org.apache.commons.math.ode.DerivativeException((java.lang.Throwable) convergenceException31);
        org.apache.commons.math.ode.IntegratorException integratorException33 = new org.apache.commons.math.ode.IntegratorException((java.lang.Throwable) derivativeException32);
        java.lang.String str34 = integratorException33.getPattern();
        java.lang.Object[] objArray35 = integratorException33.getArguments();
        org.junit.Assert.assertNotNull(objArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray6), "[10.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray6), "[10.0]");
        org.junit.Assert.assertNotNull(strArray24);
        org.junit.Assert.assertEquals("'" + str34 + "' != '" + "org.apache.commons.math.ConvergenceException: org.apache.commons.math.ode.DerivativeException: hi!" + "'", str34, "org.apache.commons.math.ConvergenceException: org.apache.commons.math.ode.DerivativeException: hi!");
        org.junit.Assert.assertNotNull(objArray35);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray35), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray35), "[]");
    }

    @Test
    public void test16067() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest32.test16067");
        java.lang.String[] strArray4 = new java.lang.String[] { "hi!" };
        org.apache.commons.math.ode.DerivativeException derivativeException5 = new org.apache.commons.math.ode.DerivativeException("hi!", strArray4);
        org.apache.commons.math.ode.DerivativeException derivativeException6 = new org.apache.commons.math.ode.DerivativeException((java.lang.Throwable) derivativeException5);
        org.apache.commons.math.ode.IntegratorException integratorException7 = new org.apache.commons.math.ode.IntegratorException((java.lang.Throwable) derivativeException5);
        org.apache.commons.math.FunctionEvaluationException functionEvaluationException9 = new org.apache.commons.math.FunctionEvaluationException((double) 'a');
        java.lang.Throwable[] throwableArray10 = functionEvaluationException9.getSuppressed();
        org.apache.commons.math.ode.DerivativeException derivativeException11 = new org.apache.commons.math.ode.DerivativeException((java.lang.Throwable) functionEvaluationException9);
        derivativeException5.addSuppressed((java.lang.Throwable) functionEvaluationException9);
        org.apache.commons.math.FunctionEvaluationException functionEvaluationException13 = new org.apache.commons.math.FunctionEvaluationException((double) (byte) 0, "org.apache.commons.math.ConvergenceException: org.apache.commons.math.ode.DerivativeException: org.apache.commons.math.FunctionEvaluationException: hi!", (java.lang.Throwable) derivativeException5);
        org.apache.commons.math.ConvergenceException convergenceException14 = new org.apache.commons.math.ConvergenceException((java.lang.Throwable) derivativeException5);
        org.junit.Assert.assertNotNull(strArray4);
        org.junit.Assert.assertNotNull(throwableArray10);
    }

    @Test
    public void test16068() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest32.test16068");
        java.lang.Object[] objArray11 = new java.lang.Object[] { 10.0d };
        org.apache.commons.math.FunctionEvaluationException functionEvaluationException14 = new org.apache.commons.math.FunctionEvaluationException((double) 'a');
        org.apache.commons.math.ConvergenceException convergenceException15 = new org.apache.commons.math.ConvergenceException("hi!", (java.lang.Throwable) functionEvaluationException14);
        org.apache.commons.math.FunctionEvaluationException functionEvaluationException16 = new org.apache.commons.math.FunctionEvaluationException((double) 0L, "org.apache.commons.math.ode.DerivativeException: hi!", objArray11, (java.lang.Throwable) convergenceException15);
        org.apache.commons.math.ConvergenceException convergenceException17 = new org.apache.commons.math.ConvergenceException("org.apache.commons.math.ode.DerivativeException: hi!", objArray11);
        org.apache.commons.math.FunctionEvaluationException functionEvaluationException18 = new org.apache.commons.math.FunctionEvaluationException((double) (byte) 100, "", objArray11);
        org.apache.commons.math.FunctionEvaluationException functionEvaluationException28 = new org.apache.commons.math.FunctionEvaluationException((double) 'a');
        java.lang.Throwable[] throwableArray29 = functionEvaluationException28.getSuppressed();
        org.apache.commons.math.FunctionEvaluationException functionEvaluationException31 = new org.apache.commons.math.FunctionEvaluationException((double) 'a');
        org.apache.commons.math.FunctionEvaluationException functionEvaluationException34 = new org.apache.commons.math.FunctionEvaluationException((double) 'a');
        org.apache.commons.math.ConvergenceException convergenceException35 = new org.apache.commons.math.ConvergenceException("hi!", (java.lang.Throwable) functionEvaluationException34);
        functionEvaluationException31.addSuppressed((java.lang.Throwable) convergenceException35);
        org.apache.commons.math.FunctionEvaluationException functionEvaluationException37 = new org.apache.commons.math.FunctionEvaluationException((double) (byte) -1, "org.apache.commons.math.ode.DerivativeException: hi!", (java.lang.Object[]) throwableArray29, (java.lang.Throwable) functionEvaluationException31);
        java.lang.Object[] objArray38 = functionEvaluationException31.getArguments();
        org.apache.commons.math.ConvergenceException convergenceException39 = new org.apache.commons.math.ConvergenceException("hi!", objArray38);
        org.apache.commons.math.FunctionEvaluationException functionEvaluationException40 = new org.apache.commons.math.FunctionEvaluationException((double) '#', "org.apache.commons.math.ConvergenceException: ", objArray38);
        org.apache.commons.math.ode.IntegratorException integratorException41 = new org.apache.commons.math.ode.IntegratorException("org.apache.commons.math.FunctionEvaluationException: org.apache.commons.math.ode.DerivativeException: hi!", objArray38);
        org.apache.commons.math.ode.IntegratorException integratorException42 = new org.apache.commons.math.ode.IntegratorException("org.apache.commons.math.ConvergenceException: org.apache.commons.math.ode.DerivativeException: hi!", objArray38);
        java.lang.Object[] objArray44 = new java.lang.Object[] {};
        org.apache.commons.math.ode.IntegratorException integratorException45 = new org.apache.commons.math.ode.IntegratorException("hi!", objArray44);
        java.lang.Throwable[] throwableArray46 = integratorException45.getSuppressed();
        org.apache.commons.math.ConvergenceException convergenceException47 = new org.apache.commons.math.ConvergenceException((java.lang.Throwable) integratorException45);
        org.apache.commons.math.ConvergenceException convergenceException48 = new org.apache.commons.math.ConvergenceException("hi!", objArray38, (java.lang.Throwable) integratorException45);
        org.apache.commons.math.ConvergenceException convergenceException49 = new org.apache.commons.math.ConvergenceException("org.apache.commons.math.ConvergenceException: hi!", objArray11, (java.lang.Throwable) integratorException45);
        org.apache.commons.math.ode.IntegratorException integratorException50 = new org.apache.commons.math.ode.IntegratorException("", objArray11);
        org.apache.commons.math.ConvergenceException convergenceException51 = new org.apache.commons.math.ConvergenceException("org.apache.commons.math.ode.IntegratorException: org.apache.commons.math.ode.DerivativeException: org.apache.commons.math.ConvergenceException: org.apache.commons.math.ode.DerivativeException: hi!", (java.lang.Throwable) integratorException50);
        org.apache.commons.math.FunctionEvaluationException functionEvaluationException52 = new org.apache.commons.math.FunctionEvaluationException((double) (short) 100, (java.lang.Throwable) convergenceException51);
        java.lang.Object[] objArray53 = convergenceException51.getArguments();
        org.apache.commons.math.ode.IntegratorException integratorException54 = new org.apache.commons.math.ode.IntegratorException("org.apache.commons.math.ode.DerivativeException: org.apache.commons.math.ode.DerivativeException: org.apache.commons.math.FunctionEvaluationException: org.apache.commons.math.ode.DerivativeException: hi!", objArray53);
        org.junit.Assert.assertNotNull(objArray11);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray11), "[10.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray11), "[10.0]");
        org.junit.Assert.assertNotNull(throwableArray29);
        org.junit.Assert.assertNotNull(objArray38);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray38), "[97.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray38), "[97.0]");
        org.junit.Assert.assertNotNull(objArray44);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray44), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray44), "[]");
        org.junit.Assert.assertNotNull(throwableArray46);
        org.junit.Assert.assertNotNull(objArray53);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray53), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray53), "[]");
    }

    @Test
    public void test16069() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest32.test16069");
        org.apache.commons.math.FunctionEvaluationException functionEvaluationException2 = new org.apache.commons.math.FunctionEvaluationException((double) 1L, "org.apache.commons.math.ode.DerivativeException: org.apache.commons.math.ConvergenceException: org.apache.commons.math.ConvergenceException: hi!");
    }

    @Test
    public void test16070() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest32.test16070");
        org.apache.commons.math.FunctionEvaluationException functionEvaluationException5 = new org.apache.commons.math.FunctionEvaluationException((double) 'a');
        java.lang.Throwable[] throwableArray6 = functionEvaluationException5.getSuppressed();
        org.apache.commons.math.FunctionEvaluationException functionEvaluationException8 = new org.apache.commons.math.FunctionEvaluationException((double) 'a');
        org.apache.commons.math.FunctionEvaluationException functionEvaluationException11 = new org.apache.commons.math.FunctionEvaluationException((double) 'a');
        org.apache.commons.math.ConvergenceException convergenceException12 = new org.apache.commons.math.ConvergenceException("hi!", (java.lang.Throwable) functionEvaluationException11);
        functionEvaluationException8.addSuppressed((java.lang.Throwable) convergenceException12);
        org.apache.commons.math.FunctionEvaluationException functionEvaluationException14 = new org.apache.commons.math.FunctionEvaluationException((double) (byte) -1, "org.apache.commons.math.ode.DerivativeException: hi!", (java.lang.Object[]) throwableArray6, (java.lang.Throwable) functionEvaluationException8);
        java.lang.Object[] objArray15 = functionEvaluationException8.getArguments();
        org.apache.commons.math.ConvergenceException convergenceException16 = new org.apache.commons.math.ConvergenceException("hi!", objArray15);
        java.lang.Object[] objArray20 = new java.lang.Object[] { 10.0d };
        org.apache.commons.math.FunctionEvaluationException functionEvaluationException23 = new org.apache.commons.math.FunctionEvaluationException((double) 'a');
        org.apache.commons.math.ConvergenceException convergenceException24 = new org.apache.commons.math.ConvergenceException("hi!", (java.lang.Throwable) functionEvaluationException23);
        org.apache.commons.math.FunctionEvaluationException functionEvaluationException25 = new org.apache.commons.math.FunctionEvaluationException((double) 0L, "org.apache.commons.math.ode.DerivativeException: hi!", objArray20, (java.lang.Throwable) convergenceException24);
        org.apache.commons.math.ConvergenceException convergenceException26 = new org.apache.commons.math.ConvergenceException("", objArray15, (java.lang.Throwable) convergenceException24);
        java.lang.String[] strArray32 = new java.lang.String[] { "hi!" };
        org.apache.commons.math.ode.DerivativeException derivativeException33 = new org.apache.commons.math.ode.DerivativeException("hi!", strArray32);
        org.apache.commons.math.FunctionEvaluationException functionEvaluationException34 = new org.apache.commons.math.FunctionEvaluationException((double) (byte) 100, "", (java.lang.Object[]) strArray32);
        org.apache.commons.math.ConvergenceException convergenceException35 = new org.apache.commons.math.ConvergenceException("hi!", (java.lang.Object[]) strArray32);
        java.lang.Throwable[] throwableArray36 = convergenceException35.getSuppressed();
        convergenceException24.addSuppressed((java.lang.Throwable) convergenceException35);
        java.lang.Throwable throwable40 = null;
        org.apache.commons.math.FunctionEvaluationException functionEvaluationException41 = new org.apache.commons.math.FunctionEvaluationException(97.0d, "org.apache.commons.math.ode.DerivativeException: org.apache.commons.math.ode.DerivativeException: Evaluation failed for argument = 1", throwable40);
        double double42 = functionEvaluationException41.getArgument();
        convergenceException35.addSuppressed((java.lang.Throwable) functionEvaluationException41);
        org.junit.Assert.assertNotNull(throwableArray6);
        org.junit.Assert.assertNotNull(objArray15);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray15), "[97.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray15), "[97.0]");
        org.junit.Assert.assertNotNull(objArray20);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray20), "[10.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray20), "[10.0]");
        org.junit.Assert.assertNotNull(strArray32);
        org.junit.Assert.assertNotNull(throwableArray36);
        org.junit.Assert.assertTrue("'" + double42 + "' != '" + 97.0d + "'", double42 == 97.0d);
    }

    @Test
    public void test16071() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest32.test16071");
        org.apache.commons.math.ode.SwitchingFunctionsHandler switchingFunctionsHandler0 = new org.apache.commons.math.ode.SwitchingFunctionsHandler();
        double[] doubleArray4 = new double[] { (-1.0f), 1.0d };
        boolean boolean5 = switchingFunctionsHandler0.reset((double) (byte) 10, doubleArray4);
        org.apache.commons.math.ode.StepInterpolator stepInterpolator6 = null;
        boolean boolean7 = switchingFunctionsHandler0.evaluateStep(stepInterpolator6);
        org.apache.commons.math.ode.StepInterpolator stepInterpolator8 = null;
        boolean boolean9 = switchingFunctionsHandler0.evaluateStep(stepInterpolator8);
        org.apache.commons.math.ode.SwitchingFunction switchingFunction10 = null;
        switchingFunctionsHandler0.add(switchingFunction10, (double) (short) 100, 0.0d, (int) (short) 1);
        double double15 = switchingFunctionsHandler0.getEventTime();
        org.apache.commons.math.ode.SwitchingFunctionsHandler switchingFunctionsHandler17 = new org.apache.commons.math.ode.SwitchingFunctionsHandler();
        double[] doubleArray23 = new double[] { 3, (byte) 0, 100.0d, 100 };
        switchingFunctionsHandler17.stepAccepted((double) (short) 0, doubleArray23);
        boolean boolean25 = switchingFunctionsHandler0.reset((double) 0.0f, doubleArray23);
        boolean boolean26 = switchingFunctionsHandler0.isEmpty();
        org.apache.commons.math.ode.SwitchingFunctionsHandler switchingFunctionsHandler28 = new org.apache.commons.math.ode.SwitchingFunctionsHandler();
        double[] doubleArray32 = new double[] { (-1.0f), 1.0d };
        boolean boolean33 = switchingFunctionsHandler28.reset((double) (byte) 10, doubleArray32);
        org.apache.commons.math.ode.StepInterpolator stepInterpolator34 = null;
        boolean boolean35 = switchingFunctionsHandler28.evaluateStep(stepInterpolator34);
        org.apache.commons.math.ode.SwitchingFunctionsHandler switchingFunctionsHandler37 = new org.apache.commons.math.ode.SwitchingFunctionsHandler();
        double[] doubleArray41 = new double[] { (-1.0f), 1.0d };
        boolean boolean42 = switchingFunctionsHandler37.reset((double) (byte) 10, doubleArray41);
        double[] doubleArray48 = new double[] { 10, 0.0d, '4', 1.0d };
        boolean boolean49 = switchingFunctionsHandler37.reset((double) (-1), doubleArray48);
        switchingFunctionsHandler28.stepAccepted(0.0d, doubleArray48);
        org.apache.commons.math.ode.SwitchingFunctionsHandler switchingFunctionsHandler52 = new org.apache.commons.math.ode.SwitchingFunctionsHandler();
        double[] doubleArray56 = new double[] { (-1.0f), 1.0d };
        boolean boolean57 = switchingFunctionsHandler52.reset((double) (byte) 10, doubleArray56);
        switchingFunctionsHandler28.stepAccepted((double) 2, doubleArray56);
        boolean boolean59 = switchingFunctionsHandler0.reset(Double.NaN, doubleArray56);
        boolean boolean60 = switchingFunctionsHandler0.isEmpty();
        double double61 = switchingFunctionsHandler0.getEventTime();
        org.apache.commons.math.ode.SwitchingFunction switchingFunction62 = null;
        switchingFunctionsHandler0.add(switchingFunction62, (double) 0, (double) (-1.0f), 10);
        org.junit.Assert.assertNotNull(doubleArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray4), "[-1.0, 1.0]");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue(Double.isNaN(double15));
        org.junit.Assert.assertNotNull(doubleArray23);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray23), "[3.0, 0.0, 100.0, 100.0]");
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
        org.junit.Assert.assertNotNull(doubleArray32);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray32), "[-1.0, 1.0]");
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + false + "'", boolean33 == false);
        org.junit.Assert.assertTrue("'" + boolean35 + "' != '" + false + "'", boolean35 == false);
        org.junit.Assert.assertNotNull(doubleArray41);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray41), "[-1.0, 1.0]");
        org.junit.Assert.assertTrue("'" + boolean42 + "' != '" + false + "'", boolean42 == false);
        org.junit.Assert.assertNotNull(doubleArray48);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray48), "[10.0, 0.0, 52.0, 1.0]");
        org.junit.Assert.assertTrue("'" + boolean49 + "' != '" + false + "'", boolean49 == false);
        org.junit.Assert.assertNotNull(doubleArray56);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray56), "[-1.0, 1.0]");
        org.junit.Assert.assertTrue("'" + boolean57 + "' != '" + false + "'", boolean57 == false);
        org.junit.Assert.assertTrue("'" + boolean59 + "' != '" + false + "'", boolean59 == false);
        org.junit.Assert.assertTrue("'" + boolean60 + "' != '" + false + "'", boolean60 == false);
        org.junit.Assert.assertTrue(Double.isNaN(double61));
    }

    @Test
    public void test16072() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest32.test16072");
        org.apache.commons.math.FunctionEvaluationException functionEvaluationException9 = new org.apache.commons.math.FunctionEvaluationException((double) 'a');
        org.apache.commons.math.ConvergenceException convergenceException10 = new org.apache.commons.math.ConvergenceException("hi!", (java.lang.Throwable) functionEvaluationException9);
        java.lang.Throwable[] throwableArray11 = functionEvaluationException9.getSuppressed();
        org.apache.commons.math.ConvergenceException convergenceException12 = new org.apache.commons.math.ConvergenceException("", (java.lang.Object[]) throwableArray11);
        org.apache.commons.math.ConvergenceException convergenceException13 = new org.apache.commons.math.ConvergenceException((java.lang.Throwable) convergenceException12);
        java.lang.String str14 = convergenceException12.getPattern();
        org.apache.commons.math.FunctionEvaluationException functionEvaluationException15 = new org.apache.commons.math.FunctionEvaluationException((double) (short) 0, "Evaluation failed for argument = 97", (java.lang.Throwable) convergenceException12);
        org.apache.commons.math.ConvergenceException convergenceException16 = new org.apache.commons.math.ConvergenceException((java.lang.Throwable) convergenceException12);
        org.apache.commons.math.FunctionEvaluationException functionEvaluationException17 = new org.apache.commons.math.FunctionEvaluationException((double) 1.0f, "org.apache.commons.math.ode.IntegratorException: org.apache.commons.math.ConvergenceException: hi!", (java.lang.Throwable) convergenceException16);
        org.apache.commons.math.ode.IntegratorException integratorException18 = new org.apache.commons.math.ode.IntegratorException((java.lang.Throwable) functionEvaluationException17);
        org.apache.commons.math.FunctionEvaluationException functionEvaluationException19 = new org.apache.commons.math.FunctionEvaluationException(0.0d, "org.apache.commons.math.ode.DerivativeException: org.apache.commons.math.ode.IntegratorException: org.apache.commons.math.ode.IntegratorException: org.apache.commons.math.ConvergenceException: ", (java.lang.Throwable) integratorException18);
        org.junit.Assert.assertNotNull(throwableArray11);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
    }

    @Test
    public void test16073() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest32.test16073");
        java.lang.String[] strArray11 = new java.lang.String[] { "hi!" };
        org.apache.commons.math.ode.DerivativeException derivativeException12 = new org.apache.commons.math.ode.DerivativeException("hi!", strArray11);
        org.apache.commons.math.FunctionEvaluationException functionEvaluationException13 = new org.apache.commons.math.FunctionEvaluationException((double) (byte) 100, "", (java.lang.Object[]) strArray11);
        org.apache.commons.math.ode.DerivativeException derivativeException14 = new org.apache.commons.math.ode.DerivativeException("org.apache.commons.math.ConvergenceException: ", strArray11);
        org.apache.commons.math.FunctionEvaluationException functionEvaluationException15 = new org.apache.commons.math.FunctionEvaluationException((double) 10.0f, "org.apache.commons.math.FunctionEvaluationException: org.apache.commons.math.ode.DerivativeException: hi!", (java.lang.Object[]) strArray11);
        org.apache.commons.math.ode.IntegratorException integratorException16 = new org.apache.commons.math.ode.IntegratorException("org.apache.commons.math.ConvergenceException: ", (java.lang.Object[]) strArray11);
        java.lang.Object[] objArray17 = integratorException16.getArguments();
        org.apache.commons.math.FunctionEvaluationException functionEvaluationException18 = new org.apache.commons.math.FunctionEvaluationException((double) (short) 10, "org.apache.commons.math.ode.DerivativeException: org.apache.commons.math.FunctionEvaluationException: Evaluation failed for argument = 97", objArray17);
        org.apache.commons.math.ConvergenceException convergenceException19 = new org.apache.commons.math.ConvergenceException("org.apache.commons.math.ConvergenceException: org.apache.commons.math.ode.DerivativeException: org.apache.commons.math.FunctionEvaluationException: org.apache.commons.math.ode.DerivativeException: hi!", objArray17);
        org.junit.Assert.assertNotNull(strArray11);
        org.junit.Assert.assertNotNull(objArray17);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray17), "[hi!]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray17), "[hi!]");
    }

    @Test
    public void test16074() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest32.test16074");
        java.lang.String[] strArray9 = new java.lang.String[] { "hi!" };
        org.apache.commons.math.ode.DerivativeException derivativeException10 = new org.apache.commons.math.ode.DerivativeException("hi!", strArray9);
        org.apache.commons.math.FunctionEvaluationException functionEvaluationException11 = new org.apache.commons.math.FunctionEvaluationException((double) (byte) 100, "", (java.lang.Object[]) strArray9);
        org.apache.commons.math.ConvergenceException convergenceException12 = new org.apache.commons.math.ConvergenceException("hi!", (java.lang.Object[]) strArray9);
        org.apache.commons.math.ode.DerivativeException derivativeException13 = new org.apache.commons.math.ode.DerivativeException("", strArray9);
        org.apache.commons.math.ode.DerivativeException derivativeException14 = new org.apache.commons.math.ode.DerivativeException("org.apache.commons.math.FunctionEvaluationException: org.apache.commons.math.ode.DerivativeException: hi!", strArray9);
        org.apache.commons.math.ode.DerivativeException derivativeException15 = new org.apache.commons.math.ode.DerivativeException("org.apache.commons.math.ode.DerivativeException: org.apache.commons.math.FunctionEvaluationException", strArray9);
        org.apache.commons.math.ode.DerivativeException derivativeException16 = new org.apache.commons.math.ode.DerivativeException("org.apache.commons.math.ode.IntegratorException: Evaluation failed for argument = 97", strArray9);
        java.lang.Object[] objArray17 = derivativeException16.getArguments();
        java.lang.String str18 = derivativeException16.getPattern();
        org.junit.Assert.assertNotNull(strArray9);
        org.junit.Assert.assertNotNull(objArray17);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray17), "[hi!]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray17), "[hi!]");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "org.apache.commons.math.ode.IntegratorException: Evaluation failed for argument = 97" + "'", str18, "org.apache.commons.math.ode.IntegratorException: Evaluation failed for argument = 97");
    }

    @Test
    public void test16075() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest32.test16075");
        org.apache.commons.math.ode.SwitchingFunctionsHandler switchingFunctionsHandler0 = new org.apache.commons.math.ode.SwitchingFunctionsHandler();
        double[] doubleArray4 = new double[] { (-1.0f), 1.0d };
        boolean boolean5 = switchingFunctionsHandler0.reset((double) (byte) 10, doubleArray4);
        org.apache.commons.math.ode.StepInterpolator stepInterpolator6 = null;
        boolean boolean7 = switchingFunctionsHandler0.evaluateStep(stepInterpolator6);
        org.apache.commons.math.ode.StepInterpolator stepInterpolator8 = null;
        boolean boolean9 = switchingFunctionsHandler0.evaluateStep(stepInterpolator8);
        double double10 = switchingFunctionsHandler0.getEventTime();
        boolean boolean11 = switchingFunctionsHandler0.isEmpty();
        boolean boolean12 = switchingFunctionsHandler0.isEmpty();
        double double13 = switchingFunctionsHandler0.getEventTime();
        boolean boolean14 = switchingFunctionsHandler0.stop();
        org.apache.commons.math.ode.SwitchingFunctionsHandler switchingFunctionsHandler16 = new org.apache.commons.math.ode.SwitchingFunctionsHandler();
        double double17 = switchingFunctionsHandler16.getEventTime();
        double double18 = switchingFunctionsHandler16.getEventTime();
        org.apache.commons.math.ode.SwitchingFunctionsHandler switchingFunctionsHandler20 = new org.apache.commons.math.ode.SwitchingFunctionsHandler();
        double[] doubleArray24 = new double[] { (-1.0f), 1.0d };
        boolean boolean25 = switchingFunctionsHandler20.reset((double) (byte) 10, doubleArray24);
        org.apache.commons.math.ode.StepInterpolator stepInterpolator26 = null;
        boolean boolean27 = switchingFunctionsHandler20.evaluateStep(stepInterpolator26);
        org.apache.commons.math.ode.SwitchingFunctionsHandler switchingFunctionsHandler29 = new org.apache.commons.math.ode.SwitchingFunctionsHandler();
        double[] doubleArray33 = new double[] { (-1.0f), 1.0d };
        boolean boolean34 = switchingFunctionsHandler29.reset((double) (byte) 10, doubleArray33);
        double[] doubleArray40 = new double[] { 10, 0.0d, '4', 1.0d };
        boolean boolean41 = switchingFunctionsHandler29.reset((double) (-1), doubleArray40);
        switchingFunctionsHandler20.stepAccepted(0.0d, doubleArray40);
        switchingFunctionsHandler16.stepAccepted((double) (-1L), doubleArray40);
        switchingFunctionsHandler0.stepAccepted(97.0d, doubleArray40);
        boolean boolean45 = switchingFunctionsHandler0.stop();
        boolean boolean46 = switchingFunctionsHandler0.isEmpty();
        boolean boolean47 = switchingFunctionsHandler0.isEmpty();
        boolean boolean48 = switchingFunctionsHandler0.isEmpty();
        boolean boolean49 = switchingFunctionsHandler0.stop();
        org.junit.Assert.assertNotNull(doubleArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray4), "[-1.0, 1.0]");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue(Double.isNaN(double10));
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertTrue(Double.isNaN(double13));
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue(Double.isNaN(double17));
        org.junit.Assert.assertTrue(Double.isNaN(double18));
        org.junit.Assert.assertNotNull(doubleArray24);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray24), "[-1.0, 1.0]");
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + false + "'", boolean27 == false);
        org.junit.Assert.assertNotNull(doubleArray33);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray33), "[-1.0, 1.0]");
        org.junit.Assert.assertTrue("'" + boolean34 + "' != '" + false + "'", boolean34 == false);
        org.junit.Assert.assertNotNull(doubleArray40);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray40), "[10.0, 0.0, 52.0, 1.0]");
        org.junit.Assert.assertTrue("'" + boolean41 + "' != '" + false + "'", boolean41 == false);
        org.junit.Assert.assertTrue("'" + boolean45 + "' != '" + false + "'", boolean45 == false);
        org.junit.Assert.assertTrue("'" + boolean46 + "' != '" + true + "'", boolean46 == true);
        org.junit.Assert.assertTrue("'" + boolean47 + "' != '" + true + "'", boolean47 == true);
        org.junit.Assert.assertTrue("'" + boolean48 + "' != '" + true + "'", boolean48 == true);
        org.junit.Assert.assertTrue("'" + boolean49 + "' != '" + false + "'", boolean49 == false);
    }

    @Test
    public void test16076() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest32.test16076");
        java.lang.String[] strArray7 = new java.lang.String[] { "hi!" };
        org.apache.commons.math.ode.DerivativeException derivativeException8 = new org.apache.commons.math.ode.DerivativeException("hi!", strArray7);
        org.apache.commons.math.FunctionEvaluationException functionEvaluationException9 = new org.apache.commons.math.FunctionEvaluationException((double) (byte) 100, "", (java.lang.Object[]) strArray7);
        org.apache.commons.math.ode.DerivativeException derivativeException10 = new org.apache.commons.math.ode.DerivativeException("Evaluation failed for argument = {0}", strArray7);
        org.apache.commons.math.FunctionEvaluationException functionEvaluationException11 = new org.apache.commons.math.FunctionEvaluationException(97.0d, "org.apache.commons.math.FunctionEvaluationException", (java.lang.Object[]) strArray7);
        java.lang.String[] strArray17 = new java.lang.String[] { "hi!" };
        org.apache.commons.math.ode.DerivativeException derivativeException18 = new org.apache.commons.math.ode.DerivativeException("hi!", strArray17);
        org.apache.commons.math.ode.DerivativeException derivativeException19 = new org.apache.commons.math.ode.DerivativeException((java.lang.Throwable) derivativeException18);
        org.apache.commons.math.ode.IntegratorException integratorException20 = new org.apache.commons.math.ode.IntegratorException((java.lang.Throwable) derivativeException18);
        org.apache.commons.math.FunctionEvaluationException functionEvaluationException22 = new org.apache.commons.math.FunctionEvaluationException((double) 'a');
        java.lang.Throwable[] throwableArray23 = functionEvaluationException22.getSuppressed();
        org.apache.commons.math.ode.DerivativeException derivativeException24 = new org.apache.commons.math.ode.DerivativeException((java.lang.Throwable) functionEvaluationException22);
        derivativeException18.addSuppressed((java.lang.Throwable) functionEvaluationException22);
        java.lang.Object[] objArray26 = functionEvaluationException22.getArguments();
        org.apache.commons.math.ConvergenceException convergenceException27 = new org.apache.commons.math.ConvergenceException("org.apache.commons.math.FunctionEvaluationException: org.apache.commons.math.ode.DerivativeException: hi!", objArray26);
        org.apache.commons.math.FunctionEvaluationException functionEvaluationException28 = new org.apache.commons.math.FunctionEvaluationException((double) (short) 10, (java.lang.Throwable) convergenceException27);
        org.apache.commons.math.FunctionEvaluationException functionEvaluationException29 = new org.apache.commons.math.FunctionEvaluationException((double) 100.0f, (java.lang.Throwable) convergenceException27);
        functionEvaluationException11.addSuppressed((java.lang.Throwable) convergenceException27);
        java.lang.Object[] objArray31 = convergenceException27.getArguments();
        org.junit.Assert.assertNotNull(strArray7);
        org.junit.Assert.assertNotNull(strArray17);
        org.junit.Assert.assertNotNull(throwableArray23);
        org.junit.Assert.assertNotNull(objArray26);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray26), "[97.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray26), "[97.0]");
        org.junit.Assert.assertNotNull(objArray31);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray31), "[97.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray31), "[97.0]");
    }

    @Test
    public void test16077() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest32.test16077");
        org.apache.commons.math.FunctionEvaluationException functionEvaluationException3 = new org.apache.commons.math.FunctionEvaluationException(Double.NaN, "org.apache.commons.math.ode.IntegratorException: org.apache.commons.math.ConvergenceException: ");
        org.apache.commons.math.ConvergenceException convergenceException4 = new org.apache.commons.math.ConvergenceException((java.lang.Throwable) functionEvaluationException3);
        org.apache.commons.math.ConvergenceException convergenceException5 = new org.apache.commons.math.ConvergenceException("org.apache.commons.math.FunctionEvaluationException: org.apache.commons.math.FunctionEvaluationException: org.apache.commons.math.FunctionEvaluationException: Evaluation failed for argument = 1", (java.lang.Throwable) functionEvaluationException3);
    }

    @Test
    public void test16078() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest32.test16078");
        org.apache.commons.math.ConvergenceException convergenceException1 = new org.apache.commons.math.ConvergenceException("org.apache.commons.math.FunctionEvaluationException: org.apache.commons.math.FunctionEvaluationException: org.apache.commons.math.FunctionEvaluationException: org.apache.commons.math.FunctionEvaluationException: ");
    }

    @Test
    public void test16079() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest32.test16079");
        org.apache.commons.math.FunctionEvaluationException functionEvaluationException7 = new org.apache.commons.math.FunctionEvaluationException((double) 'a');
        java.lang.Throwable[] throwableArray8 = functionEvaluationException7.getSuppressed();
        org.apache.commons.math.FunctionEvaluationException functionEvaluationException10 = new org.apache.commons.math.FunctionEvaluationException((double) 'a');
        org.apache.commons.math.FunctionEvaluationException functionEvaluationException13 = new org.apache.commons.math.FunctionEvaluationException((double) 'a');
        org.apache.commons.math.ConvergenceException convergenceException14 = new org.apache.commons.math.ConvergenceException("hi!", (java.lang.Throwable) functionEvaluationException13);
        functionEvaluationException10.addSuppressed((java.lang.Throwable) convergenceException14);
        org.apache.commons.math.FunctionEvaluationException functionEvaluationException16 = new org.apache.commons.math.FunctionEvaluationException((double) (byte) -1, "org.apache.commons.math.ode.DerivativeException: hi!", (java.lang.Object[]) throwableArray8, (java.lang.Throwable) functionEvaluationException10);
        org.apache.commons.math.ode.DerivativeException derivativeException17 = new org.apache.commons.math.ode.DerivativeException((java.lang.Throwable) functionEvaluationException16);
        java.lang.Throwable[] throwableArray18 = functionEvaluationException16.getSuppressed();
        org.apache.commons.math.FunctionEvaluationException functionEvaluationException20 = new org.apache.commons.math.FunctionEvaluationException((double) 'a');
        org.apache.commons.math.ode.IntegratorException integratorException21 = new org.apache.commons.math.ode.IntegratorException((java.lang.Throwable) functionEvaluationException20);
        org.apache.commons.math.ode.IntegratorException integratorException22 = new org.apache.commons.math.ode.IntegratorException((java.lang.Throwable) functionEvaluationException20);
        java.lang.String str23 = functionEvaluationException20.getPattern();
        org.apache.commons.math.FunctionEvaluationException functionEvaluationException24 = new org.apache.commons.math.FunctionEvaluationException((double) 1L, "org.apache.commons.math.ConvergenceException: Evaluation failed for argument = 97", (java.lang.Object[]) throwableArray18, (java.lang.Throwable) functionEvaluationException20);
        org.apache.commons.math.FunctionEvaluationException functionEvaluationException25 = new org.apache.commons.math.FunctionEvaluationException(1.0d, "org.apache.commons.math.ConvergenceException: org.apache.commons.math.ConvergenceException: ", (java.lang.Object[]) throwableArray18);
        org.junit.Assert.assertNotNull(throwableArray8);
        org.junit.Assert.assertNotNull(throwableArray18);
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "Evaluation failed for argument = {0}" + "'", str23, "Evaluation failed for argument = {0}");
    }

    @Test
    public void test16080() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest32.test16080");
        java.lang.String[] strArray4 = new java.lang.String[] { "hi!" };
        org.apache.commons.math.ode.DerivativeException derivativeException5 = new org.apache.commons.math.ode.DerivativeException("hi!", strArray4);
        org.apache.commons.math.ConvergenceException convergenceException6 = new org.apache.commons.math.ConvergenceException("org.apache.commons.math.ode.DerivativeException: hi!", (java.lang.Throwable) derivativeException5);
        org.apache.commons.math.FunctionEvaluationException functionEvaluationException7 = new org.apache.commons.math.FunctionEvaluationException((double) (byte) 100, (java.lang.Throwable) convergenceException6);
        org.apache.commons.math.ode.IntegratorException integratorException8 = new org.apache.commons.math.ode.IntegratorException((java.lang.Throwable) functionEvaluationException7);
        java.lang.Throwable[] throwableArray9 = functionEvaluationException7.getSuppressed();
        org.junit.Assert.assertNotNull(strArray4);
        org.junit.Assert.assertNotNull(throwableArray9);
    }

    @Test
    public void test16081() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest32.test16081");
        org.apache.commons.math.FunctionEvaluationException functionEvaluationException2 = new org.apache.commons.math.FunctionEvaluationException((double) (short) -1, "org.apache.commons.math.ode.IntegratorException: org.apache.commons.math.ConvergenceException");
    }

    @Test
    public void test16082() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest32.test16082");
        org.apache.commons.math.FunctionEvaluationException functionEvaluationException7 = new org.apache.commons.math.FunctionEvaluationException((double) 'a');
        java.lang.Throwable[] throwableArray8 = functionEvaluationException7.getSuppressed();
        org.apache.commons.math.FunctionEvaluationException functionEvaluationException10 = new org.apache.commons.math.FunctionEvaluationException((double) 'a');
        org.apache.commons.math.FunctionEvaluationException functionEvaluationException13 = new org.apache.commons.math.FunctionEvaluationException((double) 'a');
        org.apache.commons.math.ConvergenceException convergenceException14 = new org.apache.commons.math.ConvergenceException("hi!", (java.lang.Throwable) functionEvaluationException13);
        functionEvaluationException10.addSuppressed((java.lang.Throwable) convergenceException14);
        org.apache.commons.math.FunctionEvaluationException functionEvaluationException16 = new org.apache.commons.math.FunctionEvaluationException((double) (byte) -1, "org.apache.commons.math.ode.DerivativeException: hi!", (java.lang.Object[]) throwableArray8, (java.lang.Throwable) functionEvaluationException10);
        double double17 = functionEvaluationException16.getArgument();
        org.apache.commons.math.ode.DerivativeException derivativeException18 = new org.apache.commons.math.ode.DerivativeException((java.lang.Throwable) functionEvaluationException16);
        org.apache.commons.math.FunctionEvaluationException functionEvaluationException19 = new org.apache.commons.math.FunctionEvaluationException((double) 2, "hi!", (java.lang.Throwable) derivativeException18);
        java.lang.Throwable[] throwableArray20 = derivativeException18.getSuppressed();
        org.apache.commons.math.ConvergenceException convergenceException21 = new org.apache.commons.math.ConvergenceException("org.apache.commons.math.ode.IntegratorException: org.apache.commons.math.ConvergenceException: ", (java.lang.Object[]) throwableArray20);
        org.apache.commons.math.ConvergenceException convergenceException27 = new org.apache.commons.math.ConvergenceException("org.apache.commons.math.ode.DerivativeException: org.apache.commons.math.ConvergenceException: ");
        java.lang.Throwable[] throwableArray28 = convergenceException27.getSuppressed();
        org.apache.commons.math.FunctionEvaluationException functionEvaluationException29 = new org.apache.commons.math.FunctionEvaluationException((double) 0, "org.apache.commons.math.ode.IntegratorException: org.apache.commons.math.FunctionEvaluationException: Evaluation failed for argument = 97", (java.lang.Object[]) throwableArray28);
        org.apache.commons.math.FunctionEvaluationException functionEvaluationException30 = new org.apache.commons.math.FunctionEvaluationException((double) '4', "org.apache.commons.math.ConvergenceException: org.apache.commons.math.FunctionEvaluationException: hi!", (java.lang.Throwable) functionEvaluationException29);
        org.apache.commons.math.ConvergenceException convergenceException31 = new org.apache.commons.math.ConvergenceException("org.apache.commons.math.FunctionEvaluationException: org.apache.commons.math.FunctionEvaluationException: org.apache.commons.math.ode.DerivativeException: hi!", (java.lang.Object[]) throwableArray20, (java.lang.Throwable) functionEvaluationException29);
        java.lang.Object[] objArray32 = functionEvaluationException29.getArguments();
        org.junit.Assert.assertNotNull(throwableArray8);
        org.junit.Assert.assertTrue("'" + double17 + "' != '" + (-1.0d) + "'", double17 == (-1.0d));
        org.junit.Assert.assertNotNull(throwableArray20);
        org.junit.Assert.assertNotNull(throwableArray28);
        org.junit.Assert.assertNotNull(objArray32);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray32), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray32), "[]");
    }

    @Test
    public void test16083() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest32.test16083");
        java.lang.String[] strArray17 = new java.lang.String[] { "hi!" };
        org.apache.commons.math.ode.DerivativeException derivativeException18 = new org.apache.commons.math.ode.DerivativeException("hi!", strArray17);
        org.apache.commons.math.FunctionEvaluationException functionEvaluationException19 = new org.apache.commons.math.FunctionEvaluationException((double) (byte) 100, "", (java.lang.Object[]) strArray17);
        org.apache.commons.math.ConvergenceException convergenceException20 = new org.apache.commons.math.ConvergenceException("hi!", (java.lang.Object[]) strArray17);
        org.apache.commons.math.ode.DerivativeException derivativeException21 = new org.apache.commons.math.ode.DerivativeException("", strArray17);
        org.apache.commons.math.ode.IntegratorException integratorException22 = new org.apache.commons.math.ode.IntegratorException("", (java.lang.Object[]) strArray17);
        org.apache.commons.math.FunctionEvaluationException functionEvaluationException23 = new org.apache.commons.math.FunctionEvaluationException(10.0d, "", (java.lang.Object[]) strArray17);
        org.apache.commons.math.ode.IntegratorException integratorException24 = new org.apache.commons.math.ode.IntegratorException("hi!", (java.lang.Object[]) strArray17);
        org.apache.commons.math.FunctionEvaluationException functionEvaluationException25 = new org.apache.commons.math.FunctionEvaluationException((double) (byte) -1, "org.apache.commons.math.ConvergenceException: org.apache.commons.math.FunctionEvaluationException: ", (java.lang.Object[]) strArray17);
        org.apache.commons.math.ode.DerivativeException derivativeException26 = new org.apache.commons.math.ode.DerivativeException("org.apache.commons.math.FunctionEvaluationException", strArray17);
        org.apache.commons.math.ConvergenceException convergenceException27 = new org.apache.commons.math.ConvergenceException("org.apache.commons.math.ConvergenceException: org.apache.commons.math.ConvergenceException: hi!", (java.lang.Object[]) strArray17);
        org.apache.commons.math.ode.DerivativeException derivativeException28 = new org.apache.commons.math.ode.DerivativeException("org.apache.commons.math.ConvergenceException: org.apache.commons.math.FunctionEvaluationException: org.apache.commons.math.ode.DerivativeException: Evaluation failed for argument = 97", strArray17);
        org.apache.commons.math.ode.DerivativeException derivativeException29 = new org.apache.commons.math.ode.DerivativeException("org.apache.commons.math.FunctionEvaluationException: org.apache.commons.math.ode.DerivativeException: org.apache.commons.math.ConvergenceException: org.apache.commons.math.ode.DerivativeException: hi!", strArray17);
        org.apache.commons.math.ConvergenceException convergenceException30 = new org.apache.commons.math.ConvergenceException("org.apache.commons.math.ConvergenceException: org.apache.commons.math.FunctionEvaluationException: org.apache.commons.math.ConvergenceException: org.apache.commons.math.FunctionEvaluationException: ", (java.lang.Object[]) strArray17);
        org.junit.Assert.assertNotNull(strArray17);
    }

    @Test
    public void test16084() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest32.test16084");
        java.lang.String[] strArray15 = new java.lang.String[] { "hi!" };
        org.apache.commons.math.ode.DerivativeException derivativeException16 = new org.apache.commons.math.ode.DerivativeException("hi!", strArray15);
        org.apache.commons.math.FunctionEvaluationException functionEvaluationException17 = new org.apache.commons.math.FunctionEvaluationException((double) (byte) 100, "", (java.lang.Object[]) strArray15);
        org.apache.commons.math.ConvergenceException convergenceException18 = new org.apache.commons.math.ConvergenceException("hi!", (java.lang.Object[]) strArray15);
        org.apache.commons.math.ode.DerivativeException derivativeException19 = new org.apache.commons.math.ode.DerivativeException("", strArray15);
        org.apache.commons.math.ode.IntegratorException integratorException20 = new org.apache.commons.math.ode.IntegratorException("", (java.lang.Object[]) strArray15);
        org.apache.commons.math.FunctionEvaluationException functionEvaluationException21 = new org.apache.commons.math.FunctionEvaluationException(10.0d, "", (java.lang.Object[]) strArray15);
        org.apache.commons.math.ode.IntegratorException integratorException22 = new org.apache.commons.math.ode.IntegratorException("hi!", (java.lang.Object[]) strArray15);
        org.apache.commons.math.ode.DerivativeException derivativeException23 = new org.apache.commons.math.ode.DerivativeException("org.apache.commons.math.ode.DerivativeException: Evaluation failed for argument = 1", strArray15);
        java.lang.String[] strArray27 = new java.lang.String[] { "hi!" };
        org.apache.commons.math.ode.DerivativeException derivativeException28 = new org.apache.commons.math.ode.DerivativeException("hi!", strArray27);
        org.apache.commons.math.ode.DerivativeException derivativeException29 = new org.apache.commons.math.ode.DerivativeException((java.lang.Throwable) derivativeException28);
        org.apache.commons.math.ode.IntegratorException integratorException30 = new org.apache.commons.math.ode.IntegratorException((java.lang.Throwable) derivativeException28);
        org.apache.commons.math.FunctionEvaluationException functionEvaluationException32 = new org.apache.commons.math.FunctionEvaluationException((double) 'a');
        java.lang.Throwable[] throwableArray33 = functionEvaluationException32.getSuppressed();
        org.apache.commons.math.ode.DerivativeException derivativeException34 = new org.apache.commons.math.ode.DerivativeException((java.lang.Throwable) functionEvaluationException32);
        derivativeException28.addSuppressed((java.lang.Throwable) functionEvaluationException32);
        java.lang.Throwable[] throwableArray36 = derivativeException28.getSuppressed();
        org.apache.commons.math.ode.IntegratorException integratorException37 = new org.apache.commons.math.ode.IntegratorException("org.apache.commons.math.FunctionEvaluationException: Evaluation failed for argument = 97", (java.lang.Object[]) throwableArray36);
        org.apache.commons.math.FunctionEvaluationException functionEvaluationException38 = new org.apache.commons.math.FunctionEvaluationException((double) (short) 1, "org.apache.commons.math.ConvergenceException: org.apache.commons.math.ode.DerivativeException: hi!", (java.lang.Object[]) strArray15, (java.lang.Throwable) integratorException37);
        java.lang.String[] strArray47 = new java.lang.String[] { "hi!" };
        org.apache.commons.math.ode.DerivativeException derivativeException48 = new org.apache.commons.math.ode.DerivativeException("hi!", strArray47);
        org.apache.commons.math.FunctionEvaluationException functionEvaluationException49 = new org.apache.commons.math.FunctionEvaluationException((double) (byte) 100, "", (java.lang.Object[]) strArray47);
        org.apache.commons.math.ode.DerivativeException derivativeException50 = new org.apache.commons.math.ode.DerivativeException("org.apache.commons.math.ConvergenceException: ", strArray47);
        org.apache.commons.math.ode.DerivativeException derivativeException51 = new org.apache.commons.math.ode.DerivativeException("hi!", strArray47);
        java.lang.Throwable[] throwableArray52 = derivativeException51.getSuppressed();
        org.apache.commons.math.FunctionEvaluationException functionEvaluationException53 = new org.apache.commons.math.FunctionEvaluationException(97.0d, "org.apache.commons.math.FunctionEvaluationException: org.apache.commons.math.FunctionEvaluationException: org.apache.commons.math.ode.DerivativeException: hi!", (java.lang.Object[]) throwableArray52);
        org.apache.commons.math.FunctionEvaluationException functionEvaluationException54 = new org.apache.commons.math.FunctionEvaluationException((double) 0L, "org.apache.commons.math.ode.IntegratorException: org.apache.commons.math.FunctionEvaluationException: Evaluation failed for argument = 97", (java.lang.Object[]) strArray15, (java.lang.Throwable) functionEvaluationException53);
        org.apache.commons.math.ode.IntegratorException integratorException55 = new org.apache.commons.math.ode.IntegratorException((java.lang.Throwable) functionEvaluationException54);
        java.lang.Throwable[] throwableArray56 = functionEvaluationException54.getSuppressed();
        org.junit.Assert.assertNotNull(strArray15);
        org.junit.Assert.assertNotNull(strArray27);
        org.junit.Assert.assertNotNull(throwableArray33);
        org.junit.Assert.assertNotNull(throwableArray36);
        org.junit.Assert.assertNotNull(strArray47);
        org.junit.Assert.assertNotNull(throwableArray52);
        org.junit.Assert.assertNotNull(throwableArray56);
    }

    @Test
    public void test16085() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest32.test16085");
        java.lang.Object[] objArray8 = new java.lang.Object[] { 10.0d };
        org.apache.commons.math.FunctionEvaluationException functionEvaluationException11 = new org.apache.commons.math.FunctionEvaluationException((double) 'a');
        org.apache.commons.math.ConvergenceException convergenceException12 = new org.apache.commons.math.ConvergenceException("hi!", (java.lang.Throwable) functionEvaluationException11);
        org.apache.commons.math.FunctionEvaluationException functionEvaluationException13 = new org.apache.commons.math.FunctionEvaluationException((double) 0L, "org.apache.commons.math.ode.DerivativeException: hi!", objArray8, (java.lang.Throwable) convergenceException12);
        org.apache.commons.math.ConvergenceException convergenceException14 = new org.apache.commons.math.ConvergenceException("org.apache.commons.math.FunctionEvaluationException: ", objArray8);
        org.apache.commons.math.ConvergenceException convergenceException15 = new org.apache.commons.math.ConvergenceException("", objArray8);
        java.lang.Throwable throwable18 = null;
        org.apache.commons.math.ode.IntegratorException integratorException19 = new org.apache.commons.math.ode.IntegratorException(throwable18);
        java.lang.String[] strArray26 = new java.lang.String[] { "hi!" };
        org.apache.commons.math.ode.DerivativeException derivativeException27 = new org.apache.commons.math.ode.DerivativeException("hi!", strArray26);
        org.apache.commons.math.FunctionEvaluationException functionEvaluationException28 = new org.apache.commons.math.FunctionEvaluationException((double) (byte) 100, "", (java.lang.Object[]) strArray26);
        org.apache.commons.math.ConvergenceException convergenceException29 = new org.apache.commons.math.ConvergenceException("hi!", (java.lang.Object[]) strArray26);
        org.apache.commons.math.ode.IntegratorException integratorException30 = new org.apache.commons.math.ode.IntegratorException("org.apache.commons.math.ConvergenceException: ", (java.lang.Object[]) strArray26);
        integratorException19.addSuppressed((java.lang.Throwable) integratorException30);
        org.apache.commons.math.FunctionEvaluationException functionEvaluationException32 = new org.apache.commons.math.FunctionEvaluationException((double) (-1L), "org.apache.commons.math.ode.DerivativeException: Evaluation failed for argument = 97", (java.lang.Throwable) integratorException30);
        org.apache.commons.math.ConvergenceException convergenceException33 = new org.apache.commons.math.ConvergenceException("org.apache.commons.math.ConvergenceException: org.apache.commons.math.ode.DerivativeException: hi!", objArray8, (java.lang.Throwable) integratorException30);
        org.apache.commons.math.ode.DerivativeException derivativeException34 = new org.apache.commons.math.ode.DerivativeException((java.lang.Throwable) convergenceException33);
        org.apache.commons.math.ode.IntegratorException integratorException35 = new org.apache.commons.math.ode.IntegratorException((java.lang.Throwable) derivativeException34);
        java.lang.String str36 = integratorException35.getPattern();
        java.lang.Throwable[] throwableArray37 = integratorException35.getSuppressed();
        org.apache.commons.math.FunctionEvaluationException functionEvaluationException38 = new org.apache.commons.math.FunctionEvaluationException((double) 10, "org.apache.commons.math.ConvergenceException: org.apache.commons.math.FunctionEvaluationException", (java.lang.Object[]) throwableArray37);
        org.apache.commons.math.ode.DerivativeException derivativeException39 = new org.apache.commons.math.ode.DerivativeException((java.lang.Throwable) functionEvaluationException38);
        org.junit.Assert.assertNotNull(objArray8);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray8), "[10.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray8), "[10.0]");
        org.junit.Assert.assertNotNull(strArray26);
        org.junit.Assert.assertEquals("'" + str36 + "' != '" + "org.apache.commons.math.ConvergenceException: org.apache.commons.math.ode.DerivativeException: hi!" + "'", str36, "org.apache.commons.math.ConvergenceException: org.apache.commons.math.ode.DerivativeException: hi!");
        org.junit.Assert.assertNotNull(throwableArray37);
    }

    @Test
    public void test16086() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest32.test16086");
        java.lang.Object[] objArray1 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math.ode.IntegratorException integratorException2 = new org.apache.commons.math.ode.IntegratorException("org.apache.commons.math.ConvergenceException: org.apache.commons.math.ode.DerivativeException: org.apache.commons.math.FunctionEvaluationException: hi!", objArray1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test16087() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest32.test16087");
        org.apache.commons.math.FunctionEvaluationException functionEvaluationException7 = new org.apache.commons.math.FunctionEvaluationException((double) 'a');
        org.apache.commons.math.ConvergenceException convergenceException8 = new org.apache.commons.math.ConvergenceException("hi!", (java.lang.Throwable) functionEvaluationException7);
        java.lang.Throwable[] throwableArray9 = functionEvaluationException7.getSuppressed();
        java.lang.Throwable[] throwableArray10 = functionEvaluationException7.getSuppressed();
        org.apache.commons.math.ode.IntegratorException integratorException11 = new org.apache.commons.math.ode.IntegratorException("org.apache.commons.math.ode.DerivativeException: Evaluation failed for argument = 1", (java.lang.Object[]) throwableArray10);
        org.apache.commons.math.ode.IntegratorException integratorException12 = new org.apache.commons.math.ode.IntegratorException("org.apache.commons.math.ConvergenceException: org.apache.commons.math.ode.IntegratorException: Evaluation failed for argument = {0}", (java.lang.Object[]) throwableArray10);
        org.apache.commons.math.FunctionEvaluationException functionEvaluationException13 = new org.apache.commons.math.FunctionEvaluationException((double) 0, "org.apache.commons.math.ode.DerivativeException: org.apache.commons.math.ConvergenceException: org.apache.commons.math.ConvergenceException: org.apache.commons.math.FunctionEvaluationException: org.apache.commons.math.ode.DerivativeException: hi!", (java.lang.Object[]) throwableArray10);
        java.lang.String[] strArray20 = new java.lang.String[] { "hi!" };
        org.apache.commons.math.ode.DerivativeException derivativeException21 = new org.apache.commons.math.ode.DerivativeException("hi!", strArray20);
        org.apache.commons.math.FunctionEvaluationException functionEvaluationException22 = new org.apache.commons.math.FunctionEvaluationException((double) 1, "hi!", (java.lang.Object[]) strArray20);
        org.apache.commons.math.ode.DerivativeException derivativeException23 = new org.apache.commons.math.ode.DerivativeException("org.apache.commons.math.FunctionEvaluationException: ", strArray20);
        java.lang.Throwable[] throwableArray24 = derivativeException23.getSuppressed();
        org.apache.commons.math.FunctionEvaluationException functionEvaluationException29 = new org.apache.commons.math.FunctionEvaluationException((double) 'a');
        java.lang.Throwable[] throwableArray30 = functionEvaluationException29.getSuppressed();
        org.apache.commons.math.FunctionEvaluationException functionEvaluationException32 = new org.apache.commons.math.FunctionEvaluationException((double) 'a');
        org.apache.commons.math.FunctionEvaluationException functionEvaluationException35 = new org.apache.commons.math.FunctionEvaluationException((double) 'a');
        org.apache.commons.math.ConvergenceException convergenceException36 = new org.apache.commons.math.ConvergenceException("hi!", (java.lang.Throwable) functionEvaluationException35);
        functionEvaluationException32.addSuppressed((java.lang.Throwable) convergenceException36);
        org.apache.commons.math.FunctionEvaluationException functionEvaluationException38 = new org.apache.commons.math.FunctionEvaluationException((double) (byte) -1, "org.apache.commons.math.ode.DerivativeException: hi!", (java.lang.Object[]) throwableArray30, (java.lang.Throwable) functionEvaluationException32);
        java.lang.Object[] objArray39 = functionEvaluationException32.getArguments();
        org.apache.commons.math.ConvergenceException convergenceException40 = new org.apache.commons.math.ConvergenceException("org.apache.commons.math.ConvergenceException: Evaluation failed for argument = 97", objArray39);
        derivativeException23.addSuppressed((java.lang.Throwable) convergenceException40);
        org.apache.commons.math.ConvergenceException convergenceException42 = new org.apache.commons.math.ConvergenceException("org.apache.commons.math.FunctionEvaluationException: org.apache.commons.math.ode.DerivativeException: hi!", (java.lang.Throwable) convergenceException40);
        org.apache.commons.math.ConvergenceException convergenceException43 = new org.apache.commons.math.ConvergenceException("org.apache.commons.math.ode.DerivativeException: org.apache.commons.math.FunctionEvaluationException: org.apache.commons.math.FunctionEvaluationException", (java.lang.Object[]) throwableArray10, (java.lang.Throwable) convergenceException42);
        org.apache.commons.math.ode.IntegratorException integratorException44 = new org.apache.commons.math.ode.IntegratorException((java.lang.Throwable) convergenceException42);
        org.junit.Assert.assertNotNull(throwableArray9);
        org.junit.Assert.assertNotNull(throwableArray10);
        org.junit.Assert.assertNotNull(strArray20);
        org.junit.Assert.assertNotNull(throwableArray24);
        org.junit.Assert.assertNotNull(throwableArray30);
        org.junit.Assert.assertNotNull(objArray39);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray39), "[97.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray39), "[97.0]");
    }

    @Test
    public void test16088() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest32.test16088");
        org.apache.commons.math.ode.SwitchingFunctionsHandler switchingFunctionsHandler0 = new org.apache.commons.math.ode.SwitchingFunctionsHandler();
        org.apache.commons.math.ode.StepInterpolator stepInterpolator1 = null;
        boolean boolean2 = switchingFunctionsHandler0.evaluateStep(stepInterpolator1);
        org.apache.commons.math.ode.SwitchingFunctionsHandler switchingFunctionsHandler4 = new org.apache.commons.math.ode.SwitchingFunctionsHandler();
        double[] doubleArray8 = new double[] { (-1.0f), 1.0d };
        boolean boolean9 = switchingFunctionsHandler4.reset((double) (byte) 10, doubleArray8);
        boolean boolean10 = switchingFunctionsHandler4.isEmpty();
        double[] doubleArray18 = new double[] { Double.NaN, (short) 100, 100.0d, 100.0f, 0.0f, 10.0f };
        switchingFunctionsHandler4.stepAccepted((double) (-1L), doubleArray18);
        org.apache.commons.math.ode.SwitchingFunction switchingFunction20 = null;
        switchingFunctionsHandler4.add(switchingFunction20, 1.0d, 10.0d, (int) 'a');
        boolean boolean25 = switchingFunctionsHandler4.isEmpty();
        org.apache.commons.math.ode.SwitchingFunctionsHandler switchingFunctionsHandler27 = new org.apache.commons.math.ode.SwitchingFunctionsHandler();
        double[] doubleArray33 = new double[] { 3, (byte) 0, 100.0d, 100 };
        switchingFunctionsHandler27.stepAccepted((double) (short) 0, doubleArray33);
        boolean boolean35 = switchingFunctionsHandler4.reset((double) (byte) 10, doubleArray33);
        boolean boolean36 = switchingFunctionsHandler0.reset((double) 1L, doubleArray33);
        org.apache.commons.math.ode.SwitchingFunctionsHandler switchingFunctionsHandler38 = new org.apache.commons.math.ode.SwitchingFunctionsHandler();
        double[] doubleArray42 = new double[] { (-1.0f), 1.0d };
        boolean boolean43 = switchingFunctionsHandler38.reset((double) (byte) 10, doubleArray42);
        org.apache.commons.math.ode.StepInterpolator stepInterpolator44 = null;
        boolean boolean45 = switchingFunctionsHandler38.evaluateStep(stepInterpolator44);
        boolean boolean46 = switchingFunctionsHandler38.stop();
        double double47 = switchingFunctionsHandler38.getEventTime();
        org.apache.commons.math.ode.SwitchingFunctionsHandler switchingFunctionsHandler49 = new org.apache.commons.math.ode.SwitchingFunctionsHandler();
        double double50 = switchingFunctionsHandler49.getEventTime();
        boolean boolean51 = switchingFunctionsHandler49.stop();
        boolean boolean52 = switchingFunctionsHandler49.stop();
        org.apache.commons.math.ode.SwitchingFunctionsHandler switchingFunctionsHandler54 = new org.apache.commons.math.ode.SwitchingFunctionsHandler();
        double[] doubleArray58 = new double[] { (-1.0f), 1.0d };
        boolean boolean59 = switchingFunctionsHandler54.reset((double) (byte) 10, doubleArray58);
        double[] doubleArray65 = new double[] { 10, 0.0d, '4', 1.0d };
        boolean boolean66 = switchingFunctionsHandler54.reset((double) (-1), doubleArray65);
        switchingFunctionsHandler49.stepAccepted((double) 'a', doubleArray65);
        double double68 = switchingFunctionsHandler49.getEventTime();
        org.apache.commons.math.ode.SwitchingFunctionsHandler switchingFunctionsHandler70 = new org.apache.commons.math.ode.SwitchingFunctionsHandler();
        org.apache.commons.math.ode.SwitchingFunctionsHandler switchingFunctionsHandler72 = new org.apache.commons.math.ode.SwitchingFunctionsHandler();
        double[] doubleArray76 = new double[] { (-1.0f), 1.0d };
        boolean boolean77 = switchingFunctionsHandler72.reset((double) (byte) 10, doubleArray76);
        double[] doubleArray83 = new double[] { 10, 0.0d, '4', 1.0d };
        boolean boolean84 = switchingFunctionsHandler72.reset((double) (-1), doubleArray83);
        boolean boolean85 = switchingFunctionsHandler70.reset((double) 1L, doubleArray83);
        switchingFunctionsHandler49.stepAccepted((-1.0d), doubleArray83);
        switchingFunctionsHandler38.stepAccepted((double) 'a', doubleArray83);
        switchingFunctionsHandler0.stepAccepted((double) 10.0f, doubleArray83);
        boolean boolean89 = switchingFunctionsHandler0.isEmpty();
        org.apache.commons.math.ode.StepInterpolator stepInterpolator90 = null;
        boolean boolean91 = switchingFunctionsHandler0.evaluateStep(stepInterpolator90);
        boolean boolean92 = switchingFunctionsHandler0.stop();
        org.apache.commons.math.ode.StepInterpolator stepInterpolator93 = null;
        boolean boolean94 = switchingFunctionsHandler0.evaluateStep(stepInterpolator93);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(doubleArray8);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray8), "[-1.0, 1.0]");
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertNotNull(doubleArray18);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray18), "[NaN, 100.0, 100.0, 100.0, 0.0, 10.0]");
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
        org.junit.Assert.assertNotNull(doubleArray33);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray33), "[3.0, 0.0, 100.0, 100.0]");
        org.junit.Assert.assertTrue("'" + boolean35 + "' != '" + false + "'", boolean35 == false);
        org.junit.Assert.assertTrue("'" + boolean36 + "' != '" + false + "'", boolean36 == false);
        org.junit.Assert.assertNotNull(doubleArray42);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray42), "[-1.0, 1.0]");
        org.junit.Assert.assertTrue("'" + boolean43 + "' != '" + false + "'", boolean43 == false);
        org.junit.Assert.assertTrue("'" + boolean45 + "' != '" + false + "'", boolean45 == false);
        org.junit.Assert.assertTrue("'" + boolean46 + "' != '" + false + "'", boolean46 == false);
        org.junit.Assert.assertTrue(Double.isNaN(double47));
        org.junit.Assert.assertTrue(Double.isNaN(double50));
        org.junit.Assert.assertTrue("'" + boolean51 + "' != '" + false + "'", boolean51 == false);
        org.junit.Assert.assertTrue("'" + boolean52 + "' != '" + false + "'", boolean52 == false);
        org.junit.Assert.assertNotNull(doubleArray58);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray58), "[-1.0, 1.0]");
        org.junit.Assert.assertTrue("'" + boolean59 + "' != '" + false + "'", boolean59 == false);
        org.junit.Assert.assertNotNull(doubleArray65);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray65), "[10.0, 0.0, 52.0, 1.0]");
        org.junit.Assert.assertTrue("'" + boolean66 + "' != '" + false + "'", boolean66 == false);
        org.junit.Assert.assertTrue(Double.isNaN(double68));
        org.junit.Assert.assertNotNull(doubleArray76);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray76), "[-1.0, 1.0]");
        org.junit.Assert.assertTrue("'" + boolean77 + "' != '" + false + "'", boolean77 == false);
        org.junit.Assert.assertNotNull(doubleArray83);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray83), "[10.0, 0.0, 52.0, 1.0]");
        org.junit.Assert.assertTrue("'" + boolean84 + "' != '" + false + "'", boolean84 == false);
        org.junit.Assert.assertTrue("'" + boolean85 + "' != '" + false + "'", boolean85 == false);
        org.junit.Assert.assertTrue("'" + boolean89 + "' != '" + true + "'", boolean89 == true);
        org.junit.Assert.assertTrue("'" + boolean91 + "' != '" + false + "'", boolean91 == false);
        org.junit.Assert.assertTrue("'" + boolean92 + "' != '" + false + "'", boolean92 == false);
        org.junit.Assert.assertTrue("'" + boolean94 + "' != '" + false + "'", boolean94 == false);
    }

    @Test
    public void test16089() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest32.test16089");
        org.apache.commons.math.FunctionEvaluationException functionEvaluationException5 = new org.apache.commons.math.FunctionEvaluationException((double) 'a');
        java.lang.Throwable[] throwableArray6 = functionEvaluationException5.getSuppressed();
        org.apache.commons.math.ConvergenceException convergenceException7 = new org.apache.commons.math.ConvergenceException("org.apache.commons.math.FunctionEvaluationException: org.apache.commons.math.ode.DerivativeException: hi!", (java.lang.Object[]) throwableArray6);
        org.apache.commons.math.ode.IntegratorException integratorException8 = new org.apache.commons.math.ode.IntegratorException("org.apache.commons.math.FunctionEvaluationException: org.apache.commons.math.FunctionEvaluationException: org.apache.commons.math.ConvergenceException: ", (java.lang.Object[]) throwableArray6);
        org.apache.commons.math.FunctionEvaluationException functionEvaluationException17 = new org.apache.commons.math.FunctionEvaluationException((double) 'a');
        java.lang.Throwable[] throwableArray18 = functionEvaluationException17.getSuppressed();
        org.apache.commons.math.FunctionEvaluationException functionEvaluationException20 = new org.apache.commons.math.FunctionEvaluationException((double) 'a');
        org.apache.commons.math.FunctionEvaluationException functionEvaluationException23 = new org.apache.commons.math.FunctionEvaluationException((double) 'a');
        org.apache.commons.math.ConvergenceException convergenceException24 = new org.apache.commons.math.ConvergenceException("hi!", (java.lang.Throwable) functionEvaluationException23);
        functionEvaluationException20.addSuppressed((java.lang.Throwable) convergenceException24);
        org.apache.commons.math.FunctionEvaluationException functionEvaluationException26 = new org.apache.commons.math.FunctionEvaluationException((double) (byte) -1, "org.apache.commons.math.ode.DerivativeException: hi!", (java.lang.Object[]) throwableArray18, (java.lang.Throwable) functionEvaluationException20);
        java.lang.Throwable throwable27 = null;
        org.apache.commons.math.ConvergenceException convergenceException28 = new org.apache.commons.math.ConvergenceException(throwable27);
        org.apache.commons.math.ConvergenceException convergenceException29 = new org.apache.commons.math.ConvergenceException("org.apache.commons.math.FunctionEvaluationException: ", (java.lang.Object[]) throwableArray18, throwable27);
        org.apache.commons.math.FunctionEvaluationException functionEvaluationException30 = new org.apache.commons.math.FunctionEvaluationException((double) '4', "org.apache.commons.math.ode.DerivativeException: Evaluation failed for argument = 1", (java.lang.Object[]) throwableArray18);
        org.apache.commons.math.ConvergenceException convergenceException31 = new org.apache.commons.math.ConvergenceException("org.apache.commons.math.ConvergenceException: org.apache.commons.math.FunctionEvaluationException: org.apache.commons.math.ode.DerivativeException: hi!", (java.lang.Object[]) throwableArray18);
        org.apache.commons.math.ConvergenceException convergenceException32 = new org.apache.commons.math.ConvergenceException("org.apache.commons.math.ConvergenceException: org.apache.commons.math.ode.DerivativeException: hi!", (java.lang.Object[]) throwableArray18);
        org.apache.commons.math.FunctionEvaluationException functionEvaluationException33 = new org.apache.commons.math.FunctionEvaluationException((double) 1, "org.apache.commons.math.ConvergenceException: org.apache.commons.math.FunctionEvaluationException: org.apache.commons.math.ConvergenceException: Evaluation failed for argument = 97", (java.lang.Object[]) throwableArray6, (java.lang.Throwable) convergenceException32);
        java.lang.String[] strArray47 = new java.lang.String[] { "hi!" };
        org.apache.commons.math.ode.DerivativeException derivativeException48 = new org.apache.commons.math.ode.DerivativeException("hi!", strArray47);
        org.apache.commons.math.FunctionEvaluationException functionEvaluationException49 = new org.apache.commons.math.FunctionEvaluationException((double) (byte) 100, "", (java.lang.Object[]) strArray47);
        org.apache.commons.math.ConvergenceException convergenceException50 = new org.apache.commons.math.ConvergenceException("hi!", (java.lang.Object[]) strArray47);
        org.apache.commons.math.FunctionEvaluationException functionEvaluationException51 = new org.apache.commons.math.FunctionEvaluationException((double) (-1L), "Evaluation failed for argument = 97", (java.lang.Object[]) strArray47);
        org.apache.commons.math.ConvergenceException convergenceException52 = new org.apache.commons.math.ConvergenceException("Evaluation failed for argument = 97", (java.lang.Object[]) strArray47);
        org.apache.commons.math.FunctionEvaluationException functionEvaluationException53 = new org.apache.commons.math.FunctionEvaluationException(100.0d, "org.apache.commons.math.ConvergenceException: hi!", (java.lang.Object[]) strArray47);
        org.apache.commons.math.FunctionEvaluationException functionEvaluationException59 = new org.apache.commons.math.FunctionEvaluationException((double) 'a');
        org.apache.commons.math.ConvergenceException convergenceException60 = new org.apache.commons.math.ConvergenceException("hi!", (java.lang.Throwable) functionEvaluationException59);
        java.lang.Throwable[] throwableArray61 = functionEvaluationException59.getSuppressed();
        org.apache.commons.math.ConvergenceException convergenceException62 = new org.apache.commons.math.ConvergenceException("", (java.lang.Object[]) throwableArray61);
        org.apache.commons.math.ConvergenceException convergenceException63 = new org.apache.commons.math.ConvergenceException((java.lang.Throwable) convergenceException62);
        java.lang.String str64 = convergenceException62.getPattern();
        org.apache.commons.math.FunctionEvaluationException functionEvaluationException65 = new org.apache.commons.math.FunctionEvaluationException((double) (short) 0, "Evaluation failed for argument = 97", (java.lang.Throwable) convergenceException62);
        java.lang.Object[] objArray66 = functionEvaluationException65.getArguments();
        org.apache.commons.math.ConvergenceException convergenceException67 = new org.apache.commons.math.ConvergenceException("org.apache.commons.math.ode.IntegratorException: Evaluation failed for argument = 97", (java.lang.Object[]) strArray47, (java.lang.Throwable) functionEvaluationException65);
        org.apache.commons.math.FunctionEvaluationException functionEvaluationException68 = new org.apache.commons.math.FunctionEvaluationException((double) (-1L), "org.apache.commons.math.ConvergenceException: org.apache.commons.math.ConvergenceException: org.apache.commons.math.ode.DerivativeException: hi!", (java.lang.Object[]) strArray47);
        org.apache.commons.math.ConvergenceException convergenceException69 = new org.apache.commons.math.ConvergenceException((java.lang.Throwable) functionEvaluationException68);
        convergenceException32.addSuppressed((java.lang.Throwable) convergenceException69);
        org.junit.Assert.assertNotNull(throwableArray6);
        org.junit.Assert.assertNotNull(throwableArray18);
        org.junit.Assert.assertNotNull(strArray47);
        org.junit.Assert.assertNotNull(throwableArray61);
        org.junit.Assert.assertEquals("'" + str64 + "' != '" + "" + "'", str64, "");
        org.junit.Assert.assertNotNull(objArray66);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray66), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray66), "[]");
    }

    @Test
    public void test16090() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest32.test16090");
        org.apache.commons.math.FunctionEvaluationException functionEvaluationException10 = new org.apache.commons.math.FunctionEvaluationException((double) 'a');
        java.lang.Throwable[] throwableArray11 = functionEvaluationException10.getSuppressed();
        org.apache.commons.math.FunctionEvaluationException functionEvaluationException13 = new org.apache.commons.math.FunctionEvaluationException((double) 'a');
        org.apache.commons.math.FunctionEvaluationException functionEvaluationException16 = new org.apache.commons.math.FunctionEvaluationException((double) 'a');
        org.apache.commons.math.ConvergenceException convergenceException17 = new org.apache.commons.math.ConvergenceException("hi!", (java.lang.Throwable) functionEvaluationException16);
        functionEvaluationException13.addSuppressed((java.lang.Throwable) convergenceException17);
        org.apache.commons.math.FunctionEvaluationException functionEvaluationException19 = new org.apache.commons.math.FunctionEvaluationException((double) (byte) -1, "org.apache.commons.math.ode.DerivativeException: hi!", (java.lang.Object[]) throwableArray11, (java.lang.Throwable) functionEvaluationException13);
        java.lang.Throwable throwable20 = null;
        org.apache.commons.math.ConvergenceException convergenceException21 = new org.apache.commons.math.ConvergenceException(throwable20);
        org.apache.commons.math.ConvergenceException convergenceException22 = new org.apache.commons.math.ConvergenceException("org.apache.commons.math.FunctionEvaluationException: ", (java.lang.Object[]) throwableArray11, throwable20);
        org.apache.commons.math.ode.IntegratorException integratorException23 = new org.apache.commons.math.ode.IntegratorException("Evaluation failed for argument = {0}", (java.lang.Object[]) throwableArray11);
        org.apache.commons.math.FunctionEvaluationException functionEvaluationException24 = new org.apache.commons.math.FunctionEvaluationException(97.0d, "Evaluation failed for argument = 97", (java.lang.Object[]) throwableArray11);
        java.lang.Object[] objArray33 = new java.lang.Object[] { 10.0d };
        org.apache.commons.math.FunctionEvaluationException functionEvaluationException36 = new org.apache.commons.math.FunctionEvaluationException((double) 'a');
        org.apache.commons.math.ConvergenceException convergenceException37 = new org.apache.commons.math.ConvergenceException("hi!", (java.lang.Throwable) functionEvaluationException36);
        org.apache.commons.math.FunctionEvaluationException functionEvaluationException38 = new org.apache.commons.math.FunctionEvaluationException((double) 0L, "org.apache.commons.math.ode.DerivativeException: hi!", objArray33, (java.lang.Throwable) convergenceException37);
        org.apache.commons.math.ConvergenceException convergenceException39 = new org.apache.commons.math.ConvergenceException("org.apache.commons.math.ode.DerivativeException: hi!", objArray33);
        org.apache.commons.math.FunctionEvaluationException functionEvaluationException42 = new org.apache.commons.math.FunctionEvaluationException((double) 'a');
        org.apache.commons.math.FunctionEvaluationException functionEvaluationException45 = new org.apache.commons.math.FunctionEvaluationException((double) 'a');
        org.apache.commons.math.ConvergenceException convergenceException46 = new org.apache.commons.math.ConvergenceException("hi!", (java.lang.Throwable) functionEvaluationException45);
        functionEvaluationException42.addSuppressed((java.lang.Throwable) convergenceException46);
        org.apache.commons.math.ConvergenceException convergenceException48 = new org.apache.commons.math.ConvergenceException((java.lang.Throwable) functionEvaluationException42);
        org.apache.commons.math.FunctionEvaluationException functionEvaluationException49 = new org.apache.commons.math.FunctionEvaluationException((double) (short) 10, (java.lang.Throwable) convergenceException48);
        org.apache.commons.math.ConvergenceException convergenceException50 = new org.apache.commons.math.ConvergenceException("org.apache.commons.math.FunctionEvaluationException: ", objArray33, (java.lang.Throwable) functionEvaluationException49);
        java.lang.Throwable[] throwableArray51 = functionEvaluationException49.getSuppressed();
        java.lang.Throwable throwable53 = null;
        org.apache.commons.math.ode.DerivativeException derivativeException54 = new org.apache.commons.math.ode.DerivativeException(throwable53);
        java.lang.String[] strArray57 = new java.lang.String[] { "hi!" };
        org.apache.commons.math.ode.DerivativeException derivativeException58 = new org.apache.commons.math.ode.DerivativeException("hi!", strArray57);
        org.apache.commons.math.ode.DerivativeException derivativeException59 = new org.apache.commons.math.ode.DerivativeException((java.lang.Throwable) derivativeException58);
        org.apache.commons.math.ode.IntegratorException integratorException60 = new org.apache.commons.math.ode.IntegratorException((java.lang.Throwable) derivativeException58);
        derivativeException54.addSuppressed((java.lang.Throwable) integratorException60);
        org.apache.commons.math.ode.IntegratorException integratorException62 = new org.apache.commons.math.ode.IntegratorException((java.lang.Throwable) integratorException60);
        org.apache.commons.math.ConvergenceException convergenceException63 = new org.apache.commons.math.ConvergenceException("", (java.lang.Throwable) integratorException62);
        org.apache.commons.math.ConvergenceException convergenceException64 = new org.apache.commons.math.ConvergenceException("org.apache.commons.math.ConvergenceException: hi!", (java.lang.Object[]) throwableArray51, (java.lang.Throwable) integratorException62);
        org.apache.commons.math.FunctionEvaluationException functionEvaluationException65 = new org.apache.commons.math.FunctionEvaluationException((double) (short) 0, "org.apache.commons.math.ode.DerivativeException: hi!", (java.lang.Throwable) convergenceException64);
        org.apache.commons.math.ConvergenceException convergenceException66 = new org.apache.commons.math.ConvergenceException("org.apache.commons.math.FunctionEvaluationException: org.apache.commons.math.FunctionEvaluationException: org.apache.commons.math.ode.DerivativeException: hi!", (java.lang.Object[]) throwableArray11, (java.lang.Throwable) convergenceException64);
        java.lang.Object[] objArray67 = convergenceException66.getArguments();
        org.apache.commons.math.ode.IntegratorException integratorException68 = new org.apache.commons.math.ode.IntegratorException("org.apache.commons.math.ode.DerivativeException: org.apache.commons.math.ode.DerivativeException: hi!", objArray67);
        java.lang.Throwable[] throwableArray69 = integratorException68.getSuppressed();
        org.apache.commons.math.ode.IntegratorException integratorException70 = new org.apache.commons.math.ode.IntegratorException("org.apache.commons.math.ConvergenceException: org.apache.commons.math.ConvergenceException: ", (java.lang.Object[]) throwableArray69);
        org.junit.Assert.assertNotNull(throwableArray11);
        org.junit.Assert.assertNotNull(objArray33);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray33), "[10.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray33), "[10.0]");
        org.junit.Assert.assertNotNull(throwableArray51);
        org.junit.Assert.assertNotNull(strArray57);
        org.junit.Assert.assertNotNull(objArray67);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray67), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray67), "[]");
        org.junit.Assert.assertNotNull(throwableArray69);
    }

    @Test
    public void test16091() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest32.test16091");
        org.apache.commons.math.FunctionEvaluationException functionEvaluationException10 = new org.apache.commons.math.FunctionEvaluationException((double) 'a');
        org.apache.commons.math.ConvergenceException convergenceException11 = new org.apache.commons.math.ConvergenceException("hi!", (java.lang.Throwable) functionEvaluationException10);
        java.lang.Throwable[] throwableArray12 = functionEvaluationException10.getSuppressed();
        java.lang.Throwable[] throwableArray13 = functionEvaluationException10.getSuppressed();
        java.lang.Throwable[] throwableArray14 = functionEvaluationException10.getSuppressed();
        org.apache.commons.math.FunctionEvaluationException functionEvaluationException15 = new org.apache.commons.math.FunctionEvaluationException((double) (-1.0f), "org.apache.commons.math.ode.IntegratorException: Evaluation failed for argument = 97", (java.lang.Object[]) throwableArray14);
        org.apache.commons.math.ode.IntegratorException integratorException16 = new org.apache.commons.math.ode.IntegratorException("Evaluation failed for argument = {0}", (java.lang.Object[]) throwableArray14);
        org.apache.commons.math.FunctionEvaluationException functionEvaluationException18 = new org.apache.commons.math.FunctionEvaluationException((double) 'a');
        org.apache.commons.math.FunctionEvaluationException functionEvaluationException21 = new org.apache.commons.math.FunctionEvaluationException((double) 'a');
        org.apache.commons.math.ConvergenceException convergenceException22 = new org.apache.commons.math.ConvergenceException("hi!", (java.lang.Throwable) functionEvaluationException21);
        functionEvaluationException18.addSuppressed((java.lang.Throwable) convergenceException22);
        org.apache.commons.math.ConvergenceException convergenceException24 = new org.apache.commons.math.ConvergenceException((java.lang.Throwable) functionEvaluationException18);
        java.lang.String str25 = functionEvaluationException18.getPattern();
        java.lang.String str26 = functionEvaluationException18.getPattern();
        java.lang.Object[] objArray27 = functionEvaluationException18.getArguments();
        java.lang.String[] strArray34 = new java.lang.String[] { "hi!" };
        org.apache.commons.math.ode.DerivativeException derivativeException35 = new org.apache.commons.math.ode.DerivativeException("hi!", strArray34);
        org.apache.commons.math.FunctionEvaluationException functionEvaluationException36 = new org.apache.commons.math.FunctionEvaluationException((double) (byte) 100, "", (java.lang.Object[]) strArray34);
        org.apache.commons.math.ConvergenceException convergenceException37 = new org.apache.commons.math.ConvergenceException("hi!", (java.lang.Object[]) strArray34);
        org.apache.commons.math.FunctionEvaluationException functionEvaluationException39 = new org.apache.commons.math.FunctionEvaluationException((double) 'a');
        java.lang.Throwable[] throwableArray40 = functionEvaluationException39.getSuppressed();
        org.apache.commons.math.ode.DerivativeException derivativeException41 = new org.apache.commons.math.ode.DerivativeException((java.lang.Throwable) functionEvaluationException39);
        java.lang.String str42 = derivativeException41.getPattern();
        java.lang.String str43 = derivativeException41.getPattern();
        org.apache.commons.math.ConvergenceException convergenceException48 = new org.apache.commons.math.ConvergenceException();
        org.apache.commons.math.FunctionEvaluationException functionEvaluationException49 = new org.apache.commons.math.FunctionEvaluationException(97.0d, "org.apache.commons.math.ConvergenceException: Evaluation failed for argument = 97", (java.lang.Throwable) convergenceException48);
        org.apache.commons.math.FunctionEvaluationException functionEvaluationException50 = new org.apache.commons.math.FunctionEvaluationException((double) ' ', "org.apache.commons.math.ConvergenceException: org.apache.commons.math.ode.DerivativeException: hi!", (java.lang.Throwable) functionEvaluationException49);
        derivativeException41.addSuppressed((java.lang.Throwable) functionEvaluationException50);
        org.apache.commons.math.ConvergenceException convergenceException52 = new org.apache.commons.math.ConvergenceException("org.apache.commons.math.ConvergenceException: org.apache.commons.math.ode.DerivativeException: hi!", (java.lang.Object[]) strArray34, (java.lang.Throwable) derivativeException41);
        functionEvaluationException18.addSuppressed((java.lang.Throwable) convergenceException52);
        org.apache.commons.math.FunctionEvaluationException functionEvaluationException54 = new org.apache.commons.math.FunctionEvaluationException((double) (-1), "org.apache.commons.math.FunctionEvaluationException: org.apache.commons.math.ode.DerivativeException: hi!", (java.lang.Object[]) throwableArray14, (java.lang.Throwable) convergenceException52);
        java.lang.Throwable[] throwableArray55 = convergenceException52.getSuppressed();
        org.apache.commons.math.ode.IntegratorException integratorException56 = new org.apache.commons.math.ode.IntegratorException("org.apache.commons.math.FunctionEvaluationException: org.apache.commons.math.ode.IntegratorException: org.apache.commons.math.FunctionEvaluationException: Evaluation failed for argument = 97", (java.lang.Object[]) throwableArray55);
        org.apache.commons.math.ode.IntegratorException integratorException57 = new org.apache.commons.math.ode.IntegratorException("org.apache.commons.math.ConvergenceException: org.apache.commons.math.ode.IntegratorException: org.apache.commons.math.ode.DerivativeException: org.apache.commons.math.FunctionEvaluationException: ", (java.lang.Object[]) throwableArray55);
        org.apache.commons.math.ConvergenceException convergenceException58 = new org.apache.commons.math.ConvergenceException("", (java.lang.Throwable) integratorException57);
        org.junit.Assert.assertNotNull(throwableArray12);
        org.junit.Assert.assertNotNull(throwableArray13);
        org.junit.Assert.assertNotNull(throwableArray14);
        org.junit.Assert.assertEquals("'" + str25 + "' != '" + "Evaluation failed for argument = {0}" + "'", str25, "Evaluation failed for argument = {0}");
        org.junit.Assert.assertEquals("'" + str26 + "' != '" + "Evaluation failed for argument = {0}" + "'", str26, "Evaluation failed for argument = {0}");
        org.junit.Assert.assertNotNull(objArray27);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray27), "[97.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray27), "[97.0]");
        org.junit.Assert.assertNotNull(strArray34);
        org.junit.Assert.assertNotNull(throwableArray40);
        org.junit.Assert.assertEquals("'" + str42 + "' != '" + "Evaluation failed for argument = 97" + "'", str42, "Evaluation failed for argument = 97");
        org.junit.Assert.assertEquals("'" + str43 + "' != '" + "Evaluation failed for argument = 97" + "'", str43, "Evaluation failed for argument = 97");
        org.junit.Assert.assertNotNull(throwableArray55);
    }

    @Test
    public void test16092() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest32.test16092");
        java.lang.String[] strArray14 = new java.lang.String[] { "hi!" };
        org.apache.commons.math.ode.DerivativeException derivativeException15 = new org.apache.commons.math.ode.DerivativeException("hi!", strArray14);
        org.apache.commons.math.FunctionEvaluationException functionEvaluationException16 = new org.apache.commons.math.FunctionEvaluationException((double) (byte) 100, "", (java.lang.Object[]) strArray14);
        org.apache.commons.math.ConvergenceException convergenceException17 = new org.apache.commons.math.ConvergenceException("hi!", (java.lang.Object[]) strArray14);
        org.apache.commons.math.ode.DerivativeException derivativeException18 = new org.apache.commons.math.ode.DerivativeException("", strArray14);
        org.apache.commons.math.ode.DerivativeException derivativeException19 = new org.apache.commons.math.ode.DerivativeException("org.apache.commons.math.FunctionEvaluationException: Evaluation failed for argument = 97", strArray14);
        org.apache.commons.math.ode.DerivativeException derivativeException20 = new org.apache.commons.math.ode.DerivativeException("org.apache.commons.math.ode.IntegratorException: Evaluation failed for argument = {0}", strArray14);
        org.apache.commons.math.ode.IntegratorException integratorException21 = new org.apache.commons.math.ode.IntegratorException("org.apache.commons.math.ConvergenceException: hi!", (java.lang.Object[]) strArray14);
        org.apache.commons.math.FunctionEvaluationException functionEvaluationException22 = new org.apache.commons.math.FunctionEvaluationException((double) 10.0f, "org.apache.commons.math.FunctionEvaluationException: org.apache.commons.math.ode.IntegratorException: hi!", (java.lang.Object[]) strArray14);
        org.apache.commons.math.ode.DerivativeException derivativeException23 = new org.apache.commons.math.ode.DerivativeException("org.apache.commons.math.ode.DerivativeException: org.apache.commons.math.FunctionEvaluationException: hi!", strArray14);
        org.apache.commons.math.FunctionEvaluationException functionEvaluationException24 = new org.apache.commons.math.FunctionEvaluationException((double) 1, "org.apache.commons.math.FunctionEvaluationException: org.apache.commons.math.ConvergenceException: org.apache.commons.math.ode.IntegratorException: ", (java.lang.Object[]) strArray14);
        org.apache.commons.math.FunctionEvaluationException functionEvaluationException31 = new org.apache.commons.math.FunctionEvaluationException((double) 'a');
        org.apache.commons.math.ConvergenceException convergenceException32 = new org.apache.commons.math.ConvergenceException("hi!", (java.lang.Throwable) functionEvaluationException31);
        java.lang.Throwable[] throwableArray33 = functionEvaluationException31.getSuppressed();
        java.lang.Throwable[] throwableArray34 = functionEvaluationException31.getSuppressed();
        java.lang.Throwable[] throwableArray35 = functionEvaluationException31.getSuppressed();
        org.apache.commons.math.FunctionEvaluationException functionEvaluationException36 = new org.apache.commons.math.FunctionEvaluationException((double) (-1.0f), "org.apache.commons.math.ode.IntegratorException: Evaluation failed for argument = 97", (java.lang.Object[]) throwableArray35);
        org.apache.commons.math.ConvergenceException convergenceException37 = new org.apache.commons.math.ConvergenceException("org.apache.commons.math.FunctionEvaluationException: org.apache.commons.math.FunctionEvaluationException: Evaluation failed for argument = 97", (java.lang.Object[]) throwableArray35);
        org.apache.commons.math.FunctionEvaluationException functionEvaluationException38 = new org.apache.commons.math.FunctionEvaluationException(1.0d, (java.lang.Throwable) convergenceException37);
        functionEvaluationException24.addSuppressed((java.lang.Throwable) functionEvaluationException38);
        org.junit.Assert.assertNotNull(strArray14);
        org.junit.Assert.assertNotNull(throwableArray33);
        org.junit.Assert.assertNotNull(throwableArray34);
        org.junit.Assert.assertNotNull(throwableArray35);
    }

    @Test
    public void test16093() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest32.test16093");
        org.apache.commons.math.ode.SwitchingFunctionsHandler switchingFunctionsHandler0 = new org.apache.commons.math.ode.SwitchingFunctionsHandler();
        double[] doubleArray4 = new double[] { (-1.0f), 1.0d };
        boolean boolean5 = switchingFunctionsHandler0.reset((double) (byte) 10, doubleArray4);
        org.apache.commons.math.ode.StepInterpolator stepInterpolator6 = null;
        boolean boolean7 = switchingFunctionsHandler0.evaluateStep(stepInterpolator6);
        org.apache.commons.math.ode.SwitchingFunctionsHandler switchingFunctionsHandler9 = new org.apache.commons.math.ode.SwitchingFunctionsHandler();
        double[] doubleArray13 = new double[] { (-1.0f), 1.0d };
        boolean boolean14 = switchingFunctionsHandler9.reset((double) (byte) 10, doubleArray13);
        double[] doubleArray20 = new double[] { 10, 0.0d, '4', 1.0d };
        boolean boolean21 = switchingFunctionsHandler9.reset((double) (-1), doubleArray20);
        switchingFunctionsHandler0.stepAccepted(0.0d, doubleArray20);
        org.apache.commons.math.ode.SwitchingFunction switchingFunction23 = null;
        switchingFunctionsHandler0.add(switchingFunction23, (double) 1, (double) (byte) 0, 0);
        boolean boolean28 = switchingFunctionsHandler0.isEmpty();
        org.apache.commons.math.ode.SwitchingFunctionsHandler switchingFunctionsHandler30 = new org.apache.commons.math.ode.SwitchingFunctionsHandler();
        double[] doubleArray34 = new double[] { (-1.0f), 1.0d };
        boolean boolean35 = switchingFunctionsHandler30.reset((double) (byte) 10, doubleArray34);
        org.apache.commons.math.ode.StepInterpolator stepInterpolator36 = null;
        boolean boolean37 = switchingFunctionsHandler30.evaluateStep(stepInterpolator36);
        org.apache.commons.math.ode.StepInterpolator stepInterpolator38 = null;
        boolean boolean39 = switchingFunctionsHandler30.evaluateStep(stepInterpolator38);
        double double40 = switchingFunctionsHandler30.getEventTime();
        boolean boolean41 = switchingFunctionsHandler30.isEmpty();
        boolean boolean42 = switchingFunctionsHandler30.isEmpty();
        double double43 = switchingFunctionsHandler30.getEventTime();
        org.apache.commons.math.ode.SwitchingFunctionsHandler switchingFunctionsHandler45 = new org.apache.commons.math.ode.SwitchingFunctionsHandler();
        double[] doubleArray49 = new double[] { (-1.0f), 1.0d };
        boolean boolean50 = switchingFunctionsHandler45.reset((double) (byte) 10, doubleArray49);
        org.apache.commons.math.ode.StepInterpolator stepInterpolator51 = null;
        boolean boolean52 = switchingFunctionsHandler45.evaluateStep(stepInterpolator51);
        org.apache.commons.math.ode.StepInterpolator stepInterpolator53 = null;
        boolean boolean54 = switchingFunctionsHandler45.evaluateStep(stepInterpolator53);
        org.apache.commons.math.ode.SwitchingFunction switchingFunction55 = null;
        switchingFunctionsHandler45.add(switchingFunction55, (double) (short) 100, 0.0d, (int) (short) 1);
        double double60 = switchingFunctionsHandler45.getEventTime();
        org.apache.commons.math.ode.SwitchingFunctionsHandler switchingFunctionsHandler62 = new org.apache.commons.math.ode.SwitchingFunctionsHandler();
        double[] doubleArray68 = new double[] { 3, (byte) 0, 100.0d, 100 };
        switchingFunctionsHandler62.stepAccepted((double) (short) 0, doubleArray68);
        boolean boolean70 = switchingFunctionsHandler45.reset((double) 0.0f, doubleArray68);
        boolean boolean71 = switchingFunctionsHandler30.reset(Double.NaN, doubleArray68);
        // The following exception was thrown during execution in test generation
        try {
            switchingFunctionsHandler0.stepAccepted((double) (short) 1, doubleArray68);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(doubleArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray4), "[-1.0, 1.0]");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNotNull(doubleArray13);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray13), "[-1.0, 1.0]");
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertNotNull(doubleArray20);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray20), "[10.0, 0.0, 52.0, 1.0]");
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + false + "'", boolean28 == false);
        org.junit.Assert.assertNotNull(doubleArray34);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray34), "[-1.0, 1.0]");
        org.junit.Assert.assertTrue("'" + boolean35 + "' != '" + false + "'", boolean35 == false);
        org.junit.Assert.assertTrue("'" + boolean37 + "' != '" + false + "'", boolean37 == false);
        org.junit.Assert.assertTrue("'" + boolean39 + "' != '" + false + "'", boolean39 == false);
        org.junit.Assert.assertTrue(Double.isNaN(double40));
        org.junit.Assert.assertTrue("'" + boolean41 + "' != '" + true + "'", boolean41 == true);
        org.junit.Assert.assertTrue("'" + boolean42 + "' != '" + true + "'", boolean42 == true);
        org.junit.Assert.assertTrue(Double.isNaN(double43));
        org.junit.Assert.assertNotNull(doubleArray49);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray49), "[-1.0, 1.0]");
        org.junit.Assert.assertTrue("'" + boolean50 + "' != '" + false + "'", boolean50 == false);
        org.junit.Assert.assertTrue("'" + boolean52 + "' != '" + false + "'", boolean52 == false);
        org.junit.Assert.assertTrue("'" + boolean54 + "' != '" + false + "'", boolean54 == false);
        org.junit.Assert.assertTrue(Double.isNaN(double60));
        org.junit.Assert.assertNotNull(doubleArray68);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray68), "[3.0, 0.0, 100.0, 100.0]");
        org.junit.Assert.assertTrue("'" + boolean70 + "' != '" + false + "'", boolean70 == false);
        org.junit.Assert.assertTrue("'" + boolean71 + "' != '" + false + "'", boolean71 == false);
    }

    @Test
    public void test16094() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest32.test16094");
        org.apache.commons.math.ode.SwitchingFunctionsHandler switchingFunctionsHandler0 = new org.apache.commons.math.ode.SwitchingFunctionsHandler();
        double[] doubleArray4 = new double[] { (-1.0f), 1.0d };
        boolean boolean5 = switchingFunctionsHandler0.reset((double) (byte) 10, doubleArray4);
        double[] doubleArray11 = new double[] { 10, 0.0d, '4', 1.0d };
        boolean boolean12 = switchingFunctionsHandler0.reset((double) (-1), doubleArray11);
        boolean boolean13 = switchingFunctionsHandler0.stop();
        org.apache.commons.math.ode.SwitchingFunction switchingFunction14 = null;
        switchingFunctionsHandler0.add(switchingFunction14, (double) (-1.0f), 10.0d, (int) (byte) -1);
        double double19 = switchingFunctionsHandler0.getEventTime();
        org.apache.commons.math.ode.SwitchingFunctionsHandler switchingFunctionsHandler21 = new org.apache.commons.math.ode.SwitchingFunctionsHandler();
        double[] doubleArray25 = new double[] { (-1.0f), 1.0d };
        boolean boolean26 = switchingFunctionsHandler21.reset((double) (byte) 10, doubleArray25);
        org.apache.commons.math.ode.SwitchingFunctionsHandler switchingFunctionsHandler28 = new org.apache.commons.math.ode.SwitchingFunctionsHandler();
        double[] doubleArray32 = new double[] { (-1.0f), 1.0d };
        boolean boolean33 = switchingFunctionsHandler28.reset((double) (byte) 10, doubleArray32);
        double[] doubleArray39 = new double[] { 10, 0.0d, '4', 1.0d };
        boolean boolean40 = switchingFunctionsHandler28.reset((double) (-1), doubleArray39);
        switchingFunctionsHandler21.stepAccepted((double) (byte) -1, doubleArray39);
        boolean boolean42 = switchingFunctionsHandler21.isEmpty();
        double double43 = switchingFunctionsHandler21.getEventTime();
        org.apache.commons.math.ode.SwitchingFunction switchingFunction44 = null;
        switchingFunctionsHandler21.add(switchingFunction44, (double) 10.0f, (double) '4', 10);
        org.apache.commons.math.ode.SwitchingFunctionsHandler switchingFunctionsHandler50 = new org.apache.commons.math.ode.SwitchingFunctionsHandler();
        double[] doubleArray56 = new double[] { 3, (byte) 0, 100.0d, 100 };
        switchingFunctionsHandler50.stepAccepted((double) (short) 0, doubleArray56);
        org.apache.commons.math.ode.SwitchingFunctionsHandler switchingFunctionsHandler59 = new org.apache.commons.math.ode.SwitchingFunctionsHandler();
        double[] doubleArray63 = new double[] { (-1.0f), 1.0d };
        boolean boolean64 = switchingFunctionsHandler59.reset((double) (byte) 10, doubleArray63);
        boolean boolean65 = switchingFunctionsHandler59.isEmpty();
        double[] doubleArray73 = new double[] { Double.NaN, (short) 100, 100.0d, 100.0f, 0.0f, 10.0f };
        switchingFunctionsHandler59.stepAccepted((double) (-1L), doubleArray73);
        switchingFunctionsHandler50.stepAccepted((double) (byte) 10, doubleArray73);
        boolean boolean76 = switchingFunctionsHandler50.stop();
        org.apache.commons.math.ode.StepInterpolator stepInterpolator77 = null;
        boolean boolean78 = switchingFunctionsHandler50.evaluateStep(stepInterpolator77);
        org.apache.commons.math.ode.SwitchingFunctionsHandler switchingFunctionsHandler80 = new org.apache.commons.math.ode.SwitchingFunctionsHandler();
        double[] doubleArray86 = new double[] { 3, (byte) 0, 100.0d, 100 };
        switchingFunctionsHandler80.stepAccepted((double) (short) 0, doubleArray86);
        switchingFunctionsHandler50.stepAccepted(1.0d, doubleArray86);
        boolean boolean89 = switchingFunctionsHandler21.reset((double) (short) 100, doubleArray86);
        // The following exception was thrown during execution in test generation
        try {
            switchingFunctionsHandler0.stepAccepted((double) 10, doubleArray86);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(doubleArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray4), "[-1.0, 1.0]");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(doubleArray11);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray11), "[10.0, 0.0, 52.0, 1.0]");
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue(Double.isNaN(double19));
        org.junit.Assert.assertNotNull(doubleArray25);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray25), "[-1.0, 1.0]");
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
        org.junit.Assert.assertNotNull(doubleArray32);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray32), "[-1.0, 1.0]");
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + false + "'", boolean33 == false);
        org.junit.Assert.assertNotNull(doubleArray39);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray39), "[10.0, 0.0, 52.0, 1.0]");
        org.junit.Assert.assertTrue("'" + boolean40 + "' != '" + false + "'", boolean40 == false);
        org.junit.Assert.assertTrue("'" + boolean42 + "' != '" + true + "'", boolean42 == true);
        org.junit.Assert.assertTrue(Double.isNaN(double43));
        org.junit.Assert.assertNotNull(doubleArray56);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray56), "[3.0, 0.0, 100.0, 100.0]");
        org.junit.Assert.assertNotNull(doubleArray63);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray63), "[-1.0, 1.0]");
        org.junit.Assert.assertTrue("'" + boolean64 + "' != '" + false + "'", boolean64 == false);
        org.junit.Assert.assertTrue("'" + boolean65 + "' != '" + true + "'", boolean65 == true);
        org.junit.Assert.assertNotNull(doubleArray73);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray73), "[NaN, 100.0, 100.0, 100.0, 0.0, 10.0]");
        org.junit.Assert.assertTrue("'" + boolean76 + "' != '" + false + "'", boolean76 == false);
        org.junit.Assert.assertTrue("'" + boolean78 + "' != '" + false + "'", boolean78 == false);
        org.junit.Assert.assertNotNull(doubleArray86);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray86), "[3.0, 0.0, 100.0, 100.0]");
        org.junit.Assert.assertTrue("'" + boolean89 + "' != '" + false + "'", boolean89 == false);
    }

    @Test
    public void test16095() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest32.test16095");
        org.apache.commons.math.ode.SwitchingFunctionsHandler switchingFunctionsHandler0 = new org.apache.commons.math.ode.SwitchingFunctionsHandler();
        org.apache.commons.math.ode.StepInterpolator stepInterpolator1 = null;
        boolean boolean2 = switchingFunctionsHandler0.evaluateStep(stepInterpolator1);
        org.apache.commons.math.ode.StepInterpolator stepInterpolator3 = null;
        boolean boolean4 = switchingFunctionsHandler0.evaluateStep(stepInterpolator3);
        double double5 = switchingFunctionsHandler0.getEventTime();
        org.apache.commons.math.ode.SwitchingFunction switchingFunction6 = null;
        switchingFunctionsHandler0.add(switchingFunction6, (double) 100.0f, (double) (-1), (int) (byte) 1);
        boolean boolean11 = switchingFunctionsHandler0.isEmpty();
        double double12 = switchingFunctionsHandler0.getEventTime();
        double double13 = switchingFunctionsHandler0.getEventTime();
        double double14 = switchingFunctionsHandler0.getEventTime();
        boolean boolean15 = switchingFunctionsHandler0.stop();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue(Double.isNaN(double5));
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue(Double.isNaN(double12));
        org.junit.Assert.assertTrue(Double.isNaN(double13));
        org.junit.Assert.assertTrue(Double.isNaN(double14));
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
    }

    @Test
    public void test16096() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest32.test16096");
        java.lang.String[] strArray10 = new java.lang.String[] { "hi!" };
        org.apache.commons.math.ode.DerivativeException derivativeException11 = new org.apache.commons.math.ode.DerivativeException("hi!", strArray10);
        org.apache.commons.math.FunctionEvaluationException functionEvaluationException12 = new org.apache.commons.math.FunctionEvaluationException((double) (byte) 100, "", (java.lang.Object[]) strArray10);
        org.apache.commons.math.ConvergenceException convergenceException13 = new org.apache.commons.math.ConvergenceException("hi!", (java.lang.Object[]) strArray10);
        org.apache.commons.math.ode.IntegratorException integratorException14 = new org.apache.commons.math.ode.IntegratorException("org.apache.commons.math.ConvergenceException: ", (java.lang.Object[]) strArray10);
        org.apache.commons.math.ConvergenceException convergenceException15 = new org.apache.commons.math.ConvergenceException("org.apache.commons.math.ode.DerivativeException: Evaluation failed for argument = 97", (java.lang.Object[]) strArray10);
        org.apache.commons.math.FunctionEvaluationException functionEvaluationException16 = new org.apache.commons.math.FunctionEvaluationException((double) (short) 10, "org.apache.commons.math.ode.IntegratorException: org.apache.commons.math.ode.IntegratorException: org.apache.commons.math.FunctionEvaluationException: Evaluation failed for argument = 97", (java.lang.Object[]) strArray10);
        org.apache.commons.math.ode.DerivativeException derivativeException17 = new org.apache.commons.math.ode.DerivativeException("Evaluation failed for argument = 1", strArray10);
        org.junit.Assert.assertNotNull(strArray10);
    }

    @Test
    public void test16097() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest32.test16097");
        org.apache.commons.math.FunctionEvaluationException functionEvaluationException4 = new org.apache.commons.math.FunctionEvaluationException((double) 1.0f, "org.apache.commons.math.FunctionEvaluationException: org.apache.commons.math.FunctionEvaluationException: org.apache.commons.math.FunctionEvaluationException: ");
        java.lang.Object[] objArray5 = functionEvaluationException4.getArguments();
        org.apache.commons.math.FunctionEvaluationException functionEvaluationException6 = new org.apache.commons.math.FunctionEvaluationException((-1.0d), "org.apache.commons.math.FunctionEvaluationException: org.apache.commons.math.ode.DerivativeException: org.apache.commons.math.ConvergenceException: org.apache.commons.math.ode.DerivativeException: hi!", (java.lang.Throwable) functionEvaluationException4);
        double double7 = functionEvaluationException6.getArgument();
        double double8 = functionEvaluationException6.getArgument();
        org.junit.Assert.assertNotNull(objArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray5), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray5), "[]");
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + (-1.0d) + "'", double7 == (-1.0d));
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + (-1.0d) + "'", double8 == (-1.0d));
    }

    @Test
    public void test16098() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest32.test16098");
        java.lang.String[] strArray9 = new java.lang.String[] { "hi!" };
        org.apache.commons.math.ode.DerivativeException derivativeException10 = new org.apache.commons.math.ode.DerivativeException("hi!", strArray9);
        org.apache.commons.math.FunctionEvaluationException functionEvaluationException11 = new org.apache.commons.math.FunctionEvaluationException((double) 1, "hi!", (java.lang.Object[]) strArray9);
        java.lang.Throwable throwable14 = null;
        org.apache.commons.math.ConvergenceException convergenceException15 = new org.apache.commons.math.ConvergenceException("hi!", throwable14);
        org.apache.commons.math.ConvergenceException convergenceException16 = new org.apache.commons.math.ConvergenceException("hi!", (java.lang.Throwable) convergenceException15);
        org.apache.commons.math.ConvergenceException convergenceException17 = new org.apache.commons.math.ConvergenceException("org.apache.commons.math.ConvergenceException: org.apache.commons.math.FunctionEvaluationException: ", (java.lang.Object[]) strArray9, (java.lang.Throwable) convergenceException15);
        org.apache.commons.math.ode.DerivativeException derivativeException18 = new org.apache.commons.math.ode.DerivativeException("org.apache.commons.math.ode.IntegratorException: Evaluation failed for argument = 2", strArray9);
        org.apache.commons.math.ConvergenceException convergenceException19 = new org.apache.commons.math.ConvergenceException("org.apache.commons.math.ConvergenceException: org.apache.commons.math.FunctionEvaluationException: hi!", (java.lang.Object[]) strArray9);
        org.apache.commons.math.FunctionEvaluationException functionEvaluationException20 = new org.apache.commons.math.FunctionEvaluationException((double) 10.0f, "org.apache.commons.math.ConvergenceException: org.apache.commons.math.ode.DerivativeException: org.apache.commons.math.ode.DerivativeException: hi!", (java.lang.Object[]) strArray9);
        double double21 = functionEvaluationException20.getArgument();
        org.apache.commons.math.ode.IntegratorException integratorException22 = new org.apache.commons.math.ode.IntegratorException((java.lang.Throwable) functionEvaluationException20);
        org.junit.Assert.assertNotNull(strArray9);
        org.junit.Assert.assertTrue("'" + double21 + "' != '" + 10.0d + "'", double21 == 10.0d);
    }

    @Test
    public void test16099() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest32.test16099");
        java.lang.String[] strArray12 = new java.lang.String[] { "hi!" };
        org.apache.commons.math.ode.DerivativeException derivativeException13 = new org.apache.commons.math.ode.DerivativeException("hi!", strArray12);
        org.apache.commons.math.FunctionEvaluationException functionEvaluationException14 = new org.apache.commons.math.FunctionEvaluationException((double) (byte) 100, "", (java.lang.Object[]) strArray12);
        org.apache.commons.math.ConvergenceException convergenceException15 = new org.apache.commons.math.ConvergenceException("hi!", (java.lang.Object[]) strArray12);
        org.apache.commons.math.ode.IntegratorException integratorException16 = new org.apache.commons.math.ode.IntegratorException("org.apache.commons.math.ConvergenceException: ", (java.lang.Object[]) strArray12);
        org.apache.commons.math.FunctionEvaluationException functionEvaluationException17 = new org.apache.commons.math.FunctionEvaluationException(0.0d, "hi!", (java.lang.Object[]) strArray12);
        org.apache.commons.math.ConvergenceException convergenceException18 = new org.apache.commons.math.ConvergenceException("", (java.lang.Object[]) strArray12);
        org.apache.commons.math.ode.IntegratorException integratorException19 = new org.apache.commons.math.ode.IntegratorException("org.apache.commons.math.FunctionEvaluationException", (java.lang.Object[]) strArray12);
        org.apache.commons.math.ConvergenceException convergenceException20 = new org.apache.commons.math.ConvergenceException("org.apache.commons.math.ConvergenceException: org.apache.commons.math.ode.DerivativeException: org.apache.commons.math.ConvergenceException: org.apache.commons.math.ode.DerivativeException: hi!", (java.lang.Object[]) strArray12);
        org.apache.commons.math.FunctionEvaluationException functionEvaluationException26 = new org.apache.commons.math.FunctionEvaluationException((double) 'a');
        java.lang.Throwable[] throwableArray27 = functionEvaluationException26.getSuppressed();
        org.apache.commons.math.FunctionEvaluationException functionEvaluationException29 = new org.apache.commons.math.FunctionEvaluationException((double) 'a');
        org.apache.commons.math.FunctionEvaluationException functionEvaluationException32 = new org.apache.commons.math.FunctionEvaluationException((double) 'a');
        org.apache.commons.math.ConvergenceException convergenceException33 = new org.apache.commons.math.ConvergenceException("hi!", (java.lang.Throwable) functionEvaluationException32);
        functionEvaluationException29.addSuppressed((java.lang.Throwable) convergenceException33);
        org.apache.commons.math.FunctionEvaluationException functionEvaluationException35 = new org.apache.commons.math.FunctionEvaluationException((double) (byte) -1, "org.apache.commons.math.ode.DerivativeException: hi!", (java.lang.Object[]) throwableArray27, (java.lang.Throwable) functionEvaluationException29);
        org.apache.commons.math.FunctionEvaluationException functionEvaluationException36 = new org.apache.commons.math.FunctionEvaluationException(2.0d, (java.lang.Throwable) functionEvaluationException29);
        java.lang.String[] strArray47 = new java.lang.String[] { "hi!" };
        org.apache.commons.math.ode.DerivativeException derivativeException48 = new org.apache.commons.math.ode.DerivativeException("hi!", strArray47);
        org.apache.commons.math.FunctionEvaluationException functionEvaluationException49 = new org.apache.commons.math.FunctionEvaluationException((double) (byte) 100, "", (java.lang.Object[]) strArray47);
        org.apache.commons.math.ConvergenceException convergenceException50 = new org.apache.commons.math.ConvergenceException("hi!", (java.lang.Object[]) strArray47);
        org.apache.commons.math.ode.IntegratorException integratorException51 = new org.apache.commons.math.ode.IntegratorException("org.apache.commons.math.ConvergenceException: ", (java.lang.Object[]) strArray47);
        org.apache.commons.math.FunctionEvaluationException functionEvaluationException52 = new org.apache.commons.math.FunctionEvaluationException(0.0d, "hi!", (java.lang.Object[]) strArray47);
        org.apache.commons.math.ode.DerivativeException derivativeException53 = new org.apache.commons.math.ode.DerivativeException("org.apache.commons.math.ode.DerivativeException: Evaluation failed for argument = 1", strArray47);
        org.apache.commons.math.ode.DerivativeException derivativeException54 = new org.apache.commons.math.ode.DerivativeException("org.apache.commons.math.FunctionEvaluationException: Evaluation failed for argument = 1", strArray47);
        org.apache.commons.math.ode.DerivativeException derivativeException55 = new org.apache.commons.math.ode.DerivativeException((java.lang.Throwable) derivativeException54);
        functionEvaluationException29.addSuppressed((java.lang.Throwable) derivativeException54);
        org.apache.commons.math.ConvergenceException convergenceException57 = new org.apache.commons.math.ConvergenceException("org.apache.commons.math.ode.DerivativeException: hi!", (java.lang.Throwable) functionEvaluationException29);
        org.apache.commons.math.FunctionEvaluationException functionEvaluationException62 = new org.apache.commons.math.FunctionEvaluationException((double) 'a');
        org.apache.commons.math.ConvergenceException convergenceException63 = new org.apache.commons.math.ConvergenceException("hi!", (java.lang.Throwable) functionEvaluationException62);
        java.lang.Throwable[] throwableArray64 = functionEvaluationException62.getSuppressed();
        java.lang.Throwable[] throwableArray65 = functionEvaluationException62.getSuppressed();
        org.apache.commons.math.FunctionEvaluationException functionEvaluationException69 = new org.apache.commons.math.FunctionEvaluationException((double) 'a');
        java.lang.Throwable[] throwableArray70 = functionEvaluationException69.getSuppressed();
        org.apache.commons.math.FunctionEvaluationException functionEvaluationException72 = new org.apache.commons.math.FunctionEvaluationException((double) 'a');
        org.apache.commons.math.FunctionEvaluationException functionEvaluationException75 = new org.apache.commons.math.FunctionEvaluationException((double) 'a');
        org.apache.commons.math.ConvergenceException convergenceException76 = new org.apache.commons.math.ConvergenceException("hi!", (java.lang.Throwable) functionEvaluationException75);
        functionEvaluationException72.addSuppressed((java.lang.Throwable) convergenceException76);
        org.apache.commons.math.FunctionEvaluationException functionEvaluationException78 = new org.apache.commons.math.FunctionEvaluationException((double) (byte) -1, "org.apache.commons.math.ode.DerivativeException: hi!", (java.lang.Object[]) throwableArray70, (java.lang.Throwable) functionEvaluationException72);
        org.apache.commons.math.FunctionEvaluationException functionEvaluationException79 = new org.apache.commons.math.FunctionEvaluationException((double) 100, "org.apache.commons.math.ode.DerivativeException: hi!", (java.lang.Object[]) throwableArray65, (java.lang.Throwable) functionEvaluationException78);
        org.apache.commons.math.FunctionEvaluationException functionEvaluationException82 = new org.apache.commons.math.FunctionEvaluationException((double) (short) 100, "org.apache.commons.math.ode.IntegratorException: Evaluation failed for argument = 2");
        org.apache.commons.math.ode.IntegratorException integratorException83 = new org.apache.commons.math.ode.IntegratorException((java.lang.Throwable) functionEvaluationException82);
        functionEvaluationException78.addSuppressed((java.lang.Throwable) integratorException83);
        functionEvaluationException29.addSuppressed((java.lang.Throwable) integratorException83);
        org.apache.commons.math.ConvergenceException convergenceException86 = new org.apache.commons.math.ConvergenceException("org.apache.commons.math.FunctionEvaluationException: org.apache.commons.math.ode.IntegratorException: ", (java.lang.Object[]) strArray12, (java.lang.Throwable) functionEvaluationException29);
        org.apache.commons.math.ode.IntegratorException integratorException87 = new org.apache.commons.math.ode.IntegratorException((java.lang.Throwable) convergenceException86);
        org.junit.Assert.assertNotNull(strArray12);
        org.junit.Assert.assertNotNull(throwableArray27);
        org.junit.Assert.assertNotNull(strArray47);
        org.junit.Assert.assertNotNull(throwableArray64);
        org.junit.Assert.assertNotNull(throwableArray65);
        org.junit.Assert.assertNotNull(throwableArray70);
    }

    @Test
    public void test16100() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest32.test16100");
        org.apache.commons.math.ode.SwitchingFunctionsHandler switchingFunctionsHandler0 = new org.apache.commons.math.ode.SwitchingFunctionsHandler();
        boolean boolean1 = switchingFunctionsHandler0.stop();
        org.apache.commons.math.ode.SwitchingFunctionsHandler switchingFunctionsHandler3 = new org.apache.commons.math.ode.SwitchingFunctionsHandler();
        double[] doubleArray7 = new double[] { (-1.0f), 1.0d };
        boolean boolean8 = switchingFunctionsHandler3.reset((double) (byte) 10, doubleArray7);
        double[] doubleArray14 = new double[] { 10, 0.0d, '4', 1.0d };
        boolean boolean15 = switchingFunctionsHandler3.reset((double) (-1), doubleArray14);
        boolean boolean16 = switchingFunctionsHandler0.reset(97.0d, doubleArray14);
        double double17 = switchingFunctionsHandler0.getEventTime();
        double[] doubleArray19 = null;
        boolean boolean20 = switchingFunctionsHandler0.reset((double) 10.0f, doubleArray19);
        double double21 = switchingFunctionsHandler0.getEventTime();
        org.apache.commons.math.ode.SwitchingFunctionsHandler switchingFunctionsHandler23 = new org.apache.commons.math.ode.SwitchingFunctionsHandler();
        boolean boolean24 = switchingFunctionsHandler23.stop();
        org.apache.commons.math.ode.SwitchingFunctionsHandler switchingFunctionsHandler26 = new org.apache.commons.math.ode.SwitchingFunctionsHandler();
        double[] doubleArray30 = new double[] { (-1.0f), 1.0d };
        boolean boolean31 = switchingFunctionsHandler26.reset((double) (byte) 10, doubleArray30);
        double[] doubleArray37 = new double[] { 10, 0.0d, '4', 1.0d };
        boolean boolean38 = switchingFunctionsHandler26.reset((double) (-1), doubleArray37);
        boolean boolean39 = switchingFunctionsHandler23.reset(97.0d, doubleArray37);
        boolean boolean40 = switchingFunctionsHandler23.isEmpty();
        org.apache.commons.math.ode.SwitchingFunctionsHandler switchingFunctionsHandler42 = new org.apache.commons.math.ode.SwitchingFunctionsHandler();
        double[] doubleArray46 = new double[] { (-1.0f), 1.0d };
        boolean boolean47 = switchingFunctionsHandler42.reset((double) (byte) 10, doubleArray46);
        org.apache.commons.math.ode.SwitchingFunctionsHandler switchingFunctionsHandler49 = new org.apache.commons.math.ode.SwitchingFunctionsHandler();
        double[] doubleArray53 = new double[] { (-1.0f), 1.0d };
        boolean boolean54 = switchingFunctionsHandler49.reset((double) (byte) 10, doubleArray53);
        double[] doubleArray60 = new double[] { 10, 0.0d, '4', 1.0d };
        boolean boolean61 = switchingFunctionsHandler49.reset((double) (-1), doubleArray60);
        switchingFunctionsHandler42.stepAccepted((double) (byte) -1, doubleArray60);
        boolean boolean63 = switchingFunctionsHandler42.isEmpty();
        double double64 = switchingFunctionsHandler42.getEventTime();
        org.apache.commons.math.ode.SwitchingFunctionsHandler switchingFunctionsHandler66 = new org.apache.commons.math.ode.SwitchingFunctionsHandler();
        double double67 = switchingFunctionsHandler66.getEventTime();
        double double68 = switchingFunctionsHandler66.getEventTime();
        double double69 = switchingFunctionsHandler66.getEventTime();
        org.apache.commons.math.ode.SwitchingFunctionsHandler switchingFunctionsHandler71 = new org.apache.commons.math.ode.SwitchingFunctionsHandler();
        double[] doubleArray75 = new double[] { (-1.0f), 1.0d };
        boolean boolean76 = switchingFunctionsHandler71.reset((double) (byte) 10, doubleArray75);
        double[] doubleArray82 = new double[] { 10, 0.0d, '4', 1.0d };
        boolean boolean83 = switchingFunctionsHandler71.reset((double) (-1), doubleArray82);
        boolean boolean84 = switchingFunctionsHandler66.reset((double) 1, doubleArray82);
        switchingFunctionsHandler42.stepAccepted((double) 100.0f, doubleArray82);
        boolean boolean86 = switchingFunctionsHandler23.reset((double) 100L, doubleArray82);
        boolean boolean87 = switchingFunctionsHandler0.reset((double) (-1.0f), doubleArray82);
        org.apache.commons.math.ode.StepInterpolator stepInterpolator88 = null;
        boolean boolean89 = switchingFunctionsHandler0.evaluateStep(stepInterpolator88);
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertNotNull(doubleArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray7), "[-1.0, 1.0]");
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNotNull(doubleArray14);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray14), "[10.0, 0.0, 52.0, 1.0]");
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue(Double.isNaN(double17));
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertTrue(Double.isNaN(double21));
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertNotNull(doubleArray30);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray30), "[-1.0, 1.0]");
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + false + "'", boolean31 == false);
        org.junit.Assert.assertNotNull(doubleArray37);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray37), "[10.0, 0.0, 52.0, 1.0]");
        org.junit.Assert.assertTrue("'" + boolean38 + "' != '" + false + "'", boolean38 == false);
        org.junit.Assert.assertTrue("'" + boolean39 + "' != '" + false + "'", boolean39 == false);
        org.junit.Assert.assertTrue("'" + boolean40 + "' != '" + true + "'", boolean40 == true);
        org.junit.Assert.assertNotNull(doubleArray46);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray46), "[-1.0, 1.0]");
        org.junit.Assert.assertTrue("'" + boolean47 + "' != '" + false + "'", boolean47 == false);
        org.junit.Assert.assertNotNull(doubleArray53);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray53), "[-1.0, 1.0]");
        org.junit.Assert.assertTrue("'" + boolean54 + "' != '" + false + "'", boolean54 == false);
        org.junit.Assert.assertNotNull(doubleArray60);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray60), "[10.0, 0.0, 52.0, 1.0]");
        org.junit.Assert.assertTrue("'" + boolean61 + "' != '" + false + "'", boolean61 == false);
        org.junit.Assert.assertTrue("'" + boolean63 + "' != '" + true + "'", boolean63 == true);
        org.junit.Assert.assertTrue(Double.isNaN(double64));
        org.junit.Assert.assertTrue(Double.isNaN(double67));
        org.junit.Assert.assertTrue(Double.isNaN(double68));
        org.junit.Assert.assertTrue(Double.isNaN(double69));
        org.junit.Assert.assertNotNull(doubleArray75);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray75), "[-1.0, 1.0]");
        org.junit.Assert.assertTrue("'" + boolean76 + "' != '" + false + "'", boolean76 == false);
        org.junit.Assert.assertNotNull(doubleArray82);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray82), "[10.0, 0.0, 52.0, 1.0]");
        org.junit.Assert.assertTrue("'" + boolean83 + "' != '" + false + "'", boolean83 == false);
        org.junit.Assert.assertTrue("'" + boolean84 + "' != '" + false + "'", boolean84 == false);
        org.junit.Assert.assertTrue("'" + boolean86 + "' != '" + false + "'", boolean86 == false);
        org.junit.Assert.assertTrue("'" + boolean87 + "' != '" + false + "'", boolean87 == false);
        org.junit.Assert.assertTrue("'" + boolean89 + "' != '" + false + "'", boolean89 == false);
    }

    @Test
    public void test16101() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest32.test16101");
        java.lang.String[] strArray13 = new java.lang.String[] { "hi!" };
        org.apache.commons.math.ode.DerivativeException derivativeException14 = new org.apache.commons.math.ode.DerivativeException("hi!", strArray13);
        org.apache.commons.math.FunctionEvaluationException functionEvaluationException15 = new org.apache.commons.math.FunctionEvaluationException((double) (byte) 100, "", (java.lang.Object[]) strArray13);
        org.apache.commons.math.ConvergenceException convergenceException16 = new org.apache.commons.math.ConvergenceException("hi!", (java.lang.Object[]) strArray13);
        org.apache.commons.math.ode.IntegratorException integratorException17 = new org.apache.commons.math.ode.IntegratorException("org.apache.commons.math.ConvergenceException: ", (java.lang.Object[]) strArray13);
        org.apache.commons.math.ode.DerivativeException derivativeException18 = new org.apache.commons.math.ode.DerivativeException("org.apache.commons.math.ConvergenceException: ", strArray13);
        org.apache.commons.math.ode.DerivativeException derivativeException19 = new org.apache.commons.math.ode.DerivativeException("org.apache.commons.math.ConvergenceException: ", strArray13);
        org.apache.commons.math.FunctionEvaluationException functionEvaluationException21 = new org.apache.commons.math.FunctionEvaluationException((double) 0.0f);
        org.apache.commons.math.ConvergenceException convergenceException22 = new org.apache.commons.math.ConvergenceException("org.apache.commons.math.FunctionEvaluationException: org.apache.commons.math.ode.DerivativeException: hi!", (java.lang.Object[]) strArray13, (java.lang.Throwable) functionEvaluationException21);
        org.apache.commons.math.ConvergenceException convergenceException23 = new org.apache.commons.math.ConvergenceException("", (java.lang.Object[]) strArray13);
        org.apache.commons.math.ode.DerivativeException derivativeException24 = new org.apache.commons.math.ode.DerivativeException("org.apache.commons.math.ode.DerivativeException", strArray13);
        org.apache.commons.math.FunctionEvaluationException functionEvaluationException25 = new org.apache.commons.math.FunctionEvaluationException((double) 10L, "org.apache.commons.math.FunctionEvaluationException: org.apache.commons.math.ConvergenceException: org.apache.commons.math.ode.IntegratorException: Evaluation failed for argument = {0}", (java.lang.Throwable) derivativeException24);
        org.junit.Assert.assertNotNull(strArray13);
    }

    @Test
    public void test16102() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest32.test16102");
        java.lang.String[] strArray13 = new java.lang.String[] { "hi!" };
        org.apache.commons.math.ode.DerivativeException derivativeException14 = new org.apache.commons.math.ode.DerivativeException("hi!", strArray13);
        org.apache.commons.math.FunctionEvaluationException functionEvaluationException15 = new org.apache.commons.math.FunctionEvaluationException((double) (byte) 100, "", (java.lang.Object[]) strArray13);
        org.apache.commons.math.ConvergenceException convergenceException16 = new org.apache.commons.math.ConvergenceException("hi!", (java.lang.Object[]) strArray13);
        org.apache.commons.math.ode.DerivativeException derivativeException17 = new org.apache.commons.math.ode.DerivativeException("", strArray13);
        org.apache.commons.math.ode.IntegratorException integratorException18 = new org.apache.commons.math.ode.IntegratorException("", (java.lang.Object[]) strArray13);
        org.apache.commons.math.FunctionEvaluationException functionEvaluationException19 = new org.apache.commons.math.FunctionEvaluationException(10.0d, "", (java.lang.Object[]) strArray13);
        java.lang.Object[] objArray20 = functionEvaluationException19.getArguments();
        org.apache.commons.math.ConvergenceException convergenceException21 = new org.apache.commons.math.ConvergenceException("org.apache.commons.math.ode.DerivativeException: org.apache.commons.math.FunctionEvaluationException: ", objArray20);
        org.apache.commons.math.ConvergenceException convergenceException22 = new org.apache.commons.math.ConvergenceException("org.apache.commons.math.ode.IntegratorException: org.apache.commons.math.FunctionEvaluationException: Evaluation failed for argument = 97", objArray20);
        org.apache.commons.math.FunctionEvaluationException functionEvaluationException29 = new org.apache.commons.math.FunctionEvaluationException((double) 'a');
        java.lang.Throwable[] throwableArray30 = functionEvaluationException29.getSuppressed();
        org.apache.commons.math.FunctionEvaluationException functionEvaluationException32 = new org.apache.commons.math.FunctionEvaluationException((double) 'a');
        org.apache.commons.math.FunctionEvaluationException functionEvaluationException35 = new org.apache.commons.math.FunctionEvaluationException((double) 'a');
        org.apache.commons.math.ConvergenceException convergenceException36 = new org.apache.commons.math.ConvergenceException("hi!", (java.lang.Throwable) functionEvaluationException35);
        functionEvaluationException32.addSuppressed((java.lang.Throwable) convergenceException36);
        org.apache.commons.math.FunctionEvaluationException functionEvaluationException38 = new org.apache.commons.math.FunctionEvaluationException((double) (byte) -1, "org.apache.commons.math.ode.DerivativeException: hi!", (java.lang.Object[]) throwableArray30, (java.lang.Throwable) functionEvaluationException32);
        java.lang.Throwable throwable39 = null;
        org.apache.commons.math.ConvergenceException convergenceException40 = new org.apache.commons.math.ConvergenceException(throwable39);
        org.apache.commons.math.ConvergenceException convergenceException41 = new org.apache.commons.math.ConvergenceException("org.apache.commons.math.FunctionEvaluationException: ", (java.lang.Object[]) throwableArray30, throwable39);
        org.apache.commons.math.ode.IntegratorException integratorException42 = new org.apache.commons.math.ode.IntegratorException("Evaluation failed for argument = {0}", (java.lang.Object[]) throwableArray30);
        org.apache.commons.math.ode.IntegratorException integratorException43 = new org.apache.commons.math.ode.IntegratorException((java.lang.Throwable) integratorException42);
        org.apache.commons.math.ConvergenceException convergenceException44 = new org.apache.commons.math.ConvergenceException("org.apache.commons.math.ConvergenceException: ", (java.lang.Throwable) integratorException43);
        org.apache.commons.math.FunctionEvaluationException functionEvaluationException45 = new org.apache.commons.math.FunctionEvaluationException((double) 100L, "org.apache.commons.math.FunctionEvaluationException: org.apache.commons.math.FunctionEvaluationException: org.apache.commons.math.ode.IntegratorException: org.apache.commons.math.ode.IntegratorException: org.apache.commons.math.ConvergenceException: org.apache.commons.math.FunctionEvaluationException: ", objArray20, (java.lang.Throwable) convergenceException44);
        double double46 = functionEvaluationException45.getArgument();
        org.junit.Assert.assertNotNull(strArray13);
        org.junit.Assert.assertNotNull(objArray20);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray20), "[hi!]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray20), "[hi!]");
        org.junit.Assert.assertNotNull(throwableArray30);
        org.junit.Assert.assertTrue("'" + double46 + "' != '" + 100.0d + "'", double46 == 100.0d);
    }
}

