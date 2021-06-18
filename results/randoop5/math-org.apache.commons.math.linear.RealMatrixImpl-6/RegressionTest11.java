import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class RegressionTest11 {

    public static boolean debug = false;

    @Test
    public void test5501() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5501");
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
        double[][] doubleArray36 = realMatrixImpl34.getDataRef();
        org.apache.commons.math.linear.RealMatrix realMatrix38 = realMatrixImpl34.getRowMatrix((int) (short) 0);
        org.apache.commons.math.linear.RealMatrix realMatrix40 = realMatrixImpl34.scalarAdd((double) '#');
        double[] doubleArray43 = new double[] { 0, 1 };
        org.apache.commons.math.linear.RealMatrixImpl realMatrixImpl44 = new org.apache.commons.math.linear.RealMatrixImpl(doubleArray43);
        double[] doubleArray47 = new double[] { 0, 1 };
        org.apache.commons.math.linear.RealMatrixImpl realMatrixImpl48 = new org.apache.commons.math.linear.RealMatrixImpl(doubleArray47);
        org.apache.commons.math.linear.RealMatrix realMatrix49 = realMatrixImpl44.add((org.apache.commons.math.linear.RealMatrix) realMatrixImpl48);
        double[] doubleArray52 = new double[] { 10.0d, (short) -1 };
        double[] doubleArray53 = realMatrixImpl44.preMultiply(doubleArray52);
        org.apache.commons.math.linear.RealMatrixImpl realMatrixImpl54 = new org.apache.commons.math.linear.RealMatrixImpl(doubleArray53);
        boolean boolean55 = realMatrixImpl54.isSquare();
        double[] doubleArray58 = new double[] { 0, 1 };
        org.apache.commons.math.linear.RealMatrixImpl realMatrixImpl59 = new org.apache.commons.math.linear.RealMatrixImpl(doubleArray58);
        double[] doubleArray62 = new double[] { 0, 1 };
        org.apache.commons.math.linear.RealMatrixImpl realMatrixImpl63 = new org.apache.commons.math.linear.RealMatrixImpl(doubleArray62);
        org.apache.commons.math.linear.RealMatrix realMatrix64 = realMatrixImpl59.add((org.apache.commons.math.linear.RealMatrix) realMatrixImpl63);
        boolean boolean65 = realMatrixImpl59.isSquare();
        int int66 = realMatrixImpl59.getColumnDimension();
        double[] doubleArray69 = new double[] { 0, 1 };
        org.apache.commons.math.linear.RealMatrixImpl realMatrixImpl70 = new org.apache.commons.math.linear.RealMatrixImpl(doubleArray69);
        double[] doubleArray73 = new double[] { 0, 1 };
        org.apache.commons.math.linear.RealMatrixImpl realMatrixImpl74 = new org.apache.commons.math.linear.RealMatrixImpl(doubleArray73);
        org.apache.commons.math.linear.RealMatrix realMatrix75 = realMatrixImpl70.add((org.apache.commons.math.linear.RealMatrix) realMatrixImpl74);
        double[] doubleArray78 = new double[] { 10.0d, (short) -1 };
        double[] doubleArray79 = realMatrixImpl70.preMultiply(doubleArray78);
        org.apache.commons.math.linear.RealMatrixImpl realMatrixImpl80 = new org.apache.commons.math.linear.RealMatrixImpl(doubleArray78);
        double[] doubleArray81 = realMatrixImpl59.preMultiply(doubleArray78);
        boolean boolean82 = realMatrixImpl54.equals((java.lang.Object) realMatrixImpl59);
        double[] doubleArray85 = new double[] { 0, 1 };
        org.apache.commons.math.linear.RealMatrixImpl realMatrixImpl86 = new org.apache.commons.math.linear.RealMatrixImpl(doubleArray85);
        double[] doubleArray89 = new double[] { 0, 1 };
        org.apache.commons.math.linear.RealMatrixImpl realMatrixImpl90 = new org.apache.commons.math.linear.RealMatrixImpl(doubleArray89);
        org.apache.commons.math.linear.RealMatrix realMatrix91 = realMatrixImpl86.add((org.apache.commons.math.linear.RealMatrix) realMatrixImpl90);
        double[] doubleArray94 = new double[] { 10.0d, (short) -1 };
        double[] doubleArray95 = realMatrixImpl86.preMultiply(doubleArray94);
        double[] doubleArray96 = realMatrixImpl54.preMultiply(doubleArray95);
        org.apache.commons.math.linear.RealMatrixImpl realMatrixImpl97 = new org.apache.commons.math.linear.RealMatrixImpl(doubleArray96);
        double[] doubleArray98 = realMatrixImpl34.operate(doubleArray96);
        org.apache.commons.math.linear.RealMatrixImpl realMatrixImpl99 = new org.apache.commons.math.linear.RealMatrixImpl(doubleArray98);
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
        org.junit.Assert.assertNotNull(doubleArray36);
        org.junit.Assert.assertNotNull(realMatrix38);
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
        org.junit.Assert.assertTrue("'" + boolean55 + "' != '" + true + "'", boolean55 == true);
        org.junit.Assert.assertNotNull(doubleArray58);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray58), "[0.0, 1.0]");
        org.junit.Assert.assertNotNull(doubleArray62);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray62), "[0.0, 1.0]");
        org.junit.Assert.assertNotNull(realMatrix64);
        org.junit.Assert.assertTrue("'" + boolean65 + "' != '" + false + "'", boolean65 == false);
        org.junit.Assert.assertTrue("'" + int66 + "' != '" + 1 + "'", int66 == 1);
        org.junit.Assert.assertNotNull(doubleArray69);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray69), "[0.0, 1.0]");
        org.junit.Assert.assertNotNull(doubleArray73);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray73), "[0.0, 1.0]");
        org.junit.Assert.assertNotNull(realMatrix75);
        org.junit.Assert.assertNotNull(doubleArray78);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray78), "[10.0, -1.0]");
        org.junit.Assert.assertNotNull(doubleArray79);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray79), "[-1.0]");
        org.junit.Assert.assertNotNull(doubleArray81);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray81), "[-1.0]");
        org.junit.Assert.assertTrue("'" + boolean82 + "' != '" + false + "'", boolean82 == false);
        org.junit.Assert.assertNotNull(doubleArray85);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray85), "[0.0, 1.0]");
        org.junit.Assert.assertNotNull(doubleArray89);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray89), "[0.0, 1.0]");
        org.junit.Assert.assertNotNull(realMatrix91);
        org.junit.Assert.assertNotNull(doubleArray94);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray94), "[10.0, -1.0]");
        org.junit.Assert.assertNotNull(doubleArray95);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray95), "[-1.0]");
        org.junit.Assert.assertNotNull(doubleArray96);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray96), "[1.0]");
        org.junit.Assert.assertNotNull(doubleArray98);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray98), "[-1.0]");
    }

    @Test
    public void test5502() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5502");
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
        double[] doubleArray55 = new double[] { 0, 1 };
        org.apache.commons.math.linear.RealMatrixImpl realMatrixImpl56 = new org.apache.commons.math.linear.RealMatrixImpl(doubleArray55);
        double[] doubleArray59 = new double[] { 0, 1 };
        org.apache.commons.math.linear.RealMatrixImpl realMatrixImpl60 = new org.apache.commons.math.linear.RealMatrixImpl(doubleArray59);
        org.apache.commons.math.linear.RealMatrix realMatrix61 = realMatrixImpl56.add((org.apache.commons.math.linear.RealMatrix) realMatrixImpl60);
        boolean boolean62 = realMatrixImpl60.isSquare();
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
        org.apache.commons.math.linear.RealMatrixImpl realMatrixImpl89 = new org.apache.commons.math.linear.RealMatrixImpl(doubleArray85);
        double[] doubleArray90 = realMatrixImpl60.preMultiply(doubleArray85);
        org.apache.commons.math.linear.RealMatrixImpl realMatrixImpl91 = new org.apache.commons.math.linear.RealMatrixImpl(doubleArray85);
        org.apache.commons.math.linear.RealMatrixImpl realMatrixImpl92 = new org.apache.commons.math.linear.RealMatrixImpl(doubleArray85);
        double[] doubleArray93 = realMatrixImpl40.preMultiply(doubleArray85);
        org.apache.commons.math.linear.RealMatrixImpl realMatrixImpl94 = new org.apache.commons.math.linear.RealMatrixImpl(doubleArray93);
        org.apache.commons.math.linear.RealMatrix realMatrix96 = realMatrixImpl94.scalarMultiply((double) 1.0f);
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
        org.junit.Assert.assertNotNull(doubleArray55);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray55), "[0.0, 1.0]");
        org.junit.Assert.assertNotNull(doubleArray59);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray59), "[0.0, 1.0]");
        org.junit.Assert.assertNotNull(realMatrix61);
        org.junit.Assert.assertTrue("'" + boolean62 + "' != '" + false + "'", boolean62 == false);
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
        org.junit.Assert.assertNotNull(doubleArray90);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray90), "[-1.0]");
        org.junit.Assert.assertNotNull(doubleArray93);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray93), "[101.0]");
        org.junit.Assert.assertNotNull(realMatrix96);
    }

    @Test
    public void test5503() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5503");
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
        boolean boolean19 = realMatrixImpl7.isSingular();
        org.apache.commons.math.linear.RealMatrix realMatrix20 = realMatrixImpl7.transpose();
        int int21 = realMatrixImpl7.getColumnDimension();
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
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + true + "'", boolean19 == true);
        org.junit.Assert.assertNotNull(realMatrix20);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 1 + "'", int21 == 1);
    }

    @Test
    public void test5504() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5504");
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
        double[] doubleArray22 = new double[] { 0, 1 };
        org.apache.commons.math.linear.RealMatrixImpl realMatrixImpl23 = new org.apache.commons.math.linear.RealMatrixImpl(doubleArray22);
        double[] doubleArray26 = new double[] { 0, 1 };
        org.apache.commons.math.linear.RealMatrixImpl realMatrixImpl27 = new org.apache.commons.math.linear.RealMatrixImpl(doubleArray26);
        org.apache.commons.math.linear.RealMatrix realMatrix28 = realMatrixImpl23.add((org.apache.commons.math.linear.RealMatrix) realMatrixImpl27);
        double[] doubleArray31 = new double[] { 0, 1 };
        org.apache.commons.math.linear.RealMatrixImpl realMatrixImpl32 = new org.apache.commons.math.linear.RealMatrixImpl(doubleArray31);
        double[] doubleArray35 = new double[] { 0, 1 };
        org.apache.commons.math.linear.RealMatrixImpl realMatrixImpl36 = new org.apache.commons.math.linear.RealMatrixImpl(doubleArray35);
        org.apache.commons.math.linear.RealMatrix realMatrix37 = realMatrixImpl32.add((org.apache.commons.math.linear.RealMatrix) realMatrixImpl36);
        org.apache.commons.math.linear.RealMatrix realMatrix38 = realMatrixImpl27.subtract((org.apache.commons.math.linear.RealMatrix) realMatrixImpl36);
        double[] doubleArray41 = new double[] { 0, 1 };
        org.apache.commons.math.linear.RealMatrixImpl realMatrixImpl42 = new org.apache.commons.math.linear.RealMatrixImpl(doubleArray41);
        double[] doubleArray45 = new double[] { 0, 1 };
        org.apache.commons.math.linear.RealMatrixImpl realMatrixImpl46 = new org.apache.commons.math.linear.RealMatrixImpl(doubleArray45);
        org.apache.commons.math.linear.RealMatrix realMatrix47 = realMatrixImpl42.add((org.apache.commons.math.linear.RealMatrix) realMatrixImpl46);
        double[] doubleArray50 = new double[] { 10.0d, (short) -1 };
        double[] doubleArray51 = realMatrixImpl42.preMultiply(doubleArray50);
        org.apache.commons.math.linear.RealMatrix realMatrix52 = realMatrixImpl36.subtract((org.apache.commons.math.linear.RealMatrix) realMatrixImpl42);
        double[] doubleArray55 = new double[] { 0, 1 };
        org.apache.commons.math.linear.RealMatrixImpl realMatrixImpl56 = new org.apache.commons.math.linear.RealMatrixImpl(doubleArray55);
        double double57 = realMatrixImpl56.getNorm();
        org.apache.commons.math.linear.RealMatrix realMatrix58 = realMatrixImpl56.transpose();
        org.apache.commons.math.linear.RealMatrix realMatrix59 = realMatrixImpl36.add((org.apache.commons.math.linear.RealMatrix) realMatrixImpl56);
        double[] doubleArray62 = new double[] { 0, 1 };
        org.apache.commons.math.linear.RealMatrixImpl realMatrixImpl63 = new org.apache.commons.math.linear.RealMatrixImpl(doubleArray62);
        double[] doubleArray66 = new double[] { 0, 1 };
        org.apache.commons.math.linear.RealMatrixImpl realMatrixImpl67 = new org.apache.commons.math.linear.RealMatrixImpl(doubleArray66);
        org.apache.commons.math.linear.RealMatrix realMatrix68 = realMatrixImpl63.add((org.apache.commons.math.linear.RealMatrix) realMatrixImpl67);
        double[] doubleArray71 = new double[] { 10.0d, (short) -1 };
        double[] doubleArray72 = realMatrixImpl63.preMultiply(doubleArray71);
        org.apache.commons.math.linear.RealMatrixImpl realMatrixImpl73 = new org.apache.commons.math.linear.RealMatrixImpl(doubleArray71);
        boolean boolean74 = realMatrixImpl73.isSingular();
        double double75 = realMatrixImpl73.getNorm();
        int int76 = realMatrixImpl73.getColumnDimension();
        org.apache.commons.math.linear.RealMatrix realMatrix78 = realMatrixImpl73.scalarMultiply((double) 5);
        org.apache.commons.math.linear.RealMatrix realMatrix79 = realMatrixImpl56.add((org.apache.commons.math.linear.RealMatrix) realMatrixImpl73);
        org.apache.commons.math.linear.RealMatrix realMatrix81 = realMatrixImpl73.getRowMatrix(1);
        org.apache.commons.math.linear.RealMatrix realMatrix82 = realMatrixImpl7.subtract((org.apache.commons.math.linear.RealMatrix) realMatrixImpl73);
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math.linear.RealMatrix realMatrix83 = realMatrixImpl7.inverse();
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
        org.junit.Assert.assertTrue("'" + double19 + "' != '" + 1.0d + "'", double19 == 1.0d);
        org.junit.Assert.assertNotNull(doubleArray22);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray22), "[0.0, 1.0]");
        org.junit.Assert.assertNotNull(doubleArray26);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray26), "[0.0, 1.0]");
        org.junit.Assert.assertNotNull(realMatrix28);
        org.junit.Assert.assertNotNull(doubleArray31);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray31), "[0.0, 1.0]");
        org.junit.Assert.assertNotNull(doubleArray35);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray35), "[0.0, 1.0]");
        org.junit.Assert.assertNotNull(realMatrix37);
        org.junit.Assert.assertNotNull(realMatrix38);
        org.junit.Assert.assertNotNull(doubleArray41);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray41), "[0.0, 1.0]");
        org.junit.Assert.assertNotNull(doubleArray45);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray45), "[0.0, 1.0]");
        org.junit.Assert.assertNotNull(realMatrix47);
        org.junit.Assert.assertNotNull(doubleArray50);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray50), "[10.0, -1.0]");
        org.junit.Assert.assertNotNull(doubleArray51);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray51), "[-1.0]");
        org.junit.Assert.assertNotNull(realMatrix52);
        org.junit.Assert.assertNotNull(doubleArray55);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray55), "[0.0, 1.0]");
        org.junit.Assert.assertTrue("'" + double57 + "' != '" + 1.0d + "'", double57 == 1.0d);
        org.junit.Assert.assertNotNull(realMatrix58);
        org.junit.Assert.assertNotNull(realMatrix59);
        org.junit.Assert.assertNotNull(doubleArray62);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray62), "[0.0, 1.0]");
        org.junit.Assert.assertNotNull(doubleArray66);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray66), "[0.0, 1.0]");
        org.junit.Assert.assertNotNull(realMatrix68);
        org.junit.Assert.assertNotNull(doubleArray71);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray71), "[10.0, -1.0]");
        org.junit.Assert.assertNotNull(doubleArray72);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray72), "[-1.0]");
        org.junit.Assert.assertTrue("'" + boolean74 + "' != '" + true + "'", boolean74 == true);
        org.junit.Assert.assertTrue("'" + double75 + "' != '" + 11.0d + "'", double75 == 11.0d);
        org.junit.Assert.assertTrue("'" + int76 + "' != '" + 1 + "'", int76 == 1);
        org.junit.Assert.assertNotNull(realMatrix78);
        org.junit.Assert.assertNotNull(realMatrix79);
        org.junit.Assert.assertNotNull(realMatrix81);
        org.junit.Assert.assertNotNull(realMatrix82);
    }

    @Test
    public void test5505() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5505");
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
        double[] doubleArray39 = new double[] { 0, 1 };
        org.apache.commons.math.linear.RealMatrixImpl realMatrixImpl40 = new org.apache.commons.math.linear.RealMatrixImpl(doubleArray39);
        org.apache.commons.math.linear.RealMatrix realMatrix41 = realMatrixImpl36.add((org.apache.commons.math.linear.RealMatrix) realMatrixImpl40);
        boolean boolean42 = realMatrixImpl36.isSquare();
        org.apache.commons.math.linear.RealMatrix realMatrix44 = realMatrixImpl36.scalarAdd((double) (short) -1);
        org.apache.commons.math.linear.RealMatrix realMatrix45 = realMatrixImpl22.subtract(realMatrix44);
        org.apache.commons.math.linear.RealMatrix realMatrix46 = realMatrixImpl22.copy();
        double double47 = realMatrixImpl22.getNorm();
        // The following exception was thrown during execution in test generation
        try {
            double double48 = realMatrixImpl22.getTrace();
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
        org.junit.Assert.assertNotNull(doubleArray39);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray39), "[0.0, 1.0]");
        org.junit.Assert.assertNotNull(realMatrix41);
        org.junit.Assert.assertTrue("'" + boolean42 + "' != '" + false + "'", boolean42 == false);
        org.junit.Assert.assertNotNull(realMatrix44);
        org.junit.Assert.assertNotNull(realMatrix45);
        org.junit.Assert.assertNotNull(realMatrix46);
        org.junit.Assert.assertTrue("'" + double47 + "' != '" + 1.0d + "'", double47 == 1.0d);
    }

    @Test
    public void test5506() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5506");
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
        int int17 = realMatrixImpl13.getRowDimension();
        org.apache.commons.math.linear.RealMatrix realMatrix19 = realMatrixImpl13.getRowMatrix(0);
        double double20 = realMatrixImpl13.getNorm();
        org.apache.commons.math.linear.RealMatrix realMatrix22 = realMatrixImpl13.scalarAdd(12.0d);
        org.apache.commons.math.linear.RealMatrix realMatrix23 = realMatrixImpl13.transpose();
        int int24 = realMatrixImpl13.getColumnDimension();
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
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 2 + "'", int17 == 2);
        org.junit.Assert.assertNotNull(realMatrix19);
        org.junit.Assert.assertTrue("'" + double20 + "' != '" + 11.0d + "'", double20 == 11.0d);
        org.junit.Assert.assertNotNull(realMatrix22);
        org.junit.Assert.assertNotNull(realMatrix23);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 1 + "'", int24 == 1);
    }

    @Test
    public void test5507() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5507");
        double[] doubleArray2 = new double[] { 0, 1 };
        org.apache.commons.math.linear.RealMatrixImpl realMatrixImpl3 = new org.apache.commons.math.linear.RealMatrixImpl(doubleArray2);
        org.apache.commons.math.linear.RealMatrix realMatrix5 = realMatrixImpl3.scalarMultiply((double) (short) 100);
        double[] doubleArray7 = realMatrixImpl3.getRow(0);
        double[] doubleArray10 = new double[] { 0, 1 };
        org.apache.commons.math.linear.RealMatrixImpl realMatrixImpl11 = new org.apache.commons.math.linear.RealMatrixImpl(doubleArray10);
        double[] doubleArray14 = new double[] { 0, 1 };
        org.apache.commons.math.linear.RealMatrixImpl realMatrixImpl15 = new org.apache.commons.math.linear.RealMatrixImpl(doubleArray14);
        org.apache.commons.math.linear.RealMatrix realMatrix16 = realMatrixImpl11.add((org.apache.commons.math.linear.RealMatrix) realMatrixImpl15);
        double[] doubleArray19 = new double[] { 0, 1 };
        org.apache.commons.math.linear.RealMatrixImpl realMatrixImpl20 = new org.apache.commons.math.linear.RealMatrixImpl(doubleArray19);
        double[] doubleArray23 = new double[] { 0, 1 };
        org.apache.commons.math.linear.RealMatrixImpl realMatrixImpl24 = new org.apache.commons.math.linear.RealMatrixImpl(doubleArray23);
        org.apache.commons.math.linear.RealMatrix realMatrix25 = realMatrixImpl20.add((org.apache.commons.math.linear.RealMatrix) realMatrixImpl24);
        org.apache.commons.math.linear.RealMatrix realMatrix26 = realMatrixImpl15.subtract((org.apache.commons.math.linear.RealMatrix) realMatrixImpl24);
        double double27 = realMatrixImpl15.getNorm();
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
        boolean boolean47 = realMatrixImpl35.isSquare();
        double double48 = realMatrixImpl35.getNorm();
        boolean boolean49 = realMatrixImpl35.isSingular();
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
        double[] doubleArray71 = new double[] { 0, 1 };
        org.apache.commons.math.linear.RealMatrixImpl realMatrixImpl72 = new org.apache.commons.math.linear.RealMatrixImpl(doubleArray71);
        double[] doubleArray75 = new double[] { 0, 1 };
        org.apache.commons.math.linear.RealMatrixImpl realMatrixImpl76 = new org.apache.commons.math.linear.RealMatrixImpl(doubleArray75);
        org.apache.commons.math.linear.RealMatrix realMatrix77 = realMatrixImpl72.add((org.apache.commons.math.linear.RealMatrix) realMatrixImpl76);
        double[] doubleArray80 = new double[] { 10.0d, (short) -1 };
        double[] doubleArray81 = realMatrixImpl72.preMultiply(doubleArray80);
        org.apache.commons.math.linear.RealMatrixImpl realMatrixImpl82 = new org.apache.commons.math.linear.RealMatrixImpl(doubleArray80);
        double[] doubleArray83 = realMatrixImpl57.preMultiply(doubleArray80);
        double[] doubleArray84 = realMatrixImpl35.preMultiply(doubleArray80);
        org.apache.commons.math.linear.RealMatrix realMatrix85 = realMatrixImpl15.subtract((org.apache.commons.math.linear.RealMatrix) realMatrixImpl35);
        org.apache.commons.math.linear.RealMatrix realMatrix86 = realMatrixImpl3.add(realMatrix85);
        int int87 = realMatrixImpl3.getRowDimension();
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math.linear.RealMatrix realMatrix92 = realMatrixImpl3.getSubMatrix(10, (int) (byte) 1, (int) '#', (int) (byte) 100);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math.linear.MatrixIndexException; message: invalid row or column index selection");
        } catch (org.apache.commons.math.linear.MatrixIndexException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(doubleArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray2), "[0.0, 1.0]");
        org.junit.Assert.assertNotNull(realMatrix5);
        org.junit.Assert.assertNotNull(doubleArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray7), "[0.0]");
        org.junit.Assert.assertNotNull(doubleArray10);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray10), "[0.0, 1.0]");
        org.junit.Assert.assertNotNull(doubleArray14);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray14), "[0.0, 1.0]");
        org.junit.Assert.assertNotNull(realMatrix16);
        org.junit.Assert.assertNotNull(doubleArray19);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray19), "[0.0, 1.0]");
        org.junit.Assert.assertNotNull(doubleArray23);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray23), "[0.0, 1.0]");
        org.junit.Assert.assertNotNull(realMatrix25);
        org.junit.Assert.assertNotNull(realMatrix26);
        org.junit.Assert.assertTrue("'" + double27 + "' != '" + 1.0d + "'", double27 == 1.0d);
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
        org.junit.Assert.assertTrue("'" + boolean47 + "' != '" + false + "'", boolean47 == false);
        org.junit.Assert.assertTrue("'" + double48 + "' != '" + 1.0d + "'", double48 == 1.0d);
        org.junit.Assert.assertTrue("'" + boolean49 + "' != '" + true + "'", boolean49 == true);
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
        org.junit.Assert.assertNotNull(doubleArray84);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray84), "[-1.0]");
        org.junit.Assert.assertNotNull(realMatrix85);
        org.junit.Assert.assertNotNull(realMatrix86);
        org.junit.Assert.assertTrue("'" + int87 + "' != '" + 2 + "'", int87 == 2);
    }

    @Test
    public void test5508() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5508");
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
        double[] doubleArray20 = new double[] { 0, 1 };
        org.apache.commons.math.linear.RealMatrixImpl realMatrixImpl21 = new org.apache.commons.math.linear.RealMatrixImpl(doubleArray20);
        double[] doubleArray24 = new double[] { 0, 1 };
        org.apache.commons.math.linear.RealMatrixImpl realMatrixImpl25 = new org.apache.commons.math.linear.RealMatrixImpl(doubleArray24);
        org.apache.commons.math.linear.RealMatrix realMatrix26 = realMatrixImpl21.add((org.apache.commons.math.linear.RealMatrix) realMatrixImpl25);
        double[] doubleArray29 = new double[] { 0, 1 };
        org.apache.commons.math.linear.RealMatrixImpl realMatrixImpl30 = new org.apache.commons.math.linear.RealMatrixImpl(doubleArray29);
        double[] doubleArray33 = new double[] { 0, 1 };
        org.apache.commons.math.linear.RealMatrixImpl realMatrixImpl34 = new org.apache.commons.math.linear.RealMatrixImpl(doubleArray33);
        org.apache.commons.math.linear.RealMatrix realMatrix35 = realMatrixImpl30.add((org.apache.commons.math.linear.RealMatrix) realMatrixImpl34);
        org.apache.commons.math.linear.RealMatrix realMatrix36 = realMatrixImpl25.subtract((org.apache.commons.math.linear.RealMatrix) realMatrixImpl34);
        double[] doubleArray39 = new double[] { 0, 1 };
        org.apache.commons.math.linear.RealMatrixImpl realMatrixImpl40 = new org.apache.commons.math.linear.RealMatrixImpl(doubleArray39);
        double[] doubleArray43 = new double[] { 0, 1 };
        org.apache.commons.math.linear.RealMatrixImpl realMatrixImpl44 = new org.apache.commons.math.linear.RealMatrixImpl(doubleArray43);
        org.apache.commons.math.linear.RealMatrix realMatrix45 = realMatrixImpl40.add((org.apache.commons.math.linear.RealMatrix) realMatrixImpl44);
        double[] doubleArray48 = new double[] { 10.0d, (short) -1 };
        double[] doubleArray49 = realMatrixImpl40.preMultiply(doubleArray48);
        org.apache.commons.math.linear.RealMatrix realMatrix50 = realMatrixImpl34.subtract((org.apache.commons.math.linear.RealMatrix) realMatrixImpl40);
        org.apache.commons.math.linear.RealMatrix realMatrix52 = realMatrixImpl34.scalarMultiply(0.0d);
        double[] doubleArray55 = new double[] { 0, 1 };
        org.apache.commons.math.linear.RealMatrixImpl realMatrixImpl56 = new org.apache.commons.math.linear.RealMatrixImpl(doubleArray55);
        double double57 = realMatrixImpl56.getNorm();
        org.apache.commons.math.linear.RealMatrix realMatrix58 = realMatrixImpl56.transpose();
        double[][] doubleArray59 = realMatrixImpl56.getDataRef();
        org.apache.commons.math.linear.RealMatrixImpl realMatrixImpl60 = new org.apache.commons.math.linear.RealMatrixImpl(doubleArray59);
        boolean boolean61 = realMatrixImpl34.equals((java.lang.Object) realMatrixImpl60);
        org.apache.commons.math.linear.RealMatrix realMatrix62 = realMatrixImpl16.subtract((org.apache.commons.math.linear.RealMatrix) realMatrixImpl34);
        double double63 = realMatrixImpl16.getNorm();
        org.apache.commons.math.linear.RealMatrix realMatrix64 = realMatrixImpl16.copy();
        org.apache.commons.math.linear.RealMatrix realMatrix66 = realMatrixImpl16.scalarAdd((double) 1.0f);
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
        org.junit.Assert.assertNotNull(doubleArray20);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray20), "[0.0, 1.0]");
        org.junit.Assert.assertNotNull(doubleArray24);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray24), "[0.0, 1.0]");
        org.junit.Assert.assertNotNull(realMatrix26);
        org.junit.Assert.assertNotNull(doubleArray29);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray29), "[0.0, 1.0]");
        org.junit.Assert.assertNotNull(doubleArray33);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray33), "[0.0, 1.0]");
        org.junit.Assert.assertNotNull(realMatrix35);
        org.junit.Assert.assertNotNull(realMatrix36);
        org.junit.Assert.assertNotNull(doubleArray39);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray39), "[0.0, 1.0]");
        org.junit.Assert.assertNotNull(doubleArray43);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray43), "[0.0, 1.0]");
        org.junit.Assert.assertNotNull(realMatrix45);
        org.junit.Assert.assertNotNull(doubleArray48);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray48), "[10.0, -1.0]");
        org.junit.Assert.assertNotNull(doubleArray49);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray49), "[-1.0]");
        org.junit.Assert.assertNotNull(realMatrix50);
        org.junit.Assert.assertNotNull(realMatrix52);
        org.junit.Assert.assertNotNull(doubleArray55);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray55), "[0.0, 1.0]");
        org.junit.Assert.assertTrue("'" + double57 + "' != '" + 1.0d + "'", double57 == 1.0d);
        org.junit.Assert.assertNotNull(realMatrix58);
        org.junit.Assert.assertNotNull(doubleArray59);
        org.junit.Assert.assertTrue("'" + boolean61 + "' != '" + true + "'", boolean61 == true);
        org.junit.Assert.assertNotNull(realMatrix62);
        org.junit.Assert.assertTrue("'" + double63 + "' != '" + 11.0d + "'", double63 == 11.0d);
        org.junit.Assert.assertNotNull(realMatrix64);
        org.junit.Assert.assertNotNull(realMatrix66);
    }

    @Test
    public void test5509() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5509");
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
        org.apache.commons.math.linear.RealMatrixImpl realMatrixImpl57 = new org.apache.commons.math.linear.RealMatrixImpl(doubleArray52);
        double[] doubleArray60 = new double[] { 0, 1 };
        org.apache.commons.math.linear.RealMatrixImpl realMatrixImpl61 = new org.apache.commons.math.linear.RealMatrixImpl(doubleArray60);
        double[] doubleArray64 = new double[] { 0, 1 };
        org.apache.commons.math.linear.RealMatrixImpl realMatrixImpl65 = new org.apache.commons.math.linear.RealMatrixImpl(doubleArray64);
        org.apache.commons.math.linear.RealMatrix realMatrix66 = realMatrixImpl61.add((org.apache.commons.math.linear.RealMatrix) realMatrixImpl65);
        double[] doubleArray69 = new double[] { 10.0d, (short) -1 };
        double[] doubleArray70 = realMatrixImpl61.preMultiply(doubleArray69);
        org.apache.commons.math.linear.RealMatrixImpl realMatrixImpl71 = new org.apache.commons.math.linear.RealMatrixImpl(doubleArray69);
        boolean boolean72 = realMatrixImpl71.isSingular();
        double[][] doubleArray73 = realMatrixImpl71.getDataRef();
        java.lang.String str74 = realMatrixImpl71.toString();
        double[] doubleArray77 = new double[] { 0, 1 };
        org.apache.commons.math.linear.RealMatrixImpl realMatrixImpl78 = new org.apache.commons.math.linear.RealMatrixImpl(doubleArray77);
        double double79 = realMatrixImpl78.getNorm();
        double[] doubleArray82 = new double[] { 0, 1 };
        org.apache.commons.math.linear.RealMatrixImpl realMatrixImpl83 = new org.apache.commons.math.linear.RealMatrixImpl(doubleArray82);
        double double84 = realMatrixImpl83.getNorm();
        org.apache.commons.math.linear.RealMatrix realMatrix85 = realMatrixImpl83.transpose();
        double[] doubleArray87 = realMatrixImpl83.getColumn(0);
        double[] doubleArray88 = realMatrixImpl78.preMultiply(doubleArray87);
        double[] doubleArray89 = realMatrixImpl71.preMultiply(doubleArray87);
        org.apache.commons.math.linear.RealMatrixImpl realMatrixImpl90 = new org.apache.commons.math.linear.RealMatrixImpl(doubleArray87);
        double[] doubleArray91 = realMatrixImpl57.preMultiply(doubleArray87);
        org.apache.commons.math.linear.RealMatrixImpl realMatrixImpl92 = new org.apache.commons.math.linear.RealMatrixImpl(doubleArray87);
        // The following exception was thrown during execution in test generation
        try {
            double double93 = realMatrixImpl92.getTrace();
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
        org.junit.Assert.assertNotNull(doubleArray60);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray60), "[0.0, 1.0]");
        org.junit.Assert.assertNotNull(doubleArray64);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray64), "[0.0, 1.0]");
        org.junit.Assert.assertNotNull(realMatrix66);
        org.junit.Assert.assertNotNull(doubleArray69);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray69), "[10.0, -1.0]");
        org.junit.Assert.assertNotNull(doubleArray70);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray70), "[-1.0]");
        org.junit.Assert.assertTrue("'" + boolean72 + "' != '" + true + "'", boolean72 == true);
        org.junit.Assert.assertNotNull(doubleArray73);
        org.junit.Assert.assertEquals("'" + str74 + "' != '" + "RealMatrixImpl{{10.0},{-1.0}}" + "'", str74, "RealMatrixImpl{{10.0},{-1.0}}");
        org.junit.Assert.assertNotNull(doubleArray77);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray77), "[0.0, 1.0]");
        org.junit.Assert.assertTrue("'" + double79 + "' != '" + 1.0d + "'", double79 == 1.0d);
        org.junit.Assert.assertNotNull(doubleArray82);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray82), "[0.0, 1.0]");
        org.junit.Assert.assertTrue("'" + double84 + "' != '" + 1.0d + "'", double84 == 1.0d);
        org.junit.Assert.assertNotNull(realMatrix85);
        org.junit.Assert.assertNotNull(doubleArray87);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray87), "[0.0, 1.0]");
        org.junit.Assert.assertNotNull(doubleArray88);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray88), "[1.0]");
        org.junit.Assert.assertNotNull(doubleArray89);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray89), "[-1.0]");
        org.junit.Assert.assertNotNull(doubleArray91);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray91), "[-1.0]");
    }

    @Test
    public void test5510() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5510");
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
        boolean boolean21 = realMatrixImpl7.isSquare();
        org.apache.commons.math.linear.RealMatrix realMatrix23 = realMatrixImpl7.scalarAdd((double) (byte) 100);
        boolean boolean24 = realMatrixImpl7.isSquare();
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
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertNotNull(realMatrix23);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
    }

    @Test
    public void test5511() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5511");
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
        int int53 = realMatrixImpl40.getColumnDimension();
        double[] doubleArray60 = new double[] { (-1L), 0L, 300.0d, (short) -1, 0, 1 };
        // The following exception was thrown during execution in test generation
        try {
            double[] doubleArray61 = realMatrixImpl40.solve(doubleArray60);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: constant vector has wrong length");
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
        org.junit.Assert.assertTrue("'" + int53 + "' != '" + 1 + "'", int53 == 1);
        org.junit.Assert.assertNotNull(doubleArray60);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray60), "[-1.0, 0.0, 300.0, -1.0, 0.0, 1.0]");
    }

    @Test
    public void test5512() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5512");
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
        double[][] doubleArray33 = realMatrixImpl16.getData();
        org.apache.commons.math.linear.RealMatrixImpl realMatrixImpl34 = new org.apache.commons.math.linear.RealMatrixImpl(doubleArray33);
        org.apache.commons.math.linear.RealMatrix realMatrix36 = realMatrixImpl34.scalarAdd((double) 0);
        double[] doubleArray39 = new double[] { 0, 1 };
        org.apache.commons.math.linear.RealMatrixImpl realMatrixImpl40 = new org.apache.commons.math.linear.RealMatrixImpl(doubleArray39);
        double[] doubleArray43 = new double[] { 0, 1 };
        org.apache.commons.math.linear.RealMatrixImpl realMatrixImpl44 = new org.apache.commons.math.linear.RealMatrixImpl(doubleArray43);
        org.apache.commons.math.linear.RealMatrix realMatrix45 = realMatrixImpl40.add((org.apache.commons.math.linear.RealMatrix) realMatrixImpl44);
        double[] doubleArray48 = new double[] { 0, 1 };
        org.apache.commons.math.linear.RealMatrixImpl realMatrixImpl49 = new org.apache.commons.math.linear.RealMatrixImpl(doubleArray48);
        double[] doubleArray52 = new double[] { 0, 1 };
        org.apache.commons.math.linear.RealMatrixImpl realMatrixImpl53 = new org.apache.commons.math.linear.RealMatrixImpl(doubleArray52);
        org.apache.commons.math.linear.RealMatrix realMatrix54 = realMatrixImpl49.add((org.apache.commons.math.linear.RealMatrix) realMatrixImpl53);
        org.apache.commons.math.linear.RealMatrix realMatrix55 = realMatrixImpl44.subtract((org.apache.commons.math.linear.RealMatrix) realMatrixImpl53);
        boolean boolean56 = realMatrixImpl44.isSquare();
        int int57 = realMatrixImpl44.getColumnDimension();
        double[] doubleArray59 = realMatrixImpl44.getColumn((int) (byte) 0);
        org.apache.commons.math.linear.RealMatrixImpl realMatrixImpl60 = new org.apache.commons.math.linear.RealMatrixImpl(doubleArray59);
        org.apache.commons.math.linear.RealMatrixImpl realMatrixImpl61 = new org.apache.commons.math.linear.RealMatrixImpl(doubleArray59);
        double[] doubleArray64 = new double[] { 0, 1 };
        org.apache.commons.math.linear.RealMatrixImpl realMatrixImpl65 = new org.apache.commons.math.linear.RealMatrixImpl(doubleArray64);
        double[] doubleArray68 = new double[] { 0, 1 };
        org.apache.commons.math.linear.RealMatrixImpl realMatrixImpl69 = new org.apache.commons.math.linear.RealMatrixImpl(doubleArray68);
        org.apache.commons.math.linear.RealMatrix realMatrix70 = realMatrixImpl65.add((org.apache.commons.math.linear.RealMatrix) realMatrixImpl69);
        double[] doubleArray73 = new double[] { 10.0d, (short) -1 };
        double[] doubleArray74 = realMatrixImpl65.preMultiply(doubleArray73);
        org.apache.commons.math.linear.RealMatrixImpl realMatrixImpl75 = new org.apache.commons.math.linear.RealMatrixImpl(doubleArray73);
        double[] doubleArray76 = realMatrixImpl61.preMultiply(doubleArray73);
        org.apache.commons.math.linear.RealMatrixImpl realMatrixImpl77 = new org.apache.commons.math.linear.RealMatrixImpl(doubleArray73);
        double[] doubleArray80 = new double[] { 0, 1 };
        org.apache.commons.math.linear.RealMatrixImpl realMatrixImpl81 = new org.apache.commons.math.linear.RealMatrixImpl(doubleArray80);
        double double82 = realMatrixImpl81.getNorm();
        org.apache.commons.math.linear.RealMatrix realMatrix83 = realMatrixImpl81.transpose();
        double[] doubleArray85 = realMatrixImpl81.getColumn(0);
        org.apache.commons.math.linear.RealMatrix realMatrix86 = realMatrixImpl81.transpose();
        org.apache.commons.math.linear.RealMatrix realMatrix88 = realMatrixImpl81.scalarMultiply((double) 10L);
        org.apache.commons.math.linear.RealMatrix realMatrix89 = realMatrixImpl77.subtract((org.apache.commons.math.linear.RealMatrix) realMatrixImpl81);
        org.apache.commons.math.linear.RealMatrix realMatrix90 = realMatrixImpl81.transpose();
        org.apache.commons.math.linear.RealMatrix realMatrix91 = realMatrixImpl81.transpose();
        org.apache.commons.math.linear.RealMatrix realMatrix92 = realMatrixImpl34.multiply(realMatrix91);
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
        org.junit.Assert.assertNotNull(realMatrix36);
        org.junit.Assert.assertNotNull(doubleArray39);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray39), "[0.0, 1.0]");
        org.junit.Assert.assertNotNull(doubleArray43);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray43), "[0.0, 1.0]");
        org.junit.Assert.assertNotNull(realMatrix45);
        org.junit.Assert.assertNotNull(doubleArray48);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray48), "[0.0, 1.0]");
        org.junit.Assert.assertNotNull(doubleArray52);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray52), "[0.0, 1.0]");
        org.junit.Assert.assertNotNull(realMatrix54);
        org.junit.Assert.assertNotNull(realMatrix55);
        org.junit.Assert.assertTrue("'" + boolean56 + "' != '" + false + "'", boolean56 == false);
        org.junit.Assert.assertTrue("'" + int57 + "' != '" + 1 + "'", int57 == 1);
        org.junit.Assert.assertNotNull(doubleArray59);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray59), "[0.0, 1.0]");
        org.junit.Assert.assertNotNull(doubleArray64);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray64), "[0.0, 1.0]");
        org.junit.Assert.assertNotNull(doubleArray68);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray68), "[0.0, 1.0]");
        org.junit.Assert.assertNotNull(realMatrix70);
        org.junit.Assert.assertNotNull(doubleArray73);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray73), "[10.0, -1.0]");
        org.junit.Assert.assertNotNull(doubleArray74);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray74), "[-1.0]");
        org.junit.Assert.assertNotNull(doubleArray76);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray76), "[-1.0]");
        org.junit.Assert.assertNotNull(doubleArray80);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray80), "[0.0, 1.0]");
        org.junit.Assert.assertTrue("'" + double82 + "' != '" + 1.0d + "'", double82 == 1.0d);
        org.junit.Assert.assertNotNull(realMatrix83);
        org.junit.Assert.assertNotNull(doubleArray85);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray85), "[0.0, 1.0]");
        org.junit.Assert.assertNotNull(realMatrix86);
        org.junit.Assert.assertNotNull(realMatrix88);
        org.junit.Assert.assertNotNull(realMatrix89);
        org.junit.Assert.assertNotNull(realMatrix90);
        org.junit.Assert.assertNotNull(realMatrix91);
        org.junit.Assert.assertNotNull(realMatrix92);
    }

    @Test
    public void test5513() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5513");
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
        org.apache.commons.math.linear.RealMatrix realMatrix20 = realMatrixImpl7.transpose();
        org.apache.commons.math.linear.RealMatrix realMatrix22 = realMatrixImpl7.scalarMultiply((double) (short) 10);
        boolean boolean23 = realMatrixImpl7.isSingular();
        boolean boolean24 = realMatrixImpl7.isSingular();
        org.apache.commons.math.linear.RealMatrix realMatrix26 = realMatrixImpl7.scalarAdd((double) (byte) 1);
        org.apache.commons.math.linear.RealMatrix realMatrix27 = realMatrixImpl7.transpose();
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
        org.junit.Assert.assertNotNull(realMatrix20);
        org.junit.Assert.assertNotNull(realMatrix22);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + true + "'", boolean23 == true);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + true + "'", boolean24 == true);
        org.junit.Assert.assertNotNull(realMatrix26);
        org.junit.Assert.assertNotNull(realMatrix27);
    }

    @Test
    public void test5514() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5514");
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
        boolean boolean58 = realMatrixImpl10.isSingular();
        // The following exception was thrown during execution in test generation
        try {
            double[] doubleArray60 = realMatrixImpl10.getColumn(1);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math.linear.MatrixIndexException; message: illegal column argument");
        } catch (org.apache.commons.math.linear.MatrixIndexException e) {
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
        org.junit.Assert.assertTrue("'" + boolean58 + "' != '" + true + "'", boolean58 == true);
    }

    @Test
    public void test5515() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5515");
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
        boolean boolean16 = realMatrixImpl3.isSingular();
        double[] doubleArray19 = new double[] { 0, 1 };
        org.apache.commons.math.linear.RealMatrixImpl realMatrixImpl20 = new org.apache.commons.math.linear.RealMatrixImpl(doubleArray19);
        org.apache.commons.math.linear.RealMatrix realMatrix22 = realMatrixImpl20.scalarMultiply((double) (short) 100);
        double[][] doubleArray23 = realMatrixImpl20.getDataRef();
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
        boolean boolean43 = realMatrixImpl31.isSquare();
        double double44 = realMatrixImpl31.getNorm();
        double[] doubleArray50 = new double[] { (short) 10, 1.0d, 0.0f, (-1.0f), 0.0d };
        org.apache.commons.math.linear.RealMatrixImpl realMatrixImpl51 = new org.apache.commons.math.linear.RealMatrixImpl(doubleArray50);
        org.apache.commons.math.linear.RealMatrixImpl realMatrixImpl52 = new org.apache.commons.math.linear.RealMatrixImpl(doubleArray50);
        boolean boolean53 = realMatrixImpl31.equals((java.lang.Object) realMatrixImpl52);
        int int54 = realMatrixImpl31.getRowDimension();
        org.apache.commons.math.linear.RealMatrix realMatrix56 = realMatrixImpl31.scalarAdd((-1.0d));
        org.apache.commons.math.linear.RealMatrix realMatrix57 = realMatrixImpl20.subtract((org.apache.commons.math.linear.RealMatrix) realMatrixImpl31);
        org.apache.commons.math.linear.RealMatrix realMatrix58 = realMatrixImpl3.subtract((org.apache.commons.math.linear.RealMatrix) realMatrixImpl31);
        org.apache.commons.math.linear.RealMatrix realMatrix59 = realMatrixImpl3.copy();
        // The following exception was thrown during execution in test generation
        try {
            double double60 = realMatrixImpl3.getTrace();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: matrix is not square");
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
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertNotNull(doubleArray19);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray19), "[0.0, 1.0]");
        org.junit.Assert.assertNotNull(realMatrix22);
        org.junit.Assert.assertNotNull(doubleArray23);
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
        org.junit.Assert.assertTrue("'" + boolean43 + "' != '" + false + "'", boolean43 == false);
        org.junit.Assert.assertTrue("'" + double44 + "' != '" + 1.0d + "'", double44 == 1.0d);
        org.junit.Assert.assertNotNull(doubleArray50);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray50), "[10.0, 1.0, 0.0, -1.0, 0.0]");
        org.junit.Assert.assertTrue("'" + boolean53 + "' != '" + false + "'", boolean53 == false);
        org.junit.Assert.assertTrue("'" + int54 + "' != '" + 2 + "'", int54 == 2);
        org.junit.Assert.assertNotNull(realMatrix56);
        org.junit.Assert.assertNotNull(realMatrix57);
        org.junit.Assert.assertNotNull(realMatrix58);
        org.junit.Assert.assertNotNull(realMatrix59);
    }

    @Test
    public void test5516() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5516");
        double[] doubleArray2 = new double[] { 0, 1 };
        org.apache.commons.math.linear.RealMatrixImpl realMatrixImpl3 = new org.apache.commons.math.linear.RealMatrixImpl(doubleArray2);
        double[] doubleArray6 = new double[] { 0, 1 };
        org.apache.commons.math.linear.RealMatrixImpl realMatrixImpl7 = new org.apache.commons.math.linear.RealMatrixImpl(doubleArray6);
        org.apache.commons.math.linear.RealMatrix realMatrix8 = realMatrixImpl3.add((org.apache.commons.math.linear.RealMatrix) realMatrixImpl7);
        double[] doubleArray11 = new double[] { 10.0d, (short) -1 };
        double[] doubleArray12 = realMatrixImpl3.preMultiply(doubleArray11);
        org.apache.commons.math.linear.RealMatrixImpl realMatrixImpl13 = new org.apache.commons.math.linear.RealMatrixImpl(doubleArray11);
        double[] doubleArray16 = new double[] { 0, 1 };
        org.apache.commons.math.linear.RealMatrixImpl realMatrixImpl17 = new org.apache.commons.math.linear.RealMatrixImpl(doubleArray16);
        org.apache.commons.math.linear.RealMatrix realMatrix19 = realMatrixImpl17.scalarMultiply((double) (short) 100);
        double[] doubleArray21 = realMatrixImpl17.getRow(0);
        org.apache.commons.math.linear.RealMatrix realMatrix22 = realMatrixImpl13.add((org.apache.commons.math.linear.RealMatrix) realMatrixImpl17);
        org.apache.commons.math.linear.RealMatrix realMatrix24 = realMatrixImpl17.scalarMultiply((double) (-1));
        boolean boolean25 = realMatrixImpl17.isSquare();
        java.lang.String str26 = realMatrixImpl17.toString();
        double[] doubleArray28 = realMatrixImpl17.getColumn((int) (byte) 0);
        org.junit.Assert.assertNotNull(doubleArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray2), "[0.0, 1.0]");
        org.junit.Assert.assertNotNull(doubleArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray6), "[0.0, 1.0]");
        org.junit.Assert.assertNotNull(realMatrix8);
        org.junit.Assert.assertNotNull(doubleArray11);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray11), "[10.0, -1.0]");
        org.junit.Assert.assertNotNull(doubleArray12);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray12), "[-1.0]");
        org.junit.Assert.assertNotNull(doubleArray16);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray16), "[0.0, 1.0]");
        org.junit.Assert.assertNotNull(realMatrix19);
        org.junit.Assert.assertNotNull(doubleArray21);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray21), "[0.0]");
        org.junit.Assert.assertNotNull(realMatrix22);
        org.junit.Assert.assertNotNull(realMatrix24);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
        org.junit.Assert.assertEquals("'" + str26 + "' != '" + "RealMatrixImpl{{0.0},{1.0}}" + "'", str26, "RealMatrixImpl{{0.0},{1.0}}");
        org.junit.Assert.assertNotNull(doubleArray28);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray28), "[0.0, 1.0]");
    }

    @Test
    public void test5517() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5517");
        double[] doubleArray2 = new double[] { 0, 1 };
        org.apache.commons.math.linear.RealMatrixImpl realMatrixImpl3 = new org.apache.commons.math.linear.RealMatrixImpl(doubleArray2);
        double double4 = realMatrixImpl3.getNorm();
        org.apache.commons.math.linear.RealMatrix realMatrix5 = realMatrixImpl3.transpose();
        double[][] doubleArray6 = realMatrixImpl3.getDataRef();
        org.apache.commons.math.linear.RealMatrix realMatrix7 = realMatrixImpl3.copy();
        org.apache.commons.math.linear.RealMatrix realMatrix8 = realMatrixImpl3.copy();
        org.apache.commons.math.linear.RealMatrix realMatrix10 = realMatrixImpl3.scalarAdd((double) (-1L));
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math.linear.RealMatrix realMatrix11 = realMatrixImpl3.inverse();
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math.linear.InvalidMatrixException; message: coefficient matrix is not square");
        } catch (org.apache.commons.math.linear.InvalidMatrixException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(doubleArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray2), "[0.0, 1.0]");
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 1.0d + "'", double4 == 1.0d);
        org.junit.Assert.assertNotNull(realMatrix5);
        org.junit.Assert.assertNotNull(doubleArray6);
        org.junit.Assert.assertNotNull(realMatrix7);
        org.junit.Assert.assertNotNull(realMatrix8);
        org.junit.Assert.assertNotNull(realMatrix10);
    }

    @Test
    public void test5518() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5518");
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
        boolean boolean19 = realMatrixImpl16.isSquare();
        double[] doubleArray22 = new double[] { 0, 1 };
        org.apache.commons.math.linear.RealMatrixImpl realMatrixImpl23 = new org.apache.commons.math.linear.RealMatrixImpl(doubleArray22);
        double double24 = realMatrixImpl23.getNorm();
        org.apache.commons.math.linear.RealMatrix realMatrix25 = realMatrixImpl23.transpose();
        double[][] doubleArray26 = realMatrixImpl23.getDataRef();
        org.apache.commons.math.linear.RealMatrixImpl realMatrixImpl27 = new org.apache.commons.math.linear.RealMatrixImpl(doubleArray26);
        org.apache.commons.math.linear.RealMatrix realMatrix29 = realMatrixImpl27.scalarMultiply((double) (byte) 100);
        boolean boolean30 = realMatrixImpl16.equals((java.lang.Object) realMatrix29);
        java.lang.String str31 = realMatrixImpl16.toString();
        int int32 = realMatrixImpl16.getRowDimension();
        double double35 = realMatrixImpl16.getEntry((int) (byte) 1, 0);
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
        org.junit.Assert.assertNotNull(doubleArray22);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray22), "[0.0, 1.0]");
        org.junit.Assert.assertTrue("'" + double24 + "' != '" + 1.0d + "'", double24 == 1.0d);
        org.junit.Assert.assertNotNull(realMatrix25);
        org.junit.Assert.assertNotNull(doubleArray26);
        org.junit.Assert.assertNotNull(realMatrix29);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + false + "'", boolean30 == false);
        org.junit.Assert.assertEquals("'" + str31 + "' != '" + "RealMatrixImpl{{0.0},{1.0}}" + "'", str31, "RealMatrixImpl{{0.0},{1.0}}");
        org.junit.Assert.assertTrue("'" + int32 + "' != '" + 2 + "'", int32 == 2);
        org.junit.Assert.assertTrue("'" + double35 + "' != '" + 1.0d + "'", double35 == 1.0d);
    }

    @Test
    public void test5519() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5519");
        double[] doubleArray2 = new double[] { 0, 1 };
        org.apache.commons.math.linear.RealMatrixImpl realMatrixImpl3 = new org.apache.commons.math.linear.RealMatrixImpl(doubleArray2);
        double[] doubleArray6 = new double[] { 0, 1 };
        org.apache.commons.math.linear.RealMatrixImpl realMatrixImpl7 = new org.apache.commons.math.linear.RealMatrixImpl(doubleArray6);
        org.apache.commons.math.linear.RealMatrix realMatrix8 = realMatrixImpl3.add((org.apache.commons.math.linear.RealMatrix) realMatrixImpl7);
        double[][] doubleArray9 = realMatrixImpl3.getData();
        org.apache.commons.math.linear.RealMatrixImpl realMatrixImpl10 = new org.apache.commons.math.linear.RealMatrixImpl(doubleArray9);
        boolean boolean11 = realMatrixImpl10.isSquare();
        double double12 = realMatrixImpl10.getNorm();
        // The following exception was thrown during execution in test generation
        try {
            double[] doubleArray14 = realMatrixImpl10.getColumn(5);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math.linear.MatrixIndexException; message: illegal column argument");
        } catch (org.apache.commons.math.linear.MatrixIndexException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(doubleArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray2), "[0.0, 1.0]");
        org.junit.Assert.assertNotNull(doubleArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray6), "[0.0, 1.0]");
        org.junit.Assert.assertNotNull(realMatrix8);
        org.junit.Assert.assertNotNull(doubleArray9);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 1.0d + "'", double12 == 1.0d);
    }

    @Test
    public void test5520() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5520");
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
        double[] doubleArray18 = new double[] { 0, 1 };
        org.apache.commons.math.linear.RealMatrixImpl realMatrixImpl19 = new org.apache.commons.math.linear.RealMatrixImpl(doubleArray18);
        double[] doubleArray22 = new double[] { 0, 1 };
        org.apache.commons.math.linear.RealMatrixImpl realMatrixImpl23 = new org.apache.commons.math.linear.RealMatrixImpl(doubleArray22);
        org.apache.commons.math.linear.RealMatrix realMatrix24 = realMatrixImpl19.add((org.apache.commons.math.linear.RealMatrix) realMatrixImpl23);
        double[] doubleArray27 = new double[] { 0, 1 };
        org.apache.commons.math.linear.RealMatrixImpl realMatrixImpl28 = new org.apache.commons.math.linear.RealMatrixImpl(doubleArray27);
        double[] doubleArray31 = new double[] { 0, 1 };
        org.apache.commons.math.linear.RealMatrixImpl realMatrixImpl32 = new org.apache.commons.math.linear.RealMatrixImpl(doubleArray31);
        org.apache.commons.math.linear.RealMatrix realMatrix33 = realMatrixImpl28.add((org.apache.commons.math.linear.RealMatrix) realMatrixImpl32);
        org.apache.commons.math.linear.RealMatrix realMatrix34 = realMatrixImpl23.subtract((org.apache.commons.math.linear.RealMatrix) realMatrixImpl32);
        boolean boolean35 = realMatrixImpl23.isSquare();
        int int36 = realMatrixImpl23.getColumnDimension();
        double[] doubleArray38 = realMatrixImpl23.getColumn((int) (byte) 0);
        org.apache.commons.math.linear.RealMatrixImpl realMatrixImpl39 = new org.apache.commons.math.linear.RealMatrixImpl(doubleArray38);
        double[] doubleArray40 = realMatrixImpl13.preMultiply(doubleArray38);
        org.apache.commons.math.linear.RealMatrixImpl realMatrixImpl43 = new org.apache.commons.math.linear.RealMatrixImpl((int) (short) 1, 10);
        boolean boolean44 = realMatrixImpl13.equals((java.lang.Object) (short) 1);
        int int45 = realMatrixImpl13.getColumnDimension();
        java.lang.Class<?> wildcardClass46 = realMatrixImpl13.getClass();
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
        org.junit.Assert.assertNotNull(doubleArray18);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray18), "[0.0, 1.0]");
        org.junit.Assert.assertNotNull(doubleArray22);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray22), "[0.0, 1.0]");
        org.junit.Assert.assertNotNull(realMatrix24);
        org.junit.Assert.assertNotNull(doubleArray27);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray27), "[0.0, 1.0]");
        org.junit.Assert.assertNotNull(doubleArray31);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray31), "[0.0, 1.0]");
        org.junit.Assert.assertNotNull(realMatrix33);
        org.junit.Assert.assertNotNull(realMatrix34);
        org.junit.Assert.assertTrue("'" + boolean35 + "' != '" + false + "'", boolean35 == false);
        org.junit.Assert.assertTrue("'" + int36 + "' != '" + 1 + "'", int36 == 1);
        org.junit.Assert.assertNotNull(doubleArray38);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray38), "[0.0, 1.0]");
        org.junit.Assert.assertNotNull(doubleArray40);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray40), "[-1.0]");
        org.junit.Assert.assertTrue("'" + boolean44 + "' != '" + false + "'", boolean44 == false);
        org.junit.Assert.assertTrue("'" + int45 + "' != '" + 1 + "'", int45 == 1);
        org.junit.Assert.assertNotNull(wildcardClass46);
    }

    @Test
    public void test5521() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5521");
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
        boolean boolean16 = realMatrixImpl3.isSingular();
        double[] doubleArray19 = new double[] { 0, 1 };
        org.apache.commons.math.linear.RealMatrixImpl realMatrixImpl20 = new org.apache.commons.math.linear.RealMatrixImpl(doubleArray19);
        org.apache.commons.math.linear.RealMatrix realMatrix22 = realMatrixImpl20.scalarMultiply((double) (short) 100);
        double[][] doubleArray23 = realMatrixImpl20.getDataRef();
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
        boolean boolean43 = realMatrixImpl31.isSquare();
        double double44 = realMatrixImpl31.getNorm();
        double[] doubleArray50 = new double[] { (short) 10, 1.0d, 0.0f, (-1.0f), 0.0d };
        org.apache.commons.math.linear.RealMatrixImpl realMatrixImpl51 = new org.apache.commons.math.linear.RealMatrixImpl(doubleArray50);
        org.apache.commons.math.linear.RealMatrixImpl realMatrixImpl52 = new org.apache.commons.math.linear.RealMatrixImpl(doubleArray50);
        boolean boolean53 = realMatrixImpl31.equals((java.lang.Object) realMatrixImpl52);
        int int54 = realMatrixImpl31.getRowDimension();
        org.apache.commons.math.linear.RealMatrix realMatrix56 = realMatrixImpl31.scalarAdd((-1.0d));
        org.apache.commons.math.linear.RealMatrix realMatrix57 = realMatrixImpl20.subtract((org.apache.commons.math.linear.RealMatrix) realMatrixImpl31);
        org.apache.commons.math.linear.RealMatrix realMatrix58 = realMatrixImpl3.subtract((org.apache.commons.math.linear.RealMatrix) realMatrixImpl31);
        double double59 = realMatrixImpl3.getNorm();
        // The following exception was thrown during execution in test generation
        try {
            double double62 = realMatrixImpl3.getEntry((int) ' ', 3);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math.linear.MatrixIndexException; message: matrix entry does not exist");
        } catch (org.apache.commons.math.linear.MatrixIndexException e) {
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
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertNotNull(doubleArray19);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray19), "[0.0, 1.0]");
        org.junit.Assert.assertNotNull(realMatrix22);
        org.junit.Assert.assertNotNull(doubleArray23);
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
        org.junit.Assert.assertTrue("'" + boolean43 + "' != '" + false + "'", boolean43 == false);
        org.junit.Assert.assertTrue("'" + double44 + "' != '" + 1.0d + "'", double44 == 1.0d);
        org.junit.Assert.assertNotNull(doubleArray50);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray50), "[10.0, 1.0, 0.0, -1.0, 0.0]");
        org.junit.Assert.assertTrue("'" + boolean53 + "' != '" + false + "'", boolean53 == false);
        org.junit.Assert.assertTrue("'" + int54 + "' != '" + 2 + "'", int54 == 2);
        org.junit.Assert.assertNotNull(realMatrix56);
        org.junit.Assert.assertNotNull(realMatrix57);
        org.junit.Assert.assertNotNull(realMatrix58);
        org.junit.Assert.assertTrue("'" + double59 + "' != '" + 1.0d + "'", double59 == 1.0d);
    }

    @Test
    public void test5522() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5522");
        double[] doubleArray2 = new double[] { 0, 1 };
        org.apache.commons.math.linear.RealMatrixImpl realMatrixImpl3 = new org.apache.commons.math.linear.RealMatrixImpl(doubleArray2);
        double double4 = realMatrixImpl3.getNorm();
        org.apache.commons.math.linear.RealMatrix realMatrix5 = realMatrixImpl3.transpose();
        double[] doubleArray7 = realMatrixImpl3.getColumn(0);
        org.apache.commons.math.linear.RealMatrix realMatrix8 = realMatrixImpl3.transpose();
        org.apache.commons.math.linear.RealMatrix realMatrix10 = realMatrixImpl3.scalarMultiply((double) 10L);
        org.apache.commons.math.linear.RealMatrix realMatrix12 = realMatrixImpl3.getRowMatrix((int) (byte) 0);
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
        int int33 = realMatrixImpl20.getColumnDimension();
        double[] doubleArray35 = realMatrixImpl20.getColumn((int) (byte) 0);
        org.apache.commons.math.linear.RealMatrix realMatrix37 = realMatrixImpl20.scalarMultiply((double) (byte) 100);
        int int38 = realMatrixImpl20.getColumnDimension();
        double[][] doubleArray39 = realMatrixImpl20.getData();
        org.apache.commons.math.linear.RealMatrix realMatrix40 = realMatrixImpl3.subtract((org.apache.commons.math.linear.RealMatrix) realMatrixImpl20);
        double[] doubleArray43 = new double[] { 0, 1 };
        org.apache.commons.math.linear.RealMatrixImpl realMatrixImpl44 = new org.apache.commons.math.linear.RealMatrixImpl(doubleArray43);
        double[] doubleArray47 = new double[] { 0, 1 };
        org.apache.commons.math.linear.RealMatrixImpl realMatrixImpl48 = new org.apache.commons.math.linear.RealMatrixImpl(doubleArray47);
        org.apache.commons.math.linear.RealMatrix realMatrix49 = realMatrixImpl44.add((org.apache.commons.math.linear.RealMatrix) realMatrixImpl48);
        double[] doubleArray52 = new double[] { 0, 1 };
        org.apache.commons.math.linear.RealMatrixImpl realMatrixImpl53 = new org.apache.commons.math.linear.RealMatrixImpl(doubleArray52);
        double[] doubleArray56 = new double[] { 0, 1 };
        org.apache.commons.math.linear.RealMatrixImpl realMatrixImpl57 = new org.apache.commons.math.linear.RealMatrixImpl(doubleArray56);
        org.apache.commons.math.linear.RealMatrix realMatrix58 = realMatrixImpl53.add((org.apache.commons.math.linear.RealMatrix) realMatrixImpl57);
        org.apache.commons.math.linear.RealMatrix realMatrix59 = realMatrixImpl48.subtract((org.apache.commons.math.linear.RealMatrix) realMatrixImpl57);
        boolean boolean60 = realMatrixImpl57.isSquare();
        java.lang.Object obj61 = null;
        boolean boolean62 = realMatrixImpl57.equals(obj61);
        org.apache.commons.math.linear.RealMatrix realMatrix64 = realMatrixImpl57.scalarAdd((double) ' ');
        org.apache.commons.math.linear.RealMatrix realMatrix65 = realMatrixImpl3.subtract((org.apache.commons.math.linear.RealMatrix) realMatrixImpl57);
        boolean boolean66 = realMatrixImpl57.isSquare();
        org.junit.Assert.assertNotNull(doubleArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray2), "[0.0, 1.0]");
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 1.0d + "'", double4 == 1.0d);
        org.junit.Assert.assertNotNull(realMatrix5);
        org.junit.Assert.assertNotNull(doubleArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray7), "[0.0, 1.0]");
        org.junit.Assert.assertNotNull(realMatrix8);
        org.junit.Assert.assertNotNull(realMatrix10);
        org.junit.Assert.assertNotNull(realMatrix12);
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
        org.junit.Assert.assertTrue("'" + int33 + "' != '" + 1 + "'", int33 == 1);
        org.junit.Assert.assertNotNull(doubleArray35);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray35), "[0.0, 1.0]");
        org.junit.Assert.assertNotNull(realMatrix37);
        org.junit.Assert.assertTrue("'" + int38 + "' != '" + 1 + "'", int38 == 1);
        org.junit.Assert.assertNotNull(doubleArray39);
        org.junit.Assert.assertNotNull(realMatrix40);
        org.junit.Assert.assertNotNull(doubleArray43);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray43), "[0.0, 1.0]");
        org.junit.Assert.assertNotNull(doubleArray47);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray47), "[0.0, 1.0]");
        org.junit.Assert.assertNotNull(realMatrix49);
        org.junit.Assert.assertNotNull(doubleArray52);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray52), "[0.0, 1.0]");
        org.junit.Assert.assertNotNull(doubleArray56);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray56), "[0.0, 1.0]");
        org.junit.Assert.assertNotNull(realMatrix58);
        org.junit.Assert.assertNotNull(realMatrix59);
        org.junit.Assert.assertTrue("'" + boolean60 + "' != '" + false + "'", boolean60 == false);
        org.junit.Assert.assertTrue("'" + boolean62 + "' != '" + false + "'", boolean62 == false);
        org.junit.Assert.assertNotNull(realMatrix64);
        org.junit.Assert.assertNotNull(realMatrix65);
        org.junit.Assert.assertTrue("'" + boolean66 + "' != '" + false + "'", boolean66 == false);
    }

    @Test
    public void test5523() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5523");
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
        double[] doubleArray19 = new double[] { 0, 1 };
        org.apache.commons.math.linear.RealMatrixImpl realMatrixImpl20 = new org.apache.commons.math.linear.RealMatrixImpl(doubleArray19);
        double[] doubleArray23 = new double[] { 0, 1 };
        org.apache.commons.math.linear.RealMatrixImpl realMatrixImpl24 = new org.apache.commons.math.linear.RealMatrixImpl(doubleArray23);
        org.apache.commons.math.linear.RealMatrix realMatrix25 = realMatrixImpl20.add((org.apache.commons.math.linear.RealMatrix) realMatrixImpl24);
        double[] doubleArray28 = new double[] { 0, 1 };
        org.apache.commons.math.linear.RealMatrixImpl realMatrixImpl29 = new org.apache.commons.math.linear.RealMatrixImpl(doubleArray28);
        double[] doubleArray32 = new double[] { 0, 1 };
        org.apache.commons.math.linear.RealMatrixImpl realMatrixImpl33 = new org.apache.commons.math.linear.RealMatrixImpl(doubleArray32);
        org.apache.commons.math.linear.RealMatrix realMatrix34 = realMatrixImpl29.add((org.apache.commons.math.linear.RealMatrix) realMatrixImpl33);
        org.apache.commons.math.linear.RealMatrix realMatrix35 = realMatrixImpl24.subtract((org.apache.commons.math.linear.RealMatrix) realMatrixImpl33);
        double[] doubleArray38 = new double[] { 0, 1 };
        org.apache.commons.math.linear.RealMatrixImpl realMatrixImpl39 = new org.apache.commons.math.linear.RealMatrixImpl(doubleArray38);
        double[] doubleArray42 = new double[] { 0, 1 };
        org.apache.commons.math.linear.RealMatrixImpl realMatrixImpl43 = new org.apache.commons.math.linear.RealMatrixImpl(doubleArray42);
        org.apache.commons.math.linear.RealMatrix realMatrix44 = realMatrixImpl39.add((org.apache.commons.math.linear.RealMatrix) realMatrixImpl43);
        double[] doubleArray47 = new double[] { 10.0d, (short) -1 };
        double[] doubleArray48 = realMatrixImpl39.preMultiply(doubleArray47);
        org.apache.commons.math.linear.RealMatrix realMatrix49 = realMatrixImpl33.subtract((org.apache.commons.math.linear.RealMatrix) realMatrixImpl39);
        double[] doubleArray52 = new double[] { 0, 1 };
        org.apache.commons.math.linear.RealMatrixImpl realMatrixImpl53 = new org.apache.commons.math.linear.RealMatrixImpl(doubleArray52);
        double double54 = realMatrixImpl53.getNorm();
        org.apache.commons.math.linear.RealMatrix realMatrix55 = realMatrixImpl53.transpose();
        org.apache.commons.math.linear.RealMatrix realMatrix56 = realMatrixImpl33.add((org.apache.commons.math.linear.RealMatrix) realMatrixImpl53);
        double[] doubleArray59 = new double[] { 0, 1 };
        org.apache.commons.math.linear.RealMatrixImpl realMatrixImpl60 = new org.apache.commons.math.linear.RealMatrixImpl(doubleArray59);
        double[] doubleArray63 = new double[] { 0, 1 };
        org.apache.commons.math.linear.RealMatrixImpl realMatrixImpl64 = new org.apache.commons.math.linear.RealMatrixImpl(doubleArray63);
        org.apache.commons.math.linear.RealMatrix realMatrix65 = realMatrixImpl60.add((org.apache.commons.math.linear.RealMatrix) realMatrixImpl64);
        double[] doubleArray68 = new double[] { 10.0d, (short) -1 };
        double[] doubleArray69 = realMatrixImpl60.preMultiply(doubleArray68);
        org.apache.commons.math.linear.RealMatrixImpl realMatrixImpl70 = new org.apache.commons.math.linear.RealMatrixImpl(doubleArray68);
        boolean boolean71 = realMatrixImpl70.isSingular();
        double double72 = realMatrixImpl70.getNorm();
        int int73 = realMatrixImpl70.getColumnDimension();
        org.apache.commons.math.linear.RealMatrix realMatrix75 = realMatrixImpl70.scalarMultiply((double) 5);
        org.apache.commons.math.linear.RealMatrix realMatrix76 = realMatrixImpl53.add((org.apache.commons.math.linear.RealMatrix) realMatrixImpl70);
        org.apache.commons.math.linear.RealMatrix realMatrix78 = realMatrixImpl70.getRowMatrix(1);
        org.apache.commons.math.linear.RealMatrix realMatrix79 = realMatrixImpl16.add((org.apache.commons.math.linear.RealMatrix) realMatrixImpl70);
        org.apache.commons.math.linear.RealMatrix realMatrix81 = realMatrixImpl70.scalarAdd((double) (byte) -1);
        double[][] doubleArray82 = realMatrixImpl70.getData();
        double[][] doubleArray83 = realMatrixImpl70.getData();
        double[][] doubleArray84 = realMatrixImpl70.getDataRef();
        org.apache.commons.math.linear.RealMatrix realMatrix85 = realMatrixImpl70.copy();
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
        org.junit.Assert.assertNotNull(doubleArray19);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray19), "[0.0, 1.0]");
        org.junit.Assert.assertNotNull(doubleArray23);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray23), "[0.0, 1.0]");
        org.junit.Assert.assertNotNull(realMatrix25);
        org.junit.Assert.assertNotNull(doubleArray28);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray28), "[0.0, 1.0]");
        org.junit.Assert.assertNotNull(doubleArray32);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray32), "[0.0, 1.0]");
        org.junit.Assert.assertNotNull(realMatrix34);
        org.junit.Assert.assertNotNull(realMatrix35);
        org.junit.Assert.assertNotNull(doubleArray38);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray38), "[0.0, 1.0]");
        org.junit.Assert.assertNotNull(doubleArray42);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray42), "[0.0, 1.0]");
        org.junit.Assert.assertNotNull(realMatrix44);
        org.junit.Assert.assertNotNull(doubleArray47);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray47), "[10.0, -1.0]");
        org.junit.Assert.assertNotNull(doubleArray48);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray48), "[-1.0]");
        org.junit.Assert.assertNotNull(realMatrix49);
        org.junit.Assert.assertNotNull(doubleArray52);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray52), "[0.0, 1.0]");
        org.junit.Assert.assertTrue("'" + double54 + "' != '" + 1.0d + "'", double54 == 1.0d);
        org.junit.Assert.assertNotNull(realMatrix55);
        org.junit.Assert.assertNotNull(realMatrix56);
        org.junit.Assert.assertNotNull(doubleArray59);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray59), "[0.0, 1.0]");
        org.junit.Assert.assertNotNull(doubleArray63);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray63), "[0.0, 1.0]");
        org.junit.Assert.assertNotNull(realMatrix65);
        org.junit.Assert.assertNotNull(doubleArray68);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray68), "[10.0, -1.0]");
        org.junit.Assert.assertNotNull(doubleArray69);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray69), "[-1.0]");
        org.junit.Assert.assertTrue("'" + boolean71 + "' != '" + true + "'", boolean71 == true);
        org.junit.Assert.assertTrue("'" + double72 + "' != '" + 11.0d + "'", double72 == 11.0d);
        org.junit.Assert.assertTrue("'" + int73 + "' != '" + 1 + "'", int73 == 1);
        org.junit.Assert.assertNotNull(realMatrix75);
        org.junit.Assert.assertNotNull(realMatrix76);
        org.junit.Assert.assertNotNull(realMatrix78);
        org.junit.Assert.assertNotNull(realMatrix79);
        org.junit.Assert.assertNotNull(realMatrix81);
        org.junit.Assert.assertNotNull(doubleArray82);
        org.junit.Assert.assertNotNull(doubleArray83);
        org.junit.Assert.assertNotNull(doubleArray84);
        org.junit.Assert.assertNotNull(realMatrix85);
    }

    @Test
    public void test5524() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5524");
        double[] doubleArray2 = new double[] { 0, 1 };
        org.apache.commons.math.linear.RealMatrixImpl realMatrixImpl3 = new org.apache.commons.math.linear.RealMatrixImpl(doubleArray2);
        org.apache.commons.math.linear.RealMatrix realMatrix5 = realMatrixImpl3.scalarMultiply((double) (short) 100);
        double[][] doubleArray6 = realMatrixImpl3.getData();
        org.apache.commons.math.linear.RealMatrixImpl realMatrixImpl7 = new org.apache.commons.math.linear.RealMatrixImpl(doubleArray6);
        boolean boolean8 = realMatrixImpl7.isSingular();
        // The following exception was thrown during execution in test generation
        try {
            double[] doubleArray10 = realMatrixImpl7.getColumn((int) (short) -1);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math.linear.MatrixIndexException; message: illegal column argument");
        } catch (org.apache.commons.math.linear.MatrixIndexException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(doubleArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray2), "[0.0, 1.0]");
        org.junit.Assert.assertNotNull(realMatrix5);
        org.junit.Assert.assertNotNull(doubleArray6);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
    }

    @Test
    public void test5525() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5525");
        double[] doubleArray2 = new double[] { 0, 1 };
        org.apache.commons.math.linear.RealMatrixImpl realMatrixImpl3 = new org.apache.commons.math.linear.RealMatrixImpl(doubleArray2);
        double[][] doubleArray4 = realMatrixImpl3.getDataRef();
        org.apache.commons.math.linear.RealMatrixImpl realMatrixImpl5 = new org.apache.commons.math.linear.RealMatrixImpl(doubleArray4);
        org.apache.commons.math.linear.RealMatrix realMatrix7 = realMatrixImpl5.scalarAdd((double) (short) -1);
        double[][] doubleArray8 = realMatrixImpl5.getDataRef();
        org.junit.Assert.assertNotNull(doubleArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray2), "[0.0, 1.0]");
        org.junit.Assert.assertNotNull(doubleArray4);
        org.junit.Assert.assertNotNull(realMatrix7);
        org.junit.Assert.assertNotNull(doubleArray8);
    }

    @Test
    public void test5526() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5526");
        double[] doubleArray2 = new double[] { 0, 1 };
        org.apache.commons.math.linear.RealMatrixImpl realMatrixImpl3 = new org.apache.commons.math.linear.RealMatrixImpl(doubleArray2);
        double[] doubleArray6 = new double[] { 0, 1 };
        org.apache.commons.math.linear.RealMatrixImpl realMatrixImpl7 = new org.apache.commons.math.linear.RealMatrixImpl(doubleArray6);
        org.apache.commons.math.linear.RealMatrix realMatrix8 = realMatrixImpl3.add((org.apache.commons.math.linear.RealMatrix) realMatrixImpl7);
        boolean boolean9 = realMatrixImpl3.isSquare();
        int int10 = realMatrixImpl3.getColumnDimension();
        double double11 = realMatrixImpl3.getNorm();
        java.lang.String str12 = realMatrixImpl3.toString();
        int int13 = realMatrixImpl3.getRowDimension();
        double[] doubleArray15 = realMatrixImpl3.getRow(1);
        int int16 = realMatrixImpl3.getColumnDimension();
        double[] doubleArray19 = new double[] { 0, 1 };
        org.apache.commons.math.linear.RealMatrixImpl realMatrixImpl20 = new org.apache.commons.math.linear.RealMatrixImpl(doubleArray19);
        double[] doubleArray23 = new double[] { 0, 1 };
        org.apache.commons.math.linear.RealMatrixImpl realMatrixImpl24 = new org.apache.commons.math.linear.RealMatrixImpl(doubleArray23);
        org.apache.commons.math.linear.RealMatrix realMatrix25 = realMatrixImpl20.add((org.apache.commons.math.linear.RealMatrix) realMatrixImpl24);
        double[] doubleArray28 = new double[] { 10.0d, (short) -1 };
        double[] doubleArray29 = realMatrixImpl20.preMultiply(doubleArray28);
        org.apache.commons.math.linear.RealMatrixImpl realMatrixImpl30 = new org.apache.commons.math.linear.RealMatrixImpl(doubleArray28);
        java.lang.String str31 = realMatrixImpl30.toString();
        double[] doubleArray34 = new double[] { 0, 1 };
        org.apache.commons.math.linear.RealMatrixImpl realMatrixImpl35 = new org.apache.commons.math.linear.RealMatrixImpl(doubleArray34);
        org.apache.commons.math.linear.RealMatrix realMatrix37 = realMatrixImpl35.scalarMultiply((double) (short) 100);
        double[][] doubleArray38 = realMatrixImpl35.getDataRef();
        org.apache.commons.math.linear.RealMatrix realMatrix39 = realMatrixImpl30.subtract((org.apache.commons.math.linear.RealMatrix) realMatrixImpl35);
        double double40 = realMatrixImpl30.getNorm();
        double[] doubleArray43 = new double[] { 0, 1 };
        org.apache.commons.math.linear.RealMatrixImpl realMatrixImpl44 = new org.apache.commons.math.linear.RealMatrixImpl(doubleArray43);
        double[] doubleArray47 = new double[] { 0, 1 };
        org.apache.commons.math.linear.RealMatrixImpl realMatrixImpl48 = new org.apache.commons.math.linear.RealMatrixImpl(doubleArray47);
        org.apache.commons.math.linear.RealMatrix realMatrix49 = realMatrixImpl44.add((org.apache.commons.math.linear.RealMatrix) realMatrixImpl48);
        double[] doubleArray52 = new double[] { 0, 1 };
        org.apache.commons.math.linear.RealMatrixImpl realMatrixImpl53 = new org.apache.commons.math.linear.RealMatrixImpl(doubleArray52);
        double[] doubleArray56 = new double[] { 0, 1 };
        org.apache.commons.math.linear.RealMatrixImpl realMatrixImpl57 = new org.apache.commons.math.linear.RealMatrixImpl(doubleArray56);
        org.apache.commons.math.linear.RealMatrix realMatrix58 = realMatrixImpl53.add((org.apache.commons.math.linear.RealMatrix) realMatrixImpl57);
        org.apache.commons.math.linear.RealMatrix realMatrix59 = realMatrixImpl48.subtract((org.apache.commons.math.linear.RealMatrix) realMatrixImpl57);
        double double60 = realMatrixImpl48.getNorm();
        org.apache.commons.math.linear.RealMatrix realMatrix61 = realMatrixImpl48.transpose();
        org.apache.commons.math.linear.RealMatrix realMatrix63 = realMatrixImpl48.scalarMultiply((double) (short) 10);
        org.apache.commons.math.linear.RealMatrix realMatrix64 = realMatrixImpl30.subtract((org.apache.commons.math.linear.RealMatrix) realMatrixImpl48);
        double[][] doubleArray65 = realMatrixImpl30.getDataRef();
        org.apache.commons.math.linear.RealMatrix realMatrix67 = realMatrixImpl30.scalarMultiply((double) (byte) 10);
        org.apache.commons.math.linear.RealMatrix realMatrix68 = realMatrixImpl3.subtract(realMatrix67);
        org.apache.commons.math.linear.RealMatrix realMatrix69 = realMatrixImpl3.copy();
        org.junit.Assert.assertNotNull(doubleArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray2), "[0.0, 1.0]");
        org.junit.Assert.assertNotNull(doubleArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray6), "[0.0, 1.0]");
        org.junit.Assert.assertNotNull(realMatrix8);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 1 + "'", int10 == 1);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 1.0d + "'", double11 == 1.0d);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "RealMatrixImpl{{0.0},{1.0}}" + "'", str12, "RealMatrixImpl{{0.0},{1.0}}");
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 2 + "'", int13 == 2);
        org.junit.Assert.assertNotNull(doubleArray15);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray15), "[1.0]");
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 1 + "'", int16 == 1);
        org.junit.Assert.assertNotNull(doubleArray19);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray19), "[0.0, 1.0]");
        org.junit.Assert.assertNotNull(doubleArray23);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray23), "[0.0, 1.0]");
        org.junit.Assert.assertNotNull(realMatrix25);
        org.junit.Assert.assertNotNull(doubleArray28);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray28), "[10.0, -1.0]");
        org.junit.Assert.assertNotNull(doubleArray29);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray29), "[-1.0]");
        org.junit.Assert.assertEquals("'" + str31 + "' != '" + "RealMatrixImpl{{10.0},{-1.0}}" + "'", str31, "RealMatrixImpl{{10.0},{-1.0}}");
        org.junit.Assert.assertNotNull(doubleArray34);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray34), "[0.0, 1.0]");
        org.junit.Assert.assertNotNull(realMatrix37);
        org.junit.Assert.assertNotNull(doubleArray38);
        org.junit.Assert.assertNotNull(realMatrix39);
        org.junit.Assert.assertTrue("'" + double40 + "' != '" + 11.0d + "'", double40 == 11.0d);
        org.junit.Assert.assertNotNull(doubleArray43);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray43), "[0.0, 1.0]");
        org.junit.Assert.assertNotNull(doubleArray47);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray47), "[0.0, 1.0]");
        org.junit.Assert.assertNotNull(realMatrix49);
        org.junit.Assert.assertNotNull(doubleArray52);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray52), "[0.0, 1.0]");
        org.junit.Assert.assertNotNull(doubleArray56);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray56), "[0.0, 1.0]");
        org.junit.Assert.assertNotNull(realMatrix58);
        org.junit.Assert.assertNotNull(realMatrix59);
        org.junit.Assert.assertTrue("'" + double60 + "' != '" + 1.0d + "'", double60 == 1.0d);
        org.junit.Assert.assertNotNull(realMatrix61);
        org.junit.Assert.assertNotNull(realMatrix63);
        org.junit.Assert.assertNotNull(realMatrix64);
        org.junit.Assert.assertNotNull(doubleArray65);
        org.junit.Assert.assertNotNull(realMatrix67);
        org.junit.Assert.assertNotNull(realMatrix68);
        org.junit.Assert.assertNotNull(realMatrix69);
    }

    @Test
    public void test5527() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5527");
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
        int int17 = realMatrixImpl13.getRowDimension();
        org.apache.commons.math.linear.RealMatrix realMatrix19 = realMatrixImpl13.getRowMatrix(0);
        double double20 = realMatrixImpl13.getNorm();
        org.apache.commons.math.linear.RealMatrix realMatrix22 = realMatrixImpl13.scalarMultiply((double) '4');
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
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 2 + "'", int17 == 2);
        org.junit.Assert.assertNotNull(realMatrix19);
        org.junit.Assert.assertTrue("'" + double20 + "' != '" + 11.0d + "'", double20 == 11.0d);
        org.junit.Assert.assertNotNull(realMatrix22);
    }

    @Test
    public void test5528() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5528");
        org.apache.commons.math.linear.RealMatrixImpl realMatrixImpl2 = new org.apache.commons.math.linear.RealMatrixImpl((int) '4', (int) 'a');
        double[][] doubleArray3 = realMatrixImpl2.getDataRef();
        boolean boolean4 = realMatrixImpl2.isSingular();
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math.linear.RealMatrix realMatrix6 = realMatrixImpl2.getColumnMatrix(97);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math.linear.MatrixIndexException; message: illegal column argument");
        } catch (org.apache.commons.math.linear.MatrixIndexException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(doubleArray3);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
    }

    @Test
    public void test5529() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5529");
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
        int int22 = realMatrixImpl7.getColumnDimension();
        org.apache.commons.math.linear.RealMatrix realMatrix23 = realMatrixImpl7.transpose();
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
        boolean boolean43 = realMatrixImpl31.isSquare();
        double double44 = realMatrixImpl31.getNorm();
        double[] doubleArray50 = new double[] { (short) 10, 1.0d, 0.0f, (-1.0f), 0.0d };
        org.apache.commons.math.linear.RealMatrixImpl realMatrixImpl51 = new org.apache.commons.math.linear.RealMatrixImpl(doubleArray50);
        org.apache.commons.math.linear.RealMatrixImpl realMatrixImpl52 = new org.apache.commons.math.linear.RealMatrixImpl(doubleArray50);
        boolean boolean53 = realMatrixImpl31.equals((java.lang.Object) realMatrixImpl52);
        int int54 = realMatrixImpl31.getRowDimension();
        org.apache.commons.math.linear.RealMatrix realMatrix56 = realMatrixImpl31.scalarAdd((-1.0d));
        org.apache.commons.math.linear.RealMatrix realMatrix58 = realMatrixImpl31.scalarAdd((double) (short) 1);
        boolean boolean59 = realMatrixImpl7.equals((java.lang.Object) realMatrixImpl31);
        org.apache.commons.math.linear.RealMatrixImpl realMatrixImpl62 = new org.apache.commons.math.linear.RealMatrixImpl(100, (int) (byte) 1);
        double[] doubleArray65 = new double[] { 0, 1 };
        org.apache.commons.math.linear.RealMatrixImpl realMatrixImpl66 = new org.apache.commons.math.linear.RealMatrixImpl(doubleArray65);
        double[] doubleArray69 = new double[] { 0, 1 };
        org.apache.commons.math.linear.RealMatrixImpl realMatrixImpl70 = new org.apache.commons.math.linear.RealMatrixImpl(doubleArray69);
        org.apache.commons.math.linear.RealMatrix realMatrix71 = realMatrixImpl66.add((org.apache.commons.math.linear.RealMatrix) realMatrixImpl70);
        boolean boolean72 = realMatrixImpl66.isSquare();
        int int73 = realMatrixImpl66.getColumnDimension();
        double double74 = realMatrixImpl66.getNorm();
        boolean boolean75 = realMatrixImpl62.equals((java.lang.Object) realMatrixImpl66);
        boolean boolean76 = realMatrixImpl66.isSingular();
        org.apache.commons.math.linear.RealMatrix realMatrix78 = realMatrixImpl66.scalarAdd((double) (-1.0f));
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math.linear.RealMatrix realMatrix79 = realMatrixImpl31.preMultiply(realMatrix78);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Matrices are not multiplication compatible.");
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
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertTrue("'" + double20 + "' != '" + 1.0d + "'", double20 == 1.0d);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + true + "'", boolean21 == true);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 1 + "'", int22 == 1);
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
        org.junit.Assert.assertTrue("'" + boolean43 + "' != '" + false + "'", boolean43 == false);
        org.junit.Assert.assertTrue("'" + double44 + "' != '" + 1.0d + "'", double44 == 1.0d);
        org.junit.Assert.assertNotNull(doubleArray50);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray50), "[10.0, 1.0, 0.0, -1.0, 0.0]");
        org.junit.Assert.assertTrue("'" + boolean53 + "' != '" + false + "'", boolean53 == false);
        org.junit.Assert.assertTrue("'" + int54 + "' != '" + 2 + "'", int54 == 2);
        org.junit.Assert.assertNotNull(realMatrix56);
        org.junit.Assert.assertNotNull(realMatrix58);
        org.junit.Assert.assertTrue("'" + boolean59 + "' != '" + true + "'", boolean59 == true);
        org.junit.Assert.assertNotNull(doubleArray65);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray65), "[0.0, 1.0]");
        org.junit.Assert.assertNotNull(doubleArray69);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray69), "[0.0, 1.0]");
        org.junit.Assert.assertNotNull(realMatrix71);
        org.junit.Assert.assertTrue("'" + boolean72 + "' != '" + false + "'", boolean72 == false);
        org.junit.Assert.assertTrue("'" + int73 + "' != '" + 1 + "'", int73 == 1);
        org.junit.Assert.assertTrue("'" + double74 + "' != '" + 1.0d + "'", double74 == 1.0d);
        org.junit.Assert.assertTrue("'" + boolean75 + "' != '" + false + "'", boolean75 == false);
        org.junit.Assert.assertTrue("'" + boolean76 + "' != '" + true + "'", boolean76 == true);
        org.junit.Assert.assertNotNull(realMatrix78);
    }

    @Test
    public void test5530() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5530");
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
        double[] doubleArray39 = new double[] { 0, 1 };
        org.apache.commons.math.linear.RealMatrixImpl realMatrixImpl40 = new org.apache.commons.math.linear.RealMatrixImpl(doubleArray39);
        org.apache.commons.math.linear.RealMatrix realMatrix41 = realMatrixImpl36.add((org.apache.commons.math.linear.RealMatrix) realMatrixImpl40);
        boolean boolean42 = realMatrixImpl36.isSquare();
        org.apache.commons.math.linear.RealMatrix realMatrix44 = realMatrixImpl36.scalarAdd((double) (short) -1);
        org.apache.commons.math.linear.RealMatrix realMatrix45 = realMatrixImpl22.subtract(realMatrix44);
        org.apache.commons.math.linear.RealMatrix realMatrix47 = realMatrixImpl22.getRowMatrix((int) (short) 1);
        double[] doubleArray50 = new double[] { 0, 1 };
        org.apache.commons.math.linear.RealMatrixImpl realMatrixImpl51 = new org.apache.commons.math.linear.RealMatrixImpl(doubleArray50);
        double[] doubleArray54 = new double[] { 0, 1 };
        org.apache.commons.math.linear.RealMatrixImpl realMatrixImpl55 = new org.apache.commons.math.linear.RealMatrixImpl(doubleArray54);
        org.apache.commons.math.linear.RealMatrix realMatrix56 = realMatrixImpl51.add((org.apache.commons.math.linear.RealMatrix) realMatrixImpl55);
        double[] doubleArray59 = new double[] { 10.0d, (short) -1 };
        double[] doubleArray60 = realMatrixImpl51.preMultiply(doubleArray59);
        org.apache.commons.math.linear.RealMatrixImpl realMatrixImpl61 = new org.apache.commons.math.linear.RealMatrixImpl(doubleArray59);
        double[] doubleArray64 = new double[] { 0, 1 };
        org.apache.commons.math.linear.RealMatrixImpl realMatrixImpl65 = new org.apache.commons.math.linear.RealMatrixImpl(doubleArray64);
        org.apache.commons.math.linear.RealMatrix realMatrix67 = realMatrixImpl65.scalarMultiply((double) (short) 100);
        double[] doubleArray69 = realMatrixImpl65.getRow(0);
        org.apache.commons.math.linear.RealMatrix realMatrix70 = realMatrixImpl61.add((org.apache.commons.math.linear.RealMatrix) realMatrixImpl65);
        double[] doubleArray72 = realMatrixImpl61.getRow(0);
        // The following exception was thrown during execution in test generation
        try {
            double[] doubleArray73 = realMatrixImpl22.operate(doubleArray72);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 1");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
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
        org.junit.Assert.assertNotNull(doubleArray39);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray39), "[0.0, 1.0]");
        org.junit.Assert.assertNotNull(realMatrix41);
        org.junit.Assert.assertTrue("'" + boolean42 + "' != '" + false + "'", boolean42 == false);
        org.junit.Assert.assertNotNull(realMatrix44);
        org.junit.Assert.assertNotNull(realMatrix45);
        org.junit.Assert.assertNotNull(realMatrix47);
        org.junit.Assert.assertNotNull(doubleArray50);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray50), "[0.0, 1.0]");
        org.junit.Assert.assertNotNull(doubleArray54);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray54), "[0.0, 1.0]");
        org.junit.Assert.assertNotNull(realMatrix56);
        org.junit.Assert.assertNotNull(doubleArray59);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray59), "[10.0, -1.0]");
        org.junit.Assert.assertNotNull(doubleArray60);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray60), "[-1.0]");
        org.junit.Assert.assertNotNull(doubleArray64);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray64), "[0.0, 1.0]");
        org.junit.Assert.assertNotNull(realMatrix67);
        org.junit.Assert.assertNotNull(doubleArray69);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray69), "[0.0]");
        org.junit.Assert.assertNotNull(realMatrix70);
        org.junit.Assert.assertNotNull(doubleArray72);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray72), "[10.0]");
    }

    @Test
    public void test5531() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5531");
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
        int int22 = realMatrixImpl7.getColumnDimension();
        org.apache.commons.math.linear.RealMatrix realMatrix23 = realMatrixImpl7.transpose();
        double[][] doubleArray24 = realMatrixImpl7.getDataRef();
        org.apache.commons.math.linear.RealMatrixImpl realMatrixImpl25 = new org.apache.commons.math.linear.RealMatrixImpl(doubleArray24);
        double[] doubleArray28 = new double[] { 0, 1 };
        org.apache.commons.math.linear.RealMatrixImpl realMatrixImpl29 = new org.apache.commons.math.linear.RealMatrixImpl(doubleArray28);
        double double30 = realMatrixImpl29.getNorm();
        double[][] doubleArray31 = realMatrixImpl29.getDataRef();
        double[] doubleArray34 = new double[] { 0, 1 };
        org.apache.commons.math.linear.RealMatrixImpl realMatrixImpl35 = new org.apache.commons.math.linear.RealMatrixImpl(doubleArray34);
        double[] doubleArray38 = new double[] { 0, 1 };
        org.apache.commons.math.linear.RealMatrixImpl realMatrixImpl39 = new org.apache.commons.math.linear.RealMatrixImpl(doubleArray38);
        org.apache.commons.math.linear.RealMatrix realMatrix40 = realMatrixImpl35.add((org.apache.commons.math.linear.RealMatrix) realMatrixImpl39);
        double[] doubleArray43 = new double[] { 10.0d, (short) -1 };
        double[] doubleArray44 = realMatrixImpl35.preMultiply(doubleArray43);
        boolean boolean45 = realMatrixImpl35.isSingular();
        double[] doubleArray47 = realMatrixImpl35.getColumn((int) (byte) 0);
        double[] doubleArray48 = realMatrixImpl29.preMultiply(doubleArray47);
        org.apache.commons.math.linear.RealMatrixImpl realMatrixImpl49 = new org.apache.commons.math.linear.RealMatrixImpl(doubleArray48);
        org.apache.commons.math.linear.RealMatrixImpl realMatrixImpl50 = new org.apache.commons.math.linear.RealMatrixImpl(doubleArray48);
        // The following exception was thrown during execution in test generation
        try {
            double[] doubleArray51 = realMatrixImpl25.solve(doubleArray48);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: constant vector has wrong length");
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
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertTrue("'" + double20 + "' != '" + 1.0d + "'", double20 == 1.0d);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + true + "'", boolean21 == true);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 1 + "'", int22 == 1);
        org.junit.Assert.assertNotNull(realMatrix23);
        org.junit.Assert.assertNotNull(doubleArray24);
        org.junit.Assert.assertNotNull(doubleArray28);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray28), "[0.0, 1.0]");
        org.junit.Assert.assertTrue("'" + double30 + "' != '" + 1.0d + "'", double30 == 1.0d);
        org.junit.Assert.assertNotNull(doubleArray31);
        org.junit.Assert.assertNotNull(doubleArray34);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray34), "[0.0, 1.0]");
        org.junit.Assert.assertNotNull(doubleArray38);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray38), "[0.0, 1.0]");
        org.junit.Assert.assertNotNull(realMatrix40);
        org.junit.Assert.assertNotNull(doubleArray43);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray43), "[10.0, -1.0]");
        org.junit.Assert.assertNotNull(doubleArray44);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray44), "[-1.0]");
        org.junit.Assert.assertTrue("'" + boolean45 + "' != '" + true + "'", boolean45 == true);
        org.junit.Assert.assertNotNull(doubleArray47);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray47), "[0.0, 1.0]");
        org.junit.Assert.assertNotNull(doubleArray48);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray48), "[1.0]");
    }

    @Test
    public void test5532() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5532");
        double[] doubleArray2 = new double[] { 0, 1 };
        org.apache.commons.math.linear.RealMatrixImpl realMatrixImpl3 = new org.apache.commons.math.linear.RealMatrixImpl(doubleArray2);
        double[] doubleArray6 = new double[] { 0, 1 };
        org.apache.commons.math.linear.RealMatrixImpl realMatrixImpl7 = new org.apache.commons.math.linear.RealMatrixImpl(doubleArray6);
        org.apache.commons.math.linear.RealMatrix realMatrix8 = realMatrixImpl3.add((org.apache.commons.math.linear.RealMatrix) realMatrixImpl7);
        double[][] doubleArray9 = realMatrixImpl3.getData();
        org.apache.commons.math.linear.RealMatrixImpl realMatrixImpl10 = new org.apache.commons.math.linear.RealMatrixImpl(doubleArray9);
        double[][] doubleArray11 = realMatrixImpl10.getData();
        boolean boolean12 = realMatrixImpl10.isSquare();
        // The following exception was thrown during execution in test generation
        try {
            double double13 = realMatrixImpl10.getDeterminant();
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math.linear.InvalidMatrixException; message: matrix is not square");
        } catch (org.apache.commons.math.linear.InvalidMatrixException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(doubleArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray2), "[0.0, 1.0]");
        org.junit.Assert.assertNotNull(doubleArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray6), "[0.0, 1.0]");
        org.junit.Assert.assertNotNull(realMatrix8);
        org.junit.Assert.assertNotNull(doubleArray9);
        org.junit.Assert.assertNotNull(doubleArray11);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
    }

    @Test
    public void test5533() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5533");
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
        org.apache.commons.math.linear.RealMatrix realMatrix22 = realMatrixImpl7.copy();
        org.apache.commons.math.linear.RealMatrix realMatrix23 = realMatrixImpl7.transpose();
        double[] doubleArray26 = new double[] { 0, 1 };
        org.apache.commons.math.linear.RealMatrixImpl realMatrixImpl27 = new org.apache.commons.math.linear.RealMatrixImpl(doubleArray26);
        double double28 = realMatrixImpl27.getNorm();
        double[] doubleArray31 = new double[] { 0, 1 };
        org.apache.commons.math.linear.RealMatrixImpl realMatrixImpl32 = new org.apache.commons.math.linear.RealMatrixImpl(doubleArray31);
        double double33 = realMatrixImpl32.getNorm();
        org.apache.commons.math.linear.RealMatrix realMatrix34 = realMatrixImpl32.transpose();
        double[] doubleArray36 = realMatrixImpl32.getColumn(0);
        double[] doubleArray37 = realMatrixImpl27.preMultiply(doubleArray36);
        org.apache.commons.math.linear.RealMatrix realMatrix39 = realMatrixImpl27.scalarAdd((double) (short) 10);
        boolean boolean40 = realMatrixImpl27.isSingular();
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math.linear.RealMatrix realMatrix41 = realMatrixImpl7.solve((org.apache.commons.math.linear.RealMatrix) realMatrixImpl27);
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
        org.junit.Assert.assertTrue("'" + double20 + "' != '" + 1.0d + "'", double20 == 1.0d);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + true + "'", boolean21 == true);
        org.junit.Assert.assertNotNull(realMatrix22);
        org.junit.Assert.assertNotNull(realMatrix23);
        org.junit.Assert.assertNotNull(doubleArray26);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray26), "[0.0, 1.0]");
        org.junit.Assert.assertTrue("'" + double28 + "' != '" + 1.0d + "'", double28 == 1.0d);
        org.junit.Assert.assertNotNull(doubleArray31);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray31), "[0.0, 1.0]");
        org.junit.Assert.assertTrue("'" + double33 + "' != '" + 1.0d + "'", double33 == 1.0d);
        org.junit.Assert.assertNotNull(realMatrix34);
        org.junit.Assert.assertNotNull(doubleArray36);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray36), "[0.0, 1.0]");
        org.junit.Assert.assertNotNull(doubleArray37);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray37), "[1.0]");
        org.junit.Assert.assertNotNull(realMatrix39);
        org.junit.Assert.assertTrue("'" + boolean40 + "' != '" + true + "'", boolean40 == true);
    }

    @Test
    public void test5534() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5534");
        double[] doubleArray2 = new double[] { 0, 1 };
        org.apache.commons.math.linear.RealMatrixImpl realMatrixImpl3 = new org.apache.commons.math.linear.RealMatrixImpl(doubleArray2);
        double[] doubleArray6 = new double[] { 0, 1 };
        org.apache.commons.math.linear.RealMatrixImpl realMatrixImpl7 = new org.apache.commons.math.linear.RealMatrixImpl(doubleArray6);
        org.apache.commons.math.linear.RealMatrix realMatrix8 = realMatrixImpl3.add((org.apache.commons.math.linear.RealMatrix) realMatrixImpl7);
        boolean boolean9 = realMatrixImpl3.isSquare();
        org.apache.commons.math.linear.RealMatrix realMatrix10 = realMatrixImpl3.copy();
        org.apache.commons.math.linear.RealMatrix realMatrix12 = realMatrixImpl3.scalarAdd((double) (short) -1);
        // The following exception was thrown during execution in test generation
        try {
            double double15 = realMatrixImpl3.getEntry((int) (short) 100, 2);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math.linear.MatrixIndexException; message: matrix entry does not exist");
        } catch (org.apache.commons.math.linear.MatrixIndexException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(doubleArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray2), "[0.0, 1.0]");
        org.junit.Assert.assertNotNull(doubleArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray6), "[0.0, 1.0]");
        org.junit.Assert.assertNotNull(realMatrix8);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNotNull(realMatrix10);
        org.junit.Assert.assertNotNull(realMatrix12);
    }

    @Test
    public void test5535() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5535");
        double[] doubleArray2 = new double[] { 0, 1 };
        org.apache.commons.math.linear.RealMatrixImpl realMatrixImpl3 = new org.apache.commons.math.linear.RealMatrixImpl(doubleArray2);
        double[] doubleArray6 = new double[] { 0, 1 };
        org.apache.commons.math.linear.RealMatrixImpl realMatrixImpl7 = new org.apache.commons.math.linear.RealMatrixImpl(doubleArray6);
        org.apache.commons.math.linear.RealMatrix realMatrix8 = realMatrixImpl3.add((org.apache.commons.math.linear.RealMatrix) realMatrixImpl7);
        double[] doubleArray11 = new double[] { 10.0d, (short) -1 };
        double[] doubleArray12 = realMatrixImpl3.preMultiply(doubleArray11);
        org.apache.commons.math.linear.RealMatrixImpl realMatrixImpl13 = new org.apache.commons.math.linear.RealMatrixImpl(doubleArray11);
        org.apache.commons.math.linear.RealMatrix realMatrix15 = realMatrixImpl13.scalarMultiply(100.0d);
        org.apache.commons.math.linear.RealMatrix realMatrix17 = realMatrixImpl13.getColumnMatrix(0);
        java.lang.String str18 = realMatrixImpl13.toString();
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
        org.junit.Assert.assertNotNull(realMatrix17);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "RealMatrixImpl{{10.0},{-1.0}}" + "'", str18, "RealMatrixImpl{{10.0},{-1.0}}");
    }

    @Test
    public void test5536() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5536");
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
        java.lang.String str26 = realMatrixImpl3.toString();
        java.lang.String str27 = realMatrixImpl3.toString();
        double[] doubleArray30 = new double[] { 0, 1 };
        org.apache.commons.math.linear.RealMatrixImpl realMatrixImpl31 = new org.apache.commons.math.linear.RealMatrixImpl(doubleArray30);
        org.apache.commons.math.linear.RealMatrix realMatrix33 = realMatrixImpl31.scalarMultiply((double) (short) 100);
        double[] doubleArray35 = realMatrixImpl31.getRow(0);
        org.apache.commons.math.linear.RealMatrixImpl realMatrixImpl36 = new org.apache.commons.math.linear.RealMatrixImpl(doubleArray35);
        boolean boolean37 = realMatrixImpl36.isSingular();
        double[] doubleArray40 = new double[] { 0, 1 };
        org.apache.commons.math.linear.RealMatrixImpl realMatrixImpl41 = new org.apache.commons.math.linear.RealMatrixImpl(doubleArray40);
        double[] doubleArray44 = new double[] { 0, 1 };
        org.apache.commons.math.linear.RealMatrixImpl realMatrixImpl45 = new org.apache.commons.math.linear.RealMatrixImpl(doubleArray44);
        org.apache.commons.math.linear.RealMatrix realMatrix46 = realMatrixImpl41.add((org.apache.commons.math.linear.RealMatrix) realMatrixImpl45);
        double[] doubleArray49 = new double[] { 0, 1 };
        org.apache.commons.math.linear.RealMatrixImpl realMatrixImpl50 = new org.apache.commons.math.linear.RealMatrixImpl(doubleArray49);
        double[] doubleArray53 = new double[] { 0, 1 };
        org.apache.commons.math.linear.RealMatrixImpl realMatrixImpl54 = new org.apache.commons.math.linear.RealMatrixImpl(doubleArray53);
        org.apache.commons.math.linear.RealMatrix realMatrix55 = realMatrixImpl50.add((org.apache.commons.math.linear.RealMatrix) realMatrixImpl54);
        org.apache.commons.math.linear.RealMatrix realMatrix56 = realMatrixImpl45.subtract((org.apache.commons.math.linear.RealMatrix) realMatrixImpl54);
        double[] doubleArray59 = new double[] { 0, 1 };
        org.apache.commons.math.linear.RealMatrixImpl realMatrixImpl60 = new org.apache.commons.math.linear.RealMatrixImpl(doubleArray59);
        double[] doubleArray63 = new double[] { 0, 1 };
        org.apache.commons.math.linear.RealMatrixImpl realMatrixImpl64 = new org.apache.commons.math.linear.RealMatrixImpl(doubleArray63);
        org.apache.commons.math.linear.RealMatrix realMatrix65 = realMatrixImpl60.add((org.apache.commons.math.linear.RealMatrix) realMatrixImpl64);
        double[] doubleArray68 = new double[] { 10.0d, (short) -1 };
        double[] doubleArray69 = realMatrixImpl60.preMultiply(doubleArray68);
        org.apache.commons.math.linear.RealMatrix realMatrix70 = realMatrixImpl54.subtract((org.apache.commons.math.linear.RealMatrix) realMatrixImpl60);
        double[] doubleArray73 = new double[] { 0, 1 };
        org.apache.commons.math.linear.RealMatrixImpl realMatrixImpl74 = new org.apache.commons.math.linear.RealMatrixImpl(doubleArray73);
        double double75 = realMatrixImpl74.getNorm();
        org.apache.commons.math.linear.RealMatrix realMatrix76 = realMatrixImpl74.transpose();
        org.apache.commons.math.linear.RealMatrix realMatrix77 = realMatrixImpl54.add((org.apache.commons.math.linear.RealMatrix) realMatrixImpl74);
        org.apache.commons.math.linear.RealMatrix realMatrix78 = realMatrixImpl54.transpose();
        org.apache.commons.math.linear.RealMatrix realMatrix79 = realMatrixImpl54.copy();
        org.apache.commons.math.linear.RealMatrix realMatrix80 = realMatrixImpl36.preMultiply(realMatrix79);
        org.apache.commons.math.linear.RealMatrix realMatrix81 = realMatrixImpl3.subtract(realMatrix79);
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math.linear.RealMatrix realMatrix83 = realMatrixImpl3.getRowMatrix(2);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math.linear.MatrixIndexException; message: illegal row argument");
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
        org.junit.Assert.assertEquals("'" + str26 + "' != '" + "RealMatrixImpl{{0.0},{1.0}}" + "'", str26, "RealMatrixImpl{{0.0},{1.0}}");
        org.junit.Assert.assertEquals("'" + str27 + "' != '" + "RealMatrixImpl{{0.0},{1.0}}" + "'", str27, "RealMatrixImpl{{0.0},{1.0}}");
        org.junit.Assert.assertNotNull(doubleArray30);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray30), "[0.0, 1.0]");
        org.junit.Assert.assertNotNull(realMatrix33);
        org.junit.Assert.assertNotNull(doubleArray35);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray35), "[0.0]");
        org.junit.Assert.assertTrue("'" + boolean37 + "' != '" + true + "'", boolean37 == true);
        org.junit.Assert.assertNotNull(doubleArray40);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray40), "[0.0, 1.0]");
        org.junit.Assert.assertNotNull(doubleArray44);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray44), "[0.0, 1.0]");
        org.junit.Assert.assertNotNull(realMatrix46);
        org.junit.Assert.assertNotNull(doubleArray49);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray49), "[0.0, 1.0]");
        org.junit.Assert.assertNotNull(doubleArray53);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray53), "[0.0, 1.0]");
        org.junit.Assert.assertNotNull(realMatrix55);
        org.junit.Assert.assertNotNull(realMatrix56);
        org.junit.Assert.assertNotNull(doubleArray59);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray59), "[0.0, 1.0]");
        org.junit.Assert.assertNotNull(doubleArray63);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray63), "[0.0, 1.0]");
        org.junit.Assert.assertNotNull(realMatrix65);
        org.junit.Assert.assertNotNull(doubleArray68);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray68), "[10.0, -1.0]");
        org.junit.Assert.assertNotNull(doubleArray69);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray69), "[-1.0]");
        org.junit.Assert.assertNotNull(realMatrix70);
        org.junit.Assert.assertNotNull(doubleArray73);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray73), "[0.0, 1.0]");
        org.junit.Assert.assertTrue("'" + double75 + "' != '" + 1.0d + "'", double75 == 1.0d);
        org.junit.Assert.assertNotNull(realMatrix76);
        org.junit.Assert.assertNotNull(realMatrix77);
        org.junit.Assert.assertNotNull(realMatrix78);
        org.junit.Assert.assertNotNull(realMatrix79);
        org.junit.Assert.assertNotNull(realMatrix80);
        org.junit.Assert.assertNotNull(realMatrix81);
    }

    @Test
    public void test5537() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5537");
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
        double[] doubleArray18 = realMatrixImpl16.getRow((int) (byte) 1);
        org.apache.commons.math.linear.RealMatrixImpl realMatrixImpl19 = new org.apache.commons.math.linear.RealMatrixImpl(doubleArray18);
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
        org.junit.Assert.assertNotNull(doubleArray18);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray18), "[-1.0]");
    }
}

