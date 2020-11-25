import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class RegressionTest0 {

    public static boolean debug = false;

    @Test
    public void test0001() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0001");
        int int0 = org.apache.commons.math.util.ResizableDoubleArray.ADDITIVE_MODE;
        org.junit.Assert.assertTrue("'" + int0 + "' != '" + 1 + "'", int0 == 1);
    }

    @Test
    public void test0002() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0002");
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math.util.ResizableDoubleArray resizableDoubleArray4 = new org.apache.commons.math.util.ResizableDoubleArray((int) (byte) 1, (float) 'a', (float) 100L, (int) 'a');
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Illegal expansionMode setting.");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void test0003() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0003");
        int int0 = org.apache.commons.math.util.ResizableDoubleArray.MULTIPLICATIVE_MODE;
        org.junit.Assert.assertTrue("'" + int0 + "' != '" + 0 + "'", int0 == 0);
    }

    @Test
    public void test0004() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0004");
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math.util.ResizableDoubleArray resizableDoubleArray3 = new org.apache.commons.math.util.ResizableDoubleArray((int) (byte) 1, (float) 1, (float) '#');
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The expansion factor must be a number greater than 1.0");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void test0005() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0005");
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math.util.ResizableDoubleArray resizableDoubleArray4 = new org.apache.commons.math.util.ResizableDoubleArray(1, (-1.0f), (float) (byte) 100, (int) 'a');
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The expansion factor must be a number greater than 1.0");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void test0006() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0006");
        org.apache.commons.math.util.ResizableDoubleArray resizableDoubleArray0 = new org.apache.commons.math.util.ResizableDoubleArray();
        float float1 = resizableDoubleArray0.getExpansionFactor();
        double double3 = resizableDoubleArray0.addElementRolling(0.0d);
        // The following exception was thrown during execution in test generation
        try {
            resizableDoubleArray0.setExpansionMode((int) (short) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Illegal expansionMode setting.");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + float1 + "' != '" + 2.0f + "'", float1 == 2.0f);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 0.0d + "'", double3 == 0.0d);
    }

    @Test
    public void test0007() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0007");
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math.util.ResizableDoubleArray resizableDoubleArray4 = new org.apache.commons.math.util.ResizableDoubleArray((int) (byte) 0, (float) 10, (float) '4', (int) (short) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The initial capacity supplied: 0must be a positive integer");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void test0008() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0008");
        org.apache.commons.math.util.ResizableDoubleArray resizableDoubleArray0 = new org.apache.commons.math.util.ResizableDoubleArray();
        float float1 = resizableDoubleArray0.getExpansionFactor();
        java.lang.Class<?> wildcardClass2 = resizableDoubleArray0.getClass();
        org.junit.Assert.assertTrue("'" + float1 + "' != '" + 2.0f + "'", float1 == 2.0f);
        org.junit.Assert.assertNotNull(wildcardClass2);
    }

    @Test
    public void test0009() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0009");
        org.apache.commons.math.util.ResizableDoubleArray resizableDoubleArray0 = new org.apache.commons.math.util.ResizableDoubleArray();
        double[] doubleArray1 = resizableDoubleArray0.getValues();
        // The following exception was thrown during execution in test generation
        try {
            resizableDoubleArray0.setExpansionFactor((float) (byte) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The expansion factor must be a number greater than 1.0");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(doubleArray1);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray1), "[0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0]");
    }

    @Test
    public void test0010() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0010");
        org.apache.commons.math.util.ResizableDoubleArray resizableDoubleArray0 = new org.apache.commons.math.util.ResizableDoubleArray();
        double[] doubleArray1 = resizableDoubleArray0.getValues();
        java.lang.Class<?> wildcardClass2 = doubleArray1.getClass();
        org.junit.Assert.assertNotNull(doubleArray1);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray1), "[0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0]");
        org.junit.Assert.assertNotNull(wildcardClass2);
    }

    @Test
    public void test0011() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0011");
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math.util.ResizableDoubleArray resizableDoubleArray4 = new org.apache.commons.math.util.ResizableDoubleArray(0, 0.0f, (float) 0L, 10);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The expansion factor must be a number greater than 1.0");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void test0012() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0012");
        org.apache.commons.math.util.ResizableDoubleArray resizableDoubleArray0 = new org.apache.commons.math.util.ResizableDoubleArray();
        float float1 = resizableDoubleArray0.getExpansionFactor();
        double double3 = resizableDoubleArray0.addElementRolling(0.0d);
        // The following exception was thrown during execution in test generation
        try {
            double double5 = resizableDoubleArray0.getElement((int) 'a');
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: The index specified: 97 is larger than the current number of elements");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + float1 + "' != '" + 2.0f + "'", float1 == 2.0f);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 0.0d + "'", double3 == 0.0d);
    }

    @Test
    public void test0013() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0013");
        org.apache.commons.math.util.ResizableDoubleArray resizableDoubleArray0 = new org.apache.commons.math.util.ResizableDoubleArray();
        float float1 = resizableDoubleArray0.getExpansionFactor();
        // The following exception was thrown during execution in test generation
        try {
            resizableDoubleArray0.discardFrontElements((int) (short) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Cannot discard a negative number of elements.");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + float1 + "' != '" + 2.0f + "'", float1 == 2.0f);
    }

    @Test
    public void test0014() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0014");
        org.apache.commons.math.util.ResizableDoubleArray resizableDoubleArray0 = new org.apache.commons.math.util.ResizableDoubleArray();
        float float1 = resizableDoubleArray0.getExpansionFactor();
        int int2 = resizableDoubleArray0.getNumElements();
        resizableDoubleArray0.addElement((double) '#');
        // The following exception was thrown during execution in test generation
        try {
            resizableDoubleArray0.discardFrontElements(10);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Cannot discard more elements than arecontained in this array.");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + float1 + "' != '" + 2.0f + "'", float1 == 2.0f);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
    }

    @Test
    public void test0015() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0015");
        org.apache.commons.math.util.ResizableDoubleArray resizableDoubleArray0 = new org.apache.commons.math.util.ResizableDoubleArray();
        float float1 = resizableDoubleArray0.getExpansionFactor();
        double double3 = resizableDoubleArray0.addElementRolling(0.0d);
        // The following exception was thrown during execution in test generation
        try {
            resizableDoubleArray0.discardFrontElements((int) (byte) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Cannot discard more elements than arecontained in this array.");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + float1 + "' != '" + 2.0f + "'", float1 == 2.0f);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 0.0d + "'", double3 == 0.0d);
    }

    @Test
    public void test0016() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0016");
        org.apache.commons.math.util.ResizableDoubleArray resizableDoubleArray0 = new org.apache.commons.math.util.ResizableDoubleArray();
        double double2 = resizableDoubleArray0.addElementRolling((double) ' ');
        resizableDoubleArray0.setElement((int) '#', (double) (short) 0);
        double double7 = resizableDoubleArray0.getElement(10);
        // The following exception was thrown during execution in test generation
        try {
            resizableDoubleArray0.setExpansionMode((int) '4');
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Illegal expansionMode setting.");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.0d + "'", double2 == 0.0d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 0.0d + "'", double7 == 0.0d);
    }

    @Test
    public void test0017() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0017");
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math.util.ResizableDoubleArray resizableDoubleArray2 = new org.apache.commons.math.util.ResizableDoubleArray(0, (float) (-1));
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The initial capacity supplied: 0must be a positive integer");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void test0018() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0018");
        org.apache.commons.math.util.ResizableDoubleArray resizableDoubleArray0 = new org.apache.commons.math.util.ResizableDoubleArray();
        double double2 = resizableDoubleArray0.addElementRolling((double) ' ');
        float float3 = resizableDoubleArray0.getExpansionFactor();
        resizableDoubleArray0.setElement((int) (byte) 1, (double) ' ');
        // The following exception was thrown during execution in test generation
        try {
            resizableDoubleArray0.setExpansionFactor((float) (short) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Contraction criteria can never be smaller than the expansion factor.  This would lead to a never ending loop of expansion and contraction as a newly expanded internal storage array would immediately satisfy the criteria for contraction");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.0d + "'", double2 == 0.0d);
        org.junit.Assert.assertTrue("'" + float3 + "' != '" + 2.0f + "'", float3 == 2.0f);
    }

    @Test
    public void test0019() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0019");
        org.apache.commons.math.util.ResizableDoubleArray resizableDoubleArray0 = new org.apache.commons.math.util.ResizableDoubleArray();
        float float1 = resizableDoubleArray0.getExpansionFactor();
        resizableDoubleArray0.setNumElements((int) (byte) 100);
        // The following exception was thrown during execution in test generation
        try {
            double double5 = resizableDoubleArray0.getElement((-1));
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Elements cannot be retrieved from a negative array index");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + float1 + "' != '" + 2.0f + "'", float1 == 2.0f);
    }

    @Test
    public void test0020() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0020");
        org.apache.commons.math.util.ResizableDoubleArray resizableDoubleArray1 = new org.apache.commons.math.util.ResizableDoubleArray((int) (byte) 100);
        int int2 = resizableDoubleArray1.getExpansionMode();
        java.lang.Class<?> wildcardClass3 = resizableDoubleArray1.getClass();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertNotNull(wildcardClass3);
    }

    @Test
    public void test0021() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0021");
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math.util.ResizableDoubleArray resizableDoubleArray2 = new org.apache.commons.math.util.ResizableDoubleArray((int) (byte) 0, (float) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The initial capacity supplied: 0must be a positive integer");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void test0022() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0022");
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math.util.ResizableDoubleArray resizableDoubleArray4 = new org.apache.commons.math.util.ResizableDoubleArray((int) (short) 1, (float) 100L, (float) 1, (-1));
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Contraction criteria can never be smaller than the expansion factor.  This would lead to a never ending loop of expansion and contraction as a newly expanded internal storage array would immediately satisfy the criteria for contraction");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void test0023() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0023");
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math.util.ResizableDoubleArray resizableDoubleArray4 = new org.apache.commons.math.util.ResizableDoubleArray(10, 100.0f, (float) '#', (int) (short) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Contraction criteria can never be smaller than the expansion factor.  This would lead to a never ending loop of expansion and contraction as a newly expanded internal storage array would immediately satisfy the criteria for contraction");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void test0024() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0024");
        org.apache.commons.math.util.ResizableDoubleArray resizableDoubleArray0 = new org.apache.commons.math.util.ResizableDoubleArray();
        double double2 = resizableDoubleArray0.addElementRolling((double) ' ');
        resizableDoubleArray0.setElement((int) '#', (double) (short) 0);
        double[] doubleArray6 = resizableDoubleArray0.getValues();
        double[] doubleArray7 = resizableDoubleArray0.getValues();
        // The following exception was thrown during execution in test generation
        try {
            resizableDoubleArray0.discardFrontElements((int) '4');
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Cannot discard more elements than arecontained in this array.");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.0d + "'", double2 == 0.0d);
        org.junit.Assert.assertNotNull(doubleArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray6), "[0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0]");
        org.junit.Assert.assertNotNull(doubleArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray7), "[0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0]");
    }

    @Test
    public void test0025() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0025");
        org.apache.commons.math.util.ResizableDoubleArray resizableDoubleArray0 = new org.apache.commons.math.util.ResizableDoubleArray();
        float float1 = resizableDoubleArray0.getExpansionFactor();
        resizableDoubleArray0.setElement((int) (short) 1, (double) 0.0f);
        resizableDoubleArray0.setElement((int) (byte) 1, (double) 'a');
        // The following exception was thrown during execution in test generation
        try {
            double double9 = resizableDoubleArray0.getElement(100);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: The index specified: 100 is larger than the current number of elements");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + float1 + "' != '" + 2.0f + "'", float1 == 2.0f);
    }

    @Test
    public void test0026() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0026");
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math.util.ResizableDoubleArray resizableDoubleArray2 = new org.apache.commons.math.util.ResizableDoubleArray((int) '#', (float) 1L);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The expansion factor must be a number greater than 1.0");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void test0027() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0027");
        org.apache.commons.math.util.ResizableDoubleArray resizableDoubleArray0 = new org.apache.commons.math.util.ResizableDoubleArray();
        float float1 = resizableDoubleArray0.getExpansionFactor();
        int int2 = resizableDoubleArray0.getNumElements();
        resizableDoubleArray0.addElement((double) '#');
        // The following exception was thrown during execution in test generation
        try {
            resizableDoubleArray0.setContractionCriteria((float) (-1));
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Contraction criteria can never be smaller than the expansion factor.  This would lead to a never ending loop of expansion and contraction as a newly expanded internal storage array would immediately satisfy the criteria for contraction");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + float1 + "' != '" + 2.0f + "'", float1 == 2.0f);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
    }

    @Test
    public void test0028() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0028");
        org.apache.commons.math.util.ResizableDoubleArray resizableDoubleArray0 = new org.apache.commons.math.util.ResizableDoubleArray();
        float float1 = resizableDoubleArray0.getExpansionFactor();
        int int2 = resizableDoubleArray0.getNumElements();
        float float3 = resizableDoubleArray0.getExpansionFactor();
        // The following exception was thrown during execution in test generation
        try {
            resizableDoubleArray0.setExpansionMode((int) (short) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Illegal expansionMode setting.");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + float1 + "' != '" + 2.0f + "'", float1 == 2.0f);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + float3 + "' != '" + 2.0f + "'", float3 == 2.0f);
    }

    @Test
    public void test0029() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0029");
        org.apache.commons.math.util.ResizableDoubleArray resizableDoubleArray0 = new org.apache.commons.math.util.ResizableDoubleArray();
        float float1 = resizableDoubleArray0.getExpansionFactor();
        resizableDoubleArray0.setNumElements((int) (byte) 100);
        // The following exception was thrown during execution in test generation
        try {
            resizableDoubleArray0.setContractionCriteria((float) (byte) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Contraction criteria can never be smaller than the expansion factor.  This would lead to a never ending loop of expansion and contraction as a newly expanded internal storage array would immediately satisfy the criteria for contraction");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + float1 + "' != '" + 2.0f + "'", float1 == 2.0f);
    }

    @Test
    public void test0030() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0030");
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math.util.ResizableDoubleArray resizableDoubleArray4 = new org.apache.commons.math.util.ResizableDoubleArray((int) (short) 10, (float) (-1L), (float) (byte) 10, (int) ' ');
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The expansion factor must be a number greater than 1.0");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void test0031() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0031");
        org.apache.commons.math.util.ResizableDoubleArray resizableDoubleArray0 = new org.apache.commons.math.util.ResizableDoubleArray();
        double double2 = resizableDoubleArray0.addElementRolling((double) ' ');
        resizableDoubleArray0.setElement((int) '#', (double) (short) 0);
        resizableDoubleArray0.setNumElements((int) (byte) 100);
        int int8 = resizableDoubleArray0.start();
        // The following exception was thrown during execution in test generation
        try {
            resizableDoubleArray0.setContractionCriteria((float) (-1L));
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Contraction criteria can never be smaller than the expansion factor.  This would lead to a never ending loop of expansion and contraction as a newly expanded internal storage array would immediately satisfy the criteria for contraction");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.0d + "'", double2 == 0.0d);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
    }

    @Test
    public void test0032() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0032");
        org.apache.commons.math.util.ResizableDoubleArray resizableDoubleArray0 = new org.apache.commons.math.util.ResizableDoubleArray();
        double double2 = resizableDoubleArray0.addElementRolling((double) ' ');
        resizableDoubleArray0.setElement((int) '#', (double) (short) 0);
        resizableDoubleArray0.setNumElements((int) (byte) 100);
        resizableDoubleArray0.contract();
        int int9 = resizableDoubleArray0.getNumElements();
        java.lang.Class<?> wildcardClass10 = resizableDoubleArray0.getClass();
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.0d + "'", double2 == 0.0d);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 100 + "'", int9 == 100);
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test0033() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0033");
        org.apache.commons.math.util.ResizableDoubleArray resizableDoubleArray0 = new org.apache.commons.math.util.ResizableDoubleArray();
        double[] doubleArray1 = resizableDoubleArray0.getValues();
        float float2 = resizableDoubleArray0.getExpansionFactor();
        float float3 = resizableDoubleArray0.getExpansionFactor();
        double double5 = resizableDoubleArray0.addElementRolling(0.0d);
        int int6 = resizableDoubleArray0.getNumElements();
        // The following exception was thrown during execution in test generation
        try {
            resizableDoubleArray0.setContractionCriteria((float) 0L);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Contraction criteria can never be smaller than the expansion factor.  This would lead to a never ending loop of expansion and contraction as a newly expanded internal storage array would immediately satisfy the criteria for contraction");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(doubleArray1);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray1), "[0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0]");
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 2.0f + "'", float2 == 2.0f);
        org.junit.Assert.assertTrue("'" + float3 + "' != '" + 2.0f + "'", float3 == 2.0f);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
    }

    @Test
    public void test0034() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0034");
        org.apache.commons.math.util.ResizableDoubleArray resizableDoubleArray1 = new org.apache.commons.math.util.ResizableDoubleArray((int) (byte) 100);
        double[] doubleArray2 = resizableDoubleArray1.getValues();
        // The following exception was thrown during execution in test generation
        try {
            double double4 = resizableDoubleArray1.getElement((int) '#');
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: The index specified: 35 is larger than the current number of elements");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(doubleArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray2), "[0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0]");
    }

    @Test
    public void test0035() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0035");
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math.util.ResizableDoubleArray resizableDoubleArray4 = new org.apache.commons.math.util.ResizableDoubleArray((int) (short) 10, 0.0f, (float) ' ', 0);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The expansion factor must be a number greater than 1.0");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void test0036() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0036");
        org.apache.commons.math.util.ResizableDoubleArray resizableDoubleArray0 = new org.apache.commons.math.util.ResizableDoubleArray();
        double double2 = resizableDoubleArray0.addElementRolling((double) ' ');
        resizableDoubleArray0.setElement((int) '#', (double) (short) 0);
        resizableDoubleArray0.setNumElements((int) (byte) 100);
        int int8 = resizableDoubleArray0.start();
        double[] doubleArray9 = resizableDoubleArray0.getValues();
        // The following exception was thrown during execution in test generation
        try {
            double double11 = resizableDoubleArray0.getElement((int) (short) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Elements cannot be retrieved from a negative array index");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.0d + "'", double2 == 0.0d);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertNotNull(doubleArray9);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray9), "[0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0]");
    }

    @Test
    public void test0037() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0037");
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math.util.ResizableDoubleArray resizableDoubleArray2 = new org.apache.commons.math.util.ResizableDoubleArray((int) (short) 10, 1.0f);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The expansion factor must be a number greater than 1.0");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void test0038() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0038");
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math.util.ResizableDoubleArray resizableDoubleArray3 = new org.apache.commons.math.util.ResizableDoubleArray((int) (byte) 0, (float) 1, (float) (short) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The expansion factor must be a number greater than 1.0");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void test0039() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0039");
        org.apache.commons.math.util.ResizableDoubleArray resizableDoubleArray0 = new org.apache.commons.math.util.ResizableDoubleArray();
        float float1 = resizableDoubleArray0.getExpansionFactor();
        resizableDoubleArray0.setNumElements((int) (byte) 100);
        // The following exception was thrown during execution in test generation
        try {
            resizableDoubleArray0.setExpansionMode((-1));
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Illegal expansionMode setting.");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + float1 + "' != '" + 2.0f + "'", float1 == 2.0f);
    }

    @Test
    public void test0040() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0040");
        org.apache.commons.math.util.ResizableDoubleArray resizableDoubleArray0 = new org.apache.commons.math.util.ResizableDoubleArray();
        double double2 = resizableDoubleArray0.addElementRolling((double) ' ');
        resizableDoubleArray0.setElement((int) '#', (double) (short) 0);
        double double7 = resizableDoubleArray0.getElement(10);
        // The following exception was thrown during execution in test generation
        try {
            resizableDoubleArray0.setExpansionMode((int) (short) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Illegal expansionMode setting.");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.0d + "'", double2 == 0.0d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 0.0d + "'", double7 == 0.0d);
    }

    @Test
    public void test0041() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0041");
        org.apache.commons.math.util.ResizableDoubleArray resizableDoubleArray0 = new org.apache.commons.math.util.ResizableDoubleArray();
        float float1 = resizableDoubleArray0.getExpansionFactor();
        resizableDoubleArray0.setNumElements((int) (byte) 100);
        // The following exception was thrown during execution in test generation
        try {
            resizableDoubleArray0.setExpansionFactor((float) (byte) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Contraction criteria can never be smaller than the expansion factor.  This would lead to a never ending loop of expansion and contraction as a newly expanded internal storage array would immediately satisfy the criteria for contraction");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + float1 + "' != '" + 2.0f + "'", float1 == 2.0f);
    }

    @Test
    public void test0042() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0042");
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math.util.ResizableDoubleArray resizableDoubleArray3 = new org.apache.commons.math.util.ResizableDoubleArray(10, 0.0f, (float) (-1L));
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Contraction criteria can never be smaller than the expansion factor.  This would lead to a never ending loop of expansion and contraction as a newly expanded internal storage array would immediately satisfy the criteria for contraction");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void test0043() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0043");
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math.util.ResizableDoubleArray resizableDoubleArray2 = new org.apache.commons.math.util.ResizableDoubleArray((int) 'a', (float) (short) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The expansion factor must be a number greater than 1.0");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void test0044() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0044");
        org.apache.commons.math.util.ResizableDoubleArray resizableDoubleArray0 = new org.apache.commons.math.util.ResizableDoubleArray();
        double[] doubleArray1 = resizableDoubleArray0.getValues();
        float float2 = resizableDoubleArray0.getExpansionFactor();
        float float3 = resizableDoubleArray0.getExpansionFactor();
        double double5 = resizableDoubleArray0.addElementRolling(0.0d);
        int int6 = resizableDoubleArray0.getNumElements();
        // The following exception was thrown during execution in test generation
        try {
            resizableDoubleArray0.setExpansionMode((int) (byte) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Illegal expansionMode setting.");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(doubleArray1);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray1), "[0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0]");
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 2.0f + "'", float2 == 2.0f);
        org.junit.Assert.assertTrue("'" + float3 + "' != '" + 2.0f + "'", float3 == 2.0f);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
    }

    @Test
    public void test0045() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0045");
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math.util.ResizableDoubleArray resizableDoubleArray1 = new org.apache.commons.math.util.ResizableDoubleArray(0);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The initial capacity supplied: 0must be a positive integer");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void test0046() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0046");
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math.util.ResizableDoubleArray resizableDoubleArray3 = new org.apache.commons.math.util.ResizableDoubleArray(100, (float) (byte) 1, (float) 10L);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The expansion factor must be a number greater than 1.0");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void test0047() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0047");
        org.apache.commons.math.util.ResizableDoubleArray resizableDoubleArray0 = new org.apache.commons.math.util.ResizableDoubleArray();
        float float1 = resizableDoubleArray0.getExpansionFactor();
        double[] doubleArray2 = resizableDoubleArray0.getValues();
        java.lang.Class<?> wildcardClass3 = resizableDoubleArray0.getClass();
        org.junit.Assert.assertTrue("'" + float1 + "' != '" + 2.0f + "'", float1 == 2.0f);
        org.junit.Assert.assertNotNull(doubleArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray2), "[0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0]");
        org.junit.Assert.assertNotNull(wildcardClass3);
    }

    @Test
    public void test0048() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0048");
        org.apache.commons.math.util.ResizableDoubleArray resizableDoubleArray0 = new org.apache.commons.math.util.ResizableDoubleArray();
        float float1 = resizableDoubleArray0.getExpansionFactor();
        int int2 = resizableDoubleArray0.getNumElements();
        float float3 = resizableDoubleArray0.getExpansionFactor();
        // The following exception was thrown during execution in test generation
        try {
            resizableDoubleArray0.setExpansionFactor((float) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Contraction criteria can never be smaller than the expansion factor.  This would lead to a never ending loop of expansion and contraction as a newly expanded internal storage array would immediately satisfy the criteria for contraction");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + float1 + "' != '" + 2.0f + "'", float1 == 2.0f);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + float3 + "' != '" + 2.0f + "'", float3 == 2.0f);
    }

    @Test
    public void test0049() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0049");
        org.apache.commons.math.util.ResizableDoubleArray resizableDoubleArray1 = new org.apache.commons.math.util.ResizableDoubleArray((int) (byte) 100);
        resizableDoubleArray1.addElement((double) (short) 1);
        // The following exception was thrown during execution in test generation
        try {
            resizableDoubleArray1.setExpansionMode((int) (byte) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Illegal expansionMode setting.");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void test0050() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0050");
        org.apache.commons.math.util.ResizableDoubleArray resizableDoubleArray0 = new org.apache.commons.math.util.ResizableDoubleArray();
        float float1 = resizableDoubleArray0.getExpansionFactor();
        int int2 = resizableDoubleArray0.getNumElements();
        double double4 = resizableDoubleArray0.addElementRolling((double) 2.0f);
        java.lang.Class<?> wildcardClass5 = resizableDoubleArray0.getClass();
        org.junit.Assert.assertTrue("'" + float1 + "' != '" + 2.0f + "'", float1 == 2.0f);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 0.0d + "'", double4 == 0.0d);
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test0051() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0051");
        org.apache.commons.math.util.ResizableDoubleArray resizableDoubleArray0 = new org.apache.commons.math.util.ResizableDoubleArray();
        double double2 = resizableDoubleArray0.addElementRolling((double) ' ');
        resizableDoubleArray0.setElement((int) '#', (double) (short) 0);
        resizableDoubleArray0.setNumElements((int) (byte) 100);
        int int8 = resizableDoubleArray0.start();
        double[] doubleArray9 = resizableDoubleArray0.getValues();
        int int10 = resizableDoubleArray0.getExpansionMode();
        // The following exception was thrown during execution in test generation
        try {
            double double12 = resizableDoubleArray0.getElement((int) (byte) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Elements cannot be retrieved from a negative array index");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.0d + "'", double2 == 0.0d);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertNotNull(doubleArray9);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray9), "[0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0]");
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
    }

    @Test
    public void test0052() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0052");
        org.apache.commons.math.util.ResizableDoubleArray resizableDoubleArray2 = new org.apache.commons.math.util.ResizableDoubleArray((int) (byte) 100, (float) '4');
        // The following exception was thrown during execution in test generation
        try {
            resizableDoubleArray2.setExpansionFactor(0.0f);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The expansion factor must be a number greater than 1.0");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void test0053() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0053");
        org.apache.commons.math.util.ResizableDoubleArray resizableDoubleArray0 = new org.apache.commons.math.util.ResizableDoubleArray();
        double double2 = resizableDoubleArray0.addElementRolling((double) ' ');
        resizableDoubleArray0.setElement((int) '#', (double) (short) 0);
        resizableDoubleArray0.setNumElements((int) (byte) 100);
        int int8 = resizableDoubleArray0.start();
        resizableDoubleArray0.addElement((double) '#');
        // The following exception was thrown during execution in test generation
        try {
            resizableDoubleArray0.setExpansionMode((int) (byte) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Illegal expansionMode setting.");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.0d + "'", double2 == 0.0d);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
    }

    @Test
    public void test0054() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0054");
        org.apache.commons.math.util.ResizableDoubleArray resizableDoubleArray1 = new org.apache.commons.math.util.ResizableDoubleArray((int) (byte) 100);
        double[] doubleArray2 = resizableDoubleArray1.getValues();
        resizableDoubleArray1.setExpansionMode((int) (byte) 0);
        int int5 = resizableDoubleArray1.getNumElements();
        // The following exception was thrown during execution in test generation
        try {
            resizableDoubleArray1.discardFrontElements((int) (short) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Cannot discard more elements than arecontained in this array.");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(doubleArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray2), "[0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0]");
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
    }

    @Test
    public void test0055() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0055");
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math.util.ResizableDoubleArray resizableDoubleArray4 = new org.apache.commons.math.util.ResizableDoubleArray((int) ' ', (float) ' ', (float) (byte) -1, 10);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Contraction criteria can never be smaller than the expansion factor.  This would lead to a never ending loop of expansion and contraction as a newly expanded internal storage array would immediately satisfy the criteria for contraction");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void test0056() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0056");
        org.apache.commons.math.util.ResizableDoubleArray resizableDoubleArray1 = new org.apache.commons.math.util.ResizableDoubleArray((int) (byte) 100);
        // The following exception was thrown during execution in test generation
        try {
            resizableDoubleArray1.discardFrontElements(10);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Cannot discard more elements than arecontained in this array.");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void test0057() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0057");
        org.apache.commons.math.util.ResizableDoubleArray resizableDoubleArray0 = new org.apache.commons.math.util.ResizableDoubleArray();
        double double2 = resizableDoubleArray0.addElementRolling((double) ' ');
        resizableDoubleArray0.setElement((int) '#', (double) (short) 0);
        resizableDoubleArray0.setNumElements((int) (byte) 100);
        resizableDoubleArray0.contract();
        // The following exception was thrown during execution in test generation
        try {
            resizableDoubleArray0.setExpansionMode((int) 'a');
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Illegal expansionMode setting.");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.0d + "'", double2 == 0.0d);
    }

    @Test
    public void test0058() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0058");
        org.apache.commons.math.util.ResizableDoubleArray resizableDoubleArray0 = new org.apache.commons.math.util.ResizableDoubleArray();
        double[] doubleArray1 = resizableDoubleArray0.getValues();
        float float2 = resizableDoubleArray0.getExpansionFactor();
        float float3 = resizableDoubleArray0.getExpansionFactor();
        double double5 = resizableDoubleArray0.addElementRolling(0.0d);
        float float6 = resizableDoubleArray0.getContractionCriteria();
        // The following exception was thrown during execution in test generation
        try {
            resizableDoubleArray0.setExpansionFactor((float) (short) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The expansion factor must be a number greater than 1.0");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(doubleArray1);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray1), "[0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0]");
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 2.0f + "'", float2 == 2.0f);
        org.junit.Assert.assertTrue("'" + float3 + "' != '" + 2.0f + "'", float3 == 2.0f);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
        org.junit.Assert.assertTrue("'" + float6 + "' != '" + 2.5f + "'", float6 == 2.5f);
    }

    @Test
    public void test0059() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0059");
        org.apache.commons.math.util.ResizableDoubleArray resizableDoubleArray0 = new org.apache.commons.math.util.ResizableDoubleArray();
        float float1 = resizableDoubleArray0.getExpansionFactor();
        int int2 = resizableDoubleArray0.getNumElements();
        double double4 = resizableDoubleArray0.addElementRolling((double) 2.0f);
        // The following exception was thrown during execution in test generation
        try {
            resizableDoubleArray0.setExpansionMode((int) (short) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Illegal expansionMode setting.");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + float1 + "' != '" + 2.0f + "'", float1 == 2.0f);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 0.0d + "'", double4 == 0.0d);
    }

    @Test
    public void test0060() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0060");
        org.apache.commons.math.util.ResizableDoubleArray resizableDoubleArray2 = new org.apache.commons.math.util.ResizableDoubleArray((int) (byte) 100, 100.0f);
        // The following exception was thrown during execution in test generation
        try {
            double double4 = resizableDoubleArray2.getElement((int) (short) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: The index specified: 100 is larger than the current number of elements");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
    }

    @Test
    public void test0061() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0061");
        org.apache.commons.math.util.ResizableDoubleArray resizableDoubleArray1 = new org.apache.commons.math.util.ResizableDoubleArray((int) (byte) 100);
        int int2 = resizableDoubleArray1.getExpansionMode();
        // The following exception was thrown during execution in test generation
        try {
            resizableDoubleArray1.setContractionCriteria((float) (-1));
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Contraction criteria can never be smaller than the expansion factor.  This would lead to a never ending loop of expansion and contraction as a newly expanded internal storage array would immediately satisfy the criteria for contraction");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
    }

    @Test
    public void test0062() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0062");
        org.apache.commons.math.util.ResizableDoubleArray resizableDoubleArray2 = new org.apache.commons.math.util.ResizableDoubleArray((int) 'a', (float) 100L);
        // The following exception was thrown during execution in test generation
        try {
            resizableDoubleArray2.setContractionCriteria((float) 'a');
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Contraction criteria can never be smaller than the expansion factor.  This would lead to a never ending loop of expansion and contraction as a newly expanded internal storage array would immediately satisfy the criteria for contraction");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void test0063() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0063");
        org.apache.commons.math.util.ResizableDoubleArray resizableDoubleArray0 = new org.apache.commons.math.util.ResizableDoubleArray();
        double double2 = resizableDoubleArray0.addElementRolling((double) ' ');
        resizableDoubleArray0.setElement((int) '#', (double) (short) 0);
        resizableDoubleArray0.setNumElements((int) (byte) 100);
        resizableDoubleArray0.contract();
        int int9 = resizableDoubleArray0.start();
        float float10 = resizableDoubleArray0.getContractionCriteria();
        resizableDoubleArray0.setContractionCriteria(2.0f);
        // The following exception was thrown during execution in test generation
        try {
            resizableDoubleArray0.setExpansionFactor((float) ' ');
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Contraction criteria can never be smaller than the expansion factor.  This would lead to a never ending loop of expansion and contraction as a newly expanded internal storage array would immediately satisfy the criteria for contraction");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.0d + "'", double2 == 0.0d);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + float10 + "' != '" + 2.5f + "'", float10 == 2.5f);
    }

    @Test
    public void test0064() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0064");
        org.apache.commons.math.util.ResizableDoubleArray resizableDoubleArray0 = new org.apache.commons.math.util.ResizableDoubleArray();
        float float1 = resizableDoubleArray0.getExpansionFactor();
        resizableDoubleArray0.setElement((int) (short) 1, (double) 0.0f);
        resizableDoubleArray0.setExpansionFactor(2.5f);
        // The following exception was thrown during execution in test generation
        try {
            resizableDoubleArray0.setExpansionFactor((float) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The expansion factor must be a number greater than 1.0");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + float1 + "' != '" + 2.0f + "'", float1 == 2.0f);
    }

    @Test
    public void test0065() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0065");
        org.apache.commons.math.util.ResizableDoubleArray resizableDoubleArray0 = new org.apache.commons.math.util.ResizableDoubleArray();
        double double2 = resizableDoubleArray0.addElementRolling((double) ' ');
        float float3 = resizableDoubleArray0.getExpansionFactor();
        resizableDoubleArray0.setElement((int) (byte) 1, (double) ' ');
        // The following exception was thrown during execution in test generation
        try {
            double double8 = resizableDoubleArray0.getElement((int) (byte) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Elements cannot be retrieved from a negative array index");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.0d + "'", double2 == 0.0d);
        org.junit.Assert.assertTrue("'" + float3 + "' != '" + 2.0f + "'", float3 == 2.0f);
    }

    @Test
    public void test0066() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0066");
        org.apache.commons.math.util.ResizableDoubleArray resizableDoubleArray1 = new org.apache.commons.math.util.ResizableDoubleArray((int) (byte) 100);
        double[] doubleArray2 = resizableDoubleArray1.getValues();
        resizableDoubleArray1.setExpansionMode((int) (byte) 0);
        int int5 = resizableDoubleArray1.getNumElements();
        // The following exception was thrown during execution in test generation
        try {
            resizableDoubleArray1.setExpansionFactor((float) '#');
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Contraction criteria can never be smaller than the expansion factor.  This would lead to a never ending loop of expansion and contraction as a newly expanded internal storage array would immediately satisfy the criteria for contraction");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(doubleArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray2), "[0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0]");
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
    }

    @Test
    public void test0067() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0067");
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math.util.ResizableDoubleArray resizableDoubleArray3 = new org.apache.commons.math.util.ResizableDoubleArray(100, (float) (-1), (float) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The expansion factor must be a number greater than 1.0");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void test0068() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0068");
        org.apache.commons.math.util.ResizableDoubleArray resizableDoubleArray0 = new org.apache.commons.math.util.ResizableDoubleArray();
        double double2 = resizableDoubleArray0.addElementRolling((double) ' ');
        resizableDoubleArray0.setElement((int) '#', (double) (short) 0);
        resizableDoubleArray0.setNumElements((int) (byte) 100);
        resizableDoubleArray0.contract();
        resizableDoubleArray0.setNumElements((int) (short) 1);
        double double12 = resizableDoubleArray0.getElement((int) (byte) 0);
        // The following exception was thrown during execution in test generation
        try {
            resizableDoubleArray0.setExpansionMode((int) 'a');
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Illegal expansionMode setting.");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.0d + "'", double2 == 0.0d);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 0.0d + "'", double12 == 0.0d);
    }

    @Test
    public void test0069() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0069");
        org.apache.commons.math.util.ResizableDoubleArray resizableDoubleArray2 = new org.apache.commons.math.util.ResizableDoubleArray((int) (byte) 100, (float) '4');
        java.lang.Class<?> wildcardClass3 = resizableDoubleArray2.getClass();
        org.junit.Assert.assertNotNull(wildcardClass3);
    }

    @Test
    public void test0070() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0070");
        org.apache.commons.math.util.ResizableDoubleArray resizableDoubleArray0 = new org.apache.commons.math.util.ResizableDoubleArray();
        double double2 = resizableDoubleArray0.addElementRolling((double) ' ');
        int int3 = resizableDoubleArray0.getExpansionMode();
        float float4 = resizableDoubleArray0.getExpansionFactor();
        // The following exception was thrown during execution in test generation
        try {
            resizableDoubleArray0.discardFrontElements((int) '4');
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Cannot discard more elements than arecontained in this array.");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.0d + "'", double2 == 0.0d);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + float4 + "' != '" + 2.0f + "'", float4 == 2.0f);
    }

    @Test
    public void test0071() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0071");
        org.apache.commons.math.util.ResizableDoubleArray resizableDoubleArray0 = new org.apache.commons.math.util.ResizableDoubleArray();
        double double2 = resizableDoubleArray0.addElementRolling((double) ' ');
        int int3 = resizableDoubleArray0.getExpansionMode();
        float float4 = resizableDoubleArray0.getExpansionFactor();
        // The following exception was thrown during execution in test generation
        try {
            double double6 = resizableDoubleArray0.getElement((int) 'a');
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: The index specified: 97 is larger than the current number of elements");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.0d + "'", double2 == 0.0d);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + float4 + "' != '" + 2.0f + "'", float4 == 2.0f);
    }

    @Test
    public void test0072() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0072");
        org.apache.commons.math.util.ResizableDoubleArray resizableDoubleArray0 = new org.apache.commons.math.util.ResizableDoubleArray();
        double[] doubleArray1 = resizableDoubleArray0.getValues();
        float float2 = resizableDoubleArray0.getExpansionFactor();
        float float3 = resizableDoubleArray0.getExpansionFactor();
        double double5 = resizableDoubleArray0.addElementRolling(0.0d);
        double double7 = resizableDoubleArray0.addElementRolling((double) 1);
        int int8 = resizableDoubleArray0.start();
        // The following exception was thrown during execution in test generation
        try {
            double double10 = resizableDoubleArray0.getElement((int) (byte) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Elements cannot be retrieved from a negative array index");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(doubleArray1);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray1), "[0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0]");
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 2.0f + "'", float2 == 2.0f);
        org.junit.Assert.assertTrue("'" + float3 + "' != '" + 2.0f + "'", float3 == 2.0f);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 0.0d + "'", double7 == 0.0d);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
    }

    @Test
    public void test0073() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0073");
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math.util.ResizableDoubleArray resizableDoubleArray4 = new org.apache.commons.math.util.ResizableDoubleArray((int) (byte) 10, (-1.0f), 1.0f, (int) (short) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The expansion factor must be a number greater than 1.0");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void test0074() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0074");
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math.util.ResizableDoubleArray resizableDoubleArray2 = new org.apache.commons.math.util.ResizableDoubleArray(0, 2.5f);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The initial capacity supplied: 0must be a positive integer");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void test0075() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0075");
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math.util.ResizableDoubleArray resizableDoubleArray4 = new org.apache.commons.math.util.ResizableDoubleArray(1, (float) (-1L), (float) (-1L), 0);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The expansion factor must be a number greater than 1.0");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void test0076() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0076");
        org.apache.commons.math.util.ResizableDoubleArray resizableDoubleArray0 = new org.apache.commons.math.util.ResizableDoubleArray();
        double double2 = resizableDoubleArray0.addElementRolling((double) ' ');
        resizableDoubleArray0.setElement((int) '#', (double) (short) 0);
        resizableDoubleArray0.setNumElements((int) (byte) 100);
        float float8 = resizableDoubleArray0.getExpansionFactor();
        double[] doubleArray9 = resizableDoubleArray0.getValues();
        java.lang.Class<?> wildcardClass10 = resizableDoubleArray0.getClass();
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.0d + "'", double2 == 0.0d);
        org.junit.Assert.assertTrue("'" + float8 + "' != '" + 2.0f + "'", float8 == 2.0f);
        org.junit.Assert.assertNotNull(doubleArray9);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray9), "[0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0]");
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test0077() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0077");
        org.apache.commons.math.util.ResizableDoubleArray resizableDoubleArray0 = new org.apache.commons.math.util.ResizableDoubleArray();
        double double2 = resizableDoubleArray0.addElementRolling((double) ' ');
        resizableDoubleArray0.setElement((int) '#', (double) (short) 0);
        resizableDoubleArray0.setNumElements((int) (byte) 100);
        int int8 = resizableDoubleArray0.start();
        double[] doubleArray9 = resizableDoubleArray0.getValues();
        java.lang.Class<?> wildcardClass10 = doubleArray9.getClass();
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.0d + "'", double2 == 0.0d);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertNotNull(doubleArray9);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray9), "[0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0]");
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test0078() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0078");
        org.apache.commons.math.util.ResizableDoubleArray resizableDoubleArray0 = new org.apache.commons.math.util.ResizableDoubleArray();
        double double2 = resizableDoubleArray0.addElementRolling((double) ' ');
        float float3 = resizableDoubleArray0.getExpansionFactor();
        float float4 = resizableDoubleArray0.getExpansionFactor();
        // The following exception was thrown during execution in test generation
        try {
            resizableDoubleArray0.setExpansionMode(100);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Illegal expansionMode setting.");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.0d + "'", double2 == 0.0d);
        org.junit.Assert.assertTrue("'" + float3 + "' != '" + 2.0f + "'", float3 == 2.0f);
        org.junit.Assert.assertTrue("'" + float4 + "' != '" + 2.0f + "'", float4 == 2.0f);
    }

    @Test
    public void test0079() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0079");
        org.apache.commons.math.util.ResizableDoubleArray resizableDoubleArray0 = new org.apache.commons.math.util.ResizableDoubleArray();
        float float1 = resizableDoubleArray0.getExpansionFactor();
        resizableDoubleArray0.addElement((double) 0.0f);
        // The following exception was thrown during execution in test generation
        try {
            resizableDoubleArray0.setExpansionMode(100);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Illegal expansionMode setting.");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + float1 + "' != '" + 2.0f + "'", float1 == 2.0f);
    }

    @Test
    public void test0080() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0080");
        org.apache.commons.math.util.ResizableDoubleArray resizableDoubleArray0 = new org.apache.commons.math.util.ResizableDoubleArray();
        double[] doubleArray1 = resizableDoubleArray0.getElements();
        resizableDoubleArray0.addElement((double) (short) -1);
        float float4 = resizableDoubleArray0.getExpansionFactor();
        resizableDoubleArray0.setElement((int) (byte) 100, (double) (short) 100);
        // The following exception was thrown during execution in test generation
        try {
            resizableDoubleArray0.setExpansionFactor(10.0f);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Contraction criteria can never be smaller than the expansion factor.  This would lead to a never ending loop of expansion and contraction as a newly expanded internal storage array would immediately satisfy the criteria for contraction");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(doubleArray1);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray1), "[]");
        org.junit.Assert.assertTrue("'" + float4 + "' != '" + 2.0f + "'", float4 == 2.0f);
    }

    @Test
    public void test0081() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0081");
        org.apache.commons.math.util.ResizableDoubleArray resizableDoubleArray0 = new org.apache.commons.math.util.ResizableDoubleArray();
        float float1 = resizableDoubleArray0.getExpansionFactor();
        resizableDoubleArray0.addElement((double) 0.0f);
        resizableDoubleArray0.addElement((double) 100.0f);
        resizableDoubleArray0.addElement((double) 0);
        double double9 = resizableDoubleArray0.addElementRolling((double) 10L);
        float float10 = resizableDoubleArray0.getContractionCriteria();
        resizableDoubleArray0.addElement(10.0d);
        // The following exception was thrown during execution in test generation
        try {
            resizableDoubleArray0.setContractionCriteria((float) 1L);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Contraction criteria can never be smaller than the expansion factor.  This would lead to a never ending loop of expansion and contraction as a newly expanded internal storage array would immediately satisfy the criteria for contraction");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + float1 + "' != '" + 2.0f + "'", float1 == 2.0f);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 0.0d + "'", double9 == 0.0d);
        org.junit.Assert.assertTrue("'" + float10 + "' != '" + 2.5f + "'", float10 == 2.5f);
    }

    @Test
    public void test0082() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0082");
        org.apache.commons.math.util.ResizableDoubleArray resizableDoubleArray0 = new org.apache.commons.math.util.ResizableDoubleArray();
        float float1 = resizableDoubleArray0.getExpansionFactor();
        resizableDoubleArray0.addElement((double) 0.0f);
        float float4 = resizableDoubleArray0.getContractionCriteria();
        // The following exception was thrown during execution in test generation
        try {
            resizableDoubleArray0.setExpansionFactor((float) '4');
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Contraction criteria can never be smaller than the expansion factor.  This would lead to a never ending loop of expansion and contraction as a newly expanded internal storage array would immediately satisfy the criteria for contraction");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + float1 + "' != '" + 2.0f + "'", float1 == 2.0f);
        org.junit.Assert.assertTrue("'" + float4 + "' != '" + 2.5f + "'", float4 == 2.5f);
    }

    @Test
    public void test0083() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0083");
        org.apache.commons.math.util.ResizableDoubleArray resizableDoubleArray0 = new org.apache.commons.math.util.ResizableDoubleArray();
        double double2 = resizableDoubleArray0.addElementRolling((double) ' ');
        resizableDoubleArray0.setElement((int) '#', (double) (short) 0);
        resizableDoubleArray0.setNumElements((int) (byte) 100);
        resizableDoubleArray0.setElement(100, (double) (byte) 100);
        java.lang.Class<?> wildcardClass11 = resizableDoubleArray0.getClass();
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.0d + "'", double2 == 0.0d);
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test0084() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0084");
        org.apache.commons.math.util.ResizableDoubleArray resizableDoubleArray0 = new org.apache.commons.math.util.ResizableDoubleArray();
        double double2 = resizableDoubleArray0.addElementRolling((double) ' ');
        resizableDoubleArray0.setElement((int) '#', (double) (short) 0);
        resizableDoubleArray0.setNumElements((int) (byte) 100);
        resizableDoubleArray0.contract();
        int int9 = resizableDoubleArray0.start();
        float float10 = resizableDoubleArray0.getContractionCriteria();
        resizableDoubleArray0.setContractionCriteria(2.0f);
        // The following exception was thrown during execution in test generation
        try {
            resizableDoubleArray0.setExpansionFactor((float) (short) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Contraction criteria can never be smaller than the expansion factor.  This would lead to a never ending loop of expansion and contraction as a newly expanded internal storage array would immediately satisfy the criteria for contraction");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.0d + "'", double2 == 0.0d);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + float10 + "' != '" + 2.5f + "'", float10 == 2.5f);
    }

    @Test
    public void test0085() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0085");
        org.apache.commons.math.util.ResizableDoubleArray resizableDoubleArray1 = new org.apache.commons.math.util.ResizableDoubleArray((int) (byte) 100);
        double[] doubleArray2 = resizableDoubleArray1.getValues();
        java.lang.Class<?> wildcardClass3 = resizableDoubleArray1.getClass();
        org.junit.Assert.assertNotNull(doubleArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray2), "[0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0]");
        org.junit.Assert.assertNotNull(wildcardClass3);
    }

    @Test
    public void test0086() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0086");
        org.apache.commons.math.util.ResizableDoubleArray resizableDoubleArray0 = new org.apache.commons.math.util.ResizableDoubleArray();
        double double2 = resizableDoubleArray0.addElementRolling((double) ' ');
        resizableDoubleArray0.setElement((int) '#', (double) (short) 0);
        double[] doubleArray6 = resizableDoubleArray0.getValues();
        int int7 = resizableDoubleArray0.getExpansionMode();
        resizableDoubleArray0.setElement((int) (byte) 0, (double) 2.5f);
        // The following exception was thrown during execution in test generation
        try {
            resizableDoubleArray0.setContractionCriteria(1.0f);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Contraction criteria can never be smaller than the expansion factor.  This would lead to a never ending loop of expansion and contraction as a newly expanded internal storage array would immediately satisfy the criteria for contraction");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.0d + "'", double2 == 0.0d);
        org.junit.Assert.assertNotNull(doubleArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray6), "[2.5, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0]");
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
    }

    @Test
    public void test0087() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0087");
        org.apache.commons.math.util.ResizableDoubleArray resizableDoubleArray0 = new org.apache.commons.math.util.ResizableDoubleArray();
        double[] doubleArray1 = resizableDoubleArray0.getValues();
        float float2 = resizableDoubleArray0.getExpansionFactor();
        float float3 = resizableDoubleArray0.getExpansionFactor();
        double double5 = resizableDoubleArray0.addElementRolling(0.0d);
        // The following exception was thrown during execution in test generation
        try {
            resizableDoubleArray0.discardFrontElements((int) (short) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Cannot discard a negative number of elements.");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(doubleArray1);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray1), "[0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0]");
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 2.0f + "'", float2 == 2.0f);
        org.junit.Assert.assertTrue("'" + float3 + "' != '" + 2.0f + "'", float3 == 2.0f);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
    }

    @Test
    public void test0088() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0088");
        org.apache.commons.math.util.ResizableDoubleArray resizableDoubleArray0 = new org.apache.commons.math.util.ResizableDoubleArray();
        double double2 = resizableDoubleArray0.addElementRolling((double) ' ');
        resizableDoubleArray0.setElement((int) '#', (double) (short) 0);
        resizableDoubleArray0.setNumElements((int) (byte) 100);
        int int8 = resizableDoubleArray0.start();
        double[] doubleArray9 = resizableDoubleArray0.getValues();
        int int10 = resizableDoubleArray0.start();
        // The following exception was thrown during execution in test generation
        try {
            double double12 = resizableDoubleArray0.getElement((int) (short) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Elements cannot be retrieved from a negative array index");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.0d + "'", double2 == 0.0d);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertNotNull(doubleArray9);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray9), "[0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0]");
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
    }

    @Test
    public void test0089() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0089");
        org.apache.commons.math.util.ResizableDoubleArray resizableDoubleArray2 = new org.apache.commons.math.util.ResizableDoubleArray((int) (short) 100, (float) (byte) 10);
        double[] doubleArray3 = resizableDoubleArray2.getValues();
        java.lang.Class<?> wildcardClass4 = resizableDoubleArray2.getClass();
        org.junit.Assert.assertNotNull(doubleArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray3), "[0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0]");
        org.junit.Assert.assertNotNull(wildcardClass4);
    }

    @Test
    public void test0090() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0090");
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math.util.ResizableDoubleArray resizableDoubleArray3 = new org.apache.commons.math.util.ResizableDoubleArray((int) '4', (float) 0L, (float) ' ');
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The expansion factor must be a number greater than 1.0");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void test0091() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0091");
        org.apache.commons.math.util.ResizableDoubleArray resizableDoubleArray0 = new org.apache.commons.math.util.ResizableDoubleArray();
        double double2 = resizableDoubleArray0.addElementRolling((double) ' ');
        resizableDoubleArray0.setElement((int) '#', (double) (short) 0);
        double[] doubleArray6 = resizableDoubleArray0.getValues();
        int int7 = resizableDoubleArray0.getExpansionMode();
        java.lang.Class<?> wildcardClass8 = resizableDoubleArray0.getClass();
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.0d + "'", double2 == 0.0d);
        org.junit.Assert.assertNotNull(doubleArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray6), "[0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0]");
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test0092() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0092");
        org.apache.commons.math.util.ResizableDoubleArray resizableDoubleArray0 = new org.apache.commons.math.util.ResizableDoubleArray();
        double[] doubleArray1 = resizableDoubleArray0.getValues();
        float float2 = resizableDoubleArray0.getExpansionFactor();
        float float3 = resizableDoubleArray0.getExpansionFactor();
        double double5 = resizableDoubleArray0.addElementRolling(0.0d);
        double double7 = resizableDoubleArray0.addElementRolling((double) 1);
        int int8 = resizableDoubleArray0.start();
        // The following exception was thrown during execution in test generation
        try {
            resizableDoubleArray0.discardFrontElements(35);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Cannot discard more elements than arecontained in this array.");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(doubleArray1);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray1), "[0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0]");
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 2.0f + "'", float2 == 2.0f);
        org.junit.Assert.assertTrue("'" + float3 + "' != '" + 2.0f + "'", float3 == 2.0f);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 0.0d + "'", double7 == 0.0d);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
    }

    @Test
    public void test0093() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0093");
        org.apache.commons.math.util.ResizableDoubleArray resizableDoubleArray0 = new org.apache.commons.math.util.ResizableDoubleArray();
        double double2 = resizableDoubleArray0.addElementRolling((double) ' ');
        resizableDoubleArray0.setElement((int) '#', (double) (short) 0);
        // The following exception was thrown during execution in test generation
        try {
            double double7 = resizableDoubleArray0.getElement((int) 'a');
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: The index specified: 97 is larger than the current number of elements");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.0d + "'", double2 == 0.0d);
    }

    @Test
    public void test0094() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0094");
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math.util.ResizableDoubleArray resizableDoubleArray4 = new org.apache.commons.math.util.ResizableDoubleArray(1, (-1.0f), (float) (short) 0, 1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The expansion factor must be a number greater than 1.0");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void test0095() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0095");
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math.util.ResizableDoubleArray resizableDoubleArray4 = new org.apache.commons.math.util.ResizableDoubleArray((int) '4', (float) (short) 0, (float) (short) 1, (int) (byte) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The expansion factor must be a number greater than 1.0");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void test0096() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0096");
        org.apache.commons.math.util.ResizableDoubleArray resizableDoubleArray1 = new org.apache.commons.math.util.ResizableDoubleArray(10);
    }

    @Test
    public void test0097() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0097");
        org.apache.commons.math.util.ResizableDoubleArray resizableDoubleArray0 = new org.apache.commons.math.util.ResizableDoubleArray();
        double[] doubleArray1 = resizableDoubleArray0.getValues();
        float float2 = resizableDoubleArray0.getExpansionFactor();
        float float3 = resizableDoubleArray0.getExpansionFactor();
        double double5 = resizableDoubleArray0.addElementRolling(0.0d);
        resizableDoubleArray0.contract();
        // The following exception was thrown during execution in test generation
        try {
            resizableDoubleArray0.setNumElements((-1));
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Number of elements must be zero or a positive integer");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(doubleArray1);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray1), "[0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0]");
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 2.0f + "'", float2 == 2.0f);
        org.junit.Assert.assertTrue("'" + float3 + "' != '" + 2.0f + "'", float3 == 2.0f);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
    }

    @Test
    public void test0098() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0098");
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math.util.ResizableDoubleArray resizableDoubleArray2 = new org.apache.commons.math.util.ResizableDoubleArray((-1), (float) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The initial capacity supplied: -1must be a positive integer");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void test0099() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0099");
        org.apache.commons.math.util.ResizableDoubleArray resizableDoubleArray0 = new org.apache.commons.math.util.ResizableDoubleArray();
        float float1 = resizableDoubleArray0.getExpansionFactor();
        resizableDoubleArray0.setExpansionMode(1);
        // The following exception was thrown during execution in test generation
        try {
            double double5 = resizableDoubleArray0.getElement(10);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: The index specified: 10 is larger than the current number of elements");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + float1 + "' != '" + 2.0f + "'", float1 == 2.0f);
    }

    @Test
    public void test0100() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0100");
        org.apache.commons.math.util.ResizableDoubleArray resizableDoubleArray1 = new org.apache.commons.math.util.ResizableDoubleArray((int) (short) 1);
        // The following exception was thrown during execution in test generation
        try {
            resizableDoubleArray1.discardFrontElements((int) '4');
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Cannot discard more elements than arecontained in this array.");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void test0101() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0101");
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math.util.ResizableDoubleArray resizableDoubleArray4 = new org.apache.commons.math.util.ResizableDoubleArray((int) (short) 100, (float) (byte) 10, (float) ' ', (int) (byte) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Illegal expansionMode setting.");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void test0102() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0102");
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math.util.ResizableDoubleArray resizableDoubleArray2 = new org.apache.commons.math.util.ResizableDoubleArray((int) ' ', (float) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The expansion factor must be a number greater than 1.0");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void test0103() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0103");
        org.apache.commons.math.util.ResizableDoubleArray resizableDoubleArray0 = new org.apache.commons.math.util.ResizableDoubleArray();
        double double2 = resizableDoubleArray0.addElementRolling((double) ' ');
        resizableDoubleArray0.setElement((int) '#', (double) (short) 0);
        resizableDoubleArray0.setNumElements((int) (byte) 100);
        int int8 = resizableDoubleArray0.start();
        double[] doubleArray9 = resizableDoubleArray0.getValues();
        double[] doubleArray10 = resizableDoubleArray0.getElements();
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.0d + "'", double2 == 0.0d);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertNotNull(doubleArray9);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray9), "[0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0]");
        org.junit.Assert.assertNotNull(doubleArray10);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray10), "[0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0]");
    }

    @Test
    public void test0104() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0104");
        org.apache.commons.math.util.ResizableDoubleArray resizableDoubleArray0 = new org.apache.commons.math.util.ResizableDoubleArray();
        double double2 = resizableDoubleArray0.addElementRolling((double) ' ');
        resizableDoubleArray0.setElement((int) '#', (double) (short) 0);
        resizableDoubleArray0.setNumElements((int) (byte) 100);
        resizableDoubleArray0.contract();
        int int9 = resizableDoubleArray0.start();
        float float10 = resizableDoubleArray0.getContractionCriteria();
        resizableDoubleArray0.setContractionCriteria(2.0f);
        float float13 = resizableDoubleArray0.getExpansionFactor();
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.0d + "'", double2 == 0.0d);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + float10 + "' != '" + 2.5f + "'", float10 == 2.5f);
        org.junit.Assert.assertTrue("'" + float13 + "' != '" + 2.0f + "'", float13 == 2.0f);
    }

    @Test
    public void test0105() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0105");
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math.util.ResizableDoubleArray resizableDoubleArray2 = new org.apache.commons.math.util.ResizableDoubleArray((int) ' ', (float) (short) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The expansion factor must be a number greater than 1.0");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void test0106() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0106");
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math.util.ResizableDoubleArray resizableDoubleArray3 = new org.apache.commons.math.util.ResizableDoubleArray((int) 'a', 2.5f, 0.0f);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Contraction criteria can never be smaller than the expansion factor.  This would lead to a never ending loop of expansion and contraction as a newly expanded internal storage array would immediately satisfy the criteria for contraction");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void test0107() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0107");
        org.apache.commons.math.util.ResizableDoubleArray resizableDoubleArray0 = new org.apache.commons.math.util.ResizableDoubleArray();
        float float1 = resizableDoubleArray0.getExpansionFactor();
        int int2 = resizableDoubleArray0.start();
        int int3 = resizableDoubleArray0.start();
        // The following exception was thrown during execution in test generation
        try {
            resizableDoubleArray0.setExpansionFactor((float) 'a');
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Contraction criteria can never be smaller than the expansion factor.  This would lead to a never ending loop of expansion and contraction as a newly expanded internal storage array would immediately satisfy the criteria for contraction");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + float1 + "' != '" + 2.0f + "'", float1 == 2.0f);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
    }

    @Test
    public void test0108() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0108");
        org.apache.commons.math.util.ResizableDoubleArray resizableDoubleArray0 = new org.apache.commons.math.util.ResizableDoubleArray();
        double double2 = resizableDoubleArray0.addElementRolling((double) ' ');
        resizableDoubleArray0.setElement((int) '#', (double) (short) 0);
        resizableDoubleArray0.setNumElements((int) (byte) 100);
        int int8 = resizableDoubleArray0.start();
        // The following exception was thrown during execution in test generation
        try {
            double double10 = resizableDoubleArray0.getElement((int) (short) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Elements cannot be retrieved from a negative array index");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.0d + "'", double2 == 0.0d);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
    }

    @Test
    public void test0109() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0109");
        org.apache.commons.math.util.ResizableDoubleArray resizableDoubleArray0 = new org.apache.commons.math.util.ResizableDoubleArray();
        double[] doubleArray1 = resizableDoubleArray0.getValues();
        float float2 = resizableDoubleArray0.getExpansionFactor();
        double[] doubleArray3 = resizableDoubleArray0.getElements();
        resizableDoubleArray0.clear();
        int int5 = resizableDoubleArray0.getExpansionMode();
        java.lang.Class<?> wildcardClass6 = resizableDoubleArray0.getClass();
        org.junit.Assert.assertNotNull(doubleArray1);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray1), "[0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0]");
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 2.0f + "'", float2 == 2.0f);
        org.junit.Assert.assertNotNull(doubleArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray3), "[]");
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void test0110() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0110");
        org.apache.commons.math.util.ResizableDoubleArray resizableDoubleArray0 = new org.apache.commons.math.util.ResizableDoubleArray();
        double double2 = resizableDoubleArray0.addElementRolling((double) ' ');
        resizableDoubleArray0.setElement((int) '#', (double) (short) 0);
        resizableDoubleArray0.setNumElements((int) (byte) 100);
        resizableDoubleArray0.contract();
        int int9 = resizableDoubleArray0.start();
        // The following exception was thrown during execution in test generation
        try {
            resizableDoubleArray0.setElement((int) (short) -1, (double) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Cannot set an element at a negative index");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.0d + "'", double2 == 0.0d);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
    }

    @Test
    public void test0111() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0111");
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math.util.ResizableDoubleArray resizableDoubleArray4 = new org.apache.commons.math.util.ResizableDoubleArray(1, (float) (short) 0, 100.0f, 36);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The expansion factor must be a number greater than 1.0");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void test0112() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0112");
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math.util.ResizableDoubleArray resizableDoubleArray2 = new org.apache.commons.math.util.ResizableDoubleArray((int) '4', (float) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The expansion factor must be a number greater than 1.0");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void test0113() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0113");
        org.apache.commons.math.util.ResizableDoubleArray resizableDoubleArray0 = new org.apache.commons.math.util.ResizableDoubleArray();
        double double2 = resizableDoubleArray0.addElementRolling((double) ' ');
        resizableDoubleArray0.setElement((int) '#', (double) (short) 0);
        resizableDoubleArray0.setNumElements((int) (byte) 100);
        resizableDoubleArray0.setElement(100, (double) (byte) 100);
        resizableDoubleArray0.contract();
        resizableDoubleArray0.clear();
        // The following exception was thrown during execution in test generation
        try {
            resizableDoubleArray0.setElement((-1), (double) (-1L));
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Cannot set an element at a negative index");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.0d + "'", double2 == 0.0d);
    }

    @Test
    public void test0114() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0114");
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math.util.ResizableDoubleArray resizableDoubleArray3 = new org.apache.commons.math.util.ResizableDoubleArray((int) (short) 10, (float) 1, (float) 1L);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The expansion factor must be a number greater than 1.0");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void test0115() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0115");
        org.apache.commons.math.util.ResizableDoubleArray resizableDoubleArray0 = new org.apache.commons.math.util.ResizableDoubleArray();
        double[] doubleArray1 = resizableDoubleArray0.getValues();
        float float2 = resizableDoubleArray0.getExpansionFactor();
        double[] doubleArray3 = resizableDoubleArray0.getElements();
        resizableDoubleArray0.clear();
        int int5 = resizableDoubleArray0.getExpansionMode();
        // The following exception was thrown during execution in test generation
        try {
            double double7 = resizableDoubleArray0.getElement((int) (byte) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: The index specified: 10 is larger than the current number of elements");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(doubleArray1);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray1), "[0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0]");
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 2.0f + "'", float2 == 2.0f);
        org.junit.Assert.assertNotNull(doubleArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray3), "[]");
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
    }

    @Test
    public void test0116() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0116");
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math.util.ResizableDoubleArray resizableDoubleArray4 = new org.apache.commons.math.util.ResizableDoubleArray(10, (float) 'a', (float) 1L, 0);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Contraction criteria can never be smaller than the expansion factor.  This would lead to a never ending loop of expansion and contraction as a newly expanded internal storage array would immediately satisfy the criteria for contraction");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void test0117() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0117");
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math.util.ResizableDoubleArray resizableDoubleArray4 = new org.apache.commons.math.util.ResizableDoubleArray((int) 'a', (float) (short) 10, (float) (byte) 0, 0);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Contraction criteria can never be smaller than the expansion factor.  This would lead to a never ending loop of expansion and contraction as a newly expanded internal storage array would immediately satisfy the criteria for contraction");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void test0118() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0118");
        org.apache.commons.math.util.ResizableDoubleArray resizableDoubleArray0 = new org.apache.commons.math.util.ResizableDoubleArray();
        double double2 = resizableDoubleArray0.addElementRolling((double) ' ');
        resizableDoubleArray0.setElement((int) '#', (double) (short) 0);
        double[] doubleArray6 = resizableDoubleArray0.getValues();
        resizableDoubleArray0.setContractionCriteria((float) ' ');
        // The following exception was thrown during execution in test generation
        try {
            resizableDoubleArray0.discardFrontElements((int) (short) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Cannot discard a negative number of elements.");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.0d + "'", double2 == 0.0d);
        org.junit.Assert.assertNotNull(doubleArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray6), "[0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0]");
    }

    @Test
    public void test0119() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0119");
        org.apache.commons.math.util.ResizableDoubleArray resizableDoubleArray0 = new org.apache.commons.math.util.ResizableDoubleArray();
        double double2 = resizableDoubleArray0.addElementRolling((double) ' ');
        resizableDoubleArray0.setElement((int) '#', (double) (short) 0);
        double double7 = resizableDoubleArray0.getElement(10);
        resizableDoubleArray0.clear();
        // The following exception was thrown during execution in test generation
        try {
            resizableDoubleArray0.setExpansionFactor((float) (short) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Contraction criteria can never be smaller than the expansion factor.  This would lead to a never ending loop of expansion and contraction as a newly expanded internal storage array would immediately satisfy the criteria for contraction");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.0d + "'", double2 == 0.0d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 0.0d + "'", double7 == 0.0d);
    }

    @Test
    public void test0120() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0120");
        org.apache.commons.math.util.ResizableDoubleArray resizableDoubleArray0 = new org.apache.commons.math.util.ResizableDoubleArray();
        double double2 = resizableDoubleArray0.addElementRolling((double) ' ');
        int int3 = resizableDoubleArray0.getExpansionMode();
        resizableDoubleArray0.contract();
        // The following exception was thrown during execution in test generation
        try {
            resizableDoubleArray0.setExpansionFactor((float) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Contraction criteria can never be smaller than the expansion factor.  This would lead to a never ending loop of expansion and contraction as a newly expanded internal storage array would immediately satisfy the criteria for contraction");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.0d + "'", double2 == 0.0d);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
    }

    @Test
    public void test0121() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0121");
        org.apache.commons.math.util.ResizableDoubleArray resizableDoubleArray0 = new org.apache.commons.math.util.ResizableDoubleArray();
        float float1 = resizableDoubleArray0.getExpansionFactor();
        resizableDoubleArray0.setElement((int) (short) 1, (double) 0.0f);
        resizableDoubleArray0.setExpansionFactor(2.5f);
        // The following exception was thrown during execution in test generation
        try {
            resizableDoubleArray0.setContractionCriteria((float) (byte) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Contraction criteria can never be smaller than the expansion factor.  This would lead to a never ending loop of expansion and contraction as a newly expanded internal storage array would immediately satisfy the criteria for contraction");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + float1 + "' != '" + 2.0f + "'", float1 == 2.0f);
    }

    @Test
    public void test0122() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0122");
        org.apache.commons.math.util.ResizableDoubleArray resizableDoubleArray0 = new org.apache.commons.math.util.ResizableDoubleArray();
        double double2 = resizableDoubleArray0.addElementRolling((double) ' ');
        float float3 = resizableDoubleArray0.getExpansionFactor();
        float float4 = resizableDoubleArray0.getExpansionFactor();
        // The following exception was thrown during execution in test generation
        try {
            resizableDoubleArray0.setExpansionFactor(0.0f);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The expansion factor must be a number greater than 1.0");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.0d + "'", double2 == 0.0d);
        org.junit.Assert.assertTrue("'" + float3 + "' != '" + 2.0f + "'", float3 == 2.0f);
        org.junit.Assert.assertTrue("'" + float4 + "' != '" + 2.0f + "'", float4 == 2.0f);
    }

    @Test
    public void test0123() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0123");
        org.apache.commons.math.util.ResizableDoubleArray resizableDoubleArray1 = new org.apache.commons.math.util.ResizableDoubleArray((int) (byte) 100);
        double[] doubleArray2 = resizableDoubleArray1.getValues();
        // The following exception was thrown during execution in test generation
        try {
            resizableDoubleArray1.setExpansionFactor((float) (-1));
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The expansion factor must be a number greater than 1.0");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(doubleArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray2), "[0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0]");
    }

    @Test
    public void test0124() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0124");
        org.apache.commons.math.util.ResizableDoubleArray resizableDoubleArray0 = new org.apache.commons.math.util.ResizableDoubleArray();
        double double2 = resizableDoubleArray0.addElementRolling((double) ' ');
        resizableDoubleArray0.setElement((int) '#', (double) (short) 0);
        double[] doubleArray6 = resizableDoubleArray0.getValues();
        double[] doubleArray7 = resizableDoubleArray0.getValues();
        int int8 = resizableDoubleArray0.getNumElements();
        resizableDoubleArray0.setElement((int) ' ', 0.0d);
        // The following exception was thrown during execution in test generation
        try {
            resizableDoubleArray0.setExpansionFactor((float) 'a');
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Contraction criteria can never be smaller than the expansion factor.  This would lead to a never ending loop of expansion and contraction as a newly expanded internal storage array would immediately satisfy the criteria for contraction");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.0d + "'", double2 == 0.0d);
        org.junit.Assert.assertNotNull(doubleArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray6), "[0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0]");
        org.junit.Assert.assertNotNull(doubleArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray7), "[0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0]");
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 36 + "'", int8 == 36);
    }

    @Test
    public void test0125() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0125");
        org.apache.commons.math.util.ResizableDoubleArray resizableDoubleArray1 = new org.apache.commons.math.util.ResizableDoubleArray((int) (byte) 100);
        int int2 = resizableDoubleArray1.getExpansionMode();
        double[] doubleArray3 = resizableDoubleArray1.getValues();
        // The following exception was thrown during execution in test generation
        try {
            resizableDoubleArray1.discardFrontElements(1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Cannot discard more elements than arecontained in this array.");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertNotNull(doubleArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray3), "[0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0]");
    }

    @Test
    public void test0126() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0126");
        org.apache.commons.math.util.ResizableDoubleArray resizableDoubleArray0 = new org.apache.commons.math.util.ResizableDoubleArray();
        float float1 = resizableDoubleArray0.getExpansionFactor();
        resizableDoubleArray0.addElement((double) 0.0f);
        float float4 = resizableDoubleArray0.getContractionCriteria();
        // The following exception was thrown during execution in test generation
        try {
            resizableDoubleArray0.setExpansionMode((int) (short) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Illegal expansionMode setting.");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + float1 + "' != '" + 2.0f + "'", float1 == 2.0f);
        org.junit.Assert.assertTrue("'" + float4 + "' != '" + 2.5f + "'", float4 == 2.5f);
    }

    @Test
    public void test0127() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0127");
        org.apache.commons.math.util.ResizableDoubleArray resizableDoubleArray2 = new org.apache.commons.math.util.ResizableDoubleArray((int) (byte) 1, (float) 36);
        int int3 = resizableDoubleArray2.getNumElements();
        java.lang.Class<?> wildcardClass4 = resizableDoubleArray2.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertNotNull(wildcardClass4);
    }

    @Test
    public void test0128() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0128");
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math.util.ResizableDoubleArray resizableDoubleArray3 = new org.apache.commons.math.util.ResizableDoubleArray(1, (float) (short) 100, (-1.0f));
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Contraction criteria can never be smaller than the expansion factor.  This would lead to a never ending loop of expansion and contraction as a newly expanded internal storage array would immediately satisfy the criteria for contraction");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void test0129() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0129");
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math.util.ResizableDoubleArray resizableDoubleArray2 = new org.apache.commons.math.util.ResizableDoubleArray(10, (float) 1L);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The expansion factor must be a number greater than 1.0");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void test0130() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0130");
        org.apache.commons.math.util.ResizableDoubleArray resizableDoubleArray2 = new org.apache.commons.math.util.ResizableDoubleArray(1, (float) (short) 10);
    }

    @Test
    public void test0131() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0131");
        org.apache.commons.math.util.ResizableDoubleArray resizableDoubleArray0 = new org.apache.commons.math.util.ResizableDoubleArray();
        double double2 = resizableDoubleArray0.addElementRolling((double) ' ');
        // The following exception was thrown during execution in test generation
        try {
            resizableDoubleArray0.setContractionCriteria((float) 1L);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Contraction criteria can never be smaller than the expansion factor.  This would lead to a never ending loop of expansion and contraction as a newly expanded internal storage array would immediately satisfy the criteria for contraction");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.0d + "'", double2 == 0.0d);
    }

    @Test
    public void test0132() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0132");
        org.apache.commons.math.util.ResizableDoubleArray resizableDoubleArray2 = new org.apache.commons.math.util.ResizableDoubleArray((int) (byte) 100, 100.0f);
        resizableDoubleArray2.setElement(0, 1.0d);
        // The following exception was thrown during execution in test generation
        try {
            resizableDoubleArray2.setExpansionMode((int) 'a');
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Illegal expansionMode setting.");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void test0133() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0133");
        org.apache.commons.math.util.ResizableDoubleArray resizableDoubleArray1 = new org.apache.commons.math.util.ResizableDoubleArray((int) (byte) 100);
        int int2 = resizableDoubleArray1.getExpansionMode();
        resizableDoubleArray1.clear();
        // The following exception was thrown during execution in test generation
        try {
            double double5 = resizableDoubleArray1.getElement((int) (short) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: The index specified: 0 is larger than the current number of elements");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
    }

    @Test
    public void test0134() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0134");
        org.apache.commons.math.util.ResizableDoubleArray resizableDoubleArray0 = new org.apache.commons.math.util.ResizableDoubleArray();
        double double2 = resizableDoubleArray0.addElementRolling((double) ' ');
        resizableDoubleArray0.setElement((int) '#', (double) (short) 0);
        resizableDoubleArray0.setNumElements((int) (byte) 100);
        // The following exception was thrown during execution in test generation
        try {
            resizableDoubleArray0.setExpansionFactor(10.0f);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Contraction criteria can never be smaller than the expansion factor.  This would lead to a never ending loop of expansion and contraction as a newly expanded internal storage array would immediately satisfy the criteria for contraction");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.0d + "'", double2 == 0.0d);
    }

    @Test
    public void test0135() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0135");
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math.util.ResizableDoubleArray resizableDoubleArray3 = new org.apache.commons.math.util.ResizableDoubleArray((int) 'a', (float) 100, 0.0f);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Contraction criteria can never be smaller than the expansion factor.  This would lead to a never ending loop of expansion and contraction as a newly expanded internal storage array would immediately satisfy the criteria for contraction");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void test0136() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0136");
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math.util.ResizableDoubleArray resizableDoubleArray4 = new org.apache.commons.math.util.ResizableDoubleArray(36, (float) 'a', (float) ' ', (int) (byte) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Contraction criteria can never be smaller than the expansion factor.  This would lead to a never ending loop of expansion and contraction as a newly expanded internal storage array would immediately satisfy the criteria for contraction");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void test0137() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0137");
        org.apache.commons.math.util.ResizableDoubleArray resizableDoubleArray0 = new org.apache.commons.math.util.ResizableDoubleArray();
        double[] doubleArray1 = resizableDoubleArray0.getValues();
        float float2 = resizableDoubleArray0.getExpansionFactor();
        // The following exception was thrown during execution in test generation
        try {
            resizableDoubleArray0.setContractionCriteria((float) (byte) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Contraction criteria can never be smaller than the expansion factor.  This would lead to a never ending loop of expansion and contraction as a newly expanded internal storage array would immediately satisfy the criteria for contraction");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(doubleArray1);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray1), "[0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0]");
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 2.0f + "'", float2 == 2.0f);
    }

    @Test
    public void test0138() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0138");
        org.apache.commons.math.util.ResizableDoubleArray resizableDoubleArray0 = new org.apache.commons.math.util.ResizableDoubleArray();
        float float1 = resizableDoubleArray0.getExpansionFactor();
        // The following exception was thrown during execution in test generation
        try {
            double double3 = resizableDoubleArray0.getElement((int) (byte) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: The index specified: 100 is larger than the current number of elements");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + float1 + "' != '" + 2.0f + "'", float1 == 2.0f);
    }

    @Test
    public void test0139() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0139");
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math.util.ResizableDoubleArray resizableDoubleArray2 = new org.apache.commons.math.util.ResizableDoubleArray((int) (byte) 10, 1.0f);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The expansion factor must be a number greater than 1.0");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void test0140() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0140");
        org.apache.commons.math.util.ResizableDoubleArray resizableDoubleArray0 = new org.apache.commons.math.util.ResizableDoubleArray();
        double[] doubleArray1 = resizableDoubleArray0.getValues();
        float float2 = resizableDoubleArray0.getExpansionFactor();
        float float3 = resizableDoubleArray0.getExpansionFactor();
        double double5 = resizableDoubleArray0.addElementRolling(0.0d);
        float float6 = resizableDoubleArray0.getContractionCriteria();
        double double8 = resizableDoubleArray0.addElementRolling((double) 36);
        // The following exception was thrown during execution in test generation
        try {
            resizableDoubleArray0.discardFrontElements((int) (byte) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Cannot discard more elements than arecontained in this array.");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(doubleArray1);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray1), "[0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0]");
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 2.0f + "'", float2 == 2.0f);
        org.junit.Assert.assertTrue("'" + float3 + "' != '" + 2.0f + "'", float3 == 2.0f);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
        org.junit.Assert.assertTrue("'" + float6 + "' != '" + 2.5f + "'", float6 == 2.5f);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 0.0d + "'", double8 == 0.0d);
    }

    @Test
    public void test0141() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0141");
        org.apache.commons.math.util.ResizableDoubleArray resizableDoubleArray0 = new org.apache.commons.math.util.ResizableDoubleArray();
        float float1 = resizableDoubleArray0.getExpansionFactor();
        resizableDoubleArray0.addElement((double) 0.0f);
        resizableDoubleArray0.addElement((double) 100.0f);
        resizableDoubleArray0.addElement((double) 0);
        // The following exception was thrown during execution in test generation
        try {
            resizableDoubleArray0.setContractionCriteria((float) (-1));
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Contraction criteria can never be smaller than the expansion factor.  This would lead to a never ending loop of expansion and contraction as a newly expanded internal storage array would immediately satisfy the criteria for contraction");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + float1 + "' != '" + 2.0f + "'", float1 == 2.0f);
    }

    @Test
    public void test0142() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0142");
        org.apache.commons.math.util.ResizableDoubleArray resizableDoubleArray2 = new org.apache.commons.math.util.ResizableDoubleArray((int) (short) 1, 10.0f);
        double[] doubleArray3 = resizableDoubleArray2.getElements();
        java.lang.Class<?> wildcardClass4 = resizableDoubleArray2.getClass();
        org.junit.Assert.assertNotNull(doubleArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray3), "[]");
        org.junit.Assert.assertNotNull(wildcardClass4);
    }

    @Test
    public void test0143() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0143");
        org.apache.commons.math.util.ResizableDoubleArray resizableDoubleArray0 = new org.apache.commons.math.util.ResizableDoubleArray();
        double double2 = resizableDoubleArray0.addElementRolling((double) ' ');
        // The following exception was thrown during execution in test generation
        try {
            resizableDoubleArray0.setExpansionFactor((float) (short) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The expansion factor must be a number greater than 1.0");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.0d + "'", double2 == 0.0d);
    }

    @Test
    public void test0144() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0144");
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math.util.ResizableDoubleArray resizableDoubleArray3 = new org.apache.commons.math.util.ResizableDoubleArray((int) (short) 0, 10.0f, (float) (short) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The initial capacity supplied: 0must be a positive integer");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void test0145() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0145");
        org.apache.commons.math.util.ResizableDoubleArray resizableDoubleArray0 = new org.apache.commons.math.util.ResizableDoubleArray();
        double double2 = resizableDoubleArray0.addElementRolling((double) ' ');
        int int3 = resizableDoubleArray0.getExpansionMode();
        float float4 = resizableDoubleArray0.getExpansionFactor();
        // The following exception was thrown during execution in test generation
        try {
            resizableDoubleArray0.setExpansionFactor((float) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Contraction criteria can never be smaller than the expansion factor.  This would lead to a never ending loop of expansion and contraction as a newly expanded internal storage array would immediately satisfy the criteria for contraction");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.0d + "'", double2 == 0.0d);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + float4 + "' != '" + 2.0f + "'", float4 == 2.0f);
    }

    @Test
    public void test0146() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0146");
        org.apache.commons.math.util.ResizableDoubleArray resizableDoubleArray0 = new org.apache.commons.math.util.ResizableDoubleArray();
        float float1 = resizableDoubleArray0.getExpansionFactor();
        double double3 = resizableDoubleArray0.addElementRolling(0.0d);
        float float4 = resizableDoubleArray0.getContractionCriteria();
        // The following exception was thrown during execution in test generation
        try {
            double double6 = resizableDoubleArray0.getElement((int) (short) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Elements cannot be retrieved from a negative array index");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + float1 + "' != '" + 2.0f + "'", float1 == 2.0f);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 0.0d + "'", double3 == 0.0d);
        org.junit.Assert.assertTrue("'" + float4 + "' != '" + 2.5f + "'", float4 == 2.5f);
    }

    @Test
    public void test0147() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0147");
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math.util.ResizableDoubleArray resizableDoubleArray3 = new org.apache.commons.math.util.ResizableDoubleArray((int) (byte) 0, (float) 10L, 2.5f);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Contraction criteria can never be smaller than the expansion factor.  This would lead to a never ending loop of expansion and contraction as a newly expanded internal storage array would immediately satisfy the criteria for contraction");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void test0148() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0148");
        org.apache.commons.math.util.ResizableDoubleArray resizableDoubleArray0 = new org.apache.commons.math.util.ResizableDoubleArray();
        double double2 = resizableDoubleArray0.addElementRolling((double) ' ');
        resizableDoubleArray0.setElement((int) '#', (double) (short) 0);
        resizableDoubleArray0.setNumElements((int) (byte) 100);
        // The following exception was thrown during execution in test generation
        try {
            resizableDoubleArray0.setExpansionMode((int) (short) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Illegal expansionMode setting.");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.0d + "'", double2 == 0.0d);
    }

    @Test
    public void test0149() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0149");
        org.apache.commons.math.util.ResizableDoubleArray resizableDoubleArray2 = new org.apache.commons.math.util.ResizableDoubleArray((int) (short) 1, 10.0f);
        int int3 = resizableDoubleArray2.getExpansionMode();
        // The following exception was thrown during execution in test generation
        try {
            resizableDoubleArray2.setExpansionFactor((float) 1L);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The expansion factor must be a number greater than 1.0");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
    }

    @Test
    public void test0150() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0150");
        org.apache.commons.math.util.ResizableDoubleArray resizableDoubleArray0 = new org.apache.commons.math.util.ResizableDoubleArray();
        double[] doubleArray1 = resizableDoubleArray0.getValues();
        float float2 = resizableDoubleArray0.getExpansionFactor();
        float float3 = resizableDoubleArray0.getExpansionFactor();
        double double5 = resizableDoubleArray0.addElementRolling(0.0d);
        // The following exception was thrown during execution in test generation
        try {
            resizableDoubleArray0.discardFrontElements((int) ' ');
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Cannot discard more elements than arecontained in this array.");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(doubleArray1);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray1), "[0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0]");
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 2.0f + "'", float2 == 2.0f);
        org.junit.Assert.assertTrue("'" + float3 + "' != '" + 2.0f + "'", float3 == 2.0f);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
    }

    @Test
    public void test0151() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0151");
        org.apache.commons.math.util.ResizableDoubleArray resizableDoubleArray0 = new org.apache.commons.math.util.ResizableDoubleArray();
        double[] doubleArray1 = resizableDoubleArray0.getValues();
        float float2 = resizableDoubleArray0.getExpansionFactor();
        double[] doubleArray3 = resizableDoubleArray0.getElements();
        double double5 = resizableDoubleArray0.addElementRolling((double) (short) 10);
        int int6 = resizableDoubleArray0.getNumElements();
        org.junit.Assert.assertNotNull(doubleArray1);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray1), "[10.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0]");
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 2.0f + "'", float2 == 2.0f);
        org.junit.Assert.assertNotNull(doubleArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray3), "[]");
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
    }

    @Test
    public void test0152() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0152");
        org.apache.commons.math.util.ResizableDoubleArray resizableDoubleArray0 = new org.apache.commons.math.util.ResizableDoubleArray();
        double double2 = resizableDoubleArray0.addElementRolling((double) ' ');
        float float3 = resizableDoubleArray0.getExpansionFactor();
        float float4 = resizableDoubleArray0.getExpansionFactor();
        // The following exception was thrown during execution in test generation
        try {
            resizableDoubleArray0.setExpansionFactor((float) '#');
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Contraction criteria can never be smaller than the expansion factor.  This would lead to a never ending loop of expansion and contraction as a newly expanded internal storage array would immediately satisfy the criteria for contraction");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.0d + "'", double2 == 0.0d);
        org.junit.Assert.assertTrue("'" + float3 + "' != '" + 2.0f + "'", float3 == 2.0f);
        org.junit.Assert.assertTrue("'" + float4 + "' != '" + 2.0f + "'", float4 == 2.0f);
    }

    @Test
    public void test0153() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0153");
        org.apache.commons.math.util.ResizableDoubleArray resizableDoubleArray0 = new org.apache.commons.math.util.ResizableDoubleArray();
        double[] doubleArray1 = resizableDoubleArray0.getValues();
        float float2 = resizableDoubleArray0.getExpansionFactor();
        double[] doubleArray3 = resizableDoubleArray0.getElements();
        double double5 = resizableDoubleArray0.addElementRolling((double) (short) 10);
        // The following exception was thrown during execution in test generation
        try {
            double double7 = resizableDoubleArray0.getElement(35);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: The index specified: 35 is larger than the current number of elements");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(doubleArray1);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray1), "[10.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0]");
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 2.0f + "'", float2 == 2.0f);
        org.junit.Assert.assertNotNull(doubleArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray3), "[]");
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
    }

    @Test
    public void test0154() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0154");
        org.apache.commons.math.util.ResizableDoubleArray resizableDoubleArray0 = new org.apache.commons.math.util.ResizableDoubleArray();
        double double2 = resizableDoubleArray0.addElementRolling((double) ' ');
        float float3 = resizableDoubleArray0.getExpansionFactor();
        resizableDoubleArray0.setNumElements((int) '#');
        // The following exception was thrown during execution in test generation
        try {
            double double7 = resizableDoubleArray0.getElement((int) (short) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: The index specified: 100 is larger than the current number of elements");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.0d + "'", double2 == 0.0d);
        org.junit.Assert.assertTrue("'" + float3 + "' != '" + 2.0f + "'", float3 == 2.0f);
    }

    @Test
    public void test0155() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0155");
        org.apache.commons.math.util.ResizableDoubleArray resizableDoubleArray2 = new org.apache.commons.math.util.ResizableDoubleArray((int) (short) 10, (float) 100);
        // The following exception was thrown during execution in test generation
        try {
            double double4 = resizableDoubleArray2.getElement((int) (byte) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: The index specified: 1 is larger than the current number of elements");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
    }

    @Test
    public void test0156() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0156");
        org.apache.commons.math.util.ResizableDoubleArray resizableDoubleArray1 = new org.apache.commons.math.util.ResizableDoubleArray((int) (byte) 100);
        int int2 = resizableDoubleArray1.getExpansionMode();
        double[] doubleArray3 = resizableDoubleArray1.getValues();
        // The following exception was thrown during execution in test generation
        try {
            resizableDoubleArray1.setExpansionMode((int) (byte) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Illegal expansionMode setting.");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertNotNull(doubleArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray3), "[0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0]");
    }

    @Test
    public void test0157() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0157");
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math.util.ResizableDoubleArray resizableDoubleArray4 = new org.apache.commons.math.util.ResizableDoubleArray((int) (byte) 1, (float) (short) -1, 100.5f, 0);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The expansion factor must be a number greater than 1.0");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void test0158() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0158");
        org.apache.commons.math.util.ResizableDoubleArray resizableDoubleArray0 = new org.apache.commons.math.util.ResizableDoubleArray();
        double double2 = resizableDoubleArray0.addElementRolling((double) ' ');
        resizableDoubleArray0.setElement((int) '#', (double) (short) 0);
        resizableDoubleArray0.setNumElements((int) (byte) 100);
        resizableDoubleArray0.contract();
        resizableDoubleArray0.setElement(0, (double) (byte) -1);
        java.lang.Class<?> wildcardClass12 = resizableDoubleArray0.getClass();
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.0d + "'", double2 == 0.0d);
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test0159() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0159");
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math.util.ResizableDoubleArray resizableDoubleArray2 = new org.apache.commons.math.util.ResizableDoubleArray(100, (float) 1L);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The expansion factor must be a number greater than 1.0");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void test0160() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0160");
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math.util.ResizableDoubleArray resizableDoubleArray4 = new org.apache.commons.math.util.ResizableDoubleArray((int) (byte) 0, 0.0f, (float) 'a', 36);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The expansion factor must be a number greater than 1.0");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void test0161() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0161");
        org.apache.commons.math.util.ResizableDoubleArray resizableDoubleArray0 = new org.apache.commons.math.util.ResizableDoubleArray();
        double[] doubleArray1 = resizableDoubleArray0.getValues();
        float float2 = resizableDoubleArray0.getExpansionFactor();
        float float3 = resizableDoubleArray0.getExpansionFactor();
        double double5 = resizableDoubleArray0.addElementRolling(0.0d);
        int int6 = resizableDoubleArray0.getNumElements();
        int int7 = resizableDoubleArray0.start();
        resizableDoubleArray0.addElement((double) 10);
        // The following exception was thrown during execution in test generation
        try {
            resizableDoubleArray0.setContractionCriteria((float) (byte) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Contraction criteria can never be smaller than the expansion factor.  This would lead to a never ending loop of expansion and contraction as a newly expanded internal storage array would immediately satisfy the criteria for contraction");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(doubleArray1);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray1), "[0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0]");
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 2.0f + "'", float2 == 2.0f);
        org.junit.Assert.assertTrue("'" + float3 + "' != '" + 2.0f + "'", float3 == 2.0f);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
    }

    @Test
    public void test0162() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0162");
        org.apache.commons.math.util.ResizableDoubleArray resizableDoubleArray2 = new org.apache.commons.math.util.ResizableDoubleArray((int) (byte) 100, 100.0f);
        resizableDoubleArray2.setElement((int) (byte) 0, (double) 10.0f);
        int int6 = resizableDoubleArray2.start();
        // The following exception was thrown during execution in test generation
        try {
            resizableDoubleArray2.discardFrontElements(11);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Cannot discard more elements than arecontained in this array.");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
    }

    @Test
    public void test0163() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0163");
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math.util.ResizableDoubleArray resizableDoubleArray4 = new org.apache.commons.math.util.ResizableDoubleArray(10, 0.0f, (float) (short) -1, 0);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Contraction criteria can never be smaller than the expansion factor.  This would lead to a never ending loop of expansion and contraction as a newly expanded internal storage array would immediately satisfy the criteria for contraction");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void test0164() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0164");
        org.apache.commons.math.util.ResizableDoubleArray resizableDoubleArray0 = new org.apache.commons.math.util.ResizableDoubleArray();
        double[] doubleArray1 = resizableDoubleArray0.getValues();
        float float2 = resizableDoubleArray0.getExpansionFactor();
        float float3 = resizableDoubleArray0.getExpansionFactor();
        double double5 = resizableDoubleArray0.addElementRolling(0.0d);
        int int6 = resizableDoubleArray0.getNumElements();
        int int7 = resizableDoubleArray0.start();
        resizableDoubleArray0.contract();
        // The following exception was thrown during execution in test generation
        try {
            double double10 = resizableDoubleArray0.getElement(36);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: The index specified: 36 is larger than the current number of elements");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(doubleArray1);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray1), "[0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0]");
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 2.0f + "'", float2 == 2.0f);
        org.junit.Assert.assertTrue("'" + float3 + "' != '" + 2.0f + "'", float3 == 2.0f);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
    }

    @Test
    public void test0165() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0165");
        org.apache.commons.math.util.ResizableDoubleArray resizableDoubleArray0 = new org.apache.commons.math.util.ResizableDoubleArray();
        float float1 = resizableDoubleArray0.getExpansionFactor();
        double[] doubleArray2 = resizableDoubleArray0.getValues();
        float float3 = resizableDoubleArray0.getExpansionFactor();
        java.lang.Class<?> wildcardClass4 = resizableDoubleArray0.getClass();
        org.junit.Assert.assertTrue("'" + float1 + "' != '" + 2.0f + "'", float1 == 2.0f);
        org.junit.Assert.assertNotNull(doubleArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray2), "[0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0]");
        org.junit.Assert.assertTrue("'" + float3 + "' != '" + 2.0f + "'", float3 == 2.0f);
        org.junit.Assert.assertNotNull(wildcardClass4);
    }

    @Test
    public void test0166() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0166");
        org.apache.commons.math.util.ResizableDoubleArray resizableDoubleArray2 = new org.apache.commons.math.util.ResizableDoubleArray((int) (short) 100, (float) (byte) 10);
        resizableDoubleArray2.setExpansionMode((int) (short) 0);
        // The following exception was thrown during execution in test generation
        try {
            double double6 = resizableDoubleArray2.getElement((int) 'a');
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: The index specified: 97 is larger than the current number of elements");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
    }

    @Test
    public void test0167() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0167");
        org.apache.commons.math.util.ResizableDoubleArray resizableDoubleArray0 = new org.apache.commons.math.util.ResizableDoubleArray();
        double double2 = resizableDoubleArray0.addElementRolling((double) ' ');
        resizableDoubleArray0.setElement((int) '#', (double) (short) 0);
        resizableDoubleArray0.setNumElements((int) (byte) 100);
        int int8 = resizableDoubleArray0.start();
        int int9 = resizableDoubleArray0.getNumElements();
        float float10 = resizableDoubleArray0.getContractionCriteria();
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.0d + "'", double2 == 0.0d);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 100 + "'", int9 == 100);
        org.junit.Assert.assertTrue("'" + float10 + "' != '" + 2.5f + "'", float10 == 2.5f);
    }

    @Test
    public void test0168() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0168");
        org.apache.commons.math.util.ResizableDoubleArray resizableDoubleArray0 = new org.apache.commons.math.util.ResizableDoubleArray();
        double[] doubleArray1 = resizableDoubleArray0.getElements();
        resizableDoubleArray0.setNumElements((int) '#');
        double[] doubleArray4 = resizableDoubleArray0.getElements();
        // The following exception was thrown during execution in test generation
        try {
            double double6 = resizableDoubleArray0.getElement((int) (short) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: The index specified: 100 is larger than the current number of elements");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(doubleArray1);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray1), "[]");
        org.junit.Assert.assertNotNull(doubleArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray4), "[0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0]");
    }

    @Test
    public void test0169() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0169");
        org.apache.commons.math.util.ResizableDoubleArray resizableDoubleArray0 = new org.apache.commons.math.util.ResizableDoubleArray();
        float float1 = resizableDoubleArray0.getExpansionFactor();
        resizableDoubleArray0.setNumElements((int) (byte) 100);
        resizableDoubleArray0.contract();
        resizableDoubleArray0.setElement(35, (double) 100L);
        org.junit.Assert.assertTrue("'" + float1 + "' != '" + 2.0f + "'", float1 == 2.0f);
    }

    @Test
    public void test0170() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0170");
        org.apache.commons.math.util.ResizableDoubleArray resizableDoubleArray0 = new org.apache.commons.math.util.ResizableDoubleArray();
        float float1 = resizableDoubleArray0.getExpansionFactor();
        resizableDoubleArray0.addElement((double) 0.0f);
        resizableDoubleArray0.contract();
        float float5 = resizableDoubleArray0.getExpansionFactor();
        int int6 = resizableDoubleArray0.getNumElements();
        java.lang.Class<?> wildcardClass7 = resizableDoubleArray0.getClass();
        org.junit.Assert.assertTrue("'" + float1 + "' != '" + 2.0f + "'", float1 == 2.0f);
        org.junit.Assert.assertTrue("'" + float5 + "' != '" + 2.0f + "'", float5 == 2.0f);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test0171() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0171");
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math.util.ResizableDoubleArray resizableDoubleArray4 = new org.apache.commons.math.util.ResizableDoubleArray(0, (float) (short) 0, (float) (short) -1, (int) '4');
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Contraction criteria can never be smaller than the expansion factor.  This would lead to a never ending loop of expansion and contraction as a newly expanded internal storage array would immediately satisfy the criteria for contraction");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void test0172() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0172");
        org.apache.commons.math.util.ResizableDoubleArray resizableDoubleArray0 = new org.apache.commons.math.util.ResizableDoubleArray();
        float float1 = resizableDoubleArray0.getExpansionFactor();
        double[] doubleArray2 = resizableDoubleArray0.getValues();
        // The following exception was thrown during execution in test generation
        try {
            resizableDoubleArray0.discardFrontElements((-1));
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Cannot discard a negative number of elements.");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + float1 + "' != '" + 2.0f + "'", float1 == 2.0f);
        org.junit.Assert.assertNotNull(doubleArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray2), "[0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0]");
    }

    @Test
    public void test0173() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0173");
        org.apache.commons.math.util.ResizableDoubleArray resizableDoubleArray2 = new org.apache.commons.math.util.ResizableDoubleArray((int) (byte) 1, (float) 36);
        int int3 = resizableDoubleArray2.getNumElements();
        // The following exception was thrown during execution in test generation
        try {
            resizableDoubleArray2.discardFrontElements((int) 'a');
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Cannot discard more elements than arecontained in this array.");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
    }

    @Test
    public void test0174() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0174");
        org.apache.commons.math.util.ResizableDoubleArray resizableDoubleArray1 = new org.apache.commons.math.util.ResizableDoubleArray((int) ' ');
        // The following exception was thrown during execution in test generation
        try {
            double double3 = resizableDoubleArray1.getElement((int) 'a');
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: The index specified: 97 is larger than the current number of elements");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
    }

    @Test
    public void test0175() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0175");
        org.apache.commons.math.util.ResizableDoubleArray resizableDoubleArray0 = new org.apache.commons.math.util.ResizableDoubleArray();
        double double2 = resizableDoubleArray0.addElementRolling((double) ' ');
        resizableDoubleArray0.setElement((int) '#', (double) (short) 0);
        resizableDoubleArray0.setNumElements((int) (byte) 100);
        resizableDoubleArray0.setElement(100, (double) (byte) 100);
        resizableDoubleArray0.contract();
        resizableDoubleArray0.clear();
        resizableDoubleArray0.addElement((double) (short) -1);
        // The following exception was thrown during execution in test generation
        try {
            resizableDoubleArray0.setExpansionFactor(100.0f);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Contraction criteria can never be smaller than the expansion factor.  This would lead to a never ending loop of expansion and contraction as a newly expanded internal storage array would immediately satisfy the criteria for contraction");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.0d + "'", double2 == 0.0d);
    }

    @Test
    public void test0176() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0176");
        org.apache.commons.math.util.ResizableDoubleArray resizableDoubleArray0 = new org.apache.commons.math.util.ResizableDoubleArray();
        double[] doubleArray1 = resizableDoubleArray0.getValues();
        resizableDoubleArray0.setNumElements((int) '#');
        double double5 = resizableDoubleArray0.getElement((int) (byte) 1);
        // The following exception was thrown during execution in test generation
        try {
            resizableDoubleArray0.discardFrontElements(36);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Cannot discard more elements than arecontained in this array.");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(doubleArray1);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray1), "[0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0]");
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
    }

    @Test
    public void test0177() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0177");
        org.apache.commons.math.util.ResizableDoubleArray resizableDoubleArray0 = new org.apache.commons.math.util.ResizableDoubleArray();
        double double2 = resizableDoubleArray0.addElementRolling((double) ' ');
        resizableDoubleArray0.setElement((int) '#', (double) (short) 0);
        resizableDoubleArray0.setNumElements((int) (byte) 100);
        resizableDoubleArray0.contract();
        int int9 = resizableDoubleArray0.getNumElements();
        double[] doubleArray10 = resizableDoubleArray0.getValues();
        // The following exception was thrown during execution in test generation
        try {
            resizableDoubleArray0.setContractionCriteria(0.0f);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Contraction criteria can never be smaller than the expansion factor.  This would lead to a never ending loop of expansion and contraction as a newly expanded internal storage array would immediately satisfy the criteria for contraction");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.0d + "'", double2 == 0.0d);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 100 + "'", int9 == 100);
        org.junit.Assert.assertNotNull(doubleArray10);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray10), "[0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0]");
    }

    @Test
    public void test0178() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0178");
        org.apache.commons.math.util.ResizableDoubleArray resizableDoubleArray0 = new org.apache.commons.math.util.ResizableDoubleArray();
        double double2 = resizableDoubleArray0.addElementRolling((double) ' ');
        resizableDoubleArray0.setElement((int) '#', (double) (short) 0);
        resizableDoubleArray0.setNumElements((int) (byte) 100);
        resizableDoubleArray0.contract();
        resizableDoubleArray0.setNumElements((int) (short) 1);
        double double12 = resizableDoubleArray0.getElement((int) (byte) 0);
        resizableDoubleArray0.clear();
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.0d + "'", double2 == 0.0d);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 0.0d + "'", double12 == 0.0d);
    }

    @Test
    public void test0179() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0179");
        org.apache.commons.math.util.ResizableDoubleArray resizableDoubleArray0 = new org.apache.commons.math.util.ResizableDoubleArray();
        double[] doubleArray1 = resizableDoubleArray0.getValues();
        float float2 = resizableDoubleArray0.getExpansionFactor();
        float float3 = resizableDoubleArray0.getExpansionFactor();
        double double5 = resizableDoubleArray0.addElementRolling(0.0d);
        int int6 = resizableDoubleArray0.getNumElements();
        int int7 = resizableDoubleArray0.start();
        resizableDoubleArray0.contract();
        // The following exception was thrown during execution in test generation
        try {
            resizableDoubleArray0.setExpansionFactor(1.0f);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The expansion factor must be a number greater than 1.0");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(doubleArray1);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray1), "[0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0]");
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 2.0f + "'", float2 == 2.0f);
        org.junit.Assert.assertTrue("'" + float3 + "' != '" + 2.0f + "'", float3 == 2.0f);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
    }

    @Test
    public void test0180() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0180");
        org.apache.commons.math.util.ResizableDoubleArray resizableDoubleArray0 = new org.apache.commons.math.util.ResizableDoubleArray();
        double double2 = resizableDoubleArray0.addElementRolling((double) ' ');
        resizableDoubleArray0.setElement((int) '#', (double) (short) 0);
        double[] doubleArray6 = resizableDoubleArray0.getValues();
        double[] doubleArray7 = resizableDoubleArray0.getValues();
        int int8 = resizableDoubleArray0.getNumElements();
        resizableDoubleArray0.setElement((int) ' ', 0.0d);
        // The following exception was thrown during execution in test generation
        try {
            resizableDoubleArray0.setExpansionMode((int) '#');
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Illegal expansionMode setting.");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.0d + "'", double2 == 0.0d);
        org.junit.Assert.assertNotNull(doubleArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray6), "[0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0]");
        org.junit.Assert.assertNotNull(doubleArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray7), "[0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0]");
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 36 + "'", int8 == 36);
    }

    @Test
    public void test0181() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0181");
        org.apache.commons.math.util.ResizableDoubleArray resizableDoubleArray1 = new org.apache.commons.math.util.ResizableDoubleArray((int) (byte) 100);
        int int2 = resizableDoubleArray1.getExpansionMode();
        double[] doubleArray3 = resizableDoubleArray1.getValues();
        float float4 = resizableDoubleArray1.getExpansionFactor();
        // The following exception was thrown during execution in test generation
        try {
            resizableDoubleArray1.setExpansionFactor((float) (byte) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Contraction criteria can never be smaller than the expansion factor.  This would lead to a never ending loop of expansion and contraction as a newly expanded internal storage array would immediately satisfy the criteria for contraction");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertNotNull(doubleArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray3), "[0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0]");
        org.junit.Assert.assertTrue("'" + float4 + "' != '" + 2.0f + "'", float4 == 2.0f);
    }

    @Test
    public void test0182() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0182");
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math.util.ResizableDoubleArray resizableDoubleArray2 = new org.apache.commons.math.util.ResizableDoubleArray((int) 'a', (float) 0L);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The expansion factor must be a number greater than 1.0");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void test0183() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0183");
        org.apache.commons.math.util.ResizableDoubleArray resizableDoubleArray0 = new org.apache.commons.math.util.ResizableDoubleArray();
        float float1 = resizableDoubleArray0.getExpansionFactor();
        int int2 = resizableDoubleArray0.getNumElements();
        resizableDoubleArray0.addElement((double) '#');
        resizableDoubleArray0.setElement((int) (short) 10, 100.0d);
        int int8 = resizableDoubleArray0.getNumElements();
        double double10 = resizableDoubleArray0.addElementRolling((double) 0L);
        // The following exception was thrown during execution in test generation
        try {
            resizableDoubleArray0.discardFrontElements((int) (short) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Cannot discard a negative number of elements.");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + float1 + "' != '" + 2.0f + "'", float1 == 2.0f);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 11 + "'", int8 == 11);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 35.0d + "'", double10 == 35.0d);
    }

    @Test
    public void test0184() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0184");
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math.util.ResizableDoubleArray resizableDoubleArray3 = new org.apache.commons.math.util.ResizableDoubleArray((int) '#', (float) 1L, (float) 'a');
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The expansion factor must be a number greater than 1.0");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void test0185() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0185");
        org.apache.commons.math.util.ResizableDoubleArray resizableDoubleArray0 = new org.apache.commons.math.util.ResizableDoubleArray();
        double double2 = resizableDoubleArray0.addElementRolling((double) ' ');
        resizableDoubleArray0.setElement((int) '#', (double) (short) 0);
        double[] doubleArray6 = resizableDoubleArray0.getValues();
        double[] doubleArray7 = resizableDoubleArray0.getValues();
        int int8 = resizableDoubleArray0.getNumElements();
        resizableDoubleArray0.setElement((int) ' ', 0.0d);
        // The following exception was thrown during execution in test generation
        try {
            resizableDoubleArray0.discardFrontElements((int) (byte) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Cannot discard a negative number of elements.");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.0d + "'", double2 == 0.0d);
        org.junit.Assert.assertNotNull(doubleArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray6), "[0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0]");
        org.junit.Assert.assertNotNull(doubleArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray7), "[0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0]");
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 36 + "'", int8 == 36);
    }

    @Test
    public void test0186() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0186");
        org.apache.commons.math.util.ResizableDoubleArray resizableDoubleArray3 = new org.apache.commons.math.util.ResizableDoubleArray(11, (float) (byte) 100, 100.5f);
        double double5 = resizableDoubleArray3.addElementRolling((double) 2.0f);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
    }

    @Test
    public void test0187() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0187");
        org.apache.commons.math.util.ResizableDoubleArray resizableDoubleArray0 = new org.apache.commons.math.util.ResizableDoubleArray();
        double double2 = resizableDoubleArray0.addElementRolling((double) ' ');
        resizableDoubleArray0.setElement((int) '#', (double) (short) 0);
        resizableDoubleArray0.setNumElements((int) (byte) 100);
        resizableDoubleArray0.contract();
        int int9 = resizableDoubleArray0.start();
        resizableDoubleArray0.clear();
        // The following exception was thrown during execution in test generation
        try {
            resizableDoubleArray0.setElement((-1), (double) (byte) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Cannot set an element at a negative index");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.0d + "'", double2 == 0.0d);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
    }

    @Test
    public void test0188() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0188");
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math.util.ResizableDoubleArray resizableDoubleArray4 = new org.apache.commons.math.util.ResizableDoubleArray((int) (short) 10, 10.0f, (float) (short) 100, 100);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Illegal expansionMode setting.");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void test0189() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0189");
        org.apache.commons.math.util.ResizableDoubleArray resizableDoubleArray0 = new org.apache.commons.math.util.ResizableDoubleArray();
        double double2 = resizableDoubleArray0.addElementRolling((double) ' ');
        float float3 = resizableDoubleArray0.getExpansionFactor();
        resizableDoubleArray0.setNumElements((int) '#');
        double[] doubleArray6 = resizableDoubleArray0.getValues();
        // The following exception was thrown during execution in test generation
        try {
            resizableDoubleArray0.setExpansionFactor((float) 'a');
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Contraction criteria can never be smaller than the expansion factor.  This would lead to a never ending loop of expansion and contraction as a newly expanded internal storage array would immediately satisfy the criteria for contraction");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.0d + "'", double2 == 0.0d);
        org.junit.Assert.assertTrue("'" + float3 + "' != '" + 2.0f + "'", float3 == 2.0f);
        org.junit.Assert.assertNotNull(doubleArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray6), "[0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0]");
    }

    @Test
    public void test0190() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0190");
        org.apache.commons.math.util.ResizableDoubleArray resizableDoubleArray0 = new org.apache.commons.math.util.ResizableDoubleArray();
        float float1 = resizableDoubleArray0.getExpansionFactor();
        int int2 = resizableDoubleArray0.getNumElements();
        resizableDoubleArray0.addElement((double) '#');
        resizableDoubleArray0.contract();
        int int6 = resizableDoubleArray0.getExpansionMode();
        org.junit.Assert.assertTrue("'" + float1 + "' != '" + 2.0f + "'", float1 == 2.0f);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
    }

    @Test
    public void test0191() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0191");
        org.apache.commons.math.util.ResizableDoubleArray resizableDoubleArray0 = new org.apache.commons.math.util.ResizableDoubleArray();
        double double2 = resizableDoubleArray0.addElementRolling((double) ' ');
        resizableDoubleArray0.setElement((int) '#', (double) (short) 0);
        resizableDoubleArray0.setNumElements((int) (byte) 100);
        resizableDoubleArray0.contract();
        int int9 = resizableDoubleArray0.start();
        resizableDoubleArray0.clear();
        // The following exception was thrown during execution in test generation
        try {
            resizableDoubleArray0.setNumElements((int) (short) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Number of elements must be zero or a positive integer");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.0d + "'", double2 == 0.0d);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
    }

    @Test
    public void test0192() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0192");
        org.apache.commons.math.util.ResizableDoubleArray resizableDoubleArray1 = new org.apache.commons.math.util.ResizableDoubleArray((int) (byte) 100);
        double[] doubleArray2 = resizableDoubleArray1.getValues();
        resizableDoubleArray1.setExpansionMode((int) (byte) 0);
        int int5 = resizableDoubleArray1.getExpansionMode();
        // The following exception was thrown during execution in test generation
        try {
            resizableDoubleArray1.discardFrontElements((int) (byte) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Cannot discard more elements than arecontained in this array.");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(doubleArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray2), "[0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0]");
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
    }

    @Test
    public void test0193() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0193");
        org.apache.commons.math.util.ResizableDoubleArray resizableDoubleArray0 = new org.apache.commons.math.util.ResizableDoubleArray();
        float float1 = resizableDoubleArray0.getExpansionFactor();
        resizableDoubleArray0.setNumElements((int) (byte) 100);
        float float4 = resizableDoubleArray0.getContractionCriteria();
        org.junit.Assert.assertTrue("'" + float1 + "' != '" + 2.0f + "'", float1 == 2.0f);
        org.junit.Assert.assertTrue("'" + float4 + "' != '" + 2.5f + "'", float4 == 2.5f);
    }

    @Test
    public void test0194() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0194");
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math.util.ResizableDoubleArray resizableDoubleArray2 = new org.apache.commons.math.util.ResizableDoubleArray((int) (short) 100, 1.0f);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The expansion factor must be a number greater than 1.0");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void test0195() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0195");
        org.apache.commons.math.util.ResizableDoubleArray resizableDoubleArray0 = new org.apache.commons.math.util.ResizableDoubleArray();
        double double2 = resizableDoubleArray0.addElementRolling((double) ' ');
        resizableDoubleArray0.setElement((int) '#', (double) (short) 0);
        resizableDoubleArray0.setNumElements((int) (byte) 100);
        resizableDoubleArray0.contract();
        int int9 = resizableDoubleArray0.getNumElements();
        double[] doubleArray10 = resizableDoubleArray0.getValues();
        // The following exception was thrown during execution in test generation
        try {
            resizableDoubleArray0.setExpansionFactor((float) 0L);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The expansion factor must be a number greater than 1.0");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.0d + "'", double2 == 0.0d);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 100 + "'", int9 == 100);
        org.junit.Assert.assertNotNull(doubleArray10);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray10), "[0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0]");
    }

    @Test
    public void test0196() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0196");
        org.apache.commons.math.util.ResizableDoubleArray resizableDoubleArray0 = new org.apache.commons.math.util.ResizableDoubleArray();
        float float1 = resizableDoubleArray0.getExpansionFactor();
        double[] doubleArray2 = resizableDoubleArray0.getValues();
        double[] doubleArray3 = resizableDoubleArray0.getValues();
        // The following exception was thrown during execution in test generation
        try {
            resizableDoubleArray0.setExpansionMode((int) '#');
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Illegal expansionMode setting.");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + float1 + "' != '" + 2.0f + "'", float1 == 2.0f);
        org.junit.Assert.assertNotNull(doubleArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray2), "[0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0]");
        org.junit.Assert.assertNotNull(doubleArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray3), "[0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0]");
    }

    @Test
    public void test0197() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0197");
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math.util.ResizableDoubleArray resizableDoubleArray4 = new org.apache.commons.math.util.ResizableDoubleArray((int) (short) 1, 2.5f, (float) (short) 0, (int) (short) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Contraction criteria can never be smaller than the expansion factor.  This would lead to a never ending loop of expansion and contraction as a newly expanded internal storage array would immediately satisfy the criteria for contraction");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void test0198() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0198");
        org.apache.commons.math.util.ResizableDoubleArray resizableDoubleArray0 = new org.apache.commons.math.util.ResizableDoubleArray();
        double[] doubleArray1 = resizableDoubleArray0.getElements();
        resizableDoubleArray0.addElement((double) (short) -1);
        float float4 = resizableDoubleArray0.getExpansionFactor();
        resizableDoubleArray0.setElement((int) (byte) 100, (double) (short) 100);
        resizableDoubleArray0.addElement(0.0d);
        double double11 = resizableDoubleArray0.getElement((int) '4');
        // The following exception was thrown during execution in test generation
        try {
            resizableDoubleArray0.setExpansionFactor((float) (short) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The expansion factor must be a number greater than 1.0");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(doubleArray1);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray1), "[]");
        org.junit.Assert.assertTrue("'" + float4 + "' != '" + 2.0f + "'", float4 == 2.0f);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 0.0d + "'", double11 == 0.0d);
    }

    @Test
    public void test0199() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0199");
        org.apache.commons.math.util.ResizableDoubleArray resizableDoubleArray0 = new org.apache.commons.math.util.ResizableDoubleArray();
        double double2 = resizableDoubleArray0.addElementRolling((double) ' ');
        resizableDoubleArray0.setElement((int) '#', (double) (short) 0);
        resizableDoubleArray0.setNumElements((int) (byte) 100);
        resizableDoubleArray0.setElement(100, (double) (byte) 100);
        resizableDoubleArray0.contract();
        double[] doubleArray12 = resizableDoubleArray0.getElements();
        java.lang.Class<?> wildcardClass13 = resizableDoubleArray0.getClass();
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.0d + "'", double2 == 0.0d);
        org.junit.Assert.assertNotNull(doubleArray12);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray12), "[0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 100.0]");
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test0200() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0200");
        org.apache.commons.math.util.ResizableDoubleArray resizableDoubleArray0 = new org.apache.commons.math.util.ResizableDoubleArray();
        float float1 = resizableDoubleArray0.getExpansionFactor();
        double[] doubleArray2 = resizableDoubleArray0.getValues();
        resizableDoubleArray0.clear();
        resizableDoubleArray0.setContractionCriteria((float) 'a');
        // The following exception was thrown during execution in test generation
        try {
            resizableDoubleArray0.discardFrontElements((int) 'a');
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Cannot discard more elements than arecontained in this array.");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + float1 + "' != '" + 2.0f + "'", float1 == 2.0f);
        org.junit.Assert.assertNotNull(doubleArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray2), "[0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0]");
    }

    @Test
    public void test0201() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0201");
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math.util.ResizableDoubleArray resizableDoubleArray3 = new org.apache.commons.math.util.ResizableDoubleArray((int) (byte) 100, (float) (byte) -1, 1.0f);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The expansion factor must be a number greater than 1.0");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void test0202() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0202");
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math.util.ResizableDoubleArray resizableDoubleArray4 = new org.apache.commons.math.util.ResizableDoubleArray(99, (float) (byte) -1, (float) 100, (int) ' ');
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The expansion factor must be a number greater than 1.0");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void test0203() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0203");
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math.util.ResizableDoubleArray resizableDoubleArray2 = new org.apache.commons.math.util.ResizableDoubleArray(0, (float) 102);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The initial capacity supplied: 0must be a positive integer");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void test0204() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0204");
        org.apache.commons.math.util.ResizableDoubleArray resizableDoubleArray0 = new org.apache.commons.math.util.ResizableDoubleArray();
        float float1 = resizableDoubleArray0.getExpansionFactor();
        int int2 = resizableDoubleArray0.start();
        // The following exception was thrown during execution in test generation
        try {
            resizableDoubleArray0.setExpansionFactor(100.0f);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Contraction criteria can never be smaller than the expansion factor.  This would lead to a never ending loop of expansion and contraction as a newly expanded internal storage array would immediately satisfy the criteria for contraction");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + float1 + "' != '" + 2.0f + "'", float1 == 2.0f);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
    }

    @Test
    public void test0205() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0205");
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math.util.ResizableDoubleArray resizableDoubleArray4 = new org.apache.commons.math.util.ResizableDoubleArray((int) (short) 100, (float) 'a', (float) 102, 36);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Illegal expansionMode setting.");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void test0206() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0206");
        org.apache.commons.math.util.ResizableDoubleArray resizableDoubleArray0 = new org.apache.commons.math.util.ResizableDoubleArray();
        double[] doubleArray1 = resizableDoubleArray0.getElements();
        resizableDoubleArray0.addElement((double) (short) -1);
        double[] doubleArray4 = resizableDoubleArray0.getElements();
        int int5 = resizableDoubleArray0.getExpansionMode();
        int int6 = resizableDoubleArray0.getNumElements();
        // The following exception was thrown during execution in test generation
        try {
            resizableDoubleArray0.setExpansionFactor((float) (short) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The expansion factor must be a number greater than 1.0");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(doubleArray1);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray1), "[]");
        org.junit.Assert.assertNotNull(doubleArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray4), "[-1.0]");
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
    }

    @Test
    public void test0207() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0207");
        org.apache.commons.math.util.ResizableDoubleArray resizableDoubleArray0 = new org.apache.commons.math.util.ResizableDoubleArray();
        double double2 = resizableDoubleArray0.addElementRolling((double) ' ');
        float float3 = resizableDoubleArray0.getExpansionFactor();
        resizableDoubleArray0.setNumElements((int) '#');
        double[] doubleArray6 = resizableDoubleArray0.getValues();
        int int7 = resizableDoubleArray0.start();
        // The following exception was thrown during execution in test generation
        try {
            resizableDoubleArray0.setExpansionMode((int) ' ');
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Illegal expansionMode setting.");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.0d + "'", double2 == 0.0d);
        org.junit.Assert.assertTrue("'" + float3 + "' != '" + 2.0f + "'", float3 == 2.0f);
        org.junit.Assert.assertNotNull(doubleArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray6), "[0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0]");
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
    }

    @Test
    public void test0208() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0208");
        org.apache.commons.math.util.ResizableDoubleArray resizableDoubleArray0 = new org.apache.commons.math.util.ResizableDoubleArray();
        double double2 = resizableDoubleArray0.addElementRolling((double) ' ');
        resizableDoubleArray0.setElement((int) '#', (double) (short) 0);
        resizableDoubleArray0.setNumElements((int) (byte) 100);
        resizableDoubleArray0.contract();
        int int9 = resizableDoubleArray0.start();
        float float10 = resizableDoubleArray0.getContractionCriteria();
        // The following exception was thrown during execution in test generation
        try {
            resizableDoubleArray0.setExpansionFactor((float) 10L);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Contraction criteria can never be smaller than the expansion factor.  This would lead to a never ending loop of expansion and contraction as a newly expanded internal storage array would immediately satisfy the criteria for contraction");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.0d + "'", double2 == 0.0d);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + float10 + "' != '" + 2.5f + "'", float10 == 2.5f);
    }

    @Test
    public void test0209() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0209");
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math.util.ResizableDoubleArray resizableDoubleArray4 = new org.apache.commons.math.util.ResizableDoubleArray((int) (short) 100, (float) ' ', (float) (short) 1, 10);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Contraction criteria can never be smaller than the expansion factor.  This would lead to a never ending loop of expansion and contraction as a newly expanded internal storage array would immediately satisfy the criteria for contraction");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void test0210() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0210");
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math.util.ResizableDoubleArray resizableDoubleArray3 = new org.apache.commons.math.util.ResizableDoubleArray((int) (short) 1, (float) 0, (float) (byte) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The expansion factor must be a number greater than 1.0");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void test0211() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0211");
        org.apache.commons.math.util.ResizableDoubleArray resizableDoubleArray1 = new org.apache.commons.math.util.ResizableDoubleArray((int) (short) 10);
        // The following exception was thrown during execution in test generation
        try {
            double double3 = resizableDoubleArray1.getElement((int) 'a');
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: The index specified: 97 is larger than the current number of elements");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
    }

    @Test
    public void test0212() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0212");
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math.util.ResizableDoubleArray resizableDoubleArray3 = new org.apache.commons.math.util.ResizableDoubleArray((int) (byte) 100, (float) 102, (float) (-1));
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Contraction criteria can never be smaller than the expansion factor.  This would lead to a never ending loop of expansion and contraction as a newly expanded internal storage array would immediately satisfy the criteria for contraction");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void test0213() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0213");
        org.apache.commons.math.util.ResizableDoubleArray resizableDoubleArray4 = new org.apache.commons.math.util.ResizableDoubleArray(1, (float) 36, (float) (byte) 100, 0);
        resizableDoubleArray4.contract();
        // The following exception was thrown during execution in test generation
        try {
            resizableDoubleArray4.setElement((-1), (double) (short) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Cannot set an element at a negative index");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
    }

    @Test
    public void test0214() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0214");
        org.apache.commons.math.util.ResizableDoubleArray resizableDoubleArray3 = new org.apache.commons.math.util.ResizableDoubleArray((int) '#', (float) (short) 100, 100.5f);
        // The following exception was thrown during execution in test generation
        try {
            double double5 = resizableDoubleArray3.getElement(36);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: The index specified: 36 is larger than the current number of elements");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
    }

    @Test
    public void test0215() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0215");
        org.apache.commons.math.util.ResizableDoubleArray resizableDoubleArray0 = new org.apache.commons.math.util.ResizableDoubleArray();
        double double2 = resizableDoubleArray0.addElementRolling((double) ' ');
        resizableDoubleArray0.setElement((int) '#', (double) (short) 0);
        double[] doubleArray6 = resizableDoubleArray0.getValues();
        resizableDoubleArray0.setContractionCriteria((float) ' ');
        // The following exception was thrown during execution in test generation
        try {
            resizableDoubleArray0.setExpansionMode((int) (short) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Illegal expansionMode setting.");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.0d + "'", double2 == 0.0d);
        org.junit.Assert.assertNotNull(doubleArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray6), "[0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0]");
    }

    @Test
    public void test0216() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0216");
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math.util.ResizableDoubleArray resizableDoubleArray4 = new org.apache.commons.math.util.ResizableDoubleArray(102, (float) 99, 10.0f, (int) 'a');
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Contraction criteria can never be smaller than the expansion factor.  This would lead to a never ending loop of expansion and contraction as a newly expanded internal storage array would immediately satisfy the criteria for contraction");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void test0217() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0217");
        org.apache.commons.math.util.ResizableDoubleArray resizableDoubleArray0 = new org.apache.commons.math.util.ResizableDoubleArray();
        float float1 = resizableDoubleArray0.getExpansionFactor();
        int int2 = resizableDoubleArray0.start();
        // The following exception was thrown during execution in test generation
        try {
            resizableDoubleArray0.setExpansionMode(35);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Illegal expansionMode setting.");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + float1 + "' != '" + 2.0f + "'", float1 == 2.0f);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
    }

    @Test
    public void test0218() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0218");
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math.util.ResizableDoubleArray resizableDoubleArray3 = new org.apache.commons.math.util.ResizableDoubleArray((int) (byte) 100, (float) 0, (float) 0L);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The expansion factor must be a number greater than 1.0");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void test0219() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0219");
        org.apache.commons.math.util.ResizableDoubleArray resizableDoubleArray0 = new org.apache.commons.math.util.ResizableDoubleArray();
        float float1 = resizableDoubleArray0.getExpansionFactor();
        resizableDoubleArray0.setNumElements((int) (byte) 100);
        int int4 = resizableDoubleArray0.getNumElements();
        org.junit.Assert.assertTrue("'" + float1 + "' != '" + 2.0f + "'", float1 == 2.0f);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 100 + "'", int4 == 100);
    }

    @Test
    public void test0220() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0220");
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math.util.ResizableDoubleArray resizableDoubleArray4 = new org.apache.commons.math.util.ResizableDoubleArray(1, (float) 99, (float) 100L, (int) (byte) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Illegal expansionMode setting.");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void test0221() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0221");
        org.apache.commons.math.util.ResizableDoubleArray resizableDoubleArray0 = new org.apache.commons.math.util.ResizableDoubleArray();
        float float1 = resizableDoubleArray0.getExpansionFactor();
        double[] doubleArray2 = resizableDoubleArray0.getValues();
        resizableDoubleArray0.clear();
        resizableDoubleArray0.addElement((double) (-1));
        resizableDoubleArray0.addElement((double) '#');
        // The following exception was thrown during execution in test generation
        try {
            resizableDoubleArray0.setExpansionMode(11);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Illegal expansionMode setting.");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + float1 + "' != '" + 2.0f + "'", float1 == 2.0f);
        org.junit.Assert.assertNotNull(doubleArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray2), "[0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0]");
    }

    @Test
    public void test0222() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0222");
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math.util.ResizableDoubleArray resizableDoubleArray4 = new org.apache.commons.math.util.ResizableDoubleArray(35, (float) (-1), 0.0f, (int) (short) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The expansion factor must be a number greater than 1.0");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void test0223() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0223");
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math.util.ResizableDoubleArray resizableDoubleArray2 = new org.apache.commons.math.util.ResizableDoubleArray((int) '#', 0.0f);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The expansion factor must be a number greater than 1.0");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void test0224() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0224");
        org.apache.commons.math.util.ResizableDoubleArray resizableDoubleArray0 = new org.apache.commons.math.util.ResizableDoubleArray();
        double double2 = resizableDoubleArray0.addElementRolling((double) ' ');
        float float3 = resizableDoubleArray0.getExpansionFactor();
        float float4 = resizableDoubleArray0.getExpansionFactor();
        resizableDoubleArray0.addElement((double) (short) -1);
        int int7 = resizableDoubleArray0.start();
        int int8 = resizableDoubleArray0.start();
        java.lang.Class<?> wildcardClass9 = resizableDoubleArray0.getClass();
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.0d + "'", double2 == 0.0d);
        org.junit.Assert.assertTrue("'" + float3 + "' != '" + 2.0f + "'", float3 == 2.0f);
        org.junit.Assert.assertTrue("'" + float4 + "' != '" + 2.0f + "'", float4 == 2.0f);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test0225() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0225");
        org.apache.commons.math.util.ResizableDoubleArray resizableDoubleArray1 = new org.apache.commons.math.util.ResizableDoubleArray((int) (byte) 100);
        double[] doubleArray2 = resizableDoubleArray1.getValues();
        double[] doubleArray3 = resizableDoubleArray1.getValues();
        java.lang.Class<?> wildcardClass4 = resizableDoubleArray1.getClass();
        org.junit.Assert.assertNotNull(doubleArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray2), "[0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0]");
        org.junit.Assert.assertNotNull(doubleArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray3), "[0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0]");
        org.junit.Assert.assertNotNull(wildcardClass4);
    }

    @Test
    public void test0226() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0226");
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math.util.ResizableDoubleArray resizableDoubleArray2 = new org.apache.commons.math.util.ResizableDoubleArray((int) (byte) 10, (float) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The expansion factor must be a number greater than 1.0");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void test0227() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0227");
        org.apache.commons.math.util.ResizableDoubleArray resizableDoubleArray1 = new org.apache.commons.math.util.ResizableDoubleArray((int) (byte) 100);
        double[] doubleArray2 = resizableDoubleArray1.getValues();
        resizableDoubleArray1.setExpansionMode((int) (byte) 0);
        int int5 = resizableDoubleArray1.getExpansionMode();
        int int6 = resizableDoubleArray1.start();
        // The following exception was thrown during execution in test generation
        try {
            double double8 = resizableDoubleArray1.getElement((int) '4');
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: The index specified: 52 is larger than the current number of elements");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(doubleArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray2), "[0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0]");
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
    }

    @Test
    public void test0228() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0228");
        org.apache.commons.math.util.ResizableDoubleArray resizableDoubleArray0 = new org.apache.commons.math.util.ResizableDoubleArray();
        double double2 = resizableDoubleArray0.addElementRolling((double) ' ');
        float float3 = resizableDoubleArray0.getExpansionFactor();
        float float4 = resizableDoubleArray0.getExpansionFactor();
        resizableDoubleArray0.addElement((double) (short) -1);
        resizableDoubleArray0.setNumElements((int) (short) 1);
        // The following exception was thrown during execution in test generation
        try {
            resizableDoubleArray0.discardFrontElements((-1));
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Cannot discard a negative number of elements.");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.0d + "'", double2 == 0.0d);
        org.junit.Assert.assertTrue("'" + float3 + "' != '" + 2.0f + "'", float3 == 2.0f);
        org.junit.Assert.assertTrue("'" + float4 + "' != '" + 2.0f + "'", float4 == 2.0f);
    }

    @Test
    public void test0229() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0229");
        org.apache.commons.math.util.ResizableDoubleArray resizableDoubleArray0 = new org.apache.commons.math.util.ResizableDoubleArray();
        double double2 = resizableDoubleArray0.addElementRolling((double) ' ');
        resizableDoubleArray0.setElement((int) '#', (double) (short) 0);
        double[] doubleArray6 = resizableDoubleArray0.getValues();
        double[] doubleArray7 = resizableDoubleArray0.getValues();
        int int8 = resizableDoubleArray0.getNumElements();
        java.lang.Class<?> wildcardClass9 = resizableDoubleArray0.getClass();
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.0d + "'", double2 == 0.0d);
        org.junit.Assert.assertNotNull(doubleArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray6), "[0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0]");
        org.junit.Assert.assertNotNull(doubleArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray7), "[0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0]");
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 36 + "'", int8 == 36);
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test0230() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0230");
        org.apache.commons.math.util.ResizableDoubleArray resizableDoubleArray2 = new org.apache.commons.math.util.ResizableDoubleArray((int) 'a', (float) 100L);
        double[] doubleArray3 = resizableDoubleArray2.getValues();
        java.lang.Class<?> wildcardClass4 = resizableDoubleArray2.getClass();
        org.junit.Assert.assertNotNull(doubleArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray3), "[0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0]");
        org.junit.Assert.assertNotNull(wildcardClass4);
    }

    @Test
    public void test0231() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0231");
        org.apache.commons.math.util.ResizableDoubleArray resizableDoubleArray0 = new org.apache.commons.math.util.ResizableDoubleArray();
        float float1 = resizableDoubleArray0.getExpansionFactor();
        int int2 = resizableDoubleArray0.getNumElements();
        resizableDoubleArray0.addElement((double) '#');
        resizableDoubleArray0.setElement((int) (short) 10, 100.0d);
        int int8 = resizableDoubleArray0.start();
        // The following exception was thrown during execution in test generation
        try {
            resizableDoubleArray0.discardFrontElements(100);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Cannot discard more elements than arecontained in this array.");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + float1 + "' != '" + 2.0f + "'", float1 == 2.0f);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
    }

    @Test
    public void test0232() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0232");
        org.apache.commons.math.util.ResizableDoubleArray resizableDoubleArray0 = new org.apache.commons.math.util.ResizableDoubleArray();
        double double2 = resizableDoubleArray0.addElementRolling((double) ' ');
        resizableDoubleArray0.setElement((int) '#', (double) (short) 0);
        resizableDoubleArray0.setNumElements((int) (byte) 100);
        float float8 = resizableDoubleArray0.getExpansionFactor();
        double[] doubleArray9 = resizableDoubleArray0.getValues();
        double[] doubleArray10 = resizableDoubleArray0.getElements();
        java.lang.Class<?> wildcardClass11 = resizableDoubleArray0.getClass();
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.0d + "'", double2 == 0.0d);
        org.junit.Assert.assertTrue("'" + float8 + "' != '" + 2.0f + "'", float8 == 2.0f);
        org.junit.Assert.assertNotNull(doubleArray9);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray9), "[0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0]");
        org.junit.Assert.assertNotNull(doubleArray10);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray10), "[0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0]");
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test0233() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0233");
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math.util.ResizableDoubleArray resizableDoubleArray4 = new org.apache.commons.math.util.ResizableDoubleArray(11, 100.0f, (float) 4, 10);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Contraction criteria can never be smaller than the expansion factor.  This would lead to a never ending loop of expansion and contraction as a newly expanded internal storage array would immediately satisfy the criteria for contraction");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void test0234() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0234");
        org.apache.commons.math.util.ResizableDoubleArray resizableDoubleArray0 = new org.apache.commons.math.util.ResizableDoubleArray();
        double double2 = resizableDoubleArray0.addElementRolling((double) ' ');
        resizableDoubleArray0.setElement((int) '#', (double) (short) 0);
        resizableDoubleArray0.setNumElements((int) (byte) 100);
        resizableDoubleArray0.contract();
        int int9 = resizableDoubleArray0.getNumElements();
        double[] doubleArray10 = resizableDoubleArray0.getValues();
        int int11 = resizableDoubleArray0.getNumElements();
        // The following exception was thrown during execution in test generation
        try {
            resizableDoubleArray0.setExpansionFactor((float) (short) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Contraction criteria can never be smaller than the expansion factor.  This would lead to a never ending loop of expansion and contraction as a newly expanded internal storage array would immediately satisfy the criteria for contraction");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.0d + "'", double2 == 0.0d);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 100 + "'", int9 == 100);
        org.junit.Assert.assertNotNull(doubleArray10);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray10), "[0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0]");
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 100 + "'", int11 == 100);
    }

    @Test
    public void test0235() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0235");
        org.apache.commons.math.util.ResizableDoubleArray resizableDoubleArray1 = new org.apache.commons.math.util.ResizableDoubleArray(100);
        // The following exception was thrown during execution in test generation
        try {
            double double3 = resizableDoubleArray1.getElement(68);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: The index specified: 68 is larger than the current number of elements");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
    }

    @Test
    public void test0236() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0236");
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math.util.ResizableDoubleArray resizableDoubleArray4 = new org.apache.commons.math.util.ResizableDoubleArray((int) (short) 1, (-1.0f), 1.0f, (int) ' ');
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The expansion factor must be a number greater than 1.0");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void test0237() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0237");
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math.util.ResizableDoubleArray resizableDoubleArray4 = new org.apache.commons.math.util.ResizableDoubleArray((int) (byte) 1, 2.5f, (float) (byte) 0, (int) (byte) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Contraction criteria can never be smaller than the expansion factor.  This would lead to a never ending loop of expansion and contraction as a newly expanded internal storage array would immediately satisfy the criteria for contraction");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void test0238() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0238");
        org.apache.commons.math.util.ResizableDoubleArray resizableDoubleArray0 = new org.apache.commons.math.util.ResizableDoubleArray();
        float float1 = resizableDoubleArray0.getExpansionFactor();
        double[] doubleArray2 = resizableDoubleArray0.getValues();
        double[] doubleArray3 = resizableDoubleArray0.getValues();
        double double5 = resizableDoubleArray0.addElementRolling((double) '4');
        // The following exception was thrown during execution in test generation
        try {
            resizableDoubleArray0.setContractionCriteria((float) (byte) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Contraction criteria can never be smaller than the expansion factor.  This would lead to a never ending loop of expansion and contraction as a newly expanded internal storage array would immediately satisfy the criteria for contraction");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + float1 + "' != '" + 2.0f + "'", float1 == 2.0f);
        org.junit.Assert.assertNotNull(doubleArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray2), "[52.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0]");
        org.junit.Assert.assertNotNull(doubleArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray3), "[52.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0]");
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
    }

    @Test
    public void test0239() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0239");
        org.apache.commons.math.util.ResizableDoubleArray resizableDoubleArray0 = new org.apache.commons.math.util.ResizableDoubleArray();
        double double2 = resizableDoubleArray0.addElementRolling((double) ' ');
        resizableDoubleArray0.setElement((int) '#', (double) (short) 0);
        resizableDoubleArray0.setNumElements((int) (byte) 100);
        float float8 = resizableDoubleArray0.getExpansionFactor();
        java.lang.Class<?> wildcardClass9 = resizableDoubleArray0.getClass();
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.0d + "'", double2 == 0.0d);
        org.junit.Assert.assertTrue("'" + float8 + "' != '" + 2.0f + "'", float8 == 2.0f);
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test0240() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0240");
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math.util.ResizableDoubleArray resizableDoubleArray3 = new org.apache.commons.math.util.ResizableDoubleArray((int) (byte) 100, (float) (byte) -1, (float) 100L);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The expansion factor must be a number greater than 1.0");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void test0241() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0241");
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math.util.ResizableDoubleArray resizableDoubleArray4 = new org.apache.commons.math.util.ResizableDoubleArray(36, (float) 4, 10.0f, 102);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Illegal expansionMode setting.");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void test0242() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0242");
        org.apache.commons.math.util.ResizableDoubleArray resizableDoubleArray0 = new org.apache.commons.math.util.ResizableDoubleArray();
        double[] doubleArray1 = resizableDoubleArray0.getElements();
        resizableDoubleArray0.addElement((double) (short) -1);
        double[] doubleArray4 = resizableDoubleArray0.getElements();
        java.lang.Class<?> wildcardClass5 = resizableDoubleArray0.getClass();
        org.junit.Assert.assertNotNull(doubleArray1);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray1), "[]");
        org.junit.Assert.assertNotNull(doubleArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray4), "[-1.0]");
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test0243() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0243");
        org.apache.commons.math.util.ResizableDoubleArray resizableDoubleArray0 = new org.apache.commons.math.util.ResizableDoubleArray();
        double[] doubleArray1 = resizableDoubleArray0.getElements();
        resizableDoubleArray0.addElement((double) (short) -1);
        float float4 = resizableDoubleArray0.getExpansionFactor();
        resizableDoubleArray0.setElement((int) (byte) 100, (double) (short) 100);
        resizableDoubleArray0.clear();
        java.lang.Class<?> wildcardClass9 = resizableDoubleArray0.getClass();
        org.junit.Assert.assertNotNull(doubleArray1);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray1), "[]");
        org.junit.Assert.assertTrue("'" + float4 + "' != '" + 2.0f + "'", float4 == 2.0f);
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test0244() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0244");
        org.apache.commons.math.util.ResizableDoubleArray resizableDoubleArray0 = new org.apache.commons.math.util.ResizableDoubleArray();
        float float1 = resizableDoubleArray0.getExpansionFactor();
        double[] doubleArray2 = resizableDoubleArray0.getValues();
        int int3 = resizableDoubleArray0.getNumElements();
        // The following exception was thrown during execution in test generation
        try {
            resizableDoubleArray0.setContractionCriteria((float) (short) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Contraction criteria can never be smaller than the expansion factor.  This would lead to a never ending loop of expansion and contraction as a newly expanded internal storage array would immediately satisfy the criteria for contraction");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + float1 + "' != '" + 2.0f + "'", float1 == 2.0f);
        org.junit.Assert.assertNotNull(doubleArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray2), "[0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0]");
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
    }

    @Test
    public void test0245() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0245");
        org.apache.commons.math.util.ResizableDoubleArray resizableDoubleArray0 = new org.apache.commons.math.util.ResizableDoubleArray();
        double double2 = resizableDoubleArray0.addElementRolling((double) ' ');
        resizableDoubleArray0.setElement((int) '#', (double) (short) 0);
        resizableDoubleArray0.setNumElements((int) (byte) 100);
        resizableDoubleArray0.contract();
        resizableDoubleArray0.setElement(0, (double) (byte) -1);
        int int12 = resizableDoubleArray0.start();
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.0d + "'", double2 == 0.0d);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
    }

    @Test
    public void test0246() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0246");
        org.apache.commons.math.util.ResizableDoubleArray resizableDoubleArray0 = new org.apache.commons.math.util.ResizableDoubleArray();
        double[] doubleArray1 = resizableDoubleArray0.getValues();
        float float2 = resizableDoubleArray0.getExpansionFactor();
        double[] doubleArray3 = resizableDoubleArray0.getElements();
        float float4 = resizableDoubleArray0.getContractionCriteria();
        org.junit.Assert.assertNotNull(doubleArray1);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray1), "[0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0]");
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 2.0f + "'", float2 == 2.0f);
        org.junit.Assert.assertNotNull(doubleArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray3), "[]");
        org.junit.Assert.assertTrue("'" + float4 + "' != '" + 2.5f + "'", float4 == 2.5f);
    }

    @Test
    public void test0247() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0247");
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math.util.ResizableDoubleArray resizableDoubleArray3 = new org.apache.commons.math.util.ResizableDoubleArray(10, (float) 35, (float) 4);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Contraction criteria can never be smaller than the expansion factor.  This would lead to a never ending loop of expansion and contraction as a newly expanded internal storage array would immediately satisfy the criteria for contraction");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void test0248() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0248");
        org.apache.commons.math.util.ResizableDoubleArray resizableDoubleArray0 = new org.apache.commons.math.util.ResizableDoubleArray();
        double double2 = resizableDoubleArray0.addElementRolling((double) ' ');
        resizableDoubleArray0.setElement((int) '#', (double) (short) 0);
        resizableDoubleArray0.setNumElements((int) (byte) 100);
        resizableDoubleArray0.contract();
        // The following exception was thrown during execution in test generation
        try {
            resizableDoubleArray0.setContractionCriteria((float) (byte) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Contraction criteria can never be smaller than the expansion factor.  This would lead to a never ending loop of expansion and contraction as a newly expanded internal storage array would immediately satisfy the criteria for contraction");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.0d + "'", double2 == 0.0d);
    }

    @Test
    public void test0249() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0249");
        org.apache.commons.math.util.ResizableDoubleArray resizableDoubleArray0 = new org.apache.commons.math.util.ResizableDoubleArray();
        float float1 = resizableDoubleArray0.getExpansionFactor();
        int int2 = resizableDoubleArray0.getNumElements();
        resizableDoubleArray0.addElement((double) '#');
        resizableDoubleArray0.setNumElements(10);
        int int7 = resizableDoubleArray0.getExpansionMode();
        // The following exception was thrown during execution in test generation
        try {
            double double9 = resizableDoubleArray0.getElement((int) (short) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: The index specified: 100 is larger than the current number of elements");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + float1 + "' != '" + 2.0f + "'", float1 == 2.0f);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
    }

    @Test
    public void test0250() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0250");
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math.util.ResizableDoubleArray resizableDoubleArray4 = new org.apache.commons.math.util.ResizableDoubleArray((int) (byte) -1, (float) (short) -1, (float) 10L, (int) (short) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The expansion factor must be a number greater than 1.0");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void test0251() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0251");
        org.apache.commons.math.util.ResizableDoubleArray resizableDoubleArray0 = new org.apache.commons.math.util.ResizableDoubleArray();
        double double2 = resizableDoubleArray0.addElementRolling((double) ' ');
        resizableDoubleArray0.setElement((int) '#', (double) (short) 0);
        resizableDoubleArray0.setNumElements((int) (byte) 100);
        int int8 = resizableDoubleArray0.start();
        resizableDoubleArray0.addElement((double) '#');
        resizableDoubleArray0.discardFrontElements(1);
        resizableDoubleArray0.setContractionCriteria(2.0f);
        float float15 = resizableDoubleArray0.getExpansionFactor();
        // The following exception was thrown during execution in test generation
        try {
            double double17 = resizableDoubleArray0.getElement(100);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: The index specified: 100 is larger than the current number of elements");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.0d + "'", double2 == 0.0d);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + float15 + "' != '" + 2.0f + "'", float15 == 2.0f);
    }

    @Test
    public void test0252() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0252");
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math.util.ResizableDoubleArray resizableDoubleArray2 = new org.apache.commons.math.util.ResizableDoubleArray((int) (byte) -1, (float) 10L);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The initial capacity supplied: -1must be a positive integer");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void test0253() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0253");
        org.apache.commons.math.util.ResizableDoubleArray resizableDoubleArray0 = new org.apache.commons.math.util.ResizableDoubleArray();
        float float1 = resizableDoubleArray0.getExpansionFactor();
        double[] doubleArray2 = resizableDoubleArray0.getValues();
        resizableDoubleArray0.clear();
        resizableDoubleArray0.addElement((double) (-1));
        resizableDoubleArray0.setContractionCriteria((float) (byte) 10);
        double double9 = resizableDoubleArray0.addElementRolling((double) 100.5f);
        resizableDoubleArray0.setNumElements((int) (short) 1);
        java.lang.Class<?> wildcardClass12 = resizableDoubleArray0.getClass();
        org.junit.Assert.assertTrue("'" + float1 + "' != '" + 2.0f + "'", float1 == 2.0f);
        org.junit.Assert.assertNotNull(doubleArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray2), "[0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0]");
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + (-1.0d) + "'", double9 == (-1.0d));
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test0254() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0254");
        org.apache.commons.math.util.ResizableDoubleArray resizableDoubleArray0 = new org.apache.commons.math.util.ResizableDoubleArray();
        double double2 = resizableDoubleArray0.addElementRolling((double) ' ');
        resizableDoubleArray0.setElement((int) '#', (double) (short) 0);
        resizableDoubleArray0.setNumElements((int) (byte) 100);
        int int8 = resizableDoubleArray0.start();
        resizableDoubleArray0.addElement((double) '#');
        resizableDoubleArray0.discardFrontElements(1);
        resizableDoubleArray0.setContractionCriteria(2.0f);
        float float15 = resizableDoubleArray0.getExpansionFactor();
        double double17 = resizableDoubleArray0.addElementRolling((double) (-1.0f));
        java.lang.Class<?> wildcardClass18 = resizableDoubleArray0.getClass();
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.0d + "'", double2 == 0.0d);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + float15 + "' != '" + 2.0f + "'", float15 == 2.0f);
        org.junit.Assert.assertTrue("'" + double17 + "' != '" + 0.0d + "'", double17 == 0.0d);
        org.junit.Assert.assertNotNull(wildcardClass18);
    }

    @Test
    public void test0255() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0255");
        org.apache.commons.math.util.ResizableDoubleArray resizableDoubleArray0 = new org.apache.commons.math.util.ResizableDoubleArray();
        double[] doubleArray1 = resizableDoubleArray0.getValues();
        float float2 = resizableDoubleArray0.getExpansionFactor();
        float float3 = resizableDoubleArray0.getExpansionFactor();
        double double5 = resizableDoubleArray0.addElementRolling(0.0d);
        int int6 = resizableDoubleArray0.getNumElements();
        resizableDoubleArray0.addElement(10.0d);
        int int9 = resizableDoubleArray0.start();
        resizableDoubleArray0.clear();
        // The following exception was thrown during execution in test generation
        try {
            resizableDoubleArray0.setExpansionFactor((float) 0L);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The expansion factor must be a number greater than 1.0");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(doubleArray1);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray1), "[0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0]");
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 2.0f + "'", float2 == 2.0f);
        org.junit.Assert.assertTrue("'" + float3 + "' != '" + 2.0f + "'", float3 == 2.0f);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
    }

    @Test
    public void test0256() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0256");
        org.apache.commons.math.util.ResizableDoubleArray resizableDoubleArray0 = new org.apache.commons.math.util.ResizableDoubleArray();
        double[] doubleArray1 = resizableDoubleArray0.getValues();
        float float2 = resizableDoubleArray0.getExpansionFactor();
        float float3 = resizableDoubleArray0.getExpansionFactor();
        double double5 = resizableDoubleArray0.addElementRolling(0.0d);
        resizableDoubleArray0.contract();
        double[] doubleArray7 = resizableDoubleArray0.getElements();
        // The following exception was thrown during execution in test generation
        try {
            double double9 = resizableDoubleArray0.getElement((int) (byte) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: The index specified: 100 is larger than the current number of elements");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(doubleArray1);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray1), "[0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0]");
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 2.0f + "'", float2 == 2.0f);
        org.junit.Assert.assertTrue("'" + float3 + "' != '" + 2.0f + "'", float3 == 2.0f);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
        org.junit.Assert.assertNotNull(doubleArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray7), "[]");
    }

    @Test
    public void test0257() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0257");
        org.apache.commons.math.util.ResizableDoubleArray resizableDoubleArray1 = new org.apache.commons.math.util.ResizableDoubleArray(1);
        // The following exception was thrown during execution in test generation
        try {
            resizableDoubleArray1.discardFrontElements(4);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Cannot discard more elements than arecontained in this array.");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void test0258() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0258");
        org.apache.commons.math.util.ResizableDoubleArray resizableDoubleArray0 = new org.apache.commons.math.util.ResizableDoubleArray();
        float float1 = resizableDoubleArray0.getExpansionFactor();
        resizableDoubleArray0.addElement((double) 0.0f);
        resizableDoubleArray0.addElement((double) 100.0f);
        double[] doubleArray6 = resizableDoubleArray0.getElements();
        // The following exception was thrown during execution in test generation
        try {
            double double8 = resizableDoubleArray0.getElement(68);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: The index specified: 68 is larger than the current number of elements");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + float1 + "' != '" + 2.0f + "'", float1 == 2.0f);
        org.junit.Assert.assertNotNull(doubleArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray6), "[0.0, 100.0]");
    }

    @Test
    public void test0259() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0259");
        org.apache.commons.math.util.ResizableDoubleArray resizableDoubleArray2 = new org.apache.commons.math.util.ResizableDoubleArray((int) (short) 100, (float) (byte) 10);
        double[] doubleArray3 = resizableDoubleArray2.getValues();
        float float4 = resizableDoubleArray2.getExpansionFactor();
        // The following exception was thrown during execution in test generation
        try {
            double double6 = resizableDoubleArray2.getElement((int) ' ');
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: The index specified: 32 is larger than the current number of elements");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(doubleArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray3), "[0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0]");
        org.junit.Assert.assertTrue("'" + float4 + "' != '" + 10.0f + "'", float4 == 10.0f);
    }

    @Test
    public void test0260() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0260");
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math.util.ResizableDoubleArray resizableDoubleArray3 = new org.apache.commons.math.util.ResizableDoubleArray(99, 10.0f, (float) 0L);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Contraction criteria can never be smaller than the expansion factor.  This would lead to a never ending loop of expansion and contraction as a newly expanded internal storage array would immediately satisfy the criteria for contraction");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void test0261() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0261");
        org.apache.commons.math.util.ResizableDoubleArray resizableDoubleArray0 = new org.apache.commons.math.util.ResizableDoubleArray();
        float float1 = resizableDoubleArray0.getExpansionFactor();
        double[] doubleArray2 = resizableDoubleArray0.getValues();
        double[] doubleArray3 = resizableDoubleArray0.getValues();
        resizableDoubleArray0.clear();
        double double6 = resizableDoubleArray0.addElementRolling((double) 99);
        org.junit.Assert.assertTrue("'" + float1 + "' != '" + 2.0f + "'", float1 == 2.0f);
        org.junit.Assert.assertNotNull(doubleArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray2), "[0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0]");
        org.junit.Assert.assertNotNull(doubleArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray3), "[0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0]");
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.0d + "'", double6 == 0.0d);
    }

    @Test
    public void test0262() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0262");
        org.apache.commons.math.util.ResizableDoubleArray resizableDoubleArray0 = new org.apache.commons.math.util.ResizableDoubleArray();
        float float1 = resizableDoubleArray0.getExpansionFactor();
        int int2 = resizableDoubleArray0.getNumElements();
        resizableDoubleArray0.addElement((double) '#');
        int int5 = resizableDoubleArray0.start();
        float float6 = resizableDoubleArray0.getExpansionFactor();
        resizableDoubleArray0.setNumElements(0);
        org.junit.Assert.assertTrue("'" + float1 + "' != '" + 2.0f + "'", float1 == 2.0f);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + float6 + "' != '" + 2.0f + "'", float6 == 2.0f);
    }

    @Test
    public void test0263() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0263");
        org.apache.commons.math.util.ResizableDoubleArray resizableDoubleArray2 = new org.apache.commons.math.util.ResizableDoubleArray((int) (short) 10, (float) 4);
    }

    @Test
    public void test0264() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0264");
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math.util.ResizableDoubleArray resizableDoubleArray1 = new org.apache.commons.math.util.ResizableDoubleArray((int) (byte) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The initial capacity supplied: 0must be a positive integer");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void test0265() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0265");
        org.apache.commons.math.util.ResizableDoubleArray resizableDoubleArray0 = new org.apache.commons.math.util.ResizableDoubleArray();
        float float1 = resizableDoubleArray0.getExpansionFactor();
        resizableDoubleArray0.addElement((double) 0.0f);
        resizableDoubleArray0.setNumElements((int) 'a');
        float float6 = resizableDoubleArray0.getContractionCriteria();
        // The following exception was thrown during execution in test generation
        try {
            double double8 = resizableDoubleArray0.getElement(100);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: The index specified: 100 is larger than the current number of elements");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + float1 + "' != '" + 2.0f + "'", float1 == 2.0f);
        org.junit.Assert.assertTrue("'" + float6 + "' != '" + 2.5f + "'", float6 == 2.5f);
    }

    @Test
    public void test0266() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0266");
        org.apache.commons.math.util.ResizableDoubleArray resizableDoubleArray0 = new org.apache.commons.math.util.ResizableDoubleArray();
        double double2 = resizableDoubleArray0.addElementRolling((double) ' ');
        float float3 = resizableDoubleArray0.getExpansionFactor();
        resizableDoubleArray0.setNumElements((int) '#');
        double[] doubleArray6 = resizableDoubleArray0.getValues();
        int int7 = resizableDoubleArray0.start();
        int int8 = resizableDoubleArray0.start();
        double double10 = resizableDoubleArray0.addElementRolling((double) 0L);
        resizableDoubleArray0.contract();
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.0d + "'", double2 == 0.0d);
        org.junit.Assert.assertTrue("'" + float3 + "' != '" + 2.0f + "'", float3 == 2.0f);
        org.junit.Assert.assertNotNull(doubleArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray6), "[0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0]");
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 0.0d + "'", double10 == 0.0d);
    }

    @Test
    public void test0267() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0267");
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math.util.ResizableDoubleArray resizableDoubleArray2 = new org.apache.commons.math.util.ResizableDoubleArray((-1), (float) 97);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The initial capacity supplied: -1must be a positive integer");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void test0268() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0268");
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math.util.ResizableDoubleArray resizableDoubleArray3 = new org.apache.commons.math.util.ResizableDoubleArray((int) (byte) -1, (float) 4, 100.0f);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The initial capacity supplied: -1must be a positive integer");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void test0269() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0269");
        org.apache.commons.math.util.ResizableDoubleArray resizableDoubleArray2 = new org.apache.commons.math.util.ResizableDoubleArray(36, (float) (short) 100);
    }

    @Test
    public void test0270() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0270");
        org.apache.commons.math.util.ResizableDoubleArray resizableDoubleArray0 = new org.apache.commons.math.util.ResizableDoubleArray();
        double double2 = resizableDoubleArray0.addElementRolling((double) ' ');
        resizableDoubleArray0.setElement((int) '#', (double) (short) 0);
        double[] doubleArray6 = resizableDoubleArray0.getValues();
        int int7 = resizableDoubleArray0.getExpansionMode();
        resizableDoubleArray0.setElement((int) (byte) 0, (double) 2.5f);
        int int11 = resizableDoubleArray0.start();
        java.lang.Class<?> wildcardClass12 = resizableDoubleArray0.getClass();
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.0d + "'", double2 == 0.0d);
        org.junit.Assert.assertNotNull(doubleArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray6), "[2.5, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0]");
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test0271() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0271");
        org.apache.commons.math.util.ResizableDoubleArray resizableDoubleArray0 = new org.apache.commons.math.util.ResizableDoubleArray();
        float float1 = resizableDoubleArray0.getExpansionFactor();
        resizableDoubleArray0.setElement((int) (short) 1, (double) 0.0f);
        resizableDoubleArray0.setExpansionFactor(2.5f);
        // The following exception was thrown during execution in test generation
        try {
            double double8 = resizableDoubleArray0.getElement((int) (byte) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: The index specified: 10 is larger than the current number of elements");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + float1 + "' != '" + 2.0f + "'", float1 == 2.0f);
    }

    @Test
    public void test0272() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0272");
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math.util.ResizableDoubleArray resizableDoubleArray3 = new org.apache.commons.math.util.ResizableDoubleArray((int) (byte) 1, (float) (byte) -1, (float) 10L);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The expansion factor must be a number greater than 1.0");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void test0273() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0273");
        org.apache.commons.math.util.ResizableDoubleArray resizableDoubleArray2 = new org.apache.commons.math.util.ResizableDoubleArray((int) (byte) 100, 100.0f);
        float float3 = resizableDoubleArray2.getExpansionFactor();
        java.lang.Class<?> wildcardClass4 = resizableDoubleArray2.getClass();
        org.junit.Assert.assertTrue("'" + float3 + "' != '" + 100.0f + "'", float3 == 100.0f);
        org.junit.Assert.assertNotNull(wildcardClass4);
    }

    @Test
    public void test0274() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0274");
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math.util.ResizableDoubleArray resizableDoubleArray3 = new org.apache.commons.math.util.ResizableDoubleArray((int) ' ', (float) (byte) 10, 2.5f);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Contraction criteria can never be smaller than the expansion factor.  This would lead to a never ending loop of expansion and contraction as a newly expanded internal storage array would immediately satisfy the criteria for contraction");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void test0275() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0275");
        org.apache.commons.math.util.ResizableDoubleArray resizableDoubleArray0 = new org.apache.commons.math.util.ResizableDoubleArray();
        float float1 = resizableDoubleArray0.getExpansionFactor();
        resizableDoubleArray0.addElement((double) 0.0f);
        float float4 = resizableDoubleArray0.getContractionCriteria();
        resizableDoubleArray0.setElement(10, (double) 36);
        java.lang.Class<?> wildcardClass8 = resizableDoubleArray0.getClass();
        org.junit.Assert.assertTrue("'" + float1 + "' != '" + 2.0f + "'", float1 == 2.0f);
        org.junit.Assert.assertTrue("'" + float4 + "' != '" + 2.5f + "'", float4 == 2.5f);
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test0276() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0276");
        org.apache.commons.math.util.ResizableDoubleArray resizableDoubleArray0 = new org.apache.commons.math.util.ResizableDoubleArray();
        double double2 = resizableDoubleArray0.addElementRolling((double) ' ');
        resizableDoubleArray0.setElement((int) '#', (double) (short) 0);
        resizableDoubleArray0.setNumElements((int) (byte) 100);
        resizableDoubleArray0.setElement(100, (double) (byte) 100);
        resizableDoubleArray0.contract();
        resizableDoubleArray0.clear();
        resizableDoubleArray0.addElement((double) (short) -1);
        double[] doubleArray15 = resizableDoubleArray0.getElements();
        double[] doubleArray16 = resizableDoubleArray0.getElements();
        int int17 = resizableDoubleArray0.getNumElements();
        // The following exception was thrown during execution in test generation
        try {
            resizableDoubleArray0.setContractionCriteria((float) 0L);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Contraction criteria can never be smaller than the expansion factor.  This would lead to a never ending loop of expansion and contraction as a newly expanded internal storage array would immediately satisfy the criteria for contraction");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.0d + "'", double2 == 0.0d);
        org.junit.Assert.assertNotNull(doubleArray15);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray15), "[-1.0]");
        org.junit.Assert.assertNotNull(doubleArray16);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray16), "[-1.0]");
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 1 + "'", int17 == 1);
    }

    @Test
    public void test0277() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0277");
        org.apache.commons.math.util.ResizableDoubleArray resizableDoubleArray0 = new org.apache.commons.math.util.ResizableDoubleArray();
        float float1 = resizableDoubleArray0.getExpansionFactor();
        double[] doubleArray2 = resizableDoubleArray0.getValues();
        resizableDoubleArray0.clear();
        resizableDoubleArray0.setContractionCriteria((float) 'a');
        // The following exception was thrown during execution in test generation
        try {
            resizableDoubleArray0.discardFrontElements(4);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Cannot discard more elements than arecontained in this array.");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + float1 + "' != '" + 2.0f + "'", float1 == 2.0f);
        org.junit.Assert.assertNotNull(doubleArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray2), "[0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0]");
    }

    @Test
    public void test0278() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0278");
        org.apache.commons.math.util.ResizableDoubleArray resizableDoubleArray0 = new org.apache.commons.math.util.ResizableDoubleArray();
        double double2 = resizableDoubleArray0.addElementRolling((double) ' ');
        resizableDoubleArray0.setElement((int) '#', (double) (short) 0);
        resizableDoubleArray0.setNumElements((int) (byte) 100);
        int int8 = resizableDoubleArray0.start();
        resizableDoubleArray0.addElement((double) '#');
        resizableDoubleArray0.discardFrontElements(1);
        resizableDoubleArray0.setContractionCriteria(2.0f);
        float float15 = resizableDoubleArray0.getExpansionFactor();
        resizableDoubleArray0.setNumElements((int) '#');
        // The following exception was thrown during execution in test generation
        try {
            resizableDoubleArray0.setContractionCriteria((float) (byte) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Contraction criteria can never be smaller than the expansion factor.  This would lead to a never ending loop of expansion and contraction as a newly expanded internal storage array would immediately satisfy the criteria for contraction");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.0d + "'", double2 == 0.0d);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + float15 + "' != '" + 2.0f + "'", float15 == 2.0f);
    }

    @Test
    public void test0279() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0279");
        org.apache.commons.math.util.ResizableDoubleArray resizableDoubleArray0 = new org.apache.commons.math.util.ResizableDoubleArray();
        double double2 = resizableDoubleArray0.addElementRolling((double) ' ');
        resizableDoubleArray0.setElement((int) '#', (double) (short) 0);
        resizableDoubleArray0.setNumElements((int) (byte) 100);
        resizableDoubleArray0.contract();
        int int9 = resizableDoubleArray0.getNumElements();
        resizableDoubleArray0.addElement((double) (byte) 1);
        // The following exception was thrown during execution in test generation
        try {
            resizableDoubleArray0.setExpansionMode(68);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Illegal expansionMode setting.");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.0d + "'", double2 == 0.0d);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 100 + "'", int9 == 100);
    }

    @Test
    public void test0280() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0280");
        org.apache.commons.math.util.ResizableDoubleArray resizableDoubleArray0 = new org.apache.commons.math.util.ResizableDoubleArray();
        double double2 = resizableDoubleArray0.addElementRolling((double) ' ');
        resizableDoubleArray0.setElement((int) '#', (double) (short) 0);
        double[] doubleArray6 = resizableDoubleArray0.getValues();
        int int7 = resizableDoubleArray0.getExpansionMode();
        resizableDoubleArray0.setElement((int) (byte) 0, (double) 2.5f);
        int int11 = resizableDoubleArray0.start();
        resizableDoubleArray0.setElement((int) '#', 1.0d);
        // The following exception was thrown during execution in test generation
        try {
            resizableDoubleArray0.setContractionCriteria((float) (byte) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Contraction criteria can never be smaller than the expansion factor.  This would lead to a never ending loop of expansion and contraction as a newly expanded internal storage array would immediately satisfy the criteria for contraction");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.0d + "'", double2 == 0.0d);
        org.junit.Assert.assertNotNull(doubleArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray6), "[2.5, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 1.0]");
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
    }

    @Test
    public void test0281() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0281");
        org.apache.commons.math.util.ResizableDoubleArray resizableDoubleArray0 = new org.apache.commons.math.util.ResizableDoubleArray();
        float float1 = resizableDoubleArray0.getExpansionFactor();
        resizableDoubleArray0.addElement((double) 0.0f);
        float float4 = resizableDoubleArray0.getContractionCriteria();
        // The following exception was thrown during execution in test generation
        try {
            resizableDoubleArray0.setExpansionFactor(0.0f);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The expansion factor must be a number greater than 1.0");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + float1 + "' != '" + 2.0f + "'", float1 == 2.0f);
        org.junit.Assert.assertTrue("'" + float4 + "' != '" + 2.5f + "'", float4 == 2.5f);
    }

    @Test
    public void test0282() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0282");
        org.apache.commons.math.util.ResizableDoubleArray resizableDoubleArray0 = new org.apache.commons.math.util.ResizableDoubleArray();
        float float1 = resizableDoubleArray0.getExpansionFactor();
        resizableDoubleArray0.setNumElements((int) (byte) 100);
        resizableDoubleArray0.contract();
        float float5 = resizableDoubleArray0.getContractionCriteria();
        // The following exception was thrown during execution in test generation
        try {
            resizableDoubleArray0.setExpansionMode((int) (byte) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Illegal expansionMode setting.");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + float1 + "' != '" + 2.0f + "'", float1 == 2.0f);
        org.junit.Assert.assertTrue("'" + float5 + "' != '" + 2.5f + "'", float5 == 2.5f);
    }

    @Test
    public void test0283() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0283");
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math.util.ResizableDoubleArray resizableDoubleArray2 = new org.apache.commons.math.util.ResizableDoubleArray(4, 0.0f);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The expansion factor must be a number greater than 1.0");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void test0284() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0284");
        org.apache.commons.math.util.ResizableDoubleArray resizableDoubleArray0 = new org.apache.commons.math.util.ResizableDoubleArray();
        double[] doubleArray1 = resizableDoubleArray0.getValues();
        float float2 = resizableDoubleArray0.getExpansionFactor();
        double[] doubleArray3 = resizableDoubleArray0.getElements();
        resizableDoubleArray0.clear();
        int int5 = resizableDoubleArray0.start();
        int int6 = resizableDoubleArray0.getNumElements();
        java.lang.Class<?> wildcardClass7 = resizableDoubleArray0.getClass();
        org.junit.Assert.assertNotNull(doubleArray1);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray1), "[0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0]");
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 2.0f + "'", float2 == 2.0f);
        org.junit.Assert.assertNotNull(doubleArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray3), "[]");
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test0285() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0285");
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math.util.ResizableDoubleArray resizableDoubleArray3 = new org.apache.commons.math.util.ResizableDoubleArray(97, (float) (-1), (float) 97);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The expansion factor must be a number greater than 1.0");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void test0286() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0286");
        org.apache.commons.math.util.ResizableDoubleArray resizableDoubleArray0 = new org.apache.commons.math.util.ResizableDoubleArray();
        double double2 = resizableDoubleArray0.addElementRolling((double) ' ');
        float float3 = resizableDoubleArray0.getExpansionFactor();
        resizableDoubleArray0.setNumElements((int) '#');
        double[] doubleArray6 = resizableDoubleArray0.getValues();
        int int7 = resizableDoubleArray0.start();
        double[] doubleArray8 = resizableDoubleArray0.getValues();
        java.lang.Class<?> wildcardClass9 = resizableDoubleArray0.getClass();
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.0d + "'", double2 == 0.0d);
        org.junit.Assert.assertTrue("'" + float3 + "' != '" + 2.0f + "'", float3 == 2.0f);
        org.junit.Assert.assertNotNull(doubleArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray6), "[0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0]");
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertNotNull(doubleArray8);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray8), "[0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0]");
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test0287() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0287");
        org.apache.commons.math.util.ResizableDoubleArray resizableDoubleArray0 = new org.apache.commons.math.util.ResizableDoubleArray();
        double[] doubleArray1 = resizableDoubleArray0.getValues();
        float float2 = resizableDoubleArray0.getExpansionFactor();
        float float3 = resizableDoubleArray0.getExpansionFactor();
        double double5 = resizableDoubleArray0.addElementRolling(0.0d);
        int int6 = resizableDoubleArray0.getNumElements();
        resizableDoubleArray0.addElement(10.0d);
        double[] doubleArray9 = resizableDoubleArray0.getElements();
        java.lang.Class<?> wildcardClass10 = resizableDoubleArray0.getClass();
        org.junit.Assert.assertNotNull(doubleArray1);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray1), "[0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0]");
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 2.0f + "'", float2 == 2.0f);
        org.junit.Assert.assertTrue("'" + float3 + "' != '" + 2.0f + "'", float3 == 2.0f);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertNotNull(doubleArray9);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray9), "[10.0]");
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test0288() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0288");
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math.util.ResizableDoubleArray resizableDoubleArray4 = new org.apache.commons.math.util.ResizableDoubleArray(1, (float) 97, (float) 97, 97);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Illegal expansionMode setting.");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void test0289() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0289");
        org.apache.commons.math.util.ResizableDoubleArray resizableDoubleArray2 = new org.apache.commons.math.util.ResizableDoubleArray((int) (short) 1, 10.0f);
        resizableDoubleArray2.setExpansionMode(1);
        resizableDoubleArray2.clear();
        resizableDoubleArray2.contract();
    }

    @Test
    public void test0290() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0290");
        org.apache.commons.math.util.ResizableDoubleArray resizableDoubleArray0 = new org.apache.commons.math.util.ResizableDoubleArray();
        float float1 = resizableDoubleArray0.getExpansionFactor();
        resizableDoubleArray0.addElement((double) 0.0f);
        resizableDoubleArray0.setNumElements((int) 'a');
        float float6 = resizableDoubleArray0.getContractionCriteria();
        // The following exception was thrown during execution in test generation
        try {
            resizableDoubleArray0.setExpansionFactor(100.5f);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Contraction criteria can never be smaller than the expansion factor.  This would lead to a never ending loop of expansion and contraction as a newly expanded internal storage array would immediately satisfy the criteria for contraction");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + float1 + "' != '" + 2.0f + "'", float1 == 2.0f);
        org.junit.Assert.assertTrue("'" + float6 + "' != '" + 2.5f + "'", float6 == 2.5f);
    }

    @Test
    public void test0291() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0291");
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math.util.ResizableDoubleArray resizableDoubleArray4 = new org.apache.commons.math.util.ResizableDoubleArray(100, (float) 35, 36.5f, 68);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Illegal expansionMode setting.");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void test0292() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0292");
        org.apache.commons.math.util.ResizableDoubleArray resizableDoubleArray2 = new org.apache.commons.math.util.ResizableDoubleArray((int) (byte) 100, 100.0f);
        resizableDoubleArray2.setElement(0, 1.0d);
        float float6 = resizableDoubleArray2.getContractionCriteria();
        java.lang.Class<?> wildcardClass7 = resizableDoubleArray2.getClass();
        org.junit.Assert.assertTrue("'" + float6 + "' != '" + 100.5f + "'", float6 == 100.5f);
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test0293() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0293");
        org.apache.commons.math.util.ResizableDoubleArray resizableDoubleArray0 = new org.apache.commons.math.util.ResizableDoubleArray();
        float float1 = resizableDoubleArray0.getExpansionFactor();
        int int2 = resizableDoubleArray0.getNumElements();
        resizableDoubleArray0.addElement((double) '#');
        resizableDoubleArray0.setNumElements(10);
        int int7 = resizableDoubleArray0.getExpansionMode();
        // The following exception was thrown during execution in test generation
        try {
            resizableDoubleArray0.setExpansionMode(10);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Illegal expansionMode setting.");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + float1 + "' != '" + 2.0f + "'", float1 == 2.0f);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
    }

    @Test
    public void test0294() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0294");
        org.apache.commons.math.util.ResizableDoubleArray resizableDoubleArray0 = new org.apache.commons.math.util.ResizableDoubleArray();
        double double2 = resizableDoubleArray0.addElementRolling((double) ' ');
        resizableDoubleArray0.setElement((int) '#', (double) (short) 0);
        resizableDoubleArray0.setNumElements((int) (byte) 100);
        resizableDoubleArray0.contract();
        int int9 = resizableDoubleArray0.start();
        float float10 = resizableDoubleArray0.getContractionCriteria();
        resizableDoubleArray0.setContractionCriteria(2.0f);
        float float13 = resizableDoubleArray0.getContractionCriteria();
        resizableDoubleArray0.clear();
        // The following exception was thrown during execution in test generation
        try {
            resizableDoubleArray0.setExpansionMode((int) '4');
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Illegal expansionMode setting.");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.0d + "'", double2 == 0.0d);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + float10 + "' != '" + 2.5f + "'", float10 == 2.5f);
        org.junit.Assert.assertTrue("'" + float13 + "' != '" + 2.0f + "'", float13 == 2.0f);
    }

    @Test
    public void test0295() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0295");
        org.apache.commons.math.util.ResizableDoubleArray resizableDoubleArray0 = new org.apache.commons.math.util.ResizableDoubleArray();
        double double2 = resizableDoubleArray0.addElementRolling((double) ' ');
        resizableDoubleArray0.setElement((int) '#', (double) (short) 0);
        resizableDoubleArray0.setNumElements((int) (byte) 100);
        resizableDoubleArray0.contract();
        int int9 = resizableDoubleArray0.start();
        resizableDoubleArray0.clear();
        double[] doubleArray11 = resizableDoubleArray0.getElements();
        int int12 = resizableDoubleArray0.getNumElements();
        // The following exception was thrown during execution in test generation
        try {
            resizableDoubleArray0.discardFrontElements((int) (byte) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Cannot discard more elements than arecontained in this array.");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.0d + "'", double2 == 0.0d);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertNotNull(doubleArray11);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray11), "[]");
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
    }

    @Test
    public void test0296() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0296");
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math.util.ResizableDoubleArray resizableDoubleArray3 = new org.apache.commons.math.util.ResizableDoubleArray(97, (float) 99, (float) 36);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Contraction criteria can never be smaller than the expansion factor.  This would lead to a never ending loop of expansion and contraction as a newly expanded internal storage array would immediately satisfy the criteria for contraction");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void test0297() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0297");
        org.apache.commons.math.util.ResizableDoubleArray resizableDoubleArray0 = new org.apache.commons.math.util.ResizableDoubleArray();
        double double2 = resizableDoubleArray0.addElementRolling((double) ' ');
        resizableDoubleArray0.setElement((int) '#', (double) (short) 0);
        resizableDoubleArray0.setNumElements((int) (byte) 100);
        int int8 = resizableDoubleArray0.start();
        double[] doubleArray9 = resizableDoubleArray0.getValues();
        int int10 = resizableDoubleArray0.getExpansionMode();
        resizableDoubleArray0.contract();
        int int12 = resizableDoubleArray0.getExpansionMode();
        double[] doubleArray13 = resizableDoubleArray0.getElements();
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.0d + "'", double2 == 0.0d);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertNotNull(doubleArray9);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray9), "[0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0]");
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertNotNull(doubleArray13);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray13), "[0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0]");
    }

    @Test
    public void test0298() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0298");
        org.apache.commons.math.util.ResizableDoubleArray resizableDoubleArray0 = new org.apache.commons.math.util.ResizableDoubleArray();
        double[] doubleArray1 = resizableDoubleArray0.getValues();
        float float2 = resizableDoubleArray0.getExpansionFactor();
        double[] doubleArray3 = resizableDoubleArray0.getElements();
        double double5 = resizableDoubleArray0.addElementRolling((double) (short) 10);
        // The following exception was thrown during execution in test generation
        try {
            double double7 = resizableDoubleArray0.getElement(1);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: The index specified: 1 is larger than the current number of elements");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(doubleArray1);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray1), "[10.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0]");
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 2.0f + "'", float2 == 2.0f);
        org.junit.Assert.assertNotNull(doubleArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray3), "[]");
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
    }

    @Test
    public void test0299() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0299");
        org.apache.commons.math.util.ResizableDoubleArray resizableDoubleArray2 = new org.apache.commons.math.util.ResizableDoubleArray(10, 36.5f);
    }

    @Test
    public void test0300() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0300");
        org.apache.commons.math.util.ResizableDoubleArray resizableDoubleArray0 = new org.apache.commons.math.util.ResizableDoubleArray();
        double double2 = resizableDoubleArray0.addElementRolling((double) ' ');
        int int3 = resizableDoubleArray0.getExpansionMode();
        int int4 = resizableDoubleArray0.getNumElements();
        double double6 = resizableDoubleArray0.addElementRolling((double) 1);
        java.lang.Class<?> wildcardClass7 = resizableDoubleArray0.getClass();
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.0d + "'", double2 == 0.0d);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.0d + "'", double6 == 0.0d);
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test0301() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0301");
        org.apache.commons.math.util.ResizableDoubleArray resizableDoubleArray0 = new org.apache.commons.math.util.ResizableDoubleArray();
        double double2 = resizableDoubleArray0.addElementRolling((double) ' ');
        resizableDoubleArray0.setElement((int) '#', (double) (short) 0);
        resizableDoubleArray0.setNumElements((int) (byte) 100);
        resizableDoubleArray0.contract();
        int int9 = resizableDoubleArray0.getNumElements();
        resizableDoubleArray0.addElement((double) (byte) 1);
        int int12 = resizableDoubleArray0.start();
        resizableDoubleArray0.addElement((double) (byte) -1);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.0d + "'", double2 == 0.0d);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 100 + "'", int9 == 100);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
    }

    @Test
    public void test0302() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0302");
        org.apache.commons.math.util.ResizableDoubleArray resizableDoubleArray2 = new org.apache.commons.math.util.ResizableDoubleArray((int) ' ', (float) (short) 100);
        float float3 = resizableDoubleArray2.getContractionCriteria();
        resizableDoubleArray2.setNumElements((int) '4');
        org.junit.Assert.assertTrue("'" + float3 + "' != '" + 100.5f + "'", float3 == 100.5f);
    }

    @Test
    public void test0303() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0303");
        org.apache.commons.math.util.ResizableDoubleArray resizableDoubleArray0 = new org.apache.commons.math.util.ResizableDoubleArray();
        double double2 = resizableDoubleArray0.addElementRolling((double) ' ');
        resizableDoubleArray0.setElement((int) '#', (double) (short) 0);
        resizableDoubleArray0.setNumElements((int) (byte) 100);
        resizableDoubleArray0.contract();
        int int9 = resizableDoubleArray0.getNumElements();
        resizableDoubleArray0.addElement((double) (byte) 1);
        resizableDoubleArray0.addElement((double) 100L);
        // The following exception was thrown during execution in test generation
        try {
            resizableDoubleArray0.setExpansionFactor((float) 100L);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Contraction criteria can never be smaller than the expansion factor.  This would lead to a never ending loop of expansion and contraction as a newly expanded internal storage array would immediately satisfy the criteria for contraction");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.0d + "'", double2 == 0.0d);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 100 + "'", int9 == 100);
    }

    @Test
    public void test0304() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0304");
        org.apache.commons.math.util.ResizableDoubleArray resizableDoubleArray1 = new org.apache.commons.math.util.ResizableDoubleArray(36);
        resizableDoubleArray1.setNumElements((int) (short) 10);
        resizableDoubleArray1.setContractionCriteria((float) 'a');
        // The following exception was thrown during execution in test generation
        try {
            double double7 = resizableDoubleArray1.getElement(102);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: The index specified: 102 is larger than the current number of elements");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
    }

    @Test
    public void test0305() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0305");
        org.apache.commons.math.util.ResizableDoubleArray resizableDoubleArray0 = new org.apache.commons.math.util.ResizableDoubleArray();
        float float1 = resizableDoubleArray0.getExpansionFactor();
        resizableDoubleArray0.setElement((int) (short) 1, (double) 0.0f);
        double double6 = resizableDoubleArray0.getElement((int) (byte) 1);
        // The following exception was thrown during execution in test generation
        try {
            resizableDoubleArray0.setExpansionMode(10);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Illegal expansionMode setting.");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + float1 + "' != '" + 2.0f + "'", float1 == 2.0f);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.0d + "'", double6 == 0.0d);
    }

    @Test
    public void test0306() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0306");
        org.apache.commons.math.util.ResizableDoubleArray resizableDoubleArray2 = new org.apache.commons.math.util.ResizableDoubleArray((int) (byte) 1, (float) 36);
        float float3 = resizableDoubleArray2.getContractionCriteria();
        int int4 = resizableDoubleArray2.getExpansionMode();
        org.junit.Assert.assertTrue("'" + float3 + "' != '" + 36.5f + "'", float3 == 36.5f);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
    }

    @Test
    public void test0307() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0307");
        org.apache.commons.math.util.ResizableDoubleArray resizableDoubleArray0 = new org.apache.commons.math.util.ResizableDoubleArray();
        float float1 = resizableDoubleArray0.getExpansionFactor();
        int int2 = resizableDoubleArray0.getNumElements();
        // The following exception was thrown during execution in test generation
        try {
            resizableDoubleArray0.setExpansionFactor((float) (byte) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The expansion factor must be a number greater than 1.0");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + float1 + "' != '" + 2.0f + "'", float1 == 2.0f);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
    }

    @Test
    public void test0308() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0308");
        org.apache.commons.math.util.ResizableDoubleArray resizableDoubleArray0 = new org.apache.commons.math.util.ResizableDoubleArray();
        float float1 = resizableDoubleArray0.getExpansionFactor();
        int int2 = resizableDoubleArray0.getNumElements();
        resizableDoubleArray0.addElement((double) '#');
        resizableDoubleArray0.setNumElements(10);
        float float7 = resizableDoubleArray0.getExpansionFactor();
        java.lang.Class<?> wildcardClass8 = resizableDoubleArray0.getClass();
        org.junit.Assert.assertTrue("'" + float1 + "' != '" + 2.0f + "'", float1 == 2.0f);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + float7 + "' != '" + 2.0f + "'", float7 == 2.0f);
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test0309() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0309");
        org.apache.commons.math.util.ResizableDoubleArray resizableDoubleArray2 = new org.apache.commons.math.util.ResizableDoubleArray((int) (short) 1, 10.0f);
        double[] doubleArray3 = resizableDoubleArray2.getValues();
        resizableDoubleArray2.addElement(0.0d);
        resizableDoubleArray2.addElement((double) 36);
        // The following exception was thrown during execution in test generation
        try {
            resizableDoubleArray2.setExpansionFactor((float) (short) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Contraction criteria can never be smaller than the expansion factor.  This would lead to a never ending loop of expansion and contraction as a newly expanded internal storage array would immediately satisfy the criteria for contraction");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(doubleArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray3), "[0.0]");
    }

    @Test
    public void test0310() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0310");
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math.util.ResizableDoubleArray resizableDoubleArray2 = new org.apache.commons.math.util.ResizableDoubleArray(0, (float) (short) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The initial capacity supplied: 0must be a positive integer");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void test0311() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0311");
        org.apache.commons.math.util.ResizableDoubleArray resizableDoubleArray2 = new org.apache.commons.math.util.ResizableDoubleArray(11, (float) (short) 10);
        // The following exception was thrown during execution in test generation
        try {
            double double4 = resizableDoubleArray2.getElement(4);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: The index specified: 4 is larger than the current number of elements");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
    }

    @Test
    public void test0312() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0312");
        org.apache.commons.math.util.ResizableDoubleArray resizableDoubleArray0 = new org.apache.commons.math.util.ResizableDoubleArray();
        double double2 = resizableDoubleArray0.addElementRolling((double) ' ');
        resizableDoubleArray0.setElement((int) '#', (double) (short) 0);
        resizableDoubleArray0.setNumElements((int) (byte) 100);
        resizableDoubleArray0.setElement(100, (double) (byte) 100);
        resizableDoubleArray0.contract();
        double[] doubleArray12 = resizableDoubleArray0.getElements();
        resizableDoubleArray0.setElement((int) (byte) 100, (double) (byte) 10);
        java.lang.Class<?> wildcardClass16 = resizableDoubleArray0.getClass();
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.0d + "'", double2 == 0.0d);
        org.junit.Assert.assertNotNull(doubleArray12);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray12), "[0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 100.0]");
        org.junit.Assert.assertNotNull(wildcardClass16);
    }

    @Test
    public void test0313() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0313");
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math.util.ResizableDoubleArray resizableDoubleArray4 = new org.apache.commons.math.util.ResizableDoubleArray((int) (byte) 10, 10.5f, (float) ' ', 35);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Illegal expansionMode setting.");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void test0314() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0314");
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math.util.ResizableDoubleArray resizableDoubleArray4 = new org.apache.commons.math.util.ResizableDoubleArray((int) (short) -1, 2.5f, (float) 97, (int) ' ');
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The initial capacity supplied: -1must be a positive integer");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void test0315() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0315");
        org.apache.commons.math.util.ResizableDoubleArray resizableDoubleArray0 = new org.apache.commons.math.util.ResizableDoubleArray();
        float float1 = resizableDoubleArray0.getExpansionFactor();
        int int2 = resizableDoubleArray0.getNumElements();
        resizableDoubleArray0.addElement((double) '#');
        resizableDoubleArray0.setNumElements(10);
        int int7 = resizableDoubleArray0.getExpansionMode();
        // The following exception was thrown during execution in test generation
        try {
            resizableDoubleArray0.setExpansionFactor((float) '#');
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Contraction criteria can never be smaller than the expansion factor.  This would lead to a never ending loop of expansion and contraction as a newly expanded internal storage array would immediately satisfy the criteria for contraction");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + float1 + "' != '" + 2.0f + "'", float1 == 2.0f);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
    }

    @Test
    public void test0316() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0316");
        org.apache.commons.math.util.ResizableDoubleArray resizableDoubleArray0 = new org.apache.commons.math.util.ResizableDoubleArray();
        double double2 = resizableDoubleArray0.addElementRolling((double) ' ');
        resizableDoubleArray0.setElement((int) '#', (double) (short) 0);
        resizableDoubleArray0.setNumElements((int) (byte) 100);
        int int8 = resizableDoubleArray0.start();
        resizableDoubleArray0.addElement((double) '#');
        resizableDoubleArray0.discardFrontElements(1);
        resizableDoubleArray0.setContractionCriteria(2.0f);
        float float15 = resizableDoubleArray0.getContractionCriteria();
        resizableDoubleArray0.clear();
        java.lang.Class<?> wildcardClass17 = resizableDoubleArray0.getClass();
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.0d + "'", double2 == 0.0d);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + float15 + "' != '" + 2.0f + "'", float15 == 2.0f);
        org.junit.Assert.assertNotNull(wildcardClass17);
    }

    @Test
    public void test0317() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0317");
        org.apache.commons.math.util.ResizableDoubleArray resizableDoubleArray0 = new org.apache.commons.math.util.ResizableDoubleArray();
        double[] doubleArray1 = resizableDoubleArray0.getElements();
        resizableDoubleArray0.setNumElements((int) '#');
        // The following exception was thrown during execution in test generation
        try {
            resizableDoubleArray0.setContractionCriteria((float) (-1L));
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Contraction criteria can never be smaller than the expansion factor.  This would lead to a never ending loop of expansion and contraction as a newly expanded internal storage array would immediately satisfy the criteria for contraction");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(doubleArray1);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray1), "[]");
    }

    @Test
    public void test0318() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0318");
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math.util.ResizableDoubleArray resizableDoubleArray4 = new org.apache.commons.math.util.ResizableDoubleArray((int) (byte) 1, (float) 100L, (float) 1, 99);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Contraction criteria can never be smaller than the expansion factor.  This would lead to a never ending loop of expansion and contraction as a newly expanded internal storage array would immediately satisfy the criteria for contraction");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void test0319() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0319");
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math.util.ResizableDoubleArray resizableDoubleArray4 = new org.apache.commons.math.util.ResizableDoubleArray((int) (short) -1, (float) (byte) 0, 100.0f, (int) '#');
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The expansion factor must be a number greater than 1.0");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void test0320() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0320");
        org.apache.commons.math.util.ResizableDoubleArray resizableDoubleArray0 = new org.apache.commons.math.util.ResizableDoubleArray();
        double double2 = resizableDoubleArray0.addElementRolling((double) ' ');
        resizableDoubleArray0.setElement((int) '#', (double) (short) 0);
        resizableDoubleArray0.setNumElements((int) (byte) 100);
        int int8 = resizableDoubleArray0.start();
        double[] doubleArray9 = resizableDoubleArray0.getValues();
        resizableDoubleArray0.discardFrontElements((int) (short) 1);
        double double13 = resizableDoubleArray0.getElement(35);
        int int14 = resizableDoubleArray0.getNumElements();
        resizableDoubleArray0.setContractionCriteria((float) 36);
        int int17 = resizableDoubleArray0.getNumElements();
        resizableDoubleArray0.setContractionCriteria((float) 102);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.0d + "'", double2 == 0.0d);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertNotNull(doubleArray9);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray9), "[0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0]");
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 0.0d + "'", double13 == 0.0d);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 99 + "'", int14 == 99);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 99 + "'", int17 == 99);
    }

    @Test
    public void test0321() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0321");
        org.apache.commons.math.util.ResizableDoubleArray resizableDoubleArray0 = new org.apache.commons.math.util.ResizableDoubleArray();
        double double2 = resizableDoubleArray0.addElementRolling((double) ' ');
        resizableDoubleArray0.setElement((int) '#', (double) (short) 0);
        resizableDoubleArray0.setNumElements((int) (byte) 100);
        resizableDoubleArray0.contract();
        int int9 = resizableDoubleArray0.getNumElements();
        double[] doubleArray10 = resizableDoubleArray0.getValues();
        int int11 = resizableDoubleArray0.getNumElements();
        resizableDoubleArray0.setContractionCriteria((float) 10L);
        int int14 = resizableDoubleArray0.getNumElements();
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.0d + "'", double2 == 0.0d);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 100 + "'", int9 == 100);
        org.junit.Assert.assertNotNull(doubleArray10);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray10), "[0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0]");
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 100 + "'", int11 == 100);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 100 + "'", int14 == 100);
    }

    @Test
    public void test0322() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0322");
        org.apache.commons.math.util.ResizableDoubleArray resizableDoubleArray0 = new org.apache.commons.math.util.ResizableDoubleArray();
        double double2 = resizableDoubleArray0.addElementRolling((double) ' ');
        resizableDoubleArray0.setElement((int) '#', (double) (short) 0);
        resizableDoubleArray0.setNumElements((int) (byte) 100);
        int int8 = resizableDoubleArray0.start();
        resizableDoubleArray0.addElement((double) '#');
        resizableDoubleArray0.discardFrontElements(1);
        resizableDoubleArray0.setContractionCriteria(2.0f);
        float float15 = resizableDoubleArray0.getContractionCriteria();
        double[] doubleArray16 = resizableDoubleArray0.getValues();
        double[] doubleArray17 = resizableDoubleArray0.getValues();
        int int18 = resizableDoubleArray0.start();
        // The following exception was thrown during execution in test generation
        try {
            resizableDoubleArray0.setExpansionFactor((float) 0L);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The expansion factor must be a number greater than 1.0");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.0d + "'", double2 == 0.0d);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + float15 + "' != '" + 2.0f + "'", float15 == 2.0f);
        org.junit.Assert.assertNotNull(doubleArray16);
        org.junit.Assert.assertNotNull(doubleArray17);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 1 + "'", int18 == 1);
    }

    @Test
    public void test0323() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0323");
        org.apache.commons.math.util.ResizableDoubleArray resizableDoubleArray0 = new org.apache.commons.math.util.ResizableDoubleArray();
        double double2 = resizableDoubleArray0.addElementRolling((double) ' ');
        resizableDoubleArray0.setElement((int) '#', (double) (short) 0);
        resizableDoubleArray0.setNumElements((int) (byte) 100);
        int int8 = resizableDoubleArray0.start();
        double[] doubleArray9 = resizableDoubleArray0.getValues();
        int int10 = resizableDoubleArray0.getExpansionMode();
        double double12 = resizableDoubleArray0.addElementRolling((double) 2.0f);
        double[] doubleArray13 = resizableDoubleArray0.getValues();
        resizableDoubleArray0.discardFrontElements((int) (byte) 100);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.0d + "'", double2 == 0.0d);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertNotNull(doubleArray9);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray9), "[0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0]");
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 0.0d + "'", double12 == 0.0d);
        org.junit.Assert.assertNotNull(doubleArray13);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray13), "[0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 2.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0]");
    }

    @Test
    public void test0324() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0324");
        org.apache.commons.math.util.ResizableDoubleArray resizableDoubleArray0 = new org.apache.commons.math.util.ResizableDoubleArray();
        float float1 = resizableDoubleArray0.getExpansionFactor();
        resizableDoubleArray0.addElement((double) 0.0f);
        resizableDoubleArray0.addElement((double) 100.0f);
        resizableDoubleArray0.addElement((double) 0);
        resizableDoubleArray0.clear();
        // The following exception was thrown during execution in test generation
        try {
            resizableDoubleArray0.setNumElements((int) (byte) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Number of elements must be zero or a positive integer");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + float1 + "' != '" + 2.0f + "'", float1 == 2.0f);
    }

    @Test
    public void test0325() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0325");
        org.apache.commons.math.util.ResizableDoubleArray resizableDoubleArray1 = new org.apache.commons.math.util.ResizableDoubleArray((int) (byte) 100);
        double[] doubleArray2 = resizableDoubleArray1.getValues();
        resizableDoubleArray1.setExpansionMode((int) (byte) 0);
        resizableDoubleArray1.setNumElements(0);
        // The following exception was thrown during execution in test generation
        try {
            resizableDoubleArray1.setExpansionFactor(10.0f);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Contraction criteria can never be smaller than the expansion factor.  This would lead to a never ending loop of expansion and contraction as a newly expanded internal storage array would immediately satisfy the criteria for contraction");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(doubleArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray2), "[0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0]");
    }

    @Test
    public void test0326() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0326");
        org.apache.commons.math.util.ResizableDoubleArray resizableDoubleArray2 = new org.apache.commons.math.util.ResizableDoubleArray((int) (short) 1, 10.0f);
        resizableDoubleArray2.setExpansionMode(1);
        // The following exception was thrown during execution in test generation
        try {
            resizableDoubleArray2.discardFrontElements((int) (short) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Cannot discard more elements than arecontained in this array.");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void test0327() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0327");
        org.apache.commons.math.util.ResizableDoubleArray resizableDoubleArray2 = new org.apache.commons.math.util.ResizableDoubleArray((int) (short) 100, (float) (byte) 10);
        double[] doubleArray3 = resizableDoubleArray2.getValues();
        float float4 = resizableDoubleArray2.getExpansionFactor();
        resizableDoubleArray2.discardFrontElements(0);
        // The following exception was thrown during execution in test generation
        try {
            resizableDoubleArray2.discardFrontElements((int) (byte) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Cannot discard more elements than arecontained in this array.");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(doubleArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray3), "[0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0]");
        org.junit.Assert.assertTrue("'" + float4 + "' != '" + 10.0f + "'", float4 == 10.0f);
    }

    @Test
    public void test0328() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0328");
        org.apache.commons.math.util.ResizableDoubleArray resizableDoubleArray0 = new org.apache.commons.math.util.ResizableDoubleArray();
        double[] doubleArray1 = resizableDoubleArray0.getValues();
        float float2 = resizableDoubleArray0.getExpansionFactor();
        float float3 = resizableDoubleArray0.getExpansionFactor();
        double double5 = resizableDoubleArray0.addElementRolling(0.0d);
        float float6 = resizableDoubleArray0.getContractionCriteria();
        double double8 = resizableDoubleArray0.addElementRolling((double) 36);
        java.lang.Class<?> wildcardClass9 = resizableDoubleArray0.getClass();
        org.junit.Assert.assertNotNull(doubleArray1);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray1), "[0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0]");
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 2.0f + "'", float2 == 2.0f);
        org.junit.Assert.assertTrue("'" + float3 + "' != '" + 2.0f + "'", float3 == 2.0f);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
        org.junit.Assert.assertTrue("'" + float6 + "' != '" + 2.5f + "'", float6 == 2.5f);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 0.0d + "'", double8 == 0.0d);
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test0329() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0329");
        org.apache.commons.math.util.ResizableDoubleArray resizableDoubleArray0 = new org.apache.commons.math.util.ResizableDoubleArray();
        double[] doubleArray1 = resizableDoubleArray0.getValues();
        resizableDoubleArray0.setNumElements((int) '#');
        double[] doubleArray4 = resizableDoubleArray0.getValues();
        java.lang.Class<?> wildcardClass5 = doubleArray4.getClass();
        org.junit.Assert.assertNotNull(doubleArray1);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray1), "[0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0]");
        org.junit.Assert.assertNotNull(doubleArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray4), "[0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0]");
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test0330() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0330");
        org.apache.commons.math.util.ResizableDoubleArray resizableDoubleArray0 = new org.apache.commons.math.util.ResizableDoubleArray();
        double double2 = resizableDoubleArray0.addElementRolling((double) ' ');
        resizableDoubleArray0.setElement((int) '#', (double) (short) 0);
        resizableDoubleArray0.setNumElements((int) (byte) 100);
        resizableDoubleArray0.contract();
        resizableDoubleArray0.setNumElements((int) (short) 1);
        resizableDoubleArray0.setElement(99, (double) 100.0f);
        // The following exception was thrown during execution in test generation
        try {
            double double15 = resizableDoubleArray0.getElement((int) (short) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Elements cannot be retrieved from a negative array index");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.0d + "'", double2 == 0.0d);
    }

    @Test
    public void test0331() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0331");
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math.util.ResizableDoubleArray resizableDoubleArray4 = new org.apache.commons.math.util.ResizableDoubleArray((int) (byte) 1, (float) (byte) 0, 10.0f, 100);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The expansion factor must be a number greater than 1.0");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void test0332() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0332");
        org.apache.commons.math.util.ResizableDoubleArray resizableDoubleArray0 = new org.apache.commons.math.util.ResizableDoubleArray();
        float float1 = resizableDoubleArray0.getExpansionFactor();
        resizableDoubleArray0.setNumElements((int) (byte) 100);
        resizableDoubleArray0.contract();
        float float5 = resizableDoubleArray0.getContractionCriteria();
        // The following exception was thrown during execution in test generation
        try {
            resizableDoubleArray0.setElement((int) (byte) -1, (-1.0d));
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Cannot set an element at a negative index");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + float1 + "' != '" + 2.0f + "'", float1 == 2.0f);
        org.junit.Assert.assertTrue("'" + float5 + "' != '" + 2.5f + "'", float5 == 2.5f);
    }

    @Test
    public void test0333() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0333");
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math.util.ResizableDoubleArray resizableDoubleArray3 = new org.apache.commons.math.util.ResizableDoubleArray(68, (float) (short) 10, (float) (-1L));
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Contraction criteria can never be smaller than the expansion factor.  This would lead to a never ending loop of expansion and contraction as a newly expanded internal storage array would immediately satisfy the criteria for contraction");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void test0334() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0334");
        org.apache.commons.math.util.ResizableDoubleArray resizableDoubleArray0 = new org.apache.commons.math.util.ResizableDoubleArray();
        int int1 = resizableDoubleArray0.getExpansionMode();
        java.lang.Class<?> wildcardClass2 = resizableDoubleArray0.getClass();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertNotNull(wildcardClass2);
    }

    @Test
    public void test0335() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0335");
        org.apache.commons.math.util.ResizableDoubleArray resizableDoubleArray0 = new org.apache.commons.math.util.ResizableDoubleArray();
        float float1 = resizableDoubleArray0.getExpansionFactor();
        double[] doubleArray2 = resizableDoubleArray0.getValues();
        double[] doubleArray3 = resizableDoubleArray0.getValues();
        double double5 = resizableDoubleArray0.addElementRolling((double) '4');
        resizableDoubleArray0.clear();
        // The following exception was thrown during execution in test generation
        try {
            resizableDoubleArray0.discardFrontElements((int) (short) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Cannot discard more elements than arecontained in this array.");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + float1 + "' != '" + 2.0f + "'", float1 == 2.0f);
        org.junit.Assert.assertNotNull(doubleArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray2), "[52.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0]");
        org.junit.Assert.assertNotNull(doubleArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray3), "[52.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0]");
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
    }

    @Test
    public void test0336() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0336");
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math.util.ResizableDoubleArray resizableDoubleArray4 = new org.apache.commons.math.util.ResizableDoubleArray(0, (float) (short) 10, (float) 'a', (int) '4');
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The initial capacity supplied: 0must be a positive integer");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void test0337() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0337");
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math.util.ResizableDoubleArray resizableDoubleArray3 = new org.apache.commons.math.util.ResizableDoubleArray((int) ' ', 36.5f, (float) 35);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Contraction criteria can never be smaller than the expansion factor.  This would lead to a never ending loop of expansion and contraction as a newly expanded internal storage array would immediately satisfy the criteria for contraction");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void test0338() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0338");
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math.util.ResizableDoubleArray resizableDoubleArray4 = new org.apache.commons.math.util.ResizableDoubleArray(10, (float) (byte) 1, (float) 1, (int) '#');
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The expansion factor must be a number greater than 1.0");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void test0339() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0339");
        org.apache.commons.math.util.ResizableDoubleArray resizableDoubleArray0 = new org.apache.commons.math.util.ResizableDoubleArray();
        float float1 = resizableDoubleArray0.getExpansionFactor();
        resizableDoubleArray0.addElement((double) 0.0f);
        resizableDoubleArray0.contract();
        float float5 = resizableDoubleArray0.getExpansionFactor();
        int int6 = resizableDoubleArray0.getNumElements();
        resizableDoubleArray0.setNumElements(99);
        java.lang.Class<?> wildcardClass9 = resizableDoubleArray0.getClass();
        org.junit.Assert.assertTrue("'" + float1 + "' != '" + 2.0f + "'", float1 == 2.0f);
        org.junit.Assert.assertTrue("'" + float5 + "' != '" + 2.0f + "'", float5 == 2.0f);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test0340() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0340");
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math.util.ResizableDoubleArray resizableDoubleArray3 = new org.apache.commons.math.util.ResizableDoubleArray(11, (float) (byte) 100, (float) (byte) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Contraction criteria can never be smaller than the expansion factor.  This would lead to a never ending loop of expansion and contraction as a newly expanded internal storage array would immediately satisfy the criteria for contraction");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void test0341() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0341");
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math.util.ResizableDoubleArray resizableDoubleArray4 = new org.apache.commons.math.util.ResizableDoubleArray(99, (float) 0, (float) (-1L), 1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Contraction criteria can never be smaller than the expansion factor.  This would lead to a never ending loop of expansion and contraction as a newly expanded internal storage array would immediately satisfy the criteria for contraction");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void test0342() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0342");
        org.apache.commons.math.util.ResizableDoubleArray resizableDoubleArray2 = new org.apache.commons.math.util.ResizableDoubleArray((int) (short) 1, 10.0f);
        double[] doubleArray3 = resizableDoubleArray2.getValues();
        resizableDoubleArray2.addElement(0.0d);
        resizableDoubleArray2.addElement((double) 36);
        // The following exception was thrown during execution in test generation
        try {
            resizableDoubleArray2.setContractionCriteria((float) (byte) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Contraction criteria can never be smaller than the expansion factor.  This would lead to a never ending loop of expansion and contraction as a newly expanded internal storage array would immediately satisfy the criteria for contraction");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(doubleArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray3), "[0.0]");
    }

    @Test
    public void test0343() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0343");
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math.util.ResizableDoubleArray resizableDoubleArray4 = new org.apache.commons.math.util.ResizableDoubleArray(101, (float) (-1), 36.5f, 10);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The expansion factor must be a number greater than 1.0");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void test0344() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0344");
        org.apache.commons.math.util.ResizableDoubleArray resizableDoubleArray4 = new org.apache.commons.math.util.ResizableDoubleArray((int) (short) 10, (float) 4, (float) 100L, 0);
        // The following exception was thrown during execution in test generation
        try {
            double double6 = resizableDoubleArray4.getElement((int) ' ');
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: The index specified: 32 is larger than the current number of elements");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
    }

    @Test
    public void test0345() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0345");
        org.apache.commons.math.util.ResizableDoubleArray resizableDoubleArray0 = new org.apache.commons.math.util.ResizableDoubleArray();
        float float1 = resizableDoubleArray0.getExpansionFactor();
        resizableDoubleArray0.addElement((double) 0.0f);
        resizableDoubleArray0.addElement((double) 100.0f);
        resizableDoubleArray0.addElement((double) 0);
        int int8 = resizableDoubleArray0.start();
        double double10 = resizableDoubleArray0.addElementRolling((double) 36.5f);
        java.lang.Class<?> wildcardClass11 = resizableDoubleArray0.getClass();
        org.junit.Assert.assertTrue("'" + float1 + "' != '" + 2.0f + "'", float1 == 2.0f);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 0.0d + "'", double10 == 0.0d);
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test0346() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0346");
        org.apache.commons.math.util.ResizableDoubleArray resizableDoubleArray0 = new org.apache.commons.math.util.ResizableDoubleArray();
        double double2 = resizableDoubleArray0.addElementRolling((double) ' ');
        double[] doubleArray3 = resizableDoubleArray0.getElements();
        double double5 = resizableDoubleArray0.addElementRolling((double) 'a');
        // The following exception was thrown during execution in test generation
        try {
            resizableDoubleArray0.discardFrontElements((-1));
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Cannot discard a negative number of elements.");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.0d + "'", double2 == 0.0d);
        org.junit.Assert.assertNotNull(doubleArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray3), "[]");
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
    }

    @Test
    public void test0347() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0347");
        org.apache.commons.math.util.ResizableDoubleArray resizableDoubleArray2 = new org.apache.commons.math.util.ResizableDoubleArray((int) (byte) 1, (float) 36);
        java.lang.Class<?> wildcardClass3 = resizableDoubleArray2.getClass();
        org.junit.Assert.assertNotNull(wildcardClass3);
    }

    @Test
    public void test0348() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0348");
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math.util.ResizableDoubleArray resizableDoubleArray2 = new org.apache.commons.math.util.ResizableDoubleArray((int) (byte) 10, (float) (-1L));
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The expansion factor must be a number greater than 1.0");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void test0349() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0349");
        org.apache.commons.math.util.ResizableDoubleArray resizableDoubleArray0 = new org.apache.commons.math.util.ResizableDoubleArray();
        float float1 = resizableDoubleArray0.getExpansionFactor();
        int int2 = resizableDoubleArray0.getNumElements();
        resizableDoubleArray0.addElement((double) '#');
        int int5 = resizableDoubleArray0.start();
        float float6 = resizableDoubleArray0.getExpansionFactor();
        double double8 = resizableDoubleArray0.getElement((int) (byte) 0);
        // The following exception was thrown during execution in test generation
        try {
            resizableDoubleArray0.setExpansionMode(68);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Illegal expansionMode setting.");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + float1 + "' != '" + 2.0f + "'", float1 == 2.0f);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + float6 + "' != '" + 2.0f + "'", float6 == 2.0f);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 35.0d + "'", double8 == 35.0d);
    }

    @Test
    public void test0350() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0350");
        org.apache.commons.math.util.ResizableDoubleArray resizableDoubleArray1 = new org.apache.commons.math.util.ResizableDoubleArray((int) (byte) 100);
        double[] doubleArray2 = resizableDoubleArray1.getValues();
        // The following exception was thrown during execution in test generation
        try {
            resizableDoubleArray1.setExpansionFactor((float) 36);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Contraction criteria can never be smaller than the expansion factor.  This would lead to a never ending loop of expansion and contraction as a newly expanded internal storage array would immediately satisfy the criteria for contraction");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(doubleArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray2), "[0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0]");
    }

    @Test
    public void test0351() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0351");
        org.apache.commons.math.util.ResizableDoubleArray resizableDoubleArray2 = new org.apache.commons.math.util.ResizableDoubleArray(102, (float) (short) 10);
        int int3 = resizableDoubleArray2.start();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
    }

    @Test
    public void test0352() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0352");
        org.apache.commons.math.util.ResizableDoubleArray resizableDoubleArray1 = new org.apache.commons.math.util.ResizableDoubleArray((int) (byte) 100);
        double[] doubleArray2 = resizableDoubleArray1.getValues();
        resizableDoubleArray1.setExpansionMode((int) (byte) 0);
        resizableDoubleArray1.addElement((double) (short) 0);
        resizableDoubleArray1.addElement((double) 10.0f);
        resizableDoubleArray1.setElement((int) (byte) 100, (double) (short) 1);
        org.junit.Assert.assertNotNull(doubleArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray2), "[0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0]");
    }

    @Test
    public void test0353() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0353");
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math.util.ResizableDoubleArray resizableDoubleArray4 = new org.apache.commons.math.util.ResizableDoubleArray(35, 0.0f, (float) 4, 99);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The expansion factor must be a number greater than 1.0");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void test0354() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0354");
        org.apache.commons.math.util.ResizableDoubleArray resizableDoubleArray2 = new org.apache.commons.math.util.ResizableDoubleArray((int) (short) 1, 10.0f);
        double[] doubleArray3 = resizableDoubleArray2.getElements();
        double double5 = resizableDoubleArray2.addElementRolling((double) 100.0f);
        double[] doubleArray6 = resizableDoubleArray2.getElements();
        // The following exception was thrown during execution in test generation
        try {
            resizableDoubleArray2.setExpansionFactor(100.5f);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Contraction criteria can never be smaller than the expansion factor.  This would lead to a never ending loop of expansion and contraction as a newly expanded internal storage array would immediately satisfy the criteria for contraction");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(doubleArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray3), "[]");
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
        org.junit.Assert.assertNotNull(doubleArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray6), "[]");
    }

    @Test
    public void test0355() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0355");
        org.apache.commons.math.util.ResizableDoubleArray resizableDoubleArray1 = new org.apache.commons.math.util.ResizableDoubleArray(36);
        resizableDoubleArray1.setContractionCriteria((float) 11);
        // The following exception was thrown during execution in test generation
        try {
            double double5 = resizableDoubleArray1.getElement(36);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: The index specified: 36 is larger than the current number of elements");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
    }

    @Test
    public void test0356() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0356");
        org.apache.commons.math.util.ResizableDoubleArray resizableDoubleArray0 = new org.apache.commons.math.util.ResizableDoubleArray();
        float float1 = resizableDoubleArray0.getExpansionFactor();
        int int2 = resizableDoubleArray0.getNumElements();
        resizableDoubleArray0.addElement((double) '#');
        resizableDoubleArray0.setNumElements(10);
        float float7 = resizableDoubleArray0.getExpansionFactor();
        resizableDoubleArray0.setNumElements((int) (short) 1);
        double double11 = resizableDoubleArray0.addElementRolling((double) 100);
        org.junit.Assert.assertTrue("'" + float1 + "' != '" + 2.0f + "'", float1 == 2.0f);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + float7 + "' != '" + 2.0f + "'", float7 == 2.0f);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 35.0d + "'", double11 == 35.0d);
    }

    @Test
    public void test0357() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0357");
        org.apache.commons.math.util.ResizableDoubleArray resizableDoubleArray0 = new org.apache.commons.math.util.ResizableDoubleArray();
        double double2 = resizableDoubleArray0.addElementRolling((double) ' ');
        resizableDoubleArray0.setElement((int) '#', (double) (short) 0);
        resizableDoubleArray0.setNumElements((int) (byte) 100);
        int int8 = resizableDoubleArray0.start();
        double[] doubleArray9 = resizableDoubleArray0.getValues();
        int int10 = resizableDoubleArray0.start();
        resizableDoubleArray0.discardFrontElements((int) (short) 100);
        resizableDoubleArray0.addElement(0.0d);
        double double16 = resizableDoubleArray0.addElementRolling(0.0d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.0d + "'", double2 == 0.0d);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertNotNull(doubleArray9);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray9), "[0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0]");
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertTrue("'" + double16 + "' != '" + 0.0d + "'", double16 == 0.0d);
    }

    @Test
    public void test0358() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0358");
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math.util.ResizableDoubleArray resizableDoubleArray3 = new org.apache.commons.math.util.ResizableDoubleArray((int) (short) 10, 100.0f, (float) (short) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Contraction criteria can never be smaller than the expansion factor.  This would lead to a never ending loop of expansion and contraction as a newly expanded internal storage array would immediately satisfy the criteria for contraction");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void test0359() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0359");
        org.apache.commons.math.util.ResizableDoubleArray resizableDoubleArray0 = new org.apache.commons.math.util.ResizableDoubleArray();
        double double2 = resizableDoubleArray0.addElementRolling((double) ' ');
        resizableDoubleArray0.setElement((int) '#', (double) (short) 0);
        double[] doubleArray6 = resizableDoubleArray0.getValues();
        int int7 = resizableDoubleArray0.getExpansionMode();
        float float8 = resizableDoubleArray0.getContractionCriteria();
        int int9 = resizableDoubleArray0.start();
        java.lang.Class<?> wildcardClass10 = resizableDoubleArray0.getClass();
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.0d + "'", double2 == 0.0d);
        org.junit.Assert.assertNotNull(doubleArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray6), "[0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0]");
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + float8 + "' != '" + 2.5f + "'", float8 == 2.5f);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test0360() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0360");
        org.apache.commons.math.util.ResizableDoubleArray resizableDoubleArray2 = new org.apache.commons.math.util.ResizableDoubleArray((int) (byte) 100, 100.0f);
        java.lang.Class<?> wildcardClass3 = resizableDoubleArray2.getClass();
        org.junit.Assert.assertNotNull(wildcardClass3);
    }

    @Test
    public void test0361() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0361");
        org.apache.commons.math.util.ResizableDoubleArray resizableDoubleArray0 = new org.apache.commons.math.util.ResizableDoubleArray();
        float float1 = resizableDoubleArray0.getExpansionFactor();
        resizableDoubleArray0.setExpansionMode(1);
        resizableDoubleArray0.contract();
        resizableDoubleArray0.setElement(36, (double) 10L);
        resizableDoubleArray0.addElement((double) 36.5f);
        // The following exception was thrown during execution in test generation
        try {
            resizableDoubleArray0.setExpansionFactor(10.0f);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Contraction criteria can never be smaller than the expansion factor.  This would lead to a never ending loop of expansion and contraction as a newly expanded internal storage array would immediately satisfy the criteria for contraction");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + float1 + "' != '" + 2.0f + "'", float1 == 2.0f);
    }

    @Test
    public void test0362() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0362");
        org.apache.commons.math.util.ResizableDoubleArray resizableDoubleArray0 = new org.apache.commons.math.util.ResizableDoubleArray();
        float float1 = resizableDoubleArray0.getExpansionFactor();
        int int2 = resizableDoubleArray0.getNumElements();
        resizableDoubleArray0.addElement((double) '#');
        int int5 = resizableDoubleArray0.start();
        float float6 = resizableDoubleArray0.getExpansionFactor();
        double double8 = resizableDoubleArray0.getElement((int) (byte) 0);
        resizableDoubleArray0.setElement(68, 100.0d);
        org.junit.Assert.assertTrue("'" + float1 + "' != '" + 2.0f + "'", float1 == 2.0f);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + float6 + "' != '" + 2.0f + "'", float6 == 2.0f);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 35.0d + "'", double8 == 35.0d);
    }

    @Test
    public void test0363() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0363");
        org.apache.commons.math.util.ResizableDoubleArray resizableDoubleArray0 = new org.apache.commons.math.util.ResizableDoubleArray();
        float float1 = resizableDoubleArray0.getExpansionFactor();
        resizableDoubleArray0.addElement((double) 0.0f);
        resizableDoubleArray0.contract();
        // The following exception was thrown during execution in test generation
        try {
            resizableDoubleArray0.discardFrontElements((int) (short) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Cannot discard more elements than arecontained in this array.");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + float1 + "' != '" + 2.0f + "'", float1 == 2.0f);
    }

    @Test
    public void test0364() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0364");
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math.util.ResizableDoubleArray resizableDoubleArray3 = new org.apache.commons.math.util.ResizableDoubleArray(35, (float) 100, (float) 0L);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Contraction criteria can never be smaller than the expansion factor.  This would lead to a never ending loop of expansion and contraction as a newly expanded internal storage array would immediately satisfy the criteria for contraction");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void test0365() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0365");
        org.apache.commons.math.util.ResizableDoubleArray resizableDoubleArray3 = new org.apache.commons.math.util.ResizableDoubleArray(11, 36.5f, 100.5f);
        // The following exception was thrown during execution in test generation
        try {
            resizableDoubleArray3.setExpansionFactor((float) (short) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The expansion factor must be a number greater than 1.0");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void test0366() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0366");
        org.apache.commons.math.util.ResizableDoubleArray resizableDoubleArray0 = new org.apache.commons.math.util.ResizableDoubleArray();
        double double2 = resizableDoubleArray0.addElementRolling((double) ' ');
        resizableDoubleArray0.setElement((int) '#', (double) (short) 0);
        resizableDoubleArray0.setNumElements((int) (byte) 100);
        resizableDoubleArray0.contract();
        resizableDoubleArray0.setNumElements((int) (short) 1);
        // The following exception was thrown during execution in test generation
        try {
            resizableDoubleArray0.setElement((int) (short) -1, 100.0d);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Cannot set an element at a negative index");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.0d + "'", double2 == 0.0d);
    }

    @Test
    public void test0367() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0367");
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math.util.ResizableDoubleArray resizableDoubleArray4 = new org.apache.commons.math.util.ResizableDoubleArray((int) (byte) 100, (float) (-1L), (float) (byte) 0, 4);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The expansion factor must be a number greater than 1.0");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void test0368() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0368");
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math.util.ResizableDoubleArray resizableDoubleArray4 = new org.apache.commons.math.util.ResizableDoubleArray((int) '4', (float) 10, 100.5f, 99);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Illegal expansionMode setting.");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void test0369() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0369");
        org.apache.commons.math.util.ResizableDoubleArray resizableDoubleArray0 = new org.apache.commons.math.util.ResizableDoubleArray();
        double[] doubleArray1 = resizableDoubleArray0.getElements();
        resizableDoubleArray0.addElement((double) (short) -1);
        float float4 = resizableDoubleArray0.getExpansionFactor();
        resizableDoubleArray0.setElement((int) (byte) 100, (double) (short) 100);
        resizableDoubleArray0.clear();
        // The following exception was thrown during execution in test generation
        try {
            double double10 = resizableDoubleArray0.getElement((int) (byte) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: The index specified: 10 is larger than the current number of elements");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(doubleArray1);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray1), "[]");
        org.junit.Assert.assertTrue("'" + float4 + "' != '" + 2.0f + "'", float4 == 2.0f);
    }

    @Test
    public void test0370() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0370");
        org.apache.commons.math.util.ResizableDoubleArray resizableDoubleArray0 = new org.apache.commons.math.util.ResizableDoubleArray();
        float float1 = resizableDoubleArray0.getExpansionFactor();
        resizableDoubleArray0.setNumElements((int) (byte) 100);
        double double5 = resizableDoubleArray0.addElementRolling(0.0d);
        resizableDoubleArray0.setContractionCriteria((float) 'a');
        // The following exception was thrown during execution in test generation
        try {
            resizableDoubleArray0.setContractionCriteria(0.0f);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Contraction criteria can never be smaller than the expansion factor.  This would lead to a never ending loop of expansion and contraction as a newly expanded internal storage array would immediately satisfy the criteria for contraction");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + float1 + "' != '" + 2.0f + "'", float1 == 2.0f);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
    }

    @Test
    public void test0371() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0371");
        org.apache.commons.math.util.ResizableDoubleArray resizableDoubleArray0 = new org.apache.commons.math.util.ResizableDoubleArray();
        double double2 = resizableDoubleArray0.addElementRolling((double) ' ');
        float float3 = resizableDoubleArray0.getExpansionFactor();
        resizableDoubleArray0.setNumElements((int) '#');
        // The following exception was thrown during execution in test generation
        try {
            double double7 = resizableDoubleArray0.getElement(100);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: The index specified: 100 is larger than the current number of elements");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.0d + "'", double2 == 0.0d);
        org.junit.Assert.assertTrue("'" + float3 + "' != '" + 2.0f + "'", float3 == 2.0f);
    }

    @Test
    public void test0372() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0372");
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math.util.ResizableDoubleArray resizableDoubleArray3 = new org.apache.commons.math.util.ResizableDoubleArray((int) (byte) 1, 0.0f, (float) 99);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The expansion factor must be a number greater than 1.0");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void test0373() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0373");
        org.apache.commons.math.util.ResizableDoubleArray resizableDoubleArray3 = new org.apache.commons.math.util.ResizableDoubleArray(100, (float) ' ', (float) 35);
        double[] doubleArray4 = resizableDoubleArray3.getElements();
        org.junit.Assert.assertNotNull(doubleArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray4), "[]");
    }

    @Test
    public void test0374() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0374");
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math.util.ResizableDoubleArray resizableDoubleArray4 = new org.apache.commons.math.util.ResizableDoubleArray((int) (short) 0, (float) 10, (float) '4', (int) (short) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The initial capacity supplied: 0must be a positive integer");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void test0375() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0375");
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math.util.ResizableDoubleArray resizableDoubleArray1 = new org.apache.commons.math.util.ResizableDoubleArray((int) (short) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The initial capacity supplied: -1must be a positive integer");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void test0376() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0376");
        org.apache.commons.math.util.ResizableDoubleArray resizableDoubleArray0 = new org.apache.commons.math.util.ResizableDoubleArray();
        double double2 = resizableDoubleArray0.addElementRolling((double) ' ');
        resizableDoubleArray0.setElement((int) '#', (double) (short) 0);
        resizableDoubleArray0.setNumElements((int) (byte) 100);
        resizableDoubleArray0.contract();
        int int9 = resizableDoubleArray0.start();
        float float10 = resizableDoubleArray0.getContractionCriteria();
        resizableDoubleArray0.setContractionCriteria(2.0f);
        int int13 = resizableDoubleArray0.start();
        double[] doubleArray14 = resizableDoubleArray0.getValues();
        resizableDoubleArray0.addElement((double) (byte) 100);
        // The following exception was thrown during execution in test generation
        try {
            resizableDoubleArray0.setExpansionMode(100);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Illegal expansionMode setting.");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.0d + "'", double2 == 0.0d);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + float10 + "' != '" + 2.5f + "'", float10 == 2.5f);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertNotNull(doubleArray14);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray14), "[0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 100.0]");
    }

    @Test
    public void test0377() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0377");
        org.apache.commons.math.util.ResizableDoubleArray resizableDoubleArray0 = new org.apache.commons.math.util.ResizableDoubleArray();
        double double2 = resizableDoubleArray0.addElementRolling((double) ' ');
        resizableDoubleArray0.setElement((int) '#', (double) (short) 0);
        resizableDoubleArray0.setNumElements((int) (byte) 100);
        resizableDoubleArray0.contract();
        resizableDoubleArray0.setNumElements((int) (short) 1);
        double double12 = resizableDoubleArray0.getElement((int) (byte) 0);
        double double14 = resizableDoubleArray0.addElementRolling((double) '4');
        // The following exception was thrown during execution in test generation
        try {
            resizableDoubleArray0.setExpansionFactor((float) 35);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Contraction criteria can never be smaller than the expansion factor.  This would lead to a never ending loop of expansion and contraction as a newly expanded internal storage array would immediately satisfy the criteria for contraction");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.0d + "'", double2 == 0.0d);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 0.0d + "'", double12 == 0.0d);
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + 0.0d + "'", double14 == 0.0d);
    }

    @Test
    public void test0378() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0378");
        org.apache.commons.math.util.ResizableDoubleArray resizableDoubleArray0 = new org.apache.commons.math.util.ResizableDoubleArray();
        float float1 = resizableDoubleArray0.getExpansionFactor();
        resizableDoubleArray0.addElement((double) 0.0f);
        resizableDoubleArray0.contract();
        resizableDoubleArray0.setNumElements(11);
        resizableDoubleArray0.contract();
        resizableDoubleArray0.contract();
        // The following exception was thrown during execution in test generation
        try {
            resizableDoubleArray0.setContractionCriteria((float) 1L);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Contraction criteria can never be smaller than the expansion factor.  This would lead to a never ending loop of expansion and contraction as a newly expanded internal storage array would immediately satisfy the criteria for contraction");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + float1 + "' != '" + 2.0f + "'", float1 == 2.0f);
    }

    @Test
    public void test0379() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0379");
        org.apache.commons.math.util.ResizableDoubleArray resizableDoubleArray0 = new org.apache.commons.math.util.ResizableDoubleArray();
        float float1 = resizableDoubleArray0.getExpansionFactor();
        resizableDoubleArray0.setNumElements((int) (byte) 100);
        resizableDoubleArray0.contract();
        int int5 = resizableDoubleArray0.start();
        int int6 = resizableDoubleArray0.getExpansionMode();
        resizableDoubleArray0.clear();
        org.junit.Assert.assertTrue("'" + float1 + "' != '" + 2.0f + "'", float1 == 2.0f);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
    }

    @Test
    public void test0380() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0380");
        org.apache.commons.math.util.ResizableDoubleArray resizableDoubleArray1 = new org.apache.commons.math.util.ResizableDoubleArray((int) (byte) 100);
        double[] doubleArray2 = resizableDoubleArray1.getValues();
        double[] doubleArray3 = resizableDoubleArray1.getValues();
        // The following exception was thrown during execution in test generation
        try {
            resizableDoubleArray1.setExpansionFactor((float) 10L);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Contraction criteria can never be smaller than the expansion factor.  This would lead to a never ending loop of expansion and contraction as a newly expanded internal storage array would immediately satisfy the criteria for contraction");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(doubleArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray2), "[0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0]");
        org.junit.Assert.assertNotNull(doubleArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray3), "[0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0]");
    }

    @Test
    public void test0381() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0381");
        org.apache.commons.math.util.ResizableDoubleArray resizableDoubleArray0 = new org.apache.commons.math.util.ResizableDoubleArray();
        float float1 = resizableDoubleArray0.getExpansionFactor();
        double[] doubleArray2 = resizableDoubleArray0.getValues();
        double[] doubleArray3 = resizableDoubleArray0.getValues();
        int int4 = resizableDoubleArray0.start();
        int int5 = resizableDoubleArray0.start();
        org.junit.Assert.assertTrue("'" + float1 + "' != '" + 2.0f + "'", float1 == 2.0f);
        org.junit.Assert.assertNotNull(doubleArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray2), "[0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0]");
        org.junit.Assert.assertNotNull(doubleArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray3), "[0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0]");
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
    }

    @Test
    public void test0382() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0382");
        org.apache.commons.math.util.ResizableDoubleArray resizableDoubleArray1 = new org.apache.commons.math.util.ResizableDoubleArray((int) 'a');
        float float2 = resizableDoubleArray1.getContractionCriteria();
        int int3 = resizableDoubleArray1.getExpansionMode();
        float float4 = resizableDoubleArray1.getExpansionFactor();
        java.lang.Class<?> wildcardClass5 = resizableDoubleArray1.getClass();
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 2.5f + "'", float2 == 2.5f);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + float4 + "' != '" + 2.0f + "'", float4 == 2.0f);
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test0383() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0383");
        org.apache.commons.math.util.ResizableDoubleArray resizableDoubleArray0 = new org.apache.commons.math.util.ResizableDoubleArray();
        float float1 = resizableDoubleArray0.getExpansionFactor();
        double[] doubleArray2 = resizableDoubleArray0.getValues();
        double[] doubleArray3 = resizableDoubleArray0.getValues();
        resizableDoubleArray0.clear();
        // The following exception was thrown during execution in test generation
        try {
            double double6 = resizableDoubleArray0.getElement((int) (byte) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Elements cannot be retrieved from a negative array index");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + float1 + "' != '" + 2.0f + "'", float1 == 2.0f);
        org.junit.Assert.assertNotNull(doubleArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray2), "[0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0]");
        org.junit.Assert.assertNotNull(doubleArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray3), "[0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0]");
    }

    @Test
    public void test0384() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0384");
        org.apache.commons.math.util.ResizableDoubleArray resizableDoubleArray0 = new org.apache.commons.math.util.ResizableDoubleArray();
        double double2 = resizableDoubleArray0.addElementRolling((double) ' ');
        float float3 = resizableDoubleArray0.getExpansionFactor();
        float float4 = resizableDoubleArray0.getExpansionFactor();
        resizableDoubleArray0.addElement((double) (short) -1);
        int int7 = resizableDoubleArray0.getExpansionMode();
        java.lang.Class<?> wildcardClass8 = resizableDoubleArray0.getClass();
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.0d + "'", double2 == 0.0d);
        org.junit.Assert.assertTrue("'" + float3 + "' != '" + 2.0f + "'", float3 == 2.0f);
        org.junit.Assert.assertTrue("'" + float4 + "' != '" + 2.0f + "'", float4 == 2.0f);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test0385() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0385");
        org.apache.commons.math.util.ResizableDoubleArray resizableDoubleArray1 = new org.apache.commons.math.util.ResizableDoubleArray((int) (short) 1);
        resizableDoubleArray1.setExpansionMode(0);
        // The following exception was thrown during execution in test generation
        try {
            resizableDoubleArray1.setElement((int) (byte) -1, (double) (byte) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Cannot set an element at a negative index");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
    }

    @Test
    public void test0386() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0386");
        org.apache.commons.math.util.ResizableDoubleArray resizableDoubleArray1 = new org.apache.commons.math.util.ResizableDoubleArray((int) 'a');
        float float2 = resizableDoubleArray1.getContractionCriteria();
        int int3 = resizableDoubleArray1.getExpansionMode();
        float float4 = resizableDoubleArray1.getExpansionFactor();
        resizableDoubleArray1.contract();
        double[] doubleArray6 = resizableDoubleArray1.getValues();
        // The following exception was thrown during execution in test generation
        try {
            double double8 = resizableDoubleArray1.getElement((int) (short) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Elements cannot be retrieved from a negative array index");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 2.5f + "'", float2 == 2.5f);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + float4 + "' != '" + 2.0f + "'", float4 == 2.0f);
        org.junit.Assert.assertNotNull(doubleArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray6), "[0.0]");
    }

    @Test
    public void test0387() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0387");
        org.apache.commons.math.util.ResizableDoubleArray resizableDoubleArray0 = new org.apache.commons.math.util.ResizableDoubleArray();
        double double2 = resizableDoubleArray0.addElementRolling((double) ' ');
        resizableDoubleArray0.setElement((int) '#', (double) (short) 0);
        resizableDoubleArray0.setNumElements((int) (byte) 100);
        float float8 = resizableDoubleArray0.getExpansionFactor();
        double[] doubleArray9 = resizableDoubleArray0.getValues();
        resizableDoubleArray0.contract();
        double[] doubleArray11 = resizableDoubleArray0.getValues();
        // The following exception was thrown during execution in test generation
        try {
            resizableDoubleArray0.setNumElements((int) (byte) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Number of elements must be zero or a positive integer");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.0d + "'", double2 == 0.0d);
        org.junit.Assert.assertTrue("'" + float8 + "' != '" + 2.0f + "'", float8 == 2.0f);
        org.junit.Assert.assertNotNull(doubleArray9);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray9), "[0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0]");
        org.junit.Assert.assertNotNull(doubleArray11);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray11), "[0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0]");
    }

    @Test
    public void test0388() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0388");
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math.util.ResizableDoubleArray resizableDoubleArray3 = new org.apache.commons.math.util.ResizableDoubleArray(0, (-1.0f), (float) 'a');
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The expansion factor must be a number greater than 1.0");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void test0389() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0389");
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math.util.ResizableDoubleArray resizableDoubleArray3 = new org.apache.commons.math.util.ResizableDoubleArray(68, (float) 100L, (float) (byte) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Contraction criteria can never be smaller than the expansion factor.  This would lead to a never ending loop of expansion and contraction as a newly expanded internal storage array would immediately satisfy the criteria for contraction");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void test0390() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0390");
        org.apache.commons.math.util.ResizableDoubleArray resizableDoubleArray1 = new org.apache.commons.math.util.ResizableDoubleArray((int) 'a');
        // The following exception was thrown during execution in test generation
        try {
            resizableDoubleArray1.setContractionCriteria((float) 1L);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Contraction criteria can never be smaller than the expansion factor.  This would lead to a never ending loop of expansion and contraction as a newly expanded internal storage array would immediately satisfy the criteria for contraction");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void test0391() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0391");
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math.util.ResizableDoubleArray resizableDoubleArray3 = new org.apache.commons.math.util.ResizableDoubleArray(10, (float) 102, 36.5f);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Contraction criteria can never be smaller than the expansion factor.  This would lead to a never ending loop of expansion and contraction as a newly expanded internal storage array would immediately satisfy the criteria for contraction");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void test0392() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0392");
        org.apache.commons.math.util.ResizableDoubleArray resizableDoubleArray0 = new org.apache.commons.math.util.ResizableDoubleArray();
        double[] doubleArray1 = resizableDoubleArray0.getValues();
        float float2 = resizableDoubleArray0.getExpansionFactor();
        float float3 = resizableDoubleArray0.getExpansionFactor();
        double double5 = resizableDoubleArray0.addElementRolling(0.0d);
        int int6 = resizableDoubleArray0.getNumElements();
        resizableDoubleArray0.addElement(10.0d);
        resizableDoubleArray0.setExpansionMode(1);
        java.lang.Class<?> wildcardClass11 = resizableDoubleArray0.getClass();
        org.junit.Assert.assertNotNull(doubleArray1);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray1), "[0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0]");
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 2.0f + "'", float2 == 2.0f);
        org.junit.Assert.assertTrue("'" + float3 + "' != '" + 2.0f + "'", float3 == 2.0f);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test0393() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0393");
        org.apache.commons.math.util.ResizableDoubleArray resizableDoubleArray0 = new org.apache.commons.math.util.ResizableDoubleArray();
        double[] doubleArray1 = resizableDoubleArray0.getElements();
        resizableDoubleArray0.addElement((double) (short) -1);
        int int4 = resizableDoubleArray0.start();
        // The following exception was thrown during execution in test generation
        try {
            double double6 = resizableDoubleArray0.getElement(100);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: The index specified: 100 is larger than the current number of elements");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(doubleArray1);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray1), "[]");
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
    }

    @Test
    public void test0394() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0394");
        org.apache.commons.math.util.ResizableDoubleArray resizableDoubleArray2 = new org.apache.commons.math.util.ResizableDoubleArray((int) (byte) 1, (float) 36);
        int int3 = resizableDoubleArray2.getNumElements();
        // The following exception was thrown during execution in test generation
        try {
            resizableDoubleArray2.setExpansionMode(4);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Illegal expansionMode setting.");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
    }

    @Test
    public void test0395() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0395");
        org.apache.commons.math.util.ResizableDoubleArray resizableDoubleArray0 = new org.apache.commons.math.util.ResizableDoubleArray();
        float float1 = resizableDoubleArray0.getExpansionFactor();
        double[] doubleArray2 = resizableDoubleArray0.getValues();
        resizableDoubleArray0.clear();
        resizableDoubleArray0.addElement((double) (-1));
        resizableDoubleArray0.addElement((double) '#');
        double double9 = resizableDoubleArray0.getElement(0);
        resizableDoubleArray0.setContractionCriteria((float) 36);
        resizableDoubleArray0.setExpansionMode(1);
        java.lang.Class<?> wildcardClass14 = resizableDoubleArray0.getClass();
        org.junit.Assert.assertTrue("'" + float1 + "' != '" + 2.0f + "'", float1 == 2.0f);
        org.junit.Assert.assertNotNull(doubleArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray2), "[0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0]");
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + (-1.0d) + "'", double9 == (-1.0d));
        org.junit.Assert.assertNotNull(wildcardClass14);
    }

    @Test
    public void test0396() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0396");
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math.util.ResizableDoubleArray resizableDoubleArray1 = new org.apache.commons.math.util.ResizableDoubleArray((int) (short) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The initial capacity supplied: 0must be a positive integer");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void test0397() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0397");
        org.apache.commons.math.util.ResizableDoubleArray resizableDoubleArray0 = new org.apache.commons.math.util.ResizableDoubleArray();
        double double2 = resizableDoubleArray0.addElementRolling((double) ' ');
        float float3 = resizableDoubleArray0.getExpansionFactor();
        resizableDoubleArray0.setNumElements((int) '#');
        double[] doubleArray6 = resizableDoubleArray0.getValues();
        int int7 = resizableDoubleArray0.start();
        int int8 = resizableDoubleArray0.start();
        double double10 = resizableDoubleArray0.addElementRolling((double) 0L);
        resizableDoubleArray0.addElement((double) 100.5f);
        // The following exception was thrown during execution in test generation
        try {
            double double14 = resizableDoubleArray0.getElement((int) (byte) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Elements cannot be retrieved from a negative array index");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.0d + "'", double2 == 0.0d);
        org.junit.Assert.assertTrue("'" + float3 + "' != '" + 2.0f + "'", float3 == 2.0f);
        org.junit.Assert.assertNotNull(doubleArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray6), "[0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0]");
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 0.0d + "'", double10 == 0.0d);
    }

    @Test
    public void test0398() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0398");
        org.apache.commons.math.util.ResizableDoubleArray resizableDoubleArray0 = new org.apache.commons.math.util.ResizableDoubleArray();
        double double2 = resizableDoubleArray0.addElementRolling((double) ' ');
        resizableDoubleArray0.setElement((int) '#', (double) (short) 0);
        resizableDoubleArray0.setNumElements((int) (byte) 100);
        int int8 = resizableDoubleArray0.start();
        resizableDoubleArray0.addElement((double) '#');
        resizableDoubleArray0.discardFrontElements(1);
        resizableDoubleArray0.setContractionCriteria(2.0f);
        float float15 = resizableDoubleArray0.getContractionCriteria();
        double[] doubleArray16 = resizableDoubleArray0.getValues();
        double[] doubleArray17 = resizableDoubleArray0.getValues();
        resizableDoubleArray0.contract();
        // The following exception was thrown during execution in test generation
        try {
            resizableDoubleArray0.setExpansionMode(11);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Illegal expansionMode setting.");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.0d + "'", double2 == 0.0d);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + float15 + "' != '" + 2.0f + "'", float15 == 2.0f);
        org.junit.Assert.assertNotNull(doubleArray16);
        org.junit.Assert.assertNotNull(doubleArray17);
    }

    @Test
    public void test0399() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0399");
        org.apache.commons.math.util.ResizableDoubleArray resizableDoubleArray0 = new org.apache.commons.math.util.ResizableDoubleArray();
        double double2 = resizableDoubleArray0.addElementRolling((double) ' ');
        resizableDoubleArray0.setElement((int) '#', (double) (short) 0);
        resizableDoubleArray0.setNumElements((int) (byte) 100);
        resizableDoubleArray0.contract();
        int int9 = resizableDoubleArray0.getNumElements();
        resizableDoubleArray0.setContractionCriteria((float) 102);
        int int12 = resizableDoubleArray0.start();
        java.lang.Class<?> wildcardClass13 = resizableDoubleArray0.getClass();
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.0d + "'", double2 == 0.0d);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 100 + "'", int9 == 100);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test0400() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0400");
        org.apache.commons.math.util.ResizableDoubleArray resizableDoubleArray0 = new org.apache.commons.math.util.ResizableDoubleArray();
        float float1 = resizableDoubleArray0.getExpansionFactor();
        int int2 = resizableDoubleArray0.getNumElements();
        double double4 = resizableDoubleArray0.addElementRolling((double) 2.0f);
        double[] doubleArray5 = resizableDoubleArray0.getElements();
        // The following exception was thrown during execution in test generation
        try {
            resizableDoubleArray0.discardFrontElements((int) (short) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Cannot discard more elements than arecontained in this array.");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + float1 + "' != '" + 2.0f + "'", float1 == 2.0f);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 0.0d + "'", double4 == 0.0d);
        org.junit.Assert.assertNotNull(doubleArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray5), "[]");
    }

    @Test
    public void test0401() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0401");
        org.apache.commons.math.util.ResizableDoubleArray resizableDoubleArray0 = new org.apache.commons.math.util.ResizableDoubleArray();
        float float1 = resizableDoubleArray0.getExpansionFactor();
        resizableDoubleArray0.setNumElements((int) (byte) 100);
        double double5 = resizableDoubleArray0.addElementRolling(0.0d);
        int int6 = resizableDoubleArray0.start();
        resizableDoubleArray0.setNumElements((int) (byte) 100);
        // The following exception was thrown during execution in test generation
        try {
            double double10 = resizableDoubleArray0.getElement(102);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: The index specified: 102 is larger than the current number of elements");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + float1 + "' != '" + 2.0f + "'", float1 == 2.0f);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
    }

    @Test
    public void test0402() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0402");
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math.util.ResizableDoubleArray resizableDoubleArray3 = new org.apache.commons.math.util.ResizableDoubleArray((int) (byte) -1, 100.0f, 100.5f);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The initial capacity supplied: -1must be a positive integer");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void test0403() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0403");
        org.apache.commons.math.util.ResizableDoubleArray resizableDoubleArray1 = new org.apache.commons.math.util.ResizableDoubleArray((int) (byte) 100);
        java.lang.Class<?> wildcardClass2 = resizableDoubleArray1.getClass();
        org.junit.Assert.assertNotNull(wildcardClass2);
    }

    @Test
    public void test0404() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0404");
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math.util.ResizableDoubleArray resizableDoubleArray3 = new org.apache.commons.math.util.ResizableDoubleArray(35, (float) 102, 2.0f);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Contraction criteria can never be smaller than the expansion factor.  This would lead to a never ending loop of expansion and contraction as a newly expanded internal storage array would immediately satisfy the criteria for contraction");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void test0405() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0405");
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math.util.ResizableDoubleArray resizableDoubleArray2 = new org.apache.commons.math.util.ResizableDoubleArray((int) (short) 0, (float) (byte) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The initial capacity supplied: 0must be a positive integer");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void test0406() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0406");
        org.apache.commons.math.util.ResizableDoubleArray resizableDoubleArray0 = new org.apache.commons.math.util.ResizableDoubleArray();
        double double2 = resizableDoubleArray0.addElementRolling((double) ' ');
        resizableDoubleArray0.setElement((int) '#', (double) (short) 0);
        resizableDoubleArray0.setNumElements((int) (byte) 100);
        resizableDoubleArray0.contract();
        int int9 = resizableDoubleArray0.getNumElements();
        double[] doubleArray10 = resizableDoubleArray0.getValues();
        int int11 = resizableDoubleArray0.getNumElements();
        // The following exception was thrown during execution in test generation
        try {
            resizableDoubleArray0.setExpansionMode((int) (short) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Illegal expansionMode setting.");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.0d + "'", double2 == 0.0d);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 100 + "'", int9 == 100);
        org.junit.Assert.assertNotNull(doubleArray10);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray10), "[0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0]");
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 100 + "'", int11 == 100);
    }

    @Test
    public void test0407() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0407");
        org.apache.commons.math.util.ResizableDoubleArray resizableDoubleArray0 = new org.apache.commons.math.util.ResizableDoubleArray();
        float float1 = resizableDoubleArray0.getExpansionFactor();
        double[] doubleArray2 = resizableDoubleArray0.getValues();
        double[] doubleArray3 = resizableDoubleArray0.getValues();
        float float4 = resizableDoubleArray0.getExpansionFactor();
        // The following exception was thrown during execution in test generation
        try {
            resizableDoubleArray0.discardFrontElements((int) 'a');
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Cannot discard more elements than arecontained in this array.");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + float1 + "' != '" + 2.0f + "'", float1 == 2.0f);
        org.junit.Assert.assertNotNull(doubleArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray2), "[0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0]");
        org.junit.Assert.assertNotNull(doubleArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray3), "[0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0]");
        org.junit.Assert.assertTrue("'" + float4 + "' != '" + 2.0f + "'", float4 == 2.0f);
    }

    @Test
    public void test0408() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0408");
        org.apache.commons.math.util.ResizableDoubleArray resizableDoubleArray2 = new org.apache.commons.math.util.ResizableDoubleArray(35, 10.0f);
    }

    @Test
    public void test0409() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0409");
        org.apache.commons.math.util.ResizableDoubleArray resizableDoubleArray0 = new org.apache.commons.math.util.ResizableDoubleArray();
        double[] doubleArray1 = resizableDoubleArray0.getElements();
        resizableDoubleArray0.addElement((double) (short) -1);
        float float4 = resizableDoubleArray0.getExpansionFactor();
        resizableDoubleArray0.setElement((int) (byte) 100, (double) (short) 100);
        resizableDoubleArray0.addElement(0.0d);
        double double11 = resizableDoubleArray0.getElement((int) '4');
        resizableDoubleArray0.setExpansionMode((int) (byte) 1);
        double double15 = resizableDoubleArray0.getElement(1);
        float float16 = resizableDoubleArray0.getContractionCriteria();
        resizableDoubleArray0.setElement(0, (double) 101);
        org.junit.Assert.assertNotNull(doubleArray1);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray1), "[]");
        org.junit.Assert.assertTrue("'" + float4 + "' != '" + 2.0f + "'", float4 == 2.0f);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 0.0d + "'", double11 == 0.0d);
        org.junit.Assert.assertTrue("'" + double15 + "' != '" + 0.0d + "'", double15 == 0.0d);
        org.junit.Assert.assertTrue("'" + float16 + "' != '" + 2.5f + "'", float16 == 2.5f);
    }

    @Test
    public void test0410() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0410");
        org.apache.commons.math.util.ResizableDoubleArray resizableDoubleArray2 = new org.apache.commons.math.util.ResizableDoubleArray((int) (short) 1, 10.0f);
        resizableDoubleArray2.setExpansionMode(1);
        resizableDoubleArray2.clear();
        int int6 = resizableDoubleArray2.getNumElements();
        // The following exception was thrown during execution in test generation
        try {
            resizableDoubleArray2.setExpansionFactor((float) 35);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Contraction criteria can never be smaller than the expansion factor.  This would lead to a never ending loop of expansion and contraction as a newly expanded internal storage array would immediately satisfy the criteria for contraction");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
    }

    @Test
    public void test0411() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0411");
        org.apache.commons.math.util.ResizableDoubleArray resizableDoubleArray0 = new org.apache.commons.math.util.ResizableDoubleArray();
        double double2 = resizableDoubleArray0.addElementRolling((double) ' ');
        resizableDoubleArray0.setElement((int) '#', (double) (short) 0);
        resizableDoubleArray0.setNumElements((int) (byte) 100);
        int int8 = resizableDoubleArray0.start();
        resizableDoubleArray0.addElement((double) '#');
        resizableDoubleArray0.discardFrontElements(1);
        resizableDoubleArray0.setContractionCriteria(2.0f);
        float float15 = resizableDoubleArray0.getContractionCriteria();
        java.lang.Class<?> wildcardClass16 = resizableDoubleArray0.getClass();
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.0d + "'", double2 == 0.0d);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + float15 + "' != '" + 2.0f + "'", float15 == 2.0f);
        org.junit.Assert.assertNotNull(wildcardClass16);
    }

    @Test
    public void test0412() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0412");
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math.util.ResizableDoubleArray resizableDoubleArray4 = new org.apache.commons.math.util.ResizableDoubleArray((int) 'a', (float) (byte) 10, (float) 10L, 4);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Illegal expansionMode setting.");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void test0413() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0413");
        org.apache.commons.math.util.ResizableDoubleArray resizableDoubleArray0 = new org.apache.commons.math.util.ResizableDoubleArray();
        float float1 = resizableDoubleArray0.getExpansionFactor();
        resizableDoubleArray0.setElement((int) (short) 1, (double) 0.0f);
        resizableDoubleArray0.setExpansionFactor(2.5f);
        resizableDoubleArray0.contract();
        org.junit.Assert.assertTrue("'" + float1 + "' != '" + 2.0f + "'", float1 == 2.0f);
    }

    @Test
    public void test0414() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0414");
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math.util.ResizableDoubleArray resizableDoubleArray1 = new org.apache.commons.math.util.ResizableDoubleArray((int) (byte) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The initial capacity supplied: -1must be a positive integer");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void test0415() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0415");
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math.util.ResizableDoubleArray resizableDoubleArray3 = new org.apache.commons.math.util.ResizableDoubleArray(101, (float) 'a', 0.0f);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Contraction criteria can never be smaller than the expansion factor.  This would lead to a never ending loop of expansion and contraction as a newly expanded internal storage array would immediately satisfy the criteria for contraction");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void test0416() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0416");
        org.apache.commons.math.util.ResizableDoubleArray resizableDoubleArray2 = new org.apache.commons.math.util.ResizableDoubleArray((int) '4', (float) (short) 100);
        double[] doubleArray3 = resizableDoubleArray2.getValues();
        // The following exception was thrown during execution in test generation
        try {
            resizableDoubleArray2.discardFrontElements(68);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Cannot discard more elements than arecontained in this array.");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(doubleArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray3), "[0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0]");
    }

    @Test
    public void test0417() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0417");
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math.util.ResizableDoubleArray resizableDoubleArray2 = new org.apache.commons.math.util.ResizableDoubleArray(101, (float) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The expansion factor must be a number greater than 1.0");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void test0418() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0418");
        org.apache.commons.math.util.ResizableDoubleArray resizableDoubleArray0 = new org.apache.commons.math.util.ResizableDoubleArray();
        double double2 = resizableDoubleArray0.addElementRolling((double) ' ');
        resizableDoubleArray0.setElement((int) '#', (double) (short) 0);
        resizableDoubleArray0.setNumElements((int) (byte) 100);
        float float8 = resizableDoubleArray0.getExpansionFactor();
        resizableDoubleArray0.setContractionCriteria(100.5f);
        double double12 = resizableDoubleArray0.addElementRolling(10.0d);
        float float13 = resizableDoubleArray0.getExpansionFactor();
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.0d + "'", double2 == 0.0d);
        org.junit.Assert.assertTrue("'" + float8 + "' != '" + 2.0f + "'", float8 == 2.0f);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 0.0d + "'", double12 == 0.0d);
        org.junit.Assert.assertTrue("'" + float13 + "' != '" + 2.0f + "'", float13 == 2.0f);
    }

    @Test
    public void test0419() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0419");
        org.apache.commons.math.util.ResizableDoubleArray resizableDoubleArray1 = new org.apache.commons.math.util.ResizableDoubleArray((int) 'a');
        float float2 = resizableDoubleArray1.getContractionCriteria();
        int int3 = resizableDoubleArray1.getExpansionMode();
        float float4 = resizableDoubleArray1.getExpansionFactor();
        resizableDoubleArray1.contract();
        // The following exception was thrown during execution in test generation
        try {
            resizableDoubleArray1.setExpansionFactor(0.0f);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The expansion factor must be a number greater than 1.0");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 2.5f + "'", float2 == 2.5f);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + float4 + "' != '" + 2.0f + "'", float4 == 2.0f);
    }

    @Test
    public void test0420() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0420");
        org.apache.commons.math.util.ResizableDoubleArray resizableDoubleArray0 = new org.apache.commons.math.util.ResizableDoubleArray();
        double[] doubleArray1 = resizableDoubleArray0.getElements();
        resizableDoubleArray0.addElement((double) (short) -1);
        double[] doubleArray4 = resizableDoubleArray0.getElements();
        int int5 = resizableDoubleArray0.getExpansionMode();
        int int6 = resizableDoubleArray0.getNumElements();
        resizableDoubleArray0.setContractionCriteria(2.5f);
        org.junit.Assert.assertNotNull(doubleArray1);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray1), "[]");
        org.junit.Assert.assertNotNull(doubleArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray4), "[-1.0]");
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
    }

    @Test
    public void test0421() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0421");
        org.apache.commons.math.util.ResizableDoubleArray resizableDoubleArray0 = new org.apache.commons.math.util.ResizableDoubleArray();
        double double2 = resizableDoubleArray0.addElementRolling((double) ' ');
        int int3 = resizableDoubleArray0.getExpansionMode();
        // The following exception was thrown during execution in test generation
        try {
            double double5 = resizableDoubleArray0.getElement((int) (short) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: The index specified: 0 is larger than the current number of elements");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.0d + "'", double2 == 0.0d);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
    }

    @Test
    public void test0422() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0422");
        org.apache.commons.math.util.ResizableDoubleArray resizableDoubleArray0 = new org.apache.commons.math.util.ResizableDoubleArray();
        float float1 = resizableDoubleArray0.getExpansionFactor();
        resizableDoubleArray0.setNumElements((int) (byte) 100);
        double double5 = resizableDoubleArray0.addElementRolling(0.0d);
        // The following exception was thrown during execution in test generation
        try {
            resizableDoubleArray0.setExpansionMode(99);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Illegal expansionMode setting.");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + float1 + "' != '" + 2.0f + "'", float1 == 2.0f);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
    }

    @Test
    public void test0423() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0423");
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math.util.ResizableDoubleArray resizableDoubleArray4 = new org.apache.commons.math.util.ResizableDoubleArray(100, (float) 102, 1.0f, 4);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Contraction criteria can never be smaller than the expansion factor.  This would lead to a never ending loop of expansion and contraction as a newly expanded internal storage array would immediately satisfy the criteria for contraction");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void test0424() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0424");
        org.apache.commons.math.util.ResizableDoubleArray resizableDoubleArray0 = new org.apache.commons.math.util.ResizableDoubleArray();
        double double2 = resizableDoubleArray0.addElementRolling((double) ' ');
        resizableDoubleArray0.setElement((int) '#', (double) (short) 0);
        resizableDoubleArray0.setNumElements((int) (byte) 100);
        int int8 = resizableDoubleArray0.start();
        resizableDoubleArray0.addElement((double) '#');
        resizableDoubleArray0.discardFrontElements(1);
        resizableDoubleArray0.setContractionCriteria(2.0f);
        float float15 = resizableDoubleArray0.getContractionCriteria();
        double[] doubleArray16 = resizableDoubleArray0.getValues();
        double[] doubleArray17 = resizableDoubleArray0.getValues();
        // The following exception was thrown during execution in test generation
        try {
            double double19 = resizableDoubleArray0.getElement((int) (byte) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: The index specified: 100 is larger than the current number of elements");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.0d + "'", double2 == 0.0d);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + float15 + "' != '" + 2.0f + "'", float15 == 2.0f);
        org.junit.Assert.assertNotNull(doubleArray16);
        org.junit.Assert.assertNotNull(doubleArray17);
    }

    @Test
    public void test0425() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0425");
        org.apache.commons.math.util.ResizableDoubleArray resizableDoubleArray0 = new org.apache.commons.math.util.ResizableDoubleArray();
        double double2 = resizableDoubleArray0.addElementRolling((double) ' ');
        resizableDoubleArray0.setElement((int) '#', (double) (short) 0);
        resizableDoubleArray0.setNumElements((int) (byte) 100);
        int int8 = resizableDoubleArray0.start();
        double[] doubleArray9 = resizableDoubleArray0.getValues();
        resizableDoubleArray0.discardFrontElements((int) (short) 1);
        double double13 = resizableDoubleArray0.getElement(35);
        int int14 = resizableDoubleArray0.getNumElements();
        resizableDoubleArray0.setContractionCriteria((float) 36);
        int int17 = resizableDoubleArray0.getNumElements();
        resizableDoubleArray0.discardFrontElements(97);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.0d + "'", double2 == 0.0d);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertNotNull(doubleArray9);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray9), "[0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0]");
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 0.0d + "'", double13 == 0.0d);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 99 + "'", int14 == 99);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 99 + "'", int17 == 99);
    }

    @Test
    public void test0426() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0426");
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math.util.ResizableDoubleArray resizableDoubleArray3 = new org.apache.commons.math.util.ResizableDoubleArray((int) (byte) 0, (float) 4, (float) 'a');
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The initial capacity supplied: 0must be a positive integer");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void test0427() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0427");
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math.util.ResizableDoubleArray resizableDoubleArray4 = new org.apache.commons.math.util.ResizableDoubleArray((int) 'a', 10.0f, (float) ' ', (-1));
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Illegal expansionMode setting.");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void test0428() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0428");
        org.apache.commons.math.util.ResizableDoubleArray resizableDoubleArray0 = new org.apache.commons.math.util.ResizableDoubleArray();
        double[] doubleArray1 = resizableDoubleArray0.getElements();
        resizableDoubleArray0.addElement((double) (short) -1);
        java.lang.Class<?> wildcardClass4 = resizableDoubleArray0.getClass();
        org.junit.Assert.assertNotNull(doubleArray1);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray1), "[]");
        org.junit.Assert.assertNotNull(wildcardClass4);
    }

    @Test
    public void test0429() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0429");
        org.apache.commons.math.util.ResizableDoubleArray resizableDoubleArray0 = new org.apache.commons.math.util.ResizableDoubleArray();
        double[] doubleArray1 = resizableDoubleArray0.getValues();
        float float2 = resizableDoubleArray0.getExpansionFactor();
        double[] doubleArray3 = resizableDoubleArray0.getElements();
        resizableDoubleArray0.clear();
        int int5 = resizableDoubleArray0.getExpansionMode();
        resizableDoubleArray0.setNumElements((int) (short) 100);
        double[] doubleArray8 = resizableDoubleArray0.getElements();
        resizableDoubleArray0.setElement((int) '4', (double) (-1L));
        float float12 = resizableDoubleArray0.getContractionCriteria();
        double double14 = resizableDoubleArray0.addElementRolling((double) 4);
        org.junit.Assert.assertNotNull(doubleArray1);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray1), "[0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0]");
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 2.0f + "'", float2 == 2.0f);
        org.junit.Assert.assertNotNull(doubleArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray3), "[]");
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertNotNull(doubleArray8);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray8), "[0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0]");
        org.junit.Assert.assertTrue("'" + float12 + "' != '" + 2.5f + "'", float12 == 2.5f);
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + 0.0d + "'", double14 == 0.0d);
    }

    @Test
    public void test0430() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0430");
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math.util.ResizableDoubleArray resizableDoubleArray4 = new org.apache.commons.math.util.ResizableDoubleArray((int) (short) 0, 0.0f, (float) 1L, 11);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The expansion factor must be a number greater than 1.0");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void test0431() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0431");
        org.apache.commons.math.util.ResizableDoubleArray resizableDoubleArray0 = new org.apache.commons.math.util.ResizableDoubleArray();
        float float1 = resizableDoubleArray0.getExpansionFactor();
        int int2 = resizableDoubleArray0.getNumElements();
        resizableDoubleArray0.addElement((double) '#');
        double[] doubleArray5 = resizableDoubleArray0.getElements();
        resizableDoubleArray0.addElement(35.0d);
        org.junit.Assert.assertTrue("'" + float1 + "' != '" + 2.0f + "'", float1 == 2.0f);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertNotNull(doubleArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray5), "[35.0]");
    }

    @Test
    public void test0432() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0432");
        org.apache.commons.math.util.ResizableDoubleArray resizableDoubleArray0 = new org.apache.commons.math.util.ResizableDoubleArray();
        double double2 = resizableDoubleArray0.addElementRolling((double) ' ');
        resizableDoubleArray0.setElement((int) '#', (double) (short) 0);
        resizableDoubleArray0.setNumElements((int) (byte) 100);
        int int8 = resizableDoubleArray0.start();
        resizableDoubleArray0.addElement((double) '#');
        resizableDoubleArray0.discardFrontElements(1);
        resizableDoubleArray0.setContractionCriteria(2.0f);
        float float15 = resizableDoubleArray0.getContractionCriteria();
        double[] doubleArray16 = resizableDoubleArray0.getValues();
        double[] doubleArray17 = resizableDoubleArray0.getValues();
        int int18 = resizableDoubleArray0.start();
        double double20 = resizableDoubleArray0.addElementRolling((double) '#');
        // The following exception was thrown during execution in test generation
        try {
            resizableDoubleArray0.setExpansionMode(97);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Illegal expansionMode setting.");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.0d + "'", double2 == 0.0d);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + float15 + "' != '" + 2.0f + "'", float15 == 2.0f);
        org.junit.Assert.assertNotNull(doubleArray16);
        org.junit.Assert.assertNotNull(doubleArray17);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 1 + "'", int18 == 1);
        org.junit.Assert.assertTrue("'" + double20 + "' != '" + 0.0d + "'", double20 == 0.0d);
    }

    @Test
    public void test0433() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0433");
        org.apache.commons.math.util.ResizableDoubleArray resizableDoubleArray0 = new org.apache.commons.math.util.ResizableDoubleArray();
        double[] doubleArray1 = resizableDoubleArray0.getValues();
        float float2 = resizableDoubleArray0.getExpansionFactor();
        double[] doubleArray3 = resizableDoubleArray0.getElements();
        resizableDoubleArray0.clear();
        int int5 = resizableDoubleArray0.start();
        // The following exception was thrown during execution in test generation
        try {
            resizableDoubleArray0.discardFrontElements((int) (short) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Cannot discard a negative number of elements.");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(doubleArray1);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray1), "[0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0]");
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 2.0f + "'", float2 == 2.0f);
        org.junit.Assert.assertNotNull(doubleArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray3), "[]");
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
    }

    @Test
    public void test0434() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0434");
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math.util.ResizableDoubleArray resizableDoubleArray3 = new org.apache.commons.math.util.ResizableDoubleArray((int) (short) 1, (float) (-1L), (float) (short) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The expansion factor must be a number greater than 1.0");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void test0435() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0435");
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math.util.ResizableDoubleArray resizableDoubleArray2 = new org.apache.commons.math.util.ResizableDoubleArray((int) (byte) -1, (float) 100L);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The initial capacity supplied: -1must be a positive integer");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void test0436() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0436");
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math.util.ResizableDoubleArray resizableDoubleArray4 = new org.apache.commons.math.util.ResizableDoubleArray((int) (short) -1, (float) 1, (float) (short) 10, (int) (byte) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The expansion factor must be a number greater than 1.0");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void test0437() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0437");
        org.apache.commons.math.util.ResizableDoubleArray resizableDoubleArray0 = new org.apache.commons.math.util.ResizableDoubleArray();
        float float1 = resizableDoubleArray0.getExpansionFactor();
        int int2 = resizableDoubleArray0.getNumElements();
        float float3 = resizableDoubleArray0.getExpansionFactor();
        int int4 = resizableDoubleArray0.getExpansionMode();
        resizableDoubleArray0.addElement((double) 2.0f);
        int int7 = resizableDoubleArray0.start();
        resizableDoubleArray0.addElement((double) (short) 10);
        org.junit.Assert.assertTrue("'" + float1 + "' != '" + 2.0f + "'", float1 == 2.0f);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + float3 + "' != '" + 2.0f + "'", float3 == 2.0f);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
    }

    @Test
    public void test0438() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0438");
        org.apache.commons.math.util.ResizableDoubleArray resizableDoubleArray0 = new org.apache.commons.math.util.ResizableDoubleArray();
        double double2 = resizableDoubleArray0.addElementRolling((double) ' ');
        float float3 = resizableDoubleArray0.getExpansionFactor();
        float float4 = resizableDoubleArray0.getExpansionFactor();
        resizableDoubleArray0.addElement((double) (short) -1);
        int int7 = resizableDoubleArray0.start();
        int int8 = resizableDoubleArray0.start();
        double[] doubleArray9 = resizableDoubleArray0.getValues();
        int int10 = resizableDoubleArray0.getNumElements();
        // The following exception was thrown during execution in test generation
        try {
            double double12 = resizableDoubleArray0.getElement((-1));
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Elements cannot be retrieved from a negative array index");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.0d + "'", double2 == 0.0d);
        org.junit.Assert.assertTrue("'" + float3 + "' != '" + 2.0f + "'", float3 == 2.0f);
        org.junit.Assert.assertTrue("'" + float4 + "' != '" + 2.0f + "'", float4 == 2.0f);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertNotNull(doubleArray9);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray9), "[-1.0]");
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 1 + "'", int10 == 1);
    }

    @Test
    public void test0439() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0439");
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math.util.ResizableDoubleArray resizableDoubleArray3 = new org.apache.commons.math.util.ResizableDoubleArray(4, (float) (short) -1, (float) 68);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The expansion factor must be a number greater than 1.0");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void test0440() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0440");
        org.apache.commons.math.util.ResizableDoubleArray resizableDoubleArray0 = new org.apache.commons.math.util.ResizableDoubleArray();
        float float1 = resizableDoubleArray0.getExpansionFactor();
        int int2 = resizableDoubleArray0.getNumElements();
        resizableDoubleArray0.addElement((double) '#');
        int int5 = resizableDoubleArray0.start();
        // The following exception was thrown during execution in test generation
        try {
            resizableDoubleArray0.setExpansionMode((int) (short) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Illegal expansionMode setting.");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + float1 + "' != '" + 2.0f + "'", float1 == 2.0f);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
    }

    @Test
    public void test0441() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0441");
        org.apache.commons.math.util.ResizableDoubleArray resizableDoubleArray1 = new org.apache.commons.math.util.ResizableDoubleArray((int) 'a');
        float float2 = resizableDoubleArray1.getContractionCriteria();
        int int3 = resizableDoubleArray1.getExpansionMode();
        float float4 = resizableDoubleArray1.getExpansionFactor();
        resizableDoubleArray1.contract();
        float float6 = resizableDoubleArray1.getExpansionFactor();
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 2.5f + "'", float2 == 2.5f);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + float4 + "' != '" + 2.0f + "'", float4 == 2.0f);
        org.junit.Assert.assertTrue("'" + float6 + "' != '" + 2.0f + "'", float6 == 2.0f);
    }

    @Test
    public void test0442() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0442");
        org.apache.commons.math.util.ResizableDoubleArray resizableDoubleArray0 = new org.apache.commons.math.util.ResizableDoubleArray();
        float float1 = resizableDoubleArray0.getExpansionFactor();
        resizableDoubleArray0.setExpansionMode(1);
        resizableDoubleArray0.contract();
        resizableDoubleArray0.setElement(36, (double) 10L);
        // The following exception was thrown during execution in test generation
        try {
            resizableDoubleArray0.discardFrontElements((int) '4');
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Cannot discard more elements than arecontained in this array.");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + float1 + "' != '" + 2.0f + "'", float1 == 2.0f);
    }

    @Test
    public void test0443() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0443");
        org.apache.commons.math.util.ResizableDoubleArray resizableDoubleArray0 = new org.apache.commons.math.util.ResizableDoubleArray();
        double double2 = resizableDoubleArray0.addElementRolling((double) ' ');
        resizableDoubleArray0.setElement((int) '#', (double) (short) 0);
        resizableDoubleArray0.setNumElements((int) (byte) 100);
        resizableDoubleArray0.contract();
        int int9 = resizableDoubleArray0.start();
        resizableDoubleArray0.setExpansionMode((int) (short) 1);
        float float12 = resizableDoubleArray0.getContractionCriteria();
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.0d + "'", double2 == 0.0d);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + float12 + "' != '" + 2.5f + "'", float12 == 2.5f);
    }

    @Test
    public void test0444() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0444");
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math.util.ResizableDoubleArray resizableDoubleArray4 = new org.apache.commons.math.util.ResizableDoubleArray(0, (float) 1, (float) 35, (int) (byte) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The expansion factor must be a number greater than 1.0");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void test0445() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0445");
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math.util.ResizableDoubleArray resizableDoubleArray4 = new org.apache.commons.math.util.ResizableDoubleArray(0, 10.0f, (float) 1, (int) 'a');
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Contraction criteria can never be smaller than the expansion factor.  This would lead to a never ending loop of expansion and contraction as a newly expanded internal storage array would immediately satisfy the criteria for contraction");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void test0446() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0446");
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math.util.ResizableDoubleArray resizableDoubleArray3 = new org.apache.commons.math.util.ResizableDoubleArray((int) (byte) 10, (float) (-1L), (float) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The expansion factor must be a number greater than 1.0");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void test0447() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0447");
        org.apache.commons.math.util.ResizableDoubleArray resizableDoubleArray1 = new org.apache.commons.math.util.ResizableDoubleArray(35);
        java.lang.Class<?> wildcardClass2 = resizableDoubleArray1.getClass();
        org.junit.Assert.assertNotNull(wildcardClass2);
    }

    @Test
    public void test0448() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0448");
        org.apache.commons.math.util.ResizableDoubleArray resizableDoubleArray0 = new org.apache.commons.math.util.ResizableDoubleArray();
        float float1 = resizableDoubleArray0.getExpansionFactor();
        double[] doubleArray2 = resizableDoubleArray0.getValues();
        resizableDoubleArray0.clear();
        resizableDoubleArray0.addElement((double) (-1));
        resizableDoubleArray0.addElement((double) '#');
        double double9 = resizableDoubleArray0.getElement(0);
        int int10 = resizableDoubleArray0.getExpansionMode();
        // The following exception was thrown during execution in test generation
        try {
            resizableDoubleArray0.setContractionCriteria((float) (byte) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Contraction criteria can never be smaller than the expansion factor.  This would lead to a never ending loop of expansion and contraction as a newly expanded internal storage array would immediately satisfy the criteria for contraction");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + float1 + "' != '" + 2.0f + "'", float1 == 2.0f);
        org.junit.Assert.assertNotNull(doubleArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray2), "[0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0]");
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + (-1.0d) + "'", double9 == (-1.0d));
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
    }

    @Test
    public void test0449() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0449");
        org.apache.commons.math.util.ResizableDoubleArray resizableDoubleArray0 = new org.apache.commons.math.util.ResizableDoubleArray();
        float float1 = resizableDoubleArray0.getExpansionFactor();
        resizableDoubleArray0.setNumElements((int) (byte) 100);
        resizableDoubleArray0.contract();
        int int5 = resizableDoubleArray0.getExpansionMode();
        float float6 = resizableDoubleArray0.getContractionCriteria();
        double[] doubleArray7 = resizableDoubleArray0.getValues();
        org.junit.Assert.assertTrue("'" + float1 + "' != '" + 2.0f + "'", float1 == 2.0f);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + float6 + "' != '" + 2.5f + "'", float6 == 2.5f);
        org.junit.Assert.assertNotNull(doubleArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray7), "[0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0]");
    }

    @Test
    public void test0450() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0450");
        org.apache.commons.math.util.ResizableDoubleArray resizableDoubleArray2 = new org.apache.commons.math.util.ResizableDoubleArray((int) (byte) 1, (float) 36);
        resizableDoubleArray2.setNumElements(10);
        resizableDoubleArray2.setNumElements(11);
        resizableDoubleArray2.setExpansionFactor(10.5f);
    }

    @Test
    public void test0451() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0451");
        org.apache.commons.math.util.ResizableDoubleArray resizableDoubleArray2 = new org.apache.commons.math.util.ResizableDoubleArray((int) (short) 1, 10.0f);
        int int3 = resizableDoubleArray2.getExpansionMode();
        float float4 = resizableDoubleArray2.getExpansionFactor();
        // The following exception was thrown during execution in test generation
        try {
            resizableDoubleArray2.setExpansionMode((int) (short) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Illegal expansionMode setting.");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + float4 + "' != '" + 10.0f + "'", float4 == 10.0f);
    }

    @Test
    public void test0452() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0452");
        org.apache.commons.math.util.ResizableDoubleArray resizableDoubleArray0 = new org.apache.commons.math.util.ResizableDoubleArray();
        double double2 = resizableDoubleArray0.addElementRolling((double) ' ');
        resizableDoubleArray0.setElement((int) '#', (double) (short) 0);
        resizableDoubleArray0.setNumElements((int) (byte) 100);
        int int8 = resizableDoubleArray0.start();
        double[] doubleArray9 = resizableDoubleArray0.getValues();
        resizableDoubleArray0.discardFrontElements((int) (short) 1);
        double double13 = resizableDoubleArray0.getElement(35);
        int int14 = resizableDoubleArray0.getNumElements();
        resizableDoubleArray0.setContractionCriteria((float) 36);
        java.lang.Class<?> wildcardClass17 = resizableDoubleArray0.getClass();
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.0d + "'", double2 == 0.0d);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertNotNull(doubleArray9);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray9), "[0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0]");
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 0.0d + "'", double13 == 0.0d);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 99 + "'", int14 == 99);
        org.junit.Assert.assertNotNull(wildcardClass17);
    }

    @Test
    public void test0453() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0453");
        org.apache.commons.math.util.ResizableDoubleArray resizableDoubleArray1 = new org.apache.commons.math.util.ResizableDoubleArray((int) 'a');
        float float2 = resizableDoubleArray1.getContractionCriteria();
        int int3 = resizableDoubleArray1.getExpansionMode();
        float float4 = resizableDoubleArray1.getExpansionFactor();
        resizableDoubleArray1.contract();
        double[] doubleArray6 = resizableDoubleArray1.getValues();
        float float7 = resizableDoubleArray1.getExpansionFactor();
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 2.5f + "'", float2 == 2.5f);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + float4 + "' != '" + 2.0f + "'", float4 == 2.0f);
        org.junit.Assert.assertNotNull(doubleArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray6), "[0.0]");
        org.junit.Assert.assertTrue("'" + float7 + "' != '" + 2.0f + "'", float7 == 2.0f);
    }

    @Test
    public void test0454() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0454");
        org.apache.commons.math.util.ResizableDoubleArray resizableDoubleArray3 = new org.apache.commons.math.util.ResizableDoubleArray((int) '#', (float) (byte) 10, (float) '#');
        // The following exception was thrown during execution in test generation
        try {
            resizableDoubleArray3.setExpansionMode(10);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Illegal expansionMode setting.");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void test0455() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0455");
        org.apache.commons.math.util.ResizableDoubleArray resizableDoubleArray0 = new org.apache.commons.math.util.ResizableDoubleArray();
        float float1 = resizableDoubleArray0.getExpansionFactor();
        resizableDoubleArray0.addElement((double) 0.0f);
        resizableDoubleArray0.addElement((double) 100.0f);
        resizableDoubleArray0.addElement((double) 0);
        double double9 = resizableDoubleArray0.addElementRolling((double) 10L);
        float float10 = resizableDoubleArray0.getContractionCriteria();
        double double12 = resizableDoubleArray0.addElementRolling((double) 100.5f);
        int int13 = resizableDoubleArray0.start();
        org.junit.Assert.assertTrue("'" + float1 + "' != '" + 2.0f + "'", float1 == 2.0f);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 0.0d + "'", double9 == 0.0d);
        org.junit.Assert.assertTrue("'" + float10 + "' != '" + 2.5f + "'", float10 == 2.5f);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 100.0d + "'", double12 == 100.0d);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
    }

    @Test
    public void test0456() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0456");
        org.apache.commons.math.util.ResizableDoubleArray resizableDoubleArray0 = new org.apache.commons.math.util.ResizableDoubleArray();
        double double2 = resizableDoubleArray0.addElementRolling((double) ' ');
        resizableDoubleArray0.setElement((int) '#', (double) (short) 0);
        double[] doubleArray6 = resizableDoubleArray0.getValues();
        resizableDoubleArray0.setContractionCriteria((float) ' ');
        // The following exception was thrown during execution in test generation
        try {
            double double10 = resizableDoubleArray0.getElement((int) (short) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: The index specified: 100 is larger than the current number of elements");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.0d + "'", double2 == 0.0d);
        org.junit.Assert.assertNotNull(doubleArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray6), "[0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0]");
    }

    @Test
    public void test0457() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0457");
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math.util.ResizableDoubleArray resizableDoubleArray4 = new org.apache.commons.math.util.ResizableDoubleArray(0, 0.0f, 97.0f, (int) ' ');
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The expansion factor must be a number greater than 1.0");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void test0458() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0458");
        org.apache.commons.math.util.ResizableDoubleArray resizableDoubleArray1 = new org.apache.commons.math.util.ResizableDoubleArray((int) ' ');
        double double3 = resizableDoubleArray1.addElementRolling((double) 35);
        int int4 = resizableDoubleArray1.start();
        // The following exception was thrown during execution in test generation
        try {
            double double6 = resizableDoubleArray1.getElement((int) ' ');
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: The index specified: 32 is larger than the current number of elements");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 0.0d + "'", double3 == 0.0d);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
    }

    @Test
    public void test0459() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0459");
        org.apache.commons.math.util.ResizableDoubleArray resizableDoubleArray1 = new org.apache.commons.math.util.ResizableDoubleArray((int) '4');
        java.lang.Class<?> wildcardClass2 = resizableDoubleArray1.getClass();
        org.junit.Assert.assertNotNull(wildcardClass2);
    }

    @Test
    public void test0460() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0460");
        org.apache.commons.math.util.ResizableDoubleArray resizableDoubleArray0 = new org.apache.commons.math.util.ResizableDoubleArray();
        double[] doubleArray1 = resizableDoubleArray0.getValues();
        resizableDoubleArray0.setNumElements((int) '#');
        double double5 = resizableDoubleArray0.addElementRolling((double) 'a');
        float float6 = resizableDoubleArray0.getExpansionFactor();
        resizableDoubleArray0.setNumElements(35);
        org.junit.Assert.assertNotNull(doubleArray1);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray1), "[0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0]");
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
        org.junit.Assert.assertTrue("'" + float6 + "' != '" + 2.0f + "'", float6 == 2.0f);
    }

    @Test
    public void test0461() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0461");
        org.apache.commons.math.util.ResizableDoubleArray resizableDoubleArray1 = new org.apache.commons.math.util.ResizableDoubleArray((int) (byte) 100);
        int int2 = resizableDoubleArray1.getExpansionMode();
        resizableDoubleArray1.clear();
        resizableDoubleArray1.discardFrontElements(0);
        int int6 = resizableDoubleArray1.start();
        // The following exception was thrown during execution in test generation
        try {
            resizableDoubleArray1.setNumElements((int) (byte) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Number of elements must be zero or a positive integer");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
    }

    @Test
    public void test0462() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0462");
        org.apache.commons.math.util.ResizableDoubleArray resizableDoubleArray0 = new org.apache.commons.math.util.ResizableDoubleArray();
        double[] doubleArray1 = resizableDoubleArray0.getValues();
        float float2 = resizableDoubleArray0.getExpansionFactor();
        float float3 = resizableDoubleArray0.getExpansionFactor();
        double double5 = resizableDoubleArray0.addElementRolling(0.0d);
        int int6 = resizableDoubleArray0.getNumElements();
        resizableDoubleArray0.setContractionCriteria((float) '4');
        org.junit.Assert.assertNotNull(doubleArray1);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray1), "[0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0]");
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 2.0f + "'", float2 == 2.0f);
        org.junit.Assert.assertTrue("'" + float3 + "' != '" + 2.0f + "'", float3 == 2.0f);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
    }

    @Test
    public void test0463() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0463");
        org.apache.commons.math.util.ResizableDoubleArray resizableDoubleArray0 = new org.apache.commons.math.util.ResizableDoubleArray();
        double[] doubleArray1 = resizableDoubleArray0.getValues();
        float float2 = resizableDoubleArray0.getExpansionFactor();
        float float3 = resizableDoubleArray0.getExpansionFactor();
        double double5 = resizableDoubleArray0.addElementRolling(0.0d);
        int int6 = resizableDoubleArray0.getNumElements();
        int int7 = resizableDoubleArray0.start();
        resizableDoubleArray0.addElement((double) 10);
        // The following exception was thrown during execution in test generation
        try {
            resizableDoubleArray0.setExpansionMode((int) '#');
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Illegal expansionMode setting.");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(doubleArray1);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray1), "[0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0]");
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 2.0f + "'", float2 == 2.0f);
        org.junit.Assert.assertTrue("'" + float3 + "' != '" + 2.0f + "'", float3 == 2.0f);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
    }

    @Test
    public void test0464() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0464");
        org.apache.commons.math.util.ResizableDoubleArray resizableDoubleArray0 = new org.apache.commons.math.util.ResizableDoubleArray();
        float float1 = resizableDoubleArray0.getExpansionFactor();
        double[] doubleArray2 = resizableDoubleArray0.getValues();
        resizableDoubleArray0.clear();
        resizableDoubleArray0.setContractionCriteria((float) 'a');
        java.lang.Class<?> wildcardClass6 = resizableDoubleArray0.getClass();
        org.junit.Assert.assertTrue("'" + float1 + "' != '" + 2.0f + "'", float1 == 2.0f);
        org.junit.Assert.assertNotNull(doubleArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray2), "[0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0]");
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void test0465() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0465");
        org.apache.commons.math.util.ResizableDoubleArray resizableDoubleArray0 = new org.apache.commons.math.util.ResizableDoubleArray();
        float float1 = resizableDoubleArray0.getExpansionFactor();
        double[] doubleArray2 = resizableDoubleArray0.getValues();
        resizableDoubleArray0.clear();
        double[] doubleArray4 = resizableDoubleArray0.getElements();
        org.junit.Assert.assertTrue("'" + float1 + "' != '" + 2.0f + "'", float1 == 2.0f);
        org.junit.Assert.assertNotNull(doubleArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray2), "[0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0]");
        org.junit.Assert.assertNotNull(doubleArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray4), "[]");
    }

    @Test
    public void test0466() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0466");
        org.apache.commons.math.util.ResizableDoubleArray resizableDoubleArray0 = new org.apache.commons.math.util.ResizableDoubleArray();
        double double2 = resizableDoubleArray0.addElementRolling((double) ' ');
        resizableDoubleArray0.setElement((int) '#', (double) (short) 0);
        resizableDoubleArray0.setNumElements((int) (byte) 100);
        int int8 = resizableDoubleArray0.start();
        double[] doubleArray9 = resizableDoubleArray0.getValues();
        int int10 = resizableDoubleArray0.getExpansionMode();
        resizableDoubleArray0.contract();
        float float12 = resizableDoubleArray0.getExpansionFactor();
        resizableDoubleArray0.setElement((int) (short) 1, 100.0d);
        // The following exception was thrown during execution in test generation
        try {
            resizableDoubleArray0.setExpansionFactor((float) 10L);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Contraction criteria can never be smaller than the expansion factor.  This would lead to a never ending loop of expansion and contraction as a newly expanded internal storage array would immediately satisfy the criteria for contraction");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.0d + "'", double2 == 0.0d);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertNotNull(doubleArray9);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray9), "[0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0]");
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertTrue("'" + float12 + "' != '" + 2.0f + "'", float12 == 2.0f);
    }

    @Test
    public void test0467() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0467");
        org.apache.commons.math.util.ResizableDoubleArray resizableDoubleArray0 = new org.apache.commons.math.util.ResizableDoubleArray();
        double double2 = resizableDoubleArray0.addElementRolling((double) ' ');
        resizableDoubleArray0.setElement((int) '#', (double) (short) 0);
        resizableDoubleArray0.setNumElements((int) (byte) 100);
        resizableDoubleArray0.contract();
        int int9 = resizableDoubleArray0.start();
        float float10 = resizableDoubleArray0.getContractionCriteria();
        resizableDoubleArray0.setContractionCriteria(2.0f);
        int int13 = resizableDoubleArray0.start();
        double[] doubleArray14 = resizableDoubleArray0.getValues();
        int int15 = resizableDoubleArray0.getNumElements();
        int int16 = resizableDoubleArray0.start();
        java.lang.Class<?> wildcardClass17 = resizableDoubleArray0.getClass();
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.0d + "'", double2 == 0.0d);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + float10 + "' != '" + 2.5f + "'", float10 == 2.5f);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertNotNull(doubleArray14);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray14), "[0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0]");
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 100 + "'", int15 == 100);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 0 + "'", int16 == 0);
        org.junit.Assert.assertNotNull(wildcardClass17);
    }

    @Test
    public void test0468() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0468");
        org.apache.commons.math.util.ResizableDoubleArray resizableDoubleArray0 = new org.apache.commons.math.util.ResizableDoubleArray();
        double double2 = resizableDoubleArray0.addElementRolling((double) ' ');
        resizableDoubleArray0.setElement((int) '#', (double) (short) 0);
        resizableDoubleArray0.setNumElements((int) (byte) 100);
        resizableDoubleArray0.contract();
        // The following exception was thrown during execution in test generation
        try {
            resizableDoubleArray0.setExpansionMode((int) (byte) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Illegal expansionMode setting.");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.0d + "'", double2 == 0.0d);
    }

    @Test
    public void test0469() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0469");
        org.apache.commons.math.util.ResizableDoubleArray resizableDoubleArray0 = new org.apache.commons.math.util.ResizableDoubleArray();
        double[] doubleArray1 = resizableDoubleArray0.getValues();
        float float2 = resizableDoubleArray0.getExpansionFactor();
        double[] doubleArray3 = resizableDoubleArray0.getElements();
        resizableDoubleArray0.clear();
        int int5 = resizableDoubleArray0.getExpansionMode();
        resizableDoubleArray0.setNumElements((int) (short) 100);
        double[] doubleArray8 = resizableDoubleArray0.getValues();
        // The following exception was thrown during execution in test generation
        try {
            resizableDoubleArray0.setExpansionMode(36);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Illegal expansionMode setting.");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(doubleArray1);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray1), "[0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0]");
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 2.0f + "'", float2 == 2.0f);
        org.junit.Assert.assertNotNull(doubleArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray3), "[]");
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertNotNull(doubleArray8);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray8), "[0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0]");
    }

    @Test
    public void test0470() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0470");
        org.apache.commons.math.util.ResizableDoubleArray resizableDoubleArray0 = new org.apache.commons.math.util.ResizableDoubleArray();
        float float1 = resizableDoubleArray0.getExpansionFactor();
        resizableDoubleArray0.addElement((double) 0.0f);
        resizableDoubleArray0.addElement((double) 100.0f);
        resizableDoubleArray0.addElement((double) 0);
        double double9 = resizableDoubleArray0.addElementRolling((double) 10L);
        float float10 = resizableDoubleArray0.getContractionCriteria();
        resizableDoubleArray0.addElement(10.0d);
        resizableDoubleArray0.setNumElements(10);
        float float15 = resizableDoubleArray0.getExpansionFactor();
        // The following exception was thrown during execution in test generation
        try {
            resizableDoubleArray0.setExpansionMode((int) (short) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Illegal expansionMode setting.");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + float1 + "' != '" + 2.0f + "'", float1 == 2.0f);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 0.0d + "'", double9 == 0.0d);
        org.junit.Assert.assertTrue("'" + float10 + "' != '" + 2.5f + "'", float10 == 2.5f);
        org.junit.Assert.assertTrue("'" + float15 + "' != '" + 2.0f + "'", float15 == 2.0f);
    }

    @Test
    public void test0471() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0471");
        org.apache.commons.math.util.ResizableDoubleArray resizableDoubleArray0 = new org.apache.commons.math.util.ResizableDoubleArray();
        float float1 = resizableDoubleArray0.getExpansionFactor();
        resizableDoubleArray0.addElement((double) 0.0f);
        float float4 = resizableDoubleArray0.getContractionCriteria();
        resizableDoubleArray0.setElement(10, (double) 36);
        double double9 = resizableDoubleArray0.addElementRolling((-1.0d));
        double double11 = resizableDoubleArray0.getElement((int) (byte) 10);
        double double13 = resizableDoubleArray0.addElementRolling((double) 97);
        resizableDoubleArray0.setNumElements((int) 'a');
        org.junit.Assert.assertTrue("'" + float1 + "' != '" + 2.0f + "'", float1 == 2.0f);
        org.junit.Assert.assertTrue("'" + float4 + "' != '" + 2.5f + "'", float4 == 2.5f);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 0.0d + "'", double9 == 0.0d);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + (-1.0d) + "'", double11 == (-1.0d));
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 0.0d + "'", double13 == 0.0d);
    }

    @Test
    public void test0472() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0472");
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math.util.ResizableDoubleArray resizableDoubleArray3 = new org.apache.commons.math.util.ResizableDoubleArray(99, (float) '#', (float) 10L);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Contraction criteria can never be smaller than the expansion factor.  This would lead to a never ending loop of expansion and contraction as a newly expanded internal storage array would immediately satisfy the criteria for contraction");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void test0473() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0473");
        org.apache.commons.math.util.ResizableDoubleArray resizableDoubleArray0 = new org.apache.commons.math.util.ResizableDoubleArray();
        float float1 = resizableDoubleArray0.getExpansionFactor();
        resizableDoubleArray0.setNumElements((int) (byte) 100);
        resizableDoubleArray0.contract();
        int int5 = resizableDoubleArray0.start();
        float float6 = resizableDoubleArray0.getContractionCriteria();
        // The following exception was thrown during execution in test generation
        try {
            double double8 = resizableDoubleArray0.getElement((int) (byte) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: The index specified: 100 is larger than the current number of elements");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + float1 + "' != '" + 2.0f + "'", float1 == 2.0f);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + float6 + "' != '" + 2.5f + "'", float6 == 2.5f);
    }

    @Test
    public void test0474() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0474");
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math.util.ResizableDoubleArray resizableDoubleArray3 = new org.apache.commons.math.util.ResizableDoubleArray((int) (short) 0, (float) (byte) 10, (float) (byte) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Contraction criteria can never be smaller than the expansion factor.  This would lead to a never ending loop of expansion and contraction as a newly expanded internal storage array would immediately satisfy the criteria for contraction");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void test0475() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0475");
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math.util.ResizableDoubleArray resizableDoubleArray3 = new org.apache.commons.math.util.ResizableDoubleArray(36, 0.0f, (float) 11);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The expansion factor must be a number greater than 1.0");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void test0476() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0476");
        org.apache.commons.math.util.ResizableDoubleArray resizableDoubleArray0 = new org.apache.commons.math.util.ResizableDoubleArray();
        double double2 = resizableDoubleArray0.addElementRolling((double) ' ');
        resizableDoubleArray0.setElement((int) '#', (double) (short) 0);
        resizableDoubleArray0.setNumElements((int) (byte) 100);
        resizableDoubleArray0.setElement(100, (double) (byte) 100);
        resizableDoubleArray0.contract();
        resizableDoubleArray0.clear();
        resizableDoubleArray0.addElement((double) (short) -1);
        resizableDoubleArray0.contract();
        resizableDoubleArray0.setContractionCriteria((float) (byte) 100);
        resizableDoubleArray0.setElement(99, (double) (byte) 100);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.0d + "'", double2 == 0.0d);
    }

    @Test
    public void test0477() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0477");
        org.apache.commons.math.util.ResizableDoubleArray resizableDoubleArray1 = new org.apache.commons.math.util.ResizableDoubleArray((int) (byte) 100);
        double[] doubleArray2 = resizableDoubleArray1.getValues();
        resizableDoubleArray1.setExpansionMode((int) (byte) 0);
        resizableDoubleArray1.addElement((double) (short) 0);
        java.lang.Class<?> wildcardClass7 = resizableDoubleArray1.getClass();
        org.junit.Assert.assertNotNull(doubleArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray2), "[0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0]");
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test0478() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0478");
        org.apache.commons.math.util.ResizableDoubleArray resizableDoubleArray0 = new org.apache.commons.math.util.ResizableDoubleArray();
        float float1 = resizableDoubleArray0.getExpansionFactor();
        int int2 = resizableDoubleArray0.start();
        int int3 = resizableDoubleArray0.getNumElements();
        // The following exception was thrown during execution in test generation
        try {
            resizableDoubleArray0.setExpansionMode(97);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Illegal expansionMode setting.");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + float1 + "' != '" + 2.0f + "'", float1 == 2.0f);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
    }

    @Test
    public void test0479() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0479");
        org.apache.commons.math.util.ResizableDoubleArray resizableDoubleArray0 = new org.apache.commons.math.util.ResizableDoubleArray();
        double double2 = resizableDoubleArray0.addElementRolling((double) ' ');
        resizableDoubleArray0.setElement((int) '#', (double) (short) 0);
        resizableDoubleArray0.addElement(0.0d);
        resizableDoubleArray0.setElement((int) ' ', 10.0d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.0d + "'", double2 == 0.0d);
    }

    @Test
    public void test0480() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0480");
        org.apache.commons.math.util.ResizableDoubleArray resizableDoubleArray0 = new org.apache.commons.math.util.ResizableDoubleArray();
        float float1 = resizableDoubleArray0.getExpansionFactor();
        resizableDoubleArray0.setNumElements((int) (byte) 100);
        resizableDoubleArray0.contract();
        float float5 = resizableDoubleArray0.getExpansionFactor();
        java.lang.Class<?> wildcardClass6 = resizableDoubleArray0.getClass();
        org.junit.Assert.assertTrue("'" + float1 + "' != '" + 2.0f + "'", float1 == 2.0f);
        org.junit.Assert.assertTrue("'" + float5 + "' != '" + 2.0f + "'", float5 == 2.0f);
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void test0481() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0481");
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math.util.ResizableDoubleArray resizableDoubleArray4 = new org.apache.commons.math.util.ResizableDoubleArray((int) (short) 0, (float) 1, (float) 10L, 68);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The expansion factor must be a number greater than 1.0");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void test0482() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0482");
        org.apache.commons.math.util.ResizableDoubleArray resizableDoubleArray2 = new org.apache.commons.math.util.ResizableDoubleArray((int) (short) 1, 10.0f);
        double[] doubleArray3 = resizableDoubleArray2.getValues();
        double[] doubleArray4 = resizableDoubleArray2.getValues();
        resizableDoubleArray2.clear();
        resizableDoubleArray2.contract();
        org.junit.Assert.assertNotNull(doubleArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray3), "[0.0]");
        org.junit.Assert.assertNotNull(doubleArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray4), "[0.0]");
    }

    @Test
    public void test0483() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0483");
        org.apache.commons.math.util.ResizableDoubleArray resizableDoubleArray0 = new org.apache.commons.math.util.ResizableDoubleArray();
        double double2 = resizableDoubleArray0.addElementRolling((double) ' ');
        resizableDoubleArray0.setElement((int) '#', (double) (short) 0);
        resizableDoubleArray0.setNumElements((int) (byte) 100);
        int int8 = resizableDoubleArray0.start();
        double[] doubleArray9 = resizableDoubleArray0.getValues();
        resizableDoubleArray0.discardFrontElements((int) (short) 1);
        double double13 = resizableDoubleArray0.getElement(35);
        int int14 = resizableDoubleArray0.getNumElements();
        resizableDoubleArray0.setContractionCriteria((float) 36);
        int int17 = resizableDoubleArray0.getNumElements();
        // The following exception was thrown during execution in test generation
        try {
            resizableDoubleArray0.setExpansionFactor(100.0f);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Contraction criteria can never be smaller than the expansion factor.  This would lead to a never ending loop of expansion and contraction as a newly expanded internal storage array would immediately satisfy the criteria for contraction");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.0d + "'", double2 == 0.0d);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertNotNull(doubleArray9);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray9), "[0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0]");
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 0.0d + "'", double13 == 0.0d);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 99 + "'", int14 == 99);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 99 + "'", int17 == 99);
    }

    @Test
    public void test0484() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0484");
        org.apache.commons.math.util.ResizableDoubleArray resizableDoubleArray0 = new org.apache.commons.math.util.ResizableDoubleArray();
        double double2 = resizableDoubleArray0.addElementRolling((double) ' ');
        resizableDoubleArray0.setElement((int) '#', (double) (short) 0);
        resizableDoubleArray0.setNumElements((int) (byte) 100);
        int int8 = resizableDoubleArray0.start();
        double[] doubleArray9 = resizableDoubleArray0.getValues();
        int int10 = resizableDoubleArray0.getExpansionMode();
        resizableDoubleArray0.contract();
        int int12 = resizableDoubleArray0.getExpansionMode();
        resizableDoubleArray0.setElement((int) (byte) 1, 35.0d);
        // The following exception was thrown during execution in test generation
        try {
            resizableDoubleArray0.setContractionCriteria((float) (short) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Contraction criteria can never be smaller than the expansion factor.  This would lead to a never ending loop of expansion and contraction as a newly expanded internal storage array would immediately satisfy the criteria for contraction");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.0d + "'", double2 == 0.0d);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertNotNull(doubleArray9);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray9), "[0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0]");
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
    }

    @Test
    public void test0485() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0485");
        org.apache.commons.math.util.ResizableDoubleArray resizableDoubleArray0 = new org.apache.commons.math.util.ResizableDoubleArray();
        double[] doubleArray1 = resizableDoubleArray0.getValues();
        float float2 = resizableDoubleArray0.getExpansionFactor();
        double[] doubleArray3 = resizableDoubleArray0.getElements();
        double double5 = resizableDoubleArray0.addElementRolling((double) (short) 10);
        float float6 = resizableDoubleArray0.getContractionCriteria();
        org.junit.Assert.assertNotNull(doubleArray1);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray1), "[10.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0]");
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 2.0f + "'", float2 == 2.0f);
        org.junit.Assert.assertNotNull(doubleArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray3), "[]");
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
        org.junit.Assert.assertTrue("'" + float6 + "' != '" + 2.5f + "'", float6 == 2.5f);
    }

    @Test
    public void test0486() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0486");
        org.apache.commons.math.util.ResizableDoubleArray resizableDoubleArray0 = new org.apache.commons.math.util.ResizableDoubleArray();
        double double2 = resizableDoubleArray0.addElementRolling((double) ' ');
        resizableDoubleArray0.setElement((int) '#', (double) (short) 0);
        resizableDoubleArray0.setNumElements((int) (byte) 100);
        resizableDoubleArray0.contract();
        int int9 = resizableDoubleArray0.getNumElements();
        double[] doubleArray10 = resizableDoubleArray0.getValues();
        float float11 = resizableDoubleArray0.getContractionCriteria();
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.0d + "'", double2 == 0.0d);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 100 + "'", int9 == 100);
        org.junit.Assert.assertNotNull(doubleArray10);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray10), "[0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0]");
        org.junit.Assert.assertTrue("'" + float11 + "' != '" + 2.5f + "'", float11 == 2.5f);
    }

    @Test
    public void test0487() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0487");
        org.apache.commons.math.util.ResizableDoubleArray resizableDoubleArray0 = new org.apache.commons.math.util.ResizableDoubleArray();
        double[] doubleArray1 = resizableDoubleArray0.getValues();
        resizableDoubleArray0.setNumElements((int) '#');
        double double5 = resizableDoubleArray0.getElement((int) (byte) 1);
        int int6 = resizableDoubleArray0.getExpansionMode();
        // The following exception was thrown during execution in test generation
        try {
            resizableDoubleArray0.setExpansionMode((int) (byte) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Illegal expansionMode setting.");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(doubleArray1);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray1), "[0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0]");
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
    }

    @Test
    public void test0488() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0488");
        org.apache.commons.math.util.ResizableDoubleArray resizableDoubleArray0 = new org.apache.commons.math.util.ResizableDoubleArray();
        double double2 = resizableDoubleArray0.addElementRolling((double) ' ');
        resizableDoubleArray0.setElement((int) '#', (double) (short) 0);
        resizableDoubleArray0.setNumElements((int) (byte) 100);
        resizableDoubleArray0.setElement(100, (double) (byte) 100);
        float float11 = resizableDoubleArray0.getContractionCriteria();
        resizableDoubleArray0.addElement((double) 10.0f);
        resizableDoubleArray0.setElement(101, (double) 36);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.0d + "'", double2 == 0.0d);
        org.junit.Assert.assertTrue("'" + float11 + "' != '" + 2.5f + "'", float11 == 2.5f);
    }

    @Test
    public void test0489() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0489");
        org.apache.commons.math.util.ResizableDoubleArray resizableDoubleArray0 = new org.apache.commons.math.util.ResizableDoubleArray();
        double double2 = resizableDoubleArray0.addElementRolling((double) ' ');
        float float3 = resizableDoubleArray0.getExpansionFactor();
        resizableDoubleArray0.setNumElements((int) '#');
        double[] doubleArray6 = resizableDoubleArray0.getValues();
        int int7 = resizableDoubleArray0.start();
        double[] doubleArray8 = resizableDoubleArray0.getValues();
        double[] doubleArray9 = resizableDoubleArray0.getValues();
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.0d + "'", double2 == 0.0d);
        org.junit.Assert.assertTrue("'" + float3 + "' != '" + 2.0f + "'", float3 == 2.0f);
        org.junit.Assert.assertNotNull(doubleArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray6), "[0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0]");
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertNotNull(doubleArray8);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray8), "[0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0]");
        org.junit.Assert.assertNotNull(doubleArray9);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray9), "[0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0]");
    }

    @Test
    public void test0490() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0490");
        org.apache.commons.math.util.ResizableDoubleArray resizableDoubleArray0 = new org.apache.commons.math.util.ResizableDoubleArray();
        float float1 = resizableDoubleArray0.getExpansionFactor();
        resizableDoubleArray0.addElement((double) 0.0f);
        float float4 = resizableDoubleArray0.getContractionCriteria();
        // The following exception was thrown during execution in test generation
        try {
            resizableDoubleArray0.discardFrontElements((int) (byte) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Cannot discard more elements than arecontained in this array.");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + float1 + "' != '" + 2.0f + "'", float1 == 2.0f);
        org.junit.Assert.assertTrue("'" + float4 + "' != '" + 2.5f + "'", float4 == 2.5f);
    }

    @Test
    public void test0491() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0491");
        org.apache.commons.math.util.ResizableDoubleArray resizableDoubleArray3 = new org.apache.commons.math.util.ResizableDoubleArray(100, (float) 102, (float) 102);
    }

    @Test
    public void test0492() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0492");
        org.apache.commons.math.util.ResizableDoubleArray resizableDoubleArray0 = new org.apache.commons.math.util.ResizableDoubleArray();
        double double2 = resizableDoubleArray0.addElementRolling((double) ' ');
        resizableDoubleArray0.setElement((int) '#', (double) (short) 0);
        resizableDoubleArray0.setNumElements((int) (byte) 100);
        int int8 = resizableDoubleArray0.start();
        int int9 = resizableDoubleArray0.start();
        resizableDoubleArray0.setNumElements((int) (short) 1);
        int int12 = resizableDoubleArray0.getExpansionMode();
        double[] doubleArray13 = resizableDoubleArray0.getValues();
        // The following exception was thrown during execution in test generation
        try {
            resizableDoubleArray0.setExpansionFactor(100.5f);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Contraction criteria can never be smaller than the expansion factor.  This would lead to a never ending loop of expansion and contraction as a newly expanded internal storage array would immediately satisfy the criteria for contraction");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.0d + "'", double2 == 0.0d);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertNotNull(doubleArray13);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray13), "[0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0]");
    }

    @Test
    public void test0493() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0493");
        org.apache.commons.math.util.ResizableDoubleArray resizableDoubleArray0 = new org.apache.commons.math.util.ResizableDoubleArray();
        double[] doubleArray1 = resizableDoubleArray0.getElements();
        resizableDoubleArray0.addElement((double) (short) -1);
        float float4 = resizableDoubleArray0.getExpansionFactor();
        int int5 = resizableDoubleArray0.getNumElements();
        org.junit.Assert.assertNotNull(doubleArray1);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray1), "[]");
        org.junit.Assert.assertTrue("'" + float4 + "' != '" + 2.0f + "'", float4 == 2.0f);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 1 + "'", int5 == 1);
    }

    @Test
    public void test0494() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0494");
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math.util.ResizableDoubleArray resizableDoubleArray3 = new org.apache.commons.math.util.ResizableDoubleArray((-1), (float) (short) 10, 1.0f);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Contraction criteria can never be smaller than the expansion factor.  This would lead to a never ending loop of expansion and contraction as a newly expanded internal storage array would immediately satisfy the criteria for contraction");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void test0495() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0495");
        org.apache.commons.math.util.ResizableDoubleArray resizableDoubleArray0 = new org.apache.commons.math.util.ResizableDoubleArray();
        double double2 = resizableDoubleArray0.addElementRolling((double) ' ');
        float float3 = resizableDoubleArray0.getExpansionFactor();
        float float4 = resizableDoubleArray0.getContractionCriteria();
        // The following exception was thrown during execution in test generation
        try {
            resizableDoubleArray0.setExpansionMode((int) '#');
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Illegal expansionMode setting.");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.0d + "'", double2 == 0.0d);
        org.junit.Assert.assertTrue("'" + float3 + "' != '" + 2.0f + "'", float3 == 2.0f);
        org.junit.Assert.assertTrue("'" + float4 + "' != '" + 2.5f + "'", float4 == 2.5f);
    }

    @Test
    public void test0496() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0496");
        org.apache.commons.math.util.ResizableDoubleArray resizableDoubleArray0 = new org.apache.commons.math.util.ResizableDoubleArray();
        double double2 = resizableDoubleArray0.addElementRolling((double) ' ');
        resizableDoubleArray0.setElement((int) '#', (double) (short) 0);
        resizableDoubleArray0.setNumElements((int) (byte) 100);
        resizableDoubleArray0.contract();
        int int9 = resizableDoubleArray0.getNumElements();
        double[] doubleArray10 = resizableDoubleArray0.getValues();
        int int11 = resizableDoubleArray0.getNumElements();
        resizableDoubleArray0.setContractionCriteria((float) 10L);
        // The following exception was thrown during execution in test generation
        try {
            resizableDoubleArray0.discardFrontElements((-1));
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Cannot discard a negative number of elements.");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.0d + "'", double2 == 0.0d);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 100 + "'", int9 == 100);
        org.junit.Assert.assertNotNull(doubleArray10);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray10), "[0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0]");
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 100 + "'", int11 == 100);
    }

    @Test
    public void test0497() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0497");
        org.apache.commons.math.util.ResizableDoubleArray resizableDoubleArray1 = new org.apache.commons.math.util.ResizableDoubleArray((int) (byte) 100);
        float float2 = resizableDoubleArray1.getContractionCriteria();
        // The following exception was thrown during execution in test generation
        try {
            double double4 = resizableDoubleArray1.getElement(11);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: The index specified: 11 is larger than the current number of elements");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 2.5f + "'", float2 == 2.5f);
    }

    @Test
    public void test0498() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0498");
        org.apache.commons.math.util.ResizableDoubleArray resizableDoubleArray0 = new org.apache.commons.math.util.ResizableDoubleArray();
        double double2 = resizableDoubleArray0.addElementRolling((double) ' ');
        resizableDoubleArray0.setElement((int) '#', (double) (short) 0);
        resizableDoubleArray0.setNumElements((int) (byte) 100);
        float float8 = resizableDoubleArray0.getExpansionFactor();
        resizableDoubleArray0.setContractionCriteria(100.5f);
        // The following exception was thrown during execution in test generation
        try {
            resizableDoubleArray0.setExpansionMode(68);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Illegal expansionMode setting.");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.0d + "'", double2 == 0.0d);
        org.junit.Assert.assertTrue("'" + float8 + "' != '" + 2.0f + "'", float8 == 2.0f);
    }

    @Test
    public void test0499() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0499");
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math.util.ResizableDoubleArray resizableDoubleArray3 = new org.apache.commons.math.util.ResizableDoubleArray((int) (byte) -1, 36.0f, (float) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Contraction criteria can never be smaller than the expansion factor.  This would lead to a never ending loop of expansion and contraction as a newly expanded internal storage array would immediately satisfy the criteria for contraction");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void test0500() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0500");
        org.apache.commons.math.util.ResizableDoubleArray resizableDoubleArray0 = new org.apache.commons.math.util.ResizableDoubleArray();
        double double2 = resizableDoubleArray0.addElementRolling((double) ' ');
        float float3 = resizableDoubleArray0.getExpansionFactor();
        resizableDoubleArray0.setNumElements((int) '#');
        double[] doubleArray6 = resizableDoubleArray0.getValues();
        int int7 = resizableDoubleArray0.start();
        int int8 = resizableDoubleArray0.start();
        double[] doubleArray9 = resizableDoubleArray0.getElements();
        // The following exception was thrown during execution in test generation
        try {
            resizableDoubleArray0.setExpansionFactor((float) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Contraction criteria can never be smaller than the expansion factor.  This would lead to a never ending loop of expansion and contraction as a newly expanded internal storage array would immediately satisfy the criteria for contraction");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.0d + "'", double2 == 0.0d);
        org.junit.Assert.assertTrue("'" + float3 + "' != '" + 2.0f + "'", float3 == 2.0f);
        org.junit.Assert.assertNotNull(doubleArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray6), "[0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0]");
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertNotNull(doubleArray9);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray9), "[0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0]");
    }
}

