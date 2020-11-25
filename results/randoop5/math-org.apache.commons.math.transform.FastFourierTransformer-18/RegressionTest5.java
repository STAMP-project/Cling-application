import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class RegressionTest5 {

    public static boolean debug = false;

    @Test
    public void test2501() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2501");
        org.apache.commons.math.transform.FastFourierTransformer fastFourierTransformer0 = new org.apache.commons.math.transform.FastFourierTransformer();
        org.apache.commons.math.transform.FastFourierTransformer fastFourierTransformer1 = new org.apache.commons.math.transform.FastFourierTransformer();
        double[] doubleArray6 = new double[] { (-1L), 'a', 1L, 10 };
        org.apache.commons.math.transform.FastFourierTransformer.verifyDataSet(doubleArray6);
        org.apache.commons.math.complex.Complex[] complexArray8 = fastFourierTransformer1.transform2(doubleArray6);
        org.apache.commons.math.complex.Complex[] complexArray10 = org.apache.commons.math.transform.FastFourierTransformer.scaleArray(complexArray8, (double) 100L);
        org.apache.commons.math.complex.Complex[] complexArray11 = fastFourierTransformer0.inversetransform(complexArray8);
        org.apache.commons.math.transform.FastFourierTransformer fastFourierTransformer12 = new org.apache.commons.math.transform.FastFourierTransformer();
        double[] doubleArray17 = new double[] { (-1L), 'a', 1L, 10 };
        org.apache.commons.math.transform.FastFourierTransformer.verifyDataSet(doubleArray17);
        org.apache.commons.math.complex.Complex[] complexArray19 = fastFourierTransformer12.transform2(doubleArray17);
        org.apache.commons.math.transform.FastFourierTransformer fastFourierTransformer20 = new org.apache.commons.math.transform.FastFourierTransformer();
        double[] doubleArray25 = new double[] { (-1L), 'a', 1L, 10 };
        org.apache.commons.math.transform.FastFourierTransformer.verifyDataSet(doubleArray25);
        org.apache.commons.math.complex.Complex[] complexArray27 = fastFourierTransformer20.transform2(doubleArray25);
        org.apache.commons.math.transform.FastFourierTransformer fastFourierTransformer28 = new org.apache.commons.math.transform.FastFourierTransformer();
        double[] doubleArray33 = new double[] { (-1L), 'a', 1L, 10 };
        org.apache.commons.math.transform.FastFourierTransformer.verifyDataSet(doubleArray33);
        org.apache.commons.math.complex.Complex[] complexArray35 = fastFourierTransformer28.transform2(doubleArray33);
        org.apache.commons.math.complex.Complex[] complexArray37 = org.apache.commons.math.transform.FastFourierTransformer.scaleArray(complexArray35, (double) 'a');
        org.apache.commons.math.transform.FastFourierTransformer.verifyDataSet((java.lang.Object[]) complexArray35);
        org.apache.commons.math.complex.Complex[] complexArray40 = org.apache.commons.math.transform.FastFourierTransformer.scaleArray(complexArray35, (double) 1L);
        org.apache.commons.math.complex.Complex[] complexArray41 = fastFourierTransformer20.transform2(complexArray40);
        double[] doubleArray46 = new double[] { (-1L), 'a', 1L, 10 };
        org.apache.commons.math.transform.FastFourierTransformer.verifyDataSet(doubleArray46);
        double[] doubleArray49 = org.apache.commons.math.transform.FastFourierTransformer.scaleArray(doubleArray46, (double) 10.0f);
        org.apache.commons.math.complex.Complex[] complexArray50 = fastFourierTransformer20.transform(doubleArray46);
        org.apache.commons.math.complex.Complex[] complexArray51 = fastFourierTransformer12.transform(complexArray50);
        org.apache.commons.math.complex.Complex[] complexArray53 = org.apache.commons.math.transform.FastFourierTransformer.scaleArray(complexArray51, (double) (short) -1);
        org.apache.commons.math.complex.Complex[] complexArray54 = fastFourierTransformer0.inversetransform(complexArray53);
        org.apache.commons.math.transform.FastFourierTransformer.verifyDataSet((java.lang.Object[]) complexArray53);
        org.apache.commons.math.transform.FastFourierTransformer.verifyDataSet((java.lang.Object[]) complexArray53);
        org.junit.Assert.assertNotNull(doubleArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray6), "[-1.0, 97.0, 1.0, 10.0]");
        org.junit.Assert.assertNotNull(complexArray8);
        org.junit.Assert.assertNotNull(complexArray10);
        org.junit.Assert.assertNotNull(complexArray11);
        org.junit.Assert.assertNotNull(doubleArray17);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray17), "[-1.0, 97.0, 1.0, 10.0]");
        org.junit.Assert.assertNotNull(complexArray19);
        org.junit.Assert.assertNotNull(doubleArray25);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray25), "[-1.0, 97.0, 1.0, 10.0]");
        org.junit.Assert.assertNotNull(complexArray27);
        org.junit.Assert.assertNotNull(doubleArray33);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray33), "[-1.0, 97.0, 1.0, 10.0]");
        org.junit.Assert.assertNotNull(complexArray35);
        org.junit.Assert.assertNotNull(complexArray37);
        org.junit.Assert.assertNotNull(complexArray40);
        org.junit.Assert.assertNotNull(complexArray41);
        org.junit.Assert.assertNotNull(doubleArray46);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray46), "[-10.0, 970.0, 10.0, 100.0]");
        org.junit.Assert.assertNotNull(doubleArray49);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray49), "[-10.0, 970.0, 10.0, 100.0]");
        org.junit.Assert.assertNotNull(complexArray50);
        org.junit.Assert.assertNotNull(complexArray51);
        org.junit.Assert.assertNotNull(complexArray53);
        org.junit.Assert.assertNotNull(complexArray54);
    }

    @Test
    public void test2502() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2502");
        org.apache.commons.math.transform.FastFourierTransformer fastFourierTransformer0 = new org.apache.commons.math.transform.FastFourierTransformer();
        double[] doubleArray5 = new double[] { (-1L), 'a', 1L, 10 };
        org.apache.commons.math.transform.FastFourierTransformer.verifyDataSet(doubleArray5);
        org.apache.commons.math.complex.Complex[] complexArray7 = fastFourierTransformer0.transform2(doubleArray5);
        org.apache.commons.math.transform.FastFourierTransformer fastFourierTransformer8 = new org.apache.commons.math.transform.FastFourierTransformer();
        double[] doubleArray13 = new double[] { (-1L), 'a', 1L, 10 };
        org.apache.commons.math.transform.FastFourierTransformer.verifyDataSet(doubleArray13);
        org.apache.commons.math.complex.Complex[] complexArray15 = fastFourierTransformer8.transform2(doubleArray13);
        org.apache.commons.math.complex.Complex[] complexArray17 = org.apache.commons.math.transform.FastFourierTransformer.scaleArray(complexArray15, (double) 'a');
        org.apache.commons.math.transform.FastFourierTransformer.verifyDataSet((java.lang.Object[]) complexArray15);
        org.apache.commons.math.complex.Complex[] complexArray20 = org.apache.commons.math.transform.FastFourierTransformer.scaleArray(complexArray15, (double) 1L);
        org.apache.commons.math.complex.Complex[] complexArray21 = fastFourierTransformer0.transform2(complexArray20);
        double[] doubleArray26 = new double[] { (-1L), 'a', 1L, 10 };
        org.apache.commons.math.transform.FastFourierTransformer.verifyDataSet(doubleArray26);
        double[] doubleArray29 = org.apache.commons.math.transform.FastFourierTransformer.scaleArray(doubleArray26, (double) 10.0f);
        org.apache.commons.math.complex.Complex[] complexArray30 = fastFourierTransformer0.transform2(doubleArray29);
        double[] doubleArray35 = new double[] { (-1L), 'a', 1L, 10 };
        org.apache.commons.math.transform.FastFourierTransformer.verifyDataSet(doubleArray35);
        double[] doubleArray38 = org.apache.commons.math.transform.FastFourierTransformer.scaleArray(doubleArray35, (double) (byte) 100);
        double[] doubleArray40 = org.apache.commons.math.transform.FastFourierTransformer.scaleArray(doubleArray35, (double) 0);
        org.apache.commons.math.transform.FastFourierTransformer.verifyDataSet(doubleArray35);
        org.apache.commons.math.complex.Complex[] complexArray42 = fastFourierTransformer0.transform2(doubleArray35);
        org.apache.commons.math.transform.FastFourierTransformer fastFourierTransformer43 = new org.apache.commons.math.transform.FastFourierTransformer();
        org.apache.commons.math.transform.FastFourierTransformer fastFourierTransformer44 = new org.apache.commons.math.transform.FastFourierTransformer();
        double[] doubleArray49 = new double[] { (-1L), 'a', 1L, 10 };
        org.apache.commons.math.transform.FastFourierTransformer.verifyDataSet(doubleArray49);
        org.apache.commons.math.complex.Complex[] complexArray51 = fastFourierTransformer44.transform2(doubleArray49);
        org.apache.commons.math.complex.Complex[] complexArray53 = org.apache.commons.math.transform.FastFourierTransformer.scaleArray(complexArray51, (double) 'a');
        org.apache.commons.math.transform.FastFourierTransformer.verifyDataSet((java.lang.Object[]) complexArray51);
        org.apache.commons.math.complex.Complex[] complexArray55 = fastFourierTransformer43.inversetransform(complexArray51);
        org.apache.commons.math.transform.FastFourierTransformer fastFourierTransformer56 = new org.apache.commons.math.transform.FastFourierTransformer();
        double[] doubleArray61 = new double[] { (-1L), 'a', 1L, 10 };
        org.apache.commons.math.transform.FastFourierTransformer.verifyDataSet(doubleArray61);
        org.apache.commons.math.complex.Complex[] complexArray63 = fastFourierTransformer56.transform2(doubleArray61);
        double[] doubleArray65 = org.apache.commons.math.transform.FastFourierTransformer.scaleArray(doubleArray61, 100.0d);
        org.apache.commons.math.complex.Complex[] complexArray66 = fastFourierTransformer43.inversetransform(doubleArray61);
        org.apache.commons.math.transform.FastFourierTransformer fastFourierTransformer67 = new org.apache.commons.math.transform.FastFourierTransformer();
        double[] doubleArray72 = new double[] { (-1L), 'a', 1L, 10 };
        org.apache.commons.math.transform.FastFourierTransformer.verifyDataSet(doubleArray72);
        double[] doubleArray75 = org.apache.commons.math.transform.FastFourierTransformer.scaleArray(doubleArray72, (double) 10.0f);
        org.apache.commons.math.transform.FastFourierTransformer.verifyDataSet(doubleArray75);
        org.apache.commons.math.complex.Complex[] complexArray77 = fastFourierTransformer67.inversetransform(doubleArray75);
        org.apache.commons.math.complex.Complex[] complexArray78 = fastFourierTransformer43.inversetransform(doubleArray75);
        org.apache.commons.math.complex.Complex[] complexArray79 = fastFourierTransformer0.inversetransform2(complexArray78);
        double[] doubleArray84 = new double[] { (-1L), 'a', 1L, 10 };
        org.apache.commons.math.transform.FastFourierTransformer.verifyDataSet(doubleArray84);
        double[] doubleArray87 = org.apache.commons.math.transform.FastFourierTransformer.scaleArray(doubleArray84, (double) 10.0f);
        double[] doubleArray89 = org.apache.commons.math.transform.FastFourierTransformer.scaleArray(doubleArray87, (double) 10L);
        double[] doubleArray91 = org.apache.commons.math.transform.FastFourierTransformer.scaleArray(doubleArray89, (double) 10.0f);
        org.apache.commons.math.complex.Complex[] complexArray92 = fastFourierTransformer0.inversetransform2(doubleArray91);
        org.apache.commons.math.analysis.UnivariateRealFunction univariateRealFunction93 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math.complex.Complex[] complexArray97 = fastFourierTransformer0.transform(univariateRealFunction93, (double) (byte) 0, (double) 0L, (int) (byte) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Endpoints do not specify an interval: [0.0, 0.0]");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(doubleArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray5), "[-1.0, 97.0, 1.0, 10.0]");
        org.junit.Assert.assertNotNull(complexArray7);
        org.junit.Assert.assertNotNull(doubleArray13);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray13), "[-1.0, 97.0, 1.0, 10.0]");
        org.junit.Assert.assertNotNull(complexArray15);
        org.junit.Assert.assertNotNull(complexArray17);
        org.junit.Assert.assertNotNull(complexArray20);
        org.junit.Assert.assertNotNull(complexArray21);
        org.junit.Assert.assertNotNull(doubleArray26);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray26), "[-10.0, 970.0, 10.0, 100.0]");
        org.junit.Assert.assertNotNull(doubleArray29);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray29), "[-10.0, 970.0, 10.0, 100.0]");
        org.junit.Assert.assertNotNull(complexArray30);
        org.junit.Assert.assertNotNull(doubleArray35);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray35), "[-0.0, 0.0, 0.0, 0.0]");
        org.junit.Assert.assertNotNull(doubleArray38);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray38), "[-0.0, 0.0, 0.0, 0.0]");
        org.junit.Assert.assertNotNull(doubleArray40);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray40), "[-0.0, 0.0, 0.0, 0.0]");
        org.junit.Assert.assertNotNull(complexArray42);
        org.junit.Assert.assertNotNull(doubleArray49);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray49), "[-1.0, 97.0, 1.0, 10.0]");
        org.junit.Assert.assertNotNull(complexArray51);
        org.junit.Assert.assertNotNull(complexArray53);
        org.junit.Assert.assertNotNull(complexArray55);
        org.junit.Assert.assertNotNull(doubleArray61);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray61), "[-100.0, 9700.0, 100.0, 1000.0]");
        org.junit.Assert.assertNotNull(complexArray63);
        org.junit.Assert.assertNotNull(doubleArray65);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray65), "[-100.0, 9700.0, 100.0, 1000.0]");
        org.junit.Assert.assertNotNull(complexArray66);
        org.junit.Assert.assertNotNull(doubleArray72);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray72), "[-10.0, 970.0, 10.0, 100.0]");
        org.junit.Assert.assertNotNull(doubleArray75);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray75), "[-10.0, 970.0, 10.0, 100.0]");
        org.junit.Assert.assertNotNull(complexArray77);
        org.junit.Assert.assertNotNull(complexArray78);
        org.junit.Assert.assertNotNull(complexArray79);
        org.junit.Assert.assertNotNull(doubleArray84);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray84), "[-1000.0, 97000.0, 1000.0, 10000.0]");
        org.junit.Assert.assertNotNull(doubleArray87);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray87), "[-1000.0, 97000.0, 1000.0, 10000.0]");
        org.junit.Assert.assertNotNull(doubleArray89);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray89), "[-1000.0, 97000.0, 1000.0, 10000.0]");
        org.junit.Assert.assertNotNull(doubleArray91);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray91), "[-1000.0, 97000.0, 1000.0, 10000.0]");
        org.junit.Assert.assertNotNull(complexArray92);
    }

    @Test
    public void test2503() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2503");
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math.transform.FastFourierTransformer.verifyInterval((double) (byte) 10, (-1.0d));
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Endpoints do not specify an interval: [10.0, -1.0]");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void test2504() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2504");
        org.apache.commons.math.transform.FastFourierTransformer fastFourierTransformer0 = new org.apache.commons.math.transform.FastFourierTransformer();
        double[] doubleArray5 = new double[] { (-1L), 'a', 1L, 10 };
        org.apache.commons.math.transform.FastFourierTransformer.verifyDataSet(doubleArray5);
        org.apache.commons.math.complex.Complex[] complexArray7 = fastFourierTransformer0.transform2(doubleArray5);
        org.apache.commons.math.transform.FastFourierTransformer fastFourierTransformer8 = new org.apache.commons.math.transform.FastFourierTransformer();
        double[] doubleArray13 = new double[] { (-1L), 'a', 1L, 10 };
        org.apache.commons.math.transform.FastFourierTransformer.verifyDataSet(doubleArray13);
        org.apache.commons.math.complex.Complex[] complexArray15 = fastFourierTransformer8.transform2(doubleArray13);
        org.apache.commons.math.complex.Complex[] complexArray17 = org.apache.commons.math.transform.FastFourierTransformer.scaleArray(complexArray15, (double) 'a');
        org.apache.commons.math.transform.FastFourierTransformer.verifyDataSet((java.lang.Object[]) complexArray15);
        org.apache.commons.math.complex.Complex[] complexArray20 = org.apache.commons.math.transform.FastFourierTransformer.scaleArray(complexArray15, (double) 1L);
        org.apache.commons.math.complex.Complex[] complexArray21 = fastFourierTransformer0.transform2(complexArray20);
        org.apache.commons.math.transform.FastFourierTransformer fastFourierTransformer22 = new org.apache.commons.math.transform.FastFourierTransformer();
        org.apache.commons.math.transform.FastFourierTransformer fastFourierTransformer23 = new org.apache.commons.math.transform.FastFourierTransformer();
        double[] doubleArray28 = new double[] { (-1L), 'a', 1L, 10 };
        org.apache.commons.math.transform.FastFourierTransformer.verifyDataSet(doubleArray28);
        org.apache.commons.math.complex.Complex[] complexArray30 = fastFourierTransformer23.transform2(doubleArray28);
        org.apache.commons.math.complex.Complex[] complexArray32 = org.apache.commons.math.transform.FastFourierTransformer.scaleArray(complexArray30, (double) 'a');
        org.apache.commons.math.transform.FastFourierTransformer.verifyDataSet((java.lang.Object[]) complexArray30);
        org.apache.commons.math.complex.Complex[] complexArray34 = fastFourierTransformer22.inversetransform(complexArray30);
        org.apache.commons.math.transform.FastFourierTransformer fastFourierTransformer35 = new org.apache.commons.math.transform.FastFourierTransformer();
        double[] doubleArray40 = new double[] { (-1L), 'a', 1L, 10 };
        org.apache.commons.math.transform.FastFourierTransformer.verifyDataSet(doubleArray40);
        org.apache.commons.math.complex.Complex[] complexArray42 = fastFourierTransformer35.transform2(doubleArray40);
        org.apache.commons.math.complex.Complex[] complexArray43 = fastFourierTransformer22.transform(complexArray42);
        double[] doubleArray48 = new double[] { (-1L), 'a', 1L, 10 };
        org.apache.commons.math.transform.FastFourierTransformer.verifyDataSet(doubleArray48);
        double[] doubleArray51 = org.apache.commons.math.transform.FastFourierTransformer.scaleArray(doubleArray48, (double) 10.0f);
        double[] doubleArray53 = org.apache.commons.math.transform.FastFourierTransformer.scaleArray(doubleArray51, (double) 10L);
        org.apache.commons.math.complex.Complex[] complexArray54 = fastFourierTransformer22.inversetransform2(doubleArray53);
        org.apache.commons.math.complex.Complex[] complexArray55 = fastFourierTransformer0.transform(doubleArray53);
        org.apache.commons.math.transform.FastFourierTransformer.verifyDataSet(doubleArray53);
        double[] doubleArray58 = org.apache.commons.math.transform.FastFourierTransformer.scaleArray(doubleArray53, (double) 1L);
        org.junit.Assert.assertNotNull(doubleArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray5), "[-1.0, 97.0, 1.0, 10.0]");
        org.junit.Assert.assertNotNull(complexArray7);
        org.junit.Assert.assertNotNull(doubleArray13);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray13), "[-1.0, 97.0, 1.0, 10.0]");
        org.junit.Assert.assertNotNull(complexArray15);
        org.junit.Assert.assertNotNull(complexArray17);
        org.junit.Assert.assertNotNull(complexArray20);
        org.junit.Assert.assertNotNull(complexArray21);
        org.junit.Assert.assertNotNull(doubleArray28);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray28), "[-1.0, 97.0, 1.0, 10.0]");
        org.junit.Assert.assertNotNull(complexArray30);
        org.junit.Assert.assertNotNull(complexArray32);
        org.junit.Assert.assertNotNull(complexArray34);
        org.junit.Assert.assertNotNull(doubleArray40);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray40), "[-1.0, 97.0, 1.0, 10.0]");
        org.junit.Assert.assertNotNull(complexArray42);
        org.junit.Assert.assertNotNull(complexArray43);
        org.junit.Assert.assertNotNull(doubleArray48);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray48), "[-100.0, 9700.0, 100.0, 1000.0]");
        org.junit.Assert.assertNotNull(doubleArray51);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray51), "[-100.0, 9700.0, 100.0, 1000.0]");
        org.junit.Assert.assertNotNull(doubleArray53);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray53), "[-100.0, 9700.0, 100.0, 1000.0]");
        org.junit.Assert.assertNotNull(complexArray54);
        org.junit.Assert.assertNotNull(complexArray55);
        org.junit.Assert.assertNotNull(doubleArray58);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray58), "[-100.0, 9700.0, 100.0, 1000.0]");
    }

    @Test
    public void test2505() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2505");
        org.apache.commons.math.analysis.UnivariateRealFunction univariateRealFunction0 = null;
        // The following exception was thrown during execution in test generation
        try {
            double[] doubleArray4 = org.apache.commons.math.transform.FastFourierTransformer.sample(univariateRealFunction0, 0.0d, (double) (short) 0, 10);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Endpoints do not specify an interval: [0.0, 0.0]");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void test2506() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2506");
        org.apache.commons.math.transform.FastFourierTransformer fastFourierTransformer0 = new org.apache.commons.math.transform.FastFourierTransformer();
        double[] doubleArray5 = new double[] { (-1L), 'a', 1L, 10 };
        org.apache.commons.math.transform.FastFourierTransformer.verifyDataSet(doubleArray5);
        org.apache.commons.math.complex.Complex[] complexArray7 = fastFourierTransformer0.transform2(doubleArray5);
        org.apache.commons.math.transform.FastFourierTransformer fastFourierTransformer8 = new org.apache.commons.math.transform.FastFourierTransformer();
        double[] doubleArray13 = new double[] { (-1L), 'a', 1L, 10 };
        org.apache.commons.math.transform.FastFourierTransformer.verifyDataSet(doubleArray13);
        org.apache.commons.math.complex.Complex[] complexArray15 = fastFourierTransformer8.transform2(doubleArray13);
        org.apache.commons.math.complex.Complex[] complexArray17 = org.apache.commons.math.transform.FastFourierTransformer.scaleArray(complexArray15, (double) 'a');
        org.apache.commons.math.transform.FastFourierTransformer.verifyDataSet((java.lang.Object[]) complexArray15);
        org.apache.commons.math.complex.Complex[] complexArray20 = org.apache.commons.math.transform.FastFourierTransformer.scaleArray(complexArray15, (double) 1L);
        org.apache.commons.math.complex.Complex[] complexArray21 = fastFourierTransformer0.transform2(complexArray20);
        double[] doubleArray26 = new double[] { (-1L), 'a', 1L, 10 };
        org.apache.commons.math.transform.FastFourierTransformer.verifyDataSet(doubleArray26);
        double[] doubleArray29 = org.apache.commons.math.transform.FastFourierTransformer.scaleArray(doubleArray26, (double) 10.0f);
        org.apache.commons.math.complex.Complex[] complexArray30 = fastFourierTransformer0.transform2(doubleArray29);
        double[] doubleArray35 = new double[] { (-1L), 'a', 1L, 10 };
        org.apache.commons.math.transform.FastFourierTransformer.verifyDataSet(doubleArray35);
        double[] doubleArray38 = org.apache.commons.math.transform.FastFourierTransformer.scaleArray(doubleArray35, (double) (byte) 100);
        double[] doubleArray40 = org.apache.commons.math.transform.FastFourierTransformer.scaleArray(doubleArray35, (double) 0);
        org.apache.commons.math.transform.FastFourierTransformer.verifyDataSet(doubleArray35);
        org.apache.commons.math.complex.Complex[] complexArray42 = fastFourierTransformer0.transform2(doubleArray35);
        org.apache.commons.math.transform.FastFourierTransformer fastFourierTransformer43 = new org.apache.commons.math.transform.FastFourierTransformer();
        org.apache.commons.math.transform.FastFourierTransformer fastFourierTransformer44 = new org.apache.commons.math.transform.FastFourierTransformer();
        double[] doubleArray49 = new double[] { (-1L), 'a', 1L, 10 };
        org.apache.commons.math.transform.FastFourierTransformer.verifyDataSet(doubleArray49);
        org.apache.commons.math.complex.Complex[] complexArray51 = fastFourierTransformer44.transform2(doubleArray49);
        org.apache.commons.math.complex.Complex[] complexArray53 = org.apache.commons.math.transform.FastFourierTransformer.scaleArray(complexArray51, (double) 'a');
        org.apache.commons.math.transform.FastFourierTransformer.verifyDataSet((java.lang.Object[]) complexArray51);
        org.apache.commons.math.complex.Complex[] complexArray55 = fastFourierTransformer43.inversetransform(complexArray51);
        org.apache.commons.math.transform.FastFourierTransformer fastFourierTransformer56 = new org.apache.commons.math.transform.FastFourierTransformer();
        double[] doubleArray61 = new double[] { (-1L), 'a', 1L, 10 };
        org.apache.commons.math.transform.FastFourierTransformer.verifyDataSet(doubleArray61);
        org.apache.commons.math.complex.Complex[] complexArray63 = fastFourierTransformer56.transform2(doubleArray61);
        double[] doubleArray65 = org.apache.commons.math.transform.FastFourierTransformer.scaleArray(doubleArray61, 100.0d);
        org.apache.commons.math.complex.Complex[] complexArray66 = fastFourierTransformer43.inversetransform(doubleArray61);
        org.apache.commons.math.transform.FastFourierTransformer fastFourierTransformer67 = new org.apache.commons.math.transform.FastFourierTransformer();
        double[] doubleArray72 = new double[] { (-1L), 'a', 1L, 10 };
        org.apache.commons.math.transform.FastFourierTransformer.verifyDataSet(doubleArray72);
        double[] doubleArray75 = org.apache.commons.math.transform.FastFourierTransformer.scaleArray(doubleArray72, (double) 10.0f);
        org.apache.commons.math.transform.FastFourierTransformer.verifyDataSet(doubleArray75);
        org.apache.commons.math.complex.Complex[] complexArray77 = fastFourierTransformer67.inversetransform(doubleArray75);
        org.apache.commons.math.complex.Complex[] complexArray78 = fastFourierTransformer43.inversetransform(doubleArray75);
        org.apache.commons.math.complex.Complex[] complexArray79 = fastFourierTransformer0.inversetransform2(complexArray78);
        org.apache.commons.math.transform.FastFourierTransformer fastFourierTransformer80 = new org.apache.commons.math.transform.FastFourierTransformer();
        org.apache.commons.math.transform.FastFourierTransformer fastFourierTransformer81 = new org.apache.commons.math.transform.FastFourierTransformer();
        double[] doubleArray86 = new double[] { (-1L), 'a', 1L, 10 };
        org.apache.commons.math.transform.FastFourierTransformer.verifyDataSet(doubleArray86);
        org.apache.commons.math.complex.Complex[] complexArray88 = fastFourierTransformer81.transform2(doubleArray86);
        org.apache.commons.math.complex.Complex[] complexArray90 = org.apache.commons.math.transform.FastFourierTransformer.scaleArray(complexArray88, (double) 'a');
        org.apache.commons.math.transform.FastFourierTransformer.verifyDataSet((java.lang.Object[]) complexArray88);
        org.apache.commons.math.complex.Complex[] complexArray92 = fastFourierTransformer80.inversetransform(complexArray88);
        org.apache.commons.math.complex.Complex[] complexArray94 = org.apache.commons.math.transform.FastFourierTransformer.scaleArray(complexArray92, 0.0d);
        org.apache.commons.math.complex.Complex[] complexArray95 = fastFourierTransformer0.transform2(complexArray92);
        org.junit.Assert.assertNotNull(doubleArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray5), "[-1.0, 97.0, 1.0, 10.0]");
        org.junit.Assert.assertNotNull(complexArray7);
        org.junit.Assert.assertNotNull(doubleArray13);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray13), "[-1.0, 97.0, 1.0, 10.0]");
        org.junit.Assert.assertNotNull(complexArray15);
        org.junit.Assert.assertNotNull(complexArray17);
        org.junit.Assert.assertNotNull(complexArray20);
        org.junit.Assert.assertNotNull(complexArray21);
        org.junit.Assert.assertNotNull(doubleArray26);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray26), "[-10.0, 970.0, 10.0, 100.0]");
        org.junit.Assert.assertNotNull(doubleArray29);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray29), "[-10.0, 970.0, 10.0, 100.0]");
        org.junit.Assert.assertNotNull(complexArray30);
        org.junit.Assert.assertNotNull(doubleArray35);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray35), "[-0.0, 0.0, 0.0, 0.0]");
        org.junit.Assert.assertNotNull(doubleArray38);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray38), "[-0.0, 0.0, 0.0, 0.0]");
        org.junit.Assert.assertNotNull(doubleArray40);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray40), "[-0.0, 0.0, 0.0, 0.0]");
        org.junit.Assert.assertNotNull(complexArray42);
        org.junit.Assert.assertNotNull(doubleArray49);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray49), "[-1.0, 97.0, 1.0, 10.0]");
        org.junit.Assert.assertNotNull(complexArray51);
        org.junit.Assert.assertNotNull(complexArray53);
        org.junit.Assert.assertNotNull(complexArray55);
        org.junit.Assert.assertNotNull(doubleArray61);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray61), "[-100.0, 9700.0, 100.0, 1000.0]");
        org.junit.Assert.assertNotNull(complexArray63);
        org.junit.Assert.assertNotNull(doubleArray65);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray65), "[-100.0, 9700.0, 100.0, 1000.0]");
        org.junit.Assert.assertNotNull(complexArray66);
        org.junit.Assert.assertNotNull(doubleArray72);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray72), "[-10.0, 970.0, 10.0, 100.0]");
        org.junit.Assert.assertNotNull(doubleArray75);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray75), "[-10.0, 970.0, 10.0, 100.0]");
        org.junit.Assert.assertNotNull(complexArray77);
        org.junit.Assert.assertNotNull(complexArray78);
        org.junit.Assert.assertNotNull(complexArray79);
        org.junit.Assert.assertNotNull(doubleArray86);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray86), "[-1.0, 97.0, 1.0, 10.0]");
        org.junit.Assert.assertNotNull(complexArray88);
        org.junit.Assert.assertNotNull(complexArray90);
        org.junit.Assert.assertNotNull(complexArray92);
        org.junit.Assert.assertNotNull(complexArray94);
        org.junit.Assert.assertNotNull(complexArray95);
    }

    @Test
    public void test2507() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2507");
        org.apache.commons.math.transform.FastFourierTransformer fastFourierTransformer0 = new org.apache.commons.math.transform.FastFourierTransformer();
        double[] doubleArray5 = new double[] { (-1L), 'a', 1L, 10 };
        org.apache.commons.math.transform.FastFourierTransformer.verifyDataSet(doubleArray5);
        org.apache.commons.math.complex.Complex[] complexArray7 = fastFourierTransformer0.transform2(doubleArray5);
        org.apache.commons.math.transform.FastFourierTransformer fastFourierTransformer8 = new org.apache.commons.math.transform.FastFourierTransformer();
        double[] doubleArray13 = new double[] { (-1L), 'a', 1L, 10 };
        org.apache.commons.math.transform.FastFourierTransformer.verifyDataSet(doubleArray13);
        org.apache.commons.math.complex.Complex[] complexArray15 = fastFourierTransformer8.transform2(doubleArray13);
        org.apache.commons.math.complex.Complex[] complexArray17 = org.apache.commons.math.transform.FastFourierTransformer.scaleArray(complexArray15, (double) 'a');
        org.apache.commons.math.transform.FastFourierTransformer.verifyDataSet((java.lang.Object[]) complexArray15);
        org.apache.commons.math.complex.Complex[] complexArray20 = org.apache.commons.math.transform.FastFourierTransformer.scaleArray(complexArray15, (double) 1L);
        org.apache.commons.math.complex.Complex[] complexArray21 = fastFourierTransformer0.transform2(complexArray20);
        double[] doubleArray26 = new double[] { (-1L), 'a', 1L, 10 };
        org.apache.commons.math.transform.FastFourierTransformer.verifyDataSet(doubleArray26);
        double[] doubleArray29 = org.apache.commons.math.transform.FastFourierTransformer.scaleArray(doubleArray26, (double) 10.0f);
        org.apache.commons.math.complex.Complex[] complexArray30 = fastFourierTransformer0.transform(doubleArray26);
        org.apache.commons.math.transform.FastFourierTransformer fastFourierTransformer31 = new org.apache.commons.math.transform.FastFourierTransformer();
        org.apache.commons.math.transform.FastFourierTransformer fastFourierTransformer32 = new org.apache.commons.math.transform.FastFourierTransformer();
        double[] doubleArray37 = new double[] { (-1L), 'a', 1L, 10 };
        org.apache.commons.math.transform.FastFourierTransformer.verifyDataSet(doubleArray37);
        org.apache.commons.math.complex.Complex[] complexArray39 = fastFourierTransformer32.transform2(doubleArray37);
        org.apache.commons.math.complex.Complex[] complexArray41 = org.apache.commons.math.transform.FastFourierTransformer.scaleArray(complexArray39, (double) 'a');
        org.apache.commons.math.transform.FastFourierTransformer.verifyDataSet((java.lang.Object[]) complexArray39);
        org.apache.commons.math.complex.Complex[] complexArray43 = fastFourierTransformer31.inversetransform(complexArray39);
        org.apache.commons.math.transform.FastFourierTransformer fastFourierTransformer44 = new org.apache.commons.math.transform.FastFourierTransformer();
        double[] doubleArray49 = new double[] { (-1L), 'a', 1L, 10 };
        org.apache.commons.math.transform.FastFourierTransformer.verifyDataSet(doubleArray49);
        org.apache.commons.math.complex.Complex[] complexArray51 = fastFourierTransformer44.transform2(doubleArray49);
        org.apache.commons.math.complex.Complex[] complexArray52 = fastFourierTransformer31.transform(complexArray51);
        org.apache.commons.math.complex.Complex[] complexArray53 = fastFourierTransformer0.transform2(complexArray52);
        org.apache.commons.math.transform.FastFourierTransformer fastFourierTransformer54 = new org.apache.commons.math.transform.FastFourierTransformer();
        org.apache.commons.math.transform.FastFourierTransformer fastFourierTransformer55 = new org.apache.commons.math.transform.FastFourierTransformer();
        double[] doubleArray60 = new double[] { (-1L), 'a', 1L, 10 };
        org.apache.commons.math.transform.FastFourierTransformer.verifyDataSet(doubleArray60);
        org.apache.commons.math.complex.Complex[] complexArray62 = fastFourierTransformer55.transform2(doubleArray60);
        org.apache.commons.math.complex.Complex[] complexArray64 = org.apache.commons.math.transform.FastFourierTransformer.scaleArray(complexArray62, (double) 'a');
        org.apache.commons.math.transform.FastFourierTransformer.verifyDataSet((java.lang.Object[]) complexArray62);
        org.apache.commons.math.complex.Complex[] complexArray66 = fastFourierTransformer54.inversetransform(complexArray62);
        org.apache.commons.math.transform.FastFourierTransformer fastFourierTransformer67 = new org.apache.commons.math.transform.FastFourierTransformer();
        double[] doubleArray72 = new double[] { (-1L), 'a', 1L, 10 };
        org.apache.commons.math.transform.FastFourierTransformer.verifyDataSet(doubleArray72);
        org.apache.commons.math.complex.Complex[] complexArray74 = fastFourierTransformer67.transform2(doubleArray72);
        org.apache.commons.math.complex.Complex[] complexArray75 = fastFourierTransformer54.transform(complexArray74);
        org.apache.commons.math.complex.Complex[] complexArray76 = fastFourierTransformer0.transform2(complexArray75);
        org.apache.commons.math.transform.FastFourierTransformer.verifyDataSet((java.lang.Object[]) complexArray75);
        org.junit.Assert.assertNotNull(doubleArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray5), "[-1.0, 97.0, 1.0, 10.0]");
        org.junit.Assert.assertNotNull(complexArray7);
        org.junit.Assert.assertNotNull(doubleArray13);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray13), "[-1.0, 97.0, 1.0, 10.0]");
        org.junit.Assert.assertNotNull(complexArray15);
        org.junit.Assert.assertNotNull(complexArray17);
        org.junit.Assert.assertNotNull(complexArray20);
        org.junit.Assert.assertNotNull(complexArray21);
        org.junit.Assert.assertNotNull(doubleArray26);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray26), "[-10.0, 970.0, 10.0, 100.0]");
        org.junit.Assert.assertNotNull(doubleArray29);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray29), "[-10.0, 970.0, 10.0, 100.0]");
        org.junit.Assert.assertNotNull(complexArray30);
        org.junit.Assert.assertNotNull(doubleArray37);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray37), "[-1.0, 97.0, 1.0, 10.0]");
        org.junit.Assert.assertNotNull(complexArray39);
        org.junit.Assert.assertNotNull(complexArray41);
        org.junit.Assert.assertNotNull(complexArray43);
        org.junit.Assert.assertNotNull(doubleArray49);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray49), "[-1.0, 97.0, 1.0, 10.0]");
        org.junit.Assert.assertNotNull(complexArray51);
        org.junit.Assert.assertNotNull(complexArray52);
        org.junit.Assert.assertNotNull(complexArray53);
        org.junit.Assert.assertNotNull(doubleArray60);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray60), "[-1.0, 97.0, 1.0, 10.0]");
        org.junit.Assert.assertNotNull(complexArray62);
        org.junit.Assert.assertNotNull(complexArray64);
        org.junit.Assert.assertNotNull(complexArray66);
        org.junit.Assert.assertNotNull(doubleArray72);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray72), "[-1.0, 97.0, 1.0, 10.0]");
        org.junit.Assert.assertNotNull(complexArray74);
        org.junit.Assert.assertNotNull(complexArray75);
        org.junit.Assert.assertNotNull(complexArray76);
    }

    @Test
    public void test2508() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2508");
        org.apache.commons.math.transform.FastFourierTransformer fastFourierTransformer0 = new org.apache.commons.math.transform.FastFourierTransformer();
        double[] doubleArray5 = new double[] { (-1L), 'a', 1L, 10 };
        org.apache.commons.math.transform.FastFourierTransformer.verifyDataSet(doubleArray5);
        org.apache.commons.math.complex.Complex[] complexArray7 = fastFourierTransformer0.transform2(doubleArray5);
        org.apache.commons.math.transform.FastFourierTransformer fastFourierTransformer8 = new org.apache.commons.math.transform.FastFourierTransformer();
        double[] doubleArray13 = new double[] { (-1L), 'a', 1L, 10 };
        org.apache.commons.math.transform.FastFourierTransformer.verifyDataSet(doubleArray13);
        org.apache.commons.math.complex.Complex[] complexArray15 = fastFourierTransformer8.transform2(doubleArray13);
        org.apache.commons.math.complex.Complex[] complexArray17 = org.apache.commons.math.transform.FastFourierTransformer.scaleArray(complexArray15, (double) 'a');
        org.apache.commons.math.transform.FastFourierTransformer.verifyDataSet((java.lang.Object[]) complexArray15);
        org.apache.commons.math.complex.Complex[] complexArray20 = org.apache.commons.math.transform.FastFourierTransformer.scaleArray(complexArray15, (double) 1L);
        org.apache.commons.math.complex.Complex[] complexArray21 = fastFourierTransformer0.transform2(complexArray20);
        double[] doubleArray26 = new double[] { (-1L), 'a', 1L, 10 };
        org.apache.commons.math.transform.FastFourierTransformer.verifyDataSet(doubleArray26);
        double[] doubleArray29 = org.apache.commons.math.transform.FastFourierTransformer.scaleArray(doubleArray26, (double) 10.0f);
        org.apache.commons.math.complex.Complex[] complexArray30 = fastFourierTransformer0.transform(doubleArray26);
        org.apache.commons.math.transform.FastFourierTransformer fastFourierTransformer31 = new org.apache.commons.math.transform.FastFourierTransformer();
        org.apache.commons.math.transform.FastFourierTransformer fastFourierTransformer32 = new org.apache.commons.math.transform.FastFourierTransformer();
        double[] doubleArray37 = new double[] { (-1L), 'a', 1L, 10 };
        org.apache.commons.math.transform.FastFourierTransformer.verifyDataSet(doubleArray37);
        org.apache.commons.math.complex.Complex[] complexArray39 = fastFourierTransformer32.transform2(doubleArray37);
        org.apache.commons.math.complex.Complex[] complexArray41 = org.apache.commons.math.transform.FastFourierTransformer.scaleArray(complexArray39, (double) 'a');
        org.apache.commons.math.transform.FastFourierTransformer.verifyDataSet((java.lang.Object[]) complexArray39);
        org.apache.commons.math.complex.Complex[] complexArray43 = fastFourierTransformer31.inversetransform(complexArray39);
        org.apache.commons.math.transform.FastFourierTransformer fastFourierTransformer44 = new org.apache.commons.math.transform.FastFourierTransformer();
        double[] doubleArray49 = new double[] { (-1L), 'a', 1L, 10 };
        org.apache.commons.math.transform.FastFourierTransformer.verifyDataSet(doubleArray49);
        org.apache.commons.math.complex.Complex[] complexArray51 = fastFourierTransformer44.transform2(doubleArray49);
        org.apache.commons.math.complex.Complex[] complexArray53 = org.apache.commons.math.transform.FastFourierTransformer.scaleArray(complexArray51, (double) 'a');
        org.apache.commons.math.transform.FastFourierTransformer.verifyDataSet((java.lang.Object[]) complexArray51);
        org.apache.commons.math.complex.Complex[] complexArray56 = org.apache.commons.math.transform.FastFourierTransformer.scaleArray(complexArray51, (double) 1L);
        org.apache.commons.math.complex.Complex[] complexArray58 = org.apache.commons.math.transform.FastFourierTransformer.scaleArray(complexArray51, (double) 1);
        org.apache.commons.math.complex.Complex[] complexArray59 = fastFourierTransformer31.transform(complexArray51);
        org.apache.commons.math.complex.Complex[] complexArray60 = fastFourierTransformer0.inversetransform2(complexArray59);
        org.apache.commons.math.transform.FastFourierTransformer fastFourierTransformer61 = new org.apache.commons.math.transform.FastFourierTransformer();
        org.apache.commons.math.transform.FastFourierTransformer fastFourierTransformer62 = new org.apache.commons.math.transform.FastFourierTransformer();
        double[] doubleArray67 = new double[] { (-1L), 'a', 1L, 10 };
        org.apache.commons.math.transform.FastFourierTransformer.verifyDataSet(doubleArray67);
        org.apache.commons.math.complex.Complex[] complexArray69 = fastFourierTransformer62.transform2(doubleArray67);
        org.apache.commons.math.complex.Complex[] complexArray71 = org.apache.commons.math.transform.FastFourierTransformer.scaleArray(complexArray69, (double) 'a');
        org.apache.commons.math.transform.FastFourierTransformer.verifyDataSet((java.lang.Object[]) complexArray69);
        org.apache.commons.math.complex.Complex[] complexArray73 = fastFourierTransformer61.inversetransform(complexArray69);
        org.apache.commons.math.complex.Complex[] complexArray74 = fastFourierTransformer0.inversetransform2(complexArray73);
        org.apache.commons.math.transform.FastFourierTransformer fastFourierTransformer75 = new org.apache.commons.math.transform.FastFourierTransformer();
        double[] doubleArray80 = new double[] { (-1L), 'a', 1L, 10 };
        org.apache.commons.math.transform.FastFourierTransformer.verifyDataSet(doubleArray80);
        org.apache.commons.math.complex.Complex[] complexArray82 = fastFourierTransformer75.transform2(doubleArray80);
        org.apache.commons.math.transform.FastFourierTransformer fastFourierTransformer83 = new org.apache.commons.math.transform.FastFourierTransformer();
        double[] doubleArray88 = new double[] { (-1L), 'a', 1L, 10 };
        org.apache.commons.math.transform.FastFourierTransformer.verifyDataSet(doubleArray88);
        org.apache.commons.math.complex.Complex[] complexArray90 = fastFourierTransformer83.transform2(doubleArray88);
        org.apache.commons.math.complex.Complex[] complexArray92 = org.apache.commons.math.transform.FastFourierTransformer.scaleArray(complexArray90, (double) 'a');
        org.apache.commons.math.transform.FastFourierTransformer.verifyDataSet((java.lang.Object[]) complexArray90);
        org.apache.commons.math.complex.Complex[] complexArray95 = org.apache.commons.math.transform.FastFourierTransformer.scaleArray(complexArray90, (double) 1L);
        org.apache.commons.math.complex.Complex[] complexArray96 = fastFourierTransformer75.transform2(complexArray95);
        org.apache.commons.math.complex.Complex[] complexArray97 = fastFourierTransformer0.inversetransform(complexArray95);
        java.lang.Class<?> wildcardClass98 = complexArray95.getClass();
        org.junit.Assert.assertNotNull(doubleArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray5), "[-1.0, 97.0, 1.0, 10.0]");
        org.junit.Assert.assertNotNull(complexArray7);
        org.junit.Assert.assertNotNull(doubleArray13);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray13), "[-1.0, 97.0, 1.0, 10.0]");
        org.junit.Assert.assertNotNull(complexArray15);
        org.junit.Assert.assertNotNull(complexArray17);
        org.junit.Assert.assertNotNull(complexArray20);
        org.junit.Assert.assertNotNull(complexArray21);
        org.junit.Assert.assertNotNull(doubleArray26);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray26), "[-10.0, 970.0, 10.0, 100.0]");
        org.junit.Assert.assertNotNull(doubleArray29);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray29), "[-10.0, 970.0, 10.0, 100.0]");
        org.junit.Assert.assertNotNull(complexArray30);
        org.junit.Assert.assertNotNull(doubleArray37);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray37), "[-1.0, 97.0, 1.0, 10.0]");
        org.junit.Assert.assertNotNull(complexArray39);
        org.junit.Assert.assertNotNull(complexArray41);
        org.junit.Assert.assertNotNull(complexArray43);
        org.junit.Assert.assertNotNull(doubleArray49);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray49), "[-1.0, 97.0, 1.0, 10.0]");
        org.junit.Assert.assertNotNull(complexArray51);
        org.junit.Assert.assertNotNull(complexArray53);
        org.junit.Assert.assertNotNull(complexArray56);
        org.junit.Assert.assertNotNull(complexArray58);
        org.junit.Assert.assertNotNull(complexArray59);
        org.junit.Assert.assertNotNull(complexArray60);
        org.junit.Assert.assertNotNull(doubleArray67);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray67), "[-1.0, 97.0, 1.0, 10.0]");
        org.junit.Assert.assertNotNull(complexArray69);
        org.junit.Assert.assertNotNull(complexArray71);
        org.junit.Assert.assertNotNull(complexArray73);
        org.junit.Assert.assertNotNull(complexArray74);
        org.junit.Assert.assertNotNull(doubleArray80);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray80), "[-1.0, 97.0, 1.0, 10.0]");
        org.junit.Assert.assertNotNull(complexArray82);
        org.junit.Assert.assertNotNull(doubleArray88);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray88), "[-1.0, 97.0, 1.0, 10.0]");
        org.junit.Assert.assertNotNull(complexArray90);
        org.junit.Assert.assertNotNull(complexArray92);
        org.junit.Assert.assertNotNull(complexArray95);
        org.junit.Assert.assertNotNull(complexArray96);
        org.junit.Assert.assertNotNull(complexArray97);
        org.junit.Assert.assertNotNull(wildcardClass98);
    }

    @Test
    public void test2509() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2509");
        org.apache.commons.math.transform.FastFourierTransformer fastFourierTransformer0 = new org.apache.commons.math.transform.FastFourierTransformer();
        org.apache.commons.math.transform.FastFourierTransformer fastFourierTransformer1 = new org.apache.commons.math.transform.FastFourierTransformer();
        double[] doubleArray6 = new double[] { (-1L), 'a', 1L, 10 };
        org.apache.commons.math.transform.FastFourierTransformer.verifyDataSet(doubleArray6);
        org.apache.commons.math.complex.Complex[] complexArray8 = fastFourierTransformer1.transform2(doubleArray6);
        org.apache.commons.math.transform.FastFourierTransformer fastFourierTransformer9 = new org.apache.commons.math.transform.FastFourierTransformer();
        double[] doubleArray14 = new double[] { (-1L), 'a', 1L, 10 };
        org.apache.commons.math.transform.FastFourierTransformer.verifyDataSet(doubleArray14);
        org.apache.commons.math.complex.Complex[] complexArray16 = fastFourierTransformer9.transform2(doubleArray14);
        org.apache.commons.math.complex.Complex[] complexArray18 = org.apache.commons.math.transform.FastFourierTransformer.scaleArray(complexArray16, (double) 'a');
        org.apache.commons.math.transform.FastFourierTransformer.verifyDataSet((java.lang.Object[]) complexArray16);
        org.apache.commons.math.complex.Complex[] complexArray21 = org.apache.commons.math.transform.FastFourierTransformer.scaleArray(complexArray16, (double) 1L);
        org.apache.commons.math.complex.Complex[] complexArray22 = fastFourierTransformer1.transform2(complexArray21);
        org.apache.commons.math.transform.FastFourierTransformer fastFourierTransformer23 = new org.apache.commons.math.transform.FastFourierTransformer();
        double[] doubleArray28 = new double[] { (-1L), 'a', 1L, 10 };
        org.apache.commons.math.transform.FastFourierTransformer.verifyDataSet(doubleArray28);
        double[] doubleArray31 = org.apache.commons.math.transform.FastFourierTransformer.scaleArray(doubleArray28, (double) 10.0f);
        org.apache.commons.math.transform.FastFourierTransformer.verifyDataSet(doubleArray31);
        org.apache.commons.math.complex.Complex[] complexArray33 = fastFourierTransformer23.transform(doubleArray31);
        org.apache.commons.math.complex.Complex[] complexArray34 = fastFourierTransformer1.transform(doubleArray31);
        org.apache.commons.math.transform.FastFourierTransformer fastFourierTransformer35 = new org.apache.commons.math.transform.FastFourierTransformer();
        double[] doubleArray40 = new double[] { (-1L), 'a', 1L, 10 };
        org.apache.commons.math.transform.FastFourierTransformer.verifyDataSet(doubleArray40);
        org.apache.commons.math.complex.Complex[] complexArray42 = fastFourierTransformer35.transform2(doubleArray40);
        org.apache.commons.math.complex.Complex[] complexArray44 = org.apache.commons.math.transform.FastFourierTransformer.scaleArray(complexArray42, (double) 'a');
        org.apache.commons.math.transform.FastFourierTransformer.verifyDataSet((java.lang.Object[]) complexArray42);
        org.apache.commons.math.complex.Complex[] complexArray47 = org.apache.commons.math.transform.FastFourierTransformer.scaleArray(complexArray42, (double) 1L);
        org.apache.commons.math.complex.Complex[] complexArray48 = fastFourierTransformer1.inversetransform2(complexArray42);
        org.apache.commons.math.transform.FastFourierTransformer fastFourierTransformer49 = new org.apache.commons.math.transform.FastFourierTransformer();
        double[] doubleArray54 = new double[] { (-1L), 'a', 1L, 10 };
        org.apache.commons.math.transform.FastFourierTransformer.verifyDataSet(doubleArray54);
        org.apache.commons.math.complex.Complex[] complexArray56 = fastFourierTransformer49.transform2(doubleArray54);
        org.apache.commons.math.complex.Complex[] complexArray58 = org.apache.commons.math.transform.FastFourierTransformer.scaleArray(complexArray56, (double) 'a');
        org.apache.commons.math.transform.FastFourierTransformer.verifyDataSet((java.lang.Object[]) complexArray56);
        org.apache.commons.math.complex.Complex[] complexArray61 = org.apache.commons.math.transform.FastFourierTransformer.scaleArray(complexArray56, (double) 1L);
        org.apache.commons.math.complex.Complex[] complexArray63 = org.apache.commons.math.transform.FastFourierTransformer.scaleArray(complexArray56, (double) 1);
        org.apache.commons.math.complex.Complex[] complexArray64 = fastFourierTransformer1.inversetransform(complexArray63);
        org.apache.commons.math.complex.Complex[] complexArray66 = org.apache.commons.math.transform.FastFourierTransformer.scaleArray(complexArray63, (double) (byte) 1);
        org.apache.commons.math.complex.Complex[] complexArray67 = fastFourierTransformer0.inversetransform2(complexArray66);
        org.apache.commons.math.transform.FastFourierTransformer fastFourierTransformer68 = new org.apache.commons.math.transform.FastFourierTransformer();
        double[] doubleArray73 = new double[] { (-1L), 'a', 1L, 10 };
        org.apache.commons.math.transform.FastFourierTransformer.verifyDataSet(doubleArray73);
        double[] doubleArray76 = org.apache.commons.math.transform.FastFourierTransformer.scaleArray(doubleArray73, (double) 10.0f);
        double[] doubleArray78 = org.apache.commons.math.transform.FastFourierTransformer.scaleArray(doubleArray76, (double) 10L);
        org.apache.commons.math.complex.Complex[] complexArray79 = fastFourierTransformer68.inversetransform(doubleArray78);
        double[] doubleArray81 = org.apache.commons.math.transform.FastFourierTransformer.scaleArray(doubleArray78, (double) (byte) 0);
        org.apache.commons.math.complex.Complex[] complexArray82 = fastFourierTransformer0.transform(doubleArray81);
        org.apache.commons.math.transform.FastFourierTransformer.verifyDataSet(doubleArray81);
        double[] doubleArray85 = org.apache.commons.math.transform.FastFourierTransformer.scaleArray(doubleArray81, (double) (short) 1);
        org.junit.Assert.assertNotNull(doubleArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray6), "[-1.0, 97.0, 1.0, 10.0]");
        org.junit.Assert.assertNotNull(complexArray8);
        org.junit.Assert.assertNotNull(doubleArray14);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray14), "[-1.0, 97.0, 1.0, 10.0]");
        org.junit.Assert.assertNotNull(complexArray16);
        org.junit.Assert.assertNotNull(complexArray18);
        org.junit.Assert.assertNotNull(complexArray21);
        org.junit.Assert.assertNotNull(complexArray22);
        org.junit.Assert.assertNotNull(doubleArray28);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray28), "[-10.0, 970.0, 10.0, 100.0]");
        org.junit.Assert.assertNotNull(doubleArray31);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray31), "[-10.0, 970.0, 10.0, 100.0]");
        org.junit.Assert.assertNotNull(complexArray33);
        org.junit.Assert.assertNotNull(complexArray34);
        org.junit.Assert.assertNotNull(doubleArray40);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray40), "[-1.0, 97.0, 1.0, 10.0]");
        org.junit.Assert.assertNotNull(complexArray42);
        org.junit.Assert.assertNotNull(complexArray44);
        org.junit.Assert.assertNotNull(complexArray47);
        org.junit.Assert.assertNotNull(complexArray48);
        org.junit.Assert.assertNotNull(doubleArray54);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray54), "[-1.0, 97.0, 1.0, 10.0]");
        org.junit.Assert.assertNotNull(complexArray56);
        org.junit.Assert.assertNotNull(complexArray58);
        org.junit.Assert.assertNotNull(complexArray61);
        org.junit.Assert.assertNotNull(complexArray63);
        org.junit.Assert.assertNotNull(complexArray64);
        org.junit.Assert.assertNotNull(complexArray66);
        org.junit.Assert.assertNotNull(complexArray67);
        org.junit.Assert.assertNotNull(doubleArray73);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray73), "[-0.0, 0.0, 0.0, 0.0]");
        org.junit.Assert.assertNotNull(doubleArray76);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray76), "[-0.0, 0.0, 0.0, 0.0]");
        org.junit.Assert.assertNotNull(doubleArray78);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray78), "[-0.0, 0.0, 0.0, 0.0]");
        org.junit.Assert.assertNotNull(complexArray79);
        org.junit.Assert.assertNotNull(doubleArray81);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray81), "[-0.0, 0.0, 0.0, 0.0]");
        org.junit.Assert.assertNotNull(complexArray82);
        org.junit.Assert.assertNotNull(doubleArray85);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray85), "[-0.0, 0.0, 0.0, 0.0]");
    }

    @Test
    public void test2510() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2510");
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math.transform.FastFourierTransformer.verifyInterval((double) 100L, 0.0d);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Endpoints do not specify an interval: [100.0, 0.0]");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void test2511() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2511");
        org.apache.commons.math.analysis.UnivariateRealFunction univariateRealFunction0 = null;
        // The following exception was thrown during execution in test generation
        try {
            double[] doubleArray4 = org.apache.commons.math.transform.FastFourierTransformer.sample(univariateRealFunction0, (double) 0, (double) (short) 100, (int) (byte) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Number of samples not positive.");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }
}

