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
    public void test3002() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3002");
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
    public void test3003() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3003");
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
    public void test3004() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3004");
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
    public void test3005() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3005");
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
    public void test3006() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3006");
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
    public void test3007() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3007");
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
    public void test3009() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3009");
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
    public void test3011() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3011");
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
    public void test3012() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3012");
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
    public void test3013() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3013");
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
    public void test3014() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3014");
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

    @Test
    public void test3015() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3015");
        org.apache.commons.math.stat.inference.TTestImpl tTestImpl0 = new org.apache.commons.math.stat.inference.TTestImpl();
        org.apache.commons.math.stat.inference.TTestImpl tTestImpl2 = new org.apache.commons.math.stat.inference.TTestImpl();
        double[] doubleArray6 = new double[] { '4', 'a', '4' };
        org.apache.commons.math.distribution.TDistribution tDistribution7 = null;
        org.apache.commons.math.stat.inference.TTestImpl tTestImpl8 = new org.apache.commons.math.stat.inference.TTestImpl(tDistribution7);
        double[] doubleArray14 = new double[] { 1.0f, (short) 1, 100.0f, 1, 0.0f };
        double[] doubleArray19 = new double[] { ' ', (byte) 100, (byte) 1, (-1.0f) };
        double double20 = tTestImpl8.homoscedasticT(doubleArray14, doubleArray19);
        double double21 = tTestImpl2.tTest(doubleArray6, doubleArray19);
        org.apache.commons.math.distribution.TDistribution tDistribution22 = null;
        tTestImpl2.setDistribution(tDistribution22);
        org.apache.commons.math.distribution.TDistribution tDistribution24 = null;
        org.apache.commons.math.stat.inference.TTestImpl tTestImpl25 = new org.apache.commons.math.stat.inference.TTestImpl(tDistribution24);
        double[] doubleArray31 = new double[] { 1.0f, (short) 1, 100.0f, 1, 0.0f };
        double[] doubleArray36 = new double[] { ' ', (byte) 100, (byte) 1, (-1.0f) };
        double double37 = tTestImpl25.homoscedasticT(doubleArray31, doubleArray36);
        double[] doubleArray45 = new double[] { 1, 100.0f, (-1), (short) 100, 100, (-1) };
        double double46 = tTestImpl25.t((double) '4', doubleArray45);
        org.apache.commons.math.distribution.TDistribution tDistribution47 = null;
        org.apache.commons.math.stat.inference.TTestImpl tTestImpl48 = new org.apache.commons.math.stat.inference.TTestImpl(tDistribution47);
        double[] doubleArray54 = new double[] { 1.0f, (short) 1, 100.0f, 1, 0.0f };
        double[] doubleArray59 = new double[] { ' ', (byte) 100, (byte) 1, (-1.0f) };
        double double60 = tTestImpl48.homoscedasticT(doubleArray54, doubleArray59);
        double double61 = tTestImpl2.t(doubleArray45, doubleArray59);
        boolean boolean63 = tTestImpl0.tTest((double) (short) 1, doubleArray59, 0.405429217622299d);
        org.apache.commons.math.distribution.TDistribution tDistribution64 = null;
        tTestImpl0.setDistribution(tDistribution64);
        org.apache.commons.math.stat.descriptive.StatisticalSummary statisticalSummary67 = null;
        // The following exception was thrown during execution in test generation
        try {
            double double68 = tTestImpl0.tTest(Double.NaN, statisticalSummary67);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: insufficient data for t statistic");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(doubleArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray6), "[52.0, 97.0, 52.0]");
        org.junit.Assert.assertNotNull(doubleArray14);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray14), "[1.0, 1.0, 100.0, 1.0, 0.0]");
        org.junit.Assert.assertNotNull(doubleArray19);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray19), "[32.0, 100.0, 1.0, -1.0]");
        org.junit.Assert.assertTrue("'" + double20 + "' != '" + (-0.405429217622299d) + "'", double20 == (-0.405429217622299d));
        org.junit.Assert.assertTrue("'" + double21 + "' != '" + 0.2806531524060034d + "'", double21 == 0.2806531524060034d);
        org.junit.Assert.assertNotNull(doubleArray31);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray31), "[1.0, 1.0, 100.0, 1.0, 0.0]");
        org.junit.Assert.assertNotNull(doubleArray36);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray36), "[32.0, 100.0, 1.0, -1.0]");
        org.junit.Assert.assertTrue("'" + double37 + "' != '" + (-0.405429217622299d) + "'", double37 == (-0.405429217622299d));
        org.junit.Assert.assertNotNull(doubleArray45);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray45), "[1.0, 100.0, -1.0, 100.0, 100.0, -1.0]");
        org.junit.Assert.assertTrue("'" + double46 + "' != '" + (-0.09656583816243881d) + "'", double46 == (-0.09656583816243881d));
        org.junit.Assert.assertNotNull(doubleArray54);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray54), "[1.0, 1.0, 100.0, 1.0, 0.0]");
        org.junit.Assert.assertNotNull(doubleArray59);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray59), "[32.0, 100.0, 1.0, -1.0]");
        org.junit.Assert.assertTrue("'" + double60 + "' != '" + (-0.405429217622299d) + "'", double60 == (-0.405429217622299d));
        org.junit.Assert.assertTrue("'" + double61 + "' != '" + 0.5172120199559697d + "'", double61 == 0.5172120199559697d);
        org.junit.Assert.assertTrue("'" + boolean63 + "' != '" + true + "'", boolean63 == true);
    }

    @Test
    public void test3016() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3016");
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
        org.apache.commons.math.stat.inference.TTestImpl tTestImpl25 = new org.apache.commons.math.stat.inference.TTestImpl();
        double[] doubleArray29 = new double[] { '4', 'a', '4' };
        org.apache.commons.math.distribution.TDistribution tDistribution30 = null;
        org.apache.commons.math.stat.inference.TTestImpl tTestImpl31 = new org.apache.commons.math.stat.inference.TTestImpl(tDistribution30);
        double[] doubleArray37 = new double[] { 1.0f, (short) 1, 100.0f, 1, 0.0f };
        double[] doubleArray42 = new double[] { ' ', (byte) 100, (byte) 1, (-1.0f) };
        double double43 = tTestImpl31.homoscedasticT(doubleArray37, doubleArray42);
        double double44 = tTestImpl25.tTest(doubleArray29, doubleArray42);
        double double45 = tTestImpl0.t(0.35800486798369846d, doubleArray42);
        org.apache.commons.math.distribution.TDistribution tDistribution46 = null;
        tTestImpl0.setDistribution(tDistribution46);
        org.apache.commons.math.stat.descriptive.StatisticalSummary statisticalSummary49 = null;
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean51 = tTestImpl0.tTest((-3.4598062306100013d), statisticalSummary49, 0.9566618438474437d);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: bad significance level: 0.9566618438474437");
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
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray29), "[52.0, 97.0, 52.0]");
        org.junit.Assert.assertNotNull(doubleArray37);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray37), "[1.0, 1.0, 100.0, 1.0, 0.0]");
        org.junit.Assert.assertNotNull(doubleArray42);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray42), "[32.0, 100.0, 1.0, -1.0]");
        org.junit.Assert.assertTrue("'" + double43 + "' != '" + (-0.405429217622299d) + "'", double43 == (-0.405429217622299d));
        org.junit.Assert.assertTrue("'" + double44 + "' != '" + 0.2806531524060034d + "'", double44 == 0.2806531524060034d);
        org.junit.Assert.assertTrue("'" + double45 + "' != '" + 1.384536475695448d + "'", double45 == 1.384536475695448d);
    }

    @Test
    public void test3017() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3017");
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
        org.apache.commons.math.stat.inference.TTestImpl tTestImpl35 = new org.apache.commons.math.stat.inference.TTestImpl();
        double[] doubleArray39 = new double[] { '4', 'a', '4' };
        org.apache.commons.math.distribution.TDistribution tDistribution40 = null;
        org.apache.commons.math.stat.inference.TTestImpl tTestImpl41 = new org.apache.commons.math.stat.inference.TTestImpl(tDistribution40);
        double[] doubleArray47 = new double[] { 1.0f, (short) 1, 100.0f, 1, 0.0f };
        double[] doubleArray52 = new double[] { ' ', (byte) 100, (byte) 1, (-1.0f) };
        double double53 = tTestImpl41.homoscedasticT(doubleArray47, doubleArray52);
        double double54 = tTestImpl35.tTest(doubleArray39, doubleArray52);
        org.apache.commons.math.distribution.TDistribution tDistribution55 = null;
        org.apache.commons.math.stat.inference.TTestImpl tTestImpl56 = new org.apache.commons.math.stat.inference.TTestImpl(tDistribution55);
        double[] doubleArray62 = new double[] { 1.0f, (short) 1, 100.0f, 1, 0.0f };
        double[] doubleArray67 = new double[] { ' ', (byte) 100, (byte) 1, (-1.0f) };
        double double68 = tTestImpl56.homoscedasticT(doubleArray62, doubleArray67);
        double double69 = tTestImpl22.t(doubleArray52, doubleArray67);
        boolean boolean71 = tTestImpl0.tTest((double) (short) 0, doubleArray52, Double.NaN);
        org.apache.commons.math.distribution.TDistribution tDistribution72 = null;
        tTestImpl0.setDistribution(tDistribution72);
        org.apache.commons.math.stat.descriptive.StatisticalSummary statisticalSummary75 = null;
        // The following exception was thrown during execution in test generation
        try {
            double double76 = tTestImpl0.t((-1.0105336460356238d), statisticalSummary75);
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
        org.junit.Assert.assertNotNull(doubleArray39);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray39), "[52.0, 97.0, 52.0]");
        org.junit.Assert.assertNotNull(doubleArray47);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray47), "[1.0, 1.0, 100.0, 1.0, 0.0]");
        org.junit.Assert.assertNotNull(doubleArray52);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray52), "[32.0, 100.0, 1.0, -1.0]");
        org.junit.Assert.assertTrue("'" + double53 + "' != '" + (-0.405429217622299d) + "'", double53 == (-0.405429217622299d));
        org.junit.Assert.assertTrue("'" + double54 + "' != '" + 0.2806531524060034d + "'", double54 == 0.2806531524060034d);
        org.junit.Assert.assertNotNull(doubleArray62);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray62), "[1.0, 1.0, 100.0, 1.0, 0.0]");
        org.junit.Assert.assertNotNull(doubleArray67);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray67), "[32.0, 100.0, 1.0, -1.0]");
        org.junit.Assert.assertTrue("'" + double68 + "' != '" + (-0.405429217622299d) + "'", double68 == (-0.405429217622299d));
        org.junit.Assert.assertTrue("'" + double69 + "' != '" + 0.0d + "'", double69 == 0.0d);
        org.junit.Assert.assertTrue("'" + boolean71 + "' != '" + false + "'", boolean71 == false);
    }

    @Test
    public void test3018() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3018");
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
        org.apache.commons.math.distribution.TDistribution tDistribution62 = null;
        tTestImpl0.setDistribution(tDistribution62);
        org.apache.commons.math.distribution.TDistribution tDistribution64 = null;
        tTestImpl0.setDistribution(tDistribution64);
        org.apache.commons.math.distribution.TDistribution tDistribution66 = null;
        tTestImpl0.setDistribution(tDistribution66);
        double[] doubleArray74 = new double[] { (-2.8418588844347075d), 100.0f, (-1.0f), 0.35800486798369846d, 0.01613264369976175d };
        double double75 = tTestImpl0.t((double) (short) 0, doubleArray74);
        org.apache.commons.math.distribution.TDistribution tDistribution76 = null;
        tTestImpl0.setDistribution(tDistribution76);
        org.apache.commons.math.stat.descriptive.StatisticalSummary statisticalSummary78 = null;
        org.apache.commons.math.stat.descriptive.StatisticalSummary statisticalSummary79 = null;
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean81 = tTestImpl0.tTest(statisticalSummary78, statisticalSummary79, (double) (-1.0f));
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: bad significance level: -1.0");
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
        org.junit.Assert.assertNotNull(doubleArray74);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray74), "[-2.8418588844347075, 100.0, -1.0, 0.35800486798369846, 0.01613264369976175]");
        org.junit.Assert.assertTrue("'" + double75 + "' != '" + 0.9566618438474437d + "'", double75 == 0.9566618438474437d);
    }

    @Test
    public void test3019() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3019");
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
        java.lang.Class<?> wildcardClass67 = tTestImpl1.getClass();
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
        org.junit.Assert.assertNotNull(wildcardClass67);
    }

    @Test
    public void test3020() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3020");
        org.apache.commons.math.stat.inference.TTestImpl tTestImpl0 = new org.apache.commons.math.stat.inference.TTestImpl();
        org.apache.commons.math.stat.inference.TTestImpl tTestImpl2 = new org.apache.commons.math.stat.inference.TTestImpl();
        org.apache.commons.math.distribution.TDistribution tDistribution4 = null;
        org.apache.commons.math.stat.inference.TTestImpl tTestImpl5 = new org.apache.commons.math.stat.inference.TTestImpl(tDistribution4);
        double[] doubleArray11 = new double[] { 1.0f, (short) 1, 100.0f, 1, 0.0f };
        double[] doubleArray16 = new double[] { ' ', (byte) 100, (byte) 1, (-1.0f) };
        double double17 = tTestImpl5.homoscedasticT(doubleArray11, doubleArray16);
        double double18 = tTestImpl2.tTest((double) (short) 100, doubleArray11);
        org.apache.commons.math.distribution.TDistribution tDistribution20 = null;
        org.apache.commons.math.stat.inference.TTestImpl tTestImpl21 = new org.apache.commons.math.stat.inference.TTestImpl(tDistribution20);
        double[] doubleArray27 = new double[] { 1.0f, (short) 1, 100.0f, 1, 0.0f };
        double[] doubleArray32 = new double[] { ' ', (byte) 100, (byte) 1, (-1.0f) };
        double double33 = tTestImpl21.homoscedasticT(doubleArray27, doubleArray32);
        double[] doubleArray41 = new double[] { 1, 100.0f, (-1), (short) 100, 100, (-1) };
        double double42 = tTestImpl21.t((double) '4', doubleArray41);
        double double43 = tTestImpl2.tTest((double) (short) 100, doubleArray41);
        double[] doubleArray50 = new double[] { (byte) -1, (-1), 0.0f, 1.0d, (-1.0f) };
        double double51 = tTestImpl2.tTest(0.405429217622299d, doubleArray50);
        double double52 = tTestImpl0.t(3.8d, doubleArray50);
        org.apache.commons.math.distribution.TDistribution tDistribution53 = null;
        tTestImpl0.setDistribution(tDistribution53);
        org.apache.commons.math.distribution.TDistribution tDistribution55 = null;
        tTestImpl0.setDistribution(tDistribution55);
        org.apache.commons.math.distribution.TDistribution tDistribution57 = null;
        tTestImpl0.setDistribution(tDistribution57);
        org.apache.commons.math.distribution.TDistribution tDistribution59 = null;
        tTestImpl0.setDistribution(tDistribution59);
        org.apache.commons.math.stat.descriptive.StatisticalSummary statisticalSummary61 = null;
        org.apache.commons.math.stat.descriptive.StatisticalSummary statisticalSummary62 = null;
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean64 = tTestImpl0.tTest(statisticalSummary61, statisticalSummary62, 0.12673187601587688d);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: insufficient data for t statistic");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(doubleArray11);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray11), "[1.0, 1.0, 100.0, 1.0, 0.0]");
        org.junit.Assert.assertNotNull(doubleArray16);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray16), "[32.0, 100.0, 1.0, -1.0]");
        org.junit.Assert.assertTrue("'" + double17 + "' != '" + (-0.405429217622299d) + "'", double17 == (-0.405429217622299d));
        org.junit.Assert.assertTrue("'" + double18 + "' != '" + 0.01613264369976175d + "'", double18 == 0.01613264369976175d);
        org.junit.Assert.assertNotNull(doubleArray27);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray27), "[1.0, 1.0, 100.0, 1.0, 0.0]");
        org.junit.Assert.assertNotNull(doubleArray32);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray32), "[32.0, 100.0, 1.0, -1.0]");
        org.junit.Assert.assertTrue("'" + double33 + "' != '" + (-0.405429217622299d) + "'", double33 == (-0.405429217622299d));
        org.junit.Assert.assertNotNull(doubleArray41);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray41), "[1.0, 100.0, -1.0, 100.0, 100.0, -1.0]");
        org.junit.Assert.assertTrue("'" + double42 + "' != '" + (-0.09656583816243881d) + "'", double42 == (-0.09656583816243881d));
        org.junit.Assert.assertTrue("'" + double43 + "' != '" + 0.07560555610353314d + "'", double43 == 0.07560555610353314d);
        org.junit.Assert.assertNotNull(doubleArray50);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray50), "[-1.0, -1.0, 0.0, 1.0, -1.0]");
        org.junit.Assert.assertTrue("'" + double51 + "' != '" + 0.1143321549278642d + "'", double51 == 0.1143321549278642d);
        org.junit.Assert.assertTrue("'" + double52 + "' != '" + (-10.500000000000002d) + "'", double52 == (-10.500000000000002d));
    }

    @Test
    public void test3021() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3021");
        org.apache.commons.math.stat.inference.TTestImpl tTestImpl0 = new org.apache.commons.math.stat.inference.TTestImpl();
        org.apache.commons.math.distribution.TDistribution tDistribution2 = null;
        org.apache.commons.math.stat.inference.TTestImpl tTestImpl3 = new org.apache.commons.math.stat.inference.TTestImpl(tDistribution2);
        double[] doubleArray9 = new double[] { 1.0f, (short) 1, 100.0f, 1, 0.0f };
        double[] doubleArray14 = new double[] { ' ', (byte) 100, (byte) 1, (-1.0f) };
        double double15 = tTestImpl3.homoscedasticT(doubleArray9, doubleArray14);
        org.apache.commons.math.distribution.TDistribution tDistribution16 = null;
        tTestImpl3.setDistribution(tDistribution16);
        org.apache.commons.math.stat.inference.TTestImpl tTestImpl19 = new org.apache.commons.math.stat.inference.TTestImpl();
        double[] doubleArray23 = new double[] { '4', 'a', '4' };
        org.apache.commons.math.distribution.TDistribution tDistribution24 = null;
        org.apache.commons.math.stat.inference.TTestImpl tTestImpl25 = new org.apache.commons.math.stat.inference.TTestImpl(tDistribution24);
        double[] doubleArray31 = new double[] { 1.0f, (short) 1, 100.0f, 1, 0.0f };
        double[] doubleArray36 = new double[] { ' ', (byte) 100, (byte) 1, (-1.0f) };
        double double37 = tTestImpl25.homoscedasticT(doubleArray31, doubleArray36);
        double double38 = tTestImpl19.tTest(doubleArray23, doubleArray36);
        double double39 = tTestImpl3.t(10.0d, doubleArray23);
        org.apache.commons.math.distribution.TDistribution tDistribution40 = null;
        org.apache.commons.math.stat.inference.TTestImpl tTestImpl41 = new org.apache.commons.math.stat.inference.TTestImpl(tDistribution40);
        double[] doubleArray47 = new double[] { 1.0f, (short) 1, 100.0f, 1, 0.0f };
        double[] doubleArray52 = new double[] { ' ', (byte) 100, (byte) 1, (-1.0f) };
        double double53 = tTestImpl41.homoscedasticT(doubleArray47, doubleArray52);
        org.apache.commons.math.distribution.TDistribution tDistribution54 = null;
        org.apache.commons.math.stat.inference.TTestImpl tTestImpl55 = new org.apache.commons.math.stat.inference.TTestImpl(tDistribution54);
        double[] doubleArray61 = new double[] { 1.0f, (short) 1, 100.0f, 1, 0.0f };
        double[] doubleArray66 = new double[] { ' ', (byte) 100, (byte) 1, (-1.0f) };
        double double67 = tTestImpl55.homoscedasticT(doubleArray61, doubleArray66);
        org.apache.commons.math.stat.inference.TTestImpl tTestImpl69 = new org.apache.commons.math.stat.inference.TTestImpl();
        org.apache.commons.math.distribution.TDistribution tDistribution71 = null;
        org.apache.commons.math.stat.inference.TTestImpl tTestImpl72 = new org.apache.commons.math.stat.inference.TTestImpl(tDistribution71);
        double[] doubleArray78 = new double[] { 1.0f, (short) 1, 100.0f, 1, 0.0f };
        double[] doubleArray83 = new double[] { ' ', (byte) 100, (byte) 1, (-1.0f) };
        double double84 = tTestImpl72.homoscedasticT(doubleArray78, doubleArray83);
        double double85 = tTestImpl69.tTest((double) (short) 100, doubleArray78);
        double double86 = tTestImpl55.t((double) 10.0f, doubleArray78);
        double double87 = tTestImpl3.homoscedasticT(doubleArray52, doubleArray78);
        double double88 = tTestImpl0.t((double) 100.0f, doubleArray78);
        java.lang.Class<?> wildcardClass89 = tTestImpl0.getClass();
        org.junit.Assert.assertNotNull(doubleArray9);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray9), "[1.0, 1.0, 100.0, 1.0, 0.0]");
        org.junit.Assert.assertNotNull(doubleArray14);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray14), "[32.0, 100.0, 1.0, -1.0]");
        org.junit.Assert.assertTrue("'" + double15 + "' != '" + (-0.405429217622299d) + "'", double15 == (-0.405429217622299d));
        org.junit.Assert.assertNotNull(doubleArray23);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray23), "[52.0, 97.0, 52.0]");
        org.junit.Assert.assertNotNull(doubleArray31);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray31), "[1.0, 1.0, 100.0, 1.0, 0.0]");
        org.junit.Assert.assertNotNull(doubleArray36);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray36), "[32.0, 100.0, 1.0, -1.0]");
        org.junit.Assert.assertTrue("'" + double37 + "' != '" + (-0.405429217622299d) + "'", double37 == (-0.405429217622299d));
        org.junit.Assert.assertTrue("'" + double38 + "' != '" + 0.2806531524060034d + "'", double38 == 0.2806531524060034d);
        org.junit.Assert.assertTrue("'" + double39 + "' != '" + 3.8d + "'", double39 == 3.8d);
        org.junit.Assert.assertNotNull(doubleArray47);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray47), "[1.0, 1.0, 100.0, 1.0, 0.0]");
        org.junit.Assert.assertNotNull(doubleArray52);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray52), "[32.0, 100.0, 1.0, -1.0]");
        org.junit.Assert.assertTrue("'" + double53 + "' != '" + (-0.405429217622299d) + "'", double53 == (-0.405429217622299d));
        org.junit.Assert.assertNotNull(doubleArray61);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray61), "[1.0, 1.0, 100.0, 1.0, 0.0]");
        org.junit.Assert.assertNotNull(doubleArray66);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray66), "[32.0, 100.0, 1.0, -1.0]");
        org.junit.Assert.assertTrue("'" + double67 + "' != '" + (-0.405429217622299d) + "'", double67 == (-0.405429217622299d));
        org.junit.Assert.assertNotNull(doubleArray78);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray78), "[1.0, 1.0, 100.0, 1.0, 0.0]");
        org.junit.Assert.assertNotNull(doubleArray83);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray83), "[32.0, 100.0, 1.0, -1.0]");
        org.junit.Assert.assertTrue("'" + double84 + "' != '" + (-0.405429217622299d) + "'", double84 == (-0.405429217622299d));
        org.junit.Assert.assertTrue("'" + double85 + "' != '" + 0.01613264369976175d + "'", double85 == 0.01613264369976175d);
        org.junit.Assert.assertTrue("'" + double86 + "' != '" + 0.5339796283719219d + "'", double86 == 0.5339796283719219d);
        org.junit.Assert.assertTrue("'" + double87 + "' != '" + 0.405429217622299d + "'", double87 == 0.405429217622299d);
        org.junit.Assert.assertTrue("'" + double88 + "' != '" + (-3.9998096691255283d) + "'", double88 == (-3.9998096691255283d));
        org.junit.Assert.assertNotNull(wildcardClass89);
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
        org.apache.commons.math.distribution.TDistribution tDistribution21 = null;
        org.apache.commons.math.stat.inference.TTestImpl tTestImpl22 = new org.apache.commons.math.stat.inference.TTestImpl(tDistribution21);
        double[] doubleArray28 = new double[] { 1.0f, (short) 1, 100.0f, 1, 0.0f };
        double[] doubleArray33 = new double[] { ' ', (byte) 100, (byte) 1, (-1.0f) };
        double double34 = tTestImpl22.homoscedasticT(doubleArray28, doubleArray33);
        double double35 = tTestImpl0.t((double) 1L, doubleArray33);
        org.apache.commons.math.stat.descriptive.StatisticalSummary statisticalSummary36 = null;
        org.apache.commons.math.stat.descriptive.StatisticalSummary statisticalSummary37 = null;
        // The following exception was thrown during execution in test generation
        try {
            double double38 = tTestImpl0.homoscedasticT(statisticalSummary36, statisticalSummary37);
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
    public void test3023() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3023");
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
        org.apache.commons.math.stat.descriptive.StatisticalSummary statisticalSummary94 = null;
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean96 = tTestImpl0.tTest(0.982920007042921d, statisticalSummary94, 0.987358558121667d);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: bad significance level: 0.987358558121667");
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
    public void test3024() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3024");
        org.apache.commons.math.distribution.TDistribution tDistribution0 = null;
        org.apache.commons.math.stat.inference.TTestImpl tTestImpl1 = new org.apache.commons.math.stat.inference.TTestImpl(tDistribution0);
        double[] doubleArray7 = new double[] { 1.0f, (short) 1, 100.0f, 1, 0.0f };
        double[] doubleArray12 = new double[] { ' ', (byte) 100, (byte) 1, (-1.0f) };
        double double13 = tTestImpl1.homoscedasticT(doubleArray7, doubleArray12);
        org.apache.commons.math.stat.inference.TTestImpl tTestImpl14 = new org.apache.commons.math.stat.inference.TTestImpl();
        double[] doubleArray18 = new double[] { '4', 'a', '4' };
        org.apache.commons.math.distribution.TDistribution tDistribution19 = null;
        org.apache.commons.math.stat.inference.TTestImpl tTestImpl20 = new org.apache.commons.math.stat.inference.TTestImpl(tDistribution19);
        double[] doubleArray26 = new double[] { 1.0f, (short) 1, 100.0f, 1, 0.0f };
        double[] doubleArray31 = new double[] { ' ', (byte) 100, (byte) 1, (-1.0f) };
        double double32 = tTestImpl20.homoscedasticT(doubleArray26, doubleArray31);
        double double33 = tTestImpl14.tTest(doubleArray18, doubleArray31);
        org.apache.commons.math.distribution.TDistribution tDistribution34 = null;
        org.apache.commons.math.stat.inference.TTestImpl tTestImpl35 = new org.apache.commons.math.stat.inference.TTestImpl(tDistribution34);
        double[] doubleArray41 = new double[] { 1.0f, (short) 1, 100.0f, 1, 0.0f };
        double[] doubleArray46 = new double[] { ' ', (byte) 100, (byte) 1, (-1.0f) };
        double double47 = tTestImpl35.homoscedasticT(doubleArray41, doubleArray46);
        double double48 = tTestImpl1.t(doubleArray31, doubleArray46);
        org.apache.commons.math.distribution.TDistribution tDistribution49 = null;
        tTestImpl1.setDistribution(tDistribution49);
        org.apache.commons.math.distribution.TDistribution tDistribution51 = null;
        tTestImpl1.setDistribution(tDistribution51);
        org.apache.commons.math.stat.descriptive.StatisticalSummary statisticalSummary54 = null;
        // The following exception was thrown during execution in test generation
        try {
            double double55 = tTestImpl1.t(1.3573057358494125d, statisticalSummary54);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: insufficient data for t statistic");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(doubleArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray7), "[1.0, 1.0, 100.0, 1.0, 0.0]");
        org.junit.Assert.assertNotNull(doubleArray12);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray12), "[32.0, 100.0, 1.0, -1.0]");
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + (-0.405429217622299d) + "'", double13 == (-0.405429217622299d));
        org.junit.Assert.assertNotNull(doubleArray18);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray18), "[52.0, 97.0, 52.0]");
        org.junit.Assert.assertNotNull(doubleArray26);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray26), "[1.0, 1.0, 100.0, 1.0, 0.0]");
        org.junit.Assert.assertNotNull(doubleArray31);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray31), "[32.0, 100.0, 1.0, -1.0]");
        org.junit.Assert.assertTrue("'" + double32 + "' != '" + (-0.405429217622299d) + "'", double32 == (-0.405429217622299d));
        org.junit.Assert.assertTrue("'" + double33 + "' != '" + 0.2806531524060034d + "'", double33 == 0.2806531524060034d);
        org.junit.Assert.assertNotNull(doubleArray41);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray41), "[1.0, 1.0, 100.0, 1.0, 0.0]");
        org.junit.Assert.assertNotNull(doubleArray46);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray46), "[32.0, 100.0, 1.0, -1.0]");
        org.junit.Assert.assertTrue("'" + double47 + "' != '" + (-0.405429217622299d) + "'", double47 == (-0.405429217622299d));
        org.junit.Assert.assertTrue("'" + double48 + "' != '" + 0.0d + "'", double48 == 0.0d);
    }

    @Test
    public void test3025() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3025");
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
        org.apache.commons.math.stat.descriptive.StatisticalSummary statisticalSummary95 = null;
        org.apache.commons.math.stat.descriptive.StatisticalSummary statisticalSummary96 = null;
        // The following exception was thrown during execution in test generation
        try {
            double double97 = tTestImpl0.tTest(statisticalSummary95, statisticalSummary96);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: insufficient data for t statistic");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
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
    public void test3026() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3026");
        org.apache.commons.math.stat.inference.TTestImpl tTestImpl0 = new org.apache.commons.math.stat.inference.TTestImpl();
        org.apache.commons.math.distribution.TDistribution tDistribution1 = null;
        tTestImpl0.setDistribution(tDistribution1);
        org.apache.commons.math.distribution.TDistribution tDistribution3 = null;
        tTestImpl0.setDistribution(tDistribution3);
        org.apache.commons.math.distribution.TDistribution tDistribution5 = null;
        tTestImpl0.setDistribution(tDistribution5);
        org.apache.commons.math.distribution.TDistribution tDistribution7 = null;
        tTestImpl0.setDistribution(tDistribution7);
        org.apache.commons.math.distribution.TDistribution tDistribution10 = null;
        org.apache.commons.math.stat.inference.TTestImpl tTestImpl11 = new org.apache.commons.math.stat.inference.TTestImpl(tDistribution10);
        double[] doubleArray17 = new double[] { 1.0f, (short) 1, 100.0f, 1, 0.0f };
        double[] doubleArray22 = new double[] { ' ', (byte) 100, (byte) 1, (-1.0f) };
        double double23 = tTestImpl11.homoscedasticT(doubleArray17, doubleArray22);
        org.apache.commons.math.distribution.TDistribution tDistribution24 = null;
        tTestImpl11.setDistribution(tDistribution24);
        org.apache.commons.math.distribution.TDistribution tDistribution26 = null;
        tTestImpl11.setDistribution(tDistribution26);
        org.apache.commons.math.distribution.TDistribution tDistribution29 = null;
        org.apache.commons.math.stat.inference.TTestImpl tTestImpl30 = new org.apache.commons.math.stat.inference.TTestImpl(tDistribution29);
        org.apache.commons.math.distribution.TDistribution tDistribution31 = null;
        tTestImpl30.setDistribution(tDistribution31);
        org.apache.commons.math.distribution.TDistribution tDistribution34 = null;
        org.apache.commons.math.stat.inference.TTestImpl tTestImpl35 = new org.apache.commons.math.stat.inference.TTestImpl(tDistribution34);
        org.apache.commons.math.distribution.TDistribution tDistribution36 = null;
        tTestImpl35.setDistribution(tDistribution36);
        org.apache.commons.math.stat.inference.TTestImpl tTestImpl39 = new org.apache.commons.math.stat.inference.TTestImpl();
        org.apache.commons.math.stat.inference.TTestImpl tTestImpl41 = new org.apache.commons.math.stat.inference.TTestImpl();
        org.apache.commons.math.distribution.TDistribution tDistribution43 = null;
        org.apache.commons.math.stat.inference.TTestImpl tTestImpl44 = new org.apache.commons.math.stat.inference.TTestImpl(tDistribution43);
        double[] doubleArray50 = new double[] { 1.0f, (short) 1, 100.0f, 1, 0.0f };
        double[] doubleArray55 = new double[] { ' ', (byte) 100, (byte) 1, (-1.0f) };
        double double56 = tTestImpl44.homoscedasticT(doubleArray50, doubleArray55);
        double double57 = tTestImpl41.tTest((double) (short) 100, doubleArray50);
        org.apache.commons.math.distribution.TDistribution tDistribution59 = null;
        org.apache.commons.math.stat.inference.TTestImpl tTestImpl60 = new org.apache.commons.math.stat.inference.TTestImpl(tDistribution59);
        double[] doubleArray66 = new double[] { 1.0f, (short) 1, 100.0f, 1, 0.0f };
        double[] doubleArray71 = new double[] { ' ', (byte) 100, (byte) 1, (-1.0f) };
        double double72 = tTestImpl60.homoscedasticT(doubleArray66, doubleArray71);
        double[] doubleArray80 = new double[] { 1, 100.0f, (-1), (short) 100, 100, (-1) };
        double double81 = tTestImpl60.t((double) '4', doubleArray80);
        double double82 = tTestImpl41.tTest((double) (short) 100, doubleArray80);
        double[] doubleArray89 = new double[] { (byte) -1, (-1), 0.0f, 1.0d, (-1.0f) };
        double double90 = tTestImpl41.tTest(0.405429217622299d, doubleArray89);
        double double91 = tTestImpl39.t(3.8d, doubleArray89);
        double double92 = tTestImpl35.t((double) (short) 1, doubleArray89);
        double double93 = tTestImpl30.t(0.9839224922440002d, doubleArray89);
        double double94 = tTestImpl11.t((double) (-1), doubleArray89);
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean96 = tTestImpl0.tTest(0.0d, doubleArray89, (double) 0L);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: bad significance level: 0.0");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(doubleArray17);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray17), "[1.0, 1.0, 100.0, 1.0, 0.0]");
        org.junit.Assert.assertNotNull(doubleArray22);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray22), "[32.0, 100.0, 1.0, -1.0]");
        org.junit.Assert.assertTrue("'" + double23 + "' != '" + (-0.405429217622299d) + "'", double23 == (-0.405429217622299d));
        org.junit.Assert.assertNotNull(doubleArray50);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray50), "[1.0, 1.0, 100.0, 1.0, 0.0]");
        org.junit.Assert.assertNotNull(doubleArray55);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray55), "[32.0, 100.0, 1.0, -1.0]");
        org.junit.Assert.assertTrue("'" + double56 + "' != '" + (-0.405429217622299d) + "'", double56 == (-0.405429217622299d));
        org.junit.Assert.assertTrue("'" + double57 + "' != '" + 0.01613264369976175d + "'", double57 == 0.01613264369976175d);
        org.junit.Assert.assertNotNull(doubleArray66);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray66), "[1.0, 1.0, 100.0, 1.0, 0.0]");
        org.junit.Assert.assertNotNull(doubleArray71);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray71), "[32.0, 100.0, 1.0, -1.0]");
        org.junit.Assert.assertTrue("'" + double72 + "' != '" + (-0.405429217622299d) + "'", double72 == (-0.405429217622299d));
        org.junit.Assert.assertNotNull(doubleArray80);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray80), "[1.0, 100.0, -1.0, 100.0, 100.0, -1.0]");
        org.junit.Assert.assertTrue("'" + double81 + "' != '" + (-0.09656583816243881d) + "'", double81 == (-0.09656583816243881d));
        org.junit.Assert.assertTrue("'" + double82 + "' != '" + 0.07560555610353314d + "'", double82 == 0.07560555610353314d);
        org.junit.Assert.assertNotNull(doubleArray89);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray89), "[-1.0, -1.0, 0.0, 1.0, -1.0]");
        org.junit.Assert.assertTrue("'" + double90 + "' != '" + 0.1143321549278642d + "'", double90 == 0.1143321549278642d);
        org.junit.Assert.assertTrue("'" + double91 + "' != '" + (-10.500000000000002d) + "'", double91 == (-10.500000000000002d));
        org.junit.Assert.assertTrue("'" + double92 + "' != '" + (-3.5d) + "'", double92 == (-3.5d));
        org.junit.Assert.assertTrue("'" + double93 + "' != '" + (-3.4598062306100013d) + "'", double93 == (-3.4598062306100013d));
        org.junit.Assert.assertTrue("'" + double94 + "' != '" + 1.5d + "'", double94 == 1.5d);
    }

    @Test
    public void test3027() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3027");
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
        org.apache.commons.math.stat.descriptive.StatisticalSummary statisticalSummary82 = null;
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean84 = tTestImpl1.tTest((-0.5172120199559697d), statisticalSummary82, 2.2085058899383956d);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: bad significance level: 2.2085058899383956");
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
    public void test3028() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3028");
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
        org.apache.commons.math.stat.descriptive.StatisticalSummary statisticalSummary41 = null;
        // The following exception was thrown during execution in test generation
        try {
            double double42 = tTestImpl0.tTest((double) (short) 0, statisticalSummary41);
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
    }

    @Test
    public void test3029() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3029");
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
        org.apache.commons.math.distribution.TDistribution tDistribution39 = null;
        tTestImpl1.setDistribution(tDistribution39);
        org.apache.commons.math.distribution.TDistribution tDistribution41 = null;
        tTestImpl1.setDistribution(tDistribution41);
        org.apache.commons.math.distribution.TDistribution tDistribution43 = null;
        tTestImpl1.setDistribution(tDistribution43);
        org.apache.commons.math.stat.descriptive.StatisticalSummary statisticalSummary45 = null;
        org.apache.commons.math.stat.descriptive.StatisticalSummary statisticalSummary46 = null;
        // The following exception was thrown during execution in test generation
        try {
            double double47 = tTestImpl1.homoscedasticT(statisticalSummary45, statisticalSummary46);
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
    }

    @Test
    public void test3030() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3030");
        org.apache.commons.math.distribution.TDistribution tDistribution0 = null;
        org.apache.commons.math.stat.inference.TTestImpl tTestImpl1 = new org.apache.commons.math.stat.inference.TTestImpl(tDistribution0);
        org.apache.commons.math.stat.inference.TTestImpl tTestImpl3 = new org.apache.commons.math.stat.inference.TTestImpl();
        double[] doubleArray7 = new double[] { '4', 'a', '4' };
        org.apache.commons.math.distribution.TDistribution tDistribution8 = null;
        org.apache.commons.math.stat.inference.TTestImpl tTestImpl9 = new org.apache.commons.math.stat.inference.TTestImpl(tDistribution8);
        double[] doubleArray15 = new double[] { 1.0f, (short) 1, 100.0f, 1, 0.0f };
        double[] doubleArray20 = new double[] { ' ', (byte) 100, (byte) 1, (-1.0f) };
        double double21 = tTestImpl9.homoscedasticT(doubleArray15, doubleArray20);
        double double22 = tTestImpl3.tTest(doubleArray7, doubleArray20);
        org.apache.commons.math.distribution.TDistribution tDistribution23 = null;
        tTestImpl3.setDistribution(tDistribution23);
        org.apache.commons.math.distribution.TDistribution tDistribution25 = null;
        tTestImpl3.setDistribution(tDistribution25);
        org.apache.commons.math.stat.inference.TTestImpl tTestImpl28 = new org.apache.commons.math.stat.inference.TTestImpl();
        double[] doubleArray32 = new double[] { '4', 'a', '4' };
        org.apache.commons.math.distribution.TDistribution tDistribution33 = null;
        org.apache.commons.math.stat.inference.TTestImpl tTestImpl34 = new org.apache.commons.math.stat.inference.TTestImpl(tDistribution33);
        double[] doubleArray40 = new double[] { 1.0f, (short) 1, 100.0f, 1, 0.0f };
        double[] doubleArray45 = new double[] { ' ', (byte) 100, (byte) 1, (-1.0f) };
        double double46 = tTestImpl34.homoscedasticT(doubleArray40, doubleArray45);
        double double47 = tTestImpl28.tTest(doubleArray32, doubleArray45);
        double double48 = tTestImpl3.t(0.35800486798369846d, doubleArray45);
        // The following exception was thrown during execution in test generation
        try {
            double double49 = tTestImpl1.tTest(0.004213458414249471d, doubleArray45);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(doubleArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray7), "[52.0, 97.0, 52.0]");
        org.junit.Assert.assertNotNull(doubleArray15);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray15), "[1.0, 1.0, 100.0, 1.0, 0.0]");
        org.junit.Assert.assertNotNull(doubleArray20);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray20), "[32.0, 100.0, 1.0, -1.0]");
        org.junit.Assert.assertTrue("'" + double21 + "' != '" + (-0.405429217622299d) + "'", double21 == (-0.405429217622299d));
        org.junit.Assert.assertTrue("'" + double22 + "' != '" + 0.2806531524060034d + "'", double22 == 0.2806531524060034d);
        org.junit.Assert.assertNotNull(doubleArray32);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray32), "[52.0, 97.0, 52.0]");
        org.junit.Assert.assertNotNull(doubleArray40);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray40), "[1.0, 1.0, 100.0, 1.0, 0.0]");
        org.junit.Assert.assertNotNull(doubleArray45);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray45), "[32.0, 100.0, 1.0, -1.0]");
        org.junit.Assert.assertTrue("'" + double46 + "' != '" + (-0.405429217622299d) + "'", double46 == (-0.405429217622299d));
        org.junit.Assert.assertTrue("'" + double47 + "' != '" + 0.2806531524060034d + "'", double47 == 0.2806531524060034d);
        org.junit.Assert.assertTrue("'" + double48 + "' != '" + 1.384536475695448d + "'", double48 == 1.384536475695448d);
    }

    @Test
    public void test3031() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3031");
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
        org.apache.commons.math.distribution.TDistribution tDistribution62 = null;
        tTestImpl0.setDistribution(tDistribution62);
        org.apache.commons.math.stat.inference.TTestImpl tTestImpl65 = new org.apache.commons.math.stat.inference.TTestImpl();
        org.apache.commons.math.distribution.TDistribution tDistribution66 = null;
        tTestImpl65.setDistribution(tDistribution66);
        org.apache.commons.math.distribution.TDistribution tDistribution68 = null;
        tTestImpl65.setDistribution(tDistribution68);
        org.apache.commons.math.distribution.TDistribution tDistribution71 = null;
        org.apache.commons.math.stat.inference.TTestImpl tTestImpl72 = new org.apache.commons.math.stat.inference.TTestImpl(tDistribution71);
        double[] doubleArray78 = new double[] { 1.0f, (short) 1, 100.0f, 1, 0.0f };
        double[] doubleArray83 = new double[] { ' ', (byte) 100, (byte) 1, (-1.0f) };
        double double84 = tTestImpl72.homoscedasticT(doubleArray78, doubleArray83);
        double double85 = tTestImpl65.t(3.8d, doubleArray78);
        double double86 = tTestImpl0.t((double) 10L, doubleArray78);
        org.apache.commons.math.distribution.TDistribution tDistribution87 = null;
        tTestImpl0.setDistribution(tDistribution87);
        org.apache.commons.math.stat.descriptive.StatisticalSummary statisticalSummary90 = null;
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean92 = tTestImpl0.tTest(0.3793626154059051d, statisticalSummary90, 0.0d);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: bad significance level: 0.0");
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
        org.junit.Assert.assertNotNull(doubleArray78);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray78), "[1.0, 1.0, 100.0, 1.0, 0.0]");
        org.junit.Assert.assertNotNull(doubleArray83);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray83), "[32.0, 100.0, 1.0, -1.0]");
        org.junit.Assert.assertTrue("'" + double84 + "' != '" + (-0.405429217622299d) + "'", double84 == (-0.405429217622299d));
        org.junit.Assert.assertTrue("'" + double85 + "' != '" + 0.8463073355328574d + "'", double85 == 0.8463073355328574d);
        org.junit.Assert.assertTrue("'" + double86 + "' != '" + 0.5339796283719219d + "'", double86 == 0.5339796283719219d);
    }

    @Test
    public void test3032() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3032");
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
        org.apache.commons.math.distribution.TDistribution tDistribution24 = null;
        tTestImpl0.setDistribution(tDistribution24);
        org.apache.commons.math.distribution.TDistribution tDistribution27 = null;
        org.apache.commons.math.stat.inference.TTestImpl tTestImpl28 = new org.apache.commons.math.stat.inference.TTestImpl(tDistribution27);
        double[] doubleArray34 = new double[] { 1.0f, (short) 1, 100.0f, 1, 0.0f };
        double[] doubleArray39 = new double[] { ' ', (byte) 100, (byte) 1, (-1.0f) };
        double double40 = tTestImpl28.homoscedasticT(doubleArray34, doubleArray39);
        double[] doubleArray48 = new double[] { 1, 100.0f, (-1), (short) 100, 100, (-1) };
        double double49 = tTestImpl28.t((double) '4', doubleArray48);
        org.apache.commons.math.distribution.TDistribution tDistribution51 = null;
        org.apache.commons.math.stat.inference.TTestImpl tTestImpl52 = new org.apache.commons.math.stat.inference.TTestImpl(tDistribution51);
        org.apache.commons.math.distribution.TDistribution tDistribution53 = null;
        tTestImpl52.setDistribution(tDistribution53);
        org.apache.commons.math.distribution.TDistribution tDistribution55 = null;
        org.apache.commons.math.stat.inference.TTestImpl tTestImpl56 = new org.apache.commons.math.stat.inference.TTestImpl(tDistribution55);
        double[] doubleArray62 = new double[] { 1.0f, (short) 1, 100.0f, 1, 0.0f };
        double[] doubleArray67 = new double[] { ' ', (byte) 100, (byte) 1, (-1.0f) };
        double double68 = tTestImpl56.homoscedasticT(doubleArray62, doubleArray67);
        org.apache.commons.math.stat.inference.TTestImpl tTestImpl69 = new org.apache.commons.math.stat.inference.TTestImpl();
        double[] doubleArray73 = new double[] { '4', 'a', '4' };
        org.apache.commons.math.distribution.TDistribution tDistribution74 = null;
        org.apache.commons.math.stat.inference.TTestImpl tTestImpl75 = new org.apache.commons.math.stat.inference.TTestImpl(tDistribution74);
        double[] doubleArray81 = new double[] { 1.0f, (short) 1, 100.0f, 1, 0.0f };
        double[] doubleArray86 = new double[] { ' ', (byte) 100, (byte) 1, (-1.0f) };
        double double87 = tTestImpl75.homoscedasticT(doubleArray81, doubleArray86);
        double double88 = tTestImpl69.tTest(doubleArray73, doubleArray86);
        double double89 = tTestImpl52.homoscedasticT(doubleArray67, doubleArray73);
        double double90 = tTestImpl28.t(0.35800486798369846d, doubleArray73);
        double double91 = tTestImpl0.t((double) (byte) -1, doubleArray73);
        org.apache.commons.math.distribution.TDistribution tDistribution92 = null;
        tTestImpl0.setDistribution(tDistribution92);
        org.junit.Assert.assertNotNull(doubleArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray4), "[52.0, 97.0, 52.0]");
        org.junit.Assert.assertNotNull(doubleArray12);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray12), "[1.0, 1.0, 100.0, 1.0, 0.0]");
        org.junit.Assert.assertNotNull(doubleArray17);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray17), "[32.0, 100.0, 1.0, -1.0]");
        org.junit.Assert.assertTrue("'" + double18 + "' != '" + (-0.405429217622299d) + "'", double18 == (-0.405429217622299d));
        org.junit.Assert.assertTrue("'" + double19 + "' != '" + 0.2806531524060034d + "'", double19 == 0.2806531524060034d);
        org.junit.Assert.assertNotNull(doubleArray34);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray34), "[1.0, 1.0, 100.0, 1.0, 0.0]");
        org.junit.Assert.assertNotNull(doubleArray39);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray39), "[32.0, 100.0, 1.0, -1.0]");
        org.junit.Assert.assertTrue("'" + double40 + "' != '" + (-0.405429217622299d) + "'", double40 == (-0.405429217622299d));
        org.junit.Assert.assertNotNull(doubleArray48);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray48), "[1.0, 100.0, -1.0, 100.0, 100.0, -1.0]");
        org.junit.Assert.assertTrue("'" + double49 + "' != '" + (-0.09656583816243881d) + "'", double49 == (-0.09656583816243881d));
        org.junit.Assert.assertNotNull(doubleArray62);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray62), "[1.0, 1.0, 100.0, 1.0, 0.0]");
        org.junit.Assert.assertNotNull(doubleArray67);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray67), "[32.0, 100.0, 1.0, -1.0]");
        org.junit.Assert.assertTrue("'" + double68 + "' != '" + (-0.405429217622299d) + "'", double68 == (-0.405429217622299d));
        org.junit.Assert.assertNotNull(doubleArray73);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray73), "[52.0, 97.0, 52.0]");
        org.junit.Assert.assertNotNull(doubleArray81);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray81), "[1.0, 1.0, 100.0, 1.0, 0.0]");
        org.junit.Assert.assertNotNull(doubleArray86);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray86), "[32.0, 100.0, 1.0, -1.0]");
        org.junit.Assert.assertTrue("'" + double87 + "' != '" + (-0.405429217622299d) + "'", double87 == (-0.405429217622299d));
        org.junit.Assert.assertTrue("'" + double88 + "' != '" + 0.2806531524060034d + "'", double88 == 0.2806531524060034d);
        org.junit.Assert.assertTrue("'" + double89 + "' != '" + (-1.1115227041167497d) + "'", double89 == (-1.1115227041167497d));
        org.junit.Assert.assertTrue("'" + double90 + "' != '" + 4.442799675467754d + "'", double90 == 4.442799675467754d);
        org.junit.Assert.assertTrue("'" + double91 + "' != '" + 4.533333333333333d + "'", double91 == 4.533333333333333d);
    }

    @Test
    public void test3033() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3033");
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
        org.apache.commons.math.distribution.TDistribution tDistribution62 = null;
        org.apache.commons.math.stat.inference.TTestImpl tTestImpl63 = new org.apache.commons.math.stat.inference.TTestImpl(tDistribution62);
        double[] doubleArray69 = new double[] { 1.0f, (short) 1, 100.0f, 1, 0.0f };
        double[] doubleArray74 = new double[] { ' ', (byte) 100, (byte) 1, (-1.0f) };
        double double75 = tTestImpl63.homoscedasticT(doubleArray69, doubleArray74);
        double[] doubleArray83 = new double[] { 1, 100.0f, (-1), (short) 100, 100, (-1) };
        double double84 = tTestImpl63.t((double) '4', doubleArray83);
        double double85 = tTestImpl1.t(0.0d, doubleArray83);
        org.apache.commons.math.distribution.TDistribution tDistribution86 = null;
        tTestImpl1.setDistribution(tDistribution86);
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
        org.junit.Assert.assertNotNull(doubleArray69);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray69), "[1.0, 1.0, 100.0, 1.0, 0.0]");
        org.junit.Assert.assertNotNull(doubleArray74);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray74), "[32.0, 100.0, 1.0, -1.0]");
        org.junit.Assert.assertTrue("'" + double75 + "' != '" + (-0.405429217622299d) + "'", double75 == (-0.405429217622299d));
        org.junit.Assert.assertNotNull(doubleArray83);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray83), "[1.0, 100.0, -1.0, 100.0, 100.0, -1.0]");
        org.junit.Assert.assertTrue("'" + double84 + "' != '" + (-0.09656583816243881d) + "'", double84 == (-0.09656583816243881d));
        org.junit.Assert.assertTrue("'" + double85 + "' != '" + 2.2210142777360953d + "'", double85 == 2.2210142777360953d);
    }

    @Test
    public void test3034() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3034");
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
        org.apache.commons.math.distribution.TDistribution tDistribution67 = null;
        tTestImpl1.setDistribution(tDistribution67);
        org.apache.commons.math.stat.descriptive.StatisticalSummary statisticalSummary69 = null;
        org.apache.commons.math.stat.descriptive.StatisticalSummary statisticalSummary70 = null;
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean72 = tTestImpl1.tTest(statisticalSummary69, statisticalSummary70, (double) 10);
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
    public void test3035() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3035");
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
        org.apache.commons.math.stat.descriptive.StatisticalSummary statisticalSummary61 = null;
        org.apache.commons.math.stat.descriptive.StatisticalSummary statisticalSummary62 = null;
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean64 = tTestImpl1.tTest(statisticalSummary61, statisticalSummary62, (-0.5172120199559697d));
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: bad significance level: -0.5172120199559697");
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
    public void test3036() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3036");
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
        org.apache.commons.math.stat.descriptive.StatisticalSummary statisticalSummary58 = null;
        // The following exception was thrown during execution in test generation
        try {
            double double59 = tTestImpl0.t((-0.5172120199559697d), statisticalSummary58);
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
    }

    @Test
    public void test3037() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3037");
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
        org.apache.commons.math.distribution.TDistribution tDistribution62 = null;
        tTestImpl0.setDistribution(tDistribution62);
        org.apache.commons.math.distribution.TDistribution tDistribution64 = null;
        tTestImpl0.setDistribution(tDistribution64);
        org.apache.commons.math.distribution.TDistribution tDistribution66 = null;
        tTestImpl0.setDistribution(tDistribution66);
        org.apache.commons.math.distribution.TDistribution tDistribution68 = null;
        tTestImpl0.setDistribution(tDistribution68);
        org.apache.commons.math.distribution.TDistribution tDistribution70 = null;
        tTestImpl0.setDistribution(tDistribution70);
        org.apache.commons.math.stat.descriptive.StatisticalSummary statisticalSummary73 = null;
        // The following exception was thrown during execution in test generation
        try {
            double double74 = tTestImpl0.tTest((double) (short) 10, statisticalSummary73);
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
    }

    @Test
    public void test3038() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3038");
        org.apache.commons.math.stat.inference.TTestImpl tTestImpl0 = new org.apache.commons.math.stat.inference.TTestImpl();
        org.apache.commons.math.distribution.TDistribution tDistribution2 = null;
        org.apache.commons.math.stat.inference.TTestImpl tTestImpl3 = new org.apache.commons.math.stat.inference.TTestImpl(tDistribution2);
        double[] doubleArray9 = new double[] { 1.0f, (short) 1, 100.0f, 1, 0.0f };
        double[] doubleArray14 = new double[] { ' ', (byte) 100, (byte) 1, (-1.0f) };
        double double15 = tTestImpl3.homoscedasticT(doubleArray9, doubleArray14);
        double double16 = tTestImpl0.tTest((double) (short) 100, doubleArray9);
        org.apache.commons.math.distribution.TDistribution tDistribution18 = null;
        org.apache.commons.math.stat.inference.TTestImpl tTestImpl19 = new org.apache.commons.math.stat.inference.TTestImpl(tDistribution18);
        org.apache.commons.math.distribution.TDistribution tDistribution20 = null;
        tTestImpl19.setDistribution(tDistribution20);
        org.apache.commons.math.stat.inference.TTestImpl tTestImpl23 = new org.apache.commons.math.stat.inference.TTestImpl();
        org.apache.commons.math.stat.inference.TTestImpl tTestImpl25 = new org.apache.commons.math.stat.inference.TTestImpl();
        org.apache.commons.math.distribution.TDistribution tDistribution27 = null;
        org.apache.commons.math.stat.inference.TTestImpl tTestImpl28 = new org.apache.commons.math.stat.inference.TTestImpl(tDistribution27);
        double[] doubleArray34 = new double[] { 1.0f, (short) 1, 100.0f, 1, 0.0f };
        double[] doubleArray39 = new double[] { ' ', (byte) 100, (byte) 1, (-1.0f) };
        double double40 = tTestImpl28.homoscedasticT(doubleArray34, doubleArray39);
        double double41 = tTestImpl25.tTest((double) (short) 100, doubleArray34);
        org.apache.commons.math.distribution.TDistribution tDistribution43 = null;
        org.apache.commons.math.stat.inference.TTestImpl tTestImpl44 = new org.apache.commons.math.stat.inference.TTestImpl(tDistribution43);
        double[] doubleArray50 = new double[] { 1.0f, (short) 1, 100.0f, 1, 0.0f };
        double[] doubleArray55 = new double[] { ' ', (byte) 100, (byte) 1, (-1.0f) };
        double double56 = tTestImpl44.homoscedasticT(doubleArray50, doubleArray55);
        double[] doubleArray64 = new double[] { 1, 100.0f, (-1), (short) 100, 100, (-1) };
        double double65 = tTestImpl44.t((double) '4', doubleArray64);
        double double66 = tTestImpl25.tTest((double) (short) 100, doubleArray64);
        double[] doubleArray73 = new double[] { (byte) -1, (-1), 0.0f, 1.0d, (-1.0f) };
        double double74 = tTestImpl25.tTest(0.405429217622299d, doubleArray73);
        double double75 = tTestImpl23.t(3.8d, doubleArray73);
        double double76 = tTestImpl19.t((double) (short) 1, doubleArray73);
        double double77 = tTestImpl0.tTest(0.0d, doubleArray73);
        org.apache.commons.math.stat.descriptive.StatisticalSummary statisticalSummary79 = null;
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean81 = tTestImpl0.tTest(0.0d, statisticalSummary79, 0.9755634976417653d);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: bad significance level: 0.9755634976417653");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(doubleArray9);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray9), "[1.0, 1.0, 100.0, 1.0, 0.0]");
        org.junit.Assert.assertNotNull(doubleArray14);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray14), "[32.0, 100.0, 1.0, -1.0]");
        org.junit.Assert.assertTrue("'" + double15 + "' != '" + (-0.405429217622299d) + "'", double15 == (-0.405429217622299d));
        org.junit.Assert.assertTrue("'" + double16 + "' != '" + 0.01613264369976175d + "'", double16 == 0.01613264369976175d);
        org.junit.Assert.assertNotNull(doubleArray34);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray34), "[1.0, 1.0, 100.0, 1.0, 0.0]");
        org.junit.Assert.assertNotNull(doubleArray39);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray39), "[32.0, 100.0, 1.0, -1.0]");
        org.junit.Assert.assertTrue("'" + double40 + "' != '" + (-0.405429217622299d) + "'", double40 == (-0.405429217622299d));
        org.junit.Assert.assertTrue("'" + double41 + "' != '" + 0.01613264369976175d + "'", double41 == 0.01613264369976175d);
        org.junit.Assert.assertNotNull(doubleArray50);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray50), "[1.0, 1.0, 100.0, 1.0, 0.0]");
        org.junit.Assert.assertNotNull(doubleArray55);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray55), "[32.0, 100.0, 1.0, -1.0]");
        org.junit.Assert.assertTrue("'" + double56 + "' != '" + (-0.405429217622299d) + "'", double56 == (-0.405429217622299d));
        org.junit.Assert.assertNotNull(doubleArray64);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray64), "[1.0, 100.0, -1.0, 100.0, 100.0, -1.0]");
        org.junit.Assert.assertTrue("'" + double65 + "' != '" + (-0.09656583816243881d) + "'", double65 == (-0.09656583816243881d));
        org.junit.Assert.assertTrue("'" + double66 + "' != '" + 0.07560555610353314d + "'", double66 == 0.07560555610353314d);
        org.junit.Assert.assertNotNull(doubleArray73);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray73), "[-1.0, -1.0, 0.0, 1.0, -1.0]");
        org.junit.Assert.assertTrue("'" + double74 + "' != '" + 0.1143321549278642d + "'", double74 == 0.1143321549278642d);
        org.junit.Assert.assertTrue("'" + double75 + "' != '" + (-10.500000000000002d) + "'", double75 == (-10.500000000000002d));
        org.junit.Assert.assertTrue("'" + double76 + "' != '" + (-3.5d) + "'", double76 == (-3.5d));
        org.junit.Assert.assertTrue("'" + double77 + "' != '" + 0.37390096630005876d + "'", double77 == 0.37390096630005876d);
    }

    @Test
    public void test3039() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3039");
        org.apache.commons.math.stat.inference.TTestImpl tTestImpl0 = new org.apache.commons.math.stat.inference.TTestImpl();
        org.apache.commons.math.distribution.TDistribution tDistribution1 = null;
        tTestImpl0.setDistribution(tDistribution1);
        org.apache.commons.math.distribution.TDistribution tDistribution3 = null;
        tTestImpl0.setDistribution(tDistribution3);
        org.apache.commons.math.distribution.TDistribution tDistribution5 = null;
        tTestImpl0.setDistribution(tDistribution5);
        org.apache.commons.math.distribution.TDistribution tDistribution7 = null;
        tTestImpl0.setDistribution(tDistribution7);
        org.apache.commons.math.distribution.TDistribution tDistribution9 = null;
        tTestImpl0.setDistribution(tDistribution9);
        org.apache.commons.math.stat.descriptive.StatisticalSummary statisticalSummary11 = null;
        org.apache.commons.math.stat.descriptive.StatisticalSummary statisticalSummary12 = null;
        // The following exception was thrown during execution in test generation
        try {
            double double13 = tTestImpl0.t(statisticalSummary11, statisticalSummary12);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: insufficient data for t statistic");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void test3040() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3040");
        org.apache.commons.math.distribution.TDistribution tDistribution0 = null;
        org.apache.commons.math.stat.inference.TTestImpl tTestImpl1 = new org.apache.commons.math.stat.inference.TTestImpl(tDistribution0);
        org.apache.commons.math.distribution.TDistribution tDistribution2 = null;
        tTestImpl1.setDistribution(tDistribution2);
        org.apache.commons.math.distribution.TDistribution tDistribution5 = null;
        org.apache.commons.math.stat.inference.TTestImpl tTestImpl6 = new org.apache.commons.math.stat.inference.TTestImpl(tDistribution5);
        double[] doubleArray12 = new double[] { 1.0f, (short) 1, 100.0f, 1, 0.0f };
        double[] doubleArray17 = new double[] { ' ', (byte) 100, (byte) 1, (-1.0f) };
        double double18 = tTestImpl6.homoscedasticT(doubleArray12, doubleArray17);
        org.apache.commons.math.stat.inference.TTestImpl tTestImpl19 = new org.apache.commons.math.stat.inference.TTestImpl();
        double[] doubleArray23 = new double[] { '4', 'a', '4' };
        org.apache.commons.math.distribution.TDistribution tDistribution24 = null;
        org.apache.commons.math.stat.inference.TTestImpl tTestImpl25 = new org.apache.commons.math.stat.inference.TTestImpl(tDistribution24);
        double[] doubleArray31 = new double[] { 1.0f, (short) 1, 100.0f, 1, 0.0f };
        double[] doubleArray36 = new double[] { ' ', (byte) 100, (byte) 1, (-1.0f) };
        double double37 = tTestImpl25.homoscedasticT(doubleArray31, doubleArray36);
        double double38 = tTestImpl19.tTest(doubleArray23, doubleArray36);
        org.apache.commons.math.distribution.TDistribution tDistribution39 = null;
        org.apache.commons.math.stat.inference.TTestImpl tTestImpl40 = new org.apache.commons.math.stat.inference.TTestImpl(tDistribution39);
        double[] doubleArray46 = new double[] { 1.0f, (short) 1, 100.0f, 1, 0.0f };
        double[] doubleArray51 = new double[] { ' ', (byte) 100, (byte) 1, (-1.0f) };
        double double52 = tTestImpl40.homoscedasticT(doubleArray46, doubleArray51);
        double double53 = tTestImpl6.t(doubleArray36, doubleArray51);
        double double54 = tTestImpl1.t(0.07560555610353314d, doubleArray36);
        org.apache.commons.math.distribution.TDistribution tDistribution55 = null;
        tTestImpl1.setDistribution(tDistribution55);
        org.apache.commons.math.distribution.TDistribution tDistribution57 = null;
        tTestImpl1.setDistribution(tDistribution57);
        org.apache.commons.math.distribution.TDistribution tDistribution59 = null;
        tTestImpl1.setDistribution(tDistribution59);
        org.apache.commons.math.distribution.TDistribution tDistribution61 = null;
        tTestImpl1.setDistribution(tDistribution61);
        org.junit.Assert.assertNotNull(doubleArray12);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray12), "[1.0, 1.0, 100.0, 1.0, 0.0]");
        org.junit.Assert.assertNotNull(doubleArray17);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray17), "[32.0, 100.0, 1.0, -1.0]");
        org.junit.Assert.assertTrue("'" + double18 + "' != '" + (-0.405429217622299d) + "'", double18 == (-0.405429217622299d));
        org.junit.Assert.assertNotNull(doubleArray23);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray23), "[52.0, 97.0, 52.0]");
        org.junit.Assert.assertNotNull(doubleArray31);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray31), "[1.0, 1.0, 100.0, 1.0, 0.0]");
        org.junit.Assert.assertNotNull(doubleArray36);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray36), "[32.0, 100.0, 1.0, -1.0]");
        org.junit.Assert.assertTrue("'" + double37 + "' != '" + (-0.405429217622299d) + "'", double37 == (-0.405429217622299d));
        org.junit.Assert.assertTrue("'" + double38 + "' != '" + 0.2806531524060034d + "'", double38 == 0.2806531524060034d);
        org.junit.Assert.assertNotNull(doubleArray46);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray46), "[1.0, 1.0, 100.0, 1.0, 0.0]");
        org.junit.Assert.assertNotNull(doubleArray51);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray51), "[32.0, 100.0, 1.0, -1.0]");
        org.junit.Assert.assertTrue("'" + double52 + "' != '" + (-0.405429217622299d) + "'", double52 == (-0.405429217622299d));
        org.junit.Assert.assertTrue("'" + double53 + "' != '" + 0.0d + "'", double53 == 0.0d);
        org.junit.Assert.assertTrue("'" + double54 + "' != '" + 1.3965146696271626d + "'", double54 == 1.3965146696271626d);
    }

    @Test
    public void test3041() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3041");
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
        org.apache.commons.math.stat.descriptive.StatisticalSummary statisticalSummary88 = null;
        org.apache.commons.math.stat.descriptive.StatisticalSummary statisticalSummary89 = null;
        // The following exception was thrown during execution in test generation
        try {
            double double90 = tTestImpl1.t(statisticalSummary88, statisticalSummary89);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: insufficient data for t statistic");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
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
    public void test3042() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3042");
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
        double[] doubleArray68 = new double[] { 0.405429217622299d, (byte) -1, 10.0f, 0.5172120199559697d };
        double double69 = tTestImpl1.t(1.0377339947605275d, doubleArray68);
        org.apache.commons.math.distribution.TDistribution tDistribution70 = null;
        tTestImpl1.setDistribution(tDistribution70);
        java.lang.Class<?> wildcardClass72 = tTestImpl1.getClass();
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
        org.junit.Assert.assertNotNull(doubleArray68);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray68), "[0.405429217622299, -1.0, 10.0, 0.5172120199559697]");
        org.junit.Assert.assertTrue("'" + double69 + "' != '" + 0.5703029263335007d + "'", double69 == 0.5703029263335007d);
        org.junit.Assert.assertNotNull(wildcardClass72);
    }

    @Test
    public void test3043() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3043");
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
        org.apache.commons.math.stat.descriptive.StatisticalSummary statisticalSummary90 = null;
        // The following exception was thrown during execution in test generation
        try {
            double double91 = tTestImpl0.t((-1.0105336460356238d), statisticalSummary90);
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
    public void test3044() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3044");
        org.apache.commons.math.stat.inference.TTestImpl tTestImpl0 = new org.apache.commons.math.stat.inference.TTestImpl();
        double[] doubleArray4 = new double[] { '4', 'a', '4' };
        org.apache.commons.math.distribution.TDistribution tDistribution5 = null;
        org.apache.commons.math.stat.inference.TTestImpl tTestImpl6 = new org.apache.commons.math.stat.inference.TTestImpl(tDistribution5);
        double[] doubleArray12 = new double[] { 1.0f, (short) 1, 100.0f, 1, 0.0f };
        double[] doubleArray17 = new double[] { ' ', (byte) 100, (byte) 1, (-1.0f) };
        double double18 = tTestImpl6.homoscedasticT(doubleArray12, doubleArray17);
        double double19 = tTestImpl0.tTest(doubleArray4, doubleArray17);
        org.apache.commons.math.distribution.TDistribution tDistribution20 = null;
        org.apache.commons.math.stat.inference.TTestImpl tTestImpl21 = new org.apache.commons.math.stat.inference.TTestImpl(tDistribution20);
        double[] doubleArray27 = new double[] { 1.0f, (short) 1, 100.0f, 1, 0.0f };
        double[] doubleArray32 = new double[] { ' ', (byte) 100, (byte) 1, (-1.0f) };
        double double33 = tTestImpl21.homoscedasticT(doubleArray27, doubleArray32);
        org.apache.commons.math.distribution.TDistribution tDistribution34 = null;
        org.apache.commons.math.stat.inference.TTestImpl tTestImpl35 = new org.apache.commons.math.stat.inference.TTestImpl(tDistribution34);
        double[] doubleArray41 = new double[] { 1.0f, (short) 1, 100.0f, 1, 0.0f };
        double[] doubleArray46 = new double[] { ' ', (byte) 100, (byte) 1, (-1.0f) };
        double double47 = tTestImpl35.homoscedasticT(doubleArray41, doubleArray46);
        org.apache.commons.math.stat.inference.TTestImpl tTestImpl48 = new org.apache.commons.math.stat.inference.TTestImpl();
        double[] doubleArray52 = new double[] { '4', 'a', '4' };
        org.apache.commons.math.distribution.TDistribution tDistribution53 = null;
        org.apache.commons.math.stat.inference.TTestImpl tTestImpl54 = new org.apache.commons.math.stat.inference.TTestImpl(tDistribution53);
        double[] doubleArray60 = new double[] { 1.0f, (short) 1, 100.0f, 1, 0.0f };
        double[] doubleArray65 = new double[] { ' ', (byte) 100, (byte) 1, (-1.0f) };
        double double66 = tTestImpl54.homoscedasticT(doubleArray60, doubleArray65);
        double double67 = tTestImpl48.tTest(doubleArray52, doubleArray65);
        org.apache.commons.math.distribution.TDistribution tDistribution68 = null;
        org.apache.commons.math.stat.inference.TTestImpl tTestImpl69 = new org.apache.commons.math.stat.inference.TTestImpl(tDistribution68);
        double[] doubleArray75 = new double[] { 1.0f, (short) 1, 100.0f, 1, 0.0f };
        double[] doubleArray80 = new double[] { ' ', (byte) 100, (byte) 1, (-1.0f) };
        double double81 = tTestImpl69.homoscedasticT(doubleArray75, doubleArray80);
        double double82 = tTestImpl35.t(doubleArray65, doubleArray80);
        double double83 = tTestImpl0.homoscedasticT(doubleArray27, doubleArray80);
        org.apache.commons.math.distribution.TDistribution tDistribution84 = null;
        tTestImpl0.setDistribution(tDistribution84);
        org.apache.commons.math.distribution.TDistribution tDistribution86 = null;
        tTestImpl0.setDistribution(tDistribution86);
        org.apache.commons.math.stat.descriptive.StatisticalSummary statisticalSummary89 = null;
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean91 = tTestImpl0.tTest(4.533333333333333d, statisticalSummary89, 0.0d);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: bad significance level: 0.0");
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
        org.junit.Assert.assertNotNull(doubleArray27);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray27), "[1.0, 1.0, 100.0, 1.0, 0.0]");
        org.junit.Assert.assertNotNull(doubleArray32);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray32), "[32.0, 100.0, 1.0, -1.0]");
        org.junit.Assert.assertTrue("'" + double33 + "' != '" + (-0.405429217622299d) + "'", double33 == (-0.405429217622299d));
        org.junit.Assert.assertNotNull(doubleArray41);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray41), "[1.0, 1.0, 100.0, 1.0, 0.0]");
        org.junit.Assert.assertNotNull(doubleArray46);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray46), "[32.0, 100.0, 1.0, -1.0]");
        org.junit.Assert.assertTrue("'" + double47 + "' != '" + (-0.405429217622299d) + "'", double47 == (-0.405429217622299d));
        org.junit.Assert.assertNotNull(doubleArray52);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray52), "[52.0, 97.0, 52.0]");
        org.junit.Assert.assertNotNull(doubleArray60);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray60), "[1.0, 1.0, 100.0, 1.0, 0.0]");
        org.junit.Assert.assertNotNull(doubleArray65);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray65), "[32.0, 100.0, 1.0, -1.0]");
        org.junit.Assert.assertTrue("'" + double66 + "' != '" + (-0.405429217622299d) + "'", double66 == (-0.405429217622299d));
        org.junit.Assert.assertTrue("'" + double67 + "' != '" + 0.2806531524060034d + "'", double67 == 0.2806531524060034d);
        org.junit.Assert.assertNotNull(doubleArray75);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray75), "[1.0, 1.0, 100.0, 1.0, 0.0]");
        org.junit.Assert.assertNotNull(doubleArray80);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray80), "[32.0, 100.0, 1.0, -1.0]");
        org.junit.Assert.assertTrue("'" + double81 + "' != '" + (-0.405429217622299d) + "'", double81 == (-0.405429217622299d));
        org.junit.Assert.assertTrue("'" + double82 + "' != '" + 0.0d + "'", double82 == 0.0d);
        org.junit.Assert.assertTrue("'" + double83 + "' != '" + (-0.405429217622299d) + "'", double83 == (-0.405429217622299d));
    }

    @Test
    public void test3045() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3045");
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
        org.apache.commons.math.distribution.TDistribution tDistribution20 = null;
        tTestImpl7.setDistribution(tDistribution20);
        org.apache.commons.math.distribution.TDistribution tDistribution22 = null;
        tTestImpl7.setDistribution(tDistribution22);
        org.apache.commons.math.distribution.TDistribution tDistribution24 = null;
        tTestImpl7.setDistribution(tDistribution24);
        org.apache.commons.math.distribution.TDistribution tDistribution26 = null;
        tTestImpl7.setDistribution(tDistribution26);
        org.apache.commons.math.distribution.TDistribution tDistribution28 = null;
        tTestImpl7.setDistribution(tDistribution28);
        org.apache.commons.math.distribution.TDistribution tDistribution31 = null;
        org.apache.commons.math.stat.inference.TTestImpl tTestImpl32 = new org.apache.commons.math.stat.inference.TTestImpl(tDistribution31);
        org.apache.commons.math.distribution.TDistribution tDistribution33 = null;
        tTestImpl32.setDistribution(tDistribution33);
        org.apache.commons.math.distribution.TDistribution tDistribution36 = null;
        org.apache.commons.math.stat.inference.TTestImpl tTestImpl37 = new org.apache.commons.math.stat.inference.TTestImpl(tDistribution36);
        org.apache.commons.math.distribution.TDistribution tDistribution38 = null;
        tTestImpl37.setDistribution(tDistribution38);
        org.apache.commons.math.stat.inference.TTestImpl tTestImpl41 = new org.apache.commons.math.stat.inference.TTestImpl();
        org.apache.commons.math.stat.inference.TTestImpl tTestImpl43 = new org.apache.commons.math.stat.inference.TTestImpl();
        org.apache.commons.math.distribution.TDistribution tDistribution45 = null;
        org.apache.commons.math.stat.inference.TTestImpl tTestImpl46 = new org.apache.commons.math.stat.inference.TTestImpl(tDistribution45);
        double[] doubleArray52 = new double[] { 1.0f, (short) 1, 100.0f, 1, 0.0f };
        double[] doubleArray57 = new double[] { ' ', (byte) 100, (byte) 1, (-1.0f) };
        double double58 = tTestImpl46.homoscedasticT(doubleArray52, doubleArray57);
        double double59 = tTestImpl43.tTest((double) (short) 100, doubleArray52);
        org.apache.commons.math.distribution.TDistribution tDistribution61 = null;
        org.apache.commons.math.stat.inference.TTestImpl tTestImpl62 = new org.apache.commons.math.stat.inference.TTestImpl(tDistribution61);
        double[] doubleArray68 = new double[] { 1.0f, (short) 1, 100.0f, 1, 0.0f };
        double[] doubleArray73 = new double[] { ' ', (byte) 100, (byte) 1, (-1.0f) };
        double double74 = tTestImpl62.homoscedasticT(doubleArray68, doubleArray73);
        double[] doubleArray82 = new double[] { 1, 100.0f, (-1), (short) 100, 100, (-1) };
        double double83 = tTestImpl62.t((double) '4', doubleArray82);
        double double84 = tTestImpl43.tTest((double) (short) 100, doubleArray82);
        double[] doubleArray91 = new double[] { (byte) -1, (-1), 0.0f, 1.0d, (-1.0f) };
        double double92 = tTestImpl43.tTest(0.405429217622299d, doubleArray91);
        double double93 = tTestImpl41.t(3.8d, doubleArray91);
        double double94 = tTestImpl37.t((double) (short) 1, doubleArray91);
        double double95 = tTestImpl32.t(0.9839224922440002d, doubleArray91);
        double double96 = tTestImpl7.t((double) 10L, doubleArray91);
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean98 = tTestImpl0.tTest(0.1143321549278642d, doubleArray91, (-2.8418588844347075d));
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: bad significance level: -2.8418588844347075");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(doubleArray13);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray13), "[1.0, 1.0, 100.0, 1.0, 0.0]");
        org.junit.Assert.assertNotNull(doubleArray18);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray18), "[32.0, 100.0, 1.0, -1.0]");
        org.junit.Assert.assertTrue("'" + double19 + "' != '" + (-0.405429217622299d) + "'", double19 == (-0.405429217622299d));
        org.junit.Assert.assertNotNull(doubleArray52);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray52), "[1.0, 1.0, 100.0, 1.0, 0.0]");
        org.junit.Assert.assertNotNull(doubleArray57);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray57), "[32.0, 100.0, 1.0, -1.0]");
        org.junit.Assert.assertTrue("'" + double58 + "' != '" + (-0.405429217622299d) + "'", double58 == (-0.405429217622299d));
        org.junit.Assert.assertTrue("'" + double59 + "' != '" + 0.01613264369976175d + "'", double59 == 0.01613264369976175d);
        org.junit.Assert.assertNotNull(doubleArray68);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray68), "[1.0, 1.0, 100.0, 1.0, 0.0]");
        org.junit.Assert.assertNotNull(doubleArray73);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray73), "[32.0, 100.0, 1.0, -1.0]");
        org.junit.Assert.assertTrue("'" + double74 + "' != '" + (-0.405429217622299d) + "'", double74 == (-0.405429217622299d));
        org.junit.Assert.assertNotNull(doubleArray82);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray82), "[1.0, 100.0, -1.0, 100.0, 100.0, -1.0]");
        org.junit.Assert.assertTrue("'" + double83 + "' != '" + (-0.09656583816243881d) + "'", double83 == (-0.09656583816243881d));
        org.junit.Assert.assertTrue("'" + double84 + "' != '" + 0.07560555610353314d + "'", double84 == 0.07560555610353314d);
        org.junit.Assert.assertNotNull(doubleArray91);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray91), "[-1.0, -1.0, 0.0, 1.0, -1.0]");
        org.junit.Assert.assertTrue("'" + double92 + "' != '" + 0.1143321549278642d + "'", double92 == 0.1143321549278642d);
        org.junit.Assert.assertTrue("'" + double93 + "' != '" + (-10.500000000000002d) + "'", double93 == (-10.500000000000002d));
        org.junit.Assert.assertTrue("'" + double94 + "' != '" + (-3.5d) + "'", double94 == (-3.5d));
        org.junit.Assert.assertTrue("'" + double95 + "' != '" + (-3.4598062306100013d) + "'", double95 == (-3.4598062306100013d));
        org.junit.Assert.assertTrue("'" + double96 + "' != '" + (-26.000000000000004d) + "'", double96 == (-26.000000000000004d));
    }

    @Test
    public void test3046() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3046");
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
        org.apache.commons.math.stat.descriptive.StatisticalSummary statisticalSummary80 = null;
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean82 = tTestImpl1.tTest(0.0d, statisticalSummary80, (double) 10.0f);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: bad significance level: 10.0");
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
    public void test3047() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3047");
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
        org.apache.commons.math.distribution.TDistribution tDistribution42 = null;
        tTestImpl0.setDistribution(tDistribution42);
        org.apache.commons.math.distribution.TDistribution tDistribution44 = null;
        tTestImpl0.setDistribution(tDistribution44);
        org.apache.commons.math.distribution.TDistribution tDistribution46 = null;
        tTestImpl0.setDistribution(tDistribution46);
        org.apache.commons.math.distribution.TDistribution tDistribution48 = null;
        tTestImpl0.setDistribution(tDistribution48);
        org.apache.commons.math.stat.inference.TTestImpl tTestImpl50 = new org.apache.commons.math.stat.inference.TTestImpl();
        org.apache.commons.math.distribution.TDistribution tDistribution51 = null;
        tTestImpl50.setDistribution(tDistribution51);
        org.apache.commons.math.distribution.TDistribution tDistribution53 = null;
        tTestImpl50.setDistribution(tDistribution53);
        org.apache.commons.math.distribution.TDistribution tDistribution56 = null;
        org.apache.commons.math.stat.inference.TTestImpl tTestImpl57 = new org.apache.commons.math.stat.inference.TTestImpl(tDistribution56);
        double[] doubleArray63 = new double[] { 1.0f, (short) 1, 100.0f, 1, 0.0f };
        double[] doubleArray68 = new double[] { ' ', (byte) 100, (byte) 1, (-1.0f) };
        double double69 = tTestImpl57.homoscedasticT(doubleArray63, doubleArray68);
        double double70 = tTestImpl50.t(3.8d, doubleArray63);
        org.apache.commons.math.distribution.TDistribution tDistribution71 = null;
        org.apache.commons.math.stat.inference.TTestImpl tTestImpl72 = new org.apache.commons.math.stat.inference.TTestImpl(tDistribution71);
        double[] doubleArray78 = new double[] { 1.0f, (short) 1, 100.0f, 1, 0.0f };
        double[] doubleArray83 = new double[] { ' ', (byte) 100, (byte) 1, (-1.0f) };
        double double84 = tTestImpl72.homoscedasticT(doubleArray78, doubleArray83);
        double double85 = tTestImpl0.t(doubleArray63, doubleArray78);
        org.apache.commons.math.stat.descriptive.StatisticalSummary statisticalSummary87 = null;
        // The following exception was thrown during execution in test generation
        try {
            double double88 = tTestImpl0.tTest(0.5172120199559697d, statisticalSummary87);
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
        org.junit.Assert.assertNotNull(doubleArray63);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray63), "[1.0, 1.0, 100.0, 1.0, 0.0]");
        org.junit.Assert.assertNotNull(doubleArray68);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray68), "[32.0, 100.0, 1.0, -1.0]");
        org.junit.Assert.assertTrue("'" + double69 + "' != '" + (-0.405429217622299d) + "'", double69 == (-0.405429217622299d));
        org.junit.Assert.assertTrue("'" + double70 + "' != '" + 0.8463073355328574d + "'", double70 == 0.8463073355328574d);
        org.junit.Assert.assertNotNull(doubleArray78);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray78), "[1.0, 1.0, 100.0, 1.0, 0.0]");
        org.junit.Assert.assertNotNull(doubleArray83);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray83), "[32.0, 100.0, 1.0, -1.0]");
        org.junit.Assert.assertTrue("'" + double84 + "' != '" + (-0.405429217622299d) + "'", double84 == (-0.405429217622299d));
        org.junit.Assert.assertTrue("'" + double85 + "' != '" + 0.0d + "'", double85 == 0.0d);
    }

    @Test
    public void test3048() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3048");
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
        org.apache.commons.math.stat.descriptive.StatisticalSummary statisticalSummary61 = null;
        org.apache.commons.math.stat.descriptive.StatisticalSummary statisticalSummary62 = null;
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean64 = tTestImpl1.tTest(statisticalSummary61, statisticalSummary62, 0.35800486798369846d);
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
    }

    @Test
    public void test3049() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3049");
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
            double double95 = tTestImpl0.tTest(0.0d, statisticalSummary94);
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
    public void test3050() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3050");
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
        org.apache.commons.math.stat.inference.TTestImpl tTestImpl61 = new org.apache.commons.math.stat.inference.TTestImpl();
        double[] doubleArray65 = new double[] { '4', 'a', '4' };
        org.apache.commons.math.distribution.TDistribution tDistribution66 = null;
        org.apache.commons.math.stat.inference.TTestImpl tTestImpl67 = new org.apache.commons.math.stat.inference.TTestImpl(tDistribution66);
        double[] doubleArray73 = new double[] { 1.0f, (short) 1, 100.0f, 1, 0.0f };
        double[] doubleArray78 = new double[] { ' ', (byte) 100, (byte) 1, (-1.0f) };
        double double79 = tTestImpl67.homoscedasticT(doubleArray73, doubleArray78);
        double double80 = tTestImpl61.tTest(doubleArray65, doubleArray78);
        org.apache.commons.math.distribution.TDistribution tDistribution82 = null;
        org.apache.commons.math.stat.inference.TTestImpl tTestImpl83 = new org.apache.commons.math.stat.inference.TTestImpl(tDistribution82);
        double[] doubleArray89 = new double[] { 1.0f, (short) 1, 100.0f, 1, 0.0f };
        double[] doubleArray94 = new double[] { ' ', (byte) 100, (byte) 1, (-1.0f) };
        double double95 = tTestImpl83.homoscedasticT(doubleArray89, doubleArray94);
        double double96 = tTestImpl61.t((double) 1L, doubleArray94);
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean98 = tTestImpl0.tTest(0.37390096630005876d, doubleArray94, 0.0d);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: bad significance level: 0.0");
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
        org.junit.Assert.assertNotNull(doubleArray65);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray65), "[52.0, 97.0, 52.0]");
        org.junit.Assert.assertNotNull(doubleArray73);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray73), "[1.0, 1.0, 100.0, 1.0, 0.0]");
        org.junit.Assert.assertNotNull(doubleArray78);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray78), "[32.0, 100.0, 1.0, -1.0]");
        org.junit.Assert.assertTrue("'" + double79 + "' != '" + (-0.405429217622299d) + "'", double79 == (-0.405429217622299d));
        org.junit.Assert.assertTrue("'" + double80 + "' != '" + 0.2806531524060034d + "'", double80 == 0.2806531524060034d);
        org.junit.Assert.assertNotNull(doubleArray89);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray89), "[1.0, 1.0, 100.0, 1.0, 0.0]");
        org.junit.Assert.assertNotNull(doubleArray94);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray94), "[32.0, 100.0, 1.0, -1.0]");
        org.junit.Assert.assertTrue("'" + double95 + "' != '" + (-0.405429217622299d) + "'", double95 == (-0.405429217622299d));
        org.junit.Assert.assertTrue("'" + double96 + "' != '" + 1.3573057358494125d + "'", double96 == 1.3573057358494125d);
    }

    @Test
    public void test3051() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3051");
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
        org.apache.commons.math.stat.descriptive.StatisticalSummary statisticalSummary65 = null;
        org.apache.commons.math.stat.descriptive.StatisticalSummary statisticalSummary66 = null;
        // The following exception was thrown during execution in test generation
        try {
            double double67 = tTestImpl1.t(statisticalSummary65, statisticalSummary66);
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
    }

    @Test
    public void test3052() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3052");
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
        java.lang.Class<?> wildcardClass79 = doubleArray74.getClass();
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
        org.junit.Assert.assertNotNull(wildcardClass79);
    }

    @Test
    public void test3053() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3053");
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
        org.apache.commons.math.stat.inference.TTestImpl tTestImpl41 = new org.apache.commons.math.stat.inference.TTestImpl();
        double[] doubleArray45 = new double[] { '4', 'a', '4' };
        org.apache.commons.math.distribution.TDistribution tDistribution46 = null;
        org.apache.commons.math.stat.inference.TTestImpl tTestImpl47 = new org.apache.commons.math.stat.inference.TTestImpl(tDistribution46);
        double[] doubleArray53 = new double[] { 1.0f, (short) 1, 100.0f, 1, 0.0f };
        double[] doubleArray58 = new double[] { ' ', (byte) 100, (byte) 1, (-1.0f) };
        double double59 = tTestImpl47.homoscedasticT(doubleArray53, doubleArray58);
        double double60 = tTestImpl41.tTest(doubleArray45, doubleArray58);
        org.apache.commons.math.distribution.TDistribution tDistribution61 = null;
        tTestImpl41.setDistribution(tDistribution61);
        org.apache.commons.math.distribution.TDistribution tDistribution63 = null;
        tTestImpl41.setDistribution(tDistribution63);
        org.apache.commons.math.stat.inference.TTestImpl tTestImpl66 = new org.apache.commons.math.stat.inference.TTestImpl();
        org.apache.commons.math.distribution.TDistribution tDistribution68 = null;
        org.apache.commons.math.stat.inference.TTestImpl tTestImpl69 = new org.apache.commons.math.stat.inference.TTestImpl(tDistribution68);
        double[] doubleArray75 = new double[] { 1.0f, (short) 1, 100.0f, 1, 0.0f };
        double[] doubleArray80 = new double[] { ' ', (byte) 100, (byte) 1, (-1.0f) };
        double double81 = tTestImpl69.homoscedasticT(doubleArray75, doubleArray80);
        double double82 = tTestImpl66.tTest((double) (short) 100, doubleArray75);
        double double83 = tTestImpl41.t((double) (byte) 1, doubleArray75);
        double double84 = tTestImpl0.tTest(3.8d, doubleArray75);
        org.apache.commons.math.stat.descriptive.StatisticalSummary statisticalSummary86 = null;
        // The following exception was thrown during execution in test generation
        try {
            double double87 = tTestImpl0.tTest(0.1143321549278642d, statisticalSummary86);
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
        org.junit.Assert.assertNotNull(doubleArray45);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray45), "[52.0, 97.0, 52.0]");
        org.junit.Assert.assertNotNull(doubleArray53);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray53), "[1.0, 1.0, 100.0, 1.0, 0.0]");
        org.junit.Assert.assertNotNull(doubleArray58);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray58), "[32.0, 100.0, 1.0, -1.0]");
        org.junit.Assert.assertTrue("'" + double59 + "' != '" + (-0.405429217622299d) + "'", double59 == (-0.405429217622299d));
        org.junit.Assert.assertTrue("'" + double60 + "' != '" + 0.2806531524060034d + "'", double60 == 0.2806531524060034d);
        org.junit.Assert.assertNotNull(doubleArray75);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray75), "[1.0, 1.0, 100.0, 1.0, 0.0]");
        org.junit.Assert.assertNotNull(doubleArray80);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray80), "[32.0, 100.0, 1.0, -1.0]");
        org.junit.Assert.assertTrue("'" + double81 + "' != '" + (-0.405429217622299d) + "'", double81 == (-0.405429217622299d));
        org.junit.Assert.assertTrue("'" + double82 + "' != '" + 0.01613264369976175d + "'", double82 == 0.01613264369976175d);
        org.junit.Assert.assertTrue("'" + double83 + "' != '" + 0.987358558121667d + "'", double83 == 0.987358558121667d);
        org.junit.Assert.assertTrue("'" + double84 + "' != '" + 0.4450411875109115d + "'", double84 == 0.4450411875109115d);
    }

    @Test
    public void test3054() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3054");
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
        org.apache.commons.math.stat.inference.TTestImpl tTestImpl51 = new org.apache.commons.math.stat.inference.TTestImpl();
        org.apache.commons.math.distribution.TDistribution tDistribution52 = null;
        tTestImpl51.setDistribution(tDistribution52);
        org.apache.commons.math.distribution.TDistribution tDistribution54 = null;
        tTestImpl51.setDistribution(tDistribution54);
        org.apache.commons.math.distribution.TDistribution tDistribution57 = null;
        org.apache.commons.math.stat.inference.TTestImpl tTestImpl58 = new org.apache.commons.math.stat.inference.TTestImpl(tDistribution57);
        double[] doubleArray64 = new double[] { 1.0f, (short) 1, 100.0f, 1, 0.0f };
        double[] doubleArray69 = new double[] { ' ', (byte) 100, (byte) 1, (-1.0f) };
        double double70 = tTestImpl58.homoscedasticT(doubleArray64, doubleArray69);
        double double71 = tTestImpl51.t(3.8d, doubleArray64);
        double double72 = tTestImpl0.t(1.088109431399388d, doubleArray64);
        org.apache.commons.math.stat.descriptive.StatisticalSummary statisticalSummary74 = null;
        // The following exception was thrown during execution in test generation
        try {
            double double75 = tTestImpl0.tTest((double) 1.0f, statisticalSummary74);
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
        org.junit.Assert.assertNotNull(doubleArray64);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray64), "[1.0, 1.0, 100.0, 1.0, 0.0]");
        org.junit.Assert.assertNotNull(doubleArray69);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray69), "[32.0, 100.0, 1.0, -1.0]");
        org.junit.Assert.assertTrue("'" + double70 + "' != '" + (-0.405429217622299d) + "'", double70 == (-0.405429217622299d));
        org.junit.Assert.assertTrue("'" + double71 + "' != '" + 0.8463073355328574d + "'", double71 == 0.8463073355328574d);
        org.junit.Assert.assertTrue("'" + double72 + "' != '" + 0.982920007042921d + "'", double72 == 0.982920007042921d);
    }

    @Test
    public void test3055() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3055");
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
        double double76 = tTestImpl1.t((-2.8418588844347075d), doubleArray60);
        org.apache.commons.math.stat.descriptive.StatisticalSummary statisticalSummary77 = null;
        org.apache.commons.math.stat.descriptive.StatisticalSummary statisticalSummary78 = null;
        // The following exception was thrown during execution in test generation
        try {
            double double79 = tTestImpl1.tTest(statisticalSummary77, statisticalSummary78);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: insufficient data for t statistic");
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
        org.junit.Assert.assertTrue("'" + double76 + "' != '" + 4.656123925628981d + "'", double76 == 4.656123925628981d);
    }

    @Test
    public void test3056() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3056");
        org.apache.commons.math.distribution.TDistribution tDistribution0 = null;
        org.apache.commons.math.stat.inference.TTestImpl tTestImpl1 = new org.apache.commons.math.stat.inference.TTestImpl(tDistribution0);
        double[] doubleArray7 = new double[] { 1.0f, (short) 1, 100.0f, 1, 0.0f };
        double[] doubleArray12 = new double[] { ' ', (byte) 100, (byte) 1, (-1.0f) };
        double double13 = tTestImpl1.homoscedasticT(doubleArray7, doubleArray12);
        org.apache.commons.math.distribution.TDistribution tDistribution15 = null;
        org.apache.commons.math.stat.inference.TTestImpl tTestImpl16 = new org.apache.commons.math.stat.inference.TTestImpl(tDistribution15);
        org.apache.commons.math.distribution.TDistribution tDistribution17 = null;
        tTestImpl16.setDistribution(tDistribution17);
        org.apache.commons.math.distribution.TDistribution tDistribution19 = null;
        org.apache.commons.math.stat.inference.TTestImpl tTestImpl20 = new org.apache.commons.math.stat.inference.TTestImpl(tDistribution19);
        double[] doubleArray26 = new double[] { 1.0f, (short) 1, 100.0f, 1, 0.0f };
        double[] doubleArray31 = new double[] { ' ', (byte) 100, (byte) 1, (-1.0f) };
        double double32 = tTestImpl20.homoscedasticT(doubleArray26, doubleArray31);
        org.apache.commons.math.stat.inference.TTestImpl tTestImpl33 = new org.apache.commons.math.stat.inference.TTestImpl();
        double[] doubleArray37 = new double[] { '4', 'a', '4' };
        org.apache.commons.math.distribution.TDistribution tDistribution38 = null;
        org.apache.commons.math.stat.inference.TTestImpl tTestImpl39 = new org.apache.commons.math.stat.inference.TTestImpl(tDistribution38);
        double[] doubleArray45 = new double[] { 1.0f, (short) 1, 100.0f, 1, 0.0f };
        double[] doubleArray50 = new double[] { ' ', (byte) 100, (byte) 1, (-1.0f) };
        double double51 = tTestImpl39.homoscedasticT(doubleArray45, doubleArray50);
        double double52 = tTestImpl33.tTest(doubleArray37, doubleArray50);
        double double53 = tTestImpl16.homoscedasticT(doubleArray31, doubleArray37);
        // The following exception was thrown during execution in test generation
        try {
            double double54 = tTestImpl1.tTest((-0.09656583816243881d), doubleArray31);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(doubleArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray7), "[1.0, 1.0, 100.0, 1.0, 0.0]");
        org.junit.Assert.assertNotNull(doubleArray12);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray12), "[32.0, 100.0, 1.0, -1.0]");
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + (-0.405429217622299d) + "'", double13 == (-0.405429217622299d));
        org.junit.Assert.assertNotNull(doubleArray26);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray26), "[1.0, 1.0, 100.0, 1.0, 0.0]");
        org.junit.Assert.assertNotNull(doubleArray31);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray31), "[32.0, 100.0, 1.0, -1.0]");
        org.junit.Assert.assertTrue("'" + double32 + "' != '" + (-0.405429217622299d) + "'", double32 == (-0.405429217622299d));
        org.junit.Assert.assertNotNull(doubleArray37);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray37), "[52.0, 97.0, 52.0]");
        org.junit.Assert.assertNotNull(doubleArray45);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray45), "[1.0, 1.0, 100.0, 1.0, 0.0]");
        org.junit.Assert.assertNotNull(doubleArray50);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray50), "[32.0, 100.0, 1.0, -1.0]");
        org.junit.Assert.assertTrue("'" + double51 + "' != '" + (-0.405429217622299d) + "'", double51 == (-0.405429217622299d));
        org.junit.Assert.assertTrue("'" + double52 + "' != '" + 0.2806531524060034d + "'", double52 == 0.2806531524060034d);
        org.junit.Assert.assertTrue("'" + double53 + "' != '" + (-1.1115227041167497d) + "'", double53 == (-1.1115227041167497d));
    }

    @Test
    public void test3057() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3057");
        org.apache.commons.math.distribution.TDistribution tDistribution0 = null;
        org.apache.commons.math.stat.inference.TTestImpl tTestImpl1 = new org.apache.commons.math.stat.inference.TTestImpl(tDistribution0);
        org.apache.commons.math.distribution.TDistribution tDistribution2 = null;
        tTestImpl1.setDistribution(tDistribution2);
        org.apache.commons.math.distribution.TDistribution tDistribution4 = null;
        tTestImpl1.setDistribution(tDistribution4);
        org.apache.commons.math.stat.inference.TTestImpl tTestImpl7 = new org.apache.commons.math.stat.inference.TTestImpl();
        double[] doubleArray11 = new double[] { '4', 'a', '4' };
        org.apache.commons.math.distribution.TDistribution tDistribution12 = null;
        org.apache.commons.math.stat.inference.TTestImpl tTestImpl13 = new org.apache.commons.math.stat.inference.TTestImpl(tDistribution12);
        double[] doubleArray19 = new double[] { 1.0f, (short) 1, 100.0f, 1, 0.0f };
        double[] doubleArray24 = new double[] { ' ', (byte) 100, (byte) 1, (-1.0f) };
        double double25 = tTestImpl13.homoscedasticT(doubleArray19, doubleArray24);
        double double26 = tTestImpl7.tTest(doubleArray11, doubleArray24);
        org.apache.commons.math.distribution.TDistribution tDistribution27 = null;
        org.apache.commons.math.stat.inference.TTestImpl tTestImpl28 = new org.apache.commons.math.stat.inference.TTestImpl(tDistribution27);
        double[] doubleArray34 = new double[] { 1.0f, (short) 1, 100.0f, 1, 0.0f };
        double[] doubleArray39 = new double[] { ' ', (byte) 100, (byte) 1, (-1.0f) };
        double double40 = tTestImpl28.homoscedasticT(doubleArray34, doubleArray39);
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
        double double90 = tTestImpl7.homoscedasticT(doubleArray34, doubleArray87);
        double double91 = tTestImpl1.t(1.384536475695448d, doubleArray87);
        org.apache.commons.math.distribution.TDistribution tDistribution92 = null;
        tTestImpl1.setDistribution(tDistribution92);
        java.lang.Class<?> wildcardClass94 = tTestImpl1.getClass();
        org.junit.Assert.assertNotNull(doubleArray11);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray11), "[52.0, 97.0, 52.0]");
        org.junit.Assert.assertNotNull(doubleArray19);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray19), "[1.0, 1.0, 100.0, 1.0, 0.0]");
        org.junit.Assert.assertNotNull(doubleArray24);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray24), "[32.0, 100.0, 1.0, -1.0]");
        org.junit.Assert.assertTrue("'" + double25 + "' != '" + (-0.405429217622299d) + "'", double25 == (-0.405429217622299d));
        org.junit.Assert.assertTrue("'" + double26 + "' != '" + 0.2806531524060034d + "'", double26 == 0.2806531524060034d);
        org.junit.Assert.assertNotNull(doubleArray34);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray34), "[1.0, 1.0, 100.0, 1.0, 0.0]");
        org.junit.Assert.assertNotNull(doubleArray39);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray39), "[32.0, 100.0, 1.0, -1.0]");
        org.junit.Assert.assertTrue("'" + double40 + "' != '" + (-0.405429217622299d) + "'", double40 == (-0.405429217622299d));
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
        org.junit.Assert.assertTrue("'" + double90 + "' != '" + (-0.405429217622299d) + "'", double90 == (-0.405429217622299d));
        org.junit.Assert.assertTrue("'" + double91 + "' != '" + 1.340995311971139d + "'", double91 == 1.340995311971139d);
        org.junit.Assert.assertNotNull(wildcardClass94);
    }

    @Test
    public void test3058() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3058");
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
        org.apache.commons.math.stat.descriptive.StatisticalSummary statisticalSummary61 = null;
        org.apache.commons.math.stat.descriptive.StatisticalSummary statisticalSummary62 = null;
        // The following exception was thrown during execution in test generation
        try {
            double double63 = tTestImpl0.t(statisticalSummary61, statisticalSummary62);
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
    public void test3059() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3059");
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
        double[] doubleArray45 = new double[] { 100.0f, 1.3404872472421194d, 0.15639940166959065d };
        org.apache.commons.math.distribution.TDistribution tDistribution46 = null;
        org.apache.commons.math.stat.inference.TTestImpl tTestImpl47 = new org.apache.commons.math.stat.inference.TTestImpl(tDistribution46);
        double[] doubleArray53 = new double[] { 1.0f, (short) 1, 100.0f, 1, 0.0f };
        double[] doubleArray58 = new double[] { ' ', (byte) 100, (byte) 1, (-1.0f) };
        double double59 = tTestImpl47.homoscedasticT(doubleArray53, doubleArray58);
        org.apache.commons.math.stat.inference.TTestImpl tTestImpl60 = new org.apache.commons.math.stat.inference.TTestImpl();
        double[] doubleArray64 = new double[] { '4', 'a', '4' };
        org.apache.commons.math.distribution.TDistribution tDistribution65 = null;
        org.apache.commons.math.stat.inference.TTestImpl tTestImpl66 = new org.apache.commons.math.stat.inference.TTestImpl(tDistribution65);
        double[] doubleArray72 = new double[] { 1.0f, (short) 1, 100.0f, 1, 0.0f };
        double[] doubleArray77 = new double[] { ' ', (byte) 100, (byte) 1, (-1.0f) };
        double double78 = tTestImpl66.homoscedasticT(doubleArray72, doubleArray77);
        double double79 = tTestImpl60.tTest(doubleArray64, doubleArray77);
        org.apache.commons.math.distribution.TDistribution tDistribution80 = null;
        org.apache.commons.math.stat.inference.TTestImpl tTestImpl81 = new org.apache.commons.math.stat.inference.TTestImpl(tDistribution80);
        double[] doubleArray87 = new double[] { 1.0f, (short) 1, 100.0f, 1, 0.0f };
        double[] doubleArray92 = new double[] { ' ', (byte) 100, (byte) 1, (-1.0f) };
        double double93 = tTestImpl81.homoscedasticT(doubleArray87, doubleArray92);
        double double94 = tTestImpl47.t(doubleArray77, doubleArray92);
        double double95 = tTestImpl0.homoscedasticTTest(doubleArray45, doubleArray92);
        org.apache.commons.math.distribution.TDistribution tDistribution96 = null;
        tTestImpl0.setDistribution(tDistribution96);
        org.apache.commons.math.distribution.TDistribution tDistribution98 = null;
        tTestImpl0.setDistribution(tDistribution98);
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
        org.junit.Assert.assertNotNull(doubleArray45);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray45), "[100.0, 1.3404872472421194, 0.15639940166959065]");
        org.junit.Assert.assertNotNull(doubleArray53);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray53), "[1.0, 1.0, 100.0, 1.0, 0.0]");
        org.junit.Assert.assertNotNull(doubleArray58);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray58), "[32.0, 100.0, 1.0, -1.0]");
        org.junit.Assert.assertTrue("'" + double59 + "' != '" + (-0.405429217622299d) + "'", double59 == (-0.405429217622299d));
        org.junit.Assert.assertNotNull(doubleArray64);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray64), "[52.0, 97.0, 52.0]");
        org.junit.Assert.assertNotNull(doubleArray72);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray72), "[1.0, 1.0, 100.0, 1.0, 0.0]");
        org.junit.Assert.assertNotNull(doubleArray77);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray77), "[32.0, 100.0, 1.0, -1.0]");
        org.junit.Assert.assertTrue("'" + double78 + "' != '" + (-0.405429217622299d) + "'", double78 == (-0.405429217622299d));
        org.junit.Assert.assertTrue("'" + double79 + "' != '" + 0.2806531524060034d + "'", double79 == 0.2806531524060034d);
        org.junit.Assert.assertNotNull(doubleArray87);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray87), "[1.0, 1.0, 100.0, 1.0, 0.0]");
        org.junit.Assert.assertNotNull(doubleArray92);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray92), "[32.0, 100.0, 1.0, -1.0]");
        org.junit.Assert.assertTrue("'" + double93 + "' != '" + (-0.405429217622299d) + "'", double93 == (-0.405429217622299d));
        org.junit.Assert.assertTrue("'" + double94 + "' != '" + 0.0d + "'", double94 == 0.0d);
        org.junit.Assert.assertTrue("'" + double95 + "' != '" + 0.9839224922440002d + "'", double95 == 0.9839224922440002d);
    }

    @Test
    public void test3060() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3060");
        org.apache.commons.math.distribution.TDistribution tDistribution0 = null;
        org.apache.commons.math.stat.inference.TTestImpl tTestImpl1 = new org.apache.commons.math.stat.inference.TTestImpl(tDistribution0);
        double[] doubleArray7 = new double[] { 1.0f, (short) 1, 100.0f, 1, 0.0f };
        double[] doubleArray12 = new double[] { ' ', (byte) 100, (byte) 1, (-1.0f) };
        double double13 = tTestImpl1.homoscedasticT(doubleArray7, doubleArray12);
        double[] doubleArray21 = new double[] { 1, 100.0f, (-1), (short) 100, 100, (-1) };
        double double22 = tTestImpl1.t((double) '4', doubleArray21);
        org.apache.commons.math.stat.descriptive.StatisticalSummary statisticalSummary24 = null;
        // The following exception was thrown during execution in test generation
        try {
            double double25 = tTestImpl1.tTest((double) ' ', statisticalSummary24);
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
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray21), "[1.0, 100.0, -1.0, 100.0, 100.0, -1.0]");
        org.junit.Assert.assertTrue("'" + double22 + "' != '" + (-0.09656583816243881d) + "'", double22 == (-0.09656583816243881d));
    }

    @Test
    public void test3061() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3061");
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
        org.apache.commons.math.distribution.TDistribution tDistribution20 = null;
        tTestImpl1.setDistribution(tDistribution20);
        org.apache.commons.math.distribution.TDistribution tDistribution22 = null;
        tTestImpl1.setDistribution(tDistribution22);
        org.apache.commons.math.distribution.TDistribution tDistribution25 = null;
        org.apache.commons.math.stat.inference.TTestImpl tTestImpl26 = new org.apache.commons.math.stat.inference.TTestImpl(tDistribution25);
        org.apache.commons.math.distribution.TDistribution tDistribution27 = null;
        tTestImpl26.setDistribution(tDistribution27);
        org.apache.commons.math.distribution.TDistribution tDistribution30 = null;
        org.apache.commons.math.stat.inference.TTestImpl tTestImpl31 = new org.apache.commons.math.stat.inference.TTestImpl(tDistribution30);
        org.apache.commons.math.distribution.TDistribution tDistribution32 = null;
        tTestImpl31.setDistribution(tDistribution32);
        org.apache.commons.math.stat.inference.TTestImpl tTestImpl35 = new org.apache.commons.math.stat.inference.TTestImpl();
        org.apache.commons.math.stat.inference.TTestImpl tTestImpl37 = new org.apache.commons.math.stat.inference.TTestImpl();
        org.apache.commons.math.distribution.TDistribution tDistribution39 = null;
        org.apache.commons.math.stat.inference.TTestImpl tTestImpl40 = new org.apache.commons.math.stat.inference.TTestImpl(tDistribution39);
        double[] doubleArray46 = new double[] { 1.0f, (short) 1, 100.0f, 1, 0.0f };
        double[] doubleArray51 = new double[] { ' ', (byte) 100, (byte) 1, (-1.0f) };
        double double52 = tTestImpl40.homoscedasticT(doubleArray46, doubleArray51);
        double double53 = tTestImpl37.tTest((double) (short) 100, doubleArray46);
        org.apache.commons.math.distribution.TDistribution tDistribution55 = null;
        org.apache.commons.math.stat.inference.TTestImpl tTestImpl56 = new org.apache.commons.math.stat.inference.TTestImpl(tDistribution55);
        double[] doubleArray62 = new double[] { 1.0f, (short) 1, 100.0f, 1, 0.0f };
        double[] doubleArray67 = new double[] { ' ', (byte) 100, (byte) 1, (-1.0f) };
        double double68 = tTestImpl56.homoscedasticT(doubleArray62, doubleArray67);
        double[] doubleArray76 = new double[] { 1, 100.0f, (-1), (short) 100, 100, (-1) };
        double double77 = tTestImpl56.t((double) '4', doubleArray76);
        double double78 = tTestImpl37.tTest((double) (short) 100, doubleArray76);
        double[] doubleArray85 = new double[] { (byte) -1, (-1), 0.0f, 1.0d, (-1.0f) };
        double double86 = tTestImpl37.tTest(0.405429217622299d, doubleArray85);
        double double87 = tTestImpl35.t(3.8d, doubleArray85);
        double double88 = tTestImpl31.t((double) (short) 1, doubleArray85);
        double double89 = tTestImpl26.t(0.9839224922440002d, doubleArray85);
        double double90 = tTestImpl1.t((double) 10L, doubleArray85);
        org.apache.commons.math.distribution.TDistribution tDistribution91 = null;
        tTestImpl1.setDistribution(tDistribution91);
        org.apache.commons.math.distribution.TDistribution tDistribution93 = null;
        tTestImpl1.setDistribution(tDistribution93);
        org.apache.commons.math.stat.descriptive.StatisticalSummary statisticalSummary96 = null;
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean98 = tTestImpl1.tTest((double) 1.0f, statisticalSummary96, (-3.5d));
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: bad significance level: -3.5");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(doubleArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray7), "[1.0, 1.0, 100.0, 1.0, 0.0]");
        org.junit.Assert.assertNotNull(doubleArray12);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray12), "[32.0, 100.0, 1.0, -1.0]");
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + (-0.405429217622299d) + "'", double13 == (-0.405429217622299d));
        org.junit.Assert.assertNotNull(doubleArray46);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray46), "[1.0, 1.0, 100.0, 1.0, 0.0]");
        org.junit.Assert.assertNotNull(doubleArray51);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray51), "[32.0, 100.0, 1.0, -1.0]");
        org.junit.Assert.assertTrue("'" + double52 + "' != '" + (-0.405429217622299d) + "'", double52 == (-0.405429217622299d));
        org.junit.Assert.assertTrue("'" + double53 + "' != '" + 0.01613264369976175d + "'", double53 == 0.01613264369976175d);
        org.junit.Assert.assertNotNull(doubleArray62);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray62), "[1.0, 1.0, 100.0, 1.0, 0.0]");
        org.junit.Assert.assertNotNull(doubleArray67);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray67), "[32.0, 100.0, 1.0, -1.0]");
        org.junit.Assert.assertTrue("'" + double68 + "' != '" + (-0.405429217622299d) + "'", double68 == (-0.405429217622299d));
        org.junit.Assert.assertNotNull(doubleArray76);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray76), "[1.0, 100.0, -1.0, 100.0, 100.0, -1.0]");
        org.junit.Assert.assertTrue("'" + double77 + "' != '" + (-0.09656583816243881d) + "'", double77 == (-0.09656583816243881d));
        org.junit.Assert.assertTrue("'" + double78 + "' != '" + 0.07560555610353314d + "'", double78 == 0.07560555610353314d);
        org.junit.Assert.assertNotNull(doubleArray85);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray85), "[-1.0, -1.0, 0.0, 1.0, -1.0]");
        org.junit.Assert.assertTrue("'" + double86 + "' != '" + 0.1143321549278642d + "'", double86 == 0.1143321549278642d);
        org.junit.Assert.assertTrue("'" + double87 + "' != '" + (-10.500000000000002d) + "'", double87 == (-10.500000000000002d));
        org.junit.Assert.assertTrue("'" + double88 + "' != '" + (-3.5d) + "'", double88 == (-3.5d));
        org.junit.Assert.assertTrue("'" + double89 + "' != '" + (-3.4598062306100013d) + "'", double89 == (-3.4598062306100013d));
        org.junit.Assert.assertTrue("'" + double90 + "' != '" + (-26.000000000000004d) + "'", double90 == (-26.000000000000004d));
    }

    @Test
    public void test3062() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3062");
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
        org.apache.commons.math.stat.descriptive.StatisticalSummary statisticalSummary79 = null;
        org.apache.commons.math.stat.descriptive.StatisticalSummary statisticalSummary80 = null;
        // The following exception was thrown during execution in test generation
        try {
            double double81 = tTestImpl1.tTest(statisticalSummary79, statisticalSummary80);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: insufficient data for t statistic");
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
    public void test3063() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3063");
        org.apache.commons.math.stat.inference.TTestImpl tTestImpl0 = new org.apache.commons.math.stat.inference.TTestImpl();
        org.apache.commons.math.stat.inference.TTestImpl tTestImpl2 = new org.apache.commons.math.stat.inference.TTestImpl();
        double[] doubleArray6 = new double[] { '4', 'a', '4' };
        org.apache.commons.math.distribution.TDistribution tDistribution7 = null;
        org.apache.commons.math.stat.inference.TTestImpl tTestImpl8 = new org.apache.commons.math.stat.inference.TTestImpl(tDistribution7);
        double[] doubleArray14 = new double[] { 1.0f, (short) 1, 100.0f, 1, 0.0f };
        double[] doubleArray19 = new double[] { ' ', (byte) 100, (byte) 1, (-1.0f) };
        double double20 = tTestImpl8.homoscedasticT(doubleArray14, doubleArray19);
        double double21 = tTestImpl2.tTest(doubleArray6, doubleArray19);
        double double22 = tTestImpl0.tTest(0.1143321549278642d, doubleArray19);
        java.lang.Class<?> wildcardClass23 = doubleArray19.getClass();
        org.junit.Assert.assertNotNull(doubleArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray6), "[52.0, 97.0, 52.0]");
        org.junit.Assert.assertNotNull(doubleArray14);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray14), "[1.0, 1.0, 100.0, 1.0, 0.0]");
        org.junit.Assert.assertNotNull(doubleArray19);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray19), "[32.0, 100.0, 1.0, -1.0]");
        org.junit.Assert.assertTrue("'" + double20 + "' != '" + (-0.405429217622299d) + "'", double20 == (-0.405429217622299d));
        org.junit.Assert.assertTrue("'" + double21 + "' != '" + 0.2806531524060034d + "'", double21 == 0.2806531524060034d);
        org.junit.Assert.assertTrue("'" + double22 + "' != '" + 0.25739035342831595d + "'", double22 == 0.25739035342831595d);
        org.junit.Assert.assertNotNull(wildcardClass23);
    }

    @Test
    public void test3064() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3064");
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
        tTestImpl1.setDistribution(tDistribution38);
        org.apache.commons.math.stat.descriptive.StatisticalSummary statisticalSummary40 = null;
        org.apache.commons.math.stat.descriptive.StatisticalSummary statisticalSummary41 = null;
        // The following exception was thrown during execution in test generation
        try {
            double double42 = tTestImpl1.homoscedasticT(statisticalSummary40, statisticalSummary41);
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
    }

    @Test
    public void test3065() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3065");
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
        org.apache.commons.math.stat.inference.TTestImpl tTestImpl43 = new org.apache.commons.math.stat.inference.TTestImpl();
        org.apache.commons.math.distribution.TDistribution tDistribution45 = null;
        org.apache.commons.math.stat.inference.TTestImpl tTestImpl46 = new org.apache.commons.math.stat.inference.TTestImpl(tDistribution45);
        double[] doubleArray52 = new double[] { 1.0f, (short) 1, 100.0f, 1, 0.0f };
        double[] doubleArray57 = new double[] { ' ', (byte) 100, (byte) 1, (-1.0f) };
        double double58 = tTestImpl46.homoscedasticT(doubleArray52, doubleArray57);
        double double59 = tTestImpl43.tTest((double) (short) 100, doubleArray52);
        org.apache.commons.math.stat.inference.TTestImpl tTestImpl61 = new org.apache.commons.math.stat.inference.TTestImpl();
        double[] doubleArray65 = new double[] { '4', 'a', '4' };
        org.apache.commons.math.distribution.TDistribution tDistribution66 = null;
        org.apache.commons.math.stat.inference.TTestImpl tTestImpl67 = new org.apache.commons.math.stat.inference.TTestImpl(tDistribution66);
        double[] doubleArray73 = new double[] { 1.0f, (short) 1, 100.0f, 1, 0.0f };
        double[] doubleArray78 = new double[] { ' ', (byte) 100, (byte) 1, (-1.0f) };
        double double79 = tTestImpl67.homoscedasticT(doubleArray73, doubleArray78);
        double double80 = tTestImpl61.tTest(doubleArray65, doubleArray78);
        boolean boolean82 = tTestImpl43.tTest(1.357841932773502d, doubleArray65, 0.15639940166959065d);
        double double83 = tTestImpl0.t((-3.9998096691255283d), doubleArray65);
        org.apache.commons.math.distribution.TDistribution tDistribution84 = null;
        tTestImpl0.setDistribution(tDistribution84);
        org.apache.commons.math.stat.descriptive.StatisticalSummary statisticalSummary86 = null;
        org.apache.commons.math.stat.descriptive.StatisticalSummary statisticalSummary87 = null;
        // The following exception was thrown during execution in test generation
        try {
            double double88 = tTestImpl0.t(statisticalSummary86, statisticalSummary87);
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
        org.junit.Assert.assertNotNull(doubleArray52);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray52), "[1.0, 1.0, 100.0, 1.0, 0.0]");
        org.junit.Assert.assertNotNull(doubleArray57);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray57), "[32.0, 100.0, 1.0, -1.0]");
        org.junit.Assert.assertTrue("'" + double58 + "' != '" + (-0.405429217622299d) + "'", double58 == (-0.405429217622299d));
        org.junit.Assert.assertTrue("'" + double59 + "' != '" + 0.01613264369976175d + "'", double59 == 0.01613264369976175d);
        org.junit.Assert.assertNotNull(doubleArray65);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray65), "[52.0, 97.0, 52.0]");
        org.junit.Assert.assertNotNull(doubleArray73);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray73), "[1.0, 1.0, 100.0, 1.0, 0.0]");
        org.junit.Assert.assertNotNull(doubleArray78);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray78), "[32.0, 100.0, 1.0, -1.0]");
        org.junit.Assert.assertTrue("'" + double79 + "' != '" + (-0.405429217622299d) + "'", double79 == (-0.405429217622299d));
        org.junit.Assert.assertTrue("'" + double80 + "' != '" + 0.2806531524060034d + "'", double80 == 0.2806531524060034d);
        org.junit.Assert.assertTrue("'" + boolean82 + "' != '" + true + "'", boolean82 == true);
        org.junit.Assert.assertTrue("'" + double83 + "' != '" + 4.733320644608368d + "'", double83 == 4.733320644608368d);
    }

    @Test
    public void test3066() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3066");
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
        org.apache.commons.math.distribution.TDistribution tDistribution24 = null;
        tTestImpl0.setDistribution(tDistribution24);
        org.apache.commons.math.stat.descriptive.StatisticalSummary statisticalSummary27 = null;
        // The following exception was thrown during execution in test generation
        try {
            double double28 = tTestImpl0.tTest(4.442799675467754d, statisticalSummary27);
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
    public void test3067() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3067");
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
        java.lang.Class<?> wildcardClass65 = tTestImpl1.getClass();
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
        org.junit.Assert.assertNotNull(wildcardClass65);
    }

    @Test
    public void test3068() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3068");
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
        double double38 = tTestImpl0.t((double) (short) 10, doubleArray22);
        org.apache.commons.math.distribution.TDistribution tDistribution40 = null;
        org.apache.commons.math.stat.inference.TTestImpl tTestImpl41 = new org.apache.commons.math.stat.inference.TTestImpl(tDistribution40);
        double[] doubleArray47 = new double[] { 1.0f, (short) 1, 100.0f, 1, 0.0f };
        double[] doubleArray52 = new double[] { ' ', (byte) 100, (byte) 1, (-1.0f) };
        double double53 = tTestImpl41.homoscedasticT(doubleArray47, doubleArray52);
        org.apache.commons.math.stat.inference.TTestImpl tTestImpl55 = new org.apache.commons.math.stat.inference.TTestImpl();
        org.apache.commons.math.distribution.TDistribution tDistribution57 = null;
        org.apache.commons.math.stat.inference.TTestImpl tTestImpl58 = new org.apache.commons.math.stat.inference.TTestImpl(tDistribution57);
        double[] doubleArray64 = new double[] { 1.0f, (short) 1, 100.0f, 1, 0.0f };
        double[] doubleArray69 = new double[] { ' ', (byte) 100, (byte) 1, (-1.0f) };
        double double70 = tTestImpl58.homoscedasticT(doubleArray64, doubleArray69);
        double double71 = tTestImpl55.tTest((double) (short) 100, doubleArray64);
        double double72 = tTestImpl41.t((double) 10.0f, doubleArray64);
        boolean boolean74 = tTestImpl0.tTest(0.12673187601587688d, doubleArray64, 0.01613264369976175d);
        org.apache.commons.math.stat.descriptive.StatisticalSummary statisticalSummary76 = null;
        // The following exception was thrown during execution in test generation
        try {
            double double77 = tTestImpl0.t(1.3404872472421194d, statisticalSummary76);
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
        org.junit.Assert.assertTrue("'" + double38 + "' != '" + 3.8d + "'", double38 == 3.8d);
        org.junit.Assert.assertNotNull(doubleArray47);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray47), "[1.0, 1.0, 100.0, 1.0, 0.0]");
        org.junit.Assert.assertNotNull(doubleArray52);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray52), "[32.0, 100.0, 1.0, -1.0]");
        org.junit.Assert.assertTrue("'" + double53 + "' != '" + (-0.405429217622299d) + "'", double53 == (-0.405429217622299d));
        org.junit.Assert.assertNotNull(doubleArray64);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray64), "[1.0, 1.0, 100.0, 1.0, 0.0]");
        org.junit.Assert.assertNotNull(doubleArray69);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray69), "[32.0, 100.0, 1.0, -1.0]");
        org.junit.Assert.assertTrue("'" + double70 + "' != '" + (-0.405429217622299d) + "'", double70 == (-0.405429217622299d));
        org.junit.Assert.assertTrue("'" + double71 + "' != '" + 0.01613264369976175d + "'", double71 == 0.01613264369976175d);
        org.junit.Assert.assertTrue("'" + double72 + "' != '" + 0.5339796283719219d + "'", double72 == 0.5339796283719219d);
        org.junit.Assert.assertTrue("'" + boolean74 + "' != '" + false + "'", boolean74 == false);
    }

    @Test
    public void test3069() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3069");
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
        org.apache.commons.math.stat.descriptive.StatisticalSummary statisticalSummary88 = null;
        // The following exception was thrown during execution in test generation
        try {
            double double89 = tTestImpl0.t(0.5172120199559697d, statisticalSummary88);
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
    public void test3070() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3070");
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
        double double76 = tTestImpl1.t((-2.8418588844347075d), doubleArray60);
        java.lang.Class<?> wildcardClass77 = tTestImpl1.getClass();
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
        org.junit.Assert.assertTrue("'" + double76 + "' != '" + 4.656123925628981d + "'", double76 == 4.656123925628981d);
        org.junit.Assert.assertNotNull(wildcardClass77);
    }

    @Test
    public void test3071() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3071");
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
        org.apache.commons.math.distribution.TDistribution tDistribution42 = null;
        org.apache.commons.math.stat.inference.TTestImpl tTestImpl43 = new org.apache.commons.math.stat.inference.TTestImpl(tDistribution42);
        double[] doubleArray49 = new double[] { 1.0f, (short) 1, 100.0f, 1, 0.0f };
        double[] doubleArray54 = new double[] { ' ', (byte) 100, (byte) 1, (-1.0f) };
        double double55 = tTestImpl43.homoscedasticT(doubleArray49, doubleArray54);
        org.apache.commons.math.distribution.TDistribution tDistribution56 = null;
        org.apache.commons.math.stat.inference.TTestImpl tTestImpl57 = new org.apache.commons.math.stat.inference.TTestImpl(tDistribution56);
        double[] doubleArray63 = new double[] { 1.0f, (short) 1, 100.0f, 1, 0.0f };
        double[] doubleArray68 = new double[] { ' ', (byte) 100, (byte) 1, (-1.0f) };
        double double69 = tTestImpl57.homoscedasticT(doubleArray63, doubleArray68);
        org.apache.commons.math.stat.inference.TTestImpl tTestImpl71 = new org.apache.commons.math.stat.inference.TTestImpl();
        org.apache.commons.math.distribution.TDistribution tDistribution73 = null;
        org.apache.commons.math.stat.inference.TTestImpl tTestImpl74 = new org.apache.commons.math.stat.inference.TTestImpl(tDistribution73);
        double[] doubleArray80 = new double[] { 1.0f, (short) 1, 100.0f, 1, 0.0f };
        double[] doubleArray85 = new double[] { ' ', (byte) 100, (byte) 1, (-1.0f) };
        double double86 = tTestImpl74.homoscedasticT(doubleArray80, doubleArray85);
        double double87 = tTestImpl71.tTest((double) (short) 100, doubleArray80);
        double double88 = tTestImpl57.t((double) 10.0f, doubleArray80);
        double double89 = tTestImpl0.pairedTTest(doubleArray49, doubleArray80);
        org.apache.commons.math.stat.descriptive.StatisticalSummary statisticalSummary91 = null;
        // The following exception was thrown during execution in test generation
        try {
            double double92 = tTestImpl0.t((double) (short) 0, statisticalSummary91);
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
        org.junit.Assert.assertNotNull(doubleArray49);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray49), "[1.0, 1.0, 100.0, 1.0, 0.0]");
        org.junit.Assert.assertNotNull(doubleArray54);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray54), "[32.0, 100.0, 1.0, -1.0]");
        org.junit.Assert.assertTrue("'" + double55 + "' != '" + (-0.405429217622299d) + "'", double55 == (-0.405429217622299d));
        org.junit.Assert.assertNotNull(doubleArray63);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray63), "[1.0, 1.0, 100.0, 1.0, 0.0]");
        org.junit.Assert.assertNotNull(doubleArray68);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray68), "[32.0, 100.0, 1.0, -1.0]");
        org.junit.Assert.assertTrue("'" + double69 + "' != '" + (-0.405429217622299d) + "'", double69 == (-0.405429217622299d));
        org.junit.Assert.assertNotNull(doubleArray80);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray80), "[1.0, 1.0, 100.0, 1.0, 0.0]");
        org.junit.Assert.assertNotNull(doubleArray85);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray85), "[32.0, 100.0, 1.0, -1.0]");
        org.junit.Assert.assertTrue("'" + double86 + "' != '" + (-0.405429217622299d) + "'", double86 == (-0.405429217622299d));
        org.junit.Assert.assertTrue("'" + double87 + "' != '" + 0.01613264369976175d + "'", double87 == 0.01613264369976175d);
        org.junit.Assert.assertTrue("'" + double88 + "' != '" + 0.5339796283719219d + "'", double88 == 0.5339796283719219d);
        org.junit.Assert.assertTrue(Double.isNaN(double89));
    }

    @Test
    public void test3072() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3072");
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
        org.apache.commons.math.distribution.TDistribution tDistribution40 = null;
        tTestImpl39.setDistribution(tDistribution40);
        org.apache.commons.math.distribution.TDistribution tDistribution42 = null;
        org.apache.commons.math.stat.inference.TTestImpl tTestImpl43 = new org.apache.commons.math.stat.inference.TTestImpl(tDistribution42);
        double[] doubleArray49 = new double[] { 1.0f, (short) 1, 100.0f, 1, 0.0f };
        double[] doubleArray54 = new double[] { ' ', (byte) 100, (byte) 1, (-1.0f) };
        double double55 = tTestImpl43.homoscedasticT(doubleArray49, doubleArray54);
        org.apache.commons.math.stat.inference.TTestImpl tTestImpl56 = new org.apache.commons.math.stat.inference.TTestImpl();
        double[] doubleArray60 = new double[] { '4', 'a', '4' };
        org.apache.commons.math.distribution.TDistribution tDistribution61 = null;
        org.apache.commons.math.stat.inference.TTestImpl tTestImpl62 = new org.apache.commons.math.stat.inference.TTestImpl(tDistribution61);
        double[] doubleArray68 = new double[] { 1.0f, (short) 1, 100.0f, 1, 0.0f };
        double[] doubleArray73 = new double[] { ' ', (byte) 100, (byte) 1, (-1.0f) };
        double double74 = tTestImpl62.homoscedasticT(doubleArray68, doubleArray73);
        double double75 = tTestImpl56.tTest(doubleArray60, doubleArray73);
        double double76 = tTestImpl39.homoscedasticT(doubleArray54, doubleArray60);
        org.apache.commons.math.distribution.TDistribution tDistribution77 = null;
        org.apache.commons.math.stat.inference.TTestImpl tTestImpl78 = new org.apache.commons.math.stat.inference.TTestImpl(tDistribution77);
        double[] doubleArray84 = new double[] { 1.0f, (short) 1, 100.0f, 1, 0.0f };
        double[] doubleArray89 = new double[] { ' ', (byte) 100, (byte) 1, (-1.0f) };
        double double90 = tTestImpl78.homoscedasticT(doubleArray84, doubleArray89);
        double double91 = tTestImpl1.homoscedasticT(doubleArray60, doubleArray84);
        org.apache.commons.math.distribution.TDistribution tDistribution92 = null;
        tTestImpl1.setDistribution(tDistribution92);
        org.apache.commons.math.stat.descriptive.StatisticalSummary statisticalSummary95 = null;
        // The following exception was thrown during execution in test generation
        try {
            double double96 = tTestImpl1.t((double) (byte) 1, statisticalSummary95);
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
        org.junit.Assert.assertNotNull(doubleArray49);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray49), "[1.0, 1.0, 100.0, 1.0, 0.0]");
        org.junit.Assert.assertNotNull(doubleArray54);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray54), "[32.0, 100.0, 1.0, -1.0]");
        org.junit.Assert.assertTrue("'" + double55 + "' != '" + (-0.405429217622299d) + "'", double55 == (-0.405429217622299d));
        org.junit.Assert.assertNotNull(doubleArray60);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray60), "[52.0, 97.0, 52.0]");
        org.junit.Assert.assertNotNull(doubleArray68);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray68), "[1.0, 1.0, 100.0, 1.0, 0.0]");
        org.junit.Assert.assertNotNull(doubleArray73);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray73), "[32.0, 100.0, 1.0, -1.0]");
        org.junit.Assert.assertTrue("'" + double74 + "' != '" + (-0.405429217622299d) + "'", double74 == (-0.405429217622299d));
        org.junit.Assert.assertTrue("'" + double75 + "' != '" + 0.2806531524060034d + "'", double75 == 0.2806531524060034d);
        org.junit.Assert.assertTrue("'" + double76 + "' != '" + (-1.1115227041167497d) + "'", double76 == (-1.1115227041167497d));
        org.junit.Assert.assertNotNull(doubleArray84);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray84), "[1.0, 1.0, 100.0, 1.0, 0.0]");
        org.junit.Assert.assertNotNull(doubleArray89);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray89), "[32.0, 100.0, 1.0, -1.0]");
        org.junit.Assert.assertTrue("'" + double90 + "' != '" + (-0.405429217622299d) + "'", double90 == (-0.405429217622299d));
        org.junit.Assert.assertTrue("'" + double91 + "' != '" + 1.6198140498569726d + "'", double91 == 1.6198140498569726d);
    }

    @Test
    public void test3073() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3073");
        org.apache.commons.math.stat.inference.TTestImpl tTestImpl0 = new org.apache.commons.math.stat.inference.TTestImpl();
        org.apache.commons.math.distribution.TDistribution tDistribution1 = null;
        tTestImpl0.setDistribution(tDistribution1);
        org.apache.commons.math.distribution.TDistribution tDistribution3 = null;
        tTestImpl0.setDistribution(tDistribution3);
        org.apache.commons.math.distribution.TDistribution tDistribution5 = null;
        tTestImpl0.setDistribution(tDistribution5);
        org.apache.commons.math.distribution.TDistribution tDistribution7 = null;
        tTestImpl0.setDistribution(tDistribution7);
        org.apache.commons.math.distribution.TDistribution tDistribution9 = null;
        tTestImpl0.setDistribution(tDistribution9);
        org.apache.commons.math.stat.descriptive.StatisticalSummary statisticalSummary11 = null;
        org.apache.commons.math.stat.descriptive.StatisticalSummary statisticalSummary12 = null;
        // The following exception was thrown during execution in test generation
        try {
            double double13 = tTestImpl0.tTest(statisticalSummary11, statisticalSummary12);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: insufficient data for t statistic");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void test3074() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3074");
        org.apache.commons.math.distribution.TDistribution tDistribution0 = null;
        org.apache.commons.math.stat.inference.TTestImpl tTestImpl1 = new org.apache.commons.math.stat.inference.TTestImpl(tDistribution0);
        org.apache.commons.math.distribution.TDistribution tDistribution2 = null;
        tTestImpl1.setDistribution(tDistribution2);
        org.apache.commons.math.stat.inference.TTestImpl tTestImpl5 = new org.apache.commons.math.stat.inference.TTestImpl();
        org.apache.commons.math.stat.inference.TTestImpl tTestImpl7 = new org.apache.commons.math.stat.inference.TTestImpl();
        org.apache.commons.math.distribution.TDistribution tDistribution9 = null;
        org.apache.commons.math.stat.inference.TTestImpl tTestImpl10 = new org.apache.commons.math.stat.inference.TTestImpl(tDistribution9);
        double[] doubleArray16 = new double[] { 1.0f, (short) 1, 100.0f, 1, 0.0f };
        double[] doubleArray21 = new double[] { ' ', (byte) 100, (byte) 1, (-1.0f) };
        double double22 = tTestImpl10.homoscedasticT(doubleArray16, doubleArray21);
        double double23 = tTestImpl7.tTest((double) (short) 100, doubleArray16);
        org.apache.commons.math.distribution.TDistribution tDistribution25 = null;
        org.apache.commons.math.stat.inference.TTestImpl tTestImpl26 = new org.apache.commons.math.stat.inference.TTestImpl(tDistribution25);
        double[] doubleArray32 = new double[] { 1.0f, (short) 1, 100.0f, 1, 0.0f };
        double[] doubleArray37 = new double[] { ' ', (byte) 100, (byte) 1, (-1.0f) };
        double double38 = tTestImpl26.homoscedasticT(doubleArray32, doubleArray37);
        double[] doubleArray46 = new double[] { 1, 100.0f, (-1), (short) 100, 100, (-1) };
        double double47 = tTestImpl26.t((double) '4', doubleArray46);
        double double48 = tTestImpl7.tTest((double) (short) 100, doubleArray46);
        double[] doubleArray55 = new double[] { (byte) -1, (-1), 0.0f, 1.0d, (-1.0f) };
        double double56 = tTestImpl7.tTest(0.405429217622299d, doubleArray55);
        double double57 = tTestImpl5.t(3.8d, doubleArray55);
        double double58 = tTestImpl1.t((double) (short) 1, doubleArray55);
        org.apache.commons.math.distribution.TDistribution tDistribution59 = null;
        tTestImpl1.setDistribution(tDistribution59);
        org.apache.commons.math.stat.descriptive.StatisticalSummary statisticalSummary61 = null;
        org.apache.commons.math.stat.descriptive.StatisticalSummary statisticalSummary62 = null;
        // The following exception was thrown during execution in test generation
        try {
            double double63 = tTestImpl1.t(statisticalSummary61, statisticalSummary62);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: insufficient data for t statistic");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(doubleArray16);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray16), "[1.0, 1.0, 100.0, 1.0, 0.0]");
        org.junit.Assert.assertNotNull(doubleArray21);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray21), "[32.0, 100.0, 1.0, -1.0]");
        org.junit.Assert.assertTrue("'" + double22 + "' != '" + (-0.405429217622299d) + "'", double22 == (-0.405429217622299d));
        org.junit.Assert.assertTrue("'" + double23 + "' != '" + 0.01613264369976175d + "'", double23 == 0.01613264369976175d);
        org.junit.Assert.assertNotNull(doubleArray32);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray32), "[1.0, 1.0, 100.0, 1.0, 0.0]");
        org.junit.Assert.assertNotNull(doubleArray37);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray37), "[32.0, 100.0, 1.0, -1.0]");
        org.junit.Assert.assertTrue("'" + double38 + "' != '" + (-0.405429217622299d) + "'", double38 == (-0.405429217622299d));
        org.junit.Assert.assertNotNull(doubleArray46);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray46), "[1.0, 100.0, -1.0, 100.0, 100.0, -1.0]");
        org.junit.Assert.assertTrue("'" + double47 + "' != '" + (-0.09656583816243881d) + "'", double47 == (-0.09656583816243881d));
        org.junit.Assert.assertTrue("'" + double48 + "' != '" + 0.07560555610353314d + "'", double48 == 0.07560555610353314d);
        org.junit.Assert.assertNotNull(doubleArray55);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray55), "[-1.0, -1.0, 0.0, 1.0, -1.0]");
        org.junit.Assert.assertTrue("'" + double56 + "' != '" + 0.1143321549278642d + "'", double56 == 0.1143321549278642d);
        org.junit.Assert.assertTrue("'" + double57 + "' != '" + (-10.500000000000002d) + "'", double57 == (-10.500000000000002d));
        org.junit.Assert.assertTrue("'" + double58 + "' != '" + (-3.5d) + "'", double58 == (-3.5d));
    }

    @Test
    public void test3075() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3075");
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
        org.apache.commons.math.stat.descriptive.StatisticalSummary statisticalSummary88 = null;
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean90 = tTestImpl0.tTest(0.9755634976417653d, statisticalSummary88, 0.3793626154059051d);
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
    public void test3076() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3076");
        org.apache.commons.math.distribution.TDistribution tDistribution0 = null;
        org.apache.commons.math.stat.inference.TTestImpl tTestImpl1 = new org.apache.commons.math.stat.inference.TTestImpl(tDistribution0);
        org.apache.commons.math.distribution.TDistribution tDistribution2 = null;
        tTestImpl1.setDistribution(tDistribution2);
        org.apache.commons.math.distribution.TDistribution tDistribution4 = null;
        tTestImpl1.setDistribution(tDistribution4);
        org.apache.commons.math.distribution.TDistribution tDistribution7 = null;
        org.apache.commons.math.stat.inference.TTestImpl tTestImpl8 = new org.apache.commons.math.stat.inference.TTestImpl(tDistribution7);
        double[] doubleArray14 = new double[] { 1.0f, (short) 1, 100.0f, 1, 0.0f };
        double[] doubleArray19 = new double[] { ' ', (byte) 100, (byte) 1, (-1.0f) };
        double double20 = tTestImpl8.homoscedasticT(doubleArray14, doubleArray19);
        org.apache.commons.math.distribution.TDistribution tDistribution21 = null;
        tTestImpl8.setDistribution(tDistribution21);
        org.apache.commons.math.stat.inference.TTestImpl tTestImpl24 = new org.apache.commons.math.stat.inference.TTestImpl();
        double[] doubleArray28 = new double[] { '4', 'a', '4' };
        org.apache.commons.math.distribution.TDistribution tDistribution29 = null;
        org.apache.commons.math.stat.inference.TTestImpl tTestImpl30 = new org.apache.commons.math.stat.inference.TTestImpl(tDistribution29);
        double[] doubleArray36 = new double[] { 1.0f, (short) 1, 100.0f, 1, 0.0f };
        double[] doubleArray41 = new double[] { ' ', (byte) 100, (byte) 1, (-1.0f) };
        double double42 = tTestImpl30.homoscedasticT(doubleArray36, doubleArray41);
        double double43 = tTestImpl24.tTest(doubleArray28, doubleArray41);
        double double44 = tTestImpl8.t(10.0d, doubleArray28);
        org.apache.commons.math.distribution.TDistribution tDistribution45 = null;
        org.apache.commons.math.stat.inference.TTestImpl tTestImpl46 = new org.apache.commons.math.stat.inference.TTestImpl(tDistribution45);
        double[] doubleArray52 = new double[] { 1.0f, (short) 1, 100.0f, 1, 0.0f };
        double[] doubleArray57 = new double[] { ' ', (byte) 100, (byte) 1, (-1.0f) };
        double double58 = tTestImpl46.homoscedasticT(doubleArray52, doubleArray57);
        org.apache.commons.math.distribution.TDistribution tDistribution59 = null;
        org.apache.commons.math.stat.inference.TTestImpl tTestImpl60 = new org.apache.commons.math.stat.inference.TTestImpl(tDistribution59);
        double[] doubleArray66 = new double[] { 1.0f, (short) 1, 100.0f, 1, 0.0f };
        double[] doubleArray71 = new double[] { ' ', (byte) 100, (byte) 1, (-1.0f) };
        double double72 = tTestImpl60.homoscedasticT(doubleArray66, doubleArray71);
        org.apache.commons.math.stat.inference.TTestImpl tTestImpl74 = new org.apache.commons.math.stat.inference.TTestImpl();
        org.apache.commons.math.distribution.TDistribution tDistribution76 = null;
        org.apache.commons.math.stat.inference.TTestImpl tTestImpl77 = new org.apache.commons.math.stat.inference.TTestImpl(tDistribution76);
        double[] doubleArray83 = new double[] { 1.0f, (short) 1, 100.0f, 1, 0.0f };
        double[] doubleArray88 = new double[] { ' ', (byte) 100, (byte) 1, (-1.0f) };
        double double89 = tTestImpl77.homoscedasticT(doubleArray83, doubleArray88);
        double double90 = tTestImpl74.tTest((double) (short) 100, doubleArray83);
        double double91 = tTestImpl60.t((double) 10.0f, doubleArray83);
        double double92 = tTestImpl8.homoscedasticT(doubleArray57, doubleArray83);
        double double93 = tTestImpl1.t((double) 1L, doubleArray57);
        org.apache.commons.math.distribution.TDistribution tDistribution94 = null;
        tTestImpl1.setDistribution(tDistribution94);
        org.junit.Assert.assertNotNull(doubleArray14);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray14), "[1.0, 1.0, 100.0, 1.0, 0.0]");
        org.junit.Assert.assertNotNull(doubleArray19);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray19), "[32.0, 100.0, 1.0, -1.0]");
        org.junit.Assert.assertTrue("'" + double20 + "' != '" + (-0.405429217622299d) + "'", double20 == (-0.405429217622299d));
        org.junit.Assert.assertNotNull(doubleArray28);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray28), "[52.0, 97.0, 52.0]");
        org.junit.Assert.assertNotNull(doubleArray36);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray36), "[1.0, 1.0, 100.0, 1.0, 0.0]");
        org.junit.Assert.assertNotNull(doubleArray41);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray41), "[32.0, 100.0, 1.0, -1.0]");
        org.junit.Assert.assertTrue("'" + double42 + "' != '" + (-0.405429217622299d) + "'", double42 == (-0.405429217622299d));
        org.junit.Assert.assertTrue("'" + double43 + "' != '" + 0.2806531524060034d + "'", double43 == 0.2806531524060034d);
        org.junit.Assert.assertTrue("'" + double44 + "' != '" + 3.8d + "'", double44 == 3.8d);
        org.junit.Assert.assertNotNull(doubleArray52);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray52), "[1.0, 1.0, 100.0, 1.0, 0.0]");
        org.junit.Assert.assertNotNull(doubleArray57);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray57), "[32.0, 100.0, 1.0, -1.0]");
        org.junit.Assert.assertTrue("'" + double58 + "' != '" + (-0.405429217622299d) + "'", double58 == (-0.405429217622299d));
        org.junit.Assert.assertNotNull(doubleArray66);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray66), "[1.0, 1.0, 100.0, 1.0, 0.0]");
        org.junit.Assert.assertNotNull(doubleArray71);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray71), "[32.0, 100.0, 1.0, -1.0]");
        org.junit.Assert.assertTrue("'" + double72 + "' != '" + (-0.405429217622299d) + "'", double72 == (-0.405429217622299d));
        org.junit.Assert.assertNotNull(doubleArray83);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray83), "[1.0, 1.0, 100.0, 1.0, 0.0]");
        org.junit.Assert.assertNotNull(doubleArray88);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray88), "[32.0, 100.0, 1.0, -1.0]");
        org.junit.Assert.assertTrue("'" + double89 + "' != '" + (-0.405429217622299d) + "'", double89 == (-0.405429217622299d));
        org.junit.Assert.assertTrue("'" + double90 + "' != '" + 0.01613264369976175d + "'", double90 == 0.01613264369976175d);
        org.junit.Assert.assertTrue("'" + double91 + "' != '" + 0.5339796283719219d + "'", double91 == 0.5339796283719219d);
        org.junit.Assert.assertTrue("'" + double92 + "' != '" + 0.405429217622299d + "'", double92 == 0.405429217622299d);
        org.junit.Assert.assertTrue("'" + double93 + "' != '" + 1.3573057358494125d + "'", double93 == 1.3573057358494125d);
    }

    @Test
    public void test3077() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3077");
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
        org.apache.commons.math.stat.descriptive.StatisticalSummary statisticalSummary24 = null;
        org.apache.commons.math.stat.descriptive.StatisticalSummary statisticalSummary25 = null;
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean27 = tTestImpl0.tTest(statisticalSummary24, statisticalSummary25, 0.1143321549278642d);
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
    public void test3078() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3078");
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
        org.apache.commons.math.distribution.TDistribution tDistribution39 = null;
        tTestImpl1.setDistribution(tDistribution39);
        org.apache.commons.math.distribution.TDistribution tDistribution41 = null;
        tTestImpl1.setDistribution(tDistribution41);
        org.apache.commons.math.distribution.TDistribution tDistribution43 = null;
        tTestImpl1.setDistribution(tDistribution43);
        org.apache.commons.math.distribution.TDistribution tDistribution45 = null;
        tTestImpl1.setDistribution(tDistribution45);
        org.apache.commons.math.stat.descriptive.StatisticalSummary statisticalSummary48 = null;
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean50 = tTestImpl1.tTest((double) 100, statisticalSummary48, (double) (byte) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: bad significance level: 100.0");
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
    }

    @Test
    public void test3079() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3079");
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
        tTestImpl1.setDistribution(tDistribution38);
        org.apache.commons.math.stat.descriptive.StatisticalSummary statisticalSummary41 = null;
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean43 = tTestImpl1.tTest((double) 'a', statisticalSummary41, 0.046643592901765896d);
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
    }

    @Test
    public void test3080() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3080");
        org.apache.commons.math.stat.inference.TTestImpl tTestImpl0 = new org.apache.commons.math.stat.inference.TTestImpl();
        double[] doubleArray4 = new double[] { '4', 'a', '4' };
        org.apache.commons.math.distribution.TDistribution tDistribution5 = null;
        org.apache.commons.math.stat.inference.TTestImpl tTestImpl6 = new org.apache.commons.math.stat.inference.TTestImpl(tDistribution5);
        double[] doubleArray12 = new double[] { 1.0f, (short) 1, 100.0f, 1, 0.0f };
        double[] doubleArray17 = new double[] { ' ', (byte) 100, (byte) 1, (-1.0f) };
        double double18 = tTestImpl6.homoscedasticT(doubleArray12, doubleArray17);
        double double19 = tTestImpl0.tTest(doubleArray4, doubleArray17);
        org.apache.commons.math.stat.descriptive.StatisticalSummary statisticalSummary20 = null;
        org.apache.commons.math.stat.descriptive.StatisticalSummary statisticalSummary21 = null;
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean23 = tTestImpl0.tTest(statisticalSummary20, statisticalSummary21, (-0.405429217622299d));
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: bad significance level: -0.405429217622299");
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
    public void test3081() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3081");
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
        org.apache.commons.math.stat.descriptive.StatisticalSummary statisticalSummary78 = null;
        org.apache.commons.math.stat.descriptive.StatisticalSummary statisticalSummary79 = null;
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean81 = tTestImpl0.tTest(statisticalSummary78, statisticalSummary79, 0.37390096630005876d);
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
    public void test3082() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3082");
        org.apache.commons.math.stat.inference.TTestImpl tTestImpl0 = new org.apache.commons.math.stat.inference.TTestImpl();
        org.apache.commons.math.stat.inference.TTestImpl tTestImpl2 = new org.apache.commons.math.stat.inference.TTestImpl();
        org.apache.commons.math.distribution.TDistribution tDistribution4 = null;
        org.apache.commons.math.stat.inference.TTestImpl tTestImpl5 = new org.apache.commons.math.stat.inference.TTestImpl(tDistribution4);
        double[] doubleArray11 = new double[] { 1.0f, (short) 1, 100.0f, 1, 0.0f };
        double[] doubleArray16 = new double[] { ' ', (byte) 100, (byte) 1, (-1.0f) };
        double double17 = tTestImpl5.homoscedasticT(doubleArray11, doubleArray16);
        double double18 = tTestImpl2.tTest((double) (short) 100, doubleArray11);
        org.apache.commons.math.distribution.TDistribution tDistribution20 = null;
        org.apache.commons.math.stat.inference.TTestImpl tTestImpl21 = new org.apache.commons.math.stat.inference.TTestImpl(tDistribution20);
        double[] doubleArray27 = new double[] { 1.0f, (short) 1, 100.0f, 1, 0.0f };
        double[] doubleArray32 = new double[] { ' ', (byte) 100, (byte) 1, (-1.0f) };
        double double33 = tTestImpl21.homoscedasticT(doubleArray27, doubleArray32);
        double[] doubleArray41 = new double[] { 1, 100.0f, (-1), (short) 100, 100, (-1) };
        double double42 = tTestImpl21.t((double) '4', doubleArray41);
        double double43 = tTestImpl2.tTest((double) (short) 100, doubleArray41);
        double[] doubleArray50 = new double[] { (byte) -1, (-1), 0.0f, 1.0d, (-1.0f) };
        double double51 = tTestImpl2.tTest(0.405429217622299d, doubleArray50);
        double double52 = tTestImpl0.t(3.8d, doubleArray50);
        org.apache.commons.math.distribution.TDistribution tDistribution53 = null;
        tTestImpl0.setDistribution(tDistribution53);
        org.apache.commons.math.distribution.TDistribution tDistribution55 = null;
        tTestImpl0.setDistribution(tDistribution55);
        org.apache.commons.math.distribution.TDistribution tDistribution57 = null;
        tTestImpl0.setDistribution(tDistribution57);
        org.apache.commons.math.distribution.TDistribution tDistribution59 = null;
        tTestImpl0.setDistribution(tDistribution59);
        org.apache.commons.math.stat.descriptive.StatisticalSummary statisticalSummary62 = null;
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean64 = tTestImpl0.tTest((double) (byte) 100, statisticalSummary62, 0.07560555610353314d);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: insufficient data for t statistic");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(doubleArray11);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray11), "[1.0, 1.0, 100.0, 1.0, 0.0]");
        org.junit.Assert.assertNotNull(doubleArray16);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray16), "[32.0, 100.0, 1.0, -1.0]");
        org.junit.Assert.assertTrue("'" + double17 + "' != '" + (-0.405429217622299d) + "'", double17 == (-0.405429217622299d));
        org.junit.Assert.assertTrue("'" + double18 + "' != '" + 0.01613264369976175d + "'", double18 == 0.01613264369976175d);
        org.junit.Assert.assertNotNull(doubleArray27);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray27), "[1.0, 1.0, 100.0, 1.0, 0.0]");
        org.junit.Assert.assertNotNull(doubleArray32);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray32), "[32.0, 100.0, 1.0, -1.0]");
        org.junit.Assert.assertTrue("'" + double33 + "' != '" + (-0.405429217622299d) + "'", double33 == (-0.405429217622299d));
        org.junit.Assert.assertNotNull(doubleArray41);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray41), "[1.0, 100.0, -1.0, 100.0, 100.0, -1.0]");
        org.junit.Assert.assertTrue("'" + double42 + "' != '" + (-0.09656583816243881d) + "'", double42 == (-0.09656583816243881d));
        org.junit.Assert.assertTrue("'" + double43 + "' != '" + 0.07560555610353314d + "'", double43 == 0.07560555610353314d);
        org.junit.Assert.assertNotNull(doubleArray50);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray50), "[-1.0, -1.0, 0.0, 1.0, -1.0]");
        org.junit.Assert.assertTrue("'" + double51 + "' != '" + 0.1143321549278642d + "'", double51 == 0.1143321549278642d);
        org.junit.Assert.assertTrue("'" + double52 + "' != '" + (-10.500000000000002d) + "'", double52 == (-10.500000000000002d));
    }

    @Test
    public void test3083() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3083");
        org.apache.commons.math.stat.inference.TTestImpl tTestImpl0 = new org.apache.commons.math.stat.inference.TTestImpl();
        org.apache.commons.math.distribution.TDistribution tDistribution1 = null;
        tTestImpl0.setDistribution(tDistribution1);
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
        org.apache.commons.math.stat.inference.TTestImpl tTestImpl46 = new org.apache.commons.math.stat.inference.TTestImpl();
        org.apache.commons.math.distribution.TDistribution tDistribution48 = null;
        org.apache.commons.math.stat.inference.TTestImpl tTestImpl49 = new org.apache.commons.math.stat.inference.TTestImpl(tDistribution48);
        double[] doubleArray55 = new double[] { 1.0f, (short) 1, 100.0f, 1, 0.0f };
        double[] doubleArray60 = new double[] { ' ', (byte) 100, (byte) 1, (-1.0f) };
        double double61 = tTestImpl49.homoscedasticT(doubleArray55, doubleArray60);
        double double62 = tTestImpl46.tTest((double) (short) 100, doubleArray55);
        org.apache.commons.math.distribution.TDistribution tDistribution64 = null;
        org.apache.commons.math.stat.inference.TTestImpl tTestImpl65 = new org.apache.commons.math.stat.inference.TTestImpl(tDistribution64);
        double[] doubleArray71 = new double[] { 1.0f, (short) 1, 100.0f, 1, 0.0f };
        double[] doubleArray76 = new double[] { ' ', (byte) 100, (byte) 1, (-1.0f) };
        double double77 = tTestImpl65.homoscedasticT(doubleArray71, doubleArray76);
        double[] doubleArray85 = new double[] { 1, 100.0f, (-1), (short) 100, 100, (-1) };
        double double86 = tTestImpl65.t((double) '4', doubleArray85);
        double double87 = tTestImpl46.tTest((double) (short) 100, doubleArray85);
        double[] doubleArray93 = new double[] { 1.0f, (-0.09656583816243881d), ' ', 0.8463073355328574d, 1.3965146696271626d };
        double double94 = tTestImpl4.homoscedasticTTest(doubleArray85, doubleArray93);
        double double95 = tTestImpl0.t((double) 100, doubleArray93);
        double[] doubleArray96 = null;
        double[] doubleArray97 = null;
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean99 = tTestImpl0.homoscedasticTTest(doubleArray96, doubleArray97, 0.1143321549278642d);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: insufficient data");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
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
        org.junit.Assert.assertNotNull(doubleArray55);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray55), "[1.0, 1.0, 100.0, 1.0, 0.0]");
        org.junit.Assert.assertNotNull(doubleArray60);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray60), "[32.0, 100.0, 1.0, -1.0]");
        org.junit.Assert.assertTrue("'" + double61 + "' != '" + (-0.405429217622299d) + "'", double61 == (-0.405429217622299d));
        org.junit.Assert.assertTrue("'" + double62 + "' != '" + 0.01613264369976175d + "'", double62 == 0.01613264369976175d);
        org.junit.Assert.assertNotNull(doubleArray71);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray71), "[1.0, 1.0, 100.0, 1.0, 0.0]");
        org.junit.Assert.assertNotNull(doubleArray76);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray76), "[32.0, 100.0, 1.0, -1.0]");
        org.junit.Assert.assertTrue("'" + double77 + "' != '" + (-0.405429217622299d) + "'", double77 == (-0.405429217622299d));
        org.junit.Assert.assertNotNull(doubleArray85);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray85), "[1.0, 100.0, -1.0, 100.0, 100.0, -1.0]");
        org.junit.Assert.assertTrue("'" + double86 + "' != '" + (-0.09656583816243881d) + "'", double86 == (-0.09656583816243881d));
        org.junit.Assert.assertTrue("'" + double87 + "' != '" + 0.07560555610353314d + "'", double87 == 0.07560555610353314d);
        org.junit.Assert.assertNotNull(doubleArray93);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray93), "[1.0, -0.09656583816243881, 32.0, 0.8463073355328574, 1.3965146696271626]");
        org.junit.Assert.assertTrue("'" + double94 + "' != '" + 0.12673187601587688d + "'", double94 == 0.12673187601587688d);
        org.junit.Assert.assertTrue("'" + double95 + "' != '" + (-14.881283513379177d) + "'", double95 == (-14.881283513379177d));
    }

    @Test
    public void test3084() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3084");
        org.apache.commons.math.distribution.TDistribution tDistribution0 = null;
        org.apache.commons.math.stat.inference.TTestImpl tTestImpl1 = new org.apache.commons.math.stat.inference.TTestImpl(tDistribution0);
        org.apache.commons.math.distribution.TDistribution tDistribution2 = null;
        tTestImpl1.setDistribution(tDistribution2);
        org.apache.commons.math.distribution.TDistribution tDistribution4 = null;
        tTestImpl1.setDistribution(tDistribution4);
        org.apache.commons.math.distribution.TDistribution tDistribution6 = null;
        tTestImpl1.setDistribution(tDistribution6);
        org.apache.commons.math.stat.inference.TTestImpl tTestImpl9 = new org.apache.commons.math.stat.inference.TTestImpl();
        double[] doubleArray13 = new double[] { '4', 'a', '4' };
        org.apache.commons.math.distribution.TDistribution tDistribution14 = null;
        org.apache.commons.math.stat.inference.TTestImpl tTestImpl15 = new org.apache.commons.math.stat.inference.TTestImpl(tDistribution14);
        double[] doubleArray21 = new double[] { 1.0f, (short) 1, 100.0f, 1, 0.0f };
        double[] doubleArray26 = new double[] { ' ', (byte) 100, (byte) 1, (-1.0f) };
        double double27 = tTestImpl15.homoscedasticT(doubleArray21, doubleArray26);
        double double28 = tTestImpl9.tTest(doubleArray13, doubleArray26);
        org.apache.commons.math.distribution.TDistribution tDistribution29 = null;
        org.apache.commons.math.stat.inference.TTestImpl tTestImpl30 = new org.apache.commons.math.stat.inference.TTestImpl(tDistribution29);
        double[] doubleArray36 = new double[] { 1.0f, (short) 1, 100.0f, 1, 0.0f };
        double[] doubleArray41 = new double[] { ' ', (byte) 100, (byte) 1, (-1.0f) };
        double double42 = tTestImpl30.homoscedasticT(doubleArray36, doubleArray41);
        org.apache.commons.math.distribution.TDistribution tDistribution43 = null;
        org.apache.commons.math.stat.inference.TTestImpl tTestImpl44 = new org.apache.commons.math.stat.inference.TTestImpl(tDistribution43);
        double[] doubleArray50 = new double[] { 1.0f, (short) 1, 100.0f, 1, 0.0f };
        double[] doubleArray55 = new double[] { ' ', (byte) 100, (byte) 1, (-1.0f) };
        double double56 = tTestImpl44.homoscedasticT(doubleArray50, doubleArray55);
        org.apache.commons.math.stat.inference.TTestImpl tTestImpl57 = new org.apache.commons.math.stat.inference.TTestImpl();
        double[] doubleArray61 = new double[] { '4', 'a', '4' };
        org.apache.commons.math.distribution.TDistribution tDistribution62 = null;
        org.apache.commons.math.stat.inference.TTestImpl tTestImpl63 = new org.apache.commons.math.stat.inference.TTestImpl(tDistribution62);
        double[] doubleArray69 = new double[] { 1.0f, (short) 1, 100.0f, 1, 0.0f };
        double[] doubleArray74 = new double[] { ' ', (byte) 100, (byte) 1, (-1.0f) };
        double double75 = tTestImpl63.homoscedasticT(doubleArray69, doubleArray74);
        double double76 = tTestImpl57.tTest(doubleArray61, doubleArray74);
        org.apache.commons.math.distribution.TDistribution tDistribution77 = null;
        org.apache.commons.math.stat.inference.TTestImpl tTestImpl78 = new org.apache.commons.math.stat.inference.TTestImpl(tDistribution77);
        double[] doubleArray84 = new double[] { 1.0f, (short) 1, 100.0f, 1, 0.0f };
        double[] doubleArray89 = new double[] { ' ', (byte) 100, (byte) 1, (-1.0f) };
        double double90 = tTestImpl78.homoscedasticT(doubleArray84, doubleArray89);
        double double91 = tTestImpl44.t(doubleArray74, doubleArray89);
        double double92 = tTestImpl9.homoscedasticT(doubleArray36, doubleArray89);
        double double93 = tTestImpl1.t(0.987358558121667d, doubleArray89);
        org.junit.Assert.assertNotNull(doubleArray13);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray13), "[52.0, 97.0, 52.0]");
        org.junit.Assert.assertNotNull(doubleArray21);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray21), "[1.0, 1.0, 100.0, 1.0, 0.0]");
        org.junit.Assert.assertNotNull(doubleArray26);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray26), "[32.0, 100.0, 1.0, -1.0]");
        org.junit.Assert.assertTrue("'" + double27 + "' != '" + (-0.405429217622299d) + "'", double27 == (-0.405429217622299d));
        org.junit.Assert.assertTrue("'" + double28 + "' != '" + 0.2806531524060034d + "'", double28 == 0.2806531524060034d);
        org.junit.Assert.assertNotNull(doubleArray36);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray36), "[1.0, 1.0, 100.0, 1.0, 0.0]");
        org.junit.Assert.assertNotNull(doubleArray41);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray41), "[32.0, 100.0, 1.0, -1.0]");
        org.junit.Assert.assertTrue("'" + double42 + "' != '" + (-0.405429217622299d) + "'", double42 == (-0.405429217622299d));
        org.junit.Assert.assertNotNull(doubleArray50);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray50), "[1.0, 1.0, 100.0, 1.0, 0.0]");
        org.junit.Assert.assertNotNull(doubleArray55);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray55), "[32.0, 100.0, 1.0, -1.0]");
        org.junit.Assert.assertTrue("'" + double56 + "' != '" + (-0.405429217622299d) + "'", double56 == (-0.405429217622299d));
        org.junit.Assert.assertNotNull(doubleArray61);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray61), "[52.0, 97.0, 52.0]");
        org.junit.Assert.assertNotNull(doubleArray69);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray69), "[1.0, 1.0, 100.0, 1.0, 0.0]");
        org.junit.Assert.assertNotNull(doubleArray74);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray74), "[32.0, 100.0, 1.0, -1.0]");
        org.junit.Assert.assertTrue("'" + double75 + "' != '" + (-0.405429217622299d) + "'", double75 == (-0.405429217622299d));
        org.junit.Assert.assertTrue("'" + double76 + "' != '" + 0.2806531524060034d + "'", double76 == 0.2806531524060034d);
        org.junit.Assert.assertNotNull(doubleArray84);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray84), "[1.0, 1.0, 100.0, 1.0, 0.0]");
        org.junit.Assert.assertNotNull(doubleArray89);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray89), "[32.0, 100.0, 1.0, -1.0]");
        org.junit.Assert.assertTrue("'" + double90 + "' != '" + (-0.405429217622299d) + "'", double90 == (-0.405429217622299d));
        org.junit.Assert.assertTrue("'" + double91 + "' != '" + 0.0d + "'", double91 == 0.0d);
        org.junit.Assert.assertTrue("'" + double92 + "' != '" + (-0.405429217622299d) + "'", double92 == (-0.405429217622299d));
        org.junit.Assert.assertTrue("'" + double93 + "' != '" + 1.357841932773502d + "'", double93 == 1.357841932773502d);
    }

    @Test
    public void test3085() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3085");
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
        double double38 = tTestImpl0.tTest(0.9755634976417653d, doubleArray35);
        org.apache.commons.math.distribution.TDistribution tDistribution39 = null;
        tTestImpl0.setDistribution(tDistribution39);
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
        org.junit.Assert.assertTrue("'" + double38 + "' != '" + 0.2674771174879971d + "'", double38 == 0.2674771174879971d);
    }

    @Test
    public void test3086() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3086");
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
        org.apache.commons.math.stat.inference.TTestImpl tTestImpl37 = new org.apache.commons.math.stat.inference.TTestImpl(tDistribution36);
        double[] doubleArray43 = new double[] { 1.0f, (short) 1, 100.0f, 1, 0.0f };
        double[] doubleArray48 = new double[] { ' ', (byte) 100, (byte) 1, (-1.0f) };
        double double49 = tTestImpl37.homoscedasticT(doubleArray43, doubleArray48);
        org.apache.commons.math.distribution.TDistribution tDistribution50 = null;
        org.apache.commons.math.stat.inference.TTestImpl tTestImpl51 = new org.apache.commons.math.stat.inference.TTestImpl(tDistribution50);
        double[] doubleArray57 = new double[] { 1.0f, (short) 1, 100.0f, 1, 0.0f };
        double[] doubleArray62 = new double[] { ' ', (byte) 100, (byte) 1, (-1.0f) };
        double double63 = tTestImpl51.homoscedasticT(doubleArray57, doubleArray62);
        org.apache.commons.math.distribution.TDistribution tDistribution64 = null;
        tTestImpl51.setDistribution(tDistribution64);
        org.apache.commons.math.stat.inference.TTestImpl tTestImpl67 = new org.apache.commons.math.stat.inference.TTestImpl();
        double[] doubleArray71 = new double[] { '4', 'a', '4' };
        org.apache.commons.math.distribution.TDistribution tDistribution72 = null;
        org.apache.commons.math.stat.inference.TTestImpl tTestImpl73 = new org.apache.commons.math.stat.inference.TTestImpl(tDistribution72);
        double[] doubleArray79 = new double[] { 1.0f, (short) 1, 100.0f, 1, 0.0f };
        double[] doubleArray84 = new double[] { ' ', (byte) 100, (byte) 1, (-1.0f) };
        double double85 = tTestImpl73.homoscedasticT(doubleArray79, doubleArray84);
        double double86 = tTestImpl67.tTest(doubleArray71, doubleArray84);
        double double87 = tTestImpl51.t(10.0d, doubleArray71);
        double double88 = tTestImpl0.tTest(doubleArray48, doubleArray71);
        org.apache.commons.math.distribution.TDistribution tDistribution89 = null;
        tTestImpl0.setDistribution(tDistribution89);
        org.apache.commons.math.stat.descriptive.StatisticalSummary statisticalSummary91 = null;
        org.apache.commons.math.stat.descriptive.StatisticalSummary statisticalSummary92 = null;
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean94 = tTestImpl0.tTest(statisticalSummary91, statisticalSummary92, 0.2752975451271431d);
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
        org.junit.Assert.assertNotNull(doubleArray43);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray43), "[1.0, 1.0, 100.0, 1.0, 0.0]");
        org.junit.Assert.assertNotNull(doubleArray48);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray48), "[32.0, 100.0, 1.0, -1.0]");
        org.junit.Assert.assertTrue("'" + double49 + "' != '" + (-0.405429217622299d) + "'", double49 == (-0.405429217622299d));
        org.junit.Assert.assertNotNull(doubleArray57);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray57), "[1.0, 1.0, 100.0, 1.0, 0.0]");
        org.junit.Assert.assertNotNull(doubleArray62);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray62), "[32.0, 100.0, 1.0, -1.0]");
        org.junit.Assert.assertTrue("'" + double63 + "' != '" + (-0.405429217622299d) + "'", double63 == (-0.405429217622299d));
        org.junit.Assert.assertNotNull(doubleArray71);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray71), "[52.0, 97.0, 52.0]");
        org.junit.Assert.assertNotNull(doubleArray79);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray79), "[1.0, 1.0, 100.0, 1.0, 0.0]");
        org.junit.Assert.assertNotNull(doubleArray84);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray84), "[32.0, 100.0, 1.0, -1.0]");
        org.junit.Assert.assertTrue("'" + double85 + "' != '" + (-0.405429217622299d) + "'", double85 == (-0.405429217622299d));
        org.junit.Assert.assertTrue("'" + double86 + "' != '" + 0.2806531524060034d + "'", double86 == 0.2806531524060034d);
        org.junit.Assert.assertTrue("'" + double87 + "' != '" + 3.8d + "'", double87 == 3.8d);
        org.junit.Assert.assertTrue("'" + double88 + "' != '" + 0.2806531524060034d + "'", double88 == 0.2806531524060034d);
    }

    @Test
    public void test3087() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3087");
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
        org.apache.commons.math.distribution.TDistribution tDistribution62 = null;
        tTestImpl0.setDistribution(tDistribution62);
        org.apache.commons.math.distribution.TDistribution tDistribution64 = null;
        tTestImpl0.setDistribution(tDistribution64);
        org.apache.commons.math.distribution.TDistribution tDistribution66 = null;
        tTestImpl0.setDistribution(tDistribution66);
        double[] doubleArray74 = new double[] { (-2.8418588844347075d), 100.0f, (-1.0f), 0.35800486798369846d, 0.01613264369976175d };
        double double75 = tTestImpl0.t((double) (short) 0, doubleArray74);
        org.apache.commons.math.distribution.TDistribution tDistribution76 = null;
        tTestImpl0.setDistribution(tDistribution76);
        org.apache.commons.math.stat.descriptive.StatisticalSummary statisticalSummary78 = null;
        org.apache.commons.math.stat.descriptive.StatisticalSummary statisticalSummary79 = null;
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean81 = tTestImpl0.tTest(statisticalSummary78, statisticalSummary79, 4.466666666666667d);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: bad significance level: 4.466666666666667");
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
        org.junit.Assert.assertNotNull(doubleArray74);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray74), "[-2.8418588844347075, 100.0, -1.0, 0.35800486798369846, 0.01613264369976175]");
        org.junit.Assert.assertTrue("'" + double75 + "' != '" + 0.9566618438474437d + "'", double75 == 0.9566618438474437d);
    }

    @Test
    public void test3088() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3088");
        org.apache.commons.math.stat.inference.TTestImpl tTestImpl0 = new org.apache.commons.math.stat.inference.TTestImpl();
        double[] doubleArray4 = new double[] { '4', 'a', '4' };
        org.apache.commons.math.distribution.TDistribution tDistribution5 = null;
        org.apache.commons.math.stat.inference.TTestImpl tTestImpl6 = new org.apache.commons.math.stat.inference.TTestImpl(tDistribution5);
        double[] doubleArray12 = new double[] { 1.0f, (short) 1, 100.0f, 1, 0.0f };
        double[] doubleArray17 = new double[] { ' ', (byte) 100, (byte) 1, (-1.0f) };
        double double18 = tTestImpl6.homoscedasticT(doubleArray12, doubleArray17);
        double double19 = tTestImpl0.tTest(doubleArray4, doubleArray17);
        org.apache.commons.math.distribution.TDistribution tDistribution20 = null;
        org.apache.commons.math.stat.inference.TTestImpl tTestImpl21 = new org.apache.commons.math.stat.inference.TTestImpl(tDistribution20);
        double[] doubleArray27 = new double[] { 1.0f, (short) 1, 100.0f, 1, 0.0f };
        double[] doubleArray32 = new double[] { ' ', (byte) 100, (byte) 1, (-1.0f) };
        double double33 = tTestImpl21.homoscedasticT(doubleArray27, doubleArray32);
        org.apache.commons.math.distribution.TDistribution tDistribution34 = null;
        org.apache.commons.math.stat.inference.TTestImpl tTestImpl35 = new org.apache.commons.math.stat.inference.TTestImpl(tDistribution34);
        double[] doubleArray41 = new double[] { 1.0f, (short) 1, 100.0f, 1, 0.0f };
        double[] doubleArray46 = new double[] { ' ', (byte) 100, (byte) 1, (-1.0f) };
        double double47 = tTestImpl35.homoscedasticT(doubleArray41, doubleArray46);
        org.apache.commons.math.stat.inference.TTestImpl tTestImpl48 = new org.apache.commons.math.stat.inference.TTestImpl();
        double[] doubleArray52 = new double[] { '4', 'a', '4' };
        org.apache.commons.math.distribution.TDistribution tDistribution53 = null;
        org.apache.commons.math.stat.inference.TTestImpl tTestImpl54 = new org.apache.commons.math.stat.inference.TTestImpl(tDistribution53);
        double[] doubleArray60 = new double[] { 1.0f, (short) 1, 100.0f, 1, 0.0f };
        double[] doubleArray65 = new double[] { ' ', (byte) 100, (byte) 1, (-1.0f) };
        double double66 = tTestImpl54.homoscedasticT(doubleArray60, doubleArray65);
        double double67 = tTestImpl48.tTest(doubleArray52, doubleArray65);
        org.apache.commons.math.distribution.TDistribution tDistribution68 = null;
        org.apache.commons.math.stat.inference.TTestImpl tTestImpl69 = new org.apache.commons.math.stat.inference.TTestImpl(tDistribution68);
        double[] doubleArray75 = new double[] { 1.0f, (short) 1, 100.0f, 1, 0.0f };
        double[] doubleArray80 = new double[] { ' ', (byte) 100, (byte) 1, (-1.0f) };
        double double81 = tTestImpl69.homoscedasticT(doubleArray75, doubleArray80);
        double double82 = tTestImpl35.t(doubleArray65, doubleArray80);
        double double83 = tTestImpl0.homoscedasticT(doubleArray27, doubleArray80);
        org.apache.commons.math.distribution.TDistribution tDistribution84 = null;
        tTestImpl0.setDistribution(tDistribution84);
        org.apache.commons.math.stat.descriptive.StatisticalSummary statisticalSummary87 = null;
        // The following exception was thrown during execution in test generation
        try {
            double double88 = tTestImpl0.tTest((-3.4573000176073028d), statisticalSummary87);
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
        org.junit.Assert.assertNotNull(doubleArray27);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray27), "[1.0, 1.0, 100.0, 1.0, 0.0]");
        org.junit.Assert.assertNotNull(doubleArray32);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray32), "[32.0, 100.0, 1.0, -1.0]");
        org.junit.Assert.assertTrue("'" + double33 + "' != '" + (-0.405429217622299d) + "'", double33 == (-0.405429217622299d));
        org.junit.Assert.assertNotNull(doubleArray41);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray41), "[1.0, 1.0, 100.0, 1.0, 0.0]");
        org.junit.Assert.assertNotNull(doubleArray46);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray46), "[32.0, 100.0, 1.0, -1.0]");
        org.junit.Assert.assertTrue("'" + double47 + "' != '" + (-0.405429217622299d) + "'", double47 == (-0.405429217622299d));
        org.junit.Assert.assertNotNull(doubleArray52);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray52), "[52.0, 97.0, 52.0]");
        org.junit.Assert.assertNotNull(doubleArray60);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray60), "[1.0, 1.0, 100.0, 1.0, 0.0]");
        org.junit.Assert.assertNotNull(doubleArray65);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray65), "[32.0, 100.0, 1.0, -1.0]");
        org.junit.Assert.assertTrue("'" + double66 + "' != '" + (-0.405429217622299d) + "'", double66 == (-0.405429217622299d));
        org.junit.Assert.assertTrue("'" + double67 + "' != '" + 0.2806531524060034d + "'", double67 == 0.2806531524060034d);
        org.junit.Assert.assertNotNull(doubleArray75);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray75), "[1.0, 1.0, 100.0, 1.0, 0.0]");
        org.junit.Assert.assertNotNull(doubleArray80);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray80), "[32.0, 100.0, 1.0, -1.0]");
        org.junit.Assert.assertTrue("'" + double81 + "' != '" + (-0.405429217622299d) + "'", double81 == (-0.405429217622299d));
        org.junit.Assert.assertTrue("'" + double82 + "' != '" + 0.0d + "'", double82 == 0.0d);
        org.junit.Assert.assertTrue("'" + double83 + "' != '" + (-0.405429217622299d) + "'", double83 == (-0.405429217622299d));
    }

    @Test
    public void test3089() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3089");
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
        org.apache.commons.math.stat.descriptive.StatisticalSummary statisticalSummary91 = null;
        org.apache.commons.math.stat.descriptive.StatisticalSummary statisticalSummary92 = null;
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean94 = tTestImpl0.tTest(statisticalSummary91, statisticalSummary92, (double) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: bad significance level: 1.0");
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
    public void test3090() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3090");
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
        org.apache.commons.math.stat.descriptive.StatisticalSummary statisticalSummary92 = null;
        // The following exception was thrown during execution in test generation
        try {
            double double93 = tTestImpl0.tTest((-1.0000000000000002d), statisticalSummary92);
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
    public void test3091() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3091");
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
        org.apache.commons.math.distribution.TDistribution tDistribution40 = null;
        tTestImpl39.setDistribution(tDistribution40);
        org.apache.commons.math.distribution.TDistribution tDistribution42 = null;
        org.apache.commons.math.stat.inference.TTestImpl tTestImpl43 = new org.apache.commons.math.stat.inference.TTestImpl(tDistribution42);
        double[] doubleArray49 = new double[] { 1.0f, (short) 1, 100.0f, 1, 0.0f };
        double[] doubleArray54 = new double[] { ' ', (byte) 100, (byte) 1, (-1.0f) };
        double double55 = tTestImpl43.homoscedasticT(doubleArray49, doubleArray54);
        org.apache.commons.math.stat.inference.TTestImpl tTestImpl56 = new org.apache.commons.math.stat.inference.TTestImpl();
        double[] doubleArray60 = new double[] { '4', 'a', '4' };
        org.apache.commons.math.distribution.TDistribution tDistribution61 = null;
        org.apache.commons.math.stat.inference.TTestImpl tTestImpl62 = new org.apache.commons.math.stat.inference.TTestImpl(tDistribution61);
        double[] doubleArray68 = new double[] { 1.0f, (short) 1, 100.0f, 1, 0.0f };
        double[] doubleArray73 = new double[] { ' ', (byte) 100, (byte) 1, (-1.0f) };
        double double74 = tTestImpl62.homoscedasticT(doubleArray68, doubleArray73);
        double double75 = tTestImpl56.tTest(doubleArray60, doubleArray73);
        double double76 = tTestImpl39.homoscedasticT(doubleArray54, doubleArray60);
        org.apache.commons.math.distribution.TDistribution tDistribution77 = null;
        org.apache.commons.math.stat.inference.TTestImpl tTestImpl78 = new org.apache.commons.math.stat.inference.TTestImpl(tDistribution77);
        double[] doubleArray84 = new double[] { 1.0f, (short) 1, 100.0f, 1, 0.0f };
        double[] doubleArray89 = new double[] { ' ', (byte) 100, (byte) 1, (-1.0f) };
        double double90 = tTestImpl78.homoscedasticT(doubleArray84, doubleArray89);
        double double91 = tTestImpl1.homoscedasticT(doubleArray60, doubleArray84);
        org.apache.commons.math.stat.descriptive.StatisticalSummary statisticalSummary93 = null;
        // The following exception was thrown during execution in test generation
        try {
            double double94 = tTestImpl1.t((-1.1115227041167497d), statisticalSummary93);
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
        org.junit.Assert.assertNotNull(doubleArray49);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray49), "[1.0, 1.0, 100.0, 1.0, 0.0]");
        org.junit.Assert.assertNotNull(doubleArray54);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray54), "[32.0, 100.0, 1.0, -1.0]");
        org.junit.Assert.assertTrue("'" + double55 + "' != '" + (-0.405429217622299d) + "'", double55 == (-0.405429217622299d));
        org.junit.Assert.assertNotNull(doubleArray60);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray60), "[52.0, 97.0, 52.0]");
        org.junit.Assert.assertNotNull(doubleArray68);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray68), "[1.0, 1.0, 100.0, 1.0, 0.0]");
        org.junit.Assert.assertNotNull(doubleArray73);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray73), "[32.0, 100.0, 1.0, -1.0]");
        org.junit.Assert.assertTrue("'" + double74 + "' != '" + (-0.405429217622299d) + "'", double74 == (-0.405429217622299d));
        org.junit.Assert.assertTrue("'" + double75 + "' != '" + 0.2806531524060034d + "'", double75 == 0.2806531524060034d);
        org.junit.Assert.assertTrue("'" + double76 + "' != '" + (-1.1115227041167497d) + "'", double76 == (-1.1115227041167497d));
        org.junit.Assert.assertNotNull(doubleArray84);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray84), "[1.0, 1.0, 100.0, 1.0, 0.0]");
        org.junit.Assert.assertNotNull(doubleArray89);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray89), "[32.0, 100.0, 1.0, -1.0]");
        org.junit.Assert.assertTrue("'" + double90 + "' != '" + (-0.405429217622299d) + "'", double90 == (-0.405429217622299d));
        org.junit.Assert.assertTrue("'" + double91 + "' != '" + 1.6198140498569726d + "'", double91 == 1.6198140498569726d);
    }

    @Test
    public void test3092() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3092");
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
        org.apache.commons.math.stat.descriptive.StatisticalSummary statisticalSummary67 = null;
        org.apache.commons.math.stat.descriptive.StatisticalSummary statisticalSummary68 = null;
        // The following exception was thrown during execution in test generation
        try {
            double double69 = tTestImpl1.tTest(statisticalSummary67, statisticalSummary68);
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
    }

    @Test
    public void test3093() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3093");
        org.apache.commons.math.distribution.TDistribution tDistribution0 = null;
        org.apache.commons.math.stat.inference.TTestImpl tTestImpl1 = new org.apache.commons.math.stat.inference.TTestImpl(tDistribution0);
        org.apache.commons.math.distribution.TDistribution tDistribution2 = null;
        tTestImpl1.setDistribution(tDistribution2);
        org.apache.commons.math.distribution.TDistribution tDistribution4 = null;
        tTestImpl1.setDistribution(tDistribution4);
        org.apache.commons.math.distribution.TDistribution tDistribution6 = null;
        tTestImpl1.setDistribution(tDistribution6);
        org.apache.commons.math.distribution.TDistribution tDistribution8 = null;
        tTestImpl1.setDistribution(tDistribution8);
        org.apache.commons.math.distribution.TDistribution tDistribution11 = null;
        org.apache.commons.math.stat.inference.TTestImpl tTestImpl12 = new org.apache.commons.math.stat.inference.TTestImpl(tDistribution11);
        org.apache.commons.math.distribution.TDistribution tDistribution14 = null;
        org.apache.commons.math.stat.inference.TTestImpl tTestImpl15 = new org.apache.commons.math.stat.inference.TTestImpl(tDistribution14);
        double[] doubleArray21 = new double[] { 1.0f, (short) 1, 100.0f, 1, 0.0f };
        double[] doubleArray26 = new double[] { ' ', (byte) 100, (byte) 1, (-1.0f) };
        double double27 = tTestImpl15.homoscedasticT(doubleArray21, doubleArray26);
        org.apache.commons.math.stat.inference.TTestImpl tTestImpl28 = new org.apache.commons.math.stat.inference.TTestImpl();
        double[] doubleArray32 = new double[] { '4', 'a', '4' };
        org.apache.commons.math.distribution.TDistribution tDistribution33 = null;
        org.apache.commons.math.stat.inference.TTestImpl tTestImpl34 = new org.apache.commons.math.stat.inference.TTestImpl(tDistribution33);
        double[] doubleArray40 = new double[] { 1.0f, (short) 1, 100.0f, 1, 0.0f };
        double[] doubleArray45 = new double[] { ' ', (byte) 100, (byte) 1, (-1.0f) };
        double double46 = tTestImpl34.homoscedasticT(doubleArray40, doubleArray45);
        double double47 = tTestImpl28.tTest(doubleArray32, doubleArray45);
        org.apache.commons.math.distribution.TDistribution tDistribution48 = null;
        org.apache.commons.math.stat.inference.TTestImpl tTestImpl49 = new org.apache.commons.math.stat.inference.TTestImpl(tDistribution48);
        double[] doubleArray55 = new double[] { 1.0f, (short) 1, 100.0f, 1, 0.0f };
        double[] doubleArray60 = new double[] { ' ', (byte) 100, (byte) 1, (-1.0f) };
        double double61 = tTestImpl49.homoscedasticT(doubleArray55, doubleArray60);
        double double62 = tTestImpl15.t(doubleArray45, doubleArray60);
        double double63 = tTestImpl12.t((double) 10.0f, doubleArray60);
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean65 = tTestImpl1.tTest(Double.NaN, doubleArray60, (double) '#');
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: bad significance level: 35.0");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(doubleArray21);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray21), "[1.0, 1.0, 100.0, 1.0, 0.0]");
        org.junit.Assert.assertNotNull(doubleArray26);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray26), "[32.0, 100.0, 1.0, -1.0]");
        org.junit.Assert.assertTrue("'" + double27 + "' != '" + (-0.405429217622299d) + "'", double27 == (-0.405429217622299d));
        org.junit.Assert.assertNotNull(doubleArray32);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray32), "[52.0, 97.0, 52.0]");
        org.junit.Assert.assertNotNull(doubleArray40);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray40), "[1.0, 1.0, 100.0, 1.0, 0.0]");
        org.junit.Assert.assertNotNull(doubleArray45);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray45), "[32.0, 100.0, 1.0, -1.0]");
        org.junit.Assert.assertTrue("'" + double46 + "' != '" + (-0.405429217622299d) + "'", double46 == (-0.405429217622299d));
        org.junit.Assert.assertTrue("'" + double47 + "' != '" + 0.2806531524060034d + "'", double47 == 0.2806531524060034d);
        org.junit.Assert.assertNotNull(doubleArray55);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray55), "[1.0, 1.0, 100.0, 1.0, 0.0]");
        org.junit.Assert.assertNotNull(doubleArray60);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray60), "[32.0, 100.0, 1.0, -1.0]");
        org.junit.Assert.assertTrue("'" + double61 + "' != '" + (-0.405429217622299d) + "'", double61 == (-0.405429217622299d));
        org.junit.Assert.assertTrue("'" + double62 + "' != '" + 0.0d + "'", double62 == 0.0d);
        org.junit.Assert.assertTrue("'" + double63 + "' != '" + 0.9755634976417653d + "'", double63 == 0.9755634976417653d);
    }

    @Test
    public void test3094() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3094");
        org.apache.commons.math.stat.inference.TTestImpl tTestImpl0 = new org.apache.commons.math.stat.inference.TTestImpl();
        org.apache.commons.math.distribution.TDistribution tDistribution1 = null;
        tTestImpl0.setDistribution(tDistribution1);
        org.apache.commons.math.distribution.TDistribution tDistribution3 = null;
        tTestImpl0.setDistribution(tDistribution3);
        double[] doubleArray5 = null;
        org.apache.commons.math.distribution.TDistribution tDistribution6 = null;
        org.apache.commons.math.stat.inference.TTestImpl tTestImpl7 = new org.apache.commons.math.stat.inference.TTestImpl(tDistribution6);
        double[] doubleArray13 = new double[] { 1.0f, (short) 1, 100.0f, 1, 0.0f };
        double[] doubleArray18 = new double[] { ' ', (byte) 100, (byte) 1, (-1.0f) };
        double double19 = tTestImpl7.homoscedasticT(doubleArray13, doubleArray18);
        org.apache.commons.math.distribution.TDistribution tDistribution20 = null;
        tTestImpl7.setDistribution(tDistribution20);
        org.apache.commons.math.stat.inference.TTestImpl tTestImpl23 = new org.apache.commons.math.stat.inference.TTestImpl();
        double[] doubleArray27 = new double[] { '4', 'a', '4' };
        org.apache.commons.math.distribution.TDistribution tDistribution28 = null;
        org.apache.commons.math.stat.inference.TTestImpl tTestImpl29 = new org.apache.commons.math.stat.inference.TTestImpl(tDistribution28);
        double[] doubleArray35 = new double[] { 1.0f, (short) 1, 100.0f, 1, 0.0f };
        double[] doubleArray40 = new double[] { ' ', (byte) 100, (byte) 1, (-1.0f) };
        double double41 = tTestImpl29.homoscedasticT(doubleArray35, doubleArray40);
        double double42 = tTestImpl23.tTest(doubleArray27, doubleArray40);
        double double43 = tTestImpl7.t(10.0d, doubleArray27);
        org.apache.commons.math.distribution.TDistribution tDistribution44 = null;
        org.apache.commons.math.stat.inference.TTestImpl tTestImpl45 = new org.apache.commons.math.stat.inference.TTestImpl(tDistribution44);
        double[] doubleArray51 = new double[] { 1.0f, (short) 1, 100.0f, 1, 0.0f };
        double[] doubleArray56 = new double[] { ' ', (byte) 100, (byte) 1, (-1.0f) };
        double double57 = tTestImpl45.homoscedasticT(doubleArray51, doubleArray56);
        org.apache.commons.math.distribution.TDistribution tDistribution58 = null;
        org.apache.commons.math.stat.inference.TTestImpl tTestImpl59 = new org.apache.commons.math.stat.inference.TTestImpl(tDistribution58);
        double[] doubleArray65 = new double[] { 1.0f, (short) 1, 100.0f, 1, 0.0f };
        double[] doubleArray70 = new double[] { ' ', (byte) 100, (byte) 1, (-1.0f) };
        double double71 = tTestImpl59.homoscedasticT(doubleArray65, doubleArray70);
        org.apache.commons.math.stat.inference.TTestImpl tTestImpl73 = new org.apache.commons.math.stat.inference.TTestImpl();
        org.apache.commons.math.distribution.TDistribution tDistribution75 = null;
        org.apache.commons.math.stat.inference.TTestImpl tTestImpl76 = new org.apache.commons.math.stat.inference.TTestImpl(tDistribution75);
        double[] doubleArray82 = new double[] { 1.0f, (short) 1, 100.0f, 1, 0.0f };
        double[] doubleArray87 = new double[] { ' ', (byte) 100, (byte) 1, (-1.0f) };
        double double88 = tTestImpl76.homoscedasticT(doubleArray82, doubleArray87);
        double double89 = tTestImpl73.tTest((double) (short) 100, doubleArray82);
        double double90 = tTestImpl59.t((double) 10.0f, doubleArray82);
        double double91 = tTestImpl7.homoscedasticT(doubleArray56, doubleArray82);
        // The following exception was thrown during execution in test generation
        try {
            double double92 = tTestImpl0.tTest(doubleArray5, doubleArray56);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: insufficient data");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(doubleArray13);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray13), "[1.0, 1.0, 100.0, 1.0, 0.0]");
        org.junit.Assert.assertNotNull(doubleArray18);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray18), "[32.0, 100.0, 1.0, -1.0]");
        org.junit.Assert.assertTrue("'" + double19 + "' != '" + (-0.405429217622299d) + "'", double19 == (-0.405429217622299d));
        org.junit.Assert.assertNotNull(doubleArray27);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray27), "[52.0, 97.0, 52.0]");
        org.junit.Assert.assertNotNull(doubleArray35);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray35), "[1.0, 1.0, 100.0, 1.0, 0.0]");
        org.junit.Assert.assertNotNull(doubleArray40);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray40), "[32.0, 100.0, 1.0, -1.0]");
        org.junit.Assert.assertTrue("'" + double41 + "' != '" + (-0.405429217622299d) + "'", double41 == (-0.405429217622299d));
        org.junit.Assert.assertTrue("'" + double42 + "' != '" + 0.2806531524060034d + "'", double42 == 0.2806531524060034d);
        org.junit.Assert.assertTrue("'" + double43 + "' != '" + 3.8d + "'", double43 == 3.8d);
        org.junit.Assert.assertNotNull(doubleArray51);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray51), "[1.0, 1.0, 100.0, 1.0, 0.0]");
        org.junit.Assert.assertNotNull(doubleArray56);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray56), "[32.0, 100.0, 1.0, -1.0]");
        org.junit.Assert.assertTrue("'" + double57 + "' != '" + (-0.405429217622299d) + "'", double57 == (-0.405429217622299d));
        org.junit.Assert.assertNotNull(doubleArray65);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray65), "[1.0, 1.0, 100.0, 1.0, 0.0]");
        org.junit.Assert.assertNotNull(doubleArray70);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray70), "[32.0, 100.0, 1.0, -1.0]");
        org.junit.Assert.assertTrue("'" + double71 + "' != '" + (-0.405429217622299d) + "'", double71 == (-0.405429217622299d));
        org.junit.Assert.assertNotNull(doubleArray82);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray82), "[1.0, 1.0, 100.0, 1.0, 0.0]");
        org.junit.Assert.assertNotNull(doubleArray87);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray87), "[32.0, 100.0, 1.0, -1.0]");
        org.junit.Assert.assertTrue("'" + double88 + "' != '" + (-0.405429217622299d) + "'", double88 == (-0.405429217622299d));
        org.junit.Assert.assertTrue("'" + double89 + "' != '" + 0.01613264369976175d + "'", double89 == 0.01613264369976175d);
        org.junit.Assert.assertTrue("'" + double90 + "' != '" + 0.5339796283719219d + "'", double90 == 0.5339796283719219d);
        org.junit.Assert.assertTrue("'" + double91 + "' != '" + 0.405429217622299d + "'", double91 == 0.405429217622299d);
    }

    @Test
    public void test3095() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3095");
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
        org.apache.commons.math.distribution.TDistribution tDistribution62 = null;
        org.apache.commons.math.stat.inference.TTestImpl tTestImpl63 = new org.apache.commons.math.stat.inference.TTestImpl(tDistribution62);
        double[] doubleArray69 = new double[] { 1.0f, (short) 1, 100.0f, 1, 0.0f };
        double[] doubleArray74 = new double[] { ' ', (byte) 100, (byte) 1, (-1.0f) };
        double double75 = tTestImpl63.homoscedasticT(doubleArray69, doubleArray74);
        double[] doubleArray83 = new double[] { 1, 100.0f, (-1), (short) 100, 100, (-1) };
        double double84 = tTestImpl63.t((double) '4', doubleArray83);
        double double85 = tTestImpl1.t(0.0d, doubleArray83);
        java.lang.Class<?> wildcardClass86 = doubleArray83.getClass();
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
        org.junit.Assert.assertNotNull(doubleArray69);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray69), "[1.0, 1.0, 100.0, 1.0, 0.0]");
        org.junit.Assert.assertNotNull(doubleArray74);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray74), "[32.0, 100.0, 1.0, -1.0]");
        org.junit.Assert.assertTrue("'" + double75 + "' != '" + (-0.405429217622299d) + "'", double75 == (-0.405429217622299d));
        org.junit.Assert.assertNotNull(doubleArray83);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray83), "[1.0, 100.0, -1.0, 100.0, 100.0, -1.0]");
        org.junit.Assert.assertTrue("'" + double84 + "' != '" + (-0.09656583816243881d) + "'", double84 == (-0.09656583816243881d));
        org.junit.Assert.assertTrue("'" + double85 + "' != '" + 2.2210142777360953d + "'", double85 == 2.2210142777360953d);
        org.junit.Assert.assertNotNull(wildcardClass86);
    }

    @Test
    public void test3096() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3096");
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
        double double38 = tTestImpl0.t((double) (short) 10, doubleArray22);
        org.apache.commons.math.stat.inference.TTestImpl tTestImpl40 = new org.apache.commons.math.stat.inference.TTestImpl();
        org.apache.commons.math.distribution.TDistribution tDistribution41 = null;
        tTestImpl40.setDistribution(tDistribution41);
        org.apache.commons.math.distribution.TDistribution tDistribution43 = null;
        tTestImpl40.setDistribution(tDistribution43);
        org.apache.commons.math.distribution.TDistribution tDistribution45 = null;
        tTestImpl40.setDistribution(tDistribution45);
        org.apache.commons.math.stat.inference.TTestImpl tTestImpl48 = new org.apache.commons.math.stat.inference.TTestImpl();
        double[] doubleArray52 = new double[] { '4', 'a', '4' };
        org.apache.commons.math.distribution.TDistribution tDistribution53 = null;
        org.apache.commons.math.stat.inference.TTestImpl tTestImpl54 = new org.apache.commons.math.stat.inference.TTestImpl(tDistribution53);
        double[] doubleArray60 = new double[] { 1.0f, (short) 1, 100.0f, 1, 0.0f };
        double[] doubleArray65 = new double[] { ' ', (byte) 100, (byte) 1, (-1.0f) };
        double double66 = tTestImpl54.homoscedasticT(doubleArray60, doubleArray65);
        double double67 = tTestImpl48.tTest(doubleArray52, doubleArray65);
        double double68 = tTestImpl40.t((double) 0L, doubleArray52);
        double double69 = tTestImpl0.tTest((double) 0.0f, doubleArray52);
        org.apache.commons.math.stat.descriptive.StatisticalSummary statisticalSummary70 = null;
        org.apache.commons.math.stat.descriptive.StatisticalSummary statisticalSummary71 = null;
        // The following exception was thrown during execution in test generation
        try {
            double double72 = tTestImpl0.homoscedasticTTest(statisticalSummary70, statisticalSummary71);
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
        org.junit.Assert.assertTrue("'" + double38 + "' != '" + 3.8d + "'", double38 == 3.8d);
        org.junit.Assert.assertNotNull(doubleArray52);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray52), "[52.0, 97.0, 52.0]");
        org.junit.Assert.assertNotNull(doubleArray60);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray60), "[1.0, 1.0, 100.0, 1.0, 0.0]");
        org.junit.Assert.assertNotNull(doubleArray65);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray65), "[32.0, 100.0, 1.0, -1.0]");
        org.junit.Assert.assertTrue("'" + double66 + "' != '" + (-0.405429217622299d) + "'", double66 == (-0.405429217622299d));
        org.junit.Assert.assertTrue("'" + double67 + "' != '" + 0.2806531524060034d + "'", double67 == 0.2806531524060034d);
        org.junit.Assert.assertTrue("'" + double68 + "' != '" + 4.466666666666667d + "'", double68 == 4.466666666666667d);
        org.junit.Assert.assertTrue("'" + double69 + "' != '" + 0.046643592901765896d + "'", double69 == 0.046643592901765896d);
    }

    @Test
    public void test3097() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3097");
        org.apache.commons.math.stat.inference.TTestImpl tTestImpl0 = new org.apache.commons.math.stat.inference.TTestImpl();
        org.apache.commons.math.distribution.TDistribution tDistribution2 = null;
        org.apache.commons.math.stat.inference.TTestImpl tTestImpl3 = new org.apache.commons.math.stat.inference.TTestImpl(tDistribution2);
        double[] doubleArray9 = new double[] { 1.0f, (short) 1, 100.0f, 1, 0.0f };
        double[] doubleArray14 = new double[] { ' ', (byte) 100, (byte) 1, (-1.0f) };
        double double15 = tTestImpl3.homoscedasticT(doubleArray9, doubleArray14);
        double double16 = tTestImpl0.tTest((double) (short) 100, doubleArray9);
        org.apache.commons.math.distribution.TDistribution tDistribution17 = null;
        tTestImpl0.setDistribution(tDistribution17);
        org.apache.commons.math.distribution.TDistribution tDistribution20 = null;
        org.apache.commons.math.stat.inference.TTestImpl tTestImpl21 = new org.apache.commons.math.stat.inference.TTestImpl(tDistribution20);
        double[] doubleArray27 = new double[] { 1.0f, (short) 1, 100.0f, 1, 0.0f };
        double[] doubleArray32 = new double[] { ' ', (byte) 100, (byte) 1, (-1.0f) };
        double double33 = tTestImpl21.homoscedasticT(doubleArray27, doubleArray32);
        org.apache.commons.math.stat.inference.TTestImpl tTestImpl34 = new org.apache.commons.math.stat.inference.TTestImpl();
        double[] doubleArray38 = new double[] { '4', 'a', '4' };
        org.apache.commons.math.distribution.TDistribution tDistribution39 = null;
        org.apache.commons.math.stat.inference.TTestImpl tTestImpl40 = new org.apache.commons.math.stat.inference.TTestImpl(tDistribution39);
        double[] doubleArray46 = new double[] { 1.0f, (short) 1, 100.0f, 1, 0.0f };
        double[] doubleArray51 = new double[] { ' ', (byte) 100, (byte) 1, (-1.0f) };
        double double52 = tTestImpl40.homoscedasticT(doubleArray46, doubleArray51);
        double double53 = tTestImpl34.tTest(doubleArray38, doubleArray51);
        org.apache.commons.math.distribution.TDistribution tDistribution54 = null;
        org.apache.commons.math.stat.inference.TTestImpl tTestImpl55 = new org.apache.commons.math.stat.inference.TTestImpl(tDistribution54);
        double[] doubleArray61 = new double[] { 1.0f, (short) 1, 100.0f, 1, 0.0f };
        double[] doubleArray66 = new double[] { ' ', (byte) 100, (byte) 1, (-1.0f) };
        double double67 = tTestImpl55.homoscedasticT(doubleArray61, doubleArray66);
        double double68 = tTestImpl21.t(doubleArray51, doubleArray66);
        double double69 = tTestImpl0.t(1.3965146696271626d, doubleArray66);
        org.apache.commons.math.stat.descriptive.StatisticalSummary statisticalSummary70 = null;
        org.apache.commons.math.stat.descriptive.StatisticalSummary statisticalSummary71 = null;
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean73 = tTestImpl0.tTest(statisticalSummary70, statisticalSummary71, (double) '4');
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: bad significance level: 52.0");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(doubleArray9);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray9), "[1.0, 1.0, 100.0, 1.0, 0.0]");
        org.junit.Assert.assertNotNull(doubleArray14);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray14), "[32.0, 100.0, 1.0, -1.0]");
        org.junit.Assert.assertTrue("'" + double15 + "' != '" + (-0.405429217622299d) + "'", double15 == (-0.405429217622299d));
        org.junit.Assert.assertTrue("'" + double16 + "' != '" + 0.01613264369976175d + "'", double16 == 0.01613264369976175d);
        org.junit.Assert.assertNotNull(doubleArray27);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray27), "[1.0, 1.0, 100.0, 1.0, 0.0]");
        org.junit.Assert.assertNotNull(doubleArray32);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray32), "[32.0, 100.0, 1.0, -1.0]");
        org.junit.Assert.assertTrue("'" + double33 + "' != '" + (-0.405429217622299d) + "'", double33 == (-0.405429217622299d));
        org.junit.Assert.assertNotNull(doubleArray38);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray38), "[52.0, 97.0, 52.0]");
        org.junit.Assert.assertNotNull(doubleArray46);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray46), "[1.0, 1.0, 100.0, 1.0, 0.0]");
        org.junit.Assert.assertNotNull(doubleArray51);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray51), "[32.0, 100.0, 1.0, -1.0]");
        org.junit.Assert.assertTrue("'" + double52 + "' != '" + (-0.405429217622299d) + "'", double52 == (-0.405429217622299d));
        org.junit.Assert.assertTrue("'" + double53 + "' != '" + 0.2806531524060034d + "'", double53 == 0.2806531524060034d);
        org.junit.Assert.assertNotNull(doubleArray61);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray61), "[1.0, 1.0, 100.0, 1.0, 0.0]");
        org.junit.Assert.assertNotNull(doubleArray66);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray66), "[32.0, 100.0, 1.0, -1.0]");
        org.junit.Assert.assertTrue("'" + double67 + "' != '" + (-0.405429217622299d) + "'", double67 == (-0.405429217622299d));
        org.junit.Assert.assertTrue("'" + double68 + "' != '" + 0.0d + "'", double68 == 0.0d);
        org.junit.Assert.assertTrue("'" + double69 + "' != '" + 1.3404872472421194d + "'", double69 == 1.3404872472421194d);
    }

    @Test
    public void test3098() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3098");
        org.apache.commons.math.stat.inference.TTestImpl tTestImpl0 = new org.apache.commons.math.stat.inference.TTestImpl();
        org.apache.commons.math.stat.inference.TTestImpl tTestImpl2 = new org.apache.commons.math.stat.inference.TTestImpl();
        double[] doubleArray6 = new double[] { '4', 'a', '4' };
        org.apache.commons.math.distribution.TDistribution tDistribution7 = null;
        org.apache.commons.math.stat.inference.TTestImpl tTestImpl8 = new org.apache.commons.math.stat.inference.TTestImpl(tDistribution7);
        double[] doubleArray14 = new double[] { 1.0f, (short) 1, 100.0f, 1, 0.0f };
        double[] doubleArray19 = new double[] { ' ', (byte) 100, (byte) 1, (-1.0f) };
        double double20 = tTestImpl8.homoscedasticT(doubleArray14, doubleArray19);
        double double21 = tTestImpl2.tTest(doubleArray6, doubleArray19);
        org.apache.commons.math.distribution.TDistribution tDistribution22 = null;
        tTestImpl2.setDistribution(tDistribution22);
        org.apache.commons.math.distribution.TDistribution tDistribution24 = null;
        org.apache.commons.math.stat.inference.TTestImpl tTestImpl25 = new org.apache.commons.math.stat.inference.TTestImpl(tDistribution24);
        double[] doubleArray31 = new double[] { 1.0f, (short) 1, 100.0f, 1, 0.0f };
        double[] doubleArray36 = new double[] { ' ', (byte) 100, (byte) 1, (-1.0f) };
        double double37 = tTestImpl25.homoscedasticT(doubleArray31, doubleArray36);
        double[] doubleArray45 = new double[] { 1, 100.0f, (-1), (short) 100, 100, (-1) };
        double double46 = tTestImpl25.t((double) '4', doubleArray45);
        org.apache.commons.math.distribution.TDistribution tDistribution47 = null;
        org.apache.commons.math.stat.inference.TTestImpl tTestImpl48 = new org.apache.commons.math.stat.inference.TTestImpl(tDistribution47);
        double[] doubleArray54 = new double[] { 1.0f, (short) 1, 100.0f, 1, 0.0f };
        double[] doubleArray59 = new double[] { ' ', (byte) 100, (byte) 1, (-1.0f) };
        double double60 = tTestImpl48.homoscedasticT(doubleArray54, doubleArray59);
        double double61 = tTestImpl2.t(doubleArray45, doubleArray59);
        boolean boolean63 = tTestImpl0.tTest((double) (short) 1, doubleArray59, 0.405429217622299d);
        org.apache.commons.math.distribution.TDistribution tDistribution64 = null;
        tTestImpl0.setDistribution(tDistribution64);
        org.apache.commons.math.distribution.TDistribution tDistribution66 = null;
        tTestImpl0.setDistribution(tDistribution66);
        org.junit.Assert.assertNotNull(doubleArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray6), "[52.0, 97.0, 52.0]");
        org.junit.Assert.assertNotNull(doubleArray14);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray14), "[1.0, 1.0, 100.0, 1.0, 0.0]");
        org.junit.Assert.assertNotNull(doubleArray19);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray19), "[32.0, 100.0, 1.0, -1.0]");
        org.junit.Assert.assertTrue("'" + double20 + "' != '" + (-0.405429217622299d) + "'", double20 == (-0.405429217622299d));
        org.junit.Assert.assertTrue("'" + double21 + "' != '" + 0.2806531524060034d + "'", double21 == 0.2806531524060034d);
        org.junit.Assert.assertNotNull(doubleArray31);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray31), "[1.0, 1.0, 100.0, 1.0, 0.0]");
        org.junit.Assert.assertNotNull(doubleArray36);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray36), "[32.0, 100.0, 1.0, -1.0]");
        org.junit.Assert.assertTrue("'" + double37 + "' != '" + (-0.405429217622299d) + "'", double37 == (-0.405429217622299d));
        org.junit.Assert.assertNotNull(doubleArray45);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray45), "[1.0, 100.0, -1.0, 100.0, 100.0, -1.0]");
        org.junit.Assert.assertTrue("'" + double46 + "' != '" + (-0.09656583816243881d) + "'", double46 == (-0.09656583816243881d));
        org.junit.Assert.assertNotNull(doubleArray54);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray54), "[1.0, 1.0, 100.0, 1.0, 0.0]");
        org.junit.Assert.assertNotNull(doubleArray59);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray59), "[32.0, 100.0, 1.0, -1.0]");
        org.junit.Assert.assertTrue("'" + double60 + "' != '" + (-0.405429217622299d) + "'", double60 == (-0.405429217622299d));
        org.junit.Assert.assertTrue("'" + double61 + "' != '" + 0.5172120199559697d + "'", double61 == 0.5172120199559697d);
        org.junit.Assert.assertTrue("'" + boolean63 + "' != '" + true + "'", boolean63 == true);
    }

    @Test
    public void test3099() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3099");
        org.apache.commons.math.stat.inference.TTestImpl tTestImpl0 = new org.apache.commons.math.stat.inference.TTestImpl();
        org.apache.commons.math.distribution.TDistribution tDistribution1 = null;
        tTestImpl0.setDistribution(tDistribution1);
        org.apache.commons.math.distribution.TDistribution tDistribution3 = null;
        tTestImpl0.setDistribution(tDistribution3);
        org.apache.commons.math.distribution.TDistribution tDistribution5 = null;
        tTestImpl0.setDistribution(tDistribution5);
        org.apache.commons.math.stat.inference.TTestImpl tTestImpl8 = new org.apache.commons.math.stat.inference.TTestImpl();
        double[] doubleArray12 = new double[] { '4', 'a', '4' };
        org.apache.commons.math.distribution.TDistribution tDistribution13 = null;
        org.apache.commons.math.stat.inference.TTestImpl tTestImpl14 = new org.apache.commons.math.stat.inference.TTestImpl(tDistribution13);
        double[] doubleArray20 = new double[] { 1.0f, (short) 1, 100.0f, 1, 0.0f };
        double[] doubleArray25 = new double[] { ' ', (byte) 100, (byte) 1, (-1.0f) };
        double double26 = tTestImpl14.homoscedasticT(doubleArray20, doubleArray25);
        double double27 = tTestImpl8.tTest(doubleArray12, doubleArray25);
        double double28 = tTestImpl0.t((double) 0L, doubleArray12);
        org.apache.commons.math.distribution.TDistribution tDistribution29 = null;
        tTestImpl0.setDistribution(tDistribution29);
        org.apache.commons.math.distribution.TDistribution tDistribution31 = null;
        org.apache.commons.math.stat.inference.TTestImpl tTestImpl32 = new org.apache.commons.math.stat.inference.TTestImpl(tDistribution31);
        double[] doubleArray38 = new double[] { 1.0f, (short) 1, 100.0f, 1, 0.0f };
        double[] doubleArray43 = new double[] { ' ', (byte) 100, (byte) 1, (-1.0f) };
        double double44 = tTestImpl32.homoscedasticT(doubleArray38, doubleArray43);
        double[] doubleArray52 = new double[] { 1, 100.0f, (-1), (short) 100, 100, (-1) };
        double double53 = tTestImpl32.t((double) '4', doubleArray52);
        org.apache.commons.math.distribution.TDistribution tDistribution54 = null;
        org.apache.commons.math.stat.inference.TTestImpl tTestImpl55 = new org.apache.commons.math.stat.inference.TTestImpl(tDistribution54);
        double[] doubleArray61 = new double[] { 1.0f, (short) 1, 100.0f, 1, 0.0f };
        double[] doubleArray66 = new double[] { ' ', (byte) 100, (byte) 1, (-1.0f) };
        double double67 = tTestImpl55.homoscedasticT(doubleArray61, doubleArray66);
        org.apache.commons.math.stat.inference.TTestImpl tTestImpl69 = new org.apache.commons.math.stat.inference.TTestImpl();
        org.apache.commons.math.distribution.TDistribution tDistribution71 = null;
        org.apache.commons.math.stat.inference.TTestImpl tTestImpl72 = new org.apache.commons.math.stat.inference.TTestImpl(tDistribution71);
        double[] doubleArray78 = new double[] { 1.0f, (short) 1, 100.0f, 1, 0.0f };
        double[] doubleArray83 = new double[] { ' ', (byte) 100, (byte) 1, (-1.0f) };
        double double84 = tTestImpl72.homoscedasticT(doubleArray78, doubleArray83);
        double double85 = tTestImpl69.tTest((double) (short) 100, doubleArray78);
        double double86 = tTestImpl55.t((double) 10.0f, doubleArray78);
        double double87 = tTestImpl0.homoscedasticT(doubleArray52, doubleArray78);
        org.junit.Assert.assertNotNull(doubleArray12);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray12), "[52.0, 97.0, 52.0]");
        org.junit.Assert.assertNotNull(doubleArray20);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray20), "[1.0, 1.0, 100.0, 1.0, 0.0]");
        org.junit.Assert.assertNotNull(doubleArray25);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray25), "[32.0, 100.0, 1.0, -1.0]");
        org.junit.Assert.assertTrue("'" + double26 + "' != '" + (-0.405429217622299d) + "'", double26 == (-0.405429217622299d));
        org.junit.Assert.assertTrue("'" + double27 + "' != '" + 0.2806531524060034d + "'", double27 == 0.2806531524060034d);
        org.junit.Assert.assertTrue("'" + double28 + "' != '" + 4.466666666666667d + "'", double28 == 4.466666666666667d);
        org.junit.Assert.assertNotNull(doubleArray38);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray38), "[1.0, 1.0, 100.0, 1.0, 0.0]");
        org.junit.Assert.assertNotNull(doubleArray43);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray43), "[32.0, 100.0, 1.0, -1.0]");
        org.junit.Assert.assertTrue("'" + double44 + "' != '" + (-0.405429217622299d) + "'", double44 == (-0.405429217622299d));
        org.junit.Assert.assertNotNull(doubleArray52);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray52), "[1.0, 100.0, -1.0, 100.0, 100.0, -1.0]");
        org.junit.Assert.assertTrue("'" + double53 + "' != '" + (-0.09656583816243881d) + "'", double53 == (-0.09656583816243881d));
        org.junit.Assert.assertNotNull(doubleArray61);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray61), "[1.0, 1.0, 100.0, 1.0, 0.0]");
        org.junit.Assert.assertNotNull(doubleArray66);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray66), "[32.0, 100.0, 1.0, -1.0]");
        org.junit.Assert.assertTrue("'" + double67 + "' != '" + (-0.405429217622299d) + "'", double67 == (-0.405429217622299d));
        org.junit.Assert.assertNotNull(doubleArray78);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray78), "[1.0, 1.0, 100.0, 1.0, 0.0]");
        org.junit.Assert.assertNotNull(doubleArray83);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray83), "[32.0, 100.0, 1.0, -1.0]");
        org.junit.Assert.assertTrue("'" + double84 + "' != '" + (-0.405429217622299d) + "'", double84 == (-0.405429217622299d));
        org.junit.Assert.assertTrue("'" + double85 + "' != '" + 0.01613264369976175d + "'", double85 == 0.01613264369976175d);
        org.junit.Assert.assertTrue("'" + double86 + "' != '" + 0.5339796283719219d + "'", double86 == 0.5339796283719219d);
        org.junit.Assert.assertTrue("'" + double87 + "' != '" + 0.9553241503322855d + "'", double87 == 0.9553241503322855d);
    }

    @Test
    public void test3100() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3100");
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
        org.apache.commons.math.distribution.TDistribution tDistribution37 = null;
        tTestImpl17.setDistribution(tDistribution37);
        org.apache.commons.math.distribution.TDistribution tDistribution39 = null;
        org.apache.commons.math.stat.inference.TTestImpl tTestImpl40 = new org.apache.commons.math.stat.inference.TTestImpl(tDistribution39);
        double[] doubleArray46 = new double[] { 1.0f, (short) 1, 100.0f, 1, 0.0f };
        double[] doubleArray51 = new double[] { ' ', (byte) 100, (byte) 1, (-1.0f) };
        double double52 = tTestImpl40.homoscedasticT(doubleArray46, doubleArray51);
        double[] doubleArray60 = new double[] { 1, 100.0f, (-1), (short) 100, 100, (-1) };
        double double61 = tTestImpl40.t((double) '4', doubleArray60);
        org.apache.commons.math.distribution.TDistribution tDistribution62 = null;
        org.apache.commons.math.stat.inference.TTestImpl tTestImpl63 = new org.apache.commons.math.stat.inference.TTestImpl(tDistribution62);
        double[] doubleArray69 = new double[] { 1.0f, (short) 1, 100.0f, 1, 0.0f };
        double[] doubleArray74 = new double[] { ' ', (byte) 100, (byte) 1, (-1.0f) };
        double double75 = tTestImpl63.homoscedasticT(doubleArray69, doubleArray74);
        double double76 = tTestImpl17.t(doubleArray60, doubleArray74);
        double double77 = tTestImpl1.t(0.0d, doubleArray74);
        org.apache.commons.math.stat.descriptive.StatisticalSummary statisticalSummary78 = null;
        org.apache.commons.math.stat.descriptive.StatisticalSummary statisticalSummary79 = null;
        // The following exception was thrown during execution in test generation
        try {
            double double80 = tTestImpl1.t(statisticalSummary78, statisticalSummary79);
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
        org.junit.Assert.assertNotNull(doubleArray46);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray46), "[1.0, 1.0, 100.0, 1.0, 0.0]");
        org.junit.Assert.assertNotNull(doubleArray51);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray51), "[32.0, 100.0, 1.0, -1.0]");
        org.junit.Assert.assertTrue("'" + double52 + "' != '" + (-0.405429217622299d) + "'", double52 == (-0.405429217622299d));
        org.junit.Assert.assertNotNull(doubleArray60);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray60), "[1.0, 100.0, -1.0, 100.0, 100.0, -1.0]");
        org.junit.Assert.assertTrue("'" + double61 + "' != '" + (-0.09656583816243881d) + "'", double61 == (-0.09656583816243881d));
        org.junit.Assert.assertNotNull(doubleArray69);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray69), "[1.0, 1.0, 100.0, 1.0, 0.0]");
        org.junit.Assert.assertNotNull(doubleArray74);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray74), "[32.0, 100.0, 1.0, -1.0]");
        org.junit.Assert.assertTrue("'" + double75 + "' != '" + (-0.405429217622299d) + "'", double75 == (-0.405429217622299d));
        org.junit.Assert.assertTrue("'" + double76 + "' != '" + 0.5172120199559697d + "'", double76 == 0.5172120199559697d);
        org.junit.Assert.assertTrue("'" + double77 + "' != '" + 1.3997215400947067d + "'", double77 == 1.3997215400947067d);
    }

    @Test
    public void test3101() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3101");
        org.apache.commons.math.stat.inference.TTestImpl tTestImpl0 = new org.apache.commons.math.stat.inference.TTestImpl();
        org.apache.commons.math.stat.inference.TTestImpl tTestImpl2 = new org.apache.commons.math.stat.inference.TTestImpl();
        org.apache.commons.math.distribution.TDistribution tDistribution4 = null;
        org.apache.commons.math.stat.inference.TTestImpl tTestImpl5 = new org.apache.commons.math.stat.inference.TTestImpl(tDistribution4);
        double[] doubleArray11 = new double[] { 1.0f, (short) 1, 100.0f, 1, 0.0f };
        double[] doubleArray16 = new double[] { ' ', (byte) 100, (byte) 1, (-1.0f) };
        double double17 = tTestImpl5.homoscedasticT(doubleArray11, doubleArray16);
        double double18 = tTestImpl2.tTest((double) (short) 100, doubleArray11);
        org.apache.commons.math.distribution.TDistribution tDistribution20 = null;
        org.apache.commons.math.stat.inference.TTestImpl tTestImpl21 = new org.apache.commons.math.stat.inference.TTestImpl(tDistribution20);
        double[] doubleArray27 = new double[] { 1.0f, (short) 1, 100.0f, 1, 0.0f };
        double[] doubleArray32 = new double[] { ' ', (byte) 100, (byte) 1, (-1.0f) };
        double double33 = tTestImpl21.homoscedasticT(doubleArray27, doubleArray32);
        double[] doubleArray41 = new double[] { 1, 100.0f, (-1), (short) 100, 100, (-1) };
        double double42 = tTestImpl21.t((double) '4', doubleArray41);
        double double43 = tTestImpl2.tTest((double) (short) 100, doubleArray41);
        double[] doubleArray50 = new double[] { (byte) -1, (-1), 0.0f, 1.0d, (-1.0f) };
        double double51 = tTestImpl2.tTest(0.405429217622299d, doubleArray50);
        double double52 = tTestImpl0.t(3.8d, doubleArray50);
        org.apache.commons.math.stat.descriptive.StatisticalSummary statisticalSummary54 = null;
        // The following exception was thrown during execution in test generation
        try {
            double double55 = tTestImpl0.tTest((double) (byte) -1, statisticalSummary54);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: insufficient data for t statistic");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(doubleArray11);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray11), "[1.0, 1.0, 100.0, 1.0, 0.0]");
        org.junit.Assert.assertNotNull(doubleArray16);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray16), "[32.0, 100.0, 1.0, -1.0]");
        org.junit.Assert.assertTrue("'" + double17 + "' != '" + (-0.405429217622299d) + "'", double17 == (-0.405429217622299d));
        org.junit.Assert.assertTrue("'" + double18 + "' != '" + 0.01613264369976175d + "'", double18 == 0.01613264369976175d);
        org.junit.Assert.assertNotNull(doubleArray27);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray27), "[1.0, 1.0, 100.0, 1.0, 0.0]");
        org.junit.Assert.assertNotNull(doubleArray32);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray32), "[32.0, 100.0, 1.0, -1.0]");
        org.junit.Assert.assertTrue("'" + double33 + "' != '" + (-0.405429217622299d) + "'", double33 == (-0.405429217622299d));
        org.junit.Assert.assertNotNull(doubleArray41);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray41), "[1.0, 100.0, -1.0, 100.0, 100.0, -1.0]");
        org.junit.Assert.assertTrue("'" + double42 + "' != '" + (-0.09656583816243881d) + "'", double42 == (-0.09656583816243881d));
        org.junit.Assert.assertTrue("'" + double43 + "' != '" + 0.07560555610353314d + "'", double43 == 0.07560555610353314d);
        org.junit.Assert.assertNotNull(doubleArray50);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray50), "[-1.0, -1.0, 0.0, 1.0, -1.0]");
        org.junit.Assert.assertTrue("'" + double51 + "' != '" + 0.1143321549278642d + "'", double51 == 0.1143321549278642d);
        org.junit.Assert.assertTrue("'" + double52 + "' != '" + (-10.500000000000002d) + "'", double52 == (-10.500000000000002d));
    }

    @Test
    public void test3102() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3102");
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
        double double38 = tTestImpl0.t((double) (short) 10, doubleArray22);
        org.apache.commons.math.distribution.TDistribution tDistribution39 = null;
        tTestImpl0.setDistribution(tDistribution39);
        org.apache.commons.math.distribution.TDistribution tDistribution41 = null;
        tTestImpl0.setDistribution(tDistribution41);
        org.apache.commons.math.stat.descriptive.StatisticalSummary statisticalSummary43 = null;
        org.apache.commons.math.stat.descriptive.StatisticalSummary statisticalSummary44 = null;
        // The following exception was thrown during execution in test generation
        try {
            double double45 = tTestImpl0.t(statisticalSummary43, statisticalSummary44);
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
        org.junit.Assert.assertTrue("'" + double38 + "' != '" + 3.8d + "'", double38 == 3.8d);
    }

    @Test
    public void test3103() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3103");
        org.apache.commons.math.stat.inference.TTestImpl tTestImpl0 = new org.apache.commons.math.stat.inference.TTestImpl();
        org.apache.commons.math.distribution.TDistribution tDistribution1 = null;
        tTestImpl0.setDistribution(tDistribution1);
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
        org.apache.commons.math.stat.inference.TTestImpl tTestImpl46 = new org.apache.commons.math.stat.inference.TTestImpl();
        org.apache.commons.math.distribution.TDistribution tDistribution48 = null;
        org.apache.commons.math.stat.inference.TTestImpl tTestImpl49 = new org.apache.commons.math.stat.inference.TTestImpl(tDistribution48);
        double[] doubleArray55 = new double[] { 1.0f, (short) 1, 100.0f, 1, 0.0f };
        double[] doubleArray60 = new double[] { ' ', (byte) 100, (byte) 1, (-1.0f) };
        double double61 = tTestImpl49.homoscedasticT(doubleArray55, doubleArray60);
        double double62 = tTestImpl46.tTest((double) (short) 100, doubleArray55);
        org.apache.commons.math.distribution.TDistribution tDistribution64 = null;
        org.apache.commons.math.stat.inference.TTestImpl tTestImpl65 = new org.apache.commons.math.stat.inference.TTestImpl(tDistribution64);
        double[] doubleArray71 = new double[] { 1.0f, (short) 1, 100.0f, 1, 0.0f };
        double[] doubleArray76 = new double[] { ' ', (byte) 100, (byte) 1, (-1.0f) };
        double double77 = tTestImpl65.homoscedasticT(doubleArray71, doubleArray76);
        double[] doubleArray85 = new double[] { 1, 100.0f, (-1), (short) 100, 100, (-1) };
        double double86 = tTestImpl65.t((double) '4', doubleArray85);
        double double87 = tTestImpl46.tTest((double) (short) 100, doubleArray85);
        double[] doubleArray93 = new double[] { 1.0f, (-0.09656583816243881d), ' ', 0.8463073355328574d, 1.3965146696271626d };
        double double94 = tTestImpl4.homoscedasticTTest(doubleArray85, doubleArray93);
        double double95 = tTestImpl0.t((double) 100, doubleArray93);
        org.apache.commons.math.stat.descriptive.StatisticalSummary statisticalSummary97 = null;
        // The following exception was thrown during execution in test generation
        try {
            double double98 = tTestImpl0.tTest(0.12673187601587688d, statisticalSummary97);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: insufficient data for t statistic");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
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
        org.junit.Assert.assertNotNull(doubleArray55);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray55), "[1.0, 1.0, 100.0, 1.0, 0.0]");
        org.junit.Assert.assertNotNull(doubleArray60);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray60), "[32.0, 100.0, 1.0, -1.0]");
        org.junit.Assert.assertTrue("'" + double61 + "' != '" + (-0.405429217622299d) + "'", double61 == (-0.405429217622299d));
        org.junit.Assert.assertTrue("'" + double62 + "' != '" + 0.01613264369976175d + "'", double62 == 0.01613264369976175d);
        org.junit.Assert.assertNotNull(doubleArray71);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray71), "[1.0, 1.0, 100.0, 1.0, 0.0]");
        org.junit.Assert.assertNotNull(doubleArray76);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray76), "[32.0, 100.0, 1.0, -1.0]");
        org.junit.Assert.assertTrue("'" + double77 + "' != '" + (-0.405429217622299d) + "'", double77 == (-0.405429217622299d));
        org.junit.Assert.assertNotNull(doubleArray85);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray85), "[1.0, 100.0, -1.0, 100.0, 100.0, -1.0]");
        org.junit.Assert.assertTrue("'" + double86 + "' != '" + (-0.09656583816243881d) + "'", double86 == (-0.09656583816243881d));
        org.junit.Assert.assertTrue("'" + double87 + "' != '" + 0.07560555610353314d + "'", double87 == 0.07560555610353314d);
        org.junit.Assert.assertNotNull(doubleArray93);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray93), "[1.0, -0.09656583816243881, 32.0, 0.8463073355328574, 1.3965146696271626]");
        org.junit.Assert.assertTrue("'" + double94 + "' != '" + 0.12673187601587688d + "'", double94 == 0.12673187601587688d);
        org.junit.Assert.assertTrue("'" + double95 + "' != '" + (-14.881283513379177d) + "'", double95 == (-14.881283513379177d));
    }

    @Test
    public void test3104() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3104");
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
        org.apache.commons.math.stat.descriptive.StatisticalSummary statisticalSummary25 = null;
        org.apache.commons.math.stat.descriptive.StatisticalSummary statisticalSummary26 = null;
        // The following exception was thrown during execution in test generation
        try {
            double double27 = tTestImpl0.t(statisticalSummary25, statisticalSummary26);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: insufficient data for t statistic");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(doubleArray15);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray15), "[1.0, 1.0, 100.0, 1.0, 0.0]");
        org.junit.Assert.assertNotNull(doubleArray20);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray20), "[32.0, 100.0, 1.0, -1.0]");
        org.junit.Assert.assertTrue("'" + double21 + "' != '" + (-0.405429217622299d) + "'", double21 == (-0.405429217622299d));
        org.junit.Assert.assertTrue("'" + double22 + "' != '" + 1.3385956498818976d + "'", double22 == 1.3385956498818976d);
    }

    @Test
    public void test3105() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3105");
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
        java.lang.Class<?> wildcardClass21 = doubleArray13.getClass();
        org.junit.Assert.assertNotNull(doubleArray13);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray13), "[1.0, 1.0, 100.0, 1.0, 0.0]");
        org.junit.Assert.assertNotNull(doubleArray18);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray18), "[32.0, 100.0, 1.0, -1.0]");
        org.junit.Assert.assertTrue("'" + double19 + "' != '" + (-0.405429217622299d) + "'", double19 == (-0.405429217622299d));
        org.junit.Assert.assertTrue("'" + double20 + "' != '" + 0.8463073355328574d + "'", double20 == 0.8463073355328574d);
        org.junit.Assert.assertNotNull(wildcardClass21);
    }

    @Test
    public void test3106() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3106");
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
        org.apache.commons.math.stat.descriptive.StatisticalSummary statisticalSummary65 = null;
        org.apache.commons.math.stat.descriptive.StatisticalSummary statisticalSummary66 = null;
        // The following exception was thrown during execution in test generation
        try {
            double double67 = tTestImpl0.tTest(statisticalSummary65, statisticalSummary66);
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
    public void test3107() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3107");
        org.apache.commons.math.stat.inference.TTestImpl tTestImpl0 = new org.apache.commons.math.stat.inference.TTestImpl();
        org.apache.commons.math.stat.inference.TTestImpl tTestImpl2 = new org.apache.commons.math.stat.inference.TTestImpl();
        org.apache.commons.math.distribution.TDistribution tDistribution4 = null;
        org.apache.commons.math.stat.inference.TTestImpl tTestImpl5 = new org.apache.commons.math.stat.inference.TTestImpl(tDistribution4);
        double[] doubleArray11 = new double[] { 1.0f, (short) 1, 100.0f, 1, 0.0f };
        double[] doubleArray16 = new double[] { ' ', (byte) 100, (byte) 1, (-1.0f) };
        double double17 = tTestImpl5.homoscedasticT(doubleArray11, doubleArray16);
        double double18 = tTestImpl2.tTest((double) (short) 100, doubleArray11);
        org.apache.commons.math.distribution.TDistribution tDistribution20 = null;
        org.apache.commons.math.stat.inference.TTestImpl tTestImpl21 = new org.apache.commons.math.stat.inference.TTestImpl(tDistribution20);
        double[] doubleArray27 = new double[] { 1.0f, (short) 1, 100.0f, 1, 0.0f };
        double[] doubleArray32 = new double[] { ' ', (byte) 100, (byte) 1, (-1.0f) };
        double double33 = tTestImpl21.homoscedasticT(doubleArray27, doubleArray32);
        double[] doubleArray41 = new double[] { 1, 100.0f, (-1), (short) 100, 100, (-1) };
        double double42 = tTestImpl21.t((double) '4', doubleArray41);
        double double43 = tTestImpl2.tTest((double) (short) 100, doubleArray41);
        double[] doubleArray50 = new double[] { (byte) -1, (-1), 0.0f, 1.0d, (-1.0f) };
        double double51 = tTestImpl2.tTest(0.405429217622299d, doubleArray50);
        double double52 = tTestImpl0.t(3.8d, doubleArray50);
        org.apache.commons.math.distribution.TDistribution tDistribution53 = null;
        tTestImpl0.setDistribution(tDistribution53);
        org.apache.commons.math.stat.inference.TTestImpl tTestImpl56 = new org.apache.commons.math.stat.inference.TTestImpl();
        double[] doubleArray60 = new double[] { '4', 'a', '4' };
        org.apache.commons.math.distribution.TDistribution tDistribution61 = null;
        org.apache.commons.math.stat.inference.TTestImpl tTestImpl62 = new org.apache.commons.math.stat.inference.TTestImpl(tDistribution61);
        double[] doubleArray68 = new double[] { 1.0f, (short) 1, 100.0f, 1, 0.0f };
        double[] doubleArray73 = new double[] { ' ', (byte) 100, (byte) 1, (-1.0f) };
        double double74 = tTestImpl62.homoscedasticT(doubleArray68, doubleArray73);
        double double75 = tTestImpl56.tTest(doubleArray60, doubleArray73);
        org.apache.commons.math.distribution.TDistribution tDistribution77 = null;
        org.apache.commons.math.stat.inference.TTestImpl tTestImpl78 = new org.apache.commons.math.stat.inference.TTestImpl(tDistribution77);
        double[] doubleArray84 = new double[] { 1.0f, (short) 1, 100.0f, 1, 0.0f };
        double[] doubleArray89 = new double[] { ' ', (byte) 100, (byte) 1, (-1.0f) };
        double double90 = tTestImpl78.homoscedasticT(doubleArray84, doubleArray89);
        double double91 = tTestImpl56.t((double) 1L, doubleArray89);
        double double92 = tTestImpl0.t(0.15639940166959065d, doubleArray89);
        org.apache.commons.math.distribution.TDistribution tDistribution93 = null;
        tTestImpl0.setDistribution(tDistribution93);
        org.apache.commons.math.stat.descriptive.StatisticalSummary statisticalSummary95 = null;
        org.apache.commons.math.stat.descriptive.StatisticalSummary statisticalSummary96 = null;
        // The following exception was thrown during execution in test generation
        try {
            double double97 = tTestImpl0.homoscedasticT(statisticalSummary95, statisticalSummary96);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: insufficient data for t statistic");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(doubleArray11);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray11), "[1.0, 1.0, 100.0, 1.0, 0.0]");
        org.junit.Assert.assertNotNull(doubleArray16);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray16), "[32.0, 100.0, 1.0, -1.0]");
        org.junit.Assert.assertTrue("'" + double17 + "' != '" + (-0.405429217622299d) + "'", double17 == (-0.405429217622299d));
        org.junit.Assert.assertTrue("'" + double18 + "' != '" + 0.01613264369976175d + "'", double18 == 0.01613264369976175d);
        org.junit.Assert.assertNotNull(doubleArray27);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray27), "[1.0, 1.0, 100.0, 1.0, 0.0]");
        org.junit.Assert.assertNotNull(doubleArray32);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray32), "[32.0, 100.0, 1.0, -1.0]");
        org.junit.Assert.assertTrue("'" + double33 + "' != '" + (-0.405429217622299d) + "'", double33 == (-0.405429217622299d));
        org.junit.Assert.assertNotNull(doubleArray41);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray41), "[1.0, 100.0, -1.0, 100.0, 100.0, -1.0]");
        org.junit.Assert.assertTrue("'" + double42 + "' != '" + (-0.09656583816243881d) + "'", double42 == (-0.09656583816243881d));
        org.junit.Assert.assertTrue("'" + double43 + "' != '" + 0.07560555610353314d + "'", double43 == 0.07560555610353314d);
        org.junit.Assert.assertNotNull(doubleArray50);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray50), "[-1.0, -1.0, 0.0, 1.0, -1.0]");
        org.junit.Assert.assertTrue("'" + double51 + "' != '" + 0.1143321549278642d + "'", double51 == 0.1143321549278642d);
        org.junit.Assert.assertTrue("'" + double52 + "' != '" + (-10.500000000000002d) + "'", double52 == (-10.500000000000002d));
        org.junit.Assert.assertNotNull(doubleArray60);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray60), "[52.0, 97.0, 52.0]");
        org.junit.Assert.assertNotNull(doubleArray68);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray68), "[1.0, 1.0, 100.0, 1.0, 0.0]");
        org.junit.Assert.assertNotNull(doubleArray73);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray73), "[32.0, 100.0, 1.0, -1.0]");
        org.junit.Assert.assertTrue("'" + double74 + "' != '" + (-0.405429217622299d) + "'", double74 == (-0.405429217622299d));
        org.junit.Assert.assertTrue("'" + double75 + "' != '" + 0.2806531524060034d + "'", double75 == 0.2806531524060034d);
        org.junit.Assert.assertNotNull(doubleArray84);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray84), "[1.0, 1.0, 100.0, 1.0, 0.0]");
        org.junit.Assert.assertNotNull(doubleArray89);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray89), "[32.0, 100.0, 1.0, -1.0]");
        org.junit.Assert.assertTrue("'" + double90 + "' != '" + (-0.405429217622299d) + "'", double90 == (-0.405429217622299d));
        org.junit.Assert.assertTrue("'" + double91 + "' != '" + 1.3573057358494125d + "'", double91 == 1.3573057358494125d);
        org.junit.Assert.assertTrue("'" + double92 + "' != '" + 1.3930877336894083d + "'", double92 == 1.3930877336894083d);
    }

    @Test
    public void test3108() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3108");
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
        org.apache.commons.math.distribution.TDistribution tDistribution62 = null;
        tTestImpl0.setDistribution(tDistribution62);
        org.apache.commons.math.distribution.TDistribution tDistribution64 = null;
        tTestImpl0.setDistribution(tDistribution64);
        org.apache.commons.math.distribution.TDistribution tDistribution66 = null;
        tTestImpl0.setDistribution(tDistribution66);
        double[] doubleArray74 = new double[] { (-2.8418588844347075d), 100.0f, (-1.0f), 0.35800486798369846d, 0.01613264369976175d };
        double double75 = tTestImpl0.t((double) (short) 0, doubleArray74);
        org.apache.commons.math.distribution.TDistribution tDistribution76 = null;
        tTestImpl0.setDistribution(tDistribution76);
        org.apache.commons.math.distribution.TDistribution tDistribution78 = null;
        tTestImpl0.setDistribution(tDistribution78);
        org.apache.commons.math.distribution.TDistribution tDistribution80 = null;
        tTestImpl0.setDistribution(tDistribution80);
        org.apache.commons.math.distribution.TDistribution tDistribution82 = null;
        tTestImpl0.setDistribution(tDistribution82);
        org.apache.commons.math.stat.descriptive.StatisticalSummary statisticalSummary85 = null;
        // The following exception was thrown during execution in test generation
        try {
            double double86 = tTestImpl0.t((double) 10L, statisticalSummary85);
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
        org.junit.Assert.assertNotNull(doubleArray74);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray74), "[-2.8418588844347075, 100.0, -1.0, 0.35800486798369846, 0.01613264369976175]");
        org.junit.Assert.assertTrue("'" + double75 + "' != '" + 0.9566618438474437d + "'", double75 == 0.9566618438474437d);
    }

    @Test
    public void test3109() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3109");
        org.apache.commons.math.distribution.TDistribution tDistribution0 = null;
        org.apache.commons.math.stat.inference.TTestImpl tTestImpl1 = new org.apache.commons.math.stat.inference.TTestImpl(tDistribution0);
        double[] doubleArray7 = new double[] { 1.0f, (short) 1, 100.0f, 1, 0.0f };
        double[] doubleArray12 = new double[] { ' ', (byte) 100, (byte) 1, (-1.0f) };
        double double13 = tTestImpl1.homoscedasticT(doubleArray7, doubleArray12);
        double[] doubleArray21 = new double[] { 1, 100.0f, (-1), (short) 100, 100, (-1) };
        double double22 = tTestImpl1.t((double) '4', doubleArray21);
        org.apache.commons.math.distribution.TDistribution tDistribution23 = null;
        org.apache.commons.math.stat.inference.TTestImpl tTestImpl24 = new org.apache.commons.math.stat.inference.TTestImpl(tDistribution23);
        double[] doubleArray30 = new double[] { 1.0f, (short) 1, 100.0f, 1, 0.0f };
        double[] doubleArray35 = new double[] { ' ', (byte) 100, (byte) 1, (-1.0f) };
        double double36 = tTestImpl24.homoscedasticT(doubleArray30, doubleArray35);
        org.apache.commons.math.distribution.TDistribution tDistribution37 = null;
        tTestImpl24.setDistribution(tDistribution37);
        org.apache.commons.math.stat.inference.TTestImpl tTestImpl40 = new org.apache.commons.math.stat.inference.TTestImpl();
        double[] doubleArray44 = new double[] { '4', 'a', '4' };
        org.apache.commons.math.distribution.TDistribution tDistribution45 = null;
        org.apache.commons.math.stat.inference.TTestImpl tTestImpl46 = new org.apache.commons.math.stat.inference.TTestImpl(tDistribution45);
        double[] doubleArray52 = new double[] { 1.0f, (short) 1, 100.0f, 1, 0.0f };
        double[] doubleArray57 = new double[] { ' ', (byte) 100, (byte) 1, (-1.0f) };
        double double58 = tTestImpl46.homoscedasticT(doubleArray52, doubleArray57);
        double double59 = tTestImpl40.tTest(doubleArray44, doubleArray57);
        double double60 = tTestImpl24.t(10.0d, doubleArray44);
        org.apache.commons.math.distribution.TDistribution tDistribution62 = null;
        org.apache.commons.math.stat.inference.TTestImpl tTestImpl63 = new org.apache.commons.math.stat.inference.TTestImpl(tDistribution62);
        double[] doubleArray69 = new double[] { 1.0f, (short) 1, 100.0f, 1, 0.0f };
        double[] doubleArray74 = new double[] { ' ', (byte) 100, (byte) 1, (-1.0f) };
        double double75 = tTestImpl63.homoscedasticT(doubleArray69, doubleArray74);
        double double76 = tTestImpl24.t(100.0d, doubleArray74);
        org.apache.commons.math.distribution.TDistribution tDistribution77 = null;
        org.apache.commons.math.stat.inference.TTestImpl tTestImpl78 = new org.apache.commons.math.stat.inference.TTestImpl(tDistribution77);
        double[] doubleArray84 = new double[] { 1.0f, (short) 1, 100.0f, 1, 0.0f };
        double[] doubleArray89 = new double[] { ' ', (byte) 100, (byte) 1, (-1.0f) };
        double double90 = tTestImpl78.homoscedasticT(doubleArray84, doubleArray89);
        double double91 = tTestImpl1.homoscedasticT(doubleArray74, doubleArray84);
        org.apache.commons.math.distribution.TDistribution tDistribution92 = null;
        tTestImpl1.setDistribution(tDistribution92);
        org.apache.commons.math.distribution.TDistribution tDistribution94 = null;
        tTestImpl1.setDistribution(tDistribution94);
        org.apache.commons.math.stat.descriptive.StatisticalSummary statisticalSummary96 = null;
        org.apache.commons.math.stat.descriptive.StatisticalSummary statisticalSummary97 = null;
        // The following exception was thrown during execution in test generation
        try {
            double double98 = tTestImpl1.t(statisticalSummary96, statisticalSummary97);
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
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray21), "[1.0, 100.0, -1.0, 100.0, 100.0, -1.0]");
        org.junit.Assert.assertTrue("'" + double22 + "' != '" + (-0.09656583816243881d) + "'", double22 == (-0.09656583816243881d));
        org.junit.Assert.assertNotNull(doubleArray30);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray30), "[1.0, 1.0, 100.0, 1.0, 0.0]");
        org.junit.Assert.assertNotNull(doubleArray35);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray35), "[32.0, 100.0, 1.0, -1.0]");
        org.junit.Assert.assertTrue("'" + double36 + "' != '" + (-0.405429217622299d) + "'", double36 == (-0.405429217622299d));
        org.junit.Assert.assertNotNull(doubleArray44);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray44), "[52.0, 97.0, 52.0]");
        org.junit.Assert.assertNotNull(doubleArray52);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray52), "[1.0, 1.0, 100.0, 1.0, 0.0]");
        org.junit.Assert.assertNotNull(doubleArray57);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray57), "[32.0, 100.0, 1.0, -1.0]");
        org.junit.Assert.assertTrue("'" + double58 + "' != '" + (-0.405429217622299d) + "'", double58 == (-0.405429217622299d));
        org.junit.Assert.assertTrue("'" + double59 + "' != '" + 0.2806531524060034d + "'", double59 == 0.2806531524060034d);
        org.junit.Assert.assertTrue("'" + double60 + "' != '" + 3.8d + "'", double60 == 3.8d);
        org.junit.Assert.assertNotNull(doubleArray69);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray69), "[1.0, 1.0, 100.0, 1.0, 0.0]");
        org.junit.Assert.assertNotNull(doubleArray74);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray74), "[32.0, 100.0, 1.0, -1.0]");
        org.junit.Assert.assertTrue("'" + double75 + "' != '" + (-0.405429217622299d) + "'", double75 == (-0.405429217622299d));
        org.junit.Assert.assertTrue("'" + double76 + "' != '" + (-2.8418588844347075d) + "'", double76 == (-2.8418588844347075d));
        org.junit.Assert.assertNotNull(doubleArray84);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray84), "[1.0, 1.0, 100.0, 1.0, 0.0]");
        org.junit.Assert.assertNotNull(doubleArray89);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray89), "[32.0, 100.0, 1.0, -1.0]");
        org.junit.Assert.assertTrue("'" + double90 + "' != '" + (-0.405429217622299d) + "'", double90 == (-0.405429217622299d));
        org.junit.Assert.assertTrue("'" + double91 + "' != '" + 0.405429217622299d + "'", double91 == 0.405429217622299d);
    }

    @Test
    public void test3110() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3110");
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
        org.apache.commons.math.stat.descriptive.StatisticalSummary statisticalSummary66 = null;
        // The following exception was thrown during execution in test generation
        try {
            double double67 = tTestImpl1.tTest(4.533333333333333d, statisticalSummary66);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: insufficient data for t statistic");
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
    public void test3111() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3111");
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
        org.apache.commons.math.distribution.TDistribution tDistribution35 = null;
        tTestImpl22.setDistribution(tDistribution35);
        org.apache.commons.math.stat.inference.TTestImpl tTestImpl38 = new org.apache.commons.math.stat.inference.TTestImpl();
        double[] doubleArray42 = new double[] { '4', 'a', '4' };
        org.apache.commons.math.distribution.TDistribution tDistribution43 = null;
        org.apache.commons.math.stat.inference.TTestImpl tTestImpl44 = new org.apache.commons.math.stat.inference.TTestImpl(tDistribution43);
        double[] doubleArray50 = new double[] { 1.0f, (short) 1, 100.0f, 1, 0.0f };
        double[] doubleArray55 = new double[] { ' ', (byte) 100, (byte) 1, (-1.0f) };
        double double56 = tTestImpl44.homoscedasticT(doubleArray50, doubleArray55);
        double double57 = tTestImpl38.tTest(doubleArray42, doubleArray55);
        double double58 = tTestImpl22.t(10.0d, doubleArray42);
        org.apache.commons.math.distribution.TDistribution tDistribution60 = null;
        org.apache.commons.math.stat.inference.TTestImpl tTestImpl61 = new org.apache.commons.math.stat.inference.TTestImpl(tDistribution60);
        double[] doubleArray67 = new double[] { 1.0f, (short) 1, 100.0f, 1, 0.0f };
        double[] doubleArray72 = new double[] { ' ', (byte) 100, (byte) 1, (-1.0f) };
        double double73 = tTestImpl61.homoscedasticT(doubleArray67, doubleArray72);
        double double74 = tTestImpl22.t(100.0d, doubleArray72);
        double double75 = tTestImpl0.t((double) 0L, doubleArray72);
        org.apache.commons.math.distribution.TDistribution tDistribution76 = null;
        tTestImpl0.setDistribution(tDistribution76);
        org.apache.commons.math.stat.descriptive.StatisticalSummary statisticalSummary79 = null;
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean81 = tTestImpl0.tTest(1.3404872472421194d, statisticalSummary79, (double) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: bad significance level: 1.0");
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
        org.junit.Assert.assertNotNull(doubleArray42);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray42), "[52.0, 97.0, 52.0]");
        org.junit.Assert.assertNotNull(doubleArray50);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray50), "[1.0, 1.0, 100.0, 1.0, 0.0]");
        org.junit.Assert.assertNotNull(doubleArray55);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray55), "[32.0, 100.0, 1.0, -1.0]");
        org.junit.Assert.assertTrue("'" + double56 + "' != '" + (-0.405429217622299d) + "'", double56 == (-0.405429217622299d));
        org.junit.Assert.assertTrue("'" + double57 + "' != '" + 0.2806531524060034d + "'", double57 == 0.2806531524060034d);
        org.junit.Assert.assertTrue("'" + double58 + "' != '" + 3.8d + "'", double58 == 3.8d);
        org.junit.Assert.assertNotNull(doubleArray67);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray67), "[1.0, 1.0, 100.0, 1.0, 0.0]");
        org.junit.Assert.assertNotNull(doubleArray72);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray72), "[32.0, 100.0, 1.0, -1.0]");
        org.junit.Assert.assertTrue("'" + double73 + "' != '" + (-0.405429217622299d) + "'", double73 == (-0.405429217622299d));
        org.junit.Assert.assertTrue("'" + double74 + "' != '" + (-2.8418588844347075d) + "'", double74 == (-2.8418588844347075d));
        org.junit.Assert.assertTrue("'" + double75 + "' != '" + 1.3997215400947067d + "'", double75 == 1.3997215400947067d);
    }

    @Test
    public void test3112() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3112");
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
        org.apache.commons.math.distribution.TDistribution tDistribution39 = null;
        org.apache.commons.math.stat.inference.TTestImpl tTestImpl40 = new org.apache.commons.math.stat.inference.TTestImpl(tDistribution39);
        double[] doubleArray46 = new double[] { 1.0f, (short) 1, 100.0f, 1, 0.0f };
        double[] doubleArray51 = new double[] { ' ', (byte) 100, (byte) 1, (-1.0f) };
        double double52 = tTestImpl40.homoscedasticT(doubleArray46, doubleArray51);
        double double53 = tTestImpl1.t(100.0d, doubleArray51);
        org.apache.commons.math.stat.descriptive.StatisticalSummary statisticalSummary55 = null;
        // The following exception was thrown during execution in test generation
        try {
            double double56 = tTestImpl1.tTest((double) '#', statisticalSummary55);
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
        org.junit.Assert.assertNotNull(doubleArray46);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray46), "[1.0, 1.0, 100.0, 1.0, 0.0]");
        org.junit.Assert.assertNotNull(doubleArray51);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray51), "[32.0, 100.0, 1.0, -1.0]");
        org.junit.Assert.assertTrue("'" + double52 + "' != '" + (-0.405429217622299d) + "'", double52 == (-0.405429217622299d));
        org.junit.Assert.assertTrue("'" + double53 + "' != '" + (-2.8418588844347075d) + "'", double53 == (-2.8418588844347075d));
    }

    @Test
    public void test3113() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3113");
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
            double double65 = tTestImpl0.t((double) (short) 10, statisticalSummary64);
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
    public void test3114() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3114");
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
        org.apache.commons.math.stat.inference.TTestImpl tTestImpl43 = new org.apache.commons.math.stat.inference.TTestImpl();
        org.apache.commons.math.distribution.TDistribution tDistribution45 = null;
        org.apache.commons.math.stat.inference.TTestImpl tTestImpl46 = new org.apache.commons.math.stat.inference.TTestImpl(tDistribution45);
        double[] doubleArray52 = new double[] { 1.0f, (short) 1, 100.0f, 1, 0.0f };
        double[] doubleArray57 = new double[] { ' ', (byte) 100, (byte) 1, (-1.0f) };
        double double58 = tTestImpl46.homoscedasticT(doubleArray52, doubleArray57);
        double double59 = tTestImpl43.tTest((double) (short) 100, doubleArray52);
        org.apache.commons.math.stat.inference.TTestImpl tTestImpl61 = new org.apache.commons.math.stat.inference.TTestImpl();
        double[] doubleArray65 = new double[] { '4', 'a', '4' };
        org.apache.commons.math.distribution.TDistribution tDistribution66 = null;
        org.apache.commons.math.stat.inference.TTestImpl tTestImpl67 = new org.apache.commons.math.stat.inference.TTestImpl(tDistribution66);
        double[] doubleArray73 = new double[] { 1.0f, (short) 1, 100.0f, 1, 0.0f };
        double[] doubleArray78 = new double[] { ' ', (byte) 100, (byte) 1, (-1.0f) };
        double double79 = tTestImpl67.homoscedasticT(doubleArray73, doubleArray78);
        double double80 = tTestImpl61.tTest(doubleArray65, doubleArray78);
        boolean boolean82 = tTestImpl43.tTest(1.357841932773502d, doubleArray65, 0.15639940166959065d);
        double double83 = tTestImpl0.t((-3.9998096691255283d), doubleArray65);
        org.apache.commons.math.distribution.TDistribution tDistribution84 = null;
        tTestImpl0.setDistribution(tDistribution84);
        org.apache.commons.math.stat.descriptive.StatisticalSummary statisticalSummary86 = null;
        org.apache.commons.math.stat.descriptive.StatisticalSummary statisticalSummary87 = null;
        // The following exception was thrown during execution in test generation
        try {
            double double88 = tTestImpl0.homoscedasticTTest(statisticalSummary86, statisticalSummary87);
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
        org.junit.Assert.assertNotNull(doubleArray52);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray52), "[1.0, 1.0, 100.0, 1.0, 0.0]");
        org.junit.Assert.assertNotNull(doubleArray57);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray57), "[32.0, 100.0, 1.0, -1.0]");
        org.junit.Assert.assertTrue("'" + double58 + "' != '" + (-0.405429217622299d) + "'", double58 == (-0.405429217622299d));
        org.junit.Assert.assertTrue("'" + double59 + "' != '" + 0.01613264369976175d + "'", double59 == 0.01613264369976175d);
        org.junit.Assert.assertNotNull(doubleArray65);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray65), "[52.0, 97.0, 52.0]");
        org.junit.Assert.assertNotNull(doubleArray73);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray73), "[1.0, 1.0, 100.0, 1.0, 0.0]");
        org.junit.Assert.assertNotNull(doubleArray78);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray78), "[32.0, 100.0, 1.0, -1.0]");
        org.junit.Assert.assertTrue("'" + double79 + "' != '" + (-0.405429217622299d) + "'", double79 == (-0.405429217622299d));
        org.junit.Assert.assertTrue("'" + double80 + "' != '" + 0.2806531524060034d + "'", double80 == 0.2806531524060034d);
        org.junit.Assert.assertTrue("'" + boolean82 + "' != '" + true + "'", boolean82 == true);
        org.junit.Assert.assertTrue("'" + double83 + "' != '" + 4.733320644608368d + "'", double83 == 4.733320644608368d);
    }

    @Test
    public void test3115() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3115");
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
        org.apache.commons.math.distribution.TDistribution tDistribution39 = null;
        tTestImpl1.setDistribution(tDistribution39);
        org.apache.commons.math.distribution.TDistribution tDistribution41 = null;
        tTestImpl1.setDistribution(tDistribution41);
        org.apache.commons.math.distribution.TDistribution tDistribution43 = null;
        tTestImpl1.setDistribution(tDistribution43);
        org.apache.commons.math.stat.descriptive.StatisticalSummary statisticalSummary46 = null;
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean48 = tTestImpl1.tTest((double) (short) 1, statisticalSummary46, 0.36242697487793474d);
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
    }

    @Test
    public void test3116() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3116");
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
        org.apache.commons.math.distribution.TDistribution tDistribution42 = null;
        tTestImpl0.setDistribution(tDistribution42);
        org.apache.commons.math.distribution.TDistribution tDistribution44 = null;
        tTestImpl0.setDistribution(tDistribution44);
        org.apache.commons.math.distribution.TDistribution tDistribution46 = null;
        tTestImpl0.setDistribution(tDistribution46);
        org.apache.commons.math.distribution.TDistribution tDistribution48 = null;
        tTestImpl0.setDistribution(tDistribution48);
        org.apache.commons.math.stat.inference.TTestImpl tTestImpl50 = new org.apache.commons.math.stat.inference.TTestImpl();
        org.apache.commons.math.distribution.TDistribution tDistribution51 = null;
        tTestImpl50.setDistribution(tDistribution51);
        org.apache.commons.math.distribution.TDistribution tDistribution53 = null;
        tTestImpl50.setDistribution(tDistribution53);
        org.apache.commons.math.distribution.TDistribution tDistribution56 = null;
        org.apache.commons.math.stat.inference.TTestImpl tTestImpl57 = new org.apache.commons.math.stat.inference.TTestImpl(tDistribution56);
        double[] doubleArray63 = new double[] { 1.0f, (short) 1, 100.0f, 1, 0.0f };
        double[] doubleArray68 = new double[] { ' ', (byte) 100, (byte) 1, (-1.0f) };
        double double69 = tTestImpl57.homoscedasticT(doubleArray63, doubleArray68);
        double double70 = tTestImpl50.t(3.8d, doubleArray63);
        org.apache.commons.math.distribution.TDistribution tDistribution71 = null;
        org.apache.commons.math.stat.inference.TTestImpl tTestImpl72 = new org.apache.commons.math.stat.inference.TTestImpl(tDistribution71);
        double[] doubleArray78 = new double[] { 1.0f, (short) 1, 100.0f, 1, 0.0f };
        double[] doubleArray83 = new double[] { ' ', (byte) 100, (byte) 1, (-1.0f) };
        double double84 = tTestImpl72.homoscedasticT(doubleArray78, doubleArray83);
        double double85 = tTestImpl0.t(doubleArray63, doubleArray78);
        org.apache.commons.math.stat.descriptive.StatisticalSummary statisticalSummary87 = null;
        // The following exception was thrown during execution in test generation
        try {
            double double88 = tTestImpl0.tTest((double) (short) 100, statisticalSummary87);
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
        org.junit.Assert.assertNotNull(doubleArray63);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray63), "[1.0, 1.0, 100.0, 1.0, 0.0]");
        org.junit.Assert.assertNotNull(doubleArray68);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray68), "[32.0, 100.0, 1.0, -1.0]");
        org.junit.Assert.assertTrue("'" + double69 + "' != '" + (-0.405429217622299d) + "'", double69 == (-0.405429217622299d));
        org.junit.Assert.assertTrue("'" + double70 + "' != '" + 0.8463073355328574d + "'", double70 == 0.8463073355328574d);
        org.junit.Assert.assertNotNull(doubleArray78);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray78), "[1.0, 1.0, 100.0, 1.0, 0.0]");
        org.junit.Assert.assertNotNull(doubleArray83);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray83), "[32.0, 100.0, 1.0, -1.0]");
        org.junit.Assert.assertTrue("'" + double84 + "' != '" + (-0.405429217622299d) + "'", double84 == (-0.405429217622299d));
        org.junit.Assert.assertTrue("'" + double85 + "' != '" + 0.0d + "'", double85 == 0.0d);
    }

    @Test
    public void test3117() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3117");
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
        org.apache.commons.math.stat.inference.TTestImpl tTestImpl21 = new org.apache.commons.math.stat.inference.TTestImpl();
        org.apache.commons.math.distribution.TDistribution tDistribution23 = null;
        org.apache.commons.math.stat.inference.TTestImpl tTestImpl24 = new org.apache.commons.math.stat.inference.TTestImpl(tDistribution23);
        double[] doubleArray30 = new double[] { 1.0f, (short) 1, 100.0f, 1, 0.0f };
        double[] doubleArray35 = new double[] { ' ', (byte) 100, (byte) 1, (-1.0f) };
        double double36 = tTestImpl24.homoscedasticT(doubleArray30, doubleArray35);
        double double37 = tTestImpl21.tTest((double) (short) 100, doubleArray30);
        org.apache.commons.math.distribution.TDistribution tDistribution39 = null;
        org.apache.commons.math.stat.inference.TTestImpl tTestImpl40 = new org.apache.commons.math.stat.inference.TTestImpl(tDistribution39);
        double[] doubleArray46 = new double[] { 1.0f, (short) 1, 100.0f, 1, 0.0f };
        double[] doubleArray51 = new double[] { ' ', (byte) 100, (byte) 1, (-1.0f) };
        double double52 = tTestImpl40.homoscedasticT(doubleArray46, doubleArray51);
        double[] doubleArray60 = new double[] { 1, 100.0f, (-1), (short) 100, 100, (-1) };
        double double61 = tTestImpl40.t((double) '4', doubleArray60);
        double double62 = tTestImpl21.tTest((double) (short) 100, doubleArray60);
        org.apache.commons.math.distribution.TDistribution tDistribution64 = null;
        org.apache.commons.math.stat.inference.TTestImpl tTestImpl65 = new org.apache.commons.math.stat.inference.TTestImpl(tDistribution64);
        double[] doubleArray71 = new double[] { 1.0f, (short) 1, 100.0f, 1, 0.0f };
        double[] doubleArray76 = new double[] { ' ', (byte) 100, (byte) 1, (-1.0f) };
        double double77 = tTestImpl65.homoscedasticT(doubleArray71, doubleArray76);
        double double78 = tTestImpl21.tTest((double) (byte) 1, doubleArray71);
        double double79 = tTestImpl7.t((-1.0d), doubleArray71);
        double double80 = tTestImpl0.t(1.3930877336894083d, doubleArray71);
        org.apache.commons.math.distribution.TDistribution tDistribution81 = null;
        tTestImpl0.setDistribution(tDistribution81);
        org.apache.commons.math.stat.descriptive.StatisticalSummary statisticalSummary83 = null;
        org.apache.commons.math.stat.descriptive.StatisticalSummary statisticalSummary84 = null;
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean86 = tTestImpl0.tTest(statisticalSummary83, statisticalSummary84, (-3.5d));
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: bad significance level: -3.5");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(doubleArray13);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray13), "[1.0, 1.0, 100.0, 1.0, 0.0]");
        org.junit.Assert.assertNotNull(doubleArray18);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray18), "[32.0, 100.0, 1.0, -1.0]");
        org.junit.Assert.assertTrue("'" + double19 + "' != '" + (-0.405429217622299d) + "'", double19 == (-0.405429217622299d));
        org.junit.Assert.assertNotNull(doubleArray30);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray30), "[1.0, 1.0, 100.0, 1.0, 0.0]");
        org.junit.Assert.assertNotNull(doubleArray35);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray35), "[32.0, 100.0, 1.0, -1.0]");
        org.junit.Assert.assertTrue("'" + double36 + "' != '" + (-0.405429217622299d) + "'", double36 == (-0.405429217622299d));
        org.junit.Assert.assertTrue("'" + double37 + "' != '" + 0.01613264369976175d + "'", double37 == 0.01613264369976175d);
        org.junit.Assert.assertNotNull(doubleArray46);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray46), "[1.0, 1.0, 100.0, 1.0, 0.0]");
        org.junit.Assert.assertNotNull(doubleArray51);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray51), "[32.0, 100.0, 1.0, -1.0]");
        org.junit.Assert.assertTrue("'" + double52 + "' != '" + (-0.405429217622299d) + "'", double52 == (-0.405429217622299d));
        org.junit.Assert.assertNotNull(doubleArray60);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray60), "[1.0, 100.0, -1.0, 100.0, 100.0, -1.0]");
        org.junit.Assert.assertTrue("'" + double61 + "' != '" + (-0.09656583816243881d) + "'", double61 == (-0.09656583816243881d));
        org.junit.Assert.assertTrue("'" + double62 + "' != '" + 0.07560555610353314d + "'", double62 == 0.07560555610353314d);
        org.junit.Assert.assertNotNull(doubleArray71);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray71), "[1.0, 1.0, 100.0, 1.0, 0.0]");
        org.junit.Assert.assertNotNull(doubleArray76);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray76), "[32.0, 100.0, 1.0, -1.0]");
        org.junit.Assert.assertTrue("'" + double77 + "' != '" + (-0.405429217622299d) + "'", double77 == (-0.405429217622299d));
        org.junit.Assert.assertTrue("'" + double78 + "' != '" + 0.3793626154059051d + "'", double78 == 0.3793626154059051d);
        org.junit.Assert.assertTrue("'" + double79 + "' != '" + 1.088109431399388d + "'", double79 == 1.088109431399388d);
        org.junit.Assert.assertTrue("'" + double80 + "' != '" + 0.9675565918996828d + "'", double80 == 0.9675565918996828d);
    }

    @Test
    public void test3118() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3118");
        org.apache.commons.math.stat.inference.TTestImpl tTestImpl0 = new org.apache.commons.math.stat.inference.TTestImpl();
        double[] doubleArray4 = new double[] { '4', 'a', '4' };
        org.apache.commons.math.distribution.TDistribution tDistribution5 = null;
        org.apache.commons.math.stat.inference.TTestImpl tTestImpl6 = new org.apache.commons.math.stat.inference.TTestImpl(tDistribution5);
        double[] doubleArray12 = new double[] { 1.0f, (short) 1, 100.0f, 1, 0.0f };
        double[] doubleArray17 = new double[] { ' ', (byte) 100, (byte) 1, (-1.0f) };
        double double18 = tTestImpl6.homoscedasticT(doubleArray12, doubleArray17);
        double double19 = tTestImpl0.tTest(doubleArray4, doubleArray17);
        org.apache.commons.math.distribution.TDistribution tDistribution20 = null;
        org.apache.commons.math.stat.inference.TTestImpl tTestImpl21 = new org.apache.commons.math.stat.inference.TTestImpl(tDistribution20);
        double[] doubleArray27 = new double[] { 1.0f, (short) 1, 100.0f, 1, 0.0f };
        double[] doubleArray32 = new double[] { ' ', (byte) 100, (byte) 1, (-1.0f) };
        double double33 = tTestImpl21.homoscedasticT(doubleArray27, doubleArray32);
        org.apache.commons.math.distribution.TDistribution tDistribution34 = null;
        org.apache.commons.math.stat.inference.TTestImpl tTestImpl35 = new org.apache.commons.math.stat.inference.TTestImpl(tDistribution34);
        double[] doubleArray41 = new double[] { 1.0f, (short) 1, 100.0f, 1, 0.0f };
        double[] doubleArray46 = new double[] { ' ', (byte) 100, (byte) 1, (-1.0f) };
        double double47 = tTestImpl35.homoscedasticT(doubleArray41, doubleArray46);
        org.apache.commons.math.stat.inference.TTestImpl tTestImpl48 = new org.apache.commons.math.stat.inference.TTestImpl();
        double[] doubleArray52 = new double[] { '4', 'a', '4' };
        org.apache.commons.math.distribution.TDistribution tDistribution53 = null;
        org.apache.commons.math.stat.inference.TTestImpl tTestImpl54 = new org.apache.commons.math.stat.inference.TTestImpl(tDistribution53);
        double[] doubleArray60 = new double[] { 1.0f, (short) 1, 100.0f, 1, 0.0f };
        double[] doubleArray65 = new double[] { ' ', (byte) 100, (byte) 1, (-1.0f) };
        double double66 = tTestImpl54.homoscedasticT(doubleArray60, doubleArray65);
        double double67 = tTestImpl48.tTest(doubleArray52, doubleArray65);
        org.apache.commons.math.distribution.TDistribution tDistribution68 = null;
        org.apache.commons.math.stat.inference.TTestImpl tTestImpl69 = new org.apache.commons.math.stat.inference.TTestImpl(tDistribution68);
        double[] doubleArray75 = new double[] { 1.0f, (short) 1, 100.0f, 1, 0.0f };
        double[] doubleArray80 = new double[] { ' ', (byte) 100, (byte) 1, (-1.0f) };
        double double81 = tTestImpl69.homoscedasticT(doubleArray75, doubleArray80);
        double double82 = tTestImpl35.t(doubleArray65, doubleArray80);
        double double83 = tTestImpl0.homoscedasticT(doubleArray27, doubleArray80);
        org.apache.commons.math.stat.descriptive.StatisticalSummary statisticalSummary84 = null;
        org.apache.commons.math.stat.descriptive.StatisticalSummary statisticalSummary85 = null;
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean87 = tTestImpl0.tTest(statisticalSummary84, statisticalSummary85, (double) (byte) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: bad significance level: 100.0");
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
        org.junit.Assert.assertNotNull(doubleArray27);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray27), "[1.0, 1.0, 100.0, 1.0, 0.0]");
        org.junit.Assert.assertNotNull(doubleArray32);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray32), "[32.0, 100.0, 1.0, -1.0]");
        org.junit.Assert.assertTrue("'" + double33 + "' != '" + (-0.405429217622299d) + "'", double33 == (-0.405429217622299d));
        org.junit.Assert.assertNotNull(doubleArray41);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray41), "[1.0, 1.0, 100.0, 1.0, 0.0]");
        org.junit.Assert.assertNotNull(doubleArray46);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray46), "[32.0, 100.0, 1.0, -1.0]");
        org.junit.Assert.assertTrue("'" + double47 + "' != '" + (-0.405429217622299d) + "'", double47 == (-0.405429217622299d));
        org.junit.Assert.assertNotNull(doubleArray52);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray52), "[52.0, 97.0, 52.0]");
        org.junit.Assert.assertNotNull(doubleArray60);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray60), "[1.0, 1.0, 100.0, 1.0, 0.0]");
        org.junit.Assert.assertNotNull(doubleArray65);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray65), "[32.0, 100.0, 1.0, -1.0]");
        org.junit.Assert.assertTrue("'" + double66 + "' != '" + (-0.405429217622299d) + "'", double66 == (-0.405429217622299d));
        org.junit.Assert.assertTrue("'" + double67 + "' != '" + 0.2806531524060034d + "'", double67 == 0.2806531524060034d);
        org.junit.Assert.assertNotNull(doubleArray75);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray75), "[1.0, 1.0, 100.0, 1.0, 0.0]");
        org.junit.Assert.assertNotNull(doubleArray80);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray80), "[32.0, 100.0, 1.0, -1.0]");
        org.junit.Assert.assertTrue("'" + double81 + "' != '" + (-0.405429217622299d) + "'", double81 == (-0.405429217622299d));
        org.junit.Assert.assertTrue("'" + double82 + "' != '" + 0.0d + "'", double82 == 0.0d);
        org.junit.Assert.assertTrue("'" + double83 + "' != '" + (-0.405429217622299d) + "'", double83 == (-0.405429217622299d));
    }

    @Test
    public void test3119() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3119");
        org.apache.commons.math.distribution.TDistribution tDistribution0 = null;
        org.apache.commons.math.stat.inference.TTestImpl tTestImpl1 = new org.apache.commons.math.stat.inference.TTestImpl(tDistribution0);
        org.apache.commons.math.distribution.TDistribution tDistribution2 = null;
        tTestImpl1.setDistribution(tDistribution2);
        org.apache.commons.math.distribution.TDistribution tDistribution4 = null;
        tTestImpl1.setDistribution(tDistribution4);
        org.apache.commons.math.stat.inference.TTestImpl tTestImpl7 = new org.apache.commons.math.stat.inference.TTestImpl();
        org.apache.commons.math.distribution.TDistribution tDistribution9 = null;
        org.apache.commons.math.stat.inference.TTestImpl tTestImpl10 = new org.apache.commons.math.stat.inference.TTestImpl(tDistribution9);
        double[] doubleArray16 = new double[] { 1.0f, (short) 1, 100.0f, 1, 0.0f };
        double[] doubleArray21 = new double[] { ' ', (byte) 100, (byte) 1, (-1.0f) };
        double double22 = tTestImpl10.homoscedasticT(doubleArray16, doubleArray21);
        double double23 = tTestImpl7.tTest((double) (short) 100, doubleArray16);
        org.apache.commons.math.distribution.TDistribution tDistribution25 = null;
        org.apache.commons.math.stat.inference.TTestImpl tTestImpl26 = new org.apache.commons.math.stat.inference.TTestImpl(tDistribution25);
        double[] doubleArray32 = new double[] { 1.0f, (short) 1, 100.0f, 1, 0.0f };
        double[] doubleArray37 = new double[] { ' ', (byte) 100, (byte) 1, (-1.0f) };
        double double38 = tTestImpl26.homoscedasticT(doubleArray32, doubleArray37);
        double[] doubleArray46 = new double[] { 1, 100.0f, (-1), (short) 100, 100, (-1) };
        double double47 = tTestImpl26.t((double) '4', doubleArray46);
        double double48 = tTestImpl7.tTest((double) (short) 100, doubleArray46);
        org.apache.commons.math.distribution.TDistribution tDistribution50 = null;
        org.apache.commons.math.stat.inference.TTestImpl tTestImpl51 = new org.apache.commons.math.stat.inference.TTestImpl(tDistribution50);
        double[] doubleArray57 = new double[] { 1.0f, (short) 1, 100.0f, 1, 0.0f };
        double[] doubleArray62 = new double[] { ' ', (byte) 100, (byte) 1, (-1.0f) };
        double double63 = tTestImpl51.homoscedasticT(doubleArray57, doubleArray62);
        double double64 = tTestImpl7.tTest((double) (byte) 1, doubleArray57);
        org.apache.commons.math.distribution.TDistribution tDistribution65 = null;
        tTestImpl7.setDistribution(tDistribution65);
        org.apache.commons.math.distribution.TDistribution tDistribution67 = null;
        tTestImpl7.setDistribution(tDistribution67);
        org.apache.commons.math.distribution.TDistribution tDistribution70 = null;
        org.apache.commons.math.stat.inference.TTestImpl tTestImpl71 = new org.apache.commons.math.stat.inference.TTestImpl(tDistribution70);
        double[] doubleArray77 = new double[] { 1.0f, (short) 1, 100.0f, 1, 0.0f };
        double[] doubleArray82 = new double[] { ' ', (byte) 100, (byte) 1, (-1.0f) };
        double double83 = tTestImpl71.homoscedasticT(doubleArray77, doubleArray82);
        double double84 = tTestImpl7.t((double) 0, doubleArray82);
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean86 = tTestImpl1.tTest((double) (short) 10, doubleArray82, 1.4670467997050394d);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: bad significance level: 1.4670467997050394");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(doubleArray16);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray16), "[1.0, 1.0, 100.0, 1.0, 0.0]");
        org.junit.Assert.assertNotNull(doubleArray21);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray21), "[32.0, 100.0, 1.0, -1.0]");
        org.junit.Assert.assertTrue("'" + double22 + "' != '" + (-0.405429217622299d) + "'", double22 == (-0.405429217622299d));
        org.junit.Assert.assertTrue("'" + double23 + "' != '" + 0.01613264369976175d + "'", double23 == 0.01613264369976175d);
        org.junit.Assert.assertNotNull(doubleArray32);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray32), "[1.0, 1.0, 100.0, 1.0, 0.0]");
        org.junit.Assert.assertNotNull(doubleArray37);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray37), "[32.0, 100.0, 1.0, -1.0]");
        org.junit.Assert.assertTrue("'" + double38 + "' != '" + (-0.405429217622299d) + "'", double38 == (-0.405429217622299d));
        org.junit.Assert.assertNotNull(doubleArray46);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray46), "[1.0, 100.0, -1.0, 100.0, 100.0, -1.0]");
        org.junit.Assert.assertTrue("'" + double47 + "' != '" + (-0.09656583816243881d) + "'", double47 == (-0.09656583816243881d));
        org.junit.Assert.assertTrue("'" + double48 + "' != '" + 0.07560555610353314d + "'", double48 == 0.07560555610353314d);
        org.junit.Assert.assertNotNull(doubleArray57);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray57), "[1.0, 1.0, 100.0, 1.0, 0.0]");
        org.junit.Assert.assertNotNull(doubleArray62);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray62), "[32.0, 100.0, 1.0, -1.0]");
        org.junit.Assert.assertTrue("'" + double63 + "' != '" + (-0.405429217622299d) + "'", double63 == (-0.405429217622299d));
        org.junit.Assert.assertTrue("'" + double64 + "' != '" + 0.3793626154059051d + "'", double64 == 0.3793626154059051d);
        org.junit.Assert.assertNotNull(doubleArray77);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray77), "[1.0, 1.0, 100.0, 1.0, 0.0]");
        org.junit.Assert.assertNotNull(doubleArray82);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray82), "[32.0, 100.0, 1.0, -1.0]");
        org.junit.Assert.assertTrue("'" + double83 + "' != '" + (-0.405429217622299d) + "'", double83 == (-0.405429217622299d));
        org.junit.Assert.assertTrue("'" + double84 + "' != '" + 1.3997215400947067d + "'", double84 == 1.3997215400947067d);
    }

    @Test
    public void test3120() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3120");
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
        org.apache.commons.math.distribution.TDistribution tDistribution42 = null;
        tTestImpl0.setDistribution(tDistribution42);
        org.apache.commons.math.distribution.TDistribution tDistribution44 = null;
        tTestImpl0.setDistribution(tDistribution44);
        org.apache.commons.math.distribution.TDistribution tDistribution46 = null;
        tTestImpl0.setDistribution(tDistribution46);
        org.apache.commons.math.distribution.TDistribution tDistribution48 = null;
        tTestImpl0.setDistribution(tDistribution48);
        org.apache.commons.math.stat.descriptive.StatisticalSummary statisticalSummary50 = null;
        org.apache.commons.math.stat.descriptive.StatisticalSummary statisticalSummary51 = null;
        // The following exception was thrown during execution in test generation
        try {
            double double52 = tTestImpl0.tTest(statisticalSummary50, statisticalSummary51);
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
    }

    @Test
    public void test3121() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3121");
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
        org.apache.commons.math.distribution.TDistribution tDistribution42 = null;
        tTestImpl0.setDistribution(tDistribution42);
        org.apache.commons.math.distribution.TDistribution tDistribution44 = null;
        tTestImpl0.setDistribution(tDistribution44);
        org.apache.commons.math.distribution.TDistribution tDistribution46 = null;
        tTestImpl0.setDistribution(tDistribution46);
        org.apache.commons.math.distribution.TDistribution tDistribution48 = null;
        tTestImpl0.setDistribution(tDistribution48);
        org.apache.commons.math.stat.inference.TTestImpl tTestImpl50 = new org.apache.commons.math.stat.inference.TTestImpl();
        org.apache.commons.math.distribution.TDistribution tDistribution51 = null;
        tTestImpl50.setDistribution(tDistribution51);
        org.apache.commons.math.distribution.TDistribution tDistribution53 = null;
        tTestImpl50.setDistribution(tDistribution53);
        org.apache.commons.math.distribution.TDistribution tDistribution56 = null;
        org.apache.commons.math.stat.inference.TTestImpl tTestImpl57 = new org.apache.commons.math.stat.inference.TTestImpl(tDistribution56);
        double[] doubleArray63 = new double[] { 1.0f, (short) 1, 100.0f, 1, 0.0f };
        double[] doubleArray68 = new double[] { ' ', (byte) 100, (byte) 1, (-1.0f) };
        double double69 = tTestImpl57.homoscedasticT(doubleArray63, doubleArray68);
        double double70 = tTestImpl50.t(3.8d, doubleArray63);
        org.apache.commons.math.distribution.TDistribution tDistribution71 = null;
        org.apache.commons.math.stat.inference.TTestImpl tTestImpl72 = new org.apache.commons.math.stat.inference.TTestImpl(tDistribution71);
        double[] doubleArray78 = new double[] { 1.0f, (short) 1, 100.0f, 1, 0.0f };
        double[] doubleArray83 = new double[] { ' ', (byte) 100, (byte) 1, (-1.0f) };
        double double84 = tTestImpl72.homoscedasticT(doubleArray78, doubleArray83);
        double double85 = tTestImpl0.t(doubleArray63, doubleArray78);
        double[] doubleArray87 = null;
        // The following exception was thrown during execution in test generation
        try {
            double double88 = tTestImpl0.t((double) (byte) 1, doubleArray87);
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
        org.junit.Assert.assertNotNull(doubleArray63);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray63), "[1.0, 1.0, 100.0, 1.0, 0.0]");
        org.junit.Assert.assertNotNull(doubleArray68);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray68), "[32.0, 100.0, 1.0, -1.0]");
        org.junit.Assert.assertTrue("'" + double69 + "' != '" + (-0.405429217622299d) + "'", double69 == (-0.405429217622299d));
        org.junit.Assert.assertTrue("'" + double70 + "' != '" + 0.8463073355328574d + "'", double70 == 0.8463073355328574d);
        org.junit.Assert.assertNotNull(doubleArray78);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray78), "[1.0, 1.0, 100.0, 1.0, 0.0]");
        org.junit.Assert.assertNotNull(doubleArray83);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray83), "[32.0, 100.0, 1.0, -1.0]");
        org.junit.Assert.assertTrue("'" + double84 + "' != '" + (-0.405429217622299d) + "'", double84 == (-0.405429217622299d));
        org.junit.Assert.assertTrue("'" + double85 + "' != '" + 0.0d + "'", double85 == 0.0d);
    }

    @Test
    public void test3122() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3122");
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
        org.apache.commons.math.stat.descriptive.StatisticalSummary statisticalSummary30 = null;
        // The following exception was thrown during execution in test generation
        try {
            double double31 = tTestImpl0.tTest((-0.8059002806605887d), statisticalSummary30);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: insufficient data for t statistic");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(doubleArray13);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray13), "[1.0, 1.0, 100.0, 1.0, 0.0]");
        org.junit.Assert.assertNotNull(doubleArray18);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray18), "[32.0, 100.0, 1.0, -1.0]");
        org.junit.Assert.assertTrue("'" + double19 + "' != '" + (-0.405429217622299d) + "'", double19 == (-0.405429217622299d));
        org.junit.Assert.assertTrue("'" + double20 + "' != '" + 0.8463073355328574d + "'", double20 == 0.8463073355328574d);
    }

    @Test
    public void test3123() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3123");
        org.apache.commons.math.stat.inference.TTestImpl tTestImpl0 = new org.apache.commons.math.stat.inference.TTestImpl();
        org.apache.commons.math.distribution.TDistribution tDistribution1 = null;
        tTestImpl0.setDistribution(tDistribution1);
        org.apache.commons.math.distribution.TDistribution tDistribution3 = null;
        tTestImpl0.setDistribution(tDistribution3);
        org.apache.commons.math.distribution.TDistribution tDistribution5 = null;
        tTestImpl0.setDistribution(tDistribution5);
        org.apache.commons.math.distribution.TDistribution tDistribution7 = null;
        tTestImpl0.setDistribution(tDistribution7);
        org.apache.commons.math.distribution.TDistribution tDistribution9 = null;
        tTestImpl0.setDistribution(tDistribution9);
        double[] doubleArray15 = new double[] { Double.NaN, 0.5339796283719219d, 1.7753257939094542d, 1.3404872472421194d };
        org.apache.commons.math.distribution.TDistribution tDistribution16 = null;
        org.apache.commons.math.stat.inference.TTestImpl tTestImpl17 = new org.apache.commons.math.stat.inference.TTestImpl(tDistribution16);
        org.apache.commons.math.distribution.TDistribution tDistribution18 = null;
        tTestImpl17.setDistribution(tDistribution18);
        org.apache.commons.math.distribution.TDistribution tDistribution20 = null;
        org.apache.commons.math.stat.inference.TTestImpl tTestImpl21 = new org.apache.commons.math.stat.inference.TTestImpl(tDistribution20);
        double[] doubleArray27 = new double[] { 1.0f, (short) 1, 100.0f, 1, 0.0f };
        double[] doubleArray32 = new double[] { ' ', (byte) 100, (byte) 1, (-1.0f) };
        double double33 = tTestImpl21.homoscedasticT(doubleArray27, doubleArray32);
        org.apache.commons.math.stat.inference.TTestImpl tTestImpl34 = new org.apache.commons.math.stat.inference.TTestImpl();
        double[] doubleArray38 = new double[] { '4', 'a', '4' };
        org.apache.commons.math.distribution.TDistribution tDistribution39 = null;
        org.apache.commons.math.stat.inference.TTestImpl tTestImpl40 = new org.apache.commons.math.stat.inference.TTestImpl(tDistribution39);
        double[] doubleArray46 = new double[] { 1.0f, (short) 1, 100.0f, 1, 0.0f };
        double[] doubleArray51 = new double[] { ' ', (byte) 100, (byte) 1, (-1.0f) };
        double double52 = tTestImpl40.homoscedasticT(doubleArray46, doubleArray51);
        double double53 = tTestImpl34.tTest(doubleArray38, doubleArray51);
        double double54 = tTestImpl17.homoscedasticT(doubleArray32, doubleArray38);
        org.apache.commons.math.distribution.TDistribution tDistribution56 = null;
        org.apache.commons.math.stat.inference.TTestImpl tTestImpl57 = new org.apache.commons.math.stat.inference.TTestImpl(tDistribution56);
        double[] doubleArray63 = new double[] { 1.0f, (short) 1, 100.0f, 1, 0.0f };
        double[] doubleArray68 = new double[] { ' ', (byte) 100, (byte) 1, (-1.0f) };
        double double69 = tTestImpl57.homoscedasticT(doubleArray63, doubleArray68);
        double double70 = tTestImpl17.t((-0.975807309953049d), doubleArray68);
        org.apache.commons.math.distribution.TDistribution tDistribution71 = null;
        tTestImpl17.setDistribution(tDistribution71);
        org.apache.commons.math.distribution.TDistribution tDistribution73 = null;
        tTestImpl17.setDistribution(tDistribution73);
        org.apache.commons.math.stat.inference.TTestImpl tTestImpl76 = new org.apache.commons.math.stat.inference.TTestImpl();
        double[] doubleArray80 = new double[] { '4', 'a', '4' };
        org.apache.commons.math.distribution.TDistribution tDistribution81 = null;
        org.apache.commons.math.stat.inference.TTestImpl tTestImpl82 = new org.apache.commons.math.stat.inference.TTestImpl(tDistribution81);
        double[] doubleArray88 = new double[] { 1.0f, (short) 1, 100.0f, 1, 0.0f };
        double[] doubleArray93 = new double[] { ' ', (byte) 100, (byte) 1, (-1.0f) };
        double double94 = tTestImpl82.homoscedasticT(doubleArray88, doubleArray93);
        double double95 = tTestImpl76.tTest(doubleArray80, doubleArray93);
        double double96 = tTestImpl17.t((double) 0, doubleArray93);
        // The following exception was thrown during execution in test generation
        try {
            double double97 = tTestImpl0.tTest(doubleArray15, doubleArray93);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(doubleArray15);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray15), "[NaN, 0.5339796283719219, 1.7753257939094542, 1.3404872472421194]");
        org.junit.Assert.assertNotNull(doubleArray27);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray27), "[1.0, 1.0, 100.0, 1.0, 0.0]");
        org.junit.Assert.assertNotNull(doubleArray32);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray32), "[32.0, 100.0, 1.0, -1.0]");
        org.junit.Assert.assertTrue("'" + double33 + "' != '" + (-0.405429217622299d) + "'", double33 == (-0.405429217622299d));
        org.junit.Assert.assertNotNull(doubleArray38);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray38), "[52.0, 97.0, 52.0]");
        org.junit.Assert.assertNotNull(doubleArray46);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray46), "[1.0, 1.0, 100.0, 1.0, 0.0]");
        org.junit.Assert.assertNotNull(doubleArray51);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray51), "[32.0, 100.0, 1.0, -1.0]");
        org.junit.Assert.assertTrue("'" + double52 + "' != '" + (-0.405429217622299d) + "'", double52 == (-0.405429217622299d));
        org.junit.Assert.assertTrue("'" + double53 + "' != '" + 0.2806531524060034d + "'", double53 == 0.2806531524060034d);
        org.junit.Assert.assertTrue("'" + double54 + "' != '" + (-1.1115227041167497d) + "'", double54 == (-1.1115227041167497d));
        org.junit.Assert.assertNotNull(doubleArray63);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray63), "[1.0, 1.0, 100.0, 1.0, 0.0]");
        org.junit.Assert.assertNotNull(doubleArray68);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray68), "[32.0, 100.0, 1.0, -1.0]");
        org.junit.Assert.assertTrue("'" + double69 + "' != '" + (-0.405429217622299d) + "'", double69 == (-0.405429217622299d));
        org.junit.Assert.assertTrue("'" + double70 + "' != '" + 1.4411111919348023d + "'", double70 == 1.4411111919348023d);
        org.junit.Assert.assertNotNull(doubleArray80);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray80), "[52.0, 97.0, 52.0]");
        org.junit.Assert.assertNotNull(doubleArray88);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray88), "[1.0, 1.0, 100.0, 1.0, 0.0]");
        org.junit.Assert.assertNotNull(doubleArray93);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray93), "[32.0, 100.0, 1.0, -1.0]");
        org.junit.Assert.assertTrue("'" + double94 + "' != '" + (-0.405429217622299d) + "'", double94 == (-0.405429217622299d));
        org.junit.Assert.assertTrue("'" + double95 + "' != '" + 0.2806531524060034d + "'", double95 == 0.2806531524060034d);
        org.junit.Assert.assertTrue("'" + double96 + "' != '" + 1.3997215400947067d + "'", double96 == 1.3997215400947067d);
    }

    @Test
    public void test3124() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3124");
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
        org.apache.commons.math.distribution.TDistribution tDistribution55 = null;
        tTestImpl1.setDistribution(tDistribution55);
        org.apache.commons.math.distribution.TDistribution tDistribution57 = null;
        tTestImpl1.setDistribution(tDistribution57);
        org.apache.commons.math.distribution.TDistribution tDistribution59 = null;
        org.apache.commons.math.stat.inference.TTestImpl tTestImpl60 = new org.apache.commons.math.stat.inference.TTestImpl(tDistribution59);
        org.apache.commons.math.distribution.TDistribution tDistribution61 = null;
        tTestImpl60.setDistribution(tDistribution61);
        org.apache.commons.math.distribution.TDistribution tDistribution63 = null;
        org.apache.commons.math.stat.inference.TTestImpl tTestImpl64 = new org.apache.commons.math.stat.inference.TTestImpl(tDistribution63);
        double[] doubleArray70 = new double[] { 1.0f, (short) 1, 100.0f, 1, 0.0f };
        double[] doubleArray75 = new double[] { ' ', (byte) 100, (byte) 1, (-1.0f) };
        double double76 = tTestImpl64.homoscedasticT(doubleArray70, doubleArray75);
        org.apache.commons.math.stat.inference.TTestImpl tTestImpl77 = new org.apache.commons.math.stat.inference.TTestImpl();
        double[] doubleArray81 = new double[] { '4', 'a', '4' };
        org.apache.commons.math.distribution.TDistribution tDistribution82 = null;
        org.apache.commons.math.stat.inference.TTestImpl tTestImpl83 = new org.apache.commons.math.stat.inference.TTestImpl(tDistribution82);
        double[] doubleArray89 = new double[] { 1.0f, (short) 1, 100.0f, 1, 0.0f };
        double[] doubleArray94 = new double[] { ' ', (byte) 100, (byte) 1, (-1.0f) };
        double double95 = tTestImpl83.homoscedasticT(doubleArray89, doubleArray94);
        double double96 = tTestImpl77.tTest(doubleArray81, doubleArray94);
        double double97 = tTestImpl60.homoscedasticT(doubleArray75, doubleArray81);
        double[] doubleArray98 = null;
        // The following exception was thrown during execution in test generation
        try {
            double double99 = tTestImpl1.t(doubleArray81, doubleArray98);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: insufficient data for t statistic");
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
        org.junit.Assert.assertNotNull(doubleArray70);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray70), "[1.0, 1.0, 100.0, 1.0, 0.0]");
        org.junit.Assert.assertNotNull(doubleArray75);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray75), "[32.0, 100.0, 1.0, -1.0]");
        org.junit.Assert.assertTrue("'" + double76 + "' != '" + (-0.405429217622299d) + "'", double76 == (-0.405429217622299d));
        org.junit.Assert.assertNotNull(doubleArray81);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray81), "[52.0, 97.0, 52.0]");
        org.junit.Assert.assertNotNull(doubleArray89);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray89), "[1.0, 1.0, 100.0, 1.0, 0.0]");
        org.junit.Assert.assertNotNull(doubleArray94);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray94), "[32.0, 100.0, 1.0, -1.0]");
        org.junit.Assert.assertTrue("'" + double95 + "' != '" + (-0.405429217622299d) + "'", double95 == (-0.405429217622299d));
        org.junit.Assert.assertTrue("'" + double96 + "' != '" + 0.2806531524060034d + "'", double96 == 0.2806531524060034d);
        org.junit.Assert.assertTrue("'" + double97 + "' != '" + (-1.1115227041167497d) + "'", double97 == (-1.1115227041167497d));
    }

    @Test
    public void test3125() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3125");
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
        org.apache.commons.math.stat.descriptive.StatisticalSummary statisticalSummary24 = null;
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean26 = tTestImpl0.tTest(0.12673187601587688d, statisticalSummary24, 0.0d);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: bad significance level: 0.0");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(doubleArray15);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray15), "[1.0, 1.0, 100.0, 1.0, 0.0]");
        org.junit.Assert.assertNotNull(doubleArray20);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray20), "[32.0, 100.0, 1.0, -1.0]");
        org.junit.Assert.assertTrue("'" + double21 + "' != '" + (-0.405429217622299d) + "'", double21 == (-0.405429217622299d));
        org.junit.Assert.assertTrue("'" + double22 + "' != '" + 1.3385956498818976d + "'", double22 == 1.3385956498818976d);
    }

    @Test
    public void test3126() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3126");
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
        org.apache.commons.math.stat.descriptive.StatisticalSummary statisticalSummary21 = null;
        org.apache.commons.math.stat.descriptive.StatisticalSummary statisticalSummary22 = null;
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean24 = tTestImpl0.tTest(statisticalSummary21, statisticalSummary22, 100.0d);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: bad significance level: 100.0");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(doubleArray13);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray13), "[1.0, 1.0, 100.0, 1.0, 0.0]");
        org.junit.Assert.assertNotNull(doubleArray18);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray18), "[32.0, 100.0, 1.0, -1.0]");
        org.junit.Assert.assertTrue("'" + double19 + "' != '" + (-0.405429217622299d) + "'", double19 == (-0.405429217622299d));
        org.junit.Assert.assertTrue("'" + double20 + "' != '" + 0.8463073355328574d + "'", double20 == 0.8463073355328574d);
    }

    @Test
    public void test3127() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3127");
        org.apache.commons.math.distribution.TDistribution tDistribution0 = null;
        org.apache.commons.math.stat.inference.TTestImpl tTestImpl1 = new org.apache.commons.math.stat.inference.TTestImpl(tDistribution0);
        double[] doubleArray7 = new double[] { 1.0f, (short) 1, 100.0f, 1, 0.0f };
        double[] doubleArray12 = new double[] { ' ', (byte) 100, (byte) 1, (-1.0f) };
        double double13 = tTestImpl1.homoscedasticT(doubleArray7, doubleArray12);
        org.apache.commons.math.stat.inference.TTestImpl tTestImpl15 = new org.apache.commons.math.stat.inference.TTestImpl();
        org.apache.commons.math.distribution.TDistribution tDistribution17 = null;
        org.apache.commons.math.stat.inference.TTestImpl tTestImpl18 = new org.apache.commons.math.stat.inference.TTestImpl(tDistribution17);
        double[] doubleArray24 = new double[] { 1.0f, (short) 1, 100.0f, 1, 0.0f };
        double[] doubleArray29 = new double[] { ' ', (byte) 100, (byte) 1, (-1.0f) };
        double double30 = tTestImpl18.homoscedasticT(doubleArray24, doubleArray29);
        double double31 = tTestImpl15.tTest((double) (short) 100, doubleArray24);
        org.apache.commons.math.distribution.TDistribution tDistribution33 = null;
        org.apache.commons.math.stat.inference.TTestImpl tTestImpl34 = new org.apache.commons.math.stat.inference.TTestImpl(tDistribution33);
        double[] doubleArray40 = new double[] { 1.0f, (short) 1, 100.0f, 1, 0.0f };
        double[] doubleArray45 = new double[] { ' ', (byte) 100, (byte) 1, (-1.0f) };
        double double46 = tTestImpl34.homoscedasticT(doubleArray40, doubleArray45);
        double[] doubleArray54 = new double[] { 1, 100.0f, (-1), (short) 100, 100, (-1) };
        double double55 = tTestImpl34.t((double) '4', doubleArray54);
        double double56 = tTestImpl15.tTest((double) (short) 100, doubleArray54);
        org.apache.commons.math.distribution.TDistribution tDistribution58 = null;
        org.apache.commons.math.stat.inference.TTestImpl tTestImpl59 = new org.apache.commons.math.stat.inference.TTestImpl(tDistribution58);
        double[] doubleArray65 = new double[] { 1.0f, (short) 1, 100.0f, 1, 0.0f };
        double[] doubleArray70 = new double[] { ' ', (byte) 100, (byte) 1, (-1.0f) };
        double double71 = tTestImpl59.homoscedasticT(doubleArray65, doubleArray70);
        double double72 = tTestImpl15.tTest((double) (byte) 1, doubleArray65);
        org.apache.commons.math.distribution.TDistribution tDistribution73 = null;
        tTestImpl15.setDistribution(tDistribution73);
        org.apache.commons.math.distribution.TDistribution tDistribution75 = null;
        tTestImpl15.setDistribution(tDistribution75);
        org.apache.commons.math.distribution.TDistribution tDistribution77 = null;
        tTestImpl15.setDistribution(tDistribution77);
        org.apache.commons.math.distribution.TDistribution tDistribution79 = null;
        tTestImpl15.setDistribution(tDistribution79);
        org.apache.commons.math.distribution.TDistribution tDistribution81 = null;
        tTestImpl15.setDistribution(tDistribution81);
        double[] doubleArray89 = new double[] { (-2.8418588844347075d), 100.0f, (-1.0f), 0.35800486798369846d, 0.01613264369976175d };
        double double90 = tTestImpl15.t((double) (short) 0, doubleArray89);
        double double91 = tTestImpl1.t(0.5339796283719219d, doubleArray89);
        org.apache.commons.math.distribution.TDistribution tDistribution92 = null;
        tTestImpl1.setDistribution(tDistribution92);
        org.apache.commons.math.distribution.TDistribution tDistribution94 = null;
        tTestImpl1.setDistribution(tDistribution94);
        org.apache.commons.math.stat.descriptive.StatisticalSummary statisticalSummary97 = null;
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean99 = tTestImpl1.tTest((double) 10L, statisticalSummary97, 0.2806531524060034d);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: insufficient data for t statistic");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(doubleArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray7), "[1.0, 1.0, 100.0, 1.0, 0.0]");
        org.junit.Assert.assertNotNull(doubleArray12);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray12), "[32.0, 100.0, 1.0, -1.0]");
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + (-0.405429217622299d) + "'", double13 == (-0.405429217622299d));
        org.junit.Assert.assertNotNull(doubleArray24);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray24), "[1.0, 1.0, 100.0, 1.0, 0.0]");
        org.junit.Assert.assertNotNull(doubleArray29);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray29), "[32.0, 100.0, 1.0, -1.0]");
        org.junit.Assert.assertTrue("'" + double30 + "' != '" + (-0.405429217622299d) + "'", double30 == (-0.405429217622299d));
        org.junit.Assert.assertTrue("'" + double31 + "' != '" + 0.01613264369976175d + "'", double31 == 0.01613264369976175d);
        org.junit.Assert.assertNotNull(doubleArray40);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray40), "[1.0, 1.0, 100.0, 1.0, 0.0]");
        org.junit.Assert.assertNotNull(doubleArray45);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray45), "[32.0, 100.0, 1.0, -1.0]");
        org.junit.Assert.assertTrue("'" + double46 + "' != '" + (-0.405429217622299d) + "'", double46 == (-0.405429217622299d));
        org.junit.Assert.assertNotNull(doubleArray54);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray54), "[1.0, 100.0, -1.0, 100.0, 100.0, -1.0]");
        org.junit.Assert.assertTrue("'" + double55 + "' != '" + (-0.09656583816243881d) + "'", double55 == (-0.09656583816243881d));
        org.junit.Assert.assertTrue("'" + double56 + "' != '" + 0.07560555610353314d + "'", double56 == 0.07560555610353314d);
        org.junit.Assert.assertNotNull(doubleArray65);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray65), "[1.0, 1.0, 100.0, 1.0, 0.0]");
        org.junit.Assert.assertNotNull(doubleArray70);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray70), "[32.0, 100.0, 1.0, -1.0]");
        org.junit.Assert.assertTrue("'" + double71 + "' != '" + (-0.405429217622299d) + "'", double71 == (-0.405429217622299d));
        org.junit.Assert.assertTrue("'" + double72 + "' != '" + 0.3793626154059051d + "'", double72 == 0.3793626154059051d);
        org.junit.Assert.assertNotNull(doubleArray89);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray89), "[-2.8418588844347075, 100.0, -1.0, 0.35800486798369846, 0.01613264369976175]");
        org.junit.Assert.assertTrue("'" + double90 + "' != '" + 0.9566618438474437d + "'", double90 == 0.9566618438474437d);
        org.junit.Assert.assertTrue("'" + double91 + "' != '" + 0.9302024075262618d + "'", double91 == 0.9302024075262618d);
    }

    @Test
    public void test3128() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3128");
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
        java.lang.Class<?> wildcardClass97 = doubleArray78.getClass();
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
        org.junit.Assert.assertNotNull(wildcardClass97);
    }

    @Test
    public void test3129() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3129");
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
        double double38 = tTestImpl0.t((double) (short) 10, doubleArray22);
        org.apache.commons.math.distribution.TDistribution tDistribution40 = null;
        org.apache.commons.math.stat.inference.TTestImpl tTestImpl41 = new org.apache.commons.math.stat.inference.TTestImpl(tDistribution40);
        double[] doubleArray47 = new double[] { 1.0f, (short) 1, 100.0f, 1, 0.0f };
        double[] doubleArray52 = new double[] { ' ', (byte) 100, (byte) 1, (-1.0f) };
        double double53 = tTestImpl41.homoscedasticT(doubleArray47, doubleArray52);
        org.apache.commons.math.stat.inference.TTestImpl tTestImpl55 = new org.apache.commons.math.stat.inference.TTestImpl();
        org.apache.commons.math.distribution.TDistribution tDistribution57 = null;
        org.apache.commons.math.stat.inference.TTestImpl tTestImpl58 = new org.apache.commons.math.stat.inference.TTestImpl(tDistribution57);
        double[] doubleArray64 = new double[] { 1.0f, (short) 1, 100.0f, 1, 0.0f };
        double[] doubleArray69 = new double[] { ' ', (byte) 100, (byte) 1, (-1.0f) };
        double double70 = tTestImpl58.homoscedasticT(doubleArray64, doubleArray69);
        double double71 = tTestImpl55.tTest((double) (short) 100, doubleArray64);
        double double72 = tTestImpl41.t((double) 10.0f, doubleArray64);
        boolean boolean74 = tTestImpl0.tTest(0.12673187601587688d, doubleArray64, 0.01613264369976175d);
        org.apache.commons.math.distribution.TDistribution tDistribution75 = null;
        tTestImpl0.setDistribution(tDistribution75);
        double[] doubleArray78 = null;
        // The following exception was thrown during execution in test generation
        try {
            double double79 = tTestImpl0.t(10.0d, doubleArray78);
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
        org.junit.Assert.assertTrue("'" + double38 + "' != '" + 3.8d + "'", double38 == 3.8d);
        org.junit.Assert.assertNotNull(doubleArray47);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray47), "[1.0, 1.0, 100.0, 1.0, 0.0]");
        org.junit.Assert.assertNotNull(doubleArray52);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray52), "[32.0, 100.0, 1.0, -1.0]");
        org.junit.Assert.assertTrue("'" + double53 + "' != '" + (-0.405429217622299d) + "'", double53 == (-0.405429217622299d));
        org.junit.Assert.assertNotNull(doubleArray64);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray64), "[1.0, 1.0, 100.0, 1.0, 0.0]");
        org.junit.Assert.assertNotNull(doubleArray69);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray69), "[32.0, 100.0, 1.0, -1.0]");
        org.junit.Assert.assertTrue("'" + double70 + "' != '" + (-0.405429217622299d) + "'", double70 == (-0.405429217622299d));
        org.junit.Assert.assertTrue("'" + double71 + "' != '" + 0.01613264369976175d + "'", double71 == 0.01613264369976175d);
        org.junit.Assert.assertTrue("'" + double72 + "' != '" + 0.5339796283719219d + "'", double72 == 0.5339796283719219d);
        org.junit.Assert.assertTrue("'" + boolean74 + "' != '" + false + "'", boolean74 == false);
    }

    @Test
    public void test3130() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3130");
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
        double double38 = tTestImpl0.t((double) (short) 10, doubleArray22);
        org.apache.commons.math.stat.inference.TTestImpl tTestImpl39 = new org.apache.commons.math.stat.inference.TTestImpl();
        org.apache.commons.math.distribution.TDistribution tDistribution41 = null;
        org.apache.commons.math.stat.inference.TTestImpl tTestImpl42 = new org.apache.commons.math.stat.inference.TTestImpl(tDistribution41);
        double[] doubleArray48 = new double[] { 1.0f, (short) 1, 100.0f, 1, 0.0f };
        double[] doubleArray53 = new double[] { ' ', (byte) 100, (byte) 1, (-1.0f) };
        double double54 = tTestImpl42.homoscedasticT(doubleArray48, doubleArray53);
        double double55 = tTestImpl39.tTest((double) (short) 100, doubleArray48);
        org.apache.commons.math.distribution.TDistribution tDistribution56 = null;
        org.apache.commons.math.stat.inference.TTestImpl tTestImpl57 = new org.apache.commons.math.stat.inference.TTestImpl(tDistribution56);
        double[] doubleArray63 = new double[] { 1.0f, (short) 1, 100.0f, 1, 0.0f };
        double[] doubleArray68 = new double[] { ' ', (byte) 100, (byte) 1, (-1.0f) };
        double double69 = tTestImpl57.homoscedasticT(doubleArray63, doubleArray68);
        double double70 = tTestImpl0.pairedT(doubleArray48, doubleArray63);
        org.apache.commons.math.distribution.TDistribution tDistribution71 = null;
        tTestImpl0.setDistribution(tDistribution71);
        org.apache.commons.math.distribution.TDistribution tDistribution73 = null;
        tTestImpl0.setDistribution(tDistribution73);
        org.apache.commons.math.distribution.TDistribution tDistribution75 = null;
        tTestImpl0.setDistribution(tDistribution75);
        org.apache.commons.math.distribution.TDistribution tDistribution77 = null;
        tTestImpl0.setDistribution(tDistribution77);
        org.apache.commons.math.distribution.TDistribution tDistribution79 = null;
        tTestImpl0.setDistribution(tDistribution79);
        org.apache.commons.math.stat.descriptive.StatisticalSummary statisticalSummary81 = null;
        org.apache.commons.math.stat.descriptive.StatisticalSummary statisticalSummary82 = null;
        // The following exception was thrown during execution in test generation
        try {
            double double83 = tTestImpl0.homoscedasticTTest(statisticalSummary81, statisticalSummary82);
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
        org.junit.Assert.assertTrue("'" + double38 + "' != '" + 3.8d + "'", double38 == 3.8d);
        org.junit.Assert.assertNotNull(doubleArray48);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray48), "[1.0, 1.0, 100.0, 1.0, 0.0]");
        org.junit.Assert.assertNotNull(doubleArray53);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray53), "[32.0, 100.0, 1.0, -1.0]");
        org.junit.Assert.assertTrue("'" + double54 + "' != '" + (-0.405429217622299d) + "'", double54 == (-0.405429217622299d));
        org.junit.Assert.assertTrue("'" + double55 + "' != '" + 0.01613264369976175d + "'", double55 == 0.01613264369976175d);
        org.junit.Assert.assertNotNull(doubleArray63);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray63), "[1.0, 1.0, 100.0, 1.0, 0.0]");
        org.junit.Assert.assertNotNull(doubleArray68);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray68), "[32.0, 100.0, 1.0, -1.0]");
        org.junit.Assert.assertTrue("'" + double69 + "' != '" + (-0.405429217622299d) + "'", double69 == (-0.405429217622299d));
        org.junit.Assert.assertTrue(Double.isNaN(double70));
    }

    @Test
    public void test3131() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3131");
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
        org.apache.commons.math.distribution.TDistribution tDistribution42 = null;
        org.apache.commons.math.stat.inference.TTestImpl tTestImpl43 = new org.apache.commons.math.stat.inference.TTestImpl(tDistribution42);
        double[] doubleArray49 = new double[] { 1.0f, (short) 1, 100.0f, 1, 0.0f };
        double[] doubleArray54 = new double[] { ' ', (byte) 100, (byte) 1, (-1.0f) };
        double double55 = tTestImpl43.homoscedasticT(doubleArray49, doubleArray54);
        org.apache.commons.math.distribution.TDistribution tDistribution56 = null;
        org.apache.commons.math.stat.inference.TTestImpl tTestImpl57 = new org.apache.commons.math.stat.inference.TTestImpl(tDistribution56);
        double[] doubleArray63 = new double[] { 1.0f, (short) 1, 100.0f, 1, 0.0f };
        double[] doubleArray68 = new double[] { ' ', (byte) 100, (byte) 1, (-1.0f) };
        double double69 = tTestImpl57.homoscedasticT(doubleArray63, doubleArray68);
        org.apache.commons.math.stat.inference.TTestImpl tTestImpl71 = new org.apache.commons.math.stat.inference.TTestImpl();
        org.apache.commons.math.distribution.TDistribution tDistribution73 = null;
        org.apache.commons.math.stat.inference.TTestImpl tTestImpl74 = new org.apache.commons.math.stat.inference.TTestImpl(tDistribution73);
        double[] doubleArray80 = new double[] { 1.0f, (short) 1, 100.0f, 1, 0.0f };
        double[] doubleArray85 = new double[] { ' ', (byte) 100, (byte) 1, (-1.0f) };
        double double86 = tTestImpl74.homoscedasticT(doubleArray80, doubleArray85);
        double double87 = tTestImpl71.tTest((double) (short) 100, doubleArray80);
        double double88 = tTestImpl57.t((double) 10.0f, doubleArray80);
        double double89 = tTestImpl0.pairedTTest(doubleArray49, doubleArray80);
        org.apache.commons.math.distribution.TDistribution tDistribution90 = null;
        tTestImpl0.setDistribution(tDistribution90);
        org.apache.commons.math.distribution.TDistribution tDistribution92 = null;
        tTestImpl0.setDistribution(tDistribution92);
        org.apache.commons.math.stat.descriptive.StatisticalSummary statisticalSummary95 = null;
        // The following exception was thrown during execution in test generation
        try {
            double double96 = tTestImpl0.tTest((double) 0.0f, statisticalSummary95);
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
        org.junit.Assert.assertNotNull(doubleArray49);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray49), "[1.0, 1.0, 100.0, 1.0, 0.0]");
        org.junit.Assert.assertNotNull(doubleArray54);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray54), "[32.0, 100.0, 1.0, -1.0]");
        org.junit.Assert.assertTrue("'" + double55 + "' != '" + (-0.405429217622299d) + "'", double55 == (-0.405429217622299d));
        org.junit.Assert.assertNotNull(doubleArray63);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray63), "[1.0, 1.0, 100.0, 1.0, 0.0]");
        org.junit.Assert.assertNotNull(doubleArray68);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray68), "[32.0, 100.0, 1.0, -1.0]");
        org.junit.Assert.assertTrue("'" + double69 + "' != '" + (-0.405429217622299d) + "'", double69 == (-0.405429217622299d));
        org.junit.Assert.assertNotNull(doubleArray80);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray80), "[1.0, 1.0, 100.0, 1.0, 0.0]");
        org.junit.Assert.assertNotNull(doubleArray85);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray85), "[32.0, 100.0, 1.0, -1.0]");
        org.junit.Assert.assertTrue("'" + double86 + "' != '" + (-0.405429217622299d) + "'", double86 == (-0.405429217622299d));
        org.junit.Assert.assertTrue("'" + double87 + "' != '" + 0.01613264369976175d + "'", double87 == 0.01613264369976175d);
        org.junit.Assert.assertTrue("'" + double88 + "' != '" + 0.5339796283719219d + "'", double88 == 0.5339796283719219d);
        org.junit.Assert.assertTrue(Double.isNaN(double89));
    }

    @Test
    public void test3132() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3132");
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
        org.apache.commons.math.distribution.TDistribution tDistribution42 = null;
        org.apache.commons.math.stat.inference.TTestImpl tTestImpl43 = new org.apache.commons.math.stat.inference.TTestImpl(tDistribution42);
        double[] doubleArray49 = new double[] { 1.0f, (short) 1, 100.0f, 1, 0.0f };
        double[] doubleArray54 = new double[] { ' ', (byte) 100, (byte) 1, (-1.0f) };
        double double55 = tTestImpl43.homoscedasticT(doubleArray49, doubleArray54);
        org.apache.commons.math.distribution.TDistribution tDistribution56 = null;
        org.apache.commons.math.stat.inference.TTestImpl tTestImpl57 = new org.apache.commons.math.stat.inference.TTestImpl(tDistribution56);
        double[] doubleArray63 = new double[] { 1.0f, (short) 1, 100.0f, 1, 0.0f };
        double[] doubleArray68 = new double[] { ' ', (byte) 100, (byte) 1, (-1.0f) };
        double double69 = tTestImpl57.homoscedasticT(doubleArray63, doubleArray68);
        org.apache.commons.math.stat.inference.TTestImpl tTestImpl71 = new org.apache.commons.math.stat.inference.TTestImpl();
        org.apache.commons.math.distribution.TDistribution tDistribution73 = null;
        org.apache.commons.math.stat.inference.TTestImpl tTestImpl74 = new org.apache.commons.math.stat.inference.TTestImpl(tDistribution73);
        double[] doubleArray80 = new double[] { 1.0f, (short) 1, 100.0f, 1, 0.0f };
        double[] doubleArray85 = new double[] { ' ', (byte) 100, (byte) 1, (-1.0f) };
        double double86 = tTestImpl74.homoscedasticT(doubleArray80, doubleArray85);
        double double87 = tTestImpl71.tTest((double) (short) 100, doubleArray80);
        double double88 = tTestImpl57.t((double) 10.0f, doubleArray80);
        double double89 = tTestImpl0.pairedTTest(doubleArray49, doubleArray80);
        org.apache.commons.math.stat.descriptive.StatisticalSummary statisticalSummary91 = null;
        // The following exception was thrown during execution in test generation
        try {
            double double92 = tTestImpl0.tTest(Double.NaN, statisticalSummary91);
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
        org.junit.Assert.assertNotNull(doubleArray49);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray49), "[1.0, 1.0, 100.0, 1.0, 0.0]");
        org.junit.Assert.assertNotNull(doubleArray54);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray54), "[32.0, 100.0, 1.0, -1.0]");
        org.junit.Assert.assertTrue("'" + double55 + "' != '" + (-0.405429217622299d) + "'", double55 == (-0.405429217622299d));
        org.junit.Assert.assertNotNull(doubleArray63);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray63), "[1.0, 1.0, 100.0, 1.0, 0.0]");
        org.junit.Assert.assertNotNull(doubleArray68);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray68), "[32.0, 100.0, 1.0, -1.0]");
        org.junit.Assert.assertTrue("'" + double69 + "' != '" + (-0.405429217622299d) + "'", double69 == (-0.405429217622299d));
        org.junit.Assert.assertNotNull(doubleArray80);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray80), "[1.0, 1.0, 100.0, 1.0, 0.0]");
        org.junit.Assert.assertNotNull(doubleArray85);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray85), "[32.0, 100.0, 1.0, -1.0]");
        org.junit.Assert.assertTrue("'" + double86 + "' != '" + (-0.405429217622299d) + "'", double86 == (-0.405429217622299d));
        org.junit.Assert.assertTrue("'" + double87 + "' != '" + 0.01613264369976175d + "'", double87 == 0.01613264369976175d);
        org.junit.Assert.assertTrue("'" + double88 + "' != '" + 0.5339796283719219d + "'", double88 == 0.5339796283719219d);
        org.junit.Assert.assertTrue(Double.isNaN(double89));
    }

    @Test
    public void test3133() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3133");
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
        org.apache.commons.math.stat.descriptive.StatisticalSummary statisticalSummary86 = null;
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean88 = tTestImpl1.tTest(4.733320644608368d, statisticalSummary86, (double) ' ');
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: bad significance level: 32.0");
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
    public void test3134() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3134");
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
        org.apache.commons.math.distribution.TDistribution tDistribution37 = null;
        tTestImpl17.setDistribution(tDistribution37);
        org.apache.commons.math.distribution.TDistribution tDistribution39 = null;
        org.apache.commons.math.stat.inference.TTestImpl tTestImpl40 = new org.apache.commons.math.stat.inference.TTestImpl(tDistribution39);
        double[] doubleArray46 = new double[] { 1.0f, (short) 1, 100.0f, 1, 0.0f };
        double[] doubleArray51 = new double[] { ' ', (byte) 100, (byte) 1, (-1.0f) };
        double double52 = tTestImpl40.homoscedasticT(doubleArray46, doubleArray51);
        double[] doubleArray60 = new double[] { 1, 100.0f, (-1), (short) 100, 100, (-1) };
        double double61 = tTestImpl40.t((double) '4', doubleArray60);
        org.apache.commons.math.distribution.TDistribution tDistribution62 = null;
        org.apache.commons.math.stat.inference.TTestImpl tTestImpl63 = new org.apache.commons.math.stat.inference.TTestImpl(tDistribution62);
        double[] doubleArray69 = new double[] { 1.0f, (short) 1, 100.0f, 1, 0.0f };
        double[] doubleArray74 = new double[] { ' ', (byte) 100, (byte) 1, (-1.0f) };
        double double75 = tTestImpl63.homoscedasticT(doubleArray69, doubleArray74);
        double double76 = tTestImpl17.t(doubleArray60, doubleArray74);
        double double77 = tTestImpl1.t(0.0d, doubleArray74);
        java.lang.Class<?> wildcardClass78 = tTestImpl1.getClass();
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
        org.junit.Assert.assertNotNull(doubleArray46);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray46), "[1.0, 1.0, 100.0, 1.0, 0.0]");
        org.junit.Assert.assertNotNull(doubleArray51);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray51), "[32.0, 100.0, 1.0, -1.0]");
        org.junit.Assert.assertTrue("'" + double52 + "' != '" + (-0.405429217622299d) + "'", double52 == (-0.405429217622299d));
        org.junit.Assert.assertNotNull(doubleArray60);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray60), "[1.0, 100.0, -1.0, 100.0, 100.0, -1.0]");
        org.junit.Assert.assertTrue("'" + double61 + "' != '" + (-0.09656583816243881d) + "'", double61 == (-0.09656583816243881d));
        org.junit.Assert.assertNotNull(doubleArray69);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray69), "[1.0, 1.0, 100.0, 1.0, 0.0]");
        org.junit.Assert.assertNotNull(doubleArray74);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray74), "[32.0, 100.0, 1.0, -1.0]");
        org.junit.Assert.assertTrue("'" + double75 + "' != '" + (-0.405429217622299d) + "'", double75 == (-0.405429217622299d));
        org.junit.Assert.assertTrue("'" + double76 + "' != '" + 0.5172120199559697d + "'", double76 == 0.5172120199559697d);
        org.junit.Assert.assertTrue("'" + double77 + "' != '" + 1.3997215400947067d + "'", double77 == 1.3997215400947067d);
        org.junit.Assert.assertNotNull(wildcardClass78);
    }

    @Test
    public void test3135() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3135");
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
        org.apache.commons.math.stat.descriptive.StatisticalSummary statisticalSummary92 = null;
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean94 = tTestImpl0.tTest(0.0d, statisticalSummary92, 1.3930877336894083d);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: bad significance level: 1.3930877336894083");
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
    public void test3136() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3136");
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
        double double38 = tTestImpl0.t((double) (short) 10, doubleArray22);
        org.apache.commons.math.distribution.TDistribution tDistribution39 = null;
        tTestImpl0.setDistribution(tDistribution39);
        org.apache.commons.math.distribution.TDistribution tDistribution41 = null;
        tTestImpl0.setDistribution(tDistribution41);
        org.apache.commons.math.distribution.TDistribution tDistribution43 = null;
        tTestImpl0.setDistribution(tDistribution43);
        org.apache.commons.math.distribution.TDistribution tDistribution45 = null;
        tTestImpl0.setDistribution(tDistribution45);
        org.apache.commons.math.stat.descriptive.StatisticalSummary statisticalSummary47 = null;
        org.apache.commons.math.stat.descriptive.StatisticalSummary statisticalSummary48 = null;
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean50 = tTestImpl0.tTest(statisticalSummary47, statisticalSummary48, 1.4421373443400007d);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: bad significance level: 1.4421373443400007");
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
        org.junit.Assert.assertTrue("'" + double38 + "' != '" + 3.8d + "'", double38 == 3.8d);
    }

    @Test
    public void test3137() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3137");
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
            boolean boolean68 = tTestImpl0.tTest(1.0116792134203785d, statisticalSummary66, 0.4450411875109115d);
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

    @Test
    public void test3138() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3138");
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
        org.apache.commons.math.distribution.TDistribution tDistribution42 = null;
        tTestImpl0.setDistribution(tDistribution42);
        org.apache.commons.math.stat.descriptive.StatisticalSummary statisticalSummary45 = null;
        // The following exception was thrown during execution in test generation
        try {
            double double46 = tTestImpl0.tTest(1.4421373443400007d, statisticalSummary45);
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
    }
}

