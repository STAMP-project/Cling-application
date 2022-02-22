import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class RegressionTest27 {

    public static boolean debug = false;

    @Test
    public void test13501() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest27.test13501");
        org.apache.commons.math.stat.descriptive.moment.SecondMoment secondMoment0 = new org.apache.commons.math.stat.descriptive.moment.SecondMoment();
        secondMoment0.increment(1.0d);
        double[] doubleArray6 = new double[] { (-1L), 0, 10L };
        secondMoment0.incrementAll(doubleArray6, 0, 0);
        org.apache.commons.math.stat.descriptive.moment.Variance variance10 = new org.apache.commons.math.stat.descriptive.moment.Variance(secondMoment0);
        org.apache.commons.math.stat.descriptive.moment.SecondMoment secondMoment11 = new org.apache.commons.math.stat.descriptive.moment.SecondMoment();
        secondMoment11.increment((double) ' ');
        secondMoment11.increment((double) (-1.0f));
        secondMoment11.clear();
        boolean boolean17 = variance10.equals((java.lang.Object) secondMoment11);
        long long18 = secondMoment11.getN();
        org.apache.commons.math.stat.descriptive.moment.Variance variance19 = new org.apache.commons.math.stat.descriptive.moment.Variance(secondMoment11);
        variance19.setBiasCorrected(true);
        double double22 = variance19.getResult();
        variance19.setBiasCorrected(false);
        boolean boolean25 = variance19.isBiasCorrected();
        org.apache.commons.math.stat.descriptive.moment.SecondMoment secondMoment27 = new org.apache.commons.math.stat.descriptive.moment.SecondMoment();
        secondMoment27.increment(1.0d);
        secondMoment27.increment((double) (short) 0);
        long long32 = secondMoment27.getN();
        org.apache.commons.math.stat.descriptive.moment.Variance variance33 = new org.apache.commons.math.stat.descriptive.moment.Variance(false, secondMoment27);
        long long34 = variance33.getN();
        variance33.clear();
        org.apache.commons.math.stat.descriptive.moment.Variance variance37 = new org.apache.commons.math.stat.descriptive.moment.Variance(true);
        long long38 = variance37.getN();
        org.apache.commons.math.stat.descriptive.moment.SecondMoment secondMoment39 = new org.apache.commons.math.stat.descriptive.moment.SecondMoment();
        secondMoment39.increment(1.0d);
        secondMoment39.increment((double) (short) 0);
        double double44 = secondMoment39.getResult();
        org.apache.commons.math.stat.descriptive.moment.SecondMoment secondMoment45 = new org.apache.commons.math.stat.descriptive.moment.SecondMoment();
        secondMoment45.increment(1.0d);
        double[] doubleArray51 = new double[] { (-1L), 0, 10L };
        secondMoment45.incrementAll(doubleArray51, 0, 0);
        double double55 = secondMoment39.evaluate(doubleArray51);
        variance37.incrementAll(doubleArray51);
        double double58 = variance33.evaluate(doubleArray51, (double) (short) -1);
        // The following exception was thrown during execution in test generation
        try {
            variance19.incrementAll(doubleArray51, (int) (short) 100, (int) (byte) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: length cannot be negative");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(doubleArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray6), "[-1.0, 0.0, 10.0]");
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertTrue("'" + long18 + "' != '" + 0L + "'", long18 == 0L);
        org.junit.Assert.assertTrue(Double.isNaN(double22));
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
        org.junit.Assert.assertTrue("'" + long32 + "' != '" + 2L + "'", long32 == 2L);
        org.junit.Assert.assertTrue("'" + long34 + "' != '" + 2L + "'", long34 == 2L);
        org.junit.Assert.assertTrue("'" + long38 + "' != '" + 0L + "'", long38 == 0L);
        org.junit.Assert.assertTrue("'" + double44 + "' != '" + 0.5d + "'", double44 == 0.5d);
        org.junit.Assert.assertNotNull(doubleArray51);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray51), "[-1.0, 0.0, 10.0]");
        org.junit.Assert.assertTrue("'" + double55 + "' != '" + 74.0d + "'", double55 == 74.0d);
        org.junit.Assert.assertTrue("'" + double58 + "' != '" + 24.666666666666668d + "'", double58 == 24.666666666666668d);
    }

    @Test
    public void test13502() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest27.test13502");
        org.apache.commons.math.stat.descriptive.moment.SecondMoment secondMoment0 = new org.apache.commons.math.stat.descriptive.moment.SecondMoment();
        secondMoment0.increment(1.0d);
        secondMoment0.increment((double) (short) 0);
        double double5 = secondMoment0.getResult();
        org.apache.commons.math.stat.descriptive.moment.SecondMoment secondMoment6 = new org.apache.commons.math.stat.descriptive.moment.SecondMoment();
        secondMoment6.increment(1.0d);
        secondMoment6.increment((double) (short) 0);
        double double11 = secondMoment6.getResult();
        org.apache.commons.math.stat.descriptive.moment.SecondMoment secondMoment12 = new org.apache.commons.math.stat.descriptive.moment.SecondMoment();
        secondMoment12.increment(1.0d);
        double[] doubleArray18 = new double[] { (-1L), 0, 10L };
        secondMoment12.incrementAll(doubleArray18, 0, 0);
        double double22 = secondMoment6.evaluate(doubleArray18);
        double[] doubleArray23 = new double[] {};
        secondMoment6.incrementAll(doubleArray23);
        secondMoment0.incrementAll(doubleArray23);
        secondMoment0.increment((double) 2L);
        org.apache.commons.math.stat.descriptive.moment.Variance variance28 = new org.apache.commons.math.stat.descriptive.moment.Variance(secondMoment0);
        org.apache.commons.math.stat.descriptive.moment.SecondMoment secondMoment29 = new org.apache.commons.math.stat.descriptive.moment.SecondMoment();
        secondMoment29.increment(1.0d);
        double[] doubleArray35 = new double[] { (-1L), 0, 10L };
        secondMoment29.incrementAll(doubleArray35, 0, 0);
        double[] doubleArray41 = new double[] { 10, (byte) 100 };
        double double42 = secondMoment29.evaluate(doubleArray41);
        double double43 = variance28.evaluate(doubleArray41);
        long long44 = variance28.getN();
        double double45 = variance28.getResult();
        variance28.increment(7142.8d);
        variance28.increment(1.8756123185185187E7d);
        variance28.setBiasCorrected(false);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.5d + "'", double5 == 0.5d);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 0.5d + "'", double11 == 0.5d);
        org.junit.Assert.assertNotNull(doubleArray18);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray18), "[-1.0, 0.0, 10.0]");
        org.junit.Assert.assertTrue("'" + double22 + "' != '" + 74.0d + "'", double22 == 74.0d);
        org.junit.Assert.assertNotNull(doubleArray23);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray23), "[]");
        org.junit.Assert.assertNotNull(doubleArray35);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray35), "[-1.0, 0.0, 10.0]");
        org.junit.Assert.assertNotNull(doubleArray41);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray41), "[10.0, 100.0]");
        org.junit.Assert.assertTrue("'" + double42 + "' != '" + 4050.0d + "'", double42 == 4050.0d);
        org.junit.Assert.assertTrue("'" + double43 + "' != '" + 4050.0d + "'", double43 == 4050.0d);
        org.junit.Assert.assertTrue("'" + long44 + "' != '" + 3L + "'", long44 == 3L);
        org.junit.Assert.assertTrue("'" + double45 + "' != '" + 1.0d + "'", double45 == 1.0d);
    }

    @Test
    public void test13503() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest27.test13503");
        org.apache.commons.math.stat.descriptive.moment.Variance variance1 = new org.apache.commons.math.stat.descriptive.moment.Variance(true);
        long long2 = variance1.getN();
        org.apache.commons.math.stat.descriptive.moment.SecondMoment secondMoment3 = new org.apache.commons.math.stat.descriptive.moment.SecondMoment();
        secondMoment3.increment(1.0d);
        secondMoment3.increment((double) (short) 0);
        double double8 = secondMoment3.getResult();
        org.apache.commons.math.stat.descriptive.moment.SecondMoment secondMoment9 = new org.apache.commons.math.stat.descriptive.moment.SecondMoment();
        secondMoment9.increment(1.0d);
        double[] doubleArray15 = new double[] { (-1L), 0, 10L };
        secondMoment9.incrementAll(doubleArray15, 0, 0);
        double double19 = secondMoment3.evaluate(doubleArray15);
        variance1.incrementAll(doubleArray15);
        long long21 = variance1.getN();
        double double22 = variance1.getResult();
        double[] doubleArray23 = null;
        // The following exception was thrown during execution in test generation
        try {
            double double25 = variance1.evaluate(doubleArray23, 25.666666666666668d);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 0L + "'", long2 == 0L);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 0.5d + "'", double8 == 0.5d);
        org.junit.Assert.assertNotNull(doubleArray15);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray15), "[-1.0, 0.0, 10.0]");
        org.junit.Assert.assertTrue("'" + double19 + "' != '" + 74.0d + "'", double19 == 74.0d);
        org.junit.Assert.assertTrue("'" + long21 + "' != '" + 3L + "'", long21 == 3L);
        org.junit.Assert.assertTrue("'" + double22 + "' != '" + 37.0d + "'", double22 == 37.0d);
    }

    @Test
    public void test13504() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest27.test13504");
        org.apache.commons.math.stat.descriptive.moment.SecondMoment secondMoment0 = new org.apache.commons.math.stat.descriptive.moment.SecondMoment();
        secondMoment0.increment(1.0d);
        secondMoment0.increment((double) (short) 0);
        secondMoment0.increment(74.0d);
        double double7 = secondMoment0.getResult();
        secondMoment0.increment(7077.0d);
        secondMoment0.clear();
        org.apache.commons.math.stat.descriptive.moment.SecondMoment secondMoment11 = new org.apache.commons.math.stat.descriptive.moment.SecondMoment();
        secondMoment11.increment(1.0d);
        secondMoment11.increment((double) (short) 0);
        double double16 = secondMoment11.getResult();
        org.apache.commons.math.stat.descriptive.moment.SecondMoment secondMoment17 = new org.apache.commons.math.stat.descriptive.moment.SecondMoment();
        secondMoment17.increment(1.0d);
        secondMoment17.increment((double) (short) 0);
        double double22 = secondMoment17.getResult();
        org.apache.commons.math.stat.descriptive.moment.SecondMoment secondMoment23 = new org.apache.commons.math.stat.descriptive.moment.SecondMoment();
        secondMoment23.increment(1.0d);
        double[] doubleArray29 = new double[] { (-1L), 0, 10L };
        secondMoment23.incrementAll(doubleArray29, 0, 0);
        double double33 = secondMoment17.evaluate(doubleArray29);
        double[] doubleArray34 = new double[] {};
        secondMoment17.incrementAll(doubleArray34);
        secondMoment11.incrementAll(doubleArray34);
        secondMoment11.increment((double) 2L);
        double double39 = secondMoment11.getResult();
        boolean boolean40 = secondMoment0.equals((java.lang.Object) secondMoment11);
        secondMoment11.increment(3.3919362E7d);
        secondMoment11.clear();
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 3602.0d + "'", double7 == 3602.0d);
        org.junit.Assert.assertTrue("'" + double16 + "' != '" + 0.5d + "'", double16 == 0.5d);
        org.junit.Assert.assertTrue("'" + double22 + "' != '" + 0.5d + "'", double22 == 0.5d);
        org.junit.Assert.assertNotNull(doubleArray29);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray29), "[-1.0, 0.0, 10.0]");
        org.junit.Assert.assertTrue("'" + double33 + "' != '" + 74.0d + "'", double33 == 74.0d);
        org.junit.Assert.assertNotNull(doubleArray34);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray34), "[]");
        org.junit.Assert.assertTrue("'" + double39 + "' != '" + 2.0d + "'", double39 == 2.0d);
        org.junit.Assert.assertTrue("'" + boolean40 + "' != '" + false + "'", boolean40 == false);
    }

    @Test
    public void test13505() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest27.test13505");
        org.apache.commons.math.stat.descriptive.moment.SecondMoment secondMoment1 = new org.apache.commons.math.stat.descriptive.moment.SecondMoment();
        secondMoment1.increment((double) ' ');
        secondMoment1.increment((double) (-1.0f));
        secondMoment1.clear();
        org.apache.commons.math.stat.descriptive.moment.SecondMoment secondMoment7 = new org.apache.commons.math.stat.descriptive.moment.SecondMoment();
        secondMoment7.increment(1.0d);
        double[] doubleArray13 = new double[] { (-1L), 0, 10L };
        secondMoment7.incrementAll(doubleArray13, 0, 0);
        org.apache.commons.math.stat.descriptive.moment.Variance variance17 = new org.apache.commons.math.stat.descriptive.moment.Variance(secondMoment7);
        long long18 = variance17.getN();
        org.apache.commons.math.stat.descriptive.moment.SecondMoment secondMoment19 = new org.apache.commons.math.stat.descriptive.moment.SecondMoment();
        secondMoment19.increment(1.0d);
        double[] doubleArray25 = new double[] { (-1L), 0, 10L };
        secondMoment19.incrementAll(doubleArray25, 0, 0);
        double double30 = variance17.evaluate(doubleArray25, (double) (short) -1);
        double double31 = secondMoment1.evaluate(doubleArray25);
        org.apache.commons.math.stat.descriptive.moment.Variance variance32 = new org.apache.commons.math.stat.descriptive.moment.Variance(secondMoment1);
        double double33 = secondMoment1.getResult();
        org.apache.commons.math.stat.descriptive.moment.Variance variance34 = new org.apache.commons.math.stat.descriptive.moment.Variance(secondMoment1);
        org.apache.commons.math.stat.descriptive.moment.Variance variance35 = new org.apache.commons.math.stat.descriptive.moment.Variance(false, secondMoment1);
        long long36 = variance35.getN();
        long long37 = variance35.getN();
        org.apache.commons.math.stat.descriptive.moment.SecondMoment secondMoment38 = new org.apache.commons.math.stat.descriptive.moment.SecondMoment();
        secondMoment38.increment((double) ' ');
        secondMoment38.increment((double) (-1.0f));
        double double43 = secondMoment38.getResult();
        secondMoment38.clear();
        org.apache.commons.math.stat.descriptive.moment.Variance variance45 = new org.apache.commons.math.stat.descriptive.moment.Variance(secondMoment38);
        double double46 = variance45.getResult();
        org.apache.commons.math.stat.descriptive.moment.Variance variance48 = new org.apache.commons.math.stat.descriptive.moment.Variance(true);
        long long49 = variance48.getN();
        org.apache.commons.math.stat.descriptive.moment.SecondMoment secondMoment50 = new org.apache.commons.math.stat.descriptive.moment.SecondMoment();
        secondMoment50.increment(1.0d);
        secondMoment50.increment((double) (short) 0);
        double double55 = secondMoment50.getResult();
        org.apache.commons.math.stat.descriptive.moment.SecondMoment secondMoment56 = new org.apache.commons.math.stat.descriptive.moment.SecondMoment();
        secondMoment56.increment(1.0d);
        double[] doubleArray62 = new double[] { (-1L), 0, 10L };
        secondMoment56.incrementAll(doubleArray62, 0, 0);
        double double66 = secondMoment50.evaluate(doubleArray62);
        variance48.incrementAll(doubleArray62);
        double double68 = variance45.evaluate(doubleArray62);
        boolean boolean69 = variance45.isBiasCorrected();
        org.apache.commons.math.stat.descriptive.moment.SecondMoment secondMoment70 = new org.apache.commons.math.stat.descriptive.moment.SecondMoment();
        secondMoment70.increment(1.0d);
        org.apache.commons.math.stat.descriptive.moment.SecondMoment secondMoment73 = new org.apache.commons.math.stat.descriptive.moment.SecondMoment();
        secondMoment73.increment(1.0d);
        secondMoment73.increment((double) (short) 0);
        double double78 = secondMoment73.getResult();
        org.apache.commons.math.stat.descriptive.moment.SecondMoment secondMoment79 = new org.apache.commons.math.stat.descriptive.moment.SecondMoment();
        secondMoment79.increment(1.0d);
        double[] doubleArray85 = new double[] { (-1L), 0, 10L };
        secondMoment79.incrementAll(doubleArray85, 0, 0);
        double double89 = secondMoment73.evaluate(doubleArray85);
        double[] doubleArray90 = new double[] {};
        secondMoment73.incrementAll(doubleArray90);
        double double92 = secondMoment70.evaluate(doubleArray90);
        double double94 = variance45.evaluate(doubleArray90, 1779.8518518518517d);
        // The following exception was thrown during execution in test generation
        try {
            double double97 = variance35.evaluate(doubleArray90, (int) (byte) 100, 100);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: begin + length > values.length");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(doubleArray13);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray13), "[-1.0, 0.0, 10.0]");
        org.junit.Assert.assertTrue("'" + long18 + "' != '" + 1L + "'", long18 == 1L);
        org.junit.Assert.assertNotNull(doubleArray25);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray25), "[-1.0, 0.0, 10.0]");
        org.junit.Assert.assertTrue("'" + double30 + "' != '" + 37.0d + "'", double30 == 37.0d);
        org.junit.Assert.assertTrue("'" + double31 + "' != '" + 74.0d + "'", double31 == 74.0d);
        org.junit.Assert.assertTrue("'" + double33 + "' != '" + 74.0d + "'", double33 == 74.0d);
        org.junit.Assert.assertTrue("'" + long36 + "' != '" + 3L + "'", long36 == 3L);
        org.junit.Assert.assertTrue("'" + long37 + "' != '" + 3L + "'", long37 == 3L);
        org.junit.Assert.assertTrue("'" + double43 + "' != '" + 544.5d + "'", double43 == 544.5d);
        org.junit.Assert.assertTrue(Double.isNaN(double46));
        org.junit.Assert.assertTrue("'" + long49 + "' != '" + 0L + "'", long49 == 0L);
        org.junit.Assert.assertTrue("'" + double55 + "' != '" + 0.5d + "'", double55 == 0.5d);
        org.junit.Assert.assertNotNull(doubleArray62);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray62), "[-1.0, 0.0, 10.0]");
        org.junit.Assert.assertTrue("'" + double66 + "' != '" + 74.0d + "'", double66 == 74.0d);
        org.junit.Assert.assertTrue("'" + double68 + "' != '" + 37.0d + "'", double68 == 37.0d);
        org.junit.Assert.assertTrue("'" + boolean69 + "' != '" + true + "'", boolean69 == true);
        org.junit.Assert.assertTrue("'" + double78 + "' != '" + 0.5d + "'", double78 == 0.5d);
        org.junit.Assert.assertNotNull(doubleArray85);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray85), "[-1.0, 0.0, 10.0]");
        org.junit.Assert.assertTrue("'" + double89 + "' != '" + 74.0d + "'", double89 == 74.0d);
        org.junit.Assert.assertNotNull(doubleArray90);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray90), "[]");
        org.junit.Assert.assertTrue("'" + double92 + "' != '" + 0.0d + "'", double92 == 0.0d);
        org.junit.Assert.assertTrue(Double.isNaN(double94));
    }

    @Test
    public void test13506() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest27.test13506");
        org.apache.commons.math.stat.descriptive.moment.Variance variance0 = new org.apache.commons.math.stat.descriptive.moment.Variance();
        org.apache.commons.math.stat.descriptive.moment.SecondMoment secondMoment1 = new org.apache.commons.math.stat.descriptive.moment.SecondMoment();
        secondMoment1.increment(1.0d);
        secondMoment1.increment((double) (short) 0);
        double double6 = secondMoment1.getResult();
        org.apache.commons.math.stat.descriptive.moment.SecondMoment secondMoment7 = new org.apache.commons.math.stat.descriptive.moment.SecondMoment();
        secondMoment7.increment(1.0d);
        double[] doubleArray13 = new double[] { (-1L), 0, 10L };
        secondMoment7.incrementAll(doubleArray13, 0, 0);
        double double17 = secondMoment1.evaluate(doubleArray13);
        double[] doubleArray18 = new double[] {};
        secondMoment1.incrementAll(doubleArray18);
        double double22 = variance0.evaluate(doubleArray18, (int) (byte) 0, 0);
        long long23 = variance0.getN();
        org.apache.commons.math.stat.descriptive.moment.SecondMoment secondMoment24 = new org.apache.commons.math.stat.descriptive.moment.SecondMoment();
        secondMoment24.increment(1.0d);
        secondMoment24.increment((double) (short) 0);
        double double29 = secondMoment24.getResult();
        org.apache.commons.math.stat.descriptive.moment.SecondMoment secondMoment30 = new org.apache.commons.math.stat.descriptive.moment.SecondMoment();
        secondMoment30.increment(1.0d);
        double[] doubleArray36 = new double[] { (-1L), 0, 10L };
        secondMoment30.incrementAll(doubleArray36, 0, 0);
        double double40 = secondMoment24.evaluate(doubleArray36);
        variance0.incrementAll(doubleArray36);
        long long42 = variance0.getN();
        org.apache.commons.math.stat.descriptive.moment.SecondMoment secondMoment43 = new org.apache.commons.math.stat.descriptive.moment.SecondMoment();
        secondMoment43.increment(1.0d);
        secondMoment43.increment((double) (short) 0);
        double double48 = secondMoment43.getResult();
        org.apache.commons.math.stat.descriptive.moment.SecondMoment secondMoment49 = new org.apache.commons.math.stat.descriptive.moment.SecondMoment();
        secondMoment49.increment(1.0d);
        double[] doubleArray55 = new double[] { (-1L), 0, 10L };
        secondMoment49.incrementAll(doubleArray55, 0, 0);
        double double59 = secondMoment43.evaluate(doubleArray55);
        double[] doubleArray60 = new double[] {};
        secondMoment43.incrementAll(doubleArray60);
        double double62 = variance0.evaluate(doubleArray60);
        variance0.increment((double) 1.0f);
        variance0.increment(6.637284523120478E14d);
        org.apache.commons.math.stat.descriptive.moment.Variance variance67 = new org.apache.commons.math.stat.descriptive.moment.Variance();
        org.apache.commons.math.stat.descriptive.moment.SecondMoment secondMoment68 = new org.apache.commons.math.stat.descriptive.moment.SecondMoment();
        secondMoment68.increment((double) ' ');
        org.apache.commons.math.stat.descriptive.moment.Variance variance71 = new org.apache.commons.math.stat.descriptive.moment.Variance(secondMoment68);
        secondMoment68.increment((double) (short) -1);
        secondMoment68.clear();
        secondMoment68.increment((double) 0L);
        org.apache.commons.math.stat.descriptive.moment.Variance variance77 = new org.apache.commons.math.stat.descriptive.moment.Variance(secondMoment68);
        org.apache.commons.math.stat.descriptive.moment.SecondMoment secondMoment78 = new org.apache.commons.math.stat.descriptive.moment.SecondMoment();
        secondMoment78.increment(1.0d);
        double[] doubleArray84 = new double[] { (-1L), 0, 10L };
        secondMoment78.incrementAll(doubleArray84, 0, 0);
        variance77.incrementAll(doubleArray84);
        variance67.incrementAll(doubleArray84);
        double double90 = variance0.evaluate(doubleArray84);
        variance0.clear();
        variance0.increment(6.637062996510895E14d);
        variance0.setBiasCorrected(true);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.5d + "'", double6 == 0.5d);
        org.junit.Assert.assertNotNull(doubleArray13);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray13), "[-1.0, 0.0, 10.0]");
        org.junit.Assert.assertTrue("'" + double17 + "' != '" + 74.0d + "'", double17 == 74.0d);
        org.junit.Assert.assertNotNull(doubleArray18);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray18), "[]");
        org.junit.Assert.assertTrue(Double.isNaN(double22));
        org.junit.Assert.assertTrue("'" + long23 + "' != '" + 0L + "'", long23 == 0L);
        org.junit.Assert.assertTrue("'" + double29 + "' != '" + 0.5d + "'", double29 == 0.5d);
        org.junit.Assert.assertNotNull(doubleArray36);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray36), "[-1.0, 0.0, 10.0]");
        org.junit.Assert.assertTrue("'" + double40 + "' != '" + 74.0d + "'", double40 == 74.0d);
        org.junit.Assert.assertTrue("'" + long42 + "' != '" + 3L + "'", long42 == 3L);
        org.junit.Assert.assertTrue("'" + double48 + "' != '" + 0.5d + "'", double48 == 0.5d);
        org.junit.Assert.assertNotNull(doubleArray55);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray55), "[-1.0, 0.0, 10.0]");
        org.junit.Assert.assertTrue("'" + double59 + "' != '" + 74.0d + "'", double59 == 74.0d);
        org.junit.Assert.assertNotNull(doubleArray60);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray60), "[]");
        org.junit.Assert.assertTrue(Double.isNaN(double62));
        org.junit.Assert.assertNotNull(doubleArray84);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray84), "[-1.0, 0.0, 10.0]");
        org.junit.Assert.assertTrue("'" + double90 + "' != '" + 37.0d + "'", double90 == 37.0d);
    }

    @Test
    public void test13507() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest27.test13507");
        org.apache.commons.math.stat.descriptive.moment.SecondMoment secondMoment1 = new org.apache.commons.math.stat.descriptive.moment.SecondMoment();
        secondMoment1.increment(1.0d);
        double[] doubleArray7 = new double[] { (-1L), 0, 10L };
        secondMoment1.incrementAll(doubleArray7, 0, 0);
        double[] doubleArray13 = new double[] { 10, (byte) 100 };
        double double14 = secondMoment1.evaluate(doubleArray13);
        double double15 = secondMoment1.getResult();
        org.apache.commons.math.stat.descriptive.moment.Variance variance16 = new org.apache.commons.math.stat.descriptive.moment.Variance(false, secondMoment1);
        secondMoment1.increment(24.666666666666668d);
        org.apache.commons.math.stat.descriptive.moment.SecondMoment secondMoment19 = new org.apache.commons.math.stat.descriptive.moment.SecondMoment();
        secondMoment19.increment(1.0d);
        org.apache.commons.math.stat.descriptive.moment.SecondMoment secondMoment22 = new org.apache.commons.math.stat.descriptive.moment.SecondMoment();
        secondMoment22.increment(1.0d);
        secondMoment22.increment((double) (short) 0);
        double double27 = secondMoment22.getResult();
        org.apache.commons.math.stat.descriptive.moment.SecondMoment secondMoment28 = new org.apache.commons.math.stat.descriptive.moment.SecondMoment();
        secondMoment28.increment(1.0d);
        double[] doubleArray34 = new double[] { (-1L), 0, 10L };
        secondMoment28.incrementAll(doubleArray34, 0, 0);
        double double38 = secondMoment22.evaluate(doubleArray34);
        double[] doubleArray39 = new double[] {};
        secondMoment22.incrementAll(doubleArray39);
        double double41 = secondMoment19.evaluate(doubleArray39);
        secondMoment1.incrementAll(doubleArray39);
        java.lang.Class<?> wildcardClass43 = secondMoment1.getClass();
        org.junit.Assert.assertNotNull(doubleArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray7), "[-1.0, 0.0, 10.0]");
        org.junit.Assert.assertNotNull(doubleArray13);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray13), "[10.0, 100.0]");
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + 4050.0d + "'", double14 == 4050.0d);
        org.junit.Assert.assertTrue("'" + double15 + "' != '" + 4050.0d + "'", double15 == 4050.0d);
        org.junit.Assert.assertTrue("'" + double27 + "' != '" + 0.5d + "'", double27 == 0.5d);
        org.junit.Assert.assertNotNull(doubleArray34);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray34), "[-1.0, 0.0, 10.0]");
        org.junit.Assert.assertTrue("'" + double38 + "' != '" + 74.0d + "'", double38 == 74.0d);
        org.junit.Assert.assertNotNull(doubleArray39);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray39), "[]");
        org.junit.Assert.assertTrue("'" + double41 + "' != '" + 0.0d + "'", double41 == 0.0d);
        org.junit.Assert.assertNotNull(wildcardClass43);
    }

    @Test
    public void test13508() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest27.test13508");
        org.apache.commons.math.stat.descriptive.moment.SecondMoment secondMoment0 = new org.apache.commons.math.stat.descriptive.moment.SecondMoment();
        secondMoment0.increment((double) ' ');
        org.apache.commons.math.stat.descriptive.moment.Variance variance3 = new org.apache.commons.math.stat.descriptive.moment.Variance(secondMoment0);
        variance3.increment(1769.25d);
        double double6 = variance3.getResult();
        double double7 = variance3.getResult();
        java.lang.Object obj8 = null;
        boolean boolean9 = variance3.equals(obj8);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.0d + "'", double6 == 0.0d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 0.0d + "'", double7 == 0.0d);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
    }

    @Test
    public void test13509() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest27.test13509");
        org.apache.commons.math.stat.descriptive.moment.SecondMoment secondMoment0 = new org.apache.commons.math.stat.descriptive.moment.SecondMoment();
        secondMoment0.increment((double) ' ');
        double double3 = secondMoment0.getResult();
        double double4 = secondMoment0.getResult();
        secondMoment0.clear();
        double double6 = secondMoment0.getResult();
        org.apache.commons.math.stat.descriptive.moment.SecondMoment secondMoment7 = new org.apache.commons.math.stat.descriptive.moment.SecondMoment();
        secondMoment7.increment(1.0d);
        secondMoment7.increment((double) (short) 0);
        double double12 = secondMoment7.getResult();
        org.apache.commons.math.stat.descriptive.moment.SecondMoment secondMoment13 = new org.apache.commons.math.stat.descriptive.moment.SecondMoment();
        secondMoment13.increment(1.0d);
        secondMoment13.increment((double) (short) 0);
        double double18 = secondMoment13.getResult();
        org.apache.commons.math.stat.descriptive.moment.SecondMoment secondMoment19 = new org.apache.commons.math.stat.descriptive.moment.SecondMoment();
        secondMoment19.increment(1.0d);
        double[] doubleArray25 = new double[] { (-1L), 0, 10L };
        secondMoment19.incrementAll(doubleArray25, 0, 0);
        double double29 = secondMoment13.evaluate(doubleArray25);
        double[] doubleArray30 = new double[] {};
        secondMoment13.incrementAll(doubleArray30);
        secondMoment7.incrementAll(doubleArray30);
        secondMoment7.increment((double) 2L);
        org.apache.commons.math.stat.descriptive.moment.Variance variance35 = new org.apache.commons.math.stat.descriptive.moment.Variance(secondMoment7);
        org.apache.commons.math.stat.descriptive.moment.SecondMoment secondMoment36 = new org.apache.commons.math.stat.descriptive.moment.SecondMoment();
        secondMoment36.increment(1.0d);
        double[] doubleArray42 = new double[] { (-1L), 0, 10L };
        secondMoment36.incrementAll(doubleArray42, 0, 0);
        double[] doubleArray48 = new double[] { 10, (byte) 100 };
        double double49 = secondMoment36.evaluate(doubleArray48);
        double double50 = variance35.evaluate(doubleArray48);
        long long51 = variance35.getN();
        long long52 = variance35.getN();
        double double53 = variance35.getResult();
        double double54 = variance35.getResult();
        org.apache.commons.math.stat.descriptive.moment.SecondMoment secondMoment55 = new org.apache.commons.math.stat.descriptive.moment.SecondMoment();
        secondMoment55.increment((double) ' ');
        secondMoment55.increment((double) (byte) 0);
        secondMoment55.clear();
        org.apache.commons.math.stat.descriptive.moment.Variance variance61 = new org.apache.commons.math.stat.descriptive.moment.Variance(secondMoment55);
        org.apache.commons.math.stat.descriptive.moment.SecondMoment secondMoment62 = new org.apache.commons.math.stat.descriptive.moment.SecondMoment();
        secondMoment62.increment(1.0d);
        secondMoment62.increment((double) (short) 0);
        long long67 = secondMoment62.getN();
        org.apache.commons.math.stat.descriptive.moment.SecondMoment secondMoment68 = new org.apache.commons.math.stat.descriptive.moment.SecondMoment();
        secondMoment68.increment(1.0d);
        double[] doubleArray74 = new double[] { (-1L), 0, 10L };
        secondMoment68.incrementAll(doubleArray74, 0, 0);
        long long78 = secondMoment68.getN();
        org.apache.commons.math.stat.descriptive.moment.SecondMoment secondMoment79 = new org.apache.commons.math.stat.descriptive.moment.SecondMoment();
        secondMoment79.increment(1.0d);
        double[] doubleArray85 = new double[] { (-1L), 0, 10L };
        secondMoment79.incrementAll(doubleArray85, 0, 0);
        secondMoment68.incrementAll(doubleArray85, 0, (int) (short) 1);
        secondMoment62.incrementAll(doubleArray85, (int) (byte) 0, (int) (byte) 1);
        double double96 = variance61.evaluate(doubleArray85, (double) 0L);
        double double97 = variance35.evaluate(doubleArray85);
        secondMoment0.incrementAll(doubleArray85);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 0.0d + "'", double3 == 0.0d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 0.0d + "'", double4 == 0.0d);
        org.junit.Assert.assertTrue(Double.isNaN(double6));
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 0.5d + "'", double12 == 0.5d);
        org.junit.Assert.assertTrue("'" + double18 + "' != '" + 0.5d + "'", double18 == 0.5d);
        org.junit.Assert.assertNotNull(doubleArray25);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray25), "[-1.0, 0.0, 10.0]");
        org.junit.Assert.assertTrue("'" + double29 + "' != '" + 74.0d + "'", double29 == 74.0d);
        org.junit.Assert.assertNotNull(doubleArray30);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray30), "[]");
        org.junit.Assert.assertNotNull(doubleArray42);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray42), "[-1.0, 0.0, 10.0]");
        org.junit.Assert.assertNotNull(doubleArray48);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray48), "[10.0, 100.0]");
        org.junit.Assert.assertTrue("'" + double49 + "' != '" + 4050.0d + "'", double49 == 4050.0d);
        org.junit.Assert.assertTrue("'" + double50 + "' != '" + 4050.0d + "'", double50 == 4050.0d);
        org.junit.Assert.assertTrue("'" + long51 + "' != '" + 3L + "'", long51 == 3L);
        org.junit.Assert.assertTrue("'" + long52 + "' != '" + 3L + "'", long52 == 3L);
        org.junit.Assert.assertTrue("'" + double53 + "' != '" + 1.0d + "'", double53 == 1.0d);
        org.junit.Assert.assertTrue("'" + double54 + "' != '" + 1.0d + "'", double54 == 1.0d);
        org.junit.Assert.assertTrue("'" + long67 + "' != '" + 2L + "'", long67 == 2L);
        org.junit.Assert.assertNotNull(doubleArray74);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray74), "[-1.0, 0.0, 10.0]");
        org.junit.Assert.assertTrue("'" + long78 + "' != '" + 1L + "'", long78 == 1L);
        org.junit.Assert.assertNotNull(doubleArray85);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray85), "[-1.0, 0.0, 10.0]");
        org.junit.Assert.assertTrue("'" + double96 + "' != '" + 37.0d + "'", double96 == 37.0d);
        org.junit.Assert.assertTrue("'" + double97 + "' != '" + 37.0d + "'", double97 == 37.0d);
    }

    @Test
    public void test13510() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest27.test13510");
        org.apache.commons.math.stat.descriptive.moment.SecondMoment secondMoment1 = new org.apache.commons.math.stat.descriptive.moment.SecondMoment();
        secondMoment1.increment(1.0d);
        double[] doubleArray7 = new double[] { (-1L), 0, 10L };
        secondMoment1.incrementAll(doubleArray7, 0, 0);
        double[] doubleArray13 = new double[] { 10, (byte) 100 };
        double double14 = secondMoment1.evaluate(doubleArray13);
        double double15 = secondMoment1.getResult();
        secondMoment1.increment((double) (short) -1);
        secondMoment1.clear();
        org.apache.commons.math.stat.descriptive.moment.Variance variance19 = new org.apache.commons.math.stat.descriptive.moment.Variance(true, secondMoment1);
        secondMoment1.increment(1067.1666666666667d);
        secondMoment1.increment((double) (short) 0);
        secondMoment1.increment(0.25d);
        double double26 = secondMoment1.getResult();
        long long27 = secondMoment1.getN();
        long long28 = secondMoment1.getN();
        org.apache.commons.math.stat.descriptive.moment.Variance variance29 = new org.apache.commons.math.stat.descriptive.moment.Variance(secondMoment1);
        org.junit.Assert.assertNotNull(doubleArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray7), "[-1.0, 0.0, 10.0]");
        org.junit.Assert.assertNotNull(doubleArray13);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray13), "[10.0, 100.0]");
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + 4050.0d + "'", double14 == 4050.0d);
        org.junit.Assert.assertTrue("'" + double15 + "' != '" + 4050.0d + "'", double15 == 4050.0d);
        org.junit.Assert.assertTrue("'" + double26 + "' != '" + 759051.9768518519d + "'", double26 == 759051.9768518519d);
        org.junit.Assert.assertTrue("'" + long27 + "' != '" + 3L + "'", long27 == 3L);
        org.junit.Assert.assertTrue("'" + long28 + "' != '" + 3L + "'", long28 == 3L);
    }

    @Test
    public void test13511() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest27.test13511");
        org.apache.commons.math.stat.descriptive.moment.SecondMoment secondMoment2 = new org.apache.commons.math.stat.descriptive.moment.SecondMoment();
        secondMoment2.increment(1.0d);
        double[] doubleArray8 = new double[] { (-1L), 0, 10L };
        secondMoment2.incrementAll(doubleArray8, 0, 0);
        double[] doubleArray14 = new double[] { 10, (byte) 100 };
        double double15 = secondMoment2.evaluate(doubleArray14);
        double double16 = secondMoment2.getResult();
        long long17 = secondMoment2.getN();
        long long18 = secondMoment2.getN();
        org.apache.commons.math.stat.descriptive.moment.Variance variance19 = new org.apache.commons.math.stat.descriptive.moment.Variance(true, secondMoment2);
        long long20 = secondMoment2.getN();
        org.apache.commons.math.stat.descriptive.moment.SecondMoment secondMoment22 = new org.apache.commons.math.stat.descriptive.moment.SecondMoment();
        secondMoment22.increment(1.0d);
        double[] doubleArray28 = new double[] { (-1L), 0, 10L };
        secondMoment22.incrementAll(doubleArray28, 0, 0);
        double[] doubleArray34 = new double[] { 10, (byte) 100 };
        double double35 = secondMoment22.evaluate(doubleArray34);
        double double36 = secondMoment22.getResult();
        org.apache.commons.math.stat.descriptive.moment.Variance variance37 = new org.apache.commons.math.stat.descriptive.moment.Variance(false, secondMoment22);
        long long38 = secondMoment22.getN();
        org.apache.commons.math.stat.descriptive.moment.SecondMoment secondMoment39 = new org.apache.commons.math.stat.descriptive.moment.SecondMoment();
        secondMoment39.increment((double) ' ');
        secondMoment39.increment((double) (-1.0f));
        secondMoment39.clear();
        org.apache.commons.math.stat.descriptive.moment.SecondMoment secondMoment45 = new org.apache.commons.math.stat.descriptive.moment.SecondMoment();
        secondMoment45.increment(1.0d);
        double[] doubleArray51 = new double[] { (-1L), 0, 10L };
        secondMoment45.incrementAll(doubleArray51, 0, 0);
        org.apache.commons.math.stat.descriptive.moment.Variance variance55 = new org.apache.commons.math.stat.descriptive.moment.Variance(secondMoment45);
        long long56 = variance55.getN();
        org.apache.commons.math.stat.descriptive.moment.SecondMoment secondMoment57 = new org.apache.commons.math.stat.descriptive.moment.SecondMoment();
        secondMoment57.increment(1.0d);
        double[] doubleArray63 = new double[] { (-1L), 0, 10L };
        secondMoment57.incrementAll(doubleArray63, 0, 0);
        double double68 = variance55.evaluate(doubleArray63, (double) (short) -1);
        double double69 = secondMoment39.evaluate(doubleArray63);
        double double70 = secondMoment22.evaluate(doubleArray63);
        secondMoment2.incrementAll(doubleArray63);
        long long72 = secondMoment2.getN();
        org.apache.commons.math.stat.descriptive.moment.Variance variance73 = new org.apache.commons.math.stat.descriptive.moment.Variance(false, secondMoment2);
        long long74 = variance73.getN();
        org.apache.commons.math.stat.descriptive.moment.SecondMoment secondMoment75 = new org.apache.commons.math.stat.descriptive.moment.SecondMoment();
        secondMoment75.increment(1.0d);
        secondMoment75.increment((double) (short) 0);
        double double80 = secondMoment75.getResult();
        long long81 = secondMoment75.getN();
        double double82 = secondMoment75.getResult();
        secondMoment75.increment((double) 7L);
        secondMoment75.increment(7379008.583333333d);
        boolean boolean87 = variance73.equals((java.lang.Object) 7379008.583333333d);
        org.junit.Assert.assertNotNull(doubleArray8);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray8), "[-1.0, 0.0, 10.0]");
        org.junit.Assert.assertNotNull(doubleArray14);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray14), "[10.0, 100.0]");
        org.junit.Assert.assertTrue("'" + double15 + "' != '" + 4050.0d + "'", double15 == 4050.0d);
        org.junit.Assert.assertTrue("'" + double16 + "' != '" + 4050.0d + "'", double16 == 4050.0d);
        org.junit.Assert.assertTrue("'" + long17 + "' != '" + 2L + "'", long17 == 2L);
        org.junit.Assert.assertTrue("'" + long18 + "' != '" + 2L + "'", long18 == 2L);
        org.junit.Assert.assertTrue("'" + long20 + "' != '" + 2L + "'", long20 == 2L);
        org.junit.Assert.assertNotNull(doubleArray28);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray28), "[-1.0, 0.0, 10.0]");
        org.junit.Assert.assertNotNull(doubleArray34);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray34), "[10.0, 100.0]");
        org.junit.Assert.assertTrue("'" + double35 + "' != '" + 4050.0d + "'", double35 == 4050.0d);
        org.junit.Assert.assertTrue("'" + double36 + "' != '" + 4050.0d + "'", double36 == 4050.0d);
        org.junit.Assert.assertTrue("'" + long38 + "' != '" + 2L + "'", long38 == 2L);
        org.junit.Assert.assertNotNull(doubleArray51);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray51), "[-1.0, 0.0, 10.0]");
        org.junit.Assert.assertTrue("'" + long56 + "' != '" + 1L + "'", long56 == 1L);
        org.junit.Assert.assertNotNull(doubleArray63);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray63), "[-1.0, 0.0, 10.0]");
        org.junit.Assert.assertTrue("'" + double68 + "' != '" + 37.0d + "'", double68 == 37.0d);
        org.junit.Assert.assertTrue("'" + double69 + "' != '" + 74.0d + "'", double69 == 74.0d);
        org.junit.Assert.assertTrue("'" + double70 + "' != '" + 74.0d + "'", double70 == 74.0d);
        org.junit.Assert.assertTrue("'" + long72 + "' != '" + 5L + "'", long72 == 5L);
        org.junit.Assert.assertTrue("'" + long74 + "' != '" + 5L + "'", long74 == 5L);
        org.junit.Assert.assertTrue("'" + double80 + "' != '" + 0.5d + "'", double80 == 0.5d);
        org.junit.Assert.assertTrue("'" + long81 + "' != '" + 2L + "'", long81 == 2L);
        org.junit.Assert.assertTrue("'" + double82 + "' != '" + 0.5d + "'", double82 == 0.5d);
        org.junit.Assert.assertTrue("'" + boolean87 + "' != '" + false + "'", boolean87 == false);
    }

    @Test
    public void test13512() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest27.test13512");
        org.apache.commons.math.stat.descriptive.moment.SecondMoment secondMoment2 = new org.apache.commons.math.stat.descriptive.moment.SecondMoment();
        secondMoment2.increment(1.0d);
        double[] doubleArray8 = new double[] { (-1L), 0, 10L };
        secondMoment2.incrementAll(doubleArray8, 0, 0);
        double[] doubleArray14 = new double[] { 10, (byte) 100 };
        double double15 = secondMoment2.evaluate(doubleArray14);
        double double16 = secondMoment2.getResult();
        org.apache.commons.math.stat.descriptive.moment.Variance variance17 = new org.apache.commons.math.stat.descriptive.moment.Variance(false, secondMoment2);
        long long18 = secondMoment2.getN();
        org.apache.commons.math.stat.descriptive.moment.Variance variance19 = new org.apache.commons.math.stat.descriptive.moment.Variance(true, secondMoment2);
        boolean boolean20 = variance19.isBiasCorrected();
        org.apache.commons.math.stat.descriptive.moment.SecondMoment secondMoment21 = new org.apache.commons.math.stat.descriptive.moment.SecondMoment();
        secondMoment21.increment((double) ' ');
        org.apache.commons.math.stat.descriptive.moment.Variance variance24 = new org.apache.commons.math.stat.descriptive.moment.Variance(secondMoment21);
        secondMoment21.increment((double) (short) -1);
        secondMoment21.clear();
        secondMoment21.increment((double) 0L);
        org.apache.commons.math.stat.descriptive.moment.Variance variance30 = new org.apache.commons.math.stat.descriptive.moment.Variance(secondMoment21);
        long long31 = variance30.getN();
        org.apache.commons.math.stat.descriptive.moment.SecondMoment secondMoment32 = new org.apache.commons.math.stat.descriptive.moment.SecondMoment();
        secondMoment32.increment(1.0d);
        org.apache.commons.math.stat.descriptive.moment.SecondMoment secondMoment35 = new org.apache.commons.math.stat.descriptive.moment.SecondMoment();
        secondMoment35.increment(1.0d);
        secondMoment35.increment((double) (short) 0);
        double double40 = secondMoment35.getResult();
        org.apache.commons.math.stat.descriptive.moment.SecondMoment secondMoment41 = new org.apache.commons.math.stat.descriptive.moment.SecondMoment();
        secondMoment41.increment(1.0d);
        double[] doubleArray47 = new double[] { (-1L), 0, 10L };
        secondMoment41.incrementAll(doubleArray47, 0, 0);
        double double51 = secondMoment35.evaluate(doubleArray47);
        double[] doubleArray52 = new double[] {};
        secondMoment35.incrementAll(doubleArray52);
        double double54 = secondMoment32.evaluate(doubleArray52);
        double double55 = variance30.evaluate(doubleArray52);
        double double57 = variance19.evaluate(doubleArray52, (double) 1);
        boolean boolean58 = variance19.isBiasCorrected();
        variance19.setBiasCorrected(false);
        double double61 = variance19.getResult();
        org.junit.Assert.assertNotNull(doubleArray8);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray8), "[-1.0, 0.0, 10.0]");
        org.junit.Assert.assertNotNull(doubleArray14);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray14), "[10.0, 100.0]");
        org.junit.Assert.assertTrue("'" + double15 + "' != '" + 4050.0d + "'", double15 == 4050.0d);
        org.junit.Assert.assertTrue("'" + double16 + "' != '" + 4050.0d + "'", double16 == 4050.0d);
        org.junit.Assert.assertTrue("'" + long18 + "' != '" + 2L + "'", long18 == 2L);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + true + "'", boolean20 == true);
        org.junit.Assert.assertTrue("'" + long31 + "' != '" + 1L + "'", long31 == 1L);
        org.junit.Assert.assertTrue("'" + double40 + "' != '" + 0.5d + "'", double40 == 0.5d);
        org.junit.Assert.assertNotNull(doubleArray47);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray47), "[-1.0, 0.0, 10.0]");
        org.junit.Assert.assertTrue("'" + double51 + "' != '" + 74.0d + "'", double51 == 74.0d);
        org.junit.Assert.assertNotNull(doubleArray52);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray52), "[]");
        org.junit.Assert.assertTrue("'" + double54 + "' != '" + 0.0d + "'", double54 == 0.0d);
        org.junit.Assert.assertTrue(Double.isNaN(double55));
        org.junit.Assert.assertTrue(Double.isNaN(double57));
        org.junit.Assert.assertTrue("'" + boolean58 + "' != '" + true + "'", boolean58 == true);
        org.junit.Assert.assertTrue("'" + double61 + "' != '" + 2025.0d + "'", double61 == 2025.0d);
    }

    @Test
    public void test13513() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest27.test13513");
        org.apache.commons.math.stat.descriptive.moment.SecondMoment secondMoment1 = new org.apache.commons.math.stat.descriptive.moment.SecondMoment();
        secondMoment1.increment((double) ' ');
        org.apache.commons.math.stat.descriptive.moment.Variance variance4 = new org.apache.commons.math.stat.descriptive.moment.Variance(secondMoment1);
        secondMoment1.increment((double) (short) -1);
        long long7 = secondMoment1.getN();
        org.apache.commons.math.stat.descriptive.moment.Variance variance8 = new org.apache.commons.math.stat.descriptive.moment.Variance(false, secondMoment1);
        org.apache.commons.math.stat.descriptive.moment.SecondMoment secondMoment9 = new org.apache.commons.math.stat.descriptive.moment.SecondMoment();
        secondMoment9.increment(1.0d);
        double[] doubleArray15 = new double[] { (-1L), 0, 10L };
        secondMoment9.incrementAll(doubleArray15, 0, 0);
        double double20 = variance8.evaluate(doubleArray15, (double) 1L);
        org.apache.commons.math.stat.descriptive.moment.SecondMoment secondMoment22 = new org.apache.commons.math.stat.descriptive.moment.SecondMoment();
        secondMoment22.increment(1.0d);
        double[] doubleArray28 = new double[] { (-1L), 0, 10L };
        secondMoment22.incrementAll(doubleArray28, 0, 0);
        double[] doubleArray34 = new double[] { 10, (byte) 100 };
        double double35 = secondMoment22.evaluate(doubleArray34);
        org.apache.commons.math.stat.descriptive.moment.SecondMoment secondMoment37 = new org.apache.commons.math.stat.descriptive.moment.SecondMoment();
        secondMoment37.increment((double) ' ');
        org.apache.commons.math.stat.descriptive.moment.Variance variance40 = new org.apache.commons.math.stat.descriptive.moment.Variance(secondMoment37);
        secondMoment37.increment((double) (short) -1);
        secondMoment37.clear();
        secondMoment37.increment((double) 0L);
        org.apache.commons.math.stat.descriptive.moment.Variance variance46 = new org.apache.commons.math.stat.descriptive.moment.Variance(false, secondMoment37);
        boolean boolean47 = secondMoment22.equals((java.lang.Object) secondMoment37);
        org.apache.commons.math.stat.descriptive.moment.Variance variance48 = new org.apache.commons.math.stat.descriptive.moment.Variance(false, secondMoment37);
        org.apache.commons.math.stat.descriptive.moment.Variance variance49 = new org.apache.commons.math.stat.descriptive.moment.Variance();
        org.apache.commons.math.stat.descriptive.moment.SecondMoment secondMoment50 = new org.apache.commons.math.stat.descriptive.moment.SecondMoment();
        secondMoment50.increment(1.0d);
        secondMoment50.increment((double) (short) 0);
        double double55 = secondMoment50.getResult();
        org.apache.commons.math.stat.descriptive.moment.SecondMoment secondMoment56 = new org.apache.commons.math.stat.descriptive.moment.SecondMoment();
        secondMoment56.increment(1.0d);
        double[] doubleArray62 = new double[] { (-1L), 0, 10L };
        secondMoment56.incrementAll(doubleArray62, 0, 0);
        double double66 = secondMoment50.evaluate(doubleArray62);
        double[] doubleArray67 = new double[] {};
        secondMoment50.incrementAll(doubleArray67);
        double double71 = variance49.evaluate(doubleArray67, (int) (byte) 0, 0);
        long long72 = variance49.getN();
        org.apache.commons.math.stat.descriptive.moment.SecondMoment secondMoment73 = new org.apache.commons.math.stat.descriptive.moment.SecondMoment();
        secondMoment73.increment(1.0d);
        secondMoment73.increment((double) (short) 0);
        double double78 = secondMoment73.getResult();
        org.apache.commons.math.stat.descriptive.moment.SecondMoment secondMoment79 = new org.apache.commons.math.stat.descriptive.moment.SecondMoment();
        secondMoment79.increment(1.0d);
        double[] doubleArray85 = new double[] { (-1L), 0, 10L };
        secondMoment79.incrementAll(doubleArray85, 0, 0);
        double double89 = secondMoment73.evaluate(doubleArray85);
        variance49.incrementAll(doubleArray85);
        double double92 = variance48.evaluate(doubleArray85, (double) '#');
        variance8.incrementAll(doubleArray85);
        variance8.increment((double) 5L);
        variance8.clear();
        variance8.increment(7142.8d);
        variance8.clear();
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + 2L + "'", long7 == 2L);
        org.junit.Assert.assertNotNull(doubleArray15);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray15), "[-1.0, 0.0, 10.0]");
        org.junit.Assert.assertTrue("'" + double20 + "' != '" + 24.666666666666668d + "'", double20 == 24.666666666666668d);
        org.junit.Assert.assertNotNull(doubleArray28);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray28), "[-1.0, 0.0, 10.0]");
        org.junit.Assert.assertNotNull(doubleArray34);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray34), "[10.0, 100.0]");
        org.junit.Assert.assertTrue("'" + double35 + "' != '" + 4050.0d + "'", double35 == 4050.0d);
        org.junit.Assert.assertTrue("'" + boolean47 + "' != '" + false + "'", boolean47 == false);
        org.junit.Assert.assertTrue("'" + double55 + "' != '" + 0.5d + "'", double55 == 0.5d);
        org.junit.Assert.assertNotNull(doubleArray62);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray62), "[-1.0, 0.0, 10.0]");
        org.junit.Assert.assertTrue("'" + double66 + "' != '" + 74.0d + "'", double66 == 74.0d);
        org.junit.Assert.assertNotNull(doubleArray67);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray67), "[]");
        org.junit.Assert.assertTrue(Double.isNaN(double71));
        org.junit.Assert.assertTrue("'" + long72 + "' != '" + 0L + "'", long72 == 0L);
        org.junit.Assert.assertTrue("'" + double78 + "' != '" + 0.5d + "'", double78 == 0.5d);
        org.junit.Assert.assertNotNull(doubleArray85);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray85), "[-1.0, 0.0, 10.0]");
        org.junit.Assert.assertTrue("'" + double89 + "' != '" + 74.0d + "'", double89 == 74.0d);
        org.junit.Assert.assertTrue("'" + double92 + "' != '" + 24.666666666666668d + "'", double92 == 24.666666666666668d);
    }

    @Test
    public void test13514() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest27.test13514");
        org.apache.commons.math.stat.descriptive.moment.SecondMoment secondMoment0 = new org.apache.commons.math.stat.descriptive.moment.SecondMoment();
        secondMoment0.increment((double) ' ');
        secondMoment0.increment((double) '4');
        long long5 = secondMoment0.getN();
        org.apache.commons.math.stat.descriptive.moment.Variance variance6 = new org.apache.commons.math.stat.descriptive.moment.Variance(secondMoment0);
        double double7 = variance6.getResult();
        variance6.clear();
        org.apache.commons.math.stat.descriptive.moment.SecondMoment secondMoment9 = new org.apache.commons.math.stat.descriptive.moment.SecondMoment();
        secondMoment9.increment((double) ' ');
        org.apache.commons.math.stat.descriptive.moment.Variance variance12 = new org.apache.commons.math.stat.descriptive.moment.Variance(secondMoment9);
        secondMoment9.increment((double) (short) -1);
        secondMoment9.clear();
        secondMoment9.increment((double) 0L);
        org.apache.commons.math.stat.descriptive.moment.Variance variance18 = new org.apache.commons.math.stat.descriptive.moment.Variance(secondMoment9);
        long long19 = variance18.getN();
        org.apache.commons.math.stat.descriptive.moment.SecondMoment secondMoment20 = new org.apache.commons.math.stat.descriptive.moment.SecondMoment();
        secondMoment20.increment(1.0d);
        org.apache.commons.math.stat.descriptive.moment.SecondMoment secondMoment23 = new org.apache.commons.math.stat.descriptive.moment.SecondMoment();
        secondMoment23.increment(1.0d);
        secondMoment23.increment((double) (short) 0);
        double double28 = secondMoment23.getResult();
        org.apache.commons.math.stat.descriptive.moment.SecondMoment secondMoment29 = new org.apache.commons.math.stat.descriptive.moment.SecondMoment();
        secondMoment29.increment(1.0d);
        double[] doubleArray35 = new double[] { (-1L), 0, 10L };
        secondMoment29.incrementAll(doubleArray35, 0, 0);
        double double39 = secondMoment23.evaluate(doubleArray35);
        double[] doubleArray40 = new double[] {};
        secondMoment23.incrementAll(doubleArray40);
        double double42 = secondMoment20.evaluate(doubleArray40);
        double double43 = variance18.evaluate(doubleArray40);
        org.apache.commons.math.stat.descriptive.moment.SecondMoment secondMoment44 = new org.apache.commons.math.stat.descriptive.moment.SecondMoment();
        secondMoment44.increment(1.0d);
        org.apache.commons.math.stat.descriptive.moment.SecondMoment secondMoment47 = new org.apache.commons.math.stat.descriptive.moment.SecondMoment();
        secondMoment47.increment(1.0d);
        secondMoment47.increment((double) (short) 0);
        double double52 = secondMoment47.getResult();
        org.apache.commons.math.stat.descriptive.moment.SecondMoment secondMoment53 = new org.apache.commons.math.stat.descriptive.moment.SecondMoment();
        secondMoment53.increment(1.0d);
        double[] doubleArray59 = new double[] { (-1L), 0, 10L };
        secondMoment53.incrementAll(doubleArray59, 0, 0);
        double double63 = secondMoment47.evaluate(doubleArray59);
        double[] doubleArray64 = new double[] {};
        secondMoment47.incrementAll(doubleArray64);
        double double66 = secondMoment44.evaluate(doubleArray64);
        variance18.incrementAll(doubleArray64);
        org.apache.commons.math.stat.descriptive.moment.SecondMoment secondMoment68 = new org.apache.commons.math.stat.descriptive.moment.SecondMoment();
        secondMoment68.increment(1.0d);
        secondMoment68.increment((double) (short) 0);
        double double73 = secondMoment68.getResult();
        org.apache.commons.math.stat.descriptive.moment.SecondMoment secondMoment74 = new org.apache.commons.math.stat.descriptive.moment.SecondMoment();
        secondMoment74.increment(1.0d);
        double[] doubleArray80 = new double[] { (-1L), 0, 10L };
        secondMoment74.incrementAll(doubleArray80, 0, 0);
        double double84 = secondMoment68.evaluate(doubleArray80);
        double double87 = variance18.evaluate(doubleArray80, (int) (byte) 1, 1);
        double double88 = variance6.evaluate(doubleArray80);
        variance6.setBiasCorrected(true);
        long long91 = variance6.getN();
        variance6.increment(125982.5185185185d);
        variance6.clear();
        double double95 = variance6.getResult();
        boolean boolean96 = variance6.isBiasCorrected();
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 2L + "'", long5 == 2L);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 200.0d + "'", double7 == 200.0d);
        org.junit.Assert.assertTrue("'" + long19 + "' != '" + 1L + "'", long19 == 1L);
        org.junit.Assert.assertTrue("'" + double28 + "' != '" + 0.5d + "'", double28 == 0.5d);
        org.junit.Assert.assertNotNull(doubleArray35);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray35), "[-1.0, 0.0, 10.0]");
        org.junit.Assert.assertTrue("'" + double39 + "' != '" + 74.0d + "'", double39 == 74.0d);
        org.junit.Assert.assertNotNull(doubleArray40);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray40), "[]");
        org.junit.Assert.assertTrue("'" + double42 + "' != '" + 0.0d + "'", double42 == 0.0d);
        org.junit.Assert.assertTrue(Double.isNaN(double43));
        org.junit.Assert.assertTrue("'" + double52 + "' != '" + 0.5d + "'", double52 == 0.5d);
        org.junit.Assert.assertNotNull(doubleArray59);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray59), "[-1.0, 0.0, 10.0]");
        org.junit.Assert.assertTrue("'" + double63 + "' != '" + 74.0d + "'", double63 == 74.0d);
        org.junit.Assert.assertNotNull(doubleArray64);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray64), "[]");
        org.junit.Assert.assertTrue("'" + double66 + "' != '" + 0.0d + "'", double66 == 0.0d);
        org.junit.Assert.assertTrue("'" + double73 + "' != '" + 0.5d + "'", double73 == 0.5d);
        org.junit.Assert.assertNotNull(doubleArray80);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray80), "[-1.0, 0.0, 10.0]");
        org.junit.Assert.assertTrue("'" + double84 + "' != '" + 74.0d + "'", double84 == 74.0d);
        org.junit.Assert.assertTrue("'" + double87 + "' != '" + 0.0d + "'", double87 == 0.0d);
        org.junit.Assert.assertTrue("'" + double88 + "' != '" + 37.0d + "'", double88 == 37.0d);
        org.junit.Assert.assertTrue("'" + long91 + "' != '" + 2L + "'", long91 == 2L);
        org.junit.Assert.assertTrue("'" + double95 + "' != '" + 200.0d + "'", double95 == 200.0d);
        org.junit.Assert.assertTrue("'" + boolean96 + "' != '" + true + "'", boolean96 == true);
    }

    @Test
    public void test13515() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest27.test13515");
        org.apache.commons.math.stat.descriptive.moment.SecondMoment secondMoment0 = new org.apache.commons.math.stat.descriptive.moment.SecondMoment();
        secondMoment0.increment(1.0d);
        double[] doubleArray6 = new double[] { (-1L), 0, 10L };
        secondMoment0.incrementAll(doubleArray6, 0, 0);
        org.apache.commons.math.stat.descriptive.moment.Variance variance10 = new org.apache.commons.math.stat.descriptive.moment.Variance(secondMoment0);
        long long11 = variance10.getN();
        org.apache.commons.math.stat.descriptive.moment.SecondMoment secondMoment12 = new org.apache.commons.math.stat.descriptive.moment.SecondMoment();
        secondMoment12.increment(1.0d);
        double[] doubleArray18 = new double[] { (-1L), 0, 10L };
        secondMoment12.incrementAll(doubleArray18, 0, 0);
        double double23 = variance10.evaluate(doubleArray18, (double) (short) -1);
        double double24 = variance10.getResult();
        variance10.setBiasCorrected(true);
        variance10.increment(3602.0d);
        variance10.setBiasCorrected(true);
        variance10.clear();
        org.junit.Assert.assertNotNull(doubleArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray6), "[-1.0, 0.0, 10.0]");
        org.junit.Assert.assertTrue("'" + long11 + "' != '" + 1L + "'", long11 == 1L);
        org.junit.Assert.assertNotNull(doubleArray18);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray18), "[-1.0, 0.0, 10.0]");
        org.junit.Assert.assertTrue("'" + double23 + "' != '" + 37.0d + "'", double23 == 37.0d);
        org.junit.Assert.assertTrue("'" + double24 + "' != '" + 0.0d + "'", double24 == 0.0d);
    }

    @Test
    public void test13516() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest27.test13516");
        org.apache.commons.math.stat.descriptive.moment.SecondMoment secondMoment1 = new org.apache.commons.math.stat.descriptive.moment.SecondMoment();
        secondMoment1.increment((double) ' ');
        org.apache.commons.math.stat.descriptive.moment.Variance variance4 = new org.apache.commons.math.stat.descriptive.moment.Variance(secondMoment1);
        secondMoment1.clear();
        secondMoment1.increment((double) (byte) 0);
        double double8 = secondMoment1.getResult();
        org.apache.commons.math.stat.descriptive.moment.Variance variance9 = new org.apache.commons.math.stat.descriptive.moment.Variance(false, secondMoment1);
        org.apache.commons.math.stat.descriptive.moment.SecondMoment secondMoment10 = new org.apache.commons.math.stat.descriptive.moment.SecondMoment();
        secondMoment10.increment((double) ' ');
        org.apache.commons.math.stat.descriptive.moment.Variance variance13 = new org.apache.commons.math.stat.descriptive.moment.Variance(secondMoment10);
        secondMoment10.increment((double) (short) -1);
        secondMoment10.clear();
        secondMoment10.increment((double) 'a');
        org.apache.commons.math.stat.descriptive.moment.SecondMoment secondMoment19 = new org.apache.commons.math.stat.descriptive.moment.SecondMoment();
        secondMoment19.increment(1.0d);
        secondMoment19.increment((double) (short) 0);
        boolean boolean24 = secondMoment10.equals((java.lang.Object) secondMoment19);
        long long25 = secondMoment19.getN();
        secondMoment19.clear();
        long long27 = secondMoment19.getN();
        boolean boolean28 = secondMoment1.equals((java.lang.Object) long27);
        secondMoment1.clear();
        double[] doubleArray30 = null;
        // The following exception was thrown during execution in test generation
        try {
            double double31 = secondMoment1.evaluate(doubleArray30);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: input value array is null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 0.0d + "'", double8 == 0.0d);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertTrue("'" + long25 + "' != '" + 2L + "'", long25 == 2L);
        org.junit.Assert.assertTrue("'" + long27 + "' != '" + 0L + "'", long27 == 0L);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + false + "'", boolean28 == false);
    }

    @Test
    public void test13517() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest27.test13517");
        org.apache.commons.math.stat.descriptive.moment.SecondMoment secondMoment0 = new org.apache.commons.math.stat.descriptive.moment.SecondMoment();
        secondMoment0.increment((double) ' ');
        org.apache.commons.math.stat.descriptive.moment.Variance variance3 = new org.apache.commons.math.stat.descriptive.moment.Variance(secondMoment0);
        secondMoment0.increment((double) '4');
        double double6 = secondMoment0.getResult();
        secondMoment0.increment((double) (short) 0);
        org.apache.commons.math.stat.descriptive.moment.Variance variance9 = new org.apache.commons.math.stat.descriptive.moment.Variance(secondMoment0);
        org.apache.commons.math.stat.descriptive.moment.Variance variance10 = new org.apache.commons.math.stat.descriptive.moment.Variance();
        org.apache.commons.math.stat.descriptive.moment.SecondMoment secondMoment11 = new org.apache.commons.math.stat.descriptive.moment.SecondMoment();
        secondMoment11.increment(1.0d);
        secondMoment11.increment((double) (short) 0);
        double double16 = secondMoment11.getResult();
        org.apache.commons.math.stat.descriptive.moment.SecondMoment secondMoment17 = new org.apache.commons.math.stat.descriptive.moment.SecondMoment();
        secondMoment17.increment(1.0d);
        double[] doubleArray23 = new double[] { (-1L), 0, 10L };
        secondMoment17.incrementAll(doubleArray23, 0, 0);
        double double27 = secondMoment11.evaluate(doubleArray23);
        double[] doubleArray28 = new double[] {};
        secondMoment11.incrementAll(doubleArray28);
        double double32 = variance10.evaluate(doubleArray28, (int) (byte) 0, 0);
        long long33 = variance10.getN();
        org.apache.commons.math.stat.descriptive.moment.SecondMoment secondMoment34 = new org.apache.commons.math.stat.descriptive.moment.SecondMoment();
        secondMoment34.increment(1.0d);
        secondMoment34.increment((double) (short) 0);
        double double39 = secondMoment34.getResult();
        org.apache.commons.math.stat.descriptive.moment.SecondMoment secondMoment40 = new org.apache.commons.math.stat.descriptive.moment.SecondMoment();
        secondMoment40.increment(1.0d);
        double[] doubleArray46 = new double[] { (-1L), 0, 10L };
        secondMoment40.incrementAll(doubleArray46, 0, 0);
        double double50 = secondMoment34.evaluate(doubleArray46);
        variance10.incrementAll(doubleArray46);
        variance10.increment((double) 10);
        boolean boolean54 = variance9.equals((java.lang.Object) variance10);
        long long55 = variance9.getN();
        boolean boolean56 = variance9.isBiasCorrected();
        variance9.increment(110.75d);
        boolean boolean59 = variance9.isBiasCorrected();
        double double60 = variance9.getResult();
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 200.0d + "'", double6 == 200.0d);
        org.junit.Assert.assertTrue("'" + double16 + "' != '" + 0.5d + "'", double16 == 0.5d);
        org.junit.Assert.assertNotNull(doubleArray23);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray23), "[-1.0, 0.0, 10.0]");
        org.junit.Assert.assertTrue("'" + double27 + "' != '" + 74.0d + "'", double27 == 74.0d);
        org.junit.Assert.assertNotNull(doubleArray28);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray28), "[]");
        org.junit.Assert.assertTrue(Double.isNaN(double32));
        org.junit.Assert.assertTrue("'" + long33 + "' != '" + 0L + "'", long33 == 0L);
        org.junit.Assert.assertTrue("'" + double39 + "' != '" + 0.5d + "'", double39 == 0.5d);
        org.junit.Assert.assertNotNull(doubleArray46);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray46), "[-1.0, 0.0, 10.0]");
        org.junit.Assert.assertTrue("'" + double50 + "' != '" + 74.0d + "'", double50 == 74.0d);
        org.junit.Assert.assertTrue("'" + boolean54 + "' != '" + false + "'", boolean54 == false);
        org.junit.Assert.assertTrue("'" + long55 + "' != '" + 3L + "'", long55 == 3L);
        org.junit.Assert.assertTrue("'" + boolean56 + "' != '" + true + "'", boolean56 == true);
        org.junit.Assert.assertTrue("'" + boolean59 + "' != '" + true + "'", boolean59 == true);
        org.junit.Assert.assertTrue("'" + double60 + "' != '" + 688.0d + "'", double60 == 688.0d);
    }

    @Test
    public void test13518() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest27.test13518");
        org.apache.commons.math.stat.descriptive.moment.SecondMoment secondMoment0 = new org.apache.commons.math.stat.descriptive.moment.SecondMoment();
        secondMoment0.increment(1.0d);
        double[] doubleArray6 = new double[] { (-1L), 0, 10L };
        secondMoment0.incrementAll(doubleArray6, 0, 0);
        long long10 = secondMoment0.getN();
        org.apache.commons.math.stat.descriptive.moment.Variance variance11 = new org.apache.commons.math.stat.descriptive.moment.Variance(secondMoment0);
        secondMoment0.increment(10.0d);
        secondMoment0.clear();
        double double15 = secondMoment0.getResult();
        secondMoment0.clear();
        secondMoment0.clear();
        double double18 = secondMoment0.getResult();
        secondMoment0.clear();
        org.junit.Assert.assertNotNull(doubleArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray6), "[-1.0, 0.0, 10.0]");
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + 1L + "'", long10 == 1L);
        org.junit.Assert.assertTrue(Double.isNaN(double15));
        org.junit.Assert.assertTrue(Double.isNaN(double18));
    }

    @Test
    public void test13519() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest27.test13519");
        org.apache.commons.math.stat.descriptive.moment.SecondMoment secondMoment2 = new org.apache.commons.math.stat.descriptive.moment.SecondMoment();
        secondMoment2.increment(1.0d);
        double[] doubleArray8 = new double[] { (-1L), 0, 10L };
        secondMoment2.incrementAll(doubleArray8, 0, 0);
        double[] doubleArray14 = new double[] { 10, (byte) 100 };
        double double15 = secondMoment2.evaluate(doubleArray14);
        long long16 = secondMoment2.getN();
        secondMoment2.clear();
        double double18 = secondMoment2.getResult();
        secondMoment2.clear();
        org.apache.commons.math.stat.descriptive.moment.Variance variance20 = new org.apache.commons.math.stat.descriptive.moment.Variance(true, secondMoment2);
        org.apache.commons.math.stat.descriptive.moment.Variance variance21 = new org.apache.commons.math.stat.descriptive.moment.Variance(false, secondMoment2);
        variance21.increment((double) 0);
        long long24 = variance21.getN();
        variance21.increment(2.880385675555556E7d);
        boolean boolean27 = variance21.isBiasCorrected();
        double double28 = variance21.getResult();
        variance21.clear();
        variance21.clear();
        org.junit.Assert.assertNotNull(doubleArray8);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray8), "[-1.0, 0.0, 10.0]");
        org.junit.Assert.assertNotNull(doubleArray14);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray14), "[10.0, 100.0]");
        org.junit.Assert.assertTrue("'" + double15 + "' != '" + 4050.0d + "'", double15 == 4050.0d);
        org.junit.Assert.assertTrue("'" + long16 + "' != '" + 2L + "'", long16 == 2L);
        org.junit.Assert.assertTrue(Double.isNaN(double18));
        org.junit.Assert.assertTrue("'" + long24 + "' != '" + 0L + "'", long24 == 0L);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + false + "'", boolean27 == false);
        org.junit.Assert.assertTrue(Double.isNaN(double28));
    }

    @Test
    public void test13520() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest27.test13520");
        org.apache.commons.math.stat.descriptive.moment.Variance variance1 = new org.apache.commons.math.stat.descriptive.moment.Variance(true);
        variance1.clear();
        variance1.increment(1769.25d);
        org.apache.commons.math.stat.descriptive.moment.SecondMoment secondMoment5 = new org.apache.commons.math.stat.descriptive.moment.SecondMoment();
        secondMoment5.increment((double) ' ');
        double double8 = secondMoment5.getResult();
        secondMoment5.increment((double) (short) 100);
        secondMoment5.increment(100.0d);
        org.apache.commons.math.stat.descriptive.moment.SecondMoment secondMoment13 = new org.apache.commons.math.stat.descriptive.moment.SecondMoment();
        secondMoment13.increment((double) ' ');
        org.apache.commons.math.stat.descriptive.moment.Variance variance16 = new org.apache.commons.math.stat.descriptive.moment.Variance(secondMoment13);
        secondMoment13.increment((double) (short) -1);
        secondMoment13.clear();
        secondMoment13.increment((double) 0L);
        org.apache.commons.math.stat.descriptive.moment.Variance variance22 = new org.apache.commons.math.stat.descriptive.moment.Variance(secondMoment13);
        long long23 = variance22.getN();
        org.apache.commons.math.stat.descriptive.moment.SecondMoment secondMoment24 = new org.apache.commons.math.stat.descriptive.moment.SecondMoment();
        secondMoment24.increment(1.0d);
        org.apache.commons.math.stat.descriptive.moment.SecondMoment secondMoment27 = new org.apache.commons.math.stat.descriptive.moment.SecondMoment();
        secondMoment27.increment(1.0d);
        secondMoment27.increment((double) (short) 0);
        double double32 = secondMoment27.getResult();
        org.apache.commons.math.stat.descriptive.moment.SecondMoment secondMoment33 = new org.apache.commons.math.stat.descriptive.moment.SecondMoment();
        secondMoment33.increment(1.0d);
        double[] doubleArray39 = new double[] { (-1L), 0, 10L };
        secondMoment33.incrementAll(doubleArray39, 0, 0);
        double double43 = secondMoment27.evaluate(doubleArray39);
        double[] doubleArray44 = new double[] {};
        secondMoment27.incrementAll(doubleArray44);
        double double46 = secondMoment24.evaluate(doubleArray44);
        double double47 = variance22.evaluate(doubleArray44);
        secondMoment5.incrementAll(doubleArray44);
        variance1.incrementAll(doubleArray44);
        double double50 = variance1.getResult();
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 0.0d + "'", double8 == 0.0d);
        org.junit.Assert.assertTrue("'" + long23 + "' != '" + 1L + "'", long23 == 1L);
        org.junit.Assert.assertTrue("'" + double32 + "' != '" + 0.5d + "'", double32 == 0.5d);
        org.junit.Assert.assertNotNull(doubleArray39);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray39), "[-1.0, 0.0, 10.0]");
        org.junit.Assert.assertTrue("'" + double43 + "' != '" + 74.0d + "'", double43 == 74.0d);
        org.junit.Assert.assertNotNull(doubleArray44);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray44), "[]");
        org.junit.Assert.assertTrue("'" + double46 + "' != '" + 0.0d + "'", double46 == 0.0d);
        org.junit.Assert.assertTrue(Double.isNaN(double47));
        org.junit.Assert.assertTrue("'" + double50 + "' != '" + 0.0d + "'", double50 == 0.0d);
    }

    @Test
    public void test13521() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest27.test13521");
        org.apache.commons.math.stat.descriptive.moment.SecondMoment secondMoment0 = new org.apache.commons.math.stat.descriptive.moment.SecondMoment();
        secondMoment0.increment((double) ' ');
        secondMoment0.increment((double) (-1.0f));
        secondMoment0.clear();
        secondMoment0.clear();
        secondMoment0.clear();
        long long8 = secondMoment0.getN();
        long long9 = secondMoment0.getN();
        org.apache.commons.math.stat.descriptive.moment.SecondMoment secondMoment10 = new org.apache.commons.math.stat.descriptive.moment.SecondMoment();
        secondMoment10.increment(1.0d);
        double[] doubleArray16 = new double[] { (-1L), 0, 10L };
        secondMoment10.incrementAll(doubleArray16, 0, 0);
        org.apache.commons.math.stat.descriptive.moment.Variance variance20 = new org.apache.commons.math.stat.descriptive.moment.Variance(secondMoment10);
        org.apache.commons.math.stat.descriptive.moment.SecondMoment secondMoment21 = new org.apache.commons.math.stat.descriptive.moment.SecondMoment();
        secondMoment21.increment((double) ' ');
        secondMoment21.increment((double) (-1.0f));
        secondMoment21.clear();
        boolean boolean27 = variance20.equals((java.lang.Object) secondMoment21);
        double double28 = variance20.getResult();
        variance20.increment(3602.0d);
        org.apache.commons.math.stat.descriptive.moment.SecondMoment secondMoment32 = new org.apache.commons.math.stat.descriptive.moment.SecondMoment();
        secondMoment32.increment(1.0d);
        double[] doubleArray38 = new double[] { (-1L), 0, 10L };
        secondMoment32.incrementAll(doubleArray38, 0, 0);
        double[] doubleArray44 = new double[] { 10, (byte) 100 };
        double double45 = secondMoment32.evaluate(doubleArray44);
        long long46 = secondMoment32.getN();
        double double47 = secondMoment32.getResult();
        org.apache.commons.math.stat.descriptive.moment.Variance variance48 = new org.apache.commons.math.stat.descriptive.moment.Variance(true, secondMoment32);
        long long49 = secondMoment32.getN();
        secondMoment32.increment((double) (short) 1);
        double double52 = secondMoment32.getResult();
        org.apache.commons.math.stat.descriptive.moment.SecondMoment secondMoment54 = new org.apache.commons.math.stat.descriptive.moment.SecondMoment();
        secondMoment54.increment(1.0d);
        secondMoment54.increment((double) (short) 0);
        double double59 = secondMoment54.getResult();
        secondMoment54.clear();
        org.apache.commons.math.stat.descriptive.moment.Variance variance61 = new org.apache.commons.math.stat.descriptive.moment.Variance(false, secondMoment54);
        variance61.increment((double) (short) 0);
        variance61.clear();
        variance61.increment((double) 1L);
        org.apache.commons.math.stat.descriptive.moment.SecondMoment secondMoment67 = new org.apache.commons.math.stat.descriptive.moment.SecondMoment();
        secondMoment67.increment(1.0d);
        double[] doubleArray73 = new double[] { (-1L), 0, 10L };
        secondMoment67.incrementAll(doubleArray73, 0, 0);
        double double77 = variance61.evaluate(doubleArray73);
        double double80 = secondMoment32.evaluate(doubleArray73, 1, (int) (short) 0);
        variance20.incrementAll(doubleArray73, (int) (short) 0, (int) (byte) 0);
        secondMoment0.incrementAll(doubleArray73);
        secondMoment0.increment(846.8333333333334d);
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 0L + "'", long8 == 0L);
        org.junit.Assert.assertTrue("'" + long9 + "' != '" + 0L + "'", long9 == 0L);
        org.junit.Assert.assertNotNull(doubleArray16);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray16), "[-1.0, 0.0, 10.0]");
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + false + "'", boolean27 == false);
        org.junit.Assert.assertTrue("'" + double28 + "' != '" + 0.0d + "'", double28 == 0.0d);
        org.junit.Assert.assertNotNull(doubleArray38);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray38), "[-1.0, 0.0, 10.0]");
        org.junit.Assert.assertNotNull(doubleArray44);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray44), "[10.0, 100.0]");
        org.junit.Assert.assertTrue("'" + double45 + "' != '" + 4050.0d + "'", double45 == 4050.0d);
        org.junit.Assert.assertTrue("'" + long46 + "' != '" + 2L + "'", long46 == 2L);
        org.junit.Assert.assertTrue("'" + double47 + "' != '" + 4050.0d + "'", double47 == 4050.0d);
        org.junit.Assert.assertTrue("'" + long49 + "' != '" + 2L + "'", long49 == 2L);
        org.junit.Assert.assertTrue("'" + double52 + "' != '" + 5994.0d + "'", double52 == 5994.0d);
        org.junit.Assert.assertTrue("'" + double59 + "' != '" + 0.5d + "'", double59 == 0.5d);
        org.junit.Assert.assertNotNull(doubleArray73);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray73), "[-1.0, 0.0, 10.0]");
        org.junit.Assert.assertTrue("'" + double77 + "' != '" + 24.666666666666668d + "'", double77 == 24.666666666666668d);
        org.junit.Assert.assertTrue("'" + double80 + "' != '" + 5994.0d + "'", double80 == 5994.0d);
    }

    @Test
    public void test13522() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest27.test13522");
        org.apache.commons.math.stat.descriptive.moment.SecondMoment secondMoment1 = new org.apache.commons.math.stat.descriptive.moment.SecondMoment();
        secondMoment1.increment((double) ' ');
        org.apache.commons.math.stat.descriptive.moment.Variance variance4 = new org.apache.commons.math.stat.descriptive.moment.Variance(secondMoment1);
        org.apache.commons.math.stat.descriptive.moment.Variance variance5 = new org.apache.commons.math.stat.descriptive.moment.Variance(false, secondMoment1);
        variance5.setBiasCorrected(false);
        boolean boolean8 = variance5.isBiasCorrected();
        variance5.increment((double) 2L);
        org.apache.commons.math.stat.descriptive.moment.SecondMoment secondMoment11 = new org.apache.commons.math.stat.descriptive.moment.SecondMoment();
        secondMoment11.increment((double) ' ');
        org.apache.commons.math.stat.descriptive.moment.Variance variance14 = new org.apache.commons.math.stat.descriptive.moment.Variance(secondMoment11);
        secondMoment11.increment((double) '4');
        org.apache.commons.math.stat.descriptive.moment.SecondMoment secondMoment18 = new org.apache.commons.math.stat.descriptive.moment.SecondMoment();
        secondMoment18.increment(1.0d);
        double[] doubleArray24 = new double[] { (-1L), 0, 10L };
        secondMoment18.incrementAll(doubleArray24, 0, 0);
        double[] doubleArray30 = new double[] { 10, (byte) 100 };
        double double31 = secondMoment18.evaluate(doubleArray30);
        double double32 = secondMoment18.getResult();
        org.apache.commons.math.stat.descriptive.moment.Variance variance33 = new org.apache.commons.math.stat.descriptive.moment.Variance(false, secondMoment18);
        org.apache.commons.math.stat.descriptive.moment.SecondMoment secondMoment34 = new org.apache.commons.math.stat.descriptive.moment.SecondMoment();
        secondMoment34.increment(1.0d);
        secondMoment34.increment((double) (short) 0);
        double double39 = secondMoment34.getResult();
        org.apache.commons.math.stat.descriptive.moment.SecondMoment secondMoment40 = new org.apache.commons.math.stat.descriptive.moment.SecondMoment();
        secondMoment40.increment(1.0d);
        double[] doubleArray46 = new double[] { (-1L), 0, 10L };
        secondMoment40.incrementAll(doubleArray46, 0, 0);
        double double50 = secondMoment34.evaluate(doubleArray46);
        double[] doubleArray51 = new double[] {};
        secondMoment34.incrementAll(doubleArray51);
        variance33.incrementAll(doubleArray51);
        double double54 = secondMoment11.evaluate(doubleArray51);
        org.apache.commons.math.stat.descriptive.moment.SecondMoment secondMoment56 = new org.apache.commons.math.stat.descriptive.moment.SecondMoment();
        secondMoment56.increment(1.0d);
        double[] doubleArray62 = new double[] { (-1L), 0, 10L };
        secondMoment56.incrementAll(doubleArray62, 0, 0);
        double[] doubleArray68 = new double[] { 10, (byte) 100 };
        double double69 = secondMoment56.evaluate(doubleArray68);
        double double70 = secondMoment56.getResult();
        org.apache.commons.math.stat.descriptive.moment.Variance variance71 = new org.apache.commons.math.stat.descriptive.moment.Variance(false, secondMoment56);
        long long72 = secondMoment56.getN();
        double double73 = secondMoment56.getResult();
        boolean boolean74 = secondMoment11.equals((java.lang.Object) secondMoment56);
        boolean boolean75 = variance5.equals((java.lang.Object) secondMoment56);
        double double76 = variance5.getResult();
        variance5.increment(1576.2666666666667d);
        double double79 = variance5.getResult();
        long long80 = variance5.getN();
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNotNull(doubleArray24);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray24), "[-1.0, 0.0, 10.0]");
        org.junit.Assert.assertNotNull(doubleArray30);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray30), "[10.0, 100.0]");
        org.junit.Assert.assertTrue("'" + double31 + "' != '" + 4050.0d + "'", double31 == 4050.0d);
        org.junit.Assert.assertTrue("'" + double32 + "' != '" + 4050.0d + "'", double32 == 4050.0d);
        org.junit.Assert.assertTrue("'" + double39 + "' != '" + 0.5d + "'", double39 == 0.5d);
        org.junit.Assert.assertNotNull(doubleArray46);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray46), "[-1.0, 0.0, 10.0]");
        org.junit.Assert.assertTrue("'" + double50 + "' != '" + 74.0d + "'", double50 == 74.0d);
        org.junit.Assert.assertNotNull(doubleArray51);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray51), "[]");
        org.junit.Assert.assertTrue("'" + double54 + "' != '" + 200.0d + "'", double54 == 200.0d);
        org.junit.Assert.assertNotNull(doubleArray62);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray62), "[-1.0, 0.0, 10.0]");
        org.junit.Assert.assertNotNull(doubleArray68);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray68), "[10.0, 100.0]");
        org.junit.Assert.assertTrue("'" + double69 + "' != '" + 4050.0d + "'", double69 == 4050.0d);
        org.junit.Assert.assertTrue("'" + double70 + "' != '" + 4050.0d + "'", double70 == 4050.0d);
        org.junit.Assert.assertTrue("'" + long72 + "' != '" + 2L + "'", long72 == 2L);
        org.junit.Assert.assertTrue("'" + double73 + "' != '" + 4050.0d + "'", double73 == 4050.0d);
        org.junit.Assert.assertTrue("'" + boolean74 + "' != '" + false + "'", boolean74 == false);
        org.junit.Assert.assertTrue("'" + boolean75 + "' != '" + false + "'", boolean75 == false);
        org.junit.Assert.assertTrue("'" + double76 + "' != '" + 0.0d + "'", double76 == 0.0d);
        org.junit.Assert.assertTrue("'" + double79 + "' != '" + 0.0d + "'", double79 == 0.0d);
        org.junit.Assert.assertTrue("'" + long80 + "' != '" + 1L + "'", long80 == 1L);
    }

    @Test
    public void test13523() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest27.test13523");
        org.apache.commons.math.stat.descriptive.moment.SecondMoment secondMoment0 = new org.apache.commons.math.stat.descriptive.moment.SecondMoment();
        secondMoment0.increment((double) ' ');
        org.apache.commons.math.stat.descriptive.moment.Variance variance3 = new org.apache.commons.math.stat.descriptive.moment.Variance(secondMoment0);
        secondMoment0.increment((double) (short) -1);
        secondMoment0.clear();
        secondMoment0.increment((double) 0L);
        org.apache.commons.math.stat.descriptive.moment.Variance variance9 = new org.apache.commons.math.stat.descriptive.moment.Variance(secondMoment0);
        variance9.clear();
        long long11 = variance9.getN();
        boolean boolean12 = variance9.isBiasCorrected();
        double double13 = variance9.getResult();
        variance9.clear();
        org.junit.Assert.assertTrue("'" + long11 + "' != '" + 1L + "'", long11 == 1L);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 0.0d + "'", double13 == 0.0d);
    }

    @Test
    public void test13524() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest27.test13524");
        org.apache.commons.math.stat.descriptive.moment.SecondMoment secondMoment0 = new org.apache.commons.math.stat.descriptive.moment.SecondMoment();
        secondMoment0.increment((double) ' ');
        secondMoment0.increment((double) (-1.0f));
        secondMoment0.clear();
        double double6 = secondMoment0.getResult();
        org.apache.commons.math.stat.descriptive.moment.Variance variance7 = new org.apache.commons.math.stat.descriptive.moment.Variance(secondMoment0);
        variance7.increment((double) (byte) 100);
        org.apache.commons.math.stat.descriptive.moment.SecondMoment secondMoment10 = new org.apache.commons.math.stat.descriptive.moment.SecondMoment();
        secondMoment10.increment((double) ' ');
        org.apache.commons.math.stat.descriptive.moment.Variance variance13 = new org.apache.commons.math.stat.descriptive.moment.Variance(secondMoment10);
        secondMoment10.increment((double) (short) -1);
        secondMoment10.clear();
        secondMoment10.increment((double) 0L);
        org.apache.commons.math.stat.descriptive.moment.Variance variance19 = new org.apache.commons.math.stat.descriptive.moment.Variance(secondMoment10);
        org.apache.commons.math.stat.descriptive.moment.SecondMoment secondMoment20 = new org.apache.commons.math.stat.descriptive.moment.SecondMoment();
        secondMoment20.increment(1.0d);
        double[] doubleArray26 = new double[] { (-1L), 0, 10L };
        secondMoment20.incrementAll(doubleArray26, 0, 0);
        variance19.incrementAll(doubleArray26);
        variance19.clear();
        variance19.increment((double) 10.0f);
        org.apache.commons.math.stat.descriptive.moment.SecondMoment secondMoment34 = new org.apache.commons.math.stat.descriptive.moment.SecondMoment();
        secondMoment34.increment(1.0d);
        secondMoment34.increment((double) (short) 0);
        double double39 = secondMoment34.getResult();
        org.apache.commons.math.stat.descriptive.moment.SecondMoment secondMoment40 = new org.apache.commons.math.stat.descriptive.moment.SecondMoment();
        secondMoment40.increment(1.0d);
        secondMoment40.increment((double) (short) 0);
        double double45 = secondMoment40.getResult();
        org.apache.commons.math.stat.descriptive.moment.SecondMoment secondMoment46 = new org.apache.commons.math.stat.descriptive.moment.SecondMoment();
        secondMoment46.increment(1.0d);
        double[] doubleArray52 = new double[] { (-1L), 0, 10L };
        secondMoment46.incrementAll(doubleArray52, 0, 0);
        double double56 = secondMoment40.evaluate(doubleArray52);
        double[] doubleArray57 = new double[] {};
        secondMoment40.incrementAll(doubleArray57);
        secondMoment34.incrementAll(doubleArray57);
        secondMoment34.increment((double) 2L);
        org.apache.commons.math.stat.descriptive.moment.Variance variance62 = new org.apache.commons.math.stat.descriptive.moment.Variance(secondMoment34);
        org.apache.commons.math.stat.descriptive.moment.SecondMoment secondMoment63 = new org.apache.commons.math.stat.descriptive.moment.SecondMoment();
        secondMoment63.increment(1.0d);
        double[] doubleArray69 = new double[] { (-1L), 0, 10L };
        secondMoment63.incrementAll(doubleArray69, 0, 0);
        double[] doubleArray75 = new double[] { 10, (byte) 100 };
        double double76 = secondMoment63.evaluate(doubleArray75);
        double double77 = variance62.evaluate(doubleArray75);
        double double79 = variance19.evaluate(doubleArray75, 100.0d);
        boolean boolean80 = variance7.equals((java.lang.Object) doubleArray75);
        boolean boolean81 = variance7.isBiasCorrected();
        double double82 = variance7.getResult();
        double double83 = variance7.getResult();
        org.junit.Assert.assertTrue(Double.isNaN(double6));
        org.junit.Assert.assertNotNull(doubleArray26);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray26), "[-1.0, 0.0, 10.0]");
        org.junit.Assert.assertTrue("'" + double39 + "' != '" + 0.5d + "'", double39 == 0.5d);
        org.junit.Assert.assertTrue("'" + double45 + "' != '" + 0.5d + "'", double45 == 0.5d);
        org.junit.Assert.assertNotNull(doubleArray52);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray52), "[-1.0, 0.0, 10.0]");
        org.junit.Assert.assertTrue("'" + double56 + "' != '" + 74.0d + "'", double56 == 74.0d);
        org.junit.Assert.assertNotNull(doubleArray57);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray57), "[]");
        org.junit.Assert.assertNotNull(doubleArray69);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray69), "[-1.0, 0.0, 10.0]");
        org.junit.Assert.assertNotNull(doubleArray75);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray75), "[10.0, 100.0]");
        org.junit.Assert.assertTrue("'" + double76 + "' != '" + 4050.0d + "'", double76 == 4050.0d);
        org.junit.Assert.assertTrue("'" + double77 + "' != '" + 4050.0d + "'", double77 == 4050.0d);
        org.junit.Assert.assertTrue("'" + double79 + "' != '" + 4050.0d + "'", double79 == 4050.0d);
        org.junit.Assert.assertTrue("'" + boolean80 + "' != '" + false + "'", boolean80 == false);
        org.junit.Assert.assertTrue("'" + boolean81 + "' != '" + true + "'", boolean81 == true);
        org.junit.Assert.assertTrue(Double.isNaN(double82));
        org.junit.Assert.assertTrue(Double.isNaN(double83));
    }

    @Test
    public void test13525() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest27.test13525");
        org.apache.commons.math.stat.descriptive.moment.SecondMoment secondMoment0 = new org.apache.commons.math.stat.descriptive.moment.SecondMoment();
        secondMoment0.increment((double) ' ');
        org.apache.commons.math.stat.descriptive.moment.Variance variance3 = new org.apache.commons.math.stat.descriptive.moment.Variance(secondMoment0);
        secondMoment0.increment((double) (short) -1);
        secondMoment0.clear();
        secondMoment0.increment((double) 0L);
        org.apache.commons.math.stat.descriptive.moment.Variance variance9 = new org.apache.commons.math.stat.descriptive.moment.Variance(secondMoment0);
        org.apache.commons.math.stat.descriptive.moment.SecondMoment secondMoment10 = new org.apache.commons.math.stat.descriptive.moment.SecondMoment();
        secondMoment10.increment(1.0d);
        secondMoment10.increment((double) (short) 0);
        double double15 = secondMoment10.getResult();
        org.apache.commons.math.stat.descriptive.moment.SecondMoment secondMoment16 = new org.apache.commons.math.stat.descriptive.moment.SecondMoment();
        secondMoment16.increment(1.0d);
        double[] doubleArray22 = new double[] { (-1L), 0, 10L };
        secondMoment16.incrementAll(doubleArray22, 0, 0);
        double double26 = secondMoment10.evaluate(doubleArray22);
        double double27 = secondMoment0.evaluate(doubleArray22);
        org.apache.commons.math.stat.descriptive.moment.SecondMoment secondMoment28 = new org.apache.commons.math.stat.descriptive.moment.SecondMoment();
        secondMoment28.increment(1.0d);
        double[] doubleArray34 = new double[] { (-1L), 0, 10L };
        secondMoment28.incrementAll(doubleArray34, 0, 0);
        double[] doubleArray40 = new double[] { 10, (byte) 100 };
        double double41 = secondMoment28.evaluate(doubleArray40);
        double double42 = secondMoment28.getResult();
        secondMoment28.increment((double) (short) -1);
        double[] doubleArray46 = new double[] { (short) 1 };
        secondMoment28.incrementAll(doubleArray46);
        double double48 = secondMoment0.evaluate(doubleArray46);
        secondMoment0.increment((double) (short) 1);
        long long51 = secondMoment0.getN();
        org.apache.commons.math.stat.descriptive.moment.SecondMoment secondMoment52 = new org.apache.commons.math.stat.descriptive.moment.SecondMoment();
        secondMoment52.increment((double) ' ');
        double double55 = secondMoment52.getResult();
        double double56 = secondMoment52.getResult();
        org.apache.commons.math.stat.descriptive.moment.Variance variance58 = new org.apache.commons.math.stat.descriptive.moment.Variance(true);
        org.apache.commons.math.stat.descriptive.moment.Variance variance59 = new org.apache.commons.math.stat.descriptive.moment.Variance();
        org.apache.commons.math.stat.descriptive.moment.SecondMoment secondMoment60 = new org.apache.commons.math.stat.descriptive.moment.SecondMoment();
        secondMoment60.increment(1.0d);
        secondMoment60.increment((double) (short) 0);
        double double65 = secondMoment60.getResult();
        org.apache.commons.math.stat.descriptive.moment.SecondMoment secondMoment66 = new org.apache.commons.math.stat.descriptive.moment.SecondMoment();
        secondMoment66.increment(1.0d);
        double[] doubleArray72 = new double[] { (-1L), 0, 10L };
        secondMoment66.incrementAll(doubleArray72, 0, 0);
        double double76 = secondMoment60.evaluate(doubleArray72);
        double[] doubleArray77 = new double[] {};
        secondMoment60.incrementAll(doubleArray77);
        double double81 = variance59.evaluate(doubleArray77, (int) (byte) 0, 0);
        variance58.incrementAll(doubleArray77);
        double double83 = secondMoment52.evaluate(doubleArray77);
        secondMoment0.incrementAll(doubleArray77);
        org.junit.Assert.assertTrue("'" + double15 + "' != '" + 0.5d + "'", double15 == 0.5d);
        org.junit.Assert.assertNotNull(doubleArray22);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray22), "[-1.0, 0.0, 10.0]");
        org.junit.Assert.assertTrue("'" + double26 + "' != '" + 74.0d + "'", double26 == 74.0d);
        org.junit.Assert.assertTrue("'" + double27 + "' != '" + 74.0d + "'", double27 == 74.0d);
        org.junit.Assert.assertNotNull(doubleArray34);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray34), "[-1.0, 0.0, 10.0]");
        org.junit.Assert.assertNotNull(doubleArray40);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray40), "[10.0, 100.0]");
        org.junit.Assert.assertTrue("'" + double41 + "' != '" + 4050.0d + "'", double41 == 4050.0d);
        org.junit.Assert.assertTrue("'" + double42 + "' != '" + 4050.0d + "'", double42 == 4050.0d);
        org.junit.Assert.assertNotNull(doubleArray46);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray46), "[1.0]");
        org.junit.Assert.assertTrue("'" + double48 + "' != '" + 0.0d + "'", double48 == 0.0d);
        org.junit.Assert.assertTrue("'" + long51 + "' != '" + 2L + "'", long51 == 2L);
        org.junit.Assert.assertTrue("'" + double55 + "' != '" + 0.0d + "'", double55 == 0.0d);
        org.junit.Assert.assertTrue("'" + double56 + "' != '" + 0.0d + "'", double56 == 0.0d);
        org.junit.Assert.assertTrue("'" + double65 + "' != '" + 0.5d + "'", double65 == 0.5d);
        org.junit.Assert.assertNotNull(doubleArray72);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray72), "[-1.0, 0.0, 10.0]");
        org.junit.Assert.assertTrue("'" + double76 + "' != '" + 74.0d + "'", double76 == 74.0d);
        org.junit.Assert.assertNotNull(doubleArray77);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray77), "[]");
        org.junit.Assert.assertTrue(Double.isNaN(double81));
        org.junit.Assert.assertTrue("'" + double83 + "' != '" + 0.0d + "'", double83 == 0.0d);
    }

    @Test
    public void test13526() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest27.test13526");
        org.apache.commons.math.stat.descriptive.moment.SecondMoment secondMoment0 = new org.apache.commons.math.stat.descriptive.moment.SecondMoment();
        secondMoment0.increment((double) ' ');
        org.apache.commons.math.stat.descriptive.moment.Variance variance3 = new org.apache.commons.math.stat.descriptive.moment.Variance(secondMoment0);
        secondMoment0.increment((double) (short) -1);
        secondMoment0.clear();
        secondMoment0.increment((double) 0L);
        org.apache.commons.math.stat.descriptive.moment.Variance variance9 = new org.apache.commons.math.stat.descriptive.moment.Variance(secondMoment0);
        long long10 = variance9.getN();
        variance9.clear();
        variance9.clear();
        boolean boolean13 = variance9.isBiasCorrected();
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + 1L + "'", long10 == 1L);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
    }

    @Test
    public void test13527() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest27.test13527");
        org.apache.commons.math.stat.descriptive.moment.SecondMoment secondMoment0 = new org.apache.commons.math.stat.descriptive.moment.SecondMoment();
        secondMoment0.increment(1.0d);
        double[] doubleArray6 = new double[] { (-1L), 0, 10L };
        secondMoment0.incrementAll(doubleArray6, 0, 0);
        double[] doubleArray12 = new double[] { 10, (byte) 100 };
        double double13 = secondMoment0.evaluate(doubleArray12);
        long long14 = secondMoment0.getN();
        secondMoment0.clear();
        secondMoment0.clear();
        double double17 = secondMoment0.getResult();
        secondMoment0.clear();
        org.apache.commons.math.stat.descriptive.moment.Variance variance19 = new org.apache.commons.math.stat.descriptive.moment.Variance(secondMoment0);
        secondMoment0.increment(5.5310751405070744E14d);
        double double22 = secondMoment0.getResult();
        secondMoment0.increment(110.75d);
        secondMoment0.increment(1874.75d);
        org.junit.Assert.assertNotNull(doubleArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray6), "[-1.0, 0.0, 10.0]");
        org.junit.Assert.assertNotNull(doubleArray12);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray12), "[10.0, 100.0]");
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 4050.0d + "'", double13 == 4050.0d);
        org.junit.Assert.assertTrue("'" + long14 + "' != '" + 2L + "'", long14 == 2L);
        org.junit.Assert.assertTrue(Double.isNaN(double17));
        org.junit.Assert.assertTrue("'" + double22 + "' != '" + 0.0d + "'", double22 == 0.0d);
    }

    @Test
    public void test13528() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest27.test13528");
        org.apache.commons.math.stat.descriptive.moment.SecondMoment secondMoment1 = new org.apache.commons.math.stat.descriptive.moment.SecondMoment();
        secondMoment1.increment((double) ' ');
        org.apache.commons.math.stat.descriptive.moment.Variance variance4 = new org.apache.commons.math.stat.descriptive.moment.Variance(secondMoment1);
        secondMoment1.clear();
        org.apache.commons.math.stat.descriptive.moment.Variance variance6 = new org.apache.commons.math.stat.descriptive.moment.Variance(true, secondMoment1);
        secondMoment1.clear();
        double double8 = secondMoment1.getResult();
        secondMoment1.increment((double) (short) 0);
        double double11 = secondMoment1.getResult();
        org.junit.Assert.assertTrue(Double.isNaN(double8));
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 0.0d + "'", double11 == 0.0d);
    }

    @Test
    public void test13529() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest27.test13529");
        org.apache.commons.math.stat.descriptive.moment.SecondMoment secondMoment0 = new org.apache.commons.math.stat.descriptive.moment.SecondMoment();
        secondMoment0.increment((double) ' ');
        double double3 = secondMoment0.getResult();
        org.apache.commons.math.stat.descriptive.moment.Variance variance4 = new org.apache.commons.math.stat.descriptive.moment.Variance(secondMoment0);
        long long5 = variance4.getN();
        variance4.increment(40.5d);
        variance4.setBiasCorrected(false);
        variance4.clear();
        long long11 = variance4.getN();
        variance4.clear();
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 0.0d + "'", double3 == 0.0d);
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 1L + "'", long5 == 1L);
        org.junit.Assert.assertTrue("'" + long11 + "' != '" + 1L + "'", long11 == 1L);
    }

    @Test
    public void test13530() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest27.test13530");
        org.apache.commons.math.stat.descriptive.moment.Variance variance1 = new org.apache.commons.math.stat.descriptive.moment.Variance(true);
        long long2 = variance1.getN();
        double double3 = variance1.getResult();
        double double4 = variance1.getResult();
        double double5 = variance1.getResult();
        double double6 = variance1.getResult();
        boolean boolean7 = variance1.isBiasCorrected();
        variance1.clear();
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 0L + "'", long2 == 0L);
        org.junit.Assert.assertTrue(Double.isNaN(double3));
        org.junit.Assert.assertTrue(Double.isNaN(double4));
        org.junit.Assert.assertTrue(Double.isNaN(double5));
        org.junit.Assert.assertTrue(Double.isNaN(double6));
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
    }

    @Test
    public void test13531() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest27.test13531");
        org.apache.commons.math.stat.descriptive.moment.SecondMoment secondMoment2 = new org.apache.commons.math.stat.descriptive.moment.SecondMoment();
        secondMoment2.increment((double) ' ');
        org.apache.commons.math.stat.descriptive.moment.Variance variance5 = new org.apache.commons.math.stat.descriptive.moment.Variance(secondMoment2);
        secondMoment2.increment((double) (short) -1);
        long long8 = secondMoment2.getN();
        double double9 = secondMoment2.getResult();
        org.apache.commons.math.stat.descriptive.moment.Variance variance10 = new org.apache.commons.math.stat.descriptive.moment.Variance(false, secondMoment2);
        secondMoment2.increment(2.880385675555556E7d);
        org.apache.commons.math.stat.descriptive.moment.Variance variance13 = new org.apache.commons.math.stat.descriptive.moment.Variance(false, secondMoment2);
        variance13.increment(18066.666666666668d);
        double double16 = variance13.getResult();
        double[] doubleArray17 = null;
        // The following exception was thrown during execution in test generation
        try {
            double double18 = variance13.evaluate(doubleArray17);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: input values array is null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 2L + "'", long8 == 2L);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 544.5d + "'", double9 == 544.5d);
        org.junit.Assert.assertTrue("'" + double16 + "' != '" + 1.843691713502358E14d + "'", double16 == 1.843691713502358E14d);
    }

    @Test
    public void test13532() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest27.test13532");
        org.apache.commons.math.stat.descriptive.moment.Variance variance0 = new org.apache.commons.math.stat.descriptive.moment.Variance();
        org.apache.commons.math.stat.descriptive.moment.SecondMoment secondMoment1 = new org.apache.commons.math.stat.descriptive.moment.SecondMoment();
        secondMoment1.increment(1.0d);
        secondMoment1.increment((double) (short) 0);
        double double6 = secondMoment1.getResult();
        org.apache.commons.math.stat.descriptive.moment.SecondMoment secondMoment7 = new org.apache.commons.math.stat.descriptive.moment.SecondMoment();
        secondMoment7.increment(1.0d);
        double[] doubleArray13 = new double[] { (-1L), 0, 10L };
        secondMoment7.incrementAll(doubleArray13, 0, 0);
        double double17 = secondMoment1.evaluate(doubleArray13);
        double[] doubleArray18 = new double[] {};
        secondMoment1.incrementAll(doubleArray18);
        double double22 = variance0.evaluate(doubleArray18, (int) (byte) 0, 0);
        long long23 = variance0.getN();
        org.apache.commons.math.stat.descriptive.moment.SecondMoment secondMoment24 = new org.apache.commons.math.stat.descriptive.moment.SecondMoment();
        secondMoment24.increment(1.0d);
        secondMoment24.increment((double) (short) 0);
        double double29 = secondMoment24.getResult();
        org.apache.commons.math.stat.descriptive.moment.SecondMoment secondMoment30 = new org.apache.commons.math.stat.descriptive.moment.SecondMoment();
        secondMoment30.increment(1.0d);
        double[] doubleArray36 = new double[] { (-1L), 0, 10L };
        secondMoment30.incrementAll(doubleArray36, 0, 0);
        double double40 = secondMoment24.evaluate(doubleArray36);
        variance0.incrementAll(doubleArray36);
        long long42 = variance0.getN();
        org.apache.commons.math.stat.descriptive.moment.SecondMoment secondMoment43 = new org.apache.commons.math.stat.descriptive.moment.SecondMoment();
        secondMoment43.increment(1.0d);
        org.apache.commons.math.stat.descriptive.moment.SecondMoment secondMoment46 = new org.apache.commons.math.stat.descriptive.moment.SecondMoment();
        secondMoment46.increment(1.0d);
        secondMoment46.increment((double) (short) 0);
        double double51 = secondMoment46.getResult();
        org.apache.commons.math.stat.descriptive.moment.SecondMoment secondMoment52 = new org.apache.commons.math.stat.descriptive.moment.SecondMoment();
        secondMoment52.increment(1.0d);
        double[] doubleArray58 = new double[] { (-1L), 0, 10L };
        secondMoment52.incrementAll(doubleArray58, 0, 0);
        double double62 = secondMoment46.evaluate(doubleArray58);
        double[] doubleArray63 = new double[] {};
        secondMoment46.incrementAll(doubleArray63);
        double double65 = secondMoment43.evaluate(doubleArray63);
        variance0.incrementAll(doubleArray63);
        variance0.clear();
        variance0.setBiasCorrected(false);
        variance0.increment(7881.333333333333d);
        double double72 = variance0.getResult();
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.5d + "'", double6 == 0.5d);
        org.junit.Assert.assertNotNull(doubleArray13);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray13), "[-1.0, 0.0, 10.0]");
        org.junit.Assert.assertTrue("'" + double17 + "' != '" + 74.0d + "'", double17 == 74.0d);
        org.junit.Assert.assertNotNull(doubleArray18);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray18), "[]");
        org.junit.Assert.assertTrue(Double.isNaN(double22));
        org.junit.Assert.assertTrue("'" + long23 + "' != '" + 0L + "'", long23 == 0L);
        org.junit.Assert.assertTrue("'" + double29 + "' != '" + 0.5d + "'", double29 == 0.5d);
        org.junit.Assert.assertNotNull(doubleArray36);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray36), "[-1.0, 0.0, 10.0]");
        org.junit.Assert.assertTrue("'" + double40 + "' != '" + 74.0d + "'", double40 == 74.0d);
        org.junit.Assert.assertTrue("'" + long42 + "' != '" + 3L + "'", long42 == 3L);
        org.junit.Assert.assertTrue("'" + double51 + "' != '" + 0.5d + "'", double51 == 0.5d);
        org.junit.Assert.assertNotNull(doubleArray58);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray58), "[-1.0, 0.0, 10.0]");
        org.junit.Assert.assertTrue("'" + double62 + "' != '" + 74.0d + "'", double62 == 74.0d);
        org.junit.Assert.assertNotNull(doubleArray63);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray63), "[]");
        org.junit.Assert.assertTrue("'" + double65 + "' != '" + 0.0d + "'", double65 == 0.0d);
        org.junit.Assert.assertTrue("'" + double72 + "' != '" + 0.0d + "'", double72 == 0.0d);
    }

    @Test
    public void test13533() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest27.test13533");
        org.apache.commons.math.stat.descriptive.moment.SecondMoment secondMoment2 = new org.apache.commons.math.stat.descriptive.moment.SecondMoment();
        secondMoment2.increment(1.0d);
        double[] doubleArray8 = new double[] { (-1L), 0, 10L };
        secondMoment2.incrementAll(doubleArray8, 0, 0);
        double[] doubleArray14 = new double[] { 10, (byte) 100 };
        double double15 = secondMoment2.evaluate(doubleArray14);
        double double16 = secondMoment2.getResult();
        org.apache.commons.math.stat.descriptive.moment.Variance variance17 = new org.apache.commons.math.stat.descriptive.moment.Variance(false, secondMoment2);
        double double18 = secondMoment2.getResult();
        secondMoment2.increment(1.0d);
        double double21 = secondMoment2.getResult();
        org.apache.commons.math.stat.descriptive.moment.Variance variance22 = new org.apache.commons.math.stat.descriptive.moment.Variance(false, secondMoment2);
        secondMoment2.increment(7836.75d);
        org.junit.Assert.assertNotNull(doubleArray8);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray8), "[-1.0, 0.0, 10.0]");
        org.junit.Assert.assertNotNull(doubleArray14);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray14), "[10.0, 100.0]");
        org.junit.Assert.assertTrue("'" + double15 + "' != '" + 4050.0d + "'", double15 == 4050.0d);
        org.junit.Assert.assertTrue("'" + double16 + "' != '" + 4050.0d + "'", double16 == 4050.0d);
        org.junit.Assert.assertTrue("'" + double18 + "' != '" + 4050.0d + "'", double18 == 4050.0d);
        org.junit.Assert.assertTrue("'" + double21 + "' != '" + 5994.0d + "'", double21 == 5994.0d);
    }

    @Test
    public void test13534() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest27.test13534");
        org.apache.commons.math.stat.descriptive.moment.SecondMoment secondMoment0 = new org.apache.commons.math.stat.descriptive.moment.SecondMoment();
        secondMoment0.increment((double) ' ');
        secondMoment0.increment((double) (-1.0f));
        secondMoment0.clear();
        org.apache.commons.math.stat.descriptive.moment.SecondMoment secondMoment6 = new org.apache.commons.math.stat.descriptive.moment.SecondMoment();
        secondMoment6.increment(1.0d);
        double[] doubleArray12 = new double[] { (-1L), 0, 10L };
        secondMoment6.incrementAll(doubleArray12, 0, 0);
        org.apache.commons.math.stat.descriptive.moment.Variance variance16 = new org.apache.commons.math.stat.descriptive.moment.Variance(secondMoment6);
        long long17 = variance16.getN();
        org.apache.commons.math.stat.descriptive.moment.SecondMoment secondMoment18 = new org.apache.commons.math.stat.descriptive.moment.SecondMoment();
        secondMoment18.increment(1.0d);
        double[] doubleArray24 = new double[] { (-1L), 0, 10L };
        secondMoment18.incrementAll(doubleArray24, 0, 0);
        double double29 = variance16.evaluate(doubleArray24, (double) (short) -1);
        double double30 = secondMoment0.evaluate(doubleArray24);
        secondMoment0.clear();
        double double32 = secondMoment0.getResult();
        double double33 = secondMoment0.getResult();
        org.apache.commons.math.stat.descriptive.moment.Variance variance34 = new org.apache.commons.math.stat.descriptive.moment.Variance(secondMoment0);
        double double35 = secondMoment0.getResult();
        org.junit.Assert.assertNotNull(doubleArray12);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray12), "[-1.0, 0.0, 10.0]");
        org.junit.Assert.assertTrue("'" + long17 + "' != '" + 1L + "'", long17 == 1L);
        org.junit.Assert.assertNotNull(doubleArray24);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray24), "[-1.0, 0.0, 10.0]");
        org.junit.Assert.assertTrue("'" + double29 + "' != '" + 37.0d + "'", double29 == 37.0d);
        org.junit.Assert.assertTrue("'" + double30 + "' != '" + 74.0d + "'", double30 == 74.0d);
        org.junit.Assert.assertTrue(Double.isNaN(double32));
        org.junit.Assert.assertTrue(Double.isNaN(double33));
        org.junit.Assert.assertTrue(Double.isNaN(double35));
    }

    @Test
    public void test13535() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest27.test13535");
        org.apache.commons.math.stat.descriptive.moment.SecondMoment secondMoment0 = new org.apache.commons.math.stat.descriptive.moment.SecondMoment();
        secondMoment0.increment((double) ' ');
        secondMoment0.increment((double) '4');
        long long5 = secondMoment0.getN();
        org.apache.commons.math.stat.descriptive.moment.Variance variance6 = new org.apache.commons.math.stat.descriptive.moment.Variance(secondMoment0);
        double double7 = variance6.getResult();
        variance6.setBiasCorrected(true);
        boolean boolean10 = variance6.isBiasCorrected();
        long long11 = variance6.getN();
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 2L + "'", long5 == 2L);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 200.0d + "'", double7 == 200.0d);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + long11 + "' != '" + 2L + "'", long11 == 2L);
    }

    @Test
    public void test13536() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest27.test13536");
        org.apache.commons.math.stat.descriptive.moment.SecondMoment secondMoment0 = new org.apache.commons.math.stat.descriptive.moment.SecondMoment();
        secondMoment0.increment(1.0d);
        secondMoment0.increment((double) (short) 0);
        long long5 = secondMoment0.getN();
        secondMoment0.increment(0.0d);
        secondMoment0.increment((double) 0);
        org.apache.commons.math.stat.descriptive.moment.Variance variance10 = new org.apache.commons.math.stat.descriptive.moment.Variance(secondMoment0);
        double double11 = variance10.getResult();
        org.apache.commons.math.stat.descriptive.moment.SecondMoment secondMoment13 = new org.apache.commons.math.stat.descriptive.moment.SecondMoment();
        secondMoment13.increment((double) ' ');
        org.apache.commons.math.stat.descriptive.moment.Variance variance16 = new org.apache.commons.math.stat.descriptive.moment.Variance(secondMoment13);
        secondMoment13.clear();
        org.apache.commons.math.stat.descriptive.moment.Variance variance18 = new org.apache.commons.math.stat.descriptive.moment.Variance(true, secondMoment13);
        long long19 = variance18.getN();
        double double20 = variance18.getResult();
        boolean boolean21 = variance18.isBiasCorrected();
        boolean boolean22 = variance18.isBiasCorrected();
        org.apache.commons.math.stat.descriptive.moment.SecondMoment secondMoment23 = new org.apache.commons.math.stat.descriptive.moment.SecondMoment();
        secondMoment23.increment((double) ' ');
        org.apache.commons.math.stat.descriptive.moment.Variance variance26 = new org.apache.commons.math.stat.descriptive.moment.Variance(secondMoment23);
        secondMoment23.increment((double) (short) -1);
        secondMoment23.clear();
        org.apache.commons.math.stat.descriptive.moment.SecondMoment secondMoment30 = new org.apache.commons.math.stat.descriptive.moment.SecondMoment();
        secondMoment30.increment(1.0d);
        double[] doubleArray36 = new double[] { (-1L), 0, 10L };
        secondMoment30.incrementAll(doubleArray36, 0, 0);
        org.apache.commons.math.stat.descriptive.moment.Variance variance40 = new org.apache.commons.math.stat.descriptive.moment.Variance(secondMoment30);
        org.apache.commons.math.stat.descriptive.moment.SecondMoment secondMoment41 = new org.apache.commons.math.stat.descriptive.moment.SecondMoment();
        secondMoment41.increment((double) ' ');
        secondMoment41.increment((double) (-1.0f));
        secondMoment41.clear();
        boolean boolean47 = variance40.equals((java.lang.Object) secondMoment41);
        org.apache.commons.math.stat.descriptive.moment.SecondMoment secondMoment48 = new org.apache.commons.math.stat.descriptive.moment.SecondMoment();
        secondMoment48.increment(1.0d);
        double[] doubleArray54 = new double[] { (-1L), 0, 10L };
        secondMoment48.incrementAll(doubleArray54, 0, 0);
        org.apache.commons.math.stat.descriptive.moment.Variance variance58 = new org.apache.commons.math.stat.descriptive.moment.Variance(secondMoment48);
        long long59 = variance58.getN();
        org.apache.commons.math.stat.descriptive.moment.SecondMoment secondMoment60 = new org.apache.commons.math.stat.descriptive.moment.SecondMoment();
        secondMoment60.increment(1.0d);
        double[] doubleArray66 = new double[] { (-1L), 0, 10L };
        secondMoment60.incrementAll(doubleArray66, 0, 0);
        double double71 = variance58.evaluate(doubleArray66, (double) (short) -1);
        boolean boolean72 = variance40.equals((java.lang.Object) doubleArray66);
        secondMoment23.incrementAll(doubleArray66);
        variance18.incrementAll(doubleArray66);
        double double76 = variance10.evaluate(doubleArray66, 100.0d);
        double[] doubleArray77 = null;
        // The following exception was thrown during execution in test generation
        try {
            double double79 = variance10.evaluate(doubleArray77, 480.5d);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 2L + "'", long5 == 2L);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 0.25d + "'", double11 == 0.25d);
        org.junit.Assert.assertTrue("'" + long19 + "' != '" + 0L + "'", long19 == 0L);
        org.junit.Assert.assertTrue(Double.isNaN(double20));
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + true + "'", boolean21 == true);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + true + "'", boolean22 == true);
        org.junit.Assert.assertNotNull(doubleArray36);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray36), "[-1.0, 0.0, 10.0]");
        org.junit.Assert.assertTrue("'" + boolean47 + "' != '" + false + "'", boolean47 == false);
        org.junit.Assert.assertNotNull(doubleArray54);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray54), "[-1.0, 0.0, 10.0]");
        org.junit.Assert.assertTrue("'" + long59 + "' != '" + 1L + "'", long59 == 1L);
        org.junit.Assert.assertNotNull(doubleArray66);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray66), "[-1.0, 0.0, 10.0]");
        org.junit.Assert.assertTrue("'" + double71 + "' != '" + 37.0d + "'", double71 == 37.0d);
        org.junit.Assert.assertTrue("'" + boolean72 + "' != '" + false + "'", boolean72 == false);
        org.junit.Assert.assertTrue("'" + double76 + "' != '" + 37.0d + "'", double76 == 37.0d);
    }

    @Test
    public void test13537() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest27.test13537");
        org.apache.commons.math.stat.descriptive.moment.SecondMoment secondMoment2 = new org.apache.commons.math.stat.descriptive.moment.SecondMoment();
        secondMoment2.increment(1.0d);
        double[] doubleArray8 = new double[] { (-1L), 0, 10L };
        secondMoment2.incrementAll(doubleArray8, 0, 0);
        double[] doubleArray14 = new double[] { 10, (byte) 100 };
        double double15 = secondMoment2.evaluate(doubleArray14);
        double double16 = secondMoment2.getResult();
        org.apache.commons.math.stat.descriptive.moment.Variance variance17 = new org.apache.commons.math.stat.descriptive.moment.Variance(false, secondMoment2);
        long long18 = secondMoment2.getN();
        org.apache.commons.math.stat.descriptive.moment.Variance variance19 = new org.apache.commons.math.stat.descriptive.moment.Variance(true, secondMoment2);
        double double20 = secondMoment2.getResult();
        long long21 = secondMoment2.getN();
        long long22 = secondMoment2.getN();
        secondMoment2.clear();
        secondMoment2.increment(24.666666666666668d);
        secondMoment2.increment(6.637293823097785E14d);
        org.junit.Assert.assertNotNull(doubleArray8);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray8), "[-1.0, 0.0, 10.0]");
        org.junit.Assert.assertNotNull(doubleArray14);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray14), "[10.0, 100.0]");
        org.junit.Assert.assertTrue("'" + double15 + "' != '" + 4050.0d + "'", double15 == 4050.0d);
        org.junit.Assert.assertTrue("'" + double16 + "' != '" + 4050.0d + "'", double16 == 4050.0d);
        org.junit.Assert.assertTrue("'" + long18 + "' != '" + 2L + "'", long18 == 2L);
        org.junit.Assert.assertTrue("'" + double20 + "' != '" + 4050.0d + "'", double20 == 4050.0d);
        org.junit.Assert.assertTrue("'" + long21 + "' != '" + 2L + "'", long21 == 2L);
        org.junit.Assert.assertTrue("'" + long22 + "' != '" + 2L + "'", long22 == 2L);
    }

    @Test
    public void test13538() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest27.test13538");
        org.apache.commons.math.stat.descriptive.moment.SecondMoment secondMoment1 = new org.apache.commons.math.stat.descriptive.moment.SecondMoment();
        secondMoment1.increment(1.0d);
        double[] doubleArray7 = new double[] { (-1L), 0, 10L };
        secondMoment1.incrementAll(doubleArray7, 0, 0);
        double[] doubleArray13 = new double[] { 10, (byte) 100 };
        double double14 = secondMoment1.evaluate(doubleArray13);
        double double15 = secondMoment1.getResult();
        org.apache.commons.math.stat.descriptive.moment.Variance variance16 = new org.apache.commons.math.stat.descriptive.moment.Variance(false, secondMoment1);
        long long17 = secondMoment1.getN();
        org.apache.commons.math.stat.descriptive.moment.SecondMoment secondMoment18 = new org.apache.commons.math.stat.descriptive.moment.SecondMoment();
        secondMoment18.increment((double) ' ');
        secondMoment18.increment((double) (-1.0f));
        secondMoment18.clear();
        org.apache.commons.math.stat.descriptive.moment.SecondMoment secondMoment24 = new org.apache.commons.math.stat.descriptive.moment.SecondMoment();
        secondMoment24.increment(1.0d);
        double[] doubleArray30 = new double[] { (-1L), 0, 10L };
        secondMoment24.incrementAll(doubleArray30, 0, 0);
        org.apache.commons.math.stat.descriptive.moment.Variance variance34 = new org.apache.commons.math.stat.descriptive.moment.Variance(secondMoment24);
        long long35 = variance34.getN();
        org.apache.commons.math.stat.descriptive.moment.SecondMoment secondMoment36 = new org.apache.commons.math.stat.descriptive.moment.SecondMoment();
        secondMoment36.increment(1.0d);
        double[] doubleArray42 = new double[] { (-1L), 0, 10L };
        secondMoment36.incrementAll(doubleArray42, 0, 0);
        double double47 = variance34.evaluate(doubleArray42, (double) (short) -1);
        double double48 = secondMoment18.evaluate(doubleArray42);
        double double49 = secondMoment1.evaluate(doubleArray42);
        org.apache.commons.math.stat.descriptive.moment.Variance variance50 = new org.apache.commons.math.stat.descriptive.moment.Variance(secondMoment1);
        org.apache.commons.math.stat.descriptive.moment.Variance variance51 = new org.apache.commons.math.stat.descriptive.moment.Variance(secondMoment1);
        secondMoment1.increment(0.0d);
        secondMoment1.increment(3349744.0d);
        secondMoment1.increment((double) 100.0f);
        secondMoment1.increment(1769.25d);
        double double60 = secondMoment1.getResult();
        org.junit.Assert.assertNotNull(doubleArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray7), "[-1.0, 0.0, 10.0]");
        org.junit.Assert.assertNotNull(doubleArray13);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray13), "[10.0, 100.0]");
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + 4050.0d + "'", double14 == 4050.0d);
        org.junit.Assert.assertTrue("'" + double15 + "' != '" + 4050.0d + "'", double15 == 4050.0d);
        org.junit.Assert.assertTrue("'" + long17 + "' != '" + 2L + "'", long17 == 2L);
        org.junit.Assert.assertNotNull(doubleArray30);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray30), "[-1.0, 0.0, 10.0]");
        org.junit.Assert.assertTrue("'" + long35 + "' != '" + 1L + "'", long35 == 1L);
        org.junit.Assert.assertNotNull(doubleArray42);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray42), "[-1.0, 0.0, 10.0]");
        org.junit.Assert.assertTrue("'" + double47 + "' != '" + 37.0d + "'", double47 == 37.0d);
        org.junit.Assert.assertTrue("'" + double48 + "' != '" + 74.0d + "'", double48 == 74.0d);
        org.junit.Assert.assertTrue("'" + double49 + "' != '" + 74.0d + "'", double49 == 74.0d);
        org.junit.Assert.assertTrue("'" + double60 + "' != '" + 9.616020619211838E12d + "'", double60 == 9.616020619211838E12d);
    }

    @Test
    public void test13539() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest27.test13539");
        org.apache.commons.math.stat.descriptive.moment.SecondMoment secondMoment0 = new org.apache.commons.math.stat.descriptive.moment.SecondMoment();
        secondMoment0.increment((double) ' ');
        org.apache.commons.math.stat.descriptive.moment.Variance variance3 = new org.apache.commons.math.stat.descriptive.moment.Variance(secondMoment0);
        secondMoment0.increment((double) (short) -1);
        secondMoment0.clear();
        secondMoment0.increment((double) 0L);
        org.apache.commons.math.stat.descriptive.moment.Variance variance9 = new org.apache.commons.math.stat.descriptive.moment.Variance(secondMoment0);
        org.apache.commons.math.stat.descriptive.moment.SecondMoment secondMoment11 = new org.apache.commons.math.stat.descriptive.moment.SecondMoment();
        secondMoment11.increment(1.0d);
        double[] doubleArray17 = new double[] { (-1L), 0, 10L };
        secondMoment11.incrementAll(doubleArray17, 0, 0);
        double[] doubleArray23 = new double[] { 10, (byte) 100 };
        double double24 = secondMoment11.evaluate(doubleArray23);
        double double25 = secondMoment11.getResult();
        org.apache.commons.math.stat.descriptive.moment.Variance variance26 = new org.apache.commons.math.stat.descriptive.moment.Variance(false, secondMoment11);
        org.apache.commons.math.stat.descriptive.moment.Variance variance27 = new org.apache.commons.math.stat.descriptive.moment.Variance();
        org.apache.commons.math.stat.descriptive.moment.SecondMoment secondMoment28 = new org.apache.commons.math.stat.descriptive.moment.SecondMoment();
        secondMoment28.increment(1.0d);
        secondMoment28.increment((double) (short) 0);
        double double33 = secondMoment28.getResult();
        org.apache.commons.math.stat.descriptive.moment.SecondMoment secondMoment34 = new org.apache.commons.math.stat.descriptive.moment.SecondMoment();
        secondMoment34.increment(1.0d);
        double[] doubleArray40 = new double[] { (-1L), 0, 10L };
        secondMoment34.incrementAll(doubleArray40, 0, 0);
        double double44 = secondMoment28.evaluate(doubleArray40);
        double[] doubleArray45 = new double[] {};
        secondMoment28.incrementAll(doubleArray45);
        double double49 = variance27.evaluate(doubleArray45, (int) (byte) 0, 0);
        double double50 = variance26.evaluate(doubleArray45);
        double double51 = variance9.evaluate(doubleArray45);
        variance9.increment((double) 100L);
        boolean boolean54 = variance9.isBiasCorrected();
        double double55 = variance9.getResult();
        boolean boolean56 = variance9.isBiasCorrected();
        org.junit.Assert.assertNotNull(doubleArray17);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray17), "[-1.0, 0.0, 10.0]");
        org.junit.Assert.assertNotNull(doubleArray23);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray23), "[10.0, 100.0]");
        org.junit.Assert.assertTrue("'" + double24 + "' != '" + 4050.0d + "'", double24 == 4050.0d);
        org.junit.Assert.assertTrue("'" + double25 + "' != '" + 4050.0d + "'", double25 == 4050.0d);
        org.junit.Assert.assertTrue("'" + double33 + "' != '" + 0.5d + "'", double33 == 0.5d);
        org.junit.Assert.assertNotNull(doubleArray40);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray40), "[-1.0, 0.0, 10.0]");
        org.junit.Assert.assertTrue("'" + double44 + "' != '" + 74.0d + "'", double44 == 74.0d);
        org.junit.Assert.assertNotNull(doubleArray45);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray45), "[]");
        org.junit.Assert.assertTrue(Double.isNaN(double49));
        org.junit.Assert.assertTrue(Double.isNaN(double50));
        org.junit.Assert.assertTrue(Double.isNaN(double51));
        org.junit.Assert.assertTrue("'" + boolean54 + "' != '" + true + "'", boolean54 == true);
        org.junit.Assert.assertTrue("'" + double55 + "' != '" + 0.0d + "'", double55 == 0.0d);
        org.junit.Assert.assertTrue("'" + boolean56 + "' != '" + true + "'", boolean56 == true);
    }

    @Test
    public void test13540() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest27.test13540");
        org.apache.commons.math.stat.descriptive.moment.SecondMoment secondMoment1 = new org.apache.commons.math.stat.descriptive.moment.SecondMoment();
        secondMoment1.increment(1.0d);
        secondMoment1.increment((double) (short) 0);
        double double6 = secondMoment1.getResult();
        secondMoment1.clear();
        org.apache.commons.math.stat.descriptive.moment.Variance variance8 = new org.apache.commons.math.stat.descriptive.moment.Variance(false, secondMoment1);
        variance8.increment((double) (short) 0);
        variance8.clear();
        variance8.clear();
        variance8.increment(60.666666666666664d);
        variance8.increment(2048.0d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.5d + "'", double6 == 0.5d);
    }

    @Test
    public void test13541() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest27.test13541");
        org.apache.commons.math.stat.descriptive.moment.SecondMoment secondMoment0 = new org.apache.commons.math.stat.descriptive.moment.SecondMoment();
        secondMoment0.increment((double) ' ');
        org.apache.commons.math.stat.descriptive.moment.Variance variance3 = new org.apache.commons.math.stat.descriptive.moment.Variance(secondMoment0);
        secondMoment0.increment((double) (short) -1);
        secondMoment0.clear();
        double double7 = secondMoment0.getResult();
        org.apache.commons.math.stat.descriptive.moment.SecondMoment secondMoment8 = new org.apache.commons.math.stat.descriptive.moment.SecondMoment();
        secondMoment8.increment(1.0d);
        secondMoment8.increment((double) (short) 0);
        double double13 = secondMoment8.getResult();
        org.apache.commons.math.stat.descriptive.moment.SecondMoment secondMoment14 = new org.apache.commons.math.stat.descriptive.moment.SecondMoment();
        secondMoment14.increment(1.0d);
        double[] doubleArray20 = new double[] { (-1L), 0, 10L };
        secondMoment14.incrementAll(doubleArray20, 0, 0);
        double double24 = secondMoment8.evaluate(doubleArray20);
        secondMoment0.incrementAll(doubleArray20, 0, (int) (short) 0);
        long long28 = secondMoment0.getN();
        secondMoment0.increment((double) 0L);
        secondMoment0.increment((double) 1L);
        org.apache.commons.math.stat.descriptive.moment.Variance variance33 = new org.apache.commons.math.stat.descriptive.moment.Variance(secondMoment0);
        variance33.clear();
        double double35 = variance33.getResult();
        org.junit.Assert.assertTrue(Double.isNaN(double7));
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 0.5d + "'", double13 == 0.5d);
        org.junit.Assert.assertNotNull(doubleArray20);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray20), "[-1.0, 0.0, 10.0]");
        org.junit.Assert.assertTrue("'" + double24 + "' != '" + 74.0d + "'", double24 == 74.0d);
        org.junit.Assert.assertTrue("'" + long28 + "' != '" + 0L + "'", long28 == 0L);
        org.junit.Assert.assertTrue("'" + double35 + "' != '" + 0.5d + "'", double35 == 0.5d);
    }

    @Test
    public void test13542() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest27.test13542");
        org.apache.commons.math.stat.descriptive.moment.SecondMoment secondMoment0 = new org.apache.commons.math.stat.descriptive.moment.SecondMoment();
        secondMoment0.increment(1.0d);
        secondMoment0.increment((double) (short) 0);
        double double5 = secondMoment0.getResult();
        org.apache.commons.math.stat.descriptive.moment.SecondMoment secondMoment6 = new org.apache.commons.math.stat.descriptive.moment.SecondMoment();
        secondMoment6.increment(1.0d);
        secondMoment6.increment((double) (short) 0);
        double double11 = secondMoment6.getResult();
        org.apache.commons.math.stat.descriptive.moment.SecondMoment secondMoment12 = new org.apache.commons.math.stat.descriptive.moment.SecondMoment();
        secondMoment12.increment(1.0d);
        double[] doubleArray18 = new double[] { (-1L), 0, 10L };
        secondMoment12.incrementAll(doubleArray18, 0, 0);
        double double22 = secondMoment6.evaluate(doubleArray18);
        double[] doubleArray23 = new double[] {};
        secondMoment6.incrementAll(doubleArray23);
        secondMoment0.incrementAll(doubleArray23);
        long long26 = secondMoment0.getN();
        secondMoment0.clear();
        double double28 = secondMoment0.getResult();
        org.apache.commons.math.stat.descriptive.moment.SecondMoment secondMoment29 = new org.apache.commons.math.stat.descriptive.moment.SecondMoment();
        secondMoment29.increment(1.0d);
        double[] doubleArray35 = new double[] { (-1L), 0, 10L };
        secondMoment29.incrementAll(doubleArray35, 0, 0);
        double[] doubleArray41 = new double[] { 10, (byte) 100 };
        double double42 = secondMoment29.evaluate(doubleArray41);
        long long43 = secondMoment29.getN();
        secondMoment29.clear();
        double double45 = secondMoment29.getResult();
        secondMoment29.increment((double) 1.0f);
        secondMoment29.increment((-1.0d));
        org.apache.commons.math.stat.descriptive.moment.SecondMoment secondMoment51 = new org.apache.commons.math.stat.descriptive.moment.SecondMoment();
        secondMoment51.increment(1.0d);
        secondMoment51.increment((double) (short) 0);
        long long56 = secondMoment51.getN();
        org.apache.commons.math.stat.descriptive.moment.Variance variance57 = new org.apache.commons.math.stat.descriptive.moment.Variance(false, secondMoment51);
        org.apache.commons.math.stat.descriptive.moment.SecondMoment secondMoment58 = new org.apache.commons.math.stat.descriptive.moment.SecondMoment();
        secondMoment58.increment(1.0d);
        secondMoment58.increment((double) (short) 0);
        double double63 = secondMoment58.getResult();
        org.apache.commons.math.stat.descriptive.moment.SecondMoment secondMoment64 = new org.apache.commons.math.stat.descriptive.moment.SecondMoment();
        secondMoment64.increment(1.0d);
        secondMoment64.increment((double) (short) 0);
        double double69 = secondMoment64.getResult();
        org.apache.commons.math.stat.descriptive.moment.SecondMoment secondMoment70 = new org.apache.commons.math.stat.descriptive.moment.SecondMoment();
        secondMoment70.increment(1.0d);
        double[] doubleArray76 = new double[] { (-1L), 0, 10L };
        secondMoment70.incrementAll(doubleArray76, 0, 0);
        double double80 = secondMoment64.evaluate(doubleArray76);
        double[] doubleArray81 = new double[] {};
        secondMoment64.incrementAll(doubleArray81);
        secondMoment58.incrementAll(doubleArray81);
        secondMoment51.incrementAll(doubleArray81);
        double double85 = secondMoment29.evaluate(doubleArray81);
        boolean boolean86 = secondMoment0.equals((java.lang.Object) doubleArray81);
        secondMoment0.increment((double) 10);
        secondMoment0.increment(4710403.555555556d);
        secondMoment0.clear();
        secondMoment0.increment(684.499999448657d);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.5d + "'", double5 == 0.5d);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 0.5d + "'", double11 == 0.5d);
        org.junit.Assert.assertNotNull(doubleArray18);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray18), "[-1.0, 0.0, 10.0]");
        org.junit.Assert.assertTrue("'" + double22 + "' != '" + 74.0d + "'", double22 == 74.0d);
        org.junit.Assert.assertNotNull(doubleArray23);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray23), "[]");
        org.junit.Assert.assertTrue("'" + long26 + "' != '" + 2L + "'", long26 == 2L);
        org.junit.Assert.assertTrue(Double.isNaN(double28));
        org.junit.Assert.assertNotNull(doubleArray35);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray35), "[-1.0, 0.0, 10.0]");
        org.junit.Assert.assertNotNull(doubleArray41);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray41), "[10.0, 100.0]");
        org.junit.Assert.assertTrue("'" + double42 + "' != '" + 4050.0d + "'", double42 == 4050.0d);
        org.junit.Assert.assertTrue("'" + long43 + "' != '" + 2L + "'", long43 == 2L);
        org.junit.Assert.assertTrue(Double.isNaN(double45));
        org.junit.Assert.assertTrue("'" + long56 + "' != '" + 2L + "'", long56 == 2L);
        org.junit.Assert.assertTrue("'" + double63 + "' != '" + 0.5d + "'", double63 == 0.5d);
        org.junit.Assert.assertTrue("'" + double69 + "' != '" + 0.5d + "'", double69 == 0.5d);
        org.junit.Assert.assertNotNull(doubleArray76);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray76), "[-1.0, 0.0, 10.0]");
        org.junit.Assert.assertTrue("'" + double80 + "' != '" + 74.0d + "'", double80 == 74.0d);
        org.junit.Assert.assertNotNull(doubleArray81);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray81), "[]");
        org.junit.Assert.assertTrue("'" + double85 + "' != '" + 2.0d + "'", double85 == 2.0d);
        org.junit.Assert.assertTrue("'" + boolean86 + "' != '" + false + "'", boolean86 == false);
    }

    @Test
    public void test13543() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest27.test13543");
        org.apache.commons.math.stat.descriptive.moment.SecondMoment secondMoment0 = new org.apache.commons.math.stat.descriptive.moment.SecondMoment();
        secondMoment0.increment((double) ' ');
        org.apache.commons.math.stat.descriptive.moment.Variance variance3 = new org.apache.commons.math.stat.descriptive.moment.Variance(secondMoment0);
        secondMoment0.increment((double) (short) -1);
        secondMoment0.clear();
        secondMoment0.increment((double) 0L);
        org.apache.commons.math.stat.descriptive.moment.Variance variance9 = new org.apache.commons.math.stat.descriptive.moment.Variance(secondMoment0);
        org.apache.commons.math.stat.descriptive.moment.SecondMoment secondMoment11 = new org.apache.commons.math.stat.descriptive.moment.SecondMoment();
        secondMoment11.increment(1.0d);
        double[] doubleArray17 = new double[] { (-1L), 0, 10L };
        secondMoment11.incrementAll(doubleArray17, 0, 0);
        double[] doubleArray23 = new double[] { 10, (byte) 100 };
        double double24 = secondMoment11.evaluate(doubleArray23);
        double double25 = secondMoment11.getResult();
        org.apache.commons.math.stat.descriptive.moment.Variance variance26 = new org.apache.commons.math.stat.descriptive.moment.Variance(false, secondMoment11);
        org.apache.commons.math.stat.descriptive.moment.Variance variance27 = new org.apache.commons.math.stat.descriptive.moment.Variance();
        org.apache.commons.math.stat.descriptive.moment.SecondMoment secondMoment28 = new org.apache.commons.math.stat.descriptive.moment.SecondMoment();
        secondMoment28.increment(1.0d);
        secondMoment28.increment((double) (short) 0);
        double double33 = secondMoment28.getResult();
        org.apache.commons.math.stat.descriptive.moment.SecondMoment secondMoment34 = new org.apache.commons.math.stat.descriptive.moment.SecondMoment();
        secondMoment34.increment(1.0d);
        double[] doubleArray40 = new double[] { (-1L), 0, 10L };
        secondMoment34.incrementAll(doubleArray40, 0, 0);
        double double44 = secondMoment28.evaluate(doubleArray40);
        double[] doubleArray45 = new double[] {};
        secondMoment28.incrementAll(doubleArray45);
        double double49 = variance27.evaluate(doubleArray45, (int) (byte) 0, 0);
        double double50 = variance26.evaluate(doubleArray45);
        double double51 = variance9.evaluate(doubleArray45);
        long long52 = variance9.getN();
        variance9.increment((double) 5L);
        variance9.increment((double) (byte) 1);
        variance9.setBiasCorrected(true);
        org.junit.Assert.assertNotNull(doubleArray17);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray17), "[-1.0, 0.0, 10.0]");
        org.junit.Assert.assertNotNull(doubleArray23);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray23), "[10.0, 100.0]");
        org.junit.Assert.assertTrue("'" + double24 + "' != '" + 4050.0d + "'", double24 == 4050.0d);
        org.junit.Assert.assertTrue("'" + double25 + "' != '" + 4050.0d + "'", double25 == 4050.0d);
        org.junit.Assert.assertTrue("'" + double33 + "' != '" + 0.5d + "'", double33 == 0.5d);
        org.junit.Assert.assertNotNull(doubleArray40);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray40), "[-1.0, 0.0, 10.0]");
        org.junit.Assert.assertTrue("'" + double44 + "' != '" + 74.0d + "'", double44 == 74.0d);
        org.junit.Assert.assertNotNull(doubleArray45);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray45), "[]");
        org.junit.Assert.assertTrue(Double.isNaN(double49));
        org.junit.Assert.assertTrue(Double.isNaN(double50));
        org.junit.Assert.assertTrue(Double.isNaN(double51));
        org.junit.Assert.assertTrue("'" + long52 + "' != '" + 1L + "'", long52 == 1L);
    }

    @Test
    public void test13544() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest27.test13544");
        org.apache.commons.math.stat.descriptive.moment.SecondMoment secondMoment0 = new org.apache.commons.math.stat.descriptive.moment.SecondMoment();
        secondMoment0.increment(1.0d);
        double[] doubleArray6 = new double[] { (-1L), 0, 10L };
        secondMoment0.incrementAll(doubleArray6, 0, 0);
        org.apache.commons.math.stat.descriptive.moment.Variance variance10 = new org.apache.commons.math.stat.descriptive.moment.Variance(secondMoment0);
        org.apache.commons.math.stat.descriptive.moment.SecondMoment secondMoment11 = new org.apache.commons.math.stat.descriptive.moment.SecondMoment();
        secondMoment11.increment(1.0d);
        org.apache.commons.math.stat.descriptive.moment.SecondMoment secondMoment14 = new org.apache.commons.math.stat.descriptive.moment.SecondMoment();
        secondMoment14.increment(1.0d);
        secondMoment14.increment((double) (short) 0);
        double double19 = secondMoment14.getResult();
        org.apache.commons.math.stat.descriptive.moment.SecondMoment secondMoment20 = new org.apache.commons.math.stat.descriptive.moment.SecondMoment();
        secondMoment20.increment(1.0d);
        double[] doubleArray26 = new double[] { (-1L), 0, 10L };
        secondMoment20.incrementAll(doubleArray26, 0, 0);
        double double30 = secondMoment14.evaluate(doubleArray26);
        double[] doubleArray31 = new double[] {};
        secondMoment14.incrementAll(doubleArray31);
        double double33 = secondMoment11.evaluate(doubleArray31);
        double double34 = variance10.evaluate(doubleArray31);
        long long35 = variance10.getN();
        org.apache.commons.math.stat.descriptive.moment.SecondMoment secondMoment36 = new org.apache.commons.math.stat.descriptive.moment.SecondMoment();
        secondMoment36.increment((double) ' ');
        org.apache.commons.math.stat.descriptive.moment.Variance variance39 = new org.apache.commons.math.stat.descriptive.moment.Variance(secondMoment36);
        secondMoment36.increment((double) (short) -1);
        secondMoment36.clear();
        secondMoment36.increment((double) 0L);
        org.apache.commons.math.stat.descriptive.moment.Variance variance45 = new org.apache.commons.math.stat.descriptive.moment.Variance(secondMoment36);
        org.apache.commons.math.stat.descriptive.moment.SecondMoment secondMoment46 = new org.apache.commons.math.stat.descriptive.moment.SecondMoment();
        secondMoment46.increment(1.0d);
        double[] doubleArray52 = new double[] { (-1L), 0, 10L };
        secondMoment46.incrementAll(doubleArray52, 0, 0);
        variance45.incrementAll(doubleArray52);
        long long57 = variance45.getN();
        variance45.clear();
        boolean boolean59 = variance45.isBiasCorrected();
        variance45.setBiasCorrected(false);
        org.apache.commons.math.stat.descriptive.moment.SecondMoment secondMoment62 = new org.apache.commons.math.stat.descriptive.moment.SecondMoment();
        secondMoment62.increment(1.0d);
        double[] doubleArray68 = new double[] { (-1L), 0, 10L };
        secondMoment62.incrementAll(doubleArray68, 0, 0);
        double double73 = variance45.evaluate(doubleArray68, (double) '4');
        double double76 = variance10.evaluate(doubleArray68, 1, (int) (byte) 1);
        variance10.clear();
        variance10.increment(4608.0d);
        variance10.setBiasCorrected(true);
        org.junit.Assert.assertNotNull(doubleArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray6), "[-1.0, 0.0, 10.0]");
        org.junit.Assert.assertTrue("'" + double19 + "' != '" + 0.5d + "'", double19 == 0.5d);
        org.junit.Assert.assertNotNull(doubleArray26);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray26), "[-1.0, 0.0, 10.0]");
        org.junit.Assert.assertTrue("'" + double30 + "' != '" + 74.0d + "'", double30 == 74.0d);
        org.junit.Assert.assertNotNull(doubleArray31);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray31), "[]");
        org.junit.Assert.assertTrue("'" + double33 + "' != '" + 0.0d + "'", double33 == 0.0d);
        org.junit.Assert.assertTrue(Double.isNaN(double34));
        org.junit.Assert.assertTrue("'" + long35 + "' != '" + 1L + "'", long35 == 1L);
        org.junit.Assert.assertNotNull(doubleArray52);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray52), "[-1.0, 0.0, 10.0]");
        org.junit.Assert.assertTrue("'" + long57 + "' != '" + 1L + "'", long57 == 1L);
        org.junit.Assert.assertTrue("'" + boolean59 + "' != '" + true + "'", boolean59 == true);
        org.junit.Assert.assertNotNull(doubleArray68);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray68), "[-1.0, 0.0, 10.0]");
        org.junit.Assert.assertTrue("'" + double73 + "' != '" + 24.666666666666668d + "'", double73 == 24.666666666666668d);
        org.junit.Assert.assertTrue("'" + double76 + "' != '" + 0.0d + "'", double76 == 0.0d);
    }

    @Test
    public void test13545() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest27.test13545");
        org.apache.commons.math.stat.descriptive.moment.SecondMoment secondMoment1 = new org.apache.commons.math.stat.descriptive.moment.SecondMoment();
        secondMoment1.increment(1.0d);
        double[] doubleArray7 = new double[] { (-1L), 0, 10L };
        secondMoment1.incrementAll(doubleArray7, 0, 0);
        double[] doubleArray13 = new double[] { 10, (byte) 100 };
        double double14 = secondMoment1.evaluate(doubleArray13);
        double double15 = secondMoment1.getResult();
        secondMoment1.increment((double) (short) -1);
        org.apache.commons.math.stat.descriptive.moment.SecondMoment secondMoment20 = new org.apache.commons.math.stat.descriptive.moment.SecondMoment();
        secondMoment20.increment(1.0d);
        double[] doubleArray26 = new double[] { (-1L), 0, 10L };
        secondMoment20.incrementAll(doubleArray26, 0, 0);
        double[] doubleArray32 = new double[] { 10, (byte) 100 };
        double double33 = secondMoment20.evaluate(doubleArray32);
        double double34 = secondMoment20.getResult();
        org.apache.commons.math.stat.descriptive.moment.Variance variance35 = new org.apache.commons.math.stat.descriptive.moment.Variance(false, secondMoment20);
        long long36 = secondMoment20.getN();
        org.apache.commons.math.stat.descriptive.moment.Variance variance37 = new org.apache.commons.math.stat.descriptive.moment.Variance(true, secondMoment20);
        org.apache.commons.math.stat.descriptive.moment.SecondMoment secondMoment38 = new org.apache.commons.math.stat.descriptive.moment.SecondMoment();
        secondMoment38.increment((double) ' ');
        org.apache.commons.math.stat.descriptive.moment.Variance variance41 = new org.apache.commons.math.stat.descriptive.moment.Variance(secondMoment38);
        secondMoment38.increment((double) (short) -1);
        secondMoment38.clear();
        secondMoment38.increment((double) 0L);
        org.apache.commons.math.stat.descriptive.moment.Variance variance47 = new org.apache.commons.math.stat.descriptive.moment.Variance(secondMoment38);
        org.apache.commons.math.stat.descriptive.moment.SecondMoment secondMoment48 = new org.apache.commons.math.stat.descriptive.moment.SecondMoment();
        secondMoment48.increment(1.0d);
        double[] doubleArray54 = new double[] { (-1L), 0, 10L };
        secondMoment48.incrementAll(doubleArray54, 0, 0);
        variance47.incrementAll(doubleArray54);
        org.apache.commons.math.stat.descriptive.moment.SecondMoment secondMoment59 = new org.apache.commons.math.stat.descriptive.moment.SecondMoment();
        secondMoment59.increment((double) ' ');
        org.apache.commons.math.stat.descriptive.moment.Variance variance62 = new org.apache.commons.math.stat.descriptive.moment.Variance(secondMoment59);
        secondMoment59.increment((double) (short) -1);
        secondMoment59.clear();
        secondMoment59.increment((double) 0L);
        org.apache.commons.math.stat.descriptive.moment.Variance variance68 = new org.apache.commons.math.stat.descriptive.moment.Variance(secondMoment59);
        org.apache.commons.math.stat.descriptive.moment.SecondMoment secondMoment69 = new org.apache.commons.math.stat.descriptive.moment.SecondMoment();
        secondMoment69.increment(1.0d);
        secondMoment69.increment((double) (short) 0);
        double double74 = secondMoment69.getResult();
        org.apache.commons.math.stat.descriptive.moment.SecondMoment secondMoment75 = new org.apache.commons.math.stat.descriptive.moment.SecondMoment();
        secondMoment75.increment(1.0d);
        double[] doubleArray81 = new double[] { (-1L), 0, 10L };
        secondMoment75.incrementAll(doubleArray81, 0, 0);
        double double85 = secondMoment69.evaluate(doubleArray81);
        double double86 = secondMoment59.evaluate(doubleArray81);
        double double87 = variance47.evaluate(doubleArray81);
        variance37.incrementAll(doubleArray81);
        secondMoment1.incrementAll(doubleArray81);
        long long90 = secondMoment1.getN();
        org.apache.commons.math.stat.descriptive.moment.Variance variance91 = new org.apache.commons.math.stat.descriptive.moment.Variance(false, secondMoment1);
        long long92 = secondMoment1.getN();
        double double93 = secondMoment1.getResult();
        double double94 = secondMoment1.getResult();
        secondMoment1.increment(87550.17386831278d);
        double double97 = secondMoment1.getResult();
        secondMoment1.increment(104716.67631172841d);
        org.junit.Assert.assertNotNull(doubleArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray7), "[-1.0, 0.0, 10.0]");
        org.junit.Assert.assertNotNull(doubleArray13);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray13), "[10.0, 100.0]");
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + 4050.0d + "'", double14 == 4050.0d);
        org.junit.Assert.assertTrue("'" + double15 + "' != '" + 4050.0d + "'", double15 == 4050.0d);
        org.junit.Assert.assertNotNull(doubleArray26);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray26), "[-1.0, 0.0, 10.0]");
        org.junit.Assert.assertNotNull(doubleArray32);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray32), "[10.0, 100.0]");
        org.junit.Assert.assertTrue("'" + double33 + "' != '" + 4050.0d + "'", double33 == 4050.0d);
        org.junit.Assert.assertTrue("'" + double34 + "' != '" + 4050.0d + "'", double34 == 4050.0d);
        org.junit.Assert.assertTrue("'" + long36 + "' != '" + 2L + "'", long36 == 2L);
        org.junit.Assert.assertNotNull(doubleArray54);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray54), "[-1.0, 0.0, 10.0]");
        org.junit.Assert.assertTrue("'" + double74 + "' != '" + 0.5d + "'", double74 == 0.5d);
        org.junit.Assert.assertNotNull(doubleArray81);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray81), "[-1.0, 0.0, 10.0]");
        org.junit.Assert.assertTrue("'" + double85 + "' != '" + 74.0d + "'", double85 == 74.0d);
        org.junit.Assert.assertTrue("'" + double86 + "' != '" + 74.0d + "'", double86 == 74.0d);
        org.junit.Assert.assertTrue("'" + double87 + "' != '" + 37.0d + "'", double87 == 37.0d);
        org.junit.Assert.assertTrue("'" + long90 + "' != '" + 6L + "'", long90 == 6L);
        org.junit.Assert.assertTrue("'" + long92 + "' != '" + 6L + "'", long92 == 6L);
        org.junit.Assert.assertTrue("'" + double93 + "' != '" + 7881.333333333333d + "'", double93 == 7881.333333333333d);
        org.junit.Assert.assertTrue("'" + double94 + "' != '" + 7881.333333333333d + "'", double94 == 7881.333333333333d);
        org.junit.Assert.assertTrue("'" + double97 + "' != '" + 6.567084759313979E9d + "'", double97 == 6.567084759313979E9d);
    }

    @Test
    public void test13546() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest27.test13546");
        org.apache.commons.math.stat.descriptive.moment.SecondMoment secondMoment3 = new org.apache.commons.math.stat.descriptive.moment.SecondMoment();
        secondMoment3.increment(1.0d);
        double[] doubleArray9 = new double[] { (-1L), 0, 10L };
        secondMoment3.incrementAll(doubleArray9, 0, 0);
        double[] doubleArray15 = new double[] { 10, (byte) 100 };
        double double16 = secondMoment3.evaluate(doubleArray15);
        double double17 = secondMoment3.getResult();
        org.apache.commons.math.stat.descriptive.moment.Variance variance18 = new org.apache.commons.math.stat.descriptive.moment.Variance(false, secondMoment3);
        long long19 = secondMoment3.getN();
        org.apache.commons.math.stat.descriptive.moment.Variance variance20 = new org.apache.commons.math.stat.descriptive.moment.Variance(true, secondMoment3);
        double double21 = secondMoment3.getResult();
        secondMoment3.clear();
        secondMoment3.increment(Double.NaN);
        secondMoment3.clear();
        org.apache.commons.math.stat.descriptive.moment.Variance variance26 = new org.apache.commons.math.stat.descriptive.moment.Variance(false, secondMoment3);
        secondMoment3.clear();
        org.junit.Assert.assertNotNull(doubleArray9);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray9), "[-1.0, 0.0, 10.0]");
        org.junit.Assert.assertNotNull(doubleArray15);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray15), "[10.0, 100.0]");
        org.junit.Assert.assertTrue("'" + double16 + "' != '" + 4050.0d + "'", double16 == 4050.0d);
        org.junit.Assert.assertTrue("'" + double17 + "' != '" + 4050.0d + "'", double17 == 4050.0d);
        org.junit.Assert.assertTrue("'" + long19 + "' != '" + 2L + "'", long19 == 2L);
        org.junit.Assert.assertTrue("'" + double21 + "' != '" + 4050.0d + "'", double21 == 4050.0d);
    }

    @Test
    public void test13547() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest27.test13547");
        org.apache.commons.math.stat.descriptive.moment.SecondMoment secondMoment0 = new org.apache.commons.math.stat.descriptive.moment.SecondMoment();
        secondMoment0.increment((double) ' ');
        org.apache.commons.math.stat.descriptive.moment.Variance variance3 = new org.apache.commons.math.stat.descriptive.moment.Variance(secondMoment0);
        secondMoment0.increment((double) (short) -1);
        secondMoment0.clear();
        secondMoment0.increment((double) 0L);
        org.apache.commons.math.stat.descriptive.moment.Variance variance9 = new org.apache.commons.math.stat.descriptive.moment.Variance(secondMoment0);
        long long10 = variance9.getN();
        variance9.increment(200.0d);
        org.apache.commons.math.stat.descriptive.moment.SecondMoment secondMoment14 = new org.apache.commons.math.stat.descriptive.moment.SecondMoment();
        secondMoment14.increment((double) ' ');
        org.apache.commons.math.stat.descriptive.moment.Variance variance17 = new org.apache.commons.math.stat.descriptive.moment.Variance(secondMoment14);
        secondMoment14.increment((double) (short) -1);
        long long20 = secondMoment14.getN();
        org.apache.commons.math.stat.descriptive.moment.Variance variance21 = new org.apache.commons.math.stat.descriptive.moment.Variance(false, secondMoment14);
        org.apache.commons.math.stat.descriptive.moment.SecondMoment secondMoment22 = new org.apache.commons.math.stat.descriptive.moment.SecondMoment();
        secondMoment22.increment(1.0d);
        double[] doubleArray28 = new double[] { (-1L), 0, 10L };
        secondMoment22.incrementAll(doubleArray28, 0, 0);
        double double33 = variance21.evaluate(doubleArray28, (double) 1L);
        org.apache.commons.math.stat.descriptive.moment.SecondMoment secondMoment34 = new org.apache.commons.math.stat.descriptive.moment.SecondMoment();
        secondMoment34.increment(1.0d);
        double[] doubleArray40 = new double[] { (-1L), 0, 10L };
        secondMoment34.incrementAll(doubleArray40, 0, 0);
        double[] doubleArray46 = new double[] { 10, (byte) 100 };
        double double47 = secondMoment34.evaluate(doubleArray46);
        double double49 = variance21.evaluate(doubleArray46, 0.0d);
        double double50 = variance9.evaluate(doubleArray46);
        org.apache.commons.math.stat.descriptive.moment.SecondMoment secondMoment51 = new org.apache.commons.math.stat.descriptive.moment.SecondMoment();
        secondMoment51.increment(1.0d);
        double[] doubleArray57 = new double[] { (-1L), 0, 10L };
        secondMoment51.incrementAll(doubleArray57, 0, 0);
        double[] doubleArray63 = new double[] { 10, (byte) 100 };
        double double64 = secondMoment51.evaluate(doubleArray63);
        long long65 = secondMoment51.getN();
        secondMoment51.clear();
        secondMoment51.clear();
        double double68 = secondMoment51.getResult();
        secondMoment51.clear();
        org.apache.commons.math.stat.descriptive.moment.Variance variance70 = new org.apache.commons.math.stat.descriptive.moment.Variance(secondMoment51);
        boolean boolean71 = variance9.equals((java.lang.Object) variance70);
        boolean boolean72 = variance9.isBiasCorrected();
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + 1L + "'", long10 == 1L);
        org.junit.Assert.assertTrue("'" + long20 + "' != '" + 2L + "'", long20 == 2L);
        org.junit.Assert.assertNotNull(doubleArray28);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray28), "[-1.0, 0.0, 10.0]");
        org.junit.Assert.assertTrue("'" + double33 + "' != '" + 24.666666666666668d + "'", double33 == 24.666666666666668d);
        org.junit.Assert.assertNotNull(doubleArray40);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray40), "[-1.0, 0.0, 10.0]");
        org.junit.Assert.assertNotNull(doubleArray46);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray46), "[10.0, 100.0]");
        org.junit.Assert.assertTrue("'" + double47 + "' != '" + 4050.0d + "'", double47 == 4050.0d);
        org.junit.Assert.assertTrue("'" + double49 + "' != '" + 2025.0d + "'", double49 == 2025.0d);
        org.junit.Assert.assertTrue("'" + double50 + "' != '" + 4050.0d + "'", double50 == 4050.0d);
        org.junit.Assert.assertNotNull(doubleArray57);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray57), "[-1.0, 0.0, 10.0]");
        org.junit.Assert.assertNotNull(doubleArray63);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray63), "[10.0, 100.0]");
        org.junit.Assert.assertTrue("'" + double64 + "' != '" + 4050.0d + "'", double64 == 4050.0d);
        org.junit.Assert.assertTrue("'" + long65 + "' != '" + 2L + "'", long65 == 2L);
        org.junit.Assert.assertTrue(Double.isNaN(double68));
        org.junit.Assert.assertTrue("'" + boolean71 + "' != '" + false + "'", boolean71 == false);
        org.junit.Assert.assertTrue("'" + boolean72 + "' != '" + true + "'", boolean72 == true);
    }

    @Test
    public void test13548() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest27.test13548");
        org.apache.commons.math.stat.descriptive.moment.SecondMoment secondMoment0 = new org.apache.commons.math.stat.descriptive.moment.SecondMoment();
        secondMoment0.increment(1.0d);
        double[] doubleArray6 = new double[] { (-1L), 0, 10L };
        secondMoment0.incrementAll(doubleArray6, 0, 0);
        org.apache.commons.math.stat.descriptive.moment.Variance variance10 = new org.apache.commons.math.stat.descriptive.moment.Variance(secondMoment0);
        long long11 = variance10.getN();
        org.apache.commons.math.stat.descriptive.moment.SecondMoment secondMoment12 = new org.apache.commons.math.stat.descriptive.moment.SecondMoment();
        secondMoment12.increment(1.0d);
        double[] doubleArray18 = new double[] { (-1L), 0, 10L };
        secondMoment12.incrementAll(doubleArray18, 0, 0);
        double double23 = variance10.evaluate(doubleArray18, (double) (short) -1);
        variance10.clear();
        variance10.increment(0.3333333333333333d);
        org.junit.Assert.assertNotNull(doubleArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray6), "[-1.0, 0.0, 10.0]");
        org.junit.Assert.assertTrue("'" + long11 + "' != '" + 1L + "'", long11 == 1L);
        org.junit.Assert.assertNotNull(doubleArray18);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray18), "[-1.0, 0.0, 10.0]");
        org.junit.Assert.assertTrue("'" + double23 + "' != '" + 37.0d + "'", double23 == 37.0d);
    }

    @Test
    public void test13549() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest27.test13549");
        org.apache.commons.math.stat.descriptive.moment.SecondMoment secondMoment0 = new org.apache.commons.math.stat.descriptive.moment.SecondMoment();
        secondMoment0.increment((double) ' ');
        secondMoment0.increment((double) (byte) 0);
        secondMoment0.increment((double) 'a');
        org.apache.commons.math.stat.descriptive.moment.SecondMoment secondMoment7 = new org.apache.commons.math.stat.descriptive.moment.SecondMoment();
        secondMoment7.increment((double) ' ');
        org.apache.commons.math.stat.descriptive.moment.Variance variance10 = new org.apache.commons.math.stat.descriptive.moment.Variance(secondMoment7);
        secondMoment7.increment((double) (short) -1);
        org.apache.commons.math.stat.descriptive.moment.SecondMoment secondMoment13 = new org.apache.commons.math.stat.descriptive.moment.SecondMoment();
        secondMoment13.increment(1.0d);
        double[] doubleArray19 = new double[] { (-1L), 0, 10L };
        secondMoment13.incrementAll(doubleArray19, 0, 0);
        org.apache.commons.math.stat.descriptive.moment.Variance variance23 = new org.apache.commons.math.stat.descriptive.moment.Variance(secondMoment13);
        long long24 = variance23.getN();
        org.apache.commons.math.stat.descriptive.moment.SecondMoment secondMoment25 = new org.apache.commons.math.stat.descriptive.moment.SecondMoment();
        secondMoment25.increment(1.0d);
        double[] doubleArray31 = new double[] { (-1L), 0, 10L };
        secondMoment25.incrementAll(doubleArray31, 0, 0);
        double double36 = variance23.evaluate(doubleArray31, (double) (short) -1);
        double double37 = secondMoment7.evaluate(doubleArray31);
        double double38 = secondMoment0.evaluate(doubleArray31);
        org.junit.Assert.assertNotNull(doubleArray19);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray19), "[-1.0, 0.0, 10.0]");
        org.junit.Assert.assertTrue("'" + long24 + "' != '" + 1L + "'", long24 == 1L);
        org.junit.Assert.assertNotNull(doubleArray31);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray31), "[-1.0, 0.0, 10.0]");
        org.junit.Assert.assertTrue("'" + double36 + "' != '" + 37.0d + "'", double36 == 37.0d);
        org.junit.Assert.assertTrue("'" + double37 + "' != '" + 74.0d + "'", double37 == 74.0d);
        org.junit.Assert.assertTrue("'" + double38 + "' != '" + 74.0d + "'", double38 == 74.0d);
    }

    @Test
    public void test13550() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest27.test13550");
        org.apache.commons.math.stat.descriptive.moment.SecondMoment secondMoment2 = new org.apache.commons.math.stat.descriptive.moment.SecondMoment();
        secondMoment2.increment(1.0d);
        double[] doubleArray8 = new double[] { (-1L), 0, 10L };
        secondMoment2.incrementAll(doubleArray8, 0, 0);
        double[] doubleArray14 = new double[] { 10, (byte) 100 };
        double double15 = secondMoment2.evaluate(doubleArray14);
        double double16 = secondMoment2.getResult();
        org.apache.commons.math.stat.descriptive.moment.Variance variance17 = new org.apache.commons.math.stat.descriptive.moment.Variance(false, secondMoment2);
        long long18 = secondMoment2.getN();
        org.apache.commons.math.stat.descriptive.moment.Variance variance19 = new org.apache.commons.math.stat.descriptive.moment.Variance(true, secondMoment2);
        org.apache.commons.math.stat.descriptive.moment.SecondMoment secondMoment20 = new org.apache.commons.math.stat.descriptive.moment.SecondMoment();
        secondMoment20.increment((double) ' ');
        org.apache.commons.math.stat.descriptive.moment.Variance variance23 = new org.apache.commons.math.stat.descriptive.moment.Variance(secondMoment20);
        secondMoment20.increment((double) (short) -1);
        secondMoment20.clear();
        secondMoment20.increment((double) 'a');
        org.apache.commons.math.stat.descriptive.moment.SecondMoment secondMoment29 = new org.apache.commons.math.stat.descriptive.moment.SecondMoment();
        secondMoment29.increment(1.0d);
        secondMoment29.increment((double) (short) 0);
        boolean boolean34 = secondMoment20.equals((java.lang.Object) secondMoment29);
        boolean boolean35 = variance19.equals((java.lang.Object) secondMoment29);
        double double36 = variance19.getResult();
        org.junit.Assert.assertNotNull(doubleArray8);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray8), "[-1.0, 0.0, 10.0]");
        org.junit.Assert.assertNotNull(doubleArray14);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray14), "[10.0, 100.0]");
        org.junit.Assert.assertTrue("'" + double15 + "' != '" + 4050.0d + "'", double15 == 4050.0d);
        org.junit.Assert.assertTrue("'" + double16 + "' != '" + 4050.0d + "'", double16 == 4050.0d);
        org.junit.Assert.assertTrue("'" + long18 + "' != '" + 2L + "'", long18 == 2L);
        org.junit.Assert.assertTrue("'" + boolean34 + "' != '" + false + "'", boolean34 == false);
        org.junit.Assert.assertTrue("'" + boolean35 + "' != '" + false + "'", boolean35 == false);
        org.junit.Assert.assertTrue("'" + double36 + "' != '" + 4050.0d + "'", double36 == 4050.0d);
    }

    @Test
    public void test13551() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest27.test13551");
        org.apache.commons.math.stat.descriptive.moment.SecondMoment secondMoment1 = new org.apache.commons.math.stat.descriptive.moment.SecondMoment();
        secondMoment1.increment((double) ' ');
        secondMoment1.increment((double) (-1.0f));
        double double6 = secondMoment1.getResult();
        org.apache.commons.math.stat.descriptive.moment.Variance variance7 = new org.apache.commons.math.stat.descriptive.moment.Variance(secondMoment1);
        secondMoment1.clear();
        secondMoment1.clear();
        org.apache.commons.math.stat.descriptive.moment.SecondMoment secondMoment11 = new org.apache.commons.math.stat.descriptive.moment.SecondMoment();
        secondMoment11.increment(1.0d);
        double[] doubleArray17 = new double[] { (-1L), 0, 10L };
        secondMoment11.incrementAll(doubleArray17, 0, 0);
        double[] doubleArray23 = new double[] { 10, (byte) 100 };
        double double24 = secondMoment11.evaluate(doubleArray23);
        org.apache.commons.math.stat.descriptive.moment.SecondMoment secondMoment26 = new org.apache.commons.math.stat.descriptive.moment.SecondMoment();
        secondMoment26.increment((double) ' ');
        org.apache.commons.math.stat.descriptive.moment.Variance variance29 = new org.apache.commons.math.stat.descriptive.moment.Variance(secondMoment26);
        secondMoment26.increment((double) (short) -1);
        secondMoment26.clear();
        secondMoment26.increment((double) 0L);
        org.apache.commons.math.stat.descriptive.moment.Variance variance35 = new org.apache.commons.math.stat.descriptive.moment.Variance(false, secondMoment26);
        boolean boolean36 = secondMoment11.equals((java.lang.Object) secondMoment26);
        org.apache.commons.math.stat.descriptive.moment.Variance variance37 = new org.apache.commons.math.stat.descriptive.moment.Variance(false, secondMoment26);
        boolean boolean38 = variance37.isBiasCorrected();
        variance37.increment(4.321154463792899E13d);
        boolean boolean41 = variance37.isBiasCorrected();
        variance37.clear();
        double double43 = variance37.getResult();
        variance37.increment(5944.0d);
        org.apache.commons.math.stat.descriptive.moment.SecondMoment secondMoment46 = new org.apache.commons.math.stat.descriptive.moment.SecondMoment();
        secondMoment46.increment((double) ' ');
        org.apache.commons.math.stat.descriptive.moment.Variance variance49 = new org.apache.commons.math.stat.descriptive.moment.Variance(secondMoment46);
        secondMoment46.increment((double) (short) -1);
        secondMoment46.clear();
        secondMoment46.increment((double) 0L);
        org.apache.commons.math.stat.descriptive.moment.Variance variance55 = new org.apache.commons.math.stat.descriptive.moment.Variance(secondMoment46);
        org.apache.commons.math.stat.descriptive.moment.SecondMoment secondMoment56 = new org.apache.commons.math.stat.descriptive.moment.SecondMoment();
        secondMoment56.increment(1.0d);
        double[] doubleArray62 = new double[] { (-1L), 0, 10L };
        secondMoment56.incrementAll(doubleArray62, 0, 0);
        variance55.incrementAll(doubleArray62);
        variance37.incrementAll(doubleArray62);
        secondMoment1.incrementAll(doubleArray62);
        org.apache.commons.math.stat.descriptive.moment.Variance variance69 = new org.apache.commons.math.stat.descriptive.moment.Variance(false, secondMoment1);
        variance69.increment(6.222464933786481E14d);
        variance69.clear();
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 544.5d + "'", double6 == 544.5d);
        org.junit.Assert.assertNotNull(doubleArray17);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray17), "[-1.0, 0.0, 10.0]");
        org.junit.Assert.assertNotNull(doubleArray23);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray23), "[10.0, 100.0]");
        org.junit.Assert.assertTrue("'" + double24 + "' != '" + 4050.0d + "'", double24 == 4050.0d);
        org.junit.Assert.assertTrue("'" + boolean36 + "' != '" + false + "'", boolean36 == false);
        org.junit.Assert.assertTrue("'" + boolean38 + "' != '" + false + "'", boolean38 == false);
        org.junit.Assert.assertTrue("'" + boolean41 + "' != '" + false + "'", boolean41 == false);
        org.junit.Assert.assertTrue("'" + double43 + "' != '" + 0.0d + "'", double43 == 0.0d);
        org.junit.Assert.assertNotNull(doubleArray62);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray62), "[-1.0, 0.0, 10.0]");
    }

    @Test
    public void test13552() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest27.test13552");
        org.apache.commons.math.stat.descriptive.moment.SecondMoment secondMoment1 = new org.apache.commons.math.stat.descriptive.moment.SecondMoment();
        secondMoment1.increment((double) ' ');
        org.apache.commons.math.stat.descriptive.moment.Variance variance4 = new org.apache.commons.math.stat.descriptive.moment.Variance(secondMoment1);
        secondMoment1.increment((double) (short) -1);
        secondMoment1.clear();
        double double8 = secondMoment1.getResult();
        org.apache.commons.math.stat.descriptive.moment.SecondMoment secondMoment9 = new org.apache.commons.math.stat.descriptive.moment.SecondMoment();
        secondMoment9.increment(1.0d);
        secondMoment9.increment((double) (short) 0);
        double double14 = secondMoment9.getResult();
        org.apache.commons.math.stat.descriptive.moment.SecondMoment secondMoment15 = new org.apache.commons.math.stat.descriptive.moment.SecondMoment();
        secondMoment15.increment(1.0d);
        double[] doubleArray21 = new double[] { (-1L), 0, 10L };
        secondMoment15.incrementAll(doubleArray21, 0, 0);
        double double25 = secondMoment9.evaluate(doubleArray21);
        secondMoment1.incrementAll(doubleArray21, 0, (int) (short) 0);
        secondMoment1.clear();
        double double30 = secondMoment1.getResult();
        org.apache.commons.math.stat.descriptive.moment.Variance variance31 = new org.apache.commons.math.stat.descriptive.moment.Variance(false, secondMoment1);
        boolean boolean32 = variance31.isBiasCorrected();
        long long33 = variance31.getN();
        variance31.setBiasCorrected(true);
        double double36 = variance31.getResult();
        variance31.increment(37.5d);
        long long39 = variance31.getN();
        org.junit.Assert.assertTrue(Double.isNaN(double8));
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + 0.5d + "'", double14 == 0.5d);
        org.junit.Assert.assertNotNull(doubleArray21);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray21), "[-1.0, 0.0, 10.0]");
        org.junit.Assert.assertTrue("'" + double25 + "' != '" + 74.0d + "'", double25 == 74.0d);
        org.junit.Assert.assertTrue(Double.isNaN(double30));
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + false + "'", boolean32 == false);
        org.junit.Assert.assertTrue("'" + long33 + "' != '" + 0L + "'", long33 == 0L);
        org.junit.Assert.assertTrue(Double.isNaN(double36));
        org.junit.Assert.assertTrue("'" + long39 + "' != '" + 0L + "'", long39 == 0L);
    }

    @Test
    public void test13553() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest27.test13553");
        org.apache.commons.math.stat.descriptive.moment.SecondMoment secondMoment0 = new org.apache.commons.math.stat.descriptive.moment.SecondMoment();
        secondMoment0.increment(1.0d);
        secondMoment0.increment((double) (short) 0);
        double double5 = secondMoment0.getResult();
        long long6 = secondMoment0.getN();
        double double7 = secondMoment0.getResult();
        org.apache.commons.math.stat.descriptive.moment.Variance variance8 = new org.apache.commons.math.stat.descriptive.moment.Variance(secondMoment0);
        org.apache.commons.math.stat.descriptive.moment.SecondMoment secondMoment9 = new org.apache.commons.math.stat.descriptive.moment.SecondMoment();
        secondMoment9.increment(1.0d);
        double[] doubleArray15 = new double[] { (-1L), 0, 10L };
        secondMoment9.incrementAll(doubleArray15, 0, 0);
        long long19 = secondMoment9.getN();
        org.apache.commons.math.stat.descriptive.moment.Variance variance20 = new org.apache.commons.math.stat.descriptive.moment.Variance(secondMoment9);
        double double21 = variance20.getResult();
        org.apache.commons.math.stat.descriptive.moment.Variance variance23 = new org.apache.commons.math.stat.descriptive.moment.Variance(true);
        long long24 = variance23.getN();
        double double25 = variance23.getResult();
        variance23.clear();
        org.apache.commons.math.stat.descriptive.moment.SecondMoment secondMoment27 = new org.apache.commons.math.stat.descriptive.moment.SecondMoment();
        secondMoment27.increment((double) ' ');
        org.apache.commons.math.stat.descriptive.moment.Variance variance30 = new org.apache.commons.math.stat.descriptive.moment.Variance(secondMoment27);
        org.apache.commons.math.stat.descriptive.moment.SecondMoment secondMoment32 = new org.apache.commons.math.stat.descriptive.moment.SecondMoment();
        secondMoment32.increment(1.0d);
        secondMoment32.increment((double) (short) 0);
        double double37 = secondMoment32.getResult();
        org.apache.commons.math.stat.descriptive.moment.SecondMoment secondMoment39 = new org.apache.commons.math.stat.descriptive.moment.SecondMoment();
        secondMoment39.increment(1.0d);
        double[] doubleArray45 = new double[] { (-1L), 0, 10L };
        secondMoment39.incrementAll(doubleArray45, 0, 0);
        double[] doubleArray51 = new double[] { 10, (byte) 100 };
        double double52 = secondMoment39.evaluate(doubleArray51);
        double double53 = secondMoment39.getResult();
        long long54 = secondMoment39.getN();
        long long55 = secondMoment39.getN();
        org.apache.commons.math.stat.descriptive.moment.Variance variance56 = new org.apache.commons.math.stat.descriptive.moment.Variance(true, secondMoment39);
        boolean boolean57 = secondMoment32.equals((java.lang.Object) secondMoment39);
        org.apache.commons.math.stat.descriptive.moment.Variance variance58 = new org.apache.commons.math.stat.descriptive.moment.Variance(false, secondMoment32);
        org.apache.commons.math.stat.descriptive.moment.Variance variance59 = new org.apache.commons.math.stat.descriptive.moment.Variance(secondMoment32);
        variance59.clear();
        variance59.clear();
        double double62 = variance59.getResult();
        variance59.clear();
        long long64 = variance59.getN();
        org.apache.commons.math.stat.descriptive.moment.SecondMoment secondMoment65 = new org.apache.commons.math.stat.descriptive.moment.SecondMoment();
        secondMoment65.increment(1.0d);
        double[] doubleArray71 = new double[] { (-1L), 0, 10L };
        secondMoment65.incrementAll(doubleArray71, 0, 0);
        long long75 = secondMoment65.getN();
        org.apache.commons.math.stat.descriptive.moment.SecondMoment secondMoment76 = new org.apache.commons.math.stat.descriptive.moment.SecondMoment();
        secondMoment76.increment(1.0d);
        double[] doubleArray82 = new double[] { (-1L), 0, 10L };
        secondMoment76.incrementAll(doubleArray82, 0, 0);
        secondMoment65.incrementAll(doubleArray82, 0, (int) (short) 1);
        double double89 = variance59.evaluate(doubleArray82);
        secondMoment27.incrementAll(doubleArray82);
        double double92 = variance23.evaluate(doubleArray82, (double) (short) -1);
        double double93 = variance20.evaluate(doubleArray82);
        double double94 = variance8.evaluate(doubleArray82);
        variance8.increment(188563.037037037d);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.5d + "'", double5 == 0.5d);
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 2L + "'", long6 == 2L);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 0.5d + "'", double7 == 0.5d);
        org.junit.Assert.assertNotNull(doubleArray15);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray15), "[-1.0, 0.0, 10.0]");
        org.junit.Assert.assertTrue("'" + long19 + "' != '" + 1L + "'", long19 == 1L);
        org.junit.Assert.assertTrue("'" + double21 + "' != '" + 0.0d + "'", double21 == 0.0d);
        org.junit.Assert.assertTrue("'" + long24 + "' != '" + 0L + "'", long24 == 0L);
        org.junit.Assert.assertTrue(Double.isNaN(double25));
        org.junit.Assert.assertTrue("'" + double37 + "' != '" + 0.5d + "'", double37 == 0.5d);
        org.junit.Assert.assertNotNull(doubleArray45);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray45), "[-1.0, 0.0, 10.0]");
        org.junit.Assert.assertNotNull(doubleArray51);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray51), "[10.0, 100.0]");
        org.junit.Assert.assertTrue("'" + double52 + "' != '" + 4050.0d + "'", double52 == 4050.0d);
        org.junit.Assert.assertTrue("'" + double53 + "' != '" + 4050.0d + "'", double53 == 4050.0d);
        org.junit.Assert.assertTrue("'" + long54 + "' != '" + 2L + "'", long54 == 2L);
        org.junit.Assert.assertTrue("'" + long55 + "' != '" + 2L + "'", long55 == 2L);
        org.junit.Assert.assertTrue("'" + boolean57 + "' != '" + false + "'", boolean57 == false);
        org.junit.Assert.assertTrue("'" + double62 + "' != '" + 0.5d + "'", double62 == 0.5d);
        org.junit.Assert.assertTrue("'" + long64 + "' != '" + 2L + "'", long64 == 2L);
        org.junit.Assert.assertNotNull(doubleArray71);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray71), "[-1.0, 0.0, 10.0]");
        org.junit.Assert.assertTrue("'" + long75 + "' != '" + 1L + "'", long75 == 1L);
        org.junit.Assert.assertNotNull(doubleArray82);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray82), "[-1.0, 0.0, 10.0]");
        org.junit.Assert.assertTrue("'" + double89 + "' != '" + 37.0d + "'", double89 == 37.0d);
        org.junit.Assert.assertTrue("'" + double92 + "' != '" + 37.0d + "'", double92 == 37.0d);
        org.junit.Assert.assertTrue("'" + double93 + "' != '" + 37.0d + "'", double93 == 37.0d);
        org.junit.Assert.assertTrue("'" + double94 + "' != '" + 37.0d + "'", double94 == 37.0d);
    }

    @Test
    public void test13554() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest27.test13554");
        org.apache.commons.math.stat.descriptive.moment.SecondMoment secondMoment0 = new org.apache.commons.math.stat.descriptive.moment.SecondMoment();
        secondMoment0.increment((double) ' ');
        org.apache.commons.math.stat.descriptive.moment.Variance variance3 = new org.apache.commons.math.stat.descriptive.moment.Variance(secondMoment0);
        secondMoment0.increment((double) (short) -1);
        secondMoment0.clear();
        double double7 = secondMoment0.getResult();
        org.apache.commons.math.stat.descriptive.moment.Variance variance8 = new org.apache.commons.math.stat.descriptive.moment.Variance(secondMoment0);
        org.apache.commons.math.stat.descriptive.moment.Variance variance9 = new org.apache.commons.math.stat.descriptive.moment.Variance(secondMoment0);
        double double10 = variance9.getResult();
        variance9.increment(0.0d);
        org.junit.Assert.assertTrue(Double.isNaN(double7));
        org.junit.Assert.assertTrue(Double.isNaN(double10));
    }

    @Test
    public void test13555() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest27.test13555");
        org.apache.commons.math.stat.descriptive.moment.SecondMoment secondMoment1 = new org.apache.commons.math.stat.descriptive.moment.SecondMoment();
        secondMoment1.increment(1.0d);
        double[] doubleArray7 = new double[] { (-1L), 0, 10L };
        secondMoment1.incrementAll(doubleArray7, 0, 0);
        double[] doubleArray13 = new double[] { 10, (byte) 100 };
        double double14 = secondMoment1.evaluate(doubleArray13);
        double double15 = secondMoment1.getResult();
        org.apache.commons.math.stat.descriptive.moment.Variance variance16 = new org.apache.commons.math.stat.descriptive.moment.Variance(false, secondMoment1);
        secondMoment1.increment(24.666666666666668d);
        double double19 = secondMoment1.getResult();
        double double20 = secondMoment1.getResult();
        org.apache.commons.math.stat.descriptive.moment.Variance variance21 = new org.apache.commons.math.stat.descriptive.moment.Variance(secondMoment1);
        org.apache.commons.math.stat.descriptive.moment.SecondMoment secondMoment24 = new org.apache.commons.math.stat.descriptive.moment.SecondMoment();
        secondMoment24.increment(1.0d);
        double[] doubleArray30 = new double[] { (-1L), 0, 10L };
        secondMoment24.incrementAll(doubleArray30, 0, 0);
        double[] doubleArray36 = new double[] { 10, (byte) 100 };
        double double37 = secondMoment24.evaluate(doubleArray36);
        double double38 = secondMoment24.getResult();
        org.apache.commons.math.stat.descriptive.moment.Variance variance39 = new org.apache.commons.math.stat.descriptive.moment.Variance(false, secondMoment24);
        long long40 = secondMoment24.getN();
        org.apache.commons.math.stat.descriptive.moment.Variance variance41 = new org.apache.commons.math.stat.descriptive.moment.Variance(true, secondMoment24);
        variance41.increment(10.0d);
        org.apache.commons.math.stat.descriptive.moment.SecondMoment secondMoment44 = new org.apache.commons.math.stat.descriptive.moment.SecondMoment();
        secondMoment44.increment((double) ' ');
        org.apache.commons.math.stat.descriptive.moment.Variance variance47 = new org.apache.commons.math.stat.descriptive.moment.Variance(secondMoment44);
        secondMoment44.increment((double) '4');
        double double50 = secondMoment44.getResult();
        org.apache.commons.math.stat.descriptive.moment.SecondMoment secondMoment51 = new org.apache.commons.math.stat.descriptive.moment.SecondMoment();
        secondMoment51.increment(1.0d);
        secondMoment51.increment((double) (short) 0);
        double double56 = secondMoment51.getResult();
        org.apache.commons.math.stat.descriptive.moment.SecondMoment secondMoment57 = new org.apache.commons.math.stat.descriptive.moment.SecondMoment();
        secondMoment57.increment(1.0d);
        secondMoment57.increment((double) (short) 0);
        double double62 = secondMoment57.getResult();
        org.apache.commons.math.stat.descriptive.moment.SecondMoment secondMoment63 = new org.apache.commons.math.stat.descriptive.moment.SecondMoment();
        secondMoment63.increment(1.0d);
        double[] doubleArray69 = new double[] { (-1L), 0, 10L };
        secondMoment63.incrementAll(doubleArray69, 0, 0);
        double double73 = secondMoment57.evaluate(doubleArray69);
        double[] doubleArray74 = new double[] {};
        secondMoment57.incrementAll(doubleArray74);
        secondMoment51.incrementAll(doubleArray74);
        secondMoment51.increment((double) 2L);
        org.apache.commons.math.stat.descriptive.moment.Variance variance79 = new org.apache.commons.math.stat.descriptive.moment.Variance(secondMoment51);
        org.apache.commons.math.stat.descriptive.moment.SecondMoment secondMoment80 = new org.apache.commons.math.stat.descriptive.moment.SecondMoment();
        secondMoment80.increment(1.0d);
        double[] doubleArray86 = new double[] { (-1L), 0, 10L };
        secondMoment80.incrementAll(doubleArray86, 0, 0);
        double[] doubleArray92 = new double[] { 10, (byte) 100 };
        double double93 = secondMoment80.evaluate(doubleArray92);
        double double94 = variance79.evaluate(doubleArray92);
        double double95 = secondMoment44.evaluate(doubleArray92);
        double double96 = variance41.evaluate(doubleArray92);
        double double97 = variance21.evaluate(doubleArray92);
        double double98 = variance21.getResult();
        variance21.clear();
        org.junit.Assert.assertNotNull(doubleArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray7), "[-1.0, 0.0, 10.0]");
        org.junit.Assert.assertNotNull(doubleArray13);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray13), "[10.0, 100.0]");
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + 4050.0d + "'", double14 == 4050.0d);
        org.junit.Assert.assertTrue("'" + double15 + "' != '" + 4050.0d + "'", double15 == 4050.0d);
        org.junit.Assert.assertTrue("'" + double19 + "' != '" + 4663.407407407407d + "'", double19 == 4663.407407407407d);
        org.junit.Assert.assertTrue("'" + double20 + "' != '" + 4663.407407407407d + "'", double20 == 4663.407407407407d);
        org.junit.Assert.assertNotNull(doubleArray30);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray30), "[-1.0, 0.0, 10.0]");
        org.junit.Assert.assertNotNull(doubleArray36);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray36), "[10.0, 100.0]");
        org.junit.Assert.assertTrue("'" + double37 + "' != '" + 4050.0d + "'", double37 == 4050.0d);
        org.junit.Assert.assertTrue("'" + double38 + "' != '" + 4050.0d + "'", double38 == 4050.0d);
        org.junit.Assert.assertTrue("'" + long40 + "' != '" + 2L + "'", long40 == 2L);
        org.junit.Assert.assertTrue("'" + double50 + "' != '" + 200.0d + "'", double50 == 200.0d);
        org.junit.Assert.assertTrue("'" + double56 + "' != '" + 0.5d + "'", double56 == 0.5d);
        org.junit.Assert.assertTrue("'" + double62 + "' != '" + 0.5d + "'", double62 == 0.5d);
        org.junit.Assert.assertNotNull(doubleArray69);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray69), "[-1.0, 0.0, 10.0]");
        org.junit.Assert.assertTrue("'" + double73 + "' != '" + 74.0d + "'", double73 == 74.0d);
        org.junit.Assert.assertNotNull(doubleArray74);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray74), "[]");
        org.junit.Assert.assertNotNull(doubleArray86);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray86), "[-1.0, 0.0, 10.0]");
        org.junit.Assert.assertNotNull(doubleArray92);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray92), "[10.0, 100.0]");
        org.junit.Assert.assertTrue("'" + double93 + "' != '" + 4050.0d + "'", double93 == 4050.0d);
        org.junit.Assert.assertTrue("'" + double94 + "' != '" + 4050.0d + "'", double94 == 4050.0d);
        org.junit.Assert.assertTrue("'" + double95 + "' != '" + 4050.0d + "'", double95 == 4050.0d);
        org.junit.Assert.assertTrue("'" + double96 + "' != '" + 4050.0d + "'", double96 == 4050.0d);
        org.junit.Assert.assertTrue("'" + double97 + "' != '" + 4050.0d + "'", double97 == 4050.0d);
        org.junit.Assert.assertTrue("'" + double98 + "' != '" + 2331.7037037037035d + "'", double98 == 2331.7037037037035d);
    }

    @Test
    public void test13556() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest27.test13556");
        org.apache.commons.math.stat.descriptive.moment.SecondMoment secondMoment0 = new org.apache.commons.math.stat.descriptive.moment.SecondMoment();
        secondMoment0.increment((double) ' ');
        org.apache.commons.math.stat.descriptive.moment.Variance variance3 = new org.apache.commons.math.stat.descriptive.moment.Variance(secondMoment0);
        secondMoment0.increment((double) (short) -1);
        secondMoment0.increment((double) 100);
        secondMoment0.clear();
        double double9 = secondMoment0.getResult();
        secondMoment0.clear();
        long long11 = secondMoment0.getN();
        org.junit.Assert.assertTrue(Double.isNaN(double9));
        org.junit.Assert.assertTrue("'" + long11 + "' != '" + 0L + "'", long11 == 0L);
    }

    @Test
    public void test13557() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest27.test13557");
        org.apache.commons.math.stat.descriptive.moment.SecondMoment secondMoment0 = new org.apache.commons.math.stat.descriptive.moment.SecondMoment();
        secondMoment0.increment(1.0d);
        double[] doubleArray6 = new double[] { (-1L), 0, 10L };
        secondMoment0.incrementAll(doubleArray6, 0, 0);
        org.apache.commons.math.stat.descriptive.moment.Variance variance10 = new org.apache.commons.math.stat.descriptive.moment.Variance(secondMoment0);
        org.apache.commons.math.stat.descriptive.moment.SecondMoment secondMoment11 = new org.apache.commons.math.stat.descriptive.moment.SecondMoment();
        secondMoment11.increment((double) ' ');
        secondMoment11.increment((double) (-1.0f));
        secondMoment11.clear();
        boolean boolean17 = variance10.equals((java.lang.Object) secondMoment11);
        long long18 = secondMoment11.getN();
        org.apache.commons.math.stat.descriptive.moment.Variance variance19 = new org.apache.commons.math.stat.descriptive.moment.Variance(secondMoment11);
        secondMoment11.increment(36.916666666666664d);
        long long22 = secondMoment11.getN();
        secondMoment11.increment((double) (-1.0f));
        secondMoment11.clear();
        org.junit.Assert.assertNotNull(doubleArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray6), "[-1.0, 0.0, 10.0]");
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertTrue("'" + long18 + "' != '" + 0L + "'", long18 == 0L);
        org.junit.Assert.assertTrue("'" + long22 + "' != '" + 1L + "'", long22 == 1L);
    }

    @Test
    public void test13558() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest27.test13558");
        org.apache.commons.math.stat.descriptive.moment.SecondMoment secondMoment2 = new org.apache.commons.math.stat.descriptive.moment.SecondMoment();
        secondMoment2.increment(1.0d);
        double[] doubleArray8 = new double[] { (-1L), 0, 10L };
        secondMoment2.incrementAll(doubleArray8, 0, 0);
        double[] doubleArray14 = new double[] { 10, (byte) 100 };
        double double15 = secondMoment2.evaluate(doubleArray14);
        double double16 = secondMoment2.getResult();
        org.apache.commons.math.stat.descriptive.moment.Variance variance17 = new org.apache.commons.math.stat.descriptive.moment.Variance(false, secondMoment2);
        long long18 = secondMoment2.getN();
        org.apache.commons.math.stat.descriptive.moment.Variance variance19 = new org.apache.commons.math.stat.descriptive.moment.Variance(true, secondMoment2);
        variance19.increment(10.0d);
        variance19.increment((double) 4L);
        variance19.increment(6993.1875d);
        boolean boolean26 = variance19.isBiasCorrected();
        org.junit.Assert.assertNotNull(doubleArray8);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray8), "[-1.0, 0.0, 10.0]");
        org.junit.Assert.assertNotNull(doubleArray14);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray14), "[10.0, 100.0]");
        org.junit.Assert.assertTrue("'" + double15 + "' != '" + 4050.0d + "'", double15 == 4050.0d);
        org.junit.Assert.assertTrue("'" + double16 + "' != '" + 4050.0d + "'", double16 == 4050.0d);
        org.junit.Assert.assertTrue("'" + long18 + "' != '" + 2L + "'", long18 == 2L);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + true + "'", boolean26 == true);
    }

    @Test
    public void test13559() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest27.test13559");
        org.apache.commons.math.stat.descriptive.moment.SecondMoment secondMoment1 = new org.apache.commons.math.stat.descriptive.moment.SecondMoment();
        secondMoment1.increment(1.0d);
        double[] doubleArray7 = new double[] { (-1L), 0, 10L };
        secondMoment1.incrementAll(doubleArray7, 0, 0);
        double[] doubleArray13 = new double[] { 10, (byte) 100 };
        double double14 = secondMoment1.evaluate(doubleArray13);
        long long15 = secondMoment1.getN();
        secondMoment1.clear();
        secondMoment1.clear();
        double double18 = secondMoment1.getResult();
        secondMoment1.clear();
        org.apache.commons.math.stat.descriptive.moment.Variance variance20 = new org.apache.commons.math.stat.descriptive.moment.Variance(true, secondMoment1);
        secondMoment1.clear();
        secondMoment1.increment(7.703419152040815E7d);
        org.apache.commons.math.stat.descriptive.moment.Variance variance24 = new org.apache.commons.math.stat.descriptive.moment.Variance(secondMoment1);
        secondMoment1.increment(6122.041666666666d);
        org.junit.Assert.assertNotNull(doubleArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray7), "[-1.0, 0.0, 10.0]");
        org.junit.Assert.assertNotNull(doubleArray13);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray13), "[10.0, 100.0]");
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + 4050.0d + "'", double14 == 4050.0d);
        org.junit.Assert.assertTrue("'" + long15 + "' != '" + 2L + "'", long15 == 2L);
        org.junit.Assert.assertTrue(Double.isNaN(double18));
    }

    @Test
    public void test13560() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest27.test13560");
        org.apache.commons.math.stat.descriptive.moment.SecondMoment secondMoment0 = new org.apache.commons.math.stat.descriptive.moment.SecondMoment();
        secondMoment0.increment(1.0d);
        double[] doubleArray6 = new double[] { (-1L), 0, 10L };
        secondMoment0.incrementAll(doubleArray6, 0, 0);
        double[] doubleArray12 = new double[] { 10, (byte) 100 };
        double double13 = secondMoment0.evaluate(doubleArray12);
        long long14 = secondMoment0.getN();
        double double15 = secondMoment0.getResult();
        org.apache.commons.math.stat.descriptive.moment.SecondMoment secondMoment16 = new org.apache.commons.math.stat.descriptive.moment.SecondMoment();
        secondMoment16.increment((double) ' ');
        org.apache.commons.math.stat.descriptive.moment.Variance variance19 = new org.apache.commons.math.stat.descriptive.moment.Variance(secondMoment16);
        secondMoment16.increment((double) (short) -1);
        secondMoment16.clear();
        double double23 = secondMoment16.getResult();
        org.apache.commons.math.stat.descriptive.moment.SecondMoment secondMoment24 = new org.apache.commons.math.stat.descriptive.moment.SecondMoment();
        secondMoment24.increment(1.0d);
        secondMoment24.increment((double) (short) 0);
        double double29 = secondMoment24.getResult();
        org.apache.commons.math.stat.descriptive.moment.SecondMoment secondMoment30 = new org.apache.commons.math.stat.descriptive.moment.SecondMoment();
        secondMoment30.increment(1.0d);
        double[] doubleArray36 = new double[] { (-1L), 0, 10L };
        secondMoment30.incrementAll(doubleArray36, 0, 0);
        double double40 = secondMoment24.evaluate(doubleArray36);
        secondMoment16.incrementAll(doubleArray36, 0, (int) (short) 0);
        double double44 = secondMoment0.evaluate(doubleArray36);
        secondMoment0.clear();
        secondMoment0.clear();
        org.junit.Assert.assertNotNull(doubleArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray6), "[-1.0, 0.0, 10.0]");
        org.junit.Assert.assertNotNull(doubleArray12);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray12), "[10.0, 100.0]");
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 4050.0d + "'", double13 == 4050.0d);
        org.junit.Assert.assertTrue("'" + long14 + "' != '" + 2L + "'", long14 == 2L);
        org.junit.Assert.assertTrue("'" + double15 + "' != '" + 4050.0d + "'", double15 == 4050.0d);
        org.junit.Assert.assertTrue(Double.isNaN(double23));
        org.junit.Assert.assertTrue("'" + double29 + "' != '" + 0.5d + "'", double29 == 0.5d);
        org.junit.Assert.assertNotNull(doubleArray36);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray36), "[-1.0, 0.0, 10.0]");
        org.junit.Assert.assertTrue("'" + double40 + "' != '" + 74.0d + "'", double40 == 74.0d);
        org.junit.Assert.assertTrue("'" + double44 + "' != '" + 74.0d + "'", double44 == 74.0d);
    }

    @Test
    public void test13561() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest27.test13561");
        org.apache.commons.math.stat.descriptive.moment.SecondMoment secondMoment0 = new org.apache.commons.math.stat.descriptive.moment.SecondMoment();
        secondMoment0.increment((double) ' ');
        secondMoment0.increment((double) (-1.0f));
        secondMoment0.clear();
        secondMoment0.increment(0.0d);
        secondMoment0.increment((double) 6L);
        secondMoment0.increment(6.22239225373408E14d);
        org.apache.commons.math.stat.descriptive.moment.SecondMoment secondMoment12 = new org.apache.commons.math.stat.descriptive.moment.SecondMoment();
        secondMoment12.increment(1.0d);
        double[] doubleArray18 = new double[] { (-1L), 0, 10L };
        secondMoment12.incrementAll(doubleArray18, 0, 0);
        long long22 = secondMoment12.getN();
        org.apache.commons.math.stat.descriptive.moment.Variance variance23 = new org.apache.commons.math.stat.descriptive.moment.Variance(secondMoment12);
        secondMoment12.increment(10.0d);
        secondMoment12.clear();
        org.apache.commons.math.stat.descriptive.moment.SecondMoment secondMoment27 = new org.apache.commons.math.stat.descriptive.moment.SecondMoment();
        secondMoment27.increment((double) ' ');
        org.apache.commons.math.stat.descriptive.moment.Variance variance30 = new org.apache.commons.math.stat.descriptive.moment.Variance(secondMoment27);
        secondMoment27.increment((double) (short) -1);
        secondMoment27.clear();
        secondMoment27.increment((double) 'a');
        org.apache.commons.math.stat.descriptive.moment.SecondMoment secondMoment36 = new org.apache.commons.math.stat.descriptive.moment.SecondMoment();
        secondMoment36.increment(1.0d);
        secondMoment36.increment((double) (short) 0);
        boolean boolean41 = secondMoment27.equals((java.lang.Object) secondMoment36);
        secondMoment27.clear();
        long long43 = secondMoment27.getN();
        org.apache.commons.math.stat.descriptive.moment.SecondMoment secondMoment45 = new org.apache.commons.math.stat.descriptive.moment.SecondMoment();
        secondMoment45.increment(1.0d);
        secondMoment45.increment((double) (short) 0);
        long long50 = secondMoment45.getN();
        org.apache.commons.math.stat.descriptive.moment.Variance variance51 = new org.apache.commons.math.stat.descriptive.moment.Variance(false, secondMoment45);
        org.apache.commons.math.stat.descriptive.moment.SecondMoment secondMoment52 = new org.apache.commons.math.stat.descriptive.moment.SecondMoment();
        secondMoment52.increment((double) ' ');
        org.apache.commons.math.stat.descriptive.moment.Variance variance55 = new org.apache.commons.math.stat.descriptive.moment.Variance(secondMoment52);
        secondMoment52.increment((double) (short) -1);
        secondMoment52.clear();
        secondMoment52.increment((double) 'a');
        org.apache.commons.math.stat.descriptive.moment.SecondMoment secondMoment61 = new org.apache.commons.math.stat.descriptive.moment.SecondMoment();
        secondMoment61.increment(1.0d);
        secondMoment61.increment((double) (short) 0);
        boolean boolean66 = secondMoment52.equals((java.lang.Object) secondMoment61);
        org.apache.commons.math.stat.descriptive.moment.SecondMoment secondMoment67 = new org.apache.commons.math.stat.descriptive.moment.SecondMoment();
        secondMoment67.increment(1.0d);
        org.apache.commons.math.stat.descriptive.moment.SecondMoment secondMoment70 = new org.apache.commons.math.stat.descriptive.moment.SecondMoment();
        secondMoment70.increment(1.0d);
        double[] doubleArray76 = new double[] { (-1L), 0, 10L };
        secondMoment70.incrementAll(doubleArray76, 0, 0);
        double[] doubleArray82 = new double[] { 10, (byte) 100 };
        double double83 = secondMoment70.evaluate(doubleArray82);
        double double84 = secondMoment67.evaluate(doubleArray82);
        secondMoment52.incrementAll(doubleArray82);
        secondMoment45.incrementAll(doubleArray82, (int) (short) 0, 0);
        double double89 = secondMoment27.evaluate(doubleArray82);
        double double90 = secondMoment12.evaluate(doubleArray82);
        // The following exception was thrown during execution in test generation
        try {
            double double93 = secondMoment0.evaluate(doubleArray82, (int) '4', (int) (byte) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: begin + length > values.length");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(doubleArray18);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray18), "[-1.0, 0.0, 10.0]");
        org.junit.Assert.assertTrue("'" + long22 + "' != '" + 1L + "'", long22 == 1L);
        org.junit.Assert.assertTrue("'" + boolean41 + "' != '" + false + "'", boolean41 == false);
        org.junit.Assert.assertTrue("'" + long43 + "' != '" + 0L + "'", long43 == 0L);
        org.junit.Assert.assertTrue("'" + long50 + "' != '" + 2L + "'", long50 == 2L);
        org.junit.Assert.assertTrue("'" + boolean66 + "' != '" + false + "'", boolean66 == false);
        org.junit.Assert.assertNotNull(doubleArray76);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray76), "[-1.0, 0.0, 10.0]");
        org.junit.Assert.assertNotNull(doubleArray82);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray82), "[10.0, 100.0]");
        org.junit.Assert.assertTrue("'" + double83 + "' != '" + 4050.0d + "'", double83 == 4050.0d);
        org.junit.Assert.assertTrue("'" + double84 + "' != '" + 4050.0d + "'", double84 == 4050.0d);
        org.junit.Assert.assertTrue("'" + double89 + "' != '" + 4050.0d + "'", double89 == 4050.0d);
        org.junit.Assert.assertTrue("'" + double90 + "' != '" + 4050.0d + "'", double90 == 4050.0d);
    }

    @Test
    public void test13562() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest27.test13562");
        org.apache.commons.math.stat.descriptive.moment.SecondMoment secondMoment1 = new org.apache.commons.math.stat.descriptive.moment.SecondMoment();
        secondMoment1.increment(1.0d);
        double[] doubleArray7 = new double[] { (-1L), 0, 10L };
        secondMoment1.incrementAll(doubleArray7, 0, 0);
        double[] doubleArray13 = new double[] { 10, (byte) 100 };
        double double14 = secondMoment1.evaluate(doubleArray13);
        double double15 = secondMoment1.getResult();
        secondMoment1.increment((double) (short) -1);
        double double18 = secondMoment1.getResult();
        org.apache.commons.math.stat.descriptive.moment.SecondMoment secondMoment19 = new org.apache.commons.math.stat.descriptive.moment.SecondMoment();
        secondMoment19.increment(1.0d);
        double[] doubleArray25 = new double[] { (-1L), 0, 10L };
        secondMoment19.incrementAll(doubleArray25, 0, 0);
        double[] doubleArray31 = new double[] { 10, (byte) 100 };
        double double32 = secondMoment19.evaluate(doubleArray31);
        double double33 = secondMoment1.evaluate(doubleArray31);
        org.apache.commons.math.stat.descriptive.moment.Variance variance34 = new org.apache.commons.math.stat.descriptive.moment.Variance(false, secondMoment1);
        variance34.clear();
        variance34.setBiasCorrected(false);
        double double38 = variance34.getResult();
        long long39 = variance34.getN();
        org.junit.Assert.assertNotNull(doubleArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray7), "[-1.0, 0.0, 10.0]");
        org.junit.Assert.assertNotNull(doubleArray13);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray13), "[10.0, 100.0]");
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + 4050.0d + "'", double14 == 4050.0d);
        org.junit.Assert.assertTrue("'" + double15 + "' != '" + 4050.0d + "'", double15 == 4050.0d);
        org.junit.Assert.assertTrue("'" + double18 + "' != '" + 6140.666666666667d + "'", double18 == 6140.666666666667d);
        org.junit.Assert.assertNotNull(doubleArray25);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray25), "[-1.0, 0.0, 10.0]");
        org.junit.Assert.assertNotNull(doubleArray31);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray31), "[10.0, 100.0]");
        org.junit.Assert.assertTrue("'" + double32 + "' != '" + 4050.0d + "'", double32 == 4050.0d);
        org.junit.Assert.assertTrue("'" + double33 + "' != '" + 4050.0d + "'", double33 == 4050.0d);
        org.junit.Assert.assertTrue("'" + double38 + "' != '" + 2025.0d + "'", double38 == 2025.0d);
        org.junit.Assert.assertTrue("'" + long39 + "' != '" + 2L + "'", long39 == 2L);
    }

    @Test
    public void test13563() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest27.test13563");
        org.apache.commons.math.stat.descriptive.moment.SecondMoment secondMoment0 = new org.apache.commons.math.stat.descriptive.moment.SecondMoment();
        secondMoment0.increment((double) ' ');
        secondMoment0.increment((double) '4');
        long long5 = secondMoment0.getN();
        org.apache.commons.math.stat.descriptive.moment.Variance variance6 = new org.apache.commons.math.stat.descriptive.moment.Variance(secondMoment0);
        double double7 = variance6.getResult();
        variance6.clear();
        org.apache.commons.math.stat.descriptive.moment.SecondMoment secondMoment9 = new org.apache.commons.math.stat.descriptive.moment.SecondMoment();
        secondMoment9.increment((double) ' ');
        org.apache.commons.math.stat.descriptive.moment.Variance variance12 = new org.apache.commons.math.stat.descriptive.moment.Variance(secondMoment9);
        secondMoment9.increment((double) (short) -1);
        secondMoment9.clear();
        secondMoment9.increment((double) 0L);
        org.apache.commons.math.stat.descriptive.moment.Variance variance18 = new org.apache.commons.math.stat.descriptive.moment.Variance(secondMoment9);
        long long19 = variance18.getN();
        org.apache.commons.math.stat.descriptive.moment.SecondMoment secondMoment20 = new org.apache.commons.math.stat.descriptive.moment.SecondMoment();
        secondMoment20.increment(1.0d);
        org.apache.commons.math.stat.descriptive.moment.SecondMoment secondMoment23 = new org.apache.commons.math.stat.descriptive.moment.SecondMoment();
        secondMoment23.increment(1.0d);
        secondMoment23.increment((double) (short) 0);
        double double28 = secondMoment23.getResult();
        org.apache.commons.math.stat.descriptive.moment.SecondMoment secondMoment29 = new org.apache.commons.math.stat.descriptive.moment.SecondMoment();
        secondMoment29.increment(1.0d);
        double[] doubleArray35 = new double[] { (-1L), 0, 10L };
        secondMoment29.incrementAll(doubleArray35, 0, 0);
        double double39 = secondMoment23.evaluate(doubleArray35);
        double[] doubleArray40 = new double[] {};
        secondMoment23.incrementAll(doubleArray40);
        double double42 = secondMoment20.evaluate(doubleArray40);
        double double43 = variance18.evaluate(doubleArray40);
        org.apache.commons.math.stat.descriptive.moment.SecondMoment secondMoment44 = new org.apache.commons.math.stat.descriptive.moment.SecondMoment();
        secondMoment44.increment(1.0d);
        org.apache.commons.math.stat.descriptive.moment.SecondMoment secondMoment47 = new org.apache.commons.math.stat.descriptive.moment.SecondMoment();
        secondMoment47.increment(1.0d);
        secondMoment47.increment((double) (short) 0);
        double double52 = secondMoment47.getResult();
        org.apache.commons.math.stat.descriptive.moment.SecondMoment secondMoment53 = new org.apache.commons.math.stat.descriptive.moment.SecondMoment();
        secondMoment53.increment(1.0d);
        double[] doubleArray59 = new double[] { (-1L), 0, 10L };
        secondMoment53.incrementAll(doubleArray59, 0, 0);
        double double63 = secondMoment47.evaluate(doubleArray59);
        double[] doubleArray64 = new double[] {};
        secondMoment47.incrementAll(doubleArray64);
        double double66 = secondMoment44.evaluate(doubleArray64);
        variance18.incrementAll(doubleArray64);
        org.apache.commons.math.stat.descriptive.moment.SecondMoment secondMoment68 = new org.apache.commons.math.stat.descriptive.moment.SecondMoment();
        secondMoment68.increment(1.0d);
        secondMoment68.increment((double) (short) 0);
        double double73 = secondMoment68.getResult();
        org.apache.commons.math.stat.descriptive.moment.SecondMoment secondMoment74 = new org.apache.commons.math.stat.descriptive.moment.SecondMoment();
        secondMoment74.increment(1.0d);
        double[] doubleArray80 = new double[] { (-1L), 0, 10L };
        secondMoment74.incrementAll(doubleArray80, 0, 0);
        double double84 = secondMoment68.evaluate(doubleArray80);
        double double87 = variance18.evaluate(doubleArray80, (int) (byte) 1, 1);
        double double88 = variance6.evaluate(doubleArray80);
        variance6.setBiasCorrected(true);
        long long91 = variance6.getN();
        variance6.increment(125982.5185185185d);
        variance6.setBiasCorrected(true);
        variance6.increment(0.0d);
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 2L + "'", long5 == 2L);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 200.0d + "'", double7 == 200.0d);
        org.junit.Assert.assertTrue("'" + long19 + "' != '" + 1L + "'", long19 == 1L);
        org.junit.Assert.assertTrue("'" + double28 + "' != '" + 0.5d + "'", double28 == 0.5d);
        org.junit.Assert.assertNotNull(doubleArray35);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray35), "[-1.0, 0.0, 10.0]");
        org.junit.Assert.assertTrue("'" + double39 + "' != '" + 74.0d + "'", double39 == 74.0d);
        org.junit.Assert.assertNotNull(doubleArray40);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray40), "[]");
        org.junit.Assert.assertTrue("'" + double42 + "' != '" + 0.0d + "'", double42 == 0.0d);
        org.junit.Assert.assertTrue(Double.isNaN(double43));
        org.junit.Assert.assertTrue("'" + double52 + "' != '" + 0.5d + "'", double52 == 0.5d);
        org.junit.Assert.assertNotNull(doubleArray59);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray59), "[-1.0, 0.0, 10.0]");
        org.junit.Assert.assertTrue("'" + double63 + "' != '" + 74.0d + "'", double63 == 74.0d);
        org.junit.Assert.assertNotNull(doubleArray64);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray64), "[]");
        org.junit.Assert.assertTrue("'" + double66 + "' != '" + 0.0d + "'", double66 == 0.0d);
        org.junit.Assert.assertTrue("'" + double73 + "' != '" + 0.5d + "'", double73 == 0.5d);
        org.junit.Assert.assertNotNull(doubleArray80);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray80), "[-1.0, 0.0, 10.0]");
        org.junit.Assert.assertTrue("'" + double84 + "' != '" + 74.0d + "'", double84 == 74.0d);
        org.junit.Assert.assertTrue("'" + double87 + "' != '" + 0.0d + "'", double87 == 0.0d);
        org.junit.Assert.assertTrue("'" + double88 + "' != '" + 37.0d + "'", double88 == 37.0d);
        org.junit.Assert.assertTrue("'" + long91 + "' != '" + 2L + "'", long91 == 2L);
    }

    @Test
    public void test13564() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest27.test13564");
        org.apache.commons.math.stat.descriptive.moment.SecondMoment secondMoment0 = new org.apache.commons.math.stat.descriptive.moment.SecondMoment();
        secondMoment0.increment(1.0d);
        secondMoment0.increment((double) (short) 0);
        long long5 = secondMoment0.getN();
        org.apache.commons.math.stat.descriptive.moment.SecondMoment secondMoment6 = new org.apache.commons.math.stat.descriptive.moment.SecondMoment();
        secondMoment6.increment(1.0d);
        double[] doubleArray12 = new double[] { (-1L), 0, 10L };
        secondMoment6.incrementAll(doubleArray12, 0, 0);
        long long16 = secondMoment6.getN();
        org.apache.commons.math.stat.descriptive.moment.SecondMoment secondMoment17 = new org.apache.commons.math.stat.descriptive.moment.SecondMoment();
        secondMoment17.increment(1.0d);
        double[] doubleArray23 = new double[] { (-1L), 0, 10L };
        secondMoment17.incrementAll(doubleArray23, 0, 0);
        secondMoment6.incrementAll(doubleArray23, 0, (int) (short) 1);
        secondMoment0.incrementAll(doubleArray23, (int) (byte) 0, (int) (byte) 1);
        secondMoment0.clear();
        java.lang.Object obj34 = null;
        boolean boolean35 = secondMoment0.equals(obj34);
        secondMoment0.increment(4710403.555555556d);
        secondMoment0.clear();
        double double39 = secondMoment0.getResult();
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 2L + "'", long5 == 2L);
        org.junit.Assert.assertNotNull(doubleArray12);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray12), "[-1.0, 0.0, 10.0]");
        org.junit.Assert.assertTrue("'" + long16 + "' != '" + 1L + "'", long16 == 1L);
        org.junit.Assert.assertNotNull(doubleArray23);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray23), "[-1.0, 0.0, 10.0]");
        org.junit.Assert.assertTrue("'" + boolean35 + "' != '" + false + "'", boolean35 == false);
        org.junit.Assert.assertTrue(Double.isNaN(double39));
    }

    @Test
    public void test13565() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest27.test13565");
        org.apache.commons.math.stat.descriptive.moment.Variance variance1 = new org.apache.commons.math.stat.descriptive.moment.Variance(true);
        long long2 = variance1.getN();
        double double3 = variance1.getResult();
        variance1.increment((double) (short) 100);
        org.apache.commons.math.stat.descriptive.moment.SecondMoment secondMoment6 = new org.apache.commons.math.stat.descriptive.moment.SecondMoment();
        secondMoment6.increment((double) ' ');
        org.apache.commons.math.stat.descriptive.moment.Variance variance9 = new org.apache.commons.math.stat.descriptive.moment.Variance(secondMoment6);
        secondMoment6.increment((double) (short) -1);
        secondMoment6.clear();
        secondMoment6.increment((double) 0L);
        org.apache.commons.math.stat.descriptive.moment.Variance variance15 = new org.apache.commons.math.stat.descriptive.moment.Variance(secondMoment6);
        org.apache.commons.math.stat.descriptive.moment.SecondMoment secondMoment16 = new org.apache.commons.math.stat.descriptive.moment.SecondMoment();
        secondMoment16.increment(1.0d);
        double[] doubleArray22 = new double[] { (-1L), 0, 10L };
        secondMoment16.incrementAll(doubleArray22, 0, 0);
        variance15.incrementAll(doubleArray22);
        long long27 = variance15.getN();
        variance15.clear();
        org.apache.commons.math.stat.descriptive.moment.SecondMoment secondMoment29 = new org.apache.commons.math.stat.descriptive.moment.SecondMoment();
        secondMoment29.increment(1.0d);
        secondMoment29.increment((double) (short) 0);
        double double34 = secondMoment29.getResult();
        org.apache.commons.math.stat.descriptive.moment.SecondMoment secondMoment35 = new org.apache.commons.math.stat.descriptive.moment.SecondMoment();
        secondMoment35.increment(1.0d);
        secondMoment35.increment((double) (short) 0);
        double double40 = secondMoment35.getResult();
        org.apache.commons.math.stat.descriptive.moment.SecondMoment secondMoment41 = new org.apache.commons.math.stat.descriptive.moment.SecondMoment();
        secondMoment41.increment(1.0d);
        double[] doubleArray47 = new double[] { (-1L), 0, 10L };
        secondMoment41.incrementAll(doubleArray47, 0, 0);
        double double51 = secondMoment35.evaluate(doubleArray47);
        double[] doubleArray52 = new double[] {};
        secondMoment35.incrementAll(doubleArray52);
        secondMoment29.incrementAll(doubleArray52);
        double double55 = variance15.evaluate(doubleArray52);
        double double57 = variance1.evaluate(doubleArray52, 7262.8d);
        double double58 = variance1.getResult();
        variance1.clear();
        variance1.clear();
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 0L + "'", long2 == 0L);
        org.junit.Assert.assertTrue(Double.isNaN(double3));
        org.junit.Assert.assertNotNull(doubleArray22);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray22), "[-1.0, 0.0, 10.0]");
        org.junit.Assert.assertTrue("'" + long27 + "' != '" + 1L + "'", long27 == 1L);
        org.junit.Assert.assertTrue("'" + double34 + "' != '" + 0.5d + "'", double34 == 0.5d);
        org.junit.Assert.assertTrue("'" + double40 + "' != '" + 0.5d + "'", double40 == 0.5d);
        org.junit.Assert.assertNotNull(doubleArray47);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray47), "[-1.0, 0.0, 10.0]");
        org.junit.Assert.assertTrue("'" + double51 + "' != '" + 74.0d + "'", double51 == 74.0d);
        org.junit.Assert.assertNotNull(doubleArray52);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray52), "[]");
        org.junit.Assert.assertTrue(Double.isNaN(double55));
        org.junit.Assert.assertTrue(Double.isNaN(double57));
        org.junit.Assert.assertTrue("'" + double58 + "' != '" + 0.0d + "'", double58 == 0.0d);
    }

    @Test
    public void test13566() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest27.test13566");
        org.apache.commons.math.stat.descriptive.moment.SecondMoment secondMoment2 = new org.apache.commons.math.stat.descriptive.moment.SecondMoment();
        secondMoment2.increment((double) ' ');
        org.apache.commons.math.stat.descriptive.moment.Variance variance5 = new org.apache.commons.math.stat.descriptive.moment.Variance(secondMoment2);
        secondMoment2.increment((double) (short) -1);
        long long8 = secondMoment2.getN();
        double double9 = secondMoment2.getResult();
        org.apache.commons.math.stat.descriptive.moment.Variance variance10 = new org.apache.commons.math.stat.descriptive.moment.Variance(false, secondMoment2);
        org.apache.commons.math.stat.descriptive.moment.Variance variance11 = new org.apache.commons.math.stat.descriptive.moment.Variance(false, secondMoment2);
        long long12 = secondMoment2.getN();
        secondMoment2.increment(482.66666666666663d);
        double double15 = secondMoment2.getResult();
        org.apache.commons.math.stat.descriptive.moment.SecondMoment secondMoment16 = new org.apache.commons.math.stat.descriptive.moment.SecondMoment();
        secondMoment16.increment((double) ' ');
        org.apache.commons.math.stat.descriptive.moment.Variance variance19 = new org.apache.commons.math.stat.descriptive.moment.Variance(secondMoment16);
        secondMoment16.increment((double) (short) -1);
        secondMoment16.clear();
        double double23 = secondMoment16.getResult();
        org.apache.commons.math.stat.descriptive.moment.Variance variance24 = new org.apache.commons.math.stat.descriptive.moment.Variance(secondMoment16);
        variance24.increment(4050.0d);
        org.apache.commons.math.stat.descriptive.moment.SecondMoment secondMoment27 = new org.apache.commons.math.stat.descriptive.moment.SecondMoment();
        secondMoment27.increment(1.0d);
        double[] doubleArray33 = new double[] { (-1L), 0, 10L };
        secondMoment27.incrementAll(doubleArray33, 0, 0);
        org.apache.commons.math.stat.descriptive.moment.Variance variance37 = new org.apache.commons.math.stat.descriptive.moment.Variance(secondMoment27);
        long long38 = variance37.getN();
        variance37.setBiasCorrected(false);
        boolean boolean41 = variance24.equals((java.lang.Object) variance37);
        boolean boolean42 = variance37.isBiasCorrected();
        double double43 = variance37.getResult();
        long long44 = variance37.getN();
        org.apache.commons.math.stat.descriptive.moment.SecondMoment secondMoment47 = new org.apache.commons.math.stat.descriptive.moment.SecondMoment();
        secondMoment47.increment((double) ' ');
        org.apache.commons.math.stat.descriptive.moment.Variance variance50 = new org.apache.commons.math.stat.descriptive.moment.Variance(secondMoment47);
        secondMoment47.increment((double) (short) -1);
        long long53 = secondMoment47.getN();
        org.apache.commons.math.stat.descriptive.moment.Variance variance54 = new org.apache.commons.math.stat.descriptive.moment.Variance(false, secondMoment47);
        secondMoment47.clear();
        secondMoment47.increment(4402.666666666667d);
        org.apache.commons.math.stat.descriptive.moment.Variance variance58 = new org.apache.commons.math.stat.descriptive.moment.Variance(false, secondMoment47);
        double double59 = secondMoment47.getResult();
        double double60 = secondMoment47.getResult();
        org.apache.commons.math.stat.descriptive.moment.SecondMoment secondMoment61 = new org.apache.commons.math.stat.descriptive.moment.SecondMoment();
        secondMoment61.increment((double) ' ');
        secondMoment61.increment((double) (-1.0f));
        secondMoment61.clear();
        org.apache.commons.math.stat.descriptive.moment.SecondMoment secondMoment67 = new org.apache.commons.math.stat.descriptive.moment.SecondMoment();
        secondMoment67.increment(1.0d);
        double[] doubleArray73 = new double[] { (-1L), 0, 10L };
        secondMoment67.incrementAll(doubleArray73, 0, 0);
        org.apache.commons.math.stat.descriptive.moment.Variance variance77 = new org.apache.commons.math.stat.descriptive.moment.Variance(secondMoment67);
        long long78 = variance77.getN();
        org.apache.commons.math.stat.descriptive.moment.SecondMoment secondMoment79 = new org.apache.commons.math.stat.descriptive.moment.SecondMoment();
        secondMoment79.increment(1.0d);
        double[] doubleArray85 = new double[] { (-1L), 0, 10L };
        secondMoment79.incrementAll(doubleArray85, 0, 0);
        double double90 = variance77.evaluate(doubleArray85, (double) (short) -1);
        double double91 = secondMoment61.evaluate(doubleArray85);
        double double92 = secondMoment47.evaluate(doubleArray85);
        variance37.incrementAll(doubleArray85);
        // The following exception was thrown during execution in test generation
        try {
            double double96 = secondMoment2.evaluate(doubleArray85, (int) (byte) 100, (int) (short) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: begin + length > values.length");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 2L + "'", long8 == 2L);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 544.5d + "'", double9 == 544.5d);
        org.junit.Assert.assertTrue("'" + long12 + "' != '" + 2L + "'", long12 == 2L);
        org.junit.Assert.assertTrue("'" + double15 + "' != '" + 146040.96296296292d + "'", double15 == 146040.96296296292d);
        org.junit.Assert.assertTrue(Double.isNaN(double23));
        org.junit.Assert.assertNotNull(doubleArray33);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray33), "[-1.0, 0.0, 10.0]");
        org.junit.Assert.assertTrue("'" + long38 + "' != '" + 1L + "'", long38 == 1L);
        org.junit.Assert.assertTrue("'" + boolean41 + "' != '" + false + "'", boolean41 == false);
        org.junit.Assert.assertTrue("'" + boolean42 + "' != '" + false + "'", boolean42 == false);
        org.junit.Assert.assertTrue("'" + double43 + "' != '" + 0.0d + "'", double43 == 0.0d);
        org.junit.Assert.assertTrue("'" + long44 + "' != '" + 1L + "'", long44 == 1L);
        org.junit.Assert.assertTrue("'" + long53 + "' != '" + 2L + "'", long53 == 2L);
        org.junit.Assert.assertTrue("'" + double59 + "' != '" + 0.0d + "'", double59 == 0.0d);
        org.junit.Assert.assertTrue("'" + double60 + "' != '" + 0.0d + "'", double60 == 0.0d);
        org.junit.Assert.assertNotNull(doubleArray73);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray73), "[-1.0, 0.0, 10.0]");
        org.junit.Assert.assertTrue("'" + long78 + "' != '" + 1L + "'", long78 == 1L);
        org.junit.Assert.assertNotNull(doubleArray85);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray85), "[-1.0, 0.0, 10.0]");
        org.junit.Assert.assertTrue("'" + double90 + "' != '" + 37.0d + "'", double90 == 37.0d);
        org.junit.Assert.assertTrue("'" + double91 + "' != '" + 74.0d + "'", double91 == 74.0d);
        org.junit.Assert.assertTrue("'" + double92 + "' != '" + 74.0d + "'", double92 == 74.0d);
    }

    @Test
    public void test13567() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest27.test13567");
        org.apache.commons.math.stat.descriptive.moment.SecondMoment secondMoment1 = new org.apache.commons.math.stat.descriptive.moment.SecondMoment();
        secondMoment1.increment((double) ' ');
        org.apache.commons.math.stat.descriptive.moment.Variance variance4 = new org.apache.commons.math.stat.descriptive.moment.Variance(secondMoment1);
        org.apache.commons.math.stat.descriptive.moment.Variance variance5 = new org.apache.commons.math.stat.descriptive.moment.Variance(false, secondMoment1);
        long long6 = variance5.getN();
        org.apache.commons.math.stat.descriptive.moment.SecondMoment secondMoment7 = new org.apache.commons.math.stat.descriptive.moment.SecondMoment();
        secondMoment7.increment(1.0d);
        double[] doubleArray13 = new double[] { (-1L), 0, 10L };
        secondMoment7.incrementAll(doubleArray13, 0, 0);
        org.apache.commons.math.stat.descriptive.moment.Variance variance17 = new org.apache.commons.math.stat.descriptive.moment.Variance(secondMoment7);
        org.apache.commons.math.stat.descriptive.moment.SecondMoment secondMoment18 = new org.apache.commons.math.stat.descriptive.moment.SecondMoment();
        secondMoment18.increment((double) ' ');
        secondMoment18.increment((double) (-1.0f));
        secondMoment18.clear();
        boolean boolean24 = variance17.equals((java.lang.Object) secondMoment18);
        double double25 = variance17.getResult();
        variance17.increment(3602.0d);
        variance17.increment(11282.0d);
        boolean boolean30 = variance5.equals((java.lang.Object) 11282.0d);
        long long31 = variance5.getN();
        variance5.setBiasCorrected(true);
        long long34 = variance5.getN();
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 1L + "'", long6 == 1L);
        org.junit.Assert.assertNotNull(doubleArray13);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray13), "[-1.0, 0.0, 10.0]");
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertTrue("'" + double25 + "' != '" + 0.0d + "'", double25 == 0.0d);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + false + "'", boolean30 == false);
        org.junit.Assert.assertTrue("'" + long31 + "' != '" + 1L + "'", long31 == 1L);
        org.junit.Assert.assertTrue("'" + long34 + "' != '" + 1L + "'", long34 == 1L);
    }

    @Test
    public void test13568() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest27.test13568");
        org.apache.commons.math.stat.descriptive.moment.SecondMoment secondMoment2 = new org.apache.commons.math.stat.descriptive.moment.SecondMoment();
        secondMoment2.increment(1.0d);
        secondMoment2.increment((double) (short) 0);
        double double7 = secondMoment2.getResult();
        secondMoment2.clear();
        org.apache.commons.math.stat.descriptive.moment.Variance variance9 = new org.apache.commons.math.stat.descriptive.moment.Variance(false, secondMoment2);
        double double10 = secondMoment2.getResult();
        secondMoment2.clear();
        org.apache.commons.math.stat.descriptive.moment.Variance variance12 = new org.apache.commons.math.stat.descriptive.moment.Variance(false, secondMoment2);
        variance12.setBiasCorrected(false);
        variance12.clear();
        org.apache.commons.math.stat.descriptive.moment.SecondMoment secondMoment18 = new org.apache.commons.math.stat.descriptive.moment.SecondMoment();
        secondMoment18.increment((double) ' ');
        org.apache.commons.math.stat.descriptive.moment.Variance variance21 = new org.apache.commons.math.stat.descriptive.moment.Variance(secondMoment18);
        secondMoment18.increment((double) (short) -1);
        long long24 = secondMoment18.getN();
        double double25 = secondMoment18.getResult();
        org.apache.commons.math.stat.descriptive.moment.Variance variance26 = new org.apache.commons.math.stat.descriptive.moment.Variance(false, secondMoment18);
        org.apache.commons.math.stat.descriptive.moment.Variance variance27 = new org.apache.commons.math.stat.descriptive.moment.Variance(false, secondMoment18);
        long long28 = secondMoment18.getN();
        secondMoment18.increment(482.66666666666663d);
        secondMoment18.increment(32.0d);
        secondMoment18.clear();
        secondMoment18.clear();
        boolean boolean35 = variance12.equals((java.lang.Object) secondMoment18);
        variance12.increment(82.0d);
        double double38 = variance12.getResult();
        boolean boolean39 = variance12.isBiasCorrected();
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 0.5d + "'", double7 == 0.5d);
        org.junit.Assert.assertTrue(Double.isNaN(double10));
        org.junit.Assert.assertTrue("'" + long24 + "' != '" + 2L + "'", long24 == 2L);
        org.junit.Assert.assertTrue("'" + double25 + "' != '" + 544.5d + "'", double25 == 544.5d);
        org.junit.Assert.assertTrue("'" + long28 + "' != '" + 2L + "'", long28 == 2L);
        org.junit.Assert.assertTrue("'" + boolean35 + "' != '" + true + "'", boolean35 == true);
        org.junit.Assert.assertTrue(Double.isNaN(double38));
        org.junit.Assert.assertTrue("'" + boolean39 + "' != '" + false + "'", boolean39 == false);
    }

    @Test
    public void test13569() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest27.test13569");
        org.apache.commons.math.stat.descriptive.moment.SecondMoment secondMoment0 = new org.apache.commons.math.stat.descriptive.moment.SecondMoment();
        secondMoment0.increment(1.0d);
        secondMoment0.increment((double) (short) 0);
        double double5 = secondMoment0.getResult();
        secondMoment0.clear();
        long long7 = secondMoment0.getN();
        secondMoment0.increment(5226.0d);
        secondMoment0.clear();
        long long11 = secondMoment0.getN();
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.5d + "'", double5 == 0.5d);
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + 0L + "'", long7 == 0L);
        org.junit.Assert.assertTrue("'" + long11 + "' != '" + 0L + "'", long11 == 0L);
    }

    @Test
    public void test13570() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest27.test13570");
        org.apache.commons.math.stat.descriptive.moment.SecondMoment secondMoment1 = new org.apache.commons.math.stat.descriptive.moment.SecondMoment();
        secondMoment1.increment(1.0d);
        double[] doubleArray7 = new double[] { (-1L), 0, 10L };
        secondMoment1.incrementAll(doubleArray7, 0, 0);
        long long11 = secondMoment1.getN();
        org.apache.commons.math.stat.descriptive.moment.Variance variance12 = new org.apache.commons.math.stat.descriptive.moment.Variance(secondMoment1);
        secondMoment1.increment(10.0d);
        secondMoment1.clear();
        org.apache.commons.math.stat.descriptive.moment.Variance variance16 = new org.apache.commons.math.stat.descriptive.moment.Variance(false, secondMoment1);
        double double17 = secondMoment1.getResult();
        org.apache.commons.math.stat.descriptive.moment.Variance variance18 = new org.apache.commons.math.stat.descriptive.moment.Variance(secondMoment1);
        double double19 = secondMoment1.getResult();
        secondMoment1.clear();
        org.junit.Assert.assertNotNull(doubleArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray7), "[-1.0, 0.0, 10.0]");
        org.junit.Assert.assertTrue("'" + long11 + "' != '" + 1L + "'", long11 == 1L);
        org.junit.Assert.assertTrue(Double.isNaN(double17));
        org.junit.Assert.assertTrue(Double.isNaN(double19));
    }

    @Test
    public void test13571() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest27.test13571");
        org.apache.commons.math.stat.descriptive.moment.SecondMoment secondMoment0 = new org.apache.commons.math.stat.descriptive.moment.SecondMoment();
        secondMoment0.increment(1.0d);
        double[] doubleArray6 = new double[] { (-1L), 0, 10L };
        secondMoment0.incrementAll(doubleArray6, 0, 0);
        org.apache.commons.math.stat.descriptive.moment.Variance variance10 = new org.apache.commons.math.stat.descriptive.moment.Variance(secondMoment0);
        org.apache.commons.math.stat.descriptive.moment.SecondMoment secondMoment11 = new org.apache.commons.math.stat.descriptive.moment.SecondMoment();
        secondMoment11.increment((double) ' ');
        secondMoment11.increment((double) (-1.0f));
        secondMoment11.clear();
        boolean boolean17 = variance10.equals((java.lang.Object) secondMoment11);
        org.apache.commons.math.stat.descriptive.moment.SecondMoment secondMoment18 = new org.apache.commons.math.stat.descriptive.moment.SecondMoment();
        secondMoment18.increment((double) ' ');
        org.apache.commons.math.stat.descriptive.moment.Variance variance21 = new org.apache.commons.math.stat.descriptive.moment.Variance(secondMoment18);
        secondMoment18.increment((double) (short) -1);
        secondMoment18.clear();
        secondMoment18.increment((double) 0L);
        org.apache.commons.math.stat.descriptive.moment.Variance variance27 = new org.apache.commons.math.stat.descriptive.moment.Variance(secondMoment18);
        org.apache.commons.math.stat.descriptive.moment.SecondMoment secondMoment28 = new org.apache.commons.math.stat.descriptive.moment.SecondMoment();
        secondMoment28.increment(1.0d);
        double[] doubleArray34 = new double[] { (-1L), 0, 10L };
        secondMoment28.incrementAll(doubleArray34, 0, 0);
        variance27.incrementAll(doubleArray34);
        org.apache.commons.math.stat.descriptive.moment.SecondMoment secondMoment39 = new org.apache.commons.math.stat.descriptive.moment.SecondMoment();
        secondMoment39.increment((double) ' ');
        org.apache.commons.math.stat.descriptive.moment.Variance variance42 = new org.apache.commons.math.stat.descriptive.moment.Variance(secondMoment39);
        secondMoment39.increment((double) (short) -1);
        secondMoment39.clear();
        secondMoment39.increment((double) 0L);
        org.apache.commons.math.stat.descriptive.moment.Variance variance48 = new org.apache.commons.math.stat.descriptive.moment.Variance(secondMoment39);
        org.apache.commons.math.stat.descriptive.moment.SecondMoment secondMoment49 = new org.apache.commons.math.stat.descriptive.moment.SecondMoment();
        secondMoment49.increment(1.0d);
        secondMoment49.increment((double) (short) 0);
        double double54 = secondMoment49.getResult();
        org.apache.commons.math.stat.descriptive.moment.SecondMoment secondMoment55 = new org.apache.commons.math.stat.descriptive.moment.SecondMoment();
        secondMoment55.increment(1.0d);
        double[] doubleArray61 = new double[] { (-1L), 0, 10L };
        secondMoment55.incrementAll(doubleArray61, 0, 0);
        double double65 = secondMoment49.evaluate(doubleArray61);
        double double66 = secondMoment39.evaluate(doubleArray61);
        double double67 = variance27.evaluate(doubleArray61);
        double double68 = secondMoment11.evaluate(doubleArray61);
        secondMoment11.increment(200.0d);
        double double71 = secondMoment11.getResult();
        double double72 = secondMoment11.getResult();
        double double73 = secondMoment11.getResult();
        secondMoment11.increment(82.0d);
        secondMoment11.clear();
        org.junit.Assert.assertNotNull(doubleArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray6), "[-1.0, 0.0, 10.0]");
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertNotNull(doubleArray34);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray34), "[-1.0, 0.0, 10.0]");
        org.junit.Assert.assertTrue("'" + double54 + "' != '" + 0.5d + "'", double54 == 0.5d);
        org.junit.Assert.assertNotNull(doubleArray61);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray61), "[-1.0, 0.0, 10.0]");
        org.junit.Assert.assertTrue("'" + double65 + "' != '" + 74.0d + "'", double65 == 74.0d);
        org.junit.Assert.assertTrue("'" + double66 + "' != '" + 74.0d + "'", double66 == 74.0d);
        org.junit.Assert.assertTrue("'" + double67 + "' != '" + 37.0d + "'", double67 == 37.0d);
        org.junit.Assert.assertTrue("'" + double68 + "' != '" + 74.0d + "'", double68 == 74.0d);
        org.junit.Assert.assertTrue("'" + double71 + "' != '" + 29180.75d + "'", double71 == 29180.75d);
        org.junit.Assert.assertTrue("'" + double72 + "' != '" + 29180.75d + "'", double72 == 29180.75d);
        org.junit.Assert.assertTrue("'" + double73 + "' != '" + 29180.75d + "'", double73 == 29180.75d);
    }

    @Test
    public void test13572() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest27.test13572");
        org.apache.commons.math.stat.descriptive.moment.SecondMoment secondMoment1 = new org.apache.commons.math.stat.descriptive.moment.SecondMoment();
        secondMoment1.increment(1.0d);
        secondMoment1.increment((double) 10L);
        org.apache.commons.math.stat.descriptive.moment.SecondMoment secondMoment6 = new org.apache.commons.math.stat.descriptive.moment.SecondMoment();
        secondMoment6.increment(1.0d);
        secondMoment6.increment((double) (short) 0);
        double double11 = secondMoment6.getResult();
        org.apache.commons.math.stat.descriptive.moment.SecondMoment secondMoment12 = new org.apache.commons.math.stat.descriptive.moment.SecondMoment();
        secondMoment12.increment(1.0d);
        secondMoment12.increment((double) (short) 0);
        double double17 = secondMoment12.getResult();
        org.apache.commons.math.stat.descriptive.moment.SecondMoment secondMoment18 = new org.apache.commons.math.stat.descriptive.moment.SecondMoment();
        secondMoment18.increment(1.0d);
        double[] doubleArray24 = new double[] { (-1L), 0, 10L };
        secondMoment18.incrementAll(doubleArray24, 0, 0);
        double double28 = secondMoment12.evaluate(doubleArray24);
        double[] doubleArray29 = new double[] {};
        secondMoment12.incrementAll(doubleArray29);
        secondMoment6.incrementAll(doubleArray29);
        secondMoment6.increment((double) 2L);
        org.apache.commons.math.stat.descriptive.moment.Variance variance34 = new org.apache.commons.math.stat.descriptive.moment.Variance(secondMoment6);
        org.apache.commons.math.stat.descriptive.moment.SecondMoment secondMoment35 = new org.apache.commons.math.stat.descriptive.moment.SecondMoment();
        secondMoment35.increment(1.0d);
        double[] doubleArray41 = new double[] { (-1L), 0, 10L };
        secondMoment35.incrementAll(doubleArray41, 0, 0);
        double[] doubleArray47 = new double[] { 10, (byte) 100 };
        double double48 = secondMoment35.evaluate(doubleArray47);
        double double49 = variance34.evaluate(doubleArray47);
        double double50 = secondMoment1.evaluate(doubleArray47);
        org.apache.commons.math.stat.descriptive.moment.SecondMoment secondMoment51 = new org.apache.commons.math.stat.descriptive.moment.SecondMoment();
        secondMoment51.increment(1.0d);
        secondMoment51.increment((double) (short) 0);
        double double56 = secondMoment51.getResult();
        org.apache.commons.math.stat.descriptive.moment.SecondMoment secondMoment57 = new org.apache.commons.math.stat.descriptive.moment.SecondMoment();
        secondMoment57.increment(1.0d);
        secondMoment57.increment((double) (short) 0);
        double double62 = secondMoment57.getResult();
        org.apache.commons.math.stat.descriptive.moment.SecondMoment secondMoment63 = new org.apache.commons.math.stat.descriptive.moment.SecondMoment();
        secondMoment63.increment(1.0d);
        double[] doubleArray69 = new double[] { (-1L), 0, 10L };
        secondMoment63.incrementAll(doubleArray69, 0, 0);
        double double73 = secondMoment57.evaluate(doubleArray69);
        double[] doubleArray74 = new double[] {};
        secondMoment57.incrementAll(doubleArray74);
        secondMoment51.incrementAll(doubleArray74);
        double double77 = secondMoment1.evaluate(doubleArray74);
        long long78 = secondMoment1.getN();
        secondMoment1.increment((double) (byte) 1);
        org.apache.commons.math.stat.descriptive.moment.Variance variance81 = new org.apache.commons.math.stat.descriptive.moment.Variance(true, secondMoment1);
        boolean boolean82 = variance81.isBiasCorrected();
        long long83 = variance81.getN();
        double double84 = variance81.getResult();
        variance81.clear();
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 0.5d + "'", double11 == 0.5d);
        org.junit.Assert.assertTrue("'" + double17 + "' != '" + 0.5d + "'", double17 == 0.5d);
        org.junit.Assert.assertNotNull(doubleArray24);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray24), "[-1.0, 0.0, 10.0]");
        org.junit.Assert.assertTrue("'" + double28 + "' != '" + 74.0d + "'", double28 == 74.0d);
        org.junit.Assert.assertNotNull(doubleArray29);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray29), "[]");
        org.junit.Assert.assertNotNull(doubleArray41);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray41), "[-1.0, 0.0, 10.0]");
        org.junit.Assert.assertNotNull(doubleArray47);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray47), "[10.0, 100.0]");
        org.junit.Assert.assertTrue("'" + double48 + "' != '" + 4050.0d + "'", double48 == 4050.0d);
        org.junit.Assert.assertTrue("'" + double49 + "' != '" + 4050.0d + "'", double49 == 4050.0d);
        org.junit.Assert.assertTrue("'" + double50 + "' != '" + 4050.0d + "'", double50 == 4050.0d);
        org.junit.Assert.assertTrue("'" + double56 + "' != '" + 0.5d + "'", double56 == 0.5d);
        org.junit.Assert.assertTrue("'" + double62 + "' != '" + 0.5d + "'", double62 == 0.5d);
        org.junit.Assert.assertNotNull(doubleArray69);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray69), "[-1.0, 0.0, 10.0]");
        org.junit.Assert.assertTrue("'" + double73 + "' != '" + 74.0d + "'", double73 == 74.0d);
        org.junit.Assert.assertNotNull(doubleArray74);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray74), "[]");
        org.junit.Assert.assertTrue("'" + double77 + "' != '" + 4050.0d + "'", double77 == 4050.0d);
        org.junit.Assert.assertTrue("'" + long78 + "' != '" + 2L + "'", long78 == 2L);
        org.junit.Assert.assertTrue("'" + boolean82 + "' != '" + true + "'", boolean82 == true);
        org.junit.Assert.assertTrue("'" + long83 + "' != '" + 3L + "'", long83 == 3L);
        org.junit.Assert.assertTrue("'" + double84 + "' != '" + 2997.0d + "'", double84 == 2997.0d);
    }

    @Test
    public void test13573() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest27.test13573");
        org.apache.commons.math.stat.descriptive.moment.SecondMoment secondMoment0 = new org.apache.commons.math.stat.descriptive.moment.SecondMoment();
        secondMoment0.increment((double) ' ');
        org.apache.commons.math.stat.descriptive.moment.Variance variance3 = new org.apache.commons.math.stat.descriptive.moment.Variance(secondMoment0);
        secondMoment0.increment((double) (short) -1);
        secondMoment0.clear();
        secondMoment0.increment((double) 0L);
        org.apache.commons.math.stat.descriptive.moment.Variance variance9 = new org.apache.commons.math.stat.descriptive.moment.Variance(secondMoment0);
        org.apache.commons.math.stat.descriptive.moment.SecondMoment secondMoment11 = new org.apache.commons.math.stat.descriptive.moment.SecondMoment();
        secondMoment11.increment(1.0d);
        double[] doubleArray17 = new double[] { (-1L), 0, 10L };
        secondMoment11.incrementAll(doubleArray17, 0, 0);
        double[] doubleArray23 = new double[] { 10, (byte) 100 };
        double double24 = secondMoment11.evaluate(doubleArray23);
        double double25 = secondMoment11.getResult();
        org.apache.commons.math.stat.descriptive.moment.Variance variance26 = new org.apache.commons.math.stat.descriptive.moment.Variance(false, secondMoment11);
        org.apache.commons.math.stat.descriptive.moment.Variance variance27 = new org.apache.commons.math.stat.descriptive.moment.Variance();
        org.apache.commons.math.stat.descriptive.moment.SecondMoment secondMoment28 = new org.apache.commons.math.stat.descriptive.moment.SecondMoment();
        secondMoment28.increment(1.0d);
        secondMoment28.increment((double) (short) 0);
        double double33 = secondMoment28.getResult();
        org.apache.commons.math.stat.descriptive.moment.SecondMoment secondMoment34 = new org.apache.commons.math.stat.descriptive.moment.SecondMoment();
        secondMoment34.increment(1.0d);
        double[] doubleArray40 = new double[] { (-1L), 0, 10L };
        secondMoment34.incrementAll(doubleArray40, 0, 0);
        double double44 = secondMoment28.evaluate(doubleArray40);
        double[] doubleArray45 = new double[] {};
        secondMoment28.incrementAll(doubleArray45);
        double double49 = variance27.evaluate(doubleArray45, (int) (byte) 0, 0);
        double double50 = variance26.evaluate(doubleArray45);
        double double51 = variance9.evaluate(doubleArray45);
        long long52 = variance9.getN();
        variance9.setBiasCorrected(false);
        long long55 = variance9.getN();
        variance9.setBiasCorrected(true);
        variance9.increment(4402.666666666667d);
        double double60 = variance9.getResult();
        variance9.increment(3.746542163E7d);
        boolean boolean63 = variance9.isBiasCorrected();
        variance9.increment(28.666666666666664d);
        org.junit.Assert.assertNotNull(doubleArray17);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray17), "[-1.0, 0.0, 10.0]");
        org.junit.Assert.assertNotNull(doubleArray23);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray23), "[10.0, 100.0]");
        org.junit.Assert.assertTrue("'" + double24 + "' != '" + 4050.0d + "'", double24 == 4050.0d);
        org.junit.Assert.assertTrue("'" + double25 + "' != '" + 4050.0d + "'", double25 == 4050.0d);
        org.junit.Assert.assertTrue("'" + double33 + "' != '" + 0.5d + "'", double33 == 0.5d);
        org.junit.Assert.assertNotNull(doubleArray40);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray40), "[-1.0, 0.0, 10.0]");
        org.junit.Assert.assertTrue("'" + double44 + "' != '" + 74.0d + "'", double44 == 74.0d);
        org.junit.Assert.assertNotNull(doubleArray45);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray45), "[]");
        org.junit.Assert.assertTrue(Double.isNaN(double49));
        org.junit.Assert.assertTrue(Double.isNaN(double50));
        org.junit.Assert.assertTrue(Double.isNaN(double51));
        org.junit.Assert.assertTrue("'" + long52 + "' != '" + 1L + "'", long52 == 1L);
        org.junit.Assert.assertTrue("'" + long55 + "' != '" + 1L + "'", long55 == 1L);
        org.junit.Assert.assertTrue("'" + double60 + "' != '" + 0.0d + "'", double60 == 0.0d);
        org.junit.Assert.assertTrue("'" + boolean63 + "' != '" + true + "'", boolean63 == true);
    }

    @Test
    public void test13574() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest27.test13574");
        org.apache.commons.math.stat.descriptive.moment.Variance variance1 = new org.apache.commons.math.stat.descriptive.moment.Variance(true);
        org.apache.commons.math.stat.descriptive.moment.Variance variance2 = new org.apache.commons.math.stat.descriptive.moment.Variance();
        org.apache.commons.math.stat.descriptive.moment.SecondMoment secondMoment3 = new org.apache.commons.math.stat.descriptive.moment.SecondMoment();
        secondMoment3.increment(1.0d);
        secondMoment3.increment((double) (short) 0);
        double double8 = secondMoment3.getResult();
        org.apache.commons.math.stat.descriptive.moment.SecondMoment secondMoment9 = new org.apache.commons.math.stat.descriptive.moment.SecondMoment();
        secondMoment9.increment(1.0d);
        double[] doubleArray15 = new double[] { (-1L), 0, 10L };
        secondMoment9.incrementAll(doubleArray15, 0, 0);
        double double19 = secondMoment3.evaluate(doubleArray15);
        double[] doubleArray20 = new double[] {};
        secondMoment3.incrementAll(doubleArray20);
        double double24 = variance2.evaluate(doubleArray20, (int) (byte) 0, 0);
        variance1.incrementAll(doubleArray20);
        double double26 = variance1.getResult();
        long long27 = variance1.getN();
        double double28 = variance1.getResult();
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 0.5d + "'", double8 == 0.5d);
        org.junit.Assert.assertNotNull(doubleArray15);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray15), "[-1.0, 0.0, 10.0]");
        org.junit.Assert.assertTrue("'" + double19 + "' != '" + 74.0d + "'", double19 == 74.0d);
        org.junit.Assert.assertNotNull(doubleArray20);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray20), "[]");
        org.junit.Assert.assertTrue(Double.isNaN(double24));
        org.junit.Assert.assertTrue(Double.isNaN(double26));
        org.junit.Assert.assertTrue("'" + long27 + "' != '" + 0L + "'", long27 == 0L);
        org.junit.Assert.assertTrue(Double.isNaN(double28));
    }

    @Test
    public void test13575() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest27.test13575");
        org.apache.commons.math.stat.descriptive.moment.SecondMoment secondMoment0 = new org.apache.commons.math.stat.descriptive.moment.SecondMoment();
        secondMoment0.increment(1.0d);
        double[] doubleArray6 = new double[] { (-1L), 0, 10L };
        secondMoment0.incrementAll(doubleArray6, 0, 0);
        org.apache.commons.math.stat.descriptive.moment.Variance variance10 = new org.apache.commons.math.stat.descriptive.moment.Variance(secondMoment0);
        long long11 = variance10.getN();
        double double12 = variance10.getResult();
        org.apache.commons.math.stat.descriptive.moment.SecondMoment secondMoment13 = new org.apache.commons.math.stat.descriptive.moment.SecondMoment();
        secondMoment13.increment(1.0d);
        secondMoment13.increment((double) (short) 0);
        long long18 = secondMoment13.getN();
        double double19 = secondMoment13.getResult();
        secondMoment13.increment((double) (byte) 10);
        secondMoment13.clear();
        secondMoment13.increment((double) ' ');
        org.apache.commons.math.stat.descriptive.moment.SecondMoment secondMoment27 = new org.apache.commons.math.stat.descriptive.moment.SecondMoment();
        secondMoment27.increment(1.0d);
        double[] doubleArray33 = new double[] { (-1L), 0, 10L };
        secondMoment27.incrementAll(doubleArray33, 0, 0);
        double[] doubleArray39 = new double[] { 10, (byte) 100 };
        double double40 = secondMoment27.evaluate(doubleArray39);
        double double41 = secondMoment27.getResult();
        org.apache.commons.math.stat.descriptive.moment.Variance variance42 = new org.apache.commons.math.stat.descriptive.moment.Variance(false, secondMoment27);
        long long43 = secondMoment27.getN();
        org.apache.commons.math.stat.descriptive.moment.Variance variance44 = new org.apache.commons.math.stat.descriptive.moment.Variance(true, secondMoment27);
        secondMoment27.clear();
        org.apache.commons.math.stat.descriptive.moment.SecondMoment secondMoment47 = new org.apache.commons.math.stat.descriptive.moment.SecondMoment();
        secondMoment47.increment(1.0d);
        double[] doubleArray53 = new double[] { (-1L), 0, 10L };
        secondMoment47.incrementAll(doubleArray53, 0, 0);
        double[] doubleArray59 = new double[] { 10, (byte) 100 };
        double double60 = secondMoment47.evaluate(doubleArray59);
        double double61 = secondMoment47.getResult();
        org.apache.commons.math.stat.descriptive.moment.Variance variance62 = new org.apache.commons.math.stat.descriptive.moment.Variance(false, secondMoment47);
        long long63 = secondMoment47.getN();
        org.apache.commons.math.stat.descriptive.moment.SecondMoment secondMoment64 = new org.apache.commons.math.stat.descriptive.moment.SecondMoment();
        secondMoment64.increment((double) ' ');
        secondMoment64.increment((double) (-1.0f));
        secondMoment64.clear();
        org.apache.commons.math.stat.descriptive.moment.SecondMoment secondMoment70 = new org.apache.commons.math.stat.descriptive.moment.SecondMoment();
        secondMoment70.increment(1.0d);
        double[] doubleArray76 = new double[] { (-1L), 0, 10L };
        secondMoment70.incrementAll(doubleArray76, 0, 0);
        org.apache.commons.math.stat.descriptive.moment.Variance variance80 = new org.apache.commons.math.stat.descriptive.moment.Variance(secondMoment70);
        long long81 = variance80.getN();
        org.apache.commons.math.stat.descriptive.moment.SecondMoment secondMoment82 = new org.apache.commons.math.stat.descriptive.moment.SecondMoment();
        secondMoment82.increment(1.0d);
        double[] doubleArray88 = new double[] { (-1L), 0, 10L };
        secondMoment82.incrementAll(doubleArray88, 0, 0);
        double double93 = variance80.evaluate(doubleArray88, (double) (short) -1);
        double double94 = secondMoment64.evaluate(doubleArray88);
        double double95 = secondMoment47.evaluate(doubleArray88);
        double double96 = secondMoment27.evaluate(doubleArray88);
        double double97 = secondMoment13.evaluate(doubleArray88);
        boolean boolean98 = variance10.equals((java.lang.Object) doubleArray88);
        org.junit.Assert.assertNotNull(doubleArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray6), "[-1.0, 0.0, 10.0]");
        org.junit.Assert.assertTrue("'" + long11 + "' != '" + 1L + "'", long11 == 1L);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 0.0d + "'", double12 == 0.0d);
        org.junit.Assert.assertTrue("'" + long18 + "' != '" + 2L + "'", long18 == 2L);
        org.junit.Assert.assertTrue("'" + double19 + "' != '" + 0.5d + "'", double19 == 0.5d);
        org.junit.Assert.assertNotNull(doubleArray33);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray33), "[-1.0, 0.0, 10.0]");
        org.junit.Assert.assertNotNull(doubleArray39);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray39), "[10.0, 100.0]");
        org.junit.Assert.assertTrue("'" + double40 + "' != '" + 4050.0d + "'", double40 == 4050.0d);
        org.junit.Assert.assertTrue("'" + double41 + "' != '" + 4050.0d + "'", double41 == 4050.0d);
        org.junit.Assert.assertTrue("'" + long43 + "' != '" + 2L + "'", long43 == 2L);
        org.junit.Assert.assertNotNull(doubleArray53);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray53), "[-1.0, 0.0, 10.0]");
        org.junit.Assert.assertNotNull(doubleArray59);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray59), "[10.0, 100.0]");
        org.junit.Assert.assertTrue("'" + double60 + "' != '" + 4050.0d + "'", double60 == 4050.0d);
        org.junit.Assert.assertTrue("'" + double61 + "' != '" + 4050.0d + "'", double61 == 4050.0d);
        org.junit.Assert.assertTrue("'" + long63 + "' != '" + 2L + "'", long63 == 2L);
        org.junit.Assert.assertNotNull(doubleArray76);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray76), "[-1.0, 0.0, 10.0]");
        org.junit.Assert.assertTrue("'" + long81 + "' != '" + 1L + "'", long81 == 1L);
        org.junit.Assert.assertNotNull(doubleArray88);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray88), "[-1.0, 0.0, 10.0]");
        org.junit.Assert.assertTrue("'" + double93 + "' != '" + 37.0d + "'", double93 == 37.0d);
        org.junit.Assert.assertTrue("'" + double94 + "' != '" + 74.0d + "'", double94 == 74.0d);
        org.junit.Assert.assertTrue("'" + double95 + "' != '" + 74.0d + "'", double95 == 74.0d);
        org.junit.Assert.assertTrue("'" + double96 + "' != '" + 74.0d + "'", double96 == 74.0d);
        org.junit.Assert.assertTrue("'" + double97 + "' != '" + 74.0d + "'", double97 == 74.0d);
        org.junit.Assert.assertTrue("'" + boolean98 + "' != '" + false + "'", boolean98 == false);
    }

    @Test
    public void test13576() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest27.test13576");
        org.apache.commons.math.stat.descriptive.moment.SecondMoment secondMoment0 = new org.apache.commons.math.stat.descriptive.moment.SecondMoment();
        secondMoment0.increment(1.0d);
        double[] doubleArray6 = new double[] { (-1L), 0, 10L };
        secondMoment0.incrementAll(doubleArray6, 0, 0);
        double[] doubleArray12 = new double[] { 10, (byte) 100 };
        double double13 = secondMoment0.evaluate(doubleArray12);
        long long14 = secondMoment0.getN();
        double double15 = secondMoment0.getResult();
        secondMoment0.increment((double) ' ');
        double double18 = secondMoment0.getResult();
        secondMoment0.increment((double) 1.0f);
        org.apache.commons.math.stat.descriptive.moment.Variance variance21 = new org.apache.commons.math.stat.descriptive.moment.Variance(secondMoment0);
        variance21.increment(1.2215704987955729E7d);
        org.apache.commons.math.stat.descriptive.moment.SecondMoment secondMoment24 = new org.apache.commons.math.stat.descriptive.moment.SecondMoment();
        secondMoment24.increment(1.0d);
        double[] doubleArray30 = new double[] { (-1L), 0, 10L };
        secondMoment24.incrementAll(doubleArray30, 0, 0);
        double[] doubleArray36 = new double[] { 10, (byte) 100 };
        double double37 = secondMoment24.evaluate(doubleArray36);
        double double38 = secondMoment24.getResult();
        secondMoment24.increment((double) (short) -1);
        double double41 = secondMoment24.getResult();
        long long42 = secondMoment24.getN();
        org.apache.commons.math.stat.descriptive.moment.SecondMoment secondMoment43 = new org.apache.commons.math.stat.descriptive.moment.SecondMoment();
        secondMoment43.increment((double) ' ');
        org.apache.commons.math.stat.descriptive.moment.Variance variance46 = new org.apache.commons.math.stat.descriptive.moment.Variance(secondMoment43);
        secondMoment43.increment((double) (short) -1);
        secondMoment43.clear();
        secondMoment43.increment((double) 0L);
        org.apache.commons.math.stat.descriptive.moment.Variance variance52 = new org.apache.commons.math.stat.descriptive.moment.Variance(secondMoment43);
        long long53 = variance52.getN();
        variance52.clear();
        variance52.increment((double) (byte) 10);
        org.apache.commons.math.stat.descriptive.moment.SecondMoment secondMoment57 = new org.apache.commons.math.stat.descriptive.moment.SecondMoment();
        secondMoment57.increment((double) ' ');
        double double60 = secondMoment57.getResult();
        double double61 = secondMoment57.getResult();
        org.apache.commons.math.stat.descriptive.moment.Variance variance63 = new org.apache.commons.math.stat.descriptive.moment.Variance(true);
        org.apache.commons.math.stat.descriptive.moment.Variance variance64 = new org.apache.commons.math.stat.descriptive.moment.Variance();
        org.apache.commons.math.stat.descriptive.moment.SecondMoment secondMoment65 = new org.apache.commons.math.stat.descriptive.moment.SecondMoment();
        secondMoment65.increment(1.0d);
        secondMoment65.increment((double) (short) 0);
        double double70 = secondMoment65.getResult();
        org.apache.commons.math.stat.descriptive.moment.SecondMoment secondMoment71 = new org.apache.commons.math.stat.descriptive.moment.SecondMoment();
        secondMoment71.increment(1.0d);
        double[] doubleArray77 = new double[] { (-1L), 0, 10L };
        secondMoment71.incrementAll(doubleArray77, 0, 0);
        double double81 = secondMoment65.evaluate(doubleArray77);
        double[] doubleArray82 = new double[] {};
        secondMoment65.incrementAll(doubleArray82);
        double double86 = variance64.evaluate(doubleArray82, (int) (byte) 0, 0);
        variance63.incrementAll(doubleArray82);
        double double88 = secondMoment57.evaluate(doubleArray82);
        double double89 = variance52.evaluate(doubleArray82);
        double double90 = secondMoment24.evaluate(doubleArray82);
        // The following exception was thrown during execution in test generation
        try {
            double double93 = variance21.evaluate(doubleArray82, (int) (short) 100, (int) (short) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: begin + length > values.length");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(doubleArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray6), "[-1.0, 0.0, 10.0]");
        org.junit.Assert.assertNotNull(doubleArray12);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray12), "[10.0, 100.0]");
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 4050.0d + "'", double13 == 4050.0d);
        org.junit.Assert.assertTrue("'" + long14 + "' != '" + 2L + "'", long14 == 2L);
        org.junit.Assert.assertTrue("'" + double15 + "' != '" + 4050.0d + "'", double15 == 4050.0d);
        org.junit.Assert.assertTrue("'" + double18 + "' != '" + 4402.666666666667d + "'", double18 == 4402.666666666667d);
        org.junit.Assert.assertNotNull(doubleArray30);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray30), "[-1.0, 0.0, 10.0]");
        org.junit.Assert.assertNotNull(doubleArray36);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray36), "[10.0, 100.0]");
        org.junit.Assert.assertTrue("'" + double37 + "' != '" + 4050.0d + "'", double37 == 4050.0d);
        org.junit.Assert.assertTrue("'" + double38 + "' != '" + 4050.0d + "'", double38 == 4050.0d);
        org.junit.Assert.assertTrue("'" + double41 + "' != '" + 6140.666666666667d + "'", double41 == 6140.666666666667d);
        org.junit.Assert.assertTrue("'" + long42 + "' != '" + 3L + "'", long42 == 3L);
        org.junit.Assert.assertTrue("'" + long53 + "' != '" + 1L + "'", long53 == 1L);
        org.junit.Assert.assertTrue("'" + double60 + "' != '" + 0.0d + "'", double60 == 0.0d);
        org.junit.Assert.assertTrue("'" + double61 + "' != '" + 0.0d + "'", double61 == 0.0d);
        org.junit.Assert.assertTrue("'" + double70 + "' != '" + 0.5d + "'", double70 == 0.5d);
        org.junit.Assert.assertNotNull(doubleArray77);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray77), "[-1.0, 0.0, 10.0]");
        org.junit.Assert.assertTrue("'" + double81 + "' != '" + 74.0d + "'", double81 == 74.0d);
        org.junit.Assert.assertNotNull(doubleArray82);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray82), "[]");
        org.junit.Assert.assertTrue(Double.isNaN(double86));
        org.junit.Assert.assertTrue("'" + double88 + "' != '" + 0.0d + "'", double88 == 0.0d);
        org.junit.Assert.assertTrue(Double.isNaN(double89));
        org.junit.Assert.assertTrue("'" + double90 + "' != '" + 6140.666666666667d + "'", double90 == 6140.666666666667d);
    }

    @Test
    public void test13577() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest27.test13577");
        org.apache.commons.math.stat.descriptive.moment.SecondMoment secondMoment1 = new org.apache.commons.math.stat.descriptive.moment.SecondMoment();
        secondMoment1.increment((double) ' ');
        org.apache.commons.math.stat.descriptive.moment.Variance variance4 = new org.apache.commons.math.stat.descriptive.moment.Variance(secondMoment1);
        double[] doubleArray10 = new double[] { 0L, (byte) 1, 6140.666666666667d, 544.5d, (byte) 100 };
        double double11 = secondMoment1.evaluate(doubleArray10);
        org.apache.commons.math.stat.descriptive.moment.SecondMoment secondMoment12 = new org.apache.commons.math.stat.descriptive.moment.SecondMoment();
        secondMoment12.increment((double) ' ');
        org.apache.commons.math.stat.descriptive.moment.Variance variance15 = new org.apache.commons.math.stat.descriptive.moment.Variance(secondMoment12);
        secondMoment12.increment((double) (short) -1);
        secondMoment12.clear();
        secondMoment12.increment((double) 0L);
        org.apache.commons.math.stat.descriptive.moment.Variance variance21 = new org.apache.commons.math.stat.descriptive.moment.Variance(secondMoment12);
        boolean boolean22 = secondMoment1.equals((java.lang.Object) secondMoment12);
        org.apache.commons.math.stat.descriptive.moment.Variance variance23 = new org.apache.commons.math.stat.descriptive.moment.Variance(false, secondMoment12);
        boolean boolean24 = variance23.isBiasCorrected();
        variance23.setBiasCorrected(false);
        variance23.increment(4608.0d);
        variance23.increment(7.90286396701389E7d);
        org.junit.Assert.assertNotNull(doubleArray10);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray10), "[0.0, 1.0, 6140.666666666667, 544.5, 100.0]");
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 2.880385675555556E7d + "'", double11 == 2.880385675555556E7d);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
    }

    @Test
    public void test13578() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest27.test13578");
        org.apache.commons.math.stat.descriptive.moment.SecondMoment secondMoment2 = new org.apache.commons.math.stat.descriptive.moment.SecondMoment();
        secondMoment2.increment(1.0d);
        double[] doubleArray8 = new double[] { (-1L), 0, 10L };
        secondMoment2.incrementAll(doubleArray8, 0, 0);
        double[] doubleArray14 = new double[] { 10, (byte) 100 };
        double double15 = secondMoment2.evaluate(doubleArray14);
        double double16 = secondMoment2.getResult();
        org.apache.commons.math.stat.descriptive.moment.Variance variance17 = new org.apache.commons.math.stat.descriptive.moment.Variance(false, secondMoment2);
        long long18 = secondMoment2.getN();
        org.apache.commons.math.stat.descriptive.moment.Variance variance19 = new org.apache.commons.math.stat.descriptive.moment.Variance(true, secondMoment2);
        boolean boolean20 = variance19.isBiasCorrected();
        variance19.setBiasCorrected(true);
        double double23 = variance19.getResult();
        org.apache.commons.math.stat.descriptive.moment.Variance variance24 = new org.apache.commons.math.stat.descriptive.moment.Variance();
        org.apache.commons.math.stat.descriptive.moment.SecondMoment secondMoment25 = new org.apache.commons.math.stat.descriptive.moment.SecondMoment();
        secondMoment25.increment((double) ' ');
        org.apache.commons.math.stat.descriptive.moment.Variance variance28 = new org.apache.commons.math.stat.descriptive.moment.Variance(secondMoment25);
        secondMoment25.increment((double) (short) -1);
        secondMoment25.clear();
        secondMoment25.increment((double) 0L);
        org.apache.commons.math.stat.descriptive.moment.Variance variance34 = new org.apache.commons.math.stat.descriptive.moment.Variance(secondMoment25);
        org.apache.commons.math.stat.descriptive.moment.SecondMoment secondMoment35 = new org.apache.commons.math.stat.descriptive.moment.SecondMoment();
        secondMoment35.increment(1.0d);
        double[] doubleArray41 = new double[] { (-1L), 0, 10L };
        secondMoment35.incrementAll(doubleArray41, 0, 0);
        variance34.incrementAll(doubleArray41);
        variance24.incrementAll(doubleArray41);
        double double47 = variance19.evaluate(doubleArray41);
        boolean boolean48 = variance19.isBiasCorrected();
        variance19.setBiasCorrected(true);
        org.junit.Assert.assertNotNull(doubleArray8);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray8), "[-1.0, 0.0, 10.0]");
        org.junit.Assert.assertNotNull(doubleArray14);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray14), "[10.0, 100.0]");
        org.junit.Assert.assertTrue("'" + double15 + "' != '" + 4050.0d + "'", double15 == 4050.0d);
        org.junit.Assert.assertTrue("'" + double16 + "' != '" + 4050.0d + "'", double16 == 4050.0d);
        org.junit.Assert.assertTrue("'" + long18 + "' != '" + 2L + "'", long18 == 2L);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + true + "'", boolean20 == true);
        org.junit.Assert.assertTrue("'" + double23 + "' != '" + 4050.0d + "'", double23 == 4050.0d);
        org.junit.Assert.assertNotNull(doubleArray41);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray41), "[-1.0, 0.0, 10.0]");
        org.junit.Assert.assertTrue("'" + double47 + "' != '" + 37.0d + "'", double47 == 37.0d);
        org.junit.Assert.assertTrue("'" + boolean48 + "' != '" + true + "'", boolean48 == true);
    }

    @Test
    public void test13579() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest27.test13579");
        org.apache.commons.math.stat.descriptive.moment.SecondMoment secondMoment1 = new org.apache.commons.math.stat.descriptive.moment.SecondMoment();
        secondMoment1.increment(1.0d);
        double[] doubleArray7 = new double[] { (-1L), 0, 10L };
        secondMoment1.incrementAll(doubleArray7, 0, 0);
        double[] doubleArray13 = new double[] { 10, (byte) 100 };
        double double14 = secondMoment1.evaluate(doubleArray13);
        org.apache.commons.math.stat.descriptive.moment.SecondMoment secondMoment16 = new org.apache.commons.math.stat.descriptive.moment.SecondMoment();
        secondMoment16.increment((double) ' ');
        org.apache.commons.math.stat.descriptive.moment.Variance variance19 = new org.apache.commons.math.stat.descriptive.moment.Variance(secondMoment16);
        secondMoment16.increment((double) (short) -1);
        secondMoment16.clear();
        secondMoment16.increment((double) 0L);
        org.apache.commons.math.stat.descriptive.moment.Variance variance25 = new org.apache.commons.math.stat.descriptive.moment.Variance(false, secondMoment16);
        boolean boolean26 = secondMoment1.equals((java.lang.Object) secondMoment16);
        org.apache.commons.math.stat.descriptive.moment.Variance variance27 = new org.apache.commons.math.stat.descriptive.moment.Variance(false, secondMoment16);
        boolean boolean28 = variance27.isBiasCorrected();
        variance27.increment(4.321154463792899E13d);
        boolean boolean31 = variance27.isBiasCorrected();
        org.apache.commons.math.stat.descriptive.moment.SecondMoment secondMoment32 = new org.apache.commons.math.stat.descriptive.moment.SecondMoment();
        secondMoment32.increment((double) ' ');
        org.apache.commons.math.stat.descriptive.moment.Variance variance35 = new org.apache.commons.math.stat.descriptive.moment.Variance(secondMoment32);
        secondMoment32.increment((double) '4');
        double double38 = secondMoment32.getResult();
        secondMoment32.increment((double) (short) 0);
        org.apache.commons.math.stat.descriptive.moment.Variance variance41 = new org.apache.commons.math.stat.descriptive.moment.Variance(secondMoment32);
        double double42 = secondMoment32.getResult();
        secondMoment32.increment(7262.8d);
        secondMoment32.increment(1376.0d);
        org.apache.commons.math.stat.descriptive.moment.SecondMoment secondMoment48 = new org.apache.commons.math.stat.descriptive.moment.SecondMoment();
        secondMoment48.increment(1.0d);
        double[] doubleArray54 = new double[] { (-1L), 0, 10L };
        secondMoment48.incrementAll(doubleArray54, 0, 0);
        long long58 = secondMoment48.getN();
        org.apache.commons.math.stat.descriptive.moment.Variance variance59 = new org.apache.commons.math.stat.descriptive.moment.Variance(secondMoment48);
        secondMoment48.increment(10.0d);
        secondMoment48.clear();
        org.apache.commons.math.stat.descriptive.moment.Variance variance63 = new org.apache.commons.math.stat.descriptive.moment.Variance(false, secondMoment48);
        double double64 = secondMoment48.getResult();
        double double65 = secondMoment48.getResult();
        org.apache.commons.math.stat.descriptive.moment.SecondMoment secondMoment66 = new org.apache.commons.math.stat.descriptive.moment.SecondMoment();
        secondMoment66.increment((double) ' ');
        org.apache.commons.math.stat.descriptive.moment.Variance variance69 = new org.apache.commons.math.stat.descriptive.moment.Variance(secondMoment66);
        secondMoment66.increment((double) (short) -1);
        secondMoment66.clear();
        secondMoment66.increment((double) 0L);
        org.apache.commons.math.stat.descriptive.moment.Variance variance75 = new org.apache.commons.math.stat.descriptive.moment.Variance(secondMoment66);
        org.apache.commons.math.stat.descriptive.moment.SecondMoment secondMoment76 = new org.apache.commons.math.stat.descriptive.moment.SecondMoment();
        secondMoment76.increment(1.0d);
        double[] doubleArray82 = new double[] { (-1L), 0, 10L };
        secondMoment76.incrementAll(doubleArray82, 0, 0);
        variance75.incrementAll(doubleArray82);
        double double87 = secondMoment48.evaluate(doubleArray82);
        double double90 = secondMoment32.evaluate(doubleArray82, (int) (byte) 1, 0);
        double double91 = variance27.evaluate(doubleArray82);
        variance27.clear();
        org.junit.Assert.assertNotNull(doubleArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray7), "[-1.0, 0.0, 10.0]");
        org.junit.Assert.assertNotNull(doubleArray13);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray13), "[10.0, 100.0]");
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + 4050.0d + "'", double14 == 4050.0d);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + false + "'", boolean28 == false);
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + false + "'", boolean31 == false);
        org.junit.Assert.assertTrue("'" + double38 + "' != '" + 200.0d + "'", double38 == 200.0d);
        org.junit.Assert.assertTrue("'" + double42 + "' != '" + 1376.0d + "'", double42 == 1376.0d);
        org.junit.Assert.assertNotNull(doubleArray54);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray54), "[-1.0, 0.0, 10.0]");
        org.junit.Assert.assertTrue("'" + long58 + "' != '" + 1L + "'", long58 == 1L);
        org.junit.Assert.assertTrue(Double.isNaN(double64));
        org.junit.Assert.assertTrue(Double.isNaN(double65));
        org.junit.Assert.assertNotNull(doubleArray82);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray82), "[-1.0, 0.0, 10.0]");
        org.junit.Assert.assertTrue("'" + double87 + "' != '" + 74.0d + "'", double87 == 74.0d);
        org.junit.Assert.assertTrue("'" + double90 + "' != '" + 3.9427919872E7d + "'", double90 == 3.9427919872E7d);
        org.junit.Assert.assertTrue("'" + double91 + "' != '" + 24.666666666666668d + "'", double91 == 24.666666666666668d);
    }

    @Test
    public void test13580() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest27.test13580");
        org.apache.commons.math.stat.descriptive.moment.SecondMoment secondMoment0 = new org.apache.commons.math.stat.descriptive.moment.SecondMoment();
        secondMoment0.increment(1.0d);
        secondMoment0.increment((double) (short) 0);
        long long5 = secondMoment0.getN();
        double double6 = secondMoment0.getResult();
        long long7 = secondMoment0.getN();
        long long8 = secondMoment0.getN();
        double double9 = secondMoment0.getResult();
        secondMoment0.clear();
        double double11 = secondMoment0.getResult();
        double double12 = secondMoment0.getResult();
        org.apache.commons.math.stat.descriptive.moment.SecondMoment secondMoment13 = new org.apache.commons.math.stat.descriptive.moment.SecondMoment();
        secondMoment13.increment((double) ' ');
        secondMoment13.increment((double) (-1.0f));
        secondMoment13.clear();
        org.apache.commons.math.stat.descriptive.moment.SecondMoment secondMoment19 = new org.apache.commons.math.stat.descriptive.moment.SecondMoment();
        secondMoment19.increment(1.0d);
        double[] doubleArray25 = new double[] { (-1L), 0, 10L };
        secondMoment19.incrementAll(doubleArray25, 0, 0);
        org.apache.commons.math.stat.descriptive.moment.Variance variance29 = new org.apache.commons.math.stat.descriptive.moment.Variance(secondMoment19);
        long long30 = variance29.getN();
        org.apache.commons.math.stat.descriptive.moment.SecondMoment secondMoment31 = new org.apache.commons.math.stat.descriptive.moment.SecondMoment();
        secondMoment31.increment(1.0d);
        double[] doubleArray37 = new double[] { (-1L), 0, 10L };
        secondMoment31.incrementAll(doubleArray37, 0, 0);
        double double42 = variance29.evaluate(doubleArray37, (double) (short) -1);
        double double43 = secondMoment13.evaluate(doubleArray37);
        org.apache.commons.math.stat.descriptive.moment.Variance variance44 = new org.apache.commons.math.stat.descriptive.moment.Variance(secondMoment13);
        long long45 = secondMoment13.getN();
        secondMoment13.increment(4049.9999999999995d);
        double double48 = secondMoment13.getResult();
        org.apache.commons.math.stat.descriptive.moment.SecondMoment secondMoment49 = new org.apache.commons.math.stat.descriptive.moment.SecondMoment();
        secondMoment49.increment((double) ' ');
        secondMoment49.increment((double) (-1.0f));
        secondMoment49.clear();
        double double55 = secondMoment49.getResult();
        org.apache.commons.math.stat.descriptive.moment.Variance variance56 = new org.apache.commons.math.stat.descriptive.moment.Variance(secondMoment49);
        org.apache.commons.math.stat.descriptive.moment.SecondMoment secondMoment57 = new org.apache.commons.math.stat.descriptive.moment.SecondMoment();
        secondMoment57.increment(1.0d);
        org.apache.commons.math.stat.descriptive.moment.SecondMoment secondMoment60 = new org.apache.commons.math.stat.descriptive.moment.SecondMoment();
        secondMoment60.increment(1.0d);
        double[] doubleArray66 = new double[] { (-1L), 0, 10L };
        secondMoment60.incrementAll(doubleArray66, 0, 0);
        double[] doubleArray72 = new double[] { 10, (byte) 100 };
        double double73 = secondMoment60.evaluate(doubleArray72);
        double double74 = secondMoment57.evaluate(doubleArray72);
        double double76 = variance56.evaluate(doubleArray72, (double) 5L);
        double double77 = secondMoment13.evaluate(doubleArray72);
        double double78 = secondMoment0.evaluate(doubleArray72);
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 2L + "'", long5 == 2L);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.5d + "'", double6 == 0.5d);
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + 2L + "'", long7 == 2L);
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 2L + "'", long8 == 2L);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 0.5d + "'", double9 == 0.5d);
        org.junit.Assert.assertTrue(Double.isNaN(double11));
        org.junit.Assert.assertTrue(Double.isNaN(double12));
        org.junit.Assert.assertNotNull(doubleArray25);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray25), "[-1.0, 0.0, 10.0]");
        org.junit.Assert.assertTrue("'" + long30 + "' != '" + 1L + "'", long30 == 1L);
        org.junit.Assert.assertNotNull(doubleArray37);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray37), "[-1.0, 0.0, 10.0]");
        org.junit.Assert.assertTrue("'" + double42 + "' != '" + 37.0d + "'", double42 == 37.0d);
        org.junit.Assert.assertTrue("'" + double43 + "' != '" + 74.0d + "'", double43 == 74.0d);
        org.junit.Assert.assertTrue("'" + long45 + "' != '" + 3L + "'", long45 == 3L);
        org.junit.Assert.assertTrue("'" + double48 + "' != '" + 1.2283730749999996E7d + "'", double48 == 1.2283730749999996E7d);
        org.junit.Assert.assertTrue(Double.isNaN(double55));
        org.junit.Assert.assertNotNull(doubleArray66);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray66), "[-1.0, 0.0, 10.0]");
        org.junit.Assert.assertNotNull(doubleArray72);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray72), "[10.0, 100.0]");
        org.junit.Assert.assertTrue("'" + double73 + "' != '" + 4050.0d + "'", double73 == 4050.0d);
        org.junit.Assert.assertTrue("'" + double74 + "' != '" + 4050.0d + "'", double74 == 4050.0d);
        org.junit.Assert.assertTrue("'" + double76 + "' != '" + 4050.0d + "'", double76 == 4050.0d);
        org.junit.Assert.assertTrue("'" + double77 + "' != '" + 4050.0d + "'", double77 == 4050.0d);
        org.junit.Assert.assertTrue("'" + double78 + "' != '" + 4050.0d + "'", double78 == 4050.0d);
    }

    @Test
    public void test13581() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest27.test13581");
        org.apache.commons.math.stat.descriptive.moment.SecondMoment secondMoment0 = new org.apache.commons.math.stat.descriptive.moment.SecondMoment();
        secondMoment0.increment((double) ' ');
        org.apache.commons.math.stat.descriptive.moment.Variance variance3 = new org.apache.commons.math.stat.descriptive.moment.Variance(secondMoment0);
        secondMoment0.clear();
        secondMoment0.increment((double) (byte) 100);
        org.apache.commons.math.stat.descriptive.moment.SecondMoment secondMoment7 = new org.apache.commons.math.stat.descriptive.moment.SecondMoment();
        secondMoment7.increment(1.0d);
        secondMoment7.increment((double) 10L);
        org.apache.commons.math.stat.descriptive.moment.SecondMoment secondMoment12 = new org.apache.commons.math.stat.descriptive.moment.SecondMoment();
        secondMoment12.increment(1.0d);
        secondMoment12.increment((double) (short) 0);
        double double17 = secondMoment12.getResult();
        org.apache.commons.math.stat.descriptive.moment.SecondMoment secondMoment18 = new org.apache.commons.math.stat.descriptive.moment.SecondMoment();
        secondMoment18.increment(1.0d);
        secondMoment18.increment((double) (short) 0);
        double double23 = secondMoment18.getResult();
        org.apache.commons.math.stat.descriptive.moment.SecondMoment secondMoment24 = new org.apache.commons.math.stat.descriptive.moment.SecondMoment();
        secondMoment24.increment(1.0d);
        double[] doubleArray30 = new double[] { (-1L), 0, 10L };
        secondMoment24.incrementAll(doubleArray30, 0, 0);
        double double34 = secondMoment18.evaluate(doubleArray30);
        double[] doubleArray35 = new double[] {};
        secondMoment18.incrementAll(doubleArray35);
        secondMoment12.incrementAll(doubleArray35);
        secondMoment12.increment((double) 2L);
        org.apache.commons.math.stat.descriptive.moment.Variance variance40 = new org.apache.commons.math.stat.descriptive.moment.Variance(secondMoment12);
        org.apache.commons.math.stat.descriptive.moment.SecondMoment secondMoment41 = new org.apache.commons.math.stat.descriptive.moment.SecondMoment();
        secondMoment41.increment(1.0d);
        double[] doubleArray47 = new double[] { (-1L), 0, 10L };
        secondMoment41.incrementAll(doubleArray47, 0, 0);
        double[] doubleArray53 = new double[] { 10, (byte) 100 };
        double double54 = secondMoment41.evaluate(doubleArray53);
        double double55 = variance40.evaluate(doubleArray53);
        double double56 = secondMoment7.evaluate(doubleArray53);
        org.apache.commons.math.stat.descriptive.moment.SecondMoment secondMoment57 = new org.apache.commons.math.stat.descriptive.moment.SecondMoment();
        secondMoment57.increment(1.0d);
        secondMoment57.increment((double) (short) 0);
        double double62 = secondMoment57.getResult();
        org.apache.commons.math.stat.descriptive.moment.SecondMoment secondMoment63 = new org.apache.commons.math.stat.descriptive.moment.SecondMoment();
        secondMoment63.increment(1.0d);
        secondMoment63.increment((double) (short) 0);
        double double68 = secondMoment63.getResult();
        org.apache.commons.math.stat.descriptive.moment.SecondMoment secondMoment69 = new org.apache.commons.math.stat.descriptive.moment.SecondMoment();
        secondMoment69.increment(1.0d);
        double[] doubleArray75 = new double[] { (-1L), 0, 10L };
        secondMoment69.incrementAll(doubleArray75, 0, 0);
        double double79 = secondMoment63.evaluate(doubleArray75);
        double[] doubleArray80 = new double[] {};
        secondMoment63.incrementAll(doubleArray80);
        secondMoment57.incrementAll(doubleArray80);
        double double83 = secondMoment7.evaluate(doubleArray80);
        double double84 = secondMoment0.evaluate(doubleArray80);
        secondMoment0.clear();
        secondMoment0.clear();
        secondMoment0.clear();
        double double88 = secondMoment0.getResult();
        long long89 = secondMoment0.getN();
        org.junit.Assert.assertTrue("'" + double17 + "' != '" + 0.5d + "'", double17 == 0.5d);
        org.junit.Assert.assertTrue("'" + double23 + "' != '" + 0.5d + "'", double23 == 0.5d);
        org.junit.Assert.assertNotNull(doubleArray30);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray30), "[-1.0, 0.0, 10.0]");
        org.junit.Assert.assertTrue("'" + double34 + "' != '" + 74.0d + "'", double34 == 74.0d);
        org.junit.Assert.assertNotNull(doubleArray35);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray35), "[]");
        org.junit.Assert.assertNotNull(doubleArray47);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray47), "[-1.0, 0.0, 10.0]");
        org.junit.Assert.assertNotNull(doubleArray53);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray53), "[10.0, 100.0]");
        org.junit.Assert.assertTrue("'" + double54 + "' != '" + 4050.0d + "'", double54 == 4050.0d);
        org.junit.Assert.assertTrue("'" + double55 + "' != '" + 4050.0d + "'", double55 == 4050.0d);
        org.junit.Assert.assertTrue("'" + double56 + "' != '" + 4050.0d + "'", double56 == 4050.0d);
        org.junit.Assert.assertTrue("'" + double62 + "' != '" + 0.5d + "'", double62 == 0.5d);
        org.junit.Assert.assertTrue("'" + double68 + "' != '" + 0.5d + "'", double68 == 0.5d);
        org.junit.Assert.assertNotNull(doubleArray75);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray75), "[-1.0, 0.0, 10.0]");
        org.junit.Assert.assertTrue("'" + double79 + "' != '" + 74.0d + "'", double79 == 74.0d);
        org.junit.Assert.assertNotNull(doubleArray80);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray80), "[]");
        org.junit.Assert.assertTrue("'" + double83 + "' != '" + 4050.0d + "'", double83 == 4050.0d);
        org.junit.Assert.assertTrue("'" + double84 + "' != '" + 0.0d + "'", double84 == 0.0d);
        org.junit.Assert.assertTrue(Double.isNaN(double88));
        org.junit.Assert.assertTrue("'" + long89 + "' != '" + 0L + "'", long89 == 0L);
    }

    @Test
    public void test13582() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest27.test13582");
        org.apache.commons.math.stat.descriptive.moment.SecondMoment secondMoment0 = new org.apache.commons.math.stat.descriptive.moment.SecondMoment();
        secondMoment0.increment((double) ' ');
        org.apache.commons.math.stat.descriptive.moment.Variance variance3 = new org.apache.commons.math.stat.descriptive.moment.Variance(secondMoment0);
        secondMoment0.increment((double) (short) -1);
        secondMoment0.clear();
        double double7 = secondMoment0.getResult();
        org.apache.commons.math.stat.descriptive.moment.Variance variance8 = new org.apache.commons.math.stat.descriptive.moment.Variance(secondMoment0);
        variance8.increment(4050.0d);
        double double11 = variance8.getResult();
        variance8.clear();
        variance8.increment(1.843691713502358E14d);
        variance8.clear();
        org.apache.commons.math.stat.descriptive.moment.SecondMoment secondMoment16 = new org.apache.commons.math.stat.descriptive.moment.SecondMoment();
        secondMoment16.increment((double) ' ');
        org.apache.commons.math.stat.descriptive.moment.Variance variance19 = new org.apache.commons.math.stat.descriptive.moment.Variance(secondMoment16);
        secondMoment16.increment((double) (short) -1);
        secondMoment16.clear();
        secondMoment16.increment((double) 0L);
        org.apache.commons.math.stat.descriptive.moment.Variance variance25 = new org.apache.commons.math.stat.descriptive.moment.Variance(secondMoment16);
        long long26 = variance25.getN();
        long long27 = variance25.getN();
        org.apache.commons.math.stat.descriptive.moment.SecondMoment secondMoment28 = new org.apache.commons.math.stat.descriptive.moment.SecondMoment();
        secondMoment28.increment((double) ' ');
        secondMoment28.increment((double) '4');
        long long33 = secondMoment28.getN();
        org.apache.commons.math.stat.descriptive.moment.Variance variance34 = new org.apache.commons.math.stat.descriptive.moment.Variance(secondMoment28);
        secondMoment28.clear();
        org.apache.commons.math.stat.descriptive.moment.Variance variance37 = new org.apache.commons.math.stat.descriptive.moment.Variance(true);
        variance37.clear();
        org.apache.commons.math.stat.descriptive.moment.SecondMoment secondMoment41 = new org.apache.commons.math.stat.descriptive.moment.SecondMoment();
        secondMoment41.increment(1.0d);
        double[] doubleArray47 = new double[] { (-1L), 0, 10L };
        secondMoment41.incrementAll(doubleArray47, 0, 0);
        double[] doubleArray53 = new double[] { 10, (byte) 100 };
        double double54 = secondMoment41.evaluate(doubleArray53);
        double double55 = secondMoment41.getResult();
        org.apache.commons.math.stat.descriptive.moment.Variance variance56 = new org.apache.commons.math.stat.descriptive.moment.Variance(false, secondMoment41);
        long long57 = secondMoment41.getN();
        org.apache.commons.math.stat.descriptive.moment.Variance variance58 = new org.apache.commons.math.stat.descriptive.moment.Variance(true, secondMoment41);
        double double59 = secondMoment41.getResult();
        secondMoment41.clear();
        secondMoment41.increment(Double.NaN);
        secondMoment41.increment((double) ' ');
        org.apache.commons.math.stat.descriptive.moment.Variance variance66 = new org.apache.commons.math.stat.descriptive.moment.Variance(true);
        long long67 = variance66.getN();
        org.apache.commons.math.stat.descriptive.moment.SecondMoment secondMoment68 = new org.apache.commons.math.stat.descriptive.moment.SecondMoment();
        secondMoment68.increment(1.0d);
        secondMoment68.increment((double) (short) 0);
        double double73 = secondMoment68.getResult();
        org.apache.commons.math.stat.descriptive.moment.SecondMoment secondMoment74 = new org.apache.commons.math.stat.descriptive.moment.SecondMoment();
        secondMoment74.increment(1.0d);
        double[] doubleArray80 = new double[] { (-1L), 0, 10L };
        secondMoment74.incrementAll(doubleArray80, 0, 0);
        double double84 = secondMoment68.evaluate(doubleArray80);
        variance66.incrementAll(doubleArray80);
        secondMoment41.incrementAll(doubleArray80);
        variance37.incrementAll(doubleArray80);
        double double90 = secondMoment28.evaluate(doubleArray80, 0, (int) (byte) 0);
        double double92 = variance25.evaluate(doubleArray80, 2201.3333333333335d);
        double double93 = variance8.evaluate(doubleArray80);
        org.junit.Assert.assertTrue(Double.isNaN(double7));
        org.junit.Assert.assertTrue(Double.isNaN(double11));
        org.junit.Assert.assertTrue("'" + long26 + "' != '" + 1L + "'", long26 == 1L);
        org.junit.Assert.assertTrue("'" + long27 + "' != '" + 1L + "'", long27 == 1L);
        org.junit.Assert.assertTrue("'" + long33 + "' != '" + 2L + "'", long33 == 2L);
        org.junit.Assert.assertNotNull(doubleArray47);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray47), "[-1.0, 0.0, 10.0]");
        org.junit.Assert.assertNotNull(doubleArray53);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray53), "[10.0, 100.0]");
        org.junit.Assert.assertTrue("'" + double54 + "' != '" + 4050.0d + "'", double54 == 4050.0d);
        org.junit.Assert.assertTrue("'" + double55 + "' != '" + 4050.0d + "'", double55 == 4050.0d);
        org.junit.Assert.assertTrue("'" + long57 + "' != '" + 2L + "'", long57 == 2L);
        org.junit.Assert.assertTrue("'" + double59 + "' != '" + 4050.0d + "'", double59 == 4050.0d);
        org.junit.Assert.assertTrue("'" + long67 + "' != '" + 0L + "'", long67 == 0L);
        org.junit.Assert.assertTrue("'" + double73 + "' != '" + 0.5d + "'", double73 == 0.5d);
        org.junit.Assert.assertNotNull(doubleArray80);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray80), "[-1.0, 0.0, 10.0]");
        org.junit.Assert.assertTrue("'" + double84 + "' != '" + 74.0d + "'", double84 == 74.0d);
        org.junit.Assert.assertTrue(Double.isNaN(double90));
        org.junit.Assert.assertTrue("'" + double92 + "' != '" + 37.0d + "'", double92 == 37.0d);
        org.junit.Assert.assertTrue("'" + double93 + "' != '" + 37.0d + "'", double93 == 37.0d);
    }

    @Test
    public void test13583() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest27.test13583");
        org.apache.commons.math.stat.descriptive.moment.SecondMoment secondMoment0 = new org.apache.commons.math.stat.descriptive.moment.SecondMoment();
        secondMoment0.increment(1.0d);
        org.apache.commons.math.stat.descriptive.moment.SecondMoment secondMoment3 = new org.apache.commons.math.stat.descriptive.moment.SecondMoment();
        secondMoment3.increment(1.0d);
        secondMoment3.increment((double) (short) 0);
        double double8 = secondMoment3.getResult();
        org.apache.commons.math.stat.descriptive.moment.SecondMoment secondMoment9 = new org.apache.commons.math.stat.descriptive.moment.SecondMoment();
        secondMoment9.increment(1.0d);
        double[] doubleArray15 = new double[] { (-1L), 0, 10L };
        secondMoment9.incrementAll(doubleArray15, 0, 0);
        double double19 = secondMoment3.evaluate(doubleArray15);
        double[] doubleArray20 = new double[] {};
        secondMoment3.incrementAll(doubleArray20);
        double double22 = secondMoment0.evaluate(doubleArray20);
        secondMoment0.increment((double) 3L);
        long long25 = secondMoment0.getN();
        double double26 = secondMoment0.getResult();
        org.apache.commons.math.stat.descriptive.moment.Variance variance27 = new org.apache.commons.math.stat.descriptive.moment.Variance(secondMoment0);
        secondMoment0.clear();
        secondMoment0.increment(1.6289621902263371E7d);
        long long31 = secondMoment0.getN();
        double double32 = secondMoment0.getResult();
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 0.5d + "'", double8 == 0.5d);
        org.junit.Assert.assertNotNull(doubleArray15);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray15), "[-1.0, 0.0, 10.0]");
        org.junit.Assert.assertTrue("'" + double19 + "' != '" + 74.0d + "'", double19 == 74.0d);
        org.junit.Assert.assertNotNull(doubleArray20);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray20), "[]");
        org.junit.Assert.assertTrue("'" + double22 + "' != '" + 0.0d + "'", double22 == 0.0d);
        org.junit.Assert.assertTrue("'" + long25 + "' != '" + 2L + "'", long25 == 2L);
        org.junit.Assert.assertTrue("'" + double26 + "' != '" + 2.0d + "'", double26 == 2.0d);
        org.junit.Assert.assertTrue("'" + long31 + "' != '" + 1L + "'", long31 == 1L);
        org.junit.Assert.assertTrue("'" + double32 + "' != '" + 0.0d + "'", double32 == 0.0d);
    }

    @Test
    public void test13584() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest27.test13584");
        org.apache.commons.math.stat.descriptive.moment.SecondMoment secondMoment0 = new org.apache.commons.math.stat.descriptive.moment.SecondMoment();
        secondMoment0.increment((double) ' ');
        org.apache.commons.math.stat.descriptive.moment.Variance variance3 = new org.apache.commons.math.stat.descriptive.moment.Variance(secondMoment0);
        secondMoment0.increment((double) (short) -1);
        secondMoment0.increment((double) 100);
        double double8 = secondMoment0.getResult();
        long long9 = secondMoment0.getN();
        double double10 = secondMoment0.getResult();
        secondMoment0.clear();
        java.lang.Class<?> wildcardClass12 = secondMoment0.getClass();
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 5304.666666666667d + "'", double8 == 5304.666666666667d);
        org.junit.Assert.assertTrue("'" + long9 + "' != '" + 3L + "'", long9 == 3L);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 5304.666666666667d + "'", double10 == 5304.666666666667d);
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test13585() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest27.test13585");
        org.apache.commons.math.stat.descriptive.moment.SecondMoment secondMoment1 = new org.apache.commons.math.stat.descriptive.moment.SecondMoment();
        secondMoment1.increment(1.0d);
        secondMoment1.increment((double) (short) 0);
        double double6 = secondMoment1.getResult();
        org.apache.commons.math.stat.descriptive.moment.SecondMoment secondMoment7 = new org.apache.commons.math.stat.descriptive.moment.SecondMoment();
        secondMoment7.increment(1.0d);
        secondMoment7.increment((double) (short) 0);
        double double12 = secondMoment7.getResult();
        org.apache.commons.math.stat.descriptive.moment.SecondMoment secondMoment13 = new org.apache.commons.math.stat.descriptive.moment.SecondMoment();
        secondMoment13.increment(1.0d);
        double[] doubleArray19 = new double[] { (-1L), 0, 10L };
        secondMoment13.incrementAll(doubleArray19, 0, 0);
        double double23 = secondMoment7.evaluate(doubleArray19);
        double[] doubleArray24 = new double[] {};
        secondMoment7.incrementAll(doubleArray24);
        secondMoment1.incrementAll(doubleArray24);
        secondMoment1.increment((double) 2L);
        org.apache.commons.math.stat.descriptive.moment.Variance variance29 = new org.apache.commons.math.stat.descriptive.moment.Variance(secondMoment1);
        secondMoment1.increment(0.5d);
        org.apache.commons.math.stat.descriptive.moment.SecondMoment secondMoment32 = new org.apache.commons.math.stat.descriptive.moment.SecondMoment();
        secondMoment32.increment(1.0d);
        double[] doubleArray38 = new double[] { (-1L), 0, 10L };
        secondMoment32.incrementAll(doubleArray38, 0, 0);
        org.apache.commons.math.stat.descriptive.moment.Variance variance42 = new org.apache.commons.math.stat.descriptive.moment.Variance(secondMoment32);
        long long43 = variance42.getN();
        org.apache.commons.math.stat.descriptive.moment.SecondMoment secondMoment44 = new org.apache.commons.math.stat.descriptive.moment.SecondMoment();
        secondMoment44.increment(1.0d);
        double[] doubleArray50 = new double[] { (-1L), 0, 10L };
        secondMoment44.incrementAll(doubleArray50, 0, 0);
        double double55 = variance42.evaluate(doubleArray50, (double) (short) -1);
        double double58 = secondMoment1.evaluate(doubleArray50, (int) (byte) 1, (int) (byte) 1);
        org.apache.commons.math.stat.descriptive.moment.Variance variance59 = new org.apache.commons.math.stat.descriptive.moment.Variance(true, secondMoment1);
        variance59.setBiasCorrected(true);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.5d + "'", double6 == 0.5d);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 0.5d + "'", double12 == 0.5d);
        org.junit.Assert.assertNotNull(doubleArray19);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray19), "[-1.0, 0.0, 10.0]");
        org.junit.Assert.assertTrue("'" + double23 + "' != '" + 74.0d + "'", double23 == 74.0d);
        org.junit.Assert.assertNotNull(doubleArray24);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray24), "[]");
        org.junit.Assert.assertNotNull(doubleArray38);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray38), "[-1.0, 0.0, 10.0]");
        org.junit.Assert.assertTrue("'" + long43 + "' != '" + 1L + "'", long43 == 1L);
        org.junit.Assert.assertNotNull(doubleArray50);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray50), "[-1.0, 0.0, 10.0]");
        org.junit.Assert.assertTrue("'" + double55 + "' != '" + 37.0d + "'", double55 == 37.0d);
        org.junit.Assert.assertTrue("'" + double58 + "' != '" + 0.0d + "'", double58 == 0.0d);
    }

    @Test
    public void test13586() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest27.test13586");
        org.apache.commons.math.stat.descriptive.moment.SecondMoment secondMoment1 = new org.apache.commons.math.stat.descriptive.moment.SecondMoment();
        secondMoment1.increment(1.0d);
        double[] doubleArray7 = new double[] { (-1L), 0, 10L };
        secondMoment1.incrementAll(doubleArray7, 0, 0);
        double[] doubleArray13 = new double[] { 10, (byte) 100 };
        double double14 = secondMoment1.evaluate(doubleArray13);
        double double15 = secondMoment1.getResult();
        org.apache.commons.math.stat.descriptive.moment.Variance variance16 = new org.apache.commons.math.stat.descriptive.moment.Variance(false, secondMoment1);
        long long17 = secondMoment1.getN();
        org.apache.commons.math.stat.descriptive.moment.SecondMoment secondMoment18 = new org.apache.commons.math.stat.descriptive.moment.SecondMoment();
        secondMoment18.increment((double) ' ');
        secondMoment18.increment((double) (-1.0f));
        secondMoment18.clear();
        org.apache.commons.math.stat.descriptive.moment.SecondMoment secondMoment24 = new org.apache.commons.math.stat.descriptive.moment.SecondMoment();
        secondMoment24.increment(1.0d);
        double[] doubleArray30 = new double[] { (-1L), 0, 10L };
        secondMoment24.incrementAll(doubleArray30, 0, 0);
        org.apache.commons.math.stat.descriptive.moment.Variance variance34 = new org.apache.commons.math.stat.descriptive.moment.Variance(secondMoment24);
        long long35 = variance34.getN();
        org.apache.commons.math.stat.descriptive.moment.SecondMoment secondMoment36 = new org.apache.commons.math.stat.descriptive.moment.SecondMoment();
        secondMoment36.increment(1.0d);
        double[] doubleArray42 = new double[] { (-1L), 0, 10L };
        secondMoment36.incrementAll(doubleArray42, 0, 0);
        double double47 = variance34.evaluate(doubleArray42, (double) (short) -1);
        double double48 = secondMoment18.evaluate(doubleArray42);
        double double49 = secondMoment1.evaluate(doubleArray42);
        org.apache.commons.math.stat.descriptive.moment.Variance variance50 = new org.apache.commons.math.stat.descriptive.moment.Variance(secondMoment1);
        org.apache.commons.math.stat.descriptive.moment.Variance variance51 = new org.apache.commons.math.stat.descriptive.moment.Variance(secondMoment1);
        secondMoment1.increment(0.0d);
        double double54 = secondMoment1.getResult();
        org.junit.Assert.assertNotNull(doubleArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray7), "[-1.0, 0.0, 10.0]");
        org.junit.Assert.assertNotNull(doubleArray13);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray13), "[10.0, 100.0]");
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + 4050.0d + "'", double14 == 4050.0d);
        org.junit.Assert.assertTrue("'" + double15 + "' != '" + 4050.0d + "'", double15 == 4050.0d);
        org.junit.Assert.assertTrue("'" + long17 + "' != '" + 2L + "'", long17 == 2L);
        org.junit.Assert.assertNotNull(doubleArray30);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray30), "[-1.0, 0.0, 10.0]");
        org.junit.Assert.assertTrue("'" + long35 + "' != '" + 1L + "'", long35 == 1L);
        org.junit.Assert.assertNotNull(doubleArray42);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray42), "[-1.0, 0.0, 10.0]");
        org.junit.Assert.assertTrue("'" + double47 + "' != '" + 37.0d + "'", double47 == 37.0d);
        org.junit.Assert.assertTrue("'" + double48 + "' != '" + 74.0d + "'", double48 == 74.0d);
        org.junit.Assert.assertTrue("'" + double49 + "' != '" + 74.0d + "'", double49 == 74.0d);
        org.junit.Assert.assertTrue("'" + double54 + "' != '" + 80.75d + "'", double54 == 80.75d);
    }

    @Test
    public void test13587() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest27.test13587");
        org.apache.commons.math.stat.descriptive.moment.SecondMoment secondMoment0 = new org.apache.commons.math.stat.descriptive.moment.SecondMoment();
        secondMoment0.increment(1.0d);
        secondMoment0.increment((double) (short) 0);
        long long5 = secondMoment0.getN();
        double double6 = secondMoment0.getResult();
        secondMoment0.increment((double) (byte) 10);
        secondMoment0.clear();
        long long10 = secondMoment0.getN();
        secondMoment0.increment(1.8756123185185187E7d);
        org.apache.commons.math.stat.descriptive.moment.Variance variance13 = new org.apache.commons.math.stat.descriptive.moment.Variance(secondMoment0);
        long long14 = secondMoment0.getN();
        long long15 = secondMoment0.getN();
        secondMoment0.increment(1.8489751620203723E13d);
        secondMoment0.increment(4.168437763020833E7d);
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 2L + "'", long5 == 2L);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.5d + "'", double6 == 0.5d);
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + 0L + "'", long10 == 0L);
        org.junit.Assert.assertTrue("'" + long14 + "' != '" + 1L + "'", long14 == 1L);
        org.junit.Assert.assertTrue("'" + long15 + "' != '" + 1L + "'", long15 == 1L);
    }

    @Test
    public void test13588() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest27.test13588");
        org.apache.commons.math.stat.descriptive.moment.SecondMoment secondMoment1 = new org.apache.commons.math.stat.descriptive.moment.SecondMoment();
        secondMoment1.increment(1.0d);
        secondMoment1.increment((double) (short) 0);
        long long6 = secondMoment1.getN();
        secondMoment1.clear();
        org.apache.commons.math.stat.descriptive.moment.SecondMoment secondMoment8 = new org.apache.commons.math.stat.descriptive.moment.SecondMoment();
        secondMoment8.increment((double) ' ');
        org.apache.commons.math.stat.descriptive.moment.Variance variance11 = new org.apache.commons.math.stat.descriptive.moment.Variance(secondMoment8);
        secondMoment8.increment((double) (short) -1);
        secondMoment8.clear();
        secondMoment8.increment((double) 0L);
        boolean boolean17 = secondMoment1.equals((java.lang.Object) 0L);
        org.apache.commons.math.stat.descriptive.moment.Variance variance18 = new org.apache.commons.math.stat.descriptive.moment.Variance(true, secondMoment1);
        org.apache.commons.math.stat.descriptive.moment.SecondMoment secondMoment19 = new org.apache.commons.math.stat.descriptive.moment.SecondMoment();
        secondMoment19.increment((double) ' ');
        org.apache.commons.math.stat.descriptive.moment.Variance variance22 = new org.apache.commons.math.stat.descriptive.moment.Variance(secondMoment19);
        secondMoment19.increment((double) (short) -1);
        secondMoment19.clear();
        secondMoment19.increment((double) 0L);
        org.apache.commons.math.stat.descriptive.moment.Variance variance28 = new org.apache.commons.math.stat.descriptive.moment.Variance(secondMoment19);
        org.apache.commons.math.stat.descriptive.moment.SecondMoment secondMoment29 = new org.apache.commons.math.stat.descriptive.moment.SecondMoment();
        secondMoment29.increment(1.0d);
        secondMoment29.increment((double) (short) 0);
        double double34 = secondMoment29.getResult();
        org.apache.commons.math.stat.descriptive.moment.SecondMoment secondMoment35 = new org.apache.commons.math.stat.descriptive.moment.SecondMoment();
        secondMoment35.increment(1.0d);
        double[] doubleArray41 = new double[] { (-1L), 0, 10L };
        secondMoment35.incrementAll(doubleArray41, 0, 0);
        double double45 = secondMoment29.evaluate(doubleArray41);
        double double46 = secondMoment19.evaluate(doubleArray41);
        org.apache.commons.math.stat.descriptive.moment.SecondMoment secondMoment47 = new org.apache.commons.math.stat.descriptive.moment.SecondMoment();
        secondMoment47.increment(1.0d);
        double[] doubleArray53 = new double[] { (-1L), 0, 10L };
        secondMoment47.incrementAll(doubleArray53, 0, 0);
        double[] doubleArray59 = new double[] { 10, (byte) 100 };
        double double60 = secondMoment47.evaluate(doubleArray59);
        double double61 = secondMoment47.getResult();
        secondMoment47.increment((double) (short) -1);
        double[] doubleArray65 = new double[] { (short) 1 };
        secondMoment47.incrementAll(doubleArray65);
        double double67 = secondMoment19.evaluate(doubleArray65);
        double double68 = variance18.evaluate(doubleArray65);
        long long69 = variance18.getN();
        variance18.setBiasCorrected(false);
        variance18.clear();
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 2L + "'", long6 == 2L);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertTrue("'" + double34 + "' != '" + 0.5d + "'", double34 == 0.5d);
        org.junit.Assert.assertNotNull(doubleArray41);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray41), "[-1.0, 0.0, 10.0]");
        org.junit.Assert.assertTrue("'" + double45 + "' != '" + 74.0d + "'", double45 == 74.0d);
        org.junit.Assert.assertTrue("'" + double46 + "' != '" + 74.0d + "'", double46 == 74.0d);
        org.junit.Assert.assertNotNull(doubleArray53);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray53), "[-1.0, 0.0, 10.0]");
        org.junit.Assert.assertNotNull(doubleArray59);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray59), "[10.0, 100.0]");
        org.junit.Assert.assertTrue("'" + double60 + "' != '" + 4050.0d + "'", double60 == 4050.0d);
        org.junit.Assert.assertTrue("'" + double61 + "' != '" + 4050.0d + "'", double61 == 4050.0d);
        org.junit.Assert.assertNotNull(doubleArray65);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray65), "[1.0]");
        org.junit.Assert.assertTrue("'" + double67 + "' != '" + 0.0d + "'", double67 == 0.0d);
        org.junit.Assert.assertTrue("'" + double68 + "' != '" + 0.0d + "'", double68 == 0.0d);
        org.junit.Assert.assertTrue("'" + long69 + "' != '" + 0L + "'", long69 == 0L);
    }

    @Test
    public void test13589() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest27.test13589");
        org.apache.commons.math.stat.descriptive.moment.SecondMoment secondMoment1 = new org.apache.commons.math.stat.descriptive.moment.SecondMoment();
        secondMoment1.increment(1.0d);
        double[] doubleArray7 = new double[] { (-1L), 0, 10L };
        secondMoment1.incrementAll(doubleArray7, 0, 0);
        double[] doubleArray13 = new double[] { 10, (byte) 100 };
        double double14 = secondMoment1.evaluate(doubleArray13);
        long long15 = secondMoment1.getN();
        double double16 = secondMoment1.getResult();
        double double17 = secondMoment1.getResult();
        org.apache.commons.math.stat.descriptive.moment.Variance variance18 = new org.apache.commons.math.stat.descriptive.moment.Variance(true, secondMoment1);
        boolean boolean19 = variance18.isBiasCorrected();
        org.junit.Assert.assertNotNull(doubleArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray7), "[-1.0, 0.0, 10.0]");
        org.junit.Assert.assertNotNull(doubleArray13);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray13), "[10.0, 100.0]");
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + 4050.0d + "'", double14 == 4050.0d);
        org.junit.Assert.assertTrue("'" + long15 + "' != '" + 2L + "'", long15 == 2L);
        org.junit.Assert.assertTrue("'" + double16 + "' != '" + 4050.0d + "'", double16 == 4050.0d);
        org.junit.Assert.assertTrue("'" + double17 + "' != '" + 4050.0d + "'", double17 == 4050.0d);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + true + "'", boolean19 == true);
    }

    @Test
    public void test13590() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest27.test13590");
        org.apache.commons.math.stat.descriptive.moment.SecondMoment secondMoment1 = new org.apache.commons.math.stat.descriptive.moment.SecondMoment();
        secondMoment1.increment(1.0d);
        secondMoment1.increment((double) (short) 0);
        double double6 = secondMoment1.getResult();
        secondMoment1.clear();
        org.apache.commons.math.stat.descriptive.moment.Variance variance8 = new org.apache.commons.math.stat.descriptive.moment.Variance(false, secondMoment1);
        variance8.increment((double) (short) 0);
        variance8.increment((double) 'a');
        variance8.increment(7.864508752001081E13d);
        org.apache.commons.math.stat.descriptive.moment.SecondMoment secondMoment15 = new org.apache.commons.math.stat.descriptive.moment.SecondMoment();
        secondMoment15.increment(1.0d);
        double[] doubleArray21 = new double[] { (-1L), 0, 10L };
        secondMoment15.incrementAll(doubleArray21, 0, 0);
        org.apache.commons.math.stat.descriptive.moment.Variance variance25 = new org.apache.commons.math.stat.descriptive.moment.Variance(secondMoment15);
        org.apache.commons.math.stat.descriptive.moment.SecondMoment secondMoment26 = new org.apache.commons.math.stat.descriptive.moment.SecondMoment();
        secondMoment26.increment((double) ' ');
        secondMoment26.increment((double) (-1.0f));
        secondMoment26.clear();
        boolean boolean32 = variance25.equals((java.lang.Object) secondMoment26);
        double double33 = variance25.getResult();
        variance25.increment(3602.0d);
        org.apache.commons.math.stat.descriptive.moment.SecondMoment secondMoment37 = new org.apache.commons.math.stat.descriptive.moment.SecondMoment();
        secondMoment37.increment(1.0d);
        double[] doubleArray43 = new double[] { (-1L), 0, 10L };
        secondMoment37.incrementAll(doubleArray43, 0, 0);
        double[] doubleArray49 = new double[] { 10, (byte) 100 };
        double double50 = secondMoment37.evaluate(doubleArray49);
        long long51 = secondMoment37.getN();
        double double52 = secondMoment37.getResult();
        org.apache.commons.math.stat.descriptive.moment.Variance variance53 = new org.apache.commons.math.stat.descriptive.moment.Variance(true, secondMoment37);
        long long54 = secondMoment37.getN();
        secondMoment37.increment((double) (short) 1);
        double double57 = secondMoment37.getResult();
        org.apache.commons.math.stat.descriptive.moment.SecondMoment secondMoment59 = new org.apache.commons.math.stat.descriptive.moment.SecondMoment();
        secondMoment59.increment(1.0d);
        secondMoment59.increment((double) (short) 0);
        double double64 = secondMoment59.getResult();
        secondMoment59.clear();
        org.apache.commons.math.stat.descriptive.moment.Variance variance66 = new org.apache.commons.math.stat.descriptive.moment.Variance(false, secondMoment59);
        variance66.increment((double) (short) 0);
        variance66.clear();
        variance66.increment((double) 1L);
        org.apache.commons.math.stat.descriptive.moment.SecondMoment secondMoment72 = new org.apache.commons.math.stat.descriptive.moment.SecondMoment();
        secondMoment72.increment(1.0d);
        double[] doubleArray78 = new double[] { (-1L), 0, 10L };
        secondMoment72.incrementAll(doubleArray78, 0, 0);
        double double82 = variance66.evaluate(doubleArray78);
        double double85 = secondMoment37.evaluate(doubleArray78, 1, (int) (short) 0);
        variance25.incrementAll(doubleArray78, (int) (short) 0, (int) (byte) 0);
        variance8.incrementAll(doubleArray78);
        variance8.increment(2.543092903125E7d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.5d + "'", double6 == 0.5d);
        org.junit.Assert.assertNotNull(doubleArray21);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray21), "[-1.0, 0.0, 10.0]");
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + false + "'", boolean32 == false);
        org.junit.Assert.assertTrue("'" + double33 + "' != '" + 0.0d + "'", double33 == 0.0d);
        org.junit.Assert.assertNotNull(doubleArray43);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray43), "[-1.0, 0.0, 10.0]");
        org.junit.Assert.assertNotNull(doubleArray49);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray49), "[10.0, 100.0]");
        org.junit.Assert.assertTrue("'" + double50 + "' != '" + 4050.0d + "'", double50 == 4050.0d);
        org.junit.Assert.assertTrue("'" + long51 + "' != '" + 2L + "'", long51 == 2L);
        org.junit.Assert.assertTrue("'" + double52 + "' != '" + 4050.0d + "'", double52 == 4050.0d);
        org.junit.Assert.assertTrue("'" + long54 + "' != '" + 2L + "'", long54 == 2L);
        org.junit.Assert.assertTrue("'" + double57 + "' != '" + 5994.0d + "'", double57 == 5994.0d);
        org.junit.Assert.assertTrue("'" + double64 + "' != '" + 0.5d + "'", double64 == 0.5d);
        org.junit.Assert.assertNotNull(doubleArray78);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray78), "[-1.0, 0.0, 10.0]");
        org.junit.Assert.assertTrue("'" + double82 + "' != '" + 24.666666666666668d + "'", double82 == 24.666666666666668d);
        org.junit.Assert.assertTrue("'" + double85 + "' != '" + 5994.0d + "'", double85 == 5994.0d);
    }

    @Test
    public void test13591() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest27.test13591");
        org.apache.commons.math.stat.descriptive.moment.SecondMoment secondMoment1 = new org.apache.commons.math.stat.descriptive.moment.SecondMoment();
        secondMoment1.increment(1.0d);
        double[] doubleArray7 = new double[] { (-1L), 0, 10L };
        secondMoment1.incrementAll(doubleArray7, 0, 0);
        double[] doubleArray13 = new double[] { 10, (byte) 100 };
        double double14 = secondMoment1.evaluate(doubleArray13);
        double double15 = secondMoment1.getResult();
        secondMoment1.increment((double) (short) -1);
        org.apache.commons.math.stat.descriptive.moment.SecondMoment secondMoment20 = new org.apache.commons.math.stat.descriptive.moment.SecondMoment();
        secondMoment20.increment(1.0d);
        double[] doubleArray26 = new double[] { (-1L), 0, 10L };
        secondMoment20.incrementAll(doubleArray26, 0, 0);
        double[] doubleArray32 = new double[] { 10, (byte) 100 };
        double double33 = secondMoment20.evaluate(doubleArray32);
        double double34 = secondMoment20.getResult();
        org.apache.commons.math.stat.descriptive.moment.Variance variance35 = new org.apache.commons.math.stat.descriptive.moment.Variance(false, secondMoment20);
        long long36 = secondMoment20.getN();
        org.apache.commons.math.stat.descriptive.moment.Variance variance37 = new org.apache.commons.math.stat.descriptive.moment.Variance(true, secondMoment20);
        org.apache.commons.math.stat.descriptive.moment.SecondMoment secondMoment38 = new org.apache.commons.math.stat.descriptive.moment.SecondMoment();
        secondMoment38.increment((double) ' ');
        org.apache.commons.math.stat.descriptive.moment.Variance variance41 = new org.apache.commons.math.stat.descriptive.moment.Variance(secondMoment38);
        secondMoment38.increment((double) (short) -1);
        secondMoment38.clear();
        secondMoment38.increment((double) 0L);
        org.apache.commons.math.stat.descriptive.moment.Variance variance47 = new org.apache.commons.math.stat.descriptive.moment.Variance(secondMoment38);
        org.apache.commons.math.stat.descriptive.moment.SecondMoment secondMoment48 = new org.apache.commons.math.stat.descriptive.moment.SecondMoment();
        secondMoment48.increment(1.0d);
        double[] doubleArray54 = new double[] { (-1L), 0, 10L };
        secondMoment48.incrementAll(doubleArray54, 0, 0);
        variance47.incrementAll(doubleArray54);
        org.apache.commons.math.stat.descriptive.moment.SecondMoment secondMoment59 = new org.apache.commons.math.stat.descriptive.moment.SecondMoment();
        secondMoment59.increment((double) ' ');
        org.apache.commons.math.stat.descriptive.moment.Variance variance62 = new org.apache.commons.math.stat.descriptive.moment.Variance(secondMoment59);
        secondMoment59.increment((double) (short) -1);
        secondMoment59.clear();
        secondMoment59.increment((double) 0L);
        org.apache.commons.math.stat.descriptive.moment.Variance variance68 = new org.apache.commons.math.stat.descriptive.moment.Variance(secondMoment59);
        org.apache.commons.math.stat.descriptive.moment.SecondMoment secondMoment69 = new org.apache.commons.math.stat.descriptive.moment.SecondMoment();
        secondMoment69.increment(1.0d);
        secondMoment69.increment((double) (short) 0);
        double double74 = secondMoment69.getResult();
        org.apache.commons.math.stat.descriptive.moment.SecondMoment secondMoment75 = new org.apache.commons.math.stat.descriptive.moment.SecondMoment();
        secondMoment75.increment(1.0d);
        double[] doubleArray81 = new double[] { (-1L), 0, 10L };
        secondMoment75.incrementAll(doubleArray81, 0, 0);
        double double85 = secondMoment69.evaluate(doubleArray81);
        double double86 = secondMoment59.evaluate(doubleArray81);
        double double87 = variance47.evaluate(doubleArray81);
        variance37.incrementAll(doubleArray81);
        secondMoment1.incrementAll(doubleArray81);
        org.apache.commons.math.stat.descriptive.moment.Variance variance90 = new org.apache.commons.math.stat.descriptive.moment.Variance(secondMoment1);
        secondMoment1.clear();
        org.apache.commons.math.stat.descriptive.moment.Variance variance92 = new org.apache.commons.math.stat.descriptive.moment.Variance(true, secondMoment1);
        secondMoment1.increment((double) 0L);
        secondMoment1.clear();
        secondMoment1.clear();
        org.junit.Assert.assertNotNull(doubleArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray7), "[-1.0, 0.0, 10.0]");
        org.junit.Assert.assertNotNull(doubleArray13);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray13), "[10.0, 100.0]");
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + 4050.0d + "'", double14 == 4050.0d);
        org.junit.Assert.assertTrue("'" + double15 + "' != '" + 4050.0d + "'", double15 == 4050.0d);
        org.junit.Assert.assertNotNull(doubleArray26);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray26), "[-1.0, 0.0, 10.0]");
        org.junit.Assert.assertNotNull(doubleArray32);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray32), "[10.0, 100.0]");
        org.junit.Assert.assertTrue("'" + double33 + "' != '" + 4050.0d + "'", double33 == 4050.0d);
        org.junit.Assert.assertTrue("'" + double34 + "' != '" + 4050.0d + "'", double34 == 4050.0d);
        org.junit.Assert.assertTrue("'" + long36 + "' != '" + 2L + "'", long36 == 2L);
        org.junit.Assert.assertNotNull(doubleArray54);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray54), "[-1.0, 0.0, 10.0]");
        org.junit.Assert.assertTrue("'" + double74 + "' != '" + 0.5d + "'", double74 == 0.5d);
        org.junit.Assert.assertNotNull(doubleArray81);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray81), "[-1.0, 0.0, 10.0]");
        org.junit.Assert.assertTrue("'" + double85 + "' != '" + 74.0d + "'", double85 == 74.0d);
        org.junit.Assert.assertTrue("'" + double86 + "' != '" + 74.0d + "'", double86 == 74.0d);
        org.junit.Assert.assertTrue("'" + double87 + "' != '" + 37.0d + "'", double87 == 37.0d);
    }

    @Test
    public void test13592() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest27.test13592");
        org.apache.commons.math.stat.descriptive.moment.SecondMoment secondMoment1 = new org.apache.commons.math.stat.descriptive.moment.SecondMoment();
        secondMoment1.increment(1.0d);
        secondMoment1.increment((double) (short) 0);
        double double6 = secondMoment1.getResult();
        secondMoment1.clear();
        secondMoment1.increment((double) (short) -1);
        secondMoment1.clear();
        secondMoment1.increment((double) 3L);
        org.apache.commons.math.stat.descriptive.moment.Variance variance13 = new org.apache.commons.math.stat.descriptive.moment.Variance(false, secondMoment1);
        double double14 = secondMoment1.getResult();
        org.apache.commons.math.stat.descriptive.moment.SecondMoment secondMoment16 = new org.apache.commons.math.stat.descriptive.moment.SecondMoment();
        secondMoment16.increment(1.0d);
        secondMoment16.increment((double) (short) 0);
        double double21 = secondMoment16.getResult();
        secondMoment16.clear();
        org.apache.commons.math.stat.descriptive.moment.Variance variance23 = new org.apache.commons.math.stat.descriptive.moment.Variance(false, secondMoment16);
        variance23.increment((double) (short) 0);
        variance23.clear();
        org.apache.commons.math.stat.descriptive.moment.SecondMoment secondMoment28 = new org.apache.commons.math.stat.descriptive.moment.SecondMoment();
        secondMoment28.increment(1.0d);
        double[] doubleArray34 = new double[] { (-1L), 0, 10L };
        secondMoment28.incrementAll(doubleArray34, 0, 0);
        double[] doubleArray40 = new double[] { 10, (byte) 100 };
        double double41 = secondMoment28.evaluate(doubleArray40);
        double double42 = secondMoment28.getResult();
        secondMoment28.increment((double) (short) -1);
        double[] doubleArray46 = new double[] { (short) 1 };
        secondMoment28.incrementAll(doubleArray46);
        long long48 = secondMoment28.getN();
        org.apache.commons.math.stat.descriptive.moment.Variance variance49 = new org.apache.commons.math.stat.descriptive.moment.Variance(false, secondMoment28);
        org.apache.commons.math.stat.descriptive.moment.SecondMoment secondMoment50 = new org.apache.commons.math.stat.descriptive.moment.SecondMoment();
        secondMoment50.increment(1.0d);
        secondMoment50.increment((double) (short) 0);
        long long55 = secondMoment50.getN();
        double double56 = secondMoment50.getResult();
        secondMoment50.increment((double) (byte) 10);
        secondMoment50.clear();
        org.apache.commons.math.stat.descriptive.moment.SecondMoment secondMoment60 = new org.apache.commons.math.stat.descriptive.moment.SecondMoment();
        secondMoment60.increment(1.0d);
        double[] doubleArray66 = new double[] { (-1L), 0, 10L };
        secondMoment60.incrementAll(doubleArray66, 0, 0);
        org.apache.commons.math.stat.descriptive.moment.Variance variance70 = new org.apache.commons.math.stat.descriptive.moment.Variance(secondMoment60);
        long long71 = variance70.getN();
        org.apache.commons.math.stat.descriptive.moment.SecondMoment secondMoment72 = new org.apache.commons.math.stat.descriptive.moment.SecondMoment();
        secondMoment72.increment(1.0d);
        double[] doubleArray78 = new double[] { (-1L), 0, 10L };
        secondMoment72.incrementAll(doubleArray78, 0, 0);
        double double83 = variance70.evaluate(doubleArray78, (double) (short) -1);
        double double84 = secondMoment50.evaluate(doubleArray78);
        double double85 = secondMoment28.evaluate(doubleArray78);
        variance23.incrementAll(doubleArray78);
        secondMoment1.incrementAll(doubleArray78);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.5d + "'", double6 == 0.5d);
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + 0.0d + "'", double14 == 0.0d);
        org.junit.Assert.assertTrue("'" + double21 + "' != '" + 0.5d + "'", double21 == 0.5d);
        org.junit.Assert.assertNotNull(doubleArray34);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray34), "[-1.0, 0.0, 10.0]");
        org.junit.Assert.assertNotNull(doubleArray40);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray40), "[10.0, 100.0]");
        org.junit.Assert.assertTrue("'" + double41 + "' != '" + 4050.0d + "'", double41 == 4050.0d);
        org.junit.Assert.assertTrue("'" + double42 + "' != '" + 4050.0d + "'", double42 == 4050.0d);
        org.junit.Assert.assertNotNull(doubleArray46);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray46), "[1.0]");
        org.junit.Assert.assertTrue("'" + long48 + "' != '" + 4L + "'", long48 == 4L);
        org.junit.Assert.assertTrue("'" + long55 + "' != '" + 2L + "'", long55 == 2L);
        org.junit.Assert.assertTrue("'" + double56 + "' != '" + 0.5d + "'", double56 == 0.5d);
        org.junit.Assert.assertNotNull(doubleArray66);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray66), "[-1.0, 0.0, 10.0]");
        org.junit.Assert.assertTrue("'" + long71 + "' != '" + 1L + "'", long71 == 1L);
        org.junit.Assert.assertNotNull(doubleArray78);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray78), "[-1.0, 0.0, 10.0]");
        org.junit.Assert.assertTrue("'" + double83 + "' != '" + 37.0d + "'", double83 == 37.0d);
        org.junit.Assert.assertTrue("'" + double84 + "' != '" + 74.0d + "'", double84 == 74.0d);
        org.junit.Assert.assertTrue("'" + double85 + "' != '" + 74.0d + "'", double85 == 74.0d);
    }

    @Test
    public void test13593() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest27.test13593");
        org.apache.commons.math.stat.descriptive.moment.SecondMoment secondMoment2 = new org.apache.commons.math.stat.descriptive.moment.SecondMoment();
        secondMoment2.increment((double) ' ');
        org.apache.commons.math.stat.descriptive.moment.Variance variance5 = new org.apache.commons.math.stat.descriptive.moment.Variance(secondMoment2);
        org.apache.commons.math.stat.descriptive.moment.Variance variance6 = new org.apache.commons.math.stat.descriptive.moment.Variance(false, secondMoment2);
        secondMoment2.increment((double) 0.0f);
        secondMoment2.clear();
        secondMoment2.increment(1576.2666666666667d);
        double double12 = secondMoment2.getResult();
        secondMoment2.clear();
        secondMoment2.increment(662.0d);
        org.apache.commons.math.stat.descriptive.moment.Variance variance16 = new org.apache.commons.math.stat.descriptive.moment.Variance(false, secondMoment2);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 0.0d + "'", double12 == 0.0d);
    }

    @Test
    public void test13594() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest27.test13594");
        org.apache.commons.math.stat.descriptive.moment.SecondMoment secondMoment0 = new org.apache.commons.math.stat.descriptive.moment.SecondMoment();
        secondMoment0.increment((double) ' ');
        org.apache.commons.math.stat.descriptive.moment.Variance variance3 = new org.apache.commons.math.stat.descriptive.moment.Variance(secondMoment0);
        secondMoment0.increment((double) (short) -1);
        long long6 = secondMoment0.getN();
        double double7 = secondMoment0.getResult();
        secondMoment0.clear();
        secondMoment0.increment(0.5d);
        org.apache.commons.math.stat.descriptive.moment.Variance variance11 = new org.apache.commons.math.stat.descriptive.moment.Variance(secondMoment0);
        long long12 = variance11.getN();
        boolean boolean13 = variance11.isBiasCorrected();
        long long14 = variance11.getN();
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 2L + "'", long6 == 2L);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 544.5d + "'", double7 == 544.5d);
        org.junit.Assert.assertTrue("'" + long12 + "' != '" + 1L + "'", long12 == 1L);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertTrue("'" + long14 + "' != '" + 1L + "'", long14 == 1L);
    }

    @Test
    public void test13595() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest27.test13595");
        org.apache.commons.math.stat.descriptive.moment.SecondMoment secondMoment1 = new org.apache.commons.math.stat.descriptive.moment.SecondMoment();
        secondMoment1.increment((double) ' ');
        org.apache.commons.math.stat.descriptive.moment.Variance variance4 = new org.apache.commons.math.stat.descriptive.moment.Variance(secondMoment1);
        secondMoment1.increment((double) (short) -1);
        long long7 = secondMoment1.getN();
        org.apache.commons.math.stat.descriptive.moment.Variance variance8 = new org.apache.commons.math.stat.descriptive.moment.Variance(false, secondMoment1);
        org.apache.commons.math.stat.descriptive.moment.Variance variance9 = new org.apache.commons.math.stat.descriptive.moment.Variance(secondMoment1);
        org.apache.commons.math.stat.descriptive.moment.Variance variance10 = new org.apache.commons.math.stat.descriptive.moment.Variance(secondMoment1);
        variance10.increment((double) (byte) 100);
        org.apache.commons.math.stat.descriptive.moment.Variance variance14 = new org.apache.commons.math.stat.descriptive.moment.Variance(false);
        boolean boolean15 = variance14.isBiasCorrected();
        org.apache.commons.math.stat.descriptive.moment.SecondMoment secondMoment18 = new org.apache.commons.math.stat.descriptive.moment.SecondMoment();
        secondMoment18.increment(1.0d);
        secondMoment18.increment((double) (short) 0);
        secondMoment18.increment(74.0d);
        org.apache.commons.math.stat.descriptive.moment.Variance variance25 = new org.apache.commons.math.stat.descriptive.moment.Variance(true, secondMoment18);
        long long26 = secondMoment18.getN();
        org.apache.commons.math.stat.descriptive.moment.Variance variance27 = new org.apache.commons.math.stat.descriptive.moment.Variance(true, secondMoment18);
        secondMoment18.increment(0.0d);
        secondMoment18.clear();
        org.apache.commons.math.stat.descriptive.moment.SecondMoment secondMoment31 = new org.apache.commons.math.stat.descriptive.moment.SecondMoment();
        secondMoment31.increment(1.0d);
        double[] doubleArray37 = new double[] { (-1L), 0, 10L };
        secondMoment31.incrementAll(doubleArray37, 0, 0);
        double[] doubleArray43 = new double[] { 10, (byte) 100 };
        double double44 = secondMoment31.evaluate(doubleArray43);
        org.apache.commons.math.stat.descriptive.moment.Variance variance45 = new org.apache.commons.math.stat.descriptive.moment.Variance();
        org.apache.commons.math.stat.descriptive.moment.SecondMoment secondMoment46 = new org.apache.commons.math.stat.descriptive.moment.SecondMoment();
        secondMoment46.increment(1.0d);
        secondMoment46.increment((double) (short) 0);
        double double51 = secondMoment46.getResult();
        org.apache.commons.math.stat.descriptive.moment.SecondMoment secondMoment52 = new org.apache.commons.math.stat.descriptive.moment.SecondMoment();
        secondMoment52.increment(1.0d);
        double[] doubleArray58 = new double[] { (-1L), 0, 10L };
        secondMoment52.incrementAll(doubleArray58, 0, 0);
        double double62 = secondMoment46.evaluate(doubleArray58);
        double[] doubleArray63 = new double[] {};
        secondMoment46.incrementAll(doubleArray63);
        double double67 = variance45.evaluate(doubleArray63, (int) (byte) 0, 0);
        double double68 = secondMoment31.evaluate(doubleArray63);
        double double69 = secondMoment18.evaluate(doubleArray63);
        double double70 = variance14.evaluate(doubleArray63);
        double double71 = variance10.evaluate(doubleArray63);
        boolean boolean72 = variance10.isBiasCorrected();
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + 2L + "'", long7 == 2L);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + long26 + "' != '" + 3L + "'", long26 == 3L);
        org.junit.Assert.assertNotNull(doubleArray37);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray37), "[-1.0, 0.0, 10.0]");
        org.junit.Assert.assertNotNull(doubleArray43);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray43), "[10.0, 100.0]");
        org.junit.Assert.assertTrue("'" + double44 + "' != '" + 4050.0d + "'", double44 == 4050.0d);
        org.junit.Assert.assertTrue("'" + double51 + "' != '" + 0.5d + "'", double51 == 0.5d);
        org.junit.Assert.assertNotNull(doubleArray58);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray58), "[-1.0, 0.0, 10.0]");
        org.junit.Assert.assertTrue("'" + double62 + "' != '" + 74.0d + "'", double62 == 74.0d);
        org.junit.Assert.assertNotNull(doubleArray63);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray63), "[]");
        org.junit.Assert.assertTrue(Double.isNaN(double67));
        org.junit.Assert.assertTrue("'" + double68 + "' != '" + 4050.0d + "'", double68 == 4050.0d);
        org.junit.Assert.assertTrue(Double.isNaN(double69));
        org.junit.Assert.assertTrue(Double.isNaN(double70));
        org.junit.Assert.assertTrue(Double.isNaN(double71));
        org.junit.Assert.assertTrue("'" + boolean72 + "' != '" + true + "'", boolean72 == true);
    }

    @Test
    public void test13596() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest27.test13596");
        org.apache.commons.math.stat.descriptive.moment.SecondMoment secondMoment0 = new org.apache.commons.math.stat.descriptive.moment.SecondMoment();
        secondMoment0.increment(1.0d);
        secondMoment0.increment((double) (short) 0);
        long long5 = secondMoment0.getN();
        double double6 = secondMoment0.getResult();
        double double7 = secondMoment0.getResult();
        secondMoment0.increment(0.5d);
        org.apache.commons.math.stat.descriptive.moment.SecondMoment secondMoment11 = new org.apache.commons.math.stat.descriptive.moment.SecondMoment();
        secondMoment11.increment(1.0d);
        secondMoment11.increment((double) (short) 0);
        double double16 = secondMoment11.getResult();
        org.apache.commons.math.stat.descriptive.moment.SecondMoment secondMoment18 = new org.apache.commons.math.stat.descriptive.moment.SecondMoment();
        secondMoment18.increment(1.0d);
        double[] doubleArray24 = new double[] { (-1L), 0, 10L };
        secondMoment18.incrementAll(doubleArray24, 0, 0);
        double[] doubleArray30 = new double[] { 10, (byte) 100 };
        double double31 = secondMoment18.evaluate(doubleArray30);
        double double32 = secondMoment18.getResult();
        long long33 = secondMoment18.getN();
        long long34 = secondMoment18.getN();
        org.apache.commons.math.stat.descriptive.moment.Variance variance35 = new org.apache.commons.math.stat.descriptive.moment.Variance(true, secondMoment18);
        boolean boolean36 = secondMoment11.equals((java.lang.Object) secondMoment18);
        org.apache.commons.math.stat.descriptive.moment.Variance variance37 = new org.apache.commons.math.stat.descriptive.moment.Variance(false, secondMoment11);
        org.apache.commons.math.stat.descriptive.moment.Variance variance38 = new org.apache.commons.math.stat.descriptive.moment.Variance(secondMoment11);
        variance38.clear();
        variance38.clear();
        double double41 = variance38.getResult();
        variance38.clear();
        long long43 = variance38.getN();
        boolean boolean44 = secondMoment0.equals((java.lang.Object) long43);
        long long45 = secondMoment0.getN();
        double double46 = secondMoment0.getResult();
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 2L + "'", long5 == 2L);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.5d + "'", double6 == 0.5d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 0.5d + "'", double7 == 0.5d);
        org.junit.Assert.assertTrue("'" + double16 + "' != '" + 0.5d + "'", double16 == 0.5d);
        org.junit.Assert.assertNotNull(doubleArray24);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray24), "[-1.0, 0.0, 10.0]");
        org.junit.Assert.assertNotNull(doubleArray30);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray30), "[10.0, 100.0]");
        org.junit.Assert.assertTrue("'" + double31 + "' != '" + 4050.0d + "'", double31 == 4050.0d);
        org.junit.Assert.assertTrue("'" + double32 + "' != '" + 4050.0d + "'", double32 == 4050.0d);
        org.junit.Assert.assertTrue("'" + long33 + "' != '" + 2L + "'", long33 == 2L);
        org.junit.Assert.assertTrue("'" + long34 + "' != '" + 2L + "'", long34 == 2L);
        org.junit.Assert.assertTrue("'" + boolean36 + "' != '" + false + "'", boolean36 == false);
        org.junit.Assert.assertTrue("'" + double41 + "' != '" + 0.5d + "'", double41 == 0.5d);
        org.junit.Assert.assertTrue("'" + long43 + "' != '" + 2L + "'", long43 == 2L);
        org.junit.Assert.assertTrue("'" + boolean44 + "' != '" + false + "'", boolean44 == false);
        org.junit.Assert.assertTrue("'" + long45 + "' != '" + 3L + "'", long45 == 3L);
        org.junit.Assert.assertTrue("'" + double46 + "' != '" + 0.5d + "'", double46 == 0.5d);
    }

    @Test
    public void test13597() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest27.test13597");
        org.apache.commons.math.stat.descriptive.moment.SecondMoment secondMoment1 = new org.apache.commons.math.stat.descriptive.moment.SecondMoment();
        secondMoment1.increment(1.0d);
        double[] doubleArray7 = new double[] { (-1L), 0, 10L };
        secondMoment1.incrementAll(doubleArray7, 0, 0);
        double[] doubleArray13 = new double[] { 10, (byte) 100 };
        double double14 = secondMoment1.evaluate(doubleArray13);
        org.apache.commons.math.stat.descriptive.moment.SecondMoment secondMoment16 = new org.apache.commons.math.stat.descriptive.moment.SecondMoment();
        secondMoment16.increment((double) ' ');
        org.apache.commons.math.stat.descriptive.moment.Variance variance19 = new org.apache.commons.math.stat.descriptive.moment.Variance(secondMoment16);
        secondMoment16.increment((double) (short) -1);
        secondMoment16.clear();
        secondMoment16.increment((double) 0L);
        org.apache.commons.math.stat.descriptive.moment.Variance variance25 = new org.apache.commons.math.stat.descriptive.moment.Variance(false, secondMoment16);
        boolean boolean26 = secondMoment1.equals((java.lang.Object) secondMoment16);
        org.apache.commons.math.stat.descriptive.moment.Variance variance27 = new org.apache.commons.math.stat.descriptive.moment.Variance(false, secondMoment16);
        double double28 = secondMoment16.getResult();
        double double29 = secondMoment16.getResult();
        org.apache.commons.math.stat.descriptive.moment.SecondMoment secondMoment30 = new org.apache.commons.math.stat.descriptive.moment.SecondMoment();
        secondMoment30.increment(1.0d);
        double[] doubleArray36 = new double[] { (-1L), 0, 10L };
        secondMoment30.incrementAll(doubleArray36, 0, 0);
        org.apache.commons.math.stat.descriptive.moment.Variance variance40 = new org.apache.commons.math.stat.descriptive.moment.Variance(secondMoment30);
        variance40.increment((double) (short) 100);
        variance40.clear();
        variance40.increment(Double.NaN);
        org.apache.commons.math.stat.descriptive.moment.SecondMoment secondMoment46 = new org.apache.commons.math.stat.descriptive.moment.SecondMoment();
        secondMoment46.increment((double) ' ');
        org.apache.commons.math.stat.descriptive.moment.Variance variance49 = new org.apache.commons.math.stat.descriptive.moment.Variance(secondMoment46);
        secondMoment46.increment((double) (short) -1);
        secondMoment46.clear();
        secondMoment46.increment((double) 0L);
        org.apache.commons.math.stat.descriptive.moment.Variance variance55 = new org.apache.commons.math.stat.descriptive.moment.Variance(secondMoment46);
        long long56 = secondMoment46.getN();
        org.apache.commons.math.stat.descriptive.moment.Variance variance58 = new org.apache.commons.math.stat.descriptive.moment.Variance(true);
        long long59 = variance58.getN();
        org.apache.commons.math.stat.descriptive.moment.SecondMoment secondMoment60 = new org.apache.commons.math.stat.descriptive.moment.SecondMoment();
        secondMoment60.increment(1.0d);
        secondMoment60.increment((double) (short) 0);
        double double65 = secondMoment60.getResult();
        org.apache.commons.math.stat.descriptive.moment.SecondMoment secondMoment66 = new org.apache.commons.math.stat.descriptive.moment.SecondMoment();
        secondMoment66.increment(1.0d);
        double[] doubleArray72 = new double[] { (-1L), 0, 10L };
        secondMoment66.incrementAll(doubleArray72, 0, 0);
        double double76 = secondMoment60.evaluate(doubleArray72);
        variance58.incrementAll(doubleArray72);
        double double78 = secondMoment46.evaluate(doubleArray72);
        double double79 = variance40.evaluate(doubleArray72);
        org.apache.commons.math.stat.descriptive.moment.SecondMoment secondMoment80 = new org.apache.commons.math.stat.descriptive.moment.SecondMoment();
        secondMoment80.increment(1.0d);
        secondMoment80.increment((double) (short) 0);
        double double85 = secondMoment80.getResult();
        org.apache.commons.math.stat.descriptive.moment.SecondMoment secondMoment86 = new org.apache.commons.math.stat.descriptive.moment.SecondMoment();
        secondMoment86.increment(1.0d);
        double[] doubleArray92 = new double[] { (-1L), 0, 10L };
        secondMoment86.incrementAll(doubleArray92, 0, 0);
        double double96 = secondMoment80.evaluate(doubleArray92);
        double double97 = variance40.evaluate(doubleArray92);
        double double98 = secondMoment16.evaluate(doubleArray92);
        long long99 = secondMoment16.getN();
        org.junit.Assert.assertNotNull(doubleArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray7), "[-1.0, 0.0, 10.0]");
        org.junit.Assert.assertNotNull(doubleArray13);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray13), "[10.0, 100.0]");
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + 4050.0d + "'", double14 == 4050.0d);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
        org.junit.Assert.assertTrue("'" + double28 + "' != '" + 0.0d + "'", double28 == 0.0d);
        org.junit.Assert.assertTrue("'" + double29 + "' != '" + 0.0d + "'", double29 == 0.0d);
        org.junit.Assert.assertNotNull(doubleArray36);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray36), "[-1.0, 0.0, 10.0]");
        org.junit.Assert.assertTrue("'" + long56 + "' != '" + 1L + "'", long56 == 1L);
        org.junit.Assert.assertTrue("'" + long59 + "' != '" + 0L + "'", long59 == 0L);
        org.junit.Assert.assertTrue("'" + double65 + "' != '" + 0.5d + "'", double65 == 0.5d);
        org.junit.Assert.assertNotNull(doubleArray72);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray72), "[-1.0, 0.0, 10.0]");
        org.junit.Assert.assertTrue("'" + double76 + "' != '" + 74.0d + "'", double76 == 74.0d);
        org.junit.Assert.assertTrue("'" + double78 + "' != '" + 74.0d + "'", double78 == 74.0d);
        org.junit.Assert.assertTrue("'" + double79 + "' != '" + 37.0d + "'", double79 == 37.0d);
        org.junit.Assert.assertTrue("'" + double85 + "' != '" + 0.5d + "'", double85 == 0.5d);
        org.junit.Assert.assertNotNull(doubleArray92);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray92), "[-1.0, 0.0, 10.0]");
        org.junit.Assert.assertTrue("'" + double96 + "' != '" + 74.0d + "'", double96 == 74.0d);
        org.junit.Assert.assertTrue("'" + double97 + "' != '" + 37.0d + "'", double97 == 37.0d);
        org.junit.Assert.assertTrue("'" + double98 + "' != '" + 74.0d + "'", double98 == 74.0d);
        org.junit.Assert.assertTrue("'" + long99 + "' != '" + 3L + "'", long99 == 3L);
    }

    @Test
    public void test13598() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest27.test13598");
        org.apache.commons.math.stat.descriptive.moment.SecondMoment secondMoment2 = new org.apache.commons.math.stat.descriptive.moment.SecondMoment();
        secondMoment2.increment(1.0d);
        double[] doubleArray8 = new double[] { (-1L), 0, 10L };
        secondMoment2.incrementAll(doubleArray8, 0, 0);
        double[] doubleArray14 = new double[] { 10, (byte) 100 };
        double double15 = secondMoment2.evaluate(doubleArray14);
        double double16 = secondMoment2.getResult();
        org.apache.commons.math.stat.descriptive.moment.Variance variance17 = new org.apache.commons.math.stat.descriptive.moment.Variance(false, secondMoment2);
        long long18 = secondMoment2.getN();
        org.apache.commons.math.stat.descriptive.moment.Variance variance19 = new org.apache.commons.math.stat.descriptive.moment.Variance(true, secondMoment2);
        double double20 = secondMoment2.getResult();
        secondMoment2.clear();
        secondMoment2.increment(Double.NaN);
        secondMoment2.increment((double) ' ');
        secondMoment2.increment(11837.59d);
        long long28 = secondMoment2.getN();
        org.junit.Assert.assertNotNull(doubleArray8);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray8), "[-1.0, 0.0, 10.0]");
        org.junit.Assert.assertNotNull(doubleArray14);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray14), "[10.0, 100.0]");
        org.junit.Assert.assertTrue("'" + double15 + "' != '" + 4050.0d + "'", double15 == 4050.0d);
        org.junit.Assert.assertTrue("'" + double16 + "' != '" + 4050.0d + "'", double16 == 4050.0d);
        org.junit.Assert.assertTrue("'" + long18 + "' != '" + 2L + "'", long18 == 2L);
        org.junit.Assert.assertTrue("'" + double20 + "' != '" + 4050.0d + "'", double20 == 4050.0d);
        org.junit.Assert.assertTrue("'" + long28 + "' != '" + 3L + "'", long28 == 3L);
    }

    @Test
    public void test13599() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest27.test13599");
        org.apache.commons.math.stat.descriptive.moment.SecondMoment secondMoment0 = new org.apache.commons.math.stat.descriptive.moment.SecondMoment();
        secondMoment0.increment(1.0d);
        double[] doubleArray6 = new double[] { (-1L), 0, 10L };
        secondMoment0.incrementAll(doubleArray6, 0, 0);
        double[] doubleArray12 = new double[] { 10, (byte) 100 };
        double double13 = secondMoment0.evaluate(doubleArray12);
        long long14 = secondMoment0.getN();
        secondMoment0.clear();
        double double16 = secondMoment0.getResult();
        secondMoment0.increment((double) 1.0f);
        secondMoment0.increment((-1.0d));
        secondMoment0.clear();
        secondMoment0.clear();
        secondMoment0.clear();
        org.apache.commons.math.stat.descriptive.moment.SecondMoment secondMoment26 = new org.apache.commons.math.stat.descriptive.moment.SecondMoment();
        secondMoment26.increment(1.0d);
        double[] doubleArray32 = new double[] { (-1L), 0, 10L };
        secondMoment26.incrementAll(doubleArray32, 0, 0);
        double[] doubleArray38 = new double[] { 10, (byte) 100 };
        double double39 = secondMoment26.evaluate(doubleArray38);
        double double40 = secondMoment26.getResult();
        org.apache.commons.math.stat.descriptive.moment.Variance variance41 = new org.apache.commons.math.stat.descriptive.moment.Variance(false, secondMoment26);
        long long42 = secondMoment26.getN();
        org.apache.commons.math.stat.descriptive.moment.Variance variance43 = new org.apache.commons.math.stat.descriptive.moment.Variance(true, secondMoment26);
        secondMoment26.clear();
        org.apache.commons.math.stat.descriptive.moment.SecondMoment secondMoment46 = new org.apache.commons.math.stat.descriptive.moment.SecondMoment();
        secondMoment46.increment(1.0d);
        double[] doubleArray52 = new double[] { (-1L), 0, 10L };
        secondMoment46.incrementAll(doubleArray52, 0, 0);
        double[] doubleArray58 = new double[] { 10, (byte) 100 };
        double double59 = secondMoment46.evaluate(doubleArray58);
        double double60 = secondMoment46.getResult();
        org.apache.commons.math.stat.descriptive.moment.Variance variance61 = new org.apache.commons.math.stat.descriptive.moment.Variance(false, secondMoment46);
        long long62 = secondMoment46.getN();
        org.apache.commons.math.stat.descriptive.moment.SecondMoment secondMoment63 = new org.apache.commons.math.stat.descriptive.moment.SecondMoment();
        secondMoment63.increment((double) ' ');
        secondMoment63.increment((double) (-1.0f));
        secondMoment63.clear();
        org.apache.commons.math.stat.descriptive.moment.SecondMoment secondMoment69 = new org.apache.commons.math.stat.descriptive.moment.SecondMoment();
        secondMoment69.increment(1.0d);
        double[] doubleArray75 = new double[] { (-1L), 0, 10L };
        secondMoment69.incrementAll(doubleArray75, 0, 0);
        org.apache.commons.math.stat.descriptive.moment.Variance variance79 = new org.apache.commons.math.stat.descriptive.moment.Variance(secondMoment69);
        long long80 = variance79.getN();
        org.apache.commons.math.stat.descriptive.moment.SecondMoment secondMoment81 = new org.apache.commons.math.stat.descriptive.moment.SecondMoment();
        secondMoment81.increment(1.0d);
        double[] doubleArray87 = new double[] { (-1L), 0, 10L };
        secondMoment81.incrementAll(doubleArray87, 0, 0);
        double double92 = variance79.evaluate(doubleArray87, (double) (short) -1);
        double double93 = secondMoment63.evaluate(doubleArray87);
        double double94 = secondMoment46.evaluate(doubleArray87);
        double double95 = secondMoment26.evaluate(doubleArray87);
        secondMoment0.incrementAll(doubleArray87);
        secondMoment0.clear();
        double double98 = secondMoment0.getResult();
        org.junit.Assert.assertNotNull(doubleArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray6), "[-1.0, 0.0, 10.0]");
        org.junit.Assert.assertNotNull(doubleArray12);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray12), "[10.0, 100.0]");
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 4050.0d + "'", double13 == 4050.0d);
        org.junit.Assert.assertTrue("'" + long14 + "' != '" + 2L + "'", long14 == 2L);
        org.junit.Assert.assertTrue(Double.isNaN(double16));
        org.junit.Assert.assertNotNull(doubleArray32);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray32), "[-1.0, 0.0, 10.0]");
        org.junit.Assert.assertNotNull(doubleArray38);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray38), "[10.0, 100.0]");
        org.junit.Assert.assertTrue("'" + double39 + "' != '" + 4050.0d + "'", double39 == 4050.0d);
        org.junit.Assert.assertTrue("'" + double40 + "' != '" + 4050.0d + "'", double40 == 4050.0d);
        org.junit.Assert.assertTrue("'" + long42 + "' != '" + 2L + "'", long42 == 2L);
        org.junit.Assert.assertNotNull(doubleArray52);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray52), "[-1.0, 0.0, 10.0]");
        org.junit.Assert.assertNotNull(doubleArray58);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray58), "[10.0, 100.0]");
        org.junit.Assert.assertTrue("'" + double59 + "' != '" + 4050.0d + "'", double59 == 4050.0d);
        org.junit.Assert.assertTrue("'" + double60 + "' != '" + 4050.0d + "'", double60 == 4050.0d);
        org.junit.Assert.assertTrue("'" + long62 + "' != '" + 2L + "'", long62 == 2L);
        org.junit.Assert.assertNotNull(doubleArray75);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray75), "[-1.0, 0.0, 10.0]");
        org.junit.Assert.assertTrue("'" + long80 + "' != '" + 1L + "'", long80 == 1L);
        org.junit.Assert.assertNotNull(doubleArray87);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray87), "[-1.0, 0.0, 10.0]");
        org.junit.Assert.assertTrue("'" + double92 + "' != '" + 37.0d + "'", double92 == 37.0d);
        org.junit.Assert.assertTrue("'" + double93 + "' != '" + 74.0d + "'", double93 == 74.0d);
        org.junit.Assert.assertTrue("'" + double94 + "' != '" + 74.0d + "'", double94 == 74.0d);
        org.junit.Assert.assertTrue("'" + double95 + "' != '" + 74.0d + "'", double95 == 74.0d);
        org.junit.Assert.assertTrue(Double.isNaN(double98));
    }

    @Test
    public void test13600() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest27.test13600");
        org.apache.commons.math.stat.descriptive.moment.SecondMoment secondMoment1 = new org.apache.commons.math.stat.descriptive.moment.SecondMoment();
        secondMoment1.increment((double) ' ');
        org.apache.commons.math.stat.descriptive.moment.Variance variance4 = new org.apache.commons.math.stat.descriptive.moment.Variance(secondMoment1);
        secondMoment1.increment((double) (short) -1);
        secondMoment1.clear();
        double double8 = secondMoment1.getResult();
        org.apache.commons.math.stat.descriptive.moment.SecondMoment secondMoment9 = new org.apache.commons.math.stat.descriptive.moment.SecondMoment();
        secondMoment9.increment(1.0d);
        secondMoment9.increment((double) (short) 0);
        double double14 = secondMoment9.getResult();
        org.apache.commons.math.stat.descriptive.moment.SecondMoment secondMoment15 = new org.apache.commons.math.stat.descriptive.moment.SecondMoment();
        secondMoment15.increment(1.0d);
        double[] doubleArray21 = new double[] { (-1L), 0, 10L };
        secondMoment15.incrementAll(doubleArray21, 0, 0);
        double double25 = secondMoment9.evaluate(doubleArray21);
        secondMoment1.incrementAll(doubleArray21, 0, (int) (short) 0);
        secondMoment1.increment((double) (-1.0f));
        secondMoment1.clear();
        double double32 = secondMoment1.getResult();
        org.apache.commons.math.stat.descriptive.moment.Variance variance33 = new org.apache.commons.math.stat.descriptive.moment.Variance(false, secondMoment1);
        double double34 = secondMoment1.getResult();
        org.apache.commons.math.stat.descriptive.moment.Variance variance35 = new org.apache.commons.math.stat.descriptive.moment.Variance(secondMoment1);
        variance35.clear();
        org.junit.Assert.assertTrue(Double.isNaN(double8));
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + 0.5d + "'", double14 == 0.5d);
        org.junit.Assert.assertNotNull(doubleArray21);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray21), "[-1.0, 0.0, 10.0]");
        org.junit.Assert.assertTrue("'" + double25 + "' != '" + 74.0d + "'", double25 == 74.0d);
        org.junit.Assert.assertTrue(Double.isNaN(double32));
        org.junit.Assert.assertTrue(Double.isNaN(double34));
    }

    @Test
    public void test13601() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest27.test13601");
        org.apache.commons.math.stat.descriptive.moment.SecondMoment secondMoment0 = new org.apache.commons.math.stat.descriptive.moment.SecondMoment();
        secondMoment0.increment((double) ' ');
        secondMoment0.increment((double) (short) 10);
        secondMoment0.increment((double) 2L);
        double double7 = secondMoment0.getResult();
        secondMoment0.increment(0.0d);
        secondMoment0.clear();
        secondMoment0.increment(1.2215704987955729E7d);
        double double13 = secondMoment0.getResult();
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 482.66666666666663d + "'", double7 == 482.66666666666663d);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 0.0d + "'", double13 == 0.0d);
    }

    @Test
    public void test13602() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest27.test13602");
        org.apache.commons.math.stat.descriptive.moment.SecondMoment secondMoment3 = new org.apache.commons.math.stat.descriptive.moment.SecondMoment();
        secondMoment3.increment((double) ' ');
        org.apache.commons.math.stat.descriptive.moment.Variance variance6 = new org.apache.commons.math.stat.descriptive.moment.Variance(secondMoment3);
        secondMoment3.increment((double) (short) -1);
        long long9 = secondMoment3.getN();
        org.apache.commons.math.stat.descriptive.moment.Variance variance10 = new org.apache.commons.math.stat.descriptive.moment.Variance(false, secondMoment3);
        org.apache.commons.math.stat.descriptive.moment.Variance variance11 = new org.apache.commons.math.stat.descriptive.moment.Variance(secondMoment3);
        long long12 = secondMoment3.getN();
        org.apache.commons.math.stat.descriptive.moment.Variance variance13 = new org.apache.commons.math.stat.descriptive.moment.Variance(false, secondMoment3);
        org.apache.commons.math.stat.descriptive.moment.Variance variance14 = new org.apache.commons.math.stat.descriptive.moment.Variance(false, secondMoment3);
        double double15 = secondMoment3.getResult();
        org.junit.Assert.assertTrue("'" + long9 + "' != '" + 2L + "'", long9 == 2L);
        org.junit.Assert.assertTrue("'" + long12 + "' != '" + 2L + "'", long12 == 2L);
        org.junit.Assert.assertTrue("'" + double15 + "' != '" + 544.5d + "'", double15 == 544.5d);
    }

    @Test
    public void test13603() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest27.test13603");
        org.apache.commons.math.stat.descriptive.moment.SecondMoment secondMoment0 = new org.apache.commons.math.stat.descriptive.moment.SecondMoment();
        secondMoment0.increment((double) ' ');
        org.apache.commons.math.stat.descriptive.moment.Variance variance3 = new org.apache.commons.math.stat.descriptive.moment.Variance(secondMoment0);
        secondMoment0.increment((double) (short) -1);
        secondMoment0.clear();
        secondMoment0.increment((double) 'a');
        org.apache.commons.math.stat.descriptive.moment.SecondMoment secondMoment9 = new org.apache.commons.math.stat.descriptive.moment.SecondMoment();
        secondMoment9.increment(1.0d);
        secondMoment9.increment((double) (short) 0);
        boolean boolean14 = secondMoment0.equals((java.lang.Object) secondMoment9);
        org.apache.commons.math.stat.descriptive.moment.SecondMoment secondMoment15 = new org.apache.commons.math.stat.descriptive.moment.SecondMoment();
        secondMoment15.increment(1.0d);
        org.apache.commons.math.stat.descriptive.moment.SecondMoment secondMoment18 = new org.apache.commons.math.stat.descriptive.moment.SecondMoment();
        secondMoment18.increment(1.0d);
        double[] doubleArray24 = new double[] { (-1L), 0, 10L };
        secondMoment18.incrementAll(doubleArray24, 0, 0);
        double[] doubleArray30 = new double[] { 10, (byte) 100 };
        double double31 = secondMoment18.evaluate(doubleArray30);
        double double32 = secondMoment15.evaluate(doubleArray30);
        secondMoment0.incrementAll(doubleArray30);
        secondMoment0.increment((double) 10.0f);
        org.apache.commons.math.stat.descriptive.moment.SecondMoment secondMoment37 = new org.apache.commons.math.stat.descriptive.moment.SecondMoment();
        secondMoment37.increment((double) ' ');
        org.apache.commons.math.stat.descriptive.moment.Variance variance40 = new org.apache.commons.math.stat.descriptive.moment.Variance(secondMoment37);
        secondMoment37.increment((double) (short) -1);
        long long43 = secondMoment37.getN();
        org.apache.commons.math.stat.descriptive.moment.Variance variance44 = new org.apache.commons.math.stat.descriptive.moment.Variance(false, secondMoment37);
        org.apache.commons.math.stat.descriptive.moment.Variance variance45 = new org.apache.commons.math.stat.descriptive.moment.Variance(secondMoment37);
        double double46 = secondMoment37.getResult();
        secondMoment37.clear();
        org.apache.commons.math.stat.descriptive.moment.Variance variance48 = new org.apache.commons.math.stat.descriptive.moment.Variance();
        org.apache.commons.math.stat.descriptive.moment.SecondMoment secondMoment49 = new org.apache.commons.math.stat.descriptive.moment.SecondMoment();
        secondMoment49.increment(1.0d);
        secondMoment49.increment((double) (short) 0);
        double double54 = secondMoment49.getResult();
        org.apache.commons.math.stat.descriptive.moment.SecondMoment secondMoment55 = new org.apache.commons.math.stat.descriptive.moment.SecondMoment();
        secondMoment55.increment(1.0d);
        double[] doubleArray61 = new double[] { (-1L), 0, 10L };
        secondMoment55.incrementAll(doubleArray61, 0, 0);
        double double65 = secondMoment49.evaluate(doubleArray61);
        double[] doubleArray66 = new double[] {};
        secondMoment49.incrementAll(doubleArray66);
        double double70 = variance48.evaluate(doubleArray66, (int) (byte) 0, 0);
        long long71 = variance48.getN();
        org.apache.commons.math.stat.descriptive.moment.SecondMoment secondMoment72 = new org.apache.commons.math.stat.descriptive.moment.SecondMoment();
        secondMoment72.increment(1.0d);
        secondMoment72.increment((double) (short) 0);
        double double77 = secondMoment72.getResult();
        org.apache.commons.math.stat.descriptive.moment.SecondMoment secondMoment78 = new org.apache.commons.math.stat.descriptive.moment.SecondMoment();
        secondMoment78.increment(1.0d);
        double[] doubleArray84 = new double[] { (-1L), 0, 10L };
        secondMoment78.incrementAll(doubleArray84, 0, 0);
        double double88 = secondMoment72.evaluate(doubleArray84);
        variance48.incrementAll(doubleArray84);
        double double90 = secondMoment37.evaluate(doubleArray84);
        secondMoment0.incrementAll(doubleArray84);
        secondMoment0.clear();
        secondMoment0.clear();
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertNotNull(doubleArray24);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray24), "[-1.0, 0.0, 10.0]");
        org.junit.Assert.assertNotNull(doubleArray30);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray30), "[10.0, 100.0]");
        org.junit.Assert.assertTrue("'" + double31 + "' != '" + 4050.0d + "'", double31 == 4050.0d);
        org.junit.Assert.assertTrue("'" + double32 + "' != '" + 4050.0d + "'", double32 == 4050.0d);
        org.junit.Assert.assertTrue("'" + long43 + "' != '" + 2L + "'", long43 == 2L);
        org.junit.Assert.assertTrue("'" + double46 + "' != '" + 544.5d + "'", double46 == 544.5d);
        org.junit.Assert.assertTrue("'" + double54 + "' != '" + 0.5d + "'", double54 == 0.5d);
        org.junit.Assert.assertNotNull(doubleArray61);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray61), "[-1.0, 0.0, 10.0]");
        org.junit.Assert.assertTrue("'" + double65 + "' != '" + 74.0d + "'", double65 == 74.0d);
        org.junit.Assert.assertNotNull(doubleArray66);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray66), "[]");
        org.junit.Assert.assertTrue(Double.isNaN(double70));
        org.junit.Assert.assertTrue("'" + long71 + "' != '" + 0L + "'", long71 == 0L);
        org.junit.Assert.assertTrue("'" + double77 + "' != '" + 0.5d + "'", double77 == 0.5d);
        org.junit.Assert.assertNotNull(doubleArray84);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray84), "[-1.0, 0.0, 10.0]");
        org.junit.Assert.assertTrue("'" + double88 + "' != '" + 74.0d + "'", double88 == 74.0d);
        org.junit.Assert.assertTrue("'" + double90 + "' != '" + 74.0d + "'", double90 == 74.0d);
    }

    @Test
    public void test13604() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest27.test13604");
        org.apache.commons.math.stat.descriptive.moment.SecondMoment secondMoment0 = new org.apache.commons.math.stat.descriptive.moment.SecondMoment();
        secondMoment0.increment(1.0d);
        secondMoment0.increment((double) (short) 0);
        double double5 = secondMoment0.getResult();
        secondMoment0.clear();
        long long7 = secondMoment0.getN();
        secondMoment0.increment(5226.0d);
        secondMoment0.clear();
        secondMoment0.clear();
        double double12 = secondMoment0.getResult();
        secondMoment0.increment(12.5d);
        secondMoment0.clear();
        secondMoment0.increment(90.70617283950617d);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.5d + "'", double5 == 0.5d);
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + 0L + "'", long7 == 0L);
        org.junit.Assert.assertTrue(Double.isNaN(double12));
    }

    @Test
    public void test13605() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest27.test13605");
        org.apache.commons.math.stat.descriptive.moment.SecondMoment secondMoment1 = new org.apache.commons.math.stat.descriptive.moment.SecondMoment();
        secondMoment1.increment((double) ' ');
        secondMoment1.increment((double) (byte) 0);
        secondMoment1.clear();
        org.apache.commons.math.stat.descriptive.moment.Variance variance7 = new org.apache.commons.math.stat.descriptive.moment.Variance(secondMoment1);
        org.apache.commons.math.stat.descriptive.moment.Variance variance8 = new org.apache.commons.math.stat.descriptive.moment.Variance(false, secondMoment1);
        org.apache.commons.math.stat.descriptive.moment.SecondMoment secondMoment9 = new org.apache.commons.math.stat.descriptive.moment.SecondMoment();
        secondMoment9.increment((double) ' ');
        org.apache.commons.math.stat.descriptive.moment.Variance variance12 = new org.apache.commons.math.stat.descriptive.moment.Variance(secondMoment9);
        secondMoment9.increment((double) (short) -1);
        secondMoment9.clear();
        double double16 = secondMoment9.getResult();
        org.apache.commons.math.stat.descriptive.moment.SecondMoment secondMoment17 = new org.apache.commons.math.stat.descriptive.moment.SecondMoment();
        secondMoment17.increment(1.0d);
        secondMoment17.increment((double) (short) 0);
        double double22 = secondMoment17.getResult();
        org.apache.commons.math.stat.descriptive.moment.SecondMoment secondMoment23 = new org.apache.commons.math.stat.descriptive.moment.SecondMoment();
        secondMoment23.increment(1.0d);
        double[] doubleArray29 = new double[] { (-1L), 0, 10L };
        secondMoment23.incrementAll(doubleArray29, 0, 0);
        double double33 = secondMoment17.evaluate(doubleArray29);
        secondMoment9.incrementAll(doubleArray29, 0, (int) (short) 0);
        secondMoment9.increment((double) (-1.0f));
        secondMoment9.clear();
        org.apache.commons.math.stat.descriptive.moment.Variance variance40 = new org.apache.commons.math.stat.descriptive.moment.Variance(secondMoment9);
        org.apache.commons.math.stat.descriptive.moment.SecondMoment secondMoment41 = new org.apache.commons.math.stat.descriptive.moment.SecondMoment();
        secondMoment41.increment(1.0d);
        double[] doubleArray47 = new double[] { (-1L), 0, 10L };
        secondMoment41.incrementAll(doubleArray47, 0, 0);
        org.apache.commons.math.stat.descriptive.moment.Variance variance51 = new org.apache.commons.math.stat.descriptive.moment.Variance(secondMoment41);
        double double52 = variance51.getResult();
        org.apache.commons.math.stat.descriptive.moment.SecondMoment secondMoment54 = new org.apache.commons.math.stat.descriptive.moment.SecondMoment();
        secondMoment54.increment(1.0d);
        secondMoment54.increment((double) (short) 0);
        long long59 = secondMoment54.getN();
        org.apache.commons.math.stat.descriptive.moment.Variance variance60 = new org.apache.commons.math.stat.descriptive.moment.Variance(false, secondMoment54);
        long long61 = variance60.getN();
        variance60.clear();
        org.apache.commons.math.stat.descriptive.moment.Variance variance64 = new org.apache.commons.math.stat.descriptive.moment.Variance(true);
        long long65 = variance64.getN();
        org.apache.commons.math.stat.descriptive.moment.SecondMoment secondMoment66 = new org.apache.commons.math.stat.descriptive.moment.SecondMoment();
        secondMoment66.increment(1.0d);
        secondMoment66.increment((double) (short) 0);
        double double71 = secondMoment66.getResult();
        org.apache.commons.math.stat.descriptive.moment.SecondMoment secondMoment72 = new org.apache.commons.math.stat.descriptive.moment.SecondMoment();
        secondMoment72.increment(1.0d);
        double[] doubleArray78 = new double[] { (-1L), 0, 10L };
        secondMoment72.incrementAll(doubleArray78, 0, 0);
        double double82 = secondMoment66.evaluate(doubleArray78);
        variance64.incrementAll(doubleArray78);
        double double85 = variance60.evaluate(doubleArray78, (double) (short) -1);
        double double86 = variance51.evaluate(doubleArray78);
        double double88 = variance40.evaluate(doubleArray78, 5.5310751405070744E14d);
        double double89 = secondMoment1.evaluate(doubleArray78);
        org.apache.commons.math.stat.descriptive.moment.Variance variance90 = new org.apache.commons.math.stat.descriptive.moment.Variance(secondMoment1);
        org.junit.Assert.assertTrue(Double.isNaN(double16));
        org.junit.Assert.assertTrue("'" + double22 + "' != '" + 0.5d + "'", double22 == 0.5d);
        org.junit.Assert.assertNotNull(doubleArray29);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray29), "[-1.0, 0.0, 10.0]");
        org.junit.Assert.assertTrue("'" + double33 + "' != '" + 74.0d + "'", double33 == 74.0d);
        org.junit.Assert.assertNotNull(doubleArray47);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray47), "[-1.0, 0.0, 10.0]");
        org.junit.Assert.assertTrue("'" + double52 + "' != '" + 0.0d + "'", double52 == 0.0d);
        org.junit.Assert.assertTrue("'" + long59 + "' != '" + 2L + "'", long59 == 2L);
        org.junit.Assert.assertTrue("'" + long61 + "' != '" + 2L + "'", long61 == 2L);
        org.junit.Assert.assertTrue("'" + long65 + "' != '" + 0L + "'", long65 == 0L);
        org.junit.Assert.assertTrue("'" + double71 + "' != '" + 0.5d + "'", double71 == 0.5d);
        org.junit.Assert.assertNotNull(doubleArray78);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray78), "[-1.0, 0.0, 10.0]");
        org.junit.Assert.assertTrue("'" + double82 + "' != '" + 74.0d + "'", double82 == 74.0d);
        org.junit.Assert.assertTrue("'" + double85 + "' != '" + 24.666666666666668d + "'", double85 == 24.666666666666668d);
        org.junit.Assert.assertTrue("'" + double86 + "' != '" + 37.0d + "'", double86 == 37.0d);
        org.junit.Assert.assertTrue("'" + double88 + "' != '" + 0.0d + "'", double88 == 0.0d);
        org.junit.Assert.assertTrue("'" + double89 + "' != '" + 74.0d + "'", double89 == 74.0d);
    }

    @Test
    public void test13606() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest27.test13606");
        org.apache.commons.math.stat.descriptive.moment.SecondMoment secondMoment1 = new org.apache.commons.math.stat.descriptive.moment.SecondMoment();
        secondMoment1.increment(1.0d);
        secondMoment1.increment((double) (short) 0);
        double double6 = secondMoment1.getResult();
        secondMoment1.clear();
        org.apache.commons.math.stat.descriptive.moment.Variance variance8 = new org.apache.commons.math.stat.descriptive.moment.Variance(false, secondMoment1);
        variance8.increment((double) (short) 0);
        long long11 = variance8.getN();
        double double12 = variance8.getResult();
        variance8.increment(116966.7222222222d);
        double[] doubleArray15 = null;
        // The following exception was thrown during execution in test generation
        try {
            double double17 = variance8.evaluate(doubleArray15, 6140.666666666667d);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.5d + "'", double6 == 0.5d);
        org.junit.Assert.assertTrue("'" + long11 + "' != '" + 0L + "'", long11 == 0L);
        org.junit.Assert.assertTrue(Double.isNaN(double12));
    }

    @Test
    public void test13607() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest27.test13607");
        org.apache.commons.math.stat.descriptive.moment.SecondMoment secondMoment0 = new org.apache.commons.math.stat.descriptive.moment.SecondMoment();
        secondMoment0.increment(1.0d);
        double[] doubleArray6 = new double[] { (-1L), 0, 10L };
        secondMoment0.incrementAll(doubleArray6, 0, 0);
        double[] doubleArray12 = new double[] { 10, (byte) 100 };
        double double13 = secondMoment0.evaluate(doubleArray12);
        double double14 = secondMoment0.getResult();
        secondMoment0.increment((double) (short) -1);
        double double17 = secondMoment0.getResult();
        secondMoment0.increment((double) 1L);
        secondMoment0.increment((double) (byte) 100);
        org.apache.commons.math.stat.descriptive.moment.Variance variance22 = new org.apache.commons.math.stat.descriptive.moment.Variance(secondMoment0);
        boolean boolean23 = variance22.isBiasCorrected();
        variance22.setBiasCorrected(true);
        double[] doubleArray26 = null;
        // The following exception was thrown during execution in test generation
        try {
            variance22.incrementAll(doubleArray26);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: input values array is null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(doubleArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray6), "[-1.0, 0.0, 10.0]");
        org.junit.Assert.assertNotNull(doubleArray12);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray12), "[10.0, 100.0]");
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 4050.0d + "'", double13 == 4050.0d);
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + 4050.0d + "'", double14 == 4050.0d);
        org.junit.Assert.assertTrue("'" + double17 + "' != '" + 6140.666666666667d + "'", double17 == 6140.666666666667d);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + true + "'", boolean23 == true);
    }

    @Test
    public void test13608() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest27.test13608");
        org.apache.commons.math.stat.descriptive.moment.SecondMoment secondMoment2 = new org.apache.commons.math.stat.descriptive.moment.SecondMoment();
        secondMoment2.increment((double) ' ');
        org.apache.commons.math.stat.descriptive.moment.Variance variance5 = new org.apache.commons.math.stat.descriptive.moment.Variance(secondMoment2);
        secondMoment2.increment((double) (short) -1);
        long long8 = secondMoment2.getN();
        double double9 = secondMoment2.getResult();
        org.apache.commons.math.stat.descriptive.moment.Variance variance10 = new org.apache.commons.math.stat.descriptive.moment.Variance(false, secondMoment2);
        secondMoment2.increment(2.880385675555556E7d);
        long long13 = secondMoment2.getN();
        secondMoment2.clear();
        org.apache.commons.math.stat.descriptive.moment.Variance variance15 = new org.apache.commons.math.stat.descriptive.moment.Variance(false, secondMoment2);
        double double16 = secondMoment2.getResult();
        org.apache.commons.math.stat.descriptive.moment.SecondMoment secondMoment17 = new org.apache.commons.math.stat.descriptive.moment.SecondMoment();
        secondMoment17.increment((double) ' ');
        org.apache.commons.math.stat.descriptive.moment.Variance variance20 = new org.apache.commons.math.stat.descriptive.moment.Variance(secondMoment17);
        secondMoment17.increment(272.25d);
        long long23 = secondMoment17.getN();
        long long24 = secondMoment17.getN();
        org.apache.commons.math.stat.descriptive.moment.SecondMoment secondMoment25 = new org.apache.commons.math.stat.descriptive.moment.SecondMoment();
        secondMoment25.increment((double) ' ');
        org.apache.commons.math.stat.descriptive.moment.Variance variance28 = new org.apache.commons.math.stat.descriptive.moment.Variance(secondMoment25);
        secondMoment25.increment((double) (short) -1);
        secondMoment25.clear();
        secondMoment25.increment((double) 0L);
        org.apache.commons.math.stat.descriptive.moment.Variance variance34 = new org.apache.commons.math.stat.descriptive.moment.Variance(secondMoment25);
        org.apache.commons.math.stat.descriptive.moment.SecondMoment secondMoment35 = new org.apache.commons.math.stat.descriptive.moment.SecondMoment();
        secondMoment35.increment(1.0d);
        secondMoment35.increment((double) (short) 0);
        double double40 = secondMoment35.getResult();
        org.apache.commons.math.stat.descriptive.moment.SecondMoment secondMoment41 = new org.apache.commons.math.stat.descriptive.moment.SecondMoment();
        secondMoment41.increment(1.0d);
        double[] doubleArray47 = new double[] { (-1L), 0, 10L };
        secondMoment41.incrementAll(doubleArray47, 0, 0);
        double double51 = secondMoment35.evaluate(doubleArray47);
        double double52 = secondMoment25.evaluate(doubleArray47);
        secondMoment25.increment((double) 'a');
        secondMoment25.increment(3.0d);
        org.apache.commons.math.stat.descriptive.moment.Variance variance57 = new org.apache.commons.math.stat.descriptive.moment.Variance();
        org.apache.commons.math.stat.descriptive.moment.SecondMoment secondMoment58 = new org.apache.commons.math.stat.descriptive.moment.SecondMoment();
        secondMoment58.increment(1.0d);
        secondMoment58.increment((double) (short) 0);
        double double63 = secondMoment58.getResult();
        org.apache.commons.math.stat.descriptive.moment.SecondMoment secondMoment64 = new org.apache.commons.math.stat.descriptive.moment.SecondMoment();
        secondMoment64.increment(1.0d);
        double[] doubleArray70 = new double[] { (-1L), 0, 10L };
        secondMoment64.incrementAll(doubleArray70, 0, 0);
        double double74 = secondMoment58.evaluate(doubleArray70);
        double[] doubleArray75 = new double[] {};
        secondMoment58.incrementAll(doubleArray75);
        double double79 = variance57.evaluate(doubleArray75, (int) (byte) 0, 0);
        double double80 = secondMoment25.evaluate(doubleArray75);
        secondMoment17.incrementAll(doubleArray75);
        secondMoment2.incrementAll(doubleArray75);
        double double83 = secondMoment2.getResult();
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 2L + "'", long8 == 2L);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 544.5d + "'", double9 == 544.5d);
        org.junit.Assert.assertTrue("'" + long13 + "' != '" + 3L + "'", long13 == 3L);
        org.junit.Assert.assertTrue(Double.isNaN(double16));
        org.junit.Assert.assertTrue("'" + long23 + "' != '" + 2L + "'", long23 == 2L);
        org.junit.Assert.assertTrue("'" + long24 + "' != '" + 2L + "'", long24 == 2L);
        org.junit.Assert.assertTrue("'" + double40 + "' != '" + 0.5d + "'", double40 == 0.5d);
        org.junit.Assert.assertNotNull(doubleArray47);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray47), "[-1.0, 0.0, 10.0]");
        org.junit.Assert.assertTrue("'" + double51 + "' != '" + 74.0d + "'", double51 == 74.0d);
        org.junit.Assert.assertTrue("'" + double52 + "' != '" + 74.0d + "'", double52 == 74.0d);
        org.junit.Assert.assertTrue("'" + double63 + "' != '" + 0.5d + "'", double63 == 0.5d);
        org.junit.Assert.assertNotNull(doubleArray70);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray70), "[-1.0, 0.0, 10.0]");
        org.junit.Assert.assertTrue("'" + double74 + "' != '" + 74.0d + "'", double74 == 74.0d);
        org.junit.Assert.assertNotNull(doubleArray75);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray75), "[]");
        org.junit.Assert.assertTrue(Double.isNaN(double79));
        org.junit.Assert.assertTrue("'" + double80 + "' != '" + 7142.8d + "'", double80 == 7142.8d);
        org.junit.Assert.assertTrue(Double.isNaN(double83));
    }

    @Test
    public void test13609() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest27.test13609");
        org.apache.commons.math.stat.descriptive.moment.SecondMoment secondMoment1 = new org.apache.commons.math.stat.descriptive.moment.SecondMoment();
        secondMoment1.increment((double) ' ');
        org.apache.commons.math.stat.descriptive.moment.Variance variance4 = new org.apache.commons.math.stat.descriptive.moment.Variance(secondMoment1);
        secondMoment1.increment((double) (short) -1);
        long long7 = secondMoment1.getN();
        org.apache.commons.math.stat.descriptive.moment.Variance variance8 = new org.apache.commons.math.stat.descriptive.moment.Variance(false, secondMoment1);
        double double9 = variance8.getResult();
        variance8.setBiasCorrected(true);
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + 2L + "'", long7 == 2L);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 272.25d + "'", double9 == 272.25d);
    }

    @Test
    public void test13610() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest27.test13610");
        org.apache.commons.math.stat.descriptive.moment.SecondMoment secondMoment2 = new org.apache.commons.math.stat.descriptive.moment.SecondMoment();
        secondMoment2.increment((double) ' ');
        org.apache.commons.math.stat.descriptive.moment.Variance variance5 = new org.apache.commons.math.stat.descriptive.moment.Variance(secondMoment2);
        secondMoment2.increment((double) (short) -1);
        long long8 = secondMoment2.getN();
        org.apache.commons.math.stat.descriptive.moment.Variance variance9 = new org.apache.commons.math.stat.descriptive.moment.Variance(false, secondMoment2);
        secondMoment2.clear();
        secondMoment2.increment(4402.666666666667d);
        org.apache.commons.math.stat.descriptive.moment.Variance variance13 = new org.apache.commons.math.stat.descriptive.moment.Variance(false, secondMoment2);
        org.apache.commons.math.stat.descriptive.moment.Variance variance14 = new org.apache.commons.math.stat.descriptive.moment.Variance(secondMoment2);
        org.apache.commons.math.stat.descriptive.moment.SecondMoment secondMoment15 = new org.apache.commons.math.stat.descriptive.moment.SecondMoment();
        secondMoment15.increment((double) ' ');
        org.apache.commons.math.stat.descriptive.moment.Variance variance18 = new org.apache.commons.math.stat.descriptive.moment.Variance(secondMoment15);
        long long19 = secondMoment15.getN();
        org.apache.commons.math.stat.descriptive.moment.Variance variance20 = new org.apache.commons.math.stat.descriptive.moment.Variance(secondMoment15);
        org.apache.commons.math.stat.descriptive.moment.Variance variance21 = new org.apache.commons.math.stat.descriptive.moment.Variance(secondMoment15);
        org.apache.commons.math.stat.descriptive.moment.SecondMoment secondMoment22 = new org.apache.commons.math.stat.descriptive.moment.SecondMoment();
        secondMoment22.increment((double) ' ');
        org.apache.commons.math.stat.descriptive.moment.Variance variance25 = new org.apache.commons.math.stat.descriptive.moment.Variance(secondMoment22);
        secondMoment22.increment((double) (short) -1);
        secondMoment22.clear();
        secondMoment22.increment((double) 0L);
        org.apache.commons.math.stat.descriptive.moment.Variance variance31 = new org.apache.commons.math.stat.descriptive.moment.Variance();
        org.apache.commons.math.stat.descriptive.moment.SecondMoment secondMoment32 = new org.apache.commons.math.stat.descriptive.moment.SecondMoment();
        secondMoment32.increment(1.0d);
        secondMoment32.increment((double) (short) 0);
        double double37 = secondMoment32.getResult();
        org.apache.commons.math.stat.descriptive.moment.SecondMoment secondMoment38 = new org.apache.commons.math.stat.descriptive.moment.SecondMoment();
        secondMoment38.increment(1.0d);
        double[] doubleArray44 = new double[] { (-1L), 0, 10L };
        secondMoment38.incrementAll(doubleArray44, 0, 0);
        double double48 = secondMoment32.evaluate(doubleArray44);
        double[] doubleArray49 = new double[] {};
        secondMoment32.incrementAll(doubleArray49);
        double double53 = variance31.evaluate(doubleArray49, (int) (byte) 0, 0);
        long long54 = variance31.getN();
        org.apache.commons.math.stat.descriptive.moment.SecondMoment secondMoment55 = new org.apache.commons.math.stat.descriptive.moment.SecondMoment();
        secondMoment55.increment(1.0d);
        secondMoment55.increment((double) (short) 0);
        double double60 = secondMoment55.getResult();
        org.apache.commons.math.stat.descriptive.moment.SecondMoment secondMoment61 = new org.apache.commons.math.stat.descriptive.moment.SecondMoment();
        secondMoment61.increment(1.0d);
        double[] doubleArray67 = new double[] { (-1L), 0, 10L };
        secondMoment61.incrementAll(doubleArray67, 0, 0);
        double double71 = secondMoment55.evaluate(doubleArray67);
        variance31.incrementAll(doubleArray67);
        long long73 = variance31.getN();
        org.apache.commons.math.stat.descriptive.moment.SecondMoment secondMoment74 = new org.apache.commons.math.stat.descriptive.moment.SecondMoment();
        secondMoment74.increment(1.0d);
        secondMoment74.increment((double) (short) 0);
        double double79 = secondMoment74.getResult();
        org.apache.commons.math.stat.descriptive.moment.SecondMoment secondMoment80 = new org.apache.commons.math.stat.descriptive.moment.SecondMoment();
        secondMoment80.increment(1.0d);
        double[] doubleArray86 = new double[] { (-1L), 0, 10L };
        secondMoment80.incrementAll(doubleArray86, 0, 0);
        double double90 = secondMoment74.evaluate(doubleArray86);
        double[] doubleArray91 = new double[] {};
        secondMoment74.incrementAll(doubleArray91);
        double double93 = variance31.evaluate(doubleArray91);
        double double94 = secondMoment22.evaluate(doubleArray91);
        variance21.incrementAll(doubleArray91);
        // The following exception was thrown during execution in test generation
        try {
            secondMoment2.incrementAll(doubleArray91, (int) (short) 1, 10);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: begin + length > values.length");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 2L + "'", long8 == 2L);
        org.junit.Assert.assertTrue("'" + long19 + "' != '" + 1L + "'", long19 == 1L);
        org.junit.Assert.assertTrue("'" + double37 + "' != '" + 0.5d + "'", double37 == 0.5d);
        org.junit.Assert.assertNotNull(doubleArray44);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray44), "[-1.0, 0.0, 10.0]");
        org.junit.Assert.assertTrue("'" + double48 + "' != '" + 74.0d + "'", double48 == 74.0d);
        org.junit.Assert.assertNotNull(doubleArray49);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray49), "[]");
        org.junit.Assert.assertTrue(Double.isNaN(double53));
        org.junit.Assert.assertTrue("'" + long54 + "' != '" + 0L + "'", long54 == 0L);
        org.junit.Assert.assertTrue("'" + double60 + "' != '" + 0.5d + "'", double60 == 0.5d);
        org.junit.Assert.assertNotNull(doubleArray67);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray67), "[-1.0, 0.0, 10.0]");
        org.junit.Assert.assertTrue("'" + double71 + "' != '" + 74.0d + "'", double71 == 74.0d);
        org.junit.Assert.assertTrue("'" + long73 + "' != '" + 3L + "'", long73 == 3L);
        org.junit.Assert.assertTrue("'" + double79 + "' != '" + 0.5d + "'", double79 == 0.5d);
        org.junit.Assert.assertNotNull(doubleArray86);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray86), "[-1.0, 0.0, 10.0]");
        org.junit.Assert.assertTrue("'" + double90 + "' != '" + 74.0d + "'", double90 == 74.0d);
        org.junit.Assert.assertNotNull(doubleArray91);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray91), "[]");
        org.junit.Assert.assertTrue(Double.isNaN(double93));
        org.junit.Assert.assertTrue("'" + double94 + "' != '" + 0.0d + "'", double94 == 0.0d);
    }

    @Test
    public void test13611() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest27.test13611");
        org.apache.commons.math.stat.descriptive.moment.SecondMoment secondMoment0 = new org.apache.commons.math.stat.descriptive.moment.SecondMoment();
        secondMoment0.increment((double) ' ');
        org.apache.commons.math.stat.descriptive.moment.Variance variance3 = new org.apache.commons.math.stat.descriptive.moment.Variance(secondMoment0);
        secondMoment0.increment((double) (short) -1);
        secondMoment0.clear();
        secondMoment0.increment((double) 'a');
        secondMoment0.clear();
        secondMoment0.increment(2312.0d);
        secondMoment0.increment((double) (byte) -1);
        secondMoment0.increment(0.0d);
        double double16 = secondMoment0.getResult();
        double[] doubleArray17 = null;
        // The following exception was thrown during execution in test generation
        try {
            double double20 = secondMoment0.evaluate(doubleArray17, 0, (int) (short) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: input value array is null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + double16 + "' != '" + 3565104.666666667d + "'", double16 == 3565104.666666667d);
    }

    @Test
    public void test13612() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest27.test13612");
        org.apache.commons.math.stat.descriptive.moment.SecondMoment secondMoment0 = new org.apache.commons.math.stat.descriptive.moment.SecondMoment();
        secondMoment0.increment((double) ' ');
        org.apache.commons.math.stat.descriptive.moment.Variance variance3 = new org.apache.commons.math.stat.descriptive.moment.Variance(secondMoment0);
        secondMoment0.increment((double) (short) -1);
        secondMoment0.clear();
        secondMoment0.increment(7881.333333333333d);
        secondMoment0.clear();
        org.apache.commons.math.stat.descriptive.moment.Variance variance10 = new org.apache.commons.math.stat.descriptive.moment.Variance(secondMoment0);
        double double11 = secondMoment0.getResult();
        long long12 = secondMoment0.getN();
        org.junit.Assert.assertTrue(Double.isNaN(double11));
        org.junit.Assert.assertTrue("'" + long12 + "' != '" + 0L + "'", long12 == 0L);
    }

    @Test
    public void test13613() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest27.test13613");
        org.apache.commons.math.stat.descriptive.moment.SecondMoment secondMoment0 = new org.apache.commons.math.stat.descriptive.moment.SecondMoment();
        secondMoment0.increment((double) ' ');
        org.apache.commons.math.stat.descriptive.moment.Variance variance3 = new org.apache.commons.math.stat.descriptive.moment.Variance(secondMoment0);
        secondMoment0.increment((double) '4');
        double double6 = secondMoment0.getResult();
        long long7 = secondMoment0.getN();
        long long8 = secondMoment0.getN();
        secondMoment0.increment(7.703419152040815E7d);
        long long11 = secondMoment0.getN();
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 200.0d + "'", double6 == 200.0d);
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + 2L + "'", long7 == 2L);
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 2L + "'", long8 == 2L);
        org.junit.Assert.assertTrue("'" + long11 + "' != '" + 3L + "'", long11 == 3L);
    }

    @Test
    public void test13614() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest27.test13614");
        org.apache.commons.math.stat.descriptive.moment.SecondMoment secondMoment1 = new org.apache.commons.math.stat.descriptive.moment.SecondMoment();
        secondMoment1.increment(1.0d);
        double[] doubleArray7 = new double[] { (-1L), 0, 10L };
        secondMoment1.incrementAll(doubleArray7, 0, 0);
        double[] doubleArray13 = new double[] { 10, (byte) 100 };
        double double14 = secondMoment1.evaluate(doubleArray13);
        double double15 = secondMoment1.getResult();
        org.apache.commons.math.stat.descriptive.moment.Variance variance16 = new org.apache.commons.math.stat.descriptive.moment.Variance(false, secondMoment1);
        long long17 = secondMoment1.getN();
        double double18 = secondMoment1.getResult();
        secondMoment1.increment(7142.8d);
        org.apache.commons.math.stat.descriptive.moment.Variance variance21 = new org.apache.commons.math.stat.descriptive.moment.Variance(secondMoment1);
        double double22 = secondMoment1.getResult();
        secondMoment1.clear();
        secondMoment1.increment(5.802232643432324E14d);
        org.junit.Assert.assertNotNull(doubleArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray7), "[-1.0, 0.0, 10.0]");
        org.junit.Assert.assertNotNull(doubleArray13);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray13), "[10.0, 100.0]");
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + 4050.0d + "'", double14 == 4050.0d);
        org.junit.Assert.assertTrue("'" + double15 + "' != '" + 4050.0d + "'", double15 == 4050.0d);
        org.junit.Assert.assertTrue("'" + long17 + "' != '" + 2L + "'", long17 == 2L);
        org.junit.Assert.assertTrue("'" + double18 + "' != '" + 4050.0d + "'", double18 == 4050.0d);
        org.junit.Assert.assertTrue("'" + double22 + "' != '" + 3.349532256E7d + "'", double22 == 3.349532256E7d);
    }

    @Test
    public void test13615() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest27.test13615");
        org.apache.commons.math.stat.descriptive.moment.FirstMoment firstMoment0 = new org.apache.commons.math.stat.descriptive.moment.FirstMoment();
        firstMoment0.increment((double) 1L);
        org.apache.commons.math.stat.descriptive.moment.SecondMoment secondMoment3 = new org.apache.commons.math.stat.descriptive.moment.SecondMoment();
        secondMoment3.increment((double) ' ');
        org.apache.commons.math.stat.descriptive.moment.Variance variance6 = new org.apache.commons.math.stat.descriptive.moment.Variance(secondMoment3);
        secondMoment3.increment((double) (short) -1);
        secondMoment3.clear();
        secondMoment3.increment((double) 0L);
        org.apache.commons.math.stat.descriptive.moment.Variance variance12 = new org.apache.commons.math.stat.descriptive.moment.Variance(secondMoment3);
        org.apache.commons.math.stat.descriptive.moment.SecondMoment secondMoment13 = new org.apache.commons.math.stat.descriptive.moment.SecondMoment();
        secondMoment13.increment(1.0d);
        secondMoment13.increment((double) (short) 0);
        double double18 = secondMoment13.getResult();
        org.apache.commons.math.stat.descriptive.moment.SecondMoment secondMoment19 = new org.apache.commons.math.stat.descriptive.moment.SecondMoment();
        secondMoment19.increment(1.0d);
        double[] doubleArray25 = new double[] { (-1L), 0, 10L };
        secondMoment19.incrementAll(doubleArray25, 0, 0);
        double double29 = secondMoment13.evaluate(doubleArray25);
        double double30 = secondMoment3.evaluate(doubleArray25);
        double double31 = secondMoment3.getResult();
        secondMoment3.increment(4034.0d);
        org.apache.commons.math.stat.descriptive.moment.Variance variance34 = new org.apache.commons.math.stat.descriptive.moment.Variance(secondMoment3);
        org.apache.commons.math.stat.descriptive.moment.SecondMoment secondMoment36 = new org.apache.commons.math.stat.descriptive.moment.SecondMoment();
        secondMoment36.increment(1.0d);
        double[] doubleArray42 = new double[] { (-1L), 0, 10L };
        secondMoment36.incrementAll(doubleArray42, 0, 0);
        double[] doubleArray48 = new double[] { 10, (byte) 100 };
        double double49 = secondMoment36.evaluate(doubleArray48);
        long long50 = secondMoment36.getN();
        secondMoment36.clear();
        double double52 = secondMoment36.getResult();
        secondMoment36.clear();
        org.apache.commons.math.stat.descriptive.moment.Variance variance54 = new org.apache.commons.math.stat.descriptive.moment.Variance(true, secondMoment36);
        org.apache.commons.math.stat.descriptive.moment.SecondMoment secondMoment55 = new org.apache.commons.math.stat.descriptive.moment.SecondMoment();
        secondMoment55.increment(1.0d);
        double[] doubleArray61 = new double[] { (-1L), 0, 10L };
        secondMoment55.incrementAll(doubleArray61, 0, 0);
        double double65 = variance54.evaluate(doubleArray61);
        double double67 = variance34.evaluate(doubleArray61, 40.5d);
        double double68 = firstMoment0.evaluate(doubleArray61);
        firstMoment0.clear();
        org.junit.Assert.assertTrue("'" + double18 + "' != '" + 0.5d + "'", double18 == 0.5d);
        org.junit.Assert.assertNotNull(doubleArray25);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray25), "[-1.0, 0.0, 10.0]");
        org.junit.Assert.assertTrue("'" + double29 + "' != '" + 74.0d + "'", double29 == 74.0d);
        org.junit.Assert.assertTrue("'" + double30 + "' != '" + 74.0d + "'", double30 == 74.0d);
        org.junit.Assert.assertTrue("'" + double31 + "' != '" + 74.0d + "'", double31 == 74.0d);
        org.junit.Assert.assertNotNull(doubleArray42);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray42), "[-1.0, 0.0, 10.0]");
        org.junit.Assert.assertNotNull(doubleArray48);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray48), "[10.0, 100.0]");
        org.junit.Assert.assertTrue("'" + double49 + "' != '" + 4050.0d + "'", double49 == 4050.0d);
        org.junit.Assert.assertTrue("'" + long50 + "' != '" + 2L + "'", long50 == 2L);
        org.junit.Assert.assertTrue(Double.isNaN(double52));
        org.junit.Assert.assertNotNull(doubleArray61);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray61), "[-1.0, 0.0, 10.0]");
        org.junit.Assert.assertTrue("'" + double65 + "' != '" + 37.0d + "'", double65 == 37.0d);
        org.junit.Assert.assertTrue("'" + double67 + "' != '" + 37.0d + "'", double67 == 37.0d);
        org.junit.Assert.assertTrue("'" + double68 + "' != '" + 3.0d + "'", double68 == 3.0d);
    }

    @Test
    public void test13616() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest27.test13616");
        org.apache.commons.math.stat.descriptive.moment.SecondMoment secondMoment0 = new org.apache.commons.math.stat.descriptive.moment.SecondMoment();
        secondMoment0.increment((double) ' ');
        org.apache.commons.math.stat.descriptive.moment.Variance variance3 = new org.apache.commons.math.stat.descriptive.moment.Variance(secondMoment0);
        secondMoment0.increment((double) (short) -1);
        secondMoment0.clear();
        double double7 = secondMoment0.getResult();
        double double8 = secondMoment0.getResult();
        secondMoment0.clear();
        secondMoment0.increment(1.0932300666666664E7d);
        org.junit.Assert.assertTrue(Double.isNaN(double7));
        org.junit.Assert.assertTrue(Double.isNaN(double8));
    }

    @Test
    public void test13617() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest27.test13617");
        org.apache.commons.math.stat.descriptive.moment.SecondMoment secondMoment1 = new org.apache.commons.math.stat.descriptive.moment.SecondMoment();
        secondMoment1.increment(1.0d);
        secondMoment1.increment((double) (short) 0);
        double double6 = secondMoment1.getResult();
        secondMoment1.clear();
        org.apache.commons.math.stat.descriptive.moment.Variance variance8 = new org.apache.commons.math.stat.descriptive.moment.Variance(false, secondMoment1);
        variance8.increment((double) (short) 0);
        variance8.clear();
        variance8.increment((double) 1L);
        org.apache.commons.math.stat.descriptive.moment.SecondMoment secondMoment14 = new org.apache.commons.math.stat.descriptive.moment.SecondMoment();
        secondMoment14.increment(1.0d);
        double[] doubleArray20 = new double[] { (-1L), 0, 10L };
        secondMoment14.incrementAll(doubleArray20, 0, 0);
        double double24 = variance8.evaluate(doubleArray20);
        org.apache.commons.math.stat.descriptive.moment.SecondMoment secondMoment25 = new org.apache.commons.math.stat.descriptive.moment.SecondMoment();
        secondMoment25.increment(1.0d);
        secondMoment25.increment((double) (short) 0);
        double double30 = secondMoment25.getResult();
        org.apache.commons.math.stat.descriptive.moment.SecondMoment secondMoment31 = new org.apache.commons.math.stat.descriptive.moment.SecondMoment();
        secondMoment31.increment((double) ' ');
        double double34 = secondMoment31.getResult();
        org.apache.commons.math.stat.descriptive.moment.Variance variance35 = new org.apache.commons.math.stat.descriptive.moment.Variance(secondMoment31);
        boolean boolean36 = secondMoment25.equals((java.lang.Object) variance35);
        org.apache.commons.math.stat.descriptive.moment.SecondMoment secondMoment37 = new org.apache.commons.math.stat.descriptive.moment.SecondMoment();
        secondMoment37.increment((double) ' ');
        org.apache.commons.math.stat.descriptive.moment.Variance variance40 = new org.apache.commons.math.stat.descriptive.moment.Variance(secondMoment37);
        secondMoment37.increment((double) (short) -1);
        secondMoment37.clear();
        secondMoment37.increment((double) 0L);
        org.apache.commons.math.stat.descriptive.moment.Variance variance46 = new org.apache.commons.math.stat.descriptive.moment.Variance(secondMoment37);
        long long47 = variance46.getN();
        org.apache.commons.math.stat.descriptive.moment.SecondMoment secondMoment48 = new org.apache.commons.math.stat.descriptive.moment.SecondMoment();
        secondMoment48.increment(1.0d);
        org.apache.commons.math.stat.descriptive.moment.SecondMoment secondMoment51 = new org.apache.commons.math.stat.descriptive.moment.SecondMoment();
        secondMoment51.increment(1.0d);
        secondMoment51.increment((double) (short) 0);
        double double56 = secondMoment51.getResult();
        org.apache.commons.math.stat.descriptive.moment.SecondMoment secondMoment57 = new org.apache.commons.math.stat.descriptive.moment.SecondMoment();
        secondMoment57.increment(1.0d);
        double[] doubleArray63 = new double[] { (-1L), 0, 10L };
        secondMoment57.incrementAll(doubleArray63, 0, 0);
        double double67 = secondMoment51.evaluate(doubleArray63);
        double[] doubleArray68 = new double[] {};
        secondMoment51.incrementAll(doubleArray68);
        double double70 = secondMoment48.evaluate(doubleArray68);
        double double71 = variance46.evaluate(doubleArray68);
        double double72 = secondMoment25.evaluate(doubleArray68);
        double double73 = variance8.evaluate(doubleArray68);
        variance8.clear();
        double double75 = variance8.getResult();
        variance8.clear();
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.5d + "'", double6 == 0.5d);
        org.junit.Assert.assertNotNull(doubleArray20);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray20), "[-1.0, 0.0, 10.0]");
        org.junit.Assert.assertTrue("'" + double24 + "' != '" + 24.666666666666668d + "'", double24 == 24.666666666666668d);
        org.junit.Assert.assertTrue("'" + double30 + "' != '" + 0.5d + "'", double30 == 0.5d);
        org.junit.Assert.assertTrue("'" + double34 + "' != '" + 0.0d + "'", double34 == 0.0d);
        org.junit.Assert.assertTrue("'" + boolean36 + "' != '" + false + "'", boolean36 == false);
        org.junit.Assert.assertTrue("'" + long47 + "' != '" + 1L + "'", long47 == 1L);
        org.junit.Assert.assertTrue("'" + double56 + "' != '" + 0.5d + "'", double56 == 0.5d);
        org.junit.Assert.assertNotNull(doubleArray63);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray63), "[-1.0, 0.0, 10.0]");
        org.junit.Assert.assertTrue("'" + double67 + "' != '" + 74.0d + "'", double67 == 74.0d);
        org.junit.Assert.assertNotNull(doubleArray68);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray68), "[]");
        org.junit.Assert.assertTrue("'" + double70 + "' != '" + 0.0d + "'", double70 == 0.0d);
        org.junit.Assert.assertTrue(Double.isNaN(double71));
        org.junit.Assert.assertTrue("'" + double72 + "' != '" + 0.5d + "'", double72 == 0.5d);
        org.junit.Assert.assertTrue(Double.isNaN(double73));
        org.junit.Assert.assertTrue(Double.isNaN(double75));
    }

    @Test
    public void test13618() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest27.test13618");
        org.apache.commons.math.stat.descriptive.moment.SecondMoment secondMoment1 = new org.apache.commons.math.stat.descriptive.moment.SecondMoment();
        secondMoment1.increment(1.0d);
        secondMoment1.increment((double) 10L);
        double double6 = secondMoment1.getResult();
        double double7 = secondMoment1.getResult();
        org.apache.commons.math.stat.descriptive.moment.Variance variance8 = new org.apache.commons.math.stat.descriptive.moment.Variance(true, secondMoment1);
        org.apache.commons.math.stat.descriptive.moment.Variance variance10 = new org.apache.commons.math.stat.descriptive.moment.Variance(true);
        variance10.clear();
        org.apache.commons.math.stat.descriptive.moment.SecondMoment secondMoment14 = new org.apache.commons.math.stat.descriptive.moment.SecondMoment();
        secondMoment14.increment(1.0d);
        double[] doubleArray20 = new double[] { (-1L), 0, 10L };
        secondMoment14.incrementAll(doubleArray20, 0, 0);
        double[] doubleArray26 = new double[] { 10, (byte) 100 };
        double double27 = secondMoment14.evaluate(doubleArray26);
        double double28 = secondMoment14.getResult();
        org.apache.commons.math.stat.descriptive.moment.Variance variance29 = new org.apache.commons.math.stat.descriptive.moment.Variance(false, secondMoment14);
        long long30 = secondMoment14.getN();
        org.apache.commons.math.stat.descriptive.moment.Variance variance31 = new org.apache.commons.math.stat.descriptive.moment.Variance(true, secondMoment14);
        double double32 = secondMoment14.getResult();
        secondMoment14.clear();
        secondMoment14.increment(Double.NaN);
        secondMoment14.increment((double) ' ');
        org.apache.commons.math.stat.descriptive.moment.Variance variance39 = new org.apache.commons.math.stat.descriptive.moment.Variance(true);
        long long40 = variance39.getN();
        org.apache.commons.math.stat.descriptive.moment.SecondMoment secondMoment41 = new org.apache.commons.math.stat.descriptive.moment.SecondMoment();
        secondMoment41.increment(1.0d);
        secondMoment41.increment((double) (short) 0);
        double double46 = secondMoment41.getResult();
        org.apache.commons.math.stat.descriptive.moment.SecondMoment secondMoment47 = new org.apache.commons.math.stat.descriptive.moment.SecondMoment();
        secondMoment47.increment(1.0d);
        double[] doubleArray53 = new double[] { (-1L), 0, 10L };
        secondMoment47.incrementAll(doubleArray53, 0, 0);
        double double57 = secondMoment41.evaluate(doubleArray53);
        variance39.incrementAll(doubleArray53);
        secondMoment14.incrementAll(doubleArray53);
        variance10.incrementAll(doubleArray53);
        long long61 = variance10.getN();
        variance10.setBiasCorrected(false);
        double double64 = variance10.getResult();
        double double65 = variance10.getResult();
        boolean boolean66 = variance8.equals((java.lang.Object) variance10);
        double double67 = variance10.getResult();
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 40.5d + "'", double6 == 40.5d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 40.5d + "'", double7 == 40.5d);
        org.junit.Assert.assertNotNull(doubleArray20);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray20), "[-1.0, 0.0, 10.0]");
        org.junit.Assert.assertNotNull(doubleArray26);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray26), "[10.0, 100.0]");
        org.junit.Assert.assertTrue("'" + double27 + "' != '" + 4050.0d + "'", double27 == 4050.0d);
        org.junit.Assert.assertTrue("'" + double28 + "' != '" + 4050.0d + "'", double28 == 4050.0d);
        org.junit.Assert.assertTrue("'" + long30 + "' != '" + 2L + "'", long30 == 2L);
        org.junit.Assert.assertTrue("'" + double32 + "' != '" + 4050.0d + "'", double32 == 4050.0d);
        org.junit.Assert.assertTrue("'" + long40 + "' != '" + 0L + "'", long40 == 0L);
        org.junit.Assert.assertTrue("'" + double46 + "' != '" + 0.5d + "'", double46 == 0.5d);
        org.junit.Assert.assertNotNull(doubleArray53);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray53), "[-1.0, 0.0, 10.0]");
        org.junit.Assert.assertTrue("'" + double57 + "' != '" + 74.0d + "'", double57 == 74.0d);
        org.junit.Assert.assertTrue("'" + long61 + "' != '" + 3L + "'", long61 == 3L);
        org.junit.Assert.assertTrue("'" + double64 + "' != '" + 24.666666666666668d + "'", double64 == 24.666666666666668d);
        org.junit.Assert.assertTrue("'" + double65 + "' != '" + 24.666666666666668d + "'", double65 == 24.666666666666668d);
        org.junit.Assert.assertTrue("'" + boolean66 + "' != '" + false + "'", boolean66 == false);
        org.junit.Assert.assertTrue("'" + double67 + "' != '" + 24.666666666666668d + "'", double67 == 24.666666666666668d);
    }

    @Test
    public void test13619() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest27.test13619");
        org.apache.commons.math.stat.descriptive.moment.SecondMoment secondMoment0 = new org.apache.commons.math.stat.descriptive.moment.SecondMoment();
        secondMoment0.increment(1.0d);
        secondMoment0.increment((double) (short) 0);
        long long5 = secondMoment0.getN();
        double double6 = secondMoment0.getResult();
        double double7 = secondMoment0.getResult();
        secondMoment0.increment(0.5d);
        org.apache.commons.math.stat.descriptive.moment.SecondMoment secondMoment11 = new org.apache.commons.math.stat.descriptive.moment.SecondMoment();
        secondMoment11.increment((double) ' ');
        org.apache.commons.math.stat.descriptive.moment.Variance variance14 = new org.apache.commons.math.stat.descriptive.moment.Variance(secondMoment11);
        secondMoment11.increment((double) (short) -1);
        long long17 = secondMoment11.getN();
        org.apache.commons.math.stat.descriptive.moment.Variance variance18 = new org.apache.commons.math.stat.descriptive.moment.Variance(false, secondMoment11);
        org.apache.commons.math.stat.descriptive.moment.Variance variance19 = new org.apache.commons.math.stat.descriptive.moment.Variance(secondMoment11);
        org.apache.commons.math.stat.descriptive.moment.Variance variance20 = new org.apache.commons.math.stat.descriptive.moment.Variance(secondMoment11);
        boolean boolean21 = secondMoment0.equals((java.lang.Object) secondMoment11);
        secondMoment11.increment(1.0559010666666666E7d);
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 2L + "'", long5 == 2L);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.5d + "'", double6 == 0.5d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 0.5d + "'", double7 == 0.5d);
        org.junit.Assert.assertTrue("'" + long17 + "' != '" + 2L + "'", long17 == 2L);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
    }

    @Test
    public void test13620() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest27.test13620");
        org.apache.commons.math.stat.descriptive.moment.SecondMoment secondMoment2 = new org.apache.commons.math.stat.descriptive.moment.SecondMoment();
        secondMoment2.increment((double) ' ');
        org.apache.commons.math.stat.descriptive.moment.Variance variance5 = new org.apache.commons.math.stat.descriptive.moment.Variance(secondMoment2);
        org.apache.commons.math.stat.descriptive.moment.Variance variance6 = new org.apache.commons.math.stat.descriptive.moment.Variance(false, secondMoment2);
        secondMoment2.increment((double) 0.0f);
        secondMoment2.clear();
        org.apache.commons.math.stat.descriptive.moment.Variance variance10 = new org.apache.commons.math.stat.descriptive.moment.Variance(true, secondMoment2);
        org.apache.commons.math.stat.descriptive.moment.Variance variance11 = new org.apache.commons.math.stat.descriptive.moment.Variance(secondMoment2);
        secondMoment2.clear();
        org.apache.commons.math.stat.descriptive.moment.SecondMoment secondMoment13 = new org.apache.commons.math.stat.descriptive.moment.SecondMoment();
        secondMoment13.increment(1.0d);
        secondMoment13.clear();
        double double17 = secondMoment13.getResult();
        org.apache.commons.math.stat.descriptive.moment.Variance variance19 = new org.apache.commons.math.stat.descriptive.moment.Variance(true);
        long long20 = variance19.getN();
        org.apache.commons.math.stat.descriptive.moment.SecondMoment secondMoment21 = new org.apache.commons.math.stat.descriptive.moment.SecondMoment();
        secondMoment21.increment(1.0d);
        secondMoment21.increment((double) (short) 0);
        double double26 = secondMoment21.getResult();
        org.apache.commons.math.stat.descriptive.moment.SecondMoment secondMoment27 = new org.apache.commons.math.stat.descriptive.moment.SecondMoment();
        secondMoment27.increment(1.0d);
        double[] doubleArray33 = new double[] { (-1L), 0, 10L };
        secondMoment27.incrementAll(doubleArray33, 0, 0);
        double double37 = secondMoment21.evaluate(doubleArray33);
        double double39 = variance19.evaluate(doubleArray33, (double) 4L);
        org.apache.commons.math.stat.descriptive.moment.SecondMoment secondMoment40 = new org.apache.commons.math.stat.descriptive.moment.SecondMoment();
        secondMoment40.increment(1.0d);
        secondMoment40.increment((double) (short) 0);
        double double45 = secondMoment40.getResult();
        org.apache.commons.math.stat.descriptive.moment.SecondMoment secondMoment46 = new org.apache.commons.math.stat.descriptive.moment.SecondMoment();
        secondMoment46.increment(1.0d);
        secondMoment46.increment((double) (short) 0);
        double double51 = secondMoment46.getResult();
        org.apache.commons.math.stat.descriptive.moment.SecondMoment secondMoment52 = new org.apache.commons.math.stat.descriptive.moment.SecondMoment();
        secondMoment52.increment(1.0d);
        double[] doubleArray58 = new double[] { (-1L), 0, 10L };
        secondMoment52.incrementAll(doubleArray58, 0, 0);
        double double62 = secondMoment46.evaluate(doubleArray58);
        double[] doubleArray63 = new double[] {};
        secondMoment46.incrementAll(doubleArray63);
        secondMoment40.incrementAll(doubleArray63);
        secondMoment40.increment((double) 2L);
        org.apache.commons.math.stat.descriptive.moment.Variance variance68 = new org.apache.commons.math.stat.descriptive.moment.Variance(secondMoment40);
        org.apache.commons.math.stat.descriptive.moment.SecondMoment secondMoment69 = new org.apache.commons.math.stat.descriptive.moment.SecondMoment();
        secondMoment69.increment(1.0d);
        double[] doubleArray75 = new double[] { (-1L), 0, 10L };
        secondMoment69.incrementAll(doubleArray75, 0, 0);
        double[] doubleArray81 = new double[] { 10, (byte) 100 };
        double double82 = secondMoment69.evaluate(doubleArray81);
        double double83 = variance68.evaluate(doubleArray81);
        double double84 = variance19.evaluate(doubleArray81);
        double double85 = secondMoment13.evaluate(doubleArray81);
        secondMoment2.incrementAll(doubleArray81);
        double double87 = secondMoment2.getResult();
        org.junit.Assert.assertTrue(Double.isNaN(double17));
        org.junit.Assert.assertTrue("'" + long20 + "' != '" + 0L + "'", long20 == 0L);
        org.junit.Assert.assertTrue("'" + double26 + "' != '" + 0.5d + "'", double26 == 0.5d);
        org.junit.Assert.assertNotNull(doubleArray33);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray33), "[-1.0, 0.0, 10.0]");
        org.junit.Assert.assertTrue("'" + double37 + "' != '" + 74.0d + "'", double37 == 74.0d);
        org.junit.Assert.assertTrue("'" + double39 + "' != '" + 37.0d + "'", double39 == 37.0d);
        org.junit.Assert.assertTrue("'" + double45 + "' != '" + 0.5d + "'", double45 == 0.5d);
        org.junit.Assert.assertTrue("'" + double51 + "' != '" + 0.5d + "'", double51 == 0.5d);
        org.junit.Assert.assertNotNull(doubleArray58);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray58), "[-1.0, 0.0, 10.0]");
        org.junit.Assert.assertTrue("'" + double62 + "' != '" + 74.0d + "'", double62 == 74.0d);
        org.junit.Assert.assertNotNull(doubleArray63);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray63), "[]");
        org.junit.Assert.assertNotNull(doubleArray75);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray75), "[-1.0, 0.0, 10.0]");
        org.junit.Assert.assertNotNull(doubleArray81);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray81), "[10.0, 100.0]");
        org.junit.Assert.assertTrue("'" + double82 + "' != '" + 4050.0d + "'", double82 == 4050.0d);
        org.junit.Assert.assertTrue("'" + double83 + "' != '" + 4050.0d + "'", double83 == 4050.0d);
        org.junit.Assert.assertTrue("'" + double84 + "' != '" + 4050.0d + "'", double84 == 4050.0d);
        org.junit.Assert.assertTrue("'" + double85 + "' != '" + 4050.0d + "'", double85 == 4050.0d);
        org.junit.Assert.assertTrue("'" + double87 + "' != '" + 4050.0d + "'", double87 == 4050.0d);
    }

    @Test
    public void test13621() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest27.test13621");
        org.apache.commons.math.stat.descriptive.moment.SecondMoment secondMoment2 = new org.apache.commons.math.stat.descriptive.moment.SecondMoment();
        secondMoment2.increment(1.0d);
        double[] doubleArray8 = new double[] { (-1L), 0, 10L };
        secondMoment2.incrementAll(doubleArray8, 0, 0);
        double[] doubleArray14 = new double[] { 10, (byte) 100 };
        double double15 = secondMoment2.evaluate(doubleArray14);
        double double16 = secondMoment2.getResult();
        secondMoment2.increment((double) (short) -1);
        org.apache.commons.math.stat.descriptive.moment.SecondMoment secondMoment21 = new org.apache.commons.math.stat.descriptive.moment.SecondMoment();
        secondMoment21.increment(1.0d);
        double[] doubleArray27 = new double[] { (-1L), 0, 10L };
        secondMoment21.incrementAll(doubleArray27, 0, 0);
        double[] doubleArray33 = new double[] { 10, (byte) 100 };
        double double34 = secondMoment21.evaluate(doubleArray33);
        double double35 = secondMoment21.getResult();
        org.apache.commons.math.stat.descriptive.moment.Variance variance36 = new org.apache.commons.math.stat.descriptive.moment.Variance(false, secondMoment21);
        long long37 = secondMoment21.getN();
        org.apache.commons.math.stat.descriptive.moment.Variance variance38 = new org.apache.commons.math.stat.descriptive.moment.Variance(true, secondMoment21);
        org.apache.commons.math.stat.descriptive.moment.SecondMoment secondMoment39 = new org.apache.commons.math.stat.descriptive.moment.SecondMoment();
        secondMoment39.increment((double) ' ');
        org.apache.commons.math.stat.descriptive.moment.Variance variance42 = new org.apache.commons.math.stat.descriptive.moment.Variance(secondMoment39);
        secondMoment39.increment((double) (short) -1);
        secondMoment39.clear();
        secondMoment39.increment((double) 0L);
        org.apache.commons.math.stat.descriptive.moment.Variance variance48 = new org.apache.commons.math.stat.descriptive.moment.Variance(secondMoment39);
        org.apache.commons.math.stat.descriptive.moment.SecondMoment secondMoment49 = new org.apache.commons.math.stat.descriptive.moment.SecondMoment();
        secondMoment49.increment(1.0d);
        double[] doubleArray55 = new double[] { (-1L), 0, 10L };
        secondMoment49.incrementAll(doubleArray55, 0, 0);
        variance48.incrementAll(doubleArray55);
        org.apache.commons.math.stat.descriptive.moment.SecondMoment secondMoment60 = new org.apache.commons.math.stat.descriptive.moment.SecondMoment();
        secondMoment60.increment((double) ' ');
        org.apache.commons.math.stat.descriptive.moment.Variance variance63 = new org.apache.commons.math.stat.descriptive.moment.Variance(secondMoment60);
        secondMoment60.increment((double) (short) -1);
        secondMoment60.clear();
        secondMoment60.increment((double) 0L);
        org.apache.commons.math.stat.descriptive.moment.Variance variance69 = new org.apache.commons.math.stat.descriptive.moment.Variance(secondMoment60);
        org.apache.commons.math.stat.descriptive.moment.SecondMoment secondMoment70 = new org.apache.commons.math.stat.descriptive.moment.SecondMoment();
        secondMoment70.increment(1.0d);
        secondMoment70.increment((double) (short) 0);
        double double75 = secondMoment70.getResult();
        org.apache.commons.math.stat.descriptive.moment.SecondMoment secondMoment76 = new org.apache.commons.math.stat.descriptive.moment.SecondMoment();
        secondMoment76.increment(1.0d);
        double[] doubleArray82 = new double[] { (-1L), 0, 10L };
        secondMoment76.incrementAll(doubleArray82, 0, 0);
        double double86 = secondMoment70.evaluate(doubleArray82);
        double double87 = secondMoment60.evaluate(doubleArray82);
        double double88 = variance48.evaluate(doubleArray82);
        variance38.incrementAll(doubleArray82);
        secondMoment2.incrementAll(doubleArray82);
        double double91 = secondMoment2.getResult();
        secondMoment2.clear();
        double double93 = secondMoment2.getResult();
        org.apache.commons.math.stat.descriptive.moment.Variance variance94 = new org.apache.commons.math.stat.descriptive.moment.Variance(true, secondMoment2);
        org.apache.commons.math.stat.descriptive.moment.Variance variance95 = new org.apache.commons.math.stat.descriptive.moment.Variance(secondMoment2);
        org.apache.commons.math.stat.descriptive.moment.Variance variance96 = new org.apache.commons.math.stat.descriptive.moment.Variance(true, secondMoment2);
        org.junit.Assert.assertNotNull(doubleArray8);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray8), "[-1.0, 0.0, 10.0]");
        org.junit.Assert.assertNotNull(doubleArray14);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray14), "[10.0, 100.0]");
        org.junit.Assert.assertTrue("'" + double15 + "' != '" + 4050.0d + "'", double15 == 4050.0d);
        org.junit.Assert.assertTrue("'" + double16 + "' != '" + 4050.0d + "'", double16 == 4050.0d);
        org.junit.Assert.assertNotNull(doubleArray27);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray27), "[-1.0, 0.0, 10.0]");
        org.junit.Assert.assertNotNull(doubleArray33);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray33), "[10.0, 100.0]");
        org.junit.Assert.assertTrue("'" + double34 + "' != '" + 4050.0d + "'", double34 == 4050.0d);
        org.junit.Assert.assertTrue("'" + double35 + "' != '" + 4050.0d + "'", double35 == 4050.0d);
        org.junit.Assert.assertTrue("'" + long37 + "' != '" + 2L + "'", long37 == 2L);
        org.junit.Assert.assertNotNull(doubleArray55);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray55), "[-1.0, 0.0, 10.0]");
        org.junit.Assert.assertTrue("'" + double75 + "' != '" + 0.5d + "'", double75 == 0.5d);
        org.junit.Assert.assertNotNull(doubleArray82);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray82), "[-1.0, 0.0, 10.0]");
        org.junit.Assert.assertTrue("'" + double86 + "' != '" + 74.0d + "'", double86 == 74.0d);
        org.junit.Assert.assertTrue("'" + double87 + "' != '" + 74.0d + "'", double87 == 74.0d);
        org.junit.Assert.assertTrue("'" + double88 + "' != '" + 37.0d + "'", double88 == 37.0d);
        org.junit.Assert.assertTrue("'" + double91 + "' != '" + 7881.333333333333d + "'", double91 == 7881.333333333333d);
        org.junit.Assert.assertTrue(Double.isNaN(double93));
    }

    @Test
    public void test13622() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest27.test13622");
        org.apache.commons.math.stat.descriptive.moment.SecondMoment secondMoment0 = new org.apache.commons.math.stat.descriptive.moment.SecondMoment();
        secondMoment0.increment(1.0d);
        secondMoment0.increment((double) (short) 0);
        double double5 = secondMoment0.getResult();
        org.apache.commons.math.stat.descriptive.moment.SecondMoment secondMoment6 = new org.apache.commons.math.stat.descriptive.moment.SecondMoment();
        secondMoment6.increment(1.0d);
        secondMoment6.increment((double) (short) 0);
        double double11 = secondMoment6.getResult();
        org.apache.commons.math.stat.descriptive.moment.SecondMoment secondMoment12 = new org.apache.commons.math.stat.descriptive.moment.SecondMoment();
        secondMoment12.increment(1.0d);
        double[] doubleArray18 = new double[] { (-1L), 0, 10L };
        secondMoment12.incrementAll(doubleArray18, 0, 0);
        double double22 = secondMoment6.evaluate(doubleArray18);
        double[] doubleArray23 = new double[] {};
        secondMoment6.incrementAll(doubleArray23);
        secondMoment0.incrementAll(doubleArray23);
        secondMoment0.increment((double) 2L);
        org.apache.commons.math.stat.descriptive.moment.Variance variance28 = new org.apache.commons.math.stat.descriptive.moment.Variance(secondMoment0);
        secondMoment0.increment(24.666666666666668d);
        secondMoment0.clear();
        secondMoment0.increment((double) (byte) 10);
        secondMoment0.increment(1.5803546165550332E27d);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.5d + "'", double5 == 0.5d);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 0.5d + "'", double11 == 0.5d);
        org.junit.Assert.assertNotNull(doubleArray18);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray18), "[-1.0, 0.0, 10.0]");
        org.junit.Assert.assertTrue("'" + double22 + "' != '" + 74.0d + "'", double22 == 74.0d);
        org.junit.Assert.assertNotNull(doubleArray23);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray23), "[]");
    }

    @Test
    public void test13623() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest27.test13623");
        org.apache.commons.math.stat.descriptive.moment.SecondMoment secondMoment0 = new org.apache.commons.math.stat.descriptive.moment.SecondMoment();
        secondMoment0.increment(1.0d);
        double[] doubleArray6 = new double[] { (-1L), 0, 10L };
        secondMoment0.incrementAll(doubleArray6, 0, 0);
        double[] doubleArray12 = new double[] { 10, (byte) 100 };
        double double13 = secondMoment0.evaluate(doubleArray12);
        secondMoment0.clear();
        secondMoment0.increment((double) (byte) 0);
        secondMoment0.clear();
        secondMoment0.increment(36.99999998509884d);
        org.junit.Assert.assertNotNull(doubleArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray6), "[-1.0, 0.0, 10.0]");
        org.junit.Assert.assertNotNull(doubleArray12);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray12), "[10.0, 100.0]");
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 4050.0d + "'", double13 == 4050.0d);
    }

    @Test
    public void test13624() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest27.test13624");
        org.apache.commons.math.stat.descriptive.moment.SecondMoment secondMoment2 = new org.apache.commons.math.stat.descriptive.moment.SecondMoment();
        secondMoment2.increment((double) ' ');
        org.apache.commons.math.stat.descriptive.moment.Variance variance5 = new org.apache.commons.math.stat.descriptive.moment.Variance(secondMoment2);
        secondMoment2.increment((double) '4');
        double double8 = secondMoment2.getResult();
        secondMoment2.increment((double) (short) 0);
        org.apache.commons.math.stat.descriptive.moment.Variance variance11 = new org.apache.commons.math.stat.descriptive.moment.Variance(secondMoment2);
        org.apache.commons.math.stat.descriptive.moment.Variance variance12 = new org.apache.commons.math.stat.descriptive.moment.Variance(false, secondMoment2);
        org.apache.commons.math.stat.descriptive.moment.Variance variance13 = new org.apache.commons.math.stat.descriptive.moment.Variance(true, secondMoment2);
        secondMoment2.clear();
        org.apache.commons.math.stat.descriptive.moment.SecondMoment secondMoment15 = new org.apache.commons.math.stat.descriptive.moment.SecondMoment();
        secondMoment15.increment(1.0d);
        secondMoment15.increment((double) 10L);
        org.apache.commons.math.stat.descriptive.moment.SecondMoment secondMoment20 = new org.apache.commons.math.stat.descriptive.moment.SecondMoment();
        secondMoment20.increment(1.0d);
        secondMoment20.increment((double) (short) 0);
        double double25 = secondMoment20.getResult();
        org.apache.commons.math.stat.descriptive.moment.SecondMoment secondMoment26 = new org.apache.commons.math.stat.descriptive.moment.SecondMoment();
        secondMoment26.increment(1.0d);
        secondMoment26.increment((double) (short) 0);
        double double31 = secondMoment26.getResult();
        org.apache.commons.math.stat.descriptive.moment.SecondMoment secondMoment32 = new org.apache.commons.math.stat.descriptive.moment.SecondMoment();
        secondMoment32.increment(1.0d);
        double[] doubleArray38 = new double[] { (-1L), 0, 10L };
        secondMoment32.incrementAll(doubleArray38, 0, 0);
        double double42 = secondMoment26.evaluate(doubleArray38);
        double[] doubleArray43 = new double[] {};
        secondMoment26.incrementAll(doubleArray43);
        secondMoment20.incrementAll(doubleArray43);
        secondMoment20.increment((double) 2L);
        org.apache.commons.math.stat.descriptive.moment.Variance variance48 = new org.apache.commons.math.stat.descriptive.moment.Variance(secondMoment20);
        org.apache.commons.math.stat.descriptive.moment.SecondMoment secondMoment49 = new org.apache.commons.math.stat.descriptive.moment.SecondMoment();
        secondMoment49.increment(1.0d);
        double[] doubleArray55 = new double[] { (-1L), 0, 10L };
        secondMoment49.incrementAll(doubleArray55, 0, 0);
        double[] doubleArray61 = new double[] { 10, (byte) 100 };
        double double62 = secondMoment49.evaluate(doubleArray61);
        double double63 = variance48.evaluate(doubleArray61);
        double double64 = secondMoment15.evaluate(doubleArray61);
        org.apache.commons.math.stat.descriptive.moment.SecondMoment secondMoment65 = new org.apache.commons.math.stat.descriptive.moment.SecondMoment();
        secondMoment65.increment(1.0d);
        secondMoment65.increment((double) (short) 0);
        double double70 = secondMoment65.getResult();
        org.apache.commons.math.stat.descriptive.moment.SecondMoment secondMoment71 = new org.apache.commons.math.stat.descriptive.moment.SecondMoment();
        secondMoment71.increment(1.0d);
        secondMoment71.increment((double) (short) 0);
        double double76 = secondMoment71.getResult();
        org.apache.commons.math.stat.descriptive.moment.SecondMoment secondMoment77 = new org.apache.commons.math.stat.descriptive.moment.SecondMoment();
        secondMoment77.increment(1.0d);
        double[] doubleArray83 = new double[] { (-1L), 0, 10L };
        secondMoment77.incrementAll(doubleArray83, 0, 0);
        double double87 = secondMoment71.evaluate(doubleArray83);
        double[] doubleArray88 = new double[] {};
        secondMoment71.incrementAll(doubleArray88);
        secondMoment65.incrementAll(doubleArray88);
        double double91 = secondMoment15.evaluate(doubleArray88);
        secondMoment2.incrementAll(doubleArray88);
        double double93 = secondMoment2.getResult();
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 200.0d + "'", double8 == 200.0d);
        org.junit.Assert.assertTrue("'" + double25 + "' != '" + 0.5d + "'", double25 == 0.5d);
        org.junit.Assert.assertTrue("'" + double31 + "' != '" + 0.5d + "'", double31 == 0.5d);
        org.junit.Assert.assertNotNull(doubleArray38);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray38), "[-1.0, 0.0, 10.0]");
        org.junit.Assert.assertTrue("'" + double42 + "' != '" + 74.0d + "'", double42 == 74.0d);
        org.junit.Assert.assertNotNull(doubleArray43);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray43), "[]");
        org.junit.Assert.assertNotNull(doubleArray55);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray55), "[-1.0, 0.0, 10.0]");
        org.junit.Assert.assertNotNull(doubleArray61);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray61), "[10.0, 100.0]");
        org.junit.Assert.assertTrue("'" + double62 + "' != '" + 4050.0d + "'", double62 == 4050.0d);
        org.junit.Assert.assertTrue("'" + double63 + "' != '" + 4050.0d + "'", double63 == 4050.0d);
        org.junit.Assert.assertTrue("'" + double64 + "' != '" + 4050.0d + "'", double64 == 4050.0d);
        org.junit.Assert.assertTrue("'" + double70 + "' != '" + 0.5d + "'", double70 == 0.5d);
        org.junit.Assert.assertTrue("'" + double76 + "' != '" + 0.5d + "'", double76 == 0.5d);
        org.junit.Assert.assertNotNull(doubleArray83);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray83), "[-1.0, 0.0, 10.0]");
        org.junit.Assert.assertTrue("'" + double87 + "' != '" + 74.0d + "'", double87 == 74.0d);
        org.junit.Assert.assertNotNull(doubleArray88);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray88), "[]");
        org.junit.Assert.assertTrue("'" + double91 + "' != '" + 4050.0d + "'", double91 == 4050.0d);
        org.junit.Assert.assertTrue(Double.isNaN(double93));
    }

    @Test
    public void test13625() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest27.test13625");
        org.apache.commons.math.stat.descriptive.moment.SecondMoment secondMoment1 = new org.apache.commons.math.stat.descriptive.moment.SecondMoment();
        secondMoment1.increment(1.0d);
        double[] doubleArray7 = new double[] { (-1L), 0, 10L };
        secondMoment1.incrementAll(doubleArray7, 0, 0);
        double[] doubleArray13 = new double[] { 10, (byte) 100 };
        double double14 = secondMoment1.evaluate(doubleArray13);
        double double15 = secondMoment1.getResult();
        secondMoment1.increment((double) (short) -1);
        secondMoment1.clear();
        org.apache.commons.math.stat.descriptive.moment.Variance variance19 = new org.apache.commons.math.stat.descriptive.moment.Variance(true, secondMoment1);
        java.lang.Class<?> wildcardClass20 = secondMoment1.getClass();
        org.junit.Assert.assertNotNull(doubleArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray7), "[-1.0, 0.0, 10.0]");
        org.junit.Assert.assertNotNull(doubleArray13);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray13), "[10.0, 100.0]");
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + 4050.0d + "'", double14 == 4050.0d);
        org.junit.Assert.assertTrue("'" + double15 + "' != '" + 4050.0d + "'", double15 == 4050.0d);
        org.junit.Assert.assertNotNull(wildcardClass20);
    }

    @Test
    public void test13626() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest27.test13626");
        org.apache.commons.math.stat.descriptive.moment.SecondMoment secondMoment1 = new org.apache.commons.math.stat.descriptive.moment.SecondMoment();
        secondMoment1.increment((double) ' ');
        org.apache.commons.math.stat.descriptive.moment.Variance variance4 = new org.apache.commons.math.stat.descriptive.moment.Variance(secondMoment1);
        secondMoment1.increment((double) (short) -1);
        long long7 = secondMoment1.getN();
        double double8 = secondMoment1.getResult();
        secondMoment1.increment((double) 1.0f);
        org.apache.commons.math.stat.descriptive.moment.Variance variance11 = new org.apache.commons.math.stat.descriptive.moment.Variance(false, secondMoment1);
        double double12 = variance11.getResult();
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + 2L + "'", long7 == 2L);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 544.5d + "'", double8 == 544.5d);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 228.2222222222222d + "'", double12 == 228.2222222222222d);
    }

    @Test
    public void test13627() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest27.test13627");
        org.apache.commons.math.stat.descriptive.moment.SecondMoment secondMoment1 = new org.apache.commons.math.stat.descriptive.moment.SecondMoment();
        secondMoment1.increment(1.0d);
        double[] doubleArray7 = new double[] { (-1L), 0, 10L };
        secondMoment1.incrementAll(doubleArray7, 0, 0);
        double[] doubleArray13 = new double[] { 10, (byte) 100 };
        double double14 = secondMoment1.evaluate(doubleArray13);
        org.apache.commons.math.stat.descriptive.moment.SecondMoment secondMoment16 = new org.apache.commons.math.stat.descriptive.moment.SecondMoment();
        secondMoment16.increment((double) ' ');
        org.apache.commons.math.stat.descriptive.moment.Variance variance19 = new org.apache.commons.math.stat.descriptive.moment.Variance(secondMoment16);
        secondMoment16.increment((double) (short) -1);
        secondMoment16.clear();
        secondMoment16.increment((double) 0L);
        org.apache.commons.math.stat.descriptive.moment.Variance variance25 = new org.apache.commons.math.stat.descriptive.moment.Variance(false, secondMoment16);
        boolean boolean26 = secondMoment1.equals((java.lang.Object) secondMoment16);
        org.apache.commons.math.stat.descriptive.moment.Variance variance27 = new org.apache.commons.math.stat.descriptive.moment.Variance(false, secondMoment16);
        org.apache.commons.math.stat.descriptive.moment.Variance variance28 = new org.apache.commons.math.stat.descriptive.moment.Variance();
        org.apache.commons.math.stat.descriptive.moment.SecondMoment secondMoment29 = new org.apache.commons.math.stat.descriptive.moment.SecondMoment();
        secondMoment29.increment(1.0d);
        secondMoment29.increment((double) (short) 0);
        double double34 = secondMoment29.getResult();
        org.apache.commons.math.stat.descriptive.moment.SecondMoment secondMoment35 = new org.apache.commons.math.stat.descriptive.moment.SecondMoment();
        secondMoment35.increment(1.0d);
        double[] doubleArray41 = new double[] { (-1L), 0, 10L };
        secondMoment35.incrementAll(doubleArray41, 0, 0);
        double double45 = secondMoment29.evaluate(doubleArray41);
        double[] doubleArray46 = new double[] {};
        secondMoment29.incrementAll(doubleArray46);
        double double50 = variance28.evaluate(doubleArray46, (int) (byte) 0, 0);
        long long51 = variance28.getN();
        org.apache.commons.math.stat.descriptive.moment.SecondMoment secondMoment52 = new org.apache.commons.math.stat.descriptive.moment.SecondMoment();
        secondMoment52.increment(1.0d);
        secondMoment52.increment((double) (short) 0);
        double double57 = secondMoment52.getResult();
        org.apache.commons.math.stat.descriptive.moment.SecondMoment secondMoment58 = new org.apache.commons.math.stat.descriptive.moment.SecondMoment();
        secondMoment58.increment(1.0d);
        double[] doubleArray64 = new double[] { (-1L), 0, 10L };
        secondMoment58.incrementAll(doubleArray64, 0, 0);
        double double68 = secondMoment52.evaluate(doubleArray64);
        variance28.incrementAll(doubleArray64);
        double double71 = variance27.evaluate(doubleArray64, (double) '#');
        variance27.increment((double) (short) 10);
        variance27.clear();
        org.junit.Assert.assertNotNull(doubleArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray7), "[-1.0, 0.0, 10.0]");
        org.junit.Assert.assertNotNull(doubleArray13);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray13), "[10.0, 100.0]");
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + 4050.0d + "'", double14 == 4050.0d);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
        org.junit.Assert.assertTrue("'" + double34 + "' != '" + 0.5d + "'", double34 == 0.5d);
        org.junit.Assert.assertNotNull(doubleArray41);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray41), "[-1.0, 0.0, 10.0]");
        org.junit.Assert.assertTrue("'" + double45 + "' != '" + 74.0d + "'", double45 == 74.0d);
        org.junit.Assert.assertNotNull(doubleArray46);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray46), "[]");
        org.junit.Assert.assertTrue(Double.isNaN(double50));
        org.junit.Assert.assertTrue("'" + long51 + "' != '" + 0L + "'", long51 == 0L);
        org.junit.Assert.assertTrue("'" + double57 + "' != '" + 0.5d + "'", double57 == 0.5d);
        org.junit.Assert.assertNotNull(doubleArray64);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray64), "[-1.0, 0.0, 10.0]");
        org.junit.Assert.assertTrue("'" + double68 + "' != '" + 74.0d + "'", double68 == 74.0d);
        org.junit.Assert.assertTrue("'" + double71 + "' != '" + 24.666666666666668d + "'", double71 == 24.666666666666668d);
    }

    @Test
    public void test13628() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest27.test13628");
        org.apache.commons.math.stat.descriptive.moment.SecondMoment secondMoment0 = new org.apache.commons.math.stat.descriptive.moment.SecondMoment();
        secondMoment0.increment((double) ' ');
        secondMoment0.increment((double) (-1.0f));
        double double5 = secondMoment0.getResult();
        secondMoment0.clear();
        org.apache.commons.math.stat.descriptive.moment.Variance variance7 = new org.apache.commons.math.stat.descriptive.moment.Variance(secondMoment0);
        double double8 = variance7.getResult();
        org.apache.commons.math.stat.descriptive.moment.SecondMoment secondMoment9 = new org.apache.commons.math.stat.descriptive.moment.SecondMoment();
        secondMoment9.increment(1.0d);
        double[] doubleArray15 = new double[] { (-1L), 0, 10L };
        secondMoment9.incrementAll(doubleArray15, 0, 0);
        org.apache.commons.math.stat.descriptive.moment.Variance variance19 = new org.apache.commons.math.stat.descriptive.moment.Variance(secondMoment9);
        org.apache.commons.math.stat.descriptive.moment.SecondMoment secondMoment20 = new org.apache.commons.math.stat.descriptive.moment.SecondMoment();
        secondMoment20.increment(1.0d);
        org.apache.commons.math.stat.descriptive.moment.SecondMoment secondMoment23 = new org.apache.commons.math.stat.descriptive.moment.SecondMoment();
        secondMoment23.increment(1.0d);
        secondMoment23.increment((double) (short) 0);
        double double28 = secondMoment23.getResult();
        org.apache.commons.math.stat.descriptive.moment.SecondMoment secondMoment29 = new org.apache.commons.math.stat.descriptive.moment.SecondMoment();
        secondMoment29.increment(1.0d);
        double[] doubleArray35 = new double[] { (-1L), 0, 10L };
        secondMoment29.incrementAll(doubleArray35, 0, 0);
        double double39 = secondMoment23.evaluate(doubleArray35);
        double[] doubleArray40 = new double[] {};
        secondMoment23.incrementAll(doubleArray40);
        double double42 = secondMoment20.evaluate(doubleArray40);
        double double43 = variance19.evaluate(doubleArray40);
        long long44 = variance19.getN();
        variance19.setBiasCorrected(true);
        org.apache.commons.math.stat.descriptive.moment.SecondMoment secondMoment48 = new org.apache.commons.math.stat.descriptive.moment.SecondMoment();
        secondMoment48.increment(1.0d);
        secondMoment48.increment((double) (short) 0);
        double double53 = secondMoment48.getResult();
        secondMoment48.clear();
        org.apache.commons.math.stat.descriptive.moment.Variance variance55 = new org.apache.commons.math.stat.descriptive.moment.Variance(false, secondMoment48);
        double double56 = secondMoment48.getResult();
        secondMoment48.increment(0.0d);
        org.apache.commons.math.stat.descriptive.moment.Variance variance59 = new org.apache.commons.math.stat.descriptive.moment.Variance();
        org.apache.commons.math.stat.descriptive.moment.SecondMoment secondMoment60 = new org.apache.commons.math.stat.descriptive.moment.SecondMoment();
        secondMoment60.increment((double) ' ');
        org.apache.commons.math.stat.descriptive.moment.Variance variance63 = new org.apache.commons.math.stat.descriptive.moment.Variance(secondMoment60);
        secondMoment60.increment((double) (short) -1);
        secondMoment60.clear();
        secondMoment60.increment((double) 0L);
        org.apache.commons.math.stat.descriptive.moment.Variance variance69 = new org.apache.commons.math.stat.descriptive.moment.Variance(secondMoment60);
        org.apache.commons.math.stat.descriptive.moment.SecondMoment secondMoment70 = new org.apache.commons.math.stat.descriptive.moment.SecondMoment();
        secondMoment70.increment(1.0d);
        double[] doubleArray76 = new double[] { (-1L), 0, 10L };
        secondMoment70.incrementAll(doubleArray76, 0, 0);
        variance69.incrementAll(doubleArray76);
        variance59.incrementAll(doubleArray76);
        double double82 = secondMoment48.evaluate(doubleArray76);
        double double83 = variance19.evaluate(doubleArray76);
        double double85 = variance7.evaluate(doubleArray76, 55.0d);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 544.5d + "'", double5 == 544.5d);
        org.junit.Assert.assertTrue(Double.isNaN(double8));
        org.junit.Assert.assertNotNull(doubleArray15);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray15), "[-1.0, 0.0, 10.0]");
        org.junit.Assert.assertTrue("'" + double28 + "' != '" + 0.5d + "'", double28 == 0.5d);
        org.junit.Assert.assertNotNull(doubleArray35);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray35), "[-1.0, 0.0, 10.0]");
        org.junit.Assert.assertTrue("'" + double39 + "' != '" + 74.0d + "'", double39 == 74.0d);
        org.junit.Assert.assertNotNull(doubleArray40);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray40), "[]");
        org.junit.Assert.assertTrue("'" + double42 + "' != '" + 0.0d + "'", double42 == 0.0d);
        org.junit.Assert.assertTrue(Double.isNaN(double43));
        org.junit.Assert.assertTrue("'" + long44 + "' != '" + 1L + "'", long44 == 1L);
        org.junit.Assert.assertTrue("'" + double53 + "' != '" + 0.5d + "'", double53 == 0.5d);
        org.junit.Assert.assertTrue(Double.isNaN(double56));
        org.junit.Assert.assertNotNull(doubleArray76);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray76), "[-1.0, 0.0, 10.0]");
        org.junit.Assert.assertTrue("'" + double82 + "' != '" + 74.0d + "'", double82 == 74.0d);
        org.junit.Assert.assertTrue("'" + double83 + "' != '" + 37.0d + "'", double83 == 37.0d);
        org.junit.Assert.assertTrue("'" + double85 + "' != '" + 37.0d + "'", double85 == 37.0d);
    }

    @Test
    public void test13629() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest27.test13629");
        org.apache.commons.math.stat.descriptive.moment.SecondMoment secondMoment1 = new org.apache.commons.math.stat.descriptive.moment.SecondMoment();
        secondMoment1.increment((double) ' ');
        org.apache.commons.math.stat.descriptive.moment.Variance variance4 = new org.apache.commons.math.stat.descriptive.moment.Variance(secondMoment1);
        org.apache.commons.math.stat.descriptive.moment.Variance variance5 = new org.apache.commons.math.stat.descriptive.moment.Variance(false, secondMoment1);
        variance5.setBiasCorrected(false);
        org.apache.commons.math.stat.descriptive.moment.Variance variance8 = new org.apache.commons.math.stat.descriptive.moment.Variance();
        org.apache.commons.math.stat.descriptive.moment.SecondMoment secondMoment9 = new org.apache.commons.math.stat.descriptive.moment.SecondMoment();
        secondMoment9.increment(1.0d);
        secondMoment9.increment((double) (short) 0);
        double double14 = secondMoment9.getResult();
        org.apache.commons.math.stat.descriptive.moment.SecondMoment secondMoment15 = new org.apache.commons.math.stat.descriptive.moment.SecondMoment();
        secondMoment15.increment(1.0d);
        double[] doubleArray21 = new double[] { (-1L), 0, 10L };
        secondMoment15.incrementAll(doubleArray21, 0, 0);
        double double25 = secondMoment9.evaluate(doubleArray21);
        double[] doubleArray26 = new double[] {};
        secondMoment9.incrementAll(doubleArray26);
        double double30 = variance8.evaluate(doubleArray26, (int) (byte) 0, 0);
        long long31 = variance8.getN();
        org.apache.commons.math.stat.descriptive.moment.SecondMoment secondMoment32 = new org.apache.commons.math.stat.descriptive.moment.SecondMoment();
        secondMoment32.increment(1.0d);
        secondMoment32.increment((double) (short) 0);
        double double37 = secondMoment32.getResult();
        org.apache.commons.math.stat.descriptive.moment.SecondMoment secondMoment38 = new org.apache.commons.math.stat.descriptive.moment.SecondMoment();
        secondMoment38.increment(1.0d);
        double[] doubleArray44 = new double[] { (-1L), 0, 10L };
        secondMoment38.incrementAll(doubleArray44, 0, 0);
        double double48 = secondMoment32.evaluate(doubleArray44);
        variance8.incrementAll(doubleArray44);
        long long50 = variance8.getN();
        org.apache.commons.math.stat.descriptive.moment.SecondMoment secondMoment51 = new org.apache.commons.math.stat.descriptive.moment.SecondMoment();
        secondMoment51.increment(1.0d);
        org.apache.commons.math.stat.descriptive.moment.SecondMoment secondMoment54 = new org.apache.commons.math.stat.descriptive.moment.SecondMoment();
        secondMoment54.increment(1.0d);
        secondMoment54.increment((double) (short) 0);
        double double59 = secondMoment54.getResult();
        org.apache.commons.math.stat.descriptive.moment.SecondMoment secondMoment60 = new org.apache.commons.math.stat.descriptive.moment.SecondMoment();
        secondMoment60.increment(1.0d);
        double[] doubleArray66 = new double[] { (-1L), 0, 10L };
        secondMoment60.incrementAll(doubleArray66, 0, 0);
        double double70 = secondMoment54.evaluate(doubleArray66);
        double[] doubleArray71 = new double[] {};
        secondMoment54.incrementAll(doubleArray71);
        double double73 = secondMoment51.evaluate(doubleArray71);
        variance8.incrementAll(doubleArray71);
        double double77 = variance5.evaluate(doubleArray71, (int) (byte) 0, 0);
        boolean boolean78 = variance5.isBiasCorrected();
        double double79 = variance5.getResult();
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + 0.5d + "'", double14 == 0.5d);
        org.junit.Assert.assertNotNull(doubleArray21);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray21), "[-1.0, 0.0, 10.0]");
        org.junit.Assert.assertTrue("'" + double25 + "' != '" + 74.0d + "'", double25 == 74.0d);
        org.junit.Assert.assertNotNull(doubleArray26);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray26), "[]");
        org.junit.Assert.assertTrue(Double.isNaN(double30));
        org.junit.Assert.assertTrue("'" + long31 + "' != '" + 0L + "'", long31 == 0L);
        org.junit.Assert.assertTrue("'" + double37 + "' != '" + 0.5d + "'", double37 == 0.5d);
        org.junit.Assert.assertNotNull(doubleArray44);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray44), "[-1.0, 0.0, 10.0]");
        org.junit.Assert.assertTrue("'" + double48 + "' != '" + 74.0d + "'", double48 == 74.0d);
        org.junit.Assert.assertTrue("'" + long50 + "' != '" + 3L + "'", long50 == 3L);
        org.junit.Assert.assertTrue("'" + double59 + "' != '" + 0.5d + "'", double59 == 0.5d);
        org.junit.Assert.assertNotNull(doubleArray66);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray66), "[-1.0, 0.0, 10.0]");
        org.junit.Assert.assertTrue("'" + double70 + "' != '" + 74.0d + "'", double70 == 74.0d);
        org.junit.Assert.assertNotNull(doubleArray71);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray71), "[]");
        org.junit.Assert.assertTrue("'" + double73 + "' != '" + 0.0d + "'", double73 == 0.0d);
        org.junit.Assert.assertTrue(Double.isNaN(double77));
        org.junit.Assert.assertTrue("'" + boolean78 + "' != '" + false + "'", boolean78 == false);
        org.junit.Assert.assertTrue("'" + double79 + "' != '" + 0.0d + "'", double79 == 0.0d);
    }

    @Test
    public void test13630() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest27.test13630");
        org.apache.commons.math.stat.descriptive.moment.SecondMoment secondMoment0 = new org.apache.commons.math.stat.descriptive.moment.SecondMoment();
        secondMoment0.increment((double) ' ');
        org.apache.commons.math.stat.descriptive.moment.Variance variance3 = new org.apache.commons.math.stat.descriptive.moment.Variance(secondMoment0);
        secondMoment0.increment((double) (short) -1);
        secondMoment0.clear();
        secondMoment0.increment((double) 0L);
        org.apache.commons.math.stat.descriptive.moment.Variance variance9 = new org.apache.commons.math.stat.descriptive.moment.Variance(secondMoment0);
        double double10 = secondMoment0.getResult();
        secondMoment0.increment((double) 'a');
        org.apache.commons.math.stat.descriptive.moment.Variance variance13 = new org.apache.commons.math.stat.descriptive.moment.Variance(secondMoment0);
        org.apache.commons.math.stat.descriptive.moment.SecondMoment secondMoment14 = new org.apache.commons.math.stat.descriptive.moment.SecondMoment();
        secondMoment14.increment((double) ' ');
        secondMoment14.increment((double) (-1.0f));
        double double19 = secondMoment14.getResult();
        secondMoment14.clear();
        org.apache.commons.math.stat.descriptive.moment.Variance variance21 = new org.apache.commons.math.stat.descriptive.moment.Variance(secondMoment14);
        double double22 = variance21.getResult();
        org.apache.commons.math.stat.descriptive.moment.Variance variance24 = new org.apache.commons.math.stat.descriptive.moment.Variance(true);
        long long25 = variance24.getN();
        org.apache.commons.math.stat.descriptive.moment.SecondMoment secondMoment26 = new org.apache.commons.math.stat.descriptive.moment.SecondMoment();
        secondMoment26.increment(1.0d);
        secondMoment26.increment((double) (short) 0);
        double double31 = secondMoment26.getResult();
        org.apache.commons.math.stat.descriptive.moment.SecondMoment secondMoment32 = new org.apache.commons.math.stat.descriptive.moment.SecondMoment();
        secondMoment32.increment(1.0d);
        double[] doubleArray38 = new double[] { (-1L), 0, 10L };
        secondMoment32.incrementAll(doubleArray38, 0, 0);
        double double42 = secondMoment26.evaluate(doubleArray38);
        variance24.incrementAll(doubleArray38);
        double double44 = variance21.evaluate(doubleArray38);
        // The following exception was thrown during execution in test generation
        try {
            variance13.incrementAll(doubleArray38, (int) (short) 1, (-1));
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: length cannot be negative");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 0.0d + "'", double10 == 0.0d);
        org.junit.Assert.assertTrue("'" + double19 + "' != '" + 544.5d + "'", double19 == 544.5d);
        org.junit.Assert.assertTrue(Double.isNaN(double22));
        org.junit.Assert.assertTrue("'" + long25 + "' != '" + 0L + "'", long25 == 0L);
        org.junit.Assert.assertTrue("'" + double31 + "' != '" + 0.5d + "'", double31 == 0.5d);
        org.junit.Assert.assertNotNull(doubleArray38);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray38), "[-1.0, 0.0, 10.0]");
        org.junit.Assert.assertTrue("'" + double42 + "' != '" + 74.0d + "'", double42 == 74.0d);
        org.junit.Assert.assertTrue("'" + double44 + "' != '" + 37.0d + "'", double44 == 37.0d);
    }

    @Test
    public void test13631() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest27.test13631");
        org.apache.commons.math.stat.descriptive.moment.SecondMoment secondMoment0 = new org.apache.commons.math.stat.descriptive.moment.SecondMoment();
        org.apache.commons.math.stat.descriptive.moment.SecondMoment secondMoment2 = new org.apache.commons.math.stat.descriptive.moment.SecondMoment();
        secondMoment2.increment((double) ' ');
        org.apache.commons.math.stat.descriptive.moment.Variance variance5 = new org.apache.commons.math.stat.descriptive.moment.Variance(secondMoment2);
        secondMoment2.clear();
        org.apache.commons.math.stat.descriptive.moment.Variance variance7 = new org.apache.commons.math.stat.descriptive.moment.Variance(false, secondMoment2);
        variance7.increment(0.0d);
        variance7.increment(30671.375d);
        boolean boolean12 = secondMoment0.equals((java.lang.Object) variance7);
        long long13 = secondMoment0.getN();
        secondMoment0.increment(4575.782407407407d);
        secondMoment0.clear();
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertTrue("'" + long13 + "' != '" + 0L + "'", long13 == 0L);
    }

    @Test
    public void test13632() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest27.test13632");
        org.apache.commons.math.stat.descriptive.moment.SecondMoment secondMoment0 = new org.apache.commons.math.stat.descriptive.moment.SecondMoment();
        secondMoment0.increment(1.0d);
        secondMoment0.increment((double) (short) 0);
        double double5 = secondMoment0.getResult();
        org.apache.commons.math.stat.descriptive.moment.SecondMoment secondMoment7 = new org.apache.commons.math.stat.descriptive.moment.SecondMoment();
        secondMoment7.increment(1.0d);
        double[] doubleArray13 = new double[] { (-1L), 0, 10L };
        secondMoment7.incrementAll(doubleArray13, 0, 0);
        double[] doubleArray19 = new double[] { 10, (byte) 100 };
        double double20 = secondMoment7.evaluate(doubleArray19);
        double double21 = secondMoment7.getResult();
        long long22 = secondMoment7.getN();
        long long23 = secondMoment7.getN();
        org.apache.commons.math.stat.descriptive.moment.Variance variance24 = new org.apache.commons.math.stat.descriptive.moment.Variance(true, secondMoment7);
        boolean boolean25 = secondMoment0.equals((java.lang.Object) secondMoment7);
        org.apache.commons.math.stat.descriptive.moment.Variance variance26 = new org.apache.commons.math.stat.descriptive.moment.Variance(secondMoment7);
        secondMoment7.increment((double) (byte) 0);
        secondMoment7.clear();
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.5d + "'", double5 == 0.5d);
        org.junit.Assert.assertNotNull(doubleArray13);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray13), "[-1.0, 0.0, 10.0]");
        org.junit.Assert.assertNotNull(doubleArray19);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray19), "[10.0, 100.0]");
        org.junit.Assert.assertTrue("'" + double20 + "' != '" + 4050.0d + "'", double20 == 4050.0d);
        org.junit.Assert.assertTrue("'" + double21 + "' != '" + 4050.0d + "'", double21 == 4050.0d);
        org.junit.Assert.assertTrue("'" + long22 + "' != '" + 2L + "'", long22 == 2L);
        org.junit.Assert.assertTrue("'" + long23 + "' != '" + 2L + "'", long23 == 2L);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
    }

    @Test
    public void test13633() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest27.test13633");
        org.apache.commons.math.stat.descriptive.moment.SecondMoment secondMoment2 = new org.apache.commons.math.stat.descriptive.moment.SecondMoment();
        secondMoment2.increment(1.0d);
        double[] doubleArray8 = new double[] { (-1L), 0, 10L };
        secondMoment2.incrementAll(doubleArray8, 0, 0);
        double[] doubleArray14 = new double[] { 10, (byte) 100 };
        double double15 = secondMoment2.evaluate(doubleArray14);
        double double16 = secondMoment2.getResult();
        org.apache.commons.math.stat.descriptive.moment.Variance variance17 = new org.apache.commons.math.stat.descriptive.moment.Variance(false, secondMoment2);
        long long18 = secondMoment2.getN();
        org.apache.commons.math.stat.descriptive.moment.Variance variance19 = new org.apache.commons.math.stat.descriptive.moment.Variance(true, secondMoment2);
        double double20 = secondMoment2.getResult();
        long long21 = secondMoment2.getN();
        secondMoment2.clear();
        secondMoment2.clear();
        long long24 = secondMoment2.getN();
        double double25 = secondMoment2.getResult();
        org.junit.Assert.assertNotNull(doubleArray8);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray8), "[-1.0, 0.0, 10.0]");
        org.junit.Assert.assertNotNull(doubleArray14);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray14), "[10.0, 100.0]");
        org.junit.Assert.assertTrue("'" + double15 + "' != '" + 4050.0d + "'", double15 == 4050.0d);
        org.junit.Assert.assertTrue("'" + double16 + "' != '" + 4050.0d + "'", double16 == 4050.0d);
        org.junit.Assert.assertTrue("'" + long18 + "' != '" + 2L + "'", long18 == 2L);
        org.junit.Assert.assertTrue("'" + double20 + "' != '" + 4050.0d + "'", double20 == 4050.0d);
        org.junit.Assert.assertTrue("'" + long21 + "' != '" + 2L + "'", long21 == 2L);
        org.junit.Assert.assertTrue("'" + long24 + "' != '" + 0L + "'", long24 == 0L);
        org.junit.Assert.assertTrue(Double.isNaN(double25));
    }

    @Test
    public void test13634() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest27.test13634");
        org.apache.commons.math.stat.descriptive.moment.SecondMoment secondMoment0 = new org.apache.commons.math.stat.descriptive.moment.SecondMoment();
        secondMoment0.increment((double) ' ');
        org.apache.commons.math.stat.descriptive.moment.Variance variance3 = new org.apache.commons.math.stat.descriptive.moment.Variance(secondMoment0);
        secondMoment0.increment((double) (short) -1);
        secondMoment0.clear();
        secondMoment0.increment((double) 0L);
        org.apache.commons.math.stat.descriptive.moment.Variance variance9 = new org.apache.commons.math.stat.descriptive.moment.Variance(secondMoment0);
        long long10 = variance9.getN();
        boolean boolean11 = variance9.isBiasCorrected();
        org.apache.commons.math.stat.descriptive.moment.SecondMoment secondMoment14 = new org.apache.commons.math.stat.descriptive.moment.SecondMoment();
        secondMoment14.increment(1.0d);
        double[] doubleArray20 = new double[] { (-1L), 0, 10L };
        secondMoment14.incrementAll(doubleArray20, 0, 0);
        double[] doubleArray26 = new double[] { 10, (byte) 100 };
        double double27 = secondMoment14.evaluate(doubleArray26);
        double double28 = secondMoment14.getResult();
        org.apache.commons.math.stat.descriptive.moment.Variance variance29 = new org.apache.commons.math.stat.descriptive.moment.Variance(false, secondMoment14);
        long long30 = secondMoment14.getN();
        org.apache.commons.math.stat.descriptive.moment.Variance variance31 = new org.apache.commons.math.stat.descriptive.moment.Variance(true, secondMoment14);
        boolean boolean32 = variance31.isBiasCorrected();
        variance31.setBiasCorrected(true);
        org.apache.commons.math.stat.descriptive.moment.SecondMoment secondMoment35 = new org.apache.commons.math.stat.descriptive.moment.SecondMoment();
        secondMoment35.increment((double) ' ');
        org.apache.commons.math.stat.descriptive.moment.Variance variance38 = new org.apache.commons.math.stat.descriptive.moment.Variance(secondMoment35);
        org.apache.commons.math.stat.descriptive.moment.SecondMoment secondMoment40 = new org.apache.commons.math.stat.descriptive.moment.SecondMoment();
        secondMoment40.increment(1.0d);
        double[] doubleArray46 = new double[] { (-1L), 0, 10L };
        secondMoment40.incrementAll(doubleArray46, 0, 0);
        double[] doubleArray52 = new double[] { 10, (byte) 100 };
        double double53 = secondMoment40.evaluate(doubleArray52);
        double double54 = secondMoment40.getResult();
        org.apache.commons.math.stat.descriptive.moment.Variance variance55 = new org.apache.commons.math.stat.descriptive.moment.Variance(false, secondMoment40);
        long long56 = secondMoment40.getN();
        org.apache.commons.math.stat.descriptive.moment.SecondMoment secondMoment57 = new org.apache.commons.math.stat.descriptive.moment.SecondMoment();
        secondMoment57.increment((double) ' ');
        secondMoment57.increment((double) (-1.0f));
        secondMoment57.clear();
        org.apache.commons.math.stat.descriptive.moment.SecondMoment secondMoment63 = new org.apache.commons.math.stat.descriptive.moment.SecondMoment();
        secondMoment63.increment(1.0d);
        double[] doubleArray69 = new double[] { (-1L), 0, 10L };
        secondMoment63.incrementAll(doubleArray69, 0, 0);
        org.apache.commons.math.stat.descriptive.moment.Variance variance73 = new org.apache.commons.math.stat.descriptive.moment.Variance(secondMoment63);
        long long74 = variance73.getN();
        org.apache.commons.math.stat.descriptive.moment.SecondMoment secondMoment75 = new org.apache.commons.math.stat.descriptive.moment.SecondMoment();
        secondMoment75.increment(1.0d);
        double[] doubleArray81 = new double[] { (-1L), 0, 10L };
        secondMoment75.incrementAll(doubleArray81, 0, 0);
        double double86 = variance73.evaluate(doubleArray81, (double) (short) -1);
        double double87 = secondMoment57.evaluate(doubleArray81);
        double double88 = secondMoment40.evaluate(doubleArray81);
        secondMoment35.incrementAll(doubleArray81);
        variance31.incrementAll(doubleArray81);
        // The following exception was thrown during execution in test generation
        try {
            double double94 = variance9.evaluate(doubleArray81, 3.925812428E7d, (int) (short) 100, (int) '#');
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: begin + length > values.length");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + 1L + "'", long10 == 1L);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertNotNull(doubleArray20);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray20), "[-1.0, 0.0, 10.0]");
        org.junit.Assert.assertNotNull(doubleArray26);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray26), "[10.0, 100.0]");
        org.junit.Assert.assertTrue("'" + double27 + "' != '" + 4050.0d + "'", double27 == 4050.0d);
        org.junit.Assert.assertTrue("'" + double28 + "' != '" + 4050.0d + "'", double28 == 4050.0d);
        org.junit.Assert.assertTrue("'" + long30 + "' != '" + 2L + "'", long30 == 2L);
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + true + "'", boolean32 == true);
        org.junit.Assert.assertNotNull(doubleArray46);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray46), "[-1.0, 0.0, 10.0]");
        org.junit.Assert.assertNotNull(doubleArray52);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray52), "[10.0, 100.0]");
        org.junit.Assert.assertTrue("'" + double53 + "' != '" + 4050.0d + "'", double53 == 4050.0d);
        org.junit.Assert.assertTrue("'" + double54 + "' != '" + 4050.0d + "'", double54 == 4050.0d);
        org.junit.Assert.assertTrue("'" + long56 + "' != '" + 2L + "'", long56 == 2L);
        org.junit.Assert.assertNotNull(doubleArray69);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray69), "[-1.0, 0.0, 10.0]");
        org.junit.Assert.assertTrue("'" + long74 + "' != '" + 1L + "'", long74 == 1L);
        org.junit.Assert.assertNotNull(doubleArray81);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray81), "[-1.0, 0.0, 10.0]");
        org.junit.Assert.assertTrue("'" + double86 + "' != '" + 37.0d + "'", double86 == 37.0d);
        org.junit.Assert.assertTrue("'" + double87 + "' != '" + 74.0d + "'", double87 == 74.0d);
        org.junit.Assert.assertTrue("'" + double88 + "' != '" + 74.0d + "'", double88 == 74.0d);
    }

    @Test
    public void test13635() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest27.test13635");
        org.apache.commons.math.stat.descriptive.moment.Variance variance1 = new org.apache.commons.math.stat.descriptive.moment.Variance(true);
        long long2 = variance1.getN();
        double double3 = variance1.getResult();
        variance1.increment((double) (short) 100);
        variance1.increment((double) 3L);
        variance1.clear();
        variance1.increment((double) (byte) -1);
        variance1.setBiasCorrected(false);
        org.apache.commons.math.stat.descriptive.moment.SecondMoment secondMoment13 = new org.apache.commons.math.stat.descriptive.moment.SecondMoment();
        secondMoment13.increment(1.0d);
        double[] doubleArray19 = new double[] { (-1L), 0, 10L };
        secondMoment13.incrementAll(doubleArray19, 0, 0);
        long long23 = secondMoment13.getN();
        org.apache.commons.math.stat.descriptive.moment.Variance variance24 = new org.apache.commons.math.stat.descriptive.moment.Variance(secondMoment13);
        secondMoment13.increment(10.0d);
        secondMoment13.clear();
        org.apache.commons.math.stat.descriptive.moment.SecondMoment secondMoment28 = new org.apache.commons.math.stat.descriptive.moment.SecondMoment();
        secondMoment28.increment((double) ' ');
        org.apache.commons.math.stat.descriptive.moment.Variance variance31 = new org.apache.commons.math.stat.descriptive.moment.Variance(secondMoment28);
        secondMoment28.increment((double) (short) -1);
        secondMoment28.clear();
        secondMoment28.increment((double) 'a');
        org.apache.commons.math.stat.descriptive.moment.SecondMoment secondMoment37 = new org.apache.commons.math.stat.descriptive.moment.SecondMoment();
        secondMoment37.increment(1.0d);
        secondMoment37.increment((double) (short) 0);
        boolean boolean42 = secondMoment28.equals((java.lang.Object) secondMoment37);
        secondMoment28.clear();
        long long44 = secondMoment28.getN();
        org.apache.commons.math.stat.descriptive.moment.SecondMoment secondMoment46 = new org.apache.commons.math.stat.descriptive.moment.SecondMoment();
        secondMoment46.increment(1.0d);
        secondMoment46.increment((double) (short) 0);
        long long51 = secondMoment46.getN();
        org.apache.commons.math.stat.descriptive.moment.Variance variance52 = new org.apache.commons.math.stat.descriptive.moment.Variance(false, secondMoment46);
        org.apache.commons.math.stat.descriptive.moment.SecondMoment secondMoment53 = new org.apache.commons.math.stat.descriptive.moment.SecondMoment();
        secondMoment53.increment((double) ' ');
        org.apache.commons.math.stat.descriptive.moment.Variance variance56 = new org.apache.commons.math.stat.descriptive.moment.Variance(secondMoment53);
        secondMoment53.increment((double) (short) -1);
        secondMoment53.clear();
        secondMoment53.increment((double) 'a');
        org.apache.commons.math.stat.descriptive.moment.SecondMoment secondMoment62 = new org.apache.commons.math.stat.descriptive.moment.SecondMoment();
        secondMoment62.increment(1.0d);
        secondMoment62.increment((double) (short) 0);
        boolean boolean67 = secondMoment53.equals((java.lang.Object) secondMoment62);
        org.apache.commons.math.stat.descriptive.moment.SecondMoment secondMoment68 = new org.apache.commons.math.stat.descriptive.moment.SecondMoment();
        secondMoment68.increment(1.0d);
        org.apache.commons.math.stat.descriptive.moment.SecondMoment secondMoment71 = new org.apache.commons.math.stat.descriptive.moment.SecondMoment();
        secondMoment71.increment(1.0d);
        double[] doubleArray77 = new double[] { (-1L), 0, 10L };
        secondMoment71.incrementAll(doubleArray77, 0, 0);
        double[] doubleArray83 = new double[] { 10, (byte) 100 };
        double double84 = secondMoment71.evaluate(doubleArray83);
        double double85 = secondMoment68.evaluate(doubleArray83);
        secondMoment53.incrementAll(doubleArray83);
        secondMoment46.incrementAll(doubleArray83, (int) (short) 0, 0);
        double double90 = secondMoment28.evaluate(doubleArray83);
        double double91 = secondMoment13.evaluate(doubleArray83);
        double double92 = variance1.evaluate(doubleArray83);
        long long93 = variance1.getN();
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 0L + "'", long2 == 0L);
        org.junit.Assert.assertTrue(Double.isNaN(double3));
        org.junit.Assert.assertNotNull(doubleArray19);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray19), "[-1.0, 0.0, 10.0]");
        org.junit.Assert.assertTrue("'" + long23 + "' != '" + 1L + "'", long23 == 1L);
        org.junit.Assert.assertTrue("'" + boolean42 + "' != '" + false + "'", boolean42 == false);
        org.junit.Assert.assertTrue("'" + long44 + "' != '" + 0L + "'", long44 == 0L);
        org.junit.Assert.assertTrue("'" + long51 + "' != '" + 2L + "'", long51 == 2L);
        org.junit.Assert.assertTrue("'" + boolean67 + "' != '" + false + "'", boolean67 == false);
        org.junit.Assert.assertNotNull(doubleArray77);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray77), "[-1.0, 0.0, 10.0]");
        org.junit.Assert.assertNotNull(doubleArray83);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray83), "[10.0, 100.0]");
        org.junit.Assert.assertTrue("'" + double84 + "' != '" + 4050.0d + "'", double84 == 4050.0d);
        org.junit.Assert.assertTrue("'" + double85 + "' != '" + 4050.0d + "'", double85 == 4050.0d);
        org.junit.Assert.assertTrue("'" + double90 + "' != '" + 4050.0d + "'", double90 == 4050.0d);
        org.junit.Assert.assertTrue("'" + double91 + "' != '" + 4050.0d + "'", double91 == 4050.0d);
        org.junit.Assert.assertTrue("'" + double92 + "' != '" + 2025.0d + "'", double92 == 2025.0d);
        org.junit.Assert.assertTrue("'" + long93 + "' != '" + 0L + "'", long93 == 0L);
    }

    @Test
    public void test13636() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest27.test13636");
        org.apache.commons.math.stat.descriptive.moment.SecondMoment secondMoment1 = new org.apache.commons.math.stat.descriptive.moment.SecondMoment();
        secondMoment1.increment((double) ' ');
        org.apache.commons.math.stat.descriptive.moment.Variance variance4 = new org.apache.commons.math.stat.descriptive.moment.Variance(secondMoment1);
        org.apache.commons.math.stat.descriptive.moment.Variance variance5 = new org.apache.commons.math.stat.descriptive.moment.Variance(false, secondMoment1);
        org.apache.commons.math.stat.descriptive.moment.SecondMoment secondMoment6 = new org.apache.commons.math.stat.descriptive.moment.SecondMoment();
        secondMoment6.increment((double) ' ');
        org.apache.commons.math.stat.descriptive.moment.Variance variance9 = new org.apache.commons.math.stat.descriptive.moment.Variance(secondMoment6);
        double double10 = variance9.getResult();
        org.apache.commons.math.stat.descriptive.moment.SecondMoment secondMoment11 = new org.apache.commons.math.stat.descriptive.moment.SecondMoment();
        secondMoment11.increment(1.0d);
        double[] doubleArray17 = new double[] { (-1L), 0, 10L };
        secondMoment11.incrementAll(doubleArray17, 0, 0);
        double[] doubleArray23 = new double[] { 10, (byte) 100 };
        double double24 = secondMoment11.evaluate(doubleArray23);
        double double25 = secondMoment11.getResult();
        secondMoment11.increment((double) (short) -1);
        double[] doubleArray29 = new double[] { (short) 1 };
        secondMoment11.incrementAll(doubleArray29);
        long long31 = secondMoment11.getN();
        org.apache.commons.math.stat.descriptive.moment.SecondMoment secondMoment32 = new org.apache.commons.math.stat.descriptive.moment.SecondMoment();
        secondMoment32.increment((double) ' ');
        org.apache.commons.math.stat.descriptive.moment.Variance variance35 = new org.apache.commons.math.stat.descriptive.moment.Variance(secondMoment32);
        secondMoment32.increment((double) (short) -1);
        secondMoment32.clear();
        secondMoment32.increment((double) 0L);
        org.apache.commons.math.stat.descriptive.moment.Variance variance41 = new org.apache.commons.math.stat.descriptive.moment.Variance(secondMoment32);
        long long42 = variance41.getN();
        org.apache.commons.math.stat.descriptive.moment.SecondMoment secondMoment43 = new org.apache.commons.math.stat.descriptive.moment.SecondMoment();
        secondMoment43.increment(1.0d);
        org.apache.commons.math.stat.descriptive.moment.SecondMoment secondMoment46 = new org.apache.commons.math.stat.descriptive.moment.SecondMoment();
        secondMoment46.increment(1.0d);
        secondMoment46.increment((double) (short) 0);
        double double51 = secondMoment46.getResult();
        org.apache.commons.math.stat.descriptive.moment.SecondMoment secondMoment52 = new org.apache.commons.math.stat.descriptive.moment.SecondMoment();
        secondMoment52.increment(1.0d);
        double[] doubleArray58 = new double[] { (-1L), 0, 10L };
        secondMoment52.incrementAll(doubleArray58, 0, 0);
        double double62 = secondMoment46.evaluate(doubleArray58);
        double[] doubleArray63 = new double[] {};
        secondMoment46.incrementAll(doubleArray63);
        double double65 = secondMoment43.evaluate(doubleArray63);
        double double66 = variance41.evaluate(doubleArray63);
        org.apache.commons.math.stat.descriptive.moment.SecondMoment secondMoment67 = new org.apache.commons.math.stat.descriptive.moment.SecondMoment();
        secondMoment67.increment(1.0d);
        org.apache.commons.math.stat.descriptive.moment.SecondMoment secondMoment70 = new org.apache.commons.math.stat.descriptive.moment.SecondMoment();
        secondMoment70.increment(1.0d);
        secondMoment70.increment((double) (short) 0);
        double double75 = secondMoment70.getResult();
        org.apache.commons.math.stat.descriptive.moment.SecondMoment secondMoment76 = new org.apache.commons.math.stat.descriptive.moment.SecondMoment();
        secondMoment76.increment(1.0d);
        double[] doubleArray82 = new double[] { (-1L), 0, 10L };
        secondMoment76.incrementAll(doubleArray82, 0, 0);
        double double86 = secondMoment70.evaluate(doubleArray82);
        double[] doubleArray87 = new double[] {};
        secondMoment70.incrementAll(doubleArray87);
        double double89 = secondMoment67.evaluate(doubleArray87);
        variance41.incrementAll(doubleArray87);
        double double91 = secondMoment11.evaluate(doubleArray87);
        double double92 = variance9.evaluate(doubleArray87);
        double double93 = secondMoment1.evaluate(doubleArray87);
        secondMoment1.clear();
        org.apache.commons.math.stat.descriptive.moment.Variance variance95 = new org.apache.commons.math.stat.descriptive.moment.Variance(secondMoment1);
        double double96 = secondMoment1.getResult();
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 0.0d + "'", double10 == 0.0d);
        org.junit.Assert.assertNotNull(doubleArray17);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray17), "[-1.0, 0.0, 10.0]");
        org.junit.Assert.assertNotNull(doubleArray23);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray23), "[10.0, 100.0]");
        org.junit.Assert.assertTrue("'" + double24 + "' != '" + 4050.0d + "'", double24 == 4050.0d);
        org.junit.Assert.assertTrue("'" + double25 + "' != '" + 4050.0d + "'", double25 == 4050.0d);
        org.junit.Assert.assertNotNull(doubleArray29);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray29), "[1.0]");
        org.junit.Assert.assertTrue("'" + long31 + "' != '" + 4L + "'", long31 == 4L);
        org.junit.Assert.assertTrue("'" + long42 + "' != '" + 1L + "'", long42 == 1L);
        org.junit.Assert.assertTrue("'" + double51 + "' != '" + 0.5d + "'", double51 == 0.5d);
        org.junit.Assert.assertNotNull(doubleArray58);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray58), "[-1.0, 0.0, 10.0]");
        org.junit.Assert.assertTrue("'" + double62 + "' != '" + 74.0d + "'", double62 == 74.0d);
        org.junit.Assert.assertNotNull(doubleArray63);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray63), "[]");
        org.junit.Assert.assertTrue("'" + double65 + "' != '" + 0.0d + "'", double65 == 0.0d);
        org.junit.Assert.assertTrue(Double.isNaN(double66));
        org.junit.Assert.assertTrue("'" + double75 + "' != '" + 0.5d + "'", double75 == 0.5d);
        org.junit.Assert.assertNotNull(doubleArray82);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray82), "[-1.0, 0.0, 10.0]");
        org.junit.Assert.assertTrue("'" + double86 + "' != '" + 74.0d + "'", double86 == 74.0d);
        org.junit.Assert.assertNotNull(doubleArray87);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray87), "[]");
        org.junit.Assert.assertTrue("'" + double89 + "' != '" + 0.0d + "'", double89 == 0.0d);
        org.junit.Assert.assertTrue("'" + double91 + "' != '" + 7077.0d + "'", double91 == 7077.0d);
        org.junit.Assert.assertTrue(Double.isNaN(double92));
        org.junit.Assert.assertTrue("'" + double93 + "' != '" + 0.0d + "'", double93 == 0.0d);
        org.junit.Assert.assertTrue(Double.isNaN(double96));
    }

    @Test
    public void test13637() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest27.test13637");
        org.apache.commons.math.stat.descriptive.moment.SecondMoment secondMoment0 = new org.apache.commons.math.stat.descriptive.moment.SecondMoment();
        secondMoment0.increment(1.0d);
        double[] doubleArray6 = new double[] { (-1L), 0, 10L };
        secondMoment0.incrementAll(doubleArray6, 0, 0);
        double[] doubleArray12 = new double[] { 10, (byte) 100 };
        double double13 = secondMoment0.evaluate(doubleArray12);
        org.apache.commons.math.stat.descriptive.moment.SecondMoment secondMoment15 = new org.apache.commons.math.stat.descriptive.moment.SecondMoment();
        secondMoment15.increment((double) ' ');
        org.apache.commons.math.stat.descriptive.moment.Variance variance18 = new org.apache.commons.math.stat.descriptive.moment.Variance(secondMoment15);
        secondMoment15.increment((double) (short) -1);
        secondMoment15.clear();
        secondMoment15.increment((double) 0L);
        org.apache.commons.math.stat.descriptive.moment.Variance variance24 = new org.apache.commons.math.stat.descriptive.moment.Variance(false, secondMoment15);
        boolean boolean25 = secondMoment0.equals((java.lang.Object) secondMoment15);
        double double26 = secondMoment15.getResult();
        secondMoment15.increment((double) 'a');
        double double29 = secondMoment15.getResult();
        secondMoment15.increment(7020.75d);
        secondMoment15.clear();
        long long33 = secondMoment15.getN();
        org.apache.commons.math.stat.descriptive.moment.Variance variance34 = new org.apache.commons.math.stat.descriptive.moment.Variance(secondMoment15);
        org.junit.Assert.assertNotNull(doubleArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray6), "[-1.0, 0.0, 10.0]");
        org.junit.Assert.assertNotNull(doubleArray12);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray12), "[10.0, 100.0]");
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 4050.0d + "'", double13 == 4050.0d);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
        org.junit.Assert.assertTrue("'" + double26 + "' != '" + 0.0d + "'", double26 == 0.0d);
        org.junit.Assert.assertTrue("'" + double29 + "' != '" + 4704.5d + "'", double29 == 4704.5d);
        org.junit.Assert.assertTrue("'" + long33 + "' != '" + 0L + "'", long33 == 0L);
    }

    @Test
    public void test13638() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest27.test13638");
        org.apache.commons.math.stat.descriptive.moment.SecondMoment secondMoment1 = new org.apache.commons.math.stat.descriptive.moment.SecondMoment();
        secondMoment1.increment(1.0d);
        double[] doubleArray7 = new double[] { (-1L), 0, 10L };
        secondMoment1.incrementAll(doubleArray7, 0, 0);
        double[] doubleArray13 = new double[] { 10, (byte) 100 };
        double double14 = secondMoment1.evaluate(doubleArray13);
        double double15 = secondMoment1.getResult();
        secondMoment1.increment((double) (short) -1);
        double double18 = secondMoment1.getResult();
        org.apache.commons.math.stat.descriptive.moment.SecondMoment secondMoment19 = new org.apache.commons.math.stat.descriptive.moment.SecondMoment();
        secondMoment19.increment(1.0d);
        double[] doubleArray25 = new double[] { (-1L), 0, 10L };
        secondMoment19.incrementAll(doubleArray25, 0, 0);
        double[] doubleArray31 = new double[] { 10, (byte) 100 };
        double double32 = secondMoment19.evaluate(doubleArray31);
        double double33 = secondMoment1.evaluate(doubleArray31);
        org.apache.commons.math.stat.descriptive.moment.Variance variance34 = new org.apache.commons.math.stat.descriptive.moment.Variance(false, secondMoment1);
        variance34.increment(1.8756123185185187E7d);
        org.apache.commons.math.stat.descriptive.moment.SecondMoment secondMoment37 = new org.apache.commons.math.stat.descriptive.moment.SecondMoment();
        secondMoment37.increment(1.0d);
        secondMoment37.increment((double) (short) 0);
        double double42 = secondMoment37.getResult();
        long long43 = secondMoment37.getN();
        org.apache.commons.math.stat.descriptive.moment.SecondMoment secondMoment44 = new org.apache.commons.math.stat.descriptive.moment.SecondMoment();
        secondMoment44.increment((double) ' ');
        org.apache.commons.math.stat.descriptive.moment.Variance variance47 = new org.apache.commons.math.stat.descriptive.moment.Variance(secondMoment44);
        secondMoment44.increment((double) (short) -1);
        secondMoment44.clear();
        secondMoment44.increment((double) 0L);
        org.apache.commons.math.stat.descriptive.moment.Variance variance53 = new org.apache.commons.math.stat.descriptive.moment.Variance(secondMoment44);
        org.apache.commons.math.stat.descriptive.moment.SecondMoment secondMoment54 = new org.apache.commons.math.stat.descriptive.moment.SecondMoment();
        secondMoment54.increment(1.0d);
        double[] doubleArray60 = new double[] { (-1L), 0, 10L };
        secondMoment54.incrementAll(doubleArray60, 0, 0);
        variance53.incrementAll(doubleArray60);
        long long65 = variance53.getN();
        org.apache.commons.math.stat.descriptive.moment.SecondMoment secondMoment66 = new org.apache.commons.math.stat.descriptive.moment.SecondMoment();
        secondMoment66.increment(1.0d);
        org.apache.commons.math.stat.descriptive.moment.SecondMoment secondMoment69 = new org.apache.commons.math.stat.descriptive.moment.SecondMoment();
        secondMoment69.increment(1.0d);
        double[] doubleArray75 = new double[] { (-1L), 0, 10L };
        secondMoment69.incrementAll(doubleArray75, 0, 0);
        double[] doubleArray81 = new double[] { 10, (byte) 100 };
        double double82 = secondMoment69.evaluate(doubleArray81);
        double double83 = secondMoment66.evaluate(doubleArray81);
        variance53.incrementAll(doubleArray81);
        double double85 = secondMoment37.evaluate(doubleArray81);
        double double86 = variance34.evaluate(doubleArray81);
        variance34.increment(1.935908267965872E29d);
        double double89 = variance34.getResult();
        long long90 = variance34.getN();
        org.junit.Assert.assertNotNull(doubleArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray7), "[-1.0, 0.0, 10.0]");
        org.junit.Assert.assertNotNull(doubleArray13);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray13), "[10.0, 100.0]");
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + 4050.0d + "'", double14 == 4050.0d);
        org.junit.Assert.assertTrue("'" + double15 + "' != '" + 4050.0d + "'", double15 == 4050.0d);
        org.junit.Assert.assertTrue("'" + double18 + "' != '" + 6140.666666666667d + "'", double18 == 6140.666666666667d);
        org.junit.Assert.assertNotNull(doubleArray25);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray25), "[-1.0, 0.0, 10.0]");
        org.junit.Assert.assertNotNull(doubleArray31);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray31), "[10.0, 100.0]");
        org.junit.Assert.assertTrue("'" + double32 + "' != '" + 4050.0d + "'", double32 == 4050.0d);
        org.junit.Assert.assertTrue("'" + double33 + "' != '" + 4050.0d + "'", double33 == 4050.0d);
        org.junit.Assert.assertTrue("'" + double42 + "' != '" + 0.5d + "'", double42 == 0.5d);
        org.junit.Assert.assertTrue("'" + long43 + "' != '" + 2L + "'", long43 == 2L);
        org.junit.Assert.assertNotNull(doubleArray60);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray60), "[-1.0, 0.0, 10.0]");
        org.junit.Assert.assertTrue("'" + long65 + "' != '" + 1L + "'", long65 == 1L);
        org.junit.Assert.assertNotNull(doubleArray75);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray75), "[-1.0, 0.0, 10.0]");
        org.junit.Assert.assertNotNull(doubleArray81);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray81), "[10.0, 100.0]");
        org.junit.Assert.assertTrue("'" + double82 + "' != '" + 4050.0d + "'", double82 == 4050.0d);
        org.junit.Assert.assertTrue("'" + double83 + "' != '" + 4050.0d + "'", double83 == 4050.0d);
        org.junit.Assert.assertTrue("'" + double85 + "' != '" + 4050.0d + "'", double85 == 4050.0d);
        org.junit.Assert.assertTrue("'" + double86 + "' != '" + 2025.0d + "'", double86 == 2025.0d);
        org.junit.Assert.assertTrue("'" + double89 + "' != '" + 2025.0d + "'", double89 == 2025.0d);
        org.junit.Assert.assertTrue("'" + long90 + "' != '" + 2L + "'", long90 == 2L);
    }

    @Test
    public void test13639() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest27.test13639");
        org.apache.commons.math.stat.descriptive.moment.SecondMoment secondMoment0 = new org.apache.commons.math.stat.descriptive.moment.SecondMoment();
        secondMoment0.increment(1.0d);
        secondMoment0.increment((double) (short) 0);
        long long5 = secondMoment0.getN();
        secondMoment0.clear();
        double double7 = secondMoment0.getResult();
        org.apache.commons.math.stat.descriptive.moment.SecondMoment secondMoment9 = new org.apache.commons.math.stat.descriptive.moment.SecondMoment();
        secondMoment9.increment((double) ' ');
        secondMoment9.increment((double) '4');
        long long14 = secondMoment9.getN();
        org.apache.commons.math.stat.descriptive.moment.Variance variance15 = new org.apache.commons.math.stat.descriptive.moment.Variance(secondMoment9);
        double double16 = secondMoment9.getResult();
        org.apache.commons.math.stat.descriptive.moment.SecondMoment secondMoment18 = new org.apache.commons.math.stat.descriptive.moment.SecondMoment();
        secondMoment18.increment(1.0d);
        secondMoment18.increment((double) (short) 0);
        double double23 = secondMoment18.getResult();
        org.apache.commons.math.stat.descriptive.moment.SecondMoment secondMoment24 = new org.apache.commons.math.stat.descriptive.moment.SecondMoment();
        secondMoment24.increment(1.0d);
        double[] doubleArray30 = new double[] { (-1L), 0, 10L };
        secondMoment24.incrementAll(doubleArray30, 0, 0);
        double double34 = secondMoment18.evaluate(doubleArray30);
        long long35 = secondMoment18.getN();
        org.apache.commons.math.stat.descriptive.moment.Variance variance36 = new org.apache.commons.math.stat.descriptive.moment.Variance(secondMoment18);
        double double37 = secondMoment18.getResult();
        org.apache.commons.math.stat.descriptive.moment.Variance variance38 = new org.apache.commons.math.stat.descriptive.moment.Variance(false, secondMoment18);
        variance38.increment((double) 10.0f);
        boolean boolean41 = variance38.isBiasCorrected();
        double double42 = variance38.getResult();
        org.apache.commons.math.stat.descriptive.moment.SecondMoment secondMoment43 = new org.apache.commons.math.stat.descriptive.moment.SecondMoment();
        secondMoment43.increment(1.0d);
        secondMoment43.increment((double) (short) 0);
        double double48 = secondMoment43.getResult();
        org.apache.commons.math.stat.descriptive.moment.SecondMoment secondMoment49 = new org.apache.commons.math.stat.descriptive.moment.SecondMoment();
        secondMoment49.increment(1.0d);
        double[] doubleArray55 = new double[] { (-1L), 0, 10L };
        secondMoment49.incrementAll(doubleArray55, 0, 0);
        double double59 = secondMoment43.evaluate(doubleArray55);
        double double60 = variance38.evaluate(doubleArray55);
        secondMoment9.incrementAll(doubleArray55);
        org.apache.commons.math.stat.descriptive.moment.Variance variance62 = new org.apache.commons.math.stat.descriptive.moment.Variance(true, secondMoment9);
        boolean boolean63 = secondMoment0.equals((java.lang.Object) true);
        double double64 = secondMoment0.getResult();
        double double65 = secondMoment0.getResult();
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 2L + "'", long5 == 2L);
        org.junit.Assert.assertTrue(Double.isNaN(double7));
        org.junit.Assert.assertTrue("'" + long14 + "' != '" + 2L + "'", long14 == 2L);
        org.junit.Assert.assertTrue("'" + double16 + "' != '" + 200.0d + "'", double16 == 200.0d);
        org.junit.Assert.assertTrue("'" + double23 + "' != '" + 0.5d + "'", double23 == 0.5d);
        org.junit.Assert.assertNotNull(doubleArray30);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray30), "[-1.0, 0.0, 10.0]");
        org.junit.Assert.assertTrue("'" + double34 + "' != '" + 74.0d + "'", double34 == 74.0d);
        org.junit.Assert.assertTrue("'" + long35 + "' != '" + 3L + "'", long35 == 3L);
        org.junit.Assert.assertTrue("'" + double37 + "' != '" + 74.0d + "'", double37 == 74.0d);
        org.junit.Assert.assertTrue("'" + boolean41 + "' != '" + false + "'", boolean41 == false);
        org.junit.Assert.assertTrue("'" + double42 + "' != '" + 24.666666666666668d + "'", double42 == 24.666666666666668d);
        org.junit.Assert.assertTrue("'" + double48 + "' != '" + 0.5d + "'", double48 == 0.5d);
        org.junit.Assert.assertNotNull(doubleArray55);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray55), "[-1.0, 0.0, 10.0]");
        org.junit.Assert.assertTrue("'" + double59 + "' != '" + 74.0d + "'", double59 == 74.0d);
        org.junit.Assert.assertTrue("'" + double60 + "' != '" + 24.666666666666668d + "'", double60 == 24.666666666666668d);
        org.junit.Assert.assertTrue("'" + boolean63 + "' != '" + false + "'", boolean63 == false);
        org.junit.Assert.assertTrue(Double.isNaN(double64));
        org.junit.Assert.assertTrue(Double.isNaN(double65));
    }

    @Test
    public void test13640() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest27.test13640");
        org.apache.commons.math.stat.descriptive.moment.SecondMoment secondMoment0 = new org.apache.commons.math.stat.descriptive.moment.SecondMoment();
        secondMoment0.increment(1.0d);
        double[] doubleArray6 = new double[] { (-1L), 0, 10L };
        secondMoment0.incrementAll(doubleArray6, 0, 0);
        double[] doubleArray12 = new double[] { 10, (byte) 100 };
        double double13 = secondMoment0.evaluate(doubleArray12);
        secondMoment0.clear();
        double double15 = secondMoment0.getResult();
        secondMoment0.clear();
        secondMoment0.increment(30671.375d);
        double double19 = secondMoment0.getResult();
        double double20 = secondMoment0.getResult();
        org.junit.Assert.assertNotNull(doubleArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray6), "[-1.0, 0.0, 10.0]");
        org.junit.Assert.assertNotNull(doubleArray12);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray12), "[10.0, 100.0]");
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 4050.0d + "'", double13 == 4050.0d);
        org.junit.Assert.assertTrue(Double.isNaN(double15));
        org.junit.Assert.assertTrue("'" + double19 + "' != '" + 0.0d + "'", double19 == 0.0d);
        org.junit.Assert.assertTrue("'" + double20 + "' != '" + 0.0d + "'", double20 == 0.0d);
    }

    @Test
    public void test13641() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest27.test13641");
        org.apache.commons.math.stat.descriptive.moment.SecondMoment secondMoment0 = new org.apache.commons.math.stat.descriptive.moment.SecondMoment();
        secondMoment0.increment((double) ' ');
        org.apache.commons.math.stat.descriptive.moment.Variance variance3 = new org.apache.commons.math.stat.descriptive.moment.Variance(secondMoment0);
        secondMoment0.increment((double) (short) -1);
        secondMoment0.clear();
        double double7 = secondMoment0.getResult();
        org.apache.commons.math.stat.descriptive.moment.Variance variance8 = new org.apache.commons.math.stat.descriptive.moment.Variance(secondMoment0);
        org.apache.commons.math.stat.descriptive.moment.SecondMoment secondMoment10 = new org.apache.commons.math.stat.descriptive.moment.SecondMoment();
        secondMoment10.increment((double) ' ');
        org.apache.commons.math.stat.descriptive.moment.Variance variance13 = new org.apache.commons.math.stat.descriptive.moment.Variance(secondMoment10);
        secondMoment10.increment((double) '4');
        secondMoment10.increment((double) 100);
        secondMoment10.clear();
        org.apache.commons.math.stat.descriptive.moment.Variance variance19 = new org.apache.commons.math.stat.descriptive.moment.Variance(true, secondMoment10);
        org.apache.commons.math.stat.descriptive.moment.SecondMoment secondMoment20 = new org.apache.commons.math.stat.descriptive.moment.SecondMoment();
        secondMoment20.increment(1.0d);
        double[] doubleArray26 = new double[] { (-1L), 0, 10L };
        secondMoment20.incrementAll(doubleArray26, 0, 0);
        double[] doubleArray32 = new double[] { 10, (byte) 100 };
        double double33 = secondMoment20.evaluate(doubleArray32);
        secondMoment20.clear();
        org.apache.commons.math.stat.descriptive.moment.SecondMoment secondMoment35 = new org.apache.commons.math.stat.descriptive.moment.SecondMoment();
        secondMoment35.increment(1.0d);
        secondMoment35.increment((double) (short) 0);
        double double40 = secondMoment35.getResult();
        org.apache.commons.math.stat.descriptive.moment.SecondMoment secondMoment41 = new org.apache.commons.math.stat.descriptive.moment.SecondMoment();
        secondMoment41.increment(1.0d);
        secondMoment41.increment((double) (short) 0);
        double double46 = secondMoment41.getResult();
        org.apache.commons.math.stat.descriptive.moment.SecondMoment secondMoment47 = new org.apache.commons.math.stat.descriptive.moment.SecondMoment();
        secondMoment47.increment(1.0d);
        double[] doubleArray53 = new double[] { (-1L), 0, 10L };
        secondMoment47.incrementAll(doubleArray53, 0, 0);
        double double57 = secondMoment41.evaluate(doubleArray53);
        double[] doubleArray58 = new double[] {};
        secondMoment41.incrementAll(doubleArray58);
        secondMoment35.incrementAll(doubleArray58);
        secondMoment35.increment((double) 2L);
        org.apache.commons.math.stat.descriptive.moment.Variance variance63 = new org.apache.commons.math.stat.descriptive.moment.Variance(secondMoment35);
        org.apache.commons.math.stat.descriptive.moment.SecondMoment secondMoment64 = new org.apache.commons.math.stat.descriptive.moment.SecondMoment();
        secondMoment64.increment(1.0d);
        double[] doubleArray70 = new double[] { (-1L), 0, 10L };
        secondMoment64.incrementAll(doubleArray70, 0, 0);
        double[] doubleArray76 = new double[] { 10, (byte) 100 };
        double double77 = secondMoment64.evaluate(doubleArray76);
        double double78 = variance63.evaluate(doubleArray76);
        double double79 = secondMoment20.evaluate(doubleArray76);
        double double80 = secondMoment10.evaluate(doubleArray76);
        double double81 = secondMoment0.evaluate(doubleArray76);
        double double82 = secondMoment0.getResult();
        double double83 = secondMoment0.getResult();
        double double84 = secondMoment0.getResult();
        double double85 = secondMoment0.getResult();
        org.junit.Assert.assertTrue(Double.isNaN(double7));
        org.junit.Assert.assertNotNull(doubleArray26);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray26), "[-1.0, 0.0, 10.0]");
        org.junit.Assert.assertNotNull(doubleArray32);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray32), "[10.0, 100.0]");
        org.junit.Assert.assertTrue("'" + double33 + "' != '" + 4050.0d + "'", double33 == 4050.0d);
        org.junit.Assert.assertTrue("'" + double40 + "' != '" + 0.5d + "'", double40 == 0.5d);
        org.junit.Assert.assertTrue("'" + double46 + "' != '" + 0.5d + "'", double46 == 0.5d);
        org.junit.Assert.assertNotNull(doubleArray53);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray53), "[-1.0, 0.0, 10.0]");
        org.junit.Assert.assertTrue("'" + double57 + "' != '" + 74.0d + "'", double57 == 74.0d);
        org.junit.Assert.assertNotNull(doubleArray58);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray58), "[]");
        org.junit.Assert.assertNotNull(doubleArray70);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray70), "[-1.0, 0.0, 10.0]");
        org.junit.Assert.assertNotNull(doubleArray76);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray76), "[10.0, 100.0]");
        org.junit.Assert.assertTrue("'" + double77 + "' != '" + 4050.0d + "'", double77 == 4050.0d);
        org.junit.Assert.assertTrue("'" + double78 + "' != '" + 4050.0d + "'", double78 == 4050.0d);
        org.junit.Assert.assertTrue("'" + double79 + "' != '" + 4050.0d + "'", double79 == 4050.0d);
        org.junit.Assert.assertTrue("'" + double80 + "' != '" + 4050.0d + "'", double80 == 4050.0d);
        org.junit.Assert.assertTrue("'" + double81 + "' != '" + 4050.0d + "'", double81 == 4050.0d);
        org.junit.Assert.assertTrue("'" + double82 + "' != '" + 4050.0d + "'", double82 == 4050.0d);
        org.junit.Assert.assertTrue("'" + double83 + "' != '" + 4050.0d + "'", double83 == 4050.0d);
        org.junit.Assert.assertTrue("'" + double84 + "' != '" + 4050.0d + "'", double84 == 4050.0d);
        org.junit.Assert.assertTrue("'" + double85 + "' != '" + 4050.0d + "'", double85 == 4050.0d);
    }

    @Test
    public void test13642() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest27.test13642");
        org.apache.commons.math.stat.descriptive.moment.SecondMoment secondMoment0 = new org.apache.commons.math.stat.descriptive.moment.SecondMoment();
        secondMoment0.increment(1.0d);
        secondMoment0.increment((double) (short) 0);
        long long5 = secondMoment0.getN();
        double double6 = secondMoment0.getResult();
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 2L + "'", long5 == 2L);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.5d + "'", double6 == 0.5d);
    }

    @Test
    public void test13643() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest27.test13643");
        org.apache.commons.math.stat.descriptive.moment.Variance variance1 = new org.apache.commons.math.stat.descriptive.moment.Variance(true);
        long long2 = variance1.getN();
        double double3 = variance1.getResult();
        double double4 = variance1.getResult();
        variance1.clear();
        org.apache.commons.math.stat.descriptive.moment.SecondMoment secondMoment6 = new org.apache.commons.math.stat.descriptive.moment.SecondMoment();
        secondMoment6.increment((double) ' ');
        org.apache.commons.math.stat.descriptive.moment.Variance variance9 = new org.apache.commons.math.stat.descriptive.moment.Variance(secondMoment6);
        secondMoment6.increment((double) (short) -1);
        secondMoment6.clear();
        secondMoment6.increment((double) 'a');
        org.apache.commons.math.stat.descriptive.moment.SecondMoment secondMoment15 = new org.apache.commons.math.stat.descriptive.moment.SecondMoment();
        secondMoment15.increment(1.0d);
        secondMoment15.increment((double) (short) 0);
        boolean boolean20 = secondMoment6.equals((java.lang.Object) secondMoment15);
        org.apache.commons.math.stat.descriptive.moment.Variance variance21 = new org.apache.commons.math.stat.descriptive.moment.Variance(secondMoment6);
        org.apache.commons.math.stat.descriptive.moment.SecondMoment secondMoment22 = new org.apache.commons.math.stat.descriptive.moment.SecondMoment();
        secondMoment22.increment(1.0d);
        double[] doubleArray28 = new double[] { (-1L), 0, 10L };
        secondMoment22.incrementAll(doubleArray28, 0, 0);
        org.apache.commons.math.stat.descriptive.moment.Variance variance32 = new org.apache.commons.math.stat.descriptive.moment.Variance(secondMoment22);
        long long33 = variance32.getN();
        org.apache.commons.math.stat.descriptive.moment.SecondMoment secondMoment34 = new org.apache.commons.math.stat.descriptive.moment.SecondMoment();
        secondMoment34.increment(1.0d);
        double[] doubleArray40 = new double[] { (-1L), 0, 10L };
        secondMoment34.incrementAll(doubleArray40, 0, 0);
        double double45 = variance32.evaluate(doubleArray40, (double) (short) -1);
        double double46 = variance32.getResult();
        org.apache.commons.math.stat.descriptive.moment.SecondMoment secondMoment47 = new org.apache.commons.math.stat.descriptive.moment.SecondMoment();
        secondMoment47.increment(1.0d);
        secondMoment47.increment((double) (short) 0);
        double double52 = secondMoment47.getResult();
        org.apache.commons.math.stat.descriptive.moment.SecondMoment secondMoment53 = new org.apache.commons.math.stat.descriptive.moment.SecondMoment();
        secondMoment53.increment(1.0d);
        secondMoment53.increment((double) (short) 0);
        double double58 = secondMoment53.getResult();
        org.apache.commons.math.stat.descriptive.moment.SecondMoment secondMoment59 = new org.apache.commons.math.stat.descriptive.moment.SecondMoment();
        secondMoment59.increment(1.0d);
        double[] doubleArray65 = new double[] { (-1L), 0, 10L };
        secondMoment59.incrementAll(doubleArray65, 0, 0);
        double double69 = secondMoment53.evaluate(doubleArray65);
        double[] doubleArray70 = new double[] {};
        secondMoment53.incrementAll(doubleArray70);
        secondMoment47.incrementAll(doubleArray70);
        secondMoment47.increment((double) 2L);
        org.apache.commons.math.stat.descriptive.moment.Variance variance75 = new org.apache.commons.math.stat.descriptive.moment.Variance(secondMoment47);
        org.apache.commons.math.stat.descriptive.moment.SecondMoment secondMoment76 = new org.apache.commons.math.stat.descriptive.moment.SecondMoment();
        secondMoment76.increment(1.0d);
        double[] doubleArray82 = new double[] { (-1L), 0, 10L };
        secondMoment76.incrementAll(doubleArray82, 0, 0);
        double[] doubleArray88 = new double[] { 10, (byte) 100 };
        double double89 = secondMoment76.evaluate(doubleArray88);
        double double90 = variance75.evaluate(doubleArray88);
        double double93 = variance32.evaluate(doubleArray88, (int) (short) 1, 0);
        double double94 = variance21.evaluate(doubleArray88);
        double double95 = variance1.evaluate(doubleArray88);
        boolean boolean96 = variance1.isBiasCorrected();
        double double97 = variance1.getResult();
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 0L + "'", long2 == 0L);
        org.junit.Assert.assertTrue(Double.isNaN(double3));
        org.junit.Assert.assertTrue(Double.isNaN(double4));
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertNotNull(doubleArray28);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray28), "[-1.0, 0.0, 10.0]");
        org.junit.Assert.assertTrue("'" + long33 + "' != '" + 1L + "'", long33 == 1L);
        org.junit.Assert.assertNotNull(doubleArray40);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray40), "[-1.0, 0.0, 10.0]");
        org.junit.Assert.assertTrue("'" + double45 + "' != '" + 37.0d + "'", double45 == 37.0d);
        org.junit.Assert.assertTrue("'" + double46 + "' != '" + 0.0d + "'", double46 == 0.0d);
        org.junit.Assert.assertTrue("'" + double52 + "' != '" + 0.5d + "'", double52 == 0.5d);
        org.junit.Assert.assertTrue("'" + double58 + "' != '" + 0.5d + "'", double58 == 0.5d);
        org.junit.Assert.assertNotNull(doubleArray65);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray65), "[-1.0, 0.0, 10.0]");
        org.junit.Assert.assertTrue("'" + double69 + "' != '" + 74.0d + "'", double69 == 74.0d);
        org.junit.Assert.assertNotNull(doubleArray70);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray70), "[]");
        org.junit.Assert.assertNotNull(doubleArray82);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray82), "[-1.0, 0.0, 10.0]");
        org.junit.Assert.assertNotNull(doubleArray88);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray88), "[10.0, 100.0]");
        org.junit.Assert.assertTrue("'" + double89 + "' != '" + 4050.0d + "'", double89 == 4050.0d);
        org.junit.Assert.assertTrue("'" + double90 + "' != '" + 4050.0d + "'", double90 == 4050.0d);
        org.junit.Assert.assertTrue(Double.isNaN(double93));
        org.junit.Assert.assertTrue("'" + double94 + "' != '" + 4050.0d + "'", double94 == 4050.0d);
        org.junit.Assert.assertTrue("'" + double95 + "' != '" + 4050.0d + "'", double95 == 4050.0d);
        org.junit.Assert.assertTrue("'" + boolean96 + "' != '" + true + "'", boolean96 == true);
        org.junit.Assert.assertTrue(Double.isNaN(double97));
    }

    @Test
    public void test13644() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest27.test13644");
        org.apache.commons.math.stat.descriptive.moment.SecondMoment secondMoment2 = new org.apache.commons.math.stat.descriptive.moment.SecondMoment();
        secondMoment2.increment(1.0d);
        double[] doubleArray8 = new double[] { (-1L), 0, 10L };
        secondMoment2.incrementAll(doubleArray8, 0, 0);
        double[] doubleArray14 = new double[] { 10, (byte) 100 };
        double double15 = secondMoment2.evaluate(doubleArray14);
        double double16 = secondMoment2.getResult();
        org.apache.commons.math.stat.descriptive.moment.Variance variance17 = new org.apache.commons.math.stat.descriptive.moment.Variance(false, secondMoment2);
        long long18 = secondMoment2.getN();
        org.apache.commons.math.stat.descriptive.moment.SecondMoment secondMoment19 = new org.apache.commons.math.stat.descriptive.moment.SecondMoment();
        secondMoment19.increment((double) ' ');
        secondMoment19.increment((double) (-1.0f));
        secondMoment19.clear();
        org.apache.commons.math.stat.descriptive.moment.SecondMoment secondMoment25 = new org.apache.commons.math.stat.descriptive.moment.SecondMoment();
        secondMoment25.increment(1.0d);
        double[] doubleArray31 = new double[] { (-1L), 0, 10L };
        secondMoment25.incrementAll(doubleArray31, 0, 0);
        org.apache.commons.math.stat.descriptive.moment.Variance variance35 = new org.apache.commons.math.stat.descriptive.moment.Variance(secondMoment25);
        long long36 = variance35.getN();
        org.apache.commons.math.stat.descriptive.moment.SecondMoment secondMoment37 = new org.apache.commons.math.stat.descriptive.moment.SecondMoment();
        secondMoment37.increment(1.0d);
        double[] doubleArray43 = new double[] { (-1L), 0, 10L };
        secondMoment37.incrementAll(doubleArray43, 0, 0);
        double double48 = variance35.evaluate(doubleArray43, (double) (short) -1);
        double double49 = secondMoment19.evaluate(doubleArray43);
        double double50 = secondMoment2.evaluate(doubleArray43);
        org.apache.commons.math.stat.descriptive.moment.Variance variance51 = new org.apache.commons.math.stat.descriptive.moment.Variance(secondMoment2);
        double double52 = secondMoment2.getResult();
        secondMoment2.increment(688.0d);
        org.apache.commons.math.stat.descriptive.moment.Variance variance55 = new org.apache.commons.math.stat.descriptive.moment.Variance(true, secondMoment2);
        double double56 = secondMoment2.getResult();
        double double57 = secondMoment2.getResult();
        secondMoment2.clear();
        secondMoment2.clear();
        org.junit.Assert.assertNotNull(doubleArray8);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray8), "[-1.0, 0.0, 10.0]");
        org.junit.Assert.assertNotNull(doubleArray14);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray14), "[10.0, 100.0]");
        org.junit.Assert.assertTrue("'" + double15 + "' != '" + 4050.0d + "'", double15 == 4050.0d);
        org.junit.Assert.assertTrue("'" + double16 + "' != '" + 4050.0d + "'", double16 == 4050.0d);
        org.junit.Assert.assertTrue("'" + long18 + "' != '" + 2L + "'", long18 == 2L);
        org.junit.Assert.assertNotNull(doubleArray31);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray31), "[-1.0, 0.0, 10.0]");
        org.junit.Assert.assertTrue("'" + long36 + "' != '" + 1L + "'", long36 == 1L);
        org.junit.Assert.assertNotNull(doubleArray43);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray43), "[-1.0, 0.0, 10.0]");
        org.junit.Assert.assertTrue("'" + double48 + "' != '" + 37.0d + "'", double48 == 37.0d);
        org.junit.Assert.assertTrue("'" + double49 + "' != '" + 74.0d + "'", double49 == 74.0d);
        org.junit.Assert.assertTrue("'" + double50 + "' != '" + 74.0d + "'", double50 == 74.0d);
        org.junit.Assert.assertTrue("'" + double52 + "' != '" + 74.0d + "'", double52 == 74.0d);
        org.junit.Assert.assertTrue("'" + double56 + "' != '" + 351992.75d + "'", double56 == 351992.75d);
        org.junit.Assert.assertTrue("'" + double57 + "' != '" + 351992.75d + "'", double57 == 351992.75d);
    }

    @Test
    public void test13645() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest27.test13645");
        org.apache.commons.math.stat.descriptive.moment.SecondMoment secondMoment1 = new org.apache.commons.math.stat.descriptive.moment.SecondMoment();
        secondMoment1.increment(1.0d);
        double[] doubleArray7 = new double[] { (-1L), 0, 10L };
        secondMoment1.incrementAll(doubleArray7, 0, 0);
        long long11 = secondMoment1.getN();
        org.apache.commons.math.stat.descriptive.moment.Variance variance12 = new org.apache.commons.math.stat.descriptive.moment.Variance(secondMoment1);
        secondMoment1.increment(10.0d);
        secondMoment1.clear();
        org.apache.commons.math.stat.descriptive.moment.Variance variance16 = new org.apache.commons.math.stat.descriptive.moment.Variance(false, secondMoment1);
        double double17 = secondMoment1.getResult();
        org.apache.commons.math.stat.descriptive.moment.Variance variance18 = new org.apache.commons.math.stat.descriptive.moment.Variance(secondMoment1);
        double double19 = secondMoment1.getResult();
        org.apache.commons.math.stat.descriptive.moment.Variance variance20 = new org.apache.commons.math.stat.descriptive.moment.Variance(secondMoment1);
        org.apache.commons.math.stat.descriptive.moment.SecondMoment secondMoment21 = new org.apache.commons.math.stat.descriptive.moment.SecondMoment();
        secondMoment21.increment((double) ' ');
        org.apache.commons.math.stat.descriptive.moment.Variance variance24 = new org.apache.commons.math.stat.descriptive.moment.Variance(secondMoment21);
        secondMoment21.increment((double) '4');
        double double27 = secondMoment21.getResult();
        secondMoment21.increment((double) (short) 0);
        secondMoment21.clear();
        double double31 = secondMoment21.getResult();
        org.apache.commons.math.stat.descriptive.moment.FirstMoment firstMoment32 = new org.apache.commons.math.stat.descriptive.moment.FirstMoment();
        org.apache.commons.math.stat.descriptive.moment.SecondMoment secondMoment33 = new org.apache.commons.math.stat.descriptive.moment.SecondMoment();
        secondMoment33.increment(1.0d);
        secondMoment33.increment((double) (short) 0);
        double double38 = secondMoment33.getResult();
        org.apache.commons.math.stat.descriptive.moment.SecondMoment secondMoment39 = new org.apache.commons.math.stat.descriptive.moment.SecondMoment();
        secondMoment39.increment(1.0d);
        secondMoment39.increment((double) (short) 0);
        double double44 = secondMoment39.getResult();
        org.apache.commons.math.stat.descriptive.moment.SecondMoment secondMoment45 = new org.apache.commons.math.stat.descriptive.moment.SecondMoment();
        secondMoment45.increment(1.0d);
        double[] doubleArray51 = new double[] { (-1L), 0, 10L };
        secondMoment45.incrementAll(doubleArray51, 0, 0);
        double double55 = secondMoment39.evaluate(doubleArray51);
        double[] doubleArray56 = new double[] {};
        secondMoment39.incrementAll(doubleArray56);
        secondMoment33.incrementAll(doubleArray56);
        secondMoment33.increment((double) 2L);
        org.apache.commons.math.stat.descriptive.moment.Variance variance61 = new org.apache.commons.math.stat.descriptive.moment.Variance(secondMoment33);
        secondMoment33.increment(0.5d);
        org.apache.commons.math.stat.descriptive.moment.SecondMoment secondMoment64 = new org.apache.commons.math.stat.descriptive.moment.SecondMoment();
        secondMoment64.increment(1.0d);
        double[] doubleArray70 = new double[] { (-1L), 0, 10L };
        secondMoment64.incrementAll(doubleArray70, 0, 0);
        org.apache.commons.math.stat.descriptive.moment.Variance variance74 = new org.apache.commons.math.stat.descriptive.moment.Variance(secondMoment64);
        long long75 = variance74.getN();
        org.apache.commons.math.stat.descriptive.moment.SecondMoment secondMoment76 = new org.apache.commons.math.stat.descriptive.moment.SecondMoment();
        secondMoment76.increment(1.0d);
        double[] doubleArray82 = new double[] { (-1L), 0, 10L };
        secondMoment76.incrementAll(doubleArray82, 0, 0);
        double double87 = variance74.evaluate(doubleArray82, (double) (short) -1);
        double double90 = secondMoment33.evaluate(doubleArray82, (int) (byte) 1, (int) (byte) 1);
        firstMoment32.incrementAll(doubleArray82);
        secondMoment21.incrementAll(doubleArray82);
        variance20.incrementAll(doubleArray82);
        org.junit.Assert.assertNotNull(doubleArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray7), "[-1.0, 0.0, 10.0]");
        org.junit.Assert.assertTrue("'" + long11 + "' != '" + 1L + "'", long11 == 1L);
        org.junit.Assert.assertTrue(Double.isNaN(double17));
        org.junit.Assert.assertTrue(Double.isNaN(double19));
        org.junit.Assert.assertTrue("'" + double27 + "' != '" + 200.0d + "'", double27 == 200.0d);
        org.junit.Assert.assertTrue(Double.isNaN(double31));
        org.junit.Assert.assertTrue("'" + double38 + "' != '" + 0.5d + "'", double38 == 0.5d);
        org.junit.Assert.assertTrue("'" + double44 + "' != '" + 0.5d + "'", double44 == 0.5d);
        org.junit.Assert.assertNotNull(doubleArray51);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray51), "[-1.0, 0.0, 10.0]");
        org.junit.Assert.assertTrue("'" + double55 + "' != '" + 74.0d + "'", double55 == 74.0d);
        org.junit.Assert.assertNotNull(doubleArray56);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray56), "[]");
        org.junit.Assert.assertNotNull(doubleArray70);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray70), "[-1.0, 0.0, 10.0]");
        org.junit.Assert.assertTrue("'" + long75 + "' != '" + 1L + "'", long75 == 1L);
        org.junit.Assert.assertNotNull(doubleArray82);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray82), "[-1.0, 0.0, 10.0]");
        org.junit.Assert.assertTrue("'" + double87 + "' != '" + 37.0d + "'", double87 == 37.0d);
        org.junit.Assert.assertTrue("'" + double90 + "' != '" + 0.0d + "'", double90 == 0.0d);
    }

    @Test
    public void test13646() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest27.test13646");
        org.apache.commons.math.stat.descriptive.moment.SecondMoment secondMoment1 = new org.apache.commons.math.stat.descriptive.moment.SecondMoment();
        secondMoment1.increment(1.0d);
        double[] doubleArray7 = new double[] { (-1L), 0, 10L };
        secondMoment1.incrementAll(doubleArray7, 0, 0);
        double[] doubleArray13 = new double[] { 10, (byte) 100 };
        double double14 = secondMoment1.evaluate(doubleArray13);
        long long15 = secondMoment1.getN();
        secondMoment1.clear();
        double double17 = secondMoment1.getResult();
        secondMoment1.clear();
        org.apache.commons.math.stat.descriptive.moment.Variance variance19 = new org.apache.commons.math.stat.descriptive.moment.Variance(true, secondMoment1);
        variance19.increment((double) 0.0f);
        double double22 = variance19.getResult();
        double double23 = variance19.getResult();
        long long24 = variance19.getN();
        variance19.increment((double) 100);
        variance19.clear();
        boolean boolean28 = variance19.isBiasCorrected();
        org.junit.Assert.assertNotNull(doubleArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray7), "[-1.0, 0.0, 10.0]");
        org.junit.Assert.assertNotNull(doubleArray13);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray13), "[10.0, 100.0]");
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + 4050.0d + "'", double14 == 4050.0d);
        org.junit.Assert.assertTrue("'" + long15 + "' != '" + 2L + "'", long15 == 2L);
        org.junit.Assert.assertTrue(Double.isNaN(double17));
        org.junit.Assert.assertTrue(Double.isNaN(double22));
        org.junit.Assert.assertTrue(Double.isNaN(double23));
        org.junit.Assert.assertTrue("'" + long24 + "' != '" + 0L + "'", long24 == 0L);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + true + "'", boolean28 == true);
    }

    @Test
    public void test13647() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest27.test13647");
        org.apache.commons.math.stat.descriptive.moment.SecondMoment secondMoment1 = new org.apache.commons.math.stat.descriptive.moment.SecondMoment();
        secondMoment1.increment(1.0d);
        double[] doubleArray7 = new double[] { (-1L), 0, 10L };
        secondMoment1.incrementAll(doubleArray7, 0, 0);
        double[] doubleArray13 = new double[] { 10, (byte) 100 };
        double double14 = secondMoment1.evaluate(doubleArray13);
        double double15 = secondMoment1.getResult();
        org.apache.commons.math.stat.descriptive.moment.Variance variance16 = new org.apache.commons.math.stat.descriptive.moment.Variance(false, secondMoment1);
        variance16.increment(0.0d);
        variance16.clear();
        double double20 = variance16.getResult();
        boolean boolean21 = variance16.isBiasCorrected();
        long long22 = variance16.getN();
        org.junit.Assert.assertNotNull(doubleArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray7), "[-1.0, 0.0, 10.0]");
        org.junit.Assert.assertNotNull(doubleArray13);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray13), "[10.0, 100.0]");
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + 4050.0d + "'", double14 == 4050.0d);
        org.junit.Assert.assertTrue("'" + double15 + "' != '" + 4050.0d + "'", double15 == 4050.0d);
        org.junit.Assert.assertTrue("'" + double20 + "' != '" + 2025.0d + "'", double20 == 2025.0d);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertTrue("'" + long22 + "' != '" + 2L + "'", long22 == 2L);
    }

    @Test
    public void test13648() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest27.test13648");
        org.apache.commons.math.stat.descriptive.moment.Variance variance1 = new org.apache.commons.math.stat.descriptive.moment.Variance(true);
        long long2 = variance1.getN();
        double double3 = variance1.getResult();
        double double4 = variance1.getResult();
        double double5 = variance1.getResult();
        double double6 = variance1.getResult();
        org.apache.commons.math.stat.descriptive.moment.Variance variance7 = new org.apache.commons.math.stat.descriptive.moment.Variance();
        org.apache.commons.math.stat.descriptive.moment.SecondMoment secondMoment8 = new org.apache.commons.math.stat.descriptive.moment.SecondMoment();
        secondMoment8.increment(1.0d);
        secondMoment8.increment((double) (short) 0);
        double double13 = secondMoment8.getResult();
        org.apache.commons.math.stat.descriptive.moment.SecondMoment secondMoment14 = new org.apache.commons.math.stat.descriptive.moment.SecondMoment();
        secondMoment14.increment(1.0d);
        double[] doubleArray20 = new double[] { (-1L), 0, 10L };
        secondMoment14.incrementAll(doubleArray20, 0, 0);
        double double24 = secondMoment8.evaluate(doubleArray20);
        double[] doubleArray25 = new double[] {};
        secondMoment8.incrementAll(doubleArray25);
        double double29 = variance7.evaluate(doubleArray25, (int) (byte) 0, 0);
        long long30 = variance7.getN();
        org.apache.commons.math.stat.descriptive.moment.SecondMoment secondMoment31 = new org.apache.commons.math.stat.descriptive.moment.SecondMoment();
        secondMoment31.increment(1.0d);
        secondMoment31.increment((double) (short) 0);
        double double36 = secondMoment31.getResult();
        org.apache.commons.math.stat.descriptive.moment.SecondMoment secondMoment37 = new org.apache.commons.math.stat.descriptive.moment.SecondMoment();
        secondMoment37.increment(1.0d);
        double[] doubleArray43 = new double[] { (-1L), 0, 10L };
        secondMoment37.incrementAll(doubleArray43, 0, 0);
        double double47 = secondMoment31.evaluate(doubleArray43);
        variance7.incrementAll(doubleArray43);
        long long49 = variance7.getN();
        variance7.clear();
        org.apache.commons.math.stat.descriptive.moment.SecondMoment secondMoment52 = new org.apache.commons.math.stat.descriptive.moment.SecondMoment();
        secondMoment52.increment(1.0d);
        secondMoment52.increment((double) (short) 0);
        long long57 = secondMoment52.getN();
        org.apache.commons.math.stat.descriptive.moment.Variance variance58 = new org.apache.commons.math.stat.descriptive.moment.Variance(false, secondMoment52);
        org.apache.commons.math.stat.descriptive.moment.SecondMoment secondMoment59 = new org.apache.commons.math.stat.descriptive.moment.SecondMoment();
        secondMoment59.increment(1.0d);
        secondMoment59.increment((double) (short) 0);
        double double64 = secondMoment59.getResult();
        org.apache.commons.math.stat.descriptive.moment.SecondMoment secondMoment65 = new org.apache.commons.math.stat.descriptive.moment.SecondMoment();
        secondMoment65.increment(1.0d);
        secondMoment65.increment((double) (short) 0);
        double double70 = secondMoment65.getResult();
        org.apache.commons.math.stat.descriptive.moment.SecondMoment secondMoment71 = new org.apache.commons.math.stat.descriptive.moment.SecondMoment();
        secondMoment71.increment(1.0d);
        double[] doubleArray77 = new double[] { (-1L), 0, 10L };
        secondMoment71.incrementAll(doubleArray77, 0, 0);
        double double81 = secondMoment65.evaluate(doubleArray77);
        double[] doubleArray82 = new double[] {};
        secondMoment65.incrementAll(doubleArray82);
        secondMoment59.incrementAll(doubleArray82);
        secondMoment52.incrementAll(doubleArray82);
        double double86 = variance7.evaluate(doubleArray82);
        double double87 = variance1.evaluate(doubleArray82);
        variance1.increment(392.0d);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 0L + "'", long2 == 0L);
        org.junit.Assert.assertTrue(Double.isNaN(double3));
        org.junit.Assert.assertTrue(Double.isNaN(double4));
        org.junit.Assert.assertTrue(Double.isNaN(double5));
        org.junit.Assert.assertTrue(Double.isNaN(double6));
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 0.5d + "'", double13 == 0.5d);
        org.junit.Assert.assertNotNull(doubleArray20);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray20), "[-1.0, 0.0, 10.0]");
        org.junit.Assert.assertTrue("'" + double24 + "' != '" + 74.0d + "'", double24 == 74.0d);
        org.junit.Assert.assertNotNull(doubleArray25);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray25), "[]");
        org.junit.Assert.assertTrue(Double.isNaN(double29));
        org.junit.Assert.assertTrue("'" + long30 + "' != '" + 0L + "'", long30 == 0L);
        org.junit.Assert.assertTrue("'" + double36 + "' != '" + 0.5d + "'", double36 == 0.5d);
        org.junit.Assert.assertNotNull(doubleArray43);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray43), "[-1.0, 0.0, 10.0]");
        org.junit.Assert.assertTrue("'" + double47 + "' != '" + 74.0d + "'", double47 == 74.0d);
        org.junit.Assert.assertTrue("'" + long49 + "' != '" + 3L + "'", long49 == 3L);
        org.junit.Assert.assertTrue("'" + long57 + "' != '" + 2L + "'", long57 == 2L);
        org.junit.Assert.assertTrue("'" + double64 + "' != '" + 0.5d + "'", double64 == 0.5d);
        org.junit.Assert.assertTrue("'" + double70 + "' != '" + 0.5d + "'", double70 == 0.5d);
        org.junit.Assert.assertNotNull(doubleArray77);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray77), "[-1.0, 0.0, 10.0]");
        org.junit.Assert.assertTrue("'" + double81 + "' != '" + 74.0d + "'", double81 == 74.0d);
        org.junit.Assert.assertNotNull(doubleArray82);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray82), "[]");
        org.junit.Assert.assertTrue(Double.isNaN(double86));
        org.junit.Assert.assertTrue(Double.isNaN(double87));
    }

    @Test
    public void test13649() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest27.test13649");
        org.apache.commons.math.stat.descriptive.moment.SecondMoment secondMoment2 = new org.apache.commons.math.stat.descriptive.moment.SecondMoment();
        secondMoment2.increment((double) ' ');
        org.apache.commons.math.stat.descriptive.moment.Variance variance5 = new org.apache.commons.math.stat.descriptive.moment.Variance(secondMoment2);
        secondMoment2.increment((double) '4');
        double double8 = secondMoment2.getResult();
        secondMoment2.increment((double) (short) 0);
        org.apache.commons.math.stat.descriptive.moment.Variance variance11 = new org.apache.commons.math.stat.descriptive.moment.Variance(secondMoment2);
        secondMoment2.increment(5.49755813888E11d);
        org.apache.commons.math.stat.descriptive.moment.Variance variance14 = new org.apache.commons.math.stat.descriptive.moment.Variance(false, secondMoment2);
        org.apache.commons.math.stat.descriptive.moment.Variance variance15 = new org.apache.commons.math.stat.descriptive.moment.Variance(false, secondMoment2);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 200.0d + "'", double8 == 200.0d);
    }

    @Test
    public void test13650() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest27.test13650");
        org.apache.commons.math.stat.descriptive.moment.SecondMoment secondMoment1 = new org.apache.commons.math.stat.descriptive.moment.SecondMoment();
        secondMoment1.increment((double) ' ');
        org.apache.commons.math.stat.descriptive.moment.Variance variance4 = new org.apache.commons.math.stat.descriptive.moment.Variance(secondMoment1);
        secondMoment1.increment(272.25d);
        secondMoment1.increment((double) 100L);
        org.apache.commons.math.stat.descriptive.moment.SecondMoment secondMoment9 = new org.apache.commons.math.stat.descriptive.moment.SecondMoment();
        secondMoment9.increment((double) ' ');
        org.apache.commons.math.stat.descriptive.moment.Variance variance12 = new org.apache.commons.math.stat.descriptive.moment.Variance(secondMoment9);
        secondMoment9.increment((double) (short) -1);
        secondMoment9.clear();
        secondMoment9.increment((double) 0L);
        org.apache.commons.math.stat.descriptive.moment.Variance variance18 = new org.apache.commons.math.stat.descriptive.moment.Variance(secondMoment9);
        long long19 = variance18.getN();
        org.apache.commons.math.stat.descriptive.moment.SecondMoment secondMoment20 = new org.apache.commons.math.stat.descriptive.moment.SecondMoment();
        secondMoment20.increment(1.0d);
        org.apache.commons.math.stat.descriptive.moment.SecondMoment secondMoment23 = new org.apache.commons.math.stat.descriptive.moment.SecondMoment();
        secondMoment23.increment(1.0d);
        secondMoment23.increment((double) (short) 0);
        double double28 = secondMoment23.getResult();
        org.apache.commons.math.stat.descriptive.moment.SecondMoment secondMoment29 = new org.apache.commons.math.stat.descriptive.moment.SecondMoment();
        secondMoment29.increment(1.0d);
        double[] doubleArray35 = new double[] { (-1L), 0, 10L };
        secondMoment29.incrementAll(doubleArray35, 0, 0);
        double double39 = secondMoment23.evaluate(doubleArray35);
        double[] doubleArray40 = new double[] {};
        secondMoment23.incrementAll(doubleArray40);
        double double42 = secondMoment20.evaluate(doubleArray40);
        double double43 = variance18.evaluate(doubleArray40);
        secondMoment1.incrementAll(doubleArray40, (int) (byte) 0, (int) (byte) 0);
        secondMoment1.clear();
        secondMoment1.clear();
        org.apache.commons.math.stat.descriptive.moment.Variance variance49 = new org.apache.commons.math.stat.descriptive.moment.Variance(false, secondMoment1);
        secondMoment1.clear();
        secondMoment1.clear();
        org.junit.Assert.assertTrue("'" + long19 + "' != '" + 1L + "'", long19 == 1L);
        org.junit.Assert.assertTrue("'" + double28 + "' != '" + 0.5d + "'", double28 == 0.5d);
        org.junit.Assert.assertNotNull(doubleArray35);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray35), "[-1.0, 0.0, 10.0]");
        org.junit.Assert.assertTrue("'" + double39 + "' != '" + 74.0d + "'", double39 == 74.0d);
        org.junit.Assert.assertNotNull(doubleArray40);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray40), "[]");
        org.junit.Assert.assertTrue("'" + double42 + "' != '" + 0.0d + "'", double42 == 0.0d);
        org.junit.Assert.assertTrue(Double.isNaN(double43));
    }

    @Test
    public void test13651() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest27.test13651");
        org.apache.commons.math.stat.descriptive.moment.SecondMoment secondMoment0 = new org.apache.commons.math.stat.descriptive.moment.SecondMoment();
        secondMoment0.increment(1.0d);
        double[] doubleArray6 = new double[] { (-1L), 0, 10L };
        secondMoment0.incrementAll(doubleArray6, 0, 0);
        org.apache.commons.math.stat.descriptive.moment.Variance variance10 = new org.apache.commons.math.stat.descriptive.moment.Variance(secondMoment0);
        secondMoment0.increment(7434.8d);
        secondMoment0.increment(0.0d);
        org.junit.Assert.assertNotNull(doubleArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray6), "[-1.0, 0.0, 10.0]");
    }

    @Test
    public void test13652() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest27.test13652");
        org.apache.commons.math.stat.descriptive.moment.SecondMoment secondMoment0 = new org.apache.commons.math.stat.descriptive.moment.SecondMoment();
        secondMoment0.increment(1.0d);
        org.apache.commons.math.stat.descriptive.moment.SecondMoment secondMoment3 = new org.apache.commons.math.stat.descriptive.moment.SecondMoment();
        secondMoment3.increment(1.0d);
        secondMoment3.increment((double) (short) 0);
        double double8 = secondMoment3.getResult();
        org.apache.commons.math.stat.descriptive.moment.SecondMoment secondMoment9 = new org.apache.commons.math.stat.descriptive.moment.SecondMoment();
        secondMoment9.increment(1.0d);
        double[] doubleArray15 = new double[] { (-1L), 0, 10L };
        secondMoment9.incrementAll(doubleArray15, 0, 0);
        double double19 = secondMoment3.evaluate(doubleArray15);
        double[] doubleArray20 = new double[] {};
        secondMoment3.incrementAll(doubleArray20);
        double double22 = secondMoment0.evaluate(doubleArray20);
        secondMoment0.increment((double) 3L);
        org.apache.commons.math.stat.descriptive.moment.SecondMoment secondMoment25 = new org.apache.commons.math.stat.descriptive.moment.SecondMoment();
        secondMoment25.increment((double) ' ');
        org.apache.commons.math.stat.descriptive.moment.Variance variance28 = new org.apache.commons.math.stat.descriptive.moment.Variance(secondMoment25);
        secondMoment25.increment((double) (short) -1);
        secondMoment25.clear();
        secondMoment25.increment((double) 'a');
        org.apache.commons.math.stat.descriptive.moment.SecondMoment secondMoment34 = new org.apache.commons.math.stat.descriptive.moment.SecondMoment();
        secondMoment34.increment(1.0d);
        secondMoment34.increment((double) (short) 0);
        boolean boolean39 = secondMoment25.equals((java.lang.Object) secondMoment34);
        secondMoment25.clear();
        long long41 = secondMoment25.getN();
        org.apache.commons.math.stat.descriptive.moment.SecondMoment secondMoment43 = new org.apache.commons.math.stat.descriptive.moment.SecondMoment();
        secondMoment43.increment(1.0d);
        secondMoment43.increment((double) (short) 0);
        long long48 = secondMoment43.getN();
        org.apache.commons.math.stat.descriptive.moment.Variance variance49 = new org.apache.commons.math.stat.descriptive.moment.Variance(false, secondMoment43);
        org.apache.commons.math.stat.descriptive.moment.SecondMoment secondMoment50 = new org.apache.commons.math.stat.descriptive.moment.SecondMoment();
        secondMoment50.increment((double) ' ');
        org.apache.commons.math.stat.descriptive.moment.Variance variance53 = new org.apache.commons.math.stat.descriptive.moment.Variance(secondMoment50);
        secondMoment50.increment((double) (short) -1);
        secondMoment50.clear();
        secondMoment50.increment((double) 'a');
        org.apache.commons.math.stat.descriptive.moment.SecondMoment secondMoment59 = new org.apache.commons.math.stat.descriptive.moment.SecondMoment();
        secondMoment59.increment(1.0d);
        secondMoment59.increment((double) (short) 0);
        boolean boolean64 = secondMoment50.equals((java.lang.Object) secondMoment59);
        org.apache.commons.math.stat.descriptive.moment.SecondMoment secondMoment65 = new org.apache.commons.math.stat.descriptive.moment.SecondMoment();
        secondMoment65.increment(1.0d);
        org.apache.commons.math.stat.descriptive.moment.SecondMoment secondMoment68 = new org.apache.commons.math.stat.descriptive.moment.SecondMoment();
        secondMoment68.increment(1.0d);
        double[] doubleArray74 = new double[] { (-1L), 0, 10L };
        secondMoment68.incrementAll(doubleArray74, 0, 0);
        double[] doubleArray80 = new double[] { 10, (byte) 100 };
        double double81 = secondMoment68.evaluate(doubleArray80);
        double double82 = secondMoment65.evaluate(doubleArray80);
        secondMoment50.incrementAll(doubleArray80);
        secondMoment43.incrementAll(doubleArray80, (int) (short) 0, 0);
        double double87 = secondMoment25.evaluate(doubleArray80);
        double double90 = secondMoment0.evaluate(doubleArray80, (int) (short) 1, (int) (byte) 0);
        long long91 = secondMoment0.getN();
        secondMoment0.clear();
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 0.5d + "'", double8 == 0.5d);
        org.junit.Assert.assertNotNull(doubleArray15);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray15), "[-1.0, 0.0, 10.0]");
        org.junit.Assert.assertTrue("'" + double19 + "' != '" + 74.0d + "'", double19 == 74.0d);
        org.junit.Assert.assertNotNull(doubleArray20);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray20), "[]");
        org.junit.Assert.assertTrue("'" + double22 + "' != '" + 0.0d + "'", double22 == 0.0d);
        org.junit.Assert.assertTrue("'" + boolean39 + "' != '" + false + "'", boolean39 == false);
        org.junit.Assert.assertTrue("'" + long41 + "' != '" + 0L + "'", long41 == 0L);
        org.junit.Assert.assertTrue("'" + long48 + "' != '" + 2L + "'", long48 == 2L);
        org.junit.Assert.assertTrue("'" + boolean64 + "' != '" + false + "'", boolean64 == false);
        org.junit.Assert.assertNotNull(doubleArray74);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray74), "[-1.0, 0.0, 10.0]");
        org.junit.Assert.assertNotNull(doubleArray80);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray80), "[10.0, 100.0]");
        org.junit.Assert.assertTrue("'" + double81 + "' != '" + 4050.0d + "'", double81 == 4050.0d);
        org.junit.Assert.assertTrue("'" + double82 + "' != '" + 4050.0d + "'", double82 == 4050.0d);
        org.junit.Assert.assertTrue("'" + double87 + "' != '" + 4050.0d + "'", double87 == 4050.0d);
        org.junit.Assert.assertTrue("'" + double90 + "' != '" + 2.0d + "'", double90 == 2.0d);
        org.junit.Assert.assertTrue("'" + long91 + "' != '" + 2L + "'", long91 == 2L);
    }

    @Test
    public void test13653() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest27.test13653");
        org.apache.commons.math.stat.descriptive.moment.SecondMoment secondMoment1 = new org.apache.commons.math.stat.descriptive.moment.SecondMoment();
        secondMoment1.increment(1.0d);
        secondMoment1.increment((double) (short) 0);
        long long6 = secondMoment1.getN();
        double double7 = secondMoment1.getResult();
        secondMoment1.increment((double) (byte) 10);
        double double10 = secondMoment1.getResult();
        secondMoment1.clear();
        org.apache.commons.math.stat.descriptive.moment.SecondMoment secondMoment12 = new org.apache.commons.math.stat.descriptive.moment.SecondMoment();
        secondMoment12.increment(1.0d);
        double[] doubleArray18 = new double[] { (-1L), 0, 10L };
        secondMoment12.incrementAll(doubleArray18, 0, 0);
        double[] doubleArray24 = new double[] { 10, (byte) 100 };
        double double25 = secondMoment12.evaluate(doubleArray24);
        double double26 = secondMoment1.evaluate(doubleArray24);
        org.apache.commons.math.stat.descriptive.moment.Variance variance27 = new org.apache.commons.math.stat.descriptive.moment.Variance(false, secondMoment1);
        org.apache.commons.math.stat.descriptive.moment.Variance variance28 = new org.apache.commons.math.stat.descriptive.moment.Variance(secondMoment1);
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 2L + "'", long6 == 2L);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 0.5d + "'", double7 == 0.5d);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 60.666666666666664d + "'", double10 == 60.666666666666664d);
        org.junit.Assert.assertNotNull(doubleArray18);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray18), "[-1.0, 0.0, 10.0]");
        org.junit.Assert.assertNotNull(doubleArray24);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray24), "[10.0, 100.0]");
        org.junit.Assert.assertTrue("'" + double25 + "' != '" + 4050.0d + "'", double25 == 4050.0d);
        org.junit.Assert.assertTrue("'" + double26 + "' != '" + 4050.0d + "'", double26 == 4050.0d);
    }

    @Test
    public void test13654() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest27.test13654");
        org.apache.commons.math.stat.descriptive.moment.SecondMoment secondMoment0 = new org.apache.commons.math.stat.descriptive.moment.SecondMoment();
        secondMoment0.increment(1.0d);
        double[] doubleArray6 = new double[] { (-1L), 0, 10L };
        secondMoment0.incrementAll(doubleArray6, 0, 0);
        org.apache.commons.math.stat.descriptive.moment.Variance variance10 = new org.apache.commons.math.stat.descriptive.moment.Variance(secondMoment0);
        long long11 = variance10.getN();
        org.apache.commons.math.stat.descriptive.moment.SecondMoment secondMoment12 = new org.apache.commons.math.stat.descriptive.moment.SecondMoment();
        secondMoment12.increment(1.0d);
        double[] doubleArray18 = new double[] { (-1L), 0, 10L };
        secondMoment12.incrementAll(doubleArray18, 0, 0);
        double double23 = variance10.evaluate(doubleArray18, (double) (short) -1);
        double double24 = variance10.getResult();
        variance10.setBiasCorrected(true);
        org.apache.commons.math.stat.descriptive.moment.Variance variance27 = new org.apache.commons.math.stat.descriptive.moment.Variance();
        org.apache.commons.math.stat.descriptive.moment.SecondMoment secondMoment28 = new org.apache.commons.math.stat.descriptive.moment.SecondMoment();
        secondMoment28.increment(1.0d);
        secondMoment28.increment((double) (short) 0);
        double double33 = secondMoment28.getResult();
        org.apache.commons.math.stat.descriptive.moment.SecondMoment secondMoment34 = new org.apache.commons.math.stat.descriptive.moment.SecondMoment();
        secondMoment34.increment(1.0d);
        secondMoment34.increment((double) (short) 0);
        double double39 = secondMoment34.getResult();
        org.apache.commons.math.stat.descriptive.moment.SecondMoment secondMoment40 = new org.apache.commons.math.stat.descriptive.moment.SecondMoment();
        secondMoment40.increment(1.0d);
        double[] doubleArray46 = new double[] { (-1L), 0, 10L };
        secondMoment40.incrementAll(doubleArray46, 0, 0);
        double double50 = secondMoment34.evaluate(doubleArray46);
        double[] doubleArray51 = new double[] {};
        secondMoment34.incrementAll(doubleArray51);
        secondMoment28.incrementAll(doubleArray51);
        secondMoment28.increment((double) 2L);
        org.apache.commons.math.stat.descriptive.moment.Variance variance56 = new org.apache.commons.math.stat.descriptive.moment.Variance(secondMoment28);
        org.apache.commons.math.stat.descriptive.moment.SecondMoment secondMoment57 = new org.apache.commons.math.stat.descriptive.moment.SecondMoment();
        secondMoment57.increment(1.0d);
        double[] doubleArray63 = new double[] { (-1L), 0, 10L };
        secondMoment57.incrementAll(doubleArray63, 0, 0);
        double[] doubleArray69 = new double[] { 10, (byte) 100 };
        double double70 = secondMoment57.evaluate(doubleArray69);
        double double71 = variance56.evaluate(doubleArray69);
        double double72 = variance27.evaluate(doubleArray69);
        double double73 = variance10.evaluate(doubleArray69);
        variance10.clear();
        variance10.setBiasCorrected(false);
        long long77 = variance10.getN();
        variance10.increment(36.916666666666664d);
        variance10.clear();
        org.junit.Assert.assertNotNull(doubleArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray6), "[-1.0, 0.0, 10.0]");
        org.junit.Assert.assertTrue("'" + long11 + "' != '" + 1L + "'", long11 == 1L);
        org.junit.Assert.assertNotNull(doubleArray18);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray18), "[-1.0, 0.0, 10.0]");
        org.junit.Assert.assertTrue("'" + double23 + "' != '" + 37.0d + "'", double23 == 37.0d);
        org.junit.Assert.assertTrue("'" + double24 + "' != '" + 0.0d + "'", double24 == 0.0d);
        org.junit.Assert.assertTrue("'" + double33 + "' != '" + 0.5d + "'", double33 == 0.5d);
        org.junit.Assert.assertTrue("'" + double39 + "' != '" + 0.5d + "'", double39 == 0.5d);
        org.junit.Assert.assertNotNull(doubleArray46);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray46), "[-1.0, 0.0, 10.0]");
        org.junit.Assert.assertTrue("'" + double50 + "' != '" + 74.0d + "'", double50 == 74.0d);
        org.junit.Assert.assertNotNull(doubleArray51);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray51), "[]");
        org.junit.Assert.assertNotNull(doubleArray63);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray63), "[-1.0, 0.0, 10.0]");
        org.junit.Assert.assertNotNull(doubleArray69);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray69), "[10.0, 100.0]");
        org.junit.Assert.assertTrue("'" + double70 + "' != '" + 4050.0d + "'", double70 == 4050.0d);
        org.junit.Assert.assertTrue("'" + double71 + "' != '" + 4050.0d + "'", double71 == 4050.0d);
        org.junit.Assert.assertTrue("'" + double72 + "' != '" + 4050.0d + "'", double72 == 4050.0d);
        org.junit.Assert.assertTrue("'" + double73 + "' != '" + 4050.0d + "'", double73 == 4050.0d);
        org.junit.Assert.assertTrue("'" + long77 + "' != '" + 1L + "'", long77 == 1L);
    }

    @Test
    public void test13655() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest27.test13655");
        org.apache.commons.math.stat.descriptive.moment.SecondMoment secondMoment0 = new org.apache.commons.math.stat.descriptive.moment.SecondMoment();
        secondMoment0.increment(1.0d);
        secondMoment0.increment((double) (short) 0);
        long long5 = secondMoment0.getN();
        double double6 = secondMoment0.getResult();
        double double7 = secondMoment0.getResult();
        secondMoment0.increment(0.5d);
        org.apache.commons.math.stat.descriptive.moment.SecondMoment secondMoment11 = new org.apache.commons.math.stat.descriptive.moment.SecondMoment();
        secondMoment11.increment(1.0d);
        secondMoment11.increment((double) (short) 0);
        double double16 = secondMoment11.getResult();
        org.apache.commons.math.stat.descriptive.moment.SecondMoment secondMoment18 = new org.apache.commons.math.stat.descriptive.moment.SecondMoment();
        secondMoment18.increment(1.0d);
        double[] doubleArray24 = new double[] { (-1L), 0, 10L };
        secondMoment18.incrementAll(doubleArray24, 0, 0);
        double[] doubleArray30 = new double[] { 10, (byte) 100 };
        double double31 = secondMoment18.evaluate(doubleArray30);
        double double32 = secondMoment18.getResult();
        long long33 = secondMoment18.getN();
        long long34 = secondMoment18.getN();
        org.apache.commons.math.stat.descriptive.moment.Variance variance35 = new org.apache.commons.math.stat.descriptive.moment.Variance(true, secondMoment18);
        boolean boolean36 = secondMoment11.equals((java.lang.Object) secondMoment18);
        org.apache.commons.math.stat.descriptive.moment.Variance variance37 = new org.apache.commons.math.stat.descriptive.moment.Variance(false, secondMoment11);
        org.apache.commons.math.stat.descriptive.moment.Variance variance38 = new org.apache.commons.math.stat.descriptive.moment.Variance(secondMoment11);
        variance38.clear();
        variance38.clear();
        double double41 = variance38.getResult();
        variance38.clear();
        long long43 = variance38.getN();
        boolean boolean44 = secondMoment0.equals((java.lang.Object) long43);
        double double45 = secondMoment0.getResult();
        double double46 = secondMoment0.getResult();
        org.apache.commons.math.stat.descriptive.moment.Variance variance47 = new org.apache.commons.math.stat.descriptive.moment.Variance(secondMoment0);
        double double48 = variance47.getResult();
        boolean boolean49 = variance47.isBiasCorrected();
        variance47.clear();
        variance47.clear();
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 2L + "'", long5 == 2L);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.5d + "'", double6 == 0.5d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 0.5d + "'", double7 == 0.5d);
        org.junit.Assert.assertTrue("'" + double16 + "' != '" + 0.5d + "'", double16 == 0.5d);
        org.junit.Assert.assertNotNull(doubleArray24);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray24), "[-1.0, 0.0, 10.0]");
        org.junit.Assert.assertNotNull(doubleArray30);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray30), "[10.0, 100.0]");
        org.junit.Assert.assertTrue("'" + double31 + "' != '" + 4050.0d + "'", double31 == 4050.0d);
        org.junit.Assert.assertTrue("'" + double32 + "' != '" + 4050.0d + "'", double32 == 4050.0d);
        org.junit.Assert.assertTrue("'" + long33 + "' != '" + 2L + "'", long33 == 2L);
        org.junit.Assert.assertTrue("'" + long34 + "' != '" + 2L + "'", long34 == 2L);
        org.junit.Assert.assertTrue("'" + boolean36 + "' != '" + false + "'", boolean36 == false);
        org.junit.Assert.assertTrue("'" + double41 + "' != '" + 0.5d + "'", double41 == 0.5d);
        org.junit.Assert.assertTrue("'" + long43 + "' != '" + 2L + "'", long43 == 2L);
        org.junit.Assert.assertTrue("'" + boolean44 + "' != '" + false + "'", boolean44 == false);
        org.junit.Assert.assertTrue("'" + double45 + "' != '" + 0.5d + "'", double45 == 0.5d);
        org.junit.Assert.assertTrue("'" + double46 + "' != '" + 0.5d + "'", double46 == 0.5d);
        org.junit.Assert.assertTrue("'" + double48 + "' != '" + 0.25d + "'", double48 == 0.25d);
        org.junit.Assert.assertTrue("'" + boolean49 + "' != '" + true + "'", boolean49 == true);
    }

    @Test
    public void test13656() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest27.test13656");
        org.apache.commons.math.stat.descriptive.moment.SecondMoment secondMoment1 = new org.apache.commons.math.stat.descriptive.moment.SecondMoment();
        secondMoment1.increment(1.0d);
        secondMoment1.increment((double) 10L);
        org.apache.commons.math.stat.descriptive.moment.SecondMoment secondMoment6 = new org.apache.commons.math.stat.descriptive.moment.SecondMoment();
        secondMoment6.increment(1.0d);
        secondMoment6.increment((double) (short) 0);
        double double11 = secondMoment6.getResult();
        org.apache.commons.math.stat.descriptive.moment.SecondMoment secondMoment12 = new org.apache.commons.math.stat.descriptive.moment.SecondMoment();
        secondMoment12.increment(1.0d);
        secondMoment12.increment((double) (short) 0);
        double double17 = secondMoment12.getResult();
        org.apache.commons.math.stat.descriptive.moment.SecondMoment secondMoment18 = new org.apache.commons.math.stat.descriptive.moment.SecondMoment();
        secondMoment18.increment(1.0d);
        double[] doubleArray24 = new double[] { (-1L), 0, 10L };
        secondMoment18.incrementAll(doubleArray24, 0, 0);
        double double28 = secondMoment12.evaluate(doubleArray24);
        double[] doubleArray29 = new double[] {};
        secondMoment12.incrementAll(doubleArray29);
        secondMoment6.incrementAll(doubleArray29);
        secondMoment6.increment((double) 2L);
        org.apache.commons.math.stat.descriptive.moment.Variance variance34 = new org.apache.commons.math.stat.descriptive.moment.Variance(secondMoment6);
        org.apache.commons.math.stat.descriptive.moment.SecondMoment secondMoment35 = new org.apache.commons.math.stat.descriptive.moment.SecondMoment();
        secondMoment35.increment(1.0d);
        double[] doubleArray41 = new double[] { (-1L), 0, 10L };
        secondMoment35.incrementAll(doubleArray41, 0, 0);
        double[] doubleArray47 = new double[] { 10, (byte) 100 };
        double double48 = secondMoment35.evaluate(doubleArray47);
        double double49 = variance34.evaluate(doubleArray47);
        double double50 = secondMoment1.evaluate(doubleArray47);
        org.apache.commons.math.stat.descriptive.moment.SecondMoment secondMoment51 = new org.apache.commons.math.stat.descriptive.moment.SecondMoment();
        secondMoment51.increment(1.0d);
        secondMoment51.increment((double) (short) 0);
        double double56 = secondMoment51.getResult();
        org.apache.commons.math.stat.descriptive.moment.SecondMoment secondMoment57 = new org.apache.commons.math.stat.descriptive.moment.SecondMoment();
        secondMoment57.increment(1.0d);
        secondMoment57.increment((double) (short) 0);
        double double62 = secondMoment57.getResult();
        org.apache.commons.math.stat.descriptive.moment.SecondMoment secondMoment63 = new org.apache.commons.math.stat.descriptive.moment.SecondMoment();
        secondMoment63.increment(1.0d);
        double[] doubleArray69 = new double[] { (-1L), 0, 10L };
        secondMoment63.incrementAll(doubleArray69, 0, 0);
        double double73 = secondMoment57.evaluate(doubleArray69);
        double[] doubleArray74 = new double[] {};
        secondMoment57.incrementAll(doubleArray74);
        secondMoment51.incrementAll(doubleArray74);
        double double77 = secondMoment1.evaluate(doubleArray74);
        long long78 = secondMoment1.getN();
        secondMoment1.increment((double) (byte) 1);
        org.apache.commons.math.stat.descriptive.moment.Variance variance81 = new org.apache.commons.math.stat.descriptive.moment.Variance(true, secondMoment1);
        boolean boolean82 = variance81.isBiasCorrected();
        long long83 = variance81.getN();
        double double84 = variance81.getResult();
        variance81.increment(25.666666666666668d);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 0.5d + "'", double11 == 0.5d);
        org.junit.Assert.assertTrue("'" + double17 + "' != '" + 0.5d + "'", double17 == 0.5d);
        org.junit.Assert.assertNotNull(doubleArray24);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray24), "[-1.0, 0.0, 10.0]");
        org.junit.Assert.assertTrue("'" + double28 + "' != '" + 74.0d + "'", double28 == 74.0d);
        org.junit.Assert.assertNotNull(doubleArray29);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray29), "[]");
        org.junit.Assert.assertNotNull(doubleArray41);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray41), "[-1.0, 0.0, 10.0]");
        org.junit.Assert.assertNotNull(doubleArray47);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray47), "[10.0, 100.0]");
        org.junit.Assert.assertTrue("'" + double48 + "' != '" + 4050.0d + "'", double48 == 4050.0d);
        org.junit.Assert.assertTrue("'" + double49 + "' != '" + 4050.0d + "'", double49 == 4050.0d);
        org.junit.Assert.assertTrue("'" + double50 + "' != '" + 4050.0d + "'", double50 == 4050.0d);
        org.junit.Assert.assertTrue("'" + double56 + "' != '" + 0.5d + "'", double56 == 0.5d);
        org.junit.Assert.assertTrue("'" + double62 + "' != '" + 0.5d + "'", double62 == 0.5d);
        org.junit.Assert.assertNotNull(doubleArray69);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray69), "[-1.0, 0.0, 10.0]");
        org.junit.Assert.assertTrue("'" + double73 + "' != '" + 74.0d + "'", double73 == 74.0d);
        org.junit.Assert.assertNotNull(doubleArray74);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray74), "[]");
        org.junit.Assert.assertTrue("'" + double77 + "' != '" + 4050.0d + "'", double77 == 4050.0d);
        org.junit.Assert.assertTrue("'" + long78 + "' != '" + 2L + "'", long78 == 2L);
        org.junit.Assert.assertTrue("'" + boolean82 + "' != '" + true + "'", boolean82 == true);
        org.junit.Assert.assertTrue("'" + long83 + "' != '" + 3L + "'", long83 == 3L);
        org.junit.Assert.assertTrue("'" + double84 + "' != '" + 2997.0d + "'", double84 == 2997.0d);
    }

    @Test
    public void test13657() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest27.test13657");
        org.apache.commons.math.stat.descriptive.moment.SecondMoment secondMoment0 = new org.apache.commons.math.stat.descriptive.moment.SecondMoment();
        secondMoment0.increment((double) ' ');
        double double3 = secondMoment0.getResult();
        double double4 = secondMoment0.getResult();
        org.apache.commons.math.stat.descriptive.moment.SecondMoment secondMoment5 = new org.apache.commons.math.stat.descriptive.moment.SecondMoment();
        secondMoment5.increment(1.0d);
        double[] doubleArray11 = new double[] { (-1L), 0, 10L };
        secondMoment5.incrementAll(doubleArray11, 0, 0);
        double[] doubleArray17 = new double[] { 10, (byte) 100 };
        double double18 = secondMoment5.evaluate(doubleArray17);
        double double19 = secondMoment0.evaluate(doubleArray17);
        org.apache.commons.math.stat.descriptive.moment.Variance variance20 = new org.apache.commons.math.stat.descriptive.moment.Variance();
        org.apache.commons.math.stat.descriptive.moment.SecondMoment secondMoment21 = new org.apache.commons.math.stat.descriptive.moment.SecondMoment();
        secondMoment21.increment(1.0d);
        secondMoment21.increment((double) (short) 0);
        double double26 = secondMoment21.getResult();
        org.apache.commons.math.stat.descriptive.moment.SecondMoment secondMoment27 = new org.apache.commons.math.stat.descriptive.moment.SecondMoment();
        secondMoment27.increment(1.0d);
        secondMoment27.increment((double) (short) 0);
        double double32 = secondMoment27.getResult();
        org.apache.commons.math.stat.descriptive.moment.SecondMoment secondMoment33 = new org.apache.commons.math.stat.descriptive.moment.SecondMoment();
        secondMoment33.increment(1.0d);
        double[] doubleArray39 = new double[] { (-1L), 0, 10L };
        secondMoment33.incrementAll(doubleArray39, 0, 0);
        double double43 = secondMoment27.evaluate(doubleArray39);
        double[] doubleArray44 = new double[] {};
        secondMoment27.incrementAll(doubleArray44);
        secondMoment21.incrementAll(doubleArray44);
        secondMoment21.increment((double) 2L);
        org.apache.commons.math.stat.descriptive.moment.Variance variance49 = new org.apache.commons.math.stat.descriptive.moment.Variance(secondMoment21);
        org.apache.commons.math.stat.descriptive.moment.SecondMoment secondMoment50 = new org.apache.commons.math.stat.descriptive.moment.SecondMoment();
        secondMoment50.increment(1.0d);
        double[] doubleArray56 = new double[] { (-1L), 0, 10L };
        secondMoment50.incrementAll(doubleArray56, 0, 0);
        double[] doubleArray62 = new double[] { 10, (byte) 100 };
        double double63 = secondMoment50.evaluate(doubleArray62);
        double double64 = variance49.evaluate(doubleArray62);
        double double65 = variance20.evaluate(doubleArray62);
        double double66 = secondMoment0.evaluate(doubleArray62);
        secondMoment0.clear();
        double double68 = secondMoment0.getResult();
        long long69 = secondMoment0.getN();
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 0.0d + "'", double3 == 0.0d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 0.0d + "'", double4 == 0.0d);
        org.junit.Assert.assertNotNull(doubleArray11);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray11), "[-1.0, 0.0, 10.0]");
        org.junit.Assert.assertNotNull(doubleArray17);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray17), "[10.0, 100.0]");
        org.junit.Assert.assertTrue("'" + double18 + "' != '" + 4050.0d + "'", double18 == 4050.0d);
        org.junit.Assert.assertTrue("'" + double19 + "' != '" + 4050.0d + "'", double19 == 4050.0d);
        org.junit.Assert.assertTrue("'" + double26 + "' != '" + 0.5d + "'", double26 == 0.5d);
        org.junit.Assert.assertTrue("'" + double32 + "' != '" + 0.5d + "'", double32 == 0.5d);
        org.junit.Assert.assertNotNull(doubleArray39);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray39), "[-1.0, 0.0, 10.0]");
        org.junit.Assert.assertTrue("'" + double43 + "' != '" + 74.0d + "'", double43 == 74.0d);
        org.junit.Assert.assertNotNull(doubleArray44);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray44), "[]");
        org.junit.Assert.assertNotNull(doubleArray56);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray56), "[-1.0, 0.0, 10.0]");
        org.junit.Assert.assertNotNull(doubleArray62);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray62), "[10.0, 100.0]");
        org.junit.Assert.assertTrue("'" + double63 + "' != '" + 4050.0d + "'", double63 == 4050.0d);
        org.junit.Assert.assertTrue("'" + double64 + "' != '" + 4050.0d + "'", double64 == 4050.0d);
        org.junit.Assert.assertTrue("'" + double65 + "' != '" + 4050.0d + "'", double65 == 4050.0d);
        org.junit.Assert.assertTrue("'" + double66 + "' != '" + 4050.0d + "'", double66 == 4050.0d);
        org.junit.Assert.assertTrue(Double.isNaN(double68));
        org.junit.Assert.assertTrue("'" + long69 + "' != '" + 0L + "'", long69 == 0L);
    }

    @Test
    public void test13658() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest27.test13658");
        org.apache.commons.math.stat.descriptive.moment.SecondMoment secondMoment0 = new org.apache.commons.math.stat.descriptive.moment.SecondMoment();
        secondMoment0.increment((double) ' ');
        org.apache.commons.math.stat.descriptive.moment.Variance variance3 = new org.apache.commons.math.stat.descriptive.moment.Variance(secondMoment0);
        secondMoment0.increment((double) (short) -1);
        secondMoment0.clear();
        secondMoment0.increment((double) 0L);
        org.apache.commons.math.stat.descriptive.moment.Variance variance9 = new org.apache.commons.math.stat.descriptive.moment.Variance(secondMoment0);
        org.apache.commons.math.stat.descriptive.moment.SecondMoment secondMoment10 = new org.apache.commons.math.stat.descriptive.moment.SecondMoment();
        secondMoment10.increment(1.0d);
        double[] doubleArray16 = new double[] { (-1L), 0, 10L };
        secondMoment10.incrementAll(doubleArray16, 0, 0);
        variance9.incrementAll(doubleArray16);
        org.apache.commons.math.stat.descriptive.moment.SecondMoment secondMoment21 = new org.apache.commons.math.stat.descriptive.moment.SecondMoment();
        secondMoment21.increment((double) ' ');
        secondMoment21.increment((double) '4');
        long long26 = secondMoment21.getN();
        org.apache.commons.math.stat.descriptive.moment.Variance variance27 = new org.apache.commons.math.stat.descriptive.moment.Variance(secondMoment21);
        secondMoment21.clear();
        org.apache.commons.math.stat.descriptive.moment.Variance variance30 = new org.apache.commons.math.stat.descriptive.moment.Variance(true);
        variance30.clear();
        org.apache.commons.math.stat.descriptive.moment.SecondMoment secondMoment34 = new org.apache.commons.math.stat.descriptive.moment.SecondMoment();
        secondMoment34.increment(1.0d);
        double[] doubleArray40 = new double[] { (-1L), 0, 10L };
        secondMoment34.incrementAll(doubleArray40, 0, 0);
        double[] doubleArray46 = new double[] { 10, (byte) 100 };
        double double47 = secondMoment34.evaluate(doubleArray46);
        double double48 = secondMoment34.getResult();
        org.apache.commons.math.stat.descriptive.moment.Variance variance49 = new org.apache.commons.math.stat.descriptive.moment.Variance(false, secondMoment34);
        long long50 = secondMoment34.getN();
        org.apache.commons.math.stat.descriptive.moment.Variance variance51 = new org.apache.commons.math.stat.descriptive.moment.Variance(true, secondMoment34);
        double double52 = secondMoment34.getResult();
        secondMoment34.clear();
        secondMoment34.increment(Double.NaN);
        secondMoment34.increment((double) ' ');
        org.apache.commons.math.stat.descriptive.moment.Variance variance59 = new org.apache.commons.math.stat.descriptive.moment.Variance(true);
        long long60 = variance59.getN();
        org.apache.commons.math.stat.descriptive.moment.SecondMoment secondMoment61 = new org.apache.commons.math.stat.descriptive.moment.SecondMoment();
        secondMoment61.increment(1.0d);
        secondMoment61.increment((double) (short) 0);
        double double66 = secondMoment61.getResult();
        org.apache.commons.math.stat.descriptive.moment.SecondMoment secondMoment67 = new org.apache.commons.math.stat.descriptive.moment.SecondMoment();
        secondMoment67.increment(1.0d);
        double[] doubleArray73 = new double[] { (-1L), 0, 10L };
        secondMoment67.incrementAll(doubleArray73, 0, 0);
        double double77 = secondMoment61.evaluate(doubleArray73);
        variance59.incrementAll(doubleArray73);
        secondMoment34.incrementAll(doubleArray73);
        variance30.incrementAll(doubleArray73);
        double double83 = secondMoment21.evaluate(doubleArray73, 0, (int) (byte) 0);
        double double86 = variance9.evaluate(doubleArray73, 1, (int) (byte) 1);
        double double87 = variance9.getResult();
        variance9.clear();
        org.junit.Assert.assertNotNull(doubleArray16);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray16), "[-1.0, 0.0, 10.0]");
        org.junit.Assert.assertTrue("'" + long26 + "' != '" + 2L + "'", long26 == 2L);
        org.junit.Assert.assertNotNull(doubleArray40);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray40), "[-1.0, 0.0, 10.0]");
        org.junit.Assert.assertNotNull(doubleArray46);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray46), "[10.0, 100.0]");
        org.junit.Assert.assertTrue("'" + double47 + "' != '" + 4050.0d + "'", double47 == 4050.0d);
        org.junit.Assert.assertTrue("'" + double48 + "' != '" + 4050.0d + "'", double48 == 4050.0d);
        org.junit.Assert.assertTrue("'" + long50 + "' != '" + 2L + "'", long50 == 2L);
        org.junit.Assert.assertTrue("'" + double52 + "' != '" + 4050.0d + "'", double52 == 4050.0d);
        org.junit.Assert.assertTrue("'" + long60 + "' != '" + 0L + "'", long60 == 0L);
        org.junit.Assert.assertTrue("'" + double66 + "' != '" + 0.5d + "'", double66 == 0.5d);
        org.junit.Assert.assertNotNull(doubleArray73);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray73), "[-1.0, 0.0, 10.0]");
        org.junit.Assert.assertTrue("'" + double77 + "' != '" + 74.0d + "'", double77 == 74.0d);
        org.junit.Assert.assertTrue(Double.isNaN(double83));
        org.junit.Assert.assertTrue("'" + double86 + "' != '" + 0.0d + "'", double86 == 0.0d);
        org.junit.Assert.assertTrue("'" + double87 + "' != '" + 0.0d + "'", double87 == 0.0d);
    }

    @Test
    public void test13659() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest27.test13659");
        org.apache.commons.math.stat.descriptive.moment.SecondMoment secondMoment1 = new org.apache.commons.math.stat.descriptive.moment.SecondMoment();
        secondMoment1.increment(1.0d);
        double[] doubleArray7 = new double[] { (-1L), 0, 10L };
        secondMoment1.incrementAll(doubleArray7, 0, 0);
        double[] doubleArray13 = new double[] { 10, (byte) 100 };
        double double14 = secondMoment1.evaluate(doubleArray13);
        long long15 = secondMoment1.getN();
        secondMoment1.clear();
        double double17 = secondMoment1.getResult();
        secondMoment1.clear();
        org.apache.commons.math.stat.descriptive.moment.Variance variance19 = new org.apache.commons.math.stat.descriptive.moment.Variance(true, secondMoment1);
        org.apache.commons.math.stat.descriptive.moment.SecondMoment secondMoment20 = new org.apache.commons.math.stat.descriptive.moment.SecondMoment();
        secondMoment20.increment(1.0d);
        double[] doubleArray26 = new double[] { (-1L), 0, 10L };
        secondMoment20.incrementAll(doubleArray26, 0, 0);
        double double30 = variance19.evaluate(doubleArray26);
        org.apache.commons.math.stat.descriptive.moment.SecondMoment secondMoment31 = new org.apache.commons.math.stat.descriptive.moment.SecondMoment();
        secondMoment31.increment(1.0d);
        double[] doubleArray37 = new double[] { (-1L), 0, 10L };
        secondMoment31.incrementAll(doubleArray37, 0, 0);
        long long41 = secondMoment31.getN();
        org.apache.commons.math.stat.descriptive.moment.SecondMoment secondMoment42 = new org.apache.commons.math.stat.descriptive.moment.SecondMoment();
        secondMoment42.increment(1.0d);
        double[] doubleArray48 = new double[] { (-1L), 0, 10L };
        secondMoment42.incrementAll(doubleArray48, 0, 0);
        secondMoment31.incrementAll(doubleArray48, 0, (int) (short) 1);
        double double56 = variance19.evaluate(doubleArray48, (double) 100.0f);
        variance19.increment(2413.8518518518517d);
        variance19.clear();
        variance19.clear();
        java.lang.Class<?> wildcardClass61 = variance19.getClass();
        org.junit.Assert.assertNotNull(doubleArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray7), "[-1.0, 0.0, 10.0]");
        org.junit.Assert.assertNotNull(doubleArray13);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray13), "[10.0, 100.0]");
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + 4050.0d + "'", double14 == 4050.0d);
        org.junit.Assert.assertTrue("'" + long15 + "' != '" + 2L + "'", long15 == 2L);
        org.junit.Assert.assertTrue(Double.isNaN(double17));
        org.junit.Assert.assertNotNull(doubleArray26);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray26), "[-1.0, 0.0, 10.0]");
        org.junit.Assert.assertTrue("'" + double30 + "' != '" + 37.0d + "'", double30 == 37.0d);
        org.junit.Assert.assertNotNull(doubleArray37);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray37), "[-1.0, 0.0, 10.0]");
        org.junit.Assert.assertTrue("'" + long41 + "' != '" + 1L + "'", long41 == 1L);
        org.junit.Assert.assertNotNull(doubleArray48);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray48), "[-1.0, 0.0, 10.0]");
        org.junit.Assert.assertTrue("'" + double56 + "' != '" + 37.0d + "'", double56 == 37.0d);
        org.junit.Assert.assertNotNull(wildcardClass61);
    }

    @Test
    public void test13660() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest27.test13660");
        org.apache.commons.math.stat.descriptive.moment.SecondMoment secondMoment1 = new org.apache.commons.math.stat.descriptive.moment.SecondMoment();
        secondMoment1.increment(1.0d);
        double[] doubleArray7 = new double[] { (-1L), 0, 10L };
        secondMoment1.incrementAll(doubleArray7, 0, 0);
        double[] doubleArray13 = new double[] { 10, (byte) 100 };
        double double14 = secondMoment1.evaluate(doubleArray13);
        double double15 = secondMoment1.getResult();
        secondMoment1.increment((double) (short) -1);
        double double18 = secondMoment1.getResult();
        double double19 = secondMoment1.getResult();
        secondMoment1.clear();
        secondMoment1.increment(4402.666666666667d);
        double double23 = secondMoment1.getResult();
        org.apache.commons.math.stat.descriptive.moment.SecondMoment secondMoment24 = new org.apache.commons.math.stat.descriptive.moment.SecondMoment();
        secondMoment24.increment((double) ' ');
        secondMoment24.increment((double) (-1.0f));
        secondMoment24.clear();
        org.apache.commons.math.stat.descriptive.moment.SecondMoment secondMoment30 = new org.apache.commons.math.stat.descriptive.moment.SecondMoment();
        secondMoment30.increment(1.0d);
        double[] doubleArray36 = new double[] { (-1L), 0, 10L };
        secondMoment30.incrementAll(doubleArray36, 0, 0);
        org.apache.commons.math.stat.descriptive.moment.Variance variance40 = new org.apache.commons.math.stat.descriptive.moment.Variance(secondMoment30);
        long long41 = variance40.getN();
        org.apache.commons.math.stat.descriptive.moment.SecondMoment secondMoment42 = new org.apache.commons.math.stat.descriptive.moment.SecondMoment();
        secondMoment42.increment(1.0d);
        double[] doubleArray48 = new double[] { (-1L), 0, 10L };
        secondMoment42.incrementAll(doubleArray48, 0, 0);
        double double53 = variance40.evaluate(doubleArray48, (double) (short) -1);
        double double54 = secondMoment24.evaluate(doubleArray48);
        org.apache.commons.math.stat.descriptive.moment.Variance variance55 = new org.apache.commons.math.stat.descriptive.moment.Variance(secondMoment24);
        double double56 = variance55.getResult();
        variance55.clear();
        org.apache.commons.math.stat.descriptive.moment.SecondMoment secondMoment59 = new org.apache.commons.math.stat.descriptive.moment.SecondMoment();
        secondMoment59.increment((double) ' ');
        org.apache.commons.math.stat.descriptive.moment.Variance variance62 = new org.apache.commons.math.stat.descriptive.moment.Variance(secondMoment59);
        org.apache.commons.math.stat.descriptive.moment.Variance variance63 = new org.apache.commons.math.stat.descriptive.moment.Variance(false, secondMoment59);
        variance63.setBiasCorrected(true);
        double double66 = variance63.getResult();
        boolean boolean67 = variance55.equals((java.lang.Object) variance63);
        java.lang.Class<?> wildcardClass68 = variance63.getClass();
        boolean boolean69 = secondMoment1.equals((java.lang.Object) wildcardClass68);
        secondMoment1.clear();
        secondMoment1.increment(5922.666666666667d);
        secondMoment1.increment(5.5310751405070744E14d);
        secondMoment1.clear();
        long long76 = secondMoment1.getN();
        org.apache.commons.math.stat.descriptive.moment.Variance variance77 = new org.apache.commons.math.stat.descriptive.moment.Variance(false, secondMoment1);
        org.junit.Assert.assertNotNull(doubleArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray7), "[-1.0, 0.0, 10.0]");
        org.junit.Assert.assertNotNull(doubleArray13);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray13), "[10.0, 100.0]");
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + 4050.0d + "'", double14 == 4050.0d);
        org.junit.Assert.assertTrue("'" + double15 + "' != '" + 4050.0d + "'", double15 == 4050.0d);
        org.junit.Assert.assertTrue("'" + double18 + "' != '" + 6140.666666666667d + "'", double18 == 6140.666666666667d);
        org.junit.Assert.assertTrue("'" + double19 + "' != '" + 6140.666666666667d + "'", double19 == 6140.666666666667d);
        org.junit.Assert.assertTrue("'" + double23 + "' != '" + 0.0d + "'", double23 == 0.0d);
        org.junit.Assert.assertNotNull(doubleArray36);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray36), "[-1.0, 0.0, 10.0]");
        org.junit.Assert.assertTrue("'" + long41 + "' != '" + 1L + "'", long41 == 1L);
        org.junit.Assert.assertNotNull(doubleArray48);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray48), "[-1.0, 0.0, 10.0]");
        org.junit.Assert.assertTrue("'" + double53 + "' != '" + 37.0d + "'", double53 == 37.0d);
        org.junit.Assert.assertTrue("'" + double54 + "' != '" + 74.0d + "'", double54 == 74.0d);
        org.junit.Assert.assertTrue("'" + double56 + "' != '" + 37.0d + "'", double56 == 37.0d);
        org.junit.Assert.assertTrue("'" + double66 + "' != '" + 0.0d + "'", double66 == 0.0d);
        org.junit.Assert.assertTrue("'" + boolean67 + "' != '" + false + "'", boolean67 == false);
        org.junit.Assert.assertNotNull(wildcardClass68);
        org.junit.Assert.assertTrue("'" + boolean69 + "' != '" + false + "'", boolean69 == false);
        org.junit.Assert.assertTrue("'" + long76 + "' != '" + 0L + "'", long76 == 0L);
    }

    @Test
    public void test13661() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest27.test13661");
        org.apache.commons.math.stat.descriptive.moment.SecondMoment secondMoment2 = new org.apache.commons.math.stat.descriptive.moment.SecondMoment();
        secondMoment2.increment(1.0d);
        double[] doubleArray8 = new double[] { (-1L), 0, 10L };
        secondMoment2.incrementAll(doubleArray8, 0, 0);
        double[] doubleArray14 = new double[] { 10, (byte) 100 };
        double double15 = secondMoment2.evaluate(doubleArray14);
        double double16 = secondMoment2.getResult();
        org.apache.commons.math.stat.descriptive.moment.Variance variance17 = new org.apache.commons.math.stat.descriptive.moment.Variance(false, secondMoment2);
        long long18 = secondMoment2.getN();
        org.apache.commons.math.stat.descriptive.moment.Variance variance19 = new org.apache.commons.math.stat.descriptive.moment.Variance(true, secondMoment2);
        org.apache.commons.math.stat.descriptive.moment.SecondMoment secondMoment21 = new org.apache.commons.math.stat.descriptive.moment.SecondMoment();
        secondMoment21.increment(1.0d);
        double[] doubleArray27 = new double[] { (-1L), 0, 10L };
        secondMoment21.incrementAll(doubleArray27, 0, 0);
        double[] doubleArray33 = new double[] { 10, (byte) 100 };
        double double34 = secondMoment21.evaluate(doubleArray33);
        org.apache.commons.math.stat.descriptive.moment.SecondMoment secondMoment36 = new org.apache.commons.math.stat.descriptive.moment.SecondMoment();
        secondMoment36.increment((double) ' ');
        org.apache.commons.math.stat.descriptive.moment.Variance variance39 = new org.apache.commons.math.stat.descriptive.moment.Variance(secondMoment36);
        secondMoment36.increment((double) (short) -1);
        secondMoment36.clear();
        secondMoment36.increment((double) 0L);
        org.apache.commons.math.stat.descriptive.moment.Variance variance45 = new org.apache.commons.math.stat.descriptive.moment.Variance(false, secondMoment36);
        boolean boolean46 = secondMoment21.equals((java.lang.Object) secondMoment36);
        org.apache.commons.math.stat.descriptive.moment.Variance variance47 = new org.apache.commons.math.stat.descriptive.moment.Variance(false, secondMoment36);
        org.apache.commons.math.stat.descriptive.moment.Variance variance48 = new org.apache.commons.math.stat.descriptive.moment.Variance();
        org.apache.commons.math.stat.descriptive.moment.SecondMoment secondMoment49 = new org.apache.commons.math.stat.descriptive.moment.SecondMoment();
        secondMoment49.increment(1.0d);
        secondMoment49.increment((double) (short) 0);
        double double54 = secondMoment49.getResult();
        org.apache.commons.math.stat.descriptive.moment.SecondMoment secondMoment55 = new org.apache.commons.math.stat.descriptive.moment.SecondMoment();
        secondMoment55.increment(1.0d);
        double[] doubleArray61 = new double[] { (-1L), 0, 10L };
        secondMoment55.incrementAll(doubleArray61, 0, 0);
        double double65 = secondMoment49.evaluate(doubleArray61);
        double[] doubleArray66 = new double[] {};
        secondMoment49.incrementAll(doubleArray66);
        double double70 = variance48.evaluate(doubleArray66, (int) (byte) 0, 0);
        long long71 = variance48.getN();
        org.apache.commons.math.stat.descriptive.moment.SecondMoment secondMoment72 = new org.apache.commons.math.stat.descriptive.moment.SecondMoment();
        secondMoment72.increment(1.0d);
        secondMoment72.increment((double) (short) 0);
        double double77 = secondMoment72.getResult();
        org.apache.commons.math.stat.descriptive.moment.SecondMoment secondMoment78 = new org.apache.commons.math.stat.descriptive.moment.SecondMoment();
        secondMoment78.increment(1.0d);
        double[] doubleArray84 = new double[] { (-1L), 0, 10L };
        secondMoment78.incrementAll(doubleArray84, 0, 0);
        double double88 = secondMoment72.evaluate(doubleArray84);
        variance48.incrementAll(doubleArray84);
        double double91 = variance47.evaluate(doubleArray84, (double) '#');
        double double94 = variance19.evaluate(doubleArray84, 0, (int) (byte) 1);
        variance19.clear();
        boolean boolean96 = variance19.isBiasCorrected();
        variance19.increment(3.1992280221592915E12d);
        org.junit.Assert.assertNotNull(doubleArray8);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray8), "[-1.0, 0.0, 10.0]");
        org.junit.Assert.assertNotNull(doubleArray14);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray14), "[10.0, 100.0]");
        org.junit.Assert.assertTrue("'" + double15 + "' != '" + 4050.0d + "'", double15 == 4050.0d);
        org.junit.Assert.assertTrue("'" + double16 + "' != '" + 4050.0d + "'", double16 == 4050.0d);
        org.junit.Assert.assertTrue("'" + long18 + "' != '" + 2L + "'", long18 == 2L);
        org.junit.Assert.assertNotNull(doubleArray27);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray27), "[-1.0, 0.0, 10.0]");
        org.junit.Assert.assertNotNull(doubleArray33);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray33), "[10.0, 100.0]");
        org.junit.Assert.assertTrue("'" + double34 + "' != '" + 4050.0d + "'", double34 == 4050.0d);
        org.junit.Assert.assertTrue("'" + boolean46 + "' != '" + false + "'", boolean46 == false);
        org.junit.Assert.assertTrue("'" + double54 + "' != '" + 0.5d + "'", double54 == 0.5d);
        org.junit.Assert.assertNotNull(doubleArray61);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray61), "[-1.0, 0.0, 10.0]");
        org.junit.Assert.assertTrue("'" + double65 + "' != '" + 74.0d + "'", double65 == 74.0d);
        org.junit.Assert.assertNotNull(doubleArray66);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray66), "[]");
        org.junit.Assert.assertTrue(Double.isNaN(double70));
        org.junit.Assert.assertTrue("'" + long71 + "' != '" + 0L + "'", long71 == 0L);
        org.junit.Assert.assertTrue("'" + double77 + "' != '" + 0.5d + "'", double77 == 0.5d);
        org.junit.Assert.assertNotNull(doubleArray84);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray84), "[-1.0, 0.0, 10.0]");
        org.junit.Assert.assertTrue("'" + double88 + "' != '" + 74.0d + "'", double88 == 74.0d);
        org.junit.Assert.assertTrue("'" + double91 + "' != '" + 24.666666666666668d + "'", double91 == 24.666666666666668d);
        org.junit.Assert.assertTrue("'" + double94 + "' != '" + 0.0d + "'", double94 == 0.0d);
        org.junit.Assert.assertTrue("'" + boolean96 + "' != '" + true + "'", boolean96 == true);
    }

    @Test
    public void test13662() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest27.test13662");
        org.apache.commons.math.stat.descriptive.moment.SecondMoment secondMoment2 = new org.apache.commons.math.stat.descriptive.moment.SecondMoment();
        secondMoment2.increment((double) ' ');
        org.apache.commons.math.stat.descriptive.moment.Variance variance5 = new org.apache.commons.math.stat.descriptive.moment.Variance(secondMoment2);
        secondMoment2.increment((double) (short) -1);
        long long8 = secondMoment2.getN();
        double double9 = secondMoment2.getResult();
        org.apache.commons.math.stat.descriptive.moment.Variance variance10 = new org.apache.commons.math.stat.descriptive.moment.Variance(false, secondMoment2);
        org.apache.commons.math.stat.descriptive.moment.Variance variance11 = new org.apache.commons.math.stat.descriptive.moment.Variance(false, secondMoment2);
        org.apache.commons.math.stat.descriptive.moment.SecondMoment secondMoment12 = new org.apache.commons.math.stat.descriptive.moment.SecondMoment();
        secondMoment12.increment((double) ' ');
        double double15 = secondMoment12.getResult();
        double double16 = secondMoment12.getResult();
        boolean boolean17 = variance11.equals((java.lang.Object) secondMoment12);
        variance11.increment(4034.0d);
        long long20 = variance11.getN();
        variance11.increment(9696140.055555556d);
        org.apache.commons.math.stat.descriptive.moment.SecondMoment secondMoment24 = new org.apache.commons.math.stat.descriptive.moment.SecondMoment();
        secondMoment24.increment((double) ' ');
        org.apache.commons.math.stat.descriptive.moment.Variance variance27 = new org.apache.commons.math.stat.descriptive.moment.Variance(secondMoment24);
        secondMoment24.clear();
        org.apache.commons.math.stat.descriptive.moment.Variance variance29 = new org.apache.commons.math.stat.descriptive.moment.Variance(true, secondMoment24);
        long long30 = variance29.getN();
        double double31 = variance29.getResult();
        boolean boolean32 = variance29.isBiasCorrected();
        boolean boolean33 = variance29.isBiasCorrected();
        org.apache.commons.math.stat.descriptive.moment.SecondMoment secondMoment34 = new org.apache.commons.math.stat.descriptive.moment.SecondMoment();
        secondMoment34.increment((double) ' ');
        org.apache.commons.math.stat.descriptive.moment.Variance variance37 = new org.apache.commons.math.stat.descriptive.moment.Variance(secondMoment34);
        secondMoment34.increment((double) (short) -1);
        secondMoment34.clear();
        org.apache.commons.math.stat.descriptive.moment.SecondMoment secondMoment41 = new org.apache.commons.math.stat.descriptive.moment.SecondMoment();
        secondMoment41.increment(1.0d);
        double[] doubleArray47 = new double[] { (-1L), 0, 10L };
        secondMoment41.incrementAll(doubleArray47, 0, 0);
        org.apache.commons.math.stat.descriptive.moment.Variance variance51 = new org.apache.commons.math.stat.descriptive.moment.Variance(secondMoment41);
        org.apache.commons.math.stat.descriptive.moment.SecondMoment secondMoment52 = new org.apache.commons.math.stat.descriptive.moment.SecondMoment();
        secondMoment52.increment((double) ' ');
        secondMoment52.increment((double) (-1.0f));
        secondMoment52.clear();
        boolean boolean58 = variance51.equals((java.lang.Object) secondMoment52);
        org.apache.commons.math.stat.descriptive.moment.SecondMoment secondMoment59 = new org.apache.commons.math.stat.descriptive.moment.SecondMoment();
        secondMoment59.increment(1.0d);
        double[] doubleArray65 = new double[] { (-1L), 0, 10L };
        secondMoment59.incrementAll(doubleArray65, 0, 0);
        org.apache.commons.math.stat.descriptive.moment.Variance variance69 = new org.apache.commons.math.stat.descriptive.moment.Variance(secondMoment59);
        long long70 = variance69.getN();
        org.apache.commons.math.stat.descriptive.moment.SecondMoment secondMoment71 = new org.apache.commons.math.stat.descriptive.moment.SecondMoment();
        secondMoment71.increment(1.0d);
        double[] doubleArray77 = new double[] { (-1L), 0, 10L };
        secondMoment71.incrementAll(doubleArray77, 0, 0);
        double double82 = variance69.evaluate(doubleArray77, (double) (short) -1);
        boolean boolean83 = variance51.equals((java.lang.Object) doubleArray77);
        secondMoment34.incrementAll(doubleArray77);
        variance29.incrementAll(doubleArray77);
        double double86 = variance11.evaluate(doubleArray77);
        variance11.increment(7.0368744177664E13d);
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 2L + "'", long8 == 2L);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 544.5d + "'", double9 == 544.5d);
        org.junit.Assert.assertTrue("'" + double15 + "' != '" + 0.0d + "'", double15 == 0.0d);
        org.junit.Assert.assertTrue("'" + double16 + "' != '" + 0.0d + "'", double16 == 0.0d);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertTrue("'" + long20 + "' != '" + 2L + "'", long20 == 2L);
        org.junit.Assert.assertTrue("'" + long30 + "' != '" + 0L + "'", long30 == 0L);
        org.junit.Assert.assertTrue(Double.isNaN(double31));
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + true + "'", boolean32 == true);
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + true + "'", boolean33 == true);
        org.junit.Assert.assertNotNull(doubleArray47);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray47), "[-1.0, 0.0, 10.0]");
        org.junit.Assert.assertTrue("'" + boolean58 + "' != '" + false + "'", boolean58 == false);
        org.junit.Assert.assertNotNull(doubleArray65);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray65), "[-1.0, 0.0, 10.0]");
        org.junit.Assert.assertTrue("'" + long70 + "' != '" + 1L + "'", long70 == 1L);
        org.junit.Assert.assertNotNull(doubleArray77);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray77), "[-1.0, 0.0, 10.0]");
        org.junit.Assert.assertTrue("'" + double82 + "' != '" + 37.0d + "'", double82 == 37.0d);
        org.junit.Assert.assertTrue("'" + boolean83 + "' != '" + false + "'", boolean83 == false);
        org.junit.Assert.assertTrue("'" + double86 + "' != '" + 24.666666666666668d + "'", double86 == 24.666666666666668d);
    }

    @Test
    public void test13663() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest27.test13663");
        org.apache.commons.math.stat.descriptive.moment.SecondMoment secondMoment1 = new org.apache.commons.math.stat.descriptive.moment.SecondMoment();
        secondMoment1.increment((double) ' ');
        org.apache.commons.math.stat.descriptive.moment.Variance variance4 = new org.apache.commons.math.stat.descriptive.moment.Variance(secondMoment1);
        secondMoment1.increment((double) '4');
        double double7 = secondMoment1.getResult();
        double double8 = secondMoment1.getResult();
        org.apache.commons.math.stat.descriptive.moment.SecondMoment secondMoment10 = new org.apache.commons.math.stat.descriptive.moment.SecondMoment();
        secondMoment10.increment((double) ' ');
        org.apache.commons.math.stat.descriptive.moment.Variance variance13 = new org.apache.commons.math.stat.descriptive.moment.Variance(secondMoment10);
        secondMoment10.increment((double) (short) -1);
        long long16 = secondMoment10.getN();
        org.apache.commons.math.stat.descriptive.moment.Variance variance17 = new org.apache.commons.math.stat.descriptive.moment.Variance(false, secondMoment10);
        secondMoment10.clear();
        org.apache.commons.math.stat.descriptive.moment.SecondMoment secondMoment21 = new org.apache.commons.math.stat.descriptive.moment.SecondMoment();
        secondMoment21.increment(1.0d);
        double[] doubleArray27 = new double[] { (-1L), 0, 10L };
        secondMoment21.incrementAll(doubleArray27, 0, 0);
        double[] doubleArray33 = new double[] { 10, (byte) 100 };
        double double34 = secondMoment21.evaluate(doubleArray33);
        double double35 = secondMoment21.getResult();
        org.apache.commons.math.stat.descriptive.moment.Variance variance36 = new org.apache.commons.math.stat.descriptive.moment.Variance(false, secondMoment21);
        long long37 = secondMoment21.getN();
        org.apache.commons.math.stat.descriptive.moment.Variance variance38 = new org.apache.commons.math.stat.descriptive.moment.Variance(true, secondMoment21);
        org.apache.commons.math.stat.descriptive.moment.SecondMoment secondMoment39 = new org.apache.commons.math.stat.descriptive.moment.SecondMoment();
        secondMoment39.increment((double) ' ');
        org.apache.commons.math.stat.descriptive.moment.Variance variance42 = new org.apache.commons.math.stat.descriptive.moment.Variance(secondMoment39);
        secondMoment39.increment((double) (short) -1);
        secondMoment39.clear();
        secondMoment39.increment((double) 0L);
        org.apache.commons.math.stat.descriptive.moment.Variance variance48 = new org.apache.commons.math.stat.descriptive.moment.Variance(secondMoment39);
        org.apache.commons.math.stat.descriptive.moment.SecondMoment secondMoment49 = new org.apache.commons.math.stat.descriptive.moment.SecondMoment();
        secondMoment49.increment(1.0d);
        double[] doubleArray55 = new double[] { (-1L), 0, 10L };
        secondMoment49.incrementAll(doubleArray55, 0, 0);
        variance48.incrementAll(doubleArray55);
        org.apache.commons.math.stat.descriptive.moment.SecondMoment secondMoment60 = new org.apache.commons.math.stat.descriptive.moment.SecondMoment();
        secondMoment60.increment((double) ' ');
        org.apache.commons.math.stat.descriptive.moment.Variance variance63 = new org.apache.commons.math.stat.descriptive.moment.Variance(secondMoment60);
        secondMoment60.increment((double) (short) -1);
        secondMoment60.clear();
        secondMoment60.increment((double) 0L);
        org.apache.commons.math.stat.descriptive.moment.Variance variance69 = new org.apache.commons.math.stat.descriptive.moment.Variance(secondMoment60);
        org.apache.commons.math.stat.descriptive.moment.SecondMoment secondMoment70 = new org.apache.commons.math.stat.descriptive.moment.SecondMoment();
        secondMoment70.increment(1.0d);
        secondMoment70.increment((double) (short) 0);
        double double75 = secondMoment70.getResult();
        org.apache.commons.math.stat.descriptive.moment.SecondMoment secondMoment76 = new org.apache.commons.math.stat.descriptive.moment.SecondMoment();
        secondMoment76.increment(1.0d);
        double[] doubleArray82 = new double[] { (-1L), 0, 10L };
        secondMoment76.incrementAll(doubleArray82, 0, 0);
        double double86 = secondMoment70.evaluate(doubleArray82);
        double double87 = secondMoment60.evaluate(doubleArray82);
        double double88 = variance48.evaluate(doubleArray82);
        variance38.incrementAll(doubleArray82);
        secondMoment10.incrementAll(doubleArray82);
        double double93 = secondMoment1.evaluate(doubleArray82, (int) (byte) 0, (int) (short) 1);
        org.apache.commons.math.stat.descriptive.moment.Variance variance94 = new org.apache.commons.math.stat.descriptive.moment.Variance(false, secondMoment1);
        boolean boolean95 = variance94.isBiasCorrected();
        variance94.clear();
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 200.0d + "'", double7 == 200.0d);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 200.0d + "'", double8 == 200.0d);
        org.junit.Assert.assertTrue("'" + long16 + "' != '" + 2L + "'", long16 == 2L);
        org.junit.Assert.assertNotNull(doubleArray27);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray27), "[-1.0, 0.0, 10.0]");
        org.junit.Assert.assertNotNull(doubleArray33);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray33), "[10.0, 100.0]");
        org.junit.Assert.assertTrue("'" + double34 + "' != '" + 4050.0d + "'", double34 == 4050.0d);
        org.junit.Assert.assertTrue("'" + double35 + "' != '" + 4050.0d + "'", double35 == 4050.0d);
        org.junit.Assert.assertTrue("'" + long37 + "' != '" + 2L + "'", long37 == 2L);
        org.junit.Assert.assertNotNull(doubleArray55);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray55), "[-1.0, 0.0, 10.0]");
        org.junit.Assert.assertTrue("'" + double75 + "' != '" + 0.5d + "'", double75 == 0.5d);
        org.junit.Assert.assertNotNull(doubleArray82);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray82), "[-1.0, 0.0, 10.0]");
        org.junit.Assert.assertTrue("'" + double86 + "' != '" + 74.0d + "'", double86 == 74.0d);
        org.junit.Assert.assertTrue("'" + double87 + "' != '" + 74.0d + "'", double87 == 74.0d);
        org.junit.Assert.assertTrue("'" + double88 + "' != '" + 37.0d + "'", double88 == 37.0d);
        org.junit.Assert.assertTrue("'" + double93 + "' != '" + 0.0d + "'", double93 == 0.0d);
        org.junit.Assert.assertTrue("'" + boolean95 + "' != '" + false + "'", boolean95 == false);
    }

    @Test
    public void test13664() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest27.test13664");
        org.apache.commons.math.stat.descriptive.moment.SecondMoment secondMoment0 = new org.apache.commons.math.stat.descriptive.moment.SecondMoment();
        secondMoment0.increment((double) ' ');
        org.apache.commons.math.stat.descriptive.moment.Variance variance3 = new org.apache.commons.math.stat.descriptive.moment.Variance(secondMoment0);
        secondMoment0.increment((double) (short) -1);
        secondMoment0.clear();
        secondMoment0.increment((double) 0L);
        org.apache.commons.math.stat.descriptive.moment.Variance variance9 = new org.apache.commons.math.stat.descriptive.moment.Variance(secondMoment0);
        double double10 = secondMoment0.getResult();
        long long11 = secondMoment0.getN();
        secondMoment0.increment(7881.333333333333d);
        org.apache.commons.math.stat.descriptive.moment.Variance variance14 = new org.apache.commons.math.stat.descriptive.moment.Variance(secondMoment0);
        secondMoment0.increment(3.349532256E7d);
        double double17 = secondMoment0.getResult();
        long long18 = secondMoment0.getN();
        double double19 = secondMoment0.getResult();
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 0.0d + "'", double10 == 0.0d);
        org.junit.Assert.assertTrue("'" + long11 + "' != '" + 1L + "'", long11 == 1L);
        org.junit.Assert.assertTrue("'" + double17 + "' != '" + 7.477818051411046E14d + "'", double17 == 7.477818051411046E14d);
        org.junit.Assert.assertTrue("'" + long18 + "' != '" + 3L + "'", long18 == 3L);
        org.junit.Assert.assertTrue("'" + double19 + "' != '" + 7.477818051411046E14d + "'", double19 == 7.477818051411046E14d);
    }

    @Test
    public void test13665() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest27.test13665");
        org.apache.commons.math.stat.descriptive.moment.SecondMoment secondMoment0 = new org.apache.commons.math.stat.descriptive.moment.SecondMoment();
        secondMoment0.increment((double) ' ');
        secondMoment0.increment((double) '4');
        long long5 = secondMoment0.getN();
        org.apache.commons.math.stat.descriptive.moment.Variance variance6 = new org.apache.commons.math.stat.descriptive.moment.Variance(secondMoment0);
        secondMoment0.clear();
        org.apache.commons.math.stat.descriptive.moment.Variance variance9 = new org.apache.commons.math.stat.descriptive.moment.Variance(true);
        variance9.clear();
        org.apache.commons.math.stat.descriptive.moment.SecondMoment secondMoment13 = new org.apache.commons.math.stat.descriptive.moment.SecondMoment();
        secondMoment13.increment(1.0d);
        double[] doubleArray19 = new double[] { (-1L), 0, 10L };
        secondMoment13.incrementAll(doubleArray19, 0, 0);
        double[] doubleArray25 = new double[] { 10, (byte) 100 };
        double double26 = secondMoment13.evaluate(doubleArray25);
        double double27 = secondMoment13.getResult();
        org.apache.commons.math.stat.descriptive.moment.Variance variance28 = new org.apache.commons.math.stat.descriptive.moment.Variance(false, secondMoment13);
        long long29 = secondMoment13.getN();
        org.apache.commons.math.stat.descriptive.moment.Variance variance30 = new org.apache.commons.math.stat.descriptive.moment.Variance(true, secondMoment13);
        double double31 = secondMoment13.getResult();
        secondMoment13.clear();
        secondMoment13.increment(Double.NaN);
        secondMoment13.increment((double) ' ');
        org.apache.commons.math.stat.descriptive.moment.Variance variance38 = new org.apache.commons.math.stat.descriptive.moment.Variance(true);
        long long39 = variance38.getN();
        org.apache.commons.math.stat.descriptive.moment.SecondMoment secondMoment40 = new org.apache.commons.math.stat.descriptive.moment.SecondMoment();
        secondMoment40.increment(1.0d);
        secondMoment40.increment((double) (short) 0);
        double double45 = secondMoment40.getResult();
        org.apache.commons.math.stat.descriptive.moment.SecondMoment secondMoment46 = new org.apache.commons.math.stat.descriptive.moment.SecondMoment();
        secondMoment46.increment(1.0d);
        double[] doubleArray52 = new double[] { (-1L), 0, 10L };
        secondMoment46.incrementAll(doubleArray52, 0, 0);
        double double56 = secondMoment40.evaluate(doubleArray52);
        variance38.incrementAll(doubleArray52);
        secondMoment13.incrementAll(doubleArray52);
        variance9.incrementAll(doubleArray52);
        double double62 = secondMoment0.evaluate(doubleArray52, 0, (int) (byte) 0);
        double double63 = secondMoment0.getResult();
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 2L + "'", long5 == 2L);
        org.junit.Assert.assertNotNull(doubleArray19);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray19), "[-1.0, 0.0, 10.0]");
        org.junit.Assert.assertNotNull(doubleArray25);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray25), "[10.0, 100.0]");
        org.junit.Assert.assertTrue("'" + double26 + "' != '" + 4050.0d + "'", double26 == 4050.0d);
        org.junit.Assert.assertTrue("'" + double27 + "' != '" + 4050.0d + "'", double27 == 4050.0d);
        org.junit.Assert.assertTrue("'" + long29 + "' != '" + 2L + "'", long29 == 2L);
        org.junit.Assert.assertTrue("'" + double31 + "' != '" + 4050.0d + "'", double31 == 4050.0d);
        org.junit.Assert.assertTrue("'" + long39 + "' != '" + 0L + "'", long39 == 0L);
        org.junit.Assert.assertTrue("'" + double45 + "' != '" + 0.5d + "'", double45 == 0.5d);
        org.junit.Assert.assertNotNull(doubleArray52);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray52), "[-1.0, 0.0, 10.0]");
        org.junit.Assert.assertTrue("'" + double56 + "' != '" + 74.0d + "'", double56 == 74.0d);
        org.junit.Assert.assertTrue(Double.isNaN(double62));
        org.junit.Assert.assertTrue(Double.isNaN(double63));
    }

    @Test
    public void test13666() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest27.test13666");
        org.apache.commons.math.stat.descriptive.moment.SecondMoment secondMoment2 = new org.apache.commons.math.stat.descriptive.moment.SecondMoment();
        secondMoment2.increment((double) ' ');
        org.apache.commons.math.stat.descriptive.moment.Variance variance5 = new org.apache.commons.math.stat.descriptive.moment.Variance(secondMoment2);
        secondMoment2.increment((double) (short) -1);
        long long8 = secondMoment2.getN();
        org.apache.commons.math.stat.descriptive.moment.Variance variance9 = new org.apache.commons.math.stat.descriptive.moment.Variance(false, secondMoment2);
        org.apache.commons.math.stat.descriptive.moment.Variance variance10 = new org.apache.commons.math.stat.descriptive.moment.Variance(secondMoment2);
        org.apache.commons.math.stat.descriptive.moment.Variance variance11 = new org.apache.commons.math.stat.descriptive.moment.Variance(false, secondMoment2);
        secondMoment2.increment(5226.0d);
        org.apache.commons.math.stat.descriptive.moment.Variance variance14 = new org.apache.commons.math.stat.descriptive.moment.Variance(secondMoment2);
        variance14.clear();
        variance14.increment(32.0d);
        variance14.clear();
        variance14.clear();
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 2L + "'", long8 == 2L);
    }

    @Test
    public void test13667() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest27.test13667");
        org.apache.commons.math.stat.descriptive.moment.SecondMoment secondMoment0 = new org.apache.commons.math.stat.descriptive.moment.SecondMoment();
        secondMoment0.increment(1.0d);
        secondMoment0.increment((double) (short) 0);
        long long5 = secondMoment0.getN();
        double double6 = secondMoment0.getResult();
        secondMoment0.increment((double) (byte) 10);
        secondMoment0.clear();
        long long10 = secondMoment0.getN();
        secondMoment0.increment(1.8756123185185187E7d);
        long long13 = secondMoment0.getN();
        double double14 = secondMoment0.getResult();
        secondMoment0.increment(28.666666666666664d);
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 2L + "'", long5 == 2L);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.5d + "'", double6 == 0.5d);
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + 0L + "'", long10 == 0L);
        org.junit.Assert.assertTrue("'" + long13 + "' != '" + 1L + "'", long13 == 1L);
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + 0.0d + "'", double14 == 0.0d);
    }

    @Test
    public void test13668() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest27.test13668");
        org.apache.commons.math.stat.descriptive.moment.SecondMoment secondMoment0 = new org.apache.commons.math.stat.descriptive.moment.SecondMoment();
        secondMoment0.increment(1.0d);
        double[] doubleArray6 = new double[] { (-1L), 0, 10L };
        secondMoment0.incrementAll(doubleArray6, 0, 0);
        org.apache.commons.math.stat.descriptive.moment.Variance variance10 = new org.apache.commons.math.stat.descriptive.moment.Variance(secondMoment0);
        org.apache.commons.math.stat.descriptive.moment.SecondMoment secondMoment11 = new org.apache.commons.math.stat.descriptive.moment.SecondMoment();
        secondMoment11.increment(1.0d);
        org.apache.commons.math.stat.descriptive.moment.SecondMoment secondMoment14 = new org.apache.commons.math.stat.descriptive.moment.SecondMoment();
        secondMoment14.increment(1.0d);
        secondMoment14.increment((double) (short) 0);
        double double19 = secondMoment14.getResult();
        org.apache.commons.math.stat.descriptive.moment.SecondMoment secondMoment20 = new org.apache.commons.math.stat.descriptive.moment.SecondMoment();
        secondMoment20.increment(1.0d);
        double[] doubleArray26 = new double[] { (-1L), 0, 10L };
        secondMoment20.incrementAll(doubleArray26, 0, 0);
        double double30 = secondMoment14.evaluate(doubleArray26);
        double[] doubleArray31 = new double[] {};
        secondMoment14.incrementAll(doubleArray31);
        double double33 = secondMoment11.evaluate(doubleArray31);
        double double34 = variance10.evaluate(doubleArray31);
        variance10.increment(37.0d);
        org.apache.commons.math.stat.descriptive.moment.SecondMoment secondMoment39 = new org.apache.commons.math.stat.descriptive.moment.SecondMoment();
        secondMoment39.increment(1.0d);
        double[] doubleArray45 = new double[] { (-1L), 0, 10L };
        secondMoment39.incrementAll(doubleArray45, 0, 0);
        double[] doubleArray51 = new double[] { 10, (byte) 100 };
        double double52 = secondMoment39.evaluate(doubleArray51);
        double double53 = secondMoment39.getResult();
        org.apache.commons.math.stat.descriptive.moment.Variance variance54 = new org.apache.commons.math.stat.descriptive.moment.Variance(false, secondMoment39);
        long long55 = secondMoment39.getN();
        org.apache.commons.math.stat.descriptive.moment.Variance variance56 = new org.apache.commons.math.stat.descriptive.moment.Variance(true, secondMoment39);
        boolean boolean57 = variance56.isBiasCorrected();
        org.apache.commons.math.stat.descriptive.moment.SecondMoment secondMoment58 = new org.apache.commons.math.stat.descriptive.moment.SecondMoment();
        secondMoment58.increment((double) ' ');
        org.apache.commons.math.stat.descriptive.moment.Variance variance61 = new org.apache.commons.math.stat.descriptive.moment.Variance(secondMoment58);
        secondMoment58.increment((double) (short) -1);
        secondMoment58.clear();
        secondMoment58.increment((double) 0L);
        org.apache.commons.math.stat.descriptive.moment.Variance variance67 = new org.apache.commons.math.stat.descriptive.moment.Variance(secondMoment58);
        long long68 = variance67.getN();
        org.apache.commons.math.stat.descriptive.moment.SecondMoment secondMoment69 = new org.apache.commons.math.stat.descriptive.moment.SecondMoment();
        secondMoment69.increment(1.0d);
        org.apache.commons.math.stat.descriptive.moment.SecondMoment secondMoment72 = new org.apache.commons.math.stat.descriptive.moment.SecondMoment();
        secondMoment72.increment(1.0d);
        secondMoment72.increment((double) (short) 0);
        double double77 = secondMoment72.getResult();
        org.apache.commons.math.stat.descriptive.moment.SecondMoment secondMoment78 = new org.apache.commons.math.stat.descriptive.moment.SecondMoment();
        secondMoment78.increment(1.0d);
        double[] doubleArray84 = new double[] { (-1L), 0, 10L };
        secondMoment78.incrementAll(doubleArray84, 0, 0);
        double double88 = secondMoment72.evaluate(doubleArray84);
        double[] doubleArray89 = new double[] {};
        secondMoment72.incrementAll(doubleArray89);
        double double91 = secondMoment69.evaluate(doubleArray89);
        double double92 = variance67.evaluate(doubleArray89);
        double double94 = variance56.evaluate(doubleArray89, (double) 1);
        variance10.incrementAll(doubleArray89);
        variance10.setBiasCorrected(true);
        org.junit.Assert.assertNotNull(doubleArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray6), "[-1.0, 0.0, 10.0]");
        org.junit.Assert.assertTrue("'" + double19 + "' != '" + 0.5d + "'", double19 == 0.5d);
        org.junit.Assert.assertNotNull(doubleArray26);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray26), "[-1.0, 0.0, 10.0]");
        org.junit.Assert.assertTrue("'" + double30 + "' != '" + 74.0d + "'", double30 == 74.0d);
        org.junit.Assert.assertNotNull(doubleArray31);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray31), "[]");
        org.junit.Assert.assertTrue("'" + double33 + "' != '" + 0.0d + "'", double33 == 0.0d);
        org.junit.Assert.assertTrue(Double.isNaN(double34));
        org.junit.Assert.assertNotNull(doubleArray45);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray45), "[-1.0, 0.0, 10.0]");
        org.junit.Assert.assertNotNull(doubleArray51);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray51), "[10.0, 100.0]");
        org.junit.Assert.assertTrue("'" + double52 + "' != '" + 4050.0d + "'", double52 == 4050.0d);
        org.junit.Assert.assertTrue("'" + double53 + "' != '" + 4050.0d + "'", double53 == 4050.0d);
        org.junit.Assert.assertTrue("'" + long55 + "' != '" + 2L + "'", long55 == 2L);
        org.junit.Assert.assertTrue("'" + boolean57 + "' != '" + true + "'", boolean57 == true);
        org.junit.Assert.assertTrue("'" + long68 + "' != '" + 1L + "'", long68 == 1L);
        org.junit.Assert.assertTrue("'" + double77 + "' != '" + 0.5d + "'", double77 == 0.5d);
        org.junit.Assert.assertNotNull(doubleArray84);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray84), "[-1.0, 0.0, 10.0]");
        org.junit.Assert.assertTrue("'" + double88 + "' != '" + 74.0d + "'", double88 == 74.0d);
        org.junit.Assert.assertNotNull(doubleArray89);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray89), "[]");
        org.junit.Assert.assertTrue("'" + double91 + "' != '" + 0.0d + "'", double91 == 0.0d);
        org.junit.Assert.assertTrue(Double.isNaN(double92));
        org.junit.Assert.assertTrue(Double.isNaN(double94));
    }
}

