import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class RegressionTest10 {

    public static boolean debug = false;

    @Test
    public void test5001() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5001");
        double[] doubleArray2 = new double[] { 0, 1 };
        org.apache.commons.math.linear.RealMatrixImpl realMatrixImpl3 = new org.apache.commons.math.linear.RealMatrixImpl(doubleArray2);
        org.apache.commons.math.linear.RealMatrix realMatrix5 = realMatrixImpl3.scalarMultiply((double) (short) 100);
        java.lang.String str6 = realMatrixImpl3.toString();
        double double7 = realMatrixImpl3.getNorm();
        java.lang.String str8 = realMatrixImpl3.toString();
        double[][] doubleArray9 = realMatrixImpl3.getData();
        org.apache.commons.math.linear.RealMatrixImpl realMatrixImpl10 = new org.apache.commons.math.linear.RealMatrixImpl(doubleArray9);
        int int11 = realMatrixImpl10.getColumnDimension();
        org.junit.Assert.assertNotNull(doubleArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray2), "[0.0, 1.0]");
        org.junit.Assert.assertNotNull(realMatrix5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "RealMatrixImpl{{0.0},{1.0}}" + "'", str6, "RealMatrixImpl{{0.0},{1.0}}");
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 1.0d + "'", double7 == 1.0d);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "RealMatrixImpl{{0.0},{1.0}}" + "'", str8, "RealMatrixImpl{{0.0},{1.0}}");
        org.junit.Assert.assertNotNull(doubleArray9);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 1 + "'", int11 == 1);
    }

    @Test
    public void test5002() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5002");
        double[] doubleArray2 = new double[] { 0, 1 };
        org.apache.commons.math.linear.RealMatrixImpl realMatrixImpl3 = new org.apache.commons.math.linear.RealMatrixImpl(doubleArray2);
        double[] doubleArray6 = new double[] { 0, 1 };
        org.apache.commons.math.linear.RealMatrixImpl realMatrixImpl7 = new org.apache.commons.math.linear.RealMatrixImpl(doubleArray6);
        org.apache.commons.math.linear.RealMatrix realMatrix8 = realMatrixImpl3.add((org.apache.commons.math.linear.RealMatrix) realMatrixImpl7);
        double[] doubleArray11 = new double[] { 10.0d, (short) -1 };
        double[] doubleArray12 = realMatrixImpl3.preMultiply(doubleArray11);
        org.apache.commons.math.linear.RealMatrixImpl realMatrixImpl13 = new org.apache.commons.math.linear.RealMatrixImpl(doubleArray12);
        boolean boolean14 = realMatrixImpl13.isSquare();
        double[] doubleArray17 = new double[] { 0, 1 };
        org.apache.commons.math.linear.RealMatrixImpl realMatrixImpl18 = new org.apache.commons.math.linear.RealMatrixImpl(doubleArray17);
        double[] doubleArray21 = new double[] { 0, 1 };
        org.apache.commons.math.linear.RealMatrixImpl realMatrixImpl22 = new org.apache.commons.math.linear.RealMatrixImpl(doubleArray21);
        org.apache.commons.math.linear.RealMatrix realMatrix23 = realMatrixImpl18.add((org.apache.commons.math.linear.RealMatrix) realMatrixImpl22);
        boolean boolean24 = realMatrixImpl18.isSquare();
        int int25 = realMatrixImpl18.getColumnDimension();
        double[] doubleArray28 = new double[] { 0, 1 };
        org.apache.commons.math.linear.RealMatrixImpl realMatrixImpl29 = new org.apache.commons.math.linear.RealMatrixImpl(doubleArray28);
        double[] doubleArray32 = new double[] { 0, 1 };
        org.apache.commons.math.linear.RealMatrixImpl realMatrixImpl33 = new org.apache.commons.math.linear.RealMatrixImpl(doubleArray32);
        org.apache.commons.math.linear.RealMatrix realMatrix34 = realMatrixImpl29.add((org.apache.commons.math.linear.RealMatrix) realMatrixImpl33);
        double[] doubleArray37 = new double[] { 10.0d, (short) -1 };
        double[] doubleArray38 = realMatrixImpl29.preMultiply(doubleArray37);
        org.apache.commons.math.linear.RealMatrixImpl realMatrixImpl39 = new org.apache.commons.math.linear.RealMatrixImpl(doubleArray37);
        double[] doubleArray40 = realMatrixImpl18.preMultiply(doubleArray37);
        boolean boolean41 = realMatrixImpl13.equals((java.lang.Object) realMatrixImpl18);
        double[][] doubleArray42 = realMatrixImpl18.getData();
        double[] doubleArray45 = new double[] { 0, 1 };
        org.apache.commons.math.linear.RealMatrixImpl realMatrixImpl46 = new org.apache.commons.math.linear.RealMatrixImpl(doubleArray45);
        double[] doubleArray49 = new double[] { 0, 1 };
        org.apache.commons.math.linear.RealMatrixImpl realMatrixImpl50 = new org.apache.commons.math.linear.RealMatrixImpl(doubleArray49);
        org.apache.commons.math.linear.RealMatrix realMatrix51 = realMatrixImpl46.add((org.apache.commons.math.linear.RealMatrix) realMatrixImpl50);
        double[] doubleArray54 = new double[] { 10.0d, (short) -1 };
        double[] doubleArray55 = realMatrixImpl46.preMultiply(doubleArray54);
        org.apache.commons.math.linear.RealMatrixImpl realMatrixImpl56 = new org.apache.commons.math.linear.RealMatrixImpl(doubleArray55);
        boolean boolean57 = realMatrixImpl56.isSquare();
        double[] doubleArray60 = new double[] { 0, 1 };
        org.apache.commons.math.linear.RealMatrixImpl realMatrixImpl61 = new org.apache.commons.math.linear.RealMatrixImpl(doubleArray60);
        double[] doubleArray64 = new double[] { 0, 1 };
        org.apache.commons.math.linear.RealMatrixImpl realMatrixImpl65 = new org.apache.commons.math.linear.RealMatrixImpl(doubleArray64);
        org.apache.commons.math.linear.RealMatrix realMatrix66 = realMatrixImpl61.add((org.apache.commons.math.linear.RealMatrix) realMatrixImpl65);
        boolean boolean67 = realMatrixImpl61.isSquare();
        int int68 = realMatrixImpl61.getColumnDimension();
        double[] doubleArray71 = new double[] { 0, 1 };
        org.apache.commons.math.linear.RealMatrixImpl realMatrixImpl72 = new org.apache.commons.math.linear.RealMatrixImpl(doubleArray71);
        double[] doubleArray75 = new double[] { 0, 1 };
        org.apache.commons.math.linear.RealMatrixImpl realMatrixImpl76 = new org.apache.commons.math.linear.RealMatrixImpl(doubleArray75);
        org.apache.commons.math.linear.RealMatrix realMatrix77 = realMatrixImpl72.add((org.apache.commons.math.linear.RealMatrix) realMatrixImpl76);
        double[] doubleArray80 = new double[] { 10.0d, (short) -1 };
        double[] doubleArray81 = realMatrixImpl72.preMultiply(doubleArray80);
        org.apache.commons.math.linear.RealMatrixImpl realMatrixImpl82 = new org.apache.commons.math.linear.RealMatrixImpl(doubleArray80);
        double[] doubleArray83 = realMatrixImpl61.preMultiply(doubleArray80);
        boolean boolean84 = realMatrixImpl56.equals((java.lang.Object) realMatrixImpl61);
        double[][] doubleArray85 = realMatrixImpl61.getData();
        double[][] doubleArray86 = realMatrixImpl61.getData();
        org.apache.commons.math.linear.RealMatrixImpl realMatrixImpl87 = new org.apache.commons.math.linear.RealMatrixImpl(doubleArray86);
        org.apache.commons.math.linear.RealMatrix realMatrix88 = realMatrixImpl87.copy();
        boolean boolean89 = realMatrixImpl18.equals((java.lang.Object) realMatrixImpl87);
        boolean boolean90 = realMatrixImpl18.isSingular();
        double[][] doubleArray91 = realMatrixImpl18.getData();
        org.junit.Assert.assertNotNull(doubleArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray2), "[0.0, 1.0]");
        org.junit.Assert.assertNotNull(doubleArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray6), "[0.0, 1.0]");
        org.junit.Assert.assertNotNull(realMatrix8);
        org.junit.Assert.assertNotNull(doubleArray11);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray11), "[10.0, -1.0]");
        org.junit.Assert.assertNotNull(doubleArray12);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray12), "[-1.0]");
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertNotNull(doubleArray17);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray17), "[0.0, 1.0]");
        org.junit.Assert.assertNotNull(doubleArray21);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray21), "[0.0, 1.0]");
        org.junit.Assert.assertNotNull(realMatrix23);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + 1 + "'", int25 == 1);
        org.junit.Assert.assertNotNull(doubleArray28);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray28), "[0.0, 1.0]");
        org.junit.Assert.assertNotNull(doubleArray32);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray32), "[0.0, 1.0]");
        org.junit.Assert.assertNotNull(realMatrix34);
        org.junit.Assert.assertNotNull(doubleArray37);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray37), "[10.0, -1.0]");
        org.junit.Assert.assertNotNull(doubleArray38);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray38), "[-1.0]");
        org.junit.Assert.assertNotNull(doubleArray40);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray40), "[-1.0]");
        org.junit.Assert.assertTrue("'" + boolean41 + "' != '" + false + "'", boolean41 == false);
        org.junit.Assert.assertNotNull(doubleArray42);
        org.junit.Assert.assertNotNull(doubleArray45);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray45), "[0.0, 1.0]");
        org.junit.Assert.assertNotNull(doubleArray49);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray49), "[0.0, 1.0]");
        org.junit.Assert.assertNotNull(realMatrix51);
        org.junit.Assert.assertNotNull(doubleArray54);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray54), "[10.0, -1.0]");
        org.junit.Assert.assertNotNull(doubleArray55);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray55), "[-1.0]");
        org.junit.Assert.assertTrue("'" + boolean57 + "' != '" + true + "'", boolean57 == true);
        org.junit.Assert.assertNotNull(doubleArray60);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray60), "[0.0, 1.0]");
        org.junit.Assert.assertNotNull(doubleArray64);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray64), "[0.0, 1.0]");
        org.junit.Assert.assertNotNull(realMatrix66);
        org.junit.Assert.assertTrue("'" + boolean67 + "' != '" + false + "'", boolean67 == false);
        org.junit.Assert.assertTrue("'" + int68 + "' != '" + 1 + "'", int68 == 1);
        org.junit.Assert.assertNotNull(doubleArray71);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray71), "[0.0, 1.0]");
        org.junit.Assert.assertNotNull(doubleArray75);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray75), "[0.0, 1.0]");
        org.junit.Assert.assertNotNull(realMatrix77);
        org.junit.Assert.assertNotNull(doubleArray80);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray80), "[10.0, -1.0]");
        org.junit.Assert.assertNotNull(doubleArray81);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray81), "[-1.0]");
        org.junit.Assert.assertNotNull(doubleArray83);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray83), "[-1.0]");
        org.junit.Assert.assertTrue("'" + boolean84 + "' != '" + false + "'", boolean84 == false);
        org.junit.Assert.assertNotNull(doubleArray85);
        org.junit.Assert.assertNotNull(doubleArray86);
        org.junit.Assert.assertNotNull(realMatrix88);
        org.junit.Assert.assertTrue("'" + boolean89 + "' != '" + true + "'", boolean89 == true);
        org.junit.Assert.assertTrue("'" + boolean90 + "' != '" + true + "'", boolean90 == true);
        org.junit.Assert.assertNotNull(doubleArray91);
    }

    @Test
    public void test5003() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5003");
        double[] doubleArray2 = new double[] { 0, 1 };
        org.apache.commons.math.linear.RealMatrixImpl realMatrixImpl3 = new org.apache.commons.math.linear.RealMatrixImpl(doubleArray2);
        double[] doubleArray6 = new double[] { 0, 1 };
        org.apache.commons.math.linear.RealMatrixImpl realMatrixImpl7 = new org.apache.commons.math.linear.RealMatrixImpl(doubleArray6);
        org.apache.commons.math.linear.RealMatrix realMatrix8 = realMatrixImpl3.add((org.apache.commons.math.linear.RealMatrix) realMatrixImpl7);
        double[] doubleArray11 = new double[] { 0, 1 };
        org.apache.commons.math.linear.RealMatrixImpl realMatrixImpl12 = new org.apache.commons.math.linear.RealMatrixImpl(doubleArray11);
        double[] doubleArray15 = new double[] { 0, 1 };
        org.apache.commons.math.linear.RealMatrixImpl realMatrixImpl16 = new org.apache.commons.math.linear.RealMatrixImpl(doubleArray15);
        org.apache.commons.math.linear.RealMatrix realMatrix17 = realMatrixImpl12.add((org.apache.commons.math.linear.RealMatrix) realMatrixImpl16);
        org.apache.commons.math.linear.RealMatrix realMatrix18 = realMatrixImpl7.subtract((org.apache.commons.math.linear.RealMatrix) realMatrixImpl16);
        double[] doubleArray21 = new double[] { 0, 1 };
        org.apache.commons.math.linear.RealMatrixImpl realMatrixImpl22 = new org.apache.commons.math.linear.RealMatrixImpl(doubleArray21);
        double[] doubleArray25 = new double[] { 0, 1 };
        org.apache.commons.math.linear.RealMatrixImpl realMatrixImpl26 = new org.apache.commons.math.linear.RealMatrixImpl(doubleArray25);
        org.apache.commons.math.linear.RealMatrix realMatrix27 = realMatrixImpl22.add((org.apache.commons.math.linear.RealMatrix) realMatrixImpl26);
        double[] doubleArray30 = new double[] { 10.0d, (short) -1 };
        double[] doubleArray31 = realMatrixImpl22.preMultiply(doubleArray30);
        org.apache.commons.math.linear.RealMatrixImpl realMatrixImpl32 = new org.apache.commons.math.linear.RealMatrixImpl(doubleArray30);
        double[] doubleArray33 = realMatrixImpl7.preMultiply(doubleArray30);
        org.apache.commons.math.linear.RealMatrixImpl realMatrixImpl34 = new org.apache.commons.math.linear.RealMatrixImpl(doubleArray33);
        boolean boolean35 = realMatrixImpl34.isSquare();
        int int36 = realMatrixImpl34.getRowDimension();
        double double37 = realMatrixImpl34.getDeterminant();
        org.junit.Assert.assertNotNull(doubleArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray2), "[0.0, 1.0]");
        org.junit.Assert.assertNotNull(doubleArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray6), "[0.0, 1.0]");
        org.junit.Assert.assertNotNull(realMatrix8);
        org.junit.Assert.assertNotNull(doubleArray11);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray11), "[0.0, 1.0]");
        org.junit.Assert.assertNotNull(doubleArray15);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray15), "[0.0, 1.0]");
        org.junit.Assert.assertNotNull(realMatrix17);
        org.junit.Assert.assertNotNull(realMatrix18);
        org.junit.Assert.assertNotNull(doubleArray21);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray21), "[0.0, 1.0]");
        org.junit.Assert.assertNotNull(doubleArray25);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray25), "[0.0, 1.0]");
        org.junit.Assert.assertNotNull(realMatrix27);
        org.junit.Assert.assertNotNull(doubleArray30);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray30), "[10.0, -1.0]");
        org.junit.Assert.assertNotNull(doubleArray31);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray31), "[-1.0]");
        org.junit.Assert.assertNotNull(doubleArray33);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray33), "[-1.0]");
        org.junit.Assert.assertTrue("'" + boolean35 + "' != '" + true + "'", boolean35 == true);
        org.junit.Assert.assertTrue("'" + int36 + "' != '" + 1 + "'", int36 == 1);
        org.junit.Assert.assertTrue("'" + double37 + "' != '" + (-1.0d) + "'", double37 == (-1.0d));
    }

    @Test
    public void test5004() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5004");
        double[] doubleArray2 = new double[] { 0, 1 };
        org.apache.commons.math.linear.RealMatrixImpl realMatrixImpl3 = new org.apache.commons.math.linear.RealMatrixImpl(doubleArray2);
        double[] doubleArray6 = new double[] { 0, 1 };
        org.apache.commons.math.linear.RealMatrixImpl realMatrixImpl7 = new org.apache.commons.math.linear.RealMatrixImpl(doubleArray6);
        org.apache.commons.math.linear.RealMatrix realMatrix8 = realMatrixImpl3.add((org.apache.commons.math.linear.RealMatrix) realMatrixImpl7);
        boolean boolean9 = realMatrixImpl3.isSquare();
        double[][] doubleArray10 = realMatrixImpl3.getData();
        org.apache.commons.math.linear.RealMatrix realMatrix11 = realMatrixImpl3.copy();
        org.junit.Assert.assertNotNull(doubleArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray2), "[0.0, 1.0]");
        org.junit.Assert.assertNotNull(doubleArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray6), "[0.0, 1.0]");
        org.junit.Assert.assertNotNull(realMatrix8);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNotNull(doubleArray10);
        org.junit.Assert.assertNotNull(realMatrix11);
    }

    @Test
    public void test5005() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5005");
        double[] doubleArray2 = new double[] { 0, 1 };
        org.apache.commons.math.linear.RealMatrixImpl realMatrixImpl3 = new org.apache.commons.math.linear.RealMatrixImpl(doubleArray2);
        double[] doubleArray6 = new double[] { 0, 1 };
        org.apache.commons.math.linear.RealMatrixImpl realMatrixImpl7 = new org.apache.commons.math.linear.RealMatrixImpl(doubleArray6);
        org.apache.commons.math.linear.RealMatrix realMatrix8 = realMatrixImpl3.add((org.apache.commons.math.linear.RealMatrix) realMatrixImpl7);
        double[] doubleArray11 = new double[] { 0, 1 };
        org.apache.commons.math.linear.RealMatrixImpl realMatrixImpl12 = new org.apache.commons.math.linear.RealMatrixImpl(doubleArray11);
        double[] doubleArray15 = new double[] { 0, 1 };
        org.apache.commons.math.linear.RealMatrixImpl realMatrixImpl16 = new org.apache.commons.math.linear.RealMatrixImpl(doubleArray15);
        org.apache.commons.math.linear.RealMatrix realMatrix17 = realMatrixImpl12.add((org.apache.commons.math.linear.RealMatrix) realMatrixImpl16);
        org.apache.commons.math.linear.RealMatrix realMatrix18 = realMatrixImpl7.subtract((org.apache.commons.math.linear.RealMatrix) realMatrixImpl16);
        double[] doubleArray21 = new double[] { 0, 1 };
        org.apache.commons.math.linear.RealMatrixImpl realMatrixImpl22 = new org.apache.commons.math.linear.RealMatrixImpl(doubleArray21);
        double[] doubleArray25 = new double[] { 0, 1 };
        org.apache.commons.math.linear.RealMatrixImpl realMatrixImpl26 = new org.apache.commons.math.linear.RealMatrixImpl(doubleArray25);
        org.apache.commons.math.linear.RealMatrix realMatrix27 = realMatrixImpl22.add((org.apache.commons.math.linear.RealMatrix) realMatrixImpl26);
        double[] doubleArray30 = new double[] { 10.0d, (short) -1 };
        double[] doubleArray31 = realMatrixImpl22.preMultiply(doubleArray30);
        org.apache.commons.math.linear.RealMatrix realMatrix32 = realMatrixImpl16.subtract((org.apache.commons.math.linear.RealMatrix) realMatrixImpl22);
        boolean boolean33 = realMatrixImpl16.isSingular();
        boolean boolean34 = realMatrixImpl16.isSquare();
        org.apache.commons.math.linear.RealMatrix realMatrix35 = realMatrixImpl16.copy();
        int int36 = realMatrixImpl16.getColumnDimension();
        // The following exception was thrown during execution in test generation
        try {
            double[] doubleArray38 = realMatrixImpl16.getColumn((int) (short) 100);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math.linear.MatrixIndexException; message: illegal column argument");
        } catch (org.apache.commons.math.linear.MatrixIndexException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(doubleArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray2), "[0.0, 1.0]");
        org.junit.Assert.assertNotNull(doubleArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray6), "[0.0, 1.0]");
        org.junit.Assert.assertNotNull(realMatrix8);
        org.junit.Assert.assertNotNull(doubleArray11);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray11), "[0.0, 1.0]");
        org.junit.Assert.assertNotNull(doubleArray15);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray15), "[0.0, 1.0]");
        org.junit.Assert.assertNotNull(realMatrix17);
        org.junit.Assert.assertNotNull(realMatrix18);
        org.junit.Assert.assertNotNull(doubleArray21);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray21), "[0.0, 1.0]");
        org.junit.Assert.assertNotNull(doubleArray25);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray25), "[0.0, 1.0]");
        org.junit.Assert.assertNotNull(realMatrix27);
        org.junit.Assert.assertNotNull(doubleArray30);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray30), "[10.0, -1.0]");
        org.junit.Assert.assertNotNull(doubleArray31);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray31), "[-1.0]");
        org.junit.Assert.assertNotNull(realMatrix32);
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + true + "'", boolean33 == true);
        org.junit.Assert.assertTrue("'" + boolean34 + "' != '" + false + "'", boolean34 == false);
        org.junit.Assert.assertNotNull(realMatrix35);
        org.junit.Assert.assertTrue("'" + int36 + "' != '" + 1 + "'", int36 == 1);
    }

    @Test
    public void test5006() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5006");
        double[] doubleArray2 = new double[] { 0, 1 };
        org.apache.commons.math.linear.RealMatrixImpl realMatrixImpl3 = new org.apache.commons.math.linear.RealMatrixImpl(doubleArray2);
        double[] doubleArray6 = new double[] { 0, 1 };
        org.apache.commons.math.linear.RealMatrixImpl realMatrixImpl7 = new org.apache.commons.math.linear.RealMatrixImpl(doubleArray6);
        org.apache.commons.math.linear.RealMatrix realMatrix8 = realMatrixImpl3.add((org.apache.commons.math.linear.RealMatrix) realMatrixImpl7);
        double[] doubleArray11 = new double[] { 10.0d, (short) -1 };
        double[] doubleArray12 = realMatrixImpl3.preMultiply(doubleArray11);
        double[] doubleArray15 = new double[] { 0, 1 };
        org.apache.commons.math.linear.RealMatrixImpl realMatrixImpl16 = new org.apache.commons.math.linear.RealMatrixImpl(doubleArray15);
        double[] doubleArray19 = new double[] { 0, 1 };
        org.apache.commons.math.linear.RealMatrixImpl realMatrixImpl20 = new org.apache.commons.math.linear.RealMatrixImpl(doubleArray19);
        org.apache.commons.math.linear.RealMatrix realMatrix21 = realMatrixImpl16.add((org.apache.commons.math.linear.RealMatrix) realMatrixImpl20);
        double[] doubleArray24 = new double[] { 0, 1 };
        org.apache.commons.math.linear.RealMatrixImpl realMatrixImpl25 = new org.apache.commons.math.linear.RealMatrixImpl(doubleArray24);
        double[] doubleArray28 = new double[] { 0, 1 };
        org.apache.commons.math.linear.RealMatrixImpl realMatrixImpl29 = new org.apache.commons.math.linear.RealMatrixImpl(doubleArray28);
        org.apache.commons.math.linear.RealMatrix realMatrix30 = realMatrixImpl25.add((org.apache.commons.math.linear.RealMatrix) realMatrixImpl29);
        org.apache.commons.math.linear.RealMatrix realMatrix31 = realMatrixImpl20.subtract((org.apache.commons.math.linear.RealMatrix) realMatrixImpl29);
        boolean boolean32 = realMatrixImpl20.isSquare();
        org.apache.commons.math.linear.RealMatrix realMatrix33 = realMatrixImpl3.subtract((org.apache.commons.math.linear.RealMatrix) realMatrixImpl20);
        org.apache.commons.math.linear.RealMatrix realMatrix34 = realMatrixImpl20.transpose();
        double[] doubleArray36 = realMatrixImpl20.getRow((int) (byte) 0);
        double[] doubleArray39 = new double[] { 0, 1 };
        org.apache.commons.math.linear.RealMatrixImpl realMatrixImpl40 = new org.apache.commons.math.linear.RealMatrixImpl(doubleArray39);
        double[] doubleArray43 = new double[] { 0, 1 };
        org.apache.commons.math.linear.RealMatrixImpl realMatrixImpl44 = new org.apache.commons.math.linear.RealMatrixImpl(doubleArray43);
        org.apache.commons.math.linear.RealMatrix realMatrix45 = realMatrixImpl40.add((org.apache.commons.math.linear.RealMatrix) realMatrixImpl44);
        boolean boolean46 = realMatrixImpl40.isSquare();
        int int47 = realMatrixImpl40.getColumnDimension();
        double double48 = realMatrixImpl40.getNorm();
        boolean boolean49 = realMatrixImpl20.equals((java.lang.Object) realMatrixImpl40);
        boolean boolean50 = realMatrixImpl40.isSingular();
        // The following exception was thrown during execution in test generation
        try {
            double[] doubleArray52 = realMatrixImpl40.getColumn((int) (short) 1);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math.linear.MatrixIndexException; message: illegal column argument");
        } catch (org.apache.commons.math.linear.MatrixIndexException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(doubleArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray2), "[0.0, 1.0]");
        org.junit.Assert.assertNotNull(doubleArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray6), "[0.0, 1.0]");
        org.junit.Assert.assertNotNull(realMatrix8);
        org.junit.Assert.assertNotNull(doubleArray11);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray11), "[10.0, -1.0]");
        org.junit.Assert.assertNotNull(doubleArray12);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray12), "[-1.0]");
        org.junit.Assert.assertNotNull(doubleArray15);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray15), "[0.0, 1.0]");
        org.junit.Assert.assertNotNull(doubleArray19);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray19), "[0.0, 1.0]");
        org.junit.Assert.assertNotNull(realMatrix21);
        org.junit.Assert.assertNotNull(doubleArray24);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray24), "[0.0, 1.0]");
        org.junit.Assert.assertNotNull(doubleArray28);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray28), "[0.0, 1.0]");
        org.junit.Assert.assertNotNull(realMatrix30);
        org.junit.Assert.assertNotNull(realMatrix31);
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + false + "'", boolean32 == false);
        org.junit.Assert.assertNotNull(realMatrix33);
        org.junit.Assert.assertNotNull(realMatrix34);
        org.junit.Assert.assertNotNull(doubleArray36);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray36), "[0.0]");
        org.junit.Assert.assertNotNull(doubleArray39);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray39), "[0.0, 1.0]");
        org.junit.Assert.assertNotNull(doubleArray43);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray43), "[0.0, 1.0]");
        org.junit.Assert.assertNotNull(realMatrix45);
        org.junit.Assert.assertTrue("'" + boolean46 + "' != '" + false + "'", boolean46 == false);
        org.junit.Assert.assertTrue("'" + int47 + "' != '" + 1 + "'", int47 == 1);
        org.junit.Assert.assertTrue("'" + double48 + "' != '" + 1.0d + "'", double48 == 1.0d);
        org.junit.Assert.assertTrue("'" + boolean49 + "' != '" + true + "'", boolean49 == true);
        org.junit.Assert.assertTrue("'" + boolean50 + "' != '" + true + "'", boolean50 == true);
    }

    @Test
    public void test5007() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5007");
        double[] doubleArray2 = new double[] { 0, 1 };
        org.apache.commons.math.linear.RealMatrixImpl realMatrixImpl3 = new org.apache.commons.math.linear.RealMatrixImpl(doubleArray2);
        double[] doubleArray6 = new double[] { 0, 1 };
        org.apache.commons.math.linear.RealMatrixImpl realMatrixImpl7 = new org.apache.commons.math.linear.RealMatrixImpl(doubleArray6);
        org.apache.commons.math.linear.RealMatrix realMatrix8 = realMatrixImpl3.add((org.apache.commons.math.linear.RealMatrix) realMatrixImpl7);
        double[] doubleArray11 = new double[] { 10.0d, (short) -1 };
        double[] doubleArray12 = realMatrixImpl3.preMultiply(doubleArray11);
        org.apache.commons.math.linear.RealMatrixImpl realMatrixImpl13 = new org.apache.commons.math.linear.RealMatrixImpl(doubleArray11);
        java.lang.String str14 = realMatrixImpl13.toString();
        double[] doubleArray17 = new double[] { 0, 1 };
        org.apache.commons.math.linear.RealMatrixImpl realMatrixImpl18 = new org.apache.commons.math.linear.RealMatrixImpl(doubleArray17);
        org.apache.commons.math.linear.RealMatrix realMatrix20 = realMatrixImpl18.scalarMultiply((double) (short) 100);
        double[][] doubleArray21 = realMatrixImpl18.getDataRef();
        org.apache.commons.math.linear.RealMatrix realMatrix22 = realMatrixImpl13.subtract((org.apache.commons.math.linear.RealMatrix) realMatrixImpl18);
        double double23 = realMatrixImpl13.getNorm();
        double[] doubleArray26 = new double[] { 0, 1 };
        org.apache.commons.math.linear.RealMatrixImpl realMatrixImpl27 = new org.apache.commons.math.linear.RealMatrixImpl(doubleArray26);
        double[] doubleArray30 = new double[] { 0, 1 };
        org.apache.commons.math.linear.RealMatrixImpl realMatrixImpl31 = new org.apache.commons.math.linear.RealMatrixImpl(doubleArray30);
        org.apache.commons.math.linear.RealMatrix realMatrix32 = realMatrixImpl27.add((org.apache.commons.math.linear.RealMatrix) realMatrixImpl31);
        double[] doubleArray35 = new double[] { 10.0d, (short) -1 };
        double[] doubleArray36 = realMatrixImpl27.preMultiply(doubleArray35);
        org.apache.commons.math.linear.RealMatrixImpl realMatrixImpl37 = new org.apache.commons.math.linear.RealMatrixImpl(doubleArray35);
        boolean boolean38 = realMatrixImpl37.isSingular();
        org.apache.commons.math.linear.RealMatrix realMatrix39 = realMatrixImpl37.transpose();
        int int40 = realMatrixImpl37.getColumnDimension();
        boolean boolean41 = realMatrixImpl13.equals((java.lang.Object) int40);
        double[] doubleArray44 = new double[] { 0, 1 };
        org.apache.commons.math.linear.RealMatrixImpl realMatrixImpl45 = new org.apache.commons.math.linear.RealMatrixImpl(doubleArray44);
        double[] doubleArray48 = new double[] { 0, 1 };
        org.apache.commons.math.linear.RealMatrixImpl realMatrixImpl49 = new org.apache.commons.math.linear.RealMatrixImpl(doubleArray48);
        org.apache.commons.math.linear.RealMatrix realMatrix50 = realMatrixImpl45.add((org.apache.commons.math.linear.RealMatrix) realMatrixImpl49);
        boolean boolean51 = realMatrixImpl45.isSquare();
        int int52 = realMatrixImpl45.getColumnDimension();
        double double53 = realMatrixImpl45.getNorm();
        java.lang.String str54 = realMatrixImpl45.toString();
        boolean boolean55 = realMatrixImpl13.equals((java.lang.Object) realMatrixImpl45);
        double[][] doubleArray56 = realMatrixImpl13.getDataRef();
        java.lang.Class<?> wildcardClass57 = realMatrixImpl13.getClass();
        org.junit.Assert.assertNotNull(doubleArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray2), "[0.0, 1.0]");
        org.junit.Assert.assertNotNull(doubleArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray6), "[0.0, 1.0]");
        org.junit.Assert.assertNotNull(realMatrix8);
        org.junit.Assert.assertNotNull(doubleArray11);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray11), "[10.0, -1.0]");
        org.junit.Assert.assertNotNull(doubleArray12);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray12), "[-1.0]");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "RealMatrixImpl{{10.0},{-1.0}}" + "'", str14, "RealMatrixImpl{{10.0},{-1.0}}");
        org.junit.Assert.assertNotNull(doubleArray17);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray17), "[0.0, 1.0]");
        org.junit.Assert.assertNotNull(realMatrix20);
        org.junit.Assert.assertNotNull(doubleArray21);
        org.junit.Assert.assertNotNull(realMatrix22);
        org.junit.Assert.assertTrue("'" + double23 + "' != '" + 11.0d + "'", double23 == 11.0d);
        org.junit.Assert.assertNotNull(doubleArray26);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray26), "[0.0, 1.0]");
        org.junit.Assert.assertNotNull(doubleArray30);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray30), "[0.0, 1.0]");
        org.junit.Assert.assertNotNull(realMatrix32);
        org.junit.Assert.assertNotNull(doubleArray35);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray35), "[10.0, -1.0]");
        org.junit.Assert.assertNotNull(doubleArray36);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray36), "[-1.0]");
        org.junit.Assert.assertTrue("'" + boolean38 + "' != '" + true + "'", boolean38 == true);
        org.junit.Assert.assertNotNull(realMatrix39);
        org.junit.Assert.assertTrue("'" + int40 + "' != '" + 1 + "'", int40 == 1);
        org.junit.Assert.assertTrue("'" + boolean41 + "' != '" + false + "'", boolean41 == false);
        org.junit.Assert.assertNotNull(doubleArray44);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray44), "[0.0, 1.0]");
        org.junit.Assert.assertNotNull(doubleArray48);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray48), "[0.0, 1.0]");
        org.junit.Assert.assertNotNull(realMatrix50);
        org.junit.Assert.assertTrue("'" + boolean51 + "' != '" + false + "'", boolean51 == false);
        org.junit.Assert.assertTrue("'" + int52 + "' != '" + 1 + "'", int52 == 1);
        org.junit.Assert.assertTrue("'" + double53 + "' != '" + 1.0d + "'", double53 == 1.0d);
        org.junit.Assert.assertEquals("'" + str54 + "' != '" + "RealMatrixImpl{{0.0},{1.0}}" + "'", str54, "RealMatrixImpl{{0.0},{1.0}}");
        org.junit.Assert.assertTrue("'" + boolean55 + "' != '" + false + "'", boolean55 == false);
        org.junit.Assert.assertNotNull(doubleArray56);
        org.junit.Assert.assertNotNull(wildcardClass57);
    }

    @Test
    public void test5008() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5008");
        double[] doubleArray2 = new double[] { 0, 1 };
        org.apache.commons.math.linear.RealMatrixImpl realMatrixImpl3 = new org.apache.commons.math.linear.RealMatrixImpl(doubleArray2);
        double[] doubleArray6 = new double[] { 0, 1 };
        org.apache.commons.math.linear.RealMatrixImpl realMatrixImpl7 = new org.apache.commons.math.linear.RealMatrixImpl(doubleArray6);
        org.apache.commons.math.linear.RealMatrix realMatrix8 = realMatrixImpl3.add((org.apache.commons.math.linear.RealMatrix) realMatrixImpl7);
        double[] doubleArray11 = new double[] { 0, 1 };
        org.apache.commons.math.linear.RealMatrixImpl realMatrixImpl12 = new org.apache.commons.math.linear.RealMatrixImpl(doubleArray11);
        double[] doubleArray15 = new double[] { 0, 1 };
        org.apache.commons.math.linear.RealMatrixImpl realMatrixImpl16 = new org.apache.commons.math.linear.RealMatrixImpl(doubleArray15);
        org.apache.commons.math.linear.RealMatrix realMatrix17 = realMatrixImpl12.add((org.apache.commons.math.linear.RealMatrix) realMatrixImpl16);
        org.apache.commons.math.linear.RealMatrix realMatrix18 = realMatrixImpl7.subtract((org.apache.commons.math.linear.RealMatrix) realMatrixImpl16);
        boolean boolean19 = realMatrixImpl7.isSquare();
        int int20 = realMatrixImpl7.getColumnDimension();
        double[] doubleArray23 = new double[] { 0, 1 };
        org.apache.commons.math.linear.RealMatrixImpl realMatrixImpl24 = new org.apache.commons.math.linear.RealMatrixImpl(doubleArray23);
        double[] doubleArray27 = new double[] { 0, 1 };
        org.apache.commons.math.linear.RealMatrixImpl realMatrixImpl28 = new org.apache.commons.math.linear.RealMatrixImpl(doubleArray27);
        org.apache.commons.math.linear.RealMatrix realMatrix29 = realMatrixImpl24.add((org.apache.commons.math.linear.RealMatrix) realMatrixImpl28);
        double[] doubleArray32 = new double[] { 0, 1 };
        org.apache.commons.math.linear.RealMatrixImpl realMatrixImpl33 = new org.apache.commons.math.linear.RealMatrixImpl(doubleArray32);
        double[] doubleArray36 = new double[] { 0, 1 };
        org.apache.commons.math.linear.RealMatrixImpl realMatrixImpl37 = new org.apache.commons.math.linear.RealMatrixImpl(doubleArray36);
        org.apache.commons.math.linear.RealMatrix realMatrix38 = realMatrixImpl33.add((org.apache.commons.math.linear.RealMatrix) realMatrixImpl37);
        org.apache.commons.math.linear.RealMatrix realMatrix39 = realMatrixImpl28.subtract((org.apache.commons.math.linear.RealMatrix) realMatrixImpl37);
        org.apache.commons.math.linear.RealMatrix realMatrix40 = realMatrixImpl7.subtract((org.apache.commons.math.linear.RealMatrix) realMatrixImpl28);
        org.apache.commons.math.linear.RealMatrix realMatrix42 = realMatrixImpl28.scalarMultiply((double) 10);
        org.apache.commons.math.linear.RealMatrix realMatrix44 = realMatrixImpl28.scalarMultiply((double) ' ');
        org.apache.commons.math.linear.RealMatrix realMatrix46 = realMatrixImpl28.scalarAdd((double) 0.0f);
        java.lang.String str47 = realMatrixImpl28.toString();
        double[] doubleArray50 = new double[] { 0, 1 };
        org.apache.commons.math.linear.RealMatrixImpl realMatrixImpl51 = new org.apache.commons.math.linear.RealMatrixImpl(doubleArray50);
        org.apache.commons.math.linear.RealMatrix realMatrix53 = realMatrixImpl51.scalarMultiply((double) (short) 100);
        double[] doubleArray55 = realMatrixImpl51.getRow(0);
        org.apache.commons.math.linear.RealMatrixImpl realMatrixImpl56 = new org.apache.commons.math.linear.RealMatrixImpl(doubleArray55);
        org.apache.commons.math.linear.RealMatrix realMatrix57 = realMatrixImpl56.copy();
        org.apache.commons.math.linear.RealMatrix realMatrix58 = realMatrixImpl28.multiply(realMatrix57);
        org.junit.Assert.assertNotNull(doubleArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray2), "[0.0, 1.0]");
        org.junit.Assert.assertNotNull(doubleArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray6), "[0.0, 1.0]");
        org.junit.Assert.assertNotNull(realMatrix8);
        org.junit.Assert.assertNotNull(doubleArray11);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray11), "[0.0, 1.0]");
        org.junit.Assert.assertNotNull(doubleArray15);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray15), "[0.0, 1.0]");
        org.junit.Assert.assertNotNull(realMatrix17);
        org.junit.Assert.assertNotNull(realMatrix18);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 1 + "'", int20 == 1);
        org.junit.Assert.assertNotNull(doubleArray23);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray23), "[0.0, 1.0]");
        org.junit.Assert.assertNotNull(doubleArray27);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray27), "[0.0, 1.0]");
        org.junit.Assert.assertNotNull(realMatrix29);
        org.junit.Assert.assertNotNull(doubleArray32);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray32), "[0.0, 1.0]");
        org.junit.Assert.assertNotNull(doubleArray36);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray36), "[0.0, 1.0]");
        org.junit.Assert.assertNotNull(realMatrix38);
        org.junit.Assert.assertNotNull(realMatrix39);
        org.junit.Assert.assertNotNull(realMatrix40);
        org.junit.Assert.assertNotNull(realMatrix42);
        org.junit.Assert.assertNotNull(realMatrix44);
        org.junit.Assert.assertNotNull(realMatrix46);
        org.junit.Assert.assertEquals("'" + str47 + "' != '" + "RealMatrixImpl{{0.0},{1.0}}" + "'", str47, "RealMatrixImpl{{0.0},{1.0}}");
        org.junit.Assert.assertNotNull(doubleArray50);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray50), "[0.0, 1.0]");
        org.junit.Assert.assertNotNull(realMatrix53);
        org.junit.Assert.assertNotNull(doubleArray55);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray55), "[0.0]");
        org.junit.Assert.assertNotNull(realMatrix57);
        org.junit.Assert.assertNotNull(realMatrix58);
    }

    @Test
    public void test5009() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5009");
        double[] doubleArray2 = new double[] { 0, 1 };
        org.apache.commons.math.linear.RealMatrixImpl realMatrixImpl3 = new org.apache.commons.math.linear.RealMatrixImpl(doubleArray2);
        double[] doubleArray6 = new double[] { 0, 1 };
        org.apache.commons.math.linear.RealMatrixImpl realMatrixImpl7 = new org.apache.commons.math.linear.RealMatrixImpl(doubleArray6);
        org.apache.commons.math.linear.RealMatrix realMatrix8 = realMatrixImpl3.add((org.apache.commons.math.linear.RealMatrix) realMatrixImpl7);
        double[] doubleArray11 = new double[] { 0, 1 };
        org.apache.commons.math.linear.RealMatrixImpl realMatrixImpl12 = new org.apache.commons.math.linear.RealMatrixImpl(doubleArray11);
        double[] doubleArray15 = new double[] { 0, 1 };
        org.apache.commons.math.linear.RealMatrixImpl realMatrixImpl16 = new org.apache.commons.math.linear.RealMatrixImpl(doubleArray15);
        org.apache.commons.math.linear.RealMatrix realMatrix17 = realMatrixImpl12.add((org.apache.commons.math.linear.RealMatrix) realMatrixImpl16);
        org.apache.commons.math.linear.RealMatrix realMatrix18 = realMatrixImpl7.subtract((org.apache.commons.math.linear.RealMatrix) realMatrixImpl16);
        double[] doubleArray21 = new double[] { 0, 1 };
        org.apache.commons.math.linear.RealMatrixImpl realMatrixImpl22 = new org.apache.commons.math.linear.RealMatrixImpl(doubleArray21);
        double[] doubleArray25 = new double[] { 0, 1 };
        org.apache.commons.math.linear.RealMatrixImpl realMatrixImpl26 = new org.apache.commons.math.linear.RealMatrixImpl(doubleArray25);
        org.apache.commons.math.linear.RealMatrix realMatrix27 = realMatrixImpl22.add((org.apache.commons.math.linear.RealMatrix) realMatrixImpl26);
        double[] doubleArray30 = new double[] { 10.0d, (short) -1 };
        double[] doubleArray31 = realMatrixImpl22.preMultiply(doubleArray30);
        org.apache.commons.math.linear.RealMatrixImpl realMatrixImpl32 = new org.apache.commons.math.linear.RealMatrixImpl(doubleArray30);
        double[] doubleArray33 = realMatrixImpl7.preMultiply(doubleArray30);
        org.apache.commons.math.linear.RealMatrixImpl realMatrixImpl34 = new org.apache.commons.math.linear.RealMatrixImpl(doubleArray33);
        boolean boolean35 = realMatrixImpl34.isSquare();
        double[] doubleArray38 = new double[] { 0, 1 };
        org.apache.commons.math.linear.RealMatrixImpl realMatrixImpl39 = new org.apache.commons.math.linear.RealMatrixImpl(doubleArray38);
        double[] doubleArray42 = new double[] { 0, 1 };
        org.apache.commons.math.linear.RealMatrixImpl realMatrixImpl43 = new org.apache.commons.math.linear.RealMatrixImpl(doubleArray42);
        org.apache.commons.math.linear.RealMatrix realMatrix44 = realMatrixImpl39.add((org.apache.commons.math.linear.RealMatrix) realMatrixImpl43);
        org.apache.commons.math.linear.RealMatrix realMatrix46 = realMatrixImpl39.scalarMultiply((double) (short) -1);
        boolean boolean47 = realMatrixImpl34.equals((java.lang.Object) realMatrixImpl39);
        org.apache.commons.math.linear.RealMatrix realMatrix48 = realMatrixImpl39.copy();
        boolean boolean49 = realMatrixImpl39.isSingular();
        // The following exception was thrown during execution in test generation
        try {
            double double50 = realMatrixImpl39.getTrace();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: matrix is not square");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(doubleArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray2), "[0.0, 1.0]");
        org.junit.Assert.assertNotNull(doubleArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray6), "[0.0, 1.0]");
        org.junit.Assert.assertNotNull(realMatrix8);
        org.junit.Assert.assertNotNull(doubleArray11);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray11), "[0.0, 1.0]");
        org.junit.Assert.assertNotNull(doubleArray15);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray15), "[0.0, 1.0]");
        org.junit.Assert.assertNotNull(realMatrix17);
        org.junit.Assert.assertNotNull(realMatrix18);
        org.junit.Assert.assertNotNull(doubleArray21);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray21), "[0.0, 1.0]");
        org.junit.Assert.assertNotNull(doubleArray25);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray25), "[0.0, 1.0]");
        org.junit.Assert.assertNotNull(realMatrix27);
        org.junit.Assert.assertNotNull(doubleArray30);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray30), "[10.0, -1.0]");
        org.junit.Assert.assertNotNull(doubleArray31);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray31), "[-1.0]");
        org.junit.Assert.assertNotNull(doubleArray33);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray33), "[-1.0]");
        org.junit.Assert.assertTrue("'" + boolean35 + "' != '" + true + "'", boolean35 == true);
        org.junit.Assert.assertNotNull(doubleArray38);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray38), "[0.0, 1.0]");
        org.junit.Assert.assertNotNull(doubleArray42);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray42), "[0.0, 1.0]");
        org.junit.Assert.assertNotNull(realMatrix44);
        org.junit.Assert.assertNotNull(realMatrix46);
        org.junit.Assert.assertTrue("'" + boolean47 + "' != '" + false + "'", boolean47 == false);
        org.junit.Assert.assertNotNull(realMatrix48);
        org.junit.Assert.assertTrue("'" + boolean49 + "' != '" + true + "'", boolean49 == true);
    }

    @Test
    public void test5010() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5010");
        double[] doubleArray2 = new double[] { 0, 1 };
        org.apache.commons.math.linear.RealMatrixImpl realMatrixImpl3 = new org.apache.commons.math.linear.RealMatrixImpl(doubleArray2);
        double[] doubleArray6 = new double[] { 0, 1 };
        org.apache.commons.math.linear.RealMatrixImpl realMatrixImpl7 = new org.apache.commons.math.linear.RealMatrixImpl(doubleArray6);
        org.apache.commons.math.linear.RealMatrix realMatrix8 = realMatrixImpl3.add((org.apache.commons.math.linear.RealMatrix) realMatrixImpl7);
        double[] doubleArray11 = new double[] { 0, 1 };
        org.apache.commons.math.linear.RealMatrixImpl realMatrixImpl12 = new org.apache.commons.math.linear.RealMatrixImpl(doubleArray11);
        double[] doubleArray15 = new double[] { 0, 1 };
        org.apache.commons.math.linear.RealMatrixImpl realMatrixImpl16 = new org.apache.commons.math.linear.RealMatrixImpl(doubleArray15);
        org.apache.commons.math.linear.RealMatrix realMatrix17 = realMatrixImpl12.add((org.apache.commons.math.linear.RealMatrix) realMatrixImpl16);
        org.apache.commons.math.linear.RealMatrix realMatrix18 = realMatrixImpl7.subtract((org.apache.commons.math.linear.RealMatrix) realMatrixImpl16);
        double double19 = realMatrixImpl7.getNorm();
        int int20 = realMatrixImpl7.getRowDimension();
        org.apache.commons.math.linear.RealMatrix realMatrix21 = realMatrixImpl7.copy();
        int int22 = realMatrixImpl7.getRowDimension();
        org.apache.commons.math.linear.RealMatrix realMatrix24 = realMatrixImpl7.scalarAdd((double) 1L);
        org.junit.Assert.assertNotNull(doubleArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray2), "[0.0, 1.0]");
        org.junit.Assert.assertNotNull(doubleArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray6), "[0.0, 1.0]");
        org.junit.Assert.assertNotNull(realMatrix8);
        org.junit.Assert.assertNotNull(doubleArray11);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray11), "[0.0, 1.0]");
        org.junit.Assert.assertNotNull(doubleArray15);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray15), "[0.0, 1.0]");
        org.junit.Assert.assertNotNull(realMatrix17);
        org.junit.Assert.assertNotNull(realMatrix18);
        org.junit.Assert.assertTrue("'" + double19 + "' != '" + 1.0d + "'", double19 == 1.0d);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 2 + "'", int20 == 2);
        org.junit.Assert.assertNotNull(realMatrix21);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 2 + "'", int22 == 2);
        org.junit.Assert.assertNotNull(realMatrix24);
    }

    @Test
    public void test5011() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5011");
        double[] doubleArray2 = new double[] { 0, 1 };
        org.apache.commons.math.linear.RealMatrixImpl realMatrixImpl3 = new org.apache.commons.math.linear.RealMatrixImpl(doubleArray2);
        double[] doubleArray6 = new double[] { 0, 1 };
        org.apache.commons.math.linear.RealMatrixImpl realMatrixImpl7 = new org.apache.commons.math.linear.RealMatrixImpl(doubleArray6);
        org.apache.commons.math.linear.RealMatrix realMatrix8 = realMatrixImpl3.add((org.apache.commons.math.linear.RealMatrix) realMatrixImpl7);
        double[] doubleArray11 = new double[] { 0, 1 };
        org.apache.commons.math.linear.RealMatrixImpl realMatrixImpl12 = new org.apache.commons.math.linear.RealMatrixImpl(doubleArray11);
        double[] doubleArray15 = new double[] { 0, 1 };
        org.apache.commons.math.linear.RealMatrixImpl realMatrixImpl16 = new org.apache.commons.math.linear.RealMatrixImpl(doubleArray15);
        org.apache.commons.math.linear.RealMatrix realMatrix17 = realMatrixImpl12.add((org.apache.commons.math.linear.RealMatrix) realMatrixImpl16);
        org.apache.commons.math.linear.RealMatrix realMatrix18 = realMatrixImpl7.subtract((org.apache.commons.math.linear.RealMatrix) realMatrixImpl16);
        boolean boolean19 = realMatrixImpl7.isSquare();
        double double20 = realMatrixImpl7.getNorm();
        boolean boolean21 = realMatrixImpl7.isSingular();
        org.apache.commons.math.linear.RealMatrix realMatrix23 = realMatrixImpl7.scalarAdd((double) ' ');
        double[][] doubleArray24 = realMatrixImpl7.getDataRef();
        org.apache.commons.math.linear.RealMatrix realMatrix26 = realMatrixImpl7.scalarMultiply((double) '4');
        boolean boolean27 = realMatrixImpl7.isSquare();
        org.junit.Assert.assertNotNull(doubleArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray2), "[0.0, 1.0]");
        org.junit.Assert.assertNotNull(doubleArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray6), "[0.0, 1.0]");
        org.junit.Assert.assertNotNull(realMatrix8);
        org.junit.Assert.assertNotNull(doubleArray11);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray11), "[0.0, 1.0]");
        org.junit.Assert.assertNotNull(doubleArray15);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray15), "[0.0, 1.0]");
        org.junit.Assert.assertNotNull(realMatrix17);
        org.junit.Assert.assertNotNull(realMatrix18);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertTrue("'" + double20 + "' != '" + 1.0d + "'", double20 == 1.0d);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + true + "'", boolean21 == true);
        org.junit.Assert.assertNotNull(realMatrix23);
        org.junit.Assert.assertNotNull(doubleArray24);
        org.junit.Assert.assertNotNull(realMatrix26);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + false + "'", boolean27 == false);
    }

    @Test
    public void test5012() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5012");
        double[] doubleArray5 = new double[] { (-1L), 100.0d, 1.0f, 10L, (-1.0f) };
        double[] doubleArray11 = new double[] { (-1L), 100.0d, 1.0f, 10L, (-1.0f) };
        double[] doubleArray17 = new double[] { (-1L), 100.0d, 1.0f, 10L, (-1.0f) };
        double[][] doubleArray18 = new double[][] { doubleArray5, doubleArray11, doubleArray17 };
        org.apache.commons.math.linear.RealMatrixImpl realMatrixImpl19 = new org.apache.commons.math.linear.RealMatrixImpl(doubleArray18);
        org.apache.commons.math.linear.RealMatrixImpl realMatrixImpl20 = new org.apache.commons.math.linear.RealMatrixImpl(doubleArray18);
        int int21 = realMatrixImpl20.getRowDimension();
        double[][] doubleArray22 = realMatrixImpl20.getData();
        double double23 = realMatrixImpl20.getNorm();
        org.junit.Assert.assertNotNull(doubleArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray5), "[-1.0, 100.0, 1.0, 10.0, -1.0]");
        org.junit.Assert.assertNotNull(doubleArray11);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray11), "[-1.0, 100.0, 1.0, 10.0, -1.0]");
        org.junit.Assert.assertNotNull(doubleArray17);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray17), "[-1.0, 100.0, 1.0, 10.0, -1.0]");
        org.junit.Assert.assertNotNull(doubleArray18);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 3 + "'", int21 == 3);
        org.junit.Assert.assertNotNull(doubleArray22);
        org.junit.Assert.assertTrue("'" + double23 + "' != '" + 300.0d + "'", double23 == 300.0d);
    }

    @Test
    public void test5013() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5013");
        double[] doubleArray2 = new double[] { 0, 1 };
        org.apache.commons.math.linear.RealMatrixImpl realMatrixImpl3 = new org.apache.commons.math.linear.RealMatrixImpl(doubleArray2);
        double double4 = realMatrixImpl3.getNorm();
        double[] doubleArray7 = new double[] { 0, 1 };
        org.apache.commons.math.linear.RealMatrixImpl realMatrixImpl8 = new org.apache.commons.math.linear.RealMatrixImpl(doubleArray7);
        double double9 = realMatrixImpl8.getNorm();
        org.apache.commons.math.linear.RealMatrix realMatrix10 = realMatrixImpl8.transpose();
        double[] doubleArray12 = realMatrixImpl8.getColumn(0);
        double[] doubleArray13 = realMatrixImpl3.preMultiply(doubleArray12);
        org.apache.commons.math.linear.RealMatrixImpl realMatrixImpl14 = new org.apache.commons.math.linear.RealMatrixImpl(doubleArray12);
        double[][] doubleArray15 = realMatrixImpl14.getDataRef();
        double[] doubleArray18 = new double[] { 0, 1 };
        org.apache.commons.math.linear.RealMatrixImpl realMatrixImpl19 = new org.apache.commons.math.linear.RealMatrixImpl(doubleArray18);
        double[] doubleArray22 = new double[] { 0, 1 };
        org.apache.commons.math.linear.RealMatrixImpl realMatrixImpl23 = new org.apache.commons.math.linear.RealMatrixImpl(doubleArray22);
        org.apache.commons.math.linear.RealMatrix realMatrix24 = realMatrixImpl19.add((org.apache.commons.math.linear.RealMatrix) realMatrixImpl23);
        boolean boolean25 = realMatrixImpl19.isSquare();
        double[][] doubleArray26 = realMatrixImpl19.getData();
        boolean boolean27 = realMatrixImpl14.equals((java.lang.Object) realMatrixImpl19);
        org.apache.commons.math.linear.RealMatrix realMatrix28 = realMatrixImpl19.copy();
        org.junit.Assert.assertNotNull(doubleArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray2), "[0.0, 1.0]");
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 1.0d + "'", double4 == 1.0d);
        org.junit.Assert.assertNotNull(doubleArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray7), "[0.0, 1.0]");
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 1.0d + "'", double9 == 1.0d);
        org.junit.Assert.assertNotNull(realMatrix10);
        org.junit.Assert.assertNotNull(doubleArray12);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray12), "[0.0, 1.0]");
        org.junit.Assert.assertNotNull(doubleArray13);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray13), "[1.0]");
        org.junit.Assert.assertNotNull(doubleArray15);
        org.junit.Assert.assertNotNull(doubleArray18);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray18), "[0.0, 1.0]");
        org.junit.Assert.assertNotNull(doubleArray22);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray22), "[0.0, 1.0]");
        org.junit.Assert.assertNotNull(realMatrix24);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
        org.junit.Assert.assertNotNull(doubleArray26);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + true + "'", boolean27 == true);
        org.junit.Assert.assertNotNull(realMatrix28);
    }

    @Test
    public void test5014() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5014");
        double[] doubleArray2 = new double[] { 0, 1 };
        org.apache.commons.math.linear.RealMatrixImpl realMatrixImpl3 = new org.apache.commons.math.linear.RealMatrixImpl(doubleArray2);
        double[] doubleArray6 = new double[] { 0, 1 };
        org.apache.commons.math.linear.RealMatrixImpl realMatrixImpl7 = new org.apache.commons.math.linear.RealMatrixImpl(doubleArray6);
        org.apache.commons.math.linear.RealMatrix realMatrix8 = realMatrixImpl3.add((org.apache.commons.math.linear.RealMatrix) realMatrixImpl7);
        double[] doubleArray11 = new double[] { 10.0d, (short) -1 };
        double[] doubleArray12 = realMatrixImpl3.preMultiply(doubleArray11);
        org.apache.commons.math.linear.RealMatrixImpl realMatrixImpl13 = new org.apache.commons.math.linear.RealMatrixImpl(doubleArray12);
        org.apache.commons.math.linear.RealMatrixImpl realMatrixImpl14 = new org.apache.commons.math.linear.RealMatrixImpl(doubleArray12);
        org.apache.commons.math.linear.RealMatrixImpl realMatrixImpl15 = new org.apache.commons.math.linear.RealMatrixImpl(doubleArray12);
        org.apache.commons.math.linear.RealMatrixImpl realMatrixImpl16 = new org.apache.commons.math.linear.RealMatrixImpl(doubleArray12);
        double double17 = realMatrixImpl16.getDeterminant();
        // The following exception was thrown during execution in test generation
        try {
            double[] doubleArray19 = realMatrixImpl16.getRow((int) (short) 1);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math.linear.MatrixIndexException; message: illegal row argument");
        } catch (org.apache.commons.math.linear.MatrixIndexException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(doubleArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray2), "[0.0, 1.0]");
        org.junit.Assert.assertNotNull(doubleArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray6), "[0.0, 1.0]");
        org.junit.Assert.assertNotNull(realMatrix8);
        org.junit.Assert.assertNotNull(doubleArray11);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray11), "[10.0, -1.0]");
        org.junit.Assert.assertNotNull(doubleArray12);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray12), "[-1.0]");
        org.junit.Assert.assertTrue("'" + double17 + "' != '" + (-1.0d) + "'", double17 == (-1.0d));
    }

    @Test
    public void test5015() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5015");
        double[] doubleArray2 = new double[] { 0, 1 };
        org.apache.commons.math.linear.RealMatrixImpl realMatrixImpl3 = new org.apache.commons.math.linear.RealMatrixImpl(doubleArray2);
        double[] doubleArray6 = new double[] { 0, 1 };
        org.apache.commons.math.linear.RealMatrixImpl realMatrixImpl7 = new org.apache.commons.math.linear.RealMatrixImpl(doubleArray6);
        org.apache.commons.math.linear.RealMatrix realMatrix8 = realMatrixImpl3.add((org.apache.commons.math.linear.RealMatrix) realMatrixImpl7);
        double[] doubleArray11 = new double[] { 10.0d, (short) -1 };
        double[] doubleArray12 = realMatrixImpl3.preMultiply(doubleArray11);
        org.apache.commons.math.linear.RealMatrixImpl realMatrixImpl13 = new org.apache.commons.math.linear.RealMatrixImpl(doubleArray11);
        org.apache.commons.math.linear.RealMatrix realMatrix15 = realMatrixImpl13.scalarMultiply(100.0d);
        int int16 = realMatrixImpl13.getRowDimension();
        double[] doubleArray19 = new double[] { 0, 1 };
        org.apache.commons.math.linear.RealMatrixImpl realMatrixImpl20 = new org.apache.commons.math.linear.RealMatrixImpl(doubleArray19);
        double[] doubleArray23 = new double[] { 0, 1 };
        org.apache.commons.math.linear.RealMatrixImpl realMatrixImpl24 = new org.apache.commons.math.linear.RealMatrixImpl(doubleArray23);
        org.apache.commons.math.linear.RealMatrix realMatrix25 = realMatrixImpl20.add((org.apache.commons.math.linear.RealMatrix) realMatrixImpl24);
        double[] doubleArray28 = new double[] { 10.0d, (short) -1 };
        double[] doubleArray29 = realMatrixImpl20.preMultiply(doubleArray28);
        org.apache.commons.math.linear.RealMatrixImpl realMatrixImpl30 = new org.apache.commons.math.linear.RealMatrixImpl(doubleArray29);
        boolean boolean31 = realMatrixImpl30.isSquare();
        int int32 = realMatrixImpl30.getColumnDimension();
        org.apache.commons.math.linear.RealMatrix realMatrix33 = realMatrixImpl30.transpose();
        double double34 = realMatrixImpl30.getTrace();
        boolean boolean35 = realMatrixImpl30.isSingular();
        org.apache.commons.math.linear.RealMatrix realMatrix36 = realMatrixImpl13.multiply((org.apache.commons.math.linear.RealMatrix) realMatrixImpl30);
        int int37 = realMatrixImpl13.getRowDimension();
        double[] doubleArray40 = new double[] { 0, 1 };
        org.apache.commons.math.linear.RealMatrixImpl realMatrixImpl41 = new org.apache.commons.math.linear.RealMatrixImpl(doubleArray40);
        double double42 = realMatrixImpl41.getNorm();
        double[][] doubleArray43 = realMatrixImpl41.getDataRef();
        double[] doubleArray45 = realMatrixImpl41.getRow(1);
        double[] doubleArray48 = new double[] { 0, 1 };
        org.apache.commons.math.linear.RealMatrixImpl realMatrixImpl49 = new org.apache.commons.math.linear.RealMatrixImpl(doubleArray48);
        double[] doubleArray52 = new double[] { 0, 1 };
        org.apache.commons.math.linear.RealMatrixImpl realMatrixImpl53 = new org.apache.commons.math.linear.RealMatrixImpl(doubleArray52);
        org.apache.commons.math.linear.RealMatrix realMatrix54 = realMatrixImpl49.add((org.apache.commons.math.linear.RealMatrix) realMatrixImpl53);
        double[] doubleArray57 = new double[] { 0, 1 };
        org.apache.commons.math.linear.RealMatrixImpl realMatrixImpl58 = new org.apache.commons.math.linear.RealMatrixImpl(doubleArray57);
        double[] doubleArray61 = new double[] { 0, 1 };
        org.apache.commons.math.linear.RealMatrixImpl realMatrixImpl62 = new org.apache.commons.math.linear.RealMatrixImpl(doubleArray61);
        org.apache.commons.math.linear.RealMatrix realMatrix63 = realMatrixImpl58.add((org.apache.commons.math.linear.RealMatrix) realMatrixImpl62);
        org.apache.commons.math.linear.RealMatrix realMatrix64 = realMatrixImpl53.subtract((org.apache.commons.math.linear.RealMatrix) realMatrixImpl62);
        boolean boolean65 = realMatrixImpl53.isSquare();
        double double66 = realMatrixImpl53.getNorm();
        double[] doubleArray68 = realMatrixImpl53.getRow((int) (short) 1);
        org.apache.commons.math.linear.RealMatrix realMatrix69 = realMatrixImpl41.subtract((org.apache.commons.math.linear.RealMatrix) realMatrixImpl53);
        boolean boolean70 = realMatrixImpl13.equals((java.lang.Object) realMatrixImpl41);
        org.junit.Assert.assertNotNull(doubleArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray2), "[0.0, 1.0]");
        org.junit.Assert.assertNotNull(doubleArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray6), "[0.0, 1.0]");
        org.junit.Assert.assertNotNull(realMatrix8);
        org.junit.Assert.assertNotNull(doubleArray11);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray11), "[10.0, -1.0]");
        org.junit.Assert.assertNotNull(doubleArray12);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray12), "[-1.0]");
        org.junit.Assert.assertNotNull(realMatrix15);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 2 + "'", int16 == 2);
        org.junit.Assert.assertNotNull(doubleArray19);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray19), "[0.0, 1.0]");
        org.junit.Assert.assertNotNull(doubleArray23);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray23), "[0.0, 1.0]");
        org.junit.Assert.assertNotNull(realMatrix25);
        org.junit.Assert.assertNotNull(doubleArray28);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray28), "[10.0, -1.0]");
        org.junit.Assert.assertNotNull(doubleArray29);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray29), "[-1.0]");
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + true + "'", boolean31 == true);
        org.junit.Assert.assertTrue("'" + int32 + "' != '" + 1 + "'", int32 == 1);
        org.junit.Assert.assertNotNull(realMatrix33);
        org.junit.Assert.assertTrue("'" + double34 + "' != '" + (-1.0d) + "'", double34 == (-1.0d));
        org.junit.Assert.assertTrue("'" + boolean35 + "' != '" + false + "'", boolean35 == false);
        org.junit.Assert.assertNotNull(realMatrix36);
        org.junit.Assert.assertTrue("'" + int37 + "' != '" + 2 + "'", int37 == 2);
        org.junit.Assert.assertNotNull(doubleArray40);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray40), "[0.0, 1.0]");
        org.junit.Assert.assertTrue("'" + double42 + "' != '" + 1.0d + "'", double42 == 1.0d);
        org.junit.Assert.assertNotNull(doubleArray43);
        org.junit.Assert.assertNotNull(doubleArray45);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray45), "[1.0]");
        org.junit.Assert.assertNotNull(doubleArray48);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray48), "[0.0, 1.0]");
        org.junit.Assert.assertNotNull(doubleArray52);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray52), "[0.0, 1.0]");
        org.junit.Assert.assertNotNull(realMatrix54);
        org.junit.Assert.assertNotNull(doubleArray57);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray57), "[0.0, 1.0]");
        org.junit.Assert.assertNotNull(doubleArray61);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray61), "[0.0, 1.0]");
        org.junit.Assert.assertNotNull(realMatrix63);
        org.junit.Assert.assertNotNull(realMatrix64);
        org.junit.Assert.assertTrue("'" + boolean65 + "' != '" + false + "'", boolean65 == false);
        org.junit.Assert.assertTrue("'" + double66 + "' != '" + 1.0d + "'", double66 == 1.0d);
        org.junit.Assert.assertNotNull(doubleArray68);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray68), "[1.0]");
        org.junit.Assert.assertNotNull(realMatrix69);
        org.junit.Assert.assertTrue("'" + boolean70 + "' != '" + false + "'", boolean70 == false);
    }

    @Test
    public void test5016() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5016");
        org.apache.commons.math.linear.RealMatrixImpl realMatrixImpl2 = new org.apache.commons.math.linear.RealMatrixImpl((int) (short) 1, (int) (short) 1);
    }

    @Test
    public void test5017() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5017");
        double[] doubleArray2 = new double[] { 0, 1 };
        org.apache.commons.math.linear.RealMatrixImpl realMatrixImpl3 = new org.apache.commons.math.linear.RealMatrixImpl(doubleArray2);
        double double4 = realMatrixImpl3.getNorm();
        double[] doubleArray7 = new double[] { 0, 1 };
        org.apache.commons.math.linear.RealMatrixImpl realMatrixImpl8 = new org.apache.commons.math.linear.RealMatrixImpl(doubleArray7);
        double double9 = realMatrixImpl8.getNorm();
        org.apache.commons.math.linear.RealMatrix realMatrix10 = realMatrixImpl8.transpose();
        double[] doubleArray12 = realMatrixImpl8.getColumn(0);
        double[] doubleArray13 = realMatrixImpl3.preMultiply(doubleArray12);
        org.apache.commons.math.linear.RealMatrix realMatrix15 = realMatrixImpl3.scalarAdd((double) (short) 10);
        org.apache.commons.math.linear.RealMatrix realMatrix16 = realMatrixImpl3.copy();
        boolean boolean17 = realMatrixImpl3.isSingular();
        int int18 = realMatrixImpl3.getRowDimension();
        int[] intArray19 = null;
        org.apache.commons.math.linear.RealMatrixImpl realMatrixImpl22 = new org.apache.commons.math.linear.RealMatrixImpl((int) ' ', 5);
        int[] intArray26 = new int[] { (short) 0, (short) 1, (byte) 1 };
        int[] intArray28 = new int[] { 2 };
        org.apache.commons.math.linear.RealMatrix realMatrix29 = realMatrixImpl22.getSubMatrix(intArray26, intArray28);
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math.linear.RealMatrix realMatrix30 = realMatrixImpl3.getSubMatrix(intArray19, intArray28);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(doubleArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray2), "[0.0, 1.0]");
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 1.0d + "'", double4 == 1.0d);
        org.junit.Assert.assertNotNull(doubleArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray7), "[0.0, 1.0]");
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 1.0d + "'", double9 == 1.0d);
        org.junit.Assert.assertNotNull(realMatrix10);
        org.junit.Assert.assertNotNull(doubleArray12);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray12), "[0.0, 1.0]");
        org.junit.Assert.assertNotNull(doubleArray13);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray13), "[1.0]");
        org.junit.Assert.assertNotNull(realMatrix15);
        org.junit.Assert.assertNotNull(realMatrix16);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 2 + "'", int18 == 2);
        org.junit.Assert.assertNotNull(intArray26);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray26), "[0, 1, 1]");
        org.junit.Assert.assertNotNull(intArray28);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray28), "[2]");
        org.junit.Assert.assertNotNull(realMatrix29);
    }

    @Test
    public void test5018() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5018");
        double[] doubleArray2 = new double[] { 0, 1 };
        org.apache.commons.math.linear.RealMatrixImpl realMatrixImpl3 = new org.apache.commons.math.linear.RealMatrixImpl(doubleArray2);
        double[] doubleArray6 = new double[] { 0, 1 };
        org.apache.commons.math.linear.RealMatrixImpl realMatrixImpl7 = new org.apache.commons.math.linear.RealMatrixImpl(doubleArray6);
        org.apache.commons.math.linear.RealMatrix realMatrix8 = realMatrixImpl3.add((org.apache.commons.math.linear.RealMatrix) realMatrixImpl7);
        double[] doubleArray11 = new double[] { 10.0d, (short) -1 };
        double[] doubleArray12 = realMatrixImpl3.preMultiply(doubleArray11);
        org.apache.commons.math.linear.RealMatrixImpl realMatrixImpl13 = new org.apache.commons.math.linear.RealMatrixImpl(doubleArray12);
        boolean boolean14 = realMatrixImpl13.isSquare();
        double[] doubleArray17 = new double[] { 0, 1 };
        org.apache.commons.math.linear.RealMatrixImpl realMatrixImpl18 = new org.apache.commons.math.linear.RealMatrixImpl(doubleArray17);
        double[] doubleArray21 = new double[] { 0, 1 };
        org.apache.commons.math.linear.RealMatrixImpl realMatrixImpl22 = new org.apache.commons.math.linear.RealMatrixImpl(doubleArray21);
        org.apache.commons.math.linear.RealMatrix realMatrix23 = realMatrixImpl18.add((org.apache.commons.math.linear.RealMatrix) realMatrixImpl22);
        boolean boolean24 = realMatrixImpl18.isSquare();
        int int25 = realMatrixImpl18.getColumnDimension();
        double[] doubleArray28 = new double[] { 0, 1 };
        org.apache.commons.math.linear.RealMatrixImpl realMatrixImpl29 = new org.apache.commons.math.linear.RealMatrixImpl(doubleArray28);
        double[] doubleArray32 = new double[] { 0, 1 };
        org.apache.commons.math.linear.RealMatrixImpl realMatrixImpl33 = new org.apache.commons.math.linear.RealMatrixImpl(doubleArray32);
        org.apache.commons.math.linear.RealMatrix realMatrix34 = realMatrixImpl29.add((org.apache.commons.math.linear.RealMatrix) realMatrixImpl33);
        double[] doubleArray37 = new double[] { 10.0d, (short) -1 };
        double[] doubleArray38 = realMatrixImpl29.preMultiply(doubleArray37);
        org.apache.commons.math.linear.RealMatrixImpl realMatrixImpl39 = new org.apache.commons.math.linear.RealMatrixImpl(doubleArray37);
        double[] doubleArray40 = realMatrixImpl18.preMultiply(doubleArray37);
        boolean boolean41 = realMatrixImpl13.equals((java.lang.Object) realMatrixImpl18);
        double[] doubleArray44 = new double[] { 0, 1 };
        org.apache.commons.math.linear.RealMatrixImpl realMatrixImpl45 = new org.apache.commons.math.linear.RealMatrixImpl(doubleArray44);
        double[] doubleArray48 = new double[] { 0, 1 };
        org.apache.commons.math.linear.RealMatrixImpl realMatrixImpl49 = new org.apache.commons.math.linear.RealMatrixImpl(doubleArray48);
        org.apache.commons.math.linear.RealMatrix realMatrix50 = realMatrixImpl45.add((org.apache.commons.math.linear.RealMatrix) realMatrixImpl49);
        double[] doubleArray53 = new double[] { 10.0d, (short) -1 };
        double[] doubleArray54 = realMatrixImpl45.preMultiply(doubleArray53);
        double[] doubleArray55 = realMatrixImpl13.preMultiply(doubleArray54);
        double[][] doubleArray56 = realMatrixImpl13.getData();
        org.apache.commons.math.linear.RealMatrixImpl realMatrixImpl57 = new org.apache.commons.math.linear.RealMatrixImpl(doubleArray56);
        org.apache.commons.math.linear.RealMatrix realMatrix58 = realMatrixImpl57.copy();
        org.junit.Assert.assertNotNull(doubleArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray2), "[0.0, 1.0]");
        org.junit.Assert.assertNotNull(doubleArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray6), "[0.0, 1.0]");
        org.junit.Assert.assertNotNull(realMatrix8);
        org.junit.Assert.assertNotNull(doubleArray11);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray11), "[10.0, -1.0]");
        org.junit.Assert.assertNotNull(doubleArray12);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray12), "[-1.0]");
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertNotNull(doubleArray17);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray17), "[0.0, 1.0]");
        org.junit.Assert.assertNotNull(doubleArray21);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray21), "[0.0, 1.0]");
        org.junit.Assert.assertNotNull(realMatrix23);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + 1 + "'", int25 == 1);
        org.junit.Assert.assertNotNull(doubleArray28);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray28), "[0.0, 1.0]");
        org.junit.Assert.assertNotNull(doubleArray32);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray32), "[0.0, 1.0]");
        org.junit.Assert.assertNotNull(realMatrix34);
        org.junit.Assert.assertNotNull(doubleArray37);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray37), "[10.0, -1.0]");
        org.junit.Assert.assertNotNull(doubleArray38);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray38), "[-1.0]");
        org.junit.Assert.assertNotNull(doubleArray40);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray40), "[-1.0]");
        org.junit.Assert.assertTrue("'" + boolean41 + "' != '" + false + "'", boolean41 == false);
        org.junit.Assert.assertNotNull(doubleArray44);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray44), "[0.0, 1.0]");
        org.junit.Assert.assertNotNull(doubleArray48);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray48), "[0.0, 1.0]");
        org.junit.Assert.assertNotNull(realMatrix50);
        org.junit.Assert.assertNotNull(doubleArray53);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray53), "[10.0, -1.0]");
        org.junit.Assert.assertNotNull(doubleArray54);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray54), "[-1.0]");
        org.junit.Assert.assertNotNull(doubleArray55);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray55), "[1.0]");
        org.junit.Assert.assertNotNull(doubleArray56);
        org.junit.Assert.assertNotNull(realMatrix58);
    }

    @Test
    public void test5019() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5019");
        double[] doubleArray2 = new double[] { 0, 1 };
        org.apache.commons.math.linear.RealMatrixImpl realMatrixImpl3 = new org.apache.commons.math.linear.RealMatrixImpl(doubleArray2);
        double double4 = realMatrixImpl3.getNorm();
        org.apache.commons.math.linear.RealMatrix realMatrix5 = realMatrixImpl3.transpose();
        double[][] doubleArray6 = realMatrixImpl3.getDataRef();
        org.apache.commons.math.linear.RealMatrix realMatrix8 = realMatrixImpl3.scalarAdd(0.0d);
        double[] doubleArray11 = new double[] { 0, 1 };
        org.apache.commons.math.linear.RealMatrixImpl realMatrixImpl12 = new org.apache.commons.math.linear.RealMatrixImpl(doubleArray11);
        double[] doubleArray15 = new double[] { 0, 1 };
        org.apache.commons.math.linear.RealMatrixImpl realMatrixImpl16 = new org.apache.commons.math.linear.RealMatrixImpl(doubleArray15);
        org.apache.commons.math.linear.RealMatrix realMatrix17 = realMatrixImpl12.add((org.apache.commons.math.linear.RealMatrix) realMatrixImpl16);
        org.apache.commons.math.linear.RealMatrix realMatrix18 = realMatrixImpl3.add((org.apache.commons.math.linear.RealMatrix) realMatrixImpl12);
        // The following exception was thrown during execution in test generation
        try {
            double[] doubleArray20 = realMatrixImpl12.getColumn((int) (short) 10);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math.linear.MatrixIndexException; message: illegal column argument");
        } catch (org.apache.commons.math.linear.MatrixIndexException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(doubleArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray2), "[0.0, 1.0]");
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 1.0d + "'", double4 == 1.0d);
        org.junit.Assert.assertNotNull(realMatrix5);
        org.junit.Assert.assertNotNull(doubleArray6);
        org.junit.Assert.assertNotNull(realMatrix8);
        org.junit.Assert.assertNotNull(doubleArray11);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray11), "[0.0, 1.0]");
        org.junit.Assert.assertNotNull(doubleArray15);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray15), "[0.0, 1.0]");
        org.junit.Assert.assertNotNull(realMatrix17);
        org.junit.Assert.assertNotNull(realMatrix18);
    }

    @Test
    public void test5020() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5020");
        double[] doubleArray2 = new double[] { 0, 1 };
        org.apache.commons.math.linear.RealMatrixImpl realMatrixImpl3 = new org.apache.commons.math.linear.RealMatrixImpl(doubleArray2);
        double[] doubleArray6 = new double[] { 0, 1 };
        org.apache.commons.math.linear.RealMatrixImpl realMatrixImpl7 = new org.apache.commons.math.linear.RealMatrixImpl(doubleArray6);
        org.apache.commons.math.linear.RealMatrix realMatrix8 = realMatrixImpl3.add((org.apache.commons.math.linear.RealMatrix) realMatrixImpl7);
        double[] doubleArray11 = new double[] { 10.0d, (short) -1 };
        double[] doubleArray12 = realMatrixImpl3.preMultiply(doubleArray11);
        org.apache.commons.math.linear.RealMatrixImpl realMatrixImpl13 = new org.apache.commons.math.linear.RealMatrixImpl(doubleArray11);
        boolean boolean14 = realMatrixImpl13.isSingular();
        double[][] doubleArray15 = realMatrixImpl13.getDataRef();
        org.apache.commons.math.linear.RealMatrixImpl realMatrixImpl16 = new org.apache.commons.math.linear.RealMatrixImpl(doubleArray15);
        double double17 = realMatrixImpl16.getNorm();
        double[][] doubleArray18 = realMatrixImpl16.getDataRef();
        org.apache.commons.math.linear.RealMatrixImpl realMatrixImpl19 = new org.apache.commons.math.linear.RealMatrixImpl(doubleArray18);
        org.apache.commons.math.linear.RealMatrixImpl realMatrixImpl20 = new org.apache.commons.math.linear.RealMatrixImpl(doubleArray18);
        org.apache.commons.math.linear.RealMatrix realMatrix21 = realMatrixImpl20.transpose();
        // The following exception was thrown during execution in test generation
        try {
            double double22 = realMatrixImpl20.getDeterminant();
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math.linear.InvalidMatrixException; message: matrix is not square");
        } catch (org.apache.commons.math.linear.InvalidMatrixException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(doubleArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray2), "[0.0, 1.0]");
        org.junit.Assert.assertNotNull(doubleArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray6), "[0.0, 1.0]");
        org.junit.Assert.assertNotNull(realMatrix8);
        org.junit.Assert.assertNotNull(doubleArray11);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray11), "[10.0, -1.0]");
        org.junit.Assert.assertNotNull(doubleArray12);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray12), "[-1.0]");
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertNotNull(doubleArray15);
        org.junit.Assert.assertTrue("'" + double17 + "' != '" + 11.0d + "'", double17 == 11.0d);
        org.junit.Assert.assertNotNull(doubleArray18);
        org.junit.Assert.assertNotNull(realMatrix21);
    }

    @Test
    public void test5021() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5021");
        double[] doubleArray2 = new double[] { 0, 1 };
        org.apache.commons.math.linear.RealMatrixImpl realMatrixImpl3 = new org.apache.commons.math.linear.RealMatrixImpl(doubleArray2);
        double[] doubleArray6 = new double[] { 0, 1 };
        org.apache.commons.math.linear.RealMatrixImpl realMatrixImpl7 = new org.apache.commons.math.linear.RealMatrixImpl(doubleArray6);
        org.apache.commons.math.linear.RealMatrix realMatrix8 = realMatrixImpl3.add((org.apache.commons.math.linear.RealMatrix) realMatrixImpl7);
        double[] doubleArray11 = new double[] { 0, 1 };
        org.apache.commons.math.linear.RealMatrixImpl realMatrixImpl12 = new org.apache.commons.math.linear.RealMatrixImpl(doubleArray11);
        double[] doubleArray15 = new double[] { 0, 1 };
        org.apache.commons.math.linear.RealMatrixImpl realMatrixImpl16 = new org.apache.commons.math.linear.RealMatrixImpl(doubleArray15);
        org.apache.commons.math.linear.RealMatrix realMatrix17 = realMatrixImpl12.add((org.apache.commons.math.linear.RealMatrix) realMatrixImpl16);
        org.apache.commons.math.linear.RealMatrix realMatrix18 = realMatrixImpl7.subtract((org.apache.commons.math.linear.RealMatrix) realMatrixImpl16);
        boolean boolean19 = realMatrixImpl7.isSquare();
        double double20 = realMatrixImpl7.getNorm();
        boolean boolean21 = realMatrixImpl7.isSingular();
        org.apache.commons.math.linear.RealMatrix realMatrix23 = realMatrixImpl7.scalarAdd((double) ' ');
        double[] doubleArray26 = new double[] { 0, 1 };
        org.apache.commons.math.linear.RealMatrixImpl realMatrixImpl27 = new org.apache.commons.math.linear.RealMatrixImpl(doubleArray26);
        double[] doubleArray30 = new double[] { 0, 1 };
        org.apache.commons.math.linear.RealMatrixImpl realMatrixImpl31 = new org.apache.commons.math.linear.RealMatrixImpl(doubleArray30);
        org.apache.commons.math.linear.RealMatrix realMatrix32 = realMatrixImpl27.add((org.apache.commons.math.linear.RealMatrix) realMatrixImpl31);
        double[] doubleArray35 = new double[] { 0, 1 };
        org.apache.commons.math.linear.RealMatrixImpl realMatrixImpl36 = new org.apache.commons.math.linear.RealMatrixImpl(doubleArray35);
        double[] doubleArray39 = new double[] { 0, 1 };
        org.apache.commons.math.linear.RealMatrixImpl realMatrixImpl40 = new org.apache.commons.math.linear.RealMatrixImpl(doubleArray39);
        org.apache.commons.math.linear.RealMatrix realMatrix41 = realMatrixImpl36.add((org.apache.commons.math.linear.RealMatrix) realMatrixImpl40);
        org.apache.commons.math.linear.RealMatrix realMatrix42 = realMatrixImpl31.subtract((org.apache.commons.math.linear.RealMatrix) realMatrixImpl40);
        org.apache.commons.math.linear.RealMatrix realMatrix43 = realMatrixImpl40.transpose();
        org.apache.commons.math.linear.RealMatrix realMatrix44 = realMatrixImpl7.subtract((org.apache.commons.math.linear.RealMatrix) realMatrixImpl40);
        double[] doubleArray47 = new double[] { 0, 1 };
        org.apache.commons.math.linear.RealMatrixImpl realMatrixImpl48 = new org.apache.commons.math.linear.RealMatrixImpl(doubleArray47);
        double[] doubleArray51 = new double[] { 0, 1 };
        org.apache.commons.math.linear.RealMatrixImpl realMatrixImpl52 = new org.apache.commons.math.linear.RealMatrixImpl(doubleArray51);
        org.apache.commons.math.linear.RealMatrix realMatrix53 = realMatrixImpl48.add((org.apache.commons.math.linear.RealMatrix) realMatrixImpl52);
        double[][] doubleArray54 = realMatrixImpl48.getData();
        org.apache.commons.math.linear.RealMatrixImpl realMatrixImpl55 = new org.apache.commons.math.linear.RealMatrixImpl(doubleArray54);
        org.apache.commons.math.linear.RealMatrix realMatrix56 = realMatrixImpl40.subtract((org.apache.commons.math.linear.RealMatrix) realMatrixImpl55);
        org.apache.commons.math.linear.RealMatrix realMatrix57 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math.linear.RealMatrix realMatrix58 = realMatrixImpl55.solve(realMatrix57);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(doubleArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray2), "[0.0, 1.0]");
        org.junit.Assert.assertNotNull(doubleArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray6), "[0.0, 1.0]");
        org.junit.Assert.assertNotNull(realMatrix8);
        org.junit.Assert.assertNotNull(doubleArray11);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray11), "[0.0, 1.0]");
        org.junit.Assert.assertNotNull(doubleArray15);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray15), "[0.0, 1.0]");
        org.junit.Assert.assertNotNull(realMatrix17);
        org.junit.Assert.assertNotNull(realMatrix18);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertTrue("'" + double20 + "' != '" + 1.0d + "'", double20 == 1.0d);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + true + "'", boolean21 == true);
        org.junit.Assert.assertNotNull(realMatrix23);
        org.junit.Assert.assertNotNull(doubleArray26);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray26), "[0.0, 1.0]");
        org.junit.Assert.assertNotNull(doubleArray30);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray30), "[0.0, 1.0]");
        org.junit.Assert.assertNotNull(realMatrix32);
        org.junit.Assert.assertNotNull(doubleArray35);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray35), "[0.0, 1.0]");
        org.junit.Assert.assertNotNull(doubleArray39);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray39), "[0.0, 1.0]");
        org.junit.Assert.assertNotNull(realMatrix41);
        org.junit.Assert.assertNotNull(realMatrix42);
        org.junit.Assert.assertNotNull(realMatrix43);
        org.junit.Assert.assertNotNull(realMatrix44);
        org.junit.Assert.assertNotNull(doubleArray47);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray47), "[0.0, 1.0]");
        org.junit.Assert.assertNotNull(doubleArray51);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray51), "[0.0, 1.0]");
        org.junit.Assert.assertNotNull(realMatrix53);
        org.junit.Assert.assertNotNull(doubleArray54);
        org.junit.Assert.assertNotNull(realMatrix56);
    }

    @Test
    public void test5022() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5022");
        double[] doubleArray2 = new double[] { 0, 1 };
        org.apache.commons.math.linear.RealMatrixImpl realMatrixImpl3 = new org.apache.commons.math.linear.RealMatrixImpl(doubleArray2);
        double[] doubleArray6 = new double[] { 0, 1 };
        org.apache.commons.math.linear.RealMatrixImpl realMatrixImpl7 = new org.apache.commons.math.linear.RealMatrixImpl(doubleArray6);
        org.apache.commons.math.linear.RealMatrix realMatrix8 = realMatrixImpl3.add((org.apache.commons.math.linear.RealMatrix) realMatrixImpl7);
        double[] doubleArray11 = new double[] { 10.0d, (short) -1 };
        double[] doubleArray12 = realMatrixImpl3.preMultiply(doubleArray11);
        org.apache.commons.math.linear.RealMatrixImpl realMatrixImpl13 = new org.apache.commons.math.linear.RealMatrixImpl(doubleArray12);
        org.apache.commons.math.linear.RealMatrixImpl realMatrixImpl14 = new org.apache.commons.math.linear.RealMatrixImpl(doubleArray12);
        org.apache.commons.math.linear.RealMatrixImpl realMatrixImpl15 = new org.apache.commons.math.linear.RealMatrixImpl(doubleArray12);
        int int16 = realMatrixImpl15.getColumnDimension();
        double[][] doubleArray17 = realMatrixImpl15.getData();
        double[][] doubleArray18 = realMatrixImpl15.getDataRef();
        double[][] doubleArray19 = realMatrixImpl15.getData();
        org.apache.commons.math.linear.RealMatrix realMatrix20 = realMatrixImpl15.transpose();
        java.lang.String str21 = realMatrixImpl15.toString();
        java.lang.String str22 = realMatrixImpl15.toString();
        double[] doubleArray25 = new double[] { 0, 1 };
        org.apache.commons.math.linear.RealMatrixImpl realMatrixImpl26 = new org.apache.commons.math.linear.RealMatrixImpl(doubleArray25);
        double double27 = realMatrixImpl26.getNorm();
        boolean boolean28 = realMatrixImpl26.isSingular();
        double[] doubleArray31 = new double[] { 0, 1 };
        org.apache.commons.math.linear.RealMatrixImpl realMatrixImpl32 = new org.apache.commons.math.linear.RealMatrixImpl(doubleArray31);
        double[] doubleArray35 = new double[] { 0, 1 };
        org.apache.commons.math.linear.RealMatrixImpl realMatrixImpl36 = new org.apache.commons.math.linear.RealMatrixImpl(doubleArray35);
        org.apache.commons.math.linear.RealMatrix realMatrix37 = realMatrixImpl32.add((org.apache.commons.math.linear.RealMatrix) realMatrixImpl36);
        double[] doubleArray40 = new double[] { 0, 1 };
        org.apache.commons.math.linear.RealMatrixImpl realMatrixImpl41 = new org.apache.commons.math.linear.RealMatrixImpl(doubleArray40);
        double[] doubleArray44 = new double[] { 0, 1 };
        org.apache.commons.math.linear.RealMatrixImpl realMatrixImpl45 = new org.apache.commons.math.linear.RealMatrixImpl(doubleArray44);
        org.apache.commons.math.linear.RealMatrix realMatrix46 = realMatrixImpl41.add((org.apache.commons.math.linear.RealMatrix) realMatrixImpl45);
        org.apache.commons.math.linear.RealMatrix realMatrix47 = realMatrixImpl36.subtract((org.apache.commons.math.linear.RealMatrix) realMatrixImpl45);
        boolean boolean48 = realMatrixImpl36.isSquare();
        int int49 = realMatrixImpl36.getColumnDimension();
        double[] doubleArray52 = new double[] { 0, 1 };
        org.apache.commons.math.linear.RealMatrixImpl realMatrixImpl53 = new org.apache.commons.math.linear.RealMatrixImpl(doubleArray52);
        double[] doubleArray56 = new double[] { 0, 1 };
        org.apache.commons.math.linear.RealMatrixImpl realMatrixImpl57 = new org.apache.commons.math.linear.RealMatrixImpl(doubleArray56);
        org.apache.commons.math.linear.RealMatrix realMatrix58 = realMatrixImpl53.add((org.apache.commons.math.linear.RealMatrix) realMatrixImpl57);
        double[] doubleArray61 = new double[] { 0, 1 };
        org.apache.commons.math.linear.RealMatrixImpl realMatrixImpl62 = new org.apache.commons.math.linear.RealMatrixImpl(doubleArray61);
        double[] doubleArray65 = new double[] { 0, 1 };
        org.apache.commons.math.linear.RealMatrixImpl realMatrixImpl66 = new org.apache.commons.math.linear.RealMatrixImpl(doubleArray65);
        org.apache.commons.math.linear.RealMatrix realMatrix67 = realMatrixImpl62.add((org.apache.commons.math.linear.RealMatrix) realMatrixImpl66);
        org.apache.commons.math.linear.RealMatrix realMatrix68 = realMatrixImpl57.subtract((org.apache.commons.math.linear.RealMatrix) realMatrixImpl66);
        org.apache.commons.math.linear.RealMatrix realMatrix69 = realMatrixImpl36.subtract((org.apache.commons.math.linear.RealMatrix) realMatrixImpl57);
        double double70 = realMatrixImpl36.getNorm();
        boolean boolean71 = realMatrixImpl36.isSquare();
        org.apache.commons.math.linear.RealMatrix realMatrix72 = realMatrixImpl26.subtract((org.apache.commons.math.linear.RealMatrix) realMatrixImpl36);
        org.apache.commons.math.linear.RealMatrix realMatrix74 = realMatrixImpl26.scalarAdd((double) 0L);
        int int75 = realMatrixImpl26.getColumnDimension();
        boolean boolean76 = realMatrixImpl15.equals((java.lang.Object) realMatrixImpl26);
        org.junit.Assert.assertNotNull(doubleArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray2), "[0.0, 1.0]");
        org.junit.Assert.assertNotNull(doubleArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray6), "[0.0, 1.0]");
        org.junit.Assert.assertNotNull(realMatrix8);
        org.junit.Assert.assertNotNull(doubleArray11);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray11), "[10.0, -1.0]");
        org.junit.Assert.assertNotNull(doubleArray12);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray12), "[-1.0]");
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 1 + "'", int16 == 1);
        org.junit.Assert.assertNotNull(doubleArray17);
        org.junit.Assert.assertNotNull(doubleArray18);
        org.junit.Assert.assertNotNull(doubleArray19);
        org.junit.Assert.assertNotNull(realMatrix20);
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "RealMatrixImpl{{-1.0}}" + "'", str21, "RealMatrixImpl{{-1.0}}");
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "RealMatrixImpl{{-1.0}}" + "'", str22, "RealMatrixImpl{{-1.0}}");
        org.junit.Assert.assertNotNull(doubleArray25);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray25), "[0.0, 1.0]");
        org.junit.Assert.assertTrue("'" + double27 + "' != '" + 1.0d + "'", double27 == 1.0d);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + true + "'", boolean28 == true);
        org.junit.Assert.assertNotNull(doubleArray31);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray31), "[0.0, 1.0]");
        org.junit.Assert.assertNotNull(doubleArray35);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray35), "[0.0, 1.0]");
        org.junit.Assert.assertNotNull(realMatrix37);
        org.junit.Assert.assertNotNull(doubleArray40);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray40), "[0.0, 1.0]");
        org.junit.Assert.assertNotNull(doubleArray44);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray44), "[0.0, 1.0]");
        org.junit.Assert.assertNotNull(realMatrix46);
        org.junit.Assert.assertNotNull(realMatrix47);
        org.junit.Assert.assertTrue("'" + boolean48 + "' != '" + false + "'", boolean48 == false);
        org.junit.Assert.assertTrue("'" + int49 + "' != '" + 1 + "'", int49 == 1);
        org.junit.Assert.assertNotNull(doubleArray52);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray52), "[0.0, 1.0]");
        org.junit.Assert.assertNotNull(doubleArray56);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray56), "[0.0, 1.0]");
        org.junit.Assert.assertNotNull(realMatrix58);
        org.junit.Assert.assertNotNull(doubleArray61);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray61), "[0.0, 1.0]");
        org.junit.Assert.assertNotNull(doubleArray65);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray65), "[0.0, 1.0]");
        org.junit.Assert.assertNotNull(realMatrix67);
        org.junit.Assert.assertNotNull(realMatrix68);
        org.junit.Assert.assertNotNull(realMatrix69);
        org.junit.Assert.assertTrue("'" + double70 + "' != '" + 1.0d + "'", double70 == 1.0d);
        org.junit.Assert.assertTrue("'" + boolean71 + "' != '" + false + "'", boolean71 == false);
        org.junit.Assert.assertNotNull(realMatrix72);
        org.junit.Assert.assertNotNull(realMatrix74);
        org.junit.Assert.assertTrue("'" + int75 + "' != '" + 1 + "'", int75 == 1);
        org.junit.Assert.assertTrue("'" + boolean76 + "' != '" + false + "'", boolean76 == false);
    }

    @Test
    public void test5023() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5023");
        double[] doubleArray5 = new double[] { (short) 10, 1.0d, 0.0f, (-1.0f), 0.0d };
        org.apache.commons.math.linear.RealMatrixImpl realMatrixImpl6 = new org.apache.commons.math.linear.RealMatrixImpl(doubleArray5);
        org.apache.commons.math.linear.RealMatrix realMatrix8 = realMatrixImpl6.getRowMatrix(0);
        boolean boolean9 = realMatrixImpl6.isSingular();
        double[] doubleArray11 = realMatrixImpl6.getRow(3);
        org.apache.commons.math.linear.RealMatrixImpl realMatrixImpl12 = new org.apache.commons.math.linear.RealMatrixImpl(doubleArray11);
        double[] doubleArray15 = new double[] { 0, 1 };
        org.apache.commons.math.linear.RealMatrixImpl realMatrixImpl16 = new org.apache.commons.math.linear.RealMatrixImpl(doubleArray15);
        double[] doubleArray19 = new double[] { 0, 1 };
        org.apache.commons.math.linear.RealMatrixImpl realMatrixImpl20 = new org.apache.commons.math.linear.RealMatrixImpl(doubleArray19);
        org.apache.commons.math.linear.RealMatrix realMatrix21 = realMatrixImpl16.add((org.apache.commons.math.linear.RealMatrix) realMatrixImpl20);
        double[] doubleArray24 = new double[] { 0, 1 };
        org.apache.commons.math.linear.RealMatrixImpl realMatrixImpl25 = new org.apache.commons.math.linear.RealMatrixImpl(doubleArray24);
        double[] doubleArray28 = new double[] { 0, 1 };
        org.apache.commons.math.linear.RealMatrixImpl realMatrixImpl29 = new org.apache.commons.math.linear.RealMatrixImpl(doubleArray28);
        org.apache.commons.math.linear.RealMatrix realMatrix30 = realMatrixImpl25.add((org.apache.commons.math.linear.RealMatrix) realMatrixImpl29);
        org.apache.commons.math.linear.RealMatrix realMatrix31 = realMatrixImpl20.subtract((org.apache.commons.math.linear.RealMatrix) realMatrixImpl29);
        boolean boolean32 = realMatrixImpl20.isSquare();
        double double33 = realMatrixImpl20.getNorm();
        double[] doubleArray35 = realMatrixImpl20.getRow((int) (short) 1);
        org.apache.commons.math.linear.RealMatrixImpl realMatrixImpl36 = new org.apache.commons.math.linear.RealMatrixImpl(doubleArray35);
        double[] doubleArray37 = realMatrixImpl12.preMultiply(doubleArray35);
        org.junit.Assert.assertNotNull(doubleArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray5), "[10.0, 1.0, 0.0, -1.0, 0.0]");
        org.junit.Assert.assertNotNull(realMatrix8);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertNotNull(doubleArray11);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray11), "[-1.0]");
        org.junit.Assert.assertNotNull(doubleArray15);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray15), "[0.0, 1.0]");
        org.junit.Assert.assertNotNull(doubleArray19);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray19), "[0.0, 1.0]");
        org.junit.Assert.assertNotNull(realMatrix21);
        org.junit.Assert.assertNotNull(doubleArray24);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray24), "[0.0, 1.0]");
        org.junit.Assert.assertNotNull(doubleArray28);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray28), "[0.0, 1.0]");
        org.junit.Assert.assertNotNull(realMatrix30);
        org.junit.Assert.assertNotNull(realMatrix31);
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + false + "'", boolean32 == false);
        org.junit.Assert.assertTrue("'" + double33 + "' != '" + 1.0d + "'", double33 == 1.0d);
        org.junit.Assert.assertNotNull(doubleArray35);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray35), "[1.0]");
        org.junit.Assert.assertNotNull(doubleArray37);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray37), "[-1.0]");
    }

    @Test
    public void test5024() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5024");
        double[] doubleArray2 = new double[] { 0, 1 };
        org.apache.commons.math.linear.RealMatrixImpl realMatrixImpl3 = new org.apache.commons.math.linear.RealMatrixImpl(doubleArray2);
        double[] doubleArray6 = new double[] { 0, 1 };
        org.apache.commons.math.linear.RealMatrixImpl realMatrixImpl7 = new org.apache.commons.math.linear.RealMatrixImpl(doubleArray6);
        org.apache.commons.math.linear.RealMatrix realMatrix8 = realMatrixImpl3.add((org.apache.commons.math.linear.RealMatrix) realMatrixImpl7);
        double[][] doubleArray9 = realMatrixImpl3.getData();
        org.apache.commons.math.linear.RealMatrixImpl realMatrixImpl10 = new org.apache.commons.math.linear.RealMatrixImpl(doubleArray9);
        org.apache.commons.math.linear.RealMatrix realMatrix11 = realMatrixImpl10.copy();
        double[] doubleArray14 = new double[] { 0, 1 };
        org.apache.commons.math.linear.RealMatrixImpl realMatrixImpl15 = new org.apache.commons.math.linear.RealMatrixImpl(doubleArray14);
        double[] doubleArray18 = new double[] { 0, 1 };
        org.apache.commons.math.linear.RealMatrixImpl realMatrixImpl19 = new org.apache.commons.math.linear.RealMatrixImpl(doubleArray18);
        org.apache.commons.math.linear.RealMatrix realMatrix20 = realMatrixImpl15.add((org.apache.commons.math.linear.RealMatrix) realMatrixImpl19);
        double[] doubleArray23 = new double[] { 0, 1 };
        org.apache.commons.math.linear.RealMatrixImpl realMatrixImpl24 = new org.apache.commons.math.linear.RealMatrixImpl(doubleArray23);
        double[] doubleArray27 = new double[] { 0, 1 };
        org.apache.commons.math.linear.RealMatrixImpl realMatrixImpl28 = new org.apache.commons.math.linear.RealMatrixImpl(doubleArray27);
        org.apache.commons.math.linear.RealMatrix realMatrix29 = realMatrixImpl24.add((org.apache.commons.math.linear.RealMatrix) realMatrixImpl28);
        org.apache.commons.math.linear.RealMatrix realMatrix30 = realMatrixImpl19.subtract((org.apache.commons.math.linear.RealMatrix) realMatrixImpl28);
        boolean boolean31 = realMatrixImpl19.isSquare();
        double double32 = realMatrixImpl19.getNorm();
        boolean boolean33 = realMatrixImpl19.isSingular();
        int int34 = realMatrixImpl19.getColumnDimension();
        org.apache.commons.math.linear.RealMatrix realMatrix35 = realMatrixImpl19.transpose();
        double[][] doubleArray36 = realMatrixImpl19.getDataRef();
        org.apache.commons.math.linear.RealMatrixImpl realMatrixImpl37 = new org.apache.commons.math.linear.RealMatrixImpl(doubleArray36);
        realMatrixImpl10.setSubMatrix(doubleArray36, (int) (short) 0, (int) (byte) 0);
        double[] doubleArray43 = new double[] { 0, 1 };
        org.apache.commons.math.linear.RealMatrixImpl realMatrixImpl44 = new org.apache.commons.math.linear.RealMatrixImpl(doubleArray43);
        org.apache.commons.math.linear.RealMatrix realMatrix46 = realMatrixImpl44.scalarMultiply((double) (short) 100);
        java.lang.String str47 = realMatrixImpl44.toString();
        double double48 = realMatrixImpl44.getNorm();
        java.lang.String str49 = realMatrixImpl44.toString();
        double[][] doubleArray50 = realMatrixImpl44.getData();
        boolean boolean51 = realMatrixImpl10.equals((java.lang.Object) realMatrixImpl44);
        double[] doubleArray54 = new double[] { 0, 1 };
        org.apache.commons.math.linear.RealMatrixImpl realMatrixImpl55 = new org.apache.commons.math.linear.RealMatrixImpl(doubleArray54);
        double[] doubleArray58 = new double[] { 0, 1 };
        org.apache.commons.math.linear.RealMatrixImpl realMatrixImpl59 = new org.apache.commons.math.linear.RealMatrixImpl(doubleArray58);
        org.apache.commons.math.linear.RealMatrix realMatrix60 = realMatrixImpl55.add((org.apache.commons.math.linear.RealMatrix) realMatrixImpl59);
        double[] doubleArray63 = new double[] { 0, 1 };
        org.apache.commons.math.linear.RealMatrixImpl realMatrixImpl64 = new org.apache.commons.math.linear.RealMatrixImpl(doubleArray63);
        double[] doubleArray67 = new double[] { 0, 1 };
        org.apache.commons.math.linear.RealMatrixImpl realMatrixImpl68 = new org.apache.commons.math.linear.RealMatrixImpl(doubleArray67);
        org.apache.commons.math.linear.RealMatrix realMatrix69 = realMatrixImpl64.add((org.apache.commons.math.linear.RealMatrix) realMatrixImpl68);
        org.apache.commons.math.linear.RealMatrix realMatrix70 = realMatrixImpl59.subtract((org.apache.commons.math.linear.RealMatrix) realMatrixImpl68);
        double[] doubleArray73 = new double[] { 0, 1 };
        org.apache.commons.math.linear.RealMatrixImpl realMatrixImpl74 = new org.apache.commons.math.linear.RealMatrixImpl(doubleArray73);
        double[] doubleArray77 = new double[] { 0, 1 };
        org.apache.commons.math.linear.RealMatrixImpl realMatrixImpl78 = new org.apache.commons.math.linear.RealMatrixImpl(doubleArray77);
        org.apache.commons.math.linear.RealMatrix realMatrix79 = realMatrixImpl74.add((org.apache.commons.math.linear.RealMatrix) realMatrixImpl78);
        double[] doubleArray82 = new double[] { 10.0d, (short) -1 };
        double[] doubleArray83 = realMatrixImpl74.preMultiply(doubleArray82);
        org.apache.commons.math.linear.RealMatrix realMatrix84 = realMatrixImpl68.subtract((org.apache.commons.math.linear.RealMatrix) realMatrixImpl74);
        org.apache.commons.math.linear.RealMatrix realMatrix85 = realMatrixImpl44.subtract((org.apache.commons.math.linear.RealMatrix) realMatrixImpl68);
        double[][] doubleArray86 = realMatrixImpl44.getDataRef();
        org.apache.commons.math.linear.RealMatrix realMatrix88 = realMatrixImpl44.scalarAdd(12.0d);
        org.apache.commons.math.linear.RealMatrix realMatrix89 = realMatrixImpl44.copy();
        org.junit.Assert.assertNotNull(doubleArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray2), "[0.0, 1.0]");
        org.junit.Assert.assertNotNull(doubleArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray6), "[0.0, 1.0]");
        org.junit.Assert.assertNotNull(realMatrix8);
        org.junit.Assert.assertNotNull(doubleArray9);
        org.junit.Assert.assertNotNull(realMatrix11);
        org.junit.Assert.assertNotNull(doubleArray14);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray14), "[0.0, 1.0]");
        org.junit.Assert.assertNotNull(doubleArray18);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray18), "[0.0, 1.0]");
        org.junit.Assert.assertNotNull(realMatrix20);
        org.junit.Assert.assertNotNull(doubleArray23);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray23), "[0.0, 1.0]");
        org.junit.Assert.assertNotNull(doubleArray27);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray27), "[0.0, 1.0]");
        org.junit.Assert.assertNotNull(realMatrix29);
        org.junit.Assert.assertNotNull(realMatrix30);
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + false + "'", boolean31 == false);
        org.junit.Assert.assertTrue("'" + double32 + "' != '" + 1.0d + "'", double32 == 1.0d);
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + true + "'", boolean33 == true);
        org.junit.Assert.assertTrue("'" + int34 + "' != '" + 1 + "'", int34 == 1);
        org.junit.Assert.assertNotNull(realMatrix35);
        org.junit.Assert.assertNotNull(doubleArray36);
        org.junit.Assert.assertNotNull(doubleArray43);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray43), "[0.0, 1.0]");
        org.junit.Assert.assertNotNull(realMatrix46);
        org.junit.Assert.assertEquals("'" + str47 + "' != '" + "RealMatrixImpl{{0.0},{1.0}}" + "'", str47, "RealMatrixImpl{{0.0},{1.0}}");
        org.junit.Assert.assertTrue("'" + double48 + "' != '" + 1.0d + "'", double48 == 1.0d);
        org.junit.Assert.assertEquals("'" + str49 + "' != '" + "RealMatrixImpl{{0.0},{1.0}}" + "'", str49, "RealMatrixImpl{{0.0},{1.0}}");
        org.junit.Assert.assertNotNull(doubleArray50);
        org.junit.Assert.assertTrue("'" + boolean51 + "' != '" + true + "'", boolean51 == true);
        org.junit.Assert.assertNotNull(doubleArray54);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray54), "[0.0, 1.0]");
        org.junit.Assert.assertNotNull(doubleArray58);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray58), "[0.0, 1.0]");
        org.junit.Assert.assertNotNull(realMatrix60);
        org.junit.Assert.assertNotNull(doubleArray63);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray63), "[0.0, 1.0]");
        org.junit.Assert.assertNotNull(doubleArray67);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray67), "[0.0, 1.0]");
        org.junit.Assert.assertNotNull(realMatrix69);
        org.junit.Assert.assertNotNull(realMatrix70);
        org.junit.Assert.assertNotNull(doubleArray73);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray73), "[0.0, 1.0]");
        org.junit.Assert.assertNotNull(doubleArray77);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray77), "[0.0, 1.0]");
        org.junit.Assert.assertNotNull(realMatrix79);
        org.junit.Assert.assertNotNull(doubleArray82);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray82), "[10.0, -1.0]");
        org.junit.Assert.assertNotNull(doubleArray83);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray83), "[-1.0]");
        org.junit.Assert.assertNotNull(realMatrix84);
        org.junit.Assert.assertNotNull(realMatrix85);
        org.junit.Assert.assertNotNull(doubleArray86);
        org.junit.Assert.assertNotNull(realMatrix88);
        org.junit.Assert.assertNotNull(realMatrix89);
    }

    @Test
    public void test5025() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5025");
        double[] doubleArray2 = new double[] { 0, 1 };
        org.apache.commons.math.linear.RealMatrixImpl realMatrixImpl3 = new org.apache.commons.math.linear.RealMatrixImpl(doubleArray2);
        double[] doubleArray6 = new double[] { 0, 1 };
        org.apache.commons.math.linear.RealMatrixImpl realMatrixImpl7 = new org.apache.commons.math.linear.RealMatrixImpl(doubleArray6);
        org.apache.commons.math.linear.RealMatrix realMatrix8 = realMatrixImpl3.add((org.apache.commons.math.linear.RealMatrix) realMatrixImpl7);
        boolean boolean9 = realMatrixImpl3.isSquare();
        int int10 = realMatrixImpl3.getColumnDimension();
        double[][] doubleArray11 = realMatrixImpl3.getDataRef();
        org.apache.commons.math.linear.RealMatrixImpl realMatrixImpl12 = new org.apache.commons.math.linear.RealMatrixImpl(doubleArray11);
        org.apache.commons.math.linear.RealMatrixImpl realMatrixImpl13 = new org.apache.commons.math.linear.RealMatrixImpl(doubleArray11);
        double[] doubleArray16 = new double[] { 0, 1 };
        org.apache.commons.math.linear.RealMatrixImpl realMatrixImpl17 = new org.apache.commons.math.linear.RealMatrixImpl(doubleArray16);
        double[] doubleArray18 = realMatrixImpl13.preMultiply(doubleArray16);
        org.apache.commons.math.linear.RealMatrixImpl realMatrixImpl19 = new org.apache.commons.math.linear.RealMatrixImpl(doubleArray18);
        double[] doubleArray21 = realMatrixImpl19.getColumn(0);
        org.junit.Assert.assertNotNull(doubleArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray2), "[0.0, 1.0]");
        org.junit.Assert.assertNotNull(doubleArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray6), "[0.0, 1.0]");
        org.junit.Assert.assertNotNull(realMatrix8);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 1 + "'", int10 == 1);
        org.junit.Assert.assertNotNull(doubleArray11);
        org.junit.Assert.assertNotNull(doubleArray16);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray16), "[0.0, 1.0]");
        org.junit.Assert.assertNotNull(doubleArray18);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray18), "[1.0]");
        org.junit.Assert.assertNotNull(doubleArray21);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray21), "[1.0]");
    }

    @Test
    public void test5026() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5026");
        double[] doubleArray2 = new double[] { 0, 1 };
        org.apache.commons.math.linear.RealMatrixImpl realMatrixImpl3 = new org.apache.commons.math.linear.RealMatrixImpl(doubleArray2);
        double[] doubleArray6 = new double[] { 0, 1 };
        org.apache.commons.math.linear.RealMatrixImpl realMatrixImpl7 = new org.apache.commons.math.linear.RealMatrixImpl(doubleArray6);
        org.apache.commons.math.linear.RealMatrix realMatrix8 = realMatrixImpl3.add((org.apache.commons.math.linear.RealMatrix) realMatrixImpl7);
        double[] doubleArray11 = new double[] { 0, 1 };
        org.apache.commons.math.linear.RealMatrixImpl realMatrixImpl12 = new org.apache.commons.math.linear.RealMatrixImpl(doubleArray11);
        double[] doubleArray15 = new double[] { 0, 1 };
        org.apache.commons.math.linear.RealMatrixImpl realMatrixImpl16 = new org.apache.commons.math.linear.RealMatrixImpl(doubleArray15);
        org.apache.commons.math.linear.RealMatrix realMatrix17 = realMatrixImpl12.add((org.apache.commons.math.linear.RealMatrix) realMatrixImpl16);
        org.apache.commons.math.linear.RealMatrix realMatrix18 = realMatrixImpl7.subtract((org.apache.commons.math.linear.RealMatrix) realMatrixImpl16);
        double[] doubleArray21 = new double[] { 0, 1 };
        org.apache.commons.math.linear.RealMatrixImpl realMatrixImpl22 = new org.apache.commons.math.linear.RealMatrixImpl(doubleArray21);
        double[] doubleArray25 = new double[] { 0, 1 };
        org.apache.commons.math.linear.RealMatrixImpl realMatrixImpl26 = new org.apache.commons.math.linear.RealMatrixImpl(doubleArray25);
        org.apache.commons.math.linear.RealMatrix realMatrix27 = realMatrixImpl22.add((org.apache.commons.math.linear.RealMatrix) realMatrixImpl26);
        double[] doubleArray30 = new double[] { 10.0d, (short) -1 };
        double[] doubleArray31 = realMatrixImpl22.preMultiply(doubleArray30);
        org.apache.commons.math.linear.RealMatrix realMatrix32 = realMatrixImpl16.subtract((org.apache.commons.math.linear.RealMatrix) realMatrixImpl22);
        double[][] doubleArray33 = realMatrixImpl22.getData();
        double[] doubleArray36 = new double[] { 0, 1 };
        org.apache.commons.math.linear.RealMatrixImpl realMatrixImpl37 = new org.apache.commons.math.linear.RealMatrixImpl(doubleArray36);
        double[] doubleArray40 = new double[] { 0, 1 };
        org.apache.commons.math.linear.RealMatrixImpl realMatrixImpl41 = new org.apache.commons.math.linear.RealMatrixImpl(doubleArray40);
        org.apache.commons.math.linear.RealMatrix realMatrix42 = realMatrixImpl37.add((org.apache.commons.math.linear.RealMatrix) realMatrixImpl41);
        double[] doubleArray45 = new double[] { 0, 1 };
        org.apache.commons.math.linear.RealMatrixImpl realMatrixImpl46 = new org.apache.commons.math.linear.RealMatrixImpl(doubleArray45);
        double[] doubleArray49 = new double[] { 0, 1 };
        org.apache.commons.math.linear.RealMatrixImpl realMatrixImpl50 = new org.apache.commons.math.linear.RealMatrixImpl(doubleArray49);
        org.apache.commons.math.linear.RealMatrix realMatrix51 = realMatrixImpl46.add((org.apache.commons.math.linear.RealMatrix) realMatrixImpl50);
        org.apache.commons.math.linear.RealMatrix realMatrix52 = realMatrixImpl41.subtract((org.apache.commons.math.linear.RealMatrix) realMatrixImpl50);
        double[] doubleArray55 = new double[] { 0, 1 };
        org.apache.commons.math.linear.RealMatrixImpl realMatrixImpl56 = new org.apache.commons.math.linear.RealMatrixImpl(doubleArray55);
        double[] doubleArray59 = new double[] { 0, 1 };
        org.apache.commons.math.linear.RealMatrixImpl realMatrixImpl60 = new org.apache.commons.math.linear.RealMatrixImpl(doubleArray59);
        org.apache.commons.math.linear.RealMatrix realMatrix61 = realMatrixImpl56.add((org.apache.commons.math.linear.RealMatrix) realMatrixImpl60);
        double[] doubleArray64 = new double[] { 10.0d, (short) -1 };
        double[] doubleArray65 = realMatrixImpl56.preMultiply(doubleArray64);
        org.apache.commons.math.linear.RealMatrixImpl realMatrixImpl66 = new org.apache.commons.math.linear.RealMatrixImpl(doubleArray64);
        double[] doubleArray67 = realMatrixImpl41.preMultiply(doubleArray64);
        org.apache.commons.math.linear.RealMatrixImpl realMatrixImpl68 = new org.apache.commons.math.linear.RealMatrixImpl(doubleArray67);
        boolean boolean69 = realMatrixImpl68.isSquare();
        boolean boolean70 = realMatrixImpl22.equals((java.lang.Object) realMatrixImpl68);
        boolean boolean71 = realMatrixImpl68.isSquare();
        org.apache.commons.math.linear.RealMatrix realMatrix76 = realMatrixImpl68.getSubMatrix((int) (byte) 0, (int) (byte) 0, 0, (int) (byte) 0);
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math.linear.RealMatrix realMatrix78 = realMatrixImpl68.getColumnMatrix((int) ' ');
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math.linear.MatrixIndexException; message: illegal column argument");
        } catch (org.apache.commons.math.linear.MatrixIndexException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(doubleArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray2), "[0.0, 1.0]");
        org.junit.Assert.assertNotNull(doubleArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray6), "[0.0, 1.0]");
        org.junit.Assert.assertNotNull(realMatrix8);
        org.junit.Assert.assertNotNull(doubleArray11);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray11), "[0.0, 1.0]");
        org.junit.Assert.assertNotNull(doubleArray15);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray15), "[0.0, 1.0]");
        org.junit.Assert.assertNotNull(realMatrix17);
        org.junit.Assert.assertNotNull(realMatrix18);
        org.junit.Assert.assertNotNull(doubleArray21);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray21), "[0.0, 1.0]");
        org.junit.Assert.assertNotNull(doubleArray25);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray25), "[0.0, 1.0]");
        org.junit.Assert.assertNotNull(realMatrix27);
        org.junit.Assert.assertNotNull(doubleArray30);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray30), "[10.0, -1.0]");
        org.junit.Assert.assertNotNull(doubleArray31);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray31), "[-1.0]");
        org.junit.Assert.assertNotNull(realMatrix32);
        org.junit.Assert.assertNotNull(doubleArray33);
        org.junit.Assert.assertNotNull(doubleArray36);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray36), "[0.0, 1.0]");
        org.junit.Assert.assertNotNull(doubleArray40);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray40), "[0.0, 1.0]");
        org.junit.Assert.assertNotNull(realMatrix42);
        org.junit.Assert.assertNotNull(doubleArray45);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray45), "[0.0, 1.0]");
        org.junit.Assert.assertNotNull(doubleArray49);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray49), "[0.0, 1.0]");
        org.junit.Assert.assertNotNull(realMatrix51);
        org.junit.Assert.assertNotNull(realMatrix52);
        org.junit.Assert.assertNotNull(doubleArray55);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray55), "[0.0, 1.0]");
        org.junit.Assert.assertNotNull(doubleArray59);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray59), "[0.0, 1.0]");
        org.junit.Assert.assertNotNull(realMatrix61);
        org.junit.Assert.assertNotNull(doubleArray64);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray64), "[10.0, -1.0]");
        org.junit.Assert.assertNotNull(doubleArray65);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray65), "[-1.0]");
        org.junit.Assert.assertNotNull(doubleArray67);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray67), "[-1.0]");
        org.junit.Assert.assertTrue("'" + boolean69 + "' != '" + true + "'", boolean69 == true);
        org.junit.Assert.assertTrue("'" + boolean70 + "' != '" + false + "'", boolean70 == false);
        org.junit.Assert.assertTrue("'" + boolean71 + "' != '" + true + "'", boolean71 == true);
        org.junit.Assert.assertNotNull(realMatrix76);
    }

    @Test
    public void test5027() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5027");
        double[] doubleArray2 = new double[] { 0, 1 };
        org.apache.commons.math.linear.RealMatrixImpl realMatrixImpl3 = new org.apache.commons.math.linear.RealMatrixImpl(doubleArray2);
        double[] doubleArray6 = new double[] { 0, 1 };
        org.apache.commons.math.linear.RealMatrixImpl realMatrixImpl7 = new org.apache.commons.math.linear.RealMatrixImpl(doubleArray6);
        org.apache.commons.math.linear.RealMatrix realMatrix8 = realMatrixImpl3.add((org.apache.commons.math.linear.RealMatrix) realMatrixImpl7);
        double[][] doubleArray9 = realMatrixImpl3.getData();
        org.apache.commons.math.linear.RealMatrix realMatrix11 = realMatrixImpl3.scalarMultiply((double) (byte) 100);
        org.apache.commons.math.linear.RealMatrix realMatrix13 = realMatrixImpl3.scalarMultiply((double) (byte) 1);
        int int14 = realMatrixImpl3.getColumnDimension();
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math.linear.RealMatrix realMatrix19 = realMatrixImpl3.getSubMatrix((int) (short) 10, 10, (int) (byte) 100, (int) (byte) -1);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math.linear.MatrixIndexException; message: invalid row or column index selection");
        } catch (org.apache.commons.math.linear.MatrixIndexException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(doubleArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray2), "[0.0, 1.0]");
        org.junit.Assert.assertNotNull(doubleArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray6), "[0.0, 1.0]");
        org.junit.Assert.assertNotNull(realMatrix8);
        org.junit.Assert.assertNotNull(doubleArray9);
        org.junit.Assert.assertNotNull(realMatrix11);
        org.junit.Assert.assertNotNull(realMatrix13);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 1 + "'", int14 == 1);
    }

    @Test
    public void test5028() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5028");
        double[] doubleArray2 = new double[] { 0, 1 };
        org.apache.commons.math.linear.RealMatrixImpl realMatrixImpl3 = new org.apache.commons.math.linear.RealMatrixImpl(doubleArray2);
        double[] doubleArray6 = new double[] { 0, 1 };
        org.apache.commons.math.linear.RealMatrixImpl realMatrixImpl7 = new org.apache.commons.math.linear.RealMatrixImpl(doubleArray6);
        org.apache.commons.math.linear.RealMatrix realMatrix8 = realMatrixImpl3.add((org.apache.commons.math.linear.RealMatrix) realMatrixImpl7);
        double[] doubleArray11 = new double[] { 0, 1 };
        org.apache.commons.math.linear.RealMatrixImpl realMatrixImpl12 = new org.apache.commons.math.linear.RealMatrixImpl(doubleArray11);
        double[] doubleArray15 = new double[] { 0, 1 };
        org.apache.commons.math.linear.RealMatrixImpl realMatrixImpl16 = new org.apache.commons.math.linear.RealMatrixImpl(doubleArray15);
        org.apache.commons.math.linear.RealMatrix realMatrix17 = realMatrixImpl12.add((org.apache.commons.math.linear.RealMatrix) realMatrixImpl16);
        org.apache.commons.math.linear.RealMatrix realMatrix18 = realMatrixImpl7.subtract((org.apache.commons.math.linear.RealMatrix) realMatrixImpl16);
        boolean boolean19 = realMatrixImpl7.isSquare();
        double double20 = realMatrixImpl7.getNorm();
        boolean boolean21 = realMatrixImpl7.isSingular();
        java.lang.String str22 = realMatrixImpl7.toString();
        org.apache.commons.math.linear.RealMatrix realMatrix24 = realMatrixImpl7.scalarMultiply((double) 100L);
        double[][] doubleArray25 = realMatrixImpl7.getDataRef();
        double[] doubleArray28 = new double[] { 0, 1 };
        org.apache.commons.math.linear.RealMatrixImpl realMatrixImpl29 = new org.apache.commons.math.linear.RealMatrixImpl(doubleArray28);
        org.apache.commons.math.linear.RealMatrix realMatrix30 = realMatrixImpl29.transpose();
        double[][] doubleArray31 = realMatrixImpl29.getDataRef();
        double[] doubleArray34 = new double[] { 0, 1 };
        org.apache.commons.math.linear.RealMatrixImpl realMatrixImpl35 = new org.apache.commons.math.linear.RealMatrixImpl(doubleArray34);
        double double36 = realMatrixImpl35.getNorm();
        double[][] doubleArray37 = realMatrixImpl35.getDataRef();
        double[] doubleArray40 = new double[] { 0, 1 };
        org.apache.commons.math.linear.RealMatrixImpl realMatrixImpl41 = new org.apache.commons.math.linear.RealMatrixImpl(doubleArray40);
        double[] doubleArray44 = new double[] { 0, 1 };
        org.apache.commons.math.linear.RealMatrixImpl realMatrixImpl45 = new org.apache.commons.math.linear.RealMatrixImpl(doubleArray44);
        org.apache.commons.math.linear.RealMatrix realMatrix46 = realMatrixImpl41.add((org.apache.commons.math.linear.RealMatrix) realMatrixImpl45);
        double[] doubleArray49 = new double[] { 10.0d, (short) -1 };
        double[] doubleArray50 = realMatrixImpl41.preMultiply(doubleArray49);
        boolean boolean51 = realMatrixImpl41.isSingular();
        double[] doubleArray53 = realMatrixImpl41.getColumn((int) (byte) 0);
        double[] doubleArray54 = realMatrixImpl35.preMultiply(doubleArray53);
        org.apache.commons.math.linear.RealMatrixImpl realMatrixImpl55 = new org.apache.commons.math.linear.RealMatrixImpl(doubleArray53);
        org.apache.commons.math.linear.RealMatrixImpl realMatrixImpl56 = new org.apache.commons.math.linear.RealMatrixImpl(doubleArray53);
        double[] doubleArray57 = realMatrixImpl29.preMultiply(doubleArray53);
        double[] doubleArray58 = realMatrixImpl7.preMultiply(doubleArray53);
        // The following exception was thrown during execution in test generation
        try {
            realMatrixImpl7.luDecompose();
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math.linear.InvalidMatrixException; message: LU decomposition requires that the matrix be square.");
        } catch (org.apache.commons.math.linear.InvalidMatrixException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(doubleArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray2), "[0.0, 1.0]");
        org.junit.Assert.assertNotNull(doubleArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray6), "[0.0, 1.0]");
        org.junit.Assert.assertNotNull(realMatrix8);
        org.junit.Assert.assertNotNull(doubleArray11);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray11), "[0.0, 1.0]");
        org.junit.Assert.assertNotNull(doubleArray15);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray15), "[0.0, 1.0]");
        org.junit.Assert.assertNotNull(realMatrix17);
        org.junit.Assert.assertNotNull(realMatrix18);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertTrue("'" + double20 + "' != '" + 1.0d + "'", double20 == 1.0d);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + true + "'", boolean21 == true);
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "RealMatrixImpl{{0.0},{1.0}}" + "'", str22, "RealMatrixImpl{{0.0},{1.0}}");
        org.junit.Assert.assertNotNull(realMatrix24);
        org.junit.Assert.assertNotNull(doubleArray25);
        org.junit.Assert.assertNotNull(doubleArray28);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray28), "[0.0, 1.0]");
        org.junit.Assert.assertNotNull(realMatrix30);
        org.junit.Assert.assertNotNull(doubleArray31);
        org.junit.Assert.assertNotNull(doubleArray34);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray34), "[0.0, 1.0]");
        org.junit.Assert.assertTrue("'" + double36 + "' != '" + 1.0d + "'", double36 == 1.0d);
        org.junit.Assert.assertNotNull(doubleArray37);
        org.junit.Assert.assertNotNull(doubleArray40);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray40), "[0.0, 1.0]");
        org.junit.Assert.assertNotNull(doubleArray44);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray44), "[0.0, 1.0]");
        org.junit.Assert.assertNotNull(realMatrix46);
        org.junit.Assert.assertNotNull(doubleArray49);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray49), "[10.0, -1.0]");
        org.junit.Assert.assertNotNull(doubleArray50);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray50), "[-1.0]");
        org.junit.Assert.assertTrue("'" + boolean51 + "' != '" + true + "'", boolean51 == true);
        org.junit.Assert.assertNotNull(doubleArray53);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray53), "[0.0, 1.0]");
        org.junit.Assert.assertNotNull(doubleArray54);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray54), "[1.0]");
        org.junit.Assert.assertNotNull(doubleArray57);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray57), "[1.0]");
        org.junit.Assert.assertNotNull(doubleArray58);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray58), "[1.0]");
    }

    @Test
    public void test5029() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5029");
        double[] doubleArray2 = new double[] { 0, 1 };
        org.apache.commons.math.linear.RealMatrixImpl realMatrixImpl3 = new org.apache.commons.math.linear.RealMatrixImpl(doubleArray2);
        double[] doubleArray6 = new double[] { 0, 1 };
        org.apache.commons.math.linear.RealMatrixImpl realMatrixImpl7 = new org.apache.commons.math.linear.RealMatrixImpl(doubleArray6);
        org.apache.commons.math.linear.RealMatrix realMatrix8 = realMatrixImpl3.add((org.apache.commons.math.linear.RealMatrix) realMatrixImpl7);
        double[][] doubleArray9 = realMatrixImpl3.getData();
        org.apache.commons.math.linear.RealMatrixImpl realMatrixImpl10 = new org.apache.commons.math.linear.RealMatrixImpl(doubleArray9);
        double[] doubleArray13 = new double[] { 0, 1 };
        org.apache.commons.math.linear.RealMatrixImpl realMatrixImpl14 = new org.apache.commons.math.linear.RealMatrixImpl(doubleArray13);
        double[] doubleArray17 = new double[] { 0, 1 };
        org.apache.commons.math.linear.RealMatrixImpl realMatrixImpl18 = new org.apache.commons.math.linear.RealMatrixImpl(doubleArray17);
        org.apache.commons.math.linear.RealMatrix realMatrix19 = realMatrixImpl14.add((org.apache.commons.math.linear.RealMatrix) realMatrixImpl18);
        double[] doubleArray22 = new double[] { 0, 1 };
        org.apache.commons.math.linear.RealMatrixImpl realMatrixImpl23 = new org.apache.commons.math.linear.RealMatrixImpl(doubleArray22);
        double[] doubleArray26 = new double[] { 0, 1 };
        org.apache.commons.math.linear.RealMatrixImpl realMatrixImpl27 = new org.apache.commons.math.linear.RealMatrixImpl(doubleArray26);
        org.apache.commons.math.linear.RealMatrix realMatrix28 = realMatrixImpl23.add((org.apache.commons.math.linear.RealMatrix) realMatrixImpl27);
        org.apache.commons.math.linear.RealMatrix realMatrix29 = realMatrixImpl18.subtract((org.apache.commons.math.linear.RealMatrix) realMatrixImpl27);
        double[] doubleArray32 = new double[] { 0, 1 };
        org.apache.commons.math.linear.RealMatrixImpl realMatrixImpl33 = new org.apache.commons.math.linear.RealMatrixImpl(doubleArray32);
        double[] doubleArray36 = new double[] { 0, 1 };
        org.apache.commons.math.linear.RealMatrixImpl realMatrixImpl37 = new org.apache.commons.math.linear.RealMatrixImpl(doubleArray36);
        org.apache.commons.math.linear.RealMatrix realMatrix38 = realMatrixImpl33.add((org.apache.commons.math.linear.RealMatrix) realMatrixImpl37);
        double[] doubleArray41 = new double[] { 10.0d, (short) -1 };
        double[] doubleArray42 = realMatrixImpl33.preMultiply(doubleArray41);
        org.apache.commons.math.linear.RealMatrix realMatrix43 = realMatrixImpl27.subtract((org.apache.commons.math.linear.RealMatrix) realMatrixImpl33);
        double[] doubleArray46 = new double[] { 0, 1 };
        org.apache.commons.math.linear.RealMatrixImpl realMatrixImpl47 = new org.apache.commons.math.linear.RealMatrixImpl(doubleArray46);
        double[] doubleArray50 = new double[] { 0, 1 };
        org.apache.commons.math.linear.RealMatrixImpl realMatrixImpl51 = new org.apache.commons.math.linear.RealMatrixImpl(doubleArray50);
        org.apache.commons.math.linear.RealMatrix realMatrix52 = realMatrixImpl47.add((org.apache.commons.math.linear.RealMatrix) realMatrixImpl51);
        boolean boolean53 = realMatrixImpl47.isSquare();
        org.apache.commons.math.linear.RealMatrix realMatrix55 = realMatrixImpl47.scalarAdd((double) (short) -1);
        org.apache.commons.math.linear.RealMatrix realMatrix56 = realMatrixImpl33.subtract(realMatrix55);
        org.apache.commons.math.linear.RealMatrix realMatrix57 = realMatrixImpl10.subtract((org.apache.commons.math.linear.RealMatrix) realMatrixImpl33);
        double[][] doubleArray58 = realMatrixImpl10.getData();
        org.junit.Assert.assertNotNull(doubleArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray2), "[0.0, 1.0]");
        org.junit.Assert.assertNotNull(doubleArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray6), "[0.0, 1.0]");
        org.junit.Assert.assertNotNull(realMatrix8);
        org.junit.Assert.assertNotNull(doubleArray9);
        org.junit.Assert.assertNotNull(doubleArray13);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray13), "[0.0, 1.0]");
        org.junit.Assert.assertNotNull(doubleArray17);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray17), "[0.0, 1.0]");
        org.junit.Assert.assertNotNull(realMatrix19);
        org.junit.Assert.assertNotNull(doubleArray22);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray22), "[0.0, 1.0]");
        org.junit.Assert.assertNotNull(doubleArray26);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray26), "[0.0, 1.0]");
        org.junit.Assert.assertNotNull(realMatrix28);
        org.junit.Assert.assertNotNull(realMatrix29);
        org.junit.Assert.assertNotNull(doubleArray32);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray32), "[0.0, 1.0]");
        org.junit.Assert.assertNotNull(doubleArray36);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray36), "[0.0, 1.0]");
        org.junit.Assert.assertNotNull(realMatrix38);
        org.junit.Assert.assertNotNull(doubleArray41);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray41), "[10.0, -1.0]");
        org.junit.Assert.assertNotNull(doubleArray42);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray42), "[-1.0]");
        org.junit.Assert.assertNotNull(realMatrix43);
        org.junit.Assert.assertNotNull(doubleArray46);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray46), "[0.0, 1.0]");
        org.junit.Assert.assertNotNull(doubleArray50);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray50), "[0.0, 1.0]");
        org.junit.Assert.assertNotNull(realMatrix52);
        org.junit.Assert.assertTrue("'" + boolean53 + "' != '" + false + "'", boolean53 == false);
        org.junit.Assert.assertNotNull(realMatrix55);
        org.junit.Assert.assertNotNull(realMatrix56);
        org.junit.Assert.assertNotNull(realMatrix57);
        org.junit.Assert.assertNotNull(doubleArray58);
    }

    @Test
    public void test5030() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5030");
        double[] doubleArray2 = new double[] { 0, 1 };
        org.apache.commons.math.linear.RealMatrixImpl realMatrixImpl3 = new org.apache.commons.math.linear.RealMatrixImpl(doubleArray2);
        double double4 = realMatrixImpl3.getNorm();
        org.apache.commons.math.linear.RealMatrix realMatrix5 = realMatrixImpl3.transpose();
        double[][] doubleArray6 = realMatrixImpl3.getDataRef();
        double[] doubleArray9 = new double[] { 0, 1 };
        org.apache.commons.math.linear.RealMatrixImpl realMatrixImpl10 = new org.apache.commons.math.linear.RealMatrixImpl(doubleArray9);
        double double11 = realMatrixImpl10.getNorm();
        double[] doubleArray14 = new double[] { 0, 1 };
        org.apache.commons.math.linear.RealMatrixImpl realMatrixImpl15 = new org.apache.commons.math.linear.RealMatrixImpl(doubleArray14);
        double double16 = realMatrixImpl15.getNorm();
        org.apache.commons.math.linear.RealMatrix realMatrix17 = realMatrixImpl15.transpose();
        double[] doubleArray19 = realMatrixImpl15.getColumn(0);
        double[] doubleArray20 = realMatrixImpl10.preMultiply(doubleArray19);
        org.apache.commons.math.linear.RealMatrixImpl realMatrixImpl21 = new org.apache.commons.math.linear.RealMatrixImpl(doubleArray19);
        org.apache.commons.math.linear.RealMatrix realMatrix22 = realMatrixImpl21.transpose();
        boolean boolean23 = realMatrixImpl3.equals((java.lang.Object) realMatrix22);
        double[] doubleArray26 = new double[] { 0, 1 };
        org.apache.commons.math.linear.RealMatrixImpl realMatrixImpl27 = new org.apache.commons.math.linear.RealMatrixImpl(doubleArray26);
        double[] doubleArray30 = new double[] { 0, 1 };
        org.apache.commons.math.linear.RealMatrixImpl realMatrixImpl31 = new org.apache.commons.math.linear.RealMatrixImpl(doubleArray30);
        org.apache.commons.math.linear.RealMatrix realMatrix32 = realMatrixImpl27.add((org.apache.commons.math.linear.RealMatrix) realMatrixImpl31);
        double[] doubleArray35 = new double[] { 10.0d, (short) -1 };
        double[] doubleArray36 = realMatrixImpl27.preMultiply(doubleArray35);
        org.apache.commons.math.linear.RealMatrixImpl realMatrixImpl37 = new org.apache.commons.math.linear.RealMatrixImpl(doubleArray35);
        double[] doubleArray40 = new double[] { 0, 1 };
        org.apache.commons.math.linear.RealMatrixImpl realMatrixImpl41 = new org.apache.commons.math.linear.RealMatrixImpl(doubleArray40);
        org.apache.commons.math.linear.RealMatrix realMatrix43 = realMatrixImpl41.scalarMultiply((double) (short) 100);
        double[] doubleArray45 = realMatrixImpl41.getRow(0);
        org.apache.commons.math.linear.RealMatrix realMatrix46 = realMatrixImpl37.add((org.apache.commons.math.linear.RealMatrix) realMatrixImpl41);
        org.apache.commons.math.linear.RealMatrix realMatrix47 = realMatrixImpl3.subtract((org.apache.commons.math.linear.RealMatrix) realMatrixImpl37);
        double[] doubleArray49 = realMatrixImpl3.getRow((int) (short) 1);
        org.apache.commons.math.linear.RealMatrixImpl realMatrixImpl50 = new org.apache.commons.math.linear.RealMatrixImpl(doubleArray49);
        double[][] doubleArray51 = realMatrixImpl50.getData();
        org.apache.commons.math.linear.RealMatrix realMatrix53 = realMatrixImpl50.scalarMultiply(12.0d);
        int int54 = realMatrixImpl50.getRowDimension();
        org.junit.Assert.assertNotNull(doubleArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray2), "[0.0, 1.0]");
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 1.0d + "'", double4 == 1.0d);
        org.junit.Assert.assertNotNull(realMatrix5);
        org.junit.Assert.assertNotNull(doubleArray6);
        org.junit.Assert.assertNotNull(doubleArray9);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray9), "[0.0, 1.0]");
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 1.0d + "'", double11 == 1.0d);
        org.junit.Assert.assertNotNull(doubleArray14);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray14), "[0.0, 1.0]");
        org.junit.Assert.assertTrue("'" + double16 + "' != '" + 1.0d + "'", double16 == 1.0d);
        org.junit.Assert.assertNotNull(realMatrix17);
        org.junit.Assert.assertNotNull(doubleArray19);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray19), "[0.0, 1.0]");
        org.junit.Assert.assertNotNull(doubleArray20);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray20), "[1.0]");
        org.junit.Assert.assertNotNull(realMatrix22);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertNotNull(doubleArray26);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray26), "[0.0, 1.0]");
        org.junit.Assert.assertNotNull(doubleArray30);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray30), "[0.0, 1.0]");
        org.junit.Assert.assertNotNull(realMatrix32);
        org.junit.Assert.assertNotNull(doubleArray35);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray35), "[10.0, -1.0]");
        org.junit.Assert.assertNotNull(doubleArray36);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray36), "[-1.0]");
        org.junit.Assert.assertNotNull(doubleArray40);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray40), "[0.0, 1.0]");
        org.junit.Assert.assertNotNull(realMatrix43);
        org.junit.Assert.assertNotNull(doubleArray45);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray45), "[0.0]");
        org.junit.Assert.assertNotNull(realMatrix46);
        org.junit.Assert.assertNotNull(realMatrix47);
        org.junit.Assert.assertNotNull(doubleArray49);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray49), "[1.0]");
        org.junit.Assert.assertNotNull(doubleArray51);
        org.junit.Assert.assertNotNull(realMatrix53);
        org.junit.Assert.assertTrue("'" + int54 + "' != '" + 1 + "'", int54 == 1);
    }

    @Test
    public void test5031() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5031");
        double[] doubleArray2 = new double[] { 0, 1 };
        org.apache.commons.math.linear.RealMatrixImpl realMatrixImpl3 = new org.apache.commons.math.linear.RealMatrixImpl(doubleArray2);
        double[] doubleArray6 = new double[] { 0, 1 };
        org.apache.commons.math.linear.RealMatrixImpl realMatrixImpl7 = new org.apache.commons.math.linear.RealMatrixImpl(doubleArray6);
        org.apache.commons.math.linear.RealMatrix realMatrix8 = realMatrixImpl3.add((org.apache.commons.math.linear.RealMatrix) realMatrixImpl7);
        double[] doubleArray11 = new double[] { 0, 1 };
        org.apache.commons.math.linear.RealMatrixImpl realMatrixImpl12 = new org.apache.commons.math.linear.RealMatrixImpl(doubleArray11);
        double[] doubleArray15 = new double[] { 0, 1 };
        org.apache.commons.math.linear.RealMatrixImpl realMatrixImpl16 = new org.apache.commons.math.linear.RealMatrixImpl(doubleArray15);
        org.apache.commons.math.linear.RealMatrix realMatrix17 = realMatrixImpl12.add((org.apache.commons.math.linear.RealMatrix) realMatrixImpl16);
        org.apache.commons.math.linear.RealMatrix realMatrix18 = realMatrixImpl7.subtract((org.apache.commons.math.linear.RealMatrix) realMatrixImpl16);
        double[] doubleArray21 = new double[] { 0, 1 };
        org.apache.commons.math.linear.RealMatrixImpl realMatrixImpl22 = new org.apache.commons.math.linear.RealMatrixImpl(doubleArray21);
        double[] doubleArray25 = new double[] { 0, 1 };
        org.apache.commons.math.linear.RealMatrixImpl realMatrixImpl26 = new org.apache.commons.math.linear.RealMatrixImpl(doubleArray25);
        org.apache.commons.math.linear.RealMatrix realMatrix27 = realMatrixImpl22.add((org.apache.commons.math.linear.RealMatrix) realMatrixImpl26);
        double[] doubleArray30 = new double[] { 10.0d, (short) -1 };
        double[] doubleArray31 = realMatrixImpl22.preMultiply(doubleArray30);
        org.apache.commons.math.linear.RealMatrix realMatrix32 = realMatrixImpl16.subtract((org.apache.commons.math.linear.RealMatrix) realMatrixImpl22);
        double[][] doubleArray33 = realMatrixImpl22.getData();
        double[] doubleArray36 = new double[] { 0, 1 };
        org.apache.commons.math.linear.RealMatrixImpl realMatrixImpl37 = new org.apache.commons.math.linear.RealMatrixImpl(doubleArray36);
        double[] doubleArray40 = new double[] { 0, 1 };
        org.apache.commons.math.linear.RealMatrixImpl realMatrixImpl41 = new org.apache.commons.math.linear.RealMatrixImpl(doubleArray40);
        org.apache.commons.math.linear.RealMatrix realMatrix42 = realMatrixImpl37.add((org.apache.commons.math.linear.RealMatrix) realMatrixImpl41);
        double[] doubleArray45 = new double[] { 0, 1 };
        org.apache.commons.math.linear.RealMatrixImpl realMatrixImpl46 = new org.apache.commons.math.linear.RealMatrixImpl(doubleArray45);
        double[] doubleArray49 = new double[] { 0, 1 };
        org.apache.commons.math.linear.RealMatrixImpl realMatrixImpl50 = new org.apache.commons.math.linear.RealMatrixImpl(doubleArray49);
        org.apache.commons.math.linear.RealMatrix realMatrix51 = realMatrixImpl46.add((org.apache.commons.math.linear.RealMatrix) realMatrixImpl50);
        org.apache.commons.math.linear.RealMatrix realMatrix52 = realMatrixImpl41.subtract((org.apache.commons.math.linear.RealMatrix) realMatrixImpl50);
        double[] doubleArray55 = new double[] { 0, 1 };
        org.apache.commons.math.linear.RealMatrixImpl realMatrixImpl56 = new org.apache.commons.math.linear.RealMatrixImpl(doubleArray55);
        double[] doubleArray59 = new double[] { 0, 1 };
        org.apache.commons.math.linear.RealMatrixImpl realMatrixImpl60 = new org.apache.commons.math.linear.RealMatrixImpl(doubleArray59);
        org.apache.commons.math.linear.RealMatrix realMatrix61 = realMatrixImpl56.add((org.apache.commons.math.linear.RealMatrix) realMatrixImpl60);
        double[] doubleArray64 = new double[] { 10.0d, (short) -1 };
        double[] doubleArray65 = realMatrixImpl56.preMultiply(doubleArray64);
        org.apache.commons.math.linear.RealMatrixImpl realMatrixImpl66 = new org.apache.commons.math.linear.RealMatrixImpl(doubleArray64);
        double[] doubleArray67 = realMatrixImpl41.preMultiply(doubleArray64);
        org.apache.commons.math.linear.RealMatrixImpl realMatrixImpl68 = new org.apache.commons.math.linear.RealMatrixImpl(doubleArray67);
        boolean boolean69 = realMatrixImpl68.isSquare();
        boolean boolean70 = realMatrixImpl22.equals((java.lang.Object) realMatrixImpl68);
        boolean boolean71 = realMatrixImpl68.isSquare();
        org.apache.commons.math.linear.RealMatrix realMatrix73 = realMatrixImpl68.scalarMultiply((double) (-1.0f));
        java.lang.Class<?> wildcardClass74 = realMatrix73.getClass();
        org.junit.Assert.assertNotNull(doubleArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray2), "[0.0, 1.0]");
        org.junit.Assert.assertNotNull(doubleArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray6), "[0.0, 1.0]");
        org.junit.Assert.assertNotNull(realMatrix8);
        org.junit.Assert.assertNotNull(doubleArray11);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray11), "[0.0, 1.0]");
        org.junit.Assert.assertNotNull(doubleArray15);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray15), "[0.0, 1.0]");
        org.junit.Assert.assertNotNull(realMatrix17);
        org.junit.Assert.assertNotNull(realMatrix18);
        org.junit.Assert.assertNotNull(doubleArray21);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray21), "[0.0, 1.0]");
        org.junit.Assert.assertNotNull(doubleArray25);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray25), "[0.0, 1.0]");
        org.junit.Assert.assertNotNull(realMatrix27);
        org.junit.Assert.assertNotNull(doubleArray30);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray30), "[10.0, -1.0]");
        org.junit.Assert.assertNotNull(doubleArray31);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray31), "[-1.0]");
        org.junit.Assert.assertNotNull(realMatrix32);
        org.junit.Assert.assertNotNull(doubleArray33);
        org.junit.Assert.assertNotNull(doubleArray36);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray36), "[0.0, 1.0]");
        org.junit.Assert.assertNotNull(doubleArray40);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray40), "[0.0, 1.0]");
        org.junit.Assert.assertNotNull(realMatrix42);
        org.junit.Assert.assertNotNull(doubleArray45);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray45), "[0.0, 1.0]");
        org.junit.Assert.assertNotNull(doubleArray49);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray49), "[0.0, 1.0]");
        org.junit.Assert.assertNotNull(realMatrix51);
        org.junit.Assert.assertNotNull(realMatrix52);
        org.junit.Assert.assertNotNull(doubleArray55);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray55), "[0.0, 1.0]");
        org.junit.Assert.assertNotNull(doubleArray59);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray59), "[0.0, 1.0]");
        org.junit.Assert.assertNotNull(realMatrix61);
        org.junit.Assert.assertNotNull(doubleArray64);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray64), "[10.0, -1.0]");
        org.junit.Assert.assertNotNull(doubleArray65);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray65), "[-1.0]");
        org.junit.Assert.assertNotNull(doubleArray67);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray67), "[-1.0]");
        org.junit.Assert.assertTrue("'" + boolean69 + "' != '" + true + "'", boolean69 == true);
        org.junit.Assert.assertTrue("'" + boolean70 + "' != '" + false + "'", boolean70 == false);
        org.junit.Assert.assertTrue("'" + boolean71 + "' != '" + true + "'", boolean71 == true);
        org.junit.Assert.assertNotNull(realMatrix73);
        org.junit.Assert.assertNotNull(wildcardClass74);
    }

    @Test
    public void test5032() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5032");
        double[] doubleArray2 = new double[] { 0, 1 };
        org.apache.commons.math.linear.RealMatrixImpl realMatrixImpl3 = new org.apache.commons.math.linear.RealMatrixImpl(doubleArray2);
        double[] doubleArray6 = new double[] { 0, 1 };
        org.apache.commons.math.linear.RealMatrixImpl realMatrixImpl7 = new org.apache.commons.math.linear.RealMatrixImpl(doubleArray6);
        org.apache.commons.math.linear.RealMatrix realMatrix8 = realMatrixImpl3.add((org.apache.commons.math.linear.RealMatrix) realMatrixImpl7);
        double[] doubleArray11 = new double[] { 10.0d, (short) -1 };
        double[] doubleArray12 = realMatrixImpl3.preMultiply(doubleArray11);
        org.apache.commons.math.linear.RealMatrixImpl realMatrixImpl13 = new org.apache.commons.math.linear.RealMatrixImpl(doubleArray12);
        boolean boolean14 = realMatrixImpl13.isSquare();
        int int15 = realMatrixImpl13.getColumnDimension();
        double[][] doubleArray16 = realMatrixImpl13.getDataRef();
        realMatrixImpl13.luDecompose();
        double double18 = realMatrixImpl13.getNorm();
        double[] doubleArray21 = new double[] { 0, 1 };
        org.apache.commons.math.linear.RealMatrixImpl realMatrixImpl22 = new org.apache.commons.math.linear.RealMatrixImpl(doubleArray21);
        double[] doubleArray25 = new double[] { 0, 1 };
        org.apache.commons.math.linear.RealMatrixImpl realMatrixImpl26 = new org.apache.commons.math.linear.RealMatrixImpl(doubleArray25);
        org.apache.commons.math.linear.RealMatrix realMatrix27 = realMatrixImpl22.add((org.apache.commons.math.linear.RealMatrix) realMatrixImpl26);
        double[] doubleArray30 = new double[] { 0, 1 };
        org.apache.commons.math.linear.RealMatrixImpl realMatrixImpl31 = new org.apache.commons.math.linear.RealMatrixImpl(doubleArray30);
        double[] doubleArray34 = new double[] { 0, 1 };
        org.apache.commons.math.linear.RealMatrixImpl realMatrixImpl35 = new org.apache.commons.math.linear.RealMatrixImpl(doubleArray34);
        org.apache.commons.math.linear.RealMatrix realMatrix36 = realMatrixImpl31.add((org.apache.commons.math.linear.RealMatrix) realMatrixImpl35);
        org.apache.commons.math.linear.RealMatrix realMatrix37 = realMatrixImpl26.subtract((org.apache.commons.math.linear.RealMatrix) realMatrixImpl35);
        double[] doubleArray40 = new double[] { 0, 1 };
        org.apache.commons.math.linear.RealMatrixImpl realMatrixImpl41 = new org.apache.commons.math.linear.RealMatrixImpl(doubleArray40);
        double[] doubleArray44 = new double[] { 0, 1 };
        org.apache.commons.math.linear.RealMatrixImpl realMatrixImpl45 = new org.apache.commons.math.linear.RealMatrixImpl(doubleArray44);
        org.apache.commons.math.linear.RealMatrix realMatrix46 = realMatrixImpl41.add((org.apache.commons.math.linear.RealMatrix) realMatrixImpl45);
        double[] doubleArray49 = new double[] { 10.0d, (short) -1 };
        double[] doubleArray50 = realMatrixImpl41.preMultiply(doubleArray49);
        org.apache.commons.math.linear.RealMatrixImpl realMatrixImpl51 = new org.apache.commons.math.linear.RealMatrixImpl(doubleArray49);
        double[] doubleArray52 = realMatrixImpl26.preMultiply(doubleArray49);
        org.apache.commons.math.linear.RealMatrixImpl realMatrixImpl53 = new org.apache.commons.math.linear.RealMatrixImpl(doubleArray49);
        boolean boolean54 = realMatrixImpl13.equals((java.lang.Object) doubleArray49);
        org.apache.commons.math.linear.RealMatrixImpl realMatrixImpl55 = new org.apache.commons.math.linear.RealMatrixImpl(doubleArray49);
        org.apache.commons.math.linear.RealMatrix realMatrix57 = realMatrixImpl55.scalarAdd((double) 10.0f);
        org.junit.Assert.assertNotNull(doubleArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray2), "[0.0, 1.0]");
        org.junit.Assert.assertNotNull(doubleArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray6), "[0.0, 1.0]");
        org.junit.Assert.assertNotNull(realMatrix8);
        org.junit.Assert.assertNotNull(doubleArray11);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray11), "[10.0, -1.0]");
        org.junit.Assert.assertNotNull(doubleArray12);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray12), "[-1.0]");
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 1 + "'", int15 == 1);
        org.junit.Assert.assertNotNull(doubleArray16);
        org.junit.Assert.assertTrue("'" + double18 + "' != '" + 1.0d + "'", double18 == 1.0d);
        org.junit.Assert.assertNotNull(doubleArray21);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray21), "[0.0, 1.0]");
        org.junit.Assert.assertNotNull(doubleArray25);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray25), "[0.0, 1.0]");
        org.junit.Assert.assertNotNull(realMatrix27);
        org.junit.Assert.assertNotNull(doubleArray30);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray30), "[0.0, 1.0]");
        org.junit.Assert.assertNotNull(doubleArray34);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray34), "[0.0, 1.0]");
        org.junit.Assert.assertNotNull(realMatrix36);
        org.junit.Assert.assertNotNull(realMatrix37);
        org.junit.Assert.assertNotNull(doubleArray40);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray40), "[0.0, 1.0]");
        org.junit.Assert.assertNotNull(doubleArray44);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray44), "[0.0, 1.0]");
        org.junit.Assert.assertNotNull(realMatrix46);
        org.junit.Assert.assertNotNull(doubleArray49);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray49), "[10.0, -1.0]");
        org.junit.Assert.assertNotNull(doubleArray50);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray50), "[-1.0]");
        org.junit.Assert.assertNotNull(doubleArray52);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray52), "[-1.0]");
        org.junit.Assert.assertTrue("'" + boolean54 + "' != '" + false + "'", boolean54 == false);
        org.junit.Assert.assertNotNull(realMatrix57);
    }

    @Test
    public void test5033() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5033");
        double[] doubleArray2 = new double[] { 0, 1 };
        org.apache.commons.math.linear.RealMatrixImpl realMatrixImpl3 = new org.apache.commons.math.linear.RealMatrixImpl(doubleArray2);
        double[] doubleArray6 = new double[] { 0, 1 };
        org.apache.commons.math.linear.RealMatrixImpl realMatrixImpl7 = new org.apache.commons.math.linear.RealMatrixImpl(doubleArray6);
        org.apache.commons.math.linear.RealMatrix realMatrix8 = realMatrixImpl3.add((org.apache.commons.math.linear.RealMatrix) realMatrixImpl7);
        double[] doubleArray11 = new double[] { 0, 1 };
        org.apache.commons.math.linear.RealMatrixImpl realMatrixImpl12 = new org.apache.commons.math.linear.RealMatrixImpl(doubleArray11);
        double[] doubleArray15 = new double[] { 0, 1 };
        org.apache.commons.math.linear.RealMatrixImpl realMatrixImpl16 = new org.apache.commons.math.linear.RealMatrixImpl(doubleArray15);
        org.apache.commons.math.linear.RealMatrix realMatrix17 = realMatrixImpl12.add((org.apache.commons.math.linear.RealMatrix) realMatrixImpl16);
        org.apache.commons.math.linear.RealMatrix realMatrix18 = realMatrixImpl7.subtract((org.apache.commons.math.linear.RealMatrix) realMatrixImpl16);
        boolean boolean19 = realMatrixImpl7.isSquare();
        int int20 = realMatrixImpl7.getColumnDimension();
        double[] doubleArray22 = realMatrixImpl7.getColumn((int) (byte) 0);
        org.apache.commons.math.linear.RealMatrixImpl realMatrixImpl23 = new org.apache.commons.math.linear.RealMatrixImpl(doubleArray22);
        org.apache.commons.math.linear.RealMatrixImpl realMatrixImpl24 = new org.apache.commons.math.linear.RealMatrixImpl(doubleArray22);
        double[] doubleArray27 = new double[] { 0, 1 };
        org.apache.commons.math.linear.RealMatrixImpl realMatrixImpl28 = new org.apache.commons.math.linear.RealMatrixImpl(doubleArray27);
        double[] doubleArray31 = new double[] { 0, 1 };
        org.apache.commons.math.linear.RealMatrixImpl realMatrixImpl32 = new org.apache.commons.math.linear.RealMatrixImpl(doubleArray31);
        org.apache.commons.math.linear.RealMatrix realMatrix33 = realMatrixImpl28.add((org.apache.commons.math.linear.RealMatrix) realMatrixImpl32);
        double[] doubleArray36 = new double[] { 10.0d, (short) -1 };
        double[] doubleArray37 = realMatrixImpl28.preMultiply(doubleArray36);
        org.apache.commons.math.linear.RealMatrixImpl realMatrixImpl38 = new org.apache.commons.math.linear.RealMatrixImpl(doubleArray36);
        double[] doubleArray39 = realMatrixImpl24.preMultiply(doubleArray36);
        org.apache.commons.math.linear.RealMatrixImpl realMatrixImpl40 = new org.apache.commons.math.linear.RealMatrixImpl(doubleArray36);
        double[] doubleArray43 = new double[] { 0, 1 };
        org.apache.commons.math.linear.RealMatrixImpl realMatrixImpl44 = new org.apache.commons.math.linear.RealMatrixImpl(doubleArray43);
        double double45 = realMatrixImpl44.getNorm();
        org.apache.commons.math.linear.RealMatrix realMatrix46 = realMatrixImpl44.transpose();
        double[] doubleArray48 = realMatrixImpl44.getColumn(0);
        org.apache.commons.math.linear.RealMatrix realMatrix49 = realMatrixImpl44.transpose();
        org.apache.commons.math.linear.RealMatrix realMatrix51 = realMatrixImpl44.scalarMultiply((double) 10L);
        org.apache.commons.math.linear.RealMatrix realMatrix52 = realMatrixImpl40.subtract((org.apache.commons.math.linear.RealMatrix) realMatrixImpl44);
        double[][] doubleArray53 = realMatrixImpl44.getDataRef();
        org.apache.commons.math.linear.RealMatrixImpl realMatrixImpl54 = new org.apache.commons.math.linear.RealMatrixImpl(doubleArray53);
        org.junit.Assert.assertNotNull(doubleArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray2), "[0.0, 1.0]");
        org.junit.Assert.assertNotNull(doubleArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray6), "[0.0, 1.0]");
        org.junit.Assert.assertNotNull(realMatrix8);
        org.junit.Assert.assertNotNull(doubleArray11);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray11), "[0.0, 1.0]");
        org.junit.Assert.assertNotNull(doubleArray15);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray15), "[0.0, 1.0]");
        org.junit.Assert.assertNotNull(realMatrix17);
        org.junit.Assert.assertNotNull(realMatrix18);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 1 + "'", int20 == 1);
        org.junit.Assert.assertNotNull(doubleArray22);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray22), "[0.0, 1.0]");
        org.junit.Assert.assertNotNull(doubleArray27);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray27), "[0.0, 1.0]");
        org.junit.Assert.assertNotNull(doubleArray31);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray31), "[0.0, 1.0]");
        org.junit.Assert.assertNotNull(realMatrix33);
        org.junit.Assert.assertNotNull(doubleArray36);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray36), "[10.0, -1.0]");
        org.junit.Assert.assertNotNull(doubleArray37);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray37), "[-1.0]");
        org.junit.Assert.assertNotNull(doubleArray39);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray39), "[-1.0]");
        org.junit.Assert.assertNotNull(doubleArray43);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray43), "[0.0, 1.0]");
        org.junit.Assert.assertTrue("'" + double45 + "' != '" + 1.0d + "'", double45 == 1.0d);
        org.junit.Assert.assertNotNull(realMatrix46);
        org.junit.Assert.assertNotNull(doubleArray48);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray48), "[0.0, 1.0]");
        org.junit.Assert.assertNotNull(realMatrix49);
        org.junit.Assert.assertNotNull(realMatrix51);
        org.junit.Assert.assertNotNull(realMatrix52);
        org.junit.Assert.assertNotNull(doubleArray53);
    }

    @Test
    public void test5034() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5034");
        org.apache.commons.math.linear.RealMatrixImpl realMatrixImpl2 = new org.apache.commons.math.linear.RealMatrixImpl(5, (int) (byte) 1);
        org.apache.commons.math.linear.RealMatrix realMatrix3 = realMatrixImpl2.copy();
        org.junit.Assert.assertNotNull(realMatrix3);
    }

    @Test
    public void test5035() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5035");
        org.apache.commons.math.linear.RealMatrixImpl realMatrixImpl2 = new org.apache.commons.math.linear.RealMatrixImpl(100, (int) (byte) 1);
        double[] doubleArray5 = new double[] { 0, 1 };
        org.apache.commons.math.linear.RealMatrixImpl realMatrixImpl6 = new org.apache.commons.math.linear.RealMatrixImpl(doubleArray5);
        double[] doubleArray9 = new double[] { 0, 1 };
        org.apache.commons.math.linear.RealMatrixImpl realMatrixImpl10 = new org.apache.commons.math.linear.RealMatrixImpl(doubleArray9);
        org.apache.commons.math.linear.RealMatrix realMatrix11 = realMatrixImpl6.add((org.apache.commons.math.linear.RealMatrix) realMatrixImpl10);
        boolean boolean12 = realMatrixImpl6.isSquare();
        int int13 = realMatrixImpl6.getColumnDimension();
        double double14 = realMatrixImpl6.getNorm();
        boolean boolean15 = realMatrixImpl2.equals((java.lang.Object) realMatrixImpl6);
        boolean boolean16 = realMatrixImpl6.isSingular();
        org.apache.commons.math.linear.RealMatrix realMatrix17 = realMatrixImpl6.copy();
        double[][] doubleArray18 = realMatrixImpl6.getDataRef();
        double[] doubleArray21 = new double[] { 0, 1 };
        org.apache.commons.math.linear.RealMatrixImpl realMatrixImpl22 = new org.apache.commons.math.linear.RealMatrixImpl(doubleArray21);
        double[] doubleArray25 = new double[] { 0, 1 };
        org.apache.commons.math.linear.RealMatrixImpl realMatrixImpl26 = new org.apache.commons.math.linear.RealMatrixImpl(doubleArray25);
        org.apache.commons.math.linear.RealMatrix realMatrix27 = realMatrixImpl22.add((org.apache.commons.math.linear.RealMatrix) realMatrixImpl26);
        double[] doubleArray30 = new double[] { 0, 1 };
        org.apache.commons.math.linear.RealMatrixImpl realMatrixImpl31 = new org.apache.commons.math.linear.RealMatrixImpl(doubleArray30);
        double[] doubleArray34 = new double[] { 0, 1 };
        org.apache.commons.math.linear.RealMatrixImpl realMatrixImpl35 = new org.apache.commons.math.linear.RealMatrixImpl(doubleArray34);
        org.apache.commons.math.linear.RealMatrix realMatrix36 = realMatrixImpl31.add((org.apache.commons.math.linear.RealMatrix) realMatrixImpl35);
        org.apache.commons.math.linear.RealMatrix realMatrix37 = realMatrixImpl26.subtract((org.apache.commons.math.linear.RealMatrix) realMatrixImpl35);
        boolean boolean38 = realMatrixImpl26.isSquare();
        double double39 = realMatrixImpl26.getNorm();
        double[] doubleArray41 = realMatrixImpl26.getRow((int) (short) 1);
        // The following exception was thrown during execution in test generation
        try {
            double[] doubleArray42 = realMatrixImpl6.solve(doubleArray41);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: constant vector has wrong length");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(doubleArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray5), "[0.0, 1.0]");
        org.junit.Assert.assertNotNull(doubleArray9);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray9), "[0.0, 1.0]");
        org.junit.Assert.assertNotNull(realMatrix11);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 1 + "'", int13 == 1);
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + 1.0d + "'", double14 == 1.0d);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertNotNull(realMatrix17);
        org.junit.Assert.assertNotNull(doubleArray18);
        org.junit.Assert.assertNotNull(doubleArray21);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray21), "[0.0, 1.0]");
        org.junit.Assert.assertNotNull(doubleArray25);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray25), "[0.0, 1.0]");
        org.junit.Assert.assertNotNull(realMatrix27);
        org.junit.Assert.assertNotNull(doubleArray30);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray30), "[0.0, 1.0]");
        org.junit.Assert.assertNotNull(doubleArray34);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray34), "[0.0, 1.0]");
        org.junit.Assert.assertNotNull(realMatrix36);
        org.junit.Assert.assertNotNull(realMatrix37);
        org.junit.Assert.assertTrue("'" + boolean38 + "' != '" + false + "'", boolean38 == false);
        org.junit.Assert.assertTrue("'" + double39 + "' != '" + 1.0d + "'", double39 == 1.0d);
        org.junit.Assert.assertNotNull(doubleArray41);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray41), "[1.0]");
    }

    @Test
    public void test5036() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5036");
        double[] doubleArray2 = new double[] { 0, 1 };
        org.apache.commons.math.linear.RealMatrixImpl realMatrixImpl3 = new org.apache.commons.math.linear.RealMatrixImpl(doubleArray2);
        double double4 = realMatrixImpl3.getNorm();
        org.apache.commons.math.linear.RealMatrix realMatrix5 = realMatrixImpl3.transpose();
        double[][] doubleArray6 = realMatrixImpl3.getDataRef();
        org.apache.commons.math.linear.RealMatrix realMatrix8 = realMatrixImpl3.scalarAdd(0.0d);
        double[] doubleArray11 = new double[] { 0, 1 };
        org.apache.commons.math.linear.RealMatrixImpl realMatrixImpl12 = new org.apache.commons.math.linear.RealMatrixImpl(doubleArray11);
        double[] doubleArray15 = new double[] { 0, 1 };
        org.apache.commons.math.linear.RealMatrixImpl realMatrixImpl16 = new org.apache.commons.math.linear.RealMatrixImpl(doubleArray15);
        org.apache.commons.math.linear.RealMatrix realMatrix17 = realMatrixImpl12.add((org.apache.commons.math.linear.RealMatrix) realMatrixImpl16);
        org.apache.commons.math.linear.RealMatrix realMatrix18 = realMatrixImpl3.add((org.apache.commons.math.linear.RealMatrix) realMatrixImpl12);
        boolean boolean19 = realMatrixImpl3.isSingular();
        org.apache.commons.math.linear.RealMatrix realMatrix21 = realMatrixImpl3.scalarAdd(10.0d);
        java.lang.String str22 = realMatrixImpl3.toString();
        double[] doubleArray25 = new double[] { 0, 1 };
        org.apache.commons.math.linear.RealMatrixImpl realMatrixImpl26 = new org.apache.commons.math.linear.RealMatrixImpl(doubleArray25);
        double[] doubleArray29 = new double[] { 0, 1 };
        org.apache.commons.math.linear.RealMatrixImpl realMatrixImpl30 = new org.apache.commons.math.linear.RealMatrixImpl(doubleArray29);
        org.apache.commons.math.linear.RealMatrix realMatrix31 = realMatrixImpl26.add((org.apache.commons.math.linear.RealMatrix) realMatrixImpl30);
        double[] doubleArray34 = new double[] { 0, 1 };
        org.apache.commons.math.linear.RealMatrixImpl realMatrixImpl35 = new org.apache.commons.math.linear.RealMatrixImpl(doubleArray34);
        double[] doubleArray38 = new double[] { 0, 1 };
        org.apache.commons.math.linear.RealMatrixImpl realMatrixImpl39 = new org.apache.commons.math.linear.RealMatrixImpl(doubleArray38);
        org.apache.commons.math.linear.RealMatrix realMatrix40 = realMatrixImpl35.add((org.apache.commons.math.linear.RealMatrix) realMatrixImpl39);
        org.apache.commons.math.linear.RealMatrix realMatrix41 = realMatrixImpl30.subtract((org.apache.commons.math.linear.RealMatrix) realMatrixImpl39);
        boolean boolean42 = realMatrixImpl30.isSquare();
        int int43 = realMatrixImpl30.getColumnDimension();
        double[] doubleArray45 = realMatrixImpl30.getColumn((int) (byte) 0);
        org.apache.commons.math.linear.RealMatrixImpl realMatrixImpl46 = new org.apache.commons.math.linear.RealMatrixImpl(doubleArray45);
        org.apache.commons.math.linear.RealMatrixImpl realMatrixImpl47 = new org.apache.commons.math.linear.RealMatrixImpl(doubleArray45);
        double[][] doubleArray48 = realMatrixImpl47.getDataRef();
        realMatrixImpl3.setSubMatrix(doubleArray48, 0, (int) (short) 0);
        double[] doubleArray54 = new double[] { 0, 1 };
        org.apache.commons.math.linear.RealMatrixImpl realMatrixImpl55 = new org.apache.commons.math.linear.RealMatrixImpl(doubleArray54);
        double[] doubleArray58 = new double[] { 0, 1 };
        org.apache.commons.math.linear.RealMatrixImpl realMatrixImpl59 = new org.apache.commons.math.linear.RealMatrixImpl(doubleArray58);
        org.apache.commons.math.linear.RealMatrix realMatrix60 = realMatrixImpl55.add((org.apache.commons.math.linear.RealMatrix) realMatrixImpl59);
        double[] doubleArray63 = new double[] { 10.0d, (short) -1 };
        double[] doubleArray64 = realMatrixImpl55.preMultiply(doubleArray63);
        org.apache.commons.math.linear.RealMatrixImpl realMatrixImpl65 = new org.apache.commons.math.linear.RealMatrixImpl(doubleArray63);
        boolean boolean66 = realMatrixImpl65.isSingular();
        double double67 = realMatrixImpl65.getNorm();
        double[] doubleArray70 = new double[] { 0, 1 };
        org.apache.commons.math.linear.RealMatrixImpl realMatrixImpl71 = new org.apache.commons.math.linear.RealMatrixImpl(doubleArray70);
        double[] doubleArray74 = new double[] { 0, 1 };
        org.apache.commons.math.linear.RealMatrixImpl realMatrixImpl75 = new org.apache.commons.math.linear.RealMatrixImpl(doubleArray74);
        org.apache.commons.math.linear.RealMatrix realMatrix76 = realMatrixImpl71.add((org.apache.commons.math.linear.RealMatrix) realMatrixImpl75);
        double[] doubleArray79 = new double[] { 0, 1 };
        org.apache.commons.math.linear.RealMatrixImpl realMatrixImpl80 = new org.apache.commons.math.linear.RealMatrixImpl(doubleArray79);
        double[] doubleArray83 = new double[] { 0, 1 };
        org.apache.commons.math.linear.RealMatrixImpl realMatrixImpl84 = new org.apache.commons.math.linear.RealMatrixImpl(doubleArray83);
        org.apache.commons.math.linear.RealMatrix realMatrix85 = realMatrixImpl80.add((org.apache.commons.math.linear.RealMatrix) realMatrixImpl84);
        org.apache.commons.math.linear.RealMatrix realMatrix86 = realMatrixImpl75.subtract((org.apache.commons.math.linear.RealMatrix) realMatrixImpl84);
        org.apache.commons.math.linear.RealMatrix realMatrix87 = realMatrixImpl65.subtract((org.apache.commons.math.linear.RealMatrix) realMatrixImpl84);
        org.apache.commons.math.linear.RealMatrix realMatrix89 = realMatrixImpl84.getRowMatrix((int) (short) 1);
        org.apache.commons.math.linear.RealMatrix realMatrix90 = realMatrixImpl84.copy();
        boolean boolean91 = realMatrixImpl3.equals((java.lang.Object) realMatrix90);
        org.apache.commons.math.linear.RealMatrix realMatrix93 = realMatrixImpl3.scalarMultiply(0.0d);
        // The following exception was thrown during execution in test generation
        try {
            double double94 = realMatrixImpl3.getTrace();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: matrix is not square");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(doubleArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray2), "[0.0, 1.0]");
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 1.0d + "'", double4 == 1.0d);
        org.junit.Assert.assertNotNull(realMatrix5);
        org.junit.Assert.assertNotNull(doubleArray6);
        org.junit.Assert.assertNotNull(realMatrix8);
        org.junit.Assert.assertNotNull(doubleArray11);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray11), "[0.0, 1.0]");
        org.junit.Assert.assertNotNull(doubleArray15);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray15), "[0.0, 1.0]");
        org.junit.Assert.assertNotNull(realMatrix17);
        org.junit.Assert.assertNotNull(realMatrix18);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + true + "'", boolean19 == true);
        org.junit.Assert.assertNotNull(realMatrix21);
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "RealMatrixImpl{{0.0},{1.0}}" + "'", str22, "RealMatrixImpl{{0.0},{1.0}}");
        org.junit.Assert.assertNotNull(doubleArray25);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray25), "[0.0, 1.0]");
        org.junit.Assert.assertNotNull(doubleArray29);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray29), "[0.0, 1.0]");
        org.junit.Assert.assertNotNull(realMatrix31);
        org.junit.Assert.assertNotNull(doubleArray34);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray34), "[0.0, 1.0]");
        org.junit.Assert.assertNotNull(doubleArray38);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray38), "[0.0, 1.0]");
        org.junit.Assert.assertNotNull(realMatrix40);
        org.junit.Assert.assertNotNull(realMatrix41);
        org.junit.Assert.assertTrue("'" + boolean42 + "' != '" + false + "'", boolean42 == false);
        org.junit.Assert.assertTrue("'" + int43 + "' != '" + 1 + "'", int43 == 1);
        org.junit.Assert.assertNotNull(doubleArray45);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray45), "[0.0, 1.0]");
        org.junit.Assert.assertNotNull(doubleArray48);
        org.junit.Assert.assertNotNull(doubleArray54);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray54), "[0.0, 1.0]");
        org.junit.Assert.assertNotNull(doubleArray58);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray58), "[0.0, 1.0]");
        org.junit.Assert.assertNotNull(realMatrix60);
        org.junit.Assert.assertNotNull(doubleArray63);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray63), "[10.0, -1.0]");
        org.junit.Assert.assertNotNull(doubleArray64);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray64), "[-1.0]");
        org.junit.Assert.assertTrue("'" + boolean66 + "' != '" + true + "'", boolean66 == true);
        org.junit.Assert.assertTrue("'" + double67 + "' != '" + 11.0d + "'", double67 == 11.0d);
        org.junit.Assert.assertNotNull(doubleArray70);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray70), "[0.0, 1.0]");
        org.junit.Assert.assertNotNull(doubleArray74);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray74), "[0.0, 1.0]");
        org.junit.Assert.assertNotNull(realMatrix76);
        org.junit.Assert.assertNotNull(doubleArray79);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray79), "[0.0, 1.0]");
        org.junit.Assert.assertNotNull(doubleArray83);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray83), "[0.0, 1.0]");
        org.junit.Assert.assertNotNull(realMatrix85);
        org.junit.Assert.assertNotNull(realMatrix86);
        org.junit.Assert.assertNotNull(realMatrix87);
        org.junit.Assert.assertNotNull(realMatrix89);
        org.junit.Assert.assertNotNull(realMatrix90);
        org.junit.Assert.assertTrue("'" + boolean91 + "' != '" + true + "'", boolean91 == true);
        org.junit.Assert.assertNotNull(realMatrix93);
    }

    @Test
    public void test5037() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5037");
        double[] doubleArray5 = new double[] { (short) 10, 1.0d, 0.0f, (-1.0f), 0.0d };
        org.apache.commons.math.linear.RealMatrixImpl realMatrixImpl6 = new org.apache.commons.math.linear.RealMatrixImpl(doubleArray5);
        int int7 = realMatrixImpl6.getColumnDimension();
        org.apache.commons.math.linear.RealMatrix realMatrix8 = realMatrixImpl6.copy();
        boolean boolean9 = realMatrixImpl6.isSingular();
        double[][] doubleArray10 = realMatrixImpl6.getDataRef();
        org.apache.commons.math.linear.RealMatrixImpl realMatrixImpl11 = new org.apache.commons.math.linear.RealMatrixImpl(doubleArray10);
        org.junit.Assert.assertNotNull(doubleArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray5), "[10.0, 1.0, 0.0, -1.0, 0.0]");
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 1 + "'", int7 == 1);
        org.junit.Assert.assertNotNull(realMatrix8);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertNotNull(doubleArray10);
    }

    @Test
    public void test5038() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5038");
        double[] doubleArray2 = new double[] { 0, 1 };
        org.apache.commons.math.linear.RealMatrixImpl realMatrixImpl3 = new org.apache.commons.math.linear.RealMatrixImpl(doubleArray2);
        double[] doubleArray6 = new double[] { 0, 1 };
        org.apache.commons.math.linear.RealMatrixImpl realMatrixImpl7 = new org.apache.commons.math.linear.RealMatrixImpl(doubleArray6);
        org.apache.commons.math.linear.RealMatrix realMatrix8 = realMatrixImpl3.add((org.apache.commons.math.linear.RealMatrix) realMatrixImpl7);
        double[] doubleArray11 = new double[] { 0, 1 };
        org.apache.commons.math.linear.RealMatrixImpl realMatrixImpl12 = new org.apache.commons.math.linear.RealMatrixImpl(doubleArray11);
        double[] doubleArray15 = new double[] { 0, 1 };
        org.apache.commons.math.linear.RealMatrixImpl realMatrixImpl16 = new org.apache.commons.math.linear.RealMatrixImpl(doubleArray15);
        org.apache.commons.math.linear.RealMatrix realMatrix17 = realMatrixImpl12.add((org.apache.commons.math.linear.RealMatrix) realMatrixImpl16);
        org.apache.commons.math.linear.RealMatrix realMatrix18 = realMatrixImpl7.subtract((org.apache.commons.math.linear.RealMatrix) realMatrixImpl16);
        double[] doubleArray21 = new double[] { 0, 1 };
        org.apache.commons.math.linear.RealMatrixImpl realMatrixImpl22 = new org.apache.commons.math.linear.RealMatrixImpl(doubleArray21);
        double[] doubleArray25 = new double[] { 0, 1 };
        org.apache.commons.math.linear.RealMatrixImpl realMatrixImpl26 = new org.apache.commons.math.linear.RealMatrixImpl(doubleArray25);
        org.apache.commons.math.linear.RealMatrix realMatrix27 = realMatrixImpl22.add((org.apache.commons.math.linear.RealMatrix) realMatrixImpl26);
        double[] doubleArray30 = new double[] { 10.0d, (short) -1 };
        double[] doubleArray31 = realMatrixImpl22.preMultiply(doubleArray30);
        org.apache.commons.math.linear.RealMatrix realMatrix32 = realMatrixImpl16.subtract((org.apache.commons.math.linear.RealMatrix) realMatrixImpl22);
        double[][] doubleArray33 = realMatrixImpl22.getData();
        org.apache.commons.math.linear.RealMatrix realMatrix34 = realMatrixImpl22.copy();
        double[] doubleArray37 = new double[] { 0, 1 };
        org.apache.commons.math.linear.RealMatrixImpl realMatrixImpl38 = new org.apache.commons.math.linear.RealMatrixImpl(doubleArray37);
        double double39 = realMatrixImpl38.getNorm();
        org.apache.commons.math.linear.RealMatrix realMatrix40 = realMatrixImpl38.transpose();
        double[][] doubleArray41 = realMatrixImpl38.getDataRef();
        org.apache.commons.math.linear.RealMatrix realMatrix42 = realMatrixImpl38.copy();
        org.apache.commons.math.linear.RealMatrix realMatrix43 = realMatrixImpl22.subtract(realMatrix42);
        // The following exception was thrown during execution in test generation
        try {
            double double44 = realMatrixImpl22.getDeterminant();
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math.linear.InvalidMatrixException; message: matrix is not square");
        } catch (org.apache.commons.math.linear.InvalidMatrixException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(doubleArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray2), "[0.0, 1.0]");
        org.junit.Assert.assertNotNull(doubleArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray6), "[0.0, 1.0]");
        org.junit.Assert.assertNotNull(realMatrix8);
        org.junit.Assert.assertNotNull(doubleArray11);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray11), "[0.0, 1.0]");
        org.junit.Assert.assertNotNull(doubleArray15);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray15), "[0.0, 1.0]");
        org.junit.Assert.assertNotNull(realMatrix17);
        org.junit.Assert.assertNotNull(realMatrix18);
        org.junit.Assert.assertNotNull(doubleArray21);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray21), "[0.0, 1.0]");
        org.junit.Assert.assertNotNull(doubleArray25);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray25), "[0.0, 1.0]");
        org.junit.Assert.assertNotNull(realMatrix27);
        org.junit.Assert.assertNotNull(doubleArray30);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray30), "[10.0, -1.0]");
        org.junit.Assert.assertNotNull(doubleArray31);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray31), "[-1.0]");
        org.junit.Assert.assertNotNull(realMatrix32);
        org.junit.Assert.assertNotNull(doubleArray33);
        org.junit.Assert.assertNotNull(realMatrix34);
        org.junit.Assert.assertNotNull(doubleArray37);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray37), "[0.0, 1.0]");
        org.junit.Assert.assertTrue("'" + double39 + "' != '" + 1.0d + "'", double39 == 1.0d);
        org.junit.Assert.assertNotNull(realMatrix40);
        org.junit.Assert.assertNotNull(doubleArray41);
        org.junit.Assert.assertNotNull(realMatrix42);
        org.junit.Assert.assertNotNull(realMatrix43);
    }

    @Test
    public void test5039() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5039");
        double[] doubleArray2 = new double[] { 0, 1 };
        org.apache.commons.math.linear.RealMatrixImpl realMatrixImpl3 = new org.apache.commons.math.linear.RealMatrixImpl(doubleArray2);
        double[] doubleArray6 = new double[] { 0, 1 };
        org.apache.commons.math.linear.RealMatrixImpl realMatrixImpl7 = new org.apache.commons.math.linear.RealMatrixImpl(doubleArray6);
        org.apache.commons.math.linear.RealMatrix realMatrix8 = realMatrixImpl3.add((org.apache.commons.math.linear.RealMatrix) realMatrixImpl7);
        java.lang.String str9 = realMatrixImpl3.toString();
        double[] doubleArray12 = new double[] { 0, 1 };
        org.apache.commons.math.linear.RealMatrixImpl realMatrixImpl13 = new org.apache.commons.math.linear.RealMatrixImpl(doubleArray12);
        double[] doubleArray16 = new double[] { 0, 1 };
        org.apache.commons.math.linear.RealMatrixImpl realMatrixImpl17 = new org.apache.commons.math.linear.RealMatrixImpl(doubleArray16);
        org.apache.commons.math.linear.RealMatrix realMatrix18 = realMatrixImpl13.add((org.apache.commons.math.linear.RealMatrix) realMatrixImpl17);
        double[][] doubleArray19 = realMatrixImpl13.getData();
        org.apache.commons.math.linear.RealMatrixImpl realMatrixImpl20 = new org.apache.commons.math.linear.RealMatrixImpl(doubleArray19);
        int int21 = realMatrixImpl20.getRowDimension();
        org.apache.commons.math.linear.RealMatrix realMatrix22 = realMatrixImpl3.subtract((org.apache.commons.math.linear.RealMatrix) realMatrixImpl20);
        double[] doubleArray25 = new double[] { 0, 1 };
        org.apache.commons.math.linear.RealMatrixImpl realMatrixImpl26 = new org.apache.commons.math.linear.RealMatrixImpl(doubleArray25);
        double[] doubleArray29 = new double[] { 0, 1 };
        org.apache.commons.math.linear.RealMatrixImpl realMatrixImpl30 = new org.apache.commons.math.linear.RealMatrixImpl(doubleArray29);
        org.apache.commons.math.linear.RealMatrix realMatrix31 = realMatrixImpl26.add((org.apache.commons.math.linear.RealMatrix) realMatrixImpl30);
        double[] doubleArray34 = new double[] { 10.0d, (short) -1 };
        double[] doubleArray35 = realMatrixImpl26.preMultiply(doubleArray34);
        org.apache.commons.math.linear.RealMatrixImpl realMatrixImpl36 = new org.apache.commons.math.linear.RealMatrixImpl(doubleArray34);
        java.lang.String str37 = realMatrixImpl36.toString();
        double[] doubleArray40 = new double[] { 0, 1 };
        org.apache.commons.math.linear.RealMatrixImpl realMatrixImpl41 = new org.apache.commons.math.linear.RealMatrixImpl(doubleArray40);
        org.apache.commons.math.linear.RealMatrix realMatrix43 = realMatrixImpl41.scalarMultiply((double) (short) 100);
        double[][] doubleArray44 = realMatrixImpl41.getDataRef();
        org.apache.commons.math.linear.RealMatrix realMatrix45 = realMatrixImpl36.subtract((org.apache.commons.math.linear.RealMatrix) realMatrixImpl41);
        boolean boolean46 = realMatrixImpl3.equals((java.lang.Object) realMatrix45);
        org.apache.commons.math.linear.RealMatrix realMatrix47 = realMatrixImpl3.copy();
        double[] doubleArray49 = realMatrixImpl3.getRow((int) (byte) 0);
        org.junit.Assert.assertNotNull(doubleArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray2), "[0.0, 1.0]");
        org.junit.Assert.assertNotNull(doubleArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray6), "[0.0, 1.0]");
        org.junit.Assert.assertNotNull(realMatrix8);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "RealMatrixImpl{{0.0},{1.0}}" + "'", str9, "RealMatrixImpl{{0.0},{1.0}}");
        org.junit.Assert.assertNotNull(doubleArray12);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray12), "[0.0, 1.0]");
        org.junit.Assert.assertNotNull(doubleArray16);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray16), "[0.0, 1.0]");
        org.junit.Assert.assertNotNull(realMatrix18);
        org.junit.Assert.assertNotNull(doubleArray19);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 2 + "'", int21 == 2);
        org.junit.Assert.assertNotNull(realMatrix22);
        org.junit.Assert.assertNotNull(doubleArray25);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray25), "[0.0, 1.0]");
        org.junit.Assert.assertNotNull(doubleArray29);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray29), "[0.0, 1.0]");
        org.junit.Assert.assertNotNull(realMatrix31);
        org.junit.Assert.assertNotNull(doubleArray34);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray34), "[10.0, -1.0]");
        org.junit.Assert.assertNotNull(doubleArray35);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray35), "[-1.0]");
        org.junit.Assert.assertEquals("'" + str37 + "' != '" + "RealMatrixImpl{{10.0},{-1.0}}" + "'", str37, "RealMatrixImpl{{10.0},{-1.0}}");
        org.junit.Assert.assertNotNull(doubleArray40);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray40), "[0.0, 1.0]");
        org.junit.Assert.assertNotNull(realMatrix43);
        org.junit.Assert.assertNotNull(doubleArray44);
        org.junit.Assert.assertNotNull(realMatrix45);
        org.junit.Assert.assertTrue("'" + boolean46 + "' != '" + false + "'", boolean46 == false);
        org.junit.Assert.assertNotNull(realMatrix47);
        org.junit.Assert.assertNotNull(doubleArray49);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray49), "[0.0]");
    }

    @Test
    public void test5040() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5040");
        double[] doubleArray2 = new double[] { 0, 1 };
        org.apache.commons.math.linear.RealMatrixImpl realMatrixImpl3 = new org.apache.commons.math.linear.RealMatrixImpl(doubleArray2);
        double[] doubleArray6 = new double[] { 0, 1 };
        org.apache.commons.math.linear.RealMatrixImpl realMatrixImpl7 = new org.apache.commons.math.linear.RealMatrixImpl(doubleArray6);
        org.apache.commons.math.linear.RealMatrix realMatrix8 = realMatrixImpl3.add((org.apache.commons.math.linear.RealMatrix) realMatrixImpl7);
        boolean boolean9 = realMatrixImpl3.isSquare();
        int int10 = realMatrixImpl3.getColumnDimension();
        double[] doubleArray13 = new double[] { 0, 1 };
        org.apache.commons.math.linear.RealMatrixImpl realMatrixImpl14 = new org.apache.commons.math.linear.RealMatrixImpl(doubleArray13);
        double[] doubleArray17 = new double[] { 0, 1 };
        org.apache.commons.math.linear.RealMatrixImpl realMatrixImpl18 = new org.apache.commons.math.linear.RealMatrixImpl(doubleArray17);
        org.apache.commons.math.linear.RealMatrix realMatrix19 = realMatrixImpl14.add((org.apache.commons.math.linear.RealMatrix) realMatrixImpl18);
        double[] doubleArray22 = new double[] { 10.0d, (short) -1 };
        double[] doubleArray23 = realMatrixImpl14.preMultiply(doubleArray22);
        org.apache.commons.math.linear.RealMatrixImpl realMatrixImpl24 = new org.apache.commons.math.linear.RealMatrixImpl(doubleArray22);
        double[] doubleArray25 = realMatrixImpl3.preMultiply(doubleArray22);
        boolean boolean26 = realMatrixImpl3.isSquare();
        double[][] doubleArray27 = realMatrixImpl3.getDataRef();
        double[] doubleArray30 = new double[] { 0, 1 };
        org.apache.commons.math.linear.RealMatrixImpl realMatrixImpl31 = new org.apache.commons.math.linear.RealMatrixImpl(doubleArray30);
        double[] doubleArray34 = new double[] { 0, 1 };
        org.apache.commons.math.linear.RealMatrixImpl realMatrixImpl35 = new org.apache.commons.math.linear.RealMatrixImpl(doubleArray34);
        org.apache.commons.math.linear.RealMatrix realMatrix36 = realMatrixImpl31.add((org.apache.commons.math.linear.RealMatrix) realMatrixImpl35);
        double[][] doubleArray37 = realMatrixImpl31.getData();
        org.apache.commons.math.linear.RealMatrixImpl realMatrixImpl38 = new org.apache.commons.math.linear.RealMatrixImpl(doubleArray37);
        org.apache.commons.math.linear.RealMatrix realMatrix39 = realMatrixImpl38.copy();
        boolean boolean40 = realMatrixImpl38.isSquare();
        org.apache.commons.math.linear.RealMatrix realMatrix41 = realMatrixImpl3.add((org.apache.commons.math.linear.RealMatrix) realMatrixImpl38);
        int[] intArray45 = new int[] { (short) 1, (byte) -1, '4' };
        int[] intArray48 = new int[] { (short) -1, 2 };
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math.linear.RealMatrix realMatrix49 = realMatrixImpl3.getSubMatrix(intArray45, intArray48);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math.linear.MatrixIndexException; message: matrix dimension mismatch");
        } catch (org.apache.commons.math.linear.MatrixIndexException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(doubleArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray2), "[0.0, 1.0]");
        org.junit.Assert.assertNotNull(doubleArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray6), "[0.0, 1.0]");
        org.junit.Assert.assertNotNull(realMatrix8);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 1 + "'", int10 == 1);
        org.junit.Assert.assertNotNull(doubleArray13);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray13), "[0.0, 1.0]");
        org.junit.Assert.assertNotNull(doubleArray17);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray17), "[0.0, 1.0]");
        org.junit.Assert.assertNotNull(realMatrix19);
        org.junit.Assert.assertNotNull(doubleArray22);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray22), "[10.0, -1.0]");
        org.junit.Assert.assertNotNull(doubleArray23);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray23), "[-1.0]");
        org.junit.Assert.assertNotNull(doubleArray25);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray25), "[-1.0]");
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
        org.junit.Assert.assertNotNull(doubleArray27);
        org.junit.Assert.assertNotNull(doubleArray30);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray30), "[0.0, 1.0]");
        org.junit.Assert.assertNotNull(doubleArray34);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray34), "[0.0, 1.0]");
        org.junit.Assert.assertNotNull(realMatrix36);
        org.junit.Assert.assertNotNull(doubleArray37);
        org.junit.Assert.assertNotNull(realMatrix39);
        org.junit.Assert.assertTrue("'" + boolean40 + "' != '" + false + "'", boolean40 == false);
        org.junit.Assert.assertNotNull(realMatrix41);
        org.junit.Assert.assertNotNull(intArray45);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray45), "[1, -1, 52]");
        org.junit.Assert.assertNotNull(intArray48);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray48), "[-1, 2]");
    }

    @Test
    public void test5041() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5041");
        double[] doubleArray2 = new double[] { 0, 1 };
        org.apache.commons.math.linear.RealMatrixImpl realMatrixImpl3 = new org.apache.commons.math.linear.RealMatrixImpl(doubleArray2);
        double[] doubleArray6 = new double[] { 0, 1 };
        org.apache.commons.math.linear.RealMatrixImpl realMatrixImpl7 = new org.apache.commons.math.linear.RealMatrixImpl(doubleArray6);
        org.apache.commons.math.linear.RealMatrix realMatrix8 = realMatrixImpl3.add((org.apache.commons.math.linear.RealMatrix) realMatrixImpl7);
        double[] doubleArray11 = new double[] { 10.0d, (short) -1 };
        double[] doubleArray12 = realMatrixImpl3.preMultiply(doubleArray11);
        org.apache.commons.math.linear.RealMatrixImpl realMatrixImpl13 = new org.apache.commons.math.linear.RealMatrixImpl(doubleArray11);
        boolean boolean14 = realMatrixImpl13.isSingular();
        double[][] doubleArray15 = realMatrixImpl13.getDataRef();
        java.lang.String str16 = realMatrixImpl13.toString();
        double[] doubleArray19 = new double[] { 0, 1 };
        org.apache.commons.math.linear.RealMatrixImpl realMatrixImpl20 = new org.apache.commons.math.linear.RealMatrixImpl(doubleArray19);
        double double21 = realMatrixImpl20.getNorm();
        double[] doubleArray24 = new double[] { 0, 1 };
        org.apache.commons.math.linear.RealMatrixImpl realMatrixImpl25 = new org.apache.commons.math.linear.RealMatrixImpl(doubleArray24);
        double double26 = realMatrixImpl25.getNorm();
        org.apache.commons.math.linear.RealMatrix realMatrix27 = realMatrixImpl25.transpose();
        double[] doubleArray29 = realMatrixImpl25.getColumn(0);
        double[] doubleArray30 = realMatrixImpl20.preMultiply(doubleArray29);
        double[] doubleArray31 = realMatrixImpl13.preMultiply(doubleArray29);
        double[] doubleArray34 = new double[] { 0, 1 };
        org.apache.commons.math.linear.RealMatrixImpl realMatrixImpl35 = new org.apache.commons.math.linear.RealMatrixImpl(doubleArray34);
        double[] doubleArray38 = new double[] { 0, 1 };
        org.apache.commons.math.linear.RealMatrixImpl realMatrixImpl39 = new org.apache.commons.math.linear.RealMatrixImpl(doubleArray38);
        org.apache.commons.math.linear.RealMatrix realMatrix40 = realMatrixImpl35.add((org.apache.commons.math.linear.RealMatrix) realMatrixImpl39);
        boolean boolean41 = realMatrixImpl35.isSquare();
        int int42 = realMatrixImpl35.getColumnDimension();
        double[] doubleArray45 = new double[] { 0, 1 };
        org.apache.commons.math.linear.RealMatrixImpl realMatrixImpl46 = new org.apache.commons.math.linear.RealMatrixImpl(doubleArray45);
        double[] doubleArray49 = new double[] { 0, 1 };
        org.apache.commons.math.linear.RealMatrixImpl realMatrixImpl50 = new org.apache.commons.math.linear.RealMatrixImpl(doubleArray49);
        org.apache.commons.math.linear.RealMatrix realMatrix51 = realMatrixImpl46.add((org.apache.commons.math.linear.RealMatrix) realMatrixImpl50);
        double[] doubleArray54 = new double[] { 10.0d, (short) -1 };
        double[] doubleArray55 = realMatrixImpl46.preMultiply(doubleArray54);
        org.apache.commons.math.linear.RealMatrixImpl realMatrixImpl56 = new org.apache.commons.math.linear.RealMatrixImpl(doubleArray54);
        double[] doubleArray57 = realMatrixImpl35.preMultiply(doubleArray54);
        double[] doubleArray58 = realMatrixImpl13.preMultiply(doubleArray54);
        boolean boolean59 = realMatrixImpl13.isSquare();
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math.linear.RealMatrix realMatrix60 = realMatrixImpl13.inverse();
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math.linear.InvalidMatrixException; message: coefficient matrix is not square");
        } catch (org.apache.commons.math.linear.InvalidMatrixException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(doubleArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray2), "[0.0, 1.0]");
        org.junit.Assert.assertNotNull(doubleArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray6), "[0.0, 1.0]");
        org.junit.Assert.assertNotNull(realMatrix8);
        org.junit.Assert.assertNotNull(doubleArray11);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray11), "[10.0, -1.0]");
        org.junit.Assert.assertNotNull(doubleArray12);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray12), "[-1.0]");
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertNotNull(doubleArray15);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "RealMatrixImpl{{10.0},{-1.0}}" + "'", str16, "RealMatrixImpl{{10.0},{-1.0}}");
        org.junit.Assert.assertNotNull(doubleArray19);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray19), "[0.0, 1.0]");
        org.junit.Assert.assertTrue("'" + double21 + "' != '" + 1.0d + "'", double21 == 1.0d);
        org.junit.Assert.assertNotNull(doubleArray24);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray24), "[0.0, 1.0]");
        org.junit.Assert.assertTrue("'" + double26 + "' != '" + 1.0d + "'", double26 == 1.0d);
        org.junit.Assert.assertNotNull(realMatrix27);
        org.junit.Assert.assertNotNull(doubleArray29);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray29), "[0.0, 1.0]");
        org.junit.Assert.assertNotNull(doubleArray30);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray30), "[1.0]");
        org.junit.Assert.assertNotNull(doubleArray31);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray31), "[-1.0]");
        org.junit.Assert.assertNotNull(doubleArray34);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray34), "[0.0, 1.0]");
        org.junit.Assert.assertNotNull(doubleArray38);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray38), "[0.0, 1.0]");
        org.junit.Assert.assertNotNull(realMatrix40);
        org.junit.Assert.assertTrue("'" + boolean41 + "' != '" + false + "'", boolean41 == false);
        org.junit.Assert.assertTrue("'" + int42 + "' != '" + 1 + "'", int42 == 1);
        org.junit.Assert.assertNotNull(doubleArray45);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray45), "[0.0, 1.0]");
        org.junit.Assert.assertNotNull(doubleArray49);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray49), "[0.0, 1.0]");
        org.junit.Assert.assertNotNull(realMatrix51);
        org.junit.Assert.assertNotNull(doubleArray54);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray54), "[10.0, -1.0]");
        org.junit.Assert.assertNotNull(doubleArray55);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray55), "[-1.0]");
        org.junit.Assert.assertNotNull(doubleArray57);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray57), "[-1.0]");
        org.junit.Assert.assertNotNull(doubleArray58);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray58), "[101.0]");
        org.junit.Assert.assertTrue("'" + boolean59 + "' != '" + false + "'", boolean59 == false);
    }

    @Test
    public void test5042() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5042");
        double[] doubleArray2 = new double[] { 0, 1 };
        org.apache.commons.math.linear.RealMatrixImpl realMatrixImpl3 = new org.apache.commons.math.linear.RealMatrixImpl(doubleArray2);
        org.apache.commons.math.linear.RealMatrix realMatrix5 = realMatrixImpl3.scalarMultiply((double) (short) 100);
        double[][] doubleArray6 = realMatrixImpl3.getDataRef();
        double[][] doubleArray7 = realMatrixImpl3.getData();
        org.apache.commons.math.linear.RealMatrixImpl realMatrixImpl8 = new org.apache.commons.math.linear.RealMatrixImpl(doubleArray7);
        double[] doubleArray11 = new double[] { 0, 1 };
        org.apache.commons.math.linear.RealMatrixImpl realMatrixImpl12 = new org.apache.commons.math.linear.RealMatrixImpl(doubleArray11);
        double[] doubleArray15 = new double[] { 0, 1 };
        org.apache.commons.math.linear.RealMatrixImpl realMatrixImpl16 = new org.apache.commons.math.linear.RealMatrixImpl(doubleArray15);
        org.apache.commons.math.linear.RealMatrix realMatrix17 = realMatrixImpl12.add((org.apache.commons.math.linear.RealMatrix) realMatrixImpl16);
        double[] doubleArray20 = new double[] { 10.0d, (short) -1 };
        double[] doubleArray21 = realMatrixImpl12.preMultiply(doubleArray20);
        boolean boolean22 = realMatrixImpl12.isSingular();
        org.apache.commons.math.linear.RealMatrix realMatrix23 = realMatrixImpl12.transpose();
        double[] doubleArray26 = new double[] { 0, 1 };
        org.apache.commons.math.linear.RealMatrixImpl realMatrixImpl27 = new org.apache.commons.math.linear.RealMatrixImpl(doubleArray26);
        double[] doubleArray30 = new double[] { 0, 1 };
        org.apache.commons.math.linear.RealMatrixImpl realMatrixImpl31 = new org.apache.commons.math.linear.RealMatrixImpl(doubleArray30);
        org.apache.commons.math.linear.RealMatrix realMatrix32 = realMatrixImpl27.add((org.apache.commons.math.linear.RealMatrix) realMatrixImpl31);
        double[] doubleArray35 = new double[] { 0, 1 };
        org.apache.commons.math.linear.RealMatrixImpl realMatrixImpl36 = new org.apache.commons.math.linear.RealMatrixImpl(doubleArray35);
        double[] doubleArray39 = new double[] { 0, 1 };
        org.apache.commons.math.linear.RealMatrixImpl realMatrixImpl40 = new org.apache.commons.math.linear.RealMatrixImpl(doubleArray39);
        org.apache.commons.math.linear.RealMatrix realMatrix41 = realMatrixImpl36.add((org.apache.commons.math.linear.RealMatrix) realMatrixImpl40);
        org.apache.commons.math.linear.RealMatrix realMatrix42 = realMatrixImpl31.subtract((org.apache.commons.math.linear.RealMatrix) realMatrixImpl40);
        double[] doubleArray45 = new double[] { 0, 1 };
        org.apache.commons.math.linear.RealMatrixImpl realMatrixImpl46 = new org.apache.commons.math.linear.RealMatrixImpl(doubleArray45);
        double[] doubleArray49 = new double[] { 0, 1 };
        org.apache.commons.math.linear.RealMatrixImpl realMatrixImpl50 = new org.apache.commons.math.linear.RealMatrixImpl(doubleArray49);
        org.apache.commons.math.linear.RealMatrix realMatrix51 = realMatrixImpl46.add((org.apache.commons.math.linear.RealMatrix) realMatrixImpl50);
        double[] doubleArray54 = new double[] { 10.0d, (short) -1 };
        double[] doubleArray55 = realMatrixImpl46.preMultiply(doubleArray54);
        org.apache.commons.math.linear.RealMatrix realMatrix56 = realMatrixImpl40.subtract((org.apache.commons.math.linear.RealMatrix) realMatrixImpl46);
        org.apache.commons.math.linear.RealMatrix realMatrix58 = realMatrixImpl40.scalarMultiply(0.0d);
        double[] doubleArray61 = new double[] { 0, 1 };
        org.apache.commons.math.linear.RealMatrixImpl realMatrixImpl62 = new org.apache.commons.math.linear.RealMatrixImpl(doubleArray61);
        double double63 = realMatrixImpl62.getNorm();
        org.apache.commons.math.linear.RealMatrix realMatrix64 = realMatrixImpl62.transpose();
        double[][] doubleArray65 = realMatrixImpl62.getDataRef();
        org.apache.commons.math.linear.RealMatrixImpl realMatrixImpl66 = new org.apache.commons.math.linear.RealMatrixImpl(doubleArray65);
        boolean boolean67 = realMatrixImpl40.equals((java.lang.Object) realMatrixImpl66);
        double[][] doubleArray68 = realMatrixImpl66.getDataRef();
        boolean boolean69 = realMatrixImpl12.equals((java.lang.Object) realMatrixImpl66);
        org.apache.commons.math.linear.RealMatrix realMatrix70 = realMatrixImpl8.add((org.apache.commons.math.linear.RealMatrix) realMatrixImpl66);
        boolean boolean71 = realMatrixImpl8.isSquare();
        org.junit.Assert.assertNotNull(doubleArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray2), "[0.0, 1.0]");
        org.junit.Assert.assertNotNull(realMatrix5);
        org.junit.Assert.assertNotNull(doubleArray6);
        org.junit.Assert.assertNotNull(doubleArray7);
        org.junit.Assert.assertNotNull(doubleArray11);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray11), "[0.0, 1.0]");
        org.junit.Assert.assertNotNull(doubleArray15);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray15), "[0.0, 1.0]");
        org.junit.Assert.assertNotNull(realMatrix17);
        org.junit.Assert.assertNotNull(doubleArray20);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray20), "[10.0, -1.0]");
        org.junit.Assert.assertNotNull(doubleArray21);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray21), "[-1.0]");
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + true + "'", boolean22 == true);
        org.junit.Assert.assertNotNull(realMatrix23);
        org.junit.Assert.assertNotNull(doubleArray26);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray26), "[0.0, 1.0]");
        org.junit.Assert.assertNotNull(doubleArray30);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray30), "[0.0, 1.0]");
        org.junit.Assert.assertNotNull(realMatrix32);
        org.junit.Assert.assertNotNull(doubleArray35);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray35), "[0.0, 1.0]");
        org.junit.Assert.assertNotNull(doubleArray39);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray39), "[0.0, 1.0]");
        org.junit.Assert.assertNotNull(realMatrix41);
        org.junit.Assert.assertNotNull(realMatrix42);
        org.junit.Assert.assertNotNull(doubleArray45);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray45), "[0.0, 1.0]");
        org.junit.Assert.assertNotNull(doubleArray49);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray49), "[0.0, 1.0]");
        org.junit.Assert.assertNotNull(realMatrix51);
        org.junit.Assert.assertNotNull(doubleArray54);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray54), "[10.0, -1.0]");
        org.junit.Assert.assertNotNull(doubleArray55);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray55), "[-1.0]");
        org.junit.Assert.assertNotNull(realMatrix56);
        org.junit.Assert.assertNotNull(realMatrix58);
        org.junit.Assert.assertNotNull(doubleArray61);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray61), "[0.0, 1.0]");
        org.junit.Assert.assertTrue("'" + double63 + "' != '" + 1.0d + "'", double63 == 1.0d);
        org.junit.Assert.assertNotNull(realMatrix64);
        org.junit.Assert.assertNotNull(doubleArray65);
        org.junit.Assert.assertTrue("'" + boolean67 + "' != '" + true + "'", boolean67 == true);
        org.junit.Assert.assertNotNull(doubleArray68);
        org.junit.Assert.assertTrue("'" + boolean69 + "' != '" + true + "'", boolean69 == true);
        org.junit.Assert.assertNotNull(realMatrix70);
        org.junit.Assert.assertTrue("'" + boolean71 + "' != '" + false + "'", boolean71 == false);
    }

    @Test
    public void test5043() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5043");
        double[] doubleArray2 = new double[] { 0, 1 };
        org.apache.commons.math.linear.RealMatrixImpl realMatrixImpl3 = new org.apache.commons.math.linear.RealMatrixImpl(doubleArray2);
        double double4 = realMatrixImpl3.getNorm();
        org.apache.commons.math.linear.RealMatrix realMatrix5 = realMatrixImpl3.transpose();
        double[][] doubleArray6 = realMatrixImpl3.getDataRef();
        org.apache.commons.math.linear.RealMatrix realMatrix8 = realMatrixImpl3.scalarAdd(0.0d);
        double[] doubleArray11 = new double[] { 0, 1 };
        org.apache.commons.math.linear.RealMatrixImpl realMatrixImpl12 = new org.apache.commons.math.linear.RealMatrixImpl(doubleArray11);
        double[] doubleArray15 = new double[] { 0, 1 };
        org.apache.commons.math.linear.RealMatrixImpl realMatrixImpl16 = new org.apache.commons.math.linear.RealMatrixImpl(doubleArray15);
        org.apache.commons.math.linear.RealMatrix realMatrix17 = realMatrixImpl12.add((org.apache.commons.math.linear.RealMatrix) realMatrixImpl16);
        org.apache.commons.math.linear.RealMatrix realMatrix18 = realMatrixImpl3.add((org.apache.commons.math.linear.RealMatrix) realMatrixImpl12);
        boolean boolean19 = realMatrixImpl3.isSingular();
        org.apache.commons.math.linear.RealMatrix realMatrix20 = realMatrixImpl3.copy();
        boolean boolean21 = realMatrixImpl3.isSquare();
        int int22 = realMatrixImpl3.getRowDimension();
        double[] doubleArray25 = new double[] { 0, 1 };
        org.apache.commons.math.linear.RealMatrixImpl realMatrixImpl26 = new org.apache.commons.math.linear.RealMatrixImpl(doubleArray25);
        double[] doubleArray29 = new double[] { 0, 1 };
        org.apache.commons.math.linear.RealMatrixImpl realMatrixImpl30 = new org.apache.commons.math.linear.RealMatrixImpl(doubleArray29);
        org.apache.commons.math.linear.RealMatrix realMatrix31 = realMatrixImpl26.add((org.apache.commons.math.linear.RealMatrix) realMatrixImpl30);
        double[] doubleArray34 = new double[] { 10.0d, (short) -1 };
        double[] doubleArray35 = realMatrixImpl26.preMultiply(doubleArray34);
        org.apache.commons.math.linear.RealMatrixImpl realMatrixImpl36 = new org.apache.commons.math.linear.RealMatrixImpl(doubleArray35);
        org.apache.commons.math.linear.RealMatrixImpl realMatrixImpl37 = new org.apache.commons.math.linear.RealMatrixImpl(doubleArray35);
        org.apache.commons.math.linear.RealMatrixImpl realMatrixImpl38 = new org.apache.commons.math.linear.RealMatrixImpl(doubleArray35);
        org.apache.commons.math.linear.RealMatrixImpl realMatrixImpl39 = new org.apache.commons.math.linear.RealMatrixImpl(doubleArray35);
        org.apache.commons.math.linear.RealMatrix realMatrix40 = realMatrixImpl39.transpose();
        double double41 = realMatrixImpl39.getTrace();
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math.linear.RealMatrix realMatrix42 = realMatrixImpl3.subtract((org.apache.commons.math.linear.RealMatrix) realMatrixImpl39);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: matrix dimension mismatch");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(doubleArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray2), "[0.0, 1.0]");
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 1.0d + "'", double4 == 1.0d);
        org.junit.Assert.assertNotNull(realMatrix5);
        org.junit.Assert.assertNotNull(doubleArray6);
        org.junit.Assert.assertNotNull(realMatrix8);
        org.junit.Assert.assertNotNull(doubleArray11);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray11), "[0.0, 1.0]");
        org.junit.Assert.assertNotNull(doubleArray15);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray15), "[0.0, 1.0]");
        org.junit.Assert.assertNotNull(realMatrix17);
        org.junit.Assert.assertNotNull(realMatrix18);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + true + "'", boolean19 == true);
        org.junit.Assert.assertNotNull(realMatrix20);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 2 + "'", int22 == 2);
        org.junit.Assert.assertNotNull(doubleArray25);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray25), "[0.0, 1.0]");
        org.junit.Assert.assertNotNull(doubleArray29);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray29), "[0.0, 1.0]");
        org.junit.Assert.assertNotNull(realMatrix31);
        org.junit.Assert.assertNotNull(doubleArray34);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray34), "[10.0, -1.0]");
        org.junit.Assert.assertNotNull(doubleArray35);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray35), "[-1.0]");
        org.junit.Assert.assertNotNull(realMatrix40);
        org.junit.Assert.assertTrue("'" + double41 + "' != '" + (-1.0d) + "'", double41 == (-1.0d));
    }

    @Test
    public void test5044() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5044");
        double[] doubleArray2 = new double[] { 0, 1 };
        org.apache.commons.math.linear.RealMatrixImpl realMatrixImpl3 = new org.apache.commons.math.linear.RealMatrixImpl(doubleArray2);
        double[] doubleArray6 = new double[] { 0, 1 };
        org.apache.commons.math.linear.RealMatrixImpl realMatrixImpl7 = new org.apache.commons.math.linear.RealMatrixImpl(doubleArray6);
        org.apache.commons.math.linear.RealMatrix realMatrix8 = realMatrixImpl3.add((org.apache.commons.math.linear.RealMatrix) realMatrixImpl7);
        double[] doubleArray11 = new double[] { 0, 1 };
        org.apache.commons.math.linear.RealMatrixImpl realMatrixImpl12 = new org.apache.commons.math.linear.RealMatrixImpl(doubleArray11);
        double[] doubleArray15 = new double[] { 0, 1 };
        org.apache.commons.math.linear.RealMatrixImpl realMatrixImpl16 = new org.apache.commons.math.linear.RealMatrixImpl(doubleArray15);
        org.apache.commons.math.linear.RealMatrix realMatrix17 = realMatrixImpl12.add((org.apache.commons.math.linear.RealMatrix) realMatrixImpl16);
        org.apache.commons.math.linear.RealMatrix realMatrix18 = realMatrixImpl7.subtract((org.apache.commons.math.linear.RealMatrix) realMatrixImpl16);
        boolean boolean19 = realMatrixImpl7.isSquare();
        int int20 = realMatrixImpl7.getColumnDimension();
        double[] doubleArray23 = new double[] { 0, 1 };
        org.apache.commons.math.linear.RealMatrixImpl realMatrixImpl24 = new org.apache.commons.math.linear.RealMatrixImpl(doubleArray23);
        double[] doubleArray27 = new double[] { 0, 1 };
        org.apache.commons.math.linear.RealMatrixImpl realMatrixImpl28 = new org.apache.commons.math.linear.RealMatrixImpl(doubleArray27);
        org.apache.commons.math.linear.RealMatrix realMatrix29 = realMatrixImpl24.add((org.apache.commons.math.linear.RealMatrix) realMatrixImpl28);
        double[] doubleArray32 = new double[] { 0, 1 };
        org.apache.commons.math.linear.RealMatrixImpl realMatrixImpl33 = new org.apache.commons.math.linear.RealMatrixImpl(doubleArray32);
        double[] doubleArray36 = new double[] { 0, 1 };
        org.apache.commons.math.linear.RealMatrixImpl realMatrixImpl37 = new org.apache.commons.math.linear.RealMatrixImpl(doubleArray36);
        org.apache.commons.math.linear.RealMatrix realMatrix38 = realMatrixImpl33.add((org.apache.commons.math.linear.RealMatrix) realMatrixImpl37);
        org.apache.commons.math.linear.RealMatrix realMatrix39 = realMatrixImpl28.subtract((org.apache.commons.math.linear.RealMatrix) realMatrixImpl37);
        org.apache.commons.math.linear.RealMatrix realMatrix40 = realMatrixImpl7.subtract((org.apache.commons.math.linear.RealMatrix) realMatrixImpl28);
        org.apache.commons.math.linear.RealMatrix realMatrix42 = realMatrixImpl7.scalarAdd((double) 'a');
        double[] doubleArray45 = new double[] { 0, 1 };
        org.apache.commons.math.linear.RealMatrixImpl realMatrixImpl46 = new org.apache.commons.math.linear.RealMatrixImpl(doubleArray45);
        double[] doubleArray49 = new double[] { 0, 1 };
        org.apache.commons.math.linear.RealMatrixImpl realMatrixImpl50 = new org.apache.commons.math.linear.RealMatrixImpl(doubleArray49);
        org.apache.commons.math.linear.RealMatrix realMatrix51 = realMatrixImpl46.add((org.apache.commons.math.linear.RealMatrix) realMatrixImpl50);
        double[] doubleArray54 = new double[] { 10.0d, (short) -1 };
        double[] doubleArray55 = realMatrixImpl46.preMultiply(doubleArray54);
        org.apache.commons.math.linear.RealMatrixImpl realMatrixImpl56 = new org.apache.commons.math.linear.RealMatrixImpl(doubleArray55);
        boolean boolean57 = realMatrixImpl56.isSquare();
        int int58 = realMatrixImpl56.getColumnDimension();
        org.apache.commons.math.linear.RealMatrix realMatrix59 = realMatrixImpl56.transpose();
        org.apache.commons.math.linear.RealMatrix realMatrix61 = realMatrixImpl56.scalarAdd((double) 0);
        int int62 = realMatrixImpl56.getColumnDimension();
        double[][] doubleArray63 = realMatrixImpl56.getDataRef();
        org.apache.commons.math.linear.RealMatrix realMatrix65 = realMatrixImpl56.scalarAdd((double) 10.0f);
        org.apache.commons.math.linear.RealMatrix realMatrix66 = realMatrixImpl56.transpose();
        boolean boolean67 = realMatrixImpl7.equals((java.lang.Object) realMatrixImpl56);
        org.apache.commons.math.linear.RealMatrix realMatrix69 = realMatrixImpl56.scalarAdd((double) 0L);
        int int70 = realMatrixImpl56.getRowDimension();
        org.junit.Assert.assertNotNull(doubleArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray2), "[0.0, 1.0]");
        org.junit.Assert.assertNotNull(doubleArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray6), "[0.0, 1.0]");
        org.junit.Assert.assertNotNull(realMatrix8);
        org.junit.Assert.assertNotNull(doubleArray11);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray11), "[0.0, 1.0]");
        org.junit.Assert.assertNotNull(doubleArray15);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray15), "[0.0, 1.0]");
        org.junit.Assert.assertNotNull(realMatrix17);
        org.junit.Assert.assertNotNull(realMatrix18);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 1 + "'", int20 == 1);
        org.junit.Assert.assertNotNull(doubleArray23);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray23), "[0.0, 1.0]");
        org.junit.Assert.assertNotNull(doubleArray27);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray27), "[0.0, 1.0]");
        org.junit.Assert.assertNotNull(realMatrix29);
        org.junit.Assert.assertNotNull(doubleArray32);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray32), "[0.0, 1.0]");
        org.junit.Assert.assertNotNull(doubleArray36);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray36), "[0.0, 1.0]");
        org.junit.Assert.assertNotNull(realMatrix38);
        org.junit.Assert.assertNotNull(realMatrix39);
        org.junit.Assert.assertNotNull(realMatrix40);
        org.junit.Assert.assertNotNull(realMatrix42);
        org.junit.Assert.assertNotNull(doubleArray45);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray45), "[0.0, 1.0]");
        org.junit.Assert.assertNotNull(doubleArray49);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray49), "[0.0, 1.0]");
        org.junit.Assert.assertNotNull(realMatrix51);
        org.junit.Assert.assertNotNull(doubleArray54);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray54), "[10.0, -1.0]");
        org.junit.Assert.assertNotNull(doubleArray55);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray55), "[-1.0]");
        org.junit.Assert.assertTrue("'" + boolean57 + "' != '" + true + "'", boolean57 == true);
        org.junit.Assert.assertTrue("'" + int58 + "' != '" + 1 + "'", int58 == 1);
        org.junit.Assert.assertNotNull(realMatrix59);
        org.junit.Assert.assertNotNull(realMatrix61);
        org.junit.Assert.assertTrue("'" + int62 + "' != '" + 1 + "'", int62 == 1);
        org.junit.Assert.assertNotNull(doubleArray63);
        org.junit.Assert.assertNotNull(realMatrix65);
        org.junit.Assert.assertNotNull(realMatrix66);
        org.junit.Assert.assertTrue("'" + boolean67 + "' != '" + false + "'", boolean67 == false);
        org.junit.Assert.assertNotNull(realMatrix69);
        org.junit.Assert.assertTrue("'" + int70 + "' != '" + 1 + "'", int70 == 1);
    }

    @Test
    public void test5045() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5045");
        double[] doubleArray2 = new double[] { 0, 1 };
        org.apache.commons.math.linear.RealMatrixImpl realMatrixImpl3 = new org.apache.commons.math.linear.RealMatrixImpl(doubleArray2);
        double[] doubleArray6 = new double[] { 0, 1 };
        org.apache.commons.math.linear.RealMatrixImpl realMatrixImpl7 = new org.apache.commons.math.linear.RealMatrixImpl(doubleArray6);
        org.apache.commons.math.linear.RealMatrix realMatrix8 = realMatrixImpl3.add((org.apache.commons.math.linear.RealMatrix) realMatrixImpl7);
        double[] doubleArray11 = new double[] { 0, 1 };
        org.apache.commons.math.linear.RealMatrixImpl realMatrixImpl12 = new org.apache.commons.math.linear.RealMatrixImpl(doubleArray11);
        double[] doubleArray15 = new double[] { 0, 1 };
        org.apache.commons.math.linear.RealMatrixImpl realMatrixImpl16 = new org.apache.commons.math.linear.RealMatrixImpl(doubleArray15);
        org.apache.commons.math.linear.RealMatrix realMatrix17 = realMatrixImpl12.add((org.apache.commons.math.linear.RealMatrix) realMatrixImpl16);
        org.apache.commons.math.linear.RealMatrix realMatrix18 = realMatrixImpl7.subtract((org.apache.commons.math.linear.RealMatrix) realMatrixImpl16);
        boolean boolean19 = realMatrixImpl7.isSquare();
        int int20 = realMatrixImpl7.getColumnDimension();
        double[] doubleArray23 = new double[] { 0, 1 };
        org.apache.commons.math.linear.RealMatrixImpl realMatrixImpl24 = new org.apache.commons.math.linear.RealMatrixImpl(doubleArray23);
        double[] doubleArray27 = new double[] { 0, 1 };
        org.apache.commons.math.linear.RealMatrixImpl realMatrixImpl28 = new org.apache.commons.math.linear.RealMatrixImpl(doubleArray27);
        org.apache.commons.math.linear.RealMatrix realMatrix29 = realMatrixImpl24.add((org.apache.commons.math.linear.RealMatrix) realMatrixImpl28);
        double[] doubleArray32 = new double[] { 0, 1 };
        org.apache.commons.math.linear.RealMatrixImpl realMatrixImpl33 = new org.apache.commons.math.linear.RealMatrixImpl(doubleArray32);
        double[] doubleArray36 = new double[] { 0, 1 };
        org.apache.commons.math.linear.RealMatrixImpl realMatrixImpl37 = new org.apache.commons.math.linear.RealMatrixImpl(doubleArray36);
        org.apache.commons.math.linear.RealMatrix realMatrix38 = realMatrixImpl33.add((org.apache.commons.math.linear.RealMatrix) realMatrixImpl37);
        org.apache.commons.math.linear.RealMatrix realMatrix39 = realMatrixImpl28.subtract((org.apache.commons.math.linear.RealMatrix) realMatrixImpl37);
        org.apache.commons.math.linear.RealMatrix realMatrix40 = realMatrixImpl7.subtract((org.apache.commons.math.linear.RealMatrix) realMatrixImpl28);
        org.apache.commons.math.linear.RealMatrix realMatrix42 = realMatrixImpl28.scalarMultiply((double) 10);
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math.linear.RealMatrix realMatrix47 = realMatrixImpl28.getSubMatrix(97, (int) (short) 1, (int) (byte) -1, 100);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math.linear.MatrixIndexException; message: invalid row or column index selection");
        } catch (org.apache.commons.math.linear.MatrixIndexException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(doubleArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray2), "[0.0, 1.0]");
        org.junit.Assert.assertNotNull(doubleArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray6), "[0.0, 1.0]");
        org.junit.Assert.assertNotNull(realMatrix8);
        org.junit.Assert.assertNotNull(doubleArray11);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray11), "[0.0, 1.0]");
        org.junit.Assert.assertNotNull(doubleArray15);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray15), "[0.0, 1.0]");
        org.junit.Assert.assertNotNull(realMatrix17);
        org.junit.Assert.assertNotNull(realMatrix18);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 1 + "'", int20 == 1);
        org.junit.Assert.assertNotNull(doubleArray23);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray23), "[0.0, 1.0]");
        org.junit.Assert.assertNotNull(doubleArray27);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray27), "[0.0, 1.0]");
        org.junit.Assert.assertNotNull(realMatrix29);
        org.junit.Assert.assertNotNull(doubleArray32);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray32), "[0.0, 1.0]");
        org.junit.Assert.assertNotNull(doubleArray36);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray36), "[0.0, 1.0]");
        org.junit.Assert.assertNotNull(realMatrix38);
        org.junit.Assert.assertNotNull(realMatrix39);
        org.junit.Assert.assertNotNull(realMatrix40);
        org.junit.Assert.assertNotNull(realMatrix42);
    }

    @Test
    public void test5046() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5046");
        double[] doubleArray2 = new double[] { 0, 1 };
        org.apache.commons.math.linear.RealMatrixImpl realMatrixImpl3 = new org.apache.commons.math.linear.RealMatrixImpl(doubleArray2);
        double[] doubleArray6 = new double[] { 0, 1 };
        org.apache.commons.math.linear.RealMatrixImpl realMatrixImpl7 = new org.apache.commons.math.linear.RealMatrixImpl(doubleArray6);
        org.apache.commons.math.linear.RealMatrix realMatrix8 = realMatrixImpl3.add((org.apache.commons.math.linear.RealMatrix) realMatrixImpl7);
        boolean boolean9 = realMatrixImpl3.isSquare();
        int int10 = realMatrixImpl3.getColumnDimension();
        org.apache.commons.math.linear.RealMatrix realMatrix11 = realMatrixImpl3.copy();
        boolean boolean12 = realMatrixImpl3.isSingular();
        org.apache.commons.math.linear.RealMatrix realMatrix13 = realMatrixImpl3.copy();
        double[] doubleArray16 = new double[] { 0, 1 };
        org.apache.commons.math.linear.RealMatrixImpl realMatrixImpl17 = new org.apache.commons.math.linear.RealMatrixImpl(doubleArray16);
        double double18 = realMatrixImpl17.getNorm();
        org.apache.commons.math.linear.RealMatrix realMatrix20 = realMatrixImpl17.getRowMatrix((int) (byte) 0);
        double[] doubleArray23 = new double[] { 0, 1 };
        org.apache.commons.math.linear.RealMatrixImpl realMatrixImpl24 = new org.apache.commons.math.linear.RealMatrixImpl(doubleArray23);
        double[] doubleArray27 = new double[] { 0, 1 };
        org.apache.commons.math.linear.RealMatrixImpl realMatrixImpl28 = new org.apache.commons.math.linear.RealMatrixImpl(doubleArray27);
        org.apache.commons.math.linear.RealMatrix realMatrix29 = realMatrixImpl24.add((org.apache.commons.math.linear.RealMatrix) realMatrixImpl28);
        boolean boolean30 = realMatrixImpl28.isSquare();
        org.apache.commons.math.linear.RealMatrix realMatrix31 = realMatrixImpl17.add((org.apache.commons.math.linear.RealMatrix) realMatrixImpl28);
        boolean boolean32 = realMatrixImpl3.equals((java.lang.Object) realMatrixImpl17);
        org.apache.commons.math.linear.RealMatrix realMatrix34 = realMatrixImpl3.scalarAdd((double) (-1.0f));
        double double35 = realMatrixImpl3.getNorm();
        org.junit.Assert.assertNotNull(doubleArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray2), "[0.0, 1.0]");
        org.junit.Assert.assertNotNull(doubleArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray6), "[0.0, 1.0]");
        org.junit.Assert.assertNotNull(realMatrix8);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 1 + "'", int10 == 1);
        org.junit.Assert.assertNotNull(realMatrix11);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertNotNull(realMatrix13);
        org.junit.Assert.assertNotNull(doubleArray16);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray16), "[0.0, 1.0]");
        org.junit.Assert.assertTrue("'" + double18 + "' != '" + 1.0d + "'", double18 == 1.0d);
        org.junit.Assert.assertNotNull(realMatrix20);
        org.junit.Assert.assertNotNull(doubleArray23);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray23), "[0.0, 1.0]");
        org.junit.Assert.assertNotNull(doubleArray27);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray27), "[0.0, 1.0]");
        org.junit.Assert.assertNotNull(realMatrix29);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + false + "'", boolean30 == false);
        org.junit.Assert.assertNotNull(realMatrix31);
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + true + "'", boolean32 == true);
        org.junit.Assert.assertNotNull(realMatrix34);
        org.junit.Assert.assertTrue("'" + double35 + "' != '" + 1.0d + "'", double35 == 1.0d);
    }

    @Test
    public void test5047() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5047");
        double[] doubleArray2 = new double[] { 0, 1 };
        org.apache.commons.math.linear.RealMatrixImpl realMatrixImpl3 = new org.apache.commons.math.linear.RealMatrixImpl(doubleArray2);
        org.apache.commons.math.linear.RealMatrix realMatrix5 = realMatrixImpl3.scalarMultiply((double) (short) 100);
        double[] doubleArray7 = realMatrixImpl3.getRow(0);
        org.apache.commons.math.linear.RealMatrixImpl realMatrixImpl8 = new org.apache.commons.math.linear.RealMatrixImpl(doubleArray7);
        boolean boolean9 = realMatrixImpl8.isSingular();
        double[] doubleArray12 = new double[] { 0, 1 };
        org.apache.commons.math.linear.RealMatrixImpl realMatrixImpl13 = new org.apache.commons.math.linear.RealMatrixImpl(doubleArray12);
        double[] doubleArray16 = new double[] { 0, 1 };
        org.apache.commons.math.linear.RealMatrixImpl realMatrixImpl17 = new org.apache.commons.math.linear.RealMatrixImpl(doubleArray16);
        org.apache.commons.math.linear.RealMatrix realMatrix18 = realMatrixImpl13.add((org.apache.commons.math.linear.RealMatrix) realMatrixImpl17);
        double[] doubleArray21 = new double[] { 0, 1 };
        org.apache.commons.math.linear.RealMatrixImpl realMatrixImpl22 = new org.apache.commons.math.linear.RealMatrixImpl(doubleArray21);
        double[] doubleArray25 = new double[] { 0, 1 };
        org.apache.commons.math.linear.RealMatrixImpl realMatrixImpl26 = new org.apache.commons.math.linear.RealMatrixImpl(doubleArray25);
        org.apache.commons.math.linear.RealMatrix realMatrix27 = realMatrixImpl22.add((org.apache.commons.math.linear.RealMatrix) realMatrixImpl26);
        org.apache.commons.math.linear.RealMatrix realMatrix28 = realMatrixImpl17.subtract((org.apache.commons.math.linear.RealMatrix) realMatrixImpl26);
        double[] doubleArray31 = new double[] { 0, 1 };
        org.apache.commons.math.linear.RealMatrixImpl realMatrixImpl32 = new org.apache.commons.math.linear.RealMatrixImpl(doubleArray31);
        double[] doubleArray35 = new double[] { 0, 1 };
        org.apache.commons.math.linear.RealMatrixImpl realMatrixImpl36 = new org.apache.commons.math.linear.RealMatrixImpl(doubleArray35);
        org.apache.commons.math.linear.RealMatrix realMatrix37 = realMatrixImpl32.add((org.apache.commons.math.linear.RealMatrix) realMatrixImpl36);
        double[] doubleArray40 = new double[] { 10.0d, (short) -1 };
        double[] doubleArray41 = realMatrixImpl32.preMultiply(doubleArray40);
        org.apache.commons.math.linear.RealMatrix realMatrix42 = realMatrixImpl26.subtract((org.apache.commons.math.linear.RealMatrix) realMatrixImpl32);
        double[] doubleArray45 = new double[] { 0, 1 };
        org.apache.commons.math.linear.RealMatrixImpl realMatrixImpl46 = new org.apache.commons.math.linear.RealMatrixImpl(doubleArray45);
        double double47 = realMatrixImpl46.getNorm();
        org.apache.commons.math.linear.RealMatrix realMatrix48 = realMatrixImpl46.transpose();
        org.apache.commons.math.linear.RealMatrix realMatrix49 = realMatrixImpl26.add((org.apache.commons.math.linear.RealMatrix) realMatrixImpl46);
        org.apache.commons.math.linear.RealMatrix realMatrix50 = realMatrixImpl26.transpose();
        org.apache.commons.math.linear.RealMatrix realMatrix51 = realMatrixImpl26.copy();
        org.apache.commons.math.linear.RealMatrix realMatrix52 = realMatrixImpl8.preMultiply(realMatrix51);
        double double53 = realMatrixImpl8.getNorm();
        // The following exception was thrown during execution in test generation
        try {
            double[] doubleArray55 = realMatrixImpl8.getRow((int) (short) 10);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math.linear.MatrixIndexException; message: illegal row argument");
        } catch (org.apache.commons.math.linear.MatrixIndexException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(doubleArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray2), "[0.0, 1.0]");
        org.junit.Assert.assertNotNull(realMatrix5);
        org.junit.Assert.assertNotNull(doubleArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray7), "[0.0]");
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertNotNull(doubleArray12);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray12), "[0.0, 1.0]");
        org.junit.Assert.assertNotNull(doubleArray16);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray16), "[0.0, 1.0]");
        org.junit.Assert.assertNotNull(realMatrix18);
        org.junit.Assert.assertNotNull(doubleArray21);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray21), "[0.0, 1.0]");
        org.junit.Assert.assertNotNull(doubleArray25);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray25), "[0.0, 1.0]");
        org.junit.Assert.assertNotNull(realMatrix27);
        org.junit.Assert.assertNotNull(realMatrix28);
        org.junit.Assert.assertNotNull(doubleArray31);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray31), "[0.0, 1.0]");
        org.junit.Assert.assertNotNull(doubleArray35);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray35), "[0.0, 1.0]");
        org.junit.Assert.assertNotNull(realMatrix37);
        org.junit.Assert.assertNotNull(doubleArray40);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray40), "[10.0, -1.0]");
        org.junit.Assert.assertNotNull(doubleArray41);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray41), "[-1.0]");
        org.junit.Assert.assertNotNull(realMatrix42);
        org.junit.Assert.assertNotNull(doubleArray45);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray45), "[0.0, 1.0]");
        org.junit.Assert.assertTrue("'" + double47 + "' != '" + 1.0d + "'", double47 == 1.0d);
        org.junit.Assert.assertNotNull(realMatrix48);
        org.junit.Assert.assertNotNull(realMatrix49);
        org.junit.Assert.assertNotNull(realMatrix50);
        org.junit.Assert.assertNotNull(realMatrix51);
        org.junit.Assert.assertNotNull(realMatrix52);
        org.junit.Assert.assertTrue("'" + double53 + "' != '" + 0.0d + "'", double53 == 0.0d);
    }

    @Test
    public void test5048() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5048");
        double[] doubleArray2 = new double[] { 0, 1 };
        org.apache.commons.math.linear.RealMatrixImpl realMatrixImpl3 = new org.apache.commons.math.linear.RealMatrixImpl(doubleArray2);
        double[] doubleArray6 = new double[] { 0, 1 };
        org.apache.commons.math.linear.RealMatrixImpl realMatrixImpl7 = new org.apache.commons.math.linear.RealMatrixImpl(doubleArray6);
        org.apache.commons.math.linear.RealMatrix realMatrix8 = realMatrixImpl3.add((org.apache.commons.math.linear.RealMatrix) realMatrixImpl7);
        double[] doubleArray11 = new double[] { 0, 1 };
        org.apache.commons.math.linear.RealMatrixImpl realMatrixImpl12 = new org.apache.commons.math.linear.RealMatrixImpl(doubleArray11);
        double[] doubleArray15 = new double[] { 0, 1 };
        org.apache.commons.math.linear.RealMatrixImpl realMatrixImpl16 = new org.apache.commons.math.linear.RealMatrixImpl(doubleArray15);
        org.apache.commons.math.linear.RealMatrix realMatrix17 = realMatrixImpl12.add((org.apache.commons.math.linear.RealMatrix) realMatrixImpl16);
        org.apache.commons.math.linear.RealMatrix realMatrix18 = realMatrixImpl7.subtract((org.apache.commons.math.linear.RealMatrix) realMatrixImpl16);
        boolean boolean19 = realMatrixImpl7.isSquare();
        int int20 = realMatrixImpl7.getColumnDimension();
        double double21 = realMatrixImpl7.getNorm();
        org.apache.commons.math.linear.RealMatrix realMatrix23 = realMatrixImpl7.scalarAdd(0.0d);
        double[] doubleArray26 = new double[] { 0, 1 };
        org.apache.commons.math.linear.RealMatrixImpl realMatrixImpl27 = new org.apache.commons.math.linear.RealMatrixImpl(doubleArray26);
        double[] doubleArray30 = new double[] { 0, 1 };
        org.apache.commons.math.linear.RealMatrixImpl realMatrixImpl31 = new org.apache.commons.math.linear.RealMatrixImpl(doubleArray30);
        org.apache.commons.math.linear.RealMatrix realMatrix32 = realMatrixImpl27.add((org.apache.commons.math.linear.RealMatrix) realMatrixImpl31);
        double[] doubleArray35 = new double[] { 0, 1 };
        org.apache.commons.math.linear.RealMatrixImpl realMatrixImpl36 = new org.apache.commons.math.linear.RealMatrixImpl(doubleArray35);
        double[] doubleArray39 = new double[] { 0, 1 };
        org.apache.commons.math.linear.RealMatrixImpl realMatrixImpl40 = new org.apache.commons.math.linear.RealMatrixImpl(doubleArray39);
        org.apache.commons.math.linear.RealMatrix realMatrix41 = realMatrixImpl36.add((org.apache.commons.math.linear.RealMatrix) realMatrixImpl40);
        org.apache.commons.math.linear.RealMatrix realMatrix42 = realMatrixImpl31.subtract((org.apache.commons.math.linear.RealMatrix) realMatrixImpl40);
        double double43 = realMatrixImpl31.getNorm();
        org.apache.commons.math.linear.RealMatrix realMatrix44 = realMatrixImpl31.transpose();
        org.apache.commons.math.linear.RealMatrix realMatrix46 = realMatrixImpl31.scalarMultiply((double) (short) 10);
        double[] doubleArray49 = new double[] { 0, 1 };
        org.apache.commons.math.linear.RealMatrixImpl realMatrixImpl50 = new org.apache.commons.math.linear.RealMatrixImpl(doubleArray49);
        double[] doubleArray53 = new double[] { 0, 1 };
        org.apache.commons.math.linear.RealMatrixImpl realMatrixImpl54 = new org.apache.commons.math.linear.RealMatrixImpl(doubleArray53);
        org.apache.commons.math.linear.RealMatrix realMatrix55 = realMatrixImpl50.add((org.apache.commons.math.linear.RealMatrix) realMatrixImpl54);
        double[] doubleArray58 = new double[] { 0, 1 };
        org.apache.commons.math.linear.RealMatrixImpl realMatrixImpl59 = new org.apache.commons.math.linear.RealMatrixImpl(doubleArray58);
        double[] doubleArray62 = new double[] { 0, 1 };
        org.apache.commons.math.linear.RealMatrixImpl realMatrixImpl63 = new org.apache.commons.math.linear.RealMatrixImpl(doubleArray62);
        org.apache.commons.math.linear.RealMatrix realMatrix64 = realMatrixImpl59.add((org.apache.commons.math.linear.RealMatrix) realMatrixImpl63);
        org.apache.commons.math.linear.RealMatrix realMatrix65 = realMatrixImpl54.subtract((org.apache.commons.math.linear.RealMatrix) realMatrixImpl63);
        double[] doubleArray68 = new double[] { 0, 1 };
        org.apache.commons.math.linear.RealMatrixImpl realMatrixImpl69 = new org.apache.commons.math.linear.RealMatrixImpl(doubleArray68);
        double[] doubleArray72 = new double[] { 0, 1 };
        org.apache.commons.math.linear.RealMatrixImpl realMatrixImpl73 = new org.apache.commons.math.linear.RealMatrixImpl(doubleArray72);
        org.apache.commons.math.linear.RealMatrix realMatrix74 = realMatrixImpl69.add((org.apache.commons.math.linear.RealMatrix) realMatrixImpl73);
        double[] doubleArray77 = new double[] { 10.0d, (short) -1 };
        double[] doubleArray78 = realMatrixImpl69.preMultiply(doubleArray77);
        org.apache.commons.math.linear.RealMatrix realMatrix79 = realMatrixImpl63.subtract((org.apache.commons.math.linear.RealMatrix) realMatrixImpl69);
        double[][] doubleArray80 = realMatrixImpl69.getData();
        boolean boolean81 = realMatrixImpl69.isSquare();
        boolean boolean82 = realMatrixImpl31.equals((java.lang.Object) boolean81);
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math.linear.RealMatrix realMatrix83 = realMatrixImpl7.solve((org.apache.commons.math.linear.RealMatrix) realMatrixImpl31);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math.linear.InvalidMatrixException; message: coefficient matrix is not square");
        } catch (org.apache.commons.math.linear.InvalidMatrixException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(doubleArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray2), "[0.0, 1.0]");
        org.junit.Assert.assertNotNull(doubleArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray6), "[0.0, 1.0]");
        org.junit.Assert.assertNotNull(realMatrix8);
        org.junit.Assert.assertNotNull(doubleArray11);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray11), "[0.0, 1.0]");
        org.junit.Assert.assertNotNull(doubleArray15);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray15), "[0.0, 1.0]");
        org.junit.Assert.assertNotNull(realMatrix17);
        org.junit.Assert.assertNotNull(realMatrix18);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 1 + "'", int20 == 1);
        org.junit.Assert.assertTrue("'" + double21 + "' != '" + 1.0d + "'", double21 == 1.0d);
        org.junit.Assert.assertNotNull(realMatrix23);
        org.junit.Assert.assertNotNull(doubleArray26);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray26), "[0.0, 1.0]");
        org.junit.Assert.assertNotNull(doubleArray30);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray30), "[0.0, 1.0]");
        org.junit.Assert.assertNotNull(realMatrix32);
        org.junit.Assert.assertNotNull(doubleArray35);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray35), "[0.0, 1.0]");
        org.junit.Assert.assertNotNull(doubleArray39);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray39), "[0.0, 1.0]");
        org.junit.Assert.assertNotNull(realMatrix41);
        org.junit.Assert.assertNotNull(realMatrix42);
        org.junit.Assert.assertTrue("'" + double43 + "' != '" + 1.0d + "'", double43 == 1.0d);
        org.junit.Assert.assertNotNull(realMatrix44);
        org.junit.Assert.assertNotNull(realMatrix46);
        org.junit.Assert.assertNotNull(doubleArray49);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray49), "[0.0, 1.0]");
        org.junit.Assert.assertNotNull(doubleArray53);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray53), "[0.0, 1.0]");
        org.junit.Assert.assertNotNull(realMatrix55);
        org.junit.Assert.assertNotNull(doubleArray58);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray58), "[0.0, 1.0]");
        org.junit.Assert.assertNotNull(doubleArray62);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray62), "[0.0, 1.0]");
        org.junit.Assert.assertNotNull(realMatrix64);
        org.junit.Assert.assertNotNull(realMatrix65);
        org.junit.Assert.assertNotNull(doubleArray68);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray68), "[0.0, 1.0]");
        org.junit.Assert.assertNotNull(doubleArray72);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray72), "[0.0, 1.0]");
        org.junit.Assert.assertNotNull(realMatrix74);
        org.junit.Assert.assertNotNull(doubleArray77);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray77), "[10.0, -1.0]");
        org.junit.Assert.assertNotNull(doubleArray78);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray78), "[-1.0]");
        org.junit.Assert.assertNotNull(realMatrix79);
        org.junit.Assert.assertNotNull(doubleArray80);
        org.junit.Assert.assertTrue("'" + boolean81 + "' != '" + false + "'", boolean81 == false);
        org.junit.Assert.assertTrue("'" + boolean82 + "' != '" + false + "'", boolean82 == false);
    }

    @Test
    public void test5049() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5049");
        double[] doubleArray2 = new double[] { 0, 1 };
        org.apache.commons.math.linear.RealMatrixImpl realMatrixImpl3 = new org.apache.commons.math.linear.RealMatrixImpl(doubleArray2);
        double[] doubleArray6 = new double[] { 0, 1 };
        org.apache.commons.math.linear.RealMatrixImpl realMatrixImpl7 = new org.apache.commons.math.linear.RealMatrixImpl(doubleArray6);
        org.apache.commons.math.linear.RealMatrix realMatrix8 = realMatrixImpl3.add((org.apache.commons.math.linear.RealMatrix) realMatrixImpl7);
        java.lang.String str9 = realMatrixImpl3.toString();
        double[] doubleArray12 = new double[] { 0, 1 };
        org.apache.commons.math.linear.RealMatrixImpl realMatrixImpl13 = new org.apache.commons.math.linear.RealMatrixImpl(doubleArray12);
        double[] doubleArray16 = new double[] { 0, 1 };
        org.apache.commons.math.linear.RealMatrixImpl realMatrixImpl17 = new org.apache.commons.math.linear.RealMatrixImpl(doubleArray16);
        org.apache.commons.math.linear.RealMatrix realMatrix18 = realMatrixImpl13.add((org.apache.commons.math.linear.RealMatrix) realMatrixImpl17);
        org.apache.commons.math.linear.RealMatrix realMatrix20 = realMatrixImpl13.scalarMultiply((double) (short) -1);
        double[][] doubleArray21 = realMatrixImpl13.getData();
        org.apache.commons.math.linear.RealMatrixImpl realMatrixImpl22 = new org.apache.commons.math.linear.RealMatrixImpl(doubleArray21);
        org.apache.commons.math.linear.RealMatrixImpl realMatrixImpl23 = new org.apache.commons.math.linear.RealMatrixImpl(doubleArray21);
        org.apache.commons.math.linear.RealMatrix realMatrix24 = realMatrixImpl3.subtract((org.apache.commons.math.linear.RealMatrix) realMatrixImpl23);
        double[] doubleArray27 = new double[] { 0, 1 };
        org.apache.commons.math.linear.RealMatrixImpl realMatrixImpl28 = new org.apache.commons.math.linear.RealMatrixImpl(doubleArray27);
        org.apache.commons.math.linear.RealMatrix realMatrix30 = realMatrixImpl28.scalarMultiply((double) (short) 100);
        double[][] doubleArray31 = realMatrixImpl28.getDataRef();
        double[][] doubleArray32 = realMatrixImpl28.getDataRef();
        org.apache.commons.math.linear.RealMatrix realMatrix33 = realMatrixImpl28.transpose();
        double[] doubleArray35 = realMatrixImpl28.getRow(1);
        double double36 = realMatrixImpl28.getNorm();
        org.apache.commons.math.linear.RealMatrix realMatrix38 = realMatrixImpl28.getRowMatrix(0);
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math.linear.RealMatrix realMatrix39 = realMatrixImpl3.preMultiply((org.apache.commons.math.linear.RealMatrix) realMatrixImpl28);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Matrices are not multiplication compatible.");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(doubleArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray2), "[0.0, 1.0]");
        org.junit.Assert.assertNotNull(doubleArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray6), "[0.0, 1.0]");
        org.junit.Assert.assertNotNull(realMatrix8);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "RealMatrixImpl{{0.0},{1.0}}" + "'", str9, "RealMatrixImpl{{0.0},{1.0}}");
        org.junit.Assert.assertNotNull(doubleArray12);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray12), "[0.0, 1.0]");
        org.junit.Assert.assertNotNull(doubleArray16);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray16), "[0.0, 1.0]");
        org.junit.Assert.assertNotNull(realMatrix18);
        org.junit.Assert.assertNotNull(realMatrix20);
        org.junit.Assert.assertNotNull(doubleArray21);
        org.junit.Assert.assertNotNull(realMatrix24);
        org.junit.Assert.assertNotNull(doubleArray27);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray27), "[0.0, 1.0]");
        org.junit.Assert.assertNotNull(realMatrix30);
        org.junit.Assert.assertNotNull(doubleArray31);
        org.junit.Assert.assertNotNull(doubleArray32);
        org.junit.Assert.assertNotNull(realMatrix33);
        org.junit.Assert.assertNotNull(doubleArray35);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray35), "[1.0]");
        org.junit.Assert.assertTrue("'" + double36 + "' != '" + 1.0d + "'", double36 == 1.0d);
        org.junit.Assert.assertNotNull(realMatrix38);
    }

    @Test
    public void test5050() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5050");
        org.apache.commons.math.linear.RealMatrixImpl realMatrixImpl2 = new org.apache.commons.math.linear.RealMatrixImpl((int) (short) 1, 10);
        boolean boolean3 = realMatrixImpl2.isSingular();
        double[] doubleArray6 = new double[] { 0, 1 };
        org.apache.commons.math.linear.RealMatrixImpl realMatrixImpl7 = new org.apache.commons.math.linear.RealMatrixImpl(doubleArray6);
        org.apache.commons.math.linear.RealMatrix realMatrix9 = realMatrixImpl7.scalarMultiply((double) (short) 100);
        double[][] doubleArray10 = realMatrixImpl7.getDataRef();
        int int11 = realMatrixImpl7.getRowDimension();
        int int12 = realMatrixImpl7.getColumnDimension();
        double[] doubleArray15 = new double[] { 0, 1 };
        org.apache.commons.math.linear.RealMatrixImpl realMatrixImpl16 = new org.apache.commons.math.linear.RealMatrixImpl(doubleArray15);
        double[] doubleArray19 = new double[] { 0, 1 };
        org.apache.commons.math.linear.RealMatrixImpl realMatrixImpl20 = new org.apache.commons.math.linear.RealMatrixImpl(doubleArray19);
        org.apache.commons.math.linear.RealMatrix realMatrix21 = realMatrixImpl16.add((org.apache.commons.math.linear.RealMatrix) realMatrixImpl20);
        double[] doubleArray24 = new double[] { 0, 1 };
        org.apache.commons.math.linear.RealMatrixImpl realMatrixImpl25 = new org.apache.commons.math.linear.RealMatrixImpl(doubleArray24);
        double[] doubleArray28 = new double[] { 0, 1 };
        org.apache.commons.math.linear.RealMatrixImpl realMatrixImpl29 = new org.apache.commons.math.linear.RealMatrixImpl(doubleArray28);
        org.apache.commons.math.linear.RealMatrix realMatrix30 = realMatrixImpl25.add((org.apache.commons.math.linear.RealMatrix) realMatrixImpl29);
        org.apache.commons.math.linear.RealMatrix realMatrix31 = realMatrixImpl20.subtract((org.apache.commons.math.linear.RealMatrix) realMatrixImpl29);
        double[] doubleArray34 = new double[] { 0, 1 };
        org.apache.commons.math.linear.RealMatrixImpl realMatrixImpl35 = new org.apache.commons.math.linear.RealMatrixImpl(doubleArray34);
        double[] doubleArray38 = new double[] { 0, 1 };
        org.apache.commons.math.linear.RealMatrixImpl realMatrixImpl39 = new org.apache.commons.math.linear.RealMatrixImpl(doubleArray38);
        org.apache.commons.math.linear.RealMatrix realMatrix40 = realMatrixImpl35.add((org.apache.commons.math.linear.RealMatrix) realMatrixImpl39);
        double[] doubleArray43 = new double[] { 10.0d, (short) -1 };
        double[] doubleArray44 = realMatrixImpl35.preMultiply(doubleArray43);
        org.apache.commons.math.linear.RealMatrix realMatrix45 = realMatrixImpl29.subtract((org.apache.commons.math.linear.RealMatrix) realMatrixImpl35);
        double[][] doubleArray46 = realMatrixImpl35.getData();
        double[] doubleArray49 = new double[] { 0, 1 };
        org.apache.commons.math.linear.RealMatrixImpl realMatrixImpl50 = new org.apache.commons.math.linear.RealMatrixImpl(doubleArray49);
        double[] doubleArray53 = new double[] { 0, 1 };
        org.apache.commons.math.linear.RealMatrixImpl realMatrixImpl54 = new org.apache.commons.math.linear.RealMatrixImpl(doubleArray53);
        org.apache.commons.math.linear.RealMatrix realMatrix55 = realMatrixImpl50.add((org.apache.commons.math.linear.RealMatrix) realMatrixImpl54);
        double[] doubleArray58 = new double[] { 0, 1 };
        org.apache.commons.math.linear.RealMatrixImpl realMatrixImpl59 = new org.apache.commons.math.linear.RealMatrixImpl(doubleArray58);
        double[] doubleArray62 = new double[] { 0, 1 };
        org.apache.commons.math.linear.RealMatrixImpl realMatrixImpl63 = new org.apache.commons.math.linear.RealMatrixImpl(doubleArray62);
        org.apache.commons.math.linear.RealMatrix realMatrix64 = realMatrixImpl59.add((org.apache.commons.math.linear.RealMatrix) realMatrixImpl63);
        org.apache.commons.math.linear.RealMatrix realMatrix65 = realMatrixImpl54.subtract((org.apache.commons.math.linear.RealMatrix) realMatrixImpl63);
        double[] doubleArray68 = new double[] { 0, 1 };
        org.apache.commons.math.linear.RealMatrixImpl realMatrixImpl69 = new org.apache.commons.math.linear.RealMatrixImpl(doubleArray68);
        double[] doubleArray72 = new double[] { 0, 1 };
        org.apache.commons.math.linear.RealMatrixImpl realMatrixImpl73 = new org.apache.commons.math.linear.RealMatrixImpl(doubleArray72);
        org.apache.commons.math.linear.RealMatrix realMatrix74 = realMatrixImpl69.add((org.apache.commons.math.linear.RealMatrix) realMatrixImpl73);
        double[] doubleArray77 = new double[] { 10.0d, (short) -1 };
        double[] doubleArray78 = realMatrixImpl69.preMultiply(doubleArray77);
        org.apache.commons.math.linear.RealMatrixImpl realMatrixImpl79 = new org.apache.commons.math.linear.RealMatrixImpl(doubleArray77);
        double[] doubleArray80 = realMatrixImpl54.preMultiply(doubleArray77);
        org.apache.commons.math.linear.RealMatrixImpl realMatrixImpl81 = new org.apache.commons.math.linear.RealMatrixImpl(doubleArray80);
        boolean boolean82 = realMatrixImpl81.isSquare();
        boolean boolean83 = realMatrixImpl35.equals((java.lang.Object) realMatrixImpl81);
        org.apache.commons.math.linear.RealMatrix realMatrix84 = realMatrixImpl7.add((org.apache.commons.math.linear.RealMatrix) realMatrixImpl35);
        double double85 = realMatrixImpl35.getNorm();
        org.apache.commons.math.linear.RealMatrix realMatrix86 = realMatrixImpl2.preMultiply((org.apache.commons.math.linear.RealMatrix) realMatrixImpl35);
        org.apache.commons.math.linear.RealMatrix realMatrix87 = realMatrixImpl35.copy();
        boolean boolean88 = realMatrixImpl35.isSquare();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertNotNull(doubleArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray6), "[0.0, 1.0]");
        org.junit.Assert.assertNotNull(realMatrix9);
        org.junit.Assert.assertNotNull(doubleArray10);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 2 + "'", int11 == 2);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 1 + "'", int12 == 1);
        org.junit.Assert.assertNotNull(doubleArray15);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray15), "[0.0, 1.0]");
        org.junit.Assert.assertNotNull(doubleArray19);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray19), "[0.0, 1.0]");
        org.junit.Assert.assertNotNull(realMatrix21);
        org.junit.Assert.assertNotNull(doubleArray24);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray24), "[0.0, 1.0]");
        org.junit.Assert.assertNotNull(doubleArray28);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray28), "[0.0, 1.0]");
        org.junit.Assert.assertNotNull(realMatrix30);
        org.junit.Assert.assertNotNull(realMatrix31);
        org.junit.Assert.assertNotNull(doubleArray34);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray34), "[0.0, 1.0]");
        org.junit.Assert.assertNotNull(doubleArray38);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray38), "[0.0, 1.0]");
        org.junit.Assert.assertNotNull(realMatrix40);
        org.junit.Assert.assertNotNull(doubleArray43);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray43), "[10.0, -1.0]");
        org.junit.Assert.assertNotNull(doubleArray44);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray44), "[-1.0]");
        org.junit.Assert.assertNotNull(realMatrix45);
        org.junit.Assert.assertNotNull(doubleArray46);
        org.junit.Assert.assertNotNull(doubleArray49);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray49), "[0.0, 1.0]");
        org.junit.Assert.assertNotNull(doubleArray53);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray53), "[0.0, 1.0]");
        org.junit.Assert.assertNotNull(realMatrix55);
        org.junit.Assert.assertNotNull(doubleArray58);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray58), "[0.0, 1.0]");
        org.junit.Assert.assertNotNull(doubleArray62);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray62), "[0.0, 1.0]");
        org.junit.Assert.assertNotNull(realMatrix64);
        org.junit.Assert.assertNotNull(realMatrix65);
        org.junit.Assert.assertNotNull(doubleArray68);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray68), "[0.0, 1.0]");
        org.junit.Assert.assertNotNull(doubleArray72);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray72), "[0.0, 1.0]");
        org.junit.Assert.assertNotNull(realMatrix74);
        org.junit.Assert.assertNotNull(doubleArray77);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray77), "[10.0, -1.0]");
        org.junit.Assert.assertNotNull(doubleArray78);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray78), "[-1.0]");
        org.junit.Assert.assertNotNull(doubleArray80);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray80), "[-1.0]");
        org.junit.Assert.assertTrue("'" + boolean82 + "' != '" + true + "'", boolean82 == true);
        org.junit.Assert.assertTrue("'" + boolean83 + "' != '" + false + "'", boolean83 == false);
        org.junit.Assert.assertNotNull(realMatrix84);
        org.junit.Assert.assertTrue("'" + double85 + "' != '" + 1.0d + "'", double85 == 1.0d);
        org.junit.Assert.assertNotNull(realMatrix86);
        org.junit.Assert.assertNotNull(realMatrix87);
        org.junit.Assert.assertTrue("'" + boolean88 + "' != '" + false + "'", boolean88 == false);
    }

    @Test
    public void test5051() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5051");
        double[] doubleArray2 = new double[] { 0, 1 };
        org.apache.commons.math.linear.RealMatrixImpl realMatrixImpl3 = new org.apache.commons.math.linear.RealMatrixImpl(doubleArray2);
        double[] doubleArray6 = new double[] { 0, 1 };
        org.apache.commons.math.linear.RealMatrixImpl realMatrixImpl7 = new org.apache.commons.math.linear.RealMatrixImpl(doubleArray6);
        org.apache.commons.math.linear.RealMatrix realMatrix8 = realMatrixImpl3.add((org.apache.commons.math.linear.RealMatrix) realMatrixImpl7);
        boolean boolean9 = realMatrixImpl3.isSquare();
        int int10 = realMatrixImpl3.getColumnDimension();
        double[][] doubleArray11 = realMatrixImpl3.getDataRef();
        org.apache.commons.math.linear.RealMatrix realMatrix12 = realMatrixImpl3.transpose();
        org.junit.Assert.assertNotNull(doubleArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray2), "[0.0, 1.0]");
        org.junit.Assert.assertNotNull(doubleArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray6), "[0.0, 1.0]");
        org.junit.Assert.assertNotNull(realMatrix8);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 1 + "'", int10 == 1);
        org.junit.Assert.assertNotNull(doubleArray11);
        org.junit.Assert.assertNotNull(realMatrix12);
    }

    @Test
    public void test5052() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5052");
        double[] doubleArray2 = new double[] { 0, 1 };
        org.apache.commons.math.linear.RealMatrixImpl realMatrixImpl3 = new org.apache.commons.math.linear.RealMatrixImpl(doubleArray2);
        double[] doubleArray6 = new double[] { 0, 1 };
        org.apache.commons.math.linear.RealMatrixImpl realMatrixImpl7 = new org.apache.commons.math.linear.RealMatrixImpl(doubleArray6);
        org.apache.commons.math.linear.RealMatrix realMatrix8 = realMatrixImpl3.add((org.apache.commons.math.linear.RealMatrix) realMatrixImpl7);
        double[] doubleArray11 = new double[] { 10.0d, (short) -1 };
        double[] doubleArray12 = realMatrixImpl3.preMultiply(doubleArray11);
        org.apache.commons.math.linear.RealMatrix realMatrix14 = realMatrixImpl3.scalarMultiply((double) 100L);
        org.junit.Assert.assertNotNull(doubleArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray2), "[0.0, 1.0]");
        org.junit.Assert.assertNotNull(doubleArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray6), "[0.0, 1.0]");
        org.junit.Assert.assertNotNull(realMatrix8);
        org.junit.Assert.assertNotNull(doubleArray11);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray11), "[10.0, -1.0]");
        org.junit.Assert.assertNotNull(doubleArray12);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray12), "[-1.0]");
        org.junit.Assert.assertNotNull(realMatrix14);
    }

    @Test
    public void test5053() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5053");
        double[] doubleArray2 = new double[] { 0, 1 };
        org.apache.commons.math.linear.RealMatrixImpl realMatrixImpl3 = new org.apache.commons.math.linear.RealMatrixImpl(doubleArray2);
        double[] doubleArray6 = new double[] { 0, 1 };
        org.apache.commons.math.linear.RealMatrixImpl realMatrixImpl7 = new org.apache.commons.math.linear.RealMatrixImpl(doubleArray6);
        org.apache.commons.math.linear.RealMatrix realMatrix8 = realMatrixImpl3.add((org.apache.commons.math.linear.RealMatrix) realMatrixImpl7);
        double[] doubleArray11 = new double[] { 0, 1 };
        org.apache.commons.math.linear.RealMatrixImpl realMatrixImpl12 = new org.apache.commons.math.linear.RealMatrixImpl(doubleArray11);
        double[] doubleArray15 = new double[] { 0, 1 };
        org.apache.commons.math.linear.RealMatrixImpl realMatrixImpl16 = new org.apache.commons.math.linear.RealMatrixImpl(doubleArray15);
        org.apache.commons.math.linear.RealMatrix realMatrix17 = realMatrixImpl12.add((org.apache.commons.math.linear.RealMatrix) realMatrixImpl16);
        org.apache.commons.math.linear.RealMatrix realMatrix18 = realMatrixImpl7.subtract((org.apache.commons.math.linear.RealMatrix) realMatrixImpl16);
        boolean boolean19 = realMatrixImpl7.isSquare();
        double double20 = realMatrixImpl7.getNorm();
        double[] doubleArray26 = new double[] { (short) 10, 1.0d, 0.0f, (-1.0f), 0.0d };
        org.apache.commons.math.linear.RealMatrixImpl realMatrixImpl27 = new org.apache.commons.math.linear.RealMatrixImpl(doubleArray26);
        org.apache.commons.math.linear.RealMatrixImpl realMatrixImpl28 = new org.apache.commons.math.linear.RealMatrixImpl(doubleArray26);
        boolean boolean29 = realMatrixImpl7.equals((java.lang.Object) realMatrixImpl28);
        boolean boolean30 = realMatrixImpl28.isSingular();
        org.apache.commons.math.linear.RealMatrix realMatrix31 = realMatrixImpl28.transpose();
        org.junit.Assert.assertNotNull(doubleArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray2), "[0.0, 1.0]");
        org.junit.Assert.assertNotNull(doubleArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray6), "[0.0, 1.0]");
        org.junit.Assert.assertNotNull(realMatrix8);
        org.junit.Assert.assertNotNull(doubleArray11);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray11), "[0.0, 1.0]");
        org.junit.Assert.assertNotNull(doubleArray15);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray15), "[0.0, 1.0]");
        org.junit.Assert.assertNotNull(realMatrix17);
        org.junit.Assert.assertNotNull(realMatrix18);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertTrue("'" + double20 + "' != '" + 1.0d + "'", double20 == 1.0d);
        org.junit.Assert.assertNotNull(doubleArray26);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray26), "[10.0, 1.0, 0.0, -1.0, 0.0]");
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + false + "'", boolean29 == false);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + true + "'", boolean30 == true);
        org.junit.Assert.assertNotNull(realMatrix31);
    }

    @Test
    public void test5054() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5054");
        double[] doubleArray2 = new double[] { 0, 1 };
        org.apache.commons.math.linear.RealMatrixImpl realMatrixImpl3 = new org.apache.commons.math.linear.RealMatrixImpl(doubleArray2);
        double[] doubleArray6 = new double[] { 0, 1 };
        org.apache.commons.math.linear.RealMatrixImpl realMatrixImpl7 = new org.apache.commons.math.linear.RealMatrixImpl(doubleArray6);
        org.apache.commons.math.linear.RealMatrix realMatrix8 = realMatrixImpl3.add((org.apache.commons.math.linear.RealMatrix) realMatrixImpl7);
        double[] doubleArray11 = new double[] { 10.0d, (short) -1 };
        double[] doubleArray12 = realMatrixImpl3.preMultiply(doubleArray11);
        org.apache.commons.math.linear.RealMatrixImpl realMatrixImpl13 = new org.apache.commons.math.linear.RealMatrixImpl(doubleArray11);
        boolean boolean14 = realMatrixImpl13.isSingular();
        double[][] doubleArray15 = realMatrixImpl13.getDataRef();
        java.lang.String str16 = realMatrixImpl13.toString();
        double[] doubleArray19 = new double[] { 0, 1 };
        org.apache.commons.math.linear.RealMatrixImpl realMatrixImpl20 = new org.apache.commons.math.linear.RealMatrixImpl(doubleArray19);
        double double21 = realMatrixImpl20.getNorm();
        double[] doubleArray24 = new double[] { 0, 1 };
        org.apache.commons.math.linear.RealMatrixImpl realMatrixImpl25 = new org.apache.commons.math.linear.RealMatrixImpl(doubleArray24);
        double double26 = realMatrixImpl25.getNorm();
        org.apache.commons.math.linear.RealMatrix realMatrix27 = realMatrixImpl25.transpose();
        double[] doubleArray29 = realMatrixImpl25.getColumn(0);
        double[] doubleArray30 = realMatrixImpl20.preMultiply(doubleArray29);
        double[] doubleArray31 = realMatrixImpl13.preMultiply(doubleArray29);
        org.apache.commons.math.linear.RealMatrixImpl realMatrixImpl32 = new org.apache.commons.math.linear.RealMatrixImpl(doubleArray29);
        org.apache.commons.math.linear.RealMatrixImpl realMatrixImpl33 = new org.apache.commons.math.linear.RealMatrixImpl(doubleArray29);
        double[][] doubleArray34 = realMatrixImpl33.getDataRef();
        double double35 = realMatrixImpl33.getNorm();
        org.apache.commons.math.linear.RealMatrix realMatrix37 = realMatrixImpl33.scalarAdd((double) 10.0f);
        org.junit.Assert.assertNotNull(doubleArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray2), "[0.0, 1.0]");
        org.junit.Assert.assertNotNull(doubleArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray6), "[0.0, 1.0]");
        org.junit.Assert.assertNotNull(realMatrix8);
        org.junit.Assert.assertNotNull(doubleArray11);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray11), "[10.0, -1.0]");
        org.junit.Assert.assertNotNull(doubleArray12);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray12), "[-1.0]");
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertNotNull(doubleArray15);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "RealMatrixImpl{{10.0},{-1.0}}" + "'", str16, "RealMatrixImpl{{10.0},{-1.0}}");
        org.junit.Assert.assertNotNull(doubleArray19);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray19), "[0.0, 1.0]");
        org.junit.Assert.assertTrue("'" + double21 + "' != '" + 1.0d + "'", double21 == 1.0d);
        org.junit.Assert.assertNotNull(doubleArray24);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray24), "[0.0, 1.0]");
        org.junit.Assert.assertTrue("'" + double26 + "' != '" + 1.0d + "'", double26 == 1.0d);
        org.junit.Assert.assertNotNull(realMatrix27);
        org.junit.Assert.assertNotNull(doubleArray29);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray29), "[0.0, 1.0]");
        org.junit.Assert.assertNotNull(doubleArray30);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray30), "[1.0]");
        org.junit.Assert.assertNotNull(doubleArray31);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray31), "[-1.0]");
        org.junit.Assert.assertNotNull(doubleArray34);
        org.junit.Assert.assertTrue("'" + double35 + "' != '" + 1.0d + "'", double35 == 1.0d);
        org.junit.Assert.assertNotNull(realMatrix37);
    }

    @Test
    public void test5055() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5055");
        double[] doubleArray2 = new double[] { 0, 1 };
        org.apache.commons.math.linear.RealMatrixImpl realMatrixImpl3 = new org.apache.commons.math.linear.RealMatrixImpl(doubleArray2);
        double[] doubleArray6 = new double[] { 0, 1 };
        org.apache.commons.math.linear.RealMatrixImpl realMatrixImpl7 = new org.apache.commons.math.linear.RealMatrixImpl(doubleArray6);
        org.apache.commons.math.linear.RealMatrix realMatrix8 = realMatrixImpl3.add((org.apache.commons.math.linear.RealMatrix) realMatrixImpl7);
        double[] doubleArray11 = new double[] { 10.0d, (short) -1 };
        double[] doubleArray12 = realMatrixImpl3.preMultiply(doubleArray11);
        org.apache.commons.math.linear.RealMatrixImpl realMatrixImpl13 = new org.apache.commons.math.linear.RealMatrixImpl(doubleArray11);
        java.lang.String str14 = realMatrixImpl13.toString();
        double[] doubleArray17 = new double[] { 0, 1 };
        org.apache.commons.math.linear.RealMatrixImpl realMatrixImpl18 = new org.apache.commons.math.linear.RealMatrixImpl(doubleArray17);
        org.apache.commons.math.linear.RealMatrix realMatrix20 = realMatrixImpl18.scalarMultiply((double) (short) 100);
        double[][] doubleArray21 = realMatrixImpl18.getDataRef();
        org.apache.commons.math.linear.RealMatrix realMatrix22 = realMatrixImpl13.subtract((org.apache.commons.math.linear.RealMatrix) realMatrixImpl18);
        double double23 = realMatrixImpl13.getNorm();
        double[] doubleArray26 = new double[] { 0, 1 };
        org.apache.commons.math.linear.RealMatrixImpl realMatrixImpl27 = new org.apache.commons.math.linear.RealMatrixImpl(doubleArray26);
        double[] doubleArray30 = new double[] { 0, 1 };
        org.apache.commons.math.linear.RealMatrixImpl realMatrixImpl31 = new org.apache.commons.math.linear.RealMatrixImpl(doubleArray30);
        org.apache.commons.math.linear.RealMatrix realMatrix32 = realMatrixImpl27.add((org.apache.commons.math.linear.RealMatrix) realMatrixImpl31);
        double[] doubleArray35 = new double[] { 10.0d, (short) -1 };
        double[] doubleArray36 = realMatrixImpl27.preMultiply(doubleArray35);
        org.apache.commons.math.linear.RealMatrixImpl realMatrixImpl37 = new org.apache.commons.math.linear.RealMatrixImpl(doubleArray35);
        boolean boolean38 = realMatrixImpl37.isSingular();
        org.apache.commons.math.linear.RealMatrix realMatrix39 = realMatrixImpl37.transpose();
        int int40 = realMatrixImpl37.getColumnDimension();
        boolean boolean41 = realMatrixImpl13.equals((java.lang.Object) int40);
        double[] doubleArray44 = new double[] { 0, 1 };
        org.apache.commons.math.linear.RealMatrixImpl realMatrixImpl45 = new org.apache.commons.math.linear.RealMatrixImpl(doubleArray44);
        double[] doubleArray48 = new double[] { 0, 1 };
        org.apache.commons.math.linear.RealMatrixImpl realMatrixImpl49 = new org.apache.commons.math.linear.RealMatrixImpl(doubleArray48);
        org.apache.commons.math.linear.RealMatrix realMatrix50 = realMatrixImpl45.add((org.apache.commons.math.linear.RealMatrix) realMatrixImpl49);
        boolean boolean51 = realMatrixImpl45.isSquare();
        int int52 = realMatrixImpl45.getColumnDimension();
        double double53 = realMatrixImpl45.getNorm();
        java.lang.String str54 = realMatrixImpl45.toString();
        boolean boolean55 = realMatrixImpl13.equals((java.lang.Object) realMatrixImpl45);
        int[] intArray56 = null;
        int[] intArray58 = new int[] { '#' };
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math.linear.RealMatrix realMatrix59 = realMatrixImpl45.getSubMatrix(intArray56, intArray58);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(doubleArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray2), "[0.0, 1.0]");
        org.junit.Assert.assertNotNull(doubleArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray6), "[0.0, 1.0]");
        org.junit.Assert.assertNotNull(realMatrix8);
        org.junit.Assert.assertNotNull(doubleArray11);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray11), "[10.0, -1.0]");
        org.junit.Assert.assertNotNull(doubleArray12);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray12), "[-1.0]");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "RealMatrixImpl{{10.0},{-1.0}}" + "'", str14, "RealMatrixImpl{{10.0},{-1.0}}");
        org.junit.Assert.assertNotNull(doubleArray17);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray17), "[0.0, 1.0]");
        org.junit.Assert.assertNotNull(realMatrix20);
        org.junit.Assert.assertNotNull(doubleArray21);
        org.junit.Assert.assertNotNull(realMatrix22);
        org.junit.Assert.assertTrue("'" + double23 + "' != '" + 11.0d + "'", double23 == 11.0d);
        org.junit.Assert.assertNotNull(doubleArray26);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray26), "[0.0, 1.0]");
        org.junit.Assert.assertNotNull(doubleArray30);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray30), "[0.0, 1.0]");
        org.junit.Assert.assertNotNull(realMatrix32);
        org.junit.Assert.assertNotNull(doubleArray35);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray35), "[10.0, -1.0]");
        org.junit.Assert.assertNotNull(doubleArray36);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray36), "[-1.0]");
        org.junit.Assert.assertTrue("'" + boolean38 + "' != '" + true + "'", boolean38 == true);
        org.junit.Assert.assertNotNull(realMatrix39);
        org.junit.Assert.assertTrue("'" + int40 + "' != '" + 1 + "'", int40 == 1);
        org.junit.Assert.assertTrue("'" + boolean41 + "' != '" + false + "'", boolean41 == false);
        org.junit.Assert.assertNotNull(doubleArray44);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray44), "[0.0, 1.0]");
        org.junit.Assert.assertNotNull(doubleArray48);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray48), "[0.0, 1.0]");
        org.junit.Assert.assertNotNull(realMatrix50);
        org.junit.Assert.assertTrue("'" + boolean51 + "' != '" + false + "'", boolean51 == false);
        org.junit.Assert.assertTrue("'" + int52 + "' != '" + 1 + "'", int52 == 1);
        org.junit.Assert.assertTrue("'" + double53 + "' != '" + 1.0d + "'", double53 == 1.0d);
        org.junit.Assert.assertEquals("'" + str54 + "' != '" + "RealMatrixImpl{{0.0},{1.0}}" + "'", str54, "RealMatrixImpl{{0.0},{1.0}}");
        org.junit.Assert.assertTrue("'" + boolean55 + "' != '" + false + "'", boolean55 == false);
        org.junit.Assert.assertNotNull(intArray58);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray58), "[35]");
    }

    @Test
    public void test5056() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5056");
        org.apache.commons.math.linear.RealMatrixImpl realMatrixImpl2 = new org.apache.commons.math.linear.RealMatrixImpl(100, (int) (byte) 1);
        double[] doubleArray5 = new double[] { 0, 1 };
        org.apache.commons.math.linear.RealMatrixImpl realMatrixImpl6 = new org.apache.commons.math.linear.RealMatrixImpl(doubleArray5);
        double[] doubleArray9 = new double[] { 0, 1 };
        org.apache.commons.math.linear.RealMatrixImpl realMatrixImpl10 = new org.apache.commons.math.linear.RealMatrixImpl(doubleArray9);
        org.apache.commons.math.linear.RealMatrix realMatrix11 = realMatrixImpl6.add((org.apache.commons.math.linear.RealMatrix) realMatrixImpl10);
        boolean boolean12 = realMatrixImpl6.isSquare();
        int int13 = realMatrixImpl6.getColumnDimension();
        double double14 = realMatrixImpl6.getNorm();
        boolean boolean15 = realMatrixImpl2.equals((java.lang.Object) realMatrixImpl6);
        boolean boolean16 = realMatrixImpl6.isSingular();
        org.apache.commons.math.linear.RealMatrix realMatrix18 = realMatrixImpl6.scalarMultiply((-1.0d));
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math.linear.RealMatrix realMatrix19 = realMatrixImpl6.inverse();
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math.linear.InvalidMatrixException; message: coefficient matrix is not square");
        } catch (org.apache.commons.math.linear.InvalidMatrixException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(doubleArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray5), "[0.0, 1.0]");
        org.junit.Assert.assertNotNull(doubleArray9);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray9), "[0.0, 1.0]");
        org.junit.Assert.assertNotNull(realMatrix11);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 1 + "'", int13 == 1);
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + 1.0d + "'", double14 == 1.0d);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertNotNull(realMatrix18);
    }

    @Test
    public void test5057() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5057");
        double[] doubleArray2 = new double[] { 0, 1 };
        org.apache.commons.math.linear.RealMatrixImpl realMatrixImpl3 = new org.apache.commons.math.linear.RealMatrixImpl(doubleArray2);
        double double4 = realMatrixImpl3.getNorm();
        org.apache.commons.math.linear.RealMatrix realMatrix5 = realMatrixImpl3.transpose();
        double[][] doubleArray6 = realMatrixImpl3.getDataRef();
        org.apache.commons.math.linear.RealMatrixImpl realMatrixImpl7 = new org.apache.commons.math.linear.RealMatrixImpl(doubleArray6);
        org.apache.commons.math.linear.RealMatrixImpl realMatrixImpl8 = new org.apache.commons.math.linear.RealMatrixImpl(doubleArray6);
        int int9 = realMatrixImpl8.getColumnDimension();
        double[] doubleArray11 = realMatrixImpl8.getRow((int) (short) 1);
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math.linear.RealMatrix realMatrix13 = realMatrixImpl8.getColumnMatrix((int) ' ');
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math.linear.MatrixIndexException; message: illegal column argument");
        } catch (org.apache.commons.math.linear.MatrixIndexException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(doubleArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray2), "[0.0, 1.0]");
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 1.0d + "'", double4 == 1.0d);
        org.junit.Assert.assertNotNull(realMatrix5);
        org.junit.Assert.assertNotNull(doubleArray6);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 1 + "'", int9 == 1);
        org.junit.Assert.assertNotNull(doubleArray11);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray11), "[1.0]");
    }

    @Test
    public void test5058() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5058");
        double[] doubleArray2 = new double[] { 0, 1 };
        org.apache.commons.math.linear.RealMatrixImpl realMatrixImpl3 = new org.apache.commons.math.linear.RealMatrixImpl(doubleArray2);
        double[] doubleArray6 = new double[] { 0, 1 };
        org.apache.commons.math.linear.RealMatrixImpl realMatrixImpl7 = new org.apache.commons.math.linear.RealMatrixImpl(doubleArray6);
        org.apache.commons.math.linear.RealMatrix realMatrix8 = realMatrixImpl3.add((org.apache.commons.math.linear.RealMatrix) realMatrixImpl7);
        double[] doubleArray11 = new double[] { 0, 1 };
        org.apache.commons.math.linear.RealMatrixImpl realMatrixImpl12 = new org.apache.commons.math.linear.RealMatrixImpl(doubleArray11);
        double[] doubleArray15 = new double[] { 0, 1 };
        org.apache.commons.math.linear.RealMatrixImpl realMatrixImpl16 = new org.apache.commons.math.linear.RealMatrixImpl(doubleArray15);
        org.apache.commons.math.linear.RealMatrix realMatrix17 = realMatrixImpl12.add((org.apache.commons.math.linear.RealMatrix) realMatrixImpl16);
        org.apache.commons.math.linear.RealMatrix realMatrix18 = realMatrixImpl7.subtract((org.apache.commons.math.linear.RealMatrix) realMatrixImpl16);
        boolean boolean19 = realMatrixImpl7.isSquare();
        int int20 = realMatrixImpl7.getColumnDimension();
        double[] doubleArray23 = new double[] { 0, 1 };
        org.apache.commons.math.linear.RealMatrixImpl realMatrixImpl24 = new org.apache.commons.math.linear.RealMatrixImpl(doubleArray23);
        double[] doubleArray27 = new double[] { 0, 1 };
        org.apache.commons.math.linear.RealMatrixImpl realMatrixImpl28 = new org.apache.commons.math.linear.RealMatrixImpl(doubleArray27);
        org.apache.commons.math.linear.RealMatrix realMatrix29 = realMatrixImpl24.add((org.apache.commons.math.linear.RealMatrix) realMatrixImpl28);
        double[] doubleArray32 = new double[] { 0, 1 };
        org.apache.commons.math.linear.RealMatrixImpl realMatrixImpl33 = new org.apache.commons.math.linear.RealMatrixImpl(doubleArray32);
        double[] doubleArray36 = new double[] { 0, 1 };
        org.apache.commons.math.linear.RealMatrixImpl realMatrixImpl37 = new org.apache.commons.math.linear.RealMatrixImpl(doubleArray36);
        org.apache.commons.math.linear.RealMatrix realMatrix38 = realMatrixImpl33.add((org.apache.commons.math.linear.RealMatrix) realMatrixImpl37);
        org.apache.commons.math.linear.RealMatrix realMatrix39 = realMatrixImpl28.subtract((org.apache.commons.math.linear.RealMatrix) realMatrixImpl37);
        org.apache.commons.math.linear.RealMatrix realMatrix40 = realMatrixImpl7.subtract((org.apache.commons.math.linear.RealMatrix) realMatrixImpl28);
        int int41 = realMatrixImpl28.getColumnDimension();
        int int42 = realMatrixImpl28.getColumnDimension();
        org.apache.commons.math.linear.RealMatrix realMatrix44 = realMatrixImpl28.scalarAdd(100.0d);
        int int45 = realMatrixImpl28.getColumnDimension();
        double[][] doubleArray46 = realMatrixImpl28.getData();
        org.junit.Assert.assertNotNull(doubleArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray2), "[0.0, 1.0]");
        org.junit.Assert.assertNotNull(doubleArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray6), "[0.0, 1.0]");
        org.junit.Assert.assertNotNull(realMatrix8);
        org.junit.Assert.assertNotNull(doubleArray11);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray11), "[0.0, 1.0]");
        org.junit.Assert.assertNotNull(doubleArray15);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray15), "[0.0, 1.0]");
        org.junit.Assert.assertNotNull(realMatrix17);
        org.junit.Assert.assertNotNull(realMatrix18);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 1 + "'", int20 == 1);
        org.junit.Assert.assertNotNull(doubleArray23);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray23), "[0.0, 1.0]");
        org.junit.Assert.assertNotNull(doubleArray27);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray27), "[0.0, 1.0]");
        org.junit.Assert.assertNotNull(realMatrix29);
        org.junit.Assert.assertNotNull(doubleArray32);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray32), "[0.0, 1.0]");
        org.junit.Assert.assertNotNull(doubleArray36);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray36), "[0.0, 1.0]");
        org.junit.Assert.assertNotNull(realMatrix38);
        org.junit.Assert.assertNotNull(realMatrix39);
        org.junit.Assert.assertNotNull(realMatrix40);
        org.junit.Assert.assertTrue("'" + int41 + "' != '" + 1 + "'", int41 == 1);
        org.junit.Assert.assertTrue("'" + int42 + "' != '" + 1 + "'", int42 == 1);
        org.junit.Assert.assertNotNull(realMatrix44);
        org.junit.Assert.assertTrue("'" + int45 + "' != '" + 1 + "'", int45 == 1);
        org.junit.Assert.assertNotNull(doubleArray46);
    }

    @Test
    public void test5059() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5059");
        double[] doubleArray2 = new double[] { 0, 1 };
        org.apache.commons.math.linear.RealMatrixImpl realMatrixImpl3 = new org.apache.commons.math.linear.RealMatrixImpl(doubleArray2);
        double[] doubleArray6 = new double[] { 0, 1 };
        org.apache.commons.math.linear.RealMatrixImpl realMatrixImpl7 = new org.apache.commons.math.linear.RealMatrixImpl(doubleArray6);
        org.apache.commons.math.linear.RealMatrix realMatrix8 = realMatrixImpl3.add((org.apache.commons.math.linear.RealMatrix) realMatrixImpl7);
        double[] doubleArray11 = new double[] { 0, 1 };
        org.apache.commons.math.linear.RealMatrixImpl realMatrixImpl12 = new org.apache.commons.math.linear.RealMatrixImpl(doubleArray11);
        double[] doubleArray15 = new double[] { 0, 1 };
        org.apache.commons.math.linear.RealMatrixImpl realMatrixImpl16 = new org.apache.commons.math.linear.RealMatrixImpl(doubleArray15);
        org.apache.commons.math.linear.RealMatrix realMatrix17 = realMatrixImpl12.add((org.apache.commons.math.linear.RealMatrix) realMatrixImpl16);
        org.apache.commons.math.linear.RealMatrix realMatrix18 = realMatrixImpl7.subtract((org.apache.commons.math.linear.RealMatrix) realMatrixImpl16);
        boolean boolean19 = realMatrixImpl7.isSquare();
        int int20 = realMatrixImpl7.getColumnDimension();
        double[] doubleArray23 = new double[] { 0, 1 };
        org.apache.commons.math.linear.RealMatrixImpl realMatrixImpl24 = new org.apache.commons.math.linear.RealMatrixImpl(doubleArray23);
        double[] doubleArray27 = new double[] { 0, 1 };
        org.apache.commons.math.linear.RealMatrixImpl realMatrixImpl28 = new org.apache.commons.math.linear.RealMatrixImpl(doubleArray27);
        org.apache.commons.math.linear.RealMatrix realMatrix29 = realMatrixImpl24.add((org.apache.commons.math.linear.RealMatrix) realMatrixImpl28);
        double[] doubleArray32 = new double[] { 0, 1 };
        org.apache.commons.math.linear.RealMatrixImpl realMatrixImpl33 = new org.apache.commons.math.linear.RealMatrixImpl(doubleArray32);
        double[] doubleArray36 = new double[] { 0, 1 };
        org.apache.commons.math.linear.RealMatrixImpl realMatrixImpl37 = new org.apache.commons.math.linear.RealMatrixImpl(doubleArray36);
        org.apache.commons.math.linear.RealMatrix realMatrix38 = realMatrixImpl33.add((org.apache.commons.math.linear.RealMatrix) realMatrixImpl37);
        org.apache.commons.math.linear.RealMatrix realMatrix39 = realMatrixImpl28.subtract((org.apache.commons.math.linear.RealMatrix) realMatrixImpl37);
        org.apache.commons.math.linear.RealMatrix realMatrix40 = realMatrixImpl7.subtract((org.apache.commons.math.linear.RealMatrix) realMatrixImpl28);
        double double41 = realMatrixImpl7.getNorm();
        boolean boolean42 = realMatrixImpl7.isSquare();
        double[] doubleArray44 = realMatrixImpl7.getRow((int) (byte) 1);
        org.apache.commons.math.linear.RealMatrixImpl realMatrixImpl45 = new org.apache.commons.math.linear.RealMatrixImpl(doubleArray44);
        org.apache.commons.math.linear.RealMatrix realMatrix46 = realMatrixImpl45.inverse();
        java.lang.String str47 = realMatrixImpl45.toString();
        double[] doubleArray50 = new double[] { 0, 1 };
        org.apache.commons.math.linear.RealMatrixImpl realMatrixImpl51 = new org.apache.commons.math.linear.RealMatrixImpl(doubleArray50);
        double[] doubleArray54 = new double[] { 0, 1 };
        org.apache.commons.math.linear.RealMatrixImpl realMatrixImpl55 = new org.apache.commons.math.linear.RealMatrixImpl(doubleArray54);
        org.apache.commons.math.linear.RealMatrix realMatrix56 = realMatrixImpl51.add((org.apache.commons.math.linear.RealMatrix) realMatrixImpl55);
        double[] doubleArray59 = new double[] { 10.0d, (short) -1 };
        double[] doubleArray60 = realMatrixImpl51.preMultiply(doubleArray59);
        org.apache.commons.math.linear.RealMatrixImpl realMatrixImpl61 = new org.apache.commons.math.linear.RealMatrixImpl(doubleArray60);
        boolean boolean62 = realMatrixImpl61.isSquare();
        double[] doubleArray65 = new double[] { 0, 1 };
        org.apache.commons.math.linear.RealMatrixImpl realMatrixImpl66 = new org.apache.commons.math.linear.RealMatrixImpl(doubleArray65);
        double[] doubleArray69 = new double[] { 0, 1 };
        org.apache.commons.math.linear.RealMatrixImpl realMatrixImpl70 = new org.apache.commons.math.linear.RealMatrixImpl(doubleArray69);
        org.apache.commons.math.linear.RealMatrix realMatrix71 = realMatrixImpl66.add((org.apache.commons.math.linear.RealMatrix) realMatrixImpl70);
        boolean boolean72 = realMatrixImpl66.isSquare();
        int int73 = realMatrixImpl66.getColumnDimension();
        double[] doubleArray76 = new double[] { 0, 1 };
        org.apache.commons.math.linear.RealMatrixImpl realMatrixImpl77 = new org.apache.commons.math.linear.RealMatrixImpl(doubleArray76);
        double[] doubleArray80 = new double[] { 0, 1 };
        org.apache.commons.math.linear.RealMatrixImpl realMatrixImpl81 = new org.apache.commons.math.linear.RealMatrixImpl(doubleArray80);
        org.apache.commons.math.linear.RealMatrix realMatrix82 = realMatrixImpl77.add((org.apache.commons.math.linear.RealMatrix) realMatrixImpl81);
        double[] doubleArray85 = new double[] { 10.0d, (short) -1 };
        double[] doubleArray86 = realMatrixImpl77.preMultiply(doubleArray85);
        org.apache.commons.math.linear.RealMatrixImpl realMatrixImpl87 = new org.apache.commons.math.linear.RealMatrixImpl(doubleArray85);
        double[] doubleArray88 = realMatrixImpl66.preMultiply(doubleArray85);
        boolean boolean89 = realMatrixImpl61.equals((java.lang.Object) realMatrixImpl66);
        double[][] doubleArray90 = realMatrixImpl66.getData();
        double[][] doubleArray91 = realMatrixImpl66.getData();
        org.apache.commons.math.linear.RealMatrixImpl realMatrixImpl92 = new org.apache.commons.math.linear.RealMatrixImpl(doubleArray91);
        org.apache.commons.math.linear.RealMatrix realMatrix93 = realMatrixImpl92.copy();
        org.apache.commons.math.linear.RealMatrix realMatrix95 = realMatrixImpl92.getRowMatrix(0);
        org.apache.commons.math.linear.RealMatrix realMatrix96 = realMatrixImpl45.preMultiply(realMatrix95);
        int int97 = realMatrixImpl45.getColumnDimension();
        org.junit.Assert.assertNotNull(doubleArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray2), "[0.0, 1.0]");
        org.junit.Assert.assertNotNull(doubleArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray6), "[0.0, 1.0]");
        org.junit.Assert.assertNotNull(realMatrix8);
        org.junit.Assert.assertNotNull(doubleArray11);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray11), "[0.0, 1.0]");
        org.junit.Assert.assertNotNull(doubleArray15);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray15), "[0.0, 1.0]");
        org.junit.Assert.assertNotNull(realMatrix17);
        org.junit.Assert.assertNotNull(realMatrix18);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 1 + "'", int20 == 1);
        org.junit.Assert.assertNotNull(doubleArray23);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray23), "[0.0, 1.0]");
        org.junit.Assert.assertNotNull(doubleArray27);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray27), "[0.0, 1.0]");
        org.junit.Assert.assertNotNull(realMatrix29);
        org.junit.Assert.assertNotNull(doubleArray32);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray32), "[0.0, 1.0]");
        org.junit.Assert.assertNotNull(doubleArray36);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray36), "[0.0, 1.0]");
        org.junit.Assert.assertNotNull(realMatrix38);
        org.junit.Assert.assertNotNull(realMatrix39);
        org.junit.Assert.assertNotNull(realMatrix40);
        org.junit.Assert.assertTrue("'" + double41 + "' != '" + 1.0d + "'", double41 == 1.0d);
        org.junit.Assert.assertTrue("'" + boolean42 + "' != '" + false + "'", boolean42 == false);
        org.junit.Assert.assertNotNull(doubleArray44);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray44), "[1.0]");
        org.junit.Assert.assertNotNull(realMatrix46);
        org.junit.Assert.assertEquals("'" + str47 + "' != '" + "RealMatrixImpl{{1.0}}" + "'", str47, "RealMatrixImpl{{1.0}}");
        org.junit.Assert.assertNotNull(doubleArray50);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray50), "[0.0, 1.0]");
        org.junit.Assert.assertNotNull(doubleArray54);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray54), "[0.0, 1.0]");
        org.junit.Assert.assertNotNull(realMatrix56);
        org.junit.Assert.assertNotNull(doubleArray59);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray59), "[10.0, -1.0]");
        org.junit.Assert.assertNotNull(doubleArray60);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray60), "[-1.0]");
        org.junit.Assert.assertTrue("'" + boolean62 + "' != '" + true + "'", boolean62 == true);
        org.junit.Assert.assertNotNull(doubleArray65);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray65), "[0.0, 1.0]");
        org.junit.Assert.assertNotNull(doubleArray69);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray69), "[0.0, 1.0]");
        org.junit.Assert.assertNotNull(realMatrix71);
        org.junit.Assert.assertTrue("'" + boolean72 + "' != '" + false + "'", boolean72 == false);
        org.junit.Assert.assertTrue("'" + int73 + "' != '" + 1 + "'", int73 == 1);
        org.junit.Assert.assertNotNull(doubleArray76);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray76), "[0.0, 1.0]");
        org.junit.Assert.assertNotNull(doubleArray80);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray80), "[0.0, 1.0]");
        org.junit.Assert.assertNotNull(realMatrix82);
        org.junit.Assert.assertNotNull(doubleArray85);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray85), "[10.0, -1.0]");
        org.junit.Assert.assertNotNull(doubleArray86);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray86), "[-1.0]");
        org.junit.Assert.assertNotNull(doubleArray88);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray88), "[-1.0]");
        org.junit.Assert.assertTrue("'" + boolean89 + "' != '" + false + "'", boolean89 == false);
        org.junit.Assert.assertNotNull(doubleArray90);
        org.junit.Assert.assertNotNull(doubleArray91);
        org.junit.Assert.assertNotNull(realMatrix93);
        org.junit.Assert.assertNotNull(realMatrix95);
        org.junit.Assert.assertNotNull(realMatrix96);
        org.junit.Assert.assertTrue("'" + int97 + "' != '" + 1 + "'", int97 == 1);
    }

    @Test
    public void test5060() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5060");
        double[] doubleArray2 = new double[] { 0, 1 };
        org.apache.commons.math.linear.RealMatrixImpl realMatrixImpl3 = new org.apache.commons.math.linear.RealMatrixImpl(doubleArray2);
        double double4 = realMatrixImpl3.getNorm();
        org.apache.commons.math.linear.RealMatrix realMatrix5 = realMatrixImpl3.transpose();
        double[][] doubleArray6 = realMatrixImpl3.getDataRef();
        org.apache.commons.math.linear.RealMatrixImpl realMatrixImpl7 = new org.apache.commons.math.linear.RealMatrixImpl(doubleArray6);
        org.apache.commons.math.linear.RealMatrixImpl realMatrixImpl8 = new org.apache.commons.math.linear.RealMatrixImpl(doubleArray6);
        org.apache.commons.math.linear.RealMatrixImpl realMatrixImpl9 = new org.apache.commons.math.linear.RealMatrixImpl(doubleArray6);
        boolean boolean10 = realMatrixImpl9.isSingular();
        java.lang.String str11 = realMatrixImpl9.toString();
        org.apache.commons.math.linear.RealMatrix realMatrix13 = realMatrixImpl9.scalarAdd((double) 10L);
        double[] doubleArray15 = realMatrixImpl9.getRow(0);
        // The following exception was thrown during execution in test generation
        try {
            double double16 = realMatrixImpl9.getTrace();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: matrix is not square");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(doubleArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray2), "[0.0, 1.0]");
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 1.0d + "'", double4 == 1.0d);
        org.junit.Assert.assertNotNull(realMatrix5);
        org.junit.Assert.assertNotNull(doubleArray6);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "RealMatrixImpl{{0.0},{1.0}}" + "'", str11, "RealMatrixImpl{{0.0},{1.0}}");
        org.junit.Assert.assertNotNull(realMatrix13);
        org.junit.Assert.assertNotNull(doubleArray15);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray15), "[0.0]");
    }

    @Test
    public void test5061() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5061");
        double[] doubleArray2 = new double[] { 0, 1 };
        org.apache.commons.math.linear.RealMatrixImpl realMatrixImpl3 = new org.apache.commons.math.linear.RealMatrixImpl(doubleArray2);
        double[] doubleArray6 = new double[] { 0, 1 };
        org.apache.commons.math.linear.RealMatrixImpl realMatrixImpl7 = new org.apache.commons.math.linear.RealMatrixImpl(doubleArray6);
        org.apache.commons.math.linear.RealMatrix realMatrix8 = realMatrixImpl3.add((org.apache.commons.math.linear.RealMatrix) realMatrixImpl7);
        double[][] doubleArray9 = realMatrixImpl3.getData();
        org.apache.commons.math.linear.RealMatrix realMatrix11 = realMatrixImpl3.scalarAdd((double) 1L);
        double[][] doubleArray12 = realMatrixImpl3.getData();
        java.lang.String str13 = realMatrixImpl3.toString();
        org.junit.Assert.assertNotNull(doubleArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray2), "[0.0, 1.0]");
        org.junit.Assert.assertNotNull(doubleArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray6), "[0.0, 1.0]");
        org.junit.Assert.assertNotNull(realMatrix8);
        org.junit.Assert.assertNotNull(doubleArray9);
        org.junit.Assert.assertNotNull(realMatrix11);
        org.junit.Assert.assertNotNull(doubleArray12);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "RealMatrixImpl{{0.0},{1.0}}" + "'", str13, "RealMatrixImpl{{0.0},{1.0}}");
    }

    @Test
    public void test5062() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5062");
        double[] doubleArray2 = new double[] { 0, 1 };
        org.apache.commons.math.linear.RealMatrixImpl realMatrixImpl3 = new org.apache.commons.math.linear.RealMatrixImpl(doubleArray2);
        double[] doubleArray6 = new double[] { 0, 1 };
        org.apache.commons.math.linear.RealMatrixImpl realMatrixImpl7 = new org.apache.commons.math.linear.RealMatrixImpl(doubleArray6);
        org.apache.commons.math.linear.RealMatrix realMatrix8 = realMatrixImpl3.add((org.apache.commons.math.linear.RealMatrix) realMatrixImpl7);
        double[] doubleArray11 = new double[] { 0, 1 };
        org.apache.commons.math.linear.RealMatrixImpl realMatrixImpl12 = new org.apache.commons.math.linear.RealMatrixImpl(doubleArray11);
        double[] doubleArray15 = new double[] { 0, 1 };
        org.apache.commons.math.linear.RealMatrixImpl realMatrixImpl16 = new org.apache.commons.math.linear.RealMatrixImpl(doubleArray15);
        org.apache.commons.math.linear.RealMatrix realMatrix17 = realMatrixImpl12.add((org.apache.commons.math.linear.RealMatrix) realMatrixImpl16);
        org.apache.commons.math.linear.RealMatrix realMatrix18 = realMatrixImpl7.subtract((org.apache.commons.math.linear.RealMatrix) realMatrixImpl16);
        boolean boolean19 = realMatrixImpl7.isSquare();
        double double20 = realMatrixImpl7.getNorm();
        boolean boolean21 = realMatrixImpl7.isSingular();
        double[] doubleArray24 = new double[] { 0, 1 };
        org.apache.commons.math.linear.RealMatrixImpl realMatrixImpl25 = new org.apache.commons.math.linear.RealMatrixImpl(doubleArray24);
        double[] doubleArray28 = new double[] { 0, 1 };
        org.apache.commons.math.linear.RealMatrixImpl realMatrixImpl29 = new org.apache.commons.math.linear.RealMatrixImpl(doubleArray28);
        org.apache.commons.math.linear.RealMatrix realMatrix30 = realMatrixImpl25.add((org.apache.commons.math.linear.RealMatrix) realMatrixImpl29);
        double[] doubleArray33 = new double[] { 0, 1 };
        org.apache.commons.math.linear.RealMatrixImpl realMatrixImpl34 = new org.apache.commons.math.linear.RealMatrixImpl(doubleArray33);
        double[] doubleArray37 = new double[] { 0, 1 };
        org.apache.commons.math.linear.RealMatrixImpl realMatrixImpl38 = new org.apache.commons.math.linear.RealMatrixImpl(doubleArray37);
        org.apache.commons.math.linear.RealMatrix realMatrix39 = realMatrixImpl34.add((org.apache.commons.math.linear.RealMatrix) realMatrixImpl38);
        org.apache.commons.math.linear.RealMatrix realMatrix40 = realMatrixImpl29.subtract((org.apache.commons.math.linear.RealMatrix) realMatrixImpl38);
        double[] doubleArray43 = new double[] { 0, 1 };
        org.apache.commons.math.linear.RealMatrixImpl realMatrixImpl44 = new org.apache.commons.math.linear.RealMatrixImpl(doubleArray43);
        double[] doubleArray47 = new double[] { 0, 1 };
        org.apache.commons.math.linear.RealMatrixImpl realMatrixImpl48 = new org.apache.commons.math.linear.RealMatrixImpl(doubleArray47);
        org.apache.commons.math.linear.RealMatrix realMatrix49 = realMatrixImpl44.add((org.apache.commons.math.linear.RealMatrix) realMatrixImpl48);
        double[] doubleArray52 = new double[] { 10.0d, (short) -1 };
        double[] doubleArray53 = realMatrixImpl44.preMultiply(doubleArray52);
        org.apache.commons.math.linear.RealMatrixImpl realMatrixImpl54 = new org.apache.commons.math.linear.RealMatrixImpl(doubleArray52);
        double[] doubleArray55 = realMatrixImpl29.preMultiply(doubleArray52);
        double[] doubleArray56 = realMatrixImpl7.preMultiply(doubleArray52);
        double double57 = realMatrixImpl7.getNorm();
        int int58 = realMatrixImpl7.getColumnDimension();
        org.junit.Assert.assertNotNull(doubleArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray2), "[0.0, 1.0]");
        org.junit.Assert.assertNotNull(doubleArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray6), "[0.0, 1.0]");
        org.junit.Assert.assertNotNull(realMatrix8);
        org.junit.Assert.assertNotNull(doubleArray11);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray11), "[0.0, 1.0]");
        org.junit.Assert.assertNotNull(doubleArray15);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray15), "[0.0, 1.0]");
        org.junit.Assert.assertNotNull(realMatrix17);
        org.junit.Assert.assertNotNull(realMatrix18);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertTrue("'" + double20 + "' != '" + 1.0d + "'", double20 == 1.0d);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + true + "'", boolean21 == true);
        org.junit.Assert.assertNotNull(doubleArray24);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray24), "[0.0, 1.0]");
        org.junit.Assert.assertNotNull(doubleArray28);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray28), "[0.0, 1.0]");
        org.junit.Assert.assertNotNull(realMatrix30);
        org.junit.Assert.assertNotNull(doubleArray33);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray33), "[0.0, 1.0]");
        org.junit.Assert.assertNotNull(doubleArray37);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray37), "[0.0, 1.0]");
        org.junit.Assert.assertNotNull(realMatrix39);
        org.junit.Assert.assertNotNull(realMatrix40);
        org.junit.Assert.assertNotNull(doubleArray43);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray43), "[0.0, 1.0]");
        org.junit.Assert.assertNotNull(doubleArray47);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray47), "[0.0, 1.0]");
        org.junit.Assert.assertNotNull(realMatrix49);
        org.junit.Assert.assertNotNull(doubleArray52);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray52), "[10.0, -1.0]");
        org.junit.Assert.assertNotNull(doubleArray53);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray53), "[-1.0]");
        org.junit.Assert.assertNotNull(doubleArray55);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray55), "[-1.0]");
        org.junit.Assert.assertNotNull(doubleArray56);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray56), "[-1.0]");
        org.junit.Assert.assertTrue("'" + double57 + "' != '" + 1.0d + "'", double57 == 1.0d);
        org.junit.Assert.assertTrue("'" + int58 + "' != '" + 1 + "'", int58 == 1);
    }

    @Test
    public void test5063() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5063");
        double[] doubleArray2 = new double[] { 0, 1 };
        org.apache.commons.math.linear.RealMatrixImpl realMatrixImpl3 = new org.apache.commons.math.linear.RealMatrixImpl(doubleArray2);
        double[] doubleArray6 = new double[] { 0, 1 };
        org.apache.commons.math.linear.RealMatrixImpl realMatrixImpl7 = new org.apache.commons.math.linear.RealMatrixImpl(doubleArray6);
        org.apache.commons.math.linear.RealMatrix realMatrix8 = realMatrixImpl3.add((org.apache.commons.math.linear.RealMatrix) realMatrixImpl7);
        double[][] doubleArray9 = realMatrixImpl3.getData();
        org.apache.commons.math.linear.RealMatrixImpl realMatrixImpl10 = new org.apache.commons.math.linear.RealMatrixImpl(doubleArray9);
        double[] doubleArray13 = new double[] { 0, 1 };
        org.apache.commons.math.linear.RealMatrixImpl realMatrixImpl14 = new org.apache.commons.math.linear.RealMatrixImpl(doubleArray13);
        double[] doubleArray17 = new double[] { 0, 1 };
        org.apache.commons.math.linear.RealMatrixImpl realMatrixImpl18 = new org.apache.commons.math.linear.RealMatrixImpl(doubleArray17);
        org.apache.commons.math.linear.RealMatrix realMatrix19 = realMatrixImpl14.add((org.apache.commons.math.linear.RealMatrix) realMatrixImpl18);
        double[] doubleArray22 = new double[] { 0, 1 };
        org.apache.commons.math.linear.RealMatrixImpl realMatrixImpl23 = new org.apache.commons.math.linear.RealMatrixImpl(doubleArray22);
        double[] doubleArray26 = new double[] { 0, 1 };
        org.apache.commons.math.linear.RealMatrixImpl realMatrixImpl27 = new org.apache.commons.math.linear.RealMatrixImpl(doubleArray26);
        org.apache.commons.math.linear.RealMatrix realMatrix28 = realMatrixImpl23.add((org.apache.commons.math.linear.RealMatrix) realMatrixImpl27);
        org.apache.commons.math.linear.RealMatrix realMatrix29 = realMatrixImpl18.subtract((org.apache.commons.math.linear.RealMatrix) realMatrixImpl27);
        double[] doubleArray32 = new double[] { 0, 1 };
        org.apache.commons.math.linear.RealMatrixImpl realMatrixImpl33 = new org.apache.commons.math.linear.RealMatrixImpl(doubleArray32);
        double[] doubleArray36 = new double[] { 0, 1 };
        org.apache.commons.math.linear.RealMatrixImpl realMatrixImpl37 = new org.apache.commons.math.linear.RealMatrixImpl(doubleArray36);
        org.apache.commons.math.linear.RealMatrix realMatrix38 = realMatrixImpl33.add((org.apache.commons.math.linear.RealMatrix) realMatrixImpl37);
        double[] doubleArray41 = new double[] { 10.0d, (short) -1 };
        double[] doubleArray42 = realMatrixImpl33.preMultiply(doubleArray41);
        org.apache.commons.math.linear.RealMatrix realMatrix43 = realMatrixImpl27.subtract((org.apache.commons.math.linear.RealMatrix) realMatrixImpl33);
        double[] doubleArray46 = new double[] { 0, 1 };
        org.apache.commons.math.linear.RealMatrixImpl realMatrixImpl47 = new org.apache.commons.math.linear.RealMatrixImpl(doubleArray46);
        double[] doubleArray50 = new double[] { 0, 1 };
        org.apache.commons.math.linear.RealMatrixImpl realMatrixImpl51 = new org.apache.commons.math.linear.RealMatrixImpl(doubleArray50);
        org.apache.commons.math.linear.RealMatrix realMatrix52 = realMatrixImpl47.add((org.apache.commons.math.linear.RealMatrix) realMatrixImpl51);
        boolean boolean53 = realMatrixImpl47.isSquare();
        org.apache.commons.math.linear.RealMatrix realMatrix55 = realMatrixImpl47.scalarAdd((double) (short) -1);
        org.apache.commons.math.linear.RealMatrix realMatrix56 = realMatrixImpl33.subtract(realMatrix55);
        org.apache.commons.math.linear.RealMatrix realMatrix57 = realMatrixImpl10.subtract((org.apache.commons.math.linear.RealMatrix) realMatrixImpl33);
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math.linear.RealMatrix realMatrix58 = realMatrixImpl10.inverse();
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math.linear.InvalidMatrixException; message: coefficient matrix is not square");
        } catch (org.apache.commons.math.linear.InvalidMatrixException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(doubleArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray2), "[0.0, 1.0]");
        org.junit.Assert.assertNotNull(doubleArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray6), "[0.0, 1.0]");
        org.junit.Assert.assertNotNull(realMatrix8);
        org.junit.Assert.assertNotNull(doubleArray9);
        org.junit.Assert.assertNotNull(doubleArray13);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray13), "[0.0, 1.0]");
        org.junit.Assert.assertNotNull(doubleArray17);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray17), "[0.0, 1.0]");
        org.junit.Assert.assertNotNull(realMatrix19);
        org.junit.Assert.assertNotNull(doubleArray22);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray22), "[0.0, 1.0]");
        org.junit.Assert.assertNotNull(doubleArray26);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray26), "[0.0, 1.0]");
        org.junit.Assert.assertNotNull(realMatrix28);
        org.junit.Assert.assertNotNull(realMatrix29);
        org.junit.Assert.assertNotNull(doubleArray32);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray32), "[0.0, 1.0]");
        org.junit.Assert.assertNotNull(doubleArray36);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray36), "[0.0, 1.0]");
        org.junit.Assert.assertNotNull(realMatrix38);
        org.junit.Assert.assertNotNull(doubleArray41);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray41), "[10.0, -1.0]");
        org.junit.Assert.assertNotNull(doubleArray42);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray42), "[-1.0]");
        org.junit.Assert.assertNotNull(realMatrix43);
        org.junit.Assert.assertNotNull(doubleArray46);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray46), "[0.0, 1.0]");
        org.junit.Assert.assertNotNull(doubleArray50);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray50), "[0.0, 1.0]");
        org.junit.Assert.assertNotNull(realMatrix52);
        org.junit.Assert.assertTrue("'" + boolean53 + "' != '" + false + "'", boolean53 == false);
        org.junit.Assert.assertNotNull(realMatrix55);
        org.junit.Assert.assertNotNull(realMatrix56);
        org.junit.Assert.assertNotNull(realMatrix57);
    }

    @Test
    public void test5064() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5064");
        double[] doubleArray2 = new double[] { 0, 1 };
        org.apache.commons.math.linear.RealMatrixImpl realMatrixImpl3 = new org.apache.commons.math.linear.RealMatrixImpl(doubleArray2);
        double[] doubleArray6 = new double[] { 0, 1 };
        org.apache.commons.math.linear.RealMatrixImpl realMatrixImpl7 = new org.apache.commons.math.linear.RealMatrixImpl(doubleArray6);
        org.apache.commons.math.linear.RealMatrix realMatrix8 = realMatrixImpl3.add((org.apache.commons.math.linear.RealMatrix) realMatrixImpl7);
        boolean boolean9 = realMatrixImpl7.isSquare();
        double[] doubleArray12 = new double[] { 0, 1 };
        org.apache.commons.math.linear.RealMatrixImpl realMatrixImpl13 = new org.apache.commons.math.linear.RealMatrixImpl(doubleArray12);
        double[] doubleArray16 = new double[] { 0, 1 };
        org.apache.commons.math.linear.RealMatrixImpl realMatrixImpl17 = new org.apache.commons.math.linear.RealMatrixImpl(doubleArray16);
        org.apache.commons.math.linear.RealMatrix realMatrix18 = realMatrixImpl13.add((org.apache.commons.math.linear.RealMatrix) realMatrixImpl17);
        boolean boolean19 = realMatrixImpl13.isSquare();
        int int20 = realMatrixImpl13.getColumnDimension();
        double[] doubleArray23 = new double[] { 0, 1 };
        org.apache.commons.math.linear.RealMatrixImpl realMatrixImpl24 = new org.apache.commons.math.linear.RealMatrixImpl(doubleArray23);
        double[] doubleArray27 = new double[] { 0, 1 };
        org.apache.commons.math.linear.RealMatrixImpl realMatrixImpl28 = new org.apache.commons.math.linear.RealMatrixImpl(doubleArray27);
        org.apache.commons.math.linear.RealMatrix realMatrix29 = realMatrixImpl24.add((org.apache.commons.math.linear.RealMatrix) realMatrixImpl28);
        double[] doubleArray32 = new double[] { 10.0d, (short) -1 };
        double[] doubleArray33 = realMatrixImpl24.preMultiply(doubleArray32);
        org.apache.commons.math.linear.RealMatrixImpl realMatrixImpl34 = new org.apache.commons.math.linear.RealMatrixImpl(doubleArray32);
        double[] doubleArray35 = realMatrixImpl13.preMultiply(doubleArray32);
        org.apache.commons.math.linear.RealMatrixImpl realMatrixImpl36 = new org.apache.commons.math.linear.RealMatrixImpl(doubleArray32);
        double[] doubleArray37 = realMatrixImpl7.preMultiply(doubleArray32);
        org.apache.commons.math.linear.RealMatrixImpl realMatrixImpl38 = new org.apache.commons.math.linear.RealMatrixImpl(doubleArray32);
        org.apache.commons.math.linear.RealMatrix realMatrix40 = realMatrixImpl38.scalarMultiply(0.0d);
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math.linear.RealMatrix realMatrix41 = realMatrixImpl38.inverse();
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math.linear.InvalidMatrixException; message: coefficient matrix is not square");
        } catch (org.apache.commons.math.linear.InvalidMatrixException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(doubleArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray2), "[0.0, 1.0]");
        org.junit.Assert.assertNotNull(doubleArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray6), "[0.0, 1.0]");
        org.junit.Assert.assertNotNull(realMatrix8);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNotNull(doubleArray12);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray12), "[0.0, 1.0]");
        org.junit.Assert.assertNotNull(doubleArray16);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray16), "[0.0, 1.0]");
        org.junit.Assert.assertNotNull(realMatrix18);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 1 + "'", int20 == 1);
        org.junit.Assert.assertNotNull(doubleArray23);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray23), "[0.0, 1.0]");
        org.junit.Assert.assertNotNull(doubleArray27);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray27), "[0.0, 1.0]");
        org.junit.Assert.assertNotNull(realMatrix29);
        org.junit.Assert.assertNotNull(doubleArray32);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray32), "[10.0, -1.0]");
        org.junit.Assert.assertNotNull(doubleArray33);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray33), "[-1.0]");
        org.junit.Assert.assertNotNull(doubleArray35);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray35), "[-1.0]");
        org.junit.Assert.assertNotNull(doubleArray37);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray37), "[-1.0]");
        org.junit.Assert.assertNotNull(realMatrix40);
    }

    @Test
    public void test5065() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5065");
        double[] doubleArray2 = new double[] { 0, 1 };
        org.apache.commons.math.linear.RealMatrixImpl realMatrixImpl3 = new org.apache.commons.math.linear.RealMatrixImpl(doubleArray2);
        double[] doubleArray6 = new double[] { 0, 1 };
        org.apache.commons.math.linear.RealMatrixImpl realMatrixImpl7 = new org.apache.commons.math.linear.RealMatrixImpl(doubleArray6);
        org.apache.commons.math.linear.RealMatrix realMatrix8 = realMatrixImpl3.add((org.apache.commons.math.linear.RealMatrix) realMatrixImpl7);
        boolean boolean9 = realMatrixImpl3.isSquare();
        int int10 = realMatrixImpl3.getColumnDimension();
        double[] doubleArray13 = new double[] { 0, 1 };
        org.apache.commons.math.linear.RealMatrixImpl realMatrixImpl14 = new org.apache.commons.math.linear.RealMatrixImpl(doubleArray13);
        double[] doubleArray17 = new double[] { 0, 1 };
        org.apache.commons.math.linear.RealMatrixImpl realMatrixImpl18 = new org.apache.commons.math.linear.RealMatrixImpl(doubleArray17);
        org.apache.commons.math.linear.RealMatrix realMatrix19 = realMatrixImpl14.add((org.apache.commons.math.linear.RealMatrix) realMatrixImpl18);
        double[] doubleArray22 = new double[] { 10.0d, (short) -1 };
        double[] doubleArray23 = realMatrixImpl14.preMultiply(doubleArray22);
        org.apache.commons.math.linear.RealMatrixImpl realMatrixImpl24 = new org.apache.commons.math.linear.RealMatrixImpl(doubleArray22);
        double[] doubleArray25 = realMatrixImpl3.preMultiply(doubleArray22);
        boolean boolean26 = realMatrixImpl3.isSquare();
        double[][] doubleArray27 = realMatrixImpl3.getDataRef();
        double[] doubleArray30 = new double[] { 0, 1 };
        org.apache.commons.math.linear.RealMatrixImpl realMatrixImpl31 = new org.apache.commons.math.linear.RealMatrixImpl(doubleArray30);
        double[] doubleArray34 = new double[] { 0, 1 };
        org.apache.commons.math.linear.RealMatrixImpl realMatrixImpl35 = new org.apache.commons.math.linear.RealMatrixImpl(doubleArray34);
        org.apache.commons.math.linear.RealMatrix realMatrix36 = realMatrixImpl31.add((org.apache.commons.math.linear.RealMatrix) realMatrixImpl35);
        double[][] doubleArray37 = realMatrixImpl31.getData();
        org.apache.commons.math.linear.RealMatrixImpl realMatrixImpl38 = new org.apache.commons.math.linear.RealMatrixImpl(doubleArray37);
        org.apache.commons.math.linear.RealMatrix realMatrix39 = realMatrixImpl38.copy();
        boolean boolean40 = realMatrixImpl38.isSquare();
        org.apache.commons.math.linear.RealMatrix realMatrix41 = realMatrixImpl3.add((org.apache.commons.math.linear.RealMatrix) realMatrixImpl38);
        double[][] doubleArray42 = realMatrixImpl38.getData();
        org.apache.commons.math.linear.RealMatrix realMatrix43 = realMatrixImpl38.copy();
        // The following exception was thrown during execution in test generation
        try {
            double double44 = realMatrixImpl38.getTrace();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: matrix is not square");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(doubleArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray2), "[0.0, 1.0]");
        org.junit.Assert.assertNotNull(doubleArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray6), "[0.0, 1.0]");
        org.junit.Assert.assertNotNull(realMatrix8);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 1 + "'", int10 == 1);
        org.junit.Assert.assertNotNull(doubleArray13);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray13), "[0.0, 1.0]");
        org.junit.Assert.assertNotNull(doubleArray17);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray17), "[0.0, 1.0]");
        org.junit.Assert.assertNotNull(realMatrix19);
        org.junit.Assert.assertNotNull(doubleArray22);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray22), "[10.0, -1.0]");
        org.junit.Assert.assertNotNull(doubleArray23);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray23), "[-1.0]");
        org.junit.Assert.assertNotNull(doubleArray25);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray25), "[-1.0]");
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
        org.junit.Assert.assertNotNull(doubleArray27);
        org.junit.Assert.assertNotNull(doubleArray30);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray30), "[0.0, 1.0]");
        org.junit.Assert.assertNotNull(doubleArray34);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray34), "[0.0, 1.0]");
        org.junit.Assert.assertNotNull(realMatrix36);
        org.junit.Assert.assertNotNull(doubleArray37);
        org.junit.Assert.assertNotNull(realMatrix39);
        org.junit.Assert.assertTrue("'" + boolean40 + "' != '" + false + "'", boolean40 == false);
        org.junit.Assert.assertNotNull(realMatrix41);
        org.junit.Assert.assertNotNull(doubleArray42);
        org.junit.Assert.assertNotNull(realMatrix43);
    }

    @Test
    public void test5066() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5066");
        double[] doubleArray2 = new double[] { 0, 1 };
        org.apache.commons.math.linear.RealMatrixImpl realMatrixImpl3 = new org.apache.commons.math.linear.RealMatrixImpl(doubleArray2);
        double[] doubleArray6 = new double[] { 0, 1 };
        org.apache.commons.math.linear.RealMatrixImpl realMatrixImpl7 = new org.apache.commons.math.linear.RealMatrixImpl(doubleArray6);
        org.apache.commons.math.linear.RealMatrix realMatrix8 = realMatrixImpl3.add((org.apache.commons.math.linear.RealMatrix) realMatrixImpl7);
        double[] doubleArray11 = new double[] { 0, 1 };
        org.apache.commons.math.linear.RealMatrixImpl realMatrixImpl12 = new org.apache.commons.math.linear.RealMatrixImpl(doubleArray11);
        double[] doubleArray15 = new double[] { 0, 1 };
        org.apache.commons.math.linear.RealMatrixImpl realMatrixImpl16 = new org.apache.commons.math.linear.RealMatrixImpl(doubleArray15);
        org.apache.commons.math.linear.RealMatrix realMatrix17 = realMatrixImpl12.add((org.apache.commons.math.linear.RealMatrix) realMatrixImpl16);
        org.apache.commons.math.linear.RealMatrix realMatrix18 = realMatrixImpl7.subtract((org.apache.commons.math.linear.RealMatrix) realMatrixImpl16);
        double[] doubleArray21 = new double[] { 0, 1 };
        org.apache.commons.math.linear.RealMatrixImpl realMatrixImpl22 = new org.apache.commons.math.linear.RealMatrixImpl(doubleArray21);
        double[] doubleArray25 = new double[] { 0, 1 };
        org.apache.commons.math.linear.RealMatrixImpl realMatrixImpl26 = new org.apache.commons.math.linear.RealMatrixImpl(doubleArray25);
        org.apache.commons.math.linear.RealMatrix realMatrix27 = realMatrixImpl22.add((org.apache.commons.math.linear.RealMatrix) realMatrixImpl26);
        double[] doubleArray30 = new double[] { 10.0d, (short) -1 };
        double[] doubleArray31 = realMatrixImpl22.preMultiply(doubleArray30);
        org.apache.commons.math.linear.RealMatrix realMatrix32 = realMatrixImpl16.subtract((org.apache.commons.math.linear.RealMatrix) realMatrixImpl22);
        double[] doubleArray35 = new double[] { 0, 1 };
        org.apache.commons.math.linear.RealMatrixImpl realMatrixImpl36 = new org.apache.commons.math.linear.RealMatrixImpl(doubleArray35);
        double double37 = realMatrixImpl36.getNorm();
        org.apache.commons.math.linear.RealMatrix realMatrix38 = realMatrixImpl36.transpose();
        org.apache.commons.math.linear.RealMatrix realMatrix39 = realMatrixImpl16.add((org.apache.commons.math.linear.RealMatrix) realMatrixImpl36);
        double[] doubleArray42 = new double[] { 0, 1 };
        org.apache.commons.math.linear.RealMatrixImpl realMatrixImpl43 = new org.apache.commons.math.linear.RealMatrixImpl(doubleArray42);
        double[] doubleArray46 = new double[] { 0, 1 };
        org.apache.commons.math.linear.RealMatrixImpl realMatrixImpl47 = new org.apache.commons.math.linear.RealMatrixImpl(doubleArray46);
        org.apache.commons.math.linear.RealMatrix realMatrix48 = realMatrixImpl43.add((org.apache.commons.math.linear.RealMatrix) realMatrixImpl47);
        double[] doubleArray51 = new double[] { 10.0d, (short) -1 };
        double[] doubleArray52 = realMatrixImpl43.preMultiply(doubleArray51);
        org.apache.commons.math.linear.RealMatrixImpl realMatrixImpl53 = new org.apache.commons.math.linear.RealMatrixImpl(doubleArray51);
        boolean boolean54 = realMatrixImpl53.isSingular();
        double double55 = realMatrixImpl53.getNorm();
        int int56 = realMatrixImpl53.getColumnDimension();
        org.apache.commons.math.linear.RealMatrix realMatrix58 = realMatrixImpl53.scalarMultiply((double) 5);
        org.apache.commons.math.linear.RealMatrix realMatrix59 = realMatrixImpl36.add((org.apache.commons.math.linear.RealMatrix) realMatrixImpl53);
        org.apache.commons.math.linear.RealMatrix realMatrix61 = realMatrixImpl53.getRowMatrix(1);
        double[][] doubleArray62 = realMatrixImpl53.getDataRef();
        double[] doubleArray65 = new double[] { 0, 1 };
        org.apache.commons.math.linear.RealMatrixImpl realMatrixImpl66 = new org.apache.commons.math.linear.RealMatrixImpl(doubleArray65);
        double[] doubleArray69 = new double[] { 0, 1 };
        org.apache.commons.math.linear.RealMatrixImpl realMatrixImpl70 = new org.apache.commons.math.linear.RealMatrixImpl(doubleArray69);
        org.apache.commons.math.linear.RealMatrix realMatrix71 = realMatrixImpl66.add((org.apache.commons.math.linear.RealMatrix) realMatrixImpl70);
        double[] doubleArray74 = new double[] { 0, 1 };
        org.apache.commons.math.linear.RealMatrixImpl realMatrixImpl75 = new org.apache.commons.math.linear.RealMatrixImpl(doubleArray74);
        double[] doubleArray78 = new double[] { 0, 1 };
        org.apache.commons.math.linear.RealMatrixImpl realMatrixImpl79 = new org.apache.commons.math.linear.RealMatrixImpl(doubleArray78);
        org.apache.commons.math.linear.RealMatrix realMatrix80 = realMatrixImpl75.add((org.apache.commons.math.linear.RealMatrix) realMatrixImpl79);
        org.apache.commons.math.linear.RealMatrix realMatrix81 = realMatrixImpl70.subtract((org.apache.commons.math.linear.RealMatrix) realMatrixImpl79);
        boolean boolean82 = realMatrixImpl70.isSquare();
        double double83 = realMatrixImpl70.getNorm();
        boolean boolean84 = realMatrixImpl70.isSingular();
        org.apache.commons.math.linear.RealMatrix realMatrix85 = realMatrixImpl70.copy();
        org.apache.commons.math.linear.RealMatrix realMatrix86 = realMatrixImpl53.subtract((org.apache.commons.math.linear.RealMatrix) realMatrixImpl70);
        boolean boolean87 = realMatrixImpl53.isSquare();
        // The following exception was thrown during execution in test generation
        try {
            double double88 = realMatrixImpl53.getTrace();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: matrix is not square");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(doubleArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray2), "[0.0, 1.0]");
        org.junit.Assert.assertNotNull(doubleArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray6), "[0.0, 1.0]");
        org.junit.Assert.assertNotNull(realMatrix8);
        org.junit.Assert.assertNotNull(doubleArray11);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray11), "[0.0, 1.0]");
        org.junit.Assert.assertNotNull(doubleArray15);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray15), "[0.0, 1.0]");
        org.junit.Assert.assertNotNull(realMatrix17);
        org.junit.Assert.assertNotNull(realMatrix18);
        org.junit.Assert.assertNotNull(doubleArray21);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray21), "[0.0, 1.0]");
        org.junit.Assert.assertNotNull(doubleArray25);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray25), "[0.0, 1.0]");
        org.junit.Assert.assertNotNull(realMatrix27);
        org.junit.Assert.assertNotNull(doubleArray30);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray30), "[10.0, -1.0]");
        org.junit.Assert.assertNotNull(doubleArray31);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray31), "[-1.0]");
        org.junit.Assert.assertNotNull(realMatrix32);
        org.junit.Assert.assertNotNull(doubleArray35);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray35), "[0.0, 1.0]");
        org.junit.Assert.assertTrue("'" + double37 + "' != '" + 1.0d + "'", double37 == 1.0d);
        org.junit.Assert.assertNotNull(realMatrix38);
        org.junit.Assert.assertNotNull(realMatrix39);
        org.junit.Assert.assertNotNull(doubleArray42);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray42), "[0.0, 1.0]");
        org.junit.Assert.assertNotNull(doubleArray46);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray46), "[0.0, 1.0]");
        org.junit.Assert.assertNotNull(realMatrix48);
        org.junit.Assert.assertNotNull(doubleArray51);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray51), "[10.0, -1.0]");
        org.junit.Assert.assertNotNull(doubleArray52);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray52), "[-1.0]");
        org.junit.Assert.assertTrue("'" + boolean54 + "' != '" + true + "'", boolean54 == true);
        org.junit.Assert.assertTrue("'" + double55 + "' != '" + 11.0d + "'", double55 == 11.0d);
        org.junit.Assert.assertTrue("'" + int56 + "' != '" + 1 + "'", int56 == 1);
        org.junit.Assert.assertNotNull(realMatrix58);
        org.junit.Assert.assertNotNull(realMatrix59);
        org.junit.Assert.assertNotNull(realMatrix61);
        org.junit.Assert.assertNotNull(doubleArray62);
        org.junit.Assert.assertNotNull(doubleArray65);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray65), "[0.0, 1.0]");
        org.junit.Assert.assertNotNull(doubleArray69);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray69), "[0.0, 1.0]");
        org.junit.Assert.assertNotNull(realMatrix71);
        org.junit.Assert.assertNotNull(doubleArray74);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray74), "[0.0, 1.0]");
        org.junit.Assert.assertNotNull(doubleArray78);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray78), "[0.0, 1.0]");
        org.junit.Assert.assertNotNull(realMatrix80);
        org.junit.Assert.assertNotNull(realMatrix81);
        org.junit.Assert.assertTrue("'" + boolean82 + "' != '" + false + "'", boolean82 == false);
        org.junit.Assert.assertTrue("'" + double83 + "' != '" + 1.0d + "'", double83 == 1.0d);
        org.junit.Assert.assertTrue("'" + boolean84 + "' != '" + true + "'", boolean84 == true);
        org.junit.Assert.assertNotNull(realMatrix85);
        org.junit.Assert.assertNotNull(realMatrix86);
        org.junit.Assert.assertTrue("'" + boolean87 + "' != '" + false + "'", boolean87 == false);
    }

    @Test
    public void test5067() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5067");
        double[] doubleArray2 = new double[] { 0, 1 };
        org.apache.commons.math.linear.RealMatrixImpl realMatrixImpl3 = new org.apache.commons.math.linear.RealMatrixImpl(doubleArray2);
        double double4 = realMatrixImpl3.getNorm();
        double[] doubleArray7 = new double[] { 0, 1 };
        org.apache.commons.math.linear.RealMatrixImpl realMatrixImpl8 = new org.apache.commons.math.linear.RealMatrixImpl(doubleArray7);
        double double9 = realMatrixImpl8.getNorm();
        org.apache.commons.math.linear.RealMatrix realMatrix10 = realMatrixImpl8.transpose();
        double[] doubleArray12 = realMatrixImpl8.getColumn(0);
        double[] doubleArray13 = realMatrixImpl3.preMultiply(doubleArray12);
        org.apache.commons.math.linear.RealMatrixImpl realMatrixImpl14 = new org.apache.commons.math.linear.RealMatrixImpl(doubleArray12);
        org.apache.commons.math.linear.RealMatrix realMatrix15 = realMatrixImpl14.transpose();
        double[] doubleArray18 = new double[] { 0, 1 };
        org.apache.commons.math.linear.RealMatrixImpl realMatrixImpl19 = new org.apache.commons.math.linear.RealMatrixImpl(doubleArray18);
        org.apache.commons.math.linear.RealMatrix realMatrix21 = realMatrixImpl19.scalarMultiply((double) (short) 100);
        java.lang.String str22 = realMatrixImpl19.toString();
        double[] doubleArray25 = new double[] { 0, 1 };
        org.apache.commons.math.linear.RealMatrixImpl realMatrixImpl26 = new org.apache.commons.math.linear.RealMatrixImpl(doubleArray25);
        org.apache.commons.math.linear.RealMatrix realMatrix28 = realMatrixImpl26.scalarMultiply((double) (short) 100);
        org.apache.commons.math.linear.RealMatrix realMatrix29 = realMatrixImpl19.subtract((org.apache.commons.math.linear.RealMatrix) realMatrixImpl26);
        org.apache.commons.math.linear.RealMatrix realMatrix31 = realMatrixImpl19.scalarMultiply(12.0d);
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math.linear.RealMatrix realMatrix32 = realMatrixImpl14.multiply((org.apache.commons.math.linear.RealMatrix) realMatrixImpl19);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Matrices are not multiplication compatible.");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(doubleArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray2), "[0.0, 1.0]");
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 1.0d + "'", double4 == 1.0d);
        org.junit.Assert.assertNotNull(doubleArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray7), "[0.0, 1.0]");
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 1.0d + "'", double9 == 1.0d);
        org.junit.Assert.assertNotNull(realMatrix10);
        org.junit.Assert.assertNotNull(doubleArray12);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray12), "[0.0, 1.0]");
        org.junit.Assert.assertNotNull(doubleArray13);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray13), "[1.0]");
        org.junit.Assert.assertNotNull(realMatrix15);
        org.junit.Assert.assertNotNull(doubleArray18);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray18), "[0.0, 1.0]");
        org.junit.Assert.assertNotNull(realMatrix21);
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "RealMatrixImpl{{0.0},{1.0}}" + "'", str22, "RealMatrixImpl{{0.0},{1.0}}");
        org.junit.Assert.assertNotNull(doubleArray25);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray25), "[0.0, 1.0]");
        org.junit.Assert.assertNotNull(realMatrix28);
        org.junit.Assert.assertNotNull(realMatrix29);
        org.junit.Assert.assertNotNull(realMatrix31);
    }

    @Test
    public void test5068() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5068");
        double[] doubleArray2 = new double[] { 0, 1 };
        org.apache.commons.math.linear.RealMatrixImpl realMatrixImpl3 = new org.apache.commons.math.linear.RealMatrixImpl(doubleArray2);
        double[] doubleArray6 = new double[] { 0, 1 };
        org.apache.commons.math.linear.RealMatrixImpl realMatrixImpl7 = new org.apache.commons.math.linear.RealMatrixImpl(doubleArray6);
        org.apache.commons.math.linear.RealMatrix realMatrix8 = realMatrixImpl3.add((org.apache.commons.math.linear.RealMatrix) realMatrixImpl7);
        double[] doubleArray11 = new double[] { 0, 1 };
        org.apache.commons.math.linear.RealMatrixImpl realMatrixImpl12 = new org.apache.commons.math.linear.RealMatrixImpl(doubleArray11);
        double[] doubleArray15 = new double[] { 0, 1 };
        org.apache.commons.math.linear.RealMatrixImpl realMatrixImpl16 = new org.apache.commons.math.linear.RealMatrixImpl(doubleArray15);
        org.apache.commons.math.linear.RealMatrix realMatrix17 = realMatrixImpl12.add((org.apache.commons.math.linear.RealMatrix) realMatrixImpl16);
        org.apache.commons.math.linear.RealMatrix realMatrix18 = realMatrixImpl7.subtract((org.apache.commons.math.linear.RealMatrix) realMatrixImpl16);
        double[] doubleArray21 = new double[] { 0, 1 };
        org.apache.commons.math.linear.RealMatrixImpl realMatrixImpl22 = new org.apache.commons.math.linear.RealMatrixImpl(doubleArray21);
        double[] doubleArray25 = new double[] { 0, 1 };
        org.apache.commons.math.linear.RealMatrixImpl realMatrixImpl26 = new org.apache.commons.math.linear.RealMatrixImpl(doubleArray25);
        org.apache.commons.math.linear.RealMatrix realMatrix27 = realMatrixImpl22.add((org.apache.commons.math.linear.RealMatrix) realMatrixImpl26);
        double[] doubleArray30 = new double[] { 10.0d, (short) -1 };
        double[] doubleArray31 = realMatrixImpl22.preMultiply(doubleArray30);
        org.apache.commons.math.linear.RealMatrix realMatrix32 = realMatrixImpl16.subtract((org.apache.commons.math.linear.RealMatrix) realMatrixImpl22);
        double[] doubleArray35 = new double[] { 0, 1 };
        org.apache.commons.math.linear.RealMatrixImpl realMatrixImpl36 = new org.apache.commons.math.linear.RealMatrixImpl(doubleArray35);
        double double37 = realMatrixImpl36.getNorm();
        org.apache.commons.math.linear.RealMatrix realMatrix38 = realMatrixImpl36.transpose();
        org.apache.commons.math.linear.RealMatrix realMatrix39 = realMatrixImpl16.add((org.apache.commons.math.linear.RealMatrix) realMatrixImpl36);
        org.apache.commons.math.linear.RealMatrix realMatrix40 = realMatrixImpl16.transpose();
        double[][] doubleArray41 = realMatrixImpl16.getDataRef();
        org.apache.commons.math.linear.RealMatrix realMatrix43 = realMatrixImpl16.scalarMultiply((double) (short) 10);
        org.junit.Assert.assertNotNull(doubleArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray2), "[0.0, 1.0]");
        org.junit.Assert.assertNotNull(doubleArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray6), "[0.0, 1.0]");
        org.junit.Assert.assertNotNull(realMatrix8);
        org.junit.Assert.assertNotNull(doubleArray11);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray11), "[0.0, 1.0]");
        org.junit.Assert.assertNotNull(doubleArray15);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray15), "[0.0, 1.0]");
        org.junit.Assert.assertNotNull(realMatrix17);
        org.junit.Assert.assertNotNull(realMatrix18);
        org.junit.Assert.assertNotNull(doubleArray21);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray21), "[0.0, 1.0]");
        org.junit.Assert.assertNotNull(doubleArray25);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray25), "[0.0, 1.0]");
        org.junit.Assert.assertNotNull(realMatrix27);
        org.junit.Assert.assertNotNull(doubleArray30);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray30), "[10.0, -1.0]");
        org.junit.Assert.assertNotNull(doubleArray31);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray31), "[-1.0]");
        org.junit.Assert.assertNotNull(realMatrix32);
        org.junit.Assert.assertNotNull(doubleArray35);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray35), "[0.0, 1.0]");
        org.junit.Assert.assertTrue("'" + double37 + "' != '" + 1.0d + "'", double37 == 1.0d);
        org.junit.Assert.assertNotNull(realMatrix38);
        org.junit.Assert.assertNotNull(realMatrix39);
        org.junit.Assert.assertNotNull(realMatrix40);
        org.junit.Assert.assertNotNull(doubleArray41);
        org.junit.Assert.assertNotNull(realMatrix43);
    }

    @Test
    public void test5069() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5069");
        double[] doubleArray5 = new double[] { (-1L), 100.0d, 1.0f, 10L, (-1.0f) };
        double[] doubleArray11 = new double[] { (-1L), 100.0d, 1.0f, 10L, (-1.0f) };
        double[] doubleArray17 = new double[] { (-1L), 100.0d, 1.0f, 10L, (-1.0f) };
        double[][] doubleArray18 = new double[][] { doubleArray5, doubleArray11, doubleArray17 };
        org.apache.commons.math.linear.RealMatrixImpl realMatrixImpl19 = new org.apache.commons.math.linear.RealMatrixImpl(doubleArray18);
        org.apache.commons.math.linear.RealMatrixImpl realMatrixImpl20 = new org.apache.commons.math.linear.RealMatrixImpl(doubleArray18);
        java.lang.String str21 = realMatrixImpl20.toString();
        boolean boolean22 = realMatrixImpl20.isSquare();
        java.lang.String str23 = realMatrixImpl20.toString();
        boolean boolean24 = realMatrixImpl20.isSquare();
        org.junit.Assert.assertNotNull(doubleArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray5), "[-1.0, 100.0, 1.0, 10.0, -1.0]");
        org.junit.Assert.assertNotNull(doubleArray11);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray11), "[-1.0, 100.0, 1.0, 10.0, -1.0]");
        org.junit.Assert.assertNotNull(doubleArray17);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray17), "[-1.0, 100.0, 1.0, 10.0, -1.0]");
        org.junit.Assert.assertNotNull(doubleArray18);
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "RealMatrixImpl{{-1.0,100.0,1.0,10.0,-1.0},{-1.0,100.0,1.0,10.0,-1.0},{-1.0,100.0,1.0,10.0,-1.0}}" + "'", str21, "RealMatrixImpl{{-1.0,100.0,1.0,10.0,-1.0},{-1.0,100.0,1.0,10.0,-1.0},{-1.0,100.0,1.0,10.0,-1.0}}");
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "RealMatrixImpl{{-1.0,100.0,1.0,10.0,-1.0},{-1.0,100.0,1.0,10.0,-1.0},{-1.0,100.0,1.0,10.0,-1.0}}" + "'", str23, "RealMatrixImpl{{-1.0,100.0,1.0,10.0,-1.0},{-1.0,100.0,1.0,10.0,-1.0},{-1.0,100.0,1.0,10.0,-1.0}}");
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
    }

    @Test
    public void test5070() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5070");
        double[] doubleArray2 = new double[] { 0, 1 };
        org.apache.commons.math.linear.RealMatrixImpl realMatrixImpl3 = new org.apache.commons.math.linear.RealMatrixImpl(doubleArray2);
        double double4 = realMatrixImpl3.getNorm();
        boolean boolean5 = realMatrixImpl3.isSingular();
        int int6 = realMatrixImpl3.getColumnDimension();
        double[][] doubleArray7 = realMatrixImpl3.getDataRef();
        double[][] doubleArray8 = realMatrixImpl3.getDataRef();
        org.apache.commons.math.linear.RealMatrixImpl realMatrixImpl9 = new org.apache.commons.math.linear.RealMatrixImpl(doubleArray8);
        double[][] doubleArray10 = realMatrixImpl9.getData();
        int int11 = realMatrixImpl9.getColumnDimension();
        org.junit.Assert.assertNotNull(doubleArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray2), "[0.0, 1.0]");
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 1.0d + "'", double4 == 1.0d);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
        org.junit.Assert.assertNotNull(doubleArray7);
        org.junit.Assert.assertNotNull(doubleArray8);
        org.junit.Assert.assertNotNull(doubleArray10);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 1 + "'", int11 == 1);
    }

    @Test
    public void test5071() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5071");
        double[] doubleArray5 = new double[] { (-1L), 100.0d, 1.0f, 10L, (-1.0f) };
        double[] doubleArray11 = new double[] { (-1L), 100.0d, 1.0f, 10L, (-1.0f) };
        double[] doubleArray17 = new double[] { (-1L), 100.0d, 1.0f, 10L, (-1.0f) };
        double[][] doubleArray18 = new double[][] { doubleArray5, doubleArray11, doubleArray17 };
        org.apache.commons.math.linear.RealMatrixImpl realMatrixImpl19 = new org.apache.commons.math.linear.RealMatrixImpl(doubleArray18);
        boolean boolean20 = realMatrixImpl19.isSingular();
        java.lang.String str21 = realMatrixImpl19.toString();
        org.apache.commons.math.linear.RealMatrix realMatrix22 = realMatrixImpl19.transpose();
        java.lang.String str23 = realMatrixImpl19.toString();
        double double24 = realMatrixImpl19.getNorm();
        // The following exception was thrown during execution in test generation
        try {
            double double25 = realMatrixImpl19.getTrace();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: matrix is not square");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(doubleArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray5), "[-1.0, 100.0, 1.0, 10.0, -1.0]");
        org.junit.Assert.assertNotNull(doubleArray11);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray11), "[-1.0, 100.0, 1.0, 10.0, -1.0]");
        org.junit.Assert.assertNotNull(doubleArray17);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray17), "[-1.0, 100.0, 1.0, 10.0, -1.0]");
        org.junit.Assert.assertNotNull(doubleArray18);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + true + "'", boolean20 == true);
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "RealMatrixImpl{{-1.0,100.0,1.0,10.0,-1.0},{-1.0,100.0,1.0,10.0,-1.0},{-1.0,100.0,1.0,10.0,-1.0}}" + "'", str21, "RealMatrixImpl{{-1.0,100.0,1.0,10.0,-1.0},{-1.0,100.0,1.0,10.0,-1.0},{-1.0,100.0,1.0,10.0,-1.0}}");
        org.junit.Assert.assertNotNull(realMatrix22);
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "RealMatrixImpl{{-1.0,100.0,1.0,10.0,-1.0},{-1.0,100.0,1.0,10.0,-1.0},{-1.0,100.0,1.0,10.0,-1.0}}" + "'", str23, "RealMatrixImpl{{-1.0,100.0,1.0,10.0,-1.0},{-1.0,100.0,1.0,10.0,-1.0},{-1.0,100.0,1.0,10.0,-1.0}}");
        org.junit.Assert.assertTrue("'" + double24 + "' != '" + 300.0d + "'", double24 == 300.0d);
    }

    @Test
    public void test5072() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5072");
        double[] doubleArray2 = new double[] { 0, 1 };
        org.apache.commons.math.linear.RealMatrixImpl realMatrixImpl3 = new org.apache.commons.math.linear.RealMatrixImpl(doubleArray2);
        double[] doubleArray6 = new double[] { 0, 1 };
        org.apache.commons.math.linear.RealMatrixImpl realMatrixImpl7 = new org.apache.commons.math.linear.RealMatrixImpl(doubleArray6);
        org.apache.commons.math.linear.RealMatrix realMatrix8 = realMatrixImpl3.add((org.apache.commons.math.linear.RealMatrix) realMatrixImpl7);
        double[] doubleArray11 = new double[] { 10.0d, (short) -1 };
        double[] doubleArray12 = realMatrixImpl3.preMultiply(doubleArray11);
        org.apache.commons.math.linear.RealMatrixImpl realMatrixImpl13 = new org.apache.commons.math.linear.RealMatrixImpl(doubleArray11);
        java.lang.String str14 = realMatrixImpl13.toString();
        double[] doubleArray17 = new double[] { 0, 1 };
        org.apache.commons.math.linear.RealMatrixImpl realMatrixImpl18 = new org.apache.commons.math.linear.RealMatrixImpl(doubleArray17);
        org.apache.commons.math.linear.RealMatrix realMatrix20 = realMatrixImpl18.scalarMultiply((double) (short) 100);
        double[][] doubleArray21 = realMatrixImpl18.getDataRef();
        org.apache.commons.math.linear.RealMatrix realMatrix22 = realMatrixImpl13.subtract((org.apache.commons.math.linear.RealMatrix) realMatrixImpl18);
        org.apache.commons.math.linear.RealMatrixImpl realMatrixImpl25 = new org.apache.commons.math.linear.RealMatrixImpl(3, (int) (short) 1);
        double[] doubleArray28 = new double[] { 0, 1 };
        org.apache.commons.math.linear.RealMatrixImpl realMatrixImpl29 = new org.apache.commons.math.linear.RealMatrixImpl(doubleArray28);
        double[] doubleArray32 = new double[] { 0, 1 };
        org.apache.commons.math.linear.RealMatrixImpl realMatrixImpl33 = new org.apache.commons.math.linear.RealMatrixImpl(doubleArray32);
        org.apache.commons.math.linear.RealMatrix realMatrix34 = realMatrixImpl29.add((org.apache.commons.math.linear.RealMatrix) realMatrixImpl33);
        double[] doubleArray37 = new double[] { 10.0d, (short) -1 };
        double[] doubleArray38 = realMatrixImpl29.preMultiply(doubleArray37);
        org.apache.commons.math.linear.RealMatrixImpl realMatrixImpl39 = new org.apache.commons.math.linear.RealMatrixImpl(doubleArray37);
        boolean boolean40 = realMatrixImpl39.isSingular();
        double[][] doubleArray41 = realMatrixImpl39.getDataRef();
        org.apache.commons.math.linear.RealMatrixImpl realMatrixImpl42 = new org.apache.commons.math.linear.RealMatrixImpl(doubleArray41);
        boolean boolean43 = realMatrixImpl25.equals((java.lang.Object) realMatrixImpl42);
        org.apache.commons.math.linear.RealMatrix realMatrix45 = realMatrixImpl25.scalarAdd((double) 10L);
        boolean boolean46 = realMatrixImpl18.equals((java.lang.Object) 10L);
        java.lang.Object obj47 = null;
        boolean boolean48 = realMatrixImpl18.equals(obj47);
        double[][] doubleArray49 = realMatrixImpl18.getDataRef();
        org.junit.Assert.assertNotNull(doubleArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray2), "[0.0, 1.0]");
        org.junit.Assert.assertNotNull(doubleArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray6), "[0.0, 1.0]");
        org.junit.Assert.assertNotNull(realMatrix8);
        org.junit.Assert.assertNotNull(doubleArray11);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray11), "[10.0, -1.0]");
        org.junit.Assert.assertNotNull(doubleArray12);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray12), "[-1.0]");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "RealMatrixImpl{{10.0},{-1.0}}" + "'", str14, "RealMatrixImpl{{10.0},{-1.0}}");
        org.junit.Assert.assertNotNull(doubleArray17);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray17), "[0.0, 1.0]");
        org.junit.Assert.assertNotNull(realMatrix20);
        org.junit.Assert.assertNotNull(doubleArray21);
        org.junit.Assert.assertNotNull(realMatrix22);
        org.junit.Assert.assertNotNull(doubleArray28);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray28), "[0.0, 1.0]");
        org.junit.Assert.assertNotNull(doubleArray32);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray32), "[0.0, 1.0]");
        org.junit.Assert.assertNotNull(realMatrix34);
        org.junit.Assert.assertNotNull(doubleArray37);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray37), "[10.0, -1.0]");
        org.junit.Assert.assertNotNull(doubleArray38);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray38), "[-1.0]");
        org.junit.Assert.assertTrue("'" + boolean40 + "' != '" + true + "'", boolean40 == true);
        org.junit.Assert.assertNotNull(doubleArray41);
        org.junit.Assert.assertTrue("'" + boolean43 + "' != '" + false + "'", boolean43 == false);
        org.junit.Assert.assertNotNull(realMatrix45);
        org.junit.Assert.assertTrue("'" + boolean46 + "' != '" + false + "'", boolean46 == false);
        org.junit.Assert.assertTrue("'" + boolean48 + "' != '" + false + "'", boolean48 == false);
        org.junit.Assert.assertNotNull(doubleArray49);
    }

    @Test
    public void test5073() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5073");
        double[] doubleArray2 = new double[] { 0, 1 };
        org.apache.commons.math.linear.RealMatrixImpl realMatrixImpl3 = new org.apache.commons.math.linear.RealMatrixImpl(doubleArray2);
        double[] doubleArray6 = new double[] { 0, 1 };
        org.apache.commons.math.linear.RealMatrixImpl realMatrixImpl7 = new org.apache.commons.math.linear.RealMatrixImpl(doubleArray6);
        org.apache.commons.math.linear.RealMatrix realMatrix8 = realMatrixImpl3.add((org.apache.commons.math.linear.RealMatrix) realMatrixImpl7);
        double[][] doubleArray9 = realMatrixImpl3.getData();
        org.apache.commons.math.linear.RealMatrix realMatrix11 = realMatrixImpl3.scalarMultiply((double) (byte) 100);
        double[] doubleArray14 = new double[] { 0, 1 };
        org.apache.commons.math.linear.RealMatrixImpl realMatrixImpl15 = new org.apache.commons.math.linear.RealMatrixImpl(doubleArray14);
        double[] doubleArray18 = new double[] { 0, 1 };
        org.apache.commons.math.linear.RealMatrixImpl realMatrixImpl19 = new org.apache.commons.math.linear.RealMatrixImpl(doubleArray18);
        org.apache.commons.math.linear.RealMatrix realMatrix20 = realMatrixImpl15.add((org.apache.commons.math.linear.RealMatrix) realMatrixImpl19);
        double[] doubleArray23 = new double[] { 10.0d, (short) -1 };
        double[] doubleArray24 = realMatrixImpl15.preMultiply(doubleArray23);
        org.apache.commons.math.linear.RealMatrixImpl realMatrixImpl25 = new org.apache.commons.math.linear.RealMatrixImpl(doubleArray23);
        boolean boolean26 = realMatrixImpl25.isSingular();
        double double27 = realMatrixImpl25.getNorm();
        double[] doubleArray30 = new double[] { 0, 1 };
        org.apache.commons.math.linear.RealMatrixImpl realMatrixImpl31 = new org.apache.commons.math.linear.RealMatrixImpl(doubleArray30);
        double[] doubleArray34 = new double[] { 0, 1 };
        org.apache.commons.math.linear.RealMatrixImpl realMatrixImpl35 = new org.apache.commons.math.linear.RealMatrixImpl(doubleArray34);
        org.apache.commons.math.linear.RealMatrix realMatrix36 = realMatrixImpl31.add((org.apache.commons.math.linear.RealMatrix) realMatrixImpl35);
        double[] doubleArray39 = new double[] { 0, 1 };
        org.apache.commons.math.linear.RealMatrixImpl realMatrixImpl40 = new org.apache.commons.math.linear.RealMatrixImpl(doubleArray39);
        double[] doubleArray43 = new double[] { 0, 1 };
        org.apache.commons.math.linear.RealMatrixImpl realMatrixImpl44 = new org.apache.commons.math.linear.RealMatrixImpl(doubleArray43);
        org.apache.commons.math.linear.RealMatrix realMatrix45 = realMatrixImpl40.add((org.apache.commons.math.linear.RealMatrix) realMatrixImpl44);
        org.apache.commons.math.linear.RealMatrix realMatrix46 = realMatrixImpl35.subtract((org.apache.commons.math.linear.RealMatrix) realMatrixImpl44);
        org.apache.commons.math.linear.RealMatrix realMatrix47 = realMatrixImpl25.subtract((org.apache.commons.math.linear.RealMatrix) realMatrixImpl44);
        org.apache.commons.math.linear.RealMatrix realMatrix48 = realMatrixImpl3.subtract((org.apache.commons.math.linear.RealMatrix) realMatrixImpl44);
        org.apache.commons.math.linear.RealMatrixImpl realMatrixImpl51 = new org.apache.commons.math.linear.RealMatrixImpl(5, 10);
        double double52 = realMatrixImpl51.getNorm();
        boolean boolean53 = realMatrixImpl51.isSquare();
        double[] doubleArray56 = new double[] { 0, 1 };
        org.apache.commons.math.linear.RealMatrixImpl realMatrixImpl57 = new org.apache.commons.math.linear.RealMatrixImpl(doubleArray56);
        double[] doubleArray60 = new double[] { 0, 1 };
        org.apache.commons.math.linear.RealMatrixImpl realMatrixImpl61 = new org.apache.commons.math.linear.RealMatrixImpl(doubleArray60);
        org.apache.commons.math.linear.RealMatrix realMatrix62 = realMatrixImpl57.add((org.apache.commons.math.linear.RealMatrix) realMatrixImpl61);
        boolean boolean63 = realMatrixImpl57.isSquare();
        int int64 = realMatrixImpl57.getColumnDimension();
        double[] doubleArray67 = new double[] { 0, 1 };
        org.apache.commons.math.linear.RealMatrixImpl realMatrixImpl68 = new org.apache.commons.math.linear.RealMatrixImpl(doubleArray67);
        double[] doubleArray71 = new double[] { 0, 1 };
        org.apache.commons.math.linear.RealMatrixImpl realMatrixImpl72 = new org.apache.commons.math.linear.RealMatrixImpl(doubleArray71);
        org.apache.commons.math.linear.RealMatrix realMatrix73 = realMatrixImpl68.add((org.apache.commons.math.linear.RealMatrix) realMatrixImpl72);
        double[] doubleArray76 = new double[] { 10.0d, (short) -1 };
        double[] doubleArray77 = realMatrixImpl68.preMultiply(doubleArray76);
        org.apache.commons.math.linear.RealMatrixImpl realMatrixImpl78 = new org.apache.commons.math.linear.RealMatrixImpl(doubleArray76);
        double[] doubleArray79 = realMatrixImpl57.preMultiply(doubleArray76);
        org.apache.commons.math.linear.RealMatrixImpl realMatrixImpl80 = new org.apache.commons.math.linear.RealMatrixImpl(doubleArray76);
        org.apache.commons.math.linear.RealMatrix realMatrix82 = realMatrixImpl80.scalarMultiply((double) 100.0f);
        boolean boolean83 = realMatrixImpl51.equals((java.lang.Object) realMatrixImpl80);
        boolean boolean84 = realMatrixImpl51.isSquare();
        boolean boolean85 = realMatrixImpl51.isSingular();
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math.linear.RealMatrix realMatrix86 = realMatrixImpl44.multiply((org.apache.commons.math.linear.RealMatrix) realMatrixImpl51);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Matrices are not multiplication compatible.");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(doubleArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray2), "[0.0, 1.0]");
        org.junit.Assert.assertNotNull(doubleArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray6), "[0.0, 1.0]");
        org.junit.Assert.assertNotNull(realMatrix8);
        org.junit.Assert.assertNotNull(doubleArray9);
        org.junit.Assert.assertNotNull(realMatrix11);
        org.junit.Assert.assertNotNull(doubleArray14);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray14), "[0.0, 1.0]");
        org.junit.Assert.assertNotNull(doubleArray18);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray18), "[0.0, 1.0]");
        org.junit.Assert.assertNotNull(realMatrix20);
        org.junit.Assert.assertNotNull(doubleArray23);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray23), "[10.0, -1.0]");
        org.junit.Assert.assertNotNull(doubleArray24);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray24), "[-1.0]");
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + true + "'", boolean26 == true);
        org.junit.Assert.assertTrue("'" + double27 + "' != '" + 11.0d + "'", double27 == 11.0d);
        org.junit.Assert.assertNotNull(doubleArray30);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray30), "[0.0, 1.0]");
        org.junit.Assert.assertNotNull(doubleArray34);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray34), "[0.0, 1.0]");
        org.junit.Assert.assertNotNull(realMatrix36);
        org.junit.Assert.assertNotNull(doubleArray39);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray39), "[0.0, 1.0]");
        org.junit.Assert.assertNotNull(doubleArray43);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray43), "[0.0, 1.0]");
        org.junit.Assert.assertNotNull(realMatrix45);
        org.junit.Assert.assertNotNull(realMatrix46);
        org.junit.Assert.assertNotNull(realMatrix47);
        org.junit.Assert.assertNotNull(realMatrix48);
        org.junit.Assert.assertTrue("'" + double52 + "' != '" + 0.0d + "'", double52 == 0.0d);
        org.junit.Assert.assertTrue("'" + boolean53 + "' != '" + false + "'", boolean53 == false);
        org.junit.Assert.assertNotNull(doubleArray56);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray56), "[0.0, 1.0]");
        org.junit.Assert.assertNotNull(doubleArray60);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray60), "[0.0, 1.0]");
        org.junit.Assert.assertNotNull(realMatrix62);
        org.junit.Assert.assertTrue("'" + boolean63 + "' != '" + false + "'", boolean63 == false);
        org.junit.Assert.assertTrue("'" + int64 + "' != '" + 1 + "'", int64 == 1);
        org.junit.Assert.assertNotNull(doubleArray67);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray67), "[0.0, 1.0]");
        org.junit.Assert.assertNotNull(doubleArray71);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray71), "[0.0, 1.0]");
        org.junit.Assert.assertNotNull(realMatrix73);
        org.junit.Assert.assertNotNull(doubleArray76);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray76), "[10.0, -1.0]");
        org.junit.Assert.assertNotNull(doubleArray77);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray77), "[-1.0]");
        org.junit.Assert.assertNotNull(doubleArray79);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray79), "[-1.0]");
        org.junit.Assert.assertNotNull(realMatrix82);
        org.junit.Assert.assertTrue("'" + boolean83 + "' != '" + false + "'", boolean83 == false);
        org.junit.Assert.assertTrue("'" + boolean84 + "' != '" + false + "'", boolean84 == false);
        org.junit.Assert.assertTrue("'" + boolean85 + "' != '" + true + "'", boolean85 == true);
    }
}

