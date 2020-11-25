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
        // The following exception was thrown during execution in test generation
        try {
            org.mockito.asm.ByteVector byteVector1 = new org.mockito.asm.ByteVector((int) (short) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.NegativeArraySizeException; message: null");
        } catch (java.lang.NegativeArraySizeException e) {
        // Expected exception.
        }
    }

    @Test
    public void test0002() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0002");
        org.mockito.asm.ByteVector byteVector0 = new org.mockito.asm.ByteVector();
        org.mockito.asm.ByteVector byteVector2 = byteVector0.putUTF8("hi!");
        org.mockito.asm.ByteVector byteVector4 = byteVector0.putByte((int) (byte) 1);
        java.lang.Class<?> wildcardClass5 = byteVector0.getClass();
        org.junit.Assert.assertNotNull(byteVector2);
        org.junit.Assert.assertNotNull(byteVector4);
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test0003() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0003");
        org.mockito.asm.ByteVector byteVector0 = new org.mockito.asm.ByteVector();
        java.lang.Class<?> wildcardClass1 = byteVector0.getClass();
        org.junit.Assert.assertNotNull(wildcardClass1);
    }

    @Test
    public void test0004() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0004");
        org.mockito.asm.ByteVector byteVector0 = new org.mockito.asm.ByteVector();
        org.mockito.asm.ByteVector byteVector2 = byteVector0.putUTF8("hi!");
        org.mockito.asm.ByteVector byteVector4 = byteVector2.putLong((long) (byte) 10);
        byte[] byteArray10 = new byte[] { (byte) 1, (byte) 1, (byte) 0, (byte) 0, (byte) -1 };
        // The following exception was thrown during execution in test generation
        try {
            org.mockito.asm.ByteVector byteVector13 = byteVector2.putByteArray(byteArray10, 0, (int) (short) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteVector2);
        org.junit.Assert.assertNotNull(byteVector4);
        org.junit.Assert.assertNotNull(byteArray10);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray10), "[1, 1, 0, 0, -1]");
    }

    @Test
    public void test0005() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0005");
        org.mockito.asm.ByteVector byteVector0 = new org.mockito.asm.ByteVector();
        org.mockito.asm.ByteVector byteVector2 = byteVector0.putUTF8("hi!");
        org.mockito.asm.ByteVector byteVector4 = byteVector2.putLong((long) (byte) 10);
        java.lang.Class<?> wildcardClass5 = byteVector4.getClass();
        org.junit.Assert.assertNotNull(byteVector2);
        org.junit.Assert.assertNotNull(byteVector4);
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test0006() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0006");
        org.mockito.asm.ByteVector byteVector0 = new org.mockito.asm.ByteVector();
        org.mockito.asm.ByteVector byteVector2 = byteVector0.putUTF8("hi!");
        org.mockito.asm.ByteVector byteVector4 = byteVector0.putShort((int) (short) -1);
        java.lang.Class<?> wildcardClass5 = byteVector4.getClass();
        org.junit.Assert.assertNotNull(byteVector2);
        org.junit.Assert.assertNotNull(byteVector4);
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test0007() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0007");
        org.mockito.asm.ByteVector byteVector0 = new org.mockito.asm.ByteVector();
        org.mockito.asm.ByteVector byteVector2 = byteVector0.putUTF8("hi!");
        org.mockito.asm.ByteVector byteVector4 = byteVector2.putInt((int) (byte) 10);
        java.lang.Class<?> wildcardClass5 = byteVector4.getClass();
        org.junit.Assert.assertNotNull(byteVector2);
        org.junit.Assert.assertNotNull(byteVector4);
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test0008() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0008");
        org.mockito.asm.ByteVector byteVector0 = new org.mockito.asm.ByteVector();
        org.mockito.asm.ByteVector byteVector2 = byteVector0.putUTF8("hi!");
        org.mockito.asm.ByteVector byteVector4 = byteVector0.putInt(0);
        org.mockito.asm.ByteVector byteVector6 = byteVector0.putShort((int) '4');
        org.mockito.asm.ByteVector byteVector8 = byteVector0.putUTF8("hi!");
        byte[] byteArray15 = new byte[] { (byte) -1, (byte) 1, (byte) -1, (byte) 1, (byte) 1, (byte) -1 };
        // The following exception was thrown during execution in test generation
        try {
            org.mockito.asm.ByteVector byteVector18 = byteVector0.putByteArray(byteArray15, (int) (short) 100, 0);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteVector2);
        org.junit.Assert.assertNotNull(byteVector4);
        org.junit.Assert.assertNotNull(byteVector6);
        org.junit.Assert.assertNotNull(byteVector8);
        org.junit.Assert.assertNotNull(byteArray15);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray15), "[-1, 1, -1, 1, 1, -1]");
    }

    @Test
    public void test0009() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0009");
        org.mockito.asm.ByteVector byteVector0 = new org.mockito.asm.ByteVector();
        org.mockito.asm.ByteVector byteVector2 = byteVector0.putUTF8("hi!");
        org.mockito.asm.ByteVector byteVector4 = byteVector0.putShort((int) (short) 100);
        java.lang.Class<?> wildcardClass5 = byteVector4.getClass();
        org.junit.Assert.assertNotNull(byteVector2);
        org.junit.Assert.assertNotNull(byteVector4);
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test0010() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0010");
        org.mockito.asm.ByteVector byteVector0 = new org.mockito.asm.ByteVector();
        org.mockito.asm.ByteVector byteVector2 = byteVector0.putUTF8("hi!");
        org.mockito.asm.ByteVector byteVector4 = byteVector0.putLong((long) ' ');
        org.mockito.asm.ByteVector byteVector6 = byteVector4.putByte((int) 'a');
        org.mockito.asm.ByteVector byteVector8 = byteVector6.putByte((int) (short) -1);
        org.mockito.asm.ByteVector byteVector10 = byteVector8.putLong((long) (byte) -1);
        java.lang.Class<?> wildcardClass11 = byteVector8.getClass();
        org.junit.Assert.assertNotNull(byteVector2);
        org.junit.Assert.assertNotNull(byteVector4);
        org.junit.Assert.assertNotNull(byteVector6);
        org.junit.Assert.assertNotNull(byteVector8);
        org.junit.Assert.assertNotNull(byteVector10);
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test0011() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0011");
        // The following exception was thrown during execution in test generation
        try {
            org.mockito.asm.ByteVector byteVector1 = new org.mockito.asm.ByteVector((-1));
            org.junit.Assert.fail("Expected exception of type java.lang.NegativeArraySizeException; message: null");
        } catch (java.lang.NegativeArraySizeException e) {
        // Expected exception.
        }
    }

    @Test
    public void test0012() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0012");
        org.mockito.asm.ByteVector byteVector0 = new org.mockito.asm.ByteVector();
        org.mockito.asm.ByteVector byteVector2 = byteVector0.putUTF8("hi!");
        org.mockito.asm.ByteVector byteVector4 = byteVector2.putLong((long) (byte) 10);
        org.mockito.asm.ByteVector byteVector6 = byteVector4.putUTF8("hi!");
        org.mockito.asm.ByteVector byteVector8 = byteVector4.putLong((long) (short) -1);
        org.mockito.asm.ByteVector byteVector10 = byteVector8.putInt(10);
        java.lang.Class<?> wildcardClass11 = byteVector10.getClass();
        org.junit.Assert.assertNotNull(byteVector2);
        org.junit.Assert.assertNotNull(byteVector4);
        org.junit.Assert.assertNotNull(byteVector6);
        org.junit.Assert.assertNotNull(byteVector8);
        org.junit.Assert.assertNotNull(byteVector10);
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test0013() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0013");
        org.mockito.asm.ByteVector byteVector1 = new org.mockito.asm.ByteVector((int) (short) 10);
    }

    @Test
    public void test0014() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0014");
        org.mockito.asm.ByteVector byteVector0 = new org.mockito.asm.ByteVector();
        org.mockito.asm.ByteVector byteVector2 = byteVector0.putUTF8("hi!");
        org.mockito.asm.ByteVector byteVector4 = byteVector0.putShort((int) (short) -1);
        org.mockito.asm.ByteVector byteVector6 = byteVector0.putLong(0L);
        java.lang.Class<?> wildcardClass7 = byteVector0.getClass();
        org.junit.Assert.assertNotNull(byteVector2);
        org.junit.Assert.assertNotNull(byteVector4);
        org.junit.Assert.assertNotNull(byteVector6);
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test0015() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0015");
        org.mockito.asm.ByteVector byteVector0 = new org.mockito.asm.ByteVector();
        org.mockito.asm.ByteVector byteVector2 = byteVector0.putUTF8("hi!");
        org.mockito.asm.ByteVector byteVector4 = byteVector0.putLong((long) (short) 1);
        java.lang.Class<?> wildcardClass5 = byteVector0.getClass();
        org.junit.Assert.assertNotNull(byteVector2);
        org.junit.Assert.assertNotNull(byteVector4);
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test0016() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0016");
        org.mockito.asm.ByteVector byteVector0 = new org.mockito.asm.ByteVector();
        org.mockito.asm.ByteVector byteVector2 = byteVector0.putUTF8("hi!");
        org.mockito.asm.ByteVector byteVector4 = byteVector0.putLong((long) ' ');
        org.mockito.asm.ByteVector byteVector6 = byteVector4.putByte((int) 'a');
        org.mockito.asm.ByteVector byteVector8 = byteVector6.putByte((int) (short) -1);
        org.mockito.asm.ByteVector byteVector10 = byteVector8.putLong((long) (byte) -1);
        java.lang.Class<?> wildcardClass11 = byteVector10.getClass();
        org.junit.Assert.assertNotNull(byteVector2);
        org.junit.Assert.assertNotNull(byteVector4);
        org.junit.Assert.assertNotNull(byteVector6);
        org.junit.Assert.assertNotNull(byteVector8);
        org.junit.Assert.assertNotNull(byteVector10);
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test0017() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0017");
        org.mockito.asm.ByteVector byteVector0 = new org.mockito.asm.ByteVector();
        org.mockito.asm.ByteVector byteVector2 = byteVector0.putUTF8("hi!");
        org.mockito.asm.ByteVector byteVector4 = byteVector0.putLong((long) ' ');
        org.mockito.asm.ByteVector byteVector6 = byteVector4.putByte((int) 'a');
        org.mockito.asm.ByteVector byteVector8 = byteVector4.putByte((int) (short) -1);
        org.mockito.asm.ByteVector byteVector10 = byteVector4.putLong(0L);
        org.mockito.asm.ByteVector byteVector12 = byteVector4.putUTF8("hi!");
        org.mockito.asm.ByteVector byteVector14 = byteVector12.putUTF8("");
        org.mockito.asm.ByteVector byteVector16 = byteVector12.putInt((int) (byte) 10);
        byte[] byteArray23 = new byte[] { (byte) 10, (byte) 10, (byte) 100, (byte) 10, (byte) 0, (byte) 1 };
        // The following exception was thrown during execution in test generation
        try {
            org.mockito.asm.ByteVector byteVector26 = byteVector16.putByteArray(byteArray23, 100, (int) (short) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteVector2);
        org.junit.Assert.assertNotNull(byteVector4);
        org.junit.Assert.assertNotNull(byteVector6);
        org.junit.Assert.assertNotNull(byteVector8);
        org.junit.Assert.assertNotNull(byteVector10);
        org.junit.Assert.assertNotNull(byteVector12);
        org.junit.Assert.assertNotNull(byteVector14);
        org.junit.Assert.assertNotNull(byteVector16);
        org.junit.Assert.assertNotNull(byteArray23);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray23), "[10, 10, 100, 10, 0, 1]");
    }

    @Test
    public void test0018() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0018");
        org.mockito.asm.ByteVector byteVector1 = new org.mockito.asm.ByteVector((int) ' ');
        java.lang.Class<?> wildcardClass2 = byteVector1.getClass();
        org.junit.Assert.assertNotNull(wildcardClass2);
    }

    @Test
    public void test0019() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0019");
        // The following exception was thrown during execution in test generation
        try {
            org.mockito.asm.ByteVector byteVector1 = new org.mockito.asm.ByteVector((int) (byte) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.NegativeArraySizeException; message: null");
        } catch (java.lang.NegativeArraySizeException e) {
        // Expected exception.
        }
    }

    @Test
    public void test0020() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0020");
        org.mockito.asm.ByteVector byteVector1 = new org.mockito.asm.ByteVector((int) 'a');
        java.lang.Class<?> wildcardClass2 = byteVector1.getClass();
        org.junit.Assert.assertNotNull(wildcardClass2);
    }

    @Test
    public void test0021() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0021");
        org.mockito.asm.ByteVector byteVector0 = new org.mockito.asm.ByteVector();
        org.mockito.asm.ByteVector byteVector2 = byteVector0.putUTF8("hi!");
        org.mockito.asm.ByteVector byteVector4 = byteVector0.putLong((long) (short) 1);
        org.mockito.asm.ByteVector byteVector6 = byteVector4.putShort((int) (byte) -1);
        byte[] byteArray7 = new byte[] {};
        // The following exception was thrown during execution in test generation
        try {
            org.mockito.asm.ByteVector byteVector10 = byteVector6.putByteArray(byteArray7, (int) (byte) 1, (int) (byte) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteVector2);
        org.junit.Assert.assertNotNull(byteVector4);
        org.junit.Assert.assertNotNull(byteVector6);
        org.junit.Assert.assertNotNull(byteArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray7), "[]");
    }

    @Test
    public void test0022() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0022");
        org.mockito.asm.ByteVector byteVector0 = new org.mockito.asm.ByteVector();
        org.mockito.asm.ByteVector byteVector2 = byteVector0.putUTF8("hi!");
        org.mockito.asm.ByteVector byteVector4 = byteVector2.putInt(0);
        org.mockito.asm.ByteVector byteVector6 = byteVector2.putByte((int) (byte) 10);
        org.mockito.asm.ByteVector byteVector8 = byteVector6.putUTF8("hi!");
        java.lang.Class<?> wildcardClass9 = byteVector6.getClass();
        org.junit.Assert.assertNotNull(byteVector2);
        org.junit.Assert.assertNotNull(byteVector4);
        org.junit.Assert.assertNotNull(byteVector6);
        org.junit.Assert.assertNotNull(byteVector8);
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test0023() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0023");
        org.mockito.asm.ByteVector byteVector0 = new org.mockito.asm.ByteVector();
        org.mockito.asm.ByteVector byteVector2 = byteVector0.putUTF8("hi!");
        org.mockito.asm.ByteVector byteVector4 = byteVector0.putInt(0);
        org.mockito.asm.ByteVector byteVector6 = byteVector4.putInt((int) ' ');
        byte[] byteArray9 = new byte[] { (byte) -1, (byte) 10 };
        // The following exception was thrown during execution in test generation
        try {
            org.mockito.asm.ByteVector byteVector12 = byteVector6.putByteArray(byteArray9, (int) (byte) -1, 1);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteVector2);
        org.junit.Assert.assertNotNull(byteVector4);
        org.junit.Assert.assertNotNull(byteVector6);
        org.junit.Assert.assertNotNull(byteArray9);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray9), "[-1, 10]");
    }

    @Test
    public void test0024() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0024");
        org.mockito.asm.ByteVector byteVector0 = new org.mockito.asm.ByteVector();
        org.mockito.asm.ByteVector byteVector2 = byteVector0.putUTF8("hi!");
        org.mockito.asm.ByteVector byteVector4 = byteVector2.putInt(0);
        org.mockito.asm.ByteVector byteVector6 = byteVector2.putByte((int) (byte) 10);
        org.mockito.asm.ByteVector byteVector8 = byteVector6.putLong(0L);
        byte[] byteArray15 = new byte[] { (byte) 100, (byte) 0, (byte) 100, (byte) -1, (byte) -1, (byte) -1 };
        // The following exception was thrown during execution in test generation
        try {
            org.mockito.asm.ByteVector byteVector18 = byteVector8.putByteArray(byteArray15, 1, (int) ' ');
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteVector2);
        org.junit.Assert.assertNotNull(byteVector4);
        org.junit.Assert.assertNotNull(byteVector6);
        org.junit.Assert.assertNotNull(byteVector8);
        org.junit.Assert.assertNotNull(byteArray15);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray15), "[100, 0, 100, -1, -1, -1]");
    }

    @Test
    public void test0025() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0025");
        org.mockito.asm.ByteVector byteVector0 = new org.mockito.asm.ByteVector();
        org.mockito.asm.ByteVector byteVector2 = byteVector0.putUTF8("hi!");
        org.mockito.asm.ByteVector byteVector4 = byteVector0.putInt(0);
        org.mockito.asm.ByteVector byteVector6 = byteVector0.putShort((int) '4');
        byte[] byteArray13 = new byte[] { (byte) -1, (byte) 0, (byte) 100, (byte) 1, (byte) 1, (byte) 10 };
        // The following exception was thrown during execution in test generation
        try {
            org.mockito.asm.ByteVector byteVector16 = byteVector6.putByteArray(byteArray13, (int) (short) 10, (-1));
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteVector2);
        org.junit.Assert.assertNotNull(byteVector4);
        org.junit.Assert.assertNotNull(byteVector6);
        org.junit.Assert.assertNotNull(byteArray13);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray13), "[-1, 0, 100, 1, 1, 10]");
    }

    @Test
    public void test0026() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0026");
        org.mockito.asm.ByteVector byteVector0 = new org.mockito.asm.ByteVector();
        org.mockito.asm.ByteVector byteVector2 = byteVector0.putUTF8("hi!");
        org.mockito.asm.ByteVector byteVector4 = byteVector2.putLong((long) (byte) 10);
        byte[] byteArray8 = new byte[] { (byte) 100, (byte) 0, (byte) 0 };
        // The following exception was thrown during execution in test generation
        try {
            org.mockito.asm.ByteVector byteVector11 = byteVector2.putByteArray(byteArray8, (int) (byte) -1, (int) (short) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteVector2);
        org.junit.Assert.assertNotNull(byteVector4);
        org.junit.Assert.assertNotNull(byteArray8);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray8), "[100, 0, 0]");
    }

    @Test
    public void test0027() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0027");
        org.mockito.asm.ByteVector byteVector0 = new org.mockito.asm.ByteVector();
        org.mockito.asm.ByteVector byteVector2 = byteVector0.putUTF8("hi!");
        org.mockito.asm.ByteVector byteVector4 = byteVector0.putInt(0);
        org.mockito.asm.ByteVector byteVector6 = byteVector0.putShort((int) '4');
        byte[] byteArray11 = new byte[] { (byte) 0, (byte) -1, (byte) -1, (byte) -1 };
        // The following exception was thrown during execution in test generation
        try {
            org.mockito.asm.ByteVector byteVector14 = byteVector0.putByteArray(byteArray11, 1, (int) (byte) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteVector2);
        org.junit.Assert.assertNotNull(byteVector4);
        org.junit.Assert.assertNotNull(byteVector6);
        org.junit.Assert.assertNotNull(byteArray11);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray11), "[0, -1, -1, -1]");
    }

    @Test
    public void test0028() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0028");
        org.mockito.asm.ByteVector byteVector0 = new org.mockito.asm.ByteVector();
        org.mockito.asm.ByteVector byteVector2 = byteVector0.putUTF8("hi!");
        org.mockito.asm.ByteVector byteVector4 = byteVector0.putLong((long) ' ');
        org.mockito.asm.ByteVector byteVector6 = byteVector4.putByte((int) 'a');
        org.mockito.asm.ByteVector byteVector8 = byteVector6.putByte((int) (short) -1);
        byte[] byteArray15 = new byte[] { (byte) 0, (byte) 100, (byte) -1, (byte) -1, (byte) 100, (byte) 0 };
        // The following exception was thrown during execution in test generation
        try {
            org.mockito.asm.ByteVector byteVector18 = byteVector8.putByteArray(byteArray15, (int) '4', (int) 'a');
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteVector2);
        org.junit.Assert.assertNotNull(byteVector4);
        org.junit.Assert.assertNotNull(byteVector6);
        org.junit.Assert.assertNotNull(byteVector8);
        org.junit.Assert.assertNotNull(byteArray15);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray15), "[0, 100, -1, -1, 100, 0]");
    }

    @Test
    public void test0029() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0029");
        org.mockito.asm.ByteVector byteVector0 = new org.mockito.asm.ByteVector();
        org.mockito.asm.ByteVector byteVector2 = byteVector0.putUTF8("hi!");
        org.mockito.asm.ByteVector byteVector4 = byteVector0.putLong((long) ' ');
        org.mockito.asm.ByteVector byteVector6 = byteVector4.putByte((int) 'a');
        org.mockito.asm.ByteVector byteVector8 = byteVector4.putByte((int) (short) -1);
        org.mockito.asm.ByteVector byteVector10 = byteVector4.putLong(0L);
        byte[] byteArray12 = new byte[] { (byte) 0 };
        // The following exception was thrown during execution in test generation
        try {
            org.mockito.asm.ByteVector byteVector15 = byteVector4.putByteArray(byteArray12, (int) ' ', (int) (short) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteVector2);
        org.junit.Assert.assertNotNull(byteVector4);
        org.junit.Assert.assertNotNull(byteVector6);
        org.junit.Assert.assertNotNull(byteVector8);
        org.junit.Assert.assertNotNull(byteVector10);
        org.junit.Assert.assertNotNull(byteArray12);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray12), "[0]");
    }

    @Test
    public void test0030() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0030");
        org.mockito.asm.ByteVector byteVector0 = new org.mockito.asm.ByteVector();
        org.mockito.asm.ByteVector byteVector2 = byteVector0.putUTF8("hi!");
        org.mockito.asm.ByteVector byteVector4 = byteVector0.putShort((int) (short) -1);
        org.mockito.asm.ByteVector byteVector6 = byteVector0.putInt(0);
        byte[] byteArray8 = new byte[] { (byte) 0 };
        // The following exception was thrown during execution in test generation
        try {
            org.mockito.asm.ByteVector byteVector11 = byteVector0.putByteArray(byteArray8, (int) (short) -1, 100);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteVector2);
        org.junit.Assert.assertNotNull(byteVector4);
        org.junit.Assert.assertNotNull(byteVector6);
        org.junit.Assert.assertNotNull(byteArray8);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray8), "[0]");
    }

    @Test
    public void test0031() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0031");
        org.mockito.asm.ByteVector byteVector0 = new org.mockito.asm.ByteVector();
        org.mockito.asm.ByteVector byteVector2 = byteVector0.putUTF8("hi!");
        org.mockito.asm.ByteVector byteVector4 = byteVector0.putInt(0);
        org.mockito.asm.ByteVector byteVector6 = byteVector0.putShort((int) '4');
        java.lang.Class<?> wildcardClass7 = byteVector6.getClass();
        org.junit.Assert.assertNotNull(byteVector2);
        org.junit.Assert.assertNotNull(byteVector4);
        org.junit.Assert.assertNotNull(byteVector6);
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test0032() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0032");
        org.mockito.asm.ByteVector byteVector0 = new org.mockito.asm.ByteVector();
        org.mockito.asm.ByteVector byteVector2 = byteVector0.putUTF8("hi!");
        org.mockito.asm.ByteVector byteVector4 = byteVector2.putLong((long) (byte) 10);
        org.mockito.asm.ByteVector byteVector6 = byteVector4.putUTF8("hi!");
        org.mockito.asm.ByteVector byteVector8 = byteVector4.putLong((long) (short) -1);
        org.mockito.asm.ByteVector byteVector10 = byteVector8.putInt(10);
        byte[] byteArray12 = new byte[] { (byte) 0 };
        // The following exception was thrown during execution in test generation
        try {
            org.mockito.asm.ByteVector byteVector15 = byteVector10.putByteArray(byteArray12, (int) (byte) 1, (int) '4');
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteVector2);
        org.junit.Assert.assertNotNull(byteVector4);
        org.junit.Assert.assertNotNull(byteVector6);
        org.junit.Assert.assertNotNull(byteVector8);
        org.junit.Assert.assertNotNull(byteVector10);
        org.junit.Assert.assertNotNull(byteArray12);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray12), "[0]");
    }

    @Test
    public void test0033() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0033");
        org.mockito.asm.ByteVector byteVector0 = new org.mockito.asm.ByteVector();
        org.mockito.asm.ByteVector byteVector2 = byteVector0.putUTF8("hi!");
        org.mockito.asm.ByteVector byteVector4 = byteVector2.putLong((long) (byte) 10);
        org.mockito.asm.ByteVector byteVector6 = byteVector4.putUTF8("hi!");
        org.mockito.asm.ByteVector byteVector8 = byteVector4.putLong((long) (short) -1);
        org.mockito.asm.ByteVector byteVector10 = byteVector8.putInt(10);
        org.mockito.asm.ByteVector byteVector12 = byteVector8.putByte((int) (short) 1);
        org.mockito.asm.ByteVector byteVector14 = byteVector12.putShort((int) (short) 100);
        byte[] byteArray21 = new byte[] { (byte) 100, (byte) 1, (byte) 0, (byte) 0, (byte) 0, (byte) 0 };
        // The following exception was thrown during execution in test generation
        try {
            org.mockito.asm.ByteVector byteVector24 = byteVector12.putByteArray(byteArray21, (int) '#', (int) (short) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteVector2);
        org.junit.Assert.assertNotNull(byteVector4);
        org.junit.Assert.assertNotNull(byteVector6);
        org.junit.Assert.assertNotNull(byteVector8);
        org.junit.Assert.assertNotNull(byteVector10);
        org.junit.Assert.assertNotNull(byteVector12);
        org.junit.Assert.assertNotNull(byteVector14);
        org.junit.Assert.assertNotNull(byteArray21);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray21), "[100, 1, 0, 0, 0, 0]");
    }

    @Test
    public void test0034() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0034");
        org.mockito.asm.ByteVector byteVector0 = new org.mockito.asm.ByteVector();
        org.mockito.asm.ByteVector byteVector2 = byteVector0.putUTF8("hi!");
        org.mockito.asm.ByteVector byteVector4 = byteVector2.putLong((long) (byte) 10);
        java.lang.Class<?> wildcardClass5 = byteVector2.getClass();
        org.junit.Assert.assertNotNull(byteVector2);
        org.junit.Assert.assertNotNull(byteVector4);
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test0035() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0035");
        org.mockito.asm.ByteVector byteVector0 = new org.mockito.asm.ByteVector();
        org.mockito.asm.ByteVector byteVector2 = byteVector0.putUTF8("hi!");
        org.mockito.asm.ByteVector byteVector4 = byteVector0.putLong((long) ' ');
        byte[] byteArray5 = new byte[] {};
        // The following exception was thrown during execution in test generation
        try {
            org.mockito.asm.ByteVector byteVector8 = byteVector0.putByteArray(byteArray5, (int) (short) 100, 100);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteVector2);
        org.junit.Assert.assertNotNull(byteVector4);
        org.junit.Assert.assertNotNull(byteArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray5), "[]");
    }

    @Test
    public void test0036() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0036");
        org.mockito.asm.ByteVector byteVector0 = new org.mockito.asm.ByteVector();
        org.mockito.asm.ByteVector byteVector2 = byteVector0.putUTF8("hi!");
        org.mockito.asm.ByteVector byteVector4 = byteVector2.putInt(0);
        org.mockito.asm.ByteVector byteVector6 = byteVector4.putShort((int) '4');
        org.mockito.asm.ByteVector byteVector8 = byteVector6.putByte(100);
        org.mockito.asm.ByteVector byteVector10 = byteVector6.putInt((int) (byte) 10);
        byte[] byteArray17 = new byte[] { (byte) 10, (byte) 0, (byte) 10, (byte) 100, (byte) 0, (byte) -1 };
        // The following exception was thrown during execution in test generation
        try {
            org.mockito.asm.ByteVector byteVector20 = byteVector10.putByteArray(byteArray17, (int) (short) 1, (int) '#');
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteVector2);
        org.junit.Assert.assertNotNull(byteVector4);
        org.junit.Assert.assertNotNull(byteVector6);
        org.junit.Assert.assertNotNull(byteVector8);
        org.junit.Assert.assertNotNull(byteVector10);
        org.junit.Assert.assertNotNull(byteArray17);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray17), "[10, 0, 10, 100, 0, -1]");
    }

    @Test
    public void test0037() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0037");
        org.mockito.asm.ByteVector byteVector1 = new org.mockito.asm.ByteVector((int) (byte) 10);
        org.mockito.asm.ByteVector byteVector3 = byteVector1.putByte((int) '4');
        byte[] byteArray6 = new byte[] { (byte) 10, (byte) 10 };
        // The following exception was thrown during execution in test generation
        try {
            org.mockito.asm.ByteVector byteVector9 = byteVector1.putByteArray(byteArray6, (int) ' ', 100);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteVector3);
        org.junit.Assert.assertNotNull(byteArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray6), "[10, 10]");
    }

    @Test
    public void test0038() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0038");
        org.mockito.asm.ByteVector byteVector1 = new org.mockito.asm.ByteVector(100);
        java.lang.Class<?> wildcardClass2 = byteVector1.getClass();
        org.junit.Assert.assertNotNull(wildcardClass2);
    }

    @Test
    public void test0039() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0039");
        org.mockito.asm.ByteVector byteVector0 = new org.mockito.asm.ByteVector();
        org.mockito.asm.ByteVector byteVector2 = byteVector0.putUTF8("hi!");
        org.mockito.asm.ByteVector byteVector4 = byteVector0.putLong((long) ' ');
        org.mockito.asm.ByteVector byteVector6 = byteVector4.putByte((int) 'a');
        org.mockito.asm.ByteVector byteVector8 = byteVector4.putByte((int) (short) -1);
        org.mockito.asm.ByteVector byteVector10 = byteVector4.putLong(0L);
        org.mockito.asm.ByteVector byteVector12 = byteVector4.putUTF8("hi!");
        org.mockito.asm.ByteVector byteVector14 = byteVector12.putUTF8("hi!");
        org.mockito.asm.ByteVector byteVector16 = byteVector12.putByte((int) (byte) -1);
        byte[] byteArray22 = new byte[] { (byte) 0, (byte) 100, (byte) 0, (byte) 10, (byte) 1 };
        // The following exception was thrown during execution in test generation
        try {
            org.mockito.asm.ByteVector byteVector25 = byteVector12.putByteArray(byteArray22, (int) 'a', 100);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteVector2);
        org.junit.Assert.assertNotNull(byteVector4);
        org.junit.Assert.assertNotNull(byteVector6);
        org.junit.Assert.assertNotNull(byteVector8);
        org.junit.Assert.assertNotNull(byteVector10);
        org.junit.Assert.assertNotNull(byteVector12);
        org.junit.Assert.assertNotNull(byteVector14);
        org.junit.Assert.assertNotNull(byteVector16);
        org.junit.Assert.assertNotNull(byteArray22);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray22), "[0, 100, 0, 10, 1]");
    }

    @Test
    public void test0040() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0040");
        org.mockito.asm.ByteVector byteVector1 = new org.mockito.asm.ByteVector(10);
    }

    @Test
    public void test0041() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0041");
        org.mockito.asm.ByteVector byteVector0 = new org.mockito.asm.ByteVector();
        org.mockito.asm.ByteVector byteVector2 = byteVector0.putUTF8("hi!");
        org.mockito.asm.ByteVector byteVector4 = byteVector0.putLong((long) ' ');
        org.mockito.asm.ByteVector byteVector6 = byteVector4.putByte((int) 'a');
        org.mockito.asm.ByteVector byteVector8 = byteVector4.putByte((int) (short) -1);
        org.mockito.asm.ByteVector byteVector10 = byteVector4.putLong(0L);
        org.mockito.asm.ByteVector byteVector12 = byteVector4.putUTF8("hi!");
        org.mockito.asm.ByteVector byteVector14 = byteVector12.putUTF8("");
        org.mockito.asm.ByteVector byteVector16 = byteVector14.putLong((long) (byte) 10);
        byte[] byteArray23 = new byte[] { (byte) 100, (byte) 0, (byte) 10, (byte) -1, (byte) 100, (byte) -1 };
        // The following exception was thrown during execution in test generation
        try {
            org.mockito.asm.ByteVector byteVector26 = byteVector16.putByteArray(byteArray23, (int) (byte) -1, (int) '#');
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteVector2);
        org.junit.Assert.assertNotNull(byteVector4);
        org.junit.Assert.assertNotNull(byteVector6);
        org.junit.Assert.assertNotNull(byteVector8);
        org.junit.Assert.assertNotNull(byteVector10);
        org.junit.Assert.assertNotNull(byteVector12);
        org.junit.Assert.assertNotNull(byteVector14);
        org.junit.Assert.assertNotNull(byteVector16);
        org.junit.Assert.assertNotNull(byteArray23);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray23), "[100, 0, 10, -1, 100, -1]");
    }

    @Test
    public void test0042() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0042");
        org.mockito.asm.ByteVector byteVector0 = new org.mockito.asm.ByteVector();
        org.mockito.asm.ByteVector byteVector2 = byteVector0.putUTF8("hi!");
        org.mockito.asm.ByteVector byteVector4 = byteVector2.putInt(0);
        org.mockito.asm.ByteVector byteVector6 = byteVector2.putByte((int) (byte) 10);
        org.mockito.asm.ByteVector byteVector8 = byteVector6.putUTF8("hi!");
        org.mockito.asm.ByteVector byteVector10 = byteVector8.putUTF8("hi!");
        java.lang.Class<?> wildcardClass11 = byteVector8.getClass();
        org.junit.Assert.assertNotNull(byteVector2);
        org.junit.Assert.assertNotNull(byteVector4);
        org.junit.Assert.assertNotNull(byteVector6);
        org.junit.Assert.assertNotNull(byteVector8);
        org.junit.Assert.assertNotNull(byteVector10);
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test0043() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0043");
        org.mockito.asm.ByteVector byteVector0 = new org.mockito.asm.ByteVector();
        org.mockito.asm.ByteVector byteVector2 = byteVector0.putUTF8("hi!");
        org.mockito.asm.ByteVector byteVector4 = byteVector0.putLong((long) ' ');
        org.mockito.asm.ByteVector byteVector6 = byteVector4.putByte((int) 'a');
        org.mockito.asm.ByteVector byteVector8 = byteVector6.putByte((int) (short) -1);
        org.mockito.asm.ByteVector byteVector10 = byteVector8.putLong((long) (byte) -1);
        org.mockito.asm.ByteVector byteVector12 = byteVector8.putByte((int) '4');
        org.mockito.asm.ByteVector byteVector14 = byteVector12.putLong((long) (short) 10);
        java.lang.Class<?> wildcardClass15 = byteVector14.getClass();
        org.junit.Assert.assertNotNull(byteVector2);
        org.junit.Assert.assertNotNull(byteVector4);
        org.junit.Assert.assertNotNull(byteVector6);
        org.junit.Assert.assertNotNull(byteVector8);
        org.junit.Assert.assertNotNull(byteVector10);
        org.junit.Assert.assertNotNull(byteVector12);
        org.junit.Assert.assertNotNull(byteVector14);
        org.junit.Assert.assertNotNull(wildcardClass15);
    }

    @Test
    public void test0044() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0044");
        org.mockito.asm.ByteVector byteVector0 = new org.mockito.asm.ByteVector();
        org.mockito.asm.ByteVector byteVector2 = byteVector0.putUTF8("hi!");
        org.mockito.asm.ByteVector byteVector4 = byteVector2.putInt((int) (byte) 10);
        org.mockito.asm.ByteVector byteVector6 = byteVector4.putByte((int) (short) 100);
        org.mockito.asm.ByteVector byteVector8 = byteVector4.putInt((int) '4');
        java.lang.Class<?> wildcardClass9 = byteVector8.getClass();
        org.junit.Assert.assertNotNull(byteVector2);
        org.junit.Assert.assertNotNull(byteVector4);
        org.junit.Assert.assertNotNull(byteVector6);
        org.junit.Assert.assertNotNull(byteVector8);
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test0045() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0045");
        org.mockito.asm.ByteVector byteVector0 = new org.mockito.asm.ByteVector();
        org.mockito.asm.ByteVector byteVector2 = byteVector0.putUTF8("hi!");
        org.mockito.asm.ByteVector byteVector4 = byteVector0.putLong((long) ' ');
        org.mockito.asm.ByteVector byteVector6 = byteVector4.putByte((int) 'a');
        org.mockito.asm.ByteVector byteVector8 = byteVector4.putByte((int) (short) -1);
        org.mockito.asm.ByteVector byteVector10 = byteVector4.putLong(0L);
        org.mockito.asm.ByteVector byteVector12 = byteVector4.putUTF8("hi!");
        org.mockito.asm.ByteVector byteVector14 = byteVector12.putUTF8("hi!");
        org.mockito.asm.ByteVector byteVector16 = byteVector12.putShort((int) '#');
        java.lang.Class<?> wildcardClass17 = byteVector16.getClass();
        org.junit.Assert.assertNotNull(byteVector2);
        org.junit.Assert.assertNotNull(byteVector4);
        org.junit.Assert.assertNotNull(byteVector6);
        org.junit.Assert.assertNotNull(byteVector8);
        org.junit.Assert.assertNotNull(byteVector10);
        org.junit.Assert.assertNotNull(byteVector12);
        org.junit.Assert.assertNotNull(byteVector14);
        org.junit.Assert.assertNotNull(byteVector16);
        org.junit.Assert.assertNotNull(wildcardClass17);
    }

    @Test
    public void test0046() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0046");
        org.mockito.asm.ByteVector byteVector0 = new org.mockito.asm.ByteVector();
        org.mockito.asm.ByteVector byteVector2 = byteVector0.putUTF8("hi!");
        org.mockito.asm.ByteVector byteVector4 = byteVector0.putLong((long) ' ');
        org.mockito.asm.ByteVector byteVector6 = byteVector4.putByte((int) 'a');
        org.mockito.asm.ByteVector byteVector8 = byteVector6.putByte((int) (short) -1);
        org.mockito.asm.ByteVector byteVector10 = byteVector8.putLong((long) (byte) -1);
        org.mockito.asm.ByteVector byteVector12 = byteVector8.putByte((int) '4');
        java.lang.Class<?> wildcardClass13 = byteVector8.getClass();
        org.junit.Assert.assertNotNull(byteVector2);
        org.junit.Assert.assertNotNull(byteVector4);
        org.junit.Assert.assertNotNull(byteVector6);
        org.junit.Assert.assertNotNull(byteVector8);
        org.junit.Assert.assertNotNull(byteVector10);
        org.junit.Assert.assertNotNull(byteVector12);
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test0047() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0047");
        org.mockito.asm.ByteVector byteVector0 = new org.mockito.asm.ByteVector();
        org.mockito.asm.ByteVector byteVector2 = byteVector0.putUTF8("hi!");
        org.mockito.asm.ByteVector byteVector4 = byteVector2.putInt(0);
        org.mockito.asm.ByteVector byteVector6 = byteVector4.putShort((int) '4');
        org.mockito.asm.ByteVector byteVector8 = byteVector6.putByte(100);
        org.mockito.asm.ByteVector byteVector10 = byteVector6.putInt((int) (byte) 10);
        java.lang.Class<?> wildcardClass11 = byteVector6.getClass();
        org.junit.Assert.assertNotNull(byteVector2);
        org.junit.Assert.assertNotNull(byteVector4);
        org.junit.Assert.assertNotNull(byteVector6);
        org.junit.Assert.assertNotNull(byteVector8);
        org.junit.Assert.assertNotNull(byteVector10);
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test0048() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0048");
        org.mockito.asm.ByteVector byteVector1 = new org.mockito.asm.ByteVector((int) '#');
        org.mockito.asm.ByteVector byteVector3 = byteVector1.putUTF8("hi!");
        java.lang.Class<?> wildcardClass4 = byteVector3.getClass();
        org.junit.Assert.assertNotNull(byteVector3);
        org.junit.Assert.assertNotNull(wildcardClass4);
    }

    @Test
    public void test0049() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0049");
        org.mockito.asm.ByteVector byteVector0 = new org.mockito.asm.ByteVector();
        org.mockito.asm.ByteVector byteVector2 = byteVector0.putUTF8("hi!");
        org.mockito.asm.ByteVector byteVector4 = byteVector0.putLong((long) ' ');
        org.mockito.asm.ByteVector byteVector6 = byteVector4.putByte((int) 'a');
        org.mockito.asm.ByteVector byteVector8 = byteVector4.putByte((int) (short) -1);
        org.mockito.asm.ByteVector byteVector10 = byteVector4.putLong(0L);
        org.mockito.asm.ByteVector byteVector12 = byteVector10.putInt((int) (short) -1);
        byte[] byteArray18 = new byte[] { (byte) 10, (byte) 100, (byte) -1, (byte) 0, (byte) -1 };
        // The following exception was thrown during execution in test generation
        try {
            org.mockito.asm.ByteVector byteVector21 = byteVector10.putByteArray(byteArray18, (int) (byte) -1, (int) 'a');
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteVector2);
        org.junit.Assert.assertNotNull(byteVector4);
        org.junit.Assert.assertNotNull(byteVector6);
        org.junit.Assert.assertNotNull(byteVector8);
        org.junit.Assert.assertNotNull(byteVector10);
        org.junit.Assert.assertNotNull(byteVector12);
        org.junit.Assert.assertNotNull(byteArray18);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray18), "[10, 100, -1, 0, -1]");
    }

    @Test
    public void test0050() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0050");
        org.mockito.asm.ByteVector byteVector0 = new org.mockito.asm.ByteVector();
        org.mockito.asm.ByteVector byteVector2 = byteVector0.putUTF8("hi!");
        org.mockito.asm.ByteVector byteVector4 = byteVector2.putLong((long) (byte) 10);
        org.mockito.asm.ByteVector byteVector6 = byteVector2.putInt((int) (short) 1);
        org.mockito.asm.ByteVector byteVector8 = byteVector2.putLong((long) (short) 10);
        byte[] byteArray11 = new byte[] { (byte) 0, (byte) 10 };
        // The following exception was thrown during execution in test generation
        try {
            org.mockito.asm.ByteVector byteVector14 = byteVector8.putByteArray(byteArray11, (int) (byte) -1, (int) (byte) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteVector2);
        org.junit.Assert.assertNotNull(byteVector4);
        org.junit.Assert.assertNotNull(byteVector6);
        org.junit.Assert.assertNotNull(byteVector8);
        org.junit.Assert.assertNotNull(byteArray11);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray11), "[0, 10]");
    }

    @Test
    public void test0051() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0051");
        org.mockito.asm.ByteVector byteVector0 = new org.mockito.asm.ByteVector();
        org.mockito.asm.ByteVector byteVector2 = byteVector0.putUTF8("hi!");
        org.mockito.asm.ByteVector byteVector4 = byteVector0.putLong((long) ' ');
        org.mockito.asm.ByteVector byteVector6 = byteVector4.putByte((int) 'a');
        org.mockito.asm.ByteVector byteVector8 = byteVector4.putByte((int) (short) -1);
        org.mockito.asm.ByteVector byteVector10 = byteVector4.putLong(0L);
        org.mockito.asm.ByteVector byteVector12 = byteVector4.putUTF8("hi!");
        java.lang.Class<?> wildcardClass13 = byteVector12.getClass();
        org.junit.Assert.assertNotNull(byteVector2);
        org.junit.Assert.assertNotNull(byteVector4);
        org.junit.Assert.assertNotNull(byteVector6);
        org.junit.Assert.assertNotNull(byteVector8);
        org.junit.Assert.assertNotNull(byteVector10);
        org.junit.Assert.assertNotNull(byteVector12);
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test0052() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0052");
        org.mockito.asm.ByteVector byteVector0 = new org.mockito.asm.ByteVector();
        org.mockito.asm.ByteVector byteVector2 = byteVector0.putUTF8("hi!");
        org.mockito.asm.ByteVector byteVector4 = byteVector2.putInt(0);
        org.mockito.asm.ByteVector byteVector6 = byteVector4.putShort((int) '4');
        org.mockito.asm.ByteVector byteVector8 = byteVector6.putByte(100);
        org.mockito.asm.ByteVector byteVector10 = byteVector6.putInt((int) (byte) 10);
        java.lang.Class<?> wildcardClass11 = byteVector10.getClass();
        org.junit.Assert.assertNotNull(byteVector2);
        org.junit.Assert.assertNotNull(byteVector4);
        org.junit.Assert.assertNotNull(byteVector6);
        org.junit.Assert.assertNotNull(byteVector8);
        org.junit.Assert.assertNotNull(byteVector10);
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test0053() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0053");
        org.mockito.asm.ByteVector byteVector0 = new org.mockito.asm.ByteVector();
        org.mockito.asm.ByteVector byteVector2 = byteVector0.putUTF8("hi!");
        org.mockito.asm.ByteVector byteVector4 = byteVector0.putInt(0);
        org.mockito.asm.ByteVector byteVector6 = byteVector4.putInt((int) ' ');
        org.mockito.asm.ByteVector byteVector8 = byteVector6.putLong((long) (short) 10);
        org.mockito.asm.ByteVector byteVector10 = byteVector6.putInt((int) '4');
        byte[] byteArray11 = new byte[] {};
        // The following exception was thrown during execution in test generation
        try {
            org.mockito.asm.ByteVector byteVector14 = byteVector10.putByteArray(byteArray11, (int) (byte) -1, (int) 'a');
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteVector2);
        org.junit.Assert.assertNotNull(byteVector4);
        org.junit.Assert.assertNotNull(byteVector6);
        org.junit.Assert.assertNotNull(byteVector8);
        org.junit.Assert.assertNotNull(byteVector10);
        org.junit.Assert.assertNotNull(byteArray11);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray11), "[]");
    }

    @Test
    public void test0054() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0054");
        org.mockito.asm.ByteVector byteVector0 = new org.mockito.asm.ByteVector();
        org.mockito.asm.ByteVector byteVector2 = byteVector0.putUTF8("hi!");
        org.mockito.asm.ByteVector byteVector4 = byteVector0.putShort((int) (short) -1);
        java.lang.Class<?> wildcardClass5 = byteVector0.getClass();
        org.junit.Assert.assertNotNull(byteVector2);
        org.junit.Assert.assertNotNull(byteVector4);
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test0055() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0055");
        org.mockito.asm.ByteVector byteVector0 = new org.mockito.asm.ByteVector();
        org.mockito.asm.ByteVector byteVector2 = byteVector0.putUTF8("hi!");
        org.mockito.asm.ByteVector byteVector4 = byteVector0.putLong((long) (short) 1);
        org.mockito.asm.ByteVector byteVector6 = byteVector4.putUTF8("");
        java.lang.Class<?> wildcardClass7 = byteVector4.getClass();
        org.junit.Assert.assertNotNull(byteVector2);
        org.junit.Assert.assertNotNull(byteVector4);
        org.junit.Assert.assertNotNull(byteVector6);
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test0056() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0056");
        org.mockito.asm.ByteVector byteVector0 = new org.mockito.asm.ByteVector();
        org.mockito.asm.ByteVector byteVector2 = byteVector0.putUTF8("hi!");
        org.mockito.asm.ByteVector byteVector4 = byteVector2.putInt(0);
        org.mockito.asm.ByteVector byteVector6 = byteVector4.putShort((int) '4');
        java.lang.Class<?> wildcardClass7 = byteVector6.getClass();
        org.junit.Assert.assertNotNull(byteVector2);
        org.junit.Assert.assertNotNull(byteVector4);
        org.junit.Assert.assertNotNull(byteVector6);
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test0057() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0057");
        org.mockito.asm.ByteVector byteVector0 = new org.mockito.asm.ByteVector();
        org.mockito.asm.ByteVector byteVector2 = byteVector0.putUTF8("hi!");
        org.mockito.asm.ByteVector byteVector4 = byteVector2.putLong((long) (byte) 10);
        org.mockito.asm.ByteVector byteVector6 = byteVector4.putUTF8("hi!");
        org.mockito.asm.ByteVector byteVector8 = byteVector4.putLong((long) (short) -1);
        org.mockito.asm.ByteVector byteVector10 = byteVector8.putInt(10);
        java.lang.Class<?> wildcardClass11 = byteVector8.getClass();
        org.junit.Assert.assertNotNull(byteVector2);
        org.junit.Assert.assertNotNull(byteVector4);
        org.junit.Assert.assertNotNull(byteVector6);
        org.junit.Assert.assertNotNull(byteVector8);
        org.junit.Assert.assertNotNull(byteVector10);
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test0058() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0058");
        org.mockito.asm.ByteVector byteVector0 = new org.mockito.asm.ByteVector();
        org.mockito.asm.ByteVector byteVector2 = byteVector0.putUTF8("hi!");
        org.mockito.asm.ByteVector byteVector4 = byteVector0.putLong((long) ' ');
        org.mockito.asm.ByteVector byteVector6 = byteVector4.putByte((int) 'a');
        org.mockito.asm.ByteVector byteVector8 = byteVector4.putByte((int) (short) -1);
        org.mockito.asm.ByteVector byteVector10 = byteVector4.putLong(0L);
        org.mockito.asm.ByteVector byteVector12 = byteVector10.putByte(0);
        org.mockito.asm.ByteVector byteVector14 = byteVector12.putByte(100);
        org.mockito.asm.ByteVector byteVector16 = byteVector12.putByte((int) '4');
        byte[] byteArray19 = new byte[] { (byte) 0, (byte) 100 };
        // The following exception was thrown during execution in test generation
        try {
            org.mockito.asm.ByteVector byteVector22 = byteVector16.putByteArray(byteArray19, 10, 100);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteVector2);
        org.junit.Assert.assertNotNull(byteVector4);
        org.junit.Assert.assertNotNull(byteVector6);
        org.junit.Assert.assertNotNull(byteVector8);
        org.junit.Assert.assertNotNull(byteVector10);
        org.junit.Assert.assertNotNull(byteVector12);
        org.junit.Assert.assertNotNull(byteVector14);
        org.junit.Assert.assertNotNull(byteVector16);
        org.junit.Assert.assertNotNull(byteArray19);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray19), "[0, 100]");
    }

    @Test
    public void test0059() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0059");
        org.mockito.asm.ByteVector byteVector0 = new org.mockito.asm.ByteVector();
        org.mockito.asm.ByteVector byteVector2 = byteVector0.putUTF8("hi!");
        org.mockito.asm.ByteVector byteVector4 = byteVector0.putLong((long) ' ');
        org.mockito.asm.ByteVector byteVector6 = byteVector4.putLong((long) (short) 0);
        org.junit.Assert.assertNotNull(byteVector2);
        org.junit.Assert.assertNotNull(byteVector4);
        org.junit.Assert.assertNotNull(byteVector6);
    }

    @Test
    public void test0060() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0060");
        org.mockito.asm.ByteVector byteVector1 = new org.mockito.asm.ByteVector((int) '#');
        org.mockito.asm.ByteVector byteVector3 = byteVector1.putLong(100L);
        org.mockito.asm.ByteVector byteVector5 = byteVector3.putUTF8("");
        org.mockito.asm.ByteVector byteVector7 = byteVector3.putShort((int) (short) -1);
        byte[] byteArray13 = new byte[] { (byte) -1, (byte) 0, (byte) 100, (byte) 1, (byte) 0 };
        // The following exception was thrown during execution in test generation
        try {
            org.mockito.asm.ByteVector byteVector16 = byteVector3.putByteArray(byteArray13, (-1), 100);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteVector3);
        org.junit.Assert.assertNotNull(byteVector5);
        org.junit.Assert.assertNotNull(byteVector7);
        org.junit.Assert.assertNotNull(byteArray13);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray13), "[-1, 0, 100, 1, 0]");
    }

    @Test
    public void test0061() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0061");
        org.mockito.asm.ByteVector byteVector1 = new org.mockito.asm.ByteVector((int) '#');
        org.mockito.asm.ByteVector byteVector3 = byteVector1.putInt(100);
        org.mockito.asm.ByteVector byteVector5 = byteVector3.putShort((int) (short) -1);
        java.lang.Class<?> wildcardClass6 = byteVector5.getClass();
        org.junit.Assert.assertNotNull(byteVector3);
        org.junit.Assert.assertNotNull(byteVector5);
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void test0062() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0062");
        org.mockito.asm.ByteVector byteVector0 = new org.mockito.asm.ByteVector();
        org.mockito.asm.ByteVector byteVector2 = byteVector0.putUTF8("hi!");
        org.mockito.asm.ByteVector byteVector4 = byteVector0.putLong((long) ' ');
        org.mockito.asm.ByteVector byteVector6 = byteVector4.putByte((int) 'a');
        org.mockito.asm.ByteVector byteVector8 = byteVector4.putByte((int) (short) -1);
        org.mockito.asm.ByteVector byteVector10 = byteVector4.putLong(0L);
        org.mockito.asm.ByteVector byteVector12 = byteVector10.putByte(0);
        org.mockito.asm.ByteVector byteVector14 = byteVector10.putLong((long) '4');
        java.lang.Class<?> wildcardClass15 = byteVector14.getClass();
        org.junit.Assert.assertNotNull(byteVector2);
        org.junit.Assert.assertNotNull(byteVector4);
        org.junit.Assert.assertNotNull(byteVector6);
        org.junit.Assert.assertNotNull(byteVector8);
        org.junit.Assert.assertNotNull(byteVector10);
        org.junit.Assert.assertNotNull(byteVector12);
        org.junit.Assert.assertNotNull(byteVector14);
        org.junit.Assert.assertNotNull(wildcardClass15);
    }

    @Test
    public void test0063() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0063");
        org.mockito.asm.ByteVector byteVector0 = new org.mockito.asm.ByteVector();
        org.mockito.asm.ByteVector byteVector2 = byteVector0.putUTF8("hi!");
        org.mockito.asm.ByteVector byteVector4 = byteVector0.putShort((int) (short) -1);
        org.mockito.asm.ByteVector byteVector6 = byteVector0.putByte((int) ' ');
        java.lang.Class<?> wildcardClass7 = byteVector6.getClass();
        org.junit.Assert.assertNotNull(byteVector2);
        org.junit.Assert.assertNotNull(byteVector4);
        org.junit.Assert.assertNotNull(byteVector6);
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test0064() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0064");
        org.mockito.asm.ByteVector byteVector1 = new org.mockito.asm.ByteVector((int) '#');
        org.mockito.asm.ByteVector byteVector3 = byteVector1.putUTF8("hi!");
        java.lang.Class<?> wildcardClass4 = byteVector1.getClass();
        org.junit.Assert.assertNotNull(byteVector3);
        org.junit.Assert.assertNotNull(wildcardClass4);
    }

    @Test
    public void test0065() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0065");
        org.mockito.asm.ByteVector byteVector1 = new org.mockito.asm.ByteVector((int) '#');
        org.mockito.asm.ByteVector byteVector3 = byteVector1.putLong(100L);
        org.mockito.asm.ByteVector byteVector5 = byteVector3.putLong(1L);
        java.lang.Class<?> wildcardClass6 = byteVector5.getClass();
        org.junit.Assert.assertNotNull(byteVector3);
        org.junit.Assert.assertNotNull(byteVector5);
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void test0066() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0066");
        org.mockito.asm.ByteVector byteVector0 = new org.mockito.asm.ByteVector();
        org.mockito.asm.ByteVector byteVector2 = byteVector0.putUTF8("hi!");
        org.mockito.asm.ByteVector byteVector4 = byteVector0.putLong((long) ' ');
        org.mockito.asm.ByteVector byteVector6 = byteVector4.putByte((int) 'a');
        org.mockito.asm.ByteVector byteVector8 = byteVector6.putInt((int) (short) 1);
        java.lang.Class<?> wildcardClass9 = byteVector6.getClass();
        org.junit.Assert.assertNotNull(byteVector2);
        org.junit.Assert.assertNotNull(byteVector4);
        org.junit.Assert.assertNotNull(byteVector6);
        org.junit.Assert.assertNotNull(byteVector8);
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test0067() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0067");
        org.mockito.asm.ByteVector byteVector0 = new org.mockito.asm.ByteVector();
        org.mockito.asm.ByteVector byteVector2 = byteVector0.putUTF8("hi!");
        org.mockito.asm.ByteVector byteVector4 = byteVector0.putInt(0);
        org.mockito.asm.ByteVector byteVector6 = byteVector0.putShort((int) '4');
        org.mockito.asm.ByteVector byteVector8 = byteVector0.putByte(100);
        org.mockito.asm.ByteVector byteVector10 = byteVector8.putInt((int) (byte) 10);
        org.mockito.asm.ByteVector byteVector12 = byteVector10.putByte((int) (byte) 1);
        org.mockito.asm.ByteVector byteVector14 = byteVector10.putUTF8("hi!");
        org.mockito.asm.ByteVector byteVector16 = byteVector10.putShort((int) (short) -1);
        org.junit.Assert.assertNotNull(byteVector2);
        org.junit.Assert.assertNotNull(byteVector4);
        org.junit.Assert.assertNotNull(byteVector6);
        org.junit.Assert.assertNotNull(byteVector8);
        org.junit.Assert.assertNotNull(byteVector10);
        org.junit.Assert.assertNotNull(byteVector12);
        org.junit.Assert.assertNotNull(byteVector14);
        org.junit.Assert.assertNotNull(byteVector16);
    }

    @Test
    public void test0068() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0068");
        org.mockito.asm.ByteVector byteVector0 = new org.mockito.asm.ByteVector();
        org.mockito.asm.ByteVector byteVector2 = byteVector0.putUTF8("hi!");
        org.mockito.asm.ByteVector byteVector4 = byteVector2.putInt(0);
        org.mockito.asm.ByteVector byteVector6 = byteVector4.putByte((int) (short) 0);
        java.lang.Class<?> wildcardClass7 = byteVector4.getClass();
        org.junit.Assert.assertNotNull(byteVector2);
        org.junit.Assert.assertNotNull(byteVector4);
        org.junit.Assert.assertNotNull(byteVector6);
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test0069() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0069");
        org.mockito.asm.ByteVector byteVector0 = new org.mockito.asm.ByteVector();
        org.mockito.asm.ByteVector byteVector2 = byteVector0.putUTF8("hi!");
        org.mockito.asm.ByteVector byteVector4 = byteVector0.putLong((long) ' ');
        org.mockito.asm.ByteVector byteVector6 = byteVector4.putByte((int) 'a');
        org.mockito.asm.ByteVector byteVector8 = byteVector4.putByte((int) (short) -1);
        org.mockito.asm.ByteVector byteVector10 = byteVector4.putLong(0L);
        org.mockito.asm.ByteVector byteVector12 = byteVector10.putInt((int) (short) -1);
        org.mockito.asm.ByteVector byteVector14 = byteVector12.putByte(100);
        java.lang.Class<?> wildcardClass15 = byteVector14.getClass();
        org.junit.Assert.assertNotNull(byteVector2);
        org.junit.Assert.assertNotNull(byteVector4);
        org.junit.Assert.assertNotNull(byteVector6);
        org.junit.Assert.assertNotNull(byteVector8);
        org.junit.Assert.assertNotNull(byteVector10);
        org.junit.Assert.assertNotNull(byteVector12);
        org.junit.Assert.assertNotNull(byteVector14);
        org.junit.Assert.assertNotNull(wildcardClass15);
    }

    @Test
    public void test0070() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0070");
        org.mockito.asm.ByteVector byteVector0 = new org.mockito.asm.ByteVector();
        org.mockito.asm.ByteVector byteVector2 = byteVector0.putUTF8("hi!");
        org.mockito.asm.ByteVector byteVector4 = byteVector0.putLong((long) ' ');
        org.mockito.asm.ByteVector byteVector6 = byteVector4.putByte((int) 'a');
        org.mockito.asm.ByteVector byteVector8 = byteVector4.putByte((int) (short) -1);
        org.mockito.asm.ByteVector byteVector10 = byteVector4.putLong(0L);
        org.mockito.asm.ByteVector byteVector12 = byteVector10.putByte(0);
        org.mockito.asm.ByteVector byteVector14 = byteVector12.putByte(100);
        org.mockito.asm.ByteVector byteVector16 = byteVector12.putInt((-1));
        org.mockito.asm.ByteVector byteVector18 = byteVector12.putByte((int) (byte) 100);
        java.lang.Class<?> wildcardClass19 = byteVector12.getClass();
        org.junit.Assert.assertNotNull(byteVector2);
        org.junit.Assert.assertNotNull(byteVector4);
        org.junit.Assert.assertNotNull(byteVector6);
        org.junit.Assert.assertNotNull(byteVector8);
        org.junit.Assert.assertNotNull(byteVector10);
        org.junit.Assert.assertNotNull(byteVector12);
        org.junit.Assert.assertNotNull(byteVector14);
        org.junit.Assert.assertNotNull(byteVector16);
        org.junit.Assert.assertNotNull(byteVector18);
        org.junit.Assert.assertNotNull(wildcardClass19);
    }

    @Test
    public void test0071() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0071");
        org.mockito.asm.ByteVector byteVector0 = new org.mockito.asm.ByteVector();
        org.mockito.asm.ByteVector byteVector2 = byteVector0.putUTF8("hi!");
        org.mockito.asm.ByteVector byteVector4 = byteVector0.putLong((long) ' ');
        org.mockito.asm.ByteVector byteVector6 = byteVector4.putByte((int) 'a');
        org.mockito.asm.ByteVector byteVector8 = byteVector4.putByte((int) (short) -1);
        org.mockito.asm.ByteVector byteVector10 = byteVector4.putLong(0L);
        org.mockito.asm.ByteVector byteVector12 = byteVector4.putUTF8("hi!");
        org.mockito.asm.ByteVector byteVector14 = byteVector12.putUTF8("");
        org.mockito.asm.ByteVector byteVector16 = byteVector14.putLong((long) (byte) 10);
        org.mockito.asm.ByteVector byteVector18 = byteVector14.putLong((long) (short) 100);
        byte[] byteArray23 = new byte[] { (byte) 1, (byte) 0, (byte) 0, (byte) -1 };
        org.mockito.asm.ByteVector byteVector26 = byteVector14.putByteArray(byteArray23, 0, 0);
        java.lang.Class<?> wildcardClass27 = byteVector26.getClass();
        org.junit.Assert.assertNotNull(byteVector2);
        org.junit.Assert.assertNotNull(byteVector4);
        org.junit.Assert.assertNotNull(byteVector6);
        org.junit.Assert.assertNotNull(byteVector8);
        org.junit.Assert.assertNotNull(byteVector10);
        org.junit.Assert.assertNotNull(byteVector12);
        org.junit.Assert.assertNotNull(byteVector14);
        org.junit.Assert.assertNotNull(byteVector16);
        org.junit.Assert.assertNotNull(byteVector18);
        org.junit.Assert.assertNotNull(byteArray23);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray23), "[1, 0, 0, -1]");
        org.junit.Assert.assertNotNull(byteVector26);
        org.junit.Assert.assertNotNull(wildcardClass27);
    }

    @Test
    public void test0072() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0072");
        org.mockito.asm.ByteVector byteVector0 = new org.mockito.asm.ByteVector();
        org.mockito.asm.ByteVector byteVector2 = byteVector0.putUTF8("hi!");
        org.mockito.asm.ByteVector byteVector4 = byteVector2.putLong((long) (byte) 10);
        org.mockito.asm.ByteVector byteVector6 = byteVector2.putInt((int) (short) 1);
        org.mockito.asm.ByteVector byteVector8 = byteVector2.putLong((long) (short) 10);
        byte[] byteArray12 = new byte[] { (byte) 10, (byte) -1, (byte) 10 };
        // The following exception was thrown during execution in test generation
        try {
            org.mockito.asm.ByteVector byteVector15 = byteVector8.putByteArray(byteArray12, (int) (byte) 10, (int) (byte) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteVector2);
        org.junit.Assert.assertNotNull(byteVector4);
        org.junit.Assert.assertNotNull(byteVector6);
        org.junit.Assert.assertNotNull(byteVector8);
        org.junit.Assert.assertNotNull(byteArray12);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray12), "[10, -1, 10]");
    }

    @Test
    public void test0073() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0073");
        org.mockito.asm.ByteVector byteVector1 = new org.mockito.asm.ByteVector((int) '#');
        org.mockito.asm.ByteVector byteVector3 = byteVector1.putLong(100L);
        org.mockito.asm.ByteVector byteVector5 = byteVector1.putInt((int) ' ');
        org.mockito.asm.ByteVector byteVector7 = byteVector1.putInt((int) (short) 0);
        org.mockito.asm.ByteVector byteVector8 = new org.mockito.asm.ByteVector();
        org.mockito.asm.ByteVector byteVector10 = byteVector8.putUTF8("hi!");
        org.mockito.asm.ByteVector byteVector12 = byteVector8.putLong((long) ' ');
        org.mockito.asm.ByteVector byteVector14 = byteVector12.putByte((int) 'a');
        org.mockito.asm.ByteVector byteVector16 = byteVector12.putByte((int) (short) -1);
        org.mockito.asm.ByteVector byteVector18 = byteVector12.putLong(0L);
        org.mockito.asm.ByteVector byteVector20 = byteVector12.putUTF8("hi!");
        org.mockito.asm.ByteVector byteVector22 = byteVector20.putUTF8("");
        org.mockito.asm.ByteVector byteVector24 = byteVector22.putLong((long) (byte) 10);
        org.mockito.asm.ByteVector byteVector26 = byteVector22.putLong((long) (short) 100);
        byte[] byteArray31 = new byte[] { (byte) 1, (byte) 0, (byte) 0, (byte) -1 };
        org.mockito.asm.ByteVector byteVector34 = byteVector22.putByteArray(byteArray31, 0, 0);
        // The following exception was thrown during execution in test generation
        try {
            org.mockito.asm.ByteVector byteVector37 = byteVector7.putByteArray(byteArray31, (int) (byte) 10, 1);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteVector3);
        org.junit.Assert.assertNotNull(byteVector5);
        org.junit.Assert.assertNotNull(byteVector7);
        org.junit.Assert.assertNotNull(byteVector10);
        org.junit.Assert.assertNotNull(byteVector12);
        org.junit.Assert.assertNotNull(byteVector14);
        org.junit.Assert.assertNotNull(byteVector16);
        org.junit.Assert.assertNotNull(byteVector18);
        org.junit.Assert.assertNotNull(byteVector20);
        org.junit.Assert.assertNotNull(byteVector22);
        org.junit.Assert.assertNotNull(byteVector24);
        org.junit.Assert.assertNotNull(byteVector26);
        org.junit.Assert.assertNotNull(byteArray31);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray31), "[1, 0, 0, -1]");
        org.junit.Assert.assertNotNull(byteVector34);
    }

    @Test
    public void test0074() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0074");
        org.mockito.asm.ByteVector byteVector0 = new org.mockito.asm.ByteVector();
        org.mockito.asm.ByteVector byteVector2 = byteVector0.putUTF8("hi!");
        org.mockito.asm.ByteVector byteVector4 = byteVector0.putLong((long) ' ');
        org.mockito.asm.ByteVector byteVector6 = byteVector4.putByte((int) 'a');
        org.mockito.asm.ByteVector byteVector8 = byteVector4.putByte((int) (short) -1);
        org.mockito.asm.ByteVector byteVector10 = byteVector4.putLong(0L);
        org.mockito.asm.ByteVector byteVector12 = new org.mockito.asm.ByteVector((int) (short) 0);
        org.mockito.asm.ByteVector byteVector13 = new org.mockito.asm.ByteVector();
        org.mockito.asm.ByteVector byteVector15 = byteVector13.putUTF8("hi!");
        org.mockito.asm.ByteVector byteVector17 = byteVector13.putInt(0);
        org.mockito.asm.ByteVector byteVector19 = byteVector17.putInt((int) ' ');
        org.mockito.asm.ByteVector byteVector21 = byteVector19.putLong(100L);
        byte[] byteArray25 = new byte[] { (byte) 0, (byte) 10, (byte) 1 };
        org.mockito.asm.ByteVector byteVector28 = byteVector19.putByteArray(byteArray25, 0, 0);
        org.mockito.asm.ByteVector byteVector31 = byteVector12.putByteArray(byteArray25, 1, (int) (short) 0);
        // The following exception was thrown during execution in test generation
        try {
            org.mockito.asm.ByteVector byteVector34 = byteVector10.putByteArray(byteArray25, (-1), (int) (byte) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteVector2);
        org.junit.Assert.assertNotNull(byteVector4);
        org.junit.Assert.assertNotNull(byteVector6);
        org.junit.Assert.assertNotNull(byteVector8);
        org.junit.Assert.assertNotNull(byteVector10);
        org.junit.Assert.assertNotNull(byteVector15);
        org.junit.Assert.assertNotNull(byteVector17);
        org.junit.Assert.assertNotNull(byteVector19);
        org.junit.Assert.assertNotNull(byteVector21);
        org.junit.Assert.assertNotNull(byteArray25);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray25), "[0, 10, 1]");
        org.junit.Assert.assertNotNull(byteVector28);
        org.junit.Assert.assertNotNull(byteVector31);
    }

    @Test
    public void test0075() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0075");
        org.mockito.asm.ByteVector byteVector0 = new org.mockito.asm.ByteVector();
        org.mockito.asm.ByteVector byteVector2 = byteVector0.putUTF8("hi!");
        org.mockito.asm.ByteVector byteVector4 = byteVector0.putLong((long) ' ');
        org.mockito.asm.ByteVector byteVector6 = byteVector4.putByte((int) 'a');
        org.mockito.asm.ByteVector byteVector8 = byteVector6.putByte((int) (short) -1);
        org.mockito.asm.ByteVector byteVector10 = byteVector8.putLong((long) (byte) -1);
        org.mockito.asm.ByteVector byteVector11 = new org.mockito.asm.ByteVector();
        org.mockito.asm.ByteVector byteVector13 = byteVector11.putUTF8("hi!");
        org.mockito.asm.ByteVector byteVector15 = byteVector11.putLong((long) ' ');
        org.mockito.asm.ByteVector byteVector17 = byteVector15.putByte((int) 'a');
        org.mockito.asm.ByteVector byteVector19 = byteVector15.putByte((int) (short) -1);
        org.mockito.asm.ByteVector byteVector21 = byteVector15.putLong(0L);
        org.mockito.asm.ByteVector byteVector23 = byteVector15.putUTF8("hi!");
        org.mockito.asm.ByteVector byteVector25 = byteVector23.putUTF8("");
        org.mockito.asm.ByteVector byteVector27 = byteVector25.putLong((long) (byte) 10);
        org.mockito.asm.ByteVector byteVector29 = byteVector25.putLong((long) (short) 100);
        byte[] byteArray34 = new byte[] { (byte) 1, (byte) 0, (byte) 0, (byte) -1 };
        org.mockito.asm.ByteVector byteVector37 = byteVector25.putByteArray(byteArray34, 0, 0);
        // The following exception was thrown during execution in test generation
        try {
            org.mockito.asm.ByteVector byteVector40 = byteVector10.putByteArray(byteArray34, (-1), (int) '4');
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteVector2);
        org.junit.Assert.assertNotNull(byteVector4);
        org.junit.Assert.assertNotNull(byteVector6);
        org.junit.Assert.assertNotNull(byteVector8);
        org.junit.Assert.assertNotNull(byteVector10);
        org.junit.Assert.assertNotNull(byteVector13);
        org.junit.Assert.assertNotNull(byteVector15);
        org.junit.Assert.assertNotNull(byteVector17);
        org.junit.Assert.assertNotNull(byteVector19);
        org.junit.Assert.assertNotNull(byteVector21);
        org.junit.Assert.assertNotNull(byteVector23);
        org.junit.Assert.assertNotNull(byteVector25);
        org.junit.Assert.assertNotNull(byteVector27);
        org.junit.Assert.assertNotNull(byteVector29);
        org.junit.Assert.assertNotNull(byteArray34);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray34), "[1, 0, 0, -1]");
        org.junit.Assert.assertNotNull(byteVector37);
    }

    @Test
    public void test0076() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0076");
        org.mockito.asm.ByteVector byteVector0 = new org.mockito.asm.ByteVector();
        org.mockito.asm.ByteVector byteVector2 = byteVector0.putUTF8("hi!");
        org.mockito.asm.ByteVector byteVector4 = byteVector0.putLong((long) ' ');
        org.mockito.asm.ByteVector byteVector6 = byteVector4.putByte((int) 'a');
        org.mockito.asm.ByteVector byteVector8 = byteVector4.putByte((int) (short) -1);
        org.mockito.asm.ByteVector byteVector10 = byteVector4.putLong(0L);
        java.lang.Class<?> wildcardClass11 = byteVector4.getClass();
        org.junit.Assert.assertNotNull(byteVector2);
        org.junit.Assert.assertNotNull(byteVector4);
        org.junit.Assert.assertNotNull(byteVector6);
        org.junit.Assert.assertNotNull(byteVector8);
        org.junit.Assert.assertNotNull(byteVector10);
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test0077() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0077");
        org.mockito.asm.ByteVector byteVector0 = new org.mockito.asm.ByteVector();
        org.mockito.asm.ByteVector byteVector2 = byteVector0.putUTF8("hi!");
        org.mockito.asm.ByteVector byteVector4 = byteVector0.putLong((long) ' ');
        org.mockito.asm.ByteVector byteVector6 = byteVector4.putByte((int) 'a');
        org.mockito.asm.ByteVector byteVector8 = byteVector4.putByte((int) (short) -1);
        org.mockito.asm.ByteVector byteVector10 = byteVector4.putLong(0L);
        org.mockito.asm.ByteVector byteVector12 = byteVector10.putByte(0);
        org.mockito.asm.ByteVector byteVector14 = byteVector12.putByte(100);
        org.mockito.asm.ByteVector byteVector16 = byteVector12.putByte((int) '4');
        org.mockito.asm.ByteVector byteVector18 = byteVector16.putByte((int) 'a');
        org.mockito.asm.ByteVector byteVector20 = new org.mockito.asm.ByteVector((int) (short) 0);
        org.mockito.asm.ByteVector byteVector21 = new org.mockito.asm.ByteVector();
        org.mockito.asm.ByteVector byteVector23 = byteVector21.putUTF8("hi!");
        org.mockito.asm.ByteVector byteVector25 = byteVector21.putInt(0);
        org.mockito.asm.ByteVector byteVector27 = byteVector25.putInt((int) ' ');
        org.mockito.asm.ByteVector byteVector29 = byteVector27.putLong(100L);
        byte[] byteArray33 = new byte[] { (byte) 0, (byte) 10, (byte) 1 };
        org.mockito.asm.ByteVector byteVector36 = byteVector27.putByteArray(byteArray33, 0, 0);
        org.mockito.asm.ByteVector byteVector39 = byteVector20.putByteArray(byteArray33, 1, (int) (short) 0);
        // The following exception was thrown during execution in test generation
        try {
            org.mockito.asm.ByteVector byteVector42 = byteVector16.putByteArray(byteArray33, (int) (byte) -1, (int) (short) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteVector2);
        org.junit.Assert.assertNotNull(byteVector4);
        org.junit.Assert.assertNotNull(byteVector6);
        org.junit.Assert.assertNotNull(byteVector8);
        org.junit.Assert.assertNotNull(byteVector10);
        org.junit.Assert.assertNotNull(byteVector12);
        org.junit.Assert.assertNotNull(byteVector14);
        org.junit.Assert.assertNotNull(byteVector16);
        org.junit.Assert.assertNotNull(byteVector18);
        org.junit.Assert.assertNotNull(byteVector23);
        org.junit.Assert.assertNotNull(byteVector25);
        org.junit.Assert.assertNotNull(byteVector27);
        org.junit.Assert.assertNotNull(byteVector29);
        org.junit.Assert.assertNotNull(byteArray33);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray33), "[0, 10, 1]");
        org.junit.Assert.assertNotNull(byteVector36);
        org.junit.Assert.assertNotNull(byteVector39);
    }

    @Test
    public void test0078() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0078");
        org.mockito.asm.ByteVector byteVector0 = new org.mockito.asm.ByteVector();
        org.mockito.asm.ByteVector byteVector2 = byteVector0.putUTF8("hi!");
        org.mockito.asm.ByteVector byteVector4 = byteVector2.putInt((int) (byte) 10);
        org.mockito.asm.ByteVector byteVector6 = byteVector4.putUTF8("");
        org.mockito.asm.ByteVector byteVector8 = byteVector4.putLong((long) '#');
        java.lang.Class<?> wildcardClass9 = byteVector4.getClass();
        org.junit.Assert.assertNotNull(byteVector2);
        org.junit.Assert.assertNotNull(byteVector4);
        org.junit.Assert.assertNotNull(byteVector6);
        org.junit.Assert.assertNotNull(byteVector8);
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test0079() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0079");
        org.mockito.asm.ByteVector byteVector1 = new org.mockito.asm.ByteVector((int) '#');
        org.mockito.asm.ByteVector byteVector3 = byteVector1.putInt(100);
        org.mockito.asm.ByteVector byteVector5 = byteVector3.putShort((int) (short) -1);
        org.mockito.asm.ByteVector byteVector7 = byteVector5.putShort((int) (short) 0);
        org.mockito.asm.ByteVector byteVector9 = byteVector5.putUTF8("");
        org.mockito.asm.ByteVector byteVector10 = new org.mockito.asm.ByteVector();
        org.mockito.asm.ByteVector byteVector12 = byteVector10.putUTF8("hi!");
        org.mockito.asm.ByteVector byteVector14 = byteVector10.putLong((long) ' ');
        org.mockito.asm.ByteVector byteVector16 = byteVector14.putByte((int) 'a');
        org.mockito.asm.ByteVector byteVector18 = byteVector14.putByte((int) (short) -1);
        org.mockito.asm.ByteVector byteVector20 = byteVector14.putLong(0L);
        org.mockito.asm.ByteVector byteVector22 = byteVector14.putUTF8("hi!");
        org.mockito.asm.ByteVector byteVector24 = byteVector22.putUTF8("");
        org.mockito.asm.ByteVector byteVector26 = byteVector24.putLong((long) (byte) 10);
        org.mockito.asm.ByteVector byteVector28 = byteVector24.putLong((long) (short) 100);
        byte[] byteArray33 = new byte[] { (byte) 1, (byte) 0, (byte) 0, (byte) -1 };
        org.mockito.asm.ByteVector byteVector36 = byteVector24.putByteArray(byteArray33, 0, 0);
        // The following exception was thrown during execution in test generation
        try {
            org.mockito.asm.ByteVector byteVector39 = byteVector9.putByteArray(byteArray33, (int) (short) 100, (int) (byte) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteVector3);
        org.junit.Assert.assertNotNull(byteVector5);
        org.junit.Assert.assertNotNull(byteVector7);
        org.junit.Assert.assertNotNull(byteVector9);
        org.junit.Assert.assertNotNull(byteVector12);
        org.junit.Assert.assertNotNull(byteVector14);
        org.junit.Assert.assertNotNull(byteVector16);
        org.junit.Assert.assertNotNull(byteVector18);
        org.junit.Assert.assertNotNull(byteVector20);
        org.junit.Assert.assertNotNull(byteVector22);
        org.junit.Assert.assertNotNull(byteVector24);
        org.junit.Assert.assertNotNull(byteVector26);
        org.junit.Assert.assertNotNull(byteVector28);
        org.junit.Assert.assertNotNull(byteArray33);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray33), "[1, 0, 0, -1]");
        org.junit.Assert.assertNotNull(byteVector36);
    }

    @Test
    public void test0080() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0080");
        org.mockito.asm.ByteVector byteVector0 = new org.mockito.asm.ByteVector();
        org.mockito.asm.ByteVector byteVector2 = byteVector0.putUTF8("hi!");
        org.mockito.asm.ByteVector byteVector4 = byteVector0.putInt((int) (short) 1);
        byte[] byteArray7 = new byte[] { (byte) 100, (byte) 10 };
        // The following exception was thrown during execution in test generation
        try {
            org.mockito.asm.ByteVector byteVector10 = byteVector0.putByteArray(byteArray7, (int) (short) -1, (-1));
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteVector2);
        org.junit.Assert.assertNotNull(byteVector4);
        org.junit.Assert.assertNotNull(byteArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray7), "[100, 10]");
    }

    @Test
    public void test0081() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0081");
        org.mockito.asm.ByteVector byteVector1 = new org.mockito.asm.ByteVector((int) '#');
        org.mockito.asm.ByteVector byteVector3 = byteVector1.putLong(100L);
        org.mockito.asm.ByteVector byteVector5 = byteVector1.putInt((int) ' ');
        org.mockito.asm.ByteVector byteVector7 = byteVector1.putInt((int) (short) 0);
        java.lang.Class<?> wildcardClass8 = byteVector7.getClass();
        org.junit.Assert.assertNotNull(byteVector3);
        org.junit.Assert.assertNotNull(byteVector5);
        org.junit.Assert.assertNotNull(byteVector7);
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test0082() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0082");
        org.mockito.asm.ByteVector byteVector0 = new org.mockito.asm.ByteVector();
        org.mockito.asm.ByteVector byteVector2 = byteVector0.putUTF8("hi!");
        org.mockito.asm.ByteVector byteVector4 = byteVector2.putByte(100);
        org.mockito.asm.ByteVector byteVector6 = byteVector2.putShort((int) 'a');
        org.mockito.asm.ByteVector byteVector8 = byteVector6.putByte((int) (short) 1);
        org.mockito.asm.ByteVector byteVector10 = byteVector8.putByte(100);
        org.mockito.asm.ByteVector byteVector11 = new org.mockito.asm.ByteVector();
        org.mockito.asm.ByteVector byteVector13 = byteVector11.putUTF8("hi!");
        org.mockito.asm.ByteVector byteVector15 = byteVector11.putLong((long) ' ');
        org.mockito.asm.ByteVector byteVector17 = byteVector15.putByte((int) 'a');
        org.mockito.asm.ByteVector byteVector19 = byteVector15.putByte((int) (short) -1);
        org.mockito.asm.ByteVector byteVector21 = byteVector15.putLong(0L);
        org.mockito.asm.ByteVector byteVector23 = byteVector15.putUTF8("hi!");
        org.mockito.asm.ByteVector byteVector25 = byteVector23.putUTF8("");
        org.mockito.asm.ByteVector byteVector27 = byteVector23.putInt((int) (byte) 10);
        org.mockito.asm.ByteVector byteVector29 = byteVector23.putByte(0);
        org.mockito.asm.ByteVector byteVector30 = new org.mockito.asm.ByteVector();
        org.mockito.asm.ByteVector byteVector32 = byteVector30.putUTF8("hi!");
        org.mockito.asm.ByteVector byteVector34 = byteVector30.putInt(0);
        org.mockito.asm.ByteVector byteVector36 = byteVector34.putInt((int) ' ');
        org.mockito.asm.ByteVector byteVector38 = byteVector36.putLong(100L);
        byte[] byteArray42 = new byte[] { (byte) 0, (byte) 10, (byte) 1 };
        org.mockito.asm.ByteVector byteVector45 = byteVector36.putByteArray(byteArray42, 0, 0);
        org.mockito.asm.ByteVector byteVector48 = byteVector29.putByteArray(byteArray42, (int) (short) 1, 0);
        // The following exception was thrown during execution in test generation
        try {
            org.mockito.asm.ByteVector byteVector51 = byteVector10.putByteArray(byteArray42, (int) (byte) 10, (int) (short) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteVector2);
        org.junit.Assert.assertNotNull(byteVector4);
        org.junit.Assert.assertNotNull(byteVector6);
        org.junit.Assert.assertNotNull(byteVector8);
        org.junit.Assert.assertNotNull(byteVector10);
        org.junit.Assert.assertNotNull(byteVector13);
        org.junit.Assert.assertNotNull(byteVector15);
        org.junit.Assert.assertNotNull(byteVector17);
        org.junit.Assert.assertNotNull(byteVector19);
        org.junit.Assert.assertNotNull(byteVector21);
        org.junit.Assert.assertNotNull(byteVector23);
        org.junit.Assert.assertNotNull(byteVector25);
        org.junit.Assert.assertNotNull(byteVector27);
        org.junit.Assert.assertNotNull(byteVector29);
        org.junit.Assert.assertNotNull(byteVector32);
        org.junit.Assert.assertNotNull(byteVector34);
        org.junit.Assert.assertNotNull(byteVector36);
        org.junit.Assert.assertNotNull(byteVector38);
        org.junit.Assert.assertNotNull(byteArray42);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray42), "[0, 10, 1]");
        org.junit.Assert.assertNotNull(byteVector45);
        org.junit.Assert.assertNotNull(byteVector48);
    }

    @Test
    public void test0083() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0083");
        org.mockito.asm.ByteVector byteVector0 = new org.mockito.asm.ByteVector();
        org.mockito.asm.ByteVector byteVector2 = byteVector0.putUTF8("hi!");
        org.mockito.asm.ByteVector byteVector4 = byteVector0.putInt(0);
        org.mockito.asm.ByteVector byteVector6 = byteVector4.putInt((int) ' ');
        org.mockito.asm.ByteVector byteVector8 = byteVector6.putLong(100L);
        byte[] byteArray12 = new byte[] { (byte) 0, (byte) 10, (byte) 1 };
        org.mockito.asm.ByteVector byteVector15 = byteVector6.putByteArray(byteArray12, 0, 0);
        java.lang.Class<?> wildcardClass16 = byteArray12.getClass();
        org.junit.Assert.assertNotNull(byteVector2);
        org.junit.Assert.assertNotNull(byteVector4);
        org.junit.Assert.assertNotNull(byteVector6);
        org.junit.Assert.assertNotNull(byteVector8);
        org.junit.Assert.assertNotNull(byteArray12);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray12), "[0, 10, 1]");
        org.junit.Assert.assertNotNull(byteVector15);
        org.junit.Assert.assertNotNull(wildcardClass16);
    }

    @Test
    public void test0084() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0084");
        org.mockito.asm.ByteVector byteVector1 = new org.mockito.asm.ByteVector((int) (byte) 0);
        org.mockito.asm.ByteVector byteVector2 = new org.mockito.asm.ByteVector();
        org.mockito.asm.ByteVector byteVector4 = byteVector2.putUTF8("hi!");
        org.mockito.asm.ByteVector byteVector6 = byteVector2.putInt(0);
        org.mockito.asm.ByteVector byteVector8 = byteVector6.putInt((int) ' ');
        org.mockito.asm.ByteVector byteVector10 = byteVector8.putLong(100L);
        byte[] byteArray14 = new byte[] { (byte) 0, (byte) 10, (byte) 1 };
        org.mockito.asm.ByteVector byteVector17 = byteVector8.putByteArray(byteArray14, 0, 0);
        // The following exception was thrown during execution in test generation
        try {
            org.mockito.asm.ByteVector byteVector20 = byteVector1.putByteArray(byteArray14, (int) (byte) 1, 10);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteVector4);
        org.junit.Assert.assertNotNull(byteVector6);
        org.junit.Assert.assertNotNull(byteVector8);
        org.junit.Assert.assertNotNull(byteVector10);
        org.junit.Assert.assertNotNull(byteArray14);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray14), "[0, 10, 1]");
        org.junit.Assert.assertNotNull(byteVector17);
    }

    @Test
    public void test0085() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0085");
        org.mockito.asm.ByteVector byteVector0 = new org.mockito.asm.ByteVector();
        org.mockito.asm.ByteVector byteVector2 = byteVector0.putUTF8("hi!");
        org.mockito.asm.ByteVector byteVector4 = byteVector0.putShort((int) (short) -1);
        org.mockito.asm.ByteVector byteVector6 = byteVector4.putUTF8("hi!");
        java.lang.Class<?> wildcardClass7 = byteVector4.getClass();
        org.junit.Assert.assertNotNull(byteVector2);
        org.junit.Assert.assertNotNull(byteVector4);
        org.junit.Assert.assertNotNull(byteVector6);
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test0086() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0086");
        org.mockito.asm.ByteVector byteVector0 = new org.mockito.asm.ByteVector();
        org.mockito.asm.ByteVector byteVector2 = byteVector0.putUTF8("hi!");
        org.mockito.asm.ByteVector byteVector4 = byteVector0.putInt(0);
        org.mockito.asm.ByteVector byteVector6 = byteVector0.putShort((int) '4');
        org.mockito.asm.ByteVector byteVector8 = byteVector0.putUTF8("hi!");
        org.mockito.asm.ByteVector byteVector9 = new org.mockito.asm.ByteVector();
        org.mockito.asm.ByteVector byteVector11 = byteVector9.putUTF8("hi!");
        org.mockito.asm.ByteVector byteVector13 = byteVector9.putLong((long) ' ');
        org.mockito.asm.ByteVector byteVector15 = byteVector13.putByte((int) 'a');
        org.mockito.asm.ByteVector byteVector17 = byteVector13.putByte((int) (short) -1);
        org.mockito.asm.ByteVector byteVector19 = byteVector13.putLong(0L);
        org.mockito.asm.ByteVector byteVector21 = byteVector13.putUTF8("hi!");
        org.mockito.asm.ByteVector byteVector23 = byteVector21.putUTF8("");
        org.mockito.asm.ByteVector byteVector25 = byteVector21.putInt((int) (byte) 10);
        org.mockito.asm.ByteVector byteVector27 = byteVector21.putByte(0);
        org.mockito.asm.ByteVector byteVector28 = new org.mockito.asm.ByteVector();
        org.mockito.asm.ByteVector byteVector30 = byteVector28.putUTF8("hi!");
        org.mockito.asm.ByteVector byteVector32 = byteVector28.putInt(0);
        org.mockito.asm.ByteVector byteVector34 = byteVector32.putInt((int) ' ');
        org.mockito.asm.ByteVector byteVector36 = byteVector34.putLong(100L);
        byte[] byteArray40 = new byte[] { (byte) 0, (byte) 10, (byte) 1 };
        org.mockito.asm.ByteVector byteVector43 = byteVector34.putByteArray(byteArray40, 0, 0);
        org.mockito.asm.ByteVector byteVector46 = byteVector27.putByteArray(byteArray40, (int) (short) 1, 0);
        // The following exception was thrown during execution in test generation
        try {
            org.mockito.asm.ByteVector byteVector49 = byteVector0.putByteArray(byteArray40, (int) (byte) 1, (int) (byte) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteVector2);
        org.junit.Assert.assertNotNull(byteVector4);
        org.junit.Assert.assertNotNull(byteVector6);
        org.junit.Assert.assertNotNull(byteVector8);
        org.junit.Assert.assertNotNull(byteVector11);
        org.junit.Assert.assertNotNull(byteVector13);
        org.junit.Assert.assertNotNull(byteVector15);
        org.junit.Assert.assertNotNull(byteVector17);
        org.junit.Assert.assertNotNull(byteVector19);
        org.junit.Assert.assertNotNull(byteVector21);
        org.junit.Assert.assertNotNull(byteVector23);
        org.junit.Assert.assertNotNull(byteVector25);
        org.junit.Assert.assertNotNull(byteVector27);
        org.junit.Assert.assertNotNull(byteVector30);
        org.junit.Assert.assertNotNull(byteVector32);
        org.junit.Assert.assertNotNull(byteVector34);
        org.junit.Assert.assertNotNull(byteVector36);
        org.junit.Assert.assertNotNull(byteArray40);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray40), "[0, 10, 1]");
        org.junit.Assert.assertNotNull(byteVector43);
        org.junit.Assert.assertNotNull(byteVector46);
    }

    @Test
    public void test0087() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0087");
        org.mockito.asm.ByteVector byteVector0 = new org.mockito.asm.ByteVector();
        org.mockito.asm.ByteVector byteVector2 = byteVector0.putUTF8("hi!");
        org.mockito.asm.ByteVector byteVector4 = byteVector2.putLong((long) (byte) 10);
        org.mockito.asm.ByteVector byteVector6 = byteVector4.putUTF8("hi!");
        org.mockito.asm.ByteVector byteVector8 = byteVector4.putLong((long) 10);
        org.mockito.asm.ByteVector byteVector10 = byteVector8.putInt((int) (short) 0);
        java.lang.Class<?> wildcardClass11 = byteVector10.getClass();
        org.junit.Assert.assertNotNull(byteVector2);
        org.junit.Assert.assertNotNull(byteVector4);
        org.junit.Assert.assertNotNull(byteVector6);
        org.junit.Assert.assertNotNull(byteVector8);
        org.junit.Assert.assertNotNull(byteVector10);
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test0088() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0088");
        org.mockito.asm.ByteVector byteVector0 = new org.mockito.asm.ByteVector();
        org.mockito.asm.ByteVector byteVector2 = byteVector0.putUTF8("hi!");
        org.mockito.asm.ByteVector byteVector4 = byteVector0.putShort((int) (short) -1);
        org.mockito.asm.ByteVector byteVector6 = byteVector0.putByte((int) ' ');
        org.mockito.asm.ByteVector byteVector8 = byteVector0.putInt(100);
        org.mockito.asm.ByteVector byteVector10 = new org.mockito.asm.ByteVector((int) (short) 0);
        org.mockito.asm.ByteVector byteVector11 = new org.mockito.asm.ByteVector();
        org.mockito.asm.ByteVector byteVector13 = byteVector11.putUTF8("hi!");
        org.mockito.asm.ByteVector byteVector15 = byteVector11.putInt(0);
        org.mockito.asm.ByteVector byteVector17 = byteVector15.putInt((int) ' ');
        org.mockito.asm.ByteVector byteVector19 = byteVector17.putLong(100L);
        byte[] byteArray23 = new byte[] { (byte) 0, (byte) 10, (byte) 1 };
        org.mockito.asm.ByteVector byteVector26 = byteVector17.putByteArray(byteArray23, 0, 0);
        org.mockito.asm.ByteVector byteVector29 = byteVector10.putByteArray(byteArray23, 1, (int) (short) 0);
        // The following exception was thrown during execution in test generation
        try {
            org.mockito.asm.ByteVector byteVector32 = byteVector8.putByteArray(byteArray23, (int) (short) -1, (int) '#');
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteVector2);
        org.junit.Assert.assertNotNull(byteVector4);
        org.junit.Assert.assertNotNull(byteVector6);
        org.junit.Assert.assertNotNull(byteVector8);
        org.junit.Assert.assertNotNull(byteVector13);
        org.junit.Assert.assertNotNull(byteVector15);
        org.junit.Assert.assertNotNull(byteVector17);
        org.junit.Assert.assertNotNull(byteVector19);
        org.junit.Assert.assertNotNull(byteArray23);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray23), "[0, 10, 1]");
        org.junit.Assert.assertNotNull(byteVector26);
        org.junit.Assert.assertNotNull(byteVector29);
    }

    @Test
    public void test0089() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0089");
        org.mockito.asm.ByteVector byteVector1 = new org.mockito.asm.ByteVector((int) '#');
        org.mockito.asm.ByteVector byteVector3 = byteVector1.putShort(0);
        org.mockito.asm.ByteVector byteVector4 = new org.mockito.asm.ByteVector();
        org.mockito.asm.ByteVector byteVector6 = byteVector4.putUTF8("hi!");
        org.mockito.asm.ByteVector byteVector8 = byteVector4.putLong((long) ' ');
        org.mockito.asm.ByteVector byteVector10 = byteVector8.putByte((int) 'a');
        org.mockito.asm.ByteVector byteVector12 = byteVector8.putByte((int) (short) -1);
        org.mockito.asm.ByteVector byteVector14 = byteVector8.putLong(0L);
        org.mockito.asm.ByteVector byteVector16 = byteVector8.putUTF8("hi!");
        org.mockito.asm.ByteVector byteVector18 = byteVector16.putUTF8("");
        org.mockito.asm.ByteVector byteVector20 = byteVector18.putLong((long) (byte) 10);
        org.mockito.asm.ByteVector byteVector22 = byteVector18.putLong((long) (short) 100);
        byte[] byteArray27 = new byte[] { (byte) 1, (byte) 0, (byte) 0, (byte) -1 };
        org.mockito.asm.ByteVector byteVector30 = byteVector18.putByteArray(byteArray27, 0, 0);
        // The following exception was thrown during execution in test generation
        try {
            org.mockito.asm.ByteVector byteVector33 = byteVector3.putByteArray(byteArray27, (int) ' ', (int) (byte) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteVector3);
        org.junit.Assert.assertNotNull(byteVector6);
        org.junit.Assert.assertNotNull(byteVector8);
        org.junit.Assert.assertNotNull(byteVector10);
        org.junit.Assert.assertNotNull(byteVector12);
        org.junit.Assert.assertNotNull(byteVector14);
        org.junit.Assert.assertNotNull(byteVector16);
        org.junit.Assert.assertNotNull(byteVector18);
        org.junit.Assert.assertNotNull(byteVector20);
        org.junit.Assert.assertNotNull(byteVector22);
        org.junit.Assert.assertNotNull(byteArray27);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray27), "[1, 0, 0, -1]");
        org.junit.Assert.assertNotNull(byteVector30);
    }

    @Test
    public void test0090() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0090");
        org.mockito.asm.ByteVector byteVector0 = new org.mockito.asm.ByteVector();
        org.mockito.asm.ByteVector byteVector2 = byteVector0.putUTF8("hi!");
        org.mockito.asm.ByteVector byteVector4 = byteVector0.putShort((int) (short) -1);
        org.mockito.asm.ByteVector byteVector6 = byteVector0.putInt(0);
        org.mockito.asm.ByteVector byteVector8 = byteVector0.putUTF8("hi!");
        java.lang.Class<?> wildcardClass9 = byteVector0.getClass();
        org.junit.Assert.assertNotNull(byteVector2);
        org.junit.Assert.assertNotNull(byteVector4);
        org.junit.Assert.assertNotNull(byteVector6);
        org.junit.Assert.assertNotNull(byteVector8);
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test0091() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0091");
        org.mockito.asm.ByteVector byteVector0 = new org.mockito.asm.ByteVector();
        org.mockito.asm.ByteVector byteVector2 = byteVector0.putUTF8("hi!");
        org.mockito.asm.ByteVector byteVector4 = byteVector2.putLong((long) (byte) 10);
        org.mockito.asm.ByteVector byteVector6 = byteVector4.putUTF8("hi!");
        org.mockito.asm.ByteVector byteVector8 = byteVector4.putLong((-1L));
        org.mockito.asm.ByteVector byteVector9 = new org.mockito.asm.ByteVector();
        org.mockito.asm.ByteVector byteVector11 = byteVector9.putUTF8("hi!");
        org.mockito.asm.ByteVector byteVector13 = byteVector9.putLong((long) ' ');
        org.mockito.asm.ByteVector byteVector15 = byteVector13.putByte((int) 'a');
        org.mockito.asm.ByteVector byteVector17 = byteVector13.putByte((int) (short) -1);
        org.mockito.asm.ByteVector byteVector19 = byteVector13.putLong(0L);
        org.mockito.asm.ByteVector byteVector21 = byteVector13.putUTF8("hi!");
        org.mockito.asm.ByteVector byteVector23 = byteVector21.putUTF8("");
        org.mockito.asm.ByteVector byteVector25 = byteVector23.putLong((long) (byte) 10);
        org.mockito.asm.ByteVector byteVector27 = byteVector23.putLong((long) (short) 100);
        byte[] byteArray32 = new byte[] { (byte) 1, (byte) 0, (byte) 0, (byte) -1 };
        org.mockito.asm.ByteVector byteVector35 = byteVector23.putByteArray(byteArray32, 0, 0);
        // The following exception was thrown during execution in test generation
        try {
            org.mockito.asm.ByteVector byteVector38 = byteVector4.putByteArray(byteArray32, 1, (int) (short) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteVector2);
        org.junit.Assert.assertNotNull(byteVector4);
        org.junit.Assert.assertNotNull(byteVector6);
        org.junit.Assert.assertNotNull(byteVector8);
        org.junit.Assert.assertNotNull(byteVector11);
        org.junit.Assert.assertNotNull(byteVector13);
        org.junit.Assert.assertNotNull(byteVector15);
        org.junit.Assert.assertNotNull(byteVector17);
        org.junit.Assert.assertNotNull(byteVector19);
        org.junit.Assert.assertNotNull(byteVector21);
        org.junit.Assert.assertNotNull(byteVector23);
        org.junit.Assert.assertNotNull(byteVector25);
        org.junit.Assert.assertNotNull(byteVector27);
        org.junit.Assert.assertNotNull(byteArray32);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray32), "[1, 0, 0, -1]");
        org.junit.Assert.assertNotNull(byteVector35);
    }

    @Test
    public void test0092() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0092");
        org.mockito.asm.ByteVector byteVector0 = new org.mockito.asm.ByteVector();
        org.mockito.asm.ByteVector byteVector2 = byteVector0.putUTF8("hi!");
        org.mockito.asm.ByteVector byteVector4 = byteVector2.putInt((int) (byte) 10);
        org.mockito.asm.ByteVector byteVector6 = byteVector4.putUTF8("");
        org.mockito.asm.ByteVector byteVector8 = byteVector4.putLong((long) '#');
        org.mockito.asm.ByteVector byteVector10 = byteVector8.putLong((long) (short) 100);
        org.mockito.asm.ByteVector byteVector12 = byteVector8.putByte(1);
        java.lang.Class<?> wildcardClass13 = byteVector12.getClass();
        org.junit.Assert.assertNotNull(byteVector2);
        org.junit.Assert.assertNotNull(byteVector4);
        org.junit.Assert.assertNotNull(byteVector6);
        org.junit.Assert.assertNotNull(byteVector8);
        org.junit.Assert.assertNotNull(byteVector10);
        org.junit.Assert.assertNotNull(byteVector12);
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test0093() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0093");
        org.mockito.asm.ByteVector byteVector0 = new org.mockito.asm.ByteVector();
        org.mockito.asm.ByteVector byteVector2 = byteVector0.putUTF8("hi!");
        org.mockito.asm.ByteVector byteVector4 = byteVector0.putInt(0);
        org.mockito.asm.ByteVector byteVector6 = byteVector0.putShort((int) '4');
        org.mockito.asm.ByteVector byteVector8 = byteVector0.putByte(100);
        org.mockito.asm.ByteVector byteVector10 = byteVector8.putInt((int) (byte) 10);
        org.mockito.asm.ByteVector byteVector12 = byteVector8.putInt((int) (byte) 10);
        java.lang.Class<?> wildcardClass13 = byteVector12.getClass();
        org.junit.Assert.assertNotNull(byteVector2);
        org.junit.Assert.assertNotNull(byteVector4);
        org.junit.Assert.assertNotNull(byteVector6);
        org.junit.Assert.assertNotNull(byteVector8);
        org.junit.Assert.assertNotNull(byteVector10);
        org.junit.Assert.assertNotNull(byteVector12);
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test0094() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0094");
        org.mockito.asm.ByteVector byteVector0 = new org.mockito.asm.ByteVector();
        org.mockito.asm.ByteVector byteVector2 = byteVector0.putUTF8("hi!");
        org.mockito.asm.ByteVector byteVector4 = byteVector0.putShort((int) (short) 100);
        org.mockito.asm.ByteVector byteVector6 = byteVector4.putUTF8("hi!");
        java.lang.Class<?> wildcardClass7 = byteVector6.getClass();
        org.junit.Assert.assertNotNull(byteVector2);
        org.junit.Assert.assertNotNull(byteVector4);
        org.junit.Assert.assertNotNull(byteVector6);
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test0095() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0095");
        org.mockito.asm.ByteVector byteVector0 = new org.mockito.asm.ByteVector();
        org.mockito.asm.ByteVector byteVector2 = byteVector0.putUTF8("hi!");
        org.mockito.asm.ByteVector byteVector4 = byteVector0.putLong((long) ' ');
        org.mockito.asm.ByteVector byteVector6 = byteVector4.putByte((int) 'a');
        org.mockito.asm.ByteVector byteVector8 = byteVector4.putByte((int) (short) -1);
        org.mockito.asm.ByteVector byteVector10 = byteVector4.putLong(0L);
        org.mockito.asm.ByteVector byteVector12 = byteVector4.putUTF8("hi!");
        org.mockito.asm.ByteVector byteVector14 = byteVector12.putUTF8("");
        org.mockito.asm.ByteVector byteVector16 = byteVector12.putInt((int) (byte) 10);
        org.mockito.asm.ByteVector byteVector18 = byteVector12.putByte(0);
        org.mockito.asm.ByteVector byteVector20 = byteVector18.putShort(0);
        java.lang.Class<?> wildcardClass21 = byteVector18.getClass();
        org.junit.Assert.assertNotNull(byteVector2);
        org.junit.Assert.assertNotNull(byteVector4);
        org.junit.Assert.assertNotNull(byteVector6);
        org.junit.Assert.assertNotNull(byteVector8);
        org.junit.Assert.assertNotNull(byteVector10);
        org.junit.Assert.assertNotNull(byteVector12);
        org.junit.Assert.assertNotNull(byteVector14);
        org.junit.Assert.assertNotNull(byteVector16);
        org.junit.Assert.assertNotNull(byteVector18);
        org.junit.Assert.assertNotNull(byteVector20);
        org.junit.Assert.assertNotNull(wildcardClass21);
    }

    @Test
    public void test0096() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0096");
        org.mockito.asm.ByteVector byteVector0 = new org.mockito.asm.ByteVector();
        org.mockito.asm.ByteVector byteVector2 = byteVector0.putUTF8("hi!");
        org.mockito.asm.ByteVector byteVector4 = byteVector2.putInt((int) (byte) 10);
        org.mockito.asm.ByteVector byteVector6 = byteVector4.putUTF8("");
        org.mockito.asm.ByteVector byteVector8 = byteVector6.putUTF8("hi!");
        org.mockito.asm.ByteVector byteVector10 = byteVector6.putInt((int) '#');
        org.mockito.asm.ByteVector byteVector11 = new org.mockito.asm.ByteVector();
        org.mockito.asm.ByteVector byteVector13 = byteVector11.putUTF8("hi!");
        org.mockito.asm.ByteVector byteVector15 = byteVector11.putInt(0);
        org.mockito.asm.ByteVector byteVector17 = byteVector15.putInt((int) ' ');
        org.mockito.asm.ByteVector byteVector19 = byteVector17.putLong(100L);
        byte[] byteArray23 = new byte[] { (byte) 0, (byte) 10, (byte) 1 };
        org.mockito.asm.ByteVector byteVector26 = byteVector17.putByteArray(byteArray23, 0, 0);
        // The following exception was thrown during execution in test generation
        try {
            org.mockito.asm.ByteVector byteVector29 = byteVector10.putByteArray(byteArray23, (int) (byte) 0, (int) ' ');
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteVector2);
        org.junit.Assert.assertNotNull(byteVector4);
        org.junit.Assert.assertNotNull(byteVector6);
        org.junit.Assert.assertNotNull(byteVector8);
        org.junit.Assert.assertNotNull(byteVector10);
        org.junit.Assert.assertNotNull(byteVector13);
        org.junit.Assert.assertNotNull(byteVector15);
        org.junit.Assert.assertNotNull(byteVector17);
        org.junit.Assert.assertNotNull(byteVector19);
        org.junit.Assert.assertNotNull(byteArray23);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray23), "[0, 10, 1]");
        org.junit.Assert.assertNotNull(byteVector26);
    }

    @Test
    public void test0097() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0097");
        org.mockito.asm.ByteVector byteVector0 = new org.mockito.asm.ByteVector();
        org.mockito.asm.ByteVector byteVector2 = byteVector0.putUTF8("hi!");
        org.mockito.asm.ByteVector byteVector4 = byteVector2.putInt(0);
        org.mockito.asm.ByteVector byteVector6 = byteVector4.putByte((int) (short) 0);
        java.lang.Class<?> wildcardClass7 = byteVector6.getClass();
        org.junit.Assert.assertNotNull(byteVector2);
        org.junit.Assert.assertNotNull(byteVector4);
        org.junit.Assert.assertNotNull(byteVector6);
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test0098() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0098");
        org.mockito.asm.ByteVector byteVector1 = new org.mockito.asm.ByteVector((int) '#');
        org.mockito.asm.ByteVector byteVector3 = byteVector1.putLong(100L);
        org.mockito.asm.ByteVector byteVector5 = byteVector3.putLong(1L);
        org.mockito.asm.ByteVector byteVector6 = new org.mockito.asm.ByteVector();
        org.mockito.asm.ByteVector byteVector8 = byteVector6.putUTF8("hi!");
        org.mockito.asm.ByteVector byteVector10 = byteVector6.putInt(0);
        org.mockito.asm.ByteVector byteVector12 = byteVector10.putInt((int) ' ');
        org.mockito.asm.ByteVector byteVector14 = byteVector12.putLong(100L);
        byte[] byteArray18 = new byte[] { (byte) 0, (byte) 10, (byte) 1 };
        org.mockito.asm.ByteVector byteVector21 = byteVector12.putByteArray(byteArray18, 0, 0);
        // The following exception was thrown during execution in test generation
        try {
            org.mockito.asm.ByteVector byteVector24 = byteVector3.putByteArray(byteArray18, (int) (byte) -1, (int) ' ');
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteVector3);
        org.junit.Assert.assertNotNull(byteVector5);
        org.junit.Assert.assertNotNull(byteVector8);
        org.junit.Assert.assertNotNull(byteVector10);
        org.junit.Assert.assertNotNull(byteVector12);
        org.junit.Assert.assertNotNull(byteVector14);
        org.junit.Assert.assertNotNull(byteArray18);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray18), "[0, 10, 1]");
        org.junit.Assert.assertNotNull(byteVector21);
    }

    @Test
    public void test0099() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0099");
        org.mockito.asm.ByteVector byteVector0 = new org.mockito.asm.ByteVector();
        org.mockito.asm.ByteVector byteVector2 = byteVector0.putUTF8("hi!");
        org.mockito.asm.ByteVector byteVector4 = byteVector2.putByte(100);
        org.mockito.asm.ByteVector byteVector6 = byteVector2.putShort((int) 'a');
        org.mockito.asm.ByteVector byteVector8 = byteVector6.putByte((int) (short) 1);
        org.mockito.asm.ByteVector byteVector10 = byteVector8.putByte(100);
        java.lang.Class<?> wildcardClass11 = byteVector10.getClass();
        org.junit.Assert.assertNotNull(byteVector2);
        org.junit.Assert.assertNotNull(byteVector4);
        org.junit.Assert.assertNotNull(byteVector6);
        org.junit.Assert.assertNotNull(byteVector8);
        org.junit.Assert.assertNotNull(byteVector10);
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test0100() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0100");
        org.mockito.asm.ByteVector byteVector0 = new org.mockito.asm.ByteVector();
        org.mockito.asm.ByteVector byteVector2 = byteVector0.putUTF8("hi!");
        org.mockito.asm.ByteVector byteVector4 = byteVector2.putInt((int) (byte) 10);
        org.mockito.asm.ByteVector byteVector6 = byteVector4.putUTF8("");
        org.mockito.asm.ByteVector byteVector8 = byteVector6.putUTF8("hi!");
        org.mockito.asm.ByteVector byteVector10 = byteVector6.putInt((int) '#');
        org.mockito.asm.ByteVector byteVector12 = byteVector10.putInt((int) (short) 0);
        org.mockito.asm.ByteVector byteVector14 = new org.mockito.asm.ByteVector((int) (short) 0);
        org.mockito.asm.ByteVector byteVector15 = new org.mockito.asm.ByteVector();
        org.mockito.asm.ByteVector byteVector17 = byteVector15.putUTF8("hi!");
        org.mockito.asm.ByteVector byteVector19 = byteVector15.putInt(0);
        org.mockito.asm.ByteVector byteVector21 = byteVector19.putInt((int) ' ');
        org.mockito.asm.ByteVector byteVector23 = byteVector21.putLong(100L);
        byte[] byteArray27 = new byte[] { (byte) 0, (byte) 10, (byte) 1 };
        org.mockito.asm.ByteVector byteVector30 = byteVector21.putByteArray(byteArray27, 0, 0);
        org.mockito.asm.ByteVector byteVector33 = byteVector14.putByteArray(byteArray27, 1, (int) (short) 0);
        // The following exception was thrown during execution in test generation
        try {
            org.mockito.asm.ByteVector byteVector36 = byteVector10.putByteArray(byteArray27, (int) (short) 10, (int) 'a');
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteVector2);
        org.junit.Assert.assertNotNull(byteVector4);
        org.junit.Assert.assertNotNull(byteVector6);
        org.junit.Assert.assertNotNull(byteVector8);
        org.junit.Assert.assertNotNull(byteVector10);
        org.junit.Assert.assertNotNull(byteVector12);
        org.junit.Assert.assertNotNull(byteVector17);
        org.junit.Assert.assertNotNull(byteVector19);
        org.junit.Assert.assertNotNull(byteVector21);
        org.junit.Assert.assertNotNull(byteVector23);
        org.junit.Assert.assertNotNull(byteArray27);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray27), "[0, 10, 1]");
        org.junit.Assert.assertNotNull(byteVector30);
        org.junit.Assert.assertNotNull(byteVector33);
    }

    @Test
    public void test0101() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0101");
        org.mockito.asm.ByteVector byteVector0 = new org.mockito.asm.ByteVector();
        org.mockito.asm.ByteVector byteVector2 = byteVector0.putUTF8("hi!");
        org.mockito.asm.ByteVector byteVector4 = byteVector0.putLong((long) ' ');
        org.mockito.asm.ByteVector byteVector6 = byteVector4.putByte((int) 'a');
        org.mockito.asm.ByteVector byteVector8 = byteVector6.putByte((int) (short) -1);
        org.mockito.asm.ByteVector byteVector9 = new org.mockito.asm.ByteVector();
        org.mockito.asm.ByteVector byteVector11 = byteVector9.putUTF8("hi!");
        org.mockito.asm.ByteVector byteVector13 = byteVector9.putLong((long) ' ');
        org.mockito.asm.ByteVector byteVector15 = byteVector13.putByte((int) 'a');
        org.mockito.asm.ByteVector byteVector17 = byteVector13.putByte((int) (short) -1);
        org.mockito.asm.ByteVector byteVector19 = byteVector13.putLong(0L);
        org.mockito.asm.ByteVector byteVector21 = byteVector13.putUTF8("hi!");
        org.mockito.asm.ByteVector byteVector23 = byteVector21.putUTF8("");
        org.mockito.asm.ByteVector byteVector25 = byteVector21.putInt((int) (byte) 10);
        org.mockito.asm.ByteVector byteVector27 = byteVector21.putByte(0);
        org.mockito.asm.ByteVector byteVector28 = new org.mockito.asm.ByteVector();
        org.mockito.asm.ByteVector byteVector30 = byteVector28.putUTF8("hi!");
        org.mockito.asm.ByteVector byteVector32 = byteVector28.putInt(0);
        org.mockito.asm.ByteVector byteVector34 = byteVector32.putInt((int) ' ');
        org.mockito.asm.ByteVector byteVector36 = byteVector34.putLong(100L);
        byte[] byteArray40 = new byte[] { (byte) 0, (byte) 10, (byte) 1 };
        org.mockito.asm.ByteVector byteVector43 = byteVector34.putByteArray(byteArray40, 0, 0);
        org.mockito.asm.ByteVector byteVector46 = byteVector27.putByteArray(byteArray40, (int) (short) 1, 0);
        // The following exception was thrown during execution in test generation
        try {
            org.mockito.asm.ByteVector byteVector49 = byteVector6.putByteArray(byteArray40, (int) (short) 100, 0);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteVector2);
        org.junit.Assert.assertNotNull(byteVector4);
        org.junit.Assert.assertNotNull(byteVector6);
        org.junit.Assert.assertNotNull(byteVector8);
        org.junit.Assert.assertNotNull(byteVector11);
        org.junit.Assert.assertNotNull(byteVector13);
        org.junit.Assert.assertNotNull(byteVector15);
        org.junit.Assert.assertNotNull(byteVector17);
        org.junit.Assert.assertNotNull(byteVector19);
        org.junit.Assert.assertNotNull(byteVector21);
        org.junit.Assert.assertNotNull(byteVector23);
        org.junit.Assert.assertNotNull(byteVector25);
        org.junit.Assert.assertNotNull(byteVector27);
        org.junit.Assert.assertNotNull(byteVector30);
        org.junit.Assert.assertNotNull(byteVector32);
        org.junit.Assert.assertNotNull(byteVector34);
        org.junit.Assert.assertNotNull(byteVector36);
        org.junit.Assert.assertNotNull(byteArray40);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray40), "[0, 10, 1]");
        org.junit.Assert.assertNotNull(byteVector43);
        org.junit.Assert.assertNotNull(byteVector46);
    }

    @Test
    public void test0102() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0102");
        org.mockito.asm.ByteVector byteVector0 = new org.mockito.asm.ByteVector();
        org.mockito.asm.ByteVector byteVector2 = byteVector0.putUTF8("hi!");
        org.mockito.asm.ByteVector byteVector4 = byteVector0.putInt(0);
        org.mockito.asm.ByteVector byteVector6 = byteVector4.putInt((int) ' ');
        byte[] byteArray9 = new byte[] { (byte) -1, (byte) -1 };
        // The following exception was thrown during execution in test generation
        try {
            org.mockito.asm.ByteVector byteVector12 = byteVector6.putByteArray(byteArray9, (-1), (int) 'a');
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteVector2);
        org.junit.Assert.assertNotNull(byteVector4);
        org.junit.Assert.assertNotNull(byteVector6);
        org.junit.Assert.assertNotNull(byteArray9);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray9), "[-1, -1]");
    }

    @Test
    public void test0103() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0103");
        org.mockito.asm.ByteVector byteVector0 = new org.mockito.asm.ByteVector();
        org.mockito.asm.ByteVector byteVector2 = byteVector0.putUTF8("hi!");
        org.mockito.asm.ByteVector byteVector4 = byteVector0.putLong((long) ' ');
        org.mockito.asm.ByteVector byteVector6 = byteVector4.putByte((int) 'a');
        org.mockito.asm.ByteVector byteVector8 = byteVector6.putByte((int) (short) -1);
        org.mockito.asm.ByteVector byteVector10 = byteVector8.putUTF8("");
        java.lang.Class<?> wildcardClass11 = byteVector8.getClass();
        org.junit.Assert.assertNotNull(byteVector2);
        org.junit.Assert.assertNotNull(byteVector4);
        org.junit.Assert.assertNotNull(byteVector6);
        org.junit.Assert.assertNotNull(byteVector8);
        org.junit.Assert.assertNotNull(byteVector10);
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test0104() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0104");
        org.mockito.asm.ByteVector byteVector0 = new org.mockito.asm.ByteVector();
        org.mockito.asm.ByteVector byteVector2 = byteVector0.putUTF8("hi!");
        org.mockito.asm.ByteVector byteVector4 = byteVector0.putLong((long) ' ');
        org.mockito.asm.ByteVector byteVector6 = byteVector4.putByte((int) 'a');
        org.mockito.asm.ByteVector byteVector8 = byteVector4.putByte((int) (short) -1);
        org.mockito.asm.ByteVector byteVector10 = byteVector4.putLong(0L);
        org.mockito.asm.ByteVector byteVector12 = byteVector4.putUTF8("hi!");
        org.mockito.asm.ByteVector byteVector14 = byteVector12.putUTF8("hi!");
        org.mockito.asm.ByteVector byteVector16 = byteVector12.putShort((int) '#');
        org.mockito.asm.ByteVector byteVector18 = byteVector12.putInt((int) (short) 0);
        org.mockito.asm.ByteVector byteVector20 = byteVector18.putShort((int) (short) 10);
        java.lang.Class<?> wildcardClass21 = byteVector18.getClass();
        org.junit.Assert.assertNotNull(byteVector2);
        org.junit.Assert.assertNotNull(byteVector4);
        org.junit.Assert.assertNotNull(byteVector6);
        org.junit.Assert.assertNotNull(byteVector8);
        org.junit.Assert.assertNotNull(byteVector10);
        org.junit.Assert.assertNotNull(byteVector12);
        org.junit.Assert.assertNotNull(byteVector14);
        org.junit.Assert.assertNotNull(byteVector16);
        org.junit.Assert.assertNotNull(byteVector18);
        org.junit.Assert.assertNotNull(byteVector20);
        org.junit.Assert.assertNotNull(wildcardClass21);
    }

    @Test
    public void test0105() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0105");
        org.mockito.asm.ByteVector byteVector1 = new org.mockito.asm.ByteVector((int) '#');
        org.mockito.asm.ByteVector byteVector3 = byteVector1.putLong(100L);
        org.mockito.asm.ByteVector byteVector5 = byteVector1.putUTF8("");
        java.lang.Class<?> wildcardClass6 = byteVector5.getClass();
        org.junit.Assert.assertNotNull(byteVector3);
        org.junit.Assert.assertNotNull(byteVector5);
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void test0106() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0106");
        org.mockito.asm.ByteVector byteVector0 = new org.mockito.asm.ByteVector();
        org.mockito.asm.ByteVector byteVector2 = byteVector0.putUTF8("hi!");
        org.mockito.asm.ByteVector byteVector4 = byteVector0.putLong((long) ' ');
        org.mockito.asm.ByteVector byteVector6 = byteVector4.putByte((int) 'a');
        org.mockito.asm.ByteVector byteVector8 = byteVector6.putInt((int) (short) 0);
        java.lang.Class<?> wildcardClass9 = byteVector6.getClass();
        org.junit.Assert.assertNotNull(byteVector2);
        org.junit.Assert.assertNotNull(byteVector4);
        org.junit.Assert.assertNotNull(byteVector6);
        org.junit.Assert.assertNotNull(byteVector8);
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test0107() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0107");
        org.mockito.asm.ByteVector byteVector0 = new org.mockito.asm.ByteVector();
        org.mockito.asm.ByteVector byteVector2 = byteVector0.putUTF8("hi!");
        org.mockito.asm.ByteVector byteVector4 = byteVector0.putLong((long) ' ');
        org.mockito.asm.ByteVector byteVector6 = byteVector4.putByte((int) 'a');
        org.mockito.asm.ByteVector byteVector8 = byteVector4.putByte((int) (short) -1);
        org.mockito.asm.ByteVector byteVector10 = byteVector4.putLong(0L);
        org.mockito.asm.ByteVector byteVector12 = byteVector4.putUTF8("hi!");
        org.mockito.asm.ByteVector byteVector14 = byteVector12.putUTF8("");
        org.mockito.asm.ByteVector byteVector16 = byteVector12.putInt((int) (byte) 10);
        org.mockito.asm.ByteVector byteVector18 = byteVector12.putByte(0);
        org.mockito.asm.ByteVector byteVector19 = new org.mockito.asm.ByteVector();
        org.mockito.asm.ByteVector byteVector21 = byteVector19.putUTF8("hi!");
        org.mockito.asm.ByteVector byteVector23 = byteVector19.putInt(0);
        org.mockito.asm.ByteVector byteVector25 = byteVector23.putInt((int) ' ');
        org.mockito.asm.ByteVector byteVector27 = byteVector25.putLong(100L);
        byte[] byteArray31 = new byte[] { (byte) 0, (byte) 10, (byte) 1 };
        org.mockito.asm.ByteVector byteVector34 = byteVector25.putByteArray(byteArray31, 0, 0);
        org.mockito.asm.ByteVector byteVector37 = byteVector18.putByteArray(byteArray31, (int) (short) 1, 0);
        java.lang.Class<?> wildcardClass38 = byteVector37.getClass();
        org.junit.Assert.assertNotNull(byteVector2);
        org.junit.Assert.assertNotNull(byteVector4);
        org.junit.Assert.assertNotNull(byteVector6);
        org.junit.Assert.assertNotNull(byteVector8);
        org.junit.Assert.assertNotNull(byteVector10);
        org.junit.Assert.assertNotNull(byteVector12);
        org.junit.Assert.assertNotNull(byteVector14);
        org.junit.Assert.assertNotNull(byteVector16);
        org.junit.Assert.assertNotNull(byteVector18);
        org.junit.Assert.assertNotNull(byteVector21);
        org.junit.Assert.assertNotNull(byteVector23);
        org.junit.Assert.assertNotNull(byteVector25);
        org.junit.Assert.assertNotNull(byteVector27);
        org.junit.Assert.assertNotNull(byteArray31);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray31), "[0, 10, 1]");
        org.junit.Assert.assertNotNull(byteVector34);
        org.junit.Assert.assertNotNull(byteVector37);
        org.junit.Assert.assertNotNull(wildcardClass38);
    }

    @Test
    public void test0108() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0108");
        org.mockito.asm.ByteVector byteVector0 = new org.mockito.asm.ByteVector();
        org.mockito.asm.ByteVector byteVector2 = byteVector0.putUTF8("hi!");
        org.mockito.asm.ByteVector byteVector4 = byteVector0.putLong((long) ' ');
        org.mockito.asm.ByteVector byteVector6 = byteVector4.putByte((int) 'a');
        org.mockito.asm.ByteVector byteVector8 = byteVector4.putByte((int) (short) -1);
        org.mockito.asm.ByteVector byteVector10 = byteVector4.putLong(0L);
        org.mockito.asm.ByteVector byteVector12 = byteVector10.putByte(0);
        org.mockito.asm.ByteVector byteVector14 = new org.mockito.asm.ByteVector((int) (byte) 10);
        org.mockito.asm.ByteVector byteVector16 = byteVector14.putByte((int) '4');
        org.mockito.asm.ByteVector byteVector18 = byteVector14.putLong((long) 'a');
        org.mockito.asm.ByteVector byteVector19 = new org.mockito.asm.ByteVector();
        org.mockito.asm.ByteVector byteVector21 = byteVector19.putUTF8("hi!");
        org.mockito.asm.ByteVector byteVector23 = byteVector19.putLong((long) ' ');
        org.mockito.asm.ByteVector byteVector25 = byteVector23.putByte((int) 'a');
        org.mockito.asm.ByteVector byteVector27 = byteVector23.putByte((int) (short) -1);
        org.mockito.asm.ByteVector byteVector29 = byteVector23.putLong(0L);
        org.mockito.asm.ByteVector byteVector31 = byteVector23.putUTF8("hi!");
        org.mockito.asm.ByteVector byteVector33 = byteVector31.putUTF8("");
        org.mockito.asm.ByteVector byteVector35 = byteVector31.putInt((int) (byte) 10);
        org.mockito.asm.ByteVector byteVector37 = byteVector31.putByte(0);
        org.mockito.asm.ByteVector byteVector38 = new org.mockito.asm.ByteVector();
        org.mockito.asm.ByteVector byteVector40 = byteVector38.putUTF8("hi!");
        org.mockito.asm.ByteVector byteVector42 = byteVector38.putInt(0);
        org.mockito.asm.ByteVector byteVector44 = byteVector42.putInt((int) ' ');
        org.mockito.asm.ByteVector byteVector46 = byteVector44.putLong(100L);
        byte[] byteArray50 = new byte[] { (byte) 0, (byte) 10, (byte) 1 };
        org.mockito.asm.ByteVector byteVector53 = byteVector44.putByteArray(byteArray50, 0, 0);
        org.mockito.asm.ByteVector byteVector56 = byteVector37.putByteArray(byteArray50, (int) (short) 1, 0);
        org.mockito.asm.ByteVector byteVector59 = byteVector18.putByteArray(byteArray50, 0, 0);
        // The following exception was thrown during execution in test generation
        try {
            org.mockito.asm.ByteVector byteVector62 = byteVector12.putByteArray(byteArray50, (int) (short) 1, (int) (byte) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteVector2);
        org.junit.Assert.assertNotNull(byteVector4);
        org.junit.Assert.assertNotNull(byteVector6);
        org.junit.Assert.assertNotNull(byteVector8);
        org.junit.Assert.assertNotNull(byteVector10);
        org.junit.Assert.assertNotNull(byteVector12);
        org.junit.Assert.assertNotNull(byteVector16);
        org.junit.Assert.assertNotNull(byteVector18);
        org.junit.Assert.assertNotNull(byteVector21);
        org.junit.Assert.assertNotNull(byteVector23);
        org.junit.Assert.assertNotNull(byteVector25);
        org.junit.Assert.assertNotNull(byteVector27);
        org.junit.Assert.assertNotNull(byteVector29);
        org.junit.Assert.assertNotNull(byteVector31);
        org.junit.Assert.assertNotNull(byteVector33);
        org.junit.Assert.assertNotNull(byteVector35);
        org.junit.Assert.assertNotNull(byteVector37);
        org.junit.Assert.assertNotNull(byteVector40);
        org.junit.Assert.assertNotNull(byteVector42);
        org.junit.Assert.assertNotNull(byteVector44);
        org.junit.Assert.assertNotNull(byteVector46);
        org.junit.Assert.assertNotNull(byteArray50);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray50), "[0, 10, 1]");
        org.junit.Assert.assertNotNull(byteVector53);
        org.junit.Assert.assertNotNull(byteVector56);
        org.junit.Assert.assertNotNull(byteVector59);
    }

    @Test
    public void test0109() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0109");
        org.mockito.asm.ByteVector byteVector0 = new org.mockito.asm.ByteVector();
        org.mockito.asm.ByteVector byteVector2 = byteVector0.putUTF8("hi!");
        org.mockito.asm.ByteVector byteVector4 = byteVector2.putLong((long) (byte) 10);
        org.mockito.asm.ByteVector byteVector6 = byteVector4.putUTF8("hi!");
        org.mockito.asm.ByteVector byteVector8 = byteVector4.putLong((-1L));
        org.mockito.asm.ByteVector byteVector10 = byteVector8.putInt(10);
        org.mockito.asm.ByteVector byteVector12 = byteVector10.putShort((int) '#');
        org.mockito.asm.ByteVector byteVector14 = byteVector10.putLong((long) (byte) -1);
        org.mockito.asm.ByteVector byteVector16 = byteVector10.putLong((long) '4');
        java.lang.Class<?> wildcardClass17 = byteVector16.getClass();
        org.junit.Assert.assertNotNull(byteVector2);
        org.junit.Assert.assertNotNull(byteVector4);
        org.junit.Assert.assertNotNull(byteVector6);
        org.junit.Assert.assertNotNull(byteVector8);
        org.junit.Assert.assertNotNull(byteVector10);
        org.junit.Assert.assertNotNull(byteVector12);
        org.junit.Assert.assertNotNull(byteVector14);
        org.junit.Assert.assertNotNull(byteVector16);
        org.junit.Assert.assertNotNull(wildcardClass17);
    }

    @Test
    public void test0110() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0110");
        org.mockito.asm.ByteVector byteVector0 = new org.mockito.asm.ByteVector();
        org.mockito.asm.ByteVector byteVector2 = byteVector0.putUTF8("hi!");
        org.mockito.asm.ByteVector byteVector4 = byteVector0.putInt(0);
        org.mockito.asm.ByteVector byteVector6 = byteVector0.putShort((int) '4');
        org.mockito.asm.ByteVector byteVector8 = byteVector0.putByte(100);
        org.mockito.asm.ByteVector byteVector10 = byteVector8.putInt((int) (byte) 10);
        org.mockito.asm.ByteVector byteVector12 = byteVector8.putShort((int) (short) 100);
        org.mockito.asm.ByteVector byteVector14 = byteVector8.putInt((int) '#');
        java.lang.Class<?> wildcardClass15 = byteVector14.getClass();
        org.junit.Assert.assertNotNull(byteVector2);
        org.junit.Assert.assertNotNull(byteVector4);
        org.junit.Assert.assertNotNull(byteVector6);
        org.junit.Assert.assertNotNull(byteVector8);
        org.junit.Assert.assertNotNull(byteVector10);
        org.junit.Assert.assertNotNull(byteVector12);
        org.junit.Assert.assertNotNull(byteVector14);
        org.junit.Assert.assertNotNull(wildcardClass15);
    }

    @Test
    public void test0111() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0111");
        org.mockito.asm.ByteVector byteVector0 = new org.mockito.asm.ByteVector();
        org.mockito.asm.ByteVector byteVector2 = byteVector0.putUTF8("hi!");
        org.mockito.asm.ByteVector byteVector4 = byteVector2.putInt((int) (byte) 10);
        org.mockito.asm.ByteVector byteVector6 = byteVector4.putUTF8("");
        org.mockito.asm.ByteVector byteVector8 = byteVector6.putUTF8("hi!");
        org.mockito.asm.ByteVector byteVector10 = byteVector6.putShort(0);
        org.mockito.asm.ByteVector byteVector12 = byteVector6.putInt((-1));
        org.mockito.asm.ByteVector byteVector14 = byteVector12.putLong((long) (byte) -1);
        org.mockito.asm.ByteVector byteVector16 = new org.mockito.asm.ByteVector((int) (short) 0);
        org.mockito.asm.ByteVector byteVector17 = new org.mockito.asm.ByteVector();
        org.mockito.asm.ByteVector byteVector19 = byteVector17.putUTF8("hi!");
        org.mockito.asm.ByteVector byteVector21 = byteVector17.putInt(0);
        org.mockito.asm.ByteVector byteVector23 = byteVector21.putInt((int) ' ');
        org.mockito.asm.ByteVector byteVector25 = byteVector23.putLong(100L);
        byte[] byteArray29 = new byte[] { (byte) 0, (byte) 10, (byte) 1 };
        org.mockito.asm.ByteVector byteVector32 = byteVector23.putByteArray(byteArray29, 0, 0);
        org.mockito.asm.ByteVector byteVector35 = byteVector16.putByteArray(byteArray29, 1, (int) (short) 0);
        // The following exception was thrown during execution in test generation
        try {
            org.mockito.asm.ByteVector byteVector38 = byteVector12.putByteArray(byteArray29, (int) (short) -1, (int) (byte) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteVector2);
        org.junit.Assert.assertNotNull(byteVector4);
        org.junit.Assert.assertNotNull(byteVector6);
        org.junit.Assert.assertNotNull(byteVector8);
        org.junit.Assert.assertNotNull(byteVector10);
        org.junit.Assert.assertNotNull(byteVector12);
        org.junit.Assert.assertNotNull(byteVector14);
        org.junit.Assert.assertNotNull(byteVector19);
        org.junit.Assert.assertNotNull(byteVector21);
        org.junit.Assert.assertNotNull(byteVector23);
        org.junit.Assert.assertNotNull(byteVector25);
        org.junit.Assert.assertNotNull(byteArray29);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray29), "[0, 10, 1]");
        org.junit.Assert.assertNotNull(byteVector32);
        org.junit.Assert.assertNotNull(byteVector35);
    }

    @Test
    public void test0112() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0112");
        org.mockito.asm.ByteVector byteVector0 = new org.mockito.asm.ByteVector();
        org.mockito.asm.ByteVector byteVector2 = byteVector0.putUTF8("hi!");
        org.mockito.asm.ByteVector byteVector4 = byteVector0.putInt(0);
        org.mockito.asm.ByteVector byteVector6 = byteVector4.putInt((int) ' ');
        org.mockito.asm.ByteVector byteVector8 = byteVector6.putLong((long) (short) 10);
        org.mockito.asm.ByteVector byteVector10 = byteVector8.putUTF8("hi!");
        org.mockito.asm.ByteVector byteVector12 = byteVector8.putByte(0);
        org.mockito.asm.ByteVector byteVector14 = byteVector12.putInt((int) (short) 1);
        java.lang.Class<?> wildcardClass15 = byteVector12.getClass();
        org.junit.Assert.assertNotNull(byteVector2);
        org.junit.Assert.assertNotNull(byteVector4);
        org.junit.Assert.assertNotNull(byteVector6);
        org.junit.Assert.assertNotNull(byteVector8);
        org.junit.Assert.assertNotNull(byteVector10);
        org.junit.Assert.assertNotNull(byteVector12);
        org.junit.Assert.assertNotNull(byteVector14);
        org.junit.Assert.assertNotNull(wildcardClass15);
    }

    @Test
    public void test0113() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0113");
        org.mockito.asm.ByteVector byteVector0 = new org.mockito.asm.ByteVector();
        org.mockito.asm.ByteVector byteVector2 = byteVector0.putUTF8("hi!");
        org.mockito.asm.ByteVector byteVector4 = byteVector0.putInt(0);
        org.mockito.asm.ByteVector byteVector6 = byteVector0.putShort(10);
        org.mockito.asm.ByteVector byteVector8 = byteVector0.putLong((long) '#');
        org.mockito.asm.ByteVector byteVector10 = byteVector8.putShort((int) (byte) 0);
        byte[] byteArray17 = new byte[] { (byte) 100, (byte) 1, (byte) 100, (byte) 0, (byte) 0, (byte) 0 };
        // The following exception was thrown during execution in test generation
        try {
            org.mockito.asm.ByteVector byteVector20 = byteVector10.putByteArray(byteArray17, (int) (byte) -1, (int) (byte) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteVector2);
        org.junit.Assert.assertNotNull(byteVector4);
        org.junit.Assert.assertNotNull(byteVector6);
        org.junit.Assert.assertNotNull(byteVector8);
        org.junit.Assert.assertNotNull(byteVector10);
        org.junit.Assert.assertNotNull(byteArray17);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray17), "[100, 1, 100, 0, 0, 0]");
    }

    @Test
    public void test0114() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0114");
        org.mockito.asm.ByteVector byteVector0 = new org.mockito.asm.ByteVector();
        org.mockito.asm.ByteVector byteVector2 = byteVector0.putUTF8("hi!");
        org.mockito.asm.ByteVector byteVector4 = byteVector0.putShort((int) (short) -1);
        org.mockito.asm.ByteVector byteVector6 = byteVector4.putUTF8("hi!");
        org.mockito.asm.ByteVector byteVector8 = byteVector4.putShort((int) (byte) 0);
        org.junit.Assert.assertNotNull(byteVector2);
        org.junit.Assert.assertNotNull(byteVector4);
        org.junit.Assert.assertNotNull(byteVector6);
        org.junit.Assert.assertNotNull(byteVector8);
    }

    @Test
    public void test0115() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0115");
        org.mockito.asm.ByteVector byteVector1 = new org.mockito.asm.ByteVector((int) ' ');
        org.mockito.asm.ByteVector byteVector3 = byteVector1.putInt((int) '4');
        org.mockito.asm.ByteVector byteVector5 = new org.mockito.asm.ByteVector((int) (byte) 10);
        org.mockito.asm.ByteVector byteVector7 = byteVector5.putByte((int) '4');
        org.mockito.asm.ByteVector byteVector9 = byteVector5.putLong((long) 'a');
        org.mockito.asm.ByteVector byteVector10 = new org.mockito.asm.ByteVector();
        org.mockito.asm.ByteVector byteVector12 = byteVector10.putUTF8("hi!");
        org.mockito.asm.ByteVector byteVector14 = byteVector10.putLong((long) ' ');
        org.mockito.asm.ByteVector byteVector16 = byteVector14.putByte((int) 'a');
        org.mockito.asm.ByteVector byteVector18 = byteVector14.putByte((int) (short) -1);
        org.mockito.asm.ByteVector byteVector20 = byteVector14.putLong(0L);
        org.mockito.asm.ByteVector byteVector22 = byteVector14.putUTF8("hi!");
        org.mockito.asm.ByteVector byteVector24 = byteVector22.putUTF8("");
        org.mockito.asm.ByteVector byteVector26 = byteVector22.putInt((int) (byte) 10);
        org.mockito.asm.ByteVector byteVector28 = byteVector22.putByte(0);
        org.mockito.asm.ByteVector byteVector29 = new org.mockito.asm.ByteVector();
        org.mockito.asm.ByteVector byteVector31 = byteVector29.putUTF8("hi!");
        org.mockito.asm.ByteVector byteVector33 = byteVector29.putInt(0);
        org.mockito.asm.ByteVector byteVector35 = byteVector33.putInt((int) ' ');
        org.mockito.asm.ByteVector byteVector37 = byteVector35.putLong(100L);
        byte[] byteArray41 = new byte[] { (byte) 0, (byte) 10, (byte) 1 };
        org.mockito.asm.ByteVector byteVector44 = byteVector35.putByteArray(byteArray41, 0, 0);
        org.mockito.asm.ByteVector byteVector47 = byteVector28.putByteArray(byteArray41, (int) (short) 1, 0);
        org.mockito.asm.ByteVector byteVector50 = byteVector9.putByteArray(byteArray41, 0, 0);
        // The following exception was thrown during execution in test generation
        try {
            org.mockito.asm.ByteVector byteVector53 = byteVector3.putByteArray(byteArray41, (int) 'a', (int) (short) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteVector3);
        org.junit.Assert.assertNotNull(byteVector7);
        org.junit.Assert.assertNotNull(byteVector9);
        org.junit.Assert.assertNotNull(byteVector12);
        org.junit.Assert.assertNotNull(byteVector14);
        org.junit.Assert.assertNotNull(byteVector16);
        org.junit.Assert.assertNotNull(byteVector18);
        org.junit.Assert.assertNotNull(byteVector20);
        org.junit.Assert.assertNotNull(byteVector22);
        org.junit.Assert.assertNotNull(byteVector24);
        org.junit.Assert.assertNotNull(byteVector26);
        org.junit.Assert.assertNotNull(byteVector28);
        org.junit.Assert.assertNotNull(byteVector31);
        org.junit.Assert.assertNotNull(byteVector33);
        org.junit.Assert.assertNotNull(byteVector35);
        org.junit.Assert.assertNotNull(byteVector37);
        org.junit.Assert.assertNotNull(byteArray41);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray41), "[0, 10, 1]");
        org.junit.Assert.assertNotNull(byteVector44);
        org.junit.Assert.assertNotNull(byteVector47);
        org.junit.Assert.assertNotNull(byteVector50);
    }

    @Test
    public void test0116() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0116");
        org.mockito.asm.ByteVector byteVector0 = new org.mockito.asm.ByteVector();
        org.mockito.asm.ByteVector byteVector2 = byteVector0.putUTF8("hi!");
        org.mockito.asm.ByteVector byteVector4 = byteVector0.putInt(0);
        org.mockito.asm.ByteVector byteVector6 = byteVector4.putInt((int) ' ');
        org.mockito.asm.ByteVector byteVector8 = byteVector6.putLong((long) (short) 10);
        org.mockito.asm.ByteVector byteVector10 = byteVector8.putLong((long) 'a');
        org.mockito.asm.ByteVector byteVector12 = byteVector10.putByte((int) (short) 10);
        org.mockito.asm.ByteVector byteVector14 = byteVector12.putByte((int) (short) 1);
        org.junit.Assert.assertNotNull(byteVector2);
        org.junit.Assert.assertNotNull(byteVector4);
        org.junit.Assert.assertNotNull(byteVector6);
        org.junit.Assert.assertNotNull(byteVector8);
        org.junit.Assert.assertNotNull(byteVector10);
        org.junit.Assert.assertNotNull(byteVector12);
        org.junit.Assert.assertNotNull(byteVector14);
    }

    @Test
    public void test0117() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0117");
        org.mockito.asm.ByteVector byteVector0 = new org.mockito.asm.ByteVector();
        org.mockito.asm.ByteVector byteVector2 = byteVector0.putUTF8("hi!");
        org.mockito.asm.ByteVector byteVector4 = byteVector2.putInt((int) (byte) 10);
        org.mockito.asm.ByteVector byteVector6 = byteVector4.putUTF8("");
        java.lang.Class<?> wildcardClass7 = byteVector6.getClass();
        org.junit.Assert.assertNotNull(byteVector2);
        org.junit.Assert.assertNotNull(byteVector4);
        org.junit.Assert.assertNotNull(byteVector6);
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test0118() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0118");
        org.mockito.asm.ByteVector byteVector0 = new org.mockito.asm.ByteVector();
        org.mockito.asm.ByteVector byteVector2 = byteVector0.putUTF8("hi!");
        org.mockito.asm.ByteVector byteVector4 = byteVector0.putLong((long) ' ');
        org.mockito.asm.ByteVector byteVector6 = byteVector4.putByte((int) 'a');
        org.mockito.asm.ByteVector byteVector8 = byteVector6.putByte((int) (short) -1);
        org.mockito.asm.ByteVector byteVector10 = byteVector8.putLong((long) (byte) -1);
        org.mockito.asm.ByteVector byteVector12 = byteVector8.putByte((int) '4');
        org.mockito.asm.ByteVector byteVector14 = byteVector12.putUTF8("");
        java.lang.Class<?> wildcardClass15 = byteVector14.getClass();
        org.junit.Assert.assertNotNull(byteVector2);
        org.junit.Assert.assertNotNull(byteVector4);
        org.junit.Assert.assertNotNull(byteVector6);
        org.junit.Assert.assertNotNull(byteVector8);
        org.junit.Assert.assertNotNull(byteVector10);
        org.junit.Assert.assertNotNull(byteVector12);
        org.junit.Assert.assertNotNull(byteVector14);
        org.junit.Assert.assertNotNull(wildcardClass15);
    }

    @Test
    public void test0119() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0119");
        org.mockito.asm.ByteVector byteVector0 = new org.mockito.asm.ByteVector();
        org.mockito.asm.ByteVector byteVector2 = byteVector0.putUTF8("hi!");
        org.mockito.asm.ByteVector byteVector4 = byteVector0.putLong((long) ' ');
        org.mockito.asm.ByteVector byteVector6 = byteVector4.putByte((int) 'a');
        org.mockito.asm.ByteVector byteVector8 = byteVector4.putLong((long) ' ');
        org.mockito.asm.ByteVector byteVector10 = byteVector4.putLong((long) '#');
        java.lang.Class<?> wildcardClass11 = byteVector10.getClass();
        org.junit.Assert.assertNotNull(byteVector2);
        org.junit.Assert.assertNotNull(byteVector4);
        org.junit.Assert.assertNotNull(byteVector6);
        org.junit.Assert.assertNotNull(byteVector8);
        org.junit.Assert.assertNotNull(byteVector10);
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test0120() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0120");
        org.mockito.asm.ByteVector byteVector0 = new org.mockito.asm.ByteVector();
        org.mockito.asm.ByteVector byteVector2 = byteVector0.putUTF8("hi!");
        org.mockito.asm.ByteVector byteVector4 = byteVector2.putLong((long) (byte) 10);
        org.mockito.asm.ByteVector byteVector6 = byteVector4.putUTF8("hi!");
        org.mockito.asm.ByteVector byteVector8 = byteVector4.putShort((int) '4');
        java.lang.Class<?> wildcardClass9 = byteVector8.getClass();
        org.junit.Assert.assertNotNull(byteVector2);
        org.junit.Assert.assertNotNull(byteVector4);
        org.junit.Assert.assertNotNull(byteVector6);
        org.junit.Assert.assertNotNull(byteVector8);
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test0121() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0121");
        org.mockito.asm.ByteVector byteVector1 = new org.mockito.asm.ByteVector((int) '#');
        org.mockito.asm.ByteVector byteVector3 = byteVector1.putInt(100);
        org.mockito.asm.ByteVector byteVector5 = byteVector1.putInt(0);
        org.mockito.asm.ByteVector byteVector7 = byteVector5.putShort((int) (short) 0);
        org.mockito.asm.ByteVector byteVector9 = byteVector7.putLong((long) (short) 100);
        org.mockito.asm.ByteVector byteVector11 = byteVector9.putLong((-1L));
        byte[] byteArray16 = new byte[] { (byte) 100, (byte) 100, (byte) 10, (byte) 10 };
        // The following exception was thrown during execution in test generation
        try {
            org.mockito.asm.ByteVector byteVector19 = byteVector9.putByteArray(byteArray16, (int) '4', (int) (short) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteVector3);
        org.junit.Assert.assertNotNull(byteVector5);
        org.junit.Assert.assertNotNull(byteVector7);
        org.junit.Assert.assertNotNull(byteVector9);
        org.junit.Assert.assertNotNull(byteVector11);
        org.junit.Assert.assertNotNull(byteArray16);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray16), "[100, 100, 10, 10]");
    }

    @Test
    public void test0122() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0122");
        org.mockito.asm.ByteVector byteVector1 = new org.mockito.asm.ByteVector((int) (byte) 1);
        org.mockito.asm.ByteVector byteVector3 = byteVector1.putShort(10);
        org.mockito.asm.ByteVector byteVector4 = new org.mockito.asm.ByteVector();
        org.mockito.asm.ByteVector byteVector6 = byteVector4.putUTF8("hi!");
        org.mockito.asm.ByteVector byteVector8 = byteVector4.putLong((long) ' ');
        org.mockito.asm.ByteVector byteVector10 = byteVector8.putByte((int) 'a');
        org.mockito.asm.ByteVector byteVector12 = byteVector8.putByte((int) (short) -1);
        org.mockito.asm.ByteVector byteVector14 = byteVector8.putLong(0L);
        org.mockito.asm.ByteVector byteVector16 = byteVector8.putUTF8("hi!");
        org.mockito.asm.ByteVector byteVector18 = byteVector16.putUTF8("");
        org.mockito.asm.ByteVector byteVector20 = byteVector18.putLong((long) (byte) 10);
        org.mockito.asm.ByteVector byteVector22 = byteVector18.putLong((long) (short) 100);
        byte[] byteArray27 = new byte[] { (byte) 1, (byte) 0, (byte) 0, (byte) -1 };
        org.mockito.asm.ByteVector byteVector30 = byteVector18.putByteArray(byteArray27, 0, 0);
        // The following exception was thrown during execution in test generation
        try {
            org.mockito.asm.ByteVector byteVector33 = byteVector3.putByteArray(byteArray27, (int) 'a', (-1));
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteVector3);
        org.junit.Assert.assertNotNull(byteVector6);
        org.junit.Assert.assertNotNull(byteVector8);
        org.junit.Assert.assertNotNull(byteVector10);
        org.junit.Assert.assertNotNull(byteVector12);
        org.junit.Assert.assertNotNull(byteVector14);
        org.junit.Assert.assertNotNull(byteVector16);
        org.junit.Assert.assertNotNull(byteVector18);
        org.junit.Assert.assertNotNull(byteVector20);
        org.junit.Assert.assertNotNull(byteVector22);
        org.junit.Assert.assertNotNull(byteArray27);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray27), "[1, 0, 0, -1]");
        org.junit.Assert.assertNotNull(byteVector30);
    }

    @Test
    public void test0123() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0123");
        org.mockito.asm.ByteVector byteVector0 = new org.mockito.asm.ByteVector();
        org.mockito.asm.ByteVector byteVector2 = byteVector0.putUTF8("hi!");
        org.mockito.asm.ByteVector byteVector4 = byteVector2.putLong((long) (byte) 10);
        org.mockito.asm.ByteVector byteVector6 = byteVector4.putUTF8("hi!");
        org.mockito.asm.ByteVector byteVector8 = byteVector4.putLong((long) (short) -1);
        org.mockito.asm.ByteVector byteVector10 = byteVector8.putInt(10);
        org.mockito.asm.ByteVector byteVector12 = byteVector8.putByte((int) (short) 1);
        org.mockito.asm.ByteVector byteVector14 = byteVector12.putShort((int) (short) 100);
        org.mockito.asm.ByteVector byteVector16 = byteVector14.putByte((int) ' ');
        org.mockito.asm.ByteVector byteVector18 = byteVector14.putInt((int) (byte) 10);
        org.mockito.asm.ByteVector byteVector20 = byteVector14.putUTF8("hi!");
        org.mockito.asm.ByteVector byteVector22 = byteVector20.putLong((long) (-1));
        java.lang.Class<?> wildcardClass23 = byteVector20.getClass();
        org.junit.Assert.assertNotNull(byteVector2);
        org.junit.Assert.assertNotNull(byteVector4);
        org.junit.Assert.assertNotNull(byteVector6);
        org.junit.Assert.assertNotNull(byteVector8);
        org.junit.Assert.assertNotNull(byteVector10);
        org.junit.Assert.assertNotNull(byteVector12);
        org.junit.Assert.assertNotNull(byteVector14);
        org.junit.Assert.assertNotNull(byteVector16);
        org.junit.Assert.assertNotNull(byteVector18);
        org.junit.Assert.assertNotNull(byteVector20);
        org.junit.Assert.assertNotNull(byteVector22);
        org.junit.Assert.assertNotNull(wildcardClass23);
    }

    @Test
    public void test0124() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0124");
        org.mockito.asm.ByteVector byteVector0 = new org.mockito.asm.ByteVector();
        org.mockito.asm.ByteVector byteVector2 = byteVector0.putUTF8("hi!");
        org.mockito.asm.ByteVector byteVector4 = byteVector0.putLong((long) ' ');
        org.mockito.asm.ByteVector byteVector6 = byteVector4.putByte((int) 'a');
        org.mockito.asm.ByteVector byteVector8 = byteVector4.putByte((int) (short) -1);
        org.mockito.asm.ByteVector byteVector10 = byteVector4.putLong(0L);
        org.mockito.asm.ByteVector byteVector12 = byteVector10.putByte(0);
        org.mockito.asm.ByteVector byteVector14 = byteVector12.putByte(100);
        org.mockito.asm.ByteVector byteVector16 = byteVector12.putByte((int) '4');
        org.mockito.asm.ByteVector byteVector18 = byteVector16.putByte((int) 'a');
        org.mockito.asm.ByteVector byteVector20 = new org.mockito.asm.ByteVector((int) (short) 0);
        org.mockito.asm.ByteVector byteVector21 = new org.mockito.asm.ByteVector();
        org.mockito.asm.ByteVector byteVector23 = byteVector21.putUTF8("hi!");
        org.mockito.asm.ByteVector byteVector25 = byteVector21.putInt(0);
        org.mockito.asm.ByteVector byteVector27 = byteVector25.putInt((int) ' ');
        org.mockito.asm.ByteVector byteVector29 = byteVector27.putLong(100L);
        byte[] byteArray33 = new byte[] { (byte) 0, (byte) 10, (byte) 1 };
        org.mockito.asm.ByteVector byteVector36 = byteVector27.putByteArray(byteArray33, 0, 0);
        org.mockito.asm.ByteVector byteVector39 = byteVector20.putByteArray(byteArray33, 1, (int) (short) 0);
        // The following exception was thrown during execution in test generation
        try {
            org.mockito.asm.ByteVector byteVector42 = byteVector16.putByteArray(byteArray33, (int) (byte) 10, (int) (short) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteVector2);
        org.junit.Assert.assertNotNull(byteVector4);
        org.junit.Assert.assertNotNull(byteVector6);
        org.junit.Assert.assertNotNull(byteVector8);
        org.junit.Assert.assertNotNull(byteVector10);
        org.junit.Assert.assertNotNull(byteVector12);
        org.junit.Assert.assertNotNull(byteVector14);
        org.junit.Assert.assertNotNull(byteVector16);
        org.junit.Assert.assertNotNull(byteVector18);
        org.junit.Assert.assertNotNull(byteVector23);
        org.junit.Assert.assertNotNull(byteVector25);
        org.junit.Assert.assertNotNull(byteVector27);
        org.junit.Assert.assertNotNull(byteVector29);
        org.junit.Assert.assertNotNull(byteArray33);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray33), "[0, 10, 1]");
        org.junit.Assert.assertNotNull(byteVector36);
        org.junit.Assert.assertNotNull(byteVector39);
    }

    @Test
    public void test0125() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0125");
        org.mockito.asm.ByteVector byteVector1 = new org.mockito.asm.ByteVector((int) ' ');
        org.mockito.asm.ByteVector byteVector3 = byteVector1.putInt((int) '4');
        org.mockito.asm.ByteVector byteVector5 = byteVector3.putUTF8("");
        java.lang.Class<?> wildcardClass6 = byteVector3.getClass();
        org.junit.Assert.assertNotNull(byteVector3);
        org.junit.Assert.assertNotNull(byteVector5);
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void test0126() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0126");
        org.mockito.asm.ByteVector byteVector0 = new org.mockito.asm.ByteVector();
        org.mockito.asm.ByteVector byteVector2 = byteVector0.putUTF8("hi!");
        org.mockito.asm.ByteVector byteVector4 = byteVector2.putLong((long) (byte) 10);
        org.mockito.asm.ByteVector byteVector6 = byteVector4.putUTF8("hi!");
        org.mockito.asm.ByteVector byteVector8 = byteVector4.putLong((long) (short) -1);
        org.mockito.asm.ByteVector byteVector10 = byteVector8.putInt(10);
        org.mockito.asm.ByteVector byteVector12 = byteVector8.putByte((int) (short) 1);
        org.mockito.asm.ByteVector byteVector14 = byteVector8.putInt((int) (short) -1);
        org.mockito.asm.ByteVector byteVector16 = byteVector8.putUTF8("hi!");
        org.mockito.asm.ByteVector byteVector17 = new org.mockito.asm.ByteVector();
        org.mockito.asm.ByteVector byteVector19 = byteVector17.putUTF8("hi!");
        org.mockito.asm.ByteVector byteVector21 = byteVector17.putInt(0);
        org.mockito.asm.ByteVector byteVector23 = byteVector21.putInt((int) ' ');
        org.mockito.asm.ByteVector byteVector25 = byteVector23.putLong(100L);
        byte[] byteArray29 = new byte[] { (byte) 0, (byte) 10, (byte) 1 };
        org.mockito.asm.ByteVector byteVector32 = byteVector23.putByteArray(byteArray29, 0, 0);
        // The following exception was thrown during execution in test generation
        try {
            org.mockito.asm.ByteVector byteVector35 = byteVector8.putByteArray(byteArray29, (int) (byte) 1, (int) '4');
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteVector2);
        org.junit.Assert.assertNotNull(byteVector4);
        org.junit.Assert.assertNotNull(byteVector6);
        org.junit.Assert.assertNotNull(byteVector8);
        org.junit.Assert.assertNotNull(byteVector10);
        org.junit.Assert.assertNotNull(byteVector12);
        org.junit.Assert.assertNotNull(byteVector14);
        org.junit.Assert.assertNotNull(byteVector16);
        org.junit.Assert.assertNotNull(byteVector19);
        org.junit.Assert.assertNotNull(byteVector21);
        org.junit.Assert.assertNotNull(byteVector23);
        org.junit.Assert.assertNotNull(byteVector25);
        org.junit.Assert.assertNotNull(byteArray29);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray29), "[0, 10, 1]");
        org.junit.Assert.assertNotNull(byteVector32);
    }

    @Test
    public void test0127() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0127");
        org.mockito.asm.ByteVector byteVector0 = new org.mockito.asm.ByteVector();
        org.mockito.asm.ByteVector byteVector2 = byteVector0.putUTF8("hi!");
        org.mockito.asm.ByteVector byteVector4 = byteVector2.putLong((long) (byte) 10);
        org.mockito.asm.ByteVector byteVector6 = byteVector4.putUTF8("hi!");
        org.mockito.asm.ByteVector byteVector8 = byteVector4.putLong((-1L));
        org.mockito.asm.ByteVector byteVector10 = byteVector8.putInt(10);
        org.mockito.asm.ByteVector byteVector12 = byteVector10.putShort((int) '#');
        org.mockito.asm.ByteVector byteVector14 = byteVector10.putLong((long) (byte) -1);
        org.mockito.asm.ByteVector byteVector16 = byteVector10.putLong((long) '4');
        org.mockito.asm.ByteVector byteVector18 = byteVector10.putInt((int) (short) 0);
        org.junit.Assert.assertNotNull(byteVector2);
        org.junit.Assert.assertNotNull(byteVector4);
        org.junit.Assert.assertNotNull(byteVector6);
        org.junit.Assert.assertNotNull(byteVector8);
        org.junit.Assert.assertNotNull(byteVector10);
        org.junit.Assert.assertNotNull(byteVector12);
        org.junit.Assert.assertNotNull(byteVector14);
        org.junit.Assert.assertNotNull(byteVector16);
        org.junit.Assert.assertNotNull(byteVector18);
    }

    @Test
    public void test0128() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0128");
        org.mockito.asm.ByteVector byteVector0 = new org.mockito.asm.ByteVector();
        org.mockito.asm.ByteVector byteVector2 = byteVector0.putUTF8("hi!");
        org.mockito.asm.ByteVector byteVector4 = byteVector0.putLong((long) (short) 1);
        org.mockito.asm.ByteVector byteVector6 = byteVector4.putShort((int) (byte) -1);
        java.lang.Class<?> wildcardClass7 = byteVector6.getClass();
        org.junit.Assert.assertNotNull(byteVector2);
        org.junit.Assert.assertNotNull(byteVector4);
        org.junit.Assert.assertNotNull(byteVector6);
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test0129() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0129");
        org.mockito.asm.ByteVector byteVector0 = new org.mockito.asm.ByteVector();
        org.mockito.asm.ByteVector byteVector2 = byteVector0.putUTF8("hi!");
        org.mockito.asm.ByteVector byteVector4 = byteVector2.putLong((long) (byte) 10);
        org.mockito.asm.ByteVector byteVector6 = byteVector4.putInt((int) 'a');
        org.mockito.asm.ByteVector byteVector8 = byteVector6.putShort((int) (byte) 0);
        org.mockito.asm.ByteVector byteVector10 = byteVector8.putUTF8("");
        org.mockito.asm.ByteVector byteVector11 = new org.mockito.asm.ByteVector();
        org.mockito.asm.ByteVector byteVector13 = byteVector11.putUTF8("hi!");
        org.mockito.asm.ByteVector byteVector15 = byteVector11.putLong((long) ' ');
        org.mockito.asm.ByteVector byteVector17 = byteVector15.putByte((int) 'a');
        org.mockito.asm.ByteVector byteVector19 = byteVector15.putByte((int) (short) -1);
        org.mockito.asm.ByteVector byteVector21 = byteVector15.putLong(0L);
        org.mockito.asm.ByteVector byteVector23 = byteVector15.putUTF8("hi!");
        org.mockito.asm.ByteVector byteVector25 = byteVector23.putUTF8("");
        org.mockito.asm.ByteVector byteVector27 = byteVector23.putInt((int) (byte) 10);
        org.mockito.asm.ByteVector byteVector29 = byteVector23.putByte(0);
        org.mockito.asm.ByteVector byteVector30 = new org.mockito.asm.ByteVector();
        org.mockito.asm.ByteVector byteVector32 = byteVector30.putUTF8("hi!");
        org.mockito.asm.ByteVector byteVector34 = byteVector30.putInt(0);
        org.mockito.asm.ByteVector byteVector36 = byteVector34.putInt((int) ' ');
        org.mockito.asm.ByteVector byteVector38 = byteVector36.putLong(100L);
        byte[] byteArray42 = new byte[] { (byte) 0, (byte) 10, (byte) 1 };
        org.mockito.asm.ByteVector byteVector45 = byteVector36.putByteArray(byteArray42, 0, 0);
        org.mockito.asm.ByteVector byteVector48 = byteVector29.putByteArray(byteArray42, (int) (short) 1, 0);
        // The following exception was thrown during execution in test generation
        try {
            org.mockito.asm.ByteVector byteVector51 = byteVector10.putByteArray(byteArray42, (int) (short) 10, 0);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteVector2);
        org.junit.Assert.assertNotNull(byteVector4);
        org.junit.Assert.assertNotNull(byteVector6);
        org.junit.Assert.assertNotNull(byteVector8);
        org.junit.Assert.assertNotNull(byteVector10);
        org.junit.Assert.assertNotNull(byteVector13);
        org.junit.Assert.assertNotNull(byteVector15);
        org.junit.Assert.assertNotNull(byteVector17);
        org.junit.Assert.assertNotNull(byteVector19);
        org.junit.Assert.assertNotNull(byteVector21);
        org.junit.Assert.assertNotNull(byteVector23);
        org.junit.Assert.assertNotNull(byteVector25);
        org.junit.Assert.assertNotNull(byteVector27);
        org.junit.Assert.assertNotNull(byteVector29);
        org.junit.Assert.assertNotNull(byteVector32);
        org.junit.Assert.assertNotNull(byteVector34);
        org.junit.Assert.assertNotNull(byteVector36);
        org.junit.Assert.assertNotNull(byteVector38);
        org.junit.Assert.assertNotNull(byteArray42);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray42), "[0, 10, 1]");
        org.junit.Assert.assertNotNull(byteVector45);
        org.junit.Assert.assertNotNull(byteVector48);
    }

    @Test
    public void test0130() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0130");
        org.mockito.asm.ByteVector byteVector0 = new org.mockito.asm.ByteVector();
        org.mockito.asm.ByteVector byteVector2 = byteVector0.putUTF8("hi!");
        org.mockito.asm.ByteVector byteVector4 = byteVector2.putLong((long) (byte) 10);
        org.mockito.asm.ByteVector byteVector6 = byteVector4.putUTF8("hi!");
        org.mockito.asm.ByteVector byteVector8 = byteVector4.putLong((long) (short) -1);
        org.mockito.asm.ByteVector byteVector10 = byteVector8.putInt(10);
        org.mockito.asm.ByteVector byteVector12 = byteVector8.putByte((int) (short) 1);
        org.mockito.asm.ByteVector byteVector14 = byteVector8.putInt((int) (short) -1);
        java.lang.Class<?> wildcardClass15 = byteVector14.getClass();
        org.junit.Assert.assertNotNull(byteVector2);
        org.junit.Assert.assertNotNull(byteVector4);
        org.junit.Assert.assertNotNull(byteVector6);
        org.junit.Assert.assertNotNull(byteVector8);
        org.junit.Assert.assertNotNull(byteVector10);
        org.junit.Assert.assertNotNull(byteVector12);
        org.junit.Assert.assertNotNull(byteVector14);
        org.junit.Assert.assertNotNull(wildcardClass15);
    }

    @Test
    public void test0131() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0131");
        org.mockito.asm.ByteVector byteVector1 = new org.mockito.asm.ByteVector(100);
        org.mockito.asm.ByteVector byteVector3 = byteVector1.putLong((long) (byte) -1);
        org.mockito.asm.ByteVector byteVector5 = new org.mockito.asm.ByteVector((int) (short) 0);
        org.mockito.asm.ByteVector byteVector6 = new org.mockito.asm.ByteVector();
        org.mockito.asm.ByteVector byteVector8 = byteVector6.putUTF8("hi!");
        org.mockito.asm.ByteVector byteVector10 = byteVector6.putInt(0);
        org.mockito.asm.ByteVector byteVector12 = byteVector10.putInt((int) ' ');
        org.mockito.asm.ByteVector byteVector14 = byteVector12.putLong(100L);
        byte[] byteArray18 = new byte[] { (byte) 0, (byte) 10, (byte) 1 };
        org.mockito.asm.ByteVector byteVector21 = byteVector12.putByteArray(byteArray18, 0, 0);
        org.mockito.asm.ByteVector byteVector24 = byteVector5.putByteArray(byteArray18, 1, (int) (short) 0);
        // The following exception was thrown during execution in test generation
        try {
            org.mockito.asm.ByteVector byteVector27 = byteVector1.putByteArray(byteArray18, (-1), 1);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteVector3);
        org.junit.Assert.assertNotNull(byteVector8);
        org.junit.Assert.assertNotNull(byteVector10);
        org.junit.Assert.assertNotNull(byteVector12);
        org.junit.Assert.assertNotNull(byteVector14);
        org.junit.Assert.assertNotNull(byteArray18);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray18), "[0, 10, 1]");
        org.junit.Assert.assertNotNull(byteVector21);
        org.junit.Assert.assertNotNull(byteVector24);
    }

    @Test
    public void test0132() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0132");
        org.mockito.asm.ByteVector byteVector1 = new org.mockito.asm.ByteVector((int) '#');
        org.mockito.asm.ByteVector byteVector3 = byteVector1.putLong(100L);
        org.mockito.asm.ByteVector byteVector5 = byteVector3.putUTF8("");
        org.mockito.asm.ByteVector byteVector6 = new org.mockito.asm.ByteVector();
        org.mockito.asm.ByteVector byteVector8 = byteVector6.putUTF8("hi!");
        org.mockito.asm.ByteVector byteVector10 = byteVector6.putLong((long) ' ');
        org.mockito.asm.ByteVector byteVector12 = byteVector10.putByte((int) 'a');
        org.mockito.asm.ByteVector byteVector14 = byteVector10.putByte((int) (short) -1);
        org.mockito.asm.ByteVector byteVector16 = byteVector10.putLong(0L);
        org.mockito.asm.ByteVector byteVector18 = byteVector10.putUTF8("hi!");
        org.mockito.asm.ByteVector byteVector20 = byteVector18.putUTF8("");
        org.mockito.asm.ByteVector byteVector22 = byteVector18.putInt((int) (byte) 10);
        org.mockito.asm.ByteVector byteVector24 = byteVector18.putByte(0);
        org.mockito.asm.ByteVector byteVector25 = new org.mockito.asm.ByteVector();
        org.mockito.asm.ByteVector byteVector27 = byteVector25.putUTF8("hi!");
        org.mockito.asm.ByteVector byteVector29 = byteVector25.putInt(0);
        org.mockito.asm.ByteVector byteVector31 = byteVector29.putInt((int) ' ');
        org.mockito.asm.ByteVector byteVector33 = byteVector31.putLong(100L);
        byte[] byteArray37 = new byte[] { (byte) 0, (byte) 10, (byte) 1 };
        org.mockito.asm.ByteVector byteVector40 = byteVector31.putByteArray(byteArray37, 0, 0);
        org.mockito.asm.ByteVector byteVector43 = byteVector24.putByteArray(byteArray37, (int) (short) 1, 0);
        // The following exception was thrown during execution in test generation
        try {
            org.mockito.asm.ByteVector byteVector46 = byteVector3.putByteArray(byteArray37, (int) (byte) -1, (int) (short) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteVector3);
        org.junit.Assert.assertNotNull(byteVector5);
        org.junit.Assert.assertNotNull(byteVector8);
        org.junit.Assert.assertNotNull(byteVector10);
        org.junit.Assert.assertNotNull(byteVector12);
        org.junit.Assert.assertNotNull(byteVector14);
        org.junit.Assert.assertNotNull(byteVector16);
        org.junit.Assert.assertNotNull(byteVector18);
        org.junit.Assert.assertNotNull(byteVector20);
        org.junit.Assert.assertNotNull(byteVector22);
        org.junit.Assert.assertNotNull(byteVector24);
        org.junit.Assert.assertNotNull(byteVector27);
        org.junit.Assert.assertNotNull(byteVector29);
        org.junit.Assert.assertNotNull(byteVector31);
        org.junit.Assert.assertNotNull(byteVector33);
        org.junit.Assert.assertNotNull(byteArray37);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray37), "[0, 10, 1]");
        org.junit.Assert.assertNotNull(byteVector40);
        org.junit.Assert.assertNotNull(byteVector43);
    }

    @Test
    public void test0133() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0133");
        org.mockito.asm.ByteVector byteVector1 = new org.mockito.asm.ByteVector((int) (short) 0);
        org.mockito.asm.ByteVector byteVector2 = new org.mockito.asm.ByteVector();
        org.mockito.asm.ByteVector byteVector4 = byteVector2.putUTF8("hi!");
        org.mockito.asm.ByteVector byteVector6 = byteVector2.putInt(0);
        org.mockito.asm.ByteVector byteVector8 = byteVector6.putInt((int) ' ');
        org.mockito.asm.ByteVector byteVector10 = byteVector8.putLong(100L);
        byte[] byteArray14 = new byte[] { (byte) 0, (byte) 10, (byte) 1 };
        org.mockito.asm.ByteVector byteVector17 = byteVector8.putByteArray(byteArray14, 0, 0);
        org.mockito.asm.ByteVector byteVector20 = byteVector1.putByteArray(byteArray14, 1, (int) (short) 0);
        java.lang.Class<?> wildcardClass21 = byteVector1.getClass();
        org.junit.Assert.assertNotNull(byteVector4);
        org.junit.Assert.assertNotNull(byteVector6);
        org.junit.Assert.assertNotNull(byteVector8);
        org.junit.Assert.assertNotNull(byteVector10);
        org.junit.Assert.assertNotNull(byteArray14);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray14), "[0, 10, 1]");
        org.junit.Assert.assertNotNull(byteVector17);
        org.junit.Assert.assertNotNull(byteVector20);
        org.junit.Assert.assertNotNull(wildcardClass21);
    }

    @Test
    public void test0134() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0134");
        org.mockito.asm.ByteVector byteVector0 = new org.mockito.asm.ByteVector();
        org.mockito.asm.ByteVector byteVector2 = byteVector0.putUTF8("hi!");
        org.mockito.asm.ByteVector byteVector4 = byteVector2.putLong((long) (byte) 10);
        org.mockito.asm.ByteVector byteVector6 = byteVector4.putUTF8("hi!");
        org.mockito.asm.ByteVector byteVector8 = byteVector4.putLong((long) (short) -1);
        org.mockito.asm.ByteVector byteVector10 = byteVector8.putInt(10);
        org.mockito.asm.ByteVector byteVector12 = byteVector8.putByte((int) (short) 1);
        org.mockito.asm.ByteVector byteVector14 = byteVector12.putInt((int) (byte) 0);
        org.junit.Assert.assertNotNull(byteVector2);
        org.junit.Assert.assertNotNull(byteVector4);
        org.junit.Assert.assertNotNull(byteVector6);
        org.junit.Assert.assertNotNull(byteVector8);
        org.junit.Assert.assertNotNull(byteVector10);
        org.junit.Assert.assertNotNull(byteVector12);
        org.junit.Assert.assertNotNull(byteVector14);
    }

    @Test
    public void test0135() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0135");
        org.mockito.asm.ByteVector byteVector1 = new org.mockito.asm.ByteVector((int) '#');
        org.mockito.asm.ByteVector byteVector3 = byteVector1.putLong(100L);
        org.mockito.asm.ByteVector byteVector5 = byteVector3.putUTF8("");
        java.lang.Class<?> wildcardClass6 = byteVector3.getClass();
        org.junit.Assert.assertNotNull(byteVector3);
        org.junit.Assert.assertNotNull(byteVector5);
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void test0136() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0136");
        org.mockito.asm.ByteVector byteVector0 = new org.mockito.asm.ByteVector();
        org.mockito.asm.ByteVector byteVector2 = byteVector0.putUTF8("hi!");
        org.mockito.asm.ByteVector byteVector4 = byteVector0.putLong((long) ' ');
        org.mockito.asm.ByteVector byteVector6 = byteVector4.putByte((int) 'a');
        org.mockito.asm.ByteVector byteVector8 = byteVector4.putByte((int) (short) -1);
        org.mockito.asm.ByteVector byteVector10 = byteVector4.putLong(0L);
        org.mockito.asm.ByteVector byteVector12 = byteVector4.putUTF8("hi!");
        org.mockito.asm.ByteVector byteVector14 = byteVector12.putLong((long) '4');
        byte[] byteArray15 = new byte[] {};
        // The following exception was thrown during execution in test generation
        try {
            org.mockito.asm.ByteVector byteVector18 = byteVector12.putByteArray(byteArray15, (-1), (int) (short) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteVector2);
        org.junit.Assert.assertNotNull(byteVector4);
        org.junit.Assert.assertNotNull(byteVector6);
        org.junit.Assert.assertNotNull(byteVector8);
        org.junit.Assert.assertNotNull(byteVector10);
        org.junit.Assert.assertNotNull(byteVector12);
        org.junit.Assert.assertNotNull(byteVector14);
        org.junit.Assert.assertNotNull(byteArray15);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray15), "[]");
    }

    @Test
    public void test0137() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0137");
        org.mockito.asm.ByteVector byteVector0 = new org.mockito.asm.ByteVector();
        org.mockito.asm.ByteVector byteVector2 = byteVector0.putUTF8("hi!");
        org.mockito.asm.ByteVector byteVector4 = byteVector0.putShort((int) (short) 100);
        org.mockito.asm.ByteVector byteVector6 = byteVector4.putUTF8("hi!");
        org.mockito.asm.ByteVector byteVector8 = byteVector6.putByte((int) '4');
        java.lang.Class<?> wildcardClass9 = byteVector6.getClass();
        org.junit.Assert.assertNotNull(byteVector2);
        org.junit.Assert.assertNotNull(byteVector4);
        org.junit.Assert.assertNotNull(byteVector6);
        org.junit.Assert.assertNotNull(byteVector8);
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test0138() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0138");
        org.mockito.asm.ByteVector byteVector0 = new org.mockito.asm.ByteVector();
        org.mockito.asm.ByteVector byteVector2 = byteVector0.putUTF8("hi!");
        org.mockito.asm.ByteVector byteVector4 = byteVector2.putInt((int) (byte) 10);
        org.mockito.asm.ByteVector byteVector6 = byteVector2.putLong((long) 0);
        org.mockito.asm.ByteVector byteVector7 = new org.mockito.asm.ByteVector();
        org.mockito.asm.ByteVector byteVector9 = byteVector7.putUTF8("hi!");
        org.mockito.asm.ByteVector byteVector11 = byteVector7.putInt(0);
        org.mockito.asm.ByteVector byteVector13 = byteVector11.putInt((int) ' ');
        org.mockito.asm.ByteVector byteVector15 = byteVector13.putLong(100L);
        byte[] byteArray19 = new byte[] { (byte) 0, (byte) 10, (byte) 1 };
        org.mockito.asm.ByteVector byteVector22 = byteVector13.putByteArray(byteArray19, 0, 0);
        // The following exception was thrown during execution in test generation
        try {
            org.mockito.asm.ByteVector byteVector25 = byteVector6.putByteArray(byteArray19, (int) '#', (-1));
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteVector2);
        org.junit.Assert.assertNotNull(byteVector4);
        org.junit.Assert.assertNotNull(byteVector6);
        org.junit.Assert.assertNotNull(byteVector9);
        org.junit.Assert.assertNotNull(byteVector11);
        org.junit.Assert.assertNotNull(byteVector13);
        org.junit.Assert.assertNotNull(byteVector15);
        org.junit.Assert.assertNotNull(byteArray19);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray19), "[0, 10, 1]");
        org.junit.Assert.assertNotNull(byteVector22);
    }

    @Test
    public void test0139() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0139");
        org.mockito.asm.ByteVector byteVector1 = new org.mockito.asm.ByteVector((int) '4');
        org.mockito.asm.ByteVector byteVector3 = byteVector1.putByte((int) (short) 1);
        org.mockito.asm.ByteVector byteVector5 = byteVector1.putUTF8("");
        java.lang.Class<?> wildcardClass6 = byteVector1.getClass();
        org.junit.Assert.assertNotNull(byteVector3);
        org.junit.Assert.assertNotNull(byteVector5);
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void test0140() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0140");
        org.mockito.asm.ByteVector byteVector0 = new org.mockito.asm.ByteVector();
        org.mockito.asm.ByteVector byteVector2 = byteVector0.putUTF8("hi!");
        org.mockito.asm.ByteVector byteVector4 = byteVector0.putLong((long) ' ');
        org.mockito.asm.ByteVector byteVector6 = byteVector4.putByte((int) 'a');
        org.mockito.asm.ByteVector byteVector8 = byteVector6.putInt((int) (short) 0);
        org.mockito.asm.ByteVector byteVector10 = new org.mockito.asm.ByteVector((int) (short) 0);
        org.mockito.asm.ByteVector byteVector11 = new org.mockito.asm.ByteVector();
        org.mockito.asm.ByteVector byteVector13 = byteVector11.putUTF8("hi!");
        org.mockito.asm.ByteVector byteVector15 = byteVector11.putInt(0);
        org.mockito.asm.ByteVector byteVector17 = byteVector15.putInt((int) ' ');
        org.mockito.asm.ByteVector byteVector19 = byteVector17.putLong(100L);
        byte[] byteArray23 = new byte[] { (byte) 0, (byte) 10, (byte) 1 };
        org.mockito.asm.ByteVector byteVector26 = byteVector17.putByteArray(byteArray23, 0, 0);
        org.mockito.asm.ByteVector byteVector29 = byteVector10.putByteArray(byteArray23, 1, (int) (short) 0);
        // The following exception was thrown during execution in test generation
        try {
            org.mockito.asm.ByteVector byteVector32 = byteVector6.putByteArray(byteArray23, (int) (byte) -1, (int) (byte) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteVector2);
        org.junit.Assert.assertNotNull(byteVector4);
        org.junit.Assert.assertNotNull(byteVector6);
        org.junit.Assert.assertNotNull(byteVector8);
        org.junit.Assert.assertNotNull(byteVector13);
        org.junit.Assert.assertNotNull(byteVector15);
        org.junit.Assert.assertNotNull(byteVector17);
        org.junit.Assert.assertNotNull(byteVector19);
        org.junit.Assert.assertNotNull(byteArray23);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray23), "[0, 10, 1]");
        org.junit.Assert.assertNotNull(byteVector26);
        org.junit.Assert.assertNotNull(byteVector29);
    }

    @Test
    public void test0141() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0141");
        org.mockito.asm.ByteVector byteVector0 = new org.mockito.asm.ByteVector();
        org.mockito.asm.ByteVector byteVector2 = byteVector0.putUTF8("hi!");
        org.mockito.asm.ByteVector byteVector4 = byteVector2.putInt(0);
        org.mockito.asm.ByteVector byteVector6 = byteVector2.putByte((int) (byte) 10);
        org.mockito.asm.ByteVector byteVector8 = byteVector6.putUTF8("hi!");
        org.mockito.asm.ByteVector byteVector10 = byteVector8.putUTF8("hi!");
        org.mockito.asm.ByteVector byteVector12 = byteVector8.putUTF8("hi!");
        java.lang.Class<?> wildcardClass13 = byteVector8.getClass();
        org.junit.Assert.assertNotNull(byteVector2);
        org.junit.Assert.assertNotNull(byteVector4);
        org.junit.Assert.assertNotNull(byteVector6);
        org.junit.Assert.assertNotNull(byteVector8);
        org.junit.Assert.assertNotNull(byteVector10);
        org.junit.Assert.assertNotNull(byteVector12);
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test0142() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0142");
        org.mockito.asm.ByteVector byteVector0 = new org.mockito.asm.ByteVector();
        org.mockito.asm.ByteVector byteVector2 = byteVector0.putUTF8("hi!");
        org.mockito.asm.ByteVector byteVector4 = byteVector0.putLong((long) ' ');
        org.mockito.asm.ByteVector byteVector6 = byteVector4.putByte((int) 'a');
        org.mockito.asm.ByteVector byteVector8 = byteVector4.putLong((long) ' ');
        java.lang.Class<?> wildcardClass9 = byteVector8.getClass();
        org.junit.Assert.assertNotNull(byteVector2);
        org.junit.Assert.assertNotNull(byteVector4);
        org.junit.Assert.assertNotNull(byteVector6);
        org.junit.Assert.assertNotNull(byteVector8);
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test0143() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0143");
        org.mockito.asm.ByteVector byteVector1 = new org.mockito.asm.ByteVector((int) '#');
        org.mockito.asm.ByteVector byteVector3 = byteVector1.putLong(100L);
        org.mockito.asm.ByteVector byteVector5 = byteVector3.putLong(1L);
        org.mockito.asm.ByteVector byteVector7 = byteVector5.putUTF8("hi!");
        java.lang.Class<?> wildcardClass8 = byteVector5.getClass();
        org.junit.Assert.assertNotNull(byteVector3);
        org.junit.Assert.assertNotNull(byteVector5);
        org.junit.Assert.assertNotNull(byteVector7);
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test0144() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0144");
        org.mockito.asm.ByteVector byteVector0 = new org.mockito.asm.ByteVector();
        org.mockito.asm.ByteVector byteVector2 = byteVector0.putUTF8("hi!");
        org.mockito.asm.ByteVector byteVector4 = byteVector2.putLong((long) (byte) 10);
        org.mockito.asm.ByteVector byteVector6 = byteVector4.putInt((int) 'a');
        org.mockito.asm.ByteVector byteVector8 = byteVector6.putShort((int) (byte) 0);
        java.lang.Class<?> wildcardClass9 = byteVector8.getClass();
        org.junit.Assert.assertNotNull(byteVector2);
        org.junit.Assert.assertNotNull(byteVector4);
        org.junit.Assert.assertNotNull(byteVector6);
        org.junit.Assert.assertNotNull(byteVector8);
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test0145() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0145");
        org.mockito.asm.ByteVector byteVector0 = new org.mockito.asm.ByteVector();
        org.mockito.asm.ByteVector byteVector2 = byteVector0.putUTF8("hi!");
        org.mockito.asm.ByteVector byteVector4 = byteVector0.putShort((int) (short) -1);
        org.mockito.asm.ByteVector byteVector6 = byteVector0.putLong(0L);
        org.mockito.asm.ByteVector byteVector8 = byteVector0.putShort((int) (byte) -1);
        java.lang.Class<?> wildcardClass9 = byteVector0.getClass();
        org.junit.Assert.assertNotNull(byteVector2);
        org.junit.Assert.assertNotNull(byteVector4);
        org.junit.Assert.assertNotNull(byteVector6);
        org.junit.Assert.assertNotNull(byteVector8);
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test0146() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0146");
        org.mockito.asm.ByteVector byteVector0 = new org.mockito.asm.ByteVector();
        org.mockito.asm.ByteVector byteVector2 = byteVector0.putUTF8("hi!");
        org.mockito.asm.ByteVector byteVector4 = byteVector2.putLong((long) (byte) 10);
        org.mockito.asm.ByteVector byteVector6 = byteVector4.putInt((int) 'a');
        org.mockito.asm.ByteVector byteVector8 = byteVector6.putShort((int) (byte) 0);
        org.mockito.asm.ByteVector byteVector10 = byteVector6.putShort(0);
        org.mockito.asm.ByteVector byteVector12 = byteVector10.putShort(10);
        org.mockito.asm.ByteVector byteVector14 = byteVector12.putUTF8("hi!");
        org.junit.Assert.assertNotNull(byteVector2);
        org.junit.Assert.assertNotNull(byteVector4);
        org.junit.Assert.assertNotNull(byteVector6);
        org.junit.Assert.assertNotNull(byteVector8);
        org.junit.Assert.assertNotNull(byteVector10);
        org.junit.Assert.assertNotNull(byteVector12);
        org.junit.Assert.assertNotNull(byteVector14);
    }

    @Test
    public void test0147() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0147");
        org.mockito.asm.ByteVector byteVector0 = new org.mockito.asm.ByteVector();
        org.mockito.asm.ByteVector byteVector2 = byteVector0.putUTF8("hi!");
        org.mockito.asm.ByteVector byteVector4 = byteVector0.putLong((long) ' ');
        org.mockito.asm.ByteVector byteVector6 = byteVector4.putByte((int) 'a');
        org.mockito.asm.ByteVector byteVector8 = byteVector6.putByte((int) (short) -1);
        org.mockito.asm.ByteVector byteVector9 = new org.mockito.asm.ByteVector();
        org.mockito.asm.ByteVector byteVector11 = byteVector9.putUTF8("hi!");
        org.mockito.asm.ByteVector byteVector13 = byteVector9.putInt(0);
        org.mockito.asm.ByteVector byteVector15 = byteVector13.putInt((int) ' ');
        org.mockito.asm.ByteVector byteVector17 = byteVector15.putLong(100L);
        byte[] byteArray21 = new byte[] { (byte) 0, (byte) 10, (byte) 1 };
        org.mockito.asm.ByteVector byteVector24 = byteVector15.putByteArray(byteArray21, 0, 0);
        // The following exception was thrown during execution in test generation
        try {
            org.mockito.asm.ByteVector byteVector27 = byteVector8.putByteArray(byteArray21, (int) (byte) 10, (-1));
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteVector2);
        org.junit.Assert.assertNotNull(byteVector4);
        org.junit.Assert.assertNotNull(byteVector6);
        org.junit.Assert.assertNotNull(byteVector8);
        org.junit.Assert.assertNotNull(byteVector11);
        org.junit.Assert.assertNotNull(byteVector13);
        org.junit.Assert.assertNotNull(byteVector15);
        org.junit.Assert.assertNotNull(byteVector17);
        org.junit.Assert.assertNotNull(byteArray21);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray21), "[0, 10, 1]");
        org.junit.Assert.assertNotNull(byteVector24);
    }

    @Test
    public void test0148() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0148");
        org.mockito.asm.ByteVector byteVector1 = new org.mockito.asm.ByteVector((int) '#');
        org.mockito.asm.ByteVector byteVector3 = byteVector1.putLong(100L);
        org.mockito.asm.ByteVector byteVector5 = new org.mockito.asm.ByteVector((int) (byte) 10);
        org.mockito.asm.ByteVector byteVector7 = byteVector5.putByte((int) '4');
        org.mockito.asm.ByteVector byteVector9 = byteVector5.putLong((long) 'a');
        org.mockito.asm.ByteVector byteVector10 = new org.mockito.asm.ByteVector();
        org.mockito.asm.ByteVector byteVector12 = byteVector10.putUTF8("hi!");
        org.mockito.asm.ByteVector byteVector14 = byteVector10.putLong((long) ' ');
        org.mockito.asm.ByteVector byteVector16 = byteVector14.putByte((int) 'a');
        org.mockito.asm.ByteVector byteVector18 = byteVector14.putByte((int) (short) -1);
        org.mockito.asm.ByteVector byteVector20 = byteVector14.putLong(0L);
        org.mockito.asm.ByteVector byteVector22 = byteVector14.putUTF8("hi!");
        org.mockito.asm.ByteVector byteVector24 = byteVector22.putUTF8("");
        org.mockito.asm.ByteVector byteVector26 = byteVector22.putInt((int) (byte) 10);
        org.mockito.asm.ByteVector byteVector28 = byteVector22.putByte(0);
        org.mockito.asm.ByteVector byteVector29 = new org.mockito.asm.ByteVector();
        org.mockito.asm.ByteVector byteVector31 = byteVector29.putUTF8("hi!");
        org.mockito.asm.ByteVector byteVector33 = byteVector29.putInt(0);
        org.mockito.asm.ByteVector byteVector35 = byteVector33.putInt((int) ' ');
        org.mockito.asm.ByteVector byteVector37 = byteVector35.putLong(100L);
        byte[] byteArray41 = new byte[] { (byte) 0, (byte) 10, (byte) 1 };
        org.mockito.asm.ByteVector byteVector44 = byteVector35.putByteArray(byteArray41, 0, 0);
        org.mockito.asm.ByteVector byteVector47 = byteVector28.putByteArray(byteArray41, (int) (short) 1, 0);
        org.mockito.asm.ByteVector byteVector50 = byteVector9.putByteArray(byteArray41, 0, 0);
        // The following exception was thrown during execution in test generation
        try {
            org.mockito.asm.ByteVector byteVector53 = byteVector3.putByteArray(byteArray41, (int) (byte) 1, (int) (byte) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteVector3);
        org.junit.Assert.assertNotNull(byteVector7);
        org.junit.Assert.assertNotNull(byteVector9);
        org.junit.Assert.assertNotNull(byteVector12);
        org.junit.Assert.assertNotNull(byteVector14);
        org.junit.Assert.assertNotNull(byteVector16);
        org.junit.Assert.assertNotNull(byteVector18);
        org.junit.Assert.assertNotNull(byteVector20);
        org.junit.Assert.assertNotNull(byteVector22);
        org.junit.Assert.assertNotNull(byteVector24);
        org.junit.Assert.assertNotNull(byteVector26);
        org.junit.Assert.assertNotNull(byteVector28);
        org.junit.Assert.assertNotNull(byteVector31);
        org.junit.Assert.assertNotNull(byteVector33);
        org.junit.Assert.assertNotNull(byteVector35);
        org.junit.Assert.assertNotNull(byteVector37);
        org.junit.Assert.assertNotNull(byteArray41);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray41), "[0, 10, 1]");
        org.junit.Assert.assertNotNull(byteVector44);
        org.junit.Assert.assertNotNull(byteVector47);
        org.junit.Assert.assertNotNull(byteVector50);
    }

    @Test
    public void test0149() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0149");
        org.mockito.asm.ByteVector byteVector1 = new org.mockito.asm.ByteVector((int) (short) 0);
        org.mockito.asm.ByteVector byteVector2 = new org.mockito.asm.ByteVector();
        org.mockito.asm.ByteVector byteVector4 = byteVector2.putUTF8("hi!");
        org.mockito.asm.ByteVector byteVector6 = byteVector2.putInt(0);
        org.mockito.asm.ByteVector byteVector8 = byteVector6.putInt((int) ' ');
        org.mockito.asm.ByteVector byteVector10 = byteVector8.putLong(100L);
        byte[] byteArray14 = new byte[] { (byte) 0, (byte) 10, (byte) 1 };
        org.mockito.asm.ByteVector byteVector17 = byteVector8.putByteArray(byteArray14, 0, 0);
        org.mockito.asm.ByteVector byteVector20 = byteVector1.putByteArray(byteArray14, 1, (int) (short) 0);
        org.mockito.asm.ByteVector byteVector22 = byteVector1.putLong((long) (byte) 100);
        org.mockito.asm.ByteVector byteVector24 = byteVector1.putLong((long) 1);
        org.junit.Assert.assertNotNull(byteVector4);
        org.junit.Assert.assertNotNull(byteVector6);
        org.junit.Assert.assertNotNull(byteVector8);
        org.junit.Assert.assertNotNull(byteVector10);
        org.junit.Assert.assertNotNull(byteArray14);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray14), "[0, 10, 1]");
        org.junit.Assert.assertNotNull(byteVector17);
        org.junit.Assert.assertNotNull(byteVector20);
        org.junit.Assert.assertNotNull(byteVector22);
        org.junit.Assert.assertNotNull(byteVector24);
    }

    @Test
    public void test0150() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0150");
        org.mockito.asm.ByteVector byteVector1 = new org.mockito.asm.ByteVector((int) '#');
        org.mockito.asm.ByteVector byteVector3 = byteVector1.putInt(100);
        org.mockito.asm.ByteVector byteVector5 = byteVector1.putInt((int) (byte) 1);
        org.mockito.asm.ByteVector byteVector7 = byteVector1.putInt((-1));
        byte[] byteArray10 = new byte[] { (byte) 10, (byte) 1 };
        // The following exception was thrown during execution in test generation
        try {
            org.mockito.asm.ByteVector byteVector13 = byteVector1.putByteArray(byteArray10, 10, 1);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteVector3);
        org.junit.Assert.assertNotNull(byteVector5);
        org.junit.Assert.assertNotNull(byteVector7);
        org.junit.Assert.assertNotNull(byteArray10);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray10), "[10, 1]");
    }

    @Test
    public void test0151() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0151");
        org.mockito.asm.ByteVector byteVector0 = new org.mockito.asm.ByteVector();
        org.mockito.asm.ByteVector byteVector2 = byteVector0.putUTF8("hi!");
        org.mockito.asm.ByteVector byteVector4 = byteVector0.putLong((long) ' ');
        org.mockito.asm.ByteVector byteVector6 = byteVector4.putByte((int) 'a');
        org.mockito.asm.ByteVector byteVector8 = byteVector4.putByte((int) (short) -1);
        org.mockito.asm.ByteVector byteVector10 = byteVector4.putLong(0L);
        org.mockito.asm.ByteVector byteVector12 = byteVector4.putUTF8("hi!");
        org.mockito.asm.ByteVector byteVector14 = byteVector12.putUTF8("");
        org.mockito.asm.ByteVector byteVector16 = byteVector12.putInt((int) (byte) 10);
        org.mockito.asm.ByteVector byteVector18 = byteVector16.putLong((long) (short) -1);
        org.mockito.asm.ByteVector byteVector20 = byteVector16.putInt(10);
        org.mockito.asm.ByteVector byteVector22 = byteVector20.putByte((int) (byte) 10);
        org.junit.Assert.assertNotNull(byteVector2);
        org.junit.Assert.assertNotNull(byteVector4);
        org.junit.Assert.assertNotNull(byteVector6);
        org.junit.Assert.assertNotNull(byteVector8);
        org.junit.Assert.assertNotNull(byteVector10);
        org.junit.Assert.assertNotNull(byteVector12);
        org.junit.Assert.assertNotNull(byteVector14);
        org.junit.Assert.assertNotNull(byteVector16);
        org.junit.Assert.assertNotNull(byteVector18);
        org.junit.Assert.assertNotNull(byteVector20);
        org.junit.Assert.assertNotNull(byteVector22);
    }

    @Test
    public void test0152() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0152");
        org.mockito.asm.ByteVector byteVector0 = new org.mockito.asm.ByteVector();
        org.mockito.asm.ByteVector byteVector2 = byteVector0.putUTF8("hi!");
        org.mockito.asm.ByteVector byteVector4 = byteVector0.putShort((int) (short) -1);
        org.mockito.asm.ByteVector byteVector6 = byteVector0.putInt((int) (byte) 10);
        org.mockito.asm.ByteVector byteVector8 = byteVector6.putUTF8("hi!");
        org.mockito.asm.ByteVector byteVector10 = byteVector6.putByte(10);
        org.junit.Assert.assertNotNull(byteVector2);
        org.junit.Assert.assertNotNull(byteVector4);
        org.junit.Assert.assertNotNull(byteVector6);
        org.junit.Assert.assertNotNull(byteVector8);
        org.junit.Assert.assertNotNull(byteVector10);
    }

    @Test
    public void test0153() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0153");
        org.mockito.asm.ByteVector byteVector0 = new org.mockito.asm.ByteVector();
        org.mockito.asm.ByteVector byteVector2 = byteVector0.putUTF8("hi!");
        org.mockito.asm.ByteVector byteVector4 = byteVector0.putLong((long) (short) 1);
        org.mockito.asm.ByteVector byteVector6 = new org.mockito.asm.ByteVector((int) (short) 0);
        org.mockito.asm.ByteVector byteVector7 = new org.mockito.asm.ByteVector();
        org.mockito.asm.ByteVector byteVector9 = byteVector7.putUTF8("hi!");
        org.mockito.asm.ByteVector byteVector11 = byteVector7.putInt(0);
        org.mockito.asm.ByteVector byteVector13 = byteVector11.putInt((int) ' ');
        org.mockito.asm.ByteVector byteVector15 = byteVector13.putLong(100L);
        byte[] byteArray19 = new byte[] { (byte) 0, (byte) 10, (byte) 1 };
        org.mockito.asm.ByteVector byteVector22 = byteVector13.putByteArray(byteArray19, 0, 0);
        org.mockito.asm.ByteVector byteVector25 = byteVector6.putByteArray(byteArray19, 1, (int) (short) 0);
        // The following exception was thrown during execution in test generation
        try {
            org.mockito.asm.ByteVector byteVector28 = byteVector4.putByteArray(byteArray19, (-1), (int) ' ');
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteVector2);
        org.junit.Assert.assertNotNull(byteVector4);
        org.junit.Assert.assertNotNull(byteVector9);
        org.junit.Assert.assertNotNull(byteVector11);
        org.junit.Assert.assertNotNull(byteVector13);
        org.junit.Assert.assertNotNull(byteVector15);
        org.junit.Assert.assertNotNull(byteArray19);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray19), "[0, 10, 1]");
        org.junit.Assert.assertNotNull(byteVector22);
        org.junit.Assert.assertNotNull(byteVector25);
    }

    @Test
    public void test0154() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0154");
        org.mockito.asm.ByteVector byteVector0 = new org.mockito.asm.ByteVector();
        org.mockito.asm.ByteVector byteVector2 = byteVector0.putUTF8("hi!");
        org.mockito.asm.ByteVector byteVector4 = byteVector0.putLong((long) ' ');
        org.mockito.asm.ByteVector byteVector6 = byteVector4.putByte((int) 'a');
        org.mockito.asm.ByteVector byteVector8 = byteVector4.putByte((int) (short) -1);
        org.mockito.asm.ByteVector byteVector10 = byteVector4.putLong(0L);
        org.mockito.asm.ByteVector byteVector12 = byteVector10.putByte(0);
        org.mockito.asm.ByteVector byteVector14 = byteVector12.putByte(100);
        java.lang.Class<?> wildcardClass15 = byteVector14.getClass();
        org.junit.Assert.assertNotNull(byteVector2);
        org.junit.Assert.assertNotNull(byteVector4);
        org.junit.Assert.assertNotNull(byteVector6);
        org.junit.Assert.assertNotNull(byteVector8);
        org.junit.Assert.assertNotNull(byteVector10);
        org.junit.Assert.assertNotNull(byteVector12);
        org.junit.Assert.assertNotNull(byteVector14);
        org.junit.Assert.assertNotNull(wildcardClass15);
    }

    @Test
    public void test0155() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0155");
        org.mockito.asm.ByteVector byteVector0 = new org.mockito.asm.ByteVector();
        org.mockito.asm.ByteVector byteVector2 = byteVector0.putUTF8("hi!");
        org.mockito.asm.ByteVector byteVector4 = byteVector0.putInt(0);
        org.mockito.asm.ByteVector byteVector6 = byteVector0.putShort((int) '4');
        org.mockito.asm.ByteVector byteVector8 = byteVector0.putByte(100);
        org.mockito.asm.ByteVector byteVector10 = byteVector8.putInt((int) (byte) 10);
        org.mockito.asm.ByteVector byteVector12 = byteVector8.putInt((int) (byte) 10);
        java.lang.Class<?> wildcardClass13 = byteVector8.getClass();
        org.junit.Assert.assertNotNull(byteVector2);
        org.junit.Assert.assertNotNull(byteVector4);
        org.junit.Assert.assertNotNull(byteVector6);
        org.junit.Assert.assertNotNull(byteVector8);
        org.junit.Assert.assertNotNull(byteVector10);
        org.junit.Assert.assertNotNull(byteVector12);
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test0156() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0156");
        org.mockito.asm.ByteVector byteVector0 = new org.mockito.asm.ByteVector();
        org.mockito.asm.ByteVector byteVector2 = byteVector0.putUTF8("hi!");
        org.mockito.asm.ByteVector byteVector4 = byteVector2.putInt(0);
        org.mockito.asm.ByteVector byteVector6 = byteVector2.putByte((int) (byte) 10);
        org.mockito.asm.ByteVector byteVector8 = byteVector6.putUTF8("hi!");
        org.mockito.asm.ByteVector byteVector10 = byteVector8.putUTF8("hi!");
        org.mockito.asm.ByteVector byteVector12 = byteVector8.putUTF8("hi!");
        java.lang.Class<?> wildcardClass13 = byteVector12.getClass();
        org.junit.Assert.assertNotNull(byteVector2);
        org.junit.Assert.assertNotNull(byteVector4);
        org.junit.Assert.assertNotNull(byteVector6);
        org.junit.Assert.assertNotNull(byteVector8);
        org.junit.Assert.assertNotNull(byteVector10);
        org.junit.Assert.assertNotNull(byteVector12);
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test0157() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0157");
        org.mockito.asm.ByteVector byteVector0 = new org.mockito.asm.ByteVector();
        org.mockito.asm.ByteVector byteVector2 = byteVector0.putUTF8("hi!");
        org.mockito.asm.ByteVector byteVector4 = byteVector2.putInt((int) (byte) 10);
        org.mockito.asm.ByteVector byteVector6 = byteVector4.putByte((int) (short) 100);
        org.mockito.asm.ByteVector byteVector8 = byteVector4.putInt((int) '4');
        org.mockito.asm.ByteVector byteVector9 = new org.mockito.asm.ByteVector();
        org.mockito.asm.ByteVector byteVector11 = byteVector9.putUTF8("hi!");
        org.mockito.asm.ByteVector byteVector13 = byteVector9.putInt(0);
        org.mockito.asm.ByteVector byteVector15 = byteVector13.putInt((int) ' ');
        org.mockito.asm.ByteVector byteVector17 = byteVector15.putLong(100L);
        byte[] byteArray21 = new byte[] { (byte) 0, (byte) 10, (byte) 1 };
        org.mockito.asm.ByteVector byteVector24 = byteVector15.putByteArray(byteArray21, 0, 0);
        // The following exception was thrown during execution in test generation
        try {
            org.mockito.asm.ByteVector byteVector27 = byteVector8.putByteArray(byteArray21, (int) (short) -1, (int) (byte) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteVector2);
        org.junit.Assert.assertNotNull(byteVector4);
        org.junit.Assert.assertNotNull(byteVector6);
        org.junit.Assert.assertNotNull(byteVector8);
        org.junit.Assert.assertNotNull(byteVector11);
        org.junit.Assert.assertNotNull(byteVector13);
        org.junit.Assert.assertNotNull(byteVector15);
        org.junit.Assert.assertNotNull(byteVector17);
        org.junit.Assert.assertNotNull(byteArray21);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray21), "[0, 10, 1]");
        org.junit.Assert.assertNotNull(byteVector24);
    }

    @Test
    public void test0158() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0158");
        org.mockito.asm.ByteVector byteVector0 = new org.mockito.asm.ByteVector();
        org.mockito.asm.ByteVector byteVector2 = byteVector0.putUTF8("hi!");
        org.mockito.asm.ByteVector byteVector4 = byteVector0.putInt(0);
        org.mockito.asm.ByteVector byteVector6 = byteVector0.putShort(10);
        org.mockito.asm.ByteVector byteVector8 = byteVector6.putLong((long) '4');
        org.mockito.asm.ByteVector byteVector9 = new org.mockito.asm.ByteVector();
        org.mockito.asm.ByteVector byteVector11 = byteVector9.putUTF8("hi!");
        org.mockito.asm.ByteVector byteVector13 = byteVector11.putByte(100);
        org.mockito.asm.ByteVector byteVector15 = byteVector11.putShort((int) 'a');
        org.mockito.asm.ByteVector byteVector17 = byteVector15.putShort((int) (short) 0);
        org.mockito.asm.ByteVector byteVector18 = new org.mockito.asm.ByteVector();
        org.mockito.asm.ByteVector byteVector20 = byteVector18.putUTF8("hi!");
        org.mockito.asm.ByteVector byteVector22 = byteVector20.putInt(0);
        org.mockito.asm.ByteVector byteVector24 = byteVector20.putByte((int) (byte) 10);
        org.mockito.asm.ByteVector byteVector26 = byteVector24.putLong((-1L));
        org.mockito.asm.ByteVector byteVector28 = byteVector24.putInt((int) (byte) 100);
        org.mockito.asm.ByteVector byteVector29 = new org.mockito.asm.ByteVector();
        org.mockito.asm.ByteVector byteVector31 = byteVector29.putUTF8("hi!");
        org.mockito.asm.ByteVector byteVector33 = byteVector29.putInt(0);
        org.mockito.asm.ByteVector byteVector35 = byteVector33.putInt((int) ' ');
        org.mockito.asm.ByteVector byteVector37 = byteVector35.putLong(100L);
        byte[] byteArray41 = new byte[] { (byte) 0, (byte) 10, (byte) 1 };
        org.mockito.asm.ByteVector byteVector44 = byteVector35.putByteArray(byteArray41, 0, 0);
        org.mockito.asm.ByteVector byteVector47 = byteVector24.putByteArray(byteArray41, (int) (byte) 1, 0);
        org.mockito.asm.ByteVector byteVector50 = byteVector15.putByteArray(byteArray41, (int) (byte) 1, (int) (short) 1);
        // The following exception was thrown during execution in test generation
        try {
            org.mockito.asm.ByteVector byteVector53 = byteVector8.putByteArray(byteArray41, (int) (short) 100, (int) (byte) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteVector2);
        org.junit.Assert.assertNotNull(byteVector4);
        org.junit.Assert.assertNotNull(byteVector6);
        org.junit.Assert.assertNotNull(byteVector8);
        org.junit.Assert.assertNotNull(byteVector11);
        org.junit.Assert.assertNotNull(byteVector13);
        org.junit.Assert.assertNotNull(byteVector15);
        org.junit.Assert.assertNotNull(byteVector17);
        org.junit.Assert.assertNotNull(byteVector20);
        org.junit.Assert.assertNotNull(byteVector22);
        org.junit.Assert.assertNotNull(byteVector24);
        org.junit.Assert.assertNotNull(byteVector26);
        org.junit.Assert.assertNotNull(byteVector28);
        org.junit.Assert.assertNotNull(byteVector31);
        org.junit.Assert.assertNotNull(byteVector33);
        org.junit.Assert.assertNotNull(byteVector35);
        org.junit.Assert.assertNotNull(byteVector37);
        org.junit.Assert.assertNotNull(byteArray41);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray41), "[0, 10, 1]");
        org.junit.Assert.assertNotNull(byteVector44);
        org.junit.Assert.assertNotNull(byteVector47);
        org.junit.Assert.assertNotNull(byteVector50);
    }

    @Test
    public void test0159() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0159");
        org.mockito.asm.ByteVector byteVector0 = new org.mockito.asm.ByteVector();
        org.mockito.asm.ByteVector byteVector2 = byteVector0.putUTF8("hi!");
        org.mockito.asm.ByteVector byteVector4 = byteVector0.putLong((long) ' ');
        org.mockito.asm.ByteVector byteVector6 = byteVector4.putByte((int) 'a');
        org.mockito.asm.ByteVector byteVector8 = byteVector4.putByte((int) (short) -1);
        org.mockito.asm.ByteVector byteVector10 = byteVector4.putLong(0L);
        org.mockito.asm.ByteVector byteVector12 = byteVector4.putUTF8("hi!");
        org.mockito.asm.ByteVector byteVector14 = byteVector12.putUTF8("");
        org.mockito.asm.ByteVector byteVector16 = byteVector12.putInt((int) (byte) 10);
        org.mockito.asm.ByteVector byteVector18 = byteVector16.putLong((long) (short) -1);
        org.mockito.asm.ByteVector byteVector20 = byteVector18.putLong((long) 1);
        java.lang.Class<?> wildcardClass21 = byteVector18.getClass();
        org.junit.Assert.assertNotNull(byteVector2);
        org.junit.Assert.assertNotNull(byteVector4);
        org.junit.Assert.assertNotNull(byteVector6);
        org.junit.Assert.assertNotNull(byteVector8);
        org.junit.Assert.assertNotNull(byteVector10);
        org.junit.Assert.assertNotNull(byteVector12);
        org.junit.Assert.assertNotNull(byteVector14);
        org.junit.Assert.assertNotNull(byteVector16);
        org.junit.Assert.assertNotNull(byteVector18);
        org.junit.Assert.assertNotNull(byteVector20);
        org.junit.Assert.assertNotNull(wildcardClass21);
    }

    @Test
    public void test0160() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0160");
        org.mockito.asm.ByteVector byteVector0 = new org.mockito.asm.ByteVector();
        org.mockito.asm.ByteVector byteVector2 = byteVector0.putUTF8("hi!");
        org.mockito.asm.ByteVector byteVector4 = byteVector0.putInt(0);
        org.mockito.asm.ByteVector byteVector6 = byteVector0.putShort((int) '4');
        org.mockito.asm.ByteVector byteVector8 = byteVector0.putByte(100);
        org.mockito.asm.ByteVector byteVector10 = byteVector8.putInt((int) (byte) 10);
        org.mockito.asm.ByteVector byteVector12 = byteVector10.putByte((int) (byte) 1);
        org.mockito.asm.ByteVector byteVector14 = byteVector10.putUTF8("hi!");
        java.lang.Class<?> wildcardClass15 = byteVector14.getClass();
        org.junit.Assert.assertNotNull(byteVector2);
        org.junit.Assert.assertNotNull(byteVector4);
        org.junit.Assert.assertNotNull(byteVector6);
        org.junit.Assert.assertNotNull(byteVector8);
        org.junit.Assert.assertNotNull(byteVector10);
        org.junit.Assert.assertNotNull(byteVector12);
        org.junit.Assert.assertNotNull(byteVector14);
        org.junit.Assert.assertNotNull(wildcardClass15);
    }

    @Test
    public void test0161() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0161");
        org.mockito.asm.ByteVector byteVector0 = new org.mockito.asm.ByteVector();
        org.mockito.asm.ByteVector byteVector2 = byteVector0.putUTF8("hi!");
        org.mockito.asm.ByteVector byteVector4 = byteVector0.putShort((int) (short) -1);
        org.mockito.asm.ByteVector byteVector6 = byteVector0.putByte((int) ' ');
        org.mockito.asm.ByteVector byteVector7 = new org.mockito.asm.ByteVector();
        org.mockito.asm.ByteVector byteVector9 = byteVector7.putUTF8("hi!");
        org.mockito.asm.ByteVector byteVector11 = byteVector9.putInt(0);
        org.mockito.asm.ByteVector byteVector13 = byteVector9.putByte((int) (byte) 10);
        org.mockito.asm.ByteVector byteVector15 = byteVector13.putLong((-1L));
        org.mockito.asm.ByteVector byteVector17 = byteVector13.putInt((int) (byte) 100);
        org.mockito.asm.ByteVector byteVector18 = new org.mockito.asm.ByteVector();
        org.mockito.asm.ByteVector byteVector20 = byteVector18.putUTF8("hi!");
        org.mockito.asm.ByteVector byteVector22 = byteVector18.putInt(0);
        org.mockito.asm.ByteVector byteVector24 = byteVector22.putInt((int) ' ');
        org.mockito.asm.ByteVector byteVector26 = byteVector24.putLong(100L);
        byte[] byteArray30 = new byte[] { (byte) 0, (byte) 10, (byte) 1 };
        org.mockito.asm.ByteVector byteVector33 = byteVector24.putByteArray(byteArray30, 0, 0);
        org.mockito.asm.ByteVector byteVector36 = byteVector13.putByteArray(byteArray30, (int) (byte) 1, 0);
        // The following exception was thrown during execution in test generation
        try {
            org.mockito.asm.ByteVector byteVector39 = byteVector6.putByteArray(byteArray30, (int) (short) 1, (int) ' ');
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteVector2);
        org.junit.Assert.assertNotNull(byteVector4);
        org.junit.Assert.assertNotNull(byteVector6);
        org.junit.Assert.assertNotNull(byteVector9);
        org.junit.Assert.assertNotNull(byteVector11);
        org.junit.Assert.assertNotNull(byteVector13);
        org.junit.Assert.assertNotNull(byteVector15);
        org.junit.Assert.assertNotNull(byteVector17);
        org.junit.Assert.assertNotNull(byteVector20);
        org.junit.Assert.assertNotNull(byteVector22);
        org.junit.Assert.assertNotNull(byteVector24);
        org.junit.Assert.assertNotNull(byteVector26);
        org.junit.Assert.assertNotNull(byteArray30);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray30), "[0, 10, 1]");
        org.junit.Assert.assertNotNull(byteVector33);
        org.junit.Assert.assertNotNull(byteVector36);
    }

    @Test
    public void test0162() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0162");
        org.mockito.asm.ByteVector byteVector1 = new org.mockito.asm.ByteVector((int) (byte) 10);
        org.mockito.asm.ByteVector byteVector3 = byteVector1.putByte((int) '4');
        org.mockito.asm.ByteVector byteVector5 = byteVector1.putLong((long) 'a');
        org.mockito.asm.ByteVector byteVector6 = new org.mockito.asm.ByteVector();
        org.mockito.asm.ByteVector byteVector8 = byteVector6.putUTF8("hi!");
        org.mockito.asm.ByteVector byteVector10 = byteVector6.putLong((long) ' ');
        org.mockito.asm.ByteVector byteVector12 = byteVector10.putByte((int) 'a');
        org.mockito.asm.ByteVector byteVector14 = byteVector10.putByte((int) (short) -1);
        org.mockito.asm.ByteVector byteVector16 = byteVector10.putLong(0L);
        org.mockito.asm.ByteVector byteVector18 = byteVector10.putUTF8("hi!");
        org.mockito.asm.ByteVector byteVector20 = byteVector18.putUTF8("");
        org.mockito.asm.ByteVector byteVector22 = byteVector18.putInt((int) (byte) 10);
        org.mockito.asm.ByteVector byteVector24 = byteVector18.putByte(0);
        org.mockito.asm.ByteVector byteVector25 = new org.mockito.asm.ByteVector();
        org.mockito.asm.ByteVector byteVector27 = byteVector25.putUTF8("hi!");
        org.mockito.asm.ByteVector byteVector29 = byteVector25.putInt(0);
        org.mockito.asm.ByteVector byteVector31 = byteVector29.putInt((int) ' ');
        org.mockito.asm.ByteVector byteVector33 = byteVector31.putLong(100L);
        byte[] byteArray37 = new byte[] { (byte) 0, (byte) 10, (byte) 1 };
        org.mockito.asm.ByteVector byteVector40 = byteVector31.putByteArray(byteArray37, 0, 0);
        org.mockito.asm.ByteVector byteVector43 = byteVector24.putByteArray(byteArray37, (int) (short) 1, 0);
        org.mockito.asm.ByteVector byteVector46 = byteVector5.putByteArray(byteArray37, 0, 0);
        java.lang.Class<?> wildcardClass47 = byteVector5.getClass();
        org.junit.Assert.assertNotNull(byteVector3);
        org.junit.Assert.assertNotNull(byteVector5);
        org.junit.Assert.assertNotNull(byteVector8);
        org.junit.Assert.assertNotNull(byteVector10);
        org.junit.Assert.assertNotNull(byteVector12);
        org.junit.Assert.assertNotNull(byteVector14);
        org.junit.Assert.assertNotNull(byteVector16);
        org.junit.Assert.assertNotNull(byteVector18);
        org.junit.Assert.assertNotNull(byteVector20);
        org.junit.Assert.assertNotNull(byteVector22);
        org.junit.Assert.assertNotNull(byteVector24);
        org.junit.Assert.assertNotNull(byteVector27);
        org.junit.Assert.assertNotNull(byteVector29);
        org.junit.Assert.assertNotNull(byteVector31);
        org.junit.Assert.assertNotNull(byteVector33);
        org.junit.Assert.assertNotNull(byteArray37);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray37), "[0, 10, 1]");
        org.junit.Assert.assertNotNull(byteVector40);
        org.junit.Assert.assertNotNull(byteVector43);
        org.junit.Assert.assertNotNull(byteVector46);
        org.junit.Assert.assertNotNull(wildcardClass47);
    }

    @Test
    public void test0163() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0163");
        org.mockito.asm.ByteVector byteVector1 = new org.mockito.asm.ByteVector((int) '#');
        org.mockito.asm.ByteVector byteVector3 = byteVector1.putLong(100L);
        org.mockito.asm.ByteVector byteVector5 = byteVector3.putUTF8("");
        org.mockito.asm.ByteVector byteVector7 = byteVector3.putShort((int) (short) -1);
        org.mockito.asm.ByteVector byteVector9 = byteVector7.putUTF8("");
        org.junit.Assert.assertNotNull(byteVector3);
        org.junit.Assert.assertNotNull(byteVector5);
        org.junit.Assert.assertNotNull(byteVector7);
        org.junit.Assert.assertNotNull(byteVector9);
    }

    @Test
    public void test0164() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0164");
        org.mockito.asm.ByteVector byteVector1 = new org.mockito.asm.ByteVector((int) '#');
        org.mockito.asm.ByteVector byteVector3 = byteVector1.putLong(100L);
        org.mockito.asm.ByteVector byteVector5 = byteVector3.putLong(1L);
        org.mockito.asm.ByteVector byteVector7 = byteVector5.putUTF8("hi!");
        org.mockito.asm.ByteVector byteVector9 = byteVector5.putUTF8("hi!");
        org.mockito.asm.ByteVector byteVector10 = new org.mockito.asm.ByteVector();
        org.mockito.asm.ByteVector byteVector12 = byteVector10.putUTF8("hi!");
        org.mockito.asm.ByteVector byteVector14 = byteVector10.putLong((long) ' ');
        org.mockito.asm.ByteVector byteVector16 = byteVector14.putByte((int) 'a');
        org.mockito.asm.ByteVector byteVector18 = byteVector14.putByte((int) (short) -1);
        org.mockito.asm.ByteVector byteVector20 = byteVector14.putLong(0L);
        org.mockito.asm.ByteVector byteVector22 = byteVector14.putUTF8("hi!");
        org.mockito.asm.ByteVector byteVector24 = byteVector22.putUTF8("");
        org.mockito.asm.ByteVector byteVector26 = byteVector22.putInt((int) (byte) 10);
        org.mockito.asm.ByteVector byteVector28 = byteVector22.putByte(0);
        org.mockito.asm.ByteVector byteVector29 = new org.mockito.asm.ByteVector();
        org.mockito.asm.ByteVector byteVector31 = byteVector29.putUTF8("hi!");
        org.mockito.asm.ByteVector byteVector33 = byteVector29.putInt(0);
        org.mockito.asm.ByteVector byteVector35 = byteVector33.putInt((int) ' ');
        org.mockito.asm.ByteVector byteVector37 = byteVector35.putLong(100L);
        byte[] byteArray41 = new byte[] { (byte) 0, (byte) 10, (byte) 1 };
        org.mockito.asm.ByteVector byteVector44 = byteVector35.putByteArray(byteArray41, 0, 0);
        org.mockito.asm.ByteVector byteVector47 = byteVector28.putByteArray(byteArray41, (int) (short) 1, 0);
        // The following exception was thrown during execution in test generation
        try {
            org.mockito.asm.ByteVector byteVector50 = byteVector5.putByteArray(byteArray41, (int) 'a', 100);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteVector3);
        org.junit.Assert.assertNotNull(byteVector5);
        org.junit.Assert.assertNotNull(byteVector7);
        org.junit.Assert.assertNotNull(byteVector9);
        org.junit.Assert.assertNotNull(byteVector12);
        org.junit.Assert.assertNotNull(byteVector14);
        org.junit.Assert.assertNotNull(byteVector16);
        org.junit.Assert.assertNotNull(byteVector18);
        org.junit.Assert.assertNotNull(byteVector20);
        org.junit.Assert.assertNotNull(byteVector22);
        org.junit.Assert.assertNotNull(byteVector24);
        org.junit.Assert.assertNotNull(byteVector26);
        org.junit.Assert.assertNotNull(byteVector28);
        org.junit.Assert.assertNotNull(byteVector31);
        org.junit.Assert.assertNotNull(byteVector33);
        org.junit.Assert.assertNotNull(byteVector35);
        org.junit.Assert.assertNotNull(byteVector37);
        org.junit.Assert.assertNotNull(byteArray41);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray41), "[0, 10, 1]");
        org.junit.Assert.assertNotNull(byteVector44);
        org.junit.Assert.assertNotNull(byteVector47);
    }

    @Test
    public void test0165() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0165");
        org.mockito.asm.ByteVector byteVector1 = new org.mockito.asm.ByteVector((int) (byte) 1);
        org.mockito.asm.ByteVector byteVector3 = byteVector1.putByte((int) (byte) 10);
        org.mockito.asm.ByteVector byteVector5 = byteVector3.putShort((int) (short) 10);
        org.mockito.asm.ByteVector byteVector6 = new org.mockito.asm.ByteVector();
        org.mockito.asm.ByteVector byteVector8 = byteVector6.putUTF8("hi!");
        org.mockito.asm.ByteVector byteVector10 = byteVector6.putInt(0);
        org.mockito.asm.ByteVector byteVector12 = byteVector10.putInt((int) ' ');
        org.mockito.asm.ByteVector byteVector14 = byteVector12.putLong(100L);
        byte[] byteArray18 = new byte[] { (byte) 0, (byte) 10, (byte) 1 };
        org.mockito.asm.ByteVector byteVector21 = byteVector12.putByteArray(byteArray18, 0, 0);
        // The following exception was thrown during execution in test generation
        try {
            org.mockito.asm.ByteVector byteVector24 = byteVector5.putByteArray(byteArray18, (int) (byte) 100, 1);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteVector3);
        org.junit.Assert.assertNotNull(byteVector5);
        org.junit.Assert.assertNotNull(byteVector8);
        org.junit.Assert.assertNotNull(byteVector10);
        org.junit.Assert.assertNotNull(byteVector12);
        org.junit.Assert.assertNotNull(byteVector14);
        org.junit.Assert.assertNotNull(byteArray18);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray18), "[0, 10, 1]");
        org.junit.Assert.assertNotNull(byteVector21);
    }

    @Test
    public void test0166() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0166");
        org.mockito.asm.ByteVector byteVector0 = new org.mockito.asm.ByteVector();
        org.mockito.asm.ByteVector byteVector2 = byteVector0.putUTF8("hi!");
        org.mockito.asm.ByteVector byteVector4 = byteVector0.putLong((long) ' ');
        org.mockito.asm.ByteVector byteVector6 = byteVector4.putByte((int) 'a');
        org.mockito.asm.ByteVector byteVector8 = byteVector6.putByte((int) (short) -1);
        org.mockito.asm.ByteVector byteVector10 = byteVector8.putLong((long) (byte) -1);
        org.mockito.asm.ByteVector byteVector12 = byteVector8.putByte((int) '4');
        org.mockito.asm.ByteVector byteVector14 = new org.mockito.asm.ByteVector((int) (short) 0);
        org.mockito.asm.ByteVector byteVector15 = new org.mockito.asm.ByteVector();
        org.mockito.asm.ByteVector byteVector17 = byteVector15.putUTF8("hi!");
        org.mockito.asm.ByteVector byteVector19 = byteVector15.putInt(0);
        org.mockito.asm.ByteVector byteVector21 = byteVector19.putInt((int) ' ');
        org.mockito.asm.ByteVector byteVector23 = byteVector21.putLong(100L);
        byte[] byteArray27 = new byte[] { (byte) 0, (byte) 10, (byte) 1 };
        org.mockito.asm.ByteVector byteVector30 = byteVector21.putByteArray(byteArray27, 0, 0);
        org.mockito.asm.ByteVector byteVector33 = byteVector14.putByteArray(byteArray27, 1, (int) (short) 0);
        // The following exception was thrown during execution in test generation
        try {
            org.mockito.asm.ByteVector byteVector36 = byteVector12.putByteArray(byteArray27, (-1), (int) (byte) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteVector2);
        org.junit.Assert.assertNotNull(byteVector4);
        org.junit.Assert.assertNotNull(byteVector6);
        org.junit.Assert.assertNotNull(byteVector8);
        org.junit.Assert.assertNotNull(byteVector10);
        org.junit.Assert.assertNotNull(byteVector12);
        org.junit.Assert.assertNotNull(byteVector17);
        org.junit.Assert.assertNotNull(byteVector19);
        org.junit.Assert.assertNotNull(byteVector21);
        org.junit.Assert.assertNotNull(byteVector23);
        org.junit.Assert.assertNotNull(byteArray27);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray27), "[0, 10, 1]");
        org.junit.Assert.assertNotNull(byteVector30);
        org.junit.Assert.assertNotNull(byteVector33);
    }

    @Test
    public void test0167() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0167");
        org.mockito.asm.ByteVector byteVector0 = new org.mockito.asm.ByteVector();
        org.mockito.asm.ByteVector byteVector2 = byteVector0.putUTF8("hi!");
        org.mockito.asm.ByteVector byteVector4 = byteVector0.putLong((long) ' ');
        org.mockito.asm.ByteVector byteVector6 = byteVector4.putByte((int) 'a');
        org.mockito.asm.ByteVector byteVector8 = byteVector4.putByte((int) (short) -1);
        org.mockito.asm.ByteVector byteVector10 = byteVector4.putLong(0L);
        org.mockito.asm.ByteVector byteVector12 = byteVector10.putByte(0);
        org.mockito.asm.ByteVector byteVector14 = byteVector12.putInt((int) (short) 0);
        org.mockito.asm.ByteVector byteVector15 = new org.mockito.asm.ByteVector();
        org.mockito.asm.ByteVector byteVector17 = byteVector15.putUTF8("hi!");
        org.mockito.asm.ByteVector byteVector19 = byteVector15.putLong((long) ' ');
        org.mockito.asm.ByteVector byteVector21 = byteVector19.putByte((int) 'a');
        org.mockito.asm.ByteVector byteVector23 = byteVector19.putByte((int) (short) -1);
        org.mockito.asm.ByteVector byteVector25 = byteVector19.putLong(0L);
        org.mockito.asm.ByteVector byteVector27 = byteVector19.putUTF8("hi!");
        org.mockito.asm.ByteVector byteVector29 = byteVector27.putUTF8("");
        org.mockito.asm.ByteVector byteVector31 = byteVector29.putLong((long) (byte) 10);
        org.mockito.asm.ByteVector byteVector33 = byteVector29.putLong((long) (short) 100);
        byte[] byteArray38 = new byte[] { (byte) 1, (byte) 0, (byte) 0, (byte) -1 };
        org.mockito.asm.ByteVector byteVector41 = byteVector29.putByteArray(byteArray38, 0, 0);
        // The following exception was thrown during execution in test generation
        try {
            org.mockito.asm.ByteVector byteVector44 = byteVector14.putByteArray(byteArray38, (int) (short) -1, 10);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteVector2);
        org.junit.Assert.assertNotNull(byteVector4);
        org.junit.Assert.assertNotNull(byteVector6);
        org.junit.Assert.assertNotNull(byteVector8);
        org.junit.Assert.assertNotNull(byteVector10);
        org.junit.Assert.assertNotNull(byteVector12);
        org.junit.Assert.assertNotNull(byteVector14);
        org.junit.Assert.assertNotNull(byteVector17);
        org.junit.Assert.assertNotNull(byteVector19);
        org.junit.Assert.assertNotNull(byteVector21);
        org.junit.Assert.assertNotNull(byteVector23);
        org.junit.Assert.assertNotNull(byteVector25);
        org.junit.Assert.assertNotNull(byteVector27);
        org.junit.Assert.assertNotNull(byteVector29);
        org.junit.Assert.assertNotNull(byteVector31);
        org.junit.Assert.assertNotNull(byteVector33);
        org.junit.Assert.assertNotNull(byteArray38);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray38), "[1, 0, 0, -1]");
        org.junit.Assert.assertNotNull(byteVector41);
    }

    @Test
    public void test0168() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0168");
        org.mockito.asm.ByteVector byteVector0 = new org.mockito.asm.ByteVector();
        org.mockito.asm.ByteVector byteVector2 = byteVector0.putUTF8("hi!");
        org.mockito.asm.ByteVector byteVector4 = byteVector2.putInt((int) (byte) 10);
        org.mockito.asm.ByteVector byteVector6 = byteVector4.putUTF8("");
        org.mockito.asm.ByteVector byteVector8 = byteVector6.putUTF8("hi!");
        org.mockito.asm.ByteVector byteVector10 = byteVector6.putInt((int) '#');
        org.mockito.asm.ByteVector byteVector12 = byteVector10.putInt((int) (short) 0);
        org.mockito.asm.ByteVector byteVector14 = new org.mockito.asm.ByteVector((int) (byte) 10);
        org.mockito.asm.ByteVector byteVector16 = byteVector14.putByte((int) '4');
        org.mockito.asm.ByteVector byteVector18 = byteVector14.putLong((long) 'a');
        org.mockito.asm.ByteVector byteVector19 = new org.mockito.asm.ByteVector();
        org.mockito.asm.ByteVector byteVector21 = byteVector19.putUTF8("hi!");
        org.mockito.asm.ByteVector byteVector23 = byteVector19.putLong((long) ' ');
        org.mockito.asm.ByteVector byteVector25 = byteVector23.putByte((int) 'a');
        org.mockito.asm.ByteVector byteVector27 = byteVector23.putByte((int) (short) -1);
        org.mockito.asm.ByteVector byteVector29 = byteVector23.putLong(0L);
        org.mockito.asm.ByteVector byteVector31 = byteVector23.putUTF8("hi!");
        org.mockito.asm.ByteVector byteVector33 = byteVector31.putUTF8("");
        org.mockito.asm.ByteVector byteVector35 = byteVector31.putInt((int) (byte) 10);
        org.mockito.asm.ByteVector byteVector37 = byteVector31.putByte(0);
        org.mockito.asm.ByteVector byteVector38 = new org.mockito.asm.ByteVector();
        org.mockito.asm.ByteVector byteVector40 = byteVector38.putUTF8("hi!");
        org.mockito.asm.ByteVector byteVector42 = byteVector38.putInt(0);
        org.mockito.asm.ByteVector byteVector44 = byteVector42.putInt((int) ' ');
        org.mockito.asm.ByteVector byteVector46 = byteVector44.putLong(100L);
        byte[] byteArray50 = new byte[] { (byte) 0, (byte) 10, (byte) 1 };
        org.mockito.asm.ByteVector byteVector53 = byteVector44.putByteArray(byteArray50, 0, 0);
        org.mockito.asm.ByteVector byteVector56 = byteVector37.putByteArray(byteArray50, (int) (short) 1, 0);
        org.mockito.asm.ByteVector byteVector59 = byteVector18.putByteArray(byteArray50, 0, 0);
        // The following exception was thrown during execution in test generation
        try {
            org.mockito.asm.ByteVector byteVector62 = byteVector10.putByteArray(byteArray50, (int) (byte) 10, (int) (byte) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteVector2);
        org.junit.Assert.assertNotNull(byteVector4);
        org.junit.Assert.assertNotNull(byteVector6);
        org.junit.Assert.assertNotNull(byteVector8);
        org.junit.Assert.assertNotNull(byteVector10);
        org.junit.Assert.assertNotNull(byteVector12);
        org.junit.Assert.assertNotNull(byteVector16);
        org.junit.Assert.assertNotNull(byteVector18);
        org.junit.Assert.assertNotNull(byteVector21);
        org.junit.Assert.assertNotNull(byteVector23);
        org.junit.Assert.assertNotNull(byteVector25);
        org.junit.Assert.assertNotNull(byteVector27);
        org.junit.Assert.assertNotNull(byteVector29);
        org.junit.Assert.assertNotNull(byteVector31);
        org.junit.Assert.assertNotNull(byteVector33);
        org.junit.Assert.assertNotNull(byteVector35);
        org.junit.Assert.assertNotNull(byteVector37);
        org.junit.Assert.assertNotNull(byteVector40);
        org.junit.Assert.assertNotNull(byteVector42);
        org.junit.Assert.assertNotNull(byteVector44);
        org.junit.Assert.assertNotNull(byteVector46);
        org.junit.Assert.assertNotNull(byteArray50);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray50), "[0, 10, 1]");
        org.junit.Assert.assertNotNull(byteVector53);
        org.junit.Assert.assertNotNull(byteVector56);
        org.junit.Assert.assertNotNull(byteVector59);
    }

    @Test
    public void test0169() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0169");
        org.mockito.asm.ByteVector byteVector1 = new org.mockito.asm.ByteVector((int) '#');
        org.mockito.asm.ByteVector byteVector3 = byteVector1.putLong(100L);
        java.lang.Class<?> wildcardClass4 = byteVector3.getClass();
        org.junit.Assert.assertNotNull(byteVector3);
        org.junit.Assert.assertNotNull(wildcardClass4);
    }

    @Test
    public void test0170() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0170");
        org.mockito.asm.ByteVector byteVector0 = new org.mockito.asm.ByteVector();
        org.mockito.asm.ByteVector byteVector2 = byteVector0.putUTF8("hi!");
        org.mockito.asm.ByteVector byteVector4 = byteVector0.putLong((long) ' ');
        org.mockito.asm.ByteVector byteVector6 = byteVector4.putByte((int) 'a');
        org.mockito.asm.ByteVector byteVector8 = byteVector6.putInt((int) (short) 1);
        org.mockito.asm.ByteVector byteVector9 = new org.mockito.asm.ByteVector();
        org.mockito.asm.ByteVector byteVector11 = byteVector9.putUTF8("hi!");
        org.mockito.asm.ByteVector byteVector13 = byteVector9.putInt(0);
        org.mockito.asm.ByteVector byteVector15 = byteVector13.putInt((int) ' ');
        org.mockito.asm.ByteVector byteVector17 = byteVector15.putLong(100L);
        byte[] byteArray21 = new byte[] { (byte) 0, (byte) 10, (byte) 1 };
        org.mockito.asm.ByteVector byteVector24 = byteVector15.putByteArray(byteArray21, 0, 0);
        // The following exception was thrown during execution in test generation
        try {
            org.mockito.asm.ByteVector byteVector27 = byteVector6.putByteArray(byteArray21, 10, (int) (byte) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteVector2);
        org.junit.Assert.assertNotNull(byteVector4);
        org.junit.Assert.assertNotNull(byteVector6);
        org.junit.Assert.assertNotNull(byteVector8);
        org.junit.Assert.assertNotNull(byteVector11);
        org.junit.Assert.assertNotNull(byteVector13);
        org.junit.Assert.assertNotNull(byteVector15);
        org.junit.Assert.assertNotNull(byteVector17);
        org.junit.Assert.assertNotNull(byteArray21);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray21), "[0, 10, 1]");
        org.junit.Assert.assertNotNull(byteVector24);
    }

    @Test
    public void test0171() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0171");
        org.mockito.asm.ByteVector byteVector0 = new org.mockito.asm.ByteVector();
        org.mockito.asm.ByteVector byteVector2 = byteVector0.putUTF8("hi!");
        org.mockito.asm.ByteVector byteVector4 = byteVector2.putLong((long) (byte) 10);
        org.mockito.asm.ByteVector byteVector6 = byteVector4.putUTF8("hi!");
        org.mockito.asm.ByteVector byteVector8 = byteVector4.putLong(1L);
        org.mockito.asm.ByteVector byteVector10 = byteVector8.putLong(10L);
        org.junit.Assert.assertNotNull(byteVector2);
        org.junit.Assert.assertNotNull(byteVector4);
        org.junit.Assert.assertNotNull(byteVector6);
        org.junit.Assert.assertNotNull(byteVector8);
        org.junit.Assert.assertNotNull(byteVector10);
    }

    @Test
    public void test0172() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0172");
        org.mockito.asm.ByteVector byteVector0 = new org.mockito.asm.ByteVector();
        org.mockito.asm.ByteVector byteVector2 = byteVector0.putUTF8("hi!");
        org.mockito.asm.ByteVector byteVector4 = byteVector0.putShort((int) (short) -1);
        org.mockito.asm.ByteVector byteVector6 = byteVector0.putInt(0);
        org.mockito.asm.ByteVector byteVector8 = byteVector0.putUTF8("hi!");
        org.mockito.asm.ByteVector byteVector10 = byteVector0.putByte(100);
        java.lang.Class<?> wildcardClass11 = byteVector0.getClass();
        org.junit.Assert.assertNotNull(byteVector2);
        org.junit.Assert.assertNotNull(byteVector4);
        org.junit.Assert.assertNotNull(byteVector6);
        org.junit.Assert.assertNotNull(byteVector8);
        org.junit.Assert.assertNotNull(byteVector10);
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test0173() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0173");
        org.mockito.asm.ByteVector byteVector0 = new org.mockito.asm.ByteVector();
        org.mockito.asm.ByteVector byteVector2 = byteVector0.putUTF8("hi!");
        org.mockito.asm.ByteVector byteVector4 = byteVector2.putInt(0);
        org.mockito.asm.ByteVector byteVector6 = byteVector4.putShort(1);
        java.lang.Class<?> wildcardClass7 = byteVector6.getClass();
        org.junit.Assert.assertNotNull(byteVector2);
        org.junit.Assert.assertNotNull(byteVector4);
        org.junit.Assert.assertNotNull(byteVector6);
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test0174() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0174");
        org.mockito.asm.ByteVector byteVector0 = new org.mockito.asm.ByteVector();
        org.mockito.asm.ByteVector byteVector2 = byteVector0.putUTF8("hi!");
        org.mockito.asm.ByteVector byteVector4 = byteVector2.putInt(0);
        org.mockito.asm.ByteVector byteVector6 = byteVector2.putByte((int) (byte) 10);
        org.mockito.asm.ByteVector byteVector8 = byteVector6.putUTF8("hi!");
        org.mockito.asm.ByteVector byteVector10 = byteVector8.putShort(0);
        byte[] byteArray16 = new byte[] { (byte) 1, (byte) 100, (byte) 0, (byte) 100, (byte) 100 };
        // The following exception was thrown during execution in test generation
        try {
            org.mockito.asm.ByteVector byteVector19 = byteVector10.putByteArray(byteArray16, (int) (short) 1, (int) (short) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteVector2);
        org.junit.Assert.assertNotNull(byteVector4);
        org.junit.Assert.assertNotNull(byteVector6);
        org.junit.Assert.assertNotNull(byteVector8);
        org.junit.Assert.assertNotNull(byteVector10);
        org.junit.Assert.assertNotNull(byteArray16);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray16), "[1, 100, 0, 100, 100]");
    }

    @Test
    public void test0175() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0175");
        org.mockito.asm.ByteVector byteVector0 = new org.mockito.asm.ByteVector();
        org.mockito.asm.ByteVector byteVector2 = byteVector0.putUTF8("hi!");
        org.mockito.asm.ByteVector byteVector4 = byteVector0.putShort((int) (short) -1);
        org.mockito.asm.ByteVector byteVector6 = byteVector0.putLong(0L);
        org.mockito.asm.ByteVector byteVector8 = byteVector0.putShort((int) (byte) -1);
        org.mockito.asm.ByteVector byteVector10 = byteVector0.putInt((int) (byte) 0);
        java.lang.Class<?> wildcardClass11 = byteVector10.getClass();
        org.junit.Assert.assertNotNull(byteVector2);
        org.junit.Assert.assertNotNull(byteVector4);
        org.junit.Assert.assertNotNull(byteVector6);
        org.junit.Assert.assertNotNull(byteVector8);
        org.junit.Assert.assertNotNull(byteVector10);
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test0176() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0176");
        org.mockito.asm.ByteVector byteVector0 = new org.mockito.asm.ByteVector();
        org.mockito.asm.ByteVector byteVector2 = byteVector0.putUTF8("hi!");
        org.mockito.asm.ByteVector byteVector4 = byteVector0.putLong((long) ' ');
        org.mockito.asm.ByteVector byteVector6 = byteVector4.putByte((int) 'a');
        org.mockito.asm.ByteVector byteVector8 = byteVector4.putByte((int) (short) -1);
        org.mockito.asm.ByteVector byteVector10 = byteVector4.putLong(0L);
        org.mockito.asm.ByteVector byteVector12 = byteVector4.putUTF8("hi!");
        org.mockito.asm.ByteVector byteVector14 = byteVector12.putUTF8("");
        org.mockito.asm.ByteVector byteVector16 = byteVector14.putLong((long) (byte) 10);
        org.mockito.asm.ByteVector byteVector18 = byteVector14.putLong((long) (short) 100);
        byte[] byteArray23 = new byte[] { (byte) 1, (byte) 0, (byte) 0, (byte) -1 };
        org.mockito.asm.ByteVector byteVector26 = byteVector14.putByteArray(byteArray23, 0, 0);
        org.mockito.asm.ByteVector byteVector28 = byteVector26.putShort(10);
        org.mockito.asm.ByteVector byteVector29 = new org.mockito.asm.ByteVector();
        org.mockito.asm.ByteVector byteVector31 = byteVector29.putUTF8("hi!");
        org.mockito.asm.ByteVector byteVector33 = byteVector29.putInt(0);
        org.mockito.asm.ByteVector byteVector35 = byteVector33.putInt((int) ' ');
        org.mockito.asm.ByteVector byteVector37 = byteVector35.putLong(100L);
        byte[] byteArray41 = new byte[] { (byte) 0, (byte) 10, (byte) 1 };
        org.mockito.asm.ByteVector byteVector44 = byteVector35.putByteArray(byteArray41, 0, 0);
        // The following exception was thrown during execution in test generation
        try {
            org.mockito.asm.ByteVector byteVector47 = byteVector26.putByteArray(byteArray41, (int) ' ', (int) (short) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteVector2);
        org.junit.Assert.assertNotNull(byteVector4);
        org.junit.Assert.assertNotNull(byteVector6);
        org.junit.Assert.assertNotNull(byteVector8);
        org.junit.Assert.assertNotNull(byteVector10);
        org.junit.Assert.assertNotNull(byteVector12);
        org.junit.Assert.assertNotNull(byteVector14);
        org.junit.Assert.assertNotNull(byteVector16);
        org.junit.Assert.assertNotNull(byteVector18);
        org.junit.Assert.assertNotNull(byteArray23);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray23), "[1, 0, 0, -1]");
        org.junit.Assert.assertNotNull(byteVector26);
        org.junit.Assert.assertNotNull(byteVector28);
        org.junit.Assert.assertNotNull(byteVector31);
        org.junit.Assert.assertNotNull(byteVector33);
        org.junit.Assert.assertNotNull(byteVector35);
        org.junit.Assert.assertNotNull(byteVector37);
        org.junit.Assert.assertNotNull(byteArray41);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray41), "[0, 10, 1]");
        org.junit.Assert.assertNotNull(byteVector44);
    }

    @Test
    public void test0177() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0177");
        org.mockito.asm.ByteVector byteVector0 = new org.mockito.asm.ByteVector();
        org.mockito.asm.ByteVector byteVector2 = byteVector0.putUTF8("hi!");
        org.mockito.asm.ByteVector byteVector4 = byteVector2.putLong((long) (byte) 10);
        org.mockito.asm.ByteVector byteVector6 = byteVector4.putUTF8("hi!");
        org.mockito.asm.ByteVector byteVector8 = byteVector4.putLong((long) 10);
        org.mockito.asm.ByteVector byteVector10 = byteVector8.putLong(0L);
        org.mockito.asm.ByteVector byteVector12 = byteVector10.putUTF8("hi!");
        org.mockito.asm.ByteVector byteVector13 = new org.mockito.asm.ByteVector();
        org.mockito.asm.ByteVector byteVector15 = byteVector13.putUTF8("hi!");
        org.mockito.asm.ByteVector byteVector17 = byteVector13.putLong((long) ' ');
        org.mockito.asm.ByteVector byteVector19 = byteVector17.putByte((int) 'a');
        org.mockito.asm.ByteVector byteVector21 = byteVector17.putByte((int) (short) -1);
        org.mockito.asm.ByteVector byteVector23 = byteVector17.putLong(0L);
        org.mockito.asm.ByteVector byteVector25 = byteVector17.putUTF8("hi!");
        org.mockito.asm.ByteVector byteVector27 = byteVector25.putUTF8("");
        org.mockito.asm.ByteVector byteVector29 = byteVector27.putLong((long) (byte) 10);
        org.mockito.asm.ByteVector byteVector31 = byteVector27.putLong((long) (short) 100);
        byte[] byteArray36 = new byte[] { (byte) 1, (byte) 0, (byte) 0, (byte) -1 };
        org.mockito.asm.ByteVector byteVector39 = byteVector27.putByteArray(byteArray36, 0, 0);
        // The following exception was thrown during execution in test generation
        try {
            org.mockito.asm.ByteVector byteVector42 = byteVector12.putByteArray(byteArray36, (int) (byte) 100, (int) (short) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteVector2);
        org.junit.Assert.assertNotNull(byteVector4);
        org.junit.Assert.assertNotNull(byteVector6);
        org.junit.Assert.assertNotNull(byteVector8);
        org.junit.Assert.assertNotNull(byteVector10);
        org.junit.Assert.assertNotNull(byteVector12);
        org.junit.Assert.assertNotNull(byteVector15);
        org.junit.Assert.assertNotNull(byteVector17);
        org.junit.Assert.assertNotNull(byteVector19);
        org.junit.Assert.assertNotNull(byteVector21);
        org.junit.Assert.assertNotNull(byteVector23);
        org.junit.Assert.assertNotNull(byteVector25);
        org.junit.Assert.assertNotNull(byteVector27);
        org.junit.Assert.assertNotNull(byteVector29);
        org.junit.Assert.assertNotNull(byteVector31);
        org.junit.Assert.assertNotNull(byteArray36);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray36), "[1, 0, 0, -1]");
        org.junit.Assert.assertNotNull(byteVector39);
    }

    @Test
    public void test0178() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0178");
        org.mockito.asm.ByteVector byteVector0 = new org.mockito.asm.ByteVector();
        org.mockito.asm.ByteVector byteVector2 = byteVector0.putUTF8("hi!");
        org.mockito.asm.ByteVector byteVector4 = byteVector2.putLong((long) (byte) 10);
        org.mockito.asm.ByteVector byteVector6 = byteVector4.putUTF8("hi!");
        org.mockito.asm.ByteVector byteVector8 = byteVector4.putLong((long) (short) -1);
        org.mockito.asm.ByteVector byteVector10 = byteVector8.putLong((long) (byte) 1);
        org.mockito.asm.ByteVector byteVector11 = new org.mockito.asm.ByteVector();
        org.mockito.asm.ByteVector byteVector13 = byteVector11.putUTF8("hi!");
        org.mockito.asm.ByteVector byteVector15 = byteVector13.putInt(0);
        org.mockito.asm.ByteVector byteVector17 = byteVector13.putByte((int) (byte) 10);
        org.mockito.asm.ByteVector byteVector19 = byteVector17.putLong((-1L));
        org.mockito.asm.ByteVector byteVector21 = byteVector17.putInt((int) (byte) 100);
        org.mockito.asm.ByteVector byteVector22 = new org.mockito.asm.ByteVector();
        org.mockito.asm.ByteVector byteVector24 = byteVector22.putUTF8("hi!");
        org.mockito.asm.ByteVector byteVector26 = byteVector22.putInt(0);
        org.mockito.asm.ByteVector byteVector28 = byteVector26.putInt((int) ' ');
        org.mockito.asm.ByteVector byteVector30 = byteVector28.putLong(100L);
        byte[] byteArray34 = new byte[] { (byte) 0, (byte) 10, (byte) 1 };
        org.mockito.asm.ByteVector byteVector37 = byteVector28.putByteArray(byteArray34, 0, 0);
        org.mockito.asm.ByteVector byteVector40 = byteVector17.putByteArray(byteArray34, (int) (byte) 1, 0);
        // The following exception was thrown during execution in test generation
        try {
            org.mockito.asm.ByteVector byteVector43 = byteVector10.putByteArray(byteArray34, (int) 'a', (int) (short) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteVector2);
        org.junit.Assert.assertNotNull(byteVector4);
        org.junit.Assert.assertNotNull(byteVector6);
        org.junit.Assert.assertNotNull(byteVector8);
        org.junit.Assert.assertNotNull(byteVector10);
        org.junit.Assert.assertNotNull(byteVector13);
        org.junit.Assert.assertNotNull(byteVector15);
        org.junit.Assert.assertNotNull(byteVector17);
        org.junit.Assert.assertNotNull(byteVector19);
        org.junit.Assert.assertNotNull(byteVector21);
        org.junit.Assert.assertNotNull(byteVector24);
        org.junit.Assert.assertNotNull(byteVector26);
        org.junit.Assert.assertNotNull(byteVector28);
        org.junit.Assert.assertNotNull(byteVector30);
        org.junit.Assert.assertNotNull(byteArray34);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray34), "[0, 10, 1]");
        org.junit.Assert.assertNotNull(byteVector37);
        org.junit.Assert.assertNotNull(byteVector40);
    }

    @Test
    public void test0179() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0179");
        org.mockito.asm.ByteVector byteVector0 = new org.mockito.asm.ByteVector();
        org.mockito.asm.ByteVector byteVector2 = byteVector0.putUTF8("hi!");
        org.mockito.asm.ByteVector byteVector4 = byteVector2.putLong((long) (byte) 10);
        org.mockito.asm.ByteVector byteVector6 = byteVector2.putInt((int) (short) 1);
        org.mockito.asm.ByteVector byteVector8 = byteVector2.putLong((long) (short) 10);
        java.lang.Class<?> wildcardClass9 = byteVector8.getClass();
        org.junit.Assert.assertNotNull(byteVector2);
        org.junit.Assert.assertNotNull(byteVector4);
        org.junit.Assert.assertNotNull(byteVector6);
        org.junit.Assert.assertNotNull(byteVector8);
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test0180() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0180");
        org.mockito.asm.ByteVector byteVector1 = new org.mockito.asm.ByteVector((int) (short) 1);
        org.mockito.asm.ByteVector byteVector3 = byteVector1.putLong((long) (byte) 1);
        org.mockito.asm.ByteVector byteVector4 = new org.mockito.asm.ByteVector();
        org.mockito.asm.ByteVector byteVector6 = byteVector4.putUTF8("hi!");
        org.mockito.asm.ByteVector byteVector8 = byteVector6.putInt(0);
        org.mockito.asm.ByteVector byteVector10 = byteVector6.putByte((int) (byte) 10);
        org.mockito.asm.ByteVector byteVector12 = byteVector10.putLong((-1L));
        org.mockito.asm.ByteVector byteVector14 = byteVector10.putInt((int) (byte) 100);
        org.mockito.asm.ByteVector byteVector15 = new org.mockito.asm.ByteVector();
        org.mockito.asm.ByteVector byteVector17 = byteVector15.putUTF8("hi!");
        org.mockito.asm.ByteVector byteVector19 = byteVector15.putInt(0);
        org.mockito.asm.ByteVector byteVector21 = byteVector19.putInt((int) ' ');
        org.mockito.asm.ByteVector byteVector23 = byteVector21.putLong(100L);
        byte[] byteArray27 = new byte[] { (byte) 0, (byte) 10, (byte) 1 };
        org.mockito.asm.ByteVector byteVector30 = byteVector21.putByteArray(byteArray27, 0, 0);
        org.mockito.asm.ByteVector byteVector33 = byteVector10.putByteArray(byteArray27, (int) (byte) 1, 0);
        // The following exception was thrown during execution in test generation
        try {
            org.mockito.asm.ByteVector byteVector36 = byteVector3.putByteArray(byteArray27, (int) '#', (int) (short) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteVector3);
        org.junit.Assert.assertNotNull(byteVector6);
        org.junit.Assert.assertNotNull(byteVector8);
        org.junit.Assert.assertNotNull(byteVector10);
        org.junit.Assert.assertNotNull(byteVector12);
        org.junit.Assert.assertNotNull(byteVector14);
        org.junit.Assert.assertNotNull(byteVector17);
        org.junit.Assert.assertNotNull(byteVector19);
        org.junit.Assert.assertNotNull(byteVector21);
        org.junit.Assert.assertNotNull(byteVector23);
        org.junit.Assert.assertNotNull(byteArray27);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray27), "[0, 10, 1]");
        org.junit.Assert.assertNotNull(byteVector30);
        org.junit.Assert.assertNotNull(byteVector33);
    }

    @Test
    public void test0181() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0181");
        org.mockito.asm.ByteVector byteVector0 = new org.mockito.asm.ByteVector();
        org.mockito.asm.ByteVector byteVector2 = byteVector0.putUTF8("hi!");
        org.mockito.asm.ByteVector byteVector4 = byteVector0.putShort((int) (short) -1);
        org.mockito.asm.ByteVector byteVector6 = byteVector0.putInt((int) (byte) 10);
        org.mockito.asm.ByteVector byteVector8 = byteVector0.putUTF8("");
        java.lang.Class<?> wildcardClass9 = byteVector0.getClass();
        org.junit.Assert.assertNotNull(byteVector2);
        org.junit.Assert.assertNotNull(byteVector4);
        org.junit.Assert.assertNotNull(byteVector6);
        org.junit.Assert.assertNotNull(byteVector8);
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test0182() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0182");
        org.mockito.asm.ByteVector byteVector0 = new org.mockito.asm.ByteVector();
        org.mockito.asm.ByteVector byteVector2 = byteVector0.putUTF8("hi!");
        org.mockito.asm.ByteVector byteVector4 = byteVector0.putShort((int) (short) -1);
        org.mockito.asm.ByteVector byteVector6 = byteVector0.putByte((int) ' ');
        org.mockito.asm.ByteVector byteVector8 = byteVector0.putLong((long) (byte) 0);
        org.mockito.asm.ByteVector byteVector9 = new org.mockito.asm.ByteVector();
        org.mockito.asm.ByteVector byteVector11 = byteVector9.putUTF8("hi!");
        org.mockito.asm.ByteVector byteVector13 = byteVector9.putLong((long) ' ');
        org.mockito.asm.ByteVector byteVector15 = byteVector13.putByte((int) 'a');
        org.mockito.asm.ByteVector byteVector17 = byteVector13.putByte((int) (short) -1);
        org.mockito.asm.ByteVector byteVector19 = byteVector13.putLong(0L);
        org.mockito.asm.ByteVector byteVector21 = byteVector13.putUTF8("hi!");
        org.mockito.asm.ByteVector byteVector23 = byteVector21.putUTF8("");
        org.mockito.asm.ByteVector byteVector25 = byteVector21.putInt((int) (byte) 10);
        org.mockito.asm.ByteVector byteVector27 = byteVector21.putByte(0);
        org.mockito.asm.ByteVector byteVector28 = new org.mockito.asm.ByteVector();
        org.mockito.asm.ByteVector byteVector30 = byteVector28.putUTF8("hi!");
        org.mockito.asm.ByteVector byteVector32 = byteVector28.putInt(0);
        org.mockito.asm.ByteVector byteVector34 = byteVector32.putInt((int) ' ');
        org.mockito.asm.ByteVector byteVector36 = byteVector34.putLong(100L);
        byte[] byteArray40 = new byte[] { (byte) 0, (byte) 10, (byte) 1 };
        org.mockito.asm.ByteVector byteVector43 = byteVector34.putByteArray(byteArray40, 0, 0);
        org.mockito.asm.ByteVector byteVector46 = byteVector27.putByteArray(byteArray40, (int) (short) 1, 0);
        // The following exception was thrown during execution in test generation
        try {
            org.mockito.asm.ByteVector byteVector49 = byteVector8.putByteArray(byteArray40, 1, (int) '#');
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteVector2);
        org.junit.Assert.assertNotNull(byteVector4);
        org.junit.Assert.assertNotNull(byteVector6);
        org.junit.Assert.assertNotNull(byteVector8);
        org.junit.Assert.assertNotNull(byteVector11);
        org.junit.Assert.assertNotNull(byteVector13);
        org.junit.Assert.assertNotNull(byteVector15);
        org.junit.Assert.assertNotNull(byteVector17);
        org.junit.Assert.assertNotNull(byteVector19);
        org.junit.Assert.assertNotNull(byteVector21);
        org.junit.Assert.assertNotNull(byteVector23);
        org.junit.Assert.assertNotNull(byteVector25);
        org.junit.Assert.assertNotNull(byteVector27);
        org.junit.Assert.assertNotNull(byteVector30);
        org.junit.Assert.assertNotNull(byteVector32);
        org.junit.Assert.assertNotNull(byteVector34);
        org.junit.Assert.assertNotNull(byteVector36);
        org.junit.Assert.assertNotNull(byteArray40);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray40), "[0, 10, 1]");
        org.junit.Assert.assertNotNull(byteVector43);
        org.junit.Assert.assertNotNull(byteVector46);
    }

    @Test
    public void test0183() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0183");
        org.mockito.asm.ByteVector byteVector0 = new org.mockito.asm.ByteVector();
        org.mockito.asm.ByteVector byteVector2 = byteVector0.putUTF8("hi!");
        org.mockito.asm.ByteVector byteVector4 = byteVector2.putInt((int) (byte) 10);
        org.mockito.asm.ByteVector byteVector6 = byteVector4.putUTF8("");
        org.mockito.asm.ByteVector byteVector8 = byteVector4.putByte((int) 'a');
        org.mockito.asm.ByteVector byteVector10 = byteVector8.putLong((long) (byte) 0);
        org.mockito.asm.ByteVector byteVector11 = new org.mockito.asm.ByteVector();
        org.mockito.asm.ByteVector byteVector13 = byteVector11.putUTF8("hi!");
        org.mockito.asm.ByteVector byteVector15 = byteVector13.putByte(100);
        org.mockito.asm.ByteVector byteVector17 = byteVector13.putShort((int) 'a');
        org.mockito.asm.ByteVector byteVector19 = byteVector17.putShort((int) (short) 0);
        org.mockito.asm.ByteVector byteVector20 = new org.mockito.asm.ByteVector();
        org.mockito.asm.ByteVector byteVector22 = byteVector20.putUTF8("hi!");
        org.mockito.asm.ByteVector byteVector24 = byteVector22.putInt(0);
        org.mockito.asm.ByteVector byteVector26 = byteVector22.putByte((int) (byte) 10);
        org.mockito.asm.ByteVector byteVector28 = byteVector26.putLong((-1L));
        org.mockito.asm.ByteVector byteVector30 = byteVector26.putInt((int) (byte) 100);
        org.mockito.asm.ByteVector byteVector31 = new org.mockito.asm.ByteVector();
        org.mockito.asm.ByteVector byteVector33 = byteVector31.putUTF8("hi!");
        org.mockito.asm.ByteVector byteVector35 = byteVector31.putInt(0);
        org.mockito.asm.ByteVector byteVector37 = byteVector35.putInt((int) ' ');
        org.mockito.asm.ByteVector byteVector39 = byteVector37.putLong(100L);
        byte[] byteArray43 = new byte[] { (byte) 0, (byte) 10, (byte) 1 };
        org.mockito.asm.ByteVector byteVector46 = byteVector37.putByteArray(byteArray43, 0, 0);
        org.mockito.asm.ByteVector byteVector49 = byteVector26.putByteArray(byteArray43, (int) (byte) 1, 0);
        org.mockito.asm.ByteVector byteVector52 = byteVector17.putByteArray(byteArray43, (int) (byte) 1, (int) (short) 1);
        // The following exception was thrown during execution in test generation
        try {
            org.mockito.asm.ByteVector byteVector55 = byteVector8.putByteArray(byteArray43, 0, (int) (short) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteVector2);
        org.junit.Assert.assertNotNull(byteVector4);
        org.junit.Assert.assertNotNull(byteVector6);
        org.junit.Assert.assertNotNull(byteVector8);
        org.junit.Assert.assertNotNull(byteVector10);
        org.junit.Assert.assertNotNull(byteVector13);
        org.junit.Assert.assertNotNull(byteVector15);
        org.junit.Assert.assertNotNull(byteVector17);
        org.junit.Assert.assertNotNull(byteVector19);
        org.junit.Assert.assertNotNull(byteVector22);
        org.junit.Assert.assertNotNull(byteVector24);
        org.junit.Assert.assertNotNull(byteVector26);
        org.junit.Assert.assertNotNull(byteVector28);
        org.junit.Assert.assertNotNull(byteVector30);
        org.junit.Assert.assertNotNull(byteVector33);
        org.junit.Assert.assertNotNull(byteVector35);
        org.junit.Assert.assertNotNull(byteVector37);
        org.junit.Assert.assertNotNull(byteVector39);
        org.junit.Assert.assertNotNull(byteArray43);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray43), "[0, 10, 1]");
        org.junit.Assert.assertNotNull(byteVector46);
        org.junit.Assert.assertNotNull(byteVector49);
        org.junit.Assert.assertNotNull(byteVector52);
    }

    @Test
    public void test0184() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0184");
        org.mockito.asm.ByteVector byteVector0 = new org.mockito.asm.ByteVector();
        org.mockito.asm.ByteVector byteVector2 = byteVector0.putUTF8("hi!");
        org.mockito.asm.ByteVector byteVector4 = byteVector0.putInt(0);
        org.mockito.asm.ByteVector byteVector6 = byteVector0.putInt(1);
        org.mockito.asm.ByteVector byteVector7 = new org.mockito.asm.ByteVector();
        org.mockito.asm.ByteVector byteVector9 = byteVector7.putUTF8("hi!");
        org.mockito.asm.ByteVector byteVector11 = byteVector7.putLong((long) ' ');
        org.mockito.asm.ByteVector byteVector13 = byteVector11.putByte((int) 'a');
        org.mockito.asm.ByteVector byteVector15 = byteVector11.putByte((int) (short) -1);
        org.mockito.asm.ByteVector byteVector17 = byteVector11.putLong(0L);
        org.mockito.asm.ByteVector byteVector19 = byteVector11.putUTF8("hi!");
        org.mockito.asm.ByteVector byteVector21 = byteVector19.putUTF8("");
        org.mockito.asm.ByteVector byteVector23 = byteVector19.putInt((int) (byte) 10);
        org.mockito.asm.ByteVector byteVector25 = byteVector19.putByte(0);
        org.mockito.asm.ByteVector byteVector26 = new org.mockito.asm.ByteVector();
        org.mockito.asm.ByteVector byteVector28 = byteVector26.putUTF8("hi!");
        org.mockito.asm.ByteVector byteVector30 = byteVector26.putInt(0);
        org.mockito.asm.ByteVector byteVector32 = byteVector30.putInt((int) ' ');
        org.mockito.asm.ByteVector byteVector34 = byteVector32.putLong(100L);
        byte[] byteArray38 = new byte[] { (byte) 0, (byte) 10, (byte) 1 };
        org.mockito.asm.ByteVector byteVector41 = byteVector32.putByteArray(byteArray38, 0, 0);
        org.mockito.asm.ByteVector byteVector44 = byteVector25.putByteArray(byteArray38, (int) (short) 1, 0);
        // The following exception was thrown during execution in test generation
        try {
            org.mockito.asm.ByteVector byteVector47 = byteVector6.putByteArray(byteArray38, 10, (int) (short) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteVector2);
        org.junit.Assert.assertNotNull(byteVector4);
        org.junit.Assert.assertNotNull(byteVector6);
        org.junit.Assert.assertNotNull(byteVector9);
        org.junit.Assert.assertNotNull(byteVector11);
        org.junit.Assert.assertNotNull(byteVector13);
        org.junit.Assert.assertNotNull(byteVector15);
        org.junit.Assert.assertNotNull(byteVector17);
        org.junit.Assert.assertNotNull(byteVector19);
        org.junit.Assert.assertNotNull(byteVector21);
        org.junit.Assert.assertNotNull(byteVector23);
        org.junit.Assert.assertNotNull(byteVector25);
        org.junit.Assert.assertNotNull(byteVector28);
        org.junit.Assert.assertNotNull(byteVector30);
        org.junit.Assert.assertNotNull(byteVector32);
        org.junit.Assert.assertNotNull(byteVector34);
        org.junit.Assert.assertNotNull(byteArray38);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray38), "[0, 10, 1]");
        org.junit.Assert.assertNotNull(byteVector41);
        org.junit.Assert.assertNotNull(byteVector44);
    }

    @Test
    public void test0185() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0185");
        org.mockito.asm.ByteVector byteVector0 = new org.mockito.asm.ByteVector();
        org.mockito.asm.ByteVector byteVector2 = byteVector0.putUTF8("hi!");
        org.mockito.asm.ByteVector byteVector4 = byteVector0.putInt(0);
        org.mockito.asm.ByteVector byteVector6 = byteVector4.putInt((int) ' ');
        byte[] byteArray7 = null;
        org.mockito.asm.ByteVector byteVector10 = byteVector4.putByteArray(byteArray7, (int) (byte) 1, (int) (byte) 0);
        org.mockito.asm.ByteVector byteVector11 = new org.mockito.asm.ByteVector();
        org.mockito.asm.ByteVector byteVector13 = byteVector11.putUTF8("hi!");
        org.mockito.asm.ByteVector byteVector15 = byteVector11.putInt(0);
        org.mockito.asm.ByteVector byteVector17 = byteVector15.putInt((int) ' ');
        org.mockito.asm.ByteVector byteVector19 = byteVector17.putLong(100L);
        byte[] byteArray23 = new byte[] { (byte) 0, (byte) 10, (byte) 1 };
        org.mockito.asm.ByteVector byteVector26 = byteVector17.putByteArray(byteArray23, 0, 0);
        // The following exception was thrown during execution in test generation
        try {
            org.mockito.asm.ByteVector byteVector29 = byteVector4.putByteArray(byteArray23, (-1), 100);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteVector2);
        org.junit.Assert.assertNotNull(byteVector4);
        org.junit.Assert.assertNotNull(byteVector6);
        org.junit.Assert.assertNotNull(byteVector10);
        org.junit.Assert.assertNotNull(byteVector13);
        org.junit.Assert.assertNotNull(byteVector15);
        org.junit.Assert.assertNotNull(byteVector17);
        org.junit.Assert.assertNotNull(byteVector19);
        org.junit.Assert.assertNotNull(byteArray23);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray23), "[0, 10, 1]");
        org.junit.Assert.assertNotNull(byteVector26);
    }

    @Test
    public void test0186() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0186");
        org.mockito.asm.ByteVector byteVector0 = new org.mockito.asm.ByteVector();
        org.mockito.asm.ByteVector byteVector2 = byteVector0.putUTF8("hi!");
        org.mockito.asm.ByteVector byteVector4 = byteVector0.putLong((long) ' ');
        org.mockito.asm.ByteVector byteVector6 = byteVector4.putByte((int) 'a');
        org.mockito.asm.ByteVector byteVector8 = byteVector4.putByte((int) (short) -1);
        org.mockito.asm.ByteVector byteVector10 = byteVector4.putLong(0L);
        org.mockito.asm.ByteVector byteVector12 = byteVector4.putUTF8("hi!");
        org.mockito.asm.ByteVector byteVector14 = byteVector12.putUTF8("");
        org.mockito.asm.ByteVector byteVector16 = byteVector12.putInt((int) (byte) 10);
        org.mockito.asm.ByteVector byteVector18 = byteVector12.putByte(0);
        org.mockito.asm.ByteVector byteVector20 = byteVector18.putShort(0);
        org.mockito.asm.ByteVector byteVector22 = new org.mockito.asm.ByteVector((int) (short) 0);
        org.mockito.asm.ByteVector byteVector23 = new org.mockito.asm.ByteVector();
        org.mockito.asm.ByteVector byteVector25 = byteVector23.putUTF8("hi!");
        org.mockito.asm.ByteVector byteVector27 = byteVector23.putInt(0);
        org.mockito.asm.ByteVector byteVector29 = byteVector27.putInt((int) ' ');
        org.mockito.asm.ByteVector byteVector31 = byteVector29.putLong(100L);
        byte[] byteArray35 = new byte[] { (byte) 0, (byte) 10, (byte) 1 };
        org.mockito.asm.ByteVector byteVector38 = byteVector29.putByteArray(byteArray35, 0, 0);
        org.mockito.asm.ByteVector byteVector41 = byteVector22.putByteArray(byteArray35, 1, (int) (short) 0);
        // The following exception was thrown during execution in test generation
        try {
            org.mockito.asm.ByteVector byteVector44 = byteVector20.putByteArray(byteArray35, 10, (int) (short) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteVector2);
        org.junit.Assert.assertNotNull(byteVector4);
        org.junit.Assert.assertNotNull(byteVector6);
        org.junit.Assert.assertNotNull(byteVector8);
        org.junit.Assert.assertNotNull(byteVector10);
        org.junit.Assert.assertNotNull(byteVector12);
        org.junit.Assert.assertNotNull(byteVector14);
        org.junit.Assert.assertNotNull(byteVector16);
        org.junit.Assert.assertNotNull(byteVector18);
        org.junit.Assert.assertNotNull(byteVector20);
        org.junit.Assert.assertNotNull(byteVector25);
        org.junit.Assert.assertNotNull(byteVector27);
        org.junit.Assert.assertNotNull(byteVector29);
        org.junit.Assert.assertNotNull(byteVector31);
        org.junit.Assert.assertNotNull(byteArray35);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray35), "[0, 10, 1]");
        org.junit.Assert.assertNotNull(byteVector38);
        org.junit.Assert.assertNotNull(byteVector41);
    }

    @Test
    public void test0187() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0187");
        org.mockito.asm.ByteVector byteVector0 = new org.mockito.asm.ByteVector();
        org.mockito.asm.ByteVector byteVector2 = byteVector0.putUTF8("hi!");
        org.mockito.asm.ByteVector byteVector4 = byteVector2.putLong((long) (byte) 10);
        org.mockito.asm.ByteVector byteVector6 = byteVector4.putUTF8("hi!");
        org.mockito.asm.ByteVector byteVector8 = byteVector4.putLong((long) (short) -1);
        org.mockito.asm.ByteVector byteVector10 = byteVector8.putUTF8("hi!");
        org.mockito.asm.ByteVector byteVector12 = byteVector8.putByte((-1));
        byte[] byteArray13 = new byte[] {};
        // The following exception was thrown during execution in test generation
        try {
            org.mockito.asm.ByteVector byteVector16 = byteVector8.putByteArray(byteArray13, (int) (byte) 10, (int) '4');
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteVector2);
        org.junit.Assert.assertNotNull(byteVector4);
        org.junit.Assert.assertNotNull(byteVector6);
        org.junit.Assert.assertNotNull(byteVector8);
        org.junit.Assert.assertNotNull(byteVector10);
        org.junit.Assert.assertNotNull(byteVector12);
        org.junit.Assert.assertNotNull(byteArray13);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray13), "[]");
    }

    @Test
    public void test0188() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0188");
        org.mockito.asm.ByteVector byteVector0 = new org.mockito.asm.ByteVector();
        org.mockito.asm.ByteVector byteVector2 = byteVector0.putUTF8("hi!");
        org.mockito.asm.ByteVector byteVector4 = byteVector0.putShort((int) (short) 100);
        org.mockito.asm.ByteVector byteVector6 = byteVector4.putLong(0L);
        org.mockito.asm.ByteVector byteVector7 = new org.mockito.asm.ByteVector();
        org.mockito.asm.ByteVector byteVector9 = byteVector7.putUTF8("hi!");
        org.mockito.asm.ByteVector byteVector11 = byteVector9.putByte(100);
        org.mockito.asm.ByteVector byteVector13 = byteVector9.putShort((int) 'a');
        org.mockito.asm.ByteVector byteVector15 = byteVector13.putShort((int) (short) 0);
        org.mockito.asm.ByteVector byteVector16 = new org.mockito.asm.ByteVector();
        org.mockito.asm.ByteVector byteVector18 = byteVector16.putUTF8("hi!");
        org.mockito.asm.ByteVector byteVector20 = byteVector18.putInt(0);
        org.mockito.asm.ByteVector byteVector22 = byteVector18.putByte((int) (byte) 10);
        org.mockito.asm.ByteVector byteVector24 = byteVector22.putLong((-1L));
        org.mockito.asm.ByteVector byteVector26 = byteVector22.putInt((int) (byte) 100);
        org.mockito.asm.ByteVector byteVector27 = new org.mockito.asm.ByteVector();
        org.mockito.asm.ByteVector byteVector29 = byteVector27.putUTF8("hi!");
        org.mockito.asm.ByteVector byteVector31 = byteVector27.putInt(0);
        org.mockito.asm.ByteVector byteVector33 = byteVector31.putInt((int) ' ');
        org.mockito.asm.ByteVector byteVector35 = byteVector33.putLong(100L);
        byte[] byteArray39 = new byte[] { (byte) 0, (byte) 10, (byte) 1 };
        org.mockito.asm.ByteVector byteVector42 = byteVector33.putByteArray(byteArray39, 0, 0);
        org.mockito.asm.ByteVector byteVector45 = byteVector22.putByteArray(byteArray39, (int) (byte) 1, 0);
        org.mockito.asm.ByteVector byteVector48 = byteVector13.putByteArray(byteArray39, (int) (byte) 1, (int) (short) 1);
        // The following exception was thrown during execution in test generation
        try {
            org.mockito.asm.ByteVector byteVector51 = byteVector6.putByteArray(byteArray39, (int) (byte) 0, (int) (byte) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteVector2);
        org.junit.Assert.assertNotNull(byteVector4);
        org.junit.Assert.assertNotNull(byteVector6);
        org.junit.Assert.assertNotNull(byteVector9);
        org.junit.Assert.assertNotNull(byteVector11);
        org.junit.Assert.assertNotNull(byteVector13);
        org.junit.Assert.assertNotNull(byteVector15);
        org.junit.Assert.assertNotNull(byteVector18);
        org.junit.Assert.assertNotNull(byteVector20);
        org.junit.Assert.assertNotNull(byteVector22);
        org.junit.Assert.assertNotNull(byteVector24);
        org.junit.Assert.assertNotNull(byteVector26);
        org.junit.Assert.assertNotNull(byteVector29);
        org.junit.Assert.assertNotNull(byteVector31);
        org.junit.Assert.assertNotNull(byteVector33);
        org.junit.Assert.assertNotNull(byteVector35);
        org.junit.Assert.assertNotNull(byteArray39);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray39), "[0, 10, 1]");
        org.junit.Assert.assertNotNull(byteVector42);
        org.junit.Assert.assertNotNull(byteVector45);
        org.junit.Assert.assertNotNull(byteVector48);
    }

    @Test
    public void test0189() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0189");
        org.mockito.asm.ByteVector byteVector1 = new org.mockito.asm.ByteVector((int) (short) 0);
        org.mockito.asm.ByteVector byteVector3 = byteVector1.putShort((int) (byte) 0);
        org.mockito.asm.ByteVector byteVector5 = byteVector3.putByte(0);
        org.junit.Assert.assertNotNull(byteVector3);
        org.junit.Assert.assertNotNull(byteVector5);
    }

    @Test
    public void test0190() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0190");
        org.mockito.asm.ByteVector byteVector0 = new org.mockito.asm.ByteVector();
        org.mockito.asm.ByteVector byteVector2 = byteVector0.putUTF8("hi!");
        org.mockito.asm.ByteVector byteVector4 = byteVector2.putLong((long) (byte) 10);
        org.mockito.asm.ByteVector byteVector6 = byteVector4.putUTF8("hi!");
        org.mockito.asm.ByteVector byteVector8 = byteVector4.putLong((long) 10);
        org.mockito.asm.ByteVector byteVector10 = byteVector8.putInt((int) (short) 0);
        org.mockito.asm.ByteVector byteVector12 = byteVector8.putLong(100L);
        org.mockito.asm.ByteVector byteVector14 = byteVector8.putInt((int) (byte) 10);
        org.junit.Assert.assertNotNull(byteVector2);
        org.junit.Assert.assertNotNull(byteVector4);
        org.junit.Assert.assertNotNull(byteVector6);
        org.junit.Assert.assertNotNull(byteVector8);
        org.junit.Assert.assertNotNull(byteVector10);
        org.junit.Assert.assertNotNull(byteVector12);
        org.junit.Assert.assertNotNull(byteVector14);
    }

    @Test
    public void test0191() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0191");
        org.mockito.asm.ByteVector byteVector0 = new org.mockito.asm.ByteVector();
        org.mockito.asm.ByteVector byteVector2 = byteVector0.putUTF8("hi!");
        org.mockito.asm.ByteVector byteVector4 = byteVector0.putLong((long) ' ');
        org.mockito.asm.ByteVector byteVector6 = byteVector4.putByte((int) 'a');
        org.mockito.asm.ByteVector byteVector8 = byteVector6.putByte((int) (short) -1);
        byte[] byteArray9 = null;
        org.mockito.asm.ByteVector byteVector12 = byteVector6.putByteArray(byteArray9, (int) '#', 0);
        org.mockito.asm.ByteVector byteVector14 = byteVector6.putLong((long) '#');
        org.mockito.asm.ByteVector byteVector16 = byteVector14.putShort((int) 'a');
        org.mockito.asm.ByteVector byteVector17 = new org.mockito.asm.ByteVector();
        org.mockito.asm.ByteVector byteVector19 = byteVector17.putUTF8("hi!");
        org.mockito.asm.ByteVector byteVector21 = byteVector17.putLong((long) ' ');
        org.mockito.asm.ByteVector byteVector23 = byteVector21.putByte((int) 'a');
        org.mockito.asm.ByteVector byteVector25 = byteVector21.putByte((int) (short) -1);
        org.mockito.asm.ByteVector byteVector27 = byteVector21.putLong(0L);
        org.mockito.asm.ByteVector byteVector29 = byteVector21.putUTF8("hi!");
        org.mockito.asm.ByteVector byteVector31 = byteVector29.putUTF8("");
        org.mockito.asm.ByteVector byteVector33 = byteVector31.putLong((long) (byte) 10);
        org.mockito.asm.ByteVector byteVector35 = byteVector31.putLong((long) (short) 100);
        byte[] byteArray40 = new byte[] { (byte) 1, (byte) 0, (byte) 0, (byte) -1 };
        org.mockito.asm.ByteVector byteVector43 = byteVector31.putByteArray(byteArray40, 0, 0);
        // The following exception was thrown during execution in test generation
        try {
            org.mockito.asm.ByteVector byteVector46 = byteVector16.putByteArray(byteArray40, (int) ' ', (int) '4');
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteVector2);
        org.junit.Assert.assertNotNull(byteVector4);
        org.junit.Assert.assertNotNull(byteVector6);
        org.junit.Assert.assertNotNull(byteVector8);
        org.junit.Assert.assertNotNull(byteVector12);
        org.junit.Assert.assertNotNull(byteVector14);
        org.junit.Assert.assertNotNull(byteVector16);
        org.junit.Assert.assertNotNull(byteVector19);
        org.junit.Assert.assertNotNull(byteVector21);
        org.junit.Assert.assertNotNull(byteVector23);
        org.junit.Assert.assertNotNull(byteVector25);
        org.junit.Assert.assertNotNull(byteVector27);
        org.junit.Assert.assertNotNull(byteVector29);
        org.junit.Assert.assertNotNull(byteVector31);
        org.junit.Assert.assertNotNull(byteVector33);
        org.junit.Assert.assertNotNull(byteVector35);
        org.junit.Assert.assertNotNull(byteArray40);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray40), "[1, 0, 0, -1]");
        org.junit.Assert.assertNotNull(byteVector43);
    }

    @Test
    public void test0192() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0192");
        org.mockito.asm.ByteVector byteVector0 = new org.mockito.asm.ByteVector();
        org.mockito.asm.ByteVector byteVector2 = byteVector0.putUTF8("hi!");
        org.mockito.asm.ByteVector byteVector4 = byteVector0.putLong((long) ' ');
        org.mockito.asm.ByteVector byteVector6 = byteVector4.putByte((int) 'a');
        org.mockito.asm.ByteVector byteVector8 = byteVector4.putByte((int) (short) -1);
        org.mockito.asm.ByteVector byteVector10 = byteVector4.putLong(0L);
        org.mockito.asm.ByteVector byteVector12 = byteVector4.putUTF8("hi!");
        org.mockito.asm.ByteVector byteVector14 = byteVector12.putUTF8("");
        org.mockito.asm.ByteVector byteVector16 = byteVector12.putInt((int) (byte) 10);
        org.mockito.asm.ByteVector byteVector17 = new org.mockito.asm.ByteVector();
        org.mockito.asm.ByteVector byteVector19 = byteVector17.putUTF8("hi!");
        org.mockito.asm.ByteVector byteVector21 = byteVector19.putInt(0);
        org.mockito.asm.ByteVector byteVector23 = byteVector19.putByte((int) (byte) 10);
        org.mockito.asm.ByteVector byteVector25 = byteVector23.putLong((-1L));
        org.mockito.asm.ByteVector byteVector27 = byteVector23.putInt((int) (byte) 100);
        org.mockito.asm.ByteVector byteVector28 = new org.mockito.asm.ByteVector();
        org.mockito.asm.ByteVector byteVector30 = byteVector28.putUTF8("hi!");
        org.mockito.asm.ByteVector byteVector32 = byteVector28.putInt(0);
        org.mockito.asm.ByteVector byteVector34 = byteVector32.putInt((int) ' ');
        org.mockito.asm.ByteVector byteVector36 = byteVector34.putLong(100L);
        byte[] byteArray40 = new byte[] { (byte) 0, (byte) 10, (byte) 1 };
        org.mockito.asm.ByteVector byteVector43 = byteVector34.putByteArray(byteArray40, 0, 0);
        org.mockito.asm.ByteVector byteVector46 = byteVector23.putByteArray(byteArray40, (int) (byte) 1, 0);
        // The following exception was thrown during execution in test generation
        try {
            org.mockito.asm.ByteVector byteVector49 = byteVector16.putByteArray(byteArray40, 100, (int) (short) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteVector2);
        org.junit.Assert.assertNotNull(byteVector4);
        org.junit.Assert.assertNotNull(byteVector6);
        org.junit.Assert.assertNotNull(byteVector8);
        org.junit.Assert.assertNotNull(byteVector10);
        org.junit.Assert.assertNotNull(byteVector12);
        org.junit.Assert.assertNotNull(byteVector14);
        org.junit.Assert.assertNotNull(byteVector16);
        org.junit.Assert.assertNotNull(byteVector19);
        org.junit.Assert.assertNotNull(byteVector21);
        org.junit.Assert.assertNotNull(byteVector23);
        org.junit.Assert.assertNotNull(byteVector25);
        org.junit.Assert.assertNotNull(byteVector27);
        org.junit.Assert.assertNotNull(byteVector30);
        org.junit.Assert.assertNotNull(byteVector32);
        org.junit.Assert.assertNotNull(byteVector34);
        org.junit.Assert.assertNotNull(byteVector36);
        org.junit.Assert.assertNotNull(byteArray40);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray40), "[0, 10, 1]");
        org.junit.Assert.assertNotNull(byteVector43);
        org.junit.Assert.assertNotNull(byteVector46);
    }

    @Test
    public void test0193() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0193");
        org.mockito.asm.ByteVector byteVector1 = new org.mockito.asm.ByteVector((int) '#');
        org.mockito.asm.ByteVector byteVector3 = byteVector1.putLong(100L);
        org.mockito.asm.ByteVector byteVector5 = byteVector1.putInt((int) ' ');
        org.mockito.asm.ByteVector byteVector7 = byteVector1.putInt((int) (short) 0);
        org.mockito.asm.ByteVector byteVector8 = new org.mockito.asm.ByteVector();
        org.mockito.asm.ByteVector byteVector10 = byteVector8.putUTF8("hi!");
        org.mockito.asm.ByteVector byteVector12 = byteVector8.putLong((long) ' ');
        org.mockito.asm.ByteVector byteVector14 = byteVector12.putByte((int) 'a');
        org.mockito.asm.ByteVector byteVector16 = byteVector12.putByte((int) (short) -1);
        org.mockito.asm.ByteVector byteVector18 = byteVector12.putLong(0L);
        org.mockito.asm.ByteVector byteVector20 = byteVector12.putUTF8("hi!");
        org.mockito.asm.ByteVector byteVector22 = byteVector20.putUTF8("");
        org.mockito.asm.ByteVector byteVector24 = byteVector20.putInt((int) (byte) 10);
        org.mockito.asm.ByteVector byteVector26 = byteVector20.putByte(0);
        org.mockito.asm.ByteVector byteVector27 = new org.mockito.asm.ByteVector();
        org.mockito.asm.ByteVector byteVector29 = byteVector27.putUTF8("hi!");
        org.mockito.asm.ByteVector byteVector31 = byteVector27.putInt(0);
        org.mockito.asm.ByteVector byteVector33 = byteVector31.putInt((int) ' ');
        org.mockito.asm.ByteVector byteVector35 = byteVector33.putLong(100L);
        byte[] byteArray39 = new byte[] { (byte) 0, (byte) 10, (byte) 1 };
        org.mockito.asm.ByteVector byteVector42 = byteVector33.putByteArray(byteArray39, 0, 0);
        org.mockito.asm.ByteVector byteVector45 = byteVector26.putByteArray(byteArray39, (int) (short) 1, 0);
        // The following exception was thrown during execution in test generation
        try {
            org.mockito.asm.ByteVector byteVector48 = byteVector1.putByteArray(byteArray39, (int) (short) 100, (int) '#');
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteVector3);
        org.junit.Assert.assertNotNull(byteVector5);
        org.junit.Assert.assertNotNull(byteVector7);
        org.junit.Assert.assertNotNull(byteVector10);
        org.junit.Assert.assertNotNull(byteVector12);
        org.junit.Assert.assertNotNull(byteVector14);
        org.junit.Assert.assertNotNull(byteVector16);
        org.junit.Assert.assertNotNull(byteVector18);
        org.junit.Assert.assertNotNull(byteVector20);
        org.junit.Assert.assertNotNull(byteVector22);
        org.junit.Assert.assertNotNull(byteVector24);
        org.junit.Assert.assertNotNull(byteVector26);
        org.junit.Assert.assertNotNull(byteVector29);
        org.junit.Assert.assertNotNull(byteVector31);
        org.junit.Assert.assertNotNull(byteVector33);
        org.junit.Assert.assertNotNull(byteVector35);
        org.junit.Assert.assertNotNull(byteArray39);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray39), "[0, 10, 1]");
        org.junit.Assert.assertNotNull(byteVector42);
        org.junit.Assert.assertNotNull(byteVector45);
    }

    @Test
    public void test0194() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0194");
        org.mockito.asm.ByteVector byteVector0 = new org.mockito.asm.ByteVector();
        org.mockito.asm.ByteVector byteVector2 = byteVector0.putUTF8("hi!");
        org.mockito.asm.ByteVector byteVector4 = byteVector0.putShort((int) (short) -1);
        org.mockito.asm.ByteVector byteVector6 = byteVector0.putByte((int) ' ');
        byte[] byteArray7 = new byte[] {};
        // The following exception was thrown during execution in test generation
        try {
            org.mockito.asm.ByteVector byteVector10 = byteVector6.putByteArray(byteArray7, (-1), (int) (byte) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteVector2);
        org.junit.Assert.assertNotNull(byteVector4);
        org.junit.Assert.assertNotNull(byteVector6);
        org.junit.Assert.assertNotNull(byteArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray7), "[]");
    }

    @Test
    public void test0195() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0195");
        org.mockito.asm.ByteVector byteVector1 = new org.mockito.asm.ByteVector((int) '#');
        org.mockito.asm.ByteVector byteVector3 = byteVector1.putLong(100L);
        org.mockito.asm.ByteVector byteVector5 = byteVector3.putLong(1L);
        org.mockito.asm.ByteVector byteVector7 = byteVector5.putUTF8("hi!");
        org.mockito.asm.ByteVector byteVector9 = byteVector5.putLong((long) (byte) 1);
        java.lang.Class<?> wildcardClass10 = byteVector9.getClass();
        org.junit.Assert.assertNotNull(byteVector3);
        org.junit.Assert.assertNotNull(byteVector5);
        org.junit.Assert.assertNotNull(byteVector7);
        org.junit.Assert.assertNotNull(byteVector9);
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test0196() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0196");
        org.mockito.asm.ByteVector byteVector0 = new org.mockito.asm.ByteVector();
        org.mockito.asm.ByteVector byteVector2 = byteVector0.putUTF8("hi!");
        org.mockito.asm.ByteVector byteVector4 = byteVector0.putShort((int) (short) -1);
        org.mockito.asm.ByteVector byteVector6 = byteVector4.putUTF8("");
        java.lang.Class<?> wildcardClass7 = byteVector4.getClass();
        org.junit.Assert.assertNotNull(byteVector2);
        org.junit.Assert.assertNotNull(byteVector4);
        org.junit.Assert.assertNotNull(byteVector6);
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test0197() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0197");
        org.mockito.asm.ByteVector byteVector1 = new org.mockito.asm.ByteVector((int) '#');
        org.mockito.asm.ByteVector byteVector3 = byteVector1.putLong(100L);
        org.mockito.asm.ByteVector byteVector5 = byteVector1.putUTF8("");
        org.mockito.asm.ByteVector byteVector7 = byteVector5.putInt((int) (byte) 10);
        org.mockito.asm.ByteVector byteVector9 = byteVector5.putLong(10L);
        org.mockito.asm.ByteVector byteVector11 = byteVector9.putLong((-1L));
        byte[] byteArray17 = new byte[] { (byte) 0, (byte) -1, (byte) -1, (byte) 10, (byte) 0 };
        // The following exception was thrown during execution in test generation
        try {
            org.mockito.asm.ByteVector byteVector20 = byteVector9.putByteArray(byteArray17, (int) 'a', (-1));
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteVector3);
        org.junit.Assert.assertNotNull(byteVector5);
        org.junit.Assert.assertNotNull(byteVector7);
        org.junit.Assert.assertNotNull(byteVector9);
        org.junit.Assert.assertNotNull(byteVector11);
        org.junit.Assert.assertNotNull(byteArray17);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray17), "[0, -1, -1, 10, 0]");
    }

    @Test
    public void test0198() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0198");
        org.mockito.asm.ByteVector byteVector0 = new org.mockito.asm.ByteVector();
        org.mockito.asm.ByteVector byteVector2 = byteVector0.putUTF8("hi!");
        org.mockito.asm.ByteVector byteVector4 = byteVector2.putInt(0);
        org.mockito.asm.ByteVector byteVector6 = byteVector4.putShort((int) '4');
        org.mockito.asm.ByteVector byteVector8 = byteVector6.putByte(100);
        org.mockito.asm.ByteVector byteVector10 = byteVector6.putInt((int) (byte) 10);
        org.mockito.asm.ByteVector byteVector12 = byteVector6.putInt((int) (byte) -1);
        org.mockito.asm.ByteVector byteVector14 = byteVector12.putLong((long) '4');
        java.lang.Class<?> wildcardClass15 = byteVector14.getClass();
        org.junit.Assert.assertNotNull(byteVector2);
        org.junit.Assert.assertNotNull(byteVector4);
        org.junit.Assert.assertNotNull(byteVector6);
        org.junit.Assert.assertNotNull(byteVector8);
        org.junit.Assert.assertNotNull(byteVector10);
        org.junit.Assert.assertNotNull(byteVector12);
        org.junit.Assert.assertNotNull(byteVector14);
        org.junit.Assert.assertNotNull(wildcardClass15);
    }

    @Test
    public void test0199() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0199");
        org.mockito.asm.ByteVector byteVector1 = new org.mockito.asm.ByteVector((int) (byte) 10);
        org.mockito.asm.ByteVector byteVector3 = byteVector1.putByte((int) '4');
        org.mockito.asm.ByteVector byteVector5 = byteVector1.putLong(0L);
        org.mockito.asm.ByteVector byteVector6 = new org.mockito.asm.ByteVector();
        org.mockito.asm.ByteVector byteVector8 = byteVector6.putUTF8("hi!");
        org.mockito.asm.ByteVector byteVector10 = byteVector8.putByte(100);
        org.mockito.asm.ByteVector byteVector12 = byteVector8.putShort((int) 'a');
        org.mockito.asm.ByteVector byteVector14 = byteVector12.putShort((int) (short) 0);
        org.mockito.asm.ByteVector byteVector15 = new org.mockito.asm.ByteVector();
        org.mockito.asm.ByteVector byteVector17 = byteVector15.putUTF8("hi!");
        org.mockito.asm.ByteVector byteVector19 = byteVector17.putInt(0);
        org.mockito.asm.ByteVector byteVector21 = byteVector17.putByte((int) (byte) 10);
        org.mockito.asm.ByteVector byteVector23 = byteVector21.putLong((-1L));
        org.mockito.asm.ByteVector byteVector25 = byteVector21.putInt((int) (byte) 100);
        org.mockito.asm.ByteVector byteVector26 = new org.mockito.asm.ByteVector();
        org.mockito.asm.ByteVector byteVector28 = byteVector26.putUTF8("hi!");
        org.mockito.asm.ByteVector byteVector30 = byteVector26.putInt(0);
        org.mockito.asm.ByteVector byteVector32 = byteVector30.putInt((int) ' ');
        org.mockito.asm.ByteVector byteVector34 = byteVector32.putLong(100L);
        byte[] byteArray38 = new byte[] { (byte) 0, (byte) 10, (byte) 1 };
        org.mockito.asm.ByteVector byteVector41 = byteVector32.putByteArray(byteArray38, 0, 0);
        org.mockito.asm.ByteVector byteVector44 = byteVector21.putByteArray(byteArray38, (int) (byte) 1, 0);
        org.mockito.asm.ByteVector byteVector47 = byteVector12.putByteArray(byteArray38, (int) (byte) 1, (int) (short) 1);
        // The following exception was thrown during execution in test generation
        try {
            org.mockito.asm.ByteVector byteVector50 = byteVector1.putByteArray(byteArray38, (int) '4', (int) (short) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteVector3);
        org.junit.Assert.assertNotNull(byteVector5);
        org.junit.Assert.assertNotNull(byteVector8);
        org.junit.Assert.assertNotNull(byteVector10);
        org.junit.Assert.assertNotNull(byteVector12);
        org.junit.Assert.assertNotNull(byteVector14);
        org.junit.Assert.assertNotNull(byteVector17);
        org.junit.Assert.assertNotNull(byteVector19);
        org.junit.Assert.assertNotNull(byteVector21);
        org.junit.Assert.assertNotNull(byteVector23);
        org.junit.Assert.assertNotNull(byteVector25);
        org.junit.Assert.assertNotNull(byteVector28);
        org.junit.Assert.assertNotNull(byteVector30);
        org.junit.Assert.assertNotNull(byteVector32);
        org.junit.Assert.assertNotNull(byteVector34);
        org.junit.Assert.assertNotNull(byteArray38);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray38), "[0, 10, 1]");
        org.junit.Assert.assertNotNull(byteVector41);
        org.junit.Assert.assertNotNull(byteVector44);
        org.junit.Assert.assertNotNull(byteVector47);
    }

    @Test
    public void test0200() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0200");
        org.mockito.asm.ByteVector byteVector0 = new org.mockito.asm.ByteVector();
        org.mockito.asm.ByteVector byteVector2 = byteVector0.putUTF8("hi!");
        org.mockito.asm.ByteVector byteVector4 = byteVector0.putInt(0);
        org.mockito.asm.ByteVector byteVector6 = byteVector0.putShort(10);
        org.mockito.asm.ByteVector byteVector8 = byteVector0.putLong((long) (short) 1);
        org.mockito.asm.ByteVector byteVector10 = byteVector0.putShort(100);
        org.mockito.asm.ByteVector byteVector12 = byteVector0.putInt((int) (byte) 0);
        org.junit.Assert.assertNotNull(byteVector2);
        org.junit.Assert.assertNotNull(byteVector4);
        org.junit.Assert.assertNotNull(byteVector6);
        org.junit.Assert.assertNotNull(byteVector8);
        org.junit.Assert.assertNotNull(byteVector10);
        org.junit.Assert.assertNotNull(byteVector12);
    }

    @Test
    public void test0201() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0201");
        org.mockito.asm.ByteVector byteVector0 = new org.mockito.asm.ByteVector();
        org.mockito.asm.ByteVector byteVector2 = byteVector0.putUTF8("hi!");
        org.mockito.asm.ByteVector byteVector4 = byteVector2.putInt(0);
        org.mockito.asm.ByteVector byteVector6 = byteVector4.putByte((int) (byte) 1);
        org.mockito.asm.ByteVector byteVector8 = byteVector4.putByte(0);
        org.mockito.asm.ByteVector byteVector10 = byteVector4.putInt((int) (short) 10);
        org.junit.Assert.assertNotNull(byteVector2);
        org.junit.Assert.assertNotNull(byteVector4);
        org.junit.Assert.assertNotNull(byteVector6);
        org.junit.Assert.assertNotNull(byteVector8);
        org.junit.Assert.assertNotNull(byteVector10);
    }

    @Test
    public void test0202() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0202");
        org.mockito.asm.ByteVector byteVector0 = new org.mockito.asm.ByteVector();
        org.mockito.asm.ByteVector byteVector2 = byteVector0.putUTF8("hi!");
        org.mockito.asm.ByteVector byteVector4 = byteVector0.putByte((int) (byte) 1);
        org.mockito.asm.ByteVector byteVector6 = byteVector4.putShort((int) (short) 1);
        java.lang.Class<?> wildcardClass7 = byteVector4.getClass();
        org.junit.Assert.assertNotNull(byteVector2);
        org.junit.Assert.assertNotNull(byteVector4);
        org.junit.Assert.assertNotNull(byteVector6);
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test0203() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0203");
        org.mockito.asm.ByteVector byteVector0 = new org.mockito.asm.ByteVector();
        org.mockito.asm.ByteVector byteVector2 = byteVector0.putUTF8("hi!");
        org.mockito.asm.ByteVector byteVector4 = byteVector0.putInt(0);
        org.mockito.asm.ByteVector byteVector6 = byteVector4.putInt((int) ' ');
        org.mockito.asm.ByteVector byteVector8 = byteVector6.putLong(100L);
        byte[] byteArray12 = new byte[] { (byte) 0, (byte) 10, (byte) 1 };
        org.mockito.asm.ByteVector byteVector15 = byteVector6.putByteArray(byteArray12, 0, 0);
        java.lang.Class<?> wildcardClass16 = byteVector15.getClass();
        org.junit.Assert.assertNotNull(byteVector2);
        org.junit.Assert.assertNotNull(byteVector4);
        org.junit.Assert.assertNotNull(byteVector6);
        org.junit.Assert.assertNotNull(byteVector8);
        org.junit.Assert.assertNotNull(byteArray12);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray12), "[0, 10, 1]");
        org.junit.Assert.assertNotNull(byteVector15);
        org.junit.Assert.assertNotNull(wildcardClass16);
    }

    @Test
    public void test0204() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0204");
        org.mockito.asm.ByteVector byteVector0 = new org.mockito.asm.ByteVector();
        org.mockito.asm.ByteVector byteVector2 = byteVector0.putUTF8("hi!");
        org.mockito.asm.ByteVector byteVector4 = byteVector0.putLong((long) ' ');
        org.mockito.asm.ByteVector byteVector6 = byteVector4.putByte((int) 'a');
        org.mockito.asm.ByteVector byteVector8 = byteVector4.putByte((int) (short) -1);
        org.mockito.asm.ByteVector byteVector10 = byteVector4.putLong(0L);
        org.mockito.asm.ByteVector byteVector12 = byteVector10.putInt((int) (short) -1);
        org.mockito.asm.ByteVector byteVector14 = byteVector12.putByte(100);
        org.mockito.asm.ByteVector byteVector16 = byteVector12.putShort((int) (short) 10);
        org.mockito.asm.ByteVector byteVector18 = byteVector16.putByte((int) (byte) -1);
        byte[] byteArray25 = new byte[] { (byte) 10, (byte) 10, (byte) 10, (byte) 0, (byte) 0, (byte) 0 };
        // The following exception was thrown during execution in test generation
        try {
            org.mockito.asm.ByteVector byteVector28 = byteVector18.putByteArray(byteArray25, (int) (short) 100, 0);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteVector2);
        org.junit.Assert.assertNotNull(byteVector4);
        org.junit.Assert.assertNotNull(byteVector6);
        org.junit.Assert.assertNotNull(byteVector8);
        org.junit.Assert.assertNotNull(byteVector10);
        org.junit.Assert.assertNotNull(byteVector12);
        org.junit.Assert.assertNotNull(byteVector14);
        org.junit.Assert.assertNotNull(byteVector16);
        org.junit.Assert.assertNotNull(byteVector18);
        org.junit.Assert.assertNotNull(byteArray25);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray25), "[10, 10, 10, 0, 0, 0]");
    }

    @Test
    public void test0205() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0205");
        org.mockito.asm.ByteVector byteVector0 = new org.mockito.asm.ByteVector();
        org.mockito.asm.ByteVector byteVector2 = byteVector0.putUTF8("hi!");
        org.mockito.asm.ByteVector byteVector4 = byteVector2.putLong((long) (byte) 10);
        org.mockito.asm.ByteVector byteVector6 = byteVector4.putUTF8("hi!");
        org.mockito.asm.ByteVector byteVector8 = byteVector4.putLong((-1L));
        org.mockito.asm.ByteVector byteVector10 = byteVector8.putInt(10);
        org.mockito.asm.ByteVector byteVector12 = byteVector10.putShort((int) '#');
        org.mockito.asm.ByteVector byteVector14 = byteVector10.putLong((long) (byte) -1);
        org.mockito.asm.ByteVector byteVector16 = byteVector10.putLong((long) '4');
        org.mockito.asm.ByteVector byteVector18 = byteVector10.putShort((int) (byte) 10);
        org.mockito.asm.ByteVector byteVector19 = new org.mockito.asm.ByteVector();
        org.mockito.asm.ByteVector byteVector21 = byteVector19.putUTF8("hi!");
        org.mockito.asm.ByteVector byteVector23 = byteVector19.putLong((long) ' ');
        org.mockito.asm.ByteVector byteVector25 = byteVector23.putByte((int) 'a');
        org.mockito.asm.ByteVector byteVector27 = byteVector23.putByte((int) (short) -1);
        org.mockito.asm.ByteVector byteVector29 = byteVector23.putLong(0L);
        org.mockito.asm.ByteVector byteVector31 = byteVector23.putUTF8("hi!");
        org.mockito.asm.ByteVector byteVector33 = byteVector31.putUTF8("");
        org.mockito.asm.ByteVector byteVector35 = byteVector31.putInt((int) (byte) 10);
        org.mockito.asm.ByteVector byteVector37 = byteVector31.putByte(0);
        org.mockito.asm.ByteVector byteVector38 = new org.mockito.asm.ByteVector();
        org.mockito.asm.ByteVector byteVector40 = byteVector38.putUTF8("hi!");
        org.mockito.asm.ByteVector byteVector42 = byteVector38.putInt(0);
        org.mockito.asm.ByteVector byteVector44 = byteVector42.putInt((int) ' ');
        org.mockito.asm.ByteVector byteVector46 = byteVector44.putLong(100L);
        byte[] byteArray50 = new byte[] { (byte) 0, (byte) 10, (byte) 1 };
        org.mockito.asm.ByteVector byteVector53 = byteVector44.putByteArray(byteArray50, 0, 0);
        org.mockito.asm.ByteVector byteVector56 = byteVector37.putByteArray(byteArray50, (int) (short) 1, 0);
        // The following exception was thrown during execution in test generation
        try {
            org.mockito.asm.ByteVector byteVector59 = byteVector18.putByteArray(byteArray50, 100, (int) (short) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteVector2);
        org.junit.Assert.assertNotNull(byteVector4);
        org.junit.Assert.assertNotNull(byteVector6);
        org.junit.Assert.assertNotNull(byteVector8);
        org.junit.Assert.assertNotNull(byteVector10);
        org.junit.Assert.assertNotNull(byteVector12);
        org.junit.Assert.assertNotNull(byteVector14);
        org.junit.Assert.assertNotNull(byteVector16);
        org.junit.Assert.assertNotNull(byteVector18);
        org.junit.Assert.assertNotNull(byteVector21);
        org.junit.Assert.assertNotNull(byteVector23);
        org.junit.Assert.assertNotNull(byteVector25);
        org.junit.Assert.assertNotNull(byteVector27);
        org.junit.Assert.assertNotNull(byteVector29);
        org.junit.Assert.assertNotNull(byteVector31);
        org.junit.Assert.assertNotNull(byteVector33);
        org.junit.Assert.assertNotNull(byteVector35);
        org.junit.Assert.assertNotNull(byteVector37);
        org.junit.Assert.assertNotNull(byteVector40);
        org.junit.Assert.assertNotNull(byteVector42);
        org.junit.Assert.assertNotNull(byteVector44);
        org.junit.Assert.assertNotNull(byteVector46);
        org.junit.Assert.assertNotNull(byteArray50);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray50), "[0, 10, 1]");
        org.junit.Assert.assertNotNull(byteVector53);
        org.junit.Assert.assertNotNull(byteVector56);
    }

    @Test
    public void test0206() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0206");
        org.mockito.asm.ByteVector byteVector0 = new org.mockito.asm.ByteVector();
        org.mockito.asm.ByteVector byteVector2 = byteVector0.putUTF8("hi!");
        org.mockito.asm.ByteVector byteVector4 = byteVector2.putInt(0);
        org.mockito.asm.ByteVector byteVector6 = byteVector4.putByte((int) (short) 0);
        org.mockito.asm.ByteVector byteVector8 = byteVector4.putUTF8("hi!");
        org.mockito.asm.ByteVector byteVector10 = byteVector8.putUTF8("");
        org.junit.Assert.assertNotNull(byteVector2);
        org.junit.Assert.assertNotNull(byteVector4);
        org.junit.Assert.assertNotNull(byteVector6);
        org.junit.Assert.assertNotNull(byteVector8);
        org.junit.Assert.assertNotNull(byteVector10);
    }

    @Test
    public void test0207() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0207");
        org.mockito.asm.ByteVector byteVector0 = new org.mockito.asm.ByteVector();
        org.mockito.asm.ByteVector byteVector2 = byteVector0.putUTF8("hi!");
        org.mockito.asm.ByteVector byteVector4 = byteVector0.putInt(0);
        org.mockito.asm.ByteVector byteVector6 = byteVector0.putShort((int) '4');
        org.mockito.asm.ByteVector byteVector8 = byteVector0.putByte(100);
        java.lang.Class<?> wildcardClass9 = byteVector0.getClass();
        org.junit.Assert.assertNotNull(byteVector2);
        org.junit.Assert.assertNotNull(byteVector4);
        org.junit.Assert.assertNotNull(byteVector6);
        org.junit.Assert.assertNotNull(byteVector8);
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test0208() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0208");
        org.mockito.asm.ByteVector byteVector1 = new org.mockito.asm.ByteVector((int) (byte) 1);
        org.mockito.asm.ByteVector byteVector3 = new org.mockito.asm.ByteVector((int) (byte) 10);
        org.mockito.asm.ByteVector byteVector5 = byteVector3.putByte((int) '4');
        org.mockito.asm.ByteVector byteVector7 = byteVector3.putLong((long) 'a');
        org.mockito.asm.ByteVector byteVector8 = new org.mockito.asm.ByteVector();
        org.mockito.asm.ByteVector byteVector10 = byteVector8.putUTF8("hi!");
        org.mockito.asm.ByteVector byteVector12 = byteVector8.putLong((long) ' ');
        org.mockito.asm.ByteVector byteVector14 = byteVector12.putByte((int) 'a');
        org.mockito.asm.ByteVector byteVector16 = byteVector12.putByte((int) (short) -1);
        org.mockito.asm.ByteVector byteVector18 = byteVector12.putLong(0L);
        org.mockito.asm.ByteVector byteVector20 = byteVector12.putUTF8("hi!");
        org.mockito.asm.ByteVector byteVector22 = byteVector20.putUTF8("");
        org.mockito.asm.ByteVector byteVector24 = byteVector20.putInt((int) (byte) 10);
        org.mockito.asm.ByteVector byteVector26 = byteVector20.putByte(0);
        org.mockito.asm.ByteVector byteVector27 = new org.mockito.asm.ByteVector();
        org.mockito.asm.ByteVector byteVector29 = byteVector27.putUTF8("hi!");
        org.mockito.asm.ByteVector byteVector31 = byteVector27.putInt(0);
        org.mockito.asm.ByteVector byteVector33 = byteVector31.putInt((int) ' ');
        org.mockito.asm.ByteVector byteVector35 = byteVector33.putLong(100L);
        byte[] byteArray39 = new byte[] { (byte) 0, (byte) 10, (byte) 1 };
        org.mockito.asm.ByteVector byteVector42 = byteVector33.putByteArray(byteArray39, 0, 0);
        org.mockito.asm.ByteVector byteVector45 = byteVector26.putByteArray(byteArray39, (int) (short) 1, 0);
        org.mockito.asm.ByteVector byteVector48 = byteVector7.putByteArray(byteArray39, 0, 0);
        // The following exception was thrown during execution in test generation
        try {
            org.mockito.asm.ByteVector byteVector51 = byteVector1.putByteArray(byteArray39, (int) (short) 100, 100);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteVector5);
        org.junit.Assert.assertNotNull(byteVector7);
        org.junit.Assert.assertNotNull(byteVector10);
        org.junit.Assert.assertNotNull(byteVector12);
        org.junit.Assert.assertNotNull(byteVector14);
        org.junit.Assert.assertNotNull(byteVector16);
        org.junit.Assert.assertNotNull(byteVector18);
        org.junit.Assert.assertNotNull(byteVector20);
        org.junit.Assert.assertNotNull(byteVector22);
        org.junit.Assert.assertNotNull(byteVector24);
        org.junit.Assert.assertNotNull(byteVector26);
        org.junit.Assert.assertNotNull(byteVector29);
        org.junit.Assert.assertNotNull(byteVector31);
        org.junit.Assert.assertNotNull(byteVector33);
        org.junit.Assert.assertNotNull(byteVector35);
        org.junit.Assert.assertNotNull(byteArray39);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray39), "[0, 10, 1]");
        org.junit.Assert.assertNotNull(byteVector42);
        org.junit.Assert.assertNotNull(byteVector45);
        org.junit.Assert.assertNotNull(byteVector48);
    }

    @Test
    public void test0209() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0209");
        org.mockito.asm.ByteVector byteVector0 = new org.mockito.asm.ByteVector();
        org.mockito.asm.ByteVector byteVector2 = byteVector0.putUTF8("hi!");
        org.mockito.asm.ByteVector byteVector4 = byteVector0.putLong((long) ' ');
        org.mockito.asm.ByteVector byteVector6 = byteVector4.putByte((int) 'a');
        org.mockito.asm.ByteVector byteVector8 = byteVector4.putByte((int) (short) -1);
        org.mockito.asm.ByteVector byteVector10 = byteVector4.putLong(0L);
        org.mockito.asm.ByteVector byteVector12 = byteVector10.putByte(0);
        org.mockito.asm.ByteVector byteVector14 = byteVector12.putByte(100);
        org.mockito.asm.ByteVector byteVector16 = byteVector12.putInt((-1));
        org.mockito.asm.ByteVector byteVector18 = byteVector12.putByte((int) (byte) 100);
        org.mockito.asm.ByteVector byteVector20 = byteVector12.putUTF8("hi!");
        org.junit.Assert.assertNotNull(byteVector2);
        org.junit.Assert.assertNotNull(byteVector4);
        org.junit.Assert.assertNotNull(byteVector6);
        org.junit.Assert.assertNotNull(byteVector8);
        org.junit.Assert.assertNotNull(byteVector10);
        org.junit.Assert.assertNotNull(byteVector12);
        org.junit.Assert.assertNotNull(byteVector14);
        org.junit.Assert.assertNotNull(byteVector16);
        org.junit.Assert.assertNotNull(byteVector18);
        org.junit.Assert.assertNotNull(byteVector20);
    }

    @Test
    public void test0210() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0210");
        org.mockito.asm.ByteVector byteVector0 = new org.mockito.asm.ByteVector();
        org.mockito.asm.ByteVector byteVector2 = byteVector0.putUTF8("hi!");
        org.mockito.asm.ByteVector byteVector4 = byteVector2.putInt(0);
        org.mockito.asm.ByteVector byteVector6 = byteVector4.putByte((int) (byte) 1);
        org.mockito.asm.ByteVector byteVector8 = byteVector6.putShort((int) (byte) 10);
        org.mockito.asm.ByteVector byteVector10 = byteVector8.putUTF8("");
        java.lang.Class<?> wildcardClass11 = byteVector10.getClass();
        org.junit.Assert.assertNotNull(byteVector2);
        org.junit.Assert.assertNotNull(byteVector4);
        org.junit.Assert.assertNotNull(byteVector6);
        org.junit.Assert.assertNotNull(byteVector8);
        org.junit.Assert.assertNotNull(byteVector10);
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test0211() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0211");
        org.mockito.asm.ByteVector byteVector0 = new org.mockito.asm.ByteVector();
        org.mockito.asm.ByteVector byteVector2 = byteVector0.putUTF8("hi!");
        org.mockito.asm.ByteVector byteVector4 = byteVector2.putInt(0);
        org.mockito.asm.ByteVector byteVector6 = byteVector2.putByte((int) (byte) 10);
        org.mockito.asm.ByteVector byteVector8 = byteVector6.putLong((-1L));
        java.lang.Class<?> wildcardClass9 = byteVector8.getClass();
        org.junit.Assert.assertNotNull(byteVector2);
        org.junit.Assert.assertNotNull(byteVector4);
        org.junit.Assert.assertNotNull(byteVector6);
        org.junit.Assert.assertNotNull(byteVector8);
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test0212() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0212");
        org.mockito.asm.ByteVector byteVector0 = new org.mockito.asm.ByteVector();
        org.mockito.asm.ByteVector byteVector2 = byteVector0.putUTF8("hi!");
        org.mockito.asm.ByteVector byteVector4 = byteVector0.putShort((int) (short) -1);
        org.mockito.asm.ByteVector byteVector6 = byteVector0.putInt(0);
        org.mockito.asm.ByteVector byteVector8 = byteVector0.putUTF8("hi!");
        org.mockito.asm.ByteVector byteVector10 = byteVector0.putLong((long) 1);
        org.junit.Assert.assertNotNull(byteVector2);
        org.junit.Assert.assertNotNull(byteVector4);
        org.junit.Assert.assertNotNull(byteVector6);
        org.junit.Assert.assertNotNull(byteVector8);
        org.junit.Assert.assertNotNull(byteVector10);
    }

    @Test
    public void test0213() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0213");
        org.mockito.asm.ByteVector byteVector0 = new org.mockito.asm.ByteVector();
        org.mockito.asm.ByteVector byteVector2 = byteVector0.putUTF8("hi!");
        org.mockito.asm.ByteVector byteVector4 = byteVector0.putLong((long) (short) 1);
        org.mockito.asm.ByteVector byteVector6 = byteVector0.putShort(10);
        org.junit.Assert.assertNotNull(byteVector2);
        org.junit.Assert.assertNotNull(byteVector4);
        org.junit.Assert.assertNotNull(byteVector6);
    }

    @Test
    public void test0214() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0214");
        org.mockito.asm.ByteVector byteVector0 = new org.mockito.asm.ByteVector();
        org.mockito.asm.ByteVector byteVector2 = byteVector0.putUTF8("hi!");
        org.mockito.asm.ByteVector byteVector4 = byteVector2.putInt(0);
        org.mockito.asm.ByteVector byteVector6 = byteVector2.putShort((int) (byte) 10);
        org.mockito.asm.ByteVector byteVector7 = new org.mockito.asm.ByteVector();
        org.mockito.asm.ByteVector byteVector9 = byteVector7.putUTF8("hi!");
        org.mockito.asm.ByteVector byteVector11 = byteVector9.putLong((long) (byte) 10);
        org.mockito.asm.ByteVector byteVector13 = byteVector11.putUTF8("hi!");
        org.mockito.asm.ByteVector byteVector15 = byteVector11.putLong((-1L));
        org.mockito.asm.ByteVector byteVector17 = new org.mockito.asm.ByteVector((int) (short) 0);
        org.mockito.asm.ByteVector byteVector18 = new org.mockito.asm.ByteVector();
        org.mockito.asm.ByteVector byteVector20 = byteVector18.putUTF8("hi!");
        org.mockito.asm.ByteVector byteVector22 = byteVector18.putInt(0);
        org.mockito.asm.ByteVector byteVector24 = byteVector22.putInt((int) ' ');
        org.mockito.asm.ByteVector byteVector26 = byteVector24.putLong(100L);
        byte[] byteArray30 = new byte[] { (byte) 0, (byte) 10, (byte) 1 };
        org.mockito.asm.ByteVector byteVector33 = byteVector24.putByteArray(byteArray30, 0, 0);
        org.mockito.asm.ByteVector byteVector36 = byteVector17.putByteArray(byteArray30, 1, (int) (short) 0);
        org.mockito.asm.ByteVector byteVector39 = byteVector15.putByteArray(byteArray30, 0, (int) (byte) 1);
        // The following exception was thrown during execution in test generation
        try {
            org.mockito.asm.ByteVector byteVector42 = byteVector6.putByteArray(byteArray30, (int) '#', (int) (byte) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteVector2);
        org.junit.Assert.assertNotNull(byteVector4);
        org.junit.Assert.assertNotNull(byteVector6);
        org.junit.Assert.assertNotNull(byteVector9);
        org.junit.Assert.assertNotNull(byteVector11);
        org.junit.Assert.assertNotNull(byteVector13);
        org.junit.Assert.assertNotNull(byteVector15);
        org.junit.Assert.assertNotNull(byteVector20);
        org.junit.Assert.assertNotNull(byteVector22);
        org.junit.Assert.assertNotNull(byteVector24);
        org.junit.Assert.assertNotNull(byteVector26);
        org.junit.Assert.assertNotNull(byteArray30);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray30), "[0, 10, 1]");
        org.junit.Assert.assertNotNull(byteVector33);
        org.junit.Assert.assertNotNull(byteVector36);
        org.junit.Assert.assertNotNull(byteVector39);
    }

    @Test
    public void test0215() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0215");
        org.mockito.asm.ByteVector byteVector0 = new org.mockito.asm.ByteVector();
        org.mockito.asm.ByteVector byteVector2 = byteVector0.putUTF8("hi!");
        org.mockito.asm.ByteVector byteVector4 = byteVector0.putInt(0);
        org.mockito.asm.ByteVector byteVector6 = byteVector0.putShort(10);
        org.mockito.asm.ByteVector byteVector8 = byteVector6.putLong((long) '4');
        org.mockito.asm.ByteVector byteVector10 = byteVector6.putShort((int) ' ');
        org.mockito.asm.ByteVector byteVector12 = byteVector6.putInt((int) (byte) -1);
        org.mockito.asm.ByteVector byteVector13 = new org.mockito.asm.ByteVector();
        org.mockito.asm.ByteVector byteVector15 = byteVector13.putUTF8("hi!");
        org.mockito.asm.ByteVector byteVector17 = byteVector15.putInt(0);
        org.mockito.asm.ByteVector byteVector19 = byteVector15.putByte((int) (byte) 10);
        org.mockito.asm.ByteVector byteVector21 = byteVector19.putLong((-1L));
        org.mockito.asm.ByteVector byteVector23 = byteVector19.putInt((int) (byte) 100);
        org.mockito.asm.ByteVector byteVector24 = new org.mockito.asm.ByteVector();
        org.mockito.asm.ByteVector byteVector26 = byteVector24.putUTF8("hi!");
        org.mockito.asm.ByteVector byteVector28 = byteVector24.putInt(0);
        org.mockito.asm.ByteVector byteVector30 = byteVector28.putInt((int) ' ');
        org.mockito.asm.ByteVector byteVector32 = byteVector30.putLong(100L);
        byte[] byteArray36 = new byte[] { (byte) 0, (byte) 10, (byte) 1 };
        org.mockito.asm.ByteVector byteVector39 = byteVector30.putByteArray(byteArray36, 0, 0);
        org.mockito.asm.ByteVector byteVector42 = byteVector19.putByteArray(byteArray36, (int) (byte) 1, 0);
        // The following exception was thrown during execution in test generation
        try {
            org.mockito.asm.ByteVector byteVector45 = byteVector12.putByteArray(byteArray36, (int) (byte) 0, (int) 'a');
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteVector2);
        org.junit.Assert.assertNotNull(byteVector4);
        org.junit.Assert.assertNotNull(byteVector6);
        org.junit.Assert.assertNotNull(byteVector8);
        org.junit.Assert.assertNotNull(byteVector10);
        org.junit.Assert.assertNotNull(byteVector12);
        org.junit.Assert.assertNotNull(byteVector15);
        org.junit.Assert.assertNotNull(byteVector17);
        org.junit.Assert.assertNotNull(byteVector19);
        org.junit.Assert.assertNotNull(byteVector21);
        org.junit.Assert.assertNotNull(byteVector23);
        org.junit.Assert.assertNotNull(byteVector26);
        org.junit.Assert.assertNotNull(byteVector28);
        org.junit.Assert.assertNotNull(byteVector30);
        org.junit.Assert.assertNotNull(byteVector32);
        org.junit.Assert.assertNotNull(byteArray36);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray36), "[0, 10, 1]");
        org.junit.Assert.assertNotNull(byteVector39);
        org.junit.Assert.assertNotNull(byteVector42);
    }

    @Test
    public void test0216() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0216");
        org.mockito.asm.ByteVector byteVector0 = new org.mockito.asm.ByteVector();
        org.mockito.asm.ByteVector byteVector2 = byteVector0.putUTF8("hi!");
        org.mockito.asm.ByteVector byteVector4 = byteVector2.putInt(0);
        org.mockito.asm.ByteVector byteVector6 = byteVector2.putByte((int) (byte) 10);
        org.mockito.asm.ByteVector byteVector8 = byteVector6.putLong((-1L));
        org.mockito.asm.ByteVector byteVector10 = byteVector6.putInt((int) (byte) 100);
        org.mockito.asm.ByteVector byteVector12 = byteVector6.putShort(10);
        java.lang.Class<?> wildcardClass13 = byteVector12.getClass();
        org.junit.Assert.assertNotNull(byteVector2);
        org.junit.Assert.assertNotNull(byteVector4);
        org.junit.Assert.assertNotNull(byteVector6);
        org.junit.Assert.assertNotNull(byteVector8);
        org.junit.Assert.assertNotNull(byteVector10);
        org.junit.Assert.assertNotNull(byteVector12);
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test0217() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0217");
        org.mockito.asm.ByteVector byteVector0 = new org.mockito.asm.ByteVector();
        org.mockito.asm.ByteVector byteVector2 = byteVector0.putUTF8("hi!");
        org.mockito.asm.ByteVector byteVector4 = byteVector2.putByte(100);
        org.mockito.asm.ByteVector byteVector6 = byteVector2.putShort((int) 'a');
        org.mockito.asm.ByteVector byteVector8 = byteVector6.putByte((int) (short) 1);
        org.mockito.asm.ByteVector byteVector10 = new org.mockito.asm.ByteVector((int) (byte) 10);
        org.mockito.asm.ByteVector byteVector12 = byteVector10.putByte((int) '4');
        org.mockito.asm.ByteVector byteVector14 = byteVector10.putLong((long) 'a');
        org.mockito.asm.ByteVector byteVector15 = new org.mockito.asm.ByteVector();
        org.mockito.asm.ByteVector byteVector17 = byteVector15.putUTF8("hi!");
        org.mockito.asm.ByteVector byteVector19 = byteVector15.putLong((long) ' ');
        org.mockito.asm.ByteVector byteVector21 = byteVector19.putByte((int) 'a');
        org.mockito.asm.ByteVector byteVector23 = byteVector19.putByte((int) (short) -1);
        org.mockito.asm.ByteVector byteVector25 = byteVector19.putLong(0L);
        org.mockito.asm.ByteVector byteVector27 = byteVector19.putUTF8("hi!");
        org.mockito.asm.ByteVector byteVector29 = byteVector27.putUTF8("");
        org.mockito.asm.ByteVector byteVector31 = byteVector27.putInt((int) (byte) 10);
        org.mockito.asm.ByteVector byteVector33 = byteVector27.putByte(0);
        org.mockito.asm.ByteVector byteVector34 = new org.mockito.asm.ByteVector();
        org.mockito.asm.ByteVector byteVector36 = byteVector34.putUTF8("hi!");
        org.mockito.asm.ByteVector byteVector38 = byteVector34.putInt(0);
        org.mockito.asm.ByteVector byteVector40 = byteVector38.putInt((int) ' ');
        org.mockito.asm.ByteVector byteVector42 = byteVector40.putLong(100L);
        byte[] byteArray46 = new byte[] { (byte) 0, (byte) 10, (byte) 1 };
        org.mockito.asm.ByteVector byteVector49 = byteVector40.putByteArray(byteArray46, 0, 0);
        org.mockito.asm.ByteVector byteVector52 = byteVector33.putByteArray(byteArray46, (int) (short) 1, 0);
        org.mockito.asm.ByteVector byteVector55 = byteVector14.putByteArray(byteArray46, 0, 0);
        // The following exception was thrown during execution in test generation
        try {
            org.mockito.asm.ByteVector byteVector58 = byteVector6.putByteArray(byteArray46, (int) (byte) -1, 10);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteVector2);
        org.junit.Assert.assertNotNull(byteVector4);
        org.junit.Assert.assertNotNull(byteVector6);
        org.junit.Assert.assertNotNull(byteVector8);
        org.junit.Assert.assertNotNull(byteVector12);
        org.junit.Assert.assertNotNull(byteVector14);
        org.junit.Assert.assertNotNull(byteVector17);
        org.junit.Assert.assertNotNull(byteVector19);
        org.junit.Assert.assertNotNull(byteVector21);
        org.junit.Assert.assertNotNull(byteVector23);
        org.junit.Assert.assertNotNull(byteVector25);
        org.junit.Assert.assertNotNull(byteVector27);
        org.junit.Assert.assertNotNull(byteVector29);
        org.junit.Assert.assertNotNull(byteVector31);
        org.junit.Assert.assertNotNull(byteVector33);
        org.junit.Assert.assertNotNull(byteVector36);
        org.junit.Assert.assertNotNull(byteVector38);
        org.junit.Assert.assertNotNull(byteVector40);
        org.junit.Assert.assertNotNull(byteVector42);
        org.junit.Assert.assertNotNull(byteArray46);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray46), "[0, 10, 1]");
        org.junit.Assert.assertNotNull(byteVector49);
        org.junit.Assert.assertNotNull(byteVector52);
        org.junit.Assert.assertNotNull(byteVector55);
    }

    @Test
    public void test0218() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0218");
        org.mockito.asm.ByteVector byteVector0 = new org.mockito.asm.ByteVector();
        org.mockito.asm.ByteVector byteVector2 = byteVector0.putUTF8("hi!");
        org.mockito.asm.ByteVector byteVector4 = byteVector0.putLong((long) ' ');
        org.mockito.asm.ByteVector byteVector6 = byteVector4.putByte((int) 'a');
        org.mockito.asm.ByteVector byteVector8 = byteVector6.putInt((int) (short) 0);
        org.mockito.asm.ByteVector byteVector10 = byteVector8.putByte((int) (short) 0);
        org.mockito.asm.ByteVector byteVector12 = byteVector8.putShort((int) (short) 0);
        org.mockito.asm.ByteVector byteVector14 = byteVector12.putLong((long) (byte) 10);
        java.lang.Class<?> wildcardClass15 = byteVector12.getClass();
        org.junit.Assert.assertNotNull(byteVector2);
        org.junit.Assert.assertNotNull(byteVector4);
        org.junit.Assert.assertNotNull(byteVector6);
        org.junit.Assert.assertNotNull(byteVector8);
        org.junit.Assert.assertNotNull(byteVector10);
        org.junit.Assert.assertNotNull(byteVector12);
        org.junit.Assert.assertNotNull(byteVector14);
        org.junit.Assert.assertNotNull(wildcardClass15);
    }

    @Test
    public void test0219() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0219");
        org.mockito.asm.ByteVector byteVector0 = new org.mockito.asm.ByteVector();
        org.mockito.asm.ByteVector byteVector2 = byteVector0.putUTF8("hi!");
        org.mockito.asm.ByteVector byteVector4 = byteVector0.putByte((int) (byte) 1);
        org.mockito.asm.ByteVector byteVector6 = byteVector0.putLong((long) (short) 1);
        java.lang.Class<?> wildcardClass7 = byteVector6.getClass();
        org.junit.Assert.assertNotNull(byteVector2);
        org.junit.Assert.assertNotNull(byteVector4);
        org.junit.Assert.assertNotNull(byteVector6);
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test0220() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0220");
        org.mockito.asm.ByteVector byteVector1 = new org.mockito.asm.ByteVector((int) (short) 0);
        org.mockito.asm.ByteVector byteVector2 = new org.mockito.asm.ByteVector();
        org.mockito.asm.ByteVector byteVector4 = byteVector2.putUTF8("hi!");
        org.mockito.asm.ByteVector byteVector6 = byteVector2.putInt(0);
        org.mockito.asm.ByteVector byteVector8 = byteVector6.putInt((int) ' ');
        org.mockito.asm.ByteVector byteVector10 = byteVector8.putLong(100L);
        byte[] byteArray14 = new byte[] { (byte) 0, (byte) 10, (byte) 1 };
        org.mockito.asm.ByteVector byteVector17 = byteVector8.putByteArray(byteArray14, 0, 0);
        org.mockito.asm.ByteVector byteVector20 = byteVector1.putByteArray(byteArray14, 1, (int) (short) 0);
        org.mockito.asm.ByteVector byteVector22 = byteVector1.putLong((long) (byte) 100);
        java.lang.Class<?> wildcardClass23 = byteVector1.getClass();
        org.junit.Assert.assertNotNull(byteVector4);
        org.junit.Assert.assertNotNull(byteVector6);
        org.junit.Assert.assertNotNull(byteVector8);
        org.junit.Assert.assertNotNull(byteVector10);
        org.junit.Assert.assertNotNull(byteArray14);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray14), "[0, 10, 1]");
        org.junit.Assert.assertNotNull(byteVector17);
        org.junit.Assert.assertNotNull(byteVector20);
        org.junit.Assert.assertNotNull(byteVector22);
        org.junit.Assert.assertNotNull(wildcardClass23);
    }

    @Test
    public void test0221() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0221");
        org.mockito.asm.ByteVector byteVector0 = new org.mockito.asm.ByteVector();
        org.mockito.asm.ByteVector byteVector2 = byteVector0.putUTF8("hi!");
        org.mockito.asm.ByteVector byteVector4 = byteVector2.putLong((long) (byte) 10);
        org.mockito.asm.ByteVector byteVector6 = byteVector4.putUTF8("hi!");
        org.mockito.asm.ByteVector byteVector8 = byteVector4.putLong((long) (short) -1);
        org.mockito.asm.ByteVector byteVector10 = byteVector8.putInt(10);
        org.mockito.asm.ByteVector byteVector12 = byteVector8.putByte((int) (short) 1);
        org.mockito.asm.ByteVector byteVector14 = byteVector12.putShort((int) (short) 100);
        org.mockito.asm.ByteVector byteVector16 = byteVector14.putByte((int) ' ');
        org.mockito.asm.ByteVector byteVector18 = byteVector14.putInt((int) (byte) 10);
        org.mockito.asm.ByteVector byteVector20 = byteVector14.putUTF8("hi!");
        org.mockito.asm.ByteVector byteVector22 = byteVector20.putByte((int) (byte) 10);
        org.mockito.asm.ByteVector byteVector23 = new org.mockito.asm.ByteVector();
        org.mockito.asm.ByteVector byteVector25 = byteVector23.putUTF8("hi!");
        org.mockito.asm.ByteVector byteVector27 = byteVector25.putLong((long) (byte) 10);
        org.mockito.asm.ByteVector byteVector29 = byteVector27.putUTF8("hi!");
        org.mockito.asm.ByteVector byteVector31 = byteVector27.putLong((-1L));
        org.mockito.asm.ByteVector byteVector33 = new org.mockito.asm.ByteVector((int) (short) 0);
        org.mockito.asm.ByteVector byteVector34 = new org.mockito.asm.ByteVector();
        org.mockito.asm.ByteVector byteVector36 = byteVector34.putUTF8("hi!");
        org.mockito.asm.ByteVector byteVector38 = byteVector34.putInt(0);
        org.mockito.asm.ByteVector byteVector40 = byteVector38.putInt((int) ' ');
        org.mockito.asm.ByteVector byteVector42 = byteVector40.putLong(100L);
        byte[] byteArray46 = new byte[] { (byte) 0, (byte) 10, (byte) 1 };
        org.mockito.asm.ByteVector byteVector49 = byteVector40.putByteArray(byteArray46, 0, 0);
        org.mockito.asm.ByteVector byteVector52 = byteVector33.putByteArray(byteArray46, 1, (int) (short) 0);
        org.mockito.asm.ByteVector byteVector55 = byteVector31.putByteArray(byteArray46, 0, (int) (byte) 1);
        // The following exception was thrown during execution in test generation
        try {
            org.mockito.asm.ByteVector byteVector58 = byteVector22.putByteArray(byteArray46, (int) ' ', (int) (short) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteVector2);
        org.junit.Assert.assertNotNull(byteVector4);
        org.junit.Assert.assertNotNull(byteVector6);
        org.junit.Assert.assertNotNull(byteVector8);
        org.junit.Assert.assertNotNull(byteVector10);
        org.junit.Assert.assertNotNull(byteVector12);
        org.junit.Assert.assertNotNull(byteVector14);
        org.junit.Assert.assertNotNull(byteVector16);
        org.junit.Assert.assertNotNull(byteVector18);
        org.junit.Assert.assertNotNull(byteVector20);
        org.junit.Assert.assertNotNull(byteVector22);
        org.junit.Assert.assertNotNull(byteVector25);
        org.junit.Assert.assertNotNull(byteVector27);
        org.junit.Assert.assertNotNull(byteVector29);
        org.junit.Assert.assertNotNull(byteVector31);
        org.junit.Assert.assertNotNull(byteVector36);
        org.junit.Assert.assertNotNull(byteVector38);
        org.junit.Assert.assertNotNull(byteVector40);
        org.junit.Assert.assertNotNull(byteVector42);
        org.junit.Assert.assertNotNull(byteArray46);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray46), "[0, 10, 1]");
        org.junit.Assert.assertNotNull(byteVector49);
        org.junit.Assert.assertNotNull(byteVector52);
        org.junit.Assert.assertNotNull(byteVector55);
    }

    @Test
    public void test0222() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0222");
        org.mockito.asm.ByteVector byteVector0 = new org.mockito.asm.ByteVector();
        org.mockito.asm.ByteVector byteVector2 = byteVector0.putUTF8("hi!");
        org.mockito.asm.ByteVector byteVector4 = byteVector0.putInt(0);
        org.mockito.asm.ByteVector byteVector6 = byteVector4.putInt((int) ' ');
        org.mockito.asm.ByteVector byteVector8 = byteVector6.putLong((long) (short) 10);
        org.mockito.asm.ByteVector byteVector10 = byteVector6.putInt((int) '4');
        org.mockito.asm.ByteVector byteVector11 = new org.mockito.asm.ByteVector();
        org.mockito.asm.ByteVector byteVector13 = byteVector11.putUTF8("hi!");
        org.mockito.asm.ByteVector byteVector15 = byteVector13.putByte(100);
        org.mockito.asm.ByteVector byteVector17 = byteVector13.putShort((int) 'a');
        org.mockito.asm.ByteVector byteVector19 = byteVector17.putShort((int) (short) 0);
        org.mockito.asm.ByteVector byteVector20 = new org.mockito.asm.ByteVector();
        org.mockito.asm.ByteVector byteVector22 = byteVector20.putUTF8("hi!");
        org.mockito.asm.ByteVector byteVector24 = byteVector22.putInt(0);
        org.mockito.asm.ByteVector byteVector26 = byteVector22.putByte((int) (byte) 10);
        org.mockito.asm.ByteVector byteVector28 = byteVector26.putLong((-1L));
        org.mockito.asm.ByteVector byteVector30 = byteVector26.putInt((int) (byte) 100);
        org.mockito.asm.ByteVector byteVector31 = new org.mockito.asm.ByteVector();
        org.mockito.asm.ByteVector byteVector33 = byteVector31.putUTF8("hi!");
        org.mockito.asm.ByteVector byteVector35 = byteVector31.putInt(0);
        org.mockito.asm.ByteVector byteVector37 = byteVector35.putInt((int) ' ');
        org.mockito.asm.ByteVector byteVector39 = byteVector37.putLong(100L);
        byte[] byteArray43 = new byte[] { (byte) 0, (byte) 10, (byte) 1 };
        org.mockito.asm.ByteVector byteVector46 = byteVector37.putByteArray(byteArray43, 0, 0);
        org.mockito.asm.ByteVector byteVector49 = byteVector26.putByteArray(byteArray43, (int) (byte) 1, 0);
        org.mockito.asm.ByteVector byteVector52 = byteVector17.putByteArray(byteArray43, (int) (byte) 1, (int) (short) 1);
        // The following exception was thrown during execution in test generation
        try {
            org.mockito.asm.ByteVector byteVector55 = byteVector6.putByteArray(byteArray43, (int) '4', (int) (short) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteVector2);
        org.junit.Assert.assertNotNull(byteVector4);
        org.junit.Assert.assertNotNull(byteVector6);
        org.junit.Assert.assertNotNull(byteVector8);
        org.junit.Assert.assertNotNull(byteVector10);
        org.junit.Assert.assertNotNull(byteVector13);
        org.junit.Assert.assertNotNull(byteVector15);
        org.junit.Assert.assertNotNull(byteVector17);
        org.junit.Assert.assertNotNull(byteVector19);
        org.junit.Assert.assertNotNull(byteVector22);
        org.junit.Assert.assertNotNull(byteVector24);
        org.junit.Assert.assertNotNull(byteVector26);
        org.junit.Assert.assertNotNull(byteVector28);
        org.junit.Assert.assertNotNull(byteVector30);
        org.junit.Assert.assertNotNull(byteVector33);
        org.junit.Assert.assertNotNull(byteVector35);
        org.junit.Assert.assertNotNull(byteVector37);
        org.junit.Assert.assertNotNull(byteVector39);
        org.junit.Assert.assertNotNull(byteArray43);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray43), "[0, 10, 1]");
        org.junit.Assert.assertNotNull(byteVector46);
        org.junit.Assert.assertNotNull(byteVector49);
        org.junit.Assert.assertNotNull(byteVector52);
    }

    @Test
    public void test0223() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0223");
        org.mockito.asm.ByteVector byteVector0 = new org.mockito.asm.ByteVector();
        org.mockito.asm.ByteVector byteVector2 = byteVector0.putUTF8("hi!");
        org.mockito.asm.ByteVector byteVector4 = byteVector2.putByte(100);
        org.mockito.asm.ByteVector byteVector6 = byteVector2.putLong((long) 10);
        org.mockito.asm.ByteVector byteVector7 = new org.mockito.asm.ByteVector();
        org.mockito.asm.ByteVector byteVector9 = byteVector7.putUTF8("hi!");
        org.mockito.asm.ByteVector byteVector11 = byteVector7.putLong((long) ' ');
        org.mockito.asm.ByteVector byteVector13 = byteVector11.putByte((int) 'a');
        org.mockito.asm.ByteVector byteVector15 = byteVector11.putByte((int) (short) -1);
        org.mockito.asm.ByteVector byteVector17 = byteVector11.putLong(0L);
        org.mockito.asm.ByteVector byteVector19 = byteVector11.putUTF8("hi!");
        org.mockito.asm.ByteVector byteVector21 = byteVector19.putUTF8("");
        org.mockito.asm.ByteVector byteVector23 = byteVector21.putLong((long) (byte) 10);
        org.mockito.asm.ByteVector byteVector25 = byteVector21.putLong((long) (short) 100);
        byte[] byteArray30 = new byte[] { (byte) 1, (byte) 0, (byte) 0, (byte) -1 };
        org.mockito.asm.ByteVector byteVector33 = byteVector21.putByteArray(byteArray30, 0, 0);
        // The following exception was thrown during execution in test generation
        try {
            org.mockito.asm.ByteVector byteVector36 = byteVector2.putByteArray(byteArray30, 0, 100);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteVector2);
        org.junit.Assert.assertNotNull(byteVector4);
        org.junit.Assert.assertNotNull(byteVector6);
        org.junit.Assert.assertNotNull(byteVector9);
        org.junit.Assert.assertNotNull(byteVector11);
        org.junit.Assert.assertNotNull(byteVector13);
        org.junit.Assert.assertNotNull(byteVector15);
        org.junit.Assert.assertNotNull(byteVector17);
        org.junit.Assert.assertNotNull(byteVector19);
        org.junit.Assert.assertNotNull(byteVector21);
        org.junit.Assert.assertNotNull(byteVector23);
        org.junit.Assert.assertNotNull(byteVector25);
        org.junit.Assert.assertNotNull(byteArray30);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray30), "[1, 0, 0, -1]");
        org.junit.Assert.assertNotNull(byteVector33);
    }

    @Test
    public void test0224() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0224");
        org.mockito.asm.ByteVector byteVector0 = new org.mockito.asm.ByteVector();
        org.mockito.asm.ByteVector byteVector2 = byteVector0.putUTF8("hi!");
        org.mockito.asm.ByteVector byteVector4 = byteVector2.putInt(0);
        org.mockito.asm.ByteVector byteVector6 = byteVector4.putShort((int) '4');
        org.mockito.asm.ByteVector byteVector8 = byteVector6.putByte(100);
        org.mockito.asm.ByteVector byteVector10 = byteVector6.putInt((int) (byte) 10);
        org.mockito.asm.ByteVector byteVector12 = byteVector10.putLong((long) (byte) 10);
        org.junit.Assert.assertNotNull(byteVector2);
        org.junit.Assert.assertNotNull(byteVector4);
        org.junit.Assert.assertNotNull(byteVector6);
        org.junit.Assert.assertNotNull(byteVector8);
        org.junit.Assert.assertNotNull(byteVector10);
        org.junit.Assert.assertNotNull(byteVector12);
    }

    @Test
    public void test0225() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0225");
        org.mockito.asm.ByteVector byteVector1 = new org.mockito.asm.ByteVector((int) (byte) 10);
        org.mockito.asm.ByteVector byteVector3 = byteVector1.putByte((int) '4');
        org.mockito.asm.ByteVector byteVector5 = byteVector1.putLong(0L);
        org.mockito.asm.ByteVector byteVector7 = byteVector1.putByte((int) (byte) 100);
        org.mockito.asm.ByteVector byteVector9 = byteVector1.putLong((long) ' ');
        java.lang.Class<?> wildcardClass10 = byteVector9.getClass();
        org.junit.Assert.assertNotNull(byteVector3);
        org.junit.Assert.assertNotNull(byteVector5);
        org.junit.Assert.assertNotNull(byteVector7);
        org.junit.Assert.assertNotNull(byteVector9);
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test0226() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0226");
        org.mockito.asm.ByteVector byteVector0 = new org.mockito.asm.ByteVector();
        org.mockito.asm.ByteVector byteVector2 = byteVector0.putUTF8("hi!");
        org.mockito.asm.ByteVector byteVector4 = byteVector2.putInt(0);
        org.mockito.asm.ByteVector byteVector6 = byteVector4.putShort((int) '4');
        org.mockito.asm.ByteVector byteVector8 = byteVector6.putByte(100);
        org.mockito.asm.ByteVector byteVector10 = byteVector6.putInt((int) (byte) 10);
        org.mockito.asm.ByteVector byteVector12 = byteVector6.putInt((int) (byte) -1);
        org.mockito.asm.ByteVector byteVector14 = byteVector12.putLong((long) '4');
        java.lang.Class<?> wildcardClass15 = byteVector12.getClass();
        org.junit.Assert.assertNotNull(byteVector2);
        org.junit.Assert.assertNotNull(byteVector4);
        org.junit.Assert.assertNotNull(byteVector6);
        org.junit.Assert.assertNotNull(byteVector8);
        org.junit.Assert.assertNotNull(byteVector10);
        org.junit.Assert.assertNotNull(byteVector12);
        org.junit.Assert.assertNotNull(byteVector14);
        org.junit.Assert.assertNotNull(wildcardClass15);
    }

    @Test
    public void test0227() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0227");
        org.mockito.asm.ByteVector byteVector0 = new org.mockito.asm.ByteVector();
        org.mockito.asm.ByteVector byteVector2 = byteVector0.putUTF8("hi!");
        org.mockito.asm.ByteVector byteVector4 = byteVector0.putInt(0);
        org.mockito.asm.ByteVector byteVector6 = byteVector0.putShort((int) '4');
        org.mockito.asm.ByteVector byteVector8 = byteVector0.putByte(100);
        org.mockito.asm.ByteVector byteVector10 = byteVector8.putInt((int) (byte) 10);
        org.mockito.asm.ByteVector byteVector12 = byteVector8.putShort((int) (short) 100);
        org.mockito.asm.ByteVector byteVector14 = byteVector8.putInt((int) '#');
        org.mockito.asm.ByteVector byteVector16 = byteVector14.putUTF8("hi!");
        java.lang.Class<?> wildcardClass17 = byteVector14.getClass();
        org.junit.Assert.assertNotNull(byteVector2);
        org.junit.Assert.assertNotNull(byteVector4);
        org.junit.Assert.assertNotNull(byteVector6);
        org.junit.Assert.assertNotNull(byteVector8);
        org.junit.Assert.assertNotNull(byteVector10);
        org.junit.Assert.assertNotNull(byteVector12);
        org.junit.Assert.assertNotNull(byteVector14);
        org.junit.Assert.assertNotNull(byteVector16);
        org.junit.Assert.assertNotNull(wildcardClass17);
    }

    @Test
    public void test0228() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0228");
        org.mockito.asm.ByteVector byteVector1 = new org.mockito.asm.ByteVector((int) '#');
        org.mockito.asm.ByteVector byteVector3 = byteVector1.putLong(100L);
        org.mockito.asm.ByteVector byteVector5 = byteVector1.putUTF8("");
        org.mockito.asm.ByteVector byteVector7 = byteVector5.putInt((int) (byte) 10);
        org.mockito.asm.ByteVector byteVector9 = byteVector5.putUTF8("");
        org.junit.Assert.assertNotNull(byteVector3);
        org.junit.Assert.assertNotNull(byteVector5);
        org.junit.Assert.assertNotNull(byteVector7);
        org.junit.Assert.assertNotNull(byteVector9);
    }

    @Test
    public void test0229() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0229");
        org.mockito.asm.ByteVector byteVector0 = new org.mockito.asm.ByteVector();
        org.mockito.asm.ByteVector byteVector2 = byteVector0.putUTF8("hi!");
        org.mockito.asm.ByteVector byteVector4 = byteVector0.putLong((long) ' ');
        org.mockito.asm.ByteVector byteVector6 = byteVector4.putByte((int) 'a');
        org.mockito.asm.ByteVector byteVector8 = byteVector4.putByte((int) (short) -1);
        org.mockito.asm.ByteVector byteVector10 = byteVector4.putLong(0L);
        org.mockito.asm.ByteVector byteVector12 = byteVector4.putUTF8("hi!");
        org.mockito.asm.ByteVector byteVector14 = byteVector12.putLong((-1L));
        org.mockito.asm.ByteVector byteVector16 = byteVector14.putLong((long) (short) 100);
        org.junit.Assert.assertNotNull(byteVector2);
        org.junit.Assert.assertNotNull(byteVector4);
        org.junit.Assert.assertNotNull(byteVector6);
        org.junit.Assert.assertNotNull(byteVector8);
        org.junit.Assert.assertNotNull(byteVector10);
        org.junit.Assert.assertNotNull(byteVector12);
        org.junit.Assert.assertNotNull(byteVector14);
        org.junit.Assert.assertNotNull(byteVector16);
    }

    @Test
    public void test0230() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0230");
        org.mockito.asm.ByteVector byteVector0 = new org.mockito.asm.ByteVector();
        org.mockito.asm.ByteVector byteVector2 = byteVector0.putUTF8("hi!");
        org.mockito.asm.ByteVector byteVector4 = byteVector0.putInt(0);
        org.mockito.asm.ByteVector byteVector6 = byteVector0.putShort(10);
        org.mockito.asm.ByteVector byteVector8 = byteVector6.putLong((long) '4');
        java.lang.Class<?> wildcardClass9 = byteVector6.getClass();
        org.junit.Assert.assertNotNull(byteVector2);
        org.junit.Assert.assertNotNull(byteVector4);
        org.junit.Assert.assertNotNull(byteVector6);
        org.junit.Assert.assertNotNull(byteVector8);
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test0231() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0231");
        org.mockito.asm.ByteVector byteVector1 = new org.mockito.asm.ByteVector((int) '#');
        org.mockito.asm.ByteVector byteVector3 = byteVector1.putInt(100);
        org.mockito.asm.ByteVector byteVector5 = byteVector3.putByte((-1));
        org.mockito.asm.ByteVector byteVector7 = byteVector5.putInt((int) 'a');
        java.lang.Class<?> wildcardClass8 = byteVector7.getClass();
        org.junit.Assert.assertNotNull(byteVector3);
        org.junit.Assert.assertNotNull(byteVector5);
        org.junit.Assert.assertNotNull(byteVector7);
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test0232() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0232");
        org.mockito.asm.ByteVector byteVector0 = new org.mockito.asm.ByteVector();
        org.mockito.asm.ByteVector byteVector2 = byteVector0.putUTF8("hi!");
        org.mockito.asm.ByteVector byteVector4 = byteVector0.putShort((int) (short) -1);
        org.mockito.asm.ByteVector byteVector6 = byteVector0.putByte((int) ' ');
        org.mockito.asm.ByteVector byteVector8 = byteVector6.putUTF8("");
        org.mockito.asm.ByteVector byteVector10 = byteVector6.putShort((int) '#');
        org.mockito.asm.ByteVector byteVector12 = byteVector6.putUTF8("");
        org.mockito.asm.ByteVector byteVector14 = new org.mockito.asm.ByteVector((int) (short) 0);
        org.mockito.asm.ByteVector byteVector15 = new org.mockito.asm.ByteVector();
        org.mockito.asm.ByteVector byteVector17 = byteVector15.putUTF8("hi!");
        org.mockito.asm.ByteVector byteVector19 = byteVector15.putInt(0);
        org.mockito.asm.ByteVector byteVector21 = byteVector19.putInt((int) ' ');
        org.mockito.asm.ByteVector byteVector23 = byteVector21.putLong(100L);
        byte[] byteArray27 = new byte[] { (byte) 0, (byte) 10, (byte) 1 };
        org.mockito.asm.ByteVector byteVector30 = byteVector21.putByteArray(byteArray27, 0, 0);
        org.mockito.asm.ByteVector byteVector33 = byteVector14.putByteArray(byteArray27, 1, (int) (short) 0);
        // The following exception was thrown during execution in test generation
        try {
            org.mockito.asm.ByteVector byteVector36 = byteVector6.putByteArray(byteArray27, (int) '#', (int) (byte) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteVector2);
        org.junit.Assert.assertNotNull(byteVector4);
        org.junit.Assert.assertNotNull(byteVector6);
        org.junit.Assert.assertNotNull(byteVector8);
        org.junit.Assert.assertNotNull(byteVector10);
        org.junit.Assert.assertNotNull(byteVector12);
        org.junit.Assert.assertNotNull(byteVector17);
        org.junit.Assert.assertNotNull(byteVector19);
        org.junit.Assert.assertNotNull(byteVector21);
        org.junit.Assert.assertNotNull(byteVector23);
        org.junit.Assert.assertNotNull(byteArray27);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray27), "[0, 10, 1]");
        org.junit.Assert.assertNotNull(byteVector30);
        org.junit.Assert.assertNotNull(byteVector33);
    }

    @Test
    public void test0233() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0233");
        org.mockito.asm.ByteVector byteVector0 = new org.mockito.asm.ByteVector();
        org.mockito.asm.ByteVector byteVector2 = byteVector0.putUTF8("hi!");
        org.mockito.asm.ByteVector byteVector4 = byteVector2.putLong((long) (byte) 10);
        org.mockito.asm.ByteVector byteVector6 = byteVector4.putUTF8("hi!");
        org.mockito.asm.ByteVector byteVector8 = byteVector4.putLong((long) (short) -1);
        org.mockito.asm.ByteVector byteVector10 = byteVector8.putInt(10);
        org.mockito.asm.ByteVector byteVector12 = byteVector8.putByte((int) (short) 1);
        org.mockito.asm.ByteVector byteVector14 = byteVector12.putShort((int) (short) 100);
        org.mockito.asm.ByteVector byteVector16 = byteVector14.putByte((int) ' ');
        org.mockito.asm.ByteVector byteVector18 = byteVector14.putInt((int) (byte) 10);
        org.mockito.asm.ByteVector byteVector20 = byteVector14.putShort((int) '4');
        org.mockito.asm.ByteVector byteVector22 = byteVector20.putUTF8("");
        org.mockito.asm.ByteVector byteVector23 = new org.mockito.asm.ByteVector();
        org.mockito.asm.ByteVector byteVector25 = byteVector23.putUTF8("hi!");
        org.mockito.asm.ByteVector byteVector27 = byteVector25.putInt(0);
        org.mockito.asm.ByteVector byteVector29 = byteVector25.putByte((int) (byte) 10);
        org.mockito.asm.ByteVector byteVector31 = byteVector29.putLong((-1L));
        org.mockito.asm.ByteVector byteVector33 = byteVector29.putInt((int) (byte) 100);
        org.mockito.asm.ByteVector byteVector34 = new org.mockito.asm.ByteVector();
        org.mockito.asm.ByteVector byteVector36 = byteVector34.putUTF8("hi!");
        org.mockito.asm.ByteVector byteVector38 = byteVector34.putInt(0);
        org.mockito.asm.ByteVector byteVector40 = byteVector38.putInt((int) ' ');
        org.mockito.asm.ByteVector byteVector42 = byteVector40.putLong(100L);
        byte[] byteArray46 = new byte[] { (byte) 0, (byte) 10, (byte) 1 };
        org.mockito.asm.ByteVector byteVector49 = byteVector40.putByteArray(byteArray46, 0, 0);
        org.mockito.asm.ByteVector byteVector52 = byteVector29.putByteArray(byteArray46, (int) (byte) 1, 0);
        // The following exception was thrown during execution in test generation
        try {
            org.mockito.asm.ByteVector byteVector55 = byteVector22.putByteArray(byteArray46, (int) (short) 0, (int) (short) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteVector2);
        org.junit.Assert.assertNotNull(byteVector4);
        org.junit.Assert.assertNotNull(byteVector6);
        org.junit.Assert.assertNotNull(byteVector8);
        org.junit.Assert.assertNotNull(byteVector10);
        org.junit.Assert.assertNotNull(byteVector12);
        org.junit.Assert.assertNotNull(byteVector14);
        org.junit.Assert.assertNotNull(byteVector16);
        org.junit.Assert.assertNotNull(byteVector18);
        org.junit.Assert.assertNotNull(byteVector20);
        org.junit.Assert.assertNotNull(byteVector22);
        org.junit.Assert.assertNotNull(byteVector25);
        org.junit.Assert.assertNotNull(byteVector27);
        org.junit.Assert.assertNotNull(byteVector29);
        org.junit.Assert.assertNotNull(byteVector31);
        org.junit.Assert.assertNotNull(byteVector33);
        org.junit.Assert.assertNotNull(byteVector36);
        org.junit.Assert.assertNotNull(byteVector38);
        org.junit.Assert.assertNotNull(byteVector40);
        org.junit.Assert.assertNotNull(byteVector42);
        org.junit.Assert.assertNotNull(byteArray46);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray46), "[0, 10, 1]");
        org.junit.Assert.assertNotNull(byteVector49);
        org.junit.Assert.assertNotNull(byteVector52);
    }

    @Test
    public void test0234() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0234");
        org.mockito.asm.ByteVector byteVector0 = new org.mockito.asm.ByteVector();
        org.mockito.asm.ByteVector byteVector2 = byteVector0.putUTF8("hi!");
        org.mockito.asm.ByteVector byteVector4 = byteVector0.putLong((long) ' ');
        org.mockito.asm.ByteVector byteVector6 = byteVector4.putByte((int) 'a');
        org.mockito.asm.ByteVector byteVector8 = byteVector4.putByte((int) (short) -1);
        org.mockito.asm.ByteVector byteVector10 = byteVector4.putLong(0L);
        org.mockito.asm.ByteVector byteVector12 = byteVector10.putByte(0);
        org.mockito.asm.ByteVector byteVector14 = byteVector12.putLong(1L);
        org.mockito.asm.ByteVector byteVector16 = byteVector14.putShort((int) 'a');
        org.mockito.asm.ByteVector byteVector18 = byteVector14.putUTF8("hi!");
        org.junit.Assert.assertNotNull(byteVector2);
        org.junit.Assert.assertNotNull(byteVector4);
        org.junit.Assert.assertNotNull(byteVector6);
        org.junit.Assert.assertNotNull(byteVector8);
        org.junit.Assert.assertNotNull(byteVector10);
        org.junit.Assert.assertNotNull(byteVector12);
        org.junit.Assert.assertNotNull(byteVector14);
        org.junit.Assert.assertNotNull(byteVector16);
        org.junit.Assert.assertNotNull(byteVector18);
    }

    @Test
    public void test0235() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0235");
        org.mockito.asm.ByteVector byteVector0 = new org.mockito.asm.ByteVector();
        org.mockito.asm.ByteVector byteVector2 = byteVector0.putUTF8("hi!");
        org.mockito.asm.ByteVector byteVector4 = byteVector2.putLong((long) (byte) 10);
        org.mockito.asm.ByteVector byteVector6 = byteVector4.putUTF8("hi!");
        org.mockito.asm.ByteVector byteVector8 = byteVector4.putLong((long) (short) -1);
        org.mockito.asm.ByteVector byteVector10 = byteVector8.putInt(10);
        org.mockito.asm.ByteVector byteVector12 = byteVector8.putByte((int) (short) 1);
        org.mockito.asm.ByteVector byteVector14 = byteVector12.putShort((int) (short) 100);
        org.mockito.asm.ByteVector byteVector16 = byteVector14.putByte((int) ' ');
        org.mockito.asm.ByteVector byteVector18 = byteVector14.putInt((int) (byte) 10);
        org.mockito.asm.ByteVector byteVector20 = byteVector14.putShort((int) '4');
        org.mockito.asm.ByteVector byteVector22 = byteVector20.putUTF8("");
        org.mockito.asm.ByteVector byteVector23 = new org.mockito.asm.ByteVector();
        org.mockito.asm.ByteVector byteVector25 = byteVector23.putUTF8("hi!");
        org.mockito.asm.ByteVector byteVector27 = byteVector23.putInt(0);
        org.mockito.asm.ByteVector byteVector29 = byteVector23.putShort((int) '4');
        org.mockito.asm.ByteVector byteVector31 = byteVector23.putByte(100);
        org.mockito.asm.ByteVector byteVector33 = byteVector31.putInt((int) (byte) 10);
        org.mockito.asm.ByteVector byteVector35 = byteVector31.putInt((int) (byte) 10);
        org.mockito.asm.ByteVector byteVector37 = byteVector35.putByte(100);
        org.mockito.asm.ByteVector byteVector38 = new org.mockito.asm.ByteVector();
        org.mockito.asm.ByteVector byteVector40 = byteVector38.putUTF8("hi!");
        org.mockito.asm.ByteVector byteVector42 = byteVector38.putInt(0);
        org.mockito.asm.ByteVector byteVector44 = byteVector42.putInt((int) ' ');
        org.mockito.asm.ByteVector byteVector46 = byteVector44.putLong(100L);
        byte[] byteArray50 = new byte[] { (byte) 0, (byte) 10, (byte) 1 };
        org.mockito.asm.ByteVector byteVector53 = byteVector44.putByteArray(byteArray50, 0, 0);
        org.mockito.asm.ByteVector byteVector56 = byteVector37.putByteArray(byteArray50, (int) (byte) 1, (int) (byte) 0);
        // The following exception was thrown during execution in test generation
        try {
            org.mockito.asm.ByteVector byteVector59 = byteVector22.putByteArray(byteArray50, 0, (int) '#');
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteVector2);
        org.junit.Assert.assertNotNull(byteVector4);
        org.junit.Assert.assertNotNull(byteVector6);
        org.junit.Assert.assertNotNull(byteVector8);
        org.junit.Assert.assertNotNull(byteVector10);
        org.junit.Assert.assertNotNull(byteVector12);
        org.junit.Assert.assertNotNull(byteVector14);
        org.junit.Assert.assertNotNull(byteVector16);
        org.junit.Assert.assertNotNull(byteVector18);
        org.junit.Assert.assertNotNull(byteVector20);
        org.junit.Assert.assertNotNull(byteVector22);
        org.junit.Assert.assertNotNull(byteVector25);
        org.junit.Assert.assertNotNull(byteVector27);
        org.junit.Assert.assertNotNull(byteVector29);
        org.junit.Assert.assertNotNull(byteVector31);
        org.junit.Assert.assertNotNull(byteVector33);
        org.junit.Assert.assertNotNull(byteVector35);
        org.junit.Assert.assertNotNull(byteVector37);
        org.junit.Assert.assertNotNull(byteVector40);
        org.junit.Assert.assertNotNull(byteVector42);
        org.junit.Assert.assertNotNull(byteVector44);
        org.junit.Assert.assertNotNull(byteVector46);
        org.junit.Assert.assertNotNull(byteArray50);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray50), "[0, 10, 1]");
        org.junit.Assert.assertNotNull(byteVector53);
        org.junit.Assert.assertNotNull(byteVector56);
    }

    @Test
    public void test0236() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0236");
        org.mockito.asm.ByteVector byteVector0 = new org.mockito.asm.ByteVector();
        org.mockito.asm.ByteVector byteVector2 = byteVector0.putUTF8("hi!");
        org.mockito.asm.ByteVector byteVector4 = byteVector2.putInt(0);
        org.mockito.asm.ByteVector byteVector6 = byteVector4.putShort(1);
        org.mockito.asm.ByteVector byteVector8 = byteVector6.putByte((int) (byte) 1);
        java.lang.Class<?> wildcardClass9 = byteVector6.getClass();
        org.junit.Assert.assertNotNull(byteVector2);
        org.junit.Assert.assertNotNull(byteVector4);
        org.junit.Assert.assertNotNull(byteVector6);
        org.junit.Assert.assertNotNull(byteVector8);
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test0237() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0237");
        org.mockito.asm.ByteVector byteVector0 = new org.mockito.asm.ByteVector();
        org.mockito.asm.ByteVector byteVector2 = byteVector0.putUTF8("hi!");
        org.mockito.asm.ByteVector byteVector4 = byteVector2.putLong((long) (byte) 10);
        org.mockito.asm.ByteVector byteVector6 = byteVector4.putUTF8("hi!");
        org.mockito.asm.ByteVector byteVector8 = byteVector4.putLong((-1L));
        org.mockito.asm.ByteVector byteVector10 = new org.mockito.asm.ByteVector((int) (short) 0);
        org.mockito.asm.ByteVector byteVector11 = new org.mockito.asm.ByteVector();
        org.mockito.asm.ByteVector byteVector13 = byteVector11.putUTF8("hi!");
        org.mockito.asm.ByteVector byteVector15 = byteVector11.putInt(0);
        org.mockito.asm.ByteVector byteVector17 = byteVector15.putInt((int) ' ');
        org.mockito.asm.ByteVector byteVector19 = byteVector17.putLong(100L);
        byte[] byteArray23 = new byte[] { (byte) 0, (byte) 10, (byte) 1 };
        org.mockito.asm.ByteVector byteVector26 = byteVector17.putByteArray(byteArray23, 0, 0);
        org.mockito.asm.ByteVector byteVector29 = byteVector10.putByteArray(byteArray23, 1, (int) (short) 0);
        org.mockito.asm.ByteVector byteVector32 = byteVector8.putByteArray(byteArray23, 0, (int) (byte) 1);
        org.mockito.asm.ByteVector byteVector34 = byteVector8.putByte((int) (short) 10);
        org.junit.Assert.assertNotNull(byteVector2);
        org.junit.Assert.assertNotNull(byteVector4);
        org.junit.Assert.assertNotNull(byteVector6);
        org.junit.Assert.assertNotNull(byteVector8);
        org.junit.Assert.assertNotNull(byteVector13);
        org.junit.Assert.assertNotNull(byteVector15);
        org.junit.Assert.assertNotNull(byteVector17);
        org.junit.Assert.assertNotNull(byteVector19);
        org.junit.Assert.assertNotNull(byteArray23);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray23), "[0, 10, 1]");
        org.junit.Assert.assertNotNull(byteVector26);
        org.junit.Assert.assertNotNull(byteVector29);
        org.junit.Assert.assertNotNull(byteVector32);
        org.junit.Assert.assertNotNull(byteVector34);
    }

    @Test
    public void test0238() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0238");
        org.mockito.asm.ByteVector byteVector0 = new org.mockito.asm.ByteVector();
        org.mockito.asm.ByteVector byteVector2 = byteVector0.putUTF8("hi!");
        org.mockito.asm.ByteVector byteVector4 = byteVector0.putLong((long) ' ');
        org.mockito.asm.ByteVector byteVector6 = byteVector4.putByte((int) 'a');
        org.mockito.asm.ByteVector byteVector8 = byteVector4.putByte(100);
        java.lang.Class<?> wildcardClass9 = byteVector4.getClass();
        org.junit.Assert.assertNotNull(byteVector2);
        org.junit.Assert.assertNotNull(byteVector4);
        org.junit.Assert.assertNotNull(byteVector6);
        org.junit.Assert.assertNotNull(byteVector8);
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test0239() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0239");
        org.mockito.asm.ByteVector byteVector0 = new org.mockito.asm.ByteVector();
        org.mockito.asm.ByteVector byteVector2 = byteVector0.putUTF8("hi!");
        org.mockito.asm.ByteVector byteVector4 = byteVector0.putShort((int) (short) -1);
        org.mockito.asm.ByteVector byteVector6 = byteVector0.putLong(0L);
        org.mockito.asm.ByteVector byteVector8 = byteVector0.putShort((int) (byte) -1);
        org.mockito.asm.ByteVector byteVector10 = byteVector0.putShort((int) (short) -1);
        org.mockito.asm.ByteVector byteVector12 = byteVector0.putInt(1);
        org.mockito.asm.ByteVector byteVector13 = new org.mockito.asm.ByteVector();
        org.mockito.asm.ByteVector byteVector15 = byteVector13.putUTF8("hi!");
        org.mockito.asm.ByteVector byteVector17 = byteVector13.putLong((long) ' ');
        org.mockito.asm.ByteVector byteVector19 = byteVector17.putByte((int) 'a');
        org.mockito.asm.ByteVector byteVector21 = byteVector17.putByte((int) (short) -1);
        org.mockito.asm.ByteVector byteVector23 = byteVector17.putLong(0L);
        org.mockito.asm.ByteVector byteVector25 = byteVector23.putInt((int) (short) -1);
        org.mockito.asm.ByteVector byteVector27 = byteVector25.putByte(100);
        org.mockito.asm.ByteVector byteVector29 = byteVector27.putUTF8("hi!");
        org.mockito.asm.ByteVector byteVector31 = byteVector27.putLong((long) (short) 0);
        org.mockito.asm.ByteVector byteVector32 = new org.mockito.asm.ByteVector();
        org.mockito.asm.ByteVector byteVector34 = byteVector32.putUTF8("hi!");
        org.mockito.asm.ByteVector byteVector36 = byteVector32.putLong((long) ' ');
        org.mockito.asm.ByteVector byteVector38 = byteVector36.putByte((int) 'a');
        org.mockito.asm.ByteVector byteVector40 = byteVector36.putByte((int) (short) -1);
        org.mockito.asm.ByteVector byteVector42 = byteVector36.putLong(0L);
        org.mockito.asm.ByteVector byteVector44 = byteVector36.putUTF8("hi!");
        org.mockito.asm.ByteVector byteVector46 = byteVector44.putUTF8("");
        org.mockito.asm.ByteVector byteVector48 = byteVector44.putInt((int) (byte) 10);
        org.mockito.asm.ByteVector byteVector50 = byteVector44.putByte(0);
        org.mockito.asm.ByteVector byteVector51 = new org.mockito.asm.ByteVector();
        org.mockito.asm.ByteVector byteVector53 = byteVector51.putUTF8("hi!");
        org.mockito.asm.ByteVector byteVector55 = byteVector51.putInt(0);
        org.mockito.asm.ByteVector byteVector57 = byteVector55.putInt((int) ' ');
        org.mockito.asm.ByteVector byteVector59 = byteVector57.putLong(100L);
        byte[] byteArray63 = new byte[] { (byte) 0, (byte) 10, (byte) 1 };
        org.mockito.asm.ByteVector byteVector66 = byteVector57.putByteArray(byteArray63, 0, 0);
        org.mockito.asm.ByteVector byteVector69 = byteVector50.putByteArray(byteArray63, (int) (short) 1, 0);
        org.mockito.asm.ByteVector byteVector72 = byteVector31.putByteArray(byteArray63, (int) (byte) 0, (int) (byte) 1);
        // The following exception was thrown during execution in test generation
        try {
            org.mockito.asm.ByteVector byteVector75 = byteVector0.putByteArray(byteArray63, (int) (short) 100, (int) '4');
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteVector2);
        org.junit.Assert.assertNotNull(byteVector4);
        org.junit.Assert.assertNotNull(byteVector6);
        org.junit.Assert.assertNotNull(byteVector8);
        org.junit.Assert.assertNotNull(byteVector10);
        org.junit.Assert.assertNotNull(byteVector12);
        org.junit.Assert.assertNotNull(byteVector15);
        org.junit.Assert.assertNotNull(byteVector17);
        org.junit.Assert.assertNotNull(byteVector19);
        org.junit.Assert.assertNotNull(byteVector21);
        org.junit.Assert.assertNotNull(byteVector23);
        org.junit.Assert.assertNotNull(byteVector25);
        org.junit.Assert.assertNotNull(byteVector27);
        org.junit.Assert.assertNotNull(byteVector29);
        org.junit.Assert.assertNotNull(byteVector31);
        org.junit.Assert.assertNotNull(byteVector34);
        org.junit.Assert.assertNotNull(byteVector36);
        org.junit.Assert.assertNotNull(byteVector38);
        org.junit.Assert.assertNotNull(byteVector40);
        org.junit.Assert.assertNotNull(byteVector42);
        org.junit.Assert.assertNotNull(byteVector44);
        org.junit.Assert.assertNotNull(byteVector46);
        org.junit.Assert.assertNotNull(byteVector48);
        org.junit.Assert.assertNotNull(byteVector50);
        org.junit.Assert.assertNotNull(byteVector53);
        org.junit.Assert.assertNotNull(byteVector55);
        org.junit.Assert.assertNotNull(byteVector57);
        org.junit.Assert.assertNotNull(byteVector59);
        org.junit.Assert.assertNotNull(byteArray63);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray63), "[0, 10, 1]");
        org.junit.Assert.assertNotNull(byteVector66);
        org.junit.Assert.assertNotNull(byteVector69);
        org.junit.Assert.assertNotNull(byteVector72);
    }

    @Test
    public void test0240() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0240");
        org.mockito.asm.ByteVector byteVector0 = new org.mockito.asm.ByteVector();
        org.mockito.asm.ByteVector byteVector2 = byteVector0.putUTF8("hi!");
        org.mockito.asm.ByteVector byteVector4 = byteVector0.putInt(0);
        org.mockito.asm.ByteVector byteVector6 = byteVector4.putInt((int) ' ');
        org.mockito.asm.ByteVector byteVector8 = byteVector6.putLong((long) (short) 10);
        org.mockito.asm.ByteVector byteVector10 = byteVector8.putUTF8("hi!");
        java.lang.Class<?> wildcardClass11 = byteVector8.getClass();
        org.junit.Assert.assertNotNull(byteVector2);
        org.junit.Assert.assertNotNull(byteVector4);
        org.junit.Assert.assertNotNull(byteVector6);
        org.junit.Assert.assertNotNull(byteVector8);
        org.junit.Assert.assertNotNull(byteVector10);
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test0241() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0241");
        org.mockito.asm.ByteVector byteVector0 = new org.mockito.asm.ByteVector();
        org.mockito.asm.ByteVector byteVector2 = byteVector0.putUTF8("hi!");
        org.mockito.asm.ByteVector byteVector4 = byteVector0.putShort((int) (short) -1);
        org.mockito.asm.ByteVector byteVector6 = byteVector0.putLong(0L);
        org.mockito.asm.ByteVector byteVector8 = byteVector0.putShort((int) (byte) -1);
        org.mockito.asm.ByteVector byteVector10 = byteVector0.putInt((int) (short) 100);
        java.lang.Class<?> wildcardClass11 = byteVector10.getClass();
        org.junit.Assert.assertNotNull(byteVector2);
        org.junit.Assert.assertNotNull(byteVector4);
        org.junit.Assert.assertNotNull(byteVector6);
        org.junit.Assert.assertNotNull(byteVector8);
        org.junit.Assert.assertNotNull(byteVector10);
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test0242() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0242");
        org.mockito.asm.ByteVector byteVector0 = new org.mockito.asm.ByteVector();
        org.mockito.asm.ByteVector byteVector2 = byteVector0.putUTF8("hi!");
        org.mockito.asm.ByteVector byteVector4 = byteVector2.putInt(0);
        org.mockito.asm.ByteVector byteVector6 = byteVector4.putShort((int) '4');
        org.mockito.asm.ByteVector byteVector8 = byteVector4.putShort((int) '4');
        java.lang.Class<?> wildcardClass9 = byteVector4.getClass();
        org.junit.Assert.assertNotNull(byteVector2);
        org.junit.Assert.assertNotNull(byteVector4);
        org.junit.Assert.assertNotNull(byteVector6);
        org.junit.Assert.assertNotNull(byteVector8);
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test0243() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0243");
        org.mockito.asm.ByteVector byteVector0 = new org.mockito.asm.ByteVector();
        org.mockito.asm.ByteVector byteVector2 = byteVector0.putUTF8("hi!");
        org.mockito.asm.ByteVector byteVector4 = byteVector0.putLong((long) ' ');
        org.mockito.asm.ByteVector byteVector6 = byteVector4.putByte((int) 'a');
        org.mockito.asm.ByteVector byteVector8 = byteVector4.putByte((int) (short) -1);
        org.mockito.asm.ByteVector byteVector10 = byteVector4.putLong(0L);
        org.mockito.asm.ByteVector byteVector12 = byteVector10.putByte(0);
        org.mockito.asm.ByteVector byteVector14 = byteVector12.putByte(100);
        org.mockito.asm.ByteVector byteVector16 = byteVector12.putByte((int) '4');
        org.mockito.asm.ByteVector byteVector18 = byteVector16.putUTF8("");
        org.mockito.asm.ByteVector byteVector19 = new org.mockito.asm.ByteVector();
        org.mockito.asm.ByteVector byteVector21 = byteVector19.putUTF8("hi!");
        org.mockito.asm.ByteVector byteVector23 = byteVector21.putLong((long) (byte) 10);
        org.mockito.asm.ByteVector byteVector25 = byteVector23.putUTF8("hi!");
        org.mockito.asm.ByteVector byteVector27 = byteVector23.putLong((-1L));
        org.mockito.asm.ByteVector byteVector29 = new org.mockito.asm.ByteVector((int) (short) 0);
        org.mockito.asm.ByteVector byteVector30 = new org.mockito.asm.ByteVector();
        org.mockito.asm.ByteVector byteVector32 = byteVector30.putUTF8("hi!");
        org.mockito.asm.ByteVector byteVector34 = byteVector30.putInt(0);
        org.mockito.asm.ByteVector byteVector36 = byteVector34.putInt((int) ' ');
        org.mockito.asm.ByteVector byteVector38 = byteVector36.putLong(100L);
        byte[] byteArray42 = new byte[] { (byte) 0, (byte) 10, (byte) 1 };
        org.mockito.asm.ByteVector byteVector45 = byteVector36.putByteArray(byteArray42, 0, 0);
        org.mockito.asm.ByteVector byteVector48 = byteVector29.putByteArray(byteArray42, 1, (int) (short) 0);
        org.mockito.asm.ByteVector byteVector51 = byteVector27.putByteArray(byteArray42, 0, (int) (byte) 1);
        // The following exception was thrown during execution in test generation
        try {
            org.mockito.asm.ByteVector byteVector54 = byteVector18.putByteArray(byteArray42, 0, (int) (byte) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteVector2);
        org.junit.Assert.assertNotNull(byteVector4);
        org.junit.Assert.assertNotNull(byteVector6);
        org.junit.Assert.assertNotNull(byteVector8);
        org.junit.Assert.assertNotNull(byteVector10);
        org.junit.Assert.assertNotNull(byteVector12);
        org.junit.Assert.assertNotNull(byteVector14);
        org.junit.Assert.assertNotNull(byteVector16);
        org.junit.Assert.assertNotNull(byteVector18);
        org.junit.Assert.assertNotNull(byteVector21);
        org.junit.Assert.assertNotNull(byteVector23);
        org.junit.Assert.assertNotNull(byteVector25);
        org.junit.Assert.assertNotNull(byteVector27);
        org.junit.Assert.assertNotNull(byteVector32);
        org.junit.Assert.assertNotNull(byteVector34);
        org.junit.Assert.assertNotNull(byteVector36);
        org.junit.Assert.assertNotNull(byteVector38);
        org.junit.Assert.assertNotNull(byteArray42);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray42), "[0, 10, 1]");
        org.junit.Assert.assertNotNull(byteVector45);
        org.junit.Assert.assertNotNull(byteVector48);
        org.junit.Assert.assertNotNull(byteVector51);
    }

    @Test
    public void test0244() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0244");
        org.mockito.asm.ByteVector byteVector1 = new org.mockito.asm.ByteVector((int) '#');
        org.mockito.asm.ByteVector byteVector3 = byteVector1.putInt(100);
        org.mockito.asm.ByteVector byteVector5 = byteVector1.putInt((int) (byte) 1);
        org.mockito.asm.ByteVector byteVector7 = byteVector5.putLong(10L);
        org.mockito.asm.ByteVector byteVector9 = byteVector7.putByte((int) 'a');
        org.mockito.asm.ByteVector byteVector11 = byteVector7.putByte((int) (short) -1);
        org.junit.Assert.assertNotNull(byteVector3);
        org.junit.Assert.assertNotNull(byteVector5);
        org.junit.Assert.assertNotNull(byteVector7);
        org.junit.Assert.assertNotNull(byteVector9);
        org.junit.Assert.assertNotNull(byteVector11);
    }

    @Test
    public void test0245() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0245");
        org.mockito.asm.ByteVector byteVector0 = new org.mockito.asm.ByteVector();
        org.mockito.asm.ByteVector byteVector2 = byteVector0.putUTF8("hi!");
        org.mockito.asm.ByteVector byteVector4 = byteVector0.putShort((int) (short) -1);
        org.mockito.asm.ByteVector byteVector6 = byteVector0.putInt((int) (byte) 10);
        org.mockito.asm.ByteVector byteVector8 = byteVector6.putUTF8("hi!");
        org.mockito.asm.ByteVector byteVector10 = byteVector8.putShort(0);
        org.mockito.asm.ByteVector byteVector12 = byteVector10.putByte(1);
        org.junit.Assert.assertNotNull(byteVector2);
        org.junit.Assert.assertNotNull(byteVector4);
        org.junit.Assert.assertNotNull(byteVector6);
        org.junit.Assert.assertNotNull(byteVector8);
        org.junit.Assert.assertNotNull(byteVector10);
        org.junit.Assert.assertNotNull(byteVector12);
    }

    @Test
    public void test0246() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0246");
        org.mockito.asm.ByteVector byteVector0 = new org.mockito.asm.ByteVector();
        org.mockito.asm.ByteVector byteVector2 = byteVector0.putUTF8("hi!");
        org.mockito.asm.ByteVector byteVector4 = byteVector2.putInt(0);
        org.mockito.asm.ByteVector byteVector6 = byteVector2.putByte((int) (byte) 10);
        org.mockito.asm.ByteVector byteVector8 = byteVector6.putLong(0L);
        org.mockito.asm.ByteVector byteVector10 = byteVector8.putShort((int) 'a');
        java.lang.Class<?> wildcardClass11 = byteVector8.getClass();
        org.junit.Assert.assertNotNull(byteVector2);
        org.junit.Assert.assertNotNull(byteVector4);
        org.junit.Assert.assertNotNull(byteVector6);
        org.junit.Assert.assertNotNull(byteVector8);
        org.junit.Assert.assertNotNull(byteVector10);
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test0247() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0247");
        org.mockito.asm.ByteVector byteVector1 = new org.mockito.asm.ByteVector((int) (byte) 100);
        org.mockito.asm.ByteVector byteVector3 = byteVector1.putInt(0);
        org.mockito.asm.ByteVector byteVector4 = new org.mockito.asm.ByteVector();
        org.mockito.asm.ByteVector byteVector6 = byteVector4.putUTF8("hi!");
        org.mockito.asm.ByteVector byteVector8 = byteVector4.putLong((long) ' ');
        org.mockito.asm.ByteVector byteVector10 = byteVector8.putByte((int) 'a');
        org.mockito.asm.ByteVector byteVector12 = byteVector8.putByte((int) (short) -1);
        org.mockito.asm.ByteVector byteVector14 = byteVector8.putLong(0L);
        org.mockito.asm.ByteVector byteVector16 = byteVector14.putByte(0);
        org.mockito.asm.ByteVector byteVector18 = byteVector16.putLong(1L);
        org.mockito.asm.ByteVector byteVector20 = byteVector18.putShort((int) 'a');
        org.mockito.asm.ByteVector byteVector22 = byteVector18.putLong((long) 10);
        org.mockito.asm.ByteVector byteVector24 = byteVector18.putUTF8("");
        org.mockito.asm.ByteVector byteVector25 = new org.mockito.asm.ByteVector();
        org.mockito.asm.ByteVector byteVector27 = byteVector25.putUTF8("hi!");
        org.mockito.asm.ByteVector byteVector29 = byteVector27.putLong((long) (byte) 10);
        org.mockito.asm.ByteVector byteVector31 = byteVector29.putUTF8("hi!");
        org.mockito.asm.ByteVector byteVector33 = byteVector29.putLong((long) (short) -1);
        org.mockito.asm.ByteVector byteVector35 = byteVector33.putInt(10);
        org.mockito.asm.ByteVector byteVector37 = byteVector33.putByte((int) (short) 1);
        org.mockito.asm.ByteVector byteVector39 = byteVector33.putInt((int) (short) -1);
        org.mockito.asm.ByteVector byteVector41 = byteVector33.putUTF8("hi!");
        org.mockito.asm.ByteVector byteVector42 = new org.mockito.asm.ByteVector();
        org.mockito.asm.ByteVector byteVector44 = byteVector42.putUTF8("hi!");
        org.mockito.asm.ByteVector byteVector46 = byteVector42.putLong((long) ' ');
        org.mockito.asm.ByteVector byteVector48 = byteVector46.putByte((int) 'a');
        org.mockito.asm.ByteVector byteVector50 = byteVector46.putByte((int) (short) -1);
        org.mockito.asm.ByteVector byteVector52 = byteVector46.putLong(0L);
        org.mockito.asm.ByteVector byteVector54 = byteVector46.putUTF8("hi!");
        org.mockito.asm.ByteVector byteVector56 = byteVector54.putUTF8("");
        org.mockito.asm.ByteVector byteVector58 = byteVector56.putLong((long) (byte) 10);
        org.mockito.asm.ByteVector byteVector60 = byteVector56.putLong((long) (short) 100);
        byte[] byteArray65 = new byte[] { (byte) 1, (byte) 0, (byte) 0, (byte) -1 };
        org.mockito.asm.ByteVector byteVector68 = byteVector56.putByteArray(byteArray65, 0, 0);
        org.mockito.asm.ByteVector byteVector71 = byteVector41.putByteArray(byteArray65, (int) (byte) 0, (int) (short) 1);
        org.mockito.asm.ByteVector byteVector74 = byteVector18.putByteArray(byteArray65, (int) (short) 0, (int) (short) 0);
        // The following exception was thrown during execution in test generation
        try {
            org.mockito.asm.ByteVector byteVector77 = byteVector3.putByteArray(byteArray65, (int) 'a', 10);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteVector3);
        org.junit.Assert.assertNotNull(byteVector6);
        org.junit.Assert.assertNotNull(byteVector8);
        org.junit.Assert.assertNotNull(byteVector10);
        org.junit.Assert.assertNotNull(byteVector12);
        org.junit.Assert.assertNotNull(byteVector14);
        org.junit.Assert.assertNotNull(byteVector16);
        org.junit.Assert.assertNotNull(byteVector18);
        org.junit.Assert.assertNotNull(byteVector20);
        org.junit.Assert.assertNotNull(byteVector22);
        org.junit.Assert.assertNotNull(byteVector24);
        org.junit.Assert.assertNotNull(byteVector27);
        org.junit.Assert.assertNotNull(byteVector29);
        org.junit.Assert.assertNotNull(byteVector31);
        org.junit.Assert.assertNotNull(byteVector33);
        org.junit.Assert.assertNotNull(byteVector35);
        org.junit.Assert.assertNotNull(byteVector37);
        org.junit.Assert.assertNotNull(byteVector39);
        org.junit.Assert.assertNotNull(byteVector41);
        org.junit.Assert.assertNotNull(byteVector44);
        org.junit.Assert.assertNotNull(byteVector46);
        org.junit.Assert.assertNotNull(byteVector48);
        org.junit.Assert.assertNotNull(byteVector50);
        org.junit.Assert.assertNotNull(byteVector52);
        org.junit.Assert.assertNotNull(byteVector54);
        org.junit.Assert.assertNotNull(byteVector56);
        org.junit.Assert.assertNotNull(byteVector58);
        org.junit.Assert.assertNotNull(byteVector60);
        org.junit.Assert.assertNotNull(byteArray65);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray65), "[1, 0, 0, -1]");
        org.junit.Assert.assertNotNull(byteVector68);
        org.junit.Assert.assertNotNull(byteVector71);
        org.junit.Assert.assertNotNull(byteVector74);
    }

    @Test
    public void test0248() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0248");
        org.mockito.asm.ByteVector byteVector0 = new org.mockito.asm.ByteVector();
        org.mockito.asm.ByteVector byteVector2 = byteVector0.putUTF8("hi!");
        org.mockito.asm.ByteVector byteVector4 = byteVector0.putInt(0);
        org.mockito.asm.ByteVector byteVector6 = byteVector4.putInt((int) ' ');
        org.mockito.asm.ByteVector byteVector8 = byteVector6.putLong(100L);
        byte[] byteArray12 = new byte[] { (byte) 0, (byte) 10, (byte) 1 };
        org.mockito.asm.ByteVector byteVector15 = byteVector6.putByteArray(byteArray12, 0, 0);
        org.mockito.asm.ByteVector byteVector16 = new org.mockito.asm.ByteVector();
        org.mockito.asm.ByteVector byteVector18 = byteVector16.putUTF8("hi!");
        org.mockito.asm.ByteVector byteVector20 = byteVector16.putLong((long) ' ');
        org.mockito.asm.ByteVector byteVector22 = byteVector20.putByte((int) 'a');
        org.mockito.asm.ByteVector byteVector24 = byteVector20.putByte((int) (short) -1);
        org.mockito.asm.ByteVector byteVector26 = byteVector20.putLong(0L);
        org.mockito.asm.ByteVector byteVector28 = byteVector20.putUTF8("hi!");
        org.mockito.asm.ByteVector byteVector30 = byteVector28.putUTF8("");
        org.mockito.asm.ByteVector byteVector32 = byteVector28.putInt((int) (byte) 10);
        org.mockito.asm.ByteVector byteVector34 = byteVector28.putByte(0);
        org.mockito.asm.ByteVector byteVector35 = new org.mockito.asm.ByteVector();
        org.mockito.asm.ByteVector byteVector37 = byteVector35.putUTF8("hi!");
        org.mockito.asm.ByteVector byteVector39 = byteVector35.putInt(0);
        org.mockito.asm.ByteVector byteVector41 = byteVector39.putInt((int) ' ');
        org.mockito.asm.ByteVector byteVector43 = byteVector41.putLong(100L);
        byte[] byteArray47 = new byte[] { (byte) 0, (byte) 10, (byte) 1 };
        org.mockito.asm.ByteVector byteVector50 = byteVector41.putByteArray(byteArray47, 0, 0);
        org.mockito.asm.ByteVector byteVector53 = byteVector34.putByteArray(byteArray47, (int) (short) 1, 0);
        // The following exception was thrown during execution in test generation
        try {
            org.mockito.asm.ByteVector byteVector56 = byteVector15.putByteArray(byteArray47, (int) (short) 1, 10);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteVector2);
        org.junit.Assert.assertNotNull(byteVector4);
        org.junit.Assert.assertNotNull(byteVector6);
        org.junit.Assert.assertNotNull(byteVector8);
        org.junit.Assert.assertNotNull(byteArray12);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray12), "[0, 10, 1]");
        org.junit.Assert.assertNotNull(byteVector15);
        org.junit.Assert.assertNotNull(byteVector18);
        org.junit.Assert.assertNotNull(byteVector20);
        org.junit.Assert.assertNotNull(byteVector22);
        org.junit.Assert.assertNotNull(byteVector24);
        org.junit.Assert.assertNotNull(byteVector26);
        org.junit.Assert.assertNotNull(byteVector28);
        org.junit.Assert.assertNotNull(byteVector30);
        org.junit.Assert.assertNotNull(byteVector32);
        org.junit.Assert.assertNotNull(byteVector34);
        org.junit.Assert.assertNotNull(byteVector37);
        org.junit.Assert.assertNotNull(byteVector39);
        org.junit.Assert.assertNotNull(byteVector41);
        org.junit.Assert.assertNotNull(byteVector43);
        org.junit.Assert.assertNotNull(byteArray47);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray47), "[0, 10, 1]");
        org.junit.Assert.assertNotNull(byteVector50);
        org.junit.Assert.assertNotNull(byteVector53);
    }

    @Test
    public void test0249() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0249");
        org.mockito.asm.ByteVector byteVector0 = new org.mockito.asm.ByteVector();
        org.mockito.asm.ByteVector byteVector2 = byteVector0.putUTF8("hi!");
        org.mockito.asm.ByteVector byteVector4 = byteVector2.putInt((int) (byte) 10);
        org.mockito.asm.ByteVector byteVector6 = byteVector4.putUTF8("");
        org.mockito.asm.ByteVector byteVector8 = byteVector6.putUTF8("hi!");
        org.mockito.asm.ByteVector byteVector10 = byteVector6.putInt((int) (byte) 1);
        java.lang.Class<?> wildcardClass11 = byteVector10.getClass();
        org.junit.Assert.assertNotNull(byteVector2);
        org.junit.Assert.assertNotNull(byteVector4);
        org.junit.Assert.assertNotNull(byteVector6);
        org.junit.Assert.assertNotNull(byteVector8);
        org.junit.Assert.assertNotNull(byteVector10);
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test0250() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0250");
        org.mockito.asm.ByteVector byteVector0 = new org.mockito.asm.ByteVector();
        org.mockito.asm.ByteVector byteVector2 = byteVector0.putUTF8("hi!");
        org.mockito.asm.ByteVector byteVector4 = byteVector0.putShort((int) (short) -1);
        org.mockito.asm.ByteVector byteVector6 = byteVector0.putInt((int) (byte) 10);
        org.mockito.asm.ByteVector byteVector8 = byteVector6.putUTF8("hi!");
        org.mockito.asm.ByteVector byteVector10 = byteVector6.putLong((long) '#');
        org.mockito.asm.ByteVector byteVector12 = byteVector6.putShort((int) '#');
        org.mockito.asm.ByteVector byteVector14 = byteVector12.putShort(0);
        org.mockito.asm.ByteVector byteVector16 = byteVector14.putShort((int) (byte) 10);
        org.mockito.asm.ByteVector byteVector17 = new org.mockito.asm.ByteVector();
        org.mockito.asm.ByteVector byteVector19 = byteVector17.putUTF8("hi!");
        org.mockito.asm.ByteVector byteVector21 = byteVector19.putByte(100);
        org.mockito.asm.ByteVector byteVector23 = byteVector19.putShort((int) 'a');
        org.mockito.asm.ByteVector byteVector25 = byteVector23.putShort((int) (short) 0);
        org.mockito.asm.ByteVector byteVector26 = new org.mockito.asm.ByteVector();
        org.mockito.asm.ByteVector byteVector28 = byteVector26.putUTF8("hi!");
        org.mockito.asm.ByteVector byteVector30 = byteVector28.putInt(0);
        org.mockito.asm.ByteVector byteVector32 = byteVector28.putByte((int) (byte) 10);
        org.mockito.asm.ByteVector byteVector34 = byteVector32.putLong((-1L));
        org.mockito.asm.ByteVector byteVector36 = byteVector32.putInt((int) (byte) 100);
        org.mockito.asm.ByteVector byteVector37 = new org.mockito.asm.ByteVector();
        org.mockito.asm.ByteVector byteVector39 = byteVector37.putUTF8("hi!");
        org.mockito.asm.ByteVector byteVector41 = byteVector37.putInt(0);
        org.mockito.asm.ByteVector byteVector43 = byteVector41.putInt((int) ' ');
        org.mockito.asm.ByteVector byteVector45 = byteVector43.putLong(100L);
        byte[] byteArray49 = new byte[] { (byte) 0, (byte) 10, (byte) 1 };
        org.mockito.asm.ByteVector byteVector52 = byteVector43.putByteArray(byteArray49, 0, 0);
        org.mockito.asm.ByteVector byteVector55 = byteVector32.putByteArray(byteArray49, (int) (byte) 1, 0);
        org.mockito.asm.ByteVector byteVector58 = byteVector23.putByteArray(byteArray49, (int) (byte) 1, (int) (short) 1);
        // The following exception was thrown during execution in test generation
        try {
            org.mockito.asm.ByteVector byteVector61 = byteVector14.putByteArray(byteArray49, 100, (int) (byte) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteVector2);
        org.junit.Assert.assertNotNull(byteVector4);
        org.junit.Assert.assertNotNull(byteVector6);
        org.junit.Assert.assertNotNull(byteVector8);
        org.junit.Assert.assertNotNull(byteVector10);
        org.junit.Assert.assertNotNull(byteVector12);
        org.junit.Assert.assertNotNull(byteVector14);
        org.junit.Assert.assertNotNull(byteVector16);
        org.junit.Assert.assertNotNull(byteVector19);
        org.junit.Assert.assertNotNull(byteVector21);
        org.junit.Assert.assertNotNull(byteVector23);
        org.junit.Assert.assertNotNull(byteVector25);
        org.junit.Assert.assertNotNull(byteVector28);
        org.junit.Assert.assertNotNull(byteVector30);
        org.junit.Assert.assertNotNull(byteVector32);
        org.junit.Assert.assertNotNull(byteVector34);
        org.junit.Assert.assertNotNull(byteVector36);
        org.junit.Assert.assertNotNull(byteVector39);
        org.junit.Assert.assertNotNull(byteVector41);
        org.junit.Assert.assertNotNull(byteVector43);
        org.junit.Assert.assertNotNull(byteVector45);
        org.junit.Assert.assertNotNull(byteArray49);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray49), "[0, 10, 1]");
        org.junit.Assert.assertNotNull(byteVector52);
        org.junit.Assert.assertNotNull(byteVector55);
        org.junit.Assert.assertNotNull(byteVector58);
    }

    @Test
    public void test0251() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0251");
        org.mockito.asm.ByteVector byteVector0 = new org.mockito.asm.ByteVector();
        org.mockito.asm.ByteVector byteVector2 = byteVector0.putUTF8("hi!");
        org.mockito.asm.ByteVector byteVector4 = byteVector0.putInt((int) (short) 1);
        org.mockito.asm.ByteVector byteVector6 = byteVector0.putShort((int) (short) 0);
        java.lang.Class<?> wildcardClass7 = byteVector6.getClass();
        org.junit.Assert.assertNotNull(byteVector2);
        org.junit.Assert.assertNotNull(byteVector4);
        org.junit.Assert.assertNotNull(byteVector6);
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test0252() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0252");
        org.mockito.asm.ByteVector byteVector1 = new org.mockito.asm.ByteVector((int) '#');
        org.mockito.asm.ByteVector byteVector3 = byteVector1.putLong(100L);
        org.mockito.asm.ByteVector byteVector5 = byteVector3.putLong(1L);
        org.mockito.asm.ByteVector byteVector7 = byteVector5.putUTF8("hi!");
        org.mockito.asm.ByteVector byteVector9 = byteVector5.putUTF8("hi!");
        org.mockito.asm.ByteVector byteVector11 = byteVector9.putByte((int) (short) 0);
        java.lang.Class<?> wildcardClass12 = byteVector11.getClass();
        org.junit.Assert.assertNotNull(byteVector3);
        org.junit.Assert.assertNotNull(byteVector5);
        org.junit.Assert.assertNotNull(byteVector7);
        org.junit.Assert.assertNotNull(byteVector9);
        org.junit.Assert.assertNotNull(byteVector11);
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test0253() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0253");
        org.mockito.asm.ByteVector byteVector1 = new org.mockito.asm.ByteVector((int) '#');
        org.mockito.asm.ByteVector byteVector3 = byteVector1.putLong(100L);
        org.mockito.asm.ByteVector byteVector5 = byteVector1.putUTF8("");
        org.mockito.asm.ByteVector byteVector7 = byteVector1.putUTF8("hi!");
        org.mockito.asm.ByteVector byteVector9 = byteVector7.putLong((long) (short) 0);
        org.mockito.asm.ByteVector byteVector10 = new org.mockito.asm.ByteVector();
        org.mockito.asm.ByteVector byteVector12 = byteVector10.putUTF8("hi!");
        org.mockito.asm.ByteVector byteVector14 = byteVector10.putInt(0);
        org.mockito.asm.ByteVector byteVector16 = byteVector14.putInt((int) ' ');
        org.mockito.asm.ByteVector byteVector18 = byteVector16.putLong(100L);
        byte[] byteArray22 = new byte[] { (byte) 0, (byte) 10, (byte) 1 };
        org.mockito.asm.ByteVector byteVector25 = byteVector16.putByteArray(byteArray22, 0, 0);
        // The following exception was thrown during execution in test generation
        try {
            org.mockito.asm.ByteVector byteVector28 = byteVector7.putByteArray(byteArray22, 0, (int) (byte) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteVector3);
        org.junit.Assert.assertNotNull(byteVector5);
        org.junit.Assert.assertNotNull(byteVector7);
        org.junit.Assert.assertNotNull(byteVector9);
        org.junit.Assert.assertNotNull(byteVector12);
        org.junit.Assert.assertNotNull(byteVector14);
        org.junit.Assert.assertNotNull(byteVector16);
        org.junit.Assert.assertNotNull(byteVector18);
        org.junit.Assert.assertNotNull(byteArray22);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray22), "[0, 10, 1]");
        org.junit.Assert.assertNotNull(byteVector25);
    }

    @Test
    public void test0254() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0254");
        org.mockito.asm.ByteVector byteVector1 = new org.mockito.asm.ByteVector((int) (byte) 10);
        org.mockito.asm.ByteVector byteVector3 = byteVector1.putByte((int) '4');
        org.mockito.asm.ByteVector byteVector5 = byteVector1.putLong(0L);
        org.mockito.asm.ByteVector byteVector6 = new org.mockito.asm.ByteVector();
        org.mockito.asm.ByteVector byteVector8 = byteVector6.putUTF8("hi!");
        org.mockito.asm.ByteVector byteVector10 = byteVector6.putLong((long) ' ');
        org.mockito.asm.ByteVector byteVector12 = byteVector10.putByte((int) 'a');
        org.mockito.asm.ByteVector byteVector14 = byteVector10.putByte((int) (short) -1);
        org.mockito.asm.ByteVector byteVector16 = byteVector10.putLong(0L);
        org.mockito.asm.ByteVector byteVector18 = byteVector10.putUTF8("hi!");
        org.mockito.asm.ByteVector byteVector20 = byteVector18.putUTF8("");
        org.mockito.asm.ByteVector byteVector22 = byteVector20.putLong((long) (byte) 10);
        org.mockito.asm.ByteVector byteVector24 = byteVector20.putLong((long) (short) 100);
        byte[] byteArray29 = new byte[] { (byte) 1, (byte) 0, (byte) 0, (byte) -1 };
        org.mockito.asm.ByteVector byteVector32 = byteVector20.putByteArray(byteArray29, 0, 0);
        // The following exception was thrown during execution in test generation
        try {
            org.mockito.asm.ByteVector byteVector35 = byteVector5.putByteArray(byteArray29, (int) (byte) -1, (int) (short) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteVector3);
        org.junit.Assert.assertNotNull(byteVector5);
        org.junit.Assert.assertNotNull(byteVector8);
        org.junit.Assert.assertNotNull(byteVector10);
        org.junit.Assert.assertNotNull(byteVector12);
        org.junit.Assert.assertNotNull(byteVector14);
        org.junit.Assert.assertNotNull(byteVector16);
        org.junit.Assert.assertNotNull(byteVector18);
        org.junit.Assert.assertNotNull(byteVector20);
        org.junit.Assert.assertNotNull(byteVector22);
        org.junit.Assert.assertNotNull(byteVector24);
        org.junit.Assert.assertNotNull(byteArray29);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray29), "[1, 0, 0, -1]");
        org.junit.Assert.assertNotNull(byteVector32);
    }

    @Test
    public void test0255() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0255");
        org.mockito.asm.ByteVector byteVector1 = new org.mockito.asm.ByteVector((int) ' ');
        org.mockito.asm.ByteVector byteVector3 = byteVector1.putInt((int) '4');
        org.mockito.asm.ByteVector byteVector4 = new org.mockito.asm.ByteVector();
        org.mockito.asm.ByteVector byteVector6 = byteVector4.putUTF8("hi!");
        org.mockito.asm.ByteVector byteVector8 = byteVector4.putLong((long) ' ');
        org.mockito.asm.ByteVector byteVector10 = byteVector8.putByte((int) 'a');
        org.mockito.asm.ByteVector byteVector12 = byteVector8.putByte((int) (short) -1);
        org.mockito.asm.ByteVector byteVector14 = byteVector8.putLong(0L);
        org.mockito.asm.ByteVector byteVector16 = byteVector8.putUTF8("hi!");
        org.mockito.asm.ByteVector byteVector18 = byteVector16.putUTF8("");
        org.mockito.asm.ByteVector byteVector20 = byteVector16.putInt((int) (byte) 10);
        org.mockito.asm.ByteVector byteVector22 = byteVector20.putLong((long) (short) -1);
        org.mockito.asm.ByteVector byteVector24 = byteVector20.putByte(0);
        org.mockito.asm.ByteVector byteVector25 = new org.mockito.asm.ByteVector();
        org.mockito.asm.ByteVector byteVector27 = byteVector25.putUTF8("hi!");
        org.mockito.asm.ByteVector byteVector29 = byteVector27.putInt(0);
        org.mockito.asm.ByteVector byteVector31 = byteVector27.putByte((int) (byte) 10);
        org.mockito.asm.ByteVector byteVector33 = byteVector31.putLong((-1L));
        org.mockito.asm.ByteVector byteVector35 = byteVector31.putInt((int) (byte) 100);
        org.mockito.asm.ByteVector byteVector36 = new org.mockito.asm.ByteVector();
        org.mockito.asm.ByteVector byteVector38 = byteVector36.putUTF8("hi!");
        org.mockito.asm.ByteVector byteVector40 = byteVector36.putInt(0);
        org.mockito.asm.ByteVector byteVector42 = byteVector40.putInt((int) ' ');
        org.mockito.asm.ByteVector byteVector44 = byteVector42.putLong(100L);
        byte[] byteArray48 = new byte[] { (byte) 0, (byte) 10, (byte) 1 };
        org.mockito.asm.ByteVector byteVector51 = byteVector42.putByteArray(byteArray48, 0, 0);
        org.mockito.asm.ByteVector byteVector54 = byteVector31.putByteArray(byteArray48, (int) (byte) 1, 0);
        org.mockito.asm.ByteVector byteVector57 = byteVector24.putByteArray(byteArray48, 1, 0);
        // The following exception was thrown during execution in test generation
        try {
            org.mockito.asm.ByteVector byteVector60 = byteVector3.putByteArray(byteArray48, (int) ' ', (int) (byte) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteVector3);
        org.junit.Assert.assertNotNull(byteVector6);
        org.junit.Assert.assertNotNull(byteVector8);
        org.junit.Assert.assertNotNull(byteVector10);
        org.junit.Assert.assertNotNull(byteVector12);
        org.junit.Assert.assertNotNull(byteVector14);
        org.junit.Assert.assertNotNull(byteVector16);
        org.junit.Assert.assertNotNull(byteVector18);
        org.junit.Assert.assertNotNull(byteVector20);
        org.junit.Assert.assertNotNull(byteVector22);
        org.junit.Assert.assertNotNull(byteVector24);
        org.junit.Assert.assertNotNull(byteVector27);
        org.junit.Assert.assertNotNull(byteVector29);
        org.junit.Assert.assertNotNull(byteVector31);
        org.junit.Assert.assertNotNull(byteVector33);
        org.junit.Assert.assertNotNull(byteVector35);
        org.junit.Assert.assertNotNull(byteVector38);
        org.junit.Assert.assertNotNull(byteVector40);
        org.junit.Assert.assertNotNull(byteVector42);
        org.junit.Assert.assertNotNull(byteVector44);
        org.junit.Assert.assertNotNull(byteArray48);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray48), "[0, 10, 1]");
        org.junit.Assert.assertNotNull(byteVector51);
        org.junit.Assert.assertNotNull(byteVector54);
        org.junit.Assert.assertNotNull(byteVector57);
    }

    @Test
    public void test0256() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0256");
        org.mockito.asm.ByteVector byteVector0 = new org.mockito.asm.ByteVector();
        org.mockito.asm.ByteVector byteVector2 = byteVector0.putUTF8("hi!");
        org.mockito.asm.ByteVector byteVector4 = byteVector0.putLong((long) ' ');
        org.mockito.asm.ByteVector byteVector6 = byteVector4.putByte((int) 'a');
        org.mockito.asm.ByteVector byteVector8 = byteVector4.putByte((int) (short) -1);
        org.mockito.asm.ByteVector byteVector10 = byteVector4.putLong(0L);
        org.mockito.asm.ByteVector byteVector12 = byteVector4.putUTF8("hi!");
        org.mockito.asm.ByteVector byteVector14 = byteVector12.putUTF8("");
        org.mockito.asm.ByteVector byteVector16 = byteVector12.putInt((int) (byte) 10);
        org.mockito.asm.ByteVector byteVector18 = byteVector16.putLong((long) (short) -1);
        org.mockito.asm.ByteVector byteVector20 = byteVector18.putLong(0L);
        org.mockito.asm.ByteVector byteVector22 = byteVector20.putInt((int) ' ');
        org.junit.Assert.assertNotNull(byteVector2);
        org.junit.Assert.assertNotNull(byteVector4);
        org.junit.Assert.assertNotNull(byteVector6);
        org.junit.Assert.assertNotNull(byteVector8);
        org.junit.Assert.assertNotNull(byteVector10);
        org.junit.Assert.assertNotNull(byteVector12);
        org.junit.Assert.assertNotNull(byteVector14);
        org.junit.Assert.assertNotNull(byteVector16);
        org.junit.Assert.assertNotNull(byteVector18);
        org.junit.Assert.assertNotNull(byteVector20);
        org.junit.Assert.assertNotNull(byteVector22);
    }

    @Test
    public void test0257() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0257");
        org.mockito.asm.ByteVector byteVector0 = new org.mockito.asm.ByteVector();
        org.mockito.asm.ByteVector byteVector2 = byteVector0.putUTF8("hi!");
        org.mockito.asm.ByteVector byteVector4 = byteVector0.putLong((long) ' ');
        org.mockito.asm.ByteVector byteVector6 = byteVector4.putByte((int) 'a');
        org.mockito.asm.ByteVector byteVector8 = byteVector4.putByte((int) (short) -1);
        org.mockito.asm.ByteVector byteVector10 = byteVector4.putLong(0L);
        org.mockito.asm.ByteVector byteVector12 = byteVector10.putInt((int) (short) -1);
        org.mockito.asm.ByteVector byteVector14 = byteVector12.putByte(100);
        org.mockito.asm.ByteVector byteVector16 = byteVector14.putUTF8("hi!");
        org.mockito.asm.ByteVector byteVector18 = byteVector14.putLong((long) (short) 0);
        org.mockito.asm.ByteVector byteVector20 = byteVector18.putShort(0);
        org.junit.Assert.assertNotNull(byteVector2);
        org.junit.Assert.assertNotNull(byteVector4);
        org.junit.Assert.assertNotNull(byteVector6);
        org.junit.Assert.assertNotNull(byteVector8);
        org.junit.Assert.assertNotNull(byteVector10);
        org.junit.Assert.assertNotNull(byteVector12);
        org.junit.Assert.assertNotNull(byteVector14);
        org.junit.Assert.assertNotNull(byteVector16);
        org.junit.Assert.assertNotNull(byteVector18);
        org.junit.Assert.assertNotNull(byteVector20);
    }

    @Test
    public void test0258() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0258");
        org.mockito.asm.ByteVector byteVector1 = new org.mockito.asm.ByteVector((int) '#');
        org.mockito.asm.ByteVector byteVector3 = byteVector1.putInt(100);
        org.mockito.asm.ByteVector byteVector5 = byteVector1.putInt(0);
        org.mockito.asm.ByteVector byteVector7 = byteVector5.putShort((int) (short) 0);
        org.mockito.asm.ByteVector byteVector9 = byteVector7.putByte((int) (short) 10);
        org.mockito.asm.ByteVector byteVector11 = byteVector9.putInt(10);
        java.lang.Class<?> wildcardClass12 = byteVector9.getClass();
        org.junit.Assert.assertNotNull(byteVector3);
        org.junit.Assert.assertNotNull(byteVector5);
        org.junit.Assert.assertNotNull(byteVector7);
        org.junit.Assert.assertNotNull(byteVector9);
        org.junit.Assert.assertNotNull(byteVector11);
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test0259() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0259");
        org.mockito.asm.ByteVector byteVector0 = new org.mockito.asm.ByteVector();
        org.mockito.asm.ByteVector byteVector2 = byteVector0.putUTF8("hi!");
        org.mockito.asm.ByteVector byteVector4 = byteVector0.putShort((int) (short) -1);
        org.mockito.asm.ByteVector byteVector6 = byteVector4.putUTF8("hi!");
        org.mockito.asm.ByteVector byteVector8 = byteVector6.putLong(0L);
        java.lang.Class<?> wildcardClass9 = byteVector8.getClass();
        org.junit.Assert.assertNotNull(byteVector2);
        org.junit.Assert.assertNotNull(byteVector4);
        org.junit.Assert.assertNotNull(byteVector6);
        org.junit.Assert.assertNotNull(byteVector8);
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test0260() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0260");
        org.mockito.asm.ByteVector byteVector0 = new org.mockito.asm.ByteVector();
        org.mockito.asm.ByteVector byteVector2 = byteVector0.putUTF8("hi!");
        org.mockito.asm.ByteVector byteVector4 = byteVector0.putInt(0);
        org.mockito.asm.ByteVector byteVector6 = byteVector0.putShort(10);
        org.mockito.asm.ByteVector byteVector8 = byteVector6.putLong((long) '4');
        org.mockito.asm.ByteVector byteVector10 = byteVector6.putShort((int) ' ');
        org.mockito.asm.ByteVector byteVector12 = byteVector6.putInt((int) (byte) -1);
        org.mockito.asm.ByteVector byteVector13 = new org.mockito.asm.ByteVector();
        org.mockito.asm.ByteVector byteVector15 = byteVector13.putUTF8("hi!");
        org.mockito.asm.ByteVector byteVector17 = byteVector15.putInt(0);
        org.mockito.asm.ByteVector byteVector19 = byteVector15.putByte((int) (byte) 10);
        org.mockito.asm.ByteVector byteVector21 = byteVector19.putLong((-1L));
        org.mockito.asm.ByteVector byteVector23 = byteVector19.putInt((int) (byte) 100);
        org.mockito.asm.ByteVector byteVector24 = new org.mockito.asm.ByteVector();
        org.mockito.asm.ByteVector byteVector26 = byteVector24.putUTF8("hi!");
        org.mockito.asm.ByteVector byteVector28 = byteVector24.putInt(0);
        org.mockito.asm.ByteVector byteVector30 = byteVector28.putInt((int) ' ');
        org.mockito.asm.ByteVector byteVector32 = byteVector30.putLong(100L);
        byte[] byteArray36 = new byte[] { (byte) 0, (byte) 10, (byte) 1 };
        org.mockito.asm.ByteVector byteVector39 = byteVector30.putByteArray(byteArray36, 0, 0);
        org.mockito.asm.ByteVector byteVector42 = byteVector19.putByteArray(byteArray36, (int) (byte) 1, 0);
        // The following exception was thrown during execution in test generation
        try {
            org.mockito.asm.ByteVector byteVector45 = byteVector12.putByteArray(byteArray36, (int) '4', (int) ' ');
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteVector2);
        org.junit.Assert.assertNotNull(byteVector4);
        org.junit.Assert.assertNotNull(byteVector6);
        org.junit.Assert.assertNotNull(byteVector8);
        org.junit.Assert.assertNotNull(byteVector10);
        org.junit.Assert.assertNotNull(byteVector12);
        org.junit.Assert.assertNotNull(byteVector15);
        org.junit.Assert.assertNotNull(byteVector17);
        org.junit.Assert.assertNotNull(byteVector19);
        org.junit.Assert.assertNotNull(byteVector21);
        org.junit.Assert.assertNotNull(byteVector23);
        org.junit.Assert.assertNotNull(byteVector26);
        org.junit.Assert.assertNotNull(byteVector28);
        org.junit.Assert.assertNotNull(byteVector30);
        org.junit.Assert.assertNotNull(byteVector32);
        org.junit.Assert.assertNotNull(byteArray36);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray36), "[0, 10, 1]");
        org.junit.Assert.assertNotNull(byteVector39);
        org.junit.Assert.assertNotNull(byteVector42);
    }

    @Test
    public void test0261() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0261");
        org.mockito.asm.ByteVector byteVector0 = new org.mockito.asm.ByteVector();
        org.mockito.asm.ByteVector byteVector2 = byteVector0.putUTF8("hi!");
        org.mockito.asm.ByteVector byteVector4 = byteVector0.putInt(0);
        org.mockito.asm.ByteVector byteVector6 = byteVector0.putShort((int) '4');
        org.mockito.asm.ByteVector byteVector8 = byteVector0.putByte(100);
        org.mockito.asm.ByteVector byteVector10 = byteVector8.putInt((int) (byte) 10);
        org.mockito.asm.ByteVector byteVector12 = byteVector10.putByte((int) (byte) 1);
        org.mockito.asm.ByteVector byteVector14 = byteVector10.putUTF8("hi!");
        org.mockito.asm.ByteVector byteVector16 = byteVector14.putByte((int) (byte) 0);
        org.mockito.asm.ByteVector byteVector17 = new org.mockito.asm.ByteVector();
        org.mockito.asm.ByteVector byteVector19 = byteVector17.putUTF8("hi!");
        org.mockito.asm.ByteVector byteVector21 = byteVector17.putLong((long) ' ');
        org.mockito.asm.ByteVector byteVector23 = byteVector21.putByte((int) 'a');
        org.mockito.asm.ByteVector byteVector25 = byteVector21.putByte((int) (short) -1);
        org.mockito.asm.ByteVector byteVector27 = byteVector21.putLong(0L);
        org.mockito.asm.ByteVector byteVector29 = byteVector21.putUTF8("hi!");
        org.mockito.asm.ByteVector byteVector31 = byteVector29.putUTF8("");
        org.mockito.asm.ByteVector byteVector33 = byteVector29.putInt((int) (byte) 10);
        org.mockito.asm.ByteVector byteVector35 = byteVector33.putLong((long) (short) -1);
        org.mockito.asm.ByteVector byteVector37 = byteVector33.putByte(0);
        org.mockito.asm.ByteVector byteVector38 = new org.mockito.asm.ByteVector();
        org.mockito.asm.ByteVector byteVector40 = byteVector38.putUTF8("hi!");
        org.mockito.asm.ByteVector byteVector42 = byteVector40.putInt(0);
        org.mockito.asm.ByteVector byteVector44 = byteVector40.putByte((int) (byte) 10);
        org.mockito.asm.ByteVector byteVector46 = byteVector44.putLong((-1L));
        org.mockito.asm.ByteVector byteVector48 = byteVector44.putInt((int) (byte) 100);
        org.mockito.asm.ByteVector byteVector49 = new org.mockito.asm.ByteVector();
        org.mockito.asm.ByteVector byteVector51 = byteVector49.putUTF8("hi!");
        org.mockito.asm.ByteVector byteVector53 = byteVector49.putInt(0);
        org.mockito.asm.ByteVector byteVector55 = byteVector53.putInt((int) ' ');
        org.mockito.asm.ByteVector byteVector57 = byteVector55.putLong(100L);
        byte[] byteArray61 = new byte[] { (byte) 0, (byte) 10, (byte) 1 };
        org.mockito.asm.ByteVector byteVector64 = byteVector55.putByteArray(byteArray61, 0, 0);
        org.mockito.asm.ByteVector byteVector67 = byteVector44.putByteArray(byteArray61, (int) (byte) 1, 0);
        org.mockito.asm.ByteVector byteVector70 = byteVector37.putByteArray(byteArray61, 1, 0);
        // The following exception was thrown during execution in test generation
        try {
            org.mockito.asm.ByteVector byteVector73 = byteVector14.putByteArray(byteArray61, (-1), 10);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteVector2);
        org.junit.Assert.assertNotNull(byteVector4);
        org.junit.Assert.assertNotNull(byteVector6);
        org.junit.Assert.assertNotNull(byteVector8);
        org.junit.Assert.assertNotNull(byteVector10);
        org.junit.Assert.assertNotNull(byteVector12);
        org.junit.Assert.assertNotNull(byteVector14);
        org.junit.Assert.assertNotNull(byteVector16);
        org.junit.Assert.assertNotNull(byteVector19);
        org.junit.Assert.assertNotNull(byteVector21);
        org.junit.Assert.assertNotNull(byteVector23);
        org.junit.Assert.assertNotNull(byteVector25);
        org.junit.Assert.assertNotNull(byteVector27);
        org.junit.Assert.assertNotNull(byteVector29);
        org.junit.Assert.assertNotNull(byteVector31);
        org.junit.Assert.assertNotNull(byteVector33);
        org.junit.Assert.assertNotNull(byteVector35);
        org.junit.Assert.assertNotNull(byteVector37);
        org.junit.Assert.assertNotNull(byteVector40);
        org.junit.Assert.assertNotNull(byteVector42);
        org.junit.Assert.assertNotNull(byteVector44);
        org.junit.Assert.assertNotNull(byteVector46);
        org.junit.Assert.assertNotNull(byteVector48);
        org.junit.Assert.assertNotNull(byteVector51);
        org.junit.Assert.assertNotNull(byteVector53);
        org.junit.Assert.assertNotNull(byteVector55);
        org.junit.Assert.assertNotNull(byteVector57);
        org.junit.Assert.assertNotNull(byteArray61);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray61), "[0, 10, 1]");
        org.junit.Assert.assertNotNull(byteVector64);
        org.junit.Assert.assertNotNull(byteVector67);
        org.junit.Assert.assertNotNull(byteVector70);
    }

    @Test
    public void test0262() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0262");
        org.mockito.asm.ByteVector byteVector0 = new org.mockito.asm.ByteVector();
        org.mockito.asm.ByteVector byteVector2 = byteVector0.putUTF8("hi!");
        org.mockito.asm.ByteVector byteVector4 = byteVector2.putInt(0);
        org.mockito.asm.ByteVector byteVector6 = byteVector4.putShort(1);
        org.mockito.asm.ByteVector byteVector8 = byteVector4.putShort(100);
        org.junit.Assert.assertNotNull(byteVector2);
        org.junit.Assert.assertNotNull(byteVector4);
        org.junit.Assert.assertNotNull(byteVector6);
        org.junit.Assert.assertNotNull(byteVector8);
    }

    @Test
    public void test0263() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0263");
        org.mockito.asm.ByteVector byteVector0 = new org.mockito.asm.ByteVector();
        org.mockito.asm.ByteVector byteVector2 = byteVector0.putUTF8("hi!");
        org.mockito.asm.ByteVector byteVector4 = byteVector0.putInt(0);
        org.mockito.asm.ByteVector byteVector6 = byteVector0.putShort(10);
        org.mockito.asm.ByteVector byteVector8 = byteVector0.putLong((long) '#');
        org.mockito.asm.ByteVector byteVector10 = byteVector0.putByte(10);
        org.mockito.asm.ByteVector byteVector11 = new org.mockito.asm.ByteVector();
        org.mockito.asm.ByteVector byteVector13 = byteVector11.putUTF8("hi!");
        org.mockito.asm.ByteVector byteVector15 = byteVector11.putLong((long) ' ');
        org.mockito.asm.ByteVector byteVector17 = byteVector15.putByte((int) 'a');
        org.mockito.asm.ByteVector byteVector19 = byteVector15.putByte((int) (short) -1);
        org.mockito.asm.ByteVector byteVector21 = byteVector15.putLong(0L);
        org.mockito.asm.ByteVector byteVector23 = byteVector15.putUTF8("hi!");
        org.mockito.asm.ByteVector byteVector25 = byteVector23.putUTF8("");
        org.mockito.asm.ByteVector byteVector27 = byteVector25.putLong((long) (byte) 10);
        org.mockito.asm.ByteVector byteVector29 = byteVector25.putLong((long) (short) 100);
        byte[] byteArray34 = new byte[] { (byte) 1, (byte) 0, (byte) 0, (byte) -1 };
        org.mockito.asm.ByteVector byteVector37 = byteVector25.putByteArray(byteArray34, 0, 0);
        // The following exception was thrown during execution in test generation
        try {
            org.mockito.asm.ByteVector byteVector40 = byteVector0.putByteArray(byteArray34, 100, (int) '4');
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteVector2);
        org.junit.Assert.assertNotNull(byteVector4);
        org.junit.Assert.assertNotNull(byteVector6);
        org.junit.Assert.assertNotNull(byteVector8);
        org.junit.Assert.assertNotNull(byteVector10);
        org.junit.Assert.assertNotNull(byteVector13);
        org.junit.Assert.assertNotNull(byteVector15);
        org.junit.Assert.assertNotNull(byteVector17);
        org.junit.Assert.assertNotNull(byteVector19);
        org.junit.Assert.assertNotNull(byteVector21);
        org.junit.Assert.assertNotNull(byteVector23);
        org.junit.Assert.assertNotNull(byteVector25);
        org.junit.Assert.assertNotNull(byteVector27);
        org.junit.Assert.assertNotNull(byteVector29);
        org.junit.Assert.assertNotNull(byteArray34);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray34), "[1, 0, 0, -1]");
        org.junit.Assert.assertNotNull(byteVector37);
    }

    @Test
    public void test0264() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0264");
        org.mockito.asm.ByteVector byteVector0 = new org.mockito.asm.ByteVector();
        org.mockito.asm.ByteVector byteVector2 = byteVector0.putUTF8("hi!");
        org.mockito.asm.ByteVector byteVector4 = byteVector2.putLong((long) (byte) 10);
        org.mockito.asm.ByteVector byteVector6 = byteVector4.putUTF8("hi!");
        org.mockito.asm.ByteVector byteVector8 = byteVector4.putShort((int) '4');
        org.mockito.asm.ByteVector byteVector10 = byteVector8.putLong((long) (short) 100);
        java.lang.Class<?> wildcardClass11 = byteVector8.getClass();
        org.junit.Assert.assertNotNull(byteVector2);
        org.junit.Assert.assertNotNull(byteVector4);
        org.junit.Assert.assertNotNull(byteVector6);
        org.junit.Assert.assertNotNull(byteVector8);
        org.junit.Assert.assertNotNull(byteVector10);
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test0265() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0265");
        org.mockito.asm.ByteVector byteVector0 = new org.mockito.asm.ByteVector();
        org.mockito.asm.ByteVector byteVector2 = byteVector0.putUTF8("hi!");
        org.mockito.asm.ByteVector byteVector4 = byteVector0.putInt(0);
        org.mockito.asm.ByteVector byteVector6 = byteVector0.putShort((int) '4');
        org.mockito.asm.ByteVector byteVector8 = byteVector0.putByte(100);
        org.mockito.asm.ByteVector byteVector10 = byteVector8.putInt((int) (byte) 10);
        org.mockito.asm.ByteVector byteVector11 = new org.mockito.asm.ByteVector();
        org.mockito.asm.ByteVector byteVector13 = byteVector11.putUTF8("hi!");
        org.mockito.asm.ByteVector byteVector15 = byteVector11.putInt(0);
        org.mockito.asm.ByteVector byteVector17 = byteVector11.putShort((int) '4');
        org.mockito.asm.ByteVector byteVector19 = byteVector11.putByte(100);
        org.mockito.asm.ByteVector byteVector21 = byteVector19.putInt((int) (byte) 10);
        org.mockito.asm.ByteVector byteVector23 = byteVector19.putInt((int) (byte) 10);
        org.mockito.asm.ByteVector byteVector25 = byteVector23.putByte(100);
        org.mockito.asm.ByteVector byteVector26 = new org.mockito.asm.ByteVector();
        org.mockito.asm.ByteVector byteVector28 = byteVector26.putUTF8("hi!");
        org.mockito.asm.ByteVector byteVector30 = byteVector26.putInt(0);
        org.mockito.asm.ByteVector byteVector32 = byteVector30.putInt((int) ' ');
        org.mockito.asm.ByteVector byteVector34 = byteVector32.putLong(100L);
        byte[] byteArray38 = new byte[] { (byte) 0, (byte) 10, (byte) 1 };
        org.mockito.asm.ByteVector byteVector41 = byteVector32.putByteArray(byteArray38, 0, 0);
        org.mockito.asm.ByteVector byteVector44 = byteVector25.putByteArray(byteArray38, (int) (byte) 1, (int) (byte) 0);
        // The following exception was thrown during execution in test generation
        try {
            org.mockito.asm.ByteVector byteVector47 = byteVector8.putByteArray(byteArray38, (int) (byte) -1, (int) (short) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteVector2);
        org.junit.Assert.assertNotNull(byteVector4);
        org.junit.Assert.assertNotNull(byteVector6);
        org.junit.Assert.assertNotNull(byteVector8);
        org.junit.Assert.assertNotNull(byteVector10);
        org.junit.Assert.assertNotNull(byteVector13);
        org.junit.Assert.assertNotNull(byteVector15);
        org.junit.Assert.assertNotNull(byteVector17);
        org.junit.Assert.assertNotNull(byteVector19);
        org.junit.Assert.assertNotNull(byteVector21);
        org.junit.Assert.assertNotNull(byteVector23);
        org.junit.Assert.assertNotNull(byteVector25);
        org.junit.Assert.assertNotNull(byteVector28);
        org.junit.Assert.assertNotNull(byteVector30);
        org.junit.Assert.assertNotNull(byteVector32);
        org.junit.Assert.assertNotNull(byteVector34);
        org.junit.Assert.assertNotNull(byteArray38);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray38), "[0, 10, 1]");
        org.junit.Assert.assertNotNull(byteVector41);
        org.junit.Assert.assertNotNull(byteVector44);
    }

    @Test
    public void test0266() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0266");
        org.mockito.asm.ByteVector byteVector0 = new org.mockito.asm.ByteVector();
        org.mockito.asm.ByteVector byteVector2 = byteVector0.putUTF8("hi!");
        org.mockito.asm.ByteVector byteVector4 = byteVector0.putShort((int) (short) 100);
        org.mockito.asm.ByteVector byteVector6 = byteVector4.putLong(0L);
        org.mockito.asm.ByteVector byteVector8 = byteVector4.putLong(0L);
        org.junit.Assert.assertNotNull(byteVector2);
        org.junit.Assert.assertNotNull(byteVector4);
        org.junit.Assert.assertNotNull(byteVector6);
        org.junit.Assert.assertNotNull(byteVector8);
    }

    @Test
    public void test0267() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0267");
        org.mockito.asm.ByteVector byteVector0 = new org.mockito.asm.ByteVector();
        org.mockito.asm.ByteVector byteVector2 = byteVector0.putUTF8("hi!");
        org.mockito.asm.ByteVector byteVector4 = byteVector0.putInt(0);
        org.mockito.asm.ByteVector byteVector6 = byteVector0.putShort((int) '4');
        org.mockito.asm.ByteVector byteVector8 = byteVector0.putByte(100);
        org.mockito.asm.ByteVector byteVector10 = byteVector8.putInt((int) (byte) 10);
        org.mockito.asm.ByteVector byteVector12 = byteVector10.putByte((int) (byte) 1);
        byte[] byteArray18 = new byte[] { (byte) 0, (byte) 1, (byte) 0, (byte) 10, (byte) 100 };
        // The following exception was thrown during execution in test generation
        try {
            org.mockito.asm.ByteVector byteVector21 = byteVector10.putByteArray(byteArray18, (int) (short) 100, 10);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteVector2);
        org.junit.Assert.assertNotNull(byteVector4);
        org.junit.Assert.assertNotNull(byteVector6);
        org.junit.Assert.assertNotNull(byteVector8);
        org.junit.Assert.assertNotNull(byteVector10);
        org.junit.Assert.assertNotNull(byteVector12);
        org.junit.Assert.assertNotNull(byteArray18);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray18), "[0, 1, 0, 10, 100]");
    }

    @Test
    public void test0268() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0268");
        org.mockito.asm.ByteVector byteVector0 = new org.mockito.asm.ByteVector();
        org.mockito.asm.ByteVector byteVector2 = byteVector0.putUTF8("hi!");
        org.mockito.asm.ByteVector byteVector4 = byteVector2.putByte(100);
        java.lang.Class<?> wildcardClass5 = byteVector4.getClass();
        org.junit.Assert.assertNotNull(byteVector2);
        org.junit.Assert.assertNotNull(byteVector4);
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test0269() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0269");
        org.mockito.asm.ByteVector byteVector0 = new org.mockito.asm.ByteVector();
        org.mockito.asm.ByteVector byteVector2 = byteVector0.putUTF8("hi!");
        org.mockito.asm.ByteVector byteVector4 = byteVector2.putLong((long) (byte) 10);
        org.mockito.asm.ByteVector byteVector6 = byteVector4.putUTF8("hi!");
        org.mockito.asm.ByteVector byteVector8 = byteVector4.putLong((long) (short) -1);
        org.mockito.asm.ByteVector byteVector10 = byteVector8.putInt(10);
        org.mockito.asm.ByteVector byteVector12 = byteVector8.putByte((int) (short) 1);
        org.mockito.asm.ByteVector byteVector14 = byteVector12.putShort((int) (short) 100);
        org.mockito.asm.ByteVector byteVector16 = byteVector14.putByte(0);
        org.mockito.asm.ByteVector byteVector18 = byteVector16.putByte((int) (short) 100);
        org.mockito.asm.ByteVector byteVector20 = byteVector18.putUTF8("hi!");
        org.mockito.asm.ByteVector byteVector21 = new org.mockito.asm.ByteVector();
        org.mockito.asm.ByteVector byteVector23 = byteVector21.putUTF8("hi!");
        org.mockito.asm.ByteVector byteVector25 = byteVector21.putLong((long) ' ');
        org.mockito.asm.ByteVector byteVector27 = byteVector25.putByte((int) 'a');
        org.mockito.asm.ByteVector byteVector29 = byteVector25.putByte((int) (short) -1);
        org.mockito.asm.ByteVector byteVector31 = byteVector25.putLong(0L);
        org.mockito.asm.ByteVector byteVector33 = byteVector31.putInt((int) (short) -1);
        org.mockito.asm.ByteVector byteVector35 = byteVector33.putByte(100);
        org.mockito.asm.ByteVector byteVector37 = byteVector35.putUTF8("hi!");
        org.mockito.asm.ByteVector byteVector39 = byteVector35.putLong((long) (short) 0);
        org.mockito.asm.ByteVector byteVector40 = new org.mockito.asm.ByteVector();
        org.mockito.asm.ByteVector byteVector42 = byteVector40.putUTF8("hi!");
        org.mockito.asm.ByteVector byteVector44 = byteVector40.putLong((long) ' ');
        org.mockito.asm.ByteVector byteVector46 = byteVector44.putByte((int) 'a');
        org.mockito.asm.ByteVector byteVector48 = byteVector44.putByte((int) (short) -1);
        org.mockito.asm.ByteVector byteVector50 = byteVector44.putLong(0L);
        org.mockito.asm.ByteVector byteVector52 = byteVector44.putUTF8("hi!");
        org.mockito.asm.ByteVector byteVector54 = byteVector52.putUTF8("");
        org.mockito.asm.ByteVector byteVector56 = byteVector52.putInt((int) (byte) 10);
        org.mockito.asm.ByteVector byteVector58 = byteVector52.putByte(0);
        org.mockito.asm.ByteVector byteVector59 = new org.mockito.asm.ByteVector();
        org.mockito.asm.ByteVector byteVector61 = byteVector59.putUTF8("hi!");
        org.mockito.asm.ByteVector byteVector63 = byteVector59.putInt(0);
        org.mockito.asm.ByteVector byteVector65 = byteVector63.putInt((int) ' ');
        org.mockito.asm.ByteVector byteVector67 = byteVector65.putLong(100L);
        byte[] byteArray71 = new byte[] { (byte) 0, (byte) 10, (byte) 1 };
        org.mockito.asm.ByteVector byteVector74 = byteVector65.putByteArray(byteArray71, 0, 0);
        org.mockito.asm.ByteVector byteVector77 = byteVector58.putByteArray(byteArray71, (int) (short) 1, 0);
        org.mockito.asm.ByteVector byteVector80 = byteVector39.putByteArray(byteArray71, (int) (byte) 0, (int) (byte) 1);
        // The following exception was thrown during execution in test generation
        try {
            org.mockito.asm.ByteVector byteVector83 = byteVector18.putByteArray(byteArray71, (int) (byte) 100, 0);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteVector2);
        org.junit.Assert.assertNotNull(byteVector4);
        org.junit.Assert.assertNotNull(byteVector6);
        org.junit.Assert.assertNotNull(byteVector8);
        org.junit.Assert.assertNotNull(byteVector10);
        org.junit.Assert.assertNotNull(byteVector12);
        org.junit.Assert.assertNotNull(byteVector14);
        org.junit.Assert.assertNotNull(byteVector16);
        org.junit.Assert.assertNotNull(byteVector18);
        org.junit.Assert.assertNotNull(byteVector20);
        org.junit.Assert.assertNotNull(byteVector23);
        org.junit.Assert.assertNotNull(byteVector25);
        org.junit.Assert.assertNotNull(byteVector27);
        org.junit.Assert.assertNotNull(byteVector29);
        org.junit.Assert.assertNotNull(byteVector31);
        org.junit.Assert.assertNotNull(byteVector33);
        org.junit.Assert.assertNotNull(byteVector35);
        org.junit.Assert.assertNotNull(byteVector37);
        org.junit.Assert.assertNotNull(byteVector39);
        org.junit.Assert.assertNotNull(byteVector42);
        org.junit.Assert.assertNotNull(byteVector44);
        org.junit.Assert.assertNotNull(byteVector46);
        org.junit.Assert.assertNotNull(byteVector48);
        org.junit.Assert.assertNotNull(byteVector50);
        org.junit.Assert.assertNotNull(byteVector52);
        org.junit.Assert.assertNotNull(byteVector54);
        org.junit.Assert.assertNotNull(byteVector56);
        org.junit.Assert.assertNotNull(byteVector58);
        org.junit.Assert.assertNotNull(byteVector61);
        org.junit.Assert.assertNotNull(byteVector63);
        org.junit.Assert.assertNotNull(byteVector65);
        org.junit.Assert.assertNotNull(byteVector67);
        org.junit.Assert.assertNotNull(byteArray71);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray71), "[0, 10, 1]");
        org.junit.Assert.assertNotNull(byteVector74);
        org.junit.Assert.assertNotNull(byteVector77);
        org.junit.Assert.assertNotNull(byteVector80);
    }

    @Test
    public void test0270() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0270");
        org.mockito.asm.ByteVector byteVector0 = new org.mockito.asm.ByteVector();
        org.mockito.asm.ByteVector byteVector2 = byteVector0.putUTF8("hi!");
        org.mockito.asm.ByteVector byteVector4 = byteVector0.putShort((int) (short) -1);
        org.mockito.asm.ByteVector byteVector6 = byteVector0.putInt((int) (byte) 10);
        org.mockito.asm.ByteVector byteVector8 = byteVector6.putUTF8("hi!");
        org.mockito.asm.ByteVector byteVector10 = byteVector8.putShort(100);
        org.junit.Assert.assertNotNull(byteVector2);
        org.junit.Assert.assertNotNull(byteVector4);
        org.junit.Assert.assertNotNull(byteVector6);
        org.junit.Assert.assertNotNull(byteVector8);
        org.junit.Assert.assertNotNull(byteVector10);
    }

    @Test
    public void test0271() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0271");
        org.mockito.asm.ByteVector byteVector1 = new org.mockito.asm.ByteVector((int) '#');
        org.mockito.asm.ByteVector byteVector3 = byteVector1.putLong(100L);
        org.mockito.asm.ByteVector byteVector5 = byteVector3.putLong(1L);
        org.mockito.asm.ByteVector byteVector7 = byteVector5.putUTF8("hi!");
        org.mockito.asm.ByteVector byteVector9 = byteVector7.putUTF8("");
        java.lang.Class<?> wildcardClass10 = byteVector7.getClass();
        org.junit.Assert.assertNotNull(byteVector3);
        org.junit.Assert.assertNotNull(byteVector5);
        org.junit.Assert.assertNotNull(byteVector7);
        org.junit.Assert.assertNotNull(byteVector9);
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test0272() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0272");
        org.mockito.asm.ByteVector byteVector0 = new org.mockito.asm.ByteVector();
        org.mockito.asm.ByteVector byteVector2 = byteVector0.putUTF8("hi!");
        org.mockito.asm.ByteVector byteVector4 = byteVector0.putLong((long) ' ');
        org.mockito.asm.ByteVector byteVector6 = byteVector4.putByte((int) 'a');
        org.mockito.asm.ByteVector byteVector8 = byteVector4.putByte((int) (short) -1);
        org.mockito.asm.ByteVector byteVector10 = byteVector4.putLong(0L);
        org.mockito.asm.ByteVector byteVector12 = byteVector4.putUTF8("hi!");
        org.mockito.asm.ByteVector byteVector14 = byteVector12.putShort((int) '4');
        org.mockito.asm.ByteVector byteVector16 = byteVector12.putShort((int) (byte) 0);
        org.junit.Assert.assertNotNull(byteVector2);
        org.junit.Assert.assertNotNull(byteVector4);
        org.junit.Assert.assertNotNull(byteVector6);
        org.junit.Assert.assertNotNull(byteVector8);
        org.junit.Assert.assertNotNull(byteVector10);
        org.junit.Assert.assertNotNull(byteVector12);
        org.junit.Assert.assertNotNull(byteVector14);
        org.junit.Assert.assertNotNull(byteVector16);
    }

    @Test
    public void test0273() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0273");
        org.mockito.asm.ByteVector byteVector0 = new org.mockito.asm.ByteVector();
        org.mockito.asm.ByteVector byteVector2 = byteVector0.putUTF8("hi!");
        org.mockito.asm.ByteVector byteVector4 = byteVector0.putInt(0);
        org.mockito.asm.ByteVector byteVector6 = byteVector4.putByte((int) ' ');
        org.mockito.asm.ByteVector byteVector8 = byteVector6.putUTF8("");
        org.junit.Assert.assertNotNull(byteVector2);
        org.junit.Assert.assertNotNull(byteVector4);
        org.junit.Assert.assertNotNull(byteVector6);
        org.junit.Assert.assertNotNull(byteVector8);
    }

    @Test
    public void test0274() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0274");
        org.mockito.asm.ByteVector byteVector0 = new org.mockito.asm.ByteVector();
        org.mockito.asm.ByteVector byteVector2 = byteVector0.putUTF8("hi!");
        org.mockito.asm.ByteVector byteVector4 = byteVector0.putInt(0);
        org.mockito.asm.ByteVector byteVector6 = byteVector0.putShort(10);
        org.mockito.asm.ByteVector byteVector8 = byteVector6.putLong((long) '4');
        org.mockito.asm.ByteVector byteVector10 = byteVector6.putShort((int) ' ');
        org.mockito.asm.ByteVector byteVector12 = byteVector6.putInt((int) (byte) -1);
        org.mockito.asm.ByteVector byteVector14 = byteVector12.putUTF8("hi!");
        org.junit.Assert.assertNotNull(byteVector2);
        org.junit.Assert.assertNotNull(byteVector4);
        org.junit.Assert.assertNotNull(byteVector6);
        org.junit.Assert.assertNotNull(byteVector8);
        org.junit.Assert.assertNotNull(byteVector10);
        org.junit.Assert.assertNotNull(byteVector12);
        org.junit.Assert.assertNotNull(byteVector14);
    }

    @Test
    public void test0275() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0275");
        org.mockito.asm.ByteVector byteVector0 = new org.mockito.asm.ByteVector();
        org.mockito.asm.ByteVector byteVector2 = byteVector0.putUTF8("hi!");
        org.mockito.asm.ByteVector byteVector4 = byteVector0.putLong((long) ' ');
        org.mockito.asm.ByteVector byteVector6 = byteVector4.putByte((int) 'a');
        org.mockito.asm.ByteVector byteVector8 = byteVector4.putByte((int) (short) -1);
        org.mockito.asm.ByteVector byteVector10 = byteVector4.putLong(0L);
        org.mockito.asm.ByteVector byteVector12 = byteVector4.putUTF8("hi!");
        org.mockito.asm.ByteVector byteVector14 = byteVector12.putUTF8("");
        org.mockito.asm.ByteVector byteVector16 = byteVector14.putLong((long) (byte) 10);
        org.mockito.asm.ByteVector byteVector18 = byteVector14.putLong((long) (short) 100);
        org.mockito.asm.ByteVector byteVector20 = new org.mockito.asm.ByteVector((int) (short) 0);
        org.mockito.asm.ByteVector byteVector21 = new org.mockito.asm.ByteVector();
        org.mockito.asm.ByteVector byteVector23 = byteVector21.putUTF8("hi!");
        org.mockito.asm.ByteVector byteVector25 = byteVector21.putInt(0);
        org.mockito.asm.ByteVector byteVector27 = byteVector25.putInt((int) ' ');
        org.mockito.asm.ByteVector byteVector29 = byteVector27.putLong(100L);
        byte[] byteArray33 = new byte[] { (byte) 0, (byte) 10, (byte) 1 };
        org.mockito.asm.ByteVector byteVector36 = byteVector27.putByteArray(byteArray33, 0, 0);
        org.mockito.asm.ByteVector byteVector39 = byteVector20.putByteArray(byteArray33, 1, (int) (short) 0);
        // The following exception was thrown during execution in test generation
        try {
            org.mockito.asm.ByteVector byteVector42 = byteVector14.putByteArray(byteArray33, (-1), (int) (byte) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteVector2);
        org.junit.Assert.assertNotNull(byteVector4);
        org.junit.Assert.assertNotNull(byteVector6);
        org.junit.Assert.assertNotNull(byteVector8);
        org.junit.Assert.assertNotNull(byteVector10);
        org.junit.Assert.assertNotNull(byteVector12);
        org.junit.Assert.assertNotNull(byteVector14);
        org.junit.Assert.assertNotNull(byteVector16);
        org.junit.Assert.assertNotNull(byteVector18);
        org.junit.Assert.assertNotNull(byteVector23);
        org.junit.Assert.assertNotNull(byteVector25);
        org.junit.Assert.assertNotNull(byteVector27);
        org.junit.Assert.assertNotNull(byteVector29);
        org.junit.Assert.assertNotNull(byteArray33);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray33), "[0, 10, 1]");
        org.junit.Assert.assertNotNull(byteVector36);
        org.junit.Assert.assertNotNull(byteVector39);
    }

    @Test
    public void test0276() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0276");
        org.mockito.asm.ByteVector byteVector1 = new org.mockito.asm.ByteVector((int) (byte) 0);
        org.mockito.asm.ByteVector byteVector2 = new org.mockito.asm.ByteVector();
        org.mockito.asm.ByteVector byteVector4 = byteVector2.putUTF8("hi!");
        org.mockito.asm.ByteVector byteVector6 = byteVector4.putByte(100);
        org.mockito.asm.ByteVector byteVector8 = byteVector4.putShort((int) 'a');
        org.mockito.asm.ByteVector byteVector10 = byteVector8.putShort((int) (short) 0);
        org.mockito.asm.ByteVector byteVector11 = new org.mockito.asm.ByteVector();
        org.mockito.asm.ByteVector byteVector13 = byteVector11.putUTF8("hi!");
        org.mockito.asm.ByteVector byteVector15 = byteVector13.putInt(0);
        org.mockito.asm.ByteVector byteVector17 = byteVector13.putByte((int) (byte) 10);
        org.mockito.asm.ByteVector byteVector19 = byteVector17.putLong((-1L));
        org.mockito.asm.ByteVector byteVector21 = byteVector17.putInt((int) (byte) 100);
        org.mockito.asm.ByteVector byteVector22 = new org.mockito.asm.ByteVector();
        org.mockito.asm.ByteVector byteVector24 = byteVector22.putUTF8("hi!");
        org.mockito.asm.ByteVector byteVector26 = byteVector22.putInt(0);
        org.mockito.asm.ByteVector byteVector28 = byteVector26.putInt((int) ' ');
        org.mockito.asm.ByteVector byteVector30 = byteVector28.putLong(100L);
        byte[] byteArray34 = new byte[] { (byte) 0, (byte) 10, (byte) 1 };
        org.mockito.asm.ByteVector byteVector37 = byteVector28.putByteArray(byteArray34, 0, 0);
        org.mockito.asm.ByteVector byteVector40 = byteVector17.putByteArray(byteArray34, (int) (byte) 1, 0);
        org.mockito.asm.ByteVector byteVector43 = byteVector8.putByteArray(byteArray34, (int) (byte) 1, (int) (short) 1);
        // The following exception was thrown during execution in test generation
        try {
            org.mockito.asm.ByteVector byteVector46 = byteVector1.putByteArray(byteArray34, (int) (byte) 10, (int) (byte) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteVector4);
        org.junit.Assert.assertNotNull(byteVector6);
        org.junit.Assert.assertNotNull(byteVector8);
        org.junit.Assert.assertNotNull(byteVector10);
        org.junit.Assert.assertNotNull(byteVector13);
        org.junit.Assert.assertNotNull(byteVector15);
        org.junit.Assert.assertNotNull(byteVector17);
        org.junit.Assert.assertNotNull(byteVector19);
        org.junit.Assert.assertNotNull(byteVector21);
        org.junit.Assert.assertNotNull(byteVector24);
        org.junit.Assert.assertNotNull(byteVector26);
        org.junit.Assert.assertNotNull(byteVector28);
        org.junit.Assert.assertNotNull(byteVector30);
        org.junit.Assert.assertNotNull(byteArray34);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray34), "[0, 10, 1]");
        org.junit.Assert.assertNotNull(byteVector37);
        org.junit.Assert.assertNotNull(byteVector40);
        org.junit.Assert.assertNotNull(byteVector43);
    }

    @Test
    public void test0277() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0277");
        org.mockito.asm.ByteVector byteVector0 = new org.mockito.asm.ByteVector();
        org.mockito.asm.ByteVector byteVector2 = byteVector0.putUTF8("hi!");
        org.mockito.asm.ByteVector byteVector4 = byteVector2.putLong((long) (byte) 10);
        org.mockito.asm.ByteVector byteVector6 = byteVector4.putUTF8("hi!");
        org.mockito.asm.ByteVector byteVector8 = byteVector4.putLong((-1L));
        org.mockito.asm.ByteVector byteVector10 = byteVector8.putInt(10);
        org.mockito.asm.ByteVector byteVector12 = byteVector8.putShort((int) (byte) 0);
        org.mockito.asm.ByteVector byteVector14 = byteVector8.putShort((int) 'a');
        java.lang.Class<?> wildcardClass15 = byteVector8.getClass();
        org.junit.Assert.assertNotNull(byteVector2);
        org.junit.Assert.assertNotNull(byteVector4);
        org.junit.Assert.assertNotNull(byteVector6);
        org.junit.Assert.assertNotNull(byteVector8);
        org.junit.Assert.assertNotNull(byteVector10);
        org.junit.Assert.assertNotNull(byteVector12);
        org.junit.Assert.assertNotNull(byteVector14);
        org.junit.Assert.assertNotNull(wildcardClass15);
    }

    @Test
    public void test0278() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0278");
        org.mockito.asm.ByteVector byteVector0 = new org.mockito.asm.ByteVector();
        org.mockito.asm.ByteVector byteVector2 = byteVector0.putUTF8("hi!");
        org.mockito.asm.ByteVector byteVector4 = byteVector2.putLong((long) (byte) 10);
        org.mockito.asm.ByteVector byteVector6 = byteVector4.putUTF8("hi!");
        org.mockito.asm.ByteVector byteVector8 = byteVector4.putLong((-1L));
        org.mockito.asm.ByteVector byteVector10 = byteVector8.putInt(10);
        org.mockito.asm.ByteVector byteVector12 = byteVector8.putShort((int) (byte) 0);
        java.lang.Class<?> wildcardClass13 = byteVector8.getClass();
        org.junit.Assert.assertNotNull(byteVector2);
        org.junit.Assert.assertNotNull(byteVector4);
        org.junit.Assert.assertNotNull(byteVector6);
        org.junit.Assert.assertNotNull(byteVector8);
        org.junit.Assert.assertNotNull(byteVector10);
        org.junit.Assert.assertNotNull(byteVector12);
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test0279() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0279");
        org.mockito.asm.ByteVector byteVector0 = new org.mockito.asm.ByteVector();
        org.mockito.asm.ByteVector byteVector2 = byteVector0.putUTF8("hi!");
        org.mockito.asm.ByteVector byteVector4 = byteVector2.putLong((long) (byte) 10);
        org.mockito.asm.ByteVector byteVector6 = byteVector4.putUTF8("hi!");
        org.mockito.asm.ByteVector byteVector8 = byteVector4.putLong((long) (short) -1);
        org.mockito.asm.ByteVector byteVector10 = byteVector8.putInt(10);
        org.mockito.asm.ByteVector byteVector12 = byteVector8.putByte((int) (short) 1);
        org.mockito.asm.ByteVector byteVector14 = byteVector12.putShort((int) (short) 100);
        org.mockito.asm.ByteVector byteVector16 = byteVector14.putByte(0);
        org.mockito.asm.ByteVector byteVector18 = byteVector16.putByte((int) (short) 100);
        java.lang.Class<?> wildcardClass19 = byteVector16.getClass();
        org.junit.Assert.assertNotNull(byteVector2);
        org.junit.Assert.assertNotNull(byteVector4);
        org.junit.Assert.assertNotNull(byteVector6);
        org.junit.Assert.assertNotNull(byteVector8);
        org.junit.Assert.assertNotNull(byteVector10);
        org.junit.Assert.assertNotNull(byteVector12);
        org.junit.Assert.assertNotNull(byteVector14);
        org.junit.Assert.assertNotNull(byteVector16);
        org.junit.Assert.assertNotNull(byteVector18);
        org.junit.Assert.assertNotNull(wildcardClass19);
    }

    @Test
    public void test0280() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0280");
        org.mockito.asm.ByteVector byteVector0 = new org.mockito.asm.ByteVector();
        org.mockito.asm.ByteVector byteVector2 = byteVector0.putUTF8("hi!");
        org.mockito.asm.ByteVector byteVector4 = byteVector0.putInt(0);
        org.mockito.asm.ByteVector byteVector6 = byteVector0.putShort((int) '4');
        org.mockito.asm.ByteVector byteVector8 = byteVector6.putShort((int) (byte) -1);
        org.mockito.asm.ByteVector byteVector10 = byteVector8.putLong(0L);
        org.mockito.asm.ByteVector byteVector11 = new org.mockito.asm.ByteVector();
        org.mockito.asm.ByteVector byteVector13 = byteVector11.putUTF8("hi!");
        org.mockito.asm.ByteVector byteVector15 = byteVector13.putLong((long) (byte) 10);
        org.mockito.asm.ByteVector byteVector17 = byteVector15.putUTF8("hi!");
        org.mockito.asm.ByteVector byteVector19 = byteVector15.putLong((-1L));
        org.mockito.asm.ByteVector byteVector21 = new org.mockito.asm.ByteVector((int) (short) 0);
        org.mockito.asm.ByteVector byteVector22 = new org.mockito.asm.ByteVector();
        org.mockito.asm.ByteVector byteVector24 = byteVector22.putUTF8("hi!");
        org.mockito.asm.ByteVector byteVector26 = byteVector22.putInt(0);
        org.mockito.asm.ByteVector byteVector28 = byteVector26.putInt((int) ' ');
        org.mockito.asm.ByteVector byteVector30 = byteVector28.putLong(100L);
        byte[] byteArray34 = new byte[] { (byte) 0, (byte) 10, (byte) 1 };
        org.mockito.asm.ByteVector byteVector37 = byteVector28.putByteArray(byteArray34, 0, 0);
        org.mockito.asm.ByteVector byteVector40 = byteVector21.putByteArray(byteArray34, 1, (int) (short) 0);
        org.mockito.asm.ByteVector byteVector43 = byteVector19.putByteArray(byteArray34, 0, (int) (byte) 1);
        // The following exception was thrown during execution in test generation
        try {
            org.mockito.asm.ByteVector byteVector46 = byteVector10.putByteArray(byteArray34, (int) 'a', (int) (byte) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteVector2);
        org.junit.Assert.assertNotNull(byteVector4);
        org.junit.Assert.assertNotNull(byteVector6);
        org.junit.Assert.assertNotNull(byteVector8);
        org.junit.Assert.assertNotNull(byteVector10);
        org.junit.Assert.assertNotNull(byteVector13);
        org.junit.Assert.assertNotNull(byteVector15);
        org.junit.Assert.assertNotNull(byteVector17);
        org.junit.Assert.assertNotNull(byteVector19);
        org.junit.Assert.assertNotNull(byteVector24);
        org.junit.Assert.assertNotNull(byteVector26);
        org.junit.Assert.assertNotNull(byteVector28);
        org.junit.Assert.assertNotNull(byteVector30);
        org.junit.Assert.assertNotNull(byteArray34);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray34), "[0, 10, 1]");
        org.junit.Assert.assertNotNull(byteVector37);
        org.junit.Assert.assertNotNull(byteVector40);
        org.junit.Assert.assertNotNull(byteVector43);
    }

    @Test
    public void test0281() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0281");
        org.mockito.asm.ByteVector byteVector0 = new org.mockito.asm.ByteVector();
        org.mockito.asm.ByteVector byteVector2 = byteVector0.putUTF8("hi!");
        org.mockito.asm.ByteVector byteVector4 = byteVector0.putShort((int) (short) -1);
        org.mockito.asm.ByteVector byteVector6 = byteVector0.putInt((int) (byte) 10);
        org.mockito.asm.ByteVector byteVector8 = byteVector6.putUTF8("hi!");
        org.mockito.asm.ByteVector byteVector10 = byteVector8.putShort(0);
        org.mockito.asm.ByteVector byteVector12 = byteVector10.putLong(10L);
        org.mockito.asm.ByteVector byteVector14 = byteVector12.putByte((int) 'a');
        org.mockito.asm.ByteVector byteVector16 = byteVector14.putShort((int) (short) -1);
        org.mockito.asm.ByteVector byteVector17 = new org.mockito.asm.ByteVector();
        org.mockito.asm.ByteVector byteVector19 = byteVector17.putUTF8("hi!");
        org.mockito.asm.ByteVector byteVector21 = byteVector17.putLong((long) ' ');
        org.mockito.asm.ByteVector byteVector23 = byteVector21.putByte((int) 'a');
        org.mockito.asm.ByteVector byteVector25 = byteVector21.putByte((int) (short) -1);
        org.mockito.asm.ByteVector byteVector27 = byteVector21.putLong(0L);
        org.mockito.asm.ByteVector byteVector29 = byteVector21.putUTF8("hi!");
        org.mockito.asm.ByteVector byteVector31 = byteVector29.putUTF8("");
        org.mockito.asm.ByteVector byteVector33 = byteVector31.putLong((long) (byte) 10);
        org.mockito.asm.ByteVector byteVector35 = byteVector31.putLong((long) (short) 100);
        byte[] byteArray40 = new byte[] { (byte) 1, (byte) 0, (byte) 0, (byte) -1 };
        org.mockito.asm.ByteVector byteVector43 = byteVector31.putByteArray(byteArray40, 0, 0);
        // The following exception was thrown during execution in test generation
        try {
            org.mockito.asm.ByteVector byteVector46 = byteVector16.putByteArray(byteArray40, (int) (byte) 1, (int) (byte) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteVector2);
        org.junit.Assert.assertNotNull(byteVector4);
        org.junit.Assert.assertNotNull(byteVector6);
        org.junit.Assert.assertNotNull(byteVector8);
        org.junit.Assert.assertNotNull(byteVector10);
        org.junit.Assert.assertNotNull(byteVector12);
        org.junit.Assert.assertNotNull(byteVector14);
        org.junit.Assert.assertNotNull(byteVector16);
        org.junit.Assert.assertNotNull(byteVector19);
        org.junit.Assert.assertNotNull(byteVector21);
        org.junit.Assert.assertNotNull(byteVector23);
        org.junit.Assert.assertNotNull(byteVector25);
        org.junit.Assert.assertNotNull(byteVector27);
        org.junit.Assert.assertNotNull(byteVector29);
        org.junit.Assert.assertNotNull(byteVector31);
        org.junit.Assert.assertNotNull(byteVector33);
        org.junit.Assert.assertNotNull(byteVector35);
        org.junit.Assert.assertNotNull(byteArray40);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray40), "[1, 0, 0, -1]");
        org.junit.Assert.assertNotNull(byteVector43);
    }

    @Test
    public void test0282() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0282");
        org.mockito.asm.ByteVector byteVector1 = new org.mockito.asm.ByteVector(1);
        org.mockito.asm.ByteVector byteVector3 = byteVector1.putUTF8("hi!");
        org.junit.Assert.assertNotNull(byteVector3);
    }

    @Test
    public void test0283() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0283");
        org.mockito.asm.ByteVector byteVector0 = new org.mockito.asm.ByteVector();
        org.mockito.asm.ByteVector byteVector2 = byteVector0.putUTF8("hi!");
        org.mockito.asm.ByteVector byteVector4 = byteVector2.putInt(0);
        org.mockito.asm.ByteVector byteVector6 = byteVector4.putInt((int) 'a');
        java.lang.Class<?> wildcardClass7 = byteVector6.getClass();
        org.junit.Assert.assertNotNull(byteVector2);
        org.junit.Assert.assertNotNull(byteVector4);
        org.junit.Assert.assertNotNull(byteVector6);
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test0284() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0284");
        org.mockito.asm.ByteVector byteVector0 = new org.mockito.asm.ByteVector();
        org.mockito.asm.ByteVector byteVector2 = byteVector0.putUTF8("hi!");
        org.mockito.asm.ByteVector byteVector4 = byteVector0.putLong((long) ' ');
        org.mockito.asm.ByteVector byteVector6 = byteVector4.putByte((int) 'a');
        org.mockito.asm.ByteVector byteVector8 = byteVector4.putByte((int) (short) -1);
        org.mockito.asm.ByteVector byteVector10 = byteVector4.putLong(0L);
        org.mockito.asm.ByteVector byteVector12 = byteVector10.putByte(0);
        org.mockito.asm.ByteVector byteVector14 = byteVector12.putByte(100);
        org.mockito.asm.ByteVector byteVector16 = byteVector12.putInt((-1));
        org.mockito.asm.ByteVector byteVector18 = byteVector12.putByte((int) (byte) 100);
        org.mockito.asm.ByteVector byteVector20 = byteVector12.putInt((int) (short) 1);
        org.mockito.asm.ByteVector byteVector22 = byteVector20.putByte((int) ' ');
        org.mockito.asm.ByteVector byteVector24 = byteVector20.putUTF8("");
        java.lang.Class<?> wildcardClass25 = byteVector20.getClass();
        org.junit.Assert.assertNotNull(byteVector2);
        org.junit.Assert.assertNotNull(byteVector4);
        org.junit.Assert.assertNotNull(byteVector6);
        org.junit.Assert.assertNotNull(byteVector8);
        org.junit.Assert.assertNotNull(byteVector10);
        org.junit.Assert.assertNotNull(byteVector12);
        org.junit.Assert.assertNotNull(byteVector14);
        org.junit.Assert.assertNotNull(byteVector16);
        org.junit.Assert.assertNotNull(byteVector18);
        org.junit.Assert.assertNotNull(byteVector20);
        org.junit.Assert.assertNotNull(byteVector22);
        org.junit.Assert.assertNotNull(byteVector24);
        org.junit.Assert.assertNotNull(wildcardClass25);
    }

    @Test
    public void test0285() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0285");
        org.mockito.asm.ByteVector byteVector0 = new org.mockito.asm.ByteVector();
        org.mockito.asm.ByteVector byteVector2 = byteVector0.putUTF8("hi!");
        org.mockito.asm.ByteVector byteVector4 = byteVector0.putLong((long) ' ');
        org.mockito.asm.ByteVector byteVector6 = byteVector4.putByte((int) 'a');
        org.mockito.asm.ByteVector byteVector8 = byteVector6.putByte((int) (short) -1);
        byte[] byteArray9 = null;
        org.mockito.asm.ByteVector byteVector12 = byteVector6.putByteArray(byteArray9, (int) '#', 0);
        org.mockito.asm.ByteVector byteVector14 = byteVector6.putUTF8("");
        org.mockito.asm.ByteVector byteVector16 = byteVector6.putInt((int) '4');
        java.lang.Class<?> wildcardClass17 = byteVector16.getClass();
        org.junit.Assert.assertNotNull(byteVector2);
        org.junit.Assert.assertNotNull(byteVector4);
        org.junit.Assert.assertNotNull(byteVector6);
        org.junit.Assert.assertNotNull(byteVector8);
        org.junit.Assert.assertNotNull(byteVector12);
        org.junit.Assert.assertNotNull(byteVector14);
        org.junit.Assert.assertNotNull(byteVector16);
        org.junit.Assert.assertNotNull(wildcardClass17);
    }

    @Test
    public void test0286() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0286");
        org.mockito.asm.ByteVector byteVector0 = new org.mockito.asm.ByteVector();
        org.mockito.asm.ByteVector byteVector2 = byteVector0.putUTF8("hi!");
        org.mockito.asm.ByteVector byteVector4 = byteVector2.putInt(0);
        org.mockito.asm.ByteVector byteVector6 = byteVector4.putByte((int) (byte) 1);
        org.mockito.asm.ByteVector byteVector8 = byteVector4.putByte(0);
        org.mockito.asm.ByteVector byteVector10 = byteVector8.putLong((long) (byte) 1);
        org.mockito.asm.ByteVector byteVector12 = byteVector10.putShort((int) (short) -1);
        org.junit.Assert.assertNotNull(byteVector2);
        org.junit.Assert.assertNotNull(byteVector4);
        org.junit.Assert.assertNotNull(byteVector6);
        org.junit.Assert.assertNotNull(byteVector8);
        org.junit.Assert.assertNotNull(byteVector10);
        org.junit.Assert.assertNotNull(byteVector12);
    }

    @Test
    public void test0287() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0287");
        org.mockito.asm.ByteVector byteVector0 = new org.mockito.asm.ByteVector();
        org.mockito.asm.ByteVector byteVector2 = byteVector0.putUTF8("hi!");
        org.mockito.asm.ByteVector byteVector4 = byteVector0.putInt(0);
        org.mockito.asm.ByteVector byteVector6 = byteVector0.putShort((int) '4');
        org.mockito.asm.ByteVector byteVector8 = byteVector6.putInt((int) (short) 0);
        java.lang.Class<?> wildcardClass9 = byteVector6.getClass();
        org.junit.Assert.assertNotNull(byteVector2);
        org.junit.Assert.assertNotNull(byteVector4);
        org.junit.Assert.assertNotNull(byteVector6);
        org.junit.Assert.assertNotNull(byteVector8);
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test0288() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0288");
        org.mockito.asm.ByteVector byteVector0 = new org.mockito.asm.ByteVector();
        org.mockito.asm.ByteVector byteVector2 = byteVector0.putUTF8("hi!");
        org.mockito.asm.ByteVector byteVector4 = byteVector2.putInt(0);
        org.mockito.asm.ByteVector byteVector6 = byteVector2.putByte((int) (byte) 10);
        org.mockito.asm.ByteVector byteVector8 = byteVector6.putUTF8("hi!");
        org.mockito.asm.ByteVector byteVector10 = byteVector8.putShort(100);
        org.mockito.asm.ByteVector byteVector12 = byteVector10.putInt((int) (byte) -1);
        org.mockito.asm.ByteVector byteVector14 = byteVector12.putLong(1L);
        java.lang.Class<?> wildcardClass15 = byteVector14.getClass();
        org.junit.Assert.assertNotNull(byteVector2);
        org.junit.Assert.assertNotNull(byteVector4);
        org.junit.Assert.assertNotNull(byteVector6);
        org.junit.Assert.assertNotNull(byteVector8);
        org.junit.Assert.assertNotNull(byteVector10);
        org.junit.Assert.assertNotNull(byteVector12);
        org.junit.Assert.assertNotNull(byteVector14);
        org.junit.Assert.assertNotNull(wildcardClass15);
    }

    @Test
    public void test0289() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0289");
        org.mockito.asm.ByteVector byteVector0 = new org.mockito.asm.ByteVector();
        org.mockito.asm.ByteVector byteVector2 = byteVector0.putUTF8("hi!");
        org.mockito.asm.ByteVector byteVector4 = byteVector2.putInt((int) (byte) 10);
        org.mockito.asm.ByteVector byteVector6 = byteVector4.putUTF8("");
        org.mockito.asm.ByteVector byteVector8 = byteVector6.putUTF8("hi!");
        org.mockito.asm.ByteVector byteVector10 = byteVector6.putShort(0);
        org.mockito.asm.ByteVector byteVector11 = new org.mockito.asm.ByteVector();
        org.mockito.asm.ByteVector byteVector13 = byteVector11.putUTF8("hi!");
        org.mockito.asm.ByteVector byteVector15 = byteVector13.putInt(0);
        org.mockito.asm.ByteVector byteVector17 = byteVector13.putByte((int) (byte) 10);
        org.mockito.asm.ByteVector byteVector19 = byteVector17.putLong((-1L));
        org.mockito.asm.ByteVector byteVector21 = byteVector17.putInt((int) (byte) 100);
        org.mockito.asm.ByteVector byteVector22 = new org.mockito.asm.ByteVector();
        org.mockito.asm.ByteVector byteVector24 = byteVector22.putUTF8("hi!");
        org.mockito.asm.ByteVector byteVector26 = byteVector22.putInt(0);
        org.mockito.asm.ByteVector byteVector28 = byteVector26.putInt((int) ' ');
        org.mockito.asm.ByteVector byteVector30 = byteVector28.putLong(100L);
        byte[] byteArray34 = new byte[] { (byte) 0, (byte) 10, (byte) 1 };
        org.mockito.asm.ByteVector byteVector37 = byteVector28.putByteArray(byteArray34, 0, 0);
        org.mockito.asm.ByteVector byteVector40 = byteVector17.putByteArray(byteArray34, (int) (byte) 1, 0);
        // The following exception was thrown during execution in test generation
        try {
            org.mockito.asm.ByteVector byteVector43 = byteVector6.putByteArray(byteArray34, 0, 100);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteVector2);
        org.junit.Assert.assertNotNull(byteVector4);
        org.junit.Assert.assertNotNull(byteVector6);
        org.junit.Assert.assertNotNull(byteVector8);
        org.junit.Assert.assertNotNull(byteVector10);
        org.junit.Assert.assertNotNull(byteVector13);
        org.junit.Assert.assertNotNull(byteVector15);
        org.junit.Assert.assertNotNull(byteVector17);
        org.junit.Assert.assertNotNull(byteVector19);
        org.junit.Assert.assertNotNull(byteVector21);
        org.junit.Assert.assertNotNull(byteVector24);
        org.junit.Assert.assertNotNull(byteVector26);
        org.junit.Assert.assertNotNull(byteVector28);
        org.junit.Assert.assertNotNull(byteVector30);
        org.junit.Assert.assertNotNull(byteArray34);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray34), "[0, 10, 1]");
        org.junit.Assert.assertNotNull(byteVector37);
        org.junit.Assert.assertNotNull(byteVector40);
    }

    @Test
    public void test0290() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0290");
        org.mockito.asm.ByteVector byteVector0 = new org.mockito.asm.ByteVector();
        org.mockito.asm.ByteVector byteVector2 = byteVector0.putUTF8("hi!");
        org.mockito.asm.ByteVector byteVector4 = byteVector0.putInt(0);
        org.mockito.asm.ByteVector byteVector6 = byteVector0.putShort(10);
        org.mockito.asm.ByteVector byteVector8 = byteVector0.putLong((long) '#');
        org.mockito.asm.ByteVector byteVector10 = byteVector8.putShort((int) (byte) 0);
        java.lang.Class<?> wildcardClass11 = byteVector8.getClass();
        org.junit.Assert.assertNotNull(byteVector2);
        org.junit.Assert.assertNotNull(byteVector4);
        org.junit.Assert.assertNotNull(byteVector6);
        org.junit.Assert.assertNotNull(byteVector8);
        org.junit.Assert.assertNotNull(byteVector10);
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test0291() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0291");
        org.mockito.asm.ByteVector byteVector0 = new org.mockito.asm.ByteVector();
        org.mockito.asm.ByteVector byteVector2 = byteVector0.putUTF8("hi!");
        org.mockito.asm.ByteVector byteVector4 = byteVector2.putInt(0);
        org.mockito.asm.ByteVector byteVector6 = byteVector2.putByte((int) (byte) 10);
        org.mockito.asm.ByteVector byteVector8 = byteVector6.putByte((int) (short) 1);
        org.mockito.asm.ByteVector byteVector10 = byteVector6.putUTF8("");
        org.mockito.asm.ByteVector byteVector12 = byteVector10.putUTF8("hi!");
        org.junit.Assert.assertNotNull(byteVector2);
        org.junit.Assert.assertNotNull(byteVector4);
        org.junit.Assert.assertNotNull(byteVector6);
        org.junit.Assert.assertNotNull(byteVector8);
        org.junit.Assert.assertNotNull(byteVector10);
        org.junit.Assert.assertNotNull(byteVector12);
    }

    @Test
    public void test0292() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0292");
        org.mockito.asm.ByteVector byteVector0 = new org.mockito.asm.ByteVector();
        org.mockito.asm.ByteVector byteVector2 = byteVector0.putUTF8("hi!");
        org.mockito.asm.ByteVector byteVector4 = byteVector0.putLong((long) ' ');
        org.mockito.asm.ByteVector byteVector6 = byteVector4.putByte((int) 'a');
        org.mockito.asm.ByteVector byteVector8 = byteVector4.putByte((int) (short) -1);
        org.mockito.asm.ByteVector byteVector10 = byteVector4.putLong(0L);
        org.mockito.asm.ByteVector byteVector12 = byteVector4.putUTF8("hi!");
        org.mockito.asm.ByteVector byteVector14 = byteVector12.putUTF8("");
        org.mockito.asm.ByteVector byteVector16 = byteVector12.putInt((int) (byte) 10);
        org.mockito.asm.ByteVector byteVector18 = byteVector16.putLong((long) (short) -1);
        org.mockito.asm.ByteVector byteVector20 = byteVector16.putByte(0);
        java.lang.Class<?> wildcardClass21 = byteVector20.getClass();
        org.junit.Assert.assertNotNull(byteVector2);
        org.junit.Assert.assertNotNull(byteVector4);
        org.junit.Assert.assertNotNull(byteVector6);
        org.junit.Assert.assertNotNull(byteVector8);
        org.junit.Assert.assertNotNull(byteVector10);
        org.junit.Assert.assertNotNull(byteVector12);
        org.junit.Assert.assertNotNull(byteVector14);
        org.junit.Assert.assertNotNull(byteVector16);
        org.junit.Assert.assertNotNull(byteVector18);
        org.junit.Assert.assertNotNull(byteVector20);
        org.junit.Assert.assertNotNull(wildcardClass21);
    }

    @Test
    public void test0293() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0293");
        org.mockito.asm.ByteVector byteVector0 = new org.mockito.asm.ByteVector();
        org.mockito.asm.ByteVector byteVector2 = byteVector0.putUTF8("hi!");
        org.mockito.asm.ByteVector byteVector4 = byteVector2.putLong((long) (byte) 10);
        org.mockito.asm.ByteVector byteVector6 = byteVector4.putUTF8("hi!");
        org.mockito.asm.ByteVector byteVector8 = byteVector4.putLong((long) (short) -1);
        org.mockito.asm.ByteVector byteVector10 = byteVector8.putInt(10);
        org.mockito.asm.ByteVector byteVector12 = byteVector8.putByte((int) (short) 1);
        org.mockito.asm.ByteVector byteVector14 = byteVector12.putShort((int) (short) 100);
        org.mockito.asm.ByteVector byteVector16 = byteVector14.putByte(0);
        org.mockito.asm.ByteVector byteVector18 = byteVector16.putByte((int) (short) 100);
        org.mockito.asm.ByteVector byteVector20 = byteVector18.putUTF8("hi!");
        org.mockito.asm.ByteVector byteVector22 = byteVector18.putByte((int) (short) 10);
        java.lang.Class<?> wildcardClass23 = byteVector22.getClass();
        org.junit.Assert.assertNotNull(byteVector2);
        org.junit.Assert.assertNotNull(byteVector4);
        org.junit.Assert.assertNotNull(byteVector6);
        org.junit.Assert.assertNotNull(byteVector8);
        org.junit.Assert.assertNotNull(byteVector10);
        org.junit.Assert.assertNotNull(byteVector12);
        org.junit.Assert.assertNotNull(byteVector14);
        org.junit.Assert.assertNotNull(byteVector16);
        org.junit.Assert.assertNotNull(byteVector18);
        org.junit.Assert.assertNotNull(byteVector20);
        org.junit.Assert.assertNotNull(byteVector22);
        org.junit.Assert.assertNotNull(wildcardClass23);
    }

    @Test
    public void test0294() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0294");
        org.mockito.asm.ByteVector byteVector0 = new org.mockito.asm.ByteVector();
        org.mockito.asm.ByteVector byteVector2 = byteVector0.putUTF8("hi!");
        org.mockito.asm.ByteVector byteVector4 = byteVector0.putLong((long) ' ');
        org.mockito.asm.ByteVector byteVector6 = byteVector4.putByte((int) 'a');
        org.mockito.asm.ByteVector byteVector8 = byteVector4.putByte((int) (short) -1);
        org.mockito.asm.ByteVector byteVector10 = byteVector4.putLong(0L);
        org.mockito.asm.ByteVector byteVector12 = byteVector4.putUTF8("hi!");
        org.mockito.asm.ByteVector byteVector14 = byteVector12.putUTF8("hi!");
        org.mockito.asm.ByteVector byteVector16 = byteVector12.putByte((int) (byte) -1);
        org.mockito.asm.ByteVector byteVector18 = byteVector12.putLong((long) (-1));
        org.mockito.asm.ByteVector byteVector20 = byteVector18.putByte((int) (byte) 1);
        org.mockito.asm.ByteVector byteVector22 = byteVector18.putShort((int) (byte) 10);
        java.lang.Class<?> wildcardClass23 = byteVector22.getClass();
        org.junit.Assert.assertNotNull(byteVector2);
        org.junit.Assert.assertNotNull(byteVector4);
        org.junit.Assert.assertNotNull(byteVector6);
        org.junit.Assert.assertNotNull(byteVector8);
        org.junit.Assert.assertNotNull(byteVector10);
        org.junit.Assert.assertNotNull(byteVector12);
        org.junit.Assert.assertNotNull(byteVector14);
        org.junit.Assert.assertNotNull(byteVector16);
        org.junit.Assert.assertNotNull(byteVector18);
        org.junit.Assert.assertNotNull(byteVector20);
        org.junit.Assert.assertNotNull(byteVector22);
        org.junit.Assert.assertNotNull(wildcardClass23);
    }

    @Test
    public void test0295() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0295");
        org.mockito.asm.ByteVector byteVector0 = new org.mockito.asm.ByteVector();
        org.mockito.asm.ByteVector byteVector2 = byteVector0.putUTF8("hi!");
        org.mockito.asm.ByteVector byteVector4 = byteVector2.putByte(100);
        org.mockito.asm.ByteVector byteVector6 = byteVector2.putShort((int) 'a');
        org.mockito.asm.ByteVector byteVector8 = byteVector6.putLong((long) (byte) -1);
        java.lang.Class<?> wildcardClass9 = byteVector8.getClass();
        org.junit.Assert.assertNotNull(byteVector2);
        org.junit.Assert.assertNotNull(byteVector4);
        org.junit.Assert.assertNotNull(byteVector6);
        org.junit.Assert.assertNotNull(byteVector8);
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test0296() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0296");
        org.mockito.asm.ByteVector byteVector0 = new org.mockito.asm.ByteVector();
        org.mockito.asm.ByteVector byteVector2 = byteVector0.putUTF8("hi!");
        org.mockito.asm.ByteVector byteVector4 = byteVector0.putLong((long) ' ');
        org.mockito.asm.ByteVector byteVector6 = byteVector4.putByte((int) 'a');
        org.mockito.asm.ByteVector byteVector8 = byteVector4.putByte((int) (short) -1);
        org.mockito.asm.ByteVector byteVector10 = byteVector4.putLong(0L);
        org.mockito.asm.ByteVector byteVector12 = byteVector10.putInt((int) (short) -1);
        org.mockito.asm.ByteVector byteVector14 = byteVector12.putByte(100);
        org.mockito.asm.ByteVector byteVector16 = byteVector12.putShort((int) (short) 10);
        org.mockito.asm.ByteVector byteVector18 = new org.mockito.asm.ByteVector((int) (short) 0);
        org.mockito.asm.ByteVector byteVector19 = new org.mockito.asm.ByteVector();
        org.mockito.asm.ByteVector byteVector21 = byteVector19.putUTF8("hi!");
        org.mockito.asm.ByteVector byteVector23 = byteVector19.putInt(0);
        org.mockito.asm.ByteVector byteVector25 = byteVector23.putInt((int) ' ');
        org.mockito.asm.ByteVector byteVector27 = byteVector25.putLong(100L);
        byte[] byteArray31 = new byte[] { (byte) 0, (byte) 10, (byte) 1 };
        org.mockito.asm.ByteVector byteVector34 = byteVector25.putByteArray(byteArray31, 0, 0);
        org.mockito.asm.ByteVector byteVector37 = byteVector18.putByteArray(byteArray31, 1, (int) (short) 0);
        // The following exception was thrown during execution in test generation
        try {
            org.mockito.asm.ByteVector byteVector40 = byteVector16.putByteArray(byteArray31, (int) (byte) 0, 100);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteVector2);
        org.junit.Assert.assertNotNull(byteVector4);
        org.junit.Assert.assertNotNull(byteVector6);
        org.junit.Assert.assertNotNull(byteVector8);
        org.junit.Assert.assertNotNull(byteVector10);
        org.junit.Assert.assertNotNull(byteVector12);
        org.junit.Assert.assertNotNull(byteVector14);
        org.junit.Assert.assertNotNull(byteVector16);
        org.junit.Assert.assertNotNull(byteVector21);
        org.junit.Assert.assertNotNull(byteVector23);
        org.junit.Assert.assertNotNull(byteVector25);
        org.junit.Assert.assertNotNull(byteVector27);
        org.junit.Assert.assertNotNull(byteArray31);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray31), "[0, 10, 1]");
        org.junit.Assert.assertNotNull(byteVector34);
        org.junit.Assert.assertNotNull(byteVector37);
    }

    @Test
    public void test0297() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0297");
        org.mockito.asm.ByteVector byteVector1 = new org.mockito.asm.ByteVector((int) '#');
        org.mockito.asm.ByteVector byteVector3 = byteVector1.putInt(100);
        org.mockito.asm.ByteVector byteVector5 = byteVector3.putShort((int) (short) -1);
        org.mockito.asm.ByteVector byteVector7 = byteVector5.putShort((int) (short) 0);
        org.mockito.asm.ByteVector byteVector8 = new org.mockito.asm.ByteVector();
        org.mockito.asm.ByteVector byteVector10 = byteVector8.putUTF8("hi!");
        org.mockito.asm.ByteVector byteVector12 = byteVector8.putLong((long) ' ');
        org.mockito.asm.ByteVector byteVector14 = byteVector12.putByte((int) 'a');
        org.mockito.asm.ByteVector byteVector16 = byteVector12.putByte((int) (short) -1);
        org.mockito.asm.ByteVector byteVector18 = byteVector12.putLong(0L);
        org.mockito.asm.ByteVector byteVector20 = byteVector12.putUTF8("hi!");
        org.mockito.asm.ByteVector byteVector22 = byteVector20.putUTF8("");
        org.mockito.asm.ByteVector byteVector24 = byteVector20.putInt((int) (byte) 10);
        org.mockito.asm.ByteVector byteVector26 = byteVector20.putByte(0);
        org.mockito.asm.ByteVector byteVector27 = new org.mockito.asm.ByteVector();
        org.mockito.asm.ByteVector byteVector29 = byteVector27.putUTF8("hi!");
        org.mockito.asm.ByteVector byteVector31 = byteVector27.putInt(0);
        org.mockito.asm.ByteVector byteVector33 = byteVector31.putInt((int) ' ');
        org.mockito.asm.ByteVector byteVector35 = byteVector33.putLong(100L);
        byte[] byteArray39 = new byte[] { (byte) 0, (byte) 10, (byte) 1 };
        org.mockito.asm.ByteVector byteVector42 = byteVector33.putByteArray(byteArray39, 0, 0);
        org.mockito.asm.ByteVector byteVector45 = byteVector26.putByteArray(byteArray39, (int) (short) 1, 0);
        // The following exception was thrown during execution in test generation
        try {
            org.mockito.asm.ByteVector byteVector48 = byteVector5.putByteArray(byteArray39, (int) (short) 10, (int) (short) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteVector3);
        org.junit.Assert.assertNotNull(byteVector5);
        org.junit.Assert.assertNotNull(byteVector7);
        org.junit.Assert.assertNotNull(byteVector10);
        org.junit.Assert.assertNotNull(byteVector12);
        org.junit.Assert.assertNotNull(byteVector14);
        org.junit.Assert.assertNotNull(byteVector16);
        org.junit.Assert.assertNotNull(byteVector18);
        org.junit.Assert.assertNotNull(byteVector20);
        org.junit.Assert.assertNotNull(byteVector22);
        org.junit.Assert.assertNotNull(byteVector24);
        org.junit.Assert.assertNotNull(byteVector26);
        org.junit.Assert.assertNotNull(byteVector29);
        org.junit.Assert.assertNotNull(byteVector31);
        org.junit.Assert.assertNotNull(byteVector33);
        org.junit.Assert.assertNotNull(byteVector35);
        org.junit.Assert.assertNotNull(byteArray39);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray39), "[0, 10, 1]");
        org.junit.Assert.assertNotNull(byteVector42);
        org.junit.Assert.assertNotNull(byteVector45);
    }

    @Test
    public void test0298() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0298");
        org.mockito.asm.ByteVector byteVector0 = new org.mockito.asm.ByteVector();
        org.mockito.asm.ByteVector byteVector2 = byteVector0.putUTF8("hi!");
        org.mockito.asm.ByteVector byteVector4 = byteVector0.putLong((long) ' ');
        org.mockito.asm.ByteVector byteVector6 = byteVector4.putByte((int) 'a');
        org.mockito.asm.ByteVector byteVector8 = byteVector4.putByte((int) (short) -1);
        org.mockito.asm.ByteVector byteVector10 = byteVector4.putLong(0L);
        org.mockito.asm.ByteVector byteVector12 = byteVector10.putByte(0);
        org.mockito.asm.ByteVector byteVector14 = byteVector12.putByte(100);
        org.mockito.asm.ByteVector byteVector16 = byteVector12.putInt((-1));
        org.mockito.asm.ByteVector byteVector18 = byteVector12.putByte((int) (byte) 100);
        org.mockito.asm.ByteVector byteVector20 = byteVector18.putUTF8("hi!");
        java.lang.Class<?> wildcardClass21 = byteVector20.getClass();
        org.junit.Assert.assertNotNull(byteVector2);
        org.junit.Assert.assertNotNull(byteVector4);
        org.junit.Assert.assertNotNull(byteVector6);
        org.junit.Assert.assertNotNull(byteVector8);
        org.junit.Assert.assertNotNull(byteVector10);
        org.junit.Assert.assertNotNull(byteVector12);
        org.junit.Assert.assertNotNull(byteVector14);
        org.junit.Assert.assertNotNull(byteVector16);
        org.junit.Assert.assertNotNull(byteVector18);
        org.junit.Assert.assertNotNull(byteVector20);
        org.junit.Assert.assertNotNull(wildcardClass21);
    }

    @Test
    public void test0299() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0299");
        org.mockito.asm.ByteVector byteVector0 = new org.mockito.asm.ByteVector();
        org.mockito.asm.ByteVector byteVector2 = byteVector0.putUTF8("hi!");
        org.mockito.asm.ByteVector byteVector4 = byteVector2.putInt((int) (byte) 10);
        org.mockito.asm.ByteVector byteVector6 = byteVector4.putUTF8("");
        org.mockito.asm.ByteVector byteVector8 = byteVector4.putLong((long) '#');
        org.mockito.asm.ByteVector byteVector10 = byteVector8.putLong((long) (short) 100);
        org.mockito.asm.ByteVector byteVector12 = byteVector10.putInt((int) ' ');
        org.mockito.asm.ByteVector byteVector13 = new org.mockito.asm.ByteVector();
        org.mockito.asm.ByteVector byteVector15 = byteVector13.putUTF8("hi!");
        org.mockito.asm.ByteVector byteVector17 = byteVector13.putLong((long) ' ');
        org.mockito.asm.ByteVector byteVector19 = byteVector17.putByte((int) 'a');
        org.mockito.asm.ByteVector byteVector21 = byteVector17.putByte((int) (short) -1);
        org.mockito.asm.ByteVector byteVector23 = byteVector17.putLong(0L);
        org.mockito.asm.ByteVector byteVector25 = byteVector23.putInt((int) (short) -1);
        org.mockito.asm.ByteVector byteVector27 = byteVector25.putByte(100);
        org.mockito.asm.ByteVector byteVector29 = byteVector27.putUTF8("hi!");
        org.mockito.asm.ByteVector byteVector31 = byteVector27.putLong((long) (short) 0);
        org.mockito.asm.ByteVector byteVector32 = new org.mockito.asm.ByteVector();
        org.mockito.asm.ByteVector byteVector34 = byteVector32.putUTF8("hi!");
        org.mockito.asm.ByteVector byteVector36 = byteVector32.putLong((long) ' ');
        org.mockito.asm.ByteVector byteVector38 = byteVector36.putByte((int) 'a');
        org.mockito.asm.ByteVector byteVector40 = byteVector36.putByte((int) (short) -1);
        org.mockito.asm.ByteVector byteVector42 = byteVector36.putLong(0L);
        org.mockito.asm.ByteVector byteVector44 = byteVector36.putUTF8("hi!");
        org.mockito.asm.ByteVector byteVector46 = byteVector44.putUTF8("");
        org.mockito.asm.ByteVector byteVector48 = byteVector44.putInt((int) (byte) 10);
        org.mockito.asm.ByteVector byteVector50 = byteVector44.putByte(0);
        org.mockito.asm.ByteVector byteVector51 = new org.mockito.asm.ByteVector();
        org.mockito.asm.ByteVector byteVector53 = byteVector51.putUTF8("hi!");
        org.mockito.asm.ByteVector byteVector55 = byteVector51.putInt(0);
        org.mockito.asm.ByteVector byteVector57 = byteVector55.putInt((int) ' ');
        org.mockito.asm.ByteVector byteVector59 = byteVector57.putLong(100L);
        byte[] byteArray63 = new byte[] { (byte) 0, (byte) 10, (byte) 1 };
        org.mockito.asm.ByteVector byteVector66 = byteVector57.putByteArray(byteArray63, 0, 0);
        org.mockito.asm.ByteVector byteVector69 = byteVector50.putByteArray(byteArray63, (int) (short) 1, 0);
        org.mockito.asm.ByteVector byteVector72 = byteVector31.putByteArray(byteArray63, (int) (byte) 0, (int) (byte) 1);
        // The following exception was thrown during execution in test generation
        try {
            org.mockito.asm.ByteVector byteVector75 = byteVector10.putByteArray(byteArray63, (int) (short) 1, (int) (byte) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteVector2);
        org.junit.Assert.assertNotNull(byteVector4);
        org.junit.Assert.assertNotNull(byteVector6);
        org.junit.Assert.assertNotNull(byteVector8);
        org.junit.Assert.assertNotNull(byteVector10);
        org.junit.Assert.assertNotNull(byteVector12);
        org.junit.Assert.assertNotNull(byteVector15);
        org.junit.Assert.assertNotNull(byteVector17);
        org.junit.Assert.assertNotNull(byteVector19);
        org.junit.Assert.assertNotNull(byteVector21);
        org.junit.Assert.assertNotNull(byteVector23);
        org.junit.Assert.assertNotNull(byteVector25);
        org.junit.Assert.assertNotNull(byteVector27);
        org.junit.Assert.assertNotNull(byteVector29);
        org.junit.Assert.assertNotNull(byteVector31);
        org.junit.Assert.assertNotNull(byteVector34);
        org.junit.Assert.assertNotNull(byteVector36);
        org.junit.Assert.assertNotNull(byteVector38);
        org.junit.Assert.assertNotNull(byteVector40);
        org.junit.Assert.assertNotNull(byteVector42);
        org.junit.Assert.assertNotNull(byteVector44);
        org.junit.Assert.assertNotNull(byteVector46);
        org.junit.Assert.assertNotNull(byteVector48);
        org.junit.Assert.assertNotNull(byteVector50);
        org.junit.Assert.assertNotNull(byteVector53);
        org.junit.Assert.assertNotNull(byteVector55);
        org.junit.Assert.assertNotNull(byteVector57);
        org.junit.Assert.assertNotNull(byteVector59);
        org.junit.Assert.assertNotNull(byteArray63);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray63), "[0, 10, 1]");
        org.junit.Assert.assertNotNull(byteVector66);
        org.junit.Assert.assertNotNull(byteVector69);
        org.junit.Assert.assertNotNull(byteVector72);
    }

    @Test
    public void test0300() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0300");
        org.mockito.asm.ByteVector byteVector0 = new org.mockito.asm.ByteVector();
        org.mockito.asm.ByteVector byteVector2 = byteVector0.putUTF8("hi!");
        org.mockito.asm.ByteVector byteVector4 = byteVector2.putInt(0);
        org.mockito.asm.ByteVector byteVector6 = byteVector4.putByte((int) (byte) 1);
        org.mockito.asm.ByteVector byteVector8 = byteVector6.putShort((int) '4');
        java.lang.Class<?> wildcardClass9 = byteVector6.getClass();
        org.junit.Assert.assertNotNull(byteVector2);
        org.junit.Assert.assertNotNull(byteVector4);
        org.junit.Assert.assertNotNull(byteVector6);
        org.junit.Assert.assertNotNull(byteVector8);
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test0301() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0301");
        org.mockito.asm.ByteVector byteVector0 = new org.mockito.asm.ByteVector();
        org.mockito.asm.ByteVector byteVector2 = byteVector0.putUTF8("hi!");
        org.mockito.asm.ByteVector byteVector4 = byteVector0.putLong((long) ' ');
        org.mockito.asm.ByteVector byteVector6 = byteVector4.putByte((int) 'a');
        org.mockito.asm.ByteVector byteVector8 = byteVector4.putByte((int) (short) -1);
        org.mockito.asm.ByteVector byteVector10 = byteVector4.putLong(0L);
        org.mockito.asm.ByteVector byteVector12 = byteVector10.putByte(0);
        org.mockito.asm.ByteVector byteVector14 = byteVector12.putLong(1L);
        org.mockito.asm.ByteVector byteVector16 = byteVector14.putShort((int) 'a');
        org.mockito.asm.ByteVector byteVector18 = byteVector14.putLong((long) 10);
        org.mockito.asm.ByteVector byteVector20 = byteVector14.putUTF8("");
        org.mockito.asm.ByteVector byteVector21 = new org.mockito.asm.ByteVector();
        org.mockito.asm.ByteVector byteVector23 = byteVector21.putUTF8("hi!");
        org.mockito.asm.ByteVector byteVector25 = byteVector23.putLong((long) (byte) 10);
        org.mockito.asm.ByteVector byteVector27 = byteVector25.putUTF8("hi!");
        org.mockito.asm.ByteVector byteVector29 = byteVector25.putLong((long) (short) -1);
        org.mockito.asm.ByteVector byteVector31 = byteVector29.putInt(10);
        org.mockito.asm.ByteVector byteVector33 = byteVector29.putByte((int) (short) 1);
        org.mockito.asm.ByteVector byteVector35 = byteVector29.putInt((int) (short) -1);
        org.mockito.asm.ByteVector byteVector37 = byteVector29.putUTF8("hi!");
        org.mockito.asm.ByteVector byteVector38 = new org.mockito.asm.ByteVector();
        org.mockito.asm.ByteVector byteVector40 = byteVector38.putUTF8("hi!");
        org.mockito.asm.ByteVector byteVector42 = byteVector38.putLong((long) ' ');
        org.mockito.asm.ByteVector byteVector44 = byteVector42.putByte((int) 'a');
        org.mockito.asm.ByteVector byteVector46 = byteVector42.putByte((int) (short) -1);
        org.mockito.asm.ByteVector byteVector48 = byteVector42.putLong(0L);
        org.mockito.asm.ByteVector byteVector50 = byteVector42.putUTF8("hi!");
        org.mockito.asm.ByteVector byteVector52 = byteVector50.putUTF8("");
        org.mockito.asm.ByteVector byteVector54 = byteVector52.putLong((long) (byte) 10);
        org.mockito.asm.ByteVector byteVector56 = byteVector52.putLong((long) (short) 100);
        byte[] byteArray61 = new byte[] { (byte) 1, (byte) 0, (byte) 0, (byte) -1 };
        org.mockito.asm.ByteVector byteVector64 = byteVector52.putByteArray(byteArray61, 0, 0);
        org.mockito.asm.ByteVector byteVector67 = byteVector37.putByteArray(byteArray61, (int) (byte) 0, (int) (short) 1);
        org.mockito.asm.ByteVector byteVector70 = byteVector14.putByteArray(byteArray61, (int) (short) 0, (int) (short) 0);
        org.mockito.asm.ByteVector byteVector72 = byteVector14.putLong(1L);
        org.junit.Assert.assertNotNull(byteVector2);
        org.junit.Assert.assertNotNull(byteVector4);
        org.junit.Assert.assertNotNull(byteVector6);
        org.junit.Assert.assertNotNull(byteVector8);
        org.junit.Assert.assertNotNull(byteVector10);
        org.junit.Assert.assertNotNull(byteVector12);
        org.junit.Assert.assertNotNull(byteVector14);
        org.junit.Assert.assertNotNull(byteVector16);
        org.junit.Assert.assertNotNull(byteVector18);
        org.junit.Assert.assertNotNull(byteVector20);
        org.junit.Assert.assertNotNull(byteVector23);
        org.junit.Assert.assertNotNull(byteVector25);
        org.junit.Assert.assertNotNull(byteVector27);
        org.junit.Assert.assertNotNull(byteVector29);
        org.junit.Assert.assertNotNull(byteVector31);
        org.junit.Assert.assertNotNull(byteVector33);
        org.junit.Assert.assertNotNull(byteVector35);
        org.junit.Assert.assertNotNull(byteVector37);
        org.junit.Assert.assertNotNull(byteVector40);
        org.junit.Assert.assertNotNull(byteVector42);
        org.junit.Assert.assertNotNull(byteVector44);
        org.junit.Assert.assertNotNull(byteVector46);
        org.junit.Assert.assertNotNull(byteVector48);
        org.junit.Assert.assertNotNull(byteVector50);
        org.junit.Assert.assertNotNull(byteVector52);
        org.junit.Assert.assertNotNull(byteVector54);
        org.junit.Assert.assertNotNull(byteVector56);
        org.junit.Assert.assertNotNull(byteArray61);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray61), "[1, 0, 0, -1]");
        org.junit.Assert.assertNotNull(byteVector64);
        org.junit.Assert.assertNotNull(byteVector67);
        org.junit.Assert.assertNotNull(byteVector70);
        org.junit.Assert.assertNotNull(byteVector72);
    }

    @Test
    public void test0302() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0302");
        org.mockito.asm.ByteVector byteVector0 = new org.mockito.asm.ByteVector();
        org.mockito.asm.ByteVector byteVector2 = byteVector0.putUTF8("hi!");
        org.mockito.asm.ByteVector byteVector4 = byteVector0.putLong((long) ' ');
        org.mockito.asm.ByteVector byteVector6 = byteVector4.putByte((int) 'a');
        org.mockito.asm.ByteVector byteVector8 = byteVector4.putByte((int) (short) -1);
        org.mockito.asm.ByteVector byteVector10 = byteVector4.putLong(0L);
        org.mockito.asm.ByteVector byteVector12 = byteVector10.putInt((int) (short) -1);
        org.mockito.asm.ByteVector byteVector14 = byteVector12.putByte(100);
        org.mockito.asm.ByteVector byteVector16 = byteVector12.putShort((int) (short) 10);
        org.mockito.asm.ByteVector byteVector18 = byteVector16.putByte((int) (short) 0);
        java.lang.Class<?> wildcardClass19 = byteVector16.getClass();
        org.junit.Assert.assertNotNull(byteVector2);
        org.junit.Assert.assertNotNull(byteVector4);
        org.junit.Assert.assertNotNull(byteVector6);
        org.junit.Assert.assertNotNull(byteVector8);
        org.junit.Assert.assertNotNull(byteVector10);
        org.junit.Assert.assertNotNull(byteVector12);
        org.junit.Assert.assertNotNull(byteVector14);
        org.junit.Assert.assertNotNull(byteVector16);
        org.junit.Assert.assertNotNull(byteVector18);
        org.junit.Assert.assertNotNull(wildcardClass19);
    }

    @Test
    public void test0303() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0303");
        org.mockito.asm.ByteVector byteVector0 = new org.mockito.asm.ByteVector();
        org.mockito.asm.ByteVector byteVector2 = byteVector0.putUTF8("hi!");
        org.mockito.asm.ByteVector byteVector4 = byteVector0.putInt(0);
        org.mockito.asm.ByteVector byteVector6 = byteVector4.putInt((int) ' ');
        org.mockito.asm.ByteVector byteVector8 = byteVector6.putLong((long) (short) 10);
        org.mockito.asm.ByteVector byteVector10 = byteVector8.putUTF8("hi!");
        org.mockito.asm.ByteVector byteVector12 = byteVector8.putByte(0);
        org.mockito.asm.ByteVector byteVector14 = byteVector12.putInt((int) (short) 1);
        org.mockito.asm.ByteVector byteVector16 = byteVector14.putByte(100);
        org.junit.Assert.assertNotNull(byteVector2);
        org.junit.Assert.assertNotNull(byteVector4);
        org.junit.Assert.assertNotNull(byteVector6);
        org.junit.Assert.assertNotNull(byteVector8);
        org.junit.Assert.assertNotNull(byteVector10);
        org.junit.Assert.assertNotNull(byteVector12);
        org.junit.Assert.assertNotNull(byteVector14);
        org.junit.Assert.assertNotNull(byteVector16);
    }

    @Test
    public void test0304() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0304");
        org.mockito.asm.ByteVector byteVector0 = new org.mockito.asm.ByteVector();
        org.mockito.asm.ByteVector byteVector2 = byteVector0.putUTF8("hi!");
        org.mockito.asm.ByteVector byteVector4 = byteVector2.putLong((long) (byte) 10);
        org.mockito.asm.ByteVector byteVector6 = byteVector2.putInt((int) (short) 1);
        org.mockito.asm.ByteVector byteVector8 = byteVector2.putLong((long) (short) 10);
        org.mockito.asm.ByteVector byteVector10 = byteVector8.putShort((int) (byte) 0);
        java.lang.Class<?> wildcardClass11 = byteVector10.getClass();
        org.junit.Assert.assertNotNull(byteVector2);
        org.junit.Assert.assertNotNull(byteVector4);
        org.junit.Assert.assertNotNull(byteVector6);
        org.junit.Assert.assertNotNull(byteVector8);
        org.junit.Assert.assertNotNull(byteVector10);
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test0305() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0305");
        org.mockito.asm.ByteVector byteVector1 = new org.mockito.asm.ByteVector((int) '#');
        org.mockito.asm.ByteVector byteVector3 = byteVector1.putLong(100L);
        org.mockito.asm.ByteVector byteVector5 = byteVector1.putUTF8("");
        org.mockito.asm.ByteVector byteVector7 = byteVector1.putUTF8("hi!");
        org.mockito.asm.ByteVector byteVector9 = byteVector7.putLong((long) (short) 0);
        org.mockito.asm.ByteVector byteVector11 = byteVector9.putShort((int) (byte) 10);
        org.mockito.asm.ByteVector byteVector13 = byteVector9.putUTF8("hi!");
        java.lang.Class<?> wildcardClass14 = byteVector9.getClass();
        org.junit.Assert.assertNotNull(byteVector3);
        org.junit.Assert.assertNotNull(byteVector5);
        org.junit.Assert.assertNotNull(byteVector7);
        org.junit.Assert.assertNotNull(byteVector9);
        org.junit.Assert.assertNotNull(byteVector11);
        org.junit.Assert.assertNotNull(byteVector13);
        org.junit.Assert.assertNotNull(wildcardClass14);
    }

    @Test
    public void test0306() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0306");
        org.mockito.asm.ByteVector byteVector0 = new org.mockito.asm.ByteVector();
        org.mockito.asm.ByteVector byteVector2 = byteVector0.putUTF8("hi!");
        org.mockito.asm.ByteVector byteVector4 = byteVector0.putInt(0);
        org.mockito.asm.ByteVector byteVector6 = byteVector0.putShort((int) '4');
        org.mockito.asm.ByteVector byteVector8 = byteVector0.putByte(100);
        org.mockito.asm.ByteVector byteVector10 = byteVector8.putInt((int) (byte) 10);
        org.mockito.asm.ByteVector byteVector12 = byteVector8.putUTF8("");
        java.lang.Class<?> wildcardClass13 = byteVector8.getClass();
        org.junit.Assert.assertNotNull(byteVector2);
        org.junit.Assert.assertNotNull(byteVector4);
        org.junit.Assert.assertNotNull(byteVector6);
        org.junit.Assert.assertNotNull(byteVector8);
        org.junit.Assert.assertNotNull(byteVector10);
        org.junit.Assert.assertNotNull(byteVector12);
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test0307() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0307");
        org.mockito.asm.ByteVector byteVector0 = new org.mockito.asm.ByteVector();
        org.mockito.asm.ByteVector byteVector2 = byteVector0.putUTF8("hi!");
        org.mockito.asm.ByteVector byteVector4 = byteVector0.putLong((long) ' ');
        org.mockito.asm.ByteVector byteVector6 = byteVector4.putByte((int) 'a');
        org.mockito.asm.ByteVector byteVector8 = byteVector4.putByte(100);
        java.lang.Class<?> wildcardClass9 = byteVector8.getClass();
        org.junit.Assert.assertNotNull(byteVector2);
        org.junit.Assert.assertNotNull(byteVector4);
        org.junit.Assert.assertNotNull(byteVector6);
        org.junit.Assert.assertNotNull(byteVector8);
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test0308() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0308");
        org.mockito.asm.ByteVector byteVector1 = new org.mockito.asm.ByteVector((int) (byte) 1);
        org.mockito.asm.ByteVector byteVector3 = byteVector1.putByte((int) (short) 1);
        org.mockito.asm.ByteVector byteVector5 = byteVector3.putLong((long) (-1));
        org.mockito.asm.ByteVector byteVector7 = byteVector3.putInt((int) (short) 0);
        org.mockito.asm.ByteVector byteVector9 = byteVector7.putByte((int) '#');
        org.junit.Assert.assertNotNull(byteVector3);
        org.junit.Assert.assertNotNull(byteVector5);
        org.junit.Assert.assertNotNull(byteVector7);
        org.junit.Assert.assertNotNull(byteVector9);
    }

    @Test
    public void test0309() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0309");
        org.mockito.asm.ByteVector byteVector0 = new org.mockito.asm.ByteVector();
        org.mockito.asm.ByteVector byteVector2 = byteVector0.putUTF8("hi!");
        org.mockito.asm.ByteVector byteVector4 = byteVector2.putByte(100);
        org.mockito.asm.ByteVector byteVector6 = byteVector2.putShort((int) 'a');
        org.mockito.asm.ByteVector byteVector8 = byteVector6.putByte((int) (short) 1);
        org.mockito.asm.ByteVector byteVector10 = byteVector8.putLong((long) 0);
        org.mockito.asm.ByteVector byteVector12 = byteVector8.putByte(0);
        org.junit.Assert.assertNotNull(byteVector2);
        org.junit.Assert.assertNotNull(byteVector4);
        org.junit.Assert.assertNotNull(byteVector6);
        org.junit.Assert.assertNotNull(byteVector8);
        org.junit.Assert.assertNotNull(byteVector10);
        org.junit.Assert.assertNotNull(byteVector12);
    }

    @Test
    public void test0310() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0310");
        org.mockito.asm.ByteVector byteVector0 = new org.mockito.asm.ByteVector();
        org.mockito.asm.ByteVector byteVector2 = byteVector0.putUTF8("hi!");
        org.mockito.asm.ByteVector byteVector4 = byteVector0.putLong((long) ' ');
        org.mockito.asm.ByteVector byteVector6 = byteVector4.putByte((int) 'a');
        org.mockito.asm.ByteVector byteVector8 = byteVector4.putByte((int) (short) -1);
        org.mockito.asm.ByteVector byteVector10 = byteVector4.putLong(0L);
        org.mockito.asm.ByteVector byteVector12 = byteVector10.putInt((int) (short) -1);
        org.mockito.asm.ByteVector byteVector14 = byteVector12.putByte(100);
        org.mockito.asm.ByteVector byteVector16 = byteVector12.putShort((int) (short) 10);
        org.mockito.asm.ByteVector byteVector18 = byteVector16.putByte((int) (byte) -1);
        java.lang.Class<?> wildcardClass19 = byteVector18.getClass();
        org.junit.Assert.assertNotNull(byteVector2);
        org.junit.Assert.assertNotNull(byteVector4);
        org.junit.Assert.assertNotNull(byteVector6);
        org.junit.Assert.assertNotNull(byteVector8);
        org.junit.Assert.assertNotNull(byteVector10);
        org.junit.Assert.assertNotNull(byteVector12);
        org.junit.Assert.assertNotNull(byteVector14);
        org.junit.Assert.assertNotNull(byteVector16);
        org.junit.Assert.assertNotNull(byteVector18);
        org.junit.Assert.assertNotNull(wildcardClass19);
    }

    @Test
    public void test0311() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0311");
        org.mockito.asm.ByteVector byteVector0 = new org.mockito.asm.ByteVector();
        org.mockito.asm.ByteVector byteVector2 = byteVector0.putUTF8("hi!");
        org.mockito.asm.ByteVector byteVector4 = byteVector0.putLong((long) ' ');
        org.mockito.asm.ByteVector byteVector6 = byteVector4.putByte((int) 'a');
        org.mockito.asm.ByteVector byteVector8 = byteVector4.putByte((int) (short) -1);
        org.mockito.asm.ByteVector byteVector10 = byteVector4.putLong(0L);
        org.mockito.asm.ByteVector byteVector12 = byteVector10.putByte(0);
        org.mockito.asm.ByteVector byteVector14 = byteVector12.putByte(100);
        org.mockito.asm.ByteVector byteVector16 = byteVector12.putInt((-1));
        org.mockito.asm.ByteVector byteVector18 = byteVector12.putByte((int) (byte) 100);
        org.mockito.asm.ByteVector byteVector20 = byteVector12.putInt((int) (short) 1);
        org.mockito.asm.ByteVector byteVector22 = byteVector20.putByte((int) ' ');
        org.mockito.asm.ByteVector byteVector24 = byteVector20.putUTF8("");
        org.mockito.asm.ByteVector byteVector26 = byteVector24.putByte((int) '4');
        org.junit.Assert.assertNotNull(byteVector2);
        org.junit.Assert.assertNotNull(byteVector4);
        org.junit.Assert.assertNotNull(byteVector6);
        org.junit.Assert.assertNotNull(byteVector8);
        org.junit.Assert.assertNotNull(byteVector10);
        org.junit.Assert.assertNotNull(byteVector12);
        org.junit.Assert.assertNotNull(byteVector14);
        org.junit.Assert.assertNotNull(byteVector16);
        org.junit.Assert.assertNotNull(byteVector18);
        org.junit.Assert.assertNotNull(byteVector20);
        org.junit.Assert.assertNotNull(byteVector22);
        org.junit.Assert.assertNotNull(byteVector24);
        org.junit.Assert.assertNotNull(byteVector26);
    }

    @Test
    public void test0312() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0312");
        org.mockito.asm.ByteVector byteVector0 = new org.mockito.asm.ByteVector();
        org.mockito.asm.ByteVector byteVector2 = byteVector0.putUTF8("hi!");
        org.mockito.asm.ByteVector byteVector4 = byteVector0.putShort((int) (short) -1);
        org.mockito.asm.ByteVector byteVector6 = byteVector0.putInt((int) (byte) 10);
        org.mockito.asm.ByteVector byteVector8 = byteVector6.putUTF8("hi!");
        org.mockito.asm.ByteVector byteVector10 = byteVector8.putByte((int) (byte) 1);
        java.lang.Class<?> wildcardClass11 = byteVector10.getClass();
        org.junit.Assert.assertNotNull(byteVector2);
        org.junit.Assert.assertNotNull(byteVector4);
        org.junit.Assert.assertNotNull(byteVector6);
        org.junit.Assert.assertNotNull(byteVector8);
        org.junit.Assert.assertNotNull(byteVector10);
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test0313() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0313");
        org.mockito.asm.ByteVector byteVector0 = new org.mockito.asm.ByteVector();
        org.mockito.asm.ByteVector byteVector2 = byteVector0.putUTF8("hi!");
        org.mockito.asm.ByteVector byteVector4 = byteVector2.putLong((long) (byte) 10);
        org.mockito.asm.ByteVector byteVector6 = byteVector4.putUTF8("hi!");
        org.mockito.asm.ByteVector byteVector8 = byteVector4.putLong((long) (short) -1);
        byte[] byteArray9 = null;
        org.mockito.asm.ByteVector byteVector12 = byteVector4.putByteArray(byteArray9, (int) (short) -1, (int) '4');
        org.mockito.asm.ByteVector byteVector14 = byteVector12.putLong(10L);
        org.mockito.asm.ByteVector byteVector16 = new org.mockito.asm.ByteVector((int) (byte) 10);
        org.mockito.asm.ByteVector byteVector18 = byteVector16.putByte((int) '4');
        org.mockito.asm.ByteVector byteVector20 = byteVector16.putLong((long) 'a');
        org.mockito.asm.ByteVector byteVector21 = new org.mockito.asm.ByteVector();
        org.mockito.asm.ByteVector byteVector23 = byteVector21.putUTF8("hi!");
        org.mockito.asm.ByteVector byteVector25 = byteVector21.putLong((long) ' ');
        org.mockito.asm.ByteVector byteVector27 = byteVector25.putByte((int) 'a');
        org.mockito.asm.ByteVector byteVector29 = byteVector25.putByte((int) (short) -1);
        org.mockito.asm.ByteVector byteVector31 = byteVector25.putLong(0L);
        org.mockito.asm.ByteVector byteVector33 = byteVector25.putUTF8("hi!");
        org.mockito.asm.ByteVector byteVector35 = byteVector33.putUTF8("");
        org.mockito.asm.ByteVector byteVector37 = byteVector33.putInt((int) (byte) 10);
        org.mockito.asm.ByteVector byteVector39 = byteVector33.putByte(0);
        org.mockito.asm.ByteVector byteVector40 = new org.mockito.asm.ByteVector();
        org.mockito.asm.ByteVector byteVector42 = byteVector40.putUTF8("hi!");
        org.mockito.asm.ByteVector byteVector44 = byteVector40.putInt(0);
        org.mockito.asm.ByteVector byteVector46 = byteVector44.putInt((int) ' ');
        org.mockito.asm.ByteVector byteVector48 = byteVector46.putLong(100L);
        byte[] byteArray52 = new byte[] { (byte) 0, (byte) 10, (byte) 1 };
        org.mockito.asm.ByteVector byteVector55 = byteVector46.putByteArray(byteArray52, 0, 0);
        org.mockito.asm.ByteVector byteVector58 = byteVector39.putByteArray(byteArray52, (int) (short) 1, 0);
        org.mockito.asm.ByteVector byteVector61 = byteVector20.putByteArray(byteArray52, 0, 0);
        // The following exception was thrown during execution in test generation
        try {
            org.mockito.asm.ByteVector byteVector64 = byteVector14.putByteArray(byteArray52, (int) (short) 100, 0);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteVector2);
        org.junit.Assert.assertNotNull(byteVector4);
        org.junit.Assert.assertNotNull(byteVector6);
        org.junit.Assert.assertNotNull(byteVector8);
        org.junit.Assert.assertNotNull(byteVector12);
        org.junit.Assert.assertNotNull(byteVector14);
        org.junit.Assert.assertNotNull(byteVector18);
        org.junit.Assert.assertNotNull(byteVector20);
        org.junit.Assert.assertNotNull(byteVector23);
        org.junit.Assert.assertNotNull(byteVector25);
        org.junit.Assert.assertNotNull(byteVector27);
        org.junit.Assert.assertNotNull(byteVector29);
        org.junit.Assert.assertNotNull(byteVector31);
        org.junit.Assert.assertNotNull(byteVector33);
        org.junit.Assert.assertNotNull(byteVector35);
        org.junit.Assert.assertNotNull(byteVector37);
        org.junit.Assert.assertNotNull(byteVector39);
        org.junit.Assert.assertNotNull(byteVector42);
        org.junit.Assert.assertNotNull(byteVector44);
        org.junit.Assert.assertNotNull(byteVector46);
        org.junit.Assert.assertNotNull(byteVector48);
        org.junit.Assert.assertNotNull(byteArray52);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray52), "[0, 10, 1]");
        org.junit.Assert.assertNotNull(byteVector55);
        org.junit.Assert.assertNotNull(byteVector58);
        org.junit.Assert.assertNotNull(byteVector61);
    }

    @Test
    public void test0314() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0314");
        org.mockito.asm.ByteVector byteVector0 = new org.mockito.asm.ByteVector();
        org.mockito.asm.ByteVector byteVector2 = byteVector0.putUTF8("hi!");
        org.mockito.asm.ByteVector byteVector4 = byteVector2.putInt((int) (byte) 10);
        org.mockito.asm.ByteVector byteVector6 = byteVector4.putUTF8("");
        org.mockito.asm.ByteVector byteVector8 = byteVector4.putLong((long) '#');
        org.mockito.asm.ByteVector byteVector10 = byteVector8.putLong((long) (short) 100);
        org.mockito.asm.ByteVector byteVector12 = byteVector10.putInt((int) ' ');
        org.mockito.asm.ByteVector byteVector14 = byteVector12.putLong(0L);
        org.junit.Assert.assertNotNull(byteVector2);
        org.junit.Assert.assertNotNull(byteVector4);
        org.junit.Assert.assertNotNull(byteVector6);
        org.junit.Assert.assertNotNull(byteVector8);
        org.junit.Assert.assertNotNull(byteVector10);
        org.junit.Assert.assertNotNull(byteVector12);
        org.junit.Assert.assertNotNull(byteVector14);
    }

    @Test
    public void test0315() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0315");
        org.mockito.asm.ByteVector byteVector1 = new org.mockito.asm.ByteVector((int) '#');
        org.mockito.asm.ByteVector byteVector3 = byteVector1.putLong(100L);
        org.mockito.asm.ByteVector byteVector5 = byteVector3.putLong(1L);
        org.mockito.asm.ByteVector byteVector7 = byteVector5.putUTF8("hi!");
        org.mockito.asm.ByteVector byteVector9 = byteVector7.putUTF8("");
        org.mockito.asm.ByteVector byteVector11 = byteVector7.putInt((int) (short) 1);
        org.mockito.asm.ByteVector byteVector13 = byteVector7.putInt((int) (short) 0);
        org.junit.Assert.assertNotNull(byteVector3);
        org.junit.Assert.assertNotNull(byteVector5);
        org.junit.Assert.assertNotNull(byteVector7);
        org.junit.Assert.assertNotNull(byteVector9);
        org.junit.Assert.assertNotNull(byteVector11);
        org.junit.Assert.assertNotNull(byteVector13);
    }

    @Test
    public void test0316() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0316");
        org.mockito.asm.ByteVector byteVector0 = new org.mockito.asm.ByteVector();
        org.mockito.asm.ByteVector byteVector2 = byteVector0.putUTF8("hi!");
        org.mockito.asm.ByteVector byteVector4 = byteVector2.putByte(100);
        org.mockito.asm.ByteVector byteVector6 = byteVector2.putShort((int) 'a');
        org.mockito.asm.ByteVector byteVector8 = byteVector6.putByte((int) (short) 1);
        org.mockito.asm.ByteVector byteVector10 = byteVector8.putLong((long) (short) 100);
        org.mockito.asm.ByteVector byteVector11 = new org.mockito.asm.ByteVector();
        org.mockito.asm.ByteVector byteVector13 = byteVector11.putUTF8("hi!");
        org.mockito.asm.ByteVector byteVector15 = byteVector13.putLong((long) (byte) 10);
        org.mockito.asm.ByteVector byteVector17 = byteVector15.putUTF8("hi!");
        org.mockito.asm.ByteVector byteVector19 = byteVector15.putLong((-1L));
        org.mockito.asm.ByteVector byteVector21 = new org.mockito.asm.ByteVector((int) (short) 0);
        org.mockito.asm.ByteVector byteVector22 = new org.mockito.asm.ByteVector();
        org.mockito.asm.ByteVector byteVector24 = byteVector22.putUTF8("hi!");
        org.mockito.asm.ByteVector byteVector26 = byteVector22.putInt(0);
        org.mockito.asm.ByteVector byteVector28 = byteVector26.putInt((int) ' ');
        org.mockito.asm.ByteVector byteVector30 = byteVector28.putLong(100L);
        byte[] byteArray34 = new byte[] { (byte) 0, (byte) 10, (byte) 1 };
        org.mockito.asm.ByteVector byteVector37 = byteVector28.putByteArray(byteArray34, 0, 0);
        org.mockito.asm.ByteVector byteVector40 = byteVector21.putByteArray(byteArray34, 1, (int) (short) 0);
        org.mockito.asm.ByteVector byteVector43 = byteVector19.putByteArray(byteArray34, 0, (int) (byte) 1);
        // The following exception was thrown during execution in test generation
        try {
            org.mockito.asm.ByteVector byteVector46 = byteVector10.putByteArray(byteArray34, 0, (int) 'a');
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteVector2);
        org.junit.Assert.assertNotNull(byteVector4);
        org.junit.Assert.assertNotNull(byteVector6);
        org.junit.Assert.assertNotNull(byteVector8);
        org.junit.Assert.assertNotNull(byteVector10);
        org.junit.Assert.assertNotNull(byteVector13);
        org.junit.Assert.assertNotNull(byteVector15);
        org.junit.Assert.assertNotNull(byteVector17);
        org.junit.Assert.assertNotNull(byteVector19);
        org.junit.Assert.assertNotNull(byteVector24);
        org.junit.Assert.assertNotNull(byteVector26);
        org.junit.Assert.assertNotNull(byteVector28);
        org.junit.Assert.assertNotNull(byteVector30);
        org.junit.Assert.assertNotNull(byteArray34);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray34), "[0, 10, 1]");
        org.junit.Assert.assertNotNull(byteVector37);
        org.junit.Assert.assertNotNull(byteVector40);
        org.junit.Assert.assertNotNull(byteVector43);
    }

    @Test
    public void test0317() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0317");
        org.mockito.asm.ByteVector byteVector0 = new org.mockito.asm.ByteVector();
        org.mockito.asm.ByteVector byteVector2 = byteVector0.putUTF8("hi!");
        org.mockito.asm.ByteVector byteVector4 = byteVector0.putLong((long) ' ');
        org.mockito.asm.ByteVector byteVector6 = byteVector4.putByte((int) 'a');
        org.mockito.asm.ByteVector byteVector8 = byteVector4.putByte((int) (short) -1);
        org.mockito.asm.ByteVector byteVector10 = byteVector4.putLong(0L);
        org.mockito.asm.ByteVector byteVector12 = byteVector4.putUTF8("hi!");
        org.mockito.asm.ByteVector byteVector14 = byteVector12.putUTF8("hi!");
        org.mockito.asm.ByteVector byteVector16 = byteVector12.putShort((int) '#');
        org.mockito.asm.ByteVector byteVector17 = new org.mockito.asm.ByteVector();
        org.mockito.asm.ByteVector byteVector19 = byteVector17.putUTF8("hi!");
        org.mockito.asm.ByteVector byteVector21 = byteVector17.putShort((int) (short) -1);
        org.mockito.asm.ByteVector byteVector23 = byteVector17.putInt((int) (byte) 10);
        org.mockito.asm.ByteVector byteVector25 = byteVector23.putUTF8("hi!");
        org.mockito.asm.ByteVector byteVector27 = byteVector25.putByte((int) (byte) 1);
        org.mockito.asm.ByteVector byteVector29 = byteVector27.putUTF8("hi!");
        org.mockito.asm.ByteVector byteVector31 = byteVector29.putByte((int) (byte) 10);
        byte[] byteArray34 = new byte[] { (byte) 10, (byte) 0 };
        org.mockito.asm.ByteVector byteVector37 = byteVector31.putByteArray(byteArray34, 0, (int) (short) 0);
        // The following exception was thrown during execution in test generation
        try {
            org.mockito.asm.ByteVector byteVector40 = byteVector12.putByteArray(byteArray34, (int) ' ', (-1));
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteVector2);
        org.junit.Assert.assertNotNull(byteVector4);
        org.junit.Assert.assertNotNull(byteVector6);
        org.junit.Assert.assertNotNull(byteVector8);
        org.junit.Assert.assertNotNull(byteVector10);
        org.junit.Assert.assertNotNull(byteVector12);
        org.junit.Assert.assertNotNull(byteVector14);
        org.junit.Assert.assertNotNull(byteVector16);
        org.junit.Assert.assertNotNull(byteVector19);
        org.junit.Assert.assertNotNull(byteVector21);
        org.junit.Assert.assertNotNull(byteVector23);
        org.junit.Assert.assertNotNull(byteVector25);
        org.junit.Assert.assertNotNull(byteVector27);
        org.junit.Assert.assertNotNull(byteVector29);
        org.junit.Assert.assertNotNull(byteVector31);
        org.junit.Assert.assertNotNull(byteArray34);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray34), "[10, 0]");
        org.junit.Assert.assertNotNull(byteVector37);
    }

    @Test
    public void test0318() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0318");
        org.mockito.asm.ByteVector byteVector0 = new org.mockito.asm.ByteVector();
        org.mockito.asm.ByteVector byteVector2 = byteVector0.putUTF8("hi!");
        org.mockito.asm.ByteVector byteVector4 = byteVector0.putLong((long) ' ');
        org.mockito.asm.ByteVector byteVector6 = byteVector4.putByte((int) 'a');
        org.mockito.asm.ByteVector byteVector8 = byteVector6.putByte((int) (short) -1);
        byte[] byteArray9 = null;
        org.mockito.asm.ByteVector byteVector12 = byteVector6.putByteArray(byteArray9, (int) '#', 0);
        java.lang.Class<?> wildcardClass13 = byteVector6.getClass();
        org.junit.Assert.assertNotNull(byteVector2);
        org.junit.Assert.assertNotNull(byteVector4);
        org.junit.Assert.assertNotNull(byteVector6);
        org.junit.Assert.assertNotNull(byteVector8);
        org.junit.Assert.assertNotNull(byteVector12);
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test0319() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0319");
        org.mockito.asm.ByteVector byteVector0 = new org.mockito.asm.ByteVector();
        org.mockito.asm.ByteVector byteVector2 = byteVector0.putUTF8("hi!");
        org.mockito.asm.ByteVector byteVector4 = byteVector0.putShort((int) (short) -1);
        org.mockito.asm.ByteVector byteVector6 = byteVector0.putInt(0);
        org.mockito.asm.ByteVector byteVector8 = byteVector0.putUTF8("hi!");
        org.mockito.asm.ByteVector byteVector10 = byteVector0.putUTF8("hi!");
        java.lang.Class<?> wildcardClass11 = byteVector10.getClass();
        org.junit.Assert.assertNotNull(byteVector2);
        org.junit.Assert.assertNotNull(byteVector4);
        org.junit.Assert.assertNotNull(byteVector6);
        org.junit.Assert.assertNotNull(byteVector8);
        org.junit.Assert.assertNotNull(byteVector10);
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test0320() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0320");
        org.mockito.asm.ByteVector byteVector0 = new org.mockito.asm.ByteVector();
        org.mockito.asm.ByteVector byteVector2 = byteVector0.putUTF8("hi!");
        org.mockito.asm.ByteVector byteVector4 = byteVector2.putInt((int) (byte) 10);
        org.mockito.asm.ByteVector byteVector6 = byteVector4.putUTF8("");
        org.mockito.asm.ByteVector byteVector8 = byteVector4.putByte((int) 'a');
        org.mockito.asm.ByteVector byteVector10 = byteVector8.putLong((long) (byte) 0);
        java.lang.Class<?> wildcardClass11 = byteVector10.getClass();
        org.junit.Assert.assertNotNull(byteVector2);
        org.junit.Assert.assertNotNull(byteVector4);
        org.junit.Assert.assertNotNull(byteVector6);
        org.junit.Assert.assertNotNull(byteVector8);
        org.junit.Assert.assertNotNull(byteVector10);
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test0321() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0321");
        org.mockito.asm.ByteVector byteVector0 = new org.mockito.asm.ByteVector();
        org.mockito.asm.ByteVector byteVector2 = byteVector0.putUTF8("hi!");
        org.mockito.asm.ByteVector byteVector4 = byteVector0.putInt(0);
        org.mockito.asm.ByteVector byteVector6 = byteVector4.putInt((int) ' ');
        java.lang.Class<?> wildcardClass7 = byteVector4.getClass();
        org.junit.Assert.assertNotNull(byteVector2);
        org.junit.Assert.assertNotNull(byteVector4);
        org.junit.Assert.assertNotNull(byteVector6);
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test0322() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0322");
        org.mockito.asm.ByteVector byteVector0 = new org.mockito.asm.ByteVector();
        org.mockito.asm.ByteVector byteVector2 = byteVector0.putUTF8("hi!");
        org.mockito.asm.ByteVector byteVector4 = byteVector0.putInt(0);
        org.mockito.asm.ByteVector byteVector6 = byteVector0.putShort((int) '4');
        org.mockito.asm.ByteVector byteVector8 = byteVector6.putInt((-1));
        org.mockito.asm.ByteVector byteVector9 = new org.mockito.asm.ByteVector();
        org.mockito.asm.ByteVector byteVector11 = byteVector9.putUTF8("hi!");
        org.mockito.asm.ByteVector byteVector13 = byteVector11.putLong((long) (byte) 10);
        org.mockito.asm.ByteVector byteVector15 = byteVector13.putUTF8("hi!");
        org.mockito.asm.ByteVector byteVector17 = byteVector13.putLong((long) (short) -1);
        org.mockito.asm.ByteVector byteVector19 = byteVector17.putInt(10);
        org.mockito.asm.ByteVector byteVector21 = byteVector17.putByte((int) (short) 1);
        org.mockito.asm.ByteVector byteVector23 = byteVector17.putInt((int) (short) -1);
        org.mockito.asm.ByteVector byteVector25 = byteVector17.putUTF8("hi!");
        org.mockito.asm.ByteVector byteVector26 = new org.mockito.asm.ByteVector();
        org.mockito.asm.ByteVector byteVector28 = byteVector26.putUTF8("hi!");
        org.mockito.asm.ByteVector byteVector30 = byteVector26.putLong((long) ' ');
        org.mockito.asm.ByteVector byteVector32 = byteVector30.putByte((int) 'a');
        org.mockito.asm.ByteVector byteVector34 = byteVector30.putByte((int) (short) -1);
        org.mockito.asm.ByteVector byteVector36 = byteVector30.putLong(0L);
        org.mockito.asm.ByteVector byteVector38 = byteVector30.putUTF8("hi!");
        org.mockito.asm.ByteVector byteVector40 = byteVector38.putUTF8("");
        org.mockito.asm.ByteVector byteVector42 = byteVector40.putLong((long) (byte) 10);
        org.mockito.asm.ByteVector byteVector44 = byteVector40.putLong((long) (short) 100);
        byte[] byteArray49 = new byte[] { (byte) 1, (byte) 0, (byte) 0, (byte) -1 };
        org.mockito.asm.ByteVector byteVector52 = byteVector40.putByteArray(byteArray49, 0, 0);
        org.mockito.asm.ByteVector byteVector55 = byteVector25.putByteArray(byteArray49, (int) (byte) 0, (int) (short) 1);
        // The following exception was thrown during execution in test generation
        try {
            org.mockito.asm.ByteVector byteVector58 = byteVector6.putByteArray(byteArray49, 0, (int) '4');
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteVector2);
        org.junit.Assert.assertNotNull(byteVector4);
        org.junit.Assert.assertNotNull(byteVector6);
        org.junit.Assert.assertNotNull(byteVector8);
        org.junit.Assert.assertNotNull(byteVector11);
        org.junit.Assert.assertNotNull(byteVector13);
        org.junit.Assert.assertNotNull(byteVector15);
        org.junit.Assert.assertNotNull(byteVector17);
        org.junit.Assert.assertNotNull(byteVector19);
        org.junit.Assert.assertNotNull(byteVector21);
        org.junit.Assert.assertNotNull(byteVector23);
        org.junit.Assert.assertNotNull(byteVector25);
        org.junit.Assert.assertNotNull(byteVector28);
        org.junit.Assert.assertNotNull(byteVector30);
        org.junit.Assert.assertNotNull(byteVector32);
        org.junit.Assert.assertNotNull(byteVector34);
        org.junit.Assert.assertNotNull(byteVector36);
        org.junit.Assert.assertNotNull(byteVector38);
        org.junit.Assert.assertNotNull(byteVector40);
        org.junit.Assert.assertNotNull(byteVector42);
        org.junit.Assert.assertNotNull(byteVector44);
        org.junit.Assert.assertNotNull(byteArray49);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray49), "[1, 0, 0, -1]");
        org.junit.Assert.assertNotNull(byteVector52);
        org.junit.Assert.assertNotNull(byteVector55);
    }

    @Test
    public void test0323() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0323");
        org.mockito.asm.ByteVector byteVector1 = new org.mockito.asm.ByteVector((int) '#');
        org.mockito.asm.ByteVector byteVector3 = byteVector1.putLong(100L);
        org.mockito.asm.ByteVector byteVector5 = byteVector3.putLong(1L);
        org.mockito.asm.ByteVector byteVector7 = byteVector5.putUTF8("hi!");
        org.mockito.asm.ByteVector byteVector9 = byteVector7.putUTF8("");
        org.mockito.asm.ByteVector byteVector11 = byteVector9.putShort((int) (byte) -1);
        org.mockito.asm.ByteVector byteVector13 = byteVector9.putShort(0);
        org.mockito.asm.ByteVector byteVector15 = byteVector9.putUTF8("");
        byte[] byteArray22 = new byte[] { (byte) -1, (byte) 0, (byte) 10, (byte) 1, (byte) 10, (byte) 1 };
        // The following exception was thrown during execution in test generation
        try {
            org.mockito.asm.ByteVector byteVector25 = byteVector15.putByteArray(byteArray22, 1, 10);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteVector3);
        org.junit.Assert.assertNotNull(byteVector5);
        org.junit.Assert.assertNotNull(byteVector7);
        org.junit.Assert.assertNotNull(byteVector9);
        org.junit.Assert.assertNotNull(byteVector11);
        org.junit.Assert.assertNotNull(byteVector13);
        org.junit.Assert.assertNotNull(byteVector15);
        org.junit.Assert.assertNotNull(byteArray22);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray22), "[-1, 0, 10, 1, 10, 1]");
    }

    @Test
    public void test0324() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0324");
        org.mockito.asm.ByteVector byteVector1 = new org.mockito.asm.ByteVector((int) (byte) 1);
        org.mockito.asm.ByteVector byteVector3 = byteVector1.putByte((int) (short) 1);
        org.mockito.asm.ByteVector byteVector5 = byteVector3.putLong((long) (-1));
        org.mockito.asm.ByteVector byteVector7 = byteVector3.putInt((int) (short) 0);
        org.mockito.asm.ByteVector byteVector9 = byteVector3.putInt((int) (byte) 1);
        org.junit.Assert.assertNotNull(byteVector3);
        org.junit.Assert.assertNotNull(byteVector5);
        org.junit.Assert.assertNotNull(byteVector7);
        org.junit.Assert.assertNotNull(byteVector9);
    }

    @Test
    public void test0325() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0325");
        org.mockito.asm.ByteVector byteVector0 = new org.mockito.asm.ByteVector();
        org.mockito.asm.ByteVector byteVector2 = byteVector0.putUTF8("hi!");
        org.mockito.asm.ByteVector byteVector4 = byteVector0.putLong((long) ' ');
        org.mockito.asm.ByteVector byteVector6 = byteVector4.putByte((int) 'a');
        org.mockito.asm.ByteVector byteVector8 = byteVector6.putByte((int) (short) -1);
        org.mockito.asm.ByteVector byteVector9 = new org.mockito.asm.ByteVector();
        org.mockito.asm.ByteVector byteVector11 = byteVector9.putUTF8("hi!");
        org.mockito.asm.ByteVector byteVector13 = byteVector9.putLong((long) ' ');
        org.mockito.asm.ByteVector byteVector15 = byteVector13.putByte((int) 'a');
        org.mockito.asm.ByteVector byteVector17 = byteVector13.putByte((int) (short) -1);
        org.mockito.asm.ByteVector byteVector19 = byteVector13.putLong(0L);
        org.mockito.asm.ByteVector byteVector21 = byteVector13.putUTF8("hi!");
        org.mockito.asm.ByteVector byteVector23 = byteVector21.putUTF8("");
        org.mockito.asm.ByteVector byteVector25 = byteVector21.putInt((int) (byte) 10);
        org.mockito.asm.ByteVector byteVector27 = byteVector25.putLong((long) (short) -1);
        org.mockito.asm.ByteVector byteVector29 = byteVector25.putByte(0);
        org.mockito.asm.ByteVector byteVector30 = new org.mockito.asm.ByteVector();
        org.mockito.asm.ByteVector byteVector32 = byteVector30.putUTF8("hi!");
        org.mockito.asm.ByteVector byteVector34 = byteVector32.putInt(0);
        org.mockito.asm.ByteVector byteVector36 = byteVector32.putByte((int) (byte) 10);
        org.mockito.asm.ByteVector byteVector38 = byteVector36.putLong((-1L));
        org.mockito.asm.ByteVector byteVector40 = byteVector36.putInt((int) (byte) 100);
        org.mockito.asm.ByteVector byteVector41 = new org.mockito.asm.ByteVector();
        org.mockito.asm.ByteVector byteVector43 = byteVector41.putUTF8("hi!");
        org.mockito.asm.ByteVector byteVector45 = byteVector41.putInt(0);
        org.mockito.asm.ByteVector byteVector47 = byteVector45.putInt((int) ' ');
        org.mockito.asm.ByteVector byteVector49 = byteVector47.putLong(100L);
        byte[] byteArray53 = new byte[] { (byte) 0, (byte) 10, (byte) 1 };
        org.mockito.asm.ByteVector byteVector56 = byteVector47.putByteArray(byteArray53, 0, 0);
        org.mockito.asm.ByteVector byteVector59 = byteVector36.putByteArray(byteArray53, (int) (byte) 1, 0);
        org.mockito.asm.ByteVector byteVector62 = byteVector29.putByteArray(byteArray53, 1, 0);
        // The following exception was thrown during execution in test generation
        try {
            org.mockito.asm.ByteVector byteVector65 = byteVector8.putByteArray(byteArray53, 100, (int) (short) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteVector2);
        org.junit.Assert.assertNotNull(byteVector4);
        org.junit.Assert.assertNotNull(byteVector6);
        org.junit.Assert.assertNotNull(byteVector8);
        org.junit.Assert.assertNotNull(byteVector11);
        org.junit.Assert.assertNotNull(byteVector13);
        org.junit.Assert.assertNotNull(byteVector15);
        org.junit.Assert.assertNotNull(byteVector17);
        org.junit.Assert.assertNotNull(byteVector19);
        org.junit.Assert.assertNotNull(byteVector21);
        org.junit.Assert.assertNotNull(byteVector23);
        org.junit.Assert.assertNotNull(byteVector25);
        org.junit.Assert.assertNotNull(byteVector27);
        org.junit.Assert.assertNotNull(byteVector29);
        org.junit.Assert.assertNotNull(byteVector32);
        org.junit.Assert.assertNotNull(byteVector34);
        org.junit.Assert.assertNotNull(byteVector36);
        org.junit.Assert.assertNotNull(byteVector38);
        org.junit.Assert.assertNotNull(byteVector40);
        org.junit.Assert.assertNotNull(byteVector43);
        org.junit.Assert.assertNotNull(byteVector45);
        org.junit.Assert.assertNotNull(byteVector47);
        org.junit.Assert.assertNotNull(byteVector49);
        org.junit.Assert.assertNotNull(byteArray53);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray53), "[0, 10, 1]");
        org.junit.Assert.assertNotNull(byteVector56);
        org.junit.Assert.assertNotNull(byteVector59);
        org.junit.Assert.assertNotNull(byteVector62);
    }

    @Test
    public void test0326() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0326");
        org.mockito.asm.ByteVector byteVector0 = new org.mockito.asm.ByteVector();
        org.mockito.asm.ByteVector byteVector2 = byteVector0.putUTF8("hi!");
        org.mockito.asm.ByteVector byteVector4 = byteVector2.putLong((long) (byte) 10);
        org.mockito.asm.ByteVector byteVector6 = byteVector4.putUTF8("hi!");
        org.mockito.asm.ByteVector byteVector8 = byteVector4.putInt((int) (byte) 100);
        org.mockito.asm.ByteVector byteVector10 = byteVector4.putUTF8("hi!");
        org.mockito.asm.ByteVector byteVector12 = byteVector10.putShort(0);
        byte[] byteArray18 = new byte[] { (byte) 100, (byte) 10, (byte) 100, (byte) 100, (byte) 1 };
        // The following exception was thrown during execution in test generation
        try {
            org.mockito.asm.ByteVector byteVector21 = byteVector10.putByteArray(byteArray18, 100, (int) 'a');
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteVector2);
        org.junit.Assert.assertNotNull(byteVector4);
        org.junit.Assert.assertNotNull(byteVector6);
        org.junit.Assert.assertNotNull(byteVector8);
        org.junit.Assert.assertNotNull(byteVector10);
        org.junit.Assert.assertNotNull(byteVector12);
        org.junit.Assert.assertNotNull(byteArray18);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray18), "[100, 10, 100, 100, 1]");
    }

    @Test
    public void test0327() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0327");
        org.mockito.asm.ByteVector byteVector0 = new org.mockito.asm.ByteVector();
        org.mockito.asm.ByteVector byteVector2 = byteVector0.putUTF8("hi!");
        org.mockito.asm.ByteVector byteVector4 = byteVector0.putLong((long) ' ');
        org.mockito.asm.ByteVector byteVector6 = byteVector4.putByte((int) 'a');
        org.mockito.asm.ByteVector byteVector8 = byteVector4.putByte((int) (short) -1);
        org.mockito.asm.ByteVector byteVector10 = byteVector4.putLong(0L);
        org.mockito.asm.ByteVector byteVector12 = byteVector10.putByte(0);
        org.mockito.asm.ByteVector byteVector14 = byteVector12.putByte(100);
        org.mockito.asm.ByteVector byteVector16 = byteVector12.putByte((int) '4');
        org.mockito.asm.ByteVector byteVector18 = byteVector16.putUTF8("hi!");
        org.mockito.asm.ByteVector byteVector20 = byteVector16.putShort(100);
        org.mockito.asm.ByteVector byteVector22 = byteVector20.putByte(0);
        org.junit.Assert.assertNotNull(byteVector2);
        org.junit.Assert.assertNotNull(byteVector4);
        org.junit.Assert.assertNotNull(byteVector6);
        org.junit.Assert.assertNotNull(byteVector8);
        org.junit.Assert.assertNotNull(byteVector10);
        org.junit.Assert.assertNotNull(byteVector12);
        org.junit.Assert.assertNotNull(byteVector14);
        org.junit.Assert.assertNotNull(byteVector16);
        org.junit.Assert.assertNotNull(byteVector18);
        org.junit.Assert.assertNotNull(byteVector20);
        org.junit.Assert.assertNotNull(byteVector22);
    }

    @Test
    public void test0328() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0328");
        org.mockito.asm.ByteVector byteVector0 = new org.mockito.asm.ByteVector();
        org.mockito.asm.ByteVector byteVector2 = byteVector0.putUTF8("hi!");
        org.mockito.asm.ByteVector byteVector4 = byteVector0.putLong((long) ' ');
        org.mockito.asm.ByteVector byteVector6 = byteVector4.putByte((int) 'a');
        org.mockito.asm.ByteVector byteVector8 = byteVector6.putByte((int) (short) -1);
        byte[] byteArray9 = null;
        org.mockito.asm.ByteVector byteVector12 = byteVector6.putByteArray(byteArray9, (int) '#', 0);
        org.mockito.asm.ByteVector byteVector14 = byteVector12.putLong((long) '#');
        org.junit.Assert.assertNotNull(byteVector2);
        org.junit.Assert.assertNotNull(byteVector4);
        org.junit.Assert.assertNotNull(byteVector6);
        org.junit.Assert.assertNotNull(byteVector8);
        org.junit.Assert.assertNotNull(byteVector12);
        org.junit.Assert.assertNotNull(byteVector14);
    }

    @Test
    public void test0329() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0329");
        org.mockito.asm.ByteVector byteVector0 = new org.mockito.asm.ByteVector();
        org.mockito.asm.ByteVector byteVector2 = byteVector0.putUTF8("hi!");
        org.mockito.asm.ByteVector byteVector4 = byteVector2.putInt(0);
        org.mockito.asm.ByteVector byteVector6 = byteVector4.putByte((int) (byte) 1);
        org.mockito.asm.ByteVector byteVector8 = byteVector4.putByte(0);
        org.mockito.asm.ByteVector byteVector10 = byteVector8.putLong((long) (byte) 1);
        java.lang.Class<?> wildcardClass11 = byteVector10.getClass();
        org.junit.Assert.assertNotNull(byteVector2);
        org.junit.Assert.assertNotNull(byteVector4);
        org.junit.Assert.assertNotNull(byteVector6);
        org.junit.Assert.assertNotNull(byteVector8);
        org.junit.Assert.assertNotNull(byteVector10);
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test0330() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0330");
        org.mockito.asm.ByteVector byteVector0 = new org.mockito.asm.ByteVector();
        org.mockito.asm.ByteVector byteVector2 = byteVector0.putUTF8("hi!");
        org.mockito.asm.ByteVector byteVector4 = byteVector0.putLong((long) ' ');
        org.mockito.asm.ByteVector byteVector6 = byteVector4.putByte((int) 'a');
        org.mockito.asm.ByteVector byteVector8 = byteVector6.putByte((int) (short) -1);
        org.mockito.asm.ByteVector byteVector10 = byteVector8.putLong((long) (byte) -1);
        org.mockito.asm.ByteVector byteVector12 = byteVector8.putByte((int) '4');
        org.mockito.asm.ByteVector byteVector14 = byteVector12.putLong((long) (short) 10);
        org.mockito.asm.ByteVector byteVector16 = byteVector14.putByte((int) 'a');
        java.lang.Class<?> wildcardClass17 = byteVector16.getClass();
        org.junit.Assert.assertNotNull(byteVector2);
        org.junit.Assert.assertNotNull(byteVector4);
        org.junit.Assert.assertNotNull(byteVector6);
        org.junit.Assert.assertNotNull(byteVector8);
        org.junit.Assert.assertNotNull(byteVector10);
        org.junit.Assert.assertNotNull(byteVector12);
        org.junit.Assert.assertNotNull(byteVector14);
        org.junit.Assert.assertNotNull(byteVector16);
        org.junit.Assert.assertNotNull(wildcardClass17);
    }

    @Test
    public void test0331() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0331");
        org.mockito.asm.ByteVector byteVector0 = new org.mockito.asm.ByteVector();
        org.mockito.asm.ByteVector byteVector2 = byteVector0.putUTF8("hi!");
        org.mockito.asm.ByteVector byteVector4 = byteVector0.putShort((int) (short) -1);
        org.mockito.asm.ByteVector byteVector6 = byteVector0.putInt(0);
        org.mockito.asm.ByteVector byteVector8 = byteVector0.putUTF8("hi!");
        org.mockito.asm.ByteVector byteVector10 = byteVector0.putByte(100);
        org.mockito.asm.ByteVector byteVector12 = byteVector0.putInt((int) ' ');
        org.mockito.asm.ByteVector byteVector14 = byteVector12.putInt((int) (short) 0);
        org.junit.Assert.assertNotNull(byteVector2);
        org.junit.Assert.assertNotNull(byteVector4);
        org.junit.Assert.assertNotNull(byteVector6);
        org.junit.Assert.assertNotNull(byteVector8);
        org.junit.Assert.assertNotNull(byteVector10);
        org.junit.Assert.assertNotNull(byteVector12);
        org.junit.Assert.assertNotNull(byteVector14);
    }

    @Test
    public void test0332() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0332");
        org.mockito.asm.ByteVector byteVector0 = new org.mockito.asm.ByteVector();
        org.mockito.asm.ByteVector byteVector2 = byteVector0.putUTF8("hi!");
        org.mockito.asm.ByteVector byteVector4 = byteVector0.putLong((long) ' ');
        org.mockito.asm.ByteVector byteVector6 = byteVector4.putByte((int) 'a');
        org.mockito.asm.ByteVector byteVector8 = byteVector6.putInt((int) (short) 1);
        org.mockito.asm.ByteVector byteVector10 = byteVector8.putShort((int) (byte) 100);
        java.lang.Class<?> wildcardClass11 = byteVector10.getClass();
        org.junit.Assert.assertNotNull(byteVector2);
        org.junit.Assert.assertNotNull(byteVector4);
        org.junit.Assert.assertNotNull(byteVector6);
        org.junit.Assert.assertNotNull(byteVector8);
        org.junit.Assert.assertNotNull(byteVector10);
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test0333() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0333");
        org.mockito.asm.ByteVector byteVector0 = new org.mockito.asm.ByteVector();
        org.mockito.asm.ByteVector byteVector2 = byteVector0.putUTF8("hi!");
        org.mockito.asm.ByteVector byteVector4 = byteVector0.putShort((int) (short) -1);
        org.mockito.asm.ByteVector byteVector6 = byteVector0.putInt((int) (byte) 10);
        org.mockito.asm.ByteVector byteVector8 = byteVector6.putUTF8("hi!");
        org.mockito.asm.ByteVector byteVector9 = new org.mockito.asm.ByteVector();
        org.mockito.asm.ByteVector byteVector11 = byteVector9.putUTF8("hi!");
        org.mockito.asm.ByteVector byteVector13 = byteVector11.putInt(0);
        org.mockito.asm.ByteVector byteVector15 = byteVector13.putByte((int) (short) 0);
        org.mockito.asm.ByteVector byteVector17 = byteVector13.putUTF8("");
        org.mockito.asm.ByteVector byteVector18 = new org.mockito.asm.ByteVector();
        org.mockito.asm.ByteVector byteVector20 = byteVector18.putUTF8("hi!");
        org.mockito.asm.ByteVector byteVector22 = byteVector18.putInt(0);
        org.mockito.asm.ByteVector byteVector24 = byteVector18.putShort((int) '4');
        org.mockito.asm.ByteVector byteVector26 = byteVector18.putByte(100);
        org.mockito.asm.ByteVector byteVector28 = byteVector26.putInt((int) (byte) 10);
        org.mockito.asm.ByteVector byteVector30 = byteVector26.putInt((int) (byte) 10);
        org.mockito.asm.ByteVector byteVector32 = byteVector30.putByte(100);
        org.mockito.asm.ByteVector byteVector33 = new org.mockito.asm.ByteVector();
        org.mockito.asm.ByteVector byteVector35 = byteVector33.putUTF8("hi!");
        org.mockito.asm.ByteVector byteVector37 = byteVector33.putInt(0);
        org.mockito.asm.ByteVector byteVector39 = byteVector37.putInt((int) ' ');
        org.mockito.asm.ByteVector byteVector41 = byteVector39.putLong(100L);
        byte[] byteArray45 = new byte[] { (byte) 0, (byte) 10, (byte) 1 };
        org.mockito.asm.ByteVector byteVector48 = byteVector39.putByteArray(byteArray45, 0, 0);
        org.mockito.asm.ByteVector byteVector51 = byteVector32.putByteArray(byteArray45, (int) (byte) 1, (int) (byte) 0);
        org.mockito.asm.ByteVector byteVector54 = byteVector13.putByteArray(byteArray45, (int) (short) 0, 0);
        // The following exception was thrown during execution in test generation
        try {
            org.mockito.asm.ByteVector byteVector57 = byteVector6.putByteArray(byteArray45, (int) (byte) 0, 10);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteVector2);
        org.junit.Assert.assertNotNull(byteVector4);
        org.junit.Assert.assertNotNull(byteVector6);
        org.junit.Assert.assertNotNull(byteVector8);
        org.junit.Assert.assertNotNull(byteVector11);
        org.junit.Assert.assertNotNull(byteVector13);
        org.junit.Assert.assertNotNull(byteVector15);
        org.junit.Assert.assertNotNull(byteVector17);
        org.junit.Assert.assertNotNull(byteVector20);
        org.junit.Assert.assertNotNull(byteVector22);
        org.junit.Assert.assertNotNull(byteVector24);
        org.junit.Assert.assertNotNull(byteVector26);
        org.junit.Assert.assertNotNull(byteVector28);
        org.junit.Assert.assertNotNull(byteVector30);
        org.junit.Assert.assertNotNull(byteVector32);
        org.junit.Assert.assertNotNull(byteVector35);
        org.junit.Assert.assertNotNull(byteVector37);
        org.junit.Assert.assertNotNull(byteVector39);
        org.junit.Assert.assertNotNull(byteVector41);
        org.junit.Assert.assertNotNull(byteArray45);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray45), "[0, 10, 1]");
        org.junit.Assert.assertNotNull(byteVector48);
        org.junit.Assert.assertNotNull(byteVector51);
        org.junit.Assert.assertNotNull(byteVector54);
    }

    @Test
    public void test0334() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0334");
        org.mockito.asm.ByteVector byteVector0 = new org.mockito.asm.ByteVector();
        org.mockito.asm.ByteVector byteVector2 = byteVector0.putUTF8("hi!");
        org.mockito.asm.ByteVector byteVector4 = byteVector0.putShort((int) (short) -1);
        org.mockito.asm.ByteVector byteVector6 = byteVector4.putUTF8("");
        byte[] byteArray8 = new byte[] { (byte) 10 };
        // The following exception was thrown during execution in test generation
        try {
            org.mockito.asm.ByteVector byteVector11 = byteVector4.putByteArray(byteArray8, (int) '#', (int) (byte) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteVector2);
        org.junit.Assert.assertNotNull(byteVector4);
        org.junit.Assert.assertNotNull(byteVector6);
        org.junit.Assert.assertNotNull(byteArray8);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray8), "[10]");
    }

    @Test
    public void test0335() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0335");
        org.mockito.asm.ByteVector byteVector0 = new org.mockito.asm.ByteVector();
        org.mockito.asm.ByteVector byteVector2 = byteVector0.putUTF8("hi!");
        org.mockito.asm.ByteVector byteVector4 = byteVector2.putInt(0);
        org.mockito.asm.ByteVector byteVector6 = byteVector4.putShort((int) '4');
        org.mockito.asm.ByteVector byteVector8 = byteVector6.putByte(100);
        org.mockito.asm.ByteVector byteVector10 = byteVector6.putUTF8("");
        java.lang.Class<?> wildcardClass11 = byteVector10.getClass();
        org.junit.Assert.assertNotNull(byteVector2);
        org.junit.Assert.assertNotNull(byteVector4);
        org.junit.Assert.assertNotNull(byteVector6);
        org.junit.Assert.assertNotNull(byteVector8);
        org.junit.Assert.assertNotNull(byteVector10);
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test0336() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0336");
        org.mockito.asm.ByteVector byteVector0 = new org.mockito.asm.ByteVector();
        org.mockito.asm.ByteVector byteVector2 = byteVector0.putUTF8("hi!");
        org.mockito.asm.ByteVector byteVector4 = byteVector2.putInt(0);
        org.mockito.asm.ByteVector byteVector6 = byteVector2.putShort((int) (byte) 10);
        org.mockito.asm.ByteVector byteVector8 = byteVector2.putUTF8("");
        org.mockito.asm.ByteVector byteVector10 = byteVector2.putUTF8("hi!");
        org.mockito.asm.ByteVector byteVector12 = byteVector10.putByte(100);
        java.lang.Class<?> wildcardClass13 = byteVector12.getClass();
        org.junit.Assert.assertNotNull(byteVector2);
        org.junit.Assert.assertNotNull(byteVector4);
        org.junit.Assert.assertNotNull(byteVector6);
        org.junit.Assert.assertNotNull(byteVector8);
        org.junit.Assert.assertNotNull(byteVector10);
        org.junit.Assert.assertNotNull(byteVector12);
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test0337() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0337");
        org.mockito.asm.ByteVector byteVector0 = new org.mockito.asm.ByteVector();
        org.mockito.asm.ByteVector byteVector2 = byteVector0.putUTF8("hi!");
        org.mockito.asm.ByteVector byteVector4 = byteVector2.putInt((int) (byte) 10);
        org.mockito.asm.ByteVector byteVector6 = byteVector2.putLong((long) 10);
        org.mockito.asm.ByteVector byteVector7 = new org.mockito.asm.ByteVector();
        org.mockito.asm.ByteVector byteVector9 = byteVector7.putUTF8("hi!");
        org.mockito.asm.ByteVector byteVector11 = byteVector9.putByte(100);
        org.mockito.asm.ByteVector byteVector13 = byteVector9.putShort((int) 'a');
        org.mockito.asm.ByteVector byteVector15 = byteVector13.putShort((int) (short) 0);
        org.mockito.asm.ByteVector byteVector16 = new org.mockito.asm.ByteVector();
        org.mockito.asm.ByteVector byteVector18 = byteVector16.putUTF8("hi!");
        org.mockito.asm.ByteVector byteVector20 = byteVector18.putInt(0);
        org.mockito.asm.ByteVector byteVector22 = byteVector18.putByte((int) (byte) 10);
        org.mockito.asm.ByteVector byteVector24 = byteVector22.putLong((-1L));
        org.mockito.asm.ByteVector byteVector26 = byteVector22.putInt((int) (byte) 100);
        org.mockito.asm.ByteVector byteVector27 = new org.mockito.asm.ByteVector();
        org.mockito.asm.ByteVector byteVector29 = byteVector27.putUTF8("hi!");
        org.mockito.asm.ByteVector byteVector31 = byteVector27.putInt(0);
        org.mockito.asm.ByteVector byteVector33 = byteVector31.putInt((int) ' ');
        org.mockito.asm.ByteVector byteVector35 = byteVector33.putLong(100L);
        byte[] byteArray39 = new byte[] { (byte) 0, (byte) 10, (byte) 1 };
        org.mockito.asm.ByteVector byteVector42 = byteVector33.putByteArray(byteArray39, 0, 0);
        org.mockito.asm.ByteVector byteVector45 = byteVector22.putByteArray(byteArray39, (int) (byte) 1, 0);
        org.mockito.asm.ByteVector byteVector48 = byteVector13.putByteArray(byteArray39, (int) (byte) 1, (int) (short) 1);
        // The following exception was thrown during execution in test generation
        try {
            org.mockito.asm.ByteVector byteVector51 = byteVector2.putByteArray(byteArray39, (int) '4', 100);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteVector2);
        org.junit.Assert.assertNotNull(byteVector4);
        org.junit.Assert.assertNotNull(byteVector6);
        org.junit.Assert.assertNotNull(byteVector9);
        org.junit.Assert.assertNotNull(byteVector11);
        org.junit.Assert.assertNotNull(byteVector13);
        org.junit.Assert.assertNotNull(byteVector15);
        org.junit.Assert.assertNotNull(byteVector18);
        org.junit.Assert.assertNotNull(byteVector20);
        org.junit.Assert.assertNotNull(byteVector22);
        org.junit.Assert.assertNotNull(byteVector24);
        org.junit.Assert.assertNotNull(byteVector26);
        org.junit.Assert.assertNotNull(byteVector29);
        org.junit.Assert.assertNotNull(byteVector31);
        org.junit.Assert.assertNotNull(byteVector33);
        org.junit.Assert.assertNotNull(byteVector35);
        org.junit.Assert.assertNotNull(byteArray39);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray39), "[0, 10, 1]");
        org.junit.Assert.assertNotNull(byteVector42);
        org.junit.Assert.assertNotNull(byteVector45);
        org.junit.Assert.assertNotNull(byteVector48);
    }

    @Test
    public void test0338() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0338");
        org.mockito.asm.ByteVector byteVector0 = new org.mockito.asm.ByteVector();
        org.mockito.asm.ByteVector byteVector2 = byteVector0.putUTF8("hi!");
        org.mockito.asm.ByteVector byteVector4 = byteVector0.putLong((long) ' ');
        org.mockito.asm.ByteVector byteVector6 = byteVector4.putByte((int) 'a');
        org.mockito.asm.ByteVector byteVector8 = byteVector4.putByte((int) (short) -1);
        org.mockito.asm.ByteVector byteVector10 = byteVector4.putLong(0L);
        org.mockito.asm.ByteVector byteVector12 = byteVector4.putUTF8("hi!");
        org.mockito.asm.ByteVector byteVector14 = byteVector12.putUTF8("hi!");
        org.mockito.asm.ByteVector byteVector16 = byteVector12.putByte((int) (byte) -1);
        org.mockito.asm.ByteVector byteVector18 = byteVector12.putLong((long) (-1));
        org.mockito.asm.ByteVector byteVector20 = byteVector18.putByte((int) (byte) 1);
        org.mockito.asm.ByteVector byteVector22 = byteVector20.putUTF8("");
        org.mockito.asm.ByteVector byteVector24 = byteVector22.putShort((int) (byte) 1);
        org.junit.Assert.assertNotNull(byteVector2);
        org.junit.Assert.assertNotNull(byteVector4);
        org.junit.Assert.assertNotNull(byteVector6);
        org.junit.Assert.assertNotNull(byteVector8);
        org.junit.Assert.assertNotNull(byteVector10);
        org.junit.Assert.assertNotNull(byteVector12);
        org.junit.Assert.assertNotNull(byteVector14);
        org.junit.Assert.assertNotNull(byteVector16);
        org.junit.Assert.assertNotNull(byteVector18);
        org.junit.Assert.assertNotNull(byteVector20);
        org.junit.Assert.assertNotNull(byteVector22);
        org.junit.Assert.assertNotNull(byteVector24);
    }

    @Test
    public void test0339() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0339");
        org.mockito.asm.ByteVector byteVector0 = new org.mockito.asm.ByteVector();
        org.mockito.asm.ByteVector byteVector2 = byteVector0.putUTF8("hi!");
        org.mockito.asm.ByteVector byteVector4 = byteVector0.putLong((long) ' ');
        org.mockito.asm.ByteVector byteVector6 = byteVector4.putByte((int) 'a');
        org.mockito.asm.ByteVector byteVector8 = byteVector4.putByte((int) (short) -1);
        org.mockito.asm.ByteVector byteVector10 = byteVector4.putLong(0L);
        org.mockito.asm.ByteVector byteVector12 = byteVector4.putUTF8("hi!");
        org.mockito.asm.ByteVector byteVector14 = byteVector12.putUTF8("hi!");
        org.mockito.asm.ByteVector byteVector16 = byteVector12.putShort(0);
        org.mockito.asm.ByteVector byteVector18 = byteVector12.putShort(10);
        org.junit.Assert.assertNotNull(byteVector2);
        org.junit.Assert.assertNotNull(byteVector4);
        org.junit.Assert.assertNotNull(byteVector6);
        org.junit.Assert.assertNotNull(byteVector8);
        org.junit.Assert.assertNotNull(byteVector10);
        org.junit.Assert.assertNotNull(byteVector12);
        org.junit.Assert.assertNotNull(byteVector14);
        org.junit.Assert.assertNotNull(byteVector16);
        org.junit.Assert.assertNotNull(byteVector18);
    }

    @Test
    public void test0340() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0340");
        org.mockito.asm.ByteVector byteVector0 = new org.mockito.asm.ByteVector();
        org.mockito.asm.ByteVector byteVector2 = byteVector0.putUTF8("hi!");
        org.mockito.asm.ByteVector byteVector4 = byteVector2.putLong((long) (byte) 10);
        org.mockito.asm.ByteVector byteVector6 = byteVector4.putUTF8("hi!");
        org.mockito.asm.ByteVector byteVector8 = byteVector4.putLong((long) 10);
        org.mockito.asm.ByteVector byteVector10 = byteVector8.putLong((long) 1);
        java.lang.Class<?> wildcardClass11 = byteVector8.getClass();
        org.junit.Assert.assertNotNull(byteVector2);
        org.junit.Assert.assertNotNull(byteVector4);
        org.junit.Assert.assertNotNull(byteVector6);
        org.junit.Assert.assertNotNull(byteVector8);
        org.junit.Assert.assertNotNull(byteVector10);
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test0341() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0341");
        org.mockito.asm.ByteVector byteVector1 = new org.mockito.asm.ByteVector((int) (byte) 10);
        org.mockito.asm.ByteVector byteVector3 = byteVector1.putByte((int) '4');
        org.mockito.asm.ByteVector byteVector5 = byteVector1.putLong(0L);
        org.mockito.asm.ByteVector byteVector7 = byteVector5.putUTF8("");
        org.mockito.asm.ByteVector byteVector9 = byteVector5.putUTF8("hi!");
        org.mockito.asm.ByteVector byteVector11 = byteVector5.putUTF8("hi!");
        org.junit.Assert.assertNotNull(byteVector3);
        org.junit.Assert.assertNotNull(byteVector5);
        org.junit.Assert.assertNotNull(byteVector7);
        org.junit.Assert.assertNotNull(byteVector9);
        org.junit.Assert.assertNotNull(byteVector11);
    }

    @Test
    public void test0342() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0342");
        org.mockito.asm.ByteVector byteVector0 = new org.mockito.asm.ByteVector();
        org.mockito.asm.ByteVector byteVector2 = byteVector0.putUTF8("hi!");
        org.mockito.asm.ByteVector byteVector4 = byteVector0.putLong((long) ' ');
        org.mockito.asm.ByteVector byteVector6 = byteVector4.putByte((int) 'a');
        org.mockito.asm.ByteVector byteVector8 = byteVector4.putByte((int) (short) -1);
        org.mockito.asm.ByteVector byteVector10 = byteVector4.putLong(0L);
        org.mockito.asm.ByteVector byteVector12 = byteVector10.putByte(0);
        org.mockito.asm.ByteVector byteVector14 = byteVector12.putByte(100);
        org.mockito.asm.ByteVector byteVector16 = byteVector12.putByte((int) '4');
        org.mockito.asm.ByteVector byteVector18 = byteVector16.putUTF8("hi!");
        org.mockito.asm.ByteVector byteVector19 = new org.mockito.asm.ByteVector();
        org.mockito.asm.ByteVector byteVector21 = byteVector19.putUTF8("hi!");
        org.mockito.asm.ByteVector byteVector23 = byteVector21.putLong((long) (byte) 10);
        org.mockito.asm.ByteVector byteVector25 = byteVector23.putUTF8("hi!");
        org.mockito.asm.ByteVector byteVector27 = byteVector23.putLong((-1L));
        org.mockito.asm.ByteVector byteVector29 = new org.mockito.asm.ByteVector((int) (short) 0);
        org.mockito.asm.ByteVector byteVector30 = new org.mockito.asm.ByteVector();
        org.mockito.asm.ByteVector byteVector32 = byteVector30.putUTF8("hi!");
        org.mockito.asm.ByteVector byteVector34 = byteVector30.putInt(0);
        org.mockito.asm.ByteVector byteVector36 = byteVector34.putInt((int) ' ');
        org.mockito.asm.ByteVector byteVector38 = byteVector36.putLong(100L);
        byte[] byteArray42 = new byte[] { (byte) 0, (byte) 10, (byte) 1 };
        org.mockito.asm.ByteVector byteVector45 = byteVector36.putByteArray(byteArray42, 0, 0);
        org.mockito.asm.ByteVector byteVector48 = byteVector29.putByteArray(byteArray42, 1, (int) (short) 0);
        org.mockito.asm.ByteVector byteVector51 = byteVector27.putByteArray(byteArray42, 0, (int) (byte) 1);
        // The following exception was thrown during execution in test generation
        try {
            org.mockito.asm.ByteVector byteVector54 = byteVector16.putByteArray(byteArray42, 10, (int) '4');
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteVector2);
        org.junit.Assert.assertNotNull(byteVector4);
        org.junit.Assert.assertNotNull(byteVector6);
        org.junit.Assert.assertNotNull(byteVector8);
        org.junit.Assert.assertNotNull(byteVector10);
        org.junit.Assert.assertNotNull(byteVector12);
        org.junit.Assert.assertNotNull(byteVector14);
        org.junit.Assert.assertNotNull(byteVector16);
        org.junit.Assert.assertNotNull(byteVector18);
        org.junit.Assert.assertNotNull(byteVector21);
        org.junit.Assert.assertNotNull(byteVector23);
        org.junit.Assert.assertNotNull(byteVector25);
        org.junit.Assert.assertNotNull(byteVector27);
        org.junit.Assert.assertNotNull(byteVector32);
        org.junit.Assert.assertNotNull(byteVector34);
        org.junit.Assert.assertNotNull(byteVector36);
        org.junit.Assert.assertNotNull(byteVector38);
        org.junit.Assert.assertNotNull(byteArray42);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray42), "[0, 10, 1]");
        org.junit.Assert.assertNotNull(byteVector45);
        org.junit.Assert.assertNotNull(byteVector48);
        org.junit.Assert.assertNotNull(byteVector51);
    }

    @Test
    public void test0343() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0343");
        org.mockito.asm.ByteVector byteVector0 = new org.mockito.asm.ByteVector();
        org.mockito.asm.ByteVector byteVector2 = byteVector0.putUTF8("hi!");
        org.mockito.asm.ByteVector byteVector4 = byteVector0.putLong((long) ' ');
        org.mockito.asm.ByteVector byteVector6 = byteVector4.putByte((int) 'a');
        org.mockito.asm.ByteVector byteVector8 = byteVector6.putByte((int) (short) -1);
        byte[] byteArray9 = null;
        org.mockito.asm.ByteVector byteVector12 = byteVector6.putByteArray(byteArray9, (int) '#', 0);
        org.mockito.asm.ByteVector byteVector14 = byteVector6.putLong((long) '#');
        org.mockito.asm.ByteVector byteVector16 = byteVector14.putShort((int) 'a');
        org.mockito.asm.ByteVector byteVector18 = byteVector16.putLong(10L);
        org.mockito.asm.ByteVector byteVector19 = new org.mockito.asm.ByteVector();
        org.mockito.asm.ByteVector byteVector21 = byteVector19.putUTF8("hi!");
        org.mockito.asm.ByteVector byteVector23 = byteVector19.putShort((int) (short) -1);
        org.mockito.asm.ByteVector byteVector25 = byteVector19.putInt((int) (byte) 10);
        org.mockito.asm.ByteVector byteVector27 = byteVector25.putUTF8("hi!");
        org.mockito.asm.ByteVector byteVector29 = byteVector27.putByte((int) (byte) 1);
        org.mockito.asm.ByteVector byteVector31 = byteVector29.putUTF8("hi!");
        org.mockito.asm.ByteVector byteVector33 = byteVector31.putByte((int) (byte) 10);
        byte[] byteArray36 = new byte[] { (byte) 10, (byte) 0 };
        org.mockito.asm.ByteVector byteVector39 = byteVector33.putByteArray(byteArray36, 0, (int) (short) 0);
        // The following exception was thrown during execution in test generation
        try {
            org.mockito.asm.ByteVector byteVector42 = byteVector16.putByteArray(byteArray36, (int) (byte) 100, 100);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteVector2);
        org.junit.Assert.assertNotNull(byteVector4);
        org.junit.Assert.assertNotNull(byteVector6);
        org.junit.Assert.assertNotNull(byteVector8);
        org.junit.Assert.assertNotNull(byteVector12);
        org.junit.Assert.assertNotNull(byteVector14);
        org.junit.Assert.assertNotNull(byteVector16);
        org.junit.Assert.assertNotNull(byteVector18);
        org.junit.Assert.assertNotNull(byteVector21);
        org.junit.Assert.assertNotNull(byteVector23);
        org.junit.Assert.assertNotNull(byteVector25);
        org.junit.Assert.assertNotNull(byteVector27);
        org.junit.Assert.assertNotNull(byteVector29);
        org.junit.Assert.assertNotNull(byteVector31);
        org.junit.Assert.assertNotNull(byteVector33);
        org.junit.Assert.assertNotNull(byteArray36);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray36), "[10, 0]");
        org.junit.Assert.assertNotNull(byteVector39);
    }

    @Test
    public void test0344() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0344");
        org.mockito.asm.ByteVector byteVector0 = new org.mockito.asm.ByteVector();
        org.mockito.asm.ByteVector byteVector2 = byteVector0.putUTF8("hi!");
        org.mockito.asm.ByteVector byteVector4 = byteVector0.putLong((long) ' ');
        org.mockito.asm.ByteVector byteVector6 = byteVector4.putByte((int) 'a');
        org.mockito.asm.ByteVector byteVector8 = byteVector4.putShort(100);
        org.mockito.asm.ByteVector byteVector10 = byteVector8.putByte((int) (short) 0);
        org.mockito.asm.ByteVector byteVector12 = byteVector8.putLong(1L);
        org.mockito.asm.ByteVector byteVector13 = new org.mockito.asm.ByteVector();
        org.mockito.asm.ByteVector byteVector15 = byteVector13.putUTF8("hi!");
        org.mockito.asm.ByteVector byteVector17 = byteVector15.putLong((long) (byte) 10);
        org.mockito.asm.ByteVector byteVector19 = byteVector17.putUTF8("hi!");
        org.mockito.asm.ByteVector byteVector21 = byteVector17.putLong((long) (short) -1);
        org.mockito.asm.ByteVector byteVector23 = byteVector21.putInt(10);
        org.mockito.asm.ByteVector byteVector25 = byteVector21.putByte((int) (short) 1);
        org.mockito.asm.ByteVector byteVector27 = byteVector21.putInt((int) (short) -1);
        org.mockito.asm.ByteVector byteVector29 = byteVector21.putUTF8("hi!");
        org.mockito.asm.ByteVector byteVector30 = new org.mockito.asm.ByteVector();
        org.mockito.asm.ByteVector byteVector32 = byteVector30.putUTF8("hi!");
        org.mockito.asm.ByteVector byteVector34 = byteVector30.putLong((long) ' ');
        org.mockito.asm.ByteVector byteVector36 = byteVector34.putByte((int) 'a');
        org.mockito.asm.ByteVector byteVector38 = byteVector34.putByte((int) (short) -1);
        org.mockito.asm.ByteVector byteVector40 = byteVector34.putLong(0L);
        org.mockito.asm.ByteVector byteVector42 = byteVector34.putUTF8("hi!");
        org.mockito.asm.ByteVector byteVector44 = byteVector42.putUTF8("");
        org.mockito.asm.ByteVector byteVector46 = byteVector44.putLong((long) (byte) 10);
        org.mockito.asm.ByteVector byteVector48 = byteVector44.putLong((long) (short) 100);
        byte[] byteArray53 = new byte[] { (byte) 1, (byte) 0, (byte) 0, (byte) -1 };
        org.mockito.asm.ByteVector byteVector56 = byteVector44.putByteArray(byteArray53, 0, 0);
        org.mockito.asm.ByteVector byteVector59 = byteVector29.putByteArray(byteArray53, (int) (byte) 0, (int) (short) 1);
        // The following exception was thrown during execution in test generation
        try {
            org.mockito.asm.ByteVector byteVector62 = byteVector12.putByteArray(byteArray53, (int) '#', (int) (byte) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteVector2);
        org.junit.Assert.assertNotNull(byteVector4);
        org.junit.Assert.assertNotNull(byteVector6);
        org.junit.Assert.assertNotNull(byteVector8);
        org.junit.Assert.assertNotNull(byteVector10);
        org.junit.Assert.assertNotNull(byteVector12);
        org.junit.Assert.assertNotNull(byteVector15);
        org.junit.Assert.assertNotNull(byteVector17);
        org.junit.Assert.assertNotNull(byteVector19);
        org.junit.Assert.assertNotNull(byteVector21);
        org.junit.Assert.assertNotNull(byteVector23);
        org.junit.Assert.assertNotNull(byteVector25);
        org.junit.Assert.assertNotNull(byteVector27);
        org.junit.Assert.assertNotNull(byteVector29);
        org.junit.Assert.assertNotNull(byteVector32);
        org.junit.Assert.assertNotNull(byteVector34);
        org.junit.Assert.assertNotNull(byteVector36);
        org.junit.Assert.assertNotNull(byteVector38);
        org.junit.Assert.assertNotNull(byteVector40);
        org.junit.Assert.assertNotNull(byteVector42);
        org.junit.Assert.assertNotNull(byteVector44);
        org.junit.Assert.assertNotNull(byteVector46);
        org.junit.Assert.assertNotNull(byteVector48);
        org.junit.Assert.assertNotNull(byteArray53);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray53), "[1, 0, 0, -1]");
        org.junit.Assert.assertNotNull(byteVector56);
        org.junit.Assert.assertNotNull(byteVector59);
    }

    @Test
    public void test0345() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0345");
        org.mockito.asm.ByteVector byteVector1 = new org.mockito.asm.ByteVector((int) '#');
        org.mockito.asm.ByteVector byteVector3 = byteVector1.putLong(100L);
        org.mockito.asm.ByteVector byteVector5 = byteVector1.putUTF8("");
        org.mockito.asm.ByteVector byteVector7 = byteVector5.putInt((int) (byte) 10);
        org.mockito.asm.ByteVector byteVector9 = new org.mockito.asm.ByteVector((int) (byte) 100);
        org.mockito.asm.ByteVector byteVector11 = byteVector9.putShort((int) (short) 100);
        org.mockito.asm.ByteVector byteVector12 = new org.mockito.asm.ByteVector();
        org.mockito.asm.ByteVector byteVector14 = byteVector12.putUTF8("hi!");
        org.mockito.asm.ByteVector byteVector16 = byteVector12.putLong((long) ' ');
        org.mockito.asm.ByteVector byteVector18 = byteVector16.putByte((int) 'a');
        org.mockito.asm.ByteVector byteVector20 = byteVector16.putByte((int) (short) -1);
        org.mockito.asm.ByteVector byteVector22 = byteVector16.putLong(0L);
        org.mockito.asm.ByteVector byteVector24 = byteVector16.putUTF8("hi!");
        org.mockito.asm.ByteVector byteVector26 = byteVector24.putUTF8("");
        org.mockito.asm.ByteVector byteVector28 = byteVector24.putInt((int) (byte) 10);
        org.mockito.asm.ByteVector byteVector30 = byteVector24.putByte(0);
        org.mockito.asm.ByteVector byteVector31 = new org.mockito.asm.ByteVector();
        org.mockito.asm.ByteVector byteVector33 = byteVector31.putUTF8("hi!");
        org.mockito.asm.ByteVector byteVector35 = byteVector31.putInt(0);
        org.mockito.asm.ByteVector byteVector37 = byteVector35.putInt((int) ' ');
        org.mockito.asm.ByteVector byteVector39 = byteVector37.putLong(100L);
        byte[] byteArray43 = new byte[] { (byte) 0, (byte) 10, (byte) 1 };
        org.mockito.asm.ByteVector byteVector46 = byteVector37.putByteArray(byteArray43, 0, 0);
        org.mockito.asm.ByteVector byteVector49 = byteVector30.putByteArray(byteArray43, (int) (short) 1, 0);
        org.mockito.asm.ByteVector byteVector52 = byteVector9.putByteArray(byteArray43, 0, (int) (byte) 1);
        // The following exception was thrown during execution in test generation
        try {
            org.mockito.asm.ByteVector byteVector55 = byteVector7.putByteArray(byteArray43, (int) (byte) 0, (int) (short) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteVector3);
        org.junit.Assert.assertNotNull(byteVector5);
        org.junit.Assert.assertNotNull(byteVector7);
        org.junit.Assert.assertNotNull(byteVector11);
        org.junit.Assert.assertNotNull(byteVector14);
        org.junit.Assert.assertNotNull(byteVector16);
        org.junit.Assert.assertNotNull(byteVector18);
        org.junit.Assert.assertNotNull(byteVector20);
        org.junit.Assert.assertNotNull(byteVector22);
        org.junit.Assert.assertNotNull(byteVector24);
        org.junit.Assert.assertNotNull(byteVector26);
        org.junit.Assert.assertNotNull(byteVector28);
        org.junit.Assert.assertNotNull(byteVector30);
        org.junit.Assert.assertNotNull(byteVector33);
        org.junit.Assert.assertNotNull(byteVector35);
        org.junit.Assert.assertNotNull(byteVector37);
        org.junit.Assert.assertNotNull(byteVector39);
        org.junit.Assert.assertNotNull(byteArray43);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray43), "[0, 10, 1]");
        org.junit.Assert.assertNotNull(byteVector46);
        org.junit.Assert.assertNotNull(byteVector49);
        org.junit.Assert.assertNotNull(byteVector52);
    }

    @Test
    public void test0346() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0346");
        org.mockito.asm.ByteVector byteVector0 = new org.mockito.asm.ByteVector();
        org.mockito.asm.ByteVector byteVector2 = byteVector0.putUTF8("hi!");
        org.mockito.asm.ByteVector byteVector4 = byteVector0.putShort((int) (short) -1);
        org.mockito.asm.ByteVector byteVector6 = byteVector0.putLong(0L);
        org.mockito.asm.ByteVector byteVector8 = byteVector0.putShort((int) (byte) -1);
        org.mockito.asm.ByteVector byteVector10 = byteVector0.putInt((int) (byte) 0);
        org.mockito.asm.ByteVector byteVector12 = byteVector10.putLong((long) (byte) -1);
        org.mockito.asm.ByteVector byteVector14 = new org.mockito.asm.ByteVector((int) (byte) 10);
        org.mockito.asm.ByteVector byteVector16 = byteVector14.putByte((int) '4');
        org.mockito.asm.ByteVector byteVector18 = byteVector14.putLong((long) 'a');
        org.mockito.asm.ByteVector byteVector19 = new org.mockito.asm.ByteVector();
        org.mockito.asm.ByteVector byteVector21 = byteVector19.putUTF8("hi!");
        org.mockito.asm.ByteVector byteVector23 = byteVector19.putLong((long) ' ');
        org.mockito.asm.ByteVector byteVector25 = byteVector23.putByte((int) 'a');
        org.mockito.asm.ByteVector byteVector27 = byteVector23.putByte((int) (short) -1);
        org.mockito.asm.ByteVector byteVector29 = byteVector23.putLong(0L);
        org.mockito.asm.ByteVector byteVector31 = byteVector23.putUTF8("hi!");
        org.mockito.asm.ByteVector byteVector33 = byteVector31.putUTF8("");
        org.mockito.asm.ByteVector byteVector35 = byteVector31.putInt((int) (byte) 10);
        org.mockito.asm.ByteVector byteVector37 = byteVector31.putByte(0);
        org.mockito.asm.ByteVector byteVector38 = new org.mockito.asm.ByteVector();
        org.mockito.asm.ByteVector byteVector40 = byteVector38.putUTF8("hi!");
        org.mockito.asm.ByteVector byteVector42 = byteVector38.putInt(0);
        org.mockito.asm.ByteVector byteVector44 = byteVector42.putInt((int) ' ');
        org.mockito.asm.ByteVector byteVector46 = byteVector44.putLong(100L);
        byte[] byteArray50 = new byte[] { (byte) 0, (byte) 10, (byte) 1 };
        org.mockito.asm.ByteVector byteVector53 = byteVector44.putByteArray(byteArray50, 0, 0);
        org.mockito.asm.ByteVector byteVector56 = byteVector37.putByteArray(byteArray50, (int) (short) 1, 0);
        org.mockito.asm.ByteVector byteVector59 = byteVector18.putByteArray(byteArray50, 0, 0);
        // The following exception was thrown during execution in test generation
        try {
            org.mockito.asm.ByteVector byteVector62 = byteVector12.putByteArray(byteArray50, 1, (-1));
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteVector2);
        org.junit.Assert.assertNotNull(byteVector4);
        org.junit.Assert.assertNotNull(byteVector6);
        org.junit.Assert.assertNotNull(byteVector8);
        org.junit.Assert.assertNotNull(byteVector10);
        org.junit.Assert.assertNotNull(byteVector12);
        org.junit.Assert.assertNotNull(byteVector16);
        org.junit.Assert.assertNotNull(byteVector18);
        org.junit.Assert.assertNotNull(byteVector21);
        org.junit.Assert.assertNotNull(byteVector23);
        org.junit.Assert.assertNotNull(byteVector25);
        org.junit.Assert.assertNotNull(byteVector27);
        org.junit.Assert.assertNotNull(byteVector29);
        org.junit.Assert.assertNotNull(byteVector31);
        org.junit.Assert.assertNotNull(byteVector33);
        org.junit.Assert.assertNotNull(byteVector35);
        org.junit.Assert.assertNotNull(byteVector37);
        org.junit.Assert.assertNotNull(byteVector40);
        org.junit.Assert.assertNotNull(byteVector42);
        org.junit.Assert.assertNotNull(byteVector44);
        org.junit.Assert.assertNotNull(byteVector46);
        org.junit.Assert.assertNotNull(byteArray50);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray50), "[0, 10, 1]");
        org.junit.Assert.assertNotNull(byteVector53);
        org.junit.Assert.assertNotNull(byteVector56);
        org.junit.Assert.assertNotNull(byteVector59);
    }

    @Test
    public void test0347() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0347");
        org.mockito.asm.ByteVector byteVector0 = new org.mockito.asm.ByteVector();
        org.mockito.asm.ByteVector byteVector2 = byteVector0.putUTF8("hi!");
        org.mockito.asm.ByteVector byteVector4 = byteVector2.putInt(0);
        org.mockito.asm.ByteVector byteVector6 = byteVector4.putShort((int) '4');
        org.mockito.asm.ByteVector byteVector8 = byteVector6.putByte(100);
        org.mockito.asm.ByteVector byteVector10 = byteVector6.putUTF8("hi!");
        org.mockito.asm.ByteVector byteVector12 = byteVector10.putInt((int) (short) 100);
        org.mockito.asm.ByteVector byteVector14 = new org.mockito.asm.ByteVector((int) (byte) 100);
        org.mockito.asm.ByteVector byteVector16 = byteVector14.putShort((int) (short) 100);
        org.mockito.asm.ByteVector byteVector17 = new org.mockito.asm.ByteVector();
        org.mockito.asm.ByteVector byteVector19 = byteVector17.putUTF8("hi!");
        org.mockito.asm.ByteVector byteVector21 = byteVector17.putLong((long) ' ');
        org.mockito.asm.ByteVector byteVector23 = byteVector21.putByte((int) 'a');
        org.mockito.asm.ByteVector byteVector25 = byteVector21.putByte((int) (short) -1);
        org.mockito.asm.ByteVector byteVector27 = byteVector21.putLong(0L);
        org.mockito.asm.ByteVector byteVector29 = byteVector21.putUTF8("hi!");
        org.mockito.asm.ByteVector byteVector31 = byteVector29.putUTF8("");
        org.mockito.asm.ByteVector byteVector33 = byteVector29.putInt((int) (byte) 10);
        org.mockito.asm.ByteVector byteVector35 = byteVector29.putByte(0);
        org.mockito.asm.ByteVector byteVector36 = new org.mockito.asm.ByteVector();
        org.mockito.asm.ByteVector byteVector38 = byteVector36.putUTF8("hi!");
        org.mockito.asm.ByteVector byteVector40 = byteVector36.putInt(0);
        org.mockito.asm.ByteVector byteVector42 = byteVector40.putInt((int) ' ');
        org.mockito.asm.ByteVector byteVector44 = byteVector42.putLong(100L);
        byte[] byteArray48 = new byte[] { (byte) 0, (byte) 10, (byte) 1 };
        org.mockito.asm.ByteVector byteVector51 = byteVector42.putByteArray(byteArray48, 0, 0);
        org.mockito.asm.ByteVector byteVector54 = byteVector35.putByteArray(byteArray48, (int) (short) 1, 0);
        org.mockito.asm.ByteVector byteVector57 = byteVector14.putByteArray(byteArray48, 0, (int) (byte) 1);
        // The following exception was thrown during execution in test generation
        try {
            org.mockito.asm.ByteVector byteVector60 = byteVector10.putByteArray(byteArray48, 100, (int) 'a');
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteVector2);
        org.junit.Assert.assertNotNull(byteVector4);
        org.junit.Assert.assertNotNull(byteVector6);
        org.junit.Assert.assertNotNull(byteVector8);
        org.junit.Assert.assertNotNull(byteVector10);
        org.junit.Assert.assertNotNull(byteVector12);
        org.junit.Assert.assertNotNull(byteVector16);
        org.junit.Assert.assertNotNull(byteVector19);
        org.junit.Assert.assertNotNull(byteVector21);
        org.junit.Assert.assertNotNull(byteVector23);
        org.junit.Assert.assertNotNull(byteVector25);
        org.junit.Assert.assertNotNull(byteVector27);
        org.junit.Assert.assertNotNull(byteVector29);
        org.junit.Assert.assertNotNull(byteVector31);
        org.junit.Assert.assertNotNull(byteVector33);
        org.junit.Assert.assertNotNull(byteVector35);
        org.junit.Assert.assertNotNull(byteVector38);
        org.junit.Assert.assertNotNull(byteVector40);
        org.junit.Assert.assertNotNull(byteVector42);
        org.junit.Assert.assertNotNull(byteVector44);
        org.junit.Assert.assertNotNull(byteArray48);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray48), "[0, 10, 1]");
        org.junit.Assert.assertNotNull(byteVector51);
        org.junit.Assert.assertNotNull(byteVector54);
        org.junit.Assert.assertNotNull(byteVector57);
    }

    @Test
    public void test0348() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0348");
        org.mockito.asm.ByteVector byteVector0 = new org.mockito.asm.ByteVector();
        org.mockito.asm.ByteVector byteVector2 = byteVector0.putUTF8("hi!");
        org.mockito.asm.ByteVector byteVector4 = byteVector2.putInt(0);
        org.mockito.asm.ByteVector byteVector6 = byteVector4.putByte((int) (short) 0);
        org.mockito.asm.ByteVector byteVector8 = byteVector4.putUTF8("");
        org.mockito.asm.ByteVector byteVector9 = new org.mockito.asm.ByteVector();
        org.mockito.asm.ByteVector byteVector11 = byteVector9.putUTF8("hi!");
        org.mockito.asm.ByteVector byteVector13 = byteVector9.putInt(0);
        org.mockito.asm.ByteVector byteVector15 = byteVector9.putShort((int) '4');
        org.mockito.asm.ByteVector byteVector17 = byteVector9.putByte(100);
        org.mockito.asm.ByteVector byteVector19 = byteVector17.putInt((int) (byte) 10);
        org.mockito.asm.ByteVector byteVector21 = byteVector17.putInt((int) (byte) 10);
        org.mockito.asm.ByteVector byteVector23 = byteVector21.putByte(100);
        org.mockito.asm.ByteVector byteVector24 = new org.mockito.asm.ByteVector();
        org.mockito.asm.ByteVector byteVector26 = byteVector24.putUTF8("hi!");
        org.mockito.asm.ByteVector byteVector28 = byteVector24.putInt(0);
        org.mockito.asm.ByteVector byteVector30 = byteVector28.putInt((int) ' ');
        org.mockito.asm.ByteVector byteVector32 = byteVector30.putLong(100L);
        byte[] byteArray36 = new byte[] { (byte) 0, (byte) 10, (byte) 1 };
        org.mockito.asm.ByteVector byteVector39 = byteVector30.putByteArray(byteArray36, 0, 0);
        org.mockito.asm.ByteVector byteVector42 = byteVector23.putByteArray(byteArray36, (int) (byte) 1, (int) (byte) 0);
        org.mockito.asm.ByteVector byteVector45 = byteVector4.putByteArray(byteArray36, (int) (short) 0, 0);
        java.lang.Class<?> wildcardClass46 = byteVector4.getClass();
        org.junit.Assert.assertNotNull(byteVector2);
        org.junit.Assert.assertNotNull(byteVector4);
        org.junit.Assert.assertNotNull(byteVector6);
        org.junit.Assert.assertNotNull(byteVector8);
        org.junit.Assert.assertNotNull(byteVector11);
        org.junit.Assert.assertNotNull(byteVector13);
        org.junit.Assert.assertNotNull(byteVector15);
        org.junit.Assert.assertNotNull(byteVector17);
        org.junit.Assert.assertNotNull(byteVector19);
        org.junit.Assert.assertNotNull(byteVector21);
        org.junit.Assert.assertNotNull(byteVector23);
        org.junit.Assert.assertNotNull(byteVector26);
        org.junit.Assert.assertNotNull(byteVector28);
        org.junit.Assert.assertNotNull(byteVector30);
        org.junit.Assert.assertNotNull(byteVector32);
        org.junit.Assert.assertNotNull(byteArray36);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray36), "[0, 10, 1]");
        org.junit.Assert.assertNotNull(byteVector39);
        org.junit.Assert.assertNotNull(byteVector42);
        org.junit.Assert.assertNotNull(byteVector45);
        org.junit.Assert.assertNotNull(wildcardClass46);
    }

    @Test
    public void test0349() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0349");
        org.mockito.asm.ByteVector byteVector0 = new org.mockito.asm.ByteVector();
        org.mockito.asm.ByteVector byteVector2 = byteVector0.putUTF8("hi!");
        org.mockito.asm.ByteVector byteVector4 = byteVector0.putInt(0);
        java.lang.Class<?> wildcardClass5 = byteVector0.getClass();
        org.junit.Assert.assertNotNull(byteVector2);
        org.junit.Assert.assertNotNull(byteVector4);
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test0350() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0350");
        org.mockito.asm.ByteVector byteVector0 = new org.mockito.asm.ByteVector();
        org.mockito.asm.ByteVector byteVector2 = byteVector0.putUTF8("hi!");
        org.mockito.asm.ByteVector byteVector4 = byteVector0.putLong((long) ' ');
        org.mockito.asm.ByteVector byteVector6 = byteVector4.putByte((int) 'a');
        org.mockito.asm.ByteVector byteVector8 = byteVector4.putByte((int) (short) -1);
        org.mockito.asm.ByteVector byteVector10 = byteVector4.putLong(0L);
        org.mockito.asm.ByteVector byteVector12 = byteVector10.putByte(0);
        org.mockito.asm.ByteVector byteVector14 = byteVector12.putByte(100);
        org.mockito.asm.ByteVector byteVector16 = byteVector12.putInt((-1));
        org.mockito.asm.ByteVector byteVector18 = byteVector12.putByte((int) (byte) 100);
        org.mockito.asm.ByteVector byteVector20 = byteVector12.putInt((int) (short) 1);
        org.mockito.asm.ByteVector byteVector22 = byteVector20.putByte((int) ' ');
        org.mockito.asm.ByteVector byteVector24 = byteVector20.putUTF8("");
        org.mockito.asm.ByteVector byteVector25 = new org.mockito.asm.ByteVector();
        org.mockito.asm.ByteVector byteVector27 = byteVector25.putUTF8("hi!");
        org.mockito.asm.ByteVector byteVector29 = byteVector25.putLong((long) ' ');
        org.mockito.asm.ByteVector byteVector31 = byteVector29.putByte((int) 'a');
        org.mockito.asm.ByteVector byteVector33 = byteVector29.putByte((int) (short) -1);
        org.mockito.asm.ByteVector byteVector35 = byteVector29.putLong(0L);
        org.mockito.asm.ByteVector byteVector37 = byteVector35.putInt((int) (short) -1);
        org.mockito.asm.ByteVector byteVector39 = byteVector37.putByte(100);
        org.mockito.asm.ByteVector byteVector41 = byteVector39.putUTF8("hi!");
        org.mockito.asm.ByteVector byteVector43 = byteVector39.putLong((long) (short) 0);
        org.mockito.asm.ByteVector byteVector44 = new org.mockito.asm.ByteVector();
        org.mockito.asm.ByteVector byteVector46 = byteVector44.putUTF8("hi!");
        org.mockito.asm.ByteVector byteVector48 = byteVector44.putLong((long) ' ');
        org.mockito.asm.ByteVector byteVector50 = byteVector48.putByte((int) 'a');
        org.mockito.asm.ByteVector byteVector52 = byteVector48.putByte((int) (short) -1);
        org.mockito.asm.ByteVector byteVector54 = byteVector48.putLong(0L);
        org.mockito.asm.ByteVector byteVector56 = byteVector48.putUTF8("hi!");
        org.mockito.asm.ByteVector byteVector58 = byteVector56.putUTF8("");
        org.mockito.asm.ByteVector byteVector60 = byteVector56.putInt((int) (byte) 10);
        org.mockito.asm.ByteVector byteVector62 = byteVector56.putByte(0);
        org.mockito.asm.ByteVector byteVector63 = new org.mockito.asm.ByteVector();
        org.mockito.asm.ByteVector byteVector65 = byteVector63.putUTF8("hi!");
        org.mockito.asm.ByteVector byteVector67 = byteVector63.putInt(0);
        org.mockito.asm.ByteVector byteVector69 = byteVector67.putInt((int) ' ');
        org.mockito.asm.ByteVector byteVector71 = byteVector69.putLong(100L);
        byte[] byteArray75 = new byte[] { (byte) 0, (byte) 10, (byte) 1 };
        org.mockito.asm.ByteVector byteVector78 = byteVector69.putByteArray(byteArray75, 0, 0);
        org.mockito.asm.ByteVector byteVector81 = byteVector62.putByteArray(byteArray75, (int) (short) 1, 0);
        org.mockito.asm.ByteVector byteVector84 = byteVector43.putByteArray(byteArray75, (int) (byte) 0, (int) (byte) 1);
        // The following exception was thrown during execution in test generation
        try {
            org.mockito.asm.ByteVector byteVector87 = byteVector20.putByteArray(byteArray75, (int) (byte) -1, (int) (short) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteVector2);
        org.junit.Assert.assertNotNull(byteVector4);
        org.junit.Assert.assertNotNull(byteVector6);
        org.junit.Assert.assertNotNull(byteVector8);
        org.junit.Assert.assertNotNull(byteVector10);
        org.junit.Assert.assertNotNull(byteVector12);
        org.junit.Assert.assertNotNull(byteVector14);
        org.junit.Assert.assertNotNull(byteVector16);
        org.junit.Assert.assertNotNull(byteVector18);
        org.junit.Assert.assertNotNull(byteVector20);
        org.junit.Assert.assertNotNull(byteVector22);
        org.junit.Assert.assertNotNull(byteVector24);
        org.junit.Assert.assertNotNull(byteVector27);
        org.junit.Assert.assertNotNull(byteVector29);
        org.junit.Assert.assertNotNull(byteVector31);
        org.junit.Assert.assertNotNull(byteVector33);
        org.junit.Assert.assertNotNull(byteVector35);
        org.junit.Assert.assertNotNull(byteVector37);
        org.junit.Assert.assertNotNull(byteVector39);
        org.junit.Assert.assertNotNull(byteVector41);
        org.junit.Assert.assertNotNull(byteVector43);
        org.junit.Assert.assertNotNull(byteVector46);
        org.junit.Assert.assertNotNull(byteVector48);
        org.junit.Assert.assertNotNull(byteVector50);
        org.junit.Assert.assertNotNull(byteVector52);
        org.junit.Assert.assertNotNull(byteVector54);
        org.junit.Assert.assertNotNull(byteVector56);
        org.junit.Assert.assertNotNull(byteVector58);
        org.junit.Assert.assertNotNull(byteVector60);
        org.junit.Assert.assertNotNull(byteVector62);
        org.junit.Assert.assertNotNull(byteVector65);
        org.junit.Assert.assertNotNull(byteVector67);
        org.junit.Assert.assertNotNull(byteVector69);
        org.junit.Assert.assertNotNull(byteVector71);
        org.junit.Assert.assertNotNull(byteArray75);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray75), "[0, 10, 1]");
        org.junit.Assert.assertNotNull(byteVector78);
        org.junit.Assert.assertNotNull(byteVector81);
        org.junit.Assert.assertNotNull(byteVector84);
    }

    @Test
    public void test0351() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0351");
        org.mockito.asm.ByteVector byteVector0 = new org.mockito.asm.ByteVector();
        org.mockito.asm.ByteVector byteVector2 = byteVector0.putUTF8("hi!");
        org.mockito.asm.ByteVector byteVector4 = byteVector2.putLong((long) (byte) 10);
        org.mockito.asm.ByteVector byteVector6 = byteVector4.putUTF8("hi!");
        org.mockito.asm.ByteVector byteVector8 = byteVector4.putLong((long) (short) -1);
        org.mockito.asm.ByteVector byteVector10 = byteVector8.putInt(10);
        org.mockito.asm.ByteVector byteVector12 = byteVector8.putByte((int) (short) 1);
        org.mockito.asm.ByteVector byteVector14 = byteVector12.putInt((int) 'a');
        org.junit.Assert.assertNotNull(byteVector2);
        org.junit.Assert.assertNotNull(byteVector4);
        org.junit.Assert.assertNotNull(byteVector6);
        org.junit.Assert.assertNotNull(byteVector8);
        org.junit.Assert.assertNotNull(byteVector10);
        org.junit.Assert.assertNotNull(byteVector12);
        org.junit.Assert.assertNotNull(byteVector14);
    }

    @Test
    public void test0352() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0352");
        org.mockito.asm.ByteVector byteVector0 = new org.mockito.asm.ByteVector();
        org.mockito.asm.ByteVector byteVector2 = byteVector0.putUTF8("hi!");
        org.mockito.asm.ByteVector byteVector4 = byteVector0.putLong((long) ' ');
        org.mockito.asm.ByteVector byteVector6 = byteVector4.putByte((int) 'a');
        org.mockito.asm.ByteVector byteVector8 = byteVector6.putByte((int) (short) -1);
        org.mockito.asm.ByteVector byteVector10 = byteVector8.putLong((long) (byte) -1);
        org.mockito.asm.ByteVector byteVector12 = byteVector8.putByte((int) '4');
        org.mockito.asm.ByteVector byteVector14 = byteVector12.putUTF8("");
        org.mockito.asm.ByteVector byteVector16 = byteVector12.putUTF8("hi!");
        org.junit.Assert.assertNotNull(byteVector2);
        org.junit.Assert.assertNotNull(byteVector4);
        org.junit.Assert.assertNotNull(byteVector6);
        org.junit.Assert.assertNotNull(byteVector8);
        org.junit.Assert.assertNotNull(byteVector10);
        org.junit.Assert.assertNotNull(byteVector12);
        org.junit.Assert.assertNotNull(byteVector14);
        org.junit.Assert.assertNotNull(byteVector16);
    }

    @Test
    public void test0353() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0353");
        org.mockito.asm.ByteVector byteVector0 = new org.mockito.asm.ByteVector();
        org.mockito.asm.ByteVector byteVector2 = byteVector0.putUTF8("hi!");
        org.mockito.asm.ByteVector byteVector4 = byteVector0.putInt(0);
        org.mockito.asm.ByteVector byteVector6 = byteVector0.putShort((int) '4');
        org.mockito.asm.ByteVector byteVector8 = byteVector6.putShort((int) (byte) -1);
        java.lang.Class<?> wildcardClass9 = byteVector6.getClass();
        org.junit.Assert.assertNotNull(byteVector2);
        org.junit.Assert.assertNotNull(byteVector4);
        org.junit.Assert.assertNotNull(byteVector6);
        org.junit.Assert.assertNotNull(byteVector8);
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test0354() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0354");
        org.mockito.asm.ByteVector byteVector1 = new org.mockito.asm.ByteVector((int) '#');
        org.mockito.asm.ByteVector byteVector3 = byteVector1.putInt(100);
        org.mockito.asm.ByteVector byteVector5 = byteVector1.putInt((int) (byte) 1);
        org.mockito.asm.ByteVector byteVector7 = byteVector1.putInt((-1));
        org.mockito.asm.ByteVector byteVector9 = byteVector1.putByte((int) '#');
        java.lang.Class<?> wildcardClass10 = byteVector9.getClass();
        org.junit.Assert.assertNotNull(byteVector3);
        org.junit.Assert.assertNotNull(byteVector5);
        org.junit.Assert.assertNotNull(byteVector7);
        org.junit.Assert.assertNotNull(byteVector9);
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test0355() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0355");
        org.mockito.asm.ByteVector byteVector0 = new org.mockito.asm.ByteVector();
        org.mockito.asm.ByteVector byteVector2 = byteVector0.putUTF8("hi!");
        org.mockito.asm.ByteVector byteVector4 = byteVector0.putLong((long) ' ');
        org.mockito.asm.ByteVector byteVector6 = byteVector4.putByte((int) 'a');
        org.mockito.asm.ByteVector byteVector8 = byteVector6.putInt((int) (short) 1);
        org.mockito.asm.ByteVector byteVector10 = byteVector6.putByte((int) (byte) -1);
        org.mockito.asm.ByteVector byteVector12 = byteVector6.putInt((int) (byte) -1);
        java.lang.Class<?> wildcardClass13 = byteVector6.getClass();
        org.junit.Assert.assertNotNull(byteVector2);
        org.junit.Assert.assertNotNull(byteVector4);
        org.junit.Assert.assertNotNull(byteVector6);
        org.junit.Assert.assertNotNull(byteVector8);
        org.junit.Assert.assertNotNull(byteVector10);
        org.junit.Assert.assertNotNull(byteVector12);
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test0356() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0356");
        org.mockito.asm.ByteVector byteVector0 = new org.mockito.asm.ByteVector();
        org.mockito.asm.ByteVector byteVector2 = byteVector0.putUTF8("hi!");
        org.mockito.asm.ByteVector byteVector4 = byteVector0.putLong((long) ' ');
        org.mockito.asm.ByteVector byteVector6 = byteVector4.putByte((int) 'a');
        org.mockito.asm.ByteVector byteVector8 = byteVector4.putByte((int) (short) -1);
        org.mockito.asm.ByteVector byteVector10 = byteVector4.putLong(0L);
        org.mockito.asm.ByteVector byteVector12 = byteVector10.putByte(0);
        org.mockito.asm.ByteVector byteVector14 = byteVector12.putByte(100);
        org.mockito.asm.ByteVector byteVector16 = byteVector12.putInt((-1));
        org.mockito.asm.ByteVector byteVector18 = byteVector12.putByte((int) (byte) 100);
        org.mockito.asm.ByteVector byteVector20 = byteVector18.putUTF8("hi!");
        org.mockito.asm.ByteVector byteVector22 = byteVector20.putUTF8("");
        org.mockito.asm.ByteVector byteVector23 = new org.mockito.asm.ByteVector();
        org.mockito.asm.ByteVector byteVector25 = byteVector23.putUTF8("hi!");
        org.mockito.asm.ByteVector byteVector27 = byteVector23.putLong((long) ' ');
        org.mockito.asm.ByteVector byteVector29 = byteVector27.putByte((int) 'a');
        org.mockito.asm.ByteVector byteVector31 = byteVector27.putByte((int) (short) -1);
        org.mockito.asm.ByteVector byteVector33 = byteVector27.putLong(0L);
        org.mockito.asm.ByteVector byteVector35 = byteVector33.putInt((int) (short) -1);
        org.mockito.asm.ByteVector byteVector37 = byteVector35.putByte(100);
        org.mockito.asm.ByteVector byteVector39 = byteVector37.putUTF8("hi!");
        org.mockito.asm.ByteVector byteVector41 = byteVector37.putLong((long) (short) 0);
        org.mockito.asm.ByteVector byteVector42 = new org.mockito.asm.ByteVector();
        org.mockito.asm.ByteVector byteVector44 = byteVector42.putUTF8("hi!");
        org.mockito.asm.ByteVector byteVector46 = byteVector42.putLong((long) ' ');
        org.mockito.asm.ByteVector byteVector48 = byteVector46.putByte((int) 'a');
        org.mockito.asm.ByteVector byteVector50 = byteVector46.putByte((int) (short) -1);
        org.mockito.asm.ByteVector byteVector52 = byteVector46.putLong(0L);
        org.mockito.asm.ByteVector byteVector54 = byteVector46.putUTF8("hi!");
        org.mockito.asm.ByteVector byteVector56 = byteVector54.putUTF8("");
        org.mockito.asm.ByteVector byteVector58 = byteVector54.putInt((int) (byte) 10);
        org.mockito.asm.ByteVector byteVector60 = byteVector54.putByte(0);
        org.mockito.asm.ByteVector byteVector61 = new org.mockito.asm.ByteVector();
        org.mockito.asm.ByteVector byteVector63 = byteVector61.putUTF8("hi!");
        org.mockito.asm.ByteVector byteVector65 = byteVector61.putInt(0);
        org.mockito.asm.ByteVector byteVector67 = byteVector65.putInt((int) ' ');
        org.mockito.asm.ByteVector byteVector69 = byteVector67.putLong(100L);
        byte[] byteArray73 = new byte[] { (byte) 0, (byte) 10, (byte) 1 };
        org.mockito.asm.ByteVector byteVector76 = byteVector67.putByteArray(byteArray73, 0, 0);
        org.mockito.asm.ByteVector byteVector79 = byteVector60.putByteArray(byteArray73, (int) (short) 1, 0);
        org.mockito.asm.ByteVector byteVector82 = byteVector41.putByteArray(byteArray73, (int) (byte) 0, (int) (byte) 1);
        // The following exception was thrown during execution in test generation
        try {
            org.mockito.asm.ByteVector byteVector85 = byteVector20.putByteArray(byteArray73, (int) (short) 1, (int) (byte) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteVector2);
        org.junit.Assert.assertNotNull(byteVector4);
        org.junit.Assert.assertNotNull(byteVector6);
        org.junit.Assert.assertNotNull(byteVector8);
        org.junit.Assert.assertNotNull(byteVector10);
        org.junit.Assert.assertNotNull(byteVector12);
        org.junit.Assert.assertNotNull(byteVector14);
        org.junit.Assert.assertNotNull(byteVector16);
        org.junit.Assert.assertNotNull(byteVector18);
        org.junit.Assert.assertNotNull(byteVector20);
        org.junit.Assert.assertNotNull(byteVector22);
        org.junit.Assert.assertNotNull(byteVector25);
        org.junit.Assert.assertNotNull(byteVector27);
        org.junit.Assert.assertNotNull(byteVector29);
        org.junit.Assert.assertNotNull(byteVector31);
        org.junit.Assert.assertNotNull(byteVector33);
        org.junit.Assert.assertNotNull(byteVector35);
        org.junit.Assert.assertNotNull(byteVector37);
        org.junit.Assert.assertNotNull(byteVector39);
        org.junit.Assert.assertNotNull(byteVector41);
        org.junit.Assert.assertNotNull(byteVector44);
        org.junit.Assert.assertNotNull(byteVector46);
        org.junit.Assert.assertNotNull(byteVector48);
        org.junit.Assert.assertNotNull(byteVector50);
        org.junit.Assert.assertNotNull(byteVector52);
        org.junit.Assert.assertNotNull(byteVector54);
        org.junit.Assert.assertNotNull(byteVector56);
        org.junit.Assert.assertNotNull(byteVector58);
        org.junit.Assert.assertNotNull(byteVector60);
        org.junit.Assert.assertNotNull(byteVector63);
        org.junit.Assert.assertNotNull(byteVector65);
        org.junit.Assert.assertNotNull(byteVector67);
        org.junit.Assert.assertNotNull(byteVector69);
        org.junit.Assert.assertNotNull(byteArray73);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray73), "[0, 10, 1]");
        org.junit.Assert.assertNotNull(byteVector76);
        org.junit.Assert.assertNotNull(byteVector79);
        org.junit.Assert.assertNotNull(byteVector82);
    }

    @Test
    public void test0357() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0357");
        org.mockito.asm.ByteVector byteVector0 = new org.mockito.asm.ByteVector();
        org.mockito.asm.ByteVector byteVector2 = byteVector0.putUTF8("hi!");
        org.mockito.asm.ByteVector byteVector4 = byteVector2.putInt(0);
        org.mockito.asm.ByteVector byteVector6 = byteVector2.putByte((int) (byte) 10);
        org.mockito.asm.ByteVector byteVector8 = byteVector6.putUTF8("hi!");
        org.mockito.asm.ByteVector byteVector10 = byteVector8.putShort(0);
        org.mockito.asm.ByteVector byteVector12 = byteVector10.putLong(10L);
        org.mockito.asm.ByteVector byteVector14 = byteVector10.putUTF8("hi!");
        org.mockito.asm.ByteVector byteVector15 = new org.mockito.asm.ByteVector();
        org.mockito.asm.ByteVector byteVector17 = byteVector15.putUTF8("hi!");
        org.mockito.asm.ByteVector byteVector19 = byteVector17.putLong((long) (byte) 10);
        org.mockito.asm.ByteVector byteVector21 = byteVector19.putUTF8("hi!");
        org.mockito.asm.ByteVector byteVector23 = byteVector19.putLong((-1L));
        org.mockito.asm.ByteVector byteVector25 = new org.mockito.asm.ByteVector((int) (short) 0);
        org.mockito.asm.ByteVector byteVector26 = new org.mockito.asm.ByteVector();
        org.mockito.asm.ByteVector byteVector28 = byteVector26.putUTF8("hi!");
        org.mockito.asm.ByteVector byteVector30 = byteVector26.putInt(0);
        org.mockito.asm.ByteVector byteVector32 = byteVector30.putInt((int) ' ');
        org.mockito.asm.ByteVector byteVector34 = byteVector32.putLong(100L);
        byte[] byteArray38 = new byte[] { (byte) 0, (byte) 10, (byte) 1 };
        org.mockito.asm.ByteVector byteVector41 = byteVector32.putByteArray(byteArray38, 0, 0);
        org.mockito.asm.ByteVector byteVector44 = byteVector25.putByteArray(byteArray38, 1, (int) (short) 0);
        org.mockito.asm.ByteVector byteVector47 = byteVector23.putByteArray(byteArray38, 0, (int) (byte) 1);
        // The following exception was thrown during execution in test generation
        try {
            org.mockito.asm.ByteVector byteVector50 = byteVector10.putByteArray(byteArray38, (int) (byte) -1, 10);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteVector2);
        org.junit.Assert.assertNotNull(byteVector4);
        org.junit.Assert.assertNotNull(byteVector6);
        org.junit.Assert.assertNotNull(byteVector8);
        org.junit.Assert.assertNotNull(byteVector10);
        org.junit.Assert.assertNotNull(byteVector12);
        org.junit.Assert.assertNotNull(byteVector14);
        org.junit.Assert.assertNotNull(byteVector17);
        org.junit.Assert.assertNotNull(byteVector19);
        org.junit.Assert.assertNotNull(byteVector21);
        org.junit.Assert.assertNotNull(byteVector23);
        org.junit.Assert.assertNotNull(byteVector28);
        org.junit.Assert.assertNotNull(byteVector30);
        org.junit.Assert.assertNotNull(byteVector32);
        org.junit.Assert.assertNotNull(byteVector34);
        org.junit.Assert.assertNotNull(byteArray38);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray38), "[0, 10, 1]");
        org.junit.Assert.assertNotNull(byteVector41);
        org.junit.Assert.assertNotNull(byteVector44);
        org.junit.Assert.assertNotNull(byteVector47);
    }

    @Test
    public void test0358() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0358");
        org.mockito.asm.ByteVector byteVector0 = new org.mockito.asm.ByteVector();
        org.mockito.asm.ByteVector byteVector2 = byteVector0.putUTF8("hi!");
        org.mockito.asm.ByteVector byteVector4 = byteVector2.putInt((int) (byte) 10);
        org.mockito.asm.ByteVector byteVector6 = byteVector4.putUTF8("");
        org.mockito.asm.ByteVector byteVector8 = byteVector6.putUTF8("hi!");
        org.mockito.asm.ByteVector byteVector10 = byteVector6.putShort(0);
        org.mockito.asm.ByteVector byteVector12 = byteVector6.putInt((-1));
        org.mockito.asm.ByteVector byteVector14 = byteVector12.putLong((long) (byte) -1);
        org.mockito.asm.ByteVector byteVector16 = byteVector12.putByte((int) (short) -1);
        org.mockito.asm.ByteVector byteVector18 = byteVector12.putInt(0);
        org.mockito.asm.ByteVector byteVector20 = byteVector18.putUTF8("");
        org.mockito.asm.ByteVector byteVector22 = byteVector20.putInt((int) (byte) 0);
        org.junit.Assert.assertNotNull(byteVector2);
        org.junit.Assert.assertNotNull(byteVector4);
        org.junit.Assert.assertNotNull(byteVector6);
        org.junit.Assert.assertNotNull(byteVector8);
        org.junit.Assert.assertNotNull(byteVector10);
        org.junit.Assert.assertNotNull(byteVector12);
        org.junit.Assert.assertNotNull(byteVector14);
        org.junit.Assert.assertNotNull(byteVector16);
        org.junit.Assert.assertNotNull(byteVector18);
        org.junit.Assert.assertNotNull(byteVector20);
        org.junit.Assert.assertNotNull(byteVector22);
    }

    @Test
    public void test0359() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0359");
        org.mockito.asm.ByteVector byteVector0 = new org.mockito.asm.ByteVector();
        org.mockito.asm.ByteVector byteVector2 = byteVector0.putUTF8("hi!");
        org.mockito.asm.ByteVector byteVector4 = byteVector0.putLong((long) ' ');
        org.mockito.asm.ByteVector byteVector6 = byteVector4.putByte((int) 'a');
        org.mockito.asm.ByteVector byteVector8 = byteVector6.putByte((int) (short) -1);
        org.mockito.asm.ByteVector byteVector10 = byteVector8.putLong((long) (byte) -1);
        org.mockito.asm.ByteVector byteVector12 = byteVector8.putByte((int) '4');
        org.mockito.asm.ByteVector byteVector14 = byteVector12.putLong((long) (short) 10);
        org.mockito.asm.ByteVector byteVector16 = byteVector14.putInt((int) (byte) 1);
        org.mockito.asm.ByteVector byteVector18 = byteVector14.putByte(1);
        org.mockito.asm.ByteVector byteVector20 = byteVector14.putUTF8("");
        org.junit.Assert.assertNotNull(byteVector2);
        org.junit.Assert.assertNotNull(byteVector4);
        org.junit.Assert.assertNotNull(byteVector6);
        org.junit.Assert.assertNotNull(byteVector8);
        org.junit.Assert.assertNotNull(byteVector10);
        org.junit.Assert.assertNotNull(byteVector12);
        org.junit.Assert.assertNotNull(byteVector14);
        org.junit.Assert.assertNotNull(byteVector16);
        org.junit.Assert.assertNotNull(byteVector18);
        org.junit.Assert.assertNotNull(byteVector20);
    }

    @Test
    public void test0360() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0360");
        org.mockito.asm.ByteVector byteVector1 = new org.mockito.asm.ByteVector((int) '#');
        org.mockito.asm.ByteVector byteVector3 = byteVector1.putLong(100L);
        org.mockito.asm.ByteVector byteVector5 = byteVector1.putUTF8("");
        org.mockito.asm.ByteVector byteVector7 = byteVector1.putUTF8("hi!");
        org.mockito.asm.ByteVector byteVector9 = byteVector7.putLong((long) (short) 0);
        org.mockito.asm.ByteVector byteVector10 = new org.mockito.asm.ByteVector();
        org.mockito.asm.ByteVector byteVector12 = byteVector10.putUTF8("hi!");
        org.mockito.asm.ByteVector byteVector14 = byteVector12.putInt(0);
        org.mockito.asm.ByteVector byteVector16 = byteVector14.putByte((int) (short) 0);
        org.mockito.asm.ByteVector byteVector18 = byteVector14.putUTF8("");
        org.mockito.asm.ByteVector byteVector19 = new org.mockito.asm.ByteVector();
        org.mockito.asm.ByteVector byteVector21 = byteVector19.putUTF8("hi!");
        org.mockito.asm.ByteVector byteVector23 = byteVector19.putInt(0);
        org.mockito.asm.ByteVector byteVector25 = byteVector19.putShort((int) '4');
        org.mockito.asm.ByteVector byteVector27 = byteVector19.putByte(100);
        org.mockito.asm.ByteVector byteVector29 = byteVector27.putInt((int) (byte) 10);
        org.mockito.asm.ByteVector byteVector31 = byteVector27.putInt((int) (byte) 10);
        org.mockito.asm.ByteVector byteVector33 = byteVector31.putByte(100);
        org.mockito.asm.ByteVector byteVector34 = new org.mockito.asm.ByteVector();
        org.mockito.asm.ByteVector byteVector36 = byteVector34.putUTF8("hi!");
        org.mockito.asm.ByteVector byteVector38 = byteVector34.putInt(0);
        org.mockito.asm.ByteVector byteVector40 = byteVector38.putInt((int) ' ');
        org.mockito.asm.ByteVector byteVector42 = byteVector40.putLong(100L);
        byte[] byteArray46 = new byte[] { (byte) 0, (byte) 10, (byte) 1 };
        org.mockito.asm.ByteVector byteVector49 = byteVector40.putByteArray(byteArray46, 0, 0);
        org.mockito.asm.ByteVector byteVector52 = byteVector33.putByteArray(byteArray46, (int) (byte) 1, (int) (byte) 0);
        org.mockito.asm.ByteVector byteVector55 = byteVector14.putByteArray(byteArray46, (int) (short) 0, 0);
        // The following exception was thrown during execution in test generation
        try {
            org.mockito.asm.ByteVector byteVector58 = byteVector9.putByteArray(byteArray46, (int) 'a', 10);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteVector3);
        org.junit.Assert.assertNotNull(byteVector5);
        org.junit.Assert.assertNotNull(byteVector7);
        org.junit.Assert.assertNotNull(byteVector9);
        org.junit.Assert.assertNotNull(byteVector12);
        org.junit.Assert.assertNotNull(byteVector14);
        org.junit.Assert.assertNotNull(byteVector16);
        org.junit.Assert.assertNotNull(byteVector18);
        org.junit.Assert.assertNotNull(byteVector21);
        org.junit.Assert.assertNotNull(byteVector23);
        org.junit.Assert.assertNotNull(byteVector25);
        org.junit.Assert.assertNotNull(byteVector27);
        org.junit.Assert.assertNotNull(byteVector29);
        org.junit.Assert.assertNotNull(byteVector31);
        org.junit.Assert.assertNotNull(byteVector33);
        org.junit.Assert.assertNotNull(byteVector36);
        org.junit.Assert.assertNotNull(byteVector38);
        org.junit.Assert.assertNotNull(byteVector40);
        org.junit.Assert.assertNotNull(byteVector42);
        org.junit.Assert.assertNotNull(byteArray46);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray46), "[0, 10, 1]");
        org.junit.Assert.assertNotNull(byteVector49);
        org.junit.Assert.assertNotNull(byteVector52);
        org.junit.Assert.assertNotNull(byteVector55);
    }

    @Test
    public void test0361() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0361");
        org.mockito.asm.ByteVector byteVector0 = new org.mockito.asm.ByteVector();
        org.mockito.asm.ByteVector byteVector2 = byteVector0.putUTF8("hi!");
        org.mockito.asm.ByteVector byteVector4 = byteVector2.putInt(0);
        org.mockito.asm.ByteVector byteVector6 = byteVector4.putByte((int) (byte) 1);
        org.mockito.asm.ByteVector byteVector8 = byteVector6.putShort((int) '4');
        org.mockito.asm.ByteVector byteVector10 = byteVector6.putShort(10);
        org.mockito.asm.ByteVector byteVector12 = byteVector10.putInt((int) (short) 1);
        org.mockito.asm.ByteVector byteVector14 = byteVector12.putUTF8("hi!");
        org.junit.Assert.assertNotNull(byteVector2);
        org.junit.Assert.assertNotNull(byteVector4);
        org.junit.Assert.assertNotNull(byteVector6);
        org.junit.Assert.assertNotNull(byteVector8);
        org.junit.Assert.assertNotNull(byteVector10);
        org.junit.Assert.assertNotNull(byteVector12);
        org.junit.Assert.assertNotNull(byteVector14);
    }

    @Test
    public void test0362() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0362");
        org.mockito.asm.ByteVector byteVector0 = new org.mockito.asm.ByteVector();
        org.mockito.asm.ByteVector byteVector2 = byteVector0.putUTF8("hi!");
        org.mockito.asm.ByteVector byteVector4 = byteVector0.putInt(0);
        org.mockito.asm.ByteVector byteVector6 = byteVector0.putShort(10);
        org.mockito.asm.ByteVector byteVector8 = byteVector0.putUTF8("");
        org.mockito.asm.ByteVector byteVector10 = byteVector8.putUTF8("hi!");
        java.lang.Class<?> wildcardClass11 = byteVector10.getClass();
        org.junit.Assert.assertNotNull(byteVector2);
        org.junit.Assert.assertNotNull(byteVector4);
        org.junit.Assert.assertNotNull(byteVector6);
        org.junit.Assert.assertNotNull(byteVector8);
        org.junit.Assert.assertNotNull(byteVector10);
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test0363() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0363");
        org.mockito.asm.ByteVector byteVector0 = new org.mockito.asm.ByteVector();
        org.mockito.asm.ByteVector byteVector2 = byteVector0.putUTF8("hi!");
        org.mockito.asm.ByteVector byteVector4 = byteVector0.putShort((int) (short) -1);
        org.mockito.asm.ByteVector byteVector6 = byteVector0.putLong(0L);
        org.mockito.asm.ByteVector byteVector8 = byteVector0.putLong((long) (-1));
        org.mockito.asm.ByteVector byteVector10 = byteVector8.putLong((long) 100);
        org.junit.Assert.assertNotNull(byteVector2);
        org.junit.Assert.assertNotNull(byteVector4);
        org.junit.Assert.assertNotNull(byteVector6);
        org.junit.Assert.assertNotNull(byteVector8);
        org.junit.Assert.assertNotNull(byteVector10);
    }

    @Test
    public void test0364() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0364");
        org.mockito.asm.ByteVector byteVector0 = new org.mockito.asm.ByteVector();
        org.mockito.asm.ByteVector byteVector2 = byteVector0.putUTF8("hi!");
        org.mockito.asm.ByteVector byteVector4 = byteVector2.putInt((int) (byte) 10);
        org.mockito.asm.ByteVector byteVector6 = byteVector4.putUTF8("");
        org.mockito.asm.ByteVector byteVector8 = byteVector6.putUTF8("hi!");
        org.mockito.asm.ByteVector byteVector10 = byteVector6.putInt((int) '#');
        org.mockito.asm.ByteVector byteVector11 = new org.mockito.asm.ByteVector();
        org.mockito.asm.ByteVector byteVector13 = byteVector11.putUTF8("hi!");
        org.mockito.asm.ByteVector byteVector15 = byteVector13.putLong((long) (byte) 10);
        org.mockito.asm.ByteVector byteVector17 = byteVector15.putUTF8("hi!");
        org.mockito.asm.ByteVector byteVector19 = byteVector15.putLong((-1L));
        org.mockito.asm.ByteVector byteVector21 = new org.mockito.asm.ByteVector((int) (short) 0);
        org.mockito.asm.ByteVector byteVector22 = new org.mockito.asm.ByteVector();
        org.mockito.asm.ByteVector byteVector24 = byteVector22.putUTF8("hi!");
        org.mockito.asm.ByteVector byteVector26 = byteVector22.putInt(0);
        org.mockito.asm.ByteVector byteVector28 = byteVector26.putInt((int) ' ');
        org.mockito.asm.ByteVector byteVector30 = byteVector28.putLong(100L);
        byte[] byteArray34 = new byte[] { (byte) 0, (byte) 10, (byte) 1 };
        org.mockito.asm.ByteVector byteVector37 = byteVector28.putByteArray(byteArray34, 0, 0);
        org.mockito.asm.ByteVector byteVector40 = byteVector21.putByteArray(byteArray34, 1, (int) (short) 0);
        org.mockito.asm.ByteVector byteVector43 = byteVector19.putByteArray(byteArray34, 0, (int) (byte) 1);
        // The following exception was thrown during execution in test generation
        try {
            org.mockito.asm.ByteVector byteVector46 = byteVector6.putByteArray(byteArray34, (int) (byte) -1, (-1));
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteVector2);
        org.junit.Assert.assertNotNull(byteVector4);
        org.junit.Assert.assertNotNull(byteVector6);
        org.junit.Assert.assertNotNull(byteVector8);
        org.junit.Assert.assertNotNull(byteVector10);
        org.junit.Assert.assertNotNull(byteVector13);
        org.junit.Assert.assertNotNull(byteVector15);
        org.junit.Assert.assertNotNull(byteVector17);
        org.junit.Assert.assertNotNull(byteVector19);
        org.junit.Assert.assertNotNull(byteVector24);
        org.junit.Assert.assertNotNull(byteVector26);
        org.junit.Assert.assertNotNull(byteVector28);
        org.junit.Assert.assertNotNull(byteVector30);
        org.junit.Assert.assertNotNull(byteArray34);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray34), "[0, 10, 1]");
        org.junit.Assert.assertNotNull(byteVector37);
        org.junit.Assert.assertNotNull(byteVector40);
        org.junit.Assert.assertNotNull(byteVector43);
    }

    @Test
    public void test0365() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0365");
        org.mockito.asm.ByteVector byteVector1 = new org.mockito.asm.ByteVector((int) (byte) 10);
        org.mockito.asm.ByteVector byteVector3 = byteVector1.putByte((int) '4');
        org.mockito.asm.ByteVector byteVector5 = byteVector1.putLong(0L);
        org.mockito.asm.ByteVector byteVector7 = byteVector5.putUTF8("");
        org.mockito.asm.ByteVector byteVector9 = new org.mockito.asm.ByteVector((int) (short) 0);
        org.mockito.asm.ByteVector byteVector10 = new org.mockito.asm.ByteVector();
        org.mockito.asm.ByteVector byteVector12 = byteVector10.putUTF8("hi!");
        org.mockito.asm.ByteVector byteVector14 = byteVector10.putInt(0);
        org.mockito.asm.ByteVector byteVector16 = byteVector14.putInt((int) ' ');
        org.mockito.asm.ByteVector byteVector18 = byteVector16.putLong(100L);
        byte[] byteArray22 = new byte[] { (byte) 0, (byte) 10, (byte) 1 };
        org.mockito.asm.ByteVector byteVector25 = byteVector16.putByteArray(byteArray22, 0, 0);
        org.mockito.asm.ByteVector byteVector28 = byteVector9.putByteArray(byteArray22, 1, (int) (short) 0);
        // The following exception was thrown during execution in test generation
        try {
            org.mockito.asm.ByteVector byteVector31 = byteVector5.putByteArray(byteArray22, 100, (int) (short) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteVector3);
        org.junit.Assert.assertNotNull(byteVector5);
        org.junit.Assert.assertNotNull(byteVector7);
        org.junit.Assert.assertNotNull(byteVector12);
        org.junit.Assert.assertNotNull(byteVector14);
        org.junit.Assert.assertNotNull(byteVector16);
        org.junit.Assert.assertNotNull(byteVector18);
        org.junit.Assert.assertNotNull(byteArray22);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray22), "[0, 10, 1]");
        org.junit.Assert.assertNotNull(byteVector25);
        org.junit.Assert.assertNotNull(byteVector28);
    }

    @Test
    public void test0366() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0366");
        org.mockito.asm.ByteVector byteVector1 = new org.mockito.asm.ByteVector((int) '#');
        org.mockito.asm.ByteVector byteVector3 = byteVector1.putLong(100L);
        org.mockito.asm.ByteVector byteVector5 = byteVector3.putLong(1L);
        org.mockito.asm.ByteVector byteVector7 = byteVector5.putUTF8("hi!");
        org.mockito.asm.ByteVector byteVector9 = byteVector7.putUTF8("");
        java.lang.Class<?> wildcardClass10 = byteVector9.getClass();
        org.junit.Assert.assertNotNull(byteVector3);
        org.junit.Assert.assertNotNull(byteVector5);
        org.junit.Assert.assertNotNull(byteVector7);
        org.junit.Assert.assertNotNull(byteVector9);
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test0367() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0367");
        org.mockito.asm.ByteVector byteVector0 = new org.mockito.asm.ByteVector();
        org.mockito.asm.ByteVector byteVector2 = byteVector0.putUTF8("hi!");
        org.mockito.asm.ByteVector byteVector4 = byteVector0.putLong((long) ' ');
        org.mockito.asm.ByteVector byteVector6 = byteVector4.putByte((int) 'a');
        org.mockito.asm.ByteVector byteVector8 = byteVector6.putInt((int) (short) 0);
        org.mockito.asm.ByteVector byteVector10 = byteVector8.putByte((int) (short) 0);
        org.mockito.asm.ByteVector byteVector12 = byteVector10.putUTF8("");
        org.mockito.asm.ByteVector byteVector14 = byteVector12.putUTF8("hi!");
        org.mockito.asm.ByteVector byteVector16 = byteVector14.putLong(10L);
        org.mockito.asm.ByteVector byteVector18 = byteVector16.putLong((long) (byte) 1);
        org.mockito.asm.ByteVector byteVector19 = new org.mockito.asm.ByteVector();
        org.mockito.asm.ByteVector byteVector21 = byteVector19.putUTF8("hi!");
        org.mockito.asm.ByteVector byteVector23 = byteVector21.putLong((long) (byte) 10);
        org.mockito.asm.ByteVector byteVector25 = byteVector23.putUTF8("hi!");
        org.mockito.asm.ByteVector byteVector27 = byteVector23.putLong((-1L));
        org.mockito.asm.ByteVector byteVector29 = new org.mockito.asm.ByteVector((int) (short) 0);
        org.mockito.asm.ByteVector byteVector30 = new org.mockito.asm.ByteVector();
        org.mockito.asm.ByteVector byteVector32 = byteVector30.putUTF8("hi!");
        org.mockito.asm.ByteVector byteVector34 = byteVector30.putInt(0);
        org.mockito.asm.ByteVector byteVector36 = byteVector34.putInt((int) ' ');
        org.mockito.asm.ByteVector byteVector38 = byteVector36.putLong(100L);
        byte[] byteArray42 = new byte[] { (byte) 0, (byte) 10, (byte) 1 };
        org.mockito.asm.ByteVector byteVector45 = byteVector36.putByteArray(byteArray42, 0, 0);
        org.mockito.asm.ByteVector byteVector48 = byteVector29.putByteArray(byteArray42, 1, (int) (short) 0);
        org.mockito.asm.ByteVector byteVector51 = byteVector27.putByteArray(byteArray42, 0, (int) (byte) 1);
        // The following exception was thrown during execution in test generation
        try {
            org.mockito.asm.ByteVector byteVector54 = byteVector16.putByteArray(byteArray42, (int) (short) 100, 0);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteVector2);
        org.junit.Assert.assertNotNull(byteVector4);
        org.junit.Assert.assertNotNull(byteVector6);
        org.junit.Assert.assertNotNull(byteVector8);
        org.junit.Assert.assertNotNull(byteVector10);
        org.junit.Assert.assertNotNull(byteVector12);
        org.junit.Assert.assertNotNull(byteVector14);
        org.junit.Assert.assertNotNull(byteVector16);
        org.junit.Assert.assertNotNull(byteVector18);
        org.junit.Assert.assertNotNull(byteVector21);
        org.junit.Assert.assertNotNull(byteVector23);
        org.junit.Assert.assertNotNull(byteVector25);
        org.junit.Assert.assertNotNull(byteVector27);
        org.junit.Assert.assertNotNull(byteVector32);
        org.junit.Assert.assertNotNull(byteVector34);
        org.junit.Assert.assertNotNull(byteVector36);
        org.junit.Assert.assertNotNull(byteVector38);
        org.junit.Assert.assertNotNull(byteArray42);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray42), "[0, 10, 1]");
        org.junit.Assert.assertNotNull(byteVector45);
        org.junit.Assert.assertNotNull(byteVector48);
        org.junit.Assert.assertNotNull(byteVector51);
    }

    @Test
    public void test0368() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0368");
        org.mockito.asm.ByteVector byteVector0 = new org.mockito.asm.ByteVector();
        org.mockito.asm.ByteVector byteVector2 = byteVector0.putUTF8("hi!");
        org.mockito.asm.ByteVector byteVector4 = byteVector0.putLong((long) ' ');
        org.mockito.asm.ByteVector byteVector6 = byteVector4.putByte((int) 'a');
        org.mockito.asm.ByteVector byteVector8 = byteVector6.putInt((int) (short) 1);
        org.mockito.asm.ByteVector byteVector10 = byteVector6.putByte((int) (byte) -1);
        org.mockito.asm.ByteVector byteVector12 = byteVector6.putInt((int) (byte) -1);
        java.lang.Class<?> wildcardClass13 = byteVector12.getClass();
        org.junit.Assert.assertNotNull(byteVector2);
        org.junit.Assert.assertNotNull(byteVector4);
        org.junit.Assert.assertNotNull(byteVector6);
        org.junit.Assert.assertNotNull(byteVector8);
        org.junit.Assert.assertNotNull(byteVector10);
        org.junit.Assert.assertNotNull(byteVector12);
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test0369() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0369");
        org.mockito.asm.ByteVector byteVector0 = new org.mockito.asm.ByteVector();
        org.mockito.asm.ByteVector byteVector2 = byteVector0.putUTF8("hi!");
        org.mockito.asm.ByteVector byteVector4 = byteVector0.putShort((int) (short) 100);
        org.mockito.asm.ByteVector byteVector6 = byteVector4.putLong((long) (byte) -1);
        org.mockito.asm.ByteVector byteVector8 = byteVector6.putByte((int) 'a');
        org.mockito.asm.ByteVector byteVector9 = new org.mockito.asm.ByteVector();
        org.mockito.asm.ByteVector byteVector11 = byteVector9.putUTF8("hi!");
        org.mockito.asm.ByteVector byteVector13 = byteVector11.putInt(0);
        org.mockito.asm.ByteVector byteVector15 = byteVector11.putByte((int) (byte) 10);
        org.mockito.asm.ByteVector byteVector17 = byteVector15.putLong((-1L));
        org.mockito.asm.ByteVector byteVector19 = byteVector15.putInt((int) (byte) 100);
        org.mockito.asm.ByteVector byteVector20 = new org.mockito.asm.ByteVector();
        org.mockito.asm.ByteVector byteVector22 = byteVector20.putUTF8("hi!");
        org.mockito.asm.ByteVector byteVector24 = byteVector20.putInt(0);
        org.mockito.asm.ByteVector byteVector26 = byteVector24.putInt((int) ' ');
        org.mockito.asm.ByteVector byteVector28 = byteVector26.putLong(100L);
        byte[] byteArray32 = new byte[] { (byte) 0, (byte) 10, (byte) 1 };
        org.mockito.asm.ByteVector byteVector35 = byteVector26.putByteArray(byteArray32, 0, 0);
        org.mockito.asm.ByteVector byteVector38 = byteVector15.putByteArray(byteArray32, (int) (byte) 1, 0);
        // The following exception was thrown during execution in test generation
        try {
            org.mockito.asm.ByteVector byteVector41 = byteVector6.putByteArray(byteArray32, (int) (byte) 0, 100);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteVector2);
        org.junit.Assert.assertNotNull(byteVector4);
        org.junit.Assert.assertNotNull(byteVector6);
        org.junit.Assert.assertNotNull(byteVector8);
        org.junit.Assert.assertNotNull(byteVector11);
        org.junit.Assert.assertNotNull(byteVector13);
        org.junit.Assert.assertNotNull(byteVector15);
        org.junit.Assert.assertNotNull(byteVector17);
        org.junit.Assert.assertNotNull(byteVector19);
        org.junit.Assert.assertNotNull(byteVector22);
        org.junit.Assert.assertNotNull(byteVector24);
        org.junit.Assert.assertNotNull(byteVector26);
        org.junit.Assert.assertNotNull(byteVector28);
        org.junit.Assert.assertNotNull(byteArray32);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray32), "[0, 10, 1]");
        org.junit.Assert.assertNotNull(byteVector35);
        org.junit.Assert.assertNotNull(byteVector38);
    }

    @Test
    public void test0370() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0370");
        org.mockito.asm.ByteVector byteVector0 = new org.mockito.asm.ByteVector();
        org.mockito.asm.ByteVector byteVector2 = byteVector0.putUTF8("hi!");
        org.mockito.asm.ByteVector byteVector4 = byteVector2.putInt(0);
        org.mockito.asm.ByteVector byteVector6 = byteVector4.putByte((int) (byte) 1);
        org.mockito.asm.ByteVector byteVector8 = byteVector6.putShort((int) '4');
        org.mockito.asm.ByteVector byteVector10 = byteVector6.putShort(10);
        org.mockito.asm.ByteVector byteVector12 = byteVector10.putInt((int) (short) 1);
        org.mockito.asm.ByteVector byteVector13 = new org.mockito.asm.ByteVector();
        org.mockito.asm.ByteVector byteVector15 = byteVector13.putUTF8("hi!");
        org.mockito.asm.ByteVector byteVector17 = byteVector15.putByte(100);
        org.mockito.asm.ByteVector byteVector19 = byteVector15.putShort((int) 'a');
        org.mockito.asm.ByteVector byteVector21 = byteVector19.putShort((int) (short) 0);
        org.mockito.asm.ByteVector byteVector22 = new org.mockito.asm.ByteVector();
        org.mockito.asm.ByteVector byteVector24 = byteVector22.putUTF8("hi!");
        org.mockito.asm.ByteVector byteVector26 = byteVector24.putInt(0);
        org.mockito.asm.ByteVector byteVector28 = byteVector24.putByte((int) (byte) 10);
        org.mockito.asm.ByteVector byteVector30 = byteVector28.putLong((-1L));
        org.mockito.asm.ByteVector byteVector32 = byteVector28.putInt((int) (byte) 100);
        org.mockito.asm.ByteVector byteVector33 = new org.mockito.asm.ByteVector();
        org.mockito.asm.ByteVector byteVector35 = byteVector33.putUTF8("hi!");
        org.mockito.asm.ByteVector byteVector37 = byteVector33.putInt(0);
        org.mockito.asm.ByteVector byteVector39 = byteVector37.putInt((int) ' ');
        org.mockito.asm.ByteVector byteVector41 = byteVector39.putLong(100L);
        byte[] byteArray45 = new byte[] { (byte) 0, (byte) 10, (byte) 1 };
        org.mockito.asm.ByteVector byteVector48 = byteVector39.putByteArray(byteArray45, 0, 0);
        org.mockito.asm.ByteVector byteVector51 = byteVector28.putByteArray(byteArray45, (int) (byte) 1, 0);
        org.mockito.asm.ByteVector byteVector54 = byteVector19.putByteArray(byteArray45, (int) (byte) 1, (int) (short) 1);
        // The following exception was thrown during execution in test generation
        try {
            org.mockito.asm.ByteVector byteVector57 = byteVector10.putByteArray(byteArray45, (int) (byte) 100, (int) (byte) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteVector2);
        org.junit.Assert.assertNotNull(byteVector4);
        org.junit.Assert.assertNotNull(byteVector6);
        org.junit.Assert.assertNotNull(byteVector8);
        org.junit.Assert.assertNotNull(byteVector10);
        org.junit.Assert.assertNotNull(byteVector12);
        org.junit.Assert.assertNotNull(byteVector15);
        org.junit.Assert.assertNotNull(byteVector17);
        org.junit.Assert.assertNotNull(byteVector19);
        org.junit.Assert.assertNotNull(byteVector21);
        org.junit.Assert.assertNotNull(byteVector24);
        org.junit.Assert.assertNotNull(byteVector26);
        org.junit.Assert.assertNotNull(byteVector28);
        org.junit.Assert.assertNotNull(byteVector30);
        org.junit.Assert.assertNotNull(byteVector32);
        org.junit.Assert.assertNotNull(byteVector35);
        org.junit.Assert.assertNotNull(byteVector37);
        org.junit.Assert.assertNotNull(byteVector39);
        org.junit.Assert.assertNotNull(byteVector41);
        org.junit.Assert.assertNotNull(byteArray45);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray45), "[0, 10, 1]");
        org.junit.Assert.assertNotNull(byteVector48);
        org.junit.Assert.assertNotNull(byteVector51);
        org.junit.Assert.assertNotNull(byteVector54);
    }

    @Test
    public void test0371() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0371");
        org.mockito.asm.ByteVector byteVector0 = new org.mockito.asm.ByteVector();
        org.mockito.asm.ByteVector byteVector2 = byteVector0.putUTF8("hi!");
        org.mockito.asm.ByteVector byteVector4 = byteVector0.putShort((int) (short) -1);
        org.mockito.asm.ByteVector byteVector6 = byteVector0.putInt((int) (byte) 10);
        org.mockito.asm.ByteVector byteVector8 = byteVector6.putUTF8("hi!");
        org.mockito.asm.ByteVector byteVector10 = byteVector8.putInt((int) (short) 10);
        org.mockito.asm.ByteVector byteVector12 = byteVector8.putShort((-1));
        java.lang.Class<?> wildcardClass13 = byteVector12.getClass();
        org.junit.Assert.assertNotNull(byteVector2);
        org.junit.Assert.assertNotNull(byteVector4);
        org.junit.Assert.assertNotNull(byteVector6);
        org.junit.Assert.assertNotNull(byteVector8);
        org.junit.Assert.assertNotNull(byteVector10);
        org.junit.Assert.assertNotNull(byteVector12);
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test0372() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0372");
        org.mockito.asm.ByteVector byteVector0 = new org.mockito.asm.ByteVector();
        org.mockito.asm.ByteVector byteVector2 = byteVector0.putUTF8("hi!");
        org.mockito.asm.ByteVector byteVector4 = byteVector0.putShort((int) (short) -1);
        org.mockito.asm.ByteVector byteVector6 = byteVector0.putLong(0L);
        org.mockito.asm.ByteVector byteVector8 = byteVector0.putShort((int) (byte) -1);
        org.mockito.asm.ByteVector byteVector10 = byteVector0.putShort((int) (short) -1);
        org.mockito.asm.ByteVector byteVector12 = byteVector10.putUTF8("");
        org.junit.Assert.assertNotNull(byteVector2);
        org.junit.Assert.assertNotNull(byteVector4);
        org.junit.Assert.assertNotNull(byteVector6);
        org.junit.Assert.assertNotNull(byteVector8);
        org.junit.Assert.assertNotNull(byteVector10);
        org.junit.Assert.assertNotNull(byteVector12);
    }

    @Test
    public void test0373() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0373");
        org.mockito.asm.ByteVector byteVector1 = new org.mockito.asm.ByteVector((int) '#');
        org.mockito.asm.ByteVector byteVector3 = byteVector1.putInt(100);
        org.mockito.asm.ByteVector byteVector5 = byteVector1.putInt(0);
        org.mockito.asm.ByteVector byteVector7 = byteVector5.putShort((int) (short) 0);
        org.mockito.asm.ByteVector byteVector9 = byteVector7.putLong((long) (short) 100);
        org.mockito.asm.ByteVector byteVector11 = byteVector9.putLong((-1L));
        org.mockito.asm.ByteVector byteVector12 = new org.mockito.asm.ByteVector();
        org.mockito.asm.ByteVector byteVector14 = byteVector12.putUTF8("hi!");
        org.mockito.asm.ByteVector byteVector16 = byteVector12.putShort((int) (short) -1);
        org.mockito.asm.ByteVector byteVector18 = byteVector12.putInt((int) (byte) 10);
        org.mockito.asm.ByteVector byteVector20 = byteVector18.putUTF8("hi!");
        org.mockito.asm.ByteVector byteVector22 = byteVector20.putByte((int) (byte) 1);
        org.mockito.asm.ByteVector byteVector24 = byteVector22.putUTF8("hi!");
        org.mockito.asm.ByteVector byteVector26 = byteVector24.putByte((int) (byte) 10);
        byte[] byteArray29 = new byte[] { (byte) 10, (byte) 0 };
        org.mockito.asm.ByteVector byteVector32 = byteVector26.putByteArray(byteArray29, 0, (int) (short) 0);
        // The following exception was thrown during execution in test generation
        try {
            org.mockito.asm.ByteVector byteVector35 = byteVector11.putByteArray(byteArray29, 1, (int) 'a');
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteVector3);
        org.junit.Assert.assertNotNull(byteVector5);
        org.junit.Assert.assertNotNull(byteVector7);
        org.junit.Assert.assertNotNull(byteVector9);
        org.junit.Assert.assertNotNull(byteVector11);
        org.junit.Assert.assertNotNull(byteVector14);
        org.junit.Assert.assertNotNull(byteVector16);
        org.junit.Assert.assertNotNull(byteVector18);
        org.junit.Assert.assertNotNull(byteVector20);
        org.junit.Assert.assertNotNull(byteVector22);
        org.junit.Assert.assertNotNull(byteVector24);
        org.junit.Assert.assertNotNull(byteVector26);
        org.junit.Assert.assertNotNull(byteArray29);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray29), "[10, 0]");
        org.junit.Assert.assertNotNull(byteVector32);
    }

    @Test
    public void test0374() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0374");
        org.mockito.asm.ByteVector byteVector0 = new org.mockito.asm.ByteVector();
        org.mockito.asm.ByteVector byteVector2 = byteVector0.putUTF8("hi!");
        org.mockito.asm.ByteVector byteVector4 = byteVector0.putLong((long) ' ');
        org.mockito.asm.ByteVector byteVector6 = byteVector4.putByte((int) 'a');
        org.mockito.asm.ByteVector byteVector8 = byteVector6.putByte((int) (short) -1);
        byte[] byteArray9 = null;
        org.mockito.asm.ByteVector byteVector12 = byteVector6.putByteArray(byteArray9, (int) '#', 0);
        org.mockito.asm.ByteVector byteVector14 = byteVector6.putByte((int) (byte) 1);
        org.mockito.asm.ByteVector byteVector16 = byteVector14.putByte((int) (byte) 1);
        org.mockito.asm.ByteVector byteVector18 = byteVector14.putUTF8("");
        org.junit.Assert.assertNotNull(byteVector2);
        org.junit.Assert.assertNotNull(byteVector4);
        org.junit.Assert.assertNotNull(byteVector6);
        org.junit.Assert.assertNotNull(byteVector8);
        org.junit.Assert.assertNotNull(byteVector12);
        org.junit.Assert.assertNotNull(byteVector14);
        org.junit.Assert.assertNotNull(byteVector16);
        org.junit.Assert.assertNotNull(byteVector18);
    }

    @Test
    public void test0375() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0375");
        org.mockito.asm.ByteVector byteVector0 = new org.mockito.asm.ByteVector();
        org.mockito.asm.ByteVector byteVector2 = byteVector0.putUTF8("hi!");
        org.mockito.asm.ByteVector byteVector4 = byteVector2.putInt(0);
        org.mockito.asm.ByteVector byteVector6 = byteVector2.putShort((int) (byte) 10);
        org.mockito.asm.ByteVector byteVector8 = byteVector2.putUTF8("");
        org.mockito.asm.ByteVector byteVector10 = byteVector2.putUTF8("hi!");
        org.mockito.asm.ByteVector byteVector12 = byteVector10.putByte(100);
        org.mockito.asm.ByteVector byteVector13 = new org.mockito.asm.ByteVector();
        org.mockito.asm.ByteVector byteVector15 = byteVector13.putUTF8("hi!");
        org.mockito.asm.ByteVector byteVector17 = byteVector15.putInt(0);
        org.mockito.asm.ByteVector byteVector19 = byteVector17.putByte((int) (short) 0);
        org.mockito.asm.ByteVector byteVector21 = byteVector17.putUTF8("");
        org.mockito.asm.ByteVector byteVector22 = new org.mockito.asm.ByteVector();
        org.mockito.asm.ByteVector byteVector24 = byteVector22.putUTF8("hi!");
        org.mockito.asm.ByteVector byteVector26 = byteVector22.putInt(0);
        org.mockito.asm.ByteVector byteVector28 = byteVector22.putShort((int) '4');
        org.mockito.asm.ByteVector byteVector30 = byteVector22.putByte(100);
        org.mockito.asm.ByteVector byteVector32 = byteVector30.putInt((int) (byte) 10);
        org.mockito.asm.ByteVector byteVector34 = byteVector30.putInt((int) (byte) 10);
        org.mockito.asm.ByteVector byteVector36 = byteVector34.putByte(100);
        org.mockito.asm.ByteVector byteVector37 = new org.mockito.asm.ByteVector();
        org.mockito.asm.ByteVector byteVector39 = byteVector37.putUTF8("hi!");
        org.mockito.asm.ByteVector byteVector41 = byteVector37.putInt(0);
        org.mockito.asm.ByteVector byteVector43 = byteVector41.putInt((int) ' ');
        org.mockito.asm.ByteVector byteVector45 = byteVector43.putLong(100L);
        byte[] byteArray49 = new byte[] { (byte) 0, (byte) 10, (byte) 1 };
        org.mockito.asm.ByteVector byteVector52 = byteVector43.putByteArray(byteArray49, 0, 0);
        org.mockito.asm.ByteVector byteVector55 = byteVector36.putByteArray(byteArray49, (int) (byte) 1, (int) (byte) 0);
        org.mockito.asm.ByteVector byteVector58 = byteVector17.putByteArray(byteArray49, (int) (short) 0, 0);
        // The following exception was thrown during execution in test generation
        try {
            org.mockito.asm.ByteVector byteVector61 = byteVector12.putByteArray(byteArray49, (int) 'a', (int) (short) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteVector2);
        org.junit.Assert.assertNotNull(byteVector4);
        org.junit.Assert.assertNotNull(byteVector6);
        org.junit.Assert.assertNotNull(byteVector8);
        org.junit.Assert.assertNotNull(byteVector10);
        org.junit.Assert.assertNotNull(byteVector12);
        org.junit.Assert.assertNotNull(byteVector15);
        org.junit.Assert.assertNotNull(byteVector17);
        org.junit.Assert.assertNotNull(byteVector19);
        org.junit.Assert.assertNotNull(byteVector21);
        org.junit.Assert.assertNotNull(byteVector24);
        org.junit.Assert.assertNotNull(byteVector26);
        org.junit.Assert.assertNotNull(byteVector28);
        org.junit.Assert.assertNotNull(byteVector30);
        org.junit.Assert.assertNotNull(byteVector32);
        org.junit.Assert.assertNotNull(byteVector34);
        org.junit.Assert.assertNotNull(byteVector36);
        org.junit.Assert.assertNotNull(byteVector39);
        org.junit.Assert.assertNotNull(byteVector41);
        org.junit.Assert.assertNotNull(byteVector43);
        org.junit.Assert.assertNotNull(byteVector45);
        org.junit.Assert.assertNotNull(byteArray49);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray49), "[0, 10, 1]");
        org.junit.Assert.assertNotNull(byteVector52);
        org.junit.Assert.assertNotNull(byteVector55);
        org.junit.Assert.assertNotNull(byteVector58);
    }

    @Test
    public void test0376() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0376");
        org.mockito.asm.ByteVector byteVector1 = new org.mockito.asm.ByteVector((int) (byte) 100);
        org.mockito.asm.ByteVector byteVector3 = byteVector1.putInt(0);
        org.mockito.asm.ByteVector byteVector5 = byteVector3.putLong((long) (byte) 1);
        org.mockito.asm.ByteVector byteVector7 = byteVector5.putLong((long) (short) 0);
        org.junit.Assert.assertNotNull(byteVector3);
        org.junit.Assert.assertNotNull(byteVector5);
        org.junit.Assert.assertNotNull(byteVector7);
    }

    @Test
    public void test0377() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0377");
        org.mockito.asm.ByteVector byteVector0 = new org.mockito.asm.ByteVector();
        org.mockito.asm.ByteVector byteVector2 = byteVector0.putUTF8("hi!");
        org.mockito.asm.ByteVector byteVector4 = byteVector2.putInt(0);
        org.mockito.asm.ByteVector byteVector6 = byteVector4.putByte((int) (byte) 1);
        org.mockito.asm.ByteVector byteVector8 = byteVector6.putShort((int) '4');
        org.mockito.asm.ByteVector byteVector10 = byteVector8.putUTF8("hi!");
        java.lang.Class<?> wildcardClass11 = byteVector8.getClass();
        org.junit.Assert.assertNotNull(byteVector2);
        org.junit.Assert.assertNotNull(byteVector4);
        org.junit.Assert.assertNotNull(byteVector6);
        org.junit.Assert.assertNotNull(byteVector8);
        org.junit.Assert.assertNotNull(byteVector10);
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test0378() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0378");
        org.mockito.asm.ByteVector byteVector0 = new org.mockito.asm.ByteVector();
        org.mockito.asm.ByteVector byteVector2 = byteVector0.putUTF8("hi!");
        org.mockito.asm.ByteVector byteVector4 = byteVector0.putInt(0);
        org.mockito.asm.ByteVector byteVector6 = byteVector4.putInt((int) ' ');
        org.mockito.asm.ByteVector byteVector8 = byteVector6.putLong((long) (short) 10);
        org.mockito.asm.ByteVector byteVector10 = byteVector6.putInt((int) '4');
        org.mockito.asm.ByteVector byteVector12 = byteVector6.putInt((int) (short) 10);
        org.mockito.asm.ByteVector byteVector14 = byteVector6.putInt((int) ' ');
        org.junit.Assert.assertNotNull(byteVector2);
        org.junit.Assert.assertNotNull(byteVector4);
        org.junit.Assert.assertNotNull(byteVector6);
        org.junit.Assert.assertNotNull(byteVector8);
        org.junit.Assert.assertNotNull(byteVector10);
        org.junit.Assert.assertNotNull(byteVector12);
        org.junit.Assert.assertNotNull(byteVector14);
    }

    @Test
    public void test0379() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0379");
        org.mockito.asm.ByteVector byteVector1 = new org.mockito.asm.ByteVector((int) (byte) 1);
        org.mockito.asm.ByteVector byteVector3 = byteVector1.putByte((int) (byte) 10);
        org.mockito.asm.ByteVector byteVector5 = byteVector1.putLong(1L);
        org.mockito.asm.ByteVector byteVector7 = byteVector1.putByte((int) '#');
        org.mockito.asm.ByteVector byteVector9 = byteVector7.putByte((int) (byte) 10);
        org.mockito.asm.ByteVector byteVector11 = byteVector9.putLong((long) (short) 100);
        org.mockito.asm.ByteVector byteVector12 = new org.mockito.asm.ByteVector();
        org.mockito.asm.ByteVector byteVector14 = byteVector12.putUTF8("hi!");
        org.mockito.asm.ByteVector byteVector16 = byteVector14.putLong((long) (byte) 10);
        org.mockito.asm.ByteVector byteVector18 = byteVector16.putUTF8("hi!");
        org.mockito.asm.ByteVector byteVector20 = byteVector16.putLong((-1L));
        org.mockito.asm.ByteVector byteVector22 = byteVector20.putInt(10);
        org.mockito.asm.ByteVector byteVector24 = byteVector22.putShort((int) '#');
        org.mockito.asm.ByteVector byteVector26 = new org.mockito.asm.ByteVector((int) (short) 0);
        org.mockito.asm.ByteVector byteVector27 = new org.mockito.asm.ByteVector();
        org.mockito.asm.ByteVector byteVector29 = byteVector27.putUTF8("hi!");
        org.mockito.asm.ByteVector byteVector31 = byteVector27.putInt(0);
        org.mockito.asm.ByteVector byteVector33 = byteVector31.putInt((int) ' ');
        org.mockito.asm.ByteVector byteVector35 = byteVector33.putLong(100L);
        byte[] byteArray39 = new byte[] { (byte) 0, (byte) 10, (byte) 1 };
        org.mockito.asm.ByteVector byteVector42 = byteVector33.putByteArray(byteArray39, 0, 0);
        org.mockito.asm.ByteVector byteVector45 = byteVector26.putByteArray(byteArray39, 1, (int) (short) 0);
        org.mockito.asm.ByteVector byteVector48 = byteVector22.putByteArray(byteArray39, (int) (short) 0, 0);
        // The following exception was thrown during execution in test generation
        try {
            org.mockito.asm.ByteVector byteVector51 = byteVector9.putByteArray(byteArray39, 1, (int) (byte) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteVector3);
        org.junit.Assert.assertNotNull(byteVector5);
        org.junit.Assert.assertNotNull(byteVector7);
        org.junit.Assert.assertNotNull(byteVector9);
        org.junit.Assert.assertNotNull(byteVector11);
        org.junit.Assert.assertNotNull(byteVector14);
        org.junit.Assert.assertNotNull(byteVector16);
        org.junit.Assert.assertNotNull(byteVector18);
        org.junit.Assert.assertNotNull(byteVector20);
        org.junit.Assert.assertNotNull(byteVector22);
        org.junit.Assert.assertNotNull(byteVector24);
        org.junit.Assert.assertNotNull(byteVector29);
        org.junit.Assert.assertNotNull(byteVector31);
        org.junit.Assert.assertNotNull(byteVector33);
        org.junit.Assert.assertNotNull(byteVector35);
        org.junit.Assert.assertNotNull(byteArray39);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray39), "[0, 10, 1]");
        org.junit.Assert.assertNotNull(byteVector42);
        org.junit.Assert.assertNotNull(byteVector45);
        org.junit.Assert.assertNotNull(byteVector48);
    }

    @Test
    public void test0380() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0380");
        org.mockito.asm.ByteVector byteVector1 = new org.mockito.asm.ByteVector((int) (byte) 10);
        org.mockito.asm.ByteVector byteVector3 = byteVector1.putByte((int) '4');
        org.mockito.asm.ByteVector byteVector5 = byteVector1.putLong(0L);
        org.mockito.asm.ByteVector byteVector7 = byteVector1.putByte((int) (byte) 100);
        org.mockito.asm.ByteVector byteVector9 = byteVector1.putLong((long) ' ');
        org.mockito.asm.ByteVector byteVector11 = byteVector9.putUTF8("");
        org.junit.Assert.assertNotNull(byteVector3);
        org.junit.Assert.assertNotNull(byteVector5);
        org.junit.Assert.assertNotNull(byteVector7);
        org.junit.Assert.assertNotNull(byteVector9);
        org.junit.Assert.assertNotNull(byteVector11);
    }

    @Test
    public void test0381() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0381");
        org.mockito.asm.ByteVector byteVector0 = new org.mockito.asm.ByteVector();
        org.mockito.asm.ByteVector byteVector2 = byteVector0.putUTF8("hi!");
        org.mockito.asm.ByteVector byteVector4 = byteVector2.putInt((int) (byte) 10);
        org.mockito.asm.ByteVector byteVector6 = byteVector2.putLong((long) 0);
        org.mockito.asm.ByteVector byteVector8 = byteVector2.putUTF8("hi!");
        org.mockito.asm.ByteVector byteVector9 = new org.mockito.asm.ByteVector();
        org.mockito.asm.ByteVector byteVector11 = byteVector9.putUTF8("hi!");
        org.mockito.asm.ByteVector byteVector13 = byteVector11.putLong((long) (byte) 10);
        org.mockito.asm.ByteVector byteVector15 = byteVector13.putUTF8("hi!");
        org.mockito.asm.ByteVector byteVector17 = byteVector13.putLong((-1L));
        org.mockito.asm.ByteVector byteVector19 = new org.mockito.asm.ByteVector((int) (short) 0);
        org.mockito.asm.ByteVector byteVector20 = new org.mockito.asm.ByteVector();
        org.mockito.asm.ByteVector byteVector22 = byteVector20.putUTF8("hi!");
        org.mockito.asm.ByteVector byteVector24 = byteVector20.putInt(0);
        org.mockito.asm.ByteVector byteVector26 = byteVector24.putInt((int) ' ');
        org.mockito.asm.ByteVector byteVector28 = byteVector26.putLong(100L);
        byte[] byteArray32 = new byte[] { (byte) 0, (byte) 10, (byte) 1 };
        org.mockito.asm.ByteVector byteVector35 = byteVector26.putByteArray(byteArray32, 0, 0);
        org.mockito.asm.ByteVector byteVector38 = byteVector19.putByteArray(byteArray32, 1, (int) (short) 0);
        org.mockito.asm.ByteVector byteVector41 = byteVector17.putByteArray(byteArray32, 0, (int) (byte) 1);
        // The following exception was thrown during execution in test generation
        try {
            org.mockito.asm.ByteVector byteVector44 = byteVector8.putByteArray(byteArray32, 100, 1);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteVector2);
        org.junit.Assert.assertNotNull(byteVector4);
        org.junit.Assert.assertNotNull(byteVector6);
        org.junit.Assert.assertNotNull(byteVector8);
        org.junit.Assert.assertNotNull(byteVector11);
        org.junit.Assert.assertNotNull(byteVector13);
        org.junit.Assert.assertNotNull(byteVector15);
        org.junit.Assert.assertNotNull(byteVector17);
        org.junit.Assert.assertNotNull(byteVector22);
        org.junit.Assert.assertNotNull(byteVector24);
        org.junit.Assert.assertNotNull(byteVector26);
        org.junit.Assert.assertNotNull(byteVector28);
        org.junit.Assert.assertNotNull(byteArray32);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray32), "[0, 10, 1]");
        org.junit.Assert.assertNotNull(byteVector35);
        org.junit.Assert.assertNotNull(byteVector38);
        org.junit.Assert.assertNotNull(byteVector41);
    }

    @Test
    public void test0382() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0382");
        org.mockito.asm.ByteVector byteVector0 = new org.mockito.asm.ByteVector();
        org.mockito.asm.ByteVector byteVector2 = byteVector0.putUTF8("hi!");
        org.mockito.asm.ByteVector byteVector4 = byteVector0.putShort((int) (short) -1);
        org.mockito.asm.ByteVector byteVector6 = byteVector0.putInt((int) (byte) 10);
        org.mockito.asm.ByteVector byteVector8 = byteVector0.putByte((int) (short) 0);
        java.lang.Class<?> wildcardClass9 = byteVector8.getClass();
        org.junit.Assert.assertNotNull(byteVector2);
        org.junit.Assert.assertNotNull(byteVector4);
        org.junit.Assert.assertNotNull(byteVector6);
        org.junit.Assert.assertNotNull(byteVector8);
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test0383() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0383");
        org.mockito.asm.ByteVector byteVector0 = new org.mockito.asm.ByteVector();
        org.mockito.asm.ByteVector byteVector2 = byteVector0.putUTF8("hi!");
        org.mockito.asm.ByteVector byteVector4 = byteVector0.putShort((int) (short) -1);
        org.mockito.asm.ByteVector byteVector6 = byteVector0.putInt((int) (byte) 10);
        org.mockito.asm.ByteVector byteVector8 = byteVector0.putUTF8("");
        org.mockito.asm.ByteVector byteVector10 = byteVector8.putUTF8("");
        org.mockito.asm.ByteVector byteVector12 = byteVector10.putShort(10);
        org.junit.Assert.assertNotNull(byteVector2);
        org.junit.Assert.assertNotNull(byteVector4);
        org.junit.Assert.assertNotNull(byteVector6);
        org.junit.Assert.assertNotNull(byteVector8);
        org.junit.Assert.assertNotNull(byteVector10);
        org.junit.Assert.assertNotNull(byteVector12);
    }

    @Test
    public void test0384() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0384");
        org.mockito.asm.ByteVector byteVector1 = new org.mockito.asm.ByteVector((int) (byte) 10);
        org.mockito.asm.ByteVector byteVector3 = byteVector1.putByte((int) '4');
        org.mockito.asm.ByteVector byteVector5 = byteVector1.putLong((long) 'a');
        org.mockito.asm.ByteVector byteVector7 = byteVector1.putUTF8("");
        java.lang.Class<?> wildcardClass8 = byteVector7.getClass();
        org.junit.Assert.assertNotNull(byteVector3);
        org.junit.Assert.assertNotNull(byteVector5);
        org.junit.Assert.assertNotNull(byteVector7);
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test0385() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0385");
        org.mockito.asm.ByteVector byteVector0 = new org.mockito.asm.ByteVector();
        org.mockito.asm.ByteVector byteVector2 = byteVector0.putUTF8("hi!");
        org.mockito.asm.ByteVector byteVector4 = byteVector0.putLong((long) ' ');
        org.mockito.asm.ByteVector byteVector6 = byteVector4.putByte((int) 'a');
        org.mockito.asm.ByteVector byteVector8 = byteVector4.putByte((int) (short) -1);
        org.mockito.asm.ByteVector byteVector10 = byteVector4.putLong(0L);
        org.mockito.asm.ByteVector byteVector12 = byteVector4.putUTF8("hi!");
        org.mockito.asm.ByteVector byteVector14 = byteVector12.putUTF8("");
        org.mockito.asm.ByteVector byteVector15 = new org.mockito.asm.ByteVector();
        org.mockito.asm.ByteVector byteVector17 = byteVector15.putUTF8("hi!");
        org.mockito.asm.ByteVector byteVector19 = byteVector15.putInt(0);
        org.mockito.asm.ByteVector byteVector21 = byteVector15.putShort((int) '4');
        org.mockito.asm.ByteVector byteVector23 = byteVector15.putByte(100);
        org.mockito.asm.ByteVector byteVector25 = byteVector23.putInt((int) (byte) 10);
        org.mockito.asm.ByteVector byteVector27 = byteVector23.putInt((int) (byte) 10);
        org.mockito.asm.ByteVector byteVector29 = byteVector27.putByte(100);
        org.mockito.asm.ByteVector byteVector30 = new org.mockito.asm.ByteVector();
        org.mockito.asm.ByteVector byteVector32 = byteVector30.putUTF8("hi!");
        org.mockito.asm.ByteVector byteVector34 = byteVector30.putInt(0);
        org.mockito.asm.ByteVector byteVector36 = byteVector34.putInt((int) ' ');
        org.mockito.asm.ByteVector byteVector38 = byteVector36.putLong(100L);
        byte[] byteArray42 = new byte[] { (byte) 0, (byte) 10, (byte) 1 };
        org.mockito.asm.ByteVector byteVector45 = byteVector36.putByteArray(byteArray42, 0, 0);
        org.mockito.asm.ByteVector byteVector48 = byteVector29.putByteArray(byteArray42, (int) (byte) 1, (int) (byte) 0);
        // The following exception was thrown during execution in test generation
        try {
            org.mockito.asm.ByteVector byteVector51 = byteVector14.putByteArray(byteArray42, (int) '4', 100);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteVector2);
        org.junit.Assert.assertNotNull(byteVector4);
        org.junit.Assert.assertNotNull(byteVector6);
        org.junit.Assert.assertNotNull(byteVector8);
        org.junit.Assert.assertNotNull(byteVector10);
        org.junit.Assert.assertNotNull(byteVector12);
        org.junit.Assert.assertNotNull(byteVector14);
        org.junit.Assert.assertNotNull(byteVector17);
        org.junit.Assert.assertNotNull(byteVector19);
        org.junit.Assert.assertNotNull(byteVector21);
        org.junit.Assert.assertNotNull(byteVector23);
        org.junit.Assert.assertNotNull(byteVector25);
        org.junit.Assert.assertNotNull(byteVector27);
        org.junit.Assert.assertNotNull(byteVector29);
        org.junit.Assert.assertNotNull(byteVector32);
        org.junit.Assert.assertNotNull(byteVector34);
        org.junit.Assert.assertNotNull(byteVector36);
        org.junit.Assert.assertNotNull(byteVector38);
        org.junit.Assert.assertNotNull(byteArray42);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray42), "[0, 10, 1]");
        org.junit.Assert.assertNotNull(byteVector45);
        org.junit.Assert.assertNotNull(byteVector48);
    }

    @Test
    public void test0386() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0386");
        org.mockito.asm.ByteVector byteVector0 = new org.mockito.asm.ByteVector();
        org.mockito.asm.ByteVector byteVector2 = byteVector0.putUTF8("hi!");
        org.mockito.asm.ByteVector byteVector4 = byteVector2.putByte(100);
        org.mockito.asm.ByteVector byteVector6 = byteVector2.putShort((int) 'a');
        org.mockito.asm.ByteVector byteVector8 = byteVector6.putShort((int) (short) 0);
        org.mockito.asm.ByteVector byteVector9 = new org.mockito.asm.ByteVector();
        org.mockito.asm.ByteVector byteVector11 = byteVector9.putUTF8("hi!");
        org.mockito.asm.ByteVector byteVector13 = byteVector11.putInt(0);
        org.mockito.asm.ByteVector byteVector15 = byteVector11.putByte((int) (byte) 10);
        org.mockito.asm.ByteVector byteVector17 = byteVector15.putLong((-1L));
        org.mockito.asm.ByteVector byteVector19 = byteVector15.putInt((int) (byte) 100);
        org.mockito.asm.ByteVector byteVector20 = new org.mockito.asm.ByteVector();
        org.mockito.asm.ByteVector byteVector22 = byteVector20.putUTF8("hi!");
        org.mockito.asm.ByteVector byteVector24 = byteVector20.putInt(0);
        org.mockito.asm.ByteVector byteVector26 = byteVector24.putInt((int) ' ');
        org.mockito.asm.ByteVector byteVector28 = byteVector26.putLong(100L);
        byte[] byteArray32 = new byte[] { (byte) 0, (byte) 10, (byte) 1 };
        org.mockito.asm.ByteVector byteVector35 = byteVector26.putByteArray(byteArray32, 0, 0);
        org.mockito.asm.ByteVector byteVector38 = byteVector15.putByteArray(byteArray32, (int) (byte) 1, 0);
        org.mockito.asm.ByteVector byteVector41 = byteVector6.putByteArray(byteArray32, (int) (byte) 1, (int) (short) 1);
        org.mockito.asm.ByteVector byteVector43 = byteVector6.putLong((long) ' ');
        org.mockito.asm.ByteVector byteVector45 = byteVector6.putShort(100);
        java.lang.Class<?> wildcardClass46 = byteVector6.getClass();
        org.junit.Assert.assertNotNull(byteVector2);
        org.junit.Assert.assertNotNull(byteVector4);
        org.junit.Assert.assertNotNull(byteVector6);
        org.junit.Assert.assertNotNull(byteVector8);
        org.junit.Assert.assertNotNull(byteVector11);
        org.junit.Assert.assertNotNull(byteVector13);
        org.junit.Assert.assertNotNull(byteVector15);
        org.junit.Assert.assertNotNull(byteVector17);
        org.junit.Assert.assertNotNull(byteVector19);
        org.junit.Assert.assertNotNull(byteVector22);
        org.junit.Assert.assertNotNull(byteVector24);
        org.junit.Assert.assertNotNull(byteVector26);
        org.junit.Assert.assertNotNull(byteVector28);
        org.junit.Assert.assertNotNull(byteArray32);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray32), "[0, 10, 1]");
        org.junit.Assert.assertNotNull(byteVector35);
        org.junit.Assert.assertNotNull(byteVector38);
        org.junit.Assert.assertNotNull(byteVector41);
        org.junit.Assert.assertNotNull(byteVector43);
        org.junit.Assert.assertNotNull(byteVector45);
        org.junit.Assert.assertNotNull(wildcardClass46);
    }

    @Test
    public void test0387() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0387");
        org.mockito.asm.ByteVector byteVector1 = new org.mockito.asm.ByteVector((int) (byte) 1);
        org.mockito.asm.ByteVector byteVector3 = byteVector1.putByte((int) (byte) 10);
        org.mockito.asm.ByteVector byteVector5 = byteVector1.putLong(1L);
        java.lang.Class<?> wildcardClass6 = byteVector1.getClass();
        org.junit.Assert.assertNotNull(byteVector3);
        org.junit.Assert.assertNotNull(byteVector5);
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void test0388() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0388");
        org.mockito.asm.ByteVector byteVector0 = new org.mockito.asm.ByteVector();
        org.mockito.asm.ByteVector byteVector2 = byteVector0.putUTF8("hi!");
        org.mockito.asm.ByteVector byteVector4 = byteVector0.putShort((int) (short) -1);
        org.mockito.asm.ByteVector byteVector6 = byteVector0.putInt((int) (byte) 10);
        org.mockito.asm.ByteVector byteVector8 = byteVector6.putUTF8("hi!");
        org.mockito.asm.ByteVector byteVector10 = byteVector8.putByte((int) (byte) 1);
        org.mockito.asm.ByteVector byteVector11 = new org.mockito.asm.ByteVector();
        org.mockito.asm.ByteVector byteVector13 = byteVector11.putUTF8("hi!");
        org.mockito.asm.ByteVector byteVector15 = byteVector11.putLong((long) ' ');
        org.mockito.asm.ByteVector byteVector17 = byteVector15.putByte((int) 'a');
        org.mockito.asm.ByteVector byteVector19 = byteVector15.putByte((int) (short) -1);
        org.mockito.asm.ByteVector byteVector21 = byteVector15.putLong(0L);
        org.mockito.asm.ByteVector byteVector23 = byteVector21.putByte(0);
        org.mockito.asm.ByteVector byteVector25 = byteVector23.putLong(1L);
        org.mockito.asm.ByteVector byteVector27 = byteVector25.putShort((int) 'a');
        org.mockito.asm.ByteVector byteVector29 = byteVector25.putLong((long) 10);
        org.mockito.asm.ByteVector byteVector31 = byteVector25.putUTF8("");
        org.mockito.asm.ByteVector byteVector32 = new org.mockito.asm.ByteVector();
        org.mockito.asm.ByteVector byteVector34 = byteVector32.putUTF8("hi!");
        org.mockito.asm.ByteVector byteVector36 = byteVector34.putLong((long) (byte) 10);
        org.mockito.asm.ByteVector byteVector38 = byteVector36.putUTF8("hi!");
        org.mockito.asm.ByteVector byteVector40 = byteVector36.putLong((long) (short) -1);
        org.mockito.asm.ByteVector byteVector42 = byteVector40.putInt(10);
        org.mockito.asm.ByteVector byteVector44 = byteVector40.putByte((int) (short) 1);
        org.mockito.asm.ByteVector byteVector46 = byteVector40.putInt((int) (short) -1);
        org.mockito.asm.ByteVector byteVector48 = byteVector40.putUTF8("hi!");
        org.mockito.asm.ByteVector byteVector49 = new org.mockito.asm.ByteVector();
        org.mockito.asm.ByteVector byteVector51 = byteVector49.putUTF8("hi!");
        org.mockito.asm.ByteVector byteVector53 = byteVector49.putLong((long) ' ');
        org.mockito.asm.ByteVector byteVector55 = byteVector53.putByte((int) 'a');
        org.mockito.asm.ByteVector byteVector57 = byteVector53.putByte((int) (short) -1);
        org.mockito.asm.ByteVector byteVector59 = byteVector53.putLong(0L);
        org.mockito.asm.ByteVector byteVector61 = byteVector53.putUTF8("hi!");
        org.mockito.asm.ByteVector byteVector63 = byteVector61.putUTF8("");
        org.mockito.asm.ByteVector byteVector65 = byteVector63.putLong((long) (byte) 10);
        org.mockito.asm.ByteVector byteVector67 = byteVector63.putLong((long) (short) 100);
        byte[] byteArray72 = new byte[] { (byte) 1, (byte) 0, (byte) 0, (byte) -1 };
        org.mockito.asm.ByteVector byteVector75 = byteVector63.putByteArray(byteArray72, 0, 0);
        org.mockito.asm.ByteVector byteVector78 = byteVector48.putByteArray(byteArray72, (int) (byte) 0, (int) (short) 1);
        org.mockito.asm.ByteVector byteVector81 = byteVector25.putByteArray(byteArray72, (int) (short) 0, (int) (short) 0);
        // The following exception was thrown during execution in test generation
        try {
            org.mockito.asm.ByteVector byteVector84 = byteVector10.putByteArray(byteArray72, 10, (int) (byte) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteVector2);
        org.junit.Assert.assertNotNull(byteVector4);
        org.junit.Assert.assertNotNull(byteVector6);
        org.junit.Assert.assertNotNull(byteVector8);
        org.junit.Assert.assertNotNull(byteVector10);
        org.junit.Assert.assertNotNull(byteVector13);
        org.junit.Assert.assertNotNull(byteVector15);
        org.junit.Assert.assertNotNull(byteVector17);
        org.junit.Assert.assertNotNull(byteVector19);
        org.junit.Assert.assertNotNull(byteVector21);
        org.junit.Assert.assertNotNull(byteVector23);
        org.junit.Assert.assertNotNull(byteVector25);
        org.junit.Assert.assertNotNull(byteVector27);
        org.junit.Assert.assertNotNull(byteVector29);
        org.junit.Assert.assertNotNull(byteVector31);
        org.junit.Assert.assertNotNull(byteVector34);
        org.junit.Assert.assertNotNull(byteVector36);
        org.junit.Assert.assertNotNull(byteVector38);
        org.junit.Assert.assertNotNull(byteVector40);
        org.junit.Assert.assertNotNull(byteVector42);
        org.junit.Assert.assertNotNull(byteVector44);
        org.junit.Assert.assertNotNull(byteVector46);
        org.junit.Assert.assertNotNull(byteVector48);
        org.junit.Assert.assertNotNull(byteVector51);
        org.junit.Assert.assertNotNull(byteVector53);
        org.junit.Assert.assertNotNull(byteVector55);
        org.junit.Assert.assertNotNull(byteVector57);
        org.junit.Assert.assertNotNull(byteVector59);
        org.junit.Assert.assertNotNull(byteVector61);
        org.junit.Assert.assertNotNull(byteVector63);
        org.junit.Assert.assertNotNull(byteVector65);
        org.junit.Assert.assertNotNull(byteVector67);
        org.junit.Assert.assertNotNull(byteArray72);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray72), "[1, 0, 0, -1]");
        org.junit.Assert.assertNotNull(byteVector75);
        org.junit.Assert.assertNotNull(byteVector78);
        org.junit.Assert.assertNotNull(byteVector81);
    }

    @Test
    public void test0389() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0389");
        org.mockito.asm.ByteVector byteVector0 = new org.mockito.asm.ByteVector();
        org.mockito.asm.ByteVector byteVector2 = byteVector0.putUTF8("hi!");
        org.mockito.asm.ByteVector byteVector4 = byteVector0.putLong((long) ' ');
        org.mockito.asm.ByteVector byteVector6 = byteVector4.putByte((int) 'a');
        org.mockito.asm.ByteVector byteVector8 = byteVector4.putByte((int) (short) -1);
        org.mockito.asm.ByteVector byteVector10 = byteVector4.putLong(0L);
        org.mockito.asm.ByteVector byteVector12 = byteVector4.putUTF8("hi!");
        org.mockito.asm.ByteVector byteVector14 = byteVector12.putUTF8("");
        org.mockito.asm.ByteVector byteVector16 = byteVector12.putLong((long) 0);
        java.lang.Class<?> wildcardClass17 = byteVector16.getClass();
        org.junit.Assert.assertNotNull(byteVector2);
        org.junit.Assert.assertNotNull(byteVector4);
        org.junit.Assert.assertNotNull(byteVector6);
        org.junit.Assert.assertNotNull(byteVector8);
        org.junit.Assert.assertNotNull(byteVector10);
        org.junit.Assert.assertNotNull(byteVector12);
        org.junit.Assert.assertNotNull(byteVector14);
        org.junit.Assert.assertNotNull(byteVector16);
        org.junit.Assert.assertNotNull(wildcardClass17);
    }

    @Test
    public void test0390() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0390");
        org.mockito.asm.ByteVector byteVector0 = new org.mockito.asm.ByteVector();
        org.mockito.asm.ByteVector byteVector2 = byteVector0.putUTF8("hi!");
        org.mockito.asm.ByteVector byteVector4 = byteVector0.putLong((long) ' ');
        org.mockito.asm.ByteVector byteVector6 = byteVector4.putByte((int) 'a');
        org.mockito.asm.ByteVector byteVector8 = byteVector4.putByte((int) (short) -1);
        org.mockito.asm.ByteVector byteVector10 = byteVector4.putLong(0L);
        org.mockito.asm.ByteVector byteVector12 = byteVector4.putUTF8("hi!");
        org.mockito.asm.ByteVector byteVector14 = byteVector12.putLong((long) '4');
        org.mockito.asm.ByteVector byteVector16 = byteVector14.putShort((int) ' ');
        java.lang.Class<?> wildcardClass17 = byteVector16.getClass();
        org.junit.Assert.assertNotNull(byteVector2);
        org.junit.Assert.assertNotNull(byteVector4);
        org.junit.Assert.assertNotNull(byteVector6);
        org.junit.Assert.assertNotNull(byteVector8);
        org.junit.Assert.assertNotNull(byteVector10);
        org.junit.Assert.assertNotNull(byteVector12);
        org.junit.Assert.assertNotNull(byteVector14);
        org.junit.Assert.assertNotNull(byteVector16);
        org.junit.Assert.assertNotNull(wildcardClass17);
    }

    @Test
    public void test0391() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0391");
        org.mockito.asm.ByteVector byteVector0 = new org.mockito.asm.ByteVector();
        org.mockito.asm.ByteVector byteVector2 = byteVector0.putUTF8("hi!");
        org.mockito.asm.ByteVector byteVector4 = byteVector0.putLong((long) ' ');
        org.mockito.asm.ByteVector byteVector6 = byteVector4.putByte((int) 'a');
        org.mockito.asm.ByteVector byteVector8 = byteVector6.putByte((int) (short) -1);
        org.mockito.asm.ByteVector byteVector10 = byteVector8.putLong((long) (byte) -1);
        org.mockito.asm.ByteVector byteVector12 = byteVector8.putByte((int) '4');
        org.mockito.asm.ByteVector byteVector13 = new org.mockito.asm.ByteVector();
        org.mockito.asm.ByteVector byteVector15 = byteVector13.putUTF8("hi!");
        org.mockito.asm.ByteVector byteVector17 = byteVector15.putLong((long) (byte) 10);
        org.mockito.asm.ByteVector byteVector19 = byteVector17.putUTF8("hi!");
        org.mockito.asm.ByteVector byteVector21 = byteVector17.putLong((-1L));
        org.mockito.asm.ByteVector byteVector23 = new org.mockito.asm.ByteVector((int) (short) 0);
        org.mockito.asm.ByteVector byteVector24 = new org.mockito.asm.ByteVector();
        org.mockito.asm.ByteVector byteVector26 = byteVector24.putUTF8("hi!");
        org.mockito.asm.ByteVector byteVector28 = byteVector24.putInt(0);
        org.mockito.asm.ByteVector byteVector30 = byteVector28.putInt((int) ' ');
        org.mockito.asm.ByteVector byteVector32 = byteVector30.putLong(100L);
        byte[] byteArray36 = new byte[] { (byte) 0, (byte) 10, (byte) 1 };
        org.mockito.asm.ByteVector byteVector39 = byteVector30.putByteArray(byteArray36, 0, 0);
        org.mockito.asm.ByteVector byteVector42 = byteVector23.putByteArray(byteArray36, 1, (int) (short) 0);
        org.mockito.asm.ByteVector byteVector45 = byteVector21.putByteArray(byteArray36, 0, (int) (byte) 1);
        // The following exception was thrown during execution in test generation
        try {
            org.mockito.asm.ByteVector byteVector48 = byteVector12.putByteArray(byteArray36, (int) '4', (int) (byte) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteVector2);
        org.junit.Assert.assertNotNull(byteVector4);
        org.junit.Assert.assertNotNull(byteVector6);
        org.junit.Assert.assertNotNull(byteVector8);
        org.junit.Assert.assertNotNull(byteVector10);
        org.junit.Assert.assertNotNull(byteVector12);
        org.junit.Assert.assertNotNull(byteVector15);
        org.junit.Assert.assertNotNull(byteVector17);
        org.junit.Assert.assertNotNull(byteVector19);
        org.junit.Assert.assertNotNull(byteVector21);
        org.junit.Assert.assertNotNull(byteVector26);
        org.junit.Assert.assertNotNull(byteVector28);
        org.junit.Assert.assertNotNull(byteVector30);
        org.junit.Assert.assertNotNull(byteVector32);
        org.junit.Assert.assertNotNull(byteArray36);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray36), "[0, 10, 1]");
        org.junit.Assert.assertNotNull(byteVector39);
        org.junit.Assert.assertNotNull(byteVector42);
        org.junit.Assert.assertNotNull(byteVector45);
    }

    @Test
    public void test0392() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0392");
        org.mockito.asm.ByteVector byteVector0 = new org.mockito.asm.ByteVector();
        org.mockito.asm.ByteVector byteVector2 = byteVector0.putUTF8("hi!");
        org.mockito.asm.ByteVector byteVector4 = byteVector0.putInt(0);
        org.mockito.asm.ByteVector byteVector6 = byteVector4.putInt((int) ' ');
        org.mockito.asm.ByteVector byteVector8 = byteVector6.putLong((long) (short) 10);
        org.mockito.asm.ByteVector byteVector10 = byteVector8.putUTF8("hi!");
        org.mockito.asm.ByteVector byteVector12 = byteVector8.putByte(0);
        org.mockito.asm.ByteVector byteVector14 = byteVector12.putByte((int) (short) 1);
        org.mockito.asm.ByteVector byteVector16 = byteVector14.putInt((int) ' ');
        org.junit.Assert.assertNotNull(byteVector2);
        org.junit.Assert.assertNotNull(byteVector4);
        org.junit.Assert.assertNotNull(byteVector6);
        org.junit.Assert.assertNotNull(byteVector8);
        org.junit.Assert.assertNotNull(byteVector10);
        org.junit.Assert.assertNotNull(byteVector12);
        org.junit.Assert.assertNotNull(byteVector14);
        org.junit.Assert.assertNotNull(byteVector16);
    }

    @Test
    public void test0393() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0393");
        org.mockito.asm.ByteVector byteVector1 = new org.mockito.asm.ByteVector((int) '#');
        org.mockito.asm.ByteVector byteVector3 = byteVector1.putInt(100);
        org.mockito.asm.ByteVector byteVector5 = byteVector3.putShort((int) (short) -1);
        org.mockito.asm.ByteVector byteVector7 = byteVector3.putShort(10);
        java.lang.Class<?> wildcardClass8 = byteVector7.getClass();
        org.junit.Assert.assertNotNull(byteVector3);
        org.junit.Assert.assertNotNull(byteVector5);
        org.junit.Assert.assertNotNull(byteVector7);
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test0394() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0394");
        org.mockito.asm.ByteVector byteVector0 = new org.mockito.asm.ByteVector();
        org.mockito.asm.ByteVector byteVector2 = byteVector0.putUTF8("hi!");
        org.mockito.asm.ByteVector byteVector4 = byteVector0.putLong((long) ' ');
        org.mockito.asm.ByteVector byteVector6 = byteVector4.putByte((int) 'a');
        org.mockito.asm.ByteVector byteVector8 = byteVector4.putByte((int) (short) -1);
        org.mockito.asm.ByteVector byteVector10 = byteVector4.putLong(0L);
        org.mockito.asm.ByteVector byteVector12 = byteVector4.putUTF8("hi!");
        org.mockito.asm.ByteVector byteVector14 = byteVector12.putUTF8("");
        org.mockito.asm.ByteVector byteVector16 = byteVector14.putLong((long) (byte) 10);
        org.mockito.asm.ByteVector byteVector18 = byteVector14.putLong((long) (short) 100);
        byte[] byteArray23 = new byte[] { (byte) 1, (byte) 0, (byte) 0, (byte) -1 };
        org.mockito.asm.ByteVector byteVector26 = byteVector14.putByteArray(byteArray23, 0, 0);
        org.mockito.asm.ByteVector byteVector28 = byteVector26.putShort(10);
        java.lang.Class<?> wildcardClass29 = byteVector28.getClass();
        org.junit.Assert.assertNotNull(byteVector2);
        org.junit.Assert.assertNotNull(byteVector4);
        org.junit.Assert.assertNotNull(byteVector6);
        org.junit.Assert.assertNotNull(byteVector8);
        org.junit.Assert.assertNotNull(byteVector10);
        org.junit.Assert.assertNotNull(byteVector12);
        org.junit.Assert.assertNotNull(byteVector14);
        org.junit.Assert.assertNotNull(byteVector16);
        org.junit.Assert.assertNotNull(byteVector18);
        org.junit.Assert.assertNotNull(byteArray23);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray23), "[1, 0, 0, -1]");
        org.junit.Assert.assertNotNull(byteVector26);
        org.junit.Assert.assertNotNull(byteVector28);
        org.junit.Assert.assertNotNull(wildcardClass29);
    }

    @Test
    public void test0395() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0395");
        org.mockito.asm.ByteVector byteVector0 = new org.mockito.asm.ByteVector();
        org.mockito.asm.ByteVector byteVector2 = byteVector0.putUTF8("hi!");
        org.mockito.asm.ByteVector byteVector4 = byteVector0.putLong((long) ' ');
        org.mockito.asm.ByteVector byteVector6 = byteVector4.putByte((int) 'a');
        org.mockito.asm.ByteVector byteVector8 = byteVector4.putByte((int) (short) -1);
        org.mockito.asm.ByteVector byteVector10 = byteVector4.putLong(0L);
        org.mockito.asm.ByteVector byteVector12 = byteVector10.putByte(0);
        org.mockito.asm.ByteVector byteVector14 = byteVector12.putByte(100);
        org.mockito.asm.ByteVector byteVector16 = byteVector12.putInt((-1));
        org.mockito.asm.ByteVector byteVector18 = byteVector12.putByte((int) (byte) 100);
        org.mockito.asm.ByteVector byteVector20 = byteVector12.putInt((int) (short) 1);
        org.mockito.asm.ByteVector byteVector22 = byteVector20.putByte((int) ' ');
        org.mockito.asm.ByteVector byteVector24 = byteVector20.putUTF8("");
        org.mockito.asm.ByteVector byteVector26 = byteVector24.putLong(0L);
        org.mockito.asm.ByteVector byteVector28 = byteVector24.putShort(0);
        org.junit.Assert.assertNotNull(byteVector2);
        org.junit.Assert.assertNotNull(byteVector4);
        org.junit.Assert.assertNotNull(byteVector6);
        org.junit.Assert.assertNotNull(byteVector8);
        org.junit.Assert.assertNotNull(byteVector10);
        org.junit.Assert.assertNotNull(byteVector12);
        org.junit.Assert.assertNotNull(byteVector14);
        org.junit.Assert.assertNotNull(byteVector16);
        org.junit.Assert.assertNotNull(byteVector18);
        org.junit.Assert.assertNotNull(byteVector20);
        org.junit.Assert.assertNotNull(byteVector22);
        org.junit.Assert.assertNotNull(byteVector24);
        org.junit.Assert.assertNotNull(byteVector26);
        org.junit.Assert.assertNotNull(byteVector28);
    }

    @Test
    public void test0396() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0396");
        org.mockito.asm.ByteVector byteVector1 = new org.mockito.asm.ByteVector((int) '#');
        org.mockito.asm.ByteVector byteVector3 = byteVector1.putInt(100);
        org.mockito.asm.ByteVector byteVector5 = byteVector3.putShort((int) (short) -1);
        org.mockito.asm.ByteVector byteVector7 = byteVector5.putInt((int) (short) -1);
        org.junit.Assert.assertNotNull(byteVector3);
        org.junit.Assert.assertNotNull(byteVector5);
        org.junit.Assert.assertNotNull(byteVector7);
    }

    @Test
    public void test0397() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0397");
        org.mockito.asm.ByteVector byteVector1 = new org.mockito.asm.ByteVector((int) '#');
        org.mockito.asm.ByteVector byteVector3 = byteVector1.putLong(100L);
        org.mockito.asm.ByteVector byteVector5 = byteVector1.putUTF8("");
        org.mockito.asm.ByteVector byteVector7 = byteVector1.putUTF8("hi!");
        org.mockito.asm.ByteVector byteVector9 = byteVector7.putLong((long) (short) 0);
        org.mockito.asm.ByteVector byteVector11 = byteVector7.putShort(1);
        org.mockito.asm.ByteVector byteVector13 = byteVector7.putByte((int) (byte) 100);
        org.junit.Assert.assertNotNull(byteVector3);
        org.junit.Assert.assertNotNull(byteVector5);
        org.junit.Assert.assertNotNull(byteVector7);
        org.junit.Assert.assertNotNull(byteVector9);
        org.junit.Assert.assertNotNull(byteVector11);
        org.junit.Assert.assertNotNull(byteVector13);
    }

    @Test
    public void test0398() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0398");
        org.mockito.asm.ByteVector byteVector0 = new org.mockito.asm.ByteVector();
        org.mockito.asm.ByteVector byteVector2 = byteVector0.putUTF8("hi!");
        org.mockito.asm.ByteVector byteVector4 = byteVector0.putLong((long) ' ');
        org.mockito.asm.ByteVector byteVector6 = byteVector4.putByte((int) 'a');
        org.mockito.asm.ByteVector byteVector8 = byteVector4.putByte((int) (short) -1);
        org.mockito.asm.ByteVector byteVector10 = byteVector4.putLong(0L);
        org.mockito.asm.ByteVector byteVector12 = byteVector10.putByte(0);
        org.mockito.asm.ByteVector byteVector14 = byteVector12.putLong(1L);
        org.mockito.asm.ByteVector byteVector16 = byteVector14.putShort((int) 'a');
        org.mockito.asm.ByteVector byteVector18 = byteVector14.putLong((long) 10);
        org.mockito.asm.ByteVector byteVector20 = byteVector14.putUTF8("hi!");
        org.mockito.asm.ByteVector byteVector22 = byteVector20.putShort((int) (byte) 100);
        org.junit.Assert.assertNotNull(byteVector2);
        org.junit.Assert.assertNotNull(byteVector4);
        org.junit.Assert.assertNotNull(byteVector6);
        org.junit.Assert.assertNotNull(byteVector8);
        org.junit.Assert.assertNotNull(byteVector10);
        org.junit.Assert.assertNotNull(byteVector12);
        org.junit.Assert.assertNotNull(byteVector14);
        org.junit.Assert.assertNotNull(byteVector16);
        org.junit.Assert.assertNotNull(byteVector18);
        org.junit.Assert.assertNotNull(byteVector20);
        org.junit.Assert.assertNotNull(byteVector22);
    }

    @Test
    public void test0399() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0399");
        org.mockito.asm.ByteVector byteVector0 = new org.mockito.asm.ByteVector();
        org.mockito.asm.ByteVector byteVector2 = byteVector0.putUTF8("hi!");
        org.mockito.asm.ByteVector byteVector4 = byteVector0.putLong((long) ' ');
        org.mockito.asm.ByteVector byteVector6 = byteVector4.putByte((int) 'a');
        org.mockito.asm.ByteVector byteVector8 = byteVector6.putByte((int) (short) -1);
        org.mockito.asm.ByteVector byteVector10 = byteVector8.putLong((long) (byte) -1);
        org.mockito.asm.ByteVector byteVector12 = byteVector8.putByte((int) '4');
        org.mockito.asm.ByteVector byteVector14 = byteVector12.putLong((long) (short) 10);
        org.mockito.asm.ByteVector byteVector15 = new org.mockito.asm.ByteVector();
        org.mockito.asm.ByteVector byteVector17 = byteVector15.putUTF8("hi!");
        org.mockito.asm.ByteVector byteVector19 = byteVector15.putLong((long) ' ');
        org.mockito.asm.ByteVector byteVector21 = byteVector19.putByte((int) 'a');
        org.mockito.asm.ByteVector byteVector23 = byteVector19.putByte((int) (short) -1);
        org.mockito.asm.ByteVector byteVector25 = byteVector19.putLong(0L);
        org.mockito.asm.ByteVector byteVector27 = byteVector25.putByte(0);
        org.mockito.asm.ByteVector byteVector29 = byteVector27.putLong(1L);
        org.mockito.asm.ByteVector byteVector31 = byteVector29.putShort((int) 'a');
        org.mockito.asm.ByteVector byteVector33 = byteVector29.putLong((long) 10);
        org.mockito.asm.ByteVector byteVector35 = byteVector29.putUTF8("");
        org.mockito.asm.ByteVector byteVector36 = new org.mockito.asm.ByteVector();
        org.mockito.asm.ByteVector byteVector38 = byteVector36.putUTF8("hi!");
        org.mockito.asm.ByteVector byteVector40 = byteVector38.putLong((long) (byte) 10);
        org.mockito.asm.ByteVector byteVector42 = byteVector40.putUTF8("hi!");
        org.mockito.asm.ByteVector byteVector44 = byteVector40.putLong((long) (short) -1);
        org.mockito.asm.ByteVector byteVector46 = byteVector44.putInt(10);
        org.mockito.asm.ByteVector byteVector48 = byteVector44.putByte((int) (short) 1);
        org.mockito.asm.ByteVector byteVector50 = byteVector44.putInt((int) (short) -1);
        org.mockito.asm.ByteVector byteVector52 = byteVector44.putUTF8("hi!");
        org.mockito.asm.ByteVector byteVector53 = new org.mockito.asm.ByteVector();
        org.mockito.asm.ByteVector byteVector55 = byteVector53.putUTF8("hi!");
        org.mockito.asm.ByteVector byteVector57 = byteVector53.putLong((long) ' ');
        org.mockito.asm.ByteVector byteVector59 = byteVector57.putByte((int) 'a');
        org.mockito.asm.ByteVector byteVector61 = byteVector57.putByte((int) (short) -1);
        org.mockito.asm.ByteVector byteVector63 = byteVector57.putLong(0L);
        org.mockito.asm.ByteVector byteVector65 = byteVector57.putUTF8("hi!");
        org.mockito.asm.ByteVector byteVector67 = byteVector65.putUTF8("");
        org.mockito.asm.ByteVector byteVector69 = byteVector67.putLong((long) (byte) 10);
        org.mockito.asm.ByteVector byteVector71 = byteVector67.putLong((long) (short) 100);
        byte[] byteArray76 = new byte[] { (byte) 1, (byte) 0, (byte) 0, (byte) -1 };
        org.mockito.asm.ByteVector byteVector79 = byteVector67.putByteArray(byteArray76, 0, 0);
        org.mockito.asm.ByteVector byteVector82 = byteVector52.putByteArray(byteArray76, (int) (byte) 0, (int) (short) 1);
        org.mockito.asm.ByteVector byteVector85 = byteVector29.putByteArray(byteArray76, (int) (short) 0, (int) (short) 0);
        // The following exception was thrown during execution in test generation
        try {
            org.mockito.asm.ByteVector byteVector88 = byteVector14.putByteArray(byteArray76, (-1), (int) (byte) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteVector2);
        org.junit.Assert.assertNotNull(byteVector4);
        org.junit.Assert.assertNotNull(byteVector6);
        org.junit.Assert.assertNotNull(byteVector8);
        org.junit.Assert.assertNotNull(byteVector10);
        org.junit.Assert.assertNotNull(byteVector12);
        org.junit.Assert.assertNotNull(byteVector14);
        org.junit.Assert.assertNotNull(byteVector17);
        org.junit.Assert.assertNotNull(byteVector19);
        org.junit.Assert.assertNotNull(byteVector21);
        org.junit.Assert.assertNotNull(byteVector23);
        org.junit.Assert.assertNotNull(byteVector25);
        org.junit.Assert.assertNotNull(byteVector27);
        org.junit.Assert.assertNotNull(byteVector29);
        org.junit.Assert.assertNotNull(byteVector31);
        org.junit.Assert.assertNotNull(byteVector33);
        org.junit.Assert.assertNotNull(byteVector35);
        org.junit.Assert.assertNotNull(byteVector38);
        org.junit.Assert.assertNotNull(byteVector40);
        org.junit.Assert.assertNotNull(byteVector42);
        org.junit.Assert.assertNotNull(byteVector44);
        org.junit.Assert.assertNotNull(byteVector46);
        org.junit.Assert.assertNotNull(byteVector48);
        org.junit.Assert.assertNotNull(byteVector50);
        org.junit.Assert.assertNotNull(byteVector52);
        org.junit.Assert.assertNotNull(byteVector55);
        org.junit.Assert.assertNotNull(byteVector57);
        org.junit.Assert.assertNotNull(byteVector59);
        org.junit.Assert.assertNotNull(byteVector61);
        org.junit.Assert.assertNotNull(byteVector63);
        org.junit.Assert.assertNotNull(byteVector65);
        org.junit.Assert.assertNotNull(byteVector67);
        org.junit.Assert.assertNotNull(byteVector69);
        org.junit.Assert.assertNotNull(byteVector71);
        org.junit.Assert.assertNotNull(byteArray76);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray76), "[1, 0, 0, -1]");
        org.junit.Assert.assertNotNull(byteVector79);
        org.junit.Assert.assertNotNull(byteVector82);
        org.junit.Assert.assertNotNull(byteVector85);
    }

    @Test
    public void test0400() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0400");
        org.mockito.asm.ByteVector byteVector0 = new org.mockito.asm.ByteVector();
        org.mockito.asm.ByteVector byteVector2 = byteVector0.putUTF8("hi!");
        org.mockito.asm.ByteVector byteVector4 = byteVector0.putInt(0);
        org.mockito.asm.ByteVector byteVector6 = byteVector0.putShort(10);
        org.mockito.asm.ByteVector byteVector8 = byteVector6.putShort((int) (byte) 0);
        java.lang.Class<?> wildcardClass9 = byteVector8.getClass();
        org.junit.Assert.assertNotNull(byteVector2);
        org.junit.Assert.assertNotNull(byteVector4);
        org.junit.Assert.assertNotNull(byteVector6);
        org.junit.Assert.assertNotNull(byteVector8);
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test0401() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0401");
        org.mockito.asm.ByteVector byteVector1 = new org.mockito.asm.ByteVector((int) '#');
        org.mockito.asm.ByteVector byteVector3 = byteVector1.putLong(100L);
        org.mockito.asm.ByteVector byteVector5 = byteVector3.putUTF8("");
        org.mockito.asm.ByteVector byteVector7 = byteVector3.putLong((-1L));
        org.mockito.asm.ByteVector byteVector9 = byteVector7.putLong((-1L));
        org.mockito.asm.ByteVector byteVector11 = byteVector9.putInt((int) (byte) 10);
        org.mockito.asm.ByteVector byteVector13 = byteVector11.putInt((int) (short) 0);
        org.mockito.asm.ByteVector byteVector15 = byteVector11.putInt((int) (byte) 10);
        org.mockito.asm.ByteVector byteVector16 = new org.mockito.asm.ByteVector();
        org.mockito.asm.ByteVector byteVector18 = byteVector16.putUTF8("hi!");
        org.mockito.asm.ByteVector byteVector20 = byteVector18.putLong((long) (byte) 10);
        org.mockito.asm.ByteVector byteVector22 = byteVector20.putUTF8("hi!");
        org.mockito.asm.ByteVector byteVector24 = byteVector20.putLong((-1L));
        org.mockito.asm.ByteVector byteVector26 = byteVector24.putInt(10);
        org.mockito.asm.ByteVector byteVector28 = byteVector26.putShort((int) '#');
        org.mockito.asm.ByteVector byteVector30 = new org.mockito.asm.ByteVector((int) (short) 0);
        org.mockito.asm.ByteVector byteVector31 = new org.mockito.asm.ByteVector();
        org.mockito.asm.ByteVector byteVector33 = byteVector31.putUTF8("hi!");
        org.mockito.asm.ByteVector byteVector35 = byteVector31.putInt(0);
        org.mockito.asm.ByteVector byteVector37 = byteVector35.putInt((int) ' ');
        org.mockito.asm.ByteVector byteVector39 = byteVector37.putLong(100L);
        byte[] byteArray43 = new byte[] { (byte) 0, (byte) 10, (byte) 1 };
        org.mockito.asm.ByteVector byteVector46 = byteVector37.putByteArray(byteArray43, 0, 0);
        org.mockito.asm.ByteVector byteVector49 = byteVector30.putByteArray(byteArray43, 1, (int) (short) 0);
        org.mockito.asm.ByteVector byteVector52 = byteVector26.putByteArray(byteArray43, (int) (short) 0, 0);
        // The following exception was thrown during execution in test generation
        try {
            org.mockito.asm.ByteVector byteVector55 = byteVector15.putByteArray(byteArray43, (int) (byte) -1, 0);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteVector3);
        org.junit.Assert.assertNotNull(byteVector5);
        org.junit.Assert.assertNotNull(byteVector7);
        org.junit.Assert.assertNotNull(byteVector9);
        org.junit.Assert.assertNotNull(byteVector11);
        org.junit.Assert.assertNotNull(byteVector13);
        org.junit.Assert.assertNotNull(byteVector15);
        org.junit.Assert.assertNotNull(byteVector18);
        org.junit.Assert.assertNotNull(byteVector20);
        org.junit.Assert.assertNotNull(byteVector22);
        org.junit.Assert.assertNotNull(byteVector24);
        org.junit.Assert.assertNotNull(byteVector26);
        org.junit.Assert.assertNotNull(byteVector28);
        org.junit.Assert.assertNotNull(byteVector33);
        org.junit.Assert.assertNotNull(byteVector35);
        org.junit.Assert.assertNotNull(byteVector37);
        org.junit.Assert.assertNotNull(byteVector39);
        org.junit.Assert.assertNotNull(byteArray43);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray43), "[0, 10, 1]");
        org.junit.Assert.assertNotNull(byteVector46);
        org.junit.Assert.assertNotNull(byteVector49);
        org.junit.Assert.assertNotNull(byteVector52);
    }

    @Test
    public void test0402() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0402");
        org.mockito.asm.ByteVector byteVector0 = new org.mockito.asm.ByteVector();
        org.mockito.asm.ByteVector byteVector2 = byteVector0.putUTF8("hi!");
        org.mockito.asm.ByteVector byteVector4 = byteVector0.putLong((long) ' ');
        org.mockito.asm.ByteVector byteVector6 = byteVector4.putByte((int) 'a');
        org.mockito.asm.ByteVector byteVector8 = byteVector4.putByte((int) (short) -1);
        org.mockito.asm.ByteVector byteVector10 = byteVector4.putLong(0L);
        org.mockito.asm.ByteVector byteVector12 = byteVector10.putByte(0);
        org.mockito.asm.ByteVector byteVector14 = byteVector12.putInt((int) (short) 0);
        org.mockito.asm.ByteVector byteVector16 = byteVector14.putInt(10);
        org.mockito.asm.ByteVector byteVector18 = byteVector16.putLong((long) (byte) 10);
        org.mockito.asm.ByteVector byteVector20 = byteVector18.putLong((long) ' ');
        java.lang.Class<?> wildcardClass21 = byteVector20.getClass();
        org.junit.Assert.assertNotNull(byteVector2);
        org.junit.Assert.assertNotNull(byteVector4);
        org.junit.Assert.assertNotNull(byteVector6);
        org.junit.Assert.assertNotNull(byteVector8);
        org.junit.Assert.assertNotNull(byteVector10);
        org.junit.Assert.assertNotNull(byteVector12);
        org.junit.Assert.assertNotNull(byteVector14);
        org.junit.Assert.assertNotNull(byteVector16);
        org.junit.Assert.assertNotNull(byteVector18);
        org.junit.Assert.assertNotNull(byteVector20);
        org.junit.Assert.assertNotNull(wildcardClass21);
    }

    @Test
    public void test0403() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0403");
        org.mockito.asm.ByteVector byteVector0 = new org.mockito.asm.ByteVector();
        org.mockito.asm.ByteVector byteVector2 = byteVector0.putUTF8("hi!");
        org.mockito.asm.ByteVector byteVector4 = byteVector0.putLong((long) ' ');
        org.mockito.asm.ByteVector byteVector6 = byteVector4.putByte((int) 'a');
        org.mockito.asm.ByteVector byteVector8 = byteVector6.putByte((int) (short) -1);
        org.mockito.asm.ByteVector byteVector10 = byteVector8.putLong((long) (byte) -1);
        org.mockito.asm.ByteVector byteVector12 = byteVector8.putByte((int) '4');
        org.mockito.asm.ByteVector byteVector14 = byteVector12.putLong((long) (short) 10);
        org.mockito.asm.ByteVector byteVector16 = byteVector14.putByte((int) 'a');
        org.mockito.asm.ByteVector byteVector17 = new org.mockito.asm.ByteVector();
        org.mockito.asm.ByteVector byteVector19 = byteVector17.putUTF8("hi!");
        org.mockito.asm.ByteVector byteVector21 = byteVector19.putByte(100);
        org.mockito.asm.ByteVector byteVector23 = byteVector19.putShort((int) 'a');
        org.mockito.asm.ByteVector byteVector25 = byteVector23.putShort((int) (short) 0);
        org.mockito.asm.ByteVector byteVector26 = new org.mockito.asm.ByteVector();
        org.mockito.asm.ByteVector byteVector28 = byteVector26.putUTF8("hi!");
        org.mockito.asm.ByteVector byteVector30 = byteVector28.putInt(0);
        org.mockito.asm.ByteVector byteVector32 = byteVector28.putByte((int) (byte) 10);
        org.mockito.asm.ByteVector byteVector34 = byteVector32.putLong((-1L));
        org.mockito.asm.ByteVector byteVector36 = byteVector32.putInt((int) (byte) 100);
        org.mockito.asm.ByteVector byteVector37 = new org.mockito.asm.ByteVector();
        org.mockito.asm.ByteVector byteVector39 = byteVector37.putUTF8("hi!");
        org.mockito.asm.ByteVector byteVector41 = byteVector37.putInt(0);
        org.mockito.asm.ByteVector byteVector43 = byteVector41.putInt((int) ' ');
        org.mockito.asm.ByteVector byteVector45 = byteVector43.putLong(100L);
        byte[] byteArray49 = new byte[] { (byte) 0, (byte) 10, (byte) 1 };
        org.mockito.asm.ByteVector byteVector52 = byteVector43.putByteArray(byteArray49, 0, 0);
        org.mockito.asm.ByteVector byteVector55 = byteVector32.putByteArray(byteArray49, (int) (byte) 1, 0);
        org.mockito.asm.ByteVector byteVector58 = byteVector23.putByteArray(byteArray49, (int) (byte) 1, (int) (short) 1);
        // The following exception was thrown during execution in test generation
        try {
            org.mockito.asm.ByteVector byteVector61 = byteVector16.putByteArray(byteArray49, 0, (int) (short) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteVector2);
        org.junit.Assert.assertNotNull(byteVector4);
        org.junit.Assert.assertNotNull(byteVector6);
        org.junit.Assert.assertNotNull(byteVector8);
        org.junit.Assert.assertNotNull(byteVector10);
        org.junit.Assert.assertNotNull(byteVector12);
        org.junit.Assert.assertNotNull(byteVector14);
        org.junit.Assert.assertNotNull(byteVector16);
        org.junit.Assert.assertNotNull(byteVector19);
        org.junit.Assert.assertNotNull(byteVector21);
        org.junit.Assert.assertNotNull(byteVector23);
        org.junit.Assert.assertNotNull(byteVector25);
        org.junit.Assert.assertNotNull(byteVector28);
        org.junit.Assert.assertNotNull(byteVector30);
        org.junit.Assert.assertNotNull(byteVector32);
        org.junit.Assert.assertNotNull(byteVector34);
        org.junit.Assert.assertNotNull(byteVector36);
        org.junit.Assert.assertNotNull(byteVector39);
        org.junit.Assert.assertNotNull(byteVector41);
        org.junit.Assert.assertNotNull(byteVector43);
        org.junit.Assert.assertNotNull(byteVector45);
        org.junit.Assert.assertNotNull(byteArray49);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray49), "[0, 10, 1]");
        org.junit.Assert.assertNotNull(byteVector52);
        org.junit.Assert.assertNotNull(byteVector55);
        org.junit.Assert.assertNotNull(byteVector58);
    }

    @Test
    public void test0404() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0404");
        org.mockito.asm.ByteVector byteVector0 = new org.mockito.asm.ByteVector();
        org.mockito.asm.ByteVector byteVector2 = byteVector0.putUTF8("hi!");
        org.mockito.asm.ByteVector byteVector4 = byteVector0.putLong((long) ' ');
        org.mockito.asm.ByteVector byteVector6 = byteVector4.putByte((int) 'a');
        org.mockito.asm.ByteVector byteVector8 = byteVector4.putByte((int) (short) -1);
        org.mockito.asm.ByteVector byteVector10 = byteVector4.putLong(0L);
        org.mockito.asm.ByteVector byteVector12 = byteVector10.putInt((int) (short) -1);
        org.mockito.asm.ByteVector byteVector14 = byteVector12.putByte(100);
        org.mockito.asm.ByteVector byteVector16 = byteVector14.putUTF8("hi!");
        org.mockito.asm.ByteVector byteVector18 = byteVector14.putLong((long) (byte) 1);
        org.mockito.asm.ByteVector byteVector19 = new org.mockito.asm.ByteVector();
        org.mockito.asm.ByteVector byteVector21 = byteVector19.putUTF8("hi!");
        org.mockito.asm.ByteVector byteVector23 = byteVector19.putLong((long) ' ');
        org.mockito.asm.ByteVector byteVector25 = byteVector23.putByte((int) 'a');
        org.mockito.asm.ByteVector byteVector27 = byteVector23.putByte((int) (short) -1);
        org.mockito.asm.ByteVector byteVector29 = byteVector23.putLong(0L);
        org.mockito.asm.ByteVector byteVector31 = byteVector29.putByte(0);
        org.mockito.asm.ByteVector byteVector33 = byteVector31.putLong(1L);
        org.mockito.asm.ByteVector byteVector35 = byteVector33.putShort((int) 'a');
        org.mockito.asm.ByteVector byteVector37 = byteVector33.putLong((long) 10);
        org.mockito.asm.ByteVector byteVector39 = byteVector33.putUTF8("");
        org.mockito.asm.ByteVector byteVector40 = new org.mockito.asm.ByteVector();
        org.mockito.asm.ByteVector byteVector42 = byteVector40.putUTF8("hi!");
        org.mockito.asm.ByteVector byteVector44 = byteVector42.putLong((long) (byte) 10);
        org.mockito.asm.ByteVector byteVector46 = byteVector44.putUTF8("hi!");
        org.mockito.asm.ByteVector byteVector48 = byteVector44.putLong((long) (short) -1);
        org.mockito.asm.ByteVector byteVector50 = byteVector48.putInt(10);
        org.mockito.asm.ByteVector byteVector52 = byteVector48.putByte((int) (short) 1);
        org.mockito.asm.ByteVector byteVector54 = byteVector48.putInt((int) (short) -1);
        org.mockito.asm.ByteVector byteVector56 = byteVector48.putUTF8("hi!");
        org.mockito.asm.ByteVector byteVector57 = new org.mockito.asm.ByteVector();
        org.mockito.asm.ByteVector byteVector59 = byteVector57.putUTF8("hi!");
        org.mockito.asm.ByteVector byteVector61 = byteVector57.putLong((long) ' ');
        org.mockito.asm.ByteVector byteVector63 = byteVector61.putByte((int) 'a');
        org.mockito.asm.ByteVector byteVector65 = byteVector61.putByte((int) (short) -1);
        org.mockito.asm.ByteVector byteVector67 = byteVector61.putLong(0L);
        org.mockito.asm.ByteVector byteVector69 = byteVector61.putUTF8("hi!");
        org.mockito.asm.ByteVector byteVector71 = byteVector69.putUTF8("");
        org.mockito.asm.ByteVector byteVector73 = byteVector71.putLong((long) (byte) 10);
        org.mockito.asm.ByteVector byteVector75 = byteVector71.putLong((long) (short) 100);
        byte[] byteArray80 = new byte[] { (byte) 1, (byte) 0, (byte) 0, (byte) -1 };
        org.mockito.asm.ByteVector byteVector83 = byteVector71.putByteArray(byteArray80, 0, 0);
        org.mockito.asm.ByteVector byteVector86 = byteVector56.putByteArray(byteArray80, (int) (byte) 0, (int) (short) 1);
        org.mockito.asm.ByteVector byteVector89 = byteVector33.putByteArray(byteArray80, (int) (short) 0, (int) (short) 0);
        // The following exception was thrown during execution in test generation
        try {
            org.mockito.asm.ByteVector byteVector92 = byteVector14.putByteArray(byteArray80, (int) (byte) -1, 0);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteVector2);
        org.junit.Assert.assertNotNull(byteVector4);
        org.junit.Assert.assertNotNull(byteVector6);
        org.junit.Assert.assertNotNull(byteVector8);
        org.junit.Assert.assertNotNull(byteVector10);
        org.junit.Assert.assertNotNull(byteVector12);
        org.junit.Assert.assertNotNull(byteVector14);
        org.junit.Assert.assertNotNull(byteVector16);
        org.junit.Assert.assertNotNull(byteVector18);
        org.junit.Assert.assertNotNull(byteVector21);
        org.junit.Assert.assertNotNull(byteVector23);
        org.junit.Assert.assertNotNull(byteVector25);
        org.junit.Assert.assertNotNull(byteVector27);
        org.junit.Assert.assertNotNull(byteVector29);
        org.junit.Assert.assertNotNull(byteVector31);
        org.junit.Assert.assertNotNull(byteVector33);
        org.junit.Assert.assertNotNull(byteVector35);
        org.junit.Assert.assertNotNull(byteVector37);
        org.junit.Assert.assertNotNull(byteVector39);
        org.junit.Assert.assertNotNull(byteVector42);
        org.junit.Assert.assertNotNull(byteVector44);
        org.junit.Assert.assertNotNull(byteVector46);
        org.junit.Assert.assertNotNull(byteVector48);
        org.junit.Assert.assertNotNull(byteVector50);
        org.junit.Assert.assertNotNull(byteVector52);
        org.junit.Assert.assertNotNull(byteVector54);
        org.junit.Assert.assertNotNull(byteVector56);
        org.junit.Assert.assertNotNull(byteVector59);
        org.junit.Assert.assertNotNull(byteVector61);
        org.junit.Assert.assertNotNull(byteVector63);
        org.junit.Assert.assertNotNull(byteVector65);
        org.junit.Assert.assertNotNull(byteVector67);
        org.junit.Assert.assertNotNull(byteVector69);
        org.junit.Assert.assertNotNull(byteVector71);
        org.junit.Assert.assertNotNull(byteVector73);
        org.junit.Assert.assertNotNull(byteVector75);
        org.junit.Assert.assertNotNull(byteArray80);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray80), "[1, 0, 0, -1]");
        org.junit.Assert.assertNotNull(byteVector83);
        org.junit.Assert.assertNotNull(byteVector86);
        org.junit.Assert.assertNotNull(byteVector89);
    }

    @Test
    public void test0405() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0405");
        org.mockito.asm.ByteVector byteVector0 = new org.mockito.asm.ByteVector();
        org.mockito.asm.ByteVector byteVector2 = byteVector0.putUTF8("hi!");
        org.mockito.asm.ByteVector byteVector4 = byteVector2.putLong((long) (byte) 10);
        org.mockito.asm.ByteVector byteVector6 = byteVector4.putInt((int) 'a');
        org.mockito.asm.ByteVector byteVector8 = byteVector6.putShort((int) (byte) 0);
        java.lang.Class<?> wildcardClass9 = byteVector6.getClass();
        org.junit.Assert.assertNotNull(byteVector2);
        org.junit.Assert.assertNotNull(byteVector4);
        org.junit.Assert.assertNotNull(byteVector6);
        org.junit.Assert.assertNotNull(byteVector8);
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test0406() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0406");
        org.mockito.asm.ByteVector byteVector0 = new org.mockito.asm.ByteVector();
        org.mockito.asm.ByteVector byteVector2 = byteVector0.putUTF8("hi!");
        org.mockito.asm.ByteVector byteVector4 = byteVector0.putInt(0);
        org.mockito.asm.ByteVector byteVector6 = byteVector0.putShort(10);
        java.lang.Class<?> wildcardClass7 = byteVector6.getClass();
        org.junit.Assert.assertNotNull(byteVector2);
        org.junit.Assert.assertNotNull(byteVector4);
        org.junit.Assert.assertNotNull(byteVector6);
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test0407() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0407");
        org.mockito.asm.ByteVector byteVector1 = new org.mockito.asm.ByteVector((int) (byte) 10);
        org.mockito.asm.ByteVector byteVector3 = byteVector1.putByte((int) '4');
        org.mockito.asm.ByteVector byteVector5 = byteVector1.putLong((long) 'a');
        org.mockito.asm.ByteVector byteVector7 = byteVector1.putShort((int) (byte) 1);
        org.mockito.asm.ByteVector byteVector9 = byteVector7.putShort((int) (byte) 0);
        java.lang.Class<?> wildcardClass10 = byteVector7.getClass();
        org.junit.Assert.assertNotNull(byteVector3);
        org.junit.Assert.assertNotNull(byteVector5);
        org.junit.Assert.assertNotNull(byteVector7);
        org.junit.Assert.assertNotNull(byteVector9);
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test0408() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0408");
        org.mockito.asm.ByteVector byteVector0 = new org.mockito.asm.ByteVector();
        org.mockito.asm.ByteVector byteVector2 = byteVector0.putUTF8("hi!");
        org.mockito.asm.ByteVector byteVector4 = byteVector0.putShort((int) (short) -1);
        org.mockito.asm.ByteVector byteVector6 = byteVector0.putInt((int) (byte) 10);
        org.mockito.asm.ByteVector byteVector8 = byteVector6.putUTF8("hi!");
        org.mockito.asm.ByteVector byteVector10 = byteVector8.putInt((int) (short) 10);
        org.mockito.asm.ByteVector byteVector12 = byteVector8.putShort((-1));
        org.mockito.asm.ByteVector byteVector14 = byteVector8.putByte((int) (byte) 100);
        org.junit.Assert.assertNotNull(byteVector2);
        org.junit.Assert.assertNotNull(byteVector4);
        org.junit.Assert.assertNotNull(byteVector6);
        org.junit.Assert.assertNotNull(byteVector8);
        org.junit.Assert.assertNotNull(byteVector10);
        org.junit.Assert.assertNotNull(byteVector12);
        org.junit.Assert.assertNotNull(byteVector14);
    }

    @Test
    public void test0409() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0409");
        org.mockito.asm.ByteVector byteVector0 = new org.mockito.asm.ByteVector();
        org.mockito.asm.ByteVector byteVector2 = byteVector0.putUTF8("hi!");
        org.mockito.asm.ByteVector byteVector4 = byteVector2.putInt(0);
        org.mockito.asm.ByteVector byteVector6 = byteVector4.putShort((int) '4');
        org.mockito.asm.ByteVector byteVector8 = byteVector6.putByte(100);
        java.lang.Class<?> wildcardClass9 = byteVector6.getClass();
        org.junit.Assert.assertNotNull(byteVector2);
        org.junit.Assert.assertNotNull(byteVector4);
        org.junit.Assert.assertNotNull(byteVector6);
        org.junit.Assert.assertNotNull(byteVector8);
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test0410() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0410");
        org.mockito.asm.ByteVector byteVector0 = new org.mockito.asm.ByteVector();
        org.mockito.asm.ByteVector byteVector2 = byteVector0.putUTF8("hi!");
        org.mockito.asm.ByteVector byteVector4 = byteVector0.putLong((long) ' ');
        org.mockito.asm.ByteVector byteVector6 = byteVector4.putByte((int) 'a');
        org.mockito.asm.ByteVector byteVector8 = byteVector4.putByte((int) (short) -1);
        org.mockito.asm.ByteVector byteVector10 = byteVector4.putLong(0L);
        org.mockito.asm.ByteVector byteVector12 = byteVector10.putInt((int) (short) -1);
        org.mockito.asm.ByteVector byteVector14 = byteVector12.putByte(100);
        org.mockito.asm.ByteVector byteVector16 = byteVector14.putUTF8("hi!");
        org.mockito.asm.ByteVector byteVector18 = byteVector14.putLong((long) (short) 0);
        java.lang.Class<?> wildcardClass19 = byteVector18.getClass();
        org.junit.Assert.assertNotNull(byteVector2);
        org.junit.Assert.assertNotNull(byteVector4);
        org.junit.Assert.assertNotNull(byteVector6);
        org.junit.Assert.assertNotNull(byteVector8);
        org.junit.Assert.assertNotNull(byteVector10);
        org.junit.Assert.assertNotNull(byteVector12);
        org.junit.Assert.assertNotNull(byteVector14);
        org.junit.Assert.assertNotNull(byteVector16);
        org.junit.Assert.assertNotNull(byteVector18);
        org.junit.Assert.assertNotNull(wildcardClass19);
    }

    @Test
    public void test0411() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0411");
        org.mockito.asm.ByteVector byteVector0 = new org.mockito.asm.ByteVector();
        org.mockito.asm.ByteVector byteVector2 = byteVector0.putUTF8("hi!");
        org.mockito.asm.ByteVector byteVector4 = byteVector0.putInt(0);
        org.mockito.asm.ByteVector byteVector6 = byteVector4.putInt((int) ' ');
        org.mockito.asm.ByteVector byteVector8 = byteVector6.putLong((long) (short) 10);
        org.mockito.asm.ByteVector byteVector10 = byteVector6.putInt((int) '4');
        org.mockito.asm.ByteVector byteVector12 = byteVector6.putInt((int) (short) 10);
        org.mockito.asm.ByteVector byteVector13 = new org.mockito.asm.ByteVector();
        org.mockito.asm.ByteVector byteVector15 = byteVector13.putUTF8("hi!");
        org.mockito.asm.ByteVector byteVector17 = byteVector15.putLong((long) (byte) 10);
        org.mockito.asm.ByteVector byteVector19 = byteVector17.putUTF8("hi!");
        org.mockito.asm.ByteVector byteVector21 = byteVector17.putLong((long) (short) -1);
        org.mockito.asm.ByteVector byteVector23 = byteVector21.putInt(10);
        org.mockito.asm.ByteVector byteVector25 = byteVector21.putByte((int) (short) 1);
        org.mockito.asm.ByteVector byteVector27 = byteVector21.putInt((int) (short) -1);
        org.mockito.asm.ByteVector byteVector29 = byteVector21.putUTF8("hi!");
        org.mockito.asm.ByteVector byteVector30 = new org.mockito.asm.ByteVector();
        org.mockito.asm.ByteVector byteVector32 = byteVector30.putUTF8("hi!");
        org.mockito.asm.ByteVector byteVector34 = byteVector30.putLong((long) ' ');
        org.mockito.asm.ByteVector byteVector36 = byteVector34.putByte((int) 'a');
        org.mockito.asm.ByteVector byteVector38 = byteVector34.putByte((int) (short) -1);
        org.mockito.asm.ByteVector byteVector40 = byteVector34.putLong(0L);
        org.mockito.asm.ByteVector byteVector42 = byteVector34.putUTF8("hi!");
        org.mockito.asm.ByteVector byteVector44 = byteVector42.putUTF8("");
        org.mockito.asm.ByteVector byteVector46 = byteVector44.putLong((long) (byte) 10);
        org.mockito.asm.ByteVector byteVector48 = byteVector44.putLong((long) (short) 100);
        byte[] byteArray53 = new byte[] { (byte) 1, (byte) 0, (byte) 0, (byte) -1 };
        org.mockito.asm.ByteVector byteVector56 = byteVector44.putByteArray(byteArray53, 0, 0);
        org.mockito.asm.ByteVector byteVector59 = byteVector29.putByteArray(byteArray53, (int) (byte) 0, (int) (short) 1);
        // The following exception was thrown during execution in test generation
        try {
            org.mockito.asm.ByteVector byteVector62 = byteVector6.putByteArray(byteArray53, (int) ' ', (int) '#');
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteVector2);
        org.junit.Assert.assertNotNull(byteVector4);
        org.junit.Assert.assertNotNull(byteVector6);
        org.junit.Assert.assertNotNull(byteVector8);
        org.junit.Assert.assertNotNull(byteVector10);
        org.junit.Assert.assertNotNull(byteVector12);
        org.junit.Assert.assertNotNull(byteVector15);
        org.junit.Assert.assertNotNull(byteVector17);
        org.junit.Assert.assertNotNull(byteVector19);
        org.junit.Assert.assertNotNull(byteVector21);
        org.junit.Assert.assertNotNull(byteVector23);
        org.junit.Assert.assertNotNull(byteVector25);
        org.junit.Assert.assertNotNull(byteVector27);
        org.junit.Assert.assertNotNull(byteVector29);
        org.junit.Assert.assertNotNull(byteVector32);
        org.junit.Assert.assertNotNull(byteVector34);
        org.junit.Assert.assertNotNull(byteVector36);
        org.junit.Assert.assertNotNull(byteVector38);
        org.junit.Assert.assertNotNull(byteVector40);
        org.junit.Assert.assertNotNull(byteVector42);
        org.junit.Assert.assertNotNull(byteVector44);
        org.junit.Assert.assertNotNull(byteVector46);
        org.junit.Assert.assertNotNull(byteVector48);
        org.junit.Assert.assertNotNull(byteArray53);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray53), "[1, 0, 0, -1]");
        org.junit.Assert.assertNotNull(byteVector56);
        org.junit.Assert.assertNotNull(byteVector59);
    }

    @Test
    public void test0412() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0412");
        org.mockito.asm.ByteVector byteVector1 = new org.mockito.asm.ByteVector((int) (byte) 10);
        org.mockito.asm.ByteVector byteVector3 = byteVector1.putByte((int) '4');
        org.mockito.asm.ByteVector byteVector5 = byteVector1.putLong((long) 'a');
        org.mockito.asm.ByteVector byteVector7 = byteVector1.putUTF8("");
        org.mockito.asm.ByteVector byteVector9 = byteVector1.putUTF8("");
        org.mockito.asm.ByteVector byteVector11 = byteVector9.putShort((int) (short) -1);
        java.lang.Class<?> wildcardClass12 = byteVector9.getClass();
        org.junit.Assert.assertNotNull(byteVector3);
        org.junit.Assert.assertNotNull(byteVector5);
        org.junit.Assert.assertNotNull(byteVector7);
        org.junit.Assert.assertNotNull(byteVector9);
        org.junit.Assert.assertNotNull(byteVector11);
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test0413() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0413");
        org.mockito.asm.ByteVector byteVector1 = new org.mockito.asm.ByteVector((int) (short) 0);
        org.mockito.asm.ByteVector byteVector2 = new org.mockito.asm.ByteVector();
        org.mockito.asm.ByteVector byteVector4 = byteVector2.putUTF8("hi!");
        org.mockito.asm.ByteVector byteVector6 = byteVector2.putInt(0);
        org.mockito.asm.ByteVector byteVector8 = byteVector6.putInt((int) ' ');
        org.mockito.asm.ByteVector byteVector10 = byteVector8.putLong(100L);
        byte[] byteArray14 = new byte[] { (byte) 0, (byte) 10, (byte) 1 };
        org.mockito.asm.ByteVector byteVector17 = byteVector8.putByteArray(byteArray14, 0, 0);
        org.mockito.asm.ByteVector byteVector20 = byteVector1.putByteArray(byteArray14, 1, (int) (short) 0);
        org.mockito.asm.ByteVector byteVector22 = byteVector1.putLong((long) (byte) 100);
        java.lang.Class<?> wildcardClass23 = byteVector22.getClass();
        org.junit.Assert.assertNotNull(byteVector4);
        org.junit.Assert.assertNotNull(byteVector6);
        org.junit.Assert.assertNotNull(byteVector8);
        org.junit.Assert.assertNotNull(byteVector10);
        org.junit.Assert.assertNotNull(byteArray14);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray14), "[0, 10, 1]");
        org.junit.Assert.assertNotNull(byteVector17);
        org.junit.Assert.assertNotNull(byteVector20);
        org.junit.Assert.assertNotNull(byteVector22);
        org.junit.Assert.assertNotNull(wildcardClass23);
    }

    @Test
    public void test0414() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0414");
        org.mockito.asm.ByteVector byteVector1 = new org.mockito.asm.ByteVector((int) '#');
        org.mockito.asm.ByteVector byteVector3 = byteVector1.putInt(100);
        org.mockito.asm.ByteVector byteVector5 = byteVector3.putShort((int) (short) -1);
        org.mockito.asm.ByteVector byteVector7 = byteVector5.putShort((int) (short) 0);
        org.mockito.asm.ByteVector byteVector9 = byteVector7.putShort(0);
        org.mockito.asm.ByteVector byteVector11 = byteVector7.putUTF8("");
        org.junit.Assert.assertNotNull(byteVector3);
        org.junit.Assert.assertNotNull(byteVector5);
        org.junit.Assert.assertNotNull(byteVector7);
        org.junit.Assert.assertNotNull(byteVector9);
        org.junit.Assert.assertNotNull(byteVector11);
    }

    @Test
    public void test0415() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0415");
        org.mockito.asm.ByteVector byteVector0 = new org.mockito.asm.ByteVector();
        org.mockito.asm.ByteVector byteVector2 = byteVector0.putUTF8("hi!");
        org.mockito.asm.ByteVector byteVector4 = byteVector2.putInt(0);
        org.mockito.asm.ByteVector byteVector6 = byteVector4.putShort((int) '4');
        org.mockito.asm.ByteVector byteVector8 = byteVector6.putByte(100);
        org.mockito.asm.ByteVector byteVector10 = byteVector6.putInt((int) (byte) 10);
        org.mockito.asm.ByteVector byteVector12 = byteVector10.putUTF8("");
        org.mockito.asm.ByteVector byteVector14 = byteVector10.putInt((int) '4');
        org.mockito.asm.ByteVector byteVector16 = byteVector10.putLong((long) 100);
        org.junit.Assert.assertNotNull(byteVector2);
        org.junit.Assert.assertNotNull(byteVector4);
        org.junit.Assert.assertNotNull(byteVector6);
        org.junit.Assert.assertNotNull(byteVector8);
        org.junit.Assert.assertNotNull(byteVector10);
        org.junit.Assert.assertNotNull(byteVector12);
        org.junit.Assert.assertNotNull(byteVector14);
        org.junit.Assert.assertNotNull(byteVector16);
    }

    @Test
    public void test0416() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0416");
        org.mockito.asm.ByteVector byteVector0 = new org.mockito.asm.ByteVector();
        org.mockito.asm.ByteVector byteVector2 = byteVector0.putUTF8("hi!");
        org.mockito.asm.ByteVector byteVector4 = byteVector0.putShort((int) (short) 100);
        org.mockito.asm.ByteVector byteVector6 = byteVector4.putUTF8("hi!");
        org.mockito.asm.ByteVector byteVector8 = byteVector6.putByte((int) '4');
        org.mockito.asm.ByteVector byteVector10 = byteVector8.putShort((int) (short) 10);
        org.mockito.asm.ByteVector byteVector12 = byteVector8.putShort(10);
        java.lang.Class<?> wildcardClass13 = byteVector8.getClass();
        org.junit.Assert.assertNotNull(byteVector2);
        org.junit.Assert.assertNotNull(byteVector4);
        org.junit.Assert.assertNotNull(byteVector6);
        org.junit.Assert.assertNotNull(byteVector8);
        org.junit.Assert.assertNotNull(byteVector10);
        org.junit.Assert.assertNotNull(byteVector12);
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test0417() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0417");
        org.mockito.asm.ByteVector byteVector1 = new org.mockito.asm.ByteVector((int) (byte) 1);
        org.mockito.asm.ByteVector byteVector3 = byteVector1.putByte((int) (byte) 10);
        org.mockito.asm.ByteVector byteVector5 = byteVector3.putShort((int) (short) 10);
        org.mockito.asm.ByteVector byteVector7 = byteVector3.putUTF8("");
        java.lang.Class<?> wildcardClass8 = byteVector7.getClass();
        org.junit.Assert.assertNotNull(byteVector3);
        org.junit.Assert.assertNotNull(byteVector5);
        org.junit.Assert.assertNotNull(byteVector7);
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test0418() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0418");
        org.mockito.asm.ByteVector byteVector0 = new org.mockito.asm.ByteVector();
        org.mockito.asm.ByteVector byteVector2 = byteVector0.putUTF8("hi!");
        org.mockito.asm.ByteVector byteVector4 = byteVector0.putShort((int) (short) -1);
        org.mockito.asm.ByteVector byteVector6 = byteVector0.putInt((int) (byte) 10);
        org.mockito.asm.ByteVector byteVector8 = byteVector6.putUTF8("hi!");
        org.mockito.asm.ByteVector byteVector10 = byteVector8.putByte((int) (byte) 1);
        org.mockito.asm.ByteVector byteVector12 = byteVector10.putUTF8("hi!");
        org.mockito.asm.ByteVector byteVector14 = byteVector12.putByte((int) (byte) 10);
        org.mockito.asm.ByteVector byteVector16 = byteVector14.putShort((int) (short) 0);
        org.mockito.asm.ByteVector byteVector17 = new org.mockito.asm.ByteVector();
        org.mockito.asm.ByteVector byteVector19 = byteVector17.putUTF8("hi!");
        org.mockito.asm.ByteVector byteVector21 = byteVector17.putShort((int) (short) -1);
        org.mockito.asm.ByteVector byteVector23 = byteVector17.putInt((int) (byte) 10);
        org.mockito.asm.ByteVector byteVector25 = byteVector23.putUTF8("hi!");
        org.mockito.asm.ByteVector byteVector27 = byteVector25.putByte((int) (byte) 1);
        org.mockito.asm.ByteVector byteVector29 = byteVector27.putUTF8("hi!");
        org.mockito.asm.ByteVector byteVector31 = byteVector29.putByte((int) (byte) 10);
        byte[] byteArray34 = new byte[] { (byte) 10, (byte) 0 };
        org.mockito.asm.ByteVector byteVector37 = byteVector31.putByteArray(byteArray34, 0, (int) (short) 0);
        // The following exception was thrown during execution in test generation
        try {
            org.mockito.asm.ByteVector byteVector40 = byteVector16.putByteArray(byteArray34, 1, (-1));
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteVector2);
        org.junit.Assert.assertNotNull(byteVector4);
        org.junit.Assert.assertNotNull(byteVector6);
        org.junit.Assert.assertNotNull(byteVector8);
        org.junit.Assert.assertNotNull(byteVector10);
        org.junit.Assert.assertNotNull(byteVector12);
        org.junit.Assert.assertNotNull(byteVector14);
        org.junit.Assert.assertNotNull(byteVector16);
        org.junit.Assert.assertNotNull(byteVector19);
        org.junit.Assert.assertNotNull(byteVector21);
        org.junit.Assert.assertNotNull(byteVector23);
        org.junit.Assert.assertNotNull(byteVector25);
        org.junit.Assert.assertNotNull(byteVector27);
        org.junit.Assert.assertNotNull(byteVector29);
        org.junit.Assert.assertNotNull(byteVector31);
        org.junit.Assert.assertNotNull(byteArray34);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray34), "[10, 0]");
        org.junit.Assert.assertNotNull(byteVector37);
    }

    @Test
    public void test0419() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0419");
        org.mockito.asm.ByteVector byteVector0 = new org.mockito.asm.ByteVector();
        org.mockito.asm.ByteVector byteVector2 = byteVector0.putUTF8("hi!");
        org.mockito.asm.ByteVector byteVector4 = byteVector2.putLong((long) (byte) 10);
        org.mockito.asm.ByteVector byteVector6 = byteVector4.putUTF8("hi!");
        org.mockito.asm.ByteVector byteVector8 = byteVector4.putLong((long) (short) -1);
        org.mockito.asm.ByteVector byteVector10 = byteVector8.putInt(10);
        org.mockito.asm.ByteVector byteVector12 = byteVector8.putByte((int) (short) 1);
        org.mockito.asm.ByteVector byteVector14 = byteVector12.putShort((int) (short) 100);
        org.mockito.asm.ByteVector byteVector16 = byteVector14.putUTF8("hi!");
        java.lang.Class<?> wildcardClass17 = byteVector16.getClass();
        org.junit.Assert.assertNotNull(byteVector2);
        org.junit.Assert.assertNotNull(byteVector4);
        org.junit.Assert.assertNotNull(byteVector6);
        org.junit.Assert.assertNotNull(byteVector8);
        org.junit.Assert.assertNotNull(byteVector10);
        org.junit.Assert.assertNotNull(byteVector12);
        org.junit.Assert.assertNotNull(byteVector14);
        org.junit.Assert.assertNotNull(byteVector16);
        org.junit.Assert.assertNotNull(wildcardClass17);
    }

    @Test
    public void test0420() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0420");
        org.mockito.asm.ByteVector byteVector0 = new org.mockito.asm.ByteVector();
        org.mockito.asm.ByteVector byteVector2 = byteVector0.putUTF8("hi!");
        org.mockito.asm.ByteVector byteVector4 = byteVector2.putLong((long) (byte) 10);
        org.mockito.asm.ByteVector byteVector6 = byteVector4.putUTF8("hi!");
        org.mockito.asm.ByteVector byteVector8 = byteVector4.putLong((long) 10);
        org.mockito.asm.ByteVector byteVector10 = byteVector8.putLong(0L);
        org.mockito.asm.ByteVector byteVector12 = byteVector10.putUTF8("hi!");
        org.mockito.asm.ByteVector byteVector14 = byteVector10.putShort(1);
        org.mockito.asm.ByteVector byteVector15 = new org.mockito.asm.ByteVector();
        org.mockito.asm.ByteVector byteVector17 = byteVector15.putUTF8("hi!");
        org.mockito.asm.ByteVector byteVector19 = byteVector15.putInt(0);
        org.mockito.asm.ByteVector byteVector21 = byteVector15.putShort((int) '4');
        org.mockito.asm.ByteVector byteVector23 = byteVector15.putByte(100);
        org.mockito.asm.ByteVector byteVector25 = byteVector23.putInt((int) (byte) 10);
        org.mockito.asm.ByteVector byteVector27 = byteVector23.putInt((int) (byte) 10);
        org.mockito.asm.ByteVector byteVector29 = byteVector27.putByte(100);
        org.mockito.asm.ByteVector byteVector30 = new org.mockito.asm.ByteVector();
        org.mockito.asm.ByteVector byteVector32 = byteVector30.putUTF8("hi!");
        org.mockito.asm.ByteVector byteVector34 = byteVector30.putInt(0);
        org.mockito.asm.ByteVector byteVector36 = byteVector34.putInt((int) ' ');
        org.mockito.asm.ByteVector byteVector38 = byteVector36.putLong(100L);
        byte[] byteArray42 = new byte[] { (byte) 0, (byte) 10, (byte) 1 };
        org.mockito.asm.ByteVector byteVector45 = byteVector36.putByteArray(byteArray42, 0, 0);
        org.mockito.asm.ByteVector byteVector48 = byteVector29.putByteArray(byteArray42, (int) (byte) 1, (int) (byte) 0);
        // The following exception was thrown during execution in test generation
        try {
            org.mockito.asm.ByteVector byteVector51 = byteVector14.putByteArray(byteArray42, 100, (int) '4');
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteVector2);
        org.junit.Assert.assertNotNull(byteVector4);
        org.junit.Assert.assertNotNull(byteVector6);
        org.junit.Assert.assertNotNull(byteVector8);
        org.junit.Assert.assertNotNull(byteVector10);
        org.junit.Assert.assertNotNull(byteVector12);
        org.junit.Assert.assertNotNull(byteVector14);
        org.junit.Assert.assertNotNull(byteVector17);
        org.junit.Assert.assertNotNull(byteVector19);
        org.junit.Assert.assertNotNull(byteVector21);
        org.junit.Assert.assertNotNull(byteVector23);
        org.junit.Assert.assertNotNull(byteVector25);
        org.junit.Assert.assertNotNull(byteVector27);
        org.junit.Assert.assertNotNull(byteVector29);
        org.junit.Assert.assertNotNull(byteVector32);
        org.junit.Assert.assertNotNull(byteVector34);
        org.junit.Assert.assertNotNull(byteVector36);
        org.junit.Assert.assertNotNull(byteVector38);
        org.junit.Assert.assertNotNull(byteArray42);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray42), "[0, 10, 1]");
        org.junit.Assert.assertNotNull(byteVector45);
        org.junit.Assert.assertNotNull(byteVector48);
    }

    @Test
    public void test0421() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0421");
        org.mockito.asm.ByteVector byteVector0 = new org.mockito.asm.ByteVector();
        org.mockito.asm.ByteVector byteVector2 = byteVector0.putUTF8("hi!");
        org.mockito.asm.ByteVector byteVector4 = byteVector0.putShort((int) (short) -1);
        org.mockito.asm.ByteVector byteVector6 = byteVector0.putInt((int) (byte) 10);
        org.mockito.asm.ByteVector byteVector8 = byteVector6.putUTF8("hi!");
        org.mockito.asm.ByteVector byteVector10 = byteVector8.putShort((int) (short) 1);
        org.mockito.asm.ByteVector byteVector12 = byteVector10.putUTF8("hi!");
        java.lang.Class<?> wildcardClass13 = byteVector12.getClass();
        org.junit.Assert.assertNotNull(byteVector2);
        org.junit.Assert.assertNotNull(byteVector4);
        org.junit.Assert.assertNotNull(byteVector6);
        org.junit.Assert.assertNotNull(byteVector8);
        org.junit.Assert.assertNotNull(byteVector10);
        org.junit.Assert.assertNotNull(byteVector12);
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test0422() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0422");
        org.mockito.asm.ByteVector byteVector0 = new org.mockito.asm.ByteVector();
        org.mockito.asm.ByteVector byteVector2 = byteVector0.putUTF8("hi!");
        org.mockito.asm.ByteVector byteVector4 = byteVector2.putInt(0);
        org.mockito.asm.ByteVector byteVector6 = byteVector2.putByte((int) (byte) 10);
        org.mockito.asm.ByteVector byteVector8 = byteVector6.putUTF8("hi!");
        org.mockito.asm.ByteVector byteVector10 = byteVector8.putUTF8("hi!");
        org.mockito.asm.ByteVector byteVector12 = byteVector10.putByte((int) (short) -1);
        org.mockito.asm.ByteVector byteVector14 = byteVector10.putLong((long) 1);
        org.mockito.asm.ByteVector byteVector16 = byteVector10.putLong((long) ' ');
        org.junit.Assert.assertNotNull(byteVector2);
        org.junit.Assert.assertNotNull(byteVector4);
        org.junit.Assert.assertNotNull(byteVector6);
        org.junit.Assert.assertNotNull(byteVector8);
        org.junit.Assert.assertNotNull(byteVector10);
        org.junit.Assert.assertNotNull(byteVector12);
        org.junit.Assert.assertNotNull(byteVector14);
        org.junit.Assert.assertNotNull(byteVector16);
    }

    @Test
    public void test0423() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0423");
        org.mockito.asm.ByteVector byteVector1 = new org.mockito.asm.ByteVector((int) (short) 0);
        org.mockito.asm.ByteVector byteVector3 = byteVector1.putShort((int) (byte) 0);
        java.lang.Class<?> wildcardClass4 = byteVector3.getClass();
        org.junit.Assert.assertNotNull(byteVector3);
        org.junit.Assert.assertNotNull(wildcardClass4);
    }

    @Test
    public void test0424() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0424");
        org.mockito.asm.ByteVector byteVector0 = new org.mockito.asm.ByteVector();
        org.mockito.asm.ByteVector byteVector2 = byteVector0.putUTF8("hi!");
        org.mockito.asm.ByteVector byteVector4 = byteVector0.putByte((int) (byte) 1);
        org.mockito.asm.ByteVector byteVector6 = byteVector0.putLong((long) (short) 1);
        org.mockito.asm.ByteVector byteVector8 = byteVector0.putShort((int) (byte) 100);
        org.mockito.asm.ByteVector byteVector10 = byteVector8.putByte((-1));
        org.junit.Assert.assertNotNull(byteVector2);
        org.junit.Assert.assertNotNull(byteVector4);
        org.junit.Assert.assertNotNull(byteVector6);
        org.junit.Assert.assertNotNull(byteVector8);
        org.junit.Assert.assertNotNull(byteVector10);
    }

    @Test
    public void test0425() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0425");
        org.mockito.asm.ByteVector byteVector0 = new org.mockito.asm.ByteVector();
        org.mockito.asm.ByteVector byteVector2 = byteVector0.putUTF8("hi!");
        org.mockito.asm.ByteVector byteVector4 = byteVector2.putByte(100);
        org.mockito.asm.ByteVector byteVector6 = byteVector2.putShort((int) 'a');
        org.mockito.asm.ByteVector byteVector8 = byteVector6.putShort((int) (short) 0);
        org.mockito.asm.ByteVector byteVector9 = new org.mockito.asm.ByteVector();
        org.mockito.asm.ByteVector byteVector11 = byteVector9.putUTF8("hi!");
        org.mockito.asm.ByteVector byteVector13 = byteVector11.putInt(0);
        org.mockito.asm.ByteVector byteVector15 = byteVector11.putByte((int) (byte) 10);
        org.mockito.asm.ByteVector byteVector17 = byteVector15.putLong((-1L));
        org.mockito.asm.ByteVector byteVector19 = byteVector15.putInt((int) (byte) 100);
        org.mockito.asm.ByteVector byteVector20 = new org.mockito.asm.ByteVector();
        org.mockito.asm.ByteVector byteVector22 = byteVector20.putUTF8("hi!");
        org.mockito.asm.ByteVector byteVector24 = byteVector20.putInt(0);
        org.mockito.asm.ByteVector byteVector26 = byteVector24.putInt((int) ' ');
        org.mockito.asm.ByteVector byteVector28 = byteVector26.putLong(100L);
        byte[] byteArray32 = new byte[] { (byte) 0, (byte) 10, (byte) 1 };
        org.mockito.asm.ByteVector byteVector35 = byteVector26.putByteArray(byteArray32, 0, 0);
        org.mockito.asm.ByteVector byteVector38 = byteVector15.putByteArray(byteArray32, (int) (byte) 1, 0);
        org.mockito.asm.ByteVector byteVector41 = byteVector6.putByteArray(byteArray32, (int) (byte) 1, (int) (short) 1);
        org.mockito.asm.ByteVector byteVector43 = byteVector6.putLong((long) ' ');
        org.mockito.asm.ByteVector byteVector45 = byteVector6.putInt((int) 'a');
        org.junit.Assert.assertNotNull(byteVector2);
        org.junit.Assert.assertNotNull(byteVector4);
        org.junit.Assert.assertNotNull(byteVector6);
        org.junit.Assert.assertNotNull(byteVector8);
        org.junit.Assert.assertNotNull(byteVector11);
        org.junit.Assert.assertNotNull(byteVector13);
        org.junit.Assert.assertNotNull(byteVector15);
        org.junit.Assert.assertNotNull(byteVector17);
        org.junit.Assert.assertNotNull(byteVector19);
        org.junit.Assert.assertNotNull(byteVector22);
        org.junit.Assert.assertNotNull(byteVector24);
        org.junit.Assert.assertNotNull(byteVector26);
        org.junit.Assert.assertNotNull(byteVector28);
        org.junit.Assert.assertNotNull(byteArray32);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray32), "[0, 10, 1]");
        org.junit.Assert.assertNotNull(byteVector35);
        org.junit.Assert.assertNotNull(byteVector38);
        org.junit.Assert.assertNotNull(byteVector41);
        org.junit.Assert.assertNotNull(byteVector43);
        org.junit.Assert.assertNotNull(byteVector45);
    }

    @Test
    public void test0426() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0426");
        org.mockito.asm.ByteVector byteVector0 = new org.mockito.asm.ByteVector();
        org.mockito.asm.ByteVector byteVector2 = byteVector0.putUTF8("hi!");
        org.mockito.asm.ByteVector byteVector4 = byteVector0.putLong((long) ' ');
        org.mockito.asm.ByteVector byteVector6 = byteVector4.putByte((int) 'a');
        org.mockito.asm.ByteVector byteVector8 = byteVector4.putByte((int) (short) -1);
        org.mockito.asm.ByteVector byteVector10 = byteVector4.putLong(0L);
        org.mockito.asm.ByteVector byteVector12 = byteVector4.putUTF8("");
        org.mockito.asm.ByteVector byteVector14 = byteVector4.putInt((int) (byte) 10);
        org.mockito.asm.ByteVector byteVector16 = byteVector4.putInt((int) (short) -1);
        java.lang.Class<?> wildcardClass17 = byteVector16.getClass();
        org.junit.Assert.assertNotNull(byteVector2);
        org.junit.Assert.assertNotNull(byteVector4);
        org.junit.Assert.assertNotNull(byteVector6);
        org.junit.Assert.assertNotNull(byteVector8);
        org.junit.Assert.assertNotNull(byteVector10);
        org.junit.Assert.assertNotNull(byteVector12);
        org.junit.Assert.assertNotNull(byteVector14);
        org.junit.Assert.assertNotNull(byteVector16);
        org.junit.Assert.assertNotNull(wildcardClass17);
    }

    @Test
    public void test0427() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0427");
        org.mockito.asm.ByteVector byteVector0 = new org.mockito.asm.ByteVector();
        org.mockito.asm.ByteVector byteVector2 = byteVector0.putUTF8("hi!");
        org.mockito.asm.ByteVector byteVector4 = byteVector0.putLong((long) ' ');
        org.mockito.asm.ByteVector byteVector6 = byteVector4.putByte((int) 'a');
        org.mockito.asm.ByteVector byteVector8 = byteVector4.putByte((int) (short) -1);
        org.mockito.asm.ByteVector byteVector10 = byteVector4.putLong(0L);
        org.mockito.asm.ByteVector byteVector12 = byteVector10.putByte(0);
        org.mockito.asm.ByteVector byteVector14 = byteVector12.putLong(1L);
        org.mockito.asm.ByteVector byteVector16 = byteVector14.putShort((int) 'a');
        org.mockito.asm.ByteVector byteVector18 = byteVector14.putLong((long) 10);
        org.mockito.asm.ByteVector byteVector20 = byteVector14.putUTF8("hi!");
        org.mockito.asm.ByteVector byteVector21 = new org.mockito.asm.ByteVector();
        org.mockito.asm.ByteVector byteVector23 = byteVector21.putUTF8("hi!");
        org.mockito.asm.ByteVector byteVector25 = byteVector21.putLong((long) ' ');
        org.mockito.asm.ByteVector byteVector27 = byteVector25.putByte((int) 'a');
        org.mockito.asm.ByteVector byteVector29 = byteVector25.putByte((int) (short) -1);
        org.mockito.asm.ByteVector byteVector31 = byteVector25.putLong(0L);
        org.mockito.asm.ByteVector byteVector33 = byteVector25.putUTF8("hi!");
        org.mockito.asm.ByteVector byteVector35 = byteVector33.putUTF8("");
        org.mockito.asm.ByteVector byteVector37 = byteVector33.putInt((int) (byte) 10);
        org.mockito.asm.ByteVector byteVector39 = byteVector37.putLong((long) (short) -1);
        org.mockito.asm.ByteVector byteVector41 = byteVector37.putByte(0);
        org.mockito.asm.ByteVector byteVector42 = new org.mockito.asm.ByteVector();
        org.mockito.asm.ByteVector byteVector44 = byteVector42.putUTF8("hi!");
        org.mockito.asm.ByteVector byteVector46 = byteVector44.putInt(0);
        org.mockito.asm.ByteVector byteVector48 = byteVector44.putByte((int) (byte) 10);
        org.mockito.asm.ByteVector byteVector50 = byteVector48.putLong((-1L));
        org.mockito.asm.ByteVector byteVector52 = byteVector48.putInt((int) (byte) 100);
        org.mockito.asm.ByteVector byteVector53 = new org.mockito.asm.ByteVector();
        org.mockito.asm.ByteVector byteVector55 = byteVector53.putUTF8("hi!");
        org.mockito.asm.ByteVector byteVector57 = byteVector53.putInt(0);
        org.mockito.asm.ByteVector byteVector59 = byteVector57.putInt((int) ' ');
        org.mockito.asm.ByteVector byteVector61 = byteVector59.putLong(100L);
        byte[] byteArray65 = new byte[] { (byte) 0, (byte) 10, (byte) 1 };
        org.mockito.asm.ByteVector byteVector68 = byteVector59.putByteArray(byteArray65, 0, 0);
        org.mockito.asm.ByteVector byteVector71 = byteVector48.putByteArray(byteArray65, (int) (byte) 1, 0);
        org.mockito.asm.ByteVector byteVector74 = byteVector41.putByteArray(byteArray65, 1, 0);
        // The following exception was thrown during execution in test generation
        try {
            org.mockito.asm.ByteVector byteVector77 = byteVector20.putByteArray(byteArray65, (int) (byte) 0, 10);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteVector2);
        org.junit.Assert.assertNotNull(byteVector4);
        org.junit.Assert.assertNotNull(byteVector6);
        org.junit.Assert.assertNotNull(byteVector8);
        org.junit.Assert.assertNotNull(byteVector10);
        org.junit.Assert.assertNotNull(byteVector12);
        org.junit.Assert.assertNotNull(byteVector14);
        org.junit.Assert.assertNotNull(byteVector16);
        org.junit.Assert.assertNotNull(byteVector18);
        org.junit.Assert.assertNotNull(byteVector20);
        org.junit.Assert.assertNotNull(byteVector23);
        org.junit.Assert.assertNotNull(byteVector25);
        org.junit.Assert.assertNotNull(byteVector27);
        org.junit.Assert.assertNotNull(byteVector29);
        org.junit.Assert.assertNotNull(byteVector31);
        org.junit.Assert.assertNotNull(byteVector33);
        org.junit.Assert.assertNotNull(byteVector35);
        org.junit.Assert.assertNotNull(byteVector37);
        org.junit.Assert.assertNotNull(byteVector39);
        org.junit.Assert.assertNotNull(byteVector41);
        org.junit.Assert.assertNotNull(byteVector44);
        org.junit.Assert.assertNotNull(byteVector46);
        org.junit.Assert.assertNotNull(byteVector48);
        org.junit.Assert.assertNotNull(byteVector50);
        org.junit.Assert.assertNotNull(byteVector52);
        org.junit.Assert.assertNotNull(byteVector55);
        org.junit.Assert.assertNotNull(byteVector57);
        org.junit.Assert.assertNotNull(byteVector59);
        org.junit.Assert.assertNotNull(byteVector61);
        org.junit.Assert.assertNotNull(byteArray65);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray65), "[0, 10, 1]");
        org.junit.Assert.assertNotNull(byteVector68);
        org.junit.Assert.assertNotNull(byteVector71);
        org.junit.Assert.assertNotNull(byteVector74);
    }

    @Test
    public void test0428() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0428");
        org.mockito.asm.ByteVector byteVector0 = new org.mockito.asm.ByteVector();
        org.mockito.asm.ByteVector byteVector2 = byteVector0.putUTF8("hi!");
        org.mockito.asm.ByteVector byteVector4 = byteVector2.putLong((long) (byte) 10);
        org.mockito.asm.ByteVector byteVector6 = byteVector4.putUTF8("hi!");
        org.mockito.asm.ByteVector byteVector8 = byteVector4.putLong((-1L));
        org.mockito.asm.ByteVector byteVector10 = byteVector8.putInt(10);
        org.mockito.asm.ByteVector byteVector12 = byteVector10.putShort((int) '#');
        org.mockito.asm.ByteVector byteVector14 = byteVector10.putLong((long) (byte) -1);
        org.mockito.asm.ByteVector byteVector16 = byteVector10.putLong((long) '4');
        java.lang.Class<?> wildcardClass17 = byteVector10.getClass();
        org.junit.Assert.assertNotNull(byteVector2);
        org.junit.Assert.assertNotNull(byteVector4);
        org.junit.Assert.assertNotNull(byteVector6);
        org.junit.Assert.assertNotNull(byteVector8);
        org.junit.Assert.assertNotNull(byteVector10);
        org.junit.Assert.assertNotNull(byteVector12);
        org.junit.Assert.assertNotNull(byteVector14);
        org.junit.Assert.assertNotNull(byteVector16);
        org.junit.Assert.assertNotNull(wildcardClass17);
    }

    @Test
    public void test0429() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0429");
        org.mockito.asm.ByteVector byteVector0 = new org.mockito.asm.ByteVector();
        org.mockito.asm.ByteVector byteVector2 = byteVector0.putUTF8("hi!");
        org.mockito.asm.ByteVector byteVector4 = byteVector0.putLong((long) ' ');
        org.mockito.asm.ByteVector byteVector6 = byteVector4.putByte((int) 'a');
        org.mockito.asm.ByteVector byteVector8 = byteVector4.putByte((int) (short) -1);
        org.mockito.asm.ByteVector byteVector10 = byteVector4.putLong(0L);
        org.mockito.asm.ByteVector byteVector12 = byteVector10.putByte(0);
        org.mockito.asm.ByteVector byteVector14 = byteVector12.putByte(100);
        org.mockito.asm.ByteVector byteVector16 = byteVector12.putInt((-1));
        org.mockito.asm.ByteVector byteVector17 = new org.mockito.asm.ByteVector();
        org.mockito.asm.ByteVector byteVector19 = byteVector17.putUTF8("hi!");
        org.mockito.asm.ByteVector byteVector21 = byteVector17.putLong((long) ' ');
        org.mockito.asm.ByteVector byteVector23 = byteVector21.putByte((int) 'a');
        org.mockito.asm.ByteVector byteVector25 = byteVector21.putByte((int) (short) -1);
        org.mockito.asm.ByteVector byteVector27 = byteVector21.putLong(0L);
        org.mockito.asm.ByteVector byteVector29 = byteVector21.putUTF8("hi!");
        org.mockito.asm.ByteVector byteVector31 = byteVector29.putUTF8("");
        org.mockito.asm.ByteVector byteVector33 = byteVector31.putLong((long) (byte) 10);
        org.mockito.asm.ByteVector byteVector35 = byteVector31.putLong((long) (short) 100);
        byte[] byteArray40 = new byte[] { (byte) 1, (byte) 0, (byte) 0, (byte) -1 };
        org.mockito.asm.ByteVector byteVector43 = byteVector31.putByteArray(byteArray40, 0, 0);
        // The following exception was thrown during execution in test generation
        try {
            org.mockito.asm.ByteVector byteVector46 = byteVector16.putByteArray(byteArray40, (int) (byte) 0, (int) (byte) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteVector2);
        org.junit.Assert.assertNotNull(byteVector4);
        org.junit.Assert.assertNotNull(byteVector6);
        org.junit.Assert.assertNotNull(byteVector8);
        org.junit.Assert.assertNotNull(byteVector10);
        org.junit.Assert.assertNotNull(byteVector12);
        org.junit.Assert.assertNotNull(byteVector14);
        org.junit.Assert.assertNotNull(byteVector16);
        org.junit.Assert.assertNotNull(byteVector19);
        org.junit.Assert.assertNotNull(byteVector21);
        org.junit.Assert.assertNotNull(byteVector23);
        org.junit.Assert.assertNotNull(byteVector25);
        org.junit.Assert.assertNotNull(byteVector27);
        org.junit.Assert.assertNotNull(byteVector29);
        org.junit.Assert.assertNotNull(byteVector31);
        org.junit.Assert.assertNotNull(byteVector33);
        org.junit.Assert.assertNotNull(byteVector35);
        org.junit.Assert.assertNotNull(byteArray40);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray40), "[1, 0, 0, -1]");
        org.junit.Assert.assertNotNull(byteVector43);
    }

    @Test
    public void test0430() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0430");
        org.mockito.asm.ByteVector byteVector0 = new org.mockito.asm.ByteVector();
        org.mockito.asm.ByteVector byteVector2 = byteVector0.putUTF8("hi!");
        org.mockito.asm.ByteVector byteVector4 = byteVector2.putLong((long) (byte) 10);
        org.mockito.asm.ByteVector byteVector6 = byteVector4.putUTF8("hi!");
        org.mockito.asm.ByteVector byteVector8 = byteVector4.putInt((int) (byte) 100);
        org.mockito.asm.ByteVector byteVector10 = byteVector4.putByte((int) (byte) 10);
        org.junit.Assert.assertNotNull(byteVector2);
        org.junit.Assert.assertNotNull(byteVector4);
        org.junit.Assert.assertNotNull(byteVector6);
        org.junit.Assert.assertNotNull(byteVector8);
        org.junit.Assert.assertNotNull(byteVector10);
    }

    @Test
    public void test0431() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0431");
        org.mockito.asm.ByteVector byteVector0 = new org.mockito.asm.ByteVector();
        org.mockito.asm.ByteVector byteVector2 = byteVector0.putUTF8("hi!");
        org.mockito.asm.ByteVector byteVector4 = byteVector0.putInt(0);
        org.mockito.asm.ByteVector byteVector6 = byteVector0.putShort((int) '4');
        org.mockito.asm.ByteVector byteVector8 = byteVector0.putByte(100);
        org.mockito.asm.ByteVector byteVector10 = byteVector8.putInt((int) (byte) 10);
        org.mockito.asm.ByteVector byteVector12 = byteVector8.putShort((int) (short) 100);
        org.mockito.asm.ByteVector byteVector14 = byteVector8.putInt((int) '#');
        org.mockito.asm.ByteVector byteVector16 = byteVector14.putUTF8("hi!");
        org.mockito.asm.ByteVector byteVector18 = byteVector14.putInt(0);
        org.junit.Assert.assertNotNull(byteVector2);
        org.junit.Assert.assertNotNull(byteVector4);
        org.junit.Assert.assertNotNull(byteVector6);
        org.junit.Assert.assertNotNull(byteVector8);
        org.junit.Assert.assertNotNull(byteVector10);
        org.junit.Assert.assertNotNull(byteVector12);
        org.junit.Assert.assertNotNull(byteVector14);
        org.junit.Assert.assertNotNull(byteVector16);
        org.junit.Assert.assertNotNull(byteVector18);
    }

    @Test
    public void test0432() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0432");
        org.mockito.asm.ByteVector byteVector0 = new org.mockito.asm.ByteVector();
        org.mockito.asm.ByteVector byteVector2 = byteVector0.putUTF8("hi!");
        org.mockito.asm.ByteVector byteVector4 = byteVector0.putShort((int) (short) -1);
        org.mockito.asm.ByteVector byteVector6 = byteVector0.putByte((int) ' ');
        org.mockito.asm.ByteVector byteVector8 = byteVector0.putUTF8("hi!");
        org.mockito.asm.ByteVector byteVector10 = byteVector0.putLong((-1L));
        org.junit.Assert.assertNotNull(byteVector2);
        org.junit.Assert.assertNotNull(byteVector4);
        org.junit.Assert.assertNotNull(byteVector6);
        org.junit.Assert.assertNotNull(byteVector8);
        org.junit.Assert.assertNotNull(byteVector10);
    }

    @Test
    public void test0433() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0433");
        org.mockito.asm.ByteVector byteVector0 = new org.mockito.asm.ByteVector();
        org.mockito.asm.ByteVector byteVector2 = byteVector0.putUTF8("hi!");
        org.mockito.asm.ByteVector byteVector4 = byteVector2.putInt(0);
        org.mockito.asm.ByteVector byteVector6 = byteVector4.putByte((int) (byte) 1);
        org.mockito.asm.ByteVector byteVector8 = byteVector4.putByte(0);
        org.mockito.asm.ByteVector byteVector10 = byteVector8.putLong((long) (byte) 1);
        org.mockito.asm.ByteVector byteVector12 = byteVector10.putShort((int) '#');
        org.mockito.asm.ByteVector byteVector13 = new org.mockito.asm.ByteVector();
        org.mockito.asm.ByteVector byteVector15 = byteVector13.putUTF8("hi!");
        org.mockito.asm.ByteVector byteVector17 = byteVector13.putLong((long) ' ');
        org.mockito.asm.ByteVector byteVector19 = byteVector17.putByte((int) 'a');
        org.mockito.asm.ByteVector byteVector21 = byteVector17.putByte((int) (short) -1);
        org.mockito.asm.ByteVector byteVector23 = byteVector17.putLong(0L);
        org.mockito.asm.ByteVector byteVector25 = byteVector23.putInt((int) (short) -1);
        org.mockito.asm.ByteVector byteVector27 = byteVector25.putByte(100);
        org.mockito.asm.ByteVector byteVector29 = byteVector27.putUTF8("hi!");
        org.mockito.asm.ByteVector byteVector31 = byteVector27.putLong((long) (short) 0);
        org.mockito.asm.ByteVector byteVector32 = new org.mockito.asm.ByteVector();
        org.mockito.asm.ByteVector byteVector34 = byteVector32.putUTF8("hi!");
        org.mockito.asm.ByteVector byteVector36 = byteVector32.putLong((long) ' ');
        org.mockito.asm.ByteVector byteVector38 = byteVector36.putByte((int) 'a');
        org.mockito.asm.ByteVector byteVector40 = byteVector36.putByte((int) (short) -1);
        org.mockito.asm.ByteVector byteVector42 = byteVector36.putLong(0L);
        org.mockito.asm.ByteVector byteVector44 = byteVector36.putUTF8("hi!");
        org.mockito.asm.ByteVector byteVector46 = byteVector44.putUTF8("");
        org.mockito.asm.ByteVector byteVector48 = byteVector44.putInt((int) (byte) 10);
        org.mockito.asm.ByteVector byteVector50 = byteVector44.putByte(0);
        org.mockito.asm.ByteVector byteVector51 = new org.mockito.asm.ByteVector();
        org.mockito.asm.ByteVector byteVector53 = byteVector51.putUTF8("hi!");
        org.mockito.asm.ByteVector byteVector55 = byteVector51.putInt(0);
        org.mockito.asm.ByteVector byteVector57 = byteVector55.putInt((int) ' ');
        org.mockito.asm.ByteVector byteVector59 = byteVector57.putLong(100L);
        byte[] byteArray63 = new byte[] { (byte) 0, (byte) 10, (byte) 1 };
        org.mockito.asm.ByteVector byteVector66 = byteVector57.putByteArray(byteArray63, 0, 0);
        org.mockito.asm.ByteVector byteVector69 = byteVector50.putByteArray(byteArray63, (int) (short) 1, 0);
        org.mockito.asm.ByteVector byteVector72 = byteVector31.putByteArray(byteArray63, (int) (byte) 0, (int) (byte) 1);
        // The following exception was thrown during execution in test generation
        try {
            org.mockito.asm.ByteVector byteVector75 = byteVector10.putByteArray(byteArray63, (int) '4', 0);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteVector2);
        org.junit.Assert.assertNotNull(byteVector4);
        org.junit.Assert.assertNotNull(byteVector6);
        org.junit.Assert.assertNotNull(byteVector8);
        org.junit.Assert.assertNotNull(byteVector10);
        org.junit.Assert.assertNotNull(byteVector12);
        org.junit.Assert.assertNotNull(byteVector15);
        org.junit.Assert.assertNotNull(byteVector17);
        org.junit.Assert.assertNotNull(byteVector19);
        org.junit.Assert.assertNotNull(byteVector21);
        org.junit.Assert.assertNotNull(byteVector23);
        org.junit.Assert.assertNotNull(byteVector25);
        org.junit.Assert.assertNotNull(byteVector27);
        org.junit.Assert.assertNotNull(byteVector29);
        org.junit.Assert.assertNotNull(byteVector31);
        org.junit.Assert.assertNotNull(byteVector34);
        org.junit.Assert.assertNotNull(byteVector36);
        org.junit.Assert.assertNotNull(byteVector38);
        org.junit.Assert.assertNotNull(byteVector40);
        org.junit.Assert.assertNotNull(byteVector42);
        org.junit.Assert.assertNotNull(byteVector44);
        org.junit.Assert.assertNotNull(byteVector46);
        org.junit.Assert.assertNotNull(byteVector48);
        org.junit.Assert.assertNotNull(byteVector50);
        org.junit.Assert.assertNotNull(byteVector53);
        org.junit.Assert.assertNotNull(byteVector55);
        org.junit.Assert.assertNotNull(byteVector57);
        org.junit.Assert.assertNotNull(byteVector59);
        org.junit.Assert.assertNotNull(byteArray63);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray63), "[0, 10, 1]");
        org.junit.Assert.assertNotNull(byteVector66);
        org.junit.Assert.assertNotNull(byteVector69);
        org.junit.Assert.assertNotNull(byteVector72);
    }

    @Test
    public void test0434() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0434");
        org.mockito.asm.ByteVector byteVector0 = new org.mockito.asm.ByteVector();
        org.mockito.asm.ByteVector byteVector2 = byteVector0.putUTF8("hi!");
        org.mockito.asm.ByteVector byteVector4 = byteVector0.putInt(0);
        org.mockito.asm.ByteVector byteVector6 = byteVector0.putShort(10);
        org.mockito.asm.ByteVector byteVector8 = byteVector0.putLong((long) (short) 1);
        org.mockito.asm.ByteVector byteVector10 = byteVector8.putByte(0);
        org.mockito.asm.ByteVector byteVector12 = byteVector8.putByte((int) (short) 0);
        org.junit.Assert.assertNotNull(byteVector2);
        org.junit.Assert.assertNotNull(byteVector4);
        org.junit.Assert.assertNotNull(byteVector6);
        org.junit.Assert.assertNotNull(byteVector8);
        org.junit.Assert.assertNotNull(byteVector10);
        org.junit.Assert.assertNotNull(byteVector12);
    }

    @Test
    public void test0435() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0435");
        org.mockito.asm.ByteVector byteVector0 = new org.mockito.asm.ByteVector();
        org.mockito.asm.ByteVector byteVector2 = byteVector0.putUTF8("hi!");
        org.mockito.asm.ByteVector byteVector4 = byteVector0.putLong((long) ' ');
        org.mockito.asm.ByteVector byteVector6 = byteVector4.putByte((int) 'a');
        org.mockito.asm.ByteVector byteVector8 = byteVector4.putByte((int) (short) -1);
        org.mockito.asm.ByteVector byteVector10 = byteVector4.putLong(0L);
        org.mockito.asm.ByteVector byteVector12 = byteVector10.putByte(0);
        org.mockito.asm.ByteVector byteVector14 = byteVector12.putLong(1L);
        org.mockito.asm.ByteVector byteVector16 = byteVector14.putShort((int) 'a');
        org.mockito.asm.ByteVector byteVector18 = byteVector14.putLong((long) 10);
        org.mockito.asm.ByteVector byteVector20 = byteVector14.putUTF8("");
        org.mockito.asm.ByteVector byteVector22 = byteVector20.putByte((int) '#');
        java.lang.Class<?> wildcardClass23 = byteVector20.getClass();
        org.junit.Assert.assertNotNull(byteVector2);
        org.junit.Assert.assertNotNull(byteVector4);
        org.junit.Assert.assertNotNull(byteVector6);
        org.junit.Assert.assertNotNull(byteVector8);
        org.junit.Assert.assertNotNull(byteVector10);
        org.junit.Assert.assertNotNull(byteVector12);
        org.junit.Assert.assertNotNull(byteVector14);
        org.junit.Assert.assertNotNull(byteVector16);
        org.junit.Assert.assertNotNull(byteVector18);
        org.junit.Assert.assertNotNull(byteVector20);
        org.junit.Assert.assertNotNull(byteVector22);
        org.junit.Assert.assertNotNull(wildcardClass23);
    }

    @Test
    public void test0436() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0436");
        org.mockito.asm.ByteVector byteVector0 = new org.mockito.asm.ByteVector();
        org.mockito.asm.ByteVector byteVector2 = byteVector0.putUTF8("hi!");
        org.mockito.asm.ByteVector byteVector4 = byteVector0.putShort((int) (short) -1);
        org.mockito.asm.ByteVector byteVector6 = byteVector0.putLong(0L);
        org.mockito.asm.ByteVector byteVector8 = byteVector0.putShort((int) (byte) -1);
        org.mockito.asm.ByteVector byteVector10 = byteVector8.putByte((int) (byte) 0);
        org.mockito.asm.ByteVector byteVector12 = byteVector10.putUTF8("hi!");
        org.mockito.asm.ByteVector byteVector14 = byteVector10.putUTF8("hi!");
        org.junit.Assert.assertNotNull(byteVector2);
        org.junit.Assert.assertNotNull(byteVector4);
        org.junit.Assert.assertNotNull(byteVector6);
        org.junit.Assert.assertNotNull(byteVector8);
        org.junit.Assert.assertNotNull(byteVector10);
        org.junit.Assert.assertNotNull(byteVector12);
        org.junit.Assert.assertNotNull(byteVector14);
    }

    @Test
    public void test0437() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0437");
        org.mockito.asm.ByteVector byteVector0 = new org.mockito.asm.ByteVector();
        org.mockito.asm.ByteVector byteVector2 = byteVector0.putUTF8("hi!");
        org.mockito.asm.ByteVector byteVector4 = byteVector2.putInt((int) (byte) 10);
        org.mockito.asm.ByteVector byteVector6 = byteVector4.putUTF8("");
        org.mockito.asm.ByteVector byteVector8 = byteVector4.putLong((long) '#');
        org.mockito.asm.ByteVector byteVector9 = new org.mockito.asm.ByteVector();
        org.mockito.asm.ByteVector byteVector11 = byteVector9.putUTF8("hi!");
        org.mockito.asm.ByteVector byteVector13 = byteVector9.putLong((long) ' ');
        org.mockito.asm.ByteVector byteVector15 = byteVector13.putByte((int) 'a');
        org.mockito.asm.ByteVector byteVector17 = byteVector13.putByte((int) (short) -1);
        org.mockito.asm.ByteVector byteVector19 = byteVector13.putLong(0L);
        org.mockito.asm.ByteVector byteVector21 = byteVector13.putUTF8("hi!");
        org.mockito.asm.ByteVector byteVector23 = byteVector21.putUTF8("");
        org.mockito.asm.ByteVector byteVector25 = byteVector23.putLong((long) (byte) 10);
        org.mockito.asm.ByteVector byteVector27 = byteVector23.putLong((long) (short) 100);
        byte[] byteArray32 = new byte[] { (byte) 1, (byte) 0, (byte) 0, (byte) -1 };
        org.mockito.asm.ByteVector byteVector35 = byteVector23.putByteArray(byteArray32, 0, 0);
        // The following exception was thrown during execution in test generation
        try {
            org.mockito.asm.ByteVector byteVector38 = byteVector4.putByteArray(byteArray32, (int) (byte) -1, (int) '#');
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteVector2);
        org.junit.Assert.assertNotNull(byteVector4);
        org.junit.Assert.assertNotNull(byteVector6);
        org.junit.Assert.assertNotNull(byteVector8);
        org.junit.Assert.assertNotNull(byteVector11);
        org.junit.Assert.assertNotNull(byteVector13);
        org.junit.Assert.assertNotNull(byteVector15);
        org.junit.Assert.assertNotNull(byteVector17);
        org.junit.Assert.assertNotNull(byteVector19);
        org.junit.Assert.assertNotNull(byteVector21);
        org.junit.Assert.assertNotNull(byteVector23);
        org.junit.Assert.assertNotNull(byteVector25);
        org.junit.Assert.assertNotNull(byteVector27);
        org.junit.Assert.assertNotNull(byteArray32);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray32), "[1, 0, 0, -1]");
        org.junit.Assert.assertNotNull(byteVector35);
    }

    @Test
    public void test0438() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0438");
        org.mockito.asm.ByteVector byteVector1 = new org.mockito.asm.ByteVector((int) '#');
        org.mockito.asm.ByteVector byteVector3 = byteVector1.putInt(100);
        org.mockito.asm.ByteVector byteVector5 = byteVector1.putInt((int) (byte) 1);
        java.lang.Class<?> wildcardClass6 = byteVector5.getClass();
        org.junit.Assert.assertNotNull(byteVector3);
        org.junit.Assert.assertNotNull(byteVector5);
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void test0439() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0439");
        org.mockito.asm.ByteVector byteVector0 = new org.mockito.asm.ByteVector();
        org.mockito.asm.ByteVector byteVector2 = byteVector0.putUTF8("hi!");
        org.mockito.asm.ByteVector byteVector4 = byteVector2.putInt((int) (byte) 10);
        org.mockito.asm.ByteVector byteVector6 = byteVector4.putUTF8("");
        org.mockito.asm.ByteVector byteVector8 = byteVector6.putUTF8("hi!");
        org.mockito.asm.ByteVector byteVector10 = byteVector6.putInt((int) '#');
        org.mockito.asm.ByteVector byteVector12 = byteVector10.putInt((int) (short) 0);
        org.mockito.asm.ByteVector byteVector14 = byteVector10.putShort((int) (short) 10);
        org.mockito.asm.ByteVector byteVector16 = byteVector14.putUTF8("");
        org.mockito.asm.ByteVector byteVector18 = byteVector16.putLong((-1L));
        org.junit.Assert.assertNotNull(byteVector2);
        org.junit.Assert.assertNotNull(byteVector4);
        org.junit.Assert.assertNotNull(byteVector6);
        org.junit.Assert.assertNotNull(byteVector8);
        org.junit.Assert.assertNotNull(byteVector10);
        org.junit.Assert.assertNotNull(byteVector12);
        org.junit.Assert.assertNotNull(byteVector14);
        org.junit.Assert.assertNotNull(byteVector16);
        org.junit.Assert.assertNotNull(byteVector18);
    }

    @Test
    public void test0440() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0440");
        org.mockito.asm.ByteVector byteVector0 = new org.mockito.asm.ByteVector();
        org.mockito.asm.ByteVector byteVector2 = byteVector0.putUTF8("hi!");
        org.mockito.asm.ByteVector byteVector4 = byteVector2.putInt((int) (byte) 10);
        org.mockito.asm.ByteVector byteVector6 = byteVector4.putUTF8("");
        org.mockito.asm.ByteVector byteVector8 = byteVector6.putUTF8("hi!");
        org.mockito.asm.ByteVector byteVector10 = byteVector6.putShort(0);
        org.mockito.asm.ByteVector byteVector12 = byteVector6.putInt((-1));
        org.mockito.asm.ByteVector byteVector14 = byteVector12.putLong((long) (byte) -1);
        org.mockito.asm.ByteVector byteVector16 = byteVector14.putLong((long) ' ');
        org.mockito.asm.ByteVector byteVector17 = new org.mockito.asm.ByteVector();
        org.mockito.asm.ByteVector byteVector19 = byteVector17.putUTF8("hi!");
        org.mockito.asm.ByteVector byteVector21 = byteVector19.putByte(100);
        org.mockito.asm.ByteVector byteVector23 = byteVector19.putShort((int) 'a');
        org.mockito.asm.ByteVector byteVector25 = byteVector23.putShort((int) (short) 0);
        org.mockito.asm.ByteVector byteVector26 = new org.mockito.asm.ByteVector();
        org.mockito.asm.ByteVector byteVector28 = byteVector26.putUTF8("hi!");
        org.mockito.asm.ByteVector byteVector30 = byteVector28.putInt(0);
        org.mockito.asm.ByteVector byteVector32 = byteVector28.putByte((int) (byte) 10);
        org.mockito.asm.ByteVector byteVector34 = byteVector32.putLong((-1L));
        org.mockito.asm.ByteVector byteVector36 = byteVector32.putInt((int) (byte) 100);
        org.mockito.asm.ByteVector byteVector37 = new org.mockito.asm.ByteVector();
        org.mockito.asm.ByteVector byteVector39 = byteVector37.putUTF8("hi!");
        org.mockito.asm.ByteVector byteVector41 = byteVector37.putInt(0);
        org.mockito.asm.ByteVector byteVector43 = byteVector41.putInt((int) ' ');
        org.mockito.asm.ByteVector byteVector45 = byteVector43.putLong(100L);
        byte[] byteArray49 = new byte[] { (byte) 0, (byte) 10, (byte) 1 };
        org.mockito.asm.ByteVector byteVector52 = byteVector43.putByteArray(byteArray49, 0, 0);
        org.mockito.asm.ByteVector byteVector55 = byteVector32.putByteArray(byteArray49, (int) (byte) 1, 0);
        org.mockito.asm.ByteVector byteVector58 = byteVector23.putByteArray(byteArray49, (int) (byte) 1, (int) (short) 1);
        // The following exception was thrown during execution in test generation
        try {
            org.mockito.asm.ByteVector byteVector61 = byteVector16.putByteArray(byteArray49, (int) (short) 100, (int) (short) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteVector2);
        org.junit.Assert.assertNotNull(byteVector4);
        org.junit.Assert.assertNotNull(byteVector6);
        org.junit.Assert.assertNotNull(byteVector8);
        org.junit.Assert.assertNotNull(byteVector10);
        org.junit.Assert.assertNotNull(byteVector12);
        org.junit.Assert.assertNotNull(byteVector14);
        org.junit.Assert.assertNotNull(byteVector16);
        org.junit.Assert.assertNotNull(byteVector19);
        org.junit.Assert.assertNotNull(byteVector21);
        org.junit.Assert.assertNotNull(byteVector23);
        org.junit.Assert.assertNotNull(byteVector25);
        org.junit.Assert.assertNotNull(byteVector28);
        org.junit.Assert.assertNotNull(byteVector30);
        org.junit.Assert.assertNotNull(byteVector32);
        org.junit.Assert.assertNotNull(byteVector34);
        org.junit.Assert.assertNotNull(byteVector36);
        org.junit.Assert.assertNotNull(byteVector39);
        org.junit.Assert.assertNotNull(byteVector41);
        org.junit.Assert.assertNotNull(byteVector43);
        org.junit.Assert.assertNotNull(byteVector45);
        org.junit.Assert.assertNotNull(byteArray49);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray49), "[0, 10, 1]");
        org.junit.Assert.assertNotNull(byteVector52);
        org.junit.Assert.assertNotNull(byteVector55);
        org.junit.Assert.assertNotNull(byteVector58);
    }

    @Test
    public void test0441() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0441");
        org.mockito.asm.ByteVector byteVector0 = new org.mockito.asm.ByteVector();
        org.mockito.asm.ByteVector byteVector2 = byteVector0.putUTF8("hi!");
        org.mockito.asm.ByteVector byteVector4 = byteVector2.putInt(0);
        org.mockito.asm.ByteVector byteVector6 = byteVector4.putByte((int) (byte) 1);
        org.mockito.asm.ByteVector byteVector8 = byteVector6.putShort((int) '4');
        org.mockito.asm.ByteVector byteVector10 = byteVector6.putShort(10);
        org.mockito.asm.ByteVector byteVector12 = byteVector10.putInt((int) (short) 1);
        org.mockito.asm.ByteVector byteVector13 = new org.mockito.asm.ByteVector();
        org.mockito.asm.ByteVector byteVector15 = byteVector13.putUTF8("hi!");
        org.mockito.asm.ByteVector byteVector17 = byteVector15.putInt(0);
        org.mockito.asm.ByteVector byteVector19 = byteVector15.putByte((int) (byte) 10);
        org.mockito.asm.ByteVector byteVector21 = byteVector19.putLong((-1L));
        org.mockito.asm.ByteVector byteVector23 = byteVector19.putInt((int) (byte) 100);
        org.mockito.asm.ByteVector byteVector24 = new org.mockito.asm.ByteVector();
        org.mockito.asm.ByteVector byteVector26 = byteVector24.putUTF8("hi!");
        org.mockito.asm.ByteVector byteVector28 = byteVector24.putInt(0);
        org.mockito.asm.ByteVector byteVector30 = byteVector28.putInt((int) ' ');
        org.mockito.asm.ByteVector byteVector32 = byteVector30.putLong(100L);
        byte[] byteArray36 = new byte[] { (byte) 0, (byte) 10, (byte) 1 };
        org.mockito.asm.ByteVector byteVector39 = byteVector30.putByteArray(byteArray36, 0, 0);
        org.mockito.asm.ByteVector byteVector42 = byteVector19.putByteArray(byteArray36, (int) (byte) 1, 0);
        // The following exception was thrown during execution in test generation
        try {
            org.mockito.asm.ByteVector byteVector45 = byteVector12.putByteArray(byteArray36, (-1), (int) (byte) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteVector2);
        org.junit.Assert.assertNotNull(byteVector4);
        org.junit.Assert.assertNotNull(byteVector6);
        org.junit.Assert.assertNotNull(byteVector8);
        org.junit.Assert.assertNotNull(byteVector10);
        org.junit.Assert.assertNotNull(byteVector12);
        org.junit.Assert.assertNotNull(byteVector15);
        org.junit.Assert.assertNotNull(byteVector17);
        org.junit.Assert.assertNotNull(byteVector19);
        org.junit.Assert.assertNotNull(byteVector21);
        org.junit.Assert.assertNotNull(byteVector23);
        org.junit.Assert.assertNotNull(byteVector26);
        org.junit.Assert.assertNotNull(byteVector28);
        org.junit.Assert.assertNotNull(byteVector30);
        org.junit.Assert.assertNotNull(byteVector32);
        org.junit.Assert.assertNotNull(byteArray36);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray36), "[0, 10, 1]");
        org.junit.Assert.assertNotNull(byteVector39);
        org.junit.Assert.assertNotNull(byteVector42);
    }

    @Test
    public void test0442() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0442");
        org.mockito.asm.ByteVector byteVector0 = new org.mockito.asm.ByteVector();
        org.mockito.asm.ByteVector byteVector2 = byteVector0.putUTF8("hi!");
        org.mockito.asm.ByteVector byteVector4 = byteVector2.putInt(0);
        org.mockito.asm.ByteVector byteVector6 = byteVector2.putByte((int) (byte) 10);
        org.mockito.asm.ByteVector byteVector8 = byteVector6.putLong((-1L));
        org.mockito.asm.ByteVector byteVector10 = byteVector6.putInt((int) (byte) 100);
        org.mockito.asm.ByteVector byteVector11 = new org.mockito.asm.ByteVector();
        org.mockito.asm.ByteVector byteVector13 = byteVector11.putUTF8("hi!");
        org.mockito.asm.ByteVector byteVector15 = byteVector11.putLong((long) ' ');
        org.mockito.asm.ByteVector byteVector17 = byteVector15.putByte((int) 'a');
        org.mockito.asm.ByteVector byteVector19 = byteVector15.putByte((int) (short) -1);
        org.mockito.asm.ByteVector byteVector21 = byteVector15.putLong(0L);
        org.mockito.asm.ByteVector byteVector23 = byteVector21.putInt((int) (short) -1);
        org.mockito.asm.ByteVector byteVector25 = byteVector23.putByte(100);
        org.mockito.asm.ByteVector byteVector27 = byteVector25.putUTF8("hi!");
        org.mockito.asm.ByteVector byteVector29 = byteVector25.putLong((long) (short) 0);
        org.mockito.asm.ByteVector byteVector30 = new org.mockito.asm.ByteVector();
        org.mockito.asm.ByteVector byteVector32 = byteVector30.putUTF8("hi!");
        org.mockito.asm.ByteVector byteVector34 = byteVector30.putLong((long) ' ');
        org.mockito.asm.ByteVector byteVector36 = byteVector34.putByte((int) 'a');
        org.mockito.asm.ByteVector byteVector38 = byteVector34.putByte((int) (short) -1);
        org.mockito.asm.ByteVector byteVector40 = byteVector34.putLong(0L);
        org.mockito.asm.ByteVector byteVector42 = byteVector34.putUTF8("hi!");
        org.mockito.asm.ByteVector byteVector44 = byteVector42.putUTF8("");
        org.mockito.asm.ByteVector byteVector46 = byteVector42.putInt((int) (byte) 10);
        org.mockito.asm.ByteVector byteVector48 = byteVector42.putByte(0);
        org.mockito.asm.ByteVector byteVector49 = new org.mockito.asm.ByteVector();
        org.mockito.asm.ByteVector byteVector51 = byteVector49.putUTF8("hi!");
        org.mockito.asm.ByteVector byteVector53 = byteVector49.putInt(0);
        org.mockito.asm.ByteVector byteVector55 = byteVector53.putInt((int) ' ');
        org.mockito.asm.ByteVector byteVector57 = byteVector55.putLong(100L);
        byte[] byteArray61 = new byte[] { (byte) 0, (byte) 10, (byte) 1 };
        org.mockito.asm.ByteVector byteVector64 = byteVector55.putByteArray(byteArray61, 0, 0);
        org.mockito.asm.ByteVector byteVector67 = byteVector48.putByteArray(byteArray61, (int) (short) 1, 0);
        org.mockito.asm.ByteVector byteVector70 = byteVector29.putByteArray(byteArray61, (int) (byte) 0, (int) (byte) 1);
        // The following exception was thrown during execution in test generation
        try {
            org.mockito.asm.ByteVector byteVector73 = byteVector10.putByteArray(byteArray61, (int) (short) -1, (int) (byte) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteVector2);
        org.junit.Assert.assertNotNull(byteVector4);
        org.junit.Assert.assertNotNull(byteVector6);
        org.junit.Assert.assertNotNull(byteVector8);
        org.junit.Assert.assertNotNull(byteVector10);
        org.junit.Assert.assertNotNull(byteVector13);
        org.junit.Assert.assertNotNull(byteVector15);
        org.junit.Assert.assertNotNull(byteVector17);
        org.junit.Assert.assertNotNull(byteVector19);
        org.junit.Assert.assertNotNull(byteVector21);
        org.junit.Assert.assertNotNull(byteVector23);
        org.junit.Assert.assertNotNull(byteVector25);
        org.junit.Assert.assertNotNull(byteVector27);
        org.junit.Assert.assertNotNull(byteVector29);
        org.junit.Assert.assertNotNull(byteVector32);
        org.junit.Assert.assertNotNull(byteVector34);
        org.junit.Assert.assertNotNull(byteVector36);
        org.junit.Assert.assertNotNull(byteVector38);
        org.junit.Assert.assertNotNull(byteVector40);
        org.junit.Assert.assertNotNull(byteVector42);
        org.junit.Assert.assertNotNull(byteVector44);
        org.junit.Assert.assertNotNull(byteVector46);
        org.junit.Assert.assertNotNull(byteVector48);
        org.junit.Assert.assertNotNull(byteVector51);
        org.junit.Assert.assertNotNull(byteVector53);
        org.junit.Assert.assertNotNull(byteVector55);
        org.junit.Assert.assertNotNull(byteVector57);
        org.junit.Assert.assertNotNull(byteArray61);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray61), "[0, 10, 1]");
        org.junit.Assert.assertNotNull(byteVector64);
        org.junit.Assert.assertNotNull(byteVector67);
        org.junit.Assert.assertNotNull(byteVector70);
    }

    @Test
    public void test0443() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0443");
        org.mockito.asm.ByteVector byteVector0 = new org.mockito.asm.ByteVector();
        org.mockito.asm.ByteVector byteVector2 = byteVector0.putUTF8("hi!");
        org.mockito.asm.ByteVector byteVector4 = byteVector0.putInt(0);
        org.mockito.asm.ByteVector byteVector6 = byteVector4.putInt((int) ' ');
        org.mockito.asm.ByteVector byteVector8 = byteVector6.putLong((long) (short) 10);
        org.mockito.asm.ByteVector byteVector10 = byteVector6.putInt((int) '4');
        org.mockito.asm.ByteVector byteVector12 = byteVector6.putShort((int) (short) 100);
        org.mockito.asm.ByteVector byteVector14 = byteVector12.putByte((int) (short) 100);
        java.lang.Class<?> wildcardClass15 = byteVector14.getClass();
        org.junit.Assert.assertNotNull(byteVector2);
        org.junit.Assert.assertNotNull(byteVector4);
        org.junit.Assert.assertNotNull(byteVector6);
        org.junit.Assert.assertNotNull(byteVector8);
        org.junit.Assert.assertNotNull(byteVector10);
        org.junit.Assert.assertNotNull(byteVector12);
        org.junit.Assert.assertNotNull(byteVector14);
        org.junit.Assert.assertNotNull(wildcardClass15);
    }

    @Test
    public void test0444() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0444");
        org.mockito.asm.ByteVector byteVector0 = new org.mockito.asm.ByteVector();
        org.mockito.asm.ByteVector byteVector2 = byteVector0.putUTF8("hi!");
        org.mockito.asm.ByteVector byteVector4 = byteVector0.putLong((long) ' ');
        org.mockito.asm.ByteVector byteVector6 = byteVector4.putByte((int) 'a');
        org.mockito.asm.ByteVector byteVector8 = byteVector6.putInt((int) (short) 1);
        org.mockito.asm.ByteVector byteVector10 = byteVector6.putByte((int) (byte) -1);
        org.mockito.asm.ByteVector byteVector12 = byteVector6.putInt((int) (byte) -1);
        org.mockito.asm.ByteVector byteVector14 = byteVector12.putByte((int) (byte) 1);
        java.lang.Class<?> wildcardClass15 = byteVector12.getClass();
        org.junit.Assert.assertNotNull(byteVector2);
        org.junit.Assert.assertNotNull(byteVector4);
        org.junit.Assert.assertNotNull(byteVector6);
        org.junit.Assert.assertNotNull(byteVector8);
        org.junit.Assert.assertNotNull(byteVector10);
        org.junit.Assert.assertNotNull(byteVector12);
        org.junit.Assert.assertNotNull(byteVector14);
        org.junit.Assert.assertNotNull(wildcardClass15);
    }

    @Test
    public void test0445() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0445");
        org.mockito.asm.ByteVector byteVector0 = new org.mockito.asm.ByteVector();
        org.mockito.asm.ByteVector byteVector2 = byteVector0.putUTF8("hi!");
        org.mockito.asm.ByteVector byteVector4 = byteVector0.putInt(0);
        org.mockito.asm.ByteVector byteVector6 = byteVector0.putShort((int) '4');
        org.mockito.asm.ByteVector byteVector8 = byteVector0.putByte(100);
        org.mockito.asm.ByteVector byteVector10 = byteVector8.putInt((int) (byte) 10);
        org.mockito.asm.ByteVector byteVector12 = byteVector10.putByte((int) (byte) 1);
        org.mockito.asm.ByteVector byteVector14 = byteVector10.putShort((int) (short) 0);
        org.mockito.asm.ByteVector byteVector16 = byteVector10.putUTF8("hi!");
        org.junit.Assert.assertNotNull(byteVector2);
        org.junit.Assert.assertNotNull(byteVector4);
        org.junit.Assert.assertNotNull(byteVector6);
        org.junit.Assert.assertNotNull(byteVector8);
        org.junit.Assert.assertNotNull(byteVector10);
        org.junit.Assert.assertNotNull(byteVector12);
        org.junit.Assert.assertNotNull(byteVector14);
        org.junit.Assert.assertNotNull(byteVector16);
    }

    @Test
    public void test0446() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0446");
        org.mockito.asm.ByteVector byteVector0 = new org.mockito.asm.ByteVector();
        org.mockito.asm.ByteVector byteVector2 = byteVector0.putUTF8("hi!");
        org.mockito.asm.ByteVector byteVector4 = byteVector0.putLong((long) ' ');
        org.mockito.asm.ByteVector byteVector6 = byteVector4.putByte((int) 'a');
        org.mockito.asm.ByteVector byteVector8 = byteVector4.putByte((int) (short) -1);
        org.mockito.asm.ByteVector byteVector10 = byteVector4.putLong(0L);
        org.mockito.asm.ByteVector byteVector12 = byteVector4.putUTF8("hi!");
        org.mockito.asm.ByteVector byteVector14 = byteVector12.putUTF8("hi!");
        org.mockito.asm.ByteVector byteVector16 = byteVector12.putByte((int) (byte) -1);
        org.mockito.asm.ByteVector byteVector18 = byteVector12.putLong((long) (-1));
        org.mockito.asm.ByteVector byteVector20 = byteVector12.putInt(100);
        java.lang.Class<?> wildcardClass21 = byteVector20.getClass();
        org.junit.Assert.assertNotNull(byteVector2);
        org.junit.Assert.assertNotNull(byteVector4);
        org.junit.Assert.assertNotNull(byteVector6);
        org.junit.Assert.assertNotNull(byteVector8);
        org.junit.Assert.assertNotNull(byteVector10);
        org.junit.Assert.assertNotNull(byteVector12);
        org.junit.Assert.assertNotNull(byteVector14);
        org.junit.Assert.assertNotNull(byteVector16);
        org.junit.Assert.assertNotNull(byteVector18);
        org.junit.Assert.assertNotNull(byteVector20);
        org.junit.Assert.assertNotNull(wildcardClass21);
    }

    @Test
    public void test0447() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0447");
        org.mockito.asm.ByteVector byteVector0 = new org.mockito.asm.ByteVector();
        org.mockito.asm.ByteVector byteVector2 = byteVector0.putUTF8("hi!");
        org.mockito.asm.ByteVector byteVector4 = byteVector0.putShort((int) (short) -1);
        org.mockito.asm.ByteVector byteVector6 = byteVector0.putInt((int) (byte) 10);
        org.mockito.asm.ByteVector byteVector8 = byteVector0.putLong((long) (byte) 0);
        org.mockito.asm.ByteVector byteVector10 = byteVector0.putLong((long) (byte) 100);
        java.lang.Class<?> wildcardClass11 = byteVector0.getClass();
        org.junit.Assert.assertNotNull(byteVector2);
        org.junit.Assert.assertNotNull(byteVector4);
        org.junit.Assert.assertNotNull(byteVector6);
        org.junit.Assert.assertNotNull(byteVector8);
        org.junit.Assert.assertNotNull(byteVector10);
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test0448() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0448");
        org.mockito.asm.ByteVector byteVector0 = new org.mockito.asm.ByteVector();
        org.mockito.asm.ByteVector byteVector2 = byteVector0.putUTF8("hi!");
        org.mockito.asm.ByteVector byteVector4 = byteVector2.putInt(0);
        org.mockito.asm.ByteVector byteVector6 = byteVector2.putByte((int) (byte) 10);
        org.mockito.asm.ByteVector byteVector8 = byteVector6.putUTF8("hi!");
        org.mockito.asm.ByteVector byteVector10 = byteVector8.putUTF8("hi!");
        org.mockito.asm.ByteVector byteVector12 = byteVector8.putUTF8("hi!");
        org.mockito.asm.ByteVector byteVector14 = new org.mockito.asm.ByteVector((int) '#');
        org.mockito.asm.ByteVector byteVector16 = byteVector14.putInt(100);
        org.mockito.asm.ByteVector byteVector18 = byteVector16.putShort((int) (short) -1);
        org.mockito.asm.ByteVector byteVector20 = byteVector18.putShort((int) (short) 0);
        org.mockito.asm.ByteVector byteVector22 = byteVector18.putUTF8("");
        org.mockito.asm.ByteVector byteVector23 = new org.mockito.asm.ByteVector();
        org.mockito.asm.ByteVector byteVector25 = byteVector23.putUTF8("hi!");
        org.mockito.asm.ByteVector byteVector27 = byteVector23.putLong((long) ' ');
        org.mockito.asm.ByteVector byteVector29 = byteVector27.putByte((int) 'a');
        org.mockito.asm.ByteVector byteVector31 = byteVector27.putByte((int) (short) -1);
        org.mockito.asm.ByteVector byteVector33 = byteVector27.putLong(0L);
        org.mockito.asm.ByteVector byteVector35 = byteVector27.putUTF8("hi!");
        org.mockito.asm.ByteVector byteVector37 = byteVector35.putUTF8("");
        org.mockito.asm.ByteVector byteVector39 = byteVector35.putInt((int) (byte) 10);
        org.mockito.asm.ByteVector byteVector41 = byteVector35.putByte(0);
        org.mockito.asm.ByteVector byteVector42 = new org.mockito.asm.ByteVector();
        org.mockito.asm.ByteVector byteVector44 = byteVector42.putUTF8("hi!");
        org.mockito.asm.ByteVector byteVector46 = byteVector42.putInt(0);
        org.mockito.asm.ByteVector byteVector48 = byteVector46.putInt((int) ' ');
        org.mockito.asm.ByteVector byteVector50 = byteVector48.putLong(100L);
        byte[] byteArray54 = new byte[] { (byte) 0, (byte) 10, (byte) 1 };
        org.mockito.asm.ByteVector byteVector57 = byteVector48.putByteArray(byteArray54, 0, 0);
        org.mockito.asm.ByteVector byteVector60 = byteVector41.putByteArray(byteArray54, (int) (short) 1, 0);
        org.mockito.asm.ByteVector byteVector63 = byteVector18.putByteArray(byteArray54, 1, 1);
        // The following exception was thrown during execution in test generation
        try {
            org.mockito.asm.ByteVector byteVector66 = byteVector12.putByteArray(byteArray54, (int) 'a', (int) (byte) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteVector2);
        org.junit.Assert.assertNotNull(byteVector4);
        org.junit.Assert.assertNotNull(byteVector6);
        org.junit.Assert.assertNotNull(byteVector8);
        org.junit.Assert.assertNotNull(byteVector10);
        org.junit.Assert.assertNotNull(byteVector12);
        org.junit.Assert.assertNotNull(byteVector16);
        org.junit.Assert.assertNotNull(byteVector18);
        org.junit.Assert.assertNotNull(byteVector20);
        org.junit.Assert.assertNotNull(byteVector22);
        org.junit.Assert.assertNotNull(byteVector25);
        org.junit.Assert.assertNotNull(byteVector27);
        org.junit.Assert.assertNotNull(byteVector29);
        org.junit.Assert.assertNotNull(byteVector31);
        org.junit.Assert.assertNotNull(byteVector33);
        org.junit.Assert.assertNotNull(byteVector35);
        org.junit.Assert.assertNotNull(byteVector37);
        org.junit.Assert.assertNotNull(byteVector39);
        org.junit.Assert.assertNotNull(byteVector41);
        org.junit.Assert.assertNotNull(byteVector44);
        org.junit.Assert.assertNotNull(byteVector46);
        org.junit.Assert.assertNotNull(byteVector48);
        org.junit.Assert.assertNotNull(byteVector50);
        org.junit.Assert.assertNotNull(byteArray54);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray54), "[0, 10, 1]");
        org.junit.Assert.assertNotNull(byteVector57);
        org.junit.Assert.assertNotNull(byteVector60);
        org.junit.Assert.assertNotNull(byteVector63);
    }

    @Test
    public void test0449() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0449");
        org.mockito.asm.ByteVector byteVector0 = new org.mockito.asm.ByteVector();
        org.mockito.asm.ByteVector byteVector2 = byteVector0.putUTF8("hi!");
        org.mockito.asm.ByteVector byteVector4 = byteVector0.putLong((long) ' ');
        org.mockito.asm.ByteVector byteVector6 = byteVector4.putInt((int) (short) 100);
        org.mockito.asm.ByteVector byteVector8 = byteVector6.putShort((int) (byte) 1);
        org.mockito.asm.ByteVector byteVector10 = byteVector8.putShort((int) ' ');
        org.junit.Assert.assertNotNull(byteVector2);
        org.junit.Assert.assertNotNull(byteVector4);
        org.junit.Assert.assertNotNull(byteVector6);
        org.junit.Assert.assertNotNull(byteVector8);
        org.junit.Assert.assertNotNull(byteVector10);
    }

    @Test
    public void test0450() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0450");
        org.mockito.asm.ByteVector byteVector0 = new org.mockito.asm.ByteVector();
        org.mockito.asm.ByteVector byteVector2 = byteVector0.putUTF8("hi!");
        org.mockito.asm.ByteVector byteVector4 = byteVector0.putLong((long) ' ');
        org.mockito.asm.ByteVector byteVector6 = byteVector4.putByte((int) 'a');
        org.mockito.asm.ByteVector byteVector8 = byteVector6.putInt((int) (short) 1);
        org.mockito.asm.ByteVector byteVector10 = byteVector6.putByte(0);
        org.mockito.asm.ByteVector byteVector12 = byteVector10.putShort(1);
        org.junit.Assert.assertNotNull(byteVector2);
        org.junit.Assert.assertNotNull(byteVector4);
        org.junit.Assert.assertNotNull(byteVector6);
        org.junit.Assert.assertNotNull(byteVector8);
        org.junit.Assert.assertNotNull(byteVector10);
        org.junit.Assert.assertNotNull(byteVector12);
    }

    @Test
    public void test0451() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0451");
        org.mockito.asm.ByteVector byteVector0 = new org.mockito.asm.ByteVector();
        org.mockito.asm.ByteVector byteVector2 = byteVector0.putUTF8("hi!");
        org.mockito.asm.ByteVector byteVector4 = byteVector0.putLong((long) ' ');
        org.mockito.asm.ByteVector byteVector6 = byteVector4.putByte((int) 'a');
        org.mockito.asm.ByteVector byteVector8 = byteVector4.putByte((int) (short) -1);
        org.mockito.asm.ByteVector byteVector10 = byteVector4.putLong(0L);
        org.mockito.asm.ByteVector byteVector12 = byteVector10.putByte(0);
        org.mockito.asm.ByteVector byteVector14 = byteVector12.putLong(1L);
        org.mockito.asm.ByteVector byteVector16 = byteVector14.putShort((int) 'a');
        org.mockito.asm.ByteVector byteVector18 = byteVector14.putLong((long) 10);
        org.mockito.asm.ByteVector byteVector20 = byteVector18.putShort((int) (short) -1);
        org.mockito.asm.ByteVector byteVector21 = new org.mockito.asm.ByteVector();
        org.mockito.asm.ByteVector byteVector23 = byteVector21.putUTF8("hi!");
        org.mockito.asm.ByteVector byteVector25 = byteVector21.putLong((long) ' ');
        org.mockito.asm.ByteVector byteVector27 = byteVector25.putByte((int) 'a');
        org.mockito.asm.ByteVector byteVector29 = byteVector25.putByte((int) (short) -1);
        org.mockito.asm.ByteVector byteVector31 = byteVector25.putLong(0L);
        org.mockito.asm.ByteVector byteVector33 = byteVector31.putByte(0);
        org.mockito.asm.ByteVector byteVector35 = byteVector33.putLong(1L);
        org.mockito.asm.ByteVector byteVector37 = byteVector35.putShort((int) 'a');
        org.mockito.asm.ByteVector byteVector39 = byteVector35.putLong((long) 10);
        org.mockito.asm.ByteVector byteVector41 = byteVector35.putUTF8("");
        org.mockito.asm.ByteVector byteVector42 = new org.mockito.asm.ByteVector();
        org.mockito.asm.ByteVector byteVector44 = byteVector42.putUTF8("hi!");
        org.mockito.asm.ByteVector byteVector46 = byteVector44.putLong((long) (byte) 10);
        org.mockito.asm.ByteVector byteVector48 = byteVector46.putUTF8("hi!");
        org.mockito.asm.ByteVector byteVector50 = byteVector46.putLong((long) (short) -1);
        org.mockito.asm.ByteVector byteVector52 = byteVector50.putInt(10);
        org.mockito.asm.ByteVector byteVector54 = byteVector50.putByte((int) (short) 1);
        org.mockito.asm.ByteVector byteVector56 = byteVector50.putInt((int) (short) -1);
        org.mockito.asm.ByteVector byteVector58 = byteVector50.putUTF8("hi!");
        org.mockito.asm.ByteVector byteVector59 = new org.mockito.asm.ByteVector();
        org.mockito.asm.ByteVector byteVector61 = byteVector59.putUTF8("hi!");
        org.mockito.asm.ByteVector byteVector63 = byteVector59.putLong((long) ' ');
        org.mockito.asm.ByteVector byteVector65 = byteVector63.putByte((int) 'a');
        org.mockito.asm.ByteVector byteVector67 = byteVector63.putByte((int) (short) -1);
        org.mockito.asm.ByteVector byteVector69 = byteVector63.putLong(0L);
        org.mockito.asm.ByteVector byteVector71 = byteVector63.putUTF8("hi!");
        org.mockito.asm.ByteVector byteVector73 = byteVector71.putUTF8("");
        org.mockito.asm.ByteVector byteVector75 = byteVector73.putLong((long) (byte) 10);
        org.mockito.asm.ByteVector byteVector77 = byteVector73.putLong((long) (short) 100);
        byte[] byteArray82 = new byte[] { (byte) 1, (byte) 0, (byte) 0, (byte) -1 };
        org.mockito.asm.ByteVector byteVector85 = byteVector73.putByteArray(byteArray82, 0, 0);
        org.mockito.asm.ByteVector byteVector88 = byteVector58.putByteArray(byteArray82, (int) (byte) 0, (int) (short) 1);
        org.mockito.asm.ByteVector byteVector91 = byteVector35.putByteArray(byteArray82, (int) (short) 0, (int) (short) 0);
        // The following exception was thrown during execution in test generation
        try {
            org.mockito.asm.ByteVector byteVector94 = byteVector18.putByteArray(byteArray82, (int) 'a', (int) (short) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteVector2);
        org.junit.Assert.assertNotNull(byteVector4);
        org.junit.Assert.assertNotNull(byteVector6);
        org.junit.Assert.assertNotNull(byteVector8);
        org.junit.Assert.assertNotNull(byteVector10);
        org.junit.Assert.assertNotNull(byteVector12);
        org.junit.Assert.assertNotNull(byteVector14);
        org.junit.Assert.assertNotNull(byteVector16);
        org.junit.Assert.assertNotNull(byteVector18);
        org.junit.Assert.assertNotNull(byteVector20);
        org.junit.Assert.assertNotNull(byteVector23);
        org.junit.Assert.assertNotNull(byteVector25);
        org.junit.Assert.assertNotNull(byteVector27);
        org.junit.Assert.assertNotNull(byteVector29);
        org.junit.Assert.assertNotNull(byteVector31);
        org.junit.Assert.assertNotNull(byteVector33);
        org.junit.Assert.assertNotNull(byteVector35);
        org.junit.Assert.assertNotNull(byteVector37);
        org.junit.Assert.assertNotNull(byteVector39);
        org.junit.Assert.assertNotNull(byteVector41);
        org.junit.Assert.assertNotNull(byteVector44);
        org.junit.Assert.assertNotNull(byteVector46);
        org.junit.Assert.assertNotNull(byteVector48);
        org.junit.Assert.assertNotNull(byteVector50);
        org.junit.Assert.assertNotNull(byteVector52);
        org.junit.Assert.assertNotNull(byteVector54);
        org.junit.Assert.assertNotNull(byteVector56);
        org.junit.Assert.assertNotNull(byteVector58);
        org.junit.Assert.assertNotNull(byteVector61);
        org.junit.Assert.assertNotNull(byteVector63);
        org.junit.Assert.assertNotNull(byteVector65);
        org.junit.Assert.assertNotNull(byteVector67);
        org.junit.Assert.assertNotNull(byteVector69);
        org.junit.Assert.assertNotNull(byteVector71);
        org.junit.Assert.assertNotNull(byteVector73);
        org.junit.Assert.assertNotNull(byteVector75);
        org.junit.Assert.assertNotNull(byteVector77);
        org.junit.Assert.assertNotNull(byteArray82);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray82), "[1, 0, 0, -1]");
        org.junit.Assert.assertNotNull(byteVector85);
        org.junit.Assert.assertNotNull(byteVector88);
        org.junit.Assert.assertNotNull(byteVector91);
    }

    @Test
    public void test0452() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0452");
        org.mockito.asm.ByteVector byteVector0 = new org.mockito.asm.ByteVector();
        org.mockito.asm.ByteVector byteVector2 = byteVector0.putUTF8("hi!");
        org.mockito.asm.ByteVector byteVector4 = byteVector2.putLong((long) (byte) 10);
        org.mockito.asm.ByteVector byteVector6 = byteVector4.putUTF8("hi!");
        org.mockito.asm.ByteVector byteVector8 = byteVector4.putLong((-1L));
        org.mockito.asm.ByteVector byteVector10 = byteVector8.putInt(10);
        org.mockito.asm.ByteVector byteVector12 = byteVector10.putShort((int) '#');
        org.mockito.asm.ByteVector byteVector14 = byteVector10.putInt((int) (byte) 10);
        java.lang.Class<?> wildcardClass15 = byteVector10.getClass();
        org.junit.Assert.assertNotNull(byteVector2);
        org.junit.Assert.assertNotNull(byteVector4);
        org.junit.Assert.assertNotNull(byteVector6);
        org.junit.Assert.assertNotNull(byteVector8);
        org.junit.Assert.assertNotNull(byteVector10);
        org.junit.Assert.assertNotNull(byteVector12);
        org.junit.Assert.assertNotNull(byteVector14);
        org.junit.Assert.assertNotNull(wildcardClass15);
    }

    @Test
    public void test0453() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0453");
        org.mockito.asm.ByteVector byteVector0 = new org.mockito.asm.ByteVector();
        org.mockito.asm.ByteVector byteVector2 = byteVector0.putUTF8("hi!");
        org.mockito.asm.ByteVector byteVector4 = byteVector2.putLong((long) (byte) 10);
        org.mockito.asm.ByteVector byteVector6 = byteVector4.putUTF8("hi!");
        org.mockito.asm.ByteVector byteVector8 = byteVector4.putLong((-1L));
        org.mockito.asm.ByteVector byteVector10 = byteVector8.putInt(10);
        org.mockito.asm.ByteVector byteVector12 = byteVector10.putShort((int) '#');
        org.mockito.asm.ByteVector byteVector14 = byteVector12.putShort((int) (short) -1);
        java.lang.Class<?> wildcardClass15 = byteVector14.getClass();
        org.junit.Assert.assertNotNull(byteVector2);
        org.junit.Assert.assertNotNull(byteVector4);
        org.junit.Assert.assertNotNull(byteVector6);
        org.junit.Assert.assertNotNull(byteVector8);
        org.junit.Assert.assertNotNull(byteVector10);
        org.junit.Assert.assertNotNull(byteVector12);
        org.junit.Assert.assertNotNull(byteVector14);
        org.junit.Assert.assertNotNull(wildcardClass15);
    }

    @Test
    public void test0454() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0454");
        org.mockito.asm.ByteVector byteVector0 = new org.mockito.asm.ByteVector();
        org.mockito.asm.ByteVector byteVector2 = byteVector0.putUTF8("hi!");
        org.mockito.asm.ByteVector byteVector4 = byteVector0.putLong((long) ' ');
        org.mockito.asm.ByteVector byteVector6 = byteVector4.putByte((int) 'a');
        org.mockito.asm.ByteVector byteVector8 = byteVector4.putByte((int) (short) -1);
        org.mockito.asm.ByteVector byteVector10 = byteVector4.putLong(0L);
        org.mockito.asm.ByteVector byteVector12 = byteVector10.putByte(0);
        org.mockito.asm.ByteVector byteVector14 = byteVector12.putLong(1L);
        org.mockito.asm.ByteVector byteVector16 = byteVector14.putShort((int) 'a');
        org.mockito.asm.ByteVector byteVector18 = byteVector14.putLong((long) 10);
        org.mockito.asm.ByteVector byteVector20 = byteVector14.putUTF8("");
        org.mockito.asm.ByteVector byteVector21 = new org.mockito.asm.ByteVector();
        org.mockito.asm.ByteVector byteVector23 = byteVector21.putUTF8("hi!");
        org.mockito.asm.ByteVector byteVector25 = byteVector23.putLong((long) (byte) 10);
        org.mockito.asm.ByteVector byteVector27 = byteVector25.putUTF8("hi!");
        org.mockito.asm.ByteVector byteVector29 = byteVector25.putLong((long) (short) -1);
        org.mockito.asm.ByteVector byteVector31 = byteVector29.putInt(10);
        org.mockito.asm.ByteVector byteVector33 = byteVector29.putByte((int) (short) 1);
        org.mockito.asm.ByteVector byteVector35 = byteVector29.putInt((int) (short) -1);
        org.mockito.asm.ByteVector byteVector37 = byteVector29.putUTF8("hi!");
        org.mockito.asm.ByteVector byteVector38 = new org.mockito.asm.ByteVector();
        org.mockito.asm.ByteVector byteVector40 = byteVector38.putUTF8("hi!");
        org.mockito.asm.ByteVector byteVector42 = byteVector38.putLong((long) ' ');
        org.mockito.asm.ByteVector byteVector44 = byteVector42.putByte((int) 'a');
        org.mockito.asm.ByteVector byteVector46 = byteVector42.putByte((int) (short) -1);
        org.mockito.asm.ByteVector byteVector48 = byteVector42.putLong(0L);
        org.mockito.asm.ByteVector byteVector50 = byteVector42.putUTF8("hi!");
        org.mockito.asm.ByteVector byteVector52 = byteVector50.putUTF8("");
        org.mockito.asm.ByteVector byteVector54 = byteVector52.putLong((long) (byte) 10);
        org.mockito.asm.ByteVector byteVector56 = byteVector52.putLong((long) (short) 100);
        byte[] byteArray61 = new byte[] { (byte) 1, (byte) 0, (byte) 0, (byte) -1 };
        org.mockito.asm.ByteVector byteVector64 = byteVector52.putByteArray(byteArray61, 0, 0);
        org.mockito.asm.ByteVector byteVector67 = byteVector37.putByteArray(byteArray61, (int) (byte) 0, (int) (short) 1);
        org.mockito.asm.ByteVector byteVector70 = byteVector14.putByteArray(byteArray61, (int) (short) 0, (int) (short) 0);
        org.mockito.asm.ByteVector byteVector72 = byteVector70.putLong((long) (byte) -1);
        java.lang.Class<?> wildcardClass73 = byteVector70.getClass();
        org.junit.Assert.assertNotNull(byteVector2);
        org.junit.Assert.assertNotNull(byteVector4);
        org.junit.Assert.assertNotNull(byteVector6);
        org.junit.Assert.assertNotNull(byteVector8);
        org.junit.Assert.assertNotNull(byteVector10);
        org.junit.Assert.assertNotNull(byteVector12);
        org.junit.Assert.assertNotNull(byteVector14);
        org.junit.Assert.assertNotNull(byteVector16);
        org.junit.Assert.assertNotNull(byteVector18);
        org.junit.Assert.assertNotNull(byteVector20);
        org.junit.Assert.assertNotNull(byteVector23);
        org.junit.Assert.assertNotNull(byteVector25);
        org.junit.Assert.assertNotNull(byteVector27);
        org.junit.Assert.assertNotNull(byteVector29);
        org.junit.Assert.assertNotNull(byteVector31);
        org.junit.Assert.assertNotNull(byteVector33);
        org.junit.Assert.assertNotNull(byteVector35);
        org.junit.Assert.assertNotNull(byteVector37);
        org.junit.Assert.assertNotNull(byteVector40);
        org.junit.Assert.assertNotNull(byteVector42);
        org.junit.Assert.assertNotNull(byteVector44);
        org.junit.Assert.assertNotNull(byteVector46);
        org.junit.Assert.assertNotNull(byteVector48);
        org.junit.Assert.assertNotNull(byteVector50);
        org.junit.Assert.assertNotNull(byteVector52);
        org.junit.Assert.assertNotNull(byteVector54);
        org.junit.Assert.assertNotNull(byteVector56);
        org.junit.Assert.assertNotNull(byteArray61);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray61), "[1, 0, 0, -1]");
        org.junit.Assert.assertNotNull(byteVector64);
        org.junit.Assert.assertNotNull(byteVector67);
        org.junit.Assert.assertNotNull(byteVector70);
        org.junit.Assert.assertNotNull(byteVector72);
        org.junit.Assert.assertNotNull(wildcardClass73);
    }

    @Test
    public void test0455() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0455");
        org.mockito.asm.ByteVector byteVector0 = new org.mockito.asm.ByteVector();
        org.mockito.asm.ByteVector byteVector2 = byteVector0.putUTF8("hi!");
        org.mockito.asm.ByteVector byteVector4 = byteVector0.putShort((int) (short) 100);
        org.mockito.asm.ByteVector byteVector6 = byteVector4.putLong((long) (byte) -1);
        org.mockito.asm.ByteVector byteVector8 = byteVector4.putByte((int) (byte) 10);
        org.mockito.asm.ByteVector byteVector10 = byteVector8.putUTF8("");
        org.mockito.asm.ByteVector byteVector12 = byteVector10.putInt((int) '4');
        org.mockito.asm.ByteVector byteVector14 = byteVector12.putByte((int) (byte) 0);
        java.lang.Class<?> wildcardClass15 = byteVector14.getClass();
        org.junit.Assert.assertNotNull(byteVector2);
        org.junit.Assert.assertNotNull(byteVector4);
        org.junit.Assert.assertNotNull(byteVector6);
        org.junit.Assert.assertNotNull(byteVector8);
        org.junit.Assert.assertNotNull(byteVector10);
        org.junit.Assert.assertNotNull(byteVector12);
        org.junit.Assert.assertNotNull(byteVector14);
        org.junit.Assert.assertNotNull(wildcardClass15);
    }

    @Test
    public void test0456() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0456");
        org.mockito.asm.ByteVector byteVector0 = new org.mockito.asm.ByteVector();
        org.mockito.asm.ByteVector byteVector2 = byteVector0.putUTF8("hi!");
        org.mockito.asm.ByteVector byteVector4 = byteVector0.putShort((int) (short) -1);
        org.mockito.asm.ByteVector byteVector6 = byteVector0.putInt(0);
        org.mockito.asm.ByteVector byteVector8 = byteVector0.putUTF8("hi!");
        org.mockito.asm.ByteVector byteVector10 = byteVector8.putInt((int) (short) 0);
        org.mockito.asm.ByteVector byteVector12 = byteVector10.putLong((long) (short) 100);
        java.lang.Class<?> wildcardClass13 = byteVector10.getClass();
        org.junit.Assert.assertNotNull(byteVector2);
        org.junit.Assert.assertNotNull(byteVector4);
        org.junit.Assert.assertNotNull(byteVector6);
        org.junit.Assert.assertNotNull(byteVector8);
        org.junit.Assert.assertNotNull(byteVector10);
        org.junit.Assert.assertNotNull(byteVector12);
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test0457() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0457");
        org.mockito.asm.ByteVector byteVector0 = new org.mockito.asm.ByteVector();
        org.mockito.asm.ByteVector byteVector2 = byteVector0.putUTF8("hi!");
        org.mockito.asm.ByteVector byteVector4 = byteVector2.putInt((int) (byte) 10);
        org.mockito.asm.ByteVector byteVector6 = byteVector4.putUTF8("");
        org.mockito.asm.ByteVector byteVector8 = byteVector6.putUTF8("hi!");
        org.mockito.asm.ByteVector byteVector10 = byteVector6.putInt((int) (byte) 1);
        org.mockito.asm.ByteVector byteVector12 = byteVector6.putUTF8("");
        org.mockito.asm.ByteVector byteVector13 = new org.mockito.asm.ByteVector();
        org.mockito.asm.ByteVector byteVector15 = byteVector13.putUTF8("hi!");
        org.mockito.asm.ByteVector byteVector17 = byteVector13.putLong((long) ' ');
        org.mockito.asm.ByteVector byteVector19 = byteVector17.putByte((int) 'a');
        org.mockito.asm.ByteVector byteVector21 = byteVector17.putByte((int) (short) -1);
        org.mockito.asm.ByteVector byteVector23 = byteVector17.putLong(0L);
        org.mockito.asm.ByteVector byteVector25 = byteVector17.putUTF8("hi!");
        org.mockito.asm.ByteVector byteVector27 = byteVector25.putUTF8("");
        org.mockito.asm.ByteVector byteVector29 = byteVector25.putInt((int) (byte) 10);
        org.mockito.asm.ByteVector byteVector31 = byteVector29.putLong((long) (short) -1);
        org.mockito.asm.ByteVector byteVector33 = byteVector29.putByte(0);
        org.mockito.asm.ByteVector byteVector34 = new org.mockito.asm.ByteVector();
        org.mockito.asm.ByteVector byteVector36 = byteVector34.putUTF8("hi!");
        org.mockito.asm.ByteVector byteVector38 = byteVector36.putInt(0);
        org.mockito.asm.ByteVector byteVector40 = byteVector36.putByte((int) (byte) 10);
        org.mockito.asm.ByteVector byteVector42 = byteVector40.putLong((-1L));
        org.mockito.asm.ByteVector byteVector44 = byteVector40.putInt((int) (byte) 100);
        org.mockito.asm.ByteVector byteVector45 = new org.mockito.asm.ByteVector();
        org.mockito.asm.ByteVector byteVector47 = byteVector45.putUTF8("hi!");
        org.mockito.asm.ByteVector byteVector49 = byteVector45.putInt(0);
        org.mockito.asm.ByteVector byteVector51 = byteVector49.putInt((int) ' ');
        org.mockito.asm.ByteVector byteVector53 = byteVector51.putLong(100L);
        byte[] byteArray57 = new byte[] { (byte) 0, (byte) 10, (byte) 1 };
        org.mockito.asm.ByteVector byteVector60 = byteVector51.putByteArray(byteArray57, 0, 0);
        org.mockito.asm.ByteVector byteVector63 = byteVector40.putByteArray(byteArray57, (int) (byte) 1, 0);
        org.mockito.asm.ByteVector byteVector66 = byteVector33.putByteArray(byteArray57, 1, 0);
        // The following exception was thrown during execution in test generation
        try {
            org.mockito.asm.ByteVector byteVector69 = byteVector12.putByteArray(byteArray57, (int) '#', (int) (byte) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteVector2);
        org.junit.Assert.assertNotNull(byteVector4);
        org.junit.Assert.assertNotNull(byteVector6);
        org.junit.Assert.assertNotNull(byteVector8);
        org.junit.Assert.assertNotNull(byteVector10);
        org.junit.Assert.assertNotNull(byteVector12);
        org.junit.Assert.assertNotNull(byteVector15);
        org.junit.Assert.assertNotNull(byteVector17);
        org.junit.Assert.assertNotNull(byteVector19);
        org.junit.Assert.assertNotNull(byteVector21);
        org.junit.Assert.assertNotNull(byteVector23);
        org.junit.Assert.assertNotNull(byteVector25);
        org.junit.Assert.assertNotNull(byteVector27);
        org.junit.Assert.assertNotNull(byteVector29);
        org.junit.Assert.assertNotNull(byteVector31);
        org.junit.Assert.assertNotNull(byteVector33);
        org.junit.Assert.assertNotNull(byteVector36);
        org.junit.Assert.assertNotNull(byteVector38);
        org.junit.Assert.assertNotNull(byteVector40);
        org.junit.Assert.assertNotNull(byteVector42);
        org.junit.Assert.assertNotNull(byteVector44);
        org.junit.Assert.assertNotNull(byteVector47);
        org.junit.Assert.assertNotNull(byteVector49);
        org.junit.Assert.assertNotNull(byteVector51);
        org.junit.Assert.assertNotNull(byteVector53);
        org.junit.Assert.assertNotNull(byteArray57);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray57), "[0, 10, 1]");
        org.junit.Assert.assertNotNull(byteVector60);
        org.junit.Assert.assertNotNull(byteVector63);
        org.junit.Assert.assertNotNull(byteVector66);
    }

    @Test
    public void test0458() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0458");
        org.mockito.asm.ByteVector byteVector0 = new org.mockito.asm.ByteVector();
        org.mockito.asm.ByteVector byteVector2 = byteVector0.putUTF8("hi!");
        org.mockito.asm.ByteVector byteVector4 = byteVector2.putLong((long) (byte) 10);
        org.mockito.asm.ByteVector byteVector6 = byteVector4.putUTF8("hi!");
        org.mockito.asm.ByteVector byteVector8 = byteVector4.putLong((long) (short) -1);
        org.mockito.asm.ByteVector byteVector10 = byteVector8.putInt(10);
        org.mockito.asm.ByteVector byteVector12 = byteVector8.putByte((int) (short) 1);
        org.mockito.asm.ByteVector byteVector14 = byteVector12.putShort((int) (short) 100);
        org.mockito.asm.ByteVector byteVector16 = byteVector14.putByte(0);
        org.mockito.asm.ByteVector byteVector18 = byteVector16.putByte((int) (short) 100);
        org.mockito.asm.ByteVector byteVector19 = new org.mockito.asm.ByteVector();
        org.mockito.asm.ByteVector byteVector21 = byteVector19.putUTF8("hi!");
        org.mockito.asm.ByteVector byteVector23 = byteVector21.putLong((long) (byte) 10);
        org.mockito.asm.ByteVector byteVector25 = byteVector23.putUTF8("hi!");
        org.mockito.asm.ByteVector byteVector27 = byteVector23.putLong((long) (short) -1);
        org.mockito.asm.ByteVector byteVector29 = byteVector27.putInt(10);
        org.mockito.asm.ByteVector byteVector31 = byteVector27.putByte((int) (short) 1);
        org.mockito.asm.ByteVector byteVector33 = byteVector27.putInt((int) (short) -1);
        org.mockito.asm.ByteVector byteVector35 = byteVector27.putUTF8("hi!");
        org.mockito.asm.ByteVector byteVector36 = new org.mockito.asm.ByteVector();
        org.mockito.asm.ByteVector byteVector38 = byteVector36.putUTF8("hi!");
        org.mockito.asm.ByteVector byteVector40 = byteVector36.putLong((long) ' ');
        org.mockito.asm.ByteVector byteVector42 = byteVector40.putByte((int) 'a');
        org.mockito.asm.ByteVector byteVector44 = byteVector40.putByte((int) (short) -1);
        org.mockito.asm.ByteVector byteVector46 = byteVector40.putLong(0L);
        org.mockito.asm.ByteVector byteVector48 = byteVector40.putUTF8("hi!");
        org.mockito.asm.ByteVector byteVector50 = byteVector48.putUTF8("");
        org.mockito.asm.ByteVector byteVector52 = byteVector50.putLong((long) (byte) 10);
        org.mockito.asm.ByteVector byteVector54 = byteVector50.putLong((long) (short) 100);
        byte[] byteArray59 = new byte[] { (byte) 1, (byte) 0, (byte) 0, (byte) -1 };
        org.mockito.asm.ByteVector byteVector62 = byteVector50.putByteArray(byteArray59, 0, 0);
        org.mockito.asm.ByteVector byteVector65 = byteVector35.putByteArray(byteArray59, (int) (byte) 0, (int) (short) 1);
        // The following exception was thrown during execution in test generation
        try {
            org.mockito.asm.ByteVector byteVector68 = byteVector18.putByteArray(byteArray59, (int) (byte) 100, (int) '4');
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteVector2);
        org.junit.Assert.assertNotNull(byteVector4);
        org.junit.Assert.assertNotNull(byteVector6);
        org.junit.Assert.assertNotNull(byteVector8);
        org.junit.Assert.assertNotNull(byteVector10);
        org.junit.Assert.assertNotNull(byteVector12);
        org.junit.Assert.assertNotNull(byteVector14);
        org.junit.Assert.assertNotNull(byteVector16);
        org.junit.Assert.assertNotNull(byteVector18);
        org.junit.Assert.assertNotNull(byteVector21);
        org.junit.Assert.assertNotNull(byteVector23);
        org.junit.Assert.assertNotNull(byteVector25);
        org.junit.Assert.assertNotNull(byteVector27);
        org.junit.Assert.assertNotNull(byteVector29);
        org.junit.Assert.assertNotNull(byteVector31);
        org.junit.Assert.assertNotNull(byteVector33);
        org.junit.Assert.assertNotNull(byteVector35);
        org.junit.Assert.assertNotNull(byteVector38);
        org.junit.Assert.assertNotNull(byteVector40);
        org.junit.Assert.assertNotNull(byteVector42);
        org.junit.Assert.assertNotNull(byteVector44);
        org.junit.Assert.assertNotNull(byteVector46);
        org.junit.Assert.assertNotNull(byteVector48);
        org.junit.Assert.assertNotNull(byteVector50);
        org.junit.Assert.assertNotNull(byteVector52);
        org.junit.Assert.assertNotNull(byteVector54);
        org.junit.Assert.assertNotNull(byteArray59);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray59), "[1, 0, 0, -1]");
        org.junit.Assert.assertNotNull(byteVector62);
        org.junit.Assert.assertNotNull(byteVector65);
    }

    @Test
    public void test0459() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0459");
        org.mockito.asm.ByteVector byteVector0 = new org.mockito.asm.ByteVector();
        org.mockito.asm.ByteVector byteVector2 = byteVector0.putUTF8("hi!");
        org.mockito.asm.ByteVector byteVector4 = byteVector0.putLong((long) ' ');
        org.mockito.asm.ByteVector byteVector6 = byteVector4.putByte((int) 'a');
        org.mockito.asm.ByteVector byteVector8 = byteVector4.putByte((int) (short) -1);
        org.mockito.asm.ByteVector byteVector10 = byteVector4.putLong(0L);
        org.mockito.asm.ByteVector byteVector12 = byteVector10.putByte(0);
        org.mockito.asm.ByteVector byteVector14 = byteVector12.putLong(1L);
        org.mockito.asm.ByteVector byteVector16 = byteVector14.putShort((int) 'a');
        org.mockito.asm.ByteVector byteVector18 = byteVector14.putLong((long) 10);
        org.mockito.asm.ByteVector byteVector20 = byteVector14.putUTF8("");
        org.mockito.asm.ByteVector byteVector21 = new org.mockito.asm.ByteVector();
        org.mockito.asm.ByteVector byteVector23 = byteVector21.putUTF8("hi!");
        org.mockito.asm.ByteVector byteVector25 = byteVector23.putLong((long) (byte) 10);
        org.mockito.asm.ByteVector byteVector27 = byteVector25.putUTF8("hi!");
        org.mockito.asm.ByteVector byteVector29 = byteVector25.putLong((long) (short) -1);
        org.mockito.asm.ByteVector byteVector31 = byteVector29.putInt(10);
        org.mockito.asm.ByteVector byteVector33 = byteVector29.putByte((int) (short) 1);
        org.mockito.asm.ByteVector byteVector35 = byteVector29.putInt((int) (short) -1);
        org.mockito.asm.ByteVector byteVector37 = byteVector29.putUTF8("hi!");
        org.mockito.asm.ByteVector byteVector38 = new org.mockito.asm.ByteVector();
        org.mockito.asm.ByteVector byteVector40 = byteVector38.putUTF8("hi!");
        org.mockito.asm.ByteVector byteVector42 = byteVector38.putLong((long) ' ');
        org.mockito.asm.ByteVector byteVector44 = byteVector42.putByte((int) 'a');
        org.mockito.asm.ByteVector byteVector46 = byteVector42.putByte((int) (short) -1);
        org.mockito.asm.ByteVector byteVector48 = byteVector42.putLong(0L);
        org.mockito.asm.ByteVector byteVector50 = byteVector42.putUTF8("hi!");
        org.mockito.asm.ByteVector byteVector52 = byteVector50.putUTF8("");
        org.mockito.asm.ByteVector byteVector54 = byteVector52.putLong((long) (byte) 10);
        org.mockito.asm.ByteVector byteVector56 = byteVector52.putLong((long) (short) 100);
        byte[] byteArray61 = new byte[] { (byte) 1, (byte) 0, (byte) 0, (byte) -1 };
        org.mockito.asm.ByteVector byteVector64 = byteVector52.putByteArray(byteArray61, 0, 0);
        org.mockito.asm.ByteVector byteVector67 = byteVector37.putByteArray(byteArray61, (int) (byte) 0, (int) (short) 1);
        org.mockito.asm.ByteVector byteVector70 = byteVector14.putByteArray(byteArray61, (int) (short) 0, (int) (short) 0);
        org.mockito.asm.ByteVector byteVector71 = new org.mockito.asm.ByteVector();
        org.mockito.asm.ByteVector byteVector73 = byteVector71.putUTF8("hi!");
        org.mockito.asm.ByteVector byteVector75 = byteVector71.putInt(0);
        org.mockito.asm.ByteVector byteVector77 = byteVector75.putInt((int) ' ');
        org.mockito.asm.ByteVector byteVector79 = byteVector77.putLong(100L);
        byte[] byteArray83 = new byte[] { (byte) 0, (byte) 10, (byte) 1 };
        org.mockito.asm.ByteVector byteVector86 = byteVector77.putByteArray(byteArray83, 0, 0);
        // The following exception was thrown during execution in test generation
        try {
            org.mockito.asm.ByteVector byteVector89 = byteVector70.putByteArray(byteArray83, (int) 'a', (int) (short) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteVector2);
        org.junit.Assert.assertNotNull(byteVector4);
        org.junit.Assert.assertNotNull(byteVector6);
        org.junit.Assert.assertNotNull(byteVector8);
        org.junit.Assert.assertNotNull(byteVector10);
        org.junit.Assert.assertNotNull(byteVector12);
        org.junit.Assert.assertNotNull(byteVector14);
        org.junit.Assert.assertNotNull(byteVector16);
        org.junit.Assert.assertNotNull(byteVector18);
        org.junit.Assert.assertNotNull(byteVector20);
        org.junit.Assert.assertNotNull(byteVector23);
        org.junit.Assert.assertNotNull(byteVector25);
        org.junit.Assert.assertNotNull(byteVector27);
        org.junit.Assert.assertNotNull(byteVector29);
        org.junit.Assert.assertNotNull(byteVector31);
        org.junit.Assert.assertNotNull(byteVector33);
        org.junit.Assert.assertNotNull(byteVector35);
        org.junit.Assert.assertNotNull(byteVector37);
        org.junit.Assert.assertNotNull(byteVector40);
        org.junit.Assert.assertNotNull(byteVector42);
        org.junit.Assert.assertNotNull(byteVector44);
        org.junit.Assert.assertNotNull(byteVector46);
        org.junit.Assert.assertNotNull(byteVector48);
        org.junit.Assert.assertNotNull(byteVector50);
        org.junit.Assert.assertNotNull(byteVector52);
        org.junit.Assert.assertNotNull(byteVector54);
        org.junit.Assert.assertNotNull(byteVector56);
        org.junit.Assert.assertNotNull(byteArray61);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray61), "[1, 0, 0, -1]");
        org.junit.Assert.assertNotNull(byteVector64);
        org.junit.Assert.assertNotNull(byteVector67);
        org.junit.Assert.assertNotNull(byteVector70);
        org.junit.Assert.assertNotNull(byteVector73);
        org.junit.Assert.assertNotNull(byteVector75);
        org.junit.Assert.assertNotNull(byteVector77);
        org.junit.Assert.assertNotNull(byteVector79);
        org.junit.Assert.assertNotNull(byteArray83);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray83), "[0, 10, 1]");
        org.junit.Assert.assertNotNull(byteVector86);
    }

    @Test
    public void test0460() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0460");
        org.mockito.asm.ByteVector byteVector0 = new org.mockito.asm.ByteVector();
        org.mockito.asm.ByteVector byteVector2 = byteVector0.putUTF8("hi!");
        org.mockito.asm.ByteVector byteVector4 = byteVector2.putInt(0);
        org.mockito.asm.ByteVector byteVector6 = byteVector4.putShort((int) '4');
        org.mockito.asm.ByteVector byteVector8 = byteVector6.putByte(100);
        org.mockito.asm.ByteVector byteVector10 = byteVector6.putInt((int) (byte) 10);
        org.mockito.asm.ByteVector byteVector12 = byteVector6.putInt((int) (byte) -1);
        org.mockito.asm.ByteVector byteVector14 = byteVector12.putLong((long) '4');
        org.mockito.asm.ByteVector byteVector16 = byteVector14.putLong((long) ' ');
        org.mockito.asm.ByteVector byteVector18 = byteVector16.putByte((int) (byte) 1);
        org.junit.Assert.assertNotNull(byteVector2);
        org.junit.Assert.assertNotNull(byteVector4);
        org.junit.Assert.assertNotNull(byteVector6);
        org.junit.Assert.assertNotNull(byteVector8);
        org.junit.Assert.assertNotNull(byteVector10);
        org.junit.Assert.assertNotNull(byteVector12);
        org.junit.Assert.assertNotNull(byteVector14);
        org.junit.Assert.assertNotNull(byteVector16);
        org.junit.Assert.assertNotNull(byteVector18);
    }

    @Test
    public void test0461() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0461");
        org.mockito.asm.ByteVector byteVector0 = new org.mockito.asm.ByteVector();
        org.mockito.asm.ByteVector byteVector2 = byteVector0.putUTF8("hi!");
        org.mockito.asm.ByteVector byteVector4 = byteVector0.putLong((long) ' ');
        org.mockito.asm.ByteVector byteVector6 = byteVector4.putByte((int) 'a');
        org.mockito.asm.ByteVector byteVector8 = byteVector4.putByte((int) (short) -1);
        org.mockito.asm.ByteVector byteVector10 = byteVector4.putLong(0L);
        org.mockito.asm.ByteVector byteVector12 = byteVector10.putByte(0);
        org.mockito.asm.ByteVector byteVector14 = byteVector12.putLong(1L);
        org.mockito.asm.ByteVector byteVector16 = byteVector14.putShort((int) 'a');
        org.mockito.asm.ByteVector byteVector17 = new org.mockito.asm.ByteVector();
        org.mockito.asm.ByteVector byteVector19 = byteVector17.putUTF8("hi!");
        org.mockito.asm.ByteVector byteVector21 = byteVector19.putLong((long) (byte) 10);
        org.mockito.asm.ByteVector byteVector23 = byteVector21.putUTF8("hi!");
        org.mockito.asm.ByteVector byteVector25 = byteVector21.putLong((long) (short) -1);
        org.mockito.asm.ByteVector byteVector27 = byteVector25.putInt(10);
        org.mockito.asm.ByteVector byteVector29 = byteVector25.putByte((int) (short) 1);
        org.mockito.asm.ByteVector byteVector31 = byteVector25.putInt((int) (short) -1);
        org.mockito.asm.ByteVector byteVector33 = byteVector25.putUTF8("hi!");
        org.mockito.asm.ByteVector byteVector34 = new org.mockito.asm.ByteVector();
        org.mockito.asm.ByteVector byteVector36 = byteVector34.putUTF8("hi!");
        org.mockito.asm.ByteVector byteVector38 = byteVector34.putLong((long) ' ');
        org.mockito.asm.ByteVector byteVector40 = byteVector38.putByte((int) 'a');
        org.mockito.asm.ByteVector byteVector42 = byteVector38.putByte((int) (short) -1);
        org.mockito.asm.ByteVector byteVector44 = byteVector38.putLong(0L);
        org.mockito.asm.ByteVector byteVector46 = byteVector38.putUTF8("hi!");
        org.mockito.asm.ByteVector byteVector48 = byteVector46.putUTF8("");
        org.mockito.asm.ByteVector byteVector50 = byteVector48.putLong((long) (byte) 10);
        org.mockito.asm.ByteVector byteVector52 = byteVector48.putLong((long) (short) 100);
        byte[] byteArray57 = new byte[] { (byte) 1, (byte) 0, (byte) 0, (byte) -1 };
        org.mockito.asm.ByteVector byteVector60 = byteVector48.putByteArray(byteArray57, 0, 0);
        org.mockito.asm.ByteVector byteVector63 = byteVector33.putByteArray(byteArray57, (int) (byte) 0, (int) (short) 1);
        // The following exception was thrown during execution in test generation
        try {
            org.mockito.asm.ByteVector byteVector66 = byteVector16.putByteArray(byteArray57, (int) ' ', (int) (byte) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteVector2);
        org.junit.Assert.assertNotNull(byteVector4);
        org.junit.Assert.assertNotNull(byteVector6);
        org.junit.Assert.assertNotNull(byteVector8);
        org.junit.Assert.assertNotNull(byteVector10);
        org.junit.Assert.assertNotNull(byteVector12);
        org.junit.Assert.assertNotNull(byteVector14);
        org.junit.Assert.assertNotNull(byteVector16);
        org.junit.Assert.assertNotNull(byteVector19);
        org.junit.Assert.assertNotNull(byteVector21);
        org.junit.Assert.assertNotNull(byteVector23);
        org.junit.Assert.assertNotNull(byteVector25);
        org.junit.Assert.assertNotNull(byteVector27);
        org.junit.Assert.assertNotNull(byteVector29);
        org.junit.Assert.assertNotNull(byteVector31);
        org.junit.Assert.assertNotNull(byteVector33);
        org.junit.Assert.assertNotNull(byteVector36);
        org.junit.Assert.assertNotNull(byteVector38);
        org.junit.Assert.assertNotNull(byteVector40);
        org.junit.Assert.assertNotNull(byteVector42);
        org.junit.Assert.assertNotNull(byteVector44);
        org.junit.Assert.assertNotNull(byteVector46);
        org.junit.Assert.assertNotNull(byteVector48);
        org.junit.Assert.assertNotNull(byteVector50);
        org.junit.Assert.assertNotNull(byteVector52);
        org.junit.Assert.assertNotNull(byteArray57);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray57), "[1, 0, 0, -1]");
        org.junit.Assert.assertNotNull(byteVector60);
        org.junit.Assert.assertNotNull(byteVector63);
    }

    @Test
    public void test0462() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0462");
        org.mockito.asm.ByteVector byteVector0 = new org.mockito.asm.ByteVector();
        org.mockito.asm.ByteVector byteVector2 = byteVector0.putUTF8("hi!");
        org.mockito.asm.ByteVector byteVector4 = byteVector2.putInt(0);
        org.mockito.asm.ByteVector byteVector6 = byteVector2.putByte((int) (byte) 10);
        org.mockito.asm.ByteVector byteVector8 = byteVector6.putUTF8("hi!");
        org.mockito.asm.ByteVector byteVector10 = byteVector8.putShort(0);
        org.mockito.asm.ByteVector byteVector12 = byteVector8.putUTF8("");
        java.lang.Class<?> wildcardClass13 = byteVector12.getClass();
        org.junit.Assert.assertNotNull(byteVector2);
        org.junit.Assert.assertNotNull(byteVector4);
        org.junit.Assert.assertNotNull(byteVector6);
        org.junit.Assert.assertNotNull(byteVector8);
        org.junit.Assert.assertNotNull(byteVector10);
        org.junit.Assert.assertNotNull(byteVector12);
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test0463() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0463");
        org.mockito.asm.ByteVector byteVector0 = new org.mockito.asm.ByteVector();
        org.mockito.asm.ByteVector byteVector2 = byteVector0.putUTF8("hi!");
        org.mockito.asm.ByteVector byteVector4 = byteVector0.putInt(0);
        org.mockito.asm.ByteVector byteVector6 = byteVector0.putShort((int) '4');
        org.mockito.asm.ByteVector byteVector8 = byteVector6.putInt((-1));
        java.lang.Class<?> wildcardClass9 = byteVector8.getClass();
        org.junit.Assert.assertNotNull(byteVector2);
        org.junit.Assert.assertNotNull(byteVector4);
        org.junit.Assert.assertNotNull(byteVector6);
        org.junit.Assert.assertNotNull(byteVector8);
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test0464() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0464");
        org.mockito.asm.ByteVector byteVector0 = new org.mockito.asm.ByteVector();
        org.mockito.asm.ByteVector byteVector2 = byteVector0.putUTF8("hi!");
        org.mockito.asm.ByteVector byteVector4 = byteVector2.putLong((long) (byte) 10);
        org.mockito.asm.ByteVector byteVector6 = byteVector4.putUTF8("hi!");
        org.mockito.asm.ByteVector byteVector8 = byteVector4.putLong((-1L));
        org.mockito.asm.ByteVector byteVector10 = byteVector8.putInt(10);
        org.mockito.asm.ByteVector byteVector12 = byteVector10.putShort((int) '#');
        org.mockito.asm.ByteVector byteVector14 = new org.mockito.asm.ByteVector((int) (short) 0);
        org.mockito.asm.ByteVector byteVector15 = new org.mockito.asm.ByteVector();
        org.mockito.asm.ByteVector byteVector17 = byteVector15.putUTF8("hi!");
        org.mockito.asm.ByteVector byteVector19 = byteVector15.putInt(0);
        org.mockito.asm.ByteVector byteVector21 = byteVector19.putInt((int) ' ');
        org.mockito.asm.ByteVector byteVector23 = byteVector21.putLong(100L);
        byte[] byteArray27 = new byte[] { (byte) 0, (byte) 10, (byte) 1 };
        org.mockito.asm.ByteVector byteVector30 = byteVector21.putByteArray(byteArray27, 0, 0);
        org.mockito.asm.ByteVector byteVector33 = byteVector14.putByteArray(byteArray27, 1, (int) (short) 0);
        org.mockito.asm.ByteVector byteVector36 = byteVector10.putByteArray(byteArray27, (int) (short) 0, 0);
        org.mockito.asm.ByteVector byteVector38 = byteVector10.putByte((int) (byte) 0);
        java.lang.Class<?> wildcardClass39 = byteVector10.getClass();
        org.junit.Assert.assertNotNull(byteVector2);
        org.junit.Assert.assertNotNull(byteVector4);
        org.junit.Assert.assertNotNull(byteVector6);
        org.junit.Assert.assertNotNull(byteVector8);
        org.junit.Assert.assertNotNull(byteVector10);
        org.junit.Assert.assertNotNull(byteVector12);
        org.junit.Assert.assertNotNull(byteVector17);
        org.junit.Assert.assertNotNull(byteVector19);
        org.junit.Assert.assertNotNull(byteVector21);
        org.junit.Assert.assertNotNull(byteVector23);
        org.junit.Assert.assertNotNull(byteArray27);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray27), "[0, 10, 1]");
        org.junit.Assert.assertNotNull(byteVector30);
        org.junit.Assert.assertNotNull(byteVector33);
        org.junit.Assert.assertNotNull(byteVector36);
        org.junit.Assert.assertNotNull(byteVector38);
        org.junit.Assert.assertNotNull(wildcardClass39);
    }

    @Test
    public void test0465() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0465");
        org.mockito.asm.ByteVector byteVector0 = new org.mockito.asm.ByteVector();
        org.mockito.asm.ByteVector byteVector2 = byteVector0.putUTF8("hi!");
        org.mockito.asm.ByteVector byteVector4 = byteVector0.putLong((long) ' ');
        org.mockito.asm.ByteVector byteVector6 = byteVector4.putByte((int) 'a');
        org.mockito.asm.ByteVector byteVector8 = byteVector6.putByte((int) (short) -1);
        byte[] byteArray9 = null;
        org.mockito.asm.ByteVector byteVector12 = byteVector6.putByteArray(byteArray9, (int) '#', 0);
        org.mockito.asm.ByteVector byteVector14 = byteVector6.putByte((int) (byte) 1);
        org.mockito.asm.ByteVector byteVector16 = byteVector14.putByte((int) (byte) 1);
        java.lang.Class<?> wildcardClass17 = byteVector14.getClass();
        org.junit.Assert.assertNotNull(byteVector2);
        org.junit.Assert.assertNotNull(byteVector4);
        org.junit.Assert.assertNotNull(byteVector6);
        org.junit.Assert.assertNotNull(byteVector8);
        org.junit.Assert.assertNotNull(byteVector12);
        org.junit.Assert.assertNotNull(byteVector14);
        org.junit.Assert.assertNotNull(byteVector16);
        org.junit.Assert.assertNotNull(wildcardClass17);
    }

    @Test
    public void test0466() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0466");
        org.mockito.asm.ByteVector byteVector1 = new org.mockito.asm.ByteVector((int) '#');
        org.mockito.asm.ByteVector byteVector3 = byteVector1.putInt(100);
        org.mockito.asm.ByteVector byteVector5 = byteVector3.putShort((int) (short) -1);
        org.mockito.asm.ByteVector byteVector7 = byteVector5.putShort((int) (short) 0);
        org.mockito.asm.ByteVector byteVector9 = byteVector5.putUTF8("");
        org.mockito.asm.ByteVector byteVector10 = new org.mockito.asm.ByteVector();
        org.mockito.asm.ByteVector byteVector12 = byteVector10.putUTF8("hi!");
        org.mockito.asm.ByteVector byteVector14 = byteVector10.putLong((long) ' ');
        org.mockito.asm.ByteVector byteVector16 = byteVector14.putByte((int) 'a');
        org.mockito.asm.ByteVector byteVector18 = byteVector14.putByte((int) (short) -1);
        org.mockito.asm.ByteVector byteVector20 = byteVector14.putLong(0L);
        org.mockito.asm.ByteVector byteVector22 = byteVector14.putUTF8("hi!");
        org.mockito.asm.ByteVector byteVector24 = byteVector22.putUTF8("");
        org.mockito.asm.ByteVector byteVector26 = byteVector22.putInt((int) (byte) 10);
        org.mockito.asm.ByteVector byteVector28 = byteVector22.putByte(0);
        org.mockito.asm.ByteVector byteVector29 = new org.mockito.asm.ByteVector();
        org.mockito.asm.ByteVector byteVector31 = byteVector29.putUTF8("hi!");
        org.mockito.asm.ByteVector byteVector33 = byteVector29.putInt(0);
        org.mockito.asm.ByteVector byteVector35 = byteVector33.putInt((int) ' ');
        org.mockito.asm.ByteVector byteVector37 = byteVector35.putLong(100L);
        byte[] byteArray41 = new byte[] { (byte) 0, (byte) 10, (byte) 1 };
        org.mockito.asm.ByteVector byteVector44 = byteVector35.putByteArray(byteArray41, 0, 0);
        org.mockito.asm.ByteVector byteVector47 = byteVector28.putByteArray(byteArray41, (int) (short) 1, 0);
        org.mockito.asm.ByteVector byteVector50 = byteVector5.putByteArray(byteArray41, 1, 1);
        java.lang.Class<?> wildcardClass51 = byteVector5.getClass();
        org.junit.Assert.assertNotNull(byteVector3);
        org.junit.Assert.assertNotNull(byteVector5);
        org.junit.Assert.assertNotNull(byteVector7);
        org.junit.Assert.assertNotNull(byteVector9);
        org.junit.Assert.assertNotNull(byteVector12);
        org.junit.Assert.assertNotNull(byteVector14);
        org.junit.Assert.assertNotNull(byteVector16);
        org.junit.Assert.assertNotNull(byteVector18);
        org.junit.Assert.assertNotNull(byteVector20);
        org.junit.Assert.assertNotNull(byteVector22);
        org.junit.Assert.assertNotNull(byteVector24);
        org.junit.Assert.assertNotNull(byteVector26);
        org.junit.Assert.assertNotNull(byteVector28);
        org.junit.Assert.assertNotNull(byteVector31);
        org.junit.Assert.assertNotNull(byteVector33);
        org.junit.Assert.assertNotNull(byteVector35);
        org.junit.Assert.assertNotNull(byteVector37);
        org.junit.Assert.assertNotNull(byteArray41);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray41), "[0, 10, 1]");
        org.junit.Assert.assertNotNull(byteVector44);
        org.junit.Assert.assertNotNull(byteVector47);
        org.junit.Assert.assertNotNull(byteVector50);
        org.junit.Assert.assertNotNull(wildcardClass51);
    }

    @Test
    public void test0467() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0467");
        org.mockito.asm.ByteVector byteVector0 = new org.mockito.asm.ByteVector();
        org.mockito.asm.ByteVector byteVector2 = byteVector0.putUTF8("hi!");
        org.mockito.asm.ByteVector byteVector4 = byteVector2.putInt(0);
        org.mockito.asm.ByteVector byteVector6 = byteVector4.putByte((int) (byte) 1);
        org.mockito.asm.ByteVector byteVector8 = byteVector6.putShort((int) '4');
        org.mockito.asm.ByteVector byteVector10 = byteVector6.putShort(10);
        org.mockito.asm.ByteVector byteVector12 = byteVector10.putInt((int) (short) 1);
        org.mockito.asm.ByteVector byteVector14 = byteVector10.putUTF8("");
        org.junit.Assert.assertNotNull(byteVector2);
        org.junit.Assert.assertNotNull(byteVector4);
        org.junit.Assert.assertNotNull(byteVector6);
        org.junit.Assert.assertNotNull(byteVector8);
        org.junit.Assert.assertNotNull(byteVector10);
        org.junit.Assert.assertNotNull(byteVector12);
        org.junit.Assert.assertNotNull(byteVector14);
    }

    @Test
    public void test0468() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0468");
        org.mockito.asm.ByteVector byteVector0 = new org.mockito.asm.ByteVector();
        org.mockito.asm.ByteVector byteVector2 = byteVector0.putUTF8("hi!");
        org.mockito.asm.ByteVector byteVector4 = byteVector2.putInt((int) (byte) 10);
        org.mockito.asm.ByteVector byteVector6 = byteVector4.putUTF8("");
        org.mockito.asm.ByteVector byteVector8 = byteVector6.putUTF8("hi!");
        org.mockito.asm.ByteVector byteVector10 = byteVector6.putInt((int) '#');
        org.mockito.asm.ByteVector byteVector12 = byteVector10.putInt((int) (short) 0);
        org.mockito.asm.ByteVector byteVector14 = byteVector10.putShort((int) (short) 10);
        org.mockito.asm.ByteVector byteVector16 = byteVector10.putUTF8("hi!");
        org.mockito.asm.ByteVector byteVector18 = byteVector16.putInt(0);
        org.junit.Assert.assertNotNull(byteVector2);
        org.junit.Assert.assertNotNull(byteVector4);
        org.junit.Assert.assertNotNull(byteVector6);
        org.junit.Assert.assertNotNull(byteVector8);
        org.junit.Assert.assertNotNull(byteVector10);
        org.junit.Assert.assertNotNull(byteVector12);
        org.junit.Assert.assertNotNull(byteVector14);
        org.junit.Assert.assertNotNull(byteVector16);
        org.junit.Assert.assertNotNull(byteVector18);
    }

    @Test
    public void test0469() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0469");
        org.mockito.asm.ByteVector byteVector0 = new org.mockito.asm.ByteVector();
        org.mockito.asm.ByteVector byteVector2 = byteVector0.putUTF8("hi!");
        org.mockito.asm.ByteVector byteVector4 = byteVector0.putLong((long) ' ');
        org.mockito.asm.ByteVector byteVector6 = byteVector4.putByte((int) 'a');
        org.mockito.asm.ByteVector byteVector8 = byteVector4.putByte((int) (short) -1);
        org.mockito.asm.ByteVector byteVector10 = byteVector4.putLong(0L);
        org.mockito.asm.ByteVector byteVector12 = byteVector10.putByte(0);
        org.mockito.asm.ByteVector byteVector14 = byteVector12.putLong(1L);
        org.mockito.asm.ByteVector byteVector16 = byteVector14.putShort((int) 'a');
        org.mockito.asm.ByteVector byteVector18 = byteVector14.putLong((long) 10);
        java.lang.Class<?> wildcardClass19 = byteVector14.getClass();
        org.junit.Assert.assertNotNull(byteVector2);
        org.junit.Assert.assertNotNull(byteVector4);
        org.junit.Assert.assertNotNull(byteVector6);
        org.junit.Assert.assertNotNull(byteVector8);
        org.junit.Assert.assertNotNull(byteVector10);
        org.junit.Assert.assertNotNull(byteVector12);
        org.junit.Assert.assertNotNull(byteVector14);
        org.junit.Assert.assertNotNull(byteVector16);
        org.junit.Assert.assertNotNull(byteVector18);
        org.junit.Assert.assertNotNull(wildcardClass19);
    }

    @Test
    public void test0470() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0470");
        org.mockito.asm.ByteVector byteVector0 = new org.mockito.asm.ByteVector();
        org.mockito.asm.ByteVector byteVector2 = byteVector0.putUTF8("hi!");
        org.mockito.asm.ByteVector byteVector4 = byteVector2.putLong((long) (byte) 10);
        org.mockito.asm.ByteVector byteVector6 = byteVector4.putInt((int) 'a');
        org.mockito.asm.ByteVector byteVector8 = byteVector6.putShort((int) (byte) 0);
        org.mockito.asm.ByteVector byteVector10 = byteVector6.putShort(0);
        java.lang.Class<?> wildcardClass11 = byteVector10.getClass();
        org.junit.Assert.assertNotNull(byteVector2);
        org.junit.Assert.assertNotNull(byteVector4);
        org.junit.Assert.assertNotNull(byteVector6);
        org.junit.Assert.assertNotNull(byteVector8);
        org.junit.Assert.assertNotNull(byteVector10);
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test0471() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0471");
        org.mockito.asm.ByteVector byteVector0 = new org.mockito.asm.ByteVector();
        org.mockito.asm.ByteVector byteVector2 = byteVector0.putUTF8("hi!");
        org.mockito.asm.ByteVector byteVector4 = byteVector0.putLong((long) ' ');
        org.mockito.asm.ByteVector byteVector6 = byteVector4.putByte((int) 'a');
        org.mockito.asm.ByteVector byteVector8 = byteVector4.putByte((int) (short) -1);
        org.mockito.asm.ByteVector byteVector10 = byteVector4.putLong(0L);
        org.mockito.asm.ByteVector byteVector12 = byteVector10.putByte(0);
        org.mockito.asm.ByteVector byteVector14 = byteVector12.putByte(100);
        org.mockito.asm.ByteVector byteVector16 = byteVector12.putByte((int) '4');
        org.mockito.asm.ByteVector byteVector18 = byteVector16.putUTF8("");
        java.lang.Class<?> wildcardClass19 = byteVector18.getClass();
        org.junit.Assert.assertNotNull(byteVector2);
        org.junit.Assert.assertNotNull(byteVector4);
        org.junit.Assert.assertNotNull(byteVector6);
        org.junit.Assert.assertNotNull(byteVector8);
        org.junit.Assert.assertNotNull(byteVector10);
        org.junit.Assert.assertNotNull(byteVector12);
        org.junit.Assert.assertNotNull(byteVector14);
        org.junit.Assert.assertNotNull(byteVector16);
        org.junit.Assert.assertNotNull(byteVector18);
        org.junit.Assert.assertNotNull(wildcardClass19);
    }

    @Test
    public void test0472() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0472");
        org.mockito.asm.ByteVector byteVector0 = new org.mockito.asm.ByteVector();
        org.mockito.asm.ByteVector byteVector2 = byteVector0.putUTF8("hi!");
        org.mockito.asm.ByteVector byteVector4 = byteVector0.putShort((int) (short) -1);
        org.mockito.asm.ByteVector byteVector6 = byteVector0.putLong(0L);
        org.mockito.asm.ByteVector byteVector8 = byteVector0.putShort((int) (byte) -1);
        org.mockito.asm.ByteVector byteVector10 = byteVector0.putInt((int) (byte) 0);
        org.mockito.asm.ByteVector byteVector12 = byteVector10.putByte((int) (byte) 10);
        org.mockito.asm.ByteVector byteVector13 = new org.mockito.asm.ByteVector();
        org.mockito.asm.ByteVector byteVector15 = byteVector13.putUTF8("hi!");
        org.mockito.asm.ByteVector byteVector17 = byteVector13.putLong((long) ' ');
        org.mockito.asm.ByteVector byteVector19 = byteVector17.putByte((int) 'a');
        org.mockito.asm.ByteVector byteVector21 = byteVector17.putByte((int) (short) -1);
        org.mockito.asm.ByteVector byteVector23 = byteVector17.putLong(0L);
        org.mockito.asm.ByteVector byteVector25 = byteVector17.putUTF8("hi!");
        org.mockito.asm.ByteVector byteVector27 = byteVector25.putUTF8("");
        org.mockito.asm.ByteVector byteVector29 = byteVector25.putInt((int) (byte) 10);
        org.mockito.asm.ByteVector byteVector31 = byteVector25.putByte(0);
        org.mockito.asm.ByteVector byteVector32 = new org.mockito.asm.ByteVector();
        org.mockito.asm.ByteVector byteVector34 = byteVector32.putUTF8("hi!");
        org.mockito.asm.ByteVector byteVector36 = byteVector32.putInt(0);
        org.mockito.asm.ByteVector byteVector38 = byteVector36.putInt((int) ' ');
        org.mockito.asm.ByteVector byteVector40 = byteVector38.putLong(100L);
        byte[] byteArray44 = new byte[] { (byte) 0, (byte) 10, (byte) 1 };
        org.mockito.asm.ByteVector byteVector47 = byteVector38.putByteArray(byteArray44, 0, 0);
        org.mockito.asm.ByteVector byteVector50 = byteVector31.putByteArray(byteArray44, (int) (short) 1, 0);
        // The following exception was thrown during execution in test generation
        try {
            org.mockito.asm.ByteVector byteVector53 = byteVector12.putByteArray(byteArray44, (int) 'a', (int) (byte) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteVector2);
        org.junit.Assert.assertNotNull(byteVector4);
        org.junit.Assert.assertNotNull(byteVector6);
        org.junit.Assert.assertNotNull(byteVector8);
        org.junit.Assert.assertNotNull(byteVector10);
        org.junit.Assert.assertNotNull(byteVector12);
        org.junit.Assert.assertNotNull(byteVector15);
        org.junit.Assert.assertNotNull(byteVector17);
        org.junit.Assert.assertNotNull(byteVector19);
        org.junit.Assert.assertNotNull(byteVector21);
        org.junit.Assert.assertNotNull(byteVector23);
        org.junit.Assert.assertNotNull(byteVector25);
        org.junit.Assert.assertNotNull(byteVector27);
        org.junit.Assert.assertNotNull(byteVector29);
        org.junit.Assert.assertNotNull(byteVector31);
        org.junit.Assert.assertNotNull(byteVector34);
        org.junit.Assert.assertNotNull(byteVector36);
        org.junit.Assert.assertNotNull(byteVector38);
        org.junit.Assert.assertNotNull(byteVector40);
        org.junit.Assert.assertNotNull(byteArray44);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray44), "[0, 10, 1]");
        org.junit.Assert.assertNotNull(byteVector47);
        org.junit.Assert.assertNotNull(byteVector50);
    }

    @Test
    public void test0473() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0473");
        org.mockito.asm.ByteVector byteVector0 = new org.mockito.asm.ByteVector();
        org.mockito.asm.ByteVector byteVector2 = byteVector0.putUTF8("hi!");
        org.mockito.asm.ByteVector byteVector4 = byteVector2.putLong((long) (byte) 10);
        org.mockito.asm.ByteVector byteVector6 = byteVector4.putInt((int) 'a');
        org.mockito.asm.ByteVector byteVector8 = byteVector6.putShort((int) (byte) 0);
        org.mockito.asm.ByteVector byteVector10 = byteVector6.putShort(0);
        org.mockito.asm.ByteVector byteVector12 = byteVector10.putShort(10);
        org.mockito.asm.ByteVector byteVector13 = new org.mockito.asm.ByteVector();
        org.mockito.asm.ByteVector byteVector15 = byteVector13.putUTF8("hi!");
        org.mockito.asm.ByteVector byteVector17 = byteVector13.putLong((long) ' ');
        org.mockito.asm.ByteVector byteVector19 = byteVector17.putByte((int) 'a');
        org.mockito.asm.ByteVector byteVector21 = byteVector17.putByte((int) (short) -1);
        org.mockito.asm.ByteVector byteVector23 = byteVector17.putLong(0L);
        org.mockito.asm.ByteVector byteVector25 = byteVector17.putUTF8("hi!");
        org.mockito.asm.ByteVector byteVector27 = byteVector25.putUTF8("");
        org.mockito.asm.ByteVector byteVector29 = byteVector27.putLong((long) (byte) 10);
        org.mockito.asm.ByteVector byteVector31 = byteVector27.putLong((long) (short) 100);
        byte[] byteArray36 = new byte[] { (byte) 1, (byte) 0, (byte) 0, (byte) -1 };
        org.mockito.asm.ByteVector byteVector39 = byteVector27.putByteArray(byteArray36, 0, 0);
        // The following exception was thrown during execution in test generation
        try {
            org.mockito.asm.ByteVector byteVector42 = byteVector10.putByteArray(byteArray36, (int) (byte) 0, (int) '#');
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteVector2);
        org.junit.Assert.assertNotNull(byteVector4);
        org.junit.Assert.assertNotNull(byteVector6);
        org.junit.Assert.assertNotNull(byteVector8);
        org.junit.Assert.assertNotNull(byteVector10);
        org.junit.Assert.assertNotNull(byteVector12);
        org.junit.Assert.assertNotNull(byteVector15);
        org.junit.Assert.assertNotNull(byteVector17);
        org.junit.Assert.assertNotNull(byteVector19);
        org.junit.Assert.assertNotNull(byteVector21);
        org.junit.Assert.assertNotNull(byteVector23);
        org.junit.Assert.assertNotNull(byteVector25);
        org.junit.Assert.assertNotNull(byteVector27);
        org.junit.Assert.assertNotNull(byteVector29);
        org.junit.Assert.assertNotNull(byteVector31);
        org.junit.Assert.assertNotNull(byteArray36);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray36), "[1, 0, 0, -1]");
        org.junit.Assert.assertNotNull(byteVector39);
    }

    @Test
    public void test0474() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0474");
        org.mockito.asm.ByteVector byteVector0 = new org.mockito.asm.ByteVector();
        org.mockito.asm.ByteVector byteVector2 = byteVector0.putUTF8("hi!");
        org.mockito.asm.ByteVector byteVector4 = byteVector0.putShort((int) (short) -1);
        org.mockito.asm.ByteVector byteVector6 = byteVector4.putUTF8("");
        org.mockito.asm.ByteVector byteVector8 = byteVector4.putShort((int) (byte) 1);
        org.mockito.asm.ByteVector byteVector10 = byteVector4.putShort((int) (short) -1);
        java.lang.Class<?> wildcardClass11 = byteVector4.getClass();
        org.junit.Assert.assertNotNull(byteVector2);
        org.junit.Assert.assertNotNull(byteVector4);
        org.junit.Assert.assertNotNull(byteVector6);
        org.junit.Assert.assertNotNull(byteVector8);
        org.junit.Assert.assertNotNull(byteVector10);
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test0475() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0475");
        org.mockito.asm.ByteVector byteVector0 = new org.mockito.asm.ByteVector();
        org.mockito.asm.ByteVector byteVector2 = byteVector0.putUTF8("hi!");
        org.mockito.asm.ByteVector byteVector4 = byteVector2.putLong((long) (byte) 10);
        org.mockito.asm.ByteVector byteVector6 = byteVector4.putUTF8("hi!");
        org.mockito.asm.ByteVector byteVector8 = byteVector4.putLong((-1L));
        org.mockito.asm.ByteVector byteVector10 = byteVector4.putUTF8("hi!");
        org.mockito.asm.ByteVector byteVector12 = byteVector4.putShort((int) (byte) 1);
        org.junit.Assert.assertNotNull(byteVector2);
        org.junit.Assert.assertNotNull(byteVector4);
        org.junit.Assert.assertNotNull(byteVector6);
        org.junit.Assert.assertNotNull(byteVector8);
        org.junit.Assert.assertNotNull(byteVector10);
        org.junit.Assert.assertNotNull(byteVector12);
    }

    @Test
    public void test0476() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0476");
        org.mockito.asm.ByteVector byteVector0 = new org.mockito.asm.ByteVector();
        org.mockito.asm.ByteVector byteVector2 = byteVector0.putUTF8("hi!");
        org.mockito.asm.ByteVector byteVector4 = byteVector0.putLong((long) ' ');
        org.mockito.asm.ByteVector byteVector6 = byteVector4.putByte((int) 'a');
        org.mockito.asm.ByteVector byteVector8 = byteVector4.putByte((int) (short) -1);
        org.mockito.asm.ByteVector byteVector10 = byteVector4.putLong(0L);
        org.mockito.asm.ByteVector byteVector12 = byteVector4.putUTF8("hi!");
        org.mockito.asm.ByteVector byteVector14 = byteVector12.putUTF8("hi!");
        org.mockito.asm.ByteVector byteVector16 = byteVector12.putByte((int) (byte) -1);
        org.mockito.asm.ByteVector byteVector18 = byteVector12.putLong((long) (-1));
        org.mockito.asm.ByteVector byteVector20 = byteVector18.putByte((int) (byte) 1);
        org.mockito.asm.ByteVector byteVector22 = byteVector20.putUTF8("");
        org.mockito.asm.ByteVector byteVector24 = byteVector20.putByte((int) (byte) 100);
        org.mockito.asm.ByteVector byteVector26 = byteVector24.putInt((int) (byte) -1);
        org.junit.Assert.assertNotNull(byteVector2);
        org.junit.Assert.assertNotNull(byteVector4);
        org.junit.Assert.assertNotNull(byteVector6);
        org.junit.Assert.assertNotNull(byteVector8);
        org.junit.Assert.assertNotNull(byteVector10);
        org.junit.Assert.assertNotNull(byteVector12);
        org.junit.Assert.assertNotNull(byteVector14);
        org.junit.Assert.assertNotNull(byteVector16);
        org.junit.Assert.assertNotNull(byteVector18);
        org.junit.Assert.assertNotNull(byteVector20);
        org.junit.Assert.assertNotNull(byteVector22);
        org.junit.Assert.assertNotNull(byteVector24);
        org.junit.Assert.assertNotNull(byteVector26);
    }

    @Test
    public void test0477() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0477");
        org.mockito.asm.ByteVector byteVector0 = new org.mockito.asm.ByteVector();
        org.mockito.asm.ByteVector byteVector2 = byteVector0.putUTF8("hi!");
        org.mockito.asm.ByteVector byteVector4 = byteVector2.putInt((int) (byte) 10);
        org.mockito.asm.ByteVector byteVector6 = byteVector4.putUTF8("");
        org.mockito.asm.ByteVector byteVector8 = byteVector4.putLong((long) '#');
        org.mockito.asm.ByteVector byteVector10 = byteVector8.putLong((long) (short) 100);
        org.mockito.asm.ByteVector byteVector12 = byteVector8.putByte(1);
        org.mockito.asm.ByteVector byteVector13 = new org.mockito.asm.ByteVector();
        org.mockito.asm.ByteVector byteVector15 = byteVector13.putUTF8("hi!");
        org.mockito.asm.ByteVector byteVector17 = byteVector13.putLong((long) ' ');
        org.mockito.asm.ByteVector byteVector19 = byteVector17.putByte((int) 'a');
        org.mockito.asm.ByteVector byteVector21 = byteVector17.putByte((int) (short) -1);
        org.mockito.asm.ByteVector byteVector23 = byteVector17.putLong(0L);
        org.mockito.asm.ByteVector byteVector25 = byteVector23.putInt((int) (short) -1);
        org.mockito.asm.ByteVector byteVector27 = byteVector25.putByte(100);
        org.mockito.asm.ByteVector byteVector29 = byteVector27.putUTF8("hi!");
        org.mockito.asm.ByteVector byteVector31 = byteVector27.putLong((long) (short) 0);
        org.mockito.asm.ByteVector byteVector32 = new org.mockito.asm.ByteVector();
        org.mockito.asm.ByteVector byteVector34 = byteVector32.putUTF8("hi!");
        org.mockito.asm.ByteVector byteVector36 = byteVector32.putLong((long) ' ');
        org.mockito.asm.ByteVector byteVector38 = byteVector36.putByte((int) 'a');
        org.mockito.asm.ByteVector byteVector40 = byteVector36.putByte((int) (short) -1);
        org.mockito.asm.ByteVector byteVector42 = byteVector36.putLong(0L);
        org.mockito.asm.ByteVector byteVector44 = byteVector36.putUTF8("hi!");
        org.mockito.asm.ByteVector byteVector46 = byteVector44.putUTF8("");
        org.mockito.asm.ByteVector byteVector48 = byteVector44.putInt((int) (byte) 10);
        org.mockito.asm.ByteVector byteVector50 = byteVector44.putByte(0);
        org.mockito.asm.ByteVector byteVector51 = new org.mockito.asm.ByteVector();
        org.mockito.asm.ByteVector byteVector53 = byteVector51.putUTF8("hi!");
        org.mockito.asm.ByteVector byteVector55 = byteVector51.putInt(0);
        org.mockito.asm.ByteVector byteVector57 = byteVector55.putInt((int) ' ');
        org.mockito.asm.ByteVector byteVector59 = byteVector57.putLong(100L);
        byte[] byteArray63 = new byte[] { (byte) 0, (byte) 10, (byte) 1 };
        org.mockito.asm.ByteVector byteVector66 = byteVector57.putByteArray(byteArray63, 0, 0);
        org.mockito.asm.ByteVector byteVector69 = byteVector50.putByteArray(byteArray63, (int) (short) 1, 0);
        org.mockito.asm.ByteVector byteVector72 = byteVector31.putByteArray(byteArray63, (int) (byte) 0, (int) (byte) 1);
        // The following exception was thrown during execution in test generation
        try {
            org.mockito.asm.ByteVector byteVector75 = byteVector8.putByteArray(byteArray63, (-1), (int) (short) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteVector2);
        org.junit.Assert.assertNotNull(byteVector4);
        org.junit.Assert.assertNotNull(byteVector6);
        org.junit.Assert.assertNotNull(byteVector8);
        org.junit.Assert.assertNotNull(byteVector10);
        org.junit.Assert.assertNotNull(byteVector12);
        org.junit.Assert.assertNotNull(byteVector15);
        org.junit.Assert.assertNotNull(byteVector17);
        org.junit.Assert.assertNotNull(byteVector19);
        org.junit.Assert.assertNotNull(byteVector21);
        org.junit.Assert.assertNotNull(byteVector23);
        org.junit.Assert.assertNotNull(byteVector25);
        org.junit.Assert.assertNotNull(byteVector27);
        org.junit.Assert.assertNotNull(byteVector29);
        org.junit.Assert.assertNotNull(byteVector31);
        org.junit.Assert.assertNotNull(byteVector34);
        org.junit.Assert.assertNotNull(byteVector36);
        org.junit.Assert.assertNotNull(byteVector38);
        org.junit.Assert.assertNotNull(byteVector40);
        org.junit.Assert.assertNotNull(byteVector42);
        org.junit.Assert.assertNotNull(byteVector44);
        org.junit.Assert.assertNotNull(byteVector46);
        org.junit.Assert.assertNotNull(byteVector48);
        org.junit.Assert.assertNotNull(byteVector50);
        org.junit.Assert.assertNotNull(byteVector53);
        org.junit.Assert.assertNotNull(byteVector55);
        org.junit.Assert.assertNotNull(byteVector57);
        org.junit.Assert.assertNotNull(byteVector59);
        org.junit.Assert.assertNotNull(byteArray63);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray63), "[0, 10, 1]");
        org.junit.Assert.assertNotNull(byteVector66);
        org.junit.Assert.assertNotNull(byteVector69);
        org.junit.Assert.assertNotNull(byteVector72);
    }

    @Test
    public void test0478() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0478");
        org.mockito.asm.ByteVector byteVector0 = new org.mockito.asm.ByteVector();
        org.mockito.asm.ByteVector byteVector2 = byteVector0.putUTF8("hi!");
        org.mockito.asm.ByteVector byteVector4 = byteVector0.putLong((long) ' ');
        org.mockito.asm.ByteVector byteVector6 = byteVector4.putInt((int) (short) 100);
        java.lang.Class<?> wildcardClass7 = byteVector6.getClass();
        org.junit.Assert.assertNotNull(byteVector2);
        org.junit.Assert.assertNotNull(byteVector4);
        org.junit.Assert.assertNotNull(byteVector6);
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test0479() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0479");
        org.mockito.asm.ByteVector byteVector1 = new org.mockito.asm.ByteVector((int) (byte) 1);
        org.mockito.asm.ByteVector byteVector3 = byteVector1.putByte((int) (byte) 10);
        org.mockito.asm.ByteVector byteVector5 = byteVector1.putLong(1L);
        org.mockito.asm.ByteVector byteVector7 = byteVector1.putUTF8("");
        org.mockito.asm.ByteVector byteVector9 = byteVector1.putUTF8("");
        org.junit.Assert.assertNotNull(byteVector3);
        org.junit.Assert.assertNotNull(byteVector5);
        org.junit.Assert.assertNotNull(byteVector7);
        org.junit.Assert.assertNotNull(byteVector9);
    }

    @Test
    public void test0480() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0480");
        org.mockito.asm.ByteVector byteVector0 = new org.mockito.asm.ByteVector();
        org.mockito.asm.ByteVector byteVector2 = byteVector0.putUTF8("hi!");
        org.mockito.asm.ByteVector byteVector4 = byteVector0.putShort((int) (short) -1);
        org.mockito.asm.ByteVector byteVector6 = byteVector0.putInt((int) (byte) 10);
        org.mockito.asm.ByteVector byteVector8 = byteVector6.putUTF8("hi!");
        org.mockito.asm.ByteVector byteVector10 = byteVector8.putByte((int) (byte) 1);
        org.mockito.asm.ByteVector byteVector12 = byteVector10.putUTF8("hi!");
        org.mockito.asm.ByteVector byteVector14 = byteVector10.putInt((int) '4');
        org.mockito.asm.ByteVector byteVector16 = byteVector14.putInt(0);
        org.junit.Assert.assertNotNull(byteVector2);
        org.junit.Assert.assertNotNull(byteVector4);
        org.junit.Assert.assertNotNull(byteVector6);
        org.junit.Assert.assertNotNull(byteVector8);
        org.junit.Assert.assertNotNull(byteVector10);
        org.junit.Assert.assertNotNull(byteVector12);
        org.junit.Assert.assertNotNull(byteVector14);
        org.junit.Assert.assertNotNull(byteVector16);
    }

    @Test
    public void test0481() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0481");
        org.mockito.asm.ByteVector byteVector1 = new org.mockito.asm.ByteVector((int) '#');
        org.mockito.asm.ByteVector byteVector3 = byteVector1.putUTF8("hi!");
        org.mockito.asm.ByteVector byteVector5 = byteVector3.putLong((long) (short) 10);
        org.mockito.asm.ByteVector byteVector7 = byteVector3.putInt((int) '4');
        org.junit.Assert.assertNotNull(byteVector3);
        org.junit.Assert.assertNotNull(byteVector5);
        org.junit.Assert.assertNotNull(byteVector7);
    }

    @Test
    public void test0482() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0482");
        org.mockito.asm.ByteVector byteVector0 = new org.mockito.asm.ByteVector();
        org.mockito.asm.ByteVector byteVector2 = byteVector0.putUTF8("hi!");
        org.mockito.asm.ByteVector byteVector4 = byteVector0.putLong((long) (short) 1);
        org.mockito.asm.ByteVector byteVector6 = byteVector4.putUTF8("");
        org.mockito.asm.ByteVector byteVector8 = byteVector6.putShort((int) (short) 0);
        org.mockito.asm.ByteVector byteVector9 = new org.mockito.asm.ByteVector();
        org.mockito.asm.ByteVector byteVector11 = byteVector9.putUTF8("hi!");
        org.mockito.asm.ByteVector byteVector13 = byteVector11.putInt(0);
        org.mockito.asm.ByteVector byteVector15 = byteVector13.putByte((int) (short) 0);
        org.mockito.asm.ByteVector byteVector17 = byteVector13.putUTF8("");
        org.mockito.asm.ByteVector byteVector18 = new org.mockito.asm.ByteVector();
        org.mockito.asm.ByteVector byteVector20 = byteVector18.putUTF8("hi!");
        org.mockito.asm.ByteVector byteVector22 = byteVector18.putInt(0);
        org.mockito.asm.ByteVector byteVector24 = byteVector18.putShort((int) '4');
        org.mockito.asm.ByteVector byteVector26 = byteVector18.putByte(100);
        org.mockito.asm.ByteVector byteVector28 = byteVector26.putInt((int) (byte) 10);
        org.mockito.asm.ByteVector byteVector30 = byteVector26.putInt((int) (byte) 10);
        org.mockito.asm.ByteVector byteVector32 = byteVector30.putByte(100);
        org.mockito.asm.ByteVector byteVector33 = new org.mockito.asm.ByteVector();
        org.mockito.asm.ByteVector byteVector35 = byteVector33.putUTF8("hi!");
        org.mockito.asm.ByteVector byteVector37 = byteVector33.putInt(0);
        org.mockito.asm.ByteVector byteVector39 = byteVector37.putInt((int) ' ');
        org.mockito.asm.ByteVector byteVector41 = byteVector39.putLong(100L);
        byte[] byteArray45 = new byte[] { (byte) 0, (byte) 10, (byte) 1 };
        org.mockito.asm.ByteVector byteVector48 = byteVector39.putByteArray(byteArray45, 0, 0);
        org.mockito.asm.ByteVector byteVector51 = byteVector32.putByteArray(byteArray45, (int) (byte) 1, (int) (byte) 0);
        org.mockito.asm.ByteVector byteVector54 = byteVector13.putByteArray(byteArray45, (int) (short) 0, 0);
        // The following exception was thrown during execution in test generation
        try {
            org.mockito.asm.ByteVector byteVector57 = byteVector8.putByteArray(byteArray45, (int) (short) -1, (int) 'a');
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteVector2);
        org.junit.Assert.assertNotNull(byteVector4);
        org.junit.Assert.assertNotNull(byteVector6);
        org.junit.Assert.assertNotNull(byteVector8);
        org.junit.Assert.assertNotNull(byteVector11);
        org.junit.Assert.assertNotNull(byteVector13);
        org.junit.Assert.assertNotNull(byteVector15);
        org.junit.Assert.assertNotNull(byteVector17);
        org.junit.Assert.assertNotNull(byteVector20);
        org.junit.Assert.assertNotNull(byteVector22);
        org.junit.Assert.assertNotNull(byteVector24);
        org.junit.Assert.assertNotNull(byteVector26);
        org.junit.Assert.assertNotNull(byteVector28);
        org.junit.Assert.assertNotNull(byteVector30);
        org.junit.Assert.assertNotNull(byteVector32);
        org.junit.Assert.assertNotNull(byteVector35);
        org.junit.Assert.assertNotNull(byteVector37);
        org.junit.Assert.assertNotNull(byteVector39);
        org.junit.Assert.assertNotNull(byteVector41);
        org.junit.Assert.assertNotNull(byteArray45);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray45), "[0, 10, 1]");
        org.junit.Assert.assertNotNull(byteVector48);
        org.junit.Assert.assertNotNull(byteVector51);
        org.junit.Assert.assertNotNull(byteVector54);
    }

    @Test
    public void test0483() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0483");
        org.mockito.asm.ByteVector byteVector1 = new org.mockito.asm.ByteVector((int) (byte) 10);
        org.mockito.asm.ByteVector byteVector3 = byteVector1.putByte((int) '4');
        java.lang.Class<?> wildcardClass4 = byteVector3.getClass();
        org.junit.Assert.assertNotNull(byteVector3);
        org.junit.Assert.assertNotNull(wildcardClass4);
    }

    @Test
    public void test0484() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0484");
        org.mockito.asm.ByteVector byteVector0 = new org.mockito.asm.ByteVector();
        org.mockito.asm.ByteVector byteVector2 = byteVector0.putUTF8("hi!");
        org.mockito.asm.ByteVector byteVector4 = byteVector0.putShort((int) (short) -1);
        org.mockito.asm.ByteVector byteVector6 = byteVector0.putInt(0);
        org.mockito.asm.ByteVector byteVector8 = byteVector0.putUTF8("hi!");
        org.mockito.asm.ByteVector byteVector10 = byteVector0.putByte(100);
        org.mockito.asm.ByteVector byteVector12 = byteVector0.putInt((int) ' ');
        org.mockito.asm.ByteVector byteVector14 = byteVector0.putShort((int) (short) 1);
        org.mockito.asm.ByteVector byteVector16 = byteVector0.putByte((int) 'a');
        org.junit.Assert.assertNotNull(byteVector2);
        org.junit.Assert.assertNotNull(byteVector4);
        org.junit.Assert.assertNotNull(byteVector6);
        org.junit.Assert.assertNotNull(byteVector8);
        org.junit.Assert.assertNotNull(byteVector10);
        org.junit.Assert.assertNotNull(byteVector12);
        org.junit.Assert.assertNotNull(byteVector14);
        org.junit.Assert.assertNotNull(byteVector16);
    }

    @Test
    public void test0485() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0485");
        org.mockito.asm.ByteVector byteVector0 = new org.mockito.asm.ByteVector();
        org.mockito.asm.ByteVector byteVector2 = byteVector0.putUTF8("hi!");
        org.mockito.asm.ByteVector byteVector4 = byteVector0.putInt(0);
        org.mockito.asm.ByteVector byteVector5 = new org.mockito.asm.ByteVector();
        org.mockito.asm.ByteVector byteVector7 = byteVector5.putUTF8("hi!");
        org.mockito.asm.ByteVector byteVector9 = byteVector5.putLong((long) ' ');
        org.mockito.asm.ByteVector byteVector11 = byteVector9.putByte((int) 'a');
        org.mockito.asm.ByteVector byteVector13 = byteVector9.putByte((int) (short) -1);
        org.mockito.asm.ByteVector byteVector15 = byteVector9.putLong(0L);
        org.mockito.asm.ByteVector byteVector17 = byteVector9.putUTF8("hi!");
        org.mockito.asm.ByteVector byteVector19 = byteVector17.putUTF8("");
        org.mockito.asm.ByteVector byteVector21 = byteVector17.putInt((int) (byte) 10);
        org.mockito.asm.ByteVector byteVector23 = byteVector17.putByte(0);
        org.mockito.asm.ByteVector byteVector24 = new org.mockito.asm.ByteVector();
        org.mockito.asm.ByteVector byteVector26 = byteVector24.putUTF8("hi!");
        org.mockito.asm.ByteVector byteVector28 = byteVector24.putInt(0);
        org.mockito.asm.ByteVector byteVector30 = byteVector28.putInt((int) ' ');
        org.mockito.asm.ByteVector byteVector32 = byteVector30.putLong(100L);
        byte[] byteArray36 = new byte[] { (byte) 0, (byte) 10, (byte) 1 };
        org.mockito.asm.ByteVector byteVector39 = byteVector30.putByteArray(byteArray36, 0, 0);
        org.mockito.asm.ByteVector byteVector42 = byteVector23.putByteArray(byteArray36, (int) (short) 1, 0);
        // The following exception was thrown during execution in test generation
        try {
            org.mockito.asm.ByteVector byteVector45 = byteVector0.putByteArray(byteArray36, (int) '#', 100);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteVector2);
        org.junit.Assert.assertNotNull(byteVector4);
        org.junit.Assert.assertNotNull(byteVector7);
        org.junit.Assert.assertNotNull(byteVector9);
        org.junit.Assert.assertNotNull(byteVector11);
        org.junit.Assert.assertNotNull(byteVector13);
        org.junit.Assert.assertNotNull(byteVector15);
        org.junit.Assert.assertNotNull(byteVector17);
        org.junit.Assert.assertNotNull(byteVector19);
        org.junit.Assert.assertNotNull(byteVector21);
        org.junit.Assert.assertNotNull(byteVector23);
        org.junit.Assert.assertNotNull(byteVector26);
        org.junit.Assert.assertNotNull(byteVector28);
        org.junit.Assert.assertNotNull(byteVector30);
        org.junit.Assert.assertNotNull(byteVector32);
        org.junit.Assert.assertNotNull(byteArray36);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray36), "[0, 10, 1]");
        org.junit.Assert.assertNotNull(byteVector39);
        org.junit.Assert.assertNotNull(byteVector42);
    }

    @Test
    public void test0486() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0486");
        org.mockito.asm.ByteVector byteVector0 = new org.mockito.asm.ByteVector();
        org.mockito.asm.ByteVector byteVector2 = byteVector0.putUTF8("hi!");
        org.mockito.asm.ByteVector byteVector4 = byteVector0.putLong((long) ' ');
        org.mockito.asm.ByteVector byteVector6 = byteVector4.putByte((int) 'a');
        org.mockito.asm.ByteVector byteVector8 = byteVector4.putByte((int) (short) -1);
        org.mockito.asm.ByteVector byteVector10 = byteVector4.putLong(0L);
        org.mockito.asm.ByteVector byteVector12 = byteVector4.putUTF8("");
        org.mockito.asm.ByteVector byteVector14 = byteVector12.putInt((int) (byte) 1);
        org.mockito.asm.ByteVector byteVector16 = byteVector12.putShort((int) (short) 10);
        org.mockito.asm.ByteVector byteVector17 = new org.mockito.asm.ByteVector();
        org.mockito.asm.ByteVector byteVector19 = byteVector17.putUTF8("hi!");
        org.mockito.asm.ByteVector byteVector21 = byteVector19.putInt(0);
        org.mockito.asm.ByteVector byteVector23 = byteVector21.putByte((int) (short) 0);
        org.mockito.asm.ByteVector byteVector25 = byteVector21.putUTF8("");
        org.mockito.asm.ByteVector byteVector26 = new org.mockito.asm.ByteVector();
        org.mockito.asm.ByteVector byteVector28 = byteVector26.putUTF8("hi!");
        org.mockito.asm.ByteVector byteVector30 = byteVector26.putInt(0);
        org.mockito.asm.ByteVector byteVector32 = byteVector26.putShort((int) '4');
        org.mockito.asm.ByteVector byteVector34 = byteVector26.putByte(100);
        org.mockito.asm.ByteVector byteVector36 = byteVector34.putInt((int) (byte) 10);
        org.mockito.asm.ByteVector byteVector38 = byteVector34.putInt((int) (byte) 10);
        org.mockito.asm.ByteVector byteVector40 = byteVector38.putByte(100);
        org.mockito.asm.ByteVector byteVector41 = new org.mockito.asm.ByteVector();
        org.mockito.asm.ByteVector byteVector43 = byteVector41.putUTF8("hi!");
        org.mockito.asm.ByteVector byteVector45 = byteVector41.putInt(0);
        org.mockito.asm.ByteVector byteVector47 = byteVector45.putInt((int) ' ');
        org.mockito.asm.ByteVector byteVector49 = byteVector47.putLong(100L);
        byte[] byteArray53 = new byte[] { (byte) 0, (byte) 10, (byte) 1 };
        org.mockito.asm.ByteVector byteVector56 = byteVector47.putByteArray(byteArray53, 0, 0);
        org.mockito.asm.ByteVector byteVector59 = byteVector40.putByteArray(byteArray53, (int) (byte) 1, (int) (byte) 0);
        org.mockito.asm.ByteVector byteVector62 = byteVector21.putByteArray(byteArray53, (int) (short) 0, 0);
        // The following exception was thrown during execution in test generation
        try {
            org.mockito.asm.ByteVector byteVector65 = byteVector12.putByteArray(byteArray53, (int) (short) 10, (int) (short) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteVector2);
        org.junit.Assert.assertNotNull(byteVector4);
        org.junit.Assert.assertNotNull(byteVector6);
        org.junit.Assert.assertNotNull(byteVector8);
        org.junit.Assert.assertNotNull(byteVector10);
        org.junit.Assert.assertNotNull(byteVector12);
        org.junit.Assert.assertNotNull(byteVector14);
        org.junit.Assert.assertNotNull(byteVector16);
        org.junit.Assert.assertNotNull(byteVector19);
        org.junit.Assert.assertNotNull(byteVector21);
        org.junit.Assert.assertNotNull(byteVector23);
        org.junit.Assert.assertNotNull(byteVector25);
        org.junit.Assert.assertNotNull(byteVector28);
        org.junit.Assert.assertNotNull(byteVector30);
        org.junit.Assert.assertNotNull(byteVector32);
        org.junit.Assert.assertNotNull(byteVector34);
        org.junit.Assert.assertNotNull(byteVector36);
        org.junit.Assert.assertNotNull(byteVector38);
        org.junit.Assert.assertNotNull(byteVector40);
        org.junit.Assert.assertNotNull(byteVector43);
        org.junit.Assert.assertNotNull(byteVector45);
        org.junit.Assert.assertNotNull(byteVector47);
        org.junit.Assert.assertNotNull(byteVector49);
        org.junit.Assert.assertNotNull(byteArray53);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray53), "[0, 10, 1]");
        org.junit.Assert.assertNotNull(byteVector56);
        org.junit.Assert.assertNotNull(byteVector59);
        org.junit.Assert.assertNotNull(byteVector62);
    }

    @Test
    public void test0487() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0487");
        org.mockito.asm.ByteVector byteVector0 = new org.mockito.asm.ByteVector();
        org.mockito.asm.ByteVector byteVector2 = byteVector0.putUTF8("hi!");
        org.mockito.asm.ByteVector byteVector4 = byteVector0.putShort((int) (short) -1);
        org.mockito.asm.ByteVector byteVector6 = byteVector0.putLong(0L);
        org.mockito.asm.ByteVector byteVector8 = byteVector0.putShort((int) (byte) -1);
        org.mockito.asm.ByteVector byteVector10 = byteVector0.putShort((int) (short) -1);
        org.mockito.asm.ByteVector byteVector12 = byteVector10.putShort((int) (short) 10);
        java.lang.Class<?> wildcardClass13 = byteVector12.getClass();
        org.junit.Assert.assertNotNull(byteVector2);
        org.junit.Assert.assertNotNull(byteVector4);
        org.junit.Assert.assertNotNull(byteVector6);
        org.junit.Assert.assertNotNull(byteVector8);
        org.junit.Assert.assertNotNull(byteVector10);
        org.junit.Assert.assertNotNull(byteVector12);
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test0488() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0488");
        org.mockito.asm.ByteVector byteVector1 = new org.mockito.asm.ByteVector((int) (byte) 100);
        org.mockito.asm.ByteVector byteVector3 = byteVector1.putShort((int) (short) 100);
        org.mockito.asm.ByteVector byteVector4 = new org.mockito.asm.ByteVector();
        org.mockito.asm.ByteVector byteVector6 = byteVector4.putUTF8("hi!");
        org.mockito.asm.ByteVector byteVector8 = byteVector4.putLong((long) ' ');
        org.mockito.asm.ByteVector byteVector10 = byteVector8.putByte((int) 'a');
        org.mockito.asm.ByteVector byteVector12 = byteVector8.putByte((int) (short) -1);
        org.mockito.asm.ByteVector byteVector14 = byteVector8.putLong(0L);
        org.mockito.asm.ByteVector byteVector16 = byteVector8.putUTF8("hi!");
        org.mockito.asm.ByteVector byteVector18 = byteVector16.putUTF8("");
        org.mockito.asm.ByteVector byteVector20 = byteVector16.putInt((int) (byte) 10);
        org.mockito.asm.ByteVector byteVector22 = byteVector16.putByte(0);
        org.mockito.asm.ByteVector byteVector23 = new org.mockito.asm.ByteVector();
        org.mockito.asm.ByteVector byteVector25 = byteVector23.putUTF8("hi!");
        org.mockito.asm.ByteVector byteVector27 = byteVector23.putInt(0);
        org.mockito.asm.ByteVector byteVector29 = byteVector27.putInt((int) ' ');
        org.mockito.asm.ByteVector byteVector31 = byteVector29.putLong(100L);
        byte[] byteArray35 = new byte[] { (byte) 0, (byte) 10, (byte) 1 };
        org.mockito.asm.ByteVector byteVector38 = byteVector29.putByteArray(byteArray35, 0, 0);
        org.mockito.asm.ByteVector byteVector41 = byteVector22.putByteArray(byteArray35, (int) (short) 1, 0);
        org.mockito.asm.ByteVector byteVector44 = byteVector1.putByteArray(byteArray35, 0, (int) (byte) 1);
        org.mockito.asm.ByteVector byteVector46 = byteVector44.putUTF8("hi!");
        org.junit.Assert.assertNotNull(byteVector3);
        org.junit.Assert.assertNotNull(byteVector6);
        org.junit.Assert.assertNotNull(byteVector8);
        org.junit.Assert.assertNotNull(byteVector10);
        org.junit.Assert.assertNotNull(byteVector12);
        org.junit.Assert.assertNotNull(byteVector14);
        org.junit.Assert.assertNotNull(byteVector16);
        org.junit.Assert.assertNotNull(byteVector18);
        org.junit.Assert.assertNotNull(byteVector20);
        org.junit.Assert.assertNotNull(byteVector22);
        org.junit.Assert.assertNotNull(byteVector25);
        org.junit.Assert.assertNotNull(byteVector27);
        org.junit.Assert.assertNotNull(byteVector29);
        org.junit.Assert.assertNotNull(byteVector31);
        org.junit.Assert.assertNotNull(byteArray35);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray35), "[0, 10, 1]");
        org.junit.Assert.assertNotNull(byteVector38);
        org.junit.Assert.assertNotNull(byteVector41);
        org.junit.Assert.assertNotNull(byteVector44);
        org.junit.Assert.assertNotNull(byteVector46);
    }

    @Test
    public void test0489() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0489");
        org.mockito.asm.ByteVector byteVector0 = new org.mockito.asm.ByteVector();
        org.mockito.asm.ByteVector byteVector2 = byteVector0.putUTF8("hi!");
        org.mockito.asm.ByteVector byteVector4 = byteVector0.putShort((int) (byte) 100);
        org.mockito.asm.ByteVector byteVector6 = byteVector0.putLong((-1L));
        java.lang.Class<?> wildcardClass7 = byteVector6.getClass();
        org.junit.Assert.assertNotNull(byteVector2);
        org.junit.Assert.assertNotNull(byteVector4);
        org.junit.Assert.assertNotNull(byteVector6);
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test0490() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0490");
        org.mockito.asm.ByteVector byteVector0 = new org.mockito.asm.ByteVector();
        org.mockito.asm.ByteVector byteVector2 = byteVector0.putUTF8("hi!");
        org.mockito.asm.ByteVector byteVector4 = byteVector2.putLong((long) (byte) 10);
        org.mockito.asm.ByteVector byteVector6 = byteVector4.putUTF8("hi!");
        org.mockito.asm.ByteVector byteVector8 = byteVector4.putInt((int) (byte) 100);
        org.mockito.asm.ByteVector byteVector10 = byteVector8.putUTF8("");
        org.mockito.asm.ByteVector byteVector11 = new org.mockito.asm.ByteVector();
        org.mockito.asm.ByteVector byteVector13 = byteVector11.putUTF8("hi!");
        org.mockito.asm.ByteVector byteVector15 = byteVector11.putLong((long) ' ');
        org.mockito.asm.ByteVector byteVector17 = byteVector15.putByte((int) 'a');
        org.mockito.asm.ByteVector byteVector19 = byteVector15.putByte((int) (short) -1);
        org.mockito.asm.ByteVector byteVector21 = byteVector15.putLong(0L);
        org.mockito.asm.ByteVector byteVector23 = byteVector21.putByte(0);
        org.mockito.asm.ByteVector byteVector25 = byteVector23.putLong(1L);
        org.mockito.asm.ByteVector byteVector27 = byteVector25.putShort((int) 'a');
        org.mockito.asm.ByteVector byteVector29 = byteVector25.putLong((long) 10);
        org.mockito.asm.ByteVector byteVector31 = byteVector25.putUTF8("");
        org.mockito.asm.ByteVector byteVector32 = new org.mockito.asm.ByteVector();
        org.mockito.asm.ByteVector byteVector34 = byteVector32.putUTF8("hi!");
        org.mockito.asm.ByteVector byteVector36 = byteVector34.putLong((long) (byte) 10);
        org.mockito.asm.ByteVector byteVector38 = byteVector36.putUTF8("hi!");
        org.mockito.asm.ByteVector byteVector40 = byteVector36.putLong((long) (short) -1);
        org.mockito.asm.ByteVector byteVector42 = byteVector40.putInt(10);
        org.mockito.asm.ByteVector byteVector44 = byteVector40.putByte((int) (short) 1);
        org.mockito.asm.ByteVector byteVector46 = byteVector40.putInt((int) (short) -1);
        org.mockito.asm.ByteVector byteVector48 = byteVector40.putUTF8("hi!");
        org.mockito.asm.ByteVector byteVector49 = new org.mockito.asm.ByteVector();
        org.mockito.asm.ByteVector byteVector51 = byteVector49.putUTF8("hi!");
        org.mockito.asm.ByteVector byteVector53 = byteVector49.putLong((long) ' ');
        org.mockito.asm.ByteVector byteVector55 = byteVector53.putByte((int) 'a');
        org.mockito.asm.ByteVector byteVector57 = byteVector53.putByte((int) (short) -1);
        org.mockito.asm.ByteVector byteVector59 = byteVector53.putLong(0L);
        org.mockito.asm.ByteVector byteVector61 = byteVector53.putUTF8("hi!");
        org.mockito.asm.ByteVector byteVector63 = byteVector61.putUTF8("");
        org.mockito.asm.ByteVector byteVector65 = byteVector63.putLong((long) (byte) 10);
        org.mockito.asm.ByteVector byteVector67 = byteVector63.putLong((long) (short) 100);
        byte[] byteArray72 = new byte[] { (byte) 1, (byte) 0, (byte) 0, (byte) -1 };
        org.mockito.asm.ByteVector byteVector75 = byteVector63.putByteArray(byteArray72, 0, 0);
        org.mockito.asm.ByteVector byteVector78 = byteVector48.putByteArray(byteArray72, (int) (byte) 0, (int) (short) 1);
        org.mockito.asm.ByteVector byteVector81 = byteVector25.putByteArray(byteArray72, (int) (short) 0, (int) (short) 0);
        // The following exception was thrown during execution in test generation
        try {
            org.mockito.asm.ByteVector byteVector84 = byteVector10.putByteArray(byteArray72, (int) (short) 100, 10);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteVector2);
        org.junit.Assert.assertNotNull(byteVector4);
        org.junit.Assert.assertNotNull(byteVector6);
        org.junit.Assert.assertNotNull(byteVector8);
        org.junit.Assert.assertNotNull(byteVector10);
        org.junit.Assert.assertNotNull(byteVector13);
        org.junit.Assert.assertNotNull(byteVector15);
        org.junit.Assert.assertNotNull(byteVector17);
        org.junit.Assert.assertNotNull(byteVector19);
        org.junit.Assert.assertNotNull(byteVector21);
        org.junit.Assert.assertNotNull(byteVector23);
        org.junit.Assert.assertNotNull(byteVector25);
        org.junit.Assert.assertNotNull(byteVector27);
        org.junit.Assert.assertNotNull(byteVector29);
        org.junit.Assert.assertNotNull(byteVector31);
        org.junit.Assert.assertNotNull(byteVector34);
        org.junit.Assert.assertNotNull(byteVector36);
        org.junit.Assert.assertNotNull(byteVector38);
        org.junit.Assert.assertNotNull(byteVector40);
        org.junit.Assert.assertNotNull(byteVector42);
        org.junit.Assert.assertNotNull(byteVector44);
        org.junit.Assert.assertNotNull(byteVector46);
        org.junit.Assert.assertNotNull(byteVector48);
        org.junit.Assert.assertNotNull(byteVector51);
        org.junit.Assert.assertNotNull(byteVector53);
        org.junit.Assert.assertNotNull(byteVector55);
        org.junit.Assert.assertNotNull(byteVector57);
        org.junit.Assert.assertNotNull(byteVector59);
        org.junit.Assert.assertNotNull(byteVector61);
        org.junit.Assert.assertNotNull(byteVector63);
        org.junit.Assert.assertNotNull(byteVector65);
        org.junit.Assert.assertNotNull(byteVector67);
        org.junit.Assert.assertNotNull(byteArray72);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray72), "[1, 0, 0, -1]");
        org.junit.Assert.assertNotNull(byteVector75);
        org.junit.Assert.assertNotNull(byteVector78);
        org.junit.Assert.assertNotNull(byteVector81);
    }

    @Test
    public void test0491() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0491");
        org.mockito.asm.ByteVector byteVector0 = new org.mockito.asm.ByteVector();
        org.mockito.asm.ByteVector byteVector2 = byteVector0.putUTF8("hi!");
        org.mockito.asm.ByteVector byteVector4 = byteVector0.putShort((int) (short) -1);
        org.mockito.asm.ByteVector byteVector6 = byteVector0.putInt((int) (byte) 10);
        org.mockito.asm.ByteVector byteVector8 = byteVector6.putUTF8("hi!");
        org.mockito.asm.ByteVector byteVector10 = byteVector8.putShort(0);
        org.mockito.asm.ByteVector byteVector12 = byteVector10.putLong(10L);
        org.mockito.asm.ByteVector byteVector14 = byteVector12.putByte((int) 'a');
        byte[] byteArray17 = new byte[] { (byte) 100, (byte) 10 };
        // The following exception was thrown during execution in test generation
        try {
            org.mockito.asm.ByteVector byteVector20 = byteVector14.putByteArray(byteArray17, 0, 10);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteVector2);
        org.junit.Assert.assertNotNull(byteVector4);
        org.junit.Assert.assertNotNull(byteVector6);
        org.junit.Assert.assertNotNull(byteVector8);
        org.junit.Assert.assertNotNull(byteVector10);
        org.junit.Assert.assertNotNull(byteVector12);
        org.junit.Assert.assertNotNull(byteVector14);
        org.junit.Assert.assertNotNull(byteArray17);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray17), "[100, 10]");
    }

    @Test
    public void test0492() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0492");
        org.mockito.asm.ByteVector byteVector0 = new org.mockito.asm.ByteVector();
        org.mockito.asm.ByteVector byteVector2 = byteVector0.putUTF8("hi!");
        org.mockito.asm.ByteVector byteVector4 = byteVector0.putLong((long) ' ');
        org.mockito.asm.ByteVector byteVector6 = byteVector4.putByte((int) 'a');
        org.mockito.asm.ByteVector byteVector8 = byteVector4.putShort(100);
        org.mockito.asm.ByteVector byteVector10 = byteVector8.putByte((int) (short) 0);
        org.mockito.asm.ByteVector byteVector12 = byteVector8.putInt((int) (byte) 0);
        org.mockito.asm.ByteVector byteVector13 = new org.mockito.asm.ByteVector();
        org.mockito.asm.ByteVector byteVector15 = byteVector13.putUTF8("hi!");
        org.mockito.asm.ByteVector byteVector17 = byteVector13.putLong((long) ' ');
        org.mockito.asm.ByteVector byteVector19 = byteVector17.putByte((int) 'a');
        org.mockito.asm.ByteVector byteVector21 = byteVector17.putByte((int) (short) -1);
        org.mockito.asm.ByteVector byteVector23 = byteVector17.putLong(0L);
        org.mockito.asm.ByteVector byteVector25 = byteVector17.putUTF8("hi!");
        org.mockito.asm.ByteVector byteVector27 = byteVector25.putUTF8("");
        org.mockito.asm.ByteVector byteVector29 = byteVector27.putLong((long) (byte) 10);
        org.mockito.asm.ByteVector byteVector31 = byteVector27.putLong((long) (short) 100);
        byte[] byteArray36 = new byte[] { (byte) 1, (byte) 0, (byte) 0, (byte) -1 };
        org.mockito.asm.ByteVector byteVector39 = byteVector27.putByteArray(byteArray36, 0, 0);
        // The following exception was thrown during execution in test generation
        try {
            org.mockito.asm.ByteVector byteVector42 = byteVector8.putByteArray(byteArray36, (int) 'a', 100);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteVector2);
        org.junit.Assert.assertNotNull(byteVector4);
        org.junit.Assert.assertNotNull(byteVector6);
        org.junit.Assert.assertNotNull(byteVector8);
        org.junit.Assert.assertNotNull(byteVector10);
        org.junit.Assert.assertNotNull(byteVector12);
        org.junit.Assert.assertNotNull(byteVector15);
        org.junit.Assert.assertNotNull(byteVector17);
        org.junit.Assert.assertNotNull(byteVector19);
        org.junit.Assert.assertNotNull(byteVector21);
        org.junit.Assert.assertNotNull(byteVector23);
        org.junit.Assert.assertNotNull(byteVector25);
        org.junit.Assert.assertNotNull(byteVector27);
        org.junit.Assert.assertNotNull(byteVector29);
        org.junit.Assert.assertNotNull(byteVector31);
        org.junit.Assert.assertNotNull(byteArray36);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray36), "[1, 0, 0, -1]");
        org.junit.Assert.assertNotNull(byteVector39);
    }

    @Test
    public void test0493() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0493");
        org.mockito.asm.ByteVector byteVector1 = new org.mockito.asm.ByteVector((int) '#');
        org.mockito.asm.ByteVector byteVector3 = byteVector1.putLong(100L);
        org.mockito.asm.ByteVector byteVector5 = byteVector1.putUTF8("");
        org.mockito.asm.ByteVector byteVector7 = byteVector1.putUTF8("hi!");
        org.mockito.asm.ByteVector byteVector9 = byteVector7.putLong((long) (short) 0);
        org.mockito.asm.ByteVector byteVector11 = byteVector9.putLong((long) 1);
        org.mockito.asm.ByteVector byteVector13 = byteVector11.putInt(10);
        org.mockito.asm.ByteVector byteVector15 = byteVector11.putInt((int) 'a');
        org.mockito.asm.ByteVector byteVector16 = new org.mockito.asm.ByteVector();
        org.mockito.asm.ByteVector byteVector18 = byteVector16.putUTF8("hi!");
        org.mockito.asm.ByteVector byteVector20 = byteVector16.putLong((long) ' ');
        org.mockito.asm.ByteVector byteVector22 = byteVector20.putByte((int) 'a');
        org.mockito.asm.ByteVector byteVector24 = byteVector20.putByte((int) (short) -1);
        org.mockito.asm.ByteVector byteVector26 = byteVector20.putLong(0L);
        org.mockito.asm.ByteVector byteVector28 = byteVector26.putInt((int) (short) -1);
        org.mockito.asm.ByteVector byteVector30 = byteVector28.putByte(100);
        org.mockito.asm.ByteVector byteVector32 = byteVector30.putUTF8("hi!");
        org.mockito.asm.ByteVector byteVector34 = byteVector30.putLong((long) (short) 0);
        org.mockito.asm.ByteVector byteVector35 = new org.mockito.asm.ByteVector();
        org.mockito.asm.ByteVector byteVector37 = byteVector35.putUTF8("hi!");
        org.mockito.asm.ByteVector byteVector39 = byteVector35.putLong((long) ' ');
        org.mockito.asm.ByteVector byteVector41 = byteVector39.putByte((int) 'a');
        org.mockito.asm.ByteVector byteVector43 = byteVector39.putByte((int) (short) -1);
        org.mockito.asm.ByteVector byteVector45 = byteVector39.putLong(0L);
        org.mockito.asm.ByteVector byteVector47 = byteVector39.putUTF8("hi!");
        org.mockito.asm.ByteVector byteVector49 = byteVector47.putUTF8("");
        org.mockito.asm.ByteVector byteVector51 = byteVector47.putInt((int) (byte) 10);
        org.mockito.asm.ByteVector byteVector53 = byteVector47.putByte(0);
        org.mockito.asm.ByteVector byteVector54 = new org.mockito.asm.ByteVector();
        org.mockito.asm.ByteVector byteVector56 = byteVector54.putUTF8("hi!");
        org.mockito.asm.ByteVector byteVector58 = byteVector54.putInt(0);
        org.mockito.asm.ByteVector byteVector60 = byteVector58.putInt((int) ' ');
        org.mockito.asm.ByteVector byteVector62 = byteVector60.putLong(100L);
        byte[] byteArray66 = new byte[] { (byte) 0, (byte) 10, (byte) 1 };
        org.mockito.asm.ByteVector byteVector69 = byteVector60.putByteArray(byteArray66, 0, 0);
        org.mockito.asm.ByteVector byteVector72 = byteVector53.putByteArray(byteArray66, (int) (short) 1, 0);
        org.mockito.asm.ByteVector byteVector75 = byteVector34.putByteArray(byteArray66, (int) (byte) 0, (int) (byte) 1);
        // The following exception was thrown during execution in test generation
        try {
            org.mockito.asm.ByteVector byteVector78 = byteVector15.putByteArray(byteArray66, (int) (byte) 1, (int) (short) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteVector3);
        org.junit.Assert.assertNotNull(byteVector5);
        org.junit.Assert.assertNotNull(byteVector7);
        org.junit.Assert.assertNotNull(byteVector9);
        org.junit.Assert.assertNotNull(byteVector11);
        org.junit.Assert.assertNotNull(byteVector13);
        org.junit.Assert.assertNotNull(byteVector15);
        org.junit.Assert.assertNotNull(byteVector18);
        org.junit.Assert.assertNotNull(byteVector20);
        org.junit.Assert.assertNotNull(byteVector22);
        org.junit.Assert.assertNotNull(byteVector24);
        org.junit.Assert.assertNotNull(byteVector26);
        org.junit.Assert.assertNotNull(byteVector28);
        org.junit.Assert.assertNotNull(byteVector30);
        org.junit.Assert.assertNotNull(byteVector32);
        org.junit.Assert.assertNotNull(byteVector34);
        org.junit.Assert.assertNotNull(byteVector37);
        org.junit.Assert.assertNotNull(byteVector39);
        org.junit.Assert.assertNotNull(byteVector41);
        org.junit.Assert.assertNotNull(byteVector43);
        org.junit.Assert.assertNotNull(byteVector45);
        org.junit.Assert.assertNotNull(byteVector47);
        org.junit.Assert.assertNotNull(byteVector49);
        org.junit.Assert.assertNotNull(byteVector51);
        org.junit.Assert.assertNotNull(byteVector53);
        org.junit.Assert.assertNotNull(byteVector56);
        org.junit.Assert.assertNotNull(byteVector58);
        org.junit.Assert.assertNotNull(byteVector60);
        org.junit.Assert.assertNotNull(byteVector62);
        org.junit.Assert.assertNotNull(byteArray66);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray66), "[0, 10, 1]");
        org.junit.Assert.assertNotNull(byteVector69);
        org.junit.Assert.assertNotNull(byteVector72);
        org.junit.Assert.assertNotNull(byteVector75);
    }

    @Test
    public void test0494() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0494");
        org.mockito.asm.ByteVector byteVector0 = new org.mockito.asm.ByteVector();
        org.mockito.asm.ByteVector byteVector2 = byteVector0.putUTF8("hi!");
        org.mockito.asm.ByteVector byteVector4 = byteVector2.putLong((long) (byte) 10);
        org.mockito.asm.ByteVector byteVector6 = byteVector4.putUTF8("hi!");
        org.mockito.asm.ByteVector byteVector8 = byteVector4.putLong((long) (short) -1);
        byte[] byteArray9 = null;
        org.mockito.asm.ByteVector byteVector12 = byteVector4.putByteArray(byteArray9, (int) (short) -1, (int) '4');
        org.mockito.asm.ByteVector byteVector14 = byteVector12.putLong(10L);
        org.mockito.asm.ByteVector byteVector16 = byteVector12.putLong((long) 'a');
        org.junit.Assert.assertNotNull(byteVector2);
        org.junit.Assert.assertNotNull(byteVector4);
        org.junit.Assert.assertNotNull(byteVector6);
        org.junit.Assert.assertNotNull(byteVector8);
        org.junit.Assert.assertNotNull(byteVector12);
        org.junit.Assert.assertNotNull(byteVector14);
        org.junit.Assert.assertNotNull(byteVector16);
    }

    @Test
    public void test0495() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0495");
        org.mockito.asm.ByteVector byteVector1 = new org.mockito.asm.ByteVector((int) '#');
        org.mockito.asm.ByteVector byteVector3 = byteVector1.putLong(100L);
        org.mockito.asm.ByteVector byteVector5 = byteVector1.putUTF8("");
        org.mockito.asm.ByteVector byteVector7 = byteVector1.putUTF8("hi!");
        org.mockito.asm.ByteVector byteVector9 = byteVector7.putLong((long) (short) 0);
        java.lang.Class<?> wildcardClass10 = byteVector7.getClass();
        org.junit.Assert.assertNotNull(byteVector3);
        org.junit.Assert.assertNotNull(byteVector5);
        org.junit.Assert.assertNotNull(byteVector7);
        org.junit.Assert.assertNotNull(byteVector9);
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test0496() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0496");
        org.mockito.asm.ByteVector byteVector0 = new org.mockito.asm.ByteVector();
        org.mockito.asm.ByteVector byteVector2 = byteVector0.putUTF8("hi!");
        org.mockito.asm.ByteVector byteVector4 = byteVector2.putLong((long) (byte) 10);
        org.mockito.asm.ByteVector byteVector6 = byteVector4.putUTF8("hi!");
        org.mockito.asm.ByteVector byteVector8 = byteVector4.putLong((long) 10);
        org.mockito.asm.ByteVector byteVector10 = byteVector8.putLong(0L);
        org.mockito.asm.ByteVector byteVector12 = byteVector10.putUTF8("hi!");
        org.mockito.asm.ByteVector byteVector14 = byteVector12.putInt(1);
        org.mockito.asm.ByteVector byteVector16 = byteVector12.putByte((int) '4');
        org.mockito.asm.ByteVector byteVector18 = byteVector16.putByte(0);
        org.mockito.asm.ByteVector byteVector20 = byteVector16.putShort(0);
        org.junit.Assert.assertNotNull(byteVector2);
        org.junit.Assert.assertNotNull(byteVector4);
        org.junit.Assert.assertNotNull(byteVector6);
        org.junit.Assert.assertNotNull(byteVector8);
        org.junit.Assert.assertNotNull(byteVector10);
        org.junit.Assert.assertNotNull(byteVector12);
        org.junit.Assert.assertNotNull(byteVector14);
        org.junit.Assert.assertNotNull(byteVector16);
        org.junit.Assert.assertNotNull(byteVector18);
        org.junit.Assert.assertNotNull(byteVector20);
    }

    @Test
    public void test0497() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0497");
        org.mockito.asm.ByteVector byteVector1 = new org.mockito.asm.ByteVector((int) '#');
        org.mockito.asm.ByteVector byteVector3 = byteVector1.putLong(100L);
        org.mockito.asm.ByteVector byteVector5 = byteVector3.putLong(1L);
        org.mockito.asm.ByteVector byteVector7 = new org.mockito.asm.ByteVector((int) (short) 0);
        org.mockito.asm.ByteVector byteVector8 = new org.mockito.asm.ByteVector();
        org.mockito.asm.ByteVector byteVector10 = byteVector8.putUTF8("hi!");
        org.mockito.asm.ByteVector byteVector12 = byteVector8.putInt(0);
        org.mockito.asm.ByteVector byteVector14 = byteVector12.putInt((int) ' ');
        org.mockito.asm.ByteVector byteVector16 = byteVector14.putLong(100L);
        byte[] byteArray20 = new byte[] { (byte) 0, (byte) 10, (byte) 1 };
        org.mockito.asm.ByteVector byteVector23 = byteVector14.putByteArray(byteArray20, 0, 0);
        org.mockito.asm.ByteVector byteVector26 = byteVector7.putByteArray(byteArray20, 1, (int) (short) 0);
        // The following exception was thrown during execution in test generation
        try {
            org.mockito.asm.ByteVector byteVector29 = byteVector3.putByteArray(byteArray20, 100, (int) (byte) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteVector3);
        org.junit.Assert.assertNotNull(byteVector5);
        org.junit.Assert.assertNotNull(byteVector10);
        org.junit.Assert.assertNotNull(byteVector12);
        org.junit.Assert.assertNotNull(byteVector14);
        org.junit.Assert.assertNotNull(byteVector16);
        org.junit.Assert.assertNotNull(byteArray20);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray20), "[0, 10, 1]");
        org.junit.Assert.assertNotNull(byteVector23);
        org.junit.Assert.assertNotNull(byteVector26);
    }

    @Test
    public void test0498() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0498");
        org.mockito.asm.ByteVector byteVector0 = new org.mockito.asm.ByteVector();
        org.mockito.asm.ByteVector byteVector2 = byteVector0.putUTF8("hi!");
        org.mockito.asm.ByteVector byteVector4 = byteVector0.putShort((int) (short) -1);
        org.mockito.asm.ByteVector byteVector6 = byteVector0.putByte((int) ' ');
        org.mockito.asm.ByteVector byteVector8 = byteVector0.putUTF8("hi!");
        org.mockito.asm.ByteVector byteVector10 = new org.mockito.asm.ByteVector((int) '#');
        org.mockito.asm.ByteVector byteVector12 = byteVector10.putInt(100);
        org.mockito.asm.ByteVector byteVector14 = byteVector10.putUTF8("");
        org.mockito.asm.ByteVector byteVector15 = new org.mockito.asm.ByteVector();
        org.mockito.asm.ByteVector byteVector17 = byteVector15.putUTF8("hi!");
        org.mockito.asm.ByteVector byteVector19 = byteVector17.putInt(0);
        org.mockito.asm.ByteVector byteVector21 = byteVector19.putByte((int) (short) 0);
        org.mockito.asm.ByteVector byteVector23 = byteVector19.putUTF8("");
        org.mockito.asm.ByteVector byteVector24 = new org.mockito.asm.ByteVector();
        org.mockito.asm.ByteVector byteVector26 = byteVector24.putUTF8("hi!");
        org.mockito.asm.ByteVector byteVector28 = byteVector24.putInt(0);
        org.mockito.asm.ByteVector byteVector30 = byteVector24.putShort((int) '4');
        org.mockito.asm.ByteVector byteVector32 = byteVector24.putByte(100);
        org.mockito.asm.ByteVector byteVector34 = byteVector32.putInt((int) (byte) 10);
        org.mockito.asm.ByteVector byteVector36 = byteVector32.putInt((int) (byte) 10);
        org.mockito.asm.ByteVector byteVector38 = byteVector36.putByte(100);
        org.mockito.asm.ByteVector byteVector39 = new org.mockito.asm.ByteVector();
        org.mockito.asm.ByteVector byteVector41 = byteVector39.putUTF8("hi!");
        org.mockito.asm.ByteVector byteVector43 = byteVector39.putInt(0);
        org.mockito.asm.ByteVector byteVector45 = byteVector43.putInt((int) ' ');
        org.mockito.asm.ByteVector byteVector47 = byteVector45.putLong(100L);
        byte[] byteArray51 = new byte[] { (byte) 0, (byte) 10, (byte) 1 };
        org.mockito.asm.ByteVector byteVector54 = byteVector45.putByteArray(byteArray51, 0, 0);
        org.mockito.asm.ByteVector byteVector57 = byteVector38.putByteArray(byteArray51, (int) (byte) 1, (int) (byte) 0);
        org.mockito.asm.ByteVector byteVector60 = byteVector19.putByteArray(byteArray51, (int) (short) 0, 0);
        org.mockito.asm.ByteVector byteVector63 = byteVector14.putByteArray(byteArray51, (int) (byte) 0, (int) (short) 1);
        // The following exception was thrown during execution in test generation
        try {
            org.mockito.asm.ByteVector byteVector66 = byteVector8.putByteArray(byteArray51, (int) (byte) -1, (int) ' ');
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteVector2);
        org.junit.Assert.assertNotNull(byteVector4);
        org.junit.Assert.assertNotNull(byteVector6);
        org.junit.Assert.assertNotNull(byteVector8);
        org.junit.Assert.assertNotNull(byteVector12);
        org.junit.Assert.assertNotNull(byteVector14);
        org.junit.Assert.assertNotNull(byteVector17);
        org.junit.Assert.assertNotNull(byteVector19);
        org.junit.Assert.assertNotNull(byteVector21);
        org.junit.Assert.assertNotNull(byteVector23);
        org.junit.Assert.assertNotNull(byteVector26);
        org.junit.Assert.assertNotNull(byteVector28);
        org.junit.Assert.assertNotNull(byteVector30);
        org.junit.Assert.assertNotNull(byteVector32);
        org.junit.Assert.assertNotNull(byteVector34);
        org.junit.Assert.assertNotNull(byteVector36);
        org.junit.Assert.assertNotNull(byteVector38);
        org.junit.Assert.assertNotNull(byteVector41);
        org.junit.Assert.assertNotNull(byteVector43);
        org.junit.Assert.assertNotNull(byteVector45);
        org.junit.Assert.assertNotNull(byteVector47);
        org.junit.Assert.assertNotNull(byteArray51);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray51), "[0, 10, 1]");
        org.junit.Assert.assertNotNull(byteVector54);
        org.junit.Assert.assertNotNull(byteVector57);
        org.junit.Assert.assertNotNull(byteVector60);
        org.junit.Assert.assertNotNull(byteVector63);
    }

    @Test
    public void test0499() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0499");
        org.mockito.asm.ByteVector byteVector0 = new org.mockito.asm.ByteVector();
        org.mockito.asm.ByteVector byteVector2 = byteVector0.putUTF8("hi!");
        org.mockito.asm.ByteVector byteVector4 = byteVector2.putInt((int) (byte) 10);
        org.mockito.asm.ByteVector byteVector6 = byteVector4.putUTF8("");
        java.lang.Class<?> wildcardClass7 = byteVector4.getClass();
        org.junit.Assert.assertNotNull(byteVector2);
        org.junit.Assert.assertNotNull(byteVector4);
        org.junit.Assert.assertNotNull(byteVector6);
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test0500() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0500");
        org.mockito.asm.ByteVector byteVector0 = new org.mockito.asm.ByteVector();
        org.mockito.asm.ByteVector byteVector2 = byteVector0.putUTF8("hi!");
        org.mockito.asm.ByteVector byteVector4 = byteVector0.putLong((long) ' ');
        org.mockito.asm.ByteVector byteVector6 = byteVector4.putByte((int) 'a');
        org.mockito.asm.ByteVector byteVector8 = byteVector4.putByte((int) (short) -1);
        org.mockito.asm.ByteVector byteVector10 = byteVector4.putLong(0L);
        org.mockito.asm.ByteVector byteVector12 = byteVector10.putByte(0);
        org.mockito.asm.ByteVector byteVector14 = byteVector12.putLong(1L);
        org.mockito.asm.ByteVector byteVector16 = byteVector14.putShort((int) 'a');
        org.mockito.asm.ByteVector byteVector18 = byteVector14.putLong((long) 10);
        org.mockito.asm.ByteVector byteVector20 = byteVector14.putInt((int) 'a');
        org.mockito.asm.ByteVector byteVector21 = new org.mockito.asm.ByteVector();
        org.mockito.asm.ByteVector byteVector23 = byteVector21.putUTF8("hi!");
        org.mockito.asm.ByteVector byteVector25 = byteVector21.putLong((long) ' ');
        org.mockito.asm.ByteVector byteVector27 = byteVector25.putByte((int) 'a');
        org.mockito.asm.ByteVector byteVector29 = byteVector25.putByte((int) (short) -1);
        org.mockito.asm.ByteVector byteVector31 = byteVector25.putLong(0L);
        org.mockito.asm.ByteVector byteVector33 = byteVector31.putByte(0);
        org.mockito.asm.ByteVector byteVector35 = byteVector33.putLong(1L);
        org.mockito.asm.ByteVector byteVector37 = byteVector35.putShort((int) 'a');
        org.mockito.asm.ByteVector byteVector39 = byteVector35.putLong((long) 10);
        org.mockito.asm.ByteVector byteVector41 = byteVector35.putUTF8("");
        org.mockito.asm.ByteVector byteVector42 = new org.mockito.asm.ByteVector();
        org.mockito.asm.ByteVector byteVector44 = byteVector42.putUTF8("hi!");
        org.mockito.asm.ByteVector byteVector46 = byteVector44.putLong((long) (byte) 10);
        org.mockito.asm.ByteVector byteVector48 = byteVector46.putUTF8("hi!");
        org.mockito.asm.ByteVector byteVector50 = byteVector46.putLong((long) (short) -1);
        org.mockito.asm.ByteVector byteVector52 = byteVector50.putInt(10);
        org.mockito.asm.ByteVector byteVector54 = byteVector50.putByte((int) (short) 1);
        org.mockito.asm.ByteVector byteVector56 = byteVector50.putInt((int) (short) -1);
        org.mockito.asm.ByteVector byteVector58 = byteVector50.putUTF8("hi!");
        org.mockito.asm.ByteVector byteVector59 = new org.mockito.asm.ByteVector();
        org.mockito.asm.ByteVector byteVector61 = byteVector59.putUTF8("hi!");
        org.mockito.asm.ByteVector byteVector63 = byteVector59.putLong((long) ' ');
        org.mockito.asm.ByteVector byteVector65 = byteVector63.putByte((int) 'a');
        org.mockito.asm.ByteVector byteVector67 = byteVector63.putByte((int) (short) -1);
        org.mockito.asm.ByteVector byteVector69 = byteVector63.putLong(0L);
        org.mockito.asm.ByteVector byteVector71 = byteVector63.putUTF8("hi!");
        org.mockito.asm.ByteVector byteVector73 = byteVector71.putUTF8("");
        org.mockito.asm.ByteVector byteVector75 = byteVector73.putLong((long) (byte) 10);
        org.mockito.asm.ByteVector byteVector77 = byteVector73.putLong((long) (short) 100);
        byte[] byteArray82 = new byte[] { (byte) 1, (byte) 0, (byte) 0, (byte) -1 };
        org.mockito.asm.ByteVector byteVector85 = byteVector73.putByteArray(byteArray82, 0, 0);
        org.mockito.asm.ByteVector byteVector88 = byteVector58.putByteArray(byteArray82, (int) (byte) 0, (int) (short) 1);
        org.mockito.asm.ByteVector byteVector91 = byteVector35.putByteArray(byteArray82, (int) (short) 0, (int) (short) 0);
        // The following exception was thrown during execution in test generation
        try {
            org.mockito.asm.ByteVector byteVector94 = byteVector20.putByteArray(byteArray82, (int) (byte) 1, (int) (short) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteVector2);
        org.junit.Assert.assertNotNull(byteVector4);
        org.junit.Assert.assertNotNull(byteVector6);
        org.junit.Assert.assertNotNull(byteVector8);
        org.junit.Assert.assertNotNull(byteVector10);
        org.junit.Assert.assertNotNull(byteVector12);
        org.junit.Assert.assertNotNull(byteVector14);
        org.junit.Assert.assertNotNull(byteVector16);
        org.junit.Assert.assertNotNull(byteVector18);
        org.junit.Assert.assertNotNull(byteVector20);
        org.junit.Assert.assertNotNull(byteVector23);
        org.junit.Assert.assertNotNull(byteVector25);
        org.junit.Assert.assertNotNull(byteVector27);
        org.junit.Assert.assertNotNull(byteVector29);
        org.junit.Assert.assertNotNull(byteVector31);
        org.junit.Assert.assertNotNull(byteVector33);
        org.junit.Assert.assertNotNull(byteVector35);
        org.junit.Assert.assertNotNull(byteVector37);
        org.junit.Assert.assertNotNull(byteVector39);
        org.junit.Assert.assertNotNull(byteVector41);
        org.junit.Assert.assertNotNull(byteVector44);
        org.junit.Assert.assertNotNull(byteVector46);
        org.junit.Assert.assertNotNull(byteVector48);
        org.junit.Assert.assertNotNull(byteVector50);
        org.junit.Assert.assertNotNull(byteVector52);
        org.junit.Assert.assertNotNull(byteVector54);
        org.junit.Assert.assertNotNull(byteVector56);
        org.junit.Assert.assertNotNull(byteVector58);
        org.junit.Assert.assertNotNull(byteVector61);
        org.junit.Assert.assertNotNull(byteVector63);
        org.junit.Assert.assertNotNull(byteVector65);
        org.junit.Assert.assertNotNull(byteVector67);
        org.junit.Assert.assertNotNull(byteVector69);
        org.junit.Assert.assertNotNull(byteVector71);
        org.junit.Assert.assertNotNull(byteVector73);
        org.junit.Assert.assertNotNull(byteVector75);
        org.junit.Assert.assertNotNull(byteVector77);
        org.junit.Assert.assertNotNull(byteArray82);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray82), "[1, 0, 0, -1]");
        org.junit.Assert.assertNotNull(byteVector85);
        org.junit.Assert.assertNotNull(byteVector88);
        org.junit.Assert.assertNotNull(byteVector91);
    }
}

