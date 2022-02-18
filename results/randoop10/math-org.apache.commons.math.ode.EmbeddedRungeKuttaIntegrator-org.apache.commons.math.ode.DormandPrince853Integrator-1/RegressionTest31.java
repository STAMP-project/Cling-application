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
        org.apache.commons.math.ode.DormandPrince853Integrator dormandPrince853Integrator4 = new org.apache.commons.math.ode.DormandPrince853Integrator((double) 10, (double) (byte) 10, (double) (short) 100, (double) 1);
        dormandPrince853Integrator4.setSafety((double) '#');
        dormandPrince853Integrator4.setMaxGrowth((double) 100.0f);
        java.lang.String str9 = dormandPrince853Integrator4.getName();
        double double10 = dormandPrince853Integrator4.getSafety();
        double double11 = dormandPrince853Integrator4.getMaxGrowth();
        double double12 = dormandPrince853Integrator4.getMaxStep();
        double double13 = dormandPrince853Integrator4.getCurrentStepStart();
        double double14 = dormandPrince853Integrator4.getSafety();
        java.lang.String str15 = dormandPrince853Integrator4.getName();
        double double16 = dormandPrince853Integrator4.getMinReduction();
        java.lang.String str17 = dormandPrince853Integrator4.getName();
        java.lang.String str18 = dormandPrince853Integrator4.getName();
        org.apache.commons.math.ode.StepHandler stepHandler19 = null;
        dormandPrince853Integrator4.setStepHandler(stepHandler19);
        double double21 = dormandPrince853Integrator4.getCurrentSignedStepsize();
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "Dormand-Prince 8 (5, 3)" + "'", str9, "Dormand-Prince 8 (5, 3)");
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 35.0d + "'", double10 == 35.0d);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 100.0d + "'", double11 == 100.0d);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 10.0d + "'", double12 == 10.0d);
        org.junit.Assert.assertTrue(Double.isNaN(double13));
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + 35.0d + "'", double14 == 35.0d);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "Dormand-Prince 8 (5, 3)" + "'", str15, "Dormand-Prince 8 (5, 3)");
        org.junit.Assert.assertTrue("'" + double16 + "' != '" + 0.2d + "'", double16 == 0.2d);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "Dormand-Prince 8 (5, 3)" + "'", str17, "Dormand-Prince 8 (5, 3)");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "Dormand-Prince 8 (5, 3)" + "'", str18, "Dormand-Prince 8 (5, 3)");
        org.junit.Assert.assertTrue("'" + double21 + "' != '" + 10.0d + "'", double21 == 10.0d);
    }

    @Test
    public void test15502() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest31.test15502");
        java.lang.String[] strArray5 = new java.lang.String[] {};
        org.apache.commons.math.ode.DerivativeException derivativeException6 = new org.apache.commons.math.ode.DerivativeException("Dormand-Prince 8 (5, 3)", strArray5);
        org.apache.commons.math.ode.DerivativeException derivativeException7 = new org.apache.commons.math.ode.DerivativeException("hi!", strArray5);
        org.apache.commons.math.ode.DerivativeException derivativeException8 = new org.apache.commons.math.ode.DerivativeException("hi!", strArray5);
        org.apache.commons.math.ode.DerivativeException derivativeException9 = new org.apache.commons.math.ode.DerivativeException("", strArray5);
        org.apache.commons.math.ode.DerivativeException derivativeException10 = new org.apache.commons.math.ode.DerivativeException("org.apache.commons.math.ode.DerivativeException: org.apache.commons.math.ode.IntegratorException: org.apache.commons.math.ode.IntegratorException: hi!", strArray5);
        java.lang.String str11 = derivativeException10.getPattern();
        java.lang.String str12 = derivativeException10.getPattern();
        java.lang.String str13 = derivativeException10.getPattern();
        org.junit.Assert.assertNotNull(strArray5);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "org.apache.commons.math.ode.DerivativeException: org.apache.commons.math.ode.IntegratorException: org.apache.commons.math.ode.IntegratorException: hi!" + "'", str11, "org.apache.commons.math.ode.DerivativeException: org.apache.commons.math.ode.IntegratorException: org.apache.commons.math.ode.IntegratorException: hi!");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "org.apache.commons.math.ode.DerivativeException: org.apache.commons.math.ode.IntegratorException: org.apache.commons.math.ode.IntegratorException: hi!" + "'", str12, "org.apache.commons.math.ode.DerivativeException: org.apache.commons.math.ode.IntegratorException: org.apache.commons.math.ode.IntegratorException: hi!");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "org.apache.commons.math.ode.DerivativeException: org.apache.commons.math.ode.IntegratorException: org.apache.commons.math.ode.IntegratorException: hi!" + "'", str13, "org.apache.commons.math.ode.DerivativeException: org.apache.commons.math.ode.IntegratorException: org.apache.commons.math.ode.IntegratorException: hi!");
    }

    @Test
    public void test15503() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest31.test15503");
        double[] doubleArray4 = new double[] {};
        double[] doubleArray5 = new double[] {};
        org.apache.commons.math.ode.DormandPrince853Integrator dormandPrince853Integrator6 = new org.apache.commons.math.ode.DormandPrince853Integrator((double) 1.0f, (double) 1.0f, doubleArray4, doubleArray5);
        double[] doubleArray17 = new double[] {};
        double[] doubleArray18 = new double[] {};
        org.apache.commons.math.ode.DormandPrince853Integrator dormandPrince853Integrator19 = new org.apache.commons.math.ode.DormandPrince853Integrator((double) 1.0f, (double) 1.0f, doubleArray17, doubleArray18);
        double[] doubleArray24 = new double[] {};
        double[] doubleArray25 = new double[] {};
        org.apache.commons.math.ode.DormandPrince853Integrator dormandPrince853Integrator26 = new org.apache.commons.math.ode.DormandPrince853Integrator((double) 1.0f, (double) 1.0f, doubleArray24, doubleArray25);
        double[] doubleArray29 = new double[] {};
        double[] doubleArray30 = new double[] {};
        org.apache.commons.math.ode.DormandPrince853Integrator dormandPrince853Integrator31 = new org.apache.commons.math.ode.DormandPrince853Integrator((double) 1.0f, (double) 1.0f, doubleArray29, doubleArray30);
        org.apache.commons.math.ode.DormandPrince853Integrator dormandPrince853Integrator32 = new org.apache.commons.math.ode.DormandPrince853Integrator((double) ' ', (double) 'a', doubleArray25, doubleArray30);
        org.apache.commons.math.ode.DormandPrince853Integrator dormandPrince853Integrator33 = new org.apache.commons.math.ode.DormandPrince853Integrator(0.9d, (double) 1L, doubleArray17, doubleArray30);
        double[] doubleArray38 = new double[] {};
        double[] doubleArray39 = new double[] {};
        org.apache.commons.math.ode.DormandPrince853Integrator dormandPrince853Integrator40 = new org.apache.commons.math.ode.DormandPrince853Integrator((double) 1.0f, (double) 1.0f, doubleArray38, doubleArray39);
        double[] doubleArray45 = new double[] {};
        double[] doubleArray46 = new double[] {};
        org.apache.commons.math.ode.DormandPrince853Integrator dormandPrince853Integrator47 = new org.apache.commons.math.ode.DormandPrince853Integrator((double) 1.0f, (double) 1.0f, doubleArray45, doubleArray46);
        double[] doubleArray50 = new double[] {};
        double[] doubleArray51 = new double[] {};
        org.apache.commons.math.ode.DormandPrince853Integrator dormandPrince853Integrator52 = new org.apache.commons.math.ode.DormandPrince853Integrator((double) 1.0f, (double) 1.0f, doubleArray50, doubleArray51);
        org.apache.commons.math.ode.DormandPrince853Integrator dormandPrince853Integrator53 = new org.apache.commons.math.ode.DormandPrince853Integrator((double) ' ', (double) 'a', doubleArray46, doubleArray51);
        org.apache.commons.math.ode.DormandPrince853Integrator dormandPrince853Integrator54 = new org.apache.commons.math.ode.DormandPrince853Integrator(0.9d, (double) 1L, doubleArray38, doubleArray51);
        org.apache.commons.math.ode.DormandPrince853Integrator dormandPrince853Integrator55 = new org.apache.commons.math.ode.DormandPrince853Integrator((double) 100L, (double) (byte) 100, doubleArray30, doubleArray51);
        double[] doubleArray60 = new double[] {};
        double[] doubleArray61 = new double[] {};
        org.apache.commons.math.ode.DormandPrince853Integrator dormandPrince853Integrator62 = new org.apache.commons.math.ode.DormandPrince853Integrator((double) 1.0f, (double) 1.0f, doubleArray60, doubleArray61);
        double[] doubleArray65 = new double[] {};
        double[] doubleArray66 = new double[] {};
        org.apache.commons.math.ode.DormandPrince853Integrator dormandPrince853Integrator67 = new org.apache.commons.math.ode.DormandPrince853Integrator((double) 1.0f, (double) 1.0f, doubleArray65, doubleArray66);
        org.apache.commons.math.ode.DormandPrince853Integrator dormandPrince853Integrator68 = new org.apache.commons.math.ode.DormandPrince853Integrator((double) ' ', (double) 'a', doubleArray61, doubleArray66);
        org.apache.commons.math.ode.DormandPrince853Integrator dormandPrince853Integrator69 = new org.apache.commons.math.ode.DormandPrince853Integrator(100.0d, (double) 10, doubleArray30, doubleArray61);
        double[] doubleArray72 = new double[] {};
        double[] doubleArray73 = new double[] {};
        org.apache.commons.math.ode.DormandPrince853Integrator dormandPrince853Integrator74 = new org.apache.commons.math.ode.DormandPrince853Integrator((double) 1.0f, (double) 1.0f, doubleArray72, doubleArray73);
        org.apache.commons.math.ode.DormandPrince853Integrator dormandPrince853Integrator75 = new org.apache.commons.math.ode.DormandPrince853Integrator(10.0d, (double) 10L, doubleArray30, doubleArray73);
        org.apache.commons.math.ode.DormandPrince853Integrator dormandPrince853Integrator76 = new org.apache.commons.math.ode.DormandPrince853Integrator(10.059467437463484d, 0.0d, doubleArray5, doubleArray73);
        java.lang.String str77 = dormandPrince853Integrator76.getName();
        double double78 = dormandPrince853Integrator76.getMaxStep();
        double double79 = dormandPrince853Integrator76.getMaxGrowth();
        double double80 = dormandPrince853Integrator76.getMaxGrowth();
        double double81 = dormandPrince853Integrator76.getMaxStep();
        org.junit.Assert.assertNotNull(doubleArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray4), "[]");
        org.junit.Assert.assertNotNull(doubleArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray5), "[]");
        org.junit.Assert.assertNotNull(doubleArray17);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray17), "[]");
        org.junit.Assert.assertNotNull(doubleArray18);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray18), "[]");
        org.junit.Assert.assertNotNull(doubleArray24);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray24), "[]");
        org.junit.Assert.assertNotNull(doubleArray25);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray25), "[]");
        org.junit.Assert.assertNotNull(doubleArray29);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray29), "[]");
        org.junit.Assert.assertNotNull(doubleArray30);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray30), "[]");
        org.junit.Assert.assertNotNull(doubleArray38);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray38), "[]");
        org.junit.Assert.assertNotNull(doubleArray39);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray39), "[]");
        org.junit.Assert.assertNotNull(doubleArray45);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray45), "[]");
        org.junit.Assert.assertNotNull(doubleArray46);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray46), "[]");
        org.junit.Assert.assertNotNull(doubleArray50);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray50), "[]");
        org.junit.Assert.assertNotNull(doubleArray51);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray51), "[]");
        org.junit.Assert.assertNotNull(doubleArray60);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray60), "[]");
        org.junit.Assert.assertNotNull(doubleArray61);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray61), "[]");
        org.junit.Assert.assertNotNull(doubleArray65);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray65), "[]");
        org.junit.Assert.assertNotNull(doubleArray66);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray66), "[]");
        org.junit.Assert.assertNotNull(doubleArray72);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray72), "[]");
        org.junit.Assert.assertNotNull(doubleArray73);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray73), "[]");
        org.junit.Assert.assertEquals("'" + str77 + "' != '" + "Dormand-Prince 8 (5, 3)" + "'", str77, "Dormand-Prince 8 (5, 3)");
        org.junit.Assert.assertTrue("'" + double78 + "' != '" + 0.0d + "'", double78 == 0.0d);
        org.junit.Assert.assertTrue("'" + double79 + "' != '" + 10.0d + "'", double79 == 10.0d);
        org.junit.Assert.assertTrue("'" + double80 + "' != '" + 10.0d + "'", double80 == 10.0d);
        org.junit.Assert.assertTrue("'" + double81 + "' != '" + 0.0d + "'", double81 == 0.0d);
    }

    @Test
    public void test15504() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest31.test15504");
        double[] doubleArray8 = new double[] {};
        double[] doubleArray9 = new double[] {};
        org.apache.commons.math.ode.DormandPrince853Integrator dormandPrince853Integrator10 = new org.apache.commons.math.ode.DormandPrince853Integrator((double) 1.0f, (double) 1.0f, doubleArray8, doubleArray9);
        double[] doubleArray13 = new double[] {};
        double[] doubleArray14 = new double[] {};
        org.apache.commons.math.ode.DormandPrince853Integrator dormandPrince853Integrator15 = new org.apache.commons.math.ode.DormandPrince853Integrator((double) 1.0f, (double) 1.0f, doubleArray13, doubleArray14);
        org.apache.commons.math.ode.DormandPrince853Integrator dormandPrince853Integrator16 = new org.apache.commons.math.ode.DormandPrince853Integrator((double) ' ', (double) 'a', doubleArray9, doubleArray14);
        double[] doubleArray19 = new double[] {};
        double[] doubleArray20 = new double[] {};
        org.apache.commons.math.ode.DormandPrince853Integrator dormandPrince853Integrator21 = new org.apache.commons.math.ode.DormandPrince853Integrator((double) 1.0f, (double) 1.0f, doubleArray19, doubleArray20);
        org.apache.commons.math.ode.DormandPrince853Integrator dormandPrince853Integrator22 = new org.apache.commons.math.ode.DormandPrince853Integrator(3.1622776601683795d, (double) ' ', doubleArray14, doubleArray19);
        double[] doubleArray27 = new double[] {};
        double[] doubleArray28 = new double[] {};
        org.apache.commons.math.ode.DormandPrince853Integrator dormandPrince853Integrator29 = new org.apache.commons.math.ode.DormandPrince853Integrator((double) 1.0f, (double) 1.0f, doubleArray27, doubleArray28);
        double[] doubleArray34 = new double[] {};
        double[] doubleArray35 = new double[] {};
        org.apache.commons.math.ode.DormandPrince853Integrator dormandPrince853Integrator36 = new org.apache.commons.math.ode.DormandPrince853Integrator((double) 1.0f, (double) 1.0f, doubleArray34, doubleArray35);
        double[] doubleArray39 = new double[] {};
        double[] doubleArray40 = new double[] {};
        org.apache.commons.math.ode.DormandPrince853Integrator dormandPrince853Integrator41 = new org.apache.commons.math.ode.DormandPrince853Integrator((double) 1.0f, (double) 1.0f, doubleArray39, doubleArray40);
        org.apache.commons.math.ode.DormandPrince853Integrator dormandPrince853Integrator42 = new org.apache.commons.math.ode.DormandPrince853Integrator((double) ' ', (double) 'a', doubleArray35, doubleArray40);
        org.apache.commons.math.ode.DormandPrince853Integrator dormandPrince853Integrator43 = new org.apache.commons.math.ode.DormandPrince853Integrator(0.9d, (double) 1L, doubleArray27, doubleArray40);
        org.apache.commons.math.ode.DormandPrince853Integrator dormandPrince853Integrator44 = new org.apache.commons.math.ode.DormandPrince853Integrator((double) (short) 10, (double) 0.0f, doubleArray19, doubleArray40);
        double double45 = dormandPrince853Integrator44.getCurrentStepStart();
        double double46 = dormandPrince853Integrator44.getSafety();
        double double47 = dormandPrince853Integrator44.getMinReduction();
        org.apache.commons.math.ode.SwitchingFunction switchingFunction48 = null;
        dormandPrince853Integrator44.addSwitchingFunction(switchingFunction48, (double) 8, (double) (byte) -1, (int) (byte) 0);
        java.lang.String str53 = dormandPrince853Integrator44.getName();
        dormandPrince853Integrator44.setMinReduction((double) 10);
        java.lang.String str56 = dormandPrince853Integrator44.getName();
        java.lang.String str57 = dormandPrince853Integrator44.getName();
        dormandPrince853Integrator44.setInitialStepSize((double) (byte) -1);
        double double60 = dormandPrince853Integrator44.getMaxGrowth();
        double double61 = dormandPrince853Integrator44.getMaxGrowth();
        org.junit.Assert.assertNotNull(doubleArray8);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray8), "[]");
        org.junit.Assert.assertNotNull(doubleArray9);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray9), "[]");
        org.junit.Assert.assertNotNull(doubleArray13);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray13), "[]");
        org.junit.Assert.assertNotNull(doubleArray14);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray14), "[]");
        org.junit.Assert.assertNotNull(doubleArray19);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray19), "[]");
        org.junit.Assert.assertNotNull(doubleArray20);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray20), "[]");
        org.junit.Assert.assertNotNull(doubleArray27);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray27), "[]");
        org.junit.Assert.assertNotNull(doubleArray28);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray28), "[]");
        org.junit.Assert.assertNotNull(doubleArray34);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray34), "[]");
        org.junit.Assert.assertNotNull(doubleArray35);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray35), "[]");
        org.junit.Assert.assertNotNull(doubleArray39);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray39), "[]");
        org.junit.Assert.assertNotNull(doubleArray40);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray40), "[]");
        org.junit.Assert.assertTrue(Double.isNaN(double45));
        org.junit.Assert.assertTrue("'" + double46 + "' != '" + 0.9d + "'", double46 == 0.9d);
        org.junit.Assert.assertTrue("'" + double47 + "' != '" + 0.2d + "'", double47 == 0.2d);
        org.junit.Assert.assertEquals("'" + str53 + "' != '" + "Dormand-Prince 8 (5, 3)" + "'", str53, "Dormand-Prince 8 (5, 3)");
        org.junit.Assert.assertEquals("'" + str56 + "' != '" + "Dormand-Prince 8 (5, 3)" + "'", str56, "Dormand-Prince 8 (5, 3)");
        org.junit.Assert.assertEquals("'" + str57 + "' != '" + "Dormand-Prince 8 (5, 3)" + "'", str57, "Dormand-Prince 8 (5, 3)");
        org.junit.Assert.assertTrue("'" + double60 + "' != '" + 10.0d + "'", double60 == 10.0d);
        org.junit.Assert.assertTrue("'" + double61 + "' != '" + 10.0d + "'", double61 == 10.0d);
    }

    @Test
    public void test15505() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest31.test15505");
        java.lang.String[] strArray10 = new java.lang.String[] {};
        org.apache.commons.math.ode.DerivativeException derivativeException11 = new org.apache.commons.math.ode.DerivativeException("Dormand-Prince 8 (5, 3)", strArray10);
        org.apache.commons.math.ode.DerivativeException derivativeException12 = new org.apache.commons.math.ode.DerivativeException("hi!", strArray10);
        org.apache.commons.math.ode.DerivativeException derivativeException13 = new org.apache.commons.math.ode.DerivativeException("hi!", strArray10);
        org.apache.commons.math.ode.IntegratorException integratorException14 = new org.apache.commons.math.ode.IntegratorException("org.apache.commons.math.ode.IntegratorException: hi!", (java.lang.Object[]) strArray10);
        org.apache.commons.math.ode.IntegratorException integratorException15 = new org.apache.commons.math.ode.IntegratorException("org.apache.commons.math.ode.DerivativeException: Dormand-Prince 8 (5, 3)", (java.lang.Object[]) strArray10);
        org.apache.commons.math.ode.IntegratorException integratorException16 = new org.apache.commons.math.ode.IntegratorException("org.apache.commons.math.ode.DerivativeException: org.apache.commons.math.ode.IntegratorException: Dormand-Prince 8 (5, 3)", (java.lang.Object[]) strArray10);
        org.apache.commons.math.ode.DerivativeException derivativeException17 = new org.apache.commons.math.ode.DerivativeException("org.apache.commons.math.ode.IntegratorException: ", strArray10);
        org.apache.commons.math.ode.DerivativeException derivativeException18 = new org.apache.commons.math.ode.DerivativeException("org.apache.commons.math.ode.DerivativeException: ", strArray10);
        org.apache.commons.math.ode.DerivativeException derivativeException19 = new org.apache.commons.math.ode.DerivativeException("org.apache.commons.math.ode.IntegratorException: org.apache.commons.math.ode.IntegratorException: hi!", strArray10);
        org.apache.commons.math.ode.DerivativeException derivativeException20 = new org.apache.commons.math.ode.DerivativeException("org.apache.commons.math.ode.IntegratorException: org.apache.commons.math.ode.DerivativeException: org.apache.commons.math.ode.DerivativeException: org.apache.commons.math.ode.IntegratorException: Dormand-Prince 8 (5, 3)", strArray10);
        org.junit.Assert.assertNotNull(strArray10);
    }

    @Test
    public void test15506() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest31.test15506");
        java.lang.Object[] objArray7 = new java.lang.Object[] { 100L, true, (-1), Double.NaN, 1, (-1) };
        org.apache.commons.math.ode.IntegratorException integratorException8 = new org.apache.commons.math.ode.IntegratorException("hi!", objArray7);
        java.lang.String str9 = integratorException8.getPattern();
        org.apache.commons.math.ode.DerivativeException derivativeException10 = new org.apache.commons.math.ode.DerivativeException((java.lang.Throwable) integratorException8);
        org.apache.commons.math.ode.DerivativeException derivativeException11 = new org.apache.commons.math.ode.DerivativeException((java.lang.Throwable) integratorException8);
        org.apache.commons.math.ode.DerivativeException derivativeException12 = new org.apache.commons.math.ode.DerivativeException((java.lang.Throwable) integratorException8);
        java.lang.String str13 = derivativeException12.getPattern();
        java.lang.Object[] objArray14 = derivativeException12.getArguments();
        org.apache.commons.math.ode.IntegratorException integratorException15 = new org.apache.commons.math.ode.IntegratorException((java.lang.Throwable) derivativeException12);
        java.lang.String str16 = derivativeException12.getPattern();
        org.junit.Assert.assertNotNull(objArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray7), "[100, true, -1, NaN, 1, -1]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray7), "[100, true, -1, NaN, 1, -1]");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "hi!" + "'", str13, "hi!");
        org.junit.Assert.assertNotNull(objArray14);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray14), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray14), "[]");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "hi!" + "'", str16, "hi!");
    }

    @Test
    public void test15507() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest31.test15507");
        org.apache.commons.math.ode.DormandPrince853Integrator dormandPrince853Integrator4 = new org.apache.commons.math.ode.DormandPrince853Integrator(1.0d, (double) (byte) 10, (double) (short) 1, (double) 0L);
        int int5 = dormandPrince853Integrator4.getOrder();
        double double6 = dormandPrince853Integrator4.getSafety();
        dormandPrince853Integrator4.setSafety((double) (-1));
        java.lang.String str9 = dormandPrince853Integrator4.getName();
        int int10 = dormandPrince853Integrator4.getOrder();
        java.lang.String str11 = dormandPrince853Integrator4.getName();
        java.lang.String str12 = dormandPrince853Integrator4.getName();
        dormandPrince853Integrator4.setMaxGrowth((double) 8);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 8 + "'", int5 == 8);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.9d + "'", double6 == 0.9d);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "Dormand-Prince 8 (5, 3)" + "'", str9, "Dormand-Prince 8 (5, 3)");
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 8 + "'", int10 == 8);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "Dormand-Prince 8 (5, 3)" + "'", str11, "Dormand-Prince 8 (5, 3)");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "Dormand-Prince 8 (5, 3)" + "'", str12, "Dormand-Prince 8 (5, 3)");
    }

    @Test
    public void test15508() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest31.test15508");
        org.apache.commons.math.ode.DormandPrince853Integrator dormandPrince853Integrator4 = new org.apache.commons.math.ode.DormandPrince853Integrator(32.0d, 72.11102550927978d, (double) (short) 100, 2.3713737056616555d);
        double double5 = dormandPrince853Integrator4.getMaxStep();
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 72.11102550927978d + "'", double5 == 72.11102550927978d);
    }

    @Test
    public void test15509() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest31.test15509");
        org.apache.commons.math.ode.DormandPrince853Integrator dormandPrince853Integrator4 = new org.apache.commons.math.ode.DormandPrince853Integrator(32.0d, 10.0d, (double) (short) 0, (double) (byte) 100);
        double double5 = dormandPrince853Integrator4.getMinStep();
        dormandPrince853Integrator4.setSafety(0.0d);
        org.apache.commons.math.ode.StepHandler stepHandler8 = dormandPrince853Integrator4.getStepHandler();
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 32.0d + "'", double5 == 32.0d);
        org.junit.Assert.assertNotNull(stepHandler8);
    }

    @Test
    public void test15510() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest31.test15510");
        double[] doubleArray4 = new double[] {};
        double[] doubleArray5 = new double[] {};
        org.apache.commons.math.ode.DormandPrince853Integrator dormandPrince853Integrator6 = new org.apache.commons.math.ode.DormandPrince853Integrator((double) 1.0f, (double) 1.0f, doubleArray4, doubleArray5);
        double[] doubleArray13 = new double[] {};
        double[] doubleArray14 = new double[] {};
        org.apache.commons.math.ode.DormandPrince853Integrator dormandPrince853Integrator15 = new org.apache.commons.math.ode.DormandPrince853Integrator((double) 1.0f, (double) 1.0f, doubleArray13, doubleArray14);
        double[] doubleArray20 = new double[] {};
        double[] doubleArray21 = new double[] {};
        org.apache.commons.math.ode.DormandPrince853Integrator dormandPrince853Integrator22 = new org.apache.commons.math.ode.DormandPrince853Integrator((double) 1.0f, (double) 1.0f, doubleArray20, doubleArray21);
        double[] doubleArray25 = new double[] {};
        double[] doubleArray26 = new double[] {};
        org.apache.commons.math.ode.DormandPrince853Integrator dormandPrince853Integrator27 = new org.apache.commons.math.ode.DormandPrince853Integrator((double) 1.0f, (double) 1.0f, doubleArray25, doubleArray26);
        org.apache.commons.math.ode.DormandPrince853Integrator dormandPrince853Integrator28 = new org.apache.commons.math.ode.DormandPrince853Integrator((double) ' ', (double) 'a', doubleArray21, doubleArray26);
        org.apache.commons.math.ode.DormandPrince853Integrator dormandPrince853Integrator29 = new org.apache.commons.math.ode.DormandPrince853Integrator(0.9d, (double) 1L, doubleArray13, doubleArray26);
        double[] doubleArray40 = new double[] {};
        double[] doubleArray41 = new double[] {};
        org.apache.commons.math.ode.DormandPrince853Integrator dormandPrince853Integrator42 = new org.apache.commons.math.ode.DormandPrince853Integrator((double) 1.0f, (double) 1.0f, doubleArray40, doubleArray41);
        double[] doubleArray45 = new double[] {};
        double[] doubleArray46 = new double[] {};
        org.apache.commons.math.ode.DormandPrince853Integrator dormandPrince853Integrator47 = new org.apache.commons.math.ode.DormandPrince853Integrator((double) 1.0f, (double) 1.0f, doubleArray45, doubleArray46);
        org.apache.commons.math.ode.DormandPrince853Integrator dormandPrince853Integrator48 = new org.apache.commons.math.ode.DormandPrince853Integrator((double) ' ', (double) 'a', doubleArray41, doubleArray46);
        double[] doubleArray51 = new double[] {};
        double[] doubleArray52 = new double[] {};
        org.apache.commons.math.ode.DormandPrince853Integrator dormandPrince853Integrator53 = new org.apache.commons.math.ode.DormandPrince853Integrator((double) 1.0f, (double) 1.0f, doubleArray51, doubleArray52);
        org.apache.commons.math.ode.DormandPrince853Integrator dormandPrince853Integrator54 = new org.apache.commons.math.ode.DormandPrince853Integrator(3.1622776601683795d, (double) ' ', doubleArray46, doubleArray51);
        double[] doubleArray59 = new double[] {};
        double[] doubleArray60 = new double[] {};
        org.apache.commons.math.ode.DormandPrince853Integrator dormandPrince853Integrator61 = new org.apache.commons.math.ode.DormandPrince853Integrator((double) 1.0f, (double) 1.0f, doubleArray59, doubleArray60);
        double[] doubleArray66 = new double[] {};
        double[] doubleArray67 = new double[] {};
        org.apache.commons.math.ode.DormandPrince853Integrator dormandPrince853Integrator68 = new org.apache.commons.math.ode.DormandPrince853Integrator((double) 1.0f, (double) 1.0f, doubleArray66, doubleArray67);
        double[] doubleArray71 = new double[] {};
        double[] doubleArray72 = new double[] {};
        org.apache.commons.math.ode.DormandPrince853Integrator dormandPrince853Integrator73 = new org.apache.commons.math.ode.DormandPrince853Integrator((double) 1.0f, (double) 1.0f, doubleArray71, doubleArray72);
        org.apache.commons.math.ode.DormandPrince853Integrator dormandPrince853Integrator74 = new org.apache.commons.math.ode.DormandPrince853Integrator((double) ' ', (double) 'a', doubleArray67, doubleArray72);
        org.apache.commons.math.ode.DormandPrince853Integrator dormandPrince853Integrator75 = new org.apache.commons.math.ode.DormandPrince853Integrator(0.9d, (double) 1L, doubleArray59, doubleArray72);
        org.apache.commons.math.ode.DormandPrince853Integrator dormandPrince853Integrator76 = new org.apache.commons.math.ode.DormandPrince853Integrator((double) (short) 10, (double) 0.0f, doubleArray51, doubleArray72);
        double[] doubleArray77 = null;
        org.apache.commons.math.ode.DormandPrince853Integrator dormandPrince853Integrator78 = new org.apache.commons.math.ode.DormandPrince853Integrator(Double.NaN, (double) (short) 0, doubleArray51, doubleArray77);
        org.apache.commons.math.ode.DormandPrince853Integrator dormandPrince853Integrator79 = new org.apache.commons.math.ode.DormandPrince853Integrator(8.0d, 31.71666350274487d, doubleArray13, doubleArray77);
        org.apache.commons.math.ode.DormandPrince853Integrator dormandPrince853Integrator80 = new org.apache.commons.math.ode.DormandPrince853Integrator(1.2988548708655048d, (double) (byte) 1, doubleArray4, doubleArray13);
        org.junit.Assert.assertNotNull(doubleArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray4), "[]");
        org.junit.Assert.assertNotNull(doubleArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray5), "[]");
        org.junit.Assert.assertNotNull(doubleArray13);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray13), "[]");
        org.junit.Assert.assertNotNull(doubleArray14);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray14), "[]");
        org.junit.Assert.assertNotNull(doubleArray20);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray20), "[]");
        org.junit.Assert.assertNotNull(doubleArray21);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray21), "[]");
        org.junit.Assert.assertNotNull(doubleArray25);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray25), "[]");
        org.junit.Assert.assertNotNull(doubleArray26);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray26), "[]");
        org.junit.Assert.assertNotNull(doubleArray40);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray40), "[]");
        org.junit.Assert.assertNotNull(doubleArray41);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray41), "[]");
        org.junit.Assert.assertNotNull(doubleArray45);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray45), "[]");
        org.junit.Assert.assertNotNull(doubleArray46);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray46), "[]");
        org.junit.Assert.assertNotNull(doubleArray51);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray51), "[]");
        org.junit.Assert.assertNotNull(doubleArray52);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray52), "[]");
        org.junit.Assert.assertNotNull(doubleArray59);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray59), "[]");
        org.junit.Assert.assertNotNull(doubleArray60);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray60), "[]");
        org.junit.Assert.assertNotNull(doubleArray66);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray66), "[]");
        org.junit.Assert.assertNotNull(doubleArray67);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray67), "[]");
        org.junit.Assert.assertNotNull(doubleArray71);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray71), "[]");
        org.junit.Assert.assertNotNull(doubleArray72);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray72), "[]");
    }

    @Test
    public void test15511() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest31.test15511");
        java.lang.String[] strArray9 = new java.lang.String[] {};
        org.apache.commons.math.ode.DerivativeException derivativeException10 = new org.apache.commons.math.ode.DerivativeException("Dormand-Prince 8 (5, 3)", strArray9);
        org.apache.commons.math.ode.DerivativeException derivativeException11 = new org.apache.commons.math.ode.DerivativeException("hi!", strArray9);
        org.apache.commons.math.ode.DerivativeException derivativeException12 = new org.apache.commons.math.ode.DerivativeException("hi!", strArray9);
        org.apache.commons.math.ode.DerivativeException derivativeException13 = new org.apache.commons.math.ode.DerivativeException("hi!", strArray9);
        org.apache.commons.math.ode.IntegratorException integratorException14 = new org.apache.commons.math.ode.IntegratorException("org.apache.commons.math.ode.DerivativeException: Dormand-Prince 8 (5, 3)", (java.lang.Object[]) strArray9);
        org.apache.commons.math.ode.DerivativeException derivativeException15 = new org.apache.commons.math.ode.DerivativeException("org.apache.commons.math.ode.DerivativeException", strArray9);
        org.apache.commons.math.ode.IntegratorException integratorException16 = new org.apache.commons.math.ode.IntegratorException("org.apache.commons.math.ode.IntegratorException: hi!", (java.lang.Object[]) strArray9);
        org.apache.commons.math.ode.DerivativeException derivativeException17 = new org.apache.commons.math.ode.DerivativeException("org.apache.commons.math.ode.DerivativeException: org.apache.commons.math.ode.DerivativeException: Dormand-Prince 8 (5, 3)", strArray9);
        org.apache.commons.math.ode.DerivativeException derivativeException18 = new org.apache.commons.math.ode.DerivativeException("org.apache.commons.math.ode.DerivativeException: org.apache.commons.math.ode.IntegratorException: org.apache.commons.math.ode.DerivativeException: org.apache.commons.math.ode.IntegratorException", strArray9);
        org.junit.Assert.assertNotNull(strArray9);
    }

    @Test
    public void test15512() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest31.test15512");
        org.apache.commons.math.ode.DormandPrince853Integrator dormandPrince853Integrator4 = new org.apache.commons.math.ode.DormandPrince853Integrator((double) '#', (double) 10L, 22.871211309156784d, 1.755012902585341d);
        org.apache.commons.math.ode.SwitchingFunction switchingFunction5 = null;
        dormandPrince853Integrator4.addSwitchingFunction(switchingFunction5, 3.080070288241023d, (double) (short) 100, (int) (short) -1);
        org.apache.commons.math.ode.SwitchingFunction switchingFunction10 = null;
        dormandPrince853Integrator4.addSwitchingFunction(switchingFunction10, 0.9d, 10.0d, (-1));
        dormandPrince853Integrator4.setInitialStepSize(5.623413251903491d);
    }

    @Test
    public void test15513() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest31.test15513");
        org.apache.commons.math.ode.DormandPrince853Integrator dormandPrince853Integrator4 = new org.apache.commons.math.ode.DormandPrince853Integrator(72.11102550927978d, 9.924141172814958d, 3.138288992714996d, 62.30055074422899d);
    }

    @Test
    public void test15514() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest31.test15514");
        org.apache.commons.math.ode.DormandPrince853Integrator dormandPrince853Integrator4 = new org.apache.commons.math.ode.DormandPrince853Integrator(0.0d, (double) 100, (double) (-1.0f), 3.1622776601683795d);
        dormandPrince853Integrator4.setMaxGrowth(0.0d);
        dormandPrince853Integrator4.setMinReduction((double) 1L);
        org.apache.commons.math.ode.StepHandler stepHandler9 = dormandPrince853Integrator4.getStepHandler();
        java.lang.String str10 = dormandPrince853Integrator4.getName();
        org.apache.commons.math.ode.DormandPrince853Integrator dormandPrince853Integrator15 = new org.apache.commons.math.ode.DormandPrince853Integrator(1.0d, (double) (byte) 10, (double) (short) 1, (double) 0L);
        double double16 = dormandPrince853Integrator15.getMinStep();
        int int17 = dormandPrince853Integrator15.getOrder();
        org.apache.commons.math.ode.DormandPrince853Integrator dormandPrince853Integrator22 = new org.apache.commons.math.ode.DormandPrince853Integrator((double) 10, (double) (byte) 10, (double) (short) 100, (double) 1);
        double double23 = dormandPrince853Integrator22.getSafety();
        double double24 = dormandPrince853Integrator22.getMinStep();
        double double25 = dormandPrince853Integrator22.getMinStep();
        double double26 = dormandPrince853Integrator22.getCurrentSignedStepsize();
        int int27 = dormandPrince853Integrator22.getOrder();
        double double28 = dormandPrince853Integrator22.getMaxGrowth();
        org.apache.commons.math.ode.StepHandler stepHandler29 = dormandPrince853Integrator22.getStepHandler();
        dormandPrince853Integrator15.setStepHandler(stepHandler29);
        dormandPrince853Integrator4.setStepHandler(stepHandler29);
        org.apache.commons.math.ode.SwitchingFunction switchingFunction32 = null;
        dormandPrince853Integrator4.addSwitchingFunction(switchingFunction32, 0.0d, (double) 10, 10);
        dormandPrince853Integrator4.setSafety(0.0d);
        double double39 = dormandPrince853Integrator4.getCurrentSignedStepsize();
        org.apache.commons.math.ode.StepHandler stepHandler40 = dormandPrince853Integrator4.getStepHandler();
        org.junit.Assert.assertNotNull(stepHandler9);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "Dormand-Prince 8 (5, 3)" + "'", str10, "Dormand-Prince 8 (5, 3)");
        org.junit.Assert.assertTrue("'" + double16 + "' != '" + 1.0d + "'", double16 == 1.0d);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 8 + "'", int17 == 8);
        org.junit.Assert.assertTrue("'" + double23 + "' != '" + 0.9d + "'", double23 == 0.9d);
        org.junit.Assert.assertTrue("'" + double24 + "' != '" + 10.0d + "'", double24 == 10.0d);
        org.junit.Assert.assertTrue("'" + double25 + "' != '" + 10.0d + "'", double25 == 10.0d);
        org.junit.Assert.assertTrue("'" + double26 + "' != '" + 10.0d + "'", double26 == 10.0d);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 8 + "'", int27 == 8);
        org.junit.Assert.assertTrue("'" + double28 + "' != '" + 10.0d + "'", double28 == 10.0d);
        org.junit.Assert.assertNotNull(stepHandler29);
        org.junit.Assert.assertTrue("'" + double39 + "' != '" + 0.0d + "'", double39 == 0.0d);
        org.junit.Assert.assertNotNull(stepHandler40);
    }

    @Test
    public void test15515() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest31.test15515");
        org.apache.commons.math.ode.DormandPrince853Integrator dormandPrince853Integrator4 = new org.apache.commons.math.ode.DormandPrince853Integrator(1.0d, (double) (byte) 10, (double) (short) 1, (double) 0L);
        org.apache.commons.math.ode.StepHandler stepHandler5 = null;
        dormandPrince853Integrator4.setStepHandler(stepHandler5);
        dormandPrince853Integrator4.setInitialStepSize((double) 1L);
        double double9 = dormandPrince853Integrator4.getCurrentStepStart();
        int int10 = dormandPrince853Integrator4.getOrder();
        org.apache.commons.math.ode.DormandPrince853Integrator dormandPrince853Integrator15 = new org.apache.commons.math.ode.DormandPrince853Integrator((double) 10, (double) (byte) 10, (double) (short) 100, (double) 1);
        double double16 = dormandPrince853Integrator15.getSafety();
        dormandPrince853Integrator15.setMinReduction((double) (short) -1);
        double double19 = dormandPrince853Integrator15.getMaxGrowth();
        double double20 = dormandPrince853Integrator15.getCurrentSignedStepsize();
        dormandPrince853Integrator15.setSafety(0.9d);
        org.apache.commons.math.ode.StepHandler stepHandler23 = dormandPrince853Integrator15.getStepHandler();
        dormandPrince853Integrator4.setStepHandler(stepHandler23);
        double double25 = dormandPrince853Integrator4.getSafety();
        org.apache.commons.math.ode.StepHandler stepHandler26 = dormandPrince853Integrator4.getStepHandler();
        double double27 = dormandPrince853Integrator4.getCurrentSignedStepsize();
        dormandPrince853Integrator4.setInitialStepSize(0.0d);
        org.apache.commons.math.ode.DormandPrince853Integrator dormandPrince853Integrator34 = new org.apache.commons.math.ode.DormandPrince853Integrator((double) 10, (double) (byte) 10, (double) (short) 100, (double) 1);
        double double35 = dormandPrince853Integrator34.getSafety();
        dormandPrince853Integrator34.setInitialStepSize((double) 0.0f);
        int int38 = dormandPrince853Integrator34.getOrder();
        dormandPrince853Integrator34.setSafety((double) 10);
        java.lang.String str41 = dormandPrince853Integrator34.getName();
        org.apache.commons.math.ode.SwitchingFunction switchingFunction42 = null;
        dormandPrince853Integrator34.addSwitchingFunction(switchingFunction42, 1.6870239755710472d, 0.9d, (int) (short) -1);
        org.apache.commons.math.ode.StepHandler stepHandler47 = dormandPrince853Integrator34.getStepHandler();
        dormandPrince853Integrator4.setStepHandler(stepHandler47);
        org.junit.Assert.assertTrue(Double.isNaN(double9));
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 8 + "'", int10 == 8);
        org.junit.Assert.assertTrue("'" + double16 + "' != '" + 0.9d + "'", double16 == 0.9d);
        org.junit.Assert.assertTrue("'" + double19 + "' != '" + 10.0d + "'", double19 == 10.0d);
        org.junit.Assert.assertTrue("'" + double20 + "' != '" + 10.0d + "'", double20 == 10.0d);
        org.junit.Assert.assertNotNull(stepHandler23);
        org.junit.Assert.assertTrue("'" + double25 + "' != '" + 0.9d + "'", double25 == 0.9d);
        org.junit.Assert.assertNotNull(stepHandler26);
        org.junit.Assert.assertTrue("'" + double27 + "' != '" + 3.1622776601683795d + "'", double27 == 3.1622776601683795d);
        org.junit.Assert.assertTrue("'" + double35 + "' != '" + 0.9d + "'", double35 == 0.9d);
        org.junit.Assert.assertTrue("'" + int38 + "' != '" + 8 + "'", int38 == 8);
        org.junit.Assert.assertEquals("'" + str41 + "' != '" + "Dormand-Prince 8 (5, 3)" + "'", str41, "Dormand-Prince 8 (5, 3)");
        org.junit.Assert.assertNotNull(stepHandler47);
    }

    @Test
    public void test15516() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest31.test15516");
        double[] doubleArray8 = new double[] {};
        double[] doubleArray9 = new double[] {};
        org.apache.commons.math.ode.DormandPrince853Integrator dormandPrince853Integrator10 = new org.apache.commons.math.ode.DormandPrince853Integrator((double) 1.0f, (double) 1.0f, doubleArray8, doubleArray9);
        double[] doubleArray13 = new double[] {};
        double[] doubleArray14 = new double[] {};
        org.apache.commons.math.ode.DormandPrince853Integrator dormandPrince853Integrator15 = new org.apache.commons.math.ode.DormandPrince853Integrator((double) 1.0f, (double) 1.0f, doubleArray13, doubleArray14);
        org.apache.commons.math.ode.DormandPrince853Integrator dormandPrince853Integrator16 = new org.apache.commons.math.ode.DormandPrince853Integrator((double) ' ', (double) 'a', doubleArray9, doubleArray14);
        double[] doubleArray19 = new double[] {};
        double[] doubleArray20 = new double[] {};
        org.apache.commons.math.ode.DormandPrince853Integrator dormandPrince853Integrator21 = new org.apache.commons.math.ode.DormandPrince853Integrator((double) 1.0f, (double) 1.0f, doubleArray19, doubleArray20);
        org.apache.commons.math.ode.DormandPrince853Integrator dormandPrince853Integrator22 = new org.apache.commons.math.ode.DormandPrince853Integrator(3.1622776601683795d, (double) ' ', doubleArray14, doubleArray19);
        double[] doubleArray27 = new double[] {};
        double[] doubleArray28 = new double[] {};
        org.apache.commons.math.ode.DormandPrince853Integrator dormandPrince853Integrator29 = new org.apache.commons.math.ode.DormandPrince853Integrator((double) 1.0f, (double) 1.0f, doubleArray27, doubleArray28);
        double[] doubleArray34 = new double[] {};
        double[] doubleArray35 = new double[] {};
        org.apache.commons.math.ode.DormandPrince853Integrator dormandPrince853Integrator36 = new org.apache.commons.math.ode.DormandPrince853Integrator((double) 1.0f, (double) 1.0f, doubleArray34, doubleArray35);
        double[] doubleArray39 = new double[] {};
        double[] doubleArray40 = new double[] {};
        org.apache.commons.math.ode.DormandPrince853Integrator dormandPrince853Integrator41 = new org.apache.commons.math.ode.DormandPrince853Integrator((double) 1.0f, (double) 1.0f, doubleArray39, doubleArray40);
        org.apache.commons.math.ode.DormandPrince853Integrator dormandPrince853Integrator42 = new org.apache.commons.math.ode.DormandPrince853Integrator((double) ' ', (double) 'a', doubleArray35, doubleArray40);
        org.apache.commons.math.ode.DormandPrince853Integrator dormandPrince853Integrator43 = new org.apache.commons.math.ode.DormandPrince853Integrator(0.9d, (double) 1L, doubleArray27, doubleArray40);
        org.apache.commons.math.ode.DormandPrince853Integrator dormandPrince853Integrator44 = new org.apache.commons.math.ode.DormandPrince853Integrator((double) (short) 10, (double) 0.0f, doubleArray19, doubleArray40);
        double double45 = dormandPrince853Integrator44.getCurrentStepStart();
        int int46 = dormandPrince853Integrator44.getOrder();
        java.lang.String str47 = dormandPrince853Integrator44.getName();
        int int48 = dormandPrince853Integrator44.getOrder();
        dormandPrince853Integrator44.setMinReduction(17.88854381999832d);
        dormandPrince853Integrator44.setMinReduction(5.623413251903491d);
        int int53 = dormandPrince853Integrator44.getOrder();
        double double54 = dormandPrince853Integrator44.getSafety();
        org.junit.Assert.assertNotNull(doubleArray8);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray8), "[]");
        org.junit.Assert.assertNotNull(doubleArray9);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray9), "[]");
        org.junit.Assert.assertNotNull(doubleArray13);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray13), "[]");
        org.junit.Assert.assertNotNull(doubleArray14);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray14), "[]");
        org.junit.Assert.assertNotNull(doubleArray19);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray19), "[]");
        org.junit.Assert.assertNotNull(doubleArray20);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray20), "[]");
        org.junit.Assert.assertNotNull(doubleArray27);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray27), "[]");
        org.junit.Assert.assertNotNull(doubleArray28);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray28), "[]");
        org.junit.Assert.assertNotNull(doubleArray34);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray34), "[]");
        org.junit.Assert.assertNotNull(doubleArray35);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray35), "[]");
        org.junit.Assert.assertNotNull(doubleArray39);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray39), "[]");
        org.junit.Assert.assertNotNull(doubleArray40);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray40), "[]");
        org.junit.Assert.assertTrue(Double.isNaN(double45));
        org.junit.Assert.assertTrue("'" + int46 + "' != '" + 8 + "'", int46 == 8);
        org.junit.Assert.assertEquals("'" + str47 + "' != '" + "Dormand-Prince 8 (5, 3)" + "'", str47, "Dormand-Prince 8 (5, 3)");
        org.junit.Assert.assertTrue("'" + int48 + "' != '" + 8 + "'", int48 == 8);
        org.junit.Assert.assertTrue("'" + int53 + "' != '" + 8 + "'", int53 == 8);
        org.junit.Assert.assertTrue("'" + double54 + "' != '" + 0.9d + "'", double54 == 0.9d);
    }

    @Test
    public void test15517() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest31.test15517");
        org.apache.commons.math.ode.DormandPrince853Integrator dormandPrince853Integrator4 = new org.apache.commons.math.ode.DormandPrince853Integrator(100.0d, 0.0d, (double) (-1), 0.0d);
        java.lang.String str5 = dormandPrince853Integrator4.getName();
        double double6 = dormandPrince853Integrator4.getSafety();
        double double7 = dormandPrince853Integrator4.getSafety();
        int int8 = dormandPrince853Integrator4.getOrder();
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Dormand-Prince 8 (5, 3)" + "'", str5, "Dormand-Prince 8 (5, 3)");
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.9d + "'", double6 == 0.9d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 0.9d + "'", double7 == 0.9d);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 8 + "'", int8 == 8);
    }

    @Test
    public void test15518() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest31.test15518");
        java.lang.String[] strArray11 = new java.lang.String[] {};
        org.apache.commons.math.ode.DerivativeException derivativeException12 = new org.apache.commons.math.ode.DerivativeException("Dormand-Prince 8 (5, 3)", strArray11);
        org.apache.commons.math.ode.DerivativeException derivativeException13 = new org.apache.commons.math.ode.DerivativeException("org.apache.commons.math.ode.IntegratorException: Dormand-Prince 8 (5, 3)", strArray11);
        org.apache.commons.math.ode.IntegratorException integratorException14 = new org.apache.commons.math.ode.IntegratorException("hi!", (java.lang.Object[]) strArray11);
        org.apache.commons.math.ode.DerivativeException derivativeException15 = new org.apache.commons.math.ode.DerivativeException("org.apache.commons.math.ode.IntegratorException: Dormand-Prince 8 (5, 3)", strArray11);
        org.apache.commons.math.ode.DerivativeException derivativeException16 = new org.apache.commons.math.ode.DerivativeException("org.apache.commons.math.ode.DerivativeException: Dormand-Prince 8 (5, 3)", strArray11);
        org.apache.commons.math.ode.DerivativeException derivativeException17 = new org.apache.commons.math.ode.DerivativeException("org.apache.commons.math.ode.IntegratorException: ", strArray11);
        org.apache.commons.math.ode.IntegratorException integratorException18 = new org.apache.commons.math.ode.IntegratorException("org.apache.commons.math.ode.DerivativeException: Dormand-Prince 8 (5, 3)", (java.lang.Object[]) strArray11);
        org.apache.commons.math.ode.IntegratorException integratorException19 = new org.apache.commons.math.ode.IntegratorException("org.apache.commons.math.ode.DerivativeException: hi!", (java.lang.Object[]) strArray11);
        org.apache.commons.math.ode.DerivativeException derivativeException20 = new org.apache.commons.math.ode.DerivativeException("org.apache.commons.math.ode.IntegratorException: hi!", strArray11);
        org.apache.commons.math.ode.DerivativeException derivativeException21 = new org.apache.commons.math.ode.DerivativeException("org.apache.commons.math.ode.DerivativeException: hi!", strArray11);
        org.apache.commons.math.ode.IntegratorException integratorException22 = new org.apache.commons.math.ode.IntegratorException("", (java.lang.Object[]) strArray11);
        java.lang.String str23 = integratorException22.getPattern();
        org.apache.commons.math.ode.IntegratorException integratorException24 = new org.apache.commons.math.ode.IntegratorException((java.lang.Throwable) integratorException22);
        java.lang.String str25 = integratorException22.getPattern();
        org.apache.commons.math.ode.IntegratorException integratorException26 = new org.apache.commons.math.ode.IntegratorException((java.lang.Throwable) integratorException22);
        org.junit.Assert.assertNotNull(strArray11);
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "" + "'", str23, "");
        org.junit.Assert.assertEquals("'" + str25 + "' != '" + "" + "'", str25, "");
    }

    @Test
    public void test15519() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest31.test15519");
        org.apache.commons.math.ode.DormandPrince853Integrator dormandPrince853Integrator4 = new org.apache.commons.math.ode.DormandPrince853Integrator((double) 0L, (double) 'a', (-1.0d), 0.0d);
        dormandPrince853Integrator4.setMinReduction((double) 1);
        dormandPrince853Integrator4.setMaxGrowth((double) (byte) -1);
        double double9 = dormandPrince853Integrator4.getMaxGrowth();
        java.lang.String str10 = dormandPrince853Integrator4.getName();
        org.apache.commons.math.ode.SwitchingFunction switchingFunction11 = null;
        dormandPrince853Integrator4.addSwitchingFunction(switchingFunction11, (-1.0d), 32.0d, (int) (short) 0);
        org.apache.commons.math.ode.StepHandler stepHandler16 = dormandPrince853Integrator4.getStepHandler();
        double double17 = dormandPrince853Integrator4.getMinStep();
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + (-1.0d) + "'", double9 == (-1.0d));
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "Dormand-Prince 8 (5, 3)" + "'", str10, "Dormand-Prince 8 (5, 3)");
        org.junit.Assert.assertNotNull(stepHandler16);
        org.junit.Assert.assertTrue("'" + double17 + "' != '" + 0.0d + "'", double17 == 0.0d);
    }

    @Test
    public void test15520() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest31.test15520");
        org.apache.commons.math.ode.DormandPrince853Integrator dormandPrince853Integrator4 = new org.apache.commons.math.ode.DormandPrince853Integrator((double) (byte) -1, (double) 'a', (double) 10, (double) (short) -1);
        dormandPrince853Integrator4.setMaxGrowth((double) (byte) 1);
        double double7 = dormandPrince853Integrator4.getSafety();
        java.lang.String str8 = dormandPrince853Integrator4.getName();
        java.lang.String str9 = dormandPrince853Integrator4.getName();
        dormandPrince853Integrator4.setMaxGrowth((double) (-1L));
        int int12 = dormandPrince853Integrator4.getOrder();
        java.lang.String str13 = dormandPrince853Integrator4.getName();
        org.apache.commons.math.ode.DormandPrince853Integrator dormandPrince853Integrator18 = new org.apache.commons.math.ode.DormandPrince853Integrator((double) 10, (double) (byte) 10, (double) (short) 100, (double) 1);
        java.lang.String str19 = dormandPrince853Integrator18.getName();
        java.lang.String str20 = dormandPrince853Integrator18.getName();
        org.apache.commons.math.ode.DormandPrince853Integrator dormandPrince853Integrator25 = new org.apache.commons.math.ode.DormandPrince853Integrator((double) 10, (double) (byte) 10, (double) (short) 100, (double) 1);
        double double26 = dormandPrince853Integrator25.getSafety();
        int int27 = dormandPrince853Integrator25.getOrder();
        int int28 = dormandPrince853Integrator25.getOrder();
        org.apache.commons.math.ode.StepHandler stepHandler29 = dormandPrince853Integrator25.getStepHandler();
        dormandPrince853Integrator18.setStepHandler(stepHandler29);
        org.apache.commons.math.ode.DormandPrince853Integrator dormandPrince853Integrator35 = new org.apache.commons.math.ode.DormandPrince853Integrator((double) 0L, (double) 'a', (-1.0d), 0.0d);
        dormandPrince853Integrator35.setMinReduction((double) 1);
        dormandPrince853Integrator35.setMinReduction((double) (byte) 10);
        org.apache.commons.math.ode.DormandPrince853Integrator dormandPrince853Integrator44 = new org.apache.commons.math.ode.DormandPrince853Integrator(1.0d, (double) (byte) 10, (double) (short) 1, (double) 0L);
        int int45 = dormandPrince853Integrator44.getOrder();
        double double46 = dormandPrince853Integrator44.getSafety();
        dormandPrince853Integrator44.setSafety((double) (-1));
        org.apache.commons.math.ode.DormandPrince853Integrator dormandPrince853Integrator53 = new org.apache.commons.math.ode.DormandPrince853Integrator((double) 10, (double) (byte) 10, (double) (short) 100, (double) 1);
        double double54 = dormandPrince853Integrator53.getSafety();
        dormandPrince853Integrator53.setInitialStepSize((double) 0.0f);
        int int57 = dormandPrince853Integrator53.getOrder();
        org.apache.commons.math.ode.DormandPrince853Integrator dormandPrince853Integrator62 = new org.apache.commons.math.ode.DormandPrince853Integrator((double) 10, (double) (byte) 10, (double) (short) 100, (double) 1);
        double double63 = dormandPrince853Integrator62.getSafety();
        double double64 = dormandPrince853Integrator62.getMinStep();
        double double65 = dormandPrince853Integrator62.getMinStep();
        double double66 = dormandPrince853Integrator62.getCurrentSignedStepsize();
        int int67 = dormandPrince853Integrator62.getOrder();
        double double68 = dormandPrince853Integrator62.getMaxGrowth();
        org.apache.commons.math.ode.StepHandler stepHandler69 = dormandPrince853Integrator62.getStepHandler();
        dormandPrince853Integrator53.setStepHandler(stepHandler69);
        dormandPrince853Integrator44.setStepHandler(stepHandler69);
        dormandPrince853Integrator35.setStepHandler(stepHandler69);
        dormandPrince853Integrator18.setStepHandler(stepHandler69);
        dormandPrince853Integrator4.setStepHandler(stepHandler69);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 0.9d + "'", double7 == 0.9d);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Dormand-Prince 8 (5, 3)" + "'", str8, "Dormand-Prince 8 (5, 3)");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "Dormand-Prince 8 (5, 3)" + "'", str9, "Dormand-Prince 8 (5, 3)");
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 8 + "'", int12 == 8);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "Dormand-Prince 8 (5, 3)" + "'", str13, "Dormand-Prince 8 (5, 3)");
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "Dormand-Prince 8 (5, 3)" + "'", str19, "Dormand-Prince 8 (5, 3)");
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "Dormand-Prince 8 (5, 3)" + "'", str20, "Dormand-Prince 8 (5, 3)");
        org.junit.Assert.assertTrue("'" + double26 + "' != '" + 0.9d + "'", double26 == 0.9d);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 8 + "'", int27 == 8);
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + 8 + "'", int28 == 8);
        org.junit.Assert.assertNotNull(stepHandler29);
        org.junit.Assert.assertTrue("'" + int45 + "' != '" + 8 + "'", int45 == 8);
        org.junit.Assert.assertTrue("'" + double46 + "' != '" + 0.9d + "'", double46 == 0.9d);
        org.junit.Assert.assertTrue("'" + double54 + "' != '" + 0.9d + "'", double54 == 0.9d);
        org.junit.Assert.assertTrue("'" + int57 + "' != '" + 8 + "'", int57 == 8);
        org.junit.Assert.assertTrue("'" + double63 + "' != '" + 0.9d + "'", double63 == 0.9d);
        org.junit.Assert.assertTrue("'" + double64 + "' != '" + 10.0d + "'", double64 == 10.0d);
        org.junit.Assert.assertTrue("'" + double65 + "' != '" + 10.0d + "'", double65 == 10.0d);
        org.junit.Assert.assertTrue("'" + double66 + "' != '" + 10.0d + "'", double66 == 10.0d);
        org.junit.Assert.assertTrue("'" + int67 + "' != '" + 8 + "'", int67 == 8);
        org.junit.Assert.assertTrue("'" + double68 + "' != '" + 10.0d + "'", double68 == 10.0d);
        org.junit.Assert.assertNotNull(stepHandler69);
    }

    @Test
    public void test15521() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest31.test15521");
        org.apache.commons.math.ode.DormandPrince853Integrator dormandPrince853Integrator4 = new org.apache.commons.math.ode.DormandPrince853Integrator((double) (byte) -1, (double) (-1.0f), (double) 10.0f, 0.0d);
        org.apache.commons.math.ode.StepHandler stepHandler5 = dormandPrince853Integrator4.getStepHandler();
        dormandPrince853Integrator4.setMaxGrowth((-1.0d));
        double double8 = dormandPrince853Integrator4.getSafety();
        int int9 = dormandPrince853Integrator4.getOrder();
        double double10 = dormandPrince853Integrator4.getSafety();
        org.junit.Assert.assertNotNull(stepHandler5);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 0.9d + "'", double8 == 0.9d);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 8 + "'", int9 == 8);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 0.9d + "'", double10 == 0.9d);
    }

    @Test
    public void test15522() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest31.test15522");
        org.apache.commons.math.ode.DormandPrince853Integrator dormandPrince853Integrator4 = new org.apache.commons.math.ode.DormandPrince853Integrator((double) 0L, (double) 'a', (-1.0d), 0.0d);
        dormandPrince853Integrator4.setInitialStepSize((double) 'a');
        dormandPrince853Integrator4.setInitialStepSize((double) ' ');
        dormandPrince853Integrator4.setSafety(17.88854381999832d);
        double double11 = dormandPrince853Integrator4.getMinStep();
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 0.0d + "'", double11 == 0.0d);
    }

    @Test
    public void test15523() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest31.test15523");
        double[] doubleArray6 = new double[] {};
        double[] doubleArray7 = new double[] {};
        org.apache.commons.math.ode.DormandPrince853Integrator dormandPrince853Integrator8 = new org.apache.commons.math.ode.DormandPrince853Integrator((double) 1.0f, (double) 1.0f, doubleArray6, doubleArray7);
        double[] doubleArray13 = new double[] {};
        double[] doubleArray14 = new double[] {};
        org.apache.commons.math.ode.DormandPrince853Integrator dormandPrince853Integrator15 = new org.apache.commons.math.ode.DormandPrince853Integrator((double) 1.0f, (double) 1.0f, doubleArray13, doubleArray14);
        double[] doubleArray18 = new double[] {};
        double[] doubleArray19 = new double[] {};
        org.apache.commons.math.ode.DormandPrince853Integrator dormandPrince853Integrator20 = new org.apache.commons.math.ode.DormandPrince853Integrator((double) 1.0f, (double) 1.0f, doubleArray18, doubleArray19);
        org.apache.commons.math.ode.DormandPrince853Integrator dormandPrince853Integrator21 = new org.apache.commons.math.ode.DormandPrince853Integrator((double) ' ', (double) 'a', doubleArray14, doubleArray19);
        org.apache.commons.math.ode.DormandPrince853Integrator dormandPrince853Integrator22 = new org.apache.commons.math.ode.DormandPrince853Integrator(0.9d, (double) 1L, doubleArray6, doubleArray19);
        double[] doubleArray27 = new double[] {};
        double[] doubleArray28 = new double[] {};
        org.apache.commons.math.ode.DormandPrince853Integrator dormandPrince853Integrator29 = new org.apache.commons.math.ode.DormandPrince853Integrator((double) 1.0f, (double) 1.0f, doubleArray27, doubleArray28);
        double[] doubleArray34 = new double[] {};
        double[] doubleArray35 = new double[] {};
        org.apache.commons.math.ode.DormandPrince853Integrator dormandPrince853Integrator36 = new org.apache.commons.math.ode.DormandPrince853Integrator((double) 1.0f, (double) 1.0f, doubleArray34, doubleArray35);
        double[] doubleArray39 = new double[] {};
        double[] doubleArray40 = new double[] {};
        org.apache.commons.math.ode.DormandPrince853Integrator dormandPrince853Integrator41 = new org.apache.commons.math.ode.DormandPrince853Integrator((double) 1.0f, (double) 1.0f, doubleArray39, doubleArray40);
        org.apache.commons.math.ode.DormandPrince853Integrator dormandPrince853Integrator42 = new org.apache.commons.math.ode.DormandPrince853Integrator((double) ' ', (double) 'a', doubleArray35, doubleArray40);
        org.apache.commons.math.ode.DormandPrince853Integrator dormandPrince853Integrator43 = new org.apache.commons.math.ode.DormandPrince853Integrator(0.9d, (double) 1L, doubleArray27, doubleArray40);
        org.apache.commons.math.ode.DormandPrince853Integrator dormandPrince853Integrator44 = new org.apache.commons.math.ode.DormandPrince853Integrator((double) 100L, (double) (byte) 100, doubleArray19, doubleArray40);
        org.apache.commons.math.ode.SwitchingFunction switchingFunction45 = null;
        dormandPrince853Integrator44.addSwitchingFunction(switchingFunction45, 35.0d, (double) '#', (int) '#');
        org.apache.commons.math.ode.StepHandler stepHandler50 = dormandPrince853Integrator44.getStepHandler();
        dormandPrince853Integrator44.setInitialStepSize(3.1622776601683795d);
        double double53 = dormandPrince853Integrator44.getMaxGrowth();
        org.junit.Assert.assertNotNull(doubleArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray6), "[]");
        org.junit.Assert.assertNotNull(doubleArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray7), "[]");
        org.junit.Assert.assertNotNull(doubleArray13);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray13), "[]");
        org.junit.Assert.assertNotNull(doubleArray14);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray14), "[]");
        org.junit.Assert.assertNotNull(doubleArray18);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray18), "[]");
        org.junit.Assert.assertNotNull(doubleArray19);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray19), "[]");
        org.junit.Assert.assertNotNull(doubleArray27);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray27), "[]");
        org.junit.Assert.assertNotNull(doubleArray28);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray28), "[]");
        org.junit.Assert.assertNotNull(doubleArray34);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray34), "[]");
        org.junit.Assert.assertNotNull(doubleArray35);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray35), "[]");
        org.junit.Assert.assertNotNull(doubleArray39);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray39), "[]");
        org.junit.Assert.assertNotNull(doubleArray40);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray40), "[]");
        org.junit.Assert.assertNotNull(stepHandler50);
        org.junit.Assert.assertTrue("'" + double53 + "' != '" + 10.0d + "'", double53 == 10.0d);
    }

    @Test
    public void test15524() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest31.test15524");
        org.apache.commons.math.ode.DormandPrince853Integrator dormandPrince853Integrator4 = new org.apache.commons.math.ode.DormandPrince853Integrator((double) 10, (double) (byte) 10, (double) (short) 100, (double) 1);
        double double5 = dormandPrince853Integrator4.getSafety();
        int int6 = dormandPrince853Integrator4.getOrder();
        int int7 = dormandPrince853Integrator4.getOrder();
        double double8 = dormandPrince853Integrator4.getMinReduction();
        java.lang.String str9 = dormandPrince853Integrator4.getName();
        java.lang.String str10 = dormandPrince853Integrator4.getName();
        double double11 = dormandPrince853Integrator4.getMinReduction();
        double double12 = dormandPrince853Integrator4.getMinStep();
        org.apache.commons.math.ode.StepHandler stepHandler13 = dormandPrince853Integrator4.getStepHandler();
        double double14 = dormandPrince853Integrator4.getMaxStep();
        double double15 = dormandPrince853Integrator4.getMaxStep();
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.9d + "'", double5 == 0.9d);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 8 + "'", int6 == 8);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 8 + "'", int7 == 8);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 0.2d + "'", double8 == 0.2d);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "Dormand-Prince 8 (5, 3)" + "'", str9, "Dormand-Prince 8 (5, 3)");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "Dormand-Prince 8 (5, 3)" + "'", str10, "Dormand-Prince 8 (5, 3)");
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 0.2d + "'", double11 == 0.2d);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 10.0d + "'", double12 == 10.0d);
        org.junit.Assert.assertNotNull(stepHandler13);
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + 10.0d + "'", double14 == 10.0d);
        org.junit.Assert.assertTrue("'" + double15 + "' != '" + 10.0d + "'", double15 == 10.0d);
    }

    @Test
    public void test15525() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest31.test15525");
        java.lang.String[] strArray9 = new java.lang.String[] {};
        org.apache.commons.math.ode.DerivativeException derivativeException10 = new org.apache.commons.math.ode.DerivativeException("Dormand-Prince 8 (5, 3)", strArray9);
        org.apache.commons.math.ode.DerivativeException derivativeException11 = new org.apache.commons.math.ode.DerivativeException("hi!", strArray9);
        org.apache.commons.math.ode.DerivativeException derivativeException12 = new org.apache.commons.math.ode.DerivativeException("hi!", strArray9);
        org.apache.commons.math.ode.IntegratorException integratorException13 = new org.apache.commons.math.ode.IntegratorException("", (java.lang.Object[]) strArray9);
        org.apache.commons.math.ode.DerivativeException derivativeException14 = new org.apache.commons.math.ode.DerivativeException("hi!", strArray9);
        org.apache.commons.math.ode.DerivativeException derivativeException15 = new org.apache.commons.math.ode.DerivativeException("org.apache.commons.math.ode.DerivativeException: org.apache.commons.math.ode.IntegratorException: Dormand-Prince 8 (5, 3)", strArray9);
        org.apache.commons.math.ode.DerivativeException derivativeException16 = new org.apache.commons.math.ode.DerivativeException("org.apache.commons.math.ode.IntegratorException: org.apache.commons.math.ode.DerivativeException: org.apache.commons.math.ode.IntegratorException: Dormand-Prince 8 (5, 3)", strArray9);
        org.apache.commons.math.ode.DerivativeException derivativeException17 = new org.apache.commons.math.ode.DerivativeException("org.apache.commons.math.ode.DerivativeException: org.apache.commons.math.ode.DerivativeException: Dormand-Prince 8 (5, 3)", strArray9);
        org.apache.commons.math.ode.DerivativeException derivativeException18 = new org.apache.commons.math.ode.DerivativeException("", strArray9);
        org.apache.commons.math.ode.DerivativeException derivativeException19 = new org.apache.commons.math.ode.DerivativeException((java.lang.Throwable) derivativeException18);
        java.lang.Throwable[] throwableArray20 = derivativeException18.getSuppressed();
        org.junit.Assert.assertNotNull(strArray9);
        org.junit.Assert.assertNotNull(throwableArray20);
    }

    @Test
    public void test15526() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest31.test15526");
        org.apache.commons.math.ode.DormandPrince853Integrator dormandPrince853Integrator4 = new org.apache.commons.math.ode.DormandPrince853Integrator(31.622776601683793d, (double) (-1), 40.0d, 0.0d);
        int int5 = dormandPrince853Integrator4.getOrder();
        java.lang.String str6 = dormandPrince853Integrator4.getName();
        double double7 = dormandPrince853Integrator4.getSafety();
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 8 + "'", int5 == 8);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Dormand-Prince 8 (5, 3)" + "'", str6, "Dormand-Prince 8 (5, 3)");
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 0.9d + "'", double7 == 0.9d);
    }

    @Test
    public void test15527() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest31.test15527");
        double[] doubleArray10 = new double[] {};
        double[] doubleArray11 = new double[] {};
        org.apache.commons.math.ode.DormandPrince853Integrator dormandPrince853Integrator12 = new org.apache.commons.math.ode.DormandPrince853Integrator((double) 1.0f, (double) 1.0f, doubleArray10, doubleArray11);
        double[] doubleArray15 = new double[] {};
        double[] doubleArray16 = new double[] {};
        org.apache.commons.math.ode.DormandPrince853Integrator dormandPrince853Integrator17 = new org.apache.commons.math.ode.DormandPrince853Integrator((double) 1.0f, (double) 1.0f, doubleArray15, doubleArray16);
        org.apache.commons.math.ode.DormandPrince853Integrator dormandPrince853Integrator18 = new org.apache.commons.math.ode.DormandPrince853Integrator((double) ' ', (double) 'a', doubleArray11, doubleArray16);
        double[] doubleArray21 = new double[] {};
        double[] doubleArray22 = new double[] {};
        org.apache.commons.math.ode.DormandPrince853Integrator dormandPrince853Integrator23 = new org.apache.commons.math.ode.DormandPrince853Integrator((double) 1.0f, (double) 1.0f, doubleArray21, doubleArray22);
        org.apache.commons.math.ode.DormandPrince853Integrator dormandPrince853Integrator24 = new org.apache.commons.math.ode.DormandPrince853Integrator(3.1622776601683795d, (double) ' ', doubleArray16, doubleArray21);
        double[] doubleArray31 = new double[] {};
        double[] doubleArray32 = new double[] {};
        org.apache.commons.math.ode.DormandPrince853Integrator dormandPrince853Integrator33 = new org.apache.commons.math.ode.DormandPrince853Integrator((double) 1.0f, (double) 1.0f, doubleArray31, doubleArray32);
        double[] doubleArray38 = new double[] {};
        double[] doubleArray39 = new double[] {};
        org.apache.commons.math.ode.DormandPrince853Integrator dormandPrince853Integrator40 = new org.apache.commons.math.ode.DormandPrince853Integrator((double) 1.0f, (double) 1.0f, doubleArray38, doubleArray39);
        double[] doubleArray43 = new double[] {};
        double[] doubleArray44 = new double[] {};
        org.apache.commons.math.ode.DormandPrince853Integrator dormandPrince853Integrator45 = new org.apache.commons.math.ode.DormandPrince853Integrator((double) 1.0f, (double) 1.0f, doubleArray43, doubleArray44);
        org.apache.commons.math.ode.DormandPrince853Integrator dormandPrince853Integrator46 = new org.apache.commons.math.ode.DormandPrince853Integrator((double) ' ', (double) 'a', doubleArray39, doubleArray44);
        org.apache.commons.math.ode.DormandPrince853Integrator dormandPrince853Integrator47 = new org.apache.commons.math.ode.DormandPrince853Integrator(0.9d, (double) 1L, doubleArray31, doubleArray44);
        double[] doubleArray52 = new double[] {};
        double[] doubleArray53 = new double[] {};
        org.apache.commons.math.ode.DormandPrince853Integrator dormandPrince853Integrator54 = new org.apache.commons.math.ode.DormandPrince853Integrator((double) 1.0f, (double) 1.0f, doubleArray52, doubleArray53);
        double[] doubleArray59 = new double[] {};
        double[] doubleArray60 = new double[] {};
        org.apache.commons.math.ode.DormandPrince853Integrator dormandPrince853Integrator61 = new org.apache.commons.math.ode.DormandPrince853Integrator((double) 1.0f, (double) 1.0f, doubleArray59, doubleArray60);
        double[] doubleArray64 = new double[] {};
        double[] doubleArray65 = new double[] {};
        org.apache.commons.math.ode.DormandPrince853Integrator dormandPrince853Integrator66 = new org.apache.commons.math.ode.DormandPrince853Integrator((double) 1.0f, (double) 1.0f, doubleArray64, doubleArray65);
        org.apache.commons.math.ode.DormandPrince853Integrator dormandPrince853Integrator67 = new org.apache.commons.math.ode.DormandPrince853Integrator((double) ' ', (double) 'a', doubleArray60, doubleArray65);
        org.apache.commons.math.ode.DormandPrince853Integrator dormandPrince853Integrator68 = new org.apache.commons.math.ode.DormandPrince853Integrator(0.9d, (double) 1L, doubleArray52, doubleArray65);
        org.apache.commons.math.ode.DormandPrince853Integrator dormandPrince853Integrator69 = new org.apache.commons.math.ode.DormandPrince853Integrator((double) 10L, (double) (byte) -1, doubleArray31, doubleArray65);
        org.apache.commons.math.ode.DormandPrince853Integrator dormandPrince853Integrator70 = new org.apache.commons.math.ode.DormandPrince853Integrator((double) (short) 1, 0.9d, doubleArray21, doubleArray31);
        double[] doubleArray77 = new double[] {};
        double[] doubleArray78 = new double[] {};
        org.apache.commons.math.ode.DormandPrince853Integrator dormandPrince853Integrator79 = new org.apache.commons.math.ode.DormandPrince853Integrator((double) 1.0f, (double) 1.0f, doubleArray77, doubleArray78);
        double[] doubleArray82 = new double[] {};
        double[] doubleArray83 = new double[] {};
        org.apache.commons.math.ode.DormandPrince853Integrator dormandPrince853Integrator84 = new org.apache.commons.math.ode.DormandPrince853Integrator((double) 1.0f, (double) 1.0f, doubleArray82, doubleArray83);
        org.apache.commons.math.ode.DormandPrince853Integrator dormandPrince853Integrator85 = new org.apache.commons.math.ode.DormandPrince853Integrator((double) ' ', (double) 'a', doubleArray78, doubleArray83);
        double[] doubleArray88 = new double[] {};
        double[] doubleArray89 = new double[] {};
        org.apache.commons.math.ode.DormandPrince853Integrator dormandPrince853Integrator90 = new org.apache.commons.math.ode.DormandPrince853Integrator((double) 1.0f, (double) 1.0f, doubleArray88, doubleArray89);
        org.apache.commons.math.ode.DormandPrince853Integrator dormandPrince853Integrator91 = new org.apache.commons.math.ode.DormandPrince853Integrator(3.1622776601683795d, (double) ' ', doubleArray83, doubleArray88);
        org.apache.commons.math.ode.DormandPrince853Integrator dormandPrince853Integrator92 = new org.apache.commons.math.ode.DormandPrince853Integrator(10.059467437463484d, (double) 0, doubleArray21, doubleArray88);
        double double93 = dormandPrince853Integrator92.getMaxGrowth();
        dormandPrince853Integrator92.setMinReduction((double) 'a');
        int int96 = dormandPrince853Integrator92.getOrder();
        double double97 = dormandPrince853Integrator92.getMinReduction();
        org.junit.Assert.assertNotNull(doubleArray10);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray10), "[]");
        org.junit.Assert.assertNotNull(doubleArray11);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray11), "[]");
        org.junit.Assert.assertNotNull(doubleArray15);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray15), "[]");
        org.junit.Assert.assertNotNull(doubleArray16);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray16), "[]");
        org.junit.Assert.assertNotNull(doubleArray21);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray21), "[]");
        org.junit.Assert.assertNotNull(doubleArray22);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray22), "[]");
        org.junit.Assert.assertNotNull(doubleArray31);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray31), "[]");
        org.junit.Assert.assertNotNull(doubleArray32);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray32), "[]");
        org.junit.Assert.assertNotNull(doubleArray38);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray38), "[]");
        org.junit.Assert.assertNotNull(doubleArray39);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray39), "[]");
        org.junit.Assert.assertNotNull(doubleArray43);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray43), "[]");
        org.junit.Assert.assertNotNull(doubleArray44);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray44), "[]");
        org.junit.Assert.assertNotNull(doubleArray52);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray52), "[]");
        org.junit.Assert.assertNotNull(doubleArray53);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray53), "[]");
        org.junit.Assert.assertNotNull(doubleArray59);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray59), "[]");
        org.junit.Assert.assertNotNull(doubleArray60);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray60), "[]");
        org.junit.Assert.assertNotNull(doubleArray64);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray64), "[]");
        org.junit.Assert.assertNotNull(doubleArray65);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray65), "[]");
        org.junit.Assert.assertNotNull(doubleArray77);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray77), "[]");
        org.junit.Assert.assertNotNull(doubleArray78);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray78), "[]");
        org.junit.Assert.assertNotNull(doubleArray82);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray82), "[]");
        org.junit.Assert.assertNotNull(doubleArray83);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray83), "[]");
        org.junit.Assert.assertNotNull(doubleArray88);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray88), "[]");
        org.junit.Assert.assertNotNull(doubleArray89);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray89), "[]");
        org.junit.Assert.assertTrue("'" + double93 + "' != '" + 10.0d + "'", double93 == 10.0d);
        org.junit.Assert.assertTrue("'" + int96 + "' != '" + 8 + "'", int96 == 8);
        org.junit.Assert.assertTrue("'" + double97 + "' != '" + 97.0d + "'", double97 == 97.0d);
    }

    @Test
    public void test15528() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest31.test15528");
        org.apache.commons.math.ode.DormandPrince853Integrator dormandPrince853Integrator4 = new org.apache.commons.math.ode.DormandPrince853Integrator((double) 'a', 98.48857801796105d, 9.485494822646622d, (double) '#');
        double double5 = dormandPrince853Integrator4.getCurrentSignedStepsize();
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 97.74145521600454d + "'", double5 == 97.74145521600454d);
    }

    @Test
    public void test15529() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest31.test15529");
        org.apache.commons.math.ode.DormandPrince853Integrator dormandPrince853Integrator4 = new org.apache.commons.math.ode.DormandPrince853Integrator(1.0d, (double) (byte) 10, (double) (short) 1, (double) 0L);
        double double5 = dormandPrince853Integrator4.getMinStep();
        org.apache.commons.math.ode.SwitchingFunction switchingFunction6 = null;
        dormandPrince853Integrator4.addSwitchingFunction(switchingFunction6, (double) 10, (double) 10L, (-1));
        dormandPrince853Integrator4.setMaxGrowth((double) 100.0f);
        dormandPrince853Integrator4.setMaxGrowth((double) 'a');
        double double15 = dormandPrince853Integrator4.getMaxStep();
        double double16 = dormandPrince853Integrator4.getMinStep();
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 1.0d + "'", double5 == 1.0d);
        org.junit.Assert.assertTrue("'" + double15 + "' != '" + 10.0d + "'", double15 == 10.0d);
        org.junit.Assert.assertTrue("'" + double16 + "' != '" + 1.0d + "'", double16 == 1.0d);
    }

    @Test
    public void test15530() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest31.test15530");
        org.apache.commons.math.ode.DormandPrince853Integrator dormandPrince853Integrator4 = new org.apache.commons.math.ode.DormandPrince853Integrator(3.7470125727948562d, 18.1550495783196d, (double) (short) 1, (double) 10L);
    }

    @Test
    public void test15531() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest31.test15531");
        java.lang.String[] strArray4 = new java.lang.String[] {};
        org.apache.commons.math.ode.DerivativeException derivativeException5 = new org.apache.commons.math.ode.DerivativeException("Dormand-Prince 8 (5, 3)", strArray4);
        org.apache.commons.math.ode.DerivativeException derivativeException6 = new org.apache.commons.math.ode.DerivativeException("org.apache.commons.math.ode.IntegratorException: Dormand-Prince 8 (5, 3)", strArray4);
        org.apache.commons.math.ode.DerivativeException derivativeException7 = new org.apache.commons.math.ode.DerivativeException("org.apache.commons.math.ode.DerivativeException: Dormand-Prince 8 (5, 3)", strArray4);
        org.apache.commons.math.ode.IntegratorException integratorException8 = new org.apache.commons.math.ode.IntegratorException("", (java.lang.Object[]) strArray4);
        org.apache.commons.math.ode.IntegratorException integratorException9 = new org.apache.commons.math.ode.IntegratorException((java.lang.Throwable) integratorException8);
        java.lang.Throwable[] throwableArray10 = integratorException9.getSuppressed();
        org.junit.Assert.assertNotNull(strArray4);
        org.junit.Assert.assertNotNull(throwableArray10);
    }

    @Test
    public void test15532() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest31.test15532");
        org.apache.commons.math.ode.DormandPrince853Integrator dormandPrince853Integrator4 = new org.apache.commons.math.ode.DormandPrince853Integrator(0.0d, (double) (short) 0, (double) (-1.0f), (double) (short) -1);
        int int5 = dormandPrince853Integrator4.getOrder();
        org.apache.commons.math.ode.DormandPrince853Integrator dormandPrince853Integrator10 = new org.apache.commons.math.ode.DormandPrince853Integrator((double) 10, (double) (byte) 10, (double) (short) 100, (double) 1);
        dormandPrince853Integrator10.setSafety((double) '#');
        org.apache.commons.math.ode.StepHandler stepHandler13 = null;
        dormandPrince853Integrator10.setStepHandler(stepHandler13);
        dormandPrince853Integrator10.setMaxGrowth((double) (-1));
        org.apache.commons.math.ode.DormandPrince853Integrator dormandPrince853Integrator21 = new org.apache.commons.math.ode.DormandPrince853Integrator((double) 10, (double) (byte) 10, (double) (short) 100, (double) 1);
        double double22 = dormandPrince853Integrator21.getSafety();
        double double23 = dormandPrince853Integrator21.getMinStep();
        dormandPrince853Integrator21.setSafety((double) '#');
        double double26 = dormandPrince853Integrator21.getCurrentStepStart();
        double double27 = dormandPrince853Integrator21.getMaxStep();
        dormandPrince853Integrator21.setMinReduction((double) (short) 10);
        int int30 = dormandPrince853Integrator21.getOrder();
        org.apache.commons.math.ode.SwitchingFunction switchingFunction31 = null;
        dormandPrince853Integrator21.addSwitchingFunction(switchingFunction31, (double) 1.0f, 0.0d, (int) '#');
        org.apache.commons.math.ode.DormandPrince853Integrator dormandPrince853Integrator40 = new org.apache.commons.math.ode.DormandPrince853Integrator((double) (byte) 10, (double) ' ', 0.0d, (double) (short) 1);
        org.apache.commons.math.ode.StepHandler stepHandler41 = dormandPrince853Integrator40.getStepHandler();
        dormandPrince853Integrator21.setStepHandler(stepHandler41);
        dormandPrince853Integrator10.setStepHandler(stepHandler41);
        dormandPrince853Integrator4.setStepHandler(stepHandler41);
        org.apache.commons.math.ode.StepHandler stepHandler45 = dormandPrince853Integrator4.getStepHandler();
        double double46 = dormandPrince853Integrator4.getCurrentSignedStepsize();
        java.lang.String str47 = dormandPrince853Integrator4.getName();
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 8 + "'", int5 == 8);
        org.junit.Assert.assertTrue("'" + double22 + "' != '" + 0.9d + "'", double22 == 0.9d);
        org.junit.Assert.assertTrue("'" + double23 + "' != '" + 10.0d + "'", double23 == 10.0d);
        org.junit.Assert.assertTrue(Double.isNaN(double26));
        org.junit.Assert.assertTrue("'" + double27 + "' != '" + 10.0d + "'", double27 == 10.0d);
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 8 + "'", int30 == 8);
        org.junit.Assert.assertNotNull(stepHandler41);
        org.junit.Assert.assertNotNull(stepHandler45);
        org.junit.Assert.assertTrue("'" + double46 + "' != '" + 0.0d + "'", double46 == 0.0d);
        org.junit.Assert.assertEquals("'" + str47 + "' != '" + "Dormand-Prince 8 (5, 3)" + "'", str47, "Dormand-Prince 8 (5, 3)");
    }

    @Test
    public void test15533() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest31.test15533");
        java.lang.String[] strArray7 = new java.lang.String[] {};
        org.apache.commons.math.ode.DerivativeException derivativeException8 = new org.apache.commons.math.ode.DerivativeException("Dormand-Prince 8 (5, 3)", strArray7);
        org.apache.commons.math.ode.DerivativeException derivativeException9 = new org.apache.commons.math.ode.DerivativeException("hi!", strArray7);
        org.apache.commons.math.ode.DerivativeException derivativeException10 = new org.apache.commons.math.ode.DerivativeException("hi!", strArray7);
        org.apache.commons.math.ode.DerivativeException derivativeException11 = new org.apache.commons.math.ode.DerivativeException("hi!", strArray7);
        org.apache.commons.math.ode.DerivativeException derivativeException12 = new org.apache.commons.math.ode.DerivativeException("", strArray7);
        org.apache.commons.math.ode.DerivativeException derivativeException13 = new org.apache.commons.math.ode.DerivativeException("Dormand-Prince 8 (5, 3)", strArray7);
        org.apache.commons.math.ode.DerivativeException derivativeException14 = new org.apache.commons.math.ode.DerivativeException("Dormand-Prince 8 (5, 3)", strArray7);
        java.lang.String str15 = derivativeException14.getPattern();
        org.apache.commons.math.ode.IntegratorException integratorException16 = new org.apache.commons.math.ode.IntegratorException((java.lang.Throwable) derivativeException14);
        org.apache.commons.math.ode.IntegratorException integratorException17 = new org.apache.commons.math.ode.IntegratorException((java.lang.Throwable) derivativeException14);
        java.lang.String str18 = derivativeException14.getPattern();
        java.lang.Throwable[] throwableArray19 = derivativeException14.getSuppressed();
        org.junit.Assert.assertNotNull(strArray7);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "Dormand-Prince 8 (5, 3)" + "'", str15, "Dormand-Prince 8 (5, 3)");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "Dormand-Prince 8 (5, 3)" + "'", str18, "Dormand-Prince 8 (5, 3)");
        org.junit.Assert.assertNotNull(throwableArray19);
    }

    @Test
    public void test15534() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest31.test15534");
        org.apache.commons.math.ode.DormandPrince853Integrator dormandPrince853Integrator4 = new org.apache.commons.math.ode.DormandPrince853Integrator((double) 10, (double) (byte) 10, (double) (short) 100, (double) 1);
        double double5 = dormandPrince853Integrator4.getMinStep();
        org.apache.commons.math.ode.DormandPrince853Integrator dormandPrince853Integrator10 = new org.apache.commons.math.ode.DormandPrince853Integrator((double) 10, (double) (byte) 10, (double) (short) 100, (double) 1);
        double double11 = dormandPrince853Integrator10.getSafety();
        double double12 = dormandPrince853Integrator10.getMinStep();
        dormandPrince853Integrator10.setSafety((double) '#');
        double double15 = dormandPrince853Integrator10.getCurrentStepStart();
        double double16 = dormandPrince853Integrator10.getMaxStep();
        org.apache.commons.math.ode.StepHandler stepHandler17 = dormandPrince853Integrator10.getStepHandler();
        dormandPrince853Integrator4.setStepHandler(stepHandler17);
        org.apache.commons.math.ode.SwitchingFunction switchingFunction19 = null;
        dormandPrince853Integrator4.addSwitchingFunction(switchingFunction19, (double) (short) 0, 35.0d, 10);
        org.apache.commons.math.ode.StepHandler stepHandler24 = dormandPrince853Integrator4.getStepHandler();
        double double25 = dormandPrince853Integrator4.getMinReduction();
        java.lang.String str26 = dormandPrince853Integrator4.getName();
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 10.0d + "'", double5 == 10.0d);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 0.9d + "'", double11 == 0.9d);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 10.0d + "'", double12 == 10.0d);
        org.junit.Assert.assertTrue(Double.isNaN(double15));
        org.junit.Assert.assertTrue("'" + double16 + "' != '" + 10.0d + "'", double16 == 10.0d);
        org.junit.Assert.assertNotNull(stepHandler17);
        org.junit.Assert.assertNotNull(stepHandler24);
        org.junit.Assert.assertTrue("'" + double25 + "' != '" + 0.2d + "'", double25 == 0.2d);
        org.junit.Assert.assertEquals("'" + str26 + "' != '" + "Dormand-Prince 8 (5, 3)" + "'", str26, "Dormand-Prince 8 (5, 3)");
    }

    @Test
    public void test15535() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest31.test15535");
        org.apache.commons.math.ode.DormandPrince853Integrator dormandPrince853Integrator4 = new org.apache.commons.math.ode.DormandPrince853Integrator((double) (byte) -1, (double) (-1.0f), (double) 10.0f, 0.0d);
        org.apache.commons.math.ode.StepHandler stepHandler5 = dormandPrince853Integrator4.getStepHandler();
        dormandPrince853Integrator4.setMinReduction((double) (short) -1);
        double double8 = dormandPrince853Integrator4.getCurrentSignedStepsize();
        double double9 = dormandPrince853Integrator4.getSafety();
        org.apache.commons.math.ode.DormandPrince853Integrator dormandPrince853Integrator14 = new org.apache.commons.math.ode.DormandPrince853Integrator((double) 10, (double) (byte) 10, (double) (short) 100, (double) 1);
        dormandPrince853Integrator14.setSafety((double) '#');
        dormandPrince853Integrator14.setMaxGrowth((double) 100.0f);
        java.lang.String str19 = dormandPrince853Integrator14.getName();
        double double20 = dormandPrince853Integrator14.getSafety();
        dormandPrince853Integrator14.setMaxGrowth((double) 0.0f);
        double double23 = dormandPrince853Integrator14.getMinStep();
        double double24 = dormandPrince853Integrator14.getSafety();
        double double25 = dormandPrince853Integrator14.getMinReduction();
        dormandPrince853Integrator14.setMinReduction((double) 1);
        org.apache.commons.math.ode.DormandPrince853Integrator dormandPrince853Integrator32 = new org.apache.commons.math.ode.DormandPrince853Integrator((double) 10, (double) (byte) 10, (double) (short) 100, (double) 1);
        double double33 = dormandPrince853Integrator32.getSafety();
        double double34 = dormandPrince853Integrator32.getMinStep();
        java.lang.String str35 = dormandPrince853Integrator32.getName();
        double double36 = dormandPrince853Integrator32.getMaxGrowth();
        double double37 = dormandPrince853Integrator32.getMinStep();
        double double38 = dormandPrince853Integrator32.getSafety();
        org.apache.commons.math.ode.StepHandler stepHandler39 = dormandPrince853Integrator32.getStepHandler();
        dormandPrince853Integrator14.setStepHandler(stepHandler39);
        dormandPrince853Integrator4.setStepHandler(stepHandler39);
        org.junit.Assert.assertNotNull(stepHandler5);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 1.0d + "'", double8 == 1.0d);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 0.9d + "'", double9 == 0.9d);
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "Dormand-Prince 8 (5, 3)" + "'", str19, "Dormand-Prince 8 (5, 3)");
        org.junit.Assert.assertTrue("'" + double20 + "' != '" + 35.0d + "'", double20 == 35.0d);
        org.junit.Assert.assertTrue("'" + double23 + "' != '" + 10.0d + "'", double23 == 10.0d);
        org.junit.Assert.assertTrue("'" + double24 + "' != '" + 35.0d + "'", double24 == 35.0d);
        org.junit.Assert.assertTrue("'" + double25 + "' != '" + 0.2d + "'", double25 == 0.2d);
        org.junit.Assert.assertTrue("'" + double33 + "' != '" + 0.9d + "'", double33 == 0.9d);
        org.junit.Assert.assertTrue("'" + double34 + "' != '" + 10.0d + "'", double34 == 10.0d);
        org.junit.Assert.assertEquals("'" + str35 + "' != '" + "Dormand-Prince 8 (5, 3)" + "'", str35, "Dormand-Prince 8 (5, 3)");
        org.junit.Assert.assertTrue("'" + double36 + "' != '" + 10.0d + "'", double36 == 10.0d);
        org.junit.Assert.assertTrue("'" + double37 + "' != '" + 10.0d + "'", double37 == 10.0d);
        org.junit.Assert.assertTrue("'" + double38 + "' != '" + 0.9d + "'", double38 == 0.9d);
        org.junit.Assert.assertNotNull(stepHandler39);
    }

    @Test
    public void test15536() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest31.test15536");
        java.lang.String[] strArray12 = new java.lang.String[] {};
        org.apache.commons.math.ode.DerivativeException derivativeException13 = new org.apache.commons.math.ode.DerivativeException("Dormand-Prince 8 (5, 3)", strArray12);
        org.apache.commons.math.ode.DerivativeException derivativeException14 = new org.apache.commons.math.ode.DerivativeException("org.apache.commons.math.ode.IntegratorException: Dormand-Prince 8 (5, 3)", strArray12);
        org.apache.commons.math.ode.IntegratorException integratorException15 = new org.apache.commons.math.ode.IntegratorException("hi!", (java.lang.Object[]) strArray12);
        org.apache.commons.math.ode.DerivativeException derivativeException16 = new org.apache.commons.math.ode.DerivativeException("org.apache.commons.math.ode.IntegratorException: Dormand-Prince 8 (5, 3)", strArray12);
        org.apache.commons.math.ode.DerivativeException derivativeException17 = new org.apache.commons.math.ode.DerivativeException("org.apache.commons.math.ode.DerivativeException: Dormand-Prince 8 (5, 3)", strArray12);
        org.apache.commons.math.ode.DerivativeException derivativeException18 = new org.apache.commons.math.ode.DerivativeException("Dormand-Prince 8 (5, 3)", strArray12);
        org.apache.commons.math.ode.IntegratorException integratorException19 = new org.apache.commons.math.ode.IntegratorException("Dormand-Prince 8 (5, 3)", (java.lang.Object[]) strArray12);
        org.apache.commons.math.ode.DerivativeException derivativeException20 = new org.apache.commons.math.ode.DerivativeException("org.apache.commons.math.ode.IntegratorException: org.apache.commons.math.ode.DerivativeException: org.apache.commons.math.ode.IntegratorException: Dormand-Prince 8 (5, 3)", strArray12);
        org.apache.commons.math.ode.DerivativeException derivativeException21 = new org.apache.commons.math.ode.DerivativeException("org.apache.commons.math.ode.IntegratorException: org.apache.commons.math.ode.IntegratorException: hi!", strArray12);
        org.apache.commons.math.ode.IntegratorException integratorException22 = new org.apache.commons.math.ode.IntegratorException("org.apache.commons.math.ode.IntegratorException: org.apache.commons.math.ode.IntegratorException: org.apache.commons.math.ode.DerivativeException: Dormand-Prince 8 (5, 3)", (java.lang.Object[]) strArray12);
        org.apache.commons.math.ode.DerivativeException derivativeException23 = new org.apache.commons.math.ode.DerivativeException("org.apache.commons.math.ode.IntegratorException: org.apache.commons.math.ode.DerivativeException: org.apache.commons.math.ode.IntegratorException", strArray12);
        org.apache.commons.math.ode.DerivativeException derivativeException24 = new org.apache.commons.math.ode.DerivativeException("org.apache.commons.math.ode.DerivativeException: org.apache.commons.math.ode.IntegratorException: ", strArray12);
        org.junit.Assert.assertNotNull(strArray12);
    }

    @Test
    public void test15537() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest31.test15537");
        org.apache.commons.math.ode.DormandPrince853Integrator dormandPrince853Integrator4 = new org.apache.commons.math.ode.DormandPrince853Integrator(0.2d, 0.9486832980505138d, (double) (byte) 0, (double) 10L);
        dormandPrince853Integrator4.setSafety((double) (-1L));
        java.lang.String str7 = dormandPrince853Integrator4.getName();
        double double8 = dormandPrince853Integrator4.getCurrentSignedStepsize();
        double double9 = dormandPrince853Integrator4.getCurrentSignedStepsize();
        java.lang.String str10 = dormandPrince853Integrator4.getName();
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "Dormand-Prince 8 (5, 3)" + "'", str7, "Dormand-Prince 8 (5, 3)");
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 0.43558771746928626d + "'", double8 == 0.43558771746928626d);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 0.43558771746928626d + "'", double9 == 0.43558771746928626d);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "Dormand-Prince 8 (5, 3)" + "'", str10, "Dormand-Prince 8 (5, 3)");
    }

    @Test
    public void test15538() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest31.test15538");
        org.apache.commons.math.ode.DormandPrince853Integrator dormandPrince853Integrator4 = new org.apache.commons.math.ode.DormandPrince853Integrator((double) 10, (double) (byte) 10, (double) (short) 100, (double) 1);
        double double5 = dormandPrince853Integrator4.getSafety();
        int int6 = dormandPrince853Integrator4.getOrder();
        double double7 = dormandPrince853Integrator4.getSafety();
        dormandPrince853Integrator4.setSafety((double) (short) -1);
        double double10 = dormandPrince853Integrator4.getMinStep();
        java.lang.String str11 = dormandPrince853Integrator4.getName();
        org.apache.commons.math.ode.DormandPrince853Integrator dormandPrince853Integrator16 = new org.apache.commons.math.ode.DormandPrince853Integrator((double) 0L, (double) 'a', (-1.0d), 0.0d);
        dormandPrince853Integrator16.setMinReduction((double) 1);
        dormandPrince853Integrator16.setMinReduction((double) (byte) 10);
        org.apache.commons.math.ode.DormandPrince853Integrator dormandPrince853Integrator25 = new org.apache.commons.math.ode.DormandPrince853Integrator(1.0d, (double) (byte) 10, (double) (short) 1, (double) 0L);
        int int26 = dormandPrince853Integrator25.getOrder();
        double double27 = dormandPrince853Integrator25.getSafety();
        dormandPrince853Integrator25.setSafety((double) (-1));
        org.apache.commons.math.ode.DormandPrince853Integrator dormandPrince853Integrator34 = new org.apache.commons.math.ode.DormandPrince853Integrator((double) 10, (double) (byte) 10, (double) (short) 100, (double) 1);
        double double35 = dormandPrince853Integrator34.getSafety();
        dormandPrince853Integrator34.setInitialStepSize((double) 0.0f);
        int int38 = dormandPrince853Integrator34.getOrder();
        org.apache.commons.math.ode.DormandPrince853Integrator dormandPrince853Integrator43 = new org.apache.commons.math.ode.DormandPrince853Integrator((double) 10, (double) (byte) 10, (double) (short) 100, (double) 1);
        double double44 = dormandPrince853Integrator43.getSafety();
        double double45 = dormandPrince853Integrator43.getMinStep();
        double double46 = dormandPrince853Integrator43.getMinStep();
        double double47 = dormandPrince853Integrator43.getCurrentSignedStepsize();
        int int48 = dormandPrince853Integrator43.getOrder();
        double double49 = dormandPrince853Integrator43.getMaxGrowth();
        org.apache.commons.math.ode.StepHandler stepHandler50 = dormandPrince853Integrator43.getStepHandler();
        dormandPrince853Integrator34.setStepHandler(stepHandler50);
        dormandPrince853Integrator25.setStepHandler(stepHandler50);
        dormandPrince853Integrator16.setStepHandler(stepHandler50);
        dormandPrince853Integrator4.setStepHandler(stepHandler50);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.9d + "'", double5 == 0.9d);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 8 + "'", int6 == 8);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 0.9d + "'", double7 == 0.9d);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 10.0d + "'", double10 == 10.0d);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "Dormand-Prince 8 (5, 3)" + "'", str11, "Dormand-Prince 8 (5, 3)");
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + 8 + "'", int26 == 8);
        org.junit.Assert.assertTrue("'" + double27 + "' != '" + 0.9d + "'", double27 == 0.9d);
        org.junit.Assert.assertTrue("'" + double35 + "' != '" + 0.9d + "'", double35 == 0.9d);
        org.junit.Assert.assertTrue("'" + int38 + "' != '" + 8 + "'", int38 == 8);
        org.junit.Assert.assertTrue("'" + double44 + "' != '" + 0.9d + "'", double44 == 0.9d);
        org.junit.Assert.assertTrue("'" + double45 + "' != '" + 10.0d + "'", double45 == 10.0d);
        org.junit.Assert.assertTrue("'" + double46 + "' != '" + 10.0d + "'", double46 == 10.0d);
        org.junit.Assert.assertTrue("'" + double47 + "' != '" + 10.0d + "'", double47 == 10.0d);
        org.junit.Assert.assertTrue("'" + int48 + "' != '" + 8 + "'", int48 == 8);
        org.junit.Assert.assertTrue("'" + double49 + "' != '" + 10.0d + "'", double49 == 10.0d);
        org.junit.Assert.assertNotNull(stepHandler50);
    }

    @Test
    public void test15539() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest31.test15539");
        org.apache.commons.math.ode.DormandPrince853Integrator dormandPrince853Integrator4 = new org.apache.commons.math.ode.DormandPrince853Integrator((double) 10, (double) (byte) 10, (double) (short) 100, (double) 1);
        double double5 = dormandPrince853Integrator4.getSafety();
        dormandPrince853Integrator4.setMinReduction((double) (short) -1);
        dormandPrince853Integrator4.setInitialStepSize((double) (byte) 1);
        java.lang.String str10 = dormandPrince853Integrator4.getName();
        double double11 = dormandPrince853Integrator4.getCurrentSignedStepsize();
        dormandPrince853Integrator4.setMinReduction(8.378574825315678d);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.9d + "'", double5 == 0.9d);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "Dormand-Prince 8 (5, 3)" + "'", str10, "Dormand-Prince 8 (5, 3)");
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 10.0d + "'", double11 == 10.0d);
    }

    @Test
    public void test15540() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest31.test15540");
        org.apache.commons.math.ode.DormandPrince853Integrator dormandPrince853Integrator4 = new org.apache.commons.math.ode.DormandPrince853Integrator((double) 0, (double) (short) 0, (double) 10.0f, (double) 10.0f);
        org.apache.commons.math.ode.SwitchingFunction switchingFunction5 = null;
        dormandPrince853Integrator4.addSwitchingFunction(switchingFunction5, 0.9d, 0.9d, 0);
        double double10 = dormandPrince853Integrator4.getCurrentStepStart();
        double double11 = dormandPrince853Integrator4.getMaxGrowth();
        java.lang.String str12 = dormandPrince853Integrator4.getName();
        dormandPrince853Integrator4.setSafety(17.88854381999832d);
        org.apache.commons.math.ode.DormandPrince853Integrator dormandPrince853Integrator19 = new org.apache.commons.math.ode.DormandPrince853Integrator(16.0d, (double) 'a', Double.NaN, (double) 0L);
        org.apache.commons.math.ode.DormandPrince853Integrator dormandPrince853Integrator24 = new org.apache.commons.math.ode.DormandPrince853Integrator((double) (-1.0f), (double) (byte) 100, (double) (-1L), (double) (byte) -1);
        double double25 = dormandPrince853Integrator24.getMaxStep();
        double double26 = dormandPrince853Integrator24.getCurrentSignedStepsize();
        double double27 = dormandPrince853Integrator24.getCurrentSignedStepsize();
        java.lang.String str28 = dormandPrince853Integrator24.getName();
        org.apache.commons.math.ode.StepHandler stepHandler29 = dormandPrince853Integrator24.getStepHandler();
        dormandPrince853Integrator19.setStepHandler(stepHandler29);
        dormandPrince853Integrator4.setStepHandler(stepHandler29);
        org.junit.Assert.assertTrue(Double.isNaN(double10));
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 10.0d + "'", double11 == 10.0d);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "Dormand-Prince 8 (5, 3)" + "'", str12, "Dormand-Prince 8 (5, 3)");
        org.junit.Assert.assertTrue("'" + double25 + "' != '" + 100.0d + "'", double25 == 100.0d);
        org.junit.Assert.assertTrue(Double.isNaN(double26));
        org.junit.Assert.assertTrue(Double.isNaN(double27));
        org.junit.Assert.assertEquals("'" + str28 + "' != '" + "Dormand-Prince 8 (5, 3)" + "'", str28, "Dormand-Prince 8 (5, 3)");
        org.junit.Assert.assertNotNull(stepHandler29);
    }

    @Test
    public void test15541() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest31.test15541");
        double[] doubleArray6 = new double[] {};
        double[] doubleArray7 = new double[] {};
        org.apache.commons.math.ode.DormandPrince853Integrator dormandPrince853Integrator8 = new org.apache.commons.math.ode.DormandPrince853Integrator((double) 1.0f, (double) 1.0f, doubleArray6, doubleArray7);
        double[] doubleArray13 = new double[] {};
        double[] doubleArray14 = new double[] {};
        org.apache.commons.math.ode.DormandPrince853Integrator dormandPrince853Integrator15 = new org.apache.commons.math.ode.DormandPrince853Integrator((double) 1.0f, (double) 1.0f, doubleArray13, doubleArray14);
        double[] doubleArray18 = new double[] {};
        double[] doubleArray19 = new double[] {};
        org.apache.commons.math.ode.DormandPrince853Integrator dormandPrince853Integrator20 = new org.apache.commons.math.ode.DormandPrince853Integrator((double) 1.0f, (double) 1.0f, doubleArray18, doubleArray19);
        org.apache.commons.math.ode.DormandPrince853Integrator dormandPrince853Integrator21 = new org.apache.commons.math.ode.DormandPrince853Integrator((double) ' ', (double) 'a', doubleArray14, doubleArray19);
        org.apache.commons.math.ode.DormandPrince853Integrator dormandPrince853Integrator22 = new org.apache.commons.math.ode.DormandPrince853Integrator(0.9d, (double) 1L, doubleArray6, doubleArray19);
        double[] doubleArray27 = new double[] {};
        double[] doubleArray28 = new double[] {};
        org.apache.commons.math.ode.DormandPrince853Integrator dormandPrince853Integrator29 = new org.apache.commons.math.ode.DormandPrince853Integrator((double) 1.0f, (double) 1.0f, doubleArray27, doubleArray28);
        double[] doubleArray34 = new double[] {};
        double[] doubleArray35 = new double[] {};
        org.apache.commons.math.ode.DormandPrince853Integrator dormandPrince853Integrator36 = new org.apache.commons.math.ode.DormandPrince853Integrator((double) 1.0f, (double) 1.0f, doubleArray34, doubleArray35);
        double[] doubleArray39 = new double[] {};
        double[] doubleArray40 = new double[] {};
        org.apache.commons.math.ode.DormandPrince853Integrator dormandPrince853Integrator41 = new org.apache.commons.math.ode.DormandPrince853Integrator((double) 1.0f, (double) 1.0f, doubleArray39, doubleArray40);
        org.apache.commons.math.ode.DormandPrince853Integrator dormandPrince853Integrator42 = new org.apache.commons.math.ode.DormandPrince853Integrator((double) ' ', (double) 'a', doubleArray35, doubleArray40);
        org.apache.commons.math.ode.DormandPrince853Integrator dormandPrince853Integrator43 = new org.apache.commons.math.ode.DormandPrince853Integrator(0.9d, (double) 1L, doubleArray27, doubleArray40);
        org.apache.commons.math.ode.DormandPrince853Integrator dormandPrince853Integrator44 = new org.apache.commons.math.ode.DormandPrince853Integrator((double) 100L, (double) (byte) 100, doubleArray19, doubleArray40);
        dormandPrince853Integrator44.setSafety((double) (-1L));
        java.lang.String str47 = dormandPrince853Integrator44.getName();
        int int48 = dormandPrince853Integrator44.getOrder();
        org.apache.commons.math.ode.SwitchingFunction switchingFunction49 = null;
        dormandPrince853Integrator44.addSwitchingFunction(switchingFunction49, (double) 10.0f, 0.0d, (int) (short) 100);
        double double54 = dormandPrince853Integrator44.getMinReduction();
        int int55 = dormandPrince853Integrator44.getOrder();
        double double56 = dormandPrince853Integrator44.getCurrentSignedStepsize();
        dormandPrince853Integrator44.setMinReduction((double) (short) 1);
        int int59 = dormandPrince853Integrator44.getOrder();
        double double60 = dormandPrince853Integrator44.getMinReduction();
        org.junit.Assert.assertNotNull(doubleArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray6), "[]");
        org.junit.Assert.assertNotNull(doubleArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray7), "[]");
        org.junit.Assert.assertNotNull(doubleArray13);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray13), "[]");
        org.junit.Assert.assertNotNull(doubleArray14);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray14), "[]");
        org.junit.Assert.assertNotNull(doubleArray18);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray18), "[]");
        org.junit.Assert.assertNotNull(doubleArray19);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray19), "[]");
        org.junit.Assert.assertNotNull(doubleArray27);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray27), "[]");
        org.junit.Assert.assertNotNull(doubleArray28);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray28), "[]");
        org.junit.Assert.assertNotNull(doubleArray34);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray34), "[]");
        org.junit.Assert.assertNotNull(doubleArray35);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray35), "[]");
        org.junit.Assert.assertNotNull(doubleArray39);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray39), "[]");
        org.junit.Assert.assertNotNull(doubleArray40);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray40), "[]");
        org.junit.Assert.assertEquals("'" + str47 + "' != '" + "Dormand-Prince 8 (5, 3)" + "'", str47, "Dormand-Prince 8 (5, 3)");
        org.junit.Assert.assertTrue("'" + int48 + "' != '" + 8 + "'", int48 == 8);
        org.junit.Assert.assertTrue("'" + double54 + "' != '" + 0.2d + "'", double54 == 0.2d);
        org.junit.Assert.assertTrue("'" + int55 + "' != '" + 8 + "'", int55 == 8);
        org.junit.Assert.assertTrue("'" + double56 + "' != '" + 100.0d + "'", double56 == 100.0d);
        org.junit.Assert.assertTrue("'" + int59 + "' != '" + 8 + "'", int59 == 8);
        org.junit.Assert.assertTrue("'" + double60 + "' != '" + 1.0d + "'", double60 == 1.0d);
    }

    @Test
    public void test15542() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest31.test15542");
        org.apache.commons.math.ode.DormandPrince853Integrator dormandPrince853Integrator4 = new org.apache.commons.math.ode.DormandPrince853Integrator((double) 100, 7.211102550927978d, 1.2988548708655048d, 17.55012902585341d);
        java.lang.String str5 = dormandPrince853Integrator4.getName();
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Dormand-Prince 8 (5, 3)" + "'", str5, "Dormand-Prince 8 (5, 3)");
    }

    @Test
    public void test15543() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest31.test15543");
        org.apache.commons.math.ode.DormandPrince853Integrator dormandPrince853Integrator4 = new org.apache.commons.math.ode.DormandPrince853Integrator(1.0d, (double) (byte) 10, (double) (short) 1, (double) 0L);
        org.apache.commons.math.ode.StepHandler stepHandler5 = null;
        dormandPrince853Integrator4.setStepHandler(stepHandler5);
        java.lang.String str7 = dormandPrince853Integrator4.getName();
        int int8 = dormandPrince853Integrator4.getOrder();
        int int9 = dormandPrince853Integrator4.getOrder();
        dormandPrince853Integrator4.setMaxGrowth((double) (short) 1);
        java.lang.String str12 = dormandPrince853Integrator4.getName();
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "Dormand-Prince 8 (5, 3)" + "'", str7, "Dormand-Prince 8 (5, 3)");
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 8 + "'", int8 == 8);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 8 + "'", int9 == 8);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "Dormand-Prince 8 (5, 3)" + "'", str12, "Dormand-Prince 8 (5, 3)");
    }

    @Test
    public void test15544() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest31.test15544");
        org.apache.commons.math.ode.DormandPrince853Integrator dormandPrince853Integrator4 = new org.apache.commons.math.ode.DormandPrince853Integrator((double) 10, (double) (byte) 10, (double) (short) 100, (double) 1);
        double double5 = dormandPrince853Integrator4.getSafety();
        double double6 = dormandPrince853Integrator4.getMinStep();
        double double7 = dormandPrince853Integrator4.getMinStep();
        double double8 = dormandPrince853Integrator4.getCurrentSignedStepsize();
        double double9 = dormandPrince853Integrator4.getMaxGrowth();
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.9d + "'", double5 == 0.9d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 10.0d + "'", double6 == 10.0d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 10.0d + "'", double7 == 10.0d);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 10.0d + "'", double8 == 10.0d);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 10.0d + "'", double9 == 10.0d);
    }

    @Test
    public void test15545() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest31.test15545");
        org.apache.commons.math.ode.DormandPrince853Integrator dormandPrince853Integrator4 = new org.apache.commons.math.ode.DormandPrince853Integrator((double) 10, (double) (byte) 10, (double) (short) 100, (double) 1);
        double double5 = dormandPrince853Integrator4.getSafety();
        int int6 = dormandPrince853Integrator4.getOrder();
        int int7 = dormandPrince853Integrator4.getOrder();
        double double8 = dormandPrince853Integrator4.getSafety();
        java.lang.String str9 = dormandPrince853Integrator4.getName();
        dormandPrince853Integrator4.setInitialStepSize((double) '#');
        org.apache.commons.math.ode.SwitchingFunction switchingFunction12 = null;
        dormandPrince853Integrator4.addSwitchingFunction(switchingFunction12, 97.0d, 31.622776601683793d, (int) 'a');
        org.apache.commons.math.ode.StepHandler stepHandler17 = null;
        dormandPrince853Integrator4.setStepHandler(stepHandler17);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.9d + "'", double5 == 0.9d);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 8 + "'", int6 == 8);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 8 + "'", int7 == 8);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 0.9d + "'", double8 == 0.9d);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "Dormand-Prince 8 (5, 3)" + "'", str9, "Dormand-Prince 8 (5, 3)");
    }

    @Test
    public void test15546() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest31.test15546");
        org.apache.commons.math.ode.DormandPrince853Integrator dormandPrince853Integrator4 = new org.apache.commons.math.ode.DormandPrince853Integrator((double) 10, (double) (byte) 10, (double) (short) 100, (double) 1);
        double double5 = dormandPrince853Integrator4.getSafety();
        double double6 = dormandPrince853Integrator4.getMinStep();
        double double7 = dormandPrince853Integrator4.getMinStep();
        double double8 = dormandPrince853Integrator4.getCurrentSignedStepsize();
        int int9 = dormandPrince853Integrator4.getOrder();
        double double10 = dormandPrince853Integrator4.getMaxGrowth();
        java.lang.String str11 = dormandPrince853Integrator4.getName();
        java.lang.String str12 = dormandPrince853Integrator4.getName();
        double double13 = dormandPrince853Integrator4.getMaxStep();
        org.apache.commons.math.ode.StepHandler stepHandler14 = dormandPrince853Integrator4.getStepHandler();
        dormandPrince853Integrator4.setMinReduction(31.622776601683793d);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.9d + "'", double5 == 0.9d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 10.0d + "'", double6 == 10.0d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 10.0d + "'", double7 == 10.0d);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 10.0d + "'", double8 == 10.0d);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 8 + "'", int9 == 8);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 10.0d + "'", double10 == 10.0d);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "Dormand-Prince 8 (5, 3)" + "'", str11, "Dormand-Prince 8 (5, 3)");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "Dormand-Prince 8 (5, 3)" + "'", str12, "Dormand-Prince 8 (5, 3)");
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 10.0d + "'", double13 == 10.0d);
        org.junit.Assert.assertNotNull(stepHandler14);
    }

    @Test
    public void test15547() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest31.test15547");
        java.lang.Throwable throwable0 = null;
        org.apache.commons.math.ode.IntegratorException integratorException1 = new org.apache.commons.math.ode.IntegratorException(throwable0);
        java.lang.String str2 = integratorException1.getPattern();
        org.apache.commons.math.ode.IntegratorException integratorException3 = new org.apache.commons.math.ode.IntegratorException((java.lang.Throwable) integratorException1);
        java.lang.Throwable[] throwableArray4 = integratorException1.getSuppressed();
        java.lang.Object[] objArray5 = integratorException1.getArguments();
        org.apache.commons.math.ode.DerivativeException derivativeException6 = new org.apache.commons.math.ode.DerivativeException((java.lang.Throwable) integratorException1);
        java.lang.Object[] objArray7 = derivativeException6.getArguments();
        org.apache.commons.math.ode.DerivativeException derivativeException8 = new org.apache.commons.math.ode.DerivativeException((java.lang.Throwable) derivativeException6);
        org.apache.commons.math.ode.DerivativeException derivativeException9 = new org.apache.commons.math.ode.DerivativeException((java.lang.Throwable) derivativeException6);
        java.lang.String str10 = derivativeException6.toString();
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNotNull(throwableArray4);
        org.junit.Assert.assertNotNull(objArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray5), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray5), "[]");
        org.junit.Assert.assertNotNull(objArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray7), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray7), "[]");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "org.apache.commons.math.ode.DerivativeException" + "'", str10, "org.apache.commons.math.ode.DerivativeException");
    }

    @Test
    public void test15548() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest31.test15548");
        java.lang.String[] strArray12 = new java.lang.String[] {};
        org.apache.commons.math.ode.DerivativeException derivativeException13 = new org.apache.commons.math.ode.DerivativeException("Dormand-Prince 8 (5, 3)", strArray12);
        org.apache.commons.math.ode.DerivativeException derivativeException14 = new org.apache.commons.math.ode.DerivativeException("org.apache.commons.math.ode.IntegratorException: Dormand-Prince 8 (5, 3)", strArray12);
        org.apache.commons.math.ode.IntegratorException integratorException15 = new org.apache.commons.math.ode.IntegratorException("hi!", (java.lang.Object[]) strArray12);
        org.apache.commons.math.ode.DerivativeException derivativeException16 = new org.apache.commons.math.ode.DerivativeException("org.apache.commons.math.ode.IntegratorException: Dormand-Prince 8 (5, 3)", strArray12);
        org.apache.commons.math.ode.DerivativeException derivativeException17 = new org.apache.commons.math.ode.DerivativeException("org.apache.commons.math.ode.DerivativeException: Dormand-Prince 8 (5, 3)", strArray12);
        org.apache.commons.math.ode.DerivativeException derivativeException18 = new org.apache.commons.math.ode.DerivativeException("org.apache.commons.math.ode.IntegratorException: ", strArray12);
        org.apache.commons.math.ode.IntegratorException integratorException19 = new org.apache.commons.math.ode.IntegratorException("org.apache.commons.math.ode.DerivativeException: Dormand-Prince 8 (5, 3)", (java.lang.Object[]) strArray12);
        org.apache.commons.math.ode.IntegratorException integratorException20 = new org.apache.commons.math.ode.IntegratorException("org.apache.commons.math.ode.DerivativeException: hi!", (java.lang.Object[]) strArray12);
        org.apache.commons.math.ode.DerivativeException derivativeException21 = new org.apache.commons.math.ode.DerivativeException("org.apache.commons.math.ode.IntegratorException: hi!", strArray12);
        org.apache.commons.math.ode.DerivativeException derivativeException22 = new org.apache.commons.math.ode.DerivativeException("org.apache.commons.math.ode.IntegratorException: hi!", strArray12);
        org.apache.commons.math.ode.DerivativeException derivativeException23 = new org.apache.commons.math.ode.DerivativeException("org.apache.commons.math.ode.DerivativeException: org.apache.commons.math.ode.DerivativeException: Dormand-Prince 8 (5, 3)", strArray12);
        org.apache.commons.math.ode.IntegratorException integratorException24 = new org.apache.commons.math.ode.IntegratorException("org.apache.commons.math.ode.DerivativeException: org.apache.commons.math.ode.IntegratorException: Dormand-Prince 8 (5, 3)", (java.lang.Object[]) strArray12);
        java.lang.Object[] objArray25 = integratorException24.getArguments();
        org.junit.Assert.assertNotNull(strArray12);
        org.junit.Assert.assertNotNull(objArray25);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray25), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray25), "[]");
    }

    @Test
    public void test15549() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest31.test15549");
        java.lang.String[] strArray1 = new java.lang.String[] {};
        org.apache.commons.math.ode.DerivativeException derivativeException2 = new org.apache.commons.math.ode.DerivativeException("Dormand-Prince 8 (5, 3)", strArray1);
        java.lang.String str3 = derivativeException2.getPattern();
        org.apache.commons.math.ode.IntegratorException integratorException4 = new org.apache.commons.math.ode.IntegratorException((java.lang.Throwable) derivativeException2);
        org.apache.commons.math.ode.DerivativeException derivativeException5 = new org.apache.commons.math.ode.DerivativeException((java.lang.Throwable) derivativeException2);
        java.lang.String[] strArray13 = new java.lang.String[] {};
        org.apache.commons.math.ode.DerivativeException derivativeException14 = new org.apache.commons.math.ode.DerivativeException("Dormand-Prince 8 (5, 3)", strArray13);
        org.apache.commons.math.ode.DerivativeException derivativeException15 = new org.apache.commons.math.ode.DerivativeException("hi!", strArray13);
        org.apache.commons.math.ode.DerivativeException derivativeException16 = new org.apache.commons.math.ode.DerivativeException("hi!", strArray13);
        org.apache.commons.math.ode.DerivativeException derivativeException17 = new org.apache.commons.math.ode.DerivativeException("hi!", strArray13);
        org.apache.commons.math.ode.IntegratorException integratorException18 = new org.apache.commons.math.ode.IntegratorException("org.apache.commons.math.ode.DerivativeException: Dormand-Prince 8 (5, 3)", (java.lang.Object[]) strArray13);
        org.apache.commons.math.ode.DerivativeException derivativeException19 = new org.apache.commons.math.ode.DerivativeException("org.apache.commons.math.ode.IntegratorException: Dormand-Prince 8 (5, 3)", strArray13);
        org.apache.commons.math.ode.DerivativeException derivativeException20 = new org.apache.commons.math.ode.DerivativeException("", strArray13);
        derivativeException5.addSuppressed((java.lang.Throwable) derivativeException20);
        java.lang.Throwable[] throwableArray22 = derivativeException5.getSuppressed();
        java.lang.Object[] objArray23 = derivativeException5.getArguments();
        java.lang.Throwable[] throwableArray24 = derivativeException5.getSuppressed();
        java.lang.String[] strArray27 = new java.lang.String[] {};
        org.apache.commons.math.ode.DerivativeException derivativeException28 = new org.apache.commons.math.ode.DerivativeException("Dormand-Prince 8 (5, 3)", strArray27);
        org.apache.commons.math.ode.IntegratorException integratorException29 = new org.apache.commons.math.ode.IntegratorException((java.lang.Throwable) derivativeException28);
        java.lang.Throwable[] throwableArray30 = integratorException29.getSuppressed();
        java.lang.Throwable[] throwableArray31 = integratorException29.getSuppressed();
        org.apache.commons.math.ode.DerivativeException derivativeException32 = new org.apache.commons.math.ode.DerivativeException((java.lang.Throwable) integratorException29);
        java.lang.Throwable[] throwableArray33 = integratorException29.getSuppressed();
        org.apache.commons.math.ode.IntegratorException integratorException34 = new org.apache.commons.math.ode.IntegratorException("", (java.lang.Object[]) throwableArray33);
        org.apache.commons.math.ode.DerivativeException derivativeException35 = new org.apache.commons.math.ode.DerivativeException((java.lang.Throwable) integratorException34);
        derivativeException5.addSuppressed((java.lang.Throwable) derivativeException35);
        org.apache.commons.math.ode.IntegratorException integratorException37 = new org.apache.commons.math.ode.IntegratorException((java.lang.Throwable) derivativeException35);
        org.junit.Assert.assertNotNull(strArray1);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Dormand-Prince 8 (5, 3)" + "'", str3, "Dormand-Prince 8 (5, 3)");
        org.junit.Assert.assertNotNull(strArray13);
        org.junit.Assert.assertNotNull(throwableArray22);
        org.junit.Assert.assertNotNull(objArray23);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray23), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray23), "[]");
        org.junit.Assert.assertNotNull(throwableArray24);
        org.junit.Assert.assertNotNull(strArray27);
        org.junit.Assert.assertNotNull(throwableArray30);
        org.junit.Assert.assertNotNull(throwableArray31);
        org.junit.Assert.assertNotNull(throwableArray33);
    }

    @Test
    public void test15550() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest31.test15550");
        org.apache.commons.math.ode.DormandPrince853Integrator dormandPrince853Integrator4 = new org.apache.commons.math.ode.DormandPrince853Integrator(1.0d, (double) (byte) 10, (double) (short) 1, (double) 0L);
        int int5 = dormandPrince853Integrator4.getOrder();
        double double6 = dormandPrince853Integrator4.getSafety();
        dormandPrince853Integrator4.setSafety((double) (-1));
        int int9 = dormandPrince853Integrator4.getOrder();
        double double10 = dormandPrince853Integrator4.getMaxGrowth();
        double double11 = dormandPrince853Integrator4.getCurrentSignedStepsize();
        int int12 = dormandPrince853Integrator4.getOrder();
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 8 + "'", int5 == 8);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.9d + "'", double6 == 0.9d);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 8 + "'", int9 == 8);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 10.0d + "'", double10 == 10.0d);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 3.1622776601683795d + "'", double11 == 3.1622776601683795d);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 8 + "'", int12 == 8);
    }

    @Test
    public void test15551() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest31.test15551");
        org.apache.commons.math.ode.DormandPrince853Integrator dormandPrince853Integrator4 = new org.apache.commons.math.ode.DormandPrince853Integrator(16.0d, 63.245553203367585d, 1.755012902585341d, 8.94427190999916d);
        double double5 = dormandPrince853Integrator4.getMinStep();
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 16.0d + "'", double5 == 16.0d);
    }

    @Test
    public void test15552() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest31.test15552");
        org.apache.commons.math.ode.DormandPrince853Integrator dormandPrince853Integrator4 = new org.apache.commons.math.ode.DormandPrince853Integrator(48.655726475421666d, 23.673797188510488d, 100.0d, 0.0d);
        dormandPrince853Integrator4.setInitialStepSize(9.485494822646622d);
        double double7 = dormandPrince853Integrator4.getCurrentSignedStepsize();
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 33.9391484960771d + "'", double7 == 33.9391484960771d);
    }

    @Test
    public void test15553() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest31.test15553");
        org.apache.commons.math.ode.DormandPrince853Integrator dormandPrince853Integrator4 = new org.apache.commons.math.ode.DormandPrince853Integrator(1.0d, (double) (byte) 10, (double) (short) 1, (double) 0L);
        int int5 = dormandPrince853Integrator4.getOrder();
        double double6 = dormandPrince853Integrator4.getSafety();
        dormandPrince853Integrator4.setSafety((double) (-1));
        double double9 = dormandPrince853Integrator4.getMinStep();
        dormandPrince853Integrator4.setInitialStepSize((double) (-1L));
        org.apache.commons.math.ode.StepHandler stepHandler12 = dormandPrince853Integrator4.getStepHandler();
        org.apache.commons.math.ode.DormandPrince853Integrator dormandPrince853Integrator17 = new org.apache.commons.math.ode.DormandPrince853Integrator((double) 10, (double) (byte) 10, (double) (short) 100, (double) 1);
        dormandPrince853Integrator17.setSafety((double) '#');
        dormandPrince853Integrator17.setMaxGrowth((double) 100.0f);
        int int22 = dormandPrince853Integrator17.getOrder();
        org.apache.commons.math.ode.DormandPrince853Integrator dormandPrince853Integrator27 = new org.apache.commons.math.ode.DormandPrince853Integrator((double) 10, (double) (byte) 10, (double) (short) 100, (double) 1);
        double double28 = dormandPrince853Integrator27.getSafety();
        double double29 = dormandPrince853Integrator27.getMinStep();
        dormandPrince853Integrator27.setSafety((double) '#');
        double double32 = dormandPrince853Integrator27.getCurrentStepStart();
        double double33 = dormandPrince853Integrator27.getMaxStep();
        double double34 = dormandPrince853Integrator27.getMaxGrowth();
        org.apache.commons.math.ode.DormandPrince853Integrator dormandPrince853Integrator39 = new org.apache.commons.math.ode.DormandPrince853Integrator(1.0d, (double) (byte) 10, (double) (short) 1, (double) 0L);
        double double40 = dormandPrince853Integrator39.getMinStep();
        int int41 = dormandPrince853Integrator39.getOrder();
        org.apache.commons.math.ode.DormandPrince853Integrator dormandPrince853Integrator46 = new org.apache.commons.math.ode.DormandPrince853Integrator((double) 10, (double) (byte) 10, (double) (short) 100, (double) 1);
        double double47 = dormandPrince853Integrator46.getSafety();
        double double48 = dormandPrince853Integrator46.getMinStep();
        double double49 = dormandPrince853Integrator46.getMinStep();
        double double50 = dormandPrince853Integrator46.getCurrentSignedStepsize();
        int int51 = dormandPrince853Integrator46.getOrder();
        double double52 = dormandPrince853Integrator46.getMaxGrowth();
        org.apache.commons.math.ode.StepHandler stepHandler53 = dormandPrince853Integrator46.getStepHandler();
        dormandPrince853Integrator39.setStepHandler(stepHandler53);
        dormandPrince853Integrator27.setStepHandler(stepHandler53);
        dormandPrince853Integrator17.setStepHandler(stepHandler53);
        dormandPrince853Integrator4.setStepHandler(stepHandler53);
        java.lang.String str58 = dormandPrince853Integrator4.getName();
        java.lang.String str59 = dormandPrince853Integrator4.getName();
        dormandPrince853Integrator4.setMinReduction((double) 100L);
        org.apache.commons.math.ode.DormandPrince853Integrator dormandPrince853Integrator66 = new org.apache.commons.math.ode.DormandPrince853Integrator((double) 10, (double) (byte) 10, (double) (short) 100, (double) 1);
        double double67 = dormandPrince853Integrator66.getSafety();
        dormandPrince853Integrator66.setMinReduction((double) (short) -1);
        dormandPrince853Integrator66.setInitialStepSize((double) 0.0f);
        int int72 = dormandPrince853Integrator66.getOrder();
        org.apache.commons.math.ode.SwitchingFunction switchingFunction73 = null;
        dormandPrince853Integrator66.addSwitchingFunction(switchingFunction73, (-1.0d), (double) 1L, (int) 'a');
        double double78 = dormandPrince853Integrator66.getMaxGrowth();
        double double79 = dormandPrince853Integrator66.getMaxStep();
        double double80 = dormandPrince853Integrator66.getMinStep();
        org.apache.commons.math.ode.StepHandler stepHandler81 = dormandPrince853Integrator66.getStepHandler();
        dormandPrince853Integrator4.setStepHandler(stepHandler81);
        dormandPrince853Integrator4.setMinReduction(56.23413251903491d);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 8 + "'", int5 == 8);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.9d + "'", double6 == 0.9d);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 1.0d + "'", double9 == 1.0d);
        org.junit.Assert.assertNotNull(stepHandler12);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 8 + "'", int22 == 8);
        org.junit.Assert.assertTrue("'" + double28 + "' != '" + 0.9d + "'", double28 == 0.9d);
        org.junit.Assert.assertTrue("'" + double29 + "' != '" + 10.0d + "'", double29 == 10.0d);
        org.junit.Assert.assertTrue(Double.isNaN(double32));
        org.junit.Assert.assertTrue("'" + double33 + "' != '" + 10.0d + "'", double33 == 10.0d);
        org.junit.Assert.assertTrue("'" + double34 + "' != '" + 10.0d + "'", double34 == 10.0d);
        org.junit.Assert.assertTrue("'" + double40 + "' != '" + 1.0d + "'", double40 == 1.0d);
        org.junit.Assert.assertTrue("'" + int41 + "' != '" + 8 + "'", int41 == 8);
        org.junit.Assert.assertTrue("'" + double47 + "' != '" + 0.9d + "'", double47 == 0.9d);
        org.junit.Assert.assertTrue("'" + double48 + "' != '" + 10.0d + "'", double48 == 10.0d);
        org.junit.Assert.assertTrue("'" + double49 + "' != '" + 10.0d + "'", double49 == 10.0d);
        org.junit.Assert.assertTrue("'" + double50 + "' != '" + 10.0d + "'", double50 == 10.0d);
        org.junit.Assert.assertTrue("'" + int51 + "' != '" + 8 + "'", int51 == 8);
        org.junit.Assert.assertTrue("'" + double52 + "' != '" + 10.0d + "'", double52 == 10.0d);
        org.junit.Assert.assertNotNull(stepHandler53);
        org.junit.Assert.assertEquals("'" + str58 + "' != '" + "Dormand-Prince 8 (5, 3)" + "'", str58, "Dormand-Prince 8 (5, 3)");
        org.junit.Assert.assertEquals("'" + str59 + "' != '" + "Dormand-Prince 8 (5, 3)" + "'", str59, "Dormand-Prince 8 (5, 3)");
        org.junit.Assert.assertTrue("'" + double67 + "' != '" + 0.9d + "'", double67 == 0.9d);
        org.junit.Assert.assertTrue("'" + int72 + "' != '" + 8 + "'", int72 == 8);
        org.junit.Assert.assertTrue("'" + double78 + "' != '" + 10.0d + "'", double78 == 10.0d);
        org.junit.Assert.assertTrue("'" + double79 + "' != '" + 10.0d + "'", double79 == 10.0d);
        org.junit.Assert.assertTrue("'" + double80 + "' != '" + 10.0d + "'", double80 == 10.0d);
        org.junit.Assert.assertNotNull(stepHandler81);
    }

    @Test
    public void test15554() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest31.test15554");
        org.apache.commons.math.ode.DormandPrince853Integrator dormandPrince853Integrator4 = new org.apache.commons.math.ode.DormandPrince853Integrator((double) 10, (double) (byte) 10, (double) (short) 100, (double) 1);
        double double5 = dormandPrince853Integrator4.getSafety();
        double double6 = dormandPrince853Integrator4.getMinStep();
        dormandPrince853Integrator4.setSafety((double) '#');
        double double9 = dormandPrince853Integrator4.getCurrentStepStart();
        double double10 = dormandPrince853Integrator4.getMaxStep();
        org.apache.commons.math.ode.StepHandler stepHandler11 = dormandPrince853Integrator4.getStepHandler();
        double double12 = dormandPrince853Integrator4.getMinReduction();
        dormandPrince853Integrator4.setInitialStepSize((double) 100L);
        dormandPrince853Integrator4.setMaxGrowth((double) 10L);
        double double17 = dormandPrince853Integrator4.getCurrentSignedStepsize();
        java.lang.String str18 = dormandPrince853Integrator4.getName();
        org.apache.commons.math.ode.SwitchingFunction switchingFunction19 = null;
        dormandPrince853Integrator4.addSwitchingFunction(switchingFunction19, (double) (-1.0f), 0.0d, 100);
        dormandPrince853Integrator4.setSafety((double) (byte) 1);
        double double26 = dormandPrince853Integrator4.getMinStep();
        int int27 = dormandPrince853Integrator4.getOrder();
        int int28 = dormandPrince853Integrator4.getOrder();
        org.apache.commons.math.ode.SwitchingFunction switchingFunction29 = null;
        dormandPrince853Integrator4.addSwitchingFunction(switchingFunction29, 31.622776601683793d, 9.485494822646622d, 100);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.9d + "'", double5 == 0.9d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 10.0d + "'", double6 == 10.0d);
        org.junit.Assert.assertTrue(Double.isNaN(double9));
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 10.0d + "'", double10 == 10.0d);
        org.junit.Assert.assertNotNull(stepHandler11);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 0.2d + "'", double12 == 0.2d);
        org.junit.Assert.assertTrue("'" + double17 + "' != '" + 10.0d + "'", double17 == 10.0d);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "Dormand-Prince 8 (5, 3)" + "'", str18, "Dormand-Prince 8 (5, 3)");
        org.junit.Assert.assertTrue("'" + double26 + "' != '" + 10.0d + "'", double26 == 10.0d);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 8 + "'", int27 == 8);
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + 8 + "'", int28 == 8);
    }

    @Test
    public void test15555() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest31.test15555");
        org.apache.commons.math.ode.DormandPrince853Integrator dormandPrince853Integrator4 = new org.apache.commons.math.ode.DormandPrince853Integrator((double) 10, (double) (byte) 10, (double) (short) 100, (double) 1);
        dormandPrince853Integrator4.setSafety((double) '#');
        org.apache.commons.math.ode.StepHandler stepHandler7 = null;
        dormandPrince853Integrator4.setStepHandler(stepHandler7);
        double double9 = dormandPrince853Integrator4.getMinReduction();
        double double10 = dormandPrince853Integrator4.getCurrentSignedStepsize();
        java.lang.String str11 = dormandPrince853Integrator4.getName();
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 0.2d + "'", double9 == 0.2d);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 10.0d + "'", double10 == 10.0d);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "Dormand-Prince 8 (5, 3)" + "'", str11, "Dormand-Prince 8 (5, 3)");
    }

    @Test
    public void test15556() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest31.test15556");
        double[] doubleArray8 = new double[] {};
        double[] doubleArray9 = new double[] {};
        org.apache.commons.math.ode.DormandPrince853Integrator dormandPrince853Integrator10 = new org.apache.commons.math.ode.DormandPrince853Integrator((double) 1.0f, (double) 1.0f, doubleArray8, doubleArray9);
        double[] doubleArray13 = new double[] {};
        double[] doubleArray14 = new double[] {};
        org.apache.commons.math.ode.DormandPrince853Integrator dormandPrince853Integrator15 = new org.apache.commons.math.ode.DormandPrince853Integrator((double) 1.0f, (double) 1.0f, doubleArray13, doubleArray14);
        org.apache.commons.math.ode.DormandPrince853Integrator dormandPrince853Integrator16 = new org.apache.commons.math.ode.DormandPrince853Integrator((double) ' ', (double) 'a', doubleArray9, doubleArray14);
        double[] doubleArray19 = new double[] {};
        double[] doubleArray20 = new double[] {};
        org.apache.commons.math.ode.DormandPrince853Integrator dormandPrince853Integrator21 = new org.apache.commons.math.ode.DormandPrince853Integrator((double) 1.0f, (double) 1.0f, doubleArray19, doubleArray20);
        org.apache.commons.math.ode.DormandPrince853Integrator dormandPrince853Integrator22 = new org.apache.commons.math.ode.DormandPrince853Integrator(3.1622776601683795d, (double) ' ', doubleArray14, doubleArray19);
        double[] doubleArray27 = new double[] {};
        double[] doubleArray28 = new double[] {};
        org.apache.commons.math.ode.DormandPrince853Integrator dormandPrince853Integrator29 = new org.apache.commons.math.ode.DormandPrince853Integrator((double) 1.0f, (double) 1.0f, doubleArray27, doubleArray28);
        double[] doubleArray34 = new double[] {};
        double[] doubleArray35 = new double[] {};
        org.apache.commons.math.ode.DormandPrince853Integrator dormandPrince853Integrator36 = new org.apache.commons.math.ode.DormandPrince853Integrator((double) 1.0f, (double) 1.0f, doubleArray34, doubleArray35);
        double[] doubleArray39 = new double[] {};
        double[] doubleArray40 = new double[] {};
        org.apache.commons.math.ode.DormandPrince853Integrator dormandPrince853Integrator41 = new org.apache.commons.math.ode.DormandPrince853Integrator((double) 1.0f, (double) 1.0f, doubleArray39, doubleArray40);
        org.apache.commons.math.ode.DormandPrince853Integrator dormandPrince853Integrator42 = new org.apache.commons.math.ode.DormandPrince853Integrator((double) ' ', (double) 'a', doubleArray35, doubleArray40);
        org.apache.commons.math.ode.DormandPrince853Integrator dormandPrince853Integrator43 = new org.apache.commons.math.ode.DormandPrince853Integrator(0.9d, (double) 1L, doubleArray27, doubleArray40);
        org.apache.commons.math.ode.DormandPrince853Integrator dormandPrince853Integrator44 = new org.apache.commons.math.ode.DormandPrince853Integrator((double) (short) 10, (double) 0.0f, doubleArray19, doubleArray40);
        double double45 = dormandPrince853Integrator44.getCurrentStepStart();
        double double46 = dormandPrince853Integrator44.getSafety();
        double double47 = dormandPrince853Integrator44.getMinReduction();
        org.apache.commons.math.ode.SwitchingFunction switchingFunction48 = null;
        dormandPrince853Integrator44.addSwitchingFunction(switchingFunction48, (double) 8, (double) (byte) -1, (int) (byte) 0);
        java.lang.String str53 = dormandPrince853Integrator44.getName();
        dormandPrince853Integrator44.setMinReduction((double) 10);
        java.lang.String str56 = dormandPrince853Integrator44.getName();
        java.lang.String str57 = dormandPrince853Integrator44.getName();
        dormandPrince853Integrator44.setInitialStepSize((double) (byte) -1);
        double double60 = dormandPrince853Integrator44.getMaxGrowth();
        dormandPrince853Integrator44.setMaxGrowth((double) (byte) 100);
        int int63 = dormandPrince853Integrator44.getOrder();
        double double64 = dormandPrince853Integrator44.getCurrentSignedStepsize();
        dormandPrince853Integrator44.setInitialStepSize(32.57978792305368d);
        org.junit.Assert.assertNotNull(doubleArray8);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray8), "[]");
        org.junit.Assert.assertNotNull(doubleArray9);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray9), "[]");
        org.junit.Assert.assertNotNull(doubleArray13);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray13), "[]");
        org.junit.Assert.assertNotNull(doubleArray14);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray14), "[]");
        org.junit.Assert.assertNotNull(doubleArray19);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray19), "[]");
        org.junit.Assert.assertNotNull(doubleArray20);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray20), "[]");
        org.junit.Assert.assertNotNull(doubleArray27);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray27), "[]");
        org.junit.Assert.assertNotNull(doubleArray28);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray28), "[]");
        org.junit.Assert.assertNotNull(doubleArray34);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray34), "[]");
        org.junit.Assert.assertNotNull(doubleArray35);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray35), "[]");
        org.junit.Assert.assertNotNull(doubleArray39);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray39), "[]");
        org.junit.Assert.assertNotNull(doubleArray40);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray40), "[]");
        org.junit.Assert.assertTrue(Double.isNaN(double45));
        org.junit.Assert.assertTrue("'" + double46 + "' != '" + 0.9d + "'", double46 == 0.9d);
        org.junit.Assert.assertTrue("'" + double47 + "' != '" + 0.2d + "'", double47 == 0.2d);
        org.junit.Assert.assertEquals("'" + str53 + "' != '" + "Dormand-Prince 8 (5, 3)" + "'", str53, "Dormand-Prince 8 (5, 3)");
        org.junit.Assert.assertEquals("'" + str56 + "' != '" + "Dormand-Prince 8 (5, 3)" + "'", str56, "Dormand-Prince 8 (5, 3)");
        org.junit.Assert.assertEquals("'" + str57 + "' != '" + "Dormand-Prince 8 (5, 3)" + "'", str57, "Dormand-Prince 8 (5, 3)");
        org.junit.Assert.assertTrue("'" + double60 + "' != '" + 10.0d + "'", double60 == 10.0d);
        org.junit.Assert.assertTrue("'" + int63 + "' != '" + 8 + "'", int63 == 8);
        org.junit.Assert.assertTrue("'" + double64 + "' != '" + 0.0d + "'", double64 == 0.0d);
    }

    @Test
    public void test15557() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest31.test15557");
        org.apache.commons.math.ode.DormandPrince853Integrator dormandPrince853Integrator4 = new org.apache.commons.math.ode.DormandPrince853Integrator((double) 10, (double) (byte) 10, (double) (short) 100, (double) 1);
        double double5 = dormandPrince853Integrator4.getSafety();
        double double6 = dormandPrince853Integrator4.getMinStep();
        double double7 = dormandPrince853Integrator4.getCurrentStepStart();
        dormandPrince853Integrator4.setMinReduction((double) (byte) 0);
        double double10 = dormandPrince853Integrator4.getMinReduction();
        int int11 = dormandPrince853Integrator4.getOrder();
        double double12 = dormandPrince853Integrator4.getMaxGrowth();
        double double13 = dormandPrince853Integrator4.getMinReduction();
        org.apache.commons.math.ode.DormandPrince853Integrator dormandPrince853Integrator18 = new org.apache.commons.math.ode.DormandPrince853Integrator((double) 10, (double) (byte) 10, (double) (short) 100, (double) 1);
        double double19 = dormandPrince853Integrator18.getSafety();
        dormandPrince853Integrator18.setMinReduction((double) (short) -1);
        dormandPrince853Integrator18.setInitialStepSize((double) 0.0f);
        int int24 = dormandPrince853Integrator18.getOrder();
        org.apache.commons.math.ode.SwitchingFunction switchingFunction25 = null;
        dormandPrince853Integrator18.addSwitchingFunction(switchingFunction25, (-1.0d), (double) 1L, (int) 'a');
        java.lang.String str30 = dormandPrince853Integrator18.getName();
        dormandPrince853Integrator18.setInitialStepSize(55.71355310873648d);
        org.apache.commons.math.ode.SwitchingFunction switchingFunction33 = null;
        dormandPrince853Integrator18.addSwitchingFunction(switchingFunction33, (-1.0d), (double) 1.0f, 100);
        org.apache.commons.math.ode.StepHandler stepHandler38 = dormandPrince853Integrator18.getStepHandler();
        dormandPrince853Integrator4.setStepHandler(stepHandler38);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.9d + "'", double5 == 0.9d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 10.0d + "'", double6 == 10.0d);
        org.junit.Assert.assertTrue(Double.isNaN(double7));
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 0.0d + "'", double10 == 0.0d);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 8 + "'", int11 == 8);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 10.0d + "'", double12 == 10.0d);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 0.0d + "'", double13 == 0.0d);
        org.junit.Assert.assertTrue("'" + double19 + "' != '" + 0.9d + "'", double19 == 0.9d);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 8 + "'", int24 == 8);
        org.junit.Assert.assertEquals("'" + str30 + "' != '" + "Dormand-Prince 8 (5, 3)" + "'", str30, "Dormand-Prince 8 (5, 3)");
        org.junit.Assert.assertNotNull(stepHandler38);
    }

    @Test
    public void test15558() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest31.test15558");
        org.apache.commons.math.ode.DormandPrince853Integrator dormandPrince853Integrator4 = new org.apache.commons.math.ode.DormandPrince853Integrator((double) 10, (double) (byte) 10, (double) (short) 100, (double) 1);
        double double5 = dormandPrince853Integrator4.getSafety();
        double double6 = dormandPrince853Integrator4.getMinStep();
        dormandPrince853Integrator4.setSafety((double) '#');
        double double9 = dormandPrince853Integrator4.getCurrentStepStart();
        double double10 = dormandPrince853Integrator4.getMaxStep();
        org.apache.commons.math.ode.StepHandler stepHandler11 = dormandPrince853Integrator4.getStepHandler();
        double double12 = dormandPrince853Integrator4.getMinReduction();
        org.apache.commons.math.ode.SwitchingFunction switchingFunction13 = null;
        dormandPrince853Integrator4.addSwitchingFunction(switchingFunction13, 0.0d, (double) (short) 10, 1);
        double double18 = dormandPrince853Integrator4.getMinReduction();
        double double19 = dormandPrince853Integrator4.getMinReduction();
        double double20 = dormandPrince853Integrator4.getMinReduction();
        double double21 = dormandPrince853Integrator4.getMaxGrowth();
        double double22 = dormandPrince853Integrator4.getCurrentSignedStepsize();
        double double23 = dormandPrince853Integrator4.getMinReduction();
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.9d + "'", double5 == 0.9d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 10.0d + "'", double6 == 10.0d);
        org.junit.Assert.assertTrue(Double.isNaN(double9));
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 10.0d + "'", double10 == 10.0d);
        org.junit.Assert.assertNotNull(stepHandler11);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 0.2d + "'", double12 == 0.2d);
        org.junit.Assert.assertTrue("'" + double18 + "' != '" + 0.2d + "'", double18 == 0.2d);
        org.junit.Assert.assertTrue("'" + double19 + "' != '" + 0.2d + "'", double19 == 0.2d);
        org.junit.Assert.assertTrue("'" + double20 + "' != '" + 0.2d + "'", double20 == 0.2d);
        org.junit.Assert.assertTrue("'" + double21 + "' != '" + 10.0d + "'", double21 == 10.0d);
        org.junit.Assert.assertTrue("'" + double22 + "' != '" + 10.0d + "'", double22 == 10.0d);
        org.junit.Assert.assertTrue("'" + double23 + "' != '" + 0.2d + "'", double23 == 0.2d);
    }

    @Test
    public void test15559() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest31.test15559");
        java.lang.String[] strArray8 = new java.lang.String[] {};
        org.apache.commons.math.ode.DerivativeException derivativeException9 = new org.apache.commons.math.ode.DerivativeException("Dormand-Prince 8 (5, 3)", strArray8);
        org.apache.commons.math.ode.DerivativeException derivativeException10 = new org.apache.commons.math.ode.DerivativeException("hi!", strArray8);
        org.apache.commons.math.ode.DerivativeException derivativeException11 = new org.apache.commons.math.ode.DerivativeException("hi!", strArray8);
        org.apache.commons.math.ode.IntegratorException integratorException12 = new org.apache.commons.math.ode.IntegratorException("org.apache.commons.math.ode.IntegratorException: hi!", (java.lang.Object[]) strArray8);
        org.apache.commons.math.ode.DerivativeException derivativeException13 = new org.apache.commons.math.ode.DerivativeException("org.apache.commons.math.ode.IntegratorException: Dormand-Prince 8 (5, 3)", strArray8);
        org.apache.commons.math.ode.DerivativeException derivativeException14 = new org.apache.commons.math.ode.DerivativeException("org.apache.commons.math.ode.IntegratorException: ", strArray8);
        org.apache.commons.math.ode.IntegratorException integratorException15 = new org.apache.commons.math.ode.IntegratorException("org.apache.commons.math.ode.DerivativeException: org.apache.commons.math.ode.IntegratorException: org.apache.commons.math.ode.DerivativeException: Dormand-Prince 8 (5, 3)", (java.lang.Object[]) strArray8);
        org.apache.commons.math.ode.DerivativeException derivativeException16 = new org.apache.commons.math.ode.DerivativeException("org.apache.commons.math.ode.DerivativeException: org.apache.commons.math.ode.IntegratorException: hi!", strArray8);
        java.lang.String[] strArray18 = new java.lang.String[] {};
        org.apache.commons.math.ode.DerivativeException derivativeException19 = new org.apache.commons.math.ode.DerivativeException("Dormand-Prince 8 (5, 3)", strArray18);
        org.apache.commons.math.ode.IntegratorException integratorException20 = new org.apache.commons.math.ode.IntegratorException((java.lang.Throwable) derivativeException19);
        java.lang.Throwable[] throwableArray21 = integratorException20.getSuppressed();
        java.lang.Throwable[] throwableArray22 = integratorException20.getSuppressed();
        org.apache.commons.math.ode.DerivativeException derivativeException23 = new org.apache.commons.math.ode.DerivativeException((java.lang.Throwable) integratorException20);
        java.lang.Object[] objArray31 = new java.lang.Object[] { 100L, true, (-1), Double.NaN, 1, (-1) };
        org.apache.commons.math.ode.IntegratorException integratorException32 = new org.apache.commons.math.ode.IntegratorException("hi!", objArray31);
        java.lang.String str33 = integratorException32.getPattern();
        java.lang.Throwable[] throwableArray34 = integratorException32.getSuppressed();
        integratorException20.addSuppressed((java.lang.Throwable) integratorException32);
        java.lang.String str36 = integratorException32.getPattern();
        java.lang.Object[] objArray44 = new java.lang.Object[] { 100L, true, (-1), Double.NaN, 1, (-1) };
        org.apache.commons.math.ode.IntegratorException integratorException45 = new org.apache.commons.math.ode.IntegratorException("hi!", objArray44);
        java.lang.String str46 = integratorException45.getPattern();
        java.lang.String[] strArray51 = new java.lang.String[] {};
        org.apache.commons.math.ode.DerivativeException derivativeException52 = new org.apache.commons.math.ode.DerivativeException("Dormand-Prince 8 (5, 3)", strArray51);
        org.apache.commons.math.ode.DerivativeException derivativeException53 = new org.apache.commons.math.ode.DerivativeException("hi!", strArray51);
        org.apache.commons.math.ode.DerivativeException derivativeException54 = new org.apache.commons.math.ode.DerivativeException("hi!", strArray51);
        org.apache.commons.math.ode.DerivativeException derivativeException55 = new org.apache.commons.math.ode.DerivativeException("hi!", strArray51);
        integratorException45.addSuppressed((java.lang.Throwable) derivativeException55);
        org.apache.commons.math.ode.IntegratorException integratorException57 = new org.apache.commons.math.ode.IntegratorException((java.lang.Throwable) integratorException45);
        java.lang.String str58 = integratorException45.getPattern();
        integratorException32.addSuppressed((java.lang.Throwable) integratorException45);
        org.apache.commons.math.ode.IntegratorException integratorException60 = new org.apache.commons.math.ode.IntegratorException((java.lang.Throwable) integratorException45);
        org.apache.commons.math.ode.IntegratorException integratorException61 = new org.apache.commons.math.ode.IntegratorException((java.lang.Throwable) integratorException45);
        derivativeException16.addSuppressed((java.lang.Throwable) integratorException61);
        org.junit.Assert.assertNotNull(strArray8);
        org.junit.Assert.assertNotNull(strArray18);
        org.junit.Assert.assertNotNull(throwableArray21);
        org.junit.Assert.assertNotNull(throwableArray22);
        org.junit.Assert.assertNotNull(objArray31);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray31), "[100, true, -1, NaN, 1, -1]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray31), "[100, true, -1, NaN, 1, -1]");
        org.junit.Assert.assertEquals("'" + str33 + "' != '" + "hi!" + "'", str33, "hi!");
        org.junit.Assert.assertNotNull(throwableArray34);
        org.junit.Assert.assertEquals("'" + str36 + "' != '" + "hi!" + "'", str36, "hi!");
        org.junit.Assert.assertNotNull(objArray44);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray44), "[100, true, -1, NaN, 1, -1]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray44), "[100, true, -1, NaN, 1, -1]");
        org.junit.Assert.assertEquals("'" + str46 + "' != '" + "hi!" + "'", str46, "hi!");
        org.junit.Assert.assertNotNull(strArray51);
        org.junit.Assert.assertEquals("'" + str58 + "' != '" + "hi!" + "'", str58, "hi!");
    }

    @Test
    public void test15560() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest31.test15560");
        java.lang.String[] strArray2 = new java.lang.String[] {};
        org.apache.commons.math.ode.DerivativeException derivativeException3 = new org.apache.commons.math.ode.DerivativeException("Dormand-Prince 8 (5, 3)", strArray2);
        org.apache.commons.math.ode.IntegratorException integratorException4 = new org.apache.commons.math.ode.IntegratorException((java.lang.Throwable) derivativeException3);
        java.lang.Throwable[] throwableArray5 = integratorException4.getSuppressed();
        java.lang.Throwable[] throwableArray6 = integratorException4.getSuppressed();
        org.apache.commons.math.ode.DerivativeException derivativeException7 = new org.apache.commons.math.ode.DerivativeException((java.lang.Throwable) integratorException4);
        java.lang.Throwable[] throwableArray8 = integratorException4.getSuppressed();
        org.apache.commons.math.ode.IntegratorException integratorException9 = new org.apache.commons.math.ode.IntegratorException("", (java.lang.Object[]) throwableArray8);
        java.lang.Object[] objArray17 = new java.lang.Object[] { 100L, true, (-1), Double.NaN, 1, (-1) };
        org.apache.commons.math.ode.IntegratorException integratorException18 = new org.apache.commons.math.ode.IntegratorException("hi!", objArray17);
        java.lang.String str19 = integratorException18.getPattern();
        org.apache.commons.math.ode.DerivativeException derivativeException20 = new org.apache.commons.math.ode.DerivativeException((java.lang.Throwable) integratorException18);
        org.apache.commons.math.ode.DerivativeException derivativeException21 = new org.apache.commons.math.ode.DerivativeException((java.lang.Throwable) integratorException18);
        org.apache.commons.math.ode.DerivativeException derivativeException22 = new org.apache.commons.math.ode.DerivativeException((java.lang.Throwable) integratorException18);
        java.lang.Object[] objArray23 = integratorException18.getArguments();
        org.apache.commons.math.ode.DerivativeException derivativeException24 = new org.apache.commons.math.ode.DerivativeException((java.lang.Throwable) integratorException18);
        integratorException9.addSuppressed((java.lang.Throwable) integratorException18);
        java.lang.Throwable[] throwableArray26 = integratorException18.getSuppressed();
        java.lang.String[] strArray32 = new java.lang.String[] {};
        org.apache.commons.math.ode.DerivativeException derivativeException33 = new org.apache.commons.math.ode.DerivativeException("Dormand-Prince 8 (5, 3)", strArray32);
        org.apache.commons.math.ode.DerivativeException derivativeException34 = new org.apache.commons.math.ode.DerivativeException("hi!", strArray32);
        org.apache.commons.math.ode.DerivativeException derivativeException35 = new org.apache.commons.math.ode.DerivativeException("hi!", strArray32);
        org.apache.commons.math.ode.DerivativeException derivativeException36 = new org.apache.commons.math.ode.DerivativeException("hi!", strArray32);
        org.apache.commons.math.ode.IntegratorException integratorException37 = new org.apache.commons.math.ode.IntegratorException("org.apache.commons.math.ode.DerivativeException: Dormand-Prince 8 (5, 3)", (java.lang.Object[]) strArray32);
        java.lang.Object[] objArray45 = new java.lang.Object[] { 100L, true, (-1), Double.NaN, 1, (-1) };
        org.apache.commons.math.ode.IntegratorException integratorException46 = new org.apache.commons.math.ode.IntegratorException("hi!", objArray45);
        java.lang.String str47 = integratorException46.getPattern();
        org.apache.commons.math.ode.DerivativeException derivativeException48 = new org.apache.commons.math.ode.DerivativeException((java.lang.Throwable) integratorException46);
        integratorException37.addSuppressed((java.lang.Throwable) integratorException46);
        org.apache.commons.math.ode.DerivativeException derivativeException50 = new org.apache.commons.math.ode.DerivativeException((java.lang.Throwable) integratorException37);
        java.lang.String[] strArray52 = new java.lang.String[] {};
        org.apache.commons.math.ode.DerivativeException derivativeException53 = new org.apache.commons.math.ode.DerivativeException("Dormand-Prince 8 (5, 3)", strArray52);
        org.apache.commons.math.ode.IntegratorException integratorException54 = new org.apache.commons.math.ode.IntegratorException((java.lang.Throwable) derivativeException53);
        org.apache.commons.math.ode.DerivativeException derivativeException55 = new org.apache.commons.math.ode.DerivativeException((java.lang.Throwable) integratorException54);
        java.lang.String[] strArray57 = new java.lang.String[] {};
        org.apache.commons.math.ode.DerivativeException derivativeException58 = new org.apache.commons.math.ode.DerivativeException("Dormand-Prince 8 (5, 3)", strArray57);
        org.apache.commons.math.ode.IntegratorException integratorException59 = new org.apache.commons.math.ode.IntegratorException((java.lang.Throwable) derivativeException58);
        java.lang.Throwable[] throwableArray60 = integratorException59.getSuppressed();
        java.lang.Throwable[] throwableArray61 = integratorException59.getSuppressed();
        org.apache.commons.math.ode.DerivativeException derivativeException62 = new org.apache.commons.math.ode.DerivativeException((java.lang.Throwable) integratorException59);
        integratorException54.addSuppressed((java.lang.Throwable) integratorException59);
        derivativeException50.addSuppressed((java.lang.Throwable) integratorException54);
        java.lang.String str65 = derivativeException50.getPattern();
        integratorException18.addSuppressed((java.lang.Throwable) derivativeException50);
        java.lang.String[] strArray76 = new java.lang.String[] {};
        org.apache.commons.math.ode.DerivativeException derivativeException77 = new org.apache.commons.math.ode.DerivativeException("Dormand-Prince 8 (5, 3)", strArray76);
        org.apache.commons.math.ode.DerivativeException derivativeException78 = new org.apache.commons.math.ode.DerivativeException("hi!", strArray76);
        org.apache.commons.math.ode.DerivativeException derivativeException79 = new org.apache.commons.math.ode.DerivativeException("hi!", strArray76);
        org.apache.commons.math.ode.DerivativeException derivativeException80 = new org.apache.commons.math.ode.DerivativeException("hi!", strArray76);
        org.apache.commons.math.ode.IntegratorException integratorException81 = new org.apache.commons.math.ode.IntegratorException("org.apache.commons.math.ode.DerivativeException: Dormand-Prince 8 (5, 3)", (java.lang.Object[]) strArray76);
        org.apache.commons.math.ode.DerivativeException derivativeException82 = new org.apache.commons.math.ode.DerivativeException("org.apache.commons.math.ode.IntegratorException: ", strArray76);
        org.apache.commons.math.ode.DerivativeException derivativeException83 = new org.apache.commons.math.ode.DerivativeException("", strArray76);
        org.apache.commons.math.ode.DerivativeException derivativeException84 = new org.apache.commons.math.ode.DerivativeException("org.apache.commons.math.ode.IntegratorException", strArray76);
        org.apache.commons.math.ode.DerivativeException derivativeException85 = new org.apache.commons.math.ode.DerivativeException("org.apache.commons.math.ode.IntegratorException: org.apache.commons.math.ode.IntegratorException: ", strArray76);
        org.apache.commons.math.ode.IntegratorException integratorException86 = new org.apache.commons.math.ode.IntegratorException((java.lang.Throwable) derivativeException85);
        java.lang.String str87 = integratorException86.getPattern();
        derivativeException50.addSuppressed((java.lang.Throwable) integratorException86);
        java.lang.String str89 = integratorException86.toString();
        org.junit.Assert.assertNotNull(strArray2);
        org.junit.Assert.assertNotNull(throwableArray5);
        org.junit.Assert.assertNotNull(throwableArray6);
        org.junit.Assert.assertNotNull(throwableArray8);
        org.junit.Assert.assertNotNull(objArray17);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray17), "[100, true, -1, NaN, 1, -1]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray17), "[100, true, -1, NaN, 1, -1]");
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "hi!" + "'", str19, "hi!");
        org.junit.Assert.assertNotNull(objArray23);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray23), "[100, true, -1, NaN, 1, -1]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray23), "[100, true, -1, NaN, 1, -1]");
        org.junit.Assert.assertNotNull(throwableArray26);
        org.junit.Assert.assertNotNull(strArray32);
        org.junit.Assert.assertNotNull(objArray45);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray45), "[100, true, -1, NaN, 1, -1]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray45), "[100, true, -1, NaN, 1, -1]");
        org.junit.Assert.assertEquals("'" + str47 + "' != '" + "hi!" + "'", str47, "hi!");
        org.junit.Assert.assertNotNull(strArray52);
        org.junit.Assert.assertNotNull(strArray57);
        org.junit.Assert.assertNotNull(throwableArray60);
        org.junit.Assert.assertNotNull(throwableArray61);
        org.junit.Assert.assertEquals("'" + str65 + "' != '" + "org.apache.commons.math.ode.DerivativeException: Dormand-Prince 8 (5, 3)" + "'", str65, "org.apache.commons.math.ode.DerivativeException: Dormand-Prince 8 (5, 3)");
        org.junit.Assert.assertNotNull(strArray76);
        org.junit.Assert.assertEquals("'" + str87 + "' != '" + "org.apache.commons.math.ode.IntegratorException: org.apache.commons.math.ode.IntegratorException: " + "'", str87, "org.apache.commons.math.ode.IntegratorException: org.apache.commons.math.ode.IntegratorException: ");
        org.junit.Assert.assertEquals("'" + str89 + "' != '" + "org.apache.commons.math.ode.IntegratorException: org.apache.commons.math.ode.IntegratorException: org.apache.commons.math.ode.IntegratorException: " + "'", str89, "org.apache.commons.math.ode.IntegratorException: org.apache.commons.math.ode.IntegratorException: org.apache.commons.math.ode.IntegratorException: ");
    }

    @Test
    public void test15561() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest31.test15561");
        org.apache.commons.math.ode.DormandPrince853Integrator dormandPrince853Integrator4 = new org.apache.commons.math.ode.DormandPrince853Integrator((double) (short) -1, (double) (-1L), (double) 0.0f, 0.2d);
        dormandPrince853Integrator4.setMinReduction((double) 1.0f);
        double double7 = dormandPrince853Integrator4.getCurrentStepStart();
        dormandPrince853Integrator4.setMaxGrowth(3.7470125727948562d);
        org.apache.commons.math.ode.DormandPrince853Integrator dormandPrince853Integrator14 = new org.apache.commons.math.ode.DormandPrince853Integrator((double) 10, (double) (byte) 10, (double) (short) 100, (double) 1);
        double double15 = dormandPrince853Integrator14.getSafety();
        double double16 = dormandPrince853Integrator14.getMinStep();
        dormandPrince853Integrator14.setSafety((double) '#');
        double double19 = dormandPrince853Integrator14.getMinStep();
        double double20 = dormandPrince853Integrator14.getCurrentStepStart();
        double double21 = dormandPrince853Integrator14.getMaxGrowth();
        double double22 = dormandPrince853Integrator14.getMaxGrowth();
        double double23 = dormandPrince853Integrator14.getMaxStep();
        java.lang.String str24 = dormandPrince853Integrator14.getName();
        dormandPrince853Integrator14.setInitialStepSize(3.080070288241023d);
        dormandPrince853Integrator14.setMinReduction(10.0d);
        java.lang.String str29 = dormandPrince853Integrator14.getName();
        org.apache.commons.math.ode.DormandPrince853Integrator dormandPrince853Integrator34 = new org.apache.commons.math.ode.DormandPrince853Integrator(1.0d, (double) (byte) 10, (double) (short) 1, (double) 0L);
        double double35 = dormandPrince853Integrator34.getMinStep();
        org.apache.commons.math.ode.SwitchingFunction switchingFunction36 = null;
        dormandPrince853Integrator34.addSwitchingFunction(switchingFunction36, (double) (-1L), (double) '4', 10);
        double double41 = dormandPrince853Integrator34.getCurrentSignedStepsize();
        double double42 = dormandPrince853Integrator34.getMinReduction();
        int int43 = dormandPrince853Integrator34.getOrder();
        double double44 = dormandPrince853Integrator34.getMaxGrowth();
        double double45 = dormandPrince853Integrator34.getCurrentSignedStepsize();
        org.apache.commons.math.ode.StepHandler stepHandler46 = dormandPrince853Integrator34.getStepHandler();
        dormandPrince853Integrator14.setStepHandler(stepHandler46);
        org.apache.commons.math.ode.StepHandler stepHandler48 = dormandPrince853Integrator14.getStepHandler();
        dormandPrince853Integrator14.setSafety((double) ' ');
        org.apache.commons.math.ode.StepHandler stepHandler51 = dormandPrince853Integrator14.getStepHandler();
        org.apache.commons.math.ode.StepHandler stepHandler52 = dormandPrince853Integrator14.getStepHandler();
        dormandPrince853Integrator4.setStepHandler(stepHandler52);
        int int54 = dormandPrince853Integrator4.getOrder();
        org.junit.Assert.assertTrue(Double.isNaN(double7));
        org.junit.Assert.assertTrue("'" + double15 + "' != '" + 0.9d + "'", double15 == 0.9d);
        org.junit.Assert.assertTrue("'" + double16 + "' != '" + 10.0d + "'", double16 == 10.0d);
        org.junit.Assert.assertTrue("'" + double19 + "' != '" + 10.0d + "'", double19 == 10.0d);
        org.junit.Assert.assertTrue(Double.isNaN(double20));
        org.junit.Assert.assertTrue("'" + double21 + "' != '" + 10.0d + "'", double21 == 10.0d);
        org.junit.Assert.assertTrue("'" + double22 + "' != '" + 10.0d + "'", double22 == 10.0d);
        org.junit.Assert.assertTrue("'" + double23 + "' != '" + 10.0d + "'", double23 == 10.0d);
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "Dormand-Prince 8 (5, 3)" + "'", str24, "Dormand-Prince 8 (5, 3)");
        org.junit.Assert.assertEquals("'" + str29 + "' != '" + "Dormand-Prince 8 (5, 3)" + "'", str29, "Dormand-Prince 8 (5, 3)");
        org.junit.Assert.assertTrue("'" + double35 + "' != '" + 1.0d + "'", double35 == 1.0d);
        org.junit.Assert.assertTrue("'" + double41 + "' != '" + 3.1622776601683795d + "'", double41 == 3.1622776601683795d);
        org.junit.Assert.assertTrue("'" + double42 + "' != '" + 0.2d + "'", double42 == 0.2d);
        org.junit.Assert.assertTrue("'" + int43 + "' != '" + 8 + "'", int43 == 8);
        org.junit.Assert.assertTrue("'" + double44 + "' != '" + 10.0d + "'", double44 == 10.0d);
        org.junit.Assert.assertTrue("'" + double45 + "' != '" + 3.1622776601683795d + "'", double45 == 3.1622776601683795d);
        org.junit.Assert.assertNotNull(stepHandler46);
        org.junit.Assert.assertNotNull(stepHandler48);
        org.junit.Assert.assertNotNull(stepHandler51);
        org.junit.Assert.assertNotNull(stepHandler52);
        org.junit.Assert.assertTrue("'" + int54 + "' != '" + 8 + "'", int54 == 8);
    }

    @Test
    public void test15562() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest31.test15562");
        java.lang.String[] strArray5 = new java.lang.String[] {};
        org.apache.commons.math.ode.DerivativeException derivativeException6 = new org.apache.commons.math.ode.DerivativeException("Dormand-Prince 8 (5, 3)", strArray5);
        org.apache.commons.math.ode.DerivativeException derivativeException7 = new org.apache.commons.math.ode.DerivativeException("hi!", strArray5);
        org.apache.commons.math.ode.DerivativeException derivativeException8 = new org.apache.commons.math.ode.DerivativeException("Dormand-Prince 8 (5, 3)", strArray5);
        org.apache.commons.math.ode.IntegratorException integratorException9 = new org.apache.commons.math.ode.IntegratorException("org.apache.commons.math.ode.IntegratorException: hi!", (java.lang.Object[]) strArray5);
        org.apache.commons.math.ode.IntegratorException integratorException10 = new org.apache.commons.math.ode.IntegratorException("org.apache.commons.math.ode.DerivativeException: org.apache.commons.math.ode.DerivativeException: Dormand-Prince 8 (5, 3)", (java.lang.Object[]) strArray5);
        org.apache.commons.math.ode.DerivativeException derivativeException11 = new org.apache.commons.math.ode.DerivativeException((java.lang.Throwable) integratorException10);
        org.junit.Assert.assertNotNull(strArray5);
    }

    @Test
    public void test15563() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest31.test15563");
        java.lang.String[] strArray1 = new java.lang.String[] {};
        org.apache.commons.math.ode.DerivativeException derivativeException2 = new org.apache.commons.math.ode.DerivativeException("Dormand-Prince 8 (5, 3)", strArray1);
        org.apache.commons.math.ode.IntegratorException integratorException3 = new org.apache.commons.math.ode.IntegratorException((java.lang.Throwable) derivativeException2);
        org.apache.commons.math.ode.DerivativeException derivativeException4 = new org.apache.commons.math.ode.DerivativeException((java.lang.Throwable) integratorException3);
        java.lang.Object[] objArray5 = derivativeException4.getArguments();
        java.lang.String[] strArray7 = new java.lang.String[] {};
        org.apache.commons.math.ode.DerivativeException derivativeException8 = new org.apache.commons.math.ode.DerivativeException("Dormand-Prince 8 (5, 3)", strArray7);
        org.apache.commons.math.ode.IntegratorException integratorException9 = new org.apache.commons.math.ode.IntegratorException((java.lang.Throwable) derivativeException8);
        java.lang.String[] strArray12 = new java.lang.String[] {};
        org.apache.commons.math.ode.DerivativeException derivativeException13 = new org.apache.commons.math.ode.DerivativeException("Dormand-Prince 8 (5, 3)", strArray12);
        org.apache.commons.math.ode.DerivativeException derivativeException14 = new org.apache.commons.math.ode.DerivativeException("org.apache.commons.math.ode.IntegratorException: Dormand-Prince 8 (5, 3)", strArray12);
        org.apache.commons.math.ode.DerivativeException derivativeException15 = new org.apache.commons.math.ode.DerivativeException((java.lang.Throwable) derivativeException14);
        integratorException9.addSuppressed((java.lang.Throwable) derivativeException15);
        org.apache.commons.math.ode.DerivativeException derivativeException17 = new org.apache.commons.math.ode.DerivativeException((java.lang.Throwable) integratorException9);
        derivativeException4.addSuppressed((java.lang.Throwable) integratorException9);
        org.apache.commons.math.ode.DerivativeException derivativeException19 = new org.apache.commons.math.ode.DerivativeException((java.lang.Throwable) integratorException9);
        java.lang.String[] strArray21 = new java.lang.String[] {};
        org.apache.commons.math.ode.DerivativeException derivativeException22 = new org.apache.commons.math.ode.DerivativeException("Dormand-Prince 8 (5, 3)", strArray21);
        org.apache.commons.math.ode.IntegratorException integratorException23 = new org.apache.commons.math.ode.IntegratorException((java.lang.Throwable) derivativeException22);
        java.lang.Throwable[] throwableArray24 = integratorException23.getSuppressed();
        java.lang.Object[] objArray32 = new java.lang.Object[] { 100L, true, (-1), Double.NaN, 1, (-1) };
        org.apache.commons.math.ode.IntegratorException integratorException33 = new org.apache.commons.math.ode.IntegratorException("hi!", objArray32);
        integratorException23.addSuppressed((java.lang.Throwable) integratorException33);
        org.apache.commons.math.ode.IntegratorException integratorException35 = new org.apache.commons.math.ode.IntegratorException((java.lang.Throwable) integratorException23);
        java.lang.Throwable[] throwableArray36 = integratorException23.getSuppressed();
        derivativeException19.addSuppressed((java.lang.Throwable) integratorException23);
        java.lang.String str38 = derivativeException19.getPattern();
        java.lang.String[] strArray42 = new java.lang.String[] {};
        org.apache.commons.math.ode.DerivativeException derivativeException43 = new org.apache.commons.math.ode.DerivativeException("Dormand-Prince 8 (5, 3)", strArray42);
        org.apache.commons.math.ode.IntegratorException integratorException44 = new org.apache.commons.math.ode.IntegratorException((java.lang.Throwable) derivativeException43);
        java.lang.Throwable[] throwableArray45 = integratorException44.getSuppressed();
        java.lang.Throwable[] throwableArray46 = integratorException44.getSuppressed();
        org.apache.commons.math.ode.DerivativeException derivativeException47 = new org.apache.commons.math.ode.DerivativeException((java.lang.Throwable) integratorException44);
        java.lang.String str48 = integratorException44.getPattern();
        java.lang.Object[] objArray49 = integratorException44.getArguments();
        org.apache.commons.math.ode.IntegratorException integratorException50 = new org.apache.commons.math.ode.IntegratorException("org.apache.commons.math.ode.IntegratorException", objArray49);
        org.apache.commons.math.ode.IntegratorException integratorException51 = new org.apache.commons.math.ode.IntegratorException("org.apache.commons.math.ode.IntegratorException: Dormand-Prince 8 (5, 3)", objArray49);
        derivativeException19.addSuppressed((java.lang.Throwable) integratorException51);
        org.apache.commons.math.ode.DerivativeException derivativeException53 = new org.apache.commons.math.ode.DerivativeException((java.lang.Throwable) integratorException51);
        java.lang.String str54 = derivativeException53.getPattern();
        org.apache.commons.math.ode.IntegratorException integratorException55 = new org.apache.commons.math.ode.IntegratorException((java.lang.Throwable) derivativeException53);
        java.lang.String str56 = derivativeException53.getPattern();
        org.junit.Assert.assertNotNull(strArray1);
        org.junit.Assert.assertNotNull(objArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray5), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray5), "[]");
        org.junit.Assert.assertNotNull(strArray7);
        org.junit.Assert.assertNotNull(strArray12);
        org.junit.Assert.assertNotNull(strArray21);
        org.junit.Assert.assertNotNull(throwableArray24);
        org.junit.Assert.assertNotNull(objArray32);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray32), "[100, true, -1, NaN, 1, -1]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray32), "[100, true, -1, NaN, 1, -1]");
        org.junit.Assert.assertNotNull(throwableArray36);
        org.junit.Assert.assertEquals("'" + str38 + "' != '" + "Dormand-Prince 8 (5, 3)" + "'", str38, "Dormand-Prince 8 (5, 3)");
        org.junit.Assert.assertNotNull(strArray42);
        org.junit.Assert.assertNotNull(throwableArray45);
        org.junit.Assert.assertNotNull(throwableArray46);
        org.junit.Assert.assertEquals("'" + str48 + "' != '" + "Dormand-Prince 8 (5, 3)" + "'", str48, "Dormand-Prince 8 (5, 3)");
        org.junit.Assert.assertNotNull(objArray49);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray49), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray49), "[]");
        org.junit.Assert.assertEquals("'" + str54 + "' != '" + "org.apache.commons.math.ode.IntegratorException: Dormand-Prince 8 (5, 3)" + "'", str54, "org.apache.commons.math.ode.IntegratorException: Dormand-Prince 8 (5, 3)");
        org.junit.Assert.assertEquals("'" + str56 + "' != '" + "org.apache.commons.math.ode.IntegratorException: Dormand-Prince 8 (5, 3)" + "'", str56, "org.apache.commons.math.ode.IntegratorException: Dormand-Prince 8 (5, 3)");
    }

    @Test
    public void test15564() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest31.test15564");
        double[] doubleArray4 = new double[] {};
        double[] doubleArray5 = new double[] {};
        org.apache.commons.math.ode.DormandPrince853Integrator dormandPrince853Integrator6 = new org.apache.commons.math.ode.DormandPrince853Integrator((double) 1.0f, (double) 1.0f, doubleArray4, doubleArray5);
        double[] doubleArray11 = new double[] {};
        double[] doubleArray12 = new double[] {};
        org.apache.commons.math.ode.DormandPrince853Integrator dormandPrince853Integrator13 = new org.apache.commons.math.ode.DormandPrince853Integrator((double) 1.0f, (double) 1.0f, doubleArray11, doubleArray12);
        double[] doubleArray16 = new double[] {};
        double[] doubleArray17 = new double[] {};
        org.apache.commons.math.ode.DormandPrince853Integrator dormandPrince853Integrator18 = new org.apache.commons.math.ode.DormandPrince853Integrator((double) 1.0f, (double) 1.0f, doubleArray16, doubleArray17);
        org.apache.commons.math.ode.DormandPrince853Integrator dormandPrince853Integrator19 = new org.apache.commons.math.ode.DormandPrince853Integrator((double) ' ', (double) 'a', doubleArray12, doubleArray17);
        org.apache.commons.math.ode.DormandPrince853Integrator dormandPrince853Integrator20 = new org.apache.commons.math.ode.DormandPrince853Integrator(0.9d, (double) 1L, doubleArray4, doubleArray17);
        dormandPrince853Integrator20.setInitialStepSize(0.2d);
        org.apache.commons.math.ode.SwitchingFunction switchingFunction23 = null;
        dormandPrince853Integrator20.addSwitchingFunction(switchingFunction23, 17.78279410038923d, 8.0d, 8);
        org.junit.Assert.assertNotNull(doubleArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray4), "[]");
        org.junit.Assert.assertNotNull(doubleArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray5), "[]");
        org.junit.Assert.assertNotNull(doubleArray11);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray11), "[]");
        org.junit.Assert.assertNotNull(doubleArray12);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray12), "[]");
        org.junit.Assert.assertNotNull(doubleArray16);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray16), "[]");
        org.junit.Assert.assertNotNull(doubleArray17);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray17), "[]");
    }

    @Test
    public void test15565() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest31.test15565");
        org.apache.commons.math.ode.DormandPrince853Integrator dormandPrince853Integrator4 = new org.apache.commons.math.ode.DormandPrince853Integrator(1.0d, (double) (byte) 10, (double) (short) 1, (double) 0L);
        org.apache.commons.math.ode.StepHandler stepHandler5 = null;
        dormandPrince853Integrator4.setStepHandler(stepHandler5);
        double double7 = dormandPrince853Integrator4.getMaxStep();
        java.lang.String str8 = dormandPrince853Integrator4.getName();
        org.apache.commons.math.ode.StepHandler stepHandler9 = dormandPrince853Integrator4.getStepHandler();
        int int10 = dormandPrince853Integrator4.getOrder();
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 10.0d + "'", double7 == 10.0d);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Dormand-Prince 8 (5, 3)" + "'", str8, "Dormand-Prince 8 (5, 3)");
        org.junit.Assert.assertNull(stepHandler9);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 8 + "'", int10 == 8);
    }

    @Test
    public void test15566() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest31.test15566");
        org.apache.commons.math.ode.DormandPrince853Integrator dormandPrince853Integrator4 = new org.apache.commons.math.ode.DormandPrince853Integrator((double) 10, (double) (byte) 10, (double) (short) 100, (double) 1);
        double double5 = dormandPrince853Integrator4.getSafety();
        double double6 = dormandPrince853Integrator4.getMinStep();
        double double7 = dormandPrince853Integrator4.getMinStep();
        double double8 = dormandPrince853Integrator4.getCurrentSignedStepsize();
        org.apache.commons.math.ode.StepHandler stepHandler9 = null;
        dormandPrince853Integrator4.setStepHandler(stepHandler9);
        double double11 = dormandPrince853Integrator4.getCurrentStepStart();
        dormandPrince853Integrator4.setSafety(0.9d);
        double double14 = dormandPrince853Integrator4.getMinStep();
        java.lang.String str15 = dormandPrince853Integrator4.getName();
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.9d + "'", double5 == 0.9d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 10.0d + "'", double6 == 10.0d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 10.0d + "'", double7 == 10.0d);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 10.0d + "'", double8 == 10.0d);
        org.junit.Assert.assertTrue(Double.isNaN(double11));
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + 10.0d + "'", double14 == 10.0d);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "Dormand-Prince 8 (5, 3)" + "'", str15, "Dormand-Prince 8 (5, 3)");
    }

    @Test
    public void test15567() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest31.test15567");
        java.lang.String[] strArray11 = new java.lang.String[] {};
        org.apache.commons.math.ode.DerivativeException derivativeException12 = new org.apache.commons.math.ode.DerivativeException("Dormand-Prince 8 (5, 3)", strArray11);
        org.apache.commons.math.ode.DerivativeException derivativeException13 = new org.apache.commons.math.ode.DerivativeException("org.apache.commons.math.ode.IntegratorException: Dormand-Prince 8 (5, 3)", strArray11);
        org.apache.commons.math.ode.IntegratorException integratorException14 = new org.apache.commons.math.ode.IntegratorException("hi!", (java.lang.Object[]) strArray11);
        org.apache.commons.math.ode.DerivativeException derivativeException15 = new org.apache.commons.math.ode.DerivativeException("org.apache.commons.math.ode.IntegratorException: Dormand-Prince 8 (5, 3)", strArray11);
        org.apache.commons.math.ode.DerivativeException derivativeException16 = new org.apache.commons.math.ode.DerivativeException("org.apache.commons.math.ode.DerivativeException: Dormand-Prince 8 (5, 3)", strArray11);
        org.apache.commons.math.ode.DerivativeException derivativeException17 = new org.apache.commons.math.ode.DerivativeException("org.apache.commons.math.ode.IntegratorException: ", strArray11);
        org.apache.commons.math.ode.IntegratorException integratorException18 = new org.apache.commons.math.ode.IntegratorException("org.apache.commons.math.ode.DerivativeException: Dormand-Prince 8 (5, 3)", (java.lang.Object[]) strArray11);
        org.apache.commons.math.ode.IntegratorException integratorException19 = new org.apache.commons.math.ode.IntegratorException("org.apache.commons.math.ode.IntegratorException: org.apache.commons.math.ode.IntegratorException: Dormand-Prince 8 (5, 3)", (java.lang.Object[]) strArray11);
        org.apache.commons.math.ode.DerivativeException derivativeException20 = new org.apache.commons.math.ode.DerivativeException("org.apache.commons.math.ode.IntegratorException: org.apache.commons.math.ode.DerivativeException: org.apache.commons.math.ode.IntegratorException: ", strArray11);
        org.apache.commons.math.ode.DerivativeException derivativeException21 = new org.apache.commons.math.ode.DerivativeException("org.apache.commons.math.ode.DerivativeException: ", strArray11);
        org.apache.commons.math.ode.DerivativeException derivativeException22 = new org.apache.commons.math.ode.DerivativeException("org.apache.commons.math.ode.DerivativeException: org.apache.commons.math.ode.DerivativeException: org.apache.commons.math.ode.DerivativeException: Dormand-Prince 8 (5, 3)", strArray11);
        java.lang.Object[] objArray23 = derivativeException22.getArguments();
        org.junit.Assert.assertNotNull(strArray11);
        org.junit.Assert.assertNotNull(objArray23);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray23), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray23), "[]");
    }

    @Test
    public void test15568() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest31.test15568");
        org.apache.commons.math.ode.DormandPrince853Integrator dormandPrince853Integrator4 = new org.apache.commons.math.ode.DormandPrince853Integrator((double) 10, (double) (byte) 10, (double) (short) 100, (double) 1);
        dormandPrince853Integrator4.setSafety((double) '#');
        dormandPrince853Integrator4.setMaxGrowth((double) 100.0f);
        java.lang.String str9 = dormandPrince853Integrator4.getName();
        double double10 = dormandPrince853Integrator4.getSafety();
        dormandPrince853Integrator4.setMaxGrowth((double) (short) 1);
        java.lang.String str13 = dormandPrince853Integrator4.getName();
        double double14 = dormandPrince853Integrator4.getMinStep();
        int int15 = dormandPrince853Integrator4.getOrder();
        dormandPrince853Integrator4.setMinReduction((double) 'a');
        dormandPrince853Integrator4.setInitialStepSize(62.30055074422899d);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "Dormand-Prince 8 (5, 3)" + "'", str9, "Dormand-Prince 8 (5, 3)");
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 35.0d + "'", double10 == 35.0d);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "Dormand-Prince 8 (5, 3)" + "'", str13, "Dormand-Prince 8 (5, 3)");
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + 10.0d + "'", double14 == 10.0d);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 8 + "'", int15 == 8);
    }

    @Test
    public void test15569() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest31.test15569");
        org.apache.commons.math.ode.DormandPrince853Integrator dormandPrince853Integrator4 = new org.apache.commons.math.ode.DormandPrince853Integrator(0.0d, (double) 100, (double) (-1.0f), 3.1622776601683795d);
        dormandPrince853Integrator4.setMaxGrowth(0.0d);
        dormandPrince853Integrator4.setMinReduction((double) 1L);
        org.apache.commons.math.ode.StepHandler stepHandler9 = dormandPrince853Integrator4.getStepHandler();
        java.lang.String str10 = dormandPrince853Integrator4.getName();
        org.apache.commons.math.ode.DormandPrince853Integrator dormandPrince853Integrator15 = new org.apache.commons.math.ode.DormandPrince853Integrator(1.0d, (double) (byte) 10, (double) (short) 1, (double) 0L);
        double double16 = dormandPrince853Integrator15.getMinStep();
        int int17 = dormandPrince853Integrator15.getOrder();
        org.apache.commons.math.ode.DormandPrince853Integrator dormandPrince853Integrator22 = new org.apache.commons.math.ode.DormandPrince853Integrator((double) 10, (double) (byte) 10, (double) (short) 100, (double) 1);
        double double23 = dormandPrince853Integrator22.getSafety();
        double double24 = dormandPrince853Integrator22.getMinStep();
        double double25 = dormandPrince853Integrator22.getMinStep();
        double double26 = dormandPrince853Integrator22.getCurrentSignedStepsize();
        int int27 = dormandPrince853Integrator22.getOrder();
        double double28 = dormandPrince853Integrator22.getMaxGrowth();
        org.apache.commons.math.ode.StepHandler stepHandler29 = dormandPrince853Integrator22.getStepHandler();
        dormandPrince853Integrator15.setStepHandler(stepHandler29);
        dormandPrince853Integrator4.setStepHandler(stepHandler29);
        double double32 = dormandPrince853Integrator4.getCurrentSignedStepsize();
        org.apache.commons.math.ode.SwitchingFunction switchingFunction33 = null;
        dormandPrince853Integrator4.addSwitchingFunction(switchingFunction33, 0.2d, (double) 'a', (int) (short) -1);
        org.apache.commons.math.ode.DormandPrince853Integrator dormandPrince853Integrator42 = new org.apache.commons.math.ode.DormandPrince853Integrator((double) 10, (double) (byte) 10, (double) (short) 100, (double) 1);
        dormandPrince853Integrator42.setSafety((double) '#');
        dormandPrince853Integrator42.setMaxGrowth((double) 100.0f);
        java.lang.String str47 = dormandPrince853Integrator42.getName();
        double double48 = dormandPrince853Integrator42.getSafety();
        double double49 = dormandPrince853Integrator42.getMaxGrowth();
        double double50 = dormandPrince853Integrator42.getMaxStep();
        org.apache.commons.math.ode.StepHandler stepHandler51 = dormandPrince853Integrator42.getStepHandler();
        dormandPrince853Integrator4.setStepHandler(stepHandler51);
        double double53 = dormandPrince853Integrator4.getMinReduction();
        dormandPrince853Integrator4.setSafety((double) 10L);
        java.lang.String str56 = dormandPrince853Integrator4.getName();
        double double57 = dormandPrince853Integrator4.getMinStep();
        dormandPrince853Integrator4.setMinReduction(17.88854381999832d);
        org.junit.Assert.assertNotNull(stepHandler9);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "Dormand-Prince 8 (5, 3)" + "'", str10, "Dormand-Prince 8 (5, 3)");
        org.junit.Assert.assertTrue("'" + double16 + "' != '" + 1.0d + "'", double16 == 1.0d);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 8 + "'", int17 == 8);
        org.junit.Assert.assertTrue("'" + double23 + "' != '" + 0.9d + "'", double23 == 0.9d);
        org.junit.Assert.assertTrue("'" + double24 + "' != '" + 10.0d + "'", double24 == 10.0d);
        org.junit.Assert.assertTrue("'" + double25 + "' != '" + 10.0d + "'", double25 == 10.0d);
        org.junit.Assert.assertTrue("'" + double26 + "' != '" + 10.0d + "'", double26 == 10.0d);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 8 + "'", int27 == 8);
        org.junit.Assert.assertTrue("'" + double28 + "' != '" + 10.0d + "'", double28 == 10.0d);
        org.junit.Assert.assertNotNull(stepHandler29);
        org.junit.Assert.assertTrue("'" + double32 + "' != '" + 0.0d + "'", double32 == 0.0d);
        org.junit.Assert.assertEquals("'" + str47 + "' != '" + "Dormand-Prince 8 (5, 3)" + "'", str47, "Dormand-Prince 8 (5, 3)");
        org.junit.Assert.assertTrue("'" + double48 + "' != '" + 35.0d + "'", double48 == 35.0d);
        org.junit.Assert.assertTrue("'" + double49 + "' != '" + 100.0d + "'", double49 == 100.0d);
        org.junit.Assert.assertTrue("'" + double50 + "' != '" + 10.0d + "'", double50 == 10.0d);
        org.junit.Assert.assertNotNull(stepHandler51);
        org.junit.Assert.assertTrue("'" + double53 + "' != '" + 1.0d + "'", double53 == 1.0d);
        org.junit.Assert.assertEquals("'" + str56 + "' != '" + "Dormand-Prince 8 (5, 3)" + "'", str56, "Dormand-Prince 8 (5, 3)");
        org.junit.Assert.assertTrue("'" + double57 + "' != '" + 0.0d + "'", double57 == 0.0d);
    }

    @Test
    public void test15570() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest31.test15570");
        java.lang.String[] strArray4 = new java.lang.String[] {};
        org.apache.commons.math.ode.DerivativeException derivativeException5 = new org.apache.commons.math.ode.DerivativeException("Dormand-Prince 8 (5, 3)", strArray4);
        org.apache.commons.math.ode.DerivativeException derivativeException6 = new org.apache.commons.math.ode.DerivativeException("hi!", strArray4);
        org.apache.commons.math.ode.IntegratorException integratorException7 = new org.apache.commons.math.ode.IntegratorException("org.apache.commons.math.ode.DerivativeException", (java.lang.Object[]) strArray4);
        org.apache.commons.math.ode.DerivativeException derivativeException8 = new org.apache.commons.math.ode.DerivativeException("org.apache.commons.math.ode.IntegratorException: hi!", strArray4);
        java.lang.Object[] objArray9 = derivativeException8.getArguments();
        java.lang.Throwable[] throwableArray10 = derivativeException8.getSuppressed();
        org.apache.commons.math.ode.IntegratorException integratorException11 = new org.apache.commons.math.ode.IntegratorException((java.lang.Throwable) derivativeException8);
        java.lang.Throwable[] throwableArray12 = derivativeException8.getSuppressed();
        org.junit.Assert.assertNotNull(strArray4);
        org.junit.Assert.assertNotNull(objArray9);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray9), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray9), "[]");
        org.junit.Assert.assertNotNull(throwableArray10);
        org.junit.Assert.assertNotNull(throwableArray12);
    }

    @Test
    public void test15571() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest31.test15571");
        org.apache.commons.math.ode.DormandPrince853Integrator dormandPrince853Integrator4 = new org.apache.commons.math.ode.DormandPrince853Integrator((double) 10, (double) (byte) 10, (double) (short) 100, (double) 1);
        double double5 = dormandPrince853Integrator4.getSafety();
        double double6 = dormandPrince853Integrator4.getMinStep();
        java.lang.String str7 = dormandPrince853Integrator4.getName();
        double double8 = dormandPrince853Integrator4.getMaxStep();
        dormandPrince853Integrator4.setMaxGrowth((double) (short) -1);
        dormandPrince853Integrator4.setSafety((double) 100L);
        org.apache.commons.math.ode.SwitchingFunction switchingFunction13 = null;
        dormandPrince853Integrator4.addSwitchingFunction(switchingFunction13, (double) (byte) 100, (double) (-1.0f), (int) (byte) 1);
        double double18 = dormandPrince853Integrator4.getMaxGrowth();
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.9d + "'", double5 == 0.9d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 10.0d + "'", double6 == 10.0d);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "Dormand-Prince 8 (5, 3)" + "'", str7, "Dormand-Prince 8 (5, 3)");
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 10.0d + "'", double8 == 10.0d);
        org.junit.Assert.assertTrue("'" + double18 + "' != '" + (-1.0d) + "'", double18 == (-1.0d));
    }

    @Test
    public void test15572() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest31.test15572");
        java.lang.String[] strArray9 = new java.lang.String[] {};
        org.apache.commons.math.ode.DerivativeException derivativeException10 = new org.apache.commons.math.ode.DerivativeException("Dormand-Prince 8 (5, 3)", strArray9);
        org.apache.commons.math.ode.DerivativeException derivativeException11 = new org.apache.commons.math.ode.DerivativeException("hi!", strArray9);
        org.apache.commons.math.ode.DerivativeException derivativeException12 = new org.apache.commons.math.ode.DerivativeException("hi!", strArray9);
        org.apache.commons.math.ode.DerivativeException derivativeException13 = new org.apache.commons.math.ode.DerivativeException("hi!", strArray9);
        org.apache.commons.math.ode.IntegratorException integratorException14 = new org.apache.commons.math.ode.IntegratorException("org.apache.commons.math.ode.DerivativeException: Dormand-Prince 8 (5, 3)", (java.lang.Object[]) strArray9);
        org.apache.commons.math.ode.DerivativeException derivativeException15 = new org.apache.commons.math.ode.DerivativeException("org.apache.commons.math.ode.IntegratorException: ", strArray9);
        org.apache.commons.math.ode.DerivativeException derivativeException16 = new org.apache.commons.math.ode.DerivativeException("", strArray9);
        org.apache.commons.math.ode.IntegratorException integratorException17 = new org.apache.commons.math.ode.IntegratorException("org.apache.commons.math.ode.IntegratorException: ", (java.lang.Object[]) strArray9);
        org.apache.commons.math.ode.DerivativeException derivativeException18 = new org.apache.commons.math.ode.DerivativeException("org.apache.commons.math.ode.IntegratorException: hi!", strArray9);
        java.lang.Object[] objArray27 = new java.lang.Object[] { 100L, true, (-1), Double.NaN, 1, (-1) };
        org.apache.commons.math.ode.IntegratorException integratorException28 = new org.apache.commons.math.ode.IntegratorException("hi!", objArray27);
        java.lang.String str29 = integratorException28.getPattern();
        org.apache.commons.math.ode.DerivativeException derivativeException30 = new org.apache.commons.math.ode.DerivativeException((java.lang.Throwable) integratorException28);
        org.apache.commons.math.ode.DerivativeException derivativeException31 = new org.apache.commons.math.ode.DerivativeException((java.lang.Throwable) integratorException28);
        org.apache.commons.math.ode.DerivativeException derivativeException32 = new org.apache.commons.math.ode.DerivativeException((java.lang.Throwable) derivativeException31);
        java.lang.String str33 = derivativeException31.getPattern();
        java.lang.Throwable[] throwableArray34 = derivativeException31.getSuppressed();
        org.apache.commons.math.ode.IntegratorException integratorException35 = new org.apache.commons.math.ode.IntegratorException("hi!", (java.lang.Object[]) throwableArray34);
        derivativeException18.addSuppressed((java.lang.Throwable) integratorException35);
        java.lang.String[] strArray38 = new java.lang.String[] {};
        org.apache.commons.math.ode.DerivativeException derivativeException39 = new org.apache.commons.math.ode.DerivativeException("Dormand-Prince 8 (5, 3)", strArray38);
        org.apache.commons.math.ode.IntegratorException integratorException40 = new org.apache.commons.math.ode.IntegratorException((java.lang.Throwable) derivativeException39);
        java.lang.Throwable[] throwableArray41 = integratorException40.getSuppressed();
        java.lang.Throwable[] throwableArray42 = integratorException40.getSuppressed();
        org.apache.commons.math.ode.DerivativeException derivativeException43 = new org.apache.commons.math.ode.DerivativeException((java.lang.Throwable) integratorException40);
        java.lang.Object[] objArray44 = integratorException40.getArguments();
        integratorException35.addSuppressed((java.lang.Throwable) integratorException40);
        java.lang.Object[] objArray46 = integratorException35.getArguments();
        java.lang.Throwable[] throwableArray47 = integratorException35.getSuppressed();
        java.lang.String[] strArray49 = new java.lang.String[] {};
        org.apache.commons.math.ode.DerivativeException derivativeException50 = new org.apache.commons.math.ode.DerivativeException("Dormand-Prince 8 (5, 3)", strArray49);
        org.apache.commons.math.ode.IntegratorException integratorException51 = new org.apache.commons.math.ode.IntegratorException((java.lang.Throwable) derivativeException50);
        org.apache.commons.math.ode.DerivativeException derivativeException52 = new org.apache.commons.math.ode.DerivativeException((java.lang.Throwable) derivativeException50);
        java.lang.Object[] objArray53 = derivativeException50.getArguments();
        java.lang.String[] strArray58 = new java.lang.String[] {};
        org.apache.commons.math.ode.DerivativeException derivativeException59 = new org.apache.commons.math.ode.DerivativeException("Dormand-Prince 8 (5, 3)", strArray58);
        org.apache.commons.math.ode.DerivativeException derivativeException60 = new org.apache.commons.math.ode.DerivativeException("org.apache.commons.math.ode.IntegratorException: Dormand-Prince 8 (5, 3)", strArray58);
        org.apache.commons.math.ode.IntegratorException integratorException61 = new org.apache.commons.math.ode.IntegratorException("hi!", (java.lang.Object[]) strArray58);
        org.apache.commons.math.ode.DerivativeException derivativeException62 = new org.apache.commons.math.ode.DerivativeException("org.apache.commons.math.ode.IntegratorException: Dormand-Prince 8 (5, 3)", strArray58);
        org.apache.commons.math.ode.DerivativeException derivativeException63 = new org.apache.commons.math.ode.DerivativeException((java.lang.Throwable) derivativeException62);
        org.apache.commons.math.ode.DerivativeException derivativeException64 = new org.apache.commons.math.ode.DerivativeException((java.lang.Throwable) derivativeException62);
        org.apache.commons.math.ode.IntegratorException integratorException65 = new org.apache.commons.math.ode.IntegratorException((java.lang.Throwable) derivativeException62);
        java.lang.Object[] objArray66 = derivativeException62.getArguments();
        org.apache.commons.math.ode.DerivativeException derivativeException67 = new org.apache.commons.math.ode.DerivativeException((java.lang.Throwable) derivativeException62);
        derivativeException50.addSuppressed((java.lang.Throwable) derivativeException67);
        java.lang.Throwable[] throwableArray69 = derivativeException67.getSuppressed();
        org.apache.commons.math.ode.IntegratorException integratorException70 = new org.apache.commons.math.ode.IntegratorException((java.lang.Throwable) derivativeException67);
        integratorException35.addSuppressed((java.lang.Throwable) integratorException70);
        org.apache.commons.math.ode.DerivativeException derivativeException72 = new org.apache.commons.math.ode.DerivativeException((java.lang.Throwable) integratorException35);
        org.junit.Assert.assertNotNull(strArray9);
        org.junit.Assert.assertNotNull(objArray27);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray27), "[100, true, -1, NaN, 1, -1]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray27), "[100, true, -1, NaN, 1, -1]");
        org.junit.Assert.assertEquals("'" + str29 + "' != '" + "hi!" + "'", str29, "hi!");
        org.junit.Assert.assertEquals("'" + str33 + "' != '" + "hi!" + "'", str33, "hi!");
        org.junit.Assert.assertNotNull(throwableArray34);
        org.junit.Assert.assertNotNull(strArray38);
        org.junit.Assert.assertNotNull(throwableArray41);
        org.junit.Assert.assertNotNull(throwableArray42);
        org.junit.Assert.assertNotNull(objArray44);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray44), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray44), "[]");
        org.junit.Assert.assertNotNull(objArray46);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray46), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray46), "[]");
        org.junit.Assert.assertNotNull(throwableArray47);
        org.junit.Assert.assertNotNull(strArray49);
        org.junit.Assert.assertNotNull(objArray53);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray53), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray53), "[]");
        org.junit.Assert.assertNotNull(strArray58);
        org.junit.Assert.assertNotNull(objArray66);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray66), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray66), "[]");
        org.junit.Assert.assertNotNull(throwableArray69);
    }

    @Test
    public void test15573() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest31.test15573");
        org.apache.commons.math.ode.DormandPrince853Integrator dormandPrince853Integrator4 = new org.apache.commons.math.ode.DormandPrince853Integrator((double) (byte) -1, (double) 'a', (double) 10, (double) (short) -1);
        dormandPrince853Integrator4.setMaxGrowth((double) (byte) 1);
        double double7 = dormandPrince853Integrator4.getSafety();
        double double8 = dormandPrince853Integrator4.getMaxStep();
        org.apache.commons.math.ode.DormandPrince853Integrator dormandPrince853Integrator13 = new org.apache.commons.math.ode.DormandPrince853Integrator((double) 10, (double) (byte) 10, (double) (short) 100, (double) 1);
        double double14 = dormandPrince853Integrator13.getSafety();
        dormandPrince853Integrator13.setMinReduction((double) (short) -1);
        dormandPrince853Integrator13.setInitialStepSize((double) (byte) 1);
        dormandPrince853Integrator13.setSafety(0.9486832980505138d);
        double double21 = dormandPrince853Integrator13.getCurrentSignedStepsize();
        double double22 = dormandPrince853Integrator13.getMaxStep();
        org.apache.commons.math.ode.StepHandler stepHandler23 = dormandPrince853Integrator13.getStepHandler();
        dormandPrince853Integrator4.setStepHandler(stepHandler23);
        double double25 = dormandPrince853Integrator4.getMinReduction();
        dormandPrince853Integrator4.setMaxGrowth(31.71666350274487d);
        dormandPrince853Integrator4.setSafety(28.14741180563606d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 0.9d + "'", double7 == 0.9d);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 97.0d + "'", double8 == 97.0d);
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + 0.9d + "'", double14 == 0.9d);
        org.junit.Assert.assertTrue("'" + double21 + "' != '" + 10.0d + "'", double21 == 10.0d);
        org.junit.Assert.assertTrue("'" + double22 + "' != '" + 10.0d + "'", double22 == 10.0d);
        org.junit.Assert.assertNotNull(stepHandler23);
        org.junit.Assert.assertTrue("'" + double25 + "' != '" + 0.2d + "'", double25 == 0.2d);
    }

    @Test
    public void test15574() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest31.test15574");
        org.apache.commons.math.ode.DormandPrince853Integrator dormandPrince853Integrator4 = new org.apache.commons.math.ode.DormandPrince853Integrator((double) 100.0f, (double) (-1L), 56.23413251903491d, (double) 10.0f);
    }

    @Test
    public void test15575() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest31.test15575");
        org.apache.commons.math.ode.DormandPrince853Integrator dormandPrince853Integrator4 = new org.apache.commons.math.ode.DormandPrince853Integrator((double) 10, (double) (byte) 10, (double) (short) 100, (double) 1);
        double double5 = dormandPrince853Integrator4.getSafety();
        double double6 = dormandPrince853Integrator4.getMinStep();
        double double7 = dormandPrince853Integrator4.getMinStep();
        double double8 = dormandPrince853Integrator4.getCurrentSignedStepsize();
        int int9 = dormandPrince853Integrator4.getOrder();
        double double10 = dormandPrince853Integrator4.getSafety();
        double double11 = dormandPrince853Integrator4.getMinStep();
        dormandPrince853Integrator4.setSafety((-1.0d));
        double double14 = dormandPrince853Integrator4.getMinStep();
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.9d + "'", double5 == 0.9d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 10.0d + "'", double6 == 10.0d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 10.0d + "'", double7 == 10.0d);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 10.0d + "'", double8 == 10.0d);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 8 + "'", int9 == 8);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 0.9d + "'", double10 == 0.9d);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 10.0d + "'", double11 == 10.0d);
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + 10.0d + "'", double14 == 10.0d);
    }

    @Test
    public void test15576() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest31.test15576");
        org.apache.commons.math.ode.DormandPrince853Integrator dormandPrince853Integrator4 = new org.apache.commons.math.ode.DormandPrince853Integrator((double) 10, (double) (byte) 10, (double) (short) 100, (double) 1);
        double double5 = dormandPrince853Integrator4.getSafety();
        double double6 = dormandPrince853Integrator4.getMinStep();
        java.lang.String str7 = dormandPrince853Integrator4.getName();
        int int8 = dormandPrince853Integrator4.getOrder();
        org.apache.commons.math.ode.StepHandler stepHandler9 = dormandPrince853Integrator4.getStepHandler();
        org.apache.commons.math.ode.StepHandler stepHandler10 = dormandPrince853Integrator4.getStepHandler();
        dormandPrince853Integrator4.setMinReduction((-0.0d));
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.9d + "'", double5 == 0.9d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 10.0d + "'", double6 == 10.0d);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "Dormand-Prince 8 (5, 3)" + "'", str7, "Dormand-Prince 8 (5, 3)");
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 8 + "'", int8 == 8);
        org.junit.Assert.assertNotNull(stepHandler9);
        org.junit.Assert.assertNotNull(stepHandler10);
    }

    @Test
    public void test15577() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest31.test15577");
        org.apache.commons.math.ode.DormandPrince853Integrator dormandPrince853Integrator4 = new org.apache.commons.math.ode.DormandPrince853Integrator((double) (-1.0f), (double) (byte) 100, (double) (-1L), (double) (byte) -1);
        double double5 = dormandPrince853Integrator4.getMaxStep();
        double double6 = dormandPrince853Integrator4.getMaxStep();
        double double7 = dormandPrince853Integrator4.getMaxGrowth();
        dormandPrince853Integrator4.setMinReduction((double) (short) 100);
        double double10 = dormandPrince853Integrator4.getMaxStep();
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 100.0d + "'", double5 == 100.0d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 100.0d + "'", double6 == 100.0d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 10.0d + "'", double7 == 10.0d);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 100.0d + "'", double10 == 100.0d);
    }

    @Test
    public void test15578() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest31.test15578");
        java.lang.Throwable throwable0 = null;
        org.apache.commons.math.ode.IntegratorException integratorException1 = new org.apache.commons.math.ode.IntegratorException(throwable0);
        org.apache.commons.math.ode.DerivativeException derivativeException2 = new org.apache.commons.math.ode.DerivativeException((java.lang.Throwable) integratorException1);
        java.lang.String[] strArray4 = new java.lang.String[] {};
        org.apache.commons.math.ode.DerivativeException derivativeException5 = new org.apache.commons.math.ode.DerivativeException("Dormand-Prince 8 (5, 3)", strArray4);
        org.apache.commons.math.ode.IntegratorException integratorException6 = new org.apache.commons.math.ode.IntegratorException((java.lang.Throwable) derivativeException5);
        java.lang.Throwable[] throwableArray7 = integratorException6.getSuppressed();
        java.lang.Throwable[] throwableArray8 = integratorException6.getSuppressed();
        java.lang.Object[] objArray9 = integratorException6.getArguments();
        integratorException1.addSuppressed((java.lang.Throwable) integratorException6);
        org.apache.commons.math.ode.IntegratorException integratorException11 = new org.apache.commons.math.ode.IntegratorException((java.lang.Throwable) integratorException6);
        java.lang.Throwable[] throwableArray12 = integratorException6.getSuppressed();
        org.junit.Assert.assertNotNull(strArray4);
        org.junit.Assert.assertNotNull(throwableArray7);
        org.junit.Assert.assertNotNull(throwableArray8);
        org.junit.Assert.assertNotNull(objArray9);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray9), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray9), "[]");
        org.junit.Assert.assertNotNull(throwableArray12);
    }

    @Test
    public void test15579() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest31.test15579");
        org.apache.commons.math.ode.DormandPrince853Integrator dormandPrince853Integrator4 = new org.apache.commons.math.ode.DormandPrince853Integrator(1.0d, (double) (byte) 10, (double) (short) 1, (double) 0L);
        double double5 = dormandPrince853Integrator4.getMinStep();
        java.lang.String str6 = dormandPrince853Integrator4.getName();
        org.apache.commons.math.ode.SwitchingFunction switchingFunction7 = null;
        dormandPrince853Integrator4.addSwitchingFunction(switchingFunction7, (double) (-1), (double) (short) 0, 0);
        double double12 = dormandPrince853Integrator4.getMaxStep();
        org.apache.commons.math.ode.SwitchingFunction switchingFunction13 = null;
        dormandPrince853Integrator4.addSwitchingFunction(switchingFunction13, 17.78279410038923d, 32.0d, 1);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 1.0d + "'", double5 == 1.0d);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Dormand-Prince 8 (5, 3)" + "'", str6, "Dormand-Prince 8 (5, 3)");
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 10.0d + "'", double12 == 10.0d);
    }

    @Test
    public void test15580() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest31.test15580");
        java.lang.String[] strArray7 = new java.lang.String[] {};
        org.apache.commons.math.ode.DerivativeException derivativeException8 = new org.apache.commons.math.ode.DerivativeException("Dormand-Prince 8 (5, 3)", strArray7);
        org.apache.commons.math.ode.DerivativeException derivativeException9 = new org.apache.commons.math.ode.DerivativeException("hi!", strArray7);
        org.apache.commons.math.ode.DerivativeException derivativeException10 = new org.apache.commons.math.ode.DerivativeException("hi!", strArray7);
        org.apache.commons.math.ode.DerivativeException derivativeException11 = new org.apache.commons.math.ode.DerivativeException("hi!", strArray7);
        org.apache.commons.math.ode.DerivativeException derivativeException12 = new org.apache.commons.math.ode.DerivativeException("org.apache.commons.math.ode.IntegratorException: ", strArray7);
        org.apache.commons.math.ode.DerivativeException derivativeException13 = new org.apache.commons.math.ode.DerivativeException("org.apache.commons.math.ode.DerivativeException: org.apache.commons.math.ode.IntegratorException: hi!", strArray7);
        org.apache.commons.math.ode.DerivativeException derivativeException14 = new org.apache.commons.math.ode.DerivativeException("org.apache.commons.math.ode.IntegratorException: org.apache.commons.math.ode.IntegratorException: Dormand-Prince 8 (5, 3)", strArray7);
        org.apache.commons.math.ode.DerivativeException derivativeException15 = new org.apache.commons.math.ode.DerivativeException((java.lang.Throwable) derivativeException14);
        org.junit.Assert.assertNotNull(strArray7);
    }

    @Test
    public void test15581() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest31.test15581");
        org.apache.commons.math.ode.DormandPrince853Integrator dormandPrince853Integrator4 = new org.apache.commons.math.ode.DormandPrince853Integrator(3.080070288241023d, 10.0d, (double) (short) -1, 32.0d);
        org.apache.commons.math.ode.SwitchingFunction switchingFunction5 = null;
        dormandPrince853Integrator4.addSwitchingFunction(switchingFunction5, (double) (byte) 0, 0.0d, 1);
        double double10 = dormandPrince853Integrator4.getMaxStep();
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 10.0d + "'", double10 == 10.0d);
    }

    @Test
    public void test15582() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest31.test15582");
        java.lang.String[] strArray11 = new java.lang.String[] {};
        org.apache.commons.math.ode.DerivativeException derivativeException12 = new org.apache.commons.math.ode.DerivativeException("Dormand-Prince 8 (5, 3)", strArray11);
        org.apache.commons.math.ode.DerivativeException derivativeException13 = new org.apache.commons.math.ode.DerivativeException("hi!", strArray11);
        org.apache.commons.math.ode.DerivativeException derivativeException14 = new org.apache.commons.math.ode.DerivativeException("hi!", strArray11);
        org.apache.commons.math.ode.IntegratorException integratorException15 = new org.apache.commons.math.ode.IntegratorException("org.apache.commons.math.ode.IntegratorException: hi!", (java.lang.Object[]) strArray11);
        org.apache.commons.math.ode.IntegratorException integratorException16 = new org.apache.commons.math.ode.IntegratorException("org.apache.commons.math.ode.DerivativeException: Dormand-Prince 8 (5, 3)", (java.lang.Object[]) strArray11);
        org.apache.commons.math.ode.IntegratorException integratorException17 = new org.apache.commons.math.ode.IntegratorException("org.apache.commons.math.ode.DerivativeException: org.apache.commons.math.ode.IntegratorException: Dormand-Prince 8 (5, 3)", (java.lang.Object[]) strArray11);
        org.apache.commons.math.ode.DerivativeException derivativeException18 = new org.apache.commons.math.ode.DerivativeException("org.apache.commons.math.ode.IntegratorException: ", strArray11);
        org.apache.commons.math.ode.DerivativeException derivativeException19 = new org.apache.commons.math.ode.DerivativeException("org.apache.commons.math.ode.IntegratorException: org.apache.commons.math.ode.DerivativeException: ", strArray11);
        org.apache.commons.math.ode.DerivativeException derivativeException20 = new org.apache.commons.math.ode.DerivativeException("org.apache.commons.math.ode.IntegratorException: ", strArray11);
        org.apache.commons.math.ode.DerivativeException derivativeException21 = new org.apache.commons.math.ode.DerivativeException("", strArray11);
        org.apache.commons.math.ode.IntegratorException integratorException22 = new org.apache.commons.math.ode.IntegratorException("org.apache.commons.math.ode.IntegratorException: org.apache.commons.math.ode.IntegratorException: org.apache.commons.math.ode.DerivativeException: org.apache.commons.math.ode.DerivativeException: ", (java.lang.Object[]) strArray11);
        org.junit.Assert.assertNotNull(strArray11);
    }

    @Test
    public void test15583() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest31.test15583");
        org.apache.commons.math.ode.DormandPrince853Integrator dormandPrince853Integrator4 = new org.apache.commons.math.ode.DormandPrince853Integrator((double) 10, (double) (byte) 10, (double) (short) 100, (double) 1);
        double double5 = dormandPrince853Integrator4.getSafety();
        double double6 = dormandPrince853Integrator4.getMinStep();
        dormandPrince853Integrator4.setSafety((double) '#');
        double double9 = dormandPrince853Integrator4.getMinStep();
        double double10 = dormandPrince853Integrator4.getCurrentStepStart();
        double double11 = dormandPrince853Integrator4.getMinReduction();
        double double12 = dormandPrince853Integrator4.getCurrentStepStart();
        dormandPrince853Integrator4.setSafety(52.0d);
        java.lang.String str15 = dormandPrince853Integrator4.getName();
        double double16 = dormandPrince853Integrator4.getMaxStep();
        double double17 = dormandPrince853Integrator4.getMaxStep();
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.9d + "'", double5 == 0.9d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 10.0d + "'", double6 == 10.0d);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 10.0d + "'", double9 == 10.0d);
        org.junit.Assert.assertTrue(Double.isNaN(double10));
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 0.2d + "'", double11 == 0.2d);
        org.junit.Assert.assertTrue(Double.isNaN(double12));
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "Dormand-Prince 8 (5, 3)" + "'", str15, "Dormand-Prince 8 (5, 3)");
        org.junit.Assert.assertTrue("'" + double16 + "' != '" + 10.0d + "'", double16 == 10.0d);
        org.junit.Assert.assertTrue("'" + double17 + "' != '" + 10.0d + "'", double17 == 10.0d);
    }

    @Test
    public void test15584() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest31.test15584");
        org.apache.commons.math.ode.DormandPrince853Integrator dormandPrince853Integrator4 = new org.apache.commons.math.ode.DormandPrince853Integrator((double) (short) 10, (-1.0d), (double) (short) 1, (double) 1L);
        double double5 = dormandPrince853Integrator4.getSafety();
        org.apache.commons.math.ode.DormandPrince853Integrator dormandPrince853Integrator10 = new org.apache.commons.math.ode.DormandPrince853Integrator(1.0d, (double) (byte) 10, (double) (short) 1, (double) 0L);
        double double11 = dormandPrince853Integrator10.getMaxStep();
        double double12 = dormandPrince853Integrator10.getCurrentSignedStepsize();
        dormandPrince853Integrator10.setInitialStepSize(97.0d);
        double double15 = dormandPrince853Integrator10.getMinReduction();
        org.apache.commons.math.ode.StepHandler stepHandler16 = dormandPrince853Integrator10.getStepHandler();
        dormandPrince853Integrator4.setStepHandler(stepHandler16);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.9d + "'", double5 == 0.9d);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 10.0d + "'", double11 == 10.0d);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 3.1622776601683795d + "'", double12 == 3.1622776601683795d);
        org.junit.Assert.assertTrue("'" + double15 + "' != '" + 0.2d + "'", double15 == 0.2d);
        org.junit.Assert.assertNotNull(stepHandler16);
    }

    @Test
    public void test15585() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest31.test15585");
        org.apache.commons.math.ode.DormandPrince853Integrator dormandPrince853Integrator4 = new org.apache.commons.math.ode.DormandPrince853Integrator(1.0d, (double) (byte) 10, (double) (short) 1, (double) 0L);
        int int5 = dormandPrince853Integrator4.getOrder();
        double double6 = dormandPrince853Integrator4.getSafety();
        java.lang.String str7 = dormandPrince853Integrator4.getName();
        dormandPrince853Integrator4.setMaxGrowth((double) (short) -1);
        dormandPrince853Integrator4.setMaxGrowth(35.0d);
        int int12 = dormandPrince853Integrator4.getOrder();
        dormandPrince853Integrator4.setMinReduction((-1.0d));
        double double15 = dormandPrince853Integrator4.getMinStep();
        double double16 = dormandPrince853Integrator4.getMaxStep();
        dormandPrince853Integrator4.setMinReduction(0.0d);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 8 + "'", int5 == 8);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.9d + "'", double6 == 0.9d);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "Dormand-Prince 8 (5, 3)" + "'", str7, "Dormand-Prince 8 (5, 3)");
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 8 + "'", int12 == 8);
        org.junit.Assert.assertTrue("'" + double15 + "' != '" + 1.0d + "'", double15 == 1.0d);
        org.junit.Assert.assertTrue("'" + double16 + "' != '" + 10.0d + "'", double16 == 10.0d);
    }

    @Test
    public void test15586() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest31.test15586");
        org.apache.commons.math.ode.DormandPrince853Integrator dormandPrince853Integrator4 = new org.apache.commons.math.ode.DormandPrince853Integrator((double) 10, (double) (byte) 10, (double) (short) 100, (double) 1);
        double double5 = dormandPrince853Integrator4.getSafety();
        dormandPrince853Integrator4.setInitialStepSize((double) 0.0f);
        org.apache.commons.math.ode.SwitchingFunction switchingFunction8 = null;
        dormandPrince853Integrator4.addSwitchingFunction(switchingFunction8, (double) 'a', 0.0d, 8);
        dormandPrince853Integrator4.setMaxGrowth((double) 0L);
        double double15 = dormandPrince853Integrator4.getMinStep();
        double double16 = dormandPrince853Integrator4.getMaxGrowth();
        dormandPrince853Integrator4.setInitialStepSize(52.0d);
        int int19 = dormandPrince853Integrator4.getOrder();
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.9d + "'", double5 == 0.9d);
        org.junit.Assert.assertTrue("'" + double15 + "' != '" + 10.0d + "'", double15 == 10.0d);
        org.junit.Assert.assertTrue("'" + double16 + "' != '" + 0.0d + "'", double16 == 0.0d);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 8 + "'", int19 == 8);
    }

    @Test
    public void test15587() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest31.test15587");
        java.lang.String[] strArray12 = new java.lang.String[] {};
        org.apache.commons.math.ode.DerivativeException derivativeException13 = new org.apache.commons.math.ode.DerivativeException("Dormand-Prince 8 (5, 3)", strArray12);
        org.apache.commons.math.ode.DerivativeException derivativeException14 = new org.apache.commons.math.ode.DerivativeException("hi!", strArray12);
        org.apache.commons.math.ode.DerivativeException derivativeException15 = new org.apache.commons.math.ode.DerivativeException("hi!", strArray12);
        org.apache.commons.math.ode.DerivativeException derivativeException16 = new org.apache.commons.math.ode.DerivativeException("hi!", strArray12);
        org.apache.commons.math.ode.IntegratorException integratorException17 = new org.apache.commons.math.ode.IntegratorException("org.apache.commons.math.ode.DerivativeException: Dormand-Prince 8 (5, 3)", (java.lang.Object[]) strArray12);
        org.apache.commons.math.ode.DerivativeException derivativeException18 = new org.apache.commons.math.ode.DerivativeException("org.apache.commons.math.ode.IntegratorException: Dormand-Prince 8 (5, 3)", strArray12);
        org.apache.commons.math.ode.DerivativeException derivativeException19 = new org.apache.commons.math.ode.DerivativeException("org.apache.commons.math.ode.DerivativeException: Dormand-Prince 8 (5, 3)", strArray12);
        org.apache.commons.math.ode.IntegratorException integratorException20 = new org.apache.commons.math.ode.IntegratorException("org.apache.commons.math.ode.DerivativeException: Dormand-Prince 8 (5, 3)", (java.lang.Object[]) strArray12);
        org.apache.commons.math.ode.DerivativeException derivativeException21 = new org.apache.commons.math.ode.DerivativeException("org.apache.commons.math.ode.IntegratorException: org.apache.commons.math.ode.IntegratorException", strArray12);
        org.apache.commons.math.ode.DerivativeException derivativeException22 = new org.apache.commons.math.ode.DerivativeException("org.apache.commons.math.ode.IntegratorException: org.apache.commons.math.ode.DerivativeException: Dormand-Prince 8 (5, 3)", strArray12);
        org.apache.commons.math.ode.DerivativeException derivativeException23 = new org.apache.commons.math.ode.DerivativeException("", strArray12);
        org.apache.commons.math.ode.IntegratorException integratorException24 = new org.apache.commons.math.ode.IntegratorException("org.apache.commons.math.ode.DerivativeException: Dormand-Prince 8 (5, 3)", (java.lang.Object[]) strArray12);
        org.junit.Assert.assertNotNull(strArray12);
    }

    @Test
    public void test15588() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest31.test15588");
        org.apache.commons.math.ode.DormandPrince853Integrator dormandPrince853Integrator4 = new org.apache.commons.math.ode.DormandPrince853Integrator(0.0d, 0.2d, (double) '#', (double) 10L);
        int int5 = dormandPrince853Integrator4.getOrder();
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 8 + "'", int5 == 8);
    }

    @Test
    public void test15589() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest31.test15589");
        org.apache.commons.math.ode.DormandPrince853Integrator dormandPrince853Integrator4 = new org.apache.commons.math.ode.DormandPrince853Integrator(9.848857801796104d, (double) 0, 52.0d, 52.0d);
        int int5 = dormandPrince853Integrator4.getOrder();
        double double6 = dormandPrince853Integrator4.getCurrentSignedStepsize();
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 8 + "'", int5 == 8);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.0d + "'", double6 == 0.0d);
    }

    @Test
    public void test15590() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest31.test15590");
        double[] doubleArray2 = null;
        double[] doubleArray14 = new double[] { 58.26662852782886d, 9.486832980505138d, 1.0f, 8.0d, 8.0d };
        double[] doubleArray21 = new double[] {};
        double[] doubleArray22 = new double[] {};
        org.apache.commons.math.ode.DormandPrince853Integrator dormandPrince853Integrator23 = new org.apache.commons.math.ode.DormandPrince853Integrator((double) 1.0f, (double) 1.0f, doubleArray21, doubleArray22);
        double[] doubleArray26 = new double[] {};
        double[] doubleArray27 = new double[] {};
        org.apache.commons.math.ode.DormandPrince853Integrator dormandPrince853Integrator28 = new org.apache.commons.math.ode.DormandPrince853Integrator((double) 1.0f, (double) 1.0f, doubleArray26, doubleArray27);
        org.apache.commons.math.ode.DormandPrince853Integrator dormandPrince853Integrator29 = new org.apache.commons.math.ode.DormandPrince853Integrator((double) ' ', (double) 'a', doubleArray22, doubleArray27);
        double[] doubleArray32 = new double[] {};
        double[] doubleArray33 = new double[] {};
        org.apache.commons.math.ode.DormandPrince853Integrator dormandPrince853Integrator34 = new org.apache.commons.math.ode.DormandPrince853Integrator((double) 1.0f, (double) 1.0f, doubleArray32, doubleArray33);
        org.apache.commons.math.ode.DormandPrince853Integrator dormandPrince853Integrator35 = new org.apache.commons.math.ode.DormandPrince853Integrator(3.1622776601683795d, (double) ' ', doubleArray27, doubleArray32);
        org.apache.commons.math.ode.DormandPrince853Integrator dormandPrince853Integrator36 = new org.apache.commons.math.ode.DormandPrince853Integrator(100.0d, (double) (-1.0f), doubleArray14, doubleArray32);
        double[] doubleArray37 = null;
        org.apache.commons.math.ode.DormandPrince853Integrator dormandPrince853Integrator38 = new org.apache.commons.math.ode.DormandPrince853Integrator((double) 0.0f, 2.0932702787842112d, doubleArray14, doubleArray37);
        double[] doubleArray47 = new double[] {};
        double[] doubleArray48 = new double[] {};
        org.apache.commons.math.ode.DormandPrince853Integrator dormandPrince853Integrator49 = new org.apache.commons.math.ode.DormandPrince853Integrator((double) 1.0f, (double) 1.0f, doubleArray47, doubleArray48);
        double[] doubleArray52 = new double[] {};
        double[] doubleArray53 = new double[] {};
        org.apache.commons.math.ode.DormandPrince853Integrator dormandPrince853Integrator54 = new org.apache.commons.math.ode.DormandPrince853Integrator((double) 1.0f, (double) 1.0f, doubleArray52, doubleArray53);
        org.apache.commons.math.ode.DormandPrince853Integrator dormandPrince853Integrator55 = new org.apache.commons.math.ode.DormandPrince853Integrator((double) ' ', (double) 'a', doubleArray48, doubleArray53);
        double[] doubleArray58 = new double[] {};
        double[] doubleArray59 = new double[] {};
        org.apache.commons.math.ode.DormandPrince853Integrator dormandPrince853Integrator60 = new org.apache.commons.math.ode.DormandPrince853Integrator((double) 1.0f, (double) 1.0f, doubleArray58, doubleArray59);
        org.apache.commons.math.ode.DormandPrince853Integrator dormandPrince853Integrator61 = new org.apache.commons.math.ode.DormandPrince853Integrator(3.1622776601683795d, (double) ' ', doubleArray53, doubleArray58);
        double[] doubleArray68 = new double[] {};
        double[] doubleArray69 = new double[] {};
        org.apache.commons.math.ode.DormandPrince853Integrator dormandPrince853Integrator70 = new org.apache.commons.math.ode.DormandPrince853Integrator((double) 1.0f, (double) 1.0f, doubleArray68, doubleArray69);
        double[] doubleArray73 = new double[] {};
        double[] doubleArray74 = new double[] {};
        org.apache.commons.math.ode.DormandPrince853Integrator dormandPrince853Integrator75 = new org.apache.commons.math.ode.DormandPrince853Integrator((double) 1.0f, (double) 1.0f, doubleArray73, doubleArray74);
        org.apache.commons.math.ode.DormandPrince853Integrator dormandPrince853Integrator76 = new org.apache.commons.math.ode.DormandPrince853Integrator((double) ' ', (double) 'a', doubleArray69, doubleArray74);
        double[] doubleArray79 = new double[] {};
        double[] doubleArray80 = new double[] {};
        org.apache.commons.math.ode.DormandPrince853Integrator dormandPrince853Integrator81 = new org.apache.commons.math.ode.DormandPrince853Integrator((double) 1.0f, (double) 1.0f, doubleArray79, doubleArray80);
        org.apache.commons.math.ode.DormandPrince853Integrator dormandPrince853Integrator82 = new org.apache.commons.math.ode.DormandPrince853Integrator(3.1622776601683795d, (double) ' ', doubleArray74, doubleArray79);
        org.apache.commons.math.ode.DormandPrince853Integrator dormandPrince853Integrator83 = new org.apache.commons.math.ode.DormandPrince853Integrator((double) 0, (double) (byte) 0, doubleArray53, doubleArray74);
        org.apache.commons.math.ode.DormandPrince853Integrator dormandPrince853Integrator84 = new org.apache.commons.math.ode.DormandPrince853Integrator(0.0d, 28.284271247461902d, doubleArray37, doubleArray74);
        org.apache.commons.math.ode.DormandPrince853Integrator dormandPrince853Integrator85 = new org.apache.commons.math.ode.DormandPrince853Integrator(33.46640106136302d, 2.0870738306760646d, doubleArray2, doubleArray74);
        dormandPrince853Integrator85.setSafety(7.113117640155691d);
        org.junit.Assert.assertNotNull(doubleArray14);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray14), "[58.26662852782886, 9.486832980505138, 1.0, 8.0, 8.0]");
        org.junit.Assert.assertNotNull(doubleArray21);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray21), "[]");
        org.junit.Assert.assertNotNull(doubleArray22);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray22), "[]");
        org.junit.Assert.assertNotNull(doubleArray26);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray26), "[]");
        org.junit.Assert.assertNotNull(doubleArray27);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray27), "[]");
        org.junit.Assert.assertNotNull(doubleArray32);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray32), "[]");
        org.junit.Assert.assertNotNull(doubleArray33);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray33), "[]");
        org.junit.Assert.assertNotNull(doubleArray47);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray47), "[]");
        org.junit.Assert.assertNotNull(doubleArray48);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray48), "[]");
        org.junit.Assert.assertNotNull(doubleArray52);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray52), "[]");
        org.junit.Assert.assertNotNull(doubleArray53);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray53), "[]");
        org.junit.Assert.assertNotNull(doubleArray58);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray58), "[]");
        org.junit.Assert.assertNotNull(doubleArray59);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray59), "[]");
        org.junit.Assert.assertNotNull(doubleArray68);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray68), "[]");
        org.junit.Assert.assertNotNull(doubleArray69);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray69), "[]");
        org.junit.Assert.assertNotNull(doubleArray73);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray73), "[]");
        org.junit.Assert.assertNotNull(doubleArray74);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray74), "[]");
        org.junit.Assert.assertNotNull(doubleArray79);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray79), "[]");
        org.junit.Assert.assertNotNull(doubleArray80);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray80), "[]");
    }

    @Test
    public void test15591() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest31.test15591");
        java.lang.String[] strArray9 = new java.lang.String[] {};
        org.apache.commons.math.ode.DerivativeException derivativeException10 = new org.apache.commons.math.ode.DerivativeException("Dormand-Prince 8 (5, 3)", strArray9);
        org.apache.commons.math.ode.IntegratorException integratorException11 = new org.apache.commons.math.ode.IntegratorException("", (java.lang.Object[]) strArray9);
        org.apache.commons.math.ode.DerivativeException derivativeException12 = new org.apache.commons.math.ode.DerivativeException("org.apache.commons.math.ode.DerivativeException: Dormand-Prince 8 (5, 3)", strArray9);
        org.apache.commons.math.ode.DerivativeException derivativeException13 = new org.apache.commons.math.ode.DerivativeException("org.apache.commons.math.ode.IntegratorException", strArray9);
        org.apache.commons.math.ode.IntegratorException integratorException14 = new org.apache.commons.math.ode.IntegratorException("", (java.lang.Object[]) strArray9);
        org.apache.commons.math.ode.DerivativeException derivativeException15 = new org.apache.commons.math.ode.DerivativeException("", strArray9);
        org.apache.commons.math.ode.IntegratorException integratorException16 = new org.apache.commons.math.ode.IntegratorException("", (java.lang.Object[]) strArray9);
        org.apache.commons.math.ode.IntegratorException integratorException17 = new org.apache.commons.math.ode.IntegratorException("org.apache.commons.math.ode.IntegratorException: ", (java.lang.Object[]) strArray9);
        org.apache.commons.math.ode.IntegratorException integratorException18 = new org.apache.commons.math.ode.IntegratorException("org.apache.commons.math.ode.IntegratorException: org.apache.commons.math.ode.DerivativeException: Dormand-Prince 8 (5, 3)", (java.lang.Object[]) strArray9);
        org.junit.Assert.assertNotNull(strArray9);
    }

    @Test
    public void test15592() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest31.test15592");
        org.apache.commons.math.ode.DormandPrince853Integrator dormandPrince853Integrator4 = new org.apache.commons.math.ode.DormandPrince853Integrator((double) 10, (double) (byte) 10, (double) (short) 100, (double) 1);
        double double5 = dormandPrince853Integrator4.getSafety();
        double double6 = dormandPrince853Integrator4.getMinStep();
        java.lang.String str7 = dormandPrince853Integrator4.getName();
        int int8 = dormandPrince853Integrator4.getOrder();
        double double9 = dormandPrince853Integrator4.getCurrentSignedStepsize();
        double double10 = dormandPrince853Integrator4.getMinStep();
        org.apache.commons.math.ode.StepHandler stepHandler11 = dormandPrince853Integrator4.getStepHandler();
        double double12 = dormandPrince853Integrator4.getMinReduction();
        java.lang.String str13 = dormandPrince853Integrator4.getName();
        java.lang.String str14 = dormandPrince853Integrator4.getName();
        org.apache.commons.math.ode.DormandPrince853Integrator dormandPrince853Integrator19 = new org.apache.commons.math.ode.DormandPrince853Integrator((double) 10, (double) (byte) 10, (double) (short) 100, (double) 1);
        double double20 = dormandPrince853Integrator19.getSafety();
        double double21 = dormandPrince853Integrator19.getMinStep();
        java.lang.String str22 = dormandPrince853Integrator19.getName();
        double double23 = dormandPrince853Integrator19.getMaxStep();
        dormandPrince853Integrator19.setMaxGrowth((double) (short) -1);
        dormandPrince853Integrator19.setSafety((double) 100L);
        org.apache.commons.math.ode.SwitchingFunction switchingFunction28 = null;
        dormandPrince853Integrator19.addSwitchingFunction(switchingFunction28, (double) (byte) 100, (double) (-1.0f), (int) (byte) 1);
        dormandPrince853Integrator19.setMaxGrowth(0.9d);
        org.apache.commons.math.ode.StepHandler stepHandler35 = dormandPrince853Integrator19.getStepHandler();
        dormandPrince853Integrator4.setStepHandler(stepHandler35);
        dormandPrince853Integrator4.setMaxGrowth(9.848857801796104d);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.9d + "'", double5 == 0.9d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 10.0d + "'", double6 == 10.0d);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "Dormand-Prince 8 (5, 3)" + "'", str7, "Dormand-Prince 8 (5, 3)");
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 8 + "'", int8 == 8);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 10.0d + "'", double9 == 10.0d);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 10.0d + "'", double10 == 10.0d);
        org.junit.Assert.assertNotNull(stepHandler11);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 0.2d + "'", double12 == 0.2d);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "Dormand-Prince 8 (5, 3)" + "'", str13, "Dormand-Prince 8 (5, 3)");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "Dormand-Prince 8 (5, 3)" + "'", str14, "Dormand-Prince 8 (5, 3)");
        org.junit.Assert.assertTrue("'" + double20 + "' != '" + 0.9d + "'", double20 == 0.9d);
        org.junit.Assert.assertTrue("'" + double21 + "' != '" + 10.0d + "'", double21 == 10.0d);
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "Dormand-Prince 8 (5, 3)" + "'", str22, "Dormand-Prince 8 (5, 3)");
        org.junit.Assert.assertTrue("'" + double23 + "' != '" + 10.0d + "'", double23 == 10.0d);
        org.junit.Assert.assertNotNull(stepHandler35);
    }

    @Test
    public void test15593() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest31.test15593");
        java.lang.String[] strArray6 = new java.lang.String[] {};
        org.apache.commons.math.ode.DerivativeException derivativeException7 = new org.apache.commons.math.ode.DerivativeException("Dormand-Prince 8 (5, 3)", strArray6);
        org.apache.commons.math.ode.DerivativeException derivativeException8 = new org.apache.commons.math.ode.DerivativeException("hi!", strArray6);
        org.apache.commons.math.ode.DerivativeException derivativeException9 = new org.apache.commons.math.ode.DerivativeException("hi!", strArray6);
        org.apache.commons.math.ode.DerivativeException derivativeException10 = new org.apache.commons.math.ode.DerivativeException("hi!", strArray6);
        org.apache.commons.math.ode.IntegratorException integratorException11 = new org.apache.commons.math.ode.IntegratorException("org.apache.commons.math.ode.DerivativeException: Dormand-Prince 8 (5, 3)", (java.lang.Object[]) strArray6);
        org.apache.commons.math.ode.DerivativeException derivativeException12 = new org.apache.commons.math.ode.DerivativeException("org.apache.commons.math.ode.IntegratorException: ", strArray6);
        java.lang.Throwable[] throwableArray13 = derivativeException12.getSuppressed();
        org.apache.commons.math.ode.IntegratorException integratorException14 = new org.apache.commons.math.ode.IntegratorException((java.lang.Throwable) derivativeException12);
        java.lang.String[] strArray22 = new java.lang.String[] {};
        org.apache.commons.math.ode.DerivativeException derivativeException23 = new org.apache.commons.math.ode.DerivativeException("Dormand-Prince 8 (5, 3)", strArray22);
        org.apache.commons.math.ode.DerivativeException derivativeException24 = new org.apache.commons.math.ode.DerivativeException("org.apache.commons.math.ode.IntegratorException: Dormand-Prince 8 (5, 3)", strArray22);
        org.apache.commons.math.ode.IntegratorException integratorException25 = new org.apache.commons.math.ode.IntegratorException("hi!", (java.lang.Object[]) strArray22);
        org.apache.commons.math.ode.DerivativeException derivativeException26 = new org.apache.commons.math.ode.DerivativeException("org.apache.commons.math.ode.IntegratorException: Dormand-Prince 8 (5, 3)", strArray22);
        org.apache.commons.math.ode.DerivativeException derivativeException27 = new org.apache.commons.math.ode.DerivativeException("org.apache.commons.math.ode.DerivativeException: Dormand-Prince 8 (5, 3)", strArray22);
        org.apache.commons.math.ode.DerivativeException derivativeException28 = new org.apache.commons.math.ode.DerivativeException("org.apache.commons.math.ode.IntegratorException: ", strArray22);
        org.apache.commons.math.ode.DerivativeException derivativeException29 = new org.apache.commons.math.ode.DerivativeException("org.apache.commons.math.ode.DerivativeException", strArray22);
        java.lang.String[] strArray32 = new java.lang.String[] {};
        org.apache.commons.math.ode.DerivativeException derivativeException33 = new org.apache.commons.math.ode.DerivativeException("Dormand-Prince 8 (5, 3)", strArray32);
        org.apache.commons.math.ode.IntegratorException integratorException34 = new org.apache.commons.math.ode.IntegratorException((java.lang.Throwable) derivativeException33);
        java.lang.Throwable[] throwableArray35 = integratorException34.getSuppressed();
        java.lang.Throwable[] throwableArray36 = integratorException34.getSuppressed();
        org.apache.commons.math.ode.IntegratorException integratorException37 = new org.apache.commons.math.ode.IntegratorException("org.apache.commons.math.ode.IntegratorException: hi!", (java.lang.Object[]) throwableArray36);
        org.apache.commons.math.ode.DerivativeException derivativeException38 = new org.apache.commons.math.ode.DerivativeException((java.lang.Throwable) integratorException37);
        derivativeException29.addSuppressed((java.lang.Throwable) integratorException37);
        derivativeException12.addSuppressed((java.lang.Throwable) derivativeException29);
        org.apache.commons.math.ode.DerivativeException derivativeException41 = new org.apache.commons.math.ode.DerivativeException((java.lang.Throwable) derivativeException29);
        org.junit.Assert.assertNotNull(strArray6);
        org.junit.Assert.assertNotNull(throwableArray13);
        org.junit.Assert.assertNotNull(strArray22);
        org.junit.Assert.assertNotNull(strArray32);
        org.junit.Assert.assertNotNull(throwableArray35);
        org.junit.Assert.assertNotNull(throwableArray36);
    }

    @Test
    public void test15594() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest31.test15594");
        java.lang.String[] strArray5 = new java.lang.String[] {};
        org.apache.commons.math.ode.DerivativeException derivativeException6 = new org.apache.commons.math.ode.DerivativeException("Dormand-Prince 8 (5, 3)", strArray5);
        org.apache.commons.math.ode.DerivativeException derivativeException7 = new org.apache.commons.math.ode.DerivativeException("hi!", strArray5);
        org.apache.commons.math.ode.DerivativeException derivativeException8 = new org.apache.commons.math.ode.DerivativeException("hi!", strArray5);
        org.apache.commons.math.ode.DerivativeException derivativeException9 = new org.apache.commons.math.ode.DerivativeException("hi!", strArray5);
        org.apache.commons.math.ode.DerivativeException derivativeException10 = new org.apache.commons.math.ode.DerivativeException("Dormand-Prince 8 (5, 3)", strArray5);
        java.lang.String str11 = derivativeException10.getPattern();
        java.lang.Object[] objArray19 = new java.lang.Object[] { 100L, true, (-1), Double.NaN, 1, (-1) };
        org.apache.commons.math.ode.IntegratorException integratorException20 = new org.apache.commons.math.ode.IntegratorException("hi!", objArray19);
        java.lang.String str21 = integratorException20.getPattern();
        org.apache.commons.math.ode.DerivativeException derivativeException22 = new org.apache.commons.math.ode.DerivativeException((java.lang.Throwable) integratorException20);
        java.lang.String str23 = derivativeException22.getPattern();
        java.lang.String[] strArray33 = new java.lang.String[] {};
        org.apache.commons.math.ode.DerivativeException derivativeException34 = new org.apache.commons.math.ode.DerivativeException("Dormand-Prince 8 (5, 3)", strArray33);
        org.apache.commons.math.ode.DerivativeException derivativeException35 = new org.apache.commons.math.ode.DerivativeException("hi!", strArray33);
        org.apache.commons.math.ode.DerivativeException derivativeException36 = new org.apache.commons.math.ode.DerivativeException("hi!", strArray33);
        org.apache.commons.math.ode.DerivativeException derivativeException37 = new org.apache.commons.math.ode.DerivativeException("hi!", strArray33);
        org.apache.commons.math.ode.IntegratorException integratorException38 = new org.apache.commons.math.ode.IntegratorException("org.apache.commons.math.ode.DerivativeException: Dormand-Prince 8 (5, 3)", (java.lang.Object[]) strArray33);
        org.apache.commons.math.ode.DerivativeException derivativeException39 = new org.apache.commons.math.ode.DerivativeException("org.apache.commons.math.ode.IntegratorException: ", strArray33);
        org.apache.commons.math.ode.DerivativeException derivativeException40 = new org.apache.commons.math.ode.DerivativeException("", strArray33);
        org.apache.commons.math.ode.IntegratorException integratorException41 = new org.apache.commons.math.ode.IntegratorException("org.apache.commons.math.ode.IntegratorException: ", (java.lang.Object[]) strArray33);
        org.apache.commons.math.ode.DerivativeException derivativeException42 = new org.apache.commons.math.ode.DerivativeException("org.apache.commons.math.ode.IntegratorException: hi!", strArray33);
        java.lang.Object[] objArray51 = new java.lang.Object[] { 100L, true, (-1), Double.NaN, 1, (-1) };
        org.apache.commons.math.ode.IntegratorException integratorException52 = new org.apache.commons.math.ode.IntegratorException("hi!", objArray51);
        java.lang.String str53 = integratorException52.getPattern();
        org.apache.commons.math.ode.DerivativeException derivativeException54 = new org.apache.commons.math.ode.DerivativeException((java.lang.Throwable) integratorException52);
        org.apache.commons.math.ode.DerivativeException derivativeException55 = new org.apache.commons.math.ode.DerivativeException((java.lang.Throwable) integratorException52);
        org.apache.commons.math.ode.DerivativeException derivativeException56 = new org.apache.commons.math.ode.DerivativeException((java.lang.Throwable) derivativeException55);
        java.lang.String str57 = derivativeException55.getPattern();
        java.lang.Throwable[] throwableArray58 = derivativeException55.getSuppressed();
        org.apache.commons.math.ode.IntegratorException integratorException59 = new org.apache.commons.math.ode.IntegratorException("hi!", (java.lang.Object[]) throwableArray58);
        derivativeException42.addSuppressed((java.lang.Throwable) integratorException59);
        derivativeException22.addSuppressed((java.lang.Throwable) derivativeException42);
        derivativeException10.addSuppressed((java.lang.Throwable) derivativeException42);
        java.lang.Object[] objArray70 = new java.lang.Object[] { 100L, true, (-1), Double.NaN, 1, (-1) };
        org.apache.commons.math.ode.IntegratorException integratorException71 = new org.apache.commons.math.ode.IntegratorException("hi!", objArray70);
        java.lang.String str72 = integratorException71.getPattern();
        org.apache.commons.math.ode.DerivativeException derivativeException73 = new org.apache.commons.math.ode.DerivativeException((java.lang.Throwable) integratorException71);
        org.apache.commons.math.ode.DerivativeException derivativeException74 = new org.apache.commons.math.ode.DerivativeException((java.lang.Throwable) integratorException71);
        java.lang.String str75 = integratorException71.getPattern();
        java.lang.Throwable[] throwableArray76 = integratorException71.getSuppressed();
        derivativeException10.addSuppressed((java.lang.Throwable) integratorException71);
        java.lang.String str78 = integratorException71.getPattern();
        org.junit.Assert.assertNotNull(strArray5);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "Dormand-Prince 8 (5, 3)" + "'", str11, "Dormand-Prince 8 (5, 3)");
        org.junit.Assert.assertNotNull(objArray19);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray19), "[100, true, -1, NaN, 1, -1]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray19), "[100, true, -1, NaN, 1, -1]");
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "hi!" + "'", str21, "hi!");
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "hi!" + "'", str23, "hi!");
        org.junit.Assert.assertNotNull(strArray33);
        org.junit.Assert.assertNotNull(objArray51);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray51), "[100, true, -1, NaN, 1, -1]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray51), "[100, true, -1, NaN, 1, -1]");
        org.junit.Assert.assertEquals("'" + str53 + "' != '" + "hi!" + "'", str53, "hi!");
        org.junit.Assert.assertEquals("'" + str57 + "' != '" + "hi!" + "'", str57, "hi!");
        org.junit.Assert.assertNotNull(throwableArray58);
        org.junit.Assert.assertNotNull(objArray70);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray70), "[100, true, -1, NaN, 1, -1]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray70), "[100, true, -1, NaN, 1, -1]");
        org.junit.Assert.assertEquals("'" + str72 + "' != '" + "hi!" + "'", str72, "hi!");
        org.junit.Assert.assertEquals("'" + str75 + "' != '" + "hi!" + "'", str75, "hi!");
        org.junit.Assert.assertNotNull(throwableArray76);
        org.junit.Assert.assertEquals("'" + str78 + "' != '" + "hi!" + "'", str78, "hi!");
    }

    @Test
    public void test15595() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest31.test15595");
        double[] doubleArray6 = new double[] {};
        double[] doubleArray7 = new double[] {};
        org.apache.commons.math.ode.DormandPrince853Integrator dormandPrince853Integrator8 = new org.apache.commons.math.ode.DormandPrince853Integrator((double) 1.0f, (double) 1.0f, doubleArray6, doubleArray7);
        double[] doubleArray13 = new double[] {};
        double[] doubleArray14 = new double[] {};
        org.apache.commons.math.ode.DormandPrince853Integrator dormandPrince853Integrator15 = new org.apache.commons.math.ode.DormandPrince853Integrator((double) 1.0f, (double) 1.0f, doubleArray13, doubleArray14);
        double[] doubleArray18 = new double[] {};
        double[] doubleArray19 = new double[] {};
        org.apache.commons.math.ode.DormandPrince853Integrator dormandPrince853Integrator20 = new org.apache.commons.math.ode.DormandPrince853Integrator((double) 1.0f, (double) 1.0f, doubleArray18, doubleArray19);
        org.apache.commons.math.ode.DormandPrince853Integrator dormandPrince853Integrator21 = new org.apache.commons.math.ode.DormandPrince853Integrator((double) ' ', (double) 'a', doubleArray14, doubleArray19);
        org.apache.commons.math.ode.DormandPrince853Integrator dormandPrince853Integrator22 = new org.apache.commons.math.ode.DormandPrince853Integrator(0.9d, (double) 1L, doubleArray6, doubleArray19);
        double[] doubleArray25 = null;
        double[] doubleArray36 = new double[] {};
        double[] doubleArray37 = new double[] {};
        org.apache.commons.math.ode.DormandPrince853Integrator dormandPrince853Integrator38 = new org.apache.commons.math.ode.DormandPrince853Integrator((double) 1.0f, (double) 1.0f, doubleArray36, doubleArray37);
        double[] doubleArray41 = new double[] {};
        double[] doubleArray42 = new double[] {};
        org.apache.commons.math.ode.DormandPrince853Integrator dormandPrince853Integrator43 = new org.apache.commons.math.ode.DormandPrince853Integrator((double) 1.0f, (double) 1.0f, doubleArray41, doubleArray42);
        org.apache.commons.math.ode.DormandPrince853Integrator dormandPrince853Integrator44 = new org.apache.commons.math.ode.DormandPrince853Integrator((double) ' ', (double) 'a', doubleArray37, doubleArray42);
        double[] doubleArray47 = new double[] {};
        double[] doubleArray48 = new double[] {};
        org.apache.commons.math.ode.DormandPrince853Integrator dormandPrince853Integrator49 = new org.apache.commons.math.ode.DormandPrince853Integrator((double) 1.0f, (double) 1.0f, doubleArray47, doubleArray48);
        org.apache.commons.math.ode.DormandPrince853Integrator dormandPrince853Integrator50 = new org.apache.commons.math.ode.DormandPrince853Integrator(3.1622776601683795d, (double) ' ', doubleArray42, doubleArray47);
        double[] doubleArray55 = new double[] {};
        double[] doubleArray56 = new double[] {};
        org.apache.commons.math.ode.DormandPrince853Integrator dormandPrince853Integrator57 = new org.apache.commons.math.ode.DormandPrince853Integrator((double) 1.0f, (double) 1.0f, doubleArray55, doubleArray56);
        double[] doubleArray62 = new double[] {};
        double[] doubleArray63 = new double[] {};
        org.apache.commons.math.ode.DormandPrince853Integrator dormandPrince853Integrator64 = new org.apache.commons.math.ode.DormandPrince853Integrator((double) 1.0f, (double) 1.0f, doubleArray62, doubleArray63);
        double[] doubleArray67 = new double[] {};
        double[] doubleArray68 = new double[] {};
        org.apache.commons.math.ode.DormandPrince853Integrator dormandPrince853Integrator69 = new org.apache.commons.math.ode.DormandPrince853Integrator((double) 1.0f, (double) 1.0f, doubleArray67, doubleArray68);
        org.apache.commons.math.ode.DormandPrince853Integrator dormandPrince853Integrator70 = new org.apache.commons.math.ode.DormandPrince853Integrator((double) ' ', (double) 'a', doubleArray63, doubleArray68);
        org.apache.commons.math.ode.DormandPrince853Integrator dormandPrince853Integrator71 = new org.apache.commons.math.ode.DormandPrince853Integrator(0.9d, (double) 1L, doubleArray55, doubleArray68);
        org.apache.commons.math.ode.DormandPrince853Integrator dormandPrince853Integrator72 = new org.apache.commons.math.ode.DormandPrince853Integrator((double) (short) 10, (double) 0.0f, doubleArray47, doubleArray68);
        double[] doubleArray77 = new double[] {};
        double[] doubleArray78 = new double[] {};
        org.apache.commons.math.ode.DormandPrince853Integrator dormandPrince853Integrator79 = new org.apache.commons.math.ode.DormandPrince853Integrator((double) 1.0f, (double) 1.0f, doubleArray77, doubleArray78);
        double[] doubleArray82 = new double[] {};
        double[] doubleArray83 = new double[] {};
        org.apache.commons.math.ode.DormandPrince853Integrator dormandPrince853Integrator84 = new org.apache.commons.math.ode.DormandPrince853Integrator((double) 1.0f, (double) 1.0f, doubleArray82, doubleArray83);
        org.apache.commons.math.ode.DormandPrince853Integrator dormandPrince853Integrator85 = new org.apache.commons.math.ode.DormandPrince853Integrator((double) ' ', (double) 'a', doubleArray78, doubleArray83);
        org.apache.commons.math.ode.DormandPrince853Integrator dormandPrince853Integrator86 = new org.apache.commons.math.ode.DormandPrince853Integrator(3.080070288241023d, (double) 1L, doubleArray68, doubleArray83);
        org.apache.commons.math.ode.DormandPrince853Integrator dormandPrince853Integrator87 = new org.apache.commons.math.ode.DormandPrince853Integrator(35.0d, 10.0d, doubleArray25, doubleArray83);
        org.apache.commons.math.ode.DormandPrince853Integrator dormandPrince853Integrator88 = new org.apache.commons.math.ode.DormandPrince853Integrator(0.4472135954999579d, 24.865225933617626d, doubleArray6, doubleArray25);
        org.junit.Assert.assertNotNull(doubleArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray6), "[]");
        org.junit.Assert.assertNotNull(doubleArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray7), "[]");
        org.junit.Assert.assertNotNull(doubleArray13);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray13), "[]");
        org.junit.Assert.assertNotNull(doubleArray14);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray14), "[]");
        org.junit.Assert.assertNotNull(doubleArray18);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray18), "[]");
        org.junit.Assert.assertNotNull(doubleArray19);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray19), "[]");
        org.junit.Assert.assertNotNull(doubleArray36);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray36), "[]");
        org.junit.Assert.assertNotNull(doubleArray37);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray37), "[]");
        org.junit.Assert.assertNotNull(doubleArray41);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray41), "[]");
        org.junit.Assert.assertNotNull(doubleArray42);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray42), "[]");
        org.junit.Assert.assertNotNull(doubleArray47);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray47), "[]");
        org.junit.Assert.assertNotNull(doubleArray48);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray48), "[]");
        org.junit.Assert.assertNotNull(doubleArray55);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray55), "[]");
        org.junit.Assert.assertNotNull(doubleArray56);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray56), "[]");
        org.junit.Assert.assertNotNull(doubleArray62);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray62), "[]");
        org.junit.Assert.assertNotNull(doubleArray63);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray63), "[]");
        org.junit.Assert.assertNotNull(doubleArray67);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray67), "[]");
        org.junit.Assert.assertNotNull(doubleArray68);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray68), "[]");
        org.junit.Assert.assertNotNull(doubleArray77);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray77), "[]");
        org.junit.Assert.assertNotNull(doubleArray78);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray78), "[]");
        org.junit.Assert.assertNotNull(doubleArray82);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray82), "[]");
        org.junit.Assert.assertNotNull(doubleArray83);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray83), "[]");
    }

    @Test
    public void test15596() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest31.test15596");
        java.lang.String[] strArray4 = new java.lang.String[] {};
        org.apache.commons.math.ode.DerivativeException derivativeException5 = new org.apache.commons.math.ode.DerivativeException("Dormand-Prince 8 (5, 3)", strArray4);
        org.apache.commons.math.ode.DerivativeException derivativeException6 = new org.apache.commons.math.ode.DerivativeException("org.apache.commons.math.ode.IntegratorException: Dormand-Prince 8 (5, 3)", strArray4);
        org.apache.commons.math.ode.DerivativeException derivativeException7 = new org.apache.commons.math.ode.DerivativeException((java.lang.Throwable) derivativeException6);
        java.lang.String[] strArray11 = new java.lang.String[] {};
        org.apache.commons.math.ode.DerivativeException derivativeException12 = new org.apache.commons.math.ode.DerivativeException("Dormand-Prince 8 (5, 3)", strArray11);
        org.apache.commons.math.ode.DerivativeException derivativeException13 = new org.apache.commons.math.ode.DerivativeException("hi!", strArray11);
        org.apache.commons.math.ode.DerivativeException derivativeException14 = new org.apache.commons.math.ode.DerivativeException("Dormand-Prince 8 (5, 3)", strArray11);
        derivativeException7.addSuppressed((java.lang.Throwable) derivativeException14);
        org.apache.commons.math.ode.DerivativeException derivativeException16 = new org.apache.commons.math.ode.DerivativeException((java.lang.Throwable) derivativeException7);
        org.apache.commons.math.ode.IntegratorException integratorException17 = new org.apache.commons.math.ode.IntegratorException((java.lang.Throwable) derivativeException16);
        java.lang.String[] strArray19 = new java.lang.String[] {};
        org.apache.commons.math.ode.DerivativeException derivativeException20 = new org.apache.commons.math.ode.DerivativeException("Dormand-Prince 8 (5, 3)", strArray19);
        org.apache.commons.math.ode.IntegratorException integratorException21 = new org.apache.commons.math.ode.IntegratorException((java.lang.Throwable) derivativeException20);
        java.lang.String[] strArray24 = new java.lang.String[] {};
        org.apache.commons.math.ode.DerivativeException derivativeException25 = new org.apache.commons.math.ode.DerivativeException("Dormand-Prince 8 (5, 3)", strArray24);
        org.apache.commons.math.ode.DerivativeException derivativeException26 = new org.apache.commons.math.ode.DerivativeException("org.apache.commons.math.ode.IntegratorException: Dormand-Prince 8 (5, 3)", strArray24);
        org.apache.commons.math.ode.DerivativeException derivativeException27 = new org.apache.commons.math.ode.DerivativeException((java.lang.Throwable) derivativeException26);
        integratorException21.addSuppressed((java.lang.Throwable) derivativeException27);
        org.apache.commons.math.ode.DerivativeException derivativeException29 = new org.apache.commons.math.ode.DerivativeException((java.lang.Throwable) integratorException21);
        org.apache.commons.math.ode.IntegratorException integratorException30 = new org.apache.commons.math.ode.IntegratorException((java.lang.Throwable) integratorException21);
        integratorException17.addSuppressed((java.lang.Throwable) integratorException30);
        java.lang.String str32 = integratorException30.getPattern();
        java.lang.Throwable[] throwableArray33 = integratorException30.getSuppressed();
        org.apache.commons.math.ode.IntegratorException integratorException34 = new org.apache.commons.math.ode.IntegratorException("hi!", (java.lang.Object[]) throwableArray33);
        org.apache.commons.math.ode.IntegratorException integratorException35 = new org.apache.commons.math.ode.IntegratorException("org.apache.commons.math.ode.DerivativeException: org.apache.commons.math.ode.DerivativeException: org.apache.commons.math.ode.IntegratorException", (java.lang.Object[]) throwableArray33);
        org.junit.Assert.assertNotNull(strArray4);
        org.junit.Assert.assertNotNull(strArray11);
        org.junit.Assert.assertNotNull(strArray19);
        org.junit.Assert.assertNotNull(strArray24);
        org.junit.Assert.assertEquals("'" + str32 + "' != '" + "Dormand-Prince 8 (5, 3)" + "'", str32, "Dormand-Prince 8 (5, 3)");
        org.junit.Assert.assertNotNull(throwableArray33);
    }

    @Test
    public void test15597() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest31.test15597");
        org.apache.commons.math.ode.DormandPrince853Integrator dormandPrince853Integrator4 = new org.apache.commons.math.ode.DormandPrince853Integrator(1.0d, (double) (byte) 10, (double) (short) 1, (double) 0L);
        double double5 = dormandPrince853Integrator4.getMinStep();
        org.apache.commons.math.ode.SwitchingFunction switchingFunction6 = null;
        dormandPrince853Integrator4.addSwitchingFunction(switchingFunction6, (double) 10, (double) 10L, (-1));
        dormandPrince853Integrator4.setMaxGrowth((double) 100.0f);
        dormandPrince853Integrator4.setMaxGrowth((double) 'a');
        double double15 = dormandPrince853Integrator4.getMaxStep();
        double double16 = dormandPrince853Integrator4.getMinReduction();
        java.lang.String str17 = dormandPrince853Integrator4.getName();
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 1.0d + "'", double5 == 1.0d);
        org.junit.Assert.assertTrue("'" + double15 + "' != '" + 10.0d + "'", double15 == 10.0d);
        org.junit.Assert.assertTrue("'" + double16 + "' != '" + 0.2d + "'", double16 == 0.2d);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "Dormand-Prince 8 (5, 3)" + "'", str17, "Dormand-Prince 8 (5, 3)");
    }

    @Test
    public void test15598() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest31.test15598");
        org.apache.commons.math.ode.DormandPrince853Integrator dormandPrince853Integrator4 = new org.apache.commons.math.ode.DormandPrince853Integrator((double) 10, (double) (byte) 10, (double) (short) 100, (double) 1);
        double double5 = dormandPrince853Integrator4.getSafety();
        int int6 = dormandPrince853Integrator4.getOrder();
        double double7 = dormandPrince853Integrator4.getSafety();
        dormandPrince853Integrator4.setSafety((double) (short) -1);
        dormandPrince853Integrator4.setMinReduction((double) (short) 10);
        dormandPrince853Integrator4.setMaxGrowth(0.0d);
        int int14 = dormandPrince853Integrator4.getOrder();
        double double15 = dormandPrince853Integrator4.getMinStep();
        org.apache.commons.math.ode.DormandPrince853Integrator dormandPrince853Integrator20 = new org.apache.commons.math.ode.DormandPrince853Integrator(1.0d, (double) (byte) 10, (double) (short) 1, (double) 0L);
        int int21 = dormandPrince853Integrator20.getOrder();
        java.lang.String str22 = dormandPrince853Integrator20.getName();
        dormandPrince853Integrator20.setSafety((double) (byte) -1);
        double double25 = dormandPrince853Integrator20.getCurrentSignedStepsize();
        double double26 = dormandPrince853Integrator20.getCurrentStepStart();
        org.apache.commons.math.ode.StepHandler stepHandler27 = dormandPrince853Integrator20.getStepHandler();
        dormandPrince853Integrator4.setStepHandler(stepHandler27);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.9d + "'", double5 == 0.9d);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 8 + "'", int6 == 8);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 0.9d + "'", double7 == 0.9d);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 8 + "'", int14 == 8);
        org.junit.Assert.assertTrue("'" + double15 + "' != '" + 10.0d + "'", double15 == 10.0d);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 8 + "'", int21 == 8);
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "Dormand-Prince 8 (5, 3)" + "'", str22, "Dormand-Prince 8 (5, 3)");
        org.junit.Assert.assertTrue("'" + double25 + "' != '" + 3.1622776601683795d + "'", double25 == 3.1622776601683795d);
        org.junit.Assert.assertTrue(Double.isNaN(double26));
        org.junit.Assert.assertNotNull(stepHandler27);
    }

    @Test
    public void test15599() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest31.test15599");
        org.apache.commons.math.ode.DormandPrince853Integrator dormandPrince853Integrator4 = new org.apache.commons.math.ode.DormandPrince853Integrator((double) 10, (double) (byte) 10, (double) (short) 100, (double) 1);
        double double5 = dormandPrince853Integrator4.getSafety();
        double double6 = dormandPrince853Integrator4.getMinStep();
        double double7 = dormandPrince853Integrator4.getMinStep();
        double double8 = dormandPrince853Integrator4.getCurrentSignedStepsize();
        int int9 = dormandPrince853Integrator4.getOrder();
        double double10 = dormandPrince853Integrator4.getMaxGrowth();
        org.apache.commons.math.ode.StepHandler stepHandler11 = dormandPrince853Integrator4.getStepHandler();
        dormandPrince853Integrator4.setMaxGrowth(0.0d);
        int int14 = dormandPrince853Integrator4.getOrder();
        dormandPrince853Integrator4.setMaxGrowth((double) (short) 0);
        org.apache.commons.math.ode.SwitchingFunction switchingFunction17 = null;
        dormandPrince853Integrator4.addSwitchingFunction(switchingFunction17, 0.9d, (double) (byte) 0, (int) (short) 100);
        double double22 = dormandPrince853Integrator4.getSafety();
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.9d + "'", double5 == 0.9d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 10.0d + "'", double6 == 10.0d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 10.0d + "'", double7 == 10.0d);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 10.0d + "'", double8 == 10.0d);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 8 + "'", int9 == 8);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 10.0d + "'", double10 == 10.0d);
        org.junit.Assert.assertNotNull(stepHandler11);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 8 + "'", int14 == 8);
        org.junit.Assert.assertTrue("'" + double22 + "' != '" + 0.9d + "'", double22 == 0.9d);
    }

    @Test
    public void test15600() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest31.test15600");
        org.apache.commons.math.ode.DormandPrince853Integrator dormandPrince853Integrator4 = new org.apache.commons.math.ode.DormandPrince853Integrator(1.0d, (double) (byte) 10, (double) (short) 1, (double) 0L);
        double double5 = dormandPrince853Integrator4.getMinStep();
        int int6 = dormandPrince853Integrator4.getOrder();
        org.apache.commons.math.ode.DormandPrince853Integrator dormandPrince853Integrator11 = new org.apache.commons.math.ode.DormandPrince853Integrator((double) 10, (double) (byte) 10, (double) (short) 100, (double) 1);
        double double12 = dormandPrince853Integrator11.getSafety();
        double double13 = dormandPrince853Integrator11.getMinStep();
        double double14 = dormandPrince853Integrator11.getMinStep();
        double double15 = dormandPrince853Integrator11.getCurrentSignedStepsize();
        int int16 = dormandPrince853Integrator11.getOrder();
        double double17 = dormandPrince853Integrator11.getMaxGrowth();
        org.apache.commons.math.ode.StepHandler stepHandler18 = dormandPrince853Integrator11.getStepHandler();
        dormandPrince853Integrator4.setStepHandler(stepHandler18);
        double double20 = dormandPrince853Integrator4.getCurrentStepStart();
        dormandPrince853Integrator4.setMinReduction((double) (short) 1);
        double double23 = dormandPrince853Integrator4.getMaxGrowth();
        java.lang.String str24 = dormandPrince853Integrator4.getName();
        double double25 = dormandPrince853Integrator4.getCurrentSignedStepsize();
        java.lang.String str26 = dormandPrince853Integrator4.getName();
        double double27 = dormandPrince853Integrator4.getMinStep();
        dormandPrince853Integrator4.setMaxGrowth(48.655726475421666d);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 1.0d + "'", double5 == 1.0d);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 8 + "'", int6 == 8);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 0.9d + "'", double12 == 0.9d);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 10.0d + "'", double13 == 10.0d);
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + 10.0d + "'", double14 == 10.0d);
        org.junit.Assert.assertTrue("'" + double15 + "' != '" + 10.0d + "'", double15 == 10.0d);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 8 + "'", int16 == 8);
        org.junit.Assert.assertTrue("'" + double17 + "' != '" + 10.0d + "'", double17 == 10.0d);
        org.junit.Assert.assertNotNull(stepHandler18);
        org.junit.Assert.assertTrue(Double.isNaN(double20));
        org.junit.Assert.assertTrue("'" + double23 + "' != '" + 10.0d + "'", double23 == 10.0d);
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "Dormand-Prince 8 (5, 3)" + "'", str24, "Dormand-Prince 8 (5, 3)");
        org.junit.Assert.assertTrue("'" + double25 + "' != '" + 3.1622776601683795d + "'", double25 == 3.1622776601683795d);
        org.junit.Assert.assertEquals("'" + str26 + "' != '" + "Dormand-Prince 8 (5, 3)" + "'", str26, "Dormand-Prince 8 (5, 3)");
        org.junit.Assert.assertTrue("'" + double27 + "' != '" + 1.0d + "'", double27 == 1.0d);
    }

    @Test
    public void test15601() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest31.test15601");
        org.apache.commons.math.ode.DormandPrince853Integrator dormandPrince853Integrator4 = new org.apache.commons.math.ode.DormandPrince853Integrator((double) (short) -1, 0.9d, (double) (short) 10, (double) 1L);
        java.lang.String str5 = dormandPrince853Integrator4.getName();
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Dormand-Prince 8 (5, 3)" + "'", str5, "Dormand-Prince 8 (5, 3)");
    }

    @Test
    public void test15602() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest31.test15602");
        org.apache.commons.math.ode.DormandPrince853Integrator dormandPrince853Integrator4 = new org.apache.commons.math.ode.DormandPrince853Integrator((double) 10, (double) (byte) 10, (double) (short) 100, (double) 1);
        double double5 = dormandPrince853Integrator4.getSafety();
        double double6 = dormandPrince853Integrator4.getMinStep();
        java.lang.String str7 = dormandPrince853Integrator4.getName();
        int int8 = dormandPrince853Integrator4.getOrder();
        double double9 = dormandPrince853Integrator4.getCurrentSignedStepsize();
        double double10 = dormandPrince853Integrator4.getMinStep();
        java.lang.String str11 = dormandPrince853Integrator4.getName();
        java.lang.String str12 = dormandPrince853Integrator4.getName();
        java.lang.Class<?> wildcardClass13 = dormandPrince853Integrator4.getClass();
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.9d + "'", double5 == 0.9d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 10.0d + "'", double6 == 10.0d);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "Dormand-Prince 8 (5, 3)" + "'", str7, "Dormand-Prince 8 (5, 3)");
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 8 + "'", int8 == 8);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 10.0d + "'", double9 == 10.0d);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 10.0d + "'", double10 == 10.0d);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "Dormand-Prince 8 (5, 3)" + "'", str11, "Dormand-Prince 8 (5, 3)");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "Dormand-Prince 8 (5, 3)" + "'", str12, "Dormand-Prince 8 (5, 3)");
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test15603() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest31.test15603");
        org.apache.commons.math.ode.DormandPrince853Integrator dormandPrince853Integrator4 = new org.apache.commons.math.ode.DormandPrince853Integrator(1.0d, (double) (byte) 10, (double) (short) 1, (double) 0L);
        double double5 = dormandPrince853Integrator4.getMinStep();
        java.lang.String str6 = dormandPrince853Integrator4.getName();
        org.apache.commons.math.ode.SwitchingFunction switchingFunction7 = null;
        dormandPrince853Integrator4.addSwitchingFunction(switchingFunction7, (double) (-1), (double) (short) 0, 0);
        java.lang.String str12 = dormandPrince853Integrator4.getName();
        java.lang.String str13 = dormandPrince853Integrator4.getName();
        double double14 = dormandPrince853Integrator4.getCurrentSignedStepsize();
        double double15 = dormandPrince853Integrator4.getCurrentSignedStepsize();
        double double16 = dormandPrince853Integrator4.getMinStep();
        double double17 = dormandPrince853Integrator4.getSafety();
        dormandPrince853Integrator4.setInitialStepSize((double) (byte) 0);
        dormandPrince853Integrator4.setMinReduction(0.4472135954999579d);
        double double22 = dormandPrince853Integrator4.getCurrentStepStart();
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 1.0d + "'", double5 == 1.0d);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Dormand-Prince 8 (5, 3)" + "'", str6, "Dormand-Prince 8 (5, 3)");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "Dormand-Prince 8 (5, 3)" + "'", str12, "Dormand-Prince 8 (5, 3)");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "Dormand-Prince 8 (5, 3)" + "'", str13, "Dormand-Prince 8 (5, 3)");
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + 3.1622776601683795d + "'", double14 == 3.1622776601683795d);
        org.junit.Assert.assertTrue("'" + double15 + "' != '" + 3.1622776601683795d + "'", double15 == 3.1622776601683795d);
        org.junit.Assert.assertTrue("'" + double16 + "' != '" + 1.0d + "'", double16 == 1.0d);
        org.junit.Assert.assertTrue("'" + double17 + "' != '" + 0.9d + "'", double17 == 0.9d);
        org.junit.Assert.assertTrue(Double.isNaN(double22));
    }

    @Test
    public void test15604() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest31.test15604");
        org.apache.commons.math.ode.DormandPrince853Integrator dormandPrince853Integrator4 = new org.apache.commons.math.ode.DormandPrince853Integrator(1.0d, (double) (byte) 10, (double) (short) 1, (double) 0L);
        double double5 = dormandPrince853Integrator4.getMinStep();
        java.lang.String str6 = dormandPrince853Integrator4.getName();
        org.apache.commons.math.ode.SwitchingFunction switchingFunction7 = null;
        dormandPrince853Integrator4.addSwitchingFunction(switchingFunction7, (double) (-1), (double) (short) 0, 0);
        java.lang.String str12 = dormandPrince853Integrator4.getName();
        int int13 = dormandPrince853Integrator4.getOrder();
        org.apache.commons.math.ode.SwitchingFunction switchingFunction14 = null;
        dormandPrince853Integrator4.addSwitchingFunction(switchingFunction14, (double) (short) -1, (double) 8, (int) (byte) 10);
        org.apache.commons.math.ode.StepHandler stepHandler19 = dormandPrince853Integrator4.getStepHandler();
        org.apache.commons.math.ode.DormandPrince853Integrator dormandPrince853Integrator24 = new org.apache.commons.math.ode.DormandPrince853Integrator((double) 10, (double) (byte) 10, (double) (short) 100, (double) 1);
        double double25 = dormandPrince853Integrator24.getSafety();
        dormandPrince853Integrator24.setInitialStepSize((double) 0.0f);
        double double28 = dormandPrince853Integrator24.getMaxGrowth();
        org.apache.commons.math.ode.DormandPrince853Integrator dormandPrince853Integrator33 = new org.apache.commons.math.ode.DormandPrince853Integrator(1.0d, (double) (byte) 10, (double) (short) 1, (double) 0L);
        double double34 = dormandPrince853Integrator33.getMinStep();
        org.apache.commons.math.ode.SwitchingFunction switchingFunction35 = null;
        dormandPrince853Integrator33.addSwitchingFunction(switchingFunction35, (double) (-1L), (double) '4', 10);
        org.apache.commons.math.ode.StepHandler stepHandler40 = dormandPrince853Integrator33.getStepHandler();
        int int41 = dormandPrince853Integrator33.getOrder();
        double double42 = dormandPrince853Integrator33.getCurrentStepStart();
        org.apache.commons.math.ode.StepHandler stepHandler43 = dormandPrince853Integrator33.getStepHandler();
        dormandPrince853Integrator24.setStepHandler(stepHandler43);
        dormandPrince853Integrator4.setStepHandler(stepHandler43);
        java.lang.String str46 = dormandPrince853Integrator4.getName();
        dormandPrince853Integrator4.setMaxGrowth(20.0d);
        java.lang.String str49 = dormandPrince853Integrator4.getName();
        dormandPrince853Integrator4.setMaxGrowth(3.0d);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 1.0d + "'", double5 == 1.0d);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Dormand-Prince 8 (5, 3)" + "'", str6, "Dormand-Prince 8 (5, 3)");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "Dormand-Prince 8 (5, 3)" + "'", str12, "Dormand-Prince 8 (5, 3)");
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 8 + "'", int13 == 8);
        org.junit.Assert.assertNotNull(stepHandler19);
        org.junit.Assert.assertTrue("'" + double25 + "' != '" + 0.9d + "'", double25 == 0.9d);
        org.junit.Assert.assertTrue("'" + double28 + "' != '" + 10.0d + "'", double28 == 10.0d);
        org.junit.Assert.assertTrue("'" + double34 + "' != '" + 1.0d + "'", double34 == 1.0d);
        org.junit.Assert.assertNotNull(stepHandler40);
        org.junit.Assert.assertTrue("'" + int41 + "' != '" + 8 + "'", int41 == 8);
        org.junit.Assert.assertTrue(Double.isNaN(double42));
        org.junit.Assert.assertNotNull(stepHandler43);
        org.junit.Assert.assertEquals("'" + str46 + "' != '" + "Dormand-Prince 8 (5, 3)" + "'", str46, "Dormand-Prince 8 (5, 3)");
        org.junit.Assert.assertEquals("'" + str49 + "' != '" + "Dormand-Prince 8 (5, 3)" + "'", str49, "Dormand-Prince 8 (5, 3)");
    }

    @Test
    public void test15605() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest31.test15605");
        java.lang.String[] strArray4 = new java.lang.String[] {};
        org.apache.commons.math.ode.DerivativeException derivativeException5 = new org.apache.commons.math.ode.DerivativeException("Dormand-Prince 8 (5, 3)", strArray4);
        org.apache.commons.math.ode.DerivativeException derivativeException6 = new org.apache.commons.math.ode.DerivativeException("hi!", strArray4);
        org.apache.commons.math.ode.DerivativeException derivativeException7 = new org.apache.commons.math.ode.DerivativeException("hi!", strArray4);
        org.apache.commons.math.ode.DerivativeException derivativeException8 = new org.apache.commons.math.ode.DerivativeException("hi!", strArray4);
        org.apache.commons.math.ode.IntegratorException integratorException9 = new org.apache.commons.math.ode.IntegratorException((java.lang.Throwable) derivativeException8);
        java.lang.String str10 = integratorException9.getPattern();
        java.lang.Object[] objArray19 = new java.lang.Object[] { 100L, true, (-1), Double.NaN, 1, (-1) };
        org.apache.commons.math.ode.IntegratorException integratorException20 = new org.apache.commons.math.ode.IntegratorException("hi!", objArray19);
        java.lang.String str21 = integratorException20.getPattern();
        org.apache.commons.math.ode.DerivativeException derivativeException22 = new org.apache.commons.math.ode.DerivativeException((java.lang.Throwable) integratorException20);
        java.lang.Object[] objArray23 = derivativeException22.getArguments();
        org.apache.commons.math.ode.IntegratorException integratorException24 = new org.apache.commons.math.ode.IntegratorException("Dormand-Prince 8 (5, 3)", objArray23);
        integratorException9.addSuppressed((java.lang.Throwable) integratorException24);
        java.lang.Throwable[] throwableArray26 = integratorException9.getSuppressed();
        org.apache.commons.math.ode.DerivativeException derivativeException27 = new org.apache.commons.math.ode.DerivativeException((java.lang.Throwable) integratorException9);
        java.lang.String str28 = integratorException9.getPattern();
        org.junit.Assert.assertNotNull(strArray4);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertNotNull(objArray19);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray19), "[100, true, -1, NaN, 1, -1]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray19), "[100, true, -1, NaN, 1, -1]");
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "hi!" + "'", str21, "hi!");
        org.junit.Assert.assertNotNull(objArray23);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray23), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray23), "[]");
        org.junit.Assert.assertNotNull(throwableArray26);
        org.junit.Assert.assertEquals("'" + str28 + "' != '" + "hi!" + "'", str28, "hi!");
    }

    @Test
    public void test15606() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest31.test15606");
        java.lang.String[] strArray2 = new java.lang.String[] {};
        org.apache.commons.math.ode.DerivativeException derivativeException3 = new org.apache.commons.math.ode.DerivativeException("Dormand-Prince 8 (5, 3)", strArray2);
        org.apache.commons.math.ode.DerivativeException derivativeException4 = new org.apache.commons.math.ode.DerivativeException("org.apache.commons.math.ode.IntegratorException: Dormand-Prince 8 (5, 3)", strArray2);
        org.apache.commons.math.ode.DerivativeException derivativeException5 = new org.apache.commons.math.ode.DerivativeException((java.lang.Throwable) derivativeException4);
        java.lang.String[] strArray9 = new java.lang.String[] {};
        org.apache.commons.math.ode.DerivativeException derivativeException10 = new org.apache.commons.math.ode.DerivativeException("Dormand-Prince 8 (5, 3)", strArray9);
        org.apache.commons.math.ode.DerivativeException derivativeException11 = new org.apache.commons.math.ode.DerivativeException("hi!", strArray9);
        org.apache.commons.math.ode.DerivativeException derivativeException12 = new org.apache.commons.math.ode.DerivativeException("Dormand-Prince 8 (5, 3)", strArray9);
        derivativeException5.addSuppressed((java.lang.Throwable) derivativeException12);
        java.lang.String[] strArray18 = new java.lang.String[] {};
        org.apache.commons.math.ode.DerivativeException derivativeException19 = new org.apache.commons.math.ode.DerivativeException("Dormand-Prince 8 (5, 3)", strArray18);
        org.apache.commons.math.ode.DerivativeException derivativeException20 = new org.apache.commons.math.ode.DerivativeException("hi!", strArray18);
        org.apache.commons.math.ode.DerivativeException derivativeException21 = new org.apache.commons.math.ode.DerivativeException("hi!", strArray18);
        org.apache.commons.math.ode.DerivativeException derivativeException22 = new org.apache.commons.math.ode.DerivativeException("hi!", strArray18);
        org.apache.commons.math.ode.IntegratorException integratorException23 = new org.apache.commons.math.ode.IntegratorException((java.lang.Throwable) derivativeException22);
        derivativeException12.addSuppressed((java.lang.Throwable) integratorException23);
        java.lang.String[] strArray26 = new java.lang.String[] {};
        org.apache.commons.math.ode.DerivativeException derivativeException27 = new org.apache.commons.math.ode.DerivativeException("Dormand-Prince 8 (5, 3)", strArray26);
        org.apache.commons.math.ode.IntegratorException integratorException28 = new org.apache.commons.math.ode.IntegratorException((java.lang.Throwable) derivativeException27);
        java.lang.Throwable[] throwableArray29 = integratorException28.getSuppressed();
        java.lang.String str30 = integratorException28.getPattern();
        java.lang.Throwable[] throwableArray31 = integratorException28.getSuppressed();
        org.apache.commons.math.ode.IntegratorException integratorException32 = new org.apache.commons.math.ode.IntegratorException((java.lang.Throwable) integratorException28);
        java.lang.String[] strArray37 = new java.lang.String[] {};
        org.apache.commons.math.ode.DerivativeException derivativeException38 = new org.apache.commons.math.ode.DerivativeException("Dormand-Prince 8 (5, 3)", strArray37);
        org.apache.commons.math.ode.DerivativeException derivativeException39 = new org.apache.commons.math.ode.DerivativeException("hi!", strArray37);
        org.apache.commons.math.ode.DerivativeException derivativeException40 = new org.apache.commons.math.ode.DerivativeException("hi!", strArray37);
        org.apache.commons.math.ode.DerivativeException derivativeException41 = new org.apache.commons.math.ode.DerivativeException("hi!", strArray37);
        java.lang.String str42 = derivativeException41.getPattern();
        integratorException28.addSuppressed((java.lang.Throwable) derivativeException41);
        org.apache.commons.math.ode.DerivativeException derivativeException44 = new org.apache.commons.math.ode.DerivativeException((java.lang.Throwable) derivativeException41);
        integratorException23.addSuppressed((java.lang.Throwable) derivativeException41);
        java.lang.Object[] objArray46 = integratorException23.getArguments();
        java.lang.Object[] objArray47 = integratorException23.getArguments();
        org.apache.commons.math.ode.IntegratorException integratorException48 = new org.apache.commons.math.ode.IntegratorException((java.lang.Throwable) integratorException23);
        java.lang.String[] strArray55 = new java.lang.String[] {};
        org.apache.commons.math.ode.DerivativeException derivativeException56 = new org.apache.commons.math.ode.DerivativeException("Dormand-Prince 8 (5, 3)", strArray55);
        org.apache.commons.math.ode.DerivativeException derivativeException57 = new org.apache.commons.math.ode.DerivativeException("hi!", strArray55);
        org.apache.commons.math.ode.DerivativeException derivativeException58 = new org.apache.commons.math.ode.DerivativeException("hi!", strArray55);
        org.apache.commons.math.ode.DerivativeException derivativeException59 = new org.apache.commons.math.ode.DerivativeException("hi!", strArray55);
        org.apache.commons.math.ode.DerivativeException derivativeException60 = new org.apache.commons.math.ode.DerivativeException("org.apache.commons.math.ode.IntegratorException: ", strArray55);
        org.apache.commons.math.ode.DerivativeException derivativeException61 = new org.apache.commons.math.ode.DerivativeException("org.apache.commons.math.ode.IntegratorException: Dormand-Prince 8 (5, 3)", strArray55);
        org.apache.commons.math.ode.DerivativeException derivativeException62 = new org.apache.commons.math.ode.DerivativeException((java.lang.Throwable) derivativeException61);
        integratorException23.addSuppressed((java.lang.Throwable) derivativeException62);
        org.junit.Assert.assertNotNull(strArray2);
        org.junit.Assert.assertNotNull(strArray9);
        org.junit.Assert.assertNotNull(strArray18);
        org.junit.Assert.assertNotNull(strArray26);
        org.junit.Assert.assertNotNull(throwableArray29);
        org.junit.Assert.assertEquals("'" + str30 + "' != '" + "Dormand-Prince 8 (5, 3)" + "'", str30, "Dormand-Prince 8 (5, 3)");
        org.junit.Assert.assertNotNull(throwableArray31);
        org.junit.Assert.assertNotNull(strArray37);
        org.junit.Assert.assertEquals("'" + str42 + "' != '" + "hi!" + "'", str42, "hi!");
        org.junit.Assert.assertNotNull(objArray46);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray46), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray46), "[]");
        org.junit.Assert.assertNotNull(objArray47);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray47), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray47), "[]");
        org.junit.Assert.assertNotNull(strArray55);
    }

    @Test
    public void test15607() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest31.test15607");
        org.apache.commons.math.ode.DormandPrince853Integrator dormandPrince853Integrator4 = new org.apache.commons.math.ode.DormandPrince853Integrator((double) (byte) -1, (double) 'a', (double) 10, (double) (short) -1);
        dormandPrince853Integrator4.setSafety((double) 0L);
        double double7 = dormandPrince853Integrator4.getCurrentStepStart();
        double double8 = dormandPrince853Integrator4.getMinStep();
        double double9 = dormandPrince853Integrator4.getMinStep();
        dormandPrince853Integrator4.setInitialStepSize(17.88854381999832d);
        double double12 = dormandPrince853Integrator4.getSafety();
        org.junit.Assert.assertTrue(Double.isNaN(double7));
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + (-1.0d) + "'", double8 == (-1.0d));
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + (-1.0d) + "'", double9 == (-1.0d));
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 0.0d + "'", double12 == 0.0d);
    }

    @Test
    public void test15608() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest31.test15608");
        org.apache.commons.math.ode.DormandPrince853Integrator dormandPrince853Integrator4 = new org.apache.commons.math.ode.DormandPrince853Integrator(1.0d, (double) (byte) 10, (double) (short) 1, (double) 0L);
        int int5 = dormandPrince853Integrator4.getOrder();
        double double6 = dormandPrince853Integrator4.getSafety();
        dormandPrince853Integrator4.setSafety((double) (-1));
        dormandPrince853Integrator4.setSafety(0.0d);
        double double11 = dormandPrince853Integrator4.getMinReduction();
        org.apache.commons.math.ode.StepHandler stepHandler12 = dormandPrince853Integrator4.getStepHandler();
        org.apache.commons.math.ode.SwitchingFunction switchingFunction13 = null;
        dormandPrince853Integrator4.addSwitchingFunction(switchingFunction13, 4.404543109109048d, 98.48857801796105d, (int) (byte) 0);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 8 + "'", int5 == 8);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.9d + "'", double6 == 0.9d);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 0.2d + "'", double11 == 0.2d);
        org.junit.Assert.assertNotNull(stepHandler12);
    }

    @Test
    public void test15609() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest31.test15609");
        java.lang.String[] strArray1 = new java.lang.String[] {};
        org.apache.commons.math.ode.DerivativeException derivativeException2 = new org.apache.commons.math.ode.DerivativeException("Dormand-Prince 8 (5, 3)", strArray1);
        java.lang.String str3 = derivativeException2.getPattern();
        org.apache.commons.math.ode.IntegratorException integratorException4 = new org.apache.commons.math.ode.IntegratorException((java.lang.Throwable) derivativeException2);
        org.apache.commons.math.ode.DerivativeException derivativeException5 = new org.apache.commons.math.ode.DerivativeException((java.lang.Throwable) derivativeException2);
        java.lang.String[] strArray13 = new java.lang.String[] {};
        org.apache.commons.math.ode.DerivativeException derivativeException14 = new org.apache.commons.math.ode.DerivativeException("Dormand-Prince 8 (5, 3)", strArray13);
        org.apache.commons.math.ode.DerivativeException derivativeException15 = new org.apache.commons.math.ode.DerivativeException("hi!", strArray13);
        org.apache.commons.math.ode.DerivativeException derivativeException16 = new org.apache.commons.math.ode.DerivativeException("hi!", strArray13);
        org.apache.commons.math.ode.DerivativeException derivativeException17 = new org.apache.commons.math.ode.DerivativeException("hi!", strArray13);
        org.apache.commons.math.ode.IntegratorException integratorException18 = new org.apache.commons.math.ode.IntegratorException("org.apache.commons.math.ode.DerivativeException: Dormand-Prince 8 (5, 3)", (java.lang.Object[]) strArray13);
        org.apache.commons.math.ode.DerivativeException derivativeException19 = new org.apache.commons.math.ode.DerivativeException("org.apache.commons.math.ode.IntegratorException: Dormand-Prince 8 (5, 3)", strArray13);
        org.apache.commons.math.ode.DerivativeException derivativeException20 = new org.apache.commons.math.ode.DerivativeException("", strArray13);
        derivativeException5.addSuppressed((java.lang.Throwable) derivativeException20);
        org.apache.commons.math.ode.DerivativeException derivativeException22 = new org.apache.commons.math.ode.DerivativeException((java.lang.Throwable) derivativeException5);
        java.lang.Throwable[] throwableArray23 = derivativeException22.getSuppressed();
        java.lang.String str24 = derivativeException22.getPattern();
        java.lang.String str25 = derivativeException22.getPattern();
        org.junit.Assert.assertNotNull(strArray1);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Dormand-Prince 8 (5, 3)" + "'", str3, "Dormand-Prince 8 (5, 3)");
        org.junit.Assert.assertNotNull(strArray13);
        org.junit.Assert.assertNotNull(throwableArray23);
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "Dormand-Prince 8 (5, 3)" + "'", str24, "Dormand-Prince 8 (5, 3)");
        org.junit.Assert.assertEquals("'" + str25 + "' != '" + "Dormand-Prince 8 (5, 3)" + "'", str25, "Dormand-Prince 8 (5, 3)");
    }

    @Test
    public void test15610() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest31.test15610");
        org.apache.commons.math.ode.DormandPrince853Integrator dormandPrince853Integrator4 = new org.apache.commons.math.ode.DormandPrince853Integrator((double) 10, (double) (byte) 10, (double) (short) 100, (double) 1);
        dormandPrince853Integrator4.setSafety((double) '#');
        dormandPrince853Integrator4.setMaxGrowth((double) 100.0f);
        java.lang.String str9 = dormandPrince853Integrator4.getName();
        double double10 = dormandPrince853Integrator4.getMinReduction();
        int int11 = dormandPrince853Integrator4.getOrder();
        org.apache.commons.math.ode.StepHandler stepHandler12 = dormandPrince853Integrator4.getStepHandler();
        double double13 = dormandPrince853Integrator4.getMaxStep();
        double double14 = dormandPrince853Integrator4.getSafety();
        double double15 = dormandPrince853Integrator4.getCurrentSignedStepsize();
        java.lang.String str16 = dormandPrince853Integrator4.getName();
        dormandPrince853Integrator4.setMinReduction((double) (short) 10);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "Dormand-Prince 8 (5, 3)" + "'", str9, "Dormand-Prince 8 (5, 3)");
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 0.2d + "'", double10 == 0.2d);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 8 + "'", int11 == 8);
        org.junit.Assert.assertNotNull(stepHandler12);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 10.0d + "'", double13 == 10.0d);
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + 35.0d + "'", double14 == 35.0d);
        org.junit.Assert.assertTrue("'" + double15 + "' != '" + 10.0d + "'", double15 == 10.0d);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "Dormand-Prince 8 (5, 3)" + "'", str16, "Dormand-Prince 8 (5, 3)");
    }

    @Test
    public void test15611() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest31.test15611");
        org.apache.commons.math.ode.DormandPrince853Integrator dormandPrince853Integrator4 = new org.apache.commons.math.ode.DormandPrince853Integrator((double) 10, (double) (byte) 10, (double) (short) 100, (double) 1);
        double double5 = dormandPrince853Integrator4.getSafety();
        int int6 = dormandPrince853Integrator4.getOrder();
        double double7 = dormandPrince853Integrator4.getSafety();
        dormandPrince853Integrator4.setSafety((double) (short) -1);
        dormandPrince853Integrator4.setMinReduction((double) (short) 10);
        java.lang.String str12 = dormandPrince853Integrator4.getName();
        double double13 = dormandPrince853Integrator4.getMinReduction();
        double double14 = dormandPrince853Integrator4.getCurrentStepStart();
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.9d + "'", double5 == 0.9d);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 8 + "'", int6 == 8);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 0.9d + "'", double7 == 0.9d);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "Dormand-Prince 8 (5, 3)" + "'", str12, "Dormand-Prince 8 (5, 3)");
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 10.0d + "'", double13 == 10.0d);
        org.junit.Assert.assertTrue(Double.isNaN(double14));
    }

    @Test
    public void test15612() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest31.test15612");
        java.lang.Object[] objArray7 = new java.lang.Object[] { 100L, true, (-1), Double.NaN, 1, (-1) };
        org.apache.commons.math.ode.IntegratorException integratorException8 = new org.apache.commons.math.ode.IntegratorException("hi!", objArray7);
        java.lang.String str9 = integratorException8.getPattern();
        org.apache.commons.math.ode.DerivativeException derivativeException10 = new org.apache.commons.math.ode.DerivativeException((java.lang.Throwable) integratorException8);
        org.apache.commons.math.ode.DerivativeException derivativeException11 = new org.apache.commons.math.ode.DerivativeException((java.lang.Throwable) integratorException8);
        java.lang.String str12 = integratorException8.getPattern();
        org.apache.commons.math.ode.DerivativeException derivativeException13 = new org.apache.commons.math.ode.DerivativeException((java.lang.Throwable) integratorException8);
        org.apache.commons.math.ode.IntegratorException integratorException14 = new org.apache.commons.math.ode.IntegratorException((java.lang.Throwable) integratorException8);
        org.apache.commons.math.ode.IntegratorException integratorException15 = new org.apache.commons.math.ode.IntegratorException((java.lang.Throwable) integratorException14);
        java.lang.Throwable[] throwableArray16 = integratorException14.getSuppressed();
        java.lang.String[] strArray25 = new java.lang.String[] {};
        org.apache.commons.math.ode.DerivativeException derivativeException26 = new org.apache.commons.math.ode.DerivativeException("Dormand-Prince 8 (5, 3)", strArray25);
        org.apache.commons.math.ode.DerivativeException derivativeException27 = new org.apache.commons.math.ode.DerivativeException("hi!", strArray25);
        org.apache.commons.math.ode.DerivativeException derivativeException28 = new org.apache.commons.math.ode.DerivativeException("hi!", strArray25);
        org.apache.commons.math.ode.DerivativeException derivativeException29 = new org.apache.commons.math.ode.DerivativeException("hi!", strArray25);
        org.apache.commons.math.ode.IntegratorException integratorException30 = new org.apache.commons.math.ode.IntegratorException("org.apache.commons.math.ode.DerivativeException: Dormand-Prince 8 (5, 3)", (java.lang.Object[]) strArray25);
        org.apache.commons.math.ode.DerivativeException derivativeException31 = new org.apache.commons.math.ode.DerivativeException("org.apache.commons.math.ode.IntegratorException: Dormand-Prince 8 (5, 3)", strArray25);
        org.apache.commons.math.ode.DerivativeException derivativeException32 = new org.apache.commons.math.ode.DerivativeException("org.apache.commons.math.ode.DerivativeException: Dormand-Prince 8 (5, 3)", strArray25);
        org.apache.commons.math.ode.IntegratorException integratorException33 = new org.apache.commons.math.ode.IntegratorException("org.apache.commons.math.ode.DerivativeException: Dormand-Prince 8 (5, 3)", (java.lang.Object[]) strArray25);
        java.lang.String str34 = integratorException33.getPattern();
        java.lang.Throwable[] throwableArray35 = integratorException33.getSuppressed();
        org.apache.commons.math.ode.DerivativeException derivativeException36 = new org.apache.commons.math.ode.DerivativeException((java.lang.Throwable) integratorException33);
        java.lang.Throwable throwable37 = null;
        org.apache.commons.math.ode.IntegratorException integratorException38 = new org.apache.commons.math.ode.IntegratorException(throwable37);
        org.apache.commons.math.ode.IntegratorException integratorException39 = new org.apache.commons.math.ode.IntegratorException((java.lang.Throwable) integratorException38);
        java.lang.String str40 = integratorException38.getPattern();
        java.lang.Throwable[] throwableArray41 = integratorException38.getSuppressed();
        org.apache.commons.math.ode.DerivativeException derivativeException42 = new org.apache.commons.math.ode.DerivativeException((java.lang.Throwable) integratorException38);
        derivativeException36.addSuppressed((java.lang.Throwable) integratorException38);
        java.lang.Throwable[] throwableArray44 = integratorException38.getSuppressed();
        org.apache.commons.math.ode.IntegratorException integratorException45 = new org.apache.commons.math.ode.IntegratorException((java.lang.Throwable) integratorException38);
        java.lang.String[] strArray47 = new java.lang.String[] {};
        org.apache.commons.math.ode.DerivativeException derivativeException48 = new org.apache.commons.math.ode.DerivativeException("Dormand-Prince 8 (5, 3)", strArray47);
        java.lang.String str49 = derivativeException48.getPattern();
        org.apache.commons.math.ode.IntegratorException integratorException50 = new org.apache.commons.math.ode.IntegratorException((java.lang.Throwable) derivativeException48);
        java.lang.String[] strArray55 = new java.lang.String[] {};
        org.apache.commons.math.ode.DerivativeException derivativeException56 = new org.apache.commons.math.ode.DerivativeException("Dormand-Prince 8 (5, 3)", strArray55);
        org.apache.commons.math.ode.DerivativeException derivativeException57 = new org.apache.commons.math.ode.DerivativeException("hi!", strArray55);
        org.apache.commons.math.ode.DerivativeException derivativeException58 = new org.apache.commons.math.ode.DerivativeException("hi!", strArray55);
        org.apache.commons.math.ode.IntegratorException integratorException59 = new org.apache.commons.math.ode.IntegratorException("org.apache.commons.math.ode.IntegratorException: hi!", (java.lang.Object[]) strArray55);
        java.lang.Throwable[] throwableArray60 = integratorException59.getSuppressed();
        java.lang.Throwable[] throwableArray61 = integratorException59.getSuppressed();
        java.lang.Object[] objArray62 = integratorException59.getArguments();
        java.lang.String[] strArray68 = new java.lang.String[] {};
        org.apache.commons.math.ode.DerivativeException derivativeException69 = new org.apache.commons.math.ode.DerivativeException("Dormand-Prince 8 (5, 3)", strArray68);
        org.apache.commons.math.ode.DerivativeException derivativeException70 = new org.apache.commons.math.ode.DerivativeException("org.apache.commons.math.ode.IntegratorException: Dormand-Prince 8 (5, 3)", strArray68);
        org.apache.commons.math.ode.IntegratorException integratorException71 = new org.apache.commons.math.ode.IntegratorException("hi!", (java.lang.Object[]) strArray68);
        org.apache.commons.math.ode.DerivativeException derivativeException72 = new org.apache.commons.math.ode.DerivativeException("org.apache.commons.math.ode.IntegratorException: Dormand-Prince 8 (5, 3)", strArray68);
        org.apache.commons.math.ode.DerivativeException derivativeException73 = new org.apache.commons.math.ode.DerivativeException("org.apache.commons.math.ode.DerivativeException: Dormand-Prince 8 (5, 3)", strArray68);
        java.lang.Object[] objArray74 = derivativeException73.getArguments();
        integratorException59.addSuppressed((java.lang.Throwable) derivativeException73);
        integratorException50.addSuppressed((java.lang.Throwable) integratorException59);
        org.apache.commons.math.ode.DerivativeException derivativeException77 = new org.apache.commons.math.ode.DerivativeException((java.lang.Throwable) integratorException59);
        integratorException45.addSuppressed((java.lang.Throwable) derivativeException77);
        org.apache.commons.math.ode.IntegratorException integratorException79 = new org.apache.commons.math.ode.IntegratorException((java.lang.Throwable) derivativeException77);
        integratorException14.addSuppressed((java.lang.Throwable) derivativeException77);
        org.junit.Assert.assertNotNull(objArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray7), "[100, true, -1, NaN, 1, -1]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray7), "[100, true, -1, NaN, 1, -1]");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!" + "'", str12, "hi!");
        org.junit.Assert.assertNotNull(throwableArray16);
        org.junit.Assert.assertNotNull(strArray25);
        org.junit.Assert.assertEquals("'" + str34 + "' != '" + "org.apache.commons.math.ode.DerivativeException: Dormand-Prince 8 (5, 3)" + "'", str34, "org.apache.commons.math.ode.DerivativeException: Dormand-Prince 8 (5, 3)");
        org.junit.Assert.assertNotNull(throwableArray35);
        org.junit.Assert.assertNull(str40);
        org.junit.Assert.assertNotNull(throwableArray41);
        org.junit.Assert.assertNotNull(throwableArray44);
        org.junit.Assert.assertNotNull(strArray47);
        org.junit.Assert.assertEquals("'" + str49 + "' != '" + "Dormand-Prince 8 (5, 3)" + "'", str49, "Dormand-Prince 8 (5, 3)");
        org.junit.Assert.assertNotNull(strArray55);
        org.junit.Assert.assertNotNull(throwableArray60);
        org.junit.Assert.assertNotNull(throwableArray61);
        org.junit.Assert.assertNotNull(objArray62);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray62), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray62), "[]");
        org.junit.Assert.assertNotNull(strArray68);
        org.junit.Assert.assertNotNull(objArray74);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray74), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray74), "[]");
    }

    @Test
    public void test15613() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest31.test15613");
        org.apache.commons.math.ode.DormandPrince853Integrator dormandPrince853Integrator4 = new org.apache.commons.math.ode.DormandPrince853Integrator((double) 100L, 0.0d, 2.3713737056616555d, (double) 0L);
    }

    @Test
    public void test15614() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest31.test15614");
        org.apache.commons.math.ode.DormandPrince853Integrator dormandPrince853Integrator4 = new org.apache.commons.math.ode.DormandPrince853Integrator(1.0d, (double) (byte) 10, (double) (short) 1, (double) 0L);
        int int5 = dormandPrince853Integrator4.getOrder();
        double double6 = dormandPrince853Integrator4.getSafety();
        dormandPrince853Integrator4.setSafety((double) (-1));
        double double9 = dormandPrince853Integrator4.getMinStep();
        double double10 = dormandPrince853Integrator4.getMinStep();
        java.lang.String str11 = dormandPrince853Integrator4.getName();
        org.apache.commons.math.ode.StepHandler stepHandler12 = null;
        dormandPrince853Integrator4.setStepHandler(stepHandler12);
        double double14 = dormandPrince853Integrator4.getMaxGrowth();
        java.lang.String str15 = dormandPrince853Integrator4.getName();
        dormandPrince853Integrator4.setMinReduction(3.138288992714996d);
        double double18 = dormandPrince853Integrator4.getCurrentStepStart();
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 8 + "'", int5 == 8);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.9d + "'", double6 == 0.9d);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 1.0d + "'", double9 == 1.0d);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 1.0d + "'", double10 == 1.0d);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "Dormand-Prince 8 (5, 3)" + "'", str11, "Dormand-Prince 8 (5, 3)");
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + 10.0d + "'", double14 == 10.0d);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "Dormand-Prince 8 (5, 3)" + "'", str15, "Dormand-Prince 8 (5, 3)");
        org.junit.Assert.assertTrue(Double.isNaN(double18));
    }

    @Test
    public void test15615() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest31.test15615");
        org.apache.commons.math.ode.DormandPrince853Integrator dormandPrince853Integrator4 = new org.apache.commons.math.ode.DormandPrince853Integrator(1.0d, (double) (byte) 10, (double) (short) 1, (double) 0L);
        double double5 = dormandPrince853Integrator4.getMinStep();
        int int6 = dormandPrince853Integrator4.getOrder();
        double double7 = dormandPrince853Integrator4.getCurrentSignedStepsize();
        int int8 = dormandPrince853Integrator4.getOrder();
        dormandPrince853Integrator4.setSafety(0.9486832980505138d);
        org.apache.commons.math.ode.SwitchingFunction switchingFunction11 = null;
        dormandPrince853Integrator4.addSwitchingFunction(switchingFunction11, (double) (byte) -1, (double) 100L, (int) (short) 10);
        dormandPrince853Integrator4.setSafety((double) (short) -1);
        java.lang.Class<?> wildcardClass18 = dormandPrince853Integrator4.getClass();
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 1.0d + "'", double5 == 1.0d);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 8 + "'", int6 == 8);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 3.1622776601683795d + "'", double7 == 3.1622776601683795d);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 8 + "'", int8 == 8);
        org.junit.Assert.assertNotNull(wildcardClass18);
    }

    @Test
    public void test15616() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest31.test15616");
        java.lang.String[] strArray10 = new java.lang.String[] {};
        org.apache.commons.math.ode.DerivativeException derivativeException11 = new org.apache.commons.math.ode.DerivativeException("Dormand-Prince 8 (5, 3)", strArray10);
        org.apache.commons.math.ode.DerivativeException derivativeException12 = new org.apache.commons.math.ode.DerivativeException("hi!", strArray10);
        org.apache.commons.math.ode.DerivativeException derivativeException13 = new org.apache.commons.math.ode.DerivativeException("hi!", strArray10);
        org.apache.commons.math.ode.DerivativeException derivativeException14 = new org.apache.commons.math.ode.DerivativeException("hi!", strArray10);
        org.apache.commons.math.ode.DerivativeException derivativeException15 = new org.apache.commons.math.ode.DerivativeException("org.apache.commons.math.ode.IntegratorException: ", strArray10);
        org.apache.commons.math.ode.DerivativeException derivativeException16 = new org.apache.commons.math.ode.DerivativeException("org.apache.commons.math.ode.IntegratorException: Dormand-Prince 8 (5, 3)", strArray10);
        org.apache.commons.math.ode.DerivativeException derivativeException17 = new org.apache.commons.math.ode.DerivativeException("org.apache.commons.math.ode.DerivativeException: org.apache.commons.math.ode.IntegratorException", strArray10);
        org.apache.commons.math.ode.DerivativeException derivativeException18 = new org.apache.commons.math.ode.DerivativeException("org.apache.commons.math.ode.DerivativeException: org.apache.commons.math.ode.IntegratorException: org.apache.commons.math.ode.DerivativeException: org.apache.commons.math.ode.IntegratorException: Dormand-Prince 8 (5, 3)", strArray10);
        org.apache.commons.math.ode.DerivativeException derivativeException19 = new org.apache.commons.math.ode.DerivativeException("org.apache.commons.math.ode.DerivativeException: org.apache.commons.math.ode.IntegratorException: org.apache.commons.math.ode.DerivativeException: org.apache.commons.math.ode.DerivativeException: org.apache.commons.math.ode.IntegratorException: hi!", strArray10);
        org.apache.commons.math.ode.DerivativeException derivativeException20 = new org.apache.commons.math.ode.DerivativeException("org.apache.commons.math.ode.IntegratorException: org.apache.commons.math.ode.IntegratorException: org.apache.commons.math.ode.IntegratorException: org.apache.commons.math.ode.IntegratorException: Dormand-Prince 8 (5, 3)", strArray10);
        org.junit.Assert.assertNotNull(strArray10);
    }

    @Test
    public void test15617() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest31.test15617");
        org.apache.commons.math.ode.DormandPrince853Integrator dormandPrince853Integrator4 = new org.apache.commons.math.ode.DormandPrince853Integrator((double) 10, (double) (byte) 10, (double) (short) 100, (double) 1);
        double double5 = dormandPrince853Integrator4.getSafety();
        double double6 = dormandPrince853Integrator4.getMinStep();
        dormandPrince853Integrator4.setSafety((double) '#');
        double double9 = dormandPrince853Integrator4.getCurrentStepStart();
        double double10 = dormandPrince853Integrator4.getMaxStep();
        org.apache.commons.math.ode.StepHandler stepHandler11 = dormandPrince853Integrator4.getStepHandler();
        double double12 = dormandPrince853Integrator4.getCurrentStepStart();
        double double13 = dormandPrince853Integrator4.getSafety();
        org.apache.commons.math.ode.StepHandler stepHandler14 = dormandPrince853Integrator4.getStepHandler();
        int int15 = dormandPrince853Integrator4.getOrder();
        dormandPrince853Integrator4.setSafety((double) 10L);
        dormandPrince853Integrator4.setInitialStepSize(0.0d);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.9d + "'", double5 == 0.9d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 10.0d + "'", double6 == 10.0d);
        org.junit.Assert.assertTrue(Double.isNaN(double9));
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 10.0d + "'", double10 == 10.0d);
        org.junit.Assert.assertNotNull(stepHandler11);
        org.junit.Assert.assertTrue(Double.isNaN(double12));
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 35.0d + "'", double13 == 35.0d);
        org.junit.Assert.assertNotNull(stepHandler14);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 8 + "'", int15 == 8);
    }

    @Test
    public void test15618() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest31.test15618");
        double[] doubleArray4 = new double[] {};
        double[] doubleArray5 = new double[] {};
        org.apache.commons.math.ode.DormandPrince853Integrator dormandPrince853Integrator6 = new org.apache.commons.math.ode.DormandPrince853Integrator((double) 1.0f, (double) 1.0f, doubleArray4, doubleArray5);
        double[] doubleArray11 = new double[] {};
        double[] doubleArray12 = new double[] {};
        org.apache.commons.math.ode.DormandPrince853Integrator dormandPrince853Integrator13 = new org.apache.commons.math.ode.DormandPrince853Integrator((double) 1.0f, (double) 1.0f, doubleArray11, doubleArray12);
        double[] doubleArray16 = new double[] {};
        double[] doubleArray17 = new double[] {};
        org.apache.commons.math.ode.DormandPrince853Integrator dormandPrince853Integrator18 = new org.apache.commons.math.ode.DormandPrince853Integrator((double) 1.0f, (double) 1.0f, doubleArray16, doubleArray17);
        org.apache.commons.math.ode.DormandPrince853Integrator dormandPrince853Integrator19 = new org.apache.commons.math.ode.DormandPrince853Integrator((double) ' ', (double) 'a', doubleArray12, doubleArray17);
        org.apache.commons.math.ode.DormandPrince853Integrator dormandPrince853Integrator20 = new org.apache.commons.math.ode.DormandPrince853Integrator(0.9d, (double) 1L, doubleArray4, doubleArray17);
        double double21 = dormandPrince853Integrator20.getSafety();
        java.lang.String str22 = dormandPrince853Integrator20.getName();
        double double23 = dormandPrince853Integrator20.getMinStep();
        org.apache.commons.math.ode.DormandPrince853Integrator dormandPrince853Integrator28 = new org.apache.commons.math.ode.DormandPrince853Integrator((double) 10, (double) (byte) 10, (double) (short) 100, (double) 1);
        double double29 = dormandPrince853Integrator28.getSafety();
        double double30 = dormandPrince853Integrator28.getMinStep();
        double double31 = dormandPrince853Integrator28.getMinStep();
        double double32 = dormandPrince853Integrator28.getCurrentSignedStepsize();
        int int33 = dormandPrince853Integrator28.getOrder();
        double double34 = dormandPrince853Integrator28.getMaxGrowth();
        double double35 = dormandPrince853Integrator28.getMinStep();
        double double36 = dormandPrince853Integrator28.getMaxStep();
        dormandPrince853Integrator28.setInitialStepSize((double) 100L);
        org.apache.commons.math.ode.StepHandler stepHandler39 = dormandPrince853Integrator28.getStepHandler();
        org.apache.commons.math.ode.DormandPrince853Integrator dormandPrince853Integrator44 = new org.apache.commons.math.ode.DormandPrince853Integrator(1.0d, (double) (byte) 10, (double) (short) 1, (double) 0L);
        double double45 = dormandPrince853Integrator44.getMinStep();
        org.apache.commons.math.ode.SwitchingFunction switchingFunction46 = null;
        dormandPrince853Integrator44.addSwitchingFunction(switchingFunction46, (double) 10, (double) 10L, (-1));
        double double51 = dormandPrince853Integrator44.getMinStep();
        dormandPrince853Integrator44.setMinReduction((double) 10);
        org.apache.commons.math.ode.DormandPrince853Integrator dormandPrince853Integrator58 = new org.apache.commons.math.ode.DormandPrince853Integrator((double) 10, (double) (byte) 10, (double) (short) 100, (double) 1);
        double double59 = dormandPrince853Integrator58.getSafety();
        double double60 = dormandPrince853Integrator58.getMinStep();
        double double61 = dormandPrince853Integrator58.getMinStep();
        double double62 = dormandPrince853Integrator58.getCurrentSignedStepsize();
        int int63 = dormandPrince853Integrator58.getOrder();
        double double64 = dormandPrince853Integrator58.getMaxGrowth();
        dormandPrince853Integrator58.setSafety((double) (-1L));
        org.apache.commons.math.ode.StepHandler stepHandler67 = dormandPrince853Integrator58.getStepHandler();
        dormandPrince853Integrator44.setStepHandler(stepHandler67);
        dormandPrince853Integrator28.setStepHandler(stepHandler67);
        dormandPrince853Integrator20.setStepHandler(stepHandler67);
        org.junit.Assert.assertNotNull(doubleArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray4), "[]");
        org.junit.Assert.assertNotNull(doubleArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray5), "[]");
        org.junit.Assert.assertNotNull(doubleArray11);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray11), "[]");
        org.junit.Assert.assertNotNull(doubleArray12);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray12), "[]");
        org.junit.Assert.assertNotNull(doubleArray16);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray16), "[]");
        org.junit.Assert.assertNotNull(doubleArray17);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray17), "[]");
        org.junit.Assert.assertTrue("'" + double21 + "' != '" + 0.9d + "'", double21 == 0.9d);
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "Dormand-Prince 8 (5, 3)" + "'", str22, "Dormand-Prince 8 (5, 3)");
        org.junit.Assert.assertTrue("'" + double23 + "' != '" + 0.9d + "'", double23 == 0.9d);
        org.junit.Assert.assertTrue("'" + double29 + "' != '" + 0.9d + "'", double29 == 0.9d);
        org.junit.Assert.assertTrue("'" + double30 + "' != '" + 10.0d + "'", double30 == 10.0d);
        org.junit.Assert.assertTrue("'" + double31 + "' != '" + 10.0d + "'", double31 == 10.0d);
        org.junit.Assert.assertTrue("'" + double32 + "' != '" + 10.0d + "'", double32 == 10.0d);
        org.junit.Assert.assertTrue("'" + int33 + "' != '" + 8 + "'", int33 == 8);
        org.junit.Assert.assertTrue("'" + double34 + "' != '" + 10.0d + "'", double34 == 10.0d);
        org.junit.Assert.assertTrue("'" + double35 + "' != '" + 10.0d + "'", double35 == 10.0d);
        org.junit.Assert.assertTrue("'" + double36 + "' != '" + 10.0d + "'", double36 == 10.0d);
        org.junit.Assert.assertNotNull(stepHandler39);
        org.junit.Assert.assertTrue("'" + double45 + "' != '" + 1.0d + "'", double45 == 1.0d);
        org.junit.Assert.assertTrue("'" + double51 + "' != '" + 1.0d + "'", double51 == 1.0d);
        org.junit.Assert.assertTrue("'" + double59 + "' != '" + 0.9d + "'", double59 == 0.9d);
        org.junit.Assert.assertTrue("'" + double60 + "' != '" + 10.0d + "'", double60 == 10.0d);
        org.junit.Assert.assertTrue("'" + double61 + "' != '" + 10.0d + "'", double61 == 10.0d);
        org.junit.Assert.assertTrue("'" + double62 + "' != '" + 10.0d + "'", double62 == 10.0d);
        org.junit.Assert.assertTrue("'" + int63 + "' != '" + 8 + "'", int63 == 8);
        org.junit.Assert.assertTrue("'" + double64 + "' != '" + 10.0d + "'", double64 == 10.0d);
        org.junit.Assert.assertNotNull(stepHandler67);
    }

    @Test
    public void test15619() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest31.test15619");
        java.lang.String[] strArray5 = new java.lang.String[] {};
        org.apache.commons.math.ode.DerivativeException derivativeException6 = new org.apache.commons.math.ode.DerivativeException("Dormand-Prince 8 (5, 3)", strArray5);
        org.apache.commons.math.ode.DerivativeException derivativeException7 = new org.apache.commons.math.ode.DerivativeException("hi!", strArray5);
        org.apache.commons.math.ode.DerivativeException derivativeException8 = new org.apache.commons.math.ode.DerivativeException("hi!", strArray5);
        org.apache.commons.math.ode.IntegratorException integratorException9 = new org.apache.commons.math.ode.IntegratorException("", (java.lang.Object[]) strArray5);
        org.apache.commons.math.ode.DerivativeException derivativeException10 = new org.apache.commons.math.ode.DerivativeException("hi!", strArray5);
        java.lang.String str11 = derivativeException10.getPattern();
        java.lang.Throwable[] throwableArray12 = derivativeException10.getSuppressed();
        java.lang.String str13 = derivativeException10.getPattern();
        java.lang.Throwable[] throwableArray14 = derivativeException10.getSuppressed();
        java.lang.Class<?> wildcardClass15 = throwableArray14.getClass();
        org.junit.Assert.assertNotNull(strArray5);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!" + "'", str11, "hi!");
        org.junit.Assert.assertNotNull(throwableArray12);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "hi!" + "'", str13, "hi!");
        org.junit.Assert.assertNotNull(throwableArray14);
        org.junit.Assert.assertNotNull(wildcardClass15);
    }

    @Test
    public void test15620() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest31.test15620");
        org.apache.commons.math.ode.DormandPrince853Integrator dormandPrince853Integrator4 = new org.apache.commons.math.ode.DormandPrince853Integrator(1.0d, (double) (byte) 10, (double) (short) 1, (double) 0L);
        double double5 = dormandPrince853Integrator4.getMinStep();
        org.apache.commons.math.ode.SwitchingFunction switchingFunction6 = null;
        dormandPrince853Integrator4.addSwitchingFunction(switchingFunction6, (double) (-1L), (double) '4', 10);
        double double11 = dormandPrince853Integrator4.getCurrentSignedStepsize();
        double double12 = dormandPrince853Integrator4.getMinReduction();
        int int13 = dormandPrince853Integrator4.getOrder();
        double double14 = dormandPrince853Integrator4.getMaxGrowth();
        double double15 = dormandPrince853Integrator4.getCurrentSignedStepsize();
        double double16 = dormandPrince853Integrator4.getCurrentSignedStepsize();
        dormandPrince853Integrator4.setInitialStepSize(35.0d);
        dormandPrince853Integrator4.setMaxGrowth(55.71355310873648d);
        double double21 = dormandPrince853Integrator4.getMaxStep();
        dormandPrince853Integrator4.setSafety(3.7470125727948562d);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 1.0d + "'", double5 == 1.0d);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 3.1622776601683795d + "'", double11 == 3.1622776601683795d);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 0.2d + "'", double12 == 0.2d);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 8 + "'", int13 == 8);
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + 10.0d + "'", double14 == 10.0d);
        org.junit.Assert.assertTrue("'" + double15 + "' != '" + 3.1622776601683795d + "'", double15 == 3.1622776601683795d);
        org.junit.Assert.assertTrue("'" + double16 + "' != '" + 3.1622776601683795d + "'", double16 == 3.1622776601683795d);
        org.junit.Assert.assertTrue("'" + double21 + "' != '" + 10.0d + "'", double21 == 10.0d);
    }

    @Test
    public void test15621() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest31.test15621");
        java.lang.String[] strArray8 = new java.lang.String[] {};
        org.apache.commons.math.ode.DerivativeException derivativeException9 = new org.apache.commons.math.ode.DerivativeException("Dormand-Prince 8 (5, 3)", strArray8);
        org.apache.commons.math.ode.IntegratorException integratorException10 = new org.apache.commons.math.ode.IntegratorException("", (java.lang.Object[]) strArray8);
        org.apache.commons.math.ode.DerivativeException derivativeException11 = new org.apache.commons.math.ode.DerivativeException("org.apache.commons.math.ode.DerivativeException: Dormand-Prince 8 (5, 3)", strArray8);
        org.apache.commons.math.ode.DerivativeException derivativeException12 = new org.apache.commons.math.ode.DerivativeException("org.apache.commons.math.ode.IntegratorException", strArray8);
        org.apache.commons.math.ode.IntegratorException integratorException13 = new org.apache.commons.math.ode.IntegratorException("", (java.lang.Object[]) strArray8);
        org.apache.commons.math.ode.IntegratorException integratorException14 = new org.apache.commons.math.ode.IntegratorException("org.apache.commons.math.ode.DerivativeException: org.apache.commons.math.ode.DerivativeException", (java.lang.Object[]) strArray8);
        org.apache.commons.math.ode.DerivativeException derivativeException15 = new org.apache.commons.math.ode.DerivativeException("org.apache.commons.math.ode.IntegratorException: org.apache.commons.math.ode.DerivativeException: org.apache.commons.math.ode.IntegratorException: ", strArray8);
        org.apache.commons.math.ode.DerivativeException derivativeException16 = new org.apache.commons.math.ode.DerivativeException("org.apache.commons.math.ode.IntegratorException: org.apache.commons.math.ode.DerivativeException: org.apache.commons.math.ode.IntegratorException: org.apache.commons.math.ode.DerivativeException: org.apache.commons.math.ode.IntegratorException: ", strArray8);
        org.junit.Assert.assertNotNull(strArray8);
    }

    @Test
    public void test15622() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest31.test15622");
        java.lang.String[] strArray4 = new java.lang.String[] {};
        org.apache.commons.math.ode.DerivativeException derivativeException5 = new org.apache.commons.math.ode.DerivativeException("Dormand-Prince 8 (5, 3)", strArray4);
        org.apache.commons.math.ode.DerivativeException derivativeException6 = new org.apache.commons.math.ode.DerivativeException("org.apache.commons.math.ode.IntegratorException: Dormand-Prince 8 (5, 3)", strArray4);
        org.apache.commons.math.ode.IntegratorException integratorException7 = new org.apache.commons.math.ode.IntegratorException("hi!", (java.lang.Object[]) strArray4);
        org.apache.commons.math.ode.IntegratorException integratorException8 = new org.apache.commons.math.ode.IntegratorException("", (java.lang.Object[]) strArray4);
        org.apache.commons.math.ode.IntegratorException integratorException9 = new org.apache.commons.math.ode.IntegratorException((java.lang.Throwable) integratorException8);
        org.apache.commons.math.ode.DerivativeException derivativeException10 = new org.apache.commons.math.ode.DerivativeException((java.lang.Throwable) integratorException9);
        org.junit.Assert.assertNotNull(strArray4);
    }

    @Test
    public void test15623() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest31.test15623");
        java.lang.String[] strArray10 = new java.lang.String[] {};
        org.apache.commons.math.ode.DerivativeException derivativeException11 = new org.apache.commons.math.ode.DerivativeException("Dormand-Prince 8 (5, 3)", strArray10);
        org.apache.commons.math.ode.DerivativeException derivativeException12 = new org.apache.commons.math.ode.DerivativeException("hi!", strArray10);
        org.apache.commons.math.ode.DerivativeException derivativeException13 = new org.apache.commons.math.ode.DerivativeException("hi!", strArray10);
        org.apache.commons.math.ode.DerivativeException derivativeException14 = new org.apache.commons.math.ode.DerivativeException("hi!", strArray10);
        org.apache.commons.math.ode.DerivativeException derivativeException15 = new org.apache.commons.math.ode.DerivativeException("", strArray10);
        org.apache.commons.math.ode.DerivativeException derivativeException16 = new org.apache.commons.math.ode.DerivativeException("Dormand-Prince 8 (5, 3)", strArray10);
        org.apache.commons.math.ode.IntegratorException integratorException17 = new org.apache.commons.math.ode.IntegratorException("Dormand-Prince 8 (5, 3)", (java.lang.Object[]) strArray10);
        org.apache.commons.math.ode.DerivativeException derivativeException18 = new org.apache.commons.math.ode.DerivativeException("org.apache.commons.math.ode.IntegratorException: org.apache.commons.math.ode.IntegratorException: Dormand-Prince 8 (5, 3)", strArray10);
        org.apache.commons.math.ode.DerivativeException derivativeException19 = new org.apache.commons.math.ode.DerivativeException("org.apache.commons.math.ode.DerivativeException: hi!", strArray10);
        org.apache.commons.math.ode.DerivativeException derivativeException20 = new org.apache.commons.math.ode.DerivativeException("org.apache.commons.math.ode.DerivativeException: org.apache.commons.math.ode.DerivativeException: org.apache.commons.math.ode.IntegratorException: hi!", strArray10);
        java.lang.String str21 = derivativeException20.getPattern();
        org.junit.Assert.assertNotNull(strArray10);
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "org.apache.commons.math.ode.DerivativeException: org.apache.commons.math.ode.DerivativeException: org.apache.commons.math.ode.IntegratorException: hi!" + "'", str21, "org.apache.commons.math.ode.DerivativeException: org.apache.commons.math.ode.DerivativeException: org.apache.commons.math.ode.IntegratorException: hi!");
    }

    @Test
    public void test15624() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest31.test15624");
        org.apache.commons.math.ode.DormandPrince853Integrator dormandPrince853Integrator4 = new org.apache.commons.math.ode.DormandPrince853Integrator((double) 10, (double) (byte) 10, (double) (short) 100, (double) 1);
        double double5 = dormandPrince853Integrator4.getSafety();
        double double6 = dormandPrince853Integrator4.getMinStep();
        dormandPrince853Integrator4.setSafety((double) '#');
        double double9 = dormandPrince853Integrator4.getMinStep();
        double double10 = dormandPrince853Integrator4.getCurrentStepStart();
        double double11 = dormandPrince853Integrator4.getMaxGrowth();
        java.lang.String str12 = dormandPrince853Integrator4.getName();
        java.lang.String str13 = dormandPrince853Integrator4.getName();
        dormandPrince853Integrator4.setSafety(8.378574825315678d);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.9d + "'", double5 == 0.9d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 10.0d + "'", double6 == 10.0d);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 10.0d + "'", double9 == 10.0d);
        org.junit.Assert.assertTrue(Double.isNaN(double10));
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 10.0d + "'", double11 == 10.0d);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "Dormand-Prince 8 (5, 3)" + "'", str12, "Dormand-Prince 8 (5, 3)");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "Dormand-Prince 8 (5, 3)" + "'", str13, "Dormand-Prince 8 (5, 3)");
    }

    @Test
    public void test15625() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest31.test15625");
        org.apache.commons.math.ode.DormandPrince853Integrator dormandPrince853Integrator4 = new org.apache.commons.math.ode.DormandPrince853Integrator(8.94427190999916d, 16.0d, 0.4472135954999579d, (double) (byte) 10);
        double double5 = dormandPrince853Integrator4.getMinReduction();
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.2d + "'", double5 == 0.2d);
    }

    @Test
    public void test15626() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest31.test15626");
        org.apache.commons.math.ode.DormandPrince853Integrator dormandPrince853Integrator4 = new org.apache.commons.math.ode.DormandPrince853Integrator((double) 10, (double) (byte) 10, (double) (short) 100, (double) 1);
        double double5 = dormandPrince853Integrator4.getSafety();
        double double6 = dormandPrince853Integrator4.getMinStep();
        java.lang.String str7 = dormandPrince853Integrator4.getName();
        int int8 = dormandPrince853Integrator4.getOrder();
        double double9 = dormandPrince853Integrator4.getCurrentSignedStepsize();
        org.apache.commons.math.ode.StepHandler stepHandler10 = dormandPrince853Integrator4.getStepHandler();
        double double11 = dormandPrince853Integrator4.getMaxGrowth();
        dormandPrince853Integrator4.setSafety((double) 'a');
        java.lang.String str14 = dormandPrince853Integrator4.getName();
        double double15 = dormandPrince853Integrator4.getCurrentStepStart();
        org.apache.commons.math.ode.StepHandler stepHandler16 = dormandPrince853Integrator4.getStepHandler();
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.9d + "'", double5 == 0.9d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 10.0d + "'", double6 == 10.0d);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "Dormand-Prince 8 (5, 3)" + "'", str7, "Dormand-Prince 8 (5, 3)");
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 8 + "'", int8 == 8);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 10.0d + "'", double9 == 10.0d);
        org.junit.Assert.assertNotNull(stepHandler10);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 10.0d + "'", double11 == 10.0d);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "Dormand-Prince 8 (5, 3)" + "'", str14, "Dormand-Prince 8 (5, 3)");
        org.junit.Assert.assertTrue(Double.isNaN(double15));
        org.junit.Assert.assertNotNull(stepHandler16);
    }

    @Test
    public void test15627() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest31.test15627");
        java.lang.String[] strArray8 = new java.lang.String[] {};
        org.apache.commons.math.ode.DerivativeException derivativeException9 = new org.apache.commons.math.ode.DerivativeException("Dormand-Prince 8 (5, 3)", strArray8);
        org.apache.commons.math.ode.DerivativeException derivativeException10 = new org.apache.commons.math.ode.DerivativeException("hi!", strArray8);
        org.apache.commons.math.ode.DerivativeException derivativeException11 = new org.apache.commons.math.ode.DerivativeException("hi!", strArray8);
        org.apache.commons.math.ode.IntegratorException integratorException12 = new org.apache.commons.math.ode.IntegratorException("", (java.lang.Object[]) strArray8);
        org.apache.commons.math.ode.DerivativeException derivativeException13 = new org.apache.commons.math.ode.DerivativeException("hi!", strArray8);
        org.apache.commons.math.ode.DerivativeException derivativeException14 = new org.apache.commons.math.ode.DerivativeException("hi!", strArray8);
        org.apache.commons.math.ode.DerivativeException derivativeException15 = new org.apache.commons.math.ode.DerivativeException("org.apache.commons.math.ode.DerivativeException: org.apache.commons.math.ode.DerivativeException: org.apache.commons.math.ode.IntegratorException: ", strArray8);
        org.apache.commons.math.ode.DerivativeException derivativeException16 = new org.apache.commons.math.ode.DerivativeException("org.apache.commons.math.ode.IntegratorException: org.apache.commons.math.ode.IntegratorException: Dormand-Prince 8 (5, 3)", strArray8);
        java.lang.Object[] objArray17 = derivativeException16.getArguments();
        org.junit.Assert.assertNotNull(strArray8);
        org.junit.Assert.assertNotNull(objArray17);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray17), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray17), "[]");
    }

    @Test
    public void test15628() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest31.test15628");
        org.apache.commons.math.ode.DormandPrince853Integrator dormandPrince853Integrator4 = new org.apache.commons.math.ode.DormandPrince853Integrator((double) 10, (double) (byte) 10, (double) (short) 100, (double) 1);
        double double5 = dormandPrince853Integrator4.getSafety();
        dormandPrince853Integrator4.setMinReduction((double) (short) -1);
        dormandPrince853Integrator4.setInitialStepSize((double) (byte) 1);
        java.lang.String str10 = dormandPrince853Integrator4.getName();
        java.lang.String str11 = dormandPrince853Integrator4.getName();
        double double12 = dormandPrince853Integrator4.getSafety();
        dormandPrince853Integrator4.setMaxGrowth(10.0d);
        java.lang.String str15 = dormandPrince853Integrator4.getName();
        dormandPrince853Integrator4.setMinReduction((double) 1);
        dormandPrince853Integrator4.setMinReduction((double) (short) 1);
        dormandPrince853Integrator4.setMaxGrowth(0.4472135954999579d);
        dormandPrince853Integrator4.setMaxGrowth(8.94427190999916d);
        double double24 = dormandPrince853Integrator4.getMaxGrowth();
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.9d + "'", double5 == 0.9d);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "Dormand-Prince 8 (5, 3)" + "'", str10, "Dormand-Prince 8 (5, 3)");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "Dormand-Prince 8 (5, 3)" + "'", str11, "Dormand-Prince 8 (5, 3)");
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 0.9d + "'", double12 == 0.9d);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "Dormand-Prince 8 (5, 3)" + "'", str15, "Dormand-Prince 8 (5, 3)");
        org.junit.Assert.assertTrue("'" + double24 + "' != '" + 8.94427190999916d + "'", double24 == 8.94427190999916d);
    }

    @Test
    public void test15629() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest31.test15629");
        java.lang.Throwable throwable0 = null;
        org.apache.commons.math.ode.IntegratorException integratorException1 = new org.apache.commons.math.ode.IntegratorException(throwable0);
        java.lang.String str2 = integratorException1.getPattern();
        org.apache.commons.math.ode.IntegratorException integratorException3 = new org.apache.commons.math.ode.IntegratorException((java.lang.Throwable) integratorException1);
        java.lang.Throwable[] throwableArray4 = integratorException1.getSuppressed();
        org.apache.commons.math.ode.DerivativeException derivativeException5 = new org.apache.commons.math.ode.DerivativeException((java.lang.Throwable) integratorException1);
        org.apache.commons.math.ode.IntegratorException integratorException6 = new org.apache.commons.math.ode.IntegratorException((java.lang.Throwable) integratorException1);
        java.lang.String[] strArray12 = new java.lang.String[] {};
        org.apache.commons.math.ode.DerivativeException derivativeException13 = new org.apache.commons.math.ode.DerivativeException("Dormand-Prince 8 (5, 3)", strArray12);
        org.apache.commons.math.ode.DerivativeException derivativeException14 = new org.apache.commons.math.ode.DerivativeException("hi!", strArray12);
        org.apache.commons.math.ode.DerivativeException derivativeException15 = new org.apache.commons.math.ode.DerivativeException("hi!", strArray12);
        org.apache.commons.math.ode.DerivativeException derivativeException16 = new org.apache.commons.math.ode.DerivativeException("hi!", strArray12);
        org.apache.commons.math.ode.DerivativeException derivativeException17 = new org.apache.commons.math.ode.DerivativeException((java.lang.Throwable) derivativeException16);
        java.lang.Object[] objArray18 = derivativeException17.getArguments();
        org.apache.commons.math.ode.DerivativeException derivativeException19 = new org.apache.commons.math.ode.DerivativeException((java.lang.Throwable) derivativeException17);
        java.lang.Object[] objArray20 = derivativeException17.getArguments();
        java.lang.Throwable[] throwableArray21 = derivativeException17.getSuppressed();
        org.apache.commons.math.ode.IntegratorException integratorException22 = new org.apache.commons.math.ode.IntegratorException((java.lang.Throwable) derivativeException17);
        java.lang.Object[] objArray23 = derivativeException17.getArguments();
        org.apache.commons.math.ode.IntegratorException integratorException24 = new org.apache.commons.math.ode.IntegratorException("org.apache.commons.math.ode.DerivativeException: org.apache.commons.math.ode.DerivativeException: org.apache.commons.math.ode.IntegratorException: org.apache.commons.math.ode.IntegratorException: hi!", objArray23);
        integratorException1.addSuppressed((java.lang.Throwable) integratorException24);
        java.lang.Object[] objArray26 = integratorException1.getArguments();
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNotNull(throwableArray4);
        org.junit.Assert.assertNotNull(strArray12);
        org.junit.Assert.assertNotNull(objArray18);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray18), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray18), "[]");
        org.junit.Assert.assertNotNull(objArray20);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray20), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray20), "[]");
        org.junit.Assert.assertNotNull(throwableArray21);
        org.junit.Assert.assertNotNull(objArray23);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray23), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray23), "[]");
        org.junit.Assert.assertNotNull(objArray26);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray26), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray26), "[]");
    }

    @Test
    public void test15630() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest31.test15630");
        org.apache.commons.math.ode.DormandPrince853Integrator dormandPrince853Integrator4 = new org.apache.commons.math.ode.DormandPrince853Integrator((double) (-1), 0.9d, (double) '4', (double) 8);
        java.lang.String str5 = dormandPrince853Integrator4.getName();
        double double6 = dormandPrince853Integrator4.getMaxGrowth();
        dormandPrince853Integrator4.setMinReduction((double) (byte) 1);
        dormandPrince853Integrator4.setInitialStepSize((double) (short) 1);
        double double11 = dormandPrince853Integrator4.getMaxGrowth();
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Dormand-Prince 8 (5, 3)" + "'", str5, "Dormand-Prince 8 (5, 3)");
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 10.0d + "'", double6 == 10.0d);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 10.0d + "'", double11 == 10.0d);
    }

    @Test
    public void test15631() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest31.test15631");
        org.apache.commons.math.ode.DormandPrince853Integrator dormandPrince853Integrator4 = new org.apache.commons.math.ode.DormandPrince853Integrator((double) 10, (double) (byte) 10, (double) (short) 100, (double) 1);
        java.lang.String str5 = dormandPrince853Integrator4.getName();
        java.lang.String str6 = dormandPrince853Integrator4.getName();
        org.apache.commons.math.ode.DormandPrince853Integrator dormandPrince853Integrator11 = new org.apache.commons.math.ode.DormandPrince853Integrator((double) 10, (double) (byte) 10, (double) (short) 100, (double) 1);
        double double12 = dormandPrince853Integrator11.getSafety();
        int int13 = dormandPrince853Integrator11.getOrder();
        int int14 = dormandPrince853Integrator11.getOrder();
        org.apache.commons.math.ode.StepHandler stepHandler15 = dormandPrince853Integrator11.getStepHandler();
        dormandPrince853Integrator4.setStepHandler(stepHandler15);
        dormandPrince853Integrator4.setMaxGrowth((double) 100);
        double double19 = dormandPrince853Integrator4.getMinReduction();
        double double20 = dormandPrince853Integrator4.getMinStep();
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Dormand-Prince 8 (5, 3)" + "'", str5, "Dormand-Prince 8 (5, 3)");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Dormand-Prince 8 (5, 3)" + "'", str6, "Dormand-Prince 8 (5, 3)");
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 0.9d + "'", double12 == 0.9d);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 8 + "'", int13 == 8);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 8 + "'", int14 == 8);
        org.junit.Assert.assertNotNull(stepHandler15);
        org.junit.Assert.assertTrue("'" + double19 + "' != '" + 0.2d + "'", double19 == 0.2d);
        org.junit.Assert.assertTrue("'" + double20 + "' != '" + 10.0d + "'", double20 == 10.0d);
    }

    @Test
    public void test15632() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest31.test15632");
        org.apache.commons.math.ode.DormandPrince853Integrator dormandPrince853Integrator4 = new org.apache.commons.math.ode.DormandPrince853Integrator((double) 10, (double) (byte) 10, (double) (short) 100, (double) 1);
        double double5 = dormandPrince853Integrator4.getSafety();
        double double6 = dormandPrince853Integrator4.getMinStep();
        dormandPrince853Integrator4.setSafety((double) '#');
        double double9 = dormandPrince853Integrator4.getCurrentStepStart();
        dormandPrince853Integrator4.setMinReduction(10.0d);
        java.lang.String str12 = dormandPrince853Integrator4.getName();
        org.apache.commons.math.ode.StepHandler stepHandler13 = dormandPrince853Integrator4.getStepHandler();
        double double14 = dormandPrince853Integrator4.getCurrentSignedStepsize();
        double double15 = dormandPrince853Integrator4.getMinReduction();
        double double16 = dormandPrince853Integrator4.getCurrentSignedStepsize();
        org.apache.commons.math.ode.DormandPrince853Integrator dormandPrince853Integrator21 = new org.apache.commons.math.ode.DormandPrince853Integrator(1.0d, (double) (byte) 10, (double) (short) 1, (double) 0L);
        double double22 = dormandPrince853Integrator21.getMinStep();
        double double23 = dormandPrince853Integrator21.getMinStep();
        java.lang.String str24 = dormandPrince853Integrator21.getName();
        org.apache.commons.math.ode.DormandPrince853Integrator dormandPrince853Integrator29 = new org.apache.commons.math.ode.DormandPrince853Integrator((double) 10, (double) (byte) 10, (double) (short) 100, (double) 1);
        dormandPrince853Integrator29.setSafety((double) '#');
        dormandPrince853Integrator29.setMaxGrowth((double) 100.0f);
        java.lang.String str34 = dormandPrince853Integrator29.getName();
        double double35 = dormandPrince853Integrator29.getSafety();
        double double36 = dormandPrince853Integrator29.getMaxGrowth();
        double double37 = dormandPrince853Integrator29.getMaxStep();
        org.apache.commons.math.ode.StepHandler stepHandler38 = dormandPrince853Integrator29.getStepHandler();
        org.apache.commons.math.ode.StepHandler stepHandler39 = dormandPrince853Integrator29.getStepHandler();
        org.apache.commons.math.ode.StepHandler stepHandler40 = dormandPrince853Integrator29.getStepHandler();
        dormandPrince853Integrator21.setStepHandler(stepHandler40);
        dormandPrince853Integrator4.setStepHandler(stepHandler40);
        org.apache.commons.math.ode.SwitchingFunction switchingFunction43 = null;
        dormandPrince853Integrator4.addSwitchingFunction(switchingFunction43, 8.378574825315678d, 17.88854381999832d, (-1));
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.9d + "'", double5 == 0.9d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 10.0d + "'", double6 == 10.0d);
        org.junit.Assert.assertTrue(Double.isNaN(double9));
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "Dormand-Prince 8 (5, 3)" + "'", str12, "Dormand-Prince 8 (5, 3)");
        org.junit.Assert.assertNotNull(stepHandler13);
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + 10.0d + "'", double14 == 10.0d);
        org.junit.Assert.assertTrue("'" + double15 + "' != '" + 10.0d + "'", double15 == 10.0d);
        org.junit.Assert.assertTrue("'" + double16 + "' != '" + 10.0d + "'", double16 == 10.0d);
        org.junit.Assert.assertTrue("'" + double22 + "' != '" + 1.0d + "'", double22 == 1.0d);
        org.junit.Assert.assertTrue("'" + double23 + "' != '" + 1.0d + "'", double23 == 1.0d);
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "Dormand-Prince 8 (5, 3)" + "'", str24, "Dormand-Prince 8 (5, 3)");
        org.junit.Assert.assertEquals("'" + str34 + "' != '" + "Dormand-Prince 8 (5, 3)" + "'", str34, "Dormand-Prince 8 (5, 3)");
        org.junit.Assert.assertTrue("'" + double35 + "' != '" + 35.0d + "'", double35 == 35.0d);
        org.junit.Assert.assertTrue("'" + double36 + "' != '" + 100.0d + "'", double36 == 100.0d);
        org.junit.Assert.assertTrue("'" + double37 + "' != '" + 10.0d + "'", double37 == 10.0d);
        org.junit.Assert.assertNotNull(stepHandler38);
        org.junit.Assert.assertNotNull(stepHandler39);
        org.junit.Assert.assertNotNull(stepHandler40);
    }

    @Test
    public void test15633() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest31.test15633");
        double[] doubleArray8 = new double[] {};
        double[] doubleArray9 = new double[] {};
        org.apache.commons.math.ode.DormandPrince853Integrator dormandPrince853Integrator10 = new org.apache.commons.math.ode.DormandPrince853Integrator((double) 1.0f, (double) 1.0f, doubleArray8, doubleArray9);
        double[] doubleArray13 = new double[] {};
        double[] doubleArray14 = new double[] {};
        org.apache.commons.math.ode.DormandPrince853Integrator dormandPrince853Integrator15 = new org.apache.commons.math.ode.DormandPrince853Integrator((double) 1.0f, (double) 1.0f, doubleArray13, doubleArray14);
        org.apache.commons.math.ode.DormandPrince853Integrator dormandPrince853Integrator16 = new org.apache.commons.math.ode.DormandPrince853Integrator((double) ' ', (double) 'a', doubleArray9, doubleArray14);
        double[] doubleArray23 = new double[] {};
        double[] doubleArray24 = new double[] {};
        org.apache.commons.math.ode.DormandPrince853Integrator dormandPrince853Integrator25 = new org.apache.commons.math.ode.DormandPrince853Integrator((double) 1.0f, (double) 1.0f, doubleArray23, doubleArray24);
        double[] doubleArray30 = new double[] {};
        double[] doubleArray31 = new double[] {};
        org.apache.commons.math.ode.DormandPrince853Integrator dormandPrince853Integrator32 = new org.apache.commons.math.ode.DormandPrince853Integrator((double) 1.0f, (double) 1.0f, doubleArray30, doubleArray31);
        double[] doubleArray35 = new double[] {};
        double[] doubleArray36 = new double[] {};
        org.apache.commons.math.ode.DormandPrince853Integrator dormandPrince853Integrator37 = new org.apache.commons.math.ode.DormandPrince853Integrator((double) 1.0f, (double) 1.0f, doubleArray35, doubleArray36);
        org.apache.commons.math.ode.DormandPrince853Integrator dormandPrince853Integrator38 = new org.apache.commons.math.ode.DormandPrince853Integrator((double) ' ', (double) 'a', doubleArray31, doubleArray36);
        org.apache.commons.math.ode.DormandPrince853Integrator dormandPrince853Integrator39 = new org.apache.commons.math.ode.DormandPrince853Integrator(0.9d, (double) 1L, doubleArray23, doubleArray36);
        double[] doubleArray44 = new double[] {};
        double[] doubleArray45 = new double[] {};
        org.apache.commons.math.ode.DormandPrince853Integrator dormandPrince853Integrator46 = new org.apache.commons.math.ode.DormandPrince853Integrator((double) 1.0f, (double) 1.0f, doubleArray44, doubleArray45);
        double[] doubleArray51 = new double[] {};
        double[] doubleArray52 = new double[] {};
        org.apache.commons.math.ode.DormandPrince853Integrator dormandPrince853Integrator53 = new org.apache.commons.math.ode.DormandPrince853Integrator((double) 1.0f, (double) 1.0f, doubleArray51, doubleArray52);
        double[] doubleArray56 = new double[] {};
        double[] doubleArray57 = new double[] {};
        org.apache.commons.math.ode.DormandPrince853Integrator dormandPrince853Integrator58 = new org.apache.commons.math.ode.DormandPrince853Integrator((double) 1.0f, (double) 1.0f, doubleArray56, doubleArray57);
        org.apache.commons.math.ode.DormandPrince853Integrator dormandPrince853Integrator59 = new org.apache.commons.math.ode.DormandPrince853Integrator((double) ' ', (double) 'a', doubleArray52, doubleArray57);
        org.apache.commons.math.ode.DormandPrince853Integrator dormandPrince853Integrator60 = new org.apache.commons.math.ode.DormandPrince853Integrator(0.9d, (double) 1L, doubleArray44, doubleArray57);
        org.apache.commons.math.ode.DormandPrince853Integrator dormandPrince853Integrator61 = new org.apache.commons.math.ode.DormandPrince853Integrator((double) 100L, (double) (byte) 100, doubleArray36, doubleArray57);
        org.apache.commons.math.ode.DormandPrince853Integrator dormandPrince853Integrator62 = new org.apache.commons.math.ode.DormandPrince853Integrator((-1.0d), (double) 0L, doubleArray14, doubleArray36);
        double[] doubleArray63 = null;
        org.apache.commons.math.ode.DormandPrince853Integrator dormandPrince853Integrator64 = new org.apache.commons.math.ode.DormandPrince853Integrator((double) 1.0f, 0.2d, doubleArray36, doubleArray63);
        int int65 = dormandPrince853Integrator64.getOrder();
        dormandPrince853Integrator64.setMinReduction((double) '4');
        double double68 = dormandPrince853Integrator64.getCurrentStepStart();
        org.junit.Assert.assertNotNull(doubleArray8);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray8), "[]");
        org.junit.Assert.assertNotNull(doubleArray9);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray9), "[]");
        org.junit.Assert.assertNotNull(doubleArray13);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray13), "[]");
        org.junit.Assert.assertNotNull(doubleArray14);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray14), "[]");
        org.junit.Assert.assertNotNull(doubleArray23);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray23), "[]");
        org.junit.Assert.assertNotNull(doubleArray24);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray24), "[]");
        org.junit.Assert.assertNotNull(doubleArray30);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray30), "[]");
        org.junit.Assert.assertNotNull(doubleArray31);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray31), "[]");
        org.junit.Assert.assertNotNull(doubleArray35);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray35), "[]");
        org.junit.Assert.assertNotNull(doubleArray36);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray36), "[]");
        org.junit.Assert.assertNotNull(doubleArray44);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray44), "[]");
        org.junit.Assert.assertNotNull(doubleArray45);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray45), "[]");
        org.junit.Assert.assertNotNull(doubleArray51);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray51), "[]");
        org.junit.Assert.assertNotNull(doubleArray52);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray52), "[]");
        org.junit.Assert.assertNotNull(doubleArray56);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray56), "[]");
        org.junit.Assert.assertNotNull(doubleArray57);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray57), "[]");
        org.junit.Assert.assertTrue("'" + int65 + "' != '" + 8 + "'", int65 == 8);
        org.junit.Assert.assertTrue(Double.isNaN(double68));
    }

    @Test
    public void test15634() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest31.test15634");
        org.apache.commons.math.ode.DormandPrince853Integrator dormandPrince853Integrator4 = new org.apache.commons.math.ode.DormandPrince853Integrator(1.0d, (double) 1, (double) 0, 0.0d);
        double double5 = dormandPrince853Integrator4.getMinReduction();
        org.apache.commons.math.ode.SwitchingFunction switchingFunction6 = null;
        dormandPrince853Integrator4.addSwitchingFunction(switchingFunction6, (double) 1.0f, (double) 1L, 8);
        java.lang.String str11 = dormandPrince853Integrator4.getName();
        java.lang.String str12 = dormandPrince853Integrator4.getName();
        org.apache.commons.math.ode.StepHandler stepHandler13 = dormandPrince853Integrator4.getStepHandler();
        java.lang.String str14 = dormandPrince853Integrator4.getName();
        double double15 = dormandPrince853Integrator4.getMinStep();
        java.lang.String str16 = dormandPrince853Integrator4.getName();
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.2d + "'", double5 == 0.2d);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "Dormand-Prince 8 (5, 3)" + "'", str11, "Dormand-Prince 8 (5, 3)");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "Dormand-Prince 8 (5, 3)" + "'", str12, "Dormand-Prince 8 (5, 3)");
        org.junit.Assert.assertNotNull(stepHandler13);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "Dormand-Prince 8 (5, 3)" + "'", str14, "Dormand-Prince 8 (5, 3)");
        org.junit.Assert.assertTrue("'" + double15 + "' != '" + 1.0d + "'", double15 == 1.0d);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "Dormand-Prince 8 (5, 3)" + "'", str16, "Dormand-Prince 8 (5, 3)");
    }

    @Test
    public void test15635() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest31.test15635");
        org.apache.commons.math.ode.DormandPrince853Integrator dormandPrince853Integrator4 = new org.apache.commons.math.ode.DormandPrince853Integrator((double) 10, (double) (byte) 10, (double) (short) 100, (double) 1);
        double double5 = dormandPrince853Integrator4.getSafety();
        int int6 = dormandPrince853Integrator4.getOrder();
        int int7 = dormandPrince853Integrator4.getOrder();
        double double8 = dormandPrince853Integrator4.getSafety();
        double double9 = dormandPrince853Integrator4.getCurrentSignedStepsize();
        org.apache.commons.math.ode.SwitchingFunction switchingFunction10 = null;
        dormandPrince853Integrator4.addSwitchingFunction(switchingFunction10, (double) 0L, 10.059467437463484d, 8);
        java.lang.String str15 = dormandPrince853Integrator4.getName();
        double double16 = dormandPrince853Integrator4.getMinReduction();
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.9d + "'", double5 == 0.9d);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 8 + "'", int6 == 8);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 8 + "'", int7 == 8);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 0.9d + "'", double8 == 0.9d);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 10.0d + "'", double9 == 10.0d);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "Dormand-Prince 8 (5, 3)" + "'", str15, "Dormand-Prince 8 (5, 3)");
        org.junit.Assert.assertTrue("'" + double16 + "' != '" + 0.2d + "'", double16 == 0.2d);
    }

    @Test
    public void test15636() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest31.test15636");
        org.apache.commons.math.ode.DormandPrince853Integrator dormandPrince853Integrator4 = new org.apache.commons.math.ode.DormandPrince853Integrator(1.0d, (double) 1, (double) 0, 0.0d);
        double double5 = dormandPrince853Integrator4.getMinReduction();
        org.apache.commons.math.ode.SwitchingFunction switchingFunction6 = null;
        dormandPrince853Integrator4.addSwitchingFunction(switchingFunction6, (double) 1.0f, (double) 1L, 8);
        java.lang.String str11 = dormandPrince853Integrator4.getName();
        dormandPrince853Integrator4.setMaxGrowth((double) 1L);
        dormandPrince853Integrator4.setMaxGrowth(48.655726475421666d);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.2d + "'", double5 == 0.2d);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "Dormand-Prince 8 (5, 3)" + "'", str11, "Dormand-Prince 8 (5, 3)");
    }

    @Test
    public void test15637() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest31.test15637");
        org.apache.commons.math.ode.DormandPrince853Integrator dormandPrince853Integrator4 = new org.apache.commons.math.ode.DormandPrince853Integrator((double) 10, (double) (byte) 10, (double) (short) 100, (double) 1);
        double double5 = dormandPrince853Integrator4.getSafety();
        double double6 = dormandPrince853Integrator4.getMinStep();
        dormandPrince853Integrator4.setSafety((double) '#');
        double double9 = dormandPrince853Integrator4.getCurrentStepStart();
        double double10 = dormandPrince853Integrator4.getMaxStep();
        double double11 = dormandPrince853Integrator4.getMaxGrowth();
        org.apache.commons.math.ode.DormandPrince853Integrator dormandPrince853Integrator16 = new org.apache.commons.math.ode.DormandPrince853Integrator(1.0d, (double) (byte) 10, (double) (short) 1, (double) 0L);
        double double17 = dormandPrince853Integrator16.getMinStep();
        int int18 = dormandPrince853Integrator16.getOrder();
        org.apache.commons.math.ode.DormandPrince853Integrator dormandPrince853Integrator23 = new org.apache.commons.math.ode.DormandPrince853Integrator((double) 10, (double) (byte) 10, (double) (short) 100, (double) 1);
        double double24 = dormandPrince853Integrator23.getSafety();
        double double25 = dormandPrince853Integrator23.getMinStep();
        double double26 = dormandPrince853Integrator23.getMinStep();
        double double27 = dormandPrince853Integrator23.getCurrentSignedStepsize();
        int int28 = dormandPrince853Integrator23.getOrder();
        double double29 = dormandPrince853Integrator23.getMaxGrowth();
        org.apache.commons.math.ode.StepHandler stepHandler30 = dormandPrince853Integrator23.getStepHandler();
        dormandPrince853Integrator16.setStepHandler(stepHandler30);
        dormandPrince853Integrator4.setStepHandler(stepHandler30);
        double double33 = dormandPrince853Integrator4.getCurrentSignedStepsize();
        dormandPrince853Integrator4.setInitialStepSize(0.2d);
        int int36 = dormandPrince853Integrator4.getOrder();
        org.apache.commons.math.ode.DormandPrince853Integrator dormandPrince853Integrator41 = new org.apache.commons.math.ode.DormandPrince853Integrator((double) 10, (double) (byte) 10, (double) (short) 100, (double) 1);
        double double42 = dormandPrince853Integrator41.getSafety();
        double double43 = dormandPrince853Integrator41.getMinStep();
        org.apache.commons.math.ode.DormandPrince853Integrator dormandPrince853Integrator48 = new org.apache.commons.math.ode.DormandPrince853Integrator((double) 10, (double) (byte) 10, (double) (short) 100, (double) 1);
        double double49 = dormandPrince853Integrator48.getSafety();
        double double50 = dormandPrince853Integrator48.getMinStep();
        double double51 = dormandPrince853Integrator48.getCurrentStepStart();
        java.lang.String str52 = dormandPrince853Integrator48.getName();
        org.apache.commons.math.ode.DormandPrince853Integrator dormandPrince853Integrator57 = new org.apache.commons.math.ode.DormandPrince853Integrator(1.0d, (double) (byte) 10, (double) (short) 1, (double) 0L);
        double double58 = dormandPrince853Integrator57.getMinStep();
        int int59 = dormandPrince853Integrator57.getOrder();
        org.apache.commons.math.ode.DormandPrince853Integrator dormandPrince853Integrator64 = new org.apache.commons.math.ode.DormandPrince853Integrator((double) 10, (double) (byte) 10, (double) (short) 100, (double) 1);
        double double65 = dormandPrince853Integrator64.getSafety();
        double double66 = dormandPrince853Integrator64.getMinStep();
        double double67 = dormandPrince853Integrator64.getMinStep();
        double double68 = dormandPrince853Integrator64.getCurrentSignedStepsize();
        int int69 = dormandPrince853Integrator64.getOrder();
        double double70 = dormandPrince853Integrator64.getMaxGrowth();
        org.apache.commons.math.ode.StepHandler stepHandler71 = dormandPrince853Integrator64.getStepHandler();
        dormandPrince853Integrator57.setStepHandler(stepHandler71);
        dormandPrince853Integrator48.setStepHandler(stepHandler71);
        dormandPrince853Integrator41.setStepHandler(stepHandler71);
        java.lang.String str75 = dormandPrince853Integrator41.getName();
        org.apache.commons.math.ode.StepHandler stepHandler76 = dormandPrince853Integrator41.getStepHandler();
        dormandPrince853Integrator41.setMinReduction(31.622776601683793d);
        org.apache.commons.math.ode.StepHandler stepHandler79 = dormandPrince853Integrator41.getStepHandler();
        dormandPrince853Integrator4.setStepHandler(stepHandler79);
        org.apache.commons.math.ode.StepHandler stepHandler81 = dormandPrince853Integrator4.getStepHandler();
        java.lang.String str82 = dormandPrince853Integrator4.getName();
        int int83 = dormandPrince853Integrator4.getOrder();
        java.lang.Class<?> wildcardClass84 = dormandPrince853Integrator4.getClass();
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.9d + "'", double5 == 0.9d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 10.0d + "'", double6 == 10.0d);
        org.junit.Assert.assertTrue(Double.isNaN(double9));
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 10.0d + "'", double10 == 10.0d);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 10.0d + "'", double11 == 10.0d);
        org.junit.Assert.assertTrue("'" + double17 + "' != '" + 1.0d + "'", double17 == 1.0d);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 8 + "'", int18 == 8);
        org.junit.Assert.assertTrue("'" + double24 + "' != '" + 0.9d + "'", double24 == 0.9d);
        org.junit.Assert.assertTrue("'" + double25 + "' != '" + 10.0d + "'", double25 == 10.0d);
        org.junit.Assert.assertTrue("'" + double26 + "' != '" + 10.0d + "'", double26 == 10.0d);
        org.junit.Assert.assertTrue("'" + double27 + "' != '" + 10.0d + "'", double27 == 10.0d);
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + 8 + "'", int28 == 8);
        org.junit.Assert.assertTrue("'" + double29 + "' != '" + 10.0d + "'", double29 == 10.0d);
        org.junit.Assert.assertNotNull(stepHandler30);
        org.junit.Assert.assertTrue("'" + double33 + "' != '" + 10.0d + "'", double33 == 10.0d);
        org.junit.Assert.assertTrue("'" + int36 + "' != '" + 8 + "'", int36 == 8);
        org.junit.Assert.assertTrue("'" + double42 + "' != '" + 0.9d + "'", double42 == 0.9d);
        org.junit.Assert.assertTrue("'" + double43 + "' != '" + 10.0d + "'", double43 == 10.0d);
        org.junit.Assert.assertTrue("'" + double49 + "' != '" + 0.9d + "'", double49 == 0.9d);
        org.junit.Assert.assertTrue("'" + double50 + "' != '" + 10.0d + "'", double50 == 10.0d);
        org.junit.Assert.assertTrue(Double.isNaN(double51));
        org.junit.Assert.assertEquals("'" + str52 + "' != '" + "Dormand-Prince 8 (5, 3)" + "'", str52, "Dormand-Prince 8 (5, 3)");
        org.junit.Assert.assertTrue("'" + double58 + "' != '" + 1.0d + "'", double58 == 1.0d);
        org.junit.Assert.assertTrue("'" + int59 + "' != '" + 8 + "'", int59 == 8);
        org.junit.Assert.assertTrue("'" + double65 + "' != '" + 0.9d + "'", double65 == 0.9d);
        org.junit.Assert.assertTrue("'" + double66 + "' != '" + 10.0d + "'", double66 == 10.0d);
        org.junit.Assert.assertTrue("'" + double67 + "' != '" + 10.0d + "'", double67 == 10.0d);
        org.junit.Assert.assertTrue("'" + double68 + "' != '" + 10.0d + "'", double68 == 10.0d);
        org.junit.Assert.assertTrue("'" + int69 + "' != '" + 8 + "'", int69 == 8);
        org.junit.Assert.assertTrue("'" + double70 + "' != '" + 10.0d + "'", double70 == 10.0d);
        org.junit.Assert.assertNotNull(stepHandler71);
        org.junit.Assert.assertEquals("'" + str75 + "' != '" + "Dormand-Prince 8 (5, 3)" + "'", str75, "Dormand-Prince 8 (5, 3)");
        org.junit.Assert.assertNotNull(stepHandler76);
        org.junit.Assert.assertNotNull(stepHandler79);
        org.junit.Assert.assertNotNull(stepHandler81);
        org.junit.Assert.assertEquals("'" + str82 + "' != '" + "Dormand-Prince 8 (5, 3)" + "'", str82, "Dormand-Prince 8 (5, 3)");
        org.junit.Assert.assertTrue("'" + int83 + "' != '" + 8 + "'", int83 == 8);
        org.junit.Assert.assertNotNull(wildcardClass84);
    }

    @Test
    public void test15638() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest31.test15638");
        org.apache.commons.math.ode.DormandPrince853Integrator dormandPrince853Integrator4 = new org.apache.commons.math.ode.DormandPrince853Integrator((double) '4', (double) 0L, 0.0d, 18.1550495783196d);
    }

    @Test
    public void test15639() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest31.test15639");
        org.apache.commons.math.ode.DormandPrince853Integrator dormandPrince853Integrator4 = new org.apache.commons.math.ode.DormandPrince853Integrator((double) (byte) -1, (double) (-1.0f), (double) 10.0f, 0.0d);
        org.apache.commons.math.ode.StepHandler stepHandler5 = dormandPrince853Integrator4.getStepHandler();
        dormandPrince853Integrator4.setMaxGrowth((-1.0d));
        double double8 = dormandPrince853Integrator4.getSafety();
        double double9 = dormandPrince853Integrator4.getCurrentSignedStepsize();
        double double10 = dormandPrince853Integrator4.getCurrentSignedStepsize();
        org.apache.commons.math.ode.SwitchingFunction switchingFunction11 = null;
        dormandPrince853Integrator4.addSwitchingFunction(switchingFunction11, 0.0d, 74.64151198142793d, (int) (short) 0);
        org.junit.Assert.assertNotNull(stepHandler5);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 0.9d + "'", double8 == 0.9d);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 1.0d + "'", double9 == 1.0d);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 1.0d + "'", double10 == 1.0d);
    }

    @Test
    public void test15640() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest31.test15640");
        java.lang.String[] strArray10 = new java.lang.String[] {};
        org.apache.commons.math.ode.DerivativeException derivativeException11 = new org.apache.commons.math.ode.DerivativeException("Dormand-Prince 8 (5, 3)", strArray10);
        org.apache.commons.math.ode.DerivativeException derivativeException12 = new org.apache.commons.math.ode.DerivativeException("hi!", strArray10);
        org.apache.commons.math.ode.DerivativeException derivativeException13 = new org.apache.commons.math.ode.DerivativeException("hi!", strArray10);
        org.apache.commons.math.ode.IntegratorException integratorException14 = new org.apache.commons.math.ode.IntegratorException("", (java.lang.Object[]) strArray10);
        org.apache.commons.math.ode.DerivativeException derivativeException15 = new org.apache.commons.math.ode.DerivativeException("hi!", strArray10);
        org.apache.commons.math.ode.DerivativeException derivativeException16 = new org.apache.commons.math.ode.DerivativeException("org.apache.commons.math.ode.DerivativeException: Dormand-Prince 8 (5, 3)", strArray10);
        org.apache.commons.math.ode.DerivativeException derivativeException17 = new org.apache.commons.math.ode.DerivativeException("org.apache.commons.math.ode.DerivativeException: org.apache.commons.math.ode.IntegratorException: hi!", strArray10);
        org.apache.commons.math.ode.DerivativeException derivativeException18 = new org.apache.commons.math.ode.DerivativeException("org.apache.commons.math.ode.IntegratorException: org.apache.commons.math.ode.IntegratorException", strArray10);
        org.apache.commons.math.ode.DerivativeException derivativeException19 = new org.apache.commons.math.ode.DerivativeException("org.apache.commons.math.ode.DerivativeException", strArray10);
        org.apache.commons.math.ode.DerivativeException derivativeException20 = new org.apache.commons.math.ode.DerivativeException("org.apache.commons.math.ode.IntegratorException: org.apache.commons.math.ode.DerivativeException: org.apache.commons.math.ode.IntegratorException: org.apache.commons.math.ode.IntegratorException: ", strArray10);
        org.junit.Assert.assertNotNull(strArray10);
    }

    @Test
    public void test15641() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest31.test15641");
        org.apache.commons.math.ode.DormandPrince853Integrator dormandPrince853Integrator4 = new org.apache.commons.math.ode.DormandPrince853Integrator(1.0d, (double) (byte) 10, (double) (short) 1, (double) 0L);
        int int5 = dormandPrince853Integrator4.getOrder();
        double double6 = dormandPrince853Integrator4.getSafety();
        dormandPrince853Integrator4.setSafety((double) (-1));
        int int9 = dormandPrince853Integrator4.getOrder();
        org.apache.commons.math.ode.StepHandler stepHandler10 = dormandPrince853Integrator4.getStepHandler();
        dormandPrince853Integrator4.setSafety((double) (short) -1);
        double double13 = dormandPrince853Integrator4.getMinReduction();
        dormandPrince853Integrator4.setSafety(97.0d);
        dormandPrince853Integrator4.setSafety(3.22490309931942d);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 8 + "'", int5 == 8);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.9d + "'", double6 == 0.9d);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 8 + "'", int9 == 8);
        org.junit.Assert.assertNotNull(stepHandler10);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 0.2d + "'", double13 == 0.2d);
    }

    @Test
    public void test15642() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest31.test15642");
        org.apache.commons.math.ode.DormandPrince853Integrator dormandPrince853Integrator4 = new org.apache.commons.math.ode.DormandPrince853Integrator(3.080070288241023d, (double) 100, (double) 100, (double) 0.0f);
        double double5 = dormandPrince853Integrator4.getMinReduction();
        int int6 = dormandPrince853Integrator4.getOrder();
        org.apache.commons.math.ode.StepHandler stepHandler7 = dormandPrince853Integrator4.getStepHandler();
        java.lang.Class<?> wildcardClass8 = stepHandler7.getClass();
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.2d + "'", double5 == 0.2d);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 8 + "'", int6 == 8);
        org.junit.Assert.assertNotNull(stepHandler7);
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test15643() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest31.test15643");
        java.lang.String[] strArray6 = new java.lang.String[] {};
        org.apache.commons.math.ode.DerivativeException derivativeException7 = new org.apache.commons.math.ode.DerivativeException("Dormand-Prince 8 (5, 3)", strArray6);
        org.apache.commons.math.ode.DerivativeException derivativeException8 = new org.apache.commons.math.ode.DerivativeException("org.apache.commons.math.ode.IntegratorException: Dormand-Prince 8 (5, 3)", strArray6);
        org.apache.commons.math.ode.IntegratorException integratorException9 = new org.apache.commons.math.ode.IntegratorException("hi!", (java.lang.Object[]) strArray6);
        org.apache.commons.math.ode.DerivativeException derivativeException10 = new org.apache.commons.math.ode.DerivativeException("Dormand-Prince 8 (5, 3)", strArray6);
        org.apache.commons.math.ode.DerivativeException derivativeException11 = new org.apache.commons.math.ode.DerivativeException("org.apache.commons.math.ode.IntegratorException: org.apache.commons.math.ode.DerivativeException: Dormand-Prince 8 (5, 3)", strArray6);
        org.apache.commons.math.ode.DerivativeException derivativeException12 = new org.apache.commons.math.ode.DerivativeException("org.apache.commons.math.ode.DerivativeException: Dormand-Prince 8 (5, 3)", strArray6);
        java.lang.Throwable[] throwableArray13 = derivativeException12.getSuppressed();
        org.apache.commons.math.ode.DerivativeException derivativeException14 = new org.apache.commons.math.ode.DerivativeException((java.lang.Throwable) derivativeException12);
        java.lang.Object[] objArray15 = derivativeException14.getArguments();
        org.junit.Assert.assertNotNull(strArray6);
        org.junit.Assert.assertNotNull(throwableArray13);
        org.junit.Assert.assertNotNull(objArray15);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray15), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray15), "[]");
    }

    @Test
    public void test15644() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest31.test15644");
        org.apache.commons.math.ode.DormandPrince853Integrator dormandPrince853Integrator4 = new org.apache.commons.math.ode.DormandPrince853Integrator(1.0d, (double) 1, (double) 0, 0.0d);
        java.lang.String str5 = dormandPrince853Integrator4.getName();
        double double6 = dormandPrince853Integrator4.getSafety();
        dormandPrince853Integrator4.setSafety((double) 0L);
        java.lang.String str9 = dormandPrince853Integrator4.getName();
        double double10 = dormandPrince853Integrator4.getCurrentStepStart();
        java.lang.String str11 = dormandPrince853Integrator4.getName();
        java.lang.String str12 = dormandPrince853Integrator4.getName();
        double double13 = dormandPrince853Integrator4.getMaxStep();
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Dormand-Prince 8 (5, 3)" + "'", str5, "Dormand-Prince 8 (5, 3)");
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.9d + "'", double6 == 0.9d);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "Dormand-Prince 8 (5, 3)" + "'", str9, "Dormand-Prince 8 (5, 3)");
        org.junit.Assert.assertTrue(Double.isNaN(double10));
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "Dormand-Prince 8 (5, 3)" + "'", str11, "Dormand-Prince 8 (5, 3)");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "Dormand-Prince 8 (5, 3)" + "'", str12, "Dormand-Prince 8 (5, 3)");
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 1.0d + "'", double13 == 1.0d);
    }

    @Test
    public void test15645() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest31.test15645");
        org.apache.commons.math.ode.DormandPrince853Integrator dormandPrince853Integrator4 = new org.apache.commons.math.ode.DormandPrince853Integrator((double) (short) -1, (double) 100.0f, 0.0d, 3.1622776601683795d);
        double double5 = dormandPrince853Integrator4.getCurrentSignedStepsize();
        dormandPrince853Integrator4.setMinReduction(0.0d);
        double double8 = dormandPrince853Integrator4.getCurrentSignedStepsize();
        double double9 = dormandPrince853Integrator4.getMaxStep();
        org.junit.Assert.assertTrue(Double.isNaN(double5));
        org.junit.Assert.assertTrue(Double.isNaN(double8));
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 100.0d + "'", double9 == 100.0d);
    }

    @Test
    public void test15646() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest31.test15646");
        org.apache.commons.math.ode.DormandPrince853Integrator dormandPrince853Integrator4 = new org.apache.commons.math.ode.DormandPrince853Integrator((double) (short) 1, 2.3713737056616555d, (double) 1, 0.0d);
        org.apache.commons.math.ode.DormandPrince853Integrator dormandPrince853Integrator9 = new org.apache.commons.math.ode.DormandPrince853Integrator(0.0d, (double) 'a', (double) 1L, 31.622776601683793d);
        double double10 = dormandPrince853Integrator9.getCurrentSignedStepsize();
        double double11 = dormandPrince853Integrator9.getMinStep();
        org.apache.commons.math.ode.DormandPrince853Integrator dormandPrince853Integrator16 = new org.apache.commons.math.ode.DormandPrince853Integrator((double) (short) 0, (double) (short) 10, 0.2d, 100.0d);
        double double17 = dormandPrince853Integrator16.getSafety();
        org.apache.commons.math.ode.DormandPrince853Integrator dormandPrince853Integrator22 = new org.apache.commons.math.ode.DormandPrince853Integrator(0.2d, 0.9486832980505138d, (double) (byte) 0, (double) 10L);
        org.apache.commons.math.ode.DormandPrince853Integrator dormandPrince853Integrator27 = new org.apache.commons.math.ode.DormandPrince853Integrator((double) 10, (double) (byte) 10, (double) (short) 100, (double) 1);
        dormandPrince853Integrator27.setSafety((double) '#');
        dormandPrince853Integrator27.setMaxGrowth((double) 100.0f);
        java.lang.String str32 = dormandPrince853Integrator27.getName();
        double double33 = dormandPrince853Integrator27.getSafety();
        double double34 = dormandPrince853Integrator27.getMaxGrowth();
        double double35 = dormandPrince853Integrator27.getMaxStep();
        org.apache.commons.math.ode.StepHandler stepHandler36 = dormandPrince853Integrator27.getStepHandler();
        dormandPrince853Integrator22.setStepHandler(stepHandler36);
        dormandPrince853Integrator16.setStepHandler(stepHandler36);
        dormandPrince853Integrator9.setStepHandler(stepHandler36);
        dormandPrince853Integrator4.setStepHandler(stepHandler36);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 0.0d + "'", double10 == 0.0d);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 0.0d + "'", double11 == 0.0d);
        org.junit.Assert.assertTrue("'" + double17 + "' != '" + 0.9d + "'", double17 == 0.9d);
        org.junit.Assert.assertEquals("'" + str32 + "' != '" + "Dormand-Prince 8 (5, 3)" + "'", str32, "Dormand-Prince 8 (5, 3)");
        org.junit.Assert.assertTrue("'" + double33 + "' != '" + 35.0d + "'", double33 == 35.0d);
        org.junit.Assert.assertTrue("'" + double34 + "' != '" + 100.0d + "'", double34 == 100.0d);
        org.junit.Assert.assertTrue("'" + double35 + "' != '" + 10.0d + "'", double35 == 10.0d);
        org.junit.Assert.assertNotNull(stepHandler36);
    }

    @Test
    public void test15647() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest31.test15647");
        java.lang.String[] strArray6 = new java.lang.String[] {};
        org.apache.commons.math.ode.DerivativeException derivativeException7 = new org.apache.commons.math.ode.DerivativeException("Dormand-Prince 8 (5, 3)", strArray6);
        org.apache.commons.math.ode.DerivativeException derivativeException8 = new org.apache.commons.math.ode.DerivativeException("org.apache.commons.math.ode.IntegratorException: Dormand-Prince 8 (5, 3)", strArray6);
        org.apache.commons.math.ode.IntegratorException integratorException9 = new org.apache.commons.math.ode.IntegratorException("hi!", (java.lang.Object[]) strArray6);
        org.apache.commons.math.ode.DerivativeException derivativeException10 = new org.apache.commons.math.ode.DerivativeException("org.apache.commons.math.ode.IntegratorException: Dormand-Prince 8 (5, 3)", strArray6);
        org.apache.commons.math.ode.DerivativeException derivativeException11 = new org.apache.commons.math.ode.DerivativeException("org.apache.commons.math.ode.DerivativeException: Dormand-Prince 8 (5, 3)", strArray6);
        org.apache.commons.math.ode.IntegratorException integratorException12 = new org.apache.commons.math.ode.IntegratorException((java.lang.Throwable) derivativeException11);
        java.lang.String[] strArray18 = new java.lang.String[] {};
        org.apache.commons.math.ode.DerivativeException derivativeException19 = new org.apache.commons.math.ode.DerivativeException("Dormand-Prince 8 (5, 3)", strArray18);
        org.apache.commons.math.ode.DerivativeException derivativeException20 = new org.apache.commons.math.ode.DerivativeException("org.apache.commons.math.ode.IntegratorException: Dormand-Prince 8 (5, 3)", strArray18);
        org.apache.commons.math.ode.IntegratorException integratorException21 = new org.apache.commons.math.ode.IntegratorException("hi!", (java.lang.Object[]) strArray18);
        org.apache.commons.math.ode.DerivativeException derivativeException22 = new org.apache.commons.math.ode.DerivativeException("org.apache.commons.math.ode.IntegratorException: Dormand-Prince 8 (5, 3)", strArray18);
        org.apache.commons.math.ode.DerivativeException derivativeException23 = new org.apache.commons.math.ode.DerivativeException("org.apache.commons.math.ode.DerivativeException: ", strArray18);
        java.lang.String[] strArray25 = new java.lang.String[] {};
        org.apache.commons.math.ode.DerivativeException derivativeException26 = new org.apache.commons.math.ode.DerivativeException("Dormand-Prince 8 (5, 3)", strArray25);
        org.apache.commons.math.ode.IntegratorException integratorException27 = new org.apache.commons.math.ode.IntegratorException((java.lang.Throwable) derivativeException26);
        org.apache.commons.math.ode.DerivativeException derivativeException28 = new org.apache.commons.math.ode.DerivativeException((java.lang.Throwable) derivativeException26);
        java.lang.Object[] objArray29 = derivativeException26.getArguments();
        derivativeException23.addSuppressed((java.lang.Throwable) derivativeException26);
        org.apache.commons.math.ode.IntegratorException integratorException31 = new org.apache.commons.math.ode.IntegratorException((java.lang.Throwable) derivativeException23);
        integratorException12.addSuppressed((java.lang.Throwable) derivativeException23);
        java.lang.String[] strArray36 = new java.lang.String[] {};
        org.apache.commons.math.ode.DerivativeException derivativeException37 = new org.apache.commons.math.ode.DerivativeException("Dormand-Prince 8 (5, 3)", strArray36);
        org.apache.commons.math.ode.DerivativeException derivativeException38 = new org.apache.commons.math.ode.DerivativeException("hi!", strArray36);
        org.apache.commons.math.ode.IntegratorException integratorException39 = new org.apache.commons.math.ode.IntegratorException("org.apache.commons.math.ode.IntegratorException: hi!", (java.lang.Object[]) strArray36);
        java.lang.Object[] objArray40 = integratorException39.getArguments();
        org.apache.commons.math.ode.IntegratorException integratorException41 = new org.apache.commons.math.ode.IntegratorException((java.lang.Throwable) integratorException39);
        org.apache.commons.math.ode.IntegratorException integratorException42 = new org.apache.commons.math.ode.IntegratorException((java.lang.Throwable) integratorException39);
        integratorException12.addSuppressed((java.lang.Throwable) integratorException42);
        java.lang.Throwable[] throwableArray44 = integratorException12.getSuppressed();
        org.apache.commons.math.ode.IntegratorException integratorException45 = new org.apache.commons.math.ode.IntegratorException("org.apache.commons.math.ode.DerivativeException: org.apache.commons.math.ode.DerivativeException: ", (java.lang.Object[]) throwableArray44);
        org.junit.Assert.assertNotNull(strArray6);
        org.junit.Assert.assertNotNull(strArray18);
        org.junit.Assert.assertNotNull(strArray25);
        org.junit.Assert.assertNotNull(objArray29);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray29), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray29), "[]");
        org.junit.Assert.assertNotNull(strArray36);
        org.junit.Assert.assertNotNull(objArray40);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray40), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray40), "[]");
        org.junit.Assert.assertNotNull(throwableArray44);
    }

    @Test
    public void test15648() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest31.test15648");
        org.apache.commons.math.ode.DormandPrince853Integrator dormandPrince853Integrator4 = new org.apache.commons.math.ode.DormandPrince853Integrator(1.0d, (double) (byte) 10, (double) (short) 1, (double) 0L);
        double double5 = dormandPrince853Integrator4.getMinStep();
        int int6 = dormandPrince853Integrator4.getOrder();
        org.apache.commons.math.ode.StepHandler stepHandler7 = dormandPrince853Integrator4.getStepHandler();
        java.lang.String str8 = dormandPrince853Integrator4.getName();
        double double9 = dormandPrince853Integrator4.getCurrentSignedStepsize();
        dormandPrince853Integrator4.setMinReduction(3.0d);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 1.0d + "'", double5 == 1.0d);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 8 + "'", int6 == 8);
        org.junit.Assert.assertNotNull(stepHandler7);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Dormand-Prince 8 (5, 3)" + "'", str8, "Dormand-Prince 8 (5, 3)");
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 3.1622776601683795d + "'", double9 == 3.1622776601683795d);
    }

    @Test
    public void test15649() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest31.test15649");
        org.apache.commons.math.ode.DormandPrince853Integrator dormandPrince853Integrator4 = new org.apache.commons.math.ode.DormandPrince853Integrator((double) 10, (double) (byte) 10, (double) (short) 100, (double) 1);
        double double5 = dormandPrince853Integrator4.getSafety();
        dormandPrince853Integrator4.setMinReduction((double) (short) -1);
        dormandPrince853Integrator4.setInitialStepSize((double) (byte) 1);
        dormandPrince853Integrator4.setSafety(0.9486832980505138d);
        double double12 = dormandPrince853Integrator4.getCurrentSignedStepsize();
        double double13 = dormandPrince853Integrator4.getMaxStep();
        java.lang.String str14 = dormandPrince853Integrator4.getName();
        double double15 = dormandPrince853Integrator4.getSafety();
        java.lang.String str16 = dormandPrince853Integrator4.getName();
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.9d + "'", double5 == 0.9d);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 10.0d + "'", double12 == 10.0d);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 10.0d + "'", double13 == 10.0d);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "Dormand-Prince 8 (5, 3)" + "'", str14, "Dormand-Prince 8 (5, 3)");
        org.junit.Assert.assertTrue("'" + double15 + "' != '" + 0.9486832980505138d + "'", double15 == 0.9486832980505138d);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "Dormand-Prince 8 (5, 3)" + "'", str16, "Dormand-Prince 8 (5, 3)");
    }

    @Test
    public void test15650() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest31.test15650");
        org.apache.commons.math.ode.DormandPrince853Integrator dormandPrince853Integrator4 = new org.apache.commons.math.ode.DormandPrince853Integrator(0.0d, (double) (short) 0, (double) 'a', 1.6870239755710472d);
        int int5 = dormandPrince853Integrator4.getOrder();
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 8 + "'", int5 == 8);
    }

    @Test
    public void test15651() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest31.test15651");
        java.lang.String[] strArray13 = new java.lang.String[] {};
        org.apache.commons.math.ode.DerivativeException derivativeException14 = new org.apache.commons.math.ode.DerivativeException("Dormand-Prince 8 (5, 3)", strArray13);
        org.apache.commons.math.ode.DerivativeException derivativeException15 = new org.apache.commons.math.ode.DerivativeException("org.apache.commons.math.ode.IntegratorException: Dormand-Prince 8 (5, 3)", strArray13);
        org.apache.commons.math.ode.IntegratorException integratorException16 = new org.apache.commons.math.ode.IntegratorException("hi!", (java.lang.Object[]) strArray13);
        org.apache.commons.math.ode.DerivativeException derivativeException17 = new org.apache.commons.math.ode.DerivativeException("org.apache.commons.math.ode.IntegratorException: Dormand-Prince 8 (5, 3)", strArray13);
        org.apache.commons.math.ode.DerivativeException derivativeException18 = new org.apache.commons.math.ode.DerivativeException("org.apache.commons.math.ode.DerivativeException: Dormand-Prince 8 (5, 3)", strArray13);
        org.apache.commons.math.ode.DerivativeException derivativeException19 = new org.apache.commons.math.ode.DerivativeException("Dormand-Prince 8 (5, 3)", strArray13);
        org.apache.commons.math.ode.IntegratorException integratorException20 = new org.apache.commons.math.ode.IntegratorException("Dormand-Prince 8 (5, 3)", (java.lang.Object[]) strArray13);
        org.apache.commons.math.ode.DerivativeException derivativeException21 = new org.apache.commons.math.ode.DerivativeException("org.apache.commons.math.ode.DerivativeException: org.apache.commons.math.ode.IntegratorException", strArray13);
        org.apache.commons.math.ode.DerivativeException derivativeException22 = new org.apache.commons.math.ode.DerivativeException("hi!", strArray13);
        org.apache.commons.math.ode.DerivativeException derivativeException23 = new org.apache.commons.math.ode.DerivativeException("org.apache.commons.math.ode.IntegratorException: org.apache.commons.math.ode.IntegratorException: ", strArray13);
        org.apache.commons.math.ode.DerivativeException derivativeException24 = new org.apache.commons.math.ode.DerivativeException("org.apache.commons.math.ode.IntegratorException: org.apache.commons.math.ode.IntegratorException: org.apache.commons.math.ode.DerivativeException: Dormand-Prince 8 (5, 3)", strArray13);
        org.apache.commons.math.ode.DerivativeException derivativeException25 = new org.apache.commons.math.ode.DerivativeException("", strArray13);
        org.apache.commons.math.ode.DerivativeException derivativeException26 = new org.apache.commons.math.ode.DerivativeException("org.apache.commons.math.ode.DerivativeException: org.apache.commons.math.ode.IntegratorException: org.apache.commons.math.ode.DerivativeException: org.apache.commons.math.ode.DerivativeException: org.apache.commons.math.ode.IntegratorException: hi!", strArray13);
        org.junit.Assert.assertNotNull(strArray13);
    }

    @Test
    public void test15652() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest31.test15652");
        org.apache.commons.math.ode.DormandPrince853Integrator dormandPrince853Integrator4 = new org.apache.commons.math.ode.DormandPrince853Integrator(55.71355310873648d, (double) (short) 0, 32.0d, 10.0d);
        java.lang.String str5 = dormandPrince853Integrator4.getName();
        double double6 = dormandPrince853Integrator4.getCurrentStepStart();
        double double7 = dormandPrince853Integrator4.getSafety();
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Dormand-Prince 8 (5, 3)" + "'", str5, "Dormand-Prince 8 (5, 3)");
        org.junit.Assert.assertTrue(Double.isNaN(double6));
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 0.9d + "'", double7 == 0.9d);
    }

    @Test
    public void test15653() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest31.test15653");
        org.apache.commons.math.ode.DormandPrince853Integrator dormandPrince853Integrator4 = new org.apache.commons.math.ode.DormandPrince853Integrator((double) 10, (double) (byte) 10, (double) (short) 100, (double) 1);
        double double5 = dormandPrince853Integrator4.getSafety();
        double double6 = dormandPrince853Integrator4.getMinStep();
        double double7 = dormandPrince853Integrator4.getMinStep();
        double double8 = dormandPrince853Integrator4.getCurrentSignedStepsize();
        int int9 = dormandPrince853Integrator4.getOrder();
        double double10 = dormandPrince853Integrator4.getMaxGrowth();
        java.lang.String str11 = dormandPrince853Integrator4.getName();
        java.lang.String str12 = dormandPrince853Integrator4.getName();
        double double13 = dormandPrince853Integrator4.getMaxStep();
        org.apache.commons.math.ode.StepHandler stepHandler14 = dormandPrince853Integrator4.getStepHandler();
        org.apache.commons.math.ode.StepHandler stepHandler15 = dormandPrince853Integrator4.getStepHandler();
        double double16 = dormandPrince853Integrator4.getCurrentSignedStepsize();
        double double17 = dormandPrince853Integrator4.getMinStep();
        org.apache.commons.math.ode.SwitchingFunction switchingFunction18 = null;
        dormandPrince853Integrator4.addSwitchingFunction(switchingFunction18, (double) 1L, (double) (short) 10, (int) (byte) 100);
        double double23 = dormandPrince853Integrator4.getCurrentSignedStepsize();
        double double24 = dormandPrince853Integrator4.getMinStep();
        double double25 = dormandPrince853Integrator4.getMaxStep();
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.9d + "'", double5 == 0.9d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 10.0d + "'", double6 == 10.0d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 10.0d + "'", double7 == 10.0d);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 10.0d + "'", double8 == 10.0d);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 8 + "'", int9 == 8);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 10.0d + "'", double10 == 10.0d);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "Dormand-Prince 8 (5, 3)" + "'", str11, "Dormand-Prince 8 (5, 3)");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "Dormand-Prince 8 (5, 3)" + "'", str12, "Dormand-Prince 8 (5, 3)");
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 10.0d + "'", double13 == 10.0d);
        org.junit.Assert.assertNotNull(stepHandler14);
        org.junit.Assert.assertNotNull(stepHandler15);
        org.junit.Assert.assertTrue("'" + double16 + "' != '" + 10.0d + "'", double16 == 10.0d);
        org.junit.Assert.assertTrue("'" + double17 + "' != '" + 10.0d + "'", double17 == 10.0d);
        org.junit.Assert.assertTrue("'" + double23 + "' != '" + 10.0d + "'", double23 == 10.0d);
        org.junit.Assert.assertTrue("'" + double24 + "' != '" + 10.0d + "'", double24 == 10.0d);
        org.junit.Assert.assertTrue("'" + double25 + "' != '" + 10.0d + "'", double25 == 10.0d);
    }

    @Test
    public void test15654() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest31.test15654");
        java.lang.String[] strArray1 = new java.lang.String[] {};
        org.apache.commons.math.ode.DerivativeException derivativeException2 = new org.apache.commons.math.ode.DerivativeException("Dormand-Prince 8 (5, 3)", strArray1);
        org.apache.commons.math.ode.IntegratorException integratorException3 = new org.apache.commons.math.ode.IntegratorException((java.lang.Throwable) derivativeException2);
        org.apache.commons.math.ode.DerivativeException derivativeException4 = new org.apache.commons.math.ode.DerivativeException((java.lang.Throwable) integratorException3);
        org.apache.commons.math.ode.IntegratorException integratorException5 = new org.apache.commons.math.ode.IntegratorException((java.lang.Throwable) derivativeException4);
        java.lang.Object[] objArray6 = derivativeException4.getArguments();
        java.lang.Object[] objArray7 = derivativeException4.getArguments();
        org.junit.Assert.assertNotNull(strArray1);
        org.junit.Assert.assertNotNull(objArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray6), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray6), "[]");
        org.junit.Assert.assertNotNull(objArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray7), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray7), "[]");
    }

    @Test
    public void test15655() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest31.test15655");
        org.apache.commons.math.ode.DormandPrince853Integrator dormandPrince853Integrator4 = new org.apache.commons.math.ode.DormandPrince853Integrator(1.0d, (double) (byte) 10, (double) (short) 1, (double) 0L);
        double double5 = dormandPrince853Integrator4.getMinStep();
        org.apache.commons.math.ode.SwitchingFunction switchingFunction6 = null;
        dormandPrince853Integrator4.addSwitchingFunction(switchingFunction6, (double) (-1L), (double) '4', 10);
        java.lang.String str11 = dormandPrince853Integrator4.getName();
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 1.0d + "'", double5 == 1.0d);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "Dormand-Prince 8 (5, 3)" + "'", str11, "Dormand-Prince 8 (5, 3)");
    }

    @Test
    public void test15656() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest31.test15656");
        org.apache.commons.math.ode.DormandPrince853Integrator dormandPrince853Integrator4 = new org.apache.commons.math.ode.DormandPrince853Integrator(1.0d, (double) (byte) 10, (double) (short) 1, (double) 0L);
        org.apache.commons.math.ode.StepHandler stepHandler5 = null;
        dormandPrince853Integrator4.setStepHandler(stepHandler5);
        dormandPrince853Integrator4.setInitialStepSize((double) 1L);
        double double9 = dormandPrince853Integrator4.getCurrentStepStart();
        int int10 = dormandPrince853Integrator4.getOrder();
        java.lang.String str11 = dormandPrince853Integrator4.getName();
        double double12 = dormandPrince853Integrator4.getMinReduction();
        org.apache.commons.math.ode.SwitchingFunction switchingFunction13 = null;
        dormandPrince853Integrator4.addSwitchingFunction(switchingFunction13, 16.0d, 0.0d, (int) (short) 10);
        dormandPrince853Integrator4.setMinReduction(8.94427190999916d);
        double double20 = dormandPrince853Integrator4.getSafety();
        dormandPrince853Integrator4.setMaxGrowth(5.549838095152888d);
        org.junit.Assert.assertTrue(Double.isNaN(double9));
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 8 + "'", int10 == 8);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "Dormand-Prince 8 (5, 3)" + "'", str11, "Dormand-Prince 8 (5, 3)");
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 0.2d + "'", double12 == 0.2d);
        org.junit.Assert.assertTrue("'" + double20 + "' != '" + 0.9d + "'", double20 == 0.9d);
    }

    @Test
    public void test15657() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest31.test15657");
        double[] doubleArray8 = new double[] {};
        double[] doubleArray9 = new double[] {};
        org.apache.commons.math.ode.DormandPrince853Integrator dormandPrince853Integrator10 = new org.apache.commons.math.ode.DormandPrince853Integrator((double) 1.0f, (double) 1.0f, doubleArray8, doubleArray9);
        double[] doubleArray13 = new double[] {};
        double[] doubleArray14 = new double[] {};
        org.apache.commons.math.ode.DormandPrince853Integrator dormandPrince853Integrator15 = new org.apache.commons.math.ode.DormandPrince853Integrator((double) 1.0f, (double) 1.0f, doubleArray13, doubleArray14);
        org.apache.commons.math.ode.DormandPrince853Integrator dormandPrince853Integrator16 = new org.apache.commons.math.ode.DormandPrince853Integrator((double) ' ', (double) 'a', doubleArray9, doubleArray14);
        double[] doubleArray19 = new double[] {};
        double[] doubleArray20 = new double[] {};
        org.apache.commons.math.ode.DormandPrince853Integrator dormandPrince853Integrator21 = new org.apache.commons.math.ode.DormandPrince853Integrator((double) 1.0f, (double) 1.0f, doubleArray19, doubleArray20);
        org.apache.commons.math.ode.DormandPrince853Integrator dormandPrince853Integrator22 = new org.apache.commons.math.ode.DormandPrince853Integrator(3.1622776601683795d, (double) ' ', doubleArray14, doubleArray19);
        double[] doubleArray29 = new double[] {};
        double[] doubleArray30 = new double[] {};
        org.apache.commons.math.ode.DormandPrince853Integrator dormandPrince853Integrator31 = new org.apache.commons.math.ode.DormandPrince853Integrator((double) 1.0f, (double) 1.0f, doubleArray29, doubleArray30);
        double[] doubleArray34 = new double[] {};
        double[] doubleArray35 = new double[] {};
        org.apache.commons.math.ode.DormandPrince853Integrator dormandPrince853Integrator36 = new org.apache.commons.math.ode.DormandPrince853Integrator((double) 1.0f, (double) 1.0f, doubleArray34, doubleArray35);
        org.apache.commons.math.ode.DormandPrince853Integrator dormandPrince853Integrator37 = new org.apache.commons.math.ode.DormandPrince853Integrator((double) ' ', (double) 'a', doubleArray30, doubleArray35);
        double[] doubleArray40 = new double[] {};
        double[] doubleArray41 = new double[] {};
        org.apache.commons.math.ode.DormandPrince853Integrator dormandPrince853Integrator42 = new org.apache.commons.math.ode.DormandPrince853Integrator((double) 1.0f, (double) 1.0f, doubleArray40, doubleArray41);
        org.apache.commons.math.ode.DormandPrince853Integrator dormandPrince853Integrator43 = new org.apache.commons.math.ode.DormandPrince853Integrator(3.1622776601683795d, (double) ' ', doubleArray35, doubleArray40);
        org.apache.commons.math.ode.DormandPrince853Integrator dormandPrince853Integrator44 = new org.apache.commons.math.ode.DormandPrince853Integrator((double) 0, (double) (byte) 0, doubleArray14, doubleArray35);
        double double45 = dormandPrince853Integrator44.getMinReduction();
        java.lang.String str46 = dormandPrince853Integrator44.getName();
        double double47 = dormandPrince853Integrator44.getCurrentSignedStepsize();
        double double48 = dormandPrince853Integrator44.getSafety();
        org.junit.Assert.assertNotNull(doubleArray8);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray8), "[]");
        org.junit.Assert.assertNotNull(doubleArray9);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray9), "[]");
        org.junit.Assert.assertNotNull(doubleArray13);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray13), "[]");
        org.junit.Assert.assertNotNull(doubleArray14);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray14), "[]");
        org.junit.Assert.assertNotNull(doubleArray19);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray19), "[]");
        org.junit.Assert.assertNotNull(doubleArray20);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray20), "[]");
        org.junit.Assert.assertNotNull(doubleArray29);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray29), "[]");
        org.junit.Assert.assertNotNull(doubleArray30);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray30), "[]");
        org.junit.Assert.assertNotNull(doubleArray34);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray34), "[]");
        org.junit.Assert.assertNotNull(doubleArray35);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray35), "[]");
        org.junit.Assert.assertNotNull(doubleArray40);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray40), "[]");
        org.junit.Assert.assertNotNull(doubleArray41);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray41), "[]");
        org.junit.Assert.assertTrue("'" + double45 + "' != '" + 0.2d + "'", double45 == 0.2d);
        org.junit.Assert.assertEquals("'" + str46 + "' != '" + "Dormand-Prince 8 (5, 3)" + "'", str46, "Dormand-Prince 8 (5, 3)");
        org.junit.Assert.assertTrue("'" + double47 + "' != '" + 0.0d + "'", double47 == 0.0d);
        org.junit.Assert.assertTrue("'" + double48 + "' != '" + 0.9d + "'", double48 == 0.9d);
    }

    @Test
    public void test15658() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest31.test15658");
        java.lang.Throwable throwable0 = null;
        org.apache.commons.math.ode.DerivativeException derivativeException1 = new org.apache.commons.math.ode.DerivativeException(throwable0);
        java.lang.String[] strArray4 = new java.lang.String[] { "org.apache.commons.math.ode.DerivativeException: org.apache.commons.math.ode.IntegratorException: Dormand-Prince 8 (5, 3)" };
        org.apache.commons.math.ode.DerivativeException derivativeException5 = new org.apache.commons.math.ode.DerivativeException("Dormand-Prince 8 (5, 3)", strArray4);
        java.lang.Throwable[] throwableArray6 = derivativeException5.getSuppressed();
        derivativeException1.addSuppressed((java.lang.Throwable) derivativeException5);
        java.lang.String str8 = derivativeException5.getPattern();
        java.lang.String[] strArray14 = new java.lang.String[] {};
        org.apache.commons.math.ode.DerivativeException derivativeException15 = new org.apache.commons.math.ode.DerivativeException("Dormand-Prince 8 (5, 3)", strArray14);
        org.apache.commons.math.ode.DerivativeException derivativeException16 = new org.apache.commons.math.ode.DerivativeException("hi!", strArray14);
        org.apache.commons.math.ode.DerivativeException derivativeException17 = new org.apache.commons.math.ode.DerivativeException("hi!", strArray14);
        org.apache.commons.math.ode.IntegratorException integratorException18 = new org.apache.commons.math.ode.IntegratorException("org.apache.commons.math.ode.IntegratorException: hi!", (java.lang.Object[]) strArray14);
        org.apache.commons.math.ode.IntegratorException integratorException19 = new org.apache.commons.math.ode.IntegratorException("org.apache.commons.math.ode.DerivativeException: Dormand-Prince 8 (5, 3)", (java.lang.Object[]) strArray14);
        org.apache.commons.math.ode.IntegratorException integratorException20 = new org.apache.commons.math.ode.IntegratorException((java.lang.Throwable) integratorException19);
        derivativeException5.addSuppressed((java.lang.Throwable) integratorException20);
        org.apache.commons.math.ode.DerivativeException derivativeException22 = new org.apache.commons.math.ode.DerivativeException((java.lang.Throwable) integratorException20);
        java.lang.Object[] objArray23 = integratorException20.getArguments();
        java.lang.String str24 = integratorException20.toString();
        org.junit.Assert.assertNotNull(strArray4);
        org.junit.Assert.assertNotNull(throwableArray6);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Dormand-Prince 8 (5, 3)" + "'", str8, "Dormand-Prince 8 (5, 3)");
        org.junit.Assert.assertNotNull(strArray14);
        org.junit.Assert.assertNotNull(objArray23);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray23), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray23), "[]");
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "org.apache.commons.math.ode.IntegratorException: org.apache.commons.math.ode.DerivativeException: Dormand-Prince 8 (5, 3)" + "'", str24, "org.apache.commons.math.ode.IntegratorException: org.apache.commons.math.ode.DerivativeException: Dormand-Prince 8 (5, 3)");
    }

    @Test
    public void test15659() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest31.test15659");
        org.apache.commons.math.ode.DormandPrince853Integrator dormandPrince853Integrator4 = new org.apache.commons.math.ode.DormandPrince853Integrator(0.2d, 0.9486832980505138d, (double) (byte) 0, (double) 10L);
        org.apache.commons.math.ode.DormandPrince853Integrator dormandPrince853Integrator9 = new org.apache.commons.math.ode.DormandPrince853Integrator((double) 10, (double) (byte) 10, (double) (short) 100, (double) 1);
        dormandPrince853Integrator9.setSafety((double) '#');
        dormandPrince853Integrator9.setMaxGrowth((double) 100.0f);
        java.lang.String str14 = dormandPrince853Integrator9.getName();
        double double15 = dormandPrince853Integrator9.getSafety();
        double double16 = dormandPrince853Integrator9.getMaxGrowth();
        double double17 = dormandPrince853Integrator9.getMaxStep();
        org.apache.commons.math.ode.StepHandler stepHandler18 = dormandPrince853Integrator9.getStepHandler();
        dormandPrince853Integrator4.setStepHandler(stepHandler18);
        java.lang.String str20 = dormandPrince853Integrator4.getName();
        dormandPrince853Integrator4.setInitialStepSize(55.71355310873648d);
        dormandPrince853Integrator4.setSafety(5.623413251903491d);
        java.lang.String str25 = dormandPrince853Integrator4.getName();
        double double26 = dormandPrince853Integrator4.getMinStep();
        dormandPrince853Integrator4.setMaxGrowth((double) 1L);
        java.lang.String str29 = dormandPrince853Integrator4.getName();
        int int30 = dormandPrince853Integrator4.getOrder();
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "Dormand-Prince 8 (5, 3)" + "'", str14, "Dormand-Prince 8 (5, 3)");
        org.junit.Assert.assertTrue("'" + double15 + "' != '" + 35.0d + "'", double15 == 35.0d);
        org.junit.Assert.assertTrue("'" + double16 + "' != '" + 100.0d + "'", double16 == 100.0d);
        org.junit.Assert.assertTrue("'" + double17 + "' != '" + 10.0d + "'", double17 == 10.0d);
        org.junit.Assert.assertNotNull(stepHandler18);
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "Dormand-Prince 8 (5, 3)" + "'", str20, "Dormand-Prince 8 (5, 3)");
        org.junit.Assert.assertEquals("'" + str25 + "' != '" + "Dormand-Prince 8 (5, 3)" + "'", str25, "Dormand-Prince 8 (5, 3)");
        org.junit.Assert.assertTrue("'" + double26 + "' != '" + 0.2d + "'", double26 == 0.2d);
        org.junit.Assert.assertEquals("'" + str29 + "' != '" + "Dormand-Prince 8 (5, 3)" + "'", str29, "Dormand-Prince 8 (5, 3)");
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 8 + "'", int30 == 8);
    }

    @Test
    public void test15660() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest31.test15660");
        org.apache.commons.math.ode.DormandPrince853Integrator dormandPrince853Integrator4 = new org.apache.commons.math.ode.DormandPrince853Integrator((double) 10, (double) (byte) 10, (double) (short) 100, (double) 1);
        double double5 = dormandPrince853Integrator4.getSafety();
        int int6 = dormandPrince853Integrator4.getOrder();
        int int7 = dormandPrince853Integrator4.getOrder();
        org.apache.commons.math.ode.StepHandler stepHandler8 = dormandPrince853Integrator4.getStepHandler();
        dormandPrince853Integrator4.setInitialStepSize((double) 0);
        dormandPrince853Integrator4.setMaxGrowth(3.1622776601683795d);
        double double13 = dormandPrince853Integrator4.getCurrentSignedStepsize();
        dormandPrince853Integrator4.setSafety(3.080070288241023d);
        java.lang.String str16 = dormandPrince853Integrator4.getName();
        org.apache.commons.math.ode.SwitchingFunction switchingFunction17 = null;
        dormandPrince853Integrator4.addSwitchingFunction(switchingFunction17, (double) (-1L), (double) 100L, (-1));
        double double22 = dormandPrince853Integrator4.getMaxGrowth();
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.9d + "'", double5 == 0.9d);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 8 + "'", int6 == 8);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 8 + "'", int7 == 8);
        org.junit.Assert.assertNotNull(stepHandler8);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 10.0d + "'", double13 == 10.0d);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "Dormand-Prince 8 (5, 3)" + "'", str16, "Dormand-Prince 8 (5, 3)");
        org.junit.Assert.assertTrue("'" + double22 + "' != '" + 3.1622776601683795d + "'", double22 == 3.1622776601683795d);
    }

    @Test
    public void test15661() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest31.test15661");
        org.apache.commons.math.ode.DormandPrince853Integrator dormandPrince853Integrator4 = new org.apache.commons.math.ode.DormandPrince853Integrator(1.0d, (double) 1, (double) 0, 0.0d);
        double double5 = dormandPrince853Integrator4.getMinReduction();
        org.apache.commons.math.ode.SwitchingFunction switchingFunction6 = null;
        dormandPrince853Integrator4.addSwitchingFunction(switchingFunction6, (double) 1.0f, (double) 1L, 8);
        double double11 = dormandPrince853Integrator4.getCurrentSignedStepsize();
        int int12 = dormandPrince853Integrator4.getOrder();
        dormandPrince853Integrator4.setSafety(97.0d);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.2d + "'", double5 == 0.2d);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 1.0d + "'", double11 == 1.0d);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 8 + "'", int12 == 8);
    }

    @Test
    public void test15662() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest31.test15662");
        java.lang.String[] strArray10 = new java.lang.String[] {};
        org.apache.commons.math.ode.DerivativeException derivativeException11 = new org.apache.commons.math.ode.DerivativeException("Dormand-Prince 8 (5, 3)", strArray10);
        org.apache.commons.math.ode.IntegratorException integratorException12 = new org.apache.commons.math.ode.IntegratorException("", (java.lang.Object[]) strArray10);
        org.apache.commons.math.ode.DerivativeException derivativeException13 = new org.apache.commons.math.ode.DerivativeException("org.apache.commons.math.ode.DerivativeException: Dormand-Prince 8 (5, 3)", strArray10);
        org.apache.commons.math.ode.DerivativeException derivativeException14 = new org.apache.commons.math.ode.DerivativeException("org.apache.commons.math.ode.IntegratorException", strArray10);
        org.apache.commons.math.ode.IntegratorException integratorException15 = new org.apache.commons.math.ode.IntegratorException("", (java.lang.Object[]) strArray10);
        org.apache.commons.math.ode.DerivativeException derivativeException16 = new org.apache.commons.math.ode.DerivativeException("org.apache.commons.math.ode.IntegratorException: org.apache.commons.math.ode.DerivativeException: org.apache.commons.math.ode.IntegratorException: Dormand-Prince 8 (5, 3)", strArray10);
        org.apache.commons.math.ode.DerivativeException derivativeException17 = new org.apache.commons.math.ode.DerivativeException("hi!", strArray10);
        org.apache.commons.math.ode.DerivativeException derivativeException18 = new org.apache.commons.math.ode.DerivativeException("org.apache.commons.math.ode.DerivativeException: org.apache.commons.math.ode.IntegratorException: Dormand-Prince 8 (5, 3)", strArray10);
        org.apache.commons.math.ode.DerivativeException derivativeException19 = new org.apache.commons.math.ode.DerivativeException("org.apache.commons.math.ode.DerivativeException", strArray10);
        org.apache.commons.math.ode.IntegratorException integratorException20 = new org.apache.commons.math.ode.IntegratorException("org.apache.commons.math.ode.IntegratorException: org.apache.commons.math.ode.IntegratorException: org.apache.commons.math.ode.DerivativeException: org.apache.commons.math.ode.DerivativeException: ", (java.lang.Object[]) strArray10);
        org.junit.Assert.assertNotNull(strArray10);
    }

    @Test
    public void test15663() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest31.test15663");
        java.lang.String[] strArray8 = new java.lang.String[] {};
        org.apache.commons.math.ode.DerivativeException derivativeException9 = new org.apache.commons.math.ode.DerivativeException("Dormand-Prince 8 (5, 3)", strArray8);
        org.apache.commons.math.ode.DerivativeException derivativeException10 = new org.apache.commons.math.ode.DerivativeException("hi!", strArray8);
        org.apache.commons.math.ode.DerivativeException derivativeException11 = new org.apache.commons.math.ode.DerivativeException("Dormand-Prince 8 (5, 3)", strArray8);
        org.apache.commons.math.ode.IntegratorException integratorException12 = new org.apache.commons.math.ode.IntegratorException("org.apache.commons.math.ode.IntegratorException: hi!", (java.lang.Object[]) strArray8);
        org.apache.commons.math.ode.IntegratorException integratorException13 = new org.apache.commons.math.ode.IntegratorException("org.apache.commons.math.ode.DerivativeException", (java.lang.Object[]) strArray8);
        org.apache.commons.math.ode.DerivativeException derivativeException14 = new org.apache.commons.math.ode.DerivativeException("org.apache.commons.math.ode.IntegratorException: org.apache.commons.math.ode.IntegratorException: hi!", strArray8);
        org.apache.commons.math.ode.DerivativeException derivativeException15 = new org.apache.commons.math.ode.DerivativeException("org.apache.commons.math.ode.DerivativeException: org.apache.commons.math.ode.IntegratorException: Dormand-Prince 8 (5, 3)", strArray8);
        org.apache.commons.math.ode.DerivativeException derivativeException16 = new org.apache.commons.math.ode.DerivativeException("org.apache.commons.math.ode.DerivativeException: org.apache.commons.math.ode.IntegratorException: org.apache.commons.math.ode.DerivativeException: org.apache.commons.math.ode.IntegratorException: ", strArray8);
        org.junit.Assert.assertNotNull(strArray8);
    }

    @Test
    public void test15664() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest31.test15664");
        org.apache.commons.math.ode.DormandPrince853Integrator dormandPrince853Integrator4 = new org.apache.commons.math.ode.DormandPrince853Integrator(0.0d, (double) (byte) 1, Double.NaN, (double) '#');
        dormandPrince853Integrator4.setInitialStepSize((double) 10.0f);
        int int7 = dormandPrince853Integrator4.getOrder();
        dormandPrince853Integrator4.setMinReduction((double) (-1L));
        org.apache.commons.math.ode.DormandPrince853Integrator dormandPrince853Integrator14 = new org.apache.commons.math.ode.DormandPrince853Integrator((double) 10, (double) (byte) 10, (double) (short) 100, (double) 1);
        double double15 = dormandPrince853Integrator14.getSafety();
        double double16 = dormandPrince853Integrator14.getMinStep();
        dormandPrince853Integrator14.setSafety((double) '#');
        double double19 = dormandPrince853Integrator14.getCurrentStepStart();
        org.apache.commons.math.ode.DormandPrince853Integrator dormandPrince853Integrator24 = new org.apache.commons.math.ode.DormandPrince853Integrator((double) 10, (double) (byte) 10, (double) (short) 100, (double) 1);
        double double25 = dormandPrince853Integrator24.getSafety();
        double double26 = dormandPrince853Integrator24.getMinStep();
        dormandPrince853Integrator24.setSafety((double) '#');
        double double29 = dormandPrince853Integrator24.getCurrentStepStart();
        double double30 = dormandPrince853Integrator24.getMaxStep();
        org.apache.commons.math.ode.StepHandler stepHandler31 = dormandPrince853Integrator24.getStepHandler();
        dormandPrince853Integrator14.setStepHandler(stepHandler31);
        dormandPrince853Integrator4.setStepHandler(stepHandler31);
        org.apache.commons.math.ode.StepHandler stepHandler34 = dormandPrince853Integrator4.getStepHandler();
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 8 + "'", int7 == 8);
        org.junit.Assert.assertTrue("'" + double15 + "' != '" + 0.9d + "'", double15 == 0.9d);
        org.junit.Assert.assertTrue("'" + double16 + "' != '" + 10.0d + "'", double16 == 10.0d);
        org.junit.Assert.assertTrue(Double.isNaN(double19));
        org.junit.Assert.assertTrue("'" + double25 + "' != '" + 0.9d + "'", double25 == 0.9d);
        org.junit.Assert.assertTrue("'" + double26 + "' != '" + 10.0d + "'", double26 == 10.0d);
        org.junit.Assert.assertTrue(Double.isNaN(double29));
        org.junit.Assert.assertTrue("'" + double30 + "' != '" + 10.0d + "'", double30 == 10.0d);
        org.junit.Assert.assertNotNull(stepHandler31);
        org.junit.Assert.assertNotNull(stepHandler34);
    }
}

