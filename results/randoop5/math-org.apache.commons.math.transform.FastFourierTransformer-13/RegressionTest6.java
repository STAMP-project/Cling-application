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
        org.apache.commons.math.transform.FastFourierTransformer fastFourierTransformer0 = new org.apache.commons.math.transform.FastFourierTransformer();
        org.apache.commons.math.transform.FastFourierTransformer fastFourierTransformer1 = new org.apache.commons.math.transform.FastFourierTransformer();
        double[] doubleArray6 = new double[] { (-1L), 'a', 1L, 10 };
        org.apache.commons.math.transform.FastFourierTransformer.verifyDataSet(doubleArray6);
        org.apache.commons.math.complex.Complex[] complexArray8 = fastFourierTransformer1.transform2(doubleArray6);
        org.apache.commons.math.complex.Complex[] complexArray10 = org.apache.commons.math.transform.FastFourierTransformer.scaleArray(complexArray8, (double) 'a');
        org.apache.commons.math.transform.FastFourierTransformer.verifyDataSet((java.lang.Object[]) complexArray8);
        org.apache.commons.math.complex.Complex[] complexArray12 = fastFourierTransformer0.inversetransform(complexArray8);
        org.apache.commons.math.transform.FastFourierTransformer fastFourierTransformer13 = new org.apache.commons.math.transform.FastFourierTransformer();
        double[] doubleArray18 = new double[] { (-1L), 'a', 1L, 10 };
        org.apache.commons.math.transform.FastFourierTransformer.verifyDataSet(doubleArray18);
        org.apache.commons.math.complex.Complex[] complexArray20 = fastFourierTransformer13.transform2(doubleArray18);
        org.apache.commons.math.complex.Complex[] complexArray21 = fastFourierTransformer0.transform(complexArray20);
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
        org.apache.commons.math.complex.Complex[] complexArray44 = org.apache.commons.math.transform.FastFourierTransformer.scaleArray(complexArray42, (double) 'a');
        org.apache.commons.math.transform.FastFourierTransformer.verifyDataSet((java.lang.Object[]) complexArray42);
        org.apache.commons.math.complex.Complex[] complexArray47 = org.apache.commons.math.transform.FastFourierTransformer.scaleArray(complexArray42, (double) 1L);
        org.apache.commons.math.complex.Complex[] complexArray49 = org.apache.commons.math.transform.FastFourierTransformer.scaleArray(complexArray42, (double) 1);
        org.apache.commons.math.complex.Complex[] complexArray50 = fastFourierTransformer22.transform(complexArray42);
        org.apache.commons.math.complex.Complex[] complexArray51 = fastFourierTransformer0.transform(complexArray50);
        org.apache.commons.math.transform.FastFourierTransformer fastFourierTransformer52 = new org.apache.commons.math.transform.FastFourierTransformer();
        double[] doubleArray57 = new double[] { (-1L), 'a', 1L, 10 };
        org.apache.commons.math.transform.FastFourierTransformer.verifyDataSet(doubleArray57);
        double[] doubleArray60 = org.apache.commons.math.transform.FastFourierTransformer.scaleArray(doubleArray57, (double) 10.0f);
        org.apache.commons.math.transform.FastFourierTransformer.verifyDataSet(doubleArray60);
        org.apache.commons.math.complex.Complex[] complexArray62 = fastFourierTransformer52.transform(doubleArray60);
        org.apache.commons.math.transform.FastFourierTransformer fastFourierTransformer63 = new org.apache.commons.math.transform.FastFourierTransformer();
        double[] doubleArray68 = new double[] { (-1L), 'a', 1L, 10 };
        org.apache.commons.math.transform.FastFourierTransformer.verifyDataSet(doubleArray68);
        org.apache.commons.math.complex.Complex[] complexArray70 = fastFourierTransformer63.transform2(doubleArray68);
        org.apache.commons.math.complex.Complex[] complexArray72 = org.apache.commons.math.transform.FastFourierTransformer.scaleArray(complexArray70, (double) 'a');
        org.apache.commons.math.transform.FastFourierTransformer.verifyDataSet((java.lang.Object[]) complexArray70);
        org.apache.commons.math.complex.Complex[] complexArray75 = org.apache.commons.math.transform.FastFourierTransformer.scaleArray(complexArray70, (double) 1L);
        org.apache.commons.math.complex.Complex[] complexArray77 = org.apache.commons.math.transform.FastFourierTransformer.scaleArray(complexArray70, (double) 1);
        org.apache.commons.math.complex.Complex[] complexArray78 = fastFourierTransformer52.inversetransform2(complexArray77);
        org.apache.commons.math.complex.Complex[] complexArray79 = fastFourierTransformer0.inversetransform2(complexArray77);
        org.apache.commons.math.analysis.UnivariateRealFunction univariateRealFunction80 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math.complex.Complex[] complexArray84 = fastFourierTransformer0.inversetransform(univariateRealFunction80, 0.0d, (double) (short) 100, (int) (short) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(doubleArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray6), "[-1.0, 97.0, 1.0, 10.0]");
        org.junit.Assert.assertNotNull(complexArray8);
        org.junit.Assert.assertNotNull(complexArray10);
        org.junit.Assert.assertNotNull(complexArray12);
        org.junit.Assert.assertNotNull(doubleArray18);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray18), "[-1.0, 97.0, 1.0, 10.0]");
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
        org.junit.Assert.assertNotNull(complexArray44);
        org.junit.Assert.assertNotNull(complexArray47);
        org.junit.Assert.assertNotNull(complexArray49);
        org.junit.Assert.assertNotNull(complexArray50);
        org.junit.Assert.assertNotNull(complexArray51);
        org.junit.Assert.assertNotNull(doubleArray57);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray57), "[-10.0, 970.0, 10.0, 100.0]");
        org.junit.Assert.assertNotNull(doubleArray60);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray60), "[-10.0, 970.0, 10.0, 100.0]");
        org.junit.Assert.assertNotNull(complexArray62);
        org.junit.Assert.assertNotNull(doubleArray68);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray68), "[-1.0, 97.0, 1.0, 10.0]");
        org.junit.Assert.assertNotNull(complexArray70);
        org.junit.Assert.assertNotNull(complexArray72);
        org.junit.Assert.assertNotNull(complexArray75);
        org.junit.Assert.assertNotNull(complexArray77);
        org.junit.Assert.assertNotNull(complexArray78);
        org.junit.Assert.assertNotNull(complexArray79);
    }

    @Test
    public void test3002() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3002");
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
        double[] doubleArray27 = new double[] { (-1L), 'a', 1L, 10 };
        org.apache.commons.math.transform.FastFourierTransformer.verifyDataSet(doubleArray27);
        double[] doubleArray30 = org.apache.commons.math.transform.FastFourierTransformer.scaleArray(doubleArray27, (double) 10.0f);
        org.apache.commons.math.transform.FastFourierTransformer.verifyDataSet(doubleArray30);
        org.apache.commons.math.complex.Complex[] complexArray32 = fastFourierTransformer22.transform(doubleArray30);
        org.apache.commons.math.complex.Complex[] complexArray33 = fastFourierTransformer0.transform(doubleArray30);
        double[] doubleArray38 = new double[] { (-1L), 'a', 1L, 10 };
        org.apache.commons.math.transform.FastFourierTransformer.verifyDataSet(doubleArray38);
        double[] doubleArray41 = org.apache.commons.math.transform.FastFourierTransformer.scaleArray(doubleArray38, (double) 10.0f);
        double[] doubleArray43 = org.apache.commons.math.transform.FastFourierTransformer.scaleArray(doubleArray41, (double) 10L);
        org.apache.commons.math.complex.Complex[] complexArray44 = fastFourierTransformer0.inversetransform(doubleArray43);
        double[] doubleArray49 = new double[] { (-1L), 'a', 1L, 10 };
        org.apache.commons.math.transform.FastFourierTransformer.verifyDataSet(doubleArray49);
        double[] doubleArray52 = org.apache.commons.math.transform.FastFourierTransformer.scaleArray(doubleArray49, (double) 10.0f);
        org.apache.commons.math.complex.Complex[] complexArray53 = fastFourierTransformer0.inversetransform2(doubleArray49);
        org.apache.commons.math.transform.FastFourierTransformer fastFourierTransformer54 = new org.apache.commons.math.transform.FastFourierTransformer();
        double[] doubleArray59 = new double[] { (-1L), 'a', 1L, 10 };
        org.apache.commons.math.transform.FastFourierTransformer.verifyDataSet(doubleArray59);
        org.apache.commons.math.complex.Complex[] complexArray61 = fastFourierTransformer54.transform2(doubleArray59);
        org.apache.commons.math.transform.FastFourierTransformer fastFourierTransformer62 = new org.apache.commons.math.transform.FastFourierTransformer();
        double[] doubleArray67 = new double[] { (-1L), 'a', 1L, 10 };
        org.apache.commons.math.transform.FastFourierTransformer.verifyDataSet(doubleArray67);
        org.apache.commons.math.complex.Complex[] complexArray69 = fastFourierTransformer62.transform2(doubleArray67);
        org.apache.commons.math.complex.Complex[] complexArray71 = org.apache.commons.math.transform.FastFourierTransformer.scaleArray(complexArray69, (double) 'a');
        org.apache.commons.math.transform.FastFourierTransformer.verifyDataSet((java.lang.Object[]) complexArray69);
        org.apache.commons.math.complex.Complex[] complexArray74 = org.apache.commons.math.transform.FastFourierTransformer.scaleArray(complexArray69, (double) 1L);
        org.apache.commons.math.complex.Complex[] complexArray75 = fastFourierTransformer54.transform2(complexArray74);
        org.apache.commons.math.transform.FastFourierTransformer fastFourierTransformer76 = new org.apache.commons.math.transform.FastFourierTransformer();
        double[] doubleArray81 = new double[] { (-1L), 'a', 1L, 10 };
        org.apache.commons.math.transform.FastFourierTransformer.verifyDataSet(doubleArray81);
        double[] doubleArray84 = org.apache.commons.math.transform.FastFourierTransformer.scaleArray(doubleArray81, (double) 10.0f);
        org.apache.commons.math.transform.FastFourierTransformer.verifyDataSet(doubleArray84);
        org.apache.commons.math.complex.Complex[] complexArray86 = fastFourierTransformer76.transform(doubleArray84);
        org.apache.commons.math.complex.Complex[] complexArray87 = fastFourierTransformer54.transform(doubleArray84);
        org.apache.commons.math.complex.Complex[] complexArray88 = fastFourierTransformer0.inversetransform(doubleArray84);
        org.apache.commons.math.analysis.UnivariateRealFunction univariateRealFunction89 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math.complex.Complex[] complexArray93 = fastFourierTransformer0.inversetransform2(univariateRealFunction89, (double) 100.0f, 0.0d, (int) '4');
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Endpoints do not specify an interval: [100.0, 0.0]");
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
        org.junit.Assert.assertNotNull(doubleArray27);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray27), "[-10.0, 970.0, 10.0, 100.0]");
        org.junit.Assert.assertNotNull(doubleArray30);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray30), "[-10.0, 970.0, 10.0, 100.0]");
        org.junit.Assert.assertNotNull(complexArray32);
        org.junit.Assert.assertNotNull(complexArray33);
        org.junit.Assert.assertNotNull(doubleArray38);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray38), "[-100.0, 9700.0, 100.0, 1000.0]");
        org.junit.Assert.assertNotNull(doubleArray41);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray41), "[-100.0, 9700.0, 100.0, 1000.0]");
        org.junit.Assert.assertNotNull(doubleArray43);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray43), "[-100.0, 9700.0, 100.0, 1000.0]");
        org.junit.Assert.assertNotNull(complexArray44);
        org.junit.Assert.assertNotNull(doubleArray49);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray49), "[-10.0, 970.0, 10.0, 100.0]");
        org.junit.Assert.assertNotNull(doubleArray52);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray52), "[-10.0, 970.0, 10.0, 100.0]");
        org.junit.Assert.assertNotNull(complexArray53);
        org.junit.Assert.assertNotNull(doubleArray59);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray59), "[-1.0, 97.0, 1.0, 10.0]");
        org.junit.Assert.assertNotNull(complexArray61);
        org.junit.Assert.assertNotNull(doubleArray67);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray67), "[-1.0, 97.0, 1.0, 10.0]");
        org.junit.Assert.assertNotNull(complexArray69);
        org.junit.Assert.assertNotNull(complexArray71);
        org.junit.Assert.assertNotNull(complexArray74);
        org.junit.Assert.assertNotNull(complexArray75);
        org.junit.Assert.assertNotNull(doubleArray81);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray81), "[-10.0, 970.0, 10.0, 100.0]");
        org.junit.Assert.assertNotNull(doubleArray84);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray84), "[-10.0, 970.0, 10.0, 100.0]");
        org.junit.Assert.assertNotNull(complexArray86);
        org.junit.Assert.assertNotNull(complexArray87);
        org.junit.Assert.assertNotNull(complexArray88);
    }

    @Test
    public void test3003() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3003");
        org.apache.commons.math.transform.FastFourierTransformer fastFourierTransformer0 = new org.apache.commons.math.transform.FastFourierTransformer();
        double[] doubleArray5 = new double[] { (-1L), 'a', 1L, 10 };
        org.apache.commons.math.transform.FastFourierTransformer.verifyDataSet(doubleArray5);
        org.apache.commons.math.complex.Complex[] complexArray7 = fastFourierTransformer0.transform2(doubleArray5);
        org.apache.commons.math.transform.FastFourierTransformer fastFourierTransformer8 = new org.apache.commons.math.transform.FastFourierTransformer();
        double[] doubleArray13 = new double[] { (-1L), 'a', 1L, 10 };
        org.apache.commons.math.transform.FastFourierTransformer.verifyDataSet(doubleArray13);
        org.apache.commons.math.complex.Complex[] complexArray15 = fastFourierTransformer8.transform2(doubleArray13);
        org.apache.commons.math.transform.FastFourierTransformer fastFourierTransformer16 = new org.apache.commons.math.transform.FastFourierTransformer();
        double[] doubleArray21 = new double[] { (-1L), 'a', 1L, 10 };
        org.apache.commons.math.transform.FastFourierTransformer.verifyDataSet(doubleArray21);
        org.apache.commons.math.complex.Complex[] complexArray23 = fastFourierTransformer16.transform2(doubleArray21);
        org.apache.commons.math.complex.Complex[] complexArray25 = org.apache.commons.math.transform.FastFourierTransformer.scaleArray(complexArray23, (double) 'a');
        org.apache.commons.math.transform.FastFourierTransformer.verifyDataSet((java.lang.Object[]) complexArray23);
        org.apache.commons.math.complex.Complex[] complexArray28 = org.apache.commons.math.transform.FastFourierTransformer.scaleArray(complexArray23, (double) 1L);
        org.apache.commons.math.complex.Complex[] complexArray29 = fastFourierTransformer8.transform2(complexArray28);
        double[] doubleArray34 = new double[] { (-1L), 'a', 1L, 10 };
        org.apache.commons.math.transform.FastFourierTransformer.verifyDataSet(doubleArray34);
        double[] doubleArray37 = org.apache.commons.math.transform.FastFourierTransformer.scaleArray(doubleArray34, (double) 10.0f);
        org.apache.commons.math.complex.Complex[] complexArray38 = fastFourierTransformer8.transform(doubleArray34);
        org.apache.commons.math.complex.Complex[] complexArray39 = fastFourierTransformer0.transform(complexArray38);
        org.apache.commons.math.transform.FastFourierTransformer fastFourierTransformer40 = new org.apache.commons.math.transform.FastFourierTransformer();
        double[] doubleArray45 = new double[] { (-1L), 'a', 1L, 10 };
        org.apache.commons.math.transform.FastFourierTransformer.verifyDataSet(doubleArray45);
        org.apache.commons.math.complex.Complex[] complexArray47 = fastFourierTransformer40.transform2(doubleArray45);
        org.apache.commons.math.complex.Complex[] complexArray49 = org.apache.commons.math.transform.FastFourierTransformer.scaleArray(complexArray47, (double) 100L);
        org.apache.commons.math.complex.Complex[] complexArray51 = org.apache.commons.math.transform.FastFourierTransformer.scaleArray(complexArray49, (double) (byte) 100);
        org.apache.commons.math.complex.Complex[] complexArray52 = fastFourierTransformer0.inversetransform(complexArray49);
        org.apache.commons.math.transform.FastFourierTransformer fastFourierTransformer53 = new org.apache.commons.math.transform.FastFourierTransformer();
        double[] doubleArray58 = new double[] { (-1L), 'a', 1L, 10 };
        org.apache.commons.math.transform.FastFourierTransformer.verifyDataSet(doubleArray58);
        org.apache.commons.math.complex.Complex[] complexArray60 = fastFourierTransformer53.transform2(doubleArray58);
        org.apache.commons.math.complex.Complex[] complexArray62 = org.apache.commons.math.transform.FastFourierTransformer.scaleArray(complexArray60, (double) 'a');
        org.apache.commons.math.transform.FastFourierTransformer.verifyDataSet((java.lang.Object[]) complexArray60);
        org.apache.commons.math.complex.Complex[] complexArray65 = org.apache.commons.math.transform.FastFourierTransformer.scaleArray(complexArray60, (double) 1L);
        org.apache.commons.math.complex.Complex[] complexArray67 = org.apache.commons.math.transform.FastFourierTransformer.scaleArray(complexArray60, (double) 1);
        org.apache.commons.math.complex.Complex[] complexArray68 = fastFourierTransformer0.inversetransform(complexArray60);
        org.apache.commons.math.analysis.UnivariateRealFunction univariateRealFunction69 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math.complex.Complex[] complexArray73 = fastFourierTransformer0.transform(univariateRealFunction69, (double) 100, (double) (byte) 100, (int) '#');
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Endpoints do not specify an interval: [100.0, 100.0]");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(doubleArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray5), "[-1.0, 97.0, 1.0, 10.0]");
        org.junit.Assert.assertNotNull(complexArray7);
        org.junit.Assert.assertNotNull(doubleArray13);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray13), "[-1.0, 97.0, 1.0, 10.0]");
        org.junit.Assert.assertNotNull(complexArray15);
        org.junit.Assert.assertNotNull(doubleArray21);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray21), "[-1.0, 97.0, 1.0, 10.0]");
        org.junit.Assert.assertNotNull(complexArray23);
        org.junit.Assert.assertNotNull(complexArray25);
        org.junit.Assert.assertNotNull(complexArray28);
        org.junit.Assert.assertNotNull(complexArray29);
        org.junit.Assert.assertNotNull(doubleArray34);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray34), "[-10.0, 970.0, 10.0, 100.0]");
        org.junit.Assert.assertNotNull(doubleArray37);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray37), "[-10.0, 970.0, 10.0, 100.0]");
        org.junit.Assert.assertNotNull(complexArray38);
        org.junit.Assert.assertNotNull(complexArray39);
        org.junit.Assert.assertNotNull(doubleArray45);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray45), "[-1.0, 97.0, 1.0, 10.0]");
        org.junit.Assert.assertNotNull(complexArray47);
        org.junit.Assert.assertNotNull(complexArray49);
        org.junit.Assert.assertNotNull(complexArray51);
        org.junit.Assert.assertNotNull(complexArray52);
        org.junit.Assert.assertNotNull(doubleArray58);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray58), "[-1.0, 97.0, 1.0, 10.0]");
        org.junit.Assert.assertNotNull(complexArray60);
        org.junit.Assert.assertNotNull(complexArray62);
        org.junit.Assert.assertNotNull(complexArray65);
        org.junit.Assert.assertNotNull(complexArray67);
        org.junit.Assert.assertNotNull(complexArray68);
    }

    @Test
    public void test3004() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3004");
        org.apache.commons.math.transform.FastFourierTransformer fastFourierTransformer0 = new org.apache.commons.math.transform.FastFourierTransformer();
        double[] doubleArray5 = new double[] { (-1L), 'a', 1L, 10 };
        org.apache.commons.math.transform.FastFourierTransformer.verifyDataSet(doubleArray5);
        org.apache.commons.math.complex.Complex[] complexArray7 = fastFourierTransformer0.transform2(doubleArray5);
        org.apache.commons.math.transform.FastFourierTransformer fastFourierTransformer8 = new org.apache.commons.math.transform.FastFourierTransformer();
        double[] doubleArray13 = new double[] { (-1L), 'a', 1L, 10 };
        org.apache.commons.math.transform.FastFourierTransformer.verifyDataSet(doubleArray13);
        org.apache.commons.math.complex.Complex[] complexArray15 = fastFourierTransformer8.transform2(doubleArray13);
        org.apache.commons.math.transform.FastFourierTransformer fastFourierTransformer16 = new org.apache.commons.math.transform.FastFourierTransformer();
        double[] doubleArray21 = new double[] { (-1L), 'a', 1L, 10 };
        org.apache.commons.math.transform.FastFourierTransformer.verifyDataSet(doubleArray21);
        org.apache.commons.math.complex.Complex[] complexArray23 = fastFourierTransformer16.transform2(doubleArray21);
        org.apache.commons.math.complex.Complex[] complexArray25 = org.apache.commons.math.transform.FastFourierTransformer.scaleArray(complexArray23, (double) 'a');
        org.apache.commons.math.transform.FastFourierTransformer.verifyDataSet((java.lang.Object[]) complexArray23);
        org.apache.commons.math.complex.Complex[] complexArray28 = org.apache.commons.math.transform.FastFourierTransformer.scaleArray(complexArray23, (double) 1L);
        org.apache.commons.math.complex.Complex[] complexArray29 = fastFourierTransformer8.transform2(complexArray28);
        double[] doubleArray34 = new double[] { (-1L), 'a', 1L, 10 };
        org.apache.commons.math.transform.FastFourierTransformer.verifyDataSet(doubleArray34);
        double[] doubleArray37 = org.apache.commons.math.transform.FastFourierTransformer.scaleArray(doubleArray34, (double) 10.0f);
        org.apache.commons.math.complex.Complex[] complexArray38 = fastFourierTransformer8.transform(doubleArray34);
        org.apache.commons.math.complex.Complex[] complexArray39 = fastFourierTransformer0.transform(complexArray38);
        org.apache.commons.math.analysis.UnivariateRealFunction univariateRealFunction40 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math.complex.Complex[] complexArray44 = fastFourierTransformer0.transform(univariateRealFunction40, (double) 100, (double) '#', 0);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Number of samples not positive.");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(doubleArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray5), "[-1.0, 97.0, 1.0, 10.0]");
        org.junit.Assert.assertNotNull(complexArray7);
        org.junit.Assert.assertNotNull(doubleArray13);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray13), "[-1.0, 97.0, 1.0, 10.0]");
        org.junit.Assert.assertNotNull(complexArray15);
        org.junit.Assert.assertNotNull(doubleArray21);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray21), "[-1.0, 97.0, 1.0, 10.0]");
        org.junit.Assert.assertNotNull(complexArray23);
        org.junit.Assert.assertNotNull(complexArray25);
        org.junit.Assert.assertNotNull(complexArray28);
        org.junit.Assert.assertNotNull(complexArray29);
        org.junit.Assert.assertNotNull(doubleArray34);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray34), "[-10.0, 970.0, 10.0, 100.0]");
        org.junit.Assert.assertNotNull(doubleArray37);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray37), "[-10.0, 970.0, 10.0, 100.0]");
        org.junit.Assert.assertNotNull(complexArray38);
        org.junit.Assert.assertNotNull(complexArray39);
    }

    @Test
    public void test3005() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3005");
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
        double[] doubleArray27 = new double[] { (-1L), 'a', 1L, 10 };
        org.apache.commons.math.transform.FastFourierTransformer.verifyDataSet(doubleArray27);
        double[] doubleArray30 = org.apache.commons.math.transform.FastFourierTransformer.scaleArray(doubleArray27, (double) 10.0f);
        org.apache.commons.math.transform.FastFourierTransformer.verifyDataSet(doubleArray30);
        org.apache.commons.math.complex.Complex[] complexArray32 = fastFourierTransformer22.transform(doubleArray30);
        org.apache.commons.math.complex.Complex[] complexArray33 = fastFourierTransformer0.transform(doubleArray30);
        double[] doubleArray38 = new double[] { (-1L), 'a', 1L, 10 };
        org.apache.commons.math.transform.FastFourierTransformer.verifyDataSet(doubleArray38);
        double[] doubleArray41 = org.apache.commons.math.transform.FastFourierTransformer.scaleArray(doubleArray38, (double) 10.0f);
        double[] doubleArray43 = org.apache.commons.math.transform.FastFourierTransformer.scaleArray(doubleArray41, (double) 10L);
        org.apache.commons.math.complex.Complex[] complexArray44 = fastFourierTransformer0.inversetransform(doubleArray43);
        double[] doubleArray49 = new double[] { (-1L), 'a', 1L, 10 };
        org.apache.commons.math.transform.FastFourierTransformer.verifyDataSet(doubleArray49);
        double[] doubleArray52 = org.apache.commons.math.transform.FastFourierTransformer.scaleArray(doubleArray49, (double) 10.0f);
        double[] doubleArray54 = org.apache.commons.math.transform.FastFourierTransformer.scaleArray(doubleArray49, (double) (short) 100);
        org.apache.commons.math.complex.Complex[] complexArray55 = fastFourierTransformer0.inversetransform(doubleArray49);
        org.apache.commons.math.transform.FastFourierTransformer fastFourierTransformer56 = new org.apache.commons.math.transform.FastFourierTransformer();
        double[] doubleArray61 = new double[] { (-1L), 'a', 1L, 10 };
        org.apache.commons.math.transform.FastFourierTransformer.verifyDataSet(doubleArray61);
        org.apache.commons.math.complex.Complex[] complexArray63 = fastFourierTransformer56.transform2(doubleArray61);
        org.apache.commons.math.complex.Complex[] complexArray65 = org.apache.commons.math.transform.FastFourierTransformer.scaleArray(complexArray63, (double) 100L);
        org.apache.commons.math.complex.Complex[] complexArray67 = org.apache.commons.math.transform.FastFourierTransformer.scaleArray(complexArray65, (double) (byte) 100);
        org.apache.commons.math.complex.Complex[] complexArray69 = org.apache.commons.math.transform.FastFourierTransformer.scaleArray(complexArray67, (double) 1.0f);
        org.apache.commons.math.complex.Complex[] complexArray70 = fastFourierTransformer0.transform(complexArray67);
        org.apache.commons.math.complex.Complex[] complexArray72 = org.apache.commons.math.transform.FastFourierTransformer.scaleArray(complexArray67, (double) (short) 0);
        org.junit.Assert.assertNotNull(doubleArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray5), "[-1.0, 97.0, 1.0, 10.0]");
        org.junit.Assert.assertNotNull(complexArray7);
        org.junit.Assert.assertNotNull(doubleArray13);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray13), "[-1.0, 97.0, 1.0, 10.0]");
        org.junit.Assert.assertNotNull(complexArray15);
        org.junit.Assert.assertNotNull(complexArray17);
        org.junit.Assert.assertNotNull(complexArray20);
        org.junit.Assert.assertNotNull(complexArray21);
        org.junit.Assert.assertNotNull(doubleArray27);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray27), "[-10.0, 970.0, 10.0, 100.0]");
        org.junit.Assert.assertNotNull(doubleArray30);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray30), "[-10.0, 970.0, 10.0, 100.0]");
        org.junit.Assert.assertNotNull(complexArray32);
        org.junit.Assert.assertNotNull(complexArray33);
        org.junit.Assert.assertNotNull(doubleArray38);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray38), "[-100.0, 9700.0, 100.0, 1000.0]");
        org.junit.Assert.assertNotNull(doubleArray41);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray41), "[-100.0, 9700.0, 100.0, 1000.0]");
        org.junit.Assert.assertNotNull(doubleArray43);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray43), "[-100.0, 9700.0, 100.0, 1000.0]");
        org.junit.Assert.assertNotNull(complexArray44);
        org.junit.Assert.assertNotNull(doubleArray49);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray49), "[-1000.0, 97000.0, 1000.0, 10000.0]");
        org.junit.Assert.assertNotNull(doubleArray52);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray52), "[-1000.0, 97000.0, 1000.0, 10000.0]");
        org.junit.Assert.assertNotNull(doubleArray54);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray54), "[-1000.0, 97000.0, 1000.0, 10000.0]");
        org.junit.Assert.assertNotNull(complexArray55);
        org.junit.Assert.assertNotNull(doubleArray61);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray61), "[-1.0, 97.0, 1.0, 10.0]");
        org.junit.Assert.assertNotNull(complexArray63);
        org.junit.Assert.assertNotNull(complexArray65);
        org.junit.Assert.assertNotNull(complexArray67);
        org.junit.Assert.assertNotNull(complexArray69);
        org.junit.Assert.assertNotNull(complexArray70);
        org.junit.Assert.assertNotNull(complexArray72);
    }

    @Test
    public void test3006() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3006");
        org.apache.commons.math.transform.FastFourierTransformer fastFourierTransformer0 = new org.apache.commons.math.transform.FastFourierTransformer();
        double[] doubleArray5 = new double[] { (-1L), 'a', 1L, 10 };
        org.apache.commons.math.transform.FastFourierTransformer.verifyDataSet(doubleArray5);
        double[] doubleArray8 = org.apache.commons.math.transform.FastFourierTransformer.scaleArray(doubleArray5, (double) 10.0f);
        org.apache.commons.math.transform.FastFourierTransformer.verifyDataSet(doubleArray8);
        org.apache.commons.math.complex.Complex[] complexArray10 = fastFourierTransformer0.transform(doubleArray8);
        org.apache.commons.math.transform.FastFourierTransformer fastFourierTransformer11 = new org.apache.commons.math.transform.FastFourierTransformer();
        double[] doubleArray16 = new double[] { (-1L), 'a', 1L, 10 };
        org.apache.commons.math.transform.FastFourierTransformer.verifyDataSet(doubleArray16);
        org.apache.commons.math.complex.Complex[] complexArray18 = fastFourierTransformer11.transform2(doubleArray16);
        org.apache.commons.math.complex.Complex[] complexArray19 = fastFourierTransformer0.inversetransform2(complexArray18);
        org.apache.commons.math.transform.FastFourierTransformer fastFourierTransformer20 = new org.apache.commons.math.transform.FastFourierTransformer();
        org.apache.commons.math.transform.FastFourierTransformer fastFourierTransformer21 = new org.apache.commons.math.transform.FastFourierTransformer();
        double[] doubleArray26 = new double[] { (-1L), 'a', 1L, 10 };
        org.apache.commons.math.transform.FastFourierTransformer.verifyDataSet(doubleArray26);
        org.apache.commons.math.complex.Complex[] complexArray28 = fastFourierTransformer21.transform2(doubleArray26);
        org.apache.commons.math.complex.Complex[] complexArray30 = org.apache.commons.math.transform.FastFourierTransformer.scaleArray(complexArray28, (double) 'a');
        org.apache.commons.math.transform.FastFourierTransformer.verifyDataSet((java.lang.Object[]) complexArray28);
        org.apache.commons.math.complex.Complex[] complexArray32 = fastFourierTransformer20.inversetransform(complexArray28);
        double[] doubleArray37 = new double[] { (-1L), 'a', 1L, 10 };
        org.apache.commons.math.transform.FastFourierTransformer.verifyDataSet(doubleArray37);
        double[] doubleArray40 = org.apache.commons.math.transform.FastFourierTransformer.scaleArray(doubleArray37, (double) 10.0f);
        double[] doubleArray42 = org.apache.commons.math.transform.FastFourierTransformer.scaleArray(doubleArray40, (double) 10L);
        org.apache.commons.math.complex.Complex[] complexArray43 = fastFourierTransformer20.transform(doubleArray40);
        org.apache.commons.math.complex.Complex[] complexArray45 = org.apache.commons.math.transform.FastFourierTransformer.scaleArray(complexArray43, (-1.0d));
        org.apache.commons.math.complex.Complex[] complexArray46 = fastFourierTransformer0.transform2(complexArray43);
        double[] doubleArray51 = new double[] { (-1L), 'a', 1L, 10 };
        org.apache.commons.math.transform.FastFourierTransformer.verifyDataSet(doubleArray51);
        double[] doubleArray54 = org.apache.commons.math.transform.FastFourierTransformer.scaleArray(doubleArray51, (double) 10.0f);
        double[] doubleArray56 = org.apache.commons.math.transform.FastFourierTransformer.scaleArray(doubleArray51, (double) (short) 100);
        org.apache.commons.math.complex.Complex[] complexArray57 = fastFourierTransformer0.inversetransform2(doubleArray51);
        org.apache.commons.math.transform.FastFourierTransformer fastFourierTransformer58 = new org.apache.commons.math.transform.FastFourierTransformer();
        double[] doubleArray63 = new double[] { (-1L), 'a', 1L, 10 };
        org.apache.commons.math.transform.FastFourierTransformer.verifyDataSet(doubleArray63);
        org.apache.commons.math.complex.Complex[] complexArray65 = fastFourierTransformer58.transform2(doubleArray63);
        double[] doubleArray67 = org.apache.commons.math.transform.FastFourierTransformer.scaleArray(doubleArray63, 100.0d);
        org.apache.commons.math.complex.Complex[] complexArray68 = fastFourierTransformer0.transform2(doubleArray67);
        double[] doubleArray70 = org.apache.commons.math.transform.FastFourierTransformer.scaleArray(doubleArray67, 10.0d);
        org.apache.commons.math.transform.FastFourierTransformer.verifyDataSet(doubleArray70);
        org.junit.Assert.assertNotNull(doubleArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray5), "[-10.0, 970.0, 10.0, 100.0]");
        org.junit.Assert.assertNotNull(doubleArray8);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray8), "[-10.0, 970.0, 10.0, 100.0]");
        org.junit.Assert.assertNotNull(complexArray10);
        org.junit.Assert.assertNotNull(doubleArray16);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray16), "[-1.0, 97.0, 1.0, 10.0]");
        org.junit.Assert.assertNotNull(complexArray18);
        org.junit.Assert.assertNotNull(complexArray19);
        org.junit.Assert.assertNotNull(doubleArray26);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray26), "[-1.0, 97.0, 1.0, 10.0]");
        org.junit.Assert.assertNotNull(complexArray28);
        org.junit.Assert.assertNotNull(complexArray30);
        org.junit.Assert.assertNotNull(complexArray32);
        org.junit.Assert.assertNotNull(doubleArray37);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray37), "[-100.0, 9700.0, 100.0, 1000.0]");
        org.junit.Assert.assertNotNull(doubleArray40);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray40), "[-100.0, 9700.0, 100.0, 1000.0]");
        org.junit.Assert.assertNotNull(doubleArray42);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray42), "[-100.0, 9700.0, 100.0, 1000.0]");
        org.junit.Assert.assertNotNull(complexArray43);
        org.junit.Assert.assertNotNull(complexArray45);
        org.junit.Assert.assertNotNull(complexArray46);
        org.junit.Assert.assertNotNull(doubleArray51);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray51), "[-1000.0, 97000.0, 1000.0, 10000.0]");
        org.junit.Assert.assertNotNull(doubleArray54);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray54), "[-1000.0, 97000.0, 1000.0, 10000.0]");
        org.junit.Assert.assertNotNull(doubleArray56);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray56), "[-1000.0, 97000.0, 1000.0, 10000.0]");
        org.junit.Assert.assertNotNull(complexArray57);
        org.junit.Assert.assertNotNull(doubleArray63);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray63), "[-1000.0, 97000.0, 1000.0, 10000.0]");
        org.junit.Assert.assertNotNull(complexArray65);
        org.junit.Assert.assertNotNull(doubleArray67);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray67), "[-1000.0, 97000.0, 1000.0, 10000.0]");
        org.junit.Assert.assertNotNull(complexArray68);
        org.junit.Assert.assertNotNull(doubleArray70);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray70), "[-1000.0, 97000.0, 1000.0, 10000.0]");
    }

    @Test
    public void test3007() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3007");
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
        double[] doubleArray53 = org.apache.commons.math.transform.FastFourierTransformer.scaleArray(doubleArray49, 100.0d);
        org.apache.commons.math.complex.Complex[] complexArray54 = fastFourierTransformer31.inversetransform(doubleArray49);
        org.apache.commons.math.complex.Complex[] complexArray55 = fastFourierTransformer0.transform2(complexArray54);
        org.apache.commons.math.analysis.UnivariateRealFunction univariateRealFunction56 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math.complex.Complex[] complexArray60 = fastFourierTransformer0.transform(univariateRealFunction56, (double) (byte) 10, (double) (-1.0f), (int) '4');
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Endpoints do not specify an interval: [10.0, -1.0]");
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
        org.junit.Assert.assertNotNull(doubleArray37);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray37), "[-1.0, 97.0, 1.0, 10.0]");
        org.junit.Assert.assertNotNull(complexArray39);
        org.junit.Assert.assertNotNull(complexArray41);
        org.junit.Assert.assertNotNull(complexArray43);
        org.junit.Assert.assertNotNull(doubleArray49);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray49), "[-100.0, 9700.0, 100.0, 1000.0]");
        org.junit.Assert.assertNotNull(complexArray51);
        org.junit.Assert.assertNotNull(doubleArray53);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray53), "[-100.0, 9700.0, 100.0, 1000.0]");
        org.junit.Assert.assertNotNull(complexArray54);
        org.junit.Assert.assertNotNull(complexArray55);
    }

    @Test
    public void test3008() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3008");
        org.apache.commons.math.transform.FastFourierTransformer fastFourierTransformer0 = new org.apache.commons.math.transform.FastFourierTransformer();
        double[] doubleArray5 = new double[] { (-1L), 'a', 1L, 10 };
        org.apache.commons.math.transform.FastFourierTransformer.verifyDataSet(doubleArray5);
        double[] doubleArray8 = org.apache.commons.math.transform.FastFourierTransformer.scaleArray(doubleArray5, (double) 10.0f);
        org.apache.commons.math.transform.FastFourierTransformer.verifyDataSet(doubleArray8);
        org.apache.commons.math.complex.Complex[] complexArray10 = fastFourierTransformer0.transform(doubleArray8);
        org.apache.commons.math.transform.FastFourierTransformer fastFourierTransformer11 = new org.apache.commons.math.transform.FastFourierTransformer();
        double[] doubleArray16 = new double[] { (-1L), 'a', 1L, 10 };
        org.apache.commons.math.transform.FastFourierTransformer.verifyDataSet(doubleArray16);
        org.apache.commons.math.complex.Complex[] complexArray18 = fastFourierTransformer11.transform2(doubleArray16);
        org.apache.commons.math.complex.Complex[] complexArray20 = org.apache.commons.math.transform.FastFourierTransformer.scaleArray(complexArray18, (double) 'a');
        org.apache.commons.math.transform.FastFourierTransformer.verifyDataSet((java.lang.Object[]) complexArray18);
        org.apache.commons.math.complex.Complex[] complexArray23 = org.apache.commons.math.transform.FastFourierTransformer.scaleArray(complexArray18, (double) 1L);
        org.apache.commons.math.complex.Complex[] complexArray25 = org.apache.commons.math.transform.FastFourierTransformer.scaleArray(complexArray18, (double) 1);
        org.apache.commons.math.complex.Complex[] complexArray26 = fastFourierTransformer0.inversetransform2(complexArray25);
        double[] doubleArray31 = new double[] { (-1L), 'a', 1L, 10 };
        org.apache.commons.math.transform.FastFourierTransformer.verifyDataSet(doubleArray31);
        double[] doubleArray34 = org.apache.commons.math.transform.FastFourierTransformer.scaleArray(doubleArray31, (double) 10.0f);
        double[] doubleArray36 = org.apache.commons.math.transform.FastFourierTransformer.scaleArray(doubleArray34, (double) 10L);
        org.apache.commons.math.complex.Complex[] complexArray37 = fastFourierTransformer0.transform(doubleArray34);
        org.apache.commons.math.analysis.UnivariateRealFunction univariateRealFunction38 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math.complex.Complex[] complexArray42 = fastFourierTransformer0.transform(univariateRealFunction38, (double) (-1.0f), 100.0d, (int) (byte) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(doubleArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray5), "[-10.0, 970.0, 10.0, 100.0]");
        org.junit.Assert.assertNotNull(doubleArray8);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray8), "[-10.0, 970.0, 10.0, 100.0]");
        org.junit.Assert.assertNotNull(complexArray10);
        org.junit.Assert.assertNotNull(doubleArray16);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray16), "[-1.0, 97.0, 1.0, 10.0]");
        org.junit.Assert.assertNotNull(complexArray18);
        org.junit.Assert.assertNotNull(complexArray20);
        org.junit.Assert.assertNotNull(complexArray23);
        org.junit.Assert.assertNotNull(complexArray25);
        org.junit.Assert.assertNotNull(complexArray26);
        org.junit.Assert.assertNotNull(doubleArray31);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray31), "[-100.0, 9700.0, 100.0, 1000.0]");
        org.junit.Assert.assertNotNull(doubleArray34);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray34), "[-100.0, 9700.0, 100.0, 1000.0]");
        org.junit.Assert.assertNotNull(doubleArray36);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray36), "[-100.0, 9700.0, 100.0, 1000.0]");
        org.junit.Assert.assertNotNull(complexArray37);
    }

    @Test
    public void test3009() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3009");
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
        org.apache.commons.math.transform.FastFourierTransformer fastFourierTransformer56 = new org.apache.commons.math.transform.FastFourierTransformer();
        double[] doubleArray61 = new double[] { (-1L), 'a', 1L, 10 };
        org.apache.commons.math.transform.FastFourierTransformer.verifyDataSet(doubleArray61);
        org.apache.commons.math.complex.Complex[] complexArray63 = fastFourierTransformer56.transform2(doubleArray61);
        org.apache.commons.math.transform.FastFourierTransformer fastFourierTransformer64 = new org.apache.commons.math.transform.FastFourierTransformer();
        double[] doubleArray69 = new double[] { (-1L), 'a', 1L, 10 };
        org.apache.commons.math.transform.FastFourierTransformer.verifyDataSet(doubleArray69);
        org.apache.commons.math.complex.Complex[] complexArray71 = fastFourierTransformer64.transform2(doubleArray69);
        org.apache.commons.math.complex.Complex[] complexArray73 = org.apache.commons.math.transform.FastFourierTransformer.scaleArray(complexArray71, (double) 'a');
        org.apache.commons.math.transform.FastFourierTransformer.verifyDataSet((java.lang.Object[]) complexArray71);
        org.apache.commons.math.complex.Complex[] complexArray76 = org.apache.commons.math.transform.FastFourierTransformer.scaleArray(complexArray71, (double) 1L);
        org.apache.commons.math.complex.Complex[] complexArray77 = fastFourierTransformer56.transform2(complexArray76);
        double[] doubleArray82 = new double[] { (-1L), 'a', 1L, 10 };
        org.apache.commons.math.transform.FastFourierTransformer.verifyDataSet(doubleArray82);
        double[] doubleArray85 = org.apache.commons.math.transform.FastFourierTransformer.scaleArray(doubleArray82, (double) 10.0f);
        org.apache.commons.math.transform.FastFourierTransformer.verifyDataSet(doubleArray85);
        org.apache.commons.math.transform.FastFourierTransformer.verifyDataSet(doubleArray85);
        double[] doubleArray89 = org.apache.commons.math.transform.FastFourierTransformer.scaleArray(doubleArray85, (double) (byte) 10);
        double[] doubleArray91 = org.apache.commons.math.transform.FastFourierTransformer.scaleArray(doubleArray89, (double) (byte) 0);
        org.apache.commons.math.complex.Complex[] complexArray92 = fastFourierTransformer56.transform2(doubleArray89);
        org.apache.commons.math.complex.Complex[] complexArray93 = fastFourierTransformer0.transform(doubleArray89);
        org.apache.commons.math.transform.FastFourierTransformer.verifyDataSet(doubleArray89);
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
        org.junit.Assert.assertNotNull(doubleArray61);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray61), "[-1.0, 97.0, 1.0, 10.0]");
        org.junit.Assert.assertNotNull(complexArray63);
        org.junit.Assert.assertNotNull(doubleArray69);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray69), "[-1.0, 97.0, 1.0, 10.0]");
        org.junit.Assert.assertNotNull(complexArray71);
        org.junit.Assert.assertNotNull(complexArray73);
        org.junit.Assert.assertNotNull(complexArray76);
        org.junit.Assert.assertNotNull(complexArray77);
        org.junit.Assert.assertNotNull(doubleArray82);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray82), "[-0.0, 0.0, 0.0, 0.0]");
        org.junit.Assert.assertNotNull(doubleArray85);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray85), "[-0.0, 0.0, 0.0, 0.0]");
        org.junit.Assert.assertNotNull(doubleArray89);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray89), "[-0.0, 0.0, 0.0, 0.0]");
        org.junit.Assert.assertNotNull(doubleArray91);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray91), "[-0.0, 0.0, 0.0, 0.0]");
        org.junit.Assert.assertNotNull(complexArray92);
        org.junit.Assert.assertNotNull(complexArray93);
    }

    @Test
    public void test3010() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3010");
        org.apache.commons.math.transform.FastFourierTransformer fastFourierTransformer0 = new org.apache.commons.math.transform.FastFourierTransformer();
        org.apache.commons.math.transform.FastFourierTransformer fastFourierTransformer1 = new org.apache.commons.math.transform.FastFourierTransformer();
        double[] doubleArray6 = new double[] { (-1L), 'a', 1L, 10 };
        org.apache.commons.math.transform.FastFourierTransformer.verifyDataSet(doubleArray6);
        org.apache.commons.math.complex.Complex[] complexArray8 = fastFourierTransformer1.transform2(doubleArray6);
        org.apache.commons.math.complex.Complex[] complexArray10 = org.apache.commons.math.transform.FastFourierTransformer.scaleArray(complexArray8, (double) 'a');
        org.apache.commons.math.transform.FastFourierTransformer.verifyDataSet((java.lang.Object[]) complexArray8);
        org.apache.commons.math.complex.Complex[] complexArray12 = fastFourierTransformer0.inversetransform(complexArray8);
        org.apache.commons.math.transform.FastFourierTransformer.verifyDataSet((java.lang.Object[]) complexArray8);
        org.apache.commons.math.complex.Complex[] complexArray15 = org.apache.commons.math.transform.FastFourierTransformer.scaleArray(complexArray8, 0.0d);
        java.lang.Class<?> wildcardClass16 = complexArray8.getClass();
        org.junit.Assert.assertNotNull(doubleArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray6), "[-1.0, 97.0, 1.0, 10.0]");
        org.junit.Assert.assertNotNull(complexArray8);
        org.junit.Assert.assertNotNull(complexArray10);
        org.junit.Assert.assertNotNull(complexArray12);
        org.junit.Assert.assertNotNull(complexArray15);
        org.junit.Assert.assertNotNull(wildcardClass16);
    }

    @Test
    public void test3011() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3011");
        double[] doubleArray4 = new double[] { (-1L), 'a', 1L, 10 };
        org.apache.commons.math.transform.FastFourierTransformer.verifyDataSet(doubleArray4);
        double[] doubleArray7 = org.apache.commons.math.transform.FastFourierTransformer.scaleArray(doubleArray4, (double) 10.0f);
        org.apache.commons.math.transform.FastFourierTransformer.verifyDataSet(doubleArray7);
        org.apache.commons.math.transform.FastFourierTransformer.verifyDataSet(doubleArray7);
        org.apache.commons.math.transform.FastFourierTransformer.verifyDataSet(doubleArray7);
        double[] doubleArray12 = org.apache.commons.math.transform.FastFourierTransformer.scaleArray(doubleArray7, (double) (-1L));
        org.apache.commons.math.transform.FastFourierTransformer.verifyDataSet(doubleArray12);
        double[] doubleArray15 = org.apache.commons.math.transform.FastFourierTransformer.scaleArray(doubleArray12, (double) 1.0f);
        org.junit.Assert.assertNotNull(doubleArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray4), "[10.0, -970.0, -10.0, -100.0]");
        org.junit.Assert.assertNotNull(doubleArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray7), "[10.0, -970.0, -10.0, -100.0]");
        org.junit.Assert.assertNotNull(doubleArray12);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray12), "[10.0, -970.0, -10.0, -100.0]");
        org.junit.Assert.assertNotNull(doubleArray15);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray15), "[10.0, -970.0, -10.0, -100.0]");
    }

    @Test
    public void test3012() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3012");
        org.apache.commons.math.transform.FastFourierTransformer fastFourierTransformer0 = new org.apache.commons.math.transform.FastFourierTransformer();
        org.apache.commons.math.transform.FastFourierTransformer fastFourierTransformer1 = new org.apache.commons.math.transform.FastFourierTransformer();
        double[] doubleArray6 = new double[] { (-1L), 'a', 1L, 10 };
        org.apache.commons.math.transform.FastFourierTransformer.verifyDataSet(doubleArray6);
        org.apache.commons.math.complex.Complex[] complexArray8 = fastFourierTransformer1.transform2(doubleArray6);
        org.apache.commons.math.complex.Complex[] complexArray10 = org.apache.commons.math.transform.FastFourierTransformer.scaleArray(complexArray8, (double) 'a');
        org.apache.commons.math.transform.FastFourierTransformer.verifyDataSet((java.lang.Object[]) complexArray8);
        org.apache.commons.math.complex.Complex[] complexArray12 = fastFourierTransformer0.inversetransform(complexArray8);
        org.apache.commons.math.transform.FastFourierTransformer fastFourierTransformer13 = new org.apache.commons.math.transform.FastFourierTransformer();
        double[] doubleArray18 = new double[] { (-1L), 'a', 1L, 10 };
        org.apache.commons.math.transform.FastFourierTransformer.verifyDataSet(doubleArray18);
        org.apache.commons.math.complex.Complex[] complexArray20 = fastFourierTransformer13.transform2(doubleArray18);
        org.apache.commons.math.transform.FastFourierTransformer fastFourierTransformer21 = new org.apache.commons.math.transform.FastFourierTransformer();
        double[] doubleArray26 = new double[] { (-1L), 'a', 1L, 10 };
        org.apache.commons.math.transform.FastFourierTransformer.verifyDataSet(doubleArray26);
        org.apache.commons.math.complex.Complex[] complexArray28 = fastFourierTransformer21.transform2(doubleArray26);
        org.apache.commons.math.complex.Complex[] complexArray30 = org.apache.commons.math.transform.FastFourierTransformer.scaleArray(complexArray28, (double) 'a');
        org.apache.commons.math.transform.FastFourierTransformer.verifyDataSet((java.lang.Object[]) complexArray28);
        org.apache.commons.math.complex.Complex[] complexArray33 = org.apache.commons.math.transform.FastFourierTransformer.scaleArray(complexArray28, (double) 1L);
        org.apache.commons.math.complex.Complex[] complexArray34 = fastFourierTransformer13.transform2(complexArray33);
        double[] doubleArray39 = new double[] { (-1L), 'a', 1L, 10 };
        org.apache.commons.math.transform.FastFourierTransformer.verifyDataSet(doubleArray39);
        double[] doubleArray42 = org.apache.commons.math.transform.FastFourierTransformer.scaleArray(doubleArray39, (double) 10.0f);
        org.apache.commons.math.complex.Complex[] complexArray43 = fastFourierTransformer13.transform(doubleArray39);
        org.apache.commons.math.transform.FastFourierTransformer fastFourierTransformer44 = new org.apache.commons.math.transform.FastFourierTransformer();
        org.apache.commons.math.transform.FastFourierTransformer fastFourierTransformer45 = new org.apache.commons.math.transform.FastFourierTransformer();
        double[] doubleArray50 = new double[] { (-1L), 'a', 1L, 10 };
        org.apache.commons.math.transform.FastFourierTransformer.verifyDataSet(doubleArray50);
        org.apache.commons.math.complex.Complex[] complexArray52 = fastFourierTransformer45.transform2(doubleArray50);
        org.apache.commons.math.complex.Complex[] complexArray54 = org.apache.commons.math.transform.FastFourierTransformer.scaleArray(complexArray52, (double) 'a');
        org.apache.commons.math.transform.FastFourierTransformer.verifyDataSet((java.lang.Object[]) complexArray52);
        org.apache.commons.math.complex.Complex[] complexArray56 = fastFourierTransformer44.inversetransform(complexArray52);
        org.apache.commons.math.transform.FastFourierTransformer fastFourierTransformer57 = new org.apache.commons.math.transform.FastFourierTransformer();
        double[] doubleArray62 = new double[] { (-1L), 'a', 1L, 10 };
        org.apache.commons.math.transform.FastFourierTransformer.verifyDataSet(doubleArray62);
        org.apache.commons.math.complex.Complex[] complexArray64 = fastFourierTransformer57.transform2(doubleArray62);
        org.apache.commons.math.complex.Complex[] complexArray66 = org.apache.commons.math.transform.FastFourierTransformer.scaleArray(complexArray64, (double) 'a');
        org.apache.commons.math.transform.FastFourierTransformer.verifyDataSet((java.lang.Object[]) complexArray64);
        org.apache.commons.math.complex.Complex[] complexArray69 = org.apache.commons.math.transform.FastFourierTransformer.scaleArray(complexArray64, (double) 1L);
        org.apache.commons.math.complex.Complex[] complexArray71 = org.apache.commons.math.transform.FastFourierTransformer.scaleArray(complexArray64, (double) 1);
        org.apache.commons.math.complex.Complex[] complexArray72 = fastFourierTransformer44.transform(complexArray64);
        org.apache.commons.math.complex.Complex[] complexArray73 = fastFourierTransformer13.inversetransform2(complexArray72);
        org.apache.commons.math.complex.Complex[] complexArray74 = fastFourierTransformer0.inversetransform(complexArray73);
        org.apache.commons.math.transform.FastFourierTransformer fastFourierTransformer75 = new org.apache.commons.math.transform.FastFourierTransformer();
        double[] doubleArray80 = new double[] { (-1L), 'a', 1L, 10 };
        org.apache.commons.math.transform.FastFourierTransformer.verifyDataSet(doubleArray80);
        org.apache.commons.math.complex.Complex[] complexArray82 = fastFourierTransformer75.transform2(doubleArray80);
        org.apache.commons.math.complex.Complex[] complexArray84 = org.apache.commons.math.transform.FastFourierTransformer.scaleArray(complexArray82, (double) 'a');
        org.apache.commons.math.transform.FastFourierTransformer.verifyDataSet((java.lang.Object[]) complexArray82);
        org.apache.commons.math.complex.Complex[] complexArray87 = org.apache.commons.math.transform.FastFourierTransformer.scaleArray(complexArray82, (double) 1L);
        org.apache.commons.math.complex.Complex[] complexArray89 = org.apache.commons.math.transform.FastFourierTransformer.scaleArray(complexArray82, (double) '#');
        org.apache.commons.math.complex.Complex[] complexArray91 = org.apache.commons.math.transform.FastFourierTransformer.scaleArray(complexArray89, (double) (short) -1);
        org.apache.commons.math.complex.Complex[] complexArray92 = fastFourierTransformer0.inversetransform(complexArray89);
        org.apache.commons.math.analysis.UnivariateRealFunction univariateRealFunction93 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math.complex.Complex[] complexArray97 = fastFourierTransformer0.inversetransform2(univariateRealFunction93, (double) (byte) 1, (double) (-1L), (int) ' ');
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Endpoints do not specify an interval: [1.0, -1.0]");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(doubleArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray6), "[-1.0, 97.0, 1.0, 10.0]");
        org.junit.Assert.assertNotNull(complexArray8);
        org.junit.Assert.assertNotNull(complexArray10);
        org.junit.Assert.assertNotNull(complexArray12);
        org.junit.Assert.assertNotNull(doubleArray18);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray18), "[-1.0, 97.0, 1.0, 10.0]");
        org.junit.Assert.assertNotNull(complexArray20);
        org.junit.Assert.assertNotNull(doubleArray26);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray26), "[-1.0, 97.0, 1.0, 10.0]");
        org.junit.Assert.assertNotNull(complexArray28);
        org.junit.Assert.assertNotNull(complexArray30);
        org.junit.Assert.assertNotNull(complexArray33);
        org.junit.Assert.assertNotNull(complexArray34);
        org.junit.Assert.assertNotNull(doubleArray39);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray39), "[-10.0, 970.0, 10.0, 100.0]");
        org.junit.Assert.assertNotNull(doubleArray42);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray42), "[-10.0, 970.0, 10.0, 100.0]");
        org.junit.Assert.assertNotNull(complexArray43);
        org.junit.Assert.assertNotNull(doubleArray50);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray50), "[-1.0, 97.0, 1.0, 10.0]");
        org.junit.Assert.assertNotNull(complexArray52);
        org.junit.Assert.assertNotNull(complexArray54);
        org.junit.Assert.assertNotNull(complexArray56);
        org.junit.Assert.assertNotNull(doubleArray62);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray62), "[-1.0, 97.0, 1.0, 10.0]");
        org.junit.Assert.assertNotNull(complexArray64);
        org.junit.Assert.assertNotNull(complexArray66);
        org.junit.Assert.assertNotNull(complexArray69);
        org.junit.Assert.assertNotNull(complexArray71);
        org.junit.Assert.assertNotNull(complexArray72);
        org.junit.Assert.assertNotNull(complexArray73);
        org.junit.Assert.assertNotNull(complexArray74);
        org.junit.Assert.assertNotNull(doubleArray80);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray80), "[-1.0, 97.0, 1.0, 10.0]");
        org.junit.Assert.assertNotNull(complexArray82);
        org.junit.Assert.assertNotNull(complexArray84);
        org.junit.Assert.assertNotNull(complexArray87);
        org.junit.Assert.assertNotNull(complexArray89);
        org.junit.Assert.assertNotNull(complexArray91);
        org.junit.Assert.assertNotNull(complexArray92);
    }

    @Test
    public void test3013() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3013");
        org.apache.commons.math.transform.FastFourierTransformer.verifyInterval((-1.0d), (double) 0.0f);
    }

    @Test
    public void test3014() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3014");
        org.apache.commons.math.analysis.UnivariateRealFunction univariateRealFunction0 = null;
        // The following exception was thrown during execution in test generation
        try {
            double[] doubleArray4 = org.apache.commons.math.transform.FastFourierTransformer.sample(univariateRealFunction0, (double) 100.0f, 0.0d, (int) (byte) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Endpoints do not specify an interval: [100.0, 0.0]");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void test3015() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3015");
        org.apache.commons.math.analysis.UnivariateRealFunction univariateRealFunction0 = null;
        // The following exception was thrown during execution in test generation
        try {
            double[] doubleArray4 = org.apache.commons.math.transform.FastFourierTransformer.sample(univariateRealFunction0, (double) 1L, (double) (-1.0f), (int) (short) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Number of samples not positive.");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void test3016() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3016");
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math.transform.FastFourierTransformer.verifyInterval((double) 1L, (double) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Endpoints do not specify an interval: [1.0, 0.0]");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void test3017() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3017");
        org.apache.commons.math.analysis.UnivariateRealFunction univariateRealFunction0 = null;
        // The following exception was thrown during execution in test generation
        try {
            double[] doubleArray4 = org.apache.commons.math.transform.FastFourierTransformer.sample(univariateRealFunction0, (double) ' ', (double) (-1.0f), (int) (short) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Number of samples not positive.");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void test3018() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3018");
        org.apache.commons.math.transform.FastFourierTransformer fastFourierTransformer0 = new org.apache.commons.math.transform.FastFourierTransformer();
        org.apache.commons.math.transform.FastFourierTransformer fastFourierTransformer1 = new org.apache.commons.math.transform.FastFourierTransformer();
        double[] doubleArray6 = new double[] { (-1L), 'a', 1L, 10 };
        org.apache.commons.math.transform.FastFourierTransformer.verifyDataSet(doubleArray6);
        org.apache.commons.math.complex.Complex[] complexArray8 = fastFourierTransformer1.transform2(doubleArray6);
        org.apache.commons.math.complex.Complex[] complexArray10 = org.apache.commons.math.transform.FastFourierTransformer.scaleArray(complexArray8, (double) 'a');
        org.apache.commons.math.transform.FastFourierTransformer.verifyDataSet((java.lang.Object[]) complexArray8);
        org.apache.commons.math.complex.Complex[] complexArray12 = fastFourierTransformer0.inversetransform(complexArray8);
        double[] doubleArray17 = new double[] { (-1L), 'a', 1L, 10 };
        org.apache.commons.math.transform.FastFourierTransformer.verifyDataSet(doubleArray17);
        double[] doubleArray20 = org.apache.commons.math.transform.FastFourierTransformer.scaleArray(doubleArray17, (double) 10.0f);
        double[] doubleArray22 = org.apache.commons.math.transform.FastFourierTransformer.scaleArray(doubleArray20, (double) 10L);
        org.apache.commons.math.complex.Complex[] complexArray23 = fastFourierTransformer0.transform(doubleArray20);
        double[] doubleArray28 = new double[] { (-1L), 'a', 1L, 10 };
        org.apache.commons.math.transform.FastFourierTransformer.verifyDataSet(doubleArray28);
        double[] doubleArray31 = org.apache.commons.math.transform.FastFourierTransformer.scaleArray(doubleArray28, (double) 10.0f);
        org.apache.commons.math.transform.FastFourierTransformer.verifyDataSet(doubleArray31);
        double[] doubleArray34 = org.apache.commons.math.transform.FastFourierTransformer.scaleArray(doubleArray31, 10.0d);
        org.apache.commons.math.complex.Complex[] complexArray35 = fastFourierTransformer0.transform2(doubleArray31);
        org.apache.commons.math.transform.FastFourierTransformer fastFourierTransformer36 = new org.apache.commons.math.transform.FastFourierTransformer();
        double[] doubleArray41 = new double[] { (-1L), 'a', 1L, 10 };
        org.apache.commons.math.transform.FastFourierTransformer.verifyDataSet(doubleArray41);
        org.apache.commons.math.complex.Complex[] complexArray43 = fastFourierTransformer36.transform2(doubleArray41);
        org.apache.commons.math.complex.Complex[] complexArray45 = org.apache.commons.math.transform.FastFourierTransformer.scaleArray(complexArray43, (double) 'a');
        org.apache.commons.math.transform.FastFourierTransformer.verifyDataSet((java.lang.Object[]) complexArray43);
        org.apache.commons.math.complex.Complex[] complexArray48 = org.apache.commons.math.transform.FastFourierTransformer.scaleArray(complexArray43, (double) 1L);
        org.apache.commons.math.complex.Complex[] complexArray49 = fastFourierTransformer0.transform2(complexArray43);
        org.apache.commons.math.transform.FastFourierTransformer fastFourierTransformer50 = new org.apache.commons.math.transform.FastFourierTransformer();
        double[] doubleArray55 = new double[] { (-1L), 'a', 1L, 10 };
        org.apache.commons.math.transform.FastFourierTransformer.verifyDataSet(doubleArray55);
        org.apache.commons.math.complex.Complex[] complexArray57 = fastFourierTransformer50.transform2(doubleArray55);
        org.apache.commons.math.transform.FastFourierTransformer fastFourierTransformer58 = new org.apache.commons.math.transform.FastFourierTransformer();
        double[] doubleArray63 = new double[] { (-1L), 'a', 1L, 10 };
        org.apache.commons.math.transform.FastFourierTransformer.verifyDataSet(doubleArray63);
        org.apache.commons.math.complex.Complex[] complexArray65 = fastFourierTransformer58.transform2(doubleArray63);
        org.apache.commons.math.complex.Complex[] complexArray67 = org.apache.commons.math.transform.FastFourierTransformer.scaleArray(complexArray65, (double) 'a');
        org.apache.commons.math.transform.FastFourierTransformer.verifyDataSet((java.lang.Object[]) complexArray65);
        org.apache.commons.math.complex.Complex[] complexArray70 = org.apache.commons.math.transform.FastFourierTransformer.scaleArray(complexArray65, (double) 1L);
        org.apache.commons.math.complex.Complex[] complexArray71 = fastFourierTransformer50.transform2(complexArray70);
        org.apache.commons.math.complex.Complex[] complexArray73 = org.apache.commons.math.transform.FastFourierTransformer.scaleArray(complexArray70, (double) (byte) 1);
        org.apache.commons.math.complex.Complex[] complexArray74 = fastFourierTransformer0.inversetransform(complexArray73);
        org.apache.commons.math.analysis.UnivariateRealFunction univariateRealFunction75 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math.complex.Complex[] complexArray79 = fastFourierTransformer0.inversetransform2(univariateRealFunction75, (double) (byte) -1, 1.0d, 10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(doubleArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray6), "[-1.0, 97.0, 1.0, 10.0]");
        org.junit.Assert.assertNotNull(complexArray8);
        org.junit.Assert.assertNotNull(complexArray10);
        org.junit.Assert.assertNotNull(complexArray12);
        org.junit.Assert.assertNotNull(doubleArray17);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray17), "[-100.0, 9700.0, 100.0, 1000.0]");
        org.junit.Assert.assertNotNull(doubleArray20);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray20), "[-100.0, 9700.0, 100.0, 1000.0]");
        org.junit.Assert.assertNotNull(doubleArray22);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray22), "[-100.0, 9700.0, 100.0, 1000.0]");
        org.junit.Assert.assertNotNull(complexArray23);
        org.junit.Assert.assertNotNull(doubleArray28);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray28), "[-100.0, 9700.0, 100.0, 1000.0]");
        org.junit.Assert.assertNotNull(doubleArray31);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray31), "[-100.0, 9700.0, 100.0, 1000.0]");
        org.junit.Assert.assertNotNull(doubleArray34);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray34), "[-100.0, 9700.0, 100.0, 1000.0]");
        org.junit.Assert.assertNotNull(complexArray35);
        org.junit.Assert.assertNotNull(doubleArray41);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray41), "[-1.0, 97.0, 1.0, 10.0]");
        org.junit.Assert.assertNotNull(complexArray43);
        org.junit.Assert.assertNotNull(complexArray45);
        org.junit.Assert.assertNotNull(complexArray48);
        org.junit.Assert.assertNotNull(complexArray49);
        org.junit.Assert.assertNotNull(doubleArray55);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray55), "[-1.0, 97.0, 1.0, 10.0]");
        org.junit.Assert.assertNotNull(complexArray57);
        org.junit.Assert.assertNotNull(doubleArray63);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray63), "[-1.0, 97.0, 1.0, 10.0]");
        org.junit.Assert.assertNotNull(complexArray65);
        org.junit.Assert.assertNotNull(complexArray67);
        org.junit.Assert.assertNotNull(complexArray70);
        org.junit.Assert.assertNotNull(complexArray71);
        org.junit.Assert.assertNotNull(complexArray73);
        org.junit.Assert.assertNotNull(complexArray74);
    }

    @Test
    public void test3019() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3019");
        org.apache.commons.math.transform.FastFourierTransformer.verifyInterval((-1.0d), (double) 10.0f);
    }

    @Test
    public void test3020() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3020");
        org.apache.commons.math.transform.FastFourierTransformer.verifyInterval((double) 0.0f, (double) (short) 10);
    }

    @Test
    public void test3021() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3021");
        org.apache.commons.math.transform.FastFourierTransformer fastFourierTransformer0 = new org.apache.commons.math.transform.FastFourierTransformer();
        double[] doubleArray5 = new double[] { (-1L), 'a', 1L, 10 };
        org.apache.commons.math.transform.FastFourierTransformer.verifyDataSet(doubleArray5);
        org.apache.commons.math.complex.Complex[] complexArray7 = fastFourierTransformer0.transform2(doubleArray5);
        org.apache.commons.math.complex.Complex[] complexArray9 = org.apache.commons.math.transform.FastFourierTransformer.scaleArray(complexArray7, (double) 'a');
        org.apache.commons.math.transform.FastFourierTransformer.verifyDataSet((java.lang.Object[]) complexArray7);
        org.apache.commons.math.complex.Complex[] complexArray12 = org.apache.commons.math.transform.FastFourierTransformer.scaleArray(complexArray7, (double) 1L);
        org.apache.commons.math.complex.Complex[] complexArray14 = org.apache.commons.math.transform.FastFourierTransformer.scaleArray(complexArray7, (double) '#');
        org.apache.commons.math.complex.Complex[] complexArray16 = org.apache.commons.math.transform.FastFourierTransformer.scaleArray(complexArray14, (double) (short) -1);
        org.apache.commons.math.complex.Complex[] complexArray18 = org.apache.commons.math.transform.FastFourierTransformer.scaleArray(complexArray14, (double) (byte) -1);
        org.junit.Assert.assertNotNull(doubleArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray5), "[-1.0, 97.0, 1.0, 10.0]");
        org.junit.Assert.assertNotNull(complexArray7);
        org.junit.Assert.assertNotNull(complexArray9);
        org.junit.Assert.assertNotNull(complexArray12);
        org.junit.Assert.assertNotNull(complexArray14);
        org.junit.Assert.assertNotNull(complexArray16);
        org.junit.Assert.assertNotNull(complexArray18);
    }

    @Test
    public void test3022() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3022");
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
        double[] doubleArray48 = new double[] { (-1L), 'a', 1L, 10 };
        org.apache.commons.math.transform.FastFourierTransformer.verifyDataSet(doubleArray48);
        double[] doubleArray51 = org.apache.commons.math.transform.FastFourierTransformer.scaleArray(doubleArray48, (double) 10.0f);
        org.apache.commons.math.transform.FastFourierTransformer.verifyDataSet(doubleArray51);
        org.apache.commons.math.complex.Complex[] complexArray53 = fastFourierTransformer43.transform(doubleArray51);
        org.apache.commons.math.transform.FastFourierTransformer fastFourierTransformer54 = new org.apache.commons.math.transform.FastFourierTransformer();
        double[] doubleArray59 = new double[] { (-1L), 'a', 1L, 10 };
        org.apache.commons.math.transform.FastFourierTransformer.verifyDataSet(doubleArray59);
        org.apache.commons.math.complex.Complex[] complexArray61 = fastFourierTransformer54.transform2(doubleArray59);
        org.apache.commons.math.complex.Complex[] complexArray63 = org.apache.commons.math.transform.FastFourierTransformer.scaleArray(complexArray61, (double) 'a');
        org.apache.commons.math.transform.FastFourierTransformer.verifyDataSet((java.lang.Object[]) complexArray61);
        org.apache.commons.math.complex.Complex[] complexArray66 = org.apache.commons.math.transform.FastFourierTransformer.scaleArray(complexArray61, (double) 1L);
        org.apache.commons.math.complex.Complex[] complexArray68 = org.apache.commons.math.transform.FastFourierTransformer.scaleArray(complexArray61, (double) 1);
        org.apache.commons.math.complex.Complex[] complexArray69 = fastFourierTransformer43.inversetransform2(complexArray68);
        double[] doubleArray74 = new double[] { (-1L), 'a', 1L, 10 };
        org.apache.commons.math.transform.FastFourierTransformer.verifyDataSet(doubleArray74);
        double[] doubleArray77 = org.apache.commons.math.transform.FastFourierTransformer.scaleArray(doubleArray74, (double) 10.0f);
        double[] doubleArray79 = org.apache.commons.math.transform.FastFourierTransformer.scaleArray(doubleArray77, (double) 10L);
        org.apache.commons.math.complex.Complex[] complexArray80 = fastFourierTransformer43.transform(doubleArray77);
        org.apache.commons.math.complex.Complex[] complexArray81 = fastFourierTransformer0.inversetransform2(doubleArray77);
        org.apache.commons.math.analysis.UnivariateRealFunction univariateRealFunction82 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math.complex.Complex[] complexArray86 = fastFourierTransformer0.transform(univariateRealFunction82, (double) 10.0f, (double) 10, 1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Endpoints do not specify an interval: [10.0, 10.0]");
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
        org.junit.Assert.assertNotNull(doubleArray48);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray48), "[-10.0, 970.0, 10.0, 100.0]");
        org.junit.Assert.assertNotNull(doubleArray51);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray51), "[-10.0, 970.0, 10.0, 100.0]");
        org.junit.Assert.assertNotNull(complexArray53);
        org.junit.Assert.assertNotNull(doubleArray59);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray59), "[-1.0, 97.0, 1.0, 10.0]");
        org.junit.Assert.assertNotNull(complexArray61);
        org.junit.Assert.assertNotNull(complexArray63);
        org.junit.Assert.assertNotNull(complexArray66);
        org.junit.Assert.assertNotNull(complexArray68);
        org.junit.Assert.assertNotNull(complexArray69);
        org.junit.Assert.assertNotNull(doubleArray74);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray74), "[-100.0, 9700.0, 100.0, 1000.0]");
        org.junit.Assert.assertNotNull(doubleArray77);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray77), "[-100.0, 9700.0, 100.0, 1000.0]");
        org.junit.Assert.assertNotNull(doubleArray79);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray79), "[-100.0, 9700.0, 100.0, 1000.0]");
        org.junit.Assert.assertNotNull(complexArray80);
        org.junit.Assert.assertNotNull(complexArray81);
    }

    @Test
    public void test3023() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3023");
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
        double[] doubleArray65 = new double[] { (-1L), 'a', 1L, 10 };
        org.apache.commons.math.transform.FastFourierTransformer.verifyDataSet(doubleArray65);
        org.apache.commons.math.complex.Complex[] complexArray67 = fastFourierTransformer0.transform(doubleArray65);
        double[] doubleArray72 = new double[] { (-1L), 'a', 1L, 10 };
        org.apache.commons.math.transform.FastFourierTransformer.verifyDataSet(doubleArray72);
        double[] doubleArray75 = org.apache.commons.math.transform.FastFourierTransformer.scaleArray(doubleArray72, (double) 10.0f);
        org.apache.commons.math.transform.FastFourierTransformer.verifyDataSet(doubleArray75);
        org.apache.commons.math.transform.FastFourierTransformer.verifyDataSet(doubleArray75);
        org.apache.commons.math.transform.FastFourierTransformer.verifyDataSet(doubleArray75);
        org.apache.commons.math.complex.Complex[] complexArray79 = fastFourierTransformer0.transform2(doubleArray75);
        org.apache.commons.math.analysis.UnivariateRealFunction univariateRealFunction80 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math.complex.Complex[] complexArray84 = fastFourierTransformer0.transform2(univariateRealFunction80, 1.0d, (double) 0.0f, 10);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Endpoints do not specify an interval: [1.0, 0.0]");
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
        org.junit.Assert.assertNotNull(doubleArray65);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray65), "[-1.0, 97.0, 1.0, 10.0]");
        org.junit.Assert.assertNotNull(complexArray67);
        org.junit.Assert.assertNotNull(doubleArray72);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray72), "[-10.0, 970.0, 10.0, 100.0]");
        org.junit.Assert.assertNotNull(doubleArray75);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray75), "[-10.0, 970.0, 10.0, 100.0]");
        org.junit.Assert.assertNotNull(complexArray79);
    }

    @Test
    public void test3024() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3024");
        org.apache.commons.math.transform.FastFourierTransformer.verifyInterval(0.0d, (double) 1L);
    }

    @Test
    public void test3025() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3025");
        org.apache.commons.math.transform.FastFourierTransformer fastFourierTransformer0 = new org.apache.commons.math.transform.FastFourierTransformer();
        org.apache.commons.math.transform.FastFourierTransformer fastFourierTransformer1 = new org.apache.commons.math.transform.FastFourierTransformer();
        double[] doubleArray6 = new double[] { (-1L), 'a', 1L, 10 };
        org.apache.commons.math.transform.FastFourierTransformer.verifyDataSet(doubleArray6);
        org.apache.commons.math.complex.Complex[] complexArray8 = fastFourierTransformer1.transform2(doubleArray6);
        org.apache.commons.math.complex.Complex[] complexArray10 = org.apache.commons.math.transform.FastFourierTransformer.scaleArray(complexArray8, (double) 'a');
        org.apache.commons.math.transform.FastFourierTransformer.verifyDataSet((java.lang.Object[]) complexArray8);
        org.apache.commons.math.complex.Complex[] complexArray12 = fastFourierTransformer0.inversetransform(complexArray8);
        double[] doubleArray17 = new double[] { (-1L), 'a', 1L, 10 };
        org.apache.commons.math.transform.FastFourierTransformer.verifyDataSet(doubleArray17);
        double[] doubleArray20 = org.apache.commons.math.transform.FastFourierTransformer.scaleArray(doubleArray17, (double) 10.0f);
        double[] doubleArray22 = org.apache.commons.math.transform.FastFourierTransformer.scaleArray(doubleArray20, (double) 10L);
        org.apache.commons.math.complex.Complex[] complexArray23 = fastFourierTransformer0.transform(doubleArray20);
        double[] doubleArray28 = new double[] { (-1L), 'a', 1L, 10 };
        org.apache.commons.math.transform.FastFourierTransformer.verifyDataSet(doubleArray28);
        double[] doubleArray31 = org.apache.commons.math.transform.FastFourierTransformer.scaleArray(doubleArray28, (double) 10.0f);
        org.apache.commons.math.transform.FastFourierTransformer.verifyDataSet(doubleArray31);
        double[] doubleArray34 = org.apache.commons.math.transform.FastFourierTransformer.scaleArray(doubleArray31, 10.0d);
        org.apache.commons.math.complex.Complex[] complexArray35 = fastFourierTransformer0.transform2(doubleArray31);
        org.apache.commons.math.transform.FastFourierTransformer fastFourierTransformer36 = new org.apache.commons.math.transform.FastFourierTransformer();
        double[] doubleArray41 = new double[] { (-1L), 'a', 1L, 10 };
        org.apache.commons.math.transform.FastFourierTransformer.verifyDataSet(doubleArray41);
        org.apache.commons.math.complex.Complex[] complexArray43 = fastFourierTransformer36.transform2(doubleArray41);
        org.apache.commons.math.complex.Complex[] complexArray45 = org.apache.commons.math.transform.FastFourierTransformer.scaleArray(complexArray43, (double) 'a');
        org.apache.commons.math.transform.FastFourierTransformer.verifyDataSet((java.lang.Object[]) complexArray43);
        org.apache.commons.math.complex.Complex[] complexArray48 = org.apache.commons.math.transform.FastFourierTransformer.scaleArray(complexArray43, (double) 1L);
        org.apache.commons.math.complex.Complex[] complexArray49 = fastFourierTransformer0.transform2(complexArray43);
        org.apache.commons.math.complex.Complex[] complexArray51 = org.apache.commons.math.transform.FastFourierTransformer.scaleArray(complexArray49, (double) (-1L));
        org.apache.commons.math.complex.Complex[] complexArray53 = org.apache.commons.math.transform.FastFourierTransformer.scaleArray(complexArray49, 10.0d);
        org.apache.commons.math.complex.Complex[] complexArray55 = org.apache.commons.math.transform.FastFourierTransformer.scaleArray(complexArray53, (double) (byte) 1);
        org.apache.commons.math.complex.Complex[] complexArray57 = org.apache.commons.math.transform.FastFourierTransformer.scaleArray(complexArray55, 0.0d);
        org.apache.commons.math.transform.FastFourierTransformer.verifyDataSet((java.lang.Object[]) complexArray57);
        org.junit.Assert.assertNotNull(doubleArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray6), "[-1.0, 97.0, 1.0, 10.0]");
        org.junit.Assert.assertNotNull(complexArray8);
        org.junit.Assert.assertNotNull(complexArray10);
        org.junit.Assert.assertNotNull(complexArray12);
        org.junit.Assert.assertNotNull(doubleArray17);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray17), "[-100.0, 9700.0, 100.0, 1000.0]");
        org.junit.Assert.assertNotNull(doubleArray20);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray20), "[-100.0, 9700.0, 100.0, 1000.0]");
        org.junit.Assert.assertNotNull(doubleArray22);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray22), "[-100.0, 9700.0, 100.0, 1000.0]");
        org.junit.Assert.assertNotNull(complexArray23);
        org.junit.Assert.assertNotNull(doubleArray28);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray28), "[-100.0, 9700.0, 100.0, 1000.0]");
        org.junit.Assert.assertNotNull(doubleArray31);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray31), "[-100.0, 9700.0, 100.0, 1000.0]");
        org.junit.Assert.assertNotNull(doubleArray34);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray34), "[-100.0, 9700.0, 100.0, 1000.0]");
        org.junit.Assert.assertNotNull(complexArray35);
        org.junit.Assert.assertNotNull(doubleArray41);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray41), "[-1.0, 97.0, 1.0, 10.0]");
        org.junit.Assert.assertNotNull(complexArray43);
        org.junit.Assert.assertNotNull(complexArray45);
        org.junit.Assert.assertNotNull(complexArray48);
        org.junit.Assert.assertNotNull(complexArray49);
        org.junit.Assert.assertNotNull(complexArray51);
        org.junit.Assert.assertNotNull(complexArray53);
        org.junit.Assert.assertNotNull(complexArray55);
        org.junit.Assert.assertNotNull(complexArray57);
    }

    @Test
    public void test3026() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3026");
        org.apache.commons.math.analysis.UnivariateRealFunction univariateRealFunction0 = null;
        // The following exception was thrown during execution in test generation
        try {
            double[] doubleArray4 = org.apache.commons.math.transform.FastFourierTransformer.sample(univariateRealFunction0, (double) 100.0f, (-1.0d), (int) (short) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Endpoints do not specify an interval: [100.0, -1.0]");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void test3027() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3027");
        org.apache.commons.math.transform.FastFourierTransformer fastFourierTransformer0 = new org.apache.commons.math.transform.FastFourierTransformer();
        double[] doubleArray5 = new double[] { (-1L), 'a', 1L, 10 };
        org.apache.commons.math.transform.FastFourierTransformer.verifyDataSet(doubleArray5);
        double[] doubleArray8 = org.apache.commons.math.transform.FastFourierTransformer.scaleArray(doubleArray5, (double) 10.0f);
        org.apache.commons.math.transform.FastFourierTransformer.verifyDataSet(doubleArray8);
        org.apache.commons.math.complex.Complex[] complexArray10 = fastFourierTransformer0.transform(doubleArray8);
        org.apache.commons.math.transform.FastFourierTransformer fastFourierTransformer11 = new org.apache.commons.math.transform.FastFourierTransformer();
        double[] doubleArray16 = new double[] { (-1L), 'a', 1L, 10 };
        org.apache.commons.math.transform.FastFourierTransformer.verifyDataSet(doubleArray16);
        org.apache.commons.math.complex.Complex[] complexArray18 = fastFourierTransformer11.transform2(doubleArray16);
        org.apache.commons.math.complex.Complex[] complexArray19 = fastFourierTransformer0.inversetransform2(complexArray18);
        org.apache.commons.math.transform.FastFourierTransformer fastFourierTransformer20 = new org.apache.commons.math.transform.FastFourierTransformer();
        org.apache.commons.math.transform.FastFourierTransformer fastFourierTransformer21 = new org.apache.commons.math.transform.FastFourierTransformer();
        double[] doubleArray26 = new double[] { (-1L), 'a', 1L, 10 };
        org.apache.commons.math.transform.FastFourierTransformer.verifyDataSet(doubleArray26);
        org.apache.commons.math.complex.Complex[] complexArray28 = fastFourierTransformer21.transform2(doubleArray26);
        org.apache.commons.math.complex.Complex[] complexArray30 = org.apache.commons.math.transform.FastFourierTransformer.scaleArray(complexArray28, (double) 'a');
        org.apache.commons.math.transform.FastFourierTransformer.verifyDataSet((java.lang.Object[]) complexArray28);
        org.apache.commons.math.complex.Complex[] complexArray32 = fastFourierTransformer20.inversetransform(complexArray28);
        org.apache.commons.math.transform.FastFourierTransformer fastFourierTransformer33 = new org.apache.commons.math.transform.FastFourierTransformer();
        double[] doubleArray38 = new double[] { (-1L), 'a', 1L, 10 };
        org.apache.commons.math.transform.FastFourierTransformer.verifyDataSet(doubleArray38);
        org.apache.commons.math.complex.Complex[] complexArray40 = fastFourierTransformer33.transform2(doubleArray38);
        org.apache.commons.math.complex.Complex[] complexArray41 = fastFourierTransformer20.transform(complexArray40);
        org.apache.commons.math.transform.FastFourierTransformer fastFourierTransformer42 = new org.apache.commons.math.transform.FastFourierTransformer();
        org.apache.commons.math.transform.FastFourierTransformer fastFourierTransformer43 = new org.apache.commons.math.transform.FastFourierTransformer();
        double[] doubleArray48 = new double[] { (-1L), 'a', 1L, 10 };
        org.apache.commons.math.transform.FastFourierTransformer.verifyDataSet(doubleArray48);
        org.apache.commons.math.complex.Complex[] complexArray50 = fastFourierTransformer43.transform2(doubleArray48);
        org.apache.commons.math.complex.Complex[] complexArray52 = org.apache.commons.math.transform.FastFourierTransformer.scaleArray(complexArray50, (double) 'a');
        org.apache.commons.math.transform.FastFourierTransformer.verifyDataSet((java.lang.Object[]) complexArray50);
        org.apache.commons.math.complex.Complex[] complexArray54 = fastFourierTransformer42.inversetransform(complexArray50);
        org.apache.commons.math.transform.FastFourierTransformer fastFourierTransformer55 = new org.apache.commons.math.transform.FastFourierTransformer();
        double[] doubleArray60 = new double[] { (-1L), 'a', 1L, 10 };
        org.apache.commons.math.transform.FastFourierTransformer.verifyDataSet(doubleArray60);
        org.apache.commons.math.complex.Complex[] complexArray62 = fastFourierTransformer55.transform2(doubleArray60);
        org.apache.commons.math.complex.Complex[] complexArray63 = fastFourierTransformer42.transform(complexArray62);
        org.apache.commons.math.complex.Complex[] complexArray64 = fastFourierTransformer20.inversetransform(complexArray62);
        org.apache.commons.math.complex.Complex[] complexArray66 = org.apache.commons.math.transform.FastFourierTransformer.scaleArray(complexArray62, (double) (short) 100);
        org.apache.commons.math.transform.FastFourierTransformer.verifyDataSet((java.lang.Object[]) complexArray66);
        org.apache.commons.math.complex.Complex[] complexArray68 = fastFourierTransformer0.inversetransform(complexArray66);
        org.apache.commons.math.transform.FastFourierTransformer fastFourierTransformer69 = new org.apache.commons.math.transform.FastFourierTransformer();
        double[] doubleArray74 = new double[] { (-1L), 'a', 1L, 10 };
        org.apache.commons.math.transform.FastFourierTransformer.verifyDataSet(doubleArray74);
        org.apache.commons.math.complex.Complex[] complexArray76 = fastFourierTransformer69.transform2(doubleArray74);
        double[] doubleArray78 = org.apache.commons.math.transform.FastFourierTransformer.scaleArray(doubleArray74, (double) 10.0f);
        double[] doubleArray80 = org.apache.commons.math.transform.FastFourierTransformer.scaleArray(doubleArray74, 0.0d);
        org.apache.commons.math.transform.FastFourierTransformer.verifyDataSet(doubleArray80);
        org.apache.commons.math.complex.Complex[] complexArray82 = fastFourierTransformer0.transform2(doubleArray80);
        double[] doubleArray84 = org.apache.commons.math.transform.FastFourierTransformer.scaleArray(doubleArray80, (double) (short) 100);
        double[] doubleArray86 = org.apache.commons.math.transform.FastFourierTransformer.scaleArray(doubleArray84, (double) 100);
        org.junit.Assert.assertNotNull(doubleArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray5), "[-10.0, 970.0, 10.0, 100.0]");
        org.junit.Assert.assertNotNull(doubleArray8);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray8), "[-10.0, 970.0, 10.0, 100.0]");
        org.junit.Assert.assertNotNull(complexArray10);
        org.junit.Assert.assertNotNull(doubleArray16);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray16), "[-1.0, 97.0, 1.0, 10.0]");
        org.junit.Assert.assertNotNull(complexArray18);
        org.junit.Assert.assertNotNull(complexArray19);
        org.junit.Assert.assertNotNull(doubleArray26);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray26), "[-1.0, 97.0, 1.0, 10.0]");
        org.junit.Assert.assertNotNull(complexArray28);
        org.junit.Assert.assertNotNull(complexArray30);
        org.junit.Assert.assertNotNull(complexArray32);
        org.junit.Assert.assertNotNull(doubleArray38);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray38), "[-1.0, 97.0, 1.0, 10.0]");
        org.junit.Assert.assertNotNull(complexArray40);
        org.junit.Assert.assertNotNull(complexArray41);
        org.junit.Assert.assertNotNull(doubleArray48);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray48), "[-1.0, 97.0, 1.0, 10.0]");
        org.junit.Assert.assertNotNull(complexArray50);
        org.junit.Assert.assertNotNull(complexArray52);
        org.junit.Assert.assertNotNull(complexArray54);
        org.junit.Assert.assertNotNull(doubleArray60);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray60), "[-1.0, 97.0, 1.0, 10.0]");
        org.junit.Assert.assertNotNull(complexArray62);
        org.junit.Assert.assertNotNull(complexArray63);
        org.junit.Assert.assertNotNull(complexArray64);
        org.junit.Assert.assertNotNull(complexArray66);
        org.junit.Assert.assertNotNull(complexArray68);
        org.junit.Assert.assertNotNull(doubleArray74);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray74), "[-0.0, 0.0, 0.0, 0.0]");
        org.junit.Assert.assertNotNull(complexArray76);
        org.junit.Assert.assertNotNull(doubleArray78);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray78), "[-0.0, 0.0, 0.0, 0.0]");
        org.junit.Assert.assertNotNull(doubleArray80);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray80), "[-0.0, 0.0, 0.0, 0.0]");
        org.junit.Assert.assertNotNull(complexArray82);
        org.junit.Assert.assertNotNull(doubleArray84);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray84), "[-0.0, 0.0, 0.0, 0.0]");
        org.junit.Assert.assertNotNull(doubleArray86);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray86), "[-0.0, 0.0, 0.0, 0.0]");
    }

    @Test
    public void test3028() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3028");
        org.apache.commons.math.transform.FastFourierTransformer fastFourierTransformer0 = new org.apache.commons.math.transform.FastFourierTransformer();
        double[] doubleArray5 = new double[] { (-1L), 'a', 1L, 10 };
        org.apache.commons.math.transform.FastFourierTransformer.verifyDataSet(doubleArray5);
        double[] doubleArray8 = org.apache.commons.math.transform.FastFourierTransformer.scaleArray(doubleArray5, (double) 10.0f);
        org.apache.commons.math.transform.FastFourierTransformer.verifyDataSet(doubleArray8);
        org.apache.commons.math.complex.Complex[] complexArray10 = fastFourierTransformer0.transform(doubleArray8);
        double[] doubleArray15 = new double[] { (-1L), 'a', 1L, 10 };
        org.apache.commons.math.transform.FastFourierTransformer.verifyDataSet(doubleArray15);
        double[] doubleArray18 = org.apache.commons.math.transform.FastFourierTransformer.scaleArray(doubleArray15, (double) (byte) 100);
        double[] doubleArray20 = org.apache.commons.math.transform.FastFourierTransformer.scaleArray(doubleArray15, (double) 0);
        double[] doubleArray22 = org.apache.commons.math.transform.FastFourierTransformer.scaleArray(doubleArray15, 10.0d);
        org.apache.commons.math.complex.Complex[] complexArray23 = fastFourierTransformer0.transform2(doubleArray22);
        org.apache.commons.math.transform.FastFourierTransformer fastFourierTransformer24 = new org.apache.commons.math.transform.FastFourierTransformer();
        double[] doubleArray29 = new double[] { (-1L), 'a', 1L, 10 };
        org.apache.commons.math.transform.FastFourierTransformer.verifyDataSet(doubleArray29);
        org.apache.commons.math.complex.Complex[] complexArray31 = fastFourierTransformer24.transform2(doubleArray29);
        org.apache.commons.math.transform.FastFourierTransformer fastFourierTransformer32 = new org.apache.commons.math.transform.FastFourierTransformer();
        double[] doubleArray37 = new double[] { (-1L), 'a', 1L, 10 };
        org.apache.commons.math.transform.FastFourierTransformer.verifyDataSet(doubleArray37);
        org.apache.commons.math.complex.Complex[] complexArray39 = fastFourierTransformer32.transform2(doubleArray37);
        org.apache.commons.math.complex.Complex[] complexArray41 = org.apache.commons.math.transform.FastFourierTransformer.scaleArray(complexArray39, (double) 'a');
        org.apache.commons.math.complex.Complex[] complexArray42 = fastFourierTransformer24.transform(complexArray39);
        double[] doubleArray47 = new double[] { (-1L), 'a', 1L, 10 };
        org.apache.commons.math.transform.FastFourierTransformer.verifyDataSet(doubleArray47);
        double[] doubleArray50 = org.apache.commons.math.transform.FastFourierTransformer.scaleArray(doubleArray47, (double) 10.0f);
        double[] doubleArray52 = org.apache.commons.math.transform.FastFourierTransformer.scaleArray(doubleArray50, (double) (byte) -1);
        org.apache.commons.math.transform.FastFourierTransformer.verifyDataSet(doubleArray50);
        org.apache.commons.math.complex.Complex[] complexArray54 = fastFourierTransformer24.transform(doubleArray50);
        org.apache.commons.math.transform.FastFourierTransformer fastFourierTransformer55 = new org.apache.commons.math.transform.FastFourierTransformer();
        double[] doubleArray60 = new double[] { (-1L), 'a', 1L, 10 };
        org.apache.commons.math.transform.FastFourierTransformer.verifyDataSet(doubleArray60);
        double[] doubleArray63 = org.apache.commons.math.transform.FastFourierTransformer.scaleArray(doubleArray60, (double) 10.0f);
        org.apache.commons.math.transform.FastFourierTransformer.verifyDataSet(doubleArray63);
        org.apache.commons.math.complex.Complex[] complexArray65 = fastFourierTransformer55.inversetransform(doubleArray63);
        org.apache.commons.math.transform.FastFourierTransformer.verifyDataSet((java.lang.Object[]) complexArray65);
        org.apache.commons.math.complex.Complex[] complexArray67 = fastFourierTransformer24.transform2(complexArray65);
        double[] doubleArray72 = new double[] { (-1L), 'a', 1L, 10 };
        org.apache.commons.math.transform.FastFourierTransformer.verifyDataSet(doubleArray72);
        double[] doubleArray75 = org.apache.commons.math.transform.FastFourierTransformer.scaleArray(doubleArray72, (double) 10.0f);
        org.apache.commons.math.transform.FastFourierTransformer.verifyDataSet(doubleArray75);
        org.apache.commons.math.transform.FastFourierTransformer.verifyDataSet(doubleArray75);
        org.apache.commons.math.transform.FastFourierTransformer.verifyDataSet(doubleArray75);
        double[] doubleArray80 = org.apache.commons.math.transform.FastFourierTransformer.scaleArray(doubleArray75, (double) (short) 10);
        org.apache.commons.math.complex.Complex[] complexArray81 = fastFourierTransformer24.inversetransform2(doubleArray80);
        org.apache.commons.math.complex.Complex[] complexArray82 = fastFourierTransformer0.transform2(doubleArray80);
        double[] doubleArray87 = new double[] { (-1L), 'a', 1L, 10 };
        org.apache.commons.math.transform.FastFourierTransformer.verifyDataSet(doubleArray87);
        double[] doubleArray90 = org.apache.commons.math.transform.FastFourierTransformer.scaleArray(doubleArray87, (double) 10.0f);
        org.apache.commons.math.transform.FastFourierTransformer.verifyDataSet(doubleArray90);
        org.apache.commons.math.transform.FastFourierTransformer.verifyDataSet(doubleArray90);
        double[] doubleArray94 = org.apache.commons.math.transform.FastFourierTransformer.scaleArray(doubleArray90, (double) (byte) 10);
        double[] doubleArray96 = org.apache.commons.math.transform.FastFourierTransformer.scaleArray(doubleArray94, (double) (byte) 0);
        org.apache.commons.math.complex.Complex[] complexArray97 = fastFourierTransformer0.inversetransform(doubleArray96);
        org.junit.Assert.assertNotNull(doubleArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray5), "[-10.0, 970.0, 10.0, 100.0]");
        org.junit.Assert.assertNotNull(doubleArray8);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray8), "[-10.0, 970.0, 10.0, 100.0]");
        org.junit.Assert.assertNotNull(complexArray10);
        org.junit.Assert.assertNotNull(doubleArray15);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray15), "[-0.0, 0.0, 0.0, 0.0]");
        org.junit.Assert.assertNotNull(doubleArray18);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray18), "[-0.0, 0.0, 0.0, 0.0]");
        org.junit.Assert.assertNotNull(doubleArray20);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray20), "[-0.0, 0.0, 0.0, 0.0]");
        org.junit.Assert.assertNotNull(doubleArray22);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray22), "[-0.0, 0.0, 0.0, 0.0]");
        org.junit.Assert.assertNotNull(complexArray23);
        org.junit.Assert.assertNotNull(doubleArray29);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray29), "[-1.0, 97.0, 1.0, 10.0]");
        org.junit.Assert.assertNotNull(complexArray31);
        org.junit.Assert.assertNotNull(doubleArray37);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray37), "[-1.0, 97.0, 1.0, 10.0]");
        org.junit.Assert.assertNotNull(complexArray39);
        org.junit.Assert.assertNotNull(complexArray41);
        org.junit.Assert.assertNotNull(complexArray42);
        org.junit.Assert.assertNotNull(doubleArray47);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray47), "[10.0, -970.0, -10.0, -100.0]");
        org.junit.Assert.assertNotNull(doubleArray50);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray50), "[10.0, -970.0, -10.0, -100.0]");
        org.junit.Assert.assertNotNull(doubleArray52);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray52), "[10.0, -970.0, -10.0, -100.0]");
        org.junit.Assert.assertNotNull(complexArray54);
        org.junit.Assert.assertNotNull(doubleArray60);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray60), "[-10.0, 970.0, 10.0, 100.0]");
        org.junit.Assert.assertNotNull(doubleArray63);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray63), "[-10.0, 970.0, 10.0, 100.0]");
        org.junit.Assert.assertNotNull(complexArray65);
        org.junit.Assert.assertNotNull(complexArray67);
        org.junit.Assert.assertNotNull(doubleArray72);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray72), "[-100.0, 9700.0, 100.0, 1000.0]");
        org.junit.Assert.assertNotNull(doubleArray75);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray75), "[-100.0, 9700.0, 100.0, 1000.0]");
        org.junit.Assert.assertNotNull(doubleArray80);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray80), "[-100.0, 9700.0, 100.0, 1000.0]");
        org.junit.Assert.assertNotNull(complexArray81);
        org.junit.Assert.assertNotNull(complexArray82);
        org.junit.Assert.assertNotNull(doubleArray87);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray87), "[-0.0, 0.0, 0.0, 0.0]");
        org.junit.Assert.assertNotNull(doubleArray90);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray90), "[-0.0, 0.0, 0.0, 0.0]");
        org.junit.Assert.assertNotNull(doubleArray94);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray94), "[-0.0, 0.0, 0.0, 0.0]");
        org.junit.Assert.assertNotNull(doubleArray96);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray96), "[-0.0, 0.0, 0.0, 0.0]");
        org.junit.Assert.assertNotNull(complexArray97);
    }

    @Test
    public void test3029() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3029");
        org.apache.commons.math.transform.FastFourierTransformer fastFourierTransformer0 = new org.apache.commons.math.transform.FastFourierTransformer();
        org.apache.commons.math.transform.FastFourierTransformer fastFourierTransformer1 = new org.apache.commons.math.transform.FastFourierTransformer();
        double[] doubleArray6 = new double[] { (-1L), 'a', 1L, 10 };
        org.apache.commons.math.transform.FastFourierTransformer.verifyDataSet(doubleArray6);
        double[] doubleArray9 = org.apache.commons.math.transform.FastFourierTransformer.scaleArray(doubleArray6, (double) 10.0f);
        org.apache.commons.math.transform.FastFourierTransformer.verifyDataSet(doubleArray9);
        org.apache.commons.math.complex.Complex[] complexArray11 = fastFourierTransformer1.transform(doubleArray9);
        org.apache.commons.math.transform.FastFourierTransformer fastFourierTransformer12 = new org.apache.commons.math.transform.FastFourierTransformer();
        double[] doubleArray17 = new double[] { (-1L), 'a', 1L, 10 };
        org.apache.commons.math.transform.FastFourierTransformer.verifyDataSet(doubleArray17);
        org.apache.commons.math.complex.Complex[] complexArray19 = fastFourierTransformer12.transform2(doubleArray17);
        double[] doubleArray21 = org.apache.commons.math.transform.FastFourierTransformer.scaleArray(doubleArray17, 100.0d);
        org.apache.commons.math.complex.Complex[] complexArray22 = fastFourierTransformer1.inversetransform(doubleArray17);
        org.apache.commons.math.transform.FastFourierTransformer fastFourierTransformer23 = new org.apache.commons.math.transform.FastFourierTransformer();
        org.apache.commons.math.transform.FastFourierTransformer fastFourierTransformer24 = new org.apache.commons.math.transform.FastFourierTransformer();
        double[] doubleArray29 = new double[] { (-1L), 'a', 1L, 10 };
        org.apache.commons.math.transform.FastFourierTransformer.verifyDataSet(doubleArray29);
        org.apache.commons.math.complex.Complex[] complexArray31 = fastFourierTransformer24.transform2(doubleArray29);
        org.apache.commons.math.complex.Complex[] complexArray33 = org.apache.commons.math.transform.FastFourierTransformer.scaleArray(complexArray31, (double) 100L);
        org.apache.commons.math.complex.Complex[] complexArray34 = fastFourierTransformer23.inversetransform(complexArray31);
        org.apache.commons.math.transform.FastFourierTransformer fastFourierTransformer35 = new org.apache.commons.math.transform.FastFourierTransformer();
        org.apache.commons.math.transform.FastFourierTransformer fastFourierTransformer36 = new org.apache.commons.math.transform.FastFourierTransformer();
        double[] doubleArray41 = new double[] { (-1L), 'a', 1L, 10 };
        org.apache.commons.math.transform.FastFourierTransformer.verifyDataSet(doubleArray41);
        org.apache.commons.math.complex.Complex[] complexArray43 = fastFourierTransformer36.transform2(doubleArray41);
        org.apache.commons.math.complex.Complex[] complexArray45 = org.apache.commons.math.transform.FastFourierTransformer.scaleArray(complexArray43, (double) 'a');
        org.apache.commons.math.transform.FastFourierTransformer.verifyDataSet((java.lang.Object[]) complexArray43);
        org.apache.commons.math.complex.Complex[] complexArray47 = fastFourierTransformer35.inversetransform(complexArray43);
        org.apache.commons.math.transform.FastFourierTransformer fastFourierTransformer48 = new org.apache.commons.math.transform.FastFourierTransformer();
        double[] doubleArray53 = new double[] { (-1L), 'a', 1L, 10 };
        org.apache.commons.math.transform.FastFourierTransformer.verifyDataSet(doubleArray53);
        org.apache.commons.math.complex.Complex[] complexArray55 = fastFourierTransformer48.transform2(doubleArray53);
        org.apache.commons.math.complex.Complex[] complexArray56 = fastFourierTransformer35.transform(complexArray55);
        org.apache.commons.math.transform.FastFourierTransformer fastFourierTransformer57 = new org.apache.commons.math.transform.FastFourierTransformer();
        double[] doubleArray62 = new double[] { (-1L), 'a', 1L, 10 };
        org.apache.commons.math.transform.FastFourierTransformer.verifyDataSet(doubleArray62);
        org.apache.commons.math.complex.Complex[] complexArray64 = fastFourierTransformer57.transform2(doubleArray62);
        org.apache.commons.math.transform.FastFourierTransformer fastFourierTransformer65 = new org.apache.commons.math.transform.FastFourierTransformer();
        double[] doubleArray70 = new double[] { (-1L), 'a', 1L, 10 };
        org.apache.commons.math.transform.FastFourierTransformer.verifyDataSet(doubleArray70);
        org.apache.commons.math.complex.Complex[] complexArray72 = fastFourierTransformer65.transform2(doubleArray70);
        org.apache.commons.math.complex.Complex[] complexArray74 = org.apache.commons.math.transform.FastFourierTransformer.scaleArray(complexArray72, (double) 'a');
        org.apache.commons.math.transform.FastFourierTransformer.verifyDataSet((java.lang.Object[]) complexArray72);
        org.apache.commons.math.complex.Complex[] complexArray77 = org.apache.commons.math.transform.FastFourierTransformer.scaleArray(complexArray72, (double) 1L);
        org.apache.commons.math.complex.Complex[] complexArray78 = fastFourierTransformer57.transform2(complexArray77);
        double[] doubleArray83 = new double[] { (-1L), 'a', 1L, 10 };
        org.apache.commons.math.transform.FastFourierTransformer.verifyDataSet(doubleArray83);
        double[] doubleArray86 = org.apache.commons.math.transform.FastFourierTransformer.scaleArray(doubleArray83, (double) 10.0f);
        org.apache.commons.math.complex.Complex[] complexArray87 = fastFourierTransformer57.transform2(doubleArray86);
        org.apache.commons.math.complex.Complex[] complexArray88 = fastFourierTransformer35.inversetransform2(doubleArray86);
        double[] doubleArray90 = org.apache.commons.math.transform.FastFourierTransformer.scaleArray(doubleArray86, (double) (short) -1);
        org.apache.commons.math.complex.Complex[] complexArray91 = fastFourierTransformer23.inversetransform(doubleArray86);
        org.apache.commons.math.complex.Complex[] complexArray92 = fastFourierTransformer1.inversetransform(doubleArray86);
        org.apache.commons.math.complex.Complex[] complexArray93 = fastFourierTransformer0.transform2(doubleArray86);
        double[] doubleArray94 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math.complex.Complex[] complexArray95 = fastFourierTransformer0.transform(doubleArray94);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(doubleArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray6), "[-10.0, 970.0, 10.0, 100.0]");
        org.junit.Assert.assertNotNull(doubleArray9);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray9), "[-10.0, 970.0, 10.0, 100.0]");
        org.junit.Assert.assertNotNull(complexArray11);
        org.junit.Assert.assertNotNull(doubleArray17);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray17), "[-100.0, 9700.0, 100.0, 1000.0]");
        org.junit.Assert.assertNotNull(complexArray19);
        org.junit.Assert.assertNotNull(doubleArray21);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray21), "[-100.0, 9700.0, 100.0, 1000.0]");
        org.junit.Assert.assertNotNull(complexArray22);
        org.junit.Assert.assertNotNull(doubleArray29);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray29), "[-1.0, 97.0, 1.0, 10.0]");
        org.junit.Assert.assertNotNull(complexArray31);
        org.junit.Assert.assertNotNull(complexArray33);
        org.junit.Assert.assertNotNull(complexArray34);
        org.junit.Assert.assertNotNull(doubleArray41);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray41), "[-1.0, 97.0, 1.0, 10.0]");
        org.junit.Assert.assertNotNull(complexArray43);
        org.junit.Assert.assertNotNull(complexArray45);
        org.junit.Assert.assertNotNull(complexArray47);
        org.junit.Assert.assertNotNull(doubleArray53);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray53), "[-1.0, 97.0, 1.0, 10.0]");
        org.junit.Assert.assertNotNull(complexArray55);
        org.junit.Assert.assertNotNull(complexArray56);
        org.junit.Assert.assertNotNull(doubleArray62);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray62), "[-1.0, 97.0, 1.0, 10.0]");
        org.junit.Assert.assertNotNull(complexArray64);
        org.junit.Assert.assertNotNull(doubleArray70);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray70), "[-1.0, 97.0, 1.0, 10.0]");
        org.junit.Assert.assertNotNull(complexArray72);
        org.junit.Assert.assertNotNull(complexArray74);
        org.junit.Assert.assertNotNull(complexArray77);
        org.junit.Assert.assertNotNull(complexArray78);
        org.junit.Assert.assertNotNull(doubleArray83);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray83), "[10.0, -970.0, -10.0, -100.0]");
        org.junit.Assert.assertNotNull(doubleArray86);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray86), "[10.0, -970.0, -10.0, -100.0]");
        org.junit.Assert.assertNotNull(complexArray87);
        org.junit.Assert.assertNotNull(complexArray88);
        org.junit.Assert.assertNotNull(doubleArray90);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray90), "[10.0, -970.0, -10.0, -100.0]");
        org.junit.Assert.assertNotNull(complexArray91);
        org.junit.Assert.assertNotNull(complexArray92);
        org.junit.Assert.assertNotNull(complexArray93);
    }

    @Test
    public void test3030() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3030");
        org.apache.commons.math.transform.FastFourierTransformer fastFourierTransformer0 = new org.apache.commons.math.transform.FastFourierTransformer();
        org.apache.commons.math.transform.FastFourierTransformer fastFourierTransformer1 = new org.apache.commons.math.transform.FastFourierTransformer();
        double[] doubleArray6 = new double[] { (-1L), 'a', 1L, 10 };
        org.apache.commons.math.transform.FastFourierTransformer.verifyDataSet(doubleArray6);
        org.apache.commons.math.complex.Complex[] complexArray8 = fastFourierTransformer1.transform2(doubleArray6);
        org.apache.commons.math.complex.Complex[] complexArray10 = org.apache.commons.math.transform.FastFourierTransformer.scaleArray(complexArray8, (double) 'a');
        org.apache.commons.math.transform.FastFourierTransformer.verifyDataSet((java.lang.Object[]) complexArray8);
        org.apache.commons.math.complex.Complex[] complexArray12 = fastFourierTransformer0.inversetransform(complexArray8);
        org.apache.commons.math.transform.FastFourierTransformer fastFourierTransformer13 = new org.apache.commons.math.transform.FastFourierTransformer();
        double[] doubleArray18 = new double[] { (-1L), 'a', 1L, 10 };
        org.apache.commons.math.transform.FastFourierTransformer.verifyDataSet(doubleArray18);
        org.apache.commons.math.complex.Complex[] complexArray20 = fastFourierTransformer13.transform2(doubleArray18);
        org.apache.commons.math.complex.Complex[] complexArray21 = fastFourierTransformer0.transform(complexArray20);
        org.apache.commons.math.transform.FastFourierTransformer fastFourierTransformer22 = new org.apache.commons.math.transform.FastFourierTransformer();
        double[] doubleArray27 = new double[] { (-1L), 'a', 1L, 10 };
        org.apache.commons.math.transform.FastFourierTransformer.verifyDataSet(doubleArray27);
        org.apache.commons.math.complex.Complex[] complexArray29 = fastFourierTransformer22.transform2(doubleArray27);
        org.apache.commons.math.transform.FastFourierTransformer fastFourierTransformer30 = new org.apache.commons.math.transform.FastFourierTransformer();
        double[] doubleArray35 = new double[] { (-1L), 'a', 1L, 10 };
        org.apache.commons.math.transform.FastFourierTransformer.verifyDataSet(doubleArray35);
        org.apache.commons.math.complex.Complex[] complexArray37 = fastFourierTransformer30.transform2(doubleArray35);
        org.apache.commons.math.complex.Complex[] complexArray39 = org.apache.commons.math.transform.FastFourierTransformer.scaleArray(complexArray37, (double) 'a');
        org.apache.commons.math.transform.FastFourierTransformer.verifyDataSet((java.lang.Object[]) complexArray37);
        org.apache.commons.math.complex.Complex[] complexArray42 = org.apache.commons.math.transform.FastFourierTransformer.scaleArray(complexArray37, (double) 1L);
        org.apache.commons.math.complex.Complex[] complexArray43 = fastFourierTransformer22.transform2(complexArray42);
        double[] doubleArray48 = new double[] { (-1L), 'a', 1L, 10 };
        org.apache.commons.math.transform.FastFourierTransformer.verifyDataSet(doubleArray48);
        double[] doubleArray51 = org.apache.commons.math.transform.FastFourierTransformer.scaleArray(doubleArray48, (double) 10.0f);
        org.apache.commons.math.complex.Complex[] complexArray52 = fastFourierTransformer22.transform2(doubleArray51);
        org.apache.commons.math.complex.Complex[] complexArray53 = fastFourierTransformer0.inversetransform2(doubleArray51);
        double[] doubleArray58 = new double[] { (-1L), 'a', 1L, 10 };
        org.apache.commons.math.transform.FastFourierTransformer.verifyDataSet(doubleArray58);
        double[] doubleArray61 = org.apache.commons.math.transform.FastFourierTransformer.scaleArray(doubleArray58, (double) (byte) 100);
        double[] doubleArray63 = org.apache.commons.math.transform.FastFourierTransformer.scaleArray(doubleArray58, (double) 0);
        org.apache.commons.math.transform.FastFourierTransformer.verifyDataSet(doubleArray58);
        org.apache.commons.math.complex.Complex[] complexArray65 = fastFourierTransformer0.inversetransform2(doubleArray58);
        double[] doubleArray70 = new double[] { (-1L), 'a', 1L, 10 };
        org.apache.commons.math.transform.FastFourierTransformer.verifyDataSet(doubleArray70);
        double[] doubleArray73 = org.apache.commons.math.transform.FastFourierTransformer.scaleArray(doubleArray70, (double) 10.0f);
        double[] doubleArray75 = org.apache.commons.math.transform.FastFourierTransformer.scaleArray(doubleArray73, (double) 10L);
        org.apache.commons.math.transform.FastFourierTransformer.verifyDataSet(doubleArray75);
        double[] doubleArray78 = org.apache.commons.math.transform.FastFourierTransformer.scaleArray(doubleArray75, 100.0d);
        double[] doubleArray80 = org.apache.commons.math.transform.FastFourierTransformer.scaleArray(doubleArray75, (double) ' ');
        org.apache.commons.math.complex.Complex[] complexArray81 = fastFourierTransformer0.transform2(doubleArray80);
        double[] doubleArray86 = new double[] { (-1L), 'a', 1L, 10 };
        org.apache.commons.math.transform.FastFourierTransformer.verifyDataSet(doubleArray86);
        double[] doubleArray89 = org.apache.commons.math.transform.FastFourierTransformer.scaleArray(doubleArray86, (double) 10.0f);
        org.apache.commons.math.transform.FastFourierTransformer.verifyDataSet(doubleArray89);
        org.apache.commons.math.transform.FastFourierTransformer.verifyDataSet(doubleArray89);
        org.apache.commons.math.transform.FastFourierTransformer.verifyDataSet(doubleArray89);
        double[] doubleArray94 = org.apache.commons.math.transform.FastFourierTransformer.scaleArray(doubleArray89, (double) (short) 10);
        org.apache.commons.math.complex.Complex[] complexArray95 = fastFourierTransformer0.inversetransform2(doubleArray89);
        org.junit.Assert.assertNotNull(doubleArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray6), "[-1.0, 97.0, 1.0, 10.0]");
        org.junit.Assert.assertNotNull(complexArray8);
        org.junit.Assert.assertNotNull(complexArray10);
        org.junit.Assert.assertNotNull(complexArray12);
        org.junit.Assert.assertNotNull(doubleArray18);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray18), "[-1.0, 97.0, 1.0, 10.0]");
        org.junit.Assert.assertNotNull(complexArray20);
        org.junit.Assert.assertNotNull(complexArray21);
        org.junit.Assert.assertNotNull(doubleArray27);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray27), "[-1.0, 97.0, 1.0, 10.0]");
        org.junit.Assert.assertNotNull(complexArray29);
        org.junit.Assert.assertNotNull(doubleArray35);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray35), "[-1.0, 97.0, 1.0, 10.0]");
        org.junit.Assert.assertNotNull(complexArray37);
        org.junit.Assert.assertNotNull(complexArray39);
        org.junit.Assert.assertNotNull(complexArray42);
        org.junit.Assert.assertNotNull(complexArray43);
        org.junit.Assert.assertNotNull(doubleArray48);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray48), "[-10.0, 970.0, 10.0, 100.0]");
        org.junit.Assert.assertNotNull(doubleArray51);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray51), "[-10.0, 970.0, 10.0, 100.0]");
        org.junit.Assert.assertNotNull(complexArray52);
        org.junit.Assert.assertNotNull(complexArray53);
        org.junit.Assert.assertNotNull(doubleArray58);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray58), "[-0.0, 0.0, 0.0, 0.0]");
        org.junit.Assert.assertNotNull(doubleArray61);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray61), "[-0.0, 0.0, 0.0, 0.0]");
        org.junit.Assert.assertNotNull(doubleArray63);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray63), "[-0.0, 0.0, 0.0, 0.0]");
        org.junit.Assert.assertNotNull(complexArray65);
        org.junit.Assert.assertNotNull(doubleArray70);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray70), "[-320000.0, 3.104E7, 320000.0, 3200000.0]");
        org.junit.Assert.assertNotNull(doubleArray73);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray73), "[-320000.0, 3.104E7, 320000.0, 3200000.0]");
        org.junit.Assert.assertNotNull(doubleArray75);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray75), "[-320000.0, 3.104E7, 320000.0, 3200000.0]");
        org.junit.Assert.assertNotNull(doubleArray78);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray78), "[-320000.0, 3.104E7, 320000.0, 3200000.0]");
        org.junit.Assert.assertNotNull(doubleArray80);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray80), "[-320000.0, 3.104E7, 320000.0, 3200000.0]");
        org.junit.Assert.assertNotNull(complexArray81);
        org.junit.Assert.assertNotNull(doubleArray86);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray86), "[-100.0, 9700.0, 100.0, 1000.0]");
        org.junit.Assert.assertNotNull(doubleArray89);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray89), "[-100.0, 9700.0, 100.0, 1000.0]");
        org.junit.Assert.assertNotNull(doubleArray94);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray94), "[-100.0, 9700.0, 100.0, 1000.0]");
        org.junit.Assert.assertNotNull(complexArray95);
    }

    @Test
    public void test3031() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3031");
        org.apache.commons.math.transform.FastFourierTransformer fastFourierTransformer0 = new org.apache.commons.math.transform.FastFourierTransformer();
        org.apache.commons.math.transform.FastFourierTransformer fastFourierTransformer1 = new org.apache.commons.math.transform.FastFourierTransformer();
        double[] doubleArray6 = new double[] { (-1L), 'a', 1L, 10 };
        org.apache.commons.math.transform.FastFourierTransformer.verifyDataSet(doubleArray6);
        org.apache.commons.math.complex.Complex[] complexArray8 = fastFourierTransformer1.transform2(doubleArray6);
        org.apache.commons.math.complex.Complex[] complexArray10 = org.apache.commons.math.transform.FastFourierTransformer.scaleArray(complexArray8, (double) 'a');
        org.apache.commons.math.transform.FastFourierTransformer.verifyDataSet((java.lang.Object[]) complexArray8);
        org.apache.commons.math.complex.Complex[] complexArray12 = fastFourierTransformer0.inversetransform(complexArray8);
        double[] doubleArray17 = new double[] { (-1L), 'a', 1L, 10 };
        org.apache.commons.math.transform.FastFourierTransformer.verifyDataSet(doubleArray17);
        double[] doubleArray20 = org.apache.commons.math.transform.FastFourierTransformer.scaleArray(doubleArray17, (double) 10.0f);
        double[] doubleArray22 = org.apache.commons.math.transform.FastFourierTransformer.scaleArray(doubleArray20, (double) 10L);
        org.apache.commons.math.complex.Complex[] complexArray23 = fastFourierTransformer0.transform(doubleArray20);
        double[] doubleArray28 = new double[] { (-1L), 'a', 1L, 10 };
        org.apache.commons.math.transform.FastFourierTransformer.verifyDataSet(doubleArray28);
        double[] doubleArray31 = org.apache.commons.math.transform.FastFourierTransformer.scaleArray(doubleArray28, (double) 10.0f);
        org.apache.commons.math.transform.FastFourierTransformer.verifyDataSet(doubleArray31);
        double[] doubleArray34 = org.apache.commons.math.transform.FastFourierTransformer.scaleArray(doubleArray31, 10.0d);
        org.apache.commons.math.complex.Complex[] complexArray35 = fastFourierTransformer0.transform2(doubleArray31);
        org.apache.commons.math.transform.FastFourierTransformer fastFourierTransformer36 = new org.apache.commons.math.transform.FastFourierTransformer();
        double[] doubleArray41 = new double[] { (-1L), 'a', 1L, 10 };
        org.apache.commons.math.transform.FastFourierTransformer.verifyDataSet(doubleArray41);
        org.apache.commons.math.complex.Complex[] complexArray43 = fastFourierTransformer36.transform2(doubleArray41);
        org.apache.commons.math.complex.Complex[] complexArray45 = org.apache.commons.math.transform.FastFourierTransformer.scaleArray(complexArray43, (double) 'a');
        org.apache.commons.math.transform.FastFourierTransformer.verifyDataSet((java.lang.Object[]) complexArray43);
        org.apache.commons.math.complex.Complex[] complexArray48 = org.apache.commons.math.transform.FastFourierTransformer.scaleArray(complexArray43, (double) 1L);
        org.apache.commons.math.complex.Complex[] complexArray49 = fastFourierTransformer0.transform2(complexArray43);
        org.apache.commons.math.transform.FastFourierTransformer fastFourierTransformer50 = new org.apache.commons.math.transform.FastFourierTransformer();
        org.apache.commons.math.transform.FastFourierTransformer fastFourierTransformer51 = new org.apache.commons.math.transform.FastFourierTransformer();
        double[] doubleArray56 = new double[] { (-1L), 'a', 1L, 10 };
        org.apache.commons.math.transform.FastFourierTransformer.verifyDataSet(doubleArray56);
        org.apache.commons.math.complex.Complex[] complexArray58 = fastFourierTransformer51.transform2(doubleArray56);
        org.apache.commons.math.complex.Complex[] complexArray60 = org.apache.commons.math.transform.FastFourierTransformer.scaleArray(complexArray58, (double) 'a');
        org.apache.commons.math.transform.FastFourierTransformer.verifyDataSet((java.lang.Object[]) complexArray58);
        org.apache.commons.math.complex.Complex[] complexArray62 = fastFourierTransformer50.inversetransform(complexArray58);
        org.apache.commons.math.transform.FastFourierTransformer fastFourierTransformer63 = new org.apache.commons.math.transform.FastFourierTransformer();
        double[] doubleArray68 = new double[] { (-1L), 'a', 1L, 10 };
        org.apache.commons.math.transform.FastFourierTransformer.verifyDataSet(doubleArray68);
        org.apache.commons.math.complex.Complex[] complexArray70 = fastFourierTransformer63.transform2(doubleArray68);
        org.apache.commons.math.complex.Complex[] complexArray71 = fastFourierTransformer50.transform(complexArray70);
        double[] doubleArray76 = new double[] { (-1L), 'a', 1L, 10 };
        org.apache.commons.math.transform.FastFourierTransformer.verifyDataSet(doubleArray76);
        double[] doubleArray79 = org.apache.commons.math.transform.FastFourierTransformer.scaleArray(doubleArray76, (double) 10.0f);
        double[] doubleArray81 = org.apache.commons.math.transform.FastFourierTransformer.scaleArray(doubleArray79, (double) 10L);
        org.apache.commons.math.complex.Complex[] complexArray82 = fastFourierTransformer50.inversetransform2(doubleArray81);
        org.apache.commons.math.transform.FastFourierTransformer.verifyDataSet(doubleArray81);
        org.apache.commons.math.complex.Complex[] complexArray84 = fastFourierTransformer0.transform(doubleArray81);
        double[] doubleArray89 = new double[] { (-1L), 'a', 1L, 10 };
        org.apache.commons.math.transform.FastFourierTransformer.verifyDataSet(doubleArray89);
        double[] doubleArray92 = org.apache.commons.math.transform.FastFourierTransformer.scaleArray(doubleArray89, (double) 10.0f);
        org.apache.commons.math.transform.FastFourierTransformer.verifyDataSet(doubleArray92);
        double[] doubleArray95 = org.apache.commons.math.transform.FastFourierTransformer.scaleArray(doubleArray92, 10.0d);
        org.apache.commons.math.complex.Complex[] complexArray96 = fastFourierTransformer0.inversetransform2(doubleArray95);
        org.junit.Assert.assertNotNull(doubleArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray6), "[-1.0, 97.0, 1.0, 10.0]");
        org.junit.Assert.assertNotNull(complexArray8);
        org.junit.Assert.assertNotNull(complexArray10);
        org.junit.Assert.assertNotNull(complexArray12);
        org.junit.Assert.assertNotNull(doubleArray17);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray17), "[-100.0, 9700.0, 100.0, 1000.0]");
        org.junit.Assert.assertNotNull(doubleArray20);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray20), "[-100.0, 9700.0, 100.0, 1000.0]");
        org.junit.Assert.assertNotNull(doubleArray22);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray22), "[-100.0, 9700.0, 100.0, 1000.0]");
        org.junit.Assert.assertNotNull(complexArray23);
        org.junit.Assert.assertNotNull(doubleArray28);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray28), "[-100.0, 9700.0, 100.0, 1000.0]");
        org.junit.Assert.assertNotNull(doubleArray31);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray31), "[-100.0, 9700.0, 100.0, 1000.0]");
        org.junit.Assert.assertNotNull(doubleArray34);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray34), "[-100.0, 9700.0, 100.0, 1000.0]");
        org.junit.Assert.assertNotNull(complexArray35);
        org.junit.Assert.assertNotNull(doubleArray41);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray41), "[-1.0, 97.0, 1.0, 10.0]");
        org.junit.Assert.assertNotNull(complexArray43);
        org.junit.Assert.assertNotNull(complexArray45);
        org.junit.Assert.assertNotNull(complexArray48);
        org.junit.Assert.assertNotNull(complexArray49);
        org.junit.Assert.assertNotNull(doubleArray56);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray56), "[-1.0, 97.0, 1.0, 10.0]");
        org.junit.Assert.assertNotNull(complexArray58);
        org.junit.Assert.assertNotNull(complexArray60);
        org.junit.Assert.assertNotNull(complexArray62);
        org.junit.Assert.assertNotNull(doubleArray68);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray68), "[-1.0, 97.0, 1.0, 10.0]");
        org.junit.Assert.assertNotNull(complexArray70);
        org.junit.Assert.assertNotNull(complexArray71);
        org.junit.Assert.assertNotNull(doubleArray76);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray76), "[-100.0, 9700.0, 100.0, 1000.0]");
        org.junit.Assert.assertNotNull(doubleArray79);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray79), "[-100.0, 9700.0, 100.0, 1000.0]");
        org.junit.Assert.assertNotNull(doubleArray81);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray81), "[-100.0, 9700.0, 100.0, 1000.0]");
        org.junit.Assert.assertNotNull(complexArray82);
        org.junit.Assert.assertNotNull(complexArray84);
        org.junit.Assert.assertNotNull(doubleArray89);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray89), "[-100.0, 9700.0, 100.0, 1000.0]");
        org.junit.Assert.assertNotNull(doubleArray92);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray92), "[-100.0, 9700.0, 100.0, 1000.0]");
        org.junit.Assert.assertNotNull(doubleArray95);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray95), "[-100.0, 9700.0, 100.0, 1000.0]");
        org.junit.Assert.assertNotNull(complexArray96);
    }

    @Test
    public void test3032() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3032");
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
        double[] doubleArray27 = new double[] { (-1L), 'a', 1L, 10 };
        org.apache.commons.math.transform.FastFourierTransformer.verifyDataSet(doubleArray27);
        double[] doubleArray30 = org.apache.commons.math.transform.FastFourierTransformer.scaleArray(doubleArray27, (double) 10.0f);
        org.apache.commons.math.transform.FastFourierTransformer.verifyDataSet(doubleArray30);
        org.apache.commons.math.complex.Complex[] complexArray32 = fastFourierTransformer22.transform(doubleArray30);
        org.apache.commons.math.complex.Complex[] complexArray33 = fastFourierTransformer0.transform(doubleArray30);
        double[] doubleArray38 = new double[] { (-1L), 'a', 1L, 10 };
        org.apache.commons.math.transform.FastFourierTransformer.verifyDataSet(doubleArray38);
        double[] doubleArray41 = org.apache.commons.math.transform.FastFourierTransformer.scaleArray(doubleArray38, (double) 10.0f);
        double[] doubleArray43 = org.apache.commons.math.transform.FastFourierTransformer.scaleArray(doubleArray41, (double) 10L);
        org.apache.commons.math.complex.Complex[] complexArray44 = fastFourierTransformer0.inversetransform(doubleArray43);
        double[] doubleArray49 = new double[] { (-1L), 'a', 1L, 10 };
        org.apache.commons.math.transform.FastFourierTransformer.verifyDataSet(doubleArray49);
        double[] doubleArray52 = org.apache.commons.math.transform.FastFourierTransformer.scaleArray(doubleArray49, (double) 10.0f);
        org.apache.commons.math.complex.Complex[] complexArray53 = fastFourierTransformer0.inversetransform2(doubleArray49);
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
        org.apache.commons.math.complex.Complex[] complexArray76 = org.apache.commons.math.transform.FastFourierTransformer.scaleArray(complexArray74, (double) 'a');
        org.apache.commons.math.transform.FastFourierTransformer.verifyDataSet((java.lang.Object[]) complexArray74);
        org.apache.commons.math.complex.Complex[] complexArray79 = org.apache.commons.math.transform.FastFourierTransformer.scaleArray(complexArray74, (double) 1L);
        org.apache.commons.math.complex.Complex[] complexArray81 = org.apache.commons.math.transform.FastFourierTransformer.scaleArray(complexArray74, (double) 1);
        org.apache.commons.math.complex.Complex[] complexArray82 = fastFourierTransformer54.transform(complexArray74);
        double[] doubleArray87 = new double[] { (-1L), 'a', 1L, 10 };
        org.apache.commons.math.transform.FastFourierTransformer.verifyDataSet(doubleArray87);
        double[] doubleArray90 = org.apache.commons.math.transform.FastFourierTransformer.scaleArray(doubleArray87, (double) 10.0f);
        double[] doubleArray92 = org.apache.commons.math.transform.FastFourierTransformer.scaleArray(doubleArray90, (double) 10L);
        org.apache.commons.math.complex.Complex[] complexArray93 = fastFourierTransformer54.transform2(doubleArray90);
        org.apache.commons.math.complex.Complex[] complexArray94 = fastFourierTransformer0.inversetransform(complexArray93);
        org.apache.commons.math.complex.Complex[] complexArray96 = org.apache.commons.math.transform.FastFourierTransformer.scaleArray(complexArray94, (double) '4');
        org.junit.Assert.assertNotNull(doubleArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray5), "[-1.0, 97.0, 1.0, 10.0]");
        org.junit.Assert.assertNotNull(complexArray7);
        org.junit.Assert.assertNotNull(doubleArray13);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray13), "[-1.0, 97.0, 1.0, 10.0]");
        org.junit.Assert.assertNotNull(complexArray15);
        org.junit.Assert.assertNotNull(complexArray17);
        org.junit.Assert.assertNotNull(complexArray20);
        org.junit.Assert.assertNotNull(complexArray21);
        org.junit.Assert.assertNotNull(doubleArray27);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray27), "[-10.0, 970.0, 10.0, 100.0]");
        org.junit.Assert.assertNotNull(doubleArray30);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray30), "[-10.0, 970.0, 10.0, 100.0]");
        org.junit.Assert.assertNotNull(complexArray32);
        org.junit.Assert.assertNotNull(complexArray33);
        org.junit.Assert.assertNotNull(doubleArray38);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray38), "[-100.0, 9700.0, 100.0, 1000.0]");
        org.junit.Assert.assertNotNull(doubleArray41);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray41), "[-100.0, 9700.0, 100.0, 1000.0]");
        org.junit.Assert.assertNotNull(doubleArray43);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray43), "[-100.0, 9700.0, 100.0, 1000.0]");
        org.junit.Assert.assertNotNull(complexArray44);
        org.junit.Assert.assertNotNull(doubleArray49);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray49), "[-10.0, 970.0, 10.0, 100.0]");
        org.junit.Assert.assertNotNull(doubleArray52);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray52), "[-10.0, 970.0, 10.0, 100.0]");
        org.junit.Assert.assertNotNull(complexArray53);
        org.junit.Assert.assertNotNull(doubleArray60);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray60), "[-1.0, 97.0, 1.0, 10.0]");
        org.junit.Assert.assertNotNull(complexArray62);
        org.junit.Assert.assertNotNull(complexArray64);
        org.junit.Assert.assertNotNull(complexArray66);
        org.junit.Assert.assertNotNull(doubleArray72);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray72), "[-1.0, 97.0, 1.0, 10.0]");
        org.junit.Assert.assertNotNull(complexArray74);
        org.junit.Assert.assertNotNull(complexArray76);
        org.junit.Assert.assertNotNull(complexArray79);
        org.junit.Assert.assertNotNull(complexArray81);
        org.junit.Assert.assertNotNull(complexArray82);
        org.junit.Assert.assertNotNull(doubleArray87);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray87), "[-100.0, 9700.0, 100.0, 1000.0]");
        org.junit.Assert.assertNotNull(doubleArray90);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray90), "[-100.0, 9700.0, 100.0, 1000.0]");
        org.junit.Assert.assertNotNull(doubleArray92);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray92), "[-100.0, 9700.0, 100.0, 1000.0]");
        org.junit.Assert.assertNotNull(complexArray93);
        org.junit.Assert.assertNotNull(complexArray94);
        org.junit.Assert.assertNotNull(complexArray96);
    }

    @Test
    public void test3033() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3033");
        org.apache.commons.math.transform.FastFourierTransformer fastFourierTransformer0 = new org.apache.commons.math.transform.FastFourierTransformer();
        double[] doubleArray5 = new double[] { (-1L), 'a', 1L, 10 };
        org.apache.commons.math.transform.FastFourierTransformer.verifyDataSet(doubleArray5);
        org.apache.commons.math.complex.Complex[] complexArray7 = fastFourierTransformer0.transform2(doubleArray5);
        org.apache.commons.math.transform.FastFourierTransformer fastFourierTransformer8 = new org.apache.commons.math.transform.FastFourierTransformer();
        double[] doubleArray13 = new double[] { (-1L), 'a', 1L, 10 };
        org.apache.commons.math.transform.FastFourierTransformer.verifyDataSet(doubleArray13);
        org.apache.commons.math.complex.Complex[] complexArray15 = fastFourierTransformer8.transform2(doubleArray13);
        org.apache.commons.math.transform.FastFourierTransformer fastFourierTransformer16 = new org.apache.commons.math.transform.FastFourierTransformer();
        double[] doubleArray21 = new double[] { (-1L), 'a', 1L, 10 };
        org.apache.commons.math.transform.FastFourierTransformer.verifyDataSet(doubleArray21);
        org.apache.commons.math.complex.Complex[] complexArray23 = fastFourierTransformer16.transform2(doubleArray21);
        org.apache.commons.math.complex.Complex[] complexArray25 = org.apache.commons.math.transform.FastFourierTransformer.scaleArray(complexArray23, (double) 'a');
        org.apache.commons.math.transform.FastFourierTransformer.verifyDataSet((java.lang.Object[]) complexArray23);
        org.apache.commons.math.complex.Complex[] complexArray28 = org.apache.commons.math.transform.FastFourierTransformer.scaleArray(complexArray23, (double) 1L);
        org.apache.commons.math.complex.Complex[] complexArray29 = fastFourierTransformer8.transform2(complexArray28);
        double[] doubleArray34 = new double[] { (-1L), 'a', 1L, 10 };
        org.apache.commons.math.transform.FastFourierTransformer.verifyDataSet(doubleArray34);
        double[] doubleArray37 = org.apache.commons.math.transform.FastFourierTransformer.scaleArray(doubleArray34, (double) 10.0f);
        org.apache.commons.math.complex.Complex[] complexArray38 = fastFourierTransformer8.transform(doubleArray34);
        org.apache.commons.math.transform.FastFourierTransformer fastFourierTransformer39 = new org.apache.commons.math.transform.FastFourierTransformer();
        double[] doubleArray44 = new double[] { (-1L), 'a', 1L, 10 };
        org.apache.commons.math.transform.FastFourierTransformer.verifyDataSet(doubleArray44);
        double[] doubleArray47 = org.apache.commons.math.transform.FastFourierTransformer.scaleArray(doubleArray44, (double) 10.0f);
        org.apache.commons.math.transform.FastFourierTransformer.verifyDataSet(doubleArray47);
        org.apache.commons.math.complex.Complex[] complexArray49 = fastFourierTransformer39.transform(doubleArray47);
        org.apache.commons.math.transform.FastFourierTransformer fastFourierTransformer50 = new org.apache.commons.math.transform.FastFourierTransformer();
        double[] doubleArray55 = new double[] { (-1L), 'a', 1L, 10 };
        org.apache.commons.math.transform.FastFourierTransformer.verifyDataSet(doubleArray55);
        org.apache.commons.math.complex.Complex[] complexArray57 = fastFourierTransformer50.transform2(doubleArray55);
        double[] doubleArray59 = org.apache.commons.math.transform.FastFourierTransformer.scaleArray(doubleArray55, 100.0d);
        org.apache.commons.math.complex.Complex[] complexArray60 = fastFourierTransformer39.inversetransform(doubleArray55);
        org.apache.commons.math.complex.Complex[] complexArray61 = fastFourierTransformer8.transform2(doubleArray55);
        double[] doubleArray63 = org.apache.commons.math.transform.FastFourierTransformer.scaleArray(doubleArray55, (double) (short) 100);
        org.apache.commons.math.complex.Complex[] complexArray64 = fastFourierTransformer0.transform2(doubleArray55);
        org.apache.commons.math.transform.FastFourierTransformer fastFourierTransformer65 = new org.apache.commons.math.transform.FastFourierTransformer();
        double[] doubleArray70 = new double[] { (-1L), 'a', 1L, 10 };
        org.apache.commons.math.transform.FastFourierTransformer.verifyDataSet(doubleArray70);
        double[] doubleArray73 = org.apache.commons.math.transform.FastFourierTransformer.scaleArray(doubleArray70, (double) 10.0f);
        org.apache.commons.math.transform.FastFourierTransformer.verifyDataSet(doubleArray73);
        org.apache.commons.math.complex.Complex[] complexArray75 = fastFourierTransformer65.inversetransform(doubleArray73);
        org.apache.commons.math.transform.FastFourierTransformer.verifyDataSet((java.lang.Object[]) complexArray75);
        org.apache.commons.math.complex.Complex[] complexArray77 = fastFourierTransformer0.inversetransform(complexArray75);
        double[] doubleArray82 = new double[] { (-1L), 'a', 1L, 10 };
        org.apache.commons.math.transform.FastFourierTransformer.verifyDataSet(doubleArray82);
        double[] doubleArray85 = org.apache.commons.math.transform.FastFourierTransformer.scaleArray(doubleArray82, 0.0d);
        double[] doubleArray87 = org.apache.commons.math.transform.FastFourierTransformer.scaleArray(doubleArray85, (double) (byte) 100);
        org.apache.commons.math.transform.FastFourierTransformer.verifyDataSet(doubleArray87);
        org.apache.commons.math.complex.Complex[] complexArray89 = fastFourierTransformer0.inversetransform(doubleArray87);
        org.apache.commons.math.transform.FastFourierTransformer fastFourierTransformer90 = new org.apache.commons.math.transform.FastFourierTransformer();
        double[] doubleArray95 = new double[] { (-1L), 'a', 1L, 10 };
        org.apache.commons.math.transform.FastFourierTransformer.verifyDataSet(doubleArray95);
        org.apache.commons.math.complex.Complex[] complexArray97 = fastFourierTransformer90.transform2(doubleArray95);
        org.apache.commons.math.complex.Complex[] complexArray98 = fastFourierTransformer0.inversetransform2(complexArray97);
        org.junit.Assert.assertNotNull(doubleArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray5), "[-1.0, 97.0, 1.0, 10.0]");
        org.junit.Assert.assertNotNull(complexArray7);
        org.junit.Assert.assertNotNull(doubleArray13);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray13), "[-1.0, 97.0, 1.0, 10.0]");
        org.junit.Assert.assertNotNull(complexArray15);
        org.junit.Assert.assertNotNull(doubleArray21);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray21), "[-1.0, 97.0, 1.0, 10.0]");
        org.junit.Assert.assertNotNull(complexArray23);
        org.junit.Assert.assertNotNull(complexArray25);
        org.junit.Assert.assertNotNull(complexArray28);
        org.junit.Assert.assertNotNull(complexArray29);
        org.junit.Assert.assertNotNull(doubleArray34);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray34), "[-10.0, 970.0, 10.0, 100.0]");
        org.junit.Assert.assertNotNull(doubleArray37);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray37), "[-10.0, 970.0, 10.0, 100.0]");
        org.junit.Assert.assertNotNull(complexArray38);
        org.junit.Assert.assertNotNull(doubleArray44);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray44), "[-10.0, 970.0, 10.0, 100.0]");
        org.junit.Assert.assertNotNull(doubleArray47);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray47), "[-10.0, 970.0, 10.0, 100.0]");
        org.junit.Assert.assertNotNull(complexArray49);
        org.junit.Assert.assertNotNull(doubleArray55);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray55), "[-10000.0, 970000.0, 10000.0, 100000.0]");
        org.junit.Assert.assertNotNull(complexArray57);
        org.junit.Assert.assertNotNull(doubleArray59);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray59), "[-10000.0, 970000.0, 10000.0, 100000.0]");
        org.junit.Assert.assertNotNull(complexArray60);
        org.junit.Assert.assertNotNull(complexArray61);
        org.junit.Assert.assertNotNull(doubleArray63);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray63), "[-10000.0, 970000.0, 10000.0, 100000.0]");
        org.junit.Assert.assertNotNull(complexArray64);
        org.junit.Assert.assertNotNull(doubleArray70);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray70), "[-10.0, 970.0, 10.0, 100.0]");
        org.junit.Assert.assertNotNull(doubleArray73);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray73), "[-10.0, 970.0, 10.0, 100.0]");
        org.junit.Assert.assertNotNull(complexArray75);
        org.junit.Assert.assertNotNull(complexArray77);
        org.junit.Assert.assertNotNull(doubleArray82);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray82), "[-0.0, 0.0, 0.0, 0.0]");
        org.junit.Assert.assertNotNull(doubleArray85);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray85), "[-0.0, 0.0, 0.0, 0.0]");
        org.junit.Assert.assertNotNull(doubleArray87);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray87), "[-0.0, 0.0, 0.0, 0.0]");
        org.junit.Assert.assertNotNull(complexArray89);
        org.junit.Assert.assertNotNull(doubleArray95);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray95), "[-1.0, 97.0, 1.0, 10.0]");
        org.junit.Assert.assertNotNull(complexArray97);
        org.junit.Assert.assertNotNull(complexArray98);
    }

    @Test
    public void test3034() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3034");
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math.transform.FastFourierTransformer.verifyInterval((double) 10, 10.0d);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Endpoints do not specify an interval: [10.0, 10.0]");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void test3035() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3035");
        org.apache.commons.math.transform.FastFourierTransformer fastFourierTransformer0 = new org.apache.commons.math.transform.FastFourierTransformer();
        org.apache.commons.math.transform.FastFourierTransformer fastFourierTransformer1 = new org.apache.commons.math.transform.FastFourierTransformer();
        double[] doubleArray6 = new double[] { (-1L), 'a', 1L, 10 };
        org.apache.commons.math.transform.FastFourierTransformer.verifyDataSet(doubleArray6);
        double[] doubleArray9 = org.apache.commons.math.transform.FastFourierTransformer.scaleArray(doubleArray6, (double) 10.0f);
        org.apache.commons.math.transform.FastFourierTransformer.verifyDataSet(doubleArray9);
        org.apache.commons.math.complex.Complex[] complexArray11 = fastFourierTransformer1.inversetransform(doubleArray9);
        org.apache.commons.math.complex.Complex[] complexArray12 = fastFourierTransformer0.transform2(complexArray11);
        org.apache.commons.math.transform.FastFourierTransformer fastFourierTransformer13 = new org.apache.commons.math.transform.FastFourierTransformer();
        double[] doubleArray18 = new double[] { (-1L), 'a', 1L, 10 };
        org.apache.commons.math.transform.FastFourierTransformer.verifyDataSet(doubleArray18);
        org.apache.commons.math.complex.Complex[] complexArray20 = fastFourierTransformer13.transform2(doubleArray18);
        org.apache.commons.math.transform.FastFourierTransformer fastFourierTransformer21 = new org.apache.commons.math.transform.FastFourierTransformer();
        double[] doubleArray26 = new double[] { (-1L), 'a', 1L, 10 };
        org.apache.commons.math.transform.FastFourierTransformer.verifyDataSet(doubleArray26);
        org.apache.commons.math.complex.Complex[] complexArray28 = fastFourierTransformer21.transform2(doubleArray26);
        org.apache.commons.math.complex.Complex[] complexArray30 = org.apache.commons.math.transform.FastFourierTransformer.scaleArray(complexArray28, (double) 'a');
        org.apache.commons.math.transform.FastFourierTransformer.verifyDataSet((java.lang.Object[]) complexArray28);
        org.apache.commons.math.complex.Complex[] complexArray33 = org.apache.commons.math.transform.FastFourierTransformer.scaleArray(complexArray28, (double) 1L);
        org.apache.commons.math.complex.Complex[] complexArray34 = fastFourierTransformer13.transform2(complexArray33);
        double[] doubleArray39 = new double[] { (-1L), 'a', 1L, 10 };
        org.apache.commons.math.transform.FastFourierTransformer.verifyDataSet(doubleArray39);
        double[] doubleArray42 = org.apache.commons.math.transform.FastFourierTransformer.scaleArray(doubleArray39, (double) 10.0f);
        org.apache.commons.math.complex.Complex[] complexArray43 = fastFourierTransformer13.transform(doubleArray39);
        org.apache.commons.math.transform.FastFourierTransformer fastFourierTransformer44 = new org.apache.commons.math.transform.FastFourierTransformer();
        org.apache.commons.math.transform.FastFourierTransformer fastFourierTransformer45 = new org.apache.commons.math.transform.FastFourierTransformer();
        double[] doubleArray50 = new double[] { (-1L), 'a', 1L, 10 };
        org.apache.commons.math.transform.FastFourierTransformer.verifyDataSet(doubleArray50);
        org.apache.commons.math.complex.Complex[] complexArray52 = fastFourierTransformer45.transform2(doubleArray50);
        org.apache.commons.math.complex.Complex[] complexArray54 = org.apache.commons.math.transform.FastFourierTransformer.scaleArray(complexArray52, (double) 'a');
        org.apache.commons.math.transform.FastFourierTransformer.verifyDataSet((java.lang.Object[]) complexArray52);
        org.apache.commons.math.complex.Complex[] complexArray56 = fastFourierTransformer44.inversetransform(complexArray52);
        org.apache.commons.math.transform.FastFourierTransformer fastFourierTransformer57 = new org.apache.commons.math.transform.FastFourierTransformer();
        double[] doubleArray62 = new double[] { (-1L), 'a', 1L, 10 };
        org.apache.commons.math.transform.FastFourierTransformer.verifyDataSet(doubleArray62);
        org.apache.commons.math.complex.Complex[] complexArray64 = fastFourierTransformer57.transform2(doubleArray62);
        org.apache.commons.math.complex.Complex[] complexArray66 = org.apache.commons.math.transform.FastFourierTransformer.scaleArray(complexArray64, (double) 'a');
        org.apache.commons.math.transform.FastFourierTransformer.verifyDataSet((java.lang.Object[]) complexArray64);
        org.apache.commons.math.complex.Complex[] complexArray69 = org.apache.commons.math.transform.FastFourierTransformer.scaleArray(complexArray64, (double) 1L);
        org.apache.commons.math.complex.Complex[] complexArray71 = org.apache.commons.math.transform.FastFourierTransformer.scaleArray(complexArray64, (double) 1);
        org.apache.commons.math.complex.Complex[] complexArray72 = fastFourierTransformer44.transform(complexArray64);
        org.apache.commons.math.complex.Complex[] complexArray73 = fastFourierTransformer13.inversetransform2(complexArray72);
        org.apache.commons.math.complex.Complex[] complexArray74 = fastFourierTransformer0.inversetransform(complexArray73);
        org.apache.commons.math.transform.FastFourierTransformer fastFourierTransformer75 = new org.apache.commons.math.transform.FastFourierTransformer();
        double[] doubleArray80 = new double[] { (-1L), 'a', 1L, 10 };
        org.apache.commons.math.transform.FastFourierTransformer.verifyDataSet(doubleArray80);
        double[] doubleArray83 = org.apache.commons.math.transform.FastFourierTransformer.scaleArray(doubleArray80, (double) 10.0f);
        org.apache.commons.math.transform.FastFourierTransformer.verifyDataSet(doubleArray83);
        org.apache.commons.math.complex.Complex[] complexArray85 = fastFourierTransformer75.inversetransform(doubleArray83);
        org.apache.commons.math.transform.FastFourierTransformer.verifyDataSet((java.lang.Object[]) complexArray85);
        org.apache.commons.math.complex.Complex[] complexArray88 = org.apache.commons.math.transform.FastFourierTransformer.scaleArray(complexArray85, (double) (byte) 100);
        org.apache.commons.math.complex.Complex[] complexArray89 = fastFourierTransformer0.transform2(complexArray88);
        java.lang.Class<?> wildcardClass90 = complexArray89.getClass();
        org.junit.Assert.assertNotNull(doubleArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray6), "[-10.0, 970.0, 10.0, 100.0]");
        org.junit.Assert.assertNotNull(doubleArray9);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray9), "[-10.0, 970.0, 10.0, 100.0]");
        org.junit.Assert.assertNotNull(complexArray11);
        org.junit.Assert.assertNotNull(complexArray12);
        org.junit.Assert.assertNotNull(doubleArray18);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray18), "[-1.0, 97.0, 1.0, 10.0]");
        org.junit.Assert.assertNotNull(complexArray20);
        org.junit.Assert.assertNotNull(doubleArray26);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray26), "[-1.0, 97.0, 1.0, 10.0]");
        org.junit.Assert.assertNotNull(complexArray28);
        org.junit.Assert.assertNotNull(complexArray30);
        org.junit.Assert.assertNotNull(complexArray33);
        org.junit.Assert.assertNotNull(complexArray34);
        org.junit.Assert.assertNotNull(doubleArray39);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray39), "[-10.0, 970.0, 10.0, 100.0]");
        org.junit.Assert.assertNotNull(doubleArray42);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray42), "[-10.0, 970.0, 10.0, 100.0]");
        org.junit.Assert.assertNotNull(complexArray43);
        org.junit.Assert.assertNotNull(doubleArray50);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray50), "[-1.0, 97.0, 1.0, 10.0]");
        org.junit.Assert.assertNotNull(complexArray52);
        org.junit.Assert.assertNotNull(complexArray54);
        org.junit.Assert.assertNotNull(complexArray56);
        org.junit.Assert.assertNotNull(doubleArray62);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray62), "[-1.0, 97.0, 1.0, 10.0]");
        org.junit.Assert.assertNotNull(complexArray64);
        org.junit.Assert.assertNotNull(complexArray66);
        org.junit.Assert.assertNotNull(complexArray69);
        org.junit.Assert.assertNotNull(complexArray71);
        org.junit.Assert.assertNotNull(complexArray72);
        org.junit.Assert.assertNotNull(complexArray73);
        org.junit.Assert.assertNotNull(complexArray74);
        org.junit.Assert.assertNotNull(doubleArray80);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray80), "[-10.0, 970.0, 10.0, 100.0]");
        org.junit.Assert.assertNotNull(doubleArray83);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray83), "[-10.0, 970.0, 10.0, 100.0]");
        org.junit.Assert.assertNotNull(complexArray85);
        org.junit.Assert.assertNotNull(complexArray88);
        org.junit.Assert.assertNotNull(complexArray89);
        org.junit.Assert.assertNotNull(wildcardClass90);
    }

    @Test
    public void test3036() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3036");
        org.apache.commons.math.transform.FastFourierTransformer fastFourierTransformer0 = new org.apache.commons.math.transform.FastFourierTransformer();
        double[] doubleArray5 = new double[] { (-1L), 'a', 1L, 10 };
        org.apache.commons.math.transform.FastFourierTransformer.verifyDataSet(doubleArray5);
        double[] doubleArray8 = org.apache.commons.math.transform.FastFourierTransformer.scaleArray(doubleArray5, (double) 10.0f);
        org.apache.commons.math.transform.FastFourierTransformer.verifyDataSet(doubleArray8);
        org.apache.commons.math.complex.Complex[] complexArray10 = fastFourierTransformer0.transform(doubleArray8);
        org.apache.commons.math.transform.FastFourierTransformer fastFourierTransformer11 = new org.apache.commons.math.transform.FastFourierTransformer();
        double[] doubleArray16 = new double[] { (-1L), 'a', 1L, 10 };
        org.apache.commons.math.transform.FastFourierTransformer.verifyDataSet(doubleArray16);
        org.apache.commons.math.complex.Complex[] complexArray18 = fastFourierTransformer11.transform2(doubleArray16);
        double[] doubleArray20 = org.apache.commons.math.transform.FastFourierTransformer.scaleArray(doubleArray16, 100.0d);
        org.apache.commons.math.complex.Complex[] complexArray21 = fastFourierTransformer0.inversetransform(doubleArray16);
        org.apache.commons.math.transform.FastFourierTransformer fastFourierTransformer22 = new org.apache.commons.math.transform.FastFourierTransformer();
        double[] doubleArray27 = new double[] { (-1L), 'a', 1L, 10 };
        org.apache.commons.math.transform.FastFourierTransformer.verifyDataSet(doubleArray27);
        org.apache.commons.math.complex.Complex[] complexArray29 = fastFourierTransformer22.transform2(doubleArray27);
        org.apache.commons.math.transform.FastFourierTransformer fastFourierTransformer30 = new org.apache.commons.math.transform.FastFourierTransformer();
        double[] doubleArray35 = new double[] { (-1L), 'a', 1L, 10 };
        org.apache.commons.math.transform.FastFourierTransformer.verifyDataSet(doubleArray35);
        org.apache.commons.math.complex.Complex[] complexArray37 = fastFourierTransformer30.transform2(doubleArray35);
        org.apache.commons.math.complex.Complex[] complexArray39 = org.apache.commons.math.transform.FastFourierTransformer.scaleArray(complexArray37, (double) 'a');
        org.apache.commons.math.transform.FastFourierTransformer.verifyDataSet((java.lang.Object[]) complexArray37);
        org.apache.commons.math.complex.Complex[] complexArray42 = org.apache.commons.math.transform.FastFourierTransformer.scaleArray(complexArray37, (double) 1L);
        org.apache.commons.math.complex.Complex[] complexArray43 = fastFourierTransformer22.transform2(complexArray42);
        double[] doubleArray48 = new double[] { (-1L), 'a', 1L, 10 };
        org.apache.commons.math.transform.FastFourierTransformer.verifyDataSet(doubleArray48);
        double[] doubleArray51 = org.apache.commons.math.transform.FastFourierTransformer.scaleArray(doubleArray48, (double) 10.0f);
        org.apache.commons.math.complex.Complex[] complexArray52 = fastFourierTransformer22.transform(doubleArray48);
        org.apache.commons.math.transform.FastFourierTransformer fastFourierTransformer53 = new org.apache.commons.math.transform.FastFourierTransformer();
        double[] doubleArray58 = new double[] { (-1L), 'a', 1L, 10 };
        org.apache.commons.math.transform.FastFourierTransformer.verifyDataSet(doubleArray58);
        org.apache.commons.math.complex.Complex[] complexArray60 = fastFourierTransformer53.transform2(doubleArray58);
        double[] doubleArray62 = org.apache.commons.math.transform.FastFourierTransformer.scaleArray(doubleArray58, (double) (short) -1);
        org.apache.commons.math.complex.Complex[] complexArray63 = fastFourierTransformer22.inversetransform(doubleArray58);
        org.apache.commons.math.complex.Complex[] complexArray64 = fastFourierTransformer0.transform2(complexArray63);
        org.apache.commons.math.complex.Complex[] complexArray66 = org.apache.commons.math.transform.FastFourierTransformer.scaleArray(complexArray64, (double) (short) 10);
        java.lang.Class<?> wildcardClass67 = complexArray64.getClass();
        org.junit.Assert.assertNotNull(doubleArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray5), "[-10.0, 970.0, 10.0, 100.0]");
        org.junit.Assert.assertNotNull(doubleArray8);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray8), "[-10.0, 970.0, 10.0, 100.0]");
        org.junit.Assert.assertNotNull(complexArray10);
        org.junit.Assert.assertNotNull(doubleArray16);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray16), "[-100.0, 9700.0, 100.0, 1000.0]");
        org.junit.Assert.assertNotNull(complexArray18);
        org.junit.Assert.assertNotNull(doubleArray20);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray20), "[-100.0, 9700.0, 100.0, 1000.0]");
        org.junit.Assert.assertNotNull(complexArray21);
        org.junit.Assert.assertNotNull(doubleArray27);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray27), "[-1.0, 97.0, 1.0, 10.0]");
        org.junit.Assert.assertNotNull(complexArray29);
        org.junit.Assert.assertNotNull(doubleArray35);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray35), "[-1.0, 97.0, 1.0, 10.0]");
        org.junit.Assert.assertNotNull(complexArray37);
        org.junit.Assert.assertNotNull(complexArray39);
        org.junit.Assert.assertNotNull(complexArray42);
        org.junit.Assert.assertNotNull(complexArray43);
        org.junit.Assert.assertNotNull(doubleArray48);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray48), "[-10.0, 970.0, 10.0, 100.0]");
        org.junit.Assert.assertNotNull(doubleArray51);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray51), "[-10.0, 970.0, 10.0, 100.0]");
        org.junit.Assert.assertNotNull(complexArray52);
        org.junit.Assert.assertNotNull(doubleArray58);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray58), "[1.0, -97.0, -1.0, -10.0]");
        org.junit.Assert.assertNotNull(complexArray60);
        org.junit.Assert.assertNotNull(doubleArray62);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray62), "[1.0, -97.0, -1.0, -10.0]");
        org.junit.Assert.assertNotNull(complexArray63);
        org.junit.Assert.assertNotNull(complexArray64);
        org.junit.Assert.assertNotNull(complexArray66);
        org.junit.Assert.assertNotNull(wildcardClass67);
    }

    @Test
    public void test3037() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3037");
        double[] doubleArray0 = null;
        // The following exception was thrown during execution in test generation
        try {
            double[] doubleArray2 = org.apache.commons.math.transform.FastFourierTransformer.scaleArray(doubleArray0, (double) 100.0f);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test3038() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3038");
        org.apache.commons.math.transform.FastFourierTransformer fastFourierTransformer0 = new org.apache.commons.math.transform.FastFourierTransformer();
        org.apache.commons.math.transform.FastFourierTransformer fastFourierTransformer1 = new org.apache.commons.math.transform.FastFourierTransformer();
        double[] doubleArray6 = new double[] { (-1L), 'a', 1L, 10 };
        org.apache.commons.math.transform.FastFourierTransformer.verifyDataSet(doubleArray6);
        org.apache.commons.math.complex.Complex[] complexArray8 = fastFourierTransformer1.transform2(doubleArray6);
        org.apache.commons.math.complex.Complex[] complexArray10 = org.apache.commons.math.transform.FastFourierTransformer.scaleArray(complexArray8, (double) 'a');
        org.apache.commons.math.transform.FastFourierTransformer.verifyDataSet((java.lang.Object[]) complexArray8);
        org.apache.commons.math.complex.Complex[] complexArray12 = fastFourierTransformer0.inversetransform(complexArray8);
        org.apache.commons.math.transform.FastFourierTransformer fastFourierTransformer13 = new org.apache.commons.math.transform.FastFourierTransformer();
        double[] doubleArray18 = new double[] { (-1L), 'a', 1L, 10 };
        org.apache.commons.math.transform.FastFourierTransformer.verifyDataSet(doubleArray18);
        org.apache.commons.math.complex.Complex[] complexArray20 = fastFourierTransformer13.transform2(doubleArray18);
        double[] doubleArray22 = org.apache.commons.math.transform.FastFourierTransformer.scaleArray(doubleArray18, 100.0d);
        org.apache.commons.math.complex.Complex[] complexArray23 = fastFourierTransformer0.inversetransform(doubleArray18);
        double[] doubleArray28 = new double[] { (-1L), 'a', 1L, 10 };
        org.apache.commons.math.transform.FastFourierTransformer.verifyDataSet(doubleArray28);
        double[] doubleArray31 = org.apache.commons.math.transform.FastFourierTransformer.scaleArray(doubleArray28, (double) 10.0f);
        org.apache.commons.math.transform.FastFourierTransformer.verifyDataSet(doubleArray31);
        org.apache.commons.math.transform.FastFourierTransformer.verifyDataSet(doubleArray31);
        org.apache.commons.math.transform.FastFourierTransformer.verifyDataSet(doubleArray31);
        double[] doubleArray36 = org.apache.commons.math.transform.FastFourierTransformer.scaleArray(doubleArray31, (double) (-1L));
        org.apache.commons.math.complex.Complex[] complexArray37 = fastFourierTransformer0.transform2(doubleArray36);
        org.apache.commons.math.transform.FastFourierTransformer fastFourierTransformer38 = new org.apache.commons.math.transform.FastFourierTransformer();
        org.apache.commons.math.transform.FastFourierTransformer fastFourierTransformer39 = new org.apache.commons.math.transform.FastFourierTransformer();
        double[] doubleArray44 = new double[] { (-1L), 'a', 1L, 10 };
        org.apache.commons.math.transform.FastFourierTransformer.verifyDataSet(doubleArray44);
        org.apache.commons.math.complex.Complex[] complexArray46 = fastFourierTransformer39.transform2(doubleArray44);
        org.apache.commons.math.complex.Complex[] complexArray48 = org.apache.commons.math.transform.FastFourierTransformer.scaleArray(complexArray46, (double) 'a');
        org.apache.commons.math.transform.FastFourierTransformer.verifyDataSet((java.lang.Object[]) complexArray46);
        org.apache.commons.math.complex.Complex[] complexArray50 = fastFourierTransformer38.inversetransform(complexArray46);
        double[] doubleArray55 = new double[] { (-1L), 'a', 1L, 10 };
        org.apache.commons.math.transform.FastFourierTransformer.verifyDataSet(doubleArray55);
        double[] doubleArray58 = org.apache.commons.math.transform.FastFourierTransformer.scaleArray(doubleArray55, (double) 10.0f);
        double[] doubleArray60 = org.apache.commons.math.transform.FastFourierTransformer.scaleArray(doubleArray58, (double) 10L);
        org.apache.commons.math.complex.Complex[] complexArray61 = fastFourierTransformer38.transform(doubleArray58);
        org.apache.commons.math.complex.Complex[] complexArray62 = fastFourierTransformer0.transform(complexArray61);
        org.apache.commons.math.transform.FastFourierTransformer fastFourierTransformer63 = new org.apache.commons.math.transform.FastFourierTransformer();
        double[] doubleArray68 = new double[] { (-1L), 'a', 1L, 10 };
        org.apache.commons.math.transform.FastFourierTransformer.verifyDataSet(doubleArray68);
        org.apache.commons.math.complex.Complex[] complexArray70 = fastFourierTransformer63.transform2(doubleArray68);
        org.apache.commons.math.complex.Complex[] complexArray72 = org.apache.commons.math.transform.FastFourierTransformer.scaleArray(complexArray70, (double) 'a');
        org.apache.commons.math.transform.FastFourierTransformer.verifyDataSet((java.lang.Object[]) complexArray70);
        org.apache.commons.math.complex.Complex[] complexArray75 = org.apache.commons.math.transform.FastFourierTransformer.scaleArray(complexArray70, (double) 1L);
        org.apache.commons.math.complex.Complex[] complexArray77 = org.apache.commons.math.transform.FastFourierTransformer.scaleArray(complexArray70, (double) 1);
        org.apache.commons.math.transform.FastFourierTransformer.verifyDataSet((java.lang.Object[]) complexArray70);
        org.apache.commons.math.transform.FastFourierTransformer.verifyDataSet((java.lang.Object[]) complexArray70);
        org.apache.commons.math.complex.Complex[] complexArray80 = fastFourierTransformer0.inversetransform2(complexArray70);
        java.lang.Class<?> wildcardClass81 = complexArray80.getClass();
        org.junit.Assert.assertNotNull(doubleArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray6), "[-1.0, 97.0, 1.0, 10.0]");
        org.junit.Assert.assertNotNull(complexArray8);
        org.junit.Assert.assertNotNull(complexArray10);
        org.junit.Assert.assertNotNull(complexArray12);
        org.junit.Assert.assertNotNull(doubleArray18);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray18), "[-100.0, 9700.0, 100.0, 1000.0]");
        org.junit.Assert.assertNotNull(complexArray20);
        org.junit.Assert.assertNotNull(doubleArray22);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray22), "[-100.0, 9700.0, 100.0, 1000.0]");
        org.junit.Assert.assertNotNull(complexArray23);
        org.junit.Assert.assertNotNull(doubleArray28);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray28), "[10.0, -970.0, -10.0, -100.0]");
        org.junit.Assert.assertNotNull(doubleArray31);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray31), "[10.0, -970.0, -10.0, -100.0]");
        org.junit.Assert.assertNotNull(doubleArray36);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray36), "[10.0, -970.0, -10.0, -100.0]");
        org.junit.Assert.assertNotNull(complexArray37);
        org.junit.Assert.assertNotNull(doubleArray44);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray44), "[-1.0, 97.0, 1.0, 10.0]");
        org.junit.Assert.assertNotNull(complexArray46);
        org.junit.Assert.assertNotNull(complexArray48);
        org.junit.Assert.assertNotNull(complexArray50);
        org.junit.Assert.assertNotNull(doubleArray55);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray55), "[-100.0, 9700.0, 100.0, 1000.0]");
        org.junit.Assert.assertNotNull(doubleArray58);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray58), "[-100.0, 9700.0, 100.0, 1000.0]");
        org.junit.Assert.assertNotNull(doubleArray60);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray60), "[-100.0, 9700.0, 100.0, 1000.0]");
        org.junit.Assert.assertNotNull(complexArray61);
        org.junit.Assert.assertNotNull(complexArray62);
        org.junit.Assert.assertNotNull(doubleArray68);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray68), "[-1.0, 97.0, 1.0, 10.0]");
        org.junit.Assert.assertNotNull(complexArray70);
        org.junit.Assert.assertNotNull(complexArray72);
        org.junit.Assert.assertNotNull(complexArray75);
        org.junit.Assert.assertNotNull(complexArray77);
        org.junit.Assert.assertNotNull(complexArray80);
        org.junit.Assert.assertNotNull(wildcardClass81);
    }

    @Test
    public void test3039() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3039");
        org.apache.commons.math.transform.FastFourierTransformer.verifyInterval((double) 10, (double) ' ');
    }

    @Test
    public void test3040() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3040");
        org.apache.commons.math.transform.FastFourierTransformer fastFourierTransformer0 = new org.apache.commons.math.transform.FastFourierTransformer();
        double[] doubleArray5 = new double[] { (-1L), 'a', 1L, 10 };
        org.apache.commons.math.transform.FastFourierTransformer.verifyDataSet(doubleArray5);
        double[] doubleArray8 = org.apache.commons.math.transform.FastFourierTransformer.scaleArray(doubleArray5, (double) 10.0f);
        org.apache.commons.math.transform.FastFourierTransformer.verifyDataSet(doubleArray8);
        org.apache.commons.math.complex.Complex[] complexArray10 = fastFourierTransformer0.transform(doubleArray8);
        org.apache.commons.math.transform.FastFourierTransformer fastFourierTransformer11 = new org.apache.commons.math.transform.FastFourierTransformer();
        double[] doubleArray16 = new double[] { (-1L), 'a', 1L, 10 };
        org.apache.commons.math.transform.FastFourierTransformer.verifyDataSet(doubleArray16);
        org.apache.commons.math.complex.Complex[] complexArray18 = fastFourierTransformer11.transform2(doubleArray16);
        org.apache.commons.math.complex.Complex[] complexArray20 = org.apache.commons.math.transform.FastFourierTransformer.scaleArray(complexArray18, (double) 'a');
        org.apache.commons.math.transform.FastFourierTransformer.verifyDataSet((java.lang.Object[]) complexArray18);
        org.apache.commons.math.complex.Complex[] complexArray23 = org.apache.commons.math.transform.FastFourierTransformer.scaleArray(complexArray18, (double) 1L);
        org.apache.commons.math.complex.Complex[] complexArray25 = org.apache.commons.math.transform.FastFourierTransformer.scaleArray(complexArray18, (double) 1);
        org.apache.commons.math.complex.Complex[] complexArray26 = fastFourierTransformer0.inversetransform2(complexArray25);
        double[] doubleArray31 = new double[] { (-1L), 'a', 1L, 10 };
        org.apache.commons.math.transform.FastFourierTransformer.verifyDataSet(doubleArray31);
        double[] doubleArray34 = org.apache.commons.math.transform.FastFourierTransformer.scaleArray(doubleArray31, (double) 10.0f);
        double[] doubleArray36 = org.apache.commons.math.transform.FastFourierTransformer.scaleArray(doubleArray34, (double) 10L);
        org.apache.commons.math.complex.Complex[] complexArray37 = fastFourierTransformer0.transform(doubleArray34);
        org.apache.commons.math.transform.FastFourierTransformer fastFourierTransformer38 = new org.apache.commons.math.transform.FastFourierTransformer();
        double[] doubleArray43 = new double[] { (-1L), 'a', 1L, 10 };
        org.apache.commons.math.transform.FastFourierTransformer.verifyDataSet(doubleArray43);
        org.apache.commons.math.complex.Complex[] complexArray45 = fastFourierTransformer38.transform2(doubleArray43);
        org.apache.commons.math.transform.FastFourierTransformer fastFourierTransformer46 = new org.apache.commons.math.transform.FastFourierTransformer();
        double[] doubleArray51 = new double[] { (-1L), 'a', 1L, 10 };
        org.apache.commons.math.transform.FastFourierTransformer.verifyDataSet(doubleArray51);
        org.apache.commons.math.complex.Complex[] complexArray53 = fastFourierTransformer46.transform2(doubleArray51);
        org.apache.commons.math.complex.Complex[] complexArray55 = org.apache.commons.math.transform.FastFourierTransformer.scaleArray(complexArray53, (double) 'a');
        org.apache.commons.math.transform.FastFourierTransformer.verifyDataSet((java.lang.Object[]) complexArray53);
        org.apache.commons.math.complex.Complex[] complexArray58 = org.apache.commons.math.transform.FastFourierTransformer.scaleArray(complexArray53, (double) 1L);
        org.apache.commons.math.complex.Complex[] complexArray59 = fastFourierTransformer38.transform2(complexArray58);
        org.apache.commons.math.transform.FastFourierTransformer fastFourierTransformer60 = new org.apache.commons.math.transform.FastFourierTransformer();
        double[] doubleArray65 = new double[] { (-1L), 'a', 1L, 10 };
        org.apache.commons.math.transform.FastFourierTransformer.verifyDataSet(doubleArray65);
        double[] doubleArray68 = org.apache.commons.math.transform.FastFourierTransformer.scaleArray(doubleArray65, (double) 10.0f);
        org.apache.commons.math.transform.FastFourierTransformer.verifyDataSet(doubleArray68);
        org.apache.commons.math.complex.Complex[] complexArray70 = fastFourierTransformer60.transform(doubleArray68);
        org.apache.commons.math.complex.Complex[] complexArray71 = fastFourierTransformer38.transform(doubleArray68);
        double[] doubleArray76 = new double[] { (-1L), 'a', 1L, 10 };
        org.apache.commons.math.transform.FastFourierTransformer.verifyDataSet(doubleArray76);
        double[] doubleArray79 = org.apache.commons.math.transform.FastFourierTransformer.scaleArray(doubleArray76, (double) 10.0f);
        double[] doubleArray81 = org.apache.commons.math.transform.FastFourierTransformer.scaleArray(doubleArray79, (double) 10L);
        org.apache.commons.math.complex.Complex[] complexArray82 = fastFourierTransformer38.inversetransform(doubleArray81);
        org.apache.commons.math.complex.Complex[] complexArray83 = fastFourierTransformer0.inversetransform2(doubleArray81);
        org.apache.commons.math.transform.FastFourierTransformer fastFourierTransformer84 = new org.apache.commons.math.transform.FastFourierTransformer();
        double[] doubleArray89 = new double[] { (-1L), 'a', 1L, 10 };
        org.apache.commons.math.transform.FastFourierTransformer.verifyDataSet(doubleArray89);
        org.apache.commons.math.complex.Complex[] complexArray91 = fastFourierTransformer84.transform2(doubleArray89);
        org.apache.commons.math.complex.Complex[] complexArray92 = fastFourierTransformer0.transform(doubleArray89);
        org.junit.Assert.assertNotNull(doubleArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray5), "[-10.0, 970.0, 10.0, 100.0]");
        org.junit.Assert.assertNotNull(doubleArray8);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray8), "[-10.0, 970.0, 10.0, 100.0]");
        org.junit.Assert.assertNotNull(complexArray10);
        org.junit.Assert.assertNotNull(doubleArray16);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray16), "[-1.0, 97.0, 1.0, 10.0]");
        org.junit.Assert.assertNotNull(complexArray18);
        org.junit.Assert.assertNotNull(complexArray20);
        org.junit.Assert.assertNotNull(complexArray23);
        org.junit.Assert.assertNotNull(complexArray25);
        org.junit.Assert.assertNotNull(complexArray26);
        org.junit.Assert.assertNotNull(doubleArray31);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray31), "[-100.0, 9700.0, 100.0, 1000.0]");
        org.junit.Assert.assertNotNull(doubleArray34);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray34), "[-100.0, 9700.0, 100.0, 1000.0]");
        org.junit.Assert.assertNotNull(doubleArray36);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray36), "[-100.0, 9700.0, 100.0, 1000.0]");
        org.junit.Assert.assertNotNull(complexArray37);
        org.junit.Assert.assertNotNull(doubleArray43);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray43), "[-1.0, 97.0, 1.0, 10.0]");
        org.junit.Assert.assertNotNull(complexArray45);
        org.junit.Assert.assertNotNull(doubleArray51);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray51), "[-1.0, 97.0, 1.0, 10.0]");
        org.junit.Assert.assertNotNull(complexArray53);
        org.junit.Assert.assertNotNull(complexArray55);
        org.junit.Assert.assertNotNull(complexArray58);
        org.junit.Assert.assertNotNull(complexArray59);
        org.junit.Assert.assertNotNull(doubleArray65);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray65), "[-10.0, 970.0, 10.0, 100.0]");
        org.junit.Assert.assertNotNull(doubleArray68);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray68), "[-10.0, 970.0, 10.0, 100.0]");
        org.junit.Assert.assertNotNull(complexArray70);
        org.junit.Assert.assertNotNull(complexArray71);
        org.junit.Assert.assertNotNull(doubleArray76);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray76), "[-100.0, 9700.0, 100.0, 1000.0]");
        org.junit.Assert.assertNotNull(doubleArray79);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray79), "[-100.0, 9700.0, 100.0, 1000.0]");
        org.junit.Assert.assertNotNull(doubleArray81);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray81), "[-100.0, 9700.0, 100.0, 1000.0]");
        org.junit.Assert.assertNotNull(complexArray82);
        org.junit.Assert.assertNotNull(complexArray83);
        org.junit.Assert.assertNotNull(doubleArray89);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray89), "[-1.0, 97.0, 1.0, 10.0]");
        org.junit.Assert.assertNotNull(complexArray91);
        org.junit.Assert.assertNotNull(complexArray92);
    }

    @Test
    public void test3041() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3041");
        org.apache.commons.math.transform.FastFourierTransformer fastFourierTransformer0 = new org.apache.commons.math.transform.FastFourierTransformer();
        org.apache.commons.math.transform.FastFourierTransformer fastFourierTransformer1 = new org.apache.commons.math.transform.FastFourierTransformer();
        double[] doubleArray6 = new double[] { (-1L), 'a', 1L, 10 };
        org.apache.commons.math.transform.FastFourierTransformer.verifyDataSet(doubleArray6);
        org.apache.commons.math.complex.Complex[] complexArray8 = fastFourierTransformer1.transform2(doubleArray6);
        org.apache.commons.math.complex.Complex[] complexArray10 = org.apache.commons.math.transform.FastFourierTransformer.scaleArray(complexArray8, (double) 'a');
        org.apache.commons.math.transform.FastFourierTransformer.verifyDataSet((java.lang.Object[]) complexArray8);
        org.apache.commons.math.complex.Complex[] complexArray12 = fastFourierTransformer0.inversetransform(complexArray8);
        org.apache.commons.math.transform.FastFourierTransformer fastFourierTransformer13 = new org.apache.commons.math.transform.FastFourierTransformer();
        double[] doubleArray18 = new double[] { (-1L), 'a', 1L, 10 };
        org.apache.commons.math.transform.FastFourierTransformer.verifyDataSet(doubleArray18);
        org.apache.commons.math.complex.Complex[] complexArray20 = fastFourierTransformer13.transform2(doubleArray18);
        org.apache.commons.math.transform.FastFourierTransformer fastFourierTransformer21 = new org.apache.commons.math.transform.FastFourierTransformer();
        double[] doubleArray26 = new double[] { (-1L), 'a', 1L, 10 };
        org.apache.commons.math.transform.FastFourierTransformer.verifyDataSet(doubleArray26);
        org.apache.commons.math.complex.Complex[] complexArray28 = fastFourierTransformer21.transform2(doubleArray26);
        org.apache.commons.math.complex.Complex[] complexArray30 = org.apache.commons.math.transform.FastFourierTransformer.scaleArray(complexArray28, (double) 'a');
        org.apache.commons.math.transform.FastFourierTransformer.verifyDataSet((java.lang.Object[]) complexArray28);
        org.apache.commons.math.complex.Complex[] complexArray33 = org.apache.commons.math.transform.FastFourierTransformer.scaleArray(complexArray28, (double) 1L);
        org.apache.commons.math.complex.Complex[] complexArray34 = fastFourierTransformer13.transform2(complexArray33);
        double[] doubleArray39 = new double[] { (-1L), 'a', 1L, 10 };
        org.apache.commons.math.transform.FastFourierTransformer.verifyDataSet(doubleArray39);
        double[] doubleArray42 = org.apache.commons.math.transform.FastFourierTransformer.scaleArray(doubleArray39, (double) 10.0f);
        org.apache.commons.math.complex.Complex[] complexArray43 = fastFourierTransformer13.transform(doubleArray39);
        org.apache.commons.math.transform.FastFourierTransformer fastFourierTransformer44 = new org.apache.commons.math.transform.FastFourierTransformer();
        org.apache.commons.math.transform.FastFourierTransformer fastFourierTransformer45 = new org.apache.commons.math.transform.FastFourierTransformer();
        double[] doubleArray50 = new double[] { (-1L), 'a', 1L, 10 };
        org.apache.commons.math.transform.FastFourierTransformer.verifyDataSet(doubleArray50);
        org.apache.commons.math.complex.Complex[] complexArray52 = fastFourierTransformer45.transform2(doubleArray50);
        org.apache.commons.math.complex.Complex[] complexArray54 = org.apache.commons.math.transform.FastFourierTransformer.scaleArray(complexArray52, (double) 'a');
        org.apache.commons.math.transform.FastFourierTransformer.verifyDataSet((java.lang.Object[]) complexArray52);
        org.apache.commons.math.complex.Complex[] complexArray56 = fastFourierTransformer44.inversetransform(complexArray52);
        org.apache.commons.math.transform.FastFourierTransformer fastFourierTransformer57 = new org.apache.commons.math.transform.FastFourierTransformer();
        double[] doubleArray62 = new double[] { (-1L), 'a', 1L, 10 };
        org.apache.commons.math.transform.FastFourierTransformer.verifyDataSet(doubleArray62);
        org.apache.commons.math.complex.Complex[] complexArray64 = fastFourierTransformer57.transform2(doubleArray62);
        org.apache.commons.math.complex.Complex[] complexArray66 = org.apache.commons.math.transform.FastFourierTransformer.scaleArray(complexArray64, (double) 'a');
        org.apache.commons.math.transform.FastFourierTransformer.verifyDataSet((java.lang.Object[]) complexArray64);
        org.apache.commons.math.complex.Complex[] complexArray69 = org.apache.commons.math.transform.FastFourierTransformer.scaleArray(complexArray64, (double) 1L);
        org.apache.commons.math.complex.Complex[] complexArray71 = org.apache.commons.math.transform.FastFourierTransformer.scaleArray(complexArray64, (double) 1);
        org.apache.commons.math.complex.Complex[] complexArray72 = fastFourierTransformer44.transform(complexArray64);
        org.apache.commons.math.complex.Complex[] complexArray73 = fastFourierTransformer13.inversetransform2(complexArray72);
        org.apache.commons.math.complex.Complex[] complexArray74 = fastFourierTransformer0.inversetransform(complexArray73);
        org.apache.commons.math.transform.FastFourierTransformer fastFourierTransformer75 = new org.apache.commons.math.transform.FastFourierTransformer();
        double[] doubleArray80 = new double[] { (-1L), 'a', 1L, 10 };
        org.apache.commons.math.transform.FastFourierTransformer.verifyDataSet(doubleArray80);
        double[] doubleArray83 = org.apache.commons.math.transform.FastFourierTransformer.scaleArray(doubleArray80, (double) 10.0f);
        org.apache.commons.math.transform.FastFourierTransformer.verifyDataSet(doubleArray83);
        org.apache.commons.math.complex.Complex[] complexArray85 = fastFourierTransformer75.transform(doubleArray83);
        org.apache.commons.math.transform.FastFourierTransformer.verifyDataSet((java.lang.Object[]) complexArray85);
        org.apache.commons.math.transform.FastFourierTransformer.verifyDataSet((java.lang.Object[]) complexArray85);
        org.apache.commons.math.transform.FastFourierTransformer.verifyDataSet((java.lang.Object[]) complexArray85);
        org.apache.commons.math.complex.Complex[] complexArray89 = fastFourierTransformer0.transform2(complexArray85);
        org.apache.commons.math.analysis.UnivariateRealFunction univariateRealFunction90 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math.complex.Complex[] complexArray94 = fastFourierTransformer0.inversetransform2(univariateRealFunction90, 100.0d, (double) (short) 1, (int) (short) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Endpoints do not specify an interval: [100.0, 1.0]");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(doubleArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray6), "[-1.0, 97.0, 1.0, 10.0]");
        org.junit.Assert.assertNotNull(complexArray8);
        org.junit.Assert.assertNotNull(complexArray10);
        org.junit.Assert.assertNotNull(complexArray12);
        org.junit.Assert.assertNotNull(doubleArray18);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray18), "[-1.0, 97.0, 1.0, 10.0]");
        org.junit.Assert.assertNotNull(complexArray20);
        org.junit.Assert.assertNotNull(doubleArray26);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray26), "[-1.0, 97.0, 1.0, 10.0]");
        org.junit.Assert.assertNotNull(complexArray28);
        org.junit.Assert.assertNotNull(complexArray30);
        org.junit.Assert.assertNotNull(complexArray33);
        org.junit.Assert.assertNotNull(complexArray34);
        org.junit.Assert.assertNotNull(doubleArray39);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray39), "[-10.0, 970.0, 10.0, 100.0]");
        org.junit.Assert.assertNotNull(doubleArray42);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray42), "[-10.0, 970.0, 10.0, 100.0]");
        org.junit.Assert.assertNotNull(complexArray43);
        org.junit.Assert.assertNotNull(doubleArray50);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray50), "[-1.0, 97.0, 1.0, 10.0]");
        org.junit.Assert.assertNotNull(complexArray52);
        org.junit.Assert.assertNotNull(complexArray54);
        org.junit.Assert.assertNotNull(complexArray56);
        org.junit.Assert.assertNotNull(doubleArray62);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray62), "[-1.0, 97.0, 1.0, 10.0]");
        org.junit.Assert.assertNotNull(complexArray64);
        org.junit.Assert.assertNotNull(complexArray66);
        org.junit.Assert.assertNotNull(complexArray69);
        org.junit.Assert.assertNotNull(complexArray71);
        org.junit.Assert.assertNotNull(complexArray72);
        org.junit.Assert.assertNotNull(complexArray73);
        org.junit.Assert.assertNotNull(complexArray74);
        org.junit.Assert.assertNotNull(doubleArray80);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray80), "[-10.0, 970.0, 10.0, 100.0]");
        org.junit.Assert.assertNotNull(doubleArray83);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray83), "[-10.0, 970.0, 10.0, 100.0]");
        org.junit.Assert.assertNotNull(complexArray85);
        org.junit.Assert.assertNotNull(complexArray89);
    }

    @Test
    public void test3042() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3042");
        org.apache.commons.math.transform.FastFourierTransformer fastFourierTransformer0 = new org.apache.commons.math.transform.FastFourierTransformer();
        org.apache.commons.math.transform.FastFourierTransformer fastFourierTransformer1 = new org.apache.commons.math.transform.FastFourierTransformer();
        double[] doubleArray6 = new double[] { (-1L), 'a', 1L, 10 };
        org.apache.commons.math.transform.FastFourierTransformer.verifyDataSet(doubleArray6);
        org.apache.commons.math.complex.Complex[] complexArray8 = fastFourierTransformer1.transform2(doubleArray6);
        org.apache.commons.math.complex.Complex[] complexArray10 = org.apache.commons.math.transform.FastFourierTransformer.scaleArray(complexArray8, (double) 'a');
        org.apache.commons.math.transform.FastFourierTransformer.verifyDataSet((java.lang.Object[]) complexArray8);
        org.apache.commons.math.complex.Complex[] complexArray12 = fastFourierTransformer0.inversetransform(complexArray8);
        org.apache.commons.math.transform.FastFourierTransformer fastFourierTransformer13 = new org.apache.commons.math.transform.FastFourierTransformer();
        double[] doubleArray18 = new double[] { (-1L), 'a', 1L, 10 };
        org.apache.commons.math.transform.FastFourierTransformer.verifyDataSet(doubleArray18);
        org.apache.commons.math.complex.Complex[] complexArray20 = fastFourierTransformer13.transform2(doubleArray18);
        double[] doubleArray22 = org.apache.commons.math.transform.FastFourierTransformer.scaleArray(doubleArray18, 100.0d);
        org.apache.commons.math.complex.Complex[] complexArray23 = fastFourierTransformer0.inversetransform(doubleArray18);
        org.apache.commons.math.transform.FastFourierTransformer fastFourierTransformer24 = new org.apache.commons.math.transform.FastFourierTransformer();
        double[] doubleArray29 = new double[] { (-1L), 'a', 1L, 10 };
        org.apache.commons.math.transform.FastFourierTransformer.verifyDataSet(doubleArray29);
        org.apache.commons.math.complex.Complex[] complexArray31 = fastFourierTransformer24.transform2(doubleArray29);
        org.apache.commons.math.transform.FastFourierTransformer fastFourierTransformer32 = new org.apache.commons.math.transform.FastFourierTransformer();
        double[] doubleArray37 = new double[] { (-1L), 'a', 1L, 10 };
        org.apache.commons.math.transform.FastFourierTransformer.verifyDataSet(doubleArray37);
        org.apache.commons.math.complex.Complex[] complexArray39 = fastFourierTransformer32.transform2(doubleArray37);
        org.apache.commons.math.transform.FastFourierTransformer fastFourierTransformer40 = new org.apache.commons.math.transform.FastFourierTransformer();
        double[] doubleArray45 = new double[] { (-1L), 'a', 1L, 10 };
        org.apache.commons.math.transform.FastFourierTransformer.verifyDataSet(doubleArray45);
        org.apache.commons.math.complex.Complex[] complexArray47 = fastFourierTransformer40.transform2(doubleArray45);
        org.apache.commons.math.complex.Complex[] complexArray49 = org.apache.commons.math.transform.FastFourierTransformer.scaleArray(complexArray47, (double) 'a');
        org.apache.commons.math.transform.FastFourierTransformer.verifyDataSet((java.lang.Object[]) complexArray47);
        org.apache.commons.math.complex.Complex[] complexArray52 = org.apache.commons.math.transform.FastFourierTransformer.scaleArray(complexArray47, (double) 1L);
        org.apache.commons.math.complex.Complex[] complexArray53 = fastFourierTransformer32.transform2(complexArray52);
        double[] doubleArray58 = new double[] { (-1L), 'a', 1L, 10 };
        org.apache.commons.math.transform.FastFourierTransformer.verifyDataSet(doubleArray58);
        double[] doubleArray61 = org.apache.commons.math.transform.FastFourierTransformer.scaleArray(doubleArray58, (double) 10.0f);
        org.apache.commons.math.complex.Complex[] complexArray62 = fastFourierTransformer32.transform(doubleArray58);
        org.apache.commons.math.complex.Complex[] complexArray63 = fastFourierTransformer24.transform(complexArray62);
        double[] doubleArray68 = new double[] { (-1L), 'a', 1L, 10 };
        org.apache.commons.math.transform.FastFourierTransformer.verifyDataSet(doubleArray68);
        double[] doubleArray71 = org.apache.commons.math.transform.FastFourierTransformer.scaleArray(doubleArray68, (double) 10.0f);
        double[] doubleArray73 = org.apache.commons.math.transform.FastFourierTransformer.scaleArray(doubleArray71, (double) 10L);
        org.apache.commons.math.complex.Complex[] complexArray74 = fastFourierTransformer24.transform2(doubleArray71);
        double[] doubleArray76 = org.apache.commons.math.transform.FastFourierTransformer.scaleArray(doubleArray71, 100.0d);
        org.apache.commons.math.complex.Complex[] complexArray77 = fastFourierTransformer0.transform2(doubleArray71);
        org.apache.commons.math.analysis.UnivariateRealFunction univariateRealFunction78 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math.complex.Complex[] complexArray82 = fastFourierTransformer0.inversetransform(univariateRealFunction78, (double) 10L, (-1.0d), (int) (short) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Number of samples not positive.");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(doubleArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray6), "[-1.0, 97.0, 1.0, 10.0]");
        org.junit.Assert.assertNotNull(complexArray8);
        org.junit.Assert.assertNotNull(complexArray10);
        org.junit.Assert.assertNotNull(complexArray12);
        org.junit.Assert.assertNotNull(doubleArray18);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray18), "[-100.0, 9700.0, 100.0, 1000.0]");
        org.junit.Assert.assertNotNull(complexArray20);
        org.junit.Assert.assertNotNull(doubleArray22);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray22), "[-100.0, 9700.0, 100.0, 1000.0]");
        org.junit.Assert.assertNotNull(complexArray23);
        org.junit.Assert.assertNotNull(doubleArray29);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray29), "[-1.0, 97.0, 1.0, 10.0]");
        org.junit.Assert.assertNotNull(complexArray31);
        org.junit.Assert.assertNotNull(doubleArray37);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray37), "[-1.0, 97.0, 1.0, 10.0]");
        org.junit.Assert.assertNotNull(complexArray39);
        org.junit.Assert.assertNotNull(doubleArray45);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray45), "[-1.0, 97.0, 1.0, 10.0]");
        org.junit.Assert.assertNotNull(complexArray47);
        org.junit.Assert.assertNotNull(complexArray49);
        org.junit.Assert.assertNotNull(complexArray52);
        org.junit.Assert.assertNotNull(complexArray53);
        org.junit.Assert.assertNotNull(doubleArray58);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray58), "[-10.0, 970.0, 10.0, 100.0]");
        org.junit.Assert.assertNotNull(doubleArray61);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray61), "[-10.0, 970.0, 10.0, 100.0]");
        org.junit.Assert.assertNotNull(complexArray62);
        org.junit.Assert.assertNotNull(complexArray63);
        org.junit.Assert.assertNotNull(doubleArray68);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray68), "[-10000.0, 970000.0, 10000.0, 100000.0]");
        org.junit.Assert.assertNotNull(doubleArray71);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray71), "[-10000.0, 970000.0, 10000.0, 100000.0]");
        org.junit.Assert.assertNotNull(doubleArray73);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray73), "[-10000.0, 970000.0, 10000.0, 100000.0]");
        org.junit.Assert.assertNotNull(complexArray74);
        org.junit.Assert.assertNotNull(doubleArray76);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray76), "[-10000.0, 970000.0, 10000.0, 100000.0]");
        org.junit.Assert.assertNotNull(complexArray77);
    }

    @Test
    public void test3043() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3043");
        org.apache.commons.math.transform.FastFourierTransformer fastFourierTransformer0 = new org.apache.commons.math.transform.FastFourierTransformer();
        double[] doubleArray5 = new double[] { (-1L), 'a', 1L, 10 };
        org.apache.commons.math.transform.FastFourierTransformer.verifyDataSet(doubleArray5);
        org.apache.commons.math.complex.Complex[] complexArray7 = fastFourierTransformer0.transform2(doubleArray5);
        org.apache.commons.math.transform.FastFourierTransformer fastFourierTransformer8 = new org.apache.commons.math.transform.FastFourierTransformer();
        double[] doubleArray13 = new double[] { (-1L), 'a', 1L, 10 };
        org.apache.commons.math.transform.FastFourierTransformer.verifyDataSet(doubleArray13);
        org.apache.commons.math.complex.Complex[] complexArray15 = fastFourierTransformer8.transform2(doubleArray13);
        org.apache.commons.math.transform.FastFourierTransformer fastFourierTransformer16 = new org.apache.commons.math.transform.FastFourierTransformer();
        double[] doubleArray21 = new double[] { (-1L), 'a', 1L, 10 };
        org.apache.commons.math.transform.FastFourierTransformer.verifyDataSet(doubleArray21);
        org.apache.commons.math.complex.Complex[] complexArray23 = fastFourierTransformer16.transform2(doubleArray21);
        org.apache.commons.math.complex.Complex[] complexArray25 = org.apache.commons.math.transform.FastFourierTransformer.scaleArray(complexArray23, (double) 'a');
        org.apache.commons.math.transform.FastFourierTransformer.verifyDataSet((java.lang.Object[]) complexArray23);
        org.apache.commons.math.complex.Complex[] complexArray28 = org.apache.commons.math.transform.FastFourierTransformer.scaleArray(complexArray23, (double) 1L);
        org.apache.commons.math.complex.Complex[] complexArray29 = fastFourierTransformer8.transform2(complexArray28);
        double[] doubleArray34 = new double[] { (-1L), 'a', 1L, 10 };
        org.apache.commons.math.transform.FastFourierTransformer.verifyDataSet(doubleArray34);
        double[] doubleArray37 = org.apache.commons.math.transform.FastFourierTransformer.scaleArray(doubleArray34, (double) 10.0f);
        org.apache.commons.math.complex.Complex[] complexArray38 = fastFourierTransformer8.transform(doubleArray34);
        org.apache.commons.math.complex.Complex[] complexArray39 = fastFourierTransformer0.transform(complexArray38);
        org.apache.commons.math.transform.FastFourierTransformer fastFourierTransformer40 = new org.apache.commons.math.transform.FastFourierTransformer();
        double[] doubleArray45 = new double[] { (-1L), 'a', 1L, 10 };
        org.apache.commons.math.transform.FastFourierTransformer.verifyDataSet(doubleArray45);
        org.apache.commons.math.complex.Complex[] complexArray47 = fastFourierTransformer40.transform2(doubleArray45);
        org.apache.commons.math.complex.Complex[] complexArray49 = org.apache.commons.math.transform.FastFourierTransformer.scaleArray(complexArray47, (double) 100L);
        org.apache.commons.math.complex.Complex[] complexArray51 = org.apache.commons.math.transform.FastFourierTransformer.scaleArray(complexArray49, (double) (byte) 100);
        org.apache.commons.math.complex.Complex[] complexArray52 = fastFourierTransformer0.inversetransform(complexArray49);
        org.apache.commons.math.transform.FastFourierTransformer fastFourierTransformer53 = new org.apache.commons.math.transform.FastFourierTransformer();
        double[] doubleArray58 = new double[] { (-1L), 'a', 1L, 10 };
        org.apache.commons.math.transform.FastFourierTransformer.verifyDataSet(doubleArray58);
        org.apache.commons.math.complex.Complex[] complexArray60 = fastFourierTransformer53.transform2(doubleArray58);
        org.apache.commons.math.complex.Complex[] complexArray62 = org.apache.commons.math.transform.FastFourierTransformer.scaleArray(complexArray60, (double) 'a');
        org.apache.commons.math.transform.FastFourierTransformer.verifyDataSet((java.lang.Object[]) complexArray60);
        org.apache.commons.math.complex.Complex[] complexArray65 = org.apache.commons.math.transform.FastFourierTransformer.scaleArray(complexArray60, (double) 1L);
        org.apache.commons.math.complex.Complex[] complexArray67 = org.apache.commons.math.transform.FastFourierTransformer.scaleArray(complexArray60, (double) 1);
        org.apache.commons.math.complex.Complex[] complexArray68 = fastFourierTransformer0.inversetransform(complexArray60);
        double[] doubleArray73 = new double[] { (-1L), 'a', 1L, 10 };
        org.apache.commons.math.transform.FastFourierTransformer.verifyDataSet(doubleArray73);
        double[] doubleArray76 = org.apache.commons.math.transform.FastFourierTransformer.scaleArray(doubleArray73, (double) 10.0f);
        org.apache.commons.math.transform.FastFourierTransformer.verifyDataSet(doubleArray76);
        double[] doubleArray79 = org.apache.commons.math.transform.FastFourierTransformer.scaleArray(doubleArray76, 10.0d);
        org.apache.commons.math.complex.Complex[] complexArray80 = fastFourierTransformer0.transform2(doubleArray79);
        org.apache.commons.math.analysis.UnivariateRealFunction univariateRealFunction81 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math.complex.Complex[] complexArray85 = fastFourierTransformer0.transform2(univariateRealFunction81, (double) 100.0f, 100.0d, (int) (short) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Endpoints do not specify an interval: [100.0, 100.0]");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(doubleArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray5), "[-1.0, 97.0, 1.0, 10.0]");
        org.junit.Assert.assertNotNull(complexArray7);
        org.junit.Assert.assertNotNull(doubleArray13);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray13), "[-1.0, 97.0, 1.0, 10.0]");
        org.junit.Assert.assertNotNull(complexArray15);
        org.junit.Assert.assertNotNull(doubleArray21);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray21), "[-1.0, 97.0, 1.0, 10.0]");
        org.junit.Assert.assertNotNull(complexArray23);
        org.junit.Assert.assertNotNull(complexArray25);
        org.junit.Assert.assertNotNull(complexArray28);
        org.junit.Assert.assertNotNull(complexArray29);
        org.junit.Assert.assertNotNull(doubleArray34);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray34), "[-10.0, 970.0, 10.0, 100.0]");
        org.junit.Assert.assertNotNull(doubleArray37);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray37), "[-10.0, 970.0, 10.0, 100.0]");
        org.junit.Assert.assertNotNull(complexArray38);
        org.junit.Assert.assertNotNull(complexArray39);
        org.junit.Assert.assertNotNull(doubleArray45);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray45), "[-1.0, 97.0, 1.0, 10.0]");
        org.junit.Assert.assertNotNull(complexArray47);
        org.junit.Assert.assertNotNull(complexArray49);
        org.junit.Assert.assertNotNull(complexArray51);
        org.junit.Assert.assertNotNull(complexArray52);
        org.junit.Assert.assertNotNull(doubleArray58);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray58), "[-1.0, 97.0, 1.0, 10.0]");
        org.junit.Assert.assertNotNull(complexArray60);
        org.junit.Assert.assertNotNull(complexArray62);
        org.junit.Assert.assertNotNull(complexArray65);
        org.junit.Assert.assertNotNull(complexArray67);
        org.junit.Assert.assertNotNull(complexArray68);
        org.junit.Assert.assertNotNull(doubleArray73);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray73), "[-100.0, 9700.0, 100.0, 1000.0]");
        org.junit.Assert.assertNotNull(doubleArray76);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray76), "[-100.0, 9700.0, 100.0, 1000.0]");
        org.junit.Assert.assertNotNull(doubleArray79);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray79), "[-100.0, 9700.0, 100.0, 1000.0]");
        org.junit.Assert.assertNotNull(complexArray80);
    }

    @Test
    public void test3044() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3044");
        org.apache.commons.math.transform.FastFourierTransformer fastFourierTransformer0 = new org.apache.commons.math.transform.FastFourierTransformer();
        double[] doubleArray5 = new double[] { (-1L), 'a', 1L, 10 };
        org.apache.commons.math.transform.FastFourierTransformer.verifyDataSet(doubleArray5);
        double[] doubleArray8 = org.apache.commons.math.transform.FastFourierTransformer.scaleArray(doubleArray5, (double) 10.0f);
        org.apache.commons.math.transform.FastFourierTransformer.verifyDataSet(doubleArray8);
        org.apache.commons.math.complex.Complex[] complexArray10 = fastFourierTransformer0.transform(doubleArray8);
        org.apache.commons.math.transform.FastFourierTransformer fastFourierTransformer11 = new org.apache.commons.math.transform.FastFourierTransformer();
        double[] doubleArray16 = new double[] { (-1L), 'a', 1L, 10 };
        org.apache.commons.math.transform.FastFourierTransformer.verifyDataSet(doubleArray16);
        org.apache.commons.math.complex.Complex[] complexArray18 = fastFourierTransformer11.transform2(doubleArray16);
        org.apache.commons.math.complex.Complex[] complexArray20 = org.apache.commons.math.transform.FastFourierTransformer.scaleArray(complexArray18, (double) 'a');
        org.apache.commons.math.transform.FastFourierTransformer.verifyDataSet((java.lang.Object[]) complexArray18);
        org.apache.commons.math.complex.Complex[] complexArray23 = org.apache.commons.math.transform.FastFourierTransformer.scaleArray(complexArray18, (double) 1L);
        org.apache.commons.math.complex.Complex[] complexArray25 = org.apache.commons.math.transform.FastFourierTransformer.scaleArray(complexArray18, (double) 1);
        org.apache.commons.math.complex.Complex[] complexArray26 = fastFourierTransformer0.inversetransform2(complexArray25);
        double[] doubleArray31 = new double[] { (-1L), 'a', 1L, 10 };
        org.apache.commons.math.transform.FastFourierTransformer.verifyDataSet(doubleArray31);
        double[] doubleArray34 = org.apache.commons.math.transform.FastFourierTransformer.scaleArray(doubleArray31, (double) 10.0f);
        double[] doubleArray36 = org.apache.commons.math.transform.FastFourierTransformer.scaleArray(doubleArray34, (double) 10L);
        org.apache.commons.math.complex.Complex[] complexArray37 = fastFourierTransformer0.transform(doubleArray34);
        org.apache.commons.math.transform.FastFourierTransformer fastFourierTransformer38 = new org.apache.commons.math.transform.FastFourierTransformer();
        double[] doubleArray43 = new double[] { (-1L), 'a', 1L, 10 };
        org.apache.commons.math.transform.FastFourierTransformer.verifyDataSet(doubleArray43);
        org.apache.commons.math.complex.Complex[] complexArray45 = fastFourierTransformer38.transform2(doubleArray43);
        org.apache.commons.math.transform.FastFourierTransformer fastFourierTransformer46 = new org.apache.commons.math.transform.FastFourierTransformer();
        double[] doubleArray51 = new double[] { (-1L), 'a', 1L, 10 };
        org.apache.commons.math.transform.FastFourierTransformer.verifyDataSet(doubleArray51);
        org.apache.commons.math.complex.Complex[] complexArray53 = fastFourierTransformer46.transform2(doubleArray51);
        org.apache.commons.math.complex.Complex[] complexArray55 = org.apache.commons.math.transform.FastFourierTransformer.scaleArray(complexArray53, (double) 'a');
        org.apache.commons.math.transform.FastFourierTransformer.verifyDataSet((java.lang.Object[]) complexArray53);
        org.apache.commons.math.complex.Complex[] complexArray58 = org.apache.commons.math.transform.FastFourierTransformer.scaleArray(complexArray53, (double) 1L);
        org.apache.commons.math.complex.Complex[] complexArray59 = fastFourierTransformer38.transform2(complexArray58);
        org.apache.commons.math.transform.FastFourierTransformer fastFourierTransformer60 = new org.apache.commons.math.transform.FastFourierTransformer();
        double[] doubleArray65 = new double[] { (-1L), 'a', 1L, 10 };
        org.apache.commons.math.transform.FastFourierTransformer.verifyDataSet(doubleArray65);
        double[] doubleArray68 = org.apache.commons.math.transform.FastFourierTransformer.scaleArray(doubleArray65, (double) 10.0f);
        org.apache.commons.math.transform.FastFourierTransformer.verifyDataSet(doubleArray68);
        org.apache.commons.math.complex.Complex[] complexArray70 = fastFourierTransformer60.transform(doubleArray68);
        org.apache.commons.math.complex.Complex[] complexArray71 = fastFourierTransformer38.transform(doubleArray68);
        double[] doubleArray76 = new double[] { (-1L), 'a', 1L, 10 };
        org.apache.commons.math.transform.FastFourierTransformer.verifyDataSet(doubleArray76);
        double[] doubleArray79 = org.apache.commons.math.transform.FastFourierTransformer.scaleArray(doubleArray76, (double) 10.0f);
        double[] doubleArray81 = org.apache.commons.math.transform.FastFourierTransformer.scaleArray(doubleArray79, (double) 10L);
        org.apache.commons.math.complex.Complex[] complexArray82 = fastFourierTransformer38.inversetransform(doubleArray81);
        org.apache.commons.math.complex.Complex[] complexArray83 = fastFourierTransformer0.inversetransform2(doubleArray81);
        org.apache.commons.math.analysis.UnivariateRealFunction univariateRealFunction84 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math.complex.Complex[] complexArray88 = fastFourierTransformer0.transform2(univariateRealFunction84, (double) (byte) 0, (double) 10L, (int) (byte) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(doubleArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray5), "[-10.0, 970.0, 10.0, 100.0]");
        org.junit.Assert.assertNotNull(doubleArray8);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray8), "[-10.0, 970.0, 10.0, 100.0]");
        org.junit.Assert.assertNotNull(complexArray10);
        org.junit.Assert.assertNotNull(doubleArray16);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray16), "[-1.0, 97.0, 1.0, 10.0]");
        org.junit.Assert.assertNotNull(complexArray18);
        org.junit.Assert.assertNotNull(complexArray20);
        org.junit.Assert.assertNotNull(complexArray23);
        org.junit.Assert.assertNotNull(complexArray25);
        org.junit.Assert.assertNotNull(complexArray26);
        org.junit.Assert.assertNotNull(doubleArray31);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray31), "[-100.0, 9700.0, 100.0, 1000.0]");
        org.junit.Assert.assertNotNull(doubleArray34);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray34), "[-100.0, 9700.0, 100.0, 1000.0]");
        org.junit.Assert.assertNotNull(doubleArray36);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray36), "[-100.0, 9700.0, 100.0, 1000.0]");
        org.junit.Assert.assertNotNull(complexArray37);
        org.junit.Assert.assertNotNull(doubleArray43);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray43), "[-1.0, 97.0, 1.0, 10.0]");
        org.junit.Assert.assertNotNull(complexArray45);
        org.junit.Assert.assertNotNull(doubleArray51);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray51), "[-1.0, 97.0, 1.0, 10.0]");
        org.junit.Assert.assertNotNull(complexArray53);
        org.junit.Assert.assertNotNull(complexArray55);
        org.junit.Assert.assertNotNull(complexArray58);
        org.junit.Assert.assertNotNull(complexArray59);
        org.junit.Assert.assertNotNull(doubleArray65);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray65), "[-10.0, 970.0, 10.0, 100.0]");
        org.junit.Assert.assertNotNull(doubleArray68);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray68), "[-10.0, 970.0, 10.0, 100.0]");
        org.junit.Assert.assertNotNull(complexArray70);
        org.junit.Assert.assertNotNull(complexArray71);
        org.junit.Assert.assertNotNull(doubleArray76);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray76), "[-100.0, 9700.0, 100.0, 1000.0]");
        org.junit.Assert.assertNotNull(doubleArray79);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray79), "[-100.0, 9700.0, 100.0, 1000.0]");
        org.junit.Assert.assertNotNull(doubleArray81);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray81), "[-100.0, 9700.0, 100.0, 1000.0]");
        org.junit.Assert.assertNotNull(complexArray82);
        org.junit.Assert.assertNotNull(complexArray83);
    }

    @Test
    public void test3045() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3045");
        org.apache.commons.math.transform.FastFourierTransformer fastFourierTransformer0 = new org.apache.commons.math.transform.FastFourierTransformer();
        double[] doubleArray5 = new double[] { (-1L), 'a', 1L, 10 };
        org.apache.commons.math.transform.FastFourierTransformer.verifyDataSet(doubleArray5);
        org.apache.commons.math.complex.Complex[] complexArray7 = fastFourierTransformer0.transform2(doubleArray5);
        org.apache.commons.math.transform.FastFourierTransformer fastFourierTransformer8 = new org.apache.commons.math.transform.FastFourierTransformer();
        double[] doubleArray13 = new double[] { (-1L), 'a', 1L, 10 };
        org.apache.commons.math.transform.FastFourierTransformer.verifyDataSet(doubleArray13);
        org.apache.commons.math.complex.Complex[] complexArray15 = fastFourierTransformer8.transform2(doubleArray13);
        org.apache.commons.math.transform.FastFourierTransformer fastFourierTransformer16 = new org.apache.commons.math.transform.FastFourierTransformer();
        double[] doubleArray21 = new double[] { (-1L), 'a', 1L, 10 };
        org.apache.commons.math.transform.FastFourierTransformer.verifyDataSet(doubleArray21);
        org.apache.commons.math.complex.Complex[] complexArray23 = fastFourierTransformer16.transform2(doubleArray21);
        org.apache.commons.math.complex.Complex[] complexArray25 = org.apache.commons.math.transform.FastFourierTransformer.scaleArray(complexArray23, (double) 'a');
        org.apache.commons.math.transform.FastFourierTransformer.verifyDataSet((java.lang.Object[]) complexArray23);
        org.apache.commons.math.complex.Complex[] complexArray28 = org.apache.commons.math.transform.FastFourierTransformer.scaleArray(complexArray23, (double) 1L);
        org.apache.commons.math.complex.Complex[] complexArray29 = fastFourierTransformer8.transform2(complexArray28);
        double[] doubleArray34 = new double[] { (-1L), 'a', 1L, 10 };
        org.apache.commons.math.transform.FastFourierTransformer.verifyDataSet(doubleArray34);
        double[] doubleArray37 = org.apache.commons.math.transform.FastFourierTransformer.scaleArray(doubleArray34, (double) 10.0f);
        org.apache.commons.math.complex.Complex[] complexArray38 = fastFourierTransformer8.transform(doubleArray34);
        org.apache.commons.math.complex.Complex[] complexArray39 = fastFourierTransformer0.transform(complexArray38);
        org.apache.commons.math.transform.FastFourierTransformer fastFourierTransformer40 = new org.apache.commons.math.transform.FastFourierTransformer();
        double[] doubleArray45 = new double[] { (-1L), 'a', 1L, 10 };
        org.apache.commons.math.transform.FastFourierTransformer.verifyDataSet(doubleArray45);
        org.apache.commons.math.complex.Complex[] complexArray47 = fastFourierTransformer40.transform2(doubleArray45);
        org.apache.commons.math.complex.Complex[] complexArray49 = org.apache.commons.math.transform.FastFourierTransformer.scaleArray(complexArray47, (double) 100L);
        org.apache.commons.math.complex.Complex[] complexArray51 = org.apache.commons.math.transform.FastFourierTransformer.scaleArray(complexArray49, (double) (byte) 100);
        org.apache.commons.math.complex.Complex[] complexArray52 = fastFourierTransformer0.inversetransform(complexArray49);
        org.apache.commons.math.complex.Complex[] complexArray54 = org.apache.commons.math.transform.FastFourierTransformer.scaleArray(complexArray49, (double) 'a');
        org.apache.commons.math.complex.Complex[] complexArray56 = org.apache.commons.math.transform.FastFourierTransformer.scaleArray(complexArray54, (double) (short) 1);
        org.apache.commons.math.complex.Complex[] complexArray58 = org.apache.commons.math.transform.FastFourierTransformer.scaleArray(complexArray56, (double) 0.0f);
        org.junit.Assert.assertNotNull(doubleArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray5), "[-1.0, 97.0, 1.0, 10.0]");
        org.junit.Assert.assertNotNull(complexArray7);
        org.junit.Assert.assertNotNull(doubleArray13);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray13), "[-1.0, 97.0, 1.0, 10.0]");
        org.junit.Assert.assertNotNull(complexArray15);
        org.junit.Assert.assertNotNull(doubleArray21);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray21), "[-1.0, 97.0, 1.0, 10.0]");
        org.junit.Assert.assertNotNull(complexArray23);
        org.junit.Assert.assertNotNull(complexArray25);
        org.junit.Assert.assertNotNull(complexArray28);
        org.junit.Assert.assertNotNull(complexArray29);
        org.junit.Assert.assertNotNull(doubleArray34);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray34), "[-10.0, 970.0, 10.0, 100.0]");
        org.junit.Assert.assertNotNull(doubleArray37);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray37), "[-10.0, 970.0, 10.0, 100.0]");
        org.junit.Assert.assertNotNull(complexArray38);
        org.junit.Assert.assertNotNull(complexArray39);
        org.junit.Assert.assertNotNull(doubleArray45);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray45), "[-1.0, 97.0, 1.0, 10.0]");
        org.junit.Assert.assertNotNull(complexArray47);
        org.junit.Assert.assertNotNull(complexArray49);
        org.junit.Assert.assertNotNull(complexArray51);
        org.junit.Assert.assertNotNull(complexArray52);
        org.junit.Assert.assertNotNull(complexArray54);
        org.junit.Assert.assertNotNull(complexArray56);
        org.junit.Assert.assertNotNull(complexArray58);
    }

    @Test
    public void test3046() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3046");
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
        double[] doubleArray27 = new double[] { (-1L), 'a', 1L, 10 };
        org.apache.commons.math.transform.FastFourierTransformer.verifyDataSet(doubleArray27);
        org.apache.commons.math.complex.Complex[] complexArray29 = fastFourierTransformer22.transform2(doubleArray27);
        org.apache.commons.math.transform.FastFourierTransformer fastFourierTransformer30 = new org.apache.commons.math.transform.FastFourierTransformer();
        double[] doubleArray35 = new double[] { (-1L), 'a', 1L, 10 };
        org.apache.commons.math.transform.FastFourierTransformer.verifyDataSet(doubleArray35);
        org.apache.commons.math.complex.Complex[] complexArray37 = fastFourierTransformer30.transform2(doubleArray35);
        org.apache.commons.math.complex.Complex[] complexArray39 = org.apache.commons.math.transform.FastFourierTransformer.scaleArray(complexArray37, (double) 'a');
        org.apache.commons.math.transform.FastFourierTransformer.verifyDataSet((java.lang.Object[]) complexArray37);
        org.apache.commons.math.complex.Complex[] complexArray42 = org.apache.commons.math.transform.FastFourierTransformer.scaleArray(complexArray37, (double) 1L);
        org.apache.commons.math.complex.Complex[] complexArray43 = fastFourierTransformer22.transform2(complexArray42);
        org.apache.commons.math.complex.Complex[] complexArray45 = org.apache.commons.math.transform.FastFourierTransformer.scaleArray(complexArray42, (double) (byte) 1);
        org.apache.commons.math.complex.Complex[] complexArray46 = fastFourierTransformer0.transform(complexArray42);
        org.apache.commons.math.transform.FastFourierTransformer fastFourierTransformer47 = new org.apache.commons.math.transform.FastFourierTransformer();
        double[] doubleArray52 = new double[] { (-1L), 'a', 1L, 10 };
        org.apache.commons.math.transform.FastFourierTransformer.verifyDataSet(doubleArray52);
        double[] doubleArray55 = org.apache.commons.math.transform.FastFourierTransformer.scaleArray(doubleArray52, (double) 10.0f);
        org.apache.commons.math.transform.FastFourierTransformer.verifyDataSet(doubleArray55);
        org.apache.commons.math.complex.Complex[] complexArray57 = fastFourierTransformer47.transform(doubleArray55);
        org.apache.commons.math.complex.Complex[] complexArray58 = fastFourierTransformer0.inversetransform2(doubleArray55);
        org.apache.commons.math.transform.FastFourierTransformer fastFourierTransformer59 = new org.apache.commons.math.transform.FastFourierTransformer();
        double[] doubleArray64 = new double[] { (-1L), 'a', 1L, 10 };
        org.apache.commons.math.transform.FastFourierTransformer.verifyDataSet(doubleArray64);
        double[] doubleArray67 = org.apache.commons.math.transform.FastFourierTransformer.scaleArray(doubleArray64, (double) 10.0f);
        double[] doubleArray69 = org.apache.commons.math.transform.FastFourierTransformer.scaleArray(doubleArray67, (double) 10L);
        org.apache.commons.math.complex.Complex[] complexArray70 = fastFourierTransformer59.inversetransform(doubleArray69);
        double[] doubleArray72 = org.apache.commons.math.transform.FastFourierTransformer.scaleArray(doubleArray69, (double) (short) 0);
        org.apache.commons.math.complex.Complex[] complexArray73 = fastFourierTransformer0.transform2(doubleArray72);
        double[] doubleArray78 = new double[] { (-1L), 'a', 1L, 10 };
        org.apache.commons.math.transform.FastFourierTransformer.verifyDataSet(doubleArray78);
        double[] doubleArray81 = org.apache.commons.math.transform.FastFourierTransformer.scaleArray(doubleArray78, (double) 10.0f);
        org.apache.commons.math.transform.FastFourierTransformer.verifyDataSet(doubleArray81);
        org.apache.commons.math.transform.FastFourierTransformer.verifyDataSet(doubleArray81);
        double[] doubleArray85 = org.apache.commons.math.transform.FastFourierTransformer.scaleArray(doubleArray81, (double) (byte) 10);
        org.apache.commons.math.complex.Complex[] complexArray86 = fastFourierTransformer0.transform2(doubleArray81);
        org.apache.commons.math.complex.Complex[] complexArray88 = org.apache.commons.math.transform.FastFourierTransformer.scaleArray(complexArray86, (double) 100);
        org.junit.Assert.assertNotNull(doubleArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray5), "[-1.0, 97.0, 1.0, 10.0]");
        org.junit.Assert.assertNotNull(complexArray7);
        org.junit.Assert.assertNotNull(doubleArray13);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray13), "[-1.0, 97.0, 1.0, 10.0]");
        org.junit.Assert.assertNotNull(complexArray15);
        org.junit.Assert.assertNotNull(complexArray17);
        org.junit.Assert.assertNotNull(complexArray20);
        org.junit.Assert.assertNotNull(complexArray21);
        org.junit.Assert.assertNotNull(doubleArray27);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray27), "[-1.0, 97.0, 1.0, 10.0]");
        org.junit.Assert.assertNotNull(complexArray29);
        org.junit.Assert.assertNotNull(doubleArray35);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray35), "[-1.0, 97.0, 1.0, 10.0]");
        org.junit.Assert.assertNotNull(complexArray37);
        org.junit.Assert.assertNotNull(complexArray39);
        org.junit.Assert.assertNotNull(complexArray42);
        org.junit.Assert.assertNotNull(complexArray43);
        org.junit.Assert.assertNotNull(complexArray45);
        org.junit.Assert.assertNotNull(complexArray46);
        org.junit.Assert.assertNotNull(doubleArray52);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray52), "[-10.0, 970.0, 10.0, 100.0]");
        org.junit.Assert.assertNotNull(doubleArray55);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray55), "[-10.0, 970.0, 10.0, 100.0]");
        org.junit.Assert.assertNotNull(complexArray57);
        org.junit.Assert.assertNotNull(complexArray58);
        org.junit.Assert.assertNotNull(doubleArray64);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray64), "[-0.0, 0.0, 0.0, 0.0]");
        org.junit.Assert.assertNotNull(doubleArray67);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray67), "[-0.0, 0.0, 0.0, 0.0]");
        org.junit.Assert.assertNotNull(doubleArray69);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray69), "[-0.0, 0.0, 0.0, 0.0]");
        org.junit.Assert.assertNotNull(complexArray70);
        org.junit.Assert.assertNotNull(doubleArray72);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray72), "[-0.0, 0.0, 0.0, 0.0]");
        org.junit.Assert.assertNotNull(complexArray73);
        org.junit.Assert.assertNotNull(doubleArray78);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray78), "[-100.0, 9700.0, 100.0, 1000.0]");
        org.junit.Assert.assertNotNull(doubleArray81);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray81), "[-100.0, 9700.0, 100.0, 1000.0]");
        org.junit.Assert.assertNotNull(doubleArray85);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray85), "[-100.0, 9700.0, 100.0, 1000.0]");
        org.junit.Assert.assertNotNull(complexArray86);
        org.junit.Assert.assertNotNull(complexArray88);
    }

    @Test
    public void test3047() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3047");
        org.apache.commons.math.transform.FastFourierTransformer fastFourierTransformer0 = new org.apache.commons.math.transform.FastFourierTransformer();
        org.apache.commons.math.transform.FastFourierTransformer fastFourierTransformer1 = new org.apache.commons.math.transform.FastFourierTransformer();
        double[] doubleArray6 = new double[] { (-1L), 'a', 1L, 10 };
        org.apache.commons.math.transform.FastFourierTransformer.verifyDataSet(doubleArray6);
        org.apache.commons.math.complex.Complex[] complexArray8 = fastFourierTransformer1.transform2(doubleArray6);
        org.apache.commons.math.complex.Complex[] complexArray10 = org.apache.commons.math.transform.FastFourierTransformer.scaleArray(complexArray8, (double) 'a');
        org.apache.commons.math.transform.FastFourierTransformer.verifyDataSet((java.lang.Object[]) complexArray8);
        org.apache.commons.math.complex.Complex[] complexArray12 = fastFourierTransformer0.inversetransform(complexArray8);
        org.apache.commons.math.transform.FastFourierTransformer fastFourierTransformer13 = new org.apache.commons.math.transform.FastFourierTransformer();
        double[] doubleArray18 = new double[] { (-1L), 'a', 1L, 10 };
        org.apache.commons.math.transform.FastFourierTransformer.verifyDataSet(doubleArray18);
        org.apache.commons.math.complex.Complex[] complexArray20 = fastFourierTransformer13.transform2(doubleArray18);
        org.apache.commons.math.complex.Complex[] complexArray21 = fastFourierTransformer0.transform(complexArray20);
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
        org.apache.commons.math.complex.Complex[] complexArray44 = org.apache.commons.math.transform.FastFourierTransformer.scaleArray(complexArray42, (double) 'a');
        org.apache.commons.math.transform.FastFourierTransformer.verifyDataSet((java.lang.Object[]) complexArray42);
        org.apache.commons.math.complex.Complex[] complexArray47 = org.apache.commons.math.transform.FastFourierTransformer.scaleArray(complexArray42, (double) 1L);
        org.apache.commons.math.complex.Complex[] complexArray49 = org.apache.commons.math.transform.FastFourierTransformer.scaleArray(complexArray42, (double) 1);
        org.apache.commons.math.complex.Complex[] complexArray50 = fastFourierTransformer22.transform(complexArray42);
        org.apache.commons.math.complex.Complex[] complexArray51 = fastFourierTransformer0.transform(complexArray50);
        org.apache.commons.math.transform.FastFourierTransformer fastFourierTransformer52 = new org.apache.commons.math.transform.FastFourierTransformer();
        double[] doubleArray57 = new double[] { (-1L), 'a', 1L, 10 };
        org.apache.commons.math.transform.FastFourierTransformer.verifyDataSet(doubleArray57);
        org.apache.commons.math.complex.Complex[] complexArray59 = fastFourierTransformer52.transform2(doubleArray57);
        org.apache.commons.math.complex.Complex[] complexArray61 = org.apache.commons.math.transform.FastFourierTransformer.scaleArray(complexArray59, (double) 'a');
        org.apache.commons.math.transform.FastFourierTransformer.verifyDataSet((java.lang.Object[]) complexArray59);
        org.apache.commons.math.complex.Complex[] complexArray64 = org.apache.commons.math.transform.FastFourierTransformer.scaleArray(complexArray59, (double) 1L);
        org.apache.commons.math.complex.Complex[] complexArray65 = fastFourierTransformer0.transform(complexArray64);
        org.apache.commons.math.transform.FastFourierTransformer fastFourierTransformer66 = new org.apache.commons.math.transform.FastFourierTransformer();
        double[] doubleArray71 = new double[] { (-1L), 'a', 1L, 10 };
        org.apache.commons.math.transform.FastFourierTransformer.verifyDataSet(doubleArray71);
        org.apache.commons.math.complex.Complex[] complexArray73 = fastFourierTransformer66.transform2(doubleArray71);
        org.apache.commons.math.complex.Complex[] complexArray75 = org.apache.commons.math.transform.FastFourierTransformer.scaleArray(complexArray73, (double) 'a');
        org.apache.commons.math.transform.FastFourierTransformer.verifyDataSet((java.lang.Object[]) complexArray73);
        org.apache.commons.math.complex.Complex[] complexArray78 = org.apache.commons.math.transform.FastFourierTransformer.scaleArray(complexArray73, (double) 1L);
        org.apache.commons.math.complex.Complex[] complexArray80 = org.apache.commons.math.transform.FastFourierTransformer.scaleArray(complexArray73, (double) '#');
        org.apache.commons.math.complex.Complex[] complexArray81 = fastFourierTransformer0.transform(complexArray73);
        org.apache.commons.math.complex.Complex[] complexArray83 = org.apache.commons.math.transform.FastFourierTransformer.scaleArray(complexArray81, (double) 0L);
        org.junit.Assert.assertNotNull(doubleArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray6), "[-1.0, 97.0, 1.0, 10.0]");
        org.junit.Assert.assertNotNull(complexArray8);
        org.junit.Assert.assertNotNull(complexArray10);
        org.junit.Assert.assertNotNull(complexArray12);
        org.junit.Assert.assertNotNull(doubleArray18);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray18), "[-1.0, 97.0, 1.0, 10.0]");
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
        org.junit.Assert.assertNotNull(complexArray44);
        org.junit.Assert.assertNotNull(complexArray47);
        org.junit.Assert.assertNotNull(complexArray49);
        org.junit.Assert.assertNotNull(complexArray50);
        org.junit.Assert.assertNotNull(complexArray51);
        org.junit.Assert.assertNotNull(doubleArray57);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray57), "[-1.0, 97.0, 1.0, 10.0]");
        org.junit.Assert.assertNotNull(complexArray59);
        org.junit.Assert.assertNotNull(complexArray61);
        org.junit.Assert.assertNotNull(complexArray64);
        org.junit.Assert.assertNotNull(complexArray65);
        org.junit.Assert.assertNotNull(doubleArray71);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray71), "[-1.0, 97.0, 1.0, 10.0]");
        org.junit.Assert.assertNotNull(complexArray73);
        org.junit.Assert.assertNotNull(complexArray75);
        org.junit.Assert.assertNotNull(complexArray78);
        org.junit.Assert.assertNotNull(complexArray80);
        org.junit.Assert.assertNotNull(complexArray81);
        org.junit.Assert.assertNotNull(complexArray83);
    }

    @Test
    public void test3048() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3048");
        org.apache.commons.math.transform.FastFourierTransformer fastFourierTransformer0 = new org.apache.commons.math.transform.FastFourierTransformer();
        org.apache.commons.math.transform.FastFourierTransformer fastFourierTransformer1 = new org.apache.commons.math.transform.FastFourierTransformer();
        double[] doubleArray6 = new double[] { (-1L), 'a', 1L, 10 };
        org.apache.commons.math.transform.FastFourierTransformer.verifyDataSet(doubleArray6);
        org.apache.commons.math.complex.Complex[] complexArray8 = fastFourierTransformer1.transform2(doubleArray6);
        org.apache.commons.math.complex.Complex[] complexArray10 = org.apache.commons.math.transform.FastFourierTransformer.scaleArray(complexArray8, (double) 'a');
        org.apache.commons.math.transform.FastFourierTransformer.verifyDataSet((java.lang.Object[]) complexArray8);
        org.apache.commons.math.complex.Complex[] complexArray12 = fastFourierTransformer0.inversetransform(complexArray8);
        org.apache.commons.math.transform.FastFourierTransformer fastFourierTransformer13 = new org.apache.commons.math.transform.FastFourierTransformer();
        double[] doubleArray18 = new double[] { (-1L), 'a', 1L, 10 };
        org.apache.commons.math.transform.FastFourierTransformer.verifyDataSet(doubleArray18);
        org.apache.commons.math.complex.Complex[] complexArray20 = fastFourierTransformer13.transform2(doubleArray18);
        double[] doubleArray22 = org.apache.commons.math.transform.FastFourierTransformer.scaleArray(doubleArray18, 100.0d);
        org.apache.commons.math.complex.Complex[] complexArray23 = fastFourierTransformer0.inversetransform(doubleArray18);
        double[] doubleArray28 = new double[] { (-1L), 'a', 1L, 10 };
        org.apache.commons.math.transform.FastFourierTransformer.verifyDataSet(doubleArray28);
        double[] doubleArray31 = org.apache.commons.math.transform.FastFourierTransformer.scaleArray(doubleArray28, (double) 10.0f);
        org.apache.commons.math.transform.FastFourierTransformer.verifyDataSet(doubleArray31);
        org.apache.commons.math.transform.FastFourierTransformer.verifyDataSet(doubleArray31);
        org.apache.commons.math.transform.FastFourierTransformer.verifyDataSet(doubleArray31);
        double[] doubleArray36 = org.apache.commons.math.transform.FastFourierTransformer.scaleArray(doubleArray31, (double) (-1L));
        org.apache.commons.math.complex.Complex[] complexArray37 = fastFourierTransformer0.transform2(doubleArray36);
        org.apache.commons.math.transform.FastFourierTransformer fastFourierTransformer38 = new org.apache.commons.math.transform.FastFourierTransformer();
        org.apache.commons.math.transform.FastFourierTransformer fastFourierTransformer39 = new org.apache.commons.math.transform.FastFourierTransformer();
        double[] doubleArray44 = new double[] { (-1L), 'a', 1L, 10 };
        org.apache.commons.math.transform.FastFourierTransformer.verifyDataSet(doubleArray44);
        org.apache.commons.math.complex.Complex[] complexArray46 = fastFourierTransformer39.transform2(doubleArray44);
        org.apache.commons.math.complex.Complex[] complexArray48 = org.apache.commons.math.transform.FastFourierTransformer.scaleArray(complexArray46, (double) 'a');
        org.apache.commons.math.transform.FastFourierTransformer.verifyDataSet((java.lang.Object[]) complexArray46);
        org.apache.commons.math.complex.Complex[] complexArray50 = fastFourierTransformer38.inversetransform(complexArray46);
        double[] doubleArray55 = new double[] { (-1L), 'a', 1L, 10 };
        org.apache.commons.math.transform.FastFourierTransformer.verifyDataSet(doubleArray55);
        double[] doubleArray58 = org.apache.commons.math.transform.FastFourierTransformer.scaleArray(doubleArray55, (double) 10.0f);
        double[] doubleArray60 = org.apache.commons.math.transform.FastFourierTransformer.scaleArray(doubleArray58, (double) 10L);
        org.apache.commons.math.complex.Complex[] complexArray61 = fastFourierTransformer38.transform(doubleArray58);
        org.apache.commons.math.complex.Complex[] complexArray62 = fastFourierTransformer0.transform(complexArray61);
        org.apache.commons.math.transform.FastFourierTransformer fastFourierTransformer63 = new org.apache.commons.math.transform.FastFourierTransformer();
        double[] doubleArray68 = new double[] { (-1L), 'a', 1L, 10 };
        org.apache.commons.math.transform.FastFourierTransformer.verifyDataSet(doubleArray68);
        org.apache.commons.math.complex.Complex[] complexArray70 = fastFourierTransformer63.transform2(doubleArray68);
        org.apache.commons.math.complex.Complex[] complexArray72 = org.apache.commons.math.transform.FastFourierTransformer.scaleArray(complexArray70, (double) 'a');
        org.apache.commons.math.transform.FastFourierTransformer.verifyDataSet((java.lang.Object[]) complexArray70);
        org.apache.commons.math.complex.Complex[] complexArray75 = org.apache.commons.math.transform.FastFourierTransformer.scaleArray(complexArray70, (double) 1L);
        org.apache.commons.math.complex.Complex[] complexArray77 = org.apache.commons.math.transform.FastFourierTransformer.scaleArray(complexArray70, (double) 1);
        org.apache.commons.math.transform.FastFourierTransformer.verifyDataSet((java.lang.Object[]) complexArray70);
        org.apache.commons.math.transform.FastFourierTransformer.verifyDataSet((java.lang.Object[]) complexArray70);
        org.apache.commons.math.complex.Complex[] complexArray80 = fastFourierTransformer0.inversetransform2(complexArray70);
        org.apache.commons.math.complex.Complex[] complexArray82 = org.apache.commons.math.transform.FastFourierTransformer.scaleArray(complexArray80, (double) 'a');
        org.junit.Assert.assertNotNull(doubleArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray6), "[-1.0, 97.0, 1.0, 10.0]");
        org.junit.Assert.assertNotNull(complexArray8);
        org.junit.Assert.assertNotNull(complexArray10);
        org.junit.Assert.assertNotNull(complexArray12);
        org.junit.Assert.assertNotNull(doubleArray18);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray18), "[-100.0, 9700.0, 100.0, 1000.0]");
        org.junit.Assert.assertNotNull(complexArray20);
        org.junit.Assert.assertNotNull(doubleArray22);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray22), "[-100.0, 9700.0, 100.0, 1000.0]");
        org.junit.Assert.assertNotNull(complexArray23);
        org.junit.Assert.assertNotNull(doubleArray28);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray28), "[10.0, -970.0, -10.0, -100.0]");
        org.junit.Assert.assertNotNull(doubleArray31);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray31), "[10.0, -970.0, -10.0, -100.0]");
        org.junit.Assert.assertNotNull(doubleArray36);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray36), "[10.0, -970.0, -10.0, -100.0]");
        org.junit.Assert.assertNotNull(complexArray37);
        org.junit.Assert.assertNotNull(doubleArray44);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray44), "[-1.0, 97.0, 1.0, 10.0]");
        org.junit.Assert.assertNotNull(complexArray46);
        org.junit.Assert.assertNotNull(complexArray48);
        org.junit.Assert.assertNotNull(complexArray50);
        org.junit.Assert.assertNotNull(doubleArray55);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray55), "[-100.0, 9700.0, 100.0, 1000.0]");
        org.junit.Assert.assertNotNull(doubleArray58);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray58), "[-100.0, 9700.0, 100.0, 1000.0]");
        org.junit.Assert.assertNotNull(doubleArray60);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray60), "[-100.0, 9700.0, 100.0, 1000.0]");
        org.junit.Assert.assertNotNull(complexArray61);
        org.junit.Assert.assertNotNull(complexArray62);
        org.junit.Assert.assertNotNull(doubleArray68);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray68), "[-1.0, 97.0, 1.0, 10.0]");
        org.junit.Assert.assertNotNull(complexArray70);
        org.junit.Assert.assertNotNull(complexArray72);
        org.junit.Assert.assertNotNull(complexArray75);
        org.junit.Assert.assertNotNull(complexArray77);
        org.junit.Assert.assertNotNull(complexArray80);
        org.junit.Assert.assertNotNull(complexArray82);
    }

    @Test
    public void test3049() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3049");
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math.transform.FastFourierTransformer.verifyInterval(100.0d, (double) '4');
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Endpoints do not specify an interval: [100.0, 52.0]");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void test3050() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3050");
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
        double[] doubleArray20 = org.apache.commons.math.transform.FastFourierTransformer.scaleArray(doubleArray17, (double) 10.0f);
        double[] doubleArray22 = org.apache.commons.math.transform.FastFourierTransformer.scaleArray(doubleArray20, (double) 10L);
        org.apache.commons.math.complex.Complex[] complexArray23 = fastFourierTransformer12.inversetransform(doubleArray22);
        org.apache.commons.math.transform.FastFourierTransformer fastFourierTransformer24 = new org.apache.commons.math.transform.FastFourierTransformer();
        double[] doubleArray29 = new double[] { (-1L), 'a', 1L, 10 };
        org.apache.commons.math.transform.FastFourierTransformer.verifyDataSet(doubleArray29);
        org.apache.commons.math.complex.Complex[] complexArray31 = fastFourierTransformer24.transform2(doubleArray29);
        org.apache.commons.math.complex.Complex[] complexArray33 = org.apache.commons.math.transform.FastFourierTransformer.scaleArray(complexArray31, (double) 100L);
        org.apache.commons.math.complex.Complex[] complexArray34 = fastFourierTransformer12.inversetransform2(complexArray33);
        org.apache.commons.math.complex.Complex[] complexArray35 = fastFourierTransformer0.inversetransform2(complexArray34);
        org.apache.commons.math.transform.FastFourierTransformer fastFourierTransformer36 = new org.apache.commons.math.transform.FastFourierTransformer();
        double[] doubleArray41 = new double[] { (-1L), 'a', 1L, 10 };
        org.apache.commons.math.transform.FastFourierTransformer.verifyDataSet(doubleArray41);
        double[] doubleArray44 = org.apache.commons.math.transform.FastFourierTransformer.scaleArray(doubleArray41, (double) 10.0f);
        org.apache.commons.math.transform.FastFourierTransformer.verifyDataSet(doubleArray44);
        org.apache.commons.math.complex.Complex[] complexArray46 = fastFourierTransformer36.inversetransform(doubleArray44);
        org.apache.commons.math.transform.FastFourierTransformer.verifyDataSet((java.lang.Object[]) complexArray46);
        org.apache.commons.math.transform.FastFourierTransformer.verifyDataSet((java.lang.Object[]) complexArray46);
        org.apache.commons.math.complex.Complex[] complexArray49 = fastFourierTransformer0.transform(complexArray46);
        org.apache.commons.math.analysis.UnivariateRealFunction univariateRealFunction50 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math.complex.Complex[] complexArray54 = fastFourierTransformer0.inversetransform2(univariateRealFunction50, (double) 1.0f, (double) 100.0f, (int) (short) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(doubleArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray6), "[-1.0, 97.0, 1.0, 10.0]");
        org.junit.Assert.assertNotNull(complexArray8);
        org.junit.Assert.assertNotNull(complexArray10);
        org.junit.Assert.assertNotNull(complexArray11);
        org.junit.Assert.assertNotNull(doubleArray17);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray17), "[-100.0, 9700.0, 100.0, 1000.0]");
        org.junit.Assert.assertNotNull(doubleArray20);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray20), "[-100.0, 9700.0, 100.0, 1000.0]");
        org.junit.Assert.assertNotNull(doubleArray22);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray22), "[-100.0, 9700.0, 100.0, 1000.0]");
        org.junit.Assert.assertNotNull(complexArray23);
        org.junit.Assert.assertNotNull(doubleArray29);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray29), "[-1.0, 97.0, 1.0, 10.0]");
        org.junit.Assert.assertNotNull(complexArray31);
        org.junit.Assert.assertNotNull(complexArray33);
        org.junit.Assert.assertNotNull(complexArray34);
        org.junit.Assert.assertNotNull(complexArray35);
        org.junit.Assert.assertNotNull(doubleArray41);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray41), "[-10.0, 970.0, 10.0, 100.0]");
        org.junit.Assert.assertNotNull(doubleArray44);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray44), "[-10.0, 970.0, 10.0, 100.0]");
        org.junit.Assert.assertNotNull(complexArray46);
        org.junit.Assert.assertNotNull(complexArray49);
    }

    @Test
    public void test3051() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3051");
        org.apache.commons.math.analysis.UnivariateRealFunction univariateRealFunction0 = null;
        // The following exception was thrown during execution in test generation
        try {
            double[] doubleArray4 = org.apache.commons.math.transform.FastFourierTransformer.sample(univariateRealFunction0, (double) (short) 100, (double) 100, (int) (short) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Endpoints do not specify an interval: [100.0, 100.0]");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void test3052() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3052");
        org.apache.commons.math.transform.FastFourierTransformer fastFourierTransformer0 = new org.apache.commons.math.transform.FastFourierTransformer();
        double[] doubleArray5 = new double[] { (-1L), 'a', 1L, 10 };
        org.apache.commons.math.transform.FastFourierTransformer.verifyDataSet(doubleArray5);
        double[] doubleArray8 = org.apache.commons.math.transform.FastFourierTransformer.scaleArray(doubleArray5, (double) 10.0f);
        org.apache.commons.math.transform.FastFourierTransformer.verifyDataSet(doubleArray8);
        org.apache.commons.math.complex.Complex[] complexArray10 = fastFourierTransformer0.transform(doubleArray8);
        org.apache.commons.math.transform.FastFourierTransformer fastFourierTransformer11 = new org.apache.commons.math.transform.FastFourierTransformer();
        double[] doubleArray16 = new double[] { (-1L), 'a', 1L, 10 };
        org.apache.commons.math.transform.FastFourierTransformer.verifyDataSet(doubleArray16);
        org.apache.commons.math.complex.Complex[] complexArray18 = fastFourierTransformer11.transform2(doubleArray16);
        org.apache.commons.math.complex.Complex[] complexArray19 = fastFourierTransformer0.inversetransform2(complexArray18);
        org.apache.commons.math.transform.FastFourierTransformer fastFourierTransformer20 = new org.apache.commons.math.transform.FastFourierTransformer();
        double[] doubleArray25 = new double[] { (-1L), 'a', 1L, 10 };
        org.apache.commons.math.transform.FastFourierTransformer.verifyDataSet(doubleArray25);
        double[] doubleArray28 = org.apache.commons.math.transform.FastFourierTransformer.scaleArray(doubleArray25, (double) 10.0f);
        org.apache.commons.math.transform.FastFourierTransformer.verifyDataSet(doubleArray28);
        org.apache.commons.math.complex.Complex[] complexArray30 = fastFourierTransformer20.inversetransform(doubleArray28);
        org.apache.commons.math.complex.Complex[] complexArray31 = fastFourierTransformer0.transform(doubleArray28);
        org.apache.commons.math.transform.FastFourierTransformer fastFourierTransformer32 = new org.apache.commons.math.transform.FastFourierTransformer();
        double[] doubleArray37 = new double[] { (-1L), 'a', 1L, 10 };
        org.apache.commons.math.transform.FastFourierTransformer.verifyDataSet(doubleArray37);
        org.apache.commons.math.complex.Complex[] complexArray39 = fastFourierTransformer32.transform2(doubleArray37);
        double[] doubleArray41 = org.apache.commons.math.transform.FastFourierTransformer.scaleArray(doubleArray37, (double) 10.0f);
        double[] doubleArray43 = org.apache.commons.math.transform.FastFourierTransformer.scaleArray(doubleArray37, (double) 10L);
        double[] doubleArray45 = org.apache.commons.math.transform.FastFourierTransformer.scaleArray(doubleArray43, (double) (byte) 0);
        org.apache.commons.math.complex.Complex[] complexArray46 = fastFourierTransformer0.transform2(doubleArray45);
        org.apache.commons.math.transform.FastFourierTransformer fastFourierTransformer47 = new org.apache.commons.math.transform.FastFourierTransformer();
        double[] doubleArray52 = new double[] { (-1L), 'a', 1L, 10 };
        org.apache.commons.math.transform.FastFourierTransformer.verifyDataSet(doubleArray52);
        double[] doubleArray55 = org.apache.commons.math.transform.FastFourierTransformer.scaleArray(doubleArray52, (double) 10.0f);
        org.apache.commons.math.transform.FastFourierTransformer.verifyDataSet(doubleArray55);
        org.apache.commons.math.complex.Complex[] complexArray57 = fastFourierTransformer47.transform(doubleArray55);
        org.apache.commons.math.transform.FastFourierTransformer fastFourierTransformer58 = new org.apache.commons.math.transform.FastFourierTransformer();
        org.apache.commons.math.transform.FastFourierTransformer fastFourierTransformer59 = new org.apache.commons.math.transform.FastFourierTransformer();
        double[] doubleArray64 = new double[] { (-1L), 'a', 1L, 10 };
        org.apache.commons.math.transform.FastFourierTransformer.verifyDataSet(doubleArray64);
        org.apache.commons.math.complex.Complex[] complexArray66 = fastFourierTransformer59.transform2(doubleArray64);
        org.apache.commons.math.complex.Complex[] complexArray68 = org.apache.commons.math.transform.FastFourierTransformer.scaleArray(complexArray66, (double) 'a');
        org.apache.commons.math.transform.FastFourierTransformer.verifyDataSet((java.lang.Object[]) complexArray66);
        org.apache.commons.math.complex.Complex[] complexArray70 = fastFourierTransformer58.inversetransform(complexArray66);
        org.apache.commons.math.transform.FastFourierTransformer fastFourierTransformer71 = new org.apache.commons.math.transform.FastFourierTransformer();
        double[] doubleArray76 = new double[] { (-1L), 'a', 1L, 10 };
        org.apache.commons.math.transform.FastFourierTransformer.verifyDataSet(doubleArray76);
        org.apache.commons.math.complex.Complex[] complexArray78 = fastFourierTransformer71.transform2(doubleArray76);
        org.apache.commons.math.complex.Complex[] complexArray79 = fastFourierTransformer58.transform(complexArray78);
        double[] doubleArray84 = new double[] { (-1L), 'a', 1L, 10 };
        org.apache.commons.math.transform.FastFourierTransformer.verifyDataSet(doubleArray84);
        double[] doubleArray87 = org.apache.commons.math.transform.FastFourierTransformer.scaleArray(doubleArray84, (double) 10.0f);
        double[] doubleArray89 = org.apache.commons.math.transform.FastFourierTransformer.scaleArray(doubleArray87, (double) 10L);
        org.apache.commons.math.complex.Complex[] complexArray90 = fastFourierTransformer58.inversetransform2(doubleArray89);
        org.apache.commons.math.complex.Complex[] complexArray91 = fastFourierTransformer47.inversetransform2(doubleArray89);
        org.apache.commons.math.complex.Complex[] complexArray93 = org.apache.commons.math.transform.FastFourierTransformer.scaleArray(complexArray91, (double) (-1.0f));
        org.apache.commons.math.complex.Complex[] complexArray94 = fastFourierTransformer0.inversetransform2(complexArray93);
        org.apache.commons.math.analysis.UnivariateRealFunction univariateRealFunction95 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math.complex.Complex[] complexArray99 = fastFourierTransformer0.transform2(univariateRealFunction95, (double) (short) 1, 0.0d, (int) (byte) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Number of samples not positive.");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(doubleArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray5), "[-10.0, 970.0, 10.0, 100.0]");
        org.junit.Assert.assertNotNull(doubleArray8);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray8), "[-10.0, 970.0, 10.0, 100.0]");
        org.junit.Assert.assertNotNull(complexArray10);
        org.junit.Assert.assertNotNull(doubleArray16);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray16), "[-1.0, 97.0, 1.0, 10.0]");
        org.junit.Assert.assertNotNull(complexArray18);
        org.junit.Assert.assertNotNull(complexArray19);
        org.junit.Assert.assertNotNull(doubleArray25);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray25), "[-10.0, 970.0, 10.0, 100.0]");
        org.junit.Assert.assertNotNull(doubleArray28);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray28), "[-10.0, 970.0, 10.0, 100.0]");
        org.junit.Assert.assertNotNull(complexArray30);
        org.junit.Assert.assertNotNull(complexArray31);
        org.junit.Assert.assertNotNull(doubleArray37);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray37), "[-0.0, 0.0, 0.0, 0.0]");
        org.junit.Assert.assertNotNull(complexArray39);
        org.junit.Assert.assertNotNull(doubleArray41);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray41), "[-0.0, 0.0, 0.0, 0.0]");
        org.junit.Assert.assertNotNull(doubleArray43);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray43), "[-0.0, 0.0, 0.0, 0.0]");
        org.junit.Assert.assertNotNull(doubleArray45);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray45), "[-0.0, 0.0, 0.0, 0.0]");
        org.junit.Assert.assertNotNull(complexArray46);
        org.junit.Assert.assertNotNull(doubleArray52);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray52), "[-10.0, 970.0, 10.0, 100.0]");
        org.junit.Assert.assertNotNull(doubleArray55);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray55), "[-10.0, 970.0, 10.0, 100.0]");
        org.junit.Assert.assertNotNull(complexArray57);
        org.junit.Assert.assertNotNull(doubleArray64);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray64), "[-1.0, 97.0, 1.0, 10.0]");
        org.junit.Assert.assertNotNull(complexArray66);
        org.junit.Assert.assertNotNull(complexArray68);
        org.junit.Assert.assertNotNull(complexArray70);
        org.junit.Assert.assertNotNull(doubleArray76);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray76), "[-1.0, 97.0, 1.0, 10.0]");
        org.junit.Assert.assertNotNull(complexArray78);
        org.junit.Assert.assertNotNull(complexArray79);
        org.junit.Assert.assertNotNull(doubleArray84);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray84), "[-100.0, 9700.0, 100.0, 1000.0]");
        org.junit.Assert.assertNotNull(doubleArray87);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray87), "[-100.0, 9700.0, 100.0, 1000.0]");
        org.junit.Assert.assertNotNull(doubleArray89);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray89), "[-100.0, 9700.0, 100.0, 1000.0]");
        org.junit.Assert.assertNotNull(complexArray90);
        org.junit.Assert.assertNotNull(complexArray91);
        org.junit.Assert.assertNotNull(complexArray93);
        org.junit.Assert.assertNotNull(complexArray94);
    }

    @Test
    public void test3053() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3053");
        org.apache.commons.math.transform.FastFourierTransformer fastFourierTransformer0 = new org.apache.commons.math.transform.FastFourierTransformer();
        org.apache.commons.math.transform.FastFourierTransformer fastFourierTransformer1 = new org.apache.commons.math.transform.FastFourierTransformer();
        org.apache.commons.math.transform.FastFourierTransformer fastFourierTransformer2 = new org.apache.commons.math.transform.FastFourierTransformer();
        double[] doubleArray7 = new double[] { (-1L), 'a', 1L, 10 };
        org.apache.commons.math.transform.FastFourierTransformer.verifyDataSet(doubleArray7);
        double[] doubleArray10 = org.apache.commons.math.transform.FastFourierTransformer.scaleArray(doubleArray7, (double) 10.0f);
        org.apache.commons.math.transform.FastFourierTransformer.verifyDataSet(doubleArray10);
        org.apache.commons.math.complex.Complex[] complexArray12 = fastFourierTransformer2.inversetransform(doubleArray10);
        org.apache.commons.math.complex.Complex[] complexArray13 = fastFourierTransformer1.transform2(complexArray12);
        org.apache.commons.math.transform.FastFourierTransformer fastFourierTransformer14 = new org.apache.commons.math.transform.FastFourierTransformer();
        double[] doubleArray19 = new double[] { (-1L), 'a', 1L, 10 };
        org.apache.commons.math.transform.FastFourierTransformer.verifyDataSet(doubleArray19);
        double[] doubleArray22 = org.apache.commons.math.transform.FastFourierTransformer.scaleArray(doubleArray19, (double) 10.0f);
        org.apache.commons.math.transform.FastFourierTransformer.verifyDataSet(doubleArray22);
        org.apache.commons.math.complex.Complex[] complexArray24 = fastFourierTransformer14.transform(doubleArray22);
        org.apache.commons.math.complex.Complex[] complexArray25 = fastFourierTransformer1.transform2(complexArray24);
        org.apache.commons.math.transform.FastFourierTransformer.verifyDataSet((java.lang.Object[]) complexArray24);
        org.apache.commons.math.complex.Complex[] complexArray27 = fastFourierTransformer0.inversetransform(complexArray24);
        double[] doubleArray32 = new double[] { (-1L), 'a', 1L, 10 };
        org.apache.commons.math.transform.FastFourierTransformer.verifyDataSet(doubleArray32);
        double[] doubleArray35 = org.apache.commons.math.transform.FastFourierTransformer.scaleArray(doubleArray32, 0.0d);
        double[] doubleArray37 = org.apache.commons.math.transform.FastFourierTransformer.scaleArray(doubleArray35, (double) (byte) 100);
        org.apache.commons.math.transform.FastFourierTransformer.verifyDataSet(doubleArray37);
        org.apache.commons.math.complex.Complex[] complexArray39 = fastFourierTransformer0.transform(doubleArray37);
        org.apache.commons.math.transform.FastFourierTransformer fastFourierTransformer40 = new org.apache.commons.math.transform.FastFourierTransformer();
        double[] doubleArray45 = new double[] { (-1L), 'a', 1L, 10 };
        org.apache.commons.math.transform.FastFourierTransformer.verifyDataSet(doubleArray45);
        double[] doubleArray48 = org.apache.commons.math.transform.FastFourierTransformer.scaleArray(doubleArray45, (double) 10.0f);
        org.apache.commons.math.transform.FastFourierTransformer.verifyDataSet(doubleArray48);
        org.apache.commons.math.complex.Complex[] complexArray50 = fastFourierTransformer40.transform(doubleArray48);
        org.apache.commons.math.transform.FastFourierTransformer fastFourierTransformer51 = new org.apache.commons.math.transform.FastFourierTransformer();
        double[] doubleArray56 = new double[] { (-1L), 'a', 1L, 10 };
        org.apache.commons.math.transform.FastFourierTransformer.verifyDataSet(doubleArray56);
        org.apache.commons.math.complex.Complex[] complexArray58 = fastFourierTransformer51.transform2(doubleArray56);
        org.apache.commons.math.complex.Complex[] complexArray60 = org.apache.commons.math.transform.FastFourierTransformer.scaleArray(complexArray58, (double) 'a');
        org.apache.commons.math.transform.FastFourierTransformer.verifyDataSet((java.lang.Object[]) complexArray58);
        org.apache.commons.math.complex.Complex[] complexArray63 = org.apache.commons.math.transform.FastFourierTransformer.scaleArray(complexArray58, (double) 1L);
        org.apache.commons.math.complex.Complex[] complexArray65 = org.apache.commons.math.transform.FastFourierTransformer.scaleArray(complexArray58, (double) 1);
        org.apache.commons.math.complex.Complex[] complexArray66 = fastFourierTransformer40.inversetransform2(complexArray65);
        org.apache.commons.math.transform.FastFourierTransformer fastFourierTransformer67 = new org.apache.commons.math.transform.FastFourierTransformer();
        org.apache.commons.math.transform.FastFourierTransformer fastFourierTransformer68 = new org.apache.commons.math.transform.FastFourierTransformer();
        double[] doubleArray73 = new double[] { (-1L), 'a', 1L, 10 };
        org.apache.commons.math.transform.FastFourierTransformer.verifyDataSet(doubleArray73);
        org.apache.commons.math.complex.Complex[] complexArray75 = fastFourierTransformer68.transform2(doubleArray73);
        org.apache.commons.math.complex.Complex[] complexArray77 = org.apache.commons.math.transform.FastFourierTransformer.scaleArray(complexArray75, (double) 'a');
        org.apache.commons.math.transform.FastFourierTransformer.verifyDataSet((java.lang.Object[]) complexArray75);
        org.apache.commons.math.complex.Complex[] complexArray79 = fastFourierTransformer67.inversetransform(complexArray75);
        org.apache.commons.math.transform.FastFourierTransformer.verifyDataSet((java.lang.Object[]) complexArray75);
        org.apache.commons.math.complex.Complex[] complexArray81 = fastFourierTransformer40.inversetransform(complexArray75);
        org.apache.commons.math.complex.Complex[] complexArray83 = org.apache.commons.math.transform.FastFourierTransformer.scaleArray(complexArray81, (double) 100L);
        org.apache.commons.math.complex.Complex[] complexArray84 = fastFourierTransformer0.inversetransform(complexArray81);
        org.junit.Assert.assertNotNull(doubleArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray7), "[-10.0, 970.0, 10.0, 100.0]");
        org.junit.Assert.assertNotNull(doubleArray10);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray10), "[-10.0, 970.0, 10.0, 100.0]");
        org.junit.Assert.assertNotNull(complexArray12);
        org.junit.Assert.assertNotNull(complexArray13);
        org.junit.Assert.assertNotNull(doubleArray19);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray19), "[-10.0, 970.0, 10.0, 100.0]");
        org.junit.Assert.assertNotNull(doubleArray22);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray22), "[-10.0, 970.0, 10.0, 100.0]");
        org.junit.Assert.assertNotNull(complexArray24);
        org.junit.Assert.assertNotNull(complexArray25);
        org.junit.Assert.assertNotNull(complexArray27);
        org.junit.Assert.assertNotNull(doubleArray32);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray32), "[-0.0, 0.0, 0.0, 0.0]");
        org.junit.Assert.assertNotNull(doubleArray35);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray35), "[-0.0, 0.0, 0.0, 0.0]");
        org.junit.Assert.assertNotNull(doubleArray37);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray37), "[-0.0, 0.0, 0.0, 0.0]");
        org.junit.Assert.assertNotNull(complexArray39);
        org.junit.Assert.assertNotNull(doubleArray45);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray45), "[-10.0, 970.0, 10.0, 100.0]");
        org.junit.Assert.assertNotNull(doubleArray48);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray48), "[-10.0, 970.0, 10.0, 100.0]");
        org.junit.Assert.assertNotNull(complexArray50);
        org.junit.Assert.assertNotNull(doubleArray56);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray56), "[-1.0, 97.0, 1.0, 10.0]");
        org.junit.Assert.assertNotNull(complexArray58);
        org.junit.Assert.assertNotNull(complexArray60);
        org.junit.Assert.assertNotNull(complexArray63);
        org.junit.Assert.assertNotNull(complexArray65);
        org.junit.Assert.assertNotNull(complexArray66);
        org.junit.Assert.assertNotNull(doubleArray73);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray73), "[-1.0, 97.0, 1.0, 10.0]");
        org.junit.Assert.assertNotNull(complexArray75);
        org.junit.Assert.assertNotNull(complexArray77);
        org.junit.Assert.assertNotNull(complexArray79);
        org.junit.Assert.assertNotNull(complexArray81);
        org.junit.Assert.assertNotNull(complexArray83);
        org.junit.Assert.assertNotNull(complexArray84);
    }

    @Test
    public void test3054() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3054");
        org.apache.commons.math.transform.FastFourierTransformer fastFourierTransformer0 = new org.apache.commons.math.transform.FastFourierTransformer();
        org.apache.commons.math.transform.FastFourierTransformer fastFourierTransformer1 = new org.apache.commons.math.transform.FastFourierTransformer();
        double[] doubleArray6 = new double[] { (-1L), 'a', 1L, 10 };
        org.apache.commons.math.transform.FastFourierTransformer.verifyDataSet(doubleArray6);
        org.apache.commons.math.complex.Complex[] complexArray8 = fastFourierTransformer1.transform2(doubleArray6);
        org.apache.commons.math.complex.Complex[] complexArray10 = org.apache.commons.math.transform.FastFourierTransformer.scaleArray(complexArray8, (double) 'a');
        org.apache.commons.math.transform.FastFourierTransformer.verifyDataSet((java.lang.Object[]) complexArray8);
        org.apache.commons.math.complex.Complex[] complexArray12 = fastFourierTransformer0.inversetransform(complexArray8);
        double[] doubleArray17 = new double[] { (-1L), 'a', 1L, 10 };
        org.apache.commons.math.transform.FastFourierTransformer.verifyDataSet(doubleArray17);
        double[] doubleArray20 = org.apache.commons.math.transform.FastFourierTransformer.scaleArray(doubleArray17, (double) 10.0f);
        double[] doubleArray22 = org.apache.commons.math.transform.FastFourierTransformer.scaleArray(doubleArray20, (double) 10L);
        org.apache.commons.math.complex.Complex[] complexArray23 = fastFourierTransformer0.transform(doubleArray20);
        double[] doubleArray28 = new double[] { (-1L), 'a', 1L, 10 };
        org.apache.commons.math.transform.FastFourierTransformer.verifyDataSet(doubleArray28);
        double[] doubleArray31 = org.apache.commons.math.transform.FastFourierTransformer.scaleArray(doubleArray28, (double) 10.0f);
        org.apache.commons.math.transform.FastFourierTransformer.verifyDataSet(doubleArray31);
        double[] doubleArray34 = org.apache.commons.math.transform.FastFourierTransformer.scaleArray(doubleArray31, 10.0d);
        org.apache.commons.math.complex.Complex[] complexArray35 = fastFourierTransformer0.transform2(doubleArray31);
        org.apache.commons.math.analysis.UnivariateRealFunction univariateRealFunction36 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math.complex.Complex[] complexArray40 = fastFourierTransformer0.transform(univariateRealFunction36, (double) (short) -1, 0.0d, (int) (byte) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(doubleArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray6), "[-1.0, 97.0, 1.0, 10.0]");
        org.junit.Assert.assertNotNull(complexArray8);
        org.junit.Assert.assertNotNull(complexArray10);
        org.junit.Assert.assertNotNull(complexArray12);
        org.junit.Assert.assertNotNull(doubleArray17);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray17), "[-100.0, 9700.0, 100.0, 1000.0]");
        org.junit.Assert.assertNotNull(doubleArray20);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray20), "[-100.0, 9700.0, 100.0, 1000.0]");
        org.junit.Assert.assertNotNull(doubleArray22);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray22), "[-100.0, 9700.0, 100.0, 1000.0]");
        org.junit.Assert.assertNotNull(complexArray23);
        org.junit.Assert.assertNotNull(doubleArray28);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray28), "[-100.0, 9700.0, 100.0, 1000.0]");
        org.junit.Assert.assertNotNull(doubleArray31);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray31), "[-100.0, 9700.0, 100.0, 1000.0]");
        org.junit.Assert.assertNotNull(doubleArray34);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray34), "[-100.0, 9700.0, 100.0, 1000.0]");
        org.junit.Assert.assertNotNull(complexArray35);
    }
}

