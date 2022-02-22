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
        double double27 = secondMoment16.getResult();
        org.apache.commons.math.stat.descriptive.moment.Variance variance28 = new org.apache.commons.math.stat.descriptive.moment.Variance(secondMoment16);
        secondMoment16.clear();
        secondMoment16.clear();
        secondMoment16.increment(1376.0d);
        long long33 = secondMoment16.getN();
        secondMoment16.increment(2.7963163706731616E14d);
        org.apache.commons.math.stat.descriptive.moment.Variance variance36 = new org.apache.commons.math.stat.descriptive.moment.Variance(false, secondMoment16);
        boolean boolean37 = variance36.isBiasCorrected();
        org.junit.Assert.assertNotNull(doubleArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray7), "[-1.0, 0.0, 10.0]");
        org.junit.Assert.assertNotNull(doubleArray13);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray13), "[10.0, 100.0]");
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + 4050.0d + "'", double14 == 4050.0d);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
        org.junit.Assert.assertTrue("'" + double27 + "' != '" + 0.0d + "'", double27 == 0.0d);
        org.junit.Assert.assertTrue("'" + long33 + "' != '" + 1L + "'", long33 == 1L);
        org.junit.Assert.assertTrue("'" + boolean37 + "' != '" + false + "'", boolean37 == false);
    }

    @Test
    public void test16502() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest33.test16502");
        org.apache.commons.math.stat.descriptive.moment.SecondMoment secondMoment2 = new org.apache.commons.math.stat.descriptive.moment.SecondMoment();
        secondMoment2.increment((double) ' ');
        org.apache.commons.math.stat.descriptive.moment.Variance variance5 = new org.apache.commons.math.stat.descriptive.moment.Variance(secondMoment2);
        secondMoment2.increment((double) (short) -1);
        long long8 = secondMoment2.getN();
        double double9 = secondMoment2.getResult();
        org.apache.commons.math.stat.descriptive.moment.Variance variance10 = new org.apache.commons.math.stat.descriptive.moment.Variance(false, secondMoment2);
        org.apache.commons.math.stat.descriptive.moment.Variance variance11 = new org.apache.commons.math.stat.descriptive.moment.Variance(false, secondMoment2);
        long long12 = secondMoment2.getN();
        double double13 = secondMoment2.getResult();
        secondMoment2.increment(9161778.740966797d);
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 2L + "'", long8 == 2L);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 544.5d + "'", double9 == 544.5d);
        org.junit.Assert.assertTrue("'" + long12 + "' != '" + 2L + "'", long12 == 2L);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 544.5d + "'", double13 == 544.5d);
    }

    @Test
    public void test16503() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest33.test16503");
        org.apache.commons.math.stat.descriptive.moment.SecondMoment secondMoment1 = new org.apache.commons.math.stat.descriptive.moment.SecondMoment();
        secondMoment1.increment(1.0d);
        double[] doubleArray7 = new double[] { (-1L), 0, 10L };
        secondMoment1.incrementAll(doubleArray7, 0, 0);
        double[] doubleArray13 = new double[] { 10, (byte) 100 };
        double double14 = secondMoment1.evaluate(doubleArray13);
        double double15 = secondMoment1.getResult();
        org.apache.commons.math.stat.descriptive.moment.Variance variance16 = new org.apache.commons.math.stat.descriptive.moment.Variance(false, secondMoment1);
        variance16.increment(0.0d);
        boolean boolean19 = variance16.isBiasCorrected();
        boolean boolean20 = variance16.isBiasCorrected();
        variance16.increment(6140.666666666667d);
        boolean boolean23 = variance16.isBiasCorrected();
        org.apache.commons.math.stat.descriptive.moment.SecondMoment secondMoment24 = new org.apache.commons.math.stat.descriptive.moment.SecondMoment();
        secondMoment24.increment((double) ' ');
        org.apache.commons.math.stat.descriptive.moment.Variance variance27 = new org.apache.commons.math.stat.descriptive.moment.Variance(secondMoment24);
        secondMoment24.increment((double) (short) -1);
        secondMoment24.clear();
        double double31 = secondMoment24.getResult();
        org.apache.commons.math.stat.descriptive.moment.Variance variance32 = new org.apache.commons.math.stat.descriptive.moment.Variance(secondMoment24);
        variance32.increment(4050.0d);
        double double35 = variance32.getResult();
        long long36 = variance32.getN();
        org.apache.commons.math.stat.descriptive.moment.SecondMoment secondMoment40 = new org.apache.commons.math.stat.descriptive.moment.SecondMoment();
        secondMoment40.increment(1.0d);
        double[] doubleArray46 = new double[] { (-1L), 0, 10L };
        secondMoment40.incrementAll(doubleArray46, 0, 0);
        double[] doubleArray52 = new double[] { 10, (byte) 100 };
        double double53 = secondMoment40.evaluate(doubleArray52);
        double double54 = secondMoment40.getResult();
        org.apache.commons.math.stat.descriptive.moment.Variance variance55 = new org.apache.commons.math.stat.descriptive.moment.Variance(false, secondMoment40);
        long long56 = secondMoment40.getN();
        org.apache.commons.math.stat.descriptive.moment.Variance variance57 = new org.apache.commons.math.stat.descriptive.moment.Variance(true, secondMoment40);
        double double58 = secondMoment40.getResult();
        secondMoment40.clear();
        org.apache.commons.math.stat.descriptive.moment.Variance variance60 = new org.apache.commons.math.stat.descriptive.moment.Variance(false, secondMoment40);
        variance60.increment(5.49755813888E11d);
        double double63 = variance60.getResult();
        org.apache.commons.math.stat.descriptive.moment.SecondMoment secondMoment64 = new org.apache.commons.math.stat.descriptive.moment.SecondMoment();
        secondMoment64.increment(1.0d);
        secondMoment64.clear();
        double double68 = secondMoment64.getResult();
        org.apache.commons.math.stat.descriptive.moment.SecondMoment secondMoment69 = new org.apache.commons.math.stat.descriptive.moment.SecondMoment();
        secondMoment69.increment(1.0d);
        secondMoment69.increment((double) (short) 0);
        double double74 = secondMoment69.getResult();
        org.apache.commons.math.stat.descriptive.moment.SecondMoment secondMoment75 = new org.apache.commons.math.stat.descriptive.moment.SecondMoment();
        secondMoment75.increment(1.0d);
        double[] doubleArray81 = new double[] { (-1L), 0, 10L };
        secondMoment75.incrementAll(doubleArray81, 0, 0);
        double double85 = secondMoment69.evaluate(doubleArray81);
        double double86 = secondMoment64.evaluate(doubleArray81);
        double double87 = variance60.evaluate(doubleArray81);
        double double91 = variance32.evaluate(doubleArray81, (double) 10.0f, (int) (byte) 1, (int) (byte) 0);
        // The following exception was thrown during execution in test generation
        try {
            double double94 = variance16.evaluate(doubleArray81, (int) 'a', (int) '4');
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: begin + length > values.length");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(doubleArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray7), "[-1.0, 0.0, 10.0]");
        org.junit.Assert.assertNotNull(doubleArray13);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray13), "[10.0, 100.0]");
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + 4050.0d + "'", double14 == 4050.0d);
        org.junit.Assert.assertTrue("'" + double15 + "' != '" + 4050.0d + "'", double15 == 4050.0d);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertTrue(Double.isNaN(double31));
        org.junit.Assert.assertTrue(Double.isNaN(double35));
        org.junit.Assert.assertTrue("'" + long36 + "' != '" + 0L + "'", long36 == 0L);
        org.junit.Assert.assertNotNull(doubleArray46);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray46), "[-1.0, 0.0, 10.0]");
        org.junit.Assert.assertNotNull(doubleArray52);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray52), "[10.0, 100.0]");
        org.junit.Assert.assertTrue("'" + double53 + "' != '" + 4050.0d + "'", double53 == 4050.0d);
        org.junit.Assert.assertTrue("'" + double54 + "' != '" + 4050.0d + "'", double54 == 4050.0d);
        org.junit.Assert.assertTrue("'" + long56 + "' != '" + 2L + "'", long56 == 2L);
        org.junit.Assert.assertTrue("'" + double58 + "' != '" + 4050.0d + "'", double58 == 4050.0d);
        org.junit.Assert.assertTrue(Double.isNaN(double63));
        org.junit.Assert.assertTrue(Double.isNaN(double68));
        org.junit.Assert.assertTrue("'" + double74 + "' != '" + 0.5d + "'", double74 == 0.5d);
        org.junit.Assert.assertNotNull(doubleArray81);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray81), "[-1.0, 0.0, 10.0]");
        org.junit.Assert.assertTrue("'" + double85 + "' != '" + 74.0d + "'", double85 == 74.0d);
        org.junit.Assert.assertTrue("'" + double86 + "' != '" + 74.0d + "'", double86 == 74.0d);
        org.junit.Assert.assertTrue("'" + double87 + "' != '" + 24.666666666666668d + "'", double87 == 24.666666666666668d);
        org.junit.Assert.assertTrue(Double.isNaN(double91));
    }

    @Test
    public void test16504() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest33.test16504");
        org.apache.commons.math.stat.descriptive.moment.SecondMoment secondMoment0 = new org.apache.commons.math.stat.descriptive.moment.SecondMoment();
        secondMoment0.increment(1.0d);
        secondMoment0.increment((double) (short) 0);
        long long5 = secondMoment0.getN();
        double double6 = secondMoment0.getResult();
        secondMoment0.increment((double) (byte) 10);
        secondMoment0.clear();
        org.apache.commons.math.stat.descriptive.moment.SecondMoment secondMoment10 = new org.apache.commons.math.stat.descriptive.moment.SecondMoment();
        secondMoment10.increment(1.0d);
        double[] doubleArray16 = new double[] { (-1L), 0, 10L };
        secondMoment10.incrementAll(doubleArray16, 0, 0);
        org.apache.commons.math.stat.descriptive.moment.Variance variance20 = new org.apache.commons.math.stat.descriptive.moment.Variance(secondMoment10);
        long long21 = variance20.getN();
        org.apache.commons.math.stat.descriptive.moment.SecondMoment secondMoment22 = new org.apache.commons.math.stat.descriptive.moment.SecondMoment();
        secondMoment22.increment(1.0d);
        double[] doubleArray28 = new double[] { (-1L), 0, 10L };
        secondMoment22.incrementAll(doubleArray28, 0, 0);
        double double33 = variance20.evaluate(doubleArray28, (double) (short) -1);
        double double34 = secondMoment0.evaluate(doubleArray28);
        secondMoment0.clear();
        secondMoment0.increment(5000.0d);
        secondMoment0.clear();
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 2L + "'", long5 == 2L);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.5d + "'", double6 == 0.5d);
        org.junit.Assert.assertNotNull(doubleArray16);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray16), "[-1.0, 0.0, 10.0]");
        org.junit.Assert.assertTrue("'" + long21 + "' != '" + 1L + "'", long21 == 1L);
        org.junit.Assert.assertNotNull(doubleArray28);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray28), "[-1.0, 0.0, 10.0]");
        org.junit.Assert.assertTrue("'" + double33 + "' != '" + 37.0d + "'", double33 == 37.0d);
        org.junit.Assert.assertTrue("'" + double34 + "' != '" + 74.0d + "'", double34 == 74.0d);
    }

    @Test
    public void test16505() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest33.test16505");
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
        double double27 = secondMoment16.getResult();
        org.apache.commons.math.stat.descriptive.moment.Variance variance28 = new org.apache.commons.math.stat.descriptive.moment.Variance(secondMoment16);
        double double29 = secondMoment16.getResult();
        org.apache.commons.math.stat.descriptive.moment.Variance variance30 = new org.apache.commons.math.stat.descriptive.moment.Variance(false, secondMoment16);
        org.junit.Assert.assertNotNull(doubleArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray7), "[-1.0, 0.0, 10.0]");
        org.junit.Assert.assertNotNull(doubleArray13);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray13), "[10.0, 100.0]");
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + 4050.0d + "'", double14 == 4050.0d);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
        org.junit.Assert.assertTrue("'" + double27 + "' != '" + 0.0d + "'", double27 == 0.0d);
        org.junit.Assert.assertTrue("'" + double29 + "' != '" + 0.0d + "'", double29 == 0.0d);
    }

    @Test
    public void test16506() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest33.test16506");
        org.apache.commons.math.stat.descriptive.moment.SecondMoment secondMoment0 = new org.apache.commons.math.stat.descriptive.moment.SecondMoment();
        secondMoment0.increment((double) ' ');
        secondMoment0.increment((double) (-1.0f));
        double double5 = secondMoment0.getResult();
        secondMoment0.clear();
        org.apache.commons.math.stat.descriptive.moment.SecondMoment secondMoment8 = new org.apache.commons.math.stat.descriptive.moment.SecondMoment();
        secondMoment8.increment((double) ' ');
        org.apache.commons.math.stat.descriptive.moment.Variance variance11 = new org.apache.commons.math.stat.descriptive.moment.Variance(secondMoment8);
        secondMoment8.increment((double) (short) -1);
        long long14 = secondMoment8.getN();
        org.apache.commons.math.stat.descriptive.moment.Variance variance15 = new org.apache.commons.math.stat.descriptive.moment.Variance(false, secondMoment8);
        org.apache.commons.math.stat.descriptive.moment.Variance variance16 = new org.apache.commons.math.stat.descriptive.moment.Variance(secondMoment8);
        double double17 = secondMoment8.getResult();
        secondMoment8.clear();
        org.apache.commons.math.stat.descriptive.moment.Variance variance19 = new org.apache.commons.math.stat.descriptive.moment.Variance();
        org.apache.commons.math.stat.descriptive.moment.SecondMoment secondMoment20 = new org.apache.commons.math.stat.descriptive.moment.SecondMoment();
        secondMoment20.increment(1.0d);
        secondMoment20.increment((double) (short) 0);
        double double25 = secondMoment20.getResult();
        org.apache.commons.math.stat.descriptive.moment.SecondMoment secondMoment26 = new org.apache.commons.math.stat.descriptive.moment.SecondMoment();
        secondMoment26.increment(1.0d);
        double[] doubleArray32 = new double[] { (-1L), 0, 10L };
        secondMoment26.incrementAll(doubleArray32, 0, 0);
        double double36 = secondMoment20.evaluate(doubleArray32);
        double[] doubleArray37 = new double[] {};
        secondMoment20.incrementAll(doubleArray37);
        double double41 = variance19.evaluate(doubleArray37, (int) (byte) 0, 0);
        long long42 = variance19.getN();
        org.apache.commons.math.stat.descriptive.moment.SecondMoment secondMoment43 = new org.apache.commons.math.stat.descriptive.moment.SecondMoment();
        secondMoment43.increment(1.0d);
        secondMoment43.increment((double) (short) 0);
        double double48 = secondMoment43.getResult();
        org.apache.commons.math.stat.descriptive.moment.SecondMoment secondMoment49 = new org.apache.commons.math.stat.descriptive.moment.SecondMoment();
        secondMoment49.increment(1.0d);
        double[] doubleArray55 = new double[] { (-1L), 0, 10L };
        secondMoment49.incrementAll(doubleArray55, 0, 0);
        double double59 = secondMoment43.evaluate(doubleArray55);
        variance19.incrementAll(doubleArray55);
        double double61 = secondMoment8.evaluate(doubleArray55);
        secondMoment0.incrementAll(doubleArray55);
        secondMoment0.increment(3602.0d);
        double double65 = secondMoment0.getResult();
        double double66 = secondMoment0.getResult();
        secondMoment0.increment(2.9671325612595965E15d);
        secondMoment0.clear();
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 544.5d + "'", double5 == 544.5d);
        org.junit.Assert.assertTrue("'" + long14 + "' != '" + 2L + "'", long14 == 2L);
        org.junit.Assert.assertTrue("'" + double17 + "' != '" + 544.5d + "'", double17 == 544.5d);
        org.junit.Assert.assertTrue("'" + double25 + "' != '" + 0.5d + "'", double25 == 0.5d);
        org.junit.Assert.assertNotNull(doubleArray32);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray32), "[-1.0, 0.0, 10.0]");
        org.junit.Assert.assertTrue("'" + double36 + "' != '" + 74.0d + "'", double36 == 74.0d);
        org.junit.Assert.assertNotNull(doubleArray37);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray37), "[]");
        org.junit.Assert.assertTrue(Double.isNaN(double41));
        org.junit.Assert.assertTrue("'" + long42 + "' != '" + 0L + "'", long42 == 0L);
        org.junit.Assert.assertTrue("'" + double48 + "' != '" + 0.5d + "'", double48 == 0.5d);
        org.junit.Assert.assertNotNull(doubleArray55);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray55), "[-1.0, 0.0, 10.0]");
        org.junit.Assert.assertTrue("'" + double59 + "' != '" + 74.0d + "'", double59 == 74.0d);
        org.junit.Assert.assertTrue("'" + double61 + "' != '" + 74.0d + "'", double61 == 74.0d);
        org.junit.Assert.assertTrue("'" + double65 + "' != '" + 9714674.75d + "'", double65 == 9714674.75d);
        org.junit.Assert.assertTrue("'" + double66 + "' != '" + 9714674.75d + "'", double66 == 9714674.75d);
    }

    @Test
    public void test16507() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest33.test16507");
        org.apache.commons.math.stat.descriptive.moment.SecondMoment secondMoment0 = new org.apache.commons.math.stat.descriptive.moment.SecondMoment();
        secondMoment0.increment((double) ' ');
        secondMoment0.increment((double) (-1.0f));
        secondMoment0.clear();
        secondMoment0.clear();
        double double7 = secondMoment0.getResult();
        double double8 = secondMoment0.getResult();
        org.apache.commons.math.stat.descriptive.moment.Variance variance9 = new org.apache.commons.math.stat.descriptive.moment.Variance();
        org.apache.commons.math.stat.descriptive.moment.SecondMoment secondMoment10 = new org.apache.commons.math.stat.descriptive.moment.SecondMoment();
        secondMoment10.increment(1.0d);
        secondMoment10.increment((double) (short) 0);
        double double15 = secondMoment10.getResult();
        org.apache.commons.math.stat.descriptive.moment.SecondMoment secondMoment16 = new org.apache.commons.math.stat.descriptive.moment.SecondMoment();
        secondMoment16.increment(1.0d);
        double[] doubleArray22 = new double[] { (-1L), 0, 10L };
        secondMoment16.incrementAll(doubleArray22, 0, 0);
        double double26 = secondMoment10.evaluate(doubleArray22);
        double[] doubleArray27 = new double[] {};
        secondMoment10.incrementAll(doubleArray27);
        double double31 = variance9.evaluate(doubleArray27, (int) (byte) 0, 0);
        long long32 = variance9.getN();
        org.apache.commons.math.stat.descriptive.moment.SecondMoment secondMoment33 = new org.apache.commons.math.stat.descriptive.moment.SecondMoment();
        secondMoment33.increment(1.0d);
        secondMoment33.increment((double) (short) 0);
        double double38 = secondMoment33.getResult();
        org.apache.commons.math.stat.descriptive.moment.SecondMoment secondMoment39 = new org.apache.commons.math.stat.descriptive.moment.SecondMoment();
        secondMoment39.increment(1.0d);
        double[] doubleArray45 = new double[] { (-1L), 0, 10L };
        secondMoment39.incrementAll(doubleArray45, 0, 0);
        double double49 = secondMoment33.evaluate(doubleArray45);
        variance9.incrementAll(doubleArray45);
        long long51 = variance9.getN();
        org.apache.commons.math.stat.descriptive.moment.SecondMoment secondMoment52 = new org.apache.commons.math.stat.descriptive.moment.SecondMoment();
        secondMoment52.increment(1.0d);
        org.apache.commons.math.stat.descriptive.moment.SecondMoment secondMoment55 = new org.apache.commons.math.stat.descriptive.moment.SecondMoment();
        secondMoment55.increment(1.0d);
        secondMoment55.increment((double) (short) 0);
        double double60 = secondMoment55.getResult();
        org.apache.commons.math.stat.descriptive.moment.SecondMoment secondMoment61 = new org.apache.commons.math.stat.descriptive.moment.SecondMoment();
        secondMoment61.increment(1.0d);
        double[] doubleArray67 = new double[] { (-1L), 0, 10L };
        secondMoment61.incrementAll(doubleArray67, 0, 0);
        double double71 = secondMoment55.evaluate(doubleArray67);
        double[] doubleArray72 = new double[] {};
        secondMoment55.incrementAll(doubleArray72);
        double double74 = secondMoment52.evaluate(doubleArray72);
        variance9.incrementAll(doubleArray72);
        double double76 = secondMoment0.evaluate(doubleArray72);
        double double77 = secondMoment0.getResult();
        org.junit.Assert.assertTrue(Double.isNaN(double7));
        org.junit.Assert.assertTrue(Double.isNaN(double8));
        org.junit.Assert.assertTrue("'" + double15 + "' != '" + 0.5d + "'", double15 == 0.5d);
        org.junit.Assert.assertNotNull(doubleArray22);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray22), "[-1.0, 0.0, 10.0]");
        org.junit.Assert.assertTrue("'" + double26 + "' != '" + 74.0d + "'", double26 == 74.0d);
        org.junit.Assert.assertNotNull(doubleArray27);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray27), "[]");
        org.junit.Assert.assertTrue(Double.isNaN(double31));
        org.junit.Assert.assertTrue("'" + long32 + "' != '" + 0L + "'", long32 == 0L);
        org.junit.Assert.assertTrue("'" + double38 + "' != '" + 0.5d + "'", double38 == 0.5d);
        org.junit.Assert.assertNotNull(doubleArray45);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray45), "[-1.0, 0.0, 10.0]");
        org.junit.Assert.assertTrue("'" + double49 + "' != '" + 74.0d + "'", double49 == 74.0d);
        org.junit.Assert.assertTrue("'" + long51 + "' != '" + 3L + "'", long51 == 3L);
        org.junit.Assert.assertTrue("'" + double60 + "' != '" + 0.5d + "'", double60 == 0.5d);
        org.junit.Assert.assertNotNull(doubleArray67);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray67), "[-1.0, 0.0, 10.0]");
        org.junit.Assert.assertTrue("'" + double71 + "' != '" + 74.0d + "'", double71 == 74.0d);
        org.junit.Assert.assertNotNull(doubleArray72);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray72), "[]");
        org.junit.Assert.assertTrue("'" + double74 + "' != '" + 0.0d + "'", double74 == 0.0d);
        org.junit.Assert.assertTrue(Double.isNaN(double76));
        org.junit.Assert.assertTrue(Double.isNaN(double77));
    }

    @Test
    public void test16508() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest33.test16508");
        org.apache.commons.math.stat.descriptive.moment.SecondMoment secondMoment0 = new org.apache.commons.math.stat.descriptive.moment.SecondMoment();
        secondMoment0.increment((double) ' ');
        double double3 = secondMoment0.getResult();
        secondMoment0.increment((double) (short) 100);
        long long6 = secondMoment0.getN();
        secondMoment0.clear();
        double double8 = secondMoment0.getResult();
        secondMoment0.clear();
        double double10 = secondMoment0.getResult();
        secondMoment0.clear();
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 0.0d + "'", double3 == 0.0d);
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 2L + "'", long6 == 2L);
        org.junit.Assert.assertTrue(Double.isNaN(double8));
        org.junit.Assert.assertTrue(Double.isNaN(double10));
    }

    @Test
    public void test16509() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest33.test16509");
        org.apache.commons.math.stat.descriptive.moment.SecondMoment secondMoment0 = new org.apache.commons.math.stat.descriptive.moment.SecondMoment();
        secondMoment0.increment(1.0d);
        secondMoment0.increment((double) (short) 0);
        double double5 = secondMoment0.getResult();
        org.apache.commons.math.stat.descriptive.moment.SecondMoment secondMoment6 = new org.apache.commons.math.stat.descriptive.moment.SecondMoment();
        secondMoment6.increment(1.0d);
        double[] doubleArray12 = new double[] { (-1L), 0, 10L };
        secondMoment6.incrementAll(doubleArray12, 0, 0);
        double double16 = secondMoment0.evaluate(doubleArray12);
        secondMoment0.increment(0.0d);
        secondMoment0.clear();
        long long20 = secondMoment0.getN();
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.5d + "'", double5 == 0.5d);
        org.junit.Assert.assertNotNull(doubleArray12);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray12), "[-1.0, 0.0, 10.0]");
        org.junit.Assert.assertTrue("'" + double16 + "' != '" + 74.0d + "'", double16 == 74.0d);
        org.junit.Assert.assertTrue("'" + long20 + "' != '" + 0L + "'", long20 == 0L);
    }

    @Test
    public void test16510() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest33.test16510");
        org.apache.commons.math.stat.descriptive.moment.SecondMoment secondMoment0 = new org.apache.commons.math.stat.descriptive.moment.SecondMoment();
        secondMoment0.increment((double) ' ');
        org.apache.commons.math.stat.descriptive.moment.Variance variance3 = new org.apache.commons.math.stat.descriptive.moment.Variance(secondMoment0);
        secondMoment0.increment((double) (short) -1);
        secondMoment0.clear();
        org.apache.commons.math.stat.descriptive.moment.Variance variance7 = new org.apache.commons.math.stat.descriptive.moment.Variance(secondMoment0);
        variance7.increment(0.0d);
        long long10 = variance7.getN();
        variance7.setBiasCorrected(true);
        variance7.clear();
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + 0L + "'", long10 == 0L);
    }

    @Test
    public void test16511() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest33.test16511");
        org.apache.commons.math.stat.descriptive.moment.SecondMoment secondMoment0 = new org.apache.commons.math.stat.descriptive.moment.SecondMoment();
        secondMoment0.increment(1.0d);
        secondMoment0.increment((double) (short) 0);
        secondMoment0.increment(74.0d);
        double double7 = secondMoment0.getResult();
        double double8 = secondMoment0.getResult();
        org.apache.commons.math.stat.descriptive.moment.Variance variance9 = new org.apache.commons.math.stat.descriptive.moment.Variance(secondMoment0);
        variance9.clear();
        long long11 = variance9.getN();
        org.apache.commons.math.stat.descriptive.moment.SecondMoment secondMoment12 = new org.apache.commons.math.stat.descriptive.moment.SecondMoment();
        secondMoment12.increment((double) ' ');
        org.apache.commons.math.stat.descriptive.moment.Variance variance15 = new org.apache.commons.math.stat.descriptive.moment.Variance(secondMoment12);
        secondMoment12.increment((double) (short) -1);
        secondMoment12.clear();
        secondMoment12.increment((double) 0L);
        org.apache.commons.math.stat.descriptive.moment.Variance variance21 = new org.apache.commons.math.stat.descriptive.moment.Variance(secondMoment12);
        org.apache.commons.math.stat.descriptive.moment.SecondMoment secondMoment22 = new org.apache.commons.math.stat.descriptive.moment.SecondMoment();
        secondMoment22.increment(1.0d);
        secondMoment22.increment((double) (short) 0);
        double double27 = secondMoment22.getResult();
        org.apache.commons.math.stat.descriptive.moment.SecondMoment secondMoment28 = new org.apache.commons.math.stat.descriptive.moment.SecondMoment();
        secondMoment28.increment(1.0d);
        double[] doubleArray34 = new double[] { (-1L), 0, 10L };
        secondMoment28.incrementAll(doubleArray34, 0, 0);
        double double38 = secondMoment22.evaluate(doubleArray34);
        double double39 = secondMoment12.evaluate(doubleArray34);
        secondMoment12.increment((double) 'a');
        secondMoment12.increment(3.0d);
        org.apache.commons.math.stat.descriptive.moment.Variance variance44 = new org.apache.commons.math.stat.descriptive.moment.Variance();
        org.apache.commons.math.stat.descriptive.moment.SecondMoment secondMoment45 = new org.apache.commons.math.stat.descriptive.moment.SecondMoment();
        secondMoment45.increment(1.0d);
        secondMoment45.increment((double) (short) 0);
        double double50 = secondMoment45.getResult();
        org.apache.commons.math.stat.descriptive.moment.SecondMoment secondMoment51 = new org.apache.commons.math.stat.descriptive.moment.SecondMoment();
        secondMoment51.increment(1.0d);
        double[] doubleArray57 = new double[] { (-1L), 0, 10L };
        secondMoment51.incrementAll(doubleArray57, 0, 0);
        double double61 = secondMoment45.evaluate(doubleArray57);
        double[] doubleArray62 = new double[] {};
        secondMoment45.incrementAll(doubleArray62);
        double double66 = variance44.evaluate(doubleArray62, (int) (byte) 0, 0);
        double double67 = secondMoment12.evaluate(doubleArray62);
        double double70 = variance9.evaluate(doubleArray62, (int) (byte) 0, (int) (byte) 0);
        variance9.clear();
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 3602.0d + "'", double7 == 3602.0d);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 3602.0d + "'", double8 == 3602.0d);
        org.junit.Assert.assertTrue("'" + long11 + "' != '" + 3L + "'", long11 == 3L);
        org.junit.Assert.assertTrue("'" + double27 + "' != '" + 0.5d + "'", double27 == 0.5d);
        org.junit.Assert.assertNotNull(doubleArray34);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray34), "[-1.0, 0.0, 10.0]");
        org.junit.Assert.assertTrue("'" + double38 + "' != '" + 74.0d + "'", double38 == 74.0d);
        org.junit.Assert.assertTrue("'" + double39 + "' != '" + 74.0d + "'", double39 == 74.0d);
        org.junit.Assert.assertTrue("'" + double50 + "' != '" + 0.5d + "'", double50 == 0.5d);
        org.junit.Assert.assertNotNull(doubleArray57);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray57), "[-1.0, 0.0, 10.0]");
        org.junit.Assert.assertTrue("'" + double61 + "' != '" + 74.0d + "'", double61 == 74.0d);
        org.junit.Assert.assertNotNull(doubleArray62);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray62), "[]");
        org.junit.Assert.assertTrue(Double.isNaN(double66));
        org.junit.Assert.assertTrue("'" + double67 + "' != '" + 7142.8d + "'", double67 == 7142.8d);
        org.junit.Assert.assertTrue(Double.isNaN(double70));
    }

    @Test
    public void test16512() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest33.test16512");
        org.apache.commons.math.stat.descriptive.moment.SecondMoment secondMoment0 = new org.apache.commons.math.stat.descriptive.moment.SecondMoment();
        secondMoment0.increment((double) ' ');
        org.apache.commons.math.stat.descriptive.moment.Variance variance3 = new org.apache.commons.math.stat.descriptive.moment.Variance(secondMoment0);
        secondMoment0.increment((double) (short) -1);
        secondMoment0.clear();
        secondMoment0.increment((double) 'a');
        secondMoment0.increment(0.25d);
        secondMoment0.increment(30.333333333333332d);
        org.apache.commons.math.stat.descriptive.moment.SecondMoment secondMoment13 = new org.apache.commons.math.stat.descriptive.moment.SecondMoment();
        secondMoment13.increment((double) ' ');
        org.apache.commons.math.stat.descriptive.moment.Variance variance16 = new org.apache.commons.math.stat.descriptive.moment.Variance(secondMoment13);
        secondMoment13.increment((double) (short) -1);
        secondMoment13.clear();
        secondMoment13.increment((double) 'a');
        org.apache.commons.math.stat.descriptive.moment.SecondMoment secondMoment22 = new org.apache.commons.math.stat.descriptive.moment.SecondMoment();
        secondMoment22.increment(1.0d);
        secondMoment22.increment((double) (short) 0);
        boolean boolean27 = secondMoment13.equals((java.lang.Object) secondMoment22);
        org.apache.commons.math.stat.descriptive.moment.SecondMoment secondMoment28 = new org.apache.commons.math.stat.descriptive.moment.SecondMoment();
        secondMoment28.increment(1.0d);
        org.apache.commons.math.stat.descriptive.moment.SecondMoment secondMoment31 = new org.apache.commons.math.stat.descriptive.moment.SecondMoment();
        secondMoment31.increment(1.0d);
        double[] doubleArray37 = new double[] { (-1L), 0, 10L };
        secondMoment31.incrementAll(doubleArray37, 0, 0);
        double[] doubleArray43 = new double[] { 10, (byte) 100 };
        double double44 = secondMoment31.evaluate(doubleArray43);
        double double45 = secondMoment28.evaluate(doubleArray43);
        secondMoment13.incrementAll(doubleArray43);
        double double47 = secondMoment0.evaluate(doubleArray43);
        double double48 = secondMoment0.getResult();
        secondMoment0.clear();
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + false + "'", boolean27 == false);
        org.junit.Assert.assertNotNull(doubleArray37);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray37), "[-1.0, 0.0, 10.0]");
        org.junit.Assert.assertNotNull(doubleArray43);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray43), "[10.0, 100.0]");
        org.junit.Assert.assertTrue("'" + double44 + "' != '" + 4050.0d + "'", double44 == 4050.0d);
        org.junit.Assert.assertTrue("'" + double45 + "' != '" + 4050.0d + "'", double45 == 4050.0d);
        org.junit.Assert.assertTrue("'" + double47 + "' != '" + 4050.0d + "'", double47 == 4050.0d);
        org.junit.Assert.assertTrue("'" + double48 + "' != '" + 4050.0d + "'", double48 == 4050.0d);
    }

    @Test
    public void test16513() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest33.test16513");
        org.apache.commons.math.stat.descriptive.moment.SecondMoment secondMoment0 = new org.apache.commons.math.stat.descriptive.moment.SecondMoment();
        secondMoment0.increment((double) ' ');
        org.apache.commons.math.stat.descriptive.moment.Variance variance3 = new org.apache.commons.math.stat.descriptive.moment.Variance(secondMoment0);
        secondMoment0.increment((double) (short) -1);
        secondMoment0.clear();
        double double7 = secondMoment0.getResult();
        org.apache.commons.math.stat.descriptive.moment.Variance variance8 = new org.apache.commons.math.stat.descriptive.moment.Variance(secondMoment0);
        variance8.increment(4050.0d);
        org.apache.commons.math.stat.descriptive.moment.SecondMoment secondMoment11 = new org.apache.commons.math.stat.descriptive.moment.SecondMoment();
        secondMoment11.increment(1.0d);
        double[] doubleArray17 = new double[] { (-1L), 0, 10L };
        secondMoment11.incrementAll(doubleArray17, 0, 0);
        org.apache.commons.math.stat.descriptive.moment.Variance variance21 = new org.apache.commons.math.stat.descriptive.moment.Variance(secondMoment11);
        long long22 = variance21.getN();
        variance21.setBiasCorrected(false);
        boolean boolean25 = variance8.equals((java.lang.Object) variance21);
        boolean boolean26 = variance21.isBiasCorrected();
        double double27 = variance21.getResult();
        long long28 = variance21.getN();
        long long29 = variance21.getN();
        org.junit.Assert.assertTrue(Double.isNaN(double7));
        org.junit.Assert.assertNotNull(doubleArray17);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray17), "[-1.0, 0.0, 10.0]");
        org.junit.Assert.assertTrue("'" + long22 + "' != '" + 1L + "'", long22 == 1L);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
        org.junit.Assert.assertTrue("'" + double27 + "' != '" + 0.0d + "'", double27 == 0.0d);
        org.junit.Assert.assertTrue("'" + long28 + "' != '" + 1L + "'", long28 == 1L);
        org.junit.Assert.assertTrue("'" + long29 + "' != '" + 1L + "'", long29 == 1L);
    }

    @Test
    public void test16514() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest33.test16514");
        org.apache.commons.math.stat.descriptive.moment.SecondMoment secondMoment0 = new org.apache.commons.math.stat.descriptive.moment.SecondMoment();
        secondMoment0.increment((double) ' ');
        org.apache.commons.math.stat.descriptive.moment.Variance variance3 = new org.apache.commons.math.stat.descriptive.moment.Variance(secondMoment0);
        secondMoment0.increment(272.25d);
        long long6 = secondMoment0.getN();
        double double7 = secondMoment0.getResult();
        secondMoment0.increment(1.5803546165550332E27d);
        org.apache.commons.math.stat.descriptive.moment.SecondMoment secondMoment11 = new org.apache.commons.math.stat.descriptive.moment.SecondMoment();
        secondMoment11.increment(1.0d);
        double[] doubleArray17 = new double[] { (-1L), 0, 10L };
        secondMoment11.incrementAll(doubleArray17, 0, 0);
        double[] doubleArray23 = new double[] { 10, (byte) 100 };
        double double24 = secondMoment11.evaluate(doubleArray23);
        double double25 = secondMoment11.getResult();
        secondMoment11.increment((double) (short) -1);
        double double28 = secondMoment11.getResult();
        org.apache.commons.math.stat.descriptive.moment.SecondMoment secondMoment29 = new org.apache.commons.math.stat.descriptive.moment.SecondMoment();
        secondMoment29.increment(1.0d);
        double[] doubleArray35 = new double[] { (-1L), 0, 10L };
        secondMoment29.incrementAll(doubleArray35, 0, 0);
        double[] doubleArray41 = new double[] { 10, (byte) 100 };
        double double42 = secondMoment29.evaluate(doubleArray41);
        double double43 = secondMoment11.evaluate(doubleArray41);
        org.apache.commons.math.stat.descriptive.moment.Variance variance44 = new org.apache.commons.math.stat.descriptive.moment.Variance(false, secondMoment11);
        variance44.increment(1.8756123185185187E7d);
        variance44.clear();
        variance44.increment(2.1875d);
        boolean boolean50 = secondMoment0.equals((java.lang.Object) variance44);
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 2L + "'", long6 == 2L);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 28860.03125d + "'", double7 == 28860.03125d);
        org.junit.Assert.assertNotNull(doubleArray17);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray17), "[-1.0, 0.0, 10.0]");
        org.junit.Assert.assertNotNull(doubleArray23);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray23), "[10.0, 100.0]");
        org.junit.Assert.assertTrue("'" + double24 + "' != '" + 4050.0d + "'", double24 == 4050.0d);
        org.junit.Assert.assertTrue("'" + double25 + "' != '" + 4050.0d + "'", double25 == 4050.0d);
        org.junit.Assert.assertTrue("'" + double28 + "' != '" + 6140.666666666667d + "'", double28 == 6140.666666666667d);
        org.junit.Assert.assertNotNull(doubleArray35);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray35), "[-1.0, 0.0, 10.0]");
        org.junit.Assert.assertNotNull(doubleArray41);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray41), "[10.0, 100.0]");
        org.junit.Assert.assertTrue("'" + double42 + "' != '" + 4050.0d + "'", double42 == 4050.0d);
        org.junit.Assert.assertTrue("'" + double43 + "' != '" + 4050.0d + "'", double43 == 4050.0d);
        org.junit.Assert.assertTrue("'" + boolean50 + "' != '" + false + "'", boolean50 == false);
    }

    @Test
    public void test16515() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest33.test16515");
        org.apache.commons.math.stat.descriptive.moment.SecondMoment secondMoment0 = new org.apache.commons.math.stat.descriptive.moment.SecondMoment();
        secondMoment0.increment(1.0d);
        secondMoment0.clear();
        double double4 = secondMoment0.getResult();
        org.apache.commons.math.stat.descriptive.moment.SecondMoment secondMoment5 = new org.apache.commons.math.stat.descriptive.moment.SecondMoment();
        secondMoment5.increment(1.0d);
        double[] doubleArray11 = new double[] { (-1L), 0, 10L };
        secondMoment5.incrementAll(doubleArray11, 0, 0);
        double[] doubleArray17 = new double[] { 10, (byte) 100 };
        double double18 = secondMoment5.evaluate(doubleArray17);
        secondMoment5.clear();
        secondMoment5.increment((double) (-1.0f));
        org.apache.commons.math.stat.descriptive.moment.Variance variance22 = new org.apache.commons.math.stat.descriptive.moment.Variance(secondMoment5);
        secondMoment5.increment(482.66666666666663d);
        secondMoment5.clear();
        double double26 = secondMoment5.getResult();
        secondMoment5.increment(1769.25d);
        org.apache.commons.math.stat.descriptive.moment.SecondMoment secondMoment30 = new org.apache.commons.math.stat.descriptive.moment.SecondMoment();
        secondMoment30.increment(1.0d);
        double[] doubleArray36 = new double[] { (-1L), 0, 10L };
        secondMoment30.incrementAll(doubleArray36, 0, 0);
        double[] doubleArray42 = new double[] { 10, (byte) 100 };
        double double43 = secondMoment30.evaluate(doubleArray42);
        double double44 = secondMoment30.getResult();
        long long45 = secondMoment30.getN();
        long long46 = secondMoment30.getN();
        org.apache.commons.math.stat.descriptive.moment.Variance variance47 = new org.apache.commons.math.stat.descriptive.moment.Variance(true, secondMoment30);
        variance47.clear();
        variance47.increment(422.08333333333337d);
        variance47.clear();
        org.apache.commons.math.stat.descriptive.moment.Variance variance53 = new org.apache.commons.math.stat.descriptive.moment.Variance(true);
        long long54 = variance53.getN();
        double double55 = variance53.getResult();
        double double56 = variance53.getResult();
        long long57 = variance53.getN();
        boolean boolean58 = variance53.isBiasCorrected();
        double double59 = variance53.getResult();
        org.apache.commons.math.stat.descriptive.moment.SecondMoment secondMoment60 = new org.apache.commons.math.stat.descriptive.moment.SecondMoment();
        secondMoment60.increment(1.0d);
        double[] doubleArray66 = new double[] { (-1L), 0, 10L };
        secondMoment60.incrementAll(doubleArray66, 0, 0);
        long long70 = secondMoment60.getN();
        org.apache.commons.math.stat.descriptive.moment.SecondMoment secondMoment71 = new org.apache.commons.math.stat.descriptive.moment.SecondMoment();
        secondMoment71.increment(1.0d);
        double[] doubleArray77 = new double[] { (-1L), 0, 10L };
        secondMoment71.incrementAll(doubleArray77, 0, 0);
        secondMoment60.incrementAll(doubleArray77, 0, (int) (short) 1);
        double double84 = variance53.evaluate(doubleArray77);
        variance47.incrementAll(doubleArray77);
        double double86 = secondMoment5.evaluate(doubleArray77);
        // The following exception was thrown during execution in test generation
        try {
            double double89 = secondMoment0.evaluate(doubleArray77, (int) (byte) 100, (int) (byte) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: begin + length > values.length");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue(Double.isNaN(double4));
        org.junit.Assert.assertNotNull(doubleArray11);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray11), "[-1.0, 0.0, 10.0]");
        org.junit.Assert.assertNotNull(doubleArray17);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray17), "[10.0, 100.0]");
        org.junit.Assert.assertTrue("'" + double18 + "' != '" + 4050.0d + "'", double18 == 4050.0d);
        org.junit.Assert.assertTrue(Double.isNaN(double26));
        org.junit.Assert.assertNotNull(doubleArray36);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray36), "[-1.0, 0.0, 10.0]");
        org.junit.Assert.assertNotNull(doubleArray42);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray42), "[10.0, 100.0]");
        org.junit.Assert.assertTrue("'" + double43 + "' != '" + 4050.0d + "'", double43 == 4050.0d);
        org.junit.Assert.assertTrue("'" + double44 + "' != '" + 4050.0d + "'", double44 == 4050.0d);
        org.junit.Assert.assertTrue("'" + long45 + "' != '" + 2L + "'", long45 == 2L);
        org.junit.Assert.assertTrue("'" + long46 + "' != '" + 2L + "'", long46 == 2L);
        org.junit.Assert.assertTrue("'" + long54 + "' != '" + 0L + "'", long54 == 0L);
        org.junit.Assert.assertTrue(Double.isNaN(double55));
        org.junit.Assert.assertTrue(Double.isNaN(double56));
        org.junit.Assert.assertTrue("'" + long57 + "' != '" + 0L + "'", long57 == 0L);
        org.junit.Assert.assertTrue("'" + boolean58 + "' != '" + true + "'", boolean58 == true);
        org.junit.Assert.assertTrue(Double.isNaN(double59));
        org.junit.Assert.assertNotNull(doubleArray66);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray66), "[-1.0, 0.0, 10.0]");
        org.junit.Assert.assertTrue("'" + long70 + "' != '" + 1L + "'", long70 == 1L);
        org.junit.Assert.assertNotNull(doubleArray77);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray77), "[-1.0, 0.0, 10.0]");
        org.junit.Assert.assertTrue("'" + double84 + "' != '" + 37.0d + "'", double84 == 37.0d);
        org.junit.Assert.assertTrue("'" + double86 + "' != '" + 74.0d + "'", double86 == 74.0d);
    }

    @Test
    public void test16516() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest33.test16516");
        org.apache.commons.math.stat.descriptive.moment.SecondMoment secondMoment0 = new org.apache.commons.math.stat.descriptive.moment.SecondMoment();
        secondMoment0.increment((double) ' ');
        org.apache.commons.math.stat.descriptive.moment.Variance variance3 = new org.apache.commons.math.stat.descriptive.moment.Variance(secondMoment0);
        secondMoment0.increment((double) (short) -1);
        secondMoment0.clear();
        secondMoment0.increment((double) 0L);
        org.apache.commons.math.stat.descriptive.moment.Variance variance9 = new org.apache.commons.math.stat.descriptive.moment.Variance(secondMoment0);
        double double10 = secondMoment0.getResult();
        java.lang.Object obj11 = null;
        boolean boolean12 = secondMoment0.equals(obj11);
        org.apache.commons.math.stat.descriptive.moment.Variance variance13 = new org.apache.commons.math.stat.descriptive.moment.Variance(secondMoment0);
        boolean boolean14 = variance13.isBiasCorrected();
        variance13.increment(7836.75d);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 0.0d + "'", double10 == 0.0d);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
    }

    @Test
    public void test16517() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest33.test16517");
        org.apache.commons.math.stat.descriptive.moment.SecondMoment secondMoment1 = new org.apache.commons.math.stat.descriptive.moment.SecondMoment();
        secondMoment1.increment((double) ' ');
        org.apache.commons.math.stat.descriptive.moment.Variance variance4 = new org.apache.commons.math.stat.descriptive.moment.Variance(secondMoment1);
        secondMoment1.increment((double) (short) -1);
        long long7 = secondMoment1.getN();
        org.apache.commons.math.stat.descriptive.moment.Variance variance8 = new org.apache.commons.math.stat.descriptive.moment.Variance(false, secondMoment1);
        org.apache.commons.math.stat.descriptive.moment.Variance variance9 = new org.apache.commons.math.stat.descriptive.moment.Variance(secondMoment1);
        double double10 = secondMoment1.getResult();
        double double11 = secondMoment1.getResult();
        long long12 = secondMoment1.getN();
        double double13 = secondMoment1.getResult();
        secondMoment1.clear();
        double double15 = secondMoment1.getResult();
        org.apache.commons.math.stat.descriptive.moment.SecondMoment secondMoment17 = new org.apache.commons.math.stat.descriptive.moment.SecondMoment();
        secondMoment17.increment(1.0d);
        secondMoment17.increment((double) (short) 0);
        double double22 = secondMoment17.getResult();
        org.apache.commons.math.stat.descriptive.moment.SecondMoment secondMoment24 = new org.apache.commons.math.stat.descriptive.moment.SecondMoment();
        secondMoment24.increment(1.0d);
        double[] doubleArray30 = new double[] { (-1L), 0, 10L };
        secondMoment24.incrementAll(doubleArray30, 0, 0);
        double[] doubleArray36 = new double[] { 10, (byte) 100 };
        double double37 = secondMoment24.evaluate(doubleArray36);
        double double38 = secondMoment24.getResult();
        long long39 = secondMoment24.getN();
        long long40 = secondMoment24.getN();
        org.apache.commons.math.stat.descriptive.moment.Variance variance41 = new org.apache.commons.math.stat.descriptive.moment.Variance(true, secondMoment24);
        boolean boolean42 = secondMoment17.equals((java.lang.Object) secondMoment24);
        org.apache.commons.math.stat.descriptive.moment.Variance variance43 = new org.apache.commons.math.stat.descriptive.moment.Variance(false, secondMoment17);
        org.apache.commons.math.stat.descriptive.moment.Variance variance44 = new org.apache.commons.math.stat.descriptive.moment.Variance(secondMoment17);
        variance44.clear();
        variance44.clear();
        variance44.clear();
        double double48 = variance44.getResult();
        variance44.clear();
        org.apache.commons.math.stat.descriptive.moment.SecondMoment secondMoment50 = new org.apache.commons.math.stat.descriptive.moment.SecondMoment();
        secondMoment50.increment((double) ' ');
        org.apache.commons.math.stat.descriptive.moment.Variance variance53 = new org.apache.commons.math.stat.descriptive.moment.Variance(secondMoment50);
        secondMoment50.increment((double) (short) -1);
        secondMoment50.clear();
        secondMoment50.increment((double) 0L);
        org.apache.commons.math.stat.descriptive.moment.Variance variance59 = new org.apache.commons.math.stat.descriptive.moment.Variance(secondMoment50);
        org.apache.commons.math.stat.descriptive.moment.SecondMoment secondMoment60 = new org.apache.commons.math.stat.descriptive.moment.SecondMoment();
        secondMoment60.increment(1.0d);
        double[] doubleArray66 = new double[] { (-1L), 0, 10L };
        secondMoment60.incrementAll(doubleArray66, 0, 0);
        variance59.incrementAll(doubleArray66);
        long long71 = variance59.getN();
        variance59.clear();
        boolean boolean73 = variance59.isBiasCorrected();
        variance59.setBiasCorrected(false);
        org.apache.commons.math.stat.descriptive.moment.SecondMoment secondMoment76 = new org.apache.commons.math.stat.descriptive.moment.SecondMoment();
        secondMoment76.increment(1.0d);
        double[] doubleArray82 = new double[] { (-1L), 0, 10L };
        secondMoment76.incrementAll(doubleArray82, 0, 0);
        double double87 = variance59.evaluate(doubleArray82, (double) '4');
        double double88 = variance44.evaluate(doubleArray82);
        double double91 = secondMoment1.evaluate(doubleArray82, (int) (short) 1, (int) (byte) 0);
        double double92 = secondMoment1.getResult();
        secondMoment1.increment(4.5106306E7d);
        secondMoment1.increment(0.0d);
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + 2L + "'", long7 == 2L);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 544.5d + "'", double10 == 544.5d);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 544.5d + "'", double11 == 544.5d);
        org.junit.Assert.assertTrue("'" + long12 + "' != '" + 2L + "'", long12 == 2L);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 544.5d + "'", double13 == 544.5d);
        org.junit.Assert.assertTrue(Double.isNaN(double15));
        org.junit.Assert.assertTrue("'" + double22 + "' != '" + 0.5d + "'", double22 == 0.5d);
        org.junit.Assert.assertNotNull(doubleArray30);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray30), "[-1.0, 0.0, 10.0]");
        org.junit.Assert.assertNotNull(doubleArray36);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray36), "[10.0, 100.0]");
        org.junit.Assert.assertTrue("'" + double37 + "' != '" + 4050.0d + "'", double37 == 4050.0d);
        org.junit.Assert.assertTrue("'" + double38 + "' != '" + 4050.0d + "'", double38 == 4050.0d);
        org.junit.Assert.assertTrue("'" + long39 + "' != '" + 2L + "'", long39 == 2L);
        org.junit.Assert.assertTrue("'" + long40 + "' != '" + 2L + "'", long40 == 2L);
        org.junit.Assert.assertTrue("'" + boolean42 + "' != '" + false + "'", boolean42 == false);
        org.junit.Assert.assertTrue("'" + double48 + "' != '" + 0.5d + "'", double48 == 0.5d);
        org.junit.Assert.assertNotNull(doubleArray66);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray66), "[-1.0, 0.0, 10.0]");
        org.junit.Assert.assertTrue("'" + long71 + "' != '" + 1L + "'", long71 == 1L);
        org.junit.Assert.assertTrue("'" + boolean73 + "' != '" + true + "'", boolean73 == true);
        org.junit.Assert.assertNotNull(doubleArray82);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray82), "[-1.0, 0.0, 10.0]");
        org.junit.Assert.assertTrue("'" + double87 + "' != '" + 24.666666666666668d + "'", double87 == 24.666666666666668d);
        org.junit.Assert.assertTrue("'" + double88 + "' != '" + 37.0d + "'", double88 == 37.0d);
        org.junit.Assert.assertTrue(Double.isNaN(double91));
        org.junit.Assert.assertTrue(Double.isNaN(double92));
    }

    @Test
    public void test16518() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest33.test16518");
        org.apache.commons.math.stat.descriptive.moment.SecondMoment secondMoment1 = new org.apache.commons.math.stat.descriptive.moment.SecondMoment();
        secondMoment1.increment(1.0d);
        double[] doubleArray7 = new double[] { (-1L), 0, 10L };
        secondMoment1.incrementAll(doubleArray7, 0, 0);
        long long11 = secondMoment1.getN();
        org.apache.commons.math.stat.descriptive.moment.Variance variance12 = new org.apache.commons.math.stat.descriptive.moment.Variance(secondMoment1);
        org.apache.commons.math.stat.descriptive.moment.Variance variance13 = new org.apache.commons.math.stat.descriptive.moment.Variance(false, secondMoment1);
        double double14 = variance13.getResult();
        variance13.increment(29180.75d);
        variance13.increment(4.728466894599528E13d);
        org.junit.Assert.assertNotNull(doubleArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray7), "[-1.0, 0.0, 10.0]");
        org.junit.Assert.assertTrue("'" + long11 + "' != '" + 1L + "'", long11 == 1L);
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + 0.0d + "'", double14 == 0.0d);
    }

    @Test
    public void test16519() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest33.test16519");
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
        secondMoment2.clear();
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
        double double71 = secondMoment2.evaluate(doubleArray63);
        double double72 = secondMoment2.getResult();
        secondMoment2.increment((-1.073741824E9d));
        secondMoment2.clear();
        org.junit.Assert.assertNotNull(doubleArray8);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray8), "[-1.0, 0.0, 10.0]");
        org.junit.Assert.assertNotNull(doubleArray14);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray14), "[10.0, 100.0]");
        org.junit.Assert.assertTrue("'" + double15 + "' != '" + 4050.0d + "'", double15 == 4050.0d);
        org.junit.Assert.assertTrue("'" + double16 + "' != '" + 4050.0d + "'", double16 == 4050.0d);
        org.junit.Assert.assertTrue("'" + long18 + "' != '" + 2L + "'", long18 == 2L);
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
        org.junit.Assert.assertTrue("'" + double71 + "' != '" + 74.0d + "'", double71 == 74.0d);
        org.junit.Assert.assertTrue("'" + double72 + "' != '" + 74.0d + "'", double72 == 74.0d);
    }

    @Test
    public void test16520() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest33.test16520");
        org.apache.commons.math.stat.descriptive.moment.SecondMoment secondMoment0 = new org.apache.commons.math.stat.descriptive.moment.SecondMoment();
        secondMoment0.increment(1.0d);
        secondMoment0.increment((double) (short) 0);
        double double5 = secondMoment0.getResult();
        double double6 = secondMoment0.getResult();
        org.apache.commons.math.stat.descriptive.moment.Variance variance7 = new org.apache.commons.math.stat.descriptive.moment.Variance(secondMoment0);
        secondMoment0.increment(2.7963163706731616E14d);
        long long10 = secondMoment0.getN();
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.5d + "'", double5 == 0.5d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.5d + "'", double6 == 0.5d);
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + 3L + "'", long10 == 3L);
    }

    @Test
    public void test16521() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest33.test16521");
        org.apache.commons.math.stat.descriptive.moment.SecondMoment secondMoment2 = new org.apache.commons.math.stat.descriptive.moment.SecondMoment();
        secondMoment2.increment((double) ' ');
        org.apache.commons.math.stat.descriptive.moment.Variance variance5 = new org.apache.commons.math.stat.descriptive.moment.Variance(secondMoment2);
        double[] doubleArray11 = new double[] { 0L, (byte) 1, 6140.666666666667d, 544.5d, (byte) 100 };
        double double12 = secondMoment2.evaluate(doubleArray11);
        long long13 = secondMoment2.getN();
        org.apache.commons.math.stat.descriptive.moment.Variance variance14 = new org.apache.commons.math.stat.descriptive.moment.Variance(true, secondMoment2);
        org.apache.commons.math.stat.descriptive.moment.SecondMoment secondMoment17 = new org.apache.commons.math.stat.descriptive.moment.SecondMoment();
        secondMoment17.increment(1.0d);
        secondMoment17.increment((double) (short) 0);
        secondMoment17.increment(74.0d);
        org.apache.commons.math.stat.descriptive.moment.Variance variance24 = new org.apache.commons.math.stat.descriptive.moment.Variance(true, secondMoment17);
        long long25 = secondMoment17.getN();
        org.apache.commons.math.stat.descriptive.moment.Variance variance26 = new org.apache.commons.math.stat.descriptive.moment.Variance(true, secondMoment17);
        secondMoment17.increment(0.0d);
        secondMoment17.clear();
        org.apache.commons.math.stat.descriptive.moment.SecondMoment secondMoment30 = new org.apache.commons.math.stat.descriptive.moment.SecondMoment();
        secondMoment30.increment(1.0d);
        double[] doubleArray36 = new double[] { (-1L), 0, 10L };
        secondMoment30.incrementAll(doubleArray36, 0, 0);
        double[] doubleArray42 = new double[] { 10, (byte) 100 };
        double double43 = secondMoment30.evaluate(doubleArray42);
        org.apache.commons.math.stat.descriptive.moment.Variance variance44 = new org.apache.commons.math.stat.descriptive.moment.Variance();
        org.apache.commons.math.stat.descriptive.moment.SecondMoment secondMoment45 = new org.apache.commons.math.stat.descriptive.moment.SecondMoment();
        secondMoment45.increment(1.0d);
        secondMoment45.increment((double) (short) 0);
        double double50 = secondMoment45.getResult();
        org.apache.commons.math.stat.descriptive.moment.SecondMoment secondMoment51 = new org.apache.commons.math.stat.descriptive.moment.SecondMoment();
        secondMoment51.increment(1.0d);
        double[] doubleArray57 = new double[] { (-1L), 0, 10L };
        secondMoment51.incrementAll(doubleArray57, 0, 0);
        double double61 = secondMoment45.evaluate(doubleArray57);
        double[] doubleArray62 = new double[] {};
        secondMoment45.incrementAll(doubleArray62);
        double double66 = variance44.evaluate(doubleArray62, (int) (byte) 0, 0);
        double double67 = secondMoment30.evaluate(doubleArray62);
        double double68 = secondMoment17.evaluate(doubleArray62);
        secondMoment2.incrementAll(doubleArray62);
        org.apache.commons.math.stat.descriptive.moment.Variance variance70 = new org.apache.commons.math.stat.descriptive.moment.Variance(true, secondMoment2);
        org.junit.Assert.assertNotNull(doubleArray11);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray11), "[0.0, 1.0, 6140.666666666667, 544.5, 100.0]");
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 2.880385675555556E7d + "'", double12 == 2.880385675555556E7d);
        org.junit.Assert.assertTrue("'" + long13 + "' != '" + 5L + "'", long13 == 5L);
        org.junit.Assert.assertTrue("'" + long25 + "' != '" + 3L + "'", long25 == 3L);
        org.junit.Assert.assertNotNull(doubleArray36);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray36), "[-1.0, 0.0, 10.0]");
        org.junit.Assert.assertNotNull(doubleArray42);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray42), "[10.0, 100.0]");
        org.junit.Assert.assertTrue("'" + double43 + "' != '" + 4050.0d + "'", double43 == 4050.0d);
        org.junit.Assert.assertTrue("'" + double50 + "' != '" + 0.5d + "'", double50 == 0.5d);
        org.junit.Assert.assertNotNull(doubleArray57);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray57), "[-1.0, 0.0, 10.0]");
        org.junit.Assert.assertTrue("'" + double61 + "' != '" + 74.0d + "'", double61 == 74.0d);
        org.junit.Assert.assertNotNull(doubleArray62);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray62), "[]");
        org.junit.Assert.assertTrue(Double.isNaN(double66));
        org.junit.Assert.assertTrue("'" + double67 + "' != '" + 4050.0d + "'", double67 == 4050.0d);
        org.junit.Assert.assertTrue(Double.isNaN(double68));
    }

    @Test
    public void test16522() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest33.test16522");
        org.apache.commons.math.stat.descriptive.moment.SecondMoment secondMoment0 = new org.apache.commons.math.stat.descriptive.moment.SecondMoment();
        secondMoment0.increment((double) ' ');
        secondMoment0.increment((double) '4');
        long long5 = secondMoment0.getN();
        org.apache.commons.math.stat.descriptive.moment.Variance variance6 = new org.apache.commons.math.stat.descriptive.moment.Variance(secondMoment0);
        double double7 = variance6.getResult();
        variance6.clear();
        variance6.setBiasCorrected(true);
        variance6.setBiasCorrected(true);
        variance6.increment(0.0d);
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 2L + "'", long5 == 2L);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 200.0d + "'", double7 == 200.0d);
    }

    @Test
    public void test16523() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest33.test16523");
        org.apache.commons.math.stat.descriptive.moment.SecondMoment secondMoment0 = new org.apache.commons.math.stat.descriptive.moment.SecondMoment();
        secondMoment0.increment(1.0d);
        secondMoment0.increment((double) (short) 0);
        long long5 = secondMoment0.getN();
        double double6 = secondMoment0.getResult();
        double double7 = secondMoment0.getResult();
        org.apache.commons.math.stat.descriptive.moment.SecondMoment secondMoment8 = new org.apache.commons.math.stat.descriptive.moment.SecondMoment();
        secondMoment8.increment(1.0d);
        double[] doubleArray14 = new double[] { (-1L), 0, 10L };
        secondMoment8.incrementAll(doubleArray14, 0, 0);
        double[] doubleArray20 = new double[] { 10, (byte) 100 };
        double double21 = secondMoment8.evaluate(doubleArray20);
        long long22 = secondMoment8.getN();
        double double23 = secondMoment8.getResult();
        org.apache.commons.math.stat.descriptive.moment.SecondMoment secondMoment24 = new org.apache.commons.math.stat.descriptive.moment.SecondMoment();
        secondMoment24.increment((double) ' ');
        org.apache.commons.math.stat.descriptive.moment.Variance variance27 = new org.apache.commons.math.stat.descriptive.moment.Variance(secondMoment24);
        secondMoment24.increment((double) (short) -1);
        secondMoment24.clear();
        double double31 = secondMoment24.getResult();
        org.apache.commons.math.stat.descriptive.moment.SecondMoment secondMoment32 = new org.apache.commons.math.stat.descriptive.moment.SecondMoment();
        secondMoment32.increment(1.0d);
        secondMoment32.increment((double) (short) 0);
        double double37 = secondMoment32.getResult();
        org.apache.commons.math.stat.descriptive.moment.SecondMoment secondMoment38 = new org.apache.commons.math.stat.descriptive.moment.SecondMoment();
        secondMoment38.increment(1.0d);
        double[] doubleArray44 = new double[] { (-1L), 0, 10L };
        secondMoment38.incrementAll(doubleArray44, 0, 0);
        double double48 = secondMoment32.evaluate(doubleArray44);
        secondMoment24.incrementAll(doubleArray44, 0, (int) (short) 0);
        double double52 = secondMoment8.evaluate(doubleArray44);
        org.apache.commons.math.stat.descriptive.moment.SecondMoment secondMoment53 = new org.apache.commons.math.stat.descriptive.moment.SecondMoment();
        secondMoment53.increment(1.0d);
        secondMoment53.increment((double) (short) 0);
        long long58 = secondMoment53.getN();
        org.apache.commons.math.stat.descriptive.moment.SecondMoment secondMoment59 = new org.apache.commons.math.stat.descriptive.moment.SecondMoment();
        secondMoment59.increment(1.0d);
        double[] doubleArray65 = new double[] { (-1L), 0, 10L };
        secondMoment59.incrementAll(doubleArray65, 0, 0);
        long long69 = secondMoment59.getN();
        org.apache.commons.math.stat.descriptive.moment.SecondMoment secondMoment70 = new org.apache.commons.math.stat.descriptive.moment.SecondMoment();
        secondMoment70.increment(1.0d);
        double[] doubleArray76 = new double[] { (-1L), 0, 10L };
        secondMoment70.incrementAll(doubleArray76, 0, 0);
        secondMoment59.incrementAll(doubleArray76, 0, (int) (short) 1);
        secondMoment53.incrementAll(doubleArray76, (int) (byte) 0, (int) (byte) 1);
        secondMoment8.incrementAll(doubleArray76);
        double double87 = secondMoment0.evaluate(doubleArray76);
        secondMoment0.increment(9696140.055555556d);
        secondMoment0.increment((double) 1);
        secondMoment0.increment(1.2283730749999996E7d);
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 2L + "'", long5 == 2L);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.5d + "'", double6 == 0.5d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 0.5d + "'", double7 == 0.5d);
        org.junit.Assert.assertNotNull(doubleArray14);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray14), "[-1.0, 0.0, 10.0]");
        org.junit.Assert.assertNotNull(doubleArray20);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray20), "[10.0, 100.0]");
        org.junit.Assert.assertTrue("'" + double21 + "' != '" + 4050.0d + "'", double21 == 4050.0d);
        org.junit.Assert.assertTrue("'" + long22 + "' != '" + 2L + "'", long22 == 2L);
        org.junit.Assert.assertTrue("'" + double23 + "' != '" + 4050.0d + "'", double23 == 4050.0d);
        org.junit.Assert.assertTrue(Double.isNaN(double31));
        org.junit.Assert.assertTrue("'" + double37 + "' != '" + 0.5d + "'", double37 == 0.5d);
        org.junit.Assert.assertNotNull(doubleArray44);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray44), "[-1.0, 0.0, 10.0]");
        org.junit.Assert.assertTrue("'" + double48 + "' != '" + 74.0d + "'", double48 == 74.0d);
        org.junit.Assert.assertTrue("'" + double52 + "' != '" + 74.0d + "'", double52 == 74.0d);
        org.junit.Assert.assertTrue("'" + long58 + "' != '" + 2L + "'", long58 == 2L);
        org.junit.Assert.assertNotNull(doubleArray65);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray65), "[-1.0, 0.0, 10.0]");
        org.junit.Assert.assertTrue("'" + long69 + "' != '" + 1L + "'", long69 == 1L);
        org.junit.Assert.assertNotNull(doubleArray76);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray76), "[-1.0, 0.0, 10.0]");
        org.junit.Assert.assertTrue("'" + double87 + "' != '" + 74.0d + "'", double87 == 74.0d);
    }

    @Test
    public void test16524() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest33.test16524");
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
        double double14 = variance13.getResult();
        boolean boolean15 = variance13.isBiasCorrected();
        double double16 = variance13.getResult();
        variance13.setBiasCorrected(false);
        long long19 = variance13.getN();
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 2L + "'", long5 == 2L);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.5d + "'", double6 == 0.5d);
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + 0L + "'", long10 == 0L);
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + 0.0d + "'", double14 == 0.0d);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertTrue("'" + double16 + "' != '" + 0.0d + "'", double16 == 0.0d);
        org.junit.Assert.assertTrue("'" + long19 + "' != '" + 1L + "'", long19 == 1L);
    }

    @Test
    public void test16525() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest33.test16525");
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
        org.apache.commons.math.stat.descriptive.moment.Variance variance23 = new org.apache.commons.math.stat.descriptive.moment.Variance(false, secondMoment3);
        secondMoment3.increment(4680.28125d);
        org.apache.commons.math.stat.descriptive.moment.Variance variance26 = new org.apache.commons.math.stat.descriptive.moment.Variance(secondMoment3);
        variance26.clear();
        variance26.increment(7881.333333333333d);
        org.apache.commons.math.stat.descriptive.moment.SecondMoment secondMoment30 = new org.apache.commons.math.stat.descriptive.moment.SecondMoment();
        secondMoment30.increment((double) ' ');
        secondMoment30.increment((double) (short) 10);
        secondMoment30.increment((double) 2L);
        secondMoment30.clear();
        org.apache.commons.math.stat.descriptive.moment.SecondMoment secondMoment38 = new org.apache.commons.math.stat.descriptive.moment.SecondMoment();
        secondMoment38.increment((double) ' ');
        org.apache.commons.math.stat.descriptive.moment.Variance variance41 = new org.apache.commons.math.stat.descriptive.moment.Variance(secondMoment38);
        secondMoment38.increment((double) '4');
        org.apache.commons.math.stat.descriptive.moment.SecondMoment secondMoment45 = new org.apache.commons.math.stat.descriptive.moment.SecondMoment();
        secondMoment45.increment(1.0d);
        double[] doubleArray51 = new double[] { (-1L), 0, 10L };
        secondMoment45.incrementAll(doubleArray51, 0, 0);
        double[] doubleArray57 = new double[] { 10, (byte) 100 };
        double double58 = secondMoment45.evaluate(doubleArray57);
        double double59 = secondMoment45.getResult();
        org.apache.commons.math.stat.descriptive.moment.Variance variance60 = new org.apache.commons.math.stat.descriptive.moment.Variance(false, secondMoment45);
        org.apache.commons.math.stat.descriptive.moment.SecondMoment secondMoment61 = new org.apache.commons.math.stat.descriptive.moment.SecondMoment();
        secondMoment61.increment(1.0d);
        secondMoment61.increment((double) (short) 0);
        double double66 = secondMoment61.getResult();
        org.apache.commons.math.stat.descriptive.moment.SecondMoment secondMoment67 = new org.apache.commons.math.stat.descriptive.moment.SecondMoment();
        secondMoment67.increment(1.0d);
        double[] doubleArray73 = new double[] { (-1L), 0, 10L };
        secondMoment67.incrementAll(doubleArray73, 0, 0);
        double double77 = secondMoment61.evaluate(doubleArray73);
        double[] doubleArray78 = new double[] {};
        secondMoment61.incrementAll(doubleArray78);
        variance60.incrementAll(doubleArray78);
        double double81 = secondMoment38.evaluate(doubleArray78);
        double double82 = secondMoment30.evaluate(doubleArray78);
        // The following exception was thrown during execution in test generation
        try {
            double double85 = variance26.evaluate(doubleArray78, (-1), (int) (short) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: start position cannot be negative");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(doubleArray9);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray9), "[-1.0, 0.0, 10.0]");
        org.junit.Assert.assertNotNull(doubleArray15);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray15), "[10.0, 100.0]");
        org.junit.Assert.assertTrue("'" + double16 + "' != '" + 4050.0d + "'", double16 == 4050.0d);
        org.junit.Assert.assertTrue("'" + double17 + "' != '" + 4050.0d + "'", double17 == 4050.0d);
        org.junit.Assert.assertTrue("'" + long19 + "' != '" + 2L + "'", long19 == 2L);
        org.junit.Assert.assertTrue("'" + double21 + "' != '" + 4050.0d + "'", double21 == 4050.0d);
        org.junit.Assert.assertNotNull(doubleArray51);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray51), "[-1.0, 0.0, 10.0]");
        org.junit.Assert.assertNotNull(doubleArray57);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray57), "[10.0, 100.0]");
        org.junit.Assert.assertTrue("'" + double58 + "' != '" + 4050.0d + "'", double58 == 4050.0d);
        org.junit.Assert.assertTrue("'" + double59 + "' != '" + 4050.0d + "'", double59 == 4050.0d);
        org.junit.Assert.assertTrue("'" + double66 + "' != '" + 0.5d + "'", double66 == 0.5d);
        org.junit.Assert.assertNotNull(doubleArray73);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray73), "[-1.0, 0.0, 10.0]");
        org.junit.Assert.assertTrue("'" + double77 + "' != '" + 74.0d + "'", double77 == 74.0d);
        org.junit.Assert.assertNotNull(doubleArray78);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray78), "[]");
        org.junit.Assert.assertTrue("'" + double81 + "' != '" + 200.0d + "'", double81 == 200.0d);
        org.junit.Assert.assertTrue(Double.isNaN(double82));
    }

    @Test
    public void test16526() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest33.test16526");
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
        variance21.clear();
        variance21.setBiasCorrected(true);
        long long25 = variance21.getN();
        variance21.increment(37.25d);
        variance21.increment(12682.833333333334d);
        org.junit.Assert.assertNotNull(doubleArray8);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray8), "[-1.0, 0.0, 10.0]");
        org.junit.Assert.assertNotNull(doubleArray14);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray14), "[10.0, 100.0]");
        org.junit.Assert.assertTrue("'" + double15 + "' != '" + 4050.0d + "'", double15 == 4050.0d);
        org.junit.Assert.assertTrue("'" + long16 + "' != '" + 2L + "'", long16 == 2L);
        org.junit.Assert.assertTrue(Double.isNaN(double18));
        org.junit.Assert.assertTrue("'" + long25 + "' != '" + 0L + "'", long25 == 0L);
    }

    @Test
    public void test16527() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest33.test16527");
        org.apache.commons.math.stat.descriptive.moment.SecondMoment secondMoment0 = new org.apache.commons.math.stat.descriptive.moment.SecondMoment();
        secondMoment0.increment((double) ' ');
        double double3 = secondMoment0.getResult();
        org.apache.commons.math.stat.descriptive.moment.Variance variance4 = new org.apache.commons.math.stat.descriptive.moment.Variance(secondMoment0);
        long long5 = variance4.getN();
        org.apache.commons.math.stat.descriptive.moment.Variance variance7 = new org.apache.commons.math.stat.descriptive.moment.Variance(true);
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
        variance7.incrementAll(doubleArray26);
        variance7.setBiasCorrected(false);
        variance7.clear();
        variance7.increment(26.916666666666668d);
        org.apache.commons.math.stat.descriptive.moment.SecondMoment secondMoment38 = new org.apache.commons.math.stat.descriptive.moment.SecondMoment();
        secondMoment38.increment(1.0d);
        secondMoment38.increment((double) (short) 0);
        long long43 = secondMoment38.getN();
        org.apache.commons.math.stat.descriptive.moment.Variance variance44 = new org.apache.commons.math.stat.descriptive.moment.Variance(false, secondMoment38);
        long long45 = variance44.getN();
        variance44.clear();
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
        double double69 = variance44.evaluate(doubleArray62, (double) (short) -1);
        double double71 = variance7.evaluate(doubleArray62, (double) 0);
        double double72 = variance4.evaluate(doubleArray62);
        variance4.clear();
        org.apache.commons.math.stat.descriptive.moment.SecondMoment secondMoment74 = new org.apache.commons.math.stat.descriptive.moment.SecondMoment();
        secondMoment74.increment((double) ' ');
        org.apache.commons.math.stat.descriptive.moment.Variance variance77 = new org.apache.commons.math.stat.descriptive.moment.Variance(secondMoment74);
        secondMoment74.increment(272.25d);
        long long80 = secondMoment74.getN();
        secondMoment74.increment(1.8756123185185187E7d);
        double double83 = secondMoment74.getResult();
        org.apache.commons.math.stat.descriptive.moment.Variance variance84 = new org.apache.commons.math.stat.descriptive.moment.Variance(secondMoment74);
        long long85 = variance84.getN();
        boolean boolean86 = variance4.equals((java.lang.Object) long85);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 0.0d + "'", double3 == 0.0d);
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 1L + "'", long5 == 1L);
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + 0.5d + "'", double14 == 0.5d);
        org.junit.Assert.assertNotNull(doubleArray21);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray21), "[-1.0, 0.0, 10.0]");
        org.junit.Assert.assertTrue("'" + double25 + "' != '" + 74.0d + "'", double25 == 74.0d);
        org.junit.Assert.assertNotNull(doubleArray26);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray26), "[]");
        org.junit.Assert.assertTrue(Double.isNaN(double30));
        org.junit.Assert.assertTrue("'" + long43 + "' != '" + 2L + "'", long43 == 2L);
        org.junit.Assert.assertTrue("'" + long45 + "' != '" + 2L + "'", long45 == 2L);
        org.junit.Assert.assertTrue("'" + long49 + "' != '" + 0L + "'", long49 == 0L);
        org.junit.Assert.assertTrue("'" + double55 + "' != '" + 0.5d + "'", double55 == 0.5d);
        org.junit.Assert.assertNotNull(doubleArray62);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray62), "[-1.0, 0.0, 10.0]");
        org.junit.Assert.assertTrue("'" + double66 + "' != '" + 74.0d + "'", double66 == 74.0d);
        org.junit.Assert.assertTrue("'" + double69 + "' != '" + 24.666666666666668d + "'", double69 == 24.666666666666668d);
        org.junit.Assert.assertTrue("'" + double71 + "' != '" + 24.666666666666668d + "'", double71 == 24.666666666666668d);
        org.junit.Assert.assertTrue("'" + double72 + "' != '" + 37.0d + "'", double72 == 37.0d);
        org.junit.Assert.assertTrue("'" + long80 + "' != '" + 2L + "'", long80 == 2L);
        org.junit.Assert.assertTrue("'" + double83 + "' != '" + 2.3452430030252953E14d + "'", double83 == 2.3452430030252953E14d);
        org.junit.Assert.assertTrue("'" + long85 + "' != '" + 3L + "'", long85 == 3L);
        org.junit.Assert.assertTrue("'" + boolean86 + "' != '" + false + "'", boolean86 == false);
    }

    @Test
    public void test16528() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest33.test16528");
        org.apache.commons.math.stat.descriptive.moment.SecondMoment secondMoment0 = new org.apache.commons.math.stat.descriptive.moment.SecondMoment();
        secondMoment0.increment(1.0d);
        double[] doubleArray6 = new double[] { (-1L), 0, 10L };
        secondMoment0.incrementAll(doubleArray6, 0, 0);
        double[] doubleArray12 = new double[] { 10, (byte) 100 };
        double double13 = secondMoment0.evaluate(doubleArray12);
        secondMoment0.clear();
        secondMoment0.clear();
        long long16 = secondMoment0.getN();
        org.junit.Assert.assertNotNull(doubleArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray6), "[-1.0, 0.0, 10.0]");
        org.junit.Assert.assertNotNull(doubleArray12);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray12), "[10.0, 100.0]");
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 4050.0d + "'", double13 == 4050.0d);
        org.junit.Assert.assertTrue("'" + long16 + "' != '" + 0L + "'", long16 == 0L);
    }

    @Test
    public void test16529() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest33.test16529");
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
        variance9.setBiasCorrected(false);
        java.lang.Class<?> wildcardClass53 = variance9.getClass();
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
        org.junit.Assert.assertNotNull(wildcardClass53);
    }

    @Test
    public void test16530() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest33.test16530");
        org.apache.commons.math.stat.descriptive.moment.SecondMoment secondMoment1 = new org.apache.commons.math.stat.descriptive.moment.SecondMoment();
        secondMoment1.increment(1.0d);
        double[] doubleArray7 = new double[] { (-1L), 0, 10L };
        secondMoment1.incrementAll(doubleArray7, 0, 0);
        double[] doubleArray13 = new double[] { 10, (byte) 100 };
        double double14 = secondMoment1.evaluate(doubleArray13);
        secondMoment1.clear();
        secondMoment1.increment(7077.0d);
        secondMoment1.increment(25.76d);
        secondMoment1.clear();
        double double21 = secondMoment1.getResult();
        org.apache.commons.math.stat.descriptive.moment.SecondMoment secondMoment22 = new org.apache.commons.math.stat.descriptive.moment.SecondMoment();
        secondMoment22.increment(1.0d);
        secondMoment22.increment((double) (short) 0);
        long long27 = secondMoment22.getN();
        double double28 = secondMoment22.getResult();
        double double29 = secondMoment22.getResult();
        long long30 = secondMoment22.getN();
        org.apache.commons.math.stat.descriptive.moment.Variance variance31 = new org.apache.commons.math.stat.descriptive.moment.Variance(secondMoment22);
        boolean boolean32 = secondMoment1.equals((java.lang.Object) secondMoment22);
        org.apache.commons.math.stat.descriptive.moment.Variance variance33 = new org.apache.commons.math.stat.descriptive.moment.Variance(false, secondMoment22);
        org.junit.Assert.assertNotNull(doubleArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray7), "[-1.0, 0.0, 10.0]");
        org.junit.Assert.assertNotNull(doubleArray13);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray13), "[10.0, 100.0]");
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + 4050.0d + "'", double14 == 4050.0d);
        org.junit.Assert.assertTrue(Double.isNaN(double21));
        org.junit.Assert.assertTrue("'" + long27 + "' != '" + 2L + "'", long27 == 2L);
        org.junit.Assert.assertTrue("'" + double28 + "' != '" + 0.5d + "'", double28 == 0.5d);
        org.junit.Assert.assertTrue("'" + double29 + "' != '" + 0.5d + "'", double29 == 0.5d);
        org.junit.Assert.assertTrue("'" + long30 + "' != '" + 2L + "'", long30 == 2L);
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + false + "'", boolean32 == false);
    }

    @Test
    public void test16531() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest33.test16531");
        org.apache.commons.math.stat.descriptive.moment.SecondMoment secondMoment2 = new org.apache.commons.math.stat.descriptive.moment.SecondMoment();
        secondMoment2.increment((double) ' ');
        org.apache.commons.math.stat.descriptive.moment.Variance variance5 = new org.apache.commons.math.stat.descriptive.moment.Variance(secondMoment2);
        secondMoment2.increment((double) (short) -1);
        secondMoment2.clear();
        secondMoment2.increment((double) 0L);
        org.apache.commons.math.stat.descriptive.moment.Variance variance11 = new org.apache.commons.math.stat.descriptive.moment.Variance(false, secondMoment2);
        double double12 = secondMoment2.getResult();
        secondMoment2.increment(0.0d);
        secondMoment2.increment(80.75d);
        org.apache.commons.math.stat.descriptive.moment.Variance variance17 = new org.apache.commons.math.stat.descriptive.moment.Variance(true, secondMoment2);
        java.lang.Class<?> wildcardClass18 = variance17.getClass();
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 0.0d + "'", double12 == 0.0d);
        org.junit.Assert.assertNotNull(wildcardClass18);
    }

    @Test
    public void test16532() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest33.test16532");
        org.apache.commons.math.stat.descriptive.moment.SecondMoment secondMoment0 = new org.apache.commons.math.stat.descriptive.moment.SecondMoment();
        secondMoment0.increment(1.0d);
        secondMoment0.increment((double) (short) 0);
        double double5 = secondMoment0.getResult();
        secondMoment0.clear();
        secondMoment0.increment(1.218679475E7d);
        org.apache.commons.math.stat.descriptive.moment.Variance variance9 = new org.apache.commons.math.stat.descriptive.moment.Variance(secondMoment0);
        org.apache.commons.math.stat.descriptive.moment.Variance variance10 = new org.apache.commons.math.stat.descriptive.moment.Variance(secondMoment0);
        double double11 = variance10.getResult();
        variance10.clear();
        org.apache.commons.math.stat.descriptive.moment.SecondMoment secondMoment13 = new org.apache.commons.math.stat.descriptive.moment.SecondMoment();
        secondMoment13.increment((double) ' ');
        org.apache.commons.math.stat.descriptive.moment.Variance variance16 = new org.apache.commons.math.stat.descriptive.moment.Variance(secondMoment13);
        secondMoment13.clear();
        secondMoment13.increment((double) (byte) 100);
        secondMoment13.clear();
        double double21 = secondMoment13.getResult();
        secondMoment13.clear();
        org.apache.commons.math.stat.descriptive.moment.SecondMoment secondMoment23 = new org.apache.commons.math.stat.descriptive.moment.SecondMoment();
        secondMoment23.increment(1.0d);
        secondMoment23.increment((double) (short) 0);
        double double28 = secondMoment23.getResult();
        org.apache.commons.math.stat.descriptive.moment.SecondMoment secondMoment29 = new org.apache.commons.math.stat.descriptive.moment.SecondMoment();
        secondMoment29.increment(1.0d);
        double[] doubleArray35 = new double[] { (-1L), 0, 10L };
        secondMoment29.incrementAll(doubleArray35, 0, 0);
        double double39 = secondMoment23.evaluate(doubleArray35);
        long long40 = secondMoment23.getN();
        org.apache.commons.math.stat.descriptive.moment.SecondMoment secondMoment42 = new org.apache.commons.math.stat.descriptive.moment.SecondMoment();
        secondMoment42.increment(1.0d);
        secondMoment42.increment((double) (short) 0);
        double double47 = secondMoment42.getResult();
        secondMoment42.clear();
        org.apache.commons.math.stat.descriptive.moment.Variance variance49 = new org.apache.commons.math.stat.descriptive.moment.Variance(false, secondMoment42);
        variance49.increment((double) (short) 0);
        variance49.clear();
        variance49.increment((double) 1L);
        org.apache.commons.math.stat.descriptive.moment.SecondMoment secondMoment55 = new org.apache.commons.math.stat.descriptive.moment.SecondMoment();
        secondMoment55.increment(1.0d);
        double[] doubleArray61 = new double[] { (-1L), 0, 10L };
        secondMoment55.incrementAll(doubleArray61, 0, 0);
        double double65 = variance49.evaluate(doubleArray61);
        secondMoment23.incrementAll(doubleArray61);
        double double67 = secondMoment13.evaluate(doubleArray61);
        double double68 = variance10.evaluate(doubleArray61);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.5d + "'", double5 == 0.5d);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 0.0d + "'", double11 == 0.0d);
        org.junit.Assert.assertTrue(Double.isNaN(double21));
        org.junit.Assert.assertTrue("'" + double28 + "' != '" + 0.5d + "'", double28 == 0.5d);
        org.junit.Assert.assertNotNull(doubleArray35);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray35), "[-1.0, 0.0, 10.0]");
        org.junit.Assert.assertTrue("'" + double39 + "' != '" + 74.0d + "'", double39 == 74.0d);
        org.junit.Assert.assertTrue("'" + long40 + "' != '" + 3L + "'", long40 == 3L);
        org.junit.Assert.assertTrue("'" + double47 + "' != '" + 0.5d + "'", double47 == 0.5d);
        org.junit.Assert.assertNotNull(doubleArray61);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray61), "[-1.0, 0.0, 10.0]");
        org.junit.Assert.assertTrue("'" + double65 + "' != '" + 24.666666666666668d + "'", double65 == 24.666666666666668d);
        org.junit.Assert.assertTrue("'" + double67 + "' != '" + 74.0d + "'", double67 == 74.0d);
        org.junit.Assert.assertTrue("'" + double68 + "' != '" + 37.0d + "'", double68 == 37.0d);
    }

    @Test
    public void test16533() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest33.test16533");
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
        boolean boolean46 = variance28.isBiasCorrected();
        variance28.increment(7836.75d);
        double double49 = variance28.getResult();
        org.apache.commons.math.stat.descriptive.moment.SecondMoment secondMoment51 = new org.apache.commons.math.stat.descriptive.moment.SecondMoment();
        secondMoment51.increment((double) ' ');
        org.apache.commons.math.stat.descriptive.moment.Variance variance54 = new org.apache.commons.math.stat.descriptive.moment.Variance(secondMoment51);
        secondMoment51.increment((double) (short) -1);
        long long57 = secondMoment51.getN();
        org.apache.commons.math.stat.descriptive.moment.Variance variance58 = new org.apache.commons.math.stat.descriptive.moment.Variance(false, secondMoment51);
        org.apache.commons.math.stat.descriptive.moment.SecondMoment secondMoment59 = new org.apache.commons.math.stat.descriptive.moment.SecondMoment();
        secondMoment59.increment(1.0d);
        double[] doubleArray65 = new double[] { (-1L), 0, 10L };
        secondMoment59.incrementAll(doubleArray65, 0, 0);
        double double70 = variance58.evaluate(doubleArray65, (double) 1L);
        org.apache.commons.math.stat.descriptive.moment.SecondMoment secondMoment71 = new org.apache.commons.math.stat.descriptive.moment.SecondMoment();
        secondMoment71.increment(1.0d);
        double[] doubleArray77 = new double[] { (-1L), 0, 10L };
        secondMoment71.incrementAll(doubleArray77, 0, 0);
        double[] doubleArray83 = new double[] { 10, (byte) 100 };
        double double84 = secondMoment71.evaluate(doubleArray83);
        double double86 = variance58.evaluate(doubleArray83, 0.0d);
        double double87 = variance28.evaluate(doubleArray83);
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
        org.junit.Assert.assertTrue("'" + boolean46 + "' != '" + true + "'", boolean46 == true);
        org.junit.Assert.assertTrue("'" + double49 + "' != '" + 1.0d + "'", double49 == 1.0d);
        org.junit.Assert.assertTrue("'" + long57 + "' != '" + 2L + "'", long57 == 2L);
        org.junit.Assert.assertNotNull(doubleArray65);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray65), "[-1.0, 0.0, 10.0]");
        org.junit.Assert.assertTrue("'" + double70 + "' != '" + 24.666666666666668d + "'", double70 == 24.666666666666668d);
        org.junit.Assert.assertNotNull(doubleArray77);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray77), "[-1.0, 0.0, 10.0]");
        org.junit.Assert.assertNotNull(doubleArray83);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray83), "[10.0, 100.0]");
        org.junit.Assert.assertTrue("'" + double84 + "' != '" + 4050.0d + "'", double84 == 4050.0d);
        org.junit.Assert.assertTrue("'" + double86 + "' != '" + 2025.0d + "'", double86 == 2025.0d);
        org.junit.Assert.assertTrue("'" + double87 + "' != '" + 4050.0d + "'", double87 == 4050.0d);
    }

    @Test
    public void test16534() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest33.test16534");
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
        variance10.setBiasCorrected(false);
        org.apache.commons.math.stat.descriptive.moment.SecondMoment secondMoment21 = new org.apache.commons.math.stat.descriptive.moment.SecondMoment();
        secondMoment21.increment((double) ' ');
        org.apache.commons.math.stat.descriptive.moment.Variance variance24 = new org.apache.commons.math.stat.descriptive.moment.Variance(secondMoment21);
        secondMoment21.clear();
        org.apache.commons.math.stat.descriptive.moment.Variance variance26 = new org.apache.commons.math.stat.descriptive.moment.Variance(true, secondMoment21);
        secondMoment21.clear();
        secondMoment21.clear();
        org.apache.commons.math.stat.descriptive.moment.SecondMoment secondMoment29 = new org.apache.commons.math.stat.descriptive.moment.SecondMoment();
        secondMoment29.increment((double) ' ');
        org.apache.commons.math.stat.descriptive.moment.Variance variance32 = new org.apache.commons.math.stat.descriptive.moment.Variance(secondMoment29);
        secondMoment29.increment((double) (short) -1);
        org.apache.commons.math.stat.descriptive.moment.SecondMoment secondMoment35 = new org.apache.commons.math.stat.descriptive.moment.SecondMoment();
        secondMoment35.increment(1.0d);
        double[] doubleArray41 = new double[] { (-1L), 0, 10L };
        secondMoment35.incrementAll(doubleArray41, 0, 0);
        org.apache.commons.math.stat.descriptive.moment.Variance variance45 = new org.apache.commons.math.stat.descriptive.moment.Variance(secondMoment35);
        long long46 = variance45.getN();
        org.apache.commons.math.stat.descriptive.moment.SecondMoment secondMoment47 = new org.apache.commons.math.stat.descriptive.moment.SecondMoment();
        secondMoment47.increment(1.0d);
        double[] doubleArray53 = new double[] { (-1L), 0, 10L };
        secondMoment47.incrementAll(doubleArray53, 0, 0);
        double double58 = variance45.evaluate(doubleArray53, (double) (short) -1);
        double double59 = secondMoment29.evaluate(doubleArray53);
        double double60 = secondMoment21.evaluate(doubleArray53);
        double double63 = variance10.evaluate(doubleArray53, 0, 0);
        variance10.clear();
        variance10.increment(20.22222222222222d);
        variance10.increment(4.5106306E7d);
        org.junit.Assert.assertNotNull(doubleArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray6), "[-1.0, 0.0, 10.0]");
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertNotNull(doubleArray41);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray41), "[-1.0, 0.0, 10.0]");
        org.junit.Assert.assertTrue("'" + long46 + "' != '" + 1L + "'", long46 == 1L);
        org.junit.Assert.assertNotNull(doubleArray53);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray53), "[-1.0, 0.0, 10.0]");
        org.junit.Assert.assertTrue("'" + double58 + "' != '" + 37.0d + "'", double58 == 37.0d);
        org.junit.Assert.assertTrue("'" + double59 + "' != '" + 74.0d + "'", double59 == 74.0d);
        org.junit.Assert.assertTrue("'" + double60 + "' != '" + 74.0d + "'", double60 == 74.0d);
        org.junit.Assert.assertTrue(Double.isNaN(double63));
    }

    @Test
    public void test16535() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest33.test16535");
        org.apache.commons.math.stat.descriptive.moment.SecondMoment secondMoment1 = new org.apache.commons.math.stat.descriptive.moment.SecondMoment();
        secondMoment1.increment(1.0d);
        secondMoment1.increment((double) (short) 0);
        double double6 = secondMoment1.getResult();
        double double7 = secondMoment1.getResult();
        org.apache.commons.math.stat.descriptive.moment.Variance variance8 = new org.apache.commons.math.stat.descriptive.moment.Variance(false, secondMoment1);
        secondMoment1.clear();
        org.apache.commons.math.stat.descriptive.moment.Variance variance10 = new org.apache.commons.math.stat.descriptive.moment.Variance(secondMoment1);
        secondMoment1.increment(1576.2666666666667d);
        secondMoment1.increment(3349744.0d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.5d + "'", double6 == 0.5d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 0.5d + "'", double7 == 0.5d);
    }

    @Test
    public void test16536() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest33.test16536");
        org.apache.commons.math.stat.descriptive.moment.SecondMoment secondMoment1 = new org.apache.commons.math.stat.descriptive.moment.SecondMoment();
        secondMoment1.increment((double) ' ');
        org.apache.commons.math.stat.descriptive.moment.Variance variance4 = new org.apache.commons.math.stat.descriptive.moment.Variance(secondMoment1);
        secondMoment1.clear();
        org.apache.commons.math.stat.descriptive.moment.Variance variance6 = new org.apache.commons.math.stat.descriptive.moment.Variance(true, secondMoment1);
        org.apache.commons.math.stat.descriptive.moment.SecondMoment secondMoment7 = new org.apache.commons.math.stat.descriptive.moment.SecondMoment();
        secondMoment7.increment(1.0d);
        secondMoment7.increment((double) (short) 0);
        long long12 = secondMoment7.getN();
        org.apache.commons.math.stat.descriptive.moment.SecondMoment secondMoment14 = new org.apache.commons.math.stat.descriptive.moment.SecondMoment();
        secondMoment14.increment(1.0d);
        secondMoment14.increment((double) (short) 0);
        double double19 = secondMoment14.getResult();
        org.apache.commons.math.stat.descriptive.moment.SecondMoment secondMoment20 = new org.apache.commons.math.stat.descriptive.moment.SecondMoment();
        secondMoment20.increment(1.0d);
        secondMoment20.increment((double) (short) 0);
        double double25 = secondMoment20.getResult();
        org.apache.commons.math.stat.descriptive.moment.SecondMoment secondMoment26 = new org.apache.commons.math.stat.descriptive.moment.SecondMoment();
        secondMoment26.increment(1.0d);
        double[] doubleArray32 = new double[] { (-1L), 0, 10L };
        secondMoment26.incrementAll(doubleArray32, 0, 0);
        double double36 = secondMoment20.evaluate(doubleArray32);
        double[] doubleArray37 = new double[] {};
        secondMoment20.incrementAll(doubleArray37);
        secondMoment14.incrementAll(doubleArray37);
        long long40 = secondMoment14.getN();
        org.apache.commons.math.stat.descriptive.moment.Variance variance41 = new org.apache.commons.math.stat.descriptive.moment.Variance(true, secondMoment14);
        org.apache.commons.math.stat.descriptive.moment.SecondMoment secondMoment42 = new org.apache.commons.math.stat.descriptive.moment.SecondMoment();
        secondMoment42.increment(1.0d);
        double[] doubleArray48 = new double[] { (-1L), 0, 10L };
        secondMoment42.incrementAll(doubleArray48, 0, 0);
        double double52 = variance41.evaluate(doubleArray48);
        secondMoment7.incrementAll(doubleArray48);
        double double54 = variance6.evaluate(doubleArray48);
        java.lang.Class<?> wildcardClass55 = doubleArray48.getClass();
        org.junit.Assert.assertTrue("'" + long12 + "' != '" + 2L + "'", long12 == 2L);
        org.junit.Assert.assertTrue("'" + double19 + "' != '" + 0.5d + "'", double19 == 0.5d);
        org.junit.Assert.assertTrue("'" + double25 + "' != '" + 0.5d + "'", double25 == 0.5d);
        org.junit.Assert.assertNotNull(doubleArray32);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray32), "[-1.0, 0.0, 10.0]");
        org.junit.Assert.assertTrue("'" + double36 + "' != '" + 74.0d + "'", double36 == 74.0d);
        org.junit.Assert.assertNotNull(doubleArray37);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray37), "[]");
        org.junit.Assert.assertTrue("'" + long40 + "' != '" + 2L + "'", long40 == 2L);
        org.junit.Assert.assertNotNull(doubleArray48);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray48), "[-1.0, 0.0, 10.0]");
        org.junit.Assert.assertTrue("'" + double52 + "' != '" + 37.0d + "'", double52 == 37.0d);
        org.junit.Assert.assertTrue("'" + double54 + "' != '" + 37.0d + "'", double54 == 37.0d);
        org.junit.Assert.assertNotNull(wildcardClass55);
    }

    @Test
    public void test16537() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest33.test16537");
        org.apache.commons.math.stat.descriptive.moment.Variance variance1 = new org.apache.commons.math.stat.descriptive.moment.Variance(false);
        boolean boolean2 = variance1.isBiasCorrected();
        org.apache.commons.math.stat.descriptive.moment.SecondMoment secondMoment3 = new org.apache.commons.math.stat.descriptive.moment.SecondMoment();
        secondMoment3.increment((double) ' ');
        org.apache.commons.math.stat.descriptive.moment.Variance variance6 = new org.apache.commons.math.stat.descriptive.moment.Variance(secondMoment3);
        secondMoment3.increment((double) '4');
        double double9 = secondMoment3.getResult();
        secondMoment3.increment((double) (short) 0);
        secondMoment3.clear();
        double double13 = secondMoment3.getResult();
        secondMoment3.clear();
        double double15 = secondMoment3.getResult();
        org.apache.commons.math.stat.descriptive.moment.SecondMoment secondMoment17 = new org.apache.commons.math.stat.descriptive.moment.SecondMoment();
        secondMoment17.increment((double) ' ');
        org.apache.commons.math.stat.descriptive.moment.Variance variance20 = new org.apache.commons.math.stat.descriptive.moment.Variance(secondMoment17);
        secondMoment17.increment((double) (short) -1);
        long long23 = secondMoment17.getN();
        org.apache.commons.math.stat.descriptive.moment.Variance variance24 = new org.apache.commons.math.stat.descriptive.moment.Variance(false, secondMoment17);
        org.apache.commons.math.stat.descriptive.moment.Variance variance25 = new org.apache.commons.math.stat.descriptive.moment.Variance(secondMoment17);
        long long26 = secondMoment17.getN();
        double double27 = secondMoment17.getResult();
        boolean boolean28 = secondMoment3.equals((java.lang.Object) secondMoment17);
        secondMoment17.clear();
        boolean boolean30 = variance1.equals((java.lang.Object) secondMoment17);
        variance1.increment(6140.666666666667d);
        double[] doubleArray33 = null;
        // The following exception was thrown during execution in test generation
        try {
            double double34 = variance1.evaluate(doubleArray33);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: input values array is null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 200.0d + "'", double9 == 200.0d);
        org.junit.Assert.assertTrue(Double.isNaN(double13));
        org.junit.Assert.assertTrue(Double.isNaN(double15));
        org.junit.Assert.assertTrue("'" + long23 + "' != '" + 2L + "'", long23 == 2L);
        org.junit.Assert.assertTrue("'" + long26 + "' != '" + 2L + "'", long26 == 2L);
        org.junit.Assert.assertTrue("'" + double27 + "' != '" + 544.5d + "'", double27 == 544.5d);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + false + "'", boolean28 == false);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + true + "'", boolean30 == true);
    }

    @Test
    public void test16538() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest33.test16538");
        org.apache.commons.math.stat.descriptive.moment.SecondMoment secondMoment1 = new org.apache.commons.math.stat.descriptive.moment.SecondMoment();
        secondMoment1.increment(1.0d);
        secondMoment1.increment((double) (short) 0);
        double double6 = secondMoment1.getResult();
        secondMoment1.clear();
        org.apache.commons.math.stat.descriptive.moment.Variance variance8 = new org.apache.commons.math.stat.descriptive.moment.Variance(false, secondMoment1);
        variance8.increment((double) (short) 0);
        variance8.clear();
        variance8.increment(0.0d);
        org.apache.commons.math.stat.descriptive.moment.SecondMoment secondMoment14 = new org.apache.commons.math.stat.descriptive.moment.SecondMoment();
        secondMoment14.increment(1.0d);
        secondMoment14.increment((double) (short) 0);
        long long19 = secondMoment14.getN();
        double double20 = secondMoment14.getResult();
        secondMoment14.increment(544.5d);
        secondMoment14.clear();
        boolean boolean24 = variance8.equals((java.lang.Object) secondMoment14);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.5d + "'", double6 == 0.5d);
        org.junit.Assert.assertTrue("'" + long19 + "' != '" + 2L + "'", long19 == 2L);
        org.junit.Assert.assertTrue("'" + double20 + "' != '" + 0.5d + "'", double20 == 0.5d);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + true + "'", boolean24 == true);
    }

    @Test
    public void test16539() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest33.test16539");
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
        secondMoment0.increment((double) 100.0f);
        secondMoment0.clear();
        double double21 = secondMoment0.getResult();
        org.apache.commons.math.stat.descriptive.moment.Variance variance22 = new org.apache.commons.math.stat.descriptive.moment.Variance(secondMoment0);
        org.apache.commons.math.stat.descriptive.moment.Variance variance23 = new org.apache.commons.math.stat.descriptive.moment.Variance(secondMoment0);
        variance23.increment(1.325996617999068E14d);
        long long26 = variance23.getN();
        org.apache.commons.math.stat.descriptive.moment.SecondMoment secondMoment27 = new org.apache.commons.math.stat.descriptive.moment.SecondMoment();
        secondMoment27.increment((double) ' ');
        org.apache.commons.math.stat.descriptive.moment.Variance variance30 = new org.apache.commons.math.stat.descriptive.moment.Variance(secondMoment27);
        secondMoment27.increment((double) (short) -1);
        secondMoment27.clear();
        secondMoment27.increment((double) 0L);
        org.apache.commons.math.stat.descriptive.moment.Variance variance36 = new org.apache.commons.math.stat.descriptive.moment.Variance(secondMoment27);
        long long37 = secondMoment27.getN();
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
        double double59 = secondMoment27.evaluate(doubleArray53);
        double double61 = variance23.evaluate(doubleArray53, 2.67977393860392896E17d);
        double double62 = variance23.getResult();
        org.junit.Assert.assertNotNull(doubleArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray6), "[-1.0, 0.0, 10.0]");
        org.junit.Assert.assertNotNull(doubleArray12);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray12), "[10.0, 100.0]");
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 4050.0d + "'", double13 == 4050.0d);
        org.junit.Assert.assertTrue("'" + long14 + "' != '" + 2L + "'", long14 == 2L);
        org.junit.Assert.assertTrue(Double.isNaN(double17));
        org.junit.Assert.assertTrue(Double.isNaN(double21));
        org.junit.Assert.assertTrue("'" + long26 + "' != '" + 0L + "'", long26 == 0L);
        org.junit.Assert.assertTrue("'" + long37 + "' != '" + 1L + "'", long37 == 1L);
        org.junit.Assert.assertTrue("'" + long40 + "' != '" + 0L + "'", long40 == 0L);
        org.junit.Assert.assertTrue("'" + double46 + "' != '" + 0.5d + "'", double46 == 0.5d);
        org.junit.Assert.assertNotNull(doubleArray53);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray53), "[-1.0, 0.0, 10.0]");
        org.junit.Assert.assertTrue("'" + double57 + "' != '" + 74.0d + "'", double57 == 74.0d);
        org.junit.Assert.assertTrue("'" + double59 + "' != '" + 74.0d + "'", double59 == 74.0d);
        org.junit.Assert.assertTrue("'" + double61 + "' != '" + 1.8446744073709552E19d + "'", double61 == 1.8446744073709552E19d);
        org.junit.Assert.assertTrue(Double.isNaN(double62));
    }

    @Test
    public void test16540() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest33.test16540");
        org.apache.commons.math.stat.descriptive.moment.SecondMoment secondMoment1 = new org.apache.commons.math.stat.descriptive.moment.SecondMoment();
        secondMoment1.increment(1.0d);
        double[] doubleArray7 = new double[] { (-1L), 0, 10L };
        secondMoment1.incrementAll(doubleArray7, 0, 0);
        double[] doubleArray13 = new double[] { 10, (byte) 100 };
        double double14 = secondMoment1.evaluate(doubleArray13);
        double double15 = secondMoment1.getResult();
        org.apache.commons.math.stat.descriptive.moment.Variance variance16 = new org.apache.commons.math.stat.descriptive.moment.Variance(false, secondMoment1);
        double double17 = secondMoment1.getResult();
        secondMoment1.increment((double) (byte) 10);
        double double20 = secondMoment1.getResult();
        double double21 = secondMoment1.getResult();
        long long22 = secondMoment1.getN();
        org.junit.Assert.assertNotNull(doubleArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray7), "[-1.0, 0.0, 10.0]");
        org.junit.Assert.assertNotNull(doubleArray13);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray13), "[10.0, 100.0]");
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + 4050.0d + "'", double14 == 4050.0d);
        org.junit.Assert.assertTrue("'" + double15 + "' != '" + 4050.0d + "'", double15 == 4050.0d);
        org.junit.Assert.assertTrue("'" + double17 + "' != '" + 4050.0d + "'", double17 == 4050.0d);
        org.junit.Assert.assertTrue("'" + double20 + "' != '" + 5400.0d + "'", double20 == 5400.0d);
        org.junit.Assert.assertTrue("'" + double21 + "' != '" + 5400.0d + "'", double21 == 5400.0d);
        org.junit.Assert.assertTrue("'" + long22 + "' != '" + 3L + "'", long22 == 3L);
    }

    @Test
    public void test16541() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest33.test16541");
        org.apache.commons.math.stat.descriptive.moment.SecondMoment secondMoment1 = new org.apache.commons.math.stat.descriptive.moment.SecondMoment();
        secondMoment1.increment(1.0d);
        double[] doubleArray7 = new double[] { (-1L), 0, 10L };
        secondMoment1.incrementAll(doubleArray7, 0, 0);
        double[] doubleArray13 = new double[] { 10, (byte) 100 };
        double double14 = secondMoment1.evaluate(doubleArray13);
        double double15 = secondMoment1.getResult();
        secondMoment1.increment((double) (short) -1);
        double[] doubleArray19 = new double[] { (short) 1 };
        secondMoment1.incrementAll(doubleArray19);
        long long21 = secondMoment1.getN();
        org.apache.commons.math.stat.descriptive.moment.Variance variance22 = new org.apache.commons.math.stat.descriptive.moment.Variance(false, secondMoment1);
        org.apache.commons.math.stat.descriptive.moment.SecondMoment secondMoment23 = new org.apache.commons.math.stat.descriptive.moment.SecondMoment();
        secondMoment23.increment(1.0d);
        secondMoment23.increment((double) (short) 0);
        long long28 = secondMoment23.getN();
        double double29 = secondMoment23.getResult();
        secondMoment23.increment((double) (byte) 10);
        secondMoment23.clear();
        org.apache.commons.math.stat.descriptive.moment.SecondMoment secondMoment33 = new org.apache.commons.math.stat.descriptive.moment.SecondMoment();
        secondMoment33.increment(1.0d);
        double[] doubleArray39 = new double[] { (-1L), 0, 10L };
        secondMoment33.incrementAll(doubleArray39, 0, 0);
        org.apache.commons.math.stat.descriptive.moment.Variance variance43 = new org.apache.commons.math.stat.descriptive.moment.Variance(secondMoment33);
        long long44 = variance43.getN();
        org.apache.commons.math.stat.descriptive.moment.SecondMoment secondMoment45 = new org.apache.commons.math.stat.descriptive.moment.SecondMoment();
        secondMoment45.increment(1.0d);
        double[] doubleArray51 = new double[] { (-1L), 0, 10L };
        secondMoment45.incrementAll(doubleArray51, 0, 0);
        double double56 = variance43.evaluate(doubleArray51, (double) (short) -1);
        double double57 = secondMoment23.evaluate(doubleArray51);
        double double58 = secondMoment1.evaluate(doubleArray51);
        secondMoment1.clear();
        secondMoment1.increment(4.321154463792899E13d);
        long long62 = secondMoment1.getN();
        double[] doubleArray63 = null;
        // The following exception was thrown during execution in test generation
        try {
            secondMoment1.incrementAll(doubleArray63);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: input values array is null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(doubleArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray7), "[-1.0, 0.0, 10.0]");
        org.junit.Assert.assertNotNull(doubleArray13);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray13), "[10.0, 100.0]");
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + 4050.0d + "'", double14 == 4050.0d);
        org.junit.Assert.assertTrue("'" + double15 + "' != '" + 4050.0d + "'", double15 == 4050.0d);
        org.junit.Assert.assertNotNull(doubleArray19);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray19), "[1.0]");
        org.junit.Assert.assertTrue("'" + long21 + "' != '" + 4L + "'", long21 == 4L);
        org.junit.Assert.assertTrue("'" + long28 + "' != '" + 2L + "'", long28 == 2L);
        org.junit.Assert.assertTrue("'" + double29 + "' != '" + 0.5d + "'", double29 == 0.5d);
        org.junit.Assert.assertNotNull(doubleArray39);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray39), "[-1.0, 0.0, 10.0]");
        org.junit.Assert.assertTrue("'" + long44 + "' != '" + 1L + "'", long44 == 1L);
        org.junit.Assert.assertNotNull(doubleArray51);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray51), "[-1.0, 0.0, 10.0]");
        org.junit.Assert.assertTrue("'" + double56 + "' != '" + 37.0d + "'", double56 == 37.0d);
        org.junit.Assert.assertTrue("'" + double57 + "' != '" + 74.0d + "'", double57 == 74.0d);
        org.junit.Assert.assertTrue("'" + double58 + "' != '" + 74.0d + "'", double58 == 74.0d);
        org.junit.Assert.assertTrue("'" + long62 + "' != '" + 1L + "'", long62 == 1L);
    }

    @Test
    public void test16542() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest33.test16542");
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
        double double22 = variance19.getResult();
        variance19.clear();
        long long24 = variance19.getN();
        org.junit.Assert.assertNotNull(doubleArray8);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray8), "[-1.0, 0.0, 10.0]");
        org.junit.Assert.assertNotNull(doubleArray14);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray14), "[10.0, 100.0]");
        org.junit.Assert.assertTrue("'" + double15 + "' != '" + 4050.0d + "'", double15 == 4050.0d);
        org.junit.Assert.assertTrue("'" + double16 + "' != '" + 4050.0d + "'", double16 == 4050.0d);
        org.junit.Assert.assertTrue("'" + long18 + "' != '" + 2L + "'", long18 == 2L);
        org.junit.Assert.assertTrue("'" + double22 + "' != '" + 4050.0d + "'", double22 == 4050.0d);
        org.junit.Assert.assertTrue("'" + long24 + "' != '" + 2L + "'", long24 == 2L);
    }

    @Test
    public void test16543() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest33.test16543");
        org.apache.commons.math.stat.descriptive.moment.SecondMoment secondMoment1 = new org.apache.commons.math.stat.descriptive.moment.SecondMoment();
        secondMoment1.increment(1.0d);
        double[] doubleArray7 = new double[] { (-1L), 0, 10L };
        secondMoment1.incrementAll(doubleArray7, 0, 0);
        double[] doubleArray13 = new double[] { 10, (byte) 100 };
        double double14 = secondMoment1.evaluate(doubleArray13);
        double double15 = secondMoment1.getResult();
        secondMoment1.increment((double) (short) -1);
        double[] doubleArray19 = new double[] { (short) 1 };
        secondMoment1.incrementAll(doubleArray19);
        long long21 = secondMoment1.getN();
        org.apache.commons.math.stat.descriptive.moment.Variance variance22 = new org.apache.commons.math.stat.descriptive.moment.Variance(false, secondMoment1);
        org.apache.commons.math.stat.descriptive.moment.SecondMoment secondMoment23 = new org.apache.commons.math.stat.descriptive.moment.SecondMoment();
        secondMoment23.increment(1.0d);
        secondMoment23.increment((double) (short) 0);
        long long28 = secondMoment23.getN();
        double double29 = secondMoment23.getResult();
        secondMoment23.increment((double) (byte) 10);
        secondMoment23.clear();
        org.apache.commons.math.stat.descriptive.moment.SecondMoment secondMoment33 = new org.apache.commons.math.stat.descriptive.moment.SecondMoment();
        secondMoment33.increment(1.0d);
        double[] doubleArray39 = new double[] { (-1L), 0, 10L };
        secondMoment33.incrementAll(doubleArray39, 0, 0);
        org.apache.commons.math.stat.descriptive.moment.Variance variance43 = new org.apache.commons.math.stat.descriptive.moment.Variance(secondMoment33);
        long long44 = variance43.getN();
        org.apache.commons.math.stat.descriptive.moment.SecondMoment secondMoment45 = new org.apache.commons.math.stat.descriptive.moment.SecondMoment();
        secondMoment45.increment(1.0d);
        double[] doubleArray51 = new double[] { (-1L), 0, 10L };
        secondMoment45.incrementAll(doubleArray51, 0, 0);
        double double56 = variance43.evaluate(doubleArray51, (double) (short) -1);
        double double57 = secondMoment23.evaluate(doubleArray51);
        double double58 = secondMoment1.evaluate(doubleArray51);
        secondMoment1.clear();
        secondMoment1.increment(4.321154463792899E13d);
        double double62 = secondMoment1.getResult();
        org.junit.Assert.assertNotNull(doubleArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray7), "[-1.0, 0.0, 10.0]");
        org.junit.Assert.assertNotNull(doubleArray13);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray13), "[10.0, 100.0]");
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + 4050.0d + "'", double14 == 4050.0d);
        org.junit.Assert.assertTrue("'" + double15 + "' != '" + 4050.0d + "'", double15 == 4050.0d);
        org.junit.Assert.assertNotNull(doubleArray19);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray19), "[1.0]");
        org.junit.Assert.assertTrue("'" + long21 + "' != '" + 4L + "'", long21 == 4L);
        org.junit.Assert.assertTrue("'" + long28 + "' != '" + 2L + "'", long28 == 2L);
        org.junit.Assert.assertTrue("'" + double29 + "' != '" + 0.5d + "'", double29 == 0.5d);
        org.junit.Assert.assertNotNull(doubleArray39);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray39), "[-1.0, 0.0, 10.0]");
        org.junit.Assert.assertTrue("'" + long44 + "' != '" + 1L + "'", long44 == 1L);
        org.junit.Assert.assertNotNull(doubleArray51);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray51), "[-1.0, 0.0, 10.0]");
        org.junit.Assert.assertTrue("'" + double56 + "' != '" + 37.0d + "'", double56 == 37.0d);
        org.junit.Assert.assertTrue("'" + double57 + "' != '" + 74.0d + "'", double57 == 74.0d);
        org.junit.Assert.assertTrue("'" + double58 + "' != '" + 74.0d + "'", double58 == 74.0d);
        org.junit.Assert.assertTrue("'" + double62 + "' != '" + 0.0d + "'", double62 == 0.0d);
    }

    @Test
    public void test16544() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest33.test16544");
        org.apache.commons.math.stat.descriptive.moment.SecondMoment secondMoment1 = new org.apache.commons.math.stat.descriptive.moment.SecondMoment();
        secondMoment1.increment(1.0d);
        secondMoment1.increment((double) (short) 0);
        double double6 = secondMoment1.getResult();
        org.apache.commons.math.stat.descriptive.moment.SecondMoment secondMoment8 = new org.apache.commons.math.stat.descriptive.moment.SecondMoment();
        secondMoment8.increment(1.0d);
        double[] doubleArray14 = new double[] { (-1L), 0, 10L };
        secondMoment8.incrementAll(doubleArray14, 0, 0);
        double[] doubleArray20 = new double[] { 10, (byte) 100 };
        double double21 = secondMoment8.evaluate(doubleArray20);
        double double22 = secondMoment8.getResult();
        long long23 = secondMoment8.getN();
        long long24 = secondMoment8.getN();
        org.apache.commons.math.stat.descriptive.moment.Variance variance25 = new org.apache.commons.math.stat.descriptive.moment.Variance(true, secondMoment8);
        boolean boolean26 = secondMoment1.equals((java.lang.Object) secondMoment8);
        org.apache.commons.math.stat.descriptive.moment.Variance variance27 = new org.apache.commons.math.stat.descriptive.moment.Variance(false, secondMoment1);
        org.apache.commons.math.stat.descriptive.moment.Variance variance28 = new org.apache.commons.math.stat.descriptive.moment.Variance(secondMoment1);
        variance28.clear();
        variance28.clear();
        double double31 = variance28.getResult();
        boolean boolean32 = variance28.isBiasCorrected();
        double double33 = variance28.getResult();
        java.lang.Object obj34 = null;
        boolean boolean35 = variance28.equals(obj34);
        org.apache.commons.math.stat.descriptive.moment.SecondMoment secondMoment36 = new org.apache.commons.math.stat.descriptive.moment.SecondMoment();
        secondMoment36.increment(1.0d);
        double[] doubleArray42 = new double[] { (-1L), 0, 10L };
        secondMoment36.incrementAll(doubleArray42, 0, 0);
        long long46 = secondMoment36.getN();
        org.apache.commons.math.stat.descriptive.moment.Variance variance47 = new org.apache.commons.math.stat.descriptive.moment.Variance(secondMoment36);
        secondMoment36.increment(10.0d);
        secondMoment36.clear();
        secondMoment36.increment(9696140.055555556d);
        org.apache.commons.math.stat.descriptive.moment.SecondMoment secondMoment54 = new org.apache.commons.math.stat.descriptive.moment.SecondMoment();
        secondMoment54.increment(1.0d);
        secondMoment54.increment((double) (short) 0);
        double double59 = secondMoment54.getResult();
        secondMoment54.clear();
        org.apache.commons.math.stat.descriptive.moment.Variance variance61 = new org.apache.commons.math.stat.descriptive.moment.Variance(false, secondMoment54);
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
        double double90 = variance61.evaluate(doubleArray82, 0, (int) (short) 0);
        double double91 = secondMoment36.evaluate(doubleArray82);
        double double92 = variance28.evaluate(doubleArray82);
        variance28.increment(40.5d);
        long long95 = variance28.getN();
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.5d + "'", double6 == 0.5d);
        org.junit.Assert.assertNotNull(doubleArray14);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray14), "[-1.0, 0.0, 10.0]");
        org.junit.Assert.assertNotNull(doubleArray20);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray20), "[10.0, 100.0]");
        org.junit.Assert.assertTrue("'" + double21 + "' != '" + 4050.0d + "'", double21 == 4050.0d);
        org.junit.Assert.assertTrue("'" + double22 + "' != '" + 4050.0d + "'", double22 == 4050.0d);
        org.junit.Assert.assertTrue("'" + long23 + "' != '" + 2L + "'", long23 == 2L);
        org.junit.Assert.assertTrue("'" + long24 + "' != '" + 2L + "'", long24 == 2L);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
        org.junit.Assert.assertTrue("'" + double31 + "' != '" + 0.5d + "'", double31 == 0.5d);
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + true + "'", boolean32 == true);
        org.junit.Assert.assertTrue("'" + double33 + "' != '" + 0.5d + "'", double33 == 0.5d);
        org.junit.Assert.assertTrue("'" + boolean35 + "' != '" + false + "'", boolean35 == false);
        org.junit.Assert.assertNotNull(doubleArray42);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray42), "[-1.0, 0.0, 10.0]");
        org.junit.Assert.assertTrue("'" + long46 + "' != '" + 1L + "'", long46 == 1L);
        org.junit.Assert.assertTrue("'" + double59 + "' != '" + 0.5d + "'", double59 == 0.5d);
        org.junit.Assert.assertTrue("'" + double70 + "' != '" + 0.5d + "'", double70 == 0.5d);
        org.junit.Assert.assertNotNull(doubleArray77);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray77), "[-1.0, 0.0, 10.0]");
        org.junit.Assert.assertTrue("'" + double81 + "' != '" + 74.0d + "'", double81 == 74.0d);
        org.junit.Assert.assertNotNull(doubleArray82);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray82), "[]");
        org.junit.Assert.assertTrue(Double.isNaN(double86));
        org.junit.Assert.assertTrue(Double.isNaN(double90));
        org.junit.Assert.assertTrue("'" + double91 + "' != '" + 0.0d + "'", double91 == 0.0d);
        org.junit.Assert.assertTrue(Double.isNaN(double92));
        org.junit.Assert.assertTrue("'" + long95 + "' != '" + 2L + "'", long95 == 2L);
    }

    @Test
    public void test16545() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest33.test16545");
        org.apache.commons.math.stat.descriptive.moment.SecondMoment secondMoment0 = new org.apache.commons.math.stat.descriptive.moment.SecondMoment();
        secondMoment0.increment(1.0d);
        secondMoment0.increment((double) (short) 0);
        double double5 = secondMoment0.getResult();
        long long6 = secondMoment0.getN();
        org.apache.commons.math.stat.descriptive.moment.SecondMoment secondMoment7 = new org.apache.commons.math.stat.descriptive.moment.SecondMoment();
        secondMoment7.increment((double) ' ');
        org.apache.commons.math.stat.descriptive.moment.Variance variance10 = new org.apache.commons.math.stat.descriptive.moment.Variance(secondMoment7);
        secondMoment7.increment((double) (short) -1);
        secondMoment7.clear();
        secondMoment7.increment((double) 0L);
        org.apache.commons.math.stat.descriptive.moment.Variance variance16 = new org.apache.commons.math.stat.descriptive.moment.Variance(secondMoment7);
        org.apache.commons.math.stat.descriptive.moment.SecondMoment secondMoment17 = new org.apache.commons.math.stat.descriptive.moment.SecondMoment();
        secondMoment17.increment(1.0d);
        double[] doubleArray23 = new double[] { (-1L), 0, 10L };
        secondMoment17.incrementAll(doubleArray23, 0, 0);
        variance16.incrementAll(doubleArray23);
        long long28 = variance16.getN();
        org.apache.commons.math.stat.descriptive.moment.SecondMoment secondMoment29 = new org.apache.commons.math.stat.descriptive.moment.SecondMoment();
        secondMoment29.increment(1.0d);
        org.apache.commons.math.stat.descriptive.moment.SecondMoment secondMoment32 = new org.apache.commons.math.stat.descriptive.moment.SecondMoment();
        secondMoment32.increment(1.0d);
        double[] doubleArray38 = new double[] { (-1L), 0, 10L };
        secondMoment32.incrementAll(doubleArray38, 0, 0);
        double[] doubleArray44 = new double[] { 10, (byte) 100 };
        double double45 = secondMoment32.evaluate(doubleArray44);
        double double46 = secondMoment29.evaluate(doubleArray44);
        variance16.incrementAll(doubleArray44);
        double double48 = secondMoment0.evaluate(doubleArray44);
        secondMoment0.clear();
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.5d + "'", double5 == 0.5d);
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 2L + "'", long6 == 2L);
        org.junit.Assert.assertNotNull(doubleArray23);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray23), "[-1.0, 0.0, 10.0]");
        org.junit.Assert.assertTrue("'" + long28 + "' != '" + 1L + "'", long28 == 1L);
        org.junit.Assert.assertNotNull(doubleArray38);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray38), "[-1.0, 0.0, 10.0]");
        org.junit.Assert.assertNotNull(doubleArray44);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray44), "[10.0, 100.0]");
        org.junit.Assert.assertTrue("'" + double45 + "' != '" + 4050.0d + "'", double45 == 4050.0d);
        org.junit.Assert.assertTrue("'" + double46 + "' != '" + 4050.0d + "'", double46 == 4050.0d);
        org.junit.Assert.assertTrue("'" + double48 + "' != '" + 4050.0d + "'", double48 == 4050.0d);
    }

    @Test
    public void test16546() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest33.test16546");
        org.apache.commons.math.stat.descriptive.moment.SecondMoment secondMoment1 = new org.apache.commons.math.stat.descriptive.moment.SecondMoment();
        secondMoment1.increment((double) ' ');
        org.apache.commons.math.stat.descriptive.moment.Variance variance4 = new org.apache.commons.math.stat.descriptive.moment.Variance(secondMoment1);
        secondMoment1.increment((double) (short) -1);
        long long7 = secondMoment1.getN();
        org.apache.commons.math.stat.descriptive.moment.Variance variance8 = new org.apache.commons.math.stat.descriptive.moment.Variance(false, secondMoment1);
        org.apache.commons.math.stat.descriptive.moment.Variance variance9 = new org.apache.commons.math.stat.descriptive.moment.Variance(secondMoment1);
        double double10 = secondMoment1.getResult();
        secondMoment1.clear();
        org.apache.commons.math.stat.descriptive.moment.Variance variance12 = new org.apache.commons.math.stat.descriptive.moment.Variance();
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
        double double34 = variance12.evaluate(doubleArray30, (int) (byte) 0, 0);
        long long35 = variance12.getN();
        org.apache.commons.math.stat.descriptive.moment.SecondMoment secondMoment36 = new org.apache.commons.math.stat.descriptive.moment.SecondMoment();
        secondMoment36.increment(1.0d);
        secondMoment36.increment((double) (short) 0);
        double double41 = secondMoment36.getResult();
        org.apache.commons.math.stat.descriptive.moment.SecondMoment secondMoment42 = new org.apache.commons.math.stat.descriptive.moment.SecondMoment();
        secondMoment42.increment(1.0d);
        double[] doubleArray48 = new double[] { (-1L), 0, 10L };
        secondMoment42.incrementAll(doubleArray48, 0, 0);
        double double52 = secondMoment36.evaluate(doubleArray48);
        variance12.incrementAll(doubleArray48);
        double double54 = secondMoment1.evaluate(doubleArray48);
        secondMoment1.clear();
        secondMoment1.increment(4900.5d);
        org.apache.commons.math.stat.descriptive.moment.Variance variance58 = new org.apache.commons.math.stat.descriptive.moment.Variance(secondMoment1);
        variance58.clear();
        variance58.clear();
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + 2L + "'", long7 == 2L);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 544.5d + "'", double10 == 544.5d);
        org.junit.Assert.assertTrue("'" + double18 + "' != '" + 0.5d + "'", double18 == 0.5d);
        org.junit.Assert.assertNotNull(doubleArray25);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray25), "[-1.0, 0.0, 10.0]");
        org.junit.Assert.assertTrue("'" + double29 + "' != '" + 74.0d + "'", double29 == 74.0d);
        org.junit.Assert.assertNotNull(doubleArray30);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray30), "[]");
        org.junit.Assert.assertTrue(Double.isNaN(double34));
        org.junit.Assert.assertTrue("'" + long35 + "' != '" + 0L + "'", long35 == 0L);
        org.junit.Assert.assertTrue("'" + double41 + "' != '" + 0.5d + "'", double41 == 0.5d);
        org.junit.Assert.assertNotNull(doubleArray48);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray48), "[-1.0, 0.0, 10.0]");
        org.junit.Assert.assertTrue("'" + double52 + "' != '" + 74.0d + "'", double52 == 74.0d);
        org.junit.Assert.assertTrue("'" + double54 + "' != '" + 74.0d + "'", double54 == 74.0d);
    }

    @Test
    public void test16547() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest33.test16547");
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
        long long65 = variance0.getN();
        variance0.clear();
        variance0.increment(36.916666666666664d);
        variance0.increment((double) (-1L));
        variance0.increment(351992.75d);
        double double73 = variance0.getResult();
        boolean boolean74 = variance0.isBiasCorrected();
        variance0.setBiasCorrected(false);
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
        org.junit.Assert.assertTrue("'" + long65 + "' != '" + 4L + "'", long65 == 4L);
        org.junit.Assert.assertTrue("'" + double73 + "' != '" + 4.129541834901621E10d + "'", double73 == 4.129541834901621E10d);
        org.junit.Assert.assertTrue("'" + boolean74 + "' != '" + true + "'", boolean74 == true);
    }

    @Test
    public void test16548() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest33.test16548");
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
        org.apache.commons.math.stat.descriptive.moment.SecondMoment secondMoment44 = new org.apache.commons.math.stat.descriptive.moment.SecondMoment();
        secondMoment44.increment((double) ' ');
        double double47 = secondMoment44.getResult();
        boolean boolean48 = variance28.equals((java.lang.Object) double47);
        long long49 = variance28.getN();
        double double50 = variance28.getResult();
        double[] doubleArray51 = null;
        // The following exception was thrown during execution in test generation
        try {
            double double53 = variance28.evaluate(doubleArray51, 87.71428571428572d);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
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
        org.junit.Assert.assertTrue("'" + double47 + "' != '" + 0.0d + "'", double47 == 0.0d);
        org.junit.Assert.assertTrue("'" + boolean48 + "' != '" + false + "'", boolean48 == false);
        org.junit.Assert.assertTrue("'" + long49 + "' != '" + 3L + "'", long49 == 3L);
        org.junit.Assert.assertTrue("'" + double50 + "' != '" + 1.0d + "'", double50 == 1.0d);
    }

    @Test
    public void test16549() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest33.test16549");
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
        secondMoment1.clear();
        long long56 = secondMoment1.getN();
        secondMoment1.clear();
        secondMoment1.clear();
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
        org.junit.Assert.assertTrue("'" + long56 + "' != '" + 0L + "'", long56 == 0L);
    }

    @Test
    public void test16550() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest33.test16550");
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
        secondMoment2.clear();
        secondMoment2.clear();
        secondMoment2.increment((double) 100.0f);
        org.apache.commons.math.stat.descriptive.moment.Variance variance24 = new org.apache.commons.math.stat.descriptive.moment.Variance(secondMoment2);
        long long25 = variance24.getN();
        org.apache.commons.math.stat.descriptive.moment.SecondMoment secondMoment26 = new org.apache.commons.math.stat.descriptive.moment.SecondMoment();
        secondMoment26.increment((double) ' ');
        org.apache.commons.math.stat.descriptive.moment.Variance variance29 = new org.apache.commons.math.stat.descriptive.moment.Variance(secondMoment26);
        secondMoment26.increment((double) '4');
        secondMoment26.increment((double) 100);
        secondMoment26.clear();
        org.apache.commons.math.stat.descriptive.moment.SecondMoment secondMoment36 = new org.apache.commons.math.stat.descriptive.moment.SecondMoment();
        secondMoment36.increment(1.0d);
        double[] doubleArray42 = new double[] { (-1L), 0, 10L };
        secondMoment36.incrementAll(doubleArray42, 0, 0);
        double[] doubleArray48 = new double[] { 10, (byte) 100 };
        double double49 = secondMoment36.evaluate(doubleArray48);
        double double50 = secondMoment36.getResult();
        org.apache.commons.math.stat.descriptive.moment.Variance variance51 = new org.apache.commons.math.stat.descriptive.moment.Variance(false, secondMoment36);
        secondMoment36.increment(24.666666666666668d);
        org.apache.commons.math.stat.descriptive.moment.SecondMoment secondMoment54 = new org.apache.commons.math.stat.descriptive.moment.SecondMoment();
        secondMoment54.increment(1.0d);
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
        double double76 = secondMoment54.evaluate(doubleArray74);
        secondMoment36.incrementAll(doubleArray74);
        double double78 = secondMoment26.evaluate(doubleArray74);
        variance24.incrementAll(doubleArray74);
        variance24.setBiasCorrected(false);
        org.junit.Assert.assertNotNull(doubleArray8);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray8), "[-1.0, 0.0, 10.0]");
        org.junit.Assert.assertNotNull(doubleArray14);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray14), "[10.0, 100.0]");
        org.junit.Assert.assertTrue("'" + double15 + "' != '" + 4050.0d + "'", double15 == 4050.0d);
        org.junit.Assert.assertTrue("'" + double16 + "' != '" + 4050.0d + "'", double16 == 4050.0d);
        org.junit.Assert.assertTrue("'" + long18 + "' != '" + 2L + "'", long18 == 2L);
        org.junit.Assert.assertTrue("'" + long25 + "' != '" + 1L + "'", long25 == 1L);
        org.junit.Assert.assertNotNull(doubleArray42);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray42), "[-1.0, 0.0, 10.0]");
        org.junit.Assert.assertNotNull(doubleArray48);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray48), "[10.0, 100.0]");
        org.junit.Assert.assertTrue("'" + double49 + "' != '" + 4050.0d + "'", double49 == 4050.0d);
        org.junit.Assert.assertTrue("'" + double50 + "' != '" + 4050.0d + "'", double50 == 4050.0d);
        org.junit.Assert.assertTrue("'" + double62 + "' != '" + 0.5d + "'", double62 == 0.5d);
        org.junit.Assert.assertNotNull(doubleArray69);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray69), "[-1.0, 0.0, 10.0]");
        org.junit.Assert.assertTrue("'" + double73 + "' != '" + 74.0d + "'", double73 == 74.0d);
        org.junit.Assert.assertNotNull(doubleArray74);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray74), "[]");
        org.junit.Assert.assertTrue("'" + double76 + "' != '" + 0.0d + "'", double76 == 0.0d);
        org.junit.Assert.assertTrue(Double.isNaN(double78));
    }

    @Test
    public void test16551() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest33.test16551");
        org.apache.commons.math.stat.descriptive.moment.SecondMoment secondMoment1 = new org.apache.commons.math.stat.descriptive.moment.SecondMoment();
        secondMoment1.increment(1.0d);
        double[] doubleArray7 = new double[] { (-1L), 0, 10L };
        secondMoment1.incrementAll(doubleArray7, 0, 0);
        double[] doubleArray13 = new double[] { 10, (byte) 100 };
        double double14 = secondMoment1.evaluate(doubleArray13);
        double double15 = secondMoment1.getResult();
        org.apache.commons.math.stat.descriptive.moment.Variance variance16 = new org.apache.commons.math.stat.descriptive.moment.Variance(false, secondMoment1);
        variance16.increment(0.0d);
        boolean boolean19 = variance16.isBiasCorrected();
        boolean boolean20 = variance16.isBiasCorrected();
        variance16.increment((double) 'a');
        long long23 = variance16.getN();
        org.junit.Assert.assertNotNull(doubleArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray7), "[-1.0, 0.0, 10.0]");
        org.junit.Assert.assertNotNull(doubleArray13);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray13), "[10.0, 100.0]");
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + 4050.0d + "'", double14 == 4050.0d);
        org.junit.Assert.assertTrue("'" + double15 + "' != '" + 4050.0d + "'", double15 == 4050.0d);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertTrue("'" + long23 + "' != '" + 2L + "'", long23 == 2L);
    }

    @Test
    public void test16552() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest33.test16552");
        org.apache.commons.math.stat.descriptive.moment.SecondMoment secondMoment0 = new org.apache.commons.math.stat.descriptive.moment.SecondMoment();
        secondMoment0.increment((double) ' ');
        org.apache.commons.math.stat.descriptive.moment.Variance variance3 = new org.apache.commons.math.stat.descriptive.moment.Variance(secondMoment0);
        secondMoment0.increment((double) (short) -1);
        secondMoment0.clear();
        org.apache.commons.math.stat.descriptive.moment.Variance variance7 = new org.apache.commons.math.stat.descriptive.moment.Variance(secondMoment0);
        double double8 = secondMoment0.getResult();
        double double9 = secondMoment0.getResult();
        secondMoment0.increment(1.8266917344496367E12d);
        secondMoment0.clear();
        org.junit.Assert.assertTrue(Double.isNaN(double8));
        org.junit.Assert.assertTrue(Double.isNaN(double9));
    }

    @Test
    public void test16553() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest33.test16553");
        org.apache.commons.math.stat.descriptive.moment.SecondMoment secondMoment0 = new org.apache.commons.math.stat.descriptive.moment.SecondMoment();
        secondMoment0.increment((double) ' ');
        org.apache.commons.math.stat.descriptive.moment.Variance variance3 = new org.apache.commons.math.stat.descriptive.moment.Variance(secondMoment0);
        secondMoment0.increment((double) '4');
        org.apache.commons.math.stat.descriptive.moment.SecondMoment secondMoment7 = new org.apache.commons.math.stat.descriptive.moment.SecondMoment();
        secondMoment7.increment(1.0d);
        double[] doubleArray13 = new double[] { (-1L), 0, 10L };
        secondMoment7.incrementAll(doubleArray13, 0, 0);
        double[] doubleArray19 = new double[] { 10, (byte) 100 };
        double double20 = secondMoment7.evaluate(doubleArray19);
        double double21 = secondMoment7.getResult();
        org.apache.commons.math.stat.descriptive.moment.Variance variance22 = new org.apache.commons.math.stat.descriptive.moment.Variance(false, secondMoment7);
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
        variance22.incrementAll(doubleArray40);
        double double43 = secondMoment0.evaluate(doubleArray40);
        secondMoment0.increment((double) 5L);
        org.apache.commons.math.stat.descriptive.moment.Variance variance46 = new org.apache.commons.math.stat.descriptive.moment.Variance(secondMoment0);
        org.junit.Assert.assertNotNull(doubleArray13);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray13), "[-1.0, 0.0, 10.0]");
        org.junit.Assert.assertNotNull(doubleArray19);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray19), "[10.0, 100.0]");
        org.junit.Assert.assertTrue("'" + double20 + "' != '" + 4050.0d + "'", double20 == 4050.0d);
        org.junit.Assert.assertTrue("'" + double21 + "' != '" + 4050.0d + "'", double21 == 4050.0d);
        org.junit.Assert.assertTrue("'" + double28 + "' != '" + 0.5d + "'", double28 == 0.5d);
        org.junit.Assert.assertNotNull(doubleArray35);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray35), "[-1.0, 0.0, 10.0]");
        org.junit.Assert.assertTrue("'" + double39 + "' != '" + 74.0d + "'", double39 == 74.0d);
        org.junit.Assert.assertNotNull(doubleArray40);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray40), "[]");
        org.junit.Assert.assertTrue("'" + double43 + "' != '" + 200.0d + "'", double43 == 200.0d);
    }

    @Test
    public void test16554() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest33.test16554");
        org.apache.commons.math.stat.descriptive.moment.SecondMoment secondMoment0 = new org.apache.commons.math.stat.descriptive.moment.SecondMoment();
        secondMoment0.increment((double) ' ');
        org.apache.commons.math.stat.descriptive.moment.Variance variance3 = new org.apache.commons.math.stat.descriptive.moment.Variance(secondMoment0);
        double[] doubleArray9 = new double[] { 0L, (byte) 1, 6140.666666666667d, 544.5d, (byte) 100 };
        double double10 = secondMoment0.evaluate(doubleArray9);
        org.apache.commons.math.stat.descriptive.moment.SecondMoment secondMoment11 = new org.apache.commons.math.stat.descriptive.moment.SecondMoment();
        secondMoment11.increment((double) ' ');
        org.apache.commons.math.stat.descriptive.moment.Variance variance14 = new org.apache.commons.math.stat.descriptive.moment.Variance(secondMoment11);
        secondMoment11.increment((double) (short) -1);
        secondMoment11.clear();
        secondMoment11.increment((double) 0L);
        org.apache.commons.math.stat.descriptive.moment.Variance variance20 = new org.apache.commons.math.stat.descriptive.moment.Variance(secondMoment11);
        boolean boolean21 = secondMoment0.equals((java.lang.Object) secondMoment11);
        org.apache.commons.math.stat.descriptive.moment.Variance variance22 = new org.apache.commons.math.stat.descriptive.moment.Variance(secondMoment0);
        secondMoment0.increment((double) (short) 1);
        secondMoment0.clear();
        org.apache.commons.math.stat.descriptive.moment.Variance variance26 = new org.apache.commons.math.stat.descriptive.moment.Variance(secondMoment0);
        long long27 = secondMoment0.getN();
        secondMoment0.increment(8441189.1875d);
        secondMoment0.increment(4071.4074074074074d);
        org.junit.Assert.assertNotNull(doubleArray9);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray9), "[0.0, 1.0, 6140.666666666667, 544.5, 100.0]");
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 2.880385675555556E7d + "'", double10 == 2.880385675555556E7d);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertTrue("'" + long27 + "' != '" + 0L + "'", long27 == 0L);
    }

    @Test
    public void test16555() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest33.test16555");
        org.apache.commons.math.stat.descriptive.moment.Variance variance1 = new org.apache.commons.math.stat.descriptive.moment.Variance(true);
        long long2 = variance1.getN();
        double double3 = variance1.getResult();
        double double4 = variance1.getResult();
        double double5 = variance1.getResult();
        long long6 = variance1.getN();
        org.apache.commons.math.stat.descriptive.moment.SecondMoment secondMoment7 = new org.apache.commons.math.stat.descriptive.moment.SecondMoment();
        secondMoment7.increment(1.0d);
        secondMoment7.increment((double) (short) 0);
        long long12 = secondMoment7.getN();
        double double13 = secondMoment7.getResult();
        secondMoment7.increment((double) (byte) 10);
        secondMoment7.clear();
        long long17 = secondMoment7.getN();
        secondMoment7.increment(1.8756123185185187E7d);
        long long20 = secondMoment7.getN();
        org.apache.commons.math.stat.descriptive.moment.SecondMoment secondMoment21 = new org.apache.commons.math.stat.descriptive.moment.SecondMoment();
        secondMoment21.increment((double) ' ');
        org.apache.commons.math.stat.descriptive.moment.Variance variance24 = new org.apache.commons.math.stat.descriptive.moment.Variance(secondMoment21);
        secondMoment21.increment((double) (short) -1);
        secondMoment21.clear();
        org.apache.commons.math.stat.descriptive.moment.Variance variance28 = new org.apache.commons.math.stat.descriptive.moment.Variance(secondMoment21);
        double double29 = secondMoment21.getResult();
        long long30 = secondMoment21.getN();
        double double31 = secondMoment21.getResult();
        org.apache.commons.math.stat.descriptive.moment.SecondMoment secondMoment33 = new org.apache.commons.math.stat.descriptive.moment.SecondMoment();
        secondMoment33.increment((double) ' ');
        org.apache.commons.math.stat.descriptive.moment.Variance variance36 = new org.apache.commons.math.stat.descriptive.moment.Variance(secondMoment33);
        secondMoment33.increment((double) (short) -1);
        long long39 = secondMoment33.getN();
        org.apache.commons.math.stat.descriptive.moment.Variance variance40 = new org.apache.commons.math.stat.descriptive.moment.Variance(false, secondMoment33);
        org.apache.commons.math.stat.descriptive.moment.Variance variance41 = new org.apache.commons.math.stat.descriptive.moment.Variance(secondMoment33);
        double double42 = secondMoment33.getResult();
        secondMoment33.clear();
        org.apache.commons.math.stat.descriptive.moment.SecondMoment secondMoment44 = new org.apache.commons.math.stat.descriptive.moment.SecondMoment();
        secondMoment44.increment(1.0d);
        double[] doubleArray50 = new double[] { (-1L), 0, 10L };
        secondMoment44.incrementAll(doubleArray50, 0, 0);
        double[] doubleArray56 = new double[] { 10, (byte) 100 };
        double double57 = secondMoment44.evaluate(doubleArray56);
        org.apache.commons.math.stat.descriptive.moment.Variance variance58 = new org.apache.commons.math.stat.descriptive.moment.Variance();
        org.apache.commons.math.stat.descriptive.moment.SecondMoment secondMoment59 = new org.apache.commons.math.stat.descriptive.moment.SecondMoment();
        secondMoment59.increment(1.0d);
        secondMoment59.increment((double) (short) 0);
        double double64 = secondMoment59.getResult();
        org.apache.commons.math.stat.descriptive.moment.SecondMoment secondMoment65 = new org.apache.commons.math.stat.descriptive.moment.SecondMoment();
        secondMoment65.increment(1.0d);
        double[] doubleArray71 = new double[] { (-1L), 0, 10L };
        secondMoment65.incrementAll(doubleArray71, 0, 0);
        double double75 = secondMoment59.evaluate(doubleArray71);
        double[] doubleArray76 = new double[] {};
        secondMoment59.incrementAll(doubleArray76);
        double double80 = variance58.evaluate(doubleArray76, (int) (byte) 0, 0);
        double double81 = secondMoment44.evaluate(doubleArray76);
        secondMoment33.incrementAll(doubleArray76);
        double double83 = secondMoment21.evaluate(doubleArray76);
        double double84 = secondMoment7.evaluate(doubleArray76);
        double double86 = variance1.evaluate(doubleArray76, 7434.8d);
        variance1.setBiasCorrected(true);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 0L + "'", long2 == 0L);
        org.junit.Assert.assertTrue(Double.isNaN(double3));
        org.junit.Assert.assertTrue(Double.isNaN(double4));
        org.junit.Assert.assertTrue(Double.isNaN(double5));
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 0L + "'", long6 == 0L);
        org.junit.Assert.assertTrue("'" + long12 + "' != '" + 2L + "'", long12 == 2L);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 0.5d + "'", double13 == 0.5d);
        org.junit.Assert.assertTrue("'" + long17 + "' != '" + 0L + "'", long17 == 0L);
        org.junit.Assert.assertTrue("'" + long20 + "' != '" + 1L + "'", long20 == 1L);
        org.junit.Assert.assertTrue(Double.isNaN(double29));
        org.junit.Assert.assertTrue("'" + long30 + "' != '" + 0L + "'", long30 == 0L);
        org.junit.Assert.assertTrue(Double.isNaN(double31));
        org.junit.Assert.assertTrue("'" + long39 + "' != '" + 2L + "'", long39 == 2L);
        org.junit.Assert.assertTrue("'" + double42 + "' != '" + 544.5d + "'", double42 == 544.5d);
        org.junit.Assert.assertNotNull(doubleArray50);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray50), "[-1.0, 0.0, 10.0]");
        org.junit.Assert.assertNotNull(doubleArray56);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray56), "[10.0, 100.0]");
        org.junit.Assert.assertTrue("'" + double57 + "' != '" + 4050.0d + "'", double57 == 4050.0d);
        org.junit.Assert.assertTrue("'" + double64 + "' != '" + 0.5d + "'", double64 == 0.5d);
        org.junit.Assert.assertNotNull(doubleArray71);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray71), "[-1.0, 0.0, 10.0]");
        org.junit.Assert.assertTrue("'" + double75 + "' != '" + 74.0d + "'", double75 == 74.0d);
        org.junit.Assert.assertNotNull(doubleArray76);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray76), "[]");
        org.junit.Assert.assertTrue(Double.isNaN(double80));
        org.junit.Assert.assertTrue("'" + double81 + "' != '" + 4050.0d + "'", double81 == 4050.0d);
        org.junit.Assert.assertTrue(Double.isNaN(double83));
        org.junit.Assert.assertTrue("'" + double84 + "' != '" + 0.0d + "'", double84 == 0.0d);
        org.junit.Assert.assertTrue(Double.isNaN(double86));
    }

    @Test
    public void test16556() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest33.test16556");
        org.apache.commons.math.stat.descriptive.moment.SecondMoment secondMoment0 = new org.apache.commons.math.stat.descriptive.moment.SecondMoment();
        secondMoment0.increment((double) ' ');
        org.apache.commons.math.stat.descriptive.moment.Variance variance3 = new org.apache.commons.math.stat.descriptive.moment.Variance(secondMoment0);
        secondMoment0.increment((double) (short) -1);
        secondMoment0.clear();
        secondMoment0.increment((double) 0L);
        org.apache.commons.math.stat.descriptive.moment.Variance variance9 = new org.apache.commons.math.stat.descriptive.moment.Variance(secondMoment0);
        org.apache.commons.math.stat.descriptive.moment.SecondMoment secondMoment10 = new org.apache.commons.math.stat.descriptive.moment.SecondMoment();
        secondMoment10.increment((double) ' ');
        org.apache.commons.math.stat.descriptive.moment.Variance variance13 = new org.apache.commons.math.stat.descriptive.moment.Variance(secondMoment10);
        secondMoment10.increment((double) (short) -1);
        secondMoment10.clear();
        secondMoment10.increment((double) 0L);
        org.apache.commons.math.stat.descriptive.moment.Variance variance19 = new org.apache.commons.math.stat.descriptive.moment.Variance(secondMoment10);
        long long20 = variance19.getN();
        variance19.increment(200.0d);
        org.apache.commons.math.stat.descriptive.moment.SecondMoment secondMoment24 = new org.apache.commons.math.stat.descriptive.moment.SecondMoment();
        secondMoment24.increment((double) ' ');
        org.apache.commons.math.stat.descriptive.moment.Variance variance27 = new org.apache.commons.math.stat.descriptive.moment.Variance(secondMoment24);
        secondMoment24.increment((double) (short) -1);
        long long30 = secondMoment24.getN();
        org.apache.commons.math.stat.descriptive.moment.Variance variance31 = new org.apache.commons.math.stat.descriptive.moment.Variance(false, secondMoment24);
        org.apache.commons.math.stat.descriptive.moment.SecondMoment secondMoment32 = new org.apache.commons.math.stat.descriptive.moment.SecondMoment();
        secondMoment32.increment(1.0d);
        double[] doubleArray38 = new double[] { (-1L), 0, 10L };
        secondMoment32.incrementAll(doubleArray38, 0, 0);
        double double43 = variance31.evaluate(doubleArray38, (double) 1L);
        org.apache.commons.math.stat.descriptive.moment.SecondMoment secondMoment44 = new org.apache.commons.math.stat.descriptive.moment.SecondMoment();
        secondMoment44.increment(1.0d);
        double[] doubleArray50 = new double[] { (-1L), 0, 10L };
        secondMoment44.incrementAll(doubleArray50, 0, 0);
        double[] doubleArray56 = new double[] { 10, (byte) 100 };
        double double57 = secondMoment44.evaluate(doubleArray56);
        double double59 = variance31.evaluate(doubleArray56, 0.0d);
        double double60 = variance19.evaluate(doubleArray56);
        double double64 = variance9.evaluate(doubleArray56, (double) 100.0f, 0, 0);
        java.lang.Class<?> wildcardClass65 = variance9.getClass();
        org.junit.Assert.assertTrue("'" + long20 + "' != '" + 1L + "'", long20 == 1L);
        org.junit.Assert.assertTrue("'" + long30 + "' != '" + 2L + "'", long30 == 2L);
        org.junit.Assert.assertNotNull(doubleArray38);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray38), "[-1.0, 0.0, 10.0]");
        org.junit.Assert.assertTrue("'" + double43 + "' != '" + 24.666666666666668d + "'", double43 == 24.666666666666668d);
        org.junit.Assert.assertNotNull(doubleArray50);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray50), "[-1.0, 0.0, 10.0]");
        org.junit.Assert.assertNotNull(doubleArray56);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray56), "[10.0, 100.0]");
        org.junit.Assert.assertTrue("'" + double57 + "' != '" + 4050.0d + "'", double57 == 4050.0d);
        org.junit.Assert.assertTrue("'" + double59 + "' != '" + 2025.0d + "'", double59 == 2025.0d);
        org.junit.Assert.assertTrue("'" + double60 + "' != '" + 4050.0d + "'", double60 == 4050.0d);
        org.junit.Assert.assertTrue(Double.isNaN(double64));
        org.junit.Assert.assertNotNull(wildcardClass65);
    }

    @Test
    public void test16557() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest33.test16557");
        org.apache.commons.math.stat.descriptive.moment.SecondMoment secondMoment1 = null;
        org.apache.commons.math.stat.descriptive.moment.Variance variance2 = new org.apache.commons.math.stat.descriptive.moment.Variance(false, secondMoment1);
        variance2.clear();
        variance2.clear();
        variance2.increment((double) (short) -1);
        variance2.increment(0.0d);
        variance2.setBiasCorrected(true);
        boolean boolean11 = variance2.isBiasCorrected();
        variance2.increment(7075.0d);
        boolean boolean14 = variance2.isBiasCorrected();
        boolean boolean15 = variance2.isBiasCorrected();
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
    }

    @Test
    public void test16558() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest33.test16558");
        org.apache.commons.math.stat.descriptive.moment.SecondMoment secondMoment1 = new org.apache.commons.math.stat.descriptive.moment.SecondMoment();
        secondMoment1.increment(1.0d);
        secondMoment1.increment((double) (short) 0);
        long long6 = secondMoment1.getN();
        double double7 = secondMoment1.getResult();
        long long8 = secondMoment1.getN();
        org.apache.commons.math.stat.descriptive.moment.SecondMoment secondMoment9 = new org.apache.commons.math.stat.descriptive.moment.SecondMoment();
        secondMoment9.increment((double) ' ');
        org.apache.commons.math.stat.descriptive.moment.Variance variance12 = new org.apache.commons.math.stat.descriptive.moment.Variance(secondMoment9);
        secondMoment9.increment((double) (short) -1);
        secondMoment9.clear();
        secondMoment9.increment((double) 0L);
        org.apache.commons.math.stat.descriptive.moment.Variance variance18 = new org.apache.commons.math.stat.descriptive.moment.Variance(secondMoment9);
        org.apache.commons.math.stat.descriptive.moment.SecondMoment secondMoment19 = new org.apache.commons.math.stat.descriptive.moment.SecondMoment();
        secondMoment19.increment(1.0d);
        secondMoment19.increment((double) (short) 0);
        double double24 = secondMoment19.getResult();
        org.apache.commons.math.stat.descriptive.moment.SecondMoment secondMoment25 = new org.apache.commons.math.stat.descriptive.moment.SecondMoment();
        secondMoment25.increment(1.0d);
        double[] doubleArray31 = new double[] { (-1L), 0, 10L };
        secondMoment25.incrementAll(doubleArray31, 0, 0);
        double double35 = secondMoment19.evaluate(doubleArray31);
        double double36 = secondMoment9.evaluate(doubleArray31);
        org.apache.commons.math.stat.descriptive.moment.SecondMoment secondMoment37 = new org.apache.commons.math.stat.descriptive.moment.SecondMoment();
        secondMoment37.increment(1.0d);
        double[] doubleArray43 = new double[] { (-1L), 0, 10L };
        secondMoment37.incrementAll(doubleArray43, 0, 0);
        double[] doubleArray49 = new double[] { 10, (byte) 100 };
        double double50 = secondMoment37.evaluate(doubleArray49);
        double double51 = secondMoment37.getResult();
        secondMoment37.increment((double) (short) -1);
        double[] doubleArray55 = new double[] { (short) 1 };
        secondMoment37.incrementAll(doubleArray55);
        double double57 = secondMoment9.evaluate(doubleArray55);
        secondMoment9.increment((double) (short) 1);
        boolean boolean60 = secondMoment1.equals((java.lang.Object) secondMoment9);
        secondMoment1.clear();
        org.apache.commons.math.stat.descriptive.moment.Variance variance62 = new org.apache.commons.math.stat.descriptive.moment.Variance(true, secondMoment1);
        secondMoment1.increment(1.6289621902263371E7d);
        secondMoment1.increment(4680.28125d);
        double double67 = secondMoment1.getResult();
        secondMoment1.increment(1.6289621902263371E7d);
        secondMoment1.increment(7186.0d);
        secondMoment1.clear();
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 2L + "'", long6 == 2L);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 0.5d + "'", double7 == 0.5d);
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 2L + "'", long8 == 2L);
        org.junit.Assert.assertTrue("'" + double24 + "' != '" + 0.5d + "'", double24 == 0.5d);
        org.junit.Assert.assertNotNull(doubleArray31);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray31), "[-1.0, 0.0, 10.0]");
        org.junit.Assert.assertTrue("'" + double35 + "' != '" + 74.0d + "'", double35 == 74.0d);
        org.junit.Assert.assertTrue("'" + double36 + "' != '" + 74.0d + "'", double36 == 74.0d);
        org.junit.Assert.assertNotNull(doubleArray43);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray43), "[-1.0, 0.0, 10.0]");
        org.junit.Assert.assertNotNull(doubleArray49);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray49), "[10.0, 100.0]");
        org.junit.Assert.assertTrue("'" + double50 + "' != '" + 4050.0d + "'", double50 == 4050.0d);
        org.junit.Assert.assertTrue("'" + double51 + "' != '" + 4050.0d + "'", double51 == 4050.0d);
        org.junit.Assert.assertNotNull(doubleArray55);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray55), "[1.0]");
        org.junit.Assert.assertTrue("'" + double57 + "' != '" + 0.0d + "'", double57 == 0.0d);
        org.junit.Assert.assertTrue("'" + boolean60 + "' != '" + false + "'", boolean60 == false);
        org.junit.Assert.assertTrue("'" + double67 + "' != '" + 1.325996617999068E14d + "'", double67 == 1.325996617999068E14d);
    }

    @Test
    public void test16559() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest33.test16559");
        org.apache.commons.math.stat.descriptive.moment.SecondMoment secondMoment0 = new org.apache.commons.math.stat.descriptive.moment.SecondMoment();
        secondMoment0.increment(1.0d);
        double[] doubleArray6 = new double[] { (-1L), 0, 10L };
        secondMoment0.incrementAll(doubleArray6, 0, 0);
        double[] doubleArray12 = new double[] { 10, (byte) 100 };
        double double13 = secondMoment0.evaluate(doubleArray12);
        double double14 = secondMoment0.getResult();
        secondMoment0.increment((double) (short) -1);
        double double17 = secondMoment0.getResult();
        double double18 = secondMoment0.getResult();
        secondMoment0.clear();
        secondMoment0.increment(4402.666666666667d);
        double double22 = secondMoment0.getResult();
        double double23 = secondMoment0.getResult();
        secondMoment0.increment(4402.666666666667d);
        secondMoment0.increment(7200964.18888889d);
        secondMoment0.increment(7.703419152040815E7d);
        secondMoment0.clear();
        org.apache.commons.math.stat.descriptive.moment.SecondMoment secondMoment31 = new org.apache.commons.math.stat.descriptive.moment.SecondMoment();
        secondMoment31.increment(1.0d);
        double[] doubleArray37 = new double[] { (-1L), 0, 10L };
        secondMoment31.incrementAll(doubleArray37, 0, 0);
        org.apache.commons.math.stat.descriptive.moment.Variance variance41 = new org.apache.commons.math.stat.descriptive.moment.Variance(secondMoment31);
        long long42 = variance41.getN();
        org.apache.commons.math.stat.descriptive.moment.SecondMoment secondMoment43 = new org.apache.commons.math.stat.descriptive.moment.SecondMoment();
        secondMoment43.increment(1.0d);
        double[] doubleArray49 = new double[] { (-1L), 0, 10L };
        secondMoment43.incrementAll(doubleArray49, 0, 0);
        double double54 = variance41.evaluate(doubleArray49, (double) (short) -1);
        // The following exception was thrown during execution in test generation
        try {
            double double57 = secondMoment0.evaluate(doubleArray49, (int) (byte) 1, (int) ' ');
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: begin + length > values.length");
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
        org.junit.Assert.assertTrue("'" + double18 + "' != '" + 6140.666666666667d + "'", double18 == 6140.666666666667d);
        org.junit.Assert.assertTrue("'" + double22 + "' != '" + 0.0d + "'", double22 == 0.0d);
        org.junit.Assert.assertTrue("'" + double23 + "' != '" + 0.0d + "'", double23 == 0.0d);
        org.junit.Assert.assertNotNull(doubleArray37);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray37), "[-1.0, 0.0, 10.0]");
        org.junit.Assert.assertTrue("'" + long42 + "' != '" + 1L + "'", long42 == 1L);
        org.junit.Assert.assertNotNull(doubleArray49);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray49), "[-1.0, 0.0, 10.0]");
        org.junit.Assert.assertTrue("'" + double54 + "' != '" + 37.0d + "'", double54 == 37.0d);
    }

    @Test
    public void test16560() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest33.test16560");
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
        boolean boolean85 = variance81.isBiasCorrected();
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
        org.junit.Assert.assertTrue("'" + boolean85 + "' != '" + true + "'", boolean85 == true);
    }

    @Test
    public void test16561() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest33.test16561");
        org.apache.commons.math.stat.descriptive.moment.SecondMoment secondMoment1 = new org.apache.commons.math.stat.descriptive.moment.SecondMoment();
        secondMoment1.increment(1.0d);
        secondMoment1.increment((double) (short) 0);
        long long6 = secondMoment1.getN();
        org.apache.commons.math.stat.descriptive.moment.Variance variance7 = new org.apache.commons.math.stat.descriptive.moment.Variance(false, secondMoment1);
        org.apache.commons.math.stat.descriptive.moment.SecondMoment secondMoment8 = new org.apache.commons.math.stat.descriptive.moment.SecondMoment();
        secondMoment8.increment((double) ' ');
        org.apache.commons.math.stat.descriptive.moment.Variance variance11 = new org.apache.commons.math.stat.descriptive.moment.Variance(secondMoment8);
        secondMoment8.increment((double) (short) -1);
        secondMoment8.clear();
        secondMoment8.increment((double) 'a');
        org.apache.commons.math.stat.descriptive.moment.SecondMoment secondMoment17 = new org.apache.commons.math.stat.descriptive.moment.SecondMoment();
        secondMoment17.increment(1.0d);
        secondMoment17.increment((double) (short) 0);
        boolean boolean22 = secondMoment8.equals((java.lang.Object) secondMoment17);
        org.apache.commons.math.stat.descriptive.moment.SecondMoment secondMoment23 = new org.apache.commons.math.stat.descriptive.moment.SecondMoment();
        secondMoment23.increment(1.0d);
        org.apache.commons.math.stat.descriptive.moment.SecondMoment secondMoment26 = new org.apache.commons.math.stat.descriptive.moment.SecondMoment();
        secondMoment26.increment(1.0d);
        double[] doubleArray32 = new double[] { (-1L), 0, 10L };
        secondMoment26.incrementAll(doubleArray32, 0, 0);
        double[] doubleArray38 = new double[] { 10, (byte) 100 };
        double double39 = secondMoment26.evaluate(doubleArray38);
        double double40 = secondMoment23.evaluate(doubleArray38);
        secondMoment8.incrementAll(doubleArray38);
        secondMoment1.incrementAll(doubleArray38, (int) (short) 0, 0);
        secondMoment1.increment((double) ' ');
        org.apache.commons.math.stat.descriptive.moment.Variance variance47 = new org.apache.commons.math.stat.descriptive.moment.Variance(secondMoment1);
        secondMoment1.clear();
        double double49 = secondMoment1.getResult();
        long long50 = secondMoment1.getN();
        org.apache.commons.math.stat.descriptive.moment.SecondMoment secondMoment51 = new org.apache.commons.math.stat.descriptive.moment.SecondMoment();
        secondMoment51.increment((double) ' ');
        org.apache.commons.math.stat.descriptive.moment.Variance variance54 = new org.apache.commons.math.stat.descriptive.moment.Variance(secondMoment51);
        double double55 = variance54.getResult();
        variance54.setBiasCorrected(true);
        double double58 = variance54.getResult();
        org.apache.commons.math.stat.descriptive.moment.SecondMoment secondMoment59 = new org.apache.commons.math.stat.descriptive.moment.SecondMoment();
        secondMoment59.increment((double) ' ');
        secondMoment59.increment((double) '4');
        secondMoment59.increment((double) 0.0f);
        long long66 = secondMoment59.getN();
        long long67 = secondMoment59.getN();
        org.apache.commons.math.stat.descriptive.moment.Variance variance69 = new org.apache.commons.math.stat.descriptive.moment.Variance(true);
        long long70 = variance69.getN();
        org.apache.commons.math.stat.descriptive.moment.SecondMoment secondMoment71 = new org.apache.commons.math.stat.descriptive.moment.SecondMoment();
        secondMoment71.increment(1.0d);
        secondMoment71.increment((double) (short) 0);
        double double76 = secondMoment71.getResult();
        org.apache.commons.math.stat.descriptive.moment.SecondMoment secondMoment77 = new org.apache.commons.math.stat.descriptive.moment.SecondMoment();
        secondMoment77.increment(1.0d);
        double[] doubleArray83 = new double[] { (-1L), 0, 10L };
        secondMoment77.incrementAll(doubleArray83, 0, 0);
        double double87 = secondMoment71.evaluate(doubleArray83);
        variance69.incrementAll(doubleArray83);
        double double89 = secondMoment59.evaluate(doubleArray83);
        boolean boolean90 = variance54.equals((java.lang.Object) doubleArray83);
        double double91 = secondMoment1.evaluate(doubleArray83);
        long long92 = secondMoment1.getN();
        double double93 = secondMoment1.getResult();
        secondMoment1.increment((double) (short) 0);
        secondMoment1.increment(6.13542106972126E14d);
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 2L + "'", long6 == 2L);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertNotNull(doubleArray32);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray32), "[-1.0, 0.0, 10.0]");
        org.junit.Assert.assertNotNull(doubleArray38);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray38), "[10.0, 100.0]");
        org.junit.Assert.assertTrue("'" + double39 + "' != '" + 4050.0d + "'", double39 == 4050.0d);
        org.junit.Assert.assertTrue("'" + double40 + "' != '" + 4050.0d + "'", double40 == 4050.0d);
        org.junit.Assert.assertTrue(Double.isNaN(double49));
        org.junit.Assert.assertTrue("'" + long50 + "' != '" + 0L + "'", long50 == 0L);
        org.junit.Assert.assertTrue("'" + double55 + "' != '" + 0.0d + "'", double55 == 0.0d);
        org.junit.Assert.assertTrue("'" + double58 + "' != '" + 0.0d + "'", double58 == 0.0d);
        org.junit.Assert.assertTrue("'" + long66 + "' != '" + 3L + "'", long66 == 3L);
        org.junit.Assert.assertTrue("'" + long67 + "' != '" + 3L + "'", long67 == 3L);
        org.junit.Assert.assertTrue("'" + long70 + "' != '" + 0L + "'", long70 == 0L);
        org.junit.Assert.assertTrue("'" + double76 + "' != '" + 0.5d + "'", double76 == 0.5d);
        org.junit.Assert.assertNotNull(doubleArray83);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray83), "[-1.0, 0.0, 10.0]");
        org.junit.Assert.assertTrue("'" + double87 + "' != '" + 74.0d + "'", double87 == 74.0d);
        org.junit.Assert.assertTrue("'" + double89 + "' != '" + 74.0d + "'", double89 == 74.0d);
        org.junit.Assert.assertTrue("'" + boolean90 + "' != '" + false + "'", boolean90 == false);
        org.junit.Assert.assertTrue("'" + double91 + "' != '" + 74.0d + "'", double91 == 74.0d);
        org.junit.Assert.assertTrue("'" + long92 + "' != '" + 3L + "'", long92 == 3L);
        org.junit.Assert.assertTrue("'" + double93 + "' != '" + 74.0d + "'", double93 == 74.0d);
    }

    @Test
    public void test16562() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest33.test16562");
        org.apache.commons.math.stat.descriptive.moment.SecondMoment secondMoment1 = new org.apache.commons.math.stat.descriptive.moment.SecondMoment();
        secondMoment1.increment((double) ' ');
        double double4 = secondMoment1.getResult();
        double double5 = secondMoment1.getResult();
        org.apache.commons.math.stat.descriptive.moment.SecondMoment secondMoment6 = new org.apache.commons.math.stat.descriptive.moment.SecondMoment();
        secondMoment6.increment(1.0d);
        double[] doubleArray12 = new double[] { (-1L), 0, 10L };
        secondMoment6.incrementAll(doubleArray12, 0, 0);
        double[] doubleArray18 = new double[] { 10, (byte) 100 };
        double double19 = secondMoment6.evaluate(doubleArray18);
        double double20 = secondMoment1.evaluate(doubleArray18);
        org.apache.commons.math.stat.descriptive.moment.Variance variance21 = new org.apache.commons.math.stat.descriptive.moment.Variance(false, secondMoment1);
        java.lang.Object obj22 = null;
        boolean boolean23 = variance21.equals(obj22);
        variance21.clear();
        double double25 = variance21.getResult();
        variance21.setBiasCorrected(false);
        java.lang.Class<?> wildcardClass28 = variance21.getClass();
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 0.0d + "'", double4 == 0.0d);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
        org.junit.Assert.assertNotNull(doubleArray12);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray12), "[-1.0, 0.0, 10.0]");
        org.junit.Assert.assertNotNull(doubleArray18);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray18), "[10.0, 100.0]");
        org.junit.Assert.assertTrue("'" + double19 + "' != '" + 4050.0d + "'", double19 == 4050.0d);
        org.junit.Assert.assertTrue("'" + double20 + "' != '" + 4050.0d + "'", double20 == 4050.0d);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertTrue("'" + double25 + "' != '" + 2025.0d + "'", double25 == 2025.0d);
        org.junit.Assert.assertNotNull(wildcardClass28);
    }

    @Test
    public void test16563() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest33.test16563");
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
        org.apache.commons.math.stat.descriptive.moment.Variance variance21 = new org.apache.commons.math.stat.descriptive.moment.Variance(secondMoment18);
        secondMoment18.increment((double) (short) -1);
        secondMoment18.clear();
        secondMoment18.increment((double) 0L);
        org.apache.commons.math.stat.descriptive.moment.Variance variance27 = new org.apache.commons.math.stat.descriptive.moment.Variance(secondMoment18);
        org.apache.commons.math.stat.descriptive.moment.SecondMoment secondMoment28 = new org.apache.commons.math.stat.descriptive.moment.SecondMoment();
        secondMoment28.increment(1.0d);
        secondMoment28.increment((double) (short) 0);
        double double33 = secondMoment28.getResult();
        org.apache.commons.math.stat.descriptive.moment.SecondMoment secondMoment34 = new org.apache.commons.math.stat.descriptive.moment.SecondMoment();
        secondMoment34.increment(1.0d);
        double[] doubleArray40 = new double[] { (-1L), 0, 10L };
        secondMoment34.incrementAll(doubleArray40, 0, 0);
        double double44 = secondMoment28.evaluate(doubleArray40);
        double double45 = secondMoment18.evaluate(doubleArray40);
        org.apache.commons.math.stat.descriptive.moment.SecondMoment secondMoment46 = new org.apache.commons.math.stat.descriptive.moment.SecondMoment();
        secondMoment46.increment(1.0d);
        double[] doubleArray52 = new double[] { (-1L), 0, 10L };
        secondMoment46.incrementAll(doubleArray52, 0, 0);
        double[] doubleArray58 = new double[] { 10, (byte) 100 };
        double double59 = secondMoment46.evaluate(doubleArray58);
        double double60 = secondMoment46.getResult();
        secondMoment46.increment((double) (short) -1);
        double[] doubleArray64 = new double[] { (short) 1 };
        secondMoment46.incrementAll(doubleArray64);
        double double66 = secondMoment18.evaluate(doubleArray64);
        double double67 = secondMoment1.evaluate(doubleArray64);
        java.lang.Class<?> wildcardClass68 = doubleArray64.getClass();
        org.junit.Assert.assertNotNull(doubleArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray7), "[-1.0, 0.0, 10.0]");
        org.junit.Assert.assertNotNull(doubleArray13);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray13), "[10.0, 100.0]");
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + 4050.0d + "'", double14 == 4050.0d);
        org.junit.Assert.assertTrue("'" + double15 + "' != '" + 4050.0d + "'", double15 == 4050.0d);
        org.junit.Assert.assertTrue("'" + long17 + "' != '" + 2L + "'", long17 == 2L);
        org.junit.Assert.assertTrue("'" + double33 + "' != '" + 0.5d + "'", double33 == 0.5d);
        org.junit.Assert.assertNotNull(doubleArray40);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray40), "[-1.0, 0.0, 10.0]");
        org.junit.Assert.assertTrue("'" + double44 + "' != '" + 74.0d + "'", double44 == 74.0d);
        org.junit.Assert.assertTrue("'" + double45 + "' != '" + 74.0d + "'", double45 == 74.0d);
        org.junit.Assert.assertNotNull(doubleArray52);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray52), "[-1.0, 0.0, 10.0]");
        org.junit.Assert.assertNotNull(doubleArray58);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray58), "[10.0, 100.0]");
        org.junit.Assert.assertTrue("'" + double59 + "' != '" + 4050.0d + "'", double59 == 4050.0d);
        org.junit.Assert.assertTrue("'" + double60 + "' != '" + 4050.0d + "'", double60 == 4050.0d);
        org.junit.Assert.assertNotNull(doubleArray64);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray64), "[1.0]");
        org.junit.Assert.assertTrue("'" + double66 + "' != '" + 0.0d + "'", double66 == 0.0d);
        org.junit.Assert.assertTrue("'" + double67 + "' != '" + 0.0d + "'", double67 == 0.0d);
        org.junit.Assert.assertNotNull(wildcardClass68);
    }

    @Test
    public void test16564() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest33.test16564");
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
        variance10.setBiasCorrected(false);
        org.apache.commons.math.stat.descriptive.moment.SecondMoment secondMoment21 = new org.apache.commons.math.stat.descriptive.moment.SecondMoment();
        secondMoment21.increment((double) ' ');
        org.apache.commons.math.stat.descriptive.moment.Variance variance24 = new org.apache.commons.math.stat.descriptive.moment.Variance(secondMoment21);
        secondMoment21.clear();
        org.apache.commons.math.stat.descriptive.moment.Variance variance26 = new org.apache.commons.math.stat.descriptive.moment.Variance(true, secondMoment21);
        secondMoment21.clear();
        secondMoment21.clear();
        org.apache.commons.math.stat.descriptive.moment.SecondMoment secondMoment29 = new org.apache.commons.math.stat.descriptive.moment.SecondMoment();
        secondMoment29.increment((double) ' ');
        org.apache.commons.math.stat.descriptive.moment.Variance variance32 = new org.apache.commons.math.stat.descriptive.moment.Variance(secondMoment29);
        secondMoment29.increment((double) (short) -1);
        org.apache.commons.math.stat.descriptive.moment.SecondMoment secondMoment35 = new org.apache.commons.math.stat.descriptive.moment.SecondMoment();
        secondMoment35.increment(1.0d);
        double[] doubleArray41 = new double[] { (-1L), 0, 10L };
        secondMoment35.incrementAll(doubleArray41, 0, 0);
        org.apache.commons.math.stat.descriptive.moment.Variance variance45 = new org.apache.commons.math.stat.descriptive.moment.Variance(secondMoment35);
        long long46 = variance45.getN();
        org.apache.commons.math.stat.descriptive.moment.SecondMoment secondMoment47 = new org.apache.commons.math.stat.descriptive.moment.SecondMoment();
        secondMoment47.increment(1.0d);
        double[] doubleArray53 = new double[] { (-1L), 0, 10L };
        secondMoment47.incrementAll(doubleArray53, 0, 0);
        double double58 = variance45.evaluate(doubleArray53, (double) (short) -1);
        double double59 = secondMoment29.evaluate(doubleArray53);
        double double60 = secondMoment21.evaluate(doubleArray53);
        double double63 = variance10.evaluate(doubleArray53, 0, 0);
        variance10.clear();
        variance10.clear();
        variance10.clear();
        double double67 = variance10.getResult();
        variance10.clear();
        org.junit.Assert.assertNotNull(doubleArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray6), "[-1.0, 0.0, 10.0]");
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertNotNull(doubleArray41);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray41), "[-1.0, 0.0, 10.0]");
        org.junit.Assert.assertTrue("'" + long46 + "' != '" + 1L + "'", long46 == 1L);
        org.junit.Assert.assertNotNull(doubleArray53);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray53), "[-1.0, 0.0, 10.0]");
        org.junit.Assert.assertTrue("'" + double58 + "' != '" + 37.0d + "'", double58 == 37.0d);
        org.junit.Assert.assertTrue("'" + double59 + "' != '" + 74.0d + "'", double59 == 74.0d);
        org.junit.Assert.assertTrue("'" + double60 + "' != '" + 74.0d + "'", double60 == 74.0d);
        org.junit.Assert.assertTrue(Double.isNaN(double63));
        org.junit.Assert.assertTrue("'" + double67 + "' != '" + 0.0d + "'", double67 == 0.0d);
    }

    @Test
    public void test16565() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest33.test16565");
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
        org.apache.commons.math.stat.descriptive.moment.Variance variance21 = new org.apache.commons.math.stat.descriptive.moment.Variance(secondMoment1);
        org.junit.Assert.assertNotNull(doubleArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray7), "[-1.0, 0.0, 10.0]");
        org.junit.Assert.assertNotNull(doubleArray13);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray13), "[10.0, 100.0]");
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + 4050.0d + "'", double14 == 4050.0d);
        org.junit.Assert.assertTrue("'" + long15 + "' != '" + 2L + "'", long15 == 2L);
        org.junit.Assert.assertTrue(Double.isNaN(double18));
    }

    @Test
    public void test16566() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest33.test16566");
        org.apache.commons.math.stat.descriptive.moment.SecondMoment secondMoment0 = new org.apache.commons.math.stat.descriptive.moment.SecondMoment();
        secondMoment0.increment(1.0d);
        double[] doubleArray6 = new double[] { (-1L), 0, 10L };
        secondMoment0.incrementAll(doubleArray6, 0, 0);
        double[] doubleArray12 = new double[] { 10, (byte) 100 };
        double double13 = secondMoment0.evaluate(doubleArray12);
        double double14 = secondMoment0.getResult();
        secondMoment0.increment((double) (short) -1);
        double double17 = secondMoment0.getResult();
        double double18 = secondMoment0.getResult();
        secondMoment0.clear();
        secondMoment0.increment(4402.666666666667d);
        org.apache.commons.math.stat.descriptive.moment.SecondMoment secondMoment22 = new org.apache.commons.math.stat.descriptive.moment.SecondMoment();
        secondMoment22.increment((double) ' ');
        org.apache.commons.math.stat.descriptive.moment.Variance variance25 = new org.apache.commons.math.stat.descriptive.moment.Variance(secondMoment22);
        secondMoment22.increment((double) (short) -1);
        secondMoment22.clear();
        secondMoment22.increment((double) 0L);
        org.apache.commons.math.stat.descriptive.moment.Variance variance31 = new org.apache.commons.math.stat.descriptive.moment.Variance(secondMoment22);
        org.apache.commons.math.stat.descriptive.moment.SecondMoment secondMoment32 = new org.apache.commons.math.stat.descriptive.moment.SecondMoment();
        secondMoment32.increment(1.0d);
        secondMoment32.increment((double) (short) 0);
        double double37 = secondMoment32.getResult();
        org.apache.commons.math.stat.descriptive.moment.SecondMoment secondMoment38 = new org.apache.commons.math.stat.descriptive.moment.SecondMoment();
        secondMoment38.increment(1.0d);
        double[] doubleArray44 = new double[] { (-1L), 0, 10L };
        secondMoment38.incrementAll(doubleArray44, 0, 0);
        double double48 = secondMoment32.evaluate(doubleArray44);
        double double49 = secondMoment22.evaluate(doubleArray44);
        org.apache.commons.math.stat.descriptive.moment.SecondMoment secondMoment50 = new org.apache.commons.math.stat.descriptive.moment.SecondMoment();
        secondMoment50.increment(1.0d);
        double[] doubleArray56 = new double[] { (-1L), 0, 10L };
        secondMoment50.incrementAll(doubleArray56, 0, 0);
        double[] doubleArray62 = new double[] { 10, (byte) 100 };
        double double63 = secondMoment50.evaluate(doubleArray62);
        double double64 = secondMoment50.getResult();
        secondMoment50.increment((double) (short) -1);
        double[] doubleArray68 = new double[] { (short) 1 };
        secondMoment50.incrementAll(doubleArray68);
        double double70 = secondMoment22.evaluate(doubleArray68);
        secondMoment0.incrementAll(doubleArray68);
        secondMoment0.clear();
        double[] doubleArray73 = null;
        // The following exception was thrown during execution in test generation
        try {
            secondMoment0.incrementAll(doubleArray73);
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
        org.junit.Assert.assertTrue("'" + double18 + "' != '" + 6140.666666666667d + "'", double18 == 6140.666666666667d);
        org.junit.Assert.assertTrue("'" + double37 + "' != '" + 0.5d + "'", double37 == 0.5d);
        org.junit.Assert.assertNotNull(doubleArray44);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray44), "[-1.0, 0.0, 10.0]");
        org.junit.Assert.assertTrue("'" + double48 + "' != '" + 74.0d + "'", double48 == 74.0d);
        org.junit.Assert.assertTrue("'" + double49 + "' != '" + 74.0d + "'", double49 == 74.0d);
        org.junit.Assert.assertNotNull(doubleArray56);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray56), "[-1.0, 0.0, 10.0]");
        org.junit.Assert.assertNotNull(doubleArray62);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray62), "[10.0, 100.0]");
        org.junit.Assert.assertTrue("'" + double63 + "' != '" + 4050.0d + "'", double63 == 4050.0d);
        org.junit.Assert.assertTrue("'" + double64 + "' != '" + 4050.0d + "'", double64 == 4050.0d);
        org.junit.Assert.assertNotNull(doubleArray68);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray68), "[1.0]");
        org.junit.Assert.assertTrue("'" + double70 + "' != '" + 0.0d + "'", double70 == 0.0d);
    }

    @Test
    public void test16567() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest33.test16567");
        org.apache.commons.math.stat.descriptive.moment.SecondMoment secondMoment0 = new org.apache.commons.math.stat.descriptive.moment.SecondMoment();
        secondMoment0.increment(1.0d);
        secondMoment0.increment((double) (short) 0);
        long long5 = secondMoment0.getN();
        secondMoment0.increment(0.0d);
        secondMoment0.increment((double) 0);
        secondMoment0.increment((double) (byte) 10);
        secondMoment0.increment(7200964.18888889d);
        secondMoment0.increment((double) 100);
        double double16 = secondMoment0.getResult();
        org.apache.commons.math.stat.descriptive.moment.SecondMoment secondMoment17 = new org.apache.commons.math.stat.descriptive.moment.SecondMoment();
        secondMoment17.increment((double) ' ');
        org.apache.commons.math.stat.descriptive.moment.Variance variance20 = new org.apache.commons.math.stat.descriptive.moment.Variance(secondMoment17);
        secondMoment17.increment((double) (short) -1);
        secondMoment17.clear();
        secondMoment17.increment((double) 0L);
        org.apache.commons.math.stat.descriptive.moment.Variance variance26 = new org.apache.commons.math.stat.descriptive.moment.Variance(secondMoment17);
        org.apache.commons.math.stat.descriptive.moment.SecondMoment secondMoment27 = new org.apache.commons.math.stat.descriptive.moment.SecondMoment();
        secondMoment27.increment(1.0d);
        double[] doubleArray33 = new double[] { (-1L), 0, 10L };
        secondMoment27.incrementAll(doubleArray33, 0, 0);
        variance26.incrementAll(doubleArray33);
        long long38 = variance26.getN();
        variance26.setBiasCorrected(false);
        boolean boolean41 = variance26.isBiasCorrected();
        variance26.clear();
        boolean boolean43 = secondMoment0.equals((java.lang.Object) variance26);
        variance26.setBiasCorrected(false);
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 2L + "'", long5 == 2L);
        org.junit.Assert.assertTrue("'" + double16 + "' != '" + 4.444595899175677E13d + "'", double16 == 4.444595899175677E13d);
        org.junit.Assert.assertNotNull(doubleArray33);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray33), "[-1.0, 0.0, 10.0]");
        org.junit.Assert.assertTrue("'" + long38 + "' != '" + 1L + "'", long38 == 1L);
        org.junit.Assert.assertTrue("'" + boolean41 + "' != '" + false + "'", boolean41 == false);
        org.junit.Assert.assertTrue("'" + boolean43 + "' != '" + false + "'", boolean43 == false);
    }

    @Test
    public void test16568() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest33.test16568");
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
        secondMoment0.increment((double) 'a');
        secondMoment0.increment(3.0d);
        double double32 = secondMoment0.getResult();
        secondMoment0.increment(536.28125d);
        org.junit.Assert.assertTrue("'" + double15 + "' != '" + 0.5d + "'", double15 == 0.5d);
        org.junit.Assert.assertNotNull(doubleArray22);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray22), "[-1.0, 0.0, 10.0]");
        org.junit.Assert.assertTrue("'" + double26 + "' != '" + 74.0d + "'", double26 == 74.0d);
        org.junit.Assert.assertTrue("'" + double27 + "' != '" + 74.0d + "'", double27 == 74.0d);
        org.junit.Assert.assertTrue("'" + double32 + "' != '" + 7142.8d + "'", double32 == 7142.8d);
    }

    @Test
    public void test16569() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest33.test16569");
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
        variance21.increment(428.0833333333334d);
        double double31 = variance21.getResult();
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
        org.junit.Assert.assertTrue(Double.isNaN(double31));
    }

    @Test
    public void test16570() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest33.test16570");
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
        variance9.clear();
        variance9.increment((double) 10.0f);
        org.apache.commons.math.stat.descriptive.moment.SecondMoment secondMoment24 = new org.apache.commons.math.stat.descriptive.moment.SecondMoment();
        secondMoment24.increment(1.0d);
        secondMoment24.increment((double) (short) 0);
        double double29 = secondMoment24.getResult();
        org.apache.commons.math.stat.descriptive.moment.SecondMoment secondMoment30 = new org.apache.commons.math.stat.descriptive.moment.SecondMoment();
        secondMoment30.increment(1.0d);
        secondMoment30.increment((double) (short) 0);
        double double35 = secondMoment30.getResult();
        org.apache.commons.math.stat.descriptive.moment.SecondMoment secondMoment36 = new org.apache.commons.math.stat.descriptive.moment.SecondMoment();
        secondMoment36.increment(1.0d);
        double[] doubleArray42 = new double[] { (-1L), 0, 10L };
        secondMoment36.incrementAll(doubleArray42, 0, 0);
        double double46 = secondMoment30.evaluate(doubleArray42);
        double[] doubleArray47 = new double[] {};
        secondMoment30.incrementAll(doubleArray47);
        secondMoment24.incrementAll(doubleArray47);
        secondMoment24.increment((double) 2L);
        org.apache.commons.math.stat.descriptive.moment.Variance variance52 = new org.apache.commons.math.stat.descriptive.moment.Variance(secondMoment24);
        org.apache.commons.math.stat.descriptive.moment.SecondMoment secondMoment53 = new org.apache.commons.math.stat.descriptive.moment.SecondMoment();
        secondMoment53.increment(1.0d);
        double[] doubleArray59 = new double[] { (-1L), 0, 10L };
        secondMoment53.incrementAll(doubleArray59, 0, 0);
        double[] doubleArray65 = new double[] { 10, (byte) 100 };
        double double66 = secondMoment53.evaluate(doubleArray65);
        double double67 = variance52.evaluate(doubleArray65);
        double double69 = variance9.evaluate(doubleArray65, 100.0d);
        long long70 = variance9.getN();
        org.apache.commons.math.stat.descriptive.moment.SecondMoment secondMoment71 = new org.apache.commons.math.stat.descriptive.moment.SecondMoment();
        secondMoment71.increment((double) ' ');
        secondMoment71.increment((double) '4');
        long long76 = secondMoment71.getN();
        org.apache.commons.math.stat.descriptive.moment.Variance variance77 = new org.apache.commons.math.stat.descriptive.moment.Variance(secondMoment71);
        double double78 = variance77.getResult();
        variance77.setBiasCorrected(false);
        double[] doubleArray84 = new double[] { 0, 4704.5d, (short) -1 };
        double double85 = variance77.evaluate(doubleArray84);
        double double88 = variance9.evaluate(doubleArray84, (int) (byte) 1, 0);
        boolean boolean89 = variance9.isBiasCorrected();
        long long90 = variance9.getN();
        org.junit.Assert.assertNotNull(doubleArray16);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray16), "[-1.0, 0.0, 10.0]");
        org.junit.Assert.assertTrue("'" + double29 + "' != '" + 0.5d + "'", double29 == 0.5d);
        org.junit.Assert.assertTrue("'" + double35 + "' != '" + 0.5d + "'", double35 == 0.5d);
        org.junit.Assert.assertNotNull(doubleArray42);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray42), "[-1.0, 0.0, 10.0]");
        org.junit.Assert.assertTrue("'" + double46 + "' != '" + 74.0d + "'", double46 == 74.0d);
        org.junit.Assert.assertNotNull(doubleArray47);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray47), "[]");
        org.junit.Assert.assertNotNull(doubleArray59);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray59), "[-1.0, 0.0, 10.0]");
        org.junit.Assert.assertNotNull(doubleArray65);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray65), "[10.0, 100.0]");
        org.junit.Assert.assertTrue("'" + double66 + "' != '" + 4050.0d + "'", double66 == 4050.0d);
        org.junit.Assert.assertTrue("'" + double67 + "' != '" + 4050.0d + "'", double67 == 4050.0d);
        org.junit.Assert.assertTrue("'" + double69 + "' != '" + 4050.0d + "'", double69 == 4050.0d);
        org.junit.Assert.assertTrue("'" + long70 + "' != '" + 1L + "'", long70 == 1L);
        org.junit.Assert.assertTrue("'" + long76 + "' != '" + 2L + "'", long76 == 2L);
        org.junit.Assert.assertTrue("'" + double78 + "' != '" + 200.0d + "'", double78 == 200.0d);
        org.junit.Assert.assertNotNull(doubleArray84);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray84), "[0.0, 4704.5, -1.0]");
        org.junit.Assert.assertTrue("'" + double85 + "' != '" + 4919339.055555555d + "'", double85 == 4919339.055555555d);
        org.junit.Assert.assertTrue(Double.isNaN(double88));
        org.junit.Assert.assertTrue("'" + boolean89 + "' != '" + true + "'", boolean89 == true);
        org.junit.Assert.assertTrue("'" + long90 + "' != '" + 1L + "'", long90 == 1L);
    }

    @Test
    public void test16571() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest33.test16571");
        org.apache.commons.math.stat.descriptive.moment.SecondMoment secondMoment0 = new org.apache.commons.math.stat.descriptive.moment.SecondMoment();
        secondMoment0.increment((double) ' ');
        org.apache.commons.math.stat.descriptive.moment.Variance variance3 = new org.apache.commons.math.stat.descriptive.moment.Variance(secondMoment0);
        secondMoment0.increment((double) (short) -1);
        secondMoment0.clear();
        double double7 = secondMoment0.getResult();
        secondMoment0.increment(7186.0d);
        secondMoment0.increment((double) 100);
        secondMoment0.clear();
        org.apache.commons.math.stat.descriptive.moment.SecondMoment secondMoment14 = new org.apache.commons.math.stat.descriptive.moment.SecondMoment();
        secondMoment14.increment(1.0d);
        double[] doubleArray20 = new double[] { (-1L), 0, 10L };
        secondMoment14.incrementAll(doubleArray20, 0, 0);
        double[] doubleArray26 = new double[] { 10, (byte) 100 };
        double double27 = secondMoment14.evaluate(doubleArray26);
        long long28 = secondMoment14.getN();
        double double29 = secondMoment14.getResult();
        org.apache.commons.math.stat.descriptive.moment.Variance variance30 = new org.apache.commons.math.stat.descriptive.moment.Variance(true, secondMoment14);
        long long31 = secondMoment14.getN();
        secondMoment14.clear();
        boolean boolean33 = secondMoment0.equals((java.lang.Object) secondMoment14);
        secondMoment14.increment((double) 0);
        secondMoment14.increment(4.42417896506702E16d);
        secondMoment14.increment(0.0d);
        org.junit.Assert.assertTrue(Double.isNaN(double7));
        org.junit.Assert.assertNotNull(doubleArray20);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray20), "[-1.0, 0.0, 10.0]");
        org.junit.Assert.assertNotNull(doubleArray26);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray26), "[10.0, 100.0]");
        org.junit.Assert.assertTrue("'" + double27 + "' != '" + 4050.0d + "'", double27 == 4050.0d);
        org.junit.Assert.assertTrue("'" + long28 + "' != '" + 2L + "'", long28 == 2L);
        org.junit.Assert.assertTrue("'" + double29 + "' != '" + 4050.0d + "'", double29 == 4050.0d);
        org.junit.Assert.assertTrue("'" + long31 + "' != '" + 2L + "'", long31 == 2L);
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + true + "'", boolean33 == true);
    }

    @Test
    public void test16572() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest33.test16572");
        org.apache.commons.math.stat.descriptive.moment.SecondMoment secondMoment0 = new org.apache.commons.math.stat.descriptive.moment.SecondMoment();
        secondMoment0.increment(1.0d);
        double[] doubleArray6 = new double[] { (-1L), 0, 10L };
        secondMoment0.incrementAll(doubleArray6, 0, 0);
        double[] doubleArray12 = new double[] { 10, (byte) 100 };
        double double13 = secondMoment0.evaluate(doubleArray12);
        double double14 = secondMoment0.getResult();
        secondMoment0.increment((double) (short) -1);
        secondMoment0.clear();
        double double18 = secondMoment0.getResult();
        long long19 = secondMoment0.getN();
        secondMoment0.increment(2.638441083253222E14d);
        org.junit.Assert.assertNotNull(doubleArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray6), "[-1.0, 0.0, 10.0]");
        org.junit.Assert.assertNotNull(doubleArray12);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray12), "[10.0, 100.0]");
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 4050.0d + "'", double13 == 4050.0d);
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + 4050.0d + "'", double14 == 4050.0d);
        org.junit.Assert.assertTrue(Double.isNaN(double18));
        org.junit.Assert.assertTrue("'" + long19 + "' != '" + 0L + "'", long19 == 0L);
    }

    @Test
    public void test16573() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest33.test16573");
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
        long long96 = variance19.getN();
        double double97 = variance19.getResult();
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
        org.junit.Assert.assertTrue("'" + long96 + "' != '" + 2L + "'", long96 == 2L);
        org.junit.Assert.assertTrue("'" + double97 + "' != '" + 4050.0d + "'", double97 == 4050.0d);
    }

    @Test
    public void test16574() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest33.test16574");
        org.apache.commons.math.stat.descriptive.moment.SecondMoment secondMoment0 = new org.apache.commons.math.stat.descriptive.moment.SecondMoment();
        secondMoment0.increment(1.0d);
        double[] doubleArray6 = new double[] { (-1L), 0, 10L };
        secondMoment0.incrementAll(doubleArray6, 0, 0);
        org.apache.commons.math.stat.descriptive.moment.Variance variance10 = new org.apache.commons.math.stat.descriptive.moment.Variance(secondMoment0);
        double double11 = variance10.getResult();
        org.apache.commons.math.stat.descriptive.moment.SecondMoment secondMoment12 = new org.apache.commons.math.stat.descriptive.moment.SecondMoment();
        secondMoment12.increment((double) ' ');
        org.apache.commons.math.stat.descriptive.moment.Variance variance15 = new org.apache.commons.math.stat.descriptive.moment.Variance(secondMoment12);
        secondMoment12.increment((double) (short) -1);
        secondMoment12.clear();
        secondMoment12.increment((double) 0L);
        org.apache.commons.math.stat.descriptive.moment.Variance variance21 = new org.apache.commons.math.stat.descriptive.moment.Variance(secondMoment12);
        long long22 = variance21.getN();
        variance21.increment((double) 5L);
        long long25 = variance21.getN();
        org.apache.commons.math.stat.descriptive.moment.SecondMoment secondMoment26 = new org.apache.commons.math.stat.descriptive.moment.SecondMoment();
        secondMoment26.increment((double) ' ');
        org.apache.commons.math.stat.descriptive.moment.Variance variance29 = new org.apache.commons.math.stat.descriptive.moment.Variance(secondMoment26);
        secondMoment26.increment((double) (short) -1);
        secondMoment26.clear();
        secondMoment26.increment((double) 0L);
        org.apache.commons.math.stat.descriptive.moment.Variance variance35 = new org.apache.commons.math.stat.descriptive.moment.Variance(secondMoment26);
        org.apache.commons.math.stat.descriptive.moment.SecondMoment secondMoment36 = new org.apache.commons.math.stat.descriptive.moment.SecondMoment();
        secondMoment36.increment(1.0d);
        double[] doubleArray42 = new double[] { (-1L), 0, 10L };
        secondMoment36.incrementAll(doubleArray42, 0, 0);
        variance35.incrementAll(doubleArray42);
        long long47 = variance35.getN();
        variance35.clear();
        org.apache.commons.math.stat.descriptive.moment.SecondMoment secondMoment49 = new org.apache.commons.math.stat.descriptive.moment.SecondMoment();
        secondMoment49.increment(1.0d);
        secondMoment49.increment((double) (short) 0);
        double double54 = secondMoment49.getResult();
        org.apache.commons.math.stat.descriptive.moment.SecondMoment secondMoment55 = new org.apache.commons.math.stat.descriptive.moment.SecondMoment();
        secondMoment55.increment(1.0d);
        secondMoment55.increment((double) (short) 0);
        double double60 = secondMoment55.getResult();
        org.apache.commons.math.stat.descriptive.moment.SecondMoment secondMoment61 = new org.apache.commons.math.stat.descriptive.moment.SecondMoment();
        secondMoment61.increment(1.0d);
        double[] doubleArray67 = new double[] { (-1L), 0, 10L };
        secondMoment61.incrementAll(doubleArray67, 0, 0);
        double double71 = secondMoment55.evaluate(doubleArray67);
        double[] doubleArray72 = new double[] {};
        secondMoment55.incrementAll(doubleArray72);
        secondMoment49.incrementAll(doubleArray72);
        double double75 = variance35.evaluate(doubleArray72);
        variance21.incrementAll(doubleArray72);
        // The following exception was thrown during execution in test generation
        try {
            variance10.incrementAll(doubleArray72, (int) '#', 10);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: begin + length > values.length");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(doubleArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray6), "[-1.0, 0.0, 10.0]");
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 0.0d + "'", double11 == 0.0d);
        org.junit.Assert.assertTrue("'" + long22 + "' != '" + 1L + "'", long22 == 1L);
        org.junit.Assert.assertTrue("'" + long25 + "' != '" + 1L + "'", long25 == 1L);
        org.junit.Assert.assertNotNull(doubleArray42);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray42), "[-1.0, 0.0, 10.0]");
        org.junit.Assert.assertTrue("'" + long47 + "' != '" + 1L + "'", long47 == 1L);
        org.junit.Assert.assertTrue("'" + double54 + "' != '" + 0.5d + "'", double54 == 0.5d);
        org.junit.Assert.assertTrue("'" + double60 + "' != '" + 0.5d + "'", double60 == 0.5d);
        org.junit.Assert.assertNotNull(doubleArray67);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray67), "[-1.0, 0.0, 10.0]");
        org.junit.Assert.assertTrue("'" + double71 + "' != '" + 74.0d + "'", double71 == 74.0d);
        org.junit.Assert.assertNotNull(doubleArray72);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray72), "[]");
        org.junit.Assert.assertTrue(Double.isNaN(double75));
    }

    @Test
    public void test16575() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest33.test16575");
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
        long long29 = secondMoment1.getN();
        secondMoment1.increment((double) 0L);
        secondMoment1.clear();
        secondMoment1.increment(4062264.9166666665d);
        org.apache.commons.math.stat.descriptive.moment.Variance variance35 = new org.apache.commons.math.stat.descriptive.moment.Variance(true, secondMoment1);
        boolean boolean36 = variance35.isBiasCorrected();
        org.junit.Assert.assertTrue(Double.isNaN(double8));
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + 0.5d + "'", double14 == 0.5d);
        org.junit.Assert.assertNotNull(doubleArray21);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray21), "[-1.0, 0.0, 10.0]");
        org.junit.Assert.assertTrue("'" + double25 + "' != '" + 74.0d + "'", double25 == 74.0d);
        org.junit.Assert.assertTrue("'" + long29 + "' != '" + 0L + "'", long29 == 0L);
        org.junit.Assert.assertTrue("'" + boolean36 + "' != '" + true + "'", boolean36 == true);
    }

    @Test
    public void test16576() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest33.test16576");
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
        variance0.increment((double) 10);
        org.apache.commons.math.stat.descriptive.moment.SecondMoment secondMoment44 = new org.apache.commons.math.stat.descriptive.moment.SecondMoment();
        secondMoment44.increment(1.0d);
        double[] doubleArray50 = new double[] { (-1L), 0, 10L };
        secondMoment44.incrementAll(doubleArray50, 0, 0);
        org.apache.commons.math.stat.descriptive.moment.Variance variance54 = new org.apache.commons.math.stat.descriptive.moment.Variance(secondMoment44);
        org.apache.commons.math.stat.descriptive.moment.SecondMoment secondMoment55 = new org.apache.commons.math.stat.descriptive.moment.SecondMoment();
        secondMoment55.increment(1.0d);
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
        double double77 = secondMoment55.evaluate(doubleArray75);
        double double78 = variance54.evaluate(doubleArray75);
        variance0.incrementAll(doubleArray75);
        variance0.increment((double) (byte) 0);
        boolean boolean82 = variance0.isBiasCorrected();
        long long83 = variance0.getN();
        long long84 = variance0.getN();
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
        org.junit.Assert.assertNotNull(doubleArray50);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray50), "[-1.0, 0.0, 10.0]");
        org.junit.Assert.assertTrue("'" + double63 + "' != '" + 0.5d + "'", double63 == 0.5d);
        org.junit.Assert.assertNotNull(doubleArray70);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray70), "[-1.0, 0.0, 10.0]");
        org.junit.Assert.assertTrue("'" + double74 + "' != '" + 74.0d + "'", double74 == 74.0d);
        org.junit.Assert.assertNotNull(doubleArray75);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray75), "[]");
        org.junit.Assert.assertTrue("'" + double77 + "' != '" + 0.0d + "'", double77 == 0.0d);
        org.junit.Assert.assertTrue(Double.isNaN(double78));
        org.junit.Assert.assertTrue("'" + boolean82 + "' != '" + true + "'", boolean82 == true);
        org.junit.Assert.assertTrue("'" + long83 + "' != '" + 5L + "'", long83 == 5L);
        org.junit.Assert.assertTrue("'" + long84 + "' != '" + 5L + "'", long84 == 5L);
    }

    @Test
    public void test16577() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest33.test16577");
        org.apache.commons.math.stat.descriptive.moment.SecondMoment secondMoment0 = new org.apache.commons.math.stat.descriptive.moment.SecondMoment();
        secondMoment0.increment(1.0d);
        secondMoment0.increment((double) (short) 0);
        double double5 = secondMoment0.getResult();
        double double6 = secondMoment0.getResult();
        secondMoment0.increment((double) '#');
        long long9 = secondMoment0.getN();
        long long10 = secondMoment0.getN();
        java.lang.Class<?> wildcardClass11 = secondMoment0.getClass();
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.5d + "'", double5 == 0.5d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.5d + "'", double6 == 0.5d);
        org.junit.Assert.assertTrue("'" + long9 + "' != '" + 3L + "'", long9 == 3L);
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + 3L + "'", long10 == 3L);
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test16578() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest33.test16578");
        org.apache.commons.math.stat.descriptive.moment.SecondMoment secondMoment0 = new org.apache.commons.math.stat.descriptive.moment.SecondMoment();
        secondMoment0.increment(1.0d);
        secondMoment0.increment((double) 10L);
        org.apache.commons.math.stat.descriptive.moment.SecondMoment secondMoment5 = new org.apache.commons.math.stat.descriptive.moment.SecondMoment();
        secondMoment5.increment(1.0d);
        secondMoment5.increment((double) (short) 0);
        double double10 = secondMoment5.getResult();
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
        secondMoment5.incrementAll(doubleArray28);
        secondMoment5.increment((double) 2L);
        org.apache.commons.math.stat.descriptive.moment.Variance variance33 = new org.apache.commons.math.stat.descriptive.moment.Variance(secondMoment5);
        org.apache.commons.math.stat.descriptive.moment.SecondMoment secondMoment34 = new org.apache.commons.math.stat.descriptive.moment.SecondMoment();
        secondMoment34.increment(1.0d);
        double[] doubleArray40 = new double[] { (-1L), 0, 10L };
        secondMoment34.incrementAll(doubleArray40, 0, 0);
        double[] doubleArray46 = new double[] { 10, (byte) 100 };
        double double47 = secondMoment34.evaluate(doubleArray46);
        double double48 = variance33.evaluate(doubleArray46);
        double double49 = secondMoment0.evaluate(doubleArray46);
        secondMoment0.increment(5304.666666666667d);
        double double52 = secondMoment0.getResult();
        secondMoment0.increment(4049.9999999999995d);
        secondMoment0.increment(704.7500000000001d);
        long long57 = secondMoment0.getN();
        secondMoment0.increment(1.5803546165550332E27d);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 0.5d + "'", double10 == 0.5d);
        org.junit.Assert.assertTrue("'" + double16 + "' != '" + 0.5d + "'", double16 == 0.5d);
        org.junit.Assert.assertNotNull(doubleArray23);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray23), "[-1.0, 0.0, 10.0]");
        org.junit.Assert.assertTrue("'" + double27 + "' != '" + 74.0d + "'", double27 == 74.0d);
        org.junit.Assert.assertNotNull(doubleArray28);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray28), "[]");
        org.junit.Assert.assertNotNull(doubleArray40);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray40), "[-1.0, 0.0, 10.0]");
        org.junit.Assert.assertNotNull(doubleArray46);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray46), "[10.0, 100.0]");
        org.junit.Assert.assertTrue("'" + double47 + "' != '" + 4050.0d + "'", double47 == 4050.0d);
        org.junit.Assert.assertTrue("'" + double48 + "' != '" + 4050.0d + "'", double48 == 4050.0d);
        org.junit.Assert.assertTrue("'" + double49 + "' != '" + 4050.0d + "'", double49 == 4050.0d);
        org.junit.Assert.assertTrue("'" + double52 + "' != '" + 1.8376716740740743E7d + "'", double52 == 1.8376716740740743E7d);
        org.junit.Assert.assertTrue("'" + long57 + "' != '" + 5L + "'", long57 == 5L);
    }

    @Test
    public void test16579() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest33.test16579");
        org.apache.commons.math.stat.descriptive.moment.SecondMoment secondMoment1 = new org.apache.commons.math.stat.descriptive.moment.SecondMoment();
        secondMoment1.increment(1.0d);
        double[] doubleArray7 = new double[] { (-1L), 0, 10L };
        secondMoment1.incrementAll(doubleArray7, 0, 0);
        double[] doubleArray13 = new double[] { 10, (byte) 100 };
        double double14 = secondMoment1.evaluate(doubleArray13);
        double double15 = secondMoment1.getResult();
        org.apache.commons.math.stat.descriptive.moment.Variance variance16 = new org.apache.commons.math.stat.descriptive.moment.Variance(false, secondMoment1);
        double double17 = secondMoment1.getResult();
        secondMoment1.clear();
        double double19 = secondMoment1.getResult();
        secondMoment1.clear();
        org.junit.Assert.assertNotNull(doubleArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray7), "[-1.0, 0.0, 10.0]");
        org.junit.Assert.assertNotNull(doubleArray13);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray13), "[10.0, 100.0]");
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + 4050.0d + "'", double14 == 4050.0d);
        org.junit.Assert.assertTrue("'" + double15 + "' != '" + 4050.0d + "'", double15 == 4050.0d);
        org.junit.Assert.assertTrue("'" + double17 + "' != '" + 4050.0d + "'", double17 == 4050.0d);
        org.junit.Assert.assertTrue(Double.isNaN(double19));
    }

    @Test
    public void test16580() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest33.test16580");
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
        org.apache.commons.math.stat.descriptive.moment.SecondMoment secondMoment44 = new org.apache.commons.math.stat.descriptive.moment.SecondMoment();
        secondMoment44.increment((double) ' ');
        double double47 = secondMoment44.getResult();
        boolean boolean48 = variance28.equals((java.lang.Object) double47);
        long long49 = variance28.getN();
        variance28.setBiasCorrected(true);
        variance28.clear();
        double double53 = variance28.getResult();
        org.apache.commons.math.stat.descriptive.moment.SecondMoment secondMoment55 = new org.apache.commons.math.stat.descriptive.moment.SecondMoment();
        secondMoment55.increment(1.0d);
        org.apache.commons.math.stat.descriptive.moment.SecondMoment secondMoment58 = new org.apache.commons.math.stat.descriptive.moment.SecondMoment();
        secondMoment58.increment(1.0d);
        double[] doubleArray64 = new double[] { (-1L), 0, 10L };
        secondMoment58.incrementAll(doubleArray64, 0, 0);
        double[] doubleArray70 = new double[] { 10, (byte) 100 };
        double double71 = secondMoment58.evaluate(doubleArray70);
        double double72 = secondMoment58.getResult();
        secondMoment58.increment((double) (short) -1);
        double[] doubleArray76 = new double[] { (short) 1 };
        secondMoment58.incrementAll(doubleArray76);
        secondMoment55.incrementAll(doubleArray76);
        secondMoment55.increment((-1.0d));
        org.apache.commons.math.stat.descriptive.moment.Variance variance81 = new org.apache.commons.math.stat.descriptive.moment.Variance(false, secondMoment55);
        secondMoment55.increment(3.889038153298707E13d);
        boolean boolean84 = variance28.equals((java.lang.Object) secondMoment55);
        org.apache.commons.math.stat.descriptive.moment.Variance variance85 = new org.apache.commons.math.stat.descriptive.moment.Variance(secondMoment55);
        long long86 = secondMoment55.getN();
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
        org.junit.Assert.assertTrue("'" + double47 + "' != '" + 0.0d + "'", double47 == 0.0d);
        org.junit.Assert.assertTrue("'" + boolean48 + "' != '" + false + "'", boolean48 == false);
        org.junit.Assert.assertTrue("'" + long49 + "' != '" + 3L + "'", long49 == 3L);
        org.junit.Assert.assertTrue("'" + double53 + "' != '" + 1.0d + "'", double53 == 1.0d);
        org.junit.Assert.assertNotNull(doubleArray64);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray64), "[-1.0, 0.0, 10.0]");
        org.junit.Assert.assertNotNull(doubleArray70);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray70), "[10.0, 100.0]");
        org.junit.Assert.assertTrue("'" + double71 + "' != '" + 4050.0d + "'", double71 == 4050.0d);
        org.junit.Assert.assertTrue("'" + double72 + "' != '" + 4050.0d + "'", double72 == 4050.0d);
        org.junit.Assert.assertNotNull(doubleArray76);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray76), "[1.0]");
        org.junit.Assert.assertTrue("'" + boolean84 + "' != '" + false + "'", boolean84 == false);
        org.junit.Assert.assertTrue("'" + long86 + "' != '" + 4L + "'", long86 == 4L);
    }

    @Test
    public void test16581() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest33.test16581");
        org.apache.commons.math.stat.descriptive.moment.SecondMoment secondMoment0 = new org.apache.commons.math.stat.descriptive.moment.SecondMoment();
        secondMoment0.increment((double) ' ');
        org.apache.commons.math.stat.descriptive.moment.Variance variance3 = new org.apache.commons.math.stat.descriptive.moment.Variance(secondMoment0);
        secondMoment0.increment((double) '4');
        double double6 = secondMoment0.getResult();
        secondMoment0.increment((double) (short) 0);
        secondMoment0.clear();
        secondMoment0.clear();
        secondMoment0.clear();
        org.apache.commons.math.stat.descriptive.moment.Variance variance12 = new org.apache.commons.math.stat.descriptive.moment.Variance(secondMoment0);
        double double13 = variance12.getResult();
        variance12.increment(1.0932300666666664E7d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 200.0d + "'", double6 == 200.0d);
        org.junit.Assert.assertTrue(Double.isNaN(double13));
    }

    @Test
    public void test16582() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest33.test16582");
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
        org.apache.commons.math.stat.descriptive.moment.Variance variance20 = new org.apache.commons.math.stat.descriptive.moment.Variance();
        org.apache.commons.math.stat.descriptive.moment.SecondMoment secondMoment21 = new org.apache.commons.math.stat.descriptive.moment.SecondMoment();
        secondMoment21.increment(1.0d);
        secondMoment21.increment((double) (short) 0);
        double double26 = secondMoment21.getResult();
        org.apache.commons.math.stat.descriptive.moment.SecondMoment secondMoment27 = new org.apache.commons.math.stat.descriptive.moment.SecondMoment();
        secondMoment27.increment(1.0d);
        double[] doubleArray33 = new double[] { (-1L), 0, 10L };
        secondMoment27.incrementAll(doubleArray33, 0, 0);
        double double37 = secondMoment21.evaluate(doubleArray33);
        double[] doubleArray38 = new double[] {};
        secondMoment21.incrementAll(doubleArray38);
        double double42 = variance20.evaluate(doubleArray38, (int) (byte) 0, 0);
        long long43 = variance20.getN();
        org.apache.commons.math.stat.descriptive.moment.SecondMoment secondMoment44 = new org.apache.commons.math.stat.descriptive.moment.SecondMoment();
        secondMoment44.increment(1.0d);
        secondMoment44.increment((double) (short) 0);
        double double49 = secondMoment44.getResult();
        org.apache.commons.math.stat.descriptive.moment.SecondMoment secondMoment50 = new org.apache.commons.math.stat.descriptive.moment.SecondMoment();
        secondMoment50.increment(1.0d);
        double[] doubleArray56 = new double[] { (-1L), 0, 10L };
        secondMoment50.incrementAll(doubleArray56, 0, 0);
        double double60 = secondMoment44.evaluate(doubleArray56);
        variance20.incrementAll(doubleArray56);
        long long62 = variance20.getN();
        variance20.setBiasCorrected(true);
        org.apache.commons.math.stat.descriptive.moment.SecondMoment secondMoment65 = new org.apache.commons.math.stat.descriptive.moment.SecondMoment();
        secondMoment65.increment(1.0d);
        org.apache.commons.math.stat.descriptive.moment.SecondMoment secondMoment68 = new org.apache.commons.math.stat.descriptive.moment.SecondMoment();
        secondMoment68.increment(1.0d);
        double[] doubleArray74 = new double[] { (-1L), 0, 10L };
        secondMoment68.incrementAll(doubleArray74, 0, 0);
        double[] doubleArray80 = new double[] { 10, (byte) 100 };
        double double81 = secondMoment68.evaluate(doubleArray80);
        double double82 = secondMoment65.evaluate(doubleArray80);
        variance20.incrementAll(doubleArray80);
        secondMoment1.incrementAll(doubleArray80);
        long long85 = secondMoment1.getN();
        secondMoment1.clear();
        org.apache.commons.math.stat.descriptive.moment.Variance variance87 = new org.apache.commons.math.stat.descriptive.moment.Variance(secondMoment1);
        variance87.increment(1801.0d);
        boolean boolean90 = variance87.isBiasCorrected();
        java.lang.Class<?> wildcardClass91 = variance87.getClass();
        org.junit.Assert.assertNotNull(doubleArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray7), "[-1.0, 0.0, 10.0]");
        org.junit.Assert.assertNotNull(doubleArray13);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray13), "[10.0, 100.0]");
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + 4050.0d + "'", double14 == 4050.0d);
        org.junit.Assert.assertTrue("'" + long15 + "' != '" + 2L + "'", long15 == 2L);
        org.junit.Assert.assertTrue(Double.isNaN(double17));
        org.junit.Assert.assertTrue("'" + double26 + "' != '" + 0.5d + "'", double26 == 0.5d);
        org.junit.Assert.assertNotNull(doubleArray33);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray33), "[-1.0, 0.0, 10.0]");
        org.junit.Assert.assertTrue("'" + double37 + "' != '" + 74.0d + "'", double37 == 74.0d);
        org.junit.Assert.assertNotNull(doubleArray38);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray38), "[]");
        org.junit.Assert.assertTrue(Double.isNaN(double42));
        org.junit.Assert.assertTrue("'" + long43 + "' != '" + 0L + "'", long43 == 0L);
        org.junit.Assert.assertTrue("'" + double49 + "' != '" + 0.5d + "'", double49 == 0.5d);
        org.junit.Assert.assertNotNull(doubleArray56);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray56), "[-1.0, 0.0, 10.0]");
        org.junit.Assert.assertTrue("'" + double60 + "' != '" + 74.0d + "'", double60 == 74.0d);
        org.junit.Assert.assertTrue("'" + long62 + "' != '" + 3L + "'", long62 == 3L);
        org.junit.Assert.assertNotNull(doubleArray74);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray74), "[-1.0, 0.0, 10.0]");
        org.junit.Assert.assertNotNull(doubleArray80);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray80), "[10.0, 100.0]");
        org.junit.Assert.assertTrue("'" + double81 + "' != '" + 4050.0d + "'", double81 == 4050.0d);
        org.junit.Assert.assertTrue("'" + double82 + "' != '" + 4050.0d + "'", double82 == 4050.0d);
        org.junit.Assert.assertTrue("'" + long85 + "' != '" + 2L + "'", long85 == 2L);
        org.junit.Assert.assertTrue("'" + boolean90 + "' != '" + true + "'", boolean90 == true);
        org.junit.Assert.assertNotNull(wildcardClass91);
    }

    @Test
    public void test16583() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest33.test16583");
        org.apache.commons.math.stat.descriptive.moment.SecondMoment secondMoment0 = new org.apache.commons.math.stat.descriptive.moment.SecondMoment();
        secondMoment0.increment((double) ' ');
        org.apache.commons.math.stat.descriptive.moment.Variance variance3 = new org.apache.commons.math.stat.descriptive.moment.Variance(secondMoment0);
        secondMoment0.increment((double) (short) -1);
        secondMoment0.clear();
        secondMoment0.increment((double) 0L);
        org.apache.commons.math.stat.descriptive.moment.Variance variance9 = new org.apache.commons.math.stat.descriptive.moment.Variance(secondMoment0);
        long long10 = variance9.getN();
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
        double double34 = variance9.evaluate(doubleArray31);
        org.apache.commons.math.stat.descriptive.moment.SecondMoment secondMoment35 = new org.apache.commons.math.stat.descriptive.moment.SecondMoment();
        secondMoment35.increment(1.0d);
        org.apache.commons.math.stat.descriptive.moment.SecondMoment secondMoment38 = new org.apache.commons.math.stat.descriptive.moment.SecondMoment();
        secondMoment38.increment(1.0d);
        secondMoment38.increment((double) (short) 0);
        double double43 = secondMoment38.getResult();
        org.apache.commons.math.stat.descriptive.moment.SecondMoment secondMoment44 = new org.apache.commons.math.stat.descriptive.moment.SecondMoment();
        secondMoment44.increment(1.0d);
        double[] doubleArray50 = new double[] { (-1L), 0, 10L };
        secondMoment44.incrementAll(doubleArray50, 0, 0);
        double double54 = secondMoment38.evaluate(doubleArray50);
        double[] doubleArray55 = new double[] {};
        secondMoment38.incrementAll(doubleArray55);
        double double57 = secondMoment35.evaluate(doubleArray55);
        variance9.incrementAll(doubleArray55);
        org.apache.commons.math.stat.descriptive.moment.SecondMoment secondMoment59 = new org.apache.commons.math.stat.descriptive.moment.SecondMoment();
        secondMoment59.increment(1.0d);
        secondMoment59.increment((double) (short) 0);
        double double64 = secondMoment59.getResult();
        org.apache.commons.math.stat.descriptive.moment.SecondMoment secondMoment65 = new org.apache.commons.math.stat.descriptive.moment.SecondMoment();
        secondMoment65.increment(1.0d);
        double[] doubleArray71 = new double[] { (-1L), 0, 10L };
        secondMoment65.incrementAll(doubleArray71, 0, 0);
        double double75 = secondMoment59.evaluate(doubleArray71);
        double double78 = variance9.evaluate(doubleArray71, (int) (byte) 1, 1);
        variance9.clear();
        long long80 = variance9.getN();
        variance9.setBiasCorrected(false);
        long long83 = variance9.getN();
        variance9.increment(0.0d);
        variance9.setBiasCorrected(true);
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + 1L + "'", long10 == 1L);
        org.junit.Assert.assertTrue("'" + double19 + "' != '" + 0.5d + "'", double19 == 0.5d);
        org.junit.Assert.assertNotNull(doubleArray26);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray26), "[-1.0, 0.0, 10.0]");
        org.junit.Assert.assertTrue("'" + double30 + "' != '" + 74.0d + "'", double30 == 74.0d);
        org.junit.Assert.assertNotNull(doubleArray31);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray31), "[]");
        org.junit.Assert.assertTrue("'" + double33 + "' != '" + 0.0d + "'", double33 == 0.0d);
        org.junit.Assert.assertTrue(Double.isNaN(double34));
        org.junit.Assert.assertTrue("'" + double43 + "' != '" + 0.5d + "'", double43 == 0.5d);
        org.junit.Assert.assertNotNull(doubleArray50);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray50), "[-1.0, 0.0, 10.0]");
        org.junit.Assert.assertTrue("'" + double54 + "' != '" + 74.0d + "'", double54 == 74.0d);
        org.junit.Assert.assertNotNull(doubleArray55);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray55), "[]");
        org.junit.Assert.assertTrue("'" + double57 + "' != '" + 0.0d + "'", double57 == 0.0d);
        org.junit.Assert.assertTrue("'" + double64 + "' != '" + 0.5d + "'", double64 == 0.5d);
        org.junit.Assert.assertNotNull(doubleArray71);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray71), "[-1.0, 0.0, 10.0]");
        org.junit.Assert.assertTrue("'" + double75 + "' != '" + 74.0d + "'", double75 == 74.0d);
        org.junit.Assert.assertTrue("'" + double78 + "' != '" + 0.0d + "'", double78 == 0.0d);
        org.junit.Assert.assertTrue("'" + long80 + "' != '" + 1L + "'", long80 == 1L);
        org.junit.Assert.assertTrue("'" + long83 + "' != '" + 1L + "'", long83 == 1L);
    }

    @Test
    public void test16584() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest33.test16584");
        org.apache.commons.math.stat.descriptive.moment.SecondMoment secondMoment0 = new org.apache.commons.math.stat.descriptive.moment.SecondMoment();
        secondMoment0.increment(1.0d);
        double[] doubleArray6 = new double[] { (-1L), 0, 10L };
        secondMoment0.incrementAll(doubleArray6, 0, 0);
        double[] doubleArray12 = new double[] { 10, (byte) 100 };
        double double13 = secondMoment0.evaluate(doubleArray12);
        secondMoment0.clear();
        double double15 = secondMoment0.getResult();
        secondMoment0.clear();
        double double17 = secondMoment0.getResult();
        secondMoment0.increment(4.148250623048679E13d);
        secondMoment0.increment(422.08333333333337d);
        org.junit.Assert.assertNotNull(doubleArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray6), "[-1.0, 0.0, 10.0]");
        org.junit.Assert.assertNotNull(doubleArray12);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray12), "[10.0, 100.0]");
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 4050.0d + "'", double13 == 4050.0d);
        org.junit.Assert.assertTrue(Double.isNaN(double15));
        org.junit.Assert.assertTrue(Double.isNaN(double17));
    }

    @Test
    public void test16585() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest33.test16585");
        org.apache.commons.math.stat.descriptive.moment.SecondMoment secondMoment1 = new org.apache.commons.math.stat.descriptive.moment.SecondMoment();
        secondMoment1.increment((double) ' ');
        org.apache.commons.math.stat.descriptive.moment.Variance variance4 = new org.apache.commons.math.stat.descriptive.moment.Variance(secondMoment1);
        secondMoment1.increment((double) (short) -1);
        secondMoment1.clear();
        secondMoment1.increment((double) 'a');
        org.apache.commons.math.stat.descriptive.moment.SecondMoment secondMoment10 = new org.apache.commons.math.stat.descriptive.moment.SecondMoment();
        secondMoment10.increment(1.0d);
        secondMoment10.increment((double) (short) 0);
        boolean boolean15 = secondMoment1.equals((java.lang.Object) secondMoment10);
        org.apache.commons.math.stat.descriptive.moment.SecondMoment secondMoment16 = new org.apache.commons.math.stat.descriptive.moment.SecondMoment();
        secondMoment16.increment(1.0d);
        org.apache.commons.math.stat.descriptive.moment.SecondMoment secondMoment19 = new org.apache.commons.math.stat.descriptive.moment.SecondMoment();
        secondMoment19.increment(1.0d);
        double[] doubleArray25 = new double[] { (-1L), 0, 10L };
        secondMoment19.incrementAll(doubleArray25, 0, 0);
        double[] doubleArray31 = new double[] { 10, (byte) 100 };
        double double32 = secondMoment19.evaluate(doubleArray31);
        double double33 = secondMoment16.evaluate(doubleArray31);
        secondMoment1.incrementAll(doubleArray31);
        secondMoment1.increment((double) 10.0f);
        org.apache.commons.math.stat.descriptive.moment.SecondMoment secondMoment38 = new org.apache.commons.math.stat.descriptive.moment.SecondMoment();
        secondMoment38.increment((double) ' ');
        org.apache.commons.math.stat.descriptive.moment.Variance variance41 = new org.apache.commons.math.stat.descriptive.moment.Variance(secondMoment38);
        secondMoment38.increment((double) (short) -1);
        long long44 = secondMoment38.getN();
        org.apache.commons.math.stat.descriptive.moment.Variance variance45 = new org.apache.commons.math.stat.descriptive.moment.Variance(false, secondMoment38);
        org.apache.commons.math.stat.descriptive.moment.Variance variance46 = new org.apache.commons.math.stat.descriptive.moment.Variance(secondMoment38);
        double double47 = secondMoment38.getResult();
        secondMoment38.clear();
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
        double double91 = secondMoment38.evaluate(doubleArray85);
        secondMoment1.incrementAll(doubleArray85);
        long long93 = secondMoment1.getN();
        double double94 = secondMoment1.getResult();
        org.apache.commons.math.stat.descriptive.moment.Variance variance95 = new org.apache.commons.math.stat.descriptive.moment.Variance(true, secondMoment1);
        long long96 = variance95.getN();
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertNotNull(doubleArray25);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray25), "[-1.0, 0.0, 10.0]");
        org.junit.Assert.assertNotNull(doubleArray31);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray31), "[10.0, 100.0]");
        org.junit.Assert.assertTrue("'" + double32 + "' != '" + 4050.0d + "'", double32 == 4050.0d);
        org.junit.Assert.assertTrue("'" + double33 + "' != '" + 4050.0d + "'", double33 == 4050.0d);
        org.junit.Assert.assertTrue("'" + long44 + "' != '" + 2L + "'", long44 == 2L);
        org.junit.Assert.assertTrue("'" + double47 + "' != '" + 544.5d + "'", double47 == 544.5d);
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
        org.junit.Assert.assertTrue("'" + double91 + "' != '" + 74.0d + "'", double91 == 74.0d);
        org.junit.Assert.assertTrue("'" + long93 + "' != '" + 7L + "'", long93 == 7L);
        org.junit.Assert.assertTrue("'" + double94 + "' != '" + 12413.42857142857d + "'", double94 == 12413.42857142857d);
        org.junit.Assert.assertTrue("'" + long96 + "' != '" + 7L + "'", long96 == 7L);
    }

    @Test
    public void test16586() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest33.test16586");
        org.apache.commons.math.stat.descriptive.moment.SecondMoment secondMoment0 = new org.apache.commons.math.stat.descriptive.moment.SecondMoment();
        secondMoment0.increment(1.0d);
        org.apache.commons.math.stat.descriptive.moment.SecondMoment secondMoment3 = new org.apache.commons.math.stat.descriptive.moment.SecondMoment();
        secondMoment3.increment(1.0d);
        double[] doubleArray9 = new double[] { (-1L), 0, 10L };
        secondMoment3.incrementAll(doubleArray9, 0, 0);
        double[] doubleArray15 = new double[] { 10, (byte) 100 };
        double double16 = secondMoment3.evaluate(doubleArray15);
        double double17 = secondMoment3.getResult();
        secondMoment3.increment((double) (short) -1);
        double[] doubleArray21 = new double[] { (short) 1 };
        secondMoment3.incrementAll(doubleArray21);
        secondMoment0.incrementAll(doubleArray21);
        secondMoment0.clear();
        secondMoment0.clear();
        org.apache.commons.math.stat.descriptive.moment.Variance variance26 = new org.apache.commons.math.stat.descriptive.moment.Variance(secondMoment0);
        long long27 = variance26.getN();
        org.apache.commons.math.stat.descriptive.moment.SecondMoment secondMoment30 = new org.apache.commons.math.stat.descriptive.moment.SecondMoment();
        secondMoment30.increment((double) ' ');
        org.apache.commons.math.stat.descriptive.moment.Variance variance33 = new org.apache.commons.math.stat.descriptive.moment.Variance(secondMoment30);
        secondMoment30.increment((double) (short) -1);
        long long36 = secondMoment30.getN();
        double double37 = secondMoment30.getResult();
        org.apache.commons.math.stat.descriptive.moment.Variance variance38 = new org.apache.commons.math.stat.descriptive.moment.Variance(false, secondMoment30);
        org.apache.commons.math.stat.descriptive.moment.Variance variance39 = new org.apache.commons.math.stat.descriptive.moment.Variance(false, secondMoment30);
        long long40 = secondMoment30.getN();
        secondMoment30.increment(482.66666666666663d);
        double double43 = secondMoment30.getResult();
        org.apache.commons.math.stat.descriptive.moment.SecondMoment secondMoment44 = new org.apache.commons.math.stat.descriptive.moment.SecondMoment();
        secondMoment44.increment(1.0d);
        secondMoment44.clear();
        double double48 = secondMoment44.getResult();
        org.apache.commons.math.stat.descriptive.moment.SecondMoment secondMoment49 = new org.apache.commons.math.stat.descriptive.moment.SecondMoment();
        secondMoment49.increment(1.0d);
        secondMoment49.increment((double) (short) 0);
        double double54 = secondMoment49.getResult();
        org.apache.commons.math.stat.descriptive.moment.SecondMoment secondMoment55 = new org.apache.commons.math.stat.descriptive.moment.SecondMoment();
        secondMoment55.increment(1.0d);
        double[] doubleArray61 = new double[] { (-1L), 0, 10L };
        secondMoment55.incrementAll(doubleArray61, 0, 0);
        double double65 = secondMoment49.evaluate(doubleArray61);
        double double66 = secondMoment44.evaluate(doubleArray61);
        secondMoment30.incrementAll(doubleArray61);
        // The following exception was thrown during execution in test generation
        try {
            double double71 = variance26.evaluate(doubleArray61, 6.222464933786481E14d, (int) (short) 10, (int) (byte) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: begin + length > values.length");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(doubleArray9);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray9), "[-1.0, 0.0, 10.0]");
        org.junit.Assert.assertNotNull(doubleArray15);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray15), "[10.0, 100.0]");
        org.junit.Assert.assertTrue("'" + double16 + "' != '" + 4050.0d + "'", double16 == 4050.0d);
        org.junit.Assert.assertTrue("'" + double17 + "' != '" + 4050.0d + "'", double17 == 4050.0d);
        org.junit.Assert.assertNotNull(doubleArray21);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray21), "[1.0]");
        org.junit.Assert.assertTrue("'" + long27 + "' != '" + 0L + "'", long27 == 0L);
        org.junit.Assert.assertTrue("'" + long36 + "' != '" + 2L + "'", long36 == 2L);
        org.junit.Assert.assertTrue("'" + double37 + "' != '" + 544.5d + "'", double37 == 544.5d);
        org.junit.Assert.assertTrue("'" + long40 + "' != '" + 2L + "'", long40 == 2L);
        org.junit.Assert.assertTrue("'" + double43 + "' != '" + 146040.96296296292d + "'", double43 == 146040.96296296292d);
        org.junit.Assert.assertTrue(Double.isNaN(double48));
        org.junit.Assert.assertTrue("'" + double54 + "' != '" + 0.5d + "'", double54 == 0.5d);
        org.junit.Assert.assertNotNull(doubleArray61);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray61), "[-1.0, 0.0, 10.0]");
        org.junit.Assert.assertTrue("'" + double65 + "' != '" + 74.0d + "'", double65 == 74.0d);
        org.junit.Assert.assertTrue("'" + double66 + "' != '" + 74.0d + "'", double66 == 74.0d);
    }

    @Test
    public void test16587() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest33.test16587");
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
        org.apache.commons.math.stat.descriptive.moment.Variance variance21 = new org.apache.commons.math.stat.descriptive.moment.Variance(secondMoment18);
        secondMoment18.increment((double) (short) -1);
        secondMoment18.clear();
        secondMoment18.increment((double) 0L);
        org.apache.commons.math.stat.descriptive.moment.Variance variance27 = new org.apache.commons.math.stat.descriptive.moment.Variance(secondMoment18);
        org.apache.commons.math.stat.descriptive.moment.SecondMoment secondMoment28 = new org.apache.commons.math.stat.descriptive.moment.SecondMoment();
        secondMoment28.increment(1.0d);
        secondMoment28.increment((double) (short) 0);
        double double33 = secondMoment28.getResult();
        org.apache.commons.math.stat.descriptive.moment.SecondMoment secondMoment34 = new org.apache.commons.math.stat.descriptive.moment.SecondMoment();
        secondMoment34.increment(1.0d);
        double[] doubleArray40 = new double[] { (-1L), 0, 10L };
        secondMoment34.incrementAll(doubleArray40, 0, 0);
        double double44 = secondMoment28.evaluate(doubleArray40);
        double double45 = secondMoment18.evaluate(doubleArray40);
        org.apache.commons.math.stat.descriptive.moment.SecondMoment secondMoment46 = new org.apache.commons.math.stat.descriptive.moment.SecondMoment();
        secondMoment46.increment(1.0d);
        double[] doubleArray52 = new double[] { (-1L), 0, 10L };
        secondMoment46.incrementAll(doubleArray52, 0, 0);
        double[] doubleArray58 = new double[] { 10, (byte) 100 };
        double double59 = secondMoment46.evaluate(doubleArray58);
        double double60 = secondMoment46.getResult();
        secondMoment46.increment((double) (short) -1);
        double[] doubleArray64 = new double[] { (short) 1 };
        secondMoment46.incrementAll(doubleArray64);
        double double66 = secondMoment18.evaluate(doubleArray64);
        double double67 = secondMoment1.evaluate(doubleArray64);
        org.apache.commons.math.stat.descriptive.moment.Variance variance68 = new org.apache.commons.math.stat.descriptive.moment.Variance(secondMoment1);
        double double69 = variance68.getResult();
        double double70 = variance68.getResult();
        variance68.clear();
        boolean boolean72 = variance68.isBiasCorrected();
        org.junit.Assert.assertNotNull(doubleArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray7), "[-1.0, 0.0, 10.0]");
        org.junit.Assert.assertNotNull(doubleArray13);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray13), "[10.0, 100.0]");
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + 4050.0d + "'", double14 == 4050.0d);
        org.junit.Assert.assertTrue("'" + double15 + "' != '" + 4050.0d + "'", double15 == 4050.0d);
        org.junit.Assert.assertTrue("'" + long17 + "' != '" + 2L + "'", long17 == 2L);
        org.junit.Assert.assertTrue("'" + double33 + "' != '" + 0.5d + "'", double33 == 0.5d);
        org.junit.Assert.assertNotNull(doubleArray40);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray40), "[-1.0, 0.0, 10.0]");
        org.junit.Assert.assertTrue("'" + double44 + "' != '" + 74.0d + "'", double44 == 74.0d);
        org.junit.Assert.assertTrue("'" + double45 + "' != '" + 74.0d + "'", double45 == 74.0d);
        org.junit.Assert.assertNotNull(doubleArray52);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray52), "[-1.0, 0.0, 10.0]");
        org.junit.Assert.assertNotNull(doubleArray58);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray58), "[10.0, 100.0]");
        org.junit.Assert.assertTrue("'" + double59 + "' != '" + 4050.0d + "'", double59 == 4050.0d);
        org.junit.Assert.assertTrue("'" + double60 + "' != '" + 4050.0d + "'", double60 == 4050.0d);
        org.junit.Assert.assertNotNull(doubleArray64);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray64), "[1.0]");
        org.junit.Assert.assertTrue("'" + double66 + "' != '" + 0.0d + "'", double66 == 0.0d);
        org.junit.Assert.assertTrue("'" + double67 + "' != '" + 0.0d + "'", double67 == 0.0d);
        org.junit.Assert.assertTrue("'" + double69 + "' != '" + 0.0d + "'", double69 == 0.0d);
        org.junit.Assert.assertTrue("'" + double70 + "' != '" + 0.0d + "'", double70 == 0.0d);
        org.junit.Assert.assertTrue("'" + boolean72 + "' != '" + true + "'", boolean72 == true);
    }

    @Test
    public void test16588() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest33.test16588");
        org.apache.commons.math.stat.descriptive.moment.SecondMoment secondMoment0 = new org.apache.commons.math.stat.descriptive.moment.SecondMoment();
        secondMoment0.increment((double) ' ');
        secondMoment0.increment((double) (short) 10);
        long long5 = secondMoment0.getN();
        secondMoment0.clear();
        double double7 = secondMoment0.getResult();
        secondMoment0.clear();
        secondMoment0.clear();
        double double10 = secondMoment0.getResult();
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 2L + "'", long5 == 2L);
        org.junit.Assert.assertTrue(Double.isNaN(double7));
        org.junit.Assert.assertTrue(Double.isNaN(double10));
    }

    @Test
    public void test16589() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest33.test16589");
        org.apache.commons.math.stat.descriptive.moment.SecondMoment secondMoment1 = new org.apache.commons.math.stat.descriptive.moment.SecondMoment();
        secondMoment1.increment(1.0d);
        secondMoment1.increment((double) (short) 0);
        long long6 = secondMoment1.getN();
        org.apache.commons.math.stat.descriptive.moment.Variance variance7 = new org.apache.commons.math.stat.descriptive.moment.Variance(false, secondMoment1);
        org.apache.commons.math.stat.descriptive.moment.SecondMoment secondMoment8 = new org.apache.commons.math.stat.descriptive.moment.SecondMoment();
        secondMoment8.increment(1.0d);
        secondMoment8.increment((double) (short) 0);
        double double13 = secondMoment8.getResult();
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
        secondMoment8.incrementAll(doubleArray31);
        secondMoment8.increment((double) 2L);
        org.apache.commons.math.stat.descriptive.moment.Variance variance36 = new org.apache.commons.math.stat.descriptive.moment.Variance(secondMoment8);
        org.apache.commons.math.stat.descriptive.moment.SecondMoment secondMoment37 = new org.apache.commons.math.stat.descriptive.moment.SecondMoment();
        secondMoment37.increment(1.0d);
        double[] doubleArray43 = new double[] { (-1L), 0, 10L };
        secondMoment37.incrementAll(doubleArray43, 0, 0);
        double[] doubleArray49 = new double[] { 10, (byte) 100 };
        double double50 = secondMoment37.evaluate(doubleArray49);
        double double51 = variance36.evaluate(doubleArray49);
        long long52 = variance36.getN();
        double double53 = variance36.getResult();
        org.apache.commons.math.stat.descriptive.moment.SecondMoment secondMoment54 = new org.apache.commons.math.stat.descriptive.moment.SecondMoment();
        secondMoment54.increment(1.0d);
        double[] doubleArray60 = new double[] { (-1L), 0, 10L };
        secondMoment54.incrementAll(doubleArray60, 0, 0);
        double[] doubleArray66 = new double[] { 10, (byte) 100 };
        double double67 = secondMoment54.evaluate(doubleArray66);
        double double68 = secondMoment54.getResult();
        secondMoment54.increment((double) (short) -1);
        double[] doubleArray72 = new double[] { (short) 1 };
        secondMoment54.incrementAll(doubleArray72);
        double double74 = variance36.evaluate(doubleArray72);
        double double77 = secondMoment1.evaluate(doubleArray72, (int) (short) 1, 0);
        secondMoment1.increment((double) 10);
        org.apache.commons.math.stat.descriptive.moment.Variance variance80 = new org.apache.commons.math.stat.descriptive.moment.Variance(secondMoment1);
        secondMoment1.increment(29180.75d);
        secondMoment1.clear();
        secondMoment1.increment(4.320688243469202E11d);
        double double86 = secondMoment1.getResult();
        secondMoment1.clear();
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 2L + "'", long6 == 2L);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 0.5d + "'", double13 == 0.5d);
        org.junit.Assert.assertTrue("'" + double19 + "' != '" + 0.5d + "'", double19 == 0.5d);
        org.junit.Assert.assertNotNull(doubleArray26);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray26), "[-1.0, 0.0, 10.0]");
        org.junit.Assert.assertTrue("'" + double30 + "' != '" + 74.0d + "'", double30 == 74.0d);
        org.junit.Assert.assertNotNull(doubleArray31);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray31), "[]");
        org.junit.Assert.assertNotNull(doubleArray43);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray43), "[-1.0, 0.0, 10.0]");
        org.junit.Assert.assertNotNull(doubleArray49);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray49), "[10.0, 100.0]");
        org.junit.Assert.assertTrue("'" + double50 + "' != '" + 4050.0d + "'", double50 == 4050.0d);
        org.junit.Assert.assertTrue("'" + double51 + "' != '" + 4050.0d + "'", double51 == 4050.0d);
        org.junit.Assert.assertTrue("'" + long52 + "' != '" + 3L + "'", long52 == 3L);
        org.junit.Assert.assertTrue("'" + double53 + "' != '" + 1.0d + "'", double53 == 1.0d);
        org.junit.Assert.assertNotNull(doubleArray60);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray60), "[-1.0, 0.0, 10.0]");
        org.junit.Assert.assertNotNull(doubleArray66);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray66), "[10.0, 100.0]");
        org.junit.Assert.assertTrue("'" + double67 + "' != '" + 4050.0d + "'", double67 == 4050.0d);
        org.junit.Assert.assertTrue("'" + double68 + "' != '" + 4050.0d + "'", double68 == 4050.0d);
        org.junit.Assert.assertNotNull(doubleArray72);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray72), "[1.0]");
        org.junit.Assert.assertTrue("'" + double74 + "' != '" + 0.0d + "'", double74 == 0.0d);
        org.junit.Assert.assertTrue("'" + double77 + "' != '" + 0.5d + "'", double77 == 0.5d);
        org.junit.Assert.assertTrue("'" + double86 + "' != '" + 0.0d + "'", double86 == 0.0d);
    }

    @Test
    public void test16590() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest33.test16590");
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
        org.apache.commons.math.stat.descriptive.moment.SecondMoment secondMoment17 = new org.apache.commons.math.stat.descriptive.moment.SecondMoment();
        secondMoment17.increment(1.0d);
        org.apache.commons.math.stat.descriptive.moment.SecondMoment secondMoment20 = new org.apache.commons.math.stat.descriptive.moment.SecondMoment();
        secondMoment20.increment(1.0d);
        secondMoment20.increment((double) (short) 0);
        double double25 = secondMoment20.getResult();
        org.apache.commons.math.stat.descriptive.moment.SecondMoment secondMoment26 = new org.apache.commons.math.stat.descriptive.moment.SecondMoment();
        secondMoment26.increment(1.0d);
        double[] doubleArray32 = new double[] { (-1L), 0, 10L };
        secondMoment26.incrementAll(doubleArray32, 0, 0);
        double double36 = secondMoment20.evaluate(doubleArray32);
        double[] doubleArray37 = new double[] {};
        secondMoment20.incrementAll(doubleArray37);
        double double39 = secondMoment17.evaluate(doubleArray37);
        secondMoment17.increment((double) 3L);
        secondMoment17.increment(24.666666666666668d);
        long long44 = secondMoment17.getN();
        secondMoment17.clear();
        secondMoment17.clear();
        double double47 = secondMoment17.getResult();
        org.apache.commons.math.stat.descriptive.moment.SecondMoment secondMoment48 = new org.apache.commons.math.stat.descriptive.moment.SecondMoment();
        secondMoment48.increment((double) ' ');
        org.apache.commons.math.stat.descriptive.moment.Variance variance51 = new org.apache.commons.math.stat.descriptive.moment.Variance(secondMoment48);
        secondMoment48.increment((double) (short) -1);
        secondMoment48.clear();
        secondMoment48.increment((double) 0L);
        org.apache.commons.math.stat.descriptive.moment.Variance variance57 = new org.apache.commons.math.stat.descriptive.moment.Variance(secondMoment48);
        org.apache.commons.math.stat.descriptive.moment.SecondMoment secondMoment58 = new org.apache.commons.math.stat.descriptive.moment.SecondMoment();
        secondMoment58.increment(1.0d);
        secondMoment58.increment((double) (short) 0);
        double double63 = secondMoment58.getResult();
        org.apache.commons.math.stat.descriptive.moment.SecondMoment secondMoment64 = new org.apache.commons.math.stat.descriptive.moment.SecondMoment();
        secondMoment64.increment(1.0d);
        double[] doubleArray70 = new double[] { (-1L), 0, 10L };
        secondMoment64.incrementAll(doubleArray70, 0, 0);
        double double74 = secondMoment58.evaluate(doubleArray70);
        double double75 = secondMoment48.evaluate(doubleArray70);
        org.apache.commons.math.stat.descriptive.moment.SecondMoment secondMoment76 = new org.apache.commons.math.stat.descriptive.moment.SecondMoment();
        secondMoment76.increment(1.0d);
        double[] doubleArray82 = new double[] { (-1L), 0, 10L };
        secondMoment76.incrementAll(doubleArray82, 0, 0);
        double[] doubleArray88 = new double[] { 10, (byte) 100 };
        double double89 = secondMoment76.evaluate(doubleArray88);
        double double90 = secondMoment76.getResult();
        secondMoment76.increment((double) (short) -1);
        double[] doubleArray94 = new double[] { (short) 1 };
        secondMoment76.incrementAll(doubleArray94);
        double double96 = secondMoment48.evaluate(doubleArray94);
        double double97 = secondMoment17.evaluate(doubleArray94);
        double double98 = secondMoment2.evaluate(doubleArray94);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 0.0d + "'", double12 == 0.0d);
        org.junit.Assert.assertTrue("'" + double25 + "' != '" + 0.5d + "'", double25 == 0.5d);
        org.junit.Assert.assertNotNull(doubleArray32);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray32), "[-1.0, 0.0, 10.0]");
        org.junit.Assert.assertTrue("'" + double36 + "' != '" + 74.0d + "'", double36 == 74.0d);
        org.junit.Assert.assertNotNull(doubleArray37);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray37), "[]");
        org.junit.Assert.assertTrue("'" + double39 + "' != '" + 0.0d + "'", double39 == 0.0d);
        org.junit.Assert.assertTrue("'" + long44 + "' != '" + 3L + "'", long44 == 3L);
        org.junit.Assert.assertTrue(Double.isNaN(double47));
        org.junit.Assert.assertTrue("'" + double63 + "' != '" + 0.5d + "'", double63 == 0.5d);
        org.junit.Assert.assertNotNull(doubleArray70);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray70), "[-1.0, 0.0, 10.0]");
        org.junit.Assert.assertTrue("'" + double74 + "' != '" + 74.0d + "'", double74 == 74.0d);
        org.junit.Assert.assertTrue("'" + double75 + "' != '" + 74.0d + "'", double75 == 74.0d);
        org.junit.Assert.assertNotNull(doubleArray82);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray82), "[-1.0, 0.0, 10.0]");
        org.junit.Assert.assertNotNull(doubleArray88);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray88), "[10.0, 100.0]");
        org.junit.Assert.assertTrue("'" + double89 + "' != '" + 4050.0d + "'", double89 == 4050.0d);
        org.junit.Assert.assertTrue("'" + double90 + "' != '" + 4050.0d + "'", double90 == 4050.0d);
        org.junit.Assert.assertNotNull(doubleArray94);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray94), "[1.0]");
        org.junit.Assert.assertTrue("'" + double96 + "' != '" + 0.0d + "'", double96 == 0.0d);
        org.junit.Assert.assertTrue("'" + double97 + "' != '" + 0.0d + "'", double97 == 0.0d);
        org.junit.Assert.assertTrue("'" + double98 + "' != '" + 0.0d + "'", double98 == 0.0d);
    }

    @Test
    public void test16591() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest33.test16591");
        org.apache.commons.math.stat.descriptive.moment.SecondMoment secondMoment1 = new org.apache.commons.math.stat.descriptive.moment.SecondMoment();
        secondMoment1.increment(1.0d);
        double[] doubleArray7 = new double[] { (-1L), 0, 10L };
        secondMoment1.incrementAll(doubleArray7, 0, 0);
        double[] doubleArray13 = new double[] { 10, (byte) 100 };
        double double14 = secondMoment1.evaluate(doubleArray13);
        double double15 = secondMoment1.getResult();
        long long16 = secondMoment1.getN();
        long long17 = secondMoment1.getN();
        org.apache.commons.math.stat.descriptive.moment.Variance variance18 = new org.apache.commons.math.stat.descriptive.moment.Variance(true, secondMoment1);
        variance18.clear();
        double double20 = variance18.getResult();
        org.junit.Assert.assertNotNull(doubleArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray7), "[-1.0, 0.0, 10.0]");
        org.junit.Assert.assertNotNull(doubleArray13);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray13), "[10.0, 100.0]");
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + 4050.0d + "'", double14 == 4050.0d);
        org.junit.Assert.assertTrue("'" + double15 + "' != '" + 4050.0d + "'", double15 == 4050.0d);
        org.junit.Assert.assertTrue("'" + long16 + "' != '" + 2L + "'", long16 == 2L);
        org.junit.Assert.assertTrue("'" + long17 + "' != '" + 2L + "'", long17 == 2L);
        org.junit.Assert.assertTrue("'" + double20 + "' != '" + 4050.0d + "'", double20 == 4050.0d);
    }

    @Test
    public void test16592() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest33.test16592");
        org.apache.commons.math.stat.descriptive.moment.SecondMoment secondMoment1 = new org.apache.commons.math.stat.descriptive.moment.SecondMoment();
        secondMoment1.increment(1.0d);
        double[] doubleArray7 = new double[] { (-1L), 0, 10L };
        secondMoment1.incrementAll(doubleArray7, 0, 0);
        double[] doubleArray13 = new double[] { 10, (byte) 100 };
        double double14 = secondMoment1.evaluate(doubleArray13);
        double double15 = secondMoment1.getResult();
        org.apache.commons.math.stat.descriptive.moment.Variance variance16 = new org.apache.commons.math.stat.descriptive.moment.Variance(false, secondMoment1);
        double double17 = variance16.getResult();
        boolean boolean18 = variance16.isBiasCorrected();
        variance16.clear();
        double[] doubleArray20 = null;
        // The following exception was thrown during execution in test generation
        try {
            variance16.incrementAll(doubleArray20, 0, (int) (byte) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: input value array is null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(doubleArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray7), "[-1.0, 0.0, 10.0]");
        org.junit.Assert.assertNotNull(doubleArray13);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray13), "[10.0, 100.0]");
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + 4050.0d + "'", double14 == 4050.0d);
        org.junit.Assert.assertTrue("'" + double15 + "' != '" + 4050.0d + "'", double15 == 4050.0d);
        org.junit.Assert.assertTrue("'" + double17 + "' != '" + 2025.0d + "'", double17 == 2025.0d);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
    }

    @Test
    public void test16593() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest33.test16593");
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
        variance0.setBiasCorrected(true);
        org.apache.commons.math.stat.descriptive.moment.SecondMoment secondMoment45 = new org.apache.commons.math.stat.descriptive.moment.SecondMoment();
        secondMoment45.increment(1.0d);
        org.apache.commons.math.stat.descriptive.moment.SecondMoment secondMoment48 = new org.apache.commons.math.stat.descriptive.moment.SecondMoment();
        secondMoment48.increment(1.0d);
        double[] doubleArray54 = new double[] { (-1L), 0, 10L };
        secondMoment48.incrementAll(doubleArray54, 0, 0);
        double[] doubleArray60 = new double[] { 10, (byte) 100 };
        double double61 = secondMoment48.evaluate(doubleArray60);
        double double62 = secondMoment45.evaluate(doubleArray60);
        variance0.incrementAll(doubleArray60);
        variance0.clear();
        variance0.setBiasCorrected(false);
        double double67 = variance0.getResult();
        variance0.increment(9714674.75d);
        long long70 = variance0.getN();
        variance0.clear();
        boolean boolean72 = variance0.isBiasCorrected();
        variance0.clear();
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
        org.junit.Assert.assertNotNull(doubleArray54);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray54), "[-1.0, 0.0, 10.0]");
        org.junit.Assert.assertNotNull(doubleArray60);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray60), "[10.0, 100.0]");
        org.junit.Assert.assertTrue("'" + double61 + "' != '" + 4050.0d + "'", double61 == 4050.0d);
        org.junit.Assert.assertTrue("'" + double62 + "' != '" + 4050.0d + "'", double62 == 4050.0d);
        org.junit.Assert.assertTrue(Double.isNaN(double67));
        org.junit.Assert.assertTrue("'" + long70 + "' != '" + 1L + "'", long70 == 1L);
        org.junit.Assert.assertTrue("'" + boolean72 + "' != '" + false + "'", boolean72 == false);
    }

    @Test
    public void test16594() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest33.test16594");
        org.apache.commons.math.stat.descriptive.moment.SecondMoment secondMoment0 = new org.apache.commons.math.stat.descriptive.moment.SecondMoment();
        secondMoment0.increment((double) ' ');
        org.apache.commons.math.stat.descriptive.moment.Variance variance3 = new org.apache.commons.math.stat.descriptive.moment.Variance(secondMoment0);
        secondMoment0.increment((double) (short) -1);
        long long6 = secondMoment0.getN();
        double double7 = secondMoment0.getResult();
        secondMoment0.clear();
        secondMoment0.clear();
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 2L + "'", long6 == 2L);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 544.5d + "'", double7 == 544.5d);
    }

    @Test
    public void test16595() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest33.test16595");
        org.apache.commons.math.stat.descriptive.moment.SecondMoment secondMoment1 = new org.apache.commons.math.stat.descriptive.moment.SecondMoment();
        secondMoment1.increment(1.0d);
        double[] doubleArray7 = new double[] { (-1L), 0, 10L };
        secondMoment1.incrementAll(doubleArray7, 0, 0);
        long long11 = secondMoment1.getN();
        secondMoment1.clear();
        double double13 = secondMoment1.getResult();
        long long14 = secondMoment1.getN();
        org.apache.commons.math.stat.descriptive.moment.Variance variance15 = new org.apache.commons.math.stat.descriptive.moment.Variance(false, secondMoment1);
        secondMoment1.clear();
        java.lang.Class<?> wildcardClass17 = secondMoment1.getClass();
        org.junit.Assert.assertNotNull(doubleArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray7), "[-1.0, 0.0, 10.0]");
        org.junit.Assert.assertTrue("'" + long11 + "' != '" + 1L + "'", long11 == 1L);
        org.junit.Assert.assertTrue(Double.isNaN(double13));
        org.junit.Assert.assertTrue("'" + long14 + "' != '" + 0L + "'", long14 == 0L);
        org.junit.Assert.assertNotNull(wildcardClass17);
    }

    @Test
    public void test16596() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest33.test16596");
        org.apache.commons.math.stat.descriptive.moment.SecondMoment secondMoment1 = new org.apache.commons.math.stat.descriptive.moment.SecondMoment();
        secondMoment1.increment((double) ' ');
        org.apache.commons.math.stat.descriptive.moment.Variance variance4 = new org.apache.commons.math.stat.descriptive.moment.Variance(secondMoment1);
        secondMoment1.clear();
        org.apache.commons.math.stat.descriptive.moment.Variance variance6 = new org.apache.commons.math.stat.descriptive.moment.Variance(true, secondMoment1);
        secondMoment1.clear();
        secondMoment1.increment((double) 10);
        secondMoment1.increment(2.0d);
        org.apache.commons.math.stat.descriptive.moment.Variance variance12 = new org.apache.commons.math.stat.descriptive.moment.Variance(secondMoment1);
        org.apache.commons.math.stat.descriptive.moment.Variance variance13 = new org.apache.commons.math.stat.descriptive.moment.Variance();
        variance13.clear();
        org.apache.commons.math.stat.descriptive.moment.SecondMoment secondMoment15 = new org.apache.commons.math.stat.descriptive.moment.SecondMoment();
        secondMoment15.increment(1.0d);
        double[] doubleArray21 = new double[] { (-1L), 0, 10L };
        secondMoment15.incrementAll(doubleArray21, 0, 0);
        org.apache.commons.math.stat.descriptive.moment.Variance variance25 = new org.apache.commons.math.stat.descriptive.moment.Variance(secondMoment15);
        org.apache.commons.math.stat.descriptive.moment.SecondMoment secondMoment26 = new org.apache.commons.math.stat.descriptive.moment.SecondMoment();
        secondMoment26.increment(1.0d);
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
        double double48 = secondMoment26.evaluate(doubleArray46);
        double double49 = variance25.evaluate(doubleArray46);
        long long50 = variance25.getN();
        double double51 = variance25.getResult();
        org.apache.commons.math.stat.descriptive.moment.SecondMoment secondMoment52 = new org.apache.commons.math.stat.descriptive.moment.SecondMoment();
        secondMoment52.increment(1.0d);
        double[] doubleArray58 = new double[] { (-1L), 0, 10L };
        secondMoment52.incrementAll(doubleArray58, 0, 0);
        double[] doubleArray64 = new double[] { 10, (byte) 100 };
        double double65 = secondMoment52.evaluate(doubleArray64);
        double double67 = variance25.evaluate(doubleArray64, (double) (-1));
        double double68 = variance13.evaluate(doubleArray64);
        double double69 = variance12.evaluate(doubleArray64);
        org.apache.commons.math.stat.descriptive.moment.SecondMoment secondMoment70 = new org.apache.commons.math.stat.descriptive.moment.SecondMoment();
        secondMoment70.increment(1.0d);
        double[] doubleArray76 = new double[] { (-1L), 0, 10L };
        secondMoment70.incrementAll(doubleArray76, 0, 0);
        org.apache.commons.math.stat.descriptive.moment.Variance variance80 = new org.apache.commons.math.stat.descriptive.moment.Variance(secondMoment70);
        double double81 = secondMoment70.getResult();
        secondMoment70.increment(237360.5d);
        boolean boolean84 = variance12.equals((java.lang.Object) secondMoment70);
        variance12.setBiasCorrected(false);
        org.junit.Assert.assertNotNull(doubleArray21);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray21), "[-1.0, 0.0, 10.0]");
        org.junit.Assert.assertTrue("'" + double34 + "' != '" + 0.5d + "'", double34 == 0.5d);
        org.junit.Assert.assertNotNull(doubleArray41);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray41), "[-1.0, 0.0, 10.0]");
        org.junit.Assert.assertTrue("'" + double45 + "' != '" + 74.0d + "'", double45 == 74.0d);
        org.junit.Assert.assertNotNull(doubleArray46);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray46), "[]");
        org.junit.Assert.assertTrue("'" + double48 + "' != '" + 0.0d + "'", double48 == 0.0d);
        org.junit.Assert.assertTrue(Double.isNaN(double49));
        org.junit.Assert.assertTrue("'" + long50 + "' != '" + 1L + "'", long50 == 1L);
        org.junit.Assert.assertTrue("'" + double51 + "' != '" + 0.0d + "'", double51 == 0.0d);
        org.junit.Assert.assertNotNull(doubleArray58);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray58), "[-1.0, 0.0, 10.0]");
        org.junit.Assert.assertNotNull(doubleArray64);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray64), "[10.0, 100.0]");
        org.junit.Assert.assertTrue("'" + double65 + "' != '" + 4050.0d + "'", double65 == 4050.0d);
        org.junit.Assert.assertTrue("'" + double67 + "' != '" + 4050.0d + "'", double67 == 4050.0d);
        org.junit.Assert.assertTrue("'" + double68 + "' != '" + 4050.0d + "'", double68 == 4050.0d);
        org.junit.Assert.assertTrue("'" + double69 + "' != '" + 4050.0d + "'", double69 == 4050.0d);
        org.junit.Assert.assertNotNull(doubleArray76);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray76), "[-1.0, 0.0, 10.0]");
        org.junit.Assert.assertTrue("'" + double81 + "' != '" + 0.0d + "'", double81 == 0.0d);
        org.junit.Assert.assertTrue("'" + boolean84 + "' != '" + false + "'", boolean84 == false);
    }

    @Test
    public void test16597() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest33.test16597");
        org.apache.commons.math.stat.descriptive.moment.SecondMoment secondMoment0 = new org.apache.commons.math.stat.descriptive.moment.SecondMoment();
        secondMoment0.increment(1.0d);
        secondMoment0.increment((double) (short) 0);
        double double5 = secondMoment0.getResult();
        secondMoment0.clear();
        secondMoment0.increment((double) (short) -1);
        secondMoment0.increment(80.75d);
        org.apache.commons.math.stat.descriptive.moment.Variance variance11 = new org.apache.commons.math.stat.descriptive.moment.Variance(secondMoment0);
        double double12 = secondMoment0.getResult();
        secondMoment0.clear();
        secondMoment0.increment(482.66666666666663d);
        org.apache.commons.math.stat.descriptive.moment.SecondMoment secondMoment16 = new org.apache.commons.math.stat.descriptive.moment.SecondMoment();
        secondMoment16.increment((double) ' ');
        secondMoment16.increment((double) (byte) 0);
        secondMoment16.increment((double) 'a');
        org.apache.commons.math.stat.descriptive.moment.SecondMoment secondMoment23 = new org.apache.commons.math.stat.descriptive.moment.SecondMoment();
        secondMoment23.increment((double) ' ');
        org.apache.commons.math.stat.descriptive.moment.Variance variance26 = new org.apache.commons.math.stat.descriptive.moment.Variance(secondMoment23);
        secondMoment23.increment((double) (short) -1);
        org.apache.commons.math.stat.descriptive.moment.SecondMoment secondMoment29 = new org.apache.commons.math.stat.descriptive.moment.SecondMoment();
        secondMoment29.increment(1.0d);
        double[] doubleArray35 = new double[] { (-1L), 0, 10L };
        secondMoment29.incrementAll(doubleArray35, 0, 0);
        org.apache.commons.math.stat.descriptive.moment.Variance variance39 = new org.apache.commons.math.stat.descriptive.moment.Variance(secondMoment29);
        long long40 = variance39.getN();
        org.apache.commons.math.stat.descriptive.moment.SecondMoment secondMoment41 = new org.apache.commons.math.stat.descriptive.moment.SecondMoment();
        secondMoment41.increment(1.0d);
        double[] doubleArray47 = new double[] { (-1L), 0, 10L };
        secondMoment41.incrementAll(doubleArray47, 0, 0);
        double double52 = variance39.evaluate(doubleArray47, (double) (short) -1);
        double double53 = secondMoment23.evaluate(doubleArray47);
        double double54 = secondMoment16.evaluate(doubleArray47);
        // The following exception was thrown during execution in test generation
        try {
            double double57 = secondMoment0.evaluate(doubleArray47, (-1), (int) (byte) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: start position cannot be negative");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.5d + "'", double5 == 0.5d);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 3341.53125d + "'", double12 == 3341.53125d);
        org.junit.Assert.assertNotNull(doubleArray35);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray35), "[-1.0, 0.0, 10.0]");
        org.junit.Assert.assertTrue("'" + long40 + "' != '" + 1L + "'", long40 == 1L);
        org.junit.Assert.assertNotNull(doubleArray47);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray47), "[-1.0, 0.0, 10.0]");
        org.junit.Assert.assertTrue("'" + double52 + "' != '" + 37.0d + "'", double52 == 37.0d);
        org.junit.Assert.assertTrue("'" + double53 + "' != '" + 74.0d + "'", double53 == 74.0d);
        org.junit.Assert.assertTrue("'" + double54 + "' != '" + 74.0d + "'", double54 == 74.0d);
    }

    @Test
    public void test16598() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest33.test16598");
        org.apache.commons.math.stat.descriptive.moment.SecondMoment secondMoment1 = new org.apache.commons.math.stat.descriptive.moment.SecondMoment();
        secondMoment1.increment(1.0d);
        double[] doubleArray7 = new double[] { (-1L), 0, 10L };
        secondMoment1.incrementAll(doubleArray7, 0, 0);
        double[] doubleArray13 = new double[] { 10, (byte) 100 };
        double double14 = secondMoment1.evaluate(doubleArray13);
        double double15 = secondMoment1.getResult();
        org.apache.commons.math.stat.descriptive.moment.Variance variance16 = new org.apache.commons.math.stat.descriptive.moment.Variance(false, secondMoment1);
        variance16.increment(0.0d);
        boolean boolean19 = variance16.isBiasCorrected();
        boolean boolean20 = variance16.isBiasCorrected();
        variance16.increment((double) 'a');
        variance16.increment(7262.8d);
        boolean boolean25 = variance16.isBiasCorrected();
        long long26 = variance16.getN();
        org.junit.Assert.assertNotNull(doubleArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray7), "[-1.0, 0.0, 10.0]");
        org.junit.Assert.assertNotNull(doubleArray13);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray13), "[10.0, 100.0]");
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + 4050.0d + "'", double14 == 4050.0d);
        org.junit.Assert.assertTrue("'" + double15 + "' != '" + 4050.0d + "'", double15 == 4050.0d);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
        org.junit.Assert.assertTrue("'" + long26 + "' != '" + 2L + "'", long26 == 2L);
    }

    @Test
    public void test16599() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest33.test16599");
        org.apache.commons.math.stat.descriptive.moment.SecondMoment secondMoment0 = new org.apache.commons.math.stat.descriptive.moment.SecondMoment();
        secondMoment0.increment((double) ' ');
        secondMoment0.increment((double) (-1.0f));
        double double5 = secondMoment0.getResult();
        org.apache.commons.math.stat.descriptive.moment.Variance variance6 = new org.apache.commons.math.stat.descriptive.moment.Variance(secondMoment0);
        secondMoment0.clear();
        double double8 = secondMoment0.getResult();
        secondMoment0.increment(40.5d);
        org.apache.commons.math.stat.descriptive.moment.SecondMoment secondMoment11 = new org.apache.commons.math.stat.descriptive.moment.SecondMoment();
        secondMoment11.increment(1.0d);
        double[] doubleArray17 = new double[] { (-1L), 0, 10L };
        secondMoment11.incrementAll(doubleArray17, 0, 0);
        double[] doubleArray23 = new double[] { 10, (byte) 100 };
        double double24 = secondMoment11.evaluate(doubleArray23);
        secondMoment11.clear();
        secondMoment11.increment((double) (-1.0f));
        org.apache.commons.math.stat.descriptive.moment.Variance variance28 = new org.apache.commons.math.stat.descriptive.moment.Variance(secondMoment11);
        secondMoment11.increment(482.66666666666663d);
        secondMoment11.increment(1801.0d);
        secondMoment11.increment((double) (-1.0f));
        org.apache.commons.math.stat.descriptive.moment.SecondMoment secondMoment35 = new org.apache.commons.math.stat.descriptive.moment.SecondMoment();
        secondMoment35.increment(1.0d);
        double[] doubleArray41 = new double[] { (-1L), 0, 10L };
        secondMoment35.incrementAll(doubleArray41, 0, 0);
        org.apache.commons.math.stat.descriptive.moment.Variance variance45 = new org.apache.commons.math.stat.descriptive.moment.Variance(secondMoment35);
        variance45.increment((double) (short) 100);
        variance45.clear();
        variance45.increment(Double.NaN);
        org.apache.commons.math.stat.descriptive.moment.SecondMoment secondMoment51 = new org.apache.commons.math.stat.descriptive.moment.SecondMoment();
        secondMoment51.increment((double) ' ');
        org.apache.commons.math.stat.descriptive.moment.Variance variance54 = new org.apache.commons.math.stat.descriptive.moment.Variance(secondMoment51);
        secondMoment51.increment((double) (short) -1);
        secondMoment51.clear();
        secondMoment51.increment((double) 0L);
        org.apache.commons.math.stat.descriptive.moment.Variance variance60 = new org.apache.commons.math.stat.descriptive.moment.Variance(secondMoment51);
        long long61 = secondMoment51.getN();
        org.apache.commons.math.stat.descriptive.moment.Variance variance63 = new org.apache.commons.math.stat.descriptive.moment.Variance(true);
        long long64 = variance63.getN();
        org.apache.commons.math.stat.descriptive.moment.SecondMoment secondMoment65 = new org.apache.commons.math.stat.descriptive.moment.SecondMoment();
        secondMoment65.increment(1.0d);
        secondMoment65.increment((double) (short) 0);
        double double70 = secondMoment65.getResult();
        org.apache.commons.math.stat.descriptive.moment.SecondMoment secondMoment71 = new org.apache.commons.math.stat.descriptive.moment.SecondMoment();
        secondMoment71.increment(1.0d);
        double[] doubleArray77 = new double[] { (-1L), 0, 10L };
        secondMoment71.incrementAll(doubleArray77, 0, 0);
        double double81 = secondMoment65.evaluate(doubleArray77);
        variance63.incrementAll(doubleArray77);
        double double83 = secondMoment51.evaluate(doubleArray77);
        double double84 = variance45.evaluate(doubleArray77);
        double double85 = secondMoment11.evaluate(doubleArray77);
        long long86 = secondMoment11.getN();
        long long87 = secondMoment11.getN();
        double double88 = secondMoment11.getResult();
        boolean boolean89 = secondMoment0.equals((java.lang.Object) secondMoment11);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 544.5d + "'", double5 == 544.5d);
        org.junit.Assert.assertTrue(Double.isNaN(double8));
        org.junit.Assert.assertNotNull(doubleArray17);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray17), "[-1.0, 0.0, 10.0]");
        org.junit.Assert.assertNotNull(doubleArray23);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray23), "[10.0, 100.0]");
        org.junit.Assert.assertTrue("'" + double24 + "' != '" + 4050.0d + "'", double24 == 4050.0d);
        org.junit.Assert.assertNotNull(doubleArray41);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray41), "[-1.0, 0.0, 10.0]");
        org.junit.Assert.assertTrue("'" + long61 + "' != '" + 1L + "'", long61 == 1L);
        org.junit.Assert.assertTrue("'" + long64 + "' != '" + 0L + "'", long64 == 0L);
        org.junit.Assert.assertTrue("'" + double70 + "' != '" + 0.5d + "'", double70 == 0.5d);
        org.junit.Assert.assertNotNull(doubleArray77);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray77), "[-1.0, 0.0, 10.0]");
        org.junit.Assert.assertTrue("'" + double81 + "' != '" + 74.0d + "'", double81 == 74.0d);
        org.junit.Assert.assertTrue("'" + double83 + "' != '" + 74.0d + "'", double83 == 74.0d);
        org.junit.Assert.assertTrue("'" + double84 + "' != '" + 37.0d + "'", double84 == 37.0d);
        org.junit.Assert.assertTrue("'" + double85 + "' != '" + 74.0d + "'", double85 == 74.0d);
        org.junit.Assert.assertTrue("'" + long86 + "' != '" + 3L + "'", long86 == 3L);
        org.junit.Assert.assertTrue("'" + long87 + "' != '" + 3L + "'", long87 == 3L);
        org.junit.Assert.assertTrue("'" + double88 + "' != '" + 74.0d + "'", double88 == 74.0d);
        org.junit.Assert.assertTrue("'" + boolean89 + "' != '" + false + "'", boolean89 == false);
    }

    @Test
    public void test16600() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest33.test16600");
        org.apache.commons.math.stat.descriptive.moment.SecondMoment secondMoment0 = new org.apache.commons.math.stat.descriptive.moment.SecondMoment();
        secondMoment0.increment((double) ' ');
        org.apache.commons.math.stat.descriptive.moment.Variance variance3 = new org.apache.commons.math.stat.descriptive.moment.Variance(secondMoment0);
        secondMoment0.increment((double) (short) -1);
        secondMoment0.clear();
        secondMoment0.increment((double) 0L);
        org.apache.commons.math.stat.descriptive.moment.Variance variance9 = new org.apache.commons.math.stat.descriptive.moment.Variance(secondMoment0);
        long long10 = variance9.getN();
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
        double double34 = variance9.evaluate(doubleArray31);
        org.apache.commons.math.stat.descriptive.moment.SecondMoment secondMoment35 = new org.apache.commons.math.stat.descriptive.moment.SecondMoment();
        secondMoment35.increment(1.0d);
        org.apache.commons.math.stat.descriptive.moment.SecondMoment secondMoment38 = new org.apache.commons.math.stat.descriptive.moment.SecondMoment();
        secondMoment38.increment(1.0d);
        secondMoment38.increment((double) (short) 0);
        double double43 = secondMoment38.getResult();
        org.apache.commons.math.stat.descriptive.moment.SecondMoment secondMoment44 = new org.apache.commons.math.stat.descriptive.moment.SecondMoment();
        secondMoment44.increment(1.0d);
        double[] doubleArray50 = new double[] { (-1L), 0, 10L };
        secondMoment44.incrementAll(doubleArray50, 0, 0);
        double double54 = secondMoment38.evaluate(doubleArray50);
        double[] doubleArray55 = new double[] {};
        secondMoment38.incrementAll(doubleArray55);
        double double57 = secondMoment35.evaluate(doubleArray55);
        variance9.incrementAll(doubleArray55);
        variance9.clear();
        double double60 = variance9.getResult();
        variance9.setBiasCorrected(true);
        long long63 = variance9.getN();
        variance9.clear();
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + 1L + "'", long10 == 1L);
        org.junit.Assert.assertTrue("'" + double19 + "' != '" + 0.5d + "'", double19 == 0.5d);
        org.junit.Assert.assertNotNull(doubleArray26);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray26), "[-1.0, 0.0, 10.0]");
        org.junit.Assert.assertTrue("'" + double30 + "' != '" + 74.0d + "'", double30 == 74.0d);
        org.junit.Assert.assertNotNull(doubleArray31);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray31), "[]");
        org.junit.Assert.assertTrue("'" + double33 + "' != '" + 0.0d + "'", double33 == 0.0d);
        org.junit.Assert.assertTrue(Double.isNaN(double34));
        org.junit.Assert.assertTrue("'" + double43 + "' != '" + 0.5d + "'", double43 == 0.5d);
        org.junit.Assert.assertNotNull(doubleArray50);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray50), "[-1.0, 0.0, 10.0]");
        org.junit.Assert.assertTrue("'" + double54 + "' != '" + 74.0d + "'", double54 == 74.0d);
        org.junit.Assert.assertNotNull(doubleArray55);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray55), "[]");
        org.junit.Assert.assertTrue("'" + double57 + "' != '" + 0.0d + "'", double57 == 0.0d);
        org.junit.Assert.assertTrue("'" + double60 + "' != '" + 0.0d + "'", double60 == 0.0d);
        org.junit.Assert.assertTrue("'" + long63 + "' != '" + 1L + "'", long63 == 1L);
    }

    @Test
    public void test16601() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest33.test16601");
        org.apache.commons.math.stat.descriptive.moment.Variance variance0 = new org.apache.commons.math.stat.descriptive.moment.Variance();
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
        secondMoment3.clear();
        org.apache.commons.math.stat.descriptive.moment.SecondMoment secondMoment23 = new org.apache.commons.math.stat.descriptive.moment.SecondMoment();
        secondMoment23.increment(1.0d);
        double[] doubleArray29 = new double[] { (-1L), 0, 10L };
        secondMoment23.incrementAll(doubleArray29, 0, 0);
        double[] doubleArray35 = new double[] { 10, (byte) 100 };
        double double36 = secondMoment23.evaluate(doubleArray35);
        double double37 = secondMoment23.getResult();
        org.apache.commons.math.stat.descriptive.moment.Variance variance38 = new org.apache.commons.math.stat.descriptive.moment.Variance(false, secondMoment23);
        long long39 = secondMoment23.getN();
        org.apache.commons.math.stat.descriptive.moment.SecondMoment secondMoment40 = new org.apache.commons.math.stat.descriptive.moment.SecondMoment();
        secondMoment40.increment((double) ' ');
        secondMoment40.increment((double) (-1.0f));
        secondMoment40.clear();
        org.apache.commons.math.stat.descriptive.moment.SecondMoment secondMoment46 = new org.apache.commons.math.stat.descriptive.moment.SecondMoment();
        secondMoment46.increment(1.0d);
        double[] doubleArray52 = new double[] { (-1L), 0, 10L };
        secondMoment46.incrementAll(doubleArray52, 0, 0);
        org.apache.commons.math.stat.descriptive.moment.Variance variance56 = new org.apache.commons.math.stat.descriptive.moment.Variance(secondMoment46);
        long long57 = variance56.getN();
        org.apache.commons.math.stat.descriptive.moment.SecondMoment secondMoment58 = new org.apache.commons.math.stat.descriptive.moment.SecondMoment();
        secondMoment58.increment(1.0d);
        double[] doubleArray64 = new double[] { (-1L), 0, 10L };
        secondMoment58.incrementAll(doubleArray64, 0, 0);
        double double69 = variance56.evaluate(doubleArray64, (double) (short) -1);
        double double70 = secondMoment40.evaluate(doubleArray64);
        double double71 = secondMoment23.evaluate(doubleArray64);
        double double72 = secondMoment3.evaluate(doubleArray64);
        double double74 = variance0.evaluate(doubleArray64, (double) ' ');
        variance0.setBiasCorrected(false);
        long long77 = variance0.getN();
        variance0.increment(3698.0d);
        variance0.increment(604.6666666666666d);
        variance0.increment(0.0d);
        org.junit.Assert.assertNotNull(doubleArray9);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray9), "[-1.0, 0.0, 10.0]");
        org.junit.Assert.assertNotNull(doubleArray15);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray15), "[10.0, 100.0]");
        org.junit.Assert.assertTrue("'" + double16 + "' != '" + 4050.0d + "'", double16 == 4050.0d);
        org.junit.Assert.assertTrue("'" + double17 + "' != '" + 4050.0d + "'", double17 == 4050.0d);
        org.junit.Assert.assertTrue("'" + long19 + "' != '" + 2L + "'", long19 == 2L);
        org.junit.Assert.assertNotNull(doubleArray29);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray29), "[-1.0, 0.0, 10.0]");
        org.junit.Assert.assertNotNull(doubleArray35);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray35), "[10.0, 100.0]");
        org.junit.Assert.assertTrue("'" + double36 + "' != '" + 4050.0d + "'", double36 == 4050.0d);
        org.junit.Assert.assertTrue("'" + double37 + "' != '" + 4050.0d + "'", double37 == 4050.0d);
        org.junit.Assert.assertTrue("'" + long39 + "' != '" + 2L + "'", long39 == 2L);
        org.junit.Assert.assertNotNull(doubleArray52);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray52), "[-1.0, 0.0, 10.0]");
        org.junit.Assert.assertTrue("'" + long57 + "' != '" + 1L + "'", long57 == 1L);
        org.junit.Assert.assertNotNull(doubleArray64);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray64), "[-1.0, 0.0, 10.0]");
        org.junit.Assert.assertTrue("'" + double69 + "' != '" + 37.0d + "'", double69 == 37.0d);
        org.junit.Assert.assertTrue("'" + double70 + "' != '" + 74.0d + "'", double70 == 74.0d);
        org.junit.Assert.assertTrue("'" + double71 + "' != '" + 74.0d + "'", double71 == 74.0d);
        org.junit.Assert.assertTrue("'" + double72 + "' != '" + 74.0d + "'", double72 == 74.0d);
        org.junit.Assert.assertTrue("'" + double74 + "' != '" + 37.0d + "'", double74 == 37.0d);
        org.junit.Assert.assertTrue("'" + long77 + "' != '" + 0L + "'", long77 == 0L);
    }

    @Test
    public void test16602() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest33.test16602");
        org.apache.commons.math.stat.descriptive.moment.SecondMoment secondMoment2 = new org.apache.commons.math.stat.descriptive.moment.SecondMoment();
        secondMoment2.increment((double) ' ');
        org.apache.commons.math.stat.descriptive.moment.Variance variance5 = new org.apache.commons.math.stat.descriptive.moment.Variance(secondMoment2);
        org.apache.commons.math.stat.descriptive.moment.Variance variance6 = new org.apache.commons.math.stat.descriptive.moment.Variance(false, secondMoment2);
        secondMoment2.increment((double) 0.0f);
        secondMoment2.clear();
        org.apache.commons.math.stat.descriptive.moment.Variance variance10 = new org.apache.commons.math.stat.descriptive.moment.Variance(true, secondMoment2);
        org.apache.commons.math.stat.descriptive.moment.Variance variance11 = new org.apache.commons.math.stat.descriptive.moment.Variance(secondMoment2);
        double double12 = secondMoment2.getResult();
        org.junit.Assert.assertTrue(Double.isNaN(double12));
    }

    @Test
    public void test16603() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest33.test16603");
        org.apache.commons.math.stat.descriptive.moment.SecondMoment secondMoment4 = new org.apache.commons.math.stat.descriptive.moment.SecondMoment();
        secondMoment4.increment(1.0d);
        double[] doubleArray10 = new double[] { (-1L), 0, 10L };
        secondMoment4.incrementAll(doubleArray10, 0, 0);
        double[] doubleArray16 = new double[] { 10, (byte) 100 };
        double double17 = secondMoment4.evaluate(doubleArray16);
        double double18 = secondMoment4.getResult();
        org.apache.commons.math.stat.descriptive.moment.Variance variance19 = new org.apache.commons.math.stat.descriptive.moment.Variance(false, secondMoment4);
        long long20 = secondMoment4.getN();
        org.apache.commons.math.stat.descriptive.moment.Variance variance21 = new org.apache.commons.math.stat.descriptive.moment.Variance(true, secondMoment4);
        org.apache.commons.math.stat.descriptive.moment.Variance variance22 = new org.apache.commons.math.stat.descriptive.moment.Variance(false, secondMoment4);
        org.apache.commons.math.stat.descriptive.moment.Variance variance23 = new org.apache.commons.math.stat.descriptive.moment.Variance(secondMoment4);
        org.apache.commons.math.stat.descriptive.moment.Variance variance25 = new org.apache.commons.math.stat.descriptive.moment.Variance(true);
        long long26 = variance25.getN();
        double double27 = variance25.getResult();
        variance25.increment((double) (short) 100);
        variance25.increment((double) 3L);
        variance25.clear();
        org.apache.commons.math.stat.descriptive.moment.SecondMoment secondMoment33 = new org.apache.commons.math.stat.descriptive.moment.SecondMoment();
        secondMoment33.increment(1.0d);
        secondMoment33.increment((double) (short) 0);
        double double38 = secondMoment33.getResult();
        org.apache.commons.math.stat.descriptive.moment.SecondMoment secondMoment39 = new org.apache.commons.math.stat.descriptive.moment.SecondMoment();
        secondMoment39.increment(1.0d);
        double[] doubleArray45 = new double[] { (-1L), 0, 10L };
        secondMoment39.incrementAll(doubleArray45, 0, 0);
        double double49 = secondMoment33.evaluate(doubleArray45);
        double[] doubleArray50 = new double[] {};
        secondMoment33.incrementAll(doubleArray50);
        variance25.incrementAll(doubleArray50);
        boolean boolean53 = secondMoment4.equals((java.lang.Object) doubleArray50);
        double double54 = secondMoment4.getResult();
        secondMoment4.increment((double) (short) 0);
        org.apache.commons.math.stat.descriptive.moment.Variance variance57 = new org.apache.commons.math.stat.descriptive.moment.Variance(false, secondMoment4);
        org.junit.Assert.assertNotNull(doubleArray10);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray10), "[-1.0, 0.0, 10.0]");
        org.junit.Assert.assertNotNull(doubleArray16);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray16), "[10.0, 100.0]");
        org.junit.Assert.assertTrue("'" + double17 + "' != '" + 4050.0d + "'", double17 == 4050.0d);
        org.junit.Assert.assertTrue("'" + double18 + "' != '" + 4050.0d + "'", double18 == 4050.0d);
        org.junit.Assert.assertTrue("'" + long20 + "' != '" + 2L + "'", long20 == 2L);
        org.junit.Assert.assertTrue("'" + long26 + "' != '" + 0L + "'", long26 == 0L);
        org.junit.Assert.assertTrue(Double.isNaN(double27));
        org.junit.Assert.assertTrue("'" + double38 + "' != '" + 0.5d + "'", double38 == 0.5d);
        org.junit.Assert.assertNotNull(doubleArray45);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray45), "[-1.0, 0.0, 10.0]");
        org.junit.Assert.assertTrue("'" + double49 + "' != '" + 74.0d + "'", double49 == 74.0d);
        org.junit.Assert.assertNotNull(doubleArray50);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray50), "[]");
        org.junit.Assert.assertTrue("'" + boolean53 + "' != '" + false + "'", boolean53 == false);
        org.junit.Assert.assertTrue("'" + double54 + "' != '" + 4050.0d + "'", double54 == 4050.0d);
    }

    @Test
    public void test16604() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest33.test16604");
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
        variance8.clear();
        variance8.increment(12207.5d);
        variance8.clear();
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + 2L + "'", long7 == 2L);
        org.junit.Assert.assertNotNull(doubleArray15);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray15), "[-1.0, 0.0, 10.0]");
        org.junit.Assert.assertTrue("'" + double20 + "' != '" + 24.666666666666668d + "'", double20 == 24.666666666666668d);
    }

    @Test
    public void test16605() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest33.test16605");
        org.apache.commons.math.stat.descriptive.moment.SecondMoment secondMoment1 = new org.apache.commons.math.stat.descriptive.moment.SecondMoment();
        secondMoment1.increment((double) ' ');
        secondMoment1.increment((double) (byte) 0);
        secondMoment1.clear();
        org.apache.commons.math.stat.descriptive.moment.Variance variance7 = new org.apache.commons.math.stat.descriptive.moment.Variance(secondMoment1);
        org.apache.commons.math.stat.descriptive.moment.Variance variance8 = new org.apache.commons.math.stat.descriptive.moment.Variance(false, secondMoment1);
        secondMoment1.increment((double) 6L);
        double double11 = secondMoment1.getResult();
        long long12 = secondMoment1.getN();
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 0.0d + "'", double11 == 0.0d);
        org.junit.Assert.assertTrue("'" + long12 + "' != '" + 1L + "'", long12 == 1L);
    }

    @Test
    public void test16606() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest33.test16606");
        org.apache.commons.math.stat.descriptive.moment.SecondMoment secondMoment0 = new org.apache.commons.math.stat.descriptive.moment.SecondMoment();
        secondMoment0.increment(1.0d);
        double[] doubleArray6 = new double[] { (-1L), 0, 10L };
        secondMoment0.incrementAll(doubleArray6, 0, 0);
        org.apache.commons.math.stat.descriptive.moment.Variance variance10 = new org.apache.commons.math.stat.descriptive.moment.Variance(secondMoment0);
        double double11 = variance10.getResult();
        variance10.increment(6993.1875d);
        variance10.clear();
        double double15 = variance10.getResult();
        variance10.increment(9.541195475E7d);
        variance10.increment(1.2071146294775038E14d);
        variance10.setBiasCorrected(true);
        org.junit.Assert.assertNotNull(doubleArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray6), "[-1.0, 0.0, 10.0]");
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 0.0d + "'", double11 == 0.0d);
        org.junit.Assert.assertTrue("'" + double15 + "' != '" + 0.0d + "'", double15 == 0.0d);
    }

    @Test
    public void test16607() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest33.test16607");
        org.apache.commons.math.stat.descriptive.moment.SecondMoment secondMoment1 = new org.apache.commons.math.stat.descriptive.moment.SecondMoment();
        secondMoment1.increment((double) ' ');
        secondMoment1.increment((double) (-1.0f));
        secondMoment1.clear();
        secondMoment1.increment(0.0d);
        org.apache.commons.math.stat.descriptive.moment.SecondMoment secondMoment10 = new org.apache.commons.math.stat.descriptive.moment.SecondMoment();
        secondMoment10.increment(1.0d);
        double[] doubleArray16 = new double[] { (-1L), 0, 10L };
        secondMoment10.incrementAll(doubleArray16, 0, 0);
        double[] doubleArray22 = new double[] { 10, (byte) 100 };
        double double23 = secondMoment10.evaluate(doubleArray22);
        long long24 = secondMoment10.getN();
        secondMoment10.clear();
        double double26 = secondMoment10.getResult();
        secondMoment10.clear();
        org.apache.commons.math.stat.descriptive.moment.Variance variance28 = new org.apache.commons.math.stat.descriptive.moment.Variance(true, secondMoment10);
        org.apache.commons.math.stat.descriptive.moment.SecondMoment secondMoment29 = new org.apache.commons.math.stat.descriptive.moment.SecondMoment();
        secondMoment29.increment(1.0d);
        double[] doubleArray35 = new double[] { (-1L), 0, 10L };
        secondMoment29.incrementAll(doubleArray35, 0, 0);
        double double39 = variance28.evaluate(doubleArray35);
        org.apache.commons.math.stat.descriptive.moment.SecondMoment secondMoment40 = new org.apache.commons.math.stat.descriptive.moment.SecondMoment();
        secondMoment40.increment(1.0d);
        double[] doubleArray46 = new double[] { (-1L), 0, 10L };
        secondMoment40.incrementAll(doubleArray46, 0, 0);
        long long50 = secondMoment40.getN();
        org.apache.commons.math.stat.descriptive.moment.SecondMoment secondMoment51 = new org.apache.commons.math.stat.descriptive.moment.SecondMoment();
        secondMoment51.increment(1.0d);
        double[] doubleArray57 = new double[] { (-1L), 0, 10L };
        secondMoment51.incrementAll(doubleArray57, 0, 0);
        secondMoment40.incrementAll(doubleArray57, 0, (int) (short) 1);
        double double65 = variance28.evaluate(doubleArray57, (double) 100.0f);
        double double66 = secondMoment1.evaluate(doubleArray57);
        secondMoment1.clear();
        org.apache.commons.math.stat.descriptive.moment.Variance variance68 = new org.apache.commons.math.stat.descriptive.moment.Variance(secondMoment1);
        double double69 = secondMoment1.getResult();
        secondMoment1.clear();
        org.apache.commons.math.stat.descriptive.moment.Variance variance71 = new org.apache.commons.math.stat.descriptive.moment.Variance(false, secondMoment1);
        org.junit.Assert.assertNotNull(doubleArray16);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray16), "[-1.0, 0.0, 10.0]");
        org.junit.Assert.assertNotNull(doubleArray22);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray22), "[10.0, 100.0]");
        org.junit.Assert.assertTrue("'" + double23 + "' != '" + 4050.0d + "'", double23 == 4050.0d);
        org.junit.Assert.assertTrue("'" + long24 + "' != '" + 2L + "'", long24 == 2L);
        org.junit.Assert.assertTrue(Double.isNaN(double26));
        org.junit.Assert.assertNotNull(doubleArray35);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray35), "[-1.0, 0.0, 10.0]");
        org.junit.Assert.assertTrue("'" + double39 + "' != '" + 37.0d + "'", double39 == 37.0d);
        org.junit.Assert.assertNotNull(doubleArray46);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray46), "[-1.0, 0.0, 10.0]");
        org.junit.Assert.assertTrue("'" + long50 + "' != '" + 1L + "'", long50 == 1L);
        org.junit.Assert.assertNotNull(doubleArray57);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray57), "[-1.0, 0.0, 10.0]");
        org.junit.Assert.assertTrue("'" + double65 + "' != '" + 37.0d + "'", double65 == 37.0d);
        org.junit.Assert.assertTrue("'" + double66 + "' != '" + 74.0d + "'", double66 == 74.0d);
        org.junit.Assert.assertTrue(Double.isNaN(double69));
    }

    @Test
    public void test16608() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest33.test16608");
        org.apache.commons.math.stat.descriptive.moment.SecondMoment secondMoment2 = new org.apache.commons.math.stat.descriptive.moment.SecondMoment();
        secondMoment2.increment(1.0d);
        secondMoment2.increment((double) (short) 0);
        double double7 = secondMoment2.getResult();
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
        secondMoment2.incrementAll(doubleArray25);
        long long28 = secondMoment2.getN();
        org.apache.commons.math.stat.descriptive.moment.Variance variance29 = new org.apache.commons.math.stat.descriptive.moment.Variance(true, secondMoment2);
        secondMoment2.increment(1576.2666666666667d);
        double double32 = secondMoment2.getResult();
        org.apache.commons.math.stat.descriptive.moment.Variance variance33 = new org.apache.commons.math.stat.descriptive.moment.Variance(false, secondMoment2);
        secondMoment2.increment(1998.0d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 0.5d + "'", double7 == 0.5d);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 0.5d + "'", double13 == 0.5d);
        org.junit.Assert.assertNotNull(doubleArray20);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray20), "[-1.0, 0.0, 10.0]");
        org.junit.Assert.assertTrue("'" + double24 + "' != '" + 74.0d + "'", double24 == 74.0d);
        org.junit.Assert.assertNotNull(doubleArray25);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray25), "[]");
        org.junit.Assert.assertTrue("'" + long28 + "' != '" + 2L + "'", long28 == 2L);
        org.junit.Assert.assertTrue("'" + double32 + "' != '" + 1655360.891851852d + "'", double32 == 1655360.891851852d);
    }

    @Test
    public void test16609() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest33.test16609");
        org.apache.commons.math.stat.descriptive.moment.SecondMoment secondMoment1 = new org.apache.commons.math.stat.descriptive.moment.SecondMoment();
        secondMoment1.increment(1.0d);
        secondMoment1.increment((double) (short) 0);
        long long6 = secondMoment1.getN();
        org.apache.commons.math.stat.descriptive.moment.Variance variance7 = new org.apache.commons.math.stat.descriptive.moment.Variance(false, secondMoment1);
        long long8 = variance7.getN();
        variance7.clear();
        variance7.increment(11282.0d);
        variance7.increment(32.2d);
        variance7.increment(1.8756123185185187E7d);
        org.apache.commons.math.stat.descriptive.moment.SecondMoment secondMoment16 = new org.apache.commons.math.stat.descriptive.moment.SecondMoment();
        secondMoment16.increment((double) ' ');
        org.apache.commons.math.stat.descriptive.moment.Variance variance19 = new org.apache.commons.math.stat.descriptive.moment.Variance(secondMoment16);
        secondMoment16.increment((double) (short) -1);
        secondMoment16.increment((double) 100);
        secondMoment16.clear();
        double double25 = secondMoment16.getResult();
        secondMoment16.increment(1067.1666666666667d);
        org.apache.commons.math.stat.descriptive.moment.SecondMoment secondMoment29 = new org.apache.commons.math.stat.descriptive.moment.SecondMoment();
        secondMoment29.increment(1.0d);
        double[] doubleArray35 = new double[] { (-1L), 0, 10L };
        secondMoment29.incrementAll(doubleArray35, 0, 0);
        double[] doubleArray41 = new double[] { 10, (byte) 100 };
        double double42 = secondMoment29.evaluate(doubleArray41);
        secondMoment29.clear();
        secondMoment29.increment((double) (-1.0f));
        org.apache.commons.math.stat.descriptive.moment.Variance variance46 = new org.apache.commons.math.stat.descriptive.moment.Variance(secondMoment29);
        org.apache.commons.math.stat.descriptive.moment.Variance variance47 = new org.apache.commons.math.stat.descriptive.moment.Variance(false, secondMoment29);
        org.apache.commons.math.stat.descriptive.moment.SecondMoment secondMoment48 = new org.apache.commons.math.stat.descriptive.moment.SecondMoment();
        secondMoment48.increment((double) ' ');
        org.apache.commons.math.stat.descriptive.moment.Variance variance51 = new org.apache.commons.math.stat.descriptive.moment.Variance(secondMoment48);
        secondMoment48.clear();
        secondMoment48.clear();
        org.apache.commons.math.stat.descriptive.moment.SecondMoment secondMoment54 = new org.apache.commons.math.stat.descriptive.moment.SecondMoment();
        secondMoment54.increment((double) ' ');
        double double57 = secondMoment54.getResult();
        double double58 = secondMoment54.getResult();
        org.apache.commons.math.stat.descriptive.moment.SecondMoment secondMoment59 = new org.apache.commons.math.stat.descriptive.moment.SecondMoment();
        secondMoment59.increment(1.0d);
        double[] doubleArray65 = new double[] { (-1L), 0, 10L };
        secondMoment59.incrementAll(doubleArray65, 0, 0);
        double[] doubleArray71 = new double[] { 10, (byte) 100 };
        double double72 = secondMoment59.evaluate(doubleArray71);
        double double73 = secondMoment54.evaluate(doubleArray71);
        double double74 = secondMoment48.evaluate(doubleArray71);
        variance47.incrementAll(doubleArray71);
        secondMoment16.incrementAll(doubleArray71);
        // The following exception was thrown during execution in test generation
        try {
            double double79 = variance7.evaluate(doubleArray71, (int) (byte) 1, 100);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: begin + length > values.length");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 2L + "'", long6 == 2L);
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 2L + "'", long8 == 2L);
        org.junit.Assert.assertTrue(Double.isNaN(double25));
        org.junit.Assert.assertNotNull(doubleArray35);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray35), "[-1.0, 0.0, 10.0]");
        org.junit.Assert.assertNotNull(doubleArray41);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray41), "[10.0, 100.0]");
        org.junit.Assert.assertTrue("'" + double42 + "' != '" + 4050.0d + "'", double42 == 4050.0d);
        org.junit.Assert.assertTrue("'" + double57 + "' != '" + 0.0d + "'", double57 == 0.0d);
        org.junit.Assert.assertTrue("'" + double58 + "' != '" + 0.0d + "'", double58 == 0.0d);
        org.junit.Assert.assertNotNull(doubleArray65);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray65), "[-1.0, 0.0, 10.0]");
        org.junit.Assert.assertNotNull(doubleArray71);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray71), "[10.0, 100.0]");
        org.junit.Assert.assertTrue("'" + double72 + "' != '" + 4050.0d + "'", double72 == 4050.0d);
        org.junit.Assert.assertTrue("'" + double73 + "' != '" + 4050.0d + "'", double73 == 4050.0d);
        org.junit.Assert.assertTrue("'" + double74 + "' != '" + 4050.0d + "'", double74 == 4050.0d);
    }

    @Test
    public void test16610() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest33.test16610");
        org.apache.commons.math.stat.descriptive.moment.SecondMoment secondMoment0 = new org.apache.commons.math.stat.descriptive.moment.SecondMoment();
        secondMoment0.increment((double) ' ');
        org.apache.commons.math.stat.descriptive.moment.Variance variance3 = new org.apache.commons.math.stat.descriptive.moment.Variance(secondMoment0);
        secondMoment0.increment((double) (short) -1);
        secondMoment0.clear();
        double double7 = secondMoment0.getResult();
        org.apache.commons.math.stat.descriptive.moment.Variance variance8 = new org.apache.commons.math.stat.descriptive.moment.Variance(secondMoment0);
        org.apache.commons.math.stat.descriptive.moment.Variance variance9 = new org.apache.commons.math.stat.descriptive.moment.Variance(secondMoment0);
        secondMoment0.increment(1.0d);
        secondMoment0.increment((double) (-1.0f));
        org.apache.commons.math.stat.descriptive.moment.Variance variance14 = new org.apache.commons.math.stat.descriptive.moment.Variance(secondMoment0);
        org.apache.commons.math.stat.descriptive.moment.SecondMoment secondMoment15 = new org.apache.commons.math.stat.descriptive.moment.SecondMoment();
        secondMoment15.increment((double) ' ');
        org.apache.commons.math.stat.descriptive.moment.Variance variance18 = new org.apache.commons.math.stat.descriptive.moment.Variance(secondMoment15);
        secondMoment15.increment((double) (short) -1);
        secondMoment15.clear();
        secondMoment15.increment((double) 0L);
        org.apache.commons.math.stat.descriptive.moment.Variance variance24 = new org.apache.commons.math.stat.descriptive.moment.Variance(secondMoment15);
        org.apache.commons.math.stat.descriptive.moment.SecondMoment secondMoment25 = new org.apache.commons.math.stat.descriptive.moment.SecondMoment();
        secondMoment25.increment(1.0d);
        secondMoment25.increment((double) (short) 0);
        double double30 = secondMoment25.getResult();
        org.apache.commons.math.stat.descriptive.moment.SecondMoment secondMoment31 = new org.apache.commons.math.stat.descriptive.moment.SecondMoment();
        secondMoment31.increment(1.0d);
        double[] doubleArray37 = new double[] { (-1L), 0, 10L };
        secondMoment31.incrementAll(doubleArray37, 0, 0);
        double double41 = secondMoment25.evaluate(doubleArray37);
        double double42 = secondMoment15.evaluate(doubleArray37);
        org.apache.commons.math.stat.descriptive.moment.SecondMoment secondMoment43 = new org.apache.commons.math.stat.descriptive.moment.SecondMoment();
        secondMoment43.increment(1.0d);
        double[] doubleArray49 = new double[] { (-1L), 0, 10L };
        secondMoment43.incrementAll(doubleArray49, 0, 0);
        double[] doubleArray55 = new double[] { 10, (byte) 100 };
        double double56 = secondMoment43.evaluate(doubleArray55);
        double double57 = secondMoment43.getResult();
        secondMoment43.increment((double) (short) -1);
        double[] doubleArray61 = new double[] { (short) 1 };
        secondMoment43.incrementAll(doubleArray61);
        double double63 = secondMoment15.evaluate(doubleArray61);
        double double65 = variance14.evaluate(doubleArray61, 4608.0d);
        double double66 = variance14.getResult();
        org.junit.Assert.assertTrue(Double.isNaN(double7));
        org.junit.Assert.assertTrue("'" + double30 + "' != '" + 0.5d + "'", double30 == 0.5d);
        org.junit.Assert.assertNotNull(doubleArray37);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray37), "[-1.0, 0.0, 10.0]");
        org.junit.Assert.assertTrue("'" + double41 + "' != '" + 74.0d + "'", double41 == 74.0d);
        org.junit.Assert.assertTrue("'" + double42 + "' != '" + 74.0d + "'", double42 == 74.0d);
        org.junit.Assert.assertNotNull(doubleArray49);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray49), "[-1.0, 0.0, 10.0]");
        org.junit.Assert.assertNotNull(doubleArray55);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray55), "[10.0, 100.0]");
        org.junit.Assert.assertTrue("'" + double56 + "' != '" + 4050.0d + "'", double56 == 4050.0d);
        org.junit.Assert.assertTrue("'" + double57 + "' != '" + 4050.0d + "'", double57 == 4050.0d);
        org.junit.Assert.assertNotNull(doubleArray61);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray61), "[1.0]");
        org.junit.Assert.assertTrue("'" + double63 + "' != '" + 0.0d + "'", double63 == 0.0d);
        org.junit.Assert.assertTrue("'" + double65 + "' != '" + 0.0d + "'", double65 == 0.0d);
        org.junit.Assert.assertTrue("'" + double66 + "' != '" + 2.0d + "'", double66 == 2.0d);
    }

    @Test
    public void test16611() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest33.test16611");
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
        long long37 = variance10.getN();
        double double38 = variance10.getResult();
        long long39 = variance10.getN();
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
        org.junit.Assert.assertTrue("'" + long37 + "' != '" + 1L + "'", long37 == 1L);
        org.junit.Assert.assertTrue("'" + double38 + "' != '" + 0.0d + "'", double38 == 0.0d);
        org.junit.Assert.assertTrue("'" + long39 + "' != '" + 1L + "'", long39 == 1L);
    }

    @Test
    public void test16612() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest33.test16612");
        org.apache.commons.math.stat.descriptive.moment.SecondMoment secondMoment0 = new org.apache.commons.math.stat.descriptive.moment.SecondMoment();
        secondMoment0.increment((double) ' ');
        org.apache.commons.math.stat.descriptive.moment.Variance variance3 = new org.apache.commons.math.stat.descriptive.moment.Variance(secondMoment0);
        double[] doubleArray9 = new double[] { 0L, (byte) 1, 6140.666666666667d, 544.5d, (byte) 100 };
        double double10 = secondMoment0.evaluate(doubleArray9);
        org.apache.commons.math.stat.descriptive.moment.SecondMoment secondMoment11 = new org.apache.commons.math.stat.descriptive.moment.SecondMoment();
        secondMoment11.increment((double) ' ');
        org.apache.commons.math.stat.descriptive.moment.Variance variance14 = new org.apache.commons.math.stat.descriptive.moment.Variance(secondMoment11);
        secondMoment11.increment((double) (short) -1);
        secondMoment11.clear();
        secondMoment11.increment((double) 0L);
        org.apache.commons.math.stat.descriptive.moment.Variance variance20 = new org.apache.commons.math.stat.descriptive.moment.Variance(secondMoment11);
        boolean boolean21 = secondMoment0.equals((java.lang.Object) secondMoment11);
        org.apache.commons.math.stat.descriptive.moment.Variance variance22 = new org.apache.commons.math.stat.descriptive.moment.Variance(secondMoment0);
        secondMoment0.increment((double) (short) 1);
        double double25 = secondMoment0.getResult();
        double double26 = secondMoment0.getResult();
        org.apache.commons.math.stat.descriptive.moment.Variance variance28 = new org.apache.commons.math.stat.descriptive.moment.Variance(false);
        boolean boolean29 = variance28.isBiasCorrected();
        variance28.clear();
        boolean boolean31 = variance28.isBiasCorrected();
        org.apache.commons.math.stat.descriptive.moment.Variance variance32 = new org.apache.commons.math.stat.descriptive.moment.Variance();
        variance32.clear();
        boolean boolean34 = variance28.equals((java.lang.Object) variance32);
        org.apache.commons.math.stat.descriptive.moment.SecondMoment secondMoment35 = new org.apache.commons.math.stat.descriptive.moment.SecondMoment();
        secondMoment35.increment(1.0d);
        double[] doubleArray41 = new double[] { (-1L), 0, 10L };
        secondMoment35.incrementAll(doubleArray41, 0, 0);
        double[] doubleArray47 = new double[] { 10, (byte) 100 };
        double double48 = secondMoment35.evaluate(doubleArray47);
        secondMoment35.clear();
        boolean boolean50 = variance32.equals((java.lang.Object) secondMoment35);
        boolean boolean51 = variance32.isBiasCorrected();
        variance32.increment((double) (short) -1);
        org.apache.commons.math.stat.descriptive.moment.SecondMoment secondMoment55 = new org.apache.commons.math.stat.descriptive.moment.SecondMoment();
        secondMoment55.increment((double) ' ');
        org.apache.commons.math.stat.descriptive.moment.Variance variance58 = new org.apache.commons.math.stat.descriptive.moment.Variance(secondMoment55);
        secondMoment55.clear();
        org.apache.commons.math.stat.descriptive.moment.Variance variance60 = new org.apache.commons.math.stat.descriptive.moment.Variance(true, secondMoment55);
        long long61 = variance60.getN();
        double double62 = variance60.getResult();
        boolean boolean63 = variance60.isBiasCorrected();
        variance60.increment(5.49755813888E11d);
        boolean boolean66 = variance60.isBiasCorrected();
        org.apache.commons.math.stat.descriptive.moment.Variance variance68 = new org.apache.commons.math.stat.descriptive.moment.Variance(true);
        long long69 = variance68.getN();
        org.apache.commons.math.stat.descriptive.moment.SecondMoment secondMoment70 = new org.apache.commons.math.stat.descriptive.moment.SecondMoment();
        secondMoment70.increment(1.0d);
        secondMoment70.increment((double) (short) 0);
        double double75 = secondMoment70.getResult();
        org.apache.commons.math.stat.descriptive.moment.SecondMoment secondMoment76 = new org.apache.commons.math.stat.descriptive.moment.SecondMoment();
        secondMoment76.increment(1.0d);
        double[] doubleArray82 = new double[] { (-1L), 0, 10L };
        secondMoment76.incrementAll(doubleArray82, 0, 0);
        double double86 = secondMoment70.evaluate(doubleArray82);
        double double88 = variance68.evaluate(doubleArray82, (double) 4L);
        double double89 = variance60.evaluate(doubleArray82);
        double double91 = variance32.evaluate(doubleArray82, (double) (short) 0);
        // The following exception was thrown during execution in test generation
        try {
            double double94 = secondMoment0.evaluate(doubleArray82, (int) (byte) -1, (int) (byte) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: start position cannot be negative");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(doubleArray9);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray9), "[0.0, 1.0, 6140.666666666667, 544.5, 100.0]");
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 2.880385675555556E7d + "'", double10 == 2.880385675555556E7d);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertTrue("'" + double25 + "' != '" + 3.033666413425926E7d + "'", double25 == 3.033666413425926E7d);
        org.junit.Assert.assertTrue("'" + double26 + "' != '" + 3.033666413425926E7d + "'", double26 == 3.033666413425926E7d);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + false + "'", boolean29 == false);
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + false + "'", boolean31 == false);
        org.junit.Assert.assertTrue("'" + boolean34 + "' != '" + true + "'", boolean34 == true);
        org.junit.Assert.assertNotNull(doubleArray41);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray41), "[-1.0, 0.0, 10.0]");
        org.junit.Assert.assertNotNull(doubleArray47);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray47), "[10.0, 100.0]");
        org.junit.Assert.assertTrue("'" + double48 + "' != '" + 4050.0d + "'", double48 == 4050.0d);
        org.junit.Assert.assertTrue("'" + boolean50 + "' != '" + true + "'", boolean50 == true);
        org.junit.Assert.assertTrue("'" + boolean51 + "' != '" + true + "'", boolean51 == true);
        org.junit.Assert.assertTrue("'" + long61 + "' != '" + 0L + "'", long61 == 0L);
        org.junit.Assert.assertTrue(Double.isNaN(double62));
        org.junit.Assert.assertTrue("'" + boolean63 + "' != '" + true + "'", boolean63 == true);
        org.junit.Assert.assertTrue("'" + boolean66 + "' != '" + true + "'", boolean66 == true);
        org.junit.Assert.assertTrue("'" + long69 + "' != '" + 0L + "'", long69 == 0L);
        org.junit.Assert.assertTrue("'" + double75 + "' != '" + 0.5d + "'", double75 == 0.5d);
        org.junit.Assert.assertNotNull(doubleArray82);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray82), "[-1.0, 0.0, 10.0]");
        org.junit.Assert.assertTrue("'" + double86 + "' != '" + 74.0d + "'", double86 == 74.0d);
        org.junit.Assert.assertTrue("'" + double88 + "' != '" + 37.0d + "'", double88 == 37.0d);
        org.junit.Assert.assertTrue("'" + double89 + "' != '" + 37.0d + "'", double89 == 37.0d);
        org.junit.Assert.assertTrue("'" + double91 + "' != '" + 37.0d + "'", double91 == 37.0d);
    }

    @Test
    public void test16613() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest33.test16613");
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
        variance0.increment(4.242194853333334E7d);
        long long70 = variance0.getN();
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
        org.junit.Assert.assertTrue("'" + double51 + "' != '" + 0.5d + "'", double51 == 0.5d);
        org.junit.Assert.assertNotNull(doubleArray58);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray58), "[-1.0, 0.0, 10.0]");
        org.junit.Assert.assertTrue("'" + double62 + "' != '" + 74.0d + "'", double62 == 74.0d);
        org.junit.Assert.assertNotNull(doubleArray63);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray63), "[]");
        org.junit.Assert.assertTrue("'" + double65 + "' != '" + 0.0d + "'", double65 == 0.0d);
        org.junit.Assert.assertTrue("'" + long70 + "' != '" + 1L + "'", long70 == 1L);
    }

    @Test
    public void test16614() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest33.test16614");
        org.apache.commons.math.stat.descriptive.moment.SecondMoment secondMoment0 = new org.apache.commons.math.stat.descriptive.moment.SecondMoment();
        secondMoment0.increment((double) ' ');
        org.apache.commons.math.stat.descriptive.moment.Variance variance3 = new org.apache.commons.math.stat.descriptive.moment.Variance(secondMoment0);
        double double4 = variance3.getResult();
        double double5 = variance3.getResult();
        boolean boolean6 = variance3.isBiasCorrected();
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 0.0d + "'", double4 == 0.0d);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
    }

    @Test
    public void test16615() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest33.test16615");
        org.apache.commons.math.stat.descriptive.moment.SecondMoment secondMoment0 = new org.apache.commons.math.stat.descriptive.moment.SecondMoment();
        secondMoment0.increment(1.0d);
        double[] doubleArray6 = new double[] { (-1L), 0, 10L };
        secondMoment0.incrementAll(doubleArray6, 0, 0);
        org.apache.commons.math.stat.descriptive.moment.Variance variance10 = new org.apache.commons.math.stat.descriptive.moment.Variance(secondMoment0);
        double double11 = variance10.getResult();
        variance10.increment(2312.0d);
        long long14 = variance10.getN();
        org.junit.Assert.assertNotNull(doubleArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray6), "[-1.0, 0.0, 10.0]");
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 0.0d + "'", double11 == 0.0d);
        org.junit.Assert.assertTrue("'" + long14 + "' != '" + 1L + "'", long14 == 1L);
    }

    @Test
    public void test16616() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest33.test16616");
        org.apache.commons.math.stat.descriptive.moment.SecondMoment secondMoment1 = new org.apache.commons.math.stat.descriptive.moment.SecondMoment();
        secondMoment1.increment(1.0d);
        secondMoment1.increment((double) (short) 0);
        double double6 = secondMoment1.getResult();
        org.apache.commons.math.stat.descriptive.moment.SecondMoment secondMoment7 = new org.apache.commons.math.stat.descriptive.moment.SecondMoment();
        secondMoment7.increment(1.0d);
        double[] doubleArray13 = new double[] { (-1L), 0, 10L };
        secondMoment7.incrementAll(doubleArray13, 0, 0);
        double double17 = secondMoment1.evaluate(doubleArray13);
        long long18 = secondMoment1.getN();
        org.apache.commons.math.stat.descriptive.moment.Variance variance19 = new org.apache.commons.math.stat.descriptive.moment.Variance(secondMoment1);
        double double20 = secondMoment1.getResult();
        org.apache.commons.math.stat.descriptive.moment.Variance variance21 = new org.apache.commons.math.stat.descriptive.moment.Variance(false, secondMoment1);
        variance21.increment((double) 10.0f);
        org.apache.commons.math.stat.descriptive.moment.SecondMoment secondMoment24 = new org.apache.commons.math.stat.descriptive.moment.SecondMoment();
        secondMoment24.increment((double) ' ');
        org.apache.commons.math.stat.descriptive.moment.Variance variance27 = new org.apache.commons.math.stat.descriptive.moment.Variance(secondMoment24);
        secondMoment24.increment((double) (short) -1);
        secondMoment24.clear();
        secondMoment24.increment((double) 0L);
        org.apache.commons.math.stat.descriptive.moment.Variance variance33 = new org.apache.commons.math.stat.descriptive.moment.Variance(secondMoment24);
        org.apache.commons.math.stat.descriptive.moment.SecondMoment secondMoment34 = new org.apache.commons.math.stat.descriptive.moment.SecondMoment();
        secondMoment34.increment(1.0d);
        double[] doubleArray40 = new double[] { (-1L), 0, 10L };
        secondMoment34.incrementAll(doubleArray40, 0, 0);
        variance33.incrementAll(doubleArray40);
        org.apache.commons.math.stat.descriptive.moment.SecondMoment secondMoment45 = new org.apache.commons.math.stat.descriptive.moment.SecondMoment();
        secondMoment45.increment((double) ' ');
        org.apache.commons.math.stat.descriptive.moment.Variance variance48 = new org.apache.commons.math.stat.descriptive.moment.Variance(secondMoment45);
        secondMoment45.increment((double) (short) -1);
        secondMoment45.clear();
        secondMoment45.increment((double) 0L);
        org.apache.commons.math.stat.descriptive.moment.Variance variance54 = new org.apache.commons.math.stat.descriptive.moment.Variance(secondMoment45);
        org.apache.commons.math.stat.descriptive.moment.SecondMoment secondMoment55 = new org.apache.commons.math.stat.descriptive.moment.SecondMoment();
        secondMoment55.increment(1.0d);
        secondMoment55.increment((double) (short) 0);
        double double60 = secondMoment55.getResult();
        org.apache.commons.math.stat.descriptive.moment.SecondMoment secondMoment61 = new org.apache.commons.math.stat.descriptive.moment.SecondMoment();
        secondMoment61.increment(1.0d);
        double[] doubleArray67 = new double[] { (-1L), 0, 10L };
        secondMoment61.incrementAll(doubleArray67, 0, 0);
        double double71 = secondMoment55.evaluate(doubleArray67);
        double double72 = secondMoment45.evaluate(doubleArray67);
        double double73 = variance33.evaluate(doubleArray67);
        double double74 = variance21.evaluate(doubleArray67);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.5d + "'", double6 == 0.5d);
        org.junit.Assert.assertNotNull(doubleArray13);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray13), "[-1.0, 0.0, 10.0]");
        org.junit.Assert.assertTrue("'" + double17 + "' != '" + 74.0d + "'", double17 == 74.0d);
        org.junit.Assert.assertTrue("'" + long18 + "' != '" + 3L + "'", long18 == 3L);
        org.junit.Assert.assertTrue("'" + double20 + "' != '" + 74.0d + "'", double20 == 74.0d);
        org.junit.Assert.assertNotNull(doubleArray40);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray40), "[-1.0, 0.0, 10.0]");
        org.junit.Assert.assertTrue("'" + double60 + "' != '" + 0.5d + "'", double60 == 0.5d);
        org.junit.Assert.assertNotNull(doubleArray67);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray67), "[-1.0, 0.0, 10.0]");
        org.junit.Assert.assertTrue("'" + double71 + "' != '" + 74.0d + "'", double71 == 74.0d);
        org.junit.Assert.assertTrue("'" + double72 + "' != '" + 74.0d + "'", double72 == 74.0d);
        org.junit.Assert.assertTrue("'" + double73 + "' != '" + 37.0d + "'", double73 == 37.0d);
        org.junit.Assert.assertTrue("'" + double74 + "' != '" + 24.666666666666668d + "'", double74 == 24.666666666666668d);
    }

    @Test
    public void test16617() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest33.test16617");
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
        org.apache.commons.math.stat.descriptive.moment.Variance variance20 = new org.apache.commons.math.stat.descriptive.moment.Variance(secondMoment1);
        secondMoment1.increment(5.5310751405070744E14d);
        org.apache.commons.math.stat.descriptive.moment.Variance variance23 = new org.apache.commons.math.stat.descriptive.moment.Variance(true, secondMoment1);
        variance23.clear();
        variance23.clear();
        org.junit.Assert.assertNotNull(doubleArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray7), "[-1.0, 0.0, 10.0]");
        org.junit.Assert.assertNotNull(doubleArray13);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray13), "[10.0, 100.0]");
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + 4050.0d + "'", double14 == 4050.0d);
        org.junit.Assert.assertTrue("'" + long15 + "' != '" + 2L + "'", long15 == 2L);
        org.junit.Assert.assertTrue(Double.isNaN(double18));
    }

    @Test
    public void test16618() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest33.test16618");
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
        long long51 = secondMoment1.getN();
        long long52 = secondMoment1.getN();
        secondMoment1.increment(55.0d);
        org.apache.commons.math.stat.descriptive.moment.SecondMoment secondMoment55 = new org.apache.commons.math.stat.descriptive.moment.SecondMoment();
        long long56 = secondMoment55.getN();
        double double57 = secondMoment55.getResult();
        secondMoment55.increment(4049.9999999999995d);
        secondMoment55.increment(1801.0d);
        secondMoment55.clear();
        secondMoment55.increment(1.1063310666666666E7d);
        boolean boolean65 = secondMoment1.equals((java.lang.Object) secondMoment55);
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
        org.junit.Assert.assertTrue("'" + long51 + "' != '" + 3L + "'", long51 == 3L);
        org.junit.Assert.assertTrue("'" + long52 + "' != '" + 3L + "'", long52 == 3L);
        org.junit.Assert.assertTrue("'" + long56 + "' != '" + 0L + "'", long56 == 0L);
        org.junit.Assert.assertTrue(Double.isNaN(double57));
        org.junit.Assert.assertTrue("'" + boolean65 + "' != '" + false + "'", boolean65 == false);
    }

    @Test
    public void test16619() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest33.test16619");
        org.apache.commons.math.stat.descriptive.moment.SecondMoment secondMoment1 = new org.apache.commons.math.stat.descriptive.moment.SecondMoment();
        secondMoment1.increment(1.0d);
        secondMoment1.increment((double) (short) 0);
        double double6 = secondMoment1.getResult();
        secondMoment1.clear();
        org.apache.commons.math.stat.descriptive.moment.Variance variance8 = new org.apache.commons.math.stat.descriptive.moment.Variance(false, secondMoment1);
        double double9 = secondMoment1.getResult();
        secondMoment1.increment(0.0d);
        org.apache.commons.math.stat.descriptive.moment.Variance variance12 = new org.apache.commons.math.stat.descriptive.moment.Variance();
        org.apache.commons.math.stat.descriptive.moment.SecondMoment secondMoment13 = new org.apache.commons.math.stat.descriptive.moment.SecondMoment();
        secondMoment13.increment((double) ' ');
        org.apache.commons.math.stat.descriptive.moment.Variance variance16 = new org.apache.commons.math.stat.descriptive.moment.Variance(secondMoment13);
        secondMoment13.increment((double) (short) -1);
        secondMoment13.clear();
        secondMoment13.increment((double) 0L);
        org.apache.commons.math.stat.descriptive.moment.Variance variance22 = new org.apache.commons.math.stat.descriptive.moment.Variance(secondMoment13);
        org.apache.commons.math.stat.descriptive.moment.SecondMoment secondMoment23 = new org.apache.commons.math.stat.descriptive.moment.SecondMoment();
        secondMoment23.increment(1.0d);
        double[] doubleArray29 = new double[] { (-1L), 0, 10L };
        secondMoment23.incrementAll(doubleArray29, 0, 0);
        variance22.incrementAll(doubleArray29);
        variance12.incrementAll(doubleArray29);
        double double35 = secondMoment1.evaluate(doubleArray29);
        org.apache.commons.math.stat.descriptive.moment.Variance variance36 = new org.apache.commons.math.stat.descriptive.moment.Variance(secondMoment1);
        variance36.increment(6.3641762E7d);
        variance36.increment(148.0d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.5d + "'", double6 == 0.5d);
        org.junit.Assert.assertTrue(Double.isNaN(double9));
        org.junit.Assert.assertNotNull(doubleArray29);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray29), "[-1.0, 0.0, 10.0]");
        org.junit.Assert.assertTrue("'" + double35 + "' != '" + 74.0d + "'", double35 == 74.0d);
    }

    @Test
    public void test16620() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest33.test16620");
        org.apache.commons.math.stat.descriptive.moment.SecondMoment secondMoment0 = new org.apache.commons.math.stat.descriptive.moment.SecondMoment();
        secondMoment0.increment((double) ' ');
        org.apache.commons.math.stat.descriptive.moment.Variance variance3 = new org.apache.commons.math.stat.descriptive.moment.Variance(secondMoment0);
        secondMoment0.increment((double) (short) -1);
        secondMoment0.clear();
        secondMoment0.increment((double) 0L);
        org.apache.commons.math.stat.descriptive.moment.Variance variance9 = new org.apache.commons.math.stat.descriptive.moment.Variance(secondMoment0);
        long long10 = variance9.getN();
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
        double double34 = variance9.evaluate(doubleArray31);
        variance9.increment((double) (byte) -1);
        variance9.increment((double) 0L);
        variance9.clear();
        boolean boolean40 = variance9.isBiasCorrected();
        variance9.clear();
        long long42 = variance9.getN();
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + 1L + "'", long10 == 1L);
        org.junit.Assert.assertTrue("'" + double19 + "' != '" + 0.5d + "'", double19 == 0.5d);
        org.junit.Assert.assertNotNull(doubleArray26);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray26), "[-1.0, 0.0, 10.0]");
        org.junit.Assert.assertTrue("'" + double30 + "' != '" + 74.0d + "'", double30 == 74.0d);
        org.junit.Assert.assertNotNull(doubleArray31);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray31), "[]");
        org.junit.Assert.assertTrue("'" + double33 + "' != '" + 0.0d + "'", double33 == 0.0d);
        org.junit.Assert.assertTrue(Double.isNaN(double34));
        org.junit.Assert.assertTrue("'" + boolean40 + "' != '" + true + "'", boolean40 == true);
        org.junit.Assert.assertTrue("'" + long42 + "' != '" + 1L + "'", long42 == 1L);
    }

    @Test
    public void test16621() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest33.test16621");
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
        secondMoment0.increment((double) (-1.0f));
        secondMoment0.clear();
        org.apache.commons.math.stat.descriptive.moment.Variance variance31 = new org.apache.commons.math.stat.descriptive.moment.Variance(secondMoment0);
        secondMoment0.clear();
        secondMoment0.clear();
        org.junit.Assert.assertTrue(Double.isNaN(double7));
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 0.5d + "'", double13 == 0.5d);
        org.junit.Assert.assertNotNull(doubleArray20);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray20), "[-1.0, 0.0, 10.0]");
        org.junit.Assert.assertTrue("'" + double24 + "' != '" + 74.0d + "'", double24 == 74.0d);
    }

    @Test
    public void test16622() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest33.test16622");
        org.apache.commons.math.stat.descriptive.moment.SecondMoment secondMoment0 = new org.apache.commons.math.stat.descriptive.moment.SecondMoment();
        secondMoment0.increment((double) ' ');
        org.apache.commons.math.stat.descriptive.moment.Variance variance3 = new org.apache.commons.math.stat.descriptive.moment.Variance(secondMoment0);
        secondMoment0.increment((double) '4');
        org.apache.commons.math.stat.descriptive.moment.SecondMoment secondMoment7 = new org.apache.commons.math.stat.descriptive.moment.SecondMoment();
        secondMoment7.increment((double) ' ');
        org.apache.commons.math.stat.descriptive.moment.Variance variance10 = new org.apache.commons.math.stat.descriptive.moment.Variance(secondMoment7);
        org.apache.commons.math.stat.descriptive.moment.Variance variance11 = new org.apache.commons.math.stat.descriptive.moment.Variance(false, secondMoment7);
        variance11.setBiasCorrected(false);
        org.apache.commons.math.stat.descriptive.moment.Variance variance14 = new org.apache.commons.math.stat.descriptive.moment.Variance();
        org.apache.commons.math.stat.descriptive.moment.SecondMoment secondMoment15 = new org.apache.commons.math.stat.descriptive.moment.SecondMoment();
        secondMoment15.increment(1.0d);
        secondMoment15.increment((double) (short) 0);
        double double20 = secondMoment15.getResult();
        org.apache.commons.math.stat.descriptive.moment.SecondMoment secondMoment21 = new org.apache.commons.math.stat.descriptive.moment.SecondMoment();
        secondMoment21.increment(1.0d);
        double[] doubleArray27 = new double[] { (-1L), 0, 10L };
        secondMoment21.incrementAll(doubleArray27, 0, 0);
        double double31 = secondMoment15.evaluate(doubleArray27);
        double[] doubleArray32 = new double[] {};
        secondMoment15.incrementAll(doubleArray32);
        double double36 = variance14.evaluate(doubleArray32, (int) (byte) 0, 0);
        long long37 = variance14.getN();
        org.apache.commons.math.stat.descriptive.moment.SecondMoment secondMoment38 = new org.apache.commons.math.stat.descriptive.moment.SecondMoment();
        secondMoment38.increment(1.0d);
        secondMoment38.increment((double) (short) 0);
        double double43 = secondMoment38.getResult();
        org.apache.commons.math.stat.descriptive.moment.SecondMoment secondMoment44 = new org.apache.commons.math.stat.descriptive.moment.SecondMoment();
        secondMoment44.increment(1.0d);
        double[] doubleArray50 = new double[] { (-1L), 0, 10L };
        secondMoment44.incrementAll(doubleArray50, 0, 0);
        double double54 = secondMoment38.evaluate(doubleArray50);
        variance14.incrementAll(doubleArray50);
        long long56 = variance14.getN();
        org.apache.commons.math.stat.descriptive.moment.SecondMoment secondMoment57 = new org.apache.commons.math.stat.descriptive.moment.SecondMoment();
        secondMoment57.increment(1.0d);
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
        double double79 = secondMoment57.evaluate(doubleArray77);
        variance14.incrementAll(doubleArray77);
        double double83 = variance11.evaluate(doubleArray77, (int) (byte) 0, 0);
        secondMoment0.incrementAll(doubleArray77, 0, (int) (short) 0);
        secondMoment0.increment(4359228.988683127d);
        secondMoment0.increment(4359228.988683127d);
        org.junit.Assert.assertTrue("'" + double20 + "' != '" + 0.5d + "'", double20 == 0.5d);
        org.junit.Assert.assertNotNull(doubleArray27);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray27), "[-1.0, 0.0, 10.0]");
        org.junit.Assert.assertTrue("'" + double31 + "' != '" + 74.0d + "'", double31 == 74.0d);
        org.junit.Assert.assertNotNull(doubleArray32);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray32), "[]");
        org.junit.Assert.assertTrue(Double.isNaN(double36));
        org.junit.Assert.assertTrue("'" + long37 + "' != '" + 0L + "'", long37 == 0L);
        org.junit.Assert.assertTrue("'" + double43 + "' != '" + 0.5d + "'", double43 == 0.5d);
        org.junit.Assert.assertNotNull(doubleArray50);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray50), "[-1.0, 0.0, 10.0]");
        org.junit.Assert.assertTrue("'" + double54 + "' != '" + 74.0d + "'", double54 == 74.0d);
        org.junit.Assert.assertTrue("'" + long56 + "' != '" + 3L + "'", long56 == 3L);
        org.junit.Assert.assertTrue("'" + double65 + "' != '" + 0.5d + "'", double65 == 0.5d);
        org.junit.Assert.assertNotNull(doubleArray72);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray72), "[-1.0, 0.0, 10.0]");
        org.junit.Assert.assertTrue("'" + double76 + "' != '" + 74.0d + "'", double76 == 74.0d);
        org.junit.Assert.assertNotNull(doubleArray77);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray77), "[]");
        org.junit.Assert.assertTrue("'" + double79 + "' != '" + 0.0d + "'", double79 == 0.0d);
        org.junit.Assert.assertTrue(Double.isNaN(double83));
    }

    @Test
    public void test16623() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest33.test16623");
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
        long long22 = secondMoment3.getN();
        secondMoment3.clear();
        double double24 = secondMoment3.getResult();
        org.apache.commons.math.stat.descriptive.moment.Variance variance25 = new org.apache.commons.math.stat.descriptive.moment.Variance(false, secondMoment3);
        long long26 = secondMoment3.getN();
        secondMoment3.increment(7024.75d);
        org.junit.Assert.assertNotNull(doubleArray9);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray9), "[-1.0, 0.0, 10.0]");
        org.junit.Assert.assertNotNull(doubleArray15);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray15), "[10.0, 100.0]");
        org.junit.Assert.assertTrue("'" + double16 + "' != '" + 4050.0d + "'", double16 == 4050.0d);
        org.junit.Assert.assertTrue("'" + double17 + "' != '" + 4050.0d + "'", double17 == 4050.0d);
        org.junit.Assert.assertTrue("'" + long19 + "' != '" + 2L + "'", long19 == 2L);
        org.junit.Assert.assertTrue("'" + double21 + "' != '" + 4050.0d + "'", double21 == 4050.0d);
        org.junit.Assert.assertTrue("'" + long22 + "' != '" + 2L + "'", long22 == 2L);
        org.junit.Assert.assertTrue(Double.isNaN(double24));
        org.junit.Assert.assertTrue("'" + long26 + "' != '" + 0L + "'", long26 == 0L);
    }

    @Test
    public void test16624() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest33.test16624");
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
        double double28 = secondMoment0.getResult();
        secondMoment0.increment(4034.0d);
        secondMoment0.clear();
        long long32 = secondMoment0.getN();
        secondMoment0.clear();
        double double34 = secondMoment0.getResult();
        org.junit.Assert.assertTrue("'" + double15 + "' != '" + 0.5d + "'", double15 == 0.5d);
        org.junit.Assert.assertNotNull(doubleArray22);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray22), "[-1.0, 0.0, 10.0]");
        org.junit.Assert.assertTrue("'" + double26 + "' != '" + 74.0d + "'", double26 == 74.0d);
        org.junit.Assert.assertTrue("'" + double27 + "' != '" + 74.0d + "'", double27 == 74.0d);
        org.junit.Assert.assertTrue("'" + double28 + "' != '" + 74.0d + "'", double28 == 74.0d);
        org.junit.Assert.assertTrue("'" + long32 + "' != '" + 0L + "'", long32 == 0L);
        org.junit.Assert.assertTrue(Double.isNaN(double34));
    }

    @Test
    public void test16625() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest33.test16625");
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
        secondMoment0.increment((double) (-1L));
        secondMoment0.clear();
        secondMoment0.increment((double) (short) -1);
        org.apache.commons.math.stat.descriptive.moment.SecondMoment secondMoment36 = new org.apache.commons.math.stat.descriptive.moment.SecondMoment();
        secondMoment36.increment(1.0d);
        double[] doubleArray42 = new double[] { (-1L), 0, 10L };
        secondMoment36.incrementAll(doubleArray42, 0, 0);
        long long46 = secondMoment36.getN();
        org.apache.commons.math.stat.descriptive.moment.Variance variance47 = new org.apache.commons.math.stat.descriptive.moment.Variance(secondMoment36);
        secondMoment36.increment(544.5d);
        secondMoment36.clear();
        double double51 = secondMoment36.getResult();
        org.apache.commons.math.stat.descriptive.moment.Variance variance52 = new org.apache.commons.math.stat.descriptive.moment.Variance(secondMoment36);
        boolean boolean53 = secondMoment0.equals((java.lang.Object) secondMoment36);
        org.apache.commons.math.stat.descriptive.moment.SecondMoment secondMoment54 = new org.apache.commons.math.stat.descriptive.moment.SecondMoment();
        secondMoment54.increment(1.0d);
        secondMoment54.clear();
        double double58 = secondMoment54.getResult();
        org.apache.commons.math.stat.descriptive.moment.SecondMoment secondMoment59 = new org.apache.commons.math.stat.descriptive.moment.SecondMoment();
        secondMoment59.increment(1.0d);
        secondMoment59.increment((double) (short) 0);
        double double64 = secondMoment59.getResult();
        org.apache.commons.math.stat.descriptive.moment.SecondMoment secondMoment65 = new org.apache.commons.math.stat.descriptive.moment.SecondMoment();
        secondMoment65.increment(1.0d);
        double[] doubleArray71 = new double[] { (-1L), 0, 10L };
        secondMoment65.incrementAll(doubleArray71, 0, 0);
        double double75 = secondMoment59.evaluate(doubleArray71);
        double double76 = secondMoment54.evaluate(doubleArray71);
        double double77 = secondMoment36.evaluate(doubleArray71);
        double double78 = secondMoment36.getResult();
        org.junit.Assert.assertNotNull(doubleArray12);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray12), "[-1.0, 0.0, 10.0]");
        org.junit.Assert.assertTrue("'" + long17 + "' != '" + 1L + "'", long17 == 1L);
        org.junit.Assert.assertNotNull(doubleArray24);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray24), "[-1.0, 0.0, 10.0]");
        org.junit.Assert.assertTrue("'" + double29 + "' != '" + 37.0d + "'", double29 == 37.0d);
        org.junit.Assert.assertTrue("'" + double30 + "' != '" + 74.0d + "'", double30 == 74.0d);
        org.junit.Assert.assertNotNull(doubleArray42);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray42), "[-1.0, 0.0, 10.0]");
        org.junit.Assert.assertTrue("'" + long46 + "' != '" + 1L + "'", long46 == 1L);
        org.junit.Assert.assertTrue(Double.isNaN(double51));
        org.junit.Assert.assertTrue("'" + boolean53 + "' != '" + false + "'", boolean53 == false);
        org.junit.Assert.assertTrue(Double.isNaN(double58));
        org.junit.Assert.assertTrue("'" + double64 + "' != '" + 0.5d + "'", double64 == 0.5d);
        org.junit.Assert.assertNotNull(doubleArray71);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray71), "[-1.0, 0.0, 10.0]");
        org.junit.Assert.assertTrue("'" + double75 + "' != '" + 74.0d + "'", double75 == 74.0d);
        org.junit.Assert.assertTrue("'" + double76 + "' != '" + 74.0d + "'", double76 == 74.0d);
        org.junit.Assert.assertTrue("'" + double77 + "' != '" + 74.0d + "'", double77 == 74.0d);
        org.junit.Assert.assertTrue("'" + double78 + "' != '" + 74.0d + "'", double78 == 74.0d);
    }

    @Test
    public void test16626() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest33.test16626");
        org.apache.commons.math.stat.descriptive.moment.SecondMoment secondMoment0 = new org.apache.commons.math.stat.descriptive.moment.SecondMoment();
        secondMoment0.increment((double) ' ');
        org.apache.commons.math.stat.descriptive.moment.Variance variance3 = new org.apache.commons.math.stat.descriptive.moment.Variance(secondMoment0);
        secondMoment0.increment(272.25d);
        long long6 = secondMoment0.getN();
        secondMoment0.increment(1.8756123185185187E7d);
        double double9 = secondMoment0.getResult();
        org.apache.commons.math.stat.descriptive.moment.Variance variance10 = new org.apache.commons.math.stat.descriptive.moment.Variance(secondMoment0);
        double double11 = variance10.getResult();
        variance10.clear();
        variance10.clear();
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 2L + "'", long6 == 2L);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 2.3452430030252953E14d + "'", double9 == 2.3452430030252953E14d);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 1.1726215015126477E14d + "'", double11 == 1.1726215015126477E14d);
    }

    @Test
    public void test16627() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest33.test16627");
        org.apache.commons.math.stat.descriptive.moment.Variance variance1 = new org.apache.commons.math.stat.descriptive.moment.Variance(true);
        long long2 = variance1.getN();
        double double3 = variance1.getResult();
        double double4 = variance1.getResult();
        long long5 = variance1.getN();
        boolean boolean6 = variance1.isBiasCorrected();
        double double7 = variance1.getResult();
        double double8 = variance1.getResult();
        variance1.clear();
        org.apache.commons.math.stat.descriptive.moment.SecondMoment secondMoment10 = new org.apache.commons.math.stat.descriptive.moment.SecondMoment();
        secondMoment10.increment((double) ' ');
        org.apache.commons.math.stat.descriptive.moment.Variance variance13 = new org.apache.commons.math.stat.descriptive.moment.Variance(secondMoment10);
        secondMoment10.increment((double) (short) -1);
        secondMoment10.clear();
        secondMoment10.increment((double) 0L);
        org.apache.commons.math.stat.descriptive.moment.Variance variance19 = new org.apache.commons.math.stat.descriptive.moment.Variance(secondMoment10);
        org.apache.commons.math.stat.descriptive.moment.SecondMoment secondMoment20 = new org.apache.commons.math.stat.descriptive.moment.SecondMoment();
        secondMoment20.increment(1.0d);
        secondMoment20.increment((double) (short) 0);
        double double25 = secondMoment20.getResult();
        org.apache.commons.math.stat.descriptive.moment.SecondMoment secondMoment26 = new org.apache.commons.math.stat.descriptive.moment.SecondMoment();
        secondMoment26.increment(1.0d);
        double[] doubleArray32 = new double[] { (-1L), 0, 10L };
        secondMoment26.incrementAll(doubleArray32, 0, 0);
        double double36 = secondMoment20.evaluate(doubleArray32);
        double double37 = secondMoment10.evaluate(doubleArray32);
        double double38 = secondMoment10.getResult();
        secondMoment10.increment(4034.0d);
        double double41 = secondMoment10.getResult();
        boolean boolean42 = variance1.equals((java.lang.Object) double41);
        long long43 = variance1.getN();
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 0L + "'", long2 == 0L);
        org.junit.Assert.assertTrue(Double.isNaN(double3));
        org.junit.Assert.assertTrue(Double.isNaN(double4));
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 0L + "'", long5 == 0L);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue(Double.isNaN(double7));
        org.junit.Assert.assertTrue(Double.isNaN(double8));
        org.junit.Assert.assertTrue("'" + double25 + "' != '" + 0.5d + "'", double25 == 0.5d);
        org.junit.Assert.assertNotNull(doubleArray32);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray32), "[-1.0, 0.0, 10.0]");
        org.junit.Assert.assertTrue("'" + double36 + "' != '" + 74.0d + "'", double36 == 74.0d);
        org.junit.Assert.assertTrue("'" + double37 + "' != '" + 74.0d + "'", double37 == 74.0d);
        org.junit.Assert.assertTrue("'" + double38 + "' != '" + 74.0d + "'", double38 == 74.0d);
        org.junit.Assert.assertTrue("'" + double41 + "' != '" + 1.218679475E7d + "'", double41 == 1.218679475E7d);
        org.junit.Assert.assertTrue("'" + boolean42 + "' != '" + false + "'", boolean42 == false);
        org.junit.Assert.assertTrue("'" + long43 + "' != '" + 0L + "'", long43 == 0L);
    }

    @Test
    public void test16628() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest33.test16628");
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
        long long26 = secondMoment15.getN();
        org.apache.commons.math.stat.descriptive.moment.Variance variance27 = new org.apache.commons.math.stat.descriptive.moment.Variance(secondMoment15);
        org.apache.commons.math.stat.descriptive.moment.SecondMoment secondMoment28 = new org.apache.commons.math.stat.descriptive.moment.SecondMoment();
        secondMoment28.increment((double) ' ');
        double double31 = secondMoment28.getResult();
        double double32 = secondMoment28.getResult();
        org.apache.commons.math.stat.descriptive.moment.SecondMoment secondMoment33 = new org.apache.commons.math.stat.descriptive.moment.SecondMoment();
        secondMoment33.increment(1.0d);
        double[] doubleArray39 = new double[] { (-1L), 0, 10L };
        secondMoment33.incrementAll(doubleArray39, 0, 0);
        double[] doubleArray45 = new double[] { 10, (byte) 100 };
        double double46 = secondMoment33.evaluate(doubleArray45);
        double double47 = secondMoment28.evaluate(doubleArray45);
        org.apache.commons.math.stat.descriptive.moment.Variance variance48 = new org.apache.commons.math.stat.descriptive.moment.Variance();
        org.apache.commons.math.stat.descriptive.moment.SecondMoment secondMoment49 = new org.apache.commons.math.stat.descriptive.moment.SecondMoment();
        secondMoment49.increment(1.0d);
        secondMoment49.increment((double) (short) 0);
        double double54 = secondMoment49.getResult();
        org.apache.commons.math.stat.descriptive.moment.SecondMoment secondMoment55 = new org.apache.commons.math.stat.descriptive.moment.SecondMoment();
        secondMoment55.increment(1.0d);
        secondMoment55.increment((double) (short) 0);
        double double60 = secondMoment55.getResult();
        org.apache.commons.math.stat.descriptive.moment.SecondMoment secondMoment61 = new org.apache.commons.math.stat.descriptive.moment.SecondMoment();
        secondMoment61.increment(1.0d);
        double[] doubleArray67 = new double[] { (-1L), 0, 10L };
        secondMoment61.incrementAll(doubleArray67, 0, 0);
        double double71 = secondMoment55.evaluate(doubleArray67);
        double[] doubleArray72 = new double[] {};
        secondMoment55.incrementAll(doubleArray72);
        secondMoment49.incrementAll(doubleArray72);
        secondMoment49.increment((double) 2L);
        org.apache.commons.math.stat.descriptive.moment.Variance variance77 = new org.apache.commons.math.stat.descriptive.moment.Variance(secondMoment49);
        org.apache.commons.math.stat.descriptive.moment.SecondMoment secondMoment78 = new org.apache.commons.math.stat.descriptive.moment.SecondMoment();
        secondMoment78.increment(1.0d);
        double[] doubleArray84 = new double[] { (-1L), 0, 10L };
        secondMoment78.incrementAll(doubleArray84, 0, 0);
        double[] doubleArray90 = new double[] { 10, (byte) 100 };
        double double91 = secondMoment78.evaluate(doubleArray90);
        double double92 = variance77.evaluate(doubleArray90);
        double double93 = variance48.evaluate(doubleArray90);
        double double94 = secondMoment28.evaluate(doubleArray90);
        boolean boolean95 = secondMoment15.equals((java.lang.Object) secondMoment28);
        secondMoment15.clear();
        org.junit.Assert.assertNotNull(doubleArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray6), "[-1.0, 0.0, 10.0]");
        org.junit.Assert.assertNotNull(doubleArray12);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray12), "[10.0, 100.0]");
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 4050.0d + "'", double13 == 4050.0d);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
        org.junit.Assert.assertTrue("'" + long26 + "' != '" + 1L + "'", long26 == 1L);
        org.junit.Assert.assertTrue("'" + double31 + "' != '" + 0.0d + "'", double31 == 0.0d);
        org.junit.Assert.assertTrue("'" + double32 + "' != '" + 0.0d + "'", double32 == 0.0d);
        org.junit.Assert.assertNotNull(doubleArray39);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray39), "[-1.0, 0.0, 10.0]");
        org.junit.Assert.assertNotNull(doubleArray45);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray45), "[10.0, 100.0]");
        org.junit.Assert.assertTrue("'" + double46 + "' != '" + 4050.0d + "'", double46 == 4050.0d);
        org.junit.Assert.assertTrue("'" + double47 + "' != '" + 4050.0d + "'", double47 == 4050.0d);
        org.junit.Assert.assertTrue("'" + double54 + "' != '" + 0.5d + "'", double54 == 0.5d);
        org.junit.Assert.assertTrue("'" + double60 + "' != '" + 0.5d + "'", double60 == 0.5d);
        org.junit.Assert.assertNotNull(doubleArray67);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray67), "[-1.0, 0.0, 10.0]");
        org.junit.Assert.assertTrue("'" + double71 + "' != '" + 74.0d + "'", double71 == 74.0d);
        org.junit.Assert.assertNotNull(doubleArray72);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray72), "[]");
        org.junit.Assert.assertNotNull(doubleArray84);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray84), "[-1.0, 0.0, 10.0]");
        org.junit.Assert.assertNotNull(doubleArray90);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray90), "[10.0, 100.0]");
        org.junit.Assert.assertTrue("'" + double91 + "' != '" + 4050.0d + "'", double91 == 4050.0d);
        org.junit.Assert.assertTrue("'" + double92 + "' != '" + 4050.0d + "'", double92 == 4050.0d);
        org.junit.Assert.assertTrue("'" + double93 + "' != '" + 4050.0d + "'", double93 == 4050.0d);
        org.junit.Assert.assertTrue("'" + double94 + "' != '" + 4050.0d + "'", double94 == 4050.0d);
        org.junit.Assert.assertTrue("'" + boolean95 + "' != '" + false + "'", boolean95 == false);
    }

    @Test
    public void test16629() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest33.test16629");
        org.apache.commons.math.stat.descriptive.moment.SecondMoment secondMoment0 = new org.apache.commons.math.stat.descriptive.moment.SecondMoment();
        secondMoment0.increment(1.0d);
        org.apache.commons.math.stat.descriptive.moment.SecondMoment secondMoment3 = new org.apache.commons.math.stat.descriptive.moment.SecondMoment();
        secondMoment3.increment(1.0d);
        double[] doubleArray9 = new double[] { (-1L), 0, 10L };
        secondMoment3.incrementAll(doubleArray9, 0, 0);
        double[] doubleArray15 = new double[] { 10, (byte) 100 };
        double double16 = secondMoment3.evaluate(doubleArray15);
        double double17 = secondMoment0.evaluate(doubleArray15);
        double double18 = secondMoment0.getResult();
        org.apache.commons.math.stat.descriptive.moment.SecondMoment secondMoment19 = new org.apache.commons.math.stat.descriptive.moment.SecondMoment();
        secondMoment19.increment(1.0d);
        secondMoment19.increment((double) (short) 0);
        double double24 = secondMoment19.getResult();
        double double25 = secondMoment19.getResult();
        secondMoment19.increment((double) '#');
        secondMoment19.increment(1655360.891851852d);
        org.apache.commons.math.stat.descriptive.moment.SecondMoment secondMoment31 = new org.apache.commons.math.stat.descriptive.moment.SecondMoment();
        secondMoment31.increment((double) ' ');
        org.apache.commons.math.stat.descriptive.moment.Variance variance34 = new org.apache.commons.math.stat.descriptive.moment.Variance(secondMoment31);
        secondMoment31.clear();
        org.apache.commons.math.stat.descriptive.moment.Variance variance36 = new org.apache.commons.math.stat.descriptive.moment.Variance(true, secondMoment31);
        secondMoment31.clear();
        secondMoment31.increment((double) 10);
        secondMoment31.increment(2.0d);
        long long42 = secondMoment31.getN();
        org.apache.commons.math.stat.descriptive.moment.SecondMoment secondMoment43 = new org.apache.commons.math.stat.descriptive.moment.SecondMoment();
        secondMoment43.increment(1.0d);
        double[] doubleArray49 = new double[] { (-1L), 0, 10L };
        secondMoment43.incrementAll(doubleArray49, 0, 0);
        org.apache.commons.math.stat.descriptive.moment.Variance variance53 = new org.apache.commons.math.stat.descriptive.moment.Variance(secondMoment43);
        org.apache.commons.math.stat.descriptive.moment.SecondMoment secondMoment54 = new org.apache.commons.math.stat.descriptive.moment.SecondMoment();
        secondMoment54.increment(1.0d);
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
        double double76 = secondMoment54.evaluate(doubleArray74);
        double double77 = variance53.evaluate(doubleArray74);
        double double80 = secondMoment31.evaluate(doubleArray74, 0, (int) (short) 0);
        double double81 = secondMoment19.evaluate(doubleArray74);
        secondMoment0.incrementAll(doubleArray74);
        org.apache.commons.math.stat.descriptive.moment.Variance variance83 = new org.apache.commons.math.stat.descriptive.moment.Variance(secondMoment0);
        org.junit.Assert.assertNotNull(doubleArray9);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray9), "[-1.0, 0.0, 10.0]");
        org.junit.Assert.assertNotNull(doubleArray15);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray15), "[10.0, 100.0]");
        org.junit.Assert.assertTrue("'" + double16 + "' != '" + 4050.0d + "'", double16 == 4050.0d);
        org.junit.Assert.assertTrue("'" + double17 + "' != '" + 4050.0d + "'", double17 == 4050.0d);
        org.junit.Assert.assertTrue("'" + double18 + "' != '" + 4050.0d + "'", double18 == 4050.0d);
        org.junit.Assert.assertTrue("'" + double24 + "' != '" + 0.5d + "'", double24 == 0.5d);
        org.junit.Assert.assertTrue("'" + double25 + "' != '" + 0.5d + "'", double25 == 0.5d);
        org.junit.Assert.assertTrue("'" + long42 + "' != '" + 2L + "'", long42 == 2L);
        org.junit.Assert.assertNotNull(doubleArray49);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray49), "[-1.0, 0.0, 10.0]");
        org.junit.Assert.assertTrue("'" + double62 + "' != '" + 0.5d + "'", double62 == 0.5d);
        org.junit.Assert.assertNotNull(doubleArray69);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray69), "[-1.0, 0.0, 10.0]");
        org.junit.Assert.assertTrue("'" + double73 + "' != '" + 74.0d + "'", double73 == 74.0d);
        org.junit.Assert.assertNotNull(doubleArray74);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray74), "[]");
        org.junit.Assert.assertTrue("'" + double76 + "' != '" + 0.0d + "'", double76 == 0.0d);
        org.junit.Assert.assertTrue(Double.isNaN(double77));
        org.junit.Assert.assertTrue("'" + double80 + "' != '" + 32.0d + "'", double80 == 32.0d);
        org.junit.Assert.assertTrue("'" + double81 + "' != '" + 2.0551349661103657E12d + "'", double81 == 2.0551349661103657E12d);
    }

    @Test
    public void test16630() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest33.test16630");
        org.apache.commons.math.stat.descriptive.moment.SecondMoment secondMoment0 = new org.apache.commons.math.stat.descriptive.moment.SecondMoment();
        secondMoment0.increment(1.0d);
        secondMoment0.increment((double) (short) 0);
        double double5 = secondMoment0.getResult();
        secondMoment0.clear();
        long long7 = secondMoment0.getN();
        double double8 = secondMoment0.getResult();
        long long9 = secondMoment0.getN();
        secondMoment0.clear();
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.5d + "'", double5 == 0.5d);
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + 0L + "'", long7 == 0L);
        org.junit.Assert.assertTrue(Double.isNaN(double8));
        org.junit.Assert.assertTrue("'" + long9 + "' != '" + 0L + "'", long9 == 0L);
    }

    @Test
    public void test16631() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest33.test16631");
        org.apache.commons.math.stat.descriptive.moment.SecondMoment secondMoment2 = new org.apache.commons.math.stat.descriptive.moment.SecondMoment();
        secondMoment2.increment((double) ' ');
        org.apache.commons.math.stat.descriptive.moment.Variance variance5 = new org.apache.commons.math.stat.descriptive.moment.Variance(secondMoment2);
        secondMoment2.increment((double) (short) -1);
        long long8 = secondMoment2.getN();
        org.apache.commons.math.stat.descriptive.moment.Variance variance9 = new org.apache.commons.math.stat.descriptive.moment.Variance(false, secondMoment2);
        org.apache.commons.math.stat.descriptive.moment.Variance variance10 = new org.apache.commons.math.stat.descriptive.moment.Variance(secondMoment2);
        double double11 = secondMoment2.getResult();
        double double12 = secondMoment2.getResult();
        long long13 = secondMoment2.getN();
        org.apache.commons.math.stat.descriptive.moment.Variance variance14 = new org.apache.commons.math.stat.descriptive.moment.Variance(true, secondMoment2);
        org.apache.commons.math.stat.descriptive.moment.Variance variance15 = new org.apache.commons.math.stat.descriptive.moment.Variance(secondMoment2);
        secondMoment2.increment(0.0d);
        org.apache.commons.math.stat.descriptive.moment.SecondMoment secondMoment19 = new org.apache.commons.math.stat.descriptive.moment.SecondMoment();
        secondMoment19.increment((double) ' ');
        org.apache.commons.math.stat.descriptive.moment.Variance variance22 = new org.apache.commons.math.stat.descriptive.moment.Variance(secondMoment19);
        secondMoment19.increment((double) (short) -1);
        long long25 = secondMoment19.getN();
        org.apache.commons.math.stat.descriptive.moment.Variance variance26 = new org.apache.commons.math.stat.descriptive.moment.Variance(false, secondMoment19);
        org.apache.commons.math.stat.descriptive.moment.Variance variance27 = new org.apache.commons.math.stat.descriptive.moment.Variance(secondMoment19);
        double double28 = secondMoment19.getResult();
        secondMoment19.clear();
        org.apache.commons.math.stat.descriptive.moment.SecondMoment secondMoment30 = new org.apache.commons.math.stat.descriptive.moment.SecondMoment();
        secondMoment30.increment(1.0d);
        double[] doubleArray36 = new double[] { (-1L), 0, 10L };
        secondMoment30.incrementAll(doubleArray36, 0, 0);
        double[] doubleArray42 = new double[] { 10, (byte) 100 };
        double double43 = secondMoment30.evaluate(doubleArray42);
        org.apache.commons.math.stat.descriptive.moment.Variance variance44 = new org.apache.commons.math.stat.descriptive.moment.Variance();
        org.apache.commons.math.stat.descriptive.moment.SecondMoment secondMoment45 = new org.apache.commons.math.stat.descriptive.moment.SecondMoment();
        secondMoment45.increment(1.0d);
        secondMoment45.increment((double) (short) 0);
        double double50 = secondMoment45.getResult();
        org.apache.commons.math.stat.descriptive.moment.SecondMoment secondMoment51 = new org.apache.commons.math.stat.descriptive.moment.SecondMoment();
        secondMoment51.increment(1.0d);
        double[] doubleArray57 = new double[] { (-1L), 0, 10L };
        secondMoment51.incrementAll(doubleArray57, 0, 0);
        double double61 = secondMoment45.evaluate(doubleArray57);
        double[] doubleArray62 = new double[] {};
        secondMoment45.incrementAll(doubleArray62);
        double double66 = variance44.evaluate(doubleArray62, (int) (byte) 0, 0);
        double double67 = secondMoment30.evaluate(doubleArray62);
        secondMoment19.incrementAll(doubleArray62);
        // The following exception was thrown during execution in test generation
        try {
            double double71 = secondMoment2.evaluate(doubleArray62, (int) (byte) 100, (int) '#');
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: begin + length > values.length");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 2L + "'", long8 == 2L);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 544.5d + "'", double11 == 544.5d);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 544.5d + "'", double12 == 544.5d);
        org.junit.Assert.assertTrue("'" + long13 + "' != '" + 2L + "'", long13 == 2L);
        org.junit.Assert.assertTrue("'" + long25 + "' != '" + 2L + "'", long25 == 2L);
        org.junit.Assert.assertTrue("'" + double28 + "' != '" + 544.5d + "'", double28 == 544.5d);
        org.junit.Assert.assertNotNull(doubleArray36);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray36), "[-1.0, 0.0, 10.0]");
        org.junit.Assert.assertNotNull(doubleArray42);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray42), "[10.0, 100.0]");
        org.junit.Assert.assertTrue("'" + double43 + "' != '" + 4050.0d + "'", double43 == 4050.0d);
        org.junit.Assert.assertTrue("'" + double50 + "' != '" + 0.5d + "'", double50 == 0.5d);
        org.junit.Assert.assertNotNull(doubleArray57);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray57), "[-1.0, 0.0, 10.0]");
        org.junit.Assert.assertTrue("'" + double61 + "' != '" + 74.0d + "'", double61 == 74.0d);
        org.junit.Assert.assertNotNull(doubleArray62);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray62), "[]");
        org.junit.Assert.assertTrue(Double.isNaN(double66));
        org.junit.Assert.assertTrue("'" + double67 + "' != '" + 4050.0d + "'", double67 == 4050.0d);
    }

    @Test
    public void test16632() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest33.test16632");
        org.apache.commons.math.stat.descriptive.moment.SecondMoment secondMoment1 = new org.apache.commons.math.stat.descriptive.moment.SecondMoment();
        secondMoment1.increment(1.0d);
        double[] doubleArray7 = new double[] { (-1L), 0, 10L };
        secondMoment1.incrementAll(doubleArray7, 0, 0);
        double[] doubleArray13 = new double[] { 10, (byte) 100 };
        double double14 = secondMoment1.evaluate(doubleArray13);
        long long15 = secondMoment1.getN();
        double double16 = secondMoment1.getResult();
        org.apache.commons.math.stat.descriptive.moment.SecondMoment secondMoment17 = new org.apache.commons.math.stat.descriptive.moment.SecondMoment();
        secondMoment17.increment((double) ' ');
        org.apache.commons.math.stat.descriptive.moment.Variance variance20 = new org.apache.commons.math.stat.descriptive.moment.Variance(secondMoment17);
        secondMoment17.increment((double) (short) -1);
        secondMoment17.clear();
        double double24 = secondMoment17.getResult();
        org.apache.commons.math.stat.descriptive.moment.SecondMoment secondMoment25 = new org.apache.commons.math.stat.descriptive.moment.SecondMoment();
        secondMoment25.increment(1.0d);
        secondMoment25.increment((double) (short) 0);
        double double30 = secondMoment25.getResult();
        org.apache.commons.math.stat.descriptive.moment.SecondMoment secondMoment31 = new org.apache.commons.math.stat.descriptive.moment.SecondMoment();
        secondMoment31.increment(1.0d);
        double[] doubleArray37 = new double[] { (-1L), 0, 10L };
        secondMoment31.incrementAll(doubleArray37, 0, 0);
        double double41 = secondMoment25.evaluate(doubleArray37);
        secondMoment17.incrementAll(doubleArray37, 0, (int) (short) 0);
        double double45 = secondMoment1.evaluate(doubleArray37);
        double double46 = secondMoment1.getResult();
        org.apache.commons.math.stat.descriptive.moment.Variance variance47 = new org.apache.commons.math.stat.descriptive.moment.Variance();
        org.apache.commons.math.stat.descriptive.moment.SecondMoment secondMoment48 = new org.apache.commons.math.stat.descriptive.moment.SecondMoment();
        secondMoment48.increment(1.0d);
        secondMoment48.increment((double) (short) 0);
        double double53 = secondMoment48.getResult();
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
        secondMoment48.incrementAll(doubleArray71);
        secondMoment48.increment((double) 2L);
        org.apache.commons.math.stat.descriptive.moment.Variance variance76 = new org.apache.commons.math.stat.descriptive.moment.Variance(secondMoment48);
        org.apache.commons.math.stat.descriptive.moment.SecondMoment secondMoment77 = new org.apache.commons.math.stat.descriptive.moment.SecondMoment();
        secondMoment77.increment(1.0d);
        double[] doubleArray83 = new double[] { (-1L), 0, 10L };
        secondMoment77.incrementAll(doubleArray83, 0, 0);
        double[] doubleArray89 = new double[] { 10, (byte) 100 };
        double double90 = secondMoment77.evaluate(doubleArray89);
        double double91 = variance76.evaluate(doubleArray89);
        double double92 = variance47.evaluate(doubleArray89);
        double double93 = secondMoment1.evaluate(doubleArray89);
        double double94 = secondMoment1.getResult();
        secondMoment1.clear();
        secondMoment1.clear();
        org.apache.commons.math.stat.descriptive.moment.Variance variance97 = new org.apache.commons.math.stat.descriptive.moment.Variance(false, secondMoment1);
        double double98 = secondMoment1.getResult();
        org.junit.Assert.assertNotNull(doubleArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray7), "[-1.0, 0.0, 10.0]");
        org.junit.Assert.assertNotNull(doubleArray13);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray13), "[10.0, 100.0]");
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + 4050.0d + "'", double14 == 4050.0d);
        org.junit.Assert.assertTrue("'" + long15 + "' != '" + 2L + "'", long15 == 2L);
        org.junit.Assert.assertTrue("'" + double16 + "' != '" + 4050.0d + "'", double16 == 4050.0d);
        org.junit.Assert.assertTrue(Double.isNaN(double24));
        org.junit.Assert.assertTrue("'" + double30 + "' != '" + 0.5d + "'", double30 == 0.5d);
        org.junit.Assert.assertNotNull(doubleArray37);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray37), "[-1.0, 0.0, 10.0]");
        org.junit.Assert.assertTrue("'" + double41 + "' != '" + 74.0d + "'", double41 == 74.0d);
        org.junit.Assert.assertTrue("'" + double45 + "' != '" + 74.0d + "'", double45 == 74.0d);
        org.junit.Assert.assertTrue("'" + double46 + "' != '" + 74.0d + "'", double46 == 74.0d);
        org.junit.Assert.assertTrue("'" + double53 + "' != '" + 0.5d + "'", double53 == 0.5d);
        org.junit.Assert.assertTrue("'" + double59 + "' != '" + 0.5d + "'", double59 == 0.5d);
        org.junit.Assert.assertNotNull(doubleArray66);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray66), "[-1.0, 0.0, 10.0]");
        org.junit.Assert.assertTrue("'" + double70 + "' != '" + 74.0d + "'", double70 == 74.0d);
        org.junit.Assert.assertNotNull(doubleArray71);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray71), "[]");
        org.junit.Assert.assertNotNull(doubleArray83);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray83), "[-1.0, 0.0, 10.0]");
        org.junit.Assert.assertNotNull(doubleArray89);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray89), "[10.0, 100.0]");
        org.junit.Assert.assertTrue("'" + double90 + "' != '" + 4050.0d + "'", double90 == 4050.0d);
        org.junit.Assert.assertTrue("'" + double91 + "' != '" + 4050.0d + "'", double91 == 4050.0d);
        org.junit.Assert.assertTrue("'" + double92 + "' != '" + 4050.0d + "'", double92 == 4050.0d);
        org.junit.Assert.assertTrue("'" + double93 + "' != '" + 4050.0d + "'", double93 == 4050.0d);
        org.junit.Assert.assertTrue("'" + double94 + "' != '" + 4050.0d + "'", double94 == 4050.0d);
        org.junit.Assert.assertTrue(Double.isNaN(double98));
    }

    @Test
    public void test16633() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest33.test16633");
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
        long long65 = variance0.getN();
        variance0.clear();
        variance0.clear();
        variance0.setBiasCorrected(false);
        variance0.increment(2.931600745132524E14d);
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
        org.junit.Assert.assertTrue("'" + long65 + "' != '" + 4L + "'", long65 == 4L);
    }

    @Test
    public void test16634() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest33.test16634");
        org.apache.commons.math.stat.descriptive.moment.SecondMoment secondMoment2 = new org.apache.commons.math.stat.descriptive.moment.SecondMoment();
        secondMoment2.increment((double) ' ');
        org.apache.commons.math.stat.descriptive.moment.Variance variance5 = new org.apache.commons.math.stat.descriptive.moment.Variance(secondMoment2);
        secondMoment2.increment((double) (short) -1);
        long long8 = secondMoment2.getN();
        org.apache.commons.math.stat.descriptive.moment.Variance variance9 = new org.apache.commons.math.stat.descriptive.moment.Variance(false, secondMoment2);
        secondMoment2.increment(19.3d);
        secondMoment2.clear();
        org.apache.commons.math.stat.descriptive.moment.Variance variance13 = new org.apache.commons.math.stat.descriptive.moment.Variance(false, secondMoment2);
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 2L + "'", long8 == 2L);
    }

    @Test
    public void test16635() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest33.test16635");
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
        secondMoment0.clear();
        double double29 = secondMoment0.getResult();
        secondMoment0.increment(5.380202045661305E14d);
        secondMoment0.clear();
        org.junit.Assert.assertTrue(Double.isNaN(double7));
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 0.5d + "'", double13 == 0.5d);
        org.junit.Assert.assertNotNull(doubleArray20);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray20), "[-1.0, 0.0, 10.0]");
        org.junit.Assert.assertTrue("'" + double24 + "' != '" + 74.0d + "'", double24 == 74.0d);
        org.junit.Assert.assertTrue(Double.isNaN(double29));
    }

    @Test
    public void test16636() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest33.test16636");
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
        secondMoment16.clear();
        secondMoment16.increment(0.0d);
        secondMoment16.increment(4710403.555555556d);
        secondMoment16.increment((double) 10L);
        org.junit.Assert.assertNotNull(doubleArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray7), "[-1.0, 0.0, 10.0]");
        org.junit.Assert.assertNotNull(doubleArray13);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray13), "[10.0, 100.0]");
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + 4050.0d + "'", double14 == 4050.0d);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
    }

    @Test
    public void test16637() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest33.test16637");
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
        secondMoment2.increment(9.541195475E7d);
        double double17 = secondMoment2.getResult();
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 2L + "'", long8 == 2L);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 544.5d + "'", double9 == 544.5d);
        org.junit.Assert.assertTrue("'" + long12 + "' != '" + 2L + "'", long12 == 2L);
        org.junit.Assert.assertTrue("'" + double17 + "' != '" + 6.827556327109686E15d + "'", double17 == 6.827556327109686E15d);
    }

    @Test
    public void test16638() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest33.test16638");
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
        double[] doubleArray52 = null;
        // The following exception was thrown during execution in test generation
        try {
            double double55 = secondMoment1.evaluate(doubleArray52, 1, (int) 'a');
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: input value array is null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
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
    public void test16639() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest33.test16639");
        org.apache.commons.math.stat.descriptive.moment.SecondMoment secondMoment0 = new org.apache.commons.math.stat.descriptive.moment.SecondMoment();
        secondMoment0.increment((double) ' ');
        org.apache.commons.math.stat.descriptive.moment.Variance variance3 = new org.apache.commons.math.stat.descriptive.moment.Variance(secondMoment0);
        secondMoment0.increment((double) (short) -1);
        secondMoment0.clear();
        secondMoment0.increment((double) 'a');
        double double9 = secondMoment0.getResult();
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 0.0d + "'", double9 == 0.0d);
    }

    @Test
    public void test16640() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest33.test16640");
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
        double double19 = secondMoment0.getResult();
        org.apache.commons.math.stat.descriptive.moment.Variance variance20 = new org.apache.commons.math.stat.descriptive.moment.Variance(secondMoment0);
        boolean boolean21 = variance20.isBiasCorrected();
        double double22 = variance20.getResult();
        double double23 = variance20.getResult();
        boolean boolean24 = variance20.isBiasCorrected();
        double double25 = variance20.getResult();
        org.junit.Assert.assertNotNull(doubleArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray6), "[-1.0, 0.0, 10.0]");
        org.junit.Assert.assertNotNull(doubleArray12);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray12), "[10.0, 100.0]");
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 4050.0d + "'", double13 == 4050.0d);
        org.junit.Assert.assertTrue("'" + long14 + "' != '" + 2L + "'", long14 == 2L);
        org.junit.Assert.assertTrue("'" + double15 + "' != '" + 4050.0d + "'", double15 == 4050.0d);
        org.junit.Assert.assertTrue("'" + double18 + "' != '" + 4402.666666666667d + "'", double18 == 4402.666666666667d);
        org.junit.Assert.assertTrue("'" + double19 + "' != '" + 4402.666666666667d + "'", double19 == 4402.666666666667d);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + true + "'", boolean21 == true);
        org.junit.Assert.assertTrue("'" + double22 + "' != '" + 2201.3333333333335d + "'", double22 == 2201.3333333333335d);
        org.junit.Assert.assertTrue("'" + double23 + "' != '" + 2201.3333333333335d + "'", double23 == 2201.3333333333335d);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + true + "'", boolean24 == true);
        org.junit.Assert.assertTrue("'" + double25 + "' != '" + 2201.3333333333335d + "'", double25 == 2201.3333333333335d);
    }

    @Test
    public void test16641() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest33.test16641");
        org.apache.commons.math.stat.descriptive.moment.SecondMoment secondMoment2 = new org.apache.commons.math.stat.descriptive.moment.SecondMoment();
        secondMoment2.increment((double) ' ');
        org.apache.commons.math.stat.descriptive.moment.Variance variance5 = new org.apache.commons.math.stat.descriptive.moment.Variance(secondMoment2);
        secondMoment2.increment((double) (short) -1);
        secondMoment2.clear();
        secondMoment2.increment((double) 0L);
        org.apache.commons.math.stat.descriptive.moment.Variance variance11 = new org.apache.commons.math.stat.descriptive.moment.Variance(false, secondMoment2);
        secondMoment2.increment(100.0d);
        long long14 = secondMoment2.getN();
        double double15 = secondMoment2.getResult();
        org.apache.commons.math.stat.descriptive.moment.Variance variance16 = new org.apache.commons.math.stat.descriptive.moment.Variance(true, secondMoment2);
        double double17 = secondMoment2.getResult();
        org.junit.Assert.assertTrue("'" + long14 + "' != '" + 2L + "'", long14 == 2L);
        org.junit.Assert.assertTrue("'" + double15 + "' != '" + 5000.0d + "'", double15 == 5000.0d);
        org.junit.Assert.assertTrue("'" + double17 + "' != '" + 5000.0d + "'", double17 == 5000.0d);
    }

    @Test
    public void test16642() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest33.test16642");
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
        variance27.clear();
        variance27.setBiasCorrected(false);
        org.junit.Assert.assertNotNull(doubleArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray7), "[-1.0, 0.0, 10.0]");
        org.junit.Assert.assertNotNull(doubleArray13);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray13), "[10.0, 100.0]");
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + 4050.0d + "'", double14 == 4050.0d);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + false + "'", boolean28 == false);
    }

    @Test
    public void test16643() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest33.test16643");
        org.apache.commons.math.stat.descriptive.moment.SecondMoment secondMoment0 = new org.apache.commons.math.stat.descriptive.moment.SecondMoment();
        secondMoment0.increment(1.0d);
        secondMoment0.increment((double) (short) 0);
        long long5 = secondMoment0.getN();
        double double6 = secondMoment0.getResult();
        double double7 = secondMoment0.getResult();
        long long8 = secondMoment0.getN();
        long long9 = secondMoment0.getN();
        secondMoment0.increment(4.42417896506702E16d);
        double double12 = secondMoment0.getResult();
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 2L + "'", long5 == 2L);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.5d + "'", double6 == 0.5d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 0.5d + "'", double7 == 0.5d);
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 2L + "'", long8 == 2L);
        org.junit.Assert.assertTrue("'" + long9 + "' != '" + 2L + "'", long9 == 2L);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 1.3048906343294326E33d + "'", double12 == 1.3048906343294326E33d);
    }

    @Test
    public void test16644() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest33.test16644");
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
        org.apache.commons.math.stat.descriptive.moment.Variance variance21 = new org.apache.commons.math.stat.descriptive.moment.Variance(secondMoment18);
        secondMoment18.increment((double) (short) -1);
        secondMoment18.clear();
        secondMoment18.increment((double) 0L);
        org.apache.commons.math.stat.descriptive.moment.Variance variance27 = new org.apache.commons.math.stat.descriptive.moment.Variance(secondMoment18);
        org.apache.commons.math.stat.descriptive.moment.SecondMoment secondMoment28 = new org.apache.commons.math.stat.descriptive.moment.SecondMoment();
        secondMoment28.increment(1.0d);
        secondMoment28.increment((double) (short) 0);
        double double33 = secondMoment28.getResult();
        org.apache.commons.math.stat.descriptive.moment.SecondMoment secondMoment34 = new org.apache.commons.math.stat.descriptive.moment.SecondMoment();
        secondMoment34.increment(1.0d);
        double[] doubleArray40 = new double[] { (-1L), 0, 10L };
        secondMoment34.incrementAll(doubleArray40, 0, 0);
        double double44 = secondMoment28.evaluate(doubleArray40);
        double double45 = secondMoment18.evaluate(doubleArray40);
        org.apache.commons.math.stat.descriptive.moment.SecondMoment secondMoment46 = new org.apache.commons.math.stat.descriptive.moment.SecondMoment();
        secondMoment46.increment(1.0d);
        double[] doubleArray52 = new double[] { (-1L), 0, 10L };
        secondMoment46.incrementAll(doubleArray52, 0, 0);
        double[] doubleArray58 = new double[] { 10, (byte) 100 };
        double double59 = secondMoment46.evaluate(doubleArray58);
        double double60 = secondMoment46.getResult();
        secondMoment46.increment((double) (short) -1);
        double[] doubleArray64 = new double[] { (short) 1 };
        secondMoment46.incrementAll(doubleArray64);
        double double66 = secondMoment18.evaluate(doubleArray64);
        double double67 = secondMoment1.evaluate(doubleArray64);
        org.apache.commons.math.stat.descriptive.moment.Variance variance68 = new org.apache.commons.math.stat.descriptive.moment.Variance(secondMoment1);
        double double69 = variance68.getResult();
        double double70 = variance68.getResult();
        long long71 = variance68.getN();
        org.junit.Assert.assertNotNull(doubleArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray7), "[-1.0, 0.0, 10.0]");
        org.junit.Assert.assertNotNull(doubleArray13);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray13), "[10.0, 100.0]");
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + 4050.0d + "'", double14 == 4050.0d);
        org.junit.Assert.assertTrue("'" + double15 + "' != '" + 4050.0d + "'", double15 == 4050.0d);
        org.junit.Assert.assertTrue("'" + long17 + "' != '" + 2L + "'", long17 == 2L);
        org.junit.Assert.assertTrue("'" + double33 + "' != '" + 0.5d + "'", double33 == 0.5d);
        org.junit.Assert.assertNotNull(doubleArray40);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray40), "[-1.0, 0.0, 10.0]");
        org.junit.Assert.assertTrue("'" + double44 + "' != '" + 74.0d + "'", double44 == 74.0d);
        org.junit.Assert.assertTrue("'" + double45 + "' != '" + 74.0d + "'", double45 == 74.0d);
        org.junit.Assert.assertNotNull(doubleArray52);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray52), "[-1.0, 0.0, 10.0]");
        org.junit.Assert.assertNotNull(doubleArray58);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray58), "[10.0, 100.0]");
        org.junit.Assert.assertTrue("'" + double59 + "' != '" + 4050.0d + "'", double59 == 4050.0d);
        org.junit.Assert.assertTrue("'" + double60 + "' != '" + 4050.0d + "'", double60 == 4050.0d);
        org.junit.Assert.assertNotNull(doubleArray64);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray64), "[1.0]");
        org.junit.Assert.assertTrue("'" + double66 + "' != '" + 0.0d + "'", double66 == 0.0d);
        org.junit.Assert.assertTrue("'" + double67 + "' != '" + 0.0d + "'", double67 == 0.0d);
        org.junit.Assert.assertTrue("'" + double69 + "' != '" + 0.0d + "'", double69 == 0.0d);
        org.junit.Assert.assertTrue("'" + double70 + "' != '" + 0.0d + "'", double70 == 0.0d);
        org.junit.Assert.assertTrue("'" + long71 + "' != '" + 1L + "'", long71 == 1L);
    }

    @Test
    public void test16645() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest33.test16645");
        org.apache.commons.math.stat.descriptive.moment.SecondMoment secondMoment1 = new org.apache.commons.math.stat.descriptive.moment.SecondMoment();
        secondMoment1.increment((double) ' ');
        org.apache.commons.math.stat.descriptive.moment.Variance variance4 = new org.apache.commons.math.stat.descriptive.moment.Variance(secondMoment1);
        secondMoment1.increment((double) (short) -1);
        long long7 = secondMoment1.getN();
        org.apache.commons.math.stat.descriptive.moment.Variance variance8 = new org.apache.commons.math.stat.descriptive.moment.Variance(false, secondMoment1);
        double double9 = secondMoment1.getResult();
        secondMoment1.clear();
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + 2L + "'", long7 == 2L);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 544.5d + "'", double9 == 544.5d);
    }

    @Test
    public void test16646() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest33.test16646");
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
        double double23 = secondMoment3.getResult();
        secondMoment3.increment(2568.083333333333d);
        org.apache.commons.math.stat.descriptive.moment.Variance variance26 = new org.apache.commons.math.stat.descriptive.moment.Variance(false, secondMoment3);
        org.apache.commons.math.stat.descriptive.moment.SecondMoment secondMoment27 = new org.apache.commons.math.stat.descriptive.moment.SecondMoment();
        secondMoment27.increment(1.0d);
        double[] doubleArray33 = new double[] { (-1L), 0, 10L };
        secondMoment27.incrementAll(doubleArray33, 0, 0);
        long long37 = secondMoment27.getN();
        org.apache.commons.math.stat.descriptive.moment.Variance variance38 = new org.apache.commons.math.stat.descriptive.moment.Variance(secondMoment27);
        secondMoment27.increment(544.5d);
        java.lang.Object obj41 = null;
        boolean boolean42 = secondMoment27.equals(obj41);
        org.apache.commons.math.stat.descriptive.moment.SecondMoment secondMoment43 = new org.apache.commons.math.stat.descriptive.moment.SecondMoment();
        secondMoment43.increment(1.0d);
        double[] doubleArray49 = new double[] { (-1L), 0, 10L };
        secondMoment43.incrementAll(doubleArray49, 0, 0);
        double[] doubleArray55 = new double[] { 10, (byte) 100 };
        double double56 = secondMoment43.evaluate(doubleArray55);
        secondMoment27.incrementAll(doubleArray55);
        double double58 = secondMoment3.evaluate(doubleArray55);
        org.junit.Assert.assertNotNull(doubleArray9);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray9), "[-1.0, 0.0, 10.0]");
        org.junit.Assert.assertNotNull(doubleArray15);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray15), "[10.0, 100.0]");
        org.junit.Assert.assertTrue("'" + double16 + "' != '" + 4050.0d + "'", double16 == 4050.0d);
        org.junit.Assert.assertTrue("'" + double17 + "' != '" + 4050.0d + "'", double17 == 4050.0d);
        org.junit.Assert.assertTrue("'" + long19 + "' != '" + 2L + "'", long19 == 2L);
        org.junit.Assert.assertTrue("'" + double21 + "' != '" + 4050.0d + "'", double21 == 4050.0d);
        org.junit.Assert.assertTrue(Double.isNaN(double23));
        org.junit.Assert.assertNotNull(doubleArray33);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray33), "[-1.0, 0.0, 10.0]");
        org.junit.Assert.assertTrue("'" + long37 + "' != '" + 1L + "'", long37 == 1L);
        org.junit.Assert.assertTrue("'" + boolean42 + "' != '" + false + "'", boolean42 == false);
        org.junit.Assert.assertNotNull(doubleArray49);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray49), "[-1.0, 0.0, 10.0]");
        org.junit.Assert.assertNotNull(doubleArray55);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray55), "[10.0, 100.0]");
        org.junit.Assert.assertTrue("'" + double56 + "' != '" + 4050.0d + "'", double56 == 4050.0d);
        org.junit.Assert.assertTrue("'" + double58 + "' != '" + 4050.0d + "'", double58 == 4050.0d);
    }

    @Test
    public void test16647() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest33.test16647");
        org.apache.commons.math.stat.descriptive.moment.SecondMoment secondMoment1 = new org.apache.commons.math.stat.descriptive.moment.SecondMoment();
        secondMoment1.increment(1.0d);
        secondMoment1.increment((double) (short) 0);
        long long6 = secondMoment1.getN();
        org.apache.commons.math.stat.descriptive.moment.Variance variance7 = new org.apache.commons.math.stat.descriptive.moment.Variance(false, secondMoment1);
        org.apache.commons.math.stat.descriptive.moment.SecondMoment secondMoment8 = new org.apache.commons.math.stat.descriptive.moment.SecondMoment();
        secondMoment8.increment(1.0d);
        secondMoment8.increment((double) (short) 0);
        double double13 = secondMoment8.getResult();
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
        secondMoment8.incrementAll(doubleArray31);
        secondMoment8.increment((double) 2L);
        org.apache.commons.math.stat.descriptive.moment.Variance variance36 = new org.apache.commons.math.stat.descriptive.moment.Variance(secondMoment8);
        org.apache.commons.math.stat.descriptive.moment.SecondMoment secondMoment37 = new org.apache.commons.math.stat.descriptive.moment.SecondMoment();
        secondMoment37.increment(1.0d);
        double[] doubleArray43 = new double[] { (-1L), 0, 10L };
        secondMoment37.incrementAll(doubleArray43, 0, 0);
        double[] doubleArray49 = new double[] { 10, (byte) 100 };
        double double50 = secondMoment37.evaluate(doubleArray49);
        double double51 = variance36.evaluate(doubleArray49);
        long long52 = variance36.getN();
        double double53 = variance36.getResult();
        org.apache.commons.math.stat.descriptive.moment.SecondMoment secondMoment54 = new org.apache.commons.math.stat.descriptive.moment.SecondMoment();
        secondMoment54.increment(1.0d);
        double[] doubleArray60 = new double[] { (-1L), 0, 10L };
        secondMoment54.incrementAll(doubleArray60, 0, 0);
        double[] doubleArray66 = new double[] { 10, (byte) 100 };
        double double67 = secondMoment54.evaluate(doubleArray66);
        double double68 = secondMoment54.getResult();
        secondMoment54.increment((double) (short) -1);
        double[] doubleArray72 = new double[] { (short) 1 };
        secondMoment54.incrementAll(doubleArray72);
        double double74 = variance36.evaluate(doubleArray72);
        double double77 = secondMoment1.evaluate(doubleArray72, (int) (short) 1, 0);
        secondMoment1.increment((double) 10);
        secondMoment1.clear();
        long long81 = secondMoment1.getN();
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 2L + "'", long6 == 2L);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 0.5d + "'", double13 == 0.5d);
        org.junit.Assert.assertTrue("'" + double19 + "' != '" + 0.5d + "'", double19 == 0.5d);
        org.junit.Assert.assertNotNull(doubleArray26);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray26), "[-1.0, 0.0, 10.0]");
        org.junit.Assert.assertTrue("'" + double30 + "' != '" + 74.0d + "'", double30 == 74.0d);
        org.junit.Assert.assertNotNull(doubleArray31);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray31), "[]");
        org.junit.Assert.assertNotNull(doubleArray43);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray43), "[-1.0, 0.0, 10.0]");
        org.junit.Assert.assertNotNull(doubleArray49);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray49), "[10.0, 100.0]");
        org.junit.Assert.assertTrue("'" + double50 + "' != '" + 4050.0d + "'", double50 == 4050.0d);
        org.junit.Assert.assertTrue("'" + double51 + "' != '" + 4050.0d + "'", double51 == 4050.0d);
        org.junit.Assert.assertTrue("'" + long52 + "' != '" + 3L + "'", long52 == 3L);
        org.junit.Assert.assertTrue("'" + double53 + "' != '" + 1.0d + "'", double53 == 1.0d);
        org.junit.Assert.assertNotNull(doubleArray60);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray60), "[-1.0, 0.0, 10.0]");
        org.junit.Assert.assertNotNull(doubleArray66);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray66), "[10.0, 100.0]");
        org.junit.Assert.assertTrue("'" + double67 + "' != '" + 4050.0d + "'", double67 == 4050.0d);
        org.junit.Assert.assertTrue("'" + double68 + "' != '" + 4050.0d + "'", double68 == 4050.0d);
        org.junit.Assert.assertNotNull(doubleArray72);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray72), "[1.0]");
        org.junit.Assert.assertTrue("'" + double74 + "' != '" + 0.0d + "'", double74 == 0.0d);
        org.junit.Assert.assertTrue("'" + double77 + "' != '" + 0.5d + "'", double77 == 0.5d);
        org.junit.Assert.assertTrue("'" + long81 + "' != '" + 0L + "'", long81 == 0L);
    }

    @Test
    public void test16648() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest33.test16648");
        org.apache.commons.math.stat.descriptive.moment.SecondMoment secondMoment1 = new org.apache.commons.math.stat.descriptive.moment.SecondMoment();
        secondMoment1.increment(1.0d);
        secondMoment1.increment((double) (short) 0);
        long long6 = secondMoment1.getN();
        org.apache.commons.math.stat.descriptive.moment.Variance variance7 = new org.apache.commons.math.stat.descriptive.moment.Variance(false, secondMoment1);
        org.apache.commons.math.stat.descriptive.moment.SecondMoment secondMoment8 = new org.apache.commons.math.stat.descriptive.moment.SecondMoment();
        secondMoment8.increment(1.0d);
        secondMoment8.increment((double) (short) 0);
        double double13 = secondMoment8.getResult();
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
        secondMoment8.incrementAll(doubleArray31);
        secondMoment8.increment((double) 2L);
        org.apache.commons.math.stat.descriptive.moment.Variance variance36 = new org.apache.commons.math.stat.descriptive.moment.Variance(secondMoment8);
        org.apache.commons.math.stat.descriptive.moment.SecondMoment secondMoment37 = new org.apache.commons.math.stat.descriptive.moment.SecondMoment();
        secondMoment37.increment(1.0d);
        double[] doubleArray43 = new double[] { (-1L), 0, 10L };
        secondMoment37.incrementAll(doubleArray43, 0, 0);
        double[] doubleArray49 = new double[] { 10, (byte) 100 };
        double double50 = secondMoment37.evaluate(doubleArray49);
        double double51 = variance36.evaluate(doubleArray49);
        long long52 = variance36.getN();
        double double53 = variance36.getResult();
        org.apache.commons.math.stat.descriptive.moment.SecondMoment secondMoment54 = new org.apache.commons.math.stat.descriptive.moment.SecondMoment();
        secondMoment54.increment(1.0d);
        double[] doubleArray60 = new double[] { (-1L), 0, 10L };
        secondMoment54.incrementAll(doubleArray60, 0, 0);
        double[] doubleArray66 = new double[] { 10, (byte) 100 };
        double double67 = secondMoment54.evaluate(doubleArray66);
        double double68 = secondMoment54.getResult();
        secondMoment54.increment((double) (short) -1);
        double[] doubleArray72 = new double[] { (short) 1 };
        secondMoment54.incrementAll(doubleArray72);
        double double74 = variance36.evaluate(doubleArray72);
        double double77 = secondMoment1.evaluate(doubleArray72, (int) (short) 1, 0);
        secondMoment1.increment((double) 10);
        double double80 = secondMoment1.getResult();
        secondMoment1.increment(4919339.055555555d);
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 2L + "'", long6 == 2L);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 0.5d + "'", double13 == 0.5d);
        org.junit.Assert.assertTrue("'" + double19 + "' != '" + 0.5d + "'", double19 == 0.5d);
        org.junit.Assert.assertNotNull(doubleArray26);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray26), "[-1.0, 0.0, 10.0]");
        org.junit.Assert.assertTrue("'" + double30 + "' != '" + 74.0d + "'", double30 == 74.0d);
        org.junit.Assert.assertNotNull(doubleArray31);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray31), "[]");
        org.junit.Assert.assertNotNull(doubleArray43);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray43), "[-1.0, 0.0, 10.0]");
        org.junit.Assert.assertNotNull(doubleArray49);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray49), "[10.0, 100.0]");
        org.junit.Assert.assertTrue("'" + double50 + "' != '" + 4050.0d + "'", double50 == 4050.0d);
        org.junit.Assert.assertTrue("'" + double51 + "' != '" + 4050.0d + "'", double51 == 4050.0d);
        org.junit.Assert.assertTrue("'" + long52 + "' != '" + 3L + "'", long52 == 3L);
        org.junit.Assert.assertTrue("'" + double53 + "' != '" + 1.0d + "'", double53 == 1.0d);
        org.junit.Assert.assertNotNull(doubleArray60);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray60), "[-1.0, 0.0, 10.0]");
        org.junit.Assert.assertNotNull(doubleArray66);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray66), "[10.0, 100.0]");
        org.junit.Assert.assertTrue("'" + double67 + "' != '" + 4050.0d + "'", double67 == 4050.0d);
        org.junit.Assert.assertTrue("'" + double68 + "' != '" + 4050.0d + "'", double68 == 4050.0d);
        org.junit.Assert.assertNotNull(doubleArray72);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray72), "[1.0]");
        org.junit.Assert.assertTrue("'" + double74 + "' != '" + 0.0d + "'", double74 == 0.0d);
        org.junit.Assert.assertTrue("'" + double77 + "' != '" + 0.5d + "'", double77 == 0.5d);
        org.junit.Assert.assertTrue("'" + double80 + "' != '" + 60.666666666666664d + "'", double80 == 60.666666666666664d);
    }

    @Test
    public void test16649() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest33.test16649");
        org.apache.commons.math.stat.descriptive.moment.SecondMoment secondMoment0 = new org.apache.commons.math.stat.descriptive.moment.SecondMoment();
        secondMoment0.increment(1.0d);
        secondMoment0.increment((double) 10L);
        org.apache.commons.math.stat.descriptive.moment.SecondMoment secondMoment5 = new org.apache.commons.math.stat.descriptive.moment.SecondMoment();
        secondMoment5.increment(1.0d);
        secondMoment5.increment((double) (short) 0);
        double double10 = secondMoment5.getResult();
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
        secondMoment5.incrementAll(doubleArray28);
        secondMoment5.increment((double) 2L);
        org.apache.commons.math.stat.descriptive.moment.Variance variance33 = new org.apache.commons.math.stat.descriptive.moment.Variance(secondMoment5);
        org.apache.commons.math.stat.descriptive.moment.SecondMoment secondMoment34 = new org.apache.commons.math.stat.descriptive.moment.SecondMoment();
        secondMoment34.increment(1.0d);
        double[] doubleArray40 = new double[] { (-1L), 0, 10L };
        secondMoment34.incrementAll(doubleArray40, 0, 0);
        double[] doubleArray46 = new double[] { 10, (byte) 100 };
        double double47 = secondMoment34.evaluate(doubleArray46);
        double double48 = variance33.evaluate(doubleArray46);
        double double49 = secondMoment0.evaluate(doubleArray46);
        org.apache.commons.math.stat.descriptive.moment.SecondMoment secondMoment50 = new org.apache.commons.math.stat.descriptive.moment.SecondMoment();
        secondMoment50.increment(1.0d);
        secondMoment50.increment((double) (short) 0);
        double double55 = secondMoment50.getResult();
        org.apache.commons.math.stat.descriptive.moment.SecondMoment secondMoment56 = new org.apache.commons.math.stat.descriptive.moment.SecondMoment();
        secondMoment56.increment(1.0d);
        secondMoment56.increment((double) (short) 0);
        double double61 = secondMoment56.getResult();
        org.apache.commons.math.stat.descriptive.moment.SecondMoment secondMoment62 = new org.apache.commons.math.stat.descriptive.moment.SecondMoment();
        secondMoment62.increment(1.0d);
        double[] doubleArray68 = new double[] { (-1L), 0, 10L };
        secondMoment62.incrementAll(doubleArray68, 0, 0);
        double double72 = secondMoment56.evaluate(doubleArray68);
        double[] doubleArray73 = new double[] {};
        secondMoment56.incrementAll(doubleArray73);
        secondMoment50.incrementAll(doubleArray73);
        double double76 = secondMoment0.evaluate(doubleArray73);
        long long77 = secondMoment0.getN();
        secondMoment0.increment((double) (byte) 1);
        secondMoment0.increment(0.0d);
        secondMoment0.clear();
        double double83 = secondMoment0.getResult();
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 0.5d + "'", double10 == 0.5d);
        org.junit.Assert.assertTrue("'" + double16 + "' != '" + 0.5d + "'", double16 == 0.5d);
        org.junit.Assert.assertNotNull(doubleArray23);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray23), "[-1.0, 0.0, 10.0]");
        org.junit.Assert.assertTrue("'" + double27 + "' != '" + 74.0d + "'", double27 == 74.0d);
        org.junit.Assert.assertNotNull(doubleArray28);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray28), "[]");
        org.junit.Assert.assertNotNull(doubleArray40);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray40), "[-1.0, 0.0, 10.0]");
        org.junit.Assert.assertNotNull(doubleArray46);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray46), "[10.0, 100.0]");
        org.junit.Assert.assertTrue("'" + double47 + "' != '" + 4050.0d + "'", double47 == 4050.0d);
        org.junit.Assert.assertTrue("'" + double48 + "' != '" + 4050.0d + "'", double48 == 4050.0d);
        org.junit.Assert.assertTrue("'" + double49 + "' != '" + 4050.0d + "'", double49 == 4050.0d);
        org.junit.Assert.assertTrue("'" + double55 + "' != '" + 0.5d + "'", double55 == 0.5d);
        org.junit.Assert.assertTrue("'" + double61 + "' != '" + 0.5d + "'", double61 == 0.5d);
        org.junit.Assert.assertNotNull(doubleArray68);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray68), "[-1.0, 0.0, 10.0]");
        org.junit.Assert.assertTrue("'" + double72 + "' != '" + 74.0d + "'", double72 == 74.0d);
        org.junit.Assert.assertNotNull(doubleArray73);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray73), "[]");
        org.junit.Assert.assertTrue("'" + double76 + "' != '" + 4050.0d + "'", double76 == 4050.0d);
        org.junit.Assert.assertTrue("'" + long77 + "' != '" + 2L + "'", long77 == 2L);
        org.junit.Assert.assertTrue(Double.isNaN(double83));
    }
}

