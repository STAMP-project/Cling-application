import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class RegressionTest3 {

    public static boolean debug = false;

    @Test
    public void test1501() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1501");
        org.apache.commons.math.stat.descriptive.moment.Variance variance1 = new org.apache.commons.math.stat.descriptive.moment.Variance(false);
        double[] doubleArray8 = new double[] { (byte) -1, (short) 100, 'a', 0, 1, (-1.0d) };
        double double9 = variance1.evaluate(doubleArray8);
        variance1.setBiasCorrected(true);
        long long12 = variance1.getN();
        long long13 = variance1.getN();
        boolean boolean14 = variance1.isBiasCorrected();
        org.apache.commons.math.stat.descriptive.moment.Variance variance16 = new org.apache.commons.math.stat.descriptive.moment.Variance(false);
        double[] doubleArray23 = new double[] { (byte) -1, (short) 100, 'a', 0, 1, (-1.0d) };
        double double24 = variance16.evaluate(doubleArray23);
        variance16.setBiasCorrected(true);
        boolean boolean27 = variance16.isBiasCorrected();
        double[] doubleArray34 = new double[] { (short) 0, 1.0d, 1L, 0.0d, (-1.0d), 10L };
        double double35 = variance16.evaluate(doubleArray34);
        boolean boolean37 = variance16.equals((java.lang.Object) 10.0d);
        org.apache.commons.math.stat.descriptive.moment.Variance variance39 = new org.apache.commons.math.stat.descriptive.moment.Variance(false);
        double[] doubleArray46 = new double[] { (byte) -1, (short) 100, 'a', 0, 1, (-1.0d) };
        double double47 = variance39.evaluate(doubleArray46);
        variance39.setBiasCorrected(true);
        boolean boolean50 = variance39.isBiasCorrected();
        double[] doubleArray57 = new double[] { (short) 0, 1.0d, 1L, 0.0d, (-1.0d), 10L };
        double double58 = variance39.evaluate(doubleArray57);
        double double60 = variance16.evaluate(doubleArray57, (double) 0.0f);
        variance1.incrementAll(doubleArray57);
        variance1.increment((double) 0.0f);
        variance1.increment(1166128.5457099646d);
        boolean boolean66 = variance1.isBiasCorrected();
        org.junit.Assert.assertNotNull(doubleArray8);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray8), "[-1.0, 100.0, 97.0, 0.0, 1.0, -1.0]");
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 2168.222222222222d + "'", double9 == 2168.222222222222d);
        org.junit.Assert.assertTrue("'" + long12 + "' != '" + 0L + "'", long12 == 0L);
        org.junit.Assert.assertTrue("'" + long13 + "' != '" + 0L + "'", long13 == 0L);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertNotNull(doubleArray23);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray23), "[-1.0, 100.0, 97.0, 0.0, 1.0, -1.0]");
        org.junit.Assert.assertTrue("'" + double24 + "' != '" + 2168.222222222222d + "'", double24 == 2168.222222222222d);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + true + "'", boolean27 == true);
        org.junit.Assert.assertNotNull(doubleArray34);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray34), "[0.0, 1.0, 1.0, 0.0, -1.0, 10.0]");
        org.junit.Assert.assertTrue("'" + double35 + "' != '" + 16.566666666666663d + "'", double35 == 16.566666666666663d);
        org.junit.Assert.assertTrue("'" + boolean37 + "' != '" + false + "'", boolean37 == false);
        org.junit.Assert.assertNotNull(doubleArray46);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray46), "[-1.0, 100.0, 97.0, 0.0, 1.0, -1.0]");
        org.junit.Assert.assertTrue("'" + double47 + "' != '" + 2168.222222222222d + "'", double47 == 2168.222222222222d);
        org.junit.Assert.assertTrue("'" + boolean50 + "' != '" + true + "'", boolean50 == true);
        org.junit.Assert.assertNotNull(doubleArray57);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray57), "[0.0, 1.0, 1.0, 0.0, -1.0, 10.0]");
        org.junit.Assert.assertTrue("'" + double58 + "' != '" + 16.566666666666663d + "'", double58 == 16.566666666666663d);
        org.junit.Assert.assertTrue("'" + double60 + "' != '" + 16.566666666666666d + "'", double60 == 16.566666666666666d);
        org.junit.Assert.assertTrue("'" + boolean66 + "' != '" + true + "'", boolean66 == true);
    }

    @Test
    public void test1502() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1502");
        org.apache.commons.math.stat.descriptive.moment.Variance variance1 = new org.apache.commons.math.stat.descriptive.moment.Variance(false);
        double[] doubleArray8 = new double[] { (byte) -1, (short) 100, 'a', 0, 1, (-1.0d) };
        double double9 = variance1.evaluate(doubleArray8);
        variance1.setBiasCorrected(true);
        boolean boolean12 = variance1.isBiasCorrected();
        double[] doubleArray19 = new double[] { (short) 0, 1.0d, 1L, 0.0d, (-1.0d), 10L };
        double double20 = variance1.evaluate(doubleArray19);
        double double21 = variance1.getResult();
        long long22 = variance1.getN();
        variance1.increment((double) '#');
        variance1.increment(100.0d);
        org.apache.commons.math.stat.descriptive.moment.Variance variance28 = new org.apache.commons.math.stat.descriptive.moment.Variance(false);
        double[] doubleArray35 = new double[] { (byte) -1, (short) 100, 'a', 0, 1, (-1.0d) };
        double double36 = variance28.evaluate(doubleArray35);
        variance28.setBiasCorrected(true);
        boolean boolean39 = variance28.isBiasCorrected();
        double[] doubleArray46 = new double[] { (short) 0, 1.0d, 1L, 0.0d, (-1.0d), 10L };
        double double47 = variance28.evaluate(doubleArray46);
        double double49 = variance1.evaluate(doubleArray46, (double) (byte) 100);
        boolean boolean50 = variance1.isBiasCorrected();
        long long51 = variance1.getN();
        double double52 = variance1.getResult();
        variance1.clear();
        variance1.increment((double) 4L);
        org.junit.Assert.assertNotNull(doubleArray8);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray8), "[-1.0, 100.0, 97.0, 0.0, 1.0, -1.0]");
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 2168.222222222222d + "'", double9 == 2168.222222222222d);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertNotNull(doubleArray19);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray19), "[0.0, 1.0, 1.0, 0.0, -1.0, 10.0]");
        org.junit.Assert.assertTrue("'" + double20 + "' != '" + 16.566666666666663d + "'", double20 == 16.566666666666663d);
        org.junit.Assert.assertTrue(Double.isNaN(double21));
        org.junit.Assert.assertTrue("'" + long22 + "' != '" + 0L + "'", long22 == 0L);
        org.junit.Assert.assertNotNull(doubleArray35);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray35), "[-1.0, 100.0, 97.0, 0.0, 1.0, -1.0]");
        org.junit.Assert.assertTrue("'" + double36 + "' != '" + 2168.222222222222d + "'", double36 == 2168.222222222222d);
        org.junit.Assert.assertTrue("'" + boolean39 + "' != '" + true + "'", boolean39 == true);
        org.junit.Assert.assertNotNull(doubleArray46);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray46), "[0.0, 1.0, 1.0, 0.0, -1.0, 10.0]");
        org.junit.Assert.assertTrue("'" + double47 + "' != '" + 16.566666666666663d + "'", double47 == 16.566666666666663d);
        org.junit.Assert.assertTrue("'" + double49 + "' != '" + 16.566666666667153d + "'", double49 == 16.566666666667153d);
        org.junit.Assert.assertTrue("'" + boolean50 + "' != '" + true + "'", boolean50 == true);
        org.junit.Assert.assertTrue("'" + long51 + "' != '" + 2L + "'", long51 == 2L);
        org.junit.Assert.assertTrue("'" + double52 + "' != '" + 2112.5d + "'", double52 == 2112.5d);
    }

    @Test
    public void test1503() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1503");
        org.apache.commons.math.stat.descriptive.moment.Variance variance0 = new org.apache.commons.math.stat.descriptive.moment.Variance();
        double double1 = variance0.getResult();
        boolean boolean2 = variance0.isBiasCorrected();
        org.apache.commons.math.stat.descriptive.moment.Variance variance4 = new org.apache.commons.math.stat.descriptive.moment.Variance(true);
        double double5 = variance4.getResult();
        double double6 = variance4.getResult();
        org.apache.commons.math.stat.descriptive.moment.Variance variance8 = new org.apache.commons.math.stat.descriptive.moment.Variance(false);
        double[] doubleArray15 = new double[] { (byte) -1, (short) 100, 'a', 0, 1, (-1.0d) };
        double double16 = variance8.evaluate(doubleArray15);
        variance8.clear();
        variance8.setBiasCorrected(true);
        org.apache.commons.math.stat.descriptive.moment.Variance variance21 = new org.apache.commons.math.stat.descriptive.moment.Variance(false);
        variance21.clear();
        double double23 = variance21.getResult();
        double[] doubleArray28 = new double[] { (-1), 2168.222222222222d, 16.566666666418314d, 10.0d };
        variance21.incrementAll(doubleArray28);
        boolean boolean30 = variance8.equals((java.lang.Object) doubleArray28);
        double double32 = variance4.evaluate(doubleArray28, (double) (-1.0f));
        double double34 = variance0.evaluate(doubleArray28, (double) (-1L));
        variance0.increment(2.25d);
        long long37 = variance0.getN();
        boolean boolean38 = variance0.isBiasCorrected();
        long long39 = variance0.getN();
        variance0.increment(23.333333333333332d);
        org.junit.Assert.assertTrue(Double.isNaN(double1));
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue(Double.isNaN(double5));
        org.junit.Assert.assertTrue(Double.isNaN(double6));
        org.junit.Assert.assertNotNull(doubleArray15);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray15), "[-1.0, 100.0, 97.0, 0.0, 1.0, -1.0]");
        org.junit.Assert.assertTrue("'" + double16 + "' != '" + 2168.222222222222d + "'", double16 == 2168.222222222222d);
        org.junit.Assert.assertTrue(Double.isNaN(double23));
        org.junit.Assert.assertNotNull(doubleArray28);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray28), "[-1.0, 2168.222222222222, 16.566666666418314, 10.0]");
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + false + "'", boolean30 == false);
        org.junit.Assert.assertTrue("'" + double32 + "' != '" + 1166128.5457099646d + "'", double32 == 1166128.5457099646d);
        org.junit.Assert.assertTrue("'" + double34 + "' != '" + 1166128.5457099646d + "'", double34 == 1166128.5457099646d);
        org.junit.Assert.assertTrue("'" + long37 + "' != '" + 1L + "'", long37 == 1L);
        org.junit.Assert.assertTrue("'" + boolean38 + "' != '" + true + "'", boolean38 == true);
        org.junit.Assert.assertTrue("'" + long39 + "' != '" + 1L + "'", long39 == 1L);
    }

    @Test
    public void test1504() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1504");
        org.apache.commons.math.stat.descriptive.moment.Variance variance1 = new org.apache.commons.math.stat.descriptive.moment.Variance(false);
        double[] doubleArray8 = new double[] { (byte) -1, (short) 100, 'a', 0, 1, (-1.0d) };
        double double9 = variance1.evaluate(doubleArray8);
        variance1.setBiasCorrected(true);
        org.apache.commons.math.stat.descriptive.moment.Variance variance13 = new org.apache.commons.math.stat.descriptive.moment.Variance(false);
        variance13.clear();
        double double15 = variance13.getResult();
        double[] doubleArray20 = new double[] { (-1), 2168.222222222222d, 16.566666666418314d, 10.0d };
        variance13.incrementAll(doubleArray20);
        variance1.incrementAll(doubleArray20);
        boolean boolean23 = variance1.isBiasCorrected();
        variance1.clear();
        org.junit.Assert.assertNotNull(doubleArray8);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray8), "[-1.0, 100.0, 97.0, 0.0, 1.0, -1.0]");
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 2168.222222222222d + "'", double9 == 2168.222222222222d);
        org.junit.Assert.assertTrue(Double.isNaN(double15));
        org.junit.Assert.assertNotNull(doubleArray20);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray20), "[-1.0, 2168.222222222222, 16.566666666418314, 10.0]");
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + true + "'", boolean23 == true);
    }

    @Test
    public void test1505() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1505");
        org.apache.commons.math.stat.descriptive.moment.Variance variance1 = new org.apache.commons.math.stat.descriptive.moment.Variance(false);
        variance1.clear();
        double double3 = variance1.getResult();
        org.apache.commons.math.stat.descriptive.moment.Variance variance5 = new org.apache.commons.math.stat.descriptive.moment.Variance(false);
        double[] doubleArray12 = new double[] { (byte) -1, (short) 100, 'a', 0, 1, (-1.0d) };
        double double13 = variance5.evaluate(doubleArray12);
        variance5.setBiasCorrected(true);
        boolean boolean16 = variance5.isBiasCorrected();
        double[] doubleArray23 = new double[] { (short) 0, 1.0d, 1L, 0.0d, (-1.0d), 10L };
        double double24 = variance5.evaluate(doubleArray23);
        double double25 = variance5.getResult();
        variance5.setBiasCorrected(true);
        org.apache.commons.math.stat.descriptive.moment.Variance variance29 = new org.apache.commons.math.stat.descriptive.moment.Variance(false);
        double[] doubleArray36 = new double[] { (byte) -1, (short) 100, 'a', 0, 1, (-1.0d) };
        double double37 = variance29.evaluate(doubleArray36);
        variance29.setBiasCorrected(true);
        org.apache.commons.math.stat.descriptive.moment.Variance variance41 = new org.apache.commons.math.stat.descriptive.moment.Variance(false);
        double[] doubleArray48 = new double[] { (byte) -1, (short) 100, 'a', 0, 1, (-1.0d) };
        double double49 = variance41.evaluate(doubleArray48);
        variance41.setBiasCorrected(true);
        boolean boolean52 = variance41.isBiasCorrected();
        double[] doubleArray59 = new double[] { (short) 0, 1.0d, 1L, 0.0d, (-1.0d), 10L };
        double double60 = variance41.evaluate(doubleArray59);
        org.apache.commons.math.stat.descriptive.moment.Variance variance62 = new org.apache.commons.math.stat.descriptive.moment.Variance(false);
        double[] doubleArray69 = new double[] { (byte) -1, (short) 100, 'a', 0, 1, (-1.0d) };
        double double70 = variance62.evaluate(doubleArray69);
        variance62.setBiasCorrected(true);
        boolean boolean73 = variance62.isBiasCorrected();
        double[] doubleArray80 = new double[] { (short) 0, 1.0d, 1L, 0.0d, (-1.0d), 10L };
        double double81 = variance62.evaluate(doubleArray80);
        double double84 = variance41.evaluate(doubleArray80, (int) (byte) 1, 0);
        double double86 = variance29.evaluate(doubleArray80, 2178.0d);
        boolean boolean87 = variance5.equals((java.lang.Object) doubleArray80);
        double double89 = variance1.evaluate(doubleArray80, (double) '#');
        long long90 = variance1.getN();
        boolean boolean91 = variance1.isBiasCorrected();
        variance1.increment(13.805555555555552d);
        variance1.clear();
        java.lang.Class<?> wildcardClass95 = variance1.getClass();
        org.junit.Assert.assertTrue(Double.isNaN(double3));
        org.junit.Assert.assertNotNull(doubleArray12);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray12), "[-1.0, 100.0, 97.0, 0.0, 1.0, -1.0]");
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 2168.222222222222d + "'", double13 == 2168.222222222222d);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertNotNull(doubleArray23);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray23), "[0.0, 1.0, 1.0, 0.0, -1.0, 10.0]");
        org.junit.Assert.assertTrue("'" + double24 + "' != '" + 16.566666666666663d + "'", double24 == 16.566666666666663d);
        org.junit.Assert.assertTrue(Double.isNaN(double25));
        org.junit.Assert.assertNotNull(doubleArray36);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray36), "[-1.0, 100.0, 97.0, 0.0, 1.0, -1.0]");
        org.junit.Assert.assertTrue("'" + double37 + "' != '" + 2168.222222222222d + "'", double37 == 2168.222222222222d);
        org.junit.Assert.assertNotNull(doubleArray48);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray48), "[-1.0, 100.0, 97.0, 0.0, 1.0, -1.0]");
        org.junit.Assert.assertTrue("'" + double49 + "' != '" + 2168.222222222222d + "'", double49 == 2168.222222222222d);
        org.junit.Assert.assertTrue("'" + boolean52 + "' != '" + true + "'", boolean52 == true);
        org.junit.Assert.assertNotNull(doubleArray59);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray59), "[0.0, 1.0, 1.0, 0.0, -1.0, 10.0]");
        org.junit.Assert.assertTrue("'" + double60 + "' != '" + 16.566666666666663d + "'", double60 == 16.566666666666663d);
        org.junit.Assert.assertNotNull(doubleArray69);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray69), "[-1.0, 100.0, 97.0, 0.0, 1.0, -1.0]");
        org.junit.Assert.assertTrue("'" + double70 + "' != '" + 2168.222222222222d + "'", double70 == 2168.222222222222d);
        org.junit.Assert.assertTrue("'" + boolean73 + "' != '" + true + "'", boolean73 == true);
        org.junit.Assert.assertNotNull(doubleArray80);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray80), "[0.0, 1.0, 1.0, 0.0, -1.0, 10.0]");
        org.junit.Assert.assertTrue("'" + double81 + "' != '" + 16.566666666666663d + "'", double81 == 16.566666666666663d);
        org.junit.Assert.assertTrue(Double.isNaN(double84));
        org.junit.Assert.assertTrue("'" + double86 + "' != '" + 16.566666666418314d + "'", double86 == 16.566666666418314d);
        org.junit.Assert.assertTrue("'" + boolean87 + "' != '" + false + "'", boolean87 == false);
        org.junit.Assert.assertTrue("'" + double89 + "' != '" + 13.805555555555506d + "'", double89 == 13.805555555555506d);
        org.junit.Assert.assertTrue("'" + long90 + "' != '" + 0L + "'", long90 == 0L);
        org.junit.Assert.assertTrue("'" + boolean91 + "' != '" + false + "'", boolean91 == false);
        org.junit.Assert.assertNotNull(wildcardClass95);
    }

    @Test
    public void test1506() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1506");
        org.apache.commons.math.stat.descriptive.moment.Variance variance1 = new org.apache.commons.math.stat.descriptive.moment.Variance(false);
        double[] doubleArray8 = new double[] { (byte) -1, (short) 100, 'a', 0, 1, (-1.0d) };
        double double9 = variance1.evaluate(doubleArray8);
        variance1.setBiasCorrected(true);
        boolean boolean12 = variance1.isBiasCorrected();
        double[] doubleArray19 = new double[] { (short) 0, 1.0d, 1L, 0.0d, (-1.0d), 10L };
        double double20 = variance1.evaluate(doubleArray19);
        double double21 = variance1.getResult();
        variance1.setBiasCorrected(true);
        boolean boolean24 = variance1.isBiasCorrected();
        variance1.increment(16.566666666667153d);
        variance1.clear();
        org.junit.Assert.assertNotNull(doubleArray8);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray8), "[-1.0, 100.0, 97.0, 0.0, 1.0, -1.0]");
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 2168.222222222222d + "'", double9 == 2168.222222222222d);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertNotNull(doubleArray19);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray19), "[0.0, 1.0, 1.0, 0.0, -1.0, 10.0]");
        org.junit.Assert.assertTrue("'" + double20 + "' != '" + 16.566666666666663d + "'", double20 == 16.566666666666663d);
        org.junit.Assert.assertTrue(Double.isNaN(double21));
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + true + "'", boolean24 == true);
    }

    @Test
    public void test1507() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1507");
        org.apache.commons.math.stat.descriptive.moment.Variance variance1 = new org.apache.commons.math.stat.descriptive.moment.Variance(false);
        double[] doubleArray8 = new double[] { (byte) -1, (short) 100, 'a', 0, 1, (-1.0d) };
        double double9 = variance1.evaluate(doubleArray8);
        variance1.setBiasCorrected(true);
        boolean boolean12 = variance1.isBiasCorrected();
        org.apache.commons.math.stat.descriptive.moment.Variance variance14 = new org.apache.commons.math.stat.descriptive.moment.Variance(false);
        double[] doubleArray21 = new double[] { (byte) -1, (short) 100, 'a', 0, 1, (-1.0d) };
        double double22 = variance14.evaluate(doubleArray21);
        variance14.setBiasCorrected(true);
        org.apache.commons.math.stat.descriptive.moment.Variance variance26 = new org.apache.commons.math.stat.descriptive.moment.Variance(false);
        double[] doubleArray33 = new double[] { (byte) -1, (short) 100, 'a', 0, 1, (-1.0d) };
        double double34 = variance26.evaluate(doubleArray33);
        variance26.setBiasCorrected(true);
        boolean boolean37 = variance26.isBiasCorrected();
        double[] doubleArray44 = new double[] { (short) 0, 1.0d, 1L, 0.0d, (-1.0d), 10L };
        double double45 = variance26.evaluate(doubleArray44);
        double double48 = variance14.evaluate(doubleArray44, (int) (byte) 1, (int) (byte) 0);
        double double51 = variance1.evaluate(doubleArray44, (int) (byte) 1, 0);
        org.apache.commons.math.stat.descriptive.moment.Variance variance53 = new org.apache.commons.math.stat.descriptive.moment.Variance(false);
        double[] doubleArray60 = new double[] { (byte) -1, (short) 100, 'a', 0, 1, (-1.0d) };
        double double61 = variance53.evaluate(doubleArray60);
        variance53.clear();
        variance53.setBiasCorrected(true);
        boolean boolean65 = variance1.equals((java.lang.Object) variance53);
        variance53.setBiasCorrected(true);
        org.junit.Assert.assertNotNull(doubleArray8);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray8), "[-1.0, 100.0, 97.0, 0.0, 1.0, -1.0]");
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 2168.222222222222d + "'", double9 == 2168.222222222222d);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertNotNull(doubleArray21);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray21), "[-1.0, 100.0, 97.0, 0.0, 1.0, -1.0]");
        org.junit.Assert.assertTrue("'" + double22 + "' != '" + 2168.222222222222d + "'", double22 == 2168.222222222222d);
        org.junit.Assert.assertNotNull(doubleArray33);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray33), "[-1.0, 100.0, 97.0, 0.0, 1.0, -1.0]");
        org.junit.Assert.assertTrue("'" + double34 + "' != '" + 2168.222222222222d + "'", double34 == 2168.222222222222d);
        org.junit.Assert.assertTrue("'" + boolean37 + "' != '" + true + "'", boolean37 == true);
        org.junit.Assert.assertNotNull(doubleArray44);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray44), "[0.0, 1.0, 1.0, 0.0, -1.0, 10.0]");
        org.junit.Assert.assertTrue("'" + double45 + "' != '" + 16.566666666666663d + "'", double45 == 16.566666666666663d);
        org.junit.Assert.assertTrue(Double.isNaN(double48));
        org.junit.Assert.assertTrue(Double.isNaN(double51));
        org.junit.Assert.assertNotNull(doubleArray60);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray60), "[-1.0, 100.0, 97.0, 0.0, 1.0, -1.0]");
        org.junit.Assert.assertTrue("'" + double61 + "' != '" + 2168.222222222222d + "'", double61 == 2168.222222222222d);
        org.junit.Assert.assertTrue("'" + boolean65 + "' != '" + true + "'", boolean65 == true);
    }

    @Test
    public void test1508() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1508");
        org.apache.commons.math.stat.descriptive.moment.Variance variance1 = new org.apache.commons.math.stat.descriptive.moment.Variance(false);
        double[] doubleArray8 = new double[] { (byte) -1, (short) 100, 'a', 0, 1, (-1.0d) };
        double double9 = variance1.evaluate(doubleArray8);
        variance1.setBiasCorrected(true);
        variance1.increment((double) (byte) 0);
        double[] doubleArray16 = new double[] { 'a', 100L };
        double double18 = variance1.evaluate(doubleArray16, 0.0d);
        double double19 = variance1.getResult();
        org.apache.commons.math.stat.descriptive.moment.Variance variance21 = new org.apache.commons.math.stat.descriptive.moment.Variance(false);
        variance21.clear();
        double double23 = variance21.getResult();
        double[] doubleArray28 = new double[] { (-1), 2168.222222222222d, 16.566666666418314d, 10.0d };
        variance21.incrementAll(doubleArray28);
        variance1.incrementAll(doubleArray28, (int) (short) 1, 1);
        boolean boolean33 = variance1.isBiasCorrected();
        org.junit.Assert.assertNotNull(doubleArray8);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray8), "[-1.0, 100.0, 97.0, 0.0, 1.0, -1.0]");
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 2168.222222222222d + "'", double9 == 2168.222222222222d);
        org.junit.Assert.assertNotNull(doubleArray16);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray16), "[97.0, 100.0]");
        org.junit.Assert.assertTrue("'" + double18 + "' != '" + 4.5d + "'", double18 == 4.5d);
        org.junit.Assert.assertTrue("'" + double19 + "' != '" + 0.0d + "'", double19 == 0.0d);
        org.junit.Assert.assertTrue(Double.isNaN(double23));
        org.junit.Assert.assertNotNull(doubleArray28);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray28), "[-1.0, 2168.222222222222, 16.566666666418314, 10.0]");
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + true + "'", boolean33 == true);
    }

    @Test
    public void test1509() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1509");
        org.apache.commons.math.stat.descriptive.moment.Variance variance1 = new org.apache.commons.math.stat.descriptive.moment.Variance(false);
        double[] doubleArray8 = new double[] { (byte) -1, (short) 100, 'a', 0, 1, (-1.0d) };
        double double9 = variance1.evaluate(doubleArray8);
        variance1.setBiasCorrected(true);
        boolean boolean12 = variance1.isBiasCorrected();
        double[] doubleArray19 = new double[] { (short) 0, 1.0d, 1L, 0.0d, (-1.0d), 10L };
        double double20 = variance1.evaluate(doubleArray19);
        double double21 = variance1.getResult();
        long long22 = variance1.getN();
        variance1.increment((double) '#');
        variance1.setBiasCorrected(false);
        org.apache.commons.math.stat.descriptive.moment.Variance variance28 = new org.apache.commons.math.stat.descriptive.moment.Variance(false);
        double[] doubleArray35 = new double[] { (byte) -1, (short) 100, 'a', 0, 1, (-1.0d) };
        double double36 = variance28.evaluate(doubleArray35);
        variance28.setBiasCorrected(true);
        variance28.increment((double) (byte) 0);
        double[] doubleArray43 = new double[] { 'a', 100L };
        double double45 = variance28.evaluate(doubleArray43, 0.0d);
        variance1.incrementAll(doubleArray43);
        org.apache.commons.math.stat.descriptive.moment.Variance variance48 = new org.apache.commons.math.stat.descriptive.moment.Variance(true);
        double double49 = variance48.getResult();
        double double50 = variance48.getResult();
        org.apache.commons.math.stat.descriptive.moment.Variance variance52 = new org.apache.commons.math.stat.descriptive.moment.Variance(false);
        double[] doubleArray59 = new double[] { (byte) -1, (short) 100, 'a', 0, 1, (-1.0d) };
        double double60 = variance52.evaluate(doubleArray59);
        variance52.setBiasCorrected(true);
        long long63 = variance52.getN();
        variance52.clear();
        org.apache.commons.math.stat.descriptive.moment.Variance variance66 = new org.apache.commons.math.stat.descriptive.moment.Variance(false);
        double[] doubleArray73 = new double[] { (byte) -1, (short) 100, 'a', 0, 1, (-1.0d) };
        double double74 = variance66.evaluate(doubleArray73);
        double double75 = variance52.evaluate(doubleArray73);
        variance48.incrementAll(doubleArray73);
        double double77 = variance1.evaluate(doubleArray73);
        long long78 = variance1.getN();
        variance1.increment(16.56666666666667d);
        org.junit.Assert.assertNotNull(doubleArray8);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray8), "[-1.0, 100.0, 97.0, 0.0, 1.0, -1.0]");
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 2168.222222222222d + "'", double9 == 2168.222222222222d);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertNotNull(doubleArray19);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray19), "[0.0, 1.0, 1.0, 0.0, -1.0, 10.0]");
        org.junit.Assert.assertTrue("'" + double20 + "' != '" + 16.566666666666663d + "'", double20 == 16.566666666666663d);
        org.junit.Assert.assertTrue(Double.isNaN(double21));
        org.junit.Assert.assertTrue("'" + long22 + "' != '" + 0L + "'", long22 == 0L);
        org.junit.Assert.assertNotNull(doubleArray35);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray35), "[-1.0, 100.0, 97.0, 0.0, 1.0, -1.0]");
        org.junit.Assert.assertTrue("'" + double36 + "' != '" + 2168.222222222222d + "'", double36 == 2168.222222222222d);
        org.junit.Assert.assertNotNull(doubleArray43);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray43), "[97.0, 100.0]");
        org.junit.Assert.assertTrue("'" + double45 + "' != '" + 4.5d + "'", double45 == 4.5d);
        org.junit.Assert.assertTrue(Double.isNaN(double49));
        org.junit.Assert.assertTrue(Double.isNaN(double50));
        org.junit.Assert.assertNotNull(doubleArray59);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray59), "[-1.0, 100.0, 97.0, 0.0, 1.0, -1.0]");
        org.junit.Assert.assertTrue("'" + double60 + "' != '" + 2168.222222222222d + "'", double60 == 2168.222222222222d);
        org.junit.Assert.assertTrue("'" + long63 + "' != '" + 0L + "'", long63 == 0L);
        org.junit.Assert.assertNotNull(doubleArray73);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray73), "[-1.0, 100.0, 97.0, 0.0, 1.0, -1.0]");
        org.junit.Assert.assertTrue("'" + double74 + "' != '" + 2168.222222222222d + "'", double74 == 2168.222222222222d);
        org.junit.Assert.assertTrue("'" + double75 + "' != '" + 2601.866666666667d + "'", double75 == 2601.866666666667d);
        org.junit.Assert.assertTrue("'" + double77 + "' != '" + 2168.222222222222d + "'", double77 == 2168.222222222222d);
        org.junit.Assert.assertTrue("'" + long78 + "' != '" + 0L + "'", long78 == 0L);
    }

    @Test
    public void test1510() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1510");
        org.apache.commons.math.stat.descriptive.moment.SecondMoment secondMoment1 = null;
        org.apache.commons.math.stat.descriptive.moment.Variance variance2 = new org.apache.commons.math.stat.descriptive.moment.Variance(true, secondMoment1);
        variance2.clear();
        double[] doubleArray4 = new double[] {};
        variance2.incrementAll(doubleArray4);
        variance2.increment(2178.0d);
        variance2.clear();
        variance2.clear();
        boolean boolean10 = variance2.isBiasCorrected();
        boolean boolean11 = variance2.isBiasCorrected();
        org.apache.commons.math.stat.descriptive.moment.Variance variance13 = new org.apache.commons.math.stat.descriptive.moment.Variance(false);
        double[] doubleArray20 = new double[] { (byte) -1, (short) 100, 'a', 0, 1, (-1.0d) };
        double double21 = variance13.evaluate(doubleArray20);
        variance13.setBiasCorrected(true);
        boolean boolean24 = variance13.isBiasCorrected();
        double[] doubleArray31 = new double[] { (short) 0, 1.0d, 1L, 0.0d, (-1.0d), 10L };
        double double32 = variance13.evaluate(doubleArray31);
        double double33 = variance13.getResult();
        long long34 = variance13.getN();
        variance13.increment((double) '#');
        variance13.increment(100.0d);
        org.apache.commons.math.stat.descriptive.moment.Variance variance40 = new org.apache.commons.math.stat.descriptive.moment.Variance(false);
        double[] doubleArray47 = new double[] { (byte) -1, (short) 100, 'a', 0, 1, (-1.0d) };
        double double48 = variance40.evaluate(doubleArray47);
        variance40.setBiasCorrected(true);
        boolean boolean51 = variance40.isBiasCorrected();
        double[] doubleArray58 = new double[] { (short) 0, 1.0d, 1L, 0.0d, (-1.0d), 10L };
        double double59 = variance40.evaluate(doubleArray58);
        double double61 = variance13.evaluate(doubleArray58, (double) (byte) 100);
        boolean boolean62 = variance13.isBiasCorrected();
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean63 = variance2.equals((java.lang.Object) variance13);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(doubleArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray4), "[]");
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertNotNull(doubleArray20);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray20), "[-1.0, 100.0, 97.0, 0.0, 1.0, -1.0]");
        org.junit.Assert.assertTrue("'" + double21 + "' != '" + 2168.222222222222d + "'", double21 == 2168.222222222222d);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + true + "'", boolean24 == true);
        org.junit.Assert.assertNotNull(doubleArray31);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray31), "[0.0, 1.0, 1.0, 0.0, -1.0, 10.0]");
        org.junit.Assert.assertTrue("'" + double32 + "' != '" + 16.566666666666663d + "'", double32 == 16.566666666666663d);
        org.junit.Assert.assertTrue(Double.isNaN(double33));
        org.junit.Assert.assertTrue("'" + long34 + "' != '" + 0L + "'", long34 == 0L);
        org.junit.Assert.assertNotNull(doubleArray47);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray47), "[-1.0, 100.0, 97.0, 0.0, 1.0, -1.0]");
        org.junit.Assert.assertTrue("'" + double48 + "' != '" + 2168.222222222222d + "'", double48 == 2168.222222222222d);
        org.junit.Assert.assertTrue("'" + boolean51 + "' != '" + true + "'", boolean51 == true);
        org.junit.Assert.assertNotNull(doubleArray58);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray58), "[0.0, 1.0, 1.0, 0.0, -1.0, 10.0]");
        org.junit.Assert.assertTrue("'" + double59 + "' != '" + 16.566666666666663d + "'", double59 == 16.566666666666663d);
        org.junit.Assert.assertTrue("'" + double61 + "' != '" + 16.566666666667153d + "'", double61 == 16.566666666667153d);
        org.junit.Assert.assertTrue("'" + boolean62 + "' != '" + true + "'", boolean62 == true);
    }

    @Test
    public void test1511() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1511");
        org.apache.commons.math.stat.descriptive.moment.Variance variance1 = new org.apache.commons.math.stat.descriptive.moment.Variance(false);
        double[] doubleArray8 = new double[] { (byte) -1, (short) 100, 'a', 0, 1, (-1.0d) };
        double double9 = variance1.evaluate(doubleArray8);
        variance1.setBiasCorrected(true);
        variance1.increment((double) (byte) 0);
        variance1.setBiasCorrected(true);
        variance1.increment(2094.2678571428573d);
        org.junit.Assert.assertNotNull(doubleArray8);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray8), "[-1.0, 100.0, 97.0, 0.0, 1.0, -1.0]");
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 2168.222222222222d + "'", double9 == 2168.222222222222d);
    }

    @Test
    public void test1512() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1512");
        org.apache.commons.math.stat.descriptive.moment.Variance variance1 = new org.apache.commons.math.stat.descriptive.moment.Variance(false);
        org.apache.commons.math.stat.descriptive.moment.Variance variance3 = new org.apache.commons.math.stat.descriptive.moment.Variance(false);
        double[] doubleArray10 = new double[] { (byte) -1, (short) 100, 'a', 0, 1, (-1.0d) };
        double double11 = variance3.evaluate(doubleArray10);
        variance3.setBiasCorrected(true);
        org.apache.commons.math.stat.descriptive.moment.Variance variance15 = new org.apache.commons.math.stat.descriptive.moment.Variance(false);
        double[] doubleArray22 = new double[] { (byte) -1, (short) 100, 'a', 0, 1, (-1.0d) };
        double double23 = variance15.evaluate(doubleArray22);
        variance15.setBiasCorrected(true);
        org.apache.commons.math.stat.descriptive.moment.Variance variance27 = new org.apache.commons.math.stat.descriptive.moment.Variance(false);
        double[] doubleArray34 = new double[] { (byte) -1, (short) 100, 'a', 0, 1, (-1.0d) };
        double double35 = variance27.evaluate(doubleArray34);
        variance27.setBiasCorrected(true);
        boolean boolean38 = variance27.isBiasCorrected();
        double[] doubleArray45 = new double[] { (short) 0, 1.0d, 1L, 0.0d, (-1.0d), 10L };
        double double46 = variance27.evaluate(doubleArray45);
        double double49 = variance15.evaluate(doubleArray45, (int) (byte) 1, (int) (byte) 0);
        variance3.incrementAll(doubleArray45, (int) (byte) 1, 1);
        double double53 = variance1.evaluate(doubleArray45);
        double double54 = variance1.getResult();
        variance1.increment(2601.866666666667d);
        variance1.increment((double) (byte) -1);
        variance1.increment(0.0d);
        org.apache.commons.math.stat.descriptive.moment.Variance variance62 = new org.apache.commons.math.stat.descriptive.moment.Variance(false);
        double[] doubleArray69 = new double[] { (byte) -1, (short) 100, 'a', 0, 1, (-1.0d) };
        double double70 = variance62.evaluate(doubleArray69);
        long long71 = variance62.getN();
        variance62.increment(874596.4092824734d);
        org.apache.commons.math.stat.descriptive.moment.Variance variance75 = new org.apache.commons.math.stat.descriptive.moment.Variance(false);
        variance75.clear();
        double double77 = variance75.getResult();
        double[] doubleArray82 = new double[] { (-1), 2168.222222222222d, 16.566666666418314d, 10.0d };
        variance75.incrementAll(doubleArray82);
        variance62.incrementAll(doubleArray82, 0, (int) (byte) 1);
        // The following exception was thrown during execution in test generation
        try {
            variance1.incrementAll(doubleArray82, (int) '#', (int) (short) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: begin + length > values.length");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(doubleArray10);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray10), "[-1.0, 100.0, 97.0, 0.0, 1.0, -1.0]");
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 2168.222222222222d + "'", double11 == 2168.222222222222d);
        org.junit.Assert.assertNotNull(doubleArray22);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray22), "[-1.0, 100.0, 97.0, 0.0, 1.0, -1.0]");
        org.junit.Assert.assertTrue("'" + double23 + "' != '" + 2168.222222222222d + "'", double23 == 2168.222222222222d);
        org.junit.Assert.assertNotNull(doubleArray34);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray34), "[-1.0, 100.0, 97.0, 0.0, 1.0, -1.0]");
        org.junit.Assert.assertTrue("'" + double35 + "' != '" + 2168.222222222222d + "'", double35 == 2168.222222222222d);
        org.junit.Assert.assertTrue("'" + boolean38 + "' != '" + true + "'", boolean38 == true);
        org.junit.Assert.assertNotNull(doubleArray45);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray45), "[0.0, 1.0, 1.0, 0.0, -1.0, 10.0]");
        org.junit.Assert.assertTrue("'" + double46 + "' != '" + 16.566666666666663d + "'", double46 == 16.566666666666663d);
        org.junit.Assert.assertTrue(Double.isNaN(double49));
        org.junit.Assert.assertTrue("'" + double53 + "' != '" + 13.805555555555552d + "'", double53 == 13.805555555555552d);
        org.junit.Assert.assertTrue(Double.isNaN(double54));
        org.junit.Assert.assertNotNull(doubleArray69);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray69), "[-1.0, 100.0, 97.0, 0.0, 1.0, -1.0]");
        org.junit.Assert.assertTrue("'" + double70 + "' != '" + 2168.222222222222d + "'", double70 == 2168.222222222222d);
        org.junit.Assert.assertTrue("'" + long71 + "' != '" + 0L + "'", long71 == 0L);
        org.junit.Assert.assertTrue(Double.isNaN(double77));
        org.junit.Assert.assertNotNull(doubleArray82);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray82), "[-1.0, 2168.222222222222, 16.566666666418314, 10.0]");
    }

    @Test
    public void test1513() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1513");
        org.apache.commons.math.stat.descriptive.moment.Variance variance1 = new org.apache.commons.math.stat.descriptive.moment.Variance(false);
        double[] doubleArray8 = new double[] { (byte) -1, (short) 100, 'a', 0, 1, (-1.0d) };
        double double9 = variance1.evaluate(doubleArray8);
        variance1.setBiasCorrected(true);
        org.apache.commons.math.stat.descriptive.moment.Variance variance13 = new org.apache.commons.math.stat.descriptive.moment.Variance(false);
        variance13.clear();
        double double15 = variance13.getResult();
        double[] doubleArray20 = new double[] { (-1), 2168.222222222222d, 16.566666666418314d, 10.0d };
        variance13.incrementAll(doubleArray20);
        variance1.incrementAll(doubleArray20);
        variance1.clear();
        long long24 = variance1.getN();
        org.apache.commons.math.stat.descriptive.moment.Variance variance26 = new org.apache.commons.math.stat.descriptive.moment.Variance(false);
        double[] doubleArray33 = new double[] { (byte) -1, (short) 100, 'a', 0, 1, (-1.0d) };
        double double34 = variance26.evaluate(doubleArray33);
        variance26.setBiasCorrected(true);
        variance26.increment((double) (byte) 0);
        double[] doubleArray41 = new double[] { 'a', 100L };
        double double43 = variance26.evaluate(doubleArray41, 0.0d);
        double double44 = variance26.getResult();
        org.apache.commons.math.stat.descriptive.moment.Variance variance46 = new org.apache.commons.math.stat.descriptive.moment.Variance(false);
        variance46.clear();
        double double48 = variance46.getResult();
        double[] doubleArray53 = new double[] { (-1), 2168.222222222222d, 16.566666666418314d, 10.0d };
        variance46.incrementAll(doubleArray53);
        variance26.incrementAll(doubleArray53, (int) (short) 1, 1);
        variance1.incrementAll(doubleArray53);
        org.junit.Assert.assertNotNull(doubleArray8);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray8), "[-1.0, 100.0, 97.0, 0.0, 1.0, -1.0]");
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 2168.222222222222d + "'", double9 == 2168.222222222222d);
        org.junit.Assert.assertTrue(Double.isNaN(double15));
        org.junit.Assert.assertNotNull(doubleArray20);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray20), "[-1.0, 2168.222222222222, 16.566666666418314, 10.0]");
        org.junit.Assert.assertTrue("'" + long24 + "' != '" + 0L + "'", long24 == 0L);
        org.junit.Assert.assertNotNull(doubleArray33);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray33), "[-1.0, 100.0, 97.0, 0.0, 1.0, -1.0]");
        org.junit.Assert.assertTrue("'" + double34 + "' != '" + 2168.222222222222d + "'", double34 == 2168.222222222222d);
        org.junit.Assert.assertNotNull(doubleArray41);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray41), "[97.0, 100.0]");
        org.junit.Assert.assertTrue("'" + double43 + "' != '" + 4.5d + "'", double43 == 4.5d);
        org.junit.Assert.assertTrue("'" + double44 + "' != '" + 0.0d + "'", double44 == 0.0d);
        org.junit.Assert.assertTrue(Double.isNaN(double48));
        org.junit.Assert.assertNotNull(doubleArray53);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray53), "[-1.0, 2168.222222222222, 16.566666666418314, 10.0]");
    }

    @Test
    public void test1514() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1514");
        org.apache.commons.math.stat.descriptive.moment.Variance variance1 = new org.apache.commons.math.stat.descriptive.moment.Variance(false);
        double[] doubleArray8 = new double[] { (byte) -1, (short) 100, 'a', 0, 1, (-1.0d) };
        double double9 = variance1.evaluate(doubleArray8);
        variance1.setBiasCorrected(true);
        boolean boolean12 = variance1.isBiasCorrected();
        org.apache.commons.math.stat.descriptive.moment.Variance variance14 = new org.apache.commons.math.stat.descriptive.moment.Variance(false);
        double[] doubleArray21 = new double[] { (byte) -1, (short) 100, 'a', 0, 1, (-1.0d) };
        double double22 = variance14.evaluate(doubleArray21);
        variance14.setBiasCorrected(true);
        org.apache.commons.math.stat.descriptive.moment.Variance variance26 = new org.apache.commons.math.stat.descriptive.moment.Variance(false);
        double[] doubleArray33 = new double[] { (byte) -1, (short) 100, 'a', 0, 1, (-1.0d) };
        double double34 = variance26.evaluate(doubleArray33);
        variance26.setBiasCorrected(true);
        boolean boolean37 = variance26.isBiasCorrected();
        double[] doubleArray44 = new double[] { (short) 0, 1.0d, 1L, 0.0d, (-1.0d), 10L };
        double double45 = variance26.evaluate(doubleArray44);
        double double48 = variance14.evaluate(doubleArray44, (int) (byte) 1, (int) (byte) 0);
        double double51 = variance1.evaluate(doubleArray44, (int) (byte) 1, 0);
        org.apache.commons.math.stat.descriptive.moment.Variance variance53 = new org.apache.commons.math.stat.descriptive.moment.Variance(false);
        double[] doubleArray60 = new double[] { (byte) -1, (short) 100, 'a', 0, 1, (-1.0d) };
        double double61 = variance53.evaluate(doubleArray60);
        variance53.clear();
        variance53.setBiasCorrected(true);
        boolean boolean65 = variance1.equals((java.lang.Object) variance53);
        boolean boolean66 = variance53.isBiasCorrected();
        variance53.clear();
        org.apache.commons.math.stat.descriptive.moment.Variance variance69 = new org.apache.commons.math.stat.descriptive.moment.Variance(false);
        double[] doubleArray76 = new double[] { (byte) -1, (short) 100, 'a', 0, 1, (-1.0d) };
        double double77 = variance69.evaluate(doubleArray76);
        // The following exception was thrown during execution in test generation
        try {
            double double80 = variance53.evaluate(doubleArray76, (int) '4', (int) ' ');
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: begin + length > values.length");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(doubleArray8);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray8), "[-1.0, 100.0, 97.0, 0.0, 1.0, -1.0]");
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 2168.222222222222d + "'", double9 == 2168.222222222222d);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertNotNull(doubleArray21);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray21), "[-1.0, 100.0, 97.0, 0.0, 1.0, -1.0]");
        org.junit.Assert.assertTrue("'" + double22 + "' != '" + 2168.222222222222d + "'", double22 == 2168.222222222222d);
        org.junit.Assert.assertNotNull(doubleArray33);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray33), "[-1.0, 100.0, 97.0, 0.0, 1.0, -1.0]");
        org.junit.Assert.assertTrue("'" + double34 + "' != '" + 2168.222222222222d + "'", double34 == 2168.222222222222d);
        org.junit.Assert.assertTrue("'" + boolean37 + "' != '" + true + "'", boolean37 == true);
        org.junit.Assert.assertNotNull(doubleArray44);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray44), "[0.0, 1.0, 1.0, 0.0, -1.0, 10.0]");
        org.junit.Assert.assertTrue("'" + double45 + "' != '" + 16.566666666666663d + "'", double45 == 16.566666666666663d);
        org.junit.Assert.assertTrue(Double.isNaN(double48));
        org.junit.Assert.assertTrue(Double.isNaN(double51));
        org.junit.Assert.assertNotNull(doubleArray60);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray60), "[-1.0, 100.0, 97.0, 0.0, 1.0, -1.0]");
        org.junit.Assert.assertTrue("'" + double61 + "' != '" + 2168.222222222222d + "'", double61 == 2168.222222222222d);
        org.junit.Assert.assertTrue("'" + boolean65 + "' != '" + true + "'", boolean65 == true);
        org.junit.Assert.assertTrue("'" + boolean66 + "' != '" + true + "'", boolean66 == true);
        org.junit.Assert.assertNotNull(doubleArray76);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray76), "[-1.0, 100.0, 97.0, 0.0, 1.0, -1.0]");
        org.junit.Assert.assertTrue("'" + double77 + "' != '" + 2168.222222222222d + "'", double77 == 2168.222222222222d);
    }

    @Test
    public void test1515() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1515");
        org.apache.commons.math.stat.descriptive.moment.Variance variance1 = new org.apache.commons.math.stat.descriptive.moment.Variance(false);
        variance1.clear();
        long long3 = variance1.getN();
        double double4 = variance1.getResult();
        double double5 = variance1.getResult();
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 0L + "'", long3 == 0L);
        org.junit.Assert.assertTrue(Double.isNaN(double4));
        org.junit.Assert.assertTrue(Double.isNaN(double5));
    }

    @Test
    public void test1516() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1516");
        org.apache.commons.math.stat.descriptive.moment.SecondMoment secondMoment1 = null;
        org.apache.commons.math.stat.descriptive.moment.Variance variance2 = new org.apache.commons.math.stat.descriptive.moment.Variance(false, secondMoment1);
        variance2.setBiasCorrected(true);
        variance2.clear();
        // The following exception was thrown during execution in test generation
        try {
            long long6 = variance2.getN();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test1517() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1517");
        org.apache.commons.math.stat.descriptive.moment.Variance variance0 = new org.apache.commons.math.stat.descriptive.moment.Variance();
        long long1 = variance0.getN();
        org.apache.commons.math.stat.descriptive.moment.Variance variance3 = new org.apache.commons.math.stat.descriptive.moment.Variance(false);
        double[] doubleArray10 = new double[] { (byte) -1, (short) 100, 'a', 0, 1, (-1.0d) };
        double double11 = variance3.evaluate(doubleArray10);
        variance3.setBiasCorrected(true);
        boolean boolean14 = variance3.isBiasCorrected();
        double[] doubleArray21 = new double[] { (short) 0, 1.0d, 1L, 0.0d, (-1.0d), 10L };
        double double22 = variance3.evaluate(doubleArray21);
        boolean boolean24 = variance3.equals((java.lang.Object) 10.0d);
        boolean boolean25 = variance3.isBiasCorrected();
        org.apache.commons.math.stat.descriptive.moment.Variance variance27 = new org.apache.commons.math.stat.descriptive.moment.Variance(false);
        boolean boolean28 = variance3.equals((java.lang.Object) false);
        org.apache.commons.math.stat.descriptive.moment.Variance variance30 = new org.apache.commons.math.stat.descriptive.moment.Variance(false);
        double[] doubleArray37 = new double[] { (byte) -1, (short) 100, 'a', 0, 1, (-1.0d) };
        double double38 = variance30.evaluate(doubleArray37);
        variance30.setBiasCorrected(true);
        org.apache.commons.math.stat.descriptive.moment.Variance variance42 = new org.apache.commons.math.stat.descriptive.moment.Variance(false);
        double[] doubleArray49 = new double[] { (byte) -1, (short) 100, 'a', 0, 1, (-1.0d) };
        double double50 = variance42.evaluate(doubleArray49);
        variance30.incrementAll(doubleArray49);
        double double53 = variance3.evaluate(doubleArray49, (double) 100.0f);
        variance0.incrementAll(doubleArray49, (int) (short) 1, (int) (byte) 0);
        variance0.clear();
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 0L + "'", long1 == 0L);
        org.junit.Assert.assertNotNull(doubleArray10);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray10), "[-1.0, 100.0, 97.0, 0.0, 1.0, -1.0]");
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 2168.222222222222d + "'", double11 == 2168.222222222222d);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertNotNull(doubleArray21);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray21), "[0.0, 1.0, 1.0, 0.0, -1.0, 10.0]");
        org.junit.Assert.assertTrue("'" + double22 + "' != '" + 16.566666666666663d + "'", double22 == 16.566666666666663d);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + true + "'", boolean25 == true);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + false + "'", boolean28 == false);
        org.junit.Assert.assertNotNull(doubleArray37);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray37), "[-1.0, 100.0, 97.0, 0.0, 1.0, -1.0]");
        org.junit.Assert.assertTrue("'" + double38 + "' != '" + 2168.222222222222d + "'", double38 == 2168.222222222222d);
        org.junit.Assert.assertNotNull(doubleArray49);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray49), "[-1.0, 100.0, 97.0, 0.0, 1.0, -1.0]");
        org.junit.Assert.assertTrue("'" + double50 + "' != '" + 2168.222222222222d + "'", double50 == 2168.222222222222d);
        org.junit.Assert.assertTrue("'" + double53 + "' != '" + 2601.8666666666663d + "'", double53 == 2601.8666666666663d);
    }

    @Test
    public void test1518() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1518");
        org.apache.commons.math.stat.descriptive.moment.Variance variance1 = new org.apache.commons.math.stat.descriptive.moment.Variance(false);
        double[] doubleArray8 = new double[] { (byte) -1, (short) 100, 'a', 0, 1, (-1.0d) };
        double double9 = variance1.evaluate(doubleArray8);
        variance1.setBiasCorrected(true);
        boolean boolean12 = variance1.isBiasCorrected();
        double[] doubleArray19 = new double[] { (short) 0, 1.0d, 1L, 0.0d, (-1.0d), 10L };
        double double20 = variance1.evaluate(doubleArray19);
        double double21 = variance1.getResult();
        long long22 = variance1.getN();
        java.lang.Object obj23 = null;
        boolean boolean24 = variance1.equals(obj23);
        long long25 = variance1.getN();
        org.apache.commons.math.stat.descriptive.moment.Variance variance27 = new org.apache.commons.math.stat.descriptive.moment.Variance(false);
        double[] doubleArray34 = new double[] { (byte) -1, (short) 100, 'a', 0, 1, (-1.0d) };
        double double35 = variance27.evaluate(doubleArray34);
        variance27.setBiasCorrected(true);
        boolean boolean38 = variance27.isBiasCorrected();
        double[] doubleArray45 = new double[] { (short) 0, 1.0d, 1L, 0.0d, (-1.0d), 10L };
        double double46 = variance27.evaluate(doubleArray45);
        double double47 = variance27.getResult();
        variance27.setBiasCorrected(true);
        long long50 = variance27.getN();
        variance27.setBiasCorrected(true);
        boolean boolean53 = variance1.equals((java.lang.Object) variance27);
        boolean boolean54 = variance1.isBiasCorrected();
        double double55 = variance1.getResult();
        org.junit.Assert.assertNotNull(doubleArray8);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray8), "[-1.0, 100.0, 97.0, 0.0, 1.0, -1.0]");
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 2168.222222222222d + "'", double9 == 2168.222222222222d);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertNotNull(doubleArray19);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray19), "[0.0, 1.0, 1.0, 0.0, -1.0, 10.0]");
        org.junit.Assert.assertTrue("'" + double20 + "' != '" + 16.566666666666663d + "'", double20 == 16.566666666666663d);
        org.junit.Assert.assertTrue(Double.isNaN(double21));
        org.junit.Assert.assertTrue("'" + long22 + "' != '" + 0L + "'", long22 == 0L);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertTrue("'" + long25 + "' != '" + 0L + "'", long25 == 0L);
        org.junit.Assert.assertNotNull(doubleArray34);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray34), "[-1.0, 100.0, 97.0, 0.0, 1.0, -1.0]");
        org.junit.Assert.assertTrue("'" + double35 + "' != '" + 2168.222222222222d + "'", double35 == 2168.222222222222d);
        org.junit.Assert.assertTrue("'" + boolean38 + "' != '" + true + "'", boolean38 == true);
        org.junit.Assert.assertNotNull(doubleArray45);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray45), "[0.0, 1.0, 1.0, 0.0, -1.0, 10.0]");
        org.junit.Assert.assertTrue("'" + double46 + "' != '" + 16.566666666666663d + "'", double46 == 16.566666666666663d);
        org.junit.Assert.assertTrue(Double.isNaN(double47));
        org.junit.Assert.assertTrue("'" + long50 + "' != '" + 0L + "'", long50 == 0L);
        org.junit.Assert.assertTrue("'" + boolean53 + "' != '" + true + "'", boolean53 == true);
        org.junit.Assert.assertTrue("'" + boolean54 + "' != '" + true + "'", boolean54 == true);
        org.junit.Assert.assertTrue(Double.isNaN(double55));
    }

    @Test
    public void test1519() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1519");
        org.apache.commons.math.stat.descriptive.moment.SecondMoment secondMoment1 = null;
        org.apache.commons.math.stat.descriptive.moment.Variance variance2 = new org.apache.commons.math.stat.descriptive.moment.Variance(true, secondMoment1);
        double[] doubleArray3 = new double[] {};
        double double6 = variance2.evaluate(doubleArray3, 0, 0);
        variance2.setBiasCorrected(true);
        variance2.clear();
        variance2.setBiasCorrected(false);
        org.apache.commons.math.stat.descriptive.moment.Variance variance13 = new org.apache.commons.math.stat.descriptive.moment.Variance(false);
        variance13.clear();
        boolean boolean15 = variance13.isBiasCorrected();
        boolean boolean17 = variance13.equals((java.lang.Object) 1166128.5457099646d);
        org.apache.commons.math.stat.descriptive.moment.Variance variance19 = new org.apache.commons.math.stat.descriptive.moment.Variance(false);
        double[] doubleArray26 = new double[] { (byte) -1, (short) 100, 'a', 0, 1, (-1.0d) };
        double double27 = variance19.evaluate(doubleArray26);
        org.apache.commons.math.stat.descriptive.moment.Variance variance29 = new org.apache.commons.math.stat.descriptive.moment.Variance(false);
        double[] doubleArray36 = new double[] { (byte) -1, (short) 100, 'a', 0, 1, (-1.0d) };
        double double37 = variance29.evaluate(doubleArray36);
        variance29.setBiasCorrected(true);
        boolean boolean40 = variance29.isBiasCorrected();
        double[] doubleArray47 = new double[] { (short) 0, 1.0d, 1L, 0.0d, (-1.0d), 10L };
        double double48 = variance29.evaluate(doubleArray47);
        org.apache.commons.math.stat.descriptive.moment.Variance variance50 = new org.apache.commons.math.stat.descriptive.moment.Variance(false);
        double[] doubleArray57 = new double[] { (byte) -1, (short) 100, 'a', 0, 1, (-1.0d) };
        double double58 = variance50.evaluate(doubleArray57);
        variance50.setBiasCorrected(true);
        boolean boolean61 = variance50.isBiasCorrected();
        double[] doubleArray68 = new double[] { (short) 0, 1.0d, 1L, 0.0d, (-1.0d), 10L };
        double double69 = variance50.evaluate(doubleArray68);
        double double72 = variance29.evaluate(doubleArray68, (int) (byte) 1, 0);
        variance29.setBiasCorrected(true);
        boolean boolean75 = variance19.equals((java.lang.Object) true);
        org.apache.commons.math.stat.descriptive.moment.Variance variance77 = new org.apache.commons.math.stat.descriptive.moment.Variance(false);
        double[] doubleArray84 = new double[] { (byte) -1, (short) 100, 'a', 0, 1, (-1.0d) };
        double double85 = variance77.evaluate(doubleArray84);
        double double87 = variance19.evaluate(doubleArray84, 874596.4092824734d);
        double double89 = variance13.evaluate(doubleArray84, (double) 100L);
        // The following exception was thrown during execution in test generation
        try {
            double double92 = variance2.evaluate(doubleArray84, (int) (short) -1, 0);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: start position cannot be negative");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(doubleArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray3), "[]");
        org.junit.Assert.assertTrue(Double.isNaN(double6));
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertNotNull(doubleArray26);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray26), "[-1.0, 100.0, 97.0, 0.0, 1.0, -1.0]");
        org.junit.Assert.assertTrue("'" + double27 + "' != '" + 2168.222222222222d + "'", double27 == 2168.222222222222d);
        org.junit.Assert.assertNotNull(doubleArray36);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray36), "[-1.0, 100.0, 97.0, 0.0, 1.0, -1.0]");
        org.junit.Assert.assertTrue("'" + double37 + "' != '" + 2168.222222222222d + "'", double37 == 2168.222222222222d);
        org.junit.Assert.assertTrue("'" + boolean40 + "' != '" + true + "'", boolean40 == true);
        org.junit.Assert.assertNotNull(doubleArray47);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray47), "[0.0, 1.0, 1.0, 0.0, -1.0, 10.0]");
        org.junit.Assert.assertTrue("'" + double48 + "' != '" + 16.566666666666663d + "'", double48 == 16.566666666666663d);
        org.junit.Assert.assertNotNull(doubleArray57);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray57), "[-1.0, 100.0, 97.0, 0.0, 1.0, -1.0]");
        org.junit.Assert.assertTrue("'" + double58 + "' != '" + 2168.222222222222d + "'", double58 == 2168.222222222222d);
        org.junit.Assert.assertTrue("'" + boolean61 + "' != '" + true + "'", boolean61 == true);
        org.junit.Assert.assertNotNull(doubleArray68);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray68), "[0.0, 1.0, 1.0, 0.0, -1.0, 10.0]");
        org.junit.Assert.assertTrue("'" + double69 + "' != '" + 16.566666666666663d + "'", double69 == 16.566666666666663d);
        org.junit.Assert.assertTrue(Double.isNaN(double72));
        org.junit.Assert.assertTrue("'" + boolean75 + "' != '" + false + "'", boolean75 == false);
        org.junit.Assert.assertNotNull(doubleArray84);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray84), "[-1.0, 100.0, 97.0, 0.0, 1.0, -1.0]");
        org.junit.Assert.assertTrue("'" + double85 + "' != '" + 2168.222222222222d + "'", double85 == 2168.222222222222d);
        org.junit.Assert.assertTrue("'" + double87 + "' != '" + 2168.2220052083335d + "'", double87 == 2168.2220052083335d);
        org.junit.Assert.assertTrue("'" + double89 + "' != '" + 2168.222222222222d + "'", double89 == 2168.222222222222d);
    }

    @Test
    public void test1520() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1520");
        org.apache.commons.math.stat.descriptive.moment.Variance variance1 = new org.apache.commons.math.stat.descriptive.moment.Variance(false);
        double[] doubleArray8 = new double[] { (byte) -1, (short) 100, 'a', 0, 1, (-1.0d) };
        double double9 = variance1.evaluate(doubleArray8);
        long long10 = variance1.getN();
        org.apache.commons.math.stat.descriptive.moment.Variance variance12 = new org.apache.commons.math.stat.descriptive.moment.Variance(false);
        double[] doubleArray19 = new double[] { (byte) -1, (short) 100, 'a', 0, 1, (-1.0d) };
        double double20 = variance12.evaluate(doubleArray19);
        variance12.setBiasCorrected(true);
        boolean boolean23 = variance12.isBiasCorrected();
        double[] doubleArray30 = new double[] { (short) 0, 1.0d, 1L, 0.0d, (-1.0d), 10L };
        double double31 = variance12.evaluate(doubleArray30);
        org.apache.commons.math.stat.descriptive.moment.Variance variance33 = new org.apache.commons.math.stat.descriptive.moment.Variance(false);
        double[] doubleArray40 = new double[] { (byte) -1, (short) 100, 'a', 0, 1, (-1.0d) };
        double double41 = variance33.evaluate(doubleArray40);
        variance33.setBiasCorrected(true);
        boolean boolean44 = variance33.isBiasCorrected();
        double[] doubleArray51 = new double[] { (short) 0, 1.0d, 1L, 0.0d, (-1.0d), 10L };
        double double52 = variance33.evaluate(doubleArray51);
        double double55 = variance12.evaluate(doubleArray51, (int) (byte) 1, 0);
        variance12.setBiasCorrected(true);
        variance12.setBiasCorrected(true);
        double double60 = variance12.getResult();
        boolean boolean61 = variance12.isBiasCorrected();
        boolean boolean62 = variance12.isBiasCorrected();
        org.apache.commons.math.stat.descriptive.moment.Variance variance64 = new org.apache.commons.math.stat.descriptive.moment.Variance(false);
        double[] doubleArray71 = new double[] { (byte) -1, (short) 100, 'a', 0, 1, (-1.0d) };
        double double72 = variance64.evaluate(doubleArray71);
        variance64.setBiasCorrected(true);
        boolean boolean75 = variance64.isBiasCorrected();
        double[] doubleArray82 = new double[] { (short) 0, 1.0d, 1L, 0.0d, (-1.0d), 10L };
        double double83 = variance64.evaluate(doubleArray82);
        double double84 = variance12.evaluate(doubleArray82);
        double double86 = variance1.evaluate(doubleArray82, 16.56666666666667d);
        long long87 = variance1.getN();
        boolean boolean89 = variance1.equals((java.lang.Object) 1175056.0d);
        double double90 = variance1.getResult();
        org.junit.Assert.assertNotNull(doubleArray8);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray8), "[-1.0, 100.0, 97.0, 0.0, 1.0, -1.0]");
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 2168.222222222222d + "'", double9 == 2168.222222222222d);
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + 0L + "'", long10 == 0L);
        org.junit.Assert.assertNotNull(doubleArray19);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray19), "[-1.0, 100.0, 97.0, 0.0, 1.0, -1.0]");
        org.junit.Assert.assertTrue("'" + double20 + "' != '" + 2168.222222222222d + "'", double20 == 2168.222222222222d);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + true + "'", boolean23 == true);
        org.junit.Assert.assertNotNull(doubleArray30);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray30), "[0.0, 1.0, 1.0, 0.0, -1.0, 10.0]");
        org.junit.Assert.assertTrue("'" + double31 + "' != '" + 16.566666666666663d + "'", double31 == 16.566666666666663d);
        org.junit.Assert.assertNotNull(doubleArray40);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray40), "[-1.0, 100.0, 97.0, 0.0, 1.0, -1.0]");
        org.junit.Assert.assertTrue("'" + double41 + "' != '" + 2168.222222222222d + "'", double41 == 2168.222222222222d);
        org.junit.Assert.assertTrue("'" + boolean44 + "' != '" + true + "'", boolean44 == true);
        org.junit.Assert.assertNotNull(doubleArray51);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray51), "[0.0, 1.0, 1.0, 0.0, -1.0, 10.0]");
        org.junit.Assert.assertTrue("'" + double52 + "' != '" + 16.566666666666663d + "'", double52 == 16.566666666666663d);
        org.junit.Assert.assertTrue(Double.isNaN(double55));
        org.junit.Assert.assertTrue(Double.isNaN(double60));
        org.junit.Assert.assertTrue("'" + boolean61 + "' != '" + true + "'", boolean61 == true);
        org.junit.Assert.assertTrue("'" + boolean62 + "' != '" + true + "'", boolean62 == true);
        org.junit.Assert.assertNotNull(doubleArray71);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray71), "[-1.0, 100.0, 97.0, 0.0, 1.0, -1.0]");
        org.junit.Assert.assertTrue("'" + double72 + "' != '" + 2168.222222222222d + "'", double72 == 2168.222222222222d);
        org.junit.Assert.assertTrue("'" + boolean75 + "' != '" + true + "'", boolean75 == true);
        org.junit.Assert.assertNotNull(doubleArray82);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray82), "[0.0, 1.0, 1.0, 0.0, -1.0, 10.0]");
        org.junit.Assert.assertTrue("'" + double83 + "' != '" + 16.566666666666663d + "'", double83 == 16.566666666666663d);
        org.junit.Assert.assertTrue("'" + double84 + "' != '" + 16.566666666666663d + "'", double84 == 16.566666666666663d);
        org.junit.Assert.assertTrue("'" + double86 + "' != '" + 13.80555555555562d + "'", double86 == 13.80555555555562d);
        org.junit.Assert.assertTrue("'" + long87 + "' != '" + 0L + "'", long87 == 0L);
        org.junit.Assert.assertTrue("'" + boolean89 + "' != '" + false + "'", boolean89 == false);
        org.junit.Assert.assertTrue(Double.isNaN(double90));
    }

    @Test
    public void test1521() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1521");
        org.apache.commons.math.stat.descriptive.moment.Variance variance1 = new org.apache.commons.math.stat.descriptive.moment.Variance(false);
        double[] doubleArray8 = new double[] { (byte) -1, (short) 100, 'a', 0, 1, (-1.0d) };
        double double9 = variance1.evaluate(doubleArray8);
        variance1.setBiasCorrected(true);
        boolean boolean12 = variance1.isBiasCorrected();
        double[] doubleArray19 = new double[] { (short) 0, 1.0d, 1L, 0.0d, (-1.0d), 10L };
        double double20 = variance1.evaluate(doubleArray19);
        boolean boolean22 = variance1.equals((java.lang.Object) 10.0d);
        boolean boolean23 = variance1.isBiasCorrected();
        org.apache.commons.math.stat.descriptive.moment.Variance variance25 = new org.apache.commons.math.stat.descriptive.moment.Variance(false);
        boolean boolean26 = variance1.equals((java.lang.Object) false);
        org.apache.commons.math.stat.descriptive.moment.Variance variance28 = new org.apache.commons.math.stat.descriptive.moment.Variance(false);
        double[] doubleArray35 = new double[] { (byte) -1, (short) 100, 'a', 0, 1, (-1.0d) };
        double double36 = variance28.evaluate(doubleArray35);
        variance28.setBiasCorrected(true);
        org.apache.commons.math.stat.descriptive.moment.Variance variance40 = new org.apache.commons.math.stat.descriptive.moment.Variance(false);
        double[] doubleArray47 = new double[] { (byte) -1, (short) 100, 'a', 0, 1, (-1.0d) };
        double double48 = variance40.evaluate(doubleArray47);
        variance28.incrementAll(doubleArray47);
        double double51 = variance1.evaluate(doubleArray47, (double) 100.0f);
        variance1.clear();
        variance1.setBiasCorrected(false);
        variance1.clear();
        org.junit.Assert.assertNotNull(doubleArray8);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray8), "[-1.0, 100.0, 97.0, 0.0, 1.0, -1.0]");
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 2168.222222222222d + "'", double9 == 2168.222222222222d);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertNotNull(doubleArray19);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray19), "[0.0, 1.0, 1.0, 0.0, -1.0, 10.0]");
        org.junit.Assert.assertTrue("'" + double20 + "' != '" + 16.566666666666663d + "'", double20 == 16.566666666666663d);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + true + "'", boolean23 == true);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
        org.junit.Assert.assertNotNull(doubleArray35);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray35), "[-1.0, 100.0, 97.0, 0.0, 1.0, -1.0]");
        org.junit.Assert.assertTrue("'" + double36 + "' != '" + 2168.222222222222d + "'", double36 == 2168.222222222222d);
        org.junit.Assert.assertNotNull(doubleArray47);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray47), "[-1.0, 100.0, 97.0, 0.0, 1.0, -1.0]");
        org.junit.Assert.assertTrue("'" + double48 + "' != '" + 2168.222222222222d + "'", double48 == 2168.222222222222d);
        org.junit.Assert.assertTrue("'" + double51 + "' != '" + 2601.8666666666663d + "'", double51 == 2601.8666666666663d);
    }

    @Test
    public void test1522() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1522");
        org.apache.commons.math.stat.descriptive.moment.Variance variance1 = new org.apache.commons.math.stat.descriptive.moment.Variance(false);
        double[] doubleArray8 = new double[] { (byte) -1, (short) 100, 'a', 0, 1, (-1.0d) };
        double double9 = variance1.evaluate(doubleArray8);
        variance1.setBiasCorrected(true);
        long long12 = variance1.getN();
        long long13 = variance1.getN();
        boolean boolean15 = variance1.equals((java.lang.Object) 16.566666666666663d);
        boolean boolean17 = variance1.equals((java.lang.Object) (short) 10);
        org.apache.commons.math.stat.descriptive.moment.Variance variance19 = new org.apache.commons.math.stat.descriptive.moment.Variance(false);
        double[] doubleArray26 = new double[] { (byte) -1, (short) 100, 'a', 0, 1, (-1.0d) };
        double double27 = variance19.evaluate(doubleArray26);
        variance19.setBiasCorrected(true);
        org.apache.commons.math.stat.descriptive.moment.Variance variance31 = new org.apache.commons.math.stat.descriptive.moment.Variance(false);
        double[] doubleArray38 = new double[] { (byte) -1, (short) 100, 'a', 0, 1, (-1.0d) };
        double double39 = variance31.evaluate(doubleArray38);
        variance31.setBiasCorrected(true);
        boolean boolean42 = variance31.isBiasCorrected();
        double[] doubleArray49 = new double[] { (short) 0, 1.0d, 1L, 0.0d, (-1.0d), 10L };
        double double50 = variance31.evaluate(doubleArray49);
        org.apache.commons.math.stat.descriptive.moment.Variance variance52 = new org.apache.commons.math.stat.descriptive.moment.Variance(false);
        double[] doubleArray59 = new double[] { (byte) -1, (short) 100, 'a', 0, 1, (-1.0d) };
        double double60 = variance52.evaluate(doubleArray59);
        variance52.setBiasCorrected(true);
        boolean boolean63 = variance52.isBiasCorrected();
        double[] doubleArray70 = new double[] { (short) 0, 1.0d, 1L, 0.0d, (-1.0d), 10L };
        double double71 = variance52.evaluate(doubleArray70);
        double double74 = variance31.evaluate(doubleArray70, (int) (byte) 1, 0);
        double double76 = variance19.evaluate(doubleArray70, 2178.0d);
        double double77 = variance1.evaluate(doubleArray70);
        double double78 = variance1.getResult();
        boolean boolean79 = variance1.isBiasCorrected();
        java.lang.Class<?> wildcardClass80 = variance1.getClass();
        org.junit.Assert.assertNotNull(doubleArray8);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray8), "[-1.0, 100.0, 97.0, 0.0, 1.0, -1.0]");
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 2168.222222222222d + "'", double9 == 2168.222222222222d);
        org.junit.Assert.assertTrue("'" + long12 + "' != '" + 0L + "'", long12 == 0L);
        org.junit.Assert.assertTrue("'" + long13 + "' != '" + 0L + "'", long13 == 0L);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertNotNull(doubleArray26);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray26), "[-1.0, 100.0, 97.0, 0.0, 1.0, -1.0]");
        org.junit.Assert.assertTrue("'" + double27 + "' != '" + 2168.222222222222d + "'", double27 == 2168.222222222222d);
        org.junit.Assert.assertNotNull(doubleArray38);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray38), "[-1.0, 100.0, 97.0, 0.0, 1.0, -1.0]");
        org.junit.Assert.assertTrue("'" + double39 + "' != '" + 2168.222222222222d + "'", double39 == 2168.222222222222d);
        org.junit.Assert.assertTrue("'" + boolean42 + "' != '" + true + "'", boolean42 == true);
        org.junit.Assert.assertNotNull(doubleArray49);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray49), "[0.0, 1.0, 1.0, 0.0, -1.0, 10.0]");
        org.junit.Assert.assertTrue("'" + double50 + "' != '" + 16.566666666666663d + "'", double50 == 16.566666666666663d);
        org.junit.Assert.assertNotNull(doubleArray59);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray59), "[-1.0, 100.0, 97.0, 0.0, 1.0, -1.0]");
        org.junit.Assert.assertTrue("'" + double60 + "' != '" + 2168.222222222222d + "'", double60 == 2168.222222222222d);
        org.junit.Assert.assertTrue("'" + boolean63 + "' != '" + true + "'", boolean63 == true);
        org.junit.Assert.assertNotNull(doubleArray70);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray70), "[0.0, 1.0, 1.0, 0.0, -1.0, 10.0]");
        org.junit.Assert.assertTrue("'" + double71 + "' != '" + 16.566666666666663d + "'", double71 == 16.566666666666663d);
        org.junit.Assert.assertTrue(Double.isNaN(double74));
        org.junit.Assert.assertTrue("'" + double76 + "' != '" + 16.566666666418314d + "'", double76 == 16.566666666418314d);
        org.junit.Assert.assertTrue("'" + double77 + "' != '" + 16.566666666666663d + "'", double77 == 16.566666666666663d);
        org.junit.Assert.assertTrue(Double.isNaN(double78));
        org.junit.Assert.assertTrue("'" + boolean79 + "' != '" + true + "'", boolean79 == true);
        org.junit.Assert.assertNotNull(wildcardClass80);
    }

    @Test
    public void test1523() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1523");
        org.apache.commons.math.stat.descriptive.moment.Variance variance1 = new org.apache.commons.math.stat.descriptive.moment.Variance(false);
        variance1.clear();
        double double3 = variance1.getResult();
        double[] doubleArray8 = new double[] { (-1), 2168.222222222222d, 16.566666666418314d, 10.0d };
        variance1.incrementAll(doubleArray8);
        org.apache.commons.math.stat.descriptive.moment.Variance variance11 = new org.apache.commons.math.stat.descriptive.moment.Variance(false);
        double[] doubleArray18 = new double[] { (byte) -1, (short) 100, 'a', 0, 1, (-1.0d) };
        double double19 = variance11.evaluate(doubleArray18);
        variance11.setBiasCorrected(true);
        org.apache.commons.math.stat.descriptive.moment.Variance variance23 = new org.apache.commons.math.stat.descriptive.moment.Variance(false);
        double[] doubleArray30 = new double[] { (byte) -1, (short) 100, 'a', 0, 1, (-1.0d) };
        double double31 = variance23.evaluate(doubleArray30);
        variance11.incrementAll(doubleArray30);
        variance11.clear();
        org.apache.commons.math.stat.descriptive.moment.Variance variance35 = new org.apache.commons.math.stat.descriptive.moment.Variance(false);
        double[] doubleArray42 = new double[] { (byte) -1, (short) 100, 'a', 0, 1, (-1.0d) };
        double double43 = variance35.evaluate(doubleArray42);
        double[] doubleArray47 = new double[] { (byte) 1, (byte) 100, 1L };
        double double48 = variance35.evaluate(doubleArray47);
        variance11.incrementAll(doubleArray47, (int) (byte) 0, (int) (byte) 1);
        double double55 = variance1.evaluate(doubleArray47, (double) 'a', (int) (short) 1, (int) (short) 1);
        boolean boolean56 = variance1.isBiasCorrected();
        long long57 = variance1.getN();
        variance1.setBiasCorrected(false);
        java.lang.Class<?> wildcardClass60 = variance1.getClass();
        org.junit.Assert.assertTrue(Double.isNaN(double3));
        org.junit.Assert.assertNotNull(doubleArray8);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray8), "[-1.0, 2168.222222222222, 16.566666666418314, 10.0]");
        org.junit.Assert.assertNotNull(doubleArray18);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray18), "[-1.0, 100.0, 97.0, 0.0, 1.0, -1.0]");
        org.junit.Assert.assertTrue("'" + double19 + "' != '" + 2168.222222222222d + "'", double19 == 2168.222222222222d);
        org.junit.Assert.assertNotNull(doubleArray30);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray30), "[-1.0, 100.0, 97.0, 0.0, 1.0, -1.0]");
        org.junit.Assert.assertTrue("'" + double31 + "' != '" + 2168.222222222222d + "'", double31 == 2168.222222222222d);
        org.junit.Assert.assertNotNull(doubleArray42);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray42), "[-1.0, 100.0, 97.0, 0.0, 1.0, -1.0]");
        org.junit.Assert.assertTrue("'" + double43 + "' != '" + 2168.222222222222d + "'", double43 == 2168.222222222222d);
        org.junit.Assert.assertNotNull(doubleArray47);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray47), "[1.0, 100.0, 1.0]");
        org.junit.Assert.assertTrue("'" + double48 + "' != '" + 2178.0d + "'", double48 == 2178.0d);
        org.junit.Assert.assertTrue("'" + double55 + "' != '" + 0.0d + "'", double55 == 0.0d);
        org.junit.Assert.assertTrue("'" + boolean56 + "' != '" + false + "'", boolean56 == false);
        org.junit.Assert.assertTrue("'" + long57 + "' != '" + 4L + "'", long57 == 4L);
        org.junit.Assert.assertNotNull(wildcardClass60);
    }

    @Test
    public void test1524() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1524");
        org.apache.commons.math.stat.descriptive.moment.Variance variance1 = new org.apache.commons.math.stat.descriptive.moment.Variance(false);
        variance1.clear();
        double double3 = variance1.getResult();
        double double4 = variance1.getResult();
        variance1.setBiasCorrected(true);
        org.junit.Assert.assertTrue(Double.isNaN(double3));
        org.junit.Assert.assertTrue(Double.isNaN(double4));
    }

    @Test
    public void test1525() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1525");
        org.apache.commons.math.stat.descriptive.moment.Variance variance1 = new org.apache.commons.math.stat.descriptive.moment.Variance(false);
        variance1.clear();
        double double3 = variance1.getResult();
        org.apache.commons.math.stat.descriptive.moment.Variance variance5 = new org.apache.commons.math.stat.descriptive.moment.Variance(false);
        double[] doubleArray12 = new double[] { (byte) -1, (short) 100, 'a', 0, 1, (-1.0d) };
        double double13 = variance5.evaluate(doubleArray12);
        variance5.setBiasCorrected(true);
        boolean boolean16 = variance5.isBiasCorrected();
        double[] doubleArray23 = new double[] { (short) 0, 1.0d, 1L, 0.0d, (-1.0d), 10L };
        double double24 = variance5.evaluate(doubleArray23);
        double double25 = variance5.getResult();
        variance5.setBiasCorrected(true);
        org.apache.commons.math.stat.descriptive.moment.Variance variance29 = new org.apache.commons.math.stat.descriptive.moment.Variance(false);
        double[] doubleArray36 = new double[] { (byte) -1, (short) 100, 'a', 0, 1, (-1.0d) };
        double double37 = variance29.evaluate(doubleArray36);
        variance29.setBiasCorrected(true);
        org.apache.commons.math.stat.descriptive.moment.Variance variance41 = new org.apache.commons.math.stat.descriptive.moment.Variance(false);
        double[] doubleArray48 = new double[] { (byte) -1, (short) 100, 'a', 0, 1, (-1.0d) };
        double double49 = variance41.evaluate(doubleArray48);
        variance41.setBiasCorrected(true);
        boolean boolean52 = variance41.isBiasCorrected();
        double[] doubleArray59 = new double[] { (short) 0, 1.0d, 1L, 0.0d, (-1.0d), 10L };
        double double60 = variance41.evaluate(doubleArray59);
        org.apache.commons.math.stat.descriptive.moment.Variance variance62 = new org.apache.commons.math.stat.descriptive.moment.Variance(false);
        double[] doubleArray69 = new double[] { (byte) -1, (short) 100, 'a', 0, 1, (-1.0d) };
        double double70 = variance62.evaluate(doubleArray69);
        variance62.setBiasCorrected(true);
        boolean boolean73 = variance62.isBiasCorrected();
        double[] doubleArray80 = new double[] { (short) 0, 1.0d, 1L, 0.0d, (-1.0d), 10L };
        double double81 = variance62.evaluate(doubleArray80);
        double double84 = variance41.evaluate(doubleArray80, (int) (byte) 1, 0);
        double double86 = variance29.evaluate(doubleArray80, 2178.0d);
        boolean boolean87 = variance5.equals((java.lang.Object) doubleArray80);
        double double89 = variance1.evaluate(doubleArray80, (double) '#');
        long long90 = variance1.getN();
        boolean boolean91 = variance1.isBiasCorrected();
        variance1.setBiasCorrected(false);
        long long94 = variance1.getN();
        org.junit.Assert.assertTrue(Double.isNaN(double3));
        org.junit.Assert.assertNotNull(doubleArray12);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray12), "[-1.0, 100.0, 97.0, 0.0, 1.0, -1.0]");
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 2168.222222222222d + "'", double13 == 2168.222222222222d);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertNotNull(doubleArray23);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray23), "[0.0, 1.0, 1.0, 0.0, -1.0, 10.0]");
        org.junit.Assert.assertTrue("'" + double24 + "' != '" + 16.566666666666663d + "'", double24 == 16.566666666666663d);
        org.junit.Assert.assertTrue(Double.isNaN(double25));
        org.junit.Assert.assertNotNull(doubleArray36);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray36), "[-1.0, 100.0, 97.0, 0.0, 1.0, -1.0]");
        org.junit.Assert.assertTrue("'" + double37 + "' != '" + 2168.222222222222d + "'", double37 == 2168.222222222222d);
        org.junit.Assert.assertNotNull(doubleArray48);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray48), "[-1.0, 100.0, 97.0, 0.0, 1.0, -1.0]");
        org.junit.Assert.assertTrue("'" + double49 + "' != '" + 2168.222222222222d + "'", double49 == 2168.222222222222d);
        org.junit.Assert.assertTrue("'" + boolean52 + "' != '" + true + "'", boolean52 == true);
        org.junit.Assert.assertNotNull(doubleArray59);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray59), "[0.0, 1.0, 1.0, 0.0, -1.0, 10.0]");
        org.junit.Assert.assertTrue("'" + double60 + "' != '" + 16.566666666666663d + "'", double60 == 16.566666666666663d);
        org.junit.Assert.assertNotNull(doubleArray69);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray69), "[-1.0, 100.0, 97.0, 0.0, 1.0, -1.0]");
        org.junit.Assert.assertTrue("'" + double70 + "' != '" + 2168.222222222222d + "'", double70 == 2168.222222222222d);
        org.junit.Assert.assertTrue("'" + boolean73 + "' != '" + true + "'", boolean73 == true);
        org.junit.Assert.assertNotNull(doubleArray80);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray80), "[0.0, 1.0, 1.0, 0.0, -1.0, 10.0]");
        org.junit.Assert.assertTrue("'" + double81 + "' != '" + 16.566666666666663d + "'", double81 == 16.566666666666663d);
        org.junit.Assert.assertTrue(Double.isNaN(double84));
        org.junit.Assert.assertTrue("'" + double86 + "' != '" + 16.566666666418314d + "'", double86 == 16.566666666418314d);
        org.junit.Assert.assertTrue("'" + boolean87 + "' != '" + false + "'", boolean87 == false);
        org.junit.Assert.assertTrue("'" + double89 + "' != '" + 13.805555555555506d + "'", double89 == 13.805555555555506d);
        org.junit.Assert.assertTrue("'" + long90 + "' != '" + 0L + "'", long90 == 0L);
        org.junit.Assert.assertTrue("'" + boolean91 + "' != '" + false + "'", boolean91 == false);
        org.junit.Assert.assertTrue("'" + long94 + "' != '" + 0L + "'", long94 == 0L);
    }

    @Test
    public void test1526() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1526");
        org.apache.commons.math.stat.descriptive.moment.Variance variance1 = new org.apache.commons.math.stat.descriptive.moment.Variance(false);
        double[] doubleArray8 = new double[] { (byte) -1, (short) 100, 'a', 0, 1, (-1.0d) };
        double double9 = variance1.evaluate(doubleArray8);
        variance1.setBiasCorrected(true);
        org.apache.commons.math.stat.descriptive.moment.Variance variance13 = new org.apache.commons.math.stat.descriptive.moment.Variance(false);
        double[] doubleArray20 = new double[] { (byte) -1, (short) 100, 'a', 0, 1, (-1.0d) };
        double double21 = variance13.evaluate(doubleArray20);
        variance13.setBiasCorrected(true);
        boolean boolean24 = variance13.isBiasCorrected();
        double[] doubleArray31 = new double[] { (short) 0, 1.0d, 1L, 0.0d, (-1.0d), 10L };
        double double32 = variance13.evaluate(doubleArray31);
        double double35 = variance1.evaluate(doubleArray31, (int) (byte) 1, (int) (byte) 0);
        variance1.setBiasCorrected(true);
        variance1.setBiasCorrected(false);
        variance1.clear();
        boolean boolean41 = variance1.isBiasCorrected();
        variance1.clear();
        variance1.setBiasCorrected(true);
        boolean boolean45 = variance1.isBiasCorrected();
        org.junit.Assert.assertNotNull(doubleArray8);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray8), "[-1.0, 100.0, 97.0, 0.0, 1.0, -1.0]");
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 2168.222222222222d + "'", double9 == 2168.222222222222d);
        org.junit.Assert.assertNotNull(doubleArray20);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray20), "[-1.0, 100.0, 97.0, 0.0, 1.0, -1.0]");
        org.junit.Assert.assertTrue("'" + double21 + "' != '" + 2168.222222222222d + "'", double21 == 2168.222222222222d);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + true + "'", boolean24 == true);
        org.junit.Assert.assertNotNull(doubleArray31);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray31), "[0.0, 1.0, 1.0, 0.0, -1.0, 10.0]");
        org.junit.Assert.assertTrue("'" + double32 + "' != '" + 16.566666666666663d + "'", double32 == 16.566666666666663d);
        org.junit.Assert.assertTrue(Double.isNaN(double35));
        org.junit.Assert.assertTrue("'" + boolean41 + "' != '" + false + "'", boolean41 == false);
        org.junit.Assert.assertTrue("'" + boolean45 + "' != '" + true + "'", boolean45 == true);
    }

    @Test
    public void test1527() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1527");
        org.apache.commons.math.stat.descriptive.moment.Variance variance1 = new org.apache.commons.math.stat.descriptive.moment.Variance(false);
        double[] doubleArray8 = new double[] { (byte) -1, (short) 100, 'a', 0, 1, (-1.0d) };
        double double9 = variance1.evaluate(doubleArray8);
        double[] doubleArray13 = new double[] { (byte) 1, (byte) 100, 1L };
        double double14 = variance1.evaluate(doubleArray13);
        org.apache.commons.math.stat.descriptive.moment.Variance variance16 = new org.apache.commons.math.stat.descriptive.moment.Variance(false);
        double[] doubleArray23 = new double[] { (byte) -1, (short) 100, 'a', 0, 1, (-1.0d) };
        double double24 = variance16.evaluate(doubleArray23);
        variance16.setBiasCorrected(true);
        org.apache.commons.math.stat.descriptive.moment.Variance variance28 = new org.apache.commons.math.stat.descriptive.moment.Variance(false);
        double[] doubleArray35 = new double[] { (byte) -1, (short) 100, 'a', 0, 1, (-1.0d) };
        double double36 = variance28.evaluate(doubleArray35);
        variance16.incrementAll(doubleArray35);
        variance1.incrementAll(doubleArray35);
        long long39 = variance1.getN();
        boolean boolean40 = variance1.isBiasCorrected();
        org.junit.Assert.assertNotNull(doubleArray8);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray8), "[-1.0, 100.0, 97.0, 0.0, 1.0, -1.0]");
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 2168.222222222222d + "'", double9 == 2168.222222222222d);
        org.junit.Assert.assertNotNull(doubleArray13);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray13), "[1.0, 100.0, 1.0]");
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + 2178.0d + "'", double14 == 2178.0d);
        org.junit.Assert.assertNotNull(doubleArray23);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray23), "[-1.0, 100.0, 97.0, 0.0, 1.0, -1.0]");
        org.junit.Assert.assertTrue("'" + double24 + "' != '" + 2168.222222222222d + "'", double24 == 2168.222222222222d);
        org.junit.Assert.assertNotNull(doubleArray35);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray35), "[-1.0, 100.0, 97.0, 0.0, 1.0, -1.0]");
        org.junit.Assert.assertTrue("'" + double36 + "' != '" + 2168.222222222222d + "'", double36 == 2168.222222222222d);
        org.junit.Assert.assertTrue("'" + long39 + "' != '" + 6L + "'", long39 == 6L);
        org.junit.Assert.assertTrue("'" + boolean40 + "' != '" + false + "'", boolean40 == false);
    }

    @Test
    public void test1528() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1528");
        org.apache.commons.math.stat.descriptive.moment.Variance variance1 = new org.apache.commons.math.stat.descriptive.moment.Variance(false);
        double[] doubleArray8 = new double[] { (byte) -1, (short) 100, 'a', 0, 1, (-1.0d) };
        double double9 = variance1.evaluate(doubleArray8);
        double[] doubleArray13 = new double[] { (byte) 1, (byte) 100, 1L };
        double double14 = variance1.evaluate(doubleArray13);
        org.apache.commons.math.stat.descriptive.moment.Variance variance16 = new org.apache.commons.math.stat.descriptive.moment.Variance(false);
        double[] doubleArray23 = new double[] { (byte) -1, (short) 100, 'a', 0, 1, (-1.0d) };
        double double24 = variance16.evaluate(doubleArray23);
        variance16.setBiasCorrected(true);
        org.apache.commons.math.stat.descriptive.moment.Variance variance28 = new org.apache.commons.math.stat.descriptive.moment.Variance(false);
        double[] doubleArray35 = new double[] { (byte) -1, (short) 100, 'a', 0, 1, (-1.0d) };
        double double36 = variance28.evaluate(doubleArray35);
        variance16.incrementAll(doubleArray35);
        variance1.incrementAll(doubleArray35);
        boolean boolean39 = variance1.isBiasCorrected();
        boolean boolean40 = variance1.isBiasCorrected();
        long long41 = variance1.getN();
        org.junit.Assert.assertNotNull(doubleArray8);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray8), "[-1.0, 100.0, 97.0, 0.0, 1.0, -1.0]");
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 2168.222222222222d + "'", double9 == 2168.222222222222d);
        org.junit.Assert.assertNotNull(doubleArray13);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray13), "[1.0, 100.0, 1.0]");
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + 2178.0d + "'", double14 == 2178.0d);
        org.junit.Assert.assertNotNull(doubleArray23);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray23), "[-1.0, 100.0, 97.0, 0.0, 1.0, -1.0]");
        org.junit.Assert.assertTrue("'" + double24 + "' != '" + 2168.222222222222d + "'", double24 == 2168.222222222222d);
        org.junit.Assert.assertNotNull(doubleArray35);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray35), "[-1.0, 100.0, 97.0, 0.0, 1.0, -1.0]");
        org.junit.Assert.assertTrue("'" + double36 + "' != '" + 2168.222222222222d + "'", double36 == 2168.222222222222d);
        org.junit.Assert.assertTrue("'" + boolean39 + "' != '" + false + "'", boolean39 == false);
        org.junit.Assert.assertTrue("'" + boolean40 + "' != '" + false + "'", boolean40 == false);
        org.junit.Assert.assertTrue("'" + long41 + "' != '" + 6L + "'", long41 == 6L);
    }

    @Test
    public void test1529() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1529");
        org.apache.commons.math.stat.descriptive.moment.Variance variance1 = new org.apache.commons.math.stat.descriptive.moment.Variance(false);
        double[] doubleArray8 = new double[] { (byte) -1, (short) 100, 'a', 0, 1, (-1.0d) };
        double double9 = variance1.evaluate(doubleArray8);
        variance1.clear();
        variance1.setBiasCorrected(true);
        org.apache.commons.math.stat.descriptive.moment.Variance variance14 = new org.apache.commons.math.stat.descriptive.moment.Variance(false);
        double[] doubleArray21 = new double[] { (byte) -1, (short) 100, 'a', 0, 1, (-1.0d) };
        double double22 = variance14.evaluate(doubleArray21);
        variance14.setBiasCorrected(true);
        org.apache.commons.math.stat.descriptive.moment.Variance variance26 = new org.apache.commons.math.stat.descriptive.moment.Variance(false);
        double[] doubleArray33 = new double[] { (byte) -1, (short) 100, 'a', 0, 1, (-1.0d) };
        double double34 = variance26.evaluate(doubleArray33);
        variance26.setBiasCorrected(true);
        boolean boolean37 = variance26.isBiasCorrected();
        double[] doubleArray44 = new double[] { (short) 0, 1.0d, 1L, 0.0d, (-1.0d), 10L };
        double double45 = variance26.evaluate(doubleArray44);
        double double48 = variance14.evaluate(doubleArray44, (int) (byte) 1, (int) (byte) 0);
        variance1.incrementAll(doubleArray44);
        long long50 = variance1.getN();
        boolean boolean51 = variance1.isBiasCorrected();
        long long52 = variance1.getN();
        org.junit.Assert.assertNotNull(doubleArray8);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray8), "[-1.0, 100.0, 97.0, 0.0, 1.0, -1.0]");
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 2168.222222222222d + "'", double9 == 2168.222222222222d);
        org.junit.Assert.assertNotNull(doubleArray21);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray21), "[-1.0, 100.0, 97.0, 0.0, 1.0, -1.0]");
        org.junit.Assert.assertTrue("'" + double22 + "' != '" + 2168.222222222222d + "'", double22 == 2168.222222222222d);
        org.junit.Assert.assertNotNull(doubleArray33);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray33), "[-1.0, 100.0, 97.0, 0.0, 1.0, -1.0]");
        org.junit.Assert.assertTrue("'" + double34 + "' != '" + 2168.222222222222d + "'", double34 == 2168.222222222222d);
        org.junit.Assert.assertTrue("'" + boolean37 + "' != '" + true + "'", boolean37 == true);
        org.junit.Assert.assertNotNull(doubleArray44);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray44), "[0.0, 1.0, 1.0, 0.0, -1.0, 10.0]");
        org.junit.Assert.assertTrue("'" + double45 + "' != '" + 16.566666666666663d + "'", double45 == 16.566666666666663d);
        org.junit.Assert.assertTrue(Double.isNaN(double48));
        org.junit.Assert.assertTrue("'" + long50 + "' != '" + 6L + "'", long50 == 6L);
        org.junit.Assert.assertTrue("'" + boolean51 + "' != '" + true + "'", boolean51 == true);
        org.junit.Assert.assertTrue("'" + long52 + "' != '" + 6L + "'", long52 == 6L);
    }

    @Test
    public void test1530() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1530");
        org.apache.commons.math.stat.descriptive.moment.Variance variance1 = new org.apache.commons.math.stat.descriptive.moment.Variance(false);
        double[] doubleArray8 = new double[] { (byte) -1, (short) 100, 'a', 0, 1, (-1.0d) };
        double double9 = variance1.evaluate(doubleArray8);
        variance1.setBiasCorrected(true);
        long long12 = variance1.getN();
        long long13 = variance1.getN();
        boolean boolean14 = variance1.isBiasCorrected();
        org.apache.commons.math.stat.descriptive.moment.Variance variance16 = new org.apache.commons.math.stat.descriptive.moment.Variance(false);
        double[] doubleArray23 = new double[] { (byte) -1, (short) 100, 'a', 0, 1, (-1.0d) };
        double double24 = variance16.evaluate(doubleArray23);
        variance16.setBiasCorrected(true);
        boolean boolean27 = variance16.isBiasCorrected();
        double[] doubleArray34 = new double[] { (short) 0, 1.0d, 1L, 0.0d, (-1.0d), 10L };
        double double35 = variance16.evaluate(doubleArray34);
        boolean boolean37 = variance16.equals((java.lang.Object) 10.0d);
        org.apache.commons.math.stat.descriptive.moment.Variance variance39 = new org.apache.commons.math.stat.descriptive.moment.Variance(false);
        double[] doubleArray46 = new double[] { (byte) -1, (short) 100, 'a', 0, 1, (-1.0d) };
        double double47 = variance39.evaluate(doubleArray46);
        variance39.setBiasCorrected(true);
        boolean boolean50 = variance39.isBiasCorrected();
        double[] doubleArray57 = new double[] { (short) 0, 1.0d, 1L, 0.0d, (-1.0d), 10L };
        double double58 = variance39.evaluate(doubleArray57);
        double double60 = variance16.evaluate(doubleArray57, (double) 0.0f);
        variance1.incrementAll(doubleArray57);
        variance1.increment((double) 0.0f);
        variance1.increment((double) (byte) 10);
        org.junit.Assert.assertNotNull(doubleArray8);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray8), "[-1.0, 100.0, 97.0, 0.0, 1.0, -1.0]");
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 2168.222222222222d + "'", double9 == 2168.222222222222d);
        org.junit.Assert.assertTrue("'" + long12 + "' != '" + 0L + "'", long12 == 0L);
        org.junit.Assert.assertTrue("'" + long13 + "' != '" + 0L + "'", long13 == 0L);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertNotNull(doubleArray23);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray23), "[-1.0, 100.0, 97.0, 0.0, 1.0, -1.0]");
        org.junit.Assert.assertTrue("'" + double24 + "' != '" + 2168.222222222222d + "'", double24 == 2168.222222222222d);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + true + "'", boolean27 == true);
        org.junit.Assert.assertNotNull(doubleArray34);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray34), "[0.0, 1.0, 1.0, 0.0, -1.0, 10.0]");
        org.junit.Assert.assertTrue("'" + double35 + "' != '" + 16.566666666666663d + "'", double35 == 16.566666666666663d);
        org.junit.Assert.assertTrue("'" + boolean37 + "' != '" + false + "'", boolean37 == false);
        org.junit.Assert.assertNotNull(doubleArray46);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray46), "[-1.0, 100.0, 97.0, 0.0, 1.0, -1.0]");
        org.junit.Assert.assertTrue("'" + double47 + "' != '" + 2168.222222222222d + "'", double47 == 2168.222222222222d);
        org.junit.Assert.assertTrue("'" + boolean50 + "' != '" + true + "'", boolean50 == true);
        org.junit.Assert.assertNotNull(doubleArray57);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray57), "[0.0, 1.0, 1.0, 0.0, -1.0, 10.0]");
        org.junit.Assert.assertTrue("'" + double58 + "' != '" + 16.566666666666663d + "'", double58 == 16.566666666666663d);
        org.junit.Assert.assertTrue("'" + double60 + "' != '" + 16.566666666666666d + "'", double60 == 16.566666666666666d);
    }

    @Test
    public void test1531() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1531");
        org.apache.commons.math.stat.descriptive.moment.SecondMoment secondMoment1 = null;
        org.apache.commons.math.stat.descriptive.moment.Variance variance2 = new org.apache.commons.math.stat.descriptive.moment.Variance(true, secondMoment1);
        double[] doubleArray3 = new double[] {};
        double double6 = variance2.evaluate(doubleArray3, 0, 0);
        boolean boolean8 = variance2.equals((java.lang.Object) 10);
        variance2.increment(Double.NaN);
        variance2.clear();
        variance2.clear();
        org.apache.commons.math.stat.descriptive.moment.Variance variance14 = new org.apache.commons.math.stat.descriptive.moment.Variance(false);
        double[] doubleArray21 = new double[] { (byte) -1, (short) 100, 'a', 0, 1, (-1.0d) };
        double double22 = variance14.evaluate(doubleArray21);
        variance14.setBiasCorrected(true);
        variance14.increment((double) (byte) 0);
        double[] doubleArray29 = new double[] { 'a', 100L };
        double double31 = variance14.evaluate(doubleArray29, 0.0d);
        long long32 = variance14.getN();
        boolean boolean33 = variance14.isBiasCorrected();
        long long34 = variance14.getN();
        double double35 = variance14.getResult();
        double double36 = variance14.getResult();
        org.apache.commons.math.stat.descriptive.moment.Variance variance38 = new org.apache.commons.math.stat.descriptive.moment.Variance(true);
        double double39 = variance38.getResult();
        double double40 = variance38.getResult();
        org.apache.commons.math.stat.descriptive.moment.Variance variance42 = new org.apache.commons.math.stat.descriptive.moment.Variance(false);
        double[] doubleArray49 = new double[] { (byte) -1, (short) 100, 'a', 0, 1, (-1.0d) };
        double double50 = variance42.evaluate(doubleArray49);
        variance42.clear();
        variance42.setBiasCorrected(true);
        org.apache.commons.math.stat.descriptive.moment.Variance variance55 = new org.apache.commons.math.stat.descriptive.moment.Variance(false);
        variance55.clear();
        double double57 = variance55.getResult();
        double[] doubleArray62 = new double[] { (-1), 2168.222222222222d, 16.566666666418314d, 10.0d };
        variance55.incrementAll(doubleArray62);
        boolean boolean64 = variance42.equals((java.lang.Object) doubleArray62);
        double double66 = variance38.evaluate(doubleArray62, (double) (-1.0f));
        double double68 = variance14.evaluate(doubleArray62, 16.566666666666666d);
        // The following exception was thrown during execution in test generation
        try {
            double double71 = variance2.evaluate(doubleArray62, 10, (int) (byte) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: begin + length > values.length");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(doubleArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray3), "[]");
        org.junit.Assert.assertTrue(Double.isNaN(double6));
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNotNull(doubleArray21);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray21), "[-1.0, 100.0, 97.0, 0.0, 1.0, -1.0]");
        org.junit.Assert.assertTrue("'" + double22 + "' != '" + 2168.222222222222d + "'", double22 == 2168.222222222222d);
        org.junit.Assert.assertNotNull(doubleArray29);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray29), "[97.0, 100.0]");
        org.junit.Assert.assertTrue("'" + double31 + "' != '" + 4.5d + "'", double31 == 4.5d);
        org.junit.Assert.assertTrue("'" + long32 + "' != '" + 1L + "'", long32 == 1L);
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + true + "'", boolean33 == true);
        org.junit.Assert.assertTrue("'" + long34 + "' != '" + 1L + "'", long34 == 1L);
        org.junit.Assert.assertTrue("'" + double35 + "' != '" + 0.0d + "'", double35 == 0.0d);
        org.junit.Assert.assertTrue("'" + double36 + "' != '" + 0.0d + "'", double36 == 0.0d);
        org.junit.Assert.assertTrue(Double.isNaN(double39));
        org.junit.Assert.assertTrue(Double.isNaN(double40));
        org.junit.Assert.assertNotNull(doubleArray49);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray49), "[-1.0, 100.0, 97.0, 0.0, 1.0, -1.0]");
        org.junit.Assert.assertTrue("'" + double50 + "' != '" + 2168.222222222222d + "'", double50 == 2168.222222222222d);
        org.junit.Assert.assertTrue(Double.isNaN(double57));
        org.junit.Assert.assertNotNull(doubleArray62);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray62), "[-1.0, 2168.222222222222, 16.566666666418314, 10.0]");
        org.junit.Assert.assertTrue("'" + boolean64 + "' != '" + false + "'", boolean64 == false);
        org.junit.Assert.assertTrue("'" + double66 + "' != '" + 1166128.5457099646d + "'", double66 == 1166128.5457099646d);
        org.junit.Assert.assertTrue("'" + double68 + "' != '" + 1166128.5457099646d + "'", double68 == 1166128.5457099646d);
    }

    @Test
    public void test1532() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1532");
        org.apache.commons.math.stat.descriptive.moment.Variance variance1 = new org.apache.commons.math.stat.descriptive.moment.Variance(false);
        variance1.clear();
        double double3 = variance1.getResult();
        org.apache.commons.math.stat.descriptive.moment.Variance variance5 = new org.apache.commons.math.stat.descriptive.moment.Variance(false);
        double[] doubleArray12 = new double[] { (byte) -1, (short) 100, 'a', 0, 1, (-1.0d) };
        double double13 = variance5.evaluate(doubleArray12);
        variance5.setBiasCorrected(true);
        boolean boolean16 = variance5.isBiasCorrected();
        double[] doubleArray23 = new double[] { (short) 0, 1.0d, 1L, 0.0d, (-1.0d), 10L };
        double double24 = variance5.evaluate(doubleArray23);
        double double25 = variance5.getResult();
        variance5.setBiasCorrected(true);
        org.apache.commons.math.stat.descriptive.moment.Variance variance29 = new org.apache.commons.math.stat.descriptive.moment.Variance(false);
        double[] doubleArray36 = new double[] { (byte) -1, (short) 100, 'a', 0, 1, (-1.0d) };
        double double37 = variance29.evaluate(doubleArray36);
        variance29.setBiasCorrected(true);
        org.apache.commons.math.stat.descriptive.moment.Variance variance41 = new org.apache.commons.math.stat.descriptive.moment.Variance(false);
        double[] doubleArray48 = new double[] { (byte) -1, (short) 100, 'a', 0, 1, (-1.0d) };
        double double49 = variance41.evaluate(doubleArray48);
        variance41.setBiasCorrected(true);
        boolean boolean52 = variance41.isBiasCorrected();
        double[] doubleArray59 = new double[] { (short) 0, 1.0d, 1L, 0.0d, (-1.0d), 10L };
        double double60 = variance41.evaluate(doubleArray59);
        org.apache.commons.math.stat.descriptive.moment.Variance variance62 = new org.apache.commons.math.stat.descriptive.moment.Variance(false);
        double[] doubleArray69 = new double[] { (byte) -1, (short) 100, 'a', 0, 1, (-1.0d) };
        double double70 = variance62.evaluate(doubleArray69);
        variance62.setBiasCorrected(true);
        boolean boolean73 = variance62.isBiasCorrected();
        double[] doubleArray80 = new double[] { (short) 0, 1.0d, 1L, 0.0d, (-1.0d), 10L };
        double double81 = variance62.evaluate(doubleArray80);
        double double84 = variance41.evaluate(doubleArray80, (int) (byte) 1, 0);
        double double86 = variance29.evaluate(doubleArray80, 2178.0d);
        boolean boolean87 = variance5.equals((java.lang.Object) doubleArray80);
        double double89 = variance1.evaluate(doubleArray80, (double) '#');
        boolean boolean90 = variance1.isBiasCorrected();
        double double91 = variance1.getResult();
        long long92 = variance1.getN();
        variance1.setBiasCorrected(false);
        boolean boolean95 = variance1.isBiasCorrected();
        org.junit.Assert.assertTrue(Double.isNaN(double3));
        org.junit.Assert.assertNotNull(doubleArray12);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray12), "[-1.0, 100.0, 97.0, 0.0, 1.0, -1.0]");
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 2168.222222222222d + "'", double13 == 2168.222222222222d);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertNotNull(doubleArray23);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray23), "[0.0, 1.0, 1.0, 0.0, -1.0, 10.0]");
        org.junit.Assert.assertTrue("'" + double24 + "' != '" + 16.566666666666663d + "'", double24 == 16.566666666666663d);
        org.junit.Assert.assertTrue(Double.isNaN(double25));
        org.junit.Assert.assertNotNull(doubleArray36);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray36), "[-1.0, 100.0, 97.0, 0.0, 1.0, -1.0]");
        org.junit.Assert.assertTrue("'" + double37 + "' != '" + 2168.222222222222d + "'", double37 == 2168.222222222222d);
        org.junit.Assert.assertNotNull(doubleArray48);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray48), "[-1.0, 100.0, 97.0, 0.0, 1.0, -1.0]");
        org.junit.Assert.assertTrue("'" + double49 + "' != '" + 2168.222222222222d + "'", double49 == 2168.222222222222d);
        org.junit.Assert.assertTrue("'" + boolean52 + "' != '" + true + "'", boolean52 == true);
        org.junit.Assert.assertNotNull(doubleArray59);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray59), "[0.0, 1.0, 1.0, 0.0, -1.0, 10.0]");
        org.junit.Assert.assertTrue("'" + double60 + "' != '" + 16.566666666666663d + "'", double60 == 16.566666666666663d);
        org.junit.Assert.assertNotNull(doubleArray69);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray69), "[-1.0, 100.0, 97.0, 0.0, 1.0, -1.0]");
        org.junit.Assert.assertTrue("'" + double70 + "' != '" + 2168.222222222222d + "'", double70 == 2168.222222222222d);
        org.junit.Assert.assertTrue("'" + boolean73 + "' != '" + true + "'", boolean73 == true);
        org.junit.Assert.assertNotNull(doubleArray80);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray80), "[0.0, 1.0, 1.0, 0.0, -1.0, 10.0]");
        org.junit.Assert.assertTrue("'" + double81 + "' != '" + 16.566666666666663d + "'", double81 == 16.566666666666663d);
        org.junit.Assert.assertTrue(Double.isNaN(double84));
        org.junit.Assert.assertTrue("'" + double86 + "' != '" + 16.566666666418314d + "'", double86 == 16.566666666418314d);
        org.junit.Assert.assertTrue("'" + boolean87 + "' != '" + false + "'", boolean87 == false);
        org.junit.Assert.assertTrue("'" + double89 + "' != '" + 13.805555555555506d + "'", double89 == 13.805555555555506d);
        org.junit.Assert.assertTrue("'" + boolean90 + "' != '" + false + "'", boolean90 == false);
        org.junit.Assert.assertTrue(Double.isNaN(double91));
        org.junit.Assert.assertTrue("'" + long92 + "' != '" + 0L + "'", long92 == 0L);
        org.junit.Assert.assertTrue("'" + boolean95 + "' != '" + false + "'", boolean95 == false);
    }

    @Test
    public void test1533() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1533");
        org.apache.commons.math.stat.descriptive.moment.Variance variance1 = new org.apache.commons.math.stat.descriptive.moment.Variance(false);
        double[] doubleArray8 = new double[] { (byte) -1, (short) 100, 'a', 0, 1, (-1.0d) };
        double double9 = variance1.evaluate(doubleArray8);
        variance1.setBiasCorrected(true);
        long long12 = variance1.getN();
        long long13 = variance1.getN();
        boolean boolean15 = variance1.equals((java.lang.Object) 16.566666666666663d);
        boolean boolean17 = variance1.equals((java.lang.Object) (short) 10);
        long long18 = variance1.getN();
        variance1.setBiasCorrected(false);
        org.apache.commons.math.stat.descriptive.moment.Variance variance21 = new org.apache.commons.math.stat.descriptive.moment.Variance();
        long long22 = variance21.getN();
        variance21.setBiasCorrected(true);
        variance21.increment(2178.0d);
        double double27 = variance21.getResult();
        org.apache.commons.math.stat.descriptive.moment.Variance variance29 = new org.apache.commons.math.stat.descriptive.moment.Variance(false);
        double[] doubleArray36 = new double[] { (byte) -1, (short) 100, 'a', 0, 1, (-1.0d) };
        double double37 = variance29.evaluate(doubleArray36);
        variance29.clear();
        variance29.setBiasCorrected(true);
        double double41 = variance29.getResult();
        variance29.clear();
        org.apache.commons.math.stat.descriptive.moment.Variance variance44 = new org.apache.commons.math.stat.descriptive.moment.Variance(false);
        double[] doubleArray51 = new double[] { (byte) -1, (short) 100, 'a', 0, 1, (-1.0d) };
        double double52 = variance44.evaluate(doubleArray51);
        variance44.setBiasCorrected(true);
        boolean boolean55 = variance44.isBiasCorrected();
        double[] doubleArray62 = new double[] { (short) 0, 1.0d, 1L, 0.0d, (-1.0d), 10L };
        double double63 = variance44.evaluate(doubleArray62);
        double double64 = variance44.getResult();
        variance44.setBiasCorrected(true);
        double double67 = variance44.getResult();
        org.apache.commons.math.stat.descriptive.moment.Variance variance69 = new org.apache.commons.math.stat.descriptive.moment.Variance(false);
        double[] doubleArray76 = new double[] { (byte) -1, (short) 100, 'a', 0, 1, (-1.0d) };
        double double77 = variance69.evaluate(doubleArray76);
        variance69.clear();
        variance69.setBiasCorrected(true);
        double double81 = variance69.getResult();
        org.apache.commons.math.stat.descriptive.moment.Variance variance83 = new org.apache.commons.math.stat.descriptive.moment.Variance(false);
        double[] doubleArray90 = new double[] { (byte) -1, (short) 100, 'a', 0, 1, (-1.0d) };
        double double91 = variance83.evaluate(doubleArray90);
        double double92 = variance69.evaluate(doubleArray90);
        double double94 = variance44.evaluate(doubleArray90, (double) 100);
        double double95 = variance29.evaluate(doubleArray90);
        double double96 = variance21.evaluate(doubleArray90);
        boolean boolean97 = variance1.equals((java.lang.Object) double96);
        double double98 = variance1.getResult();
        org.junit.Assert.assertNotNull(doubleArray8);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray8), "[-1.0, 100.0, 97.0, 0.0, 1.0, -1.0]");
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 2168.222222222222d + "'", double9 == 2168.222222222222d);
        org.junit.Assert.assertTrue("'" + long12 + "' != '" + 0L + "'", long12 == 0L);
        org.junit.Assert.assertTrue("'" + long13 + "' != '" + 0L + "'", long13 == 0L);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertTrue("'" + long18 + "' != '" + 0L + "'", long18 == 0L);
        org.junit.Assert.assertTrue("'" + long22 + "' != '" + 0L + "'", long22 == 0L);
        org.junit.Assert.assertTrue("'" + double27 + "' != '" + 0.0d + "'", double27 == 0.0d);
        org.junit.Assert.assertNotNull(doubleArray36);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray36), "[-1.0, 100.0, 97.0, 0.0, 1.0, -1.0]");
        org.junit.Assert.assertTrue("'" + double37 + "' != '" + 2168.222222222222d + "'", double37 == 2168.222222222222d);
        org.junit.Assert.assertTrue(Double.isNaN(double41));
        org.junit.Assert.assertNotNull(doubleArray51);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray51), "[-1.0, 100.0, 97.0, 0.0, 1.0, -1.0]");
        org.junit.Assert.assertTrue("'" + double52 + "' != '" + 2168.222222222222d + "'", double52 == 2168.222222222222d);
        org.junit.Assert.assertTrue("'" + boolean55 + "' != '" + true + "'", boolean55 == true);
        org.junit.Assert.assertNotNull(doubleArray62);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray62), "[0.0, 1.0, 1.0, 0.0, -1.0, 10.0]");
        org.junit.Assert.assertTrue("'" + double63 + "' != '" + 16.566666666666663d + "'", double63 == 16.566666666666663d);
        org.junit.Assert.assertTrue(Double.isNaN(double64));
        org.junit.Assert.assertTrue(Double.isNaN(double67));
        org.junit.Assert.assertNotNull(doubleArray76);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray76), "[-1.0, 100.0, 97.0, 0.0, 1.0, -1.0]");
        org.junit.Assert.assertTrue("'" + double77 + "' != '" + 2168.222222222222d + "'", double77 == 2168.222222222222d);
        org.junit.Assert.assertTrue(Double.isNaN(double81));
        org.junit.Assert.assertNotNull(doubleArray90);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray90), "[-1.0, 100.0, 97.0, 0.0, 1.0, -1.0]");
        org.junit.Assert.assertTrue("'" + double91 + "' != '" + 2168.222222222222d + "'", double91 == 2168.222222222222d);
        org.junit.Assert.assertTrue("'" + double92 + "' != '" + 2601.866666666667d + "'", double92 == 2601.866666666667d);
        org.junit.Assert.assertTrue("'" + double94 + "' != '" + 2601.8666666666663d + "'", double94 == 2601.8666666666663d);
        org.junit.Assert.assertTrue("'" + double95 + "' != '" + 2601.866666666667d + "'", double95 == 2601.866666666667d);
        org.junit.Assert.assertTrue("'" + double96 + "' != '" + 2601.866666666667d + "'", double96 == 2601.866666666667d);
        org.junit.Assert.assertTrue("'" + boolean97 + "' != '" + false + "'", boolean97 == false);
        org.junit.Assert.assertTrue(Double.isNaN(double98));
    }

    @Test
    public void test1534() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1534");
        org.apache.commons.math.stat.descriptive.moment.SecondMoment secondMoment1 = null;
        org.apache.commons.math.stat.descriptive.moment.Variance variance2 = new org.apache.commons.math.stat.descriptive.moment.Variance(true, secondMoment1);
        double[] doubleArray3 = new double[] {};
        double double6 = variance2.evaluate(doubleArray3, 0, 0);
        boolean boolean8 = variance2.equals((java.lang.Object) 10.0f);
        boolean boolean9 = variance2.isBiasCorrected();
        variance2.clear();
        // The following exception was thrown during execution in test generation
        try {
            double double11 = variance2.getResult();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(doubleArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray3), "[]");
        org.junit.Assert.assertTrue(Double.isNaN(double6));
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
    }

    @Test
    public void test1535() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1535");
        org.apache.commons.math.stat.descriptive.moment.Variance variance1 = new org.apache.commons.math.stat.descriptive.moment.Variance(false);
        double[] doubleArray8 = new double[] { (byte) -1, (short) 100, 'a', 0, 1, (-1.0d) };
        double double9 = variance1.evaluate(doubleArray8);
        variance1.setBiasCorrected(true);
        long long12 = variance1.getN();
        org.apache.commons.math.stat.descriptive.moment.Variance variance14 = new org.apache.commons.math.stat.descriptive.moment.Variance(false);
        double[] doubleArray21 = new double[] { (byte) -1, (short) 100, 'a', 0, 1, (-1.0d) };
        double double22 = variance14.evaluate(doubleArray21);
        variance14.setBiasCorrected(true);
        boolean boolean25 = variance14.isBiasCorrected();
        double[] doubleArray32 = new double[] { (short) 0, 1.0d, 1L, 0.0d, (-1.0d), 10L };
        double double33 = variance14.evaluate(doubleArray32);
        org.apache.commons.math.stat.descriptive.moment.Variance variance35 = new org.apache.commons.math.stat.descriptive.moment.Variance(false);
        double[] doubleArray42 = new double[] { (byte) -1, (short) 100, 'a', 0, 1, (-1.0d) };
        double double43 = variance35.evaluate(doubleArray42);
        variance35.setBiasCorrected(true);
        boolean boolean46 = variance35.isBiasCorrected();
        double[] doubleArray53 = new double[] { (short) 0, 1.0d, 1L, 0.0d, (-1.0d), 10L };
        double double54 = variance35.evaluate(doubleArray53);
        double double57 = variance14.evaluate(doubleArray53, (int) (byte) 1, 0);
        variance14.setBiasCorrected(true);
        org.apache.commons.math.stat.descriptive.moment.Variance variance61 = new org.apache.commons.math.stat.descriptive.moment.Variance(false);
        double[] doubleArray68 = new double[] { (byte) -1, (short) 100, 'a', 0, 1, (-1.0d) };
        double double69 = variance61.evaluate(doubleArray68);
        variance61.setBiasCorrected(true);
        boolean boolean72 = variance61.isBiasCorrected();
        double[] doubleArray79 = new double[] { (short) 0, 1.0d, 1L, 0.0d, (-1.0d), 10L };
        double double80 = variance61.evaluate(doubleArray79);
        double double82 = variance14.evaluate(doubleArray79, 6.25d);
        variance1.incrementAll(doubleArray79);
        boolean boolean84 = variance1.isBiasCorrected();
        variance1.increment(1175056.0d);
        org.junit.Assert.assertNotNull(doubleArray8);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray8), "[-1.0, 100.0, 97.0, 0.0, 1.0, -1.0]");
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 2168.222222222222d + "'", double9 == 2168.222222222222d);
        org.junit.Assert.assertTrue("'" + long12 + "' != '" + 0L + "'", long12 == 0L);
        org.junit.Assert.assertNotNull(doubleArray21);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray21), "[-1.0, 100.0, 97.0, 0.0, 1.0, -1.0]");
        org.junit.Assert.assertTrue("'" + double22 + "' != '" + 2168.222222222222d + "'", double22 == 2168.222222222222d);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + true + "'", boolean25 == true);
        org.junit.Assert.assertNotNull(doubleArray32);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray32), "[0.0, 1.0, 1.0, 0.0, -1.0, 10.0]");
        org.junit.Assert.assertTrue("'" + double33 + "' != '" + 16.566666666666663d + "'", double33 == 16.566666666666663d);
        org.junit.Assert.assertNotNull(doubleArray42);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray42), "[-1.0, 100.0, 97.0, 0.0, 1.0, -1.0]");
        org.junit.Assert.assertTrue("'" + double43 + "' != '" + 2168.222222222222d + "'", double43 == 2168.222222222222d);
        org.junit.Assert.assertTrue("'" + boolean46 + "' != '" + true + "'", boolean46 == true);
        org.junit.Assert.assertNotNull(doubleArray53);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray53), "[0.0, 1.0, 1.0, 0.0, -1.0, 10.0]");
        org.junit.Assert.assertTrue("'" + double54 + "' != '" + 16.566666666666663d + "'", double54 == 16.566666666666663d);
        org.junit.Assert.assertTrue(Double.isNaN(double57));
        org.junit.Assert.assertNotNull(doubleArray68);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray68), "[-1.0, 100.0, 97.0, 0.0, 1.0, -1.0]");
        org.junit.Assert.assertTrue("'" + double69 + "' != '" + 2168.222222222222d + "'", double69 == 2168.222222222222d);
        org.junit.Assert.assertTrue("'" + boolean72 + "' != '" + true + "'", boolean72 == true);
        org.junit.Assert.assertNotNull(doubleArray79);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray79), "[0.0, 1.0, 1.0, 0.0, -1.0, 10.0]");
        org.junit.Assert.assertTrue("'" + double80 + "' != '" + 16.566666666666663d + "'", double80 == 16.566666666666663d);
        org.junit.Assert.assertTrue("'" + double82 + "' != '" + 16.566666666666666d + "'", double82 == 16.566666666666666d);
        org.junit.Assert.assertTrue("'" + boolean84 + "' != '" + true + "'", boolean84 == true);
    }

    @Test
    public void test1536() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1536");
        org.apache.commons.math.stat.descriptive.moment.Variance variance1 = new org.apache.commons.math.stat.descriptive.moment.Variance(false);
        double[] doubleArray8 = new double[] { (byte) -1, (short) 100, 'a', 0, 1, (-1.0d) };
        double double9 = variance1.evaluate(doubleArray8);
        variance1.setBiasCorrected(true);
        boolean boolean12 = variance1.isBiasCorrected();
        double double13 = variance1.getResult();
        org.apache.commons.math.stat.descriptive.moment.Variance variance15 = new org.apache.commons.math.stat.descriptive.moment.Variance(false);
        double[] doubleArray22 = new double[] { (byte) -1, (short) 100, 'a', 0, 1, (-1.0d) };
        double double23 = variance15.evaluate(doubleArray22);
        long long24 = variance15.getN();
        variance15.increment((double) (byte) 1);
        variance15.increment((double) 6L);
        double double29 = variance15.getResult();
        variance15.clear();
        boolean boolean31 = variance15.isBiasCorrected();
        org.apache.commons.math.stat.descriptive.moment.Variance variance33 = new org.apache.commons.math.stat.descriptive.moment.Variance(false);
        double[] doubleArray40 = new double[] { (byte) -1, (short) 100, 'a', 0, 1, (-1.0d) };
        double double41 = variance33.evaluate(doubleArray40);
        variance33.setBiasCorrected(true);
        variance33.increment((double) (byte) 0);
        double[] doubleArray48 = new double[] { 'a', 100L };
        double double50 = variance33.evaluate(doubleArray48, 0.0d);
        long long51 = variance33.getN();
        boolean boolean52 = variance33.isBiasCorrected();
        long long53 = variance33.getN();
        double double54 = variance33.getResult();
        double double55 = variance33.getResult();
        org.apache.commons.math.stat.descriptive.moment.Variance variance57 = new org.apache.commons.math.stat.descriptive.moment.Variance(true);
        double double58 = variance57.getResult();
        double double59 = variance57.getResult();
        org.apache.commons.math.stat.descriptive.moment.Variance variance61 = new org.apache.commons.math.stat.descriptive.moment.Variance(false);
        double[] doubleArray68 = new double[] { (byte) -1, (short) 100, 'a', 0, 1, (-1.0d) };
        double double69 = variance61.evaluate(doubleArray68);
        variance61.clear();
        variance61.setBiasCorrected(true);
        org.apache.commons.math.stat.descriptive.moment.Variance variance74 = new org.apache.commons.math.stat.descriptive.moment.Variance(false);
        variance74.clear();
        double double76 = variance74.getResult();
        double[] doubleArray81 = new double[] { (-1), 2168.222222222222d, 16.566666666418314d, 10.0d };
        variance74.incrementAll(doubleArray81);
        boolean boolean83 = variance61.equals((java.lang.Object) doubleArray81);
        double double85 = variance57.evaluate(doubleArray81, (double) (-1.0f));
        double double87 = variance33.evaluate(doubleArray81, 16.566666666666666d);
        double double88 = variance15.evaluate(doubleArray81);
        variance1.incrementAll(doubleArray81);
        org.junit.Assert.assertNotNull(doubleArray8);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray8), "[-1.0, 100.0, 97.0, 0.0, 1.0, -1.0]");
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 2168.222222222222d + "'", double9 == 2168.222222222222d);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertTrue(Double.isNaN(double13));
        org.junit.Assert.assertNotNull(doubleArray22);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray22), "[-1.0, 100.0, 97.0, 0.0, 1.0, -1.0]");
        org.junit.Assert.assertTrue("'" + double23 + "' != '" + 2168.222222222222d + "'", double23 == 2168.222222222222d);
        org.junit.Assert.assertTrue("'" + long24 + "' != '" + 0L + "'", long24 == 0L);
        org.junit.Assert.assertTrue("'" + double29 + "' != '" + 6.25d + "'", double29 == 6.25d);
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + false + "'", boolean31 == false);
        org.junit.Assert.assertNotNull(doubleArray40);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray40), "[-1.0, 100.0, 97.0, 0.0, 1.0, -1.0]");
        org.junit.Assert.assertTrue("'" + double41 + "' != '" + 2168.222222222222d + "'", double41 == 2168.222222222222d);
        org.junit.Assert.assertNotNull(doubleArray48);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray48), "[97.0, 100.0]");
        org.junit.Assert.assertTrue("'" + double50 + "' != '" + 4.5d + "'", double50 == 4.5d);
        org.junit.Assert.assertTrue("'" + long51 + "' != '" + 1L + "'", long51 == 1L);
        org.junit.Assert.assertTrue("'" + boolean52 + "' != '" + true + "'", boolean52 == true);
        org.junit.Assert.assertTrue("'" + long53 + "' != '" + 1L + "'", long53 == 1L);
        org.junit.Assert.assertTrue("'" + double54 + "' != '" + 0.0d + "'", double54 == 0.0d);
        org.junit.Assert.assertTrue("'" + double55 + "' != '" + 0.0d + "'", double55 == 0.0d);
        org.junit.Assert.assertTrue(Double.isNaN(double58));
        org.junit.Assert.assertTrue(Double.isNaN(double59));
        org.junit.Assert.assertNotNull(doubleArray68);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray68), "[-1.0, 100.0, 97.0, 0.0, 1.0, -1.0]");
        org.junit.Assert.assertTrue("'" + double69 + "' != '" + 2168.222222222222d + "'", double69 == 2168.222222222222d);
        org.junit.Assert.assertTrue(Double.isNaN(double76));
        org.junit.Assert.assertNotNull(doubleArray81);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray81), "[-1.0, 2168.222222222222, 16.566666666418314, 10.0]");
        org.junit.Assert.assertTrue("'" + boolean83 + "' != '" + false + "'", boolean83 == false);
        org.junit.Assert.assertTrue("'" + double85 + "' != '" + 1166128.5457099646d + "'", double85 == 1166128.5457099646d);
        org.junit.Assert.assertTrue("'" + double87 + "' != '" + 1166128.5457099646d + "'", double87 == 1166128.5457099646d);
        org.junit.Assert.assertTrue("'" + double88 + "' != '" + 874596.4092824734d + "'", double88 == 874596.4092824734d);
    }

    @Test
    public void test1537() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1537");
        org.apache.commons.math.stat.descriptive.moment.Variance variance1 = new org.apache.commons.math.stat.descriptive.moment.Variance(false);
        double[] doubleArray8 = new double[] { (byte) -1, (short) 100, 'a', 0, 1, (-1.0d) };
        double double9 = variance1.evaluate(doubleArray8);
        variance1.clear();
        variance1.setBiasCorrected(true);
        double double13 = variance1.getResult();
        variance1.clear();
        org.apache.commons.math.stat.descriptive.moment.Variance variance16 = new org.apache.commons.math.stat.descriptive.moment.Variance(false);
        double[] doubleArray23 = new double[] { (byte) -1, (short) 100, 'a', 0, 1, (-1.0d) };
        double double24 = variance16.evaluate(doubleArray23);
        variance16.setBiasCorrected(true);
        boolean boolean27 = variance16.isBiasCorrected();
        double[] doubleArray34 = new double[] { (short) 0, 1.0d, 1L, 0.0d, (-1.0d), 10L };
        double double35 = variance16.evaluate(doubleArray34);
        double double36 = variance16.getResult();
        variance16.setBiasCorrected(true);
        double double39 = variance16.getResult();
        org.apache.commons.math.stat.descriptive.moment.Variance variance41 = new org.apache.commons.math.stat.descriptive.moment.Variance(false);
        double[] doubleArray48 = new double[] { (byte) -1, (short) 100, 'a', 0, 1, (-1.0d) };
        double double49 = variance41.evaluate(doubleArray48);
        variance41.clear();
        variance41.setBiasCorrected(true);
        double double53 = variance41.getResult();
        org.apache.commons.math.stat.descriptive.moment.Variance variance55 = new org.apache.commons.math.stat.descriptive.moment.Variance(false);
        double[] doubleArray62 = new double[] { (byte) -1, (short) 100, 'a', 0, 1, (-1.0d) };
        double double63 = variance55.evaluate(doubleArray62);
        double double64 = variance41.evaluate(doubleArray62);
        double double66 = variance16.evaluate(doubleArray62, (double) 100);
        double double67 = variance1.evaluate(doubleArray62);
        double double68 = variance1.getResult();
        org.junit.Assert.assertNotNull(doubleArray8);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray8), "[-1.0, 100.0, 97.0, 0.0, 1.0, -1.0]");
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 2168.222222222222d + "'", double9 == 2168.222222222222d);
        org.junit.Assert.assertTrue(Double.isNaN(double13));
        org.junit.Assert.assertNotNull(doubleArray23);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray23), "[-1.0, 100.0, 97.0, 0.0, 1.0, -1.0]");
        org.junit.Assert.assertTrue("'" + double24 + "' != '" + 2168.222222222222d + "'", double24 == 2168.222222222222d);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + true + "'", boolean27 == true);
        org.junit.Assert.assertNotNull(doubleArray34);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray34), "[0.0, 1.0, 1.0, 0.0, -1.0, 10.0]");
        org.junit.Assert.assertTrue("'" + double35 + "' != '" + 16.566666666666663d + "'", double35 == 16.566666666666663d);
        org.junit.Assert.assertTrue(Double.isNaN(double36));
        org.junit.Assert.assertTrue(Double.isNaN(double39));
        org.junit.Assert.assertNotNull(doubleArray48);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray48), "[-1.0, 100.0, 97.0, 0.0, 1.0, -1.0]");
        org.junit.Assert.assertTrue("'" + double49 + "' != '" + 2168.222222222222d + "'", double49 == 2168.222222222222d);
        org.junit.Assert.assertTrue(Double.isNaN(double53));
        org.junit.Assert.assertNotNull(doubleArray62);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray62), "[-1.0, 100.0, 97.0, 0.0, 1.0, -1.0]");
        org.junit.Assert.assertTrue("'" + double63 + "' != '" + 2168.222222222222d + "'", double63 == 2168.222222222222d);
        org.junit.Assert.assertTrue("'" + double64 + "' != '" + 2601.866666666667d + "'", double64 == 2601.866666666667d);
        org.junit.Assert.assertTrue("'" + double66 + "' != '" + 2601.8666666666663d + "'", double66 == 2601.8666666666663d);
        org.junit.Assert.assertTrue("'" + double67 + "' != '" + 2601.866666666667d + "'", double67 == 2601.866666666667d);
        org.junit.Assert.assertTrue(Double.isNaN(double68));
    }

    @Test
    public void test1538() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1538");
        org.apache.commons.math.stat.descriptive.moment.Variance variance1 = new org.apache.commons.math.stat.descriptive.moment.Variance(false);
        double[] doubleArray8 = new double[] { (byte) -1, (short) 100, 'a', 0, 1, (-1.0d) };
        double double9 = variance1.evaluate(doubleArray8);
        variance1.setBiasCorrected(true);
        org.apache.commons.math.stat.descriptive.moment.Variance variance13 = new org.apache.commons.math.stat.descriptive.moment.Variance(false);
        double[] doubleArray20 = new double[] { (byte) -1, (short) 100, 'a', 0, 1, (-1.0d) };
        double double21 = variance13.evaluate(doubleArray20);
        variance13.setBiasCorrected(true);
        boolean boolean24 = variance13.isBiasCorrected();
        double[] doubleArray31 = new double[] { (short) 0, 1.0d, 1L, 0.0d, (-1.0d), 10L };
        double double32 = variance13.evaluate(doubleArray31);
        double double35 = variance1.evaluate(doubleArray31, (int) (byte) 1, (int) (byte) 0);
        org.apache.commons.math.stat.descriptive.moment.Variance variance37 = new org.apache.commons.math.stat.descriptive.moment.Variance(false);
        org.apache.commons.math.stat.descriptive.moment.Variance variance39 = new org.apache.commons.math.stat.descriptive.moment.Variance(false);
        double[] doubleArray46 = new double[] { (byte) -1, (short) 100, 'a', 0, 1, (-1.0d) };
        double double47 = variance39.evaluate(doubleArray46);
        variance39.setBiasCorrected(true);
        org.apache.commons.math.stat.descriptive.moment.Variance variance51 = new org.apache.commons.math.stat.descriptive.moment.Variance(false);
        double[] doubleArray58 = new double[] { (byte) -1, (short) 100, 'a', 0, 1, (-1.0d) };
        double double59 = variance51.evaluate(doubleArray58);
        variance51.setBiasCorrected(true);
        org.apache.commons.math.stat.descriptive.moment.Variance variance63 = new org.apache.commons.math.stat.descriptive.moment.Variance(false);
        double[] doubleArray70 = new double[] { (byte) -1, (short) 100, 'a', 0, 1, (-1.0d) };
        double double71 = variance63.evaluate(doubleArray70);
        variance63.setBiasCorrected(true);
        boolean boolean74 = variance63.isBiasCorrected();
        double[] doubleArray81 = new double[] { (short) 0, 1.0d, 1L, 0.0d, (-1.0d), 10L };
        double double82 = variance63.evaluate(doubleArray81);
        double double85 = variance51.evaluate(doubleArray81, (int) (byte) 1, (int) (byte) 0);
        variance39.incrementAll(doubleArray81, (int) (byte) 1, 1);
        double double89 = variance37.evaluate(doubleArray81);
        double double90 = variance1.evaluate(doubleArray81);
        boolean boolean91 = variance1.isBiasCorrected();
        boolean boolean92 = variance1.isBiasCorrected();
        variance1.increment(16.566666666418314d);
        variance1.setBiasCorrected(true);
        java.lang.Class<?> wildcardClass97 = variance1.getClass();
        org.junit.Assert.assertNotNull(doubleArray8);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray8), "[-1.0, 100.0, 97.0, 0.0, 1.0, -1.0]");
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 2168.222222222222d + "'", double9 == 2168.222222222222d);
        org.junit.Assert.assertNotNull(doubleArray20);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray20), "[-1.0, 100.0, 97.0, 0.0, 1.0, -1.0]");
        org.junit.Assert.assertTrue("'" + double21 + "' != '" + 2168.222222222222d + "'", double21 == 2168.222222222222d);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + true + "'", boolean24 == true);
        org.junit.Assert.assertNotNull(doubleArray31);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray31), "[0.0, 1.0, 1.0, 0.0, -1.0, 10.0]");
        org.junit.Assert.assertTrue("'" + double32 + "' != '" + 16.566666666666663d + "'", double32 == 16.566666666666663d);
        org.junit.Assert.assertTrue(Double.isNaN(double35));
        org.junit.Assert.assertNotNull(doubleArray46);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray46), "[-1.0, 100.0, 97.0, 0.0, 1.0, -1.0]");
        org.junit.Assert.assertTrue("'" + double47 + "' != '" + 2168.222222222222d + "'", double47 == 2168.222222222222d);
        org.junit.Assert.assertNotNull(doubleArray58);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray58), "[-1.0, 100.0, 97.0, 0.0, 1.0, -1.0]");
        org.junit.Assert.assertTrue("'" + double59 + "' != '" + 2168.222222222222d + "'", double59 == 2168.222222222222d);
        org.junit.Assert.assertNotNull(doubleArray70);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray70), "[-1.0, 100.0, 97.0, 0.0, 1.0, -1.0]");
        org.junit.Assert.assertTrue("'" + double71 + "' != '" + 2168.222222222222d + "'", double71 == 2168.222222222222d);
        org.junit.Assert.assertTrue("'" + boolean74 + "' != '" + true + "'", boolean74 == true);
        org.junit.Assert.assertNotNull(doubleArray81);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray81), "[0.0, 1.0, 1.0, 0.0, -1.0, 10.0]");
        org.junit.Assert.assertTrue("'" + double82 + "' != '" + 16.566666666666663d + "'", double82 == 16.566666666666663d);
        org.junit.Assert.assertTrue(Double.isNaN(double85));
        org.junit.Assert.assertTrue("'" + double89 + "' != '" + 13.805555555555552d + "'", double89 == 13.805555555555552d);
        org.junit.Assert.assertTrue("'" + double90 + "' != '" + 16.566666666666663d + "'", double90 == 16.566666666666663d);
        org.junit.Assert.assertTrue("'" + boolean91 + "' != '" + true + "'", boolean91 == true);
        org.junit.Assert.assertTrue("'" + boolean92 + "' != '" + true + "'", boolean92 == true);
        org.junit.Assert.assertNotNull(wildcardClass97);
    }

    @Test
    public void test1539() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1539");
        org.apache.commons.math.stat.descriptive.moment.Variance variance1 = new org.apache.commons.math.stat.descriptive.moment.Variance(false);
        double[] doubleArray8 = new double[] { (byte) -1, (short) 100, 'a', 0, 1, (-1.0d) };
        double double9 = variance1.evaluate(doubleArray8);
        variance1.setBiasCorrected(true);
        boolean boolean12 = variance1.isBiasCorrected();
        double[] doubleArray19 = new double[] { (short) 0, 1.0d, 1L, 0.0d, (-1.0d), 10L };
        double double20 = variance1.evaluate(doubleArray19);
        org.apache.commons.math.stat.descriptive.moment.Variance variance22 = new org.apache.commons.math.stat.descriptive.moment.Variance(false);
        double[] doubleArray29 = new double[] { (byte) -1, (short) 100, 'a', 0, 1, (-1.0d) };
        double double30 = variance22.evaluate(doubleArray29);
        variance22.setBiasCorrected(true);
        boolean boolean33 = variance22.isBiasCorrected();
        double[] doubleArray40 = new double[] { (short) 0, 1.0d, 1L, 0.0d, (-1.0d), 10L };
        double double41 = variance22.evaluate(doubleArray40);
        double double44 = variance1.evaluate(doubleArray40, (int) (byte) 1, 0);
        boolean boolean45 = variance1.isBiasCorrected();
        variance1.setBiasCorrected(true);
        variance1.increment(13.80555555555562d);
        long long50 = variance1.getN();
        boolean boolean51 = variance1.isBiasCorrected();
        org.apache.commons.math.stat.descriptive.moment.Variance variance53 = new org.apache.commons.math.stat.descriptive.moment.Variance(false);
        double[] doubleArray60 = new double[] { (byte) -1, (short) 100, 'a', 0, 1, (-1.0d) };
        double double61 = variance53.evaluate(doubleArray60);
        variance53.setBiasCorrected(true);
        long long64 = variance53.getN();
        org.apache.commons.math.stat.descriptive.moment.Variance variance66 = new org.apache.commons.math.stat.descriptive.moment.Variance(false);
        double[] doubleArray73 = new double[] { (byte) -1, (short) 100, 'a', 0, 1, (-1.0d) };
        double double74 = variance66.evaluate(doubleArray73);
        variance66.clear();
        variance66.setBiasCorrected(true);
        org.apache.commons.math.stat.descriptive.moment.Variance variance79 = new org.apache.commons.math.stat.descriptive.moment.Variance(false);
        variance79.clear();
        double double81 = variance79.getResult();
        double[] doubleArray86 = new double[] { (-1), 2168.222222222222d, 16.566666666418314d, 10.0d };
        variance79.incrementAll(doubleArray86);
        boolean boolean88 = variance66.equals((java.lang.Object) doubleArray86);
        variance53.incrementAll(doubleArray86);
        double double92 = variance1.evaluate(doubleArray86, 0, (int) (byte) 0);
        org.junit.Assert.assertNotNull(doubleArray8);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray8), "[-1.0, 100.0, 97.0, 0.0, 1.0, -1.0]");
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 2168.222222222222d + "'", double9 == 2168.222222222222d);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertNotNull(doubleArray19);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray19), "[0.0, 1.0, 1.0, 0.0, -1.0, 10.0]");
        org.junit.Assert.assertTrue("'" + double20 + "' != '" + 16.566666666666663d + "'", double20 == 16.566666666666663d);
        org.junit.Assert.assertNotNull(doubleArray29);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray29), "[-1.0, 100.0, 97.0, 0.0, 1.0, -1.0]");
        org.junit.Assert.assertTrue("'" + double30 + "' != '" + 2168.222222222222d + "'", double30 == 2168.222222222222d);
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + true + "'", boolean33 == true);
        org.junit.Assert.assertNotNull(doubleArray40);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray40), "[0.0, 1.0, 1.0, 0.0, -1.0, 10.0]");
        org.junit.Assert.assertTrue("'" + double41 + "' != '" + 16.566666666666663d + "'", double41 == 16.566666666666663d);
        org.junit.Assert.assertTrue(Double.isNaN(double44));
        org.junit.Assert.assertTrue("'" + boolean45 + "' != '" + true + "'", boolean45 == true);
        org.junit.Assert.assertTrue("'" + long50 + "' != '" + 1L + "'", long50 == 1L);
        org.junit.Assert.assertTrue("'" + boolean51 + "' != '" + true + "'", boolean51 == true);
        org.junit.Assert.assertNotNull(doubleArray60);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray60), "[-1.0, 100.0, 97.0, 0.0, 1.0, -1.0]");
        org.junit.Assert.assertTrue("'" + double61 + "' != '" + 2168.222222222222d + "'", double61 == 2168.222222222222d);
        org.junit.Assert.assertTrue("'" + long64 + "' != '" + 0L + "'", long64 == 0L);
        org.junit.Assert.assertNotNull(doubleArray73);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray73), "[-1.0, 100.0, 97.0, 0.0, 1.0, -1.0]");
        org.junit.Assert.assertTrue("'" + double74 + "' != '" + 2168.222222222222d + "'", double74 == 2168.222222222222d);
        org.junit.Assert.assertTrue(Double.isNaN(double81));
        org.junit.Assert.assertNotNull(doubleArray86);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray86), "[-1.0, 2168.222222222222, 16.566666666418314, 10.0]");
        org.junit.Assert.assertTrue("'" + boolean88 + "' != '" + false + "'", boolean88 == false);
        org.junit.Assert.assertTrue(Double.isNaN(double92));
    }

    @Test
    public void test1540() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1540");
        org.apache.commons.math.stat.descriptive.moment.Variance variance1 = new org.apache.commons.math.stat.descriptive.moment.Variance(false);
        double[] doubleArray8 = new double[] { (byte) -1, (short) 100, 'a', 0, 1, (-1.0d) };
        double double9 = variance1.evaluate(doubleArray8);
        double double10 = variance1.getResult();
        double double11 = variance1.getResult();
        double[] doubleArray12 = null;
        // The following exception was thrown during execution in test generation
        try {
            double double15 = variance1.evaluate(doubleArray12, (int) (short) 0, (int) 'a');
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: input value array is null");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(doubleArray8);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray8), "[-1.0, 100.0, 97.0, 0.0, 1.0, -1.0]");
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 2168.222222222222d + "'", double9 == 2168.222222222222d);
        org.junit.Assert.assertTrue(Double.isNaN(double10));
        org.junit.Assert.assertTrue(Double.isNaN(double11));
    }

    @Test
    public void test1541() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1541");
        org.apache.commons.math.stat.descriptive.moment.Variance variance1 = new org.apache.commons.math.stat.descriptive.moment.Variance(false);
        double[] doubleArray8 = new double[] { (byte) -1, (short) 100, 'a', 0, 1, (-1.0d) };
        double double9 = variance1.evaluate(doubleArray8);
        variance1.setBiasCorrected(true);
        org.apache.commons.math.stat.descriptive.moment.Variance variance13 = new org.apache.commons.math.stat.descriptive.moment.Variance(false);
        double[] doubleArray20 = new double[] { (byte) -1, (short) 100, 'a', 0, 1, (-1.0d) };
        double double21 = variance13.evaluate(doubleArray20);
        variance13.setBiasCorrected(true);
        boolean boolean24 = variance13.isBiasCorrected();
        double[] doubleArray31 = new double[] { (short) 0, 1.0d, 1L, 0.0d, (-1.0d), 10L };
        double double32 = variance13.evaluate(doubleArray31);
        double double35 = variance1.evaluate(doubleArray31, (int) (byte) 1, (int) (byte) 0);
        org.apache.commons.math.stat.descriptive.moment.Variance variance37 = new org.apache.commons.math.stat.descriptive.moment.Variance(false);
        org.apache.commons.math.stat.descriptive.moment.Variance variance39 = new org.apache.commons.math.stat.descriptive.moment.Variance(false);
        double[] doubleArray46 = new double[] { (byte) -1, (short) 100, 'a', 0, 1, (-1.0d) };
        double double47 = variance39.evaluate(doubleArray46);
        variance39.setBiasCorrected(true);
        org.apache.commons.math.stat.descriptive.moment.Variance variance51 = new org.apache.commons.math.stat.descriptive.moment.Variance(false);
        double[] doubleArray58 = new double[] { (byte) -1, (short) 100, 'a', 0, 1, (-1.0d) };
        double double59 = variance51.evaluate(doubleArray58);
        variance51.setBiasCorrected(true);
        org.apache.commons.math.stat.descriptive.moment.Variance variance63 = new org.apache.commons.math.stat.descriptive.moment.Variance(false);
        double[] doubleArray70 = new double[] { (byte) -1, (short) 100, 'a', 0, 1, (-1.0d) };
        double double71 = variance63.evaluate(doubleArray70);
        variance63.setBiasCorrected(true);
        boolean boolean74 = variance63.isBiasCorrected();
        double[] doubleArray81 = new double[] { (short) 0, 1.0d, 1L, 0.0d, (-1.0d), 10L };
        double double82 = variance63.evaluate(doubleArray81);
        double double85 = variance51.evaluate(doubleArray81, (int) (byte) 1, (int) (byte) 0);
        variance39.incrementAll(doubleArray81, (int) (byte) 1, 1);
        double double89 = variance37.evaluate(doubleArray81);
        double double90 = variance1.evaluate(doubleArray81);
        long long91 = variance1.getN();
        variance1.clear();
        boolean boolean93 = variance1.isBiasCorrected();
        variance1.increment(2601.8666666666672d);
        org.junit.Assert.assertNotNull(doubleArray8);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray8), "[-1.0, 100.0, 97.0, 0.0, 1.0, -1.0]");
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 2168.222222222222d + "'", double9 == 2168.222222222222d);
        org.junit.Assert.assertNotNull(doubleArray20);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray20), "[-1.0, 100.0, 97.0, 0.0, 1.0, -1.0]");
        org.junit.Assert.assertTrue("'" + double21 + "' != '" + 2168.222222222222d + "'", double21 == 2168.222222222222d);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + true + "'", boolean24 == true);
        org.junit.Assert.assertNotNull(doubleArray31);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray31), "[0.0, 1.0, 1.0, 0.0, -1.0, 10.0]");
        org.junit.Assert.assertTrue("'" + double32 + "' != '" + 16.566666666666663d + "'", double32 == 16.566666666666663d);
        org.junit.Assert.assertTrue(Double.isNaN(double35));
        org.junit.Assert.assertNotNull(doubleArray46);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray46), "[-1.0, 100.0, 97.0, 0.0, 1.0, -1.0]");
        org.junit.Assert.assertTrue("'" + double47 + "' != '" + 2168.222222222222d + "'", double47 == 2168.222222222222d);
        org.junit.Assert.assertNotNull(doubleArray58);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray58), "[-1.0, 100.0, 97.0, 0.0, 1.0, -1.0]");
        org.junit.Assert.assertTrue("'" + double59 + "' != '" + 2168.222222222222d + "'", double59 == 2168.222222222222d);
        org.junit.Assert.assertNotNull(doubleArray70);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray70), "[-1.0, 100.0, 97.0, 0.0, 1.0, -1.0]");
        org.junit.Assert.assertTrue("'" + double71 + "' != '" + 2168.222222222222d + "'", double71 == 2168.222222222222d);
        org.junit.Assert.assertTrue("'" + boolean74 + "' != '" + true + "'", boolean74 == true);
        org.junit.Assert.assertNotNull(doubleArray81);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray81), "[0.0, 1.0, 1.0, 0.0, -1.0, 10.0]");
        org.junit.Assert.assertTrue("'" + double82 + "' != '" + 16.566666666666663d + "'", double82 == 16.566666666666663d);
        org.junit.Assert.assertTrue(Double.isNaN(double85));
        org.junit.Assert.assertTrue("'" + double89 + "' != '" + 13.805555555555552d + "'", double89 == 13.805555555555552d);
        org.junit.Assert.assertTrue("'" + double90 + "' != '" + 16.566666666666663d + "'", double90 == 16.566666666666663d);
        org.junit.Assert.assertTrue("'" + long91 + "' != '" + 0L + "'", long91 == 0L);
        org.junit.Assert.assertTrue("'" + boolean93 + "' != '" + true + "'", boolean93 == true);
    }

    @Test
    public void test1542() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1542");
        org.apache.commons.math.stat.descriptive.moment.Variance variance1 = new org.apache.commons.math.stat.descriptive.moment.Variance(false);
        double[] doubleArray8 = new double[] { (byte) -1, (short) 100, 'a', 0, 1, (-1.0d) };
        double double9 = variance1.evaluate(doubleArray8);
        variance1.setBiasCorrected(true);
        long long12 = variance1.getN();
        long long13 = variance1.getN();
        variance1.setBiasCorrected(true);
        org.apache.commons.math.stat.descriptive.moment.Variance variance17 = new org.apache.commons.math.stat.descriptive.moment.Variance(false);
        double[] doubleArray24 = new double[] { (byte) -1, (short) 100, 'a', 0, 1, (-1.0d) };
        double double25 = variance17.evaluate(doubleArray24);
        variance17.setBiasCorrected(true);
        long long28 = variance17.getN();
        long long29 = variance17.getN();
        boolean boolean30 = variance17.isBiasCorrected();
        long long31 = variance17.getN();
        org.apache.commons.math.stat.descriptive.moment.Variance variance33 = new org.apache.commons.math.stat.descriptive.moment.Variance(false);
        double[] doubleArray40 = new double[] { (byte) -1, (short) 100, 'a', 0, 1, (-1.0d) };
        double double41 = variance33.evaluate(doubleArray40);
        variance33.setBiasCorrected(true);
        long long44 = variance33.getN();
        variance33.clear();
        double double46 = variance33.getResult();
        org.apache.commons.math.stat.descriptive.moment.Variance variance48 = new org.apache.commons.math.stat.descriptive.moment.Variance(false);
        double[] doubleArray55 = new double[] { (byte) -1, (short) 100, 'a', 0, 1, (-1.0d) };
        double double56 = variance48.evaluate(doubleArray55);
        variance48.setBiasCorrected(true);
        boolean boolean59 = variance48.isBiasCorrected();
        double[] doubleArray66 = new double[] { (short) 0, 1.0d, 1L, 0.0d, (-1.0d), 10L };
        double double67 = variance48.evaluate(doubleArray66);
        boolean boolean69 = variance48.equals((java.lang.Object) 10.0d);
        org.apache.commons.math.stat.descriptive.moment.Variance variance71 = new org.apache.commons.math.stat.descriptive.moment.Variance(false);
        double[] doubleArray78 = new double[] { (byte) -1, (short) 100, 'a', 0, 1, (-1.0d) };
        double double79 = variance71.evaluate(doubleArray78);
        variance71.setBiasCorrected(true);
        boolean boolean82 = variance71.isBiasCorrected();
        double[] doubleArray89 = new double[] { (short) 0, 1.0d, 1L, 0.0d, (-1.0d), 10L };
        double double90 = variance71.evaluate(doubleArray89);
        double double92 = variance48.evaluate(doubleArray89, (double) 0.0f);
        variance33.incrementAll(doubleArray89);
        double double94 = variance17.evaluate(doubleArray89);
        // The following exception was thrown during execution in test generation
        try {
            double double98 = variance1.evaluate(doubleArray89, 2168.222222223878d, (int) (byte) -1, (int) (short) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: start position cannot be negative");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(doubleArray8);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray8), "[-1.0, 100.0, 97.0, 0.0, 1.0, -1.0]");
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 2168.222222222222d + "'", double9 == 2168.222222222222d);
        org.junit.Assert.assertTrue("'" + long12 + "' != '" + 0L + "'", long12 == 0L);
        org.junit.Assert.assertTrue("'" + long13 + "' != '" + 0L + "'", long13 == 0L);
        org.junit.Assert.assertNotNull(doubleArray24);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray24), "[-1.0, 100.0, 97.0, 0.0, 1.0, -1.0]");
        org.junit.Assert.assertTrue("'" + double25 + "' != '" + 2168.222222222222d + "'", double25 == 2168.222222222222d);
        org.junit.Assert.assertTrue("'" + long28 + "' != '" + 0L + "'", long28 == 0L);
        org.junit.Assert.assertTrue("'" + long29 + "' != '" + 0L + "'", long29 == 0L);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + true + "'", boolean30 == true);
        org.junit.Assert.assertTrue("'" + long31 + "' != '" + 0L + "'", long31 == 0L);
        org.junit.Assert.assertNotNull(doubleArray40);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray40), "[-1.0, 100.0, 97.0, 0.0, 1.0, -1.0]");
        org.junit.Assert.assertTrue("'" + double41 + "' != '" + 2168.222222222222d + "'", double41 == 2168.222222222222d);
        org.junit.Assert.assertTrue("'" + long44 + "' != '" + 0L + "'", long44 == 0L);
        org.junit.Assert.assertTrue(Double.isNaN(double46));
        org.junit.Assert.assertNotNull(doubleArray55);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray55), "[-1.0, 100.0, 97.0, 0.0, 1.0, -1.0]");
        org.junit.Assert.assertTrue("'" + double56 + "' != '" + 2168.222222222222d + "'", double56 == 2168.222222222222d);
        org.junit.Assert.assertTrue("'" + boolean59 + "' != '" + true + "'", boolean59 == true);
        org.junit.Assert.assertNotNull(doubleArray66);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray66), "[0.0, 1.0, 1.0, 0.0, -1.0, 10.0]");
        org.junit.Assert.assertTrue("'" + double67 + "' != '" + 16.566666666666663d + "'", double67 == 16.566666666666663d);
        org.junit.Assert.assertTrue("'" + boolean69 + "' != '" + false + "'", boolean69 == false);
        org.junit.Assert.assertNotNull(doubleArray78);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray78), "[-1.0, 100.0, 97.0, 0.0, 1.0, -1.0]");
        org.junit.Assert.assertTrue("'" + double79 + "' != '" + 2168.222222222222d + "'", double79 == 2168.222222222222d);
        org.junit.Assert.assertTrue("'" + boolean82 + "' != '" + true + "'", boolean82 == true);
        org.junit.Assert.assertNotNull(doubleArray89);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray89), "[0.0, 1.0, 1.0, 0.0, -1.0, 10.0]");
        org.junit.Assert.assertTrue("'" + double90 + "' != '" + 16.566666666666663d + "'", double90 == 16.566666666666663d);
        org.junit.Assert.assertTrue("'" + double92 + "' != '" + 16.566666666666666d + "'", double92 == 16.566666666666666d);
        org.junit.Assert.assertTrue("'" + double94 + "' != '" + 16.566666666666663d + "'", double94 == 16.566666666666663d);
    }

    @Test
    public void test1543() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1543");
        org.apache.commons.math.stat.descriptive.moment.Variance variance1 = new org.apache.commons.math.stat.descriptive.moment.Variance(false);
        double[] doubleArray8 = new double[] { (byte) -1, (short) 100, 'a', 0, 1, (-1.0d) };
        double double9 = variance1.evaluate(doubleArray8);
        variance1.setBiasCorrected(true);
        org.apache.commons.math.stat.descriptive.moment.Variance variance13 = new org.apache.commons.math.stat.descriptive.moment.Variance(false);
        double[] doubleArray20 = new double[] { (byte) -1, (short) 100, 'a', 0, 1, (-1.0d) };
        double double21 = variance13.evaluate(doubleArray20);
        variance13.setBiasCorrected(true);
        boolean boolean24 = variance13.isBiasCorrected();
        double[] doubleArray31 = new double[] { (short) 0, 1.0d, 1L, 0.0d, (-1.0d), 10L };
        double double32 = variance13.evaluate(doubleArray31);
        double double35 = variance1.evaluate(doubleArray31, (int) (byte) 1, (int) (byte) 0);
        variance1.setBiasCorrected(true);
        variance1.setBiasCorrected(false);
        double double40 = variance1.getResult();
        variance1.clear();
        org.junit.Assert.assertNotNull(doubleArray8);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray8), "[-1.0, 100.0, 97.0, 0.0, 1.0, -1.0]");
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 2168.222222222222d + "'", double9 == 2168.222222222222d);
        org.junit.Assert.assertNotNull(doubleArray20);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray20), "[-1.0, 100.0, 97.0, 0.0, 1.0, -1.0]");
        org.junit.Assert.assertTrue("'" + double21 + "' != '" + 2168.222222222222d + "'", double21 == 2168.222222222222d);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + true + "'", boolean24 == true);
        org.junit.Assert.assertNotNull(doubleArray31);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray31), "[0.0, 1.0, 1.0, 0.0, -1.0, 10.0]");
        org.junit.Assert.assertTrue("'" + double32 + "' != '" + 16.566666666666663d + "'", double32 == 16.566666666666663d);
        org.junit.Assert.assertTrue(Double.isNaN(double35));
        org.junit.Assert.assertTrue(Double.isNaN(double40));
    }

    @Test
    public void test1544() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1544");
        org.apache.commons.math.stat.descriptive.moment.Variance variance1 = new org.apache.commons.math.stat.descriptive.moment.Variance(false);
        double[] doubleArray8 = new double[] { (byte) -1, (short) 100, 'a', 0, 1, (-1.0d) };
        double double9 = variance1.evaluate(doubleArray8);
        variance1.setBiasCorrected(true);
        boolean boolean12 = variance1.isBiasCorrected();
        double[] doubleArray19 = new double[] { (short) 0, 1.0d, 1L, 0.0d, (-1.0d), 10L };
        double double20 = variance1.evaluate(doubleArray19);
        boolean boolean22 = variance1.equals((java.lang.Object) 10.0d);
        boolean boolean23 = variance1.isBiasCorrected();
        org.apache.commons.math.stat.descriptive.moment.Variance variance25 = new org.apache.commons.math.stat.descriptive.moment.Variance(false);
        boolean boolean26 = variance1.equals((java.lang.Object) false);
        org.apache.commons.math.stat.descriptive.moment.Variance variance28 = new org.apache.commons.math.stat.descriptive.moment.Variance(false);
        double[] doubleArray35 = new double[] { (byte) -1, (short) 100, 'a', 0, 1, (-1.0d) };
        double double36 = variance28.evaluate(doubleArray35);
        variance28.setBiasCorrected(true);
        org.apache.commons.math.stat.descriptive.moment.Variance variance40 = new org.apache.commons.math.stat.descriptive.moment.Variance(false);
        double[] doubleArray47 = new double[] { (byte) -1, (short) 100, 'a', 0, 1, (-1.0d) };
        double double48 = variance40.evaluate(doubleArray47);
        variance28.incrementAll(doubleArray47);
        double double51 = variance1.evaluate(doubleArray47, (double) 100.0f);
        long long52 = variance1.getN();
        long long53 = variance1.getN();
        variance1.setBiasCorrected(false);
        variance1.setBiasCorrected(false);
        long long58 = variance1.getN();
        java.lang.Class<?> wildcardClass59 = variance1.getClass();
        org.junit.Assert.assertNotNull(doubleArray8);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray8), "[-1.0, 100.0, 97.0, 0.0, 1.0, -1.0]");
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 2168.222222222222d + "'", double9 == 2168.222222222222d);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertNotNull(doubleArray19);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray19), "[0.0, 1.0, 1.0, 0.0, -1.0, 10.0]");
        org.junit.Assert.assertTrue("'" + double20 + "' != '" + 16.566666666666663d + "'", double20 == 16.566666666666663d);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + true + "'", boolean23 == true);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
        org.junit.Assert.assertNotNull(doubleArray35);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray35), "[-1.0, 100.0, 97.0, 0.0, 1.0, -1.0]");
        org.junit.Assert.assertTrue("'" + double36 + "' != '" + 2168.222222222222d + "'", double36 == 2168.222222222222d);
        org.junit.Assert.assertNotNull(doubleArray47);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray47), "[-1.0, 100.0, 97.0, 0.0, 1.0, -1.0]");
        org.junit.Assert.assertTrue("'" + double48 + "' != '" + 2168.222222222222d + "'", double48 == 2168.222222222222d);
        org.junit.Assert.assertTrue("'" + double51 + "' != '" + 2601.8666666666663d + "'", double51 == 2601.8666666666663d);
        org.junit.Assert.assertTrue("'" + long52 + "' != '" + 0L + "'", long52 == 0L);
        org.junit.Assert.assertTrue("'" + long53 + "' != '" + 0L + "'", long53 == 0L);
        org.junit.Assert.assertTrue("'" + long58 + "' != '" + 0L + "'", long58 == 0L);
        org.junit.Assert.assertNotNull(wildcardClass59);
    }

    @Test
    public void test1545() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1545");
        org.apache.commons.math.stat.descriptive.moment.Variance variance1 = new org.apache.commons.math.stat.descriptive.moment.Variance(false);
        double[] doubleArray8 = new double[] { (byte) -1, (short) 100, 'a', 0, 1, (-1.0d) };
        double double9 = variance1.evaluate(doubleArray8);
        long long10 = variance1.getN();
        boolean boolean12 = variance1.equals((java.lang.Object) (byte) 0);
        org.apache.commons.math.stat.descriptive.moment.Variance variance14 = new org.apache.commons.math.stat.descriptive.moment.Variance(true);
        double double15 = variance14.getResult();
        double double16 = variance14.getResult();
        org.apache.commons.math.stat.descriptive.moment.Variance variance18 = new org.apache.commons.math.stat.descriptive.moment.Variance(false);
        double[] doubleArray25 = new double[] { (byte) -1, (short) 100, 'a', 0, 1, (-1.0d) };
        double double26 = variance18.evaluate(doubleArray25);
        variance18.setBiasCorrected(true);
        org.apache.commons.math.stat.descriptive.moment.Variance variance30 = new org.apache.commons.math.stat.descriptive.moment.Variance(false);
        double[] doubleArray37 = new double[] { (byte) -1, (short) 100, 'a', 0, 1, (-1.0d) };
        double double38 = variance30.evaluate(doubleArray37);
        variance18.incrementAll(doubleArray37);
        variance18.clear();
        variance18.setBiasCorrected(false);
        org.apache.commons.math.stat.descriptive.moment.Variance variance44 = new org.apache.commons.math.stat.descriptive.moment.Variance(false);
        double[] doubleArray51 = new double[] { (byte) -1, (short) 100, 'a', 0, 1, (-1.0d) };
        double double52 = variance44.evaluate(doubleArray51);
        variance44.setBiasCorrected(true);
        long long55 = variance44.getN();
        long long56 = variance44.getN();
        boolean boolean58 = variance44.equals((java.lang.Object) 16.566666666666663d);
        boolean boolean60 = variance44.equals((java.lang.Object) (short) 10);
        org.apache.commons.math.stat.descriptive.moment.Variance variance62 = new org.apache.commons.math.stat.descriptive.moment.Variance(false);
        double[] doubleArray69 = new double[] { (byte) -1, (short) 100, 'a', 0, 1, (-1.0d) };
        double double70 = variance62.evaluate(doubleArray69);
        variance62.setBiasCorrected(true);
        org.apache.commons.math.stat.descriptive.moment.Variance variance74 = new org.apache.commons.math.stat.descriptive.moment.Variance(false);
        double[] doubleArray81 = new double[] { (byte) -1, (short) 100, 'a', 0, 1, (-1.0d) };
        double double82 = variance74.evaluate(doubleArray81);
        variance62.incrementAll(doubleArray81);
        double double84 = variance44.evaluate(doubleArray81);
        double double86 = variance18.evaluate(doubleArray81, (double) (byte) 100);
        double double88 = variance14.evaluate(doubleArray81, (double) (-1));
        // The following exception was thrown during execution in test generation
        try {
            double double91 = variance1.evaluate(doubleArray81, 0, (int) (short) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: length cannot be negative");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(doubleArray8);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray8), "[-1.0, 100.0, 97.0, 0.0, 1.0, -1.0]");
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 2168.222222222222d + "'", double9 == 2168.222222222222d);
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + 0L + "'", long10 == 0L);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue(Double.isNaN(double15));
        org.junit.Assert.assertTrue(Double.isNaN(double16));
        org.junit.Assert.assertNotNull(doubleArray25);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray25), "[-1.0, 100.0, 97.0, 0.0, 1.0, -1.0]");
        org.junit.Assert.assertTrue("'" + double26 + "' != '" + 2168.222222222222d + "'", double26 == 2168.222222222222d);
        org.junit.Assert.assertNotNull(doubleArray37);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray37), "[-1.0, 100.0, 97.0, 0.0, 1.0, -1.0]");
        org.junit.Assert.assertTrue("'" + double38 + "' != '" + 2168.222222222222d + "'", double38 == 2168.222222222222d);
        org.junit.Assert.assertNotNull(doubleArray51);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray51), "[-1.0, 100.0, 97.0, 0.0, 1.0, -1.0]");
        org.junit.Assert.assertTrue("'" + double52 + "' != '" + 2168.222222222222d + "'", double52 == 2168.222222222222d);
        org.junit.Assert.assertTrue("'" + long55 + "' != '" + 0L + "'", long55 == 0L);
        org.junit.Assert.assertTrue("'" + long56 + "' != '" + 0L + "'", long56 == 0L);
        org.junit.Assert.assertTrue("'" + boolean58 + "' != '" + false + "'", boolean58 == false);
        org.junit.Assert.assertTrue("'" + boolean60 + "' != '" + false + "'", boolean60 == false);
        org.junit.Assert.assertNotNull(doubleArray69);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray69), "[-1.0, 100.0, 97.0, 0.0, 1.0, -1.0]");
        org.junit.Assert.assertTrue("'" + double70 + "' != '" + 2168.222222222222d + "'", double70 == 2168.222222222222d);
        org.junit.Assert.assertNotNull(doubleArray81);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray81), "[-1.0, 100.0, 97.0, 0.0, 1.0, -1.0]");
        org.junit.Assert.assertTrue("'" + double82 + "' != '" + 2168.222222222222d + "'", double82 == 2168.222222222222d);
        org.junit.Assert.assertTrue("'" + double84 + "' != '" + 2601.866666666667d + "'", double84 == 2601.866666666667d);
        org.junit.Assert.assertTrue("'" + double86 + "' != '" + 2168.222222222222d + "'", double86 == 2168.222222222222d);
        org.junit.Assert.assertTrue("'" + double88 + "' != '" + 2601.8666666666663d + "'", double88 == 2601.8666666666663d);
    }

    @Test
    public void test1546() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1546");
        org.apache.commons.math.stat.descriptive.moment.Variance variance1 = new org.apache.commons.math.stat.descriptive.moment.Variance(false);
        variance1.setBiasCorrected(false);
        long long4 = variance1.getN();
        variance1.increment((double) 0.0f);
        long long7 = variance1.getN();
        variance1.setBiasCorrected(false);
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 0L + "'", long4 == 0L);
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + 1L + "'", long7 == 1L);
    }

    @Test
    public void test1547() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1547");
        org.apache.commons.math.stat.descriptive.moment.Variance variance1 = new org.apache.commons.math.stat.descriptive.moment.Variance(false);
        double[] doubleArray8 = new double[] { (byte) -1, (short) 100, 'a', 0, 1, (-1.0d) };
        double double9 = variance1.evaluate(doubleArray8);
        variance1.setBiasCorrected(true);
        boolean boolean12 = variance1.isBiasCorrected();
        double[] doubleArray19 = new double[] { (short) 0, 1.0d, 1L, 0.0d, (-1.0d), 10L };
        double double20 = variance1.evaluate(doubleArray19);
        boolean boolean22 = variance1.equals((java.lang.Object) 10.0d);
        boolean boolean23 = variance1.isBiasCorrected();
        double double24 = variance1.getResult();
        double double25 = variance1.getResult();
        long long26 = variance1.getN();
        long long27 = variance1.getN();
        long long28 = variance1.getN();
        variance1.clear();
        org.junit.Assert.assertNotNull(doubleArray8);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray8), "[-1.0, 100.0, 97.0, 0.0, 1.0, -1.0]");
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 2168.222222222222d + "'", double9 == 2168.222222222222d);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertNotNull(doubleArray19);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray19), "[0.0, 1.0, 1.0, 0.0, -1.0, 10.0]");
        org.junit.Assert.assertTrue("'" + double20 + "' != '" + 16.566666666666663d + "'", double20 == 16.566666666666663d);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + true + "'", boolean23 == true);
        org.junit.Assert.assertTrue(Double.isNaN(double24));
        org.junit.Assert.assertTrue(Double.isNaN(double25));
        org.junit.Assert.assertTrue("'" + long26 + "' != '" + 0L + "'", long26 == 0L);
        org.junit.Assert.assertTrue("'" + long27 + "' != '" + 0L + "'", long27 == 0L);
        org.junit.Assert.assertTrue("'" + long28 + "' != '" + 0L + "'", long28 == 0L);
    }

    @Test
    public void test1548() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1548");
        org.apache.commons.math.stat.descriptive.moment.Variance variance1 = new org.apache.commons.math.stat.descriptive.moment.Variance(false);
        double[] doubleArray8 = new double[] { (byte) -1, (short) 100, 'a', 0, 1, (-1.0d) };
        double double9 = variance1.evaluate(doubleArray8);
        long long10 = variance1.getN();
        variance1.increment((double) (byte) 1);
        variance1.increment((double) 6L);
        double double15 = variance1.getResult();
        variance1.clear();
        boolean boolean17 = variance1.isBiasCorrected();
        org.apache.commons.math.stat.descriptive.moment.Variance variance19 = new org.apache.commons.math.stat.descriptive.moment.Variance(false);
        double[] doubleArray26 = new double[] { (byte) -1, (short) 100, 'a', 0, 1, (-1.0d) };
        double double27 = variance19.evaluate(doubleArray26);
        variance19.setBiasCorrected(true);
        boolean boolean30 = variance19.isBiasCorrected();
        double[] doubleArray37 = new double[] { (short) 0, 1.0d, 1L, 0.0d, (-1.0d), 10L };
        double double38 = variance19.evaluate(doubleArray37);
        boolean boolean40 = variance19.equals((java.lang.Object) 10.0d);
        boolean boolean41 = variance19.isBiasCorrected();
        org.apache.commons.math.stat.descriptive.moment.Variance variance43 = new org.apache.commons.math.stat.descriptive.moment.Variance(false);
        boolean boolean44 = variance19.equals((java.lang.Object) false);
        org.apache.commons.math.stat.descriptive.moment.Variance variance46 = new org.apache.commons.math.stat.descriptive.moment.Variance(false);
        double[] doubleArray53 = new double[] { (byte) -1, (short) 100, 'a', 0, 1, (-1.0d) };
        double double54 = variance46.evaluate(doubleArray53);
        variance46.setBiasCorrected(true);
        org.apache.commons.math.stat.descriptive.moment.Variance variance58 = new org.apache.commons.math.stat.descriptive.moment.Variance(false);
        double[] doubleArray65 = new double[] { (byte) -1, (short) 100, 'a', 0, 1, (-1.0d) };
        double double66 = variance58.evaluate(doubleArray65);
        variance46.incrementAll(doubleArray65);
        double double69 = variance19.evaluate(doubleArray65, (double) 100.0f);
        variance19.clear();
        boolean boolean71 = variance19.isBiasCorrected();
        org.apache.commons.math.stat.descriptive.moment.Variance variance73 = new org.apache.commons.math.stat.descriptive.moment.Variance(false);
        double[] doubleArray80 = new double[] { (byte) -1, (short) 100, 'a', 0, 1, (-1.0d) };
        double double81 = variance73.evaluate(doubleArray80);
        variance73.setBiasCorrected(true);
        long long84 = variance73.getN();
        variance73.clear();
        org.apache.commons.math.stat.descriptive.moment.Variance variance87 = new org.apache.commons.math.stat.descriptive.moment.Variance(false);
        double[] doubleArray94 = new double[] { (byte) -1, (short) 100, 'a', 0, 1, (-1.0d) };
        double double95 = variance87.evaluate(doubleArray94);
        double double96 = variance73.evaluate(doubleArray94);
        double double97 = variance19.evaluate(doubleArray94);
        variance1.incrementAll(doubleArray94);
        org.junit.Assert.assertNotNull(doubleArray8);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray8), "[-1.0, 100.0, 97.0, 0.0, 1.0, -1.0]");
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 2168.222222222222d + "'", double9 == 2168.222222222222d);
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + 0L + "'", long10 == 0L);
        org.junit.Assert.assertTrue("'" + double15 + "' != '" + 6.25d + "'", double15 == 6.25d);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertNotNull(doubleArray26);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray26), "[-1.0, 100.0, 97.0, 0.0, 1.0, -1.0]");
        org.junit.Assert.assertTrue("'" + double27 + "' != '" + 2168.222222222222d + "'", double27 == 2168.222222222222d);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + true + "'", boolean30 == true);
        org.junit.Assert.assertNotNull(doubleArray37);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray37), "[0.0, 1.0, 1.0, 0.0, -1.0, 10.0]");
        org.junit.Assert.assertTrue("'" + double38 + "' != '" + 16.566666666666663d + "'", double38 == 16.566666666666663d);
        org.junit.Assert.assertTrue("'" + boolean40 + "' != '" + false + "'", boolean40 == false);
        org.junit.Assert.assertTrue("'" + boolean41 + "' != '" + true + "'", boolean41 == true);
        org.junit.Assert.assertTrue("'" + boolean44 + "' != '" + false + "'", boolean44 == false);
        org.junit.Assert.assertNotNull(doubleArray53);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray53), "[-1.0, 100.0, 97.0, 0.0, 1.0, -1.0]");
        org.junit.Assert.assertTrue("'" + double54 + "' != '" + 2168.222222222222d + "'", double54 == 2168.222222222222d);
        org.junit.Assert.assertNotNull(doubleArray65);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray65), "[-1.0, 100.0, 97.0, 0.0, 1.0, -1.0]");
        org.junit.Assert.assertTrue("'" + double66 + "' != '" + 2168.222222222222d + "'", double66 == 2168.222222222222d);
        org.junit.Assert.assertTrue("'" + double69 + "' != '" + 2601.8666666666663d + "'", double69 == 2601.8666666666663d);
        org.junit.Assert.assertTrue("'" + boolean71 + "' != '" + true + "'", boolean71 == true);
        org.junit.Assert.assertNotNull(doubleArray80);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray80), "[-1.0, 100.0, 97.0, 0.0, 1.0, -1.0]");
        org.junit.Assert.assertTrue("'" + double81 + "' != '" + 2168.222222222222d + "'", double81 == 2168.222222222222d);
        org.junit.Assert.assertTrue("'" + long84 + "' != '" + 0L + "'", long84 == 0L);
        org.junit.Assert.assertNotNull(doubleArray94);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray94), "[-1.0, 100.0, 97.0, 0.0, 1.0, -1.0]");
        org.junit.Assert.assertTrue("'" + double95 + "' != '" + 2168.222222222222d + "'", double95 == 2168.222222222222d);
        org.junit.Assert.assertTrue("'" + double96 + "' != '" + 2601.866666666667d + "'", double96 == 2601.866666666667d);
        org.junit.Assert.assertTrue("'" + double97 + "' != '" + 2601.866666666667d + "'", double97 == 2601.866666666667d);
    }

    @Test
    public void test1549() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1549");
        org.apache.commons.math.stat.descriptive.moment.Variance variance1 = new org.apache.commons.math.stat.descriptive.moment.Variance(false);
        variance1.clear();
        double double3 = variance1.getResult();
        double[] doubleArray8 = new double[] { (-1), 2168.222222222222d, 16.566666666418314d, 10.0d };
        variance1.incrementAll(doubleArray8);
        org.apache.commons.math.stat.descriptive.moment.Variance variance11 = new org.apache.commons.math.stat.descriptive.moment.Variance(false);
        double[] doubleArray18 = new double[] { (byte) -1, (short) 100, 'a', 0, 1, (-1.0d) };
        double double19 = variance11.evaluate(doubleArray18);
        variance11.setBiasCorrected(true);
        boolean boolean22 = variance11.isBiasCorrected();
        double[] doubleArray29 = new double[] { (short) 0, 1.0d, 1L, 0.0d, (-1.0d), 10L };
        double double30 = variance11.evaluate(doubleArray29);
        double double31 = variance11.getResult();
        variance11.setBiasCorrected(true);
        boolean boolean34 = variance11.isBiasCorrected();
        variance11.setBiasCorrected(false);
        variance11.increment(2601.866666666667d);
        org.apache.commons.math.stat.descriptive.moment.Variance variance40 = new org.apache.commons.math.stat.descriptive.moment.Variance(false);
        double[] doubleArray47 = new double[] { (byte) -1, (short) 100, 'a', 0, 1, (-1.0d) };
        double double48 = variance40.evaluate(doubleArray47);
        variance40.clear();
        variance40.setBiasCorrected(true);
        double double52 = variance40.getResult();
        org.apache.commons.math.stat.descriptive.moment.Variance variance54 = new org.apache.commons.math.stat.descriptive.moment.Variance(false);
        double[] doubleArray61 = new double[] { (byte) -1, (short) 100, 'a', 0, 1, (-1.0d) };
        double double62 = variance54.evaluate(doubleArray61);
        double double63 = variance40.evaluate(doubleArray61);
        double double64 = variance11.evaluate(doubleArray61);
        double double65 = variance1.evaluate(doubleArray61);
        variance1.increment((double) 0.0f);
        double double68 = variance1.getResult();
        variance1.setBiasCorrected(false);
        double[] doubleArray71 = null;
        // The following exception was thrown during execution in test generation
        try {
            double double73 = variance1.evaluate(doubleArray71, 16.566666666666663d);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue(Double.isNaN(double3));
        org.junit.Assert.assertNotNull(doubleArray8);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray8), "[-1.0, 2168.222222222222, 16.566666666418314, 10.0]");
        org.junit.Assert.assertNotNull(doubleArray18);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray18), "[-1.0, 100.0, 97.0, 0.0, 1.0, -1.0]");
        org.junit.Assert.assertTrue("'" + double19 + "' != '" + 2168.222222222222d + "'", double19 == 2168.222222222222d);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + true + "'", boolean22 == true);
        org.junit.Assert.assertNotNull(doubleArray29);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray29), "[0.0, 1.0, 1.0, 0.0, -1.0, 10.0]");
        org.junit.Assert.assertTrue("'" + double30 + "' != '" + 16.566666666666663d + "'", double30 == 16.566666666666663d);
        org.junit.Assert.assertTrue(Double.isNaN(double31));
        org.junit.Assert.assertTrue("'" + boolean34 + "' != '" + true + "'", boolean34 == true);
        org.junit.Assert.assertNotNull(doubleArray47);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray47), "[-1.0, 100.0, 97.0, 0.0, 1.0, -1.0]");
        org.junit.Assert.assertTrue("'" + double48 + "' != '" + 2168.222222222222d + "'", double48 == 2168.222222222222d);
        org.junit.Assert.assertTrue(Double.isNaN(double52));
        org.junit.Assert.assertNotNull(doubleArray61);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray61), "[-1.0, 100.0, 97.0, 0.0, 1.0, -1.0]");
        org.junit.Assert.assertTrue("'" + double62 + "' != '" + 2168.222222222222d + "'", double62 == 2168.222222222222d);
        org.junit.Assert.assertTrue("'" + double63 + "' != '" + 2601.866666666667d + "'", double63 == 2601.866666666667d);
        org.junit.Assert.assertTrue("'" + double64 + "' != '" + 2168.222222222222d + "'", double64 == 2168.222222222222d);
        org.junit.Assert.assertTrue("'" + double65 + "' != '" + 2168.222222222222d + "'", double65 == 2168.222222222222d);
        org.junit.Assert.assertTrue("'" + double68 + "' != '" + 0.0d + "'", double68 == 0.0d);
    }

    @Test
    public void test1550() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1550");
        org.apache.commons.math.stat.descriptive.moment.Variance variance1 = new org.apache.commons.math.stat.descriptive.moment.Variance(false);
        double[] doubleArray8 = new double[] { (byte) -1, (short) 100, 'a', 0, 1, (-1.0d) };
        double double9 = variance1.evaluate(doubleArray8);
        variance1.setBiasCorrected(true);
        variance1.increment((double) (byte) 0);
        double[] doubleArray16 = new double[] { 'a', 100L };
        double double18 = variance1.evaluate(doubleArray16, 0.0d);
        long long19 = variance1.getN();
        boolean boolean20 = variance1.isBiasCorrected();
        long long21 = variance1.getN();
        boolean boolean22 = variance1.isBiasCorrected();
        org.junit.Assert.assertNotNull(doubleArray8);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray8), "[-1.0, 100.0, 97.0, 0.0, 1.0, -1.0]");
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 2168.222222222222d + "'", double9 == 2168.222222222222d);
        org.junit.Assert.assertNotNull(doubleArray16);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray16), "[97.0, 100.0]");
        org.junit.Assert.assertTrue("'" + double18 + "' != '" + 4.5d + "'", double18 == 4.5d);
        org.junit.Assert.assertTrue("'" + long19 + "' != '" + 1L + "'", long19 == 1L);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + true + "'", boolean20 == true);
        org.junit.Assert.assertTrue("'" + long21 + "' != '" + 1L + "'", long21 == 1L);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + true + "'", boolean22 == true);
    }

    @Test
    public void test1551() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1551");
        org.apache.commons.math.stat.descriptive.moment.Variance variance1 = new org.apache.commons.math.stat.descriptive.moment.Variance(true);
        double double2 = variance1.getResult();
        double double3 = variance1.getResult();
        variance1.setBiasCorrected(false);
        org.apache.commons.math.stat.descriptive.moment.Variance variance7 = new org.apache.commons.math.stat.descriptive.moment.Variance(false);
        double[] doubleArray14 = new double[] { (byte) -1, (short) 100, 'a', 0, 1, (-1.0d) };
        double double15 = variance7.evaluate(doubleArray14);
        variance7.setBiasCorrected(true);
        long long18 = variance7.getN();
        long long19 = variance7.getN();
        boolean boolean21 = variance7.equals((java.lang.Object) 16.566666666666663d);
        boolean boolean23 = variance7.equals((java.lang.Object) (short) 10);
        boolean boolean24 = variance7.isBiasCorrected();
        variance7.clear();
        org.apache.commons.math.stat.descriptive.moment.Variance variance27 = new org.apache.commons.math.stat.descriptive.moment.Variance(false);
        double[] doubleArray34 = new double[] { (byte) -1, (short) 100, 'a', 0, 1, (-1.0d) };
        double double35 = variance27.evaluate(doubleArray34);
        long long36 = variance27.getN();
        variance27.increment(874596.4092824734d);
        org.apache.commons.math.stat.descriptive.moment.Variance variance40 = new org.apache.commons.math.stat.descriptive.moment.Variance(false);
        variance40.clear();
        double double42 = variance40.getResult();
        double[] doubleArray47 = new double[] { (-1), 2168.222222222222d, 16.566666666418314d, 10.0d };
        variance40.incrementAll(doubleArray47);
        variance27.incrementAll(doubleArray47, 0, (int) (byte) 1);
        double double53 = variance7.evaluate(doubleArray47, 2178.0d);
        double double55 = variance1.evaluate(doubleArray47, 2.25d);
        org.junit.Assert.assertTrue(Double.isNaN(double2));
        org.junit.Assert.assertTrue(Double.isNaN(double3));
        org.junit.Assert.assertNotNull(doubleArray14);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray14), "[-1.0, 100.0, 97.0, 0.0, 1.0, -1.0]");
        org.junit.Assert.assertTrue("'" + double15 + "' != '" + 2168.222222222222d + "'", double15 == 2168.222222222222d);
        org.junit.Assert.assertTrue("'" + long18 + "' != '" + 0L + "'", long18 == 0L);
        org.junit.Assert.assertTrue("'" + long19 + "' != '" + 0L + "'", long19 == 0L);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + true + "'", boolean24 == true);
        org.junit.Assert.assertNotNull(doubleArray34);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray34), "[-1.0, 100.0, 97.0, 0.0, 1.0, -1.0]");
        org.junit.Assert.assertTrue("'" + double35 + "' != '" + 2168.222222222222d + "'", double35 == 2168.222222222222d);
        org.junit.Assert.assertTrue("'" + long36 + "' != '" + 0L + "'", long36 == 0L);
        org.junit.Assert.assertTrue(Double.isNaN(double42));
        org.junit.Assert.assertNotNull(doubleArray47);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray47), "[-1.0, 2168.222222222222, 16.566666666418314, 10.0]");
        org.junit.Assert.assertTrue("'" + double53 + "' != '" + 1166128.5457099646d + "'", double53 == 1166128.5457099646d);
        org.junit.Assert.assertTrue("'" + double55 + "' != '" + 874596.4092824734d + "'", double55 == 874596.4092824734d);
    }

    @Test
    public void test1552() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1552");
        org.apache.commons.math.stat.descriptive.moment.Variance variance1 = new org.apache.commons.math.stat.descriptive.moment.Variance(false);
        double[] doubleArray8 = new double[] { (byte) -1, (short) 100, 'a', 0, 1, (-1.0d) };
        double double9 = variance1.evaluate(doubleArray8);
        variance1.setBiasCorrected(true);
        boolean boolean12 = variance1.isBiasCorrected();
        double[] doubleArray19 = new double[] { (short) 0, 1.0d, 1L, 0.0d, (-1.0d), 10L };
        double double20 = variance1.evaluate(doubleArray19);
        double double21 = variance1.getResult();
        long long22 = variance1.getN();
        org.apache.commons.math.stat.descriptive.moment.Variance variance24 = new org.apache.commons.math.stat.descriptive.moment.Variance(false);
        double[] doubleArray31 = new double[] { (byte) -1, (short) 100, 'a', 0, 1, (-1.0d) };
        double double32 = variance24.evaluate(doubleArray31);
        variance24.setBiasCorrected(true);
        long long35 = variance24.getN();
        variance24.clear();
        org.apache.commons.math.stat.descriptive.moment.Variance variance38 = new org.apache.commons.math.stat.descriptive.moment.Variance(false);
        double[] doubleArray45 = new double[] { (byte) -1, (short) 100, 'a', 0, 1, (-1.0d) };
        double double46 = variance38.evaluate(doubleArray45);
        double double47 = variance24.evaluate(doubleArray45);
        double double48 = variance1.evaluate(doubleArray45);
        org.apache.commons.math.stat.descriptive.moment.Variance variance50 = new org.apache.commons.math.stat.descriptive.moment.Variance(false);
        double[] doubleArray57 = new double[] { (byte) -1, (short) 100, 'a', 0, 1, (-1.0d) };
        double double58 = variance50.evaluate(doubleArray57);
        variance50.clear();
        variance50.setBiasCorrected(true);
        org.apache.commons.math.stat.descriptive.moment.Variance variance63 = new org.apache.commons.math.stat.descriptive.moment.Variance(false);
        variance63.clear();
        double double65 = variance63.getResult();
        double[] doubleArray70 = new double[] { (-1), 2168.222222222222d, 16.566666666418314d, 10.0d };
        variance63.incrementAll(doubleArray70);
        boolean boolean72 = variance50.equals((java.lang.Object) doubleArray70);
        double double74 = variance1.evaluate(doubleArray70, (double) 0L);
        double double75 = variance1.getResult();
        double double76 = variance1.getResult();
        variance1.increment(23.333333333333332d);
        org.junit.Assert.assertNotNull(doubleArray8);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray8), "[-1.0, 100.0, 97.0, 0.0, 1.0, -1.0]");
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 2168.222222222222d + "'", double9 == 2168.222222222222d);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertNotNull(doubleArray19);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray19), "[0.0, 1.0, 1.0, 0.0, -1.0, 10.0]");
        org.junit.Assert.assertTrue("'" + double20 + "' != '" + 16.566666666666663d + "'", double20 == 16.566666666666663d);
        org.junit.Assert.assertTrue(Double.isNaN(double21));
        org.junit.Assert.assertTrue("'" + long22 + "' != '" + 0L + "'", long22 == 0L);
        org.junit.Assert.assertNotNull(doubleArray31);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray31), "[-1.0, 100.0, 97.0, 0.0, 1.0, -1.0]");
        org.junit.Assert.assertTrue("'" + double32 + "' != '" + 2168.222222222222d + "'", double32 == 2168.222222222222d);
        org.junit.Assert.assertTrue("'" + long35 + "' != '" + 0L + "'", long35 == 0L);
        org.junit.Assert.assertNotNull(doubleArray45);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray45), "[-1.0, 100.0, 97.0, 0.0, 1.0, -1.0]");
        org.junit.Assert.assertTrue("'" + double46 + "' != '" + 2168.222222222222d + "'", double46 == 2168.222222222222d);
        org.junit.Assert.assertTrue("'" + double47 + "' != '" + 2601.866666666667d + "'", double47 == 2601.866666666667d);
        org.junit.Assert.assertTrue("'" + double48 + "' != '" + 2601.866666666667d + "'", double48 == 2601.866666666667d);
        org.junit.Assert.assertNotNull(doubleArray57);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray57), "[-1.0, 100.0, 97.0, 0.0, 1.0, -1.0]");
        org.junit.Assert.assertTrue("'" + double58 + "' != '" + 2168.222222222222d + "'", double58 == 2168.222222222222d);
        org.junit.Assert.assertTrue(Double.isNaN(double65));
        org.junit.Assert.assertNotNull(doubleArray70);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray70), "[-1.0, 2168.222222222222, 16.566666666418314, 10.0]");
        org.junit.Assert.assertTrue("'" + boolean72 + "' != '" + false + "'", boolean72 == false);
        org.junit.Assert.assertTrue("'" + double74 + "' != '" + 1166128.5457099646d + "'", double74 == 1166128.5457099646d);
        org.junit.Assert.assertTrue(Double.isNaN(double75));
        org.junit.Assert.assertTrue(Double.isNaN(double76));
    }

    @Test
    public void test1553() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1553");
        org.apache.commons.math.stat.descriptive.moment.Variance variance1 = new org.apache.commons.math.stat.descriptive.moment.Variance(false);
        double[] doubleArray8 = new double[] { (byte) -1, (short) 100, 'a', 0, 1, (-1.0d) };
        double double9 = variance1.evaluate(doubleArray8);
        variance1.setBiasCorrected(true);
        variance1.increment((double) (byte) 0);
        double[] doubleArray16 = new double[] { 'a', 100L };
        double double18 = variance1.evaluate(doubleArray16, 0.0d);
        long long19 = variance1.getN();
        boolean boolean20 = variance1.isBiasCorrected();
        long long21 = variance1.getN();
        double double22 = variance1.getResult();
        org.apache.commons.math.stat.descriptive.moment.Variance variance24 = new org.apache.commons.math.stat.descriptive.moment.Variance(false);
        double[] doubleArray31 = new double[] { (byte) -1, (short) 100, 'a', 0, 1, (-1.0d) };
        double double32 = variance24.evaluate(doubleArray31);
        variance24.clear();
        variance24.setBiasCorrected(false);
        variance24.clear();
        org.apache.commons.math.stat.descriptive.moment.Variance variance38 = new org.apache.commons.math.stat.descriptive.moment.Variance(false);
        double[] doubleArray45 = new double[] { (byte) -1, (short) 100, 'a', 0, 1, (-1.0d) };
        double double46 = variance38.evaluate(doubleArray45);
        variance38.setBiasCorrected(true);
        variance38.increment((double) (byte) 0);
        double[] doubleArray53 = new double[] { 'a', 100L };
        double double55 = variance38.evaluate(doubleArray53, 0.0d);
        double double56 = variance24.evaluate(doubleArray53);
        // The following exception was thrown during execution in test generation
        try {
            double double60 = variance1.evaluate(doubleArray53, 13.80555555555562d, (int) (short) 10, 0);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: begin + length > values.length");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(doubleArray8);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray8), "[-1.0, 100.0, 97.0, 0.0, 1.0, -1.0]");
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 2168.222222222222d + "'", double9 == 2168.222222222222d);
        org.junit.Assert.assertNotNull(doubleArray16);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray16), "[97.0, 100.0]");
        org.junit.Assert.assertTrue("'" + double18 + "' != '" + 4.5d + "'", double18 == 4.5d);
        org.junit.Assert.assertTrue("'" + long19 + "' != '" + 1L + "'", long19 == 1L);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + true + "'", boolean20 == true);
        org.junit.Assert.assertTrue("'" + long21 + "' != '" + 1L + "'", long21 == 1L);
        org.junit.Assert.assertTrue("'" + double22 + "' != '" + 0.0d + "'", double22 == 0.0d);
        org.junit.Assert.assertNotNull(doubleArray31);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray31), "[-1.0, 100.0, 97.0, 0.0, 1.0, -1.0]");
        org.junit.Assert.assertTrue("'" + double32 + "' != '" + 2168.222222222222d + "'", double32 == 2168.222222222222d);
        org.junit.Assert.assertNotNull(doubleArray45);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray45), "[-1.0, 100.0, 97.0, 0.0, 1.0, -1.0]");
        org.junit.Assert.assertTrue("'" + double46 + "' != '" + 2168.222222222222d + "'", double46 == 2168.222222222222d);
        org.junit.Assert.assertNotNull(doubleArray53);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray53), "[97.0, 100.0]");
        org.junit.Assert.assertTrue("'" + double55 + "' != '" + 4.5d + "'", double55 == 4.5d);
        org.junit.Assert.assertTrue("'" + double56 + "' != '" + 2.25d + "'", double56 == 2.25d);
    }

    @Test
    public void test1554() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1554");
        org.apache.commons.math.stat.descriptive.moment.Variance variance1 = new org.apache.commons.math.stat.descriptive.moment.Variance(false);
        double[] doubleArray8 = new double[] { (byte) -1, (short) 100, 'a', 0, 1, (-1.0d) };
        double double9 = variance1.evaluate(doubleArray8);
        variance1.setBiasCorrected(true);
        org.apache.commons.math.stat.descriptive.moment.Variance variance13 = new org.apache.commons.math.stat.descriptive.moment.Variance(false);
        double[] doubleArray20 = new double[] { (byte) -1, (short) 100, 'a', 0, 1, (-1.0d) };
        double double21 = variance13.evaluate(doubleArray20);
        variance13.setBiasCorrected(true);
        boolean boolean24 = variance13.isBiasCorrected();
        double[] doubleArray31 = new double[] { (short) 0, 1.0d, 1L, 0.0d, (-1.0d), 10L };
        double double32 = variance13.evaluate(doubleArray31);
        double double35 = variance1.evaluate(doubleArray31, (int) (byte) 1, (int) (byte) 0);
        variance1.setBiasCorrected(true);
        variance1.setBiasCorrected(false);
        variance1.clear();
        variance1.setBiasCorrected(false);
        variance1.setBiasCorrected(false);
        org.junit.Assert.assertNotNull(doubleArray8);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray8), "[-1.0, 100.0, 97.0, 0.0, 1.0, -1.0]");
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 2168.222222222222d + "'", double9 == 2168.222222222222d);
        org.junit.Assert.assertNotNull(doubleArray20);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray20), "[-1.0, 100.0, 97.0, 0.0, 1.0, -1.0]");
        org.junit.Assert.assertTrue("'" + double21 + "' != '" + 2168.222222222222d + "'", double21 == 2168.222222222222d);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + true + "'", boolean24 == true);
        org.junit.Assert.assertNotNull(doubleArray31);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray31), "[0.0, 1.0, 1.0, 0.0, -1.0, 10.0]");
        org.junit.Assert.assertTrue("'" + double32 + "' != '" + 16.566666666666663d + "'", double32 == 16.566666666666663d);
        org.junit.Assert.assertTrue(Double.isNaN(double35));
    }

    @Test
    public void test1555() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1555");
        org.apache.commons.math.stat.descriptive.moment.Variance variance1 = new org.apache.commons.math.stat.descriptive.moment.Variance(false);
        double[] doubleArray8 = new double[] { (byte) -1, (short) 100, 'a', 0, 1, (-1.0d) };
        double double9 = variance1.evaluate(doubleArray8);
        long long10 = variance1.getN();
        boolean boolean12 = variance1.equals((java.lang.Object) (byte) 0);
        long long13 = variance1.getN();
        variance1.clear();
        org.apache.commons.math.stat.descriptive.moment.Variance variance16 = new org.apache.commons.math.stat.descriptive.moment.Variance(false);
        double[] doubleArray23 = new double[] { (byte) -1, (short) 100, 'a', 0, 1, (-1.0d) };
        double double24 = variance16.evaluate(doubleArray23);
        variance16.setBiasCorrected(true);
        org.apache.commons.math.stat.descriptive.moment.Variance variance28 = new org.apache.commons.math.stat.descriptive.moment.Variance(false);
        variance28.clear();
        double double30 = variance28.getResult();
        double[] doubleArray35 = new double[] { (-1), 2168.222222222222d, 16.566666666418314d, 10.0d };
        variance28.incrementAll(doubleArray35);
        variance16.incrementAll(doubleArray35);
        org.apache.commons.math.stat.descriptive.moment.Variance variance38 = new org.apache.commons.math.stat.descriptive.moment.Variance();
        long long39 = variance38.getN();
        variance38.setBiasCorrected(true);
        variance38.increment(2178.0d);
        boolean boolean44 = variance38.isBiasCorrected();
        org.apache.commons.math.stat.descriptive.moment.Variance variance46 = new org.apache.commons.math.stat.descriptive.moment.Variance(false);
        double[] doubleArray53 = new double[] { (byte) -1, (short) 100, 'a', 0, 1, (-1.0d) };
        double double54 = variance46.evaluate(doubleArray53);
        variance46.setBiasCorrected(true);
        boolean boolean57 = variance46.isBiasCorrected();
        double[] doubleArray64 = new double[] { (short) 0, 1.0d, 1L, 0.0d, (-1.0d), 10L };
        double double65 = variance46.evaluate(doubleArray64);
        double double66 = variance46.getResult();
        long long67 = variance46.getN();
        variance46.increment((double) '#');
        variance46.increment(100.0d);
        org.apache.commons.math.stat.descriptive.moment.Variance variance73 = new org.apache.commons.math.stat.descriptive.moment.Variance(false);
        double[] doubleArray80 = new double[] { (byte) -1, (short) 100, 'a', 0, 1, (-1.0d) };
        double double81 = variance73.evaluate(doubleArray80);
        variance73.setBiasCorrected(true);
        boolean boolean84 = variance73.isBiasCorrected();
        double[] doubleArray91 = new double[] { (short) 0, 1.0d, 1L, 0.0d, (-1.0d), 10L };
        double double92 = variance73.evaluate(doubleArray91);
        double double94 = variance46.evaluate(doubleArray91, (double) (byte) 100);
        double double95 = variance38.evaluate(doubleArray91);
        double double96 = variance16.evaluate(doubleArray91);
        double double98 = variance1.evaluate(doubleArray91, (double) '#');
        org.junit.Assert.assertNotNull(doubleArray8);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray8), "[-1.0, 100.0, 97.0, 0.0, 1.0, -1.0]");
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 2168.222222222222d + "'", double9 == 2168.222222222222d);
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + 0L + "'", long10 == 0L);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + long13 + "' != '" + 0L + "'", long13 == 0L);
        org.junit.Assert.assertNotNull(doubleArray23);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray23), "[-1.0, 100.0, 97.0, 0.0, 1.0, -1.0]");
        org.junit.Assert.assertTrue("'" + double24 + "' != '" + 2168.222222222222d + "'", double24 == 2168.222222222222d);
        org.junit.Assert.assertTrue(Double.isNaN(double30));
        org.junit.Assert.assertNotNull(doubleArray35);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray35), "[-1.0, 2168.222222222222, 16.566666666418314, 10.0]");
        org.junit.Assert.assertTrue("'" + long39 + "' != '" + 0L + "'", long39 == 0L);
        org.junit.Assert.assertTrue("'" + boolean44 + "' != '" + true + "'", boolean44 == true);
        org.junit.Assert.assertNotNull(doubleArray53);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray53), "[-1.0, 100.0, 97.0, 0.0, 1.0, -1.0]");
        org.junit.Assert.assertTrue("'" + double54 + "' != '" + 2168.222222222222d + "'", double54 == 2168.222222222222d);
        org.junit.Assert.assertTrue("'" + boolean57 + "' != '" + true + "'", boolean57 == true);
        org.junit.Assert.assertNotNull(doubleArray64);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray64), "[0.0, 1.0, 1.0, 0.0, -1.0, 10.0]");
        org.junit.Assert.assertTrue("'" + double65 + "' != '" + 16.566666666666663d + "'", double65 == 16.566666666666663d);
        org.junit.Assert.assertTrue(Double.isNaN(double66));
        org.junit.Assert.assertTrue("'" + long67 + "' != '" + 0L + "'", long67 == 0L);
        org.junit.Assert.assertNotNull(doubleArray80);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray80), "[-1.0, 100.0, 97.0, 0.0, 1.0, -1.0]");
        org.junit.Assert.assertTrue("'" + double81 + "' != '" + 2168.222222222222d + "'", double81 == 2168.222222222222d);
        org.junit.Assert.assertTrue("'" + boolean84 + "' != '" + true + "'", boolean84 == true);
        org.junit.Assert.assertNotNull(doubleArray91);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray91), "[0.0, 1.0, 1.0, 0.0, -1.0, 10.0]");
        org.junit.Assert.assertTrue("'" + double92 + "' != '" + 16.566666666666663d + "'", double92 == 16.566666666666663d);
        org.junit.Assert.assertTrue("'" + double94 + "' != '" + 16.566666666667153d + "'", double94 == 16.566666666667153d);
        org.junit.Assert.assertTrue("'" + double95 + "' != '" + 16.566666666666663d + "'", double95 == 16.566666666666663d);
        org.junit.Assert.assertTrue("'" + double96 + "' != '" + 16.566666666666663d + "'", double96 == 16.566666666666663d);
        org.junit.Assert.assertTrue("'" + double98 + "' != '" + 13.805555555555506d + "'", double98 == 13.805555555555506d);
    }

    @Test
    public void test1556() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1556");
        org.apache.commons.math.stat.descriptive.moment.Variance variance1 = new org.apache.commons.math.stat.descriptive.moment.Variance(false);
        double[] doubleArray8 = new double[] { (byte) -1, (short) 100, 'a', 0, 1, (-1.0d) };
        double double9 = variance1.evaluate(doubleArray8);
        variance1.setBiasCorrected(true);
        org.apache.commons.math.stat.descriptive.moment.Variance variance13 = new org.apache.commons.math.stat.descriptive.moment.Variance(false);
        double[] doubleArray20 = new double[] { (byte) -1, (short) 100, 'a', 0, 1, (-1.0d) };
        double double21 = variance13.evaluate(doubleArray20);
        variance13.setBiasCorrected(true);
        boolean boolean24 = variance13.isBiasCorrected();
        double[] doubleArray31 = new double[] { (short) 0, 1.0d, 1L, 0.0d, (-1.0d), 10L };
        double double32 = variance13.evaluate(doubleArray31);
        org.apache.commons.math.stat.descriptive.moment.Variance variance34 = new org.apache.commons.math.stat.descriptive.moment.Variance(false);
        double[] doubleArray41 = new double[] { (byte) -1, (short) 100, 'a', 0, 1, (-1.0d) };
        double double42 = variance34.evaluate(doubleArray41);
        variance34.setBiasCorrected(true);
        boolean boolean45 = variance34.isBiasCorrected();
        double[] doubleArray52 = new double[] { (short) 0, 1.0d, 1L, 0.0d, (-1.0d), 10L };
        double double53 = variance34.evaluate(doubleArray52);
        double double56 = variance13.evaluate(doubleArray52, (int) (byte) 1, 0);
        double double58 = variance1.evaluate(doubleArray52, 2178.0d);
        double double59 = variance1.getResult();
        org.junit.Assert.assertNotNull(doubleArray8);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray8), "[-1.0, 100.0, 97.0, 0.0, 1.0, -1.0]");
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 2168.222222222222d + "'", double9 == 2168.222222222222d);
        org.junit.Assert.assertNotNull(doubleArray20);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray20), "[-1.0, 100.0, 97.0, 0.0, 1.0, -1.0]");
        org.junit.Assert.assertTrue("'" + double21 + "' != '" + 2168.222222222222d + "'", double21 == 2168.222222222222d);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + true + "'", boolean24 == true);
        org.junit.Assert.assertNotNull(doubleArray31);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray31), "[0.0, 1.0, 1.0, 0.0, -1.0, 10.0]");
        org.junit.Assert.assertTrue("'" + double32 + "' != '" + 16.566666666666663d + "'", double32 == 16.566666666666663d);
        org.junit.Assert.assertNotNull(doubleArray41);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray41), "[-1.0, 100.0, 97.0, 0.0, 1.0, -1.0]");
        org.junit.Assert.assertTrue("'" + double42 + "' != '" + 2168.222222222222d + "'", double42 == 2168.222222222222d);
        org.junit.Assert.assertTrue("'" + boolean45 + "' != '" + true + "'", boolean45 == true);
        org.junit.Assert.assertNotNull(doubleArray52);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray52), "[0.0, 1.0, 1.0, 0.0, -1.0, 10.0]");
        org.junit.Assert.assertTrue("'" + double53 + "' != '" + 16.566666666666663d + "'", double53 == 16.566666666666663d);
        org.junit.Assert.assertTrue(Double.isNaN(double56));
        org.junit.Assert.assertTrue("'" + double58 + "' != '" + 16.566666666418314d + "'", double58 == 16.566666666418314d);
        org.junit.Assert.assertTrue(Double.isNaN(double59));
    }

    @Test
    public void test1557() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1557");
        org.apache.commons.math.stat.descriptive.moment.Variance variance1 = new org.apache.commons.math.stat.descriptive.moment.Variance(false);
        double[] doubleArray8 = new double[] { (byte) -1, (short) 100, 'a', 0, 1, (-1.0d) };
        double double9 = variance1.evaluate(doubleArray8);
        variance1.setBiasCorrected(true);
        boolean boolean12 = variance1.isBiasCorrected();
        double[] doubleArray19 = new double[] { (short) 0, 1.0d, 1L, 0.0d, (-1.0d), 10L };
        double double20 = variance1.evaluate(doubleArray19);
        org.apache.commons.math.stat.descriptive.moment.Variance variance22 = new org.apache.commons.math.stat.descriptive.moment.Variance(false);
        double[] doubleArray29 = new double[] { (byte) -1, (short) 100, 'a', 0, 1, (-1.0d) };
        double double30 = variance22.evaluate(doubleArray29);
        variance22.setBiasCorrected(true);
        boolean boolean33 = variance22.isBiasCorrected();
        double[] doubleArray40 = new double[] { (short) 0, 1.0d, 1L, 0.0d, (-1.0d), 10L };
        double double41 = variance22.evaluate(doubleArray40);
        double double44 = variance1.evaluate(doubleArray40, (int) (byte) 1, 0);
        boolean boolean45 = variance1.isBiasCorrected();
        variance1.setBiasCorrected(true);
        variance1.increment(13.80555555555562d);
        double double50 = variance1.getResult();
        variance1.clear();
        org.junit.Assert.assertNotNull(doubleArray8);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray8), "[-1.0, 100.0, 97.0, 0.0, 1.0, -1.0]");
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 2168.222222222222d + "'", double9 == 2168.222222222222d);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertNotNull(doubleArray19);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray19), "[0.0, 1.0, 1.0, 0.0, -1.0, 10.0]");
        org.junit.Assert.assertTrue("'" + double20 + "' != '" + 16.566666666666663d + "'", double20 == 16.566666666666663d);
        org.junit.Assert.assertNotNull(doubleArray29);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray29), "[-1.0, 100.0, 97.0, 0.0, 1.0, -1.0]");
        org.junit.Assert.assertTrue("'" + double30 + "' != '" + 2168.222222222222d + "'", double30 == 2168.222222222222d);
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + true + "'", boolean33 == true);
        org.junit.Assert.assertNotNull(doubleArray40);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray40), "[0.0, 1.0, 1.0, 0.0, -1.0, 10.0]");
        org.junit.Assert.assertTrue("'" + double41 + "' != '" + 16.566666666666663d + "'", double41 == 16.566666666666663d);
        org.junit.Assert.assertTrue(Double.isNaN(double44));
        org.junit.Assert.assertTrue("'" + boolean45 + "' != '" + true + "'", boolean45 == true);
        org.junit.Assert.assertTrue("'" + double50 + "' != '" + 0.0d + "'", double50 == 0.0d);
    }

    @Test
    public void test1558() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1558");
        org.apache.commons.math.stat.descriptive.moment.Variance variance1 = new org.apache.commons.math.stat.descriptive.moment.Variance(false);
        double[] doubleArray8 = new double[] { (byte) -1, (short) 100, 'a', 0, 1, (-1.0d) };
        double double9 = variance1.evaluate(doubleArray8);
        variance1.setBiasCorrected(true);
        org.apache.commons.math.stat.descriptive.moment.Variance variance13 = new org.apache.commons.math.stat.descriptive.moment.Variance(false);
        double[] doubleArray20 = new double[] { (byte) -1, (short) 100, 'a', 0, 1, (-1.0d) };
        double double21 = variance13.evaluate(doubleArray20);
        variance13.setBiasCorrected(true);
        boolean boolean24 = variance13.isBiasCorrected();
        double[] doubleArray31 = new double[] { (short) 0, 1.0d, 1L, 0.0d, (-1.0d), 10L };
        double double32 = variance13.evaluate(doubleArray31);
        double double35 = variance1.evaluate(doubleArray31, (int) (byte) 1, (int) (byte) 0);
        org.apache.commons.math.stat.descriptive.moment.Variance variance37 = new org.apache.commons.math.stat.descriptive.moment.Variance(false);
        org.apache.commons.math.stat.descriptive.moment.Variance variance39 = new org.apache.commons.math.stat.descriptive.moment.Variance(false);
        double[] doubleArray46 = new double[] { (byte) -1, (short) 100, 'a', 0, 1, (-1.0d) };
        double double47 = variance39.evaluate(doubleArray46);
        variance39.setBiasCorrected(true);
        org.apache.commons.math.stat.descriptive.moment.Variance variance51 = new org.apache.commons.math.stat.descriptive.moment.Variance(false);
        double[] doubleArray58 = new double[] { (byte) -1, (short) 100, 'a', 0, 1, (-1.0d) };
        double double59 = variance51.evaluate(doubleArray58);
        variance51.setBiasCorrected(true);
        org.apache.commons.math.stat.descriptive.moment.Variance variance63 = new org.apache.commons.math.stat.descriptive.moment.Variance(false);
        double[] doubleArray70 = new double[] { (byte) -1, (short) 100, 'a', 0, 1, (-1.0d) };
        double double71 = variance63.evaluate(doubleArray70);
        variance63.setBiasCorrected(true);
        boolean boolean74 = variance63.isBiasCorrected();
        double[] doubleArray81 = new double[] { (short) 0, 1.0d, 1L, 0.0d, (-1.0d), 10L };
        double double82 = variance63.evaluate(doubleArray81);
        double double85 = variance51.evaluate(doubleArray81, (int) (byte) 1, (int) (byte) 0);
        variance39.incrementAll(doubleArray81, (int) (byte) 1, 1);
        double double89 = variance37.evaluate(doubleArray81);
        double double90 = variance1.evaluate(doubleArray81);
        boolean boolean91 = variance1.isBiasCorrected();
        variance1.setBiasCorrected(true);
        variance1.setBiasCorrected(false);
        variance1.clear();
        org.junit.Assert.assertNotNull(doubleArray8);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray8), "[-1.0, 100.0, 97.0, 0.0, 1.0, -1.0]");
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 2168.222222222222d + "'", double9 == 2168.222222222222d);
        org.junit.Assert.assertNotNull(doubleArray20);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray20), "[-1.0, 100.0, 97.0, 0.0, 1.0, -1.0]");
        org.junit.Assert.assertTrue("'" + double21 + "' != '" + 2168.222222222222d + "'", double21 == 2168.222222222222d);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + true + "'", boolean24 == true);
        org.junit.Assert.assertNotNull(doubleArray31);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray31), "[0.0, 1.0, 1.0, 0.0, -1.0, 10.0]");
        org.junit.Assert.assertTrue("'" + double32 + "' != '" + 16.566666666666663d + "'", double32 == 16.566666666666663d);
        org.junit.Assert.assertTrue(Double.isNaN(double35));
        org.junit.Assert.assertNotNull(doubleArray46);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray46), "[-1.0, 100.0, 97.0, 0.0, 1.0, -1.0]");
        org.junit.Assert.assertTrue("'" + double47 + "' != '" + 2168.222222222222d + "'", double47 == 2168.222222222222d);
        org.junit.Assert.assertNotNull(doubleArray58);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray58), "[-1.0, 100.0, 97.0, 0.0, 1.0, -1.0]");
        org.junit.Assert.assertTrue("'" + double59 + "' != '" + 2168.222222222222d + "'", double59 == 2168.222222222222d);
        org.junit.Assert.assertNotNull(doubleArray70);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray70), "[-1.0, 100.0, 97.0, 0.0, 1.0, -1.0]");
        org.junit.Assert.assertTrue("'" + double71 + "' != '" + 2168.222222222222d + "'", double71 == 2168.222222222222d);
        org.junit.Assert.assertTrue("'" + boolean74 + "' != '" + true + "'", boolean74 == true);
        org.junit.Assert.assertNotNull(doubleArray81);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray81), "[0.0, 1.0, 1.0, 0.0, -1.0, 10.0]");
        org.junit.Assert.assertTrue("'" + double82 + "' != '" + 16.566666666666663d + "'", double82 == 16.566666666666663d);
        org.junit.Assert.assertTrue(Double.isNaN(double85));
        org.junit.Assert.assertTrue("'" + double89 + "' != '" + 13.805555555555552d + "'", double89 == 13.805555555555552d);
        org.junit.Assert.assertTrue("'" + double90 + "' != '" + 16.566666666666663d + "'", double90 == 16.566666666666663d);
        org.junit.Assert.assertTrue("'" + boolean91 + "' != '" + true + "'", boolean91 == true);
    }

    @Test
    public void test1559() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1559");
        org.apache.commons.math.stat.descriptive.moment.Variance variance1 = new org.apache.commons.math.stat.descriptive.moment.Variance(false);
        double[] doubleArray8 = new double[] { (byte) -1, (short) 100, 'a', 0, 1, (-1.0d) };
        double double9 = variance1.evaluate(doubleArray8);
        variance1.setBiasCorrected(true);
        variance1.increment((double) (byte) 0);
        variance1.setBiasCorrected(true);
        double double16 = variance1.getResult();
        org.apache.commons.math.stat.descriptive.moment.Variance variance18 = new org.apache.commons.math.stat.descriptive.moment.Variance(false);
        double[] doubleArray25 = new double[] { (byte) -1, (short) 100, 'a', 0, 1, (-1.0d) };
        double double26 = variance18.evaluate(doubleArray25);
        variance18.setBiasCorrected(true);
        boolean boolean29 = variance18.isBiasCorrected();
        org.apache.commons.math.stat.descriptive.moment.Variance variance31 = new org.apache.commons.math.stat.descriptive.moment.Variance(false);
        double[] doubleArray38 = new double[] { (byte) -1, (short) 100, 'a', 0, 1, (-1.0d) };
        double double39 = variance31.evaluate(doubleArray38);
        variance31.setBiasCorrected(true);
        org.apache.commons.math.stat.descriptive.moment.Variance variance43 = new org.apache.commons.math.stat.descriptive.moment.Variance(false);
        double[] doubleArray50 = new double[] { (byte) -1, (short) 100, 'a', 0, 1, (-1.0d) };
        double double51 = variance43.evaluate(doubleArray50);
        variance31.incrementAll(doubleArray50);
        variance31.clear();
        org.apache.commons.math.stat.descriptive.moment.Variance variance55 = new org.apache.commons.math.stat.descriptive.moment.Variance(false);
        double[] doubleArray62 = new double[] { (byte) -1, (short) 100, 'a', 0, 1, (-1.0d) };
        double double63 = variance55.evaluate(doubleArray62);
        double[] doubleArray67 = new double[] { (byte) 1, (byte) 100, 1L };
        double double68 = variance55.evaluate(doubleArray67);
        variance31.incrementAll(doubleArray67, (int) (byte) 0, (int) (byte) 1);
        double double73 = variance18.evaluate(doubleArray67, (double) '4');
        variance1.incrementAll(doubleArray67);
        org.junit.Assert.assertNotNull(doubleArray8);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray8), "[-1.0, 100.0, 97.0, 0.0, 1.0, -1.0]");
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 2168.222222222222d + "'", double9 == 2168.222222222222d);
        org.junit.Assert.assertTrue("'" + double16 + "' != '" + 0.0d + "'", double16 == 0.0d);
        org.junit.Assert.assertNotNull(doubleArray25);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray25), "[-1.0, 100.0, 97.0, 0.0, 1.0, -1.0]");
        org.junit.Assert.assertTrue("'" + double26 + "' != '" + 2168.222222222222d + "'", double26 == 2168.222222222222d);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + true + "'", boolean29 == true);
        org.junit.Assert.assertNotNull(doubleArray38);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray38), "[-1.0, 100.0, 97.0, 0.0, 1.0, -1.0]");
        org.junit.Assert.assertTrue("'" + double39 + "' != '" + 2168.222222222222d + "'", double39 == 2168.222222222222d);
        org.junit.Assert.assertNotNull(doubleArray50);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray50), "[-1.0, 100.0, 97.0, 0.0, 1.0, -1.0]");
        org.junit.Assert.assertTrue("'" + double51 + "' != '" + 2168.222222222222d + "'", double51 == 2168.222222222222d);
        org.junit.Assert.assertNotNull(doubleArray62);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray62), "[-1.0, 100.0, 97.0, 0.0, 1.0, -1.0]");
        org.junit.Assert.assertTrue("'" + double63 + "' != '" + 2168.222222222222d + "'", double63 == 2168.222222222222d);
        org.junit.Assert.assertNotNull(doubleArray67);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray67), "[1.0, 100.0, 1.0]");
        org.junit.Assert.assertTrue("'" + double68 + "' != '" + 2178.0d + "'", double68 == 2178.0d);
        org.junit.Assert.assertTrue("'" + double73 + "' != '" + 3267.0d + "'", double73 == 3267.0d);
    }

    @Test
    public void test1560() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1560");
        org.apache.commons.math.stat.descriptive.moment.Variance variance1 = new org.apache.commons.math.stat.descriptive.moment.Variance(false);
        double[] doubleArray8 = new double[] { (byte) -1, (short) 100, 'a', 0, 1, (-1.0d) };
        double double9 = variance1.evaluate(doubleArray8);
        double[] doubleArray13 = new double[] { (byte) 1, (byte) 100, 1L };
        double double14 = variance1.evaluate(doubleArray13);
        variance1.increment((double) (byte) 100);
        org.apache.commons.math.stat.descriptive.moment.Variance variance18 = new org.apache.commons.math.stat.descriptive.moment.Variance(false);
        double[] doubleArray25 = new double[] { (byte) -1, (short) 100, 'a', 0, 1, (-1.0d) };
        double double26 = variance18.evaluate(doubleArray25);
        variance18.setBiasCorrected(true);
        boolean boolean29 = variance18.isBiasCorrected();
        double[] doubleArray36 = new double[] { (short) 0, 1.0d, 1L, 0.0d, (-1.0d), 10L };
        double double37 = variance18.evaluate(doubleArray36);
        org.apache.commons.math.stat.descriptive.moment.Variance variance39 = new org.apache.commons.math.stat.descriptive.moment.Variance(false);
        double[] doubleArray46 = new double[] { (byte) -1, (short) 100, 'a', 0, 1, (-1.0d) };
        double double47 = variance39.evaluate(doubleArray46);
        variance39.setBiasCorrected(true);
        boolean boolean50 = variance39.isBiasCorrected();
        double[] doubleArray57 = new double[] { (short) 0, 1.0d, 1L, 0.0d, (-1.0d), 10L };
        double double58 = variance39.evaluate(doubleArray57);
        double double61 = variance18.evaluate(doubleArray57, (int) (byte) 1, 0);
        variance18.setBiasCorrected(true);
        variance18.setBiasCorrected(true);
        double double66 = variance18.getResult();
        boolean boolean67 = variance18.isBiasCorrected();
        boolean boolean68 = variance18.isBiasCorrected();
        variance18.increment(0.0d);
        variance18.increment((double) 1.0f);
        boolean boolean73 = variance1.equals((java.lang.Object) variance18);
        long long74 = variance18.getN();
        boolean boolean75 = variance18.isBiasCorrected();
        variance18.increment((double) (byte) 0);
        org.junit.Assert.assertNotNull(doubleArray8);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray8), "[-1.0, 100.0, 97.0, 0.0, 1.0, -1.0]");
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 2168.222222222222d + "'", double9 == 2168.222222222222d);
        org.junit.Assert.assertNotNull(doubleArray13);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray13), "[1.0, 100.0, 1.0]");
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + 2178.0d + "'", double14 == 2178.0d);
        org.junit.Assert.assertNotNull(doubleArray25);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray25), "[-1.0, 100.0, 97.0, 0.0, 1.0, -1.0]");
        org.junit.Assert.assertTrue("'" + double26 + "' != '" + 2168.222222222222d + "'", double26 == 2168.222222222222d);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + true + "'", boolean29 == true);
        org.junit.Assert.assertNotNull(doubleArray36);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray36), "[0.0, 1.0, 1.0, 0.0, -1.0, 10.0]");
        org.junit.Assert.assertTrue("'" + double37 + "' != '" + 16.566666666666663d + "'", double37 == 16.566666666666663d);
        org.junit.Assert.assertNotNull(doubleArray46);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray46), "[-1.0, 100.0, 97.0, 0.0, 1.0, -1.0]");
        org.junit.Assert.assertTrue("'" + double47 + "' != '" + 2168.222222222222d + "'", double47 == 2168.222222222222d);
        org.junit.Assert.assertTrue("'" + boolean50 + "' != '" + true + "'", boolean50 == true);
        org.junit.Assert.assertNotNull(doubleArray57);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray57), "[0.0, 1.0, 1.0, 0.0, -1.0, 10.0]");
        org.junit.Assert.assertTrue("'" + double58 + "' != '" + 16.566666666666663d + "'", double58 == 16.566666666666663d);
        org.junit.Assert.assertTrue(Double.isNaN(double61));
        org.junit.Assert.assertTrue(Double.isNaN(double66));
        org.junit.Assert.assertTrue("'" + boolean67 + "' != '" + true + "'", boolean67 == true);
        org.junit.Assert.assertTrue("'" + boolean68 + "' != '" + true + "'", boolean68 == true);
        org.junit.Assert.assertTrue("'" + boolean73 + "' != '" + false + "'", boolean73 == false);
        org.junit.Assert.assertTrue("'" + long74 + "' != '" + 2L + "'", long74 == 2L);
        org.junit.Assert.assertTrue("'" + boolean75 + "' != '" + true + "'", boolean75 == true);
    }

    @Test
    public void test1561() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1561");
        org.apache.commons.math.stat.descriptive.moment.Variance variance1 = new org.apache.commons.math.stat.descriptive.moment.Variance(false);
        double[] doubleArray8 = new double[] { (byte) -1, (short) 100, 'a', 0, 1, (-1.0d) };
        double double9 = variance1.evaluate(doubleArray8);
        variance1.setBiasCorrected(true);
        boolean boolean12 = variance1.isBiasCorrected();
        org.apache.commons.math.stat.descriptive.moment.Variance variance14 = new org.apache.commons.math.stat.descriptive.moment.Variance(false);
        double[] doubleArray21 = new double[] { (byte) -1, (short) 100, 'a', 0, 1, (-1.0d) };
        double double22 = variance14.evaluate(doubleArray21);
        variance14.setBiasCorrected(true);
        org.apache.commons.math.stat.descriptive.moment.Variance variance26 = new org.apache.commons.math.stat.descriptive.moment.Variance(false);
        double[] doubleArray33 = new double[] { (byte) -1, (short) 100, 'a', 0, 1, (-1.0d) };
        double double34 = variance26.evaluate(doubleArray33);
        variance26.setBiasCorrected(true);
        boolean boolean37 = variance26.isBiasCorrected();
        double[] doubleArray44 = new double[] { (short) 0, 1.0d, 1L, 0.0d, (-1.0d), 10L };
        double double45 = variance26.evaluate(doubleArray44);
        double double48 = variance14.evaluate(doubleArray44, (int) (byte) 1, (int) (byte) 0);
        double double51 = variance1.evaluate(doubleArray44, (int) (byte) 1, 0);
        org.apache.commons.math.stat.descriptive.moment.Variance variance53 = new org.apache.commons.math.stat.descriptive.moment.Variance(false);
        double[] doubleArray60 = new double[] { (byte) -1, (short) 100, 'a', 0, 1, (-1.0d) };
        double double61 = variance53.evaluate(doubleArray60);
        variance53.clear();
        variance53.setBiasCorrected(true);
        boolean boolean65 = variance1.equals((java.lang.Object) variance53);
        java.lang.Class<?> wildcardClass66 = variance53.getClass();
        org.junit.Assert.assertNotNull(doubleArray8);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray8), "[-1.0, 100.0, 97.0, 0.0, 1.0, -1.0]");
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 2168.222222222222d + "'", double9 == 2168.222222222222d);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertNotNull(doubleArray21);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray21), "[-1.0, 100.0, 97.0, 0.0, 1.0, -1.0]");
        org.junit.Assert.assertTrue("'" + double22 + "' != '" + 2168.222222222222d + "'", double22 == 2168.222222222222d);
        org.junit.Assert.assertNotNull(doubleArray33);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray33), "[-1.0, 100.0, 97.0, 0.0, 1.0, -1.0]");
        org.junit.Assert.assertTrue("'" + double34 + "' != '" + 2168.222222222222d + "'", double34 == 2168.222222222222d);
        org.junit.Assert.assertTrue("'" + boolean37 + "' != '" + true + "'", boolean37 == true);
        org.junit.Assert.assertNotNull(doubleArray44);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray44), "[0.0, 1.0, 1.0, 0.0, -1.0, 10.0]");
        org.junit.Assert.assertTrue("'" + double45 + "' != '" + 16.566666666666663d + "'", double45 == 16.566666666666663d);
        org.junit.Assert.assertTrue(Double.isNaN(double48));
        org.junit.Assert.assertTrue(Double.isNaN(double51));
        org.junit.Assert.assertNotNull(doubleArray60);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray60), "[-1.0, 100.0, 97.0, 0.0, 1.0, -1.0]");
        org.junit.Assert.assertTrue("'" + double61 + "' != '" + 2168.222222222222d + "'", double61 == 2168.222222222222d);
        org.junit.Assert.assertTrue("'" + boolean65 + "' != '" + true + "'", boolean65 == true);
        org.junit.Assert.assertNotNull(wildcardClass66);
    }

    @Test
    public void test1562() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1562");
        org.apache.commons.math.stat.descriptive.moment.Variance variance1 = new org.apache.commons.math.stat.descriptive.moment.Variance(false);
        double[] doubleArray8 = new double[] { (byte) -1, (short) 100, 'a', 0, 1, (-1.0d) };
        double double9 = variance1.evaluate(doubleArray8);
        variance1.setBiasCorrected(true);
        org.apache.commons.math.stat.descriptive.moment.Variance variance13 = new org.apache.commons.math.stat.descriptive.moment.Variance(false);
        double[] doubleArray20 = new double[] { (byte) -1, (short) 100, 'a', 0, 1, (-1.0d) };
        double double21 = variance13.evaluate(doubleArray20);
        variance13.setBiasCorrected(true);
        boolean boolean24 = variance13.isBiasCorrected();
        double[] doubleArray31 = new double[] { (short) 0, 1.0d, 1L, 0.0d, (-1.0d), 10L };
        double double32 = variance13.evaluate(doubleArray31);
        org.apache.commons.math.stat.descriptive.moment.Variance variance34 = new org.apache.commons.math.stat.descriptive.moment.Variance(false);
        double[] doubleArray41 = new double[] { (byte) -1, (short) 100, 'a', 0, 1, (-1.0d) };
        double double42 = variance34.evaluate(doubleArray41);
        variance34.setBiasCorrected(true);
        boolean boolean45 = variance34.isBiasCorrected();
        double[] doubleArray52 = new double[] { (short) 0, 1.0d, 1L, 0.0d, (-1.0d), 10L };
        double double53 = variance34.evaluate(doubleArray52);
        double double56 = variance13.evaluate(doubleArray52, (int) (byte) 1, 0);
        double double58 = variance1.evaluate(doubleArray52, 2178.0d);
        variance1.increment(3267.0d);
        boolean boolean61 = variance1.isBiasCorrected();
        double double62 = variance1.getResult();
        double double63 = variance1.getResult();
        long long64 = variance1.getN();
        org.junit.Assert.assertNotNull(doubleArray8);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray8), "[-1.0, 100.0, 97.0, 0.0, 1.0, -1.0]");
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 2168.222222222222d + "'", double9 == 2168.222222222222d);
        org.junit.Assert.assertNotNull(doubleArray20);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray20), "[-1.0, 100.0, 97.0, 0.0, 1.0, -1.0]");
        org.junit.Assert.assertTrue("'" + double21 + "' != '" + 2168.222222222222d + "'", double21 == 2168.222222222222d);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + true + "'", boolean24 == true);
        org.junit.Assert.assertNotNull(doubleArray31);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray31), "[0.0, 1.0, 1.0, 0.0, -1.0, 10.0]");
        org.junit.Assert.assertTrue("'" + double32 + "' != '" + 16.566666666666663d + "'", double32 == 16.566666666666663d);
        org.junit.Assert.assertNotNull(doubleArray41);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray41), "[-1.0, 100.0, 97.0, 0.0, 1.0, -1.0]");
        org.junit.Assert.assertTrue("'" + double42 + "' != '" + 2168.222222222222d + "'", double42 == 2168.222222222222d);
        org.junit.Assert.assertTrue("'" + boolean45 + "' != '" + true + "'", boolean45 == true);
        org.junit.Assert.assertNotNull(doubleArray52);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray52), "[0.0, 1.0, 1.0, 0.0, -1.0, 10.0]");
        org.junit.Assert.assertTrue("'" + double53 + "' != '" + 16.566666666666663d + "'", double53 == 16.566666666666663d);
        org.junit.Assert.assertTrue(Double.isNaN(double56));
        org.junit.Assert.assertTrue("'" + double58 + "' != '" + 16.566666666418314d + "'", double58 == 16.566666666418314d);
        org.junit.Assert.assertTrue("'" + boolean61 + "' != '" + true + "'", boolean61 == true);
        org.junit.Assert.assertTrue("'" + double62 + "' != '" + 0.0d + "'", double62 == 0.0d);
        org.junit.Assert.assertTrue("'" + double63 + "' != '" + 0.0d + "'", double63 == 0.0d);
        org.junit.Assert.assertTrue("'" + long64 + "' != '" + 1L + "'", long64 == 1L);
    }

    @Test
    public void test1563() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1563");
        org.apache.commons.math.stat.descriptive.moment.SecondMoment secondMoment1 = null;
        org.apache.commons.math.stat.descriptive.moment.Variance variance2 = new org.apache.commons.math.stat.descriptive.moment.Variance(true, secondMoment1);
        variance2.clear();
        variance2.setBiasCorrected(false);
        boolean boolean6 = variance2.isBiasCorrected();
        variance2.increment(13.805555555555552d);
        boolean boolean9 = variance2.isBiasCorrected();
        variance2.increment((double) 3L);
        variance2.setBiasCorrected(false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
    }

    @Test
    public void test1564() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1564");
        org.apache.commons.math.stat.descriptive.moment.Variance variance1 = new org.apache.commons.math.stat.descriptive.moment.Variance(false);
        double[] doubleArray8 = new double[] { (byte) -1, (short) 100, 'a', 0, 1, (-1.0d) };
        double double9 = variance1.evaluate(doubleArray8);
        variance1.setBiasCorrected(true);
        long long12 = variance1.getN();
        long long13 = variance1.getN();
        double double14 = variance1.getResult();
        variance1.increment((double) 0);
        double double17 = variance1.getResult();
        org.junit.Assert.assertNotNull(doubleArray8);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray8), "[-1.0, 100.0, 97.0, 0.0, 1.0, -1.0]");
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 2168.222222222222d + "'", double9 == 2168.222222222222d);
        org.junit.Assert.assertTrue("'" + long12 + "' != '" + 0L + "'", long12 == 0L);
        org.junit.Assert.assertTrue("'" + long13 + "' != '" + 0L + "'", long13 == 0L);
        org.junit.Assert.assertTrue(Double.isNaN(double14));
        org.junit.Assert.assertTrue("'" + double17 + "' != '" + 0.0d + "'", double17 == 0.0d);
    }

    @Test
    public void test1565() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1565");
        org.apache.commons.math.stat.descriptive.moment.Variance variance1 = new org.apache.commons.math.stat.descriptive.moment.Variance(false);
        double[] doubleArray8 = new double[] { (byte) -1, (short) 100, 'a', 0, 1, (-1.0d) };
        double double9 = variance1.evaluate(doubleArray8);
        variance1.setBiasCorrected(true);
        long long12 = variance1.getN();
        variance1.clear();
        boolean boolean14 = variance1.isBiasCorrected();
        org.apache.commons.math.stat.descriptive.moment.Variance variance16 = new org.apache.commons.math.stat.descriptive.moment.Variance(false);
        double[] doubleArray23 = new double[] { (byte) -1, (short) 100, 'a', 0, 1, (-1.0d) };
        double double24 = variance16.evaluate(doubleArray23);
        long long25 = variance16.getN();
        variance16.increment((double) (byte) 1);
        variance16.increment((double) 6L);
        variance16.increment(2178.0d);
        org.apache.commons.math.stat.descriptive.moment.Variance variance32 = new org.apache.commons.math.stat.descriptive.moment.Variance();
        long long33 = variance32.getN();
        org.apache.commons.math.stat.descriptive.moment.Variance variance35 = new org.apache.commons.math.stat.descriptive.moment.Variance(false);
        double[] doubleArray42 = new double[] { (byte) -1, (short) 100, 'a', 0, 1, (-1.0d) };
        double double43 = variance35.evaluate(doubleArray42);
        variance35.setBiasCorrected(true);
        boolean boolean46 = variance35.isBiasCorrected();
        double[] doubleArray53 = new double[] { (short) 0, 1.0d, 1L, 0.0d, (-1.0d), 10L };
        double double54 = variance35.evaluate(doubleArray53);
        boolean boolean56 = variance35.equals((java.lang.Object) 10.0d);
        boolean boolean57 = variance35.isBiasCorrected();
        org.apache.commons.math.stat.descriptive.moment.Variance variance59 = new org.apache.commons.math.stat.descriptive.moment.Variance(false);
        boolean boolean60 = variance35.equals((java.lang.Object) false);
        org.apache.commons.math.stat.descriptive.moment.Variance variance62 = new org.apache.commons.math.stat.descriptive.moment.Variance(false);
        double[] doubleArray69 = new double[] { (byte) -1, (short) 100, 'a', 0, 1, (-1.0d) };
        double double70 = variance62.evaluate(doubleArray69);
        variance62.setBiasCorrected(true);
        org.apache.commons.math.stat.descriptive.moment.Variance variance74 = new org.apache.commons.math.stat.descriptive.moment.Variance(false);
        double[] doubleArray81 = new double[] { (byte) -1, (short) 100, 'a', 0, 1, (-1.0d) };
        double double82 = variance74.evaluate(doubleArray81);
        variance62.incrementAll(doubleArray81);
        double double85 = variance35.evaluate(doubleArray81, (double) 100.0f);
        variance32.incrementAll(doubleArray81, (int) (short) 1, (int) (byte) 0);
        variance16.incrementAll(doubleArray81);
        double double91 = variance1.evaluate(doubleArray81, (double) 10L);
        variance1.setBiasCorrected(false);
        variance1.increment(10.0d);
        variance1.increment((double) 12L);
        org.junit.Assert.assertNotNull(doubleArray8);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray8), "[-1.0, 100.0, 97.0, 0.0, 1.0, -1.0]");
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 2168.222222222222d + "'", double9 == 2168.222222222222d);
        org.junit.Assert.assertTrue("'" + long12 + "' != '" + 0L + "'", long12 == 0L);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertNotNull(doubleArray23);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray23), "[-1.0, 100.0, 97.0, 0.0, 1.0, -1.0]");
        org.junit.Assert.assertTrue("'" + double24 + "' != '" + 2168.222222222222d + "'", double24 == 2168.222222222222d);
        org.junit.Assert.assertTrue("'" + long25 + "' != '" + 0L + "'", long25 == 0L);
        org.junit.Assert.assertTrue("'" + long33 + "' != '" + 0L + "'", long33 == 0L);
        org.junit.Assert.assertNotNull(doubleArray42);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray42), "[-1.0, 100.0, 97.0, 0.0, 1.0, -1.0]");
        org.junit.Assert.assertTrue("'" + double43 + "' != '" + 2168.222222222222d + "'", double43 == 2168.222222222222d);
        org.junit.Assert.assertTrue("'" + boolean46 + "' != '" + true + "'", boolean46 == true);
        org.junit.Assert.assertNotNull(doubleArray53);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray53), "[0.0, 1.0, 1.0, 0.0, -1.0, 10.0]");
        org.junit.Assert.assertTrue("'" + double54 + "' != '" + 16.566666666666663d + "'", double54 == 16.566666666666663d);
        org.junit.Assert.assertTrue("'" + boolean56 + "' != '" + false + "'", boolean56 == false);
        org.junit.Assert.assertTrue("'" + boolean57 + "' != '" + true + "'", boolean57 == true);
        org.junit.Assert.assertTrue("'" + boolean60 + "' != '" + false + "'", boolean60 == false);
        org.junit.Assert.assertNotNull(doubleArray69);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray69), "[-1.0, 100.0, 97.0, 0.0, 1.0, -1.0]");
        org.junit.Assert.assertTrue("'" + double70 + "' != '" + 2168.222222222222d + "'", double70 == 2168.222222222222d);
        org.junit.Assert.assertNotNull(doubleArray81);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray81), "[-1.0, 100.0, 97.0, 0.0, 1.0, -1.0]");
        org.junit.Assert.assertTrue("'" + double82 + "' != '" + 2168.222222222222d + "'", double82 == 2168.222222222222d);
        org.junit.Assert.assertTrue("'" + double85 + "' != '" + 2601.8666666666663d + "'", double85 == 2601.8666666666663d);
        org.junit.Assert.assertTrue("'" + double91 + "' != '" + 2601.866666666667d + "'", double91 == 2601.866666666667d);
    }

    @Test
    public void test1566() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1566");
        org.apache.commons.math.stat.descriptive.moment.Variance variance1 = new org.apache.commons.math.stat.descriptive.moment.Variance(false);
        double[] doubleArray8 = new double[] { (byte) -1, (short) 100, 'a', 0, 1, (-1.0d) };
        double double9 = variance1.evaluate(doubleArray8);
        double[] doubleArray13 = new double[] { (byte) 1, (byte) 100, 1L };
        double double14 = variance1.evaluate(doubleArray13);
        long long15 = variance1.getN();
        variance1.setBiasCorrected(true);
        org.junit.Assert.assertNotNull(doubleArray8);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray8), "[-1.0, 100.0, 97.0, 0.0, 1.0, -1.0]");
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 2168.222222222222d + "'", double9 == 2168.222222222222d);
        org.junit.Assert.assertNotNull(doubleArray13);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray13), "[1.0, 100.0, 1.0]");
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + 2178.0d + "'", double14 == 2178.0d);
        org.junit.Assert.assertTrue("'" + long15 + "' != '" + 0L + "'", long15 == 0L);
    }

    @Test
    public void test1567() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1567");
        org.apache.commons.math.stat.descriptive.moment.Variance variance1 = new org.apache.commons.math.stat.descriptive.moment.Variance(false);
        variance1.clear();
        boolean boolean3 = variance1.isBiasCorrected();
        boolean boolean5 = variance1.equals((java.lang.Object) 1166128.5457099646d);
        org.apache.commons.math.stat.descriptive.moment.Variance variance7 = new org.apache.commons.math.stat.descriptive.moment.Variance(false);
        double[] doubleArray14 = new double[] { (byte) -1, (short) 100, 'a', 0, 1, (-1.0d) };
        double double15 = variance7.evaluate(doubleArray14);
        variance7.setBiasCorrected(true);
        boolean boolean18 = variance7.isBiasCorrected();
        double[] doubleArray25 = new double[] { (short) 0, 1.0d, 1L, 0.0d, (-1.0d), 10L };
        double double26 = variance7.evaluate(doubleArray25);
        org.apache.commons.math.stat.descriptive.moment.Variance variance28 = new org.apache.commons.math.stat.descriptive.moment.Variance(false);
        double[] doubleArray35 = new double[] { (byte) -1, (short) 100, 'a', 0, 1, (-1.0d) };
        double double36 = variance28.evaluate(doubleArray35);
        variance28.setBiasCorrected(true);
        boolean boolean39 = variance28.isBiasCorrected();
        double[] doubleArray46 = new double[] { (short) 0, 1.0d, 1L, 0.0d, (-1.0d), 10L };
        double double47 = variance28.evaluate(doubleArray46);
        double double50 = variance7.evaluate(doubleArray46, (int) (byte) 1, 0);
        variance7.setBiasCorrected(true);
        boolean boolean53 = variance1.equals((java.lang.Object) true);
        long long54 = variance1.getN();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(doubleArray14);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray14), "[-1.0, 100.0, 97.0, 0.0, 1.0, -1.0]");
        org.junit.Assert.assertTrue("'" + double15 + "' != '" + 2168.222222222222d + "'", double15 == 2168.222222222222d);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
        org.junit.Assert.assertNotNull(doubleArray25);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray25), "[0.0, 1.0, 1.0, 0.0, -1.0, 10.0]");
        org.junit.Assert.assertTrue("'" + double26 + "' != '" + 16.566666666666663d + "'", double26 == 16.566666666666663d);
        org.junit.Assert.assertNotNull(doubleArray35);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray35), "[-1.0, 100.0, 97.0, 0.0, 1.0, -1.0]");
        org.junit.Assert.assertTrue("'" + double36 + "' != '" + 2168.222222222222d + "'", double36 == 2168.222222222222d);
        org.junit.Assert.assertTrue("'" + boolean39 + "' != '" + true + "'", boolean39 == true);
        org.junit.Assert.assertNotNull(doubleArray46);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray46), "[0.0, 1.0, 1.0, 0.0, -1.0, 10.0]");
        org.junit.Assert.assertTrue("'" + double47 + "' != '" + 16.566666666666663d + "'", double47 == 16.566666666666663d);
        org.junit.Assert.assertTrue(Double.isNaN(double50));
        org.junit.Assert.assertTrue("'" + boolean53 + "' != '" + false + "'", boolean53 == false);
        org.junit.Assert.assertTrue("'" + long54 + "' != '" + 0L + "'", long54 == 0L);
    }

    @Test
    public void test1568() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1568");
        org.apache.commons.math.stat.descriptive.moment.SecondMoment secondMoment0 = null;
        org.apache.commons.math.stat.descriptive.moment.Variance variance1 = new org.apache.commons.math.stat.descriptive.moment.Variance(secondMoment0);
        boolean boolean2 = variance1.isBiasCorrected();
        variance1.setBiasCorrected(false);
        variance1.setBiasCorrected(true);
        variance1.clear();
        org.apache.commons.math.stat.descriptive.moment.Variance variance9 = new org.apache.commons.math.stat.descriptive.moment.Variance(false);
        double[] doubleArray16 = new double[] { (byte) -1, (short) 100, 'a', 0, 1, (-1.0d) };
        double double17 = variance9.evaluate(doubleArray16);
        variance9.setBiasCorrected(true);
        org.apache.commons.math.stat.descriptive.moment.Variance variance21 = new org.apache.commons.math.stat.descriptive.moment.Variance(false);
        double[] doubleArray28 = new double[] { (byte) -1, (short) 100, 'a', 0, 1, (-1.0d) };
        double double29 = variance21.evaluate(doubleArray28);
        variance9.incrementAll(doubleArray28);
        variance9.clear();
        variance9.setBiasCorrected(false);
        variance9.setBiasCorrected(false);
        variance9.setBiasCorrected(true);
        variance9.increment(3267.0000000018626d);
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean40 = variance1.equals((java.lang.Object) variance9);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertNotNull(doubleArray16);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray16), "[-1.0, 100.0, 97.0, 0.0, 1.0, -1.0]");
        org.junit.Assert.assertTrue("'" + double17 + "' != '" + 2168.222222222222d + "'", double17 == 2168.222222222222d);
        org.junit.Assert.assertNotNull(doubleArray28);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray28), "[-1.0, 100.0, 97.0, 0.0, 1.0, -1.0]");
        org.junit.Assert.assertTrue("'" + double29 + "' != '" + 2168.222222222222d + "'", double29 == 2168.222222222222d);
    }

    @Test
    public void test1569() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1569");
        org.apache.commons.math.stat.descriptive.moment.Variance variance1 = new org.apache.commons.math.stat.descriptive.moment.Variance(false);
        double[] doubleArray8 = new double[] { (byte) -1, (short) 100, 'a', 0, 1, (-1.0d) };
        double double9 = variance1.evaluate(doubleArray8);
        variance1.setBiasCorrected(true);
        long long12 = variance1.getN();
        variance1.clear();
        double double14 = variance1.getResult();
        org.apache.commons.math.stat.descriptive.moment.Variance variance16 = new org.apache.commons.math.stat.descriptive.moment.Variance(false);
        double[] doubleArray23 = new double[] { (byte) -1, (short) 100, 'a', 0, 1, (-1.0d) };
        double double24 = variance16.evaluate(doubleArray23);
        variance16.setBiasCorrected(true);
        boolean boolean27 = variance16.isBiasCorrected();
        double[] doubleArray34 = new double[] { (short) 0, 1.0d, 1L, 0.0d, (-1.0d), 10L };
        double double35 = variance16.evaluate(doubleArray34);
        boolean boolean37 = variance16.equals((java.lang.Object) 10.0d);
        org.apache.commons.math.stat.descriptive.moment.Variance variance39 = new org.apache.commons.math.stat.descriptive.moment.Variance(false);
        double[] doubleArray46 = new double[] { (byte) -1, (short) 100, 'a', 0, 1, (-1.0d) };
        double double47 = variance39.evaluate(doubleArray46);
        variance39.setBiasCorrected(true);
        boolean boolean50 = variance39.isBiasCorrected();
        double[] doubleArray57 = new double[] { (short) 0, 1.0d, 1L, 0.0d, (-1.0d), 10L };
        double double58 = variance39.evaluate(doubleArray57);
        double double60 = variance16.evaluate(doubleArray57, (double) 0.0f);
        variance1.incrementAll(doubleArray57);
        double double62 = variance1.getResult();
        double double63 = variance1.getResult();
        long long64 = variance1.getN();
        org.apache.commons.math.stat.descriptive.moment.Variance variance66 = new org.apache.commons.math.stat.descriptive.moment.Variance(false);
        double[] doubleArray73 = new double[] { (byte) -1, (short) 100, 'a', 0, 1, (-1.0d) };
        double double74 = variance66.evaluate(doubleArray73);
        long long75 = variance66.getN();
        variance66.increment(874596.4092824734d);
        org.apache.commons.math.stat.descriptive.moment.Variance variance79 = new org.apache.commons.math.stat.descriptive.moment.Variance(false);
        variance79.clear();
        double double81 = variance79.getResult();
        double[] doubleArray86 = new double[] { (-1), 2168.222222222222d, 16.566666666418314d, 10.0d };
        variance79.incrementAll(doubleArray86);
        variance66.incrementAll(doubleArray86, 0, (int) (byte) 1);
        double double92 = variance1.evaluate(doubleArray86, 0.0d);
        variance1.clear();
        org.junit.Assert.assertNotNull(doubleArray8);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray8), "[-1.0, 100.0, 97.0, 0.0, 1.0, -1.0]");
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 2168.222222222222d + "'", double9 == 2168.222222222222d);
        org.junit.Assert.assertTrue("'" + long12 + "' != '" + 0L + "'", long12 == 0L);
        org.junit.Assert.assertTrue(Double.isNaN(double14));
        org.junit.Assert.assertNotNull(doubleArray23);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray23), "[-1.0, 100.0, 97.0, 0.0, 1.0, -1.0]");
        org.junit.Assert.assertTrue("'" + double24 + "' != '" + 2168.222222222222d + "'", double24 == 2168.222222222222d);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + true + "'", boolean27 == true);
        org.junit.Assert.assertNotNull(doubleArray34);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray34), "[0.0, 1.0, 1.0, 0.0, -1.0, 10.0]");
        org.junit.Assert.assertTrue("'" + double35 + "' != '" + 16.566666666666663d + "'", double35 == 16.566666666666663d);
        org.junit.Assert.assertTrue("'" + boolean37 + "' != '" + false + "'", boolean37 == false);
        org.junit.Assert.assertNotNull(doubleArray46);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray46), "[-1.0, 100.0, 97.0, 0.0, 1.0, -1.0]");
        org.junit.Assert.assertTrue("'" + double47 + "' != '" + 2168.222222222222d + "'", double47 == 2168.222222222222d);
        org.junit.Assert.assertTrue("'" + boolean50 + "' != '" + true + "'", boolean50 == true);
        org.junit.Assert.assertNotNull(doubleArray57);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray57), "[0.0, 1.0, 1.0, 0.0, -1.0, 10.0]");
        org.junit.Assert.assertTrue("'" + double58 + "' != '" + 16.566666666666663d + "'", double58 == 16.566666666666663d);
        org.junit.Assert.assertTrue("'" + double60 + "' != '" + 16.566666666666666d + "'", double60 == 16.566666666666666d);
        org.junit.Assert.assertTrue("'" + double62 + "' != '" + 16.56666666666667d + "'", double62 == 16.56666666666667d);
        org.junit.Assert.assertTrue("'" + double63 + "' != '" + 16.56666666666667d + "'", double63 == 16.56666666666667d);
        org.junit.Assert.assertTrue("'" + long64 + "' != '" + 6L + "'", long64 == 6L);
        org.junit.Assert.assertNotNull(doubleArray73);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray73), "[-1.0, 100.0, 97.0, 0.0, 1.0, -1.0]");
        org.junit.Assert.assertTrue("'" + double74 + "' != '" + 2168.222222222222d + "'", double74 == 2168.222222222222d);
        org.junit.Assert.assertTrue("'" + long75 + "' != '" + 0L + "'", long75 == 0L);
        org.junit.Assert.assertTrue(Double.isNaN(double81));
        org.junit.Assert.assertNotNull(doubleArray86);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray86), "[-1.0, 2168.222222222222, 16.566666666418314, 10.0]");
        org.junit.Assert.assertTrue("'" + double92 + "' != '" + 1166128.5457099646d + "'", double92 == 1166128.5457099646d);
    }

    @Test
    public void test1570() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1570");
        org.apache.commons.math.stat.descriptive.moment.Variance variance1 = new org.apache.commons.math.stat.descriptive.moment.Variance(false);
        variance1.clear();
        double double3 = variance1.getResult();
        double[] doubleArray8 = new double[] { (-1), 2168.222222222222d, 16.566666666418314d, 10.0d };
        variance1.incrementAll(doubleArray8);
        org.apache.commons.math.stat.descriptive.moment.Variance variance11 = new org.apache.commons.math.stat.descriptive.moment.Variance(false);
        double[] doubleArray18 = new double[] { (byte) -1, (short) 100, 'a', 0, 1, (-1.0d) };
        double double19 = variance11.evaluate(doubleArray18);
        variance11.setBiasCorrected(true);
        boolean boolean22 = variance11.isBiasCorrected();
        double[] doubleArray29 = new double[] { (short) 0, 1.0d, 1L, 0.0d, (-1.0d), 10L };
        double double30 = variance11.evaluate(doubleArray29);
        double double31 = variance11.getResult();
        variance11.setBiasCorrected(true);
        boolean boolean34 = variance11.isBiasCorrected();
        variance11.setBiasCorrected(false);
        variance11.increment(2601.866666666667d);
        org.apache.commons.math.stat.descriptive.moment.Variance variance40 = new org.apache.commons.math.stat.descriptive.moment.Variance(false);
        double[] doubleArray47 = new double[] { (byte) -1, (short) 100, 'a', 0, 1, (-1.0d) };
        double double48 = variance40.evaluate(doubleArray47);
        variance40.clear();
        variance40.setBiasCorrected(true);
        double double52 = variance40.getResult();
        org.apache.commons.math.stat.descriptive.moment.Variance variance54 = new org.apache.commons.math.stat.descriptive.moment.Variance(false);
        double[] doubleArray61 = new double[] { (byte) -1, (short) 100, 'a', 0, 1, (-1.0d) };
        double double62 = variance54.evaluate(doubleArray61);
        double double63 = variance40.evaluate(doubleArray61);
        double double64 = variance11.evaluate(doubleArray61);
        double double65 = variance1.evaluate(doubleArray61);
        variance1.increment((double) 0.0f);
        double double68 = variance1.getResult();
        variance1.setBiasCorrected(false);
        boolean boolean71 = variance1.isBiasCorrected();
        org.junit.Assert.assertTrue(Double.isNaN(double3));
        org.junit.Assert.assertNotNull(doubleArray8);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray8), "[-1.0, 2168.222222222222, 16.566666666418314, 10.0]");
        org.junit.Assert.assertNotNull(doubleArray18);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray18), "[-1.0, 100.0, 97.0, 0.0, 1.0, -1.0]");
        org.junit.Assert.assertTrue("'" + double19 + "' != '" + 2168.222222222222d + "'", double19 == 2168.222222222222d);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + true + "'", boolean22 == true);
        org.junit.Assert.assertNotNull(doubleArray29);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray29), "[0.0, 1.0, 1.0, 0.0, -1.0, 10.0]");
        org.junit.Assert.assertTrue("'" + double30 + "' != '" + 16.566666666666663d + "'", double30 == 16.566666666666663d);
        org.junit.Assert.assertTrue(Double.isNaN(double31));
        org.junit.Assert.assertTrue("'" + boolean34 + "' != '" + true + "'", boolean34 == true);
        org.junit.Assert.assertNotNull(doubleArray47);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray47), "[-1.0, 100.0, 97.0, 0.0, 1.0, -1.0]");
        org.junit.Assert.assertTrue("'" + double48 + "' != '" + 2168.222222222222d + "'", double48 == 2168.222222222222d);
        org.junit.Assert.assertTrue(Double.isNaN(double52));
        org.junit.Assert.assertNotNull(doubleArray61);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray61), "[-1.0, 100.0, 97.0, 0.0, 1.0, -1.0]");
        org.junit.Assert.assertTrue("'" + double62 + "' != '" + 2168.222222222222d + "'", double62 == 2168.222222222222d);
        org.junit.Assert.assertTrue("'" + double63 + "' != '" + 2601.866666666667d + "'", double63 == 2601.866666666667d);
        org.junit.Assert.assertTrue("'" + double64 + "' != '" + 2168.222222222222d + "'", double64 == 2168.222222222222d);
        org.junit.Assert.assertTrue("'" + double65 + "' != '" + 2168.222222222222d + "'", double65 == 2168.222222222222d);
        org.junit.Assert.assertTrue("'" + double68 + "' != '" + 0.0d + "'", double68 == 0.0d);
        org.junit.Assert.assertTrue("'" + boolean71 + "' != '" + false + "'", boolean71 == false);
    }

    @Test
    public void test1571() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1571");
        org.apache.commons.math.stat.descriptive.moment.Variance variance1 = new org.apache.commons.math.stat.descriptive.moment.Variance(false);
        variance1.clear();
        double double3 = variance1.getResult();
        double[] doubleArray8 = new double[] { (-1), 2168.222222222222d, 16.566666666418314d, 10.0d };
        variance1.incrementAll(doubleArray8);
        org.apache.commons.math.stat.descriptive.moment.Variance variance11 = new org.apache.commons.math.stat.descriptive.moment.Variance(false);
        double[] doubleArray18 = new double[] { (byte) -1, (short) 100, 'a', 0, 1, (-1.0d) };
        double double19 = variance11.evaluate(doubleArray18);
        variance11.setBiasCorrected(true);
        org.apache.commons.math.stat.descriptive.moment.Variance variance23 = new org.apache.commons.math.stat.descriptive.moment.Variance(false);
        double[] doubleArray30 = new double[] { (byte) -1, (short) 100, 'a', 0, 1, (-1.0d) };
        double double31 = variance23.evaluate(doubleArray30);
        variance11.incrementAll(doubleArray30);
        variance11.clear();
        org.apache.commons.math.stat.descriptive.moment.Variance variance35 = new org.apache.commons.math.stat.descriptive.moment.Variance(false);
        double[] doubleArray42 = new double[] { (byte) -1, (short) 100, 'a', 0, 1, (-1.0d) };
        double double43 = variance35.evaluate(doubleArray42);
        double[] doubleArray47 = new double[] { (byte) 1, (byte) 100, 1L };
        double double48 = variance35.evaluate(doubleArray47);
        variance11.incrementAll(doubleArray47, (int) (byte) 0, (int) (byte) 1);
        double double55 = variance1.evaluate(doubleArray47, (double) 'a', (int) (short) 1, (int) (short) 1);
        boolean boolean56 = variance1.isBiasCorrected();
        variance1.setBiasCorrected(false);
        long long59 = variance1.getN();
        variance1.setBiasCorrected(false);
        org.junit.Assert.assertTrue(Double.isNaN(double3));
        org.junit.Assert.assertNotNull(doubleArray8);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray8), "[-1.0, 2168.222222222222, 16.566666666418314, 10.0]");
        org.junit.Assert.assertNotNull(doubleArray18);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray18), "[-1.0, 100.0, 97.0, 0.0, 1.0, -1.0]");
        org.junit.Assert.assertTrue("'" + double19 + "' != '" + 2168.222222222222d + "'", double19 == 2168.222222222222d);
        org.junit.Assert.assertNotNull(doubleArray30);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray30), "[-1.0, 100.0, 97.0, 0.0, 1.0, -1.0]");
        org.junit.Assert.assertTrue("'" + double31 + "' != '" + 2168.222222222222d + "'", double31 == 2168.222222222222d);
        org.junit.Assert.assertNotNull(doubleArray42);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray42), "[-1.0, 100.0, 97.0, 0.0, 1.0, -1.0]");
        org.junit.Assert.assertTrue("'" + double43 + "' != '" + 2168.222222222222d + "'", double43 == 2168.222222222222d);
        org.junit.Assert.assertNotNull(doubleArray47);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray47), "[1.0, 100.0, 1.0]");
        org.junit.Assert.assertTrue("'" + double48 + "' != '" + 2178.0d + "'", double48 == 2178.0d);
        org.junit.Assert.assertTrue("'" + double55 + "' != '" + 0.0d + "'", double55 == 0.0d);
        org.junit.Assert.assertTrue("'" + boolean56 + "' != '" + false + "'", boolean56 == false);
        org.junit.Assert.assertTrue("'" + long59 + "' != '" + 4L + "'", long59 == 4L);
    }

    @Test
    public void test1572() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1572");
        org.apache.commons.math.stat.descriptive.moment.Variance variance1 = new org.apache.commons.math.stat.descriptive.moment.Variance(false);
        double[] doubleArray8 = new double[] { (byte) -1, (short) 100, 'a', 0, 1, (-1.0d) };
        double double9 = variance1.evaluate(doubleArray8);
        long long10 = variance1.getN();
        variance1.increment((double) (byte) 1);
        variance1.increment((double) 6L);
        double double15 = variance1.getResult();
        variance1.clear();
        org.apache.commons.math.stat.descriptive.moment.Variance variance18 = new org.apache.commons.math.stat.descriptive.moment.Variance(false);
        double[] doubleArray25 = new double[] { (byte) -1, (short) 100, 'a', 0, 1, (-1.0d) };
        double double26 = variance18.evaluate(doubleArray25);
        variance18.setBiasCorrected(true);
        boolean boolean29 = variance18.isBiasCorrected();
        double[] doubleArray36 = new double[] { (short) 0, 1.0d, 1L, 0.0d, (-1.0d), 10L };
        double double37 = variance18.evaluate(doubleArray36);
        double double38 = variance1.evaluate(doubleArray36);
        org.apache.commons.math.stat.descriptive.moment.SecondMoment secondMoment40 = null;
        org.apache.commons.math.stat.descriptive.moment.Variance variance41 = new org.apache.commons.math.stat.descriptive.moment.Variance(true, secondMoment40);
        double[] doubleArray42 = new double[] {};
        double double45 = variance41.evaluate(doubleArray42, 0, 0);
        boolean boolean47 = variance41.equals((java.lang.Object) 10.0f);
        boolean boolean48 = variance41.isBiasCorrected();
        variance41.clear();
        double[] doubleArray55 = new double[] { 10.0f, 10.0f, 1, 'a', (byte) 1 };
        double double56 = variance41.evaluate(doubleArray55);
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean57 = variance1.equals((java.lang.Object) variance41);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(doubleArray8);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray8), "[-1.0, 100.0, 97.0, 0.0, 1.0, -1.0]");
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 2168.222222222222d + "'", double9 == 2168.222222222222d);
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + 0L + "'", long10 == 0L);
        org.junit.Assert.assertTrue("'" + double15 + "' != '" + 6.25d + "'", double15 == 6.25d);
        org.junit.Assert.assertNotNull(doubleArray25);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray25), "[-1.0, 100.0, 97.0, 0.0, 1.0, -1.0]");
        org.junit.Assert.assertTrue("'" + double26 + "' != '" + 2168.222222222222d + "'", double26 == 2168.222222222222d);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + true + "'", boolean29 == true);
        org.junit.Assert.assertNotNull(doubleArray36);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray36), "[0.0, 1.0, 1.0, 0.0, -1.0, 10.0]");
        org.junit.Assert.assertTrue("'" + double37 + "' != '" + 16.566666666666663d + "'", double37 == 16.566666666666663d);
        org.junit.Assert.assertTrue("'" + double38 + "' != '" + 13.805555555555552d + "'", double38 == 13.805555555555552d);
        org.junit.Assert.assertNotNull(doubleArray42);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray42), "[]");
        org.junit.Assert.assertTrue(Double.isNaN(double45));
        org.junit.Assert.assertTrue("'" + boolean47 + "' != '" + false + "'", boolean47 == false);
        org.junit.Assert.assertTrue("'" + boolean48 + "' != '" + true + "'", boolean48 == true);
        org.junit.Assert.assertNotNull(doubleArray55);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray55), "[10.0, 10.0, 1.0, 97.0, 1.0]");
        org.junit.Assert.assertTrue("'" + double56 + "' != '" + 1694.7000000000003d + "'", double56 == 1694.7000000000003d);
    }

    @Test
    public void test1573() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1573");
        org.apache.commons.math.stat.descriptive.moment.Variance variance0 = new org.apache.commons.math.stat.descriptive.moment.Variance();
        variance0.increment(1694.7000000000003d);
        double double3 = variance0.getResult();
        boolean boolean4 = variance0.isBiasCorrected();
        org.apache.commons.math.stat.descriptive.moment.Variance variance6 = new org.apache.commons.math.stat.descriptive.moment.Variance(false);
        org.apache.commons.math.stat.descriptive.moment.Variance variance8 = new org.apache.commons.math.stat.descriptive.moment.Variance(false);
        double[] doubleArray15 = new double[] { (byte) -1, (short) 100, 'a', 0, 1, (-1.0d) };
        double double16 = variance8.evaluate(doubleArray15);
        variance8.setBiasCorrected(true);
        org.apache.commons.math.stat.descriptive.moment.Variance variance20 = new org.apache.commons.math.stat.descriptive.moment.Variance(false);
        double[] doubleArray27 = new double[] { (byte) -1, (short) 100, 'a', 0, 1, (-1.0d) };
        double double28 = variance20.evaluate(doubleArray27);
        variance20.setBiasCorrected(true);
        org.apache.commons.math.stat.descriptive.moment.Variance variance32 = new org.apache.commons.math.stat.descriptive.moment.Variance(false);
        double[] doubleArray39 = new double[] { (byte) -1, (short) 100, 'a', 0, 1, (-1.0d) };
        double double40 = variance32.evaluate(doubleArray39);
        variance32.setBiasCorrected(true);
        boolean boolean43 = variance32.isBiasCorrected();
        double[] doubleArray50 = new double[] { (short) 0, 1.0d, 1L, 0.0d, (-1.0d), 10L };
        double double51 = variance32.evaluate(doubleArray50);
        double double54 = variance20.evaluate(doubleArray50, (int) (byte) 1, (int) (byte) 0);
        variance8.incrementAll(doubleArray50, (int) (byte) 1, 1);
        double double58 = variance6.evaluate(doubleArray50);
        double double59 = variance6.getResult();
        variance6.clear();
        variance6.increment((double) 'a');
        variance6.increment(2168.222222223878d);
        boolean boolean65 = variance0.equals((java.lang.Object) 2168.222222223878d);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 0.0d + "'", double3 == 0.0d);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertNotNull(doubleArray15);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray15), "[-1.0, 100.0, 97.0, 0.0, 1.0, -1.0]");
        org.junit.Assert.assertTrue("'" + double16 + "' != '" + 2168.222222222222d + "'", double16 == 2168.222222222222d);
        org.junit.Assert.assertNotNull(doubleArray27);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray27), "[-1.0, 100.0, 97.0, 0.0, 1.0, -1.0]");
        org.junit.Assert.assertTrue("'" + double28 + "' != '" + 2168.222222222222d + "'", double28 == 2168.222222222222d);
        org.junit.Assert.assertNotNull(doubleArray39);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray39), "[-1.0, 100.0, 97.0, 0.0, 1.0, -1.0]");
        org.junit.Assert.assertTrue("'" + double40 + "' != '" + 2168.222222222222d + "'", double40 == 2168.222222222222d);
        org.junit.Assert.assertTrue("'" + boolean43 + "' != '" + true + "'", boolean43 == true);
        org.junit.Assert.assertNotNull(doubleArray50);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray50), "[0.0, 1.0, 1.0, 0.0, -1.0, 10.0]");
        org.junit.Assert.assertTrue("'" + double51 + "' != '" + 16.566666666666663d + "'", double51 == 16.566666666666663d);
        org.junit.Assert.assertTrue(Double.isNaN(double54));
        org.junit.Assert.assertTrue("'" + double58 + "' != '" + 13.805555555555552d + "'", double58 == 13.805555555555552d);
        org.junit.Assert.assertTrue(Double.isNaN(double59));
        org.junit.Assert.assertTrue("'" + boolean65 + "' != '" + false + "'", boolean65 == false);
    }

    @Test
    public void test1574() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1574");
        org.apache.commons.math.stat.descriptive.moment.Variance variance1 = new org.apache.commons.math.stat.descriptive.moment.Variance(false);
        double[] doubleArray8 = new double[] { (byte) -1, (short) 100, 'a', 0, 1, (-1.0d) };
        double double9 = variance1.evaluate(doubleArray8);
        variance1.setBiasCorrected(true);
        org.apache.commons.math.stat.descriptive.moment.Variance variance13 = new org.apache.commons.math.stat.descriptive.moment.Variance(false);
        variance13.clear();
        double double15 = variance13.getResult();
        double[] doubleArray20 = new double[] { (-1), 2168.222222222222d, 16.566666666418314d, 10.0d };
        variance13.incrementAll(doubleArray20);
        variance1.incrementAll(doubleArray20);
        org.apache.commons.math.stat.descriptive.moment.Variance variance23 = new org.apache.commons.math.stat.descriptive.moment.Variance();
        long long24 = variance23.getN();
        variance23.setBiasCorrected(true);
        variance23.increment(2178.0d);
        boolean boolean29 = variance23.isBiasCorrected();
        org.apache.commons.math.stat.descriptive.moment.Variance variance31 = new org.apache.commons.math.stat.descriptive.moment.Variance(false);
        double[] doubleArray38 = new double[] { (byte) -1, (short) 100, 'a', 0, 1, (-1.0d) };
        double double39 = variance31.evaluate(doubleArray38);
        variance31.setBiasCorrected(true);
        boolean boolean42 = variance31.isBiasCorrected();
        double[] doubleArray49 = new double[] { (short) 0, 1.0d, 1L, 0.0d, (-1.0d), 10L };
        double double50 = variance31.evaluate(doubleArray49);
        double double51 = variance31.getResult();
        long long52 = variance31.getN();
        variance31.increment((double) '#');
        variance31.increment(100.0d);
        org.apache.commons.math.stat.descriptive.moment.Variance variance58 = new org.apache.commons.math.stat.descriptive.moment.Variance(false);
        double[] doubleArray65 = new double[] { (byte) -1, (short) 100, 'a', 0, 1, (-1.0d) };
        double double66 = variance58.evaluate(doubleArray65);
        variance58.setBiasCorrected(true);
        boolean boolean69 = variance58.isBiasCorrected();
        double[] doubleArray76 = new double[] { (short) 0, 1.0d, 1L, 0.0d, (-1.0d), 10L };
        double double77 = variance58.evaluate(doubleArray76);
        double double79 = variance31.evaluate(doubleArray76, (double) (byte) 100);
        double double80 = variance23.evaluate(doubleArray76);
        double double81 = variance1.evaluate(doubleArray76);
        variance1.setBiasCorrected(true);
        variance1.clear();
        double double85 = variance1.getResult();
        org.junit.Assert.assertNotNull(doubleArray8);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray8), "[-1.0, 100.0, 97.0, 0.0, 1.0, -1.0]");
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 2168.222222222222d + "'", double9 == 2168.222222222222d);
        org.junit.Assert.assertTrue(Double.isNaN(double15));
        org.junit.Assert.assertNotNull(doubleArray20);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray20), "[-1.0, 2168.222222222222, 16.566666666418314, 10.0]");
        org.junit.Assert.assertTrue("'" + long24 + "' != '" + 0L + "'", long24 == 0L);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + true + "'", boolean29 == true);
        org.junit.Assert.assertNotNull(doubleArray38);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray38), "[-1.0, 100.0, 97.0, 0.0, 1.0, -1.0]");
        org.junit.Assert.assertTrue("'" + double39 + "' != '" + 2168.222222222222d + "'", double39 == 2168.222222222222d);
        org.junit.Assert.assertTrue("'" + boolean42 + "' != '" + true + "'", boolean42 == true);
        org.junit.Assert.assertNotNull(doubleArray49);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray49), "[0.0, 1.0, 1.0, 0.0, -1.0, 10.0]");
        org.junit.Assert.assertTrue("'" + double50 + "' != '" + 16.566666666666663d + "'", double50 == 16.566666666666663d);
        org.junit.Assert.assertTrue(Double.isNaN(double51));
        org.junit.Assert.assertTrue("'" + long52 + "' != '" + 0L + "'", long52 == 0L);
        org.junit.Assert.assertNotNull(doubleArray65);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray65), "[-1.0, 100.0, 97.0, 0.0, 1.0, -1.0]");
        org.junit.Assert.assertTrue("'" + double66 + "' != '" + 2168.222222222222d + "'", double66 == 2168.222222222222d);
        org.junit.Assert.assertTrue("'" + boolean69 + "' != '" + true + "'", boolean69 == true);
        org.junit.Assert.assertNotNull(doubleArray76);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray76), "[0.0, 1.0, 1.0, 0.0, -1.0, 10.0]");
        org.junit.Assert.assertTrue("'" + double77 + "' != '" + 16.566666666666663d + "'", double77 == 16.566666666666663d);
        org.junit.Assert.assertTrue("'" + double79 + "' != '" + 16.566666666667153d + "'", double79 == 16.566666666667153d);
        org.junit.Assert.assertTrue("'" + double80 + "' != '" + 16.566666666666663d + "'", double80 == 16.566666666666663d);
        org.junit.Assert.assertTrue("'" + double81 + "' != '" + 16.566666666666663d + "'", double81 == 16.566666666666663d);
        org.junit.Assert.assertTrue(Double.isNaN(double85));
    }

    @Test
    public void test1575() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1575");
        org.apache.commons.math.stat.descriptive.moment.Variance variance1 = new org.apache.commons.math.stat.descriptive.moment.Variance(false);
        double[] doubleArray8 = new double[] { (byte) -1, (short) 100, 'a', 0, 1, (-1.0d) };
        double double9 = variance1.evaluate(doubleArray8);
        variance1.setBiasCorrected(true);
        boolean boolean12 = variance1.isBiasCorrected();
        double double13 = variance1.getResult();
        variance1.increment((double) 'a');
        long long16 = variance1.getN();
        org.apache.commons.math.stat.descriptive.moment.Variance variance18 = new org.apache.commons.math.stat.descriptive.moment.Variance(false);
        double[] doubleArray25 = new double[] { (byte) -1, (short) 100, 'a', 0, 1, (-1.0d) };
        double double26 = variance18.evaluate(doubleArray25);
        variance18.setBiasCorrected(true);
        boolean boolean29 = variance18.isBiasCorrected();
        double[] doubleArray36 = new double[] { (short) 0, 1.0d, 1L, 0.0d, (-1.0d), 10L };
        double double37 = variance18.evaluate(doubleArray36);
        double double38 = variance1.evaluate(doubleArray36);
        org.junit.Assert.assertNotNull(doubleArray8);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray8), "[-1.0, 100.0, 97.0, 0.0, 1.0, -1.0]");
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 2168.222222222222d + "'", double9 == 2168.222222222222d);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertTrue(Double.isNaN(double13));
        org.junit.Assert.assertTrue("'" + long16 + "' != '" + 1L + "'", long16 == 1L);
        org.junit.Assert.assertNotNull(doubleArray25);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray25), "[-1.0, 100.0, 97.0, 0.0, 1.0, -1.0]");
        org.junit.Assert.assertTrue("'" + double26 + "' != '" + 2168.222222222222d + "'", double26 == 2168.222222222222d);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + true + "'", boolean29 == true);
        org.junit.Assert.assertNotNull(doubleArray36);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray36), "[0.0, 1.0, 1.0, 0.0, -1.0, 10.0]");
        org.junit.Assert.assertTrue("'" + double37 + "' != '" + 16.566666666666663d + "'", double37 == 16.566666666666663d);
        org.junit.Assert.assertTrue("'" + double38 + "' != '" + 16.566666666666663d + "'", double38 == 16.566666666666663d);
    }

    @Test
    public void test1576() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1576");
        org.apache.commons.math.stat.descriptive.moment.Variance variance1 = new org.apache.commons.math.stat.descriptive.moment.Variance(false);
        variance1.setBiasCorrected(false);
        variance1.clear();
        boolean boolean5 = variance1.isBiasCorrected();
        variance1.setBiasCorrected(false);
        long long8 = variance1.getN();
        org.apache.commons.math.stat.descriptive.moment.Variance variance10 = new org.apache.commons.math.stat.descriptive.moment.Variance(true);
        org.apache.commons.math.stat.descriptive.moment.Variance variance12 = new org.apache.commons.math.stat.descriptive.moment.Variance(false);
        double[] doubleArray19 = new double[] { (byte) -1, (short) 100, 'a', 0, 1, (-1.0d) };
        double double20 = variance12.evaluate(doubleArray19);
        double[] doubleArray24 = new double[] { (byte) 1, (byte) 100, 1L };
        double double25 = variance12.evaluate(doubleArray24);
        boolean boolean26 = variance10.equals((java.lang.Object) variance12);
        variance12.clear();
        boolean boolean28 = variance1.equals((java.lang.Object) variance12);
        variance1.clear();
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 0L + "'", long8 == 0L);
        org.junit.Assert.assertNotNull(doubleArray19);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray19), "[-1.0, 100.0, 97.0, 0.0, 1.0, -1.0]");
        org.junit.Assert.assertTrue("'" + double20 + "' != '" + 2168.222222222222d + "'", double20 == 2168.222222222222d);
        org.junit.Assert.assertNotNull(doubleArray24);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray24), "[1.0, 100.0, 1.0]");
        org.junit.Assert.assertTrue("'" + double25 + "' != '" + 2178.0d + "'", double25 == 2178.0d);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + true + "'", boolean26 == true);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + true + "'", boolean28 == true);
    }

    @Test
    public void test1577() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1577");
        org.apache.commons.math.stat.descriptive.moment.Variance variance1 = new org.apache.commons.math.stat.descriptive.moment.Variance(false);
        double[] doubleArray8 = new double[] { (byte) -1, (short) 100, 'a', 0, 1, (-1.0d) };
        double double9 = variance1.evaluate(doubleArray8);
        variance1.setBiasCorrected(true);
        boolean boolean12 = variance1.isBiasCorrected();
        double[] doubleArray19 = new double[] { (short) 0, 1.0d, 1L, 0.0d, (-1.0d), 10L };
        double double20 = variance1.evaluate(doubleArray19);
        double double21 = variance1.getResult();
        variance1.setBiasCorrected(true);
        boolean boolean24 = variance1.isBiasCorrected();
        variance1.setBiasCorrected(false);
        variance1.increment(2601.866666666667d);
        org.apache.commons.math.stat.descriptive.moment.Variance variance30 = new org.apache.commons.math.stat.descriptive.moment.Variance(false);
        double[] doubleArray37 = new double[] { (byte) -1, (short) 100, 'a', 0, 1, (-1.0d) };
        double double38 = variance30.evaluate(doubleArray37);
        variance30.setBiasCorrected(true);
        org.apache.commons.math.stat.descriptive.moment.Variance variance42 = new org.apache.commons.math.stat.descriptive.moment.Variance(false);
        double[] doubleArray49 = new double[] { (byte) -1, (short) 100, 'a', 0, 1, (-1.0d) };
        double double50 = variance42.evaluate(doubleArray49);
        variance30.incrementAll(doubleArray49);
        variance30.clear();
        variance30.setBiasCorrected(false);
        variance30.setBiasCorrected(false);
        boolean boolean57 = variance1.equals((java.lang.Object) variance30);
        variance1.setBiasCorrected(false);
        org.junit.Assert.assertNotNull(doubleArray8);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray8), "[-1.0, 100.0, 97.0, 0.0, 1.0, -1.0]");
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 2168.222222222222d + "'", double9 == 2168.222222222222d);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertNotNull(doubleArray19);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray19), "[0.0, 1.0, 1.0, 0.0, -1.0, 10.0]");
        org.junit.Assert.assertTrue("'" + double20 + "' != '" + 16.566666666666663d + "'", double20 == 16.566666666666663d);
        org.junit.Assert.assertTrue(Double.isNaN(double21));
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + true + "'", boolean24 == true);
        org.junit.Assert.assertNotNull(doubleArray37);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray37), "[-1.0, 100.0, 97.0, 0.0, 1.0, -1.0]");
        org.junit.Assert.assertTrue("'" + double38 + "' != '" + 2168.222222222222d + "'", double38 == 2168.222222222222d);
        org.junit.Assert.assertNotNull(doubleArray49);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray49), "[-1.0, 100.0, 97.0, 0.0, 1.0, -1.0]");
        org.junit.Assert.assertTrue("'" + double50 + "' != '" + 2168.222222222222d + "'", double50 == 2168.222222222222d);
        org.junit.Assert.assertTrue("'" + boolean57 + "' != '" + false + "'", boolean57 == false);
    }

    @Test
    public void test1578() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1578");
        org.apache.commons.math.stat.descriptive.moment.Variance variance1 = new org.apache.commons.math.stat.descriptive.moment.Variance(false);
        double[] doubleArray8 = new double[] { (byte) -1, (short) 100, 'a', 0, 1, (-1.0d) };
        double double9 = variance1.evaluate(doubleArray8);
        variance1.setBiasCorrected(true);
        boolean boolean12 = variance1.isBiasCorrected();
        double[] doubleArray19 = new double[] { (short) 0, 1.0d, 1L, 0.0d, (-1.0d), 10L };
        double double20 = variance1.evaluate(doubleArray19);
        boolean boolean22 = variance1.equals((java.lang.Object) 10.0d);
        boolean boolean23 = variance1.isBiasCorrected();
        double double24 = variance1.getResult();
        double double25 = variance1.getResult();
        double[] doubleArray26 = null;
        // The following exception was thrown during execution in test generation
        try {
            double double28 = variance1.evaluate(doubleArray26, 16.566666666667153d);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(doubleArray8);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray8), "[-1.0, 100.0, 97.0, 0.0, 1.0, -1.0]");
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 2168.222222222222d + "'", double9 == 2168.222222222222d);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertNotNull(doubleArray19);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray19), "[0.0, 1.0, 1.0, 0.0, -1.0, 10.0]");
        org.junit.Assert.assertTrue("'" + double20 + "' != '" + 16.566666666666663d + "'", double20 == 16.566666666666663d);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + true + "'", boolean23 == true);
        org.junit.Assert.assertTrue(Double.isNaN(double24));
        org.junit.Assert.assertTrue(Double.isNaN(double25));
    }

    @Test
    public void test1579() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1579");
        org.apache.commons.math.stat.descriptive.moment.Variance variance1 = new org.apache.commons.math.stat.descriptive.moment.Variance(false);
        double[] doubleArray8 = new double[] { (byte) -1, (short) 100, 'a', 0, 1, (-1.0d) };
        double double9 = variance1.evaluate(doubleArray8);
        long long10 = variance1.getN();
        variance1.increment((double) (byte) 1);
        variance1.increment((double) 6L);
        double double15 = variance1.getResult();
        variance1.clear();
        org.apache.commons.math.stat.descriptive.moment.Variance variance18 = new org.apache.commons.math.stat.descriptive.moment.Variance(false);
        double[] doubleArray25 = new double[] { (byte) -1, (short) 100, 'a', 0, 1, (-1.0d) };
        double double26 = variance18.evaluate(doubleArray25);
        variance18.setBiasCorrected(true);
        boolean boolean29 = variance18.isBiasCorrected();
        double[] doubleArray36 = new double[] { (short) 0, 1.0d, 1L, 0.0d, (-1.0d), 10L };
        double double37 = variance18.evaluate(doubleArray36);
        org.apache.commons.math.stat.descriptive.moment.Variance variance39 = new org.apache.commons.math.stat.descriptive.moment.Variance(false);
        double[] doubleArray46 = new double[] { (byte) -1, (short) 100, 'a', 0, 1, (-1.0d) };
        double double47 = variance39.evaluate(doubleArray46);
        variance39.setBiasCorrected(true);
        boolean boolean50 = variance39.isBiasCorrected();
        double[] doubleArray57 = new double[] { (short) 0, 1.0d, 1L, 0.0d, (-1.0d), 10L };
        double double58 = variance39.evaluate(doubleArray57);
        double double61 = variance18.evaluate(doubleArray57, (int) (byte) 1, 0);
        variance18.setBiasCorrected(true);
        boolean boolean64 = variance1.equals((java.lang.Object) true);
        variance1.setBiasCorrected(false);
        org.junit.Assert.assertNotNull(doubleArray8);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray8), "[-1.0, 100.0, 97.0, 0.0, 1.0, -1.0]");
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 2168.222222222222d + "'", double9 == 2168.222222222222d);
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + 0L + "'", long10 == 0L);
        org.junit.Assert.assertTrue("'" + double15 + "' != '" + 6.25d + "'", double15 == 6.25d);
        org.junit.Assert.assertNotNull(doubleArray25);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray25), "[-1.0, 100.0, 97.0, 0.0, 1.0, -1.0]");
        org.junit.Assert.assertTrue("'" + double26 + "' != '" + 2168.222222222222d + "'", double26 == 2168.222222222222d);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + true + "'", boolean29 == true);
        org.junit.Assert.assertNotNull(doubleArray36);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray36), "[0.0, 1.0, 1.0, 0.0, -1.0, 10.0]");
        org.junit.Assert.assertTrue("'" + double37 + "' != '" + 16.566666666666663d + "'", double37 == 16.566666666666663d);
        org.junit.Assert.assertNotNull(doubleArray46);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray46), "[-1.0, 100.0, 97.0, 0.0, 1.0, -1.0]");
        org.junit.Assert.assertTrue("'" + double47 + "' != '" + 2168.222222222222d + "'", double47 == 2168.222222222222d);
        org.junit.Assert.assertTrue("'" + boolean50 + "' != '" + true + "'", boolean50 == true);
        org.junit.Assert.assertNotNull(doubleArray57);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray57), "[0.0, 1.0, 1.0, 0.0, -1.0, 10.0]");
        org.junit.Assert.assertTrue("'" + double58 + "' != '" + 16.566666666666663d + "'", double58 == 16.566666666666663d);
        org.junit.Assert.assertTrue(Double.isNaN(double61));
        org.junit.Assert.assertTrue("'" + boolean64 + "' != '" + false + "'", boolean64 == false);
    }

    @Test
    public void test1580() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1580");
        org.apache.commons.math.stat.descriptive.moment.Variance variance0 = new org.apache.commons.math.stat.descriptive.moment.Variance();
        long long1 = variance0.getN();
        org.apache.commons.math.stat.descriptive.moment.Variance variance3 = new org.apache.commons.math.stat.descriptive.moment.Variance(false);
        double[] doubleArray10 = new double[] { (byte) -1, (short) 100, 'a', 0, 1, (-1.0d) };
        double double11 = variance3.evaluate(doubleArray10);
        variance3.setBiasCorrected(true);
        long long14 = variance3.getN();
        boolean boolean15 = variance0.equals((java.lang.Object) long14);
        double double16 = variance0.getResult();
        long long17 = variance0.getN();
        variance0.clear();
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 0L + "'", long1 == 0L);
        org.junit.Assert.assertNotNull(doubleArray10);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray10), "[-1.0, 100.0, 97.0, 0.0, 1.0, -1.0]");
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 2168.222222222222d + "'", double11 == 2168.222222222222d);
        org.junit.Assert.assertTrue("'" + long14 + "' != '" + 0L + "'", long14 == 0L);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue(Double.isNaN(double16));
        org.junit.Assert.assertTrue("'" + long17 + "' != '" + 0L + "'", long17 == 0L);
    }

    @Test
    public void test1581() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1581");
        org.apache.commons.math.stat.descriptive.moment.Variance variance0 = new org.apache.commons.math.stat.descriptive.moment.Variance();
        double double1 = variance0.getResult();
        org.apache.commons.math.stat.descriptive.moment.Variance variance3 = new org.apache.commons.math.stat.descriptive.moment.Variance(false);
        double[] doubleArray10 = new double[] { (byte) -1, (short) 100, 'a', 0, 1, (-1.0d) };
        double double11 = variance3.evaluate(doubleArray10);
        variance3.setBiasCorrected(true);
        org.apache.commons.math.stat.descriptive.moment.Variance variance15 = new org.apache.commons.math.stat.descriptive.moment.Variance(false);
        double[] doubleArray22 = new double[] { (byte) -1, (short) 100, 'a', 0, 1, (-1.0d) };
        double double23 = variance15.evaluate(doubleArray22);
        variance3.incrementAll(doubleArray22);
        boolean boolean25 = variance0.equals((java.lang.Object) variance3);
        org.apache.commons.math.stat.descriptive.moment.Variance variance27 = new org.apache.commons.math.stat.descriptive.moment.Variance(false);
        double[] doubleArray34 = new double[] { (byte) -1, (short) 100, 'a', 0, 1, (-1.0d) };
        double double35 = variance27.evaluate(doubleArray34);
        variance27.clear();
        boolean boolean37 = variance3.equals((java.lang.Object) variance27);
        variance3.increment(13.805555555555552d);
        org.apache.commons.math.stat.descriptive.moment.Variance variance41 = new org.apache.commons.math.stat.descriptive.moment.Variance(false);
        variance41.clear();
        double double43 = variance41.getResult();
        double[] doubleArray48 = new double[] { (-1), 2168.222222222222d, 16.566666666418314d, 10.0d };
        variance41.incrementAll(doubleArray48);
        org.apache.commons.math.stat.descriptive.moment.Variance variance51 = new org.apache.commons.math.stat.descriptive.moment.Variance(false);
        double[] doubleArray58 = new double[] { (byte) -1, (short) 100, 'a', 0, 1, (-1.0d) };
        double double59 = variance51.evaluate(doubleArray58);
        variance51.setBiasCorrected(true);
        org.apache.commons.math.stat.descriptive.moment.Variance variance63 = new org.apache.commons.math.stat.descriptive.moment.Variance(false);
        double[] doubleArray70 = new double[] { (byte) -1, (short) 100, 'a', 0, 1, (-1.0d) };
        double double71 = variance63.evaluate(doubleArray70);
        variance51.incrementAll(doubleArray70);
        variance51.clear();
        org.apache.commons.math.stat.descriptive.moment.Variance variance75 = new org.apache.commons.math.stat.descriptive.moment.Variance(false);
        double[] doubleArray82 = new double[] { (byte) -1, (short) 100, 'a', 0, 1, (-1.0d) };
        double double83 = variance75.evaluate(doubleArray82);
        double[] doubleArray87 = new double[] { (byte) 1, (byte) 100, 1L };
        double double88 = variance75.evaluate(doubleArray87);
        variance51.incrementAll(doubleArray87, (int) (byte) 0, (int) (byte) 1);
        double double95 = variance41.evaluate(doubleArray87, (double) 'a', (int) (short) 1, (int) (short) 1);
        boolean boolean96 = variance3.equals((java.lang.Object) variance41);
        long long97 = variance41.getN();
        boolean boolean98 = variance41.isBiasCorrected();
        org.junit.Assert.assertTrue(Double.isNaN(double1));
        org.junit.Assert.assertNotNull(doubleArray10);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray10), "[-1.0, 100.0, 97.0, 0.0, 1.0, -1.0]");
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 2168.222222222222d + "'", double11 == 2168.222222222222d);
        org.junit.Assert.assertNotNull(doubleArray22);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray22), "[-1.0, 100.0, 97.0, 0.0, 1.0, -1.0]");
        org.junit.Assert.assertTrue("'" + double23 + "' != '" + 2168.222222222222d + "'", double23 == 2168.222222222222d);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
        org.junit.Assert.assertNotNull(doubleArray34);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray34), "[-1.0, 100.0, 97.0, 0.0, 1.0, -1.0]");
        org.junit.Assert.assertTrue("'" + double35 + "' != '" + 2168.222222222222d + "'", double35 == 2168.222222222222d);
        org.junit.Assert.assertTrue("'" + boolean37 + "' != '" + false + "'", boolean37 == false);
        org.junit.Assert.assertTrue(Double.isNaN(double43));
        org.junit.Assert.assertNotNull(doubleArray48);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray48), "[-1.0, 2168.222222222222, 16.566666666418314, 10.0]");
        org.junit.Assert.assertNotNull(doubleArray58);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray58), "[-1.0, 100.0, 97.0, 0.0, 1.0, -1.0]");
        org.junit.Assert.assertTrue("'" + double59 + "' != '" + 2168.222222222222d + "'", double59 == 2168.222222222222d);
        org.junit.Assert.assertNotNull(doubleArray70);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray70), "[-1.0, 100.0, 97.0, 0.0, 1.0, -1.0]");
        org.junit.Assert.assertTrue("'" + double71 + "' != '" + 2168.222222222222d + "'", double71 == 2168.222222222222d);
        org.junit.Assert.assertNotNull(doubleArray82);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray82), "[-1.0, 100.0, 97.0, 0.0, 1.0, -1.0]");
        org.junit.Assert.assertTrue("'" + double83 + "' != '" + 2168.222222222222d + "'", double83 == 2168.222222222222d);
        org.junit.Assert.assertNotNull(doubleArray87);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray87), "[1.0, 100.0, 1.0]");
        org.junit.Assert.assertTrue("'" + double88 + "' != '" + 2178.0d + "'", double88 == 2178.0d);
        org.junit.Assert.assertTrue("'" + double95 + "' != '" + 0.0d + "'", double95 == 0.0d);
        org.junit.Assert.assertTrue("'" + boolean96 + "' != '" + false + "'", boolean96 == false);
        org.junit.Assert.assertTrue("'" + long97 + "' != '" + 4L + "'", long97 == 4L);
        org.junit.Assert.assertTrue("'" + boolean98 + "' != '" + false + "'", boolean98 == false);
    }

    @Test
    public void test1582() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1582");
        org.apache.commons.math.stat.descriptive.moment.Variance variance1 = new org.apache.commons.math.stat.descriptive.moment.Variance(false);
        double[] doubleArray8 = new double[] { (byte) -1, (short) 100, 'a', 0, 1, (-1.0d) };
        double double9 = variance1.evaluate(doubleArray8);
        variance1.setBiasCorrected(true);
        long long12 = variance1.getN();
        variance1.clear();
        variance1.increment((double) (short) -1);
        org.apache.commons.math.stat.descriptive.moment.Variance variance17 = new org.apache.commons.math.stat.descriptive.moment.Variance(false);
        double[] doubleArray24 = new double[] { (byte) -1, (short) 100, 'a', 0, 1, (-1.0d) };
        double double25 = variance17.evaluate(doubleArray24);
        variance17.setBiasCorrected(true);
        variance17.increment((double) (byte) 0);
        variance17.clear();
        boolean boolean31 = variance17.isBiasCorrected();
        org.apache.commons.math.stat.descriptive.moment.Variance variance33 = new org.apache.commons.math.stat.descriptive.moment.Variance(false);
        double[] doubleArray40 = new double[] { (byte) -1, (short) 100, 'a', 0, 1, (-1.0d) };
        double double41 = variance33.evaluate(doubleArray40);
        variance33.setBiasCorrected(true);
        long long44 = variance33.getN();
        long long45 = variance33.getN();
        double double46 = variance33.getResult();
        variance33.clear();
        org.apache.commons.math.stat.descriptive.moment.Variance variance49 = new org.apache.commons.math.stat.descriptive.moment.Variance(false);
        double[] doubleArray56 = new double[] { (byte) -1, (short) 100, 'a', 0, 1, (-1.0d) };
        double double57 = variance49.evaluate(doubleArray56);
        double[] doubleArray61 = new double[] { (byte) 1, (byte) 100, 1L };
        double double62 = variance49.evaluate(doubleArray61);
        org.apache.commons.math.stat.descriptive.moment.Variance variance64 = new org.apache.commons.math.stat.descriptive.moment.Variance(false);
        double[] doubleArray71 = new double[] { (byte) -1, (short) 100, 'a', 0, 1, (-1.0d) };
        double double72 = variance64.evaluate(doubleArray71);
        variance64.setBiasCorrected(true);
        org.apache.commons.math.stat.descriptive.moment.Variance variance76 = new org.apache.commons.math.stat.descriptive.moment.Variance(false);
        double[] doubleArray83 = new double[] { (byte) -1, (short) 100, 'a', 0, 1, (-1.0d) };
        double double84 = variance76.evaluate(doubleArray83);
        variance64.incrementAll(doubleArray83);
        variance49.incrementAll(doubleArray83);
        double double87 = variance33.evaluate(doubleArray83);
        variance17.incrementAll(doubleArray83);
        boolean boolean89 = variance1.equals((java.lang.Object) variance17);
        variance17.increment(874596.4092824734d);
        java.lang.Class<?> wildcardClass92 = variance17.getClass();
        org.junit.Assert.assertNotNull(doubleArray8);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray8), "[-1.0, 100.0, 97.0, 0.0, 1.0, -1.0]");
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 2168.222222222222d + "'", double9 == 2168.222222222222d);
        org.junit.Assert.assertTrue("'" + long12 + "' != '" + 0L + "'", long12 == 0L);
        org.junit.Assert.assertNotNull(doubleArray24);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray24), "[-1.0, 100.0, 97.0, 0.0, 1.0, -1.0]");
        org.junit.Assert.assertTrue("'" + double25 + "' != '" + 2168.222222222222d + "'", double25 == 2168.222222222222d);
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + true + "'", boolean31 == true);
        org.junit.Assert.assertNotNull(doubleArray40);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray40), "[-1.0, 100.0, 97.0, 0.0, 1.0, -1.0]");
        org.junit.Assert.assertTrue("'" + double41 + "' != '" + 2168.222222222222d + "'", double41 == 2168.222222222222d);
        org.junit.Assert.assertTrue("'" + long44 + "' != '" + 0L + "'", long44 == 0L);
        org.junit.Assert.assertTrue("'" + long45 + "' != '" + 0L + "'", long45 == 0L);
        org.junit.Assert.assertTrue(Double.isNaN(double46));
        org.junit.Assert.assertNotNull(doubleArray56);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray56), "[-1.0, 100.0, 97.0, 0.0, 1.0, -1.0]");
        org.junit.Assert.assertTrue("'" + double57 + "' != '" + 2168.222222222222d + "'", double57 == 2168.222222222222d);
        org.junit.Assert.assertNotNull(doubleArray61);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray61), "[1.0, 100.0, 1.0]");
        org.junit.Assert.assertTrue("'" + double62 + "' != '" + 2178.0d + "'", double62 == 2178.0d);
        org.junit.Assert.assertNotNull(doubleArray71);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray71), "[-1.0, 100.0, 97.0, 0.0, 1.0, -1.0]");
        org.junit.Assert.assertTrue("'" + double72 + "' != '" + 2168.222222222222d + "'", double72 == 2168.222222222222d);
        org.junit.Assert.assertNotNull(doubleArray83);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray83), "[-1.0, 100.0, 97.0, 0.0, 1.0, -1.0]");
        org.junit.Assert.assertTrue("'" + double84 + "' != '" + 2168.222222222222d + "'", double84 == 2168.222222222222d);
        org.junit.Assert.assertTrue("'" + double87 + "' != '" + 2601.866666666667d + "'", double87 == 2601.866666666667d);
        org.junit.Assert.assertTrue("'" + boolean89 + "' != '" + false + "'", boolean89 == false);
        org.junit.Assert.assertNotNull(wildcardClass92);
    }

    @Test
    public void test1583() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1583");
        org.apache.commons.math.stat.descriptive.moment.Variance variance1 = new org.apache.commons.math.stat.descriptive.moment.Variance(false);
        double[] doubleArray8 = new double[] { (byte) -1, (short) 100, 'a', 0, 1, (-1.0d) };
        double double9 = variance1.evaluate(doubleArray8);
        variance1.setBiasCorrected(true);
        boolean boolean12 = variance1.isBiasCorrected();
        double[] doubleArray19 = new double[] { (short) 0, 1.0d, 1L, 0.0d, (-1.0d), 10L };
        double double20 = variance1.evaluate(doubleArray19);
        boolean boolean22 = variance1.equals((java.lang.Object) 10.0d);
        boolean boolean23 = variance1.isBiasCorrected();
        double double24 = variance1.getResult();
        double double25 = variance1.getResult();
        long long26 = variance1.getN();
        double double27 = variance1.getResult();
        double double28 = variance1.getResult();
        variance1.setBiasCorrected(true);
        java.lang.Class<?> wildcardClass31 = variance1.getClass();
        org.junit.Assert.assertNotNull(doubleArray8);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray8), "[-1.0, 100.0, 97.0, 0.0, 1.0, -1.0]");
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 2168.222222222222d + "'", double9 == 2168.222222222222d);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertNotNull(doubleArray19);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray19), "[0.0, 1.0, 1.0, 0.0, -1.0, 10.0]");
        org.junit.Assert.assertTrue("'" + double20 + "' != '" + 16.566666666666663d + "'", double20 == 16.566666666666663d);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + true + "'", boolean23 == true);
        org.junit.Assert.assertTrue(Double.isNaN(double24));
        org.junit.Assert.assertTrue(Double.isNaN(double25));
        org.junit.Assert.assertTrue("'" + long26 + "' != '" + 0L + "'", long26 == 0L);
        org.junit.Assert.assertTrue(Double.isNaN(double27));
        org.junit.Assert.assertTrue(Double.isNaN(double28));
        org.junit.Assert.assertNotNull(wildcardClass31);
    }

    @Test
    public void test1584() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1584");
        org.apache.commons.math.stat.descriptive.moment.Variance variance1 = new org.apache.commons.math.stat.descriptive.moment.Variance(false);
        double[] doubleArray8 = new double[] { (byte) -1, (short) 100, 'a', 0, 1, (-1.0d) };
        double double9 = variance1.evaluate(doubleArray8);
        variance1.setBiasCorrected(true);
        boolean boolean12 = variance1.isBiasCorrected();
        double[] doubleArray19 = new double[] { (short) 0, 1.0d, 1L, 0.0d, (-1.0d), 10L };
        double double20 = variance1.evaluate(doubleArray19);
        double double21 = variance1.getResult();
        variance1.increment(3267.0d);
        double double24 = variance1.getResult();
        boolean boolean25 = variance1.isBiasCorrected();
        long long26 = variance1.getN();
        org.junit.Assert.assertNotNull(doubleArray8);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray8), "[-1.0, 100.0, 97.0, 0.0, 1.0, -1.0]");
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 2168.222222222222d + "'", double9 == 2168.222222222222d);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertNotNull(doubleArray19);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray19), "[0.0, 1.0, 1.0, 0.0, -1.0, 10.0]");
        org.junit.Assert.assertTrue("'" + double20 + "' != '" + 16.566666666666663d + "'", double20 == 16.566666666666663d);
        org.junit.Assert.assertTrue(Double.isNaN(double21));
        org.junit.Assert.assertTrue("'" + double24 + "' != '" + 0.0d + "'", double24 == 0.0d);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + true + "'", boolean25 == true);
        org.junit.Assert.assertTrue("'" + long26 + "' != '" + 1L + "'", long26 == 1L);
    }

    @Test
    public void test1585() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1585");
        org.apache.commons.math.stat.descriptive.moment.Variance variance1 = new org.apache.commons.math.stat.descriptive.moment.Variance(false);
        double[] doubleArray8 = new double[] { (byte) -1, (short) 100, 'a', 0, 1, (-1.0d) };
        double double9 = variance1.evaluate(doubleArray8);
        variance1.setBiasCorrected(true);
        boolean boolean12 = variance1.isBiasCorrected();
        double[] doubleArray19 = new double[] { (short) 0, 1.0d, 1L, 0.0d, (-1.0d), 10L };
        double double20 = variance1.evaluate(doubleArray19);
        double double21 = variance1.getResult();
        long long22 = variance1.getN();
        variance1.increment((double) '#');
        variance1.setBiasCorrected(true);
        org.junit.Assert.assertNotNull(doubleArray8);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray8), "[-1.0, 100.0, 97.0, 0.0, 1.0, -1.0]");
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 2168.222222222222d + "'", double9 == 2168.222222222222d);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertNotNull(doubleArray19);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray19), "[0.0, 1.0, 1.0, 0.0, -1.0, 10.0]");
        org.junit.Assert.assertTrue("'" + double20 + "' != '" + 16.566666666666663d + "'", double20 == 16.566666666666663d);
        org.junit.Assert.assertTrue(Double.isNaN(double21));
        org.junit.Assert.assertTrue("'" + long22 + "' != '" + 0L + "'", long22 == 0L);
    }

    @Test
    public void test1586() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1586");
        org.apache.commons.math.stat.descriptive.moment.Variance variance1 = new org.apache.commons.math.stat.descriptive.moment.Variance(false);
        double[] doubleArray8 = new double[] { (byte) -1, (short) 100, 'a', 0, 1, (-1.0d) };
        double double9 = variance1.evaluate(doubleArray8);
        variance1.clear();
        org.apache.commons.math.stat.descriptive.moment.Variance variance12 = new org.apache.commons.math.stat.descriptive.moment.Variance(false);
        double[] doubleArray19 = new double[] { (byte) -1, (short) 100, 'a', 0, 1, (-1.0d) };
        double double20 = variance12.evaluate(doubleArray19);
        variance12.setBiasCorrected(true);
        boolean boolean23 = variance12.isBiasCorrected();
        double[] doubleArray30 = new double[] { (short) 0, 1.0d, 1L, 0.0d, (-1.0d), 10L };
        double double31 = variance12.evaluate(doubleArray30);
        double double32 = variance12.getResult();
        long long33 = variance12.getN();
        org.apache.commons.math.stat.descriptive.moment.Variance variance35 = new org.apache.commons.math.stat.descriptive.moment.Variance(false);
        double[] doubleArray42 = new double[] { (byte) -1, (short) 100, 'a', 0, 1, (-1.0d) };
        double double43 = variance35.evaluate(doubleArray42);
        variance35.setBiasCorrected(true);
        org.apache.commons.math.stat.descriptive.moment.Variance variance47 = new org.apache.commons.math.stat.descriptive.moment.Variance(false);
        double[] doubleArray54 = new double[] { (byte) -1, (short) 100, 'a', 0, 1, (-1.0d) };
        double double55 = variance47.evaluate(doubleArray54);
        variance47.setBiasCorrected(true);
        boolean boolean58 = variance47.isBiasCorrected();
        double[] doubleArray65 = new double[] { (short) 0, 1.0d, 1L, 0.0d, (-1.0d), 10L };
        double double66 = variance47.evaluate(doubleArray65);
        org.apache.commons.math.stat.descriptive.moment.Variance variance68 = new org.apache.commons.math.stat.descriptive.moment.Variance(false);
        double[] doubleArray75 = new double[] { (byte) -1, (short) 100, 'a', 0, 1, (-1.0d) };
        double double76 = variance68.evaluate(doubleArray75);
        variance68.setBiasCorrected(true);
        boolean boolean79 = variance68.isBiasCorrected();
        double[] doubleArray86 = new double[] { (short) 0, 1.0d, 1L, 0.0d, (-1.0d), 10L };
        double double87 = variance68.evaluate(doubleArray86);
        double double90 = variance47.evaluate(doubleArray86, (int) (byte) 1, 0);
        double double92 = variance35.evaluate(doubleArray86, 2178.0d);
        variance12.incrementAll(doubleArray86);
        double double94 = variance1.evaluate(doubleArray86);
        java.lang.Class<?> wildcardClass95 = variance1.getClass();
        org.junit.Assert.assertNotNull(doubleArray8);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray8), "[-1.0, 100.0, 97.0, 0.0, 1.0, -1.0]");
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 2168.222222222222d + "'", double9 == 2168.222222222222d);
        org.junit.Assert.assertNotNull(doubleArray19);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray19), "[-1.0, 100.0, 97.0, 0.0, 1.0, -1.0]");
        org.junit.Assert.assertTrue("'" + double20 + "' != '" + 2168.222222222222d + "'", double20 == 2168.222222222222d);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + true + "'", boolean23 == true);
        org.junit.Assert.assertNotNull(doubleArray30);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray30), "[0.0, 1.0, 1.0, 0.0, -1.0, 10.0]");
        org.junit.Assert.assertTrue("'" + double31 + "' != '" + 16.566666666666663d + "'", double31 == 16.566666666666663d);
        org.junit.Assert.assertTrue(Double.isNaN(double32));
        org.junit.Assert.assertTrue("'" + long33 + "' != '" + 0L + "'", long33 == 0L);
        org.junit.Assert.assertNotNull(doubleArray42);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray42), "[-1.0, 100.0, 97.0, 0.0, 1.0, -1.0]");
        org.junit.Assert.assertTrue("'" + double43 + "' != '" + 2168.222222222222d + "'", double43 == 2168.222222222222d);
        org.junit.Assert.assertNotNull(doubleArray54);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray54), "[-1.0, 100.0, 97.0, 0.0, 1.0, -1.0]");
        org.junit.Assert.assertTrue("'" + double55 + "' != '" + 2168.222222222222d + "'", double55 == 2168.222222222222d);
        org.junit.Assert.assertTrue("'" + boolean58 + "' != '" + true + "'", boolean58 == true);
        org.junit.Assert.assertNotNull(doubleArray65);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray65), "[0.0, 1.0, 1.0, 0.0, -1.0, 10.0]");
        org.junit.Assert.assertTrue("'" + double66 + "' != '" + 16.566666666666663d + "'", double66 == 16.566666666666663d);
        org.junit.Assert.assertNotNull(doubleArray75);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray75), "[-1.0, 100.0, 97.0, 0.0, 1.0, -1.0]");
        org.junit.Assert.assertTrue("'" + double76 + "' != '" + 2168.222222222222d + "'", double76 == 2168.222222222222d);
        org.junit.Assert.assertTrue("'" + boolean79 + "' != '" + true + "'", boolean79 == true);
        org.junit.Assert.assertNotNull(doubleArray86);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray86), "[0.0, 1.0, 1.0, 0.0, -1.0, 10.0]");
        org.junit.Assert.assertTrue("'" + double87 + "' != '" + 16.566666666666663d + "'", double87 == 16.566666666666663d);
        org.junit.Assert.assertTrue(Double.isNaN(double90));
        org.junit.Assert.assertTrue("'" + double92 + "' != '" + 16.566666666418314d + "'", double92 == 16.566666666418314d);
        org.junit.Assert.assertTrue("'" + double94 + "' != '" + 13.805555555555552d + "'", double94 == 13.805555555555552d);
        org.junit.Assert.assertNotNull(wildcardClass95);
    }

    @Test
    public void test1587() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1587");
        org.apache.commons.math.stat.descriptive.moment.Variance variance1 = new org.apache.commons.math.stat.descriptive.moment.Variance(false);
        double[] doubleArray8 = new double[] { (byte) -1, (short) 100, 'a', 0, 1, (-1.0d) };
        double double9 = variance1.evaluate(doubleArray8);
        long long10 = variance1.getN();
        variance1.increment((double) (byte) 1);
        variance1.increment(100.0d);
        org.junit.Assert.assertNotNull(doubleArray8);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray8), "[-1.0, 100.0, 97.0, 0.0, 1.0, -1.0]");
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 2168.222222222222d + "'", double9 == 2168.222222222222d);
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + 0L + "'", long10 == 0L);
    }

    @Test
    public void test1588() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1588");
        org.apache.commons.math.stat.descriptive.moment.SecondMoment secondMoment0 = null;
        org.apache.commons.math.stat.descriptive.moment.Variance variance1 = new org.apache.commons.math.stat.descriptive.moment.Variance(secondMoment0);
        variance1.setBiasCorrected(false);
        variance1.increment(10.0d);
        variance1.clear();
        double[] doubleArray7 = null;
        // The following exception was thrown during execution in test generation
        try {
            double double9 = variance1.evaluate(doubleArray7, 23.333333333333332d);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test1589() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1589");
        org.apache.commons.math.stat.descriptive.moment.Variance variance1 = new org.apache.commons.math.stat.descriptive.moment.Variance(false);
        double[] doubleArray8 = new double[] { (byte) -1, (short) 100, 'a', 0, 1, (-1.0d) };
        double double9 = variance1.evaluate(doubleArray8);
        variance1.setBiasCorrected(true);
        boolean boolean12 = variance1.isBiasCorrected();
        double[] doubleArray19 = new double[] { (short) 0, 1.0d, 1L, 0.0d, (-1.0d), 10L };
        double double20 = variance1.evaluate(doubleArray19);
        boolean boolean22 = variance1.equals((java.lang.Object) 10.0d);
        boolean boolean23 = variance1.isBiasCorrected();
        variance1.setBiasCorrected(true);
        long long26 = variance1.getN();
        variance1.setBiasCorrected(false);
        org.junit.Assert.assertNotNull(doubleArray8);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray8), "[-1.0, 100.0, 97.0, 0.0, 1.0, -1.0]");
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 2168.222222222222d + "'", double9 == 2168.222222222222d);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertNotNull(doubleArray19);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray19), "[0.0, 1.0, 1.0, 0.0, -1.0, 10.0]");
        org.junit.Assert.assertTrue("'" + double20 + "' != '" + 16.566666666666663d + "'", double20 == 16.566666666666663d);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + true + "'", boolean23 == true);
        org.junit.Assert.assertTrue("'" + long26 + "' != '" + 0L + "'", long26 == 0L);
    }

    @Test
    public void test1590() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1590");
        org.apache.commons.math.stat.descriptive.moment.SecondMoment secondMoment1 = null;
        org.apache.commons.math.stat.descriptive.moment.Variance variance2 = new org.apache.commons.math.stat.descriptive.moment.Variance(false, secondMoment1);
        variance2.increment((double) 1.0f);
        variance2.increment(4802.0d);
    }

    @Test
    public void test1591() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1591");
        org.apache.commons.math.stat.descriptive.moment.Variance variance1 = new org.apache.commons.math.stat.descriptive.moment.Variance(false);
        double[] doubleArray8 = new double[] { (byte) -1, (short) 100, 'a', 0, 1, (-1.0d) };
        double double9 = variance1.evaluate(doubleArray8);
        variance1.setBiasCorrected(true);
        org.apache.commons.math.stat.descriptive.moment.Variance variance13 = new org.apache.commons.math.stat.descriptive.moment.Variance(false);
        double[] doubleArray20 = new double[] { (byte) -1, (short) 100, 'a', 0, 1, (-1.0d) };
        double double21 = variance13.evaluate(doubleArray20);
        variance1.incrementAll(doubleArray20);
        variance1.clear();
        variance1.setBiasCorrected(false);
        variance1.setBiasCorrected(false);
        variance1.setBiasCorrected(true);
        org.apache.commons.math.stat.descriptive.moment.Variance variance31 = new org.apache.commons.math.stat.descriptive.moment.Variance(false);
        double[] doubleArray38 = new double[] { (byte) -1, (short) 100, 'a', 0, 1, (-1.0d) };
        double double39 = variance31.evaluate(doubleArray38);
        variance31.setBiasCorrected(true);
        boolean boolean42 = variance31.isBiasCorrected();
        org.apache.commons.math.stat.descriptive.moment.Variance variance44 = new org.apache.commons.math.stat.descriptive.moment.Variance(false);
        double[] doubleArray51 = new double[] { (byte) -1, (short) 100, 'a', 0, 1, (-1.0d) };
        double double52 = variance44.evaluate(doubleArray51);
        variance44.setBiasCorrected(true);
        org.apache.commons.math.stat.descriptive.moment.Variance variance56 = new org.apache.commons.math.stat.descriptive.moment.Variance(false);
        double[] doubleArray63 = new double[] { (byte) -1, (short) 100, 'a', 0, 1, (-1.0d) };
        double double64 = variance56.evaluate(doubleArray63);
        variance56.setBiasCorrected(true);
        boolean boolean67 = variance56.isBiasCorrected();
        double[] doubleArray74 = new double[] { (short) 0, 1.0d, 1L, 0.0d, (-1.0d), 10L };
        double double75 = variance56.evaluate(doubleArray74);
        double double78 = variance44.evaluate(doubleArray74, (int) (byte) 1, (int) (byte) 0);
        double double81 = variance31.evaluate(doubleArray74, (int) (byte) 1, 0);
        org.apache.commons.math.stat.descriptive.moment.Variance variance83 = new org.apache.commons.math.stat.descriptive.moment.Variance(false);
        double[] doubleArray90 = new double[] { (byte) -1, (short) 100, 'a', 0, 1, (-1.0d) };
        double double91 = variance83.evaluate(doubleArray90);
        variance83.clear();
        variance83.setBiasCorrected(true);
        boolean boolean95 = variance31.equals((java.lang.Object) variance83);
        boolean boolean96 = variance1.equals((java.lang.Object) variance83);
        variance83.clear();
        variance83.clear();
        org.junit.Assert.assertNotNull(doubleArray8);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray8), "[-1.0, 100.0, 97.0, 0.0, 1.0, -1.0]");
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 2168.222222222222d + "'", double9 == 2168.222222222222d);
        org.junit.Assert.assertNotNull(doubleArray20);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray20), "[-1.0, 100.0, 97.0, 0.0, 1.0, -1.0]");
        org.junit.Assert.assertTrue("'" + double21 + "' != '" + 2168.222222222222d + "'", double21 == 2168.222222222222d);
        org.junit.Assert.assertNotNull(doubleArray38);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray38), "[-1.0, 100.0, 97.0, 0.0, 1.0, -1.0]");
        org.junit.Assert.assertTrue("'" + double39 + "' != '" + 2168.222222222222d + "'", double39 == 2168.222222222222d);
        org.junit.Assert.assertTrue("'" + boolean42 + "' != '" + true + "'", boolean42 == true);
        org.junit.Assert.assertNotNull(doubleArray51);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray51), "[-1.0, 100.0, 97.0, 0.0, 1.0, -1.0]");
        org.junit.Assert.assertTrue("'" + double52 + "' != '" + 2168.222222222222d + "'", double52 == 2168.222222222222d);
        org.junit.Assert.assertNotNull(doubleArray63);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray63), "[-1.0, 100.0, 97.0, 0.0, 1.0, -1.0]");
        org.junit.Assert.assertTrue("'" + double64 + "' != '" + 2168.222222222222d + "'", double64 == 2168.222222222222d);
        org.junit.Assert.assertTrue("'" + boolean67 + "' != '" + true + "'", boolean67 == true);
        org.junit.Assert.assertNotNull(doubleArray74);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray74), "[0.0, 1.0, 1.0, 0.0, -1.0, 10.0]");
        org.junit.Assert.assertTrue("'" + double75 + "' != '" + 16.566666666666663d + "'", double75 == 16.566666666666663d);
        org.junit.Assert.assertTrue(Double.isNaN(double78));
        org.junit.Assert.assertTrue(Double.isNaN(double81));
        org.junit.Assert.assertNotNull(doubleArray90);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray90), "[-1.0, 100.0, 97.0, 0.0, 1.0, -1.0]");
        org.junit.Assert.assertTrue("'" + double91 + "' != '" + 2168.222222222222d + "'", double91 == 2168.222222222222d);
        org.junit.Assert.assertTrue("'" + boolean95 + "' != '" + true + "'", boolean95 == true);
        org.junit.Assert.assertTrue("'" + boolean96 + "' != '" + true + "'", boolean96 == true);
    }

    @Test
    public void test1592() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1592");
        org.apache.commons.math.stat.descriptive.moment.Variance variance1 = new org.apache.commons.math.stat.descriptive.moment.Variance(false);
        double[] doubleArray8 = new double[] { (byte) -1, (short) 100, 'a', 0, 1, (-1.0d) };
        double double9 = variance1.evaluate(doubleArray8);
        variance1.setBiasCorrected(true);
        boolean boolean12 = variance1.isBiasCorrected();
        org.apache.commons.math.stat.descriptive.moment.Variance variance14 = new org.apache.commons.math.stat.descriptive.moment.Variance(false);
        double[] doubleArray21 = new double[] { (byte) -1, (short) 100, 'a', 0, 1, (-1.0d) };
        double double22 = variance14.evaluate(doubleArray21);
        variance14.setBiasCorrected(true);
        org.apache.commons.math.stat.descriptive.moment.Variance variance26 = new org.apache.commons.math.stat.descriptive.moment.Variance(false);
        double[] doubleArray33 = new double[] { (byte) -1, (short) 100, 'a', 0, 1, (-1.0d) };
        double double34 = variance26.evaluate(doubleArray33);
        variance26.setBiasCorrected(true);
        boolean boolean37 = variance26.isBiasCorrected();
        double[] doubleArray44 = new double[] { (short) 0, 1.0d, 1L, 0.0d, (-1.0d), 10L };
        double double45 = variance26.evaluate(doubleArray44);
        double double48 = variance14.evaluate(doubleArray44, (int) (byte) 1, (int) (byte) 0);
        double double51 = variance1.evaluate(doubleArray44, (int) (byte) 1, 0);
        variance1.setBiasCorrected(false);
        org.apache.commons.math.stat.descriptive.moment.Variance variance55 = new org.apache.commons.math.stat.descriptive.moment.Variance(false);
        double[] doubleArray62 = new double[] { (byte) -1, (short) 100, 'a', 0, 1, (-1.0d) };
        double double63 = variance55.evaluate(doubleArray62);
        variance55.setBiasCorrected(true);
        boolean boolean66 = variance55.isBiasCorrected();
        double[] doubleArray73 = new double[] { (short) 0, 1.0d, 1L, 0.0d, (-1.0d), 10L };
        double double74 = variance55.evaluate(doubleArray73);
        double double75 = variance55.getResult();
        org.apache.commons.math.stat.descriptive.moment.Variance variance77 = new org.apache.commons.math.stat.descriptive.moment.Variance(false);
        variance77.clear();
        double double79 = variance77.getResult();
        double[] doubleArray84 = new double[] { (-1), 2168.222222222222d, 16.566666666418314d, 10.0d };
        variance77.incrementAll(doubleArray84);
        double double86 = variance55.evaluate(doubleArray84);
        boolean boolean87 = variance1.equals((java.lang.Object) variance55);
        variance55.setBiasCorrected(false);
        variance55.clear();
        double double91 = variance55.getResult();
        boolean boolean92 = variance55.isBiasCorrected();
        boolean boolean93 = variance55.isBiasCorrected();
        org.junit.Assert.assertNotNull(doubleArray8);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray8), "[-1.0, 100.0, 97.0, 0.0, 1.0, -1.0]");
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 2168.222222222222d + "'", double9 == 2168.222222222222d);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertNotNull(doubleArray21);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray21), "[-1.0, 100.0, 97.0, 0.0, 1.0, -1.0]");
        org.junit.Assert.assertTrue("'" + double22 + "' != '" + 2168.222222222222d + "'", double22 == 2168.222222222222d);
        org.junit.Assert.assertNotNull(doubleArray33);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray33), "[-1.0, 100.0, 97.0, 0.0, 1.0, -1.0]");
        org.junit.Assert.assertTrue("'" + double34 + "' != '" + 2168.222222222222d + "'", double34 == 2168.222222222222d);
        org.junit.Assert.assertTrue("'" + boolean37 + "' != '" + true + "'", boolean37 == true);
        org.junit.Assert.assertNotNull(doubleArray44);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray44), "[0.0, 1.0, 1.0, 0.0, -1.0, 10.0]");
        org.junit.Assert.assertTrue("'" + double45 + "' != '" + 16.566666666666663d + "'", double45 == 16.566666666666663d);
        org.junit.Assert.assertTrue(Double.isNaN(double48));
        org.junit.Assert.assertTrue(Double.isNaN(double51));
        org.junit.Assert.assertNotNull(doubleArray62);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray62), "[-1.0, 100.0, 97.0, 0.0, 1.0, -1.0]");
        org.junit.Assert.assertTrue("'" + double63 + "' != '" + 2168.222222222222d + "'", double63 == 2168.222222222222d);
        org.junit.Assert.assertTrue("'" + boolean66 + "' != '" + true + "'", boolean66 == true);
        org.junit.Assert.assertNotNull(doubleArray73);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray73), "[0.0, 1.0, 1.0, 0.0, -1.0, 10.0]");
        org.junit.Assert.assertTrue("'" + double74 + "' != '" + 16.566666666666663d + "'", double74 == 16.566666666666663d);
        org.junit.Assert.assertTrue(Double.isNaN(double75));
        org.junit.Assert.assertTrue(Double.isNaN(double79));
        org.junit.Assert.assertNotNull(doubleArray84);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray84), "[-1.0, 2168.222222222222, 16.566666666418314, 10.0]");
        org.junit.Assert.assertTrue("'" + double86 + "' != '" + 1166128.5457099646d + "'", double86 == 1166128.5457099646d);
        org.junit.Assert.assertTrue("'" + boolean87 + "' != '" + true + "'", boolean87 == true);
        org.junit.Assert.assertTrue(Double.isNaN(double91));
        org.junit.Assert.assertTrue("'" + boolean92 + "' != '" + false + "'", boolean92 == false);
        org.junit.Assert.assertTrue("'" + boolean93 + "' != '" + false + "'", boolean93 == false);
    }

    @Test
    public void test1593() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1593");
        org.apache.commons.math.stat.descriptive.moment.Variance variance1 = new org.apache.commons.math.stat.descriptive.moment.Variance(false);
        double[] doubleArray8 = new double[] { (byte) -1, (short) 100, 'a', 0, 1, (-1.0d) };
        double double9 = variance1.evaluate(doubleArray8);
        variance1.setBiasCorrected(true);
        variance1.increment((double) (byte) 0);
        double[] doubleArray16 = new double[] { 'a', 100L };
        double double18 = variance1.evaluate(doubleArray16, 0.0d);
        long long19 = variance1.getN();
        boolean boolean20 = variance1.isBiasCorrected();
        long long21 = variance1.getN();
        double double22 = variance1.getResult();
        long long23 = variance1.getN();
        boolean boolean24 = variance1.isBiasCorrected();
        double double25 = variance1.getResult();
        org.junit.Assert.assertNotNull(doubleArray8);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray8), "[-1.0, 100.0, 97.0, 0.0, 1.0, -1.0]");
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 2168.222222222222d + "'", double9 == 2168.222222222222d);
        org.junit.Assert.assertNotNull(doubleArray16);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray16), "[97.0, 100.0]");
        org.junit.Assert.assertTrue("'" + double18 + "' != '" + 4.5d + "'", double18 == 4.5d);
        org.junit.Assert.assertTrue("'" + long19 + "' != '" + 1L + "'", long19 == 1L);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + true + "'", boolean20 == true);
        org.junit.Assert.assertTrue("'" + long21 + "' != '" + 1L + "'", long21 == 1L);
        org.junit.Assert.assertTrue("'" + double22 + "' != '" + 0.0d + "'", double22 == 0.0d);
        org.junit.Assert.assertTrue("'" + long23 + "' != '" + 1L + "'", long23 == 1L);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + true + "'", boolean24 == true);
        org.junit.Assert.assertTrue("'" + double25 + "' != '" + 0.0d + "'", double25 == 0.0d);
    }

    @Test
    public void test1594() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1594");
        org.apache.commons.math.stat.descriptive.moment.Variance variance1 = new org.apache.commons.math.stat.descriptive.moment.Variance(false);
        double[] doubleArray8 = new double[] { (byte) -1, (short) 100, 'a', 0, 1, (-1.0d) };
        double double9 = variance1.evaluate(doubleArray8);
        variance1.setBiasCorrected(true);
        boolean boolean12 = variance1.isBiasCorrected();
        double[] doubleArray19 = new double[] { (short) 0, 1.0d, 1L, 0.0d, (-1.0d), 10L };
        double double20 = variance1.evaluate(doubleArray19);
        org.apache.commons.math.stat.descriptive.moment.Variance variance22 = new org.apache.commons.math.stat.descriptive.moment.Variance(false);
        double[] doubleArray29 = new double[] { (byte) -1, (short) 100, 'a', 0, 1, (-1.0d) };
        double double30 = variance22.evaluate(doubleArray29);
        variance22.setBiasCorrected(true);
        boolean boolean33 = variance22.isBiasCorrected();
        double[] doubleArray40 = new double[] { (short) 0, 1.0d, 1L, 0.0d, (-1.0d), 10L };
        double double41 = variance22.evaluate(doubleArray40);
        double double44 = variance1.evaluate(doubleArray40, (int) (byte) 1, 0);
        boolean boolean45 = variance1.isBiasCorrected();
        variance1.clear();
        double double47 = variance1.getResult();
        org.apache.commons.math.stat.descriptive.moment.Variance variance49 = new org.apache.commons.math.stat.descriptive.moment.Variance(false);
        double[] doubleArray56 = new double[] { (byte) -1, (short) 100, 'a', 0, 1, (-1.0d) };
        double double57 = variance49.evaluate(doubleArray56);
        variance49.setBiasCorrected(true);
        long long60 = variance49.getN();
        variance49.clear();
        org.apache.commons.math.stat.descriptive.moment.Variance variance63 = new org.apache.commons.math.stat.descriptive.moment.Variance(false);
        double[] doubleArray70 = new double[] { (byte) -1, (short) 100, 'a', 0, 1, (-1.0d) };
        double double71 = variance63.evaluate(doubleArray70);
        double double72 = variance49.evaluate(doubleArray70);
        double double74 = variance1.evaluate(doubleArray70, 16.56666666666667d);
        variance1.increment(13.805555555969477d);
        org.junit.Assert.assertNotNull(doubleArray8);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray8), "[-1.0, 100.0, 97.0, 0.0, 1.0, -1.0]");
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 2168.222222222222d + "'", double9 == 2168.222222222222d);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertNotNull(doubleArray19);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray19), "[0.0, 1.0, 1.0, 0.0, -1.0, 10.0]");
        org.junit.Assert.assertTrue("'" + double20 + "' != '" + 16.566666666666663d + "'", double20 == 16.566666666666663d);
        org.junit.Assert.assertNotNull(doubleArray29);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray29), "[-1.0, 100.0, 97.0, 0.0, 1.0, -1.0]");
        org.junit.Assert.assertTrue("'" + double30 + "' != '" + 2168.222222222222d + "'", double30 == 2168.222222222222d);
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + true + "'", boolean33 == true);
        org.junit.Assert.assertNotNull(doubleArray40);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray40), "[0.0, 1.0, 1.0, 0.0, -1.0, 10.0]");
        org.junit.Assert.assertTrue("'" + double41 + "' != '" + 16.566666666666663d + "'", double41 == 16.566666666666663d);
        org.junit.Assert.assertTrue(Double.isNaN(double44));
        org.junit.Assert.assertTrue("'" + boolean45 + "' != '" + true + "'", boolean45 == true);
        org.junit.Assert.assertTrue(Double.isNaN(double47));
        org.junit.Assert.assertNotNull(doubleArray56);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray56), "[-1.0, 100.0, 97.0, 0.0, 1.0, -1.0]");
        org.junit.Assert.assertTrue("'" + double57 + "' != '" + 2168.222222222222d + "'", double57 == 2168.222222222222d);
        org.junit.Assert.assertTrue("'" + long60 + "' != '" + 0L + "'", long60 == 0L);
        org.junit.Assert.assertNotNull(doubleArray70);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray70), "[-1.0, 100.0, 97.0, 0.0, 1.0, -1.0]");
        org.junit.Assert.assertTrue("'" + double71 + "' != '" + 2168.222222222222d + "'", double71 == 2168.222222222222d);
        org.junit.Assert.assertTrue("'" + double72 + "' != '" + 2601.866666666667d + "'", double72 == 2601.866666666667d);
        org.junit.Assert.assertTrue("'" + double74 + "' != '" + 2601.8666666666672d + "'", double74 == 2601.8666666666672d);
    }

    @Test
    public void test1595() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1595");
        org.apache.commons.math.stat.descriptive.moment.Variance variance1 = new org.apache.commons.math.stat.descriptive.moment.Variance(false);
        double[] doubleArray8 = new double[] { (byte) -1, (short) 100, 'a', 0, 1, (-1.0d) };
        double double9 = variance1.evaluate(doubleArray8);
        variance1.setBiasCorrected(true);
        boolean boolean12 = variance1.isBiasCorrected();
        double[] doubleArray19 = new double[] { (short) 0, 1.0d, 1L, 0.0d, (-1.0d), 10L };
        double double20 = variance1.evaluate(doubleArray19);
        org.apache.commons.math.stat.descriptive.moment.Variance variance22 = new org.apache.commons.math.stat.descriptive.moment.Variance(false);
        double[] doubleArray29 = new double[] { (byte) -1, (short) 100, 'a', 0, 1, (-1.0d) };
        double double30 = variance22.evaluate(doubleArray29);
        variance22.setBiasCorrected(true);
        boolean boolean33 = variance22.isBiasCorrected();
        double[] doubleArray40 = new double[] { (short) 0, 1.0d, 1L, 0.0d, (-1.0d), 10L };
        double double41 = variance22.evaluate(doubleArray40);
        double double44 = variance1.evaluate(doubleArray40, (int) (byte) 1, 0);
        variance1.setBiasCorrected(true);
        variance1.setBiasCorrected(true);
        double double49 = variance1.getResult();
        boolean boolean50 = variance1.isBiasCorrected();
        org.apache.commons.math.stat.descriptive.moment.Variance variance52 = new org.apache.commons.math.stat.descriptive.moment.Variance(false);
        double[] doubleArray59 = new double[] { (byte) -1, (short) 100, 'a', 0, 1, (-1.0d) };
        double double60 = variance52.evaluate(doubleArray59);
        variance52.setBiasCorrected(true);
        org.apache.commons.math.stat.descriptive.moment.Variance variance64 = new org.apache.commons.math.stat.descriptive.moment.Variance(false);
        double[] doubleArray71 = new double[] { (byte) -1, (short) 100, 'a', 0, 1, (-1.0d) };
        double double72 = variance64.evaluate(doubleArray71);
        variance52.incrementAll(doubleArray71);
        double double75 = variance1.evaluate(doubleArray71, 0.0d);
        long long76 = variance1.getN();
        variance1.increment(13.80555555555562d);
        org.junit.Assert.assertNotNull(doubleArray8);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray8), "[-1.0, 100.0, 97.0, 0.0, 1.0, -1.0]");
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 2168.222222222222d + "'", double9 == 2168.222222222222d);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertNotNull(doubleArray19);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray19), "[0.0, 1.0, 1.0, 0.0, -1.0, 10.0]");
        org.junit.Assert.assertTrue("'" + double20 + "' != '" + 16.566666666666663d + "'", double20 == 16.566666666666663d);
        org.junit.Assert.assertNotNull(doubleArray29);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray29), "[-1.0, 100.0, 97.0, 0.0, 1.0, -1.0]");
        org.junit.Assert.assertTrue("'" + double30 + "' != '" + 2168.222222222222d + "'", double30 == 2168.222222222222d);
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + true + "'", boolean33 == true);
        org.junit.Assert.assertNotNull(doubleArray40);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray40), "[0.0, 1.0, 1.0, 0.0, -1.0, 10.0]");
        org.junit.Assert.assertTrue("'" + double41 + "' != '" + 16.566666666666663d + "'", double41 == 16.566666666666663d);
        org.junit.Assert.assertTrue(Double.isNaN(double44));
        org.junit.Assert.assertTrue(Double.isNaN(double49));
        org.junit.Assert.assertTrue("'" + boolean50 + "' != '" + true + "'", boolean50 == true);
        org.junit.Assert.assertNotNull(doubleArray59);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray59), "[-1.0, 100.0, 97.0, 0.0, 1.0, -1.0]");
        org.junit.Assert.assertTrue("'" + double60 + "' != '" + 2168.222222222222d + "'", double60 == 2168.222222222222d);
        org.junit.Assert.assertNotNull(doubleArray71);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray71), "[-1.0, 100.0, 97.0, 0.0, 1.0, -1.0]");
        org.junit.Assert.assertTrue("'" + double72 + "' != '" + 2168.222222222222d + "'", double72 == 2168.222222222222d);
        org.junit.Assert.assertTrue("'" + double75 + "' != '" + 2601.8666666666663d + "'", double75 == 2601.8666666666663d);
        org.junit.Assert.assertTrue("'" + long76 + "' != '" + 0L + "'", long76 == 0L);
    }

    @Test
    public void test1596() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1596");
        org.apache.commons.math.stat.descriptive.moment.Variance variance1 = new org.apache.commons.math.stat.descriptive.moment.Variance(false);
        org.apache.commons.math.stat.descriptive.moment.Variance variance3 = new org.apache.commons.math.stat.descriptive.moment.Variance(false);
        double[] doubleArray10 = new double[] { (byte) -1, (short) 100, 'a', 0, 1, (-1.0d) };
        double double11 = variance3.evaluate(doubleArray10);
        variance3.setBiasCorrected(true);
        org.apache.commons.math.stat.descriptive.moment.Variance variance15 = new org.apache.commons.math.stat.descriptive.moment.Variance(false);
        variance15.clear();
        double double17 = variance15.getResult();
        double[] doubleArray22 = new double[] { (-1), 2168.222222222222d, 16.566666666418314d, 10.0d };
        variance15.incrementAll(doubleArray22);
        variance3.incrementAll(doubleArray22);
        double double25 = variance1.evaluate(doubleArray22);
        boolean boolean26 = variance1.isBiasCorrected();
        variance1.setBiasCorrected(true);
        double double29 = variance1.getResult();
        double double30 = variance1.getResult();
        org.junit.Assert.assertNotNull(doubleArray10);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray10), "[-1.0, 100.0, 97.0, 0.0, 1.0, -1.0]");
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 2168.222222222222d + "'", double11 == 2168.222222222222d);
        org.junit.Assert.assertTrue(Double.isNaN(double17));
        org.junit.Assert.assertNotNull(doubleArray22);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray22), "[-1.0, 2168.222222222222, 16.566666666418314, 10.0]");
        org.junit.Assert.assertTrue("'" + double25 + "' != '" + 874596.4092824734d + "'", double25 == 874596.4092824734d);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
        org.junit.Assert.assertTrue(Double.isNaN(double29));
        org.junit.Assert.assertTrue(Double.isNaN(double30));
    }

    @Test
    public void test1597() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1597");
        org.apache.commons.math.stat.descriptive.moment.SecondMoment secondMoment1 = null;
        org.apache.commons.math.stat.descriptive.moment.Variance variance2 = new org.apache.commons.math.stat.descriptive.moment.Variance(true, secondMoment1);
        variance2.clear();
        double[] doubleArray4 = new double[] {};
        variance2.incrementAll(doubleArray4);
        variance2.increment(2178.0d);
        variance2.clear();
        variance2.increment(3267.0d);
        boolean boolean11 = variance2.isBiasCorrected();
        org.junit.Assert.assertNotNull(doubleArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray4), "[]");
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
    }

    @Test
    public void test1598() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1598");
        org.apache.commons.math.stat.descriptive.moment.Variance variance1 = new org.apache.commons.math.stat.descriptive.moment.Variance(false);
        double[] doubleArray8 = new double[] { (byte) -1, (short) 100, 'a', 0, 1, (-1.0d) };
        double double9 = variance1.evaluate(doubleArray8);
        variance1.setBiasCorrected(true);
        boolean boolean12 = variance1.isBiasCorrected();
        double[] doubleArray19 = new double[] { (short) 0, 1.0d, 1L, 0.0d, (-1.0d), 10L };
        double double20 = variance1.evaluate(doubleArray19);
        org.apache.commons.math.stat.descriptive.moment.Variance variance22 = new org.apache.commons.math.stat.descriptive.moment.Variance(false);
        double[] doubleArray29 = new double[] { (byte) -1, (short) 100, 'a', 0, 1, (-1.0d) };
        double double30 = variance22.evaluate(doubleArray29);
        variance22.setBiasCorrected(true);
        boolean boolean33 = variance22.isBiasCorrected();
        double[] doubleArray40 = new double[] { (short) 0, 1.0d, 1L, 0.0d, (-1.0d), 10L };
        double double41 = variance22.evaluate(doubleArray40);
        double double44 = variance1.evaluate(doubleArray40, (int) (byte) 1, 0);
        double double45 = variance1.getResult();
        long long46 = variance1.getN();
        boolean boolean47 = variance1.isBiasCorrected();
        java.lang.Class<?> wildcardClass48 = variance1.getClass();
        org.junit.Assert.assertNotNull(doubleArray8);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray8), "[-1.0, 100.0, 97.0, 0.0, 1.0, -1.0]");
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 2168.222222222222d + "'", double9 == 2168.222222222222d);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertNotNull(doubleArray19);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray19), "[0.0, 1.0, 1.0, 0.0, -1.0, 10.0]");
        org.junit.Assert.assertTrue("'" + double20 + "' != '" + 16.566666666666663d + "'", double20 == 16.566666666666663d);
        org.junit.Assert.assertNotNull(doubleArray29);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray29), "[-1.0, 100.0, 97.0, 0.0, 1.0, -1.0]");
        org.junit.Assert.assertTrue("'" + double30 + "' != '" + 2168.222222222222d + "'", double30 == 2168.222222222222d);
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + true + "'", boolean33 == true);
        org.junit.Assert.assertNotNull(doubleArray40);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray40), "[0.0, 1.0, 1.0, 0.0, -1.0, 10.0]");
        org.junit.Assert.assertTrue("'" + double41 + "' != '" + 16.566666666666663d + "'", double41 == 16.566666666666663d);
        org.junit.Assert.assertTrue(Double.isNaN(double44));
        org.junit.Assert.assertTrue(Double.isNaN(double45));
        org.junit.Assert.assertTrue("'" + long46 + "' != '" + 0L + "'", long46 == 0L);
        org.junit.Assert.assertTrue("'" + boolean47 + "' != '" + true + "'", boolean47 == true);
        org.junit.Assert.assertNotNull(wildcardClass48);
    }

    @Test
    public void test1599() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1599");
        org.apache.commons.math.stat.descriptive.moment.Variance variance1 = new org.apache.commons.math.stat.descriptive.moment.Variance(false);
        double[] doubleArray8 = new double[] { (byte) -1, (short) 100, 'a', 0, 1, (-1.0d) };
        double double9 = variance1.evaluate(doubleArray8);
        long long10 = variance1.getN();
        variance1.increment((double) (byte) 1);
        variance1.increment((double) 6L);
        variance1.increment(13.805555555555557d);
        variance1.setBiasCorrected(true);
        org.junit.Assert.assertNotNull(doubleArray8);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray8), "[-1.0, 100.0, 97.0, 0.0, 1.0, -1.0]");
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 2168.222222222222d + "'", double9 == 2168.222222222222d);
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + 0L + "'", long10 == 0L);
    }

    @Test
    public void test1600() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1600");
        org.apache.commons.math.stat.descriptive.moment.Variance variance1 = new org.apache.commons.math.stat.descriptive.moment.Variance(false);
        double[] doubleArray8 = new double[] { (byte) -1, (short) 100, 'a', 0, 1, (-1.0d) };
        double double9 = variance1.evaluate(doubleArray8);
        variance1.setBiasCorrected(true);
        org.apache.commons.math.stat.descriptive.moment.Variance variance13 = new org.apache.commons.math.stat.descriptive.moment.Variance(false);
        double[] doubleArray20 = new double[] { (byte) -1, (short) 100, 'a', 0, 1, (-1.0d) };
        double double21 = variance13.evaluate(doubleArray20);
        variance1.incrementAll(doubleArray20);
        org.apache.commons.math.stat.descriptive.moment.Variance variance24 = new org.apache.commons.math.stat.descriptive.moment.Variance(false);
        double[] doubleArray31 = new double[] { (byte) -1, (short) 100, 'a', 0, 1, (-1.0d) };
        double double32 = variance24.evaluate(doubleArray31);
        variance24.setBiasCorrected(true);
        org.apache.commons.math.stat.descriptive.moment.Variance variance36 = new org.apache.commons.math.stat.descriptive.moment.Variance(false);
        double[] doubleArray43 = new double[] { (byte) -1, (short) 100, 'a', 0, 1, (-1.0d) };
        double double44 = variance36.evaluate(doubleArray43);
        variance36.setBiasCorrected(true);
        boolean boolean47 = variance36.isBiasCorrected();
        double[] doubleArray54 = new double[] { (short) 0, 1.0d, 1L, 0.0d, (-1.0d), 10L };
        double double55 = variance36.evaluate(doubleArray54);
        double double58 = variance24.evaluate(doubleArray54, (int) (byte) 1, (int) (byte) 0);
        org.apache.commons.math.stat.descriptive.moment.Variance variance60 = new org.apache.commons.math.stat.descriptive.moment.Variance(true);
        variance60.increment(16.566666666418314d);
        org.apache.commons.math.stat.descriptive.moment.Variance variance64 = new org.apache.commons.math.stat.descriptive.moment.Variance(false);
        double[] doubleArray71 = new double[] { (byte) -1, (short) 100, 'a', 0, 1, (-1.0d) };
        double double72 = variance64.evaluate(doubleArray71);
        variance64.setBiasCorrected(true);
        long long75 = variance64.getN();
        long long76 = variance64.getN();
        org.apache.commons.math.stat.descriptive.moment.Variance variance78 = new org.apache.commons.math.stat.descriptive.moment.Variance(false);
        double[] doubleArray85 = new double[] { (byte) -1, (short) 100, 'a', 0, 1, (-1.0d) };
        double double86 = variance78.evaluate(doubleArray85);
        double[] doubleArray90 = new double[] { (byte) 1, (byte) 100, 1L };
        double double91 = variance78.evaluate(doubleArray90);
        double double93 = variance64.evaluate(doubleArray90, (double) 10.0f);
        double double95 = variance60.evaluate(doubleArray90, 13.805555555555557d);
        double double96 = variance24.evaluate(doubleArray90);
        double double98 = variance1.evaluate(doubleArray90, (double) 100L);
        boolean boolean99 = variance1.isBiasCorrected();
        org.junit.Assert.assertNotNull(doubleArray8);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray8), "[-1.0, 100.0, 97.0, 0.0, 1.0, -1.0]");
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 2168.222222222222d + "'", double9 == 2168.222222222222d);
        org.junit.Assert.assertNotNull(doubleArray20);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray20), "[-1.0, 100.0, 97.0, 0.0, 1.0, -1.0]");
        org.junit.Assert.assertTrue("'" + double21 + "' != '" + 2168.222222222222d + "'", double21 == 2168.222222222222d);
        org.junit.Assert.assertNotNull(doubleArray31);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray31), "[-1.0, 100.0, 97.0, 0.0, 1.0, -1.0]");
        org.junit.Assert.assertTrue("'" + double32 + "' != '" + 2168.222222222222d + "'", double32 == 2168.222222222222d);
        org.junit.Assert.assertNotNull(doubleArray43);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray43), "[-1.0, 100.0, 97.0, 0.0, 1.0, -1.0]");
        org.junit.Assert.assertTrue("'" + double44 + "' != '" + 2168.222222222222d + "'", double44 == 2168.222222222222d);
        org.junit.Assert.assertTrue("'" + boolean47 + "' != '" + true + "'", boolean47 == true);
        org.junit.Assert.assertNotNull(doubleArray54);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray54), "[0.0, 1.0, 1.0, 0.0, -1.0, 10.0]");
        org.junit.Assert.assertTrue("'" + double55 + "' != '" + 16.566666666666663d + "'", double55 == 16.566666666666663d);
        org.junit.Assert.assertTrue(Double.isNaN(double58));
        org.junit.Assert.assertNotNull(doubleArray71);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray71), "[-1.0, 100.0, 97.0, 0.0, 1.0, -1.0]");
        org.junit.Assert.assertTrue("'" + double72 + "' != '" + 2168.222222222222d + "'", double72 == 2168.222222222222d);
        org.junit.Assert.assertTrue("'" + long75 + "' != '" + 0L + "'", long75 == 0L);
        org.junit.Assert.assertTrue("'" + long76 + "' != '" + 0L + "'", long76 == 0L);
        org.junit.Assert.assertNotNull(doubleArray85);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray85), "[-1.0, 100.0, 97.0, 0.0, 1.0, -1.0]");
        org.junit.Assert.assertTrue("'" + double86 + "' != '" + 2168.222222222222d + "'", double86 == 2168.222222222222d);
        org.junit.Assert.assertNotNull(doubleArray90);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray90), "[1.0, 100.0, 1.0]");
        org.junit.Assert.assertTrue("'" + double91 + "' != '" + 2178.0d + "'", double91 == 2178.0d);
        org.junit.Assert.assertTrue("'" + double93 + "' != '" + 3267.0d + "'", double93 == 3267.0d);
        org.junit.Assert.assertTrue("'" + double95 + "' != '" + 3266.9999999999995d + "'", double95 == 3266.9999999999995d);
        org.junit.Assert.assertTrue("'" + double96 + "' != '" + 3267.0d + "'", double96 == 3267.0d);
        org.junit.Assert.assertTrue("'" + double98 + "' != '" + 3267.0d + "'", double98 == 3267.0d);
        org.junit.Assert.assertTrue("'" + boolean99 + "' != '" + true + "'", boolean99 == true);
    }

    @Test
    public void test1601() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1601");
        org.apache.commons.math.stat.descriptive.moment.Variance variance1 = new org.apache.commons.math.stat.descriptive.moment.Variance(false);
        double[] doubleArray8 = new double[] { (byte) -1, (short) 100, 'a', 0, 1, (-1.0d) };
        double double9 = variance1.evaluate(doubleArray8);
        variance1.setBiasCorrected(true);
        org.apache.commons.math.stat.descriptive.moment.Variance variance13 = new org.apache.commons.math.stat.descriptive.moment.Variance(false);
        double[] doubleArray20 = new double[] { (byte) -1, (short) 100, 'a', 0, 1, (-1.0d) };
        double double21 = variance13.evaluate(doubleArray20);
        variance1.incrementAll(doubleArray20);
        variance1.clear();
        org.apache.commons.math.stat.descriptive.moment.Variance variance25 = new org.apache.commons.math.stat.descriptive.moment.Variance(false);
        double[] doubleArray32 = new double[] { (byte) -1, (short) 100, 'a', 0, 1, (-1.0d) };
        double double33 = variance25.evaluate(doubleArray32);
        double[] doubleArray37 = new double[] { (byte) 1, (byte) 100, 1L };
        double double38 = variance25.evaluate(doubleArray37);
        variance1.incrementAll(doubleArray37, (int) (byte) 0, (int) (byte) 1);
        variance1.increment(16.566666666666666d);
        variance1.setBiasCorrected(true);
        double[] doubleArray46 = null;
        // The following exception was thrown during execution in test generation
        try {
            double double50 = variance1.evaluate(doubleArray46, 13.805555555969477d, (int) '4', 1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: input value array is null");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(doubleArray8);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray8), "[-1.0, 100.0, 97.0, 0.0, 1.0, -1.0]");
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 2168.222222222222d + "'", double9 == 2168.222222222222d);
        org.junit.Assert.assertNotNull(doubleArray20);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray20), "[-1.0, 100.0, 97.0, 0.0, 1.0, -1.0]");
        org.junit.Assert.assertTrue("'" + double21 + "' != '" + 2168.222222222222d + "'", double21 == 2168.222222222222d);
        org.junit.Assert.assertNotNull(doubleArray32);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray32), "[-1.0, 100.0, 97.0, 0.0, 1.0, -1.0]");
        org.junit.Assert.assertTrue("'" + double33 + "' != '" + 2168.222222222222d + "'", double33 == 2168.222222222222d);
        org.junit.Assert.assertNotNull(doubleArray37);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray37), "[1.0, 100.0, 1.0]");
        org.junit.Assert.assertTrue("'" + double38 + "' != '" + 2178.0d + "'", double38 == 2178.0d);
    }

    @Test
    public void test1602() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1602");
        org.apache.commons.math.stat.descriptive.moment.Variance variance1 = new org.apache.commons.math.stat.descriptive.moment.Variance(false);
        double[] doubleArray8 = new double[] { (byte) -1, (short) 100, 'a', 0, 1, (-1.0d) };
        double double9 = variance1.evaluate(doubleArray8);
        variance1.setBiasCorrected(true);
        boolean boolean12 = variance1.isBiasCorrected();
        double double13 = variance1.getResult();
        variance1.increment((double) 'a');
        variance1.increment((-1.0d));
        boolean boolean18 = variance1.isBiasCorrected();
        java.lang.Class<?> wildcardClass19 = variance1.getClass();
        org.junit.Assert.assertNotNull(doubleArray8);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray8), "[-1.0, 100.0, 97.0, 0.0, 1.0, -1.0]");
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 2168.222222222222d + "'", double9 == 2168.222222222222d);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertTrue(Double.isNaN(double13));
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
        org.junit.Assert.assertNotNull(wildcardClass19);
    }

    @Test
    public void test1603() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1603");
        org.apache.commons.math.stat.descriptive.moment.Variance variance0 = new org.apache.commons.math.stat.descriptive.moment.Variance();
        double double1 = variance0.getResult();
        org.apache.commons.math.stat.descriptive.moment.Variance variance3 = new org.apache.commons.math.stat.descriptive.moment.Variance(false);
        double[] doubleArray10 = new double[] { (byte) -1, (short) 100, 'a', 0, 1, (-1.0d) };
        double double11 = variance3.evaluate(doubleArray10);
        variance3.setBiasCorrected(true);
        org.apache.commons.math.stat.descriptive.moment.Variance variance15 = new org.apache.commons.math.stat.descriptive.moment.Variance(false);
        double[] doubleArray22 = new double[] { (byte) -1, (short) 100, 'a', 0, 1, (-1.0d) };
        double double23 = variance15.evaluate(doubleArray22);
        variance3.incrementAll(doubleArray22);
        boolean boolean25 = variance0.equals((java.lang.Object) variance3);
        org.apache.commons.math.stat.descriptive.moment.Variance variance27 = new org.apache.commons.math.stat.descriptive.moment.Variance(false);
        double[] doubleArray34 = new double[] { (byte) -1, (short) 100, 'a', 0, 1, (-1.0d) };
        double double35 = variance27.evaluate(doubleArray34);
        variance27.clear();
        boolean boolean37 = variance3.equals((java.lang.Object) variance27);
        variance3.increment(13.805555555555552d);
        variance3.increment(10.0d);
        long long42 = variance3.getN();
        org.junit.Assert.assertTrue(Double.isNaN(double1));
        org.junit.Assert.assertNotNull(doubleArray10);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray10), "[-1.0, 100.0, 97.0, 0.0, 1.0, -1.0]");
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 2168.222222222222d + "'", double11 == 2168.222222222222d);
        org.junit.Assert.assertNotNull(doubleArray22);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray22), "[-1.0, 100.0, 97.0, 0.0, 1.0, -1.0]");
        org.junit.Assert.assertTrue("'" + double23 + "' != '" + 2168.222222222222d + "'", double23 == 2168.222222222222d);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
        org.junit.Assert.assertNotNull(doubleArray34);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray34), "[-1.0, 100.0, 97.0, 0.0, 1.0, -1.0]");
        org.junit.Assert.assertTrue("'" + double35 + "' != '" + 2168.222222222222d + "'", double35 == 2168.222222222222d);
        org.junit.Assert.assertTrue("'" + boolean37 + "' != '" + false + "'", boolean37 == false);
        org.junit.Assert.assertTrue("'" + long42 + "' != '" + 8L + "'", long42 == 8L);
    }

    @Test
    public void test1604() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1604");
        org.apache.commons.math.stat.descriptive.moment.Variance variance1 = new org.apache.commons.math.stat.descriptive.moment.Variance(false);
        double[] doubleArray8 = new double[] { (byte) -1, (short) 100, 'a', 0, 1, (-1.0d) };
        double double9 = variance1.evaluate(doubleArray8);
        variance1.setBiasCorrected(true);
        org.apache.commons.math.stat.descriptive.moment.Variance variance13 = new org.apache.commons.math.stat.descriptive.moment.Variance(false);
        double[] doubleArray20 = new double[] { (byte) -1, (short) 100, 'a', 0, 1, (-1.0d) };
        double double21 = variance13.evaluate(doubleArray20);
        variance13.setBiasCorrected(true);
        boolean boolean24 = variance13.isBiasCorrected();
        double[] doubleArray31 = new double[] { (short) 0, 1.0d, 1L, 0.0d, (-1.0d), 10L };
        double double32 = variance13.evaluate(doubleArray31);
        double double35 = variance1.evaluate(doubleArray31, (int) (byte) 1, (int) (byte) 0);
        org.apache.commons.math.stat.descriptive.moment.Variance variance37 = new org.apache.commons.math.stat.descriptive.moment.Variance(false);
        org.apache.commons.math.stat.descriptive.moment.Variance variance39 = new org.apache.commons.math.stat.descriptive.moment.Variance(false);
        double[] doubleArray46 = new double[] { (byte) -1, (short) 100, 'a', 0, 1, (-1.0d) };
        double double47 = variance39.evaluate(doubleArray46);
        variance39.setBiasCorrected(true);
        org.apache.commons.math.stat.descriptive.moment.Variance variance51 = new org.apache.commons.math.stat.descriptive.moment.Variance(false);
        double[] doubleArray58 = new double[] { (byte) -1, (short) 100, 'a', 0, 1, (-1.0d) };
        double double59 = variance51.evaluate(doubleArray58);
        variance51.setBiasCorrected(true);
        org.apache.commons.math.stat.descriptive.moment.Variance variance63 = new org.apache.commons.math.stat.descriptive.moment.Variance(false);
        double[] doubleArray70 = new double[] { (byte) -1, (short) 100, 'a', 0, 1, (-1.0d) };
        double double71 = variance63.evaluate(doubleArray70);
        variance63.setBiasCorrected(true);
        boolean boolean74 = variance63.isBiasCorrected();
        double[] doubleArray81 = new double[] { (short) 0, 1.0d, 1L, 0.0d, (-1.0d), 10L };
        double double82 = variance63.evaluate(doubleArray81);
        double double85 = variance51.evaluate(doubleArray81, (int) (byte) 1, (int) (byte) 0);
        variance39.incrementAll(doubleArray81, (int) (byte) 1, 1);
        double double89 = variance37.evaluate(doubleArray81);
        double double90 = variance1.evaluate(doubleArray81);
        boolean boolean91 = variance1.isBiasCorrected();
        java.lang.Class<?> wildcardClass92 = variance1.getClass();
        org.junit.Assert.assertNotNull(doubleArray8);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray8), "[-1.0, 100.0, 97.0, 0.0, 1.0, -1.0]");
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 2168.222222222222d + "'", double9 == 2168.222222222222d);
        org.junit.Assert.assertNotNull(doubleArray20);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray20), "[-1.0, 100.0, 97.0, 0.0, 1.0, -1.0]");
        org.junit.Assert.assertTrue("'" + double21 + "' != '" + 2168.222222222222d + "'", double21 == 2168.222222222222d);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + true + "'", boolean24 == true);
        org.junit.Assert.assertNotNull(doubleArray31);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray31), "[0.0, 1.0, 1.0, 0.0, -1.0, 10.0]");
        org.junit.Assert.assertTrue("'" + double32 + "' != '" + 16.566666666666663d + "'", double32 == 16.566666666666663d);
        org.junit.Assert.assertTrue(Double.isNaN(double35));
        org.junit.Assert.assertNotNull(doubleArray46);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray46), "[-1.0, 100.0, 97.0, 0.0, 1.0, -1.0]");
        org.junit.Assert.assertTrue("'" + double47 + "' != '" + 2168.222222222222d + "'", double47 == 2168.222222222222d);
        org.junit.Assert.assertNotNull(doubleArray58);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray58), "[-1.0, 100.0, 97.0, 0.0, 1.0, -1.0]");
        org.junit.Assert.assertTrue("'" + double59 + "' != '" + 2168.222222222222d + "'", double59 == 2168.222222222222d);
        org.junit.Assert.assertNotNull(doubleArray70);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray70), "[-1.0, 100.0, 97.0, 0.0, 1.0, -1.0]");
        org.junit.Assert.assertTrue("'" + double71 + "' != '" + 2168.222222222222d + "'", double71 == 2168.222222222222d);
        org.junit.Assert.assertTrue("'" + boolean74 + "' != '" + true + "'", boolean74 == true);
        org.junit.Assert.assertNotNull(doubleArray81);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray81), "[0.0, 1.0, 1.0, 0.0, -1.0, 10.0]");
        org.junit.Assert.assertTrue("'" + double82 + "' != '" + 16.566666666666663d + "'", double82 == 16.566666666666663d);
        org.junit.Assert.assertTrue(Double.isNaN(double85));
        org.junit.Assert.assertTrue("'" + double89 + "' != '" + 13.805555555555552d + "'", double89 == 13.805555555555552d);
        org.junit.Assert.assertTrue("'" + double90 + "' != '" + 16.566666666666663d + "'", double90 == 16.566666666666663d);
        org.junit.Assert.assertTrue("'" + boolean91 + "' != '" + true + "'", boolean91 == true);
        org.junit.Assert.assertNotNull(wildcardClass92);
    }

    @Test
    public void test1605() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1605");
        org.apache.commons.math.stat.descriptive.moment.Variance variance1 = new org.apache.commons.math.stat.descriptive.moment.Variance(false);
        double[] doubleArray8 = new double[] { (byte) -1, (short) 100, 'a', 0, 1, (-1.0d) };
        double double9 = variance1.evaluate(doubleArray8);
        variance1.setBiasCorrected(true);
        long long12 = variance1.getN();
        long long13 = variance1.getN();
        boolean boolean15 = variance1.equals((java.lang.Object) 16.566666666666663d);
        boolean boolean17 = variance1.equals((java.lang.Object) (short) 10);
        org.apache.commons.math.stat.descriptive.moment.Variance variance19 = new org.apache.commons.math.stat.descriptive.moment.Variance(false);
        double[] doubleArray26 = new double[] { (byte) -1, (short) 100, 'a', 0, 1, (-1.0d) };
        double double27 = variance19.evaluate(doubleArray26);
        variance19.setBiasCorrected(true);
        org.apache.commons.math.stat.descriptive.moment.Variance variance31 = new org.apache.commons.math.stat.descriptive.moment.Variance(false);
        double[] doubleArray38 = new double[] { (byte) -1, (short) 100, 'a', 0, 1, (-1.0d) };
        double double39 = variance31.evaluate(doubleArray38);
        variance31.setBiasCorrected(true);
        boolean boolean42 = variance31.isBiasCorrected();
        double[] doubleArray49 = new double[] { (short) 0, 1.0d, 1L, 0.0d, (-1.0d), 10L };
        double double50 = variance31.evaluate(doubleArray49);
        org.apache.commons.math.stat.descriptive.moment.Variance variance52 = new org.apache.commons.math.stat.descriptive.moment.Variance(false);
        double[] doubleArray59 = new double[] { (byte) -1, (short) 100, 'a', 0, 1, (-1.0d) };
        double double60 = variance52.evaluate(doubleArray59);
        variance52.setBiasCorrected(true);
        boolean boolean63 = variance52.isBiasCorrected();
        double[] doubleArray70 = new double[] { (short) 0, 1.0d, 1L, 0.0d, (-1.0d), 10L };
        double double71 = variance52.evaluate(doubleArray70);
        double double74 = variance31.evaluate(doubleArray70, (int) (byte) 1, 0);
        double double76 = variance19.evaluate(doubleArray70, 2178.0d);
        double double77 = variance1.evaluate(doubleArray70);
        variance1.increment((double) 1);
        boolean boolean80 = variance1.isBiasCorrected();
        variance1.clear();
        variance1.setBiasCorrected(true);
        org.junit.Assert.assertNotNull(doubleArray8);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray8), "[-1.0, 100.0, 97.0, 0.0, 1.0, -1.0]");
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 2168.222222222222d + "'", double9 == 2168.222222222222d);
        org.junit.Assert.assertTrue("'" + long12 + "' != '" + 0L + "'", long12 == 0L);
        org.junit.Assert.assertTrue("'" + long13 + "' != '" + 0L + "'", long13 == 0L);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertNotNull(doubleArray26);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray26), "[-1.0, 100.0, 97.0, 0.0, 1.0, -1.0]");
        org.junit.Assert.assertTrue("'" + double27 + "' != '" + 2168.222222222222d + "'", double27 == 2168.222222222222d);
        org.junit.Assert.assertNotNull(doubleArray38);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray38), "[-1.0, 100.0, 97.0, 0.0, 1.0, -1.0]");
        org.junit.Assert.assertTrue("'" + double39 + "' != '" + 2168.222222222222d + "'", double39 == 2168.222222222222d);
        org.junit.Assert.assertTrue("'" + boolean42 + "' != '" + true + "'", boolean42 == true);
        org.junit.Assert.assertNotNull(doubleArray49);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray49), "[0.0, 1.0, 1.0, 0.0, -1.0, 10.0]");
        org.junit.Assert.assertTrue("'" + double50 + "' != '" + 16.566666666666663d + "'", double50 == 16.566666666666663d);
        org.junit.Assert.assertNotNull(doubleArray59);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray59), "[-1.0, 100.0, 97.0, 0.0, 1.0, -1.0]");
        org.junit.Assert.assertTrue("'" + double60 + "' != '" + 2168.222222222222d + "'", double60 == 2168.222222222222d);
        org.junit.Assert.assertTrue("'" + boolean63 + "' != '" + true + "'", boolean63 == true);
        org.junit.Assert.assertNotNull(doubleArray70);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray70), "[0.0, 1.0, 1.0, 0.0, -1.0, 10.0]");
        org.junit.Assert.assertTrue("'" + double71 + "' != '" + 16.566666666666663d + "'", double71 == 16.566666666666663d);
        org.junit.Assert.assertTrue(Double.isNaN(double74));
        org.junit.Assert.assertTrue("'" + double76 + "' != '" + 16.566666666418314d + "'", double76 == 16.566666666418314d);
        org.junit.Assert.assertTrue("'" + double77 + "' != '" + 16.566666666666663d + "'", double77 == 16.566666666666663d);
        org.junit.Assert.assertTrue("'" + boolean80 + "' != '" + true + "'", boolean80 == true);
    }

    @Test
    public void test1606() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1606");
        org.apache.commons.math.stat.descriptive.moment.Variance variance1 = new org.apache.commons.math.stat.descriptive.moment.Variance(false);
        double[] doubleArray8 = new double[] { (byte) -1, (short) 100, 'a', 0, 1, (-1.0d) };
        double double9 = variance1.evaluate(doubleArray8);
        variance1.setBiasCorrected(true);
        variance1.increment((double) (byte) 0);
        double[] doubleArray16 = new double[] { 'a', 100L };
        double double18 = variance1.evaluate(doubleArray16, 0.0d);
        double double19 = variance1.getResult();
        variance1.setBiasCorrected(false);
        boolean boolean23 = variance1.equals((java.lang.Object) 459247.35802469135d);
        org.junit.Assert.assertNotNull(doubleArray8);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray8), "[-1.0, 100.0, 97.0, 0.0, 1.0, -1.0]");
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 2168.222222222222d + "'", double9 == 2168.222222222222d);
        org.junit.Assert.assertNotNull(doubleArray16);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray16), "[97.0, 100.0]");
        org.junit.Assert.assertTrue("'" + double18 + "' != '" + 4.5d + "'", double18 == 4.5d);
        org.junit.Assert.assertTrue("'" + double19 + "' != '" + 0.0d + "'", double19 == 0.0d);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
    }

    @Test
    public void test1607() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1607");
        org.apache.commons.math.stat.descriptive.moment.Variance variance1 = new org.apache.commons.math.stat.descriptive.moment.Variance(false);
        double[] doubleArray8 = new double[] { (byte) -1, (short) 100, 'a', 0, 1, (-1.0d) };
        double double9 = variance1.evaluate(doubleArray8);
        variance1.setBiasCorrected(true);
        long long12 = variance1.getN();
        long long13 = variance1.getN();
        boolean boolean14 = variance1.isBiasCorrected();
        org.apache.commons.math.stat.descriptive.moment.Variance variance16 = new org.apache.commons.math.stat.descriptive.moment.Variance(false);
        double[] doubleArray23 = new double[] { (byte) -1, (short) 100, 'a', 0, 1, (-1.0d) };
        double double24 = variance16.evaluate(doubleArray23);
        variance16.setBiasCorrected(true);
        boolean boolean27 = variance16.isBiasCorrected();
        double[] doubleArray34 = new double[] { (short) 0, 1.0d, 1L, 0.0d, (-1.0d), 10L };
        double double35 = variance16.evaluate(doubleArray34);
        boolean boolean37 = variance16.equals((java.lang.Object) 10.0d);
        org.apache.commons.math.stat.descriptive.moment.Variance variance39 = new org.apache.commons.math.stat.descriptive.moment.Variance(false);
        double[] doubleArray46 = new double[] { (byte) -1, (short) 100, 'a', 0, 1, (-1.0d) };
        double double47 = variance39.evaluate(doubleArray46);
        variance39.setBiasCorrected(true);
        boolean boolean50 = variance39.isBiasCorrected();
        double[] doubleArray57 = new double[] { (short) 0, 1.0d, 1L, 0.0d, (-1.0d), 10L };
        double double58 = variance39.evaluate(doubleArray57);
        double double60 = variance16.evaluate(doubleArray57, (double) 0.0f);
        variance1.incrementAll(doubleArray57);
        variance1.setBiasCorrected(true);
        org.junit.Assert.assertNotNull(doubleArray8);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray8), "[-1.0, 100.0, 97.0, 0.0, 1.0, -1.0]");
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 2168.222222222222d + "'", double9 == 2168.222222222222d);
        org.junit.Assert.assertTrue("'" + long12 + "' != '" + 0L + "'", long12 == 0L);
        org.junit.Assert.assertTrue("'" + long13 + "' != '" + 0L + "'", long13 == 0L);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertNotNull(doubleArray23);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray23), "[-1.0, 100.0, 97.0, 0.0, 1.0, -1.0]");
        org.junit.Assert.assertTrue("'" + double24 + "' != '" + 2168.222222222222d + "'", double24 == 2168.222222222222d);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + true + "'", boolean27 == true);
        org.junit.Assert.assertNotNull(doubleArray34);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray34), "[0.0, 1.0, 1.0, 0.0, -1.0, 10.0]");
        org.junit.Assert.assertTrue("'" + double35 + "' != '" + 16.566666666666663d + "'", double35 == 16.566666666666663d);
        org.junit.Assert.assertTrue("'" + boolean37 + "' != '" + false + "'", boolean37 == false);
        org.junit.Assert.assertNotNull(doubleArray46);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray46), "[-1.0, 100.0, 97.0, 0.0, 1.0, -1.0]");
        org.junit.Assert.assertTrue("'" + double47 + "' != '" + 2168.222222222222d + "'", double47 == 2168.222222222222d);
        org.junit.Assert.assertTrue("'" + boolean50 + "' != '" + true + "'", boolean50 == true);
        org.junit.Assert.assertNotNull(doubleArray57);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray57), "[0.0, 1.0, 1.0, 0.0, -1.0, 10.0]");
        org.junit.Assert.assertTrue("'" + double58 + "' != '" + 16.566666666666663d + "'", double58 == 16.566666666666663d);
        org.junit.Assert.assertTrue("'" + double60 + "' != '" + 16.566666666666666d + "'", double60 == 16.566666666666666d);
    }

    @Test
    public void test1608() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1608");
        org.apache.commons.math.stat.descriptive.moment.Variance variance0 = new org.apache.commons.math.stat.descriptive.moment.Variance();
        variance0.increment(1694.7000000000003d);
        double double3 = variance0.getResult();
        variance0.increment((double) 'a');
        variance0.clear();
        org.apache.commons.math.stat.descriptive.moment.Variance variance8 = new org.apache.commons.math.stat.descriptive.moment.Variance(false);
        double[] doubleArray15 = new double[] { (byte) -1, (short) 100, 'a', 0, 1, (-1.0d) };
        double double16 = variance8.evaluate(doubleArray15);
        variance8.setBiasCorrected(true);
        boolean boolean19 = variance8.isBiasCorrected();
        double[] doubleArray26 = new double[] { (short) 0, 1.0d, 1L, 0.0d, (-1.0d), 10L };
        double double27 = variance8.evaluate(doubleArray26);
        boolean boolean29 = variance8.equals((java.lang.Object) 10.0d);
        org.apache.commons.math.stat.descriptive.moment.Variance variance31 = new org.apache.commons.math.stat.descriptive.moment.Variance(false);
        double[] doubleArray38 = new double[] { (byte) -1, (short) 100, 'a', 0, 1, (-1.0d) };
        double double39 = variance31.evaluate(doubleArray38);
        variance31.setBiasCorrected(true);
        boolean boolean42 = variance31.isBiasCorrected();
        double[] doubleArray49 = new double[] { (short) 0, 1.0d, 1L, 0.0d, (-1.0d), 10L };
        double double50 = variance31.evaluate(doubleArray49);
        double double52 = variance8.evaluate(doubleArray49, (double) 0.0f);
        // The following exception was thrown during execution in test generation
        try {
            variance0.incrementAll(doubleArray49, (int) (byte) 10, (int) (short) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: length cannot be negative");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 0.0d + "'", double3 == 0.0d);
        org.junit.Assert.assertNotNull(doubleArray15);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray15), "[-1.0, 100.0, 97.0, 0.0, 1.0, -1.0]");
        org.junit.Assert.assertTrue("'" + double16 + "' != '" + 2168.222222222222d + "'", double16 == 2168.222222222222d);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + true + "'", boolean19 == true);
        org.junit.Assert.assertNotNull(doubleArray26);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray26), "[0.0, 1.0, 1.0, 0.0, -1.0, 10.0]");
        org.junit.Assert.assertTrue("'" + double27 + "' != '" + 16.566666666666663d + "'", double27 == 16.566666666666663d);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + false + "'", boolean29 == false);
        org.junit.Assert.assertNotNull(doubleArray38);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray38), "[-1.0, 100.0, 97.0, 0.0, 1.0, -1.0]");
        org.junit.Assert.assertTrue("'" + double39 + "' != '" + 2168.222222222222d + "'", double39 == 2168.222222222222d);
        org.junit.Assert.assertTrue("'" + boolean42 + "' != '" + true + "'", boolean42 == true);
        org.junit.Assert.assertNotNull(doubleArray49);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray49), "[0.0, 1.0, 1.0, 0.0, -1.0, 10.0]");
        org.junit.Assert.assertTrue("'" + double50 + "' != '" + 16.566666666666663d + "'", double50 == 16.566666666666663d);
        org.junit.Assert.assertTrue("'" + double52 + "' != '" + 16.566666666666666d + "'", double52 == 16.566666666666666d);
    }

    @Test
    public void test1609() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1609");
        org.apache.commons.math.stat.descriptive.moment.SecondMoment secondMoment1 = null;
        org.apache.commons.math.stat.descriptive.moment.Variance variance2 = new org.apache.commons.math.stat.descriptive.moment.Variance(true, secondMoment1);
        variance2.clear();
        double[] doubleArray4 = new double[] {};
        variance2.incrementAll(doubleArray4);
        variance2.increment((double) (byte) 10);
        variance2.setBiasCorrected(false);
        variance2.increment(13.805555555555555d);
        variance2.increment(2601.86640625d);
        org.junit.Assert.assertNotNull(doubleArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray4), "[]");
    }

    @Test
    public void test1610() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1610");
        org.apache.commons.math.stat.descriptive.moment.Variance variance0 = new org.apache.commons.math.stat.descriptive.moment.Variance();
        long long1 = variance0.getN();
        org.apache.commons.math.stat.descriptive.moment.Variance variance3 = new org.apache.commons.math.stat.descriptive.moment.Variance(false);
        double[] doubleArray10 = new double[] { (byte) -1, (short) 100, 'a', 0, 1, (-1.0d) };
        double double11 = variance3.evaluate(doubleArray10);
        variance3.setBiasCorrected(true);
        long long14 = variance3.getN();
        boolean boolean15 = variance0.equals((java.lang.Object) long14);
        variance0.increment((double) (byte) 1);
        org.apache.commons.math.stat.descriptive.moment.Variance variance19 = new org.apache.commons.math.stat.descriptive.moment.Variance(false);
        double[] doubleArray26 = new double[] { (byte) -1, (short) 100, 'a', 0, 1, (-1.0d) };
        double double27 = variance19.evaluate(doubleArray26);
        variance19.setBiasCorrected(true);
        boolean boolean30 = variance19.isBiasCorrected();
        double[] doubleArray37 = new double[] { (short) 0, 1.0d, 1L, 0.0d, (-1.0d), 10L };
        double double38 = variance19.evaluate(doubleArray37);
        org.apache.commons.math.stat.descriptive.moment.Variance variance40 = new org.apache.commons.math.stat.descriptive.moment.Variance(false);
        double[] doubleArray47 = new double[] { (byte) -1, (short) 100, 'a', 0, 1, (-1.0d) };
        double double48 = variance40.evaluate(doubleArray47);
        variance40.setBiasCorrected(true);
        boolean boolean51 = variance40.isBiasCorrected();
        double[] doubleArray58 = new double[] { (short) 0, 1.0d, 1L, 0.0d, (-1.0d), 10L };
        double double59 = variance40.evaluate(doubleArray58);
        double double62 = variance19.evaluate(doubleArray58, (int) (byte) 1, 0);
        double double63 = variance19.getResult();
        org.apache.commons.math.stat.descriptive.moment.Variance variance65 = new org.apache.commons.math.stat.descriptive.moment.Variance(true);
        double double66 = variance65.getResult();
        double double67 = variance65.getResult();
        org.apache.commons.math.stat.descriptive.moment.Variance variance69 = new org.apache.commons.math.stat.descriptive.moment.Variance(false);
        double[] doubleArray76 = new double[] { (byte) -1, (short) 100, 'a', 0, 1, (-1.0d) };
        double double77 = variance69.evaluate(doubleArray76);
        variance69.clear();
        variance69.setBiasCorrected(true);
        org.apache.commons.math.stat.descriptive.moment.Variance variance82 = new org.apache.commons.math.stat.descriptive.moment.Variance(false);
        variance82.clear();
        double double84 = variance82.getResult();
        double[] doubleArray89 = new double[] { (-1), 2168.222222222222d, 16.566666666418314d, 10.0d };
        variance82.incrementAll(doubleArray89);
        boolean boolean91 = variance69.equals((java.lang.Object) doubleArray89);
        double double93 = variance65.evaluate(doubleArray89, (double) (-1.0f));
        double double95 = variance19.evaluate(doubleArray89, 2601.866666666667d);
        double double96 = variance0.evaluate(doubleArray89);
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 0L + "'", long1 == 0L);
        org.junit.Assert.assertNotNull(doubleArray10);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray10), "[-1.0, 100.0, 97.0, 0.0, 1.0, -1.0]");
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 2168.222222222222d + "'", double11 == 2168.222222222222d);
        org.junit.Assert.assertTrue("'" + long14 + "' != '" + 0L + "'", long14 == 0L);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertNotNull(doubleArray26);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray26), "[-1.0, 100.0, 97.0, 0.0, 1.0, -1.0]");
        org.junit.Assert.assertTrue("'" + double27 + "' != '" + 2168.222222222222d + "'", double27 == 2168.222222222222d);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + true + "'", boolean30 == true);
        org.junit.Assert.assertNotNull(doubleArray37);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray37), "[0.0, 1.0, 1.0, 0.0, -1.0, 10.0]");
        org.junit.Assert.assertTrue("'" + double38 + "' != '" + 16.566666666666663d + "'", double38 == 16.566666666666663d);
        org.junit.Assert.assertNotNull(doubleArray47);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray47), "[-1.0, 100.0, 97.0, 0.0, 1.0, -1.0]");
        org.junit.Assert.assertTrue("'" + double48 + "' != '" + 2168.222222222222d + "'", double48 == 2168.222222222222d);
        org.junit.Assert.assertTrue("'" + boolean51 + "' != '" + true + "'", boolean51 == true);
        org.junit.Assert.assertNotNull(doubleArray58);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray58), "[0.0, 1.0, 1.0, 0.0, -1.0, 10.0]");
        org.junit.Assert.assertTrue("'" + double59 + "' != '" + 16.566666666666663d + "'", double59 == 16.566666666666663d);
        org.junit.Assert.assertTrue(Double.isNaN(double62));
        org.junit.Assert.assertTrue(Double.isNaN(double63));
        org.junit.Assert.assertTrue(Double.isNaN(double66));
        org.junit.Assert.assertTrue(Double.isNaN(double67));
        org.junit.Assert.assertNotNull(doubleArray76);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray76), "[-1.0, 100.0, 97.0, 0.0, 1.0, -1.0]");
        org.junit.Assert.assertTrue("'" + double77 + "' != '" + 2168.222222222222d + "'", double77 == 2168.222222222222d);
        org.junit.Assert.assertTrue(Double.isNaN(double84));
        org.junit.Assert.assertNotNull(doubleArray89);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray89), "[-1.0, 2168.222222222222, 16.566666666418314, 10.0]");
        org.junit.Assert.assertTrue("'" + boolean91 + "' != '" + false + "'", boolean91 == false);
        org.junit.Assert.assertTrue("'" + double93 + "' != '" + 1166128.5457099646d + "'", double93 == 1166128.5457099646d);
        org.junit.Assert.assertTrue("'" + double95 + "' != '" + 1166128.545709965d + "'", double95 == 1166128.545709965d);
        org.junit.Assert.assertTrue("'" + double96 + "' != '" + 1166128.5457099646d + "'", double96 == 1166128.5457099646d);
    }

    @Test
    public void test1611() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1611");
        org.apache.commons.math.stat.descriptive.moment.Variance variance1 = new org.apache.commons.math.stat.descriptive.moment.Variance(false);
        double[] doubleArray8 = new double[] { (byte) -1, (short) 100, 'a', 0, 1, (-1.0d) };
        double double9 = variance1.evaluate(doubleArray8);
        long long10 = variance1.getN();
        variance1.increment(874596.4092824734d);
        org.apache.commons.math.stat.descriptive.moment.Variance variance14 = new org.apache.commons.math.stat.descriptive.moment.Variance(false);
        double[] doubleArray21 = new double[] { (byte) -1, (short) 100, 'a', 0, 1, (-1.0d) };
        double double22 = variance14.evaluate(doubleArray21);
        variance14.setBiasCorrected(true);
        boolean boolean25 = variance14.isBiasCorrected();
        double[] doubleArray32 = new double[] { (short) 0, 1.0d, 1L, 0.0d, (-1.0d), 10L };
        double double33 = variance14.evaluate(doubleArray32);
        double double34 = variance14.getResult();
        variance14.setBiasCorrected(true);
        boolean boolean37 = variance14.isBiasCorrected();
        boolean boolean38 = variance1.equals((java.lang.Object) boolean37);
        org.apache.commons.math.stat.descriptive.moment.Variance variance40 = new org.apache.commons.math.stat.descriptive.moment.Variance(false);
        double[] doubleArray47 = new double[] { (byte) -1, (short) 100, 'a', 0, 1, (-1.0d) };
        double double48 = variance40.evaluate(doubleArray47);
        long long49 = variance40.getN();
        variance40.increment(874596.4092824734d);
        variance40.setBiasCorrected(false);
        boolean boolean54 = variance40.isBiasCorrected();
        long long55 = variance40.getN();
        boolean boolean56 = variance1.equals((java.lang.Object) long55);
        org.junit.Assert.assertNotNull(doubleArray8);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray8), "[-1.0, 100.0, 97.0, 0.0, 1.0, -1.0]");
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 2168.222222222222d + "'", double9 == 2168.222222222222d);
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + 0L + "'", long10 == 0L);
        org.junit.Assert.assertNotNull(doubleArray21);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray21), "[-1.0, 100.0, 97.0, 0.0, 1.0, -1.0]");
        org.junit.Assert.assertTrue("'" + double22 + "' != '" + 2168.222222222222d + "'", double22 == 2168.222222222222d);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + true + "'", boolean25 == true);
        org.junit.Assert.assertNotNull(doubleArray32);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray32), "[0.0, 1.0, 1.0, 0.0, -1.0, 10.0]");
        org.junit.Assert.assertTrue("'" + double33 + "' != '" + 16.566666666666663d + "'", double33 == 16.566666666666663d);
        org.junit.Assert.assertTrue(Double.isNaN(double34));
        org.junit.Assert.assertTrue("'" + boolean37 + "' != '" + true + "'", boolean37 == true);
        org.junit.Assert.assertTrue("'" + boolean38 + "' != '" + false + "'", boolean38 == false);
        org.junit.Assert.assertNotNull(doubleArray47);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray47), "[-1.0, 100.0, 97.0, 0.0, 1.0, -1.0]");
        org.junit.Assert.assertTrue("'" + double48 + "' != '" + 2168.222222222222d + "'", double48 == 2168.222222222222d);
        org.junit.Assert.assertTrue("'" + long49 + "' != '" + 0L + "'", long49 == 0L);
        org.junit.Assert.assertTrue("'" + boolean54 + "' != '" + false + "'", boolean54 == false);
        org.junit.Assert.assertTrue("'" + long55 + "' != '" + 1L + "'", long55 == 1L);
        org.junit.Assert.assertTrue("'" + boolean56 + "' != '" + false + "'", boolean56 == false);
    }

    @Test
    public void test1612() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1612");
        org.apache.commons.math.stat.descriptive.moment.Variance variance1 = new org.apache.commons.math.stat.descriptive.moment.Variance(false);
        double[] doubleArray8 = new double[] { (byte) -1, (short) 100, 'a', 0, 1, (-1.0d) };
        double double9 = variance1.evaluate(doubleArray8);
        variance1.setBiasCorrected(true);
        boolean boolean12 = variance1.isBiasCorrected();
        double[] doubleArray19 = new double[] { (short) 0, 1.0d, 1L, 0.0d, (-1.0d), 10L };
        double double20 = variance1.evaluate(doubleArray19);
        org.apache.commons.math.stat.descriptive.moment.Variance variance22 = new org.apache.commons.math.stat.descriptive.moment.Variance(false);
        double[] doubleArray29 = new double[] { (byte) -1, (short) 100, 'a', 0, 1, (-1.0d) };
        double double30 = variance22.evaluate(doubleArray29);
        variance22.setBiasCorrected(true);
        boolean boolean33 = variance1.equals((java.lang.Object) true);
        org.junit.Assert.assertNotNull(doubleArray8);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray8), "[-1.0, 100.0, 97.0, 0.0, 1.0, -1.0]");
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 2168.222222222222d + "'", double9 == 2168.222222222222d);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertNotNull(doubleArray19);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray19), "[0.0, 1.0, 1.0, 0.0, -1.0, 10.0]");
        org.junit.Assert.assertTrue("'" + double20 + "' != '" + 16.566666666666663d + "'", double20 == 16.566666666666663d);
        org.junit.Assert.assertNotNull(doubleArray29);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray29), "[-1.0, 100.0, 97.0, 0.0, 1.0, -1.0]");
        org.junit.Assert.assertTrue("'" + double30 + "' != '" + 2168.222222222222d + "'", double30 == 2168.222222222222d);
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + false + "'", boolean33 == false);
    }

    @Test
    public void test1613() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1613");
        org.apache.commons.math.stat.descriptive.moment.Variance variance0 = new org.apache.commons.math.stat.descriptive.moment.Variance();
        long long1 = variance0.getN();
        org.apache.commons.math.stat.descriptive.moment.Variance variance3 = new org.apache.commons.math.stat.descriptive.moment.Variance(false);
        double[] doubleArray10 = new double[] { (byte) -1, (short) 100, 'a', 0, 1, (-1.0d) };
        double double11 = variance3.evaluate(doubleArray10);
        variance3.setBiasCorrected(true);
        long long14 = variance3.getN();
        boolean boolean15 = variance0.equals((java.lang.Object) long14);
        boolean boolean16 = variance0.isBiasCorrected();
        org.apache.commons.math.stat.descriptive.moment.Variance variance18 = new org.apache.commons.math.stat.descriptive.moment.Variance(false);
        double[] doubleArray25 = new double[] { (byte) -1, (short) 100, 'a', 0, 1, (-1.0d) };
        double double26 = variance18.evaluate(doubleArray25);
        variance18.setBiasCorrected(true);
        boolean boolean29 = variance18.isBiasCorrected();
        double[] doubleArray36 = new double[] { (short) 0, 1.0d, 1L, 0.0d, (-1.0d), 10L };
        double double37 = variance18.evaluate(doubleArray36);
        double double38 = variance18.getResult();
        long long39 = variance18.getN();
        org.apache.commons.math.stat.descriptive.moment.Variance variance41 = new org.apache.commons.math.stat.descriptive.moment.Variance(false);
        double[] doubleArray48 = new double[] { (byte) -1, (short) 100, 'a', 0, 1, (-1.0d) };
        double double49 = variance41.evaluate(doubleArray48);
        variance41.setBiasCorrected(true);
        long long52 = variance41.getN();
        variance41.clear();
        org.apache.commons.math.stat.descriptive.moment.Variance variance55 = new org.apache.commons.math.stat.descriptive.moment.Variance(false);
        double[] doubleArray62 = new double[] { (byte) -1, (short) 100, 'a', 0, 1, (-1.0d) };
        double double63 = variance55.evaluate(doubleArray62);
        double double64 = variance41.evaluate(doubleArray62);
        double double65 = variance18.evaluate(doubleArray62);
        double double66 = variance0.evaluate(doubleArray62);
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 0L + "'", long1 == 0L);
        org.junit.Assert.assertNotNull(doubleArray10);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray10), "[-1.0, 100.0, 97.0, 0.0, 1.0, -1.0]");
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 2168.222222222222d + "'", double11 == 2168.222222222222d);
        org.junit.Assert.assertTrue("'" + long14 + "' != '" + 0L + "'", long14 == 0L);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertNotNull(doubleArray25);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray25), "[-1.0, 100.0, 97.0, 0.0, 1.0, -1.0]");
        org.junit.Assert.assertTrue("'" + double26 + "' != '" + 2168.222222222222d + "'", double26 == 2168.222222222222d);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + true + "'", boolean29 == true);
        org.junit.Assert.assertNotNull(doubleArray36);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray36), "[0.0, 1.0, 1.0, 0.0, -1.0, 10.0]");
        org.junit.Assert.assertTrue("'" + double37 + "' != '" + 16.566666666666663d + "'", double37 == 16.566666666666663d);
        org.junit.Assert.assertTrue(Double.isNaN(double38));
        org.junit.Assert.assertTrue("'" + long39 + "' != '" + 0L + "'", long39 == 0L);
        org.junit.Assert.assertNotNull(doubleArray48);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray48), "[-1.0, 100.0, 97.0, 0.0, 1.0, -1.0]");
        org.junit.Assert.assertTrue("'" + double49 + "' != '" + 2168.222222222222d + "'", double49 == 2168.222222222222d);
        org.junit.Assert.assertTrue("'" + long52 + "' != '" + 0L + "'", long52 == 0L);
        org.junit.Assert.assertNotNull(doubleArray62);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray62), "[-1.0, 100.0, 97.0, 0.0, 1.0, -1.0]");
        org.junit.Assert.assertTrue("'" + double63 + "' != '" + 2168.222222222222d + "'", double63 == 2168.222222222222d);
        org.junit.Assert.assertTrue("'" + double64 + "' != '" + 2601.866666666667d + "'", double64 == 2601.866666666667d);
        org.junit.Assert.assertTrue("'" + double65 + "' != '" + 2601.866666666667d + "'", double65 == 2601.866666666667d);
        org.junit.Assert.assertTrue("'" + double66 + "' != '" + 2601.866666666667d + "'", double66 == 2601.866666666667d);
    }

    @Test
    public void test1614() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1614");
        org.apache.commons.math.stat.descriptive.moment.Variance variance0 = new org.apache.commons.math.stat.descriptive.moment.Variance();
        long long1 = variance0.getN();
        org.apache.commons.math.stat.descriptive.moment.Variance variance3 = new org.apache.commons.math.stat.descriptive.moment.Variance(false);
        double[] doubleArray10 = new double[] { (byte) -1, (short) 100, 'a', 0, 1, (-1.0d) };
        double double11 = variance3.evaluate(doubleArray10);
        variance3.setBiasCorrected(true);
        boolean boolean14 = variance3.isBiasCorrected();
        double[] doubleArray21 = new double[] { (short) 0, 1.0d, 1L, 0.0d, (-1.0d), 10L };
        double double22 = variance3.evaluate(doubleArray21);
        boolean boolean24 = variance3.equals((java.lang.Object) 10.0d);
        boolean boolean25 = variance3.isBiasCorrected();
        org.apache.commons.math.stat.descriptive.moment.Variance variance27 = new org.apache.commons.math.stat.descriptive.moment.Variance(false);
        boolean boolean28 = variance3.equals((java.lang.Object) false);
        org.apache.commons.math.stat.descriptive.moment.Variance variance30 = new org.apache.commons.math.stat.descriptive.moment.Variance(false);
        double[] doubleArray37 = new double[] { (byte) -1, (short) 100, 'a', 0, 1, (-1.0d) };
        double double38 = variance30.evaluate(doubleArray37);
        variance30.setBiasCorrected(true);
        org.apache.commons.math.stat.descriptive.moment.Variance variance42 = new org.apache.commons.math.stat.descriptive.moment.Variance(false);
        double[] doubleArray49 = new double[] { (byte) -1, (short) 100, 'a', 0, 1, (-1.0d) };
        double double50 = variance42.evaluate(doubleArray49);
        variance30.incrementAll(doubleArray49);
        double double53 = variance3.evaluate(doubleArray49, (double) 100.0f);
        variance0.incrementAll(doubleArray49, (int) (short) 1, (int) (byte) 0);
        variance0.increment(16.56666666666674d);
        double double59 = variance0.getResult();
        long long60 = variance0.getN();
        java.lang.Class<?> wildcardClass61 = variance0.getClass();
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 0L + "'", long1 == 0L);
        org.junit.Assert.assertNotNull(doubleArray10);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray10), "[-1.0, 100.0, 97.0, 0.0, 1.0, -1.0]");
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 2168.222222222222d + "'", double11 == 2168.222222222222d);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertNotNull(doubleArray21);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray21), "[0.0, 1.0, 1.0, 0.0, -1.0, 10.0]");
        org.junit.Assert.assertTrue("'" + double22 + "' != '" + 16.566666666666663d + "'", double22 == 16.566666666666663d);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + true + "'", boolean25 == true);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + false + "'", boolean28 == false);
        org.junit.Assert.assertNotNull(doubleArray37);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray37), "[-1.0, 100.0, 97.0, 0.0, 1.0, -1.0]");
        org.junit.Assert.assertTrue("'" + double38 + "' != '" + 2168.222222222222d + "'", double38 == 2168.222222222222d);
        org.junit.Assert.assertNotNull(doubleArray49);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray49), "[-1.0, 100.0, 97.0, 0.0, 1.0, -1.0]");
        org.junit.Assert.assertTrue("'" + double50 + "' != '" + 2168.222222222222d + "'", double50 == 2168.222222222222d);
        org.junit.Assert.assertTrue("'" + double53 + "' != '" + 2601.8666666666663d + "'", double53 == 2601.8666666666663d);
        org.junit.Assert.assertTrue("'" + double59 + "' != '" + 0.0d + "'", double59 == 0.0d);
        org.junit.Assert.assertTrue("'" + long60 + "' != '" + 1L + "'", long60 == 1L);
        org.junit.Assert.assertNotNull(wildcardClass61);
    }

    @Test
    public void test1615() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1615");
        org.apache.commons.math.stat.descriptive.moment.Variance variance1 = new org.apache.commons.math.stat.descriptive.moment.Variance(false);
        double[] doubleArray8 = new double[] { (byte) -1, (short) 100, 'a', 0, 1, (-1.0d) };
        double double9 = variance1.evaluate(doubleArray8);
        variance1.setBiasCorrected(true);
        long long12 = variance1.getN();
        long long13 = variance1.getN();
        boolean boolean14 = variance1.isBiasCorrected();
        org.apache.commons.math.stat.descriptive.moment.Variance variance16 = new org.apache.commons.math.stat.descriptive.moment.Variance(true);
        double double17 = variance16.getResult();
        double double18 = variance16.getResult();
        org.apache.commons.math.stat.descriptive.moment.Variance variance20 = new org.apache.commons.math.stat.descriptive.moment.Variance(false);
        double[] doubleArray27 = new double[] { (byte) -1, (short) 100, 'a', 0, 1, (-1.0d) };
        double double28 = variance20.evaluate(doubleArray27);
        variance20.setBiasCorrected(true);
        org.apache.commons.math.stat.descriptive.moment.Variance variance32 = new org.apache.commons.math.stat.descriptive.moment.Variance(false);
        double[] doubleArray39 = new double[] { (byte) -1, (short) 100, 'a', 0, 1, (-1.0d) };
        double double40 = variance32.evaluate(doubleArray39);
        variance20.incrementAll(doubleArray39);
        variance20.clear();
        variance20.setBiasCorrected(false);
        org.apache.commons.math.stat.descriptive.moment.Variance variance46 = new org.apache.commons.math.stat.descriptive.moment.Variance(false);
        double[] doubleArray53 = new double[] { (byte) -1, (short) 100, 'a', 0, 1, (-1.0d) };
        double double54 = variance46.evaluate(doubleArray53);
        variance46.setBiasCorrected(true);
        long long57 = variance46.getN();
        long long58 = variance46.getN();
        boolean boolean60 = variance46.equals((java.lang.Object) 16.566666666666663d);
        boolean boolean62 = variance46.equals((java.lang.Object) (short) 10);
        org.apache.commons.math.stat.descriptive.moment.Variance variance64 = new org.apache.commons.math.stat.descriptive.moment.Variance(false);
        double[] doubleArray71 = new double[] { (byte) -1, (short) 100, 'a', 0, 1, (-1.0d) };
        double double72 = variance64.evaluate(doubleArray71);
        variance64.setBiasCorrected(true);
        org.apache.commons.math.stat.descriptive.moment.Variance variance76 = new org.apache.commons.math.stat.descriptive.moment.Variance(false);
        double[] doubleArray83 = new double[] { (byte) -1, (short) 100, 'a', 0, 1, (-1.0d) };
        double double84 = variance76.evaluate(doubleArray83);
        variance64.incrementAll(doubleArray83);
        double double86 = variance46.evaluate(doubleArray83);
        double double88 = variance20.evaluate(doubleArray83, (double) (byte) 100);
        double double90 = variance16.evaluate(doubleArray83, (double) (-1));
        double double92 = variance1.evaluate(doubleArray83, 874596.4092824734d);
        long long93 = variance1.getN();
        variance1.setBiasCorrected(true);
        double double96 = variance1.getResult();
        org.junit.Assert.assertNotNull(doubleArray8);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray8), "[-1.0, 100.0, 97.0, 0.0, 1.0, -1.0]");
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 2168.222222222222d + "'", double9 == 2168.222222222222d);
        org.junit.Assert.assertTrue("'" + long12 + "' != '" + 0L + "'", long12 == 0L);
        org.junit.Assert.assertTrue("'" + long13 + "' != '" + 0L + "'", long13 == 0L);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertTrue(Double.isNaN(double17));
        org.junit.Assert.assertTrue(Double.isNaN(double18));
        org.junit.Assert.assertNotNull(doubleArray27);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray27), "[-1.0, 100.0, 97.0, 0.0, 1.0, -1.0]");
        org.junit.Assert.assertTrue("'" + double28 + "' != '" + 2168.222222222222d + "'", double28 == 2168.222222222222d);
        org.junit.Assert.assertNotNull(doubleArray39);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray39), "[-1.0, 100.0, 97.0, 0.0, 1.0, -1.0]");
        org.junit.Assert.assertTrue("'" + double40 + "' != '" + 2168.222222222222d + "'", double40 == 2168.222222222222d);
        org.junit.Assert.assertNotNull(doubleArray53);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray53), "[-1.0, 100.0, 97.0, 0.0, 1.0, -1.0]");
        org.junit.Assert.assertTrue("'" + double54 + "' != '" + 2168.222222222222d + "'", double54 == 2168.222222222222d);
        org.junit.Assert.assertTrue("'" + long57 + "' != '" + 0L + "'", long57 == 0L);
        org.junit.Assert.assertTrue("'" + long58 + "' != '" + 0L + "'", long58 == 0L);
        org.junit.Assert.assertTrue("'" + boolean60 + "' != '" + false + "'", boolean60 == false);
        org.junit.Assert.assertTrue("'" + boolean62 + "' != '" + false + "'", boolean62 == false);
        org.junit.Assert.assertNotNull(doubleArray71);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray71), "[-1.0, 100.0, 97.0, 0.0, 1.0, -1.0]");
        org.junit.Assert.assertTrue("'" + double72 + "' != '" + 2168.222222222222d + "'", double72 == 2168.222222222222d);
        org.junit.Assert.assertNotNull(doubleArray83);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray83), "[-1.0, 100.0, 97.0, 0.0, 1.0, -1.0]");
        org.junit.Assert.assertTrue("'" + double84 + "' != '" + 2168.222222222222d + "'", double84 == 2168.222222222222d);
        org.junit.Assert.assertTrue("'" + double86 + "' != '" + 2601.866666666667d + "'", double86 == 2601.866666666667d);
        org.junit.Assert.assertTrue("'" + double88 + "' != '" + 2168.222222222222d + "'", double88 == 2168.222222222222d);
        org.junit.Assert.assertTrue("'" + double90 + "' != '" + 2601.8666666666663d + "'", double90 == 2601.8666666666663d);
        org.junit.Assert.assertTrue("'" + double92 + "' != '" + 2601.86640625d + "'", double92 == 2601.86640625d);
        org.junit.Assert.assertTrue("'" + long93 + "' != '" + 0L + "'", long93 == 0L);
        org.junit.Assert.assertTrue(Double.isNaN(double96));
    }

    @Test
    public void test1616() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1616");
        org.apache.commons.math.stat.descriptive.moment.Variance variance1 = new org.apache.commons.math.stat.descriptive.moment.Variance(false);
        double[] doubleArray8 = new double[] { (byte) -1, (short) 100, 'a', 0, 1, (-1.0d) };
        double double9 = variance1.evaluate(doubleArray8);
        variance1.setBiasCorrected(true);
        variance1.increment((double) (byte) 0);
        double[] doubleArray16 = new double[] { 'a', 100L };
        double double18 = variance1.evaluate(doubleArray16, 0.0d);
        double double19 = variance1.getResult();
        double double20 = variance1.getResult();
        variance1.clear();
        variance1.increment((double) 100.0f);
        variance1.clear();
        double double25 = variance1.getResult();
        org.junit.Assert.assertNotNull(doubleArray8);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray8), "[-1.0, 100.0, 97.0, 0.0, 1.0, -1.0]");
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 2168.222222222222d + "'", double9 == 2168.222222222222d);
        org.junit.Assert.assertNotNull(doubleArray16);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray16), "[97.0, 100.0]");
        org.junit.Assert.assertTrue("'" + double18 + "' != '" + 4.5d + "'", double18 == 4.5d);
        org.junit.Assert.assertTrue("'" + double19 + "' != '" + 0.0d + "'", double19 == 0.0d);
        org.junit.Assert.assertTrue("'" + double20 + "' != '" + 0.0d + "'", double20 == 0.0d);
        org.junit.Assert.assertTrue(Double.isNaN(double25));
    }

    @Test
    public void test1617() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1617");
        org.apache.commons.math.stat.descriptive.moment.Variance variance1 = new org.apache.commons.math.stat.descriptive.moment.Variance(true);
        double double2 = variance1.getResult();
        double double3 = variance1.getResult();
        org.apache.commons.math.stat.descriptive.moment.Variance variance5 = new org.apache.commons.math.stat.descriptive.moment.Variance(false);
        double[] doubleArray12 = new double[] { (byte) -1, (short) 100, 'a', 0, 1, (-1.0d) };
        double double13 = variance5.evaluate(doubleArray12);
        variance5.clear();
        variance5.setBiasCorrected(true);
        org.apache.commons.math.stat.descriptive.moment.Variance variance18 = new org.apache.commons.math.stat.descriptive.moment.Variance(false);
        variance18.clear();
        double double20 = variance18.getResult();
        double[] doubleArray25 = new double[] { (-1), 2168.222222222222d, 16.566666666418314d, 10.0d };
        variance18.incrementAll(doubleArray25);
        boolean boolean27 = variance5.equals((java.lang.Object) doubleArray25);
        double double29 = variance1.evaluate(doubleArray25, (double) (-1.0f));
        org.apache.commons.math.stat.descriptive.moment.Variance variance31 = new org.apache.commons.math.stat.descriptive.moment.Variance(false);
        double[] doubleArray38 = new double[] { (byte) -1, (short) 100, 'a', 0, 1, (-1.0d) };
        double double39 = variance31.evaluate(doubleArray38);
        variance31.setBiasCorrected(true);
        boolean boolean42 = variance31.isBiasCorrected();
        double[] doubleArray49 = new double[] { (short) 0, 1.0d, 1L, 0.0d, (-1.0d), 10L };
        double double50 = variance31.evaluate(doubleArray49);
        double double52 = variance1.evaluate(doubleArray49, (double) (short) 1);
        org.apache.commons.math.stat.descriptive.moment.Variance variance54 = new org.apache.commons.math.stat.descriptive.moment.Variance(false);
        variance54.clear();
        boolean boolean56 = variance54.isBiasCorrected();
        boolean boolean57 = variance1.equals((java.lang.Object) variance54);
        java.lang.Class<?> wildcardClass58 = variance1.getClass();
        org.junit.Assert.assertTrue(Double.isNaN(double2));
        org.junit.Assert.assertTrue(Double.isNaN(double3));
        org.junit.Assert.assertNotNull(doubleArray12);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray12), "[-1.0, 100.0, 97.0, 0.0, 1.0, -1.0]");
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 2168.222222222222d + "'", double13 == 2168.222222222222d);
        org.junit.Assert.assertTrue(Double.isNaN(double20));
        org.junit.Assert.assertNotNull(doubleArray25);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray25), "[-1.0, 2168.222222222222, 16.566666666418314, 10.0]");
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + false + "'", boolean27 == false);
        org.junit.Assert.assertTrue("'" + double29 + "' != '" + 1166128.5457099646d + "'", double29 == 1166128.5457099646d);
        org.junit.Assert.assertNotNull(doubleArray38);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray38), "[-1.0, 100.0, 97.0, 0.0, 1.0, -1.0]");
        org.junit.Assert.assertTrue("'" + double39 + "' != '" + 2168.222222222222d + "'", double39 == 2168.222222222222d);
        org.junit.Assert.assertTrue("'" + boolean42 + "' != '" + true + "'", boolean42 == true);
        org.junit.Assert.assertNotNull(doubleArray49);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray49), "[0.0, 1.0, 1.0, 0.0, -1.0, 10.0]");
        org.junit.Assert.assertTrue("'" + double50 + "' != '" + 16.566666666666663d + "'", double50 == 16.566666666666663d);
        org.junit.Assert.assertTrue("'" + double52 + "' != '" + 16.566666666666666d + "'", double52 == 16.566666666666666d);
        org.junit.Assert.assertTrue("'" + boolean56 + "' != '" + false + "'", boolean56 == false);
        org.junit.Assert.assertTrue("'" + boolean57 + "' != '" + true + "'", boolean57 == true);
        org.junit.Assert.assertNotNull(wildcardClass58);
    }

    @Test
    public void test1618() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1618");
        org.apache.commons.math.stat.descriptive.moment.Variance variance1 = new org.apache.commons.math.stat.descriptive.moment.Variance(false);
        double[] doubleArray8 = new double[] { (byte) -1, (short) 100, 'a', 0, 1, (-1.0d) };
        double double9 = variance1.evaluate(doubleArray8);
        double[] doubleArray13 = new double[] { (byte) 1, (byte) 100, 1L };
        double double14 = variance1.evaluate(doubleArray13);
        org.apache.commons.math.stat.descriptive.moment.Variance variance16 = new org.apache.commons.math.stat.descriptive.moment.Variance(false);
        double[] doubleArray23 = new double[] { (byte) -1, (short) 100, 'a', 0, 1, (-1.0d) };
        double double24 = variance16.evaluate(doubleArray23);
        variance16.setBiasCorrected(true);
        org.apache.commons.math.stat.descriptive.moment.Variance variance28 = new org.apache.commons.math.stat.descriptive.moment.Variance(false);
        double[] doubleArray35 = new double[] { (byte) -1, (short) 100, 'a', 0, 1, (-1.0d) };
        double double36 = variance28.evaluate(doubleArray35);
        variance16.incrementAll(doubleArray35);
        variance1.incrementAll(doubleArray35);
        boolean boolean40 = variance1.equals((java.lang.Object) (byte) 0);
        double double41 = variance1.getResult();
        double double42 = variance1.getResult();
        org.junit.Assert.assertNotNull(doubleArray8);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray8), "[-1.0, 100.0, 97.0, 0.0, 1.0, -1.0]");
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 2168.222222222222d + "'", double9 == 2168.222222222222d);
        org.junit.Assert.assertNotNull(doubleArray13);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray13), "[1.0, 100.0, 1.0]");
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + 2178.0d + "'", double14 == 2178.0d);
        org.junit.Assert.assertNotNull(doubleArray23);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray23), "[-1.0, 100.0, 97.0, 0.0, 1.0, -1.0]");
        org.junit.Assert.assertTrue("'" + double24 + "' != '" + 2168.222222222222d + "'", double24 == 2168.222222222222d);
        org.junit.Assert.assertNotNull(doubleArray35);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray35), "[-1.0, 100.0, 97.0, 0.0, 1.0, -1.0]");
        org.junit.Assert.assertTrue("'" + double36 + "' != '" + 2168.222222222222d + "'", double36 == 2168.222222222222d);
        org.junit.Assert.assertTrue("'" + boolean40 + "' != '" + false + "'", boolean40 == false);
        org.junit.Assert.assertTrue("'" + double41 + "' != '" + 2168.222222222222d + "'", double41 == 2168.222222222222d);
        org.junit.Assert.assertTrue("'" + double42 + "' != '" + 2168.222222222222d + "'", double42 == 2168.222222222222d);
    }

    @Test
    public void test1619() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1619");
        org.apache.commons.math.stat.descriptive.moment.Variance variance1 = new org.apache.commons.math.stat.descriptive.moment.Variance(false);
        double[] doubleArray8 = new double[] { (byte) -1, (short) 100, 'a', 0, 1, (-1.0d) };
        double double9 = variance1.evaluate(doubleArray8);
        variance1.setBiasCorrected(true);
        org.apache.commons.math.stat.descriptive.moment.Variance variance13 = new org.apache.commons.math.stat.descriptive.moment.Variance(false);
        double[] doubleArray20 = new double[] { (byte) -1, (short) 100, 'a', 0, 1, (-1.0d) };
        double double21 = variance13.evaluate(doubleArray20);
        variance13.setBiasCorrected(true);
        boolean boolean24 = variance13.isBiasCorrected();
        double[] doubleArray31 = new double[] { (short) 0, 1.0d, 1L, 0.0d, (-1.0d), 10L };
        double double32 = variance13.evaluate(doubleArray31);
        org.apache.commons.math.stat.descriptive.moment.Variance variance34 = new org.apache.commons.math.stat.descriptive.moment.Variance(false);
        double[] doubleArray41 = new double[] { (byte) -1, (short) 100, 'a', 0, 1, (-1.0d) };
        double double42 = variance34.evaluate(doubleArray41);
        variance34.setBiasCorrected(true);
        boolean boolean45 = variance34.isBiasCorrected();
        double[] doubleArray52 = new double[] { (short) 0, 1.0d, 1L, 0.0d, (-1.0d), 10L };
        double double53 = variance34.evaluate(doubleArray52);
        double double56 = variance13.evaluate(doubleArray52, (int) (byte) 1, 0);
        double double58 = variance1.evaluate(doubleArray52, 2178.0d);
        variance1.increment(3267.0d);
        boolean boolean61 = variance1.isBiasCorrected();
        variance1.clear();
        org.junit.Assert.assertNotNull(doubleArray8);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray8), "[-1.0, 100.0, 97.0, 0.0, 1.0, -1.0]");
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 2168.222222222222d + "'", double9 == 2168.222222222222d);
        org.junit.Assert.assertNotNull(doubleArray20);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray20), "[-1.0, 100.0, 97.0, 0.0, 1.0, -1.0]");
        org.junit.Assert.assertTrue("'" + double21 + "' != '" + 2168.222222222222d + "'", double21 == 2168.222222222222d);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + true + "'", boolean24 == true);
        org.junit.Assert.assertNotNull(doubleArray31);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray31), "[0.0, 1.0, 1.0, 0.0, -1.0, 10.0]");
        org.junit.Assert.assertTrue("'" + double32 + "' != '" + 16.566666666666663d + "'", double32 == 16.566666666666663d);
        org.junit.Assert.assertNotNull(doubleArray41);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray41), "[-1.0, 100.0, 97.0, 0.0, 1.0, -1.0]");
        org.junit.Assert.assertTrue("'" + double42 + "' != '" + 2168.222222222222d + "'", double42 == 2168.222222222222d);
        org.junit.Assert.assertTrue("'" + boolean45 + "' != '" + true + "'", boolean45 == true);
        org.junit.Assert.assertNotNull(doubleArray52);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray52), "[0.0, 1.0, 1.0, 0.0, -1.0, 10.0]");
        org.junit.Assert.assertTrue("'" + double53 + "' != '" + 16.566666666666663d + "'", double53 == 16.566666666666663d);
        org.junit.Assert.assertTrue(Double.isNaN(double56));
        org.junit.Assert.assertTrue("'" + double58 + "' != '" + 16.566666666418314d + "'", double58 == 16.566666666418314d);
        org.junit.Assert.assertTrue("'" + boolean61 + "' != '" + true + "'", boolean61 == true);
    }

    @Test
    public void test1620() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1620");
        org.apache.commons.math.stat.descriptive.moment.Variance variance1 = new org.apache.commons.math.stat.descriptive.moment.Variance(false);
        double[] doubleArray8 = new double[] { (byte) -1, (short) 100, 'a', 0, 1, (-1.0d) };
        double double9 = variance1.evaluate(doubleArray8);
        variance1.setBiasCorrected(true);
        long long12 = variance1.getN();
        long long13 = variance1.getN();
        org.apache.commons.math.stat.descriptive.moment.Variance variance15 = new org.apache.commons.math.stat.descriptive.moment.Variance(false);
        double[] doubleArray22 = new double[] { (byte) -1, (short) 100, 'a', 0, 1, (-1.0d) };
        double double23 = variance15.evaluate(doubleArray22);
        double[] doubleArray27 = new double[] { (byte) 1, (byte) 100, 1L };
        double double28 = variance15.evaluate(doubleArray27);
        double double30 = variance1.evaluate(doubleArray27, (double) 10.0f);
        long long31 = variance1.getN();
        variance1.increment(1694.7000000000003d);
        double double34 = variance1.getResult();
        org.junit.Assert.assertNotNull(doubleArray8);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray8), "[-1.0, 100.0, 97.0, 0.0, 1.0, -1.0]");
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 2168.222222222222d + "'", double9 == 2168.222222222222d);
        org.junit.Assert.assertTrue("'" + long12 + "' != '" + 0L + "'", long12 == 0L);
        org.junit.Assert.assertTrue("'" + long13 + "' != '" + 0L + "'", long13 == 0L);
        org.junit.Assert.assertNotNull(doubleArray22);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray22), "[-1.0, 100.0, 97.0, 0.0, 1.0, -1.0]");
        org.junit.Assert.assertTrue("'" + double23 + "' != '" + 2168.222222222222d + "'", double23 == 2168.222222222222d);
        org.junit.Assert.assertNotNull(doubleArray27);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray27), "[1.0, 100.0, 1.0]");
        org.junit.Assert.assertTrue("'" + double28 + "' != '" + 2178.0d + "'", double28 == 2178.0d);
        org.junit.Assert.assertTrue("'" + double30 + "' != '" + 3267.0d + "'", double30 == 3267.0d);
        org.junit.Assert.assertTrue("'" + long31 + "' != '" + 0L + "'", long31 == 0L);
        org.junit.Assert.assertTrue("'" + double34 + "' != '" + 0.0d + "'", double34 == 0.0d);
    }

    @Test
    public void test1621() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1621");
        org.apache.commons.math.stat.descriptive.moment.Variance variance1 = new org.apache.commons.math.stat.descriptive.moment.Variance(true);
        double double2 = variance1.getResult();
        double double3 = variance1.getResult();
        org.apache.commons.math.stat.descriptive.moment.Variance variance5 = new org.apache.commons.math.stat.descriptive.moment.Variance(false);
        double[] doubleArray12 = new double[] { (byte) -1, (short) 100, 'a', 0, 1, (-1.0d) };
        double double13 = variance5.evaluate(doubleArray12);
        variance5.setBiasCorrected(true);
        long long16 = variance5.getN();
        variance5.clear();
        org.apache.commons.math.stat.descriptive.moment.Variance variance19 = new org.apache.commons.math.stat.descriptive.moment.Variance(false);
        double[] doubleArray26 = new double[] { (byte) -1, (short) 100, 'a', 0, 1, (-1.0d) };
        double double27 = variance19.evaluate(doubleArray26);
        double double28 = variance5.evaluate(doubleArray26);
        variance1.incrementAll(doubleArray26);
        org.apache.commons.math.stat.descriptive.moment.Variance variance31 = new org.apache.commons.math.stat.descriptive.moment.Variance(false);
        double[] doubleArray38 = new double[] { (byte) -1, (short) 100, 'a', 0, 1, (-1.0d) };
        double double39 = variance31.evaluate(doubleArray38);
        variance31.setBiasCorrected(true);
        boolean boolean42 = variance31.isBiasCorrected();
        double[] doubleArray49 = new double[] { (short) 0, 1.0d, 1L, 0.0d, (-1.0d), 10L };
        double double50 = variance31.evaluate(doubleArray49);
        double double51 = variance31.getResult();
        long long52 = variance31.getN();
        org.apache.commons.math.stat.descriptive.moment.Variance variance54 = new org.apache.commons.math.stat.descriptive.moment.Variance(false);
        double[] doubleArray61 = new double[] { (byte) -1, (short) 100, 'a', 0, 1, (-1.0d) };
        double double62 = variance54.evaluate(doubleArray61);
        variance54.setBiasCorrected(true);
        long long65 = variance54.getN();
        variance54.clear();
        org.apache.commons.math.stat.descriptive.moment.Variance variance68 = new org.apache.commons.math.stat.descriptive.moment.Variance(false);
        double[] doubleArray75 = new double[] { (byte) -1, (short) 100, 'a', 0, 1, (-1.0d) };
        double double76 = variance68.evaluate(doubleArray75);
        double double77 = variance54.evaluate(doubleArray75);
        double double78 = variance31.evaluate(doubleArray75);
        variance1.incrementAll(doubleArray75);
        boolean boolean80 = variance1.isBiasCorrected();
        long long81 = variance1.getN();
        org.junit.Assert.assertTrue(Double.isNaN(double2));
        org.junit.Assert.assertTrue(Double.isNaN(double3));
        org.junit.Assert.assertNotNull(doubleArray12);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray12), "[-1.0, 100.0, 97.0, 0.0, 1.0, -1.0]");
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 2168.222222222222d + "'", double13 == 2168.222222222222d);
        org.junit.Assert.assertTrue("'" + long16 + "' != '" + 0L + "'", long16 == 0L);
        org.junit.Assert.assertNotNull(doubleArray26);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray26), "[-1.0, 100.0, 97.0, 0.0, 1.0, -1.0]");
        org.junit.Assert.assertTrue("'" + double27 + "' != '" + 2168.222222222222d + "'", double27 == 2168.222222222222d);
        org.junit.Assert.assertTrue("'" + double28 + "' != '" + 2601.866666666667d + "'", double28 == 2601.866666666667d);
        org.junit.Assert.assertNotNull(doubleArray38);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray38), "[-1.0, 100.0, 97.0, 0.0, 1.0, -1.0]");
        org.junit.Assert.assertTrue("'" + double39 + "' != '" + 2168.222222222222d + "'", double39 == 2168.222222222222d);
        org.junit.Assert.assertTrue("'" + boolean42 + "' != '" + true + "'", boolean42 == true);
        org.junit.Assert.assertNotNull(doubleArray49);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray49), "[0.0, 1.0, 1.0, 0.0, -1.0, 10.0]");
        org.junit.Assert.assertTrue("'" + double50 + "' != '" + 16.566666666666663d + "'", double50 == 16.566666666666663d);
        org.junit.Assert.assertTrue(Double.isNaN(double51));
        org.junit.Assert.assertTrue("'" + long52 + "' != '" + 0L + "'", long52 == 0L);
        org.junit.Assert.assertNotNull(doubleArray61);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray61), "[-1.0, 100.0, 97.0, 0.0, 1.0, -1.0]");
        org.junit.Assert.assertTrue("'" + double62 + "' != '" + 2168.222222222222d + "'", double62 == 2168.222222222222d);
        org.junit.Assert.assertTrue("'" + long65 + "' != '" + 0L + "'", long65 == 0L);
        org.junit.Assert.assertNotNull(doubleArray75);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray75), "[-1.0, 100.0, 97.0, 0.0, 1.0, -1.0]");
        org.junit.Assert.assertTrue("'" + double76 + "' != '" + 2168.222222222222d + "'", double76 == 2168.222222222222d);
        org.junit.Assert.assertTrue("'" + double77 + "' != '" + 2601.866666666667d + "'", double77 == 2601.866666666667d);
        org.junit.Assert.assertTrue("'" + double78 + "' != '" + 2601.866666666667d + "'", double78 == 2601.866666666667d);
        org.junit.Assert.assertTrue("'" + boolean80 + "' != '" + true + "'", boolean80 == true);
        org.junit.Assert.assertTrue("'" + long81 + "' != '" + 12L + "'", long81 == 12L);
    }

    @Test
    public void test1622() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1622");
        org.apache.commons.math.stat.descriptive.moment.Variance variance1 = new org.apache.commons.math.stat.descriptive.moment.Variance(false);
        variance1.clear();
        double double3 = variance1.getResult();
        double[] doubleArray8 = new double[] { (-1), 2168.222222222222d, 16.566666666418314d, 10.0d };
        variance1.incrementAll(doubleArray8);
        org.apache.commons.math.stat.descriptive.moment.Variance variance11 = new org.apache.commons.math.stat.descriptive.moment.Variance(false);
        double[] doubleArray18 = new double[] { (byte) -1, (short) 100, 'a', 0, 1, (-1.0d) };
        double double19 = variance11.evaluate(doubleArray18);
        variance11.setBiasCorrected(true);
        boolean boolean22 = variance11.isBiasCorrected();
        double[] doubleArray29 = new double[] { (short) 0, 1.0d, 1L, 0.0d, (-1.0d), 10L };
        double double30 = variance11.evaluate(doubleArray29);
        double double31 = variance11.getResult();
        variance11.setBiasCorrected(true);
        boolean boolean34 = variance11.isBiasCorrected();
        variance11.setBiasCorrected(false);
        variance11.increment(2601.866666666667d);
        org.apache.commons.math.stat.descriptive.moment.Variance variance40 = new org.apache.commons.math.stat.descriptive.moment.Variance(false);
        double[] doubleArray47 = new double[] { (byte) -1, (short) 100, 'a', 0, 1, (-1.0d) };
        double double48 = variance40.evaluate(doubleArray47);
        variance40.clear();
        variance40.setBiasCorrected(true);
        double double52 = variance40.getResult();
        org.apache.commons.math.stat.descriptive.moment.Variance variance54 = new org.apache.commons.math.stat.descriptive.moment.Variance(false);
        double[] doubleArray61 = new double[] { (byte) -1, (short) 100, 'a', 0, 1, (-1.0d) };
        double double62 = variance54.evaluate(doubleArray61);
        double double63 = variance40.evaluate(doubleArray61);
        double double64 = variance11.evaluate(doubleArray61);
        double double65 = variance1.evaluate(doubleArray61);
        variance1.increment((double) 0.0f);
        double double68 = variance1.getResult();
        variance1.increment(4.5d);
        boolean boolean71 = variance1.isBiasCorrected();
        double[] doubleArray72 = null;
        // The following exception was thrown during execution in test generation
        try {
            variance1.incrementAll(doubleArray72, (int) (short) 0, (int) (byte) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: input value array is null");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue(Double.isNaN(double3));
        org.junit.Assert.assertNotNull(doubleArray8);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray8), "[-1.0, 2168.222222222222, 16.566666666418314, 10.0]");
        org.junit.Assert.assertNotNull(doubleArray18);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray18), "[-1.0, 100.0, 97.0, 0.0, 1.0, -1.0]");
        org.junit.Assert.assertTrue("'" + double19 + "' != '" + 2168.222222222222d + "'", double19 == 2168.222222222222d);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + true + "'", boolean22 == true);
        org.junit.Assert.assertNotNull(doubleArray29);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray29), "[0.0, 1.0, 1.0, 0.0, -1.0, 10.0]");
        org.junit.Assert.assertTrue("'" + double30 + "' != '" + 16.566666666666663d + "'", double30 == 16.566666666666663d);
        org.junit.Assert.assertTrue(Double.isNaN(double31));
        org.junit.Assert.assertTrue("'" + boolean34 + "' != '" + true + "'", boolean34 == true);
        org.junit.Assert.assertNotNull(doubleArray47);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray47), "[-1.0, 100.0, 97.0, 0.0, 1.0, -1.0]");
        org.junit.Assert.assertTrue("'" + double48 + "' != '" + 2168.222222222222d + "'", double48 == 2168.222222222222d);
        org.junit.Assert.assertTrue(Double.isNaN(double52));
        org.junit.Assert.assertNotNull(doubleArray61);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray61), "[-1.0, 100.0, 97.0, 0.0, 1.0, -1.0]");
        org.junit.Assert.assertTrue("'" + double62 + "' != '" + 2168.222222222222d + "'", double62 == 2168.222222222222d);
        org.junit.Assert.assertTrue("'" + double63 + "' != '" + 2601.866666666667d + "'", double63 == 2601.866666666667d);
        org.junit.Assert.assertTrue("'" + double64 + "' != '" + 2168.222222222222d + "'", double64 == 2168.222222222222d);
        org.junit.Assert.assertTrue("'" + double65 + "' != '" + 2168.222222222222d + "'", double65 == 2168.222222222222d);
        org.junit.Assert.assertTrue("'" + double68 + "' != '" + 0.0d + "'", double68 == 0.0d);
        org.junit.Assert.assertTrue("'" + boolean71 + "' != '" + false + "'", boolean71 == false);
    }

    @Test
    public void test1623() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1623");
        org.apache.commons.math.stat.descriptive.moment.Variance variance1 = new org.apache.commons.math.stat.descriptive.moment.Variance(true);
        double double2 = variance1.getResult();
        double double3 = variance1.getResult();
        org.apache.commons.math.stat.descriptive.moment.Variance variance5 = new org.apache.commons.math.stat.descriptive.moment.Variance(false);
        double[] doubleArray12 = new double[] { (byte) -1, (short) 100, 'a', 0, 1, (-1.0d) };
        double double13 = variance5.evaluate(doubleArray12);
        variance5.setBiasCorrected(true);
        long long16 = variance5.getN();
        variance5.clear();
        org.apache.commons.math.stat.descriptive.moment.Variance variance19 = new org.apache.commons.math.stat.descriptive.moment.Variance(false);
        double[] doubleArray26 = new double[] { (byte) -1, (short) 100, 'a', 0, 1, (-1.0d) };
        double double27 = variance19.evaluate(doubleArray26);
        double double28 = variance5.evaluate(doubleArray26);
        variance1.incrementAll(doubleArray26);
        variance1.setBiasCorrected(true);
        double double32 = variance1.getResult();
        org.junit.Assert.assertTrue(Double.isNaN(double2));
        org.junit.Assert.assertTrue(Double.isNaN(double3));
        org.junit.Assert.assertNotNull(doubleArray12);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray12), "[-1.0, 100.0, 97.0, 0.0, 1.0, -1.0]");
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 2168.222222222222d + "'", double13 == 2168.222222222222d);
        org.junit.Assert.assertTrue("'" + long16 + "' != '" + 0L + "'", long16 == 0L);
        org.junit.Assert.assertNotNull(doubleArray26);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray26), "[-1.0, 100.0, 97.0, 0.0, 1.0, -1.0]");
        org.junit.Assert.assertTrue("'" + double27 + "' != '" + 2168.222222222222d + "'", double27 == 2168.222222222222d);
        org.junit.Assert.assertTrue("'" + double28 + "' != '" + 2601.866666666667d + "'", double28 == 2601.866666666667d);
        org.junit.Assert.assertTrue("'" + double32 + "' != '" + 2601.866666666667d + "'", double32 == 2601.866666666667d);
    }

    @Test
    public void test1624() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1624");
        org.apache.commons.math.stat.descriptive.moment.Variance variance1 = new org.apache.commons.math.stat.descriptive.moment.Variance(false);
        double[] doubleArray8 = new double[] { (byte) -1, (short) 100, 'a', 0, 1, (-1.0d) };
        double double9 = variance1.evaluate(doubleArray8);
        variance1.setBiasCorrected(true);
        long long12 = variance1.getN();
        long long13 = variance1.getN();
        org.apache.commons.math.stat.descriptive.moment.Variance variance15 = new org.apache.commons.math.stat.descriptive.moment.Variance(false);
        double[] doubleArray22 = new double[] { (byte) -1, (short) 100, 'a', 0, 1, (-1.0d) };
        double double23 = variance15.evaluate(doubleArray22);
        double[] doubleArray27 = new double[] { (byte) 1, (byte) 100, 1L };
        double double28 = variance15.evaluate(doubleArray27);
        double double30 = variance1.evaluate(doubleArray27, (double) 10.0f);
        long long31 = variance1.getN();
        double double32 = variance1.getResult();
        double double33 = variance1.getResult();
        double double34 = variance1.getResult();
        long long35 = variance1.getN();
        org.junit.Assert.assertNotNull(doubleArray8);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray8), "[-1.0, 100.0, 97.0, 0.0, 1.0, -1.0]");
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 2168.222222222222d + "'", double9 == 2168.222222222222d);
        org.junit.Assert.assertTrue("'" + long12 + "' != '" + 0L + "'", long12 == 0L);
        org.junit.Assert.assertTrue("'" + long13 + "' != '" + 0L + "'", long13 == 0L);
        org.junit.Assert.assertNotNull(doubleArray22);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray22), "[-1.0, 100.0, 97.0, 0.0, 1.0, -1.0]");
        org.junit.Assert.assertTrue("'" + double23 + "' != '" + 2168.222222222222d + "'", double23 == 2168.222222222222d);
        org.junit.Assert.assertNotNull(doubleArray27);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray27), "[1.0, 100.0, 1.0]");
        org.junit.Assert.assertTrue("'" + double28 + "' != '" + 2178.0d + "'", double28 == 2178.0d);
        org.junit.Assert.assertTrue("'" + double30 + "' != '" + 3267.0d + "'", double30 == 3267.0d);
        org.junit.Assert.assertTrue("'" + long31 + "' != '" + 0L + "'", long31 == 0L);
        org.junit.Assert.assertTrue(Double.isNaN(double32));
        org.junit.Assert.assertTrue(Double.isNaN(double33));
        org.junit.Assert.assertTrue(Double.isNaN(double34));
        org.junit.Assert.assertTrue("'" + long35 + "' != '" + 0L + "'", long35 == 0L);
    }

    @Test
    public void test1625() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1625");
        org.apache.commons.math.stat.descriptive.moment.Variance variance0 = new org.apache.commons.math.stat.descriptive.moment.Variance();
        variance0.increment(1694.7000000000003d);
        double double3 = variance0.getResult();
        variance0.setBiasCorrected(true);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 0.0d + "'", double3 == 0.0d);
    }

    @Test
    public void test1626() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1626");
        org.apache.commons.math.stat.descriptive.moment.Variance variance1 = new org.apache.commons.math.stat.descriptive.moment.Variance(false);
        variance1.clear();
        double double3 = variance1.getResult();
        variance1.setBiasCorrected(true);
        variance1.clear();
        variance1.setBiasCorrected(true);
        org.apache.commons.math.stat.descriptive.moment.Variance variance10 = new org.apache.commons.math.stat.descriptive.moment.Variance(false);
        double[] doubleArray17 = new double[] { (byte) -1, (short) 100, 'a', 0, 1, (-1.0d) };
        double double18 = variance10.evaluate(doubleArray17);
        variance10.setBiasCorrected(true);
        org.apache.commons.math.stat.descriptive.moment.Variance variance22 = new org.apache.commons.math.stat.descriptive.moment.Variance(false);
        double[] doubleArray29 = new double[] { (byte) -1, (short) 100, 'a', 0, 1, (-1.0d) };
        double double30 = variance22.evaluate(doubleArray29);
        variance22.setBiasCorrected(true);
        boolean boolean33 = variance22.isBiasCorrected();
        double[] doubleArray40 = new double[] { (short) 0, 1.0d, 1L, 0.0d, (-1.0d), 10L };
        double double41 = variance22.evaluate(doubleArray40);
        org.apache.commons.math.stat.descriptive.moment.Variance variance43 = new org.apache.commons.math.stat.descriptive.moment.Variance(false);
        double[] doubleArray50 = new double[] { (byte) -1, (short) 100, 'a', 0, 1, (-1.0d) };
        double double51 = variance43.evaluate(doubleArray50);
        variance43.setBiasCorrected(true);
        boolean boolean54 = variance43.isBiasCorrected();
        double[] doubleArray61 = new double[] { (short) 0, 1.0d, 1L, 0.0d, (-1.0d), 10L };
        double double62 = variance43.evaluate(doubleArray61);
        double double65 = variance22.evaluate(doubleArray61, (int) (byte) 1, 0);
        double double67 = variance10.evaluate(doubleArray61, 2178.0d);
        variance10.increment(3267.0d);
        org.apache.commons.math.stat.descriptive.moment.Variance variance71 = new org.apache.commons.math.stat.descriptive.moment.Variance(false);
        double[] doubleArray78 = new double[] { (byte) -1, (short) 100, 'a', 0, 1, (-1.0d) };
        double double79 = variance71.evaluate(doubleArray78);
        variance71.setBiasCorrected(true);
        variance71.clear();
        boolean boolean83 = variance10.equals((java.lang.Object) variance71);
        double[] doubleArray88 = new double[] { 1694.7000000000003d, '4', 0, (short) 100 };
        double double89 = variance10.evaluate(doubleArray88);
        double double90 = variance1.evaluate(doubleArray88);
        org.junit.Assert.assertTrue(Double.isNaN(double3));
        org.junit.Assert.assertNotNull(doubleArray17);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray17), "[-1.0, 100.0, 97.0, 0.0, 1.0, -1.0]");
        org.junit.Assert.assertTrue("'" + double18 + "' != '" + 2168.222222222222d + "'", double18 == 2168.222222222222d);
        org.junit.Assert.assertNotNull(doubleArray29);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray29), "[-1.0, 100.0, 97.0, 0.0, 1.0, -1.0]");
        org.junit.Assert.assertTrue("'" + double30 + "' != '" + 2168.222222222222d + "'", double30 == 2168.222222222222d);
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + true + "'", boolean33 == true);
        org.junit.Assert.assertNotNull(doubleArray40);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray40), "[0.0, 1.0, 1.0, 0.0, -1.0, 10.0]");
        org.junit.Assert.assertTrue("'" + double41 + "' != '" + 16.566666666666663d + "'", double41 == 16.566666666666663d);
        org.junit.Assert.assertNotNull(doubleArray50);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray50), "[-1.0, 100.0, 97.0, 0.0, 1.0, -1.0]");
        org.junit.Assert.assertTrue("'" + double51 + "' != '" + 2168.222222222222d + "'", double51 == 2168.222222222222d);
        org.junit.Assert.assertTrue("'" + boolean54 + "' != '" + true + "'", boolean54 == true);
        org.junit.Assert.assertNotNull(doubleArray61);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray61), "[0.0, 1.0, 1.0, 0.0, -1.0, 10.0]");
        org.junit.Assert.assertTrue("'" + double62 + "' != '" + 16.566666666666663d + "'", double62 == 16.566666666666663d);
        org.junit.Assert.assertTrue(Double.isNaN(double65));
        org.junit.Assert.assertTrue("'" + double67 + "' != '" + 16.566666666418314d + "'", double67 == 16.566666666418314d);
        org.junit.Assert.assertNotNull(doubleArray78);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray78), "[-1.0, 100.0, 97.0, 0.0, 1.0, -1.0]");
        org.junit.Assert.assertTrue("'" + double79 + "' != '" + 2168.222222222222d + "'", double79 == 2168.222222222222d);
        org.junit.Assert.assertTrue("'" + boolean83 + "' != '" + false + "'", boolean83 == false);
        org.junit.Assert.assertNotNull(doubleArray88);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray88), "[1694.7000000000003, 52.0, 0.0, 100.0]");
        org.junit.Assert.assertTrue("'" + double89 + "' != '" + 677378.9558333334d + "'", double89 == 677378.9558333334d);
        org.junit.Assert.assertTrue("'" + double90 + "' != '" + 677378.9558333334d + "'", double90 == 677378.9558333334d);
    }

    @Test
    public void test1627() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1627");
        org.apache.commons.math.stat.descriptive.moment.Variance variance1 = new org.apache.commons.math.stat.descriptive.moment.Variance(false);
        variance1.clear();
        boolean boolean3 = variance1.isBiasCorrected();
        boolean boolean5 = variance1.equals((java.lang.Object) 1166128.5457099646d);
        variance1.clear();
        long long7 = variance1.getN();
        boolean boolean8 = variance1.isBiasCorrected();
        org.apache.commons.math.stat.descriptive.moment.Variance variance10 = new org.apache.commons.math.stat.descriptive.moment.Variance(true);
        org.apache.commons.math.stat.descriptive.moment.Variance variance12 = new org.apache.commons.math.stat.descriptive.moment.Variance(false);
        double[] doubleArray19 = new double[] { (byte) -1, (short) 100, 'a', 0, 1, (-1.0d) };
        double double20 = variance12.evaluate(doubleArray19);
        double[] doubleArray24 = new double[] { (byte) 1, (byte) 100, 1L };
        double double25 = variance12.evaluate(doubleArray24);
        boolean boolean26 = variance10.equals((java.lang.Object) variance12);
        org.apache.commons.math.stat.descriptive.moment.Variance variance28 = new org.apache.commons.math.stat.descriptive.moment.Variance(false);
        double[] doubleArray35 = new double[] { (byte) -1, (short) 100, 'a', 0, 1, (-1.0d) };
        double double36 = variance28.evaluate(doubleArray35);
        variance28.setBiasCorrected(true);
        org.apache.commons.math.stat.descriptive.moment.Variance variance40 = new org.apache.commons.math.stat.descriptive.moment.Variance(false);
        double[] doubleArray47 = new double[] { (byte) -1, (short) 100, 'a', 0, 1, (-1.0d) };
        double double48 = variance40.evaluate(doubleArray47);
        variance40.setBiasCorrected(true);
        boolean boolean51 = variance40.isBiasCorrected();
        double[] doubleArray58 = new double[] { (short) 0, 1.0d, 1L, 0.0d, (-1.0d), 10L };
        double double59 = variance40.evaluate(doubleArray58);
        org.apache.commons.math.stat.descriptive.moment.Variance variance61 = new org.apache.commons.math.stat.descriptive.moment.Variance(false);
        double[] doubleArray68 = new double[] { (byte) -1, (short) 100, 'a', 0, 1, (-1.0d) };
        double double69 = variance61.evaluate(doubleArray68);
        variance61.setBiasCorrected(true);
        boolean boolean72 = variance61.isBiasCorrected();
        double[] doubleArray79 = new double[] { (short) 0, 1.0d, 1L, 0.0d, (-1.0d), 10L };
        double double80 = variance61.evaluate(doubleArray79);
        double double83 = variance40.evaluate(doubleArray79, (int) (byte) 1, 0);
        double double85 = variance28.evaluate(doubleArray79, 2178.0d);
        double double87 = variance12.evaluate(doubleArray79, (double) 100L);
        // The following exception was thrown during execution in test generation
        try {
            variance1.incrementAll(doubleArray79, 100, (int) (byte) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: length cannot be negative");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + 0L + "'", long7 == 0L);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNotNull(doubleArray19);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray19), "[-1.0, 100.0, 97.0, 0.0, 1.0, -1.0]");
        org.junit.Assert.assertTrue("'" + double20 + "' != '" + 2168.222222222222d + "'", double20 == 2168.222222222222d);
        org.junit.Assert.assertNotNull(doubleArray24);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray24), "[1.0, 100.0, 1.0]");
        org.junit.Assert.assertTrue("'" + double25 + "' != '" + 2178.0d + "'", double25 == 2178.0d);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + true + "'", boolean26 == true);
        org.junit.Assert.assertNotNull(doubleArray35);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray35), "[-1.0, 100.0, 97.0, 0.0, 1.0, -1.0]");
        org.junit.Assert.assertTrue("'" + double36 + "' != '" + 2168.222222222222d + "'", double36 == 2168.222222222222d);
        org.junit.Assert.assertNotNull(doubleArray47);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray47), "[-1.0, 100.0, 97.0, 0.0, 1.0, -1.0]");
        org.junit.Assert.assertTrue("'" + double48 + "' != '" + 2168.222222222222d + "'", double48 == 2168.222222222222d);
        org.junit.Assert.assertTrue("'" + boolean51 + "' != '" + true + "'", boolean51 == true);
        org.junit.Assert.assertNotNull(doubleArray58);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray58), "[0.0, 1.0, 1.0, 0.0, -1.0, 10.0]");
        org.junit.Assert.assertTrue("'" + double59 + "' != '" + 16.566666666666663d + "'", double59 == 16.566666666666663d);
        org.junit.Assert.assertNotNull(doubleArray68);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray68), "[-1.0, 100.0, 97.0, 0.0, 1.0, -1.0]");
        org.junit.Assert.assertTrue("'" + double69 + "' != '" + 2168.222222222222d + "'", double69 == 2168.222222222222d);
        org.junit.Assert.assertTrue("'" + boolean72 + "' != '" + true + "'", boolean72 == true);
        org.junit.Assert.assertNotNull(doubleArray79);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray79), "[0.0, 1.0, 1.0, 0.0, -1.0, 10.0]");
        org.junit.Assert.assertTrue("'" + double80 + "' != '" + 16.566666666666663d + "'", double80 == 16.566666666666663d);
        org.junit.Assert.assertTrue(Double.isNaN(double83));
        org.junit.Assert.assertTrue("'" + double85 + "' != '" + 16.566666666418314d + "'", double85 == 16.566666666418314d);
        org.junit.Assert.assertTrue("'" + double87 + "' != '" + 13.80555555555596d + "'", double87 == 13.80555555555596d);
    }

    @Test
    public void test1628() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1628");
        org.apache.commons.math.stat.descriptive.moment.Variance variance1 = new org.apache.commons.math.stat.descriptive.moment.Variance(false);
        double[] doubleArray8 = new double[] { (byte) -1, (short) 100, 'a', 0, 1, (-1.0d) };
        double double9 = variance1.evaluate(doubleArray8);
        variance1.setBiasCorrected(true);
        boolean boolean12 = variance1.isBiasCorrected();
        double[] doubleArray19 = new double[] { (short) 0, 1.0d, 1L, 0.0d, (-1.0d), 10L };
        double double20 = variance1.evaluate(doubleArray19);
        boolean boolean22 = variance1.equals((java.lang.Object) 10.0d);
        boolean boolean23 = variance1.isBiasCorrected();
        double double24 = variance1.getResult();
        double double25 = variance1.getResult();
        long long26 = variance1.getN();
        double double27 = variance1.getResult();
        double double28 = variance1.getResult();
        org.apache.commons.math.stat.descriptive.moment.Variance variance30 = new org.apache.commons.math.stat.descriptive.moment.Variance(false);
        double[] doubleArray37 = new double[] { (byte) -1, (short) 100, 'a', 0, 1, (-1.0d) };
        double double38 = variance30.evaluate(doubleArray37);
        variance30.setBiasCorrected(true);
        long long41 = variance30.getN();
        variance30.clear();
        org.apache.commons.math.stat.descriptive.moment.Variance variance44 = new org.apache.commons.math.stat.descriptive.moment.Variance(false);
        double[] doubleArray51 = new double[] { (byte) -1, (short) 100, 'a', 0, 1, (-1.0d) };
        double double52 = variance44.evaluate(doubleArray51);
        double double53 = variance30.evaluate(doubleArray51);
        variance1.incrementAll(doubleArray51);
        org.junit.Assert.assertNotNull(doubleArray8);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray8), "[-1.0, 100.0, 97.0, 0.0, 1.0, -1.0]");
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 2168.222222222222d + "'", double9 == 2168.222222222222d);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertNotNull(doubleArray19);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray19), "[0.0, 1.0, 1.0, 0.0, -1.0, 10.0]");
        org.junit.Assert.assertTrue("'" + double20 + "' != '" + 16.566666666666663d + "'", double20 == 16.566666666666663d);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + true + "'", boolean23 == true);
        org.junit.Assert.assertTrue(Double.isNaN(double24));
        org.junit.Assert.assertTrue(Double.isNaN(double25));
        org.junit.Assert.assertTrue("'" + long26 + "' != '" + 0L + "'", long26 == 0L);
        org.junit.Assert.assertTrue(Double.isNaN(double27));
        org.junit.Assert.assertTrue(Double.isNaN(double28));
        org.junit.Assert.assertNotNull(doubleArray37);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray37), "[-1.0, 100.0, 97.0, 0.0, 1.0, -1.0]");
        org.junit.Assert.assertTrue("'" + double38 + "' != '" + 2168.222222222222d + "'", double38 == 2168.222222222222d);
        org.junit.Assert.assertTrue("'" + long41 + "' != '" + 0L + "'", long41 == 0L);
        org.junit.Assert.assertNotNull(doubleArray51);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray51), "[-1.0, 100.0, 97.0, 0.0, 1.0, -1.0]");
        org.junit.Assert.assertTrue("'" + double52 + "' != '" + 2168.222222222222d + "'", double52 == 2168.222222222222d);
        org.junit.Assert.assertTrue("'" + double53 + "' != '" + 2601.866666666667d + "'", double53 == 2601.866666666667d);
    }

    @Test
    public void test1629() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1629");
        org.apache.commons.math.stat.descriptive.moment.Variance variance1 = new org.apache.commons.math.stat.descriptive.moment.Variance(false);
        variance1.clear();
        long long3 = variance1.getN();
        double double4 = variance1.getResult();
        long long5 = variance1.getN();
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 0L + "'", long3 == 0L);
        org.junit.Assert.assertTrue(Double.isNaN(double4));
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 0L + "'", long5 == 0L);
    }

    @Test
    public void test1630() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1630");
        org.apache.commons.math.stat.descriptive.moment.Variance variance1 = new org.apache.commons.math.stat.descriptive.moment.Variance(false);
        variance1.clear();
        boolean boolean3 = variance1.isBiasCorrected();
        boolean boolean5 = variance1.equals((java.lang.Object) 1166128.5457099646d);
        variance1.increment(677378.9558333334d);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
    }

    @Test
    public void test1631() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1631");
        org.apache.commons.math.stat.descriptive.moment.Variance variance1 = new org.apache.commons.math.stat.descriptive.moment.Variance(false);
        double[] doubleArray8 = new double[] { (byte) -1, (short) 100, 'a', 0, 1, (-1.0d) };
        double double9 = variance1.evaluate(doubleArray8);
        variance1.setBiasCorrected(true);
        org.apache.commons.math.stat.descriptive.moment.Variance variance13 = new org.apache.commons.math.stat.descriptive.moment.Variance(false);
        double[] doubleArray20 = new double[] { (byte) -1, (short) 100, 'a', 0, 1, (-1.0d) };
        double double21 = variance13.evaluate(doubleArray20);
        variance1.incrementAll(doubleArray20);
        variance1.clear();
        boolean boolean24 = variance1.isBiasCorrected();
        boolean boolean25 = variance1.isBiasCorrected();
        variance1.setBiasCorrected(false);
        variance1.setBiasCorrected(false);
        org.junit.Assert.assertNotNull(doubleArray8);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray8), "[-1.0, 100.0, 97.0, 0.0, 1.0, -1.0]");
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 2168.222222222222d + "'", double9 == 2168.222222222222d);
        org.junit.Assert.assertNotNull(doubleArray20);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray20), "[-1.0, 100.0, 97.0, 0.0, 1.0, -1.0]");
        org.junit.Assert.assertTrue("'" + double21 + "' != '" + 2168.222222222222d + "'", double21 == 2168.222222222222d);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + true + "'", boolean24 == true);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + true + "'", boolean25 == true);
    }

    @Test
    public void test1632() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1632");
        org.apache.commons.math.stat.descriptive.moment.Variance variance1 = new org.apache.commons.math.stat.descriptive.moment.Variance(false);
        variance1.clear();
        long long3 = variance1.getN();
        variance1.increment((double) 3L);
        org.apache.commons.math.stat.descriptive.moment.Variance variance7 = new org.apache.commons.math.stat.descriptive.moment.Variance(false);
        double[] doubleArray14 = new double[] { (byte) -1, (short) 100, 'a', 0, 1, (-1.0d) };
        double double15 = variance7.evaluate(doubleArray14);
        variance7.setBiasCorrected(true);
        variance7.increment((double) (byte) 0);
        double[] doubleArray22 = new double[] { 'a', 100L };
        double double24 = variance7.evaluate(doubleArray22, 0.0d);
        long long25 = variance7.getN();
        boolean boolean26 = variance7.isBiasCorrected();
        long long27 = variance7.getN();
        double double28 = variance7.getResult();
        double double29 = variance7.getResult();
        variance7.setBiasCorrected(false);
        org.apache.commons.math.stat.descriptive.moment.Variance variance32 = new org.apache.commons.math.stat.descriptive.moment.Variance();
        long long33 = variance32.getN();
        variance32.setBiasCorrected(true);
        org.apache.commons.math.stat.descriptive.moment.Variance variance37 = new org.apache.commons.math.stat.descriptive.moment.Variance(false);
        double[] doubleArray44 = new double[] { (byte) -1, (short) 100, 'a', 0, 1, (-1.0d) };
        double double45 = variance37.evaluate(doubleArray44);
        variance37.clear();
        variance37.setBiasCorrected(false);
        variance37.clear();
        org.apache.commons.math.stat.descriptive.moment.Variance variance51 = new org.apache.commons.math.stat.descriptive.moment.Variance(false);
        double[] doubleArray58 = new double[] { (byte) -1, (short) 100, 'a', 0, 1, (-1.0d) };
        double double59 = variance51.evaluate(doubleArray58);
        variance51.setBiasCorrected(true);
        variance51.increment((double) (byte) 0);
        double[] doubleArray66 = new double[] { 'a', 100L };
        double double68 = variance51.evaluate(doubleArray66, 0.0d);
        double double69 = variance37.evaluate(doubleArray66);
        variance32.incrementAll(doubleArray66, 1, (int) (byte) 1);
        double double74 = variance7.evaluate(doubleArray66, 13.805555555555552d);
        variance1.incrementAll(doubleArray66);
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 0L + "'", long3 == 0L);
        org.junit.Assert.assertNotNull(doubleArray14);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray14), "[-1.0, 100.0, 97.0, 0.0, 1.0, -1.0]");
        org.junit.Assert.assertTrue("'" + double15 + "' != '" + 2168.222222222222d + "'", double15 == 2168.222222222222d);
        org.junit.Assert.assertNotNull(doubleArray22);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray22), "[97.0, 100.0]");
        org.junit.Assert.assertTrue("'" + double24 + "' != '" + 4.5d + "'", double24 == 4.5d);
        org.junit.Assert.assertTrue("'" + long25 + "' != '" + 1L + "'", long25 == 1L);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + true + "'", boolean26 == true);
        org.junit.Assert.assertTrue("'" + long27 + "' != '" + 1L + "'", long27 == 1L);
        org.junit.Assert.assertTrue("'" + double28 + "' != '" + 0.0d + "'", double28 == 0.0d);
        org.junit.Assert.assertTrue("'" + double29 + "' != '" + 0.0d + "'", double29 == 0.0d);
        org.junit.Assert.assertTrue("'" + long33 + "' != '" + 0L + "'", long33 == 0L);
        org.junit.Assert.assertNotNull(doubleArray44);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray44), "[-1.0, 100.0, 97.0, 0.0, 1.0, -1.0]");
        org.junit.Assert.assertTrue("'" + double45 + "' != '" + 2168.222222222222d + "'", double45 == 2168.222222222222d);
        org.junit.Assert.assertNotNull(doubleArray58);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray58), "[-1.0, 100.0, 97.0, 0.0, 1.0, -1.0]");
        org.junit.Assert.assertTrue("'" + double59 + "' != '" + 2168.222222222222d + "'", double59 == 2168.222222222222d);
        org.junit.Assert.assertNotNull(doubleArray66);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray66), "[97.0, 100.0]");
        org.junit.Assert.assertTrue("'" + double68 + "' != '" + 4.5d + "'", double68 == 4.5d);
        org.junit.Assert.assertTrue("'" + double69 + "' != '" + 2.25d + "'", double69 == 2.25d);
        org.junit.Assert.assertTrue("'" + double74 + "' != '" + 2.25d + "'", double74 == 2.25d);
    }

    @Test
    public void test1633() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1633");
        org.apache.commons.math.stat.descriptive.moment.Variance variance1 = new org.apache.commons.math.stat.descriptive.moment.Variance(false);
        double[] doubleArray8 = new double[] { (byte) -1, (short) 100, 'a', 0, 1, (-1.0d) };
        double double9 = variance1.evaluate(doubleArray8);
        variance1.setBiasCorrected(true);
        long long12 = variance1.getN();
        variance1.clear();
        variance1.increment((double) (short) -1);
        long long16 = variance1.getN();
        org.apache.commons.math.stat.descriptive.moment.Variance variance18 = new org.apache.commons.math.stat.descriptive.moment.Variance(false);
        double[] doubleArray25 = new double[] { (byte) -1, (short) 100, 'a', 0, 1, (-1.0d) };
        double double26 = variance18.evaluate(doubleArray25);
        variance18.setBiasCorrected(true);
        boolean boolean29 = variance18.isBiasCorrected();
        double[] doubleArray36 = new double[] { (short) 0, 1.0d, 1L, 0.0d, (-1.0d), 10L };
        double double37 = variance18.evaluate(doubleArray36);
        double double38 = variance18.getResult();
        long long39 = variance18.getN();
        org.apache.commons.math.stat.descriptive.moment.Variance variance41 = new org.apache.commons.math.stat.descriptive.moment.Variance(false);
        double[] doubleArray48 = new double[] { (byte) -1, (short) 100, 'a', 0, 1, (-1.0d) };
        double double49 = variance41.evaluate(doubleArray48);
        variance41.setBiasCorrected(true);
        long long52 = variance41.getN();
        variance41.clear();
        org.apache.commons.math.stat.descriptive.moment.Variance variance55 = new org.apache.commons.math.stat.descriptive.moment.Variance(false);
        double[] doubleArray62 = new double[] { (byte) -1, (short) 100, 'a', 0, 1, (-1.0d) };
        double double63 = variance55.evaluate(doubleArray62);
        double double64 = variance41.evaluate(doubleArray62);
        double double65 = variance18.evaluate(doubleArray62);
        org.apache.commons.math.stat.descriptive.moment.Variance variance67 = new org.apache.commons.math.stat.descriptive.moment.Variance(false);
        double[] doubleArray74 = new double[] { (byte) -1, (short) 100, 'a', 0, 1, (-1.0d) };
        double double75 = variance67.evaluate(doubleArray74);
        variance67.clear();
        variance67.setBiasCorrected(true);
        org.apache.commons.math.stat.descriptive.moment.Variance variance80 = new org.apache.commons.math.stat.descriptive.moment.Variance(false);
        variance80.clear();
        double double82 = variance80.getResult();
        double[] doubleArray87 = new double[] { (-1), 2168.222222222222d, 16.566666666418314d, 10.0d };
        variance80.incrementAll(doubleArray87);
        boolean boolean89 = variance67.equals((java.lang.Object) doubleArray87);
        double double91 = variance18.evaluate(doubleArray87, (double) 0L);
        double double93 = variance1.evaluate(doubleArray87, 677378.9558333334d);
        org.junit.Assert.assertNotNull(doubleArray8);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray8), "[-1.0, 100.0, 97.0, 0.0, 1.0, -1.0]");
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 2168.222222222222d + "'", double9 == 2168.222222222222d);
        org.junit.Assert.assertTrue("'" + long12 + "' != '" + 0L + "'", long12 == 0L);
        org.junit.Assert.assertTrue("'" + long16 + "' != '" + 1L + "'", long16 == 1L);
        org.junit.Assert.assertNotNull(doubleArray25);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray25), "[-1.0, 100.0, 97.0, 0.0, 1.0, -1.0]");
        org.junit.Assert.assertTrue("'" + double26 + "' != '" + 2168.222222222222d + "'", double26 == 2168.222222222222d);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + true + "'", boolean29 == true);
        org.junit.Assert.assertNotNull(doubleArray36);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray36), "[0.0, 1.0, 1.0, 0.0, -1.0, 10.0]");
        org.junit.Assert.assertTrue("'" + double37 + "' != '" + 16.566666666666663d + "'", double37 == 16.566666666666663d);
        org.junit.Assert.assertTrue(Double.isNaN(double38));
        org.junit.Assert.assertTrue("'" + long39 + "' != '" + 0L + "'", long39 == 0L);
        org.junit.Assert.assertNotNull(doubleArray48);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray48), "[-1.0, 100.0, 97.0, 0.0, 1.0, -1.0]");
        org.junit.Assert.assertTrue("'" + double49 + "' != '" + 2168.222222222222d + "'", double49 == 2168.222222222222d);
        org.junit.Assert.assertTrue("'" + long52 + "' != '" + 0L + "'", long52 == 0L);
        org.junit.Assert.assertNotNull(doubleArray62);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray62), "[-1.0, 100.0, 97.0, 0.0, 1.0, -1.0]");
        org.junit.Assert.assertTrue("'" + double63 + "' != '" + 2168.222222222222d + "'", double63 == 2168.222222222222d);
        org.junit.Assert.assertTrue("'" + double64 + "' != '" + 2601.866666666667d + "'", double64 == 2601.866666666667d);
        org.junit.Assert.assertTrue("'" + double65 + "' != '" + 2601.866666666667d + "'", double65 == 2601.866666666667d);
        org.junit.Assert.assertNotNull(doubleArray74);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray74), "[-1.0, 100.0, 97.0, 0.0, 1.0, -1.0]");
        org.junit.Assert.assertTrue("'" + double75 + "' != '" + 2168.222222222222d + "'", double75 == 2168.222222222222d);
        org.junit.Assert.assertTrue(Double.isNaN(double82));
        org.junit.Assert.assertNotNull(doubleArray87);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray87), "[-1.0, 2168.222222222222, 16.566666666418314, 10.0]");
        org.junit.Assert.assertTrue("'" + boolean89 + "' != '" + false + "'", boolean89 == false);
        org.junit.Assert.assertTrue("'" + double91 + "' != '" + 1166128.5457099646d + "'", double91 == 1166128.5457099646d);
        org.junit.Assert.assertTrue("'" + double93 + "' != '" + 1166128.5456542969d + "'", double93 == 1166128.5456542969d);
    }

    @Test
    public void test1634() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1634");
        org.apache.commons.math.stat.descriptive.moment.Variance variance1 = new org.apache.commons.math.stat.descriptive.moment.Variance(false);
        double[] doubleArray8 = new double[] { (byte) -1, (short) 100, 'a', 0, 1, (-1.0d) };
        double double9 = variance1.evaluate(doubleArray8);
        variance1.clear();
        variance1.setBiasCorrected(true);
        org.apache.commons.math.stat.descriptive.moment.Variance variance14 = new org.apache.commons.math.stat.descriptive.moment.Variance(false);
        double[] doubleArray21 = new double[] { (byte) -1, (short) 100, 'a', 0, 1, (-1.0d) };
        double double22 = variance14.evaluate(doubleArray21);
        variance14.setBiasCorrected(true);
        org.apache.commons.math.stat.descriptive.moment.Variance variance26 = new org.apache.commons.math.stat.descriptive.moment.Variance(false);
        double[] doubleArray33 = new double[] { (byte) -1, (short) 100, 'a', 0, 1, (-1.0d) };
        double double34 = variance26.evaluate(doubleArray33);
        variance26.setBiasCorrected(true);
        boolean boolean37 = variance26.isBiasCorrected();
        double[] doubleArray44 = new double[] { (short) 0, 1.0d, 1L, 0.0d, (-1.0d), 10L };
        double double45 = variance26.evaluate(doubleArray44);
        double double48 = variance14.evaluate(doubleArray44, (int) (byte) 1, (int) (byte) 0);
        variance1.incrementAll(doubleArray44);
        boolean boolean50 = variance1.isBiasCorrected();
        variance1.setBiasCorrected(true);
        org.junit.Assert.assertNotNull(doubleArray8);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray8), "[-1.0, 100.0, 97.0, 0.0, 1.0, -1.0]");
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 2168.222222222222d + "'", double9 == 2168.222222222222d);
        org.junit.Assert.assertNotNull(doubleArray21);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray21), "[-1.0, 100.0, 97.0, 0.0, 1.0, -1.0]");
        org.junit.Assert.assertTrue("'" + double22 + "' != '" + 2168.222222222222d + "'", double22 == 2168.222222222222d);
        org.junit.Assert.assertNotNull(doubleArray33);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray33), "[-1.0, 100.0, 97.0, 0.0, 1.0, -1.0]");
        org.junit.Assert.assertTrue("'" + double34 + "' != '" + 2168.222222222222d + "'", double34 == 2168.222222222222d);
        org.junit.Assert.assertTrue("'" + boolean37 + "' != '" + true + "'", boolean37 == true);
        org.junit.Assert.assertNotNull(doubleArray44);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray44), "[0.0, 1.0, 1.0, 0.0, -1.0, 10.0]");
        org.junit.Assert.assertTrue("'" + double45 + "' != '" + 16.566666666666663d + "'", double45 == 16.566666666666663d);
        org.junit.Assert.assertTrue(Double.isNaN(double48));
        org.junit.Assert.assertTrue("'" + boolean50 + "' != '" + true + "'", boolean50 == true);
    }

    @Test
    public void test1635() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1635");
        org.apache.commons.math.stat.descriptive.moment.Variance variance1 = new org.apache.commons.math.stat.descriptive.moment.Variance(false);
        double[] doubleArray8 = new double[] { (byte) -1, (short) 100, 'a', 0, 1, (-1.0d) };
        double double9 = variance1.evaluate(doubleArray8);
        variance1.setBiasCorrected(true);
        boolean boolean12 = variance1.isBiasCorrected();
        double[] doubleArray19 = new double[] { (short) 0, 1.0d, 1L, 0.0d, (-1.0d), 10L };
        double double20 = variance1.evaluate(doubleArray19);
        boolean boolean22 = variance1.equals((java.lang.Object) 10.0d);
        boolean boolean23 = variance1.isBiasCorrected();
        double double24 = variance1.getResult();
        variance1.increment(6.25d);
        long long27 = variance1.getN();
        org.junit.Assert.assertNotNull(doubleArray8);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray8), "[-1.0, 100.0, 97.0, 0.0, 1.0, -1.0]");
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 2168.222222222222d + "'", double9 == 2168.222222222222d);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertNotNull(doubleArray19);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray19), "[0.0, 1.0, 1.0, 0.0, -1.0, 10.0]");
        org.junit.Assert.assertTrue("'" + double20 + "' != '" + 16.566666666666663d + "'", double20 == 16.566666666666663d);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + true + "'", boolean23 == true);
        org.junit.Assert.assertTrue(Double.isNaN(double24));
        org.junit.Assert.assertTrue("'" + long27 + "' != '" + 1L + "'", long27 == 1L);
    }

    @Test
    public void test1636() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1636");
        org.apache.commons.math.stat.descriptive.moment.Variance variance1 = new org.apache.commons.math.stat.descriptive.moment.Variance(false);
        double[] doubleArray8 = new double[] { (byte) -1, (short) 100, 'a', 0, 1, (-1.0d) };
        double double9 = variance1.evaluate(doubleArray8);
        variance1.setBiasCorrected(true);
        long long12 = variance1.getN();
        long long13 = variance1.getN();
        boolean boolean14 = variance1.isBiasCorrected();
        org.apache.commons.math.stat.descriptive.moment.Variance variance16 = new org.apache.commons.math.stat.descriptive.moment.Variance(false);
        double[] doubleArray23 = new double[] { (byte) -1, (short) 100, 'a', 0, 1, (-1.0d) };
        double double24 = variance16.evaluate(doubleArray23);
        double[] doubleArray28 = new double[] { (byte) 1, (byte) 100, 1L };
        double double29 = variance16.evaluate(doubleArray28);
        variance1.incrementAll(doubleArray28, (int) (short) 1, 0);
        org.apache.commons.math.stat.descriptive.moment.Variance variance34 = new org.apache.commons.math.stat.descriptive.moment.Variance(true);
        double double35 = variance34.getResult();
        double double36 = variance34.getResult();
        variance34.clear();
        org.apache.commons.math.stat.descriptive.moment.Variance variance39 = new org.apache.commons.math.stat.descriptive.moment.Variance(false);
        double[] doubleArray46 = new double[] { (byte) -1, (short) 100, 'a', 0, 1, (-1.0d) };
        double double47 = variance39.evaluate(doubleArray46);
        variance39.setBiasCorrected(true);
        long long50 = variance39.getN();
        long long51 = variance39.getN();
        boolean boolean52 = variance39.isBiasCorrected();
        org.apache.commons.math.stat.descriptive.moment.Variance variance54 = new org.apache.commons.math.stat.descriptive.moment.Variance(false);
        double[] doubleArray61 = new double[] { (byte) -1, (short) 100, 'a', 0, 1, (-1.0d) };
        double double62 = variance54.evaluate(doubleArray61);
        double[] doubleArray66 = new double[] { (byte) 1, (byte) 100, 1L };
        double double67 = variance54.evaluate(doubleArray66);
        variance39.incrementAll(doubleArray66, (int) (short) 1, 0);
        variance34.incrementAll(doubleArray66);
        variance1.incrementAll(doubleArray66);
        boolean boolean73 = variance1.isBiasCorrected();
        org.junit.Assert.assertNotNull(doubleArray8);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray8), "[-1.0, 100.0, 97.0, 0.0, 1.0, -1.0]");
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 2168.222222222222d + "'", double9 == 2168.222222222222d);
        org.junit.Assert.assertTrue("'" + long12 + "' != '" + 0L + "'", long12 == 0L);
        org.junit.Assert.assertTrue("'" + long13 + "' != '" + 0L + "'", long13 == 0L);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertNotNull(doubleArray23);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray23), "[-1.0, 100.0, 97.0, 0.0, 1.0, -1.0]");
        org.junit.Assert.assertTrue("'" + double24 + "' != '" + 2168.222222222222d + "'", double24 == 2168.222222222222d);
        org.junit.Assert.assertNotNull(doubleArray28);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray28), "[1.0, 100.0, 1.0]");
        org.junit.Assert.assertTrue("'" + double29 + "' != '" + 2178.0d + "'", double29 == 2178.0d);
        org.junit.Assert.assertTrue(Double.isNaN(double35));
        org.junit.Assert.assertTrue(Double.isNaN(double36));
        org.junit.Assert.assertNotNull(doubleArray46);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray46), "[-1.0, 100.0, 97.0, 0.0, 1.0, -1.0]");
        org.junit.Assert.assertTrue("'" + double47 + "' != '" + 2168.222222222222d + "'", double47 == 2168.222222222222d);
        org.junit.Assert.assertTrue("'" + long50 + "' != '" + 0L + "'", long50 == 0L);
        org.junit.Assert.assertTrue("'" + long51 + "' != '" + 0L + "'", long51 == 0L);
        org.junit.Assert.assertTrue("'" + boolean52 + "' != '" + true + "'", boolean52 == true);
        org.junit.Assert.assertNotNull(doubleArray61);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray61), "[-1.0, 100.0, 97.0, 0.0, 1.0, -1.0]");
        org.junit.Assert.assertTrue("'" + double62 + "' != '" + 2168.222222222222d + "'", double62 == 2168.222222222222d);
        org.junit.Assert.assertNotNull(doubleArray66);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray66), "[1.0, 100.0, 1.0]");
        org.junit.Assert.assertTrue("'" + double67 + "' != '" + 2178.0d + "'", double67 == 2178.0d);
        org.junit.Assert.assertTrue("'" + boolean73 + "' != '" + true + "'", boolean73 == true);
    }

    @Test
    public void test1637() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1637");
        org.apache.commons.math.stat.descriptive.moment.Variance variance1 = new org.apache.commons.math.stat.descriptive.moment.Variance(true);
        double double2 = variance1.getResult();
        org.apache.commons.math.stat.descriptive.moment.Variance variance4 = new org.apache.commons.math.stat.descriptive.moment.Variance(false);
        double[] doubleArray11 = new double[] { (byte) -1, (short) 100, 'a', 0, 1, (-1.0d) };
        double double12 = variance4.evaluate(doubleArray11);
        variance4.setBiasCorrected(true);
        boolean boolean15 = variance4.isBiasCorrected();
        double[] doubleArray22 = new double[] { (short) 0, 1.0d, 1L, 0.0d, (-1.0d), 10L };
        double double23 = variance4.evaluate(doubleArray22);
        boolean boolean25 = variance4.equals((java.lang.Object) 10.0d);
        boolean boolean26 = variance4.isBiasCorrected();
        org.apache.commons.math.stat.descriptive.moment.Variance variance28 = new org.apache.commons.math.stat.descriptive.moment.Variance(false);
        boolean boolean29 = variance4.equals((java.lang.Object) false);
        org.apache.commons.math.stat.descriptive.moment.Variance variance31 = new org.apache.commons.math.stat.descriptive.moment.Variance(false);
        double[] doubleArray38 = new double[] { (byte) -1, (short) 100, 'a', 0, 1, (-1.0d) };
        double double39 = variance31.evaluate(doubleArray38);
        variance31.setBiasCorrected(true);
        org.apache.commons.math.stat.descriptive.moment.Variance variance43 = new org.apache.commons.math.stat.descriptive.moment.Variance(false);
        double[] doubleArray50 = new double[] { (byte) -1, (short) 100, 'a', 0, 1, (-1.0d) };
        double double51 = variance43.evaluate(doubleArray50);
        variance31.incrementAll(doubleArray50);
        double double54 = variance4.evaluate(doubleArray50, (double) 100.0f);
        long long55 = variance4.getN();
        long long56 = variance4.getN();
        variance4.setBiasCorrected(false);
        boolean boolean59 = variance1.equals((java.lang.Object) variance4);
        variance1.setBiasCorrected(false);
        variance1.setBiasCorrected(false);
        org.junit.Assert.assertTrue(Double.isNaN(double2));
        org.junit.Assert.assertNotNull(doubleArray11);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray11), "[-1.0, 100.0, 97.0, 0.0, 1.0, -1.0]");
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 2168.222222222222d + "'", double12 == 2168.222222222222d);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertNotNull(doubleArray22);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray22), "[0.0, 1.0, 1.0, 0.0, -1.0, 10.0]");
        org.junit.Assert.assertTrue("'" + double23 + "' != '" + 16.566666666666663d + "'", double23 == 16.566666666666663d);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + true + "'", boolean26 == true);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + false + "'", boolean29 == false);
        org.junit.Assert.assertNotNull(doubleArray38);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray38), "[-1.0, 100.0, 97.0, 0.0, 1.0, -1.0]");
        org.junit.Assert.assertTrue("'" + double39 + "' != '" + 2168.222222222222d + "'", double39 == 2168.222222222222d);
        org.junit.Assert.assertNotNull(doubleArray50);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray50), "[-1.0, 100.0, 97.0, 0.0, 1.0, -1.0]");
        org.junit.Assert.assertTrue("'" + double51 + "' != '" + 2168.222222222222d + "'", double51 == 2168.222222222222d);
        org.junit.Assert.assertTrue("'" + double54 + "' != '" + 2601.8666666666663d + "'", double54 == 2601.8666666666663d);
        org.junit.Assert.assertTrue("'" + long55 + "' != '" + 0L + "'", long55 == 0L);
        org.junit.Assert.assertTrue("'" + long56 + "' != '" + 0L + "'", long56 == 0L);
        org.junit.Assert.assertTrue("'" + boolean59 + "' != '" + true + "'", boolean59 == true);
    }

    @Test
    public void test1638() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1638");
        org.apache.commons.math.stat.descriptive.moment.Variance variance1 = new org.apache.commons.math.stat.descriptive.moment.Variance(false);
        double[] doubleArray8 = new double[] { (byte) -1, (short) 100, 'a', 0, 1, (-1.0d) };
        double double9 = variance1.evaluate(doubleArray8);
        variance1.setBiasCorrected(true);
        boolean boolean12 = variance1.isBiasCorrected();
        double double13 = variance1.getResult();
        variance1.setBiasCorrected(false);
        variance1.clear();
        double double17 = variance1.getResult();
        org.junit.Assert.assertNotNull(doubleArray8);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray8), "[-1.0, 100.0, 97.0, 0.0, 1.0, -1.0]");
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 2168.222222222222d + "'", double9 == 2168.222222222222d);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertTrue(Double.isNaN(double13));
        org.junit.Assert.assertTrue(Double.isNaN(double17));
    }

    @Test
    public void test1639() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1639");
        org.apache.commons.math.stat.descriptive.moment.Variance variance1 = new org.apache.commons.math.stat.descriptive.moment.Variance(false);
        double[] doubleArray8 = new double[] { (byte) -1, (short) 100, 'a', 0, 1, (-1.0d) };
        double double9 = variance1.evaluate(doubleArray8);
        double[] doubleArray13 = new double[] { (byte) 1, (byte) 100, 1L };
        double double14 = variance1.evaluate(doubleArray13);
        variance1.increment((double) (byte) 100);
        variance1.increment(16.566666666667153d);
        variance1.clear();
        org.junit.Assert.assertNotNull(doubleArray8);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray8), "[-1.0, 100.0, 97.0, 0.0, 1.0, -1.0]");
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 2168.222222222222d + "'", double9 == 2168.222222222222d);
        org.junit.Assert.assertNotNull(doubleArray13);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray13), "[1.0, 100.0, 1.0]");
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + 2178.0d + "'", double14 == 2178.0d);
    }

    @Test
    public void test1640() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1640");
        org.apache.commons.math.stat.descriptive.moment.Variance variance1 = new org.apache.commons.math.stat.descriptive.moment.Variance(false);
        double[] doubleArray8 = new double[] { (byte) -1, (short) 100, 'a', 0, 1, (-1.0d) };
        double double9 = variance1.evaluate(doubleArray8);
        variance1.setBiasCorrected(true);
        org.apache.commons.math.stat.descriptive.moment.Variance variance13 = new org.apache.commons.math.stat.descriptive.moment.Variance(false);
        double[] doubleArray20 = new double[] { (byte) -1, (short) 100, 'a', 0, 1, (-1.0d) };
        double double21 = variance13.evaluate(doubleArray20);
        variance1.incrementAll(doubleArray20);
        variance1.clear();
        org.apache.commons.math.stat.descriptive.moment.Variance variance25 = new org.apache.commons.math.stat.descriptive.moment.Variance(false);
        double[] doubleArray32 = new double[] { (byte) -1, (short) 100, 'a', 0, 1, (-1.0d) };
        double double33 = variance25.evaluate(doubleArray32);
        double[] doubleArray37 = new double[] { (byte) 1, (byte) 100, 1L };
        double double38 = variance25.evaluate(doubleArray37);
        variance1.incrementAll(doubleArray37, (int) (byte) 0, (int) (byte) 1);
        long long42 = variance1.getN();
        boolean boolean43 = variance1.isBiasCorrected();
        boolean boolean44 = variance1.isBiasCorrected();
        variance1.setBiasCorrected(true);
        variance1.setBiasCorrected(false);
        org.junit.Assert.assertNotNull(doubleArray8);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray8), "[-1.0, 100.0, 97.0, 0.0, 1.0, -1.0]");
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 2168.222222222222d + "'", double9 == 2168.222222222222d);
        org.junit.Assert.assertNotNull(doubleArray20);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray20), "[-1.0, 100.0, 97.0, 0.0, 1.0, -1.0]");
        org.junit.Assert.assertTrue("'" + double21 + "' != '" + 2168.222222222222d + "'", double21 == 2168.222222222222d);
        org.junit.Assert.assertNotNull(doubleArray32);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray32), "[-1.0, 100.0, 97.0, 0.0, 1.0, -1.0]");
        org.junit.Assert.assertTrue("'" + double33 + "' != '" + 2168.222222222222d + "'", double33 == 2168.222222222222d);
        org.junit.Assert.assertNotNull(doubleArray37);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray37), "[1.0, 100.0, 1.0]");
        org.junit.Assert.assertTrue("'" + double38 + "' != '" + 2178.0d + "'", double38 == 2178.0d);
        org.junit.Assert.assertTrue("'" + long42 + "' != '" + 1L + "'", long42 == 1L);
        org.junit.Assert.assertTrue("'" + boolean43 + "' != '" + true + "'", boolean43 == true);
        org.junit.Assert.assertTrue("'" + boolean44 + "' != '" + true + "'", boolean44 == true);
    }

    @Test
    public void test1641() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1641");
        org.apache.commons.math.stat.descriptive.moment.SecondMoment secondMoment1 = null;
        org.apache.commons.math.stat.descriptive.moment.Variance variance2 = new org.apache.commons.math.stat.descriptive.moment.Variance(true, secondMoment1);
        double[] doubleArray3 = new double[] {};
        double double6 = variance2.evaluate(doubleArray3, 0, 0);
        variance2.setBiasCorrected(true);
        boolean boolean9 = variance2.isBiasCorrected();
        org.junit.Assert.assertNotNull(doubleArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray3), "[]");
        org.junit.Assert.assertTrue(Double.isNaN(double6));
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
    }
}

