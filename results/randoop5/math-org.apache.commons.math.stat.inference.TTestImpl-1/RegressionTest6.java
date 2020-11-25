import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class RegressionTest6 {

    public static boolean debug = false;

    @Test
    public void test3001() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3001");
        org.apache.commons.math.distribution.TDistribution tDistribution0 = null;
        org.apache.commons.math.stat.inference.TTestImpl tTestImpl1 = new org.apache.commons.math.stat.inference.TTestImpl(tDistribution0);
        double[] doubleArray7 = new double[] { 1.0f, (short) 1, 100.0f, 1, 0.0f };
        double[] doubleArray12 = new double[] { ' ', (byte) 100, (byte) 1, (-1.0f) };
        double double13 = tTestImpl1.homoscedasticT(doubleArray7, doubleArray12);
        org.apache.commons.math.distribution.TDistribution tDistribution14 = null;
        tTestImpl1.setDistribution(tDistribution14);
        org.apache.commons.math.distribution.TDistribution tDistribution16 = null;
        tTestImpl1.setDistribution(tDistribution16);
        org.apache.commons.math.distribution.TDistribution tDistribution18 = null;
        tTestImpl1.setDistribution(tDistribution18);
        org.apache.commons.math.distribution.TDistribution tDistribution21 = null;
        org.apache.commons.math.stat.inference.TTestImpl tTestImpl22 = new org.apache.commons.math.stat.inference.TTestImpl(tDistribution21);
        org.apache.commons.math.distribution.TDistribution tDistribution23 = null;
        tTestImpl22.setDistribution(tDistribution23);
        org.apache.commons.math.distribution.TDistribution tDistribution25 = null;
        org.apache.commons.math.stat.inference.TTestImpl tTestImpl26 = new org.apache.commons.math.stat.inference.TTestImpl(tDistribution25);
        double[] doubleArray32 = new double[] { 1.0f, (short) 1, 100.0f, 1, 0.0f };
        double[] doubleArray37 = new double[] { ' ', (byte) 100, (byte) 1, (-1.0f) };
        double double38 = tTestImpl26.homoscedasticT(doubleArray32, doubleArray37);
        org.apache.commons.math.stat.inference.TTestImpl tTestImpl39 = new org.apache.commons.math.stat.inference.TTestImpl();
        double[] doubleArray43 = new double[] { '4', 'a', '4' };
        org.apache.commons.math.distribution.TDistribution tDistribution44 = null;
        org.apache.commons.math.stat.inference.TTestImpl tTestImpl45 = new org.apache.commons.math.stat.inference.TTestImpl(tDistribution44);
        double[] doubleArray51 = new double[] { 1.0f, (short) 1, 100.0f, 1, 0.0f };
        double[] doubleArray56 = new double[] { ' ', (byte) 100, (byte) 1, (-1.0f) };
        double double57 = tTestImpl45.homoscedasticT(doubleArray51, doubleArray56);
        double double58 = tTestImpl39.tTest(doubleArray43, doubleArray56);
        double double59 = tTestImpl22.homoscedasticT(doubleArray37, doubleArray43);
        org.apache.commons.math.distribution.TDistribution tDistribution61 = null;
        org.apache.commons.math.stat.inference.TTestImpl tTestImpl62 = new org.apache.commons.math.stat.inference.TTestImpl(tDistribution61);
        double[] doubleArray68 = new double[] { 1.0f, (short) 1, 100.0f, 1, 0.0f };
        double[] doubleArray73 = new double[] { ' ', (byte) 100, (byte) 1, (-1.0f) };
        double double74 = tTestImpl62.homoscedasticT(doubleArray68, doubleArray73);
        double double75 = tTestImpl22.t((-0.975807309953049d), doubleArray73);
        double double76 = tTestImpl1.t(0.0d, doubleArray73);
        org.apache.commons.math.distribution.TDistribution tDistribution77 = null;
        tTestImpl1.setDistribution(tDistribution77);
        org.apache.commons.math.stat.descriptive.StatisticalSummary statisticalSummary79 = null;
        org.apache.commons.math.stat.descriptive.StatisticalSummary statisticalSummary80 = null;
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean82 = tTestImpl1.tTest(statisticalSummary79, statisticalSummary80, (double) (byte) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: bad significance level: 100.0");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(doubleArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray7), "[1.0, 1.0, 100.0, 1.0, 0.0]");
        org.junit.Assert.assertNotNull(doubleArray12);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray12), "[32.0, 100.0, 1.0, -1.0]");
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + (-0.405429217622299d) + "'", double13 == (-0.405429217622299d));
        org.junit.Assert.assertNotNull(doubleArray32);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray32), "[1.0, 1.0, 100.0, 1.0, 0.0]");
        org.junit.Assert.assertNotNull(doubleArray37);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray37), "[32.0, 100.0, 1.0, -1.0]");
        org.junit.Assert.assertTrue("'" + double38 + "' != '" + (-0.405429217622299d) + "'", double38 == (-0.405429217622299d));
        org.junit.Assert.assertNotNull(doubleArray43);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray43), "[52.0, 97.0, 52.0]");
        org.junit.Assert.assertNotNull(doubleArray51);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray51), "[1.0, 1.0, 100.0, 1.0, 0.0]");
        org.junit.Assert.assertNotNull(doubleArray56);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray56), "[32.0, 100.0, 1.0, -1.0]");
        org.junit.Assert.assertTrue("'" + double57 + "' != '" + (-0.405429217622299d) + "'", double57 == (-0.405429217622299d));
        org.junit.Assert.assertTrue("'" + double58 + "' != '" + 0.2806531524060034d + "'", double58 == 0.2806531524060034d);
        org.junit.Assert.assertTrue("'" + double59 + "' != '" + (-1.1115227041167497d) + "'", double59 == (-1.1115227041167497d));
        org.junit.Assert.assertNotNull(doubleArray68);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray68), "[1.0, 1.0, 100.0, 1.0, 0.0]");
        org.junit.Assert.assertNotNull(doubleArray73);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray73), "[32.0, 100.0, 1.0, -1.0]");
        org.junit.Assert.assertTrue("'" + double74 + "' != '" + (-0.405429217622299d) + "'", double74 == (-0.405429217622299d));
        org.junit.Assert.assertTrue("'" + double75 + "' != '" + 1.4411111919348023d + "'", double75 == 1.4411111919348023d);
        org.junit.Assert.assertTrue("'" + double76 + "' != '" + 1.3997215400947067d + "'", double76 == 1.3997215400947067d);
    }

    @Test
    public void test3002() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3002");
        org.apache.commons.math.stat.inference.TTestImpl tTestImpl0 = new org.apache.commons.math.stat.inference.TTestImpl();
        org.apache.commons.math.distribution.TDistribution tDistribution2 = null;
        org.apache.commons.math.stat.inference.TTestImpl tTestImpl3 = new org.apache.commons.math.stat.inference.TTestImpl(tDistribution2);
        double[] doubleArray9 = new double[] { 1.0f, (short) 1, 100.0f, 1, 0.0f };
        double[] doubleArray14 = new double[] { ' ', (byte) 100, (byte) 1, (-1.0f) };
        double double15 = tTestImpl3.homoscedasticT(doubleArray9, doubleArray14);
        double double16 = tTestImpl0.tTest((double) (short) 100, doubleArray9);
        org.apache.commons.math.distribution.TDistribution tDistribution18 = null;
        org.apache.commons.math.stat.inference.TTestImpl tTestImpl19 = new org.apache.commons.math.stat.inference.TTestImpl(tDistribution18);
        double[] doubleArray25 = new double[] { 1.0f, (short) 1, 100.0f, 1, 0.0f };
        double[] doubleArray30 = new double[] { ' ', (byte) 100, (byte) 1, (-1.0f) };
        double double31 = tTestImpl19.homoscedasticT(doubleArray25, doubleArray30);
        double[] doubleArray39 = new double[] { 1, 100.0f, (-1), (short) 100, 100, (-1) };
        double double40 = tTestImpl19.t((double) '4', doubleArray39);
        double double41 = tTestImpl0.tTest((double) (short) 100, doubleArray39);
        org.apache.commons.math.stat.inference.TTestImpl tTestImpl42 = new org.apache.commons.math.stat.inference.TTestImpl();
        org.apache.commons.math.distribution.TDistribution tDistribution44 = null;
        org.apache.commons.math.stat.inference.TTestImpl tTestImpl45 = new org.apache.commons.math.stat.inference.TTestImpl(tDistribution44);
        double[] doubleArray51 = new double[] { 1.0f, (short) 1, 100.0f, 1, 0.0f };
        double[] doubleArray56 = new double[] { ' ', (byte) 100, (byte) 1, (-1.0f) };
        double double57 = tTestImpl45.homoscedasticT(doubleArray51, doubleArray56);
        double double58 = tTestImpl42.tTest((double) (short) 100, doubleArray51);
        org.apache.commons.math.distribution.TDistribution tDistribution60 = null;
        org.apache.commons.math.stat.inference.TTestImpl tTestImpl61 = new org.apache.commons.math.stat.inference.TTestImpl(tDistribution60);
        double[] doubleArray67 = new double[] { 1.0f, (short) 1, 100.0f, 1, 0.0f };
        double[] doubleArray72 = new double[] { ' ', (byte) 100, (byte) 1, (-1.0f) };
        double double73 = tTestImpl61.homoscedasticT(doubleArray67, doubleArray72);
        double[] doubleArray81 = new double[] { 1, 100.0f, (-1), (short) 100, 100, (-1) };
        double double82 = tTestImpl61.t((double) '4', doubleArray81);
        double double83 = tTestImpl42.tTest((double) (short) 100, doubleArray81);
        double[] doubleArray89 = new double[] { 1.0f, (-0.09656583816243881d), ' ', 0.8463073355328574d, 1.3965146696271626d };
        double double90 = tTestImpl0.homoscedasticTTest(doubleArray81, doubleArray89);
        org.apache.commons.math.distribution.TDistribution tDistribution91 = null;
        tTestImpl0.setDistribution(tDistribution91);
        org.apache.commons.math.stat.descriptive.StatisticalSummary statisticalSummary94 = null;
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean96 = tTestImpl0.tTest((-1.0000000000000002d), statisticalSummary94, (double) (short) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: bad significance level: 1.0");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(doubleArray9);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray9), "[1.0, 1.0, 100.0, 1.0, 0.0]");
        org.junit.Assert.assertNotNull(doubleArray14);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray14), "[32.0, 100.0, 1.0, -1.0]");
        org.junit.Assert.assertTrue("'" + double15 + "' != '" + (-0.405429217622299d) + "'", double15 == (-0.405429217622299d));
        org.junit.Assert.assertTrue("'" + double16 + "' != '" + 0.01613264369976175d + "'", double16 == 0.01613264369976175d);
        org.junit.Assert.assertNotNull(doubleArray25);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray25), "[1.0, 1.0, 100.0, 1.0, 0.0]");
        org.junit.Assert.assertNotNull(doubleArray30);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray30), "[32.0, 100.0, 1.0, -1.0]");
        org.junit.Assert.assertTrue("'" + double31 + "' != '" + (-0.405429217622299d) + "'", double31 == (-0.405429217622299d));
        org.junit.Assert.assertNotNull(doubleArray39);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray39), "[1.0, 100.0, -1.0, 100.0, 100.0, -1.0]");
        org.junit.Assert.assertTrue("'" + double40 + "' != '" + (-0.09656583816243881d) + "'", double40 == (-0.09656583816243881d));
        org.junit.Assert.assertTrue("'" + double41 + "' != '" + 0.07560555610353314d + "'", double41 == 0.07560555610353314d);
        org.junit.Assert.assertNotNull(doubleArray51);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray51), "[1.0, 1.0, 100.0, 1.0, 0.0]");
        org.junit.Assert.assertNotNull(doubleArray56);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray56), "[32.0, 100.0, 1.0, -1.0]");
        org.junit.Assert.assertTrue("'" + double57 + "' != '" + (-0.405429217622299d) + "'", double57 == (-0.405429217622299d));
        org.junit.Assert.assertTrue("'" + double58 + "' != '" + 0.01613264369976175d + "'", double58 == 0.01613264369976175d);
        org.junit.Assert.assertNotNull(doubleArray67);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray67), "[1.0, 1.0, 100.0, 1.0, 0.0]");
        org.junit.Assert.assertNotNull(doubleArray72);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray72), "[32.0, 100.0, 1.0, -1.0]");
        org.junit.Assert.assertTrue("'" + double73 + "' != '" + (-0.405429217622299d) + "'", double73 == (-0.405429217622299d));
        org.junit.Assert.assertNotNull(doubleArray81);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray81), "[1.0, 100.0, -1.0, 100.0, 100.0, -1.0]");
        org.junit.Assert.assertTrue("'" + double82 + "' != '" + (-0.09656583816243881d) + "'", double82 == (-0.09656583816243881d));
        org.junit.Assert.assertTrue("'" + double83 + "' != '" + 0.07560555610353314d + "'", double83 == 0.07560555610353314d);
        org.junit.Assert.assertNotNull(doubleArray89);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray89), "[1.0, -0.09656583816243881, 32.0, 0.8463073355328574, 1.3965146696271626]");
        org.junit.Assert.assertTrue("'" + double90 + "' != '" + 0.12673187601587688d + "'", double90 == 0.12673187601587688d);
    }

    @Test
    public void test3003() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3003");
        org.apache.commons.math.stat.inference.TTestImpl tTestImpl0 = new org.apache.commons.math.stat.inference.TTestImpl();
        org.apache.commons.math.distribution.TDistribution tDistribution1 = null;
        tTestImpl0.setDistribution(tDistribution1);
        org.apache.commons.math.distribution.TDistribution tDistribution3 = null;
        tTestImpl0.setDistribution(tDistribution3);
        org.apache.commons.math.distribution.TDistribution tDistribution5 = null;
        org.apache.commons.math.stat.inference.TTestImpl tTestImpl6 = new org.apache.commons.math.stat.inference.TTestImpl(tDistribution5);
        double[] doubleArray12 = new double[] { 1.0f, (short) 1, 100.0f, 1, 0.0f };
        double[] doubleArray17 = new double[] { ' ', (byte) 100, (byte) 1, (-1.0f) };
        double double18 = tTestImpl6.homoscedasticT(doubleArray12, doubleArray17);
        org.apache.commons.math.distribution.TDistribution tDistribution19 = null;
        tTestImpl6.setDistribution(tDistribution19);
        org.apache.commons.math.distribution.TDistribution tDistribution21 = null;
        tTestImpl6.setDistribution(tDistribution21);
        org.apache.commons.math.distribution.TDistribution tDistribution23 = null;
        tTestImpl6.setDistribution(tDistribution23);
        org.apache.commons.math.distribution.TDistribution tDistribution26 = null;
        org.apache.commons.math.stat.inference.TTestImpl tTestImpl27 = new org.apache.commons.math.stat.inference.TTestImpl(tDistribution26);
        org.apache.commons.math.distribution.TDistribution tDistribution28 = null;
        tTestImpl27.setDistribution(tDistribution28);
        org.apache.commons.math.distribution.TDistribution tDistribution30 = null;
        org.apache.commons.math.stat.inference.TTestImpl tTestImpl31 = new org.apache.commons.math.stat.inference.TTestImpl(tDistribution30);
        double[] doubleArray37 = new double[] { 1.0f, (short) 1, 100.0f, 1, 0.0f };
        double[] doubleArray42 = new double[] { ' ', (byte) 100, (byte) 1, (-1.0f) };
        double double43 = tTestImpl31.homoscedasticT(doubleArray37, doubleArray42);
        org.apache.commons.math.stat.inference.TTestImpl tTestImpl44 = new org.apache.commons.math.stat.inference.TTestImpl();
        double[] doubleArray48 = new double[] { '4', 'a', '4' };
        org.apache.commons.math.distribution.TDistribution tDistribution49 = null;
        org.apache.commons.math.stat.inference.TTestImpl tTestImpl50 = new org.apache.commons.math.stat.inference.TTestImpl(tDistribution49);
        double[] doubleArray56 = new double[] { 1.0f, (short) 1, 100.0f, 1, 0.0f };
        double[] doubleArray61 = new double[] { ' ', (byte) 100, (byte) 1, (-1.0f) };
        double double62 = tTestImpl50.homoscedasticT(doubleArray56, doubleArray61);
        double double63 = tTestImpl44.tTest(doubleArray48, doubleArray61);
        double double64 = tTestImpl27.homoscedasticT(doubleArray42, doubleArray48);
        org.apache.commons.math.distribution.TDistribution tDistribution66 = null;
        org.apache.commons.math.stat.inference.TTestImpl tTestImpl67 = new org.apache.commons.math.stat.inference.TTestImpl(tDistribution66);
        double[] doubleArray73 = new double[] { 1.0f, (short) 1, 100.0f, 1, 0.0f };
        double[] doubleArray78 = new double[] { ' ', (byte) 100, (byte) 1, (-1.0f) };
        double double79 = tTestImpl67.homoscedasticT(doubleArray73, doubleArray78);
        double double80 = tTestImpl27.t((-0.975807309953049d), doubleArray78);
        double double81 = tTestImpl6.t(0.0d, doubleArray78);
        org.apache.commons.math.distribution.TDistribution tDistribution82 = null;
        org.apache.commons.math.stat.inference.TTestImpl tTestImpl83 = new org.apache.commons.math.stat.inference.TTestImpl(tDistribution82);
        double[] doubleArray89 = new double[] { 1.0f, (short) 1, 100.0f, 1, 0.0f };
        double[] doubleArray94 = new double[] { ' ', (byte) 100, (byte) 1, (-1.0f) };
        double double95 = tTestImpl83.homoscedasticT(doubleArray89, doubleArray94);
        double double96 = tTestImpl0.homoscedasticT(doubleArray78, doubleArray89);
        org.apache.commons.math.stat.descriptive.StatisticalSummary statisticalSummary97 = null;
        org.apache.commons.math.stat.descriptive.StatisticalSummary statisticalSummary98 = null;
        // The following exception was thrown during execution in test generation
        try {
            double double99 = tTestImpl0.homoscedasticTTest(statisticalSummary97, statisticalSummary98);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: insufficient data for t statistic");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(doubleArray12);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray12), "[1.0, 1.0, 100.0, 1.0, 0.0]");
        org.junit.Assert.assertNotNull(doubleArray17);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray17), "[32.0, 100.0, 1.0, -1.0]");
        org.junit.Assert.assertTrue("'" + double18 + "' != '" + (-0.405429217622299d) + "'", double18 == (-0.405429217622299d));
        org.junit.Assert.assertNotNull(doubleArray37);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray37), "[1.0, 1.0, 100.0, 1.0, 0.0]");
        org.junit.Assert.assertNotNull(doubleArray42);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray42), "[32.0, 100.0, 1.0, -1.0]");
        org.junit.Assert.assertTrue("'" + double43 + "' != '" + (-0.405429217622299d) + "'", double43 == (-0.405429217622299d));
        org.junit.Assert.assertNotNull(doubleArray48);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray48), "[52.0, 97.0, 52.0]");
        org.junit.Assert.assertNotNull(doubleArray56);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray56), "[1.0, 1.0, 100.0, 1.0, 0.0]");
        org.junit.Assert.assertNotNull(doubleArray61);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray61), "[32.0, 100.0, 1.0, -1.0]");
        org.junit.Assert.assertTrue("'" + double62 + "' != '" + (-0.405429217622299d) + "'", double62 == (-0.405429217622299d));
        org.junit.Assert.assertTrue("'" + double63 + "' != '" + 0.2806531524060034d + "'", double63 == 0.2806531524060034d);
        org.junit.Assert.assertTrue("'" + double64 + "' != '" + (-1.1115227041167497d) + "'", double64 == (-1.1115227041167497d));
        org.junit.Assert.assertNotNull(doubleArray73);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray73), "[1.0, 1.0, 100.0, 1.0, 0.0]");
        org.junit.Assert.assertNotNull(doubleArray78);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray78), "[32.0, 100.0, 1.0, -1.0]");
        org.junit.Assert.assertTrue("'" + double79 + "' != '" + (-0.405429217622299d) + "'", double79 == (-0.405429217622299d));
        org.junit.Assert.assertTrue("'" + double80 + "' != '" + 1.4411111919348023d + "'", double80 == 1.4411111919348023d);
        org.junit.Assert.assertTrue("'" + double81 + "' != '" + 1.3997215400947067d + "'", double81 == 1.3997215400947067d);
        org.junit.Assert.assertNotNull(doubleArray89);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray89), "[1.0, 1.0, 100.0, 1.0, 0.0]");
        org.junit.Assert.assertNotNull(doubleArray94);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray94), "[32.0, 100.0, 1.0, -1.0]");
        org.junit.Assert.assertTrue("'" + double95 + "' != '" + (-0.405429217622299d) + "'", double95 == (-0.405429217622299d));
        org.junit.Assert.assertTrue("'" + double96 + "' != '" + 0.405429217622299d + "'", double96 == 0.405429217622299d);
    }

    @Test
    public void test3004() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3004");
        org.apache.commons.math.stat.inference.TTestImpl tTestImpl0 = new org.apache.commons.math.stat.inference.TTestImpl();
        org.apache.commons.math.distribution.TDistribution tDistribution1 = null;
        tTestImpl0.setDistribution(tDistribution1);
        org.apache.commons.math.distribution.TDistribution tDistribution3 = null;
        tTestImpl0.setDistribution(tDistribution3);
        org.apache.commons.math.distribution.TDistribution tDistribution6 = null;
        org.apache.commons.math.stat.inference.TTestImpl tTestImpl7 = new org.apache.commons.math.stat.inference.TTestImpl(tDistribution6);
        double[] doubleArray13 = new double[] { 1.0f, (short) 1, 100.0f, 1, 0.0f };
        double[] doubleArray18 = new double[] { ' ', (byte) 100, (byte) 1, (-1.0f) };
        double double19 = tTestImpl7.homoscedasticT(doubleArray13, doubleArray18);
        double double20 = tTestImpl0.t(3.8d, doubleArray13);
        org.apache.commons.math.distribution.TDistribution tDistribution21 = null;
        tTestImpl0.setDistribution(tDistribution21);
        org.apache.commons.math.distribution.TDistribution tDistribution23 = null;
        tTestImpl0.setDistribution(tDistribution23);
        org.apache.commons.math.distribution.TDistribution tDistribution25 = null;
        tTestImpl0.setDistribution(tDistribution25);
        org.apache.commons.math.distribution.TDistribution tDistribution27 = null;
        tTestImpl0.setDistribution(tDistribution27);
        org.apache.commons.math.stat.inference.TTestImpl tTestImpl30 = new org.apache.commons.math.stat.inference.TTestImpl();
        org.apache.commons.math.stat.inference.TTestImpl tTestImpl32 = new org.apache.commons.math.stat.inference.TTestImpl();
        double[] doubleArray36 = new double[] { '4', 'a', '4' };
        org.apache.commons.math.distribution.TDistribution tDistribution37 = null;
        org.apache.commons.math.stat.inference.TTestImpl tTestImpl38 = new org.apache.commons.math.stat.inference.TTestImpl(tDistribution37);
        double[] doubleArray44 = new double[] { 1.0f, (short) 1, 100.0f, 1, 0.0f };
        double[] doubleArray49 = new double[] { ' ', (byte) 100, (byte) 1, (-1.0f) };
        double double50 = tTestImpl38.homoscedasticT(doubleArray44, doubleArray49);
        double double51 = tTestImpl32.tTest(doubleArray36, doubleArray49);
        org.apache.commons.math.distribution.TDistribution tDistribution52 = null;
        tTestImpl32.setDistribution(tDistribution52);
        org.apache.commons.math.distribution.TDistribution tDistribution54 = null;
        org.apache.commons.math.stat.inference.TTestImpl tTestImpl55 = new org.apache.commons.math.stat.inference.TTestImpl(tDistribution54);
        double[] doubleArray61 = new double[] { 1.0f, (short) 1, 100.0f, 1, 0.0f };
        double[] doubleArray66 = new double[] { ' ', (byte) 100, (byte) 1, (-1.0f) };
        double double67 = tTestImpl55.homoscedasticT(doubleArray61, doubleArray66);
        double[] doubleArray75 = new double[] { 1, 100.0f, (-1), (short) 100, 100, (-1) };
        double double76 = tTestImpl55.t((double) '4', doubleArray75);
        org.apache.commons.math.distribution.TDistribution tDistribution77 = null;
        org.apache.commons.math.stat.inference.TTestImpl tTestImpl78 = new org.apache.commons.math.stat.inference.TTestImpl(tDistribution77);
        double[] doubleArray84 = new double[] { 1.0f, (short) 1, 100.0f, 1, 0.0f };
        double[] doubleArray89 = new double[] { ' ', (byte) 100, (byte) 1, (-1.0f) };
        double double90 = tTestImpl78.homoscedasticT(doubleArray84, doubleArray89);
        double double91 = tTestImpl32.t(doubleArray75, doubleArray89);
        boolean boolean93 = tTestImpl30.tTest((double) (short) 1, doubleArray89, 0.405429217622299d);
        double double94 = tTestImpl0.t((-1.587268255506484d), doubleArray89);
        org.junit.Assert.assertNotNull(doubleArray13);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray13), "[1.0, 1.0, 100.0, 1.0, 0.0]");
        org.junit.Assert.assertNotNull(doubleArray18);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray18), "[32.0, 100.0, 1.0, -1.0]");
        org.junit.Assert.assertTrue("'" + double19 + "' != '" + (-0.405429217622299d) + "'", double19 == (-0.405429217622299d));
        org.junit.Assert.assertTrue("'" + double20 + "' != '" + 0.8463073355328574d + "'", double20 == 0.8463073355328574d);
        org.junit.Assert.assertNotNull(doubleArray36);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray36), "[52.0, 97.0, 52.0]");
        org.junit.Assert.assertNotNull(doubleArray44);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray44), "[1.0, 1.0, 100.0, 1.0, 0.0]");
        org.junit.Assert.assertNotNull(doubleArray49);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray49), "[32.0, 100.0, 1.0, -1.0]");
        org.junit.Assert.assertTrue("'" + double50 + "' != '" + (-0.405429217622299d) + "'", double50 == (-0.405429217622299d));
        org.junit.Assert.assertTrue("'" + double51 + "' != '" + 0.2806531524060034d + "'", double51 == 0.2806531524060034d);
        org.junit.Assert.assertNotNull(doubleArray61);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray61), "[1.0, 1.0, 100.0, 1.0, 0.0]");
        org.junit.Assert.assertNotNull(doubleArray66);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray66), "[32.0, 100.0, 1.0, -1.0]");
        org.junit.Assert.assertTrue("'" + double67 + "' != '" + (-0.405429217622299d) + "'", double67 == (-0.405429217622299d));
        org.junit.Assert.assertNotNull(doubleArray75);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray75), "[1.0, 100.0, -1.0, 100.0, 100.0, -1.0]");
        org.junit.Assert.assertTrue("'" + double76 + "' != '" + (-0.09656583816243881d) + "'", double76 == (-0.09656583816243881d));
        org.junit.Assert.assertNotNull(doubleArray84);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray84), "[1.0, 1.0, 100.0, 1.0, 0.0]");
        org.junit.Assert.assertNotNull(doubleArray89);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray89), "[32.0, 100.0, 1.0, -1.0]");
        org.junit.Assert.assertTrue("'" + double90 + "' != '" + (-0.405429217622299d) + "'", double90 == (-0.405429217622299d));
        org.junit.Assert.assertTrue("'" + double91 + "' != '" + 0.5172120199559697d + "'", double91 == 0.5172120199559697d);
        org.junit.Assert.assertTrue("'" + boolean93 + "' != '" + true + "'", boolean93 == true);
        org.junit.Assert.assertTrue("'" + double94 + "' != '" + 1.4670467997050394d + "'", double94 == 1.4670467997050394d);
    }

    @Test
    public void test3005() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3005");
        org.apache.commons.math.stat.inference.TTestImpl tTestImpl0 = new org.apache.commons.math.stat.inference.TTestImpl();
        org.apache.commons.math.distribution.TDistribution tDistribution2 = null;
        org.apache.commons.math.stat.inference.TTestImpl tTestImpl3 = new org.apache.commons.math.stat.inference.TTestImpl(tDistribution2);
        double[] doubleArray9 = new double[] { 1.0f, (short) 1, 100.0f, 1, 0.0f };
        double[] doubleArray14 = new double[] { ' ', (byte) 100, (byte) 1, (-1.0f) };
        double double15 = tTestImpl3.homoscedasticT(doubleArray9, doubleArray14);
        double double16 = tTestImpl0.tTest((double) (short) 100, doubleArray9);
        org.apache.commons.math.distribution.TDistribution tDistribution18 = null;
        org.apache.commons.math.stat.inference.TTestImpl tTestImpl19 = new org.apache.commons.math.stat.inference.TTestImpl(tDistribution18);
        double[] doubleArray25 = new double[] { 1.0f, (short) 1, 100.0f, 1, 0.0f };
        double[] doubleArray30 = new double[] { ' ', (byte) 100, (byte) 1, (-1.0f) };
        double double31 = tTestImpl19.homoscedasticT(doubleArray25, doubleArray30);
        double[] doubleArray39 = new double[] { 1, 100.0f, (-1), (short) 100, 100, (-1) };
        double double40 = tTestImpl19.t((double) '4', doubleArray39);
        double double41 = tTestImpl0.tTest((double) (short) 100, doubleArray39);
        double[] doubleArray48 = new double[] { (byte) -1, (-1), 0.0f, 1.0d, (-1.0f) };
        double double49 = tTestImpl0.tTest(0.405429217622299d, doubleArray48);
        double[] doubleArray57 = new double[] { 10L, 0.9566618438474437d, 1.0f, 0.15639940166959065d, (short) 0, 0.15639940166959065d };
        double double58 = tTestImpl0.tTest(10.0d, doubleArray57);
        org.apache.commons.math.distribution.TDistribution tDistribution59 = null;
        tTestImpl0.setDistribution(tDistribution59);
        org.apache.commons.math.distribution.TDistribution tDistribution61 = null;
        tTestImpl0.setDistribution(tDistribution61);
        org.apache.commons.math.stat.descriptive.StatisticalSummary statisticalSummary64 = null;
        // The following exception was thrown during execution in test generation
        try {
            double double65 = tTestImpl0.tTest((-1.0000000000000002d), statisticalSummary64);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: insufficient data for t statistic");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(doubleArray9);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray9), "[1.0, 1.0, 100.0, 1.0, 0.0]");
        org.junit.Assert.assertNotNull(doubleArray14);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray14), "[32.0, 100.0, 1.0, -1.0]");
        org.junit.Assert.assertTrue("'" + double15 + "' != '" + (-0.405429217622299d) + "'", double15 == (-0.405429217622299d));
        org.junit.Assert.assertTrue("'" + double16 + "' != '" + 0.01613264369976175d + "'", double16 == 0.01613264369976175d);
        org.junit.Assert.assertNotNull(doubleArray25);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray25), "[1.0, 1.0, 100.0, 1.0, 0.0]");
        org.junit.Assert.assertNotNull(doubleArray30);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray30), "[32.0, 100.0, 1.0, -1.0]");
        org.junit.Assert.assertTrue("'" + double31 + "' != '" + (-0.405429217622299d) + "'", double31 == (-0.405429217622299d));
        org.junit.Assert.assertNotNull(doubleArray39);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray39), "[1.0, 100.0, -1.0, 100.0, 100.0, -1.0]");
        org.junit.Assert.assertTrue("'" + double40 + "' != '" + (-0.09656583816243881d) + "'", double40 == (-0.09656583816243881d));
        org.junit.Assert.assertTrue("'" + double41 + "' != '" + 0.07560555610353314d + "'", double41 == 0.07560555610353314d);
        org.junit.Assert.assertNotNull(doubleArray48);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray48), "[-1.0, -1.0, 0.0, 1.0, -1.0]");
        org.junit.Assert.assertTrue("'" + double49 + "' != '" + 0.1143321549278642d + "'", double49 == 0.1143321549278642d);
        org.junit.Assert.assertNotNull(doubleArray57);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray57), "[10.0, 0.9566618438474437, 1.0, 0.15639940166959065, 0.0, 0.15639940166959065]");
        org.junit.Assert.assertTrue("'" + double58 + "' != '" + 0.004213458414249471d + "'", double58 == 0.004213458414249471d);
    }

    @Test
    public void test3006() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3006");
        org.apache.commons.math.stat.inference.TTestImpl tTestImpl0 = new org.apache.commons.math.stat.inference.TTestImpl();
        double[] doubleArray4 = new double[] { '4', 'a', '4' };
        org.apache.commons.math.distribution.TDistribution tDistribution5 = null;
        org.apache.commons.math.stat.inference.TTestImpl tTestImpl6 = new org.apache.commons.math.stat.inference.TTestImpl(tDistribution5);
        double[] doubleArray12 = new double[] { 1.0f, (short) 1, 100.0f, 1, 0.0f };
        double[] doubleArray17 = new double[] { ' ', (byte) 100, (byte) 1, (-1.0f) };
        double double18 = tTestImpl6.homoscedasticT(doubleArray12, doubleArray17);
        double double19 = tTestImpl0.tTest(doubleArray4, doubleArray17);
        org.apache.commons.math.distribution.TDistribution tDistribution20 = null;
        tTestImpl0.setDistribution(tDistribution20);
        org.apache.commons.math.distribution.TDistribution tDistribution23 = null;
        org.apache.commons.math.stat.inference.TTestImpl tTestImpl24 = new org.apache.commons.math.stat.inference.TTestImpl(tDistribution23);
        double[] doubleArray30 = new double[] { 1.0f, (short) 1, 100.0f, 1, 0.0f };
        double[] doubleArray35 = new double[] { ' ', (byte) 100, (byte) 1, (-1.0f) };
        double double36 = tTestImpl24.homoscedasticT(doubleArray30, doubleArray35);
        org.apache.commons.math.stat.inference.TTestImpl tTestImpl38 = new org.apache.commons.math.stat.inference.TTestImpl();
        org.apache.commons.math.distribution.TDistribution tDistribution40 = null;
        org.apache.commons.math.stat.inference.TTestImpl tTestImpl41 = new org.apache.commons.math.stat.inference.TTestImpl(tDistribution40);
        double[] doubleArray47 = new double[] { 1.0f, (short) 1, 100.0f, 1, 0.0f };
        double[] doubleArray52 = new double[] { ' ', (byte) 100, (byte) 1, (-1.0f) };
        double double53 = tTestImpl41.homoscedasticT(doubleArray47, doubleArray52);
        double double54 = tTestImpl38.tTest((double) (short) 100, doubleArray47);
        double double55 = tTestImpl24.t((double) 10.0f, doubleArray47);
        double double56 = tTestImpl0.t((-1.0000000000000002d), doubleArray47);
        java.lang.Class<?> wildcardClass57 = doubleArray47.getClass();
        org.junit.Assert.assertNotNull(doubleArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray4), "[52.0, 97.0, 52.0]");
        org.junit.Assert.assertNotNull(doubleArray12);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray12), "[1.0, 1.0, 100.0, 1.0, 0.0]");
        org.junit.Assert.assertNotNull(doubleArray17);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray17), "[32.0, 100.0, 1.0, -1.0]");
        org.junit.Assert.assertTrue("'" + double18 + "' != '" + (-0.405429217622299d) + "'", double18 == (-0.405429217622299d));
        org.junit.Assert.assertTrue("'" + double19 + "' != '" + 0.2806531524060034d + "'", double19 == 0.2806531524060034d);
        org.junit.Assert.assertNotNull(doubleArray30);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray30), "[1.0, 1.0, 100.0, 1.0, 0.0]");
        org.junit.Assert.assertNotNull(doubleArray35);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray35), "[32.0, 100.0, 1.0, -1.0]");
        org.junit.Assert.assertTrue("'" + double36 + "' != '" + (-0.405429217622299d) + "'", double36 == (-0.405429217622299d));
        org.junit.Assert.assertNotNull(doubleArray47);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray47), "[1.0, 1.0, 100.0, 1.0, 0.0]");
        org.junit.Assert.assertNotNull(doubleArray52);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray52), "[32.0, 100.0, 1.0, -1.0]");
        org.junit.Assert.assertTrue("'" + double53 + "' != '" + (-0.405429217622299d) + "'", double53 == (-0.405429217622299d));
        org.junit.Assert.assertTrue("'" + double54 + "' != '" + 0.01613264369976175d + "'", double54 == 0.01613264369976175d);
        org.junit.Assert.assertTrue("'" + double55 + "' != '" + 0.5339796283719219d + "'", double55 == 0.5339796283719219d);
        org.junit.Assert.assertTrue("'" + double56 + "' != '" + 1.088109431399388d + "'", double56 == 1.088109431399388d);
        org.junit.Assert.assertNotNull(wildcardClass57);
    }

    @Test
    public void test3007() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3007");
        org.apache.commons.math.stat.inference.TTestImpl tTestImpl0 = new org.apache.commons.math.stat.inference.TTestImpl();
        org.apache.commons.math.distribution.TDistribution tDistribution2 = null;
        org.apache.commons.math.stat.inference.TTestImpl tTestImpl3 = new org.apache.commons.math.stat.inference.TTestImpl(tDistribution2);
        double[] doubleArray9 = new double[] { 1.0f, (short) 1, 100.0f, 1, 0.0f };
        double[] doubleArray14 = new double[] { ' ', (byte) 100, (byte) 1, (-1.0f) };
        double double15 = tTestImpl3.homoscedasticT(doubleArray9, doubleArray14);
        double double16 = tTestImpl0.tTest((double) (short) 100, doubleArray9);
        org.apache.commons.math.distribution.TDistribution tDistribution18 = null;
        org.apache.commons.math.stat.inference.TTestImpl tTestImpl19 = new org.apache.commons.math.stat.inference.TTestImpl(tDistribution18);
        double[] doubleArray25 = new double[] { 1.0f, (short) 1, 100.0f, 1, 0.0f };
        double[] doubleArray30 = new double[] { ' ', (byte) 100, (byte) 1, (-1.0f) };
        double double31 = tTestImpl19.homoscedasticT(doubleArray25, doubleArray30);
        double[] doubleArray39 = new double[] { 1, 100.0f, (-1), (short) 100, 100, (-1) };
        double double40 = tTestImpl19.t((double) '4', doubleArray39);
        double double41 = tTestImpl0.tTest((double) (short) 100, doubleArray39);
        org.apache.commons.math.distribution.TDistribution tDistribution43 = null;
        org.apache.commons.math.stat.inference.TTestImpl tTestImpl44 = new org.apache.commons.math.stat.inference.TTestImpl(tDistribution43);
        double[] doubleArray50 = new double[] { 1.0f, (short) 1, 100.0f, 1, 0.0f };
        double[] doubleArray55 = new double[] { ' ', (byte) 100, (byte) 1, (-1.0f) };
        double double56 = tTestImpl44.homoscedasticT(doubleArray50, doubleArray55);
        double double57 = tTestImpl0.tTest((double) (byte) 1, doubleArray50);
        org.apache.commons.math.distribution.TDistribution tDistribution58 = null;
        tTestImpl0.setDistribution(tDistribution58);
        org.apache.commons.math.distribution.TDistribution tDistribution60 = null;
        tTestImpl0.setDistribution(tDistribution60);
        org.apache.commons.math.distribution.TDistribution tDistribution63 = null;
        org.apache.commons.math.stat.inference.TTestImpl tTestImpl64 = new org.apache.commons.math.stat.inference.TTestImpl(tDistribution63);
        double[] doubleArray70 = new double[] { 1.0f, (short) 1, 100.0f, 1, 0.0f };
        double[] doubleArray75 = new double[] { ' ', (byte) 100, (byte) 1, (-1.0f) };
        double double76 = tTestImpl64.homoscedasticT(doubleArray70, doubleArray75);
        double double77 = tTestImpl0.t((double) 0, doubleArray75);
        org.apache.commons.math.distribution.TDistribution tDistribution78 = null;
        tTestImpl0.setDistribution(tDistribution78);
        org.apache.commons.math.distribution.TDistribution tDistribution80 = null;
        tTestImpl0.setDistribution(tDistribution80);
        org.apache.commons.math.stat.descriptive.StatisticalSummary statisticalSummary83 = null;
        // The following exception was thrown during execution in test generation
        try {
            double double84 = tTestImpl0.tTest(0.1143321549278642d, statisticalSummary83);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: insufficient data for t statistic");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(doubleArray9);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray9), "[1.0, 1.0, 100.0, 1.0, 0.0]");
        org.junit.Assert.assertNotNull(doubleArray14);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray14), "[32.0, 100.0, 1.0, -1.0]");
        org.junit.Assert.assertTrue("'" + double15 + "' != '" + (-0.405429217622299d) + "'", double15 == (-0.405429217622299d));
        org.junit.Assert.assertTrue("'" + double16 + "' != '" + 0.01613264369976175d + "'", double16 == 0.01613264369976175d);
        org.junit.Assert.assertNotNull(doubleArray25);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray25), "[1.0, 1.0, 100.0, 1.0, 0.0]");
        org.junit.Assert.assertNotNull(doubleArray30);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray30), "[32.0, 100.0, 1.0, -1.0]");
        org.junit.Assert.assertTrue("'" + double31 + "' != '" + (-0.405429217622299d) + "'", double31 == (-0.405429217622299d));
        org.junit.Assert.assertNotNull(doubleArray39);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray39), "[1.0, 100.0, -1.0, 100.0, 100.0, -1.0]");
        org.junit.Assert.assertTrue("'" + double40 + "' != '" + (-0.09656583816243881d) + "'", double40 == (-0.09656583816243881d));
        org.junit.Assert.assertTrue("'" + double41 + "' != '" + 0.07560555610353314d + "'", double41 == 0.07560555610353314d);
        org.junit.Assert.assertNotNull(doubleArray50);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray50), "[1.0, 1.0, 100.0, 1.0, 0.0]");
        org.junit.Assert.assertNotNull(doubleArray55);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray55), "[32.0, 100.0, 1.0, -1.0]");
        org.junit.Assert.assertTrue("'" + double56 + "' != '" + (-0.405429217622299d) + "'", double56 == (-0.405429217622299d));
        org.junit.Assert.assertTrue("'" + double57 + "' != '" + 0.3793626154059051d + "'", double57 == 0.3793626154059051d);
        org.junit.Assert.assertNotNull(doubleArray70);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray70), "[1.0, 1.0, 100.0, 1.0, 0.0]");
        org.junit.Assert.assertNotNull(doubleArray75);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray75), "[32.0, 100.0, 1.0, -1.0]");
        org.junit.Assert.assertTrue("'" + double76 + "' != '" + (-0.405429217622299d) + "'", double76 == (-0.405429217622299d));
        org.junit.Assert.assertTrue("'" + double77 + "' != '" + 1.3997215400947067d + "'", double77 == 1.3997215400947067d);
    }

    @Test
    public void test3008() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3008");
        org.apache.commons.math.stat.inference.TTestImpl tTestImpl0 = new org.apache.commons.math.stat.inference.TTestImpl();
        double[] doubleArray4 = new double[] { '4', 'a', '4' };
        org.apache.commons.math.distribution.TDistribution tDistribution5 = null;
        org.apache.commons.math.stat.inference.TTestImpl tTestImpl6 = new org.apache.commons.math.stat.inference.TTestImpl(tDistribution5);
        double[] doubleArray12 = new double[] { 1.0f, (short) 1, 100.0f, 1, 0.0f };
        double[] doubleArray17 = new double[] { ' ', (byte) 100, (byte) 1, (-1.0f) };
        double double18 = tTestImpl6.homoscedasticT(doubleArray12, doubleArray17);
        double double19 = tTestImpl0.tTest(doubleArray4, doubleArray17);
        org.apache.commons.math.distribution.TDistribution tDistribution20 = null;
        tTestImpl0.setDistribution(tDistribution20);
        org.apache.commons.math.distribution.TDistribution tDistribution22 = null;
        tTestImpl0.setDistribution(tDistribution22);
        org.apache.commons.math.distribution.TDistribution tDistribution25 = null;
        org.apache.commons.math.stat.inference.TTestImpl tTestImpl26 = new org.apache.commons.math.stat.inference.TTestImpl(tDistribution25);
        org.apache.commons.math.distribution.TDistribution tDistribution28 = null;
        org.apache.commons.math.stat.inference.TTestImpl tTestImpl29 = new org.apache.commons.math.stat.inference.TTestImpl(tDistribution28);
        double[] doubleArray35 = new double[] { 1.0f, (short) 1, 100.0f, 1, 0.0f };
        double[] doubleArray40 = new double[] { ' ', (byte) 100, (byte) 1, (-1.0f) };
        double double41 = tTestImpl29.homoscedasticT(doubleArray35, doubleArray40);
        org.apache.commons.math.stat.inference.TTestImpl tTestImpl42 = new org.apache.commons.math.stat.inference.TTestImpl();
        double[] doubleArray46 = new double[] { '4', 'a', '4' };
        org.apache.commons.math.distribution.TDistribution tDistribution47 = null;
        org.apache.commons.math.stat.inference.TTestImpl tTestImpl48 = new org.apache.commons.math.stat.inference.TTestImpl(tDistribution47);
        double[] doubleArray54 = new double[] { 1.0f, (short) 1, 100.0f, 1, 0.0f };
        double[] doubleArray59 = new double[] { ' ', (byte) 100, (byte) 1, (-1.0f) };
        double double60 = tTestImpl48.homoscedasticT(doubleArray54, doubleArray59);
        double double61 = tTestImpl42.tTest(doubleArray46, doubleArray59);
        org.apache.commons.math.distribution.TDistribution tDistribution62 = null;
        org.apache.commons.math.stat.inference.TTestImpl tTestImpl63 = new org.apache.commons.math.stat.inference.TTestImpl(tDistribution62);
        double[] doubleArray69 = new double[] { 1.0f, (short) 1, 100.0f, 1, 0.0f };
        double[] doubleArray74 = new double[] { ' ', (byte) 100, (byte) 1, (-1.0f) };
        double double75 = tTestImpl63.homoscedasticT(doubleArray69, doubleArray74);
        double double76 = tTestImpl29.t(doubleArray59, doubleArray74);
        double double77 = tTestImpl26.t((double) 10.0f, doubleArray74);
        double double78 = tTestImpl0.t(0.987358558121667d, doubleArray74);
        org.apache.commons.math.distribution.TDistribution tDistribution79 = null;
        tTestImpl0.setDistribution(tDistribution79);
        org.apache.commons.math.distribution.TDistribution tDistribution81 = null;
        tTestImpl0.setDistribution(tDistribution81);
        java.lang.Class<?> wildcardClass83 = tTestImpl0.getClass();
        org.junit.Assert.assertNotNull(doubleArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray4), "[52.0, 97.0, 52.0]");
        org.junit.Assert.assertNotNull(doubleArray12);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray12), "[1.0, 1.0, 100.0, 1.0, 0.0]");
        org.junit.Assert.assertNotNull(doubleArray17);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray17), "[32.0, 100.0, 1.0, -1.0]");
        org.junit.Assert.assertTrue("'" + double18 + "' != '" + (-0.405429217622299d) + "'", double18 == (-0.405429217622299d));
        org.junit.Assert.assertTrue("'" + double19 + "' != '" + 0.2806531524060034d + "'", double19 == 0.2806531524060034d);
        org.junit.Assert.assertNotNull(doubleArray35);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray35), "[1.0, 1.0, 100.0, 1.0, 0.0]");
        org.junit.Assert.assertNotNull(doubleArray40);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray40), "[32.0, 100.0, 1.0, -1.0]");
        org.junit.Assert.assertTrue("'" + double41 + "' != '" + (-0.405429217622299d) + "'", double41 == (-0.405429217622299d));
        org.junit.Assert.assertNotNull(doubleArray46);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray46), "[52.0, 97.0, 52.0]");
        org.junit.Assert.assertNotNull(doubleArray54);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray54), "[1.0, 1.0, 100.0, 1.0, 0.0]");
        org.junit.Assert.assertNotNull(doubleArray59);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray59), "[32.0, 100.0, 1.0, -1.0]");
        org.junit.Assert.assertTrue("'" + double60 + "' != '" + (-0.405429217622299d) + "'", double60 == (-0.405429217622299d));
        org.junit.Assert.assertTrue("'" + double61 + "' != '" + 0.2806531524060034d + "'", double61 == 0.2806531524060034d);
        org.junit.Assert.assertNotNull(doubleArray69);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray69), "[1.0, 1.0, 100.0, 1.0, 0.0]");
        org.junit.Assert.assertNotNull(doubleArray74);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray74), "[32.0, 100.0, 1.0, -1.0]");
        org.junit.Assert.assertTrue("'" + double75 + "' != '" + (-0.405429217622299d) + "'", double75 == (-0.405429217622299d));
        org.junit.Assert.assertTrue("'" + double76 + "' != '" + 0.0d + "'", double76 == 0.0d);
        org.junit.Assert.assertTrue("'" + double77 + "' != '" + 0.9755634976417653d + "'", double77 == 0.9755634976417653d);
        org.junit.Assert.assertTrue("'" + double78 + "' != '" + 1.357841932773502d + "'", double78 == 1.357841932773502d);
        org.junit.Assert.assertNotNull(wildcardClass83);
    }

    @Test
    public void test3009() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3009");
        org.apache.commons.math.distribution.TDistribution tDistribution0 = null;
        org.apache.commons.math.stat.inference.TTestImpl tTestImpl1 = new org.apache.commons.math.stat.inference.TTestImpl(tDistribution0);
        org.apache.commons.math.distribution.TDistribution tDistribution2 = null;
        tTestImpl1.setDistribution(tDistribution2);
        org.apache.commons.math.stat.inference.TTestImpl tTestImpl4 = new org.apache.commons.math.stat.inference.TTestImpl();
        org.apache.commons.math.distribution.TDistribution tDistribution6 = null;
        org.apache.commons.math.stat.inference.TTestImpl tTestImpl7 = new org.apache.commons.math.stat.inference.TTestImpl(tDistribution6);
        double[] doubleArray13 = new double[] { 1.0f, (short) 1, 100.0f, 1, 0.0f };
        double[] doubleArray18 = new double[] { ' ', (byte) 100, (byte) 1, (-1.0f) };
        double double19 = tTestImpl7.homoscedasticT(doubleArray13, doubleArray18);
        double double20 = tTestImpl4.tTest((double) (short) 100, doubleArray13);
        org.apache.commons.math.distribution.TDistribution tDistribution22 = null;
        org.apache.commons.math.stat.inference.TTestImpl tTestImpl23 = new org.apache.commons.math.stat.inference.TTestImpl(tDistribution22);
        double[] doubleArray29 = new double[] { 1.0f, (short) 1, 100.0f, 1, 0.0f };
        double[] doubleArray34 = new double[] { ' ', (byte) 100, (byte) 1, (-1.0f) };
        double double35 = tTestImpl23.homoscedasticT(doubleArray29, doubleArray34);
        double[] doubleArray43 = new double[] { 1, 100.0f, (-1), (short) 100, 100, (-1) };
        double double44 = tTestImpl23.t((double) '4', doubleArray43);
        double double45 = tTestImpl4.tTest((double) (short) 100, doubleArray43);
        org.apache.commons.math.distribution.TDistribution tDistribution47 = null;
        org.apache.commons.math.stat.inference.TTestImpl tTestImpl48 = new org.apache.commons.math.stat.inference.TTestImpl(tDistribution47);
        double[] doubleArray54 = new double[] { 1.0f, (short) 1, 100.0f, 1, 0.0f };
        double[] doubleArray59 = new double[] { ' ', (byte) 100, (byte) 1, (-1.0f) };
        double double60 = tTestImpl48.homoscedasticT(doubleArray54, doubleArray59);
        double double61 = tTestImpl4.tTest((double) (byte) 1, doubleArray54);
        org.apache.commons.math.distribution.TDistribution tDistribution62 = null;
        org.apache.commons.math.stat.inference.TTestImpl tTestImpl63 = new org.apache.commons.math.stat.inference.TTestImpl(tDistribution62);
        double[] doubleArray69 = new double[] { 1.0f, (short) 1, 100.0f, 1, 0.0f };
        double[] doubleArray74 = new double[] { ' ', (byte) 100, (byte) 1, (-1.0f) };
        double double75 = tTestImpl63.homoscedasticT(doubleArray69, doubleArray74);
        double[] doubleArray83 = new double[] { 1, 100.0f, (-1), (short) 100, 100, (-1) };
        double double84 = tTestImpl63.t((double) '4', doubleArray83);
        double double85 = tTestImpl1.t(doubleArray54, doubleArray83);
        org.apache.commons.math.distribution.TDistribution tDistribution86 = null;
        tTestImpl1.setDistribution(tDistribution86);
        org.apache.commons.math.distribution.TDistribution tDistribution88 = null;
        tTestImpl1.setDistribution(tDistribution88);
        org.junit.Assert.assertNotNull(doubleArray13);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray13), "[1.0, 1.0, 100.0, 1.0, 0.0]");
        org.junit.Assert.assertNotNull(doubleArray18);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray18), "[32.0, 100.0, 1.0, -1.0]");
        org.junit.Assert.assertTrue("'" + double19 + "' != '" + (-0.405429217622299d) + "'", double19 == (-0.405429217622299d));
        org.junit.Assert.assertTrue("'" + double20 + "' != '" + 0.01613264369976175d + "'", double20 == 0.01613264369976175d);
        org.junit.Assert.assertNotNull(doubleArray29);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray29), "[1.0, 1.0, 100.0, 1.0, 0.0]");
        org.junit.Assert.assertNotNull(doubleArray34);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray34), "[32.0, 100.0, 1.0, -1.0]");
        org.junit.Assert.assertTrue("'" + double35 + "' != '" + (-0.405429217622299d) + "'", double35 == (-0.405429217622299d));
        org.junit.Assert.assertNotNull(doubleArray43);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray43), "[1.0, 100.0, -1.0, 100.0, 100.0, -1.0]");
        org.junit.Assert.assertTrue("'" + double44 + "' != '" + (-0.09656583816243881d) + "'", double44 == (-0.09656583816243881d));
        org.junit.Assert.assertTrue("'" + double45 + "' != '" + 0.07560555610353314d + "'", double45 == 0.07560555610353314d);
        org.junit.Assert.assertNotNull(doubleArray54);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray54), "[1.0, 1.0, 100.0, 1.0, 0.0]");
        org.junit.Assert.assertNotNull(doubleArray59);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray59), "[32.0, 100.0, 1.0, -1.0]");
        org.junit.Assert.assertTrue("'" + double60 + "' != '" + (-0.405429217622299d) + "'", double60 == (-0.405429217622299d));
        org.junit.Assert.assertTrue("'" + double61 + "' != '" + 0.3793626154059051d + "'", double61 == 0.3793626154059051d);
        org.junit.Assert.assertNotNull(doubleArray69);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray69), "[1.0, 1.0, 100.0, 1.0, 0.0]");
        org.junit.Assert.assertNotNull(doubleArray74);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray74), "[32.0, 100.0, 1.0, -1.0]");
        org.junit.Assert.assertTrue("'" + double75 + "' != '" + (-0.405429217622299d) + "'", double75 == (-0.405429217622299d));
        org.junit.Assert.assertNotNull(doubleArray83);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray83), "[1.0, 100.0, -1.0, 100.0, 100.0, -1.0]");
        org.junit.Assert.assertTrue("'" + double84 + "' != '" + (-0.09656583816243881d) + "'", double84 == (-0.09656583816243881d));
        org.junit.Assert.assertTrue("'" + double85 + "' != '" + (-0.975807309953049d) + "'", double85 == (-0.975807309953049d));
    }

    @Test
    public void test3010() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3010");
        org.apache.commons.math.stat.inference.TTestImpl tTestImpl0 = new org.apache.commons.math.stat.inference.TTestImpl();
        double[] doubleArray4 = new double[] { '4', 'a', '4' };
        org.apache.commons.math.distribution.TDistribution tDistribution5 = null;
        org.apache.commons.math.stat.inference.TTestImpl tTestImpl6 = new org.apache.commons.math.stat.inference.TTestImpl(tDistribution5);
        double[] doubleArray12 = new double[] { 1.0f, (short) 1, 100.0f, 1, 0.0f };
        double[] doubleArray17 = new double[] { ' ', (byte) 100, (byte) 1, (-1.0f) };
        double double18 = tTestImpl6.homoscedasticT(doubleArray12, doubleArray17);
        double double19 = tTestImpl0.tTest(doubleArray4, doubleArray17);
        org.apache.commons.math.distribution.TDistribution tDistribution20 = null;
        tTestImpl0.setDistribution(tDistribution20);
        org.apache.commons.math.distribution.TDistribution tDistribution22 = null;
        tTestImpl0.setDistribution(tDistribution22);
        org.apache.commons.math.distribution.TDistribution tDistribution25 = null;
        org.apache.commons.math.stat.inference.TTestImpl tTestImpl26 = new org.apache.commons.math.stat.inference.TTestImpl(tDistribution25);
        org.apache.commons.math.distribution.TDistribution tDistribution27 = null;
        tTestImpl26.setDistribution(tDistribution27);
        org.apache.commons.math.distribution.TDistribution tDistribution29 = null;
        org.apache.commons.math.stat.inference.TTestImpl tTestImpl30 = new org.apache.commons.math.stat.inference.TTestImpl(tDistribution29);
        double[] doubleArray36 = new double[] { 1.0f, (short) 1, 100.0f, 1, 0.0f };
        double[] doubleArray41 = new double[] { ' ', (byte) 100, (byte) 1, (-1.0f) };
        double double42 = tTestImpl30.homoscedasticT(doubleArray36, doubleArray41);
        org.apache.commons.math.stat.inference.TTestImpl tTestImpl43 = new org.apache.commons.math.stat.inference.TTestImpl();
        double[] doubleArray47 = new double[] { '4', 'a', '4' };
        org.apache.commons.math.distribution.TDistribution tDistribution48 = null;
        org.apache.commons.math.stat.inference.TTestImpl tTestImpl49 = new org.apache.commons.math.stat.inference.TTestImpl(tDistribution48);
        double[] doubleArray55 = new double[] { 1.0f, (short) 1, 100.0f, 1, 0.0f };
        double[] doubleArray60 = new double[] { ' ', (byte) 100, (byte) 1, (-1.0f) };
        double double61 = tTestImpl49.homoscedasticT(doubleArray55, doubleArray60);
        double double62 = tTestImpl43.tTest(doubleArray47, doubleArray60);
        double double63 = tTestImpl26.homoscedasticT(doubleArray41, doubleArray47);
        double double64 = tTestImpl0.t((double) (byte) 100, doubleArray47);
        org.apache.commons.math.stat.descriptive.StatisticalSummary statisticalSummary66 = null;
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean68 = tTestImpl0.tTest(0.0d, statisticalSummary66, (double) '4');
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: bad significance level: 52.0");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(doubleArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray4), "[52.0, 97.0, 52.0]");
        org.junit.Assert.assertNotNull(doubleArray12);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray12), "[1.0, 1.0, 100.0, 1.0, 0.0]");
        org.junit.Assert.assertNotNull(doubleArray17);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray17), "[32.0, 100.0, 1.0, -1.0]");
        org.junit.Assert.assertTrue("'" + double18 + "' != '" + (-0.405429217622299d) + "'", double18 == (-0.405429217622299d));
        org.junit.Assert.assertTrue("'" + double19 + "' != '" + 0.2806531524060034d + "'", double19 == 0.2806531524060034d);
        org.junit.Assert.assertNotNull(doubleArray36);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray36), "[1.0, 1.0, 100.0, 1.0, 0.0]");
        org.junit.Assert.assertNotNull(doubleArray41);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray41), "[32.0, 100.0, 1.0, -1.0]");
        org.junit.Assert.assertTrue("'" + double42 + "' != '" + (-0.405429217622299d) + "'", double42 == (-0.405429217622299d));
        org.junit.Assert.assertNotNull(doubleArray47);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray47), "[52.0, 97.0, 52.0]");
        org.junit.Assert.assertNotNull(doubleArray55);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray55), "[1.0, 1.0, 100.0, 1.0, 0.0]");
        org.junit.Assert.assertNotNull(doubleArray60);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray60), "[32.0, 100.0, 1.0, -1.0]");
        org.junit.Assert.assertTrue("'" + double61 + "' != '" + (-0.405429217622299d) + "'", double61 == (-0.405429217622299d));
        org.junit.Assert.assertTrue("'" + double62 + "' != '" + 0.2806531524060034d + "'", double62 == 0.2806531524060034d);
        org.junit.Assert.assertTrue("'" + double63 + "' != '" + (-1.1115227041167497d) + "'", double63 == (-1.1115227041167497d));
        org.junit.Assert.assertTrue("'" + double64 + "' != '" + (-2.2d) + "'", double64 == (-2.2d));
    }

    @Test
    public void test3011() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3011");
        org.apache.commons.math.stat.inference.TTestImpl tTestImpl0 = new org.apache.commons.math.stat.inference.TTestImpl();
        org.apache.commons.math.distribution.TDistribution tDistribution2 = null;
        org.apache.commons.math.stat.inference.TTestImpl tTestImpl3 = new org.apache.commons.math.stat.inference.TTestImpl(tDistribution2);
        double[] doubleArray9 = new double[] { 1.0f, (short) 1, 100.0f, 1, 0.0f };
        double[] doubleArray14 = new double[] { ' ', (byte) 100, (byte) 1, (-1.0f) };
        double double15 = tTestImpl3.homoscedasticT(doubleArray9, doubleArray14);
        double double16 = tTestImpl0.tTest((double) (short) 100, doubleArray9);
        org.apache.commons.math.stat.inference.TTestImpl tTestImpl18 = new org.apache.commons.math.stat.inference.TTestImpl();
        double[] doubleArray22 = new double[] { '4', 'a', '4' };
        org.apache.commons.math.distribution.TDistribution tDistribution23 = null;
        org.apache.commons.math.stat.inference.TTestImpl tTestImpl24 = new org.apache.commons.math.stat.inference.TTestImpl(tDistribution23);
        double[] doubleArray30 = new double[] { 1.0f, (short) 1, 100.0f, 1, 0.0f };
        double[] doubleArray35 = new double[] { ' ', (byte) 100, (byte) 1, (-1.0f) };
        double double36 = tTestImpl24.homoscedasticT(doubleArray30, doubleArray35);
        double double37 = tTestImpl18.tTest(doubleArray22, doubleArray35);
        boolean boolean39 = tTestImpl0.tTest(1.357841932773502d, doubleArray22, 0.15639940166959065d);
        double[] doubleArray40 = null;
        org.apache.commons.math.distribution.TDistribution tDistribution41 = null;
        org.apache.commons.math.stat.inference.TTestImpl tTestImpl42 = new org.apache.commons.math.stat.inference.TTestImpl(tDistribution41);
        double[] doubleArray48 = new double[] { 1.0f, (short) 1, 100.0f, 1, 0.0f };
        double[] doubleArray53 = new double[] { ' ', (byte) 100, (byte) 1, (-1.0f) };
        double double54 = tTestImpl42.homoscedasticT(doubleArray48, doubleArray53);
        org.apache.commons.math.stat.inference.TTestImpl tTestImpl55 = new org.apache.commons.math.stat.inference.TTestImpl();
        double[] doubleArray59 = new double[] { '4', 'a', '4' };
        org.apache.commons.math.distribution.TDistribution tDistribution60 = null;
        org.apache.commons.math.stat.inference.TTestImpl tTestImpl61 = new org.apache.commons.math.stat.inference.TTestImpl(tDistribution60);
        double[] doubleArray67 = new double[] { 1.0f, (short) 1, 100.0f, 1, 0.0f };
        double[] doubleArray72 = new double[] { ' ', (byte) 100, (byte) 1, (-1.0f) };
        double double73 = tTestImpl61.homoscedasticT(doubleArray67, doubleArray72);
        double double74 = tTestImpl55.tTest(doubleArray59, doubleArray72);
        org.apache.commons.math.distribution.TDistribution tDistribution75 = null;
        org.apache.commons.math.stat.inference.TTestImpl tTestImpl76 = new org.apache.commons.math.stat.inference.TTestImpl(tDistribution75);
        double[] doubleArray82 = new double[] { 1.0f, (short) 1, 100.0f, 1, 0.0f };
        double[] doubleArray87 = new double[] { ' ', (byte) 100, (byte) 1, (-1.0f) };
        double double88 = tTestImpl76.homoscedasticT(doubleArray82, doubleArray87);
        double double89 = tTestImpl42.t(doubleArray72, doubleArray87);
        // The following exception was thrown during execution in test generation
        try {
            double double90 = tTestImpl0.t(doubleArray40, doubleArray72);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: insufficient data for t statistic");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(doubleArray9);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray9), "[1.0, 1.0, 100.0, 1.0, 0.0]");
        org.junit.Assert.assertNotNull(doubleArray14);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray14), "[32.0, 100.0, 1.0, -1.0]");
        org.junit.Assert.assertTrue("'" + double15 + "' != '" + (-0.405429217622299d) + "'", double15 == (-0.405429217622299d));
        org.junit.Assert.assertTrue("'" + double16 + "' != '" + 0.01613264369976175d + "'", double16 == 0.01613264369976175d);
        org.junit.Assert.assertNotNull(doubleArray22);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray22), "[52.0, 97.0, 52.0]");
        org.junit.Assert.assertNotNull(doubleArray30);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray30), "[1.0, 1.0, 100.0, 1.0, 0.0]");
        org.junit.Assert.assertNotNull(doubleArray35);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray35), "[32.0, 100.0, 1.0, -1.0]");
        org.junit.Assert.assertTrue("'" + double36 + "' != '" + (-0.405429217622299d) + "'", double36 == (-0.405429217622299d));
        org.junit.Assert.assertTrue("'" + double37 + "' != '" + 0.2806531524060034d + "'", double37 == 0.2806531524060034d);
        org.junit.Assert.assertTrue("'" + boolean39 + "' != '" + true + "'", boolean39 == true);
        org.junit.Assert.assertNotNull(doubleArray48);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray48), "[1.0, 1.0, 100.0, 1.0, 0.0]");
        org.junit.Assert.assertNotNull(doubleArray53);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray53), "[32.0, 100.0, 1.0, -1.0]");
        org.junit.Assert.assertTrue("'" + double54 + "' != '" + (-0.405429217622299d) + "'", double54 == (-0.405429217622299d));
        org.junit.Assert.assertNotNull(doubleArray59);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray59), "[52.0, 97.0, 52.0]");
        org.junit.Assert.assertNotNull(doubleArray67);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray67), "[1.0, 1.0, 100.0, 1.0, 0.0]");
        org.junit.Assert.assertNotNull(doubleArray72);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray72), "[32.0, 100.0, 1.0, -1.0]");
        org.junit.Assert.assertTrue("'" + double73 + "' != '" + (-0.405429217622299d) + "'", double73 == (-0.405429217622299d));
        org.junit.Assert.assertTrue("'" + double74 + "' != '" + 0.2806531524060034d + "'", double74 == 0.2806531524060034d);
        org.junit.Assert.assertNotNull(doubleArray82);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray82), "[1.0, 1.0, 100.0, 1.0, 0.0]");
        org.junit.Assert.assertNotNull(doubleArray87);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray87), "[32.0, 100.0, 1.0, -1.0]");
        org.junit.Assert.assertTrue("'" + double88 + "' != '" + (-0.405429217622299d) + "'", double88 == (-0.405429217622299d));
        org.junit.Assert.assertTrue("'" + double89 + "' != '" + 0.0d + "'", double89 == 0.0d);
    }

    @Test
    public void test3012() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3012");
        org.apache.commons.math.distribution.TDistribution tDistribution0 = null;
        org.apache.commons.math.stat.inference.TTestImpl tTestImpl1 = new org.apache.commons.math.stat.inference.TTestImpl(tDistribution0);
        org.apache.commons.math.distribution.TDistribution tDistribution3 = null;
        org.apache.commons.math.stat.inference.TTestImpl tTestImpl4 = new org.apache.commons.math.stat.inference.TTestImpl(tDistribution3);
        double[] doubleArray10 = new double[] { 1.0f, (short) 1, 100.0f, 1, 0.0f };
        double[] doubleArray15 = new double[] { ' ', (byte) 100, (byte) 1, (-1.0f) };
        double double16 = tTestImpl4.homoscedasticT(doubleArray10, doubleArray15);
        org.apache.commons.math.stat.inference.TTestImpl tTestImpl17 = new org.apache.commons.math.stat.inference.TTestImpl();
        double[] doubleArray21 = new double[] { '4', 'a', '4' };
        org.apache.commons.math.distribution.TDistribution tDistribution22 = null;
        org.apache.commons.math.stat.inference.TTestImpl tTestImpl23 = new org.apache.commons.math.stat.inference.TTestImpl(tDistribution22);
        double[] doubleArray29 = new double[] { 1.0f, (short) 1, 100.0f, 1, 0.0f };
        double[] doubleArray34 = new double[] { ' ', (byte) 100, (byte) 1, (-1.0f) };
        double double35 = tTestImpl23.homoscedasticT(doubleArray29, doubleArray34);
        double double36 = tTestImpl17.tTest(doubleArray21, doubleArray34);
        org.apache.commons.math.distribution.TDistribution tDistribution37 = null;
        org.apache.commons.math.stat.inference.TTestImpl tTestImpl38 = new org.apache.commons.math.stat.inference.TTestImpl(tDistribution37);
        double[] doubleArray44 = new double[] { 1.0f, (short) 1, 100.0f, 1, 0.0f };
        double[] doubleArray49 = new double[] { ' ', (byte) 100, (byte) 1, (-1.0f) };
        double double50 = tTestImpl38.homoscedasticT(doubleArray44, doubleArray49);
        double double51 = tTestImpl4.t(doubleArray34, doubleArray49);
        double double52 = tTestImpl1.t((double) 10.0f, doubleArray49);
        org.apache.commons.math.distribution.TDistribution tDistribution53 = null;
        tTestImpl1.setDistribution(tDistribution53);
        org.apache.commons.math.stat.inference.TTestImpl tTestImpl56 = new org.apache.commons.math.stat.inference.TTestImpl();
        double[] doubleArray60 = new double[] { '4', 'a', '4' };
        org.apache.commons.math.distribution.TDistribution tDistribution61 = null;
        org.apache.commons.math.stat.inference.TTestImpl tTestImpl62 = new org.apache.commons.math.stat.inference.TTestImpl(tDistribution61);
        double[] doubleArray68 = new double[] { 1.0f, (short) 1, 100.0f, 1, 0.0f };
        double[] doubleArray73 = new double[] { ' ', (byte) 100, (byte) 1, (-1.0f) };
        double double74 = tTestImpl62.homoscedasticT(doubleArray68, doubleArray73);
        double double75 = tTestImpl56.tTest(doubleArray60, doubleArray73);
        double double76 = tTestImpl1.t((double) 10L, doubleArray73);
        org.apache.commons.math.distribution.TDistribution tDistribution77 = null;
        tTestImpl1.setDistribution(tDistribution77);
        org.apache.commons.math.distribution.TDistribution tDistribution79 = null;
        tTestImpl1.setDistribution(tDistribution79);
        org.apache.commons.math.stat.descriptive.StatisticalSummary statisticalSummary82 = null;
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean84 = tTestImpl1.tTest((-2.2d), statisticalSummary82, 1.3385956498818976d);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: bad significance level: 1.3385956498818976");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(doubleArray10);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray10), "[1.0, 1.0, 100.0, 1.0, 0.0]");
        org.junit.Assert.assertNotNull(doubleArray15);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray15), "[32.0, 100.0, 1.0, -1.0]");
        org.junit.Assert.assertTrue("'" + double16 + "' != '" + (-0.405429217622299d) + "'", double16 == (-0.405429217622299d));
        org.junit.Assert.assertNotNull(doubleArray21);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray21), "[52.0, 97.0, 52.0]");
        org.junit.Assert.assertNotNull(doubleArray29);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray29), "[1.0, 1.0, 100.0, 1.0, 0.0]");
        org.junit.Assert.assertNotNull(doubleArray34);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray34), "[32.0, 100.0, 1.0, -1.0]");
        org.junit.Assert.assertTrue("'" + double35 + "' != '" + (-0.405429217622299d) + "'", double35 == (-0.405429217622299d));
        org.junit.Assert.assertTrue("'" + double36 + "' != '" + 0.2806531524060034d + "'", double36 == 0.2806531524060034d);
        org.junit.Assert.assertNotNull(doubleArray44);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray44), "[1.0, 1.0, 100.0, 1.0, 0.0]");
        org.junit.Assert.assertNotNull(doubleArray49);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray49), "[32.0, 100.0, 1.0, -1.0]");
        org.junit.Assert.assertTrue("'" + double50 + "' != '" + (-0.405429217622299d) + "'", double50 == (-0.405429217622299d));
        org.junit.Assert.assertTrue("'" + double51 + "' != '" + 0.0d + "'", double51 == 0.0d);
        org.junit.Assert.assertTrue("'" + double52 + "' != '" + 0.9755634976417653d + "'", double52 == 0.9755634976417653d);
        org.junit.Assert.assertNotNull(doubleArray60);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray60), "[52.0, 97.0, 52.0]");
        org.junit.Assert.assertNotNull(doubleArray68);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray68), "[1.0, 1.0, 100.0, 1.0, 0.0]");
        org.junit.Assert.assertNotNull(doubleArray73);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray73), "[32.0, 100.0, 1.0, -1.0]");
        org.junit.Assert.assertTrue("'" + double74 + "' != '" + (-0.405429217622299d) + "'", double74 == (-0.405429217622299d));
        org.junit.Assert.assertTrue("'" + double75 + "' != '" + 0.2806531524060034d + "'", double75 == 0.2806531524060034d);
        org.junit.Assert.assertTrue("'" + double76 + "' != '" + 0.9755634976417653d + "'", double76 == 0.9755634976417653d);
    }

    @Test
    public void test3013() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3013");
        org.apache.commons.math.stat.inference.TTestImpl tTestImpl0 = new org.apache.commons.math.stat.inference.TTestImpl();
        double[] doubleArray4 = new double[] { '4', 'a', '4' };
        org.apache.commons.math.distribution.TDistribution tDistribution5 = null;
        org.apache.commons.math.stat.inference.TTestImpl tTestImpl6 = new org.apache.commons.math.stat.inference.TTestImpl(tDistribution5);
        double[] doubleArray12 = new double[] { 1.0f, (short) 1, 100.0f, 1, 0.0f };
        double[] doubleArray17 = new double[] { ' ', (byte) 100, (byte) 1, (-1.0f) };
        double double18 = tTestImpl6.homoscedasticT(doubleArray12, doubleArray17);
        double double19 = tTestImpl0.tTest(doubleArray4, doubleArray17);
        org.apache.commons.math.distribution.TDistribution tDistribution20 = null;
        tTestImpl0.setDistribution(tDistribution20);
        org.apache.commons.math.distribution.TDistribution tDistribution22 = null;
        org.apache.commons.math.stat.inference.TTestImpl tTestImpl23 = new org.apache.commons.math.stat.inference.TTestImpl(tDistribution22);
        double[] doubleArray29 = new double[] { 1.0f, (short) 1, 100.0f, 1, 0.0f };
        double[] doubleArray34 = new double[] { ' ', (byte) 100, (byte) 1, (-1.0f) };
        double double35 = tTestImpl23.homoscedasticT(doubleArray29, doubleArray34);
        double[] doubleArray43 = new double[] { 1, 100.0f, (-1), (short) 100, 100, (-1) };
        double double44 = tTestImpl23.t((double) '4', doubleArray43);
        org.apache.commons.math.distribution.TDistribution tDistribution45 = null;
        org.apache.commons.math.stat.inference.TTestImpl tTestImpl46 = new org.apache.commons.math.stat.inference.TTestImpl(tDistribution45);
        double[] doubleArray52 = new double[] { 1.0f, (short) 1, 100.0f, 1, 0.0f };
        double[] doubleArray57 = new double[] { ' ', (byte) 100, (byte) 1, (-1.0f) };
        double double58 = tTestImpl46.homoscedasticT(doubleArray52, doubleArray57);
        double double59 = tTestImpl0.t(doubleArray43, doubleArray57);
        org.apache.commons.math.distribution.TDistribution tDistribution60 = null;
        tTestImpl0.setDistribution(tDistribution60);
        org.apache.commons.math.distribution.TDistribution tDistribution62 = null;
        tTestImpl0.setDistribution(tDistribution62);
        org.apache.commons.math.stat.descriptive.StatisticalSummary statisticalSummary65 = null;
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean67 = tTestImpl0.tTest(1.3997215400947067d, statisticalSummary65, (double) (-1L));
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: bad significance level: -1.0");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(doubleArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray4), "[52.0, 97.0, 52.0]");
        org.junit.Assert.assertNotNull(doubleArray12);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray12), "[1.0, 1.0, 100.0, 1.0, 0.0]");
        org.junit.Assert.assertNotNull(doubleArray17);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray17), "[32.0, 100.0, 1.0, -1.0]");
        org.junit.Assert.assertTrue("'" + double18 + "' != '" + (-0.405429217622299d) + "'", double18 == (-0.405429217622299d));
        org.junit.Assert.assertTrue("'" + double19 + "' != '" + 0.2806531524060034d + "'", double19 == 0.2806531524060034d);
        org.junit.Assert.assertNotNull(doubleArray29);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray29), "[1.0, 1.0, 100.0, 1.0, 0.0]");
        org.junit.Assert.assertNotNull(doubleArray34);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray34), "[32.0, 100.0, 1.0, -1.0]");
        org.junit.Assert.assertTrue("'" + double35 + "' != '" + (-0.405429217622299d) + "'", double35 == (-0.405429217622299d));
        org.junit.Assert.assertNotNull(doubleArray43);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray43), "[1.0, 100.0, -1.0, 100.0, 100.0, -1.0]");
        org.junit.Assert.assertTrue("'" + double44 + "' != '" + (-0.09656583816243881d) + "'", double44 == (-0.09656583816243881d));
        org.junit.Assert.assertNotNull(doubleArray52);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray52), "[1.0, 1.0, 100.0, 1.0, 0.0]");
        org.junit.Assert.assertNotNull(doubleArray57);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray57), "[32.0, 100.0, 1.0, -1.0]");
        org.junit.Assert.assertTrue("'" + double58 + "' != '" + (-0.405429217622299d) + "'", double58 == (-0.405429217622299d));
        org.junit.Assert.assertTrue("'" + double59 + "' != '" + 0.5172120199559697d + "'", double59 == 0.5172120199559697d);
    }

    @Test
    public void test3014() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3014");
        org.apache.commons.math.distribution.TDistribution tDistribution0 = null;
        org.apache.commons.math.stat.inference.TTestImpl tTestImpl1 = new org.apache.commons.math.stat.inference.TTestImpl(tDistribution0);
        org.apache.commons.math.distribution.TDistribution tDistribution2 = null;
        tTestImpl1.setDistribution(tDistribution2);
        org.apache.commons.math.distribution.TDistribution tDistribution4 = null;
        org.apache.commons.math.stat.inference.TTestImpl tTestImpl5 = new org.apache.commons.math.stat.inference.TTestImpl(tDistribution4);
        double[] doubleArray11 = new double[] { 1.0f, (short) 1, 100.0f, 1, 0.0f };
        double[] doubleArray16 = new double[] { ' ', (byte) 100, (byte) 1, (-1.0f) };
        double double17 = tTestImpl5.homoscedasticT(doubleArray11, doubleArray16);
        org.apache.commons.math.stat.inference.TTestImpl tTestImpl18 = new org.apache.commons.math.stat.inference.TTestImpl();
        double[] doubleArray22 = new double[] { '4', 'a', '4' };
        org.apache.commons.math.distribution.TDistribution tDistribution23 = null;
        org.apache.commons.math.stat.inference.TTestImpl tTestImpl24 = new org.apache.commons.math.stat.inference.TTestImpl(tDistribution23);
        double[] doubleArray30 = new double[] { 1.0f, (short) 1, 100.0f, 1, 0.0f };
        double[] doubleArray35 = new double[] { ' ', (byte) 100, (byte) 1, (-1.0f) };
        double double36 = tTestImpl24.homoscedasticT(doubleArray30, doubleArray35);
        double double37 = tTestImpl18.tTest(doubleArray22, doubleArray35);
        double double38 = tTestImpl1.homoscedasticT(doubleArray16, doubleArray22);
        org.apache.commons.math.distribution.TDistribution tDistribution40 = null;
        org.apache.commons.math.stat.inference.TTestImpl tTestImpl41 = new org.apache.commons.math.stat.inference.TTestImpl(tDistribution40);
        double[] doubleArray47 = new double[] { 1.0f, (short) 1, 100.0f, 1, 0.0f };
        double[] doubleArray52 = new double[] { ' ', (byte) 100, (byte) 1, (-1.0f) };
        double double53 = tTestImpl41.homoscedasticT(doubleArray47, doubleArray52);
        double double54 = tTestImpl1.t((-0.975807309953049d), doubleArray52);
        org.apache.commons.math.distribution.TDistribution tDistribution55 = null;
        tTestImpl1.setDistribution(tDistribution55);
        org.apache.commons.math.distribution.TDistribution tDistribution57 = null;
        tTestImpl1.setDistribution(tDistribution57);
        org.apache.commons.math.distribution.TDistribution tDistribution59 = null;
        tTestImpl1.setDistribution(tDistribution59);
        org.apache.commons.math.distribution.TDistribution tDistribution61 = null;
        tTestImpl1.setDistribution(tDistribution61);
        org.apache.commons.math.distribution.TDistribution tDistribution63 = null;
        tTestImpl1.setDistribution(tDistribution63);
        org.apache.commons.math.distribution.TDistribution tDistribution65 = null;
        tTestImpl1.setDistribution(tDistribution65);
        org.apache.commons.math.stat.descriptive.StatisticalSummary statisticalSummary68 = null;
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean70 = tTestImpl1.tTest(0.9693321145105079d, statisticalSummary68, 0.5339796283719219d);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: bad significance level: 0.5339796283719219");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(doubleArray11);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray11), "[1.0, 1.0, 100.0, 1.0, 0.0]");
        org.junit.Assert.assertNotNull(doubleArray16);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray16), "[32.0, 100.0, 1.0, -1.0]");
        org.junit.Assert.assertTrue("'" + double17 + "' != '" + (-0.405429217622299d) + "'", double17 == (-0.405429217622299d));
        org.junit.Assert.assertNotNull(doubleArray22);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray22), "[52.0, 97.0, 52.0]");
        org.junit.Assert.assertNotNull(doubleArray30);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray30), "[1.0, 1.0, 100.0, 1.0, 0.0]");
        org.junit.Assert.assertNotNull(doubleArray35);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray35), "[32.0, 100.0, 1.0, -1.0]");
        org.junit.Assert.assertTrue("'" + double36 + "' != '" + (-0.405429217622299d) + "'", double36 == (-0.405429217622299d));
        org.junit.Assert.assertTrue("'" + double37 + "' != '" + 0.2806531524060034d + "'", double37 == 0.2806531524060034d);
        org.junit.Assert.assertTrue("'" + double38 + "' != '" + (-1.1115227041167497d) + "'", double38 == (-1.1115227041167497d));
        org.junit.Assert.assertNotNull(doubleArray47);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray47), "[1.0, 1.0, 100.0, 1.0, 0.0]");
        org.junit.Assert.assertNotNull(doubleArray52);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray52), "[32.0, 100.0, 1.0, -1.0]");
        org.junit.Assert.assertTrue("'" + double53 + "' != '" + (-0.405429217622299d) + "'", double53 == (-0.405429217622299d));
        org.junit.Assert.assertTrue("'" + double54 + "' != '" + 1.4411111919348023d + "'", double54 == 1.4411111919348023d);
    }

    @Test
    public void test3015() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3015");
        org.apache.commons.math.stat.inference.TTestImpl tTestImpl0 = new org.apache.commons.math.stat.inference.TTestImpl();
        org.apache.commons.math.distribution.TDistribution tDistribution2 = null;
        org.apache.commons.math.stat.inference.TTestImpl tTestImpl3 = new org.apache.commons.math.stat.inference.TTestImpl(tDistribution2);
        org.apache.commons.math.distribution.TDistribution tDistribution4 = null;
        tTestImpl3.setDistribution(tDistribution4);
        org.apache.commons.math.stat.inference.TTestImpl tTestImpl6 = new org.apache.commons.math.stat.inference.TTestImpl();
        org.apache.commons.math.distribution.TDistribution tDistribution8 = null;
        org.apache.commons.math.stat.inference.TTestImpl tTestImpl9 = new org.apache.commons.math.stat.inference.TTestImpl(tDistribution8);
        double[] doubleArray15 = new double[] { 1.0f, (short) 1, 100.0f, 1, 0.0f };
        double[] doubleArray20 = new double[] { ' ', (byte) 100, (byte) 1, (-1.0f) };
        double double21 = tTestImpl9.homoscedasticT(doubleArray15, doubleArray20);
        double double22 = tTestImpl6.tTest((double) (short) 100, doubleArray15);
        org.apache.commons.math.distribution.TDistribution tDistribution24 = null;
        org.apache.commons.math.stat.inference.TTestImpl tTestImpl25 = new org.apache.commons.math.stat.inference.TTestImpl(tDistribution24);
        double[] doubleArray31 = new double[] { 1.0f, (short) 1, 100.0f, 1, 0.0f };
        double[] doubleArray36 = new double[] { ' ', (byte) 100, (byte) 1, (-1.0f) };
        double double37 = tTestImpl25.homoscedasticT(doubleArray31, doubleArray36);
        double[] doubleArray45 = new double[] { 1, 100.0f, (-1), (short) 100, 100, (-1) };
        double double46 = tTestImpl25.t((double) '4', doubleArray45);
        double double47 = tTestImpl6.tTest((double) (short) 100, doubleArray45);
        org.apache.commons.math.distribution.TDistribution tDistribution49 = null;
        org.apache.commons.math.stat.inference.TTestImpl tTestImpl50 = new org.apache.commons.math.stat.inference.TTestImpl(tDistribution49);
        double[] doubleArray56 = new double[] { 1.0f, (short) 1, 100.0f, 1, 0.0f };
        double[] doubleArray61 = new double[] { ' ', (byte) 100, (byte) 1, (-1.0f) };
        double double62 = tTestImpl50.homoscedasticT(doubleArray56, doubleArray61);
        double double63 = tTestImpl6.tTest((double) (byte) 1, doubleArray56);
        org.apache.commons.math.distribution.TDistribution tDistribution64 = null;
        org.apache.commons.math.stat.inference.TTestImpl tTestImpl65 = new org.apache.commons.math.stat.inference.TTestImpl(tDistribution64);
        double[] doubleArray71 = new double[] { 1.0f, (short) 1, 100.0f, 1, 0.0f };
        double[] doubleArray76 = new double[] { ' ', (byte) 100, (byte) 1, (-1.0f) };
        double double77 = tTestImpl65.homoscedasticT(doubleArray71, doubleArray76);
        double[] doubleArray85 = new double[] { 1, 100.0f, (-1), (short) 100, 100, (-1) };
        double double86 = tTestImpl65.t((double) '4', doubleArray85);
        double double87 = tTestImpl3.t(doubleArray56, doubleArray85);
        double double88 = tTestImpl0.tTest((double) 0, doubleArray56);
        org.apache.commons.math.distribution.TDistribution tDistribution89 = null;
        tTestImpl0.setDistribution(tDistribution89);
        org.apache.commons.math.distribution.TDistribution tDistribution91 = null;
        tTestImpl0.setDistribution(tDistribution91);
        org.apache.commons.math.stat.descriptive.StatisticalSummary statisticalSummary93 = null;
        org.apache.commons.math.stat.descriptive.StatisticalSummary statisticalSummary94 = null;
        // The following exception was thrown during execution in test generation
        try {
            double double95 = tTestImpl0.tTest(statisticalSummary93, statisticalSummary94);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: insufficient data for t statistic");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(doubleArray15);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray15), "[1.0, 1.0, 100.0, 1.0, 0.0]");
        org.junit.Assert.assertNotNull(doubleArray20);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray20), "[32.0, 100.0, 1.0, -1.0]");
        org.junit.Assert.assertTrue("'" + double21 + "' != '" + (-0.405429217622299d) + "'", double21 == (-0.405429217622299d));
        org.junit.Assert.assertTrue("'" + double22 + "' != '" + 0.01613264369976175d + "'", double22 == 0.01613264369976175d);
        org.junit.Assert.assertNotNull(doubleArray31);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray31), "[1.0, 1.0, 100.0, 1.0, 0.0]");
        org.junit.Assert.assertNotNull(doubleArray36);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray36), "[32.0, 100.0, 1.0, -1.0]");
        org.junit.Assert.assertTrue("'" + double37 + "' != '" + (-0.405429217622299d) + "'", double37 == (-0.405429217622299d));
        org.junit.Assert.assertNotNull(doubleArray45);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray45), "[1.0, 100.0, -1.0, 100.0, 100.0, -1.0]");
        org.junit.Assert.assertTrue("'" + double46 + "' != '" + (-0.09656583816243881d) + "'", double46 == (-0.09656583816243881d));
        org.junit.Assert.assertTrue("'" + double47 + "' != '" + 0.07560555610353314d + "'", double47 == 0.07560555610353314d);
        org.junit.Assert.assertNotNull(doubleArray56);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray56), "[1.0, 1.0, 100.0, 1.0, 0.0]");
        org.junit.Assert.assertNotNull(doubleArray61);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray61), "[32.0, 100.0, 1.0, -1.0]");
        org.junit.Assert.assertTrue("'" + double62 + "' != '" + (-0.405429217622299d) + "'", double62 == (-0.405429217622299d));
        org.junit.Assert.assertTrue("'" + double63 + "' != '" + 0.3793626154059051d + "'", double63 == 0.3793626154059051d);
        org.junit.Assert.assertNotNull(doubleArray71);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray71), "[1.0, 1.0, 100.0, 1.0, 0.0]");
        org.junit.Assert.assertNotNull(doubleArray76);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray76), "[32.0, 100.0, 1.0, -1.0]");
        org.junit.Assert.assertTrue("'" + double77 + "' != '" + (-0.405429217622299d) + "'", double77 == (-0.405429217622299d));
        org.junit.Assert.assertNotNull(doubleArray85);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray85), "[1.0, 100.0, -1.0, 100.0, 100.0, -1.0]");
        org.junit.Assert.assertTrue("'" + double86 + "' != '" + (-0.09656583816243881d) + "'", double86 == (-0.09656583816243881d));
        org.junit.Assert.assertTrue("'" + double87 + "' != '" + (-0.975807309953049d) + "'", double87 == (-0.975807309953049d));
        org.junit.Assert.assertTrue("'" + double88 + "' != '" + 0.35800486798369846d + "'", double88 == 0.35800486798369846d);
    }

    @Test
    public void test3016() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3016");
        org.apache.commons.math.distribution.TDistribution tDistribution0 = null;
        org.apache.commons.math.stat.inference.TTestImpl tTestImpl1 = new org.apache.commons.math.stat.inference.TTestImpl(tDistribution0);
        org.apache.commons.math.distribution.TDistribution tDistribution2 = null;
        tTestImpl1.setDistribution(tDistribution2);
        org.apache.commons.math.distribution.TDistribution tDistribution5 = null;
        org.apache.commons.math.stat.inference.TTestImpl tTestImpl6 = new org.apache.commons.math.stat.inference.TTestImpl(tDistribution5);
        org.apache.commons.math.distribution.TDistribution tDistribution7 = null;
        tTestImpl6.setDistribution(tDistribution7);
        org.apache.commons.math.stat.inference.TTestImpl tTestImpl10 = new org.apache.commons.math.stat.inference.TTestImpl();
        org.apache.commons.math.stat.inference.TTestImpl tTestImpl12 = new org.apache.commons.math.stat.inference.TTestImpl();
        org.apache.commons.math.distribution.TDistribution tDistribution14 = null;
        org.apache.commons.math.stat.inference.TTestImpl tTestImpl15 = new org.apache.commons.math.stat.inference.TTestImpl(tDistribution14);
        double[] doubleArray21 = new double[] { 1.0f, (short) 1, 100.0f, 1, 0.0f };
        double[] doubleArray26 = new double[] { ' ', (byte) 100, (byte) 1, (-1.0f) };
        double double27 = tTestImpl15.homoscedasticT(doubleArray21, doubleArray26);
        double double28 = tTestImpl12.tTest((double) (short) 100, doubleArray21);
        org.apache.commons.math.distribution.TDistribution tDistribution30 = null;
        org.apache.commons.math.stat.inference.TTestImpl tTestImpl31 = new org.apache.commons.math.stat.inference.TTestImpl(tDistribution30);
        double[] doubleArray37 = new double[] { 1.0f, (short) 1, 100.0f, 1, 0.0f };
        double[] doubleArray42 = new double[] { ' ', (byte) 100, (byte) 1, (-1.0f) };
        double double43 = tTestImpl31.homoscedasticT(doubleArray37, doubleArray42);
        double[] doubleArray51 = new double[] { 1, 100.0f, (-1), (short) 100, 100, (-1) };
        double double52 = tTestImpl31.t((double) '4', doubleArray51);
        double double53 = tTestImpl12.tTest((double) (short) 100, doubleArray51);
        double[] doubleArray60 = new double[] { (byte) -1, (-1), 0.0f, 1.0d, (-1.0f) };
        double double61 = tTestImpl12.tTest(0.405429217622299d, doubleArray60);
        double double62 = tTestImpl10.t(3.8d, doubleArray60);
        double double63 = tTestImpl6.t((double) (short) 1, doubleArray60);
        double double64 = tTestImpl1.t(0.9839224922440002d, doubleArray60);
        org.apache.commons.math.distribution.TDistribution tDistribution65 = null;
        tTestImpl1.setDistribution(tDistribution65);
        org.apache.commons.math.stat.descriptive.StatisticalSummary statisticalSummary68 = null;
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean70 = tTestImpl1.tTest(0.0d, statisticalSummary68, (double) (short) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: bad significance level: 10.0");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(doubleArray21);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray21), "[1.0, 1.0, 100.0, 1.0, 0.0]");
        org.junit.Assert.assertNotNull(doubleArray26);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray26), "[32.0, 100.0, 1.0, -1.0]");
        org.junit.Assert.assertTrue("'" + double27 + "' != '" + (-0.405429217622299d) + "'", double27 == (-0.405429217622299d));
        org.junit.Assert.assertTrue("'" + double28 + "' != '" + 0.01613264369976175d + "'", double28 == 0.01613264369976175d);
        org.junit.Assert.assertNotNull(doubleArray37);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray37), "[1.0, 1.0, 100.0, 1.0, 0.0]");
        org.junit.Assert.assertNotNull(doubleArray42);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray42), "[32.0, 100.0, 1.0, -1.0]");
        org.junit.Assert.assertTrue("'" + double43 + "' != '" + (-0.405429217622299d) + "'", double43 == (-0.405429217622299d));
        org.junit.Assert.assertNotNull(doubleArray51);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray51), "[1.0, 100.0, -1.0, 100.0, 100.0, -1.0]");
        org.junit.Assert.assertTrue("'" + double52 + "' != '" + (-0.09656583816243881d) + "'", double52 == (-0.09656583816243881d));
        org.junit.Assert.assertTrue("'" + double53 + "' != '" + 0.07560555610353314d + "'", double53 == 0.07560555610353314d);
        org.junit.Assert.assertNotNull(doubleArray60);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray60), "[-1.0, -1.0, 0.0, 1.0, -1.0]");
        org.junit.Assert.assertTrue("'" + double61 + "' != '" + 0.1143321549278642d + "'", double61 == 0.1143321549278642d);
        org.junit.Assert.assertTrue("'" + double62 + "' != '" + (-10.500000000000002d) + "'", double62 == (-10.500000000000002d));
        org.junit.Assert.assertTrue("'" + double63 + "' != '" + (-3.5d) + "'", double63 == (-3.5d));
        org.junit.Assert.assertTrue("'" + double64 + "' != '" + (-3.4598062306100013d) + "'", double64 == (-3.4598062306100013d));
    }

    @Test
    public void test3017() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3017");
        org.apache.commons.math.stat.inference.TTestImpl tTestImpl0 = new org.apache.commons.math.stat.inference.TTestImpl();
        org.apache.commons.math.distribution.TDistribution tDistribution1 = null;
        tTestImpl0.setDistribution(tDistribution1);
        org.apache.commons.math.distribution.TDistribution tDistribution3 = null;
        tTestImpl0.setDistribution(tDistribution3);
        org.apache.commons.math.distribution.TDistribution tDistribution5 = null;
        tTestImpl0.setDistribution(tDistribution5);
        org.apache.commons.math.distribution.TDistribution tDistribution8 = null;
        org.apache.commons.math.stat.inference.TTestImpl tTestImpl9 = new org.apache.commons.math.stat.inference.TTestImpl(tDistribution8);
        double[] doubleArray15 = new double[] { 1.0f, (short) 1, 100.0f, 1, 0.0f };
        double[] doubleArray20 = new double[] { ' ', (byte) 100, (byte) 1, (-1.0f) };
        double double21 = tTestImpl9.homoscedasticT(doubleArray15, doubleArray20);
        double double22 = tTestImpl0.t(1.4411111919348023d, doubleArray20);
        org.apache.commons.math.distribution.TDistribution tDistribution23 = null;
        tTestImpl0.setDistribution(tDistribution23);
        org.apache.commons.math.stat.inference.TTestImpl tTestImpl26 = new org.apache.commons.math.stat.inference.TTestImpl();
        org.apache.commons.math.stat.inference.TTestImpl tTestImpl28 = new org.apache.commons.math.stat.inference.TTestImpl();
        org.apache.commons.math.distribution.TDistribution tDistribution30 = null;
        org.apache.commons.math.stat.inference.TTestImpl tTestImpl31 = new org.apache.commons.math.stat.inference.TTestImpl(tDistribution30);
        double[] doubleArray37 = new double[] { 1.0f, (short) 1, 100.0f, 1, 0.0f };
        double[] doubleArray42 = new double[] { ' ', (byte) 100, (byte) 1, (-1.0f) };
        double double43 = tTestImpl31.homoscedasticT(doubleArray37, doubleArray42);
        double double44 = tTestImpl28.tTest((double) (short) 100, doubleArray37);
        org.apache.commons.math.distribution.TDistribution tDistribution46 = null;
        org.apache.commons.math.stat.inference.TTestImpl tTestImpl47 = new org.apache.commons.math.stat.inference.TTestImpl(tDistribution46);
        double[] doubleArray53 = new double[] { 1.0f, (short) 1, 100.0f, 1, 0.0f };
        double[] doubleArray58 = new double[] { ' ', (byte) 100, (byte) 1, (-1.0f) };
        double double59 = tTestImpl47.homoscedasticT(doubleArray53, doubleArray58);
        double[] doubleArray67 = new double[] { 1, 100.0f, (-1), (short) 100, 100, (-1) };
        double double68 = tTestImpl47.t((double) '4', doubleArray67);
        double double69 = tTestImpl28.tTest((double) (short) 100, doubleArray67);
        double[] doubleArray76 = new double[] { (byte) -1, (-1), 0.0f, 1.0d, (-1.0f) };
        double double77 = tTestImpl28.tTest(0.405429217622299d, doubleArray76);
        double double78 = tTestImpl26.t(3.8d, doubleArray76);
        double double79 = tTestImpl0.t(0.982920007042921d, doubleArray76);
        org.junit.Assert.assertNotNull(doubleArray15);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray15), "[1.0, 1.0, 100.0, 1.0, 0.0]");
        org.junit.Assert.assertNotNull(doubleArray20);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray20), "[32.0, 100.0, 1.0, -1.0]");
        org.junit.Assert.assertTrue("'" + double21 + "' != '" + (-0.405429217622299d) + "'", double21 == (-0.405429217622299d));
        org.junit.Assert.assertTrue("'" + double22 + "' != '" + 1.3385956498818976d + "'", double22 == 1.3385956498818976d);
        org.junit.Assert.assertNotNull(doubleArray37);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray37), "[1.0, 1.0, 100.0, 1.0, 0.0]");
        org.junit.Assert.assertNotNull(doubleArray42);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray42), "[32.0, 100.0, 1.0, -1.0]");
        org.junit.Assert.assertTrue("'" + double43 + "' != '" + (-0.405429217622299d) + "'", double43 == (-0.405429217622299d));
        org.junit.Assert.assertTrue("'" + double44 + "' != '" + 0.01613264369976175d + "'", double44 == 0.01613264369976175d);
        org.junit.Assert.assertNotNull(doubleArray53);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray53), "[1.0, 1.0, 100.0, 1.0, 0.0]");
        org.junit.Assert.assertNotNull(doubleArray58);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray58), "[32.0, 100.0, 1.0, -1.0]");
        org.junit.Assert.assertTrue("'" + double59 + "' != '" + (-0.405429217622299d) + "'", double59 == (-0.405429217622299d));
        org.junit.Assert.assertNotNull(doubleArray67);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray67), "[1.0, 100.0, -1.0, 100.0, 100.0, -1.0]");
        org.junit.Assert.assertTrue("'" + double68 + "' != '" + (-0.09656583816243881d) + "'", double68 == (-0.09656583816243881d));
        org.junit.Assert.assertTrue("'" + double69 + "' != '" + 0.07560555610353314d + "'", double69 == 0.07560555610353314d);
        org.junit.Assert.assertNotNull(doubleArray76);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray76), "[-1.0, -1.0, 0.0, 1.0, -1.0]");
        org.junit.Assert.assertTrue("'" + double77 + "' != '" + 0.1143321549278642d + "'", double77 == 0.1143321549278642d);
        org.junit.Assert.assertTrue("'" + double78 + "' != '" + (-10.500000000000002d) + "'", double78 == (-10.500000000000002d));
        org.junit.Assert.assertTrue("'" + double79 + "' != '" + (-3.4573000176073028d) + "'", double79 == (-3.4573000176073028d));
    }

    @Test
    public void test3018() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3018");
        org.apache.commons.math.stat.inference.TTestImpl tTestImpl0 = new org.apache.commons.math.stat.inference.TTestImpl();
        double[] doubleArray4 = new double[] { '4', 'a', '4' };
        org.apache.commons.math.distribution.TDistribution tDistribution5 = null;
        org.apache.commons.math.stat.inference.TTestImpl tTestImpl6 = new org.apache.commons.math.stat.inference.TTestImpl(tDistribution5);
        double[] doubleArray12 = new double[] { 1.0f, (short) 1, 100.0f, 1, 0.0f };
        double[] doubleArray17 = new double[] { ' ', (byte) 100, (byte) 1, (-1.0f) };
        double double18 = tTestImpl6.homoscedasticT(doubleArray12, doubleArray17);
        double double19 = tTestImpl0.tTest(doubleArray4, doubleArray17);
        org.apache.commons.math.distribution.TDistribution tDistribution21 = null;
        org.apache.commons.math.stat.inference.TTestImpl tTestImpl22 = new org.apache.commons.math.stat.inference.TTestImpl(tDistribution21);
        double[] doubleArray28 = new double[] { 1.0f, (short) 1, 100.0f, 1, 0.0f };
        double[] doubleArray33 = new double[] { ' ', (byte) 100, (byte) 1, (-1.0f) };
        double double34 = tTestImpl22.homoscedasticT(doubleArray28, doubleArray33);
        double double35 = tTestImpl0.t((double) 1L, doubleArray33);
        org.apache.commons.math.distribution.TDistribution tDistribution36 = null;
        tTestImpl0.setDistribution(tDistribution36);
        org.apache.commons.math.distribution.TDistribution tDistribution38 = null;
        tTestImpl0.setDistribution(tDistribution38);
        org.apache.commons.math.distribution.TDistribution tDistribution40 = null;
        tTestImpl0.setDistribution(tDistribution40);
        org.apache.commons.math.stat.descriptive.StatisticalSummary statisticalSummary42 = null;
        org.apache.commons.math.stat.descriptive.StatisticalSummary statisticalSummary43 = null;
        // The following exception was thrown during execution in test generation
        try {
            double double44 = tTestImpl0.homoscedasticT(statisticalSummary42, statisticalSummary43);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: insufficient data for t statistic");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(doubleArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray4), "[52.0, 97.0, 52.0]");
        org.junit.Assert.assertNotNull(doubleArray12);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray12), "[1.0, 1.0, 100.0, 1.0, 0.0]");
        org.junit.Assert.assertNotNull(doubleArray17);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray17), "[32.0, 100.0, 1.0, -1.0]");
        org.junit.Assert.assertTrue("'" + double18 + "' != '" + (-0.405429217622299d) + "'", double18 == (-0.405429217622299d));
        org.junit.Assert.assertTrue("'" + double19 + "' != '" + 0.2806531524060034d + "'", double19 == 0.2806531524060034d);
        org.junit.Assert.assertNotNull(doubleArray28);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray28), "[1.0, 1.0, 100.0, 1.0, 0.0]");
        org.junit.Assert.assertNotNull(doubleArray33);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray33), "[32.0, 100.0, 1.0, -1.0]");
        org.junit.Assert.assertTrue("'" + double34 + "' != '" + (-0.405429217622299d) + "'", double34 == (-0.405429217622299d));
        org.junit.Assert.assertTrue("'" + double35 + "' != '" + 1.3573057358494125d + "'", double35 == 1.3573057358494125d);
    }

    @Test
    public void test3019() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3019");
        org.apache.commons.math.distribution.TDistribution tDistribution0 = null;
        org.apache.commons.math.stat.inference.TTestImpl tTestImpl1 = new org.apache.commons.math.stat.inference.TTestImpl(tDistribution0);
        org.apache.commons.math.distribution.TDistribution tDistribution2 = null;
        tTestImpl1.setDistribution(tDistribution2);
        org.apache.commons.math.distribution.TDistribution tDistribution4 = null;
        org.apache.commons.math.stat.inference.TTestImpl tTestImpl5 = new org.apache.commons.math.stat.inference.TTestImpl(tDistribution4);
        double[] doubleArray11 = new double[] { 1.0f, (short) 1, 100.0f, 1, 0.0f };
        double[] doubleArray16 = new double[] { ' ', (byte) 100, (byte) 1, (-1.0f) };
        double double17 = tTestImpl5.homoscedasticT(doubleArray11, doubleArray16);
        org.apache.commons.math.stat.inference.TTestImpl tTestImpl18 = new org.apache.commons.math.stat.inference.TTestImpl();
        double[] doubleArray22 = new double[] { '4', 'a', '4' };
        org.apache.commons.math.distribution.TDistribution tDistribution23 = null;
        org.apache.commons.math.stat.inference.TTestImpl tTestImpl24 = new org.apache.commons.math.stat.inference.TTestImpl(tDistribution23);
        double[] doubleArray30 = new double[] { 1.0f, (short) 1, 100.0f, 1, 0.0f };
        double[] doubleArray35 = new double[] { ' ', (byte) 100, (byte) 1, (-1.0f) };
        double double36 = tTestImpl24.homoscedasticT(doubleArray30, doubleArray35);
        double double37 = tTestImpl18.tTest(doubleArray22, doubleArray35);
        double double38 = tTestImpl1.homoscedasticT(doubleArray16, doubleArray22);
        org.apache.commons.math.distribution.TDistribution tDistribution40 = null;
        org.apache.commons.math.stat.inference.TTestImpl tTestImpl41 = new org.apache.commons.math.stat.inference.TTestImpl(tDistribution40);
        double[] doubleArray47 = new double[] { 1.0f, (short) 1, 100.0f, 1, 0.0f };
        double[] doubleArray52 = new double[] { ' ', (byte) 100, (byte) 1, (-1.0f) };
        double double53 = tTestImpl41.homoscedasticT(doubleArray47, doubleArray52);
        double double54 = tTestImpl1.t((-0.975807309953049d), doubleArray52);
        org.apache.commons.math.distribution.TDistribution tDistribution55 = null;
        tTestImpl1.setDistribution(tDistribution55);
        org.apache.commons.math.distribution.TDistribution tDistribution57 = null;
        tTestImpl1.setDistribution(tDistribution57);
        org.apache.commons.math.stat.inference.TTestImpl tTestImpl60 = new org.apache.commons.math.stat.inference.TTestImpl();
        double[] doubleArray64 = new double[] { '4', 'a', '4' };
        org.apache.commons.math.distribution.TDistribution tDistribution65 = null;
        org.apache.commons.math.stat.inference.TTestImpl tTestImpl66 = new org.apache.commons.math.stat.inference.TTestImpl(tDistribution65);
        double[] doubleArray72 = new double[] { 1.0f, (short) 1, 100.0f, 1, 0.0f };
        double[] doubleArray77 = new double[] { ' ', (byte) 100, (byte) 1, (-1.0f) };
        double double78 = tTestImpl66.homoscedasticT(doubleArray72, doubleArray77);
        double double79 = tTestImpl60.tTest(doubleArray64, doubleArray77);
        double double80 = tTestImpl1.t((double) 0, doubleArray77);
        org.apache.commons.math.distribution.TDistribution tDistribution81 = null;
        tTestImpl1.setDistribution(tDistribution81);
        org.apache.commons.math.distribution.TDistribution tDistribution83 = null;
        tTestImpl1.setDistribution(tDistribution83);
        org.apache.commons.math.stat.descriptive.StatisticalSummary statisticalSummary85 = null;
        org.apache.commons.math.stat.descriptive.StatisticalSummary statisticalSummary86 = null;
        // The following exception was thrown during execution in test generation
        try {
            double double87 = tTestImpl1.t(statisticalSummary85, statisticalSummary86);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: insufficient data for t statistic");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(doubleArray11);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray11), "[1.0, 1.0, 100.0, 1.0, 0.0]");
        org.junit.Assert.assertNotNull(doubleArray16);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray16), "[32.0, 100.0, 1.0, -1.0]");
        org.junit.Assert.assertTrue("'" + double17 + "' != '" + (-0.405429217622299d) + "'", double17 == (-0.405429217622299d));
        org.junit.Assert.assertNotNull(doubleArray22);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray22), "[52.0, 97.0, 52.0]");
        org.junit.Assert.assertNotNull(doubleArray30);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray30), "[1.0, 1.0, 100.0, 1.0, 0.0]");
        org.junit.Assert.assertNotNull(doubleArray35);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray35), "[32.0, 100.0, 1.0, -1.0]");
        org.junit.Assert.assertTrue("'" + double36 + "' != '" + (-0.405429217622299d) + "'", double36 == (-0.405429217622299d));
        org.junit.Assert.assertTrue("'" + double37 + "' != '" + 0.2806531524060034d + "'", double37 == 0.2806531524060034d);
        org.junit.Assert.assertTrue("'" + double38 + "' != '" + (-1.1115227041167497d) + "'", double38 == (-1.1115227041167497d));
        org.junit.Assert.assertNotNull(doubleArray47);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray47), "[1.0, 1.0, 100.0, 1.0, 0.0]");
        org.junit.Assert.assertNotNull(doubleArray52);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray52), "[32.0, 100.0, 1.0, -1.0]");
        org.junit.Assert.assertTrue("'" + double53 + "' != '" + (-0.405429217622299d) + "'", double53 == (-0.405429217622299d));
        org.junit.Assert.assertTrue("'" + double54 + "' != '" + 1.4411111919348023d + "'", double54 == 1.4411111919348023d);
        org.junit.Assert.assertNotNull(doubleArray64);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray64), "[52.0, 97.0, 52.0]");
        org.junit.Assert.assertNotNull(doubleArray72);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray72), "[1.0, 1.0, 100.0, 1.0, 0.0]");
        org.junit.Assert.assertNotNull(doubleArray77);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray77), "[32.0, 100.0, 1.0, -1.0]");
        org.junit.Assert.assertTrue("'" + double78 + "' != '" + (-0.405429217622299d) + "'", double78 == (-0.405429217622299d));
        org.junit.Assert.assertTrue("'" + double79 + "' != '" + 0.2806531524060034d + "'", double79 == 0.2806531524060034d);
        org.junit.Assert.assertTrue("'" + double80 + "' != '" + 1.3997215400947067d + "'", double80 == 1.3997215400947067d);
    }

    @Test
    public void test3020() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3020");
        org.apache.commons.math.stat.inference.TTestImpl tTestImpl0 = new org.apache.commons.math.stat.inference.TTestImpl();
        double[] doubleArray4 = new double[] { '4', 'a', '4' };
        org.apache.commons.math.distribution.TDistribution tDistribution5 = null;
        org.apache.commons.math.stat.inference.TTestImpl tTestImpl6 = new org.apache.commons.math.stat.inference.TTestImpl(tDistribution5);
        double[] doubleArray12 = new double[] { 1.0f, (short) 1, 100.0f, 1, 0.0f };
        double[] doubleArray17 = new double[] { ' ', (byte) 100, (byte) 1, (-1.0f) };
        double double18 = tTestImpl6.homoscedasticT(doubleArray12, doubleArray17);
        double double19 = tTestImpl0.tTest(doubleArray4, doubleArray17);
        org.apache.commons.math.distribution.TDistribution tDistribution21 = null;
        org.apache.commons.math.stat.inference.TTestImpl tTestImpl22 = new org.apache.commons.math.stat.inference.TTestImpl(tDistribution21);
        double[] doubleArray28 = new double[] { 1.0f, (short) 1, 100.0f, 1, 0.0f };
        double[] doubleArray33 = new double[] { ' ', (byte) 100, (byte) 1, (-1.0f) };
        double double34 = tTestImpl22.homoscedasticT(doubleArray28, doubleArray33);
        double double35 = tTestImpl0.t((double) 1L, doubleArray33);
        org.apache.commons.math.distribution.TDistribution tDistribution37 = null;
        org.apache.commons.math.stat.inference.TTestImpl tTestImpl38 = new org.apache.commons.math.stat.inference.TTestImpl(tDistribution37);
        double[] doubleArray44 = new double[] { 1.0f, (short) 1, 100.0f, 1, 0.0f };
        double[] doubleArray49 = new double[] { ' ', (byte) 100, (byte) 1, (-1.0f) };
        double double50 = tTestImpl38.homoscedasticT(doubleArray44, doubleArray49);
        org.apache.commons.math.stat.inference.TTestImpl tTestImpl51 = new org.apache.commons.math.stat.inference.TTestImpl();
        double[] doubleArray55 = new double[] { '4', 'a', '4' };
        org.apache.commons.math.distribution.TDistribution tDistribution56 = null;
        org.apache.commons.math.stat.inference.TTestImpl tTestImpl57 = new org.apache.commons.math.stat.inference.TTestImpl(tDistribution56);
        double[] doubleArray63 = new double[] { 1.0f, (short) 1, 100.0f, 1, 0.0f };
        double[] doubleArray68 = new double[] { ' ', (byte) 100, (byte) 1, (-1.0f) };
        double double69 = tTestImpl57.homoscedasticT(doubleArray63, doubleArray68);
        double double70 = tTestImpl51.tTest(doubleArray55, doubleArray68);
        org.apache.commons.math.distribution.TDistribution tDistribution71 = null;
        org.apache.commons.math.stat.inference.TTestImpl tTestImpl72 = new org.apache.commons.math.stat.inference.TTestImpl(tDistribution71);
        double[] doubleArray78 = new double[] { 1.0f, (short) 1, 100.0f, 1, 0.0f };
        double[] doubleArray83 = new double[] { ' ', (byte) 100, (byte) 1, (-1.0f) };
        double double84 = tTestImpl72.homoscedasticT(doubleArray78, doubleArray83);
        double double85 = tTestImpl38.t(doubleArray68, doubleArray83);
        double double86 = tTestImpl0.tTest(1.6198140498569726d, doubleArray83);
        org.apache.commons.math.stat.descriptive.StatisticalSummary statisticalSummary87 = null;
        org.apache.commons.math.stat.descriptive.StatisticalSummary statisticalSummary88 = null;
        // The following exception was thrown during execution in test generation
        try {
            double double89 = tTestImpl0.homoscedasticTTest(statisticalSummary87, statisticalSummary88);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: insufficient data for t statistic");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(doubleArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray4), "[52.0, 97.0, 52.0]");
        org.junit.Assert.assertNotNull(doubleArray12);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray12), "[1.0, 1.0, 100.0, 1.0, 0.0]");
        org.junit.Assert.assertNotNull(doubleArray17);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray17), "[32.0, 100.0, 1.0, -1.0]");
        org.junit.Assert.assertTrue("'" + double18 + "' != '" + (-0.405429217622299d) + "'", double18 == (-0.405429217622299d));
        org.junit.Assert.assertTrue("'" + double19 + "' != '" + 0.2806531524060034d + "'", double19 == 0.2806531524060034d);
        org.junit.Assert.assertNotNull(doubleArray28);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray28), "[1.0, 1.0, 100.0, 1.0, 0.0]");
        org.junit.Assert.assertNotNull(doubleArray33);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray33), "[32.0, 100.0, 1.0, -1.0]");
        org.junit.Assert.assertTrue("'" + double34 + "' != '" + (-0.405429217622299d) + "'", double34 == (-0.405429217622299d));
        org.junit.Assert.assertTrue("'" + double35 + "' != '" + 1.3573057358494125d + "'", double35 == 1.3573057358494125d);
        org.junit.Assert.assertNotNull(doubleArray44);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray44), "[1.0, 1.0, 100.0, 1.0, 0.0]");
        org.junit.Assert.assertNotNull(doubleArray49);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray49), "[32.0, 100.0, 1.0, -1.0]");
        org.junit.Assert.assertTrue("'" + double50 + "' != '" + (-0.405429217622299d) + "'", double50 == (-0.405429217622299d));
        org.junit.Assert.assertNotNull(doubleArray55);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray55), "[52.0, 97.0, 52.0]");
        org.junit.Assert.assertNotNull(doubleArray63);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray63), "[1.0, 1.0, 100.0, 1.0, 0.0]");
        org.junit.Assert.assertNotNull(doubleArray68);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray68), "[32.0, 100.0, 1.0, -1.0]");
        org.junit.Assert.assertTrue("'" + double69 + "' != '" + (-0.405429217622299d) + "'", double69 == (-0.405429217622299d));
        org.junit.Assert.assertTrue("'" + double70 + "' != '" + 0.2806531524060034d + "'", double70 == 0.2806531524060034d);
        org.junit.Assert.assertNotNull(doubleArray78);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray78), "[1.0, 1.0, 100.0, 1.0, 0.0]");
        org.junit.Assert.assertNotNull(doubleArray83);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray83), "[32.0, 100.0, 1.0, -1.0]");
        org.junit.Assert.assertTrue("'" + double84 + "' != '" + (-0.405429217622299d) + "'", double84 == (-0.405429217622299d));
        org.junit.Assert.assertTrue("'" + double85 + "' != '" + 0.0d + "'", double85 == 0.0d);
        org.junit.Assert.assertTrue("'" + double86 + "' != '" + 0.2752975451271431d + "'", double86 == 0.2752975451271431d);
    }

    @Test
    public void test3021() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3021");
        org.apache.commons.math.distribution.TDistribution tDistribution0 = null;
        org.apache.commons.math.stat.inference.TTestImpl tTestImpl1 = new org.apache.commons.math.stat.inference.TTestImpl(tDistribution0);
        double[] doubleArray7 = new double[] { 1.0f, (short) 1, 100.0f, 1, 0.0f };
        double[] doubleArray12 = new double[] { ' ', (byte) 100, (byte) 1, (-1.0f) };
        double double13 = tTestImpl1.homoscedasticT(doubleArray7, doubleArray12);
        org.apache.commons.math.distribution.TDistribution tDistribution14 = null;
        tTestImpl1.setDistribution(tDistribution14);
        org.apache.commons.math.stat.inference.TTestImpl tTestImpl17 = new org.apache.commons.math.stat.inference.TTestImpl();
        double[] doubleArray21 = new double[] { '4', 'a', '4' };
        org.apache.commons.math.distribution.TDistribution tDistribution22 = null;
        org.apache.commons.math.stat.inference.TTestImpl tTestImpl23 = new org.apache.commons.math.stat.inference.TTestImpl(tDistribution22);
        double[] doubleArray29 = new double[] { 1.0f, (short) 1, 100.0f, 1, 0.0f };
        double[] doubleArray34 = new double[] { ' ', (byte) 100, (byte) 1, (-1.0f) };
        double double35 = tTestImpl23.homoscedasticT(doubleArray29, doubleArray34);
        double double36 = tTestImpl17.tTest(doubleArray21, doubleArray34);
        double double37 = tTestImpl1.t(10.0d, doubleArray21);
        org.apache.commons.math.distribution.TDistribution tDistribution38 = null;
        org.apache.commons.math.stat.inference.TTestImpl tTestImpl39 = new org.apache.commons.math.stat.inference.TTestImpl(tDistribution38);
        double[] doubleArray45 = new double[] { 1.0f, (short) 1, 100.0f, 1, 0.0f };
        double[] doubleArray50 = new double[] { ' ', (byte) 100, (byte) 1, (-1.0f) };
        double double51 = tTestImpl39.homoscedasticT(doubleArray45, doubleArray50);
        org.apache.commons.math.distribution.TDistribution tDistribution52 = null;
        org.apache.commons.math.stat.inference.TTestImpl tTestImpl53 = new org.apache.commons.math.stat.inference.TTestImpl(tDistribution52);
        double[] doubleArray59 = new double[] { 1.0f, (short) 1, 100.0f, 1, 0.0f };
        double[] doubleArray64 = new double[] { ' ', (byte) 100, (byte) 1, (-1.0f) };
        double double65 = tTestImpl53.homoscedasticT(doubleArray59, doubleArray64);
        org.apache.commons.math.stat.inference.TTestImpl tTestImpl67 = new org.apache.commons.math.stat.inference.TTestImpl();
        org.apache.commons.math.distribution.TDistribution tDistribution69 = null;
        org.apache.commons.math.stat.inference.TTestImpl tTestImpl70 = new org.apache.commons.math.stat.inference.TTestImpl(tDistribution69);
        double[] doubleArray76 = new double[] { 1.0f, (short) 1, 100.0f, 1, 0.0f };
        double[] doubleArray81 = new double[] { ' ', (byte) 100, (byte) 1, (-1.0f) };
        double double82 = tTestImpl70.homoscedasticT(doubleArray76, doubleArray81);
        double double83 = tTestImpl67.tTest((double) (short) 100, doubleArray76);
        double double84 = tTestImpl53.t((double) 10.0f, doubleArray76);
        double double85 = tTestImpl1.homoscedasticT(doubleArray50, doubleArray76);
        org.apache.commons.math.distribution.TDistribution tDistribution86 = null;
        tTestImpl1.setDistribution(tDistribution86);
        org.apache.commons.math.distribution.TDistribution tDistribution88 = null;
        tTestImpl1.setDistribution(tDistribution88);
        org.apache.commons.math.distribution.TDistribution tDistribution90 = null;
        tTestImpl1.setDistribution(tDistribution90);
        double[] doubleArray93 = null;
        // The following exception was thrown during execution in test generation
        try {
            double double94 = tTestImpl1.t((double) (-1L), doubleArray93);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: insufficient data for t statistic");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(doubleArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray7), "[1.0, 1.0, 100.0, 1.0, 0.0]");
        org.junit.Assert.assertNotNull(doubleArray12);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray12), "[32.0, 100.0, 1.0, -1.0]");
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + (-0.405429217622299d) + "'", double13 == (-0.405429217622299d));
        org.junit.Assert.assertNotNull(doubleArray21);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray21), "[52.0, 97.0, 52.0]");
        org.junit.Assert.assertNotNull(doubleArray29);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray29), "[1.0, 1.0, 100.0, 1.0, 0.0]");
        org.junit.Assert.assertNotNull(doubleArray34);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray34), "[32.0, 100.0, 1.0, -1.0]");
        org.junit.Assert.assertTrue("'" + double35 + "' != '" + (-0.405429217622299d) + "'", double35 == (-0.405429217622299d));
        org.junit.Assert.assertTrue("'" + double36 + "' != '" + 0.2806531524060034d + "'", double36 == 0.2806531524060034d);
        org.junit.Assert.assertTrue("'" + double37 + "' != '" + 3.8d + "'", double37 == 3.8d);
        org.junit.Assert.assertNotNull(doubleArray45);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray45), "[1.0, 1.0, 100.0, 1.0, 0.0]");
        org.junit.Assert.assertNotNull(doubleArray50);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray50), "[32.0, 100.0, 1.0, -1.0]");
        org.junit.Assert.assertTrue("'" + double51 + "' != '" + (-0.405429217622299d) + "'", double51 == (-0.405429217622299d));
        org.junit.Assert.assertNotNull(doubleArray59);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray59), "[1.0, 1.0, 100.0, 1.0, 0.0]");
        org.junit.Assert.assertNotNull(doubleArray64);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray64), "[32.0, 100.0, 1.0, -1.0]");
        org.junit.Assert.assertTrue("'" + double65 + "' != '" + (-0.405429217622299d) + "'", double65 == (-0.405429217622299d));
        org.junit.Assert.assertNotNull(doubleArray76);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray76), "[1.0, 1.0, 100.0, 1.0, 0.0]");
        org.junit.Assert.assertNotNull(doubleArray81);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray81), "[32.0, 100.0, 1.0, -1.0]");
        org.junit.Assert.assertTrue("'" + double82 + "' != '" + (-0.405429217622299d) + "'", double82 == (-0.405429217622299d));
        org.junit.Assert.assertTrue("'" + double83 + "' != '" + 0.01613264369976175d + "'", double83 == 0.01613264369976175d);
        org.junit.Assert.assertTrue("'" + double84 + "' != '" + 0.5339796283719219d + "'", double84 == 0.5339796283719219d);
        org.junit.Assert.assertTrue("'" + double85 + "' != '" + 0.405429217622299d + "'", double85 == 0.405429217622299d);
    }

    @Test
    public void test3022() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3022");
        org.apache.commons.math.stat.inference.TTestImpl tTestImpl0 = new org.apache.commons.math.stat.inference.TTestImpl();
        double[] doubleArray4 = new double[] { '4', 'a', '4' };
        org.apache.commons.math.distribution.TDistribution tDistribution5 = null;
        org.apache.commons.math.stat.inference.TTestImpl tTestImpl6 = new org.apache.commons.math.stat.inference.TTestImpl(tDistribution5);
        double[] doubleArray12 = new double[] { 1.0f, (short) 1, 100.0f, 1, 0.0f };
        double[] doubleArray17 = new double[] { ' ', (byte) 100, (byte) 1, (-1.0f) };
        double double18 = tTestImpl6.homoscedasticT(doubleArray12, doubleArray17);
        double double19 = tTestImpl0.tTest(doubleArray4, doubleArray17);
        org.apache.commons.math.stat.descriptive.StatisticalSummary statisticalSummary21 = null;
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean23 = tTestImpl0.tTest((-2.2d), statisticalSummary21, 0.046643592901765896d);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: insufficient data for t statistic");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(doubleArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray4), "[52.0, 97.0, 52.0]");
        org.junit.Assert.assertNotNull(doubleArray12);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray12), "[1.0, 1.0, 100.0, 1.0, 0.0]");
        org.junit.Assert.assertNotNull(doubleArray17);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray17), "[32.0, 100.0, 1.0, -1.0]");
        org.junit.Assert.assertTrue("'" + double18 + "' != '" + (-0.405429217622299d) + "'", double18 == (-0.405429217622299d));
        org.junit.Assert.assertTrue("'" + double19 + "' != '" + 0.2806531524060034d + "'", double19 == 0.2806531524060034d);
    }

    @Test
    public void test3023() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3023");
        org.apache.commons.math.stat.inference.TTestImpl tTestImpl0 = new org.apache.commons.math.stat.inference.TTestImpl();
        org.apache.commons.math.distribution.TDistribution tDistribution2 = null;
        org.apache.commons.math.stat.inference.TTestImpl tTestImpl3 = new org.apache.commons.math.stat.inference.TTestImpl(tDistribution2);
        double[] doubleArray9 = new double[] { 1.0f, (short) 1, 100.0f, 1, 0.0f };
        double[] doubleArray14 = new double[] { ' ', (byte) 100, (byte) 1, (-1.0f) };
        double double15 = tTestImpl3.homoscedasticT(doubleArray9, doubleArray14);
        double double16 = tTestImpl0.tTest((double) (short) 100, doubleArray9);
        org.apache.commons.math.distribution.TDistribution tDistribution18 = null;
        org.apache.commons.math.stat.inference.TTestImpl tTestImpl19 = new org.apache.commons.math.stat.inference.TTestImpl(tDistribution18);
        double[] doubleArray25 = new double[] { 1.0f, (short) 1, 100.0f, 1, 0.0f };
        double[] doubleArray30 = new double[] { ' ', (byte) 100, (byte) 1, (-1.0f) };
        double double31 = tTestImpl19.homoscedasticT(doubleArray25, doubleArray30);
        double[] doubleArray39 = new double[] { 1, 100.0f, (-1), (short) 100, 100, (-1) };
        double double40 = tTestImpl19.t((double) '4', doubleArray39);
        double double41 = tTestImpl0.tTest((double) (short) 100, doubleArray39);
        double[] doubleArray48 = new double[] { (byte) -1, (-1), 0.0f, 1.0d, (-1.0f) };
        double double49 = tTestImpl0.tTest(0.405429217622299d, doubleArray48);
        double[] doubleArray57 = new double[] { 10L, 0.9566618438474437d, 1.0f, 0.15639940166959065d, (short) 0, 0.15639940166959065d };
        double double58 = tTestImpl0.tTest(10.0d, doubleArray57);
        org.apache.commons.math.distribution.TDistribution tDistribution59 = null;
        tTestImpl0.setDistribution(tDistribution59);
        org.apache.commons.math.distribution.TDistribution tDistribution61 = null;
        tTestImpl0.setDistribution(tDistribution61);
        org.apache.commons.math.distribution.TDistribution tDistribution63 = null;
        tTestImpl0.setDistribution(tDistribution63);
        org.apache.commons.math.distribution.TDistribution tDistribution65 = null;
        tTestImpl0.setDistribution(tDistribution65);
        org.apache.commons.math.stat.descriptive.StatisticalSummary statisticalSummary67 = null;
        org.apache.commons.math.stat.descriptive.StatisticalSummary statisticalSummary68 = null;
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean70 = tTestImpl0.tTest(statisticalSummary67, statisticalSummary68, (-3.9998096691255283d));
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: bad significance level: -3.9998096691255283");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(doubleArray9);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray9), "[1.0, 1.0, 100.0, 1.0, 0.0]");
        org.junit.Assert.assertNotNull(doubleArray14);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray14), "[32.0, 100.0, 1.0, -1.0]");
        org.junit.Assert.assertTrue("'" + double15 + "' != '" + (-0.405429217622299d) + "'", double15 == (-0.405429217622299d));
        org.junit.Assert.assertTrue("'" + double16 + "' != '" + 0.01613264369976175d + "'", double16 == 0.01613264369976175d);
        org.junit.Assert.assertNotNull(doubleArray25);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray25), "[1.0, 1.0, 100.0, 1.0, 0.0]");
        org.junit.Assert.assertNotNull(doubleArray30);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray30), "[32.0, 100.0, 1.0, -1.0]");
        org.junit.Assert.assertTrue("'" + double31 + "' != '" + (-0.405429217622299d) + "'", double31 == (-0.405429217622299d));
        org.junit.Assert.assertNotNull(doubleArray39);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray39), "[1.0, 100.0, -1.0, 100.0, 100.0, -1.0]");
        org.junit.Assert.assertTrue("'" + double40 + "' != '" + (-0.09656583816243881d) + "'", double40 == (-0.09656583816243881d));
        org.junit.Assert.assertTrue("'" + double41 + "' != '" + 0.07560555610353314d + "'", double41 == 0.07560555610353314d);
        org.junit.Assert.assertNotNull(doubleArray48);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray48), "[-1.0, -1.0, 0.0, 1.0, -1.0]");
        org.junit.Assert.assertTrue("'" + double49 + "' != '" + 0.1143321549278642d + "'", double49 == 0.1143321549278642d);
        org.junit.Assert.assertNotNull(doubleArray57);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray57), "[10.0, 0.9566618438474437, 1.0, 0.15639940166959065, 0.0, 0.15639940166959065]");
        org.junit.Assert.assertTrue("'" + double58 + "' != '" + 0.004213458414249471d + "'", double58 == 0.004213458414249471d);
    }

    @Test
    public void test3024() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3024");
        org.apache.commons.math.stat.inference.TTestImpl tTestImpl0 = new org.apache.commons.math.stat.inference.TTestImpl();
        double[] doubleArray4 = new double[] { '4', 'a', '4' };
        org.apache.commons.math.distribution.TDistribution tDistribution5 = null;
        org.apache.commons.math.stat.inference.TTestImpl tTestImpl6 = new org.apache.commons.math.stat.inference.TTestImpl(tDistribution5);
        double[] doubleArray12 = new double[] { 1.0f, (short) 1, 100.0f, 1, 0.0f };
        double[] doubleArray17 = new double[] { ' ', (byte) 100, (byte) 1, (-1.0f) };
        double double18 = tTestImpl6.homoscedasticT(doubleArray12, doubleArray17);
        double double19 = tTestImpl0.tTest(doubleArray4, doubleArray17);
        org.apache.commons.math.distribution.TDistribution tDistribution20 = null;
        tTestImpl0.setDistribution(tDistribution20);
        org.apache.commons.math.distribution.TDistribution tDistribution22 = null;
        tTestImpl0.setDistribution(tDistribution22);
        org.apache.commons.math.distribution.TDistribution tDistribution25 = null;
        org.apache.commons.math.stat.inference.TTestImpl tTestImpl26 = new org.apache.commons.math.stat.inference.TTestImpl(tDistribution25);
        org.apache.commons.math.distribution.TDistribution tDistribution27 = null;
        tTestImpl26.setDistribution(tDistribution27);
        org.apache.commons.math.distribution.TDistribution tDistribution29 = null;
        org.apache.commons.math.stat.inference.TTestImpl tTestImpl30 = new org.apache.commons.math.stat.inference.TTestImpl(tDistribution29);
        double[] doubleArray36 = new double[] { 1.0f, (short) 1, 100.0f, 1, 0.0f };
        double[] doubleArray41 = new double[] { ' ', (byte) 100, (byte) 1, (-1.0f) };
        double double42 = tTestImpl30.homoscedasticT(doubleArray36, doubleArray41);
        org.apache.commons.math.stat.inference.TTestImpl tTestImpl43 = new org.apache.commons.math.stat.inference.TTestImpl();
        double[] doubleArray47 = new double[] { '4', 'a', '4' };
        org.apache.commons.math.distribution.TDistribution tDistribution48 = null;
        org.apache.commons.math.stat.inference.TTestImpl tTestImpl49 = new org.apache.commons.math.stat.inference.TTestImpl(tDistribution48);
        double[] doubleArray55 = new double[] { 1.0f, (short) 1, 100.0f, 1, 0.0f };
        double[] doubleArray60 = new double[] { ' ', (byte) 100, (byte) 1, (-1.0f) };
        double double61 = tTestImpl49.homoscedasticT(doubleArray55, doubleArray60);
        double double62 = tTestImpl43.tTest(doubleArray47, doubleArray60);
        double double63 = tTestImpl26.homoscedasticT(doubleArray41, doubleArray47);
        double double64 = tTestImpl0.t((double) (byte) 100, doubleArray47);
        org.apache.commons.math.stat.descriptive.StatisticalSummary statisticalSummary66 = null;
        // The following exception was thrown during execution in test generation
        try {
            double double67 = tTestImpl0.tTest((-1.587268255506484d), statisticalSummary66);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: insufficient data for t statistic");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(doubleArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray4), "[52.0, 97.0, 52.0]");
        org.junit.Assert.assertNotNull(doubleArray12);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray12), "[1.0, 1.0, 100.0, 1.0, 0.0]");
        org.junit.Assert.assertNotNull(doubleArray17);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray17), "[32.0, 100.0, 1.0, -1.0]");
        org.junit.Assert.assertTrue("'" + double18 + "' != '" + (-0.405429217622299d) + "'", double18 == (-0.405429217622299d));
        org.junit.Assert.assertTrue("'" + double19 + "' != '" + 0.2806531524060034d + "'", double19 == 0.2806531524060034d);
        org.junit.Assert.assertNotNull(doubleArray36);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray36), "[1.0, 1.0, 100.0, 1.0, 0.0]");
        org.junit.Assert.assertNotNull(doubleArray41);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray41), "[32.0, 100.0, 1.0, -1.0]");
        org.junit.Assert.assertTrue("'" + double42 + "' != '" + (-0.405429217622299d) + "'", double42 == (-0.405429217622299d));
        org.junit.Assert.assertNotNull(doubleArray47);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray47), "[52.0, 97.0, 52.0]");
        org.junit.Assert.assertNotNull(doubleArray55);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray55), "[1.0, 1.0, 100.0, 1.0, 0.0]");
        org.junit.Assert.assertNotNull(doubleArray60);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray60), "[32.0, 100.0, 1.0, -1.0]");
        org.junit.Assert.assertTrue("'" + double61 + "' != '" + (-0.405429217622299d) + "'", double61 == (-0.405429217622299d));
        org.junit.Assert.assertTrue("'" + double62 + "' != '" + 0.2806531524060034d + "'", double62 == 0.2806531524060034d);
        org.junit.Assert.assertTrue("'" + double63 + "' != '" + (-1.1115227041167497d) + "'", double63 == (-1.1115227041167497d));
        org.junit.Assert.assertTrue("'" + double64 + "' != '" + (-2.2d) + "'", double64 == (-2.2d));
    }
}

