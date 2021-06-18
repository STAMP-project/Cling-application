import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class RegressionTest2 {

    public static boolean debug = false;

    @Test
    public void test1001() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1001");
        org.mockito.asm.ByteVector byteVector0 = new org.mockito.asm.ByteVector();
        org.mockito.asm.ByteVector byteVector2 = byteVector0.putUTF8("hi!");
        org.mockito.asm.ByteVector byteVector4 = byteVector2.putLong((long) (byte) 10);
        org.mockito.asm.ByteVector byteVector6 = byteVector4.putUTF8("hi!");
        org.mockito.asm.ByteVector byteVector8 = byteVector4.putLong((long) 10);
        org.mockito.asm.ByteVector byteVector10 = byteVector8.putLong((long) 1);
        org.mockito.asm.ByteVector byteVector12 = byteVector8.putInt(10);
        org.mockito.asm.ByteVector byteVector14 = byteVector8.putUTF8("");
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
    public void test1002() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1002");
        org.mockito.asm.ByteVector byteVector0 = new org.mockito.asm.ByteVector();
        org.mockito.asm.ByteVector byteVector2 = byteVector0.putUTF8("hi!");
        org.mockito.asm.ByteVector byteVector4 = byteVector2.putLong((long) (byte) 10);
        org.mockito.asm.ByteVector byteVector6 = byteVector4.putUTF8("hi!");
        org.mockito.asm.ByteVector byteVector8 = byteVector4.putLong((long) (short) -1);
        org.mockito.asm.ByteVector byteVector10 = byteVector8.putInt(10);
        org.mockito.asm.ByteVector byteVector12 = byteVector8.putByte((int) (short) 1);
        org.mockito.asm.ByteVector byteVector14 = byteVector8.putByte((int) 'a');
        org.junit.Assert.assertNotNull(byteVector2);
        org.junit.Assert.assertNotNull(byteVector4);
        org.junit.Assert.assertNotNull(byteVector6);
        org.junit.Assert.assertNotNull(byteVector8);
        org.junit.Assert.assertNotNull(byteVector10);
        org.junit.Assert.assertNotNull(byteVector12);
        org.junit.Assert.assertNotNull(byteVector14);
    }

    @Test
    public void test1003() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1003");
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
        org.mockito.asm.ByteVector byteVector22 = byteVector20.putByte((int) (byte) 0);
        org.mockito.asm.ByteVector byteVector24 = byteVector20.putByte((int) (short) -1);
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
    public void test1004() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1004");
        org.mockito.asm.ByteVector byteVector0 = new org.mockito.asm.ByteVector();
        org.mockito.asm.ByteVector byteVector2 = byteVector0.putUTF8("hi!");
        org.mockito.asm.ByteVector byteVector4 = byteVector2.putLong((long) (byte) 10);
        org.mockito.asm.ByteVector byteVector6 = byteVector4.putUTF8("hi!");
        org.mockito.asm.ByteVector byteVector8 = byteVector4.putLong((long) 10);
        org.mockito.asm.ByteVector byteVector10 = byteVector8.putInt((int) (short) 0);
        org.mockito.asm.ByteVector byteVector12 = byteVector10.putShort((int) (short) 1);
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
    public void test1005() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1005");
        org.mockito.asm.ByteVector byteVector1 = new org.mockito.asm.ByteVector((int) '#');
        org.mockito.asm.ByteVector byteVector3 = byteVector1.putLong(100L);
        org.mockito.asm.ByteVector byteVector5 = byteVector3.putLong(1L);
        org.mockito.asm.ByteVector byteVector7 = byteVector5.putUTF8("hi!");
        org.mockito.asm.ByteVector byteVector9 = byteVector5.putUTF8("hi!");
        org.mockito.asm.ByteVector byteVector11 = byteVector9.putByte((int) (short) 0);
        org.mockito.asm.ByteVector byteVector13 = byteVector11.putInt((int) (short) 0);
        java.lang.Class<?> wildcardClass14 = byteVector11.getClass();
        org.junit.Assert.assertNotNull(byteVector3);
        org.junit.Assert.assertNotNull(byteVector5);
        org.junit.Assert.assertNotNull(byteVector7);
        org.junit.Assert.assertNotNull(byteVector9);
        org.junit.Assert.assertNotNull(byteVector11);
        org.junit.Assert.assertNotNull(byteVector13);
        org.junit.Assert.assertNotNull(wildcardClass14);
    }

    @Test
    public void test1006() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1006");
        org.mockito.asm.ByteVector byteVector0 = new org.mockito.asm.ByteVector();
        org.mockito.asm.ByteVector byteVector2 = byteVector0.putUTF8("hi!");
        org.mockito.asm.ByteVector byteVector4 = byteVector0.putInt(0);
        org.mockito.asm.ByteVector byteVector6 = byteVector0.putShort(10);
        org.mockito.asm.ByteVector byteVector8 = byteVector0.putUTF8("");
        org.mockito.asm.ByteVector byteVector10 = byteVector8.putLong((long) 'a');
        org.mockito.asm.ByteVector byteVector11 = new org.mockito.asm.ByteVector();
        org.mockito.asm.ByteVector byteVector13 = byteVector11.putUTF8("hi!");
        org.mockito.asm.ByteVector byteVector15 = byteVector13.putLong((long) (byte) 10);
        org.mockito.asm.ByteVector byteVector17 = byteVector15.putUTF8("hi!");
        org.mockito.asm.ByteVector byteVector19 = byteVector15.putLong((long) (short) -1);
        org.mockito.asm.ByteVector byteVector21 = byteVector19.putInt(10);
        org.mockito.asm.ByteVector byteVector23 = byteVector19.putByte((int) (short) 1);
        org.mockito.asm.ByteVector byteVector25 = byteVector19.putInt((int) (short) -1);
        org.mockito.asm.ByteVector byteVector27 = byteVector19.putUTF8("hi!");
        org.mockito.asm.ByteVector byteVector28 = new org.mockito.asm.ByteVector();
        org.mockito.asm.ByteVector byteVector30 = byteVector28.putUTF8("hi!");
        org.mockito.asm.ByteVector byteVector32 = byteVector28.putLong((long) ' ');
        org.mockito.asm.ByteVector byteVector34 = byteVector32.putByte((int) 'a');
        org.mockito.asm.ByteVector byteVector36 = byteVector32.putByte((int) (short) -1);
        org.mockito.asm.ByteVector byteVector38 = byteVector32.putLong(0L);
        org.mockito.asm.ByteVector byteVector40 = byteVector32.putUTF8("hi!");
        org.mockito.asm.ByteVector byteVector42 = byteVector40.putUTF8("");
        org.mockito.asm.ByteVector byteVector44 = byteVector42.putLong((long) (byte) 10);
        org.mockito.asm.ByteVector byteVector46 = byteVector42.putLong((long) (short) 100);
        byte[] byteArray51 = new byte[] { (byte) 1, (byte) 0, (byte) 0, (byte) -1 };
        org.mockito.asm.ByteVector byteVector54 = byteVector42.putByteArray(byteArray51, 0, 0);
        org.mockito.asm.ByteVector byteVector57 = byteVector27.putByteArray(byteArray51, (int) (byte) 0, (int) (short) 1);
        // The following exception was thrown during execution in test generation
        try {
            org.mockito.asm.ByteVector byteVector60 = byteVector8.putByteArray(byteArray51, (-1), (int) (short) 1);
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
        org.junit.Assert.assertNotNull(byteVector30);
        org.junit.Assert.assertNotNull(byteVector32);
        org.junit.Assert.assertNotNull(byteVector34);
        org.junit.Assert.assertNotNull(byteVector36);
        org.junit.Assert.assertNotNull(byteVector38);
        org.junit.Assert.assertNotNull(byteVector40);
        org.junit.Assert.assertNotNull(byteVector42);
        org.junit.Assert.assertNotNull(byteVector44);
        org.junit.Assert.assertNotNull(byteVector46);
        org.junit.Assert.assertNotNull(byteArray51);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray51), "[1, 0, 0, -1]");
        org.junit.Assert.assertNotNull(byteVector54);
        org.junit.Assert.assertNotNull(byteVector57);
    }

    @Test
    public void test1007() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1007");
        org.mockito.asm.ByteVector byteVector0 = new org.mockito.asm.ByteVector();
        org.mockito.asm.ByteVector byteVector2 = byteVector0.putUTF8("hi!");
        org.mockito.asm.ByteVector byteVector4 = byteVector2.putInt(0);
        org.mockito.asm.ByteVector byteVector6 = byteVector4.putByte((int) (byte) 1);
        org.mockito.asm.ByteVector byteVector8 = byteVector6.putShort((int) (byte) 10);
        org.mockito.asm.ByteVector byteVector10 = byteVector8.putUTF8("");
        org.mockito.asm.ByteVector byteVector12 = byteVector10.putInt((int) (byte) 100);
        org.mockito.asm.ByteVector byteVector14 = byteVector12.putLong((long) (byte) 1);
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
    public void test1008() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1008");
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
        org.mockito.asm.ByteVector byteVector20 = byteVector12.putUTF8("");
        org.mockito.asm.ByteVector byteVector21 = new org.mockito.asm.ByteVector();
        org.mockito.asm.ByteVector byteVector23 = byteVector21.putUTF8("hi!");
        org.mockito.asm.ByteVector byteVector25 = byteVector23.putByte(100);
        org.mockito.asm.ByteVector byteVector27 = byteVector23.putShort((int) 'a');
        org.mockito.asm.ByteVector byteVector29 = byteVector27.putShort((int) (short) 0);
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
        org.mockito.asm.ByteVector byteVector62 = byteVector27.putByteArray(byteArray53, (int) (byte) 1, (int) (short) 1);
        // The following exception was thrown during execution in test generation
        try {
            org.mockito.asm.ByteVector byteVector65 = byteVector12.putByteArray(byteArray53, 100, (int) (byte) -1);
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
    public void test1009() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1009");
        org.mockito.asm.ByteVector byteVector1 = new org.mockito.asm.ByteVector((int) (byte) 1);
        org.mockito.asm.ByteVector byteVector3 = byteVector1.putShort((int) (short) 100);
        org.mockito.asm.ByteVector byteVector5 = byteVector3.putInt((int) '#');
        org.mockito.asm.ByteVector byteVector7 = byteVector3.putLong((-1L));
        org.junit.Assert.assertNotNull(byteVector3);
        org.junit.Assert.assertNotNull(byteVector5);
        org.junit.Assert.assertNotNull(byteVector7);
    }

    @Test
    public void test1010() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1010");
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
        org.mockito.asm.ByteVector byteVector22 = byteVector20.putShort((int) (short) 100);
        org.mockito.asm.ByteVector byteVector24 = byteVector20.putUTF8("hi!");
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
    public void test1011() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1011");
        org.mockito.asm.ByteVector byteVector0 = new org.mockito.asm.ByteVector();
        org.mockito.asm.ByteVector byteVector2 = byteVector0.putUTF8("hi!");
        org.mockito.asm.ByteVector byteVector4 = byteVector2.putInt((int) (byte) 10);
        org.mockito.asm.ByteVector byteVector6 = byteVector4.putByte((int) (short) 100);
        org.mockito.asm.ByteVector byteVector8 = byteVector4.putShort((int) (byte) 10);
        org.junit.Assert.assertNotNull(byteVector2);
        org.junit.Assert.assertNotNull(byteVector4);
        org.junit.Assert.assertNotNull(byteVector6);
        org.junit.Assert.assertNotNull(byteVector8);
    }

    @Test
    public void test1012() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1012");
        org.mockito.asm.ByteVector byteVector0 = new org.mockito.asm.ByteVector();
        org.mockito.asm.ByteVector byteVector2 = byteVector0.putUTF8("hi!");
        org.mockito.asm.ByteVector byteVector4 = byteVector0.putInt(0);
        org.mockito.asm.ByteVector byteVector6 = byteVector0.putShort((int) '4');
        org.mockito.asm.ByteVector byteVector8 = byteVector6.putInt((int) (short) 0);
        org.mockito.asm.ByteVector byteVector10 = byteVector8.putShort((int) (byte) 0);
        org.mockito.asm.ByteVector byteVector12 = byteVector10.putShort(0);
        org.junit.Assert.assertNotNull(byteVector2);
        org.junit.Assert.assertNotNull(byteVector4);
        org.junit.Assert.assertNotNull(byteVector6);
        org.junit.Assert.assertNotNull(byteVector8);
        org.junit.Assert.assertNotNull(byteVector10);
        org.junit.Assert.assertNotNull(byteVector12);
    }

    @Test
    public void test1013() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1013");
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
        org.mockito.asm.ByteVector byteVector46 = byteVector16.putByteArray(byteArray40, (int) (byte) 0, (int) (short) 1);
        org.mockito.asm.ByteVector byteVector48 = byteVector46.putByte((int) '4');
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
        org.junit.Assert.assertNotNull(byteVector46);
        org.junit.Assert.assertNotNull(byteVector48);
    }

    @Test
    public void test1014() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1014");
        org.mockito.asm.ByteVector byteVector0 = new org.mockito.asm.ByteVector();
        org.mockito.asm.ByteVector byteVector2 = byteVector0.putUTF8("hi!");
        org.mockito.asm.ByteVector byteVector4 = byteVector0.putLong((long) (short) 1);
        org.mockito.asm.ByteVector byteVector6 = byteVector4.putUTF8("");
        org.mockito.asm.ByteVector byteVector8 = byteVector6.putShort((int) (short) 0);
        org.mockito.asm.ByteVector byteVector10 = byteVector8.putLong((long) (short) 100);
        org.mockito.asm.ByteVector byteVector12 = byteVector8.putInt((int) (byte) 1);
        org.mockito.asm.ByteVector byteVector14 = byteVector12.putByte((int) (byte) 10);
        org.junit.Assert.assertNotNull(byteVector2);
        org.junit.Assert.assertNotNull(byteVector4);
        org.junit.Assert.assertNotNull(byteVector6);
        org.junit.Assert.assertNotNull(byteVector8);
        org.junit.Assert.assertNotNull(byteVector10);
        org.junit.Assert.assertNotNull(byteVector12);
        org.junit.Assert.assertNotNull(byteVector14);
    }

    @Test
    public void test1015() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1015");
        org.mockito.asm.ByteVector byteVector0 = new org.mockito.asm.ByteVector();
        org.mockito.asm.ByteVector byteVector2 = byteVector0.putUTF8("hi!");
        org.mockito.asm.ByteVector byteVector4 = byteVector2.putInt(0);
        org.mockito.asm.ByteVector byteVector6 = byteVector4.putByte((int) (short) 0);
        org.mockito.asm.ByteVector byteVector8 = byteVector4.putUTF8("");
        org.mockito.asm.ByteVector byteVector10 = byteVector4.putInt((int) ' ');
        org.mockito.asm.ByteVector byteVector12 = byteVector4.putByte((int) (byte) 100);
        org.mockito.asm.ByteVector byteVector14 = byteVector12.putByte((int) (byte) 100);
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
    public void test1016() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1016");
        org.mockito.asm.ByteVector byteVector0 = new org.mockito.asm.ByteVector();
        org.mockito.asm.ByteVector byteVector2 = byteVector0.putUTF8("hi!");
        org.mockito.asm.ByteVector byteVector4 = byteVector0.putLong((long) ' ');
        org.mockito.asm.ByteVector byteVector6 = byteVector4.putByte((int) 'a');
        org.mockito.asm.ByteVector byteVector8 = byteVector4.putByte((int) (short) -1);
        org.mockito.asm.ByteVector byteVector10 = byteVector4.putLong(0L);
        org.mockito.asm.ByteVector byteVector12 = byteVector4.putUTF8("hi!");
        org.mockito.asm.ByteVector byteVector14 = byteVector12.putUTF8("");
        org.mockito.asm.ByteVector byteVector16 = byteVector14.putUTF8("");
        org.mockito.asm.ByteVector byteVector18 = new org.mockito.asm.ByteVector((int) (byte) 10);
        org.mockito.asm.ByteVector byteVector20 = byteVector18.putByte((int) '4');
        org.mockito.asm.ByteVector byteVector22 = byteVector18.putLong((long) 'a');
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
        org.mockito.asm.ByteVector byteVector63 = byteVector22.putByteArray(byteArray54, 0, 0);
        // The following exception was thrown during execution in test generation
        try {
            org.mockito.asm.ByteVector byteVector66 = byteVector14.putByteArray(byteArray54, 0, 10);
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
    public void test1017() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1017");
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
        org.mockito.asm.ByteVector byteVector30 = byteVector26.putInt(1);
        org.mockito.asm.ByteVector byteVector32 = byteVector26.putShort((int) (byte) -1);
        org.mockito.asm.ByteVector byteVector34 = byteVector26.putShort((int) 'a');
        org.mockito.asm.ByteVector byteVector36 = byteVector34.putByte((int) (short) 10);
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
        org.junit.Assert.assertNotNull(byteVector30);
        org.junit.Assert.assertNotNull(byteVector32);
        org.junit.Assert.assertNotNull(byteVector34);
        org.junit.Assert.assertNotNull(byteVector36);
    }

    @Test
    public void test1018() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1018");
        org.mockito.asm.ByteVector byteVector1 = new org.mockito.asm.ByteVector((int) '#');
        org.mockito.asm.ByteVector byteVector3 = byteVector1.putUTF8("hi!");
        org.mockito.asm.ByteVector byteVector5 = byteVector1.putUTF8("");
        org.mockito.asm.ByteVector byteVector7 = byteVector5.putInt(0);
        org.mockito.asm.ByteVector byteVector9 = byteVector7.putByte((int) (byte) 0);
        org.mockito.asm.ByteVector byteVector11 = byteVector9.putShort(0);
        org.mockito.asm.ByteVector byteVector13 = byteVector11.putInt(0);
        org.junit.Assert.assertNotNull(byteVector3);
        org.junit.Assert.assertNotNull(byteVector5);
        org.junit.Assert.assertNotNull(byteVector7);
        org.junit.Assert.assertNotNull(byteVector9);
        org.junit.Assert.assertNotNull(byteVector11);
        org.junit.Assert.assertNotNull(byteVector13);
    }

    @Test
    public void test1019() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1019");
        org.mockito.asm.ByteVector byteVector0 = new org.mockito.asm.ByteVector();
        org.mockito.asm.ByteVector byteVector2 = byteVector0.putUTF8("hi!");
        org.mockito.asm.ByteVector byteVector4 = byteVector2.putInt((int) (byte) 10);
        org.mockito.asm.ByteVector byteVector6 = byteVector2.putLong((long) 10);
        org.mockito.asm.ByteVector byteVector8 = byteVector2.putLong(0L);
        org.mockito.asm.ByteVector byteVector10 = byteVector2.putInt((int) (short) 10);
        java.lang.Class<?> wildcardClass11 = byteVector2.getClass();
        org.junit.Assert.assertNotNull(byteVector2);
        org.junit.Assert.assertNotNull(byteVector4);
        org.junit.Assert.assertNotNull(byteVector6);
        org.junit.Assert.assertNotNull(byteVector8);
        org.junit.Assert.assertNotNull(byteVector10);
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test1020() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1020");
        org.mockito.asm.ByteVector byteVector0 = new org.mockito.asm.ByteVector();
        org.mockito.asm.ByteVector byteVector2 = byteVector0.putUTF8("hi!");
        org.mockito.asm.ByteVector byteVector4 = byteVector0.putInt(0);
        org.mockito.asm.ByteVector byteVector6 = byteVector4.putInt((int) ' ');
        org.mockito.asm.ByteVector byteVector8 = byteVector6.putLong((long) (short) 10);
        org.mockito.asm.ByteVector byteVector10 = byteVector8.putUTF8("hi!");
        org.mockito.asm.ByteVector byteVector12 = byteVector8.putByte(0);
        org.mockito.asm.ByteVector byteVector14 = byteVector12.putInt((int) (short) 1);
        org.mockito.asm.ByteVector byteVector16 = byteVector12.putLong((long) (short) 0);
        org.mockito.asm.ByteVector byteVector18 = byteVector12.putUTF8("hi!");
        org.mockito.asm.ByteVector byteVector20 = new org.mockito.asm.ByteVector((int) '#');
        org.mockito.asm.ByteVector byteVector22 = byteVector20.putInt(100);
        org.mockito.asm.ByteVector byteVector24 = byteVector20.putUTF8("");
        org.mockito.asm.ByteVector byteVector25 = new org.mockito.asm.ByteVector();
        org.mockito.asm.ByteVector byteVector27 = byteVector25.putUTF8("hi!");
        org.mockito.asm.ByteVector byteVector29 = byteVector27.putInt(0);
        org.mockito.asm.ByteVector byteVector31 = byteVector29.putByte((int) (short) 0);
        org.mockito.asm.ByteVector byteVector33 = byteVector29.putUTF8("");
        org.mockito.asm.ByteVector byteVector34 = new org.mockito.asm.ByteVector();
        org.mockito.asm.ByteVector byteVector36 = byteVector34.putUTF8("hi!");
        org.mockito.asm.ByteVector byteVector38 = byteVector34.putInt(0);
        org.mockito.asm.ByteVector byteVector40 = byteVector34.putShort((int) '4');
        org.mockito.asm.ByteVector byteVector42 = byteVector34.putByte(100);
        org.mockito.asm.ByteVector byteVector44 = byteVector42.putInt((int) (byte) 10);
        org.mockito.asm.ByteVector byteVector46 = byteVector42.putInt((int) (byte) 10);
        org.mockito.asm.ByteVector byteVector48 = byteVector46.putByte(100);
        org.mockito.asm.ByteVector byteVector49 = new org.mockito.asm.ByteVector();
        org.mockito.asm.ByteVector byteVector51 = byteVector49.putUTF8("hi!");
        org.mockito.asm.ByteVector byteVector53 = byteVector49.putInt(0);
        org.mockito.asm.ByteVector byteVector55 = byteVector53.putInt((int) ' ');
        org.mockito.asm.ByteVector byteVector57 = byteVector55.putLong(100L);
        byte[] byteArray61 = new byte[] { (byte) 0, (byte) 10, (byte) 1 };
        org.mockito.asm.ByteVector byteVector64 = byteVector55.putByteArray(byteArray61, 0, 0);
        org.mockito.asm.ByteVector byteVector67 = byteVector48.putByteArray(byteArray61, (int) (byte) 1, (int) (byte) 0);
        org.mockito.asm.ByteVector byteVector70 = byteVector29.putByteArray(byteArray61, (int) (short) 0, 0);
        org.mockito.asm.ByteVector byteVector73 = byteVector24.putByteArray(byteArray61, (int) (byte) 0, (int) (short) 1);
        // The following exception was thrown during execution in test generation
        try {
            org.mockito.asm.ByteVector byteVector76 = byteVector18.putByteArray(byteArray61, (int) (byte) 10, 1);
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
        org.junit.Assert.assertNotNull(byteVector22);
        org.junit.Assert.assertNotNull(byteVector24);
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
        org.junit.Assert.assertNotNull(byteVector51);
        org.junit.Assert.assertNotNull(byteVector53);
        org.junit.Assert.assertNotNull(byteVector55);
        org.junit.Assert.assertNotNull(byteVector57);
        org.junit.Assert.assertNotNull(byteArray61);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray61), "[0, 10, 1]");
        org.junit.Assert.assertNotNull(byteVector64);
        org.junit.Assert.assertNotNull(byteVector67);
        org.junit.Assert.assertNotNull(byteVector70);
        org.junit.Assert.assertNotNull(byteVector73);
    }

    @Test
    public void test1021() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1021");
        org.mockito.asm.ByteVector byteVector1 = new org.mockito.asm.ByteVector((int) '#');
        org.mockito.asm.ByteVector byteVector3 = byteVector1.putInt(100);
        org.mockito.asm.ByteVector byteVector5 = byteVector3.putUTF8("hi!");
        org.mockito.asm.ByteVector byteVector7 = byteVector3.putInt((int) (short) -1);
        org.mockito.asm.ByteVector byteVector9 = byteVector3.putLong(0L);
        java.lang.Class<?> wildcardClass10 = byteVector9.getClass();
        org.junit.Assert.assertNotNull(byteVector3);
        org.junit.Assert.assertNotNull(byteVector5);
        org.junit.Assert.assertNotNull(byteVector7);
        org.junit.Assert.assertNotNull(byteVector9);
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test1022() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1022");
        org.mockito.asm.ByteVector byteVector0 = new org.mockito.asm.ByteVector();
        org.mockito.asm.ByteVector byteVector2 = byteVector0.putUTF8("hi!");
        org.mockito.asm.ByteVector byteVector4 = byteVector0.putLong((long) ' ');
        org.mockito.asm.ByteVector byteVector6 = byteVector4.putByte((int) (short) 1);
        org.mockito.asm.ByteVector byteVector8 = byteVector4.putInt(0);
        org.mockito.asm.ByteVector byteVector10 = byteVector8.putShort(10);
        org.junit.Assert.assertNotNull(byteVector2);
        org.junit.Assert.assertNotNull(byteVector4);
        org.junit.Assert.assertNotNull(byteVector6);
        org.junit.Assert.assertNotNull(byteVector8);
        org.junit.Assert.assertNotNull(byteVector10);
    }

    @Test
    public void test1023() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1023");
        org.mockito.asm.ByteVector byteVector0 = new org.mockito.asm.ByteVector();
        org.mockito.asm.ByteVector byteVector2 = byteVector0.putUTF8("hi!");
        org.mockito.asm.ByteVector byteVector4 = byteVector0.putLong((long) ' ');
        org.mockito.asm.ByteVector byteVector6 = byteVector4.putByte((int) 'a');
        org.mockito.asm.ByteVector byteVector8 = byteVector4.putByte((int) (short) -1);
        org.mockito.asm.ByteVector byteVector10 = byteVector4.putLong(0L);
        org.mockito.asm.ByteVector byteVector12 = byteVector10.putInt((int) (short) -1);
        org.mockito.asm.ByteVector byteVector14 = byteVector12.putByte((int) (short) 100);
        org.mockito.asm.ByteVector byteVector16 = byteVector14.putInt((int) (byte) 0);
        org.mockito.asm.ByteVector byteVector17 = new org.mockito.asm.ByteVector();
        org.mockito.asm.ByteVector byteVector19 = byteVector17.putUTF8("hi!");
        org.mockito.asm.ByteVector byteVector21 = byteVector19.putLong((long) (byte) 10);
        org.mockito.asm.ByteVector byteVector23 = byteVector21.putUTF8("hi!");
        org.mockito.asm.ByteVector byteVector25 = byteVector21.putLong((long) 10);
        org.mockito.asm.ByteVector byteVector27 = byteVector25.putLong(0L);
        org.mockito.asm.ByteVector byteVector29 = byteVector27.putUTF8("hi!");
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
        org.mockito.asm.ByteVector byteVector62 = byteVector29.putByteArray(byteArray53, (int) (byte) 0, 0);
        // The following exception was thrown during execution in test generation
        try {
            org.mockito.asm.ByteVector byteVector65 = byteVector16.putByteArray(byteArray53, (int) ' ', (int) (short) 1);
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
    public void test1024() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1024");
        org.mockito.asm.ByteVector byteVector1 = new org.mockito.asm.ByteVector((int) (byte) 1);
        org.mockito.asm.ByteVector byteVector3 = byteVector1.putByte((int) (byte) 10);
        org.mockito.asm.ByteVector byteVector5 = byteVector3.putShort((int) (short) 10);
        org.mockito.asm.ByteVector byteVector7 = byteVector3.putUTF8("");
        org.mockito.asm.ByteVector byteVector9 = byteVector7.putLong((long) 'a');
        org.mockito.asm.ByteVector byteVector11 = byteVector7.putUTF8("");
        java.lang.Class<?> wildcardClass12 = byteVector7.getClass();
        org.junit.Assert.assertNotNull(byteVector3);
        org.junit.Assert.assertNotNull(byteVector5);
        org.junit.Assert.assertNotNull(byteVector7);
        org.junit.Assert.assertNotNull(byteVector9);
        org.junit.Assert.assertNotNull(byteVector11);
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test1025() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1025");
        org.mockito.asm.ByteVector byteVector0 = new org.mockito.asm.ByteVector();
        org.mockito.asm.ByteVector byteVector2 = byteVector0.putUTF8("hi!");
        org.mockito.asm.ByteVector byteVector4 = byteVector2.putInt(0);
        org.mockito.asm.ByteVector byteVector6 = byteVector2.putByte((int) (byte) 10);
        org.mockito.asm.ByteVector byteVector8 = byteVector6.putUTF8("hi!");
        org.mockito.asm.ByteVector byteVector10 = byteVector8.putShort(100);
        org.mockito.asm.ByteVector byteVector12 = byteVector10.putLong((long) (byte) 10);
        org.mockito.asm.ByteVector byteVector14 = byteVector12.putShort(100);
        org.junit.Assert.assertNotNull(byteVector2);
        org.junit.Assert.assertNotNull(byteVector4);
        org.junit.Assert.assertNotNull(byteVector6);
        org.junit.Assert.assertNotNull(byteVector8);
        org.junit.Assert.assertNotNull(byteVector10);
        org.junit.Assert.assertNotNull(byteVector12);
        org.junit.Assert.assertNotNull(byteVector14);
    }

    @Test
    public void test1026() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1026");
        org.mockito.asm.ByteVector byteVector0 = new org.mockito.asm.ByteVector();
        org.mockito.asm.ByteVector byteVector2 = byteVector0.putUTF8("hi!");
        org.mockito.asm.ByteVector byteVector4 = byteVector2.putInt(0);
        org.mockito.asm.ByteVector byteVector6 = byteVector4.putByte((int) (byte) 1);
        org.mockito.asm.ByteVector byteVector8 = byteVector4.putByte(0);
        org.mockito.asm.ByteVector byteVector10 = byteVector8.putLong((long) (byte) 1);
        org.mockito.asm.ByteVector byteVector12 = byteVector8.putInt((int) 'a');
        org.mockito.asm.ByteVector byteVector13 = new org.mockito.asm.ByteVector();
        org.mockito.asm.ByteVector byteVector15 = byteVector13.putUTF8("hi!");
        org.mockito.asm.ByteVector byteVector17 = byteVector13.putInt(0);
        org.mockito.asm.ByteVector byteVector19 = byteVector13.putInt(1);
        org.mockito.asm.ByteVector byteVector21 = byteVector13.putUTF8("");
        org.mockito.asm.ByteVector byteVector23 = byteVector21.putLong(10L);
        org.mockito.asm.ByteVector byteVector24 = new org.mockito.asm.ByteVector();
        org.mockito.asm.ByteVector byteVector26 = byteVector24.putUTF8("hi!");
        org.mockito.asm.ByteVector byteVector28 = byteVector26.putLong((long) (byte) 10);
        org.mockito.asm.ByteVector byteVector30 = byteVector28.putUTF8("hi!");
        org.mockito.asm.ByteVector byteVector32 = byteVector28.putLong((-1L));
        org.mockito.asm.ByteVector byteVector34 = new org.mockito.asm.ByteVector((int) (short) 0);
        org.mockito.asm.ByteVector byteVector35 = new org.mockito.asm.ByteVector();
        org.mockito.asm.ByteVector byteVector37 = byteVector35.putUTF8("hi!");
        org.mockito.asm.ByteVector byteVector39 = byteVector35.putInt(0);
        org.mockito.asm.ByteVector byteVector41 = byteVector39.putInt((int) ' ');
        org.mockito.asm.ByteVector byteVector43 = byteVector41.putLong(100L);
        byte[] byteArray47 = new byte[] { (byte) 0, (byte) 10, (byte) 1 };
        org.mockito.asm.ByteVector byteVector50 = byteVector41.putByteArray(byteArray47, 0, 0);
        org.mockito.asm.ByteVector byteVector53 = byteVector34.putByteArray(byteArray47, 1, (int) (short) 0);
        org.mockito.asm.ByteVector byteVector56 = byteVector32.putByteArray(byteArray47, 0, (int) (byte) 1);
        org.mockito.asm.ByteVector byteVector59 = byteVector21.putByteArray(byteArray47, 0, (int) (short) 1);
        // The following exception was thrown during execution in test generation
        try {
            org.mockito.asm.ByteVector byteVector62 = byteVector8.putByteArray(byteArray47, (int) (short) 1, (int) (short) 100);
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
        org.junit.Assert.assertNotNull(byteVector37);
        org.junit.Assert.assertNotNull(byteVector39);
        org.junit.Assert.assertNotNull(byteVector41);
        org.junit.Assert.assertNotNull(byteVector43);
        org.junit.Assert.assertNotNull(byteArray47);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray47), "[0, 10, 1]");
        org.junit.Assert.assertNotNull(byteVector50);
        org.junit.Assert.assertNotNull(byteVector53);
        org.junit.Assert.assertNotNull(byteVector56);
        org.junit.Assert.assertNotNull(byteVector59);
    }

    @Test
    public void test1027() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1027");
        org.mockito.asm.ByteVector byteVector1 = new org.mockito.asm.ByteVector((int) '#');
        org.mockito.asm.ByteVector byteVector3 = byteVector1.putLong(100L);
        org.mockito.asm.ByteVector byteVector5 = byteVector3.putLong(1L);
        org.mockito.asm.ByteVector byteVector7 = byteVector5.putUTF8("hi!");
        org.mockito.asm.ByteVector byteVector9 = byteVector7.putUTF8("");
        org.mockito.asm.ByteVector byteVector11 = byteVector9.putShort((int) (byte) -1);
        org.mockito.asm.ByteVector byteVector13 = byteVector9.putLong((long) (short) -1);
        org.mockito.asm.ByteVector byteVector15 = byteVector13.putInt((int) (short) 0);
        org.junit.Assert.assertNotNull(byteVector3);
        org.junit.Assert.assertNotNull(byteVector5);
        org.junit.Assert.assertNotNull(byteVector7);
        org.junit.Assert.assertNotNull(byteVector9);
        org.junit.Assert.assertNotNull(byteVector11);
        org.junit.Assert.assertNotNull(byteVector13);
        org.junit.Assert.assertNotNull(byteVector15);
    }

    @Test
    public void test1028() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1028");
        org.mockito.asm.ByteVector byteVector0 = new org.mockito.asm.ByteVector();
        org.mockito.asm.ByteVector byteVector2 = byteVector0.putUTF8("hi!");
        org.mockito.asm.ByteVector byteVector4 = byteVector0.putShort((int) (short) -1);
        org.mockito.asm.ByteVector byteVector6 = byteVector0.putInt(0);
        org.mockito.asm.ByteVector byteVector8 = byteVector0.putUTF8("hi!");
        org.mockito.asm.ByteVector byteVector10 = byteVector8.putInt((int) (byte) 1);
        org.junit.Assert.assertNotNull(byteVector2);
        org.junit.Assert.assertNotNull(byteVector4);
        org.junit.Assert.assertNotNull(byteVector6);
        org.junit.Assert.assertNotNull(byteVector8);
        org.junit.Assert.assertNotNull(byteVector10);
    }

    @Test
    public void test1029() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1029");
        org.mockito.asm.ByteVector byteVector0 = new org.mockito.asm.ByteVector();
        org.mockito.asm.ByteVector byteVector2 = byteVector0.putUTF8("hi!");
        org.mockito.asm.ByteVector byteVector4 = byteVector0.putLong((long) ' ');
        org.mockito.asm.ByteVector byteVector6 = byteVector4.putByte((int) 'a');
        org.mockito.asm.ByteVector byteVector8 = byteVector4.putByte((int) (short) -1);
        org.mockito.asm.ByteVector byteVector10 = byteVector4.putLong(0L);
        org.mockito.asm.ByteVector byteVector12 = byteVector10.putByte(0);
        org.mockito.asm.ByteVector byteVector14 = byteVector10.putShort((int) (byte) -1);
        org.mockito.asm.ByteVector byteVector16 = byteVector14.putShort((int) (short) 0);
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
    public void test1030() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1030");
        org.mockito.asm.ByteVector byteVector0 = new org.mockito.asm.ByteVector();
        org.mockito.asm.ByteVector byteVector2 = byteVector0.putUTF8("hi!");
        org.mockito.asm.ByteVector byteVector4 = byteVector0.putInt(0);
        org.mockito.asm.ByteVector byteVector6 = byteVector4.putInt((int) ' ');
        org.mockito.asm.ByteVector byteVector8 = byteVector6.putLong((long) (short) 10);
        org.mockito.asm.ByteVector byteVector10 = byteVector6.putInt((int) '4');
        org.mockito.asm.ByteVector byteVector12 = byteVector6.putShort((int) (short) 100);
        org.mockito.asm.ByteVector byteVector14 = byteVector12.putByte((int) (short) 100);
        org.mockito.asm.ByteVector byteVector16 = byteVector14.putLong(0L);
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
    public void test1031() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1031");
        org.mockito.asm.ByteVector byteVector1 = new org.mockito.asm.ByteVector((int) (byte) 10);
        org.mockito.asm.ByteVector byteVector3 = byteVector1.putByte((int) '4');
        org.mockito.asm.ByteVector byteVector5 = byteVector1.putLong((long) 'a');
        org.mockito.asm.ByteVector byteVector7 = byteVector1.putUTF8("");
        org.mockito.asm.ByteVector byteVector9 = byteVector1.putUTF8("");
        org.mockito.asm.ByteVector byteVector11 = byteVector9.putInt((int) (byte) 0);
        org.mockito.asm.ByteVector byteVector13 = byteVector9.putUTF8("hi!");
        org.junit.Assert.assertNotNull(byteVector3);
        org.junit.Assert.assertNotNull(byteVector5);
        org.junit.Assert.assertNotNull(byteVector7);
        org.junit.Assert.assertNotNull(byteVector9);
        org.junit.Assert.assertNotNull(byteVector11);
        org.junit.Assert.assertNotNull(byteVector13);
    }

    @Test
    public void test1032() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1032");
        org.mockito.asm.ByteVector byteVector0 = new org.mockito.asm.ByteVector();
        org.mockito.asm.ByteVector byteVector2 = byteVector0.putUTF8("hi!");
        org.mockito.asm.ByteVector byteVector4 = byteVector0.putShort((int) (short) 100);
        org.mockito.asm.ByteVector byteVector6 = byteVector4.putLong((long) (byte) -1);
        org.mockito.asm.ByteVector byteVector8 = byteVector4.putByte((int) (byte) 10);
        org.mockito.asm.ByteVector byteVector10 = byteVector8.putUTF8("");
        org.mockito.asm.ByteVector byteVector12 = byteVector10.putInt((int) '4');
        org.mockito.asm.ByteVector byteVector14 = byteVector12.putByte((int) (byte) 0);
        org.mockito.asm.ByteVector byteVector16 = byteVector14.putInt(100);
        org.mockito.asm.ByteVector byteVector18 = byteVector16.putUTF8("");
        org.mockito.asm.ByteVector byteVector19 = new org.mockito.asm.ByteVector();
        org.mockito.asm.ByteVector byteVector21 = byteVector19.putUTF8("hi!");
        org.mockito.asm.ByteVector byteVector23 = byteVector21.putLong((long) (byte) 10);
        org.mockito.asm.ByteVector byteVector25 = byteVector23.putUTF8("hi!");
        org.mockito.asm.ByteVector byteVector27 = byteVector23.putLong((-1L));
        org.mockito.asm.ByteVector byteVector29 = byteVector27.putInt(10);
        org.mockito.asm.ByteVector byteVector31 = byteVector29.putShort((int) '#');
        org.mockito.asm.ByteVector byteVector33 = new org.mockito.asm.ByteVector((int) (short) 0);
        org.mockito.asm.ByteVector byteVector34 = new org.mockito.asm.ByteVector();
        org.mockito.asm.ByteVector byteVector36 = byteVector34.putUTF8("hi!");
        org.mockito.asm.ByteVector byteVector38 = byteVector34.putInt(0);
        org.mockito.asm.ByteVector byteVector40 = byteVector38.putInt((int) ' ');
        org.mockito.asm.ByteVector byteVector42 = byteVector40.putLong(100L);
        byte[] byteArray46 = new byte[] { (byte) 0, (byte) 10, (byte) 1 };
        org.mockito.asm.ByteVector byteVector49 = byteVector40.putByteArray(byteArray46, 0, 0);
        org.mockito.asm.ByteVector byteVector52 = byteVector33.putByteArray(byteArray46, 1, (int) (short) 0);
        org.mockito.asm.ByteVector byteVector55 = byteVector29.putByteArray(byteArray46, (int) (short) 0, 0);
        // The following exception was thrown during execution in test generation
        try {
            org.mockito.asm.ByteVector byteVector58 = byteVector16.putByteArray(byteArray46, (int) (byte) 100, 100);
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
    public void test1033() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1033");
        org.mockito.asm.ByteVector byteVector0 = new org.mockito.asm.ByteVector();
        org.mockito.asm.ByteVector byteVector2 = byteVector0.putUTF8("hi!");
        org.mockito.asm.ByteVector byteVector4 = byteVector2.putLong((long) (byte) 10);
        org.mockito.asm.ByteVector byteVector6 = byteVector2.putInt((int) (short) 1);
        org.mockito.asm.ByteVector byteVector8 = byteVector2.putShort((-1));
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
    public void test1034() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1034");
        org.mockito.asm.ByteVector byteVector0 = new org.mockito.asm.ByteVector();
        org.mockito.asm.ByteVector byteVector2 = byteVector0.putUTF8("hi!");
        org.mockito.asm.ByteVector byteVector4 = byteVector2.putLong((long) (byte) 10);
        org.mockito.asm.ByteVector byteVector6 = byteVector4.putUTF8("hi!");
        org.mockito.asm.ByteVector byteVector8 = byteVector4.putInt((int) (byte) 100);
        org.mockito.asm.ByteVector byteVector10 = byteVector4.putUTF8("hi!");
        org.mockito.asm.ByteVector byteVector12 = byteVector4.putInt((int) (short) 0);
        org.mockito.asm.ByteVector byteVector14 = byteVector12.putUTF8("hi!");
        org.mockito.asm.ByteVector byteVector16 = byteVector12.putShort((int) (byte) 100);
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
    public void test1035() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1035");
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
        org.mockito.asm.ByteVector byteVector24 = byteVector22.putByte((int) 'a');
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
    public void test1036() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1036");
        org.mockito.asm.ByteVector byteVector0 = new org.mockito.asm.ByteVector();
        org.mockito.asm.ByteVector byteVector2 = byteVector0.putUTF8("hi!");
        org.mockito.asm.ByteVector byteVector4 = byteVector2.putLong((long) (byte) 10);
        org.mockito.asm.ByteVector byteVector6 = byteVector4.putUTF8("hi!");
        org.mockito.asm.ByteVector byteVector8 = byteVector4.putLong((long) (short) -1);
        org.mockito.asm.ByteVector byteVector10 = byteVector8.putInt(10);
        org.mockito.asm.ByteVector byteVector12 = byteVector10.putByte((int) (byte) 0);
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
    public void test1037() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1037");
        org.mockito.asm.ByteVector byteVector0 = new org.mockito.asm.ByteVector();
        org.mockito.asm.ByteVector byteVector2 = byteVector0.putUTF8("hi!");
        org.mockito.asm.ByteVector byteVector4 = byteVector0.putInt(0);
        org.mockito.asm.ByteVector byteVector6 = byteVector4.putInt((int) ' ');
        org.mockito.asm.ByteVector byteVector8 = byteVector6.putLong((long) (short) 10);
        org.mockito.asm.ByteVector byteVector10 = byteVector6.putInt((int) '4');
        org.mockito.asm.ByteVector byteVector12 = byteVector6.putInt((int) (short) 100);
        org.mockito.asm.ByteVector byteVector14 = byteVector12.putInt((int) (short) 1);
        org.mockito.asm.ByteVector byteVector16 = new org.mockito.asm.ByteVector((int) '#');
        org.mockito.asm.ByteVector byteVector18 = byteVector16.putLong(100L);
        org.mockito.asm.ByteVector byteVector20 = byteVector18.putLong(1L);
        org.mockito.asm.ByteVector byteVector22 = byteVector20.putUTF8("hi!");
        org.mockito.asm.ByteVector byteVector24 = byteVector20.putUTF8("hi!");
        org.mockito.asm.ByteVector byteVector26 = byteVector24.putByte((int) (short) 0);
        org.mockito.asm.ByteVector byteVector28 = byteVector24.putInt(1);
        org.mockito.asm.ByteVector byteVector29 = new org.mockito.asm.ByteVector();
        org.mockito.asm.ByteVector byteVector31 = byteVector29.putUTF8("hi!");
        org.mockito.asm.ByteVector byteVector33 = byteVector31.putByte(100);
        org.mockito.asm.ByteVector byteVector35 = byteVector31.putShort((int) 'a');
        org.mockito.asm.ByteVector byteVector37 = byteVector35.putShort((int) (short) 0);
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
        org.mockito.asm.ByteVector byteVector70 = byteVector35.putByteArray(byteArray61, (int) (byte) 1, (int) (short) 1);
        org.mockito.asm.ByteVector byteVector73 = byteVector24.putByteArray(byteArray61, (int) (short) 0, (int) (byte) 0);
        // The following exception was thrown during execution in test generation
        try {
            org.mockito.asm.ByteVector byteVector76 = byteVector12.putByteArray(byteArray61, (int) 'a', 0);
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
        org.junit.Assert.assertNotNull(byteVector73);
    }

    @Test
    public void test1038() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1038");
        org.mockito.asm.ByteVector byteVector0 = new org.mockito.asm.ByteVector();
        org.mockito.asm.ByteVector byteVector2 = byteVector0.putUTF8("hi!");
        org.mockito.asm.ByteVector byteVector4 = byteVector0.putInt(0);
        org.mockito.asm.ByteVector byteVector6 = byteVector4.putInt((int) ' ');
        org.mockito.asm.ByteVector byteVector8 = byteVector6.putLong((long) (short) 10);
        org.mockito.asm.ByteVector byteVector10 = byteVector8.putUTF8("hi!");
        org.mockito.asm.ByteVector byteVector12 = byteVector8.putByte(0);
        org.mockito.asm.ByteVector byteVector14 = byteVector12.putByte((int) (short) 1);
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
    public void test1039() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1039");
        org.mockito.asm.ByteVector byteVector0 = new org.mockito.asm.ByteVector();
        org.mockito.asm.ByteVector byteVector2 = byteVector0.putUTF8("hi!");
        org.mockito.asm.ByteVector byteVector4 = byteVector2.putInt(0);
        org.mockito.asm.ByteVector byteVector6 = byteVector4.putShort((int) '4');
        org.mockito.asm.ByteVector byteVector8 = byteVector6.putByte(100);
        org.mockito.asm.ByteVector byteVector10 = byteVector6.putInt((int) (byte) 10);
        org.mockito.asm.ByteVector byteVector12 = byteVector6.putUTF8("hi!");
        org.mockito.asm.ByteVector byteVector14 = byteVector6.putUTF8("hi!");
        org.junit.Assert.assertNotNull(byteVector2);
        org.junit.Assert.assertNotNull(byteVector4);
        org.junit.Assert.assertNotNull(byteVector6);
        org.junit.Assert.assertNotNull(byteVector8);
        org.junit.Assert.assertNotNull(byteVector10);
        org.junit.Assert.assertNotNull(byteVector12);
        org.junit.Assert.assertNotNull(byteVector14);
    }

    @Test
    public void test1040() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1040");
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
        org.mockito.asm.ByteVector byteVector46 = byteVector16.putByteArray(byteArray40, (int) (byte) 0, (int) (short) 1);
        org.mockito.asm.ByteVector byteVector48 = byteVector16.putUTF8("");
        org.mockito.asm.ByteVector byteVector50 = byteVector16.putUTF8("hi!");
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
        org.junit.Assert.assertNotNull(byteVector46);
        org.junit.Assert.assertNotNull(byteVector48);
        org.junit.Assert.assertNotNull(byteVector50);
    }

    @Test
    public void test1041() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1041");
        org.mockito.asm.ByteVector byteVector1 = new org.mockito.asm.ByteVector((int) '#');
        org.mockito.asm.ByteVector byteVector3 = byteVector1.putInt(100);
        org.mockito.asm.ByteVector byteVector5 = byteVector1.putUTF8("");
        org.mockito.asm.ByteVector byteVector7 = byteVector5.putByte((int) '#');
        org.junit.Assert.assertNotNull(byteVector3);
        org.junit.Assert.assertNotNull(byteVector5);
        org.junit.Assert.assertNotNull(byteVector7);
    }

    @Test
    public void test1042() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1042");
        org.mockito.asm.ByteVector byteVector1 = new org.mockito.asm.ByteVector((int) '#');
        org.mockito.asm.ByteVector byteVector3 = byteVector1.putLong(100L);
        org.mockito.asm.ByteVector byteVector5 = byteVector3.putLong(1L);
        org.mockito.asm.ByteVector byteVector7 = byteVector5.putUTF8("hi!");
        org.mockito.asm.ByteVector byteVector9 = byteVector7.putUTF8("");
        org.mockito.asm.ByteVector byteVector11 = byteVector9.putShort((int) (byte) -1);
        org.mockito.asm.ByteVector byteVector13 = byteVector9.putShort(0);
        org.mockito.asm.ByteVector byteVector15 = byteVector9.putUTF8("");
        org.mockito.asm.ByteVector byteVector17 = byteVector15.putByte(10);
        org.mockito.asm.ByteVector byteVector19 = byteVector17.putLong(0L);
        org.mockito.asm.ByteVector byteVector21 = byteVector17.putInt((int) ' ');
        java.lang.Class<?> wildcardClass22 = byteVector17.getClass();
        org.junit.Assert.assertNotNull(byteVector3);
        org.junit.Assert.assertNotNull(byteVector5);
        org.junit.Assert.assertNotNull(byteVector7);
        org.junit.Assert.assertNotNull(byteVector9);
        org.junit.Assert.assertNotNull(byteVector11);
        org.junit.Assert.assertNotNull(byteVector13);
        org.junit.Assert.assertNotNull(byteVector15);
        org.junit.Assert.assertNotNull(byteVector17);
        org.junit.Assert.assertNotNull(byteVector19);
        org.junit.Assert.assertNotNull(byteVector21);
        org.junit.Assert.assertNotNull(wildcardClass22);
    }

    @Test
    public void test1043() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1043");
        org.mockito.asm.ByteVector byteVector0 = new org.mockito.asm.ByteVector();
        org.mockito.asm.ByteVector byteVector2 = byteVector0.putUTF8("hi!");
        org.mockito.asm.ByteVector byteVector4 = byteVector2.putInt(0);
        org.mockito.asm.ByteVector byteVector6 = byteVector4.putByte((int) (byte) 1);
        org.mockito.asm.ByteVector byteVector8 = byteVector4.putByte(0);
        java.lang.Class<?> wildcardClass9 = byteVector4.getClass();
        org.junit.Assert.assertNotNull(byteVector2);
        org.junit.Assert.assertNotNull(byteVector4);
        org.junit.Assert.assertNotNull(byteVector6);
        org.junit.Assert.assertNotNull(byteVector8);
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test1044() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1044");
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
        org.mockito.asm.ByteVector byteVector22 = byteVector20.putByte((int) '#');
        org.mockito.asm.ByteVector byteVector24 = byteVector20.putLong((long) '#');
        org.mockito.asm.ByteVector byteVector26 = new org.mockito.asm.ByteVector((int) '#');
        org.mockito.asm.ByteVector byteVector28 = byteVector26.putLong(100L);
        org.mockito.asm.ByteVector byteVector30 = byteVector28.putLong(1L);
        org.mockito.asm.ByteVector byteVector32 = byteVector30.putUTF8("hi!");
        org.mockito.asm.ByteVector byteVector34 = byteVector30.putUTF8("hi!");
        org.mockito.asm.ByteVector byteVector36 = byteVector34.putByte((int) (short) 0);
        org.mockito.asm.ByteVector byteVector38 = byteVector34.putInt(1);
        org.mockito.asm.ByteVector byteVector39 = new org.mockito.asm.ByteVector();
        org.mockito.asm.ByteVector byteVector41 = byteVector39.putUTF8("hi!");
        org.mockito.asm.ByteVector byteVector43 = byteVector41.putByte(100);
        org.mockito.asm.ByteVector byteVector45 = byteVector41.putShort((int) 'a');
        org.mockito.asm.ByteVector byteVector47 = byteVector45.putShort((int) (short) 0);
        org.mockito.asm.ByteVector byteVector48 = new org.mockito.asm.ByteVector();
        org.mockito.asm.ByteVector byteVector50 = byteVector48.putUTF8("hi!");
        org.mockito.asm.ByteVector byteVector52 = byteVector50.putInt(0);
        org.mockito.asm.ByteVector byteVector54 = byteVector50.putByte((int) (byte) 10);
        org.mockito.asm.ByteVector byteVector56 = byteVector54.putLong((-1L));
        org.mockito.asm.ByteVector byteVector58 = byteVector54.putInt((int) (byte) 100);
        org.mockito.asm.ByteVector byteVector59 = new org.mockito.asm.ByteVector();
        org.mockito.asm.ByteVector byteVector61 = byteVector59.putUTF8("hi!");
        org.mockito.asm.ByteVector byteVector63 = byteVector59.putInt(0);
        org.mockito.asm.ByteVector byteVector65 = byteVector63.putInt((int) ' ');
        org.mockito.asm.ByteVector byteVector67 = byteVector65.putLong(100L);
        byte[] byteArray71 = new byte[] { (byte) 0, (byte) 10, (byte) 1 };
        org.mockito.asm.ByteVector byteVector74 = byteVector65.putByteArray(byteArray71, 0, 0);
        org.mockito.asm.ByteVector byteVector77 = byteVector54.putByteArray(byteArray71, (int) (byte) 1, 0);
        org.mockito.asm.ByteVector byteVector80 = byteVector45.putByteArray(byteArray71, (int) (byte) 1, (int) (short) 1);
        org.mockito.asm.ByteVector byteVector83 = byteVector34.putByteArray(byteArray71, (int) (short) 0, (int) (byte) 0);
        // The following exception was thrown during execution in test generation
        try {
            org.mockito.asm.ByteVector byteVector86 = byteVector24.putByteArray(byteArray71, (-1), (int) (byte) -1);
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
        org.junit.Assert.assertNotNull(byteVector83);
    }

    @Test
    public void test1045() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1045");
        org.mockito.asm.ByteVector byteVector1 = new org.mockito.asm.ByteVector((int) (byte) 1);
        org.mockito.asm.ByteVector byteVector3 = byteVector1.putByte((int) (byte) 10);
        org.mockito.asm.ByteVector byteVector5 = byteVector3.putShort((int) (short) 10);
        org.mockito.asm.ByteVector byteVector7 = byteVector3.putUTF8("");
        org.mockito.asm.ByteVector byteVector9 = byteVector7.putLong((long) 'a');
        org.mockito.asm.ByteVector byteVector11 = byteVector7.putUTF8("");
        org.mockito.asm.ByteVector byteVector13 = byteVector11.putByte((int) (byte) 100);
        java.lang.Class<?> wildcardClass14 = byteVector13.getClass();
        org.junit.Assert.assertNotNull(byteVector3);
        org.junit.Assert.assertNotNull(byteVector5);
        org.junit.Assert.assertNotNull(byteVector7);
        org.junit.Assert.assertNotNull(byteVector9);
        org.junit.Assert.assertNotNull(byteVector11);
        org.junit.Assert.assertNotNull(byteVector13);
        org.junit.Assert.assertNotNull(wildcardClass14);
    }

    @Test
    public void test1046() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1046");
        org.mockito.asm.ByteVector byteVector1 = new org.mockito.asm.ByteVector((int) 'a');
        org.mockito.asm.ByteVector byteVector3 = byteVector1.putUTF8("hi!");
        java.lang.Class<?> wildcardClass4 = byteVector3.getClass();
        org.junit.Assert.assertNotNull(byteVector3);
        org.junit.Assert.assertNotNull(wildcardClass4);
    }

    @Test
    public void test1047() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1047");
        org.mockito.asm.ByteVector byteVector0 = new org.mockito.asm.ByteVector();
        org.mockito.asm.ByteVector byteVector2 = byteVector0.putUTF8("hi!");
        org.mockito.asm.ByteVector byteVector4 = byteVector0.putShort((int) (short) -1);
        org.mockito.asm.ByteVector byteVector6 = byteVector0.putLong(0L);
        org.mockito.asm.ByteVector byteVector8 = byteVector0.putShort((int) (byte) -1);
        org.mockito.asm.ByteVector byteVector10 = byteVector0.putInt((int) (short) 100);
        org.mockito.asm.ByteVector byteVector12 = byteVector10.putByte(100);
        org.junit.Assert.assertNotNull(byteVector2);
        org.junit.Assert.assertNotNull(byteVector4);
        org.junit.Assert.assertNotNull(byteVector6);
        org.junit.Assert.assertNotNull(byteVector8);
        org.junit.Assert.assertNotNull(byteVector10);
        org.junit.Assert.assertNotNull(byteVector12);
    }

    @Test
    public void test1048() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1048");
        org.mockito.asm.ByteVector byteVector0 = new org.mockito.asm.ByteVector();
        org.mockito.asm.ByteVector byteVector2 = byteVector0.putUTF8("hi!");
        org.mockito.asm.ByteVector byteVector4 = byteVector2.putInt(0);
        org.mockito.asm.ByteVector byteVector6 = byteVector2.putByte((int) (byte) 10);
        org.mockito.asm.ByteVector byteVector8 = byteVector6.putLong(0L);
        org.mockito.asm.ByteVector byteVector10 = byteVector8.putShort((int) 'a');
        org.mockito.asm.ByteVector byteVector12 = byteVector10.putLong(10L);
        org.mockito.asm.ByteVector byteVector14 = byteVector12.putUTF8("");
        org.junit.Assert.assertNotNull(byteVector2);
        org.junit.Assert.assertNotNull(byteVector4);
        org.junit.Assert.assertNotNull(byteVector6);
        org.junit.Assert.assertNotNull(byteVector8);
        org.junit.Assert.assertNotNull(byteVector10);
        org.junit.Assert.assertNotNull(byteVector12);
        org.junit.Assert.assertNotNull(byteVector14);
    }

    @Test
    public void test1049() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1049");
        org.mockito.asm.ByteVector byteVector0 = new org.mockito.asm.ByteVector();
        org.mockito.asm.ByteVector byteVector2 = byteVector0.putUTF8("hi!");
        org.mockito.asm.ByteVector byteVector4 = byteVector2.putLong((long) (byte) 10);
        org.mockito.asm.ByteVector byteVector6 = byteVector4.putUTF8("hi!");
        org.mockito.asm.ByteVector byteVector8 = byteVector4.putInt((int) (byte) 100);
        org.mockito.asm.ByteVector byteVector10 = byteVector4.putUTF8("hi!");
        org.mockito.asm.ByteVector byteVector12 = byteVector10.putUTF8("");
        org.mockito.asm.ByteVector byteVector14 = byteVector10.putInt((int) (short) 10);
        org.mockito.asm.ByteVector byteVector16 = byteVector10.putInt((int) (short) 100);
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
    public void test1050() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1050");
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
        org.mockito.asm.ByteVector byteVector20 = byteVector18.putUTF8("hi!");
        org.mockito.asm.ByteVector byteVector22 = byteVector20.putUTF8("");
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
    public void test1051() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1051");
        org.mockito.asm.ByteVector byteVector1 = new org.mockito.asm.ByteVector((int) '#');
        org.mockito.asm.ByteVector byteVector3 = byteVector1.putUTF8("hi!");
        org.mockito.asm.ByteVector byteVector5 = byteVector1.putUTF8("");
        org.mockito.asm.ByteVector byteVector7 = byteVector5.putByte((int) ' ');
        org.mockito.asm.ByteVector byteVector9 = byteVector7.putLong((long) (byte) 100);
        org.mockito.asm.ByteVector byteVector11 = new org.mockito.asm.ByteVector((int) '#');
        org.mockito.asm.ByteVector byteVector13 = byteVector11.putLong(100L);
        org.mockito.asm.ByteVector byteVector15 = byteVector13.putUTF8("");
        org.mockito.asm.ByteVector byteVector17 = byteVector13.putLong((-1L));
        org.mockito.asm.ByteVector byteVector19 = byteVector17.putLong((-1L));
        org.mockito.asm.ByteVector byteVector21 = byteVector19.putInt((int) (byte) 10);
        org.mockito.asm.ByteVector byteVector22 = new org.mockito.asm.ByteVector();
        org.mockito.asm.ByteVector byteVector24 = byteVector22.putUTF8("hi!");
        org.mockito.asm.ByteVector byteVector26 = byteVector22.putLong((long) ' ');
        org.mockito.asm.ByteVector byteVector28 = byteVector26.putByte((int) 'a');
        org.mockito.asm.ByteVector byteVector30 = byteVector26.putByte((int) (short) -1);
        org.mockito.asm.ByteVector byteVector32 = byteVector26.putLong(0L);
        org.mockito.asm.ByteVector byteVector34 = byteVector32.putByte(0);
        org.mockito.asm.ByteVector byteVector36 = byteVector34.putLong(1L);
        org.mockito.asm.ByteVector byteVector38 = byteVector36.putShort((int) 'a');
        org.mockito.asm.ByteVector byteVector40 = byteVector36.putLong((long) 10);
        org.mockito.asm.ByteVector byteVector42 = byteVector36.putUTF8("");
        org.mockito.asm.ByteVector byteVector43 = new org.mockito.asm.ByteVector();
        org.mockito.asm.ByteVector byteVector45 = byteVector43.putUTF8("hi!");
        org.mockito.asm.ByteVector byteVector47 = byteVector45.putLong((long) (byte) 10);
        org.mockito.asm.ByteVector byteVector49 = byteVector47.putUTF8("hi!");
        org.mockito.asm.ByteVector byteVector51 = byteVector47.putLong((long) (short) -1);
        org.mockito.asm.ByteVector byteVector53 = byteVector51.putInt(10);
        org.mockito.asm.ByteVector byteVector55 = byteVector51.putByte((int) (short) 1);
        org.mockito.asm.ByteVector byteVector57 = byteVector51.putInt((int) (short) -1);
        org.mockito.asm.ByteVector byteVector59 = byteVector51.putUTF8("hi!");
        org.mockito.asm.ByteVector byteVector60 = new org.mockito.asm.ByteVector();
        org.mockito.asm.ByteVector byteVector62 = byteVector60.putUTF8("hi!");
        org.mockito.asm.ByteVector byteVector64 = byteVector60.putLong((long) ' ');
        org.mockito.asm.ByteVector byteVector66 = byteVector64.putByte((int) 'a');
        org.mockito.asm.ByteVector byteVector68 = byteVector64.putByte((int) (short) -1);
        org.mockito.asm.ByteVector byteVector70 = byteVector64.putLong(0L);
        org.mockito.asm.ByteVector byteVector72 = byteVector64.putUTF8("hi!");
        org.mockito.asm.ByteVector byteVector74 = byteVector72.putUTF8("");
        org.mockito.asm.ByteVector byteVector76 = byteVector74.putLong((long) (byte) 10);
        org.mockito.asm.ByteVector byteVector78 = byteVector74.putLong((long) (short) 100);
        byte[] byteArray83 = new byte[] { (byte) 1, (byte) 0, (byte) 0, (byte) -1 };
        org.mockito.asm.ByteVector byteVector86 = byteVector74.putByteArray(byteArray83, 0, 0);
        org.mockito.asm.ByteVector byteVector89 = byteVector59.putByteArray(byteArray83, (int) (byte) 0, (int) (short) 1);
        org.mockito.asm.ByteVector byteVector92 = byteVector36.putByteArray(byteArray83, (int) (short) 0, (int) (short) 0);
        org.mockito.asm.ByteVector byteVector95 = byteVector21.putByteArray(byteArray83, 0, (int) (byte) 1);
        // The following exception was thrown during execution in test generation
        try {
            org.mockito.asm.ByteVector byteVector98 = byteVector9.putByteArray(byteArray83, (int) ' ', 100);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteVector3);
        org.junit.Assert.assertNotNull(byteVector5);
        org.junit.Assert.assertNotNull(byteVector7);
        org.junit.Assert.assertNotNull(byteVector9);
        org.junit.Assert.assertNotNull(byteVector13);
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
        org.junit.Assert.assertNotNull(byteVector38);
        org.junit.Assert.assertNotNull(byteVector40);
        org.junit.Assert.assertNotNull(byteVector42);
        org.junit.Assert.assertNotNull(byteVector45);
        org.junit.Assert.assertNotNull(byteVector47);
        org.junit.Assert.assertNotNull(byteVector49);
        org.junit.Assert.assertNotNull(byteVector51);
        org.junit.Assert.assertNotNull(byteVector53);
        org.junit.Assert.assertNotNull(byteVector55);
        org.junit.Assert.assertNotNull(byteVector57);
        org.junit.Assert.assertNotNull(byteVector59);
        org.junit.Assert.assertNotNull(byteVector62);
        org.junit.Assert.assertNotNull(byteVector64);
        org.junit.Assert.assertNotNull(byteVector66);
        org.junit.Assert.assertNotNull(byteVector68);
        org.junit.Assert.assertNotNull(byteVector70);
        org.junit.Assert.assertNotNull(byteVector72);
        org.junit.Assert.assertNotNull(byteVector74);
        org.junit.Assert.assertNotNull(byteVector76);
        org.junit.Assert.assertNotNull(byteVector78);
        org.junit.Assert.assertNotNull(byteArray83);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray83), "[1, 0, 0, -1]");
        org.junit.Assert.assertNotNull(byteVector86);
        org.junit.Assert.assertNotNull(byteVector89);
        org.junit.Assert.assertNotNull(byteVector92);
        org.junit.Assert.assertNotNull(byteVector95);
    }

    @Test
    public void test1052() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1052");
        org.mockito.asm.ByteVector byteVector0 = new org.mockito.asm.ByteVector();
        org.mockito.asm.ByteVector byteVector2 = byteVector0.putUTF8("hi!");
        org.mockito.asm.ByteVector byteVector4 = byteVector2.putInt(0);
        org.mockito.asm.ByteVector byteVector6 = byteVector4.putShort(1);
        org.mockito.asm.ByteVector byteVector8 = byteVector6.putByte((int) (byte) 1);
        org.mockito.asm.ByteVector byteVector10 = byteVector6.putLong((long) 10);
        org.mockito.asm.ByteVector byteVector12 = byteVector6.putUTF8("");
        org.mockito.asm.ByteVector byteVector14 = byteVector6.putByte((int) 'a');
        org.mockito.asm.ByteVector byteVector16 = byteVector14.putShort(100);
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
    public void test1053() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1053");
        org.mockito.asm.ByteVector byteVector0 = new org.mockito.asm.ByteVector();
        org.mockito.asm.ByteVector byteVector2 = byteVector0.putUTF8("hi!");
        org.mockito.asm.ByteVector byteVector4 = byteVector0.putInt(0);
        org.mockito.asm.ByteVector byteVector6 = byteVector0.putInt(1);
        org.mockito.asm.ByteVector byteVector8 = byteVector6.putLong((long) (-1));
        org.mockito.asm.ByteVector byteVector10 = byteVector8.putByte((-1));
        org.junit.Assert.assertNotNull(byteVector2);
        org.junit.Assert.assertNotNull(byteVector4);
        org.junit.Assert.assertNotNull(byteVector6);
        org.junit.Assert.assertNotNull(byteVector8);
        org.junit.Assert.assertNotNull(byteVector10);
    }

    @Test
    public void test1054() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1054");
        org.mockito.asm.ByteVector byteVector0 = new org.mockito.asm.ByteVector();
        org.mockito.asm.ByteVector byteVector2 = byteVector0.putUTF8("hi!");
        org.mockito.asm.ByteVector byteVector4 = byteVector0.putInt(0);
        org.mockito.asm.ByteVector byteVector6 = byteVector4.putInt((int) ' ');
        org.mockito.asm.ByteVector byteVector8 = byteVector6.putLong((long) (short) 10);
        org.mockito.asm.ByteVector byteVector10 = byteVector8.putLong((long) 'a');
        org.mockito.asm.ByteVector byteVector12 = byteVector10.putByte((int) (short) 10);
        org.mockito.asm.ByteVector byteVector14 = byteVector10.putInt(10);
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
            org.mockito.asm.ByteVector byteVector64 = byteVector14.putByteArray(byteArray52, (int) (byte) 1, (int) '#');
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
    public void test1055() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1055");
        org.mockito.asm.ByteVector byteVector0 = new org.mockito.asm.ByteVector();
        org.mockito.asm.ByteVector byteVector2 = byteVector0.putUTF8("hi!");
        org.mockito.asm.ByteVector byteVector4 = byteVector0.putInt(0);
        org.mockito.asm.ByteVector byteVector6 = byteVector0.putShort(10);
        org.mockito.asm.ByteVector byteVector8 = byteVector0.putUTF8("");
        org.mockito.asm.ByteVector byteVector10 = byteVector8.putUTF8("hi!");
        org.mockito.asm.ByteVector byteVector12 = byteVector10.putLong((long) (byte) 0);
        org.mockito.asm.ByteVector byteVector14 = byteVector10.putShort((int) '4');
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
            org.mockito.asm.ByteVector byteVector38 = byteVector10.putByteArray(byteArray29, (int) 'a', (int) (byte) 100);
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
    public void test1056() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1056");
        org.mockito.asm.ByteVector byteVector0 = new org.mockito.asm.ByteVector();
        org.mockito.asm.ByteVector byteVector2 = byteVector0.putUTF8("hi!");
        org.mockito.asm.ByteVector byteVector4 = byteVector0.putInt(0);
        org.mockito.asm.ByteVector byteVector6 = byteVector0.putShort(10);
        org.mockito.asm.ByteVector byteVector8 = byteVector6.putLong((long) '4');
        org.mockito.asm.ByteVector byteVector10 = byteVector8.putUTF8("hi!");
        org.mockito.asm.ByteVector byteVector12 = byteVector8.putInt((int) (short) 100);
        org.junit.Assert.assertNotNull(byteVector2);
        org.junit.Assert.assertNotNull(byteVector4);
        org.junit.Assert.assertNotNull(byteVector6);
        org.junit.Assert.assertNotNull(byteVector8);
        org.junit.Assert.assertNotNull(byteVector10);
        org.junit.Assert.assertNotNull(byteVector12);
    }

    @Test
    public void test1057() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1057");
        org.mockito.asm.ByteVector byteVector0 = new org.mockito.asm.ByteVector();
        org.mockito.asm.ByteVector byteVector2 = byteVector0.putUTF8("hi!");
        org.mockito.asm.ByteVector byteVector4 = byteVector2.putInt(0);
        org.mockito.asm.ByteVector byteVector6 = byteVector2.putByte((int) (byte) 10);
        org.mockito.asm.ByteVector byteVector8 = byteVector6.putUTF8("hi!");
        org.mockito.asm.ByteVector byteVector10 = byteVector8.putShort(0);
        org.mockito.asm.ByteVector byteVector12 = byteVector10.putLong(10L);
        org.mockito.asm.ByteVector byteVector14 = byteVector10.putUTF8("hi!");
        org.mockito.asm.ByteVector byteVector16 = byteVector14.putLong((long) 1);
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
    public void test1058() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1058");
        org.mockito.asm.ByteVector byteVector0 = new org.mockito.asm.ByteVector();
        org.mockito.asm.ByteVector byteVector2 = byteVector0.putUTF8("hi!");
        org.mockito.asm.ByteVector byteVector4 = byteVector2.putByte(100);
        org.mockito.asm.ByteVector byteVector6 = byteVector2.putLong((long) (short) 100);
        org.mockito.asm.ByteVector byteVector8 = byteVector6.putInt((int) 'a');
        java.lang.Class<?> wildcardClass9 = byteVector6.getClass();
        org.junit.Assert.assertNotNull(byteVector2);
        org.junit.Assert.assertNotNull(byteVector4);
        org.junit.Assert.assertNotNull(byteVector6);
        org.junit.Assert.assertNotNull(byteVector8);
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test1059() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1059");
        org.mockito.asm.ByteVector byteVector1 = new org.mockito.asm.ByteVector((int) (byte) 10);
        org.mockito.asm.ByteVector byteVector3 = byteVector1.putByte((int) '4');
        org.mockito.asm.ByteVector byteVector5 = byteVector1.putLong(0L);
        org.mockito.asm.ByteVector byteVector7 = byteVector5.putUTF8("");
        org.mockito.asm.ByteVector byteVector9 = byteVector5.putUTF8("hi!");
        org.mockito.asm.ByteVector byteVector11 = byteVector9.putLong((long) 'a');
        org.mockito.asm.ByteVector byteVector13 = byteVector9.putInt((int) (short) 100);
        org.mockito.asm.ByteVector byteVector15 = byteVector13.putInt((int) (short) 100);
        org.junit.Assert.assertNotNull(byteVector3);
        org.junit.Assert.assertNotNull(byteVector5);
        org.junit.Assert.assertNotNull(byteVector7);
        org.junit.Assert.assertNotNull(byteVector9);
        org.junit.Assert.assertNotNull(byteVector11);
        org.junit.Assert.assertNotNull(byteVector13);
        org.junit.Assert.assertNotNull(byteVector15);
    }

    @Test
    public void test1060() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1060");
        org.mockito.asm.ByteVector byteVector0 = new org.mockito.asm.ByteVector();
        org.mockito.asm.ByteVector byteVector2 = byteVector0.putUTF8("hi!");
        org.mockito.asm.ByteVector byteVector4 = byteVector2.putLong((long) (byte) 10);
        org.mockito.asm.ByteVector byteVector6 = byteVector2.putInt((int) (short) 1);
        org.mockito.asm.ByteVector byteVector8 = byteVector2.putLong((long) (short) 10);
        org.mockito.asm.ByteVector byteVector10 = byteVector8.putShort((int) (byte) 0);
        org.mockito.asm.ByteVector byteVector12 = byteVector10.putUTF8("hi!");
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
        org.mockito.asm.ByteVector byteVector66 = byteVector12.putByteArray(byteArray54, 1, (int) (byte) 0);
        java.lang.Class<?> wildcardClass67 = byteArray54.getClass();
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
        org.junit.Assert.assertNotNull(byteVector66);
        org.junit.Assert.assertNotNull(wildcardClass67);
    }

    @Test
    public void test1061() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1061");
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
        org.mockito.asm.ByteVector byteVector24 = byteVector22.putLong((long) 'a');
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
    public void test1062() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1062");
        org.mockito.asm.ByteVector byteVector0 = new org.mockito.asm.ByteVector();
        org.mockito.asm.ByteVector byteVector2 = byteVector0.putUTF8("hi!");
        org.mockito.asm.ByteVector byteVector4 = byteVector2.putInt(0);
        org.mockito.asm.ByteVector byteVector6 = byteVector2.putByte((int) (byte) 10);
        org.mockito.asm.ByteVector byteVector8 = byteVector6.putByte((int) (short) 1);
        org.mockito.asm.ByteVector byteVector10 = byteVector8.putUTF8("hi!");
        org.mockito.asm.ByteVector byteVector12 = byteVector8.putLong((long) 1);
        org.junit.Assert.assertNotNull(byteVector2);
        org.junit.Assert.assertNotNull(byteVector4);
        org.junit.Assert.assertNotNull(byteVector6);
        org.junit.Assert.assertNotNull(byteVector8);
        org.junit.Assert.assertNotNull(byteVector10);
        org.junit.Assert.assertNotNull(byteVector12);
    }

    @Test
    public void test1063() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1063");
        org.mockito.asm.ByteVector byteVector0 = new org.mockito.asm.ByteVector();
        org.mockito.asm.ByteVector byteVector2 = byteVector0.putUTF8("hi!");
        org.mockito.asm.ByteVector byteVector4 = byteVector2.putLong((long) (byte) 10);
        org.mockito.asm.ByteVector byteVector6 = byteVector4.putUTF8("hi!");
        org.mockito.asm.ByteVector byteVector8 = byteVector4.putInt((int) (byte) 100);
        org.mockito.asm.ByteVector byteVector10 = byteVector4.putUTF8("hi!");
        org.mockito.asm.ByteVector byteVector12 = byteVector10.putShort((int) (short) 0);
        org.mockito.asm.ByteVector byteVector14 = byteVector10.putInt(100);
        org.junit.Assert.assertNotNull(byteVector2);
        org.junit.Assert.assertNotNull(byteVector4);
        org.junit.Assert.assertNotNull(byteVector6);
        org.junit.Assert.assertNotNull(byteVector8);
        org.junit.Assert.assertNotNull(byteVector10);
        org.junit.Assert.assertNotNull(byteVector12);
        org.junit.Assert.assertNotNull(byteVector14);
    }

    @Test
    public void test1064() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1064");
        org.mockito.asm.ByteVector byteVector0 = new org.mockito.asm.ByteVector();
        org.mockito.asm.ByteVector byteVector2 = byteVector0.putUTF8("hi!");
        org.mockito.asm.ByteVector byteVector4 = byteVector2.putByte(100);
        org.mockito.asm.ByteVector byteVector6 = byteVector2.putLong((long) 10);
        org.mockito.asm.ByteVector byteVector8 = byteVector2.putShort((int) (short) -1);
        org.mockito.asm.ByteVector byteVector10 = byteVector8.putShort((int) (short) 1);
        org.mockito.asm.ByteVector byteVector12 = byteVector8.putShort((int) (byte) 0);
        org.junit.Assert.assertNotNull(byteVector2);
        org.junit.Assert.assertNotNull(byteVector4);
        org.junit.Assert.assertNotNull(byteVector6);
        org.junit.Assert.assertNotNull(byteVector8);
        org.junit.Assert.assertNotNull(byteVector10);
        org.junit.Assert.assertNotNull(byteVector12);
    }

    @Test
    public void test1065() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1065");
        org.mockito.asm.ByteVector byteVector1 = new org.mockito.asm.ByteVector((int) (byte) 1);
        org.mockito.asm.ByteVector byteVector3 = byteVector1.putByte((int) (short) 1);
        org.mockito.asm.ByteVector byteVector5 = byteVector1.putByte((int) (byte) 1);
        org.mockito.asm.ByteVector byteVector7 = byteVector1.putLong((long) 0);
        org.junit.Assert.assertNotNull(byteVector3);
        org.junit.Assert.assertNotNull(byteVector5);
        org.junit.Assert.assertNotNull(byteVector7);
    }

    @Test
    public void test1066() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1066");
        org.mockito.asm.ByteVector byteVector0 = new org.mockito.asm.ByteVector();
        org.mockito.asm.ByteVector byteVector2 = byteVector0.putUTF8("hi!");
        org.mockito.asm.ByteVector byteVector4 = byteVector0.putLong((long) (short) 1);
        org.mockito.asm.ByteVector byteVector6 = byteVector4.putShort((int) (byte) -1);
        org.mockito.asm.ByteVector byteVector8 = byteVector4.putUTF8("");
        org.mockito.asm.ByteVector byteVector10 = byteVector8.putShort((int) (short) -1);
        org.mockito.asm.ByteVector byteVector12 = new org.mockito.asm.ByteVector((int) (byte) 10);
        org.mockito.asm.ByteVector byteVector14 = byteVector12.putByte((int) '4');
        org.mockito.asm.ByteVector byteVector16 = byteVector12.putLong(0L);
        org.mockito.asm.ByteVector byteVector18 = byteVector16.putByte(10);
        org.mockito.asm.ByteVector byteVector20 = byteVector16.putUTF8("hi!");
        org.mockito.asm.ByteVector byteVector22 = byteVector20.putLong((long) (byte) 0);
        byte[] byteArray23 = null;
        org.mockito.asm.ByteVector byteVector26 = byteVector22.putByteArray(byteArray23, (int) (short) 10, (int) '#');
        org.mockito.asm.ByteVector byteVector27 = new org.mockito.asm.ByteVector();
        org.mockito.asm.ByteVector byteVector29 = byteVector27.putUTF8("hi!");
        org.mockito.asm.ByteVector byteVector31 = byteVector27.putLong((long) ' ');
        org.mockito.asm.ByteVector byteVector33 = byteVector31.putByte((int) 'a');
        org.mockito.asm.ByteVector byteVector35 = byteVector31.putByte((int) (short) -1);
        org.mockito.asm.ByteVector byteVector37 = byteVector31.putLong(0L);
        org.mockito.asm.ByteVector byteVector39 = byteVector37.putByte(0);
        org.mockito.asm.ByteVector byteVector41 = byteVector39.putByte(100);
        org.mockito.asm.ByteVector byteVector43 = byteVector39.putByte((int) '4');
        org.mockito.asm.ByteVector byteVector45 = byteVector43.putUTF8("hi!");
        org.mockito.asm.ByteVector byteVector47 = byteVector43.putShort(100);
        org.mockito.asm.ByteVector byteVector49 = byteVector43.putShort((int) (short) 100);
        org.mockito.asm.ByteVector byteVector50 = new org.mockito.asm.ByteVector();
        org.mockito.asm.ByteVector byteVector52 = byteVector50.putUTF8("hi!");
        org.mockito.asm.ByteVector byteVector54 = byteVector50.putInt(0);
        org.mockito.asm.ByteVector byteVector56 = byteVector50.putShort((int) '4');
        org.mockito.asm.ByteVector byteVector58 = byteVector50.putByte(100);
        org.mockito.asm.ByteVector byteVector60 = byteVector58.putInt((int) (byte) 10);
        org.mockito.asm.ByteVector byteVector62 = byteVector58.putInt((int) (byte) 10);
        org.mockito.asm.ByteVector byteVector64 = byteVector62.putByte(100);
        org.mockito.asm.ByteVector byteVector65 = new org.mockito.asm.ByteVector();
        org.mockito.asm.ByteVector byteVector67 = byteVector65.putUTF8("hi!");
        org.mockito.asm.ByteVector byteVector69 = byteVector65.putInt(0);
        org.mockito.asm.ByteVector byteVector71 = byteVector69.putInt((int) ' ');
        org.mockito.asm.ByteVector byteVector73 = byteVector71.putLong(100L);
        byte[] byteArray77 = new byte[] { (byte) 0, (byte) 10, (byte) 1 };
        org.mockito.asm.ByteVector byteVector80 = byteVector71.putByteArray(byteArray77, 0, 0);
        org.mockito.asm.ByteVector byteVector83 = byteVector64.putByteArray(byteArray77, (int) (byte) 1, (int) (byte) 0);
        org.mockito.asm.ByteVector byteVector86 = byteVector49.putByteArray(byteArray77, 1, (int) (byte) 1);
        org.mockito.asm.ByteVector byteVector89 = byteVector22.putByteArray(byteArray77, 0, (int) (byte) 1);
        org.mockito.asm.ByteVector byteVector92 = byteVector8.putByteArray(byteArray77, 1, 0);
        org.junit.Assert.assertNotNull(byteVector2);
        org.junit.Assert.assertNotNull(byteVector4);
        org.junit.Assert.assertNotNull(byteVector6);
        org.junit.Assert.assertNotNull(byteVector8);
        org.junit.Assert.assertNotNull(byteVector10);
        org.junit.Assert.assertNotNull(byteVector14);
        org.junit.Assert.assertNotNull(byteVector16);
        org.junit.Assert.assertNotNull(byteVector18);
        org.junit.Assert.assertNotNull(byteVector20);
        org.junit.Assert.assertNotNull(byteVector22);
        org.junit.Assert.assertNotNull(byteVector26);
        org.junit.Assert.assertNotNull(byteVector29);
        org.junit.Assert.assertNotNull(byteVector31);
        org.junit.Assert.assertNotNull(byteVector33);
        org.junit.Assert.assertNotNull(byteVector35);
        org.junit.Assert.assertNotNull(byteVector37);
        org.junit.Assert.assertNotNull(byteVector39);
        org.junit.Assert.assertNotNull(byteVector41);
        org.junit.Assert.assertNotNull(byteVector43);
        org.junit.Assert.assertNotNull(byteVector45);
        org.junit.Assert.assertNotNull(byteVector47);
        org.junit.Assert.assertNotNull(byteVector49);
        org.junit.Assert.assertNotNull(byteVector52);
        org.junit.Assert.assertNotNull(byteVector54);
        org.junit.Assert.assertNotNull(byteVector56);
        org.junit.Assert.assertNotNull(byteVector58);
        org.junit.Assert.assertNotNull(byteVector60);
        org.junit.Assert.assertNotNull(byteVector62);
        org.junit.Assert.assertNotNull(byteVector64);
        org.junit.Assert.assertNotNull(byteVector67);
        org.junit.Assert.assertNotNull(byteVector69);
        org.junit.Assert.assertNotNull(byteVector71);
        org.junit.Assert.assertNotNull(byteVector73);
        org.junit.Assert.assertNotNull(byteArray77);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray77), "[0, 10, 1]");
        org.junit.Assert.assertNotNull(byteVector80);
        org.junit.Assert.assertNotNull(byteVector83);
        org.junit.Assert.assertNotNull(byteVector86);
        org.junit.Assert.assertNotNull(byteVector89);
        org.junit.Assert.assertNotNull(byteVector92);
    }

    @Test
    public void test1067() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1067");
        org.mockito.asm.ByteVector byteVector0 = new org.mockito.asm.ByteVector();
        org.mockito.asm.ByteVector byteVector2 = byteVector0.putUTF8("hi!");
        org.mockito.asm.ByteVector byteVector4 = byteVector0.putInt(0);
        org.mockito.asm.ByteVector byteVector6 = byteVector0.putShort((int) '4');
        org.mockito.asm.ByteVector byteVector8 = byteVector0.putByte(100);
        org.mockito.asm.ByteVector byteVector10 = byteVector8.putInt((int) (byte) 10);
        org.mockito.asm.ByteVector byteVector12 = byteVector10.putByte((int) (byte) 1);
        org.mockito.asm.ByteVector byteVector14 = byteVector10.putShort((int) (short) 0);
        org.mockito.asm.ByteVector byteVector16 = byteVector10.putInt((int) (short) 1);
        org.mockito.asm.ByteVector byteVector18 = byteVector16.putUTF8("");
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
    public void test1068() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1068");
        org.mockito.asm.ByteVector byteVector0 = new org.mockito.asm.ByteVector();
        org.mockito.asm.ByteVector byteVector2 = byteVector0.putUTF8("hi!");
        org.mockito.asm.ByteVector byteVector4 = byteVector2.putInt((int) (byte) 10);
        org.mockito.asm.ByteVector byteVector6 = byteVector4.putUTF8("");
        org.mockito.asm.ByteVector byteVector8 = byteVector4.putLong((long) '#');
        org.mockito.asm.ByteVector byteVector10 = byteVector8.putLong((long) (short) 100);
        org.mockito.asm.ByteVector byteVector12 = byteVector8.putByte(1);
        org.mockito.asm.ByteVector byteVector14 = byteVector8.putUTF8("hi!");
        org.mockito.asm.ByteVector byteVector16 = byteVector14.putShort((int) 'a');
        org.mockito.asm.ByteVector byteVector18 = byteVector16.putInt((int) (short) 100);
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
    public void test1069() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1069");
        org.mockito.asm.ByteVector byteVector0 = new org.mockito.asm.ByteVector();
        org.mockito.asm.ByteVector byteVector2 = byteVector0.putUTF8("hi!");
        org.mockito.asm.ByteVector byteVector4 = byteVector0.putLong((long) ' ');
        org.mockito.asm.ByteVector byteVector6 = byteVector4.putByte((int) 'a');
        org.mockito.asm.ByteVector byteVector8 = byteVector4.putByte((int) (short) -1);
        org.mockito.asm.ByteVector byteVector10 = byteVector4.putLong(0L);
        org.mockito.asm.ByteVector byteVector12 = byteVector10.putByte(0);
        org.mockito.asm.ByteVector byteVector14 = byteVector10.putInt((int) (byte) 1);
        org.mockito.asm.ByteVector byteVector16 = byteVector14.putShort((-1));
        org.mockito.asm.ByteVector byteVector18 = byteVector14.putByte((int) (short) -1);
        org.mockito.asm.ByteVector byteVector20 = byteVector14.putLong((long) (short) -1);
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
    public void test1070() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1070");
        org.mockito.asm.ByteVector byteVector1 = new org.mockito.asm.ByteVector((int) (byte) 1);
        org.mockito.asm.ByteVector byteVector3 = byteVector1.putByte((int) (byte) 10);
        org.mockito.asm.ByteVector byteVector5 = byteVector3.putShort((int) (short) 10);
        org.mockito.asm.ByteVector byteVector7 = byteVector5.putShort((int) (byte) 1);
        org.mockito.asm.ByteVector byteVector9 = byteVector7.putShort((int) (byte) 10);
        org.mockito.asm.ByteVector byteVector10 = new org.mockito.asm.ByteVector();
        org.mockito.asm.ByteVector byteVector12 = byteVector10.putUTF8("hi!");
        org.mockito.asm.ByteVector byteVector14 = byteVector12.putLong((long) (byte) 10);
        org.mockito.asm.ByteVector byteVector16 = byteVector14.putUTF8("hi!");
        org.mockito.asm.ByteVector byteVector18 = byteVector14.putLong((long) (short) -1);
        org.mockito.asm.ByteVector byteVector20 = byteVector18.putInt(10);
        org.mockito.asm.ByteVector byteVector22 = byteVector18.putByte((int) (short) 1);
        org.mockito.asm.ByteVector byteVector24 = byteVector18.putInt((int) (short) -1);
        org.mockito.asm.ByteVector byteVector26 = byteVector18.putUTF8("hi!");
        org.mockito.asm.ByteVector byteVector27 = new org.mockito.asm.ByteVector();
        org.mockito.asm.ByteVector byteVector29 = byteVector27.putUTF8("hi!");
        org.mockito.asm.ByteVector byteVector31 = byteVector27.putLong((long) ' ');
        org.mockito.asm.ByteVector byteVector33 = byteVector31.putByte((int) 'a');
        org.mockito.asm.ByteVector byteVector35 = byteVector31.putByte((int) (short) -1);
        org.mockito.asm.ByteVector byteVector37 = byteVector31.putLong(0L);
        org.mockito.asm.ByteVector byteVector39 = byteVector31.putUTF8("hi!");
        org.mockito.asm.ByteVector byteVector41 = byteVector39.putUTF8("");
        org.mockito.asm.ByteVector byteVector43 = byteVector41.putLong((long) (byte) 10);
        org.mockito.asm.ByteVector byteVector45 = byteVector41.putLong((long) (short) 100);
        byte[] byteArray50 = new byte[] { (byte) 1, (byte) 0, (byte) 0, (byte) -1 };
        org.mockito.asm.ByteVector byteVector53 = byteVector41.putByteArray(byteArray50, 0, 0);
        org.mockito.asm.ByteVector byteVector56 = byteVector26.putByteArray(byteArray50, (int) (byte) 0, (int) (short) 1);
        // The following exception was thrown during execution in test generation
        try {
            org.mockito.asm.ByteVector byteVector59 = byteVector7.putByteArray(byteArray50, (int) ' ', 0);
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
        org.junit.Assert.assertNotNull(byteVector29);
        org.junit.Assert.assertNotNull(byteVector31);
        org.junit.Assert.assertNotNull(byteVector33);
        org.junit.Assert.assertNotNull(byteVector35);
        org.junit.Assert.assertNotNull(byteVector37);
        org.junit.Assert.assertNotNull(byteVector39);
        org.junit.Assert.assertNotNull(byteVector41);
        org.junit.Assert.assertNotNull(byteVector43);
        org.junit.Assert.assertNotNull(byteVector45);
        org.junit.Assert.assertNotNull(byteArray50);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray50), "[1, 0, 0, -1]");
        org.junit.Assert.assertNotNull(byteVector53);
        org.junit.Assert.assertNotNull(byteVector56);
    }

    @Test
    public void test1071() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1071");
        org.mockito.asm.ByteVector byteVector0 = new org.mockito.asm.ByteVector();
        org.mockito.asm.ByteVector byteVector2 = byteVector0.putUTF8("hi!");
        org.mockito.asm.ByteVector byteVector4 = byteVector2.putInt(0);
        org.mockito.asm.ByteVector byteVector6 = byteVector4.putByte((int) (byte) 1);
        org.mockito.asm.ByteVector byteVector8 = byteVector6.putShort((int) '4');
        java.lang.Class<?> wildcardClass9 = byteVector8.getClass();
        org.junit.Assert.assertNotNull(byteVector2);
        org.junit.Assert.assertNotNull(byteVector4);
        org.junit.Assert.assertNotNull(byteVector6);
        org.junit.Assert.assertNotNull(byteVector8);
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test1072() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1072");
        org.mockito.asm.ByteVector byteVector0 = new org.mockito.asm.ByteVector();
        org.mockito.asm.ByteVector byteVector2 = byteVector0.putUTF8("hi!");
        org.mockito.asm.ByteVector byteVector4 = byteVector2.putInt(0);
        org.mockito.asm.ByteVector byteVector6 = byteVector2.putByte((int) (byte) 10);
        org.mockito.asm.ByteVector byteVector8 = byteVector6.putUTF8("hi!");
        org.mockito.asm.ByteVector byteVector10 = byteVector8.putShort(0);
        org.mockito.asm.ByteVector byteVector11 = new org.mockito.asm.ByteVector();
        org.mockito.asm.ByteVector byteVector13 = byteVector11.putUTF8("hi!");
        org.mockito.asm.ByteVector byteVector15 = byteVector11.putLong((long) ' ');
        org.mockito.asm.ByteVector byteVector17 = byteVector15.putByte((int) 'a');
        org.mockito.asm.ByteVector byteVector19 = byteVector15.putByte((int) (short) -1);
        org.mockito.asm.ByteVector byteVector21 = byteVector15.putLong(0L);
        org.mockito.asm.ByteVector byteVector23 = byteVector21.putByte(0);
        org.mockito.asm.ByteVector byteVector25 = byteVector23.putByte(100);
        org.mockito.asm.ByteVector byteVector27 = byteVector23.putByte((int) '4');
        org.mockito.asm.ByteVector byteVector29 = byteVector27.putUTF8("hi!");
        org.mockito.asm.ByteVector byteVector31 = byteVector27.putShort(100);
        org.mockito.asm.ByteVector byteVector33 = byteVector27.putShort((int) (short) 100);
        org.mockito.asm.ByteVector byteVector34 = new org.mockito.asm.ByteVector();
        org.mockito.asm.ByteVector byteVector36 = byteVector34.putUTF8("hi!");
        org.mockito.asm.ByteVector byteVector38 = byteVector34.putInt(0);
        org.mockito.asm.ByteVector byteVector40 = byteVector34.putShort((int) '4');
        org.mockito.asm.ByteVector byteVector42 = byteVector34.putByte(100);
        org.mockito.asm.ByteVector byteVector44 = byteVector42.putInt((int) (byte) 10);
        org.mockito.asm.ByteVector byteVector46 = byteVector42.putInt((int) (byte) 10);
        org.mockito.asm.ByteVector byteVector48 = byteVector46.putByte(100);
        org.mockito.asm.ByteVector byteVector49 = new org.mockito.asm.ByteVector();
        org.mockito.asm.ByteVector byteVector51 = byteVector49.putUTF8("hi!");
        org.mockito.asm.ByteVector byteVector53 = byteVector49.putInt(0);
        org.mockito.asm.ByteVector byteVector55 = byteVector53.putInt((int) ' ');
        org.mockito.asm.ByteVector byteVector57 = byteVector55.putLong(100L);
        byte[] byteArray61 = new byte[] { (byte) 0, (byte) 10, (byte) 1 };
        org.mockito.asm.ByteVector byteVector64 = byteVector55.putByteArray(byteArray61, 0, 0);
        org.mockito.asm.ByteVector byteVector67 = byteVector48.putByteArray(byteArray61, (int) (byte) 1, (int) (byte) 0);
        org.mockito.asm.ByteVector byteVector70 = byteVector33.putByteArray(byteArray61, 1, (int) (byte) 1);
        // The following exception was thrown during execution in test generation
        try {
            org.mockito.asm.ByteVector byteVector73 = byteVector8.putByteArray(byteArray61, (int) (byte) 1, (int) (byte) -1);
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
        org.junit.Assert.assertNotNull(byteVector33);
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
    public void test1073() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1073");
        org.mockito.asm.ByteVector byteVector0 = new org.mockito.asm.ByteVector();
        org.mockito.asm.ByteVector byteVector2 = byteVector0.putUTF8("hi!");
        org.mockito.asm.ByteVector byteVector4 = byteVector2.putLong((long) (byte) 10);
        org.mockito.asm.ByteVector byteVector6 = byteVector4.putUTF8("hi!");
        org.mockito.asm.ByteVector byteVector8 = byteVector4.putLong((-1L));
        org.mockito.asm.ByteVector byteVector10 = byteVector8.putInt(10);
        org.mockito.asm.ByteVector byteVector12 = byteVector8.putShort((int) (byte) 0);
        org.mockito.asm.ByteVector byteVector14 = byteVector8.putShort((int) 'a');
        org.mockito.asm.ByteVector byteVector16 = byteVector8.putInt(0);
        org.mockito.asm.ByteVector byteVector18 = byteVector8.putByte((int) ' ');
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
    public void test1074() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1074");
        org.mockito.asm.ByteVector byteVector0 = new org.mockito.asm.ByteVector();
        org.mockito.asm.ByteVector byteVector2 = byteVector0.putUTF8("hi!");
        org.mockito.asm.ByteVector byteVector4 = byteVector0.putInt(0);
        org.mockito.asm.ByteVector byteVector6 = byteVector4.putInt((int) ' ');
        org.mockito.asm.ByteVector byteVector8 = byteVector6.putLong((long) (short) 10);
        org.mockito.asm.ByteVector byteVector10 = byteVector6.putInt((int) '4');
        org.mockito.asm.ByteVector byteVector12 = byteVector6.putInt((int) (short) 100);
        org.mockito.asm.ByteVector byteVector13 = new org.mockito.asm.ByteVector();
        org.mockito.asm.ByteVector byteVector15 = byteVector13.putUTF8("hi!");
        org.mockito.asm.ByteVector byteVector17 = byteVector13.putLong((long) ' ');
        org.mockito.asm.ByteVector byteVector19 = byteVector17.putByte((int) 'a');
        org.mockito.asm.ByteVector byteVector21 = byteVector17.putByte((int) (short) -1);
        org.mockito.asm.ByteVector byteVector23 = byteVector17.putLong(0L);
        org.mockito.asm.ByteVector byteVector25 = byteVector23.putByte(0);
        org.mockito.asm.ByteVector byteVector27 = byteVector25.putByte(100);
        org.mockito.asm.ByteVector byteVector29 = byteVector25.putByte((int) '4');
        org.mockito.asm.ByteVector byteVector31 = byteVector29.putUTF8("hi!");
        org.mockito.asm.ByteVector byteVector33 = byteVector29.putShort(100);
        org.mockito.asm.ByteVector byteVector35 = byteVector29.putShort((int) (short) 100);
        org.mockito.asm.ByteVector byteVector36 = new org.mockito.asm.ByteVector();
        org.mockito.asm.ByteVector byteVector38 = byteVector36.putUTF8("hi!");
        org.mockito.asm.ByteVector byteVector40 = byteVector36.putInt(0);
        org.mockito.asm.ByteVector byteVector42 = byteVector36.putShort((int) '4');
        org.mockito.asm.ByteVector byteVector44 = byteVector36.putByte(100);
        org.mockito.asm.ByteVector byteVector46 = byteVector44.putInt((int) (byte) 10);
        org.mockito.asm.ByteVector byteVector48 = byteVector44.putInt((int) (byte) 10);
        org.mockito.asm.ByteVector byteVector50 = byteVector48.putByte(100);
        org.mockito.asm.ByteVector byteVector51 = new org.mockito.asm.ByteVector();
        org.mockito.asm.ByteVector byteVector53 = byteVector51.putUTF8("hi!");
        org.mockito.asm.ByteVector byteVector55 = byteVector51.putInt(0);
        org.mockito.asm.ByteVector byteVector57 = byteVector55.putInt((int) ' ');
        org.mockito.asm.ByteVector byteVector59 = byteVector57.putLong(100L);
        byte[] byteArray63 = new byte[] { (byte) 0, (byte) 10, (byte) 1 };
        org.mockito.asm.ByteVector byteVector66 = byteVector57.putByteArray(byteArray63, 0, 0);
        org.mockito.asm.ByteVector byteVector69 = byteVector50.putByteArray(byteArray63, (int) (byte) 1, (int) (byte) 0);
        org.mockito.asm.ByteVector byteVector72 = byteVector35.putByteArray(byteArray63, 1, (int) (byte) 1);
        // The following exception was thrown during execution in test generation
        try {
            org.mockito.asm.ByteVector byteVector75 = byteVector12.putByteArray(byteArray63, 1, (int) '4');
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
        org.junit.Assert.assertNotNull(byteVector35);
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
    public void test1075() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1075");
        org.mockito.asm.ByteVector byteVector0 = new org.mockito.asm.ByteVector();
        org.mockito.asm.ByteVector byteVector2 = byteVector0.putUTF8("hi!");
        org.mockito.asm.ByteVector byteVector4 = byteVector0.putShort((int) (short) -1);
        org.mockito.asm.ByteVector byteVector6 = byteVector0.putInt((int) (byte) 10);
        org.mockito.asm.ByteVector byteVector8 = byteVector6.putUTF8("hi!");
        org.mockito.asm.ByteVector byteVector10 = byteVector8.putInt((int) (short) 10);
        org.mockito.asm.ByteVector byteVector12 = byteVector8.putShort((-1));
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
        org.mockito.asm.ByteVector byteVector33 = byteVector31.putUTF8("hi!");
        org.mockito.asm.ByteVector byteVector35 = byteVector33.putUTF8("");
        org.mockito.asm.ByteVector byteVector37 = byteVector33.putInt((int) (byte) 0);
        org.mockito.asm.ByteVector byteVector39 = byteVector37.putInt((int) 'a');
        org.mockito.asm.ByteVector byteVector41 = new org.mockito.asm.ByteVector((int) '#');
        org.mockito.asm.ByteVector byteVector43 = byteVector41.putInt(100);
        org.mockito.asm.ByteVector byteVector45 = byteVector43.putShort((int) (short) -1);
        org.mockito.asm.ByteVector byteVector47 = byteVector45.putShort((int) (short) 0);
        org.mockito.asm.ByteVector byteVector49 = byteVector45.putUTF8("");
        org.mockito.asm.ByteVector byteVector50 = new org.mockito.asm.ByteVector();
        org.mockito.asm.ByteVector byteVector52 = byteVector50.putUTF8("hi!");
        org.mockito.asm.ByteVector byteVector54 = byteVector50.putLong((long) ' ');
        org.mockito.asm.ByteVector byteVector56 = byteVector54.putByte((int) 'a');
        org.mockito.asm.ByteVector byteVector58 = byteVector54.putByte((int) (short) -1);
        org.mockito.asm.ByteVector byteVector60 = byteVector54.putLong(0L);
        org.mockito.asm.ByteVector byteVector62 = byteVector54.putUTF8("hi!");
        org.mockito.asm.ByteVector byteVector64 = byteVector62.putUTF8("");
        org.mockito.asm.ByteVector byteVector66 = byteVector62.putInt((int) (byte) 10);
        org.mockito.asm.ByteVector byteVector68 = byteVector62.putByte(0);
        org.mockito.asm.ByteVector byteVector69 = new org.mockito.asm.ByteVector();
        org.mockito.asm.ByteVector byteVector71 = byteVector69.putUTF8("hi!");
        org.mockito.asm.ByteVector byteVector73 = byteVector69.putInt(0);
        org.mockito.asm.ByteVector byteVector75 = byteVector73.putInt((int) ' ');
        org.mockito.asm.ByteVector byteVector77 = byteVector75.putLong(100L);
        byte[] byteArray81 = new byte[] { (byte) 0, (byte) 10, (byte) 1 };
        org.mockito.asm.ByteVector byteVector84 = byteVector75.putByteArray(byteArray81, 0, 0);
        org.mockito.asm.ByteVector byteVector87 = byteVector68.putByteArray(byteArray81, (int) (short) 1, 0);
        org.mockito.asm.ByteVector byteVector90 = byteVector45.putByteArray(byteArray81, 1, 1);
        org.mockito.asm.ByteVector byteVector93 = byteVector37.putByteArray(byteArray81, (int) (byte) 0, (int) (byte) 0);
        // The following exception was thrown during execution in test generation
        try {
            org.mockito.asm.ByteVector byteVector96 = byteVector8.putByteArray(byteArray81, (int) '#', 1);
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
        org.junit.Assert.assertNotNull(byteVector35);
        org.junit.Assert.assertNotNull(byteVector37);
        org.junit.Assert.assertNotNull(byteVector39);
        org.junit.Assert.assertNotNull(byteVector43);
        org.junit.Assert.assertNotNull(byteVector45);
        org.junit.Assert.assertNotNull(byteVector47);
        org.junit.Assert.assertNotNull(byteVector49);
        org.junit.Assert.assertNotNull(byteVector52);
        org.junit.Assert.assertNotNull(byteVector54);
        org.junit.Assert.assertNotNull(byteVector56);
        org.junit.Assert.assertNotNull(byteVector58);
        org.junit.Assert.assertNotNull(byteVector60);
        org.junit.Assert.assertNotNull(byteVector62);
        org.junit.Assert.assertNotNull(byteVector64);
        org.junit.Assert.assertNotNull(byteVector66);
        org.junit.Assert.assertNotNull(byteVector68);
        org.junit.Assert.assertNotNull(byteVector71);
        org.junit.Assert.assertNotNull(byteVector73);
        org.junit.Assert.assertNotNull(byteVector75);
        org.junit.Assert.assertNotNull(byteVector77);
        org.junit.Assert.assertNotNull(byteArray81);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray81), "[0, 10, 1]");
        org.junit.Assert.assertNotNull(byteVector84);
        org.junit.Assert.assertNotNull(byteVector87);
        org.junit.Assert.assertNotNull(byteVector90);
        org.junit.Assert.assertNotNull(byteVector93);
    }

    @Test
    public void test1076() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1076");
        org.mockito.asm.ByteVector byteVector0 = new org.mockito.asm.ByteVector();
        org.mockito.asm.ByteVector byteVector2 = byteVector0.putUTF8("hi!");
        org.mockito.asm.ByteVector byteVector4 = byteVector2.putInt((int) (byte) 10);
        org.mockito.asm.ByteVector byteVector6 = byteVector2.putLong((long) 0);
        org.mockito.asm.ByteVector byteVector8 = byteVector2.putUTF8("hi!");
        org.mockito.asm.ByteVector byteVector10 = byteVector2.putInt(0);
        org.junit.Assert.assertNotNull(byteVector2);
        org.junit.Assert.assertNotNull(byteVector4);
        org.junit.Assert.assertNotNull(byteVector6);
        org.junit.Assert.assertNotNull(byteVector8);
        org.junit.Assert.assertNotNull(byteVector10);
    }

    @Test
    public void test1077() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1077");
        org.mockito.asm.ByteVector byteVector0 = new org.mockito.asm.ByteVector();
        org.mockito.asm.ByteVector byteVector2 = byteVector0.putUTF8("hi!");
        org.mockito.asm.ByteVector byteVector4 = byteVector0.putInt(0);
        org.mockito.asm.ByteVector byteVector6 = byteVector0.putShort(10);
        org.mockito.asm.ByteVector byteVector8 = byteVector0.putUTF8("");
        org.mockito.asm.ByteVector byteVector9 = new org.mockito.asm.ByteVector();
        org.mockito.asm.ByteVector byteVector11 = byteVector9.putUTF8("hi!");
        org.mockito.asm.ByteVector byteVector13 = byteVector9.putShort((int) (short) -1);
        org.mockito.asm.ByteVector byteVector15 = byteVector9.putLong(0L);
        org.mockito.asm.ByteVector byteVector17 = byteVector9.putShort((int) (byte) -1);
        org.mockito.asm.ByteVector byteVector19 = byteVector17.putByte((int) (byte) 0);
        org.mockito.asm.ByteVector byteVector20 = new org.mockito.asm.ByteVector();
        org.mockito.asm.ByteVector byteVector22 = byteVector20.putUTF8("hi!");
        org.mockito.asm.ByteVector byteVector24 = byteVector20.putLong((long) ' ');
        org.mockito.asm.ByteVector byteVector26 = byteVector24.putByte((int) 'a');
        org.mockito.asm.ByteVector byteVector28 = byteVector24.putByte((int) (short) -1);
        org.mockito.asm.ByteVector byteVector30 = byteVector24.putLong(0L);
        org.mockito.asm.ByteVector byteVector32 = byteVector30.putByte(0);
        org.mockito.asm.ByteVector byteVector34 = byteVector32.putByte(100);
        org.mockito.asm.ByteVector byteVector36 = byteVector32.putByte((int) '4');
        org.mockito.asm.ByteVector byteVector38 = byteVector36.putUTF8("hi!");
        org.mockito.asm.ByteVector byteVector40 = byteVector36.putShort(100);
        org.mockito.asm.ByteVector byteVector42 = byteVector36.putShort((int) (short) 100);
        org.mockito.asm.ByteVector byteVector43 = new org.mockito.asm.ByteVector();
        org.mockito.asm.ByteVector byteVector45 = byteVector43.putUTF8("hi!");
        org.mockito.asm.ByteVector byteVector47 = byteVector43.putInt(0);
        org.mockito.asm.ByteVector byteVector49 = byteVector43.putShort((int) '4');
        org.mockito.asm.ByteVector byteVector51 = byteVector43.putByte(100);
        org.mockito.asm.ByteVector byteVector53 = byteVector51.putInt((int) (byte) 10);
        org.mockito.asm.ByteVector byteVector55 = byteVector51.putInt((int) (byte) 10);
        org.mockito.asm.ByteVector byteVector57 = byteVector55.putByte(100);
        org.mockito.asm.ByteVector byteVector58 = new org.mockito.asm.ByteVector();
        org.mockito.asm.ByteVector byteVector60 = byteVector58.putUTF8("hi!");
        org.mockito.asm.ByteVector byteVector62 = byteVector58.putInt(0);
        org.mockito.asm.ByteVector byteVector64 = byteVector62.putInt((int) ' ');
        org.mockito.asm.ByteVector byteVector66 = byteVector64.putLong(100L);
        byte[] byteArray70 = new byte[] { (byte) 0, (byte) 10, (byte) 1 };
        org.mockito.asm.ByteVector byteVector73 = byteVector64.putByteArray(byteArray70, 0, 0);
        org.mockito.asm.ByteVector byteVector76 = byteVector57.putByteArray(byteArray70, (int) (byte) 1, (int) (byte) 0);
        org.mockito.asm.ByteVector byteVector79 = byteVector42.putByteArray(byteArray70, 1, (int) (byte) 1);
        org.mockito.asm.ByteVector byteVector82 = byteVector19.putByteArray(byteArray70, (int) (byte) 1, 0);
        // The following exception was thrown during execution in test generation
        try {
            org.mockito.asm.ByteVector byteVector85 = byteVector8.putByteArray(byteArray70, (int) '4', 10);
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
        org.junit.Assert.assertNotNull(byteVector30);
        org.junit.Assert.assertNotNull(byteVector32);
        org.junit.Assert.assertNotNull(byteVector34);
        org.junit.Assert.assertNotNull(byteVector36);
        org.junit.Assert.assertNotNull(byteVector38);
        org.junit.Assert.assertNotNull(byteVector40);
        org.junit.Assert.assertNotNull(byteVector42);
        org.junit.Assert.assertNotNull(byteVector45);
        org.junit.Assert.assertNotNull(byteVector47);
        org.junit.Assert.assertNotNull(byteVector49);
        org.junit.Assert.assertNotNull(byteVector51);
        org.junit.Assert.assertNotNull(byteVector53);
        org.junit.Assert.assertNotNull(byteVector55);
        org.junit.Assert.assertNotNull(byteVector57);
        org.junit.Assert.assertNotNull(byteVector60);
        org.junit.Assert.assertNotNull(byteVector62);
        org.junit.Assert.assertNotNull(byteVector64);
        org.junit.Assert.assertNotNull(byteVector66);
        org.junit.Assert.assertNotNull(byteArray70);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray70), "[0, 10, 1]");
        org.junit.Assert.assertNotNull(byteVector73);
        org.junit.Assert.assertNotNull(byteVector76);
        org.junit.Assert.assertNotNull(byteVector79);
        org.junit.Assert.assertNotNull(byteVector82);
    }

    @Test
    public void test1078() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1078");
        org.mockito.asm.ByteVector byteVector1 = new org.mockito.asm.ByteVector((int) (byte) 1);
        org.mockito.asm.ByteVector byteVector3 = byteVector1.putByte((int) (byte) 10);
        org.mockito.asm.ByteVector byteVector5 = byteVector1.putShort((int) (byte) 1);
        org.mockito.asm.ByteVector byteVector7 = byteVector1.putInt((int) (short) -1);
        org.junit.Assert.assertNotNull(byteVector3);
        org.junit.Assert.assertNotNull(byteVector5);
        org.junit.Assert.assertNotNull(byteVector7);
    }

    @Test
    public void test1079() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1079");
        org.mockito.asm.ByteVector byteVector0 = new org.mockito.asm.ByteVector();
        org.mockito.asm.ByteVector byteVector2 = byteVector0.putUTF8("hi!");
        org.mockito.asm.ByteVector byteVector4 = byteVector2.putInt((int) (byte) 10);
        org.mockito.asm.ByteVector byteVector6 = byteVector4.putUTF8("");
        org.mockito.asm.ByteVector byteVector8 = byteVector6.putUTF8("hi!");
        org.mockito.asm.ByteVector byteVector10 = byteVector6.putInt((int) '#');
        org.mockito.asm.ByteVector byteVector12 = byteVector6.putUTF8("hi!");
        org.mockito.asm.ByteVector byteVector14 = byteVector6.putLong((long) 'a');
        org.junit.Assert.assertNotNull(byteVector2);
        org.junit.Assert.assertNotNull(byteVector4);
        org.junit.Assert.assertNotNull(byteVector6);
        org.junit.Assert.assertNotNull(byteVector8);
        org.junit.Assert.assertNotNull(byteVector10);
        org.junit.Assert.assertNotNull(byteVector12);
        org.junit.Assert.assertNotNull(byteVector14);
    }

    @Test
    public void test1080() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1080");
        org.mockito.asm.ByteVector byteVector0 = new org.mockito.asm.ByteVector();
        org.mockito.asm.ByteVector byteVector2 = byteVector0.putUTF8("hi!");
        org.mockito.asm.ByteVector byteVector4 = byteVector2.putLong((long) (byte) 10);
        org.mockito.asm.ByteVector byteVector6 = new org.mockito.asm.ByteVector((int) (byte) 1);
        org.mockito.asm.ByteVector byteVector8 = byteVector6.putByte((int) (byte) 10);
        org.mockito.asm.ByteVector byteVector10 = byteVector8.putShort((int) (short) 10);
        org.mockito.asm.ByteVector byteVector12 = byteVector10.putShort((int) (byte) 1);
        org.mockito.asm.ByteVector byteVector14 = byteVector12.putInt((int) (byte) -1);
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
        org.mockito.asm.ByteVector byteVector88 = byteVector12.putByteArray(byteArray76, 0, (int) (byte) 1);
        // The following exception was thrown during execution in test generation
        try {
            org.mockito.asm.ByteVector byteVector91 = byteVector4.putByteArray(byteArray76, (int) 'a', (-1));
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteVector2);
        org.junit.Assert.assertNotNull(byteVector4);
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
        org.junit.Assert.assertNotNull(byteVector88);
    }

    @Test
    public void test1081() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1081");
        org.mockito.asm.ByteVector byteVector0 = new org.mockito.asm.ByteVector();
        org.mockito.asm.ByteVector byteVector2 = byteVector0.putUTF8("hi!");
        org.mockito.asm.ByteVector byteVector4 = byteVector0.putLong((long) ' ');
        org.mockito.asm.ByteVector byteVector6 = byteVector4.putByte((int) 'a');
        org.mockito.asm.ByteVector byteVector8 = byteVector4.putByte((int) (short) -1);
        org.mockito.asm.ByteVector byteVector10 = byteVector4.putLong(0L);
        org.mockito.asm.ByteVector byteVector12 = byteVector10.putByte(0);
        org.mockito.asm.ByteVector byteVector14 = byteVector12.putLong(1L);
        org.mockito.asm.ByteVector byteVector16 = byteVector14.putShort((int) (byte) 10);
        org.mockito.asm.ByteVector byteVector18 = byteVector16.putLong((long) '#');
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
    public void test1082() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1082");
        org.mockito.asm.ByteVector byteVector1 = new org.mockito.asm.ByteVector((int) (short) 0);
        org.mockito.asm.ByteVector byteVector2 = new org.mockito.asm.ByteVector();
        org.mockito.asm.ByteVector byteVector4 = byteVector2.putUTF8("hi!");
        org.mockito.asm.ByteVector byteVector6 = byteVector2.putInt(0);
        org.mockito.asm.ByteVector byteVector8 = byteVector6.putInt((int) ' ');
        org.mockito.asm.ByteVector byteVector10 = byteVector8.putLong(100L);
        byte[] byteArray14 = new byte[] { (byte) 0, (byte) 10, (byte) 1 };
        org.mockito.asm.ByteVector byteVector17 = byteVector8.putByteArray(byteArray14, 0, 0);
        org.mockito.asm.ByteVector byteVector20 = byteVector1.putByteArray(byteArray14, 1, (int) (short) 0);
        org.mockito.asm.ByteVector byteVector22 = byteVector1.putShort((int) (short) 0);
        org.mockito.asm.ByteVector byteVector24 = new org.mockito.asm.ByteVector((int) (byte) 10);
        org.mockito.asm.ByteVector byteVector26 = byteVector24.putByte((int) '4');
        org.mockito.asm.ByteVector byteVector28 = byteVector24.putLong((long) 'a');
        org.mockito.asm.ByteVector byteVector30 = byteVector24.putUTF8("");
        org.mockito.asm.ByteVector byteVector32 = byteVector24.putUTF8("");
        org.mockito.asm.ByteVector byteVector34 = byteVector32.putShort((int) (short) -1);
        org.mockito.asm.ByteVector byteVector35 = new org.mockito.asm.ByteVector();
        org.mockito.asm.ByteVector byteVector37 = byteVector35.putUTF8("hi!");
        org.mockito.asm.ByteVector byteVector39 = byteVector37.putInt(0);
        org.mockito.asm.ByteVector byteVector41 = byteVector39.putByte((int) (short) 0);
        org.mockito.asm.ByteVector byteVector43 = byteVector39.putUTF8("");
        org.mockito.asm.ByteVector byteVector44 = new org.mockito.asm.ByteVector();
        org.mockito.asm.ByteVector byteVector46 = byteVector44.putUTF8("hi!");
        org.mockito.asm.ByteVector byteVector48 = byteVector44.putInt(0);
        org.mockito.asm.ByteVector byteVector50 = byteVector44.putShort((int) '4');
        org.mockito.asm.ByteVector byteVector52 = byteVector44.putByte(100);
        org.mockito.asm.ByteVector byteVector54 = byteVector52.putInt((int) (byte) 10);
        org.mockito.asm.ByteVector byteVector56 = byteVector52.putInt((int) (byte) 10);
        org.mockito.asm.ByteVector byteVector58 = byteVector56.putByte(100);
        org.mockito.asm.ByteVector byteVector59 = new org.mockito.asm.ByteVector();
        org.mockito.asm.ByteVector byteVector61 = byteVector59.putUTF8("hi!");
        org.mockito.asm.ByteVector byteVector63 = byteVector59.putInt(0);
        org.mockito.asm.ByteVector byteVector65 = byteVector63.putInt((int) ' ');
        org.mockito.asm.ByteVector byteVector67 = byteVector65.putLong(100L);
        byte[] byteArray71 = new byte[] { (byte) 0, (byte) 10, (byte) 1 };
        org.mockito.asm.ByteVector byteVector74 = byteVector65.putByteArray(byteArray71, 0, 0);
        org.mockito.asm.ByteVector byteVector77 = byteVector58.putByteArray(byteArray71, (int) (byte) 1, (int) (byte) 0);
        org.mockito.asm.ByteVector byteVector80 = byteVector39.putByteArray(byteArray71, (int) (short) 0, 0);
        org.mockito.asm.ByteVector byteVector83 = byteVector34.putByteArray(byteArray71, (int) (byte) 1, 0);
        org.mockito.asm.ByteVector byteVector86 = byteVector22.putByteArray(byteArray71, (int) (short) 1, 0);
        org.junit.Assert.assertNotNull(byteVector4);
        org.junit.Assert.assertNotNull(byteVector6);
        org.junit.Assert.assertNotNull(byteVector8);
        org.junit.Assert.assertNotNull(byteVector10);
        org.junit.Assert.assertNotNull(byteArray14);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray14), "[0, 10, 1]");
        org.junit.Assert.assertNotNull(byteVector17);
        org.junit.Assert.assertNotNull(byteVector20);
        org.junit.Assert.assertNotNull(byteVector22);
        org.junit.Assert.assertNotNull(byteVector26);
        org.junit.Assert.assertNotNull(byteVector28);
        org.junit.Assert.assertNotNull(byteVector30);
        org.junit.Assert.assertNotNull(byteVector32);
        org.junit.Assert.assertNotNull(byteVector34);
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
        org.junit.Assert.assertNotNull(byteVector61);
        org.junit.Assert.assertNotNull(byteVector63);
        org.junit.Assert.assertNotNull(byteVector65);
        org.junit.Assert.assertNotNull(byteVector67);
        org.junit.Assert.assertNotNull(byteArray71);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray71), "[0, 10, 1]");
        org.junit.Assert.assertNotNull(byteVector74);
        org.junit.Assert.assertNotNull(byteVector77);
        org.junit.Assert.assertNotNull(byteVector80);
        org.junit.Assert.assertNotNull(byteVector83);
        org.junit.Assert.assertNotNull(byteVector86);
    }

    @Test
    public void test1083() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1083");
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
        org.mockito.asm.ByteVector byteVector20 = byteVector18.putLong((long) '#');
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
    public void test1084() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1084");
        org.mockito.asm.ByteVector byteVector0 = new org.mockito.asm.ByteVector();
        org.mockito.asm.ByteVector byteVector2 = byteVector0.putUTF8("hi!");
        org.mockito.asm.ByteVector byteVector4 = byteVector2.putLong((long) (byte) 10);
        org.mockito.asm.ByteVector byteVector6 = byteVector4.putUTF8("hi!");
        org.mockito.asm.ByteVector byteVector8 = byteVector4.putLong((long) (short) -1);
        org.mockito.asm.ByteVector byteVector10 = byteVector8.putInt(10);
        org.mockito.asm.ByteVector byteVector12 = byteVector8.putByte((int) (short) 1);
        org.mockito.asm.ByteVector byteVector14 = byteVector12.putShort((int) (short) 100);
        org.mockito.asm.ByteVector byteVector16 = byteVector12.putByte((int) ' ');
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
    public void test1085() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1085");
        org.mockito.asm.ByteVector byteVector0 = new org.mockito.asm.ByteVector();
        org.mockito.asm.ByteVector byteVector2 = byteVector0.putUTF8("hi!");
        org.mockito.asm.ByteVector byteVector4 = byteVector0.putLong((long) ' ');
        org.mockito.asm.ByteVector byteVector6 = byteVector4.putByte((int) 'a');
        org.mockito.asm.ByteVector byteVector8 = byteVector4.putLong((long) ' ');
        org.mockito.asm.ByteVector byteVector10 = byteVector8.putByte((int) (byte) 10);
        java.lang.Class<?> wildcardClass11 = byteVector8.getClass();
        org.junit.Assert.assertNotNull(byteVector2);
        org.junit.Assert.assertNotNull(byteVector4);
        org.junit.Assert.assertNotNull(byteVector6);
        org.junit.Assert.assertNotNull(byteVector8);
        org.junit.Assert.assertNotNull(byteVector10);
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test1086() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1086");
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
        org.mockito.asm.ByteVector byteVector30 = byteVector26.putInt(1);
        org.mockito.asm.ByteVector byteVector32 = byteVector30.putLong(0L);
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
        org.junit.Assert.assertNotNull(byteVector30);
        org.junit.Assert.assertNotNull(byteVector32);
    }

    @Test
    public void test1087() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1087");
        org.mockito.asm.ByteVector byteVector1 = new org.mockito.asm.ByteVector((int) (byte) 10);
        org.mockito.asm.ByteVector byteVector3 = byteVector1.putByte((int) '4');
        org.mockito.asm.ByteVector byteVector5 = byteVector1.putLong((long) 'a');
        org.mockito.asm.ByteVector byteVector7 = byteVector5.putInt((int) (short) 10);
        org.mockito.asm.ByteVector byteVector9 = byteVector7.putInt((int) (byte) 100);
        org.junit.Assert.assertNotNull(byteVector3);
        org.junit.Assert.assertNotNull(byteVector5);
        org.junit.Assert.assertNotNull(byteVector7);
        org.junit.Assert.assertNotNull(byteVector9);
    }

    @Test
    public void test1088() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1088");
        org.mockito.asm.ByteVector byteVector0 = new org.mockito.asm.ByteVector();
        org.mockito.asm.ByteVector byteVector2 = byteVector0.putUTF8("hi!");
        org.mockito.asm.ByteVector byteVector4 = byteVector0.putLong((long) ' ');
        org.mockito.asm.ByteVector byteVector6 = byteVector4.putByte((int) 'a');
        org.mockito.asm.ByteVector byteVector8 = byteVector6.putInt((int) (short) 1);
        org.mockito.asm.ByteVector byteVector10 = byteVector8.putShort((int) (byte) 100);
        org.mockito.asm.ByteVector byteVector12 = byteVector10.putUTF8("hi!");
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
    public void test1089() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1089");
        org.mockito.asm.ByteVector byteVector0 = new org.mockito.asm.ByteVector();
        org.mockito.asm.ByteVector byteVector2 = byteVector0.putUTF8("hi!");
        org.mockito.asm.ByteVector byteVector4 = byteVector0.putShort((int) (short) -1);
        org.mockito.asm.ByteVector byteVector6 = byteVector0.putInt(0);
        org.mockito.asm.ByteVector byteVector8 = byteVector0.putUTF8("hi!");
        org.mockito.asm.ByteVector byteVector10 = byteVector8.putInt((int) (short) 0);
        org.mockito.asm.ByteVector byteVector12 = byteVector10.putLong((long) (short) 100);
        org.mockito.asm.ByteVector byteVector14 = byteVector10.putByte((int) (short) 0);
        org.mockito.asm.ByteVector byteVector16 = byteVector14.putShort((int) ' ');
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
    public void test1090() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1090");
        org.mockito.asm.ByteVector byteVector1 = new org.mockito.asm.ByteVector((int) (short) 0);
        org.mockito.asm.ByteVector byteVector2 = new org.mockito.asm.ByteVector();
        org.mockito.asm.ByteVector byteVector4 = byteVector2.putUTF8("hi!");
        org.mockito.asm.ByteVector byteVector6 = byteVector2.putInt(0);
        org.mockito.asm.ByteVector byteVector8 = byteVector6.putInt((int) ' ');
        org.mockito.asm.ByteVector byteVector10 = byteVector8.putLong(100L);
        byte[] byteArray14 = new byte[] { (byte) 0, (byte) 10, (byte) 1 };
        org.mockito.asm.ByteVector byteVector17 = byteVector8.putByteArray(byteArray14, 0, 0);
        org.mockito.asm.ByteVector byteVector20 = byteVector1.putByteArray(byteArray14, 1, (int) (short) 0);
        org.mockito.asm.ByteVector byteVector22 = byteVector1.putUTF8("");
        org.mockito.asm.ByteVector byteVector23 = new org.mockito.asm.ByteVector();
        org.mockito.asm.ByteVector byteVector25 = byteVector23.putUTF8("hi!");
        org.mockito.asm.ByteVector byteVector27 = byteVector23.putLong((long) ' ');
        org.mockito.asm.ByteVector byteVector29 = byteVector27.putByte((int) 'a');
        org.mockito.asm.ByteVector byteVector31 = byteVector27.putByte((int) (short) -1);
        org.mockito.asm.ByteVector byteVector33 = byteVector27.putLong(0L);
        org.mockito.asm.ByteVector byteVector35 = byteVector33.putByte(0);
        org.mockito.asm.ByteVector byteVector37 = byteVector35.putLong(1L);
        org.mockito.asm.ByteVector byteVector39 = byteVector37.putShort((int) 'a');
        org.mockito.asm.ByteVector byteVector41 = byteVector37.putLong((long) 10);
        org.mockito.asm.ByteVector byteVector43 = byteVector37.putUTF8("");
        org.mockito.asm.ByteVector byteVector44 = new org.mockito.asm.ByteVector();
        org.mockito.asm.ByteVector byteVector46 = byteVector44.putUTF8("hi!");
        org.mockito.asm.ByteVector byteVector48 = byteVector46.putLong((long) (byte) 10);
        org.mockito.asm.ByteVector byteVector50 = byteVector48.putUTF8("hi!");
        org.mockito.asm.ByteVector byteVector52 = byteVector48.putLong((long) (short) -1);
        org.mockito.asm.ByteVector byteVector54 = byteVector52.putInt(10);
        org.mockito.asm.ByteVector byteVector56 = byteVector52.putByte((int) (short) 1);
        org.mockito.asm.ByteVector byteVector58 = byteVector52.putInt((int) (short) -1);
        org.mockito.asm.ByteVector byteVector60 = byteVector52.putUTF8("hi!");
        org.mockito.asm.ByteVector byteVector61 = new org.mockito.asm.ByteVector();
        org.mockito.asm.ByteVector byteVector63 = byteVector61.putUTF8("hi!");
        org.mockito.asm.ByteVector byteVector65 = byteVector61.putLong((long) ' ');
        org.mockito.asm.ByteVector byteVector67 = byteVector65.putByte((int) 'a');
        org.mockito.asm.ByteVector byteVector69 = byteVector65.putByte((int) (short) -1);
        org.mockito.asm.ByteVector byteVector71 = byteVector65.putLong(0L);
        org.mockito.asm.ByteVector byteVector73 = byteVector65.putUTF8("hi!");
        org.mockito.asm.ByteVector byteVector75 = byteVector73.putUTF8("");
        org.mockito.asm.ByteVector byteVector77 = byteVector75.putLong((long) (byte) 10);
        org.mockito.asm.ByteVector byteVector79 = byteVector75.putLong((long) (short) 100);
        byte[] byteArray84 = new byte[] { (byte) 1, (byte) 0, (byte) 0, (byte) -1 };
        org.mockito.asm.ByteVector byteVector87 = byteVector75.putByteArray(byteArray84, 0, 0);
        org.mockito.asm.ByteVector byteVector90 = byteVector60.putByteArray(byteArray84, (int) (byte) 0, (int) (short) 1);
        org.mockito.asm.ByteVector byteVector93 = byteVector37.putByteArray(byteArray84, (int) (short) 0, (int) (short) 0);
        // The following exception was thrown during execution in test generation
        try {
            org.mockito.asm.ByteVector byteVector96 = byteVector22.putByteArray(byteArray84, (int) (byte) -1, (int) (byte) -1);
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
        org.junit.Assert.assertNotNull(byteVector43);
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
        org.junit.Assert.assertNotNull(byteVector71);
        org.junit.Assert.assertNotNull(byteVector73);
        org.junit.Assert.assertNotNull(byteVector75);
        org.junit.Assert.assertNotNull(byteVector77);
        org.junit.Assert.assertNotNull(byteVector79);
        org.junit.Assert.assertNotNull(byteArray84);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray84), "[1, 0, 0, -1]");
        org.junit.Assert.assertNotNull(byteVector87);
        org.junit.Assert.assertNotNull(byteVector90);
        org.junit.Assert.assertNotNull(byteVector93);
    }

    @Test
    public void test1091() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1091");
        org.mockito.asm.ByteVector byteVector0 = new org.mockito.asm.ByteVector();
        org.mockito.asm.ByteVector byteVector2 = byteVector0.putUTF8("hi!");
        org.mockito.asm.ByteVector byteVector4 = byteVector0.putShort((int) (short) 100);
        org.mockito.asm.ByteVector byteVector6 = byteVector4.putLong((long) (byte) -1);
        org.mockito.asm.ByteVector byteVector8 = byteVector4.putByte((int) (byte) 10);
        org.mockito.asm.ByteVector byteVector10 = byteVector8.putUTF8("");
        org.mockito.asm.ByteVector byteVector12 = byteVector10.putInt((int) '4');
        org.mockito.asm.ByteVector byteVector14 = byteVector12.putByte((int) (byte) 0);
        org.mockito.asm.ByteVector byteVector16 = byteVector14.putInt(100);
        org.mockito.asm.ByteVector byteVector18 = byteVector16.putInt((int) (byte) -1);
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
    public void test1092() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1092");
        org.mockito.asm.ByteVector byteVector0 = new org.mockito.asm.ByteVector();
        org.mockito.asm.ByteVector byteVector2 = byteVector0.putUTF8("hi!");
        org.mockito.asm.ByteVector byteVector4 = byteVector2.putByte(100);
        org.mockito.asm.ByteVector byteVector6 = byteVector2.putShort((int) 'a');
        org.mockito.asm.ByteVector byteVector8 = byteVector6.putByte((int) (short) 1);
        org.mockito.asm.ByteVector byteVector10 = byteVector8.putByte(100);
        org.mockito.asm.ByteVector byteVector12 = byteVector10.putShort(1);
        org.mockito.asm.ByteVector byteVector14 = byteVector12.putUTF8("");
        org.junit.Assert.assertNotNull(byteVector2);
        org.junit.Assert.assertNotNull(byteVector4);
        org.junit.Assert.assertNotNull(byteVector6);
        org.junit.Assert.assertNotNull(byteVector8);
        org.junit.Assert.assertNotNull(byteVector10);
        org.junit.Assert.assertNotNull(byteVector12);
        org.junit.Assert.assertNotNull(byteVector14);
    }

    @Test
    public void test1093() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1093");
        org.mockito.asm.ByteVector byteVector0 = new org.mockito.asm.ByteVector();
        org.mockito.asm.ByteVector byteVector2 = byteVector0.putUTF8("hi!");
        org.mockito.asm.ByteVector byteVector4 = byteVector0.putInt(0);
        org.mockito.asm.ByteVector byteVector6 = byteVector0.putInt(1);
        org.mockito.asm.ByteVector byteVector8 = byteVector0.putUTF8("");
        org.mockito.asm.ByteVector byteVector10 = byteVector8.putLong(10L);
        org.mockito.asm.ByteVector byteVector12 = byteVector8.putShort((int) (byte) 100);
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
    public void test1094() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1094");
        org.mockito.asm.ByteVector byteVector1 = new org.mockito.asm.ByteVector((int) '#');
        org.mockito.asm.ByteVector byteVector3 = byteVector1.putLong(100L);
        org.mockito.asm.ByteVector byteVector5 = byteVector3.putLong(1L);
        org.mockito.asm.ByteVector byteVector7 = byteVector5.putUTF8("hi!");
        org.mockito.asm.ByteVector byteVector9 = byteVector7.putUTF8("");
        org.mockito.asm.ByteVector byteVector11 = byteVector7.putInt((int) (short) 100);
        org.mockito.asm.ByteVector byteVector13 = byteVector11.putByte((int) (byte) 100);
        org.mockito.asm.ByteVector byteVector15 = byteVector13.putUTF8("hi!");
        java.lang.Class<?> wildcardClass16 = byteVector13.getClass();
        org.junit.Assert.assertNotNull(byteVector3);
        org.junit.Assert.assertNotNull(byteVector5);
        org.junit.Assert.assertNotNull(byteVector7);
        org.junit.Assert.assertNotNull(byteVector9);
        org.junit.Assert.assertNotNull(byteVector11);
        org.junit.Assert.assertNotNull(byteVector13);
        org.junit.Assert.assertNotNull(byteVector15);
        org.junit.Assert.assertNotNull(wildcardClass16);
    }

    @Test
    public void test1095() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1095");
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
        org.mockito.asm.ByteVector byteVector20 = byteVector18.putShort((int) (short) 1);
        org.mockito.asm.ByteVector byteVector22 = byteVector20.putInt(100);
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
    public void test1096() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1096");
        org.mockito.asm.ByteVector byteVector1 = new org.mockito.asm.ByteVector((int) (byte) 1);
        org.mockito.asm.ByteVector byteVector3 = byteVector1.putByte((int) (short) 1);
        org.mockito.asm.ByteVector byteVector5 = byteVector3.putLong((long) (-1));
        org.mockito.asm.ByteVector byteVector7 = byteVector5.putLong((long) 100);
        org.junit.Assert.assertNotNull(byteVector3);
        org.junit.Assert.assertNotNull(byteVector5);
        org.junit.Assert.assertNotNull(byteVector7);
    }

    @Test
    public void test1097() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1097");
        org.mockito.asm.ByteVector byteVector0 = new org.mockito.asm.ByteVector();
        org.mockito.asm.ByteVector byteVector2 = byteVector0.putUTF8("hi!");
        org.mockito.asm.ByteVector byteVector4 = byteVector0.putInt(0);
        org.mockito.asm.ByteVector byteVector6 = byteVector0.putShort(10);
        org.mockito.asm.ByteVector byteVector8 = byteVector0.putUTF8("");
        org.mockito.asm.ByteVector byteVector10 = byteVector8.putByte(0);
        org.mockito.asm.ByteVector byteVector12 = byteVector8.putInt((int) '#');
        org.mockito.asm.ByteVector byteVector14 = byteVector12.putShort((int) '#');
        org.mockito.asm.ByteVector byteVector16 = byteVector14.putLong((long) (short) -1);
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
    public void test1098() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1098");
        org.mockito.asm.ByteVector byteVector0 = new org.mockito.asm.ByteVector();
        org.mockito.asm.ByteVector byteVector2 = byteVector0.putUTF8("hi!");
        org.mockito.asm.ByteVector byteVector4 = byteVector0.putShort((int) (short) 100);
        org.mockito.asm.ByteVector byteVector6 = byteVector4.putByte((int) 'a');
        org.junit.Assert.assertNotNull(byteVector2);
        org.junit.Assert.assertNotNull(byteVector4);
        org.junit.Assert.assertNotNull(byteVector6);
    }

    @Test
    public void test1099() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1099");
        org.mockito.asm.ByteVector byteVector1 = new org.mockito.asm.ByteVector((int) '#');
        org.mockito.asm.ByteVector byteVector3 = byteVector1.putInt(100);
        org.mockito.asm.ByteVector byteVector5 = byteVector1.putInt(0);
        org.mockito.asm.ByteVector byteVector7 = byteVector5.putShort((int) (short) 10);
        org.mockito.asm.ByteVector byteVector9 = byteVector7.putInt((int) (short) 1);
        java.lang.Class<?> wildcardClass10 = byteVector9.getClass();
        org.junit.Assert.assertNotNull(byteVector3);
        org.junit.Assert.assertNotNull(byteVector5);
        org.junit.Assert.assertNotNull(byteVector7);
        org.junit.Assert.assertNotNull(byteVector9);
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test1100() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1100");
        org.mockito.asm.ByteVector byteVector0 = new org.mockito.asm.ByteVector();
        org.mockito.asm.ByteVector byteVector2 = byteVector0.putUTF8("hi!");
        org.mockito.asm.ByteVector byteVector4 = byteVector0.putShort((int) (short) -1);
        org.mockito.asm.ByteVector byteVector6 = byteVector0.putByte((int) ' ');
        org.mockito.asm.ByteVector byteVector8 = byteVector6.putUTF8("");
        org.mockito.asm.ByteVector byteVector10 = byteVector6.putShort((int) '#');
        org.mockito.asm.ByteVector byteVector12 = new org.mockito.asm.ByteVector((int) '#');
        org.mockito.asm.ByteVector byteVector14 = byteVector12.putLong(100L);
        org.mockito.asm.ByteVector byteVector16 = byteVector14.putUTF8("");
        org.mockito.asm.ByteVector byteVector18 = byteVector14.putLong((-1L));
        org.mockito.asm.ByteVector byteVector20 = byteVector18.putLong((-1L));
        org.mockito.asm.ByteVector byteVector22 = byteVector20.putInt((int) (byte) 10);
        org.mockito.asm.ByteVector byteVector23 = new org.mockito.asm.ByteVector();
        org.mockito.asm.ByteVector byteVector25 = byteVector23.putUTF8("hi!");
        org.mockito.asm.ByteVector byteVector27 = byteVector23.putLong((long) ' ');
        org.mockito.asm.ByteVector byteVector29 = byteVector27.putByte((int) 'a');
        org.mockito.asm.ByteVector byteVector31 = byteVector27.putByte((int) (short) -1);
        org.mockito.asm.ByteVector byteVector33 = byteVector27.putLong(0L);
        org.mockito.asm.ByteVector byteVector35 = byteVector33.putByte(0);
        org.mockito.asm.ByteVector byteVector37 = byteVector35.putLong(1L);
        org.mockito.asm.ByteVector byteVector39 = byteVector37.putShort((int) 'a');
        org.mockito.asm.ByteVector byteVector41 = byteVector37.putLong((long) 10);
        org.mockito.asm.ByteVector byteVector43 = byteVector37.putUTF8("");
        org.mockito.asm.ByteVector byteVector44 = new org.mockito.asm.ByteVector();
        org.mockito.asm.ByteVector byteVector46 = byteVector44.putUTF8("hi!");
        org.mockito.asm.ByteVector byteVector48 = byteVector46.putLong((long) (byte) 10);
        org.mockito.asm.ByteVector byteVector50 = byteVector48.putUTF8("hi!");
        org.mockito.asm.ByteVector byteVector52 = byteVector48.putLong((long) (short) -1);
        org.mockito.asm.ByteVector byteVector54 = byteVector52.putInt(10);
        org.mockito.asm.ByteVector byteVector56 = byteVector52.putByte((int) (short) 1);
        org.mockito.asm.ByteVector byteVector58 = byteVector52.putInt((int) (short) -1);
        org.mockito.asm.ByteVector byteVector60 = byteVector52.putUTF8("hi!");
        org.mockito.asm.ByteVector byteVector61 = new org.mockito.asm.ByteVector();
        org.mockito.asm.ByteVector byteVector63 = byteVector61.putUTF8("hi!");
        org.mockito.asm.ByteVector byteVector65 = byteVector61.putLong((long) ' ');
        org.mockito.asm.ByteVector byteVector67 = byteVector65.putByte((int) 'a');
        org.mockito.asm.ByteVector byteVector69 = byteVector65.putByte((int) (short) -1);
        org.mockito.asm.ByteVector byteVector71 = byteVector65.putLong(0L);
        org.mockito.asm.ByteVector byteVector73 = byteVector65.putUTF8("hi!");
        org.mockito.asm.ByteVector byteVector75 = byteVector73.putUTF8("");
        org.mockito.asm.ByteVector byteVector77 = byteVector75.putLong((long) (byte) 10);
        org.mockito.asm.ByteVector byteVector79 = byteVector75.putLong((long) (short) 100);
        byte[] byteArray84 = new byte[] { (byte) 1, (byte) 0, (byte) 0, (byte) -1 };
        org.mockito.asm.ByteVector byteVector87 = byteVector75.putByteArray(byteArray84, 0, 0);
        org.mockito.asm.ByteVector byteVector90 = byteVector60.putByteArray(byteArray84, (int) (byte) 0, (int) (short) 1);
        org.mockito.asm.ByteVector byteVector93 = byteVector37.putByteArray(byteArray84, (int) (short) 0, (int) (short) 0);
        org.mockito.asm.ByteVector byteVector96 = byteVector22.putByteArray(byteArray84, 0, (int) (byte) 1);
        org.mockito.asm.ByteVector byteVector99 = byteVector10.putByteArray(byteArray84, (int) (byte) 1, 1);
        org.junit.Assert.assertNotNull(byteVector2);
        org.junit.Assert.assertNotNull(byteVector4);
        org.junit.Assert.assertNotNull(byteVector6);
        org.junit.Assert.assertNotNull(byteVector8);
        org.junit.Assert.assertNotNull(byteVector10);
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
        org.junit.Assert.assertNotNull(byteVector43);
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
        org.junit.Assert.assertNotNull(byteVector71);
        org.junit.Assert.assertNotNull(byteVector73);
        org.junit.Assert.assertNotNull(byteVector75);
        org.junit.Assert.assertNotNull(byteVector77);
        org.junit.Assert.assertNotNull(byteVector79);
        org.junit.Assert.assertNotNull(byteArray84);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray84), "[1, 0, 0, -1]");
        org.junit.Assert.assertNotNull(byteVector87);
        org.junit.Assert.assertNotNull(byteVector90);
        org.junit.Assert.assertNotNull(byteVector93);
        org.junit.Assert.assertNotNull(byteVector96);
        org.junit.Assert.assertNotNull(byteVector99);
    }

    @Test
    public void test1101() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1101");
        org.mockito.asm.ByteVector byteVector1 = new org.mockito.asm.ByteVector((int) (short) 1);
        org.mockito.asm.ByteVector byteVector3 = byteVector1.putLong((long) (byte) 1);
        org.mockito.asm.ByteVector byteVector5 = byteVector1.putUTF8("");
        org.mockito.asm.ByteVector byteVector7 = byteVector5.putInt((int) '#');
        org.mockito.asm.ByteVector byteVector9 = byteVector5.putByte((int) (byte) 100);
        org.mockito.asm.ByteVector byteVector11 = byteVector5.putLong((long) (short) 100);
        org.junit.Assert.assertNotNull(byteVector3);
        org.junit.Assert.assertNotNull(byteVector5);
        org.junit.Assert.assertNotNull(byteVector7);
        org.junit.Assert.assertNotNull(byteVector9);
        org.junit.Assert.assertNotNull(byteVector11);
    }

    @Test
    public void test1102() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1102");
        org.mockito.asm.ByteVector byteVector0 = new org.mockito.asm.ByteVector();
        org.mockito.asm.ByteVector byteVector2 = byteVector0.putUTF8("hi!");
        org.mockito.asm.ByteVector byteVector4 = byteVector0.putInt(0);
        org.mockito.asm.ByteVector byteVector6 = byteVector4.putInt((int) ' ');
        org.mockito.asm.ByteVector byteVector8 = byteVector6.putLong((long) (short) 10);
        org.mockito.asm.ByteVector byteVector10 = byteVector6.putInt((int) '4');
        org.mockito.asm.ByteVector byteVector12 = byteVector6.putInt((int) (short) 10);
        org.mockito.asm.ByteVector byteVector14 = byteVector12.putLong((long) '#');
        org.mockito.asm.ByteVector byteVector16 = byteVector14.putInt((int) (short) 100);
        org.mockito.asm.ByteVector byteVector18 = byteVector14.putUTF8("");
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
    public void test1103() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1103");
        org.mockito.asm.ByteVector byteVector0 = new org.mockito.asm.ByteVector();
        org.mockito.asm.ByteVector byteVector2 = byteVector0.putUTF8("hi!");
        org.mockito.asm.ByteVector byteVector4 = byteVector0.putInt(0);
        org.mockito.asm.ByteVector byteVector6 = byteVector0.putShort(10);
        org.mockito.asm.ByteVector byteVector8 = byteVector0.putLong((long) (short) 1);
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
    public void test1104() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1104");
        org.mockito.asm.ByteVector byteVector0 = new org.mockito.asm.ByteVector();
        org.mockito.asm.ByteVector byteVector2 = byteVector0.putUTF8("hi!");
        org.mockito.asm.ByteVector byteVector4 = byteVector2.putLong((long) (byte) 10);
        org.mockito.asm.ByteVector byteVector6 = byteVector4.putUTF8("hi!");
        org.mockito.asm.ByteVector byteVector8 = byteVector4.putLong((long) 10);
        org.mockito.asm.ByteVector byteVector10 = byteVector4.putShort(0);
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
            org.mockito.asm.ByteVector byteVector84 = byteVector10.putByteArray(byteArray72, (int) ' ', 1);
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
    public void test1105() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1105");
        org.mockito.asm.ByteVector byteVector0 = new org.mockito.asm.ByteVector();
        org.mockito.asm.ByteVector byteVector2 = byteVector0.putUTF8("hi!");
        org.mockito.asm.ByteVector byteVector4 = byteVector0.putLong((long) ' ');
        org.mockito.asm.ByteVector byteVector6 = byteVector4.putByte((int) 'a');
        org.mockito.asm.ByteVector byteVector8 = byteVector6.putInt((int) (short) 0);
        org.mockito.asm.ByteVector byteVector10 = byteVector8.putByte((int) (short) 0);
        org.mockito.asm.ByteVector byteVector12 = byteVector10.putUTF8("");
        org.mockito.asm.ByteVector byteVector14 = byteVector12.putUTF8("hi!");
        org.mockito.asm.ByteVector byteVector16 = byteVector12.putLong((long) (short) 100);
        java.lang.Class<?> wildcardClass17 = byteVector12.getClass();
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
    public void test1106() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1106");
        org.mockito.asm.ByteVector byteVector0 = new org.mockito.asm.ByteVector();
        org.mockito.asm.ByteVector byteVector2 = byteVector0.putUTF8("hi!");
        org.mockito.asm.ByteVector byteVector4 = byteVector2.putInt(0);
        org.mockito.asm.ByteVector byteVector5 = new org.mockito.asm.ByteVector();
        org.mockito.asm.ByteVector byteVector7 = byteVector5.putUTF8("hi!");
        org.mockito.asm.ByteVector byteVector9 = byteVector7.putLong((long) (byte) 10);
        org.mockito.asm.ByteVector byteVector11 = byteVector9.putUTF8("hi!");
        org.mockito.asm.ByteVector byteVector13 = byteVector9.putLong((long) 10);
        org.mockito.asm.ByteVector byteVector15 = byteVector13.putLong(0L);
        org.mockito.asm.ByteVector byteVector17 = byteVector15.putShort((int) (byte) -1);
        org.mockito.asm.ByteVector byteVector19 = byteVector15.putInt((-1));
        org.mockito.asm.ByteVector byteVector21 = byteVector15.putByte((int) (byte) 100);
        org.mockito.asm.ByteVector byteVector23 = new org.mockito.asm.ByteVector((int) '#');
        org.mockito.asm.ByteVector byteVector25 = byteVector23.putInt(100);
        org.mockito.asm.ByteVector byteVector27 = byteVector23.putUTF8("");
        org.mockito.asm.ByteVector byteVector28 = new org.mockito.asm.ByteVector();
        org.mockito.asm.ByteVector byteVector30 = byteVector28.putUTF8("hi!");
        org.mockito.asm.ByteVector byteVector32 = byteVector30.putInt(0);
        org.mockito.asm.ByteVector byteVector34 = byteVector32.putByte((int) (short) 0);
        org.mockito.asm.ByteVector byteVector36 = byteVector32.putUTF8("");
        org.mockito.asm.ByteVector byteVector37 = new org.mockito.asm.ByteVector();
        org.mockito.asm.ByteVector byteVector39 = byteVector37.putUTF8("hi!");
        org.mockito.asm.ByteVector byteVector41 = byteVector37.putInt(0);
        org.mockito.asm.ByteVector byteVector43 = byteVector37.putShort((int) '4');
        org.mockito.asm.ByteVector byteVector45 = byteVector37.putByte(100);
        org.mockito.asm.ByteVector byteVector47 = byteVector45.putInt((int) (byte) 10);
        org.mockito.asm.ByteVector byteVector49 = byteVector45.putInt((int) (byte) 10);
        org.mockito.asm.ByteVector byteVector51 = byteVector49.putByte(100);
        org.mockito.asm.ByteVector byteVector52 = new org.mockito.asm.ByteVector();
        org.mockito.asm.ByteVector byteVector54 = byteVector52.putUTF8("hi!");
        org.mockito.asm.ByteVector byteVector56 = byteVector52.putInt(0);
        org.mockito.asm.ByteVector byteVector58 = byteVector56.putInt((int) ' ');
        org.mockito.asm.ByteVector byteVector60 = byteVector58.putLong(100L);
        byte[] byteArray64 = new byte[] { (byte) 0, (byte) 10, (byte) 1 };
        org.mockito.asm.ByteVector byteVector67 = byteVector58.putByteArray(byteArray64, 0, 0);
        org.mockito.asm.ByteVector byteVector70 = byteVector51.putByteArray(byteArray64, (int) (byte) 1, (int) (byte) 0);
        org.mockito.asm.ByteVector byteVector73 = byteVector32.putByteArray(byteArray64, (int) (short) 0, 0);
        org.mockito.asm.ByteVector byteVector76 = byteVector27.putByteArray(byteArray64, (int) (byte) 0, (int) (short) 1);
        org.mockito.asm.ByteVector byteVector79 = byteVector15.putByteArray(byteArray64, (int) (byte) 1, (int) (byte) 0);
        // The following exception was thrown during execution in test generation
        try {
            org.mockito.asm.ByteVector byteVector82 = byteVector2.putByteArray(byteArray64, (int) 'a', 10);
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
        org.junit.Assert.assertNotNull(byteVector25);
        org.junit.Assert.assertNotNull(byteVector27);
        org.junit.Assert.assertNotNull(byteVector30);
        org.junit.Assert.assertNotNull(byteVector32);
        org.junit.Assert.assertNotNull(byteVector34);
        org.junit.Assert.assertNotNull(byteVector36);
        org.junit.Assert.assertNotNull(byteVector39);
        org.junit.Assert.assertNotNull(byteVector41);
        org.junit.Assert.assertNotNull(byteVector43);
        org.junit.Assert.assertNotNull(byteVector45);
        org.junit.Assert.assertNotNull(byteVector47);
        org.junit.Assert.assertNotNull(byteVector49);
        org.junit.Assert.assertNotNull(byteVector51);
        org.junit.Assert.assertNotNull(byteVector54);
        org.junit.Assert.assertNotNull(byteVector56);
        org.junit.Assert.assertNotNull(byteVector58);
        org.junit.Assert.assertNotNull(byteVector60);
        org.junit.Assert.assertNotNull(byteArray64);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray64), "[0, 10, 1]");
        org.junit.Assert.assertNotNull(byteVector67);
        org.junit.Assert.assertNotNull(byteVector70);
        org.junit.Assert.assertNotNull(byteVector73);
        org.junit.Assert.assertNotNull(byteVector76);
        org.junit.Assert.assertNotNull(byteVector79);
    }

    @Test
    public void test1107() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1107");
        org.mockito.asm.ByteVector byteVector0 = new org.mockito.asm.ByteVector();
        org.mockito.asm.ByteVector byteVector2 = byteVector0.putUTF8("hi!");
        org.mockito.asm.ByteVector byteVector4 = byteVector0.putLong((long) ' ');
        org.mockito.asm.ByteVector byteVector6 = byteVector4.putByte((int) 'a');
        org.mockito.asm.ByteVector byteVector8 = byteVector6.putByte((int) (short) -1);
        org.mockito.asm.ByteVector byteVector10 = byteVector8.putLong((long) (byte) -1);
        org.mockito.asm.ByteVector byteVector12 = byteVector8.putByte((int) '4');
        org.mockito.asm.ByteVector byteVector14 = byteVector12.putLong((long) (short) 10);
        org.mockito.asm.ByteVector byteVector16 = new org.mockito.asm.ByteVector((int) '#');
        org.mockito.asm.ByteVector byteVector18 = byteVector16.putInt(100);
        org.mockito.asm.ByteVector byteVector20 = byteVector18.putShort((int) (short) -1);
        org.mockito.asm.ByteVector byteVector22 = byteVector20.putShort((int) (short) 0);
        org.mockito.asm.ByteVector byteVector24 = byteVector20.putUTF8("");
        org.mockito.asm.ByteVector byteVector25 = new org.mockito.asm.ByteVector();
        org.mockito.asm.ByteVector byteVector27 = byteVector25.putUTF8("hi!");
        org.mockito.asm.ByteVector byteVector29 = byteVector25.putLong((long) ' ');
        org.mockito.asm.ByteVector byteVector31 = byteVector29.putByte((int) 'a');
        org.mockito.asm.ByteVector byteVector33 = byteVector29.putByte((int) (short) -1);
        org.mockito.asm.ByteVector byteVector35 = byteVector29.putLong(0L);
        org.mockito.asm.ByteVector byteVector37 = byteVector29.putUTF8("hi!");
        org.mockito.asm.ByteVector byteVector39 = byteVector37.putUTF8("");
        org.mockito.asm.ByteVector byteVector41 = byteVector37.putInt((int) (byte) 10);
        org.mockito.asm.ByteVector byteVector43 = byteVector37.putByte(0);
        org.mockito.asm.ByteVector byteVector44 = new org.mockito.asm.ByteVector();
        org.mockito.asm.ByteVector byteVector46 = byteVector44.putUTF8("hi!");
        org.mockito.asm.ByteVector byteVector48 = byteVector44.putInt(0);
        org.mockito.asm.ByteVector byteVector50 = byteVector48.putInt((int) ' ');
        org.mockito.asm.ByteVector byteVector52 = byteVector50.putLong(100L);
        byte[] byteArray56 = new byte[] { (byte) 0, (byte) 10, (byte) 1 };
        org.mockito.asm.ByteVector byteVector59 = byteVector50.putByteArray(byteArray56, 0, 0);
        org.mockito.asm.ByteVector byteVector62 = byteVector43.putByteArray(byteArray56, (int) (short) 1, 0);
        org.mockito.asm.ByteVector byteVector65 = byteVector20.putByteArray(byteArray56, 1, 1);
        org.mockito.asm.ByteVector byteVector68 = byteVector12.putByteArray(byteArray56, (int) (short) 0, 0);
        org.mockito.asm.ByteVector byteVector70 = byteVector68.putInt((int) ' ');
        java.lang.Class<?> wildcardClass71 = byteVector68.getClass();
        org.junit.Assert.assertNotNull(byteVector2);
        org.junit.Assert.assertNotNull(byteVector4);
        org.junit.Assert.assertNotNull(byteVector6);
        org.junit.Assert.assertNotNull(byteVector8);
        org.junit.Assert.assertNotNull(byteVector10);
        org.junit.Assert.assertNotNull(byteVector12);
        org.junit.Assert.assertNotNull(byteVector14);
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
        org.junit.Assert.assertNotNull(byteArray56);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray56), "[0, 10, 1]");
        org.junit.Assert.assertNotNull(byteVector59);
        org.junit.Assert.assertNotNull(byteVector62);
        org.junit.Assert.assertNotNull(byteVector65);
        org.junit.Assert.assertNotNull(byteVector68);
        org.junit.Assert.assertNotNull(byteVector70);
        org.junit.Assert.assertNotNull(wildcardClass71);
    }

    @Test
    public void test1108() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1108");
        org.mockito.asm.ByteVector byteVector0 = new org.mockito.asm.ByteVector();
        org.mockito.asm.ByteVector byteVector2 = byteVector0.putUTF8("hi!");
        org.mockito.asm.ByteVector byteVector4 = byteVector0.putShort((int) (short) -1);
        org.mockito.asm.ByteVector byteVector6 = byteVector0.putInt((int) (byte) 10);
        org.mockito.asm.ByteVector byteVector8 = byteVector6.putUTF8("hi!");
        org.mockito.asm.ByteVector byteVector10 = byteVector8.putByte((int) (byte) 1);
        org.mockito.asm.ByteVector byteVector12 = byteVector10.putUTF8("hi!");
        org.mockito.asm.ByteVector byteVector14 = byteVector12.putByte((int) (byte) 10);
        org.mockito.asm.ByteVector byteVector16 = byteVector14.putShort((int) (short) 0);
        org.mockito.asm.ByteVector byteVector18 = byteVector14.putLong((long) (short) 0);
        org.mockito.asm.ByteVector byteVector20 = byteVector14.putLong(0L);
        org.mockito.asm.ByteVector byteVector22 = byteVector20.putInt((int) 'a');
        org.mockito.asm.ByteVector byteVector24 = byteVector20.putInt((int) (short) 100);
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
    public void test1109() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1109");
        org.mockito.asm.ByteVector byteVector0 = new org.mockito.asm.ByteVector();
        org.mockito.asm.ByteVector byteVector2 = byteVector0.putUTF8("hi!");
        org.mockito.asm.ByteVector byteVector4 = byteVector2.putLong((long) (byte) 10);
        org.mockito.asm.ByteVector byteVector6 = byteVector4.putUTF8("hi!");
        org.mockito.asm.ByteVector byteVector8 = byteVector4.putLong((-1L));
        org.mockito.asm.ByteVector byteVector10 = byteVector8.putInt((int) (byte) 1);
        org.mockito.asm.ByteVector byteVector12 = byteVector8.putUTF8("hi!");
        org.junit.Assert.assertNotNull(byteVector2);
        org.junit.Assert.assertNotNull(byteVector4);
        org.junit.Assert.assertNotNull(byteVector6);
        org.junit.Assert.assertNotNull(byteVector8);
        org.junit.Assert.assertNotNull(byteVector10);
        org.junit.Assert.assertNotNull(byteVector12);
    }

    @Test
    public void test1110() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1110");
        org.mockito.asm.ByteVector byteVector1 = new org.mockito.asm.ByteVector((int) '#');
        org.mockito.asm.ByteVector byteVector3 = byteVector1.putLong(100L);
        org.mockito.asm.ByteVector byteVector5 = byteVector3.putLong(1L);
        org.mockito.asm.ByteVector byteVector7 = byteVector5.putUTF8("hi!");
        org.mockito.asm.ByteVector byteVector9 = byteVector7.putUTF8("");
        org.mockito.asm.ByteVector byteVector11 = byteVector9.putShort((int) (byte) -1);
        org.mockito.asm.ByteVector byteVector13 = byteVector9.putShort(1);
        org.mockito.asm.ByteVector byteVector15 = byteVector13.putByte((int) (short) 1);
        org.junit.Assert.assertNotNull(byteVector3);
        org.junit.Assert.assertNotNull(byteVector5);
        org.junit.Assert.assertNotNull(byteVector7);
        org.junit.Assert.assertNotNull(byteVector9);
        org.junit.Assert.assertNotNull(byteVector11);
        org.junit.Assert.assertNotNull(byteVector13);
        org.junit.Assert.assertNotNull(byteVector15);
    }

    @Test
    public void test1111() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1111");
        org.mockito.asm.ByteVector byteVector0 = new org.mockito.asm.ByteVector();
        org.mockito.asm.ByteVector byteVector2 = byteVector0.putUTF8("hi!");
        org.mockito.asm.ByteVector byteVector4 = byteVector0.putLong((long) ' ');
        org.mockito.asm.ByteVector byteVector6 = byteVector4.putByte((int) 'a');
        org.mockito.asm.ByteVector byteVector8 = byteVector4.putByte((int) (short) -1);
        org.mockito.asm.ByteVector byteVector10 = byteVector4.putLong(0L);
        org.mockito.asm.ByteVector byteVector12 = byteVector4.putUTF8("hi!");
        org.mockito.asm.ByteVector byteVector14 = byteVector12.putUTF8("hi!");
        org.mockito.asm.ByteVector byteVector16 = byteVector14.putByte(0);
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
            org.mockito.asm.ByteVector byteVector40 = byteVector14.putByteArray(byteArray31, 1, (int) '#');
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
    public void test1112() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1112");
        org.mockito.asm.ByteVector byteVector0 = new org.mockito.asm.ByteVector();
        org.mockito.asm.ByteVector byteVector2 = byteVector0.putUTF8("hi!");
        org.mockito.asm.ByteVector byteVector4 = byteVector0.putShort((int) (short) 100);
        org.mockito.asm.ByteVector byteVector6 = byteVector4.putUTF8("hi!");
        org.mockito.asm.ByteVector byteVector8 = byteVector6.putByte((int) '4');
        org.mockito.asm.ByteVector byteVector10 = byteVector8.putShort((int) (short) 10);
        org.mockito.asm.ByteVector byteVector12 = byteVector8.putShort(10);
        org.mockito.asm.ByteVector byteVector14 = byteVector12.putByte(0);
        org.junit.Assert.assertNotNull(byteVector2);
        org.junit.Assert.assertNotNull(byteVector4);
        org.junit.Assert.assertNotNull(byteVector6);
        org.junit.Assert.assertNotNull(byteVector8);
        org.junit.Assert.assertNotNull(byteVector10);
        org.junit.Assert.assertNotNull(byteVector12);
        org.junit.Assert.assertNotNull(byteVector14);
    }

    @Test
    public void test1113() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1113");
        org.mockito.asm.ByteVector byteVector1 = new org.mockito.asm.ByteVector((int) (short) 1);
        org.mockito.asm.ByteVector byteVector3 = byteVector1.putLong((long) (byte) 1);
        org.mockito.asm.ByteVector byteVector5 = byteVector1.putInt(1);
        java.lang.Class<?> wildcardClass6 = byteVector1.getClass();
        org.junit.Assert.assertNotNull(byteVector3);
        org.junit.Assert.assertNotNull(byteVector5);
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void test1114() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1114");
        org.mockito.asm.ByteVector byteVector1 = new org.mockito.asm.ByteVector((int) (byte) 10);
        org.mockito.asm.ByteVector byteVector3 = byteVector1.putByte((int) '4');
        org.mockito.asm.ByteVector byteVector5 = byteVector1.putLong(0L);
        org.mockito.asm.ByteVector byteVector7 = byteVector5.putLong((long) (short) 100);
        org.mockito.asm.ByteVector byteVector9 = byteVector5.putShort((int) (byte) 0);
        org.mockito.asm.ByteVector byteVector11 = byteVector9.putShort(100);
        org.junit.Assert.assertNotNull(byteVector3);
        org.junit.Assert.assertNotNull(byteVector5);
        org.junit.Assert.assertNotNull(byteVector7);
        org.junit.Assert.assertNotNull(byteVector9);
        org.junit.Assert.assertNotNull(byteVector11);
    }

    @Test
    public void test1115() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1115");
        org.mockito.asm.ByteVector byteVector1 = new org.mockito.asm.ByteVector((int) (byte) 10);
        org.mockito.asm.ByteVector byteVector3 = byteVector1.putByte((int) '4');
        org.mockito.asm.ByteVector byteVector5 = byteVector1.putLong((long) 'a');
        org.mockito.asm.ByteVector byteVector7 = byteVector5.putInt((int) (short) 10);
        org.mockito.asm.ByteVector byteVector9 = byteVector5.putInt((int) (byte) 0);
        org.mockito.asm.ByteVector byteVector11 = byteVector5.putInt((-1));
        org.junit.Assert.assertNotNull(byteVector3);
        org.junit.Assert.assertNotNull(byteVector5);
        org.junit.Assert.assertNotNull(byteVector7);
        org.junit.Assert.assertNotNull(byteVector9);
        org.junit.Assert.assertNotNull(byteVector11);
    }

    @Test
    public void test1116() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1116");
        org.mockito.asm.ByteVector byteVector1 = new org.mockito.asm.ByteVector((int) '#');
        org.mockito.asm.ByteVector byteVector3 = byteVector1.putLong(100L);
        org.mockito.asm.ByteVector byteVector5 = byteVector1.putUTF8("");
        org.mockito.asm.ByteVector byteVector7 = byteVector5.putInt((int) (byte) 10);
        org.mockito.asm.ByteVector byteVector9 = byteVector5.putLong(10L);
        org.mockito.asm.ByteVector byteVector11 = byteVector9.putLong((-1L));
        java.lang.Class<?> wildcardClass12 = byteVector11.getClass();
        org.junit.Assert.assertNotNull(byteVector3);
        org.junit.Assert.assertNotNull(byteVector5);
        org.junit.Assert.assertNotNull(byteVector7);
        org.junit.Assert.assertNotNull(byteVector9);
        org.junit.Assert.assertNotNull(byteVector11);
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test1117() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1117");
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
        java.lang.Class<?> wildcardClass38 = byteArray31.getClass();
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
    public void test1118() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1118");
        org.mockito.asm.ByteVector byteVector0 = new org.mockito.asm.ByteVector();
        org.mockito.asm.ByteVector byteVector2 = byteVector0.putUTF8("hi!");
        org.mockito.asm.ByteVector byteVector4 = byteVector0.putInt(0);
        org.mockito.asm.ByteVector byteVector6 = byteVector4.putInt((int) ' ');
        org.mockito.asm.ByteVector byteVector8 = byteVector6.putLong((long) (short) 10);
        org.mockito.asm.ByteVector byteVector10 = byteVector6.putInt((int) '4');
        org.mockito.asm.ByteVector byteVector12 = byteVector6.putShort((int) (short) 100);
        org.mockito.asm.ByteVector byteVector14 = byteVector12.putByte((int) (short) 100);
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
            org.mockito.asm.ByteVector byteVector50 = byteVector14.putByteArray(byteArray38, (int) (short) 1, (int) (byte) 100);
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
    public void test1119() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1119");
        org.mockito.asm.ByteVector byteVector0 = new org.mockito.asm.ByteVector();
        org.mockito.asm.ByteVector byteVector2 = byteVector0.putUTF8("hi!");
        org.mockito.asm.ByteVector byteVector4 = byteVector2.putLong((long) (byte) 10);
        org.mockito.asm.ByteVector byteVector6 = byteVector2.putInt((int) (short) 1);
        org.mockito.asm.ByteVector byteVector8 = byteVector2.putLong((long) (short) 10);
        java.lang.Class<?> wildcardClass9 = byteVector2.getClass();
        org.junit.Assert.assertNotNull(byteVector2);
        org.junit.Assert.assertNotNull(byteVector4);
        org.junit.Assert.assertNotNull(byteVector6);
        org.junit.Assert.assertNotNull(byteVector8);
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test1120() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1120");
        org.mockito.asm.ByteVector byteVector1 = new org.mockito.asm.ByteVector((int) (byte) 1);
        org.mockito.asm.ByteVector byteVector3 = byteVector1.putByte((int) (byte) 10);
        org.mockito.asm.ByteVector byteVector5 = byteVector3.putShort((int) (short) 10);
        org.mockito.asm.ByteVector byteVector7 = byteVector3.putUTF8("");
        org.mockito.asm.ByteVector byteVector9 = byteVector7.putLong((long) 'a');
        org.mockito.asm.ByteVector byteVector11 = byteVector7.putLong((long) (byte) 1);
        org.junit.Assert.assertNotNull(byteVector3);
        org.junit.Assert.assertNotNull(byteVector5);
        org.junit.Assert.assertNotNull(byteVector7);
        org.junit.Assert.assertNotNull(byteVector9);
        org.junit.Assert.assertNotNull(byteVector11);
    }

    @Test
    public void test1121() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1121");
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
        org.mockito.asm.ByteVector byteVector47 = byteVector6.putUTF8("");
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
        org.junit.Assert.assertNotNull(byteVector47);
    }

    @Test
    public void test1122() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1122");
        org.mockito.asm.ByteVector byteVector1 = new org.mockito.asm.ByteVector((int) '#');
        org.mockito.asm.ByteVector byteVector3 = byteVector1.putLong(100L);
        org.mockito.asm.ByteVector byteVector5 = byteVector1.putUTF8("");
        org.mockito.asm.ByteVector byteVector7 = byteVector1.putUTF8("hi!");
        org.mockito.asm.ByteVector byteVector9 = byteVector7.putLong((long) (short) 0);
        org.mockito.asm.ByteVector byteVector11 = byteVector7.putLong((long) (byte) -1);
        org.mockito.asm.ByteVector byteVector13 = byteVector7.putLong((long) 0);
        org.mockito.asm.ByteVector byteVector15 = byteVector13.putByte(0);
        java.lang.Class<?> wildcardClass16 = byteVector13.getClass();
        org.junit.Assert.assertNotNull(byteVector3);
        org.junit.Assert.assertNotNull(byteVector5);
        org.junit.Assert.assertNotNull(byteVector7);
        org.junit.Assert.assertNotNull(byteVector9);
        org.junit.Assert.assertNotNull(byteVector11);
        org.junit.Assert.assertNotNull(byteVector13);
        org.junit.Assert.assertNotNull(byteVector15);
        org.junit.Assert.assertNotNull(wildcardClass16);
    }

    @Test
    public void test1123() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1123");
        org.mockito.asm.ByteVector byteVector0 = new org.mockito.asm.ByteVector();
        org.mockito.asm.ByteVector byteVector2 = byteVector0.putUTF8("hi!");
        org.mockito.asm.ByteVector byteVector4 = byteVector0.putShort((int) (short) -1);
        org.mockito.asm.ByteVector byteVector6 = byteVector0.putInt(0);
        org.mockito.asm.ByteVector byteVector8 = byteVector0.putUTF8("hi!");
        org.mockito.asm.ByteVector byteVector10 = byteVector8.putInt(100);
        org.mockito.asm.ByteVector byteVector12 = new org.mockito.asm.ByteVector((int) (byte) 1);
        org.mockito.asm.ByteVector byteVector14 = byteVector12.putByte((int) (byte) 10);
        org.mockito.asm.ByteVector byteVector16 = byteVector14.putShort((int) (short) 10);
        org.mockito.asm.ByteVector byteVector18 = byteVector16.putShort((int) (byte) 1);
        org.mockito.asm.ByteVector byteVector20 = byteVector18.putInt((int) (byte) -1);
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
        org.mockito.asm.ByteVector byteVector94 = byteVector18.putByteArray(byteArray82, 0, (int) (byte) 1);
        // The following exception was thrown during execution in test generation
        try {
            org.mockito.asm.ByteVector byteVector97 = byteVector10.putByteArray(byteArray82, (int) '#', (int) (short) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteVector2);
        org.junit.Assert.assertNotNull(byteVector4);
        org.junit.Assert.assertNotNull(byteVector6);
        org.junit.Assert.assertNotNull(byteVector8);
        org.junit.Assert.assertNotNull(byteVector10);
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
        org.junit.Assert.assertNotNull(byteVector94);
    }

    @Test
    public void test1124() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1124");
        org.mockito.asm.ByteVector byteVector0 = new org.mockito.asm.ByteVector();
        org.mockito.asm.ByteVector byteVector2 = byteVector0.putUTF8("hi!");
        org.mockito.asm.ByteVector byteVector4 = byteVector2.putLong((long) (byte) 10);
        org.mockito.asm.ByteVector byteVector6 = byteVector2.putInt((int) (short) 1);
        org.mockito.asm.ByteVector byteVector8 = byteVector6.putByte((int) (byte) 0);
        java.lang.Class<?> wildcardClass9 = byteVector8.getClass();
        org.junit.Assert.assertNotNull(byteVector2);
        org.junit.Assert.assertNotNull(byteVector4);
        org.junit.Assert.assertNotNull(byteVector6);
        org.junit.Assert.assertNotNull(byteVector8);
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test1125() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1125");
        org.mockito.asm.ByteVector byteVector0 = new org.mockito.asm.ByteVector();
        org.mockito.asm.ByteVector byteVector2 = byteVector0.putUTF8("hi!");
        org.mockito.asm.ByteVector byteVector4 = byteVector2.putInt((int) (byte) 10);
        org.mockito.asm.ByteVector byteVector6 = byteVector4.putUTF8("");
        org.mockito.asm.ByteVector byteVector8 = byteVector4.putLong((long) '#');
        org.mockito.asm.ByteVector byteVector10 = byteVector8.putLong((long) (short) 100);
        org.mockito.asm.ByteVector byteVector12 = byteVector10.putUTF8("hi!");
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
            org.mockito.asm.ByteVector byteVector57 = byteVector10.putByteArray(byteArray45, (int) ' ', (-1));
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
    public void test1126() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1126");
        org.mockito.asm.ByteVector byteVector0 = new org.mockito.asm.ByteVector();
        org.mockito.asm.ByteVector byteVector2 = byteVector0.putUTF8("hi!");
        org.mockito.asm.ByteVector byteVector4 = byteVector2.putLong((long) (byte) 10);
        org.mockito.asm.ByteVector byteVector6 = byteVector4.putUTF8("hi!");
        org.mockito.asm.ByteVector byteVector8 = byteVector4.putLong((-1L));
        org.mockito.asm.ByteVector byteVector10 = byteVector8.putInt(10);
        org.mockito.asm.ByteVector byteVector12 = byteVector10.putShort((int) '#');
        org.mockito.asm.ByteVector byteVector14 = byteVector12.putShort((int) (short) -1);
        org.mockito.asm.ByteVector byteVector16 = new org.mockito.asm.ByteVector((int) (byte) 100);
        org.mockito.asm.ByteVector byteVector18 = byteVector16.putShort((int) (short) 100);
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
        org.mockito.asm.ByteVector byteVector59 = byteVector16.putByteArray(byteArray50, 0, (int) (byte) 1);
        org.mockito.asm.ByteVector byteVector62 = byteVector14.putByteArray(byteArray50, (int) (byte) 0, (int) (short) 0);
        java.lang.Class<?> wildcardClass63 = byteVector14.getClass();
        org.junit.Assert.assertNotNull(byteVector2);
        org.junit.Assert.assertNotNull(byteVector4);
        org.junit.Assert.assertNotNull(byteVector6);
        org.junit.Assert.assertNotNull(byteVector8);
        org.junit.Assert.assertNotNull(byteVector10);
        org.junit.Assert.assertNotNull(byteVector12);
        org.junit.Assert.assertNotNull(byteVector14);
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
        org.junit.Assert.assertNotNull(byteVector62);
        org.junit.Assert.assertNotNull(wildcardClass63);
    }

    @Test
    public void test1127() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1127");
        org.mockito.asm.ByteVector byteVector0 = new org.mockito.asm.ByteVector();
        org.mockito.asm.ByteVector byteVector2 = byteVector0.putInt((int) (byte) 10);
        org.mockito.asm.ByteVector byteVector4 = byteVector0.putShort((-1));
        org.mockito.asm.ByteVector byteVector6 = byteVector4.putLong((long) (short) -1);
        org.junit.Assert.assertNotNull(byteVector2);
        org.junit.Assert.assertNotNull(byteVector4);
        org.junit.Assert.assertNotNull(byteVector6);
    }

    @Test
    public void test1128() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1128");
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
        org.mockito.asm.ByteVector byteVector20 = byteVector18.putShort((int) ' ');
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
    public void test1129() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1129");
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
        org.mockito.asm.ByteVector byteVector46 = byteVector16.putByteArray(byteArray40, (int) (byte) 0, (int) (short) 1);
        org.mockito.asm.ByteVector byteVector48 = byteVector46.putInt((int) (short) -1);
        org.mockito.asm.ByteVector byteVector50 = byteVector48.putUTF8("");
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
        org.junit.Assert.assertNotNull(byteVector46);
        org.junit.Assert.assertNotNull(byteVector48);
        org.junit.Assert.assertNotNull(byteVector50);
    }

    @Test
    public void test1130() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1130");
        org.mockito.asm.ByteVector byteVector0 = new org.mockito.asm.ByteVector();
        org.mockito.asm.ByteVector byteVector2 = byteVector0.putUTF8("hi!");
        org.mockito.asm.ByteVector byteVector4 = byteVector2.putInt((int) (byte) 10);
        org.mockito.asm.ByteVector byteVector6 = byteVector4.putUTF8("");
        org.mockito.asm.ByteVector byteVector8 = byteVector6.putUTF8("hi!");
        org.mockito.asm.ByteVector byteVector10 = byteVector6.putInt((int) '#');
        org.mockito.asm.ByteVector byteVector12 = byteVector10.putInt((int) (short) 0);
        org.mockito.asm.ByteVector byteVector14 = byteVector12.putByte((int) (short) 0);
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
    public void test1131() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1131");
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
        org.mockito.asm.ByteVector byteVector38 = byteVector10.putUTF8("hi!");
        org.mockito.asm.ByteVector byteVector40 = byteVector38.putLong(0L);
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
        org.junit.Assert.assertNotNull(byteVector40);
    }

    @Test
    public void test1132() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1132");
        org.mockito.asm.ByteVector byteVector0 = new org.mockito.asm.ByteVector();
        org.mockito.asm.ByteVector byteVector2 = byteVector0.putUTF8("hi!");
        org.mockito.asm.ByteVector byteVector4 = byteVector0.putLong((long) ' ');
        org.mockito.asm.ByteVector byteVector6 = byteVector4.putByte((int) 'a');
        org.mockito.asm.ByteVector byteVector8 = byteVector6.putInt((int) (short) 1);
        org.mockito.asm.ByteVector byteVector10 = byteVector8.putShort((int) (byte) 100);
        org.mockito.asm.ByteVector byteVector12 = byteVector10.putUTF8("hi!");
        org.mockito.asm.ByteVector byteVector14 = byteVector12.putByte((-1));
        org.mockito.asm.ByteVector byteVector16 = byteVector12.putShort(0);
        org.mockito.asm.ByteVector byteVector18 = byteVector16.putShort((int) '#');
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
    public void test1133() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1133");
        org.mockito.asm.ByteVector byteVector0 = new org.mockito.asm.ByteVector();
        org.mockito.asm.ByteVector byteVector2 = byteVector0.putUTF8("hi!");
        org.mockito.asm.ByteVector byteVector4 = byteVector0.putShort((int) (short) -1);
        org.mockito.asm.ByteVector byteVector6 = byteVector0.putInt(0);
        org.mockito.asm.ByteVector byteVector8 = byteVector0.putUTF8("hi!");
        org.mockito.asm.ByteVector byteVector10 = byteVector8.putInt((int) (short) 0);
        org.mockito.asm.ByteVector byteVector12 = byteVector10.putLong((long) (short) 100);
        org.mockito.asm.ByteVector byteVector14 = byteVector12.putInt(100);
        org.junit.Assert.assertNotNull(byteVector2);
        org.junit.Assert.assertNotNull(byteVector4);
        org.junit.Assert.assertNotNull(byteVector6);
        org.junit.Assert.assertNotNull(byteVector8);
        org.junit.Assert.assertNotNull(byteVector10);
        org.junit.Assert.assertNotNull(byteVector12);
        org.junit.Assert.assertNotNull(byteVector14);
    }

    @Test
    public void test1134() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1134");
        org.mockito.asm.ByteVector byteVector0 = new org.mockito.asm.ByteVector();
        org.mockito.asm.ByteVector byteVector2 = byteVector0.putUTF8("hi!");
        org.mockito.asm.ByteVector byteVector4 = byteVector0.putInt(0);
        org.mockito.asm.ByteVector byteVector6 = byteVector4.putInt((int) ' ');
        org.mockito.asm.ByteVector byteVector8 = byteVector6.putLong((long) (short) 10);
        org.mockito.asm.ByteVector byteVector10 = byteVector8.putUTF8("hi!");
        org.mockito.asm.ByteVector byteVector12 = byteVector8.putByte(0);
        org.mockito.asm.ByteVector byteVector14 = byteVector12.putInt((int) (short) 1);
        org.mockito.asm.ByteVector byteVector16 = byteVector12.putLong((-1L));
        org.mockito.asm.ByteVector byteVector18 = byteVector16.putUTF8("");
        org.mockito.asm.ByteVector byteVector20 = byteVector16.putInt((int) (short) -1);
        org.mockito.asm.ByteVector byteVector22 = byteVector16.putLong(0L);
        org.mockito.asm.ByteVector byteVector24 = byteVector16.putInt((int) '4');
        org.mockito.asm.ByteVector byteVector26 = byteVector16.putInt((int) '4');
        org.mockito.asm.ByteVector byteVector28 = byteVector16.putUTF8("hi!");
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
    public void test1135() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1135");
        org.mockito.asm.ByteVector byteVector0 = new org.mockito.asm.ByteVector();
        org.mockito.asm.ByteVector byteVector2 = byteVector0.putUTF8("hi!");
        org.mockito.asm.ByteVector byteVector4 = byteVector0.putInt(0);
        org.mockito.asm.ByteVector byteVector6 = byteVector4.putInt((int) ' ');
        org.mockito.asm.ByteVector byteVector8 = byteVector6.putLong((long) (short) 10);
        org.mockito.asm.ByteVector byteVector10 = byteVector8.putUTF8("hi!");
        org.mockito.asm.ByteVector byteVector12 = byteVector8.putByte(0);
        org.mockito.asm.ByteVector byteVector14 = byteVector12.putInt((int) (short) 1);
        org.mockito.asm.ByteVector byteVector16 = byteVector12.putLong((-1L));
        org.mockito.asm.ByteVector byteVector18 = byteVector16.putUTF8("");
        org.mockito.asm.ByteVector byteVector20 = byteVector18.putInt(1);
        org.mockito.asm.ByteVector byteVector22 = byteVector18.putInt((int) 'a');
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
    public void test1136() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1136");
        org.mockito.asm.ByteVector byteVector1 = new org.mockito.asm.ByteVector((int) '#');
        org.mockito.asm.ByteVector byteVector3 = byteVector1.putLong(100L);
        org.mockito.asm.ByteVector byteVector5 = byteVector3.putInt(0);
        org.mockito.asm.ByteVector byteVector7 = byteVector5.putLong((long) (-1));
        org.junit.Assert.assertNotNull(byteVector3);
        org.junit.Assert.assertNotNull(byteVector5);
        org.junit.Assert.assertNotNull(byteVector7);
    }

    @Test
    public void test1137() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1137");
        org.mockito.asm.ByteVector byteVector1 = new org.mockito.asm.ByteVector((int) '#');
        org.mockito.asm.ByteVector byteVector3 = byteVector1.putLong(100L);
        org.mockito.asm.ByteVector byteVector5 = byteVector3.putLong(1L);
        org.mockito.asm.ByteVector byteVector7 = byteVector5.putUTF8("hi!");
        org.mockito.asm.ByteVector byteVector9 = byteVector5.putUTF8("hi!");
        java.lang.Class<?> wildcardClass10 = byteVector5.getClass();
        org.junit.Assert.assertNotNull(byteVector3);
        org.junit.Assert.assertNotNull(byteVector5);
        org.junit.Assert.assertNotNull(byteVector7);
        org.junit.Assert.assertNotNull(byteVector9);
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test1138() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1138");
        org.mockito.asm.ByteVector byteVector0 = new org.mockito.asm.ByteVector();
        org.mockito.asm.ByteVector byteVector2 = byteVector0.putInt((int) (byte) 10);
        org.mockito.asm.ByteVector byteVector4 = byteVector0.putUTF8("");
        org.mockito.asm.ByteVector byteVector6 = byteVector0.putInt((int) (short) -1);
        org.mockito.asm.ByteVector byteVector8 = byteVector0.putInt((int) (short) 10);
        org.mockito.asm.ByteVector byteVector10 = byteVector8.putShort(0);
        org.junit.Assert.assertNotNull(byteVector2);
        org.junit.Assert.assertNotNull(byteVector4);
        org.junit.Assert.assertNotNull(byteVector6);
        org.junit.Assert.assertNotNull(byteVector8);
        org.junit.Assert.assertNotNull(byteVector10);
    }

    @Test
    public void test1139() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1139");
        org.mockito.asm.ByteVector byteVector0 = new org.mockito.asm.ByteVector();
        org.mockito.asm.ByteVector byteVector2 = byteVector0.putUTF8("hi!");
        org.mockito.asm.ByteVector byteVector4 = byteVector2.putLong((long) (byte) 10);
        org.mockito.asm.ByteVector byteVector6 = byteVector4.putUTF8("hi!");
        org.mockito.asm.ByteVector byteVector8 = byteVector4.putLong((long) 10);
        org.mockito.asm.ByteVector byteVector10 = byteVector4.putShort(0);
        org.mockito.asm.ByteVector byteVector12 = byteVector4.putInt(1);
        org.junit.Assert.assertNotNull(byteVector2);
        org.junit.Assert.assertNotNull(byteVector4);
        org.junit.Assert.assertNotNull(byteVector6);
        org.junit.Assert.assertNotNull(byteVector8);
        org.junit.Assert.assertNotNull(byteVector10);
        org.junit.Assert.assertNotNull(byteVector12);
    }

    @Test
    public void test1140() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1140");
        org.mockito.asm.ByteVector byteVector1 = new org.mockito.asm.ByteVector((int) '#');
        org.mockito.asm.ByteVector byteVector3 = byteVector1.putLong(100L);
        org.mockito.asm.ByteVector byteVector5 = byteVector3.putLong(1L);
        org.mockito.asm.ByteVector byteVector7 = byteVector3.putUTF8("");
        org.mockito.asm.ByteVector byteVector9 = byteVector7.putLong((long) (byte) 1);
        org.junit.Assert.assertNotNull(byteVector3);
        org.junit.Assert.assertNotNull(byteVector5);
        org.junit.Assert.assertNotNull(byteVector7);
        org.junit.Assert.assertNotNull(byteVector9);
    }

    @Test
    public void test1141() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1141");
        org.mockito.asm.ByteVector byteVector0 = new org.mockito.asm.ByteVector();
        org.mockito.asm.ByteVector byteVector2 = byteVector0.putUTF8("hi!");
        org.mockito.asm.ByteVector byteVector4 = byteVector0.putInt(0);
        org.mockito.asm.ByteVector byteVector6 = byteVector4.putInt((int) ' ');
        org.mockito.asm.ByteVector byteVector8 = byteVector6.putLong((long) (short) 10);
        org.mockito.asm.ByteVector byteVector10 = byteVector8.putUTF8("hi!");
        org.mockito.asm.ByteVector byteVector12 = byteVector8.putByte(0);
        org.mockito.asm.ByteVector byteVector14 = byteVector12.putInt((int) (short) 1);
        org.mockito.asm.ByteVector byteVector16 = byteVector12.putLong((-1L));
        org.mockito.asm.ByteVector byteVector18 = byteVector16.putUTF8("");
        org.mockito.asm.ByteVector byteVector20 = byteVector16.putLong((long) '4');
        org.mockito.asm.ByteVector byteVector22 = byteVector16.putByte(0);
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
    public void test1142() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1142");
        org.mockito.asm.ByteVector byteVector0 = new org.mockito.asm.ByteVector();
        org.mockito.asm.ByteVector byteVector2 = byteVector0.putUTF8("hi!");
        org.mockito.asm.ByteVector byteVector4 = byteVector2.putLong((long) (byte) 10);
        org.mockito.asm.ByteVector byteVector6 = byteVector4.putUTF8("hi!");
        org.mockito.asm.ByteVector byteVector8 = byteVector4.putLong((long) (short) -1);
        org.mockito.asm.ByteVector byteVector10 = byteVector8.putInt(10);
        org.mockito.asm.ByteVector byteVector12 = byteVector8.putByte((int) (short) 1);
        org.mockito.asm.ByteVector byteVector14 = byteVector12.putShort((int) (short) 100);
        org.mockito.asm.ByteVector byteVector16 = byteVector14.putByte(0);
        org.mockito.asm.ByteVector byteVector18 = byteVector16.putUTF8("hi!");
        org.mockito.asm.ByteVector byteVector20 = byteVector16.putInt((int) (short) -1);
        org.mockito.asm.ByteVector byteVector22 = byteVector16.putLong((long) (short) 100);
        org.mockito.asm.ByteVector byteVector24 = byteVector22.putShort(10);
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
    public void test1143() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1143");
        org.mockito.asm.ByteVector byteVector1 = new org.mockito.asm.ByteVector((int) (byte) 10);
        org.mockito.asm.ByteVector byteVector3 = byteVector1.putByte((int) '4');
        org.mockito.asm.ByteVector byteVector5 = byteVector1.putLong(0L);
        org.mockito.asm.ByteVector byteVector7 = byteVector5.putUTF8("");
        org.mockito.asm.ByteVector byteVector9 = byteVector5.putShort((int) ' ');
        java.lang.Class<?> wildcardClass10 = byteVector5.getClass();
        org.junit.Assert.assertNotNull(byteVector3);
        org.junit.Assert.assertNotNull(byteVector5);
        org.junit.Assert.assertNotNull(byteVector7);
        org.junit.Assert.assertNotNull(byteVector9);
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test1144() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1144");
        org.mockito.asm.ByteVector byteVector1 = new org.mockito.asm.ByteVector((int) '#');
        org.mockito.asm.ByteVector byteVector3 = byteVector1.putLong(100L);
        org.mockito.asm.ByteVector byteVector5 = byteVector3.putUTF8("");
        org.mockito.asm.ByteVector byteVector7 = byteVector5.putShort(0);
        org.mockito.asm.ByteVector byteVector8 = new org.mockito.asm.ByteVector();
        org.mockito.asm.ByteVector byteVector10 = byteVector8.putUTF8("hi!");
        org.mockito.asm.ByteVector byteVector12 = byteVector8.putInt(0);
        org.mockito.asm.ByteVector byteVector14 = byteVector12.putByte((int) (byte) -1);
        org.mockito.asm.ByteVector byteVector16 = byteVector12.putShort((int) '4');
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
        org.mockito.asm.ByteVector byteVector46 = byteVector16.putByteArray(byteArray40, (int) (byte) 0, (int) (short) 1);
        // The following exception was thrown during execution in test generation
        try {
            org.mockito.asm.ByteVector byteVector49 = byteVector5.putByteArray(byteArray40, (int) (byte) 100, (int) (byte) 1);
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
        org.junit.Assert.assertNotNull(byteVector46);
    }

    @Test
    public void test1145() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1145");
        org.mockito.asm.ByteVector byteVector0 = new org.mockito.asm.ByteVector();
        org.mockito.asm.ByteVector byteVector2 = byteVector0.putUTF8("hi!");
        org.mockito.asm.ByteVector byteVector4 = byteVector2.putByte(100);
        org.mockito.asm.ByteVector byteVector6 = byteVector2.putLong((long) 10);
        org.mockito.asm.ByteVector byteVector8 = byteVector6.putShort((int) (byte) 0);
        org.mockito.asm.ByteVector byteVector9 = new org.mockito.asm.ByteVector();
        org.mockito.asm.ByteVector byteVector11 = byteVector9.putUTF8("hi!");
        org.mockito.asm.ByteVector byteVector13 = byteVector9.putShort((int) (short) -1);
        org.mockito.asm.ByteVector byteVector15 = byteVector9.putInt((int) (byte) 10);
        org.mockito.asm.ByteVector byteVector17 = byteVector15.putUTF8("hi!");
        org.mockito.asm.ByteVector byteVector19 = byteVector17.putByte((int) (byte) 1);
        org.mockito.asm.ByteVector byteVector21 = byteVector17.putInt((int) (byte) -1);
        org.mockito.asm.ByteVector byteVector22 = new org.mockito.asm.ByteVector();
        org.mockito.asm.ByteVector byteVector24 = byteVector22.putUTF8("hi!");
        org.mockito.asm.ByteVector byteVector26 = byteVector22.putLong((long) ' ');
        org.mockito.asm.ByteVector byteVector28 = byteVector26.putByte((int) 'a');
        org.mockito.asm.ByteVector byteVector30 = byteVector26.putByte((int) (short) -1);
        org.mockito.asm.ByteVector byteVector32 = byteVector26.putLong(0L);
        org.mockito.asm.ByteVector byteVector34 = byteVector26.putUTF8("hi!");
        org.mockito.asm.ByteVector byteVector36 = byteVector34.putUTF8("");
        org.mockito.asm.ByteVector byteVector38 = byteVector34.putInt((int) (byte) 10);
        org.mockito.asm.ByteVector byteVector40 = byteVector38.putLong((long) (short) -1);
        org.mockito.asm.ByteVector byteVector42 = byteVector38.putByte(0);
        org.mockito.asm.ByteVector byteVector43 = new org.mockito.asm.ByteVector();
        org.mockito.asm.ByteVector byteVector45 = byteVector43.putUTF8("hi!");
        org.mockito.asm.ByteVector byteVector47 = byteVector45.putInt(0);
        org.mockito.asm.ByteVector byteVector49 = byteVector45.putByte((int) (byte) 10);
        org.mockito.asm.ByteVector byteVector51 = byteVector49.putLong((-1L));
        org.mockito.asm.ByteVector byteVector53 = byteVector49.putInt((int) (byte) 100);
        org.mockito.asm.ByteVector byteVector54 = new org.mockito.asm.ByteVector();
        org.mockito.asm.ByteVector byteVector56 = byteVector54.putUTF8("hi!");
        org.mockito.asm.ByteVector byteVector58 = byteVector54.putInt(0);
        org.mockito.asm.ByteVector byteVector60 = byteVector58.putInt((int) ' ');
        org.mockito.asm.ByteVector byteVector62 = byteVector60.putLong(100L);
        byte[] byteArray66 = new byte[] { (byte) 0, (byte) 10, (byte) 1 };
        org.mockito.asm.ByteVector byteVector69 = byteVector60.putByteArray(byteArray66, 0, 0);
        org.mockito.asm.ByteVector byteVector72 = byteVector49.putByteArray(byteArray66, (int) (byte) 1, 0);
        org.mockito.asm.ByteVector byteVector75 = byteVector42.putByteArray(byteArray66, 1, 0);
        org.mockito.asm.ByteVector byteVector78 = byteVector17.putByteArray(byteArray66, 1, (int) (byte) 1);
        // The following exception was thrown during execution in test generation
        try {
            org.mockito.asm.ByteVector byteVector81 = byteVector8.putByteArray(byteArray66, 1, (int) (byte) 10);
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
        org.junit.Assert.assertNotNull(byteVector24);
        org.junit.Assert.assertNotNull(byteVector26);
        org.junit.Assert.assertNotNull(byteVector28);
        org.junit.Assert.assertNotNull(byteVector30);
        org.junit.Assert.assertNotNull(byteVector32);
        org.junit.Assert.assertNotNull(byteVector34);
        org.junit.Assert.assertNotNull(byteVector36);
        org.junit.Assert.assertNotNull(byteVector38);
        org.junit.Assert.assertNotNull(byteVector40);
        org.junit.Assert.assertNotNull(byteVector42);
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
        org.junit.Assert.assertNotNull(byteVector78);
    }

    @Test
    public void test1146() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1146");
        org.mockito.asm.ByteVector byteVector0 = new org.mockito.asm.ByteVector();
        org.mockito.asm.ByteVector byteVector2 = byteVector0.putUTF8("hi!");
        org.mockito.asm.ByteVector byteVector4 = byteVector0.putShort((int) (short) -1);
        org.mockito.asm.ByteVector byteVector6 = byteVector0.putInt((int) (byte) 10);
        org.mockito.asm.ByteVector byteVector8 = byteVector6.putUTF8("hi!");
        org.mockito.asm.ByteVector byteVector10 = byteVector6.putLong((long) '#');
        org.mockito.asm.ByteVector byteVector12 = byteVector6.putShort((int) '#');
        org.mockito.asm.ByteVector byteVector14 = byteVector12.putShort(0);
        org.mockito.asm.ByteVector byteVector16 = byteVector12.putByte(1);
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
    public void test1147() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1147");
        org.mockito.asm.ByteVector byteVector0 = new org.mockito.asm.ByteVector();
        org.mockito.asm.ByteVector byteVector2 = byteVector0.putUTF8("hi!");
        org.mockito.asm.ByteVector byteVector4 = byteVector2.putByte(100);
        org.mockito.asm.ByteVector byteVector6 = byteVector2.putLong((long) 10);
        org.mockito.asm.ByteVector byteVector8 = byteVector2.putShort((int) (short) -1);
        org.mockito.asm.ByteVector byteVector10 = byteVector2.putLong((long) (short) 10);
        org.mockito.asm.ByteVector byteVector12 = byteVector2.putUTF8("");
        org.junit.Assert.assertNotNull(byteVector2);
        org.junit.Assert.assertNotNull(byteVector4);
        org.junit.Assert.assertNotNull(byteVector6);
        org.junit.Assert.assertNotNull(byteVector8);
        org.junit.Assert.assertNotNull(byteVector10);
        org.junit.Assert.assertNotNull(byteVector12);
    }

    @Test
    public void test1148() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1148");
        org.mockito.asm.ByteVector byteVector0 = new org.mockito.asm.ByteVector();
        org.mockito.asm.ByteVector byteVector2 = byteVector0.putUTF8("hi!");
        org.mockito.asm.ByteVector byteVector4 = byteVector2.putLong((long) (byte) 10);
        org.mockito.asm.ByteVector byteVector6 = byteVector4.putUTF8("hi!");
        org.mockito.asm.ByteVector byteVector8 = byteVector4.putLong((-1L));
        org.mockito.asm.ByteVector byteVector10 = byteVector8.putInt(10);
        org.mockito.asm.ByteVector byteVector12 = byteVector10.putShort((int) '#');
        org.mockito.asm.ByteVector byteVector14 = byteVector10.putShort((int) (byte) 100);
        org.mockito.asm.ByteVector byteVector16 = byteVector10.putUTF8("");
        org.mockito.asm.ByteVector byteVector18 = byteVector10.putUTF8("");
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
    public void test1149() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1149");
        org.mockito.asm.ByteVector byteVector1 = new org.mockito.asm.ByteVector((int) (byte) 1);
        org.mockito.asm.ByteVector byteVector3 = byteVector1.putByte((int) (byte) 10);
        org.mockito.asm.ByteVector byteVector5 = byteVector1.putLong(1L);
        org.mockito.asm.ByteVector byteVector7 = byteVector1.putByte((int) '#');
        org.mockito.asm.ByteVector byteVector9 = byteVector7.putShort(100);
        byte[] byteArray10 = null;
        org.mockito.asm.ByteVector byteVector13 = byteVector9.putByteArray(byteArray10, (-1), 10);
        org.mockito.asm.ByteVector byteVector15 = byteVector9.putInt((int) (byte) 1);
        org.junit.Assert.assertNotNull(byteVector3);
        org.junit.Assert.assertNotNull(byteVector5);
        org.junit.Assert.assertNotNull(byteVector7);
        org.junit.Assert.assertNotNull(byteVector9);
        org.junit.Assert.assertNotNull(byteVector13);
        org.junit.Assert.assertNotNull(byteVector15);
    }

    @Test
    public void test1150() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1150");
        org.mockito.asm.ByteVector byteVector1 = new org.mockito.asm.ByteVector((int) (byte) 10);
        org.mockito.asm.ByteVector byteVector3 = byteVector1.putByte((int) '4');
        org.mockito.asm.ByteVector byteVector5 = byteVector1.putLong(0L);
        org.mockito.asm.ByteVector byteVector7 = byteVector1.putUTF8("");
        java.lang.Class<?> wildcardClass8 = byteVector7.getClass();
        org.junit.Assert.assertNotNull(byteVector3);
        org.junit.Assert.assertNotNull(byteVector5);
        org.junit.Assert.assertNotNull(byteVector7);
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test1151() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1151");
        org.mockito.asm.ByteVector byteVector0 = new org.mockito.asm.ByteVector();
        org.mockito.asm.ByteVector byteVector2 = byteVector0.putUTF8("hi!");
        org.mockito.asm.ByteVector byteVector4 = byteVector0.putShort((int) (short) -1);
        org.mockito.asm.ByteVector byteVector6 = byteVector0.putInt(0);
        org.mockito.asm.ByteVector byteVector8 = byteVector0.putUTF8("hi!");
        org.mockito.asm.ByteVector byteVector10 = byteVector0.putUTF8("hi!");
        org.mockito.asm.ByteVector byteVector12 = byteVector10.putLong((long) (short) 1);
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
    public void test1152() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1152");
        org.mockito.asm.ByteVector byteVector1 = new org.mockito.asm.ByteVector((int) '#');
        org.mockito.asm.ByteVector byteVector3 = byteVector1.putUTF8("hi!");
        org.mockito.asm.ByteVector byteVector5 = byteVector3.putUTF8("");
        org.junit.Assert.assertNotNull(byteVector3);
        org.junit.Assert.assertNotNull(byteVector5);
    }

    @Test
    public void test1153() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1153");
        org.mockito.asm.ByteVector byteVector0 = new org.mockito.asm.ByteVector();
        org.mockito.asm.ByteVector byteVector2 = byteVector0.putUTF8("hi!");
        org.mockito.asm.ByteVector byteVector4 = byteVector0.putLong((long) ' ');
        org.mockito.asm.ByteVector byteVector6 = byteVector4.putByte((int) 'a');
        org.mockito.asm.ByteVector byteVector8 = byteVector4.putByte((int) (short) -1);
        org.mockito.asm.ByteVector byteVector10 = byteVector8.putByte((-1));
        org.mockito.asm.ByteVector byteVector12 = byteVector10.putShort((int) (short) -1);
        org.mockito.asm.ByteVector byteVector14 = byteVector10.putUTF8("");
        org.mockito.asm.ByteVector byteVector16 = byteVector10.putUTF8("");
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
    public void test1154() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1154");
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
        org.mockito.asm.ByteVector byteVector20 = byteVector18.putUTF8("hi!");
        org.mockito.asm.ByteVector byteVector22 = byteVector20.putUTF8("");
        org.mockito.asm.ByteVector byteVector24 = byteVector20.putUTF8("");
        org.mockito.asm.ByteVector byteVector26 = byteVector24.putShort((int) (byte) 1);
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
    public void test1155() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1155");
        org.mockito.asm.ByteVector byteVector0 = new org.mockito.asm.ByteVector();
        org.mockito.asm.ByteVector byteVector2 = byteVector0.putUTF8("hi!");
        org.mockito.asm.ByteVector byteVector4 = byteVector2.putLong((long) (byte) 10);
        org.mockito.asm.ByteVector byteVector6 = byteVector4.putUTF8("hi!");
        org.mockito.asm.ByteVector byteVector8 = byteVector4.putLong((long) (short) -1);
        org.mockito.asm.ByteVector byteVector10 = byteVector8.putInt(10);
        org.mockito.asm.ByteVector byteVector12 = byteVector8.putByte((int) (short) 1);
        org.mockito.asm.ByteVector byteVector14 = byteVector12.putShort((int) (short) 100);
        org.mockito.asm.ByteVector byteVector16 = byteVector14.putByte((int) ' ');
        org.mockito.asm.ByteVector byteVector18 = byteVector14.putUTF8("");
        org.mockito.asm.ByteVector byteVector20 = byteVector14.putByte((int) '4');
        org.mockito.asm.ByteVector byteVector22 = byteVector14.putLong((long) 10);
        org.mockito.asm.ByteVector byteVector23 = new org.mockito.asm.ByteVector();
        org.mockito.asm.ByteVector byteVector25 = byteVector23.putUTF8("hi!");
        org.mockito.asm.ByteVector byteVector27 = byteVector23.putLong((long) ' ');
        org.mockito.asm.ByteVector byteVector29 = byteVector27.putByte((int) 'a');
        org.mockito.asm.ByteVector byteVector31 = byteVector27.putByte((int) (short) -1);
        org.mockito.asm.ByteVector byteVector33 = byteVector27.putLong(0L);
        org.mockito.asm.ByteVector byteVector35 = new org.mockito.asm.ByteVector((int) '#');
        org.mockito.asm.ByteVector byteVector37 = byteVector35.putInt(100);
        org.mockito.asm.ByteVector byteVector39 = byteVector35.putUTF8("");
        org.mockito.asm.ByteVector byteVector40 = new org.mockito.asm.ByteVector();
        org.mockito.asm.ByteVector byteVector42 = byteVector40.putUTF8("hi!");
        org.mockito.asm.ByteVector byteVector44 = byteVector42.putInt(0);
        org.mockito.asm.ByteVector byteVector46 = byteVector44.putByte((int) (short) 0);
        org.mockito.asm.ByteVector byteVector48 = byteVector44.putUTF8("");
        org.mockito.asm.ByteVector byteVector49 = new org.mockito.asm.ByteVector();
        org.mockito.asm.ByteVector byteVector51 = byteVector49.putUTF8("hi!");
        org.mockito.asm.ByteVector byteVector53 = byteVector49.putInt(0);
        org.mockito.asm.ByteVector byteVector55 = byteVector49.putShort((int) '4');
        org.mockito.asm.ByteVector byteVector57 = byteVector49.putByte(100);
        org.mockito.asm.ByteVector byteVector59 = byteVector57.putInt((int) (byte) 10);
        org.mockito.asm.ByteVector byteVector61 = byteVector57.putInt((int) (byte) 10);
        org.mockito.asm.ByteVector byteVector63 = byteVector61.putByte(100);
        org.mockito.asm.ByteVector byteVector64 = new org.mockito.asm.ByteVector();
        org.mockito.asm.ByteVector byteVector66 = byteVector64.putUTF8("hi!");
        org.mockito.asm.ByteVector byteVector68 = byteVector64.putInt(0);
        org.mockito.asm.ByteVector byteVector70 = byteVector68.putInt((int) ' ');
        org.mockito.asm.ByteVector byteVector72 = byteVector70.putLong(100L);
        byte[] byteArray76 = new byte[] { (byte) 0, (byte) 10, (byte) 1 };
        org.mockito.asm.ByteVector byteVector79 = byteVector70.putByteArray(byteArray76, 0, 0);
        org.mockito.asm.ByteVector byteVector82 = byteVector63.putByteArray(byteArray76, (int) (byte) 1, (int) (byte) 0);
        org.mockito.asm.ByteVector byteVector85 = byteVector44.putByteArray(byteArray76, (int) (short) 0, 0);
        org.mockito.asm.ByteVector byteVector88 = byteVector39.putByteArray(byteArray76, (int) (byte) 0, (int) (short) 1);
        org.mockito.asm.ByteVector byteVector91 = byteVector33.putByteArray(byteArray76, 0, (int) (byte) 0);
        // The following exception was thrown during execution in test generation
        try {
            org.mockito.asm.ByteVector byteVector94 = byteVector22.putByteArray(byteArray76, 0, (int) (byte) -1);
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
        org.junit.Assert.assertNotNull(byteVector37);
        org.junit.Assert.assertNotNull(byteVector39);
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
        org.junit.Assert.assertNotNull(byteVector66);
        org.junit.Assert.assertNotNull(byteVector68);
        org.junit.Assert.assertNotNull(byteVector70);
        org.junit.Assert.assertNotNull(byteVector72);
        org.junit.Assert.assertNotNull(byteArray76);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray76), "[0, 10, 1]");
        org.junit.Assert.assertNotNull(byteVector79);
        org.junit.Assert.assertNotNull(byteVector82);
        org.junit.Assert.assertNotNull(byteVector85);
        org.junit.Assert.assertNotNull(byteVector88);
        org.junit.Assert.assertNotNull(byteVector91);
    }

    @Test
    public void test1156() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1156");
        org.mockito.asm.ByteVector byteVector0 = new org.mockito.asm.ByteVector();
        org.mockito.asm.ByteVector byteVector2 = byteVector0.putUTF8("hi!");
        org.mockito.asm.ByteVector byteVector4 = byteVector2.putByte(100);
        org.mockito.asm.ByteVector byteVector6 = byteVector2.putShort((int) 'a');
        org.mockito.asm.ByteVector byteVector8 = byteVector6.putByte((int) (short) 1);
        org.mockito.asm.ByteVector byteVector10 = byteVector8.putLong((long) (short) 100);
        org.mockito.asm.ByteVector byteVector12 = byteVector10.putByte(1);
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
            org.mockito.asm.ByteVector byteVector57 = byteVector10.putByteArray(byteArray45, 0, (-1));
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
    public void test1157() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1157");
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
        org.mockito.asm.ByteVector byteVector22 = byteVector20.putShort((int) (short) -1);
        org.mockito.asm.ByteVector byteVector24 = byteVector20.putByte((int) (short) 10);
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
    public void test1158() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1158");
        org.mockito.asm.ByteVector byteVector0 = new org.mockito.asm.ByteVector();
        org.mockito.asm.ByteVector byteVector2 = byteVector0.putUTF8("hi!");
        org.mockito.asm.ByteVector byteVector4 = byteVector2.putInt(0);
        org.mockito.asm.ByteVector byteVector6 = byteVector4.putByte((int) (short) 0);
        org.mockito.asm.ByteVector byteVector8 = byteVector4.putUTF8("hi!");
        org.mockito.asm.ByteVector byteVector10 = byteVector4.putInt((int) (short) 0);
        org.mockito.asm.ByteVector byteVector12 = byteVector10.putShort(10);
        org.junit.Assert.assertNotNull(byteVector2);
        org.junit.Assert.assertNotNull(byteVector4);
        org.junit.Assert.assertNotNull(byteVector6);
        org.junit.Assert.assertNotNull(byteVector8);
        org.junit.Assert.assertNotNull(byteVector10);
        org.junit.Assert.assertNotNull(byteVector12);
    }

    @Test
    public void test1159() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1159");
        org.mockito.asm.ByteVector byteVector0 = new org.mockito.asm.ByteVector();
        org.mockito.asm.ByteVector byteVector2 = byteVector0.putUTF8("hi!");
        org.mockito.asm.ByteVector byteVector4 = byteVector2.putInt((int) (byte) 10);
        org.mockito.asm.ByteVector byteVector6 = byteVector4.putUTF8("");
        org.mockito.asm.ByteVector byteVector8 = byteVector6.putInt(0);
        org.mockito.asm.ByteVector byteVector10 = byteVector8.putInt((int) (short) 10);
        org.mockito.asm.ByteVector byteVector12 = byteVector10.putShort((int) (short) 1);
        org.mockito.asm.ByteVector byteVector14 = byteVector10.putShort((int) 'a');
        org.junit.Assert.assertNotNull(byteVector2);
        org.junit.Assert.assertNotNull(byteVector4);
        org.junit.Assert.assertNotNull(byteVector6);
        org.junit.Assert.assertNotNull(byteVector8);
        org.junit.Assert.assertNotNull(byteVector10);
        org.junit.Assert.assertNotNull(byteVector12);
        org.junit.Assert.assertNotNull(byteVector14);
    }

    @Test
    public void test1160() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1160");
        org.mockito.asm.ByteVector byteVector0 = new org.mockito.asm.ByteVector();
        org.mockito.asm.ByteVector byteVector2 = byteVector0.putUTF8("hi!");
        org.mockito.asm.ByteVector byteVector4 = byteVector0.putShort((int) (short) -1);
        org.mockito.asm.ByteVector byteVector6 = byteVector0.putInt((int) (byte) 10);
        org.mockito.asm.ByteVector byteVector8 = byteVector0.putUTF8("hi!");
        org.mockito.asm.ByteVector byteVector10 = byteVector0.putLong((long) (byte) 10);
        org.mockito.asm.ByteVector byteVector12 = byteVector0.putByte((-1));
        org.junit.Assert.assertNotNull(byteVector2);
        org.junit.Assert.assertNotNull(byteVector4);
        org.junit.Assert.assertNotNull(byteVector6);
        org.junit.Assert.assertNotNull(byteVector8);
        org.junit.Assert.assertNotNull(byteVector10);
        org.junit.Assert.assertNotNull(byteVector12);
    }

    @Test
    public void test1161() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1161");
        org.mockito.asm.ByteVector byteVector1 = new org.mockito.asm.ByteVector((int) (byte) 1);
        org.mockito.asm.ByteVector byteVector3 = byteVector1.putByte((int) (byte) 10);
        org.mockito.asm.ByteVector byteVector5 = byteVector3.putShort((int) (short) 10);
        org.mockito.asm.ByteVector byteVector7 = byteVector3.putUTF8("");
        org.mockito.asm.ByteVector byteVector9 = byteVector7.putShort(0);
        org.mockito.asm.ByteVector byteVector11 = byteVector9.putShort((int) (short) -1);
        org.mockito.asm.ByteVector byteVector13 = byteVector9.putShort((int) '4');
        org.junit.Assert.assertNotNull(byteVector3);
        org.junit.Assert.assertNotNull(byteVector5);
        org.junit.Assert.assertNotNull(byteVector7);
        org.junit.Assert.assertNotNull(byteVector9);
        org.junit.Assert.assertNotNull(byteVector11);
        org.junit.Assert.assertNotNull(byteVector13);
    }

    @Test
    public void test1162() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1162");
        org.mockito.asm.ByteVector byteVector0 = new org.mockito.asm.ByteVector();
        org.mockito.asm.ByteVector byteVector2 = byteVector0.putUTF8("hi!");
        org.mockito.asm.ByteVector byteVector4 = byteVector2.putInt(0);
        org.mockito.asm.ByteVector byteVector6 = byteVector2.putByte((int) (byte) 10);
        org.mockito.asm.ByteVector byteVector8 = byteVector6.putLong(0L);
        org.mockito.asm.ByteVector byteVector10 = byteVector8.putShort((int) 'a');
        org.mockito.asm.ByteVector byteVector12 = byteVector10.putByte((int) ' ');
        org.mockito.asm.ByteVector byteVector14 = byteVector12.putByte((int) '#');
        org.mockito.asm.ByteVector byteVector16 = byteVector12.putShort((int) '4');
        org.mockito.asm.ByteVector byteVector18 = byteVector12.putInt(10);
        org.mockito.asm.ByteVector byteVector19 = new org.mockito.asm.ByteVector();
        org.mockito.asm.ByteVector byteVector21 = byteVector19.putUTF8("hi!");
        org.mockito.asm.ByteVector byteVector23 = byteVector21.putByte(100);
        org.mockito.asm.ByteVector byteVector25 = byteVector21.putLong((long) 10);
        org.mockito.asm.ByteVector byteVector27 = byteVector21.putShort((int) (short) -1);
        org.mockito.asm.ByteVector byteVector28 = new org.mockito.asm.ByteVector();
        org.mockito.asm.ByteVector byteVector30 = byteVector28.putUTF8("hi!");
        org.mockito.asm.ByteVector byteVector32 = byteVector28.putLong((long) ' ');
        org.mockito.asm.ByteVector byteVector34 = byteVector32.putByte((int) 'a');
        org.mockito.asm.ByteVector byteVector36 = byteVector32.putByte((int) (short) -1);
        org.mockito.asm.ByteVector byteVector38 = byteVector32.putLong(0L);
        org.mockito.asm.ByteVector byteVector40 = byteVector38.putByte(0);
        org.mockito.asm.ByteVector byteVector42 = byteVector40.putByte(100);
        org.mockito.asm.ByteVector byteVector44 = byteVector40.putByte((int) '4');
        org.mockito.asm.ByteVector byteVector46 = byteVector44.putUTF8("hi!");
        org.mockito.asm.ByteVector byteVector48 = byteVector44.putShort(100);
        org.mockito.asm.ByteVector byteVector50 = byteVector44.putShort((int) (short) 100);
        org.mockito.asm.ByteVector byteVector51 = new org.mockito.asm.ByteVector();
        org.mockito.asm.ByteVector byteVector53 = byteVector51.putUTF8("hi!");
        org.mockito.asm.ByteVector byteVector55 = byteVector51.putInt(0);
        org.mockito.asm.ByteVector byteVector57 = byteVector51.putShort((int) '4');
        org.mockito.asm.ByteVector byteVector59 = byteVector51.putByte(100);
        org.mockito.asm.ByteVector byteVector61 = byteVector59.putInt((int) (byte) 10);
        org.mockito.asm.ByteVector byteVector63 = byteVector59.putInt((int) (byte) 10);
        org.mockito.asm.ByteVector byteVector65 = byteVector63.putByte(100);
        org.mockito.asm.ByteVector byteVector66 = new org.mockito.asm.ByteVector();
        org.mockito.asm.ByteVector byteVector68 = byteVector66.putUTF8("hi!");
        org.mockito.asm.ByteVector byteVector70 = byteVector66.putInt(0);
        org.mockito.asm.ByteVector byteVector72 = byteVector70.putInt((int) ' ');
        org.mockito.asm.ByteVector byteVector74 = byteVector72.putLong(100L);
        byte[] byteArray78 = new byte[] { (byte) 0, (byte) 10, (byte) 1 };
        org.mockito.asm.ByteVector byteVector81 = byteVector72.putByteArray(byteArray78, 0, 0);
        org.mockito.asm.ByteVector byteVector84 = byteVector65.putByteArray(byteArray78, (int) (byte) 1, (int) (byte) 0);
        org.mockito.asm.ByteVector byteVector87 = byteVector50.putByteArray(byteArray78, 1, (int) (byte) 1);
        org.mockito.asm.ByteVector byteVector90 = byteVector21.putByteArray(byteArray78, 1, 1);
        // The following exception was thrown during execution in test generation
        try {
            org.mockito.asm.ByteVector byteVector93 = byteVector18.putByteArray(byteArray78, 0, (int) (byte) 100);
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
        org.junit.Assert.assertNotNull(byteVector30);
        org.junit.Assert.assertNotNull(byteVector32);
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
        org.junit.Assert.assertNotNull(byteVector61);
        org.junit.Assert.assertNotNull(byteVector63);
        org.junit.Assert.assertNotNull(byteVector65);
        org.junit.Assert.assertNotNull(byteVector68);
        org.junit.Assert.assertNotNull(byteVector70);
        org.junit.Assert.assertNotNull(byteVector72);
        org.junit.Assert.assertNotNull(byteVector74);
        org.junit.Assert.assertNotNull(byteArray78);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray78), "[0, 10, 1]");
        org.junit.Assert.assertNotNull(byteVector81);
        org.junit.Assert.assertNotNull(byteVector84);
        org.junit.Assert.assertNotNull(byteVector87);
        org.junit.Assert.assertNotNull(byteVector90);
    }

    @Test
    public void test1163() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1163");
        org.mockito.asm.ByteVector byteVector0 = new org.mockito.asm.ByteVector();
        org.mockito.asm.ByteVector byteVector2 = byteVector0.putUTF8("hi!");
        org.mockito.asm.ByteVector byteVector4 = byteVector0.putLong((long) ' ');
        org.mockito.asm.ByteVector byteVector6 = byteVector4.putByte((int) 'a');
        org.mockito.asm.ByteVector byteVector8 = byteVector6.putInt((int) (short) 1);
        org.mockito.asm.ByteVector byteVector10 = byteVector6.putByte((int) (byte) -1);
        org.mockito.asm.ByteVector byteVector12 = byteVector6.putInt((int) (byte) -1);
        org.mockito.asm.ByteVector byteVector14 = byteVector12.putByte((int) (byte) 1);
        org.mockito.asm.ByteVector byteVector16 = byteVector14.putInt((int) (short) -1);
        org.mockito.asm.ByteVector byteVector17 = new org.mockito.asm.ByteVector();
        org.mockito.asm.ByteVector byteVector19 = byteVector17.putUTF8("hi!");
        org.mockito.asm.ByteVector byteVector21 = byteVector17.putLong((long) ' ');
        org.mockito.asm.ByteVector byteVector23 = byteVector21.putByte((int) 'a');
        org.mockito.asm.ByteVector byteVector25 = byteVector23.putByte((int) (short) -1);
        org.mockito.asm.ByteVector byteVector27 = byteVector25.putLong((long) (byte) -1);
        org.mockito.asm.ByteVector byteVector29 = byteVector25.putByte((int) '4');
        org.mockito.asm.ByteVector byteVector31 = byteVector29.putLong((long) (short) 10);
        org.mockito.asm.ByteVector byteVector33 = new org.mockito.asm.ByteVector((int) '#');
        org.mockito.asm.ByteVector byteVector35 = byteVector33.putInt(100);
        org.mockito.asm.ByteVector byteVector37 = byteVector35.putShort((int) (short) -1);
        org.mockito.asm.ByteVector byteVector39 = byteVector37.putShort((int) (short) 0);
        org.mockito.asm.ByteVector byteVector41 = byteVector37.putUTF8("");
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
        org.mockito.asm.ByteVector byteVector82 = byteVector37.putByteArray(byteArray73, 1, 1);
        org.mockito.asm.ByteVector byteVector85 = byteVector29.putByteArray(byteArray73, (int) (short) 0, 0);
        // The following exception was thrown during execution in test generation
        try {
            org.mockito.asm.ByteVector byteVector88 = byteVector16.putByteArray(byteArray73, 0, (int) (byte) 10);
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
        org.junit.Assert.assertNotNull(byteVector85);
    }

    @Test
    public void test1164() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1164");
        org.mockito.asm.ByteVector byteVector1 = new org.mockito.asm.ByteVector((int) ' ');
        org.mockito.asm.ByteVector byteVector3 = byteVector1.putInt((int) '4');
        org.mockito.asm.ByteVector byteVector5 = byteVector3.putUTF8("");
        org.mockito.asm.ByteVector byteVector7 = byteVector5.putInt(0);
        org.mockito.asm.ByteVector byteVector9 = byteVector5.putShort((int) (short) -1);
        org.mockito.asm.ByteVector byteVector11 = byteVector9.putLong((long) 10);
        org.mockito.asm.ByteVector byteVector13 = byteVector11.putUTF8("");
        java.lang.Class<?> wildcardClass14 = byteVector11.getClass();
        org.junit.Assert.assertNotNull(byteVector3);
        org.junit.Assert.assertNotNull(byteVector5);
        org.junit.Assert.assertNotNull(byteVector7);
        org.junit.Assert.assertNotNull(byteVector9);
        org.junit.Assert.assertNotNull(byteVector11);
        org.junit.Assert.assertNotNull(byteVector13);
        org.junit.Assert.assertNotNull(wildcardClass14);
    }

    @Test
    public void test1165() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1165");
        org.mockito.asm.ByteVector byteVector0 = new org.mockito.asm.ByteVector();
        org.mockito.asm.ByteVector byteVector2 = byteVector0.putUTF8("hi!");
        org.mockito.asm.ByteVector byteVector4 = byteVector0.putShort((int) (short) -1);
        org.mockito.asm.ByteVector byteVector6 = byteVector0.putInt(0);
        org.mockito.asm.ByteVector byteVector8 = byteVector0.putUTF8("hi!");
        org.mockito.asm.ByteVector byteVector10 = byteVector8.putInt((int) (short) 0);
        org.mockito.asm.ByteVector byteVector12 = byteVector8.putUTF8("");
        org.junit.Assert.assertNotNull(byteVector2);
        org.junit.Assert.assertNotNull(byteVector4);
        org.junit.Assert.assertNotNull(byteVector6);
        org.junit.Assert.assertNotNull(byteVector8);
        org.junit.Assert.assertNotNull(byteVector10);
        org.junit.Assert.assertNotNull(byteVector12);
    }

    @Test
    public void test1166() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1166");
        org.mockito.asm.ByteVector byteVector0 = new org.mockito.asm.ByteVector();
        org.mockito.asm.ByteVector byteVector2 = byteVector0.putUTF8("hi!");
        org.mockito.asm.ByteVector byteVector4 = byteVector0.putLong((long) ' ');
        org.mockito.asm.ByteVector byteVector6 = byteVector4.putByte((int) 'a');
        org.mockito.asm.ByteVector byteVector8 = byteVector6.putByte((int) (short) -1);
        byte[] byteArray9 = null;
        org.mockito.asm.ByteVector byteVector12 = byteVector6.putByteArray(byteArray9, (int) '#', 0);
        org.mockito.asm.ByteVector byteVector14 = byteVector6.putByte((int) (byte) 1);
        org.mockito.asm.ByteVector byteVector16 = byteVector14.putByte((int) (byte) 1);
        org.mockito.asm.ByteVector byteVector18 = byteVector16.putByte((int) (short) 0);
        byte[] byteArray19 = null;
        org.mockito.asm.ByteVector byteVector22 = byteVector18.putByteArray(byteArray19, (int) '4', 0);
        org.mockito.asm.ByteVector byteVector24 = byteVector22.putUTF8("");
        org.junit.Assert.assertNotNull(byteVector2);
        org.junit.Assert.assertNotNull(byteVector4);
        org.junit.Assert.assertNotNull(byteVector6);
        org.junit.Assert.assertNotNull(byteVector8);
        org.junit.Assert.assertNotNull(byteVector12);
        org.junit.Assert.assertNotNull(byteVector14);
        org.junit.Assert.assertNotNull(byteVector16);
        org.junit.Assert.assertNotNull(byteVector18);
        org.junit.Assert.assertNotNull(byteVector22);
        org.junit.Assert.assertNotNull(byteVector24);
    }

    @Test
    public void test1167() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1167");
        org.mockito.asm.ByteVector byteVector1 = new org.mockito.asm.ByteVector((int) (short) 1);
        org.mockito.asm.ByteVector byteVector3 = byteVector1.putLong((long) (byte) 1);
        org.mockito.asm.ByteVector byteVector5 = byteVector1.putUTF8("");
        org.mockito.asm.ByteVector byteVector7 = byteVector5.putInt((int) '#');
        org.mockito.asm.ByteVector byteVector9 = byteVector5.putByte(1);
        org.mockito.asm.ByteVector byteVector11 = byteVector9.putShort((int) '#');
        org.mockito.asm.ByteVector byteVector13 = byteVector9.putUTF8("hi!");
        org.junit.Assert.assertNotNull(byteVector3);
        org.junit.Assert.assertNotNull(byteVector5);
        org.junit.Assert.assertNotNull(byteVector7);
        org.junit.Assert.assertNotNull(byteVector9);
        org.junit.Assert.assertNotNull(byteVector11);
        org.junit.Assert.assertNotNull(byteVector13);
    }

    @Test
    public void test1168() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1168");
        org.mockito.asm.ByteVector byteVector0 = new org.mockito.asm.ByteVector();
        org.mockito.asm.ByteVector byteVector2 = byteVector0.putUTF8("hi!");
        org.mockito.asm.ByteVector byteVector4 = byteVector2.putLong((long) (byte) 10);
        org.mockito.asm.ByteVector byteVector6 = byteVector4.putUTF8("hi!");
        org.mockito.asm.ByteVector byteVector8 = byteVector4.putLong((-1L));
        org.mockito.asm.ByteVector byteVector10 = byteVector4.putUTF8("hi!");
        org.mockito.asm.ByteVector byteVector12 = byteVector4.putInt((int) (byte) 10);
        org.mockito.asm.ByteVector byteVector14 = byteVector4.putInt(100);
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
    public void test1169() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1169");
        org.mockito.asm.ByteVector byteVector1 = new org.mockito.asm.ByteVector((int) '#');
        org.mockito.asm.ByteVector byteVector3 = byteVector1.putLong(100L);
        org.mockito.asm.ByteVector byteVector5 = byteVector3.putLong(1L);
        org.mockito.asm.ByteVector byteVector7 = byteVector5.putUTF8("hi!");
        org.mockito.asm.ByteVector byteVector9 = byteVector5.putUTF8("hi!");
        org.mockito.asm.ByteVector byteVector11 = byteVector9.putByte((int) (short) 0);
        org.mockito.asm.ByteVector byteVector13 = byteVector9.putInt(1);
        org.mockito.asm.ByteVector byteVector14 = new org.mockito.asm.ByteVector();
        org.mockito.asm.ByteVector byteVector16 = byteVector14.putUTF8("hi!");
        org.mockito.asm.ByteVector byteVector18 = byteVector16.putByte(100);
        org.mockito.asm.ByteVector byteVector20 = byteVector16.putShort((int) 'a');
        org.mockito.asm.ByteVector byteVector22 = byteVector20.putShort((int) (short) 0);
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
        org.mockito.asm.ByteVector byteVector55 = byteVector20.putByteArray(byteArray46, (int) (byte) 1, (int) (short) 1);
        org.mockito.asm.ByteVector byteVector58 = byteVector9.putByteArray(byteArray46, (int) (short) 0, (int) (byte) 0);
        org.mockito.asm.ByteVector byteVector60 = byteVector58.putByte((int) (short) -1);
        org.junit.Assert.assertNotNull(byteVector3);
        org.junit.Assert.assertNotNull(byteVector5);
        org.junit.Assert.assertNotNull(byteVector7);
        org.junit.Assert.assertNotNull(byteVector9);
        org.junit.Assert.assertNotNull(byteVector11);
        org.junit.Assert.assertNotNull(byteVector13);
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
        org.junit.Assert.assertNotNull(byteVector55);
        org.junit.Assert.assertNotNull(byteVector58);
        org.junit.Assert.assertNotNull(byteVector60);
    }

    @Test
    public void test1170() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1170");
        org.mockito.asm.ByteVector byteVector0 = new org.mockito.asm.ByteVector();
        org.mockito.asm.ByteVector byteVector2 = byteVector0.putUTF8("hi!");
        org.mockito.asm.ByteVector byteVector4 = byteVector0.putInt(0);
        org.mockito.asm.ByteVector byteVector6 = byteVector0.putShort(10);
        org.mockito.asm.ByteVector byteVector8 = byteVector6.putLong((long) '4');
        org.mockito.asm.ByteVector byteVector10 = byteVector6.putShort((int) ' ');
        org.mockito.asm.ByteVector byteVector12 = byteVector6.putShort((int) (byte) 0);
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
    public void test1171() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1171");
        org.mockito.asm.ByteVector byteVector0 = new org.mockito.asm.ByteVector();
        org.mockito.asm.ByteVector byteVector2 = byteVector0.putUTF8("hi!");
        org.mockito.asm.ByteVector byteVector4 = byteVector0.putLong((long) ' ');
        org.mockito.asm.ByteVector byteVector6 = byteVector4.putByte((int) 'a');
        org.mockito.asm.ByteVector byteVector8 = byteVector4.putByte((int) (short) -1);
        org.mockito.asm.ByteVector byteVector10 = byteVector4.putLong(0L);
        org.mockito.asm.ByteVector byteVector12 = byteVector10.putInt((int) (short) -1);
        org.mockito.asm.ByteVector byteVector14 = byteVector12.putByte(100);
        org.mockito.asm.ByteVector byteVector16 = byteVector14.putInt((int) (byte) 100);
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
    public void test1172() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1172");
        org.mockito.asm.ByteVector byteVector0 = new org.mockito.asm.ByteVector();
        org.mockito.asm.ByteVector byteVector2 = byteVector0.putUTF8("hi!");
        org.mockito.asm.ByteVector byteVector4 = byteVector0.putShort((int) (short) 100);
        org.mockito.asm.ByteVector byteVector6 = byteVector4.putLong((long) (byte) -1);
        org.mockito.asm.ByteVector byteVector8 = byteVector6.putByte((int) (byte) 0);
        org.mockito.asm.ByteVector byteVector10 = byteVector6.putShort((int) ' ');
        org.mockito.asm.ByteVector byteVector12 = byteVector6.putInt((int) (short) 1);
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
    public void test1173() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1173");
        org.mockito.asm.ByteVector byteVector0 = new org.mockito.asm.ByteVector();
        org.mockito.asm.ByteVector byteVector2 = byteVector0.putUTF8("hi!");
        org.mockito.asm.ByteVector byteVector4 = byteVector2.putLong((long) (byte) 10);
        org.mockito.asm.ByteVector byteVector6 = byteVector4.putUTF8("hi!");
        org.mockito.asm.ByteVector byteVector8 = byteVector4.putLong((long) 10);
        org.mockito.asm.ByteVector byteVector10 = byteVector8.putLong(0L);
        org.mockito.asm.ByteVector byteVector12 = byteVector10.putUTF8("hi!");
        org.mockito.asm.ByteVector byteVector14 = byteVector12.putShort((int) (short) 100);
        org.mockito.asm.ByteVector byteVector16 = byteVector12.putInt((int) (byte) 1);
        org.mockito.asm.ByteVector byteVector18 = byteVector16.putShort((int) (byte) 1);
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
    public void test1174() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1174");
        org.mockito.asm.ByteVector byteVector0 = new org.mockito.asm.ByteVector();
        org.mockito.asm.ByteVector byteVector2 = byteVector0.putInt((int) (byte) 10);
        org.mockito.asm.ByteVector byteVector4 = byteVector2.putByte(0);
        java.lang.Class<?> wildcardClass5 = byteVector4.getClass();
        org.junit.Assert.assertNotNull(byteVector2);
        org.junit.Assert.assertNotNull(byteVector4);
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test1175() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1175");
        org.mockito.asm.ByteVector byteVector0 = new org.mockito.asm.ByteVector();
        org.mockito.asm.ByteVector byteVector2 = byteVector0.putUTF8("hi!");
        org.mockito.asm.ByteVector byteVector4 = byteVector0.putLong((long) (short) 1);
        org.mockito.asm.ByteVector byteVector6 = byteVector4.putShort((int) (byte) -1);
        org.mockito.asm.ByteVector byteVector8 = byteVector4.putUTF8("");
        org.mockito.asm.ByteVector byteVector10 = byteVector8.putLong((-1L));
        org.mockito.asm.ByteVector byteVector12 = byteVector10.putShort(0);
        org.mockito.asm.ByteVector byteVector14 = byteVector12.putByte(1);
        org.junit.Assert.assertNotNull(byteVector2);
        org.junit.Assert.assertNotNull(byteVector4);
        org.junit.Assert.assertNotNull(byteVector6);
        org.junit.Assert.assertNotNull(byteVector8);
        org.junit.Assert.assertNotNull(byteVector10);
        org.junit.Assert.assertNotNull(byteVector12);
        org.junit.Assert.assertNotNull(byteVector14);
    }

    @Test
    public void test1176() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1176");
        org.mockito.asm.ByteVector byteVector0 = new org.mockito.asm.ByteVector();
        org.mockito.asm.ByteVector byteVector2 = byteVector0.putUTF8("hi!");
        org.mockito.asm.ByteVector byteVector4 = byteVector0.putLong((long) (short) 1);
        org.mockito.asm.ByteVector byteVector6 = byteVector4.putShort((int) (byte) -1);
        org.mockito.asm.ByteVector byteVector8 = byteVector4.putUTF8("");
        java.lang.Class<?> wildcardClass9 = byteVector4.getClass();
        org.junit.Assert.assertNotNull(byteVector2);
        org.junit.Assert.assertNotNull(byteVector4);
        org.junit.Assert.assertNotNull(byteVector6);
        org.junit.Assert.assertNotNull(byteVector8);
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test1177() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1177");
        org.mockito.asm.ByteVector byteVector1 = new org.mockito.asm.ByteVector((int) '#');
        org.mockito.asm.ByteVector byteVector3 = byteVector1.putLong(100L);
        org.mockito.asm.ByteVector byteVector5 = byteVector1.putUTF8("");
        org.mockito.asm.ByteVector byteVector7 = byteVector5.putInt((int) (byte) 10);
        org.mockito.asm.ByteVector byteVector9 = byteVector7.putByte((int) '#');
        org.mockito.asm.ByteVector byteVector11 = byteVector9.putInt((int) (short) 0);
        org.mockito.asm.ByteVector byteVector13 = byteVector9.putLong((long) '4');
        org.junit.Assert.assertNotNull(byteVector3);
        org.junit.Assert.assertNotNull(byteVector5);
        org.junit.Assert.assertNotNull(byteVector7);
        org.junit.Assert.assertNotNull(byteVector9);
        org.junit.Assert.assertNotNull(byteVector11);
        org.junit.Assert.assertNotNull(byteVector13);
    }

    @Test
    public void test1178() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1178");
        org.mockito.asm.ByteVector byteVector0 = new org.mockito.asm.ByteVector();
        org.mockito.asm.ByteVector byteVector2 = byteVector0.putUTF8("hi!");
        org.mockito.asm.ByteVector byteVector4 = byteVector2.putLong((long) (byte) 10);
        org.mockito.asm.ByteVector byteVector6 = byteVector4.putInt((int) 'a');
        org.mockito.asm.ByteVector byteVector8 = byteVector4.putByte((int) ' ');
        org.junit.Assert.assertNotNull(byteVector2);
        org.junit.Assert.assertNotNull(byteVector4);
        org.junit.Assert.assertNotNull(byteVector6);
        org.junit.Assert.assertNotNull(byteVector8);
    }

    @Test
    public void test1179() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1179");
        org.mockito.asm.ByteVector byteVector1 = new org.mockito.asm.ByteVector((int) '#');
        org.mockito.asm.ByteVector byteVector3 = byteVector1.putInt(100);
        org.mockito.asm.ByteVector byteVector5 = byteVector3.putByte((-1));
        org.mockito.asm.ByteVector byteVector7 = byteVector5.putInt((int) 'a');
        org.mockito.asm.ByteVector byteVector9 = byteVector7.putByte((int) (byte) 1);
        org.mockito.asm.ByteVector byteVector11 = byteVector7.putInt((int) '4');
        org.junit.Assert.assertNotNull(byteVector3);
        org.junit.Assert.assertNotNull(byteVector5);
        org.junit.Assert.assertNotNull(byteVector7);
        org.junit.Assert.assertNotNull(byteVector9);
        org.junit.Assert.assertNotNull(byteVector11);
    }

    @Test
    public void test1180() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1180");
        org.mockito.asm.ByteVector byteVector0 = new org.mockito.asm.ByteVector();
        org.mockito.asm.ByteVector byteVector2 = byteVector0.putUTF8("hi!");
        org.mockito.asm.ByteVector byteVector4 = byteVector0.putInt(0);
        org.mockito.asm.ByteVector byteVector6 = byteVector4.putInt((int) ' ');
        org.mockito.asm.ByteVector byteVector8 = byteVector6.putLong((long) (short) 10);
        org.mockito.asm.ByteVector byteVector10 = byteVector8.putUTF8("hi!");
        org.mockito.asm.ByteVector byteVector12 = byteVector8.putByte((-1));
        org.mockito.asm.ByteVector byteVector14 = byteVector8.putShort((int) 'a');
        org.mockito.asm.ByteVector byteVector16 = byteVector8.putLong((long) (short) 10);
        org.mockito.asm.ByteVector byteVector18 = byteVector16.putUTF8("hi!");
        org.mockito.asm.ByteVector byteVector20 = byteVector16.putShort((int) (byte) 0);
        org.mockito.asm.ByteVector byteVector22 = byteVector16.putByte(1);
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
    public void test1181() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1181");
        org.mockito.asm.ByteVector byteVector1 = new org.mockito.asm.ByteVector((int) '#');
        org.mockito.asm.ByteVector byteVector3 = byteVector1.putLong(100L);
        org.mockito.asm.ByteVector byteVector5 = byteVector3.putLong(1L);
        org.mockito.asm.ByteVector byteVector7 = byteVector5.putUTF8("hi!");
        org.mockito.asm.ByteVector byteVector9 = byteVector7.putUTF8("");
        org.mockito.asm.ByteVector byteVector11 = byteVector7.putInt((int) (short) 100);
        org.mockito.asm.ByteVector byteVector13 = byteVector11.putByte((int) (byte) 100);
        org.mockito.asm.ByteVector byteVector15 = byteVector13.putByte((int) (byte) 100);
        org.mockito.asm.ByteVector byteVector17 = byteVector15.putByte(1);
        org.junit.Assert.assertNotNull(byteVector3);
        org.junit.Assert.assertNotNull(byteVector5);
        org.junit.Assert.assertNotNull(byteVector7);
        org.junit.Assert.assertNotNull(byteVector9);
        org.junit.Assert.assertNotNull(byteVector11);
        org.junit.Assert.assertNotNull(byteVector13);
        org.junit.Assert.assertNotNull(byteVector15);
        org.junit.Assert.assertNotNull(byteVector17);
    }

    @Test
    public void test1182() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1182");
        org.mockito.asm.ByteVector byteVector0 = new org.mockito.asm.ByteVector();
        org.mockito.asm.ByteVector byteVector2 = byteVector0.putUTF8("hi!");
        org.mockito.asm.ByteVector byteVector4 = byteVector2.putLong((long) (byte) 10);
        org.mockito.asm.ByteVector byteVector6 = byteVector4.putUTF8("hi!");
        org.mockito.asm.ByteVector byteVector8 = byteVector4.putLong((long) 10);
        org.mockito.asm.ByteVector byteVector10 = byteVector8.putLong(0L);
        org.mockito.asm.ByteVector byteVector12 = byteVector10.putUTF8("hi!");
        org.mockito.asm.ByteVector byteVector14 = byteVector12.putInt(1);
        org.mockito.asm.ByteVector byteVector16 = byteVector14.putShort(1);
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
    public void test1183() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1183");
        org.mockito.asm.ByteVector byteVector0 = new org.mockito.asm.ByteVector();
        org.mockito.asm.ByteVector byteVector2 = byteVector0.putUTF8("hi!");
        org.mockito.asm.ByteVector byteVector4 = byteVector0.putLong((long) ' ');
        org.mockito.asm.ByteVector byteVector6 = byteVector4.putByte((int) 'a');
        org.mockito.asm.ByteVector byteVector8 = byteVector4.putByte((int) (short) -1);
        org.mockito.asm.ByteVector byteVector10 = byteVector4.putLong(0L);
        org.mockito.asm.ByteVector byteVector12 = byteVector4.putUTF8("hi!");
        org.mockito.asm.ByteVector byteVector14 = byteVector12.putLong((long) '4');
        org.mockito.asm.ByteVector byteVector16 = byteVector14.putShort((int) ' ');
        org.mockito.asm.ByteVector byteVector18 = byteVector14.putByte(10);
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
    public void test1184() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1184");
        org.mockito.asm.ByteVector byteVector1 = new org.mockito.asm.ByteVector((int) (byte) 100);
        org.mockito.asm.ByteVector byteVector3 = byteVector1.putShort((int) (short) 100);
        org.mockito.asm.ByteVector byteVector5 = byteVector3.putShort((int) (byte) -1);
        org.mockito.asm.ByteVector byteVector7 = byteVector3.putLong((long) (short) 10);
        org.mockito.asm.ByteVector byteVector9 = byteVector3.putInt((int) (byte) 1);
        org.mockito.asm.ByteVector byteVector11 = byteVector3.putShort((int) (short) 0);
        org.junit.Assert.assertNotNull(byteVector3);
        org.junit.Assert.assertNotNull(byteVector5);
        org.junit.Assert.assertNotNull(byteVector7);
        org.junit.Assert.assertNotNull(byteVector9);
        org.junit.Assert.assertNotNull(byteVector11);
    }

    @Test
    public void test1185() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1185");
        org.mockito.asm.ByteVector byteVector0 = new org.mockito.asm.ByteVector();
        org.mockito.asm.ByteVector byteVector2 = byteVector0.putUTF8("hi!");
        org.mockito.asm.ByteVector byteVector4 = byteVector0.putLong((long) (short) 1);
        org.mockito.asm.ByteVector byteVector6 = byteVector4.putUTF8("");
        org.mockito.asm.ByteVector byteVector8 = byteVector6.putShort((int) (short) 0);
        org.mockito.asm.ByteVector byteVector10 = byteVector6.putByte((int) ' ');
        org.mockito.asm.ByteVector byteVector12 = byteVector6.putShort(100);
        org.mockito.asm.ByteVector byteVector14 = byteVector12.putInt((int) '#');
        org.junit.Assert.assertNotNull(byteVector2);
        org.junit.Assert.assertNotNull(byteVector4);
        org.junit.Assert.assertNotNull(byteVector6);
        org.junit.Assert.assertNotNull(byteVector8);
        org.junit.Assert.assertNotNull(byteVector10);
        org.junit.Assert.assertNotNull(byteVector12);
        org.junit.Assert.assertNotNull(byteVector14);
    }

    @Test
    public void test1186() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1186");
        org.mockito.asm.ByteVector byteVector0 = new org.mockito.asm.ByteVector();
        org.mockito.asm.ByteVector byteVector2 = byteVector0.putUTF8("hi!");
        org.mockito.asm.ByteVector byteVector4 = byteVector2.putInt(0);
        org.mockito.asm.ByteVector byteVector6 = byteVector4.putByte((int) (byte) 1);
        org.mockito.asm.ByteVector byteVector8 = byteVector4.putByte(0);
        org.mockito.asm.ByteVector byteVector10 = byteVector8.putLong((long) (byte) 1);
        org.mockito.asm.ByteVector byteVector12 = byteVector10.putShort((int) '#');
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
    public void test1187() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1187");
        org.mockito.asm.ByteVector byteVector0 = new org.mockito.asm.ByteVector();
        org.mockito.asm.ByteVector byteVector2 = byteVector0.putUTF8("hi!");
        org.mockito.asm.ByteVector byteVector4 = byteVector0.putInt(0);
        org.mockito.asm.ByteVector byteVector6 = byteVector4.putInt((int) ' ');
        org.mockito.asm.ByteVector byteVector8 = byteVector6.putLong(100L);
        org.mockito.asm.ByteVector byteVector10 = byteVector6.putByte((int) (short) 100);
        org.mockito.asm.ByteVector byteVector12 = byteVector6.putShort(0);
        org.junit.Assert.assertNotNull(byteVector2);
        org.junit.Assert.assertNotNull(byteVector4);
        org.junit.Assert.assertNotNull(byteVector6);
        org.junit.Assert.assertNotNull(byteVector8);
        org.junit.Assert.assertNotNull(byteVector10);
        org.junit.Assert.assertNotNull(byteVector12);
    }

    @Test
    public void test1188() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1188");
        org.mockito.asm.ByteVector byteVector1 = new org.mockito.asm.ByteVector((int) (byte) 10);
        org.mockito.asm.ByteVector byteVector3 = byteVector1.putByte((int) '4');
        org.mockito.asm.ByteVector byteVector5 = byteVector1.putLong(0L);
        org.mockito.asm.ByteVector byteVector7 = byteVector5.putByte(10);
        org.mockito.asm.ByteVector byteVector9 = byteVector5.putShort(0);
        org.mockito.asm.ByteVector byteVector11 = new org.mockito.asm.ByteVector((int) (byte) 10);
        org.mockito.asm.ByteVector byteVector13 = byteVector11.putByte((int) '4');
        org.mockito.asm.ByteVector byteVector15 = byteVector11.putLong((long) 'a');
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
        org.mockito.asm.ByteVector byteVector56 = byteVector15.putByteArray(byteArray47, 0, 0);
        // The following exception was thrown during execution in test generation
        try {
            org.mockito.asm.ByteVector byteVector59 = byteVector9.putByteArray(byteArray47, (int) (byte) 100, (int) (byte) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteVector3);
        org.junit.Assert.assertNotNull(byteVector5);
        org.junit.Assert.assertNotNull(byteVector7);
        org.junit.Assert.assertNotNull(byteVector9);
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
        org.junit.Assert.assertNotNull(byteArray47);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray47), "[0, 10, 1]");
        org.junit.Assert.assertNotNull(byteVector50);
        org.junit.Assert.assertNotNull(byteVector53);
        org.junit.Assert.assertNotNull(byteVector56);
    }

    @Test
    public void test1189() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1189");
        org.mockito.asm.ByteVector byteVector0 = new org.mockito.asm.ByteVector();
        org.mockito.asm.ByteVector byteVector2 = byteVector0.putUTF8("hi!");
        org.mockito.asm.ByteVector byteVector4 = byteVector0.putShort((int) (byte) 100);
        org.mockito.asm.ByteVector byteVector6 = byteVector0.putLong((-1L));
        org.mockito.asm.ByteVector byteVector8 = byteVector6.putLong(0L);
        org.junit.Assert.assertNotNull(byteVector2);
        org.junit.Assert.assertNotNull(byteVector4);
        org.junit.Assert.assertNotNull(byteVector6);
        org.junit.Assert.assertNotNull(byteVector8);
    }

    @Test
    public void test1190() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1190");
        org.mockito.asm.ByteVector byteVector0 = new org.mockito.asm.ByteVector();
        org.mockito.asm.ByteVector byteVector2 = byteVector0.putUTF8("hi!");
        org.mockito.asm.ByteVector byteVector4 = byteVector0.putShort((int) (short) -1);
        org.mockito.asm.ByteVector byteVector6 = byteVector0.putByte((int) ' ');
        org.mockito.asm.ByteVector byteVector8 = byteVector0.putLong((long) (byte) 0);
        org.mockito.asm.ByteVector byteVector10 = byteVector0.putByte((int) (byte) 1);
        java.lang.Class<?> wildcardClass11 = byteVector0.getClass();
        org.junit.Assert.assertNotNull(byteVector2);
        org.junit.Assert.assertNotNull(byteVector4);
        org.junit.Assert.assertNotNull(byteVector6);
        org.junit.Assert.assertNotNull(byteVector8);
        org.junit.Assert.assertNotNull(byteVector10);
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test1191() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1191");
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
        org.mockito.asm.ByteVector byteVector20 = byteVector16.putByte((int) (byte) 0);
        org.mockito.asm.ByteVector byteVector22 = byteVector20.putInt((int) '#');
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
    public void test1192() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1192");
        org.mockito.asm.ByteVector byteVector0 = new org.mockito.asm.ByteVector();
        org.mockito.asm.ByteVector byteVector2 = byteVector0.putUTF8("hi!");
        org.mockito.asm.ByteVector byteVector4 = byteVector0.putByte((int) (byte) 1);
        org.mockito.asm.ByteVector byteVector6 = byteVector0.putLong((long) (short) 1);
        org.mockito.asm.ByteVector byteVector8 = byteVector0.putLong((long) ' ');
        org.mockito.asm.ByteVector byteVector10 = byteVector0.putUTF8("");
        org.mockito.asm.ByteVector byteVector12 = byteVector10.putInt((int) (short) 0);
        org.junit.Assert.assertNotNull(byteVector2);
        org.junit.Assert.assertNotNull(byteVector4);
        org.junit.Assert.assertNotNull(byteVector6);
        org.junit.Assert.assertNotNull(byteVector8);
        org.junit.Assert.assertNotNull(byteVector10);
        org.junit.Assert.assertNotNull(byteVector12);
    }

    @Test
    public void test1193() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1193");
        org.mockito.asm.ByteVector byteVector0 = new org.mockito.asm.ByteVector();
        org.mockito.asm.ByteVector byteVector2 = byteVector0.putUTF8("hi!");
        org.mockito.asm.ByteVector byteVector4 = byteVector0.putInt(0);
        org.mockito.asm.ByteVector byteVector6 = byteVector4.putInt((int) ' ');
        org.mockito.asm.ByteVector byteVector8 = byteVector6.putLong((long) (short) 10);
        org.mockito.asm.ByteVector byteVector10 = byteVector8.putUTF8("hi!");
        org.mockito.asm.ByteVector byteVector12 = byteVector10.putLong((long) (byte) 1);
        org.junit.Assert.assertNotNull(byteVector2);
        org.junit.Assert.assertNotNull(byteVector4);
        org.junit.Assert.assertNotNull(byteVector6);
        org.junit.Assert.assertNotNull(byteVector8);
        org.junit.Assert.assertNotNull(byteVector10);
        org.junit.Assert.assertNotNull(byteVector12);
    }

    @Test
    public void test1194() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1194");
        org.mockito.asm.ByteVector byteVector0 = new org.mockito.asm.ByteVector();
        org.mockito.asm.ByteVector byteVector2 = byteVector0.putUTF8("hi!");
        org.mockito.asm.ByteVector byteVector4 = byteVector2.putInt(0);
        org.mockito.asm.ByteVector byteVector6 = byteVector4.putByte((int) (short) 0);
        org.mockito.asm.ByteVector byteVector8 = byteVector4.putUTF8("");
        org.mockito.asm.ByteVector byteVector10 = byteVector4.putUTF8("hi!");
        java.lang.Class<?> wildcardClass11 = byteVector4.getClass();
        org.junit.Assert.assertNotNull(byteVector2);
        org.junit.Assert.assertNotNull(byteVector4);
        org.junit.Assert.assertNotNull(byteVector6);
        org.junit.Assert.assertNotNull(byteVector8);
        org.junit.Assert.assertNotNull(byteVector10);
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test1195() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1195");
        org.mockito.asm.ByteVector byteVector1 = new org.mockito.asm.ByteVector((int) '#');
        org.mockito.asm.ByteVector byteVector3 = byteVector1.putInt(100);
        org.mockito.asm.ByteVector byteVector5 = byteVector1.putInt(0);
        org.mockito.asm.ByteVector byteVector7 = byteVector5.putShort((int) (short) 0);
        org.mockito.asm.ByteVector byteVector9 = byteVector7.putShort(0);
        org.mockito.asm.ByteVector byteVector11 = byteVector7.putShort(10);
        java.lang.Class<?> wildcardClass12 = byteVector11.getClass();
        org.junit.Assert.assertNotNull(byteVector3);
        org.junit.Assert.assertNotNull(byteVector5);
        org.junit.Assert.assertNotNull(byteVector7);
        org.junit.Assert.assertNotNull(byteVector9);
        org.junit.Assert.assertNotNull(byteVector11);
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test1196() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1196");
        org.mockito.asm.ByteVector byteVector0 = new org.mockito.asm.ByteVector();
        org.mockito.asm.ByteVector byteVector2 = byteVector0.putUTF8("hi!");
        org.mockito.asm.ByteVector byteVector4 = byteVector2.putLong((long) (byte) 10);
        org.mockito.asm.ByteVector byteVector6 = byteVector4.putUTF8("hi!");
        org.mockito.asm.ByteVector byteVector8 = byteVector4.putLong((-1L));
        org.mockito.asm.ByteVector byteVector10 = byteVector8.putInt(10);
        org.mockito.asm.ByteVector byteVector12 = byteVector8.putShort((int) (byte) 0);
        org.mockito.asm.ByteVector byteVector14 = byteVector8.putShort((int) 'a');
        org.mockito.asm.ByteVector byteVector16 = byteVector14.putByte((int) (short) 10);
        org.mockito.asm.ByteVector byteVector18 = byteVector14.putInt((int) 'a');
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
    public void test1197() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1197");
        org.mockito.asm.ByteVector byteVector0 = new org.mockito.asm.ByteVector();
        org.mockito.asm.ByteVector byteVector2 = byteVector0.putUTF8("hi!");
        org.mockito.asm.ByteVector byteVector4 = byteVector0.putInt(0);
        org.mockito.asm.ByteVector byteVector6 = byteVector4.putInt((int) ' ');
        org.mockito.asm.ByteVector byteVector8 = byteVector6.putLong((long) (short) 10);
        org.mockito.asm.ByteVector byteVector10 = byteVector8.putUTF8("hi!");
        org.mockito.asm.ByteVector byteVector12 = byteVector8.putByte((-1));
        org.mockito.asm.ByteVector byteVector14 = byteVector8.putShort((int) 'a');
        org.mockito.asm.ByteVector byteVector16 = byteVector8.putLong((long) (short) 10);
        org.mockito.asm.ByteVector byteVector18 = byteVector16.putUTF8("hi!");
        org.mockito.asm.ByteVector byteVector20 = byteVector16.putShort((int) (byte) 0);
        org.mockito.asm.ByteVector byteVector22 = byteVector20.putInt((int) (byte) 1);
        org.mockito.asm.ByteVector byteVector24 = byteVector22.putByte((int) (short) 1);
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
    public void test1198() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1198");
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
        org.mockito.asm.ByteVector byteVector20 = byteVector18.putUTF8("hi!");
        org.mockito.asm.ByteVector byteVector22 = byteVector18.putInt((int) (byte) 0);
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
    public void test1199() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1199");
        org.mockito.asm.ByteVector byteVector0 = new org.mockito.asm.ByteVector();
        org.mockito.asm.ByteVector byteVector2 = byteVector0.putUTF8("hi!");
        org.mockito.asm.ByteVector byteVector4 = byteVector2.putLong((long) (byte) 10);
        org.mockito.asm.ByteVector byteVector6 = byteVector2.putInt((int) (short) 1);
        org.mockito.asm.ByteVector byteVector8 = byteVector2.putLong((long) (short) 10);
        org.mockito.asm.ByteVector byteVector10 = byteVector2.putShort(10);
        org.mockito.asm.ByteVector byteVector12 = byteVector10.putInt((int) (byte) 0);
        org.mockito.asm.ByteVector byteVector14 = byteVector12.putUTF8("");
        org.mockito.asm.ByteVector byteVector16 = byteVector14.putUTF8("hi!");
        org.mockito.asm.ByteVector byteVector18 = byteVector14.putUTF8("");
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
    public void test1200() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1200");
        org.mockito.asm.ByteVector byteVector0 = new org.mockito.asm.ByteVector();
        org.mockito.asm.ByteVector byteVector2 = byteVector0.putUTF8("hi!");
        org.mockito.asm.ByteVector byteVector4 = byteVector2.putLong((long) (byte) 10);
        org.mockito.asm.ByteVector byteVector6 = byteVector4.putInt((int) 'a');
        org.mockito.asm.ByteVector byteVector8 = byteVector6.putShort((int) (byte) 0);
        org.mockito.asm.ByteVector byteVector10 = byteVector8.putShort((int) (byte) 100);
        org.mockito.asm.ByteVector byteVector12 = new org.mockito.asm.ByteVector((int) (byte) 10);
        org.mockito.asm.ByteVector byteVector14 = byteVector12.putByte((int) '4');
        org.mockito.asm.ByteVector byteVector16 = byteVector12.putLong((long) 'a');
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
        org.mockito.asm.ByteVector byteVector57 = byteVector16.putByteArray(byteArray48, 0, 0);
        // The following exception was thrown during execution in test generation
        try {
            org.mockito.asm.ByteVector byteVector60 = byteVector10.putByteArray(byteArray48, 0, (int) (byte) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteVector2);
        org.junit.Assert.assertNotNull(byteVector4);
        org.junit.Assert.assertNotNull(byteVector6);
        org.junit.Assert.assertNotNull(byteVector8);
        org.junit.Assert.assertNotNull(byteVector10);
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
    public void test1201() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1201");
        org.mockito.asm.ByteVector byteVector1 = new org.mockito.asm.ByteVector((int) (byte) 100);
        org.mockito.asm.ByteVector byteVector3 = byteVector1.putInt(0);
        org.mockito.asm.ByteVector byteVector5 = byteVector3.putLong((long) (short) 100);
        java.lang.Class<?> wildcardClass6 = byteVector5.getClass();
        org.junit.Assert.assertNotNull(byteVector3);
        org.junit.Assert.assertNotNull(byteVector5);
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void test1202() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1202");
        org.mockito.asm.ByteVector byteVector0 = new org.mockito.asm.ByteVector();
        org.mockito.asm.ByteVector byteVector2 = byteVector0.putUTF8("hi!");
        org.mockito.asm.ByteVector byteVector4 = byteVector2.putInt(0);
        org.mockito.asm.ByteVector byteVector6 = byteVector2.putByte((int) (byte) 10);
        org.mockito.asm.ByteVector byteVector8 = byteVector6.putUTF8("hi!");
        org.mockito.asm.ByteVector byteVector10 = byteVector8.putShort(0);
        org.mockito.asm.ByteVector byteVector12 = byteVector10.putLong(10L);
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
    public void test1203() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1203");
        org.mockito.asm.ByteVector byteVector0 = new org.mockito.asm.ByteVector();
        org.mockito.asm.ByteVector byteVector2 = byteVector0.putUTF8("hi!");
        org.mockito.asm.ByteVector byteVector4 = byteVector0.putLong((long) ' ');
        org.mockito.asm.ByteVector byteVector6 = byteVector4.putByte((int) 'a');
        org.mockito.asm.ByteVector byteVector8 = byteVector4.putByte((int) (short) -1);
        org.mockito.asm.ByteVector byteVector10 = byteVector8.putUTF8("hi!");
        org.junit.Assert.assertNotNull(byteVector2);
        org.junit.Assert.assertNotNull(byteVector4);
        org.junit.Assert.assertNotNull(byteVector6);
        org.junit.Assert.assertNotNull(byteVector8);
        org.junit.Assert.assertNotNull(byteVector10);
    }

    @Test
    public void test1204() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1204");
        org.mockito.asm.ByteVector byteVector1 = new org.mockito.asm.ByteVector((int) '#');
        org.mockito.asm.ByteVector byteVector3 = byteVector1.putInt(100);
        org.mockito.asm.ByteVector byteVector5 = byteVector3.putShort((int) (short) -1);
        org.mockito.asm.ByteVector byteVector7 = byteVector5.putShort((int) (short) 0);
        org.mockito.asm.ByteVector byteVector9 = byteVector5.putUTF8("");
        org.mockito.asm.ByteVector byteVector11 = byteVector9.putByte((int) (short) 100);
        org.mockito.asm.ByteVector byteVector13 = byteVector9.putLong((long) (byte) 0);
        org.mockito.asm.ByteVector byteVector15 = byteVector13.putUTF8("hi!");
        org.junit.Assert.assertNotNull(byteVector3);
        org.junit.Assert.assertNotNull(byteVector5);
        org.junit.Assert.assertNotNull(byteVector7);
        org.junit.Assert.assertNotNull(byteVector9);
        org.junit.Assert.assertNotNull(byteVector11);
        org.junit.Assert.assertNotNull(byteVector13);
        org.junit.Assert.assertNotNull(byteVector15);
    }

    @Test
    public void test1205() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1205");
        org.mockito.asm.ByteVector byteVector0 = new org.mockito.asm.ByteVector();
        org.mockito.asm.ByteVector byteVector2 = byteVector0.putUTF8("hi!");
        org.mockito.asm.ByteVector byteVector4 = byteVector0.putInt(0);
        org.mockito.asm.ByteVector byteVector6 = byteVector0.putShort((int) '4');
        org.mockito.asm.ByteVector byteVector8 = byteVector6.putInt((int) (short) 0);
        org.mockito.asm.ByteVector byteVector10 = byteVector8.putShort((int) (byte) 0);
        org.mockito.asm.ByteVector byteVector12 = byteVector8.putByte(1);
        org.mockito.asm.ByteVector byteVector14 = byteVector8.putInt((int) (short) -1);
        org.junit.Assert.assertNotNull(byteVector2);
        org.junit.Assert.assertNotNull(byteVector4);
        org.junit.Assert.assertNotNull(byteVector6);
        org.junit.Assert.assertNotNull(byteVector8);
        org.junit.Assert.assertNotNull(byteVector10);
        org.junit.Assert.assertNotNull(byteVector12);
        org.junit.Assert.assertNotNull(byteVector14);
    }

    @Test
    public void test1206() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1206");
        org.mockito.asm.ByteVector byteVector1 = new org.mockito.asm.ByteVector((int) '#');
        org.mockito.asm.ByteVector byteVector3 = byteVector1.putUTF8("hi!");
        org.mockito.asm.ByteVector byteVector5 = byteVector1.putInt((int) ' ');
        org.mockito.asm.ByteVector byteVector6 = new org.mockito.asm.ByteVector();
        org.mockito.asm.ByteVector byteVector8 = byteVector6.putUTF8("hi!");
        org.mockito.asm.ByteVector byteVector10 = byteVector8.putLong((long) (byte) 10);
        org.mockito.asm.ByteVector byteVector12 = byteVector10.putUTF8("hi!");
        org.mockito.asm.ByteVector byteVector14 = byteVector10.putLong((long) 10);
        org.mockito.asm.ByteVector byteVector16 = byteVector14.putLong(0L);
        org.mockito.asm.ByteVector byteVector18 = byteVector16.putShort((int) (byte) -1);
        org.mockito.asm.ByteVector byteVector20 = byteVector16.putInt((-1));
        org.mockito.asm.ByteVector byteVector22 = byteVector16.putByte((int) (byte) 100);
        org.mockito.asm.ByteVector byteVector24 = new org.mockito.asm.ByteVector((int) '#');
        org.mockito.asm.ByteVector byteVector26 = byteVector24.putInt(100);
        org.mockito.asm.ByteVector byteVector28 = byteVector24.putUTF8("");
        org.mockito.asm.ByteVector byteVector29 = new org.mockito.asm.ByteVector();
        org.mockito.asm.ByteVector byteVector31 = byteVector29.putUTF8("hi!");
        org.mockito.asm.ByteVector byteVector33 = byteVector31.putInt(0);
        org.mockito.asm.ByteVector byteVector35 = byteVector33.putByte((int) (short) 0);
        org.mockito.asm.ByteVector byteVector37 = byteVector33.putUTF8("");
        org.mockito.asm.ByteVector byteVector38 = new org.mockito.asm.ByteVector();
        org.mockito.asm.ByteVector byteVector40 = byteVector38.putUTF8("hi!");
        org.mockito.asm.ByteVector byteVector42 = byteVector38.putInt(0);
        org.mockito.asm.ByteVector byteVector44 = byteVector38.putShort((int) '4');
        org.mockito.asm.ByteVector byteVector46 = byteVector38.putByte(100);
        org.mockito.asm.ByteVector byteVector48 = byteVector46.putInt((int) (byte) 10);
        org.mockito.asm.ByteVector byteVector50 = byteVector46.putInt((int) (byte) 10);
        org.mockito.asm.ByteVector byteVector52 = byteVector50.putByte(100);
        org.mockito.asm.ByteVector byteVector53 = new org.mockito.asm.ByteVector();
        org.mockito.asm.ByteVector byteVector55 = byteVector53.putUTF8("hi!");
        org.mockito.asm.ByteVector byteVector57 = byteVector53.putInt(0);
        org.mockito.asm.ByteVector byteVector59 = byteVector57.putInt((int) ' ');
        org.mockito.asm.ByteVector byteVector61 = byteVector59.putLong(100L);
        byte[] byteArray65 = new byte[] { (byte) 0, (byte) 10, (byte) 1 };
        org.mockito.asm.ByteVector byteVector68 = byteVector59.putByteArray(byteArray65, 0, 0);
        org.mockito.asm.ByteVector byteVector71 = byteVector52.putByteArray(byteArray65, (int) (byte) 1, (int) (byte) 0);
        org.mockito.asm.ByteVector byteVector74 = byteVector33.putByteArray(byteArray65, (int) (short) 0, 0);
        org.mockito.asm.ByteVector byteVector77 = byteVector28.putByteArray(byteArray65, (int) (byte) 0, (int) (short) 1);
        org.mockito.asm.ByteVector byteVector80 = byteVector16.putByteArray(byteArray65, (int) (byte) 1, (int) (byte) 0);
        // The following exception was thrown during execution in test generation
        try {
            org.mockito.asm.ByteVector byteVector83 = byteVector5.putByteArray(byteArray65, (int) (short) -1, (int) ' ');
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
        org.junit.Assert.assertNotNull(byteVector26);
        org.junit.Assert.assertNotNull(byteVector28);
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
        org.junit.Assert.assertNotNull(byteVector55);
        org.junit.Assert.assertNotNull(byteVector57);
        org.junit.Assert.assertNotNull(byteVector59);
        org.junit.Assert.assertNotNull(byteVector61);
        org.junit.Assert.assertNotNull(byteArray65);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray65), "[0, 10, 1]");
        org.junit.Assert.assertNotNull(byteVector68);
        org.junit.Assert.assertNotNull(byteVector71);
        org.junit.Assert.assertNotNull(byteVector74);
        org.junit.Assert.assertNotNull(byteVector77);
        org.junit.Assert.assertNotNull(byteVector80);
    }

    @Test
    public void test1207() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1207");
        org.mockito.asm.ByteVector byteVector0 = new org.mockito.asm.ByteVector();
        org.mockito.asm.ByteVector byteVector2 = byteVector0.putUTF8("hi!");
        org.mockito.asm.ByteVector byteVector4 = byteVector2.putLong((long) (byte) 10);
        org.mockito.asm.ByteVector byteVector6 = byteVector4.putUTF8("hi!");
        org.mockito.asm.ByteVector byteVector8 = byteVector4.putLong((long) (short) -1);
        org.mockito.asm.ByteVector byteVector10 = byteVector8.putInt(10);
        org.mockito.asm.ByteVector byteVector12 = byteVector8.putByte((int) (short) 1);
        org.mockito.asm.ByteVector byteVector14 = byteVector12.putShort((int) (short) 100);
        org.mockito.asm.ByteVector byteVector16 = byteVector12.putShort((int) (short) 100);
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
            org.mockito.asm.ByteVector byteVector66 = byteVector16.putByteArray(byteArray57, (int) (short) -1, (int) '4');
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
    public void test1208() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1208");
        org.mockito.asm.ByteVector byteVector0 = new org.mockito.asm.ByteVector();
        org.mockito.asm.ByteVector byteVector2 = byteVector0.putUTF8("hi!");
        org.mockito.asm.ByteVector byteVector4 = byteVector0.putShort((int) (short) -1);
        org.mockito.asm.ByteVector byteVector6 = byteVector0.putInt(0);
        org.mockito.asm.ByteVector byteVector8 = byteVector0.putUTF8("hi!");
        org.mockito.asm.ByteVector byteVector10 = byteVector0.putByte(100);
        org.mockito.asm.ByteVector byteVector12 = byteVector10.putUTF8("hi!");
        org.mockito.asm.ByteVector byteVector14 = byteVector10.putUTF8("hi!");
        org.mockito.asm.ByteVector byteVector16 = byteVector10.putByte(1);
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
    public void test1209() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1209");
        org.mockito.asm.ByteVector byteVector0 = new org.mockito.asm.ByteVector();
        org.mockito.asm.ByteVector byteVector2 = byteVector0.putUTF8("hi!");
        org.mockito.asm.ByteVector byteVector4 = byteVector0.putInt(0);
        org.mockito.asm.ByteVector byteVector6 = byteVector4.putInt((int) ' ');
        org.mockito.asm.ByteVector byteVector8 = byteVector6.putLong((long) (short) 10);
        org.mockito.asm.ByteVector byteVector10 = byteVector8.putUTF8("hi!");
        org.mockito.asm.ByteVector byteVector12 = byteVector8.putByte(0);
        org.mockito.asm.ByteVector byteVector14 = byteVector12.putInt((int) (short) 1);
        org.mockito.asm.ByteVector byteVector16 = byteVector12.putLong((-1L));
        org.mockito.asm.ByteVector byteVector18 = byteVector16.putUTF8("");
        org.mockito.asm.ByteVector byteVector20 = byteVector16.putInt((int) (short) -1);
        org.mockito.asm.ByteVector byteVector22 = byteVector16.putLong(0L);
        org.mockito.asm.ByteVector byteVector24 = byteVector16.putInt((int) '4');
        org.mockito.asm.ByteVector byteVector26 = byteVector16.putLong((long) 1);
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
    public void test1210() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1210");
        org.mockito.asm.ByteVector byteVector1 = new org.mockito.asm.ByteVector((int) '#');
        org.mockito.asm.ByteVector byteVector3 = byteVector1.putInt(100);
        org.mockito.asm.ByteVector byteVector5 = byteVector1.putUTF8("");
        org.mockito.asm.ByteVector byteVector7 = byteVector1.putUTF8("");
        java.lang.Class<?> wildcardClass8 = byteVector1.getClass();
        org.junit.Assert.assertNotNull(byteVector3);
        org.junit.Assert.assertNotNull(byteVector5);
        org.junit.Assert.assertNotNull(byteVector7);
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test1211() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1211");
        org.mockito.asm.ByteVector byteVector1 = new org.mockito.asm.ByteVector((int) '#');
        org.mockito.asm.ByteVector byteVector3 = byteVector1.putInt(100);
        org.mockito.asm.ByteVector byteVector5 = byteVector1.putInt((int) (byte) 1);
        org.mockito.asm.ByteVector byteVector7 = byteVector5.putLong(10L);
        org.mockito.asm.ByteVector byteVector9 = byteVector7.putByte((int) 'a');
        org.mockito.asm.ByteVector byteVector11 = byteVector7.putInt((int) (byte) 10);
        org.junit.Assert.assertNotNull(byteVector3);
        org.junit.Assert.assertNotNull(byteVector5);
        org.junit.Assert.assertNotNull(byteVector7);
        org.junit.Assert.assertNotNull(byteVector9);
        org.junit.Assert.assertNotNull(byteVector11);
    }

    @Test
    public void test1212() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1212");
        org.mockito.asm.ByteVector byteVector0 = new org.mockito.asm.ByteVector();
        org.mockito.asm.ByteVector byteVector2 = byteVector0.putUTF8("hi!");
        org.mockito.asm.ByteVector byteVector4 = byteVector0.putLong((long) ' ');
        org.mockito.asm.ByteVector byteVector6 = byteVector4.putByte((int) 'a');
        org.mockito.asm.ByteVector byteVector8 = byteVector4.putByte((int) (short) -1);
        org.mockito.asm.ByteVector byteVector10 = byteVector4.putLong(0L);
        org.mockito.asm.ByteVector byteVector12 = byteVector4.putUTF8("hi!");
        org.mockito.asm.ByteVector byteVector14 = byteVector12.putUTF8("hi!");
        org.mockito.asm.ByteVector byteVector16 = byteVector12.putShort((int) '#');
        org.mockito.asm.ByteVector byteVector18 = byteVector16.putShort((int) (short) 100);
        org.mockito.asm.ByteVector byteVector20 = byteVector18.putByte((int) (byte) -1);
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
    public void test1213() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1213");
        org.mockito.asm.ByteVector byteVector0 = new org.mockito.asm.ByteVector();
        org.mockito.asm.ByteVector byteVector2 = byteVector0.putUTF8("hi!");
        org.mockito.asm.ByteVector byteVector4 = byteVector2.putInt(0);
        org.mockito.asm.ByteVector byteVector6 = byteVector2.putByte((int) (byte) 10);
        org.mockito.asm.ByteVector byteVector8 = byteVector6.putUTF8("hi!");
        org.mockito.asm.ByteVector byteVector10 = byteVector8.putShort(100);
        org.mockito.asm.ByteVector byteVector12 = byteVector10.putUTF8("");
        org.mockito.asm.ByteVector byteVector14 = byteVector10.putShort((int) (byte) 10);
        org.mockito.asm.ByteVector byteVector16 = new org.mockito.asm.ByteVector((int) '#');
        org.mockito.asm.ByteVector byteVector18 = byteVector16.putUTF8("hi!");
        org.mockito.asm.ByteVector byteVector20 = byteVector16.putUTF8("");
        org.mockito.asm.ByteVector byteVector21 = new org.mockito.asm.ByteVector();
        org.mockito.asm.ByteVector byteVector23 = byteVector21.putUTF8("hi!");
        org.mockito.asm.ByteVector byteVector25 = byteVector23.putLong((long) (byte) 10);
        org.mockito.asm.ByteVector byteVector27 = byteVector25.putUTF8("hi!");
        org.mockito.asm.ByteVector byteVector29 = byteVector25.putLong((-1L));
        org.mockito.asm.ByteVector byteVector31 = byteVector29.putInt(10);
        org.mockito.asm.ByteVector byteVector33 = byteVector31.putShort((int) '#');
        org.mockito.asm.ByteVector byteVector35 = new org.mockito.asm.ByteVector((int) (short) 0);
        org.mockito.asm.ByteVector byteVector36 = new org.mockito.asm.ByteVector();
        org.mockito.asm.ByteVector byteVector38 = byteVector36.putUTF8("hi!");
        org.mockito.asm.ByteVector byteVector40 = byteVector36.putInt(0);
        org.mockito.asm.ByteVector byteVector42 = byteVector40.putInt((int) ' ');
        org.mockito.asm.ByteVector byteVector44 = byteVector42.putLong(100L);
        byte[] byteArray48 = new byte[] { (byte) 0, (byte) 10, (byte) 1 };
        org.mockito.asm.ByteVector byteVector51 = byteVector42.putByteArray(byteArray48, 0, 0);
        org.mockito.asm.ByteVector byteVector54 = byteVector35.putByteArray(byteArray48, 1, (int) (short) 0);
        org.mockito.asm.ByteVector byteVector57 = byteVector31.putByteArray(byteArray48, (int) (short) 0, 0);
        org.mockito.asm.ByteVector byteVector60 = byteVector16.putByteArray(byteArray48, (int) (short) 1, 1);
        org.mockito.asm.ByteVector byteVector63 = byteVector10.putByteArray(byteArray48, (int) (short) 0, 1);
        org.junit.Assert.assertNotNull(byteVector2);
        org.junit.Assert.assertNotNull(byteVector4);
        org.junit.Assert.assertNotNull(byteVector6);
        org.junit.Assert.assertNotNull(byteVector8);
        org.junit.Assert.assertNotNull(byteVector10);
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
        org.junit.Assert.assertNotNull(byteVector38);
        org.junit.Assert.assertNotNull(byteVector40);
        org.junit.Assert.assertNotNull(byteVector42);
        org.junit.Assert.assertNotNull(byteVector44);
        org.junit.Assert.assertNotNull(byteArray48);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray48), "[0, 10, 1]");
        org.junit.Assert.assertNotNull(byteVector51);
        org.junit.Assert.assertNotNull(byteVector54);
        org.junit.Assert.assertNotNull(byteVector57);
        org.junit.Assert.assertNotNull(byteVector60);
        org.junit.Assert.assertNotNull(byteVector63);
    }

    @Test
    public void test1214() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1214");
        org.mockito.asm.ByteVector byteVector0 = new org.mockito.asm.ByteVector();
        org.mockito.asm.ByteVector byteVector2 = byteVector0.putUTF8("hi!");
        org.mockito.asm.ByteVector byteVector4 = byteVector0.putInt(0);
        org.mockito.asm.ByteVector byteVector6 = byteVector0.putShort((int) '4');
        org.mockito.asm.ByteVector byteVector8 = byteVector6.putInt((-1));
        org.mockito.asm.ByteVector byteVector10 = byteVector6.putLong((long) (short) 10);
        org.junit.Assert.assertNotNull(byteVector2);
        org.junit.Assert.assertNotNull(byteVector4);
        org.junit.Assert.assertNotNull(byteVector6);
        org.junit.Assert.assertNotNull(byteVector8);
        org.junit.Assert.assertNotNull(byteVector10);
    }

    @Test
    public void test1215() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1215");
        org.mockito.asm.ByteVector byteVector0 = new org.mockito.asm.ByteVector();
        org.mockito.asm.ByteVector byteVector2 = byteVector0.putUTF8("hi!");
        org.mockito.asm.ByteVector byteVector4 = byteVector0.putInt(0);
        org.mockito.asm.ByteVector byteVector6 = byteVector0.putShort((int) '4');
        org.mockito.asm.ByteVector byteVector8 = byteVector0.putByte(100);
        org.mockito.asm.ByteVector byteVector10 = byteVector8.putInt((int) (byte) 10);
        org.mockito.asm.ByteVector byteVector12 = byteVector8.putInt(0);
        org.junit.Assert.assertNotNull(byteVector2);
        org.junit.Assert.assertNotNull(byteVector4);
        org.junit.Assert.assertNotNull(byteVector6);
        org.junit.Assert.assertNotNull(byteVector8);
        org.junit.Assert.assertNotNull(byteVector10);
        org.junit.Assert.assertNotNull(byteVector12);
    }

    @Test
    public void test1216() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1216");
        org.mockito.asm.ByteVector byteVector0 = new org.mockito.asm.ByteVector();
        org.mockito.asm.ByteVector byteVector2 = byteVector0.putUTF8("hi!");
        org.mockito.asm.ByteVector byteVector4 = byteVector2.putInt(0);
        org.mockito.asm.ByteVector byteVector6 = byteVector2.putByte((int) (byte) 10);
        org.mockito.asm.ByteVector byteVector8 = byteVector6.putUTF8("hi!");
        org.mockito.asm.ByteVector byteVector10 = byteVector8.putShort(0);
        org.mockito.asm.ByteVector byteVector12 = byteVector10.putLong(10L);
        org.mockito.asm.ByteVector byteVector14 = byteVector10.putUTF8("hi!");
        org.mockito.asm.ByteVector byteVector16 = byteVector10.putByte((int) '#');
        org.mockito.asm.ByteVector byteVector18 = byteVector10.putUTF8("");
        org.mockito.asm.ByteVector byteVector20 = byteVector10.putLong((long) (short) 1);
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
    public void test1217() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1217");
        org.mockito.asm.ByteVector byteVector0 = new org.mockito.asm.ByteVector();
        org.mockito.asm.ByteVector byteVector2 = byteVector0.putUTF8("hi!");
        org.mockito.asm.ByteVector byteVector4 = byteVector2.putInt(0);
        org.mockito.asm.ByteVector byteVector6 = byteVector4.putByte((int) (byte) 1);
        org.mockito.asm.ByteVector byteVector8 = byteVector6.putShort((int) (byte) 10);
        org.mockito.asm.ByteVector byteVector10 = byteVector8.putUTF8("");
        org.mockito.asm.ByteVector byteVector12 = byteVector10.putInt((int) (byte) 100);
        org.mockito.asm.ByteVector byteVector14 = byteVector12.putLong((long) (byte) 1);
        org.mockito.asm.ByteVector byteVector16 = byteVector14.putShort((int) (byte) 0);
        org.mockito.asm.ByteVector byteVector18 = byteVector16.putByte((int) (byte) 100);
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
    public void test1218() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1218");
        org.mockito.asm.ByteVector byteVector0 = new org.mockito.asm.ByteVector();
        org.mockito.asm.ByteVector byteVector2 = byteVector0.putUTF8("hi!");
        org.mockito.asm.ByteVector byteVector4 = byteVector2.putLong((long) (byte) 10);
        org.mockito.asm.ByteVector byteVector6 = byteVector4.putUTF8("hi!");
        org.mockito.asm.ByteVector byteVector8 = byteVector4.putLong((long) 10);
        org.mockito.asm.ByteVector byteVector10 = byteVector8.putLong(0L);
        org.mockito.asm.ByteVector byteVector12 = byteVector10.putUTF8("");
        org.mockito.asm.ByteVector byteVector14 = byteVector10.putShort((int) (byte) 1);
        org.junit.Assert.assertNotNull(byteVector2);
        org.junit.Assert.assertNotNull(byteVector4);
        org.junit.Assert.assertNotNull(byteVector6);
        org.junit.Assert.assertNotNull(byteVector8);
        org.junit.Assert.assertNotNull(byteVector10);
        org.junit.Assert.assertNotNull(byteVector12);
        org.junit.Assert.assertNotNull(byteVector14);
    }

    @Test
    public void test1219() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1219");
        org.mockito.asm.ByteVector byteVector0 = new org.mockito.asm.ByteVector();
        org.mockito.asm.ByteVector byteVector2 = byteVector0.putUTF8("hi!");
        org.mockito.asm.ByteVector byteVector4 = byteVector0.putShort((int) (short) -1);
        org.mockito.asm.ByteVector byteVector6 = byteVector0.putByte((int) ' ');
        org.mockito.asm.ByteVector byteVector8 = byteVector0.putInt(100);
        org.mockito.asm.ByteVector byteVector10 = byteVector8.putByte((int) ' ');
        org.mockito.asm.ByteVector byteVector12 = byteVector10.putShort((int) (byte) -1);
        org.junit.Assert.assertNotNull(byteVector2);
        org.junit.Assert.assertNotNull(byteVector4);
        org.junit.Assert.assertNotNull(byteVector6);
        org.junit.Assert.assertNotNull(byteVector8);
        org.junit.Assert.assertNotNull(byteVector10);
        org.junit.Assert.assertNotNull(byteVector12);
    }

    @Test
    public void test1220() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1220");
        org.mockito.asm.ByteVector byteVector0 = new org.mockito.asm.ByteVector();
        org.mockito.asm.ByteVector byteVector2 = byteVector0.putUTF8("hi!");
        org.mockito.asm.ByteVector byteVector4 = byteVector0.putInt(0);
        org.mockito.asm.ByteVector byteVector6 = byteVector0.putShort(10);
        org.mockito.asm.ByteVector byteVector8 = byteVector0.putLong((long) '#');
        org.mockito.asm.ByteVector byteVector10 = byteVector8.putShort((int) (byte) 0);
        org.mockito.asm.ByteVector byteVector12 = byteVector10.putUTF8("");
        org.mockito.asm.ByteVector byteVector13 = new org.mockito.asm.ByteVector();
        org.mockito.asm.ByteVector byteVector15 = byteVector13.putUTF8("hi!");
        org.mockito.asm.ByteVector byteVector17 = byteVector13.putInt(0);
        org.mockito.asm.ByteVector byteVector19 = byteVector17.putInt((int) ' ');
        org.mockito.asm.ByteVector byteVector21 = byteVector19.putLong((long) (short) 10);
        org.mockito.asm.ByteVector byteVector23 = byteVector21.putUTF8("hi!");
        org.mockito.asm.ByteVector byteVector25 = byteVector21.putByte(0);
        org.mockito.asm.ByteVector byteVector27 = byteVector25.putInt((int) (short) 1);
        org.mockito.asm.ByteVector byteVector29 = byteVector25.putLong((long) (short) 0);
        org.mockito.asm.ByteVector byteVector30 = new org.mockito.asm.ByteVector();
        org.mockito.asm.ByteVector byteVector32 = byteVector30.putUTF8("hi!");
        org.mockito.asm.ByteVector byteVector34 = byteVector32.putLong((long) (byte) 10);
        org.mockito.asm.ByteVector byteVector36 = byteVector34.putUTF8("hi!");
        org.mockito.asm.ByteVector byteVector38 = byteVector34.putLong((long) 10);
        org.mockito.asm.ByteVector byteVector40 = byteVector38.putLong(0L);
        org.mockito.asm.ByteVector byteVector42 = byteVector40.putUTF8("hi!");
        org.mockito.asm.ByteVector byteVector43 = new org.mockito.asm.ByteVector();
        org.mockito.asm.ByteVector byteVector45 = byteVector43.putUTF8("hi!");
        org.mockito.asm.ByteVector byteVector47 = byteVector45.putInt(0);
        org.mockito.asm.ByteVector byteVector49 = byteVector45.putByte((int) (byte) 10);
        org.mockito.asm.ByteVector byteVector51 = byteVector49.putLong((-1L));
        org.mockito.asm.ByteVector byteVector53 = byteVector49.putInt((int) (byte) 100);
        org.mockito.asm.ByteVector byteVector54 = new org.mockito.asm.ByteVector();
        org.mockito.asm.ByteVector byteVector56 = byteVector54.putUTF8("hi!");
        org.mockito.asm.ByteVector byteVector58 = byteVector54.putInt(0);
        org.mockito.asm.ByteVector byteVector60 = byteVector58.putInt((int) ' ');
        org.mockito.asm.ByteVector byteVector62 = byteVector60.putLong(100L);
        byte[] byteArray66 = new byte[] { (byte) 0, (byte) 10, (byte) 1 };
        org.mockito.asm.ByteVector byteVector69 = byteVector60.putByteArray(byteArray66, 0, 0);
        org.mockito.asm.ByteVector byteVector72 = byteVector49.putByteArray(byteArray66, (int) (byte) 1, 0);
        org.mockito.asm.ByteVector byteVector75 = byteVector42.putByteArray(byteArray66, (int) (byte) 0, 0);
        org.mockito.asm.ByteVector byteVector78 = byteVector25.putByteArray(byteArray66, 0, (int) (byte) 1);
        // The following exception was thrown during execution in test generation
        try {
            org.mockito.asm.ByteVector byteVector81 = byteVector12.putByteArray(byteArray66, (int) ' ', (int) (short) -1);
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
        org.junit.Assert.assertNotNull(byteVector78);
    }

    @Test
    public void test1221() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1221");
        org.mockito.asm.ByteVector byteVector1 = new org.mockito.asm.ByteVector((int) '#');
        org.mockito.asm.ByteVector byteVector3 = byteVector1.putInt(100);
        org.mockito.asm.ByteVector byteVector5 = byteVector1.putInt(0);
        org.mockito.asm.ByteVector byteVector7 = byteVector5.putShort((int) (short) 10);
        org.mockito.asm.ByteVector byteVector9 = byteVector7.putInt((int) (short) 1);
        org.mockito.asm.ByteVector byteVector11 = byteVector9.putByte(10);
        org.junit.Assert.assertNotNull(byteVector3);
        org.junit.Assert.assertNotNull(byteVector5);
        org.junit.Assert.assertNotNull(byteVector7);
        org.junit.Assert.assertNotNull(byteVector9);
        org.junit.Assert.assertNotNull(byteVector11);
    }

    @Test
    public void test1222() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1222");
        org.mockito.asm.ByteVector byteVector0 = new org.mockito.asm.ByteVector();
        org.mockito.asm.ByteVector byteVector2 = byteVector0.putUTF8("hi!");
        org.mockito.asm.ByteVector byteVector4 = byteVector0.putLong((long) ' ');
        org.mockito.asm.ByteVector byteVector6 = byteVector4.putByte((int) 'a');
        org.mockito.asm.ByteVector byteVector8 = byteVector4.putByte((int) (short) -1);
        org.mockito.asm.ByteVector byteVector10 = byteVector4.putLong(0L);
        org.mockito.asm.ByteVector byteVector12 = byteVector4.putUTF8("hi!");
        org.mockito.asm.ByteVector byteVector14 = byteVector12.putUTF8("hi!");
        org.mockito.asm.ByteVector byteVector16 = byteVector14.putLong((long) '#');
        org.mockito.asm.ByteVector byteVector18 = byteVector14.putLong((long) (short) 1);
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
    public void test1223() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1223");
        org.mockito.asm.ByteVector byteVector0 = new org.mockito.asm.ByteVector();
        org.mockito.asm.ByteVector byteVector2 = byteVector0.putUTF8("hi!");
        org.mockito.asm.ByteVector byteVector4 = byteVector2.putLong((long) (byte) 10);
        org.mockito.asm.ByteVector byteVector6 = byteVector2.putInt((int) (short) 1);
        org.mockito.asm.ByteVector byteVector8 = byteVector2.putLong((long) (short) 10);
        org.mockito.asm.ByteVector byteVector10 = byteVector2.putShort(10);
        org.mockito.asm.ByteVector byteVector12 = byteVector10.putInt((int) (byte) 0);
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
    public void test1224() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1224");
        org.mockito.asm.ByteVector byteVector1 = new org.mockito.asm.ByteVector((int) '#');
        org.mockito.asm.ByteVector byteVector3 = byteVector1.putLong(100L);
        org.mockito.asm.ByteVector byteVector5 = byteVector1.putUTF8("");
        org.mockito.asm.ByteVector byteVector7 = byteVector5.putInt((int) (byte) 10);
        org.mockito.asm.ByteVector byteVector9 = byteVector7.putByte(0);
        org.mockito.asm.ByteVector byteVector11 = byteVector9.putUTF8("hi!");
        java.lang.Class<?> wildcardClass12 = byteVector9.getClass();
        org.junit.Assert.assertNotNull(byteVector3);
        org.junit.Assert.assertNotNull(byteVector5);
        org.junit.Assert.assertNotNull(byteVector7);
        org.junit.Assert.assertNotNull(byteVector9);
        org.junit.Assert.assertNotNull(byteVector11);
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test1225() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1225");
        org.mockito.asm.ByteVector byteVector1 = new org.mockito.asm.ByteVector((int) '#');
        org.mockito.asm.ByteVector byteVector3 = byteVector1.putLong(100L);
        org.mockito.asm.ByteVector byteVector5 = byteVector3.putLong(1L);
        org.mockito.asm.ByteVector byteVector7 = byteVector5.putUTF8("hi!");
        org.mockito.asm.ByteVector byteVector9 = byteVector5.putLong((long) 1);
        org.mockito.asm.ByteVector byteVector11 = byteVector5.putInt((int) '4');
        org.mockito.asm.ByteVector byteVector13 = byteVector5.putUTF8("");
        org.junit.Assert.assertNotNull(byteVector3);
        org.junit.Assert.assertNotNull(byteVector5);
        org.junit.Assert.assertNotNull(byteVector7);
        org.junit.Assert.assertNotNull(byteVector9);
        org.junit.Assert.assertNotNull(byteVector11);
        org.junit.Assert.assertNotNull(byteVector13);
    }

    @Test
    public void test1226() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1226");
        org.mockito.asm.ByteVector byteVector0 = new org.mockito.asm.ByteVector();
        org.mockito.asm.ByteVector byteVector2 = byteVector0.putUTF8("hi!");
        org.mockito.asm.ByteVector byteVector4 = byteVector0.putLong((long) (short) 1);
        org.mockito.asm.ByteVector byteVector6 = byteVector4.putUTF8("");
        org.mockito.asm.ByteVector byteVector8 = byteVector6.putShort((int) (short) 0);
        org.mockito.asm.ByteVector byteVector10 = byteVector6.putByte((int) ' ');
        org.mockito.asm.ByteVector byteVector12 = byteVector6.putShort(100);
        org.mockito.asm.ByteVector byteVector14 = byteVector6.putByte((int) (byte) 100);
        org.junit.Assert.assertNotNull(byteVector2);
        org.junit.Assert.assertNotNull(byteVector4);
        org.junit.Assert.assertNotNull(byteVector6);
        org.junit.Assert.assertNotNull(byteVector8);
        org.junit.Assert.assertNotNull(byteVector10);
        org.junit.Assert.assertNotNull(byteVector12);
        org.junit.Assert.assertNotNull(byteVector14);
    }

    @Test
    public void test1227() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1227");
        org.mockito.asm.ByteVector byteVector0 = new org.mockito.asm.ByteVector();
        org.mockito.asm.ByteVector byteVector2 = byteVector0.putUTF8("hi!");
        org.mockito.asm.ByteVector byteVector4 = byteVector2.putInt(0);
        org.mockito.asm.ByteVector byteVector6 = byteVector4.putShort((int) '4');
        org.mockito.asm.ByteVector byteVector8 = byteVector6.putByte(100);
        org.mockito.asm.ByteVector byteVector10 = byteVector6.putInt((int) (byte) 10);
        org.mockito.asm.ByteVector byteVector12 = byteVector6.putUTF8("hi!");
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
    public void test1228() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1228");
        org.mockito.asm.ByteVector byteVector1 = new org.mockito.asm.ByteVector((int) (byte) 10);
        org.mockito.asm.ByteVector byteVector3 = byteVector1.putByte((int) '4');
        org.mockito.asm.ByteVector byteVector5 = byteVector1.putLong((long) 'a');
        org.mockito.asm.ByteVector byteVector7 = byteVector1.putShort((int) (byte) 1);
        org.mockito.asm.ByteVector byteVector9 = byteVector7.putShort((int) (byte) 0);
        org.mockito.asm.ByteVector byteVector11 = byteVector9.putUTF8("");
        org.mockito.asm.ByteVector byteVector13 = byteVector9.putUTF8("hi!");
        org.junit.Assert.assertNotNull(byteVector3);
        org.junit.Assert.assertNotNull(byteVector5);
        org.junit.Assert.assertNotNull(byteVector7);
        org.junit.Assert.assertNotNull(byteVector9);
        org.junit.Assert.assertNotNull(byteVector11);
        org.junit.Assert.assertNotNull(byteVector13);
    }

    @Test
    public void test1229() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1229");
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
        org.mockito.asm.ByteVector byteVector22 = byteVector16.putShort((int) (short) 100);
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
        org.mockito.asm.ByteVector byteVector59 = byteVector22.putByteArray(byteArray50, 1, (int) (byte) 1);
        org.mockito.asm.ByteVector byteVector61 = byteVector22.putByte(0);
        java.lang.Class<?> wildcardClass62 = byteVector22.getClass();
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
        org.junit.Assert.assertNotNull(byteVector59);
        org.junit.Assert.assertNotNull(byteVector61);
        org.junit.Assert.assertNotNull(wildcardClass62);
    }

    @Test
    public void test1230() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1230");
        org.mockito.asm.ByteVector byteVector0 = new org.mockito.asm.ByteVector();
        org.mockito.asm.ByteVector byteVector2 = byteVector0.putUTF8("hi!");
        org.mockito.asm.ByteVector byteVector4 = byteVector0.putShort((int) (short) -1);
        org.mockito.asm.ByteVector byteVector6 = byteVector0.putInt((int) (byte) 10);
        org.mockito.asm.ByteVector byteVector8 = byteVector6.putUTF8("hi!");
        org.mockito.asm.ByteVector byteVector10 = byteVector8.putShort(0);
        org.mockito.asm.ByteVector byteVector12 = byteVector10.putLong(10L);
        org.mockito.asm.ByteVector byteVector14 = byteVector12.putByte((int) 'a');
        org.mockito.asm.ByteVector byteVector16 = byteVector14.putShort((int) (short) -1);
        org.mockito.asm.ByteVector byteVector18 = byteVector14.putInt(1);
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
    public void test1231() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1231");
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
        org.mockito.asm.ByteVector byteVector22 = byteVector14.putInt((int) (short) -1);
        org.mockito.asm.ByteVector byteVector24 = byteVector22.putInt((int) (byte) 0);
        org.mockito.asm.ByteVector byteVector25 = new org.mockito.asm.ByteVector();
        org.mockito.asm.ByteVector byteVector27 = byteVector25.putUTF8("hi!");
        org.mockito.asm.ByteVector byteVector29 = byteVector25.putLong((long) ' ');
        org.mockito.asm.ByteVector byteVector31 = byteVector29.putByte((int) 'a');
        org.mockito.asm.ByteVector byteVector33 = byteVector29.putByte((int) (short) -1);
        org.mockito.asm.ByteVector byteVector35 = byteVector29.putLong(0L);
        org.mockito.asm.ByteVector byteVector37 = byteVector35.putByte(0);
        org.mockito.asm.ByteVector byteVector39 = byteVector37.putByte(100);
        org.mockito.asm.ByteVector byteVector41 = byteVector37.putByte((int) '4');
        org.mockito.asm.ByteVector byteVector43 = byteVector41.putUTF8("hi!");
        org.mockito.asm.ByteVector byteVector45 = byteVector41.putShort(100);
        org.mockito.asm.ByteVector byteVector47 = byteVector41.putShort((int) (short) 100);
        org.mockito.asm.ByteVector byteVector48 = new org.mockito.asm.ByteVector();
        org.mockito.asm.ByteVector byteVector50 = byteVector48.putUTF8("hi!");
        org.mockito.asm.ByteVector byteVector52 = byteVector48.putInt(0);
        org.mockito.asm.ByteVector byteVector54 = byteVector48.putShort((int) '4');
        org.mockito.asm.ByteVector byteVector56 = byteVector48.putByte(100);
        org.mockito.asm.ByteVector byteVector58 = byteVector56.putInt((int) (byte) 10);
        org.mockito.asm.ByteVector byteVector60 = byteVector56.putInt((int) (byte) 10);
        org.mockito.asm.ByteVector byteVector62 = byteVector60.putByte(100);
        org.mockito.asm.ByteVector byteVector63 = new org.mockito.asm.ByteVector();
        org.mockito.asm.ByteVector byteVector65 = byteVector63.putUTF8("hi!");
        org.mockito.asm.ByteVector byteVector67 = byteVector63.putInt(0);
        org.mockito.asm.ByteVector byteVector69 = byteVector67.putInt((int) ' ');
        org.mockito.asm.ByteVector byteVector71 = byteVector69.putLong(100L);
        byte[] byteArray75 = new byte[] { (byte) 0, (byte) 10, (byte) 1 };
        org.mockito.asm.ByteVector byteVector78 = byteVector69.putByteArray(byteArray75, 0, 0);
        org.mockito.asm.ByteVector byteVector81 = byteVector62.putByteArray(byteArray75, (int) (byte) 1, (int) (byte) 0);
        org.mockito.asm.ByteVector byteVector84 = byteVector47.putByteArray(byteArray75, 1, (int) (byte) 1);
        // The following exception was thrown during execution in test generation
        try {
            org.mockito.asm.ByteVector byteVector87 = byteVector22.putByteArray(byteArray75, (int) (byte) 1, (int) (short) -1);
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
        org.junit.Assert.assertNotNull(byteVector45);
        org.junit.Assert.assertNotNull(byteVector47);
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
    public void test1232() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1232");
        org.mockito.asm.ByteVector byteVector1 = new org.mockito.asm.ByteVector((int) ' ');
        org.mockito.asm.ByteVector byteVector3 = byteVector1.putInt((int) '4');
        org.mockito.asm.ByteVector byteVector5 = byteVector3.putUTF8("");
        org.mockito.asm.ByteVector byteVector7 = byteVector5.putInt(0);
        org.mockito.asm.ByteVector byteVector9 = byteVector5.putLong(0L);
        java.lang.Class<?> wildcardClass10 = byteVector9.getClass();
        org.junit.Assert.assertNotNull(byteVector3);
        org.junit.Assert.assertNotNull(byteVector5);
        org.junit.Assert.assertNotNull(byteVector7);
        org.junit.Assert.assertNotNull(byteVector9);
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test1233() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1233");
        org.mockito.asm.ByteVector byteVector1 = new org.mockito.asm.ByteVector((int) '#');
        org.mockito.asm.ByteVector byteVector3 = byteVector1.putInt(100);
        org.mockito.asm.ByteVector byteVector5 = byteVector1.putInt(0);
        org.mockito.asm.ByteVector byteVector7 = byteVector5.putUTF8("hi!");
        java.lang.Class<?> wildcardClass8 = byteVector7.getClass();
        org.junit.Assert.assertNotNull(byteVector3);
        org.junit.Assert.assertNotNull(byteVector5);
        org.junit.Assert.assertNotNull(byteVector7);
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test1234() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1234");
        org.mockito.asm.ByteVector byteVector0 = new org.mockito.asm.ByteVector();
        org.mockito.asm.ByteVector byteVector2 = byteVector0.putUTF8("hi!");
        org.mockito.asm.ByteVector byteVector4 = byteVector0.putLong((long) ' ');
        org.mockito.asm.ByteVector byteVector6 = byteVector4.putByte((int) 'a');
        org.mockito.asm.ByteVector byteVector8 = byteVector4.putByte((int) (short) -1);
        org.mockito.asm.ByteVector byteVector10 = byteVector4.putLong(0L);
        org.mockito.asm.ByteVector byteVector12 = byteVector10.putByte(0);
        org.mockito.asm.ByteVector byteVector14 = byteVector12.putByte(100);
        org.mockito.asm.ByteVector byteVector16 = byteVector14.putInt(100);
        org.mockito.asm.ByteVector byteVector18 = byteVector14.putLong((long) 1);
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
    public void test1235() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1235");
        org.mockito.asm.ByteVector byteVector1 = new org.mockito.asm.ByteVector((int) (byte) 1);
        org.mockito.asm.ByteVector byteVector3 = byteVector1.putByte((int) (byte) 10);
        org.mockito.asm.ByteVector byteVector5 = byteVector3.putShort((int) (short) 10);
        org.mockito.asm.ByteVector byteVector7 = byteVector3.putUTF8("");
        org.mockito.asm.ByteVector byteVector9 = byteVector7.putShort(0);
        org.mockito.asm.ByteVector byteVector11 = byteVector9.putShort((int) (short) -1);
        org.mockito.asm.ByteVector byteVector13 = byteVector11.putInt((int) ' ');
        org.junit.Assert.assertNotNull(byteVector3);
        org.junit.Assert.assertNotNull(byteVector5);
        org.junit.Assert.assertNotNull(byteVector7);
        org.junit.Assert.assertNotNull(byteVector9);
        org.junit.Assert.assertNotNull(byteVector11);
        org.junit.Assert.assertNotNull(byteVector13);
    }

    @Test
    public void test1236() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1236");
        org.mockito.asm.ByteVector byteVector0 = new org.mockito.asm.ByteVector();
        org.mockito.asm.ByteVector byteVector2 = byteVector0.putUTF8("hi!");
        org.mockito.asm.ByteVector byteVector4 = byteVector0.putLong((long) ' ');
        org.mockito.asm.ByteVector byteVector6 = byteVector4.putByte((int) 'a');
        org.mockito.asm.ByteVector byteVector8 = byteVector6.putByte((int) (short) -1);
        org.mockito.asm.ByteVector byteVector10 = byteVector8.putLong((long) (byte) -1);
        org.mockito.asm.ByteVector byteVector12 = byteVector8.putByte((int) '4');
        org.mockito.asm.ByteVector byteVector14 = byteVector12.putLong((long) (short) 10);
        org.mockito.asm.ByteVector byteVector16 = byteVector14.putByte((int) 'a');
        org.mockito.asm.ByteVector byteVector18 = byteVector14.putUTF8("");
        org.mockito.asm.ByteVector byteVector20 = byteVector18.putShort((int) (byte) 10);
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
    public void test1237() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1237");
        org.mockito.asm.ByteVector byteVector1 = new org.mockito.asm.ByteVector((int) '#');
        org.mockito.asm.ByteVector byteVector3 = byteVector1.putInt(100);
        org.mockito.asm.ByteVector byteVector5 = byteVector3.putShort((int) (short) -1);
        org.mockito.asm.ByteVector byteVector7 = byteVector3.putShort((int) (short) 10);
        org.mockito.asm.ByteVector byteVector9 = byteVector3.putShort((int) (byte) 100);
        org.mockito.asm.ByteVector byteVector11 = byteVector3.putUTF8("hi!");
        org.mockito.asm.ByteVector byteVector13 = byteVector11.putLong((long) (byte) 1);
        org.mockito.asm.ByteVector byteVector15 = byteVector13.putShort(0);
        org.junit.Assert.assertNotNull(byteVector3);
        org.junit.Assert.assertNotNull(byteVector5);
        org.junit.Assert.assertNotNull(byteVector7);
        org.junit.Assert.assertNotNull(byteVector9);
        org.junit.Assert.assertNotNull(byteVector11);
        org.junit.Assert.assertNotNull(byteVector13);
        org.junit.Assert.assertNotNull(byteVector15);
    }

    @Test
    public void test1238() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1238");
        org.mockito.asm.ByteVector byteVector0 = new org.mockito.asm.ByteVector();
        org.mockito.asm.ByteVector byteVector2 = byteVector0.putUTF8("hi!");
        org.mockito.asm.ByteVector byteVector4 = byteVector2.putInt(0);
        org.mockito.asm.ByteVector byteVector6 = byteVector2.putShort((int) (byte) 10);
        org.mockito.asm.ByteVector byteVector8 = byteVector2.putUTF8("");
        org.mockito.asm.ByteVector byteVector10 = byteVector2.putByte((int) (byte) 1);
        org.mockito.asm.ByteVector byteVector12 = byteVector10.putShort((int) (short) 10);
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
    public void test1239() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1239");
        org.mockito.asm.ByteVector byteVector0 = new org.mockito.asm.ByteVector();
        org.mockito.asm.ByteVector byteVector2 = byteVector0.putUTF8("hi!");
        org.mockito.asm.ByteVector byteVector4 = byteVector0.putLong((long) ' ');
        org.mockito.asm.ByteVector byteVector6 = byteVector4.putByte((int) 'a');
        org.mockito.asm.ByteVector byteVector8 = byteVector4.putByte((int) (short) -1);
        org.mockito.asm.ByteVector byteVector10 = byteVector4.putLong(0L);
        org.mockito.asm.ByteVector byteVector12 = byteVector4.putUTF8("");
        org.mockito.asm.ByteVector byteVector14 = byteVector12.putInt((int) (byte) 1);
        org.mockito.asm.ByteVector byteVector16 = byteVector14.putInt((int) (short) 0);
        org.mockito.asm.ByteVector byteVector18 = byteVector14.putShort((int) (byte) 1);
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
    public void test1240() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1240");
        org.mockito.asm.ByteVector byteVector0 = new org.mockito.asm.ByteVector();
        org.mockito.asm.ByteVector byteVector2 = byteVector0.putUTF8("hi!");
        org.mockito.asm.ByteVector byteVector4 = byteVector0.putLong((long) ' ');
        org.mockito.asm.ByteVector byteVector6 = byteVector4.putByte((int) 'a');
        org.mockito.asm.ByteVector byteVector8 = byteVector4.putByte((int) (short) -1);
        org.mockito.asm.ByteVector byteVector10 = byteVector4.putLong(0L);
        org.mockito.asm.ByteVector byteVector12 = byteVector4.putUTF8("hi!");
        org.mockito.asm.ByteVector byteVector14 = byteVector12.putUTF8("hi!");
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
    public void test1241() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1241");
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
        org.mockito.asm.ByteVector byteVector24 = byteVector20.putInt((int) (byte) 0);
        org.mockito.asm.ByteVector byteVector26 = byteVector24.putShort((int) (short) 1);
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
    public void test1242() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1242");
        org.mockito.asm.ByteVector byteVector0 = new org.mockito.asm.ByteVector();
        org.mockito.asm.ByteVector byteVector2 = byteVector0.putUTF8("hi!");
        org.mockito.asm.ByteVector byteVector4 = byteVector0.putInt(0);
        org.mockito.asm.ByteVector byteVector6 = byteVector0.putShort(10);
        org.mockito.asm.ByteVector byteVector8 = byteVector0.putUTF8("");
        org.mockito.asm.ByteVector byteVector10 = byteVector8.putByte(0);
        org.mockito.asm.ByteVector byteVector12 = byteVector10.putLong(1L);
        org.junit.Assert.assertNotNull(byteVector2);
        org.junit.Assert.assertNotNull(byteVector4);
        org.junit.Assert.assertNotNull(byteVector6);
        org.junit.Assert.assertNotNull(byteVector8);
        org.junit.Assert.assertNotNull(byteVector10);
        org.junit.Assert.assertNotNull(byteVector12);
    }

    @Test
    public void test1243() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1243");
        org.mockito.asm.ByteVector byteVector0 = new org.mockito.asm.ByteVector();
        org.mockito.asm.ByteVector byteVector2 = byteVector0.putUTF8("hi!");
        org.mockito.asm.ByteVector byteVector4 = byteVector2.putInt(0);
        org.mockito.asm.ByteVector byteVector6 = byteVector4.putShort((int) '4');
        org.mockito.asm.ByteVector byteVector8 = byteVector6.putByte(100);
        org.mockito.asm.ByteVector byteVector10 = byteVector6.putInt((int) (byte) 10);
        org.mockito.asm.ByteVector byteVector12 = byteVector6.putInt((int) (byte) -1);
        org.mockito.asm.ByteVector byteVector14 = byteVector12.putLong((long) '4');
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
    public void test1244() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1244");
        org.mockito.asm.ByteVector byteVector1 = new org.mockito.asm.ByteVector((int) '#');
        org.mockito.asm.ByteVector byteVector3 = byteVector1.putLong(100L);
        org.mockito.asm.ByteVector byteVector5 = byteVector1.putUTF8("");
        org.mockito.asm.ByteVector byteVector7 = byteVector1.putUTF8("hi!");
        org.mockito.asm.ByteVector byteVector9 = byteVector7.putLong((long) (short) 0);
        org.mockito.asm.ByteVector byteVector11 = byteVector7.putLong((long) (byte) -1);
        org.mockito.asm.ByteVector byteVector13 = byteVector7.putLong((long) 0);
        org.mockito.asm.ByteVector byteVector15 = byteVector13.putUTF8("");
        org.mockito.asm.ByteVector byteVector17 = byteVector13.putShort((int) (short) 0);
        org.junit.Assert.assertNotNull(byteVector3);
        org.junit.Assert.assertNotNull(byteVector5);
        org.junit.Assert.assertNotNull(byteVector7);
        org.junit.Assert.assertNotNull(byteVector9);
        org.junit.Assert.assertNotNull(byteVector11);
        org.junit.Assert.assertNotNull(byteVector13);
        org.junit.Assert.assertNotNull(byteVector15);
        org.junit.Assert.assertNotNull(byteVector17);
    }

    @Test
    public void test1245() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1245");
        org.mockito.asm.ByteVector byteVector0 = new org.mockito.asm.ByteVector();
        org.mockito.asm.ByteVector byteVector2 = byteVector0.putUTF8("hi!");
        org.mockito.asm.ByteVector byteVector4 = byteVector2.putByte(100);
        org.mockito.asm.ByteVector byteVector6 = byteVector2.putShort((int) 'a');
        org.mockito.asm.ByteVector byteVector8 = byteVector6.putByte((int) (short) 1);
        org.mockito.asm.ByteVector byteVector10 = byteVector8.putLong((long) 0);
        org.mockito.asm.ByteVector byteVector12 = byteVector10.putLong((long) (byte) -1);
        org.mockito.asm.ByteVector byteVector14 = byteVector12.putShort((int) (short) 100);
        org.mockito.asm.ByteVector byteVector16 = byteVector12.putUTF8("hi!");
        org.mockito.asm.ByteVector byteVector18 = byteVector12.putInt((int) (byte) 10);
        org.mockito.asm.ByteVector byteVector20 = byteVector12.putByte((int) (byte) -1);
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
    public void test1246() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1246");
        org.mockito.asm.ByteVector byteVector0 = new org.mockito.asm.ByteVector();
        org.mockito.asm.ByteVector byteVector2 = byteVector0.putUTF8("hi!");
        org.mockito.asm.ByteVector byteVector4 = byteVector0.putInt(0);
        org.mockito.asm.ByteVector byteVector6 = byteVector0.putShort((int) '4');
        org.mockito.asm.ByteVector byteVector8 = byteVector6.putInt((int) (short) 0);
        org.mockito.asm.ByteVector byteVector10 = byteVector8.putShort((int) (byte) 0);
        org.mockito.asm.ByteVector byteVector12 = byteVector8.putByte(1);
        org.mockito.asm.ByteVector byteVector14 = byteVector12.putShort((int) (short) 100);
        org.junit.Assert.assertNotNull(byteVector2);
        org.junit.Assert.assertNotNull(byteVector4);
        org.junit.Assert.assertNotNull(byteVector6);
        org.junit.Assert.assertNotNull(byteVector8);
        org.junit.Assert.assertNotNull(byteVector10);
        org.junit.Assert.assertNotNull(byteVector12);
        org.junit.Assert.assertNotNull(byteVector14);
    }

    @Test
    public void test1247() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1247");
        org.mockito.asm.ByteVector byteVector0 = new org.mockito.asm.ByteVector();
        org.mockito.asm.ByteVector byteVector2 = byteVector0.putUTF8("hi!");
        org.mockito.asm.ByteVector byteVector4 = byteVector0.putInt(0);
        org.mockito.asm.ByteVector byteVector6 = byteVector0.putShort(10);
        org.mockito.asm.ByteVector byteVector8 = byteVector0.putUTF8("");
        org.mockito.asm.ByteVector byteVector10 = byteVector0.putUTF8("hi!");
        org.junit.Assert.assertNotNull(byteVector2);
        org.junit.Assert.assertNotNull(byteVector4);
        org.junit.Assert.assertNotNull(byteVector6);
        org.junit.Assert.assertNotNull(byteVector8);
        org.junit.Assert.assertNotNull(byteVector10);
    }

    @Test
    public void test1248() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1248");
        org.mockito.asm.ByteVector byteVector0 = new org.mockito.asm.ByteVector();
        org.mockito.asm.ByteVector byteVector2 = byteVector0.putUTF8("hi!");
        org.mockito.asm.ByteVector byteVector4 = byteVector0.putShort((int) (short) 100);
        org.mockito.asm.ByteVector byteVector6 = byteVector4.putLong(0L);
        org.mockito.asm.ByteVector byteVector8 = byteVector4.putInt((int) (byte) 100);
        org.junit.Assert.assertNotNull(byteVector2);
        org.junit.Assert.assertNotNull(byteVector4);
        org.junit.Assert.assertNotNull(byteVector6);
        org.junit.Assert.assertNotNull(byteVector8);
    }

    @Test
    public void test1249() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1249");
        org.mockito.asm.ByteVector byteVector0 = new org.mockito.asm.ByteVector();
        org.mockito.asm.ByteVector byteVector2 = byteVector0.putUTF8("hi!");
        org.mockito.asm.ByteVector byteVector4 = byteVector2.putLong((long) (byte) 10);
        org.mockito.asm.ByteVector byteVector6 = byteVector4.putUTF8("hi!");
        org.mockito.asm.ByteVector byteVector8 = byteVector4.putLong((-1L));
        org.mockito.asm.ByteVector byteVector10 = byteVector8.putInt(10);
        org.mockito.asm.ByteVector byteVector12 = byteVector8.putByte(0);
        org.mockito.asm.ByteVector byteVector14 = byteVector8.putInt((int) (byte) 1);
        org.junit.Assert.assertNotNull(byteVector2);
        org.junit.Assert.assertNotNull(byteVector4);
        org.junit.Assert.assertNotNull(byteVector6);
        org.junit.Assert.assertNotNull(byteVector8);
        org.junit.Assert.assertNotNull(byteVector10);
        org.junit.Assert.assertNotNull(byteVector12);
        org.junit.Assert.assertNotNull(byteVector14);
    }

    @Test
    public void test1250() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1250");
        org.mockito.asm.ByteVector byteVector1 = new org.mockito.asm.ByteVector((int) (short) 1);
        org.mockito.asm.ByteVector byteVector3 = byteVector1.putLong((long) (byte) 1);
        org.mockito.asm.ByteVector byteVector5 = byteVector1.putUTF8("");
        org.mockito.asm.ByteVector byteVector7 = byteVector5.putInt((int) '#');
        org.mockito.asm.ByteVector byteVector9 = byteVector5.putByte(1);
        org.mockito.asm.ByteVector byteVector11 = byteVector9.putUTF8("");
        org.mockito.asm.ByteVector byteVector13 = byteVector9.putByte((int) (byte) 10);
        org.junit.Assert.assertNotNull(byteVector3);
        org.junit.Assert.assertNotNull(byteVector5);
        org.junit.Assert.assertNotNull(byteVector7);
        org.junit.Assert.assertNotNull(byteVector9);
        org.junit.Assert.assertNotNull(byteVector11);
        org.junit.Assert.assertNotNull(byteVector13);
    }

    @Test
    public void test1251() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1251");
        org.mockito.asm.ByteVector byteVector1 = new org.mockito.asm.ByteVector((int) '#');
        org.mockito.asm.ByteVector byteVector3 = byteVector1.putLong(100L);
        org.mockito.asm.ByteVector byteVector5 = byteVector1.putUTF8("");
        org.mockito.asm.ByteVector byteVector7 = byteVector1.putUTF8("hi!");
        org.mockito.asm.ByteVector byteVector9 = byteVector7.putLong((long) (short) 0);
        org.mockito.asm.ByteVector byteVector11 = byteVector9.putLong((long) 1);
        org.mockito.asm.ByteVector byteVector13 = byteVector11.putUTF8("hi!");
        org.mockito.asm.ByteVector byteVector15 = byteVector13.putInt((int) (byte) -1);
        org.mockito.asm.ByteVector byteVector17 = byteVector15.putInt((int) (short) 0);
        org.junit.Assert.assertNotNull(byteVector3);
        org.junit.Assert.assertNotNull(byteVector5);
        org.junit.Assert.assertNotNull(byteVector7);
        org.junit.Assert.assertNotNull(byteVector9);
        org.junit.Assert.assertNotNull(byteVector11);
        org.junit.Assert.assertNotNull(byteVector13);
        org.junit.Assert.assertNotNull(byteVector15);
        org.junit.Assert.assertNotNull(byteVector17);
    }

    @Test
    public void test1252() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1252");
        org.mockito.asm.ByteVector byteVector0 = new org.mockito.asm.ByteVector();
        org.mockito.asm.ByteVector byteVector2 = byteVector0.putUTF8("hi!");
        org.mockito.asm.ByteVector byteVector4 = byteVector0.putInt((int) (short) 1);
        org.mockito.asm.ByteVector byteVector6 = byteVector4.putInt((int) 'a');
        org.mockito.asm.ByteVector byteVector8 = byteVector6.putByte((int) (byte) 0);
        org.junit.Assert.assertNotNull(byteVector2);
        org.junit.Assert.assertNotNull(byteVector4);
        org.junit.Assert.assertNotNull(byteVector6);
        org.junit.Assert.assertNotNull(byteVector8);
    }

    @Test
    public void test1253() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1253");
        org.mockito.asm.ByteVector byteVector0 = new org.mockito.asm.ByteVector();
        org.mockito.asm.ByteVector byteVector2 = byteVector0.putUTF8("hi!");
        org.mockito.asm.ByteVector byteVector4 = byteVector0.putLong((long) ' ');
        org.mockito.asm.ByteVector byteVector6 = byteVector4.putByte((int) 'a');
        org.mockito.asm.ByteVector byteVector8 = byteVector4.putByte((int) (short) -1);
        org.mockito.asm.ByteVector byteVector10 = byteVector4.putLong(0L);
        org.mockito.asm.ByteVector byteVector12 = byteVector4.putUTF8("hi!");
        org.mockito.asm.ByteVector byteVector14 = byteVector12.putUTF8("hi!");
        org.mockito.asm.ByteVector byteVector16 = byteVector14.putLong((long) '#');
        org.mockito.asm.ByteVector byteVector17 = new org.mockito.asm.ByteVector();
        org.mockito.asm.ByteVector byteVector19 = byteVector17.putUTF8("hi!");
        org.mockito.asm.ByteVector byteVector21 = byteVector19.putLong((long) (byte) 10);
        org.mockito.asm.ByteVector byteVector23 = byteVector19.putInt((int) (short) 1);
        org.mockito.asm.ByteVector byteVector25 = byteVector19.putLong((long) (short) 10);
        org.mockito.asm.ByteVector byteVector27 = byteVector25.putShort((int) (byte) 0);
        org.mockito.asm.ByteVector byteVector29 = byteVector27.putUTF8("hi!");
        org.mockito.asm.ByteVector byteVector31 = new org.mockito.asm.ByteVector((int) '#');
        org.mockito.asm.ByteVector byteVector33 = byteVector31.putInt(100);
        org.mockito.asm.ByteVector byteVector35 = byteVector33.putShort((int) (short) -1);
        org.mockito.asm.ByteVector byteVector37 = byteVector35.putShort((int) (short) 0);
        org.mockito.asm.ByteVector byteVector39 = byteVector35.putUTF8("");
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
        org.mockito.asm.ByteVector byteVector80 = byteVector35.putByteArray(byteArray71, 1, 1);
        org.mockito.asm.ByteVector byteVector83 = byteVector29.putByteArray(byteArray71, 1, (int) (byte) 0);
        // The following exception was thrown during execution in test generation
        try {
            org.mockito.asm.ByteVector byteVector86 = byteVector16.putByteArray(byteArray71, 100, 0);
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
        org.junit.Assert.assertNotNull(byteVector83);
    }

    @Test
    public void test1254() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1254");
        org.mockito.asm.ByteVector byteVector0 = new org.mockito.asm.ByteVector();
        org.mockito.asm.ByteVector byteVector2 = byteVector0.putUTF8("hi!");
        org.mockito.asm.ByteVector byteVector4 = byteVector0.putInt(0);
        org.mockito.asm.ByteVector byteVector6 = byteVector0.putShort(10);
        org.mockito.asm.ByteVector byteVector8 = byteVector0.putShort((int) (byte) -1);
        java.lang.Class<?> wildcardClass9 = byteVector0.getClass();
        org.junit.Assert.assertNotNull(byteVector2);
        org.junit.Assert.assertNotNull(byteVector4);
        org.junit.Assert.assertNotNull(byteVector6);
        org.junit.Assert.assertNotNull(byteVector8);
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test1255() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1255");
        org.mockito.asm.ByteVector byteVector1 = new org.mockito.asm.ByteVector((int) (byte) 100);
        org.mockito.asm.ByteVector byteVector3 = byteVector1.putShort((int) (short) 100);
        org.mockito.asm.ByteVector byteVector5 = byteVector1.putLong((long) (short) 10);
        org.mockito.asm.ByteVector byteVector7 = byteVector5.putByte((int) (byte) 0);
        org.mockito.asm.ByteVector byteVector9 = byteVector5.putByte((int) (short) 0);
        org.mockito.asm.ByteVector byteVector11 = byteVector5.putByte(10);
        org.junit.Assert.assertNotNull(byteVector3);
        org.junit.Assert.assertNotNull(byteVector5);
        org.junit.Assert.assertNotNull(byteVector7);
        org.junit.Assert.assertNotNull(byteVector9);
        org.junit.Assert.assertNotNull(byteVector11);
    }

    @Test
    public void test1256() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1256");
        org.mockito.asm.ByteVector byteVector0 = new org.mockito.asm.ByteVector();
        org.mockito.asm.ByteVector byteVector2 = byteVector0.putUTF8("hi!");
        org.mockito.asm.ByteVector byteVector4 = byteVector0.putInt(0);
        org.mockito.asm.ByteVector byteVector6 = byteVector4.putInt((int) ' ');
        org.mockito.asm.ByteVector byteVector8 = byteVector6.putLong((long) (short) 10);
        org.mockito.asm.ByteVector byteVector10 = byteVector8.putUTF8("hi!");
        org.mockito.asm.ByteVector byteVector12 = byteVector8.putByte(0);
        org.mockito.asm.ByteVector byteVector14 = byteVector12.putInt((int) (short) 1);
        org.mockito.asm.ByteVector byteVector16 = byteVector12.putShort((int) '4');
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
            org.mockito.asm.ByteVector byteVector40 = byteVector16.putByteArray(byteArray31, 100, 100);
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
    public void test1257() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1257");
        org.mockito.asm.ByteVector byteVector0 = new org.mockito.asm.ByteVector();
        org.mockito.asm.ByteVector byteVector2 = byteVector0.putUTF8("hi!");
        org.mockito.asm.ByteVector byteVector4 = byteVector0.putShort((int) (short) -1);
        org.mockito.asm.ByteVector byteVector6 = byteVector0.putInt((int) (byte) 10);
        org.mockito.asm.ByteVector byteVector8 = byteVector0.putByte((int) (short) 0);
        org.mockito.asm.ByteVector byteVector10 = byteVector8.putByte(0);
        java.lang.Class<?> wildcardClass11 = byteVector10.getClass();
        org.junit.Assert.assertNotNull(byteVector2);
        org.junit.Assert.assertNotNull(byteVector4);
        org.junit.Assert.assertNotNull(byteVector6);
        org.junit.Assert.assertNotNull(byteVector8);
        org.junit.Assert.assertNotNull(byteVector10);
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test1258() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1258");
        org.mockito.asm.ByteVector byteVector0 = new org.mockito.asm.ByteVector();
        org.mockito.asm.ByteVector byteVector2 = byteVector0.putUTF8("hi!");
        org.mockito.asm.ByteVector byteVector4 = byteVector2.putInt(0);
        org.mockito.asm.ByteVector byteVector6 = byteVector2.putByte((int) (byte) 10);
        org.mockito.asm.ByteVector byteVector8 = byteVector6.putLong(0L);
        org.mockito.asm.ByteVector byteVector10 = byteVector6.putInt((int) (short) 1);
        org.mockito.asm.ByteVector byteVector12 = byteVector6.putInt((int) (short) 10);
        org.junit.Assert.assertNotNull(byteVector2);
        org.junit.Assert.assertNotNull(byteVector4);
        org.junit.Assert.assertNotNull(byteVector6);
        org.junit.Assert.assertNotNull(byteVector8);
        org.junit.Assert.assertNotNull(byteVector10);
        org.junit.Assert.assertNotNull(byteVector12);
    }

    @Test
    public void test1259() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1259");
        org.mockito.asm.ByteVector byteVector0 = new org.mockito.asm.ByteVector();
        org.mockito.asm.ByteVector byteVector2 = byteVector0.putUTF8("hi!");
        org.mockito.asm.ByteVector byteVector4 = byteVector0.putLong((long) ' ');
        org.mockito.asm.ByteVector byteVector6 = byteVector4.putByte((int) 'a');
        org.mockito.asm.ByteVector byteVector8 = byteVector6.putByte((int) (short) -1);
        byte[] byteArray9 = null;
        org.mockito.asm.ByteVector byteVector12 = byteVector6.putByteArray(byteArray9, (int) '#', 0);
        org.mockito.asm.ByteVector byteVector14 = byteVector12.putLong((long) '4');
        java.lang.Class<?> wildcardClass15 = byteVector12.getClass();
        org.junit.Assert.assertNotNull(byteVector2);
        org.junit.Assert.assertNotNull(byteVector4);
        org.junit.Assert.assertNotNull(byteVector6);
        org.junit.Assert.assertNotNull(byteVector8);
        org.junit.Assert.assertNotNull(byteVector12);
        org.junit.Assert.assertNotNull(byteVector14);
        org.junit.Assert.assertNotNull(wildcardClass15);
    }

    @Test
    public void test1260() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1260");
        org.mockito.asm.ByteVector byteVector0 = new org.mockito.asm.ByteVector();
        org.mockito.asm.ByteVector byteVector2 = byteVector0.putUTF8("hi!");
        org.mockito.asm.ByteVector byteVector4 = byteVector0.putInt(0);
        org.mockito.asm.ByteVector byteVector6 = byteVector4.putInt((int) ' ');
        org.mockito.asm.ByteVector byteVector8 = byteVector6.putLong((long) (short) 10);
        org.mockito.asm.ByteVector byteVector10 = byteVector8.putUTF8("hi!");
        org.mockito.asm.ByteVector byteVector12 = byteVector8.putByte(0);
        org.mockito.asm.ByteVector byteVector14 = byteVector12.putInt((int) (short) 1);
        org.mockito.asm.ByteVector byteVector16 = byteVector12.putLong((long) (short) 0);
        org.mockito.asm.ByteVector byteVector18 = byteVector16.putShort((int) 'a');
        org.mockito.asm.ByteVector byteVector20 = byteVector16.putInt((int) (short) 100);
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
    public void test1261() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1261");
        org.mockito.asm.ByteVector byteVector1 = new org.mockito.asm.ByteVector(0);
        org.mockito.asm.ByteVector byteVector3 = byteVector1.putUTF8("hi!");
        org.mockito.asm.ByteVector byteVector5 = byteVector3.putByte((int) (short) 0);
        org.junit.Assert.assertNotNull(byteVector3);
        org.junit.Assert.assertNotNull(byteVector5);
    }

    @Test
    public void test1262() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1262");
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
        org.mockito.asm.ByteVector byteVector22 = byteVector20.putInt((int) (short) -1);
        org.mockito.asm.ByteVector byteVector24 = byteVector22.putLong(0L);
        org.mockito.asm.ByteVector byteVector26 = byteVector22.putInt((int) (byte) -1);
        org.mockito.asm.ByteVector byteVector28 = byteVector22.putShort((int) '#');
        org.mockito.asm.ByteVector byteVector30 = byteVector22.putInt((int) (byte) 0);
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
        org.junit.Assert.assertNotNull(byteVector30);
    }

    @Test
    public void test1263() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1263");
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
        org.mockito.asm.ByteVector byteVector22 = byteVector20.putShort((int) (short) 100);
        org.mockito.asm.ByteVector byteVector24 = byteVector20.putUTF8("hi!");
        org.mockito.asm.ByteVector byteVector26 = byteVector24.putInt((int) (byte) 1);
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
    public void test1264() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1264");
        org.mockito.asm.ByteVector byteVector0 = new org.mockito.asm.ByteVector();
        org.mockito.asm.ByteVector byteVector2 = byteVector0.putUTF8("hi!");
        org.mockito.asm.ByteVector byteVector4 = byteVector2.putLong((long) (byte) 10);
        org.mockito.asm.ByteVector byteVector6 = byteVector4.putUTF8("hi!");
        org.mockito.asm.ByteVector byteVector8 = byteVector4.putLong((-1L));
        org.mockito.asm.ByteVector byteVector10 = byteVector8.putInt(10);
        org.mockito.asm.ByteVector byteVector12 = byteVector10.putInt((int) (byte) 10);
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
    public void test1265() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1265");
        org.mockito.asm.ByteVector byteVector0 = new org.mockito.asm.ByteVector();
        org.mockito.asm.ByteVector byteVector2 = byteVector0.putUTF8("hi!");
        org.mockito.asm.ByteVector byteVector4 = byteVector0.putLong((long) ' ');
        org.mockito.asm.ByteVector byteVector6 = byteVector4.putByte((int) 'a');
        org.mockito.asm.ByteVector byteVector8 = byteVector4.putByte((int) (short) -1);
        org.mockito.asm.ByteVector byteVector10 = byteVector4.putLong(0L);
        org.mockito.asm.ByteVector byteVector12 = byteVector10.putByte(0);
        org.mockito.asm.ByteVector byteVector14 = byteVector10.putInt((int) (byte) 1);
        org.mockito.asm.ByteVector byteVector16 = byteVector14.putShort((-1));
        org.mockito.asm.ByteVector byteVector18 = byteVector14.putByte((int) (short) -1);
        org.mockito.asm.ByteVector byteVector20 = byteVector18.putByte((int) (byte) 1);
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
    public void test1266() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1266");
        org.mockito.asm.ByteVector byteVector0 = new org.mockito.asm.ByteVector();
        org.mockito.asm.ByteVector byteVector2 = byteVector0.putUTF8("hi!");
        org.mockito.asm.ByteVector byteVector4 = byteVector0.putInt(0);
        org.mockito.asm.ByteVector byteVector6 = byteVector0.putShort(10);
        org.mockito.asm.ByteVector byteVector8 = byteVector0.putUTF8("");
        org.mockito.asm.ByteVector byteVector10 = byteVector8.putUTF8("hi!");
        org.mockito.asm.ByteVector byteVector12 = byteVector10.putLong((long) (byte) 0);
        org.mockito.asm.ByteVector byteVector14 = byteVector10.putShort((int) '4');
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
    public void test1267() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1267");
        org.mockito.asm.ByteVector byteVector1 = new org.mockito.asm.ByteVector((int) (byte) 10);
        org.mockito.asm.ByteVector byteVector3 = byteVector1.putByte((-1));
        org.mockito.asm.ByteVector byteVector5 = byteVector1.putUTF8("");
        org.junit.Assert.assertNotNull(byteVector3);
        org.junit.Assert.assertNotNull(byteVector5);
    }

    @Test
    public void test1268() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1268");
        org.mockito.asm.ByteVector byteVector0 = new org.mockito.asm.ByteVector();
        org.mockito.asm.ByteVector byteVector2 = byteVector0.putUTF8("hi!");
        org.mockito.asm.ByteVector byteVector4 = byteVector2.putByte(100);
        org.mockito.asm.ByteVector byteVector6 = byteVector2.putShort((int) 'a');
        org.mockito.asm.ByteVector byteVector8 = byteVector6.putByte((int) (short) 1);
        org.mockito.asm.ByteVector byteVector10 = byteVector8.putLong((long) 0);
        org.mockito.asm.ByteVector byteVector12 = byteVector8.putLong((long) 1);
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
    public void test1269() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1269");
        org.mockito.asm.ByteVector byteVector0 = new org.mockito.asm.ByteVector();
        org.mockito.asm.ByteVector byteVector2 = byteVector0.putUTF8("hi!");
        org.mockito.asm.ByteVector byteVector4 = byteVector2.putInt(0);
        org.mockito.asm.ByteVector byteVector6 = byteVector2.putByte((int) (byte) 10);
        org.mockito.asm.ByteVector byteVector8 = byteVector6.putLong(0L);
        org.mockito.asm.ByteVector byteVector10 = byteVector8.putShort((int) 'a');
        org.mockito.asm.ByteVector byteVector12 = byteVector10.putLong((long) '4');
        org.mockito.asm.ByteVector byteVector14 = byteVector10.putInt((int) (byte) -1);
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
    public void test1270() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1270");
        org.mockito.asm.ByteVector byteVector0 = new org.mockito.asm.ByteVector();
        org.mockito.asm.ByteVector byteVector2 = byteVector0.putUTF8("hi!");
        org.mockito.asm.ByteVector byteVector4 = byteVector0.putShort((int) (short) -1);
        org.mockito.asm.ByteVector byteVector6 = byteVector0.putInt(0);
        org.mockito.asm.ByteVector byteVector8 = byteVector0.putUTF8("hi!");
        org.mockito.asm.ByteVector byteVector10 = byteVector8.putInt((int) (short) 0);
        org.mockito.asm.ByteVector byteVector12 = byteVector8.putByte(0);
        org.mockito.asm.ByteVector byteVector14 = byteVector12.putShort((int) '#');
        org.mockito.asm.ByteVector byteVector16 = byteVector12.putByte(0);
        byte[] byteArray22 = new byte[] { (byte) 100, (byte) 10, (byte) 100, (byte) 100, (byte) 0 };
        // The following exception was thrown during execution in test generation
        try {
            org.mockito.asm.ByteVector byteVector25 = byteVector16.putByteArray(byteArray22, (int) (byte) 100, (int) (byte) 10);
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
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray22), "[100, 10, 100, 100, 0]");
    }

    @Test
    public void test1271() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1271");
        org.mockito.asm.ByteVector byteVector0 = new org.mockito.asm.ByteVector();
        org.mockito.asm.ByteVector byteVector2 = byteVector0.putUTF8("hi!");
        org.mockito.asm.ByteVector byteVector4 = byteVector2.putInt(0);
        org.mockito.asm.ByteVector byteVector6 = byteVector4.putByte((int) (byte) 1);
        org.mockito.asm.ByteVector byteVector8 = byteVector6.putUTF8("hi!");
        org.mockito.asm.ByteVector byteVector10 = byteVector8.putShort((int) (short) 1);
        java.lang.Class<?> wildcardClass11 = byteVector10.getClass();
        org.junit.Assert.assertNotNull(byteVector2);
        org.junit.Assert.assertNotNull(byteVector4);
        org.junit.Assert.assertNotNull(byteVector6);
        org.junit.Assert.assertNotNull(byteVector8);
        org.junit.Assert.assertNotNull(byteVector10);
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test1272() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1272");
        org.mockito.asm.ByteVector byteVector0 = new org.mockito.asm.ByteVector();
        org.mockito.asm.ByteVector byteVector2 = byteVector0.putUTF8("hi!");
        org.mockito.asm.ByteVector byteVector4 = byteVector2.putInt((int) (byte) 10);
        org.mockito.asm.ByteVector byteVector6 = byteVector4.putUTF8("");
        org.mockito.asm.ByteVector byteVector8 = byteVector4.putLong((long) '#');
        org.mockito.asm.ByteVector byteVector10 = byteVector8.putLong((long) (short) 100);
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
    public void test1273() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1273");
        org.mockito.asm.ByteVector byteVector1 = new org.mockito.asm.ByteVector((int) '#');
        org.mockito.asm.ByteVector byteVector3 = byteVector1.putLong(100L);
        org.mockito.asm.ByteVector byteVector5 = byteVector3.putUTF8("");
        org.mockito.asm.ByteVector byteVector7 = byteVector3.putLong((-1L));
        org.mockito.asm.ByteVector byteVector9 = byteVector3.putInt((int) '#');
        org.mockito.asm.ByteVector byteVector11 = byteVector3.putLong(1L);
        org.junit.Assert.assertNotNull(byteVector3);
        org.junit.Assert.assertNotNull(byteVector5);
        org.junit.Assert.assertNotNull(byteVector7);
        org.junit.Assert.assertNotNull(byteVector9);
        org.junit.Assert.assertNotNull(byteVector11);
    }

    @Test
    public void test1274() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1274");
        org.mockito.asm.ByteVector byteVector0 = new org.mockito.asm.ByteVector();
        org.mockito.asm.ByteVector byteVector2 = byteVector0.putUTF8("hi!");
        org.mockito.asm.ByteVector byteVector4 = byteVector0.putShort((int) (short) 100);
        org.mockito.asm.ByteVector byteVector6 = byteVector4.putUTF8("hi!");
        org.mockito.asm.ByteVector byteVector8 = byteVector6.putByte((int) '4');
        org.mockito.asm.ByteVector byteVector10 = byteVector6.putShort(1);
        org.mockito.asm.ByteVector byteVector12 = byteVector6.putUTF8("");
        org.junit.Assert.assertNotNull(byteVector2);
        org.junit.Assert.assertNotNull(byteVector4);
        org.junit.Assert.assertNotNull(byteVector6);
        org.junit.Assert.assertNotNull(byteVector8);
        org.junit.Assert.assertNotNull(byteVector10);
        org.junit.Assert.assertNotNull(byteVector12);
    }

    @Test
    public void test1275() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1275");
        org.mockito.asm.ByteVector byteVector0 = new org.mockito.asm.ByteVector();
        org.mockito.asm.ByteVector byteVector2 = byteVector0.putUTF8("hi!");
        org.mockito.asm.ByteVector byteVector4 = byteVector0.putLong((long) ' ');
        org.mockito.asm.ByteVector byteVector6 = byteVector4.putByte((int) 'a');
        org.mockito.asm.ByteVector byteVector8 = byteVector4.putByte((int) (short) -1);
        org.mockito.asm.ByteVector byteVector10 = byteVector4.putLong(0L);
        org.mockito.asm.ByteVector byteVector12 = byteVector10.putByte((int) (short) -1);
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
    public void test1276() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1276");
        org.mockito.asm.ByteVector byteVector0 = new org.mockito.asm.ByteVector();
        org.mockito.asm.ByteVector byteVector2 = byteVector0.putUTF8("hi!");
        org.mockito.asm.ByteVector byteVector4 = byteVector2.putByte(100);
        org.mockito.asm.ByteVector byteVector6 = byteVector2.putShort((int) 'a');
        org.mockito.asm.ByteVector byteVector8 = byteVector6.putByte((int) (short) 1);
        org.mockito.asm.ByteVector byteVector10 = byteVector8.putLong((long) 0);
        org.mockito.asm.ByteVector byteVector12 = byteVector8.putLong((long) 1);
        org.mockito.asm.ByteVector byteVector13 = new org.mockito.asm.ByteVector();
        org.mockito.asm.ByteVector byteVector15 = byteVector13.putUTF8("hi!");
        org.mockito.asm.ByteVector byteVector17 = byteVector15.putInt(0);
        org.mockito.asm.ByteVector byteVector19 = byteVector17.putShort(1);
        org.mockito.asm.ByteVector byteVector20 = new org.mockito.asm.ByteVector();
        org.mockito.asm.ByteVector byteVector22 = byteVector20.putUTF8("hi!");
        org.mockito.asm.ByteVector byteVector24 = byteVector20.putShort((int) (short) -1);
        org.mockito.asm.ByteVector byteVector26 = byteVector20.putLong(0L);
        org.mockito.asm.ByteVector byteVector28 = byteVector20.putShort((int) (byte) -1);
        org.mockito.asm.ByteVector byteVector30 = byteVector28.putByte((int) (byte) 0);
        org.mockito.asm.ByteVector byteVector31 = new org.mockito.asm.ByteVector();
        org.mockito.asm.ByteVector byteVector33 = byteVector31.putUTF8("hi!");
        org.mockito.asm.ByteVector byteVector35 = byteVector31.putLong((long) ' ');
        org.mockito.asm.ByteVector byteVector37 = byteVector35.putByte((int) 'a');
        org.mockito.asm.ByteVector byteVector39 = byteVector35.putByte((int) (short) -1);
        org.mockito.asm.ByteVector byteVector41 = byteVector35.putLong(0L);
        org.mockito.asm.ByteVector byteVector43 = byteVector41.putByte(0);
        org.mockito.asm.ByteVector byteVector45 = byteVector43.putByte(100);
        org.mockito.asm.ByteVector byteVector47 = byteVector43.putByte((int) '4');
        org.mockito.asm.ByteVector byteVector49 = byteVector47.putUTF8("hi!");
        org.mockito.asm.ByteVector byteVector51 = byteVector47.putShort(100);
        org.mockito.asm.ByteVector byteVector53 = byteVector47.putShort((int) (short) 100);
        org.mockito.asm.ByteVector byteVector54 = new org.mockito.asm.ByteVector();
        org.mockito.asm.ByteVector byteVector56 = byteVector54.putUTF8("hi!");
        org.mockito.asm.ByteVector byteVector58 = byteVector54.putInt(0);
        org.mockito.asm.ByteVector byteVector60 = byteVector54.putShort((int) '4');
        org.mockito.asm.ByteVector byteVector62 = byteVector54.putByte(100);
        org.mockito.asm.ByteVector byteVector64 = byteVector62.putInt((int) (byte) 10);
        org.mockito.asm.ByteVector byteVector66 = byteVector62.putInt((int) (byte) 10);
        org.mockito.asm.ByteVector byteVector68 = byteVector66.putByte(100);
        org.mockito.asm.ByteVector byteVector69 = new org.mockito.asm.ByteVector();
        org.mockito.asm.ByteVector byteVector71 = byteVector69.putUTF8("hi!");
        org.mockito.asm.ByteVector byteVector73 = byteVector69.putInt(0);
        org.mockito.asm.ByteVector byteVector75 = byteVector73.putInt((int) ' ');
        org.mockito.asm.ByteVector byteVector77 = byteVector75.putLong(100L);
        byte[] byteArray81 = new byte[] { (byte) 0, (byte) 10, (byte) 1 };
        org.mockito.asm.ByteVector byteVector84 = byteVector75.putByteArray(byteArray81, 0, 0);
        org.mockito.asm.ByteVector byteVector87 = byteVector68.putByteArray(byteArray81, (int) (byte) 1, (int) (byte) 0);
        org.mockito.asm.ByteVector byteVector90 = byteVector53.putByteArray(byteArray81, 1, (int) (byte) 1);
        org.mockito.asm.ByteVector byteVector93 = byteVector30.putByteArray(byteArray81, (int) (byte) 1, 0);
        org.mockito.asm.ByteVector byteVector96 = byteVector17.putByteArray(byteArray81, 0, (int) (short) 0);
        // The following exception was thrown during execution in test generation
        try {
            org.mockito.asm.ByteVector byteVector99 = byteVector8.putByteArray(byteArray81, 0, (int) (short) -1);
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
        org.junit.Assert.assertNotNull(byteVector22);
        org.junit.Assert.assertNotNull(byteVector24);
        org.junit.Assert.assertNotNull(byteVector26);
        org.junit.Assert.assertNotNull(byteVector28);
        org.junit.Assert.assertNotNull(byteVector30);
        org.junit.Assert.assertNotNull(byteVector33);
        org.junit.Assert.assertNotNull(byteVector35);
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
        org.junit.Assert.assertNotNull(byteVector64);
        org.junit.Assert.assertNotNull(byteVector66);
        org.junit.Assert.assertNotNull(byteVector68);
        org.junit.Assert.assertNotNull(byteVector71);
        org.junit.Assert.assertNotNull(byteVector73);
        org.junit.Assert.assertNotNull(byteVector75);
        org.junit.Assert.assertNotNull(byteVector77);
        org.junit.Assert.assertNotNull(byteArray81);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray81), "[0, 10, 1]");
        org.junit.Assert.assertNotNull(byteVector84);
        org.junit.Assert.assertNotNull(byteVector87);
        org.junit.Assert.assertNotNull(byteVector90);
        org.junit.Assert.assertNotNull(byteVector93);
        org.junit.Assert.assertNotNull(byteVector96);
    }

    @Test
    public void test1277() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1277");
        org.mockito.asm.ByteVector byteVector0 = new org.mockito.asm.ByteVector();
        org.mockito.asm.ByteVector byteVector2 = byteVector0.putUTF8("hi!");
        org.mockito.asm.ByteVector byteVector4 = byteVector0.putShort((int) (short) -1);
        org.mockito.asm.ByteVector byteVector6 = byteVector4.putUTF8("");
        org.mockito.asm.ByteVector byteVector8 = byteVector4.putShort((int) (byte) 1);
        org.mockito.asm.ByteVector byteVector10 = byteVector8.putInt((int) (byte) 10);
        org.mockito.asm.ByteVector byteVector12 = byteVector8.putLong(100L);
        org.junit.Assert.assertNotNull(byteVector2);
        org.junit.Assert.assertNotNull(byteVector4);
        org.junit.Assert.assertNotNull(byteVector6);
        org.junit.Assert.assertNotNull(byteVector8);
        org.junit.Assert.assertNotNull(byteVector10);
        org.junit.Assert.assertNotNull(byteVector12);
    }

    @Test
    public void test1278() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1278");
        org.mockito.asm.ByteVector byteVector0 = new org.mockito.asm.ByteVector();
        org.mockito.asm.ByteVector byteVector2 = byteVector0.putUTF8("hi!");
        org.mockito.asm.ByteVector byteVector4 = byteVector0.putShort((int) (short) -1);
        org.mockito.asm.ByteVector byteVector6 = byteVector0.putLong(0L);
        org.mockito.asm.ByteVector byteVector8 = byteVector0.putShort((int) (byte) -1);
        org.mockito.asm.ByteVector byteVector10 = byteVector8.putByte((int) (byte) 0);
        org.mockito.asm.ByteVector byteVector12 = byteVector10.putUTF8("hi!");
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
    public void test1279() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1279");
        org.mockito.asm.ByteVector byteVector0 = new org.mockito.asm.ByteVector();
        org.mockito.asm.ByteVector byteVector2 = byteVector0.putUTF8("hi!");
        org.mockito.asm.ByteVector byteVector4 = byteVector2.putInt(0);
        org.mockito.asm.ByteVector byteVector6 = byteVector2.putByte((int) (byte) 10);
        org.mockito.asm.ByteVector byteVector8 = byteVector6.putUTF8("hi!");
        org.mockito.asm.ByteVector byteVector10 = byteVector8.putUTF8("hi!");
        org.mockito.asm.ByteVector byteVector12 = byteVector10.putByte((int) (short) -1);
        org.mockito.asm.ByteVector byteVector14 = byteVector10.putShort((int) '#');
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
        // The following exception was thrown during execution in test generation
        try {
            org.mockito.asm.ByteVector byteVector55 = byteVector10.putByteArray(byteArray46, (int) '#', (int) (byte) 1);
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
    public void test1280() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1280");
        org.mockito.asm.ByteVector byteVector1 = new org.mockito.asm.ByteVector((int) '#');
        org.mockito.asm.ByteVector byteVector3 = byteVector1.putInt(100);
        org.mockito.asm.ByteVector byteVector5 = byteVector1.putInt(0);
        org.mockito.asm.ByteVector byteVector7 = byteVector5.putShort((int) (short) 0);
        org.mockito.asm.ByteVector byteVector9 = byteVector7.putShort(0);
        org.mockito.asm.ByteVector byteVector11 = byteVector7.putShort(10);
        org.mockito.asm.ByteVector byteVector13 = byteVector11.putUTF8("");
        org.junit.Assert.assertNotNull(byteVector3);
        org.junit.Assert.assertNotNull(byteVector5);
        org.junit.Assert.assertNotNull(byteVector7);
        org.junit.Assert.assertNotNull(byteVector9);
        org.junit.Assert.assertNotNull(byteVector11);
        org.junit.Assert.assertNotNull(byteVector13);
    }

    @Test
    public void test1281() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1281");
        org.mockito.asm.ByteVector byteVector0 = new org.mockito.asm.ByteVector();
        org.mockito.asm.ByteVector byteVector2 = byteVector0.putUTF8("hi!");
        org.mockito.asm.ByteVector byteVector4 = byteVector2.putInt((int) (byte) 10);
        org.mockito.asm.ByteVector byteVector6 = byteVector2.putLong((long) 10);
        org.mockito.asm.ByteVector byteVector8 = byteVector2.putLong(0L);
        org.mockito.asm.ByteVector byteVector10 = byteVector8.putUTF8("hi!");
        org.mockito.asm.ByteVector byteVector12 = byteVector10.putLong((long) 'a');
        org.junit.Assert.assertNotNull(byteVector2);
        org.junit.Assert.assertNotNull(byteVector4);
        org.junit.Assert.assertNotNull(byteVector6);
        org.junit.Assert.assertNotNull(byteVector8);
        org.junit.Assert.assertNotNull(byteVector10);
        org.junit.Assert.assertNotNull(byteVector12);
    }

    @Test
    public void test1282() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1282");
        org.mockito.asm.ByteVector byteVector0 = new org.mockito.asm.ByteVector();
        org.mockito.asm.ByteVector byteVector2 = byteVector0.putUTF8("hi!");
        org.mockito.asm.ByteVector byteVector4 = byteVector2.putLong((long) (byte) 10);
        org.mockito.asm.ByteVector byteVector6 = byteVector4.putInt((int) 'a');
        org.mockito.asm.ByteVector byteVector8 = byteVector6.putUTF8("hi!");
        org.mockito.asm.ByteVector byteVector10 = byteVector8.putByte((-1));
        org.mockito.asm.ByteVector byteVector12 = byteVector8.putInt((int) '#');
        org.mockito.asm.ByteVector byteVector14 = byteVector12.putUTF8("hi!");
        org.mockito.asm.ByteVector byteVector15 = new org.mockito.asm.ByteVector();
        org.mockito.asm.ByteVector byteVector17 = byteVector15.putUTF8("hi!");
        org.mockito.asm.ByteVector byteVector19 = byteVector17.putInt(0);
        org.mockito.asm.ByteVector byteVector21 = byteVector19.putShort((int) '4');
        org.mockito.asm.ByteVector byteVector23 = byteVector21.putByte(100);
        org.mockito.asm.ByteVector byteVector25 = byteVector21.putInt((int) (byte) 10);
        org.mockito.asm.ByteVector byteVector27 = byteVector25.putUTF8("");
        org.mockito.asm.ByteVector byteVector29 = byteVector25.putInt(1);
        org.mockito.asm.ByteVector byteVector30 = new org.mockito.asm.ByteVector();
        org.mockito.asm.ByteVector byteVector32 = byteVector30.putUTF8("hi!");
        org.mockito.asm.ByteVector byteVector34 = byteVector32.putInt(0);
        org.mockito.asm.ByteVector byteVector36 = byteVector34.putByte((int) (short) 0);
        org.mockito.asm.ByteVector byteVector38 = byteVector34.putUTF8("");
        org.mockito.asm.ByteVector byteVector39 = new org.mockito.asm.ByteVector();
        org.mockito.asm.ByteVector byteVector41 = byteVector39.putUTF8("hi!");
        org.mockito.asm.ByteVector byteVector43 = byteVector39.putInt(0);
        org.mockito.asm.ByteVector byteVector45 = byteVector39.putShort((int) '4');
        org.mockito.asm.ByteVector byteVector47 = byteVector39.putByte(100);
        org.mockito.asm.ByteVector byteVector49 = byteVector47.putInt((int) (byte) 10);
        org.mockito.asm.ByteVector byteVector51 = byteVector47.putInt((int) (byte) 10);
        org.mockito.asm.ByteVector byteVector53 = byteVector51.putByte(100);
        org.mockito.asm.ByteVector byteVector54 = new org.mockito.asm.ByteVector();
        org.mockito.asm.ByteVector byteVector56 = byteVector54.putUTF8("hi!");
        org.mockito.asm.ByteVector byteVector58 = byteVector54.putInt(0);
        org.mockito.asm.ByteVector byteVector60 = byteVector58.putInt((int) ' ');
        org.mockito.asm.ByteVector byteVector62 = byteVector60.putLong(100L);
        byte[] byteArray66 = new byte[] { (byte) 0, (byte) 10, (byte) 1 };
        org.mockito.asm.ByteVector byteVector69 = byteVector60.putByteArray(byteArray66, 0, 0);
        org.mockito.asm.ByteVector byteVector72 = byteVector53.putByteArray(byteArray66, (int) (byte) 1, (int) (byte) 0);
        org.mockito.asm.ByteVector byteVector75 = byteVector34.putByteArray(byteArray66, (int) (short) 0, 0);
        org.mockito.asm.ByteVector byteVector78 = byteVector29.putByteArray(byteArray66, 0, 0);
        // The following exception was thrown during execution in test generation
        try {
            org.mockito.asm.ByteVector byteVector81 = byteVector14.putByteArray(byteArray66, 0, (int) (short) 100);
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
        org.junit.Assert.assertNotNull(byteVector78);
    }

    @Test
    public void test1283() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1283");
        org.mockito.asm.ByteVector byteVector0 = new org.mockito.asm.ByteVector();
        org.mockito.asm.ByteVector byteVector2 = byteVector0.putUTF8("hi!");
        org.mockito.asm.ByteVector byteVector4 = byteVector0.putLong((long) ' ');
        org.mockito.asm.ByteVector byteVector6 = byteVector4.putByte((int) 'a');
        org.mockito.asm.ByteVector byteVector8 = byteVector6.putInt((int) (short) 0);
        org.mockito.asm.ByteVector byteVector10 = byteVector8.putByte((int) (short) 0);
        org.mockito.asm.ByteVector byteVector12 = byteVector8.putUTF8("");
        org.junit.Assert.assertNotNull(byteVector2);
        org.junit.Assert.assertNotNull(byteVector4);
        org.junit.Assert.assertNotNull(byteVector6);
        org.junit.Assert.assertNotNull(byteVector8);
        org.junit.Assert.assertNotNull(byteVector10);
        org.junit.Assert.assertNotNull(byteVector12);
    }

    @Test
    public void test1284() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1284");
        org.mockito.asm.ByteVector byteVector1 = new org.mockito.asm.ByteVector((int) '#');
        org.mockito.asm.ByteVector byteVector3 = byteVector1.putLong(100L);
        org.mockito.asm.ByteVector byteVector5 = byteVector1.putUTF8("");
        org.mockito.asm.ByteVector byteVector7 = byteVector1.putUTF8("hi!");
        org.mockito.asm.ByteVector byteVector9 = byteVector7.putLong((long) (short) 0);
        org.mockito.asm.ByteVector byteVector11 = byteVector7.putLong((long) (byte) -1);
        org.mockito.asm.ByteVector byteVector13 = byteVector11.putUTF8("hi!");
        java.lang.Class<?> wildcardClass14 = byteVector13.getClass();
        org.junit.Assert.assertNotNull(byteVector3);
        org.junit.Assert.assertNotNull(byteVector5);
        org.junit.Assert.assertNotNull(byteVector7);
        org.junit.Assert.assertNotNull(byteVector9);
        org.junit.Assert.assertNotNull(byteVector11);
        org.junit.Assert.assertNotNull(byteVector13);
        org.junit.Assert.assertNotNull(wildcardClass14);
    }

    @Test
    public void test1285() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1285");
        org.mockito.asm.ByteVector byteVector0 = new org.mockito.asm.ByteVector();
        org.mockito.asm.ByteVector byteVector2 = byteVector0.putUTF8("hi!");
        org.mockito.asm.ByteVector byteVector4 = byteVector0.putShort((int) (short) -1);
        org.mockito.asm.ByteVector byteVector6 = byteVector0.putInt((int) (byte) 10);
        org.mockito.asm.ByteVector byteVector8 = byteVector6.putUTF8("hi!");
        org.mockito.asm.ByteVector byteVector10 = byteVector8.putByte((int) (byte) 1);
        org.mockito.asm.ByteVector byteVector12 = byteVector10.putUTF8("hi!");
        org.mockito.asm.ByteVector byteVector14 = byteVector12.putByte((int) (byte) 10);
        org.mockito.asm.ByteVector byteVector16 = byteVector14.putShort((int) (short) 0);
        org.mockito.asm.ByteVector byteVector18 = byteVector14.putLong((long) (short) 0);
        org.mockito.asm.ByteVector byteVector20 = byteVector14.putLong(0L);
        org.mockito.asm.ByteVector byteVector22 = byteVector14.putInt((int) (short) -1);
        org.mockito.asm.ByteVector byteVector24 = byteVector22.putByte((int) '4');
        org.mockito.asm.ByteVector byteVector26 = byteVector24.putShort((int) 'a');
        org.mockito.asm.ByteVector byteVector28 = byteVector26.putLong((long) 100);
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
    public void test1286() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1286");
        org.mockito.asm.ByteVector byteVector0 = new org.mockito.asm.ByteVector();
        org.mockito.asm.ByteVector byteVector2 = byteVector0.putUTF8("hi!");
        org.mockito.asm.ByteVector byteVector4 = byteVector0.putByte((int) (byte) 1);
        org.mockito.asm.ByteVector byteVector6 = byteVector4.putShort((int) (byte) 1);
        java.lang.Class<?> wildcardClass7 = byteVector4.getClass();
        org.junit.Assert.assertNotNull(byteVector2);
        org.junit.Assert.assertNotNull(byteVector4);
        org.junit.Assert.assertNotNull(byteVector6);
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test1287() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1287");
        org.mockito.asm.ByteVector byteVector0 = new org.mockito.asm.ByteVector();
        org.mockito.asm.ByteVector byteVector2 = byteVector0.putUTF8("hi!");
        org.mockito.asm.ByteVector byteVector4 = byteVector2.putInt(0);
        org.mockito.asm.ByteVector byteVector6 = byteVector2.putShort((int) (byte) 10);
        org.mockito.asm.ByteVector byteVector8 = byteVector2.putUTF8("");
        org.mockito.asm.ByteVector byteVector10 = byteVector2.putUTF8("hi!");
        org.mockito.asm.ByteVector byteVector12 = byteVector2.putByte((int) 'a');
        org.mockito.asm.ByteVector byteVector13 = new org.mockito.asm.ByteVector();
        org.mockito.asm.ByteVector byteVector15 = byteVector13.putUTF8("hi!");
        org.mockito.asm.ByteVector byteVector17 = byteVector15.putByte(100);
        org.mockito.asm.ByteVector byteVector19 = byteVector15.putLong((long) 10);
        org.mockito.asm.ByteVector byteVector21 = byteVector15.putShort((int) (short) -1);
        org.mockito.asm.ByteVector byteVector22 = new org.mockito.asm.ByteVector();
        org.mockito.asm.ByteVector byteVector24 = byteVector22.putUTF8("hi!");
        org.mockito.asm.ByteVector byteVector26 = byteVector22.putLong((long) ' ');
        org.mockito.asm.ByteVector byteVector28 = byteVector26.putByte((int) 'a');
        org.mockito.asm.ByteVector byteVector30 = byteVector26.putByte((int) (short) -1);
        org.mockito.asm.ByteVector byteVector32 = byteVector26.putLong(0L);
        org.mockito.asm.ByteVector byteVector34 = byteVector32.putByte(0);
        org.mockito.asm.ByteVector byteVector36 = byteVector34.putByte(100);
        org.mockito.asm.ByteVector byteVector38 = byteVector34.putByte((int) '4');
        org.mockito.asm.ByteVector byteVector40 = byteVector38.putUTF8("hi!");
        org.mockito.asm.ByteVector byteVector42 = byteVector38.putShort(100);
        org.mockito.asm.ByteVector byteVector44 = byteVector38.putShort((int) (short) 100);
        org.mockito.asm.ByteVector byteVector45 = new org.mockito.asm.ByteVector();
        org.mockito.asm.ByteVector byteVector47 = byteVector45.putUTF8("hi!");
        org.mockito.asm.ByteVector byteVector49 = byteVector45.putInt(0);
        org.mockito.asm.ByteVector byteVector51 = byteVector45.putShort((int) '4');
        org.mockito.asm.ByteVector byteVector53 = byteVector45.putByte(100);
        org.mockito.asm.ByteVector byteVector55 = byteVector53.putInt((int) (byte) 10);
        org.mockito.asm.ByteVector byteVector57 = byteVector53.putInt((int) (byte) 10);
        org.mockito.asm.ByteVector byteVector59 = byteVector57.putByte(100);
        org.mockito.asm.ByteVector byteVector60 = new org.mockito.asm.ByteVector();
        org.mockito.asm.ByteVector byteVector62 = byteVector60.putUTF8("hi!");
        org.mockito.asm.ByteVector byteVector64 = byteVector60.putInt(0);
        org.mockito.asm.ByteVector byteVector66 = byteVector64.putInt((int) ' ');
        org.mockito.asm.ByteVector byteVector68 = byteVector66.putLong(100L);
        byte[] byteArray72 = new byte[] { (byte) 0, (byte) 10, (byte) 1 };
        org.mockito.asm.ByteVector byteVector75 = byteVector66.putByteArray(byteArray72, 0, 0);
        org.mockito.asm.ByteVector byteVector78 = byteVector59.putByteArray(byteArray72, (int) (byte) 1, (int) (byte) 0);
        org.mockito.asm.ByteVector byteVector81 = byteVector44.putByteArray(byteArray72, 1, (int) (byte) 1);
        org.mockito.asm.ByteVector byteVector84 = byteVector15.putByteArray(byteArray72, 1, 1);
        // The following exception was thrown during execution in test generation
        try {
            org.mockito.asm.ByteVector byteVector87 = byteVector12.putByteArray(byteArray72, (-1), (int) (short) 10);
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
        org.junit.Assert.assertNotNull(byteVector38);
        org.junit.Assert.assertNotNull(byteVector40);
        org.junit.Assert.assertNotNull(byteVector42);
        org.junit.Assert.assertNotNull(byteVector44);
        org.junit.Assert.assertNotNull(byteVector47);
        org.junit.Assert.assertNotNull(byteVector49);
        org.junit.Assert.assertNotNull(byteVector51);
        org.junit.Assert.assertNotNull(byteVector53);
        org.junit.Assert.assertNotNull(byteVector55);
        org.junit.Assert.assertNotNull(byteVector57);
        org.junit.Assert.assertNotNull(byteVector59);
        org.junit.Assert.assertNotNull(byteVector62);
        org.junit.Assert.assertNotNull(byteVector64);
        org.junit.Assert.assertNotNull(byteVector66);
        org.junit.Assert.assertNotNull(byteVector68);
        org.junit.Assert.assertNotNull(byteArray72);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray72), "[0, 10, 1]");
        org.junit.Assert.assertNotNull(byteVector75);
        org.junit.Assert.assertNotNull(byteVector78);
        org.junit.Assert.assertNotNull(byteVector81);
        org.junit.Assert.assertNotNull(byteVector84);
    }

    @Test
    public void test1288() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1288");
        org.mockito.asm.ByteVector byteVector0 = new org.mockito.asm.ByteVector();
        org.mockito.asm.ByteVector byteVector2 = byteVector0.putUTF8("hi!");
        org.mockito.asm.ByteVector byteVector4 = byteVector0.putLong((long) ' ');
        org.mockito.asm.ByteVector byteVector6 = byteVector4.putByte((int) 'a');
        org.mockito.asm.ByteVector byteVector8 = byteVector4.putByte((int) (short) -1);
        org.mockito.asm.ByteVector byteVector10 = byteVector4.putLong(0L);
        org.mockito.asm.ByteVector byteVector12 = byteVector10.putInt((int) (short) -1);
        org.mockito.asm.ByteVector byteVector14 = byteVector12.putByte(100);
        org.mockito.asm.ByteVector byteVector16 = byteVector12.putShort((int) (short) 10);
        org.mockito.asm.ByteVector byteVector18 = byteVector12.putLong((long) (short) 100);
        org.mockito.asm.ByteVector byteVector20 = byteVector12.putByte(1);
        org.mockito.asm.ByteVector byteVector22 = byteVector12.putInt((int) (short) 1);
        org.mockito.asm.ByteVector byteVector24 = byteVector22.putLong((long) (-1));
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
    public void test1289() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1289");
        org.mockito.asm.ByteVector byteVector1 = new org.mockito.asm.ByteVector((int) (byte) 10);
        org.mockito.asm.ByteVector byteVector3 = byteVector1.putByte((int) '4');
        org.mockito.asm.ByteVector byteVector5 = byteVector1.putLong((long) 'a');
        org.mockito.asm.ByteVector byteVector7 = byteVector1.putUTF8("");
        org.mockito.asm.ByteVector byteVector9 = byteVector1.putUTF8("");
        org.mockito.asm.ByteVector byteVector11 = byteVector9.putShort((int) (short) -1);
        java.lang.Class<?> wildcardClass12 = byteVector11.getClass();
        org.junit.Assert.assertNotNull(byteVector3);
        org.junit.Assert.assertNotNull(byteVector5);
        org.junit.Assert.assertNotNull(byteVector7);
        org.junit.Assert.assertNotNull(byteVector9);
        org.junit.Assert.assertNotNull(byteVector11);
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test1290() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1290");
        org.mockito.asm.ByteVector byteVector0 = new org.mockito.asm.ByteVector();
        org.mockito.asm.ByteVector byteVector2 = byteVector0.putUTF8("hi!");
        org.mockito.asm.ByteVector byteVector4 = byteVector2.putInt((int) (byte) 10);
        org.mockito.asm.ByteVector byteVector6 = byteVector4.putUTF8("");
        org.mockito.asm.ByteVector byteVector8 = byteVector6.putUTF8("hi!");
        org.mockito.asm.ByteVector byteVector10 = byteVector6.putInt((int) (byte) 1);
        org.mockito.asm.ByteVector byteVector12 = byteVector6.putUTF8("");
        org.mockito.asm.ByteVector byteVector14 = byteVector6.putInt(1);
        org.mockito.asm.ByteVector byteVector16 = byteVector14.putShort((int) '4');
        org.mockito.asm.ByteVector byteVector18 = byteVector14.putLong((long) (byte) -1);
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
    public void test1291() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1291");
        org.mockito.asm.ByteVector byteVector0 = new org.mockito.asm.ByteVector();
        org.mockito.asm.ByteVector byteVector2 = byteVector0.putUTF8("hi!");
        org.mockito.asm.ByteVector byteVector4 = byteVector2.putLong((long) (byte) 10);
        org.mockito.asm.ByteVector byteVector6 = byteVector4.putUTF8("hi!");
        org.mockito.asm.ByteVector byteVector8 = byteVector4.putLong((long) 10);
        org.mockito.asm.ByteVector byteVector10 = byteVector8.putLong(0L);
        org.mockito.asm.ByteVector byteVector12 = byteVector10.putUTF8("hi!");
        org.mockito.asm.ByteVector byteVector14 = byteVector10.putShort(1);
        org.mockito.asm.ByteVector byteVector16 = byteVector14.putLong((long) (short) 100);
        org.mockito.asm.ByteVector byteVector18 = byteVector16.putUTF8("hi!");
        org.mockito.asm.ByteVector byteVector19 = new org.mockito.asm.ByteVector();
        org.mockito.asm.ByteVector byteVector21 = byteVector19.putUTF8("hi!");
        org.mockito.asm.ByteVector byteVector23 = byteVector19.putShort((int) (short) -1);
        org.mockito.asm.ByteVector byteVector25 = byteVector19.putInt((int) (byte) 10);
        org.mockito.asm.ByteVector byteVector27 = byteVector25.putUTF8("hi!");
        org.mockito.asm.ByteVector byteVector29 = byteVector27.putByte((int) (byte) 1);
        org.mockito.asm.ByteVector byteVector31 = byteVector27.putInt((int) (byte) -1);
        org.mockito.asm.ByteVector byteVector32 = new org.mockito.asm.ByteVector();
        org.mockito.asm.ByteVector byteVector34 = byteVector32.putUTF8("hi!");
        org.mockito.asm.ByteVector byteVector36 = byteVector32.putLong((long) ' ');
        org.mockito.asm.ByteVector byteVector38 = byteVector36.putByte((int) 'a');
        org.mockito.asm.ByteVector byteVector40 = byteVector36.putByte((int) (short) -1);
        org.mockito.asm.ByteVector byteVector42 = byteVector36.putLong(0L);
        org.mockito.asm.ByteVector byteVector44 = byteVector36.putUTF8("hi!");
        org.mockito.asm.ByteVector byteVector46 = byteVector44.putUTF8("");
        org.mockito.asm.ByteVector byteVector48 = byteVector44.putInt((int) (byte) 10);
        org.mockito.asm.ByteVector byteVector50 = byteVector48.putLong((long) (short) -1);
        org.mockito.asm.ByteVector byteVector52 = byteVector48.putByte(0);
        org.mockito.asm.ByteVector byteVector53 = new org.mockito.asm.ByteVector();
        org.mockito.asm.ByteVector byteVector55 = byteVector53.putUTF8("hi!");
        org.mockito.asm.ByteVector byteVector57 = byteVector55.putInt(0);
        org.mockito.asm.ByteVector byteVector59 = byteVector55.putByte((int) (byte) 10);
        org.mockito.asm.ByteVector byteVector61 = byteVector59.putLong((-1L));
        org.mockito.asm.ByteVector byteVector63 = byteVector59.putInt((int) (byte) 100);
        org.mockito.asm.ByteVector byteVector64 = new org.mockito.asm.ByteVector();
        org.mockito.asm.ByteVector byteVector66 = byteVector64.putUTF8("hi!");
        org.mockito.asm.ByteVector byteVector68 = byteVector64.putInt(0);
        org.mockito.asm.ByteVector byteVector70 = byteVector68.putInt((int) ' ');
        org.mockito.asm.ByteVector byteVector72 = byteVector70.putLong(100L);
        byte[] byteArray76 = new byte[] { (byte) 0, (byte) 10, (byte) 1 };
        org.mockito.asm.ByteVector byteVector79 = byteVector70.putByteArray(byteArray76, 0, 0);
        org.mockito.asm.ByteVector byteVector82 = byteVector59.putByteArray(byteArray76, (int) (byte) 1, 0);
        org.mockito.asm.ByteVector byteVector85 = byteVector52.putByteArray(byteArray76, 1, 0);
        org.mockito.asm.ByteVector byteVector88 = byteVector27.putByteArray(byteArray76, 1, (int) (byte) 1);
        // The following exception was thrown during execution in test generation
        try {
            org.mockito.asm.ByteVector byteVector91 = byteVector18.putByteArray(byteArray76, (int) (short) 100, (int) (byte) 10);
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
        org.junit.Assert.assertNotNull(byteVector34);
        org.junit.Assert.assertNotNull(byteVector36);
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
        org.junit.Assert.assertNotNull(byteVector66);
        org.junit.Assert.assertNotNull(byteVector68);
        org.junit.Assert.assertNotNull(byteVector70);
        org.junit.Assert.assertNotNull(byteVector72);
        org.junit.Assert.assertNotNull(byteArray76);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray76), "[0, 10, 1]");
        org.junit.Assert.assertNotNull(byteVector79);
        org.junit.Assert.assertNotNull(byteVector82);
        org.junit.Assert.assertNotNull(byteVector85);
        org.junit.Assert.assertNotNull(byteVector88);
    }

    @Test
    public void test1292() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1292");
        org.mockito.asm.ByteVector byteVector0 = new org.mockito.asm.ByteVector();
        org.mockito.asm.ByteVector byteVector2 = byteVector0.putUTF8("hi!");
        org.mockito.asm.ByteVector byteVector4 = byteVector2.putByte(100);
        org.mockito.asm.ByteVector byteVector6 = byteVector2.putShort((int) 'a');
        org.mockito.asm.ByteVector byteVector8 = byteVector6.putShort((int) (short) 0);
        org.mockito.asm.ByteVector byteVector10 = byteVector6.putInt((int) '4');
        org.mockito.asm.ByteVector byteVector12 = byteVector6.putLong(0L);
        org.mockito.asm.ByteVector byteVector14 = byteVector6.putShort((int) (byte) 1);
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
    public void test1293() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1293");
        org.mockito.asm.ByteVector byteVector0 = new org.mockito.asm.ByteVector();
        org.mockito.asm.ByteVector byteVector2 = byteVector0.putUTF8("hi!");
        org.mockito.asm.ByteVector byteVector4 = byteVector2.putInt((int) (byte) 10);
        org.mockito.asm.ByteVector byteVector6 = byteVector4.putUTF8("");
        org.mockito.asm.ByteVector byteVector8 = byteVector6.putUTF8("hi!");
        org.mockito.asm.ByteVector byteVector10 = byteVector6.putInt((int) '#');
        org.mockito.asm.ByteVector byteVector12 = byteVector10.putInt((int) (short) 0);
        org.mockito.asm.ByteVector byteVector14 = byteVector10.putShort((int) (short) 10);
        org.mockito.asm.ByteVector byteVector16 = byteVector14.putLong((long) 'a');
        org.mockito.asm.ByteVector byteVector18 = byteVector14.putLong((long) (byte) 1);
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
            org.mockito.asm.ByteVector byteVector59 = byteVector18.putByteArray(byteArray50, (int) (byte) 10, 0);
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
    public void test1294() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1294");
        org.mockito.asm.ByteVector byteVector1 = new org.mockito.asm.ByteVector((int) '#');
        org.mockito.asm.ByteVector byteVector3 = byteVector1.putShort(0);
        org.mockito.asm.ByteVector byteVector5 = byteVector1.putInt((int) (short) 1);
        org.mockito.asm.ByteVector byteVector7 = byteVector5.putShort((int) (short) 100);
        org.mockito.asm.ByteVector byteVector9 = byteVector5.putInt((int) ' ');
        org.junit.Assert.assertNotNull(byteVector3);
        org.junit.Assert.assertNotNull(byteVector5);
        org.junit.Assert.assertNotNull(byteVector7);
        org.junit.Assert.assertNotNull(byteVector9);
    }

    @Test
    public void test1295() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1295");
        org.mockito.asm.ByteVector byteVector1 = new org.mockito.asm.ByteVector(100);
        org.mockito.asm.ByteVector byteVector3 = byteVector1.putLong((long) (byte) -1);
        org.mockito.asm.ByteVector byteVector5 = byteVector1.putShort(0);
        org.junit.Assert.assertNotNull(byteVector3);
        org.junit.Assert.assertNotNull(byteVector5);
    }

    @Test
    public void test1296() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1296");
        org.mockito.asm.ByteVector byteVector1 = new org.mockito.asm.ByteVector((int) (byte) 1);
        org.mockito.asm.ByteVector byteVector3 = byteVector1.putByte((int) (byte) 10);
        org.mockito.asm.ByteVector byteVector5 = byteVector3.putShort((int) (short) 10);
        org.mockito.asm.ByteVector byteVector7 = byteVector3.putUTF8("");
        org.mockito.asm.ByteVector byteVector9 = byteVector7.putShort(0);
        org.mockito.asm.ByteVector byteVector11 = byteVector7.putShort((int) (short) -1);
        org.mockito.asm.ByteVector byteVector13 = byteVector11.putInt((int) (short) 10);
        org.junit.Assert.assertNotNull(byteVector3);
        org.junit.Assert.assertNotNull(byteVector5);
        org.junit.Assert.assertNotNull(byteVector7);
        org.junit.Assert.assertNotNull(byteVector9);
        org.junit.Assert.assertNotNull(byteVector11);
        org.junit.Assert.assertNotNull(byteVector13);
    }

    @Test
    public void test1297() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1297");
        org.mockito.asm.ByteVector byteVector1 = new org.mockito.asm.ByteVector((int) '#');
        org.mockito.asm.ByteVector byteVector3 = byteVector1.putInt(100);
        org.mockito.asm.ByteVector byteVector5 = byteVector3.putUTF8("hi!");
        org.mockito.asm.ByteVector byteVector7 = byteVector3.putInt((int) (short) -1);
        org.mockito.asm.ByteVector byteVector9 = byteVector3.putLong(1L);
        org.junit.Assert.assertNotNull(byteVector3);
        org.junit.Assert.assertNotNull(byteVector5);
        org.junit.Assert.assertNotNull(byteVector7);
        org.junit.Assert.assertNotNull(byteVector9);
    }

    @Test
    public void test1298() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1298");
        org.mockito.asm.ByteVector byteVector0 = new org.mockito.asm.ByteVector();
        org.mockito.asm.ByteVector byteVector2 = byteVector0.putUTF8("hi!");
        org.mockito.asm.ByteVector byteVector4 = byteVector2.putInt(0);
        org.mockito.asm.ByteVector byteVector6 = byteVector4.putShort((int) '4');
        org.mockito.asm.ByteVector byteVector8 = byteVector6.putByte(100);
        org.mockito.asm.ByteVector byteVector10 = byteVector6.putInt((int) (byte) 10);
        org.mockito.asm.ByteVector byteVector12 = byteVector10.putUTF8("");
        org.mockito.asm.ByteVector byteVector14 = byteVector10.putInt((int) '4');
        org.mockito.asm.ByteVector byteVector16 = byteVector14.putInt((int) (byte) 100);
        org.mockito.asm.ByteVector byteVector18 = byteVector16.putLong((long) (byte) 100);
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
    public void test1299() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1299");
        org.mockito.asm.ByteVector byteVector1 = new org.mockito.asm.ByteVector((int) '#');
        org.mockito.asm.ByteVector byteVector3 = byteVector1.putLong(100L);
        org.mockito.asm.ByteVector byteVector5 = byteVector1.putUTF8("");
        org.mockito.asm.ByteVector byteVector7 = byteVector1.putUTF8("hi!");
        org.mockito.asm.ByteVector byteVector9 = byteVector7.putLong((long) (short) 0);
        org.mockito.asm.ByteVector byteVector11 = byteVector9.putShort((int) (byte) 10);
        org.mockito.asm.ByteVector byteVector13 = byteVector11.putShort(100);
        org.mockito.asm.ByteVector byteVector15 = byteVector11.putShort((int) '#');
        org.mockito.asm.ByteVector byteVector16 = new org.mockito.asm.ByteVector();
        org.mockito.asm.ByteVector byteVector18 = byteVector16.putUTF8("hi!");
        org.mockito.asm.ByteVector byteVector20 = byteVector18.putByte(100);
        org.mockito.asm.ByteVector byteVector22 = byteVector18.putShort((int) 'a');
        org.mockito.asm.ByteVector byteVector24 = byteVector22.putShort((int) (short) 0);
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
        org.mockito.asm.ByteVector byteVector57 = byteVector22.putByteArray(byteArray48, (int) (byte) 1, (int) (short) 1);
        // The following exception was thrown during execution in test generation
        try {
            org.mockito.asm.ByteVector byteVector60 = byteVector11.putByteArray(byteArray48, (int) '#', (int) (byte) 100);
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
    public void test1300() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1300");
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
        org.mockito.asm.ByteVector byteVector24 = byteVector20.putByte((int) (short) 0);
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
    public void test1301() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1301");
        org.mockito.asm.ByteVector byteVector0 = new org.mockito.asm.ByteVector();
        org.mockito.asm.ByteVector byteVector2 = byteVector0.putUTF8("hi!");
        org.mockito.asm.ByteVector byteVector4 = byteVector0.putShort((int) (short) -1);
        org.mockito.asm.ByteVector byteVector6 = byteVector0.putInt((int) (byte) 10);
        org.mockito.asm.ByteVector byteVector8 = byteVector0.putLong((long) (byte) 0);
        org.mockito.asm.ByteVector byteVector10 = byteVector0.putLong((long) (byte) 100);
        org.mockito.asm.ByteVector byteVector12 = byteVector0.putLong((long) 1);
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
    public void test1302() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1302");
        org.mockito.asm.ByteVector byteVector1 = new org.mockito.asm.ByteVector((int) '#');
        org.mockito.asm.ByteVector byteVector3 = byteVector1.putLong(100L);
        org.mockito.asm.ByteVector byteVector5 = byteVector3.putLong(1L);
        org.mockito.asm.ByteVector byteVector7 = byteVector5.putUTF8("hi!");
        org.mockito.asm.ByteVector byteVector9 = byteVector7.putUTF8("");
        org.mockito.asm.ByteVector byteVector11 = byteVector7.putInt((int) (short) 100);
        org.mockito.asm.ByteVector byteVector13 = byteVector11.putByte((int) (byte) 100);
        org.mockito.asm.ByteVector byteVector15 = byteVector11.putInt((int) (short) -1);
        org.mockito.asm.ByteVector byteVector17 = byteVector15.putUTF8("hi!");
        org.mockito.asm.ByteVector byteVector18 = new org.mockito.asm.ByteVector();
        org.mockito.asm.ByteVector byteVector20 = byteVector18.putUTF8("hi!");
        org.mockito.asm.ByteVector byteVector22 = byteVector18.putLong((long) ' ');
        org.mockito.asm.ByteVector byteVector24 = byteVector22.putByte((int) 'a');
        org.mockito.asm.ByteVector byteVector26 = byteVector22.putByte((int) (short) -1);
        org.mockito.asm.ByteVector byteVector28 = byteVector22.putLong(0L);
        org.mockito.asm.ByteVector byteVector30 = byteVector22.putUTF8("hi!");
        org.mockito.asm.ByteVector byteVector32 = byteVector30.putUTF8("");
        org.mockito.asm.ByteVector byteVector34 = byteVector32.putLong((long) (byte) 10);
        org.mockito.asm.ByteVector byteVector36 = byteVector32.putLong((long) (short) 100);
        byte[] byteArray41 = new byte[] { (byte) 1, (byte) 0, (byte) 0, (byte) -1 };
        org.mockito.asm.ByteVector byteVector44 = byteVector32.putByteArray(byteArray41, 0, 0);
        // The following exception was thrown during execution in test generation
        try {
            org.mockito.asm.ByteVector byteVector47 = byteVector17.putByteArray(byteArray41, (int) (short) -1, (int) (byte) 0);
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
        org.junit.Assert.assertNotNull(byteVector17);
        org.junit.Assert.assertNotNull(byteVector20);
        org.junit.Assert.assertNotNull(byteVector22);
        org.junit.Assert.assertNotNull(byteVector24);
        org.junit.Assert.assertNotNull(byteVector26);
        org.junit.Assert.assertNotNull(byteVector28);
        org.junit.Assert.assertNotNull(byteVector30);
        org.junit.Assert.assertNotNull(byteVector32);
        org.junit.Assert.assertNotNull(byteVector34);
        org.junit.Assert.assertNotNull(byteVector36);
        org.junit.Assert.assertNotNull(byteArray41);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray41), "[1, 0, 0, -1]");
        org.junit.Assert.assertNotNull(byteVector44);
    }

    @Test
    public void test1303() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1303");
        org.mockito.asm.ByteVector byteVector1 = new org.mockito.asm.ByteVector((int) (byte) 10);
        org.mockito.asm.ByteVector byteVector3 = byteVector1.putByte((int) '4');
        org.mockito.asm.ByteVector byteVector5 = byteVector1.putLong(0L);
        org.mockito.asm.ByteVector byteVector7 = byteVector1.putUTF8("");
        org.mockito.asm.ByteVector byteVector9 = byteVector7.putLong(10L);
        org.mockito.asm.ByteVector byteVector11 = byteVector7.putLong(0L);
        org.junit.Assert.assertNotNull(byteVector3);
        org.junit.Assert.assertNotNull(byteVector5);
        org.junit.Assert.assertNotNull(byteVector7);
        org.junit.Assert.assertNotNull(byteVector9);
        org.junit.Assert.assertNotNull(byteVector11);
    }

    @Test
    public void test1304() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1304");
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
        org.mockito.asm.ByteVector byteVector52 = byteVector50.putShort((int) (byte) 10);
        org.mockito.asm.ByteVector byteVector54 = byteVector50.putUTF8("hi!");
        org.mockito.asm.ByteVector byteVector56 = byteVector50.putShort(100);
        org.mockito.asm.ByteVector byteVector58 = byteVector56.putByte((int) (byte) 10);
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
        org.junit.Assert.assertNotNull(byteVector52);
        org.junit.Assert.assertNotNull(byteVector54);
        org.junit.Assert.assertNotNull(byteVector56);
        org.junit.Assert.assertNotNull(byteVector58);
    }

    @Test
    public void test1305() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1305");
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
        org.mockito.asm.ByteVector byteVector22 = byteVector20.putByte((int) '#');
        org.mockito.asm.ByteVector byteVector24 = byteVector20.putLong((long) '#');
        org.mockito.asm.ByteVector byteVector26 = byteVector20.putShort(0);
        org.mockito.asm.ByteVector byteVector28 = byteVector20.putLong((long) '4');
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
    public void test1306() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1306");
        org.mockito.asm.ByteVector byteVector0 = new org.mockito.asm.ByteVector();
        org.mockito.asm.ByteVector byteVector2 = byteVector0.putUTF8("hi!");
        org.mockito.asm.ByteVector byteVector4 = byteVector2.putByte(100);
        org.mockito.asm.ByteVector byteVector6 = byteVector2.putLong((long) 10);
        org.mockito.asm.ByteVector byteVector8 = byteVector2.putShort((int) (short) -1);
        org.mockito.asm.ByteVector byteVector10 = byteVector2.putInt((int) (byte) 100);
        org.mockito.asm.ByteVector byteVector12 = byteVector2.putLong((long) (short) 100);
        org.junit.Assert.assertNotNull(byteVector2);
        org.junit.Assert.assertNotNull(byteVector4);
        org.junit.Assert.assertNotNull(byteVector6);
        org.junit.Assert.assertNotNull(byteVector8);
        org.junit.Assert.assertNotNull(byteVector10);
        org.junit.Assert.assertNotNull(byteVector12);
    }

    @Test
    public void test1307() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1307");
        org.mockito.asm.ByteVector byteVector1 = new org.mockito.asm.ByteVector((int) '#');
        org.mockito.asm.ByteVector byteVector3 = byteVector1.putInt(100);
        org.mockito.asm.ByteVector byteVector5 = byteVector1.putInt(0);
        org.mockito.asm.ByteVector byteVector7 = byteVector5.putShort((int) (short) 10);
        org.mockito.asm.ByteVector byteVector9 = byteVector7.putInt((int) (short) 1);
        org.mockito.asm.ByteVector byteVector11 = byteVector7.putInt(1);
        org.mockito.asm.ByteVector byteVector13 = byteVector11.putByte((int) (byte) 1);
        org.junit.Assert.assertNotNull(byteVector3);
        org.junit.Assert.assertNotNull(byteVector5);
        org.junit.Assert.assertNotNull(byteVector7);
        org.junit.Assert.assertNotNull(byteVector9);
        org.junit.Assert.assertNotNull(byteVector11);
        org.junit.Assert.assertNotNull(byteVector13);
    }

    @Test
    public void test1308() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1308");
        org.mockito.asm.ByteVector byteVector0 = new org.mockito.asm.ByteVector();
        org.mockito.asm.ByteVector byteVector2 = byteVector0.putUTF8("hi!");
        org.mockito.asm.ByteVector byteVector4 = byteVector0.putLong((long) ' ');
        org.mockito.asm.ByteVector byteVector6 = byteVector4.putByte((int) 'a');
        org.mockito.asm.ByteVector byteVector8 = byteVector4.putByte((int) (short) -1);
        org.mockito.asm.ByteVector byteVector10 = byteVector4.putLong(0L);
        org.mockito.asm.ByteVector byteVector12 = byteVector4.putUTF8("hi!");
        org.mockito.asm.ByteVector byteVector14 = byteVector12.putUTF8("hi!");
        org.mockito.asm.ByteVector byteVector16 = byteVector12.putShort((int) '#');
        org.mockito.asm.ByteVector byteVector18 = byteVector16.putShort((int) (byte) 100);
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
    public void test1309() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1309");
        org.mockito.asm.ByteVector byteVector0 = new org.mockito.asm.ByteVector();
        org.mockito.asm.ByteVector byteVector2 = byteVector0.putUTF8("hi!");
        org.mockito.asm.ByteVector byteVector4 = byteVector0.putInt(0);
        org.mockito.asm.ByteVector byteVector6 = byteVector0.putShort(10);
        org.mockito.asm.ByteVector byteVector8 = byteVector0.putUTF8("");
        org.mockito.asm.ByteVector byteVector10 = byteVector8.putLong((long) 'a');
        org.mockito.asm.ByteVector byteVector12 = byteVector10.putInt((int) (byte) 0);
        org.mockito.asm.ByteVector byteVector14 = byteVector10.putInt(10);
        org.junit.Assert.assertNotNull(byteVector2);
        org.junit.Assert.assertNotNull(byteVector4);
        org.junit.Assert.assertNotNull(byteVector6);
        org.junit.Assert.assertNotNull(byteVector8);
        org.junit.Assert.assertNotNull(byteVector10);
        org.junit.Assert.assertNotNull(byteVector12);
        org.junit.Assert.assertNotNull(byteVector14);
    }

    @Test
    public void test1310() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1310");
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
        org.mockito.asm.ByteVector byteVector22 = byteVector14.putShort((int) (byte) 100);
        org.mockito.asm.ByteVector byteVector24 = byteVector14.putByte((int) (byte) 0);
        org.mockito.asm.ByteVector byteVector26 = byteVector24.putShort((int) 'a');
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
    public void test1311() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1311");
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
        org.mockito.asm.ByteVector byteVector20 = byteVector18.putLong((long) '#');
        org.mockito.asm.ByteVector byteVector22 = byteVector18.putInt((int) '4');
        org.mockito.asm.ByteVector byteVector24 = byteVector22.putByte((int) 'a');
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
    public void test1312() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1312");
        org.mockito.asm.ByteVector byteVector0 = new org.mockito.asm.ByteVector();
        org.mockito.asm.ByteVector byteVector2 = byteVector0.putUTF8("hi!");
        org.mockito.asm.ByteVector byteVector4 = byteVector0.putLong((long) ' ');
        org.mockito.asm.ByteVector byteVector6 = byteVector4.putByte((int) 'a');
        org.mockito.asm.ByteVector byteVector8 = byteVector4.putByte((int) (short) -1);
        org.mockito.asm.ByteVector byteVector10 = byteVector8.putByte((-1));
        org.mockito.asm.ByteVector byteVector12 = byteVector10.putShort((int) (short) -1);
        org.mockito.asm.ByteVector byteVector14 = byteVector10.putLong((long) (short) 0);
        org.mockito.asm.ByteVector byteVector16 = byteVector14.putShort((int) ' ');
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
    public void test1313() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1313");
        org.mockito.asm.ByteVector byteVector0 = new org.mockito.asm.ByteVector();
        org.mockito.asm.ByteVector byteVector2 = byteVector0.putUTF8("hi!");
        org.mockito.asm.ByteVector byteVector4 = byteVector2.putLong((long) (byte) 10);
        org.mockito.asm.ByteVector byteVector6 = byteVector4.putUTF8("hi!");
        org.mockito.asm.ByteVector byteVector8 = byteVector4.putLong((-1L));
        org.mockito.asm.ByteVector byteVector10 = byteVector8.putInt(10);
        org.mockito.asm.ByteVector byteVector12 = byteVector10.putShort((int) '#');
        org.mockito.asm.ByteVector byteVector14 = byteVector12.putShort((int) (short) -1);
        org.mockito.asm.ByteVector byteVector16 = new org.mockito.asm.ByteVector((int) (byte) 100);
        org.mockito.asm.ByteVector byteVector18 = byteVector16.putShort((int) (short) 100);
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
        org.mockito.asm.ByteVector byteVector59 = byteVector16.putByteArray(byteArray50, 0, (int) (byte) 1);
        org.mockito.asm.ByteVector byteVector62 = byteVector14.putByteArray(byteArray50, (int) (byte) 0, (int) (short) 0);
        org.mockito.asm.ByteVector byteVector64 = byteVector62.putShort(100);
        org.junit.Assert.assertNotNull(byteVector2);
        org.junit.Assert.assertNotNull(byteVector4);
        org.junit.Assert.assertNotNull(byteVector6);
        org.junit.Assert.assertNotNull(byteVector8);
        org.junit.Assert.assertNotNull(byteVector10);
        org.junit.Assert.assertNotNull(byteVector12);
        org.junit.Assert.assertNotNull(byteVector14);
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
        org.junit.Assert.assertNotNull(byteVector62);
        org.junit.Assert.assertNotNull(byteVector64);
    }

    @Test
    public void test1314() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1314");
        org.mockito.asm.ByteVector byteVector1 = new org.mockito.asm.ByteVector((int) (byte) 1);
        org.mockito.asm.ByteVector byteVector3 = byteVector1.putByte((int) (byte) 10);
        org.mockito.asm.ByteVector byteVector5 = byteVector3.putLong((long) (byte) 10);
        java.lang.Class<?> wildcardClass6 = byteVector3.getClass();
        org.junit.Assert.assertNotNull(byteVector3);
        org.junit.Assert.assertNotNull(byteVector5);
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void test1315() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1315");
        org.mockito.asm.ByteVector byteVector1 = new org.mockito.asm.ByteVector((int) '#');
        org.mockito.asm.ByteVector byteVector3 = byteVector1.putInt(100);
        org.mockito.asm.ByteVector byteVector5 = byteVector1.putInt(0);
        java.lang.Class<?> wildcardClass6 = byteVector1.getClass();
        org.junit.Assert.assertNotNull(byteVector3);
        org.junit.Assert.assertNotNull(byteVector5);
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void test1316() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1316");
        org.mockito.asm.ByteVector byteVector1 = new org.mockito.asm.ByteVector((int) ' ');
        org.mockito.asm.ByteVector byteVector3 = byteVector1.putInt((int) '4');
        org.mockito.asm.ByteVector byteVector5 = byteVector3.putUTF8("");
        org.mockito.asm.ByteVector byteVector7 = byteVector5.putInt(0);
        org.mockito.asm.ByteVector byteVector9 = byteVector5.putShort((int) (short) -1);
        org.mockito.asm.ByteVector byteVector11 = byteVector5.putByte(100);
        org.mockito.asm.ByteVector byteVector13 = byteVector5.putUTF8("hi!");
        org.mockito.asm.ByteVector byteVector15 = byteVector5.putInt((int) (byte) 100);
        java.lang.Class<?> wildcardClass16 = byteVector5.getClass();
        org.junit.Assert.assertNotNull(byteVector3);
        org.junit.Assert.assertNotNull(byteVector5);
        org.junit.Assert.assertNotNull(byteVector7);
        org.junit.Assert.assertNotNull(byteVector9);
        org.junit.Assert.assertNotNull(byteVector11);
        org.junit.Assert.assertNotNull(byteVector13);
        org.junit.Assert.assertNotNull(byteVector15);
        org.junit.Assert.assertNotNull(wildcardClass16);
    }

    @Test
    public void test1317() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1317");
        org.mockito.asm.ByteVector byteVector0 = new org.mockito.asm.ByteVector();
        org.mockito.asm.ByteVector byteVector2 = byteVector0.putUTF8("hi!");
        org.mockito.asm.ByteVector byteVector4 = byteVector2.putLong((long) (byte) 10);
        org.mockito.asm.ByteVector byteVector6 = byteVector2.putInt((int) (short) 1);
        org.mockito.asm.ByteVector byteVector8 = byteVector6.putLong(0L);
        java.lang.Class<?> wildcardClass9 = byteVector6.getClass();
        org.junit.Assert.assertNotNull(byteVector2);
        org.junit.Assert.assertNotNull(byteVector4);
        org.junit.Assert.assertNotNull(byteVector6);
        org.junit.Assert.assertNotNull(byteVector8);
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test1318() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1318");
        org.mockito.asm.ByteVector byteVector1 = new org.mockito.asm.ByteVector((int) '#');
        org.mockito.asm.ByteVector byteVector3 = byteVector1.putLong(100L);
        org.mockito.asm.ByteVector byteVector5 = byteVector1.putUTF8("");
        org.mockito.asm.ByteVector byteVector7 = byteVector5.putInt((int) (byte) 10);
        org.mockito.asm.ByteVector byteVector9 = byteVector7.putByte(0);
        org.mockito.asm.ByteVector byteVector11 = byteVector9.putInt(100);
        org.mockito.asm.ByteVector byteVector13 = byteVector9.putByte((int) (byte) 0);
        org.mockito.asm.ByteVector byteVector14 = new org.mockito.asm.ByteVector();
        org.mockito.asm.ByteVector byteVector16 = byteVector14.putUTF8("hi!");
        org.mockito.asm.ByteVector byteVector18 = byteVector14.putInt(0);
        org.mockito.asm.ByteVector byteVector20 = byteVector14.putInt(1);
        org.mockito.asm.ByteVector byteVector22 = byteVector14.putUTF8("");
        org.mockito.asm.ByteVector byteVector24 = byteVector22.putLong(10L);
        org.mockito.asm.ByteVector byteVector25 = new org.mockito.asm.ByteVector();
        org.mockito.asm.ByteVector byteVector27 = byteVector25.putUTF8("hi!");
        org.mockito.asm.ByteVector byteVector29 = byteVector27.putLong((long) (byte) 10);
        org.mockito.asm.ByteVector byteVector31 = byteVector29.putUTF8("hi!");
        org.mockito.asm.ByteVector byteVector33 = byteVector29.putLong((-1L));
        org.mockito.asm.ByteVector byteVector35 = new org.mockito.asm.ByteVector((int) (short) 0);
        org.mockito.asm.ByteVector byteVector36 = new org.mockito.asm.ByteVector();
        org.mockito.asm.ByteVector byteVector38 = byteVector36.putUTF8("hi!");
        org.mockito.asm.ByteVector byteVector40 = byteVector36.putInt(0);
        org.mockito.asm.ByteVector byteVector42 = byteVector40.putInt((int) ' ');
        org.mockito.asm.ByteVector byteVector44 = byteVector42.putLong(100L);
        byte[] byteArray48 = new byte[] { (byte) 0, (byte) 10, (byte) 1 };
        org.mockito.asm.ByteVector byteVector51 = byteVector42.putByteArray(byteArray48, 0, 0);
        org.mockito.asm.ByteVector byteVector54 = byteVector35.putByteArray(byteArray48, 1, (int) (short) 0);
        org.mockito.asm.ByteVector byteVector57 = byteVector33.putByteArray(byteArray48, 0, (int) (byte) 1);
        org.mockito.asm.ByteVector byteVector60 = byteVector22.putByteArray(byteArray48, 0, (int) (short) 1);
        // The following exception was thrown during execution in test generation
        try {
            org.mockito.asm.ByteVector byteVector63 = byteVector9.putByteArray(byteArray48, (int) '4', (-1));
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
        org.junit.Assert.assertNotNull(byteVector16);
        org.junit.Assert.assertNotNull(byteVector18);
        org.junit.Assert.assertNotNull(byteVector20);
        org.junit.Assert.assertNotNull(byteVector22);
        org.junit.Assert.assertNotNull(byteVector24);
        org.junit.Assert.assertNotNull(byteVector27);
        org.junit.Assert.assertNotNull(byteVector29);
        org.junit.Assert.assertNotNull(byteVector31);
        org.junit.Assert.assertNotNull(byteVector33);
        org.junit.Assert.assertNotNull(byteVector38);
        org.junit.Assert.assertNotNull(byteVector40);
        org.junit.Assert.assertNotNull(byteVector42);
        org.junit.Assert.assertNotNull(byteVector44);
        org.junit.Assert.assertNotNull(byteArray48);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray48), "[0, 10, 1]");
        org.junit.Assert.assertNotNull(byteVector51);
        org.junit.Assert.assertNotNull(byteVector54);
        org.junit.Assert.assertNotNull(byteVector57);
        org.junit.Assert.assertNotNull(byteVector60);
    }

    @Test
    public void test1319() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1319");
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
        org.mockito.asm.ByteVector byteVector28 = byteVector26.putByte((int) 'a');
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
    }

    @Test
    public void test1320() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1320");
        org.mockito.asm.ByteVector byteVector0 = new org.mockito.asm.ByteVector();
        org.mockito.asm.ByteVector byteVector2 = byteVector0.putUTF8("hi!");
        org.mockito.asm.ByteVector byteVector4 = byteVector0.putShort((int) (short) -1);
        org.mockito.asm.ByteVector byteVector6 = byteVector0.putInt(0);
        org.mockito.asm.ByteVector byteVector8 = byteVector0.putUTF8("hi!");
        org.mockito.asm.ByteVector byteVector10 = byteVector8.putInt((int) (short) 0);
        org.mockito.asm.ByteVector byteVector12 = byteVector8.putByte(0);
        org.mockito.asm.ByteVector byteVector14 = byteVector12.putShort((int) '#');
        org.mockito.asm.ByteVector byteVector16 = byteVector12.putLong((long) (-1));
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
    public void test1321() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1321");
        org.mockito.asm.ByteVector byteVector1 = new org.mockito.asm.ByteVector((int) (short) 1);
        org.mockito.asm.ByteVector byteVector3 = byteVector1.putLong((long) (byte) 1);
        org.mockito.asm.ByteVector byteVector5 = byteVector1.putInt(1);
        org.mockito.asm.ByteVector byteVector7 = byteVector1.putInt(100);
        org.mockito.asm.ByteVector byteVector8 = new org.mockito.asm.ByteVector();
        org.mockito.asm.ByteVector byteVector10 = byteVector8.putUTF8("hi!");
        org.mockito.asm.ByteVector byteVector12 = byteVector8.putShort((int) (short) -1);
        org.mockito.asm.ByteVector byteVector14 = byteVector8.putLong(0L);
        org.mockito.asm.ByteVector byteVector16 = byteVector8.putShort((int) (byte) -1);
        org.mockito.asm.ByteVector byteVector18 = byteVector16.putByte((int) (byte) 0);
        org.mockito.asm.ByteVector byteVector19 = new org.mockito.asm.ByteVector();
        org.mockito.asm.ByteVector byteVector21 = byteVector19.putUTF8("hi!");
        org.mockito.asm.ByteVector byteVector23 = byteVector19.putLong((long) ' ');
        org.mockito.asm.ByteVector byteVector25 = byteVector23.putByte((int) 'a');
        org.mockito.asm.ByteVector byteVector27 = byteVector23.putByte((int) (short) -1);
        org.mockito.asm.ByteVector byteVector29 = byteVector23.putLong(0L);
        org.mockito.asm.ByteVector byteVector31 = byteVector29.putByte(0);
        org.mockito.asm.ByteVector byteVector33 = byteVector31.putByte(100);
        org.mockito.asm.ByteVector byteVector35 = byteVector31.putByte((int) '4');
        org.mockito.asm.ByteVector byteVector37 = byteVector35.putUTF8("hi!");
        org.mockito.asm.ByteVector byteVector39 = byteVector35.putShort(100);
        org.mockito.asm.ByteVector byteVector41 = byteVector35.putShort((int) (short) 100);
        org.mockito.asm.ByteVector byteVector42 = new org.mockito.asm.ByteVector();
        org.mockito.asm.ByteVector byteVector44 = byteVector42.putUTF8("hi!");
        org.mockito.asm.ByteVector byteVector46 = byteVector42.putInt(0);
        org.mockito.asm.ByteVector byteVector48 = byteVector42.putShort((int) '4');
        org.mockito.asm.ByteVector byteVector50 = byteVector42.putByte(100);
        org.mockito.asm.ByteVector byteVector52 = byteVector50.putInt((int) (byte) 10);
        org.mockito.asm.ByteVector byteVector54 = byteVector50.putInt((int) (byte) 10);
        org.mockito.asm.ByteVector byteVector56 = byteVector54.putByte(100);
        org.mockito.asm.ByteVector byteVector57 = new org.mockito.asm.ByteVector();
        org.mockito.asm.ByteVector byteVector59 = byteVector57.putUTF8("hi!");
        org.mockito.asm.ByteVector byteVector61 = byteVector57.putInt(0);
        org.mockito.asm.ByteVector byteVector63 = byteVector61.putInt((int) ' ');
        org.mockito.asm.ByteVector byteVector65 = byteVector63.putLong(100L);
        byte[] byteArray69 = new byte[] { (byte) 0, (byte) 10, (byte) 1 };
        org.mockito.asm.ByteVector byteVector72 = byteVector63.putByteArray(byteArray69, 0, 0);
        org.mockito.asm.ByteVector byteVector75 = byteVector56.putByteArray(byteArray69, (int) (byte) 1, (int) (byte) 0);
        org.mockito.asm.ByteVector byteVector78 = byteVector41.putByteArray(byteArray69, 1, (int) (byte) 1);
        org.mockito.asm.ByteVector byteVector81 = byteVector18.putByteArray(byteArray69, (int) (byte) 1, 0);
        org.mockito.asm.ByteVector byteVector84 = byteVector7.putByteArray(byteArray69, (int) (byte) 0, (int) (byte) 1);
        org.junit.Assert.assertNotNull(byteVector3);
        org.junit.Assert.assertNotNull(byteVector5);
        org.junit.Assert.assertNotNull(byteVector7);
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
        org.junit.Assert.assertNotNull(byteVector41);
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
        org.junit.Assert.assertNotNull(byteArray69);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray69), "[0, 10, 1]");
        org.junit.Assert.assertNotNull(byteVector72);
        org.junit.Assert.assertNotNull(byteVector75);
        org.junit.Assert.assertNotNull(byteVector78);
        org.junit.Assert.assertNotNull(byteVector81);
        org.junit.Assert.assertNotNull(byteVector84);
    }

    @Test
    public void test1322() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1322");
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
        org.mockito.asm.ByteVector byteVector20 = byteVector16.putByte((int) (short) 10);
        org.mockito.asm.ByteVector byteVector22 = byteVector16.putInt((int) (short) 10);
        org.mockito.asm.ByteVector byteVector24 = byteVector16.putByte((int) (short) 0);
        org.mockito.asm.ByteVector byteVector26 = byteVector16.putUTF8("hi!");
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
    public void test1323() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1323");
        org.mockito.asm.ByteVector byteVector0 = new org.mockito.asm.ByteVector();
        org.mockito.asm.ByteVector byteVector2 = byteVector0.putUTF8("hi!");
        org.mockito.asm.ByteVector byteVector4 = byteVector2.putInt(0);
        java.lang.Class<?> wildcardClass5 = byteVector4.getClass();
        org.junit.Assert.assertNotNull(byteVector2);
        org.junit.Assert.assertNotNull(byteVector4);
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test1324() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1324");
        org.mockito.asm.ByteVector byteVector1 = new org.mockito.asm.ByteVector((int) (byte) 10);
        org.mockito.asm.ByteVector byteVector3 = byteVector1.putByte((int) '4');
        org.mockito.asm.ByteVector byteVector5 = byteVector1.putLong(0L);
        org.mockito.asm.ByteVector byteVector7 = byteVector5.putLong((long) (short) 100);
        org.mockito.asm.ByteVector byteVector9 = byteVector7.putUTF8("");
        org.mockito.asm.ByteVector byteVector11 = byteVector7.putByte(0);
        org.junit.Assert.assertNotNull(byteVector3);
        org.junit.Assert.assertNotNull(byteVector5);
        org.junit.Assert.assertNotNull(byteVector7);
        org.junit.Assert.assertNotNull(byteVector9);
        org.junit.Assert.assertNotNull(byteVector11);
    }

    @Test
    public void test1325() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1325");
        org.mockito.asm.ByteVector byteVector1 = new org.mockito.asm.ByteVector((int) '#');
        org.mockito.asm.ByteVector byteVector3 = byteVector1.putLong(100L);
        org.mockito.asm.ByteVector byteVector5 = byteVector1.putUTF8("");
        org.mockito.asm.ByteVector byteVector7 = byteVector1.putUTF8("hi!");
        org.mockito.asm.ByteVector byteVector9 = byteVector7.putLong((long) (short) 0);
        org.mockito.asm.ByteVector byteVector11 = byteVector7.putLong((long) (byte) -1);
        org.mockito.asm.ByteVector byteVector13 = byteVector7.putLong((long) 0);
        org.mockito.asm.ByteVector byteVector15 = byteVector7.putInt((int) (byte) -1);
        org.junit.Assert.assertNotNull(byteVector3);
        org.junit.Assert.assertNotNull(byteVector5);
        org.junit.Assert.assertNotNull(byteVector7);
        org.junit.Assert.assertNotNull(byteVector9);
        org.junit.Assert.assertNotNull(byteVector11);
        org.junit.Assert.assertNotNull(byteVector13);
        org.junit.Assert.assertNotNull(byteVector15);
    }

    @Test
    public void test1326() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1326");
        org.mockito.asm.ByteVector byteVector0 = new org.mockito.asm.ByteVector();
        org.mockito.asm.ByteVector byteVector2 = byteVector0.putUTF8("hi!");
        org.mockito.asm.ByteVector byteVector4 = byteVector0.putInt(0);
        org.mockito.asm.ByteVector byteVector6 = byteVector4.putInt((int) ' ');
        org.mockito.asm.ByteVector byteVector8 = byteVector4.putByte((int) '#');
        org.mockito.asm.ByteVector byteVector10 = byteVector4.putByte((int) '4');
        org.junit.Assert.assertNotNull(byteVector2);
        org.junit.Assert.assertNotNull(byteVector4);
        org.junit.Assert.assertNotNull(byteVector6);
        org.junit.Assert.assertNotNull(byteVector8);
        org.junit.Assert.assertNotNull(byteVector10);
    }

    @Test
    public void test1327() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1327");
        org.mockito.asm.ByteVector byteVector1 = new org.mockito.asm.ByteVector((int) (byte) 10);
        org.mockito.asm.ByteVector byteVector3 = byteVector1.putByte((int) '4');
        org.mockito.asm.ByteVector byteVector5 = byteVector1.putLong((long) 'a');
        org.mockito.asm.ByteVector byteVector7 = byteVector1.putUTF8("");
        org.mockito.asm.ByteVector byteVector9 = byteVector1.putUTF8("");
        org.mockito.asm.ByteVector byteVector11 = byteVector1.putShort(0);
        org.mockito.asm.ByteVector byteVector13 = byteVector1.putByte((int) (short) 10);
        org.mockito.asm.ByteVector byteVector15 = new org.mockito.asm.ByteVector((int) (byte) 1);
        org.mockito.asm.ByteVector byteVector17 = byteVector15.putByte((int) (short) 1);
        org.mockito.asm.ByteVector byteVector19 = byteVector15.putShort((int) (byte) 1);
        org.mockito.asm.ByteVector byteVector21 = new org.mockito.asm.ByteVector((int) (byte) 100);
        org.mockito.asm.ByteVector byteVector23 = byteVector21.putShort((int) (short) 100);
        org.mockito.asm.ByteVector byteVector24 = new org.mockito.asm.ByteVector();
        org.mockito.asm.ByteVector byteVector26 = byteVector24.putUTF8("hi!");
        org.mockito.asm.ByteVector byteVector28 = byteVector24.putLong((long) ' ');
        org.mockito.asm.ByteVector byteVector30 = byteVector28.putByte((int) 'a');
        org.mockito.asm.ByteVector byteVector32 = byteVector28.putByte((int) (short) -1);
        org.mockito.asm.ByteVector byteVector34 = byteVector28.putLong(0L);
        org.mockito.asm.ByteVector byteVector36 = byteVector28.putUTF8("hi!");
        org.mockito.asm.ByteVector byteVector38 = byteVector36.putUTF8("");
        org.mockito.asm.ByteVector byteVector40 = byteVector36.putInt((int) (byte) 10);
        org.mockito.asm.ByteVector byteVector42 = byteVector36.putByte(0);
        org.mockito.asm.ByteVector byteVector43 = new org.mockito.asm.ByteVector();
        org.mockito.asm.ByteVector byteVector45 = byteVector43.putUTF8("hi!");
        org.mockito.asm.ByteVector byteVector47 = byteVector43.putInt(0);
        org.mockito.asm.ByteVector byteVector49 = byteVector47.putInt((int) ' ');
        org.mockito.asm.ByteVector byteVector51 = byteVector49.putLong(100L);
        byte[] byteArray55 = new byte[] { (byte) 0, (byte) 10, (byte) 1 };
        org.mockito.asm.ByteVector byteVector58 = byteVector49.putByteArray(byteArray55, 0, 0);
        org.mockito.asm.ByteVector byteVector61 = byteVector42.putByteArray(byteArray55, (int) (short) 1, 0);
        org.mockito.asm.ByteVector byteVector64 = byteVector21.putByteArray(byteArray55, 0, (int) (byte) 1);
        org.mockito.asm.ByteVector byteVector67 = byteVector19.putByteArray(byteArray55, 0, 0);
        // The following exception was thrown during execution in test generation
        try {
            org.mockito.asm.ByteVector byteVector70 = byteVector13.putByteArray(byteArray55, (int) '4', (int) (byte) 0);
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
        org.junit.Assert.assertNotNull(byteVector17);
        org.junit.Assert.assertNotNull(byteVector19);
        org.junit.Assert.assertNotNull(byteVector23);
        org.junit.Assert.assertNotNull(byteVector26);
        org.junit.Assert.assertNotNull(byteVector28);
        org.junit.Assert.assertNotNull(byteVector30);
        org.junit.Assert.assertNotNull(byteVector32);
        org.junit.Assert.assertNotNull(byteVector34);
        org.junit.Assert.assertNotNull(byteVector36);
        org.junit.Assert.assertNotNull(byteVector38);
        org.junit.Assert.assertNotNull(byteVector40);
        org.junit.Assert.assertNotNull(byteVector42);
        org.junit.Assert.assertNotNull(byteVector45);
        org.junit.Assert.assertNotNull(byteVector47);
        org.junit.Assert.assertNotNull(byteVector49);
        org.junit.Assert.assertNotNull(byteVector51);
        org.junit.Assert.assertNotNull(byteArray55);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray55), "[0, 10, 1]");
        org.junit.Assert.assertNotNull(byteVector58);
        org.junit.Assert.assertNotNull(byteVector61);
        org.junit.Assert.assertNotNull(byteVector64);
        org.junit.Assert.assertNotNull(byteVector67);
    }

    @Test
    public void test1328() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1328");
        org.mockito.asm.ByteVector byteVector1 = new org.mockito.asm.ByteVector((int) '#');
        org.mockito.asm.ByteVector byteVector3 = byteVector1.putLong(100L);
        org.mockito.asm.ByteVector byteVector5 = byteVector3.putLong(1L);
        org.mockito.asm.ByteVector byteVector7 = byteVector5.putUTF8("hi!");
        org.mockito.asm.ByteVector byteVector9 = byteVector5.putLong((long) 1);
        org.mockito.asm.ByteVector byteVector11 = byteVector5.putShort((int) '#');
        org.mockito.asm.ByteVector byteVector13 = byteVector11.putByte((int) (byte) 10);
        java.lang.Class<?> wildcardClass14 = byteVector13.getClass();
        org.junit.Assert.assertNotNull(byteVector3);
        org.junit.Assert.assertNotNull(byteVector5);
        org.junit.Assert.assertNotNull(byteVector7);
        org.junit.Assert.assertNotNull(byteVector9);
        org.junit.Assert.assertNotNull(byteVector11);
        org.junit.Assert.assertNotNull(byteVector13);
        org.junit.Assert.assertNotNull(wildcardClass14);
    }

    @Test
    public void test1329() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1329");
        org.mockito.asm.ByteVector byteVector0 = new org.mockito.asm.ByteVector();
        org.mockito.asm.ByteVector byteVector2 = byteVector0.putUTF8("hi!");
        org.mockito.asm.ByteVector byteVector4 = byteVector2.putInt((int) (byte) 10);
        org.mockito.asm.ByteVector byteVector6 = byteVector4.putUTF8("");
        org.mockito.asm.ByteVector byteVector8 = byteVector6.putUTF8("hi!");
        org.mockito.asm.ByteVector byteVector10 = byteVector6.putInt((int) '#');
        org.mockito.asm.ByteVector byteVector12 = byteVector10.putInt((int) (short) 0);
        org.mockito.asm.ByteVector byteVector14 = byteVector10.putShort(100);
        org.mockito.asm.ByteVector byteVector16 = byteVector10.putUTF8("");
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
    public void test1330() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1330");
        org.mockito.asm.ByteVector byteVector1 = new org.mockito.asm.ByteVector((int) '#');
        org.mockito.asm.ByteVector byteVector3 = byteVector1.putLong(100L);
        org.mockito.asm.ByteVector byteVector5 = byteVector1.putUTF8("");
        org.mockito.asm.ByteVector byteVector7 = byteVector5.putInt((int) (byte) 10);
        org.mockito.asm.ByteVector byteVector9 = byteVector7.putByte((int) '#');
        org.mockito.asm.ByteVector byteVector11 = byteVector9.putInt((int) (short) 0);
        org.mockito.asm.ByteVector byteVector13 = byteVector11.putInt((int) (byte) 0);
        org.mockito.asm.ByteVector byteVector15 = byteVector13.putByte((int) (short) 100);
        org.junit.Assert.assertNotNull(byteVector3);
        org.junit.Assert.assertNotNull(byteVector5);
        org.junit.Assert.assertNotNull(byteVector7);
        org.junit.Assert.assertNotNull(byteVector9);
        org.junit.Assert.assertNotNull(byteVector11);
        org.junit.Assert.assertNotNull(byteVector13);
        org.junit.Assert.assertNotNull(byteVector15);
    }

    @Test
    public void test1331() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1331");
        org.mockito.asm.ByteVector byteVector0 = new org.mockito.asm.ByteVector();
        org.mockito.asm.ByteVector byteVector2 = byteVector0.putUTF8("hi!");
        org.mockito.asm.ByteVector byteVector4 = byteVector0.putShort((int) (short) -1);
        org.mockito.asm.ByteVector byteVector6 = byteVector0.putShort((int) (short) 100);
        org.junit.Assert.assertNotNull(byteVector2);
        org.junit.Assert.assertNotNull(byteVector4);
        org.junit.Assert.assertNotNull(byteVector6);
    }

    @Test
    public void test1332() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1332");
        org.mockito.asm.ByteVector byteVector0 = new org.mockito.asm.ByteVector();
        org.mockito.asm.ByteVector byteVector2 = byteVector0.putUTF8("hi!");
        org.mockito.asm.ByteVector byteVector4 = byteVector0.putInt((int) (short) 1);
        org.mockito.asm.ByteVector byteVector6 = byteVector0.putShort((int) (short) 0);
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
        org.mockito.asm.ByteVector byteVector27 = byteVector25.putUTF8("hi!");
        org.mockito.asm.ByteVector byteVector29 = byteVector27.putUTF8("");
        org.mockito.asm.ByteVector byteVector31 = byteVector27.putInt((int) (byte) 0);
        org.mockito.asm.ByteVector byteVector33 = byteVector31.putInt((int) 'a');
        org.mockito.asm.ByteVector byteVector35 = new org.mockito.asm.ByteVector((int) '#');
        org.mockito.asm.ByteVector byteVector37 = byteVector35.putInt(100);
        org.mockito.asm.ByteVector byteVector39 = byteVector37.putShort((int) (short) -1);
        org.mockito.asm.ByteVector byteVector41 = byteVector39.putShort((int) (short) 0);
        org.mockito.asm.ByteVector byteVector43 = byteVector39.putUTF8("");
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
        org.mockito.asm.ByteVector byteVector84 = byteVector39.putByteArray(byteArray75, 1, 1);
        org.mockito.asm.ByteVector byteVector87 = byteVector31.putByteArray(byteArray75, (int) (byte) 0, (int) (byte) 0);
        // The following exception was thrown during execution in test generation
        try {
            org.mockito.asm.ByteVector byteVector90 = byteVector0.putByteArray(byteArray75, (int) '#', (int) (byte) 0);
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
        org.junit.Assert.assertNotNull(byteVector27);
        org.junit.Assert.assertNotNull(byteVector29);
        org.junit.Assert.assertNotNull(byteVector31);
        org.junit.Assert.assertNotNull(byteVector33);
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
        org.junit.Assert.assertNotNull(byteVector87);
    }

    @Test
    public void test1333() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1333");
        org.mockito.asm.ByteVector byteVector0 = new org.mockito.asm.ByteVector();
        org.mockito.asm.ByteVector byteVector2 = byteVector0.putUTF8("hi!");
        org.mockito.asm.ByteVector byteVector4 = byteVector2.putLong((long) (byte) 10);
        org.mockito.asm.ByteVector byteVector6 = byteVector4.putUTF8("hi!");
        org.mockito.asm.ByteVector byteVector8 = byteVector4.putLong((long) (short) -1);
        org.mockito.asm.ByteVector byteVector10 = byteVector8.putInt(0);
        org.mockito.asm.ByteVector byteVector12 = byteVector10.putShort(100);
        org.junit.Assert.assertNotNull(byteVector2);
        org.junit.Assert.assertNotNull(byteVector4);
        org.junit.Assert.assertNotNull(byteVector6);
        org.junit.Assert.assertNotNull(byteVector8);
        org.junit.Assert.assertNotNull(byteVector10);
        org.junit.Assert.assertNotNull(byteVector12);
    }

    @Test
    public void test1334() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1334");
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
        org.mockito.asm.ByteVector byteVector25 = byteVector23.putByte(100);
        org.mockito.asm.ByteVector byteVector27 = byteVector23.putByte((int) '4');
        org.mockito.asm.ByteVector byteVector29 = byteVector27.putUTF8("hi!");
        org.mockito.asm.ByteVector byteVector31 = byteVector27.putShort(100);
        org.mockito.asm.ByteVector byteVector33 = byteVector27.putShort((int) (short) 100);
        org.mockito.asm.ByteVector byteVector34 = new org.mockito.asm.ByteVector();
        org.mockito.asm.ByteVector byteVector36 = byteVector34.putUTF8("hi!");
        org.mockito.asm.ByteVector byteVector38 = byteVector34.putInt(0);
        org.mockito.asm.ByteVector byteVector40 = byteVector34.putShort((int) '4');
        org.mockito.asm.ByteVector byteVector42 = byteVector34.putByte(100);
        org.mockito.asm.ByteVector byteVector44 = byteVector42.putInt((int) (byte) 10);
        org.mockito.asm.ByteVector byteVector46 = byteVector42.putInt((int) (byte) 10);
        org.mockito.asm.ByteVector byteVector48 = byteVector46.putByte(100);
        org.mockito.asm.ByteVector byteVector49 = new org.mockito.asm.ByteVector();
        org.mockito.asm.ByteVector byteVector51 = byteVector49.putUTF8("hi!");
        org.mockito.asm.ByteVector byteVector53 = byteVector49.putInt(0);
        org.mockito.asm.ByteVector byteVector55 = byteVector53.putInt((int) ' ');
        org.mockito.asm.ByteVector byteVector57 = byteVector55.putLong(100L);
        byte[] byteArray61 = new byte[] { (byte) 0, (byte) 10, (byte) 1 };
        org.mockito.asm.ByteVector byteVector64 = byteVector55.putByteArray(byteArray61, 0, 0);
        org.mockito.asm.ByteVector byteVector67 = byteVector48.putByteArray(byteArray61, (int) (byte) 1, (int) (byte) 0);
        org.mockito.asm.ByteVector byteVector70 = byteVector33.putByteArray(byteArray61, 1, (int) (byte) 1);
        // The following exception was thrown during execution in test generation
        try {
            org.mockito.asm.ByteVector byteVector73 = byteVector8.putByteArray(byteArray61, (int) (short) -1, (int) ' ');
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
        org.junit.Assert.assertNotNull(byteVector33);
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
    public void test1335() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1335");
        org.mockito.asm.ByteVector byteVector0 = new org.mockito.asm.ByteVector();
        org.mockito.asm.ByteVector byteVector2 = byteVector0.putUTF8("hi!");
        org.mockito.asm.ByteVector byteVector4 = byteVector0.putLong((long) ' ');
        org.mockito.asm.ByteVector byteVector6 = byteVector4.putByte((int) 'a');
        org.mockito.asm.ByteVector byteVector8 = byteVector4.putByte((int) (short) -1);
        org.mockito.asm.ByteVector byteVector10 = byteVector8.putByte((-1));
        org.mockito.asm.ByteVector byteVector12 = byteVector8.putInt((int) '#');
        org.mockito.asm.ByteVector byteVector14 = byteVector12.putLong((-1L));
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
    public void test1336() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1336");
        org.mockito.asm.ByteVector byteVector0 = new org.mockito.asm.ByteVector();
        org.mockito.asm.ByteVector byteVector2 = byteVector0.putUTF8("hi!");
        org.mockito.asm.ByteVector byteVector4 = byteVector2.putByte(100);
        org.mockito.asm.ByteVector byteVector6 = byteVector2.putShort((int) 'a');
        org.mockito.asm.ByteVector byteVector8 = byteVector6.putShort((int) (short) 0);
        org.mockito.asm.ByteVector byteVector10 = byteVector6.putInt((int) '4');
        org.mockito.asm.ByteVector byteVector12 = byteVector6.putLong(0L);
        org.mockito.asm.ByteVector byteVector14 = byteVector6.putLong((long) (short) 1);
        org.junit.Assert.assertNotNull(byteVector2);
        org.junit.Assert.assertNotNull(byteVector4);
        org.junit.Assert.assertNotNull(byteVector6);
        org.junit.Assert.assertNotNull(byteVector8);
        org.junit.Assert.assertNotNull(byteVector10);
        org.junit.Assert.assertNotNull(byteVector12);
        org.junit.Assert.assertNotNull(byteVector14);
    }

    @Test
    public void test1337() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1337");
        org.mockito.asm.ByteVector byteVector1 = new org.mockito.asm.ByteVector((int) '#');
        org.mockito.asm.ByteVector byteVector3 = byteVector1.putUTF8("hi!");
        org.mockito.asm.ByteVector byteVector5 = byteVector1.putUTF8("");
        org.mockito.asm.ByteVector byteVector7 = byteVector5.putUTF8("hi!");
        org.mockito.asm.ByteVector byteVector9 = byteVector7.putInt((int) '4');
        org.junit.Assert.assertNotNull(byteVector3);
        org.junit.Assert.assertNotNull(byteVector5);
        org.junit.Assert.assertNotNull(byteVector7);
        org.junit.Assert.assertNotNull(byteVector9);
    }

    @Test
    public void test1338() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1338");
        org.mockito.asm.ByteVector byteVector1 = new org.mockito.asm.ByteVector((int) '#');
        org.mockito.asm.ByteVector byteVector3 = byteVector1.putLong(100L);
        org.mockito.asm.ByteVector byteVector5 = byteVector3.putLong(1L);
        org.mockito.asm.ByteVector byteVector7 = byteVector5.putUTF8("hi!");
        org.mockito.asm.ByteVector byteVector9 = byteVector5.putLong((long) (byte) 1);
        org.mockito.asm.ByteVector byteVector11 = byteVector5.putShort((int) (short) 100);
        org.junit.Assert.assertNotNull(byteVector3);
        org.junit.Assert.assertNotNull(byteVector5);
        org.junit.Assert.assertNotNull(byteVector7);
        org.junit.Assert.assertNotNull(byteVector9);
        org.junit.Assert.assertNotNull(byteVector11);
    }

    @Test
    public void test1339() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1339");
        org.mockito.asm.ByteVector byteVector1 = new org.mockito.asm.ByteVector((int) (byte) 10);
        org.mockito.asm.ByteVector byteVector3 = byteVector1.putByte((int) '4');
        org.mockito.asm.ByteVector byteVector5 = byteVector1.putLong(0L);
        org.mockito.asm.ByteVector byteVector7 = byteVector5.putLong((long) (short) 100);
        org.mockito.asm.ByteVector byteVector9 = byteVector5.putShort((int) (byte) 0);
        org.mockito.asm.ByteVector byteVector10 = new org.mockito.asm.ByteVector();
        org.mockito.asm.ByteVector byteVector12 = byteVector10.putUTF8("hi!");
        org.mockito.asm.ByteVector byteVector14 = byteVector10.putInt(0);
        org.mockito.asm.ByteVector byteVector16 = byteVector14.putInt((int) ' ');
        org.mockito.asm.ByteVector byteVector18 = byteVector16.putLong((long) (short) 10);
        org.mockito.asm.ByteVector byteVector20 = byteVector18.putUTF8("hi!");
        org.mockito.asm.ByteVector byteVector22 = byteVector18.putByte(0);
        org.mockito.asm.ByteVector byteVector24 = byteVector22.putInt((int) (short) 1);
        org.mockito.asm.ByteVector byteVector26 = byteVector22.putLong((long) (short) 0);
        org.mockito.asm.ByteVector byteVector27 = new org.mockito.asm.ByteVector();
        org.mockito.asm.ByteVector byteVector29 = byteVector27.putUTF8("hi!");
        org.mockito.asm.ByteVector byteVector31 = byteVector29.putLong((long) (byte) 10);
        org.mockito.asm.ByteVector byteVector33 = byteVector31.putUTF8("hi!");
        org.mockito.asm.ByteVector byteVector35 = byteVector31.putLong((long) 10);
        org.mockito.asm.ByteVector byteVector37 = byteVector35.putLong(0L);
        org.mockito.asm.ByteVector byteVector39 = byteVector37.putUTF8("hi!");
        org.mockito.asm.ByteVector byteVector40 = new org.mockito.asm.ByteVector();
        org.mockito.asm.ByteVector byteVector42 = byteVector40.putUTF8("hi!");
        org.mockito.asm.ByteVector byteVector44 = byteVector42.putInt(0);
        org.mockito.asm.ByteVector byteVector46 = byteVector42.putByte((int) (byte) 10);
        org.mockito.asm.ByteVector byteVector48 = byteVector46.putLong((-1L));
        org.mockito.asm.ByteVector byteVector50 = byteVector46.putInt((int) (byte) 100);
        org.mockito.asm.ByteVector byteVector51 = new org.mockito.asm.ByteVector();
        org.mockito.asm.ByteVector byteVector53 = byteVector51.putUTF8("hi!");
        org.mockito.asm.ByteVector byteVector55 = byteVector51.putInt(0);
        org.mockito.asm.ByteVector byteVector57 = byteVector55.putInt((int) ' ');
        org.mockito.asm.ByteVector byteVector59 = byteVector57.putLong(100L);
        byte[] byteArray63 = new byte[] { (byte) 0, (byte) 10, (byte) 1 };
        org.mockito.asm.ByteVector byteVector66 = byteVector57.putByteArray(byteArray63, 0, 0);
        org.mockito.asm.ByteVector byteVector69 = byteVector46.putByteArray(byteArray63, (int) (byte) 1, 0);
        org.mockito.asm.ByteVector byteVector72 = byteVector39.putByteArray(byteArray63, (int) (byte) 0, 0);
        org.mockito.asm.ByteVector byteVector75 = byteVector22.putByteArray(byteArray63, 0, (int) (byte) 1);
        // The following exception was thrown during execution in test generation
        try {
            org.mockito.asm.ByteVector byteVector78 = byteVector5.putByteArray(byteArray63, (int) (byte) 100, (int) ' ');
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
        org.junit.Assert.assertNotNull(byteVector53);
        org.junit.Assert.assertNotNull(byteVector55);
        org.junit.Assert.assertNotNull(byteVector57);
        org.junit.Assert.assertNotNull(byteVector59);
        org.junit.Assert.assertNotNull(byteArray63);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray63), "[0, 10, 1]");
        org.junit.Assert.assertNotNull(byteVector66);
        org.junit.Assert.assertNotNull(byteVector69);
        org.junit.Assert.assertNotNull(byteVector72);
        org.junit.Assert.assertNotNull(byteVector75);
    }

    @Test
    public void test1340() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1340");
        org.mockito.asm.ByteVector byteVector0 = new org.mockito.asm.ByteVector();
        org.mockito.asm.ByteVector byteVector2 = byteVector0.putInt((int) (byte) 10);
        org.mockito.asm.ByteVector byteVector4 = byteVector2.putLong(100L);
        org.mockito.asm.ByteVector byteVector6 = byteVector4.putLong((long) (short) 10);
        org.mockito.asm.ByteVector byteVector8 = byteVector4.putShort(0);
        org.junit.Assert.assertNotNull(byteVector2);
        org.junit.Assert.assertNotNull(byteVector4);
        org.junit.Assert.assertNotNull(byteVector6);
        org.junit.Assert.assertNotNull(byteVector8);
    }

    @Test
    public void test1341() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1341");
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
        org.mockito.asm.ByteVector byteVector59 = byteVector18.putByteArray(byteArray50, (int) (byte) 0, (int) (byte) 1);
        java.lang.Class<?> wildcardClass60 = byteVector59.getClass();
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
        org.junit.Assert.assertNotNull(byteVector59);
        org.junit.Assert.assertNotNull(wildcardClass60);
    }

    @Test
    public void test1342() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1342");
        org.mockito.asm.ByteVector byteVector0 = new org.mockito.asm.ByteVector();
        org.mockito.asm.ByteVector byteVector2 = byteVector0.putUTF8("hi!");
        org.mockito.asm.ByteVector byteVector4 = byteVector0.putInt(0);
        org.mockito.asm.ByteVector byteVector6 = byteVector0.putInt(1);
        org.mockito.asm.ByteVector byteVector8 = byteVector0.putUTF8("");
        org.mockito.asm.ByteVector byteVector10 = byteVector8.putLong(10L);
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
        org.mockito.asm.ByteVector byteVector46 = byteVector8.putByteArray(byteArray34, 0, (int) (short) 1);
        org.mockito.asm.ByteVector byteVector48 = byteVector46.putByte(100);
        java.lang.Class<?> wildcardClass49 = byteVector46.getClass();
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
        org.junit.Assert.assertNotNull(byteVector46);
        org.junit.Assert.assertNotNull(byteVector48);
        org.junit.Assert.assertNotNull(wildcardClass49);
    }

    @Test
    public void test1343() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1343");
        org.mockito.asm.ByteVector byteVector1 = new org.mockito.asm.ByteVector((int) (byte) 10);
        org.mockito.asm.ByteVector byteVector3 = byteVector1.putByte((int) '4');
        org.mockito.asm.ByteVector byteVector5 = byteVector1.putLong((long) 'a');
        org.mockito.asm.ByteVector byteVector7 = byteVector5.putLong((-1L));
        org.mockito.asm.ByteVector byteVector9 = byteVector7.putShort(10);
        org.junit.Assert.assertNotNull(byteVector3);
        org.junit.Assert.assertNotNull(byteVector5);
        org.junit.Assert.assertNotNull(byteVector7);
        org.junit.Assert.assertNotNull(byteVector9);
    }

    @Test
    public void test1344() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1344");
        org.mockito.asm.ByteVector byteVector0 = new org.mockito.asm.ByteVector();
        org.mockito.asm.ByteVector byteVector2 = byteVector0.putUTF8("hi!");
        org.mockito.asm.ByteVector byteVector4 = byteVector2.putInt((int) (byte) 10);
        org.mockito.asm.ByteVector byteVector6 = byteVector2.putLong((long) 10);
        org.mockito.asm.ByteVector byteVector8 = byteVector2.putByte((int) '4');
        org.junit.Assert.assertNotNull(byteVector2);
        org.junit.Assert.assertNotNull(byteVector4);
        org.junit.Assert.assertNotNull(byteVector6);
        org.junit.Assert.assertNotNull(byteVector8);
    }

    @Test
    public void test1345() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1345");
        org.mockito.asm.ByteVector byteVector0 = new org.mockito.asm.ByteVector();
        org.mockito.asm.ByteVector byteVector2 = byteVector0.putUTF8("hi!");
        org.mockito.asm.ByteVector byteVector4 = byteVector2.putLong((long) (byte) 10);
        org.mockito.asm.ByteVector byteVector6 = byteVector4.putUTF8("hi!");
        org.mockito.asm.ByteVector byteVector8 = byteVector4.putLong((long) 10);
        org.mockito.asm.ByteVector byteVector10 = byteVector8.putByte((int) '4');
        org.mockito.asm.ByteVector byteVector12 = byteVector8.putUTF8("hi!");
        org.mockito.asm.ByteVector byteVector14 = byteVector8.putByte((int) (short) -1);
        org.mockito.asm.ByteVector byteVector16 = byteVector8.putLong(1L);
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
    public void test1346() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1346");
        org.mockito.asm.ByteVector byteVector0 = new org.mockito.asm.ByteVector();
        org.mockito.asm.ByteVector byteVector2 = byteVector0.putUTF8("hi!");
        org.mockito.asm.ByteVector byteVector4 = byteVector2.putLong((long) (byte) 10);
        org.mockito.asm.ByteVector byteVector6 = byteVector4.putUTF8("hi!");
        org.mockito.asm.ByteVector byteVector8 = byteVector4.putLong((long) 10);
        org.mockito.asm.ByteVector byteVector10 = byteVector8.putUTF8("");
        org.mockito.asm.ByteVector byteVector12 = byteVector8.putLong(10L);
        org.mockito.asm.ByteVector byteVector14 = byteVector12.putLong((long) (byte) -1);
        org.mockito.asm.ByteVector byteVector16 = byteVector14.putShort((int) (short) 0);
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
    public void test1347() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1347");
        org.mockito.asm.ByteVector byteVector0 = new org.mockito.asm.ByteVector();
        org.mockito.asm.ByteVector byteVector2 = byteVector0.putUTF8("hi!");
        org.mockito.asm.ByteVector byteVector4 = byteVector0.putShort((int) (short) -1);
        org.mockito.asm.ByteVector byteVector6 = byteVector0.putInt(0);
        org.mockito.asm.ByteVector byteVector8 = byteVector0.putUTF8("hi!");
        org.mockito.asm.ByteVector byteVector10 = byteVector0.putByte(100);
        org.mockito.asm.ByteVector byteVector12 = byteVector0.putInt((int) ' ');
        org.mockito.asm.ByteVector byteVector14 = byteVector0.putShort((int) (short) 1);
        org.mockito.asm.ByteVector byteVector16 = byteVector14.putUTF8("");
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
    public void test1348() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1348");
        org.mockito.asm.ByteVector byteVector0 = new org.mockito.asm.ByteVector();
        org.mockito.asm.ByteVector byteVector2 = byteVector0.putUTF8("hi!");
        org.mockito.asm.ByteVector byteVector4 = byteVector2.putInt((int) (byte) 10);
        org.mockito.asm.ByteVector byteVector6 = byteVector4.putUTF8("");
        org.mockito.asm.ByteVector byteVector8 = byteVector6.putInt(0);
        org.mockito.asm.ByteVector byteVector10 = byteVector8.putInt((int) (short) 10);
        org.mockito.asm.ByteVector byteVector12 = byteVector10.putShort((int) (short) 1);
        org.mockito.asm.ByteVector byteVector14 = byteVector10.putUTF8("");
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
    public void test1349() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1349");
        org.mockito.asm.ByteVector byteVector0 = new org.mockito.asm.ByteVector();
        org.mockito.asm.ByteVector byteVector2 = byteVector0.putUTF8("hi!");
        org.mockito.asm.ByteVector byteVector4 = byteVector0.putLong((long) ' ');
        org.mockito.asm.ByteVector byteVector6 = byteVector4.putByte((int) 'a');
        org.mockito.asm.ByteVector byteVector8 = byteVector6.putInt((int) (short) 0);
        org.mockito.asm.ByteVector byteVector10 = byteVector8.putByte((int) (short) 0);
        org.mockito.asm.ByteVector byteVector12 = byteVector10.putUTF8("");
        org.mockito.asm.ByteVector byteVector14 = byteVector12.putUTF8("hi!");
        org.mockito.asm.ByteVector byteVector16 = byteVector14.putLong(10L);
        org.mockito.asm.ByteVector byteVector18 = byteVector16.putUTF8("");
        org.mockito.asm.ByteVector byteVector20 = byteVector18.putUTF8("");
        org.mockito.asm.ByteVector byteVector21 = new org.mockito.asm.ByteVector();
        org.mockito.asm.ByteVector byteVector23 = byteVector21.putUTF8("hi!");
        org.mockito.asm.ByteVector byteVector25 = byteVector21.putInt(0);
        org.mockito.asm.ByteVector byteVector27 = byteVector21.putShort((int) '4');
        org.mockito.asm.ByteVector byteVector29 = byteVector21.putByte(100);
        org.mockito.asm.ByteVector byteVector31 = byteVector29.putInt((int) (byte) 10);
        org.mockito.asm.ByteVector byteVector33 = byteVector29.putInt((int) (byte) 10);
        org.mockito.asm.ByteVector byteVector35 = byteVector33.putByte(100);
        org.mockito.asm.ByteVector byteVector36 = new org.mockito.asm.ByteVector();
        org.mockito.asm.ByteVector byteVector38 = byteVector36.putUTF8("hi!");
        org.mockito.asm.ByteVector byteVector40 = byteVector36.putInt(0);
        org.mockito.asm.ByteVector byteVector42 = byteVector40.putInt((int) ' ');
        org.mockito.asm.ByteVector byteVector44 = byteVector42.putLong(100L);
        byte[] byteArray48 = new byte[] { (byte) 0, (byte) 10, (byte) 1 };
        org.mockito.asm.ByteVector byteVector51 = byteVector42.putByteArray(byteArray48, 0, 0);
        org.mockito.asm.ByteVector byteVector54 = byteVector35.putByteArray(byteArray48, (int) (byte) 1, (int) (byte) 0);
        // The following exception was thrown during execution in test generation
        try {
            org.mockito.asm.ByteVector byteVector57 = byteVector20.putByteArray(byteArray48, 0, (int) (short) 10);
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
        org.junit.Assert.assertNotNull(byteVector38);
        org.junit.Assert.assertNotNull(byteVector40);
        org.junit.Assert.assertNotNull(byteVector42);
        org.junit.Assert.assertNotNull(byteVector44);
        org.junit.Assert.assertNotNull(byteArray48);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray48), "[0, 10, 1]");
        org.junit.Assert.assertNotNull(byteVector51);
        org.junit.Assert.assertNotNull(byteVector54);
    }

    @Test
    public void test1350() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1350");
        org.mockito.asm.ByteVector byteVector0 = new org.mockito.asm.ByteVector();
        org.mockito.asm.ByteVector byteVector2 = byteVector0.putUTF8("hi!");
        org.mockito.asm.ByteVector byteVector4 = byteVector0.putShort((int) (short) -1);
        org.mockito.asm.ByteVector byteVector6 = byteVector0.putInt((int) (byte) 10);
        org.mockito.asm.ByteVector byteVector8 = byteVector6.putUTF8("hi!");
        org.mockito.asm.ByteVector byteVector10 = byteVector8.putInt((int) (short) 10);
        org.mockito.asm.ByteVector byteVector12 = byteVector10.putInt((int) (byte) 100);
        org.junit.Assert.assertNotNull(byteVector2);
        org.junit.Assert.assertNotNull(byteVector4);
        org.junit.Assert.assertNotNull(byteVector6);
        org.junit.Assert.assertNotNull(byteVector8);
        org.junit.Assert.assertNotNull(byteVector10);
        org.junit.Assert.assertNotNull(byteVector12);
    }

    @Test
    public void test1351() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1351");
        org.mockito.asm.ByteVector byteVector0 = new org.mockito.asm.ByteVector();
        org.mockito.asm.ByteVector byteVector2 = byteVector0.putUTF8("hi!");
        org.mockito.asm.ByteVector byteVector4 = byteVector0.putInt((int) (short) 1);
        org.mockito.asm.ByteVector byteVector6 = byteVector4.putInt((int) 'a');
        java.lang.Class<?> wildcardClass7 = byteVector4.getClass();
        org.junit.Assert.assertNotNull(byteVector2);
        org.junit.Assert.assertNotNull(byteVector4);
        org.junit.Assert.assertNotNull(byteVector6);
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test1352() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1352");
        org.mockito.asm.ByteVector byteVector1 = new org.mockito.asm.ByteVector((int) '#');
        org.mockito.asm.ByteVector byteVector3 = byteVector1.putLong(100L);
        org.mockito.asm.ByteVector byteVector5 = byteVector3.putLong(1L);
        org.mockito.asm.ByteVector byteVector7 = byteVector5.putUTF8("hi!");
        org.mockito.asm.ByteVector byteVector9 = byteVector7.putUTF8("");
        org.mockito.asm.ByteVector byteVector11 = byteVector9.putShort((int) (byte) -1);
        org.mockito.asm.ByteVector byteVector13 = byteVector11.putInt((int) '#');
        org.mockito.asm.ByteVector byteVector15 = byteVector13.putInt((int) (byte) 1);
        org.junit.Assert.assertNotNull(byteVector3);
        org.junit.Assert.assertNotNull(byteVector5);
        org.junit.Assert.assertNotNull(byteVector7);
        org.junit.Assert.assertNotNull(byteVector9);
        org.junit.Assert.assertNotNull(byteVector11);
        org.junit.Assert.assertNotNull(byteVector13);
        org.junit.Assert.assertNotNull(byteVector15);
    }

    @Test
    public void test1353() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1353");
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
        org.mockito.asm.ByteVector byteVector28 = byteVector26.putShort(100);
        java.lang.Class<?> wildcardClass29 = byteVector26.getClass();
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
        org.junit.Assert.assertNotNull(wildcardClass29);
    }

    @Test
    public void test1354() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1354");
        org.mockito.asm.ByteVector byteVector1 = new org.mockito.asm.ByteVector((int) (short) 0);
        org.mockito.asm.ByteVector byteVector2 = new org.mockito.asm.ByteVector();
        org.mockito.asm.ByteVector byteVector4 = byteVector2.putUTF8("hi!");
        org.mockito.asm.ByteVector byteVector6 = byteVector2.putInt(0);
        org.mockito.asm.ByteVector byteVector8 = byteVector6.putInt((int) ' ');
        org.mockito.asm.ByteVector byteVector10 = byteVector8.putLong(100L);
        byte[] byteArray14 = new byte[] { (byte) 0, (byte) 10, (byte) 1 };
        org.mockito.asm.ByteVector byteVector17 = byteVector8.putByteArray(byteArray14, 0, 0);
        org.mockito.asm.ByteVector byteVector20 = byteVector1.putByteArray(byteArray14, 1, (int) (short) 0);
        org.mockito.asm.ByteVector byteVector22 = byteVector1.putShort((int) (short) 0);
        org.mockito.asm.ByteVector byteVector24 = new org.mockito.asm.ByteVector((int) '#');
        org.mockito.asm.ByteVector byteVector26 = byteVector24.putUTF8("hi!");
        org.mockito.asm.ByteVector byteVector28 = byteVector24.putUTF8("");
        org.mockito.asm.ByteVector byteVector29 = new org.mockito.asm.ByteVector();
        org.mockito.asm.ByteVector byteVector31 = byteVector29.putUTF8("hi!");
        org.mockito.asm.ByteVector byteVector33 = byteVector31.putLong((long) (byte) 10);
        org.mockito.asm.ByteVector byteVector35 = byteVector33.putUTF8("hi!");
        org.mockito.asm.ByteVector byteVector37 = byteVector33.putLong((-1L));
        org.mockito.asm.ByteVector byteVector39 = byteVector37.putInt(10);
        org.mockito.asm.ByteVector byteVector41 = byteVector39.putShort((int) '#');
        org.mockito.asm.ByteVector byteVector43 = new org.mockito.asm.ByteVector((int) (short) 0);
        org.mockito.asm.ByteVector byteVector44 = new org.mockito.asm.ByteVector();
        org.mockito.asm.ByteVector byteVector46 = byteVector44.putUTF8("hi!");
        org.mockito.asm.ByteVector byteVector48 = byteVector44.putInt(0);
        org.mockito.asm.ByteVector byteVector50 = byteVector48.putInt((int) ' ');
        org.mockito.asm.ByteVector byteVector52 = byteVector50.putLong(100L);
        byte[] byteArray56 = new byte[] { (byte) 0, (byte) 10, (byte) 1 };
        org.mockito.asm.ByteVector byteVector59 = byteVector50.putByteArray(byteArray56, 0, 0);
        org.mockito.asm.ByteVector byteVector62 = byteVector43.putByteArray(byteArray56, 1, (int) (short) 0);
        org.mockito.asm.ByteVector byteVector65 = byteVector39.putByteArray(byteArray56, (int) (short) 0, 0);
        org.mockito.asm.ByteVector byteVector68 = byteVector24.putByteArray(byteArray56, (int) (short) 1, 1);
        // The following exception was thrown during execution in test generation
        try {
            org.mockito.asm.ByteVector byteVector71 = byteVector22.putByteArray(byteArray56, (int) (byte) 100, 0);
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
        org.junit.Assert.assertNotNull(byteVector20);
        org.junit.Assert.assertNotNull(byteVector22);
        org.junit.Assert.assertNotNull(byteVector26);
        org.junit.Assert.assertNotNull(byteVector28);
        org.junit.Assert.assertNotNull(byteVector31);
        org.junit.Assert.assertNotNull(byteVector33);
        org.junit.Assert.assertNotNull(byteVector35);
        org.junit.Assert.assertNotNull(byteVector37);
        org.junit.Assert.assertNotNull(byteVector39);
        org.junit.Assert.assertNotNull(byteVector41);
        org.junit.Assert.assertNotNull(byteVector46);
        org.junit.Assert.assertNotNull(byteVector48);
        org.junit.Assert.assertNotNull(byteVector50);
        org.junit.Assert.assertNotNull(byteVector52);
        org.junit.Assert.assertNotNull(byteArray56);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray56), "[0, 10, 1]");
        org.junit.Assert.assertNotNull(byteVector59);
        org.junit.Assert.assertNotNull(byteVector62);
        org.junit.Assert.assertNotNull(byteVector65);
        org.junit.Assert.assertNotNull(byteVector68);
    }

    @Test
    public void test1355() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1355");
        org.mockito.asm.ByteVector byteVector0 = new org.mockito.asm.ByteVector();
        org.mockito.asm.ByteVector byteVector2 = byteVector0.putUTF8("hi!");
        org.mockito.asm.ByteVector byteVector4 = byteVector0.putLong((long) (short) 1);
        org.mockito.asm.ByteVector byteVector6 = byteVector4.putShort((int) (byte) -1);
        org.mockito.asm.ByteVector byteVector8 = byteVector4.putUTF8("hi!");
        org.mockito.asm.ByteVector byteVector10 = byteVector8.putUTF8("");
        org.mockito.asm.ByteVector byteVector12 = byteVector8.putLong((long) ' ');
        org.junit.Assert.assertNotNull(byteVector2);
        org.junit.Assert.assertNotNull(byteVector4);
        org.junit.Assert.assertNotNull(byteVector6);
        org.junit.Assert.assertNotNull(byteVector8);
        org.junit.Assert.assertNotNull(byteVector10);
        org.junit.Assert.assertNotNull(byteVector12);
    }

    @Test
    public void test1356() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1356");
        org.mockito.asm.ByteVector byteVector1 = new org.mockito.asm.ByteVector((int) (byte) 1);
        org.mockito.asm.ByteVector byteVector3 = byteVector1.putByte((int) (short) 1);
        org.mockito.asm.ByteVector byteVector5 = byteVector3.putInt((int) (short) 1);
        org.junit.Assert.assertNotNull(byteVector3);
        org.junit.Assert.assertNotNull(byteVector5);
    }

    @Test
    public void test1357() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1357");
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
        org.mockito.asm.ByteVector byteVector47 = byteVector45.putInt(1);
        java.lang.Class<?> wildcardClass48 = byteVector47.getClass();
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
        org.junit.Assert.assertNotNull(byteVector47);
        org.junit.Assert.assertNotNull(wildcardClass48);
    }

    @Test
    public void test1358() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1358");
        org.mockito.asm.ByteVector byteVector0 = new org.mockito.asm.ByteVector();
        org.mockito.asm.ByteVector byteVector2 = byteVector0.putUTF8("hi!");
        org.mockito.asm.ByteVector byteVector4 = byteVector0.putShort((int) (short) -1);
        org.mockito.asm.ByteVector byteVector6 = byteVector0.putInt((int) (byte) 10);
        org.mockito.asm.ByteVector byteVector8 = byteVector6.putUTF8("hi!");
        org.mockito.asm.ByteVector byteVector10 = byteVector8.putShort(0);
        org.mockito.asm.ByteVector byteVector12 = byteVector10.putLong(10L);
        org.mockito.asm.ByteVector byteVector14 = byteVector12.putByte((int) 'a');
        org.mockito.asm.ByteVector byteVector16 = byteVector14.putUTF8("hi!");
        org.mockito.asm.ByteVector byteVector17 = new org.mockito.asm.ByteVector();
        org.mockito.asm.ByteVector byteVector19 = byteVector17.putUTF8("hi!");
        org.mockito.asm.ByteVector byteVector21 = byteVector17.putByte((int) (byte) 1);
        org.mockito.asm.ByteVector byteVector23 = byteVector17.putLong((long) (short) 1);
        org.mockito.asm.ByteVector byteVector25 = byteVector17.putShort((int) (byte) 100);
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
        org.mockito.asm.ByteVector byteVector58 = byteVector25.putByteArray(byteArray49, 1, 1);
        // The following exception was thrown during execution in test generation
        try {
            org.mockito.asm.ByteVector byteVector61 = byteVector16.putByteArray(byteArray49, (int) '4', (int) '#');
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
    public void test1359() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1359");
        org.mockito.asm.ByteVector byteVector0 = new org.mockito.asm.ByteVector();
        org.mockito.asm.ByteVector byteVector2 = byteVector0.putUTF8("hi!");
        org.mockito.asm.ByteVector byteVector4 = byteVector2.putInt(0);
        org.mockito.asm.ByteVector byteVector6 = byteVector2.putByte((int) (byte) 10);
        org.mockito.asm.ByteVector byteVector8 = byteVector6.putLong(0L);
        org.mockito.asm.ByteVector byteVector10 = byteVector8.putShort((int) 'a');
        org.mockito.asm.ByteVector byteVector12 = byteVector10.putLong((long) '4');
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
            org.mockito.asm.ByteVector byteVector62 = byteVector10.putByteArray(byteArray53, (-1), (int) (byte) 0);
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
    public void test1360() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1360");
        org.mockito.asm.ByteVector byteVector0 = new org.mockito.asm.ByteVector();
        org.mockito.asm.ByteVector byteVector2 = byteVector0.putUTF8("hi!");
        org.mockito.asm.ByteVector byteVector4 = byteVector2.putInt((int) (byte) 10);
        org.mockito.asm.ByteVector byteVector6 = byteVector2.putLong((long) 0);
        org.mockito.asm.ByteVector byteVector8 = byteVector2.putUTF8("hi!");
        org.mockito.asm.ByteVector byteVector10 = byteVector2.putInt((int) (short) 100);
        org.mockito.asm.ByteVector byteVector12 = byteVector10.putByte((int) (short) 1);
        org.mockito.asm.ByteVector byteVector14 = byteVector12.putByte(10);
        org.junit.Assert.assertNotNull(byteVector2);
        org.junit.Assert.assertNotNull(byteVector4);
        org.junit.Assert.assertNotNull(byteVector6);
        org.junit.Assert.assertNotNull(byteVector8);
        org.junit.Assert.assertNotNull(byteVector10);
        org.junit.Assert.assertNotNull(byteVector12);
        org.junit.Assert.assertNotNull(byteVector14);
    }

    @Test
    public void test1361() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1361");
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
    public void test1362() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1362");
        org.mockito.asm.ByteVector byteVector0 = new org.mockito.asm.ByteVector();
        org.mockito.asm.ByteVector byteVector2 = byteVector0.putUTF8("hi!");
        org.mockito.asm.ByteVector byteVector4 = byteVector2.putLong((long) (byte) 10);
        org.mockito.asm.ByteVector byteVector6 = byteVector4.putUTF8("hi!");
        org.mockito.asm.ByteVector byteVector8 = byteVector4.putLong((long) (short) -1);
        org.mockito.asm.ByteVector byteVector10 = byteVector8.putInt(10);
        org.mockito.asm.ByteVector byteVector12 = byteVector8.putByte((int) (short) 1);
        org.mockito.asm.ByteVector byteVector14 = byteVector12.putShort((int) (short) 100);
        org.mockito.asm.ByteVector byteVector16 = byteVector14.putByte((int) ' ');
        org.mockito.asm.ByteVector byteVector18 = byteVector14.putUTF8("");
        org.mockito.asm.ByteVector byteVector20 = byteVector14.putByte((-1));
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
    public void test1363() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1363");
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
        org.mockito.asm.ByteVector byteVector20 = byteVector18.putByte((int) (byte) 100);
        org.mockito.asm.ByteVector byteVector22 = byteVector18.putUTF8("hi!");
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
    public void test1364() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1364");
        org.mockito.asm.ByteVector byteVector0 = new org.mockito.asm.ByteVector();
        org.mockito.asm.ByteVector byteVector2 = byteVector0.putUTF8("hi!");
        org.mockito.asm.ByteVector byteVector4 = byteVector0.putInt(0);
        org.mockito.asm.ByteVector byteVector6 = byteVector4.putInt((int) ' ');
        org.mockito.asm.ByteVector byteVector8 = byteVector6.putLong((long) (short) 10);
        org.mockito.asm.ByteVector byteVector10 = byteVector8.putLong((long) 'a');
        org.mockito.asm.ByteVector byteVector12 = byteVector10.putByte((int) (short) 10);
        org.mockito.asm.ByteVector byteVector14 = byteVector10.putInt(10);
        org.mockito.asm.ByteVector byteVector16 = byteVector10.putShort((int) (byte) -1);
        org.mockito.asm.ByteVector byteVector18 = byteVector10.putShort((int) '4');
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
    public void test1365() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1365");
        org.mockito.asm.ByteVector byteVector0 = new org.mockito.asm.ByteVector();
        org.mockito.asm.ByteVector byteVector2 = byteVector0.putUTF8("hi!");
        org.mockito.asm.ByteVector byteVector4 = byteVector0.putInt(0);
        org.mockito.asm.ByteVector byteVector6 = byteVector4.putInt((int) ' ');
        org.mockito.asm.ByteVector byteVector8 = byteVector6.putLong((long) (short) 10);
        org.mockito.asm.ByteVector byteVector10 = byteVector8.putLong((long) 'a');
        org.mockito.asm.ByteVector byteVector12 = byteVector10.putByte((int) '#');
        org.mockito.asm.ByteVector byteVector14 = byteVector12.putInt((int) ' ');
        org.mockito.asm.ByteVector byteVector16 = byteVector14.putShort(0);
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
    public void test1366() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1366");
        org.mockito.asm.ByteVector byteVector1 = new org.mockito.asm.ByteVector((int) '#');
        org.mockito.asm.ByteVector byteVector3 = byteVector1.putInt(100);
        org.mockito.asm.ByteVector byteVector5 = byteVector3.putByte((-1));
        org.mockito.asm.ByteVector byteVector7 = byteVector5.putInt((int) 'a');
        org.mockito.asm.ByteVector byteVector9 = byteVector7.putByte((int) (byte) 1);
        org.mockito.asm.ByteVector byteVector11 = new org.mockito.asm.ByteVector((int) (byte) 1);
        org.mockito.asm.ByteVector byteVector13 = byteVector11.putByte((int) (byte) 10);
        org.mockito.asm.ByteVector byteVector15 = byteVector13.putShort((int) (short) 10);
        org.mockito.asm.ByteVector byteVector17 = byteVector15.putShort((int) (byte) 1);
        org.mockito.asm.ByteVector byteVector19 = byteVector17.putInt((int) (byte) -1);
        org.mockito.asm.ByteVector byteVector20 = new org.mockito.asm.ByteVector();
        org.mockito.asm.ByteVector byteVector22 = byteVector20.putUTF8("hi!");
        org.mockito.asm.ByteVector byteVector24 = byteVector20.putLong((long) ' ');
        org.mockito.asm.ByteVector byteVector26 = byteVector24.putByte((int) 'a');
        org.mockito.asm.ByteVector byteVector28 = byteVector24.putByte((int) (short) -1);
        org.mockito.asm.ByteVector byteVector30 = byteVector24.putLong(0L);
        org.mockito.asm.ByteVector byteVector32 = byteVector30.putByte(0);
        org.mockito.asm.ByteVector byteVector34 = byteVector32.putLong(1L);
        org.mockito.asm.ByteVector byteVector36 = byteVector34.putShort((int) 'a');
        org.mockito.asm.ByteVector byteVector38 = byteVector34.putLong((long) 10);
        org.mockito.asm.ByteVector byteVector40 = byteVector34.putUTF8("");
        org.mockito.asm.ByteVector byteVector41 = new org.mockito.asm.ByteVector();
        org.mockito.asm.ByteVector byteVector43 = byteVector41.putUTF8("hi!");
        org.mockito.asm.ByteVector byteVector45 = byteVector43.putLong((long) (byte) 10);
        org.mockito.asm.ByteVector byteVector47 = byteVector45.putUTF8("hi!");
        org.mockito.asm.ByteVector byteVector49 = byteVector45.putLong((long) (short) -1);
        org.mockito.asm.ByteVector byteVector51 = byteVector49.putInt(10);
        org.mockito.asm.ByteVector byteVector53 = byteVector49.putByte((int) (short) 1);
        org.mockito.asm.ByteVector byteVector55 = byteVector49.putInt((int) (short) -1);
        org.mockito.asm.ByteVector byteVector57 = byteVector49.putUTF8("hi!");
        org.mockito.asm.ByteVector byteVector58 = new org.mockito.asm.ByteVector();
        org.mockito.asm.ByteVector byteVector60 = byteVector58.putUTF8("hi!");
        org.mockito.asm.ByteVector byteVector62 = byteVector58.putLong((long) ' ');
        org.mockito.asm.ByteVector byteVector64 = byteVector62.putByte((int) 'a');
        org.mockito.asm.ByteVector byteVector66 = byteVector62.putByte((int) (short) -1);
        org.mockito.asm.ByteVector byteVector68 = byteVector62.putLong(0L);
        org.mockito.asm.ByteVector byteVector70 = byteVector62.putUTF8("hi!");
        org.mockito.asm.ByteVector byteVector72 = byteVector70.putUTF8("");
        org.mockito.asm.ByteVector byteVector74 = byteVector72.putLong((long) (byte) 10);
        org.mockito.asm.ByteVector byteVector76 = byteVector72.putLong((long) (short) 100);
        byte[] byteArray81 = new byte[] { (byte) 1, (byte) 0, (byte) 0, (byte) -1 };
        org.mockito.asm.ByteVector byteVector84 = byteVector72.putByteArray(byteArray81, 0, 0);
        org.mockito.asm.ByteVector byteVector87 = byteVector57.putByteArray(byteArray81, (int) (byte) 0, (int) (short) 1);
        org.mockito.asm.ByteVector byteVector90 = byteVector34.putByteArray(byteArray81, (int) (short) 0, (int) (short) 0);
        org.mockito.asm.ByteVector byteVector93 = byteVector17.putByteArray(byteArray81, 0, (int) (byte) 1);
        // The following exception was thrown during execution in test generation
        try {
            org.mockito.asm.ByteVector byteVector96 = byteVector7.putByteArray(byteArray81, (int) (short) 0, (int) ' ');
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteVector3);
        org.junit.Assert.assertNotNull(byteVector5);
        org.junit.Assert.assertNotNull(byteVector7);
        org.junit.Assert.assertNotNull(byteVector9);
        org.junit.Assert.assertNotNull(byteVector13);
        org.junit.Assert.assertNotNull(byteVector15);
        org.junit.Assert.assertNotNull(byteVector17);
        org.junit.Assert.assertNotNull(byteVector19);
        org.junit.Assert.assertNotNull(byteVector22);
        org.junit.Assert.assertNotNull(byteVector24);
        org.junit.Assert.assertNotNull(byteVector26);
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
        org.junit.Assert.assertNotNull(byteVector51);
        org.junit.Assert.assertNotNull(byteVector53);
        org.junit.Assert.assertNotNull(byteVector55);
        org.junit.Assert.assertNotNull(byteVector57);
        org.junit.Assert.assertNotNull(byteVector60);
        org.junit.Assert.assertNotNull(byteVector62);
        org.junit.Assert.assertNotNull(byteVector64);
        org.junit.Assert.assertNotNull(byteVector66);
        org.junit.Assert.assertNotNull(byteVector68);
        org.junit.Assert.assertNotNull(byteVector70);
        org.junit.Assert.assertNotNull(byteVector72);
        org.junit.Assert.assertNotNull(byteVector74);
        org.junit.Assert.assertNotNull(byteVector76);
        org.junit.Assert.assertNotNull(byteArray81);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray81), "[1, 0, 0, -1]");
        org.junit.Assert.assertNotNull(byteVector84);
        org.junit.Assert.assertNotNull(byteVector87);
        org.junit.Assert.assertNotNull(byteVector90);
        org.junit.Assert.assertNotNull(byteVector93);
    }

    @Test
    public void test1367() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1367");
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
        org.mockito.asm.ByteVector byteVector22 = byteVector20.putInt((int) '4');
        org.mockito.asm.ByteVector byteVector24 = byteVector22.putLong((long) (short) -1);
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
    public void test1368() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1368");
        org.mockito.asm.ByteVector byteVector0 = new org.mockito.asm.ByteVector();
        org.mockito.asm.ByteVector byteVector2 = byteVector0.putUTF8("hi!");
        org.mockito.asm.ByteVector byteVector4 = byteVector0.putInt(0);
        org.mockito.asm.ByteVector byteVector6 = byteVector4.putInt((int) ' ');
        org.mockito.asm.ByteVector byteVector8 = byteVector6.putLong((long) (short) 10);
        org.mockito.asm.ByteVector byteVector10 = byteVector8.putUTF8("hi!");
        org.mockito.asm.ByteVector byteVector12 = byteVector8.putByte(0);
        org.mockito.asm.ByteVector byteVector14 = byteVector12.putInt((int) (short) 1);
        org.mockito.asm.ByteVector byteVector16 = byteVector12.putLong((long) (short) 0);
        org.mockito.asm.ByteVector byteVector17 = new org.mockito.asm.ByteVector();
        org.mockito.asm.ByteVector byteVector19 = byteVector17.putUTF8("hi!");
        org.mockito.asm.ByteVector byteVector21 = byteVector19.putLong((long) (byte) 10);
        org.mockito.asm.ByteVector byteVector23 = byteVector21.putUTF8("hi!");
        org.mockito.asm.ByteVector byteVector25 = byteVector21.putLong((long) 10);
        org.mockito.asm.ByteVector byteVector27 = byteVector25.putLong(0L);
        org.mockito.asm.ByteVector byteVector29 = byteVector27.putUTF8("hi!");
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
        org.mockito.asm.ByteVector byteVector62 = byteVector29.putByteArray(byteArray53, (int) (byte) 0, 0);
        org.mockito.asm.ByteVector byteVector65 = byteVector12.putByteArray(byteArray53, 0, (int) (byte) 1);
        org.mockito.asm.ByteVector byteVector67 = byteVector12.putInt(100);
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
        org.junit.Assert.assertNotNull(byteVector65);
        org.junit.Assert.assertNotNull(byteVector67);
    }

    @Test
    public void test1369() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1369");
        org.mockito.asm.ByteVector byteVector0 = new org.mockito.asm.ByteVector();
        org.mockito.asm.ByteVector byteVector2 = byteVector0.putUTF8("hi!");
        org.mockito.asm.ByteVector byteVector4 = byteVector2.putLong((long) (byte) 10);
        org.mockito.asm.ByteVector byteVector6 = byteVector4.putUTF8("hi!");
        org.mockito.asm.ByteVector byteVector8 = byteVector4.putLong((long) 10);
        org.mockito.asm.ByteVector byteVector10 = byteVector8.putUTF8("hi!");
        org.junit.Assert.assertNotNull(byteVector2);
        org.junit.Assert.assertNotNull(byteVector4);
        org.junit.Assert.assertNotNull(byteVector6);
        org.junit.Assert.assertNotNull(byteVector8);
        org.junit.Assert.assertNotNull(byteVector10);
    }

    @Test
    public void test1370() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1370");
        org.mockito.asm.ByteVector byteVector0 = new org.mockito.asm.ByteVector();
        org.mockito.asm.ByteVector byteVector2 = byteVector0.putUTF8("hi!");
        org.mockito.asm.ByteVector byteVector4 = byteVector0.putLong((long) ' ');
        org.mockito.asm.ByteVector byteVector6 = byteVector4.putByte((int) 'a');
        org.mockito.asm.ByteVector byteVector8 = byteVector4.putByte((int) (short) -1);
        org.mockito.asm.ByteVector byteVector10 = byteVector4.putLong(0L);
        org.mockito.asm.ByteVector byteVector12 = byteVector10.putInt((int) (short) -1);
        org.mockito.asm.ByteVector byteVector14 = byteVector12.putShort((int) (byte) 1);
        org.mockito.asm.ByteVector byteVector16 = byteVector14.putUTF8("");
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
    public void test1371() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1371");
        org.mockito.asm.ByteVector byteVector0 = new org.mockito.asm.ByteVector();
        org.mockito.asm.ByteVector byteVector2 = byteVector0.putUTF8("hi!");
        org.mockito.asm.ByteVector byteVector4 = byteVector0.putInt(0);
        org.mockito.asm.ByteVector byteVector6 = byteVector0.putShort(10);
        org.mockito.asm.ByteVector byteVector8 = byteVector6.putUTF8("");
        java.lang.Class<?> wildcardClass9 = byteVector6.getClass();
        org.junit.Assert.assertNotNull(byteVector2);
        org.junit.Assert.assertNotNull(byteVector4);
        org.junit.Assert.assertNotNull(byteVector6);
        org.junit.Assert.assertNotNull(byteVector8);
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test1372() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1372");
        org.mockito.asm.ByteVector byteVector0 = new org.mockito.asm.ByteVector();
        org.mockito.asm.ByteVector byteVector2 = byteVector0.putUTF8("hi!");
        org.mockito.asm.ByteVector byteVector4 = byteVector2.putLong((long) (byte) 10);
        org.mockito.asm.ByteVector byteVector6 = byteVector4.putUTF8("hi!");
        org.mockito.asm.ByteVector byteVector8 = byteVector4.putLong((-1L));
        org.mockito.asm.ByteVector byteVector10 = byteVector8.putInt((int) (byte) 1);
        org.mockito.asm.ByteVector byteVector12 = byteVector10.putByte((int) 'a');
        org.junit.Assert.assertNotNull(byteVector2);
        org.junit.Assert.assertNotNull(byteVector4);
        org.junit.Assert.assertNotNull(byteVector6);
        org.junit.Assert.assertNotNull(byteVector8);
        org.junit.Assert.assertNotNull(byteVector10);
        org.junit.Assert.assertNotNull(byteVector12);
    }

    @Test
    public void test1373() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1373");
        org.mockito.asm.ByteVector byteVector0 = new org.mockito.asm.ByteVector();
        org.mockito.asm.ByteVector byteVector2 = byteVector0.putUTF8("hi!");
        org.mockito.asm.ByteVector byteVector4 = byteVector2.putInt(0);
        org.mockito.asm.ByteVector byteVector6 = byteVector2.putByte((int) (byte) 10);
        org.mockito.asm.ByteVector byteVector8 = byteVector6.putUTF8("hi!");
        org.mockito.asm.ByteVector byteVector10 = byteVector8.putShort(100);
        org.mockito.asm.ByteVector byteVector12 = byteVector10.putInt((int) (byte) -1);
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
    public void test1374() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1374");
        org.mockito.asm.ByteVector byteVector0 = new org.mockito.asm.ByteVector();
        org.mockito.asm.ByteVector byteVector2 = byteVector0.putUTF8("hi!");
        org.mockito.asm.ByteVector byteVector4 = byteVector0.putInt(0);
        org.mockito.asm.ByteVector byteVector6 = byteVector0.putShort(10);
        org.mockito.asm.ByteVector byteVector8 = byteVector0.putUTF8("");
        org.mockito.asm.ByteVector byteVector10 = byteVector8.putByte(0);
        org.mockito.asm.ByteVector byteVector12 = byteVector8.putInt((int) '#');
        org.mockito.asm.ByteVector byteVector14 = byteVector12.putShort((int) '#');
        org.mockito.asm.ByteVector byteVector16 = byteVector14.putInt((int) '4');
        org.mockito.asm.ByteVector byteVector17 = new org.mockito.asm.ByteVector();
        org.mockito.asm.ByteVector byteVector19 = byteVector17.putUTF8("hi!");
        org.mockito.asm.ByteVector byteVector21 = byteVector19.putLong((long) (byte) 10);
        org.mockito.asm.ByteVector byteVector23 = byteVector21.putUTF8("hi!");
        org.mockito.asm.ByteVector byteVector25 = byteVector21.putLong((-1L));
        org.mockito.asm.ByteVector byteVector27 = byteVector25.putInt(10);
        org.mockito.asm.ByteVector byteVector29 = byteVector27.putShort((int) '#');
        org.mockito.asm.ByteVector byteVector31 = byteVector29.putShort((int) (short) -1);
        org.mockito.asm.ByteVector byteVector33 = new org.mockito.asm.ByteVector((int) (byte) 100);
        org.mockito.asm.ByteVector byteVector35 = byteVector33.putShort((int) (short) 100);
        org.mockito.asm.ByteVector byteVector36 = new org.mockito.asm.ByteVector();
        org.mockito.asm.ByteVector byteVector38 = byteVector36.putUTF8("hi!");
        org.mockito.asm.ByteVector byteVector40 = byteVector36.putLong((long) ' ');
        org.mockito.asm.ByteVector byteVector42 = byteVector40.putByte((int) 'a');
        org.mockito.asm.ByteVector byteVector44 = byteVector40.putByte((int) (short) -1);
        org.mockito.asm.ByteVector byteVector46 = byteVector40.putLong(0L);
        org.mockito.asm.ByteVector byteVector48 = byteVector40.putUTF8("hi!");
        org.mockito.asm.ByteVector byteVector50 = byteVector48.putUTF8("");
        org.mockito.asm.ByteVector byteVector52 = byteVector48.putInt((int) (byte) 10);
        org.mockito.asm.ByteVector byteVector54 = byteVector48.putByte(0);
        org.mockito.asm.ByteVector byteVector55 = new org.mockito.asm.ByteVector();
        org.mockito.asm.ByteVector byteVector57 = byteVector55.putUTF8("hi!");
        org.mockito.asm.ByteVector byteVector59 = byteVector55.putInt(0);
        org.mockito.asm.ByteVector byteVector61 = byteVector59.putInt((int) ' ');
        org.mockito.asm.ByteVector byteVector63 = byteVector61.putLong(100L);
        byte[] byteArray67 = new byte[] { (byte) 0, (byte) 10, (byte) 1 };
        org.mockito.asm.ByteVector byteVector70 = byteVector61.putByteArray(byteArray67, 0, 0);
        org.mockito.asm.ByteVector byteVector73 = byteVector54.putByteArray(byteArray67, (int) (short) 1, 0);
        org.mockito.asm.ByteVector byteVector76 = byteVector33.putByteArray(byteArray67, 0, (int) (byte) 1);
        org.mockito.asm.ByteVector byteVector79 = byteVector31.putByteArray(byteArray67, (int) (byte) 0, (int) (short) 0);
        // The following exception was thrown during execution in test generation
        try {
            org.mockito.asm.ByteVector byteVector82 = byteVector14.putByteArray(byteArray67, (int) (short) 10, (int) (short) 0);
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
        org.junit.Assert.assertNotNull(byteVector57);
        org.junit.Assert.assertNotNull(byteVector59);
        org.junit.Assert.assertNotNull(byteVector61);
        org.junit.Assert.assertNotNull(byteVector63);
        org.junit.Assert.assertNotNull(byteArray67);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray67), "[0, 10, 1]");
        org.junit.Assert.assertNotNull(byteVector70);
        org.junit.Assert.assertNotNull(byteVector73);
        org.junit.Assert.assertNotNull(byteVector76);
        org.junit.Assert.assertNotNull(byteVector79);
    }

    @Test
    public void test1375() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1375");
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
        java.lang.Class<?> wildcardClass37 = byteArray27.getClass();
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
        org.junit.Assert.assertNotNull(wildcardClass37);
    }

    @Test
    public void test1376() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1376");
        org.mockito.asm.ByteVector byteVector0 = new org.mockito.asm.ByteVector();
        org.mockito.asm.ByteVector byteVector2 = byteVector0.putUTF8("hi!");
        org.mockito.asm.ByteVector byteVector4 = byteVector2.putByte(100);
        org.mockito.asm.ByteVector byteVector6 = byteVector2.putShort((int) 'a');
        org.mockito.asm.ByteVector byteVector8 = byteVector6.putLong((long) (byte) -1);
        org.mockito.asm.ByteVector byteVector10 = byteVector8.putByte((int) (short) -1);
        org.junit.Assert.assertNotNull(byteVector2);
        org.junit.Assert.assertNotNull(byteVector4);
        org.junit.Assert.assertNotNull(byteVector6);
        org.junit.Assert.assertNotNull(byteVector8);
        org.junit.Assert.assertNotNull(byteVector10);
    }

    @Test
    public void test1377() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1377");
        org.mockito.asm.ByteVector byteVector0 = new org.mockito.asm.ByteVector();
        org.mockito.asm.ByteVector byteVector2 = byteVector0.putUTF8("hi!");
        org.mockito.asm.ByteVector byteVector4 = byteVector2.putInt((int) (byte) 10);
        org.mockito.asm.ByteVector byteVector6 = byteVector2.putLong((long) 10);
        org.mockito.asm.ByteVector byteVector8 = byteVector2.putLong(0L);
        org.mockito.asm.ByteVector byteVector10 = byteVector8.putUTF8("hi!");
        org.mockito.asm.ByteVector byteVector12 = byteVector10.putShort((int) (byte) 10);
        org.junit.Assert.assertNotNull(byteVector2);
        org.junit.Assert.assertNotNull(byteVector4);
        org.junit.Assert.assertNotNull(byteVector6);
        org.junit.Assert.assertNotNull(byteVector8);
        org.junit.Assert.assertNotNull(byteVector10);
        org.junit.Assert.assertNotNull(byteVector12);
    }

    @Test
    public void test1378() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1378");
        org.mockito.asm.ByteVector byteVector0 = new org.mockito.asm.ByteVector();
        org.mockito.asm.ByteVector byteVector2 = byteVector0.putUTF8("hi!");
        org.mockito.asm.ByteVector byteVector4 = byteVector2.putLong((long) (byte) 10);
        org.mockito.asm.ByteVector byteVector6 = byteVector4.putUTF8("hi!");
        org.mockito.asm.ByteVector byteVector8 = byteVector4.putLong(1L);
        org.mockito.asm.ByteVector byteVector10 = byteVector4.putLong((long) (-1));
        org.junit.Assert.assertNotNull(byteVector2);
        org.junit.Assert.assertNotNull(byteVector4);
        org.junit.Assert.assertNotNull(byteVector6);
        org.junit.Assert.assertNotNull(byteVector8);
        org.junit.Assert.assertNotNull(byteVector10);
    }

    @Test
    public void test1379() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1379");
        org.mockito.asm.ByteVector byteVector1 = new org.mockito.asm.ByteVector((int) '#');
        org.mockito.asm.ByteVector byteVector3 = byteVector1.putLong(100L);
        org.mockito.asm.ByteVector byteVector5 = byteVector3.putLong(1L);
        org.mockito.asm.ByteVector byteVector7 = byteVector5.putUTF8("hi!");
        org.mockito.asm.ByteVector byteVector9 = byteVector5.putLong((long) 1);
        org.mockito.asm.ByteVector byteVector11 = byteVector9.putByte((int) '4');
        org.junit.Assert.assertNotNull(byteVector3);
        org.junit.Assert.assertNotNull(byteVector5);
        org.junit.Assert.assertNotNull(byteVector7);
        org.junit.Assert.assertNotNull(byteVector9);
        org.junit.Assert.assertNotNull(byteVector11);
    }

    @Test
    public void test1380() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1380");
        org.mockito.asm.ByteVector byteVector0 = new org.mockito.asm.ByteVector();
        org.mockito.asm.ByteVector byteVector2 = byteVector0.putUTF8("hi!");
        org.mockito.asm.ByteVector byteVector4 = byteVector0.putLong((long) ' ');
        org.mockito.asm.ByteVector byteVector6 = byteVector4.putByte((int) 'a');
        org.mockito.asm.ByteVector byteVector8 = byteVector4.putByte((int) (short) -1);
        org.mockito.asm.ByteVector byteVector10 = byteVector4.putLong(0L);
        org.mockito.asm.ByteVector byteVector12 = byteVector4.putUTF8("hi!");
        org.mockito.asm.ByteVector byteVector14 = byteVector12.putUTF8("hi!");
        org.mockito.asm.ByteVector byteVector16 = byteVector14.putLong((long) '#');
        org.mockito.asm.ByteVector byteVector18 = byteVector14.putShort((int) (byte) 10);
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
    public void test1381() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1381");
        org.mockito.asm.ByteVector byteVector0 = new org.mockito.asm.ByteVector();
        org.mockito.asm.ByteVector byteVector2 = byteVector0.putUTF8("hi!");
        org.mockito.asm.ByteVector byteVector4 = byteVector0.putInt(0);
        org.mockito.asm.ByteVector byteVector6 = byteVector0.putShort((int) '4');
        org.mockito.asm.ByteVector byteVector8 = byteVector6.putShort((int) (byte) -1);
        org.mockito.asm.ByteVector byteVector10 = byteVector8.putLong(0L);
        org.mockito.asm.ByteVector byteVector12 = byteVector10.putUTF8("hi!");
        org.mockito.asm.ByteVector byteVector14 = byteVector10.putLong((long) 'a');
        org.mockito.asm.ByteVector byteVector16 = byteVector10.putInt(10);
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
    public void test1382() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1382");
        org.mockito.asm.ByteVector byteVector0 = new org.mockito.asm.ByteVector();
        org.mockito.asm.ByteVector byteVector2 = byteVector0.putUTF8("hi!");
        org.mockito.asm.ByteVector byteVector4 = byteVector2.putInt(0);
        org.mockito.asm.ByteVector byteVector6 = byteVector4.putShort(1);
        org.mockito.asm.ByteVector byteVector7 = new org.mockito.asm.ByteVector();
        org.mockito.asm.ByteVector byteVector9 = byteVector7.putUTF8("hi!");
        org.mockito.asm.ByteVector byteVector11 = byteVector7.putShort((int) (short) -1);
        org.mockito.asm.ByteVector byteVector13 = byteVector7.putLong(0L);
        org.mockito.asm.ByteVector byteVector15 = byteVector7.putShort((int) (byte) -1);
        org.mockito.asm.ByteVector byteVector17 = byteVector15.putByte((int) (byte) 0);
        org.mockito.asm.ByteVector byteVector18 = new org.mockito.asm.ByteVector();
        org.mockito.asm.ByteVector byteVector20 = byteVector18.putUTF8("hi!");
        org.mockito.asm.ByteVector byteVector22 = byteVector18.putLong((long) ' ');
        org.mockito.asm.ByteVector byteVector24 = byteVector22.putByte((int) 'a');
        org.mockito.asm.ByteVector byteVector26 = byteVector22.putByte((int) (short) -1);
        org.mockito.asm.ByteVector byteVector28 = byteVector22.putLong(0L);
        org.mockito.asm.ByteVector byteVector30 = byteVector28.putByte(0);
        org.mockito.asm.ByteVector byteVector32 = byteVector30.putByte(100);
        org.mockito.asm.ByteVector byteVector34 = byteVector30.putByte((int) '4');
        org.mockito.asm.ByteVector byteVector36 = byteVector34.putUTF8("hi!");
        org.mockito.asm.ByteVector byteVector38 = byteVector34.putShort(100);
        org.mockito.asm.ByteVector byteVector40 = byteVector34.putShort((int) (short) 100);
        org.mockito.asm.ByteVector byteVector41 = new org.mockito.asm.ByteVector();
        org.mockito.asm.ByteVector byteVector43 = byteVector41.putUTF8("hi!");
        org.mockito.asm.ByteVector byteVector45 = byteVector41.putInt(0);
        org.mockito.asm.ByteVector byteVector47 = byteVector41.putShort((int) '4');
        org.mockito.asm.ByteVector byteVector49 = byteVector41.putByte(100);
        org.mockito.asm.ByteVector byteVector51 = byteVector49.putInt((int) (byte) 10);
        org.mockito.asm.ByteVector byteVector53 = byteVector49.putInt((int) (byte) 10);
        org.mockito.asm.ByteVector byteVector55 = byteVector53.putByte(100);
        org.mockito.asm.ByteVector byteVector56 = new org.mockito.asm.ByteVector();
        org.mockito.asm.ByteVector byteVector58 = byteVector56.putUTF8("hi!");
        org.mockito.asm.ByteVector byteVector60 = byteVector56.putInt(0);
        org.mockito.asm.ByteVector byteVector62 = byteVector60.putInt((int) ' ');
        org.mockito.asm.ByteVector byteVector64 = byteVector62.putLong(100L);
        byte[] byteArray68 = new byte[] { (byte) 0, (byte) 10, (byte) 1 };
        org.mockito.asm.ByteVector byteVector71 = byteVector62.putByteArray(byteArray68, 0, 0);
        org.mockito.asm.ByteVector byteVector74 = byteVector55.putByteArray(byteArray68, (int) (byte) 1, (int) (byte) 0);
        org.mockito.asm.ByteVector byteVector77 = byteVector40.putByteArray(byteArray68, 1, (int) (byte) 1);
        org.mockito.asm.ByteVector byteVector80 = byteVector17.putByteArray(byteArray68, (int) (byte) 1, 0);
        org.mockito.asm.ByteVector byteVector83 = byteVector4.putByteArray(byteArray68, 0, (int) (short) 0);
        org.mockito.asm.ByteVector byteVector85 = byteVector83.putInt(10);
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
        org.junit.Assert.assertNotNull(byteVector51);
        org.junit.Assert.assertNotNull(byteVector53);
        org.junit.Assert.assertNotNull(byteVector55);
        org.junit.Assert.assertNotNull(byteVector58);
        org.junit.Assert.assertNotNull(byteVector60);
        org.junit.Assert.assertNotNull(byteVector62);
        org.junit.Assert.assertNotNull(byteVector64);
        org.junit.Assert.assertNotNull(byteArray68);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray68), "[0, 10, 1]");
        org.junit.Assert.assertNotNull(byteVector71);
        org.junit.Assert.assertNotNull(byteVector74);
        org.junit.Assert.assertNotNull(byteVector77);
        org.junit.Assert.assertNotNull(byteVector80);
        org.junit.Assert.assertNotNull(byteVector83);
        org.junit.Assert.assertNotNull(byteVector85);
    }

    @Test
    public void test1383() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1383");
        org.mockito.asm.ByteVector byteVector0 = new org.mockito.asm.ByteVector();
        org.mockito.asm.ByteVector byteVector2 = byteVector0.putUTF8("hi!");
        org.mockito.asm.ByteVector byteVector4 = byteVector0.putInt(0);
        org.mockito.asm.ByteVector byteVector6 = byteVector0.putShort((int) '4');
        org.mockito.asm.ByteVector byteVector8 = byteVector6.putShort((int) (short) 0);
        org.junit.Assert.assertNotNull(byteVector2);
        org.junit.Assert.assertNotNull(byteVector4);
        org.junit.Assert.assertNotNull(byteVector6);
        org.junit.Assert.assertNotNull(byteVector8);
    }

    @Test
    public void test1384() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1384");
        org.mockito.asm.ByteVector byteVector0 = new org.mockito.asm.ByteVector();
        org.mockito.asm.ByteVector byteVector2 = byteVector0.putUTF8("hi!");
        org.mockito.asm.ByteVector byteVector4 = byteVector2.putLong((long) (byte) 10);
        org.mockito.asm.ByteVector byteVector6 = byteVector4.putUTF8("hi!");
        org.mockito.asm.ByteVector byteVector8 = byteVector4.putLong((-1L));
        org.mockito.asm.ByteVector byteVector10 = byteVector8.putInt(10);
        org.mockito.asm.ByteVector byteVector12 = byteVector10.putShort((int) '#');
        org.mockito.asm.ByteVector byteVector14 = byteVector10.putLong((long) (byte) -1);
        org.mockito.asm.ByteVector byteVector16 = byteVector10.putLong((long) '4');
        org.mockito.asm.ByteVector byteVector18 = byteVector10.putInt((int) ' ');
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
    public void test1385() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1385");
        org.mockito.asm.ByteVector byteVector1 = new org.mockito.asm.ByteVector((int) '#');
        org.mockito.asm.ByteVector byteVector3 = byteVector1.putLong(100L);
        org.mockito.asm.ByteVector byteVector5 = byteVector3.putLong(1L);
        org.mockito.asm.ByteVector byteVector7 = byteVector5.putUTF8("hi!");
        org.mockito.asm.ByteVector byteVector9 = byteVector5.putUTF8("hi!");
        org.mockito.asm.ByteVector byteVector11 = byteVector9.putByte((int) (short) 0);
        org.mockito.asm.ByteVector byteVector13 = byteVector11.putUTF8("hi!");
        org.mockito.asm.ByteVector byteVector15 = byteVector13.putShort((int) (byte) -1);
        org.junit.Assert.assertNotNull(byteVector3);
        org.junit.Assert.assertNotNull(byteVector5);
        org.junit.Assert.assertNotNull(byteVector7);
        org.junit.Assert.assertNotNull(byteVector9);
        org.junit.Assert.assertNotNull(byteVector11);
        org.junit.Assert.assertNotNull(byteVector13);
        org.junit.Assert.assertNotNull(byteVector15);
    }

    @Test
    public void test1386() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1386");
        org.mockito.asm.ByteVector byteVector0 = new org.mockito.asm.ByteVector();
        org.mockito.asm.ByteVector byteVector2 = byteVector0.putUTF8("hi!");
        org.mockito.asm.ByteVector byteVector4 = byteVector2.putInt(0);
        org.mockito.asm.ByteVector byteVector6 = byteVector2.putByte((int) (byte) 10);
        org.mockito.asm.ByteVector byteVector8 = byteVector6.putUTF8("hi!");
        org.mockito.asm.ByteVector byteVector10 = byteVector8.putShort(0);
        org.mockito.asm.ByteVector byteVector12 = byteVector10.putShort(0);
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
    public void test1387() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1387");
        org.mockito.asm.ByteVector byteVector1 = new org.mockito.asm.ByteVector((int) (short) 1);
        org.mockito.asm.ByteVector byteVector3 = byteVector1.putLong((long) (byte) 1);
        org.mockito.asm.ByteVector byteVector5 = byteVector1.putUTF8("");
        org.mockito.asm.ByteVector byteVector7 = byteVector5.putInt((int) '#');
        org.mockito.asm.ByteVector byteVector9 = byteVector5.putByte(1);
        org.mockito.asm.ByteVector byteVector11 = byteVector9.putByte((int) (short) 100);
        org.mockito.asm.ByteVector byteVector13 = byteVector9.putShort((int) (short) 10);
        org.junit.Assert.assertNotNull(byteVector3);
        org.junit.Assert.assertNotNull(byteVector5);
        org.junit.Assert.assertNotNull(byteVector7);
        org.junit.Assert.assertNotNull(byteVector9);
        org.junit.Assert.assertNotNull(byteVector11);
        org.junit.Assert.assertNotNull(byteVector13);
    }

    @Test
    public void test1388() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1388");
        org.mockito.asm.ByteVector byteVector0 = new org.mockito.asm.ByteVector();
        org.mockito.asm.ByteVector byteVector2 = byteVector0.putUTF8("hi!");
        org.mockito.asm.ByteVector byteVector4 = byteVector0.putShort((int) (short) -1);
        org.mockito.asm.ByteVector byteVector6 = byteVector0.putInt(0);
        org.mockito.asm.ByteVector byteVector8 = byteVector0.putUTF8("hi!");
        org.mockito.asm.ByteVector byteVector10 = byteVector0.putByte(100);
        org.mockito.asm.ByteVector byteVector12 = byteVector0.putInt((int) ' ');
        org.mockito.asm.ByteVector byteVector14 = byteVector12.putByte((int) (short) 1);
        org.mockito.asm.ByteVector byteVector16 = byteVector14.putLong((long) (short) 1);
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
    public void test1389() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1389");
        org.mockito.asm.ByteVector byteVector1 = new org.mockito.asm.ByteVector((int) '#');
        org.mockito.asm.ByteVector byteVector3 = byteVector1.putUTF8("hi!");
        org.mockito.asm.ByteVector byteVector5 = byteVector1.putUTF8("");
        org.mockito.asm.ByteVector byteVector7 = byteVector5.putUTF8("");
        org.mockito.asm.ByteVector byteVector9 = byteVector7.putInt((int) (short) 1);
        org.junit.Assert.assertNotNull(byteVector3);
        org.junit.Assert.assertNotNull(byteVector5);
        org.junit.Assert.assertNotNull(byteVector7);
        org.junit.Assert.assertNotNull(byteVector9);
    }

    @Test
    public void test1390() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1390");
        org.mockito.asm.ByteVector byteVector0 = new org.mockito.asm.ByteVector();
        org.mockito.asm.ByteVector byteVector2 = byteVector0.putUTF8("hi!");
        org.mockito.asm.ByteVector byteVector4 = byteVector0.putShort((int) (short) -1);
        org.mockito.asm.ByteVector byteVector6 = byteVector0.putInt((int) (byte) 10);
        org.mockito.asm.ByteVector byteVector8 = byteVector0.putUTF8("");
        org.mockito.asm.ByteVector byteVector10 = byteVector8.putByte((int) (short) 0);
        org.mockito.asm.ByteVector byteVector12 = byteVector8.putUTF8("");
        org.junit.Assert.assertNotNull(byteVector2);
        org.junit.Assert.assertNotNull(byteVector4);
        org.junit.Assert.assertNotNull(byteVector6);
        org.junit.Assert.assertNotNull(byteVector8);
        org.junit.Assert.assertNotNull(byteVector10);
        org.junit.Assert.assertNotNull(byteVector12);
    }

    @Test
    public void test1391() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1391");
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
        org.mockito.asm.ByteVector byteVector20 = byteVector12.putUTF8("");
        org.mockito.asm.ByteVector byteVector22 = byteVector20.putShort((int) (byte) -1);
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
    public void test1392() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1392");
        org.mockito.asm.ByteVector byteVector0 = new org.mockito.asm.ByteVector();
        org.mockito.asm.ByteVector byteVector2 = byteVector0.putUTF8("hi!");
        org.mockito.asm.ByteVector byteVector4 = byteVector0.putInt(0);
        org.mockito.asm.ByteVector byteVector6 = byteVector0.putShort((int) '4');
        org.mockito.asm.ByteVector byteVector8 = byteVector0.putByte(100);
        org.mockito.asm.ByteVector byteVector10 = byteVector8.putInt((int) (byte) 10);
        org.mockito.asm.ByteVector byteVector12 = byteVector8.putShort((int) '#');
        org.mockito.asm.ByteVector byteVector14 = byteVector8.putLong((long) (-1));
        org.mockito.asm.ByteVector byteVector16 = byteVector8.putInt((int) '4');
        org.mockito.asm.ByteVector byteVector18 = byteVector16.putInt((int) (short) 100);
        org.mockito.asm.ByteVector byteVector20 = byteVector16.putByte((int) ' ');
        org.mockito.asm.ByteVector byteVector22 = byteVector20.putByte((int) (short) 100);
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
    public void test1393() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1393");
        org.mockito.asm.ByteVector byteVector0 = new org.mockito.asm.ByteVector();
        org.mockito.asm.ByteVector byteVector2 = byteVector0.putUTF8("hi!");
        org.mockito.asm.ByteVector byteVector4 = byteVector2.putLong((long) (byte) 10);
        org.mockito.asm.ByteVector byteVector6 = byteVector4.putUTF8("hi!");
        org.mockito.asm.ByteVector byteVector8 = byteVector4.putLong((long) (short) -1);
        org.mockito.asm.ByteVector byteVector10 = byteVector8.putInt(0);
        org.mockito.asm.ByteVector byteVector12 = byteVector8.putInt((int) 'a');
        org.mockito.asm.ByteVector byteVector14 = byteVector8.putLong((long) (byte) -1);
        org.junit.Assert.assertNotNull(byteVector2);
        org.junit.Assert.assertNotNull(byteVector4);
        org.junit.Assert.assertNotNull(byteVector6);
        org.junit.Assert.assertNotNull(byteVector8);
        org.junit.Assert.assertNotNull(byteVector10);
        org.junit.Assert.assertNotNull(byteVector12);
        org.junit.Assert.assertNotNull(byteVector14);
    }

    @Test
    public void test1394() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1394");
        org.mockito.asm.ByteVector byteVector1 = new org.mockito.asm.ByteVector((int) (byte) 10);
        org.mockito.asm.ByteVector byteVector3 = byteVector1.putByte((int) '4');
        org.mockito.asm.ByteVector byteVector5 = byteVector1.putLong(0L);
        org.mockito.asm.ByteVector byteVector7 = byteVector1.putByte((int) (byte) 100);
        org.mockito.asm.ByteVector byteVector9 = byteVector1.putUTF8("");
        org.mockito.asm.ByteVector byteVector11 = byteVector1.putUTF8("hi!");
        org.junit.Assert.assertNotNull(byteVector3);
        org.junit.Assert.assertNotNull(byteVector5);
        org.junit.Assert.assertNotNull(byteVector7);
        org.junit.Assert.assertNotNull(byteVector9);
        org.junit.Assert.assertNotNull(byteVector11);
    }

    @Test
    public void test1395() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1395");
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
        org.mockito.asm.ByteVector byteVector22 = byteVector20.putShort((int) (short) 100);
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
    public void test1396() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1396");
        org.mockito.asm.ByteVector byteVector0 = new org.mockito.asm.ByteVector();
        org.mockito.asm.ByteVector byteVector2 = byteVector0.putUTF8("hi!");
        org.mockito.asm.ByteVector byteVector4 = byteVector0.putShort((int) (short) -1);
        org.mockito.asm.ByteVector byteVector6 = byteVector0.putInt(0);
        org.mockito.asm.ByteVector byteVector8 = byteVector0.putUTF8("hi!");
        org.mockito.asm.ByteVector byteVector10 = byteVector0.putByte(100);
        org.mockito.asm.ByteVector byteVector12 = byteVector10.putUTF8("hi!");
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
    public void test1397() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1397");
        org.mockito.asm.ByteVector byteVector0 = new org.mockito.asm.ByteVector();
        org.mockito.asm.ByteVector byteVector2 = byteVector0.putUTF8("hi!");
        org.mockito.asm.ByteVector byteVector4 = byteVector2.putInt((int) (byte) 10);
        org.mockito.asm.ByteVector byteVector6 = byteVector4.putUTF8("");
        org.mockito.asm.ByteVector byteVector8 = byteVector6.putInt(0);
        org.mockito.asm.ByteVector byteVector10 = byteVector8.putInt((int) (short) 10);
        org.mockito.asm.ByteVector byteVector12 = byteVector8.putInt((int) (byte) 0);
        org.junit.Assert.assertNotNull(byteVector2);
        org.junit.Assert.assertNotNull(byteVector4);
        org.junit.Assert.assertNotNull(byteVector6);
        org.junit.Assert.assertNotNull(byteVector8);
        org.junit.Assert.assertNotNull(byteVector10);
        org.junit.Assert.assertNotNull(byteVector12);
    }

    @Test
    public void test1398() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1398");
        org.mockito.asm.ByteVector byteVector1 = new org.mockito.asm.ByteVector((int) (byte) 100);
        org.mockito.asm.ByteVector byteVector3 = byteVector1.putShort((int) (short) 100);
        org.mockito.asm.ByteVector byteVector5 = byteVector1.putLong((long) (short) 10);
        org.mockito.asm.ByteVector byteVector7 = byteVector5.putUTF8("");
        org.mockito.asm.ByteVector byteVector9 = byteVector5.putByte((int) (short) 10);
        java.lang.Class<?> wildcardClass10 = byteVector9.getClass();
        org.junit.Assert.assertNotNull(byteVector3);
        org.junit.Assert.assertNotNull(byteVector5);
        org.junit.Assert.assertNotNull(byteVector7);
        org.junit.Assert.assertNotNull(byteVector9);
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test1399() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1399");
        org.mockito.asm.ByteVector byteVector0 = new org.mockito.asm.ByteVector();
        org.mockito.asm.ByteVector byteVector2 = byteVector0.putUTF8("hi!");
        org.mockito.asm.ByteVector byteVector4 = byteVector2.putLong((long) (byte) 10);
        org.mockito.asm.ByteVector byteVector6 = byteVector4.putUTF8("hi!");
        org.mockito.asm.ByteVector byteVector8 = byteVector4.putInt((int) (byte) 100);
        org.mockito.asm.ByteVector byteVector10 = byteVector4.putUTF8("hi!");
        org.mockito.asm.ByteVector byteVector12 = byteVector10.putUTF8("");
        org.mockito.asm.ByteVector byteVector14 = byteVector10.putUTF8("");
        org.mockito.asm.ByteVector byteVector16 = byteVector14.putShort((-1));
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
    public void test1400() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1400");
        org.mockito.asm.ByteVector byteVector0 = new org.mockito.asm.ByteVector();
        org.mockito.asm.ByteVector byteVector2 = byteVector0.putUTF8("hi!");
        org.mockito.asm.ByteVector byteVector4 = byteVector0.putLong((long) ' ');
        org.mockito.asm.ByteVector byteVector6 = byteVector4.putByte((int) 'a');
        org.mockito.asm.ByteVector byteVector8 = byteVector4.putByte((int) (short) -1);
        org.mockito.asm.ByteVector byteVector10 = byteVector4.putLong(0L);
        org.mockito.asm.ByteVector byteVector12 = byteVector10.putInt((int) (short) -1);
        org.mockito.asm.ByteVector byteVector14 = byteVector12.putShort((int) (byte) 1);
        org.mockito.asm.ByteVector byteVector16 = byteVector14.putInt((int) (short) 0);
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
    public void test1401() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1401");
        org.mockito.asm.ByteVector byteVector0 = new org.mockito.asm.ByteVector();
        org.mockito.asm.ByteVector byteVector2 = byteVector0.putUTF8("hi!");
        org.mockito.asm.ByteVector byteVector4 = byteVector0.putShort((int) (short) -1);
        org.mockito.asm.ByteVector byteVector6 = byteVector0.putLong(0L);
        org.mockito.asm.ByteVector byteVector8 = byteVector0.putShort((int) (byte) -1);
        org.mockito.asm.ByteVector byteVector10 = byteVector8.putByte((int) (byte) 0);
        org.mockito.asm.ByteVector byteVector11 = new org.mockito.asm.ByteVector();
        org.mockito.asm.ByteVector byteVector13 = byteVector11.putUTF8("hi!");
        org.mockito.asm.ByteVector byteVector15 = byteVector11.putLong((long) ' ');
        org.mockito.asm.ByteVector byteVector17 = byteVector15.putByte((int) 'a');
        org.mockito.asm.ByteVector byteVector19 = byteVector15.putByte((int) (short) -1);
        org.mockito.asm.ByteVector byteVector21 = byteVector15.putLong(0L);
        org.mockito.asm.ByteVector byteVector23 = byteVector21.putByte(0);
        org.mockito.asm.ByteVector byteVector25 = byteVector23.putByte(100);
        org.mockito.asm.ByteVector byteVector27 = byteVector23.putByte((int) '4');
        org.mockito.asm.ByteVector byteVector29 = byteVector27.putUTF8("hi!");
        org.mockito.asm.ByteVector byteVector31 = byteVector27.putShort(100);
        org.mockito.asm.ByteVector byteVector33 = byteVector27.putShort((int) (short) 100);
        org.mockito.asm.ByteVector byteVector34 = new org.mockito.asm.ByteVector();
        org.mockito.asm.ByteVector byteVector36 = byteVector34.putUTF8("hi!");
        org.mockito.asm.ByteVector byteVector38 = byteVector34.putInt(0);
        org.mockito.asm.ByteVector byteVector40 = byteVector34.putShort((int) '4');
        org.mockito.asm.ByteVector byteVector42 = byteVector34.putByte(100);
        org.mockito.asm.ByteVector byteVector44 = byteVector42.putInt((int) (byte) 10);
        org.mockito.asm.ByteVector byteVector46 = byteVector42.putInt((int) (byte) 10);
        org.mockito.asm.ByteVector byteVector48 = byteVector46.putByte(100);
        org.mockito.asm.ByteVector byteVector49 = new org.mockito.asm.ByteVector();
        org.mockito.asm.ByteVector byteVector51 = byteVector49.putUTF8("hi!");
        org.mockito.asm.ByteVector byteVector53 = byteVector49.putInt(0);
        org.mockito.asm.ByteVector byteVector55 = byteVector53.putInt((int) ' ');
        org.mockito.asm.ByteVector byteVector57 = byteVector55.putLong(100L);
        byte[] byteArray61 = new byte[] { (byte) 0, (byte) 10, (byte) 1 };
        org.mockito.asm.ByteVector byteVector64 = byteVector55.putByteArray(byteArray61, 0, 0);
        org.mockito.asm.ByteVector byteVector67 = byteVector48.putByteArray(byteArray61, (int) (byte) 1, (int) (byte) 0);
        org.mockito.asm.ByteVector byteVector70 = byteVector33.putByteArray(byteArray61, 1, (int) (byte) 1);
        org.mockito.asm.ByteVector byteVector73 = byteVector10.putByteArray(byteArray61, (int) (byte) 1, 0);
        org.mockito.asm.ByteVector byteVector75 = byteVector73.putInt((int) (byte) 1);
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
        org.junit.Assert.assertNotNull(byteVector33);
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
        org.junit.Assert.assertNotNull(byteVector73);
        org.junit.Assert.assertNotNull(byteVector75);
    }

    @Test
    public void test1402() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1402");
        org.mockito.asm.ByteVector byteVector1 = new org.mockito.asm.ByteVector((int) '#');
        org.mockito.asm.ByteVector byteVector3 = byteVector1.putInt(100);
        org.mockito.asm.ByteVector byteVector5 = byteVector3.putShort((int) (short) -1);
        org.mockito.asm.ByteVector byteVector7 = byteVector3.putShort((int) (short) 10);
        org.mockito.asm.ByteVector byteVector9 = byteVector3.putShort((int) (byte) 100);
        org.mockito.asm.ByteVector byteVector10 = new org.mockito.asm.ByteVector();
        org.mockito.asm.ByteVector byteVector12 = byteVector10.putUTF8("hi!");
        org.mockito.asm.ByteVector byteVector14 = byteVector10.putShort((int) (short) -1);
        org.mockito.asm.ByteVector byteVector16 = byteVector10.putInt((int) (byte) 10);
        org.mockito.asm.ByteVector byteVector18 = byteVector16.putUTF8("hi!");
        org.mockito.asm.ByteVector byteVector20 = byteVector18.putByte((int) (byte) 1);
        org.mockito.asm.ByteVector byteVector22 = byteVector20.putUTF8("hi!");
        org.mockito.asm.ByteVector byteVector24 = byteVector22.putByte((int) (byte) 10);
        byte[] byteArray27 = new byte[] { (byte) 10, (byte) 0 };
        org.mockito.asm.ByteVector byteVector30 = byteVector24.putByteArray(byteArray27, 0, (int) (short) 0);
        // The following exception was thrown during execution in test generation
        try {
            org.mockito.asm.ByteVector byteVector33 = byteVector9.putByteArray(byteArray27, (int) (short) 10, (int) 'a');
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
        org.junit.Assert.assertNotNull(byteArray27);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray27), "[10, 0]");
        org.junit.Assert.assertNotNull(byteVector30);
    }

    @Test
    public void test1403() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1403");
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
        org.mockito.asm.ByteVector byteVector22 = byteVector20.putInt((int) '4');
        org.mockito.asm.ByteVector byteVector24 = byteVector22.putByte(1);
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
    public void test1404() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1404");
        org.mockito.asm.ByteVector byteVector0 = new org.mockito.asm.ByteVector();
        org.mockito.asm.ByteVector byteVector2 = byteVector0.putUTF8("hi!");
        org.mockito.asm.ByteVector byteVector4 = byteVector0.putShort((int) (short) -1);
        org.mockito.asm.ByteVector byteVector6 = byteVector0.putInt((int) (byte) 10);
        org.mockito.asm.ByteVector byteVector8 = byteVector6.putUTF8("hi!");
        org.mockito.asm.ByteVector byteVector10 = byteVector8.putShort(0);
        org.mockito.asm.ByteVector byteVector12 = byteVector10.putShort((int) (byte) 1);
        org.mockito.asm.ByteVector byteVector14 = byteVector12.putByte((int) (short) 10);
        org.mockito.asm.ByteVector byteVector16 = byteVector12.putUTF8("");
        org.mockito.asm.ByteVector byteVector18 = byteVector16.putLong(100L);
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
    public void test1405() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1405");
        org.mockito.asm.ByteVector byteVector1 = new org.mockito.asm.ByteVector((int) (byte) 100);
        org.mockito.asm.ByteVector byteVector3 = byteVector1.putShort((int) (short) 100);
        org.mockito.asm.ByteVector byteVector5 = byteVector1.putLong((long) (short) 10);
        org.mockito.asm.ByteVector byteVector7 = byteVector5.putUTF8("");
        org.mockito.asm.ByteVector byteVector9 = byteVector5.putByte((int) (short) 10);
        org.mockito.asm.ByteVector byteVector11 = new org.mockito.asm.ByteVector((int) (byte) 1);
        org.mockito.asm.ByteVector byteVector13 = byteVector11.putByte((int) (short) 1);
        org.mockito.asm.ByteVector byteVector15 = byteVector11.putShort((int) (byte) 1);
        org.mockito.asm.ByteVector byteVector17 = new org.mockito.asm.ByteVector((int) (byte) 100);
        org.mockito.asm.ByteVector byteVector19 = byteVector17.putShort((int) (short) 100);
        org.mockito.asm.ByteVector byteVector20 = new org.mockito.asm.ByteVector();
        org.mockito.asm.ByteVector byteVector22 = byteVector20.putUTF8("hi!");
        org.mockito.asm.ByteVector byteVector24 = byteVector20.putLong((long) ' ');
        org.mockito.asm.ByteVector byteVector26 = byteVector24.putByte((int) 'a');
        org.mockito.asm.ByteVector byteVector28 = byteVector24.putByte((int) (short) -1);
        org.mockito.asm.ByteVector byteVector30 = byteVector24.putLong(0L);
        org.mockito.asm.ByteVector byteVector32 = byteVector24.putUTF8("hi!");
        org.mockito.asm.ByteVector byteVector34 = byteVector32.putUTF8("");
        org.mockito.asm.ByteVector byteVector36 = byteVector32.putInt((int) (byte) 10);
        org.mockito.asm.ByteVector byteVector38 = byteVector32.putByte(0);
        org.mockito.asm.ByteVector byteVector39 = new org.mockito.asm.ByteVector();
        org.mockito.asm.ByteVector byteVector41 = byteVector39.putUTF8("hi!");
        org.mockito.asm.ByteVector byteVector43 = byteVector39.putInt(0);
        org.mockito.asm.ByteVector byteVector45 = byteVector43.putInt((int) ' ');
        org.mockito.asm.ByteVector byteVector47 = byteVector45.putLong(100L);
        byte[] byteArray51 = new byte[] { (byte) 0, (byte) 10, (byte) 1 };
        org.mockito.asm.ByteVector byteVector54 = byteVector45.putByteArray(byteArray51, 0, 0);
        org.mockito.asm.ByteVector byteVector57 = byteVector38.putByteArray(byteArray51, (int) (short) 1, 0);
        org.mockito.asm.ByteVector byteVector60 = byteVector17.putByteArray(byteArray51, 0, (int) (byte) 1);
        org.mockito.asm.ByteVector byteVector63 = byteVector15.putByteArray(byteArray51, 0, 0);
        // The following exception was thrown during execution in test generation
        try {
            org.mockito.asm.ByteVector byteVector66 = byteVector5.putByteArray(byteArray51, (int) (byte) -1, 100);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteVector3);
        org.junit.Assert.assertNotNull(byteVector5);
        org.junit.Assert.assertNotNull(byteVector7);
        org.junit.Assert.assertNotNull(byteVector9);
        org.junit.Assert.assertNotNull(byteVector13);
        org.junit.Assert.assertNotNull(byteVector15);
        org.junit.Assert.assertNotNull(byteVector19);
        org.junit.Assert.assertNotNull(byteVector22);
        org.junit.Assert.assertNotNull(byteVector24);
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
    public void test1406() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1406");
        org.mockito.asm.ByteVector byteVector1 = new org.mockito.asm.ByteVector((int) (byte) 100);
        org.mockito.asm.ByteVector byteVector3 = byteVector1.putShort((int) (short) 100);
        org.mockito.asm.ByteVector byteVector5 = byteVector1.putByte((int) (byte) 10);
        org.mockito.asm.ByteVector byteVector7 = byteVector5.putShort((int) (byte) 0);
        org.junit.Assert.assertNotNull(byteVector3);
        org.junit.Assert.assertNotNull(byteVector5);
        org.junit.Assert.assertNotNull(byteVector7);
    }

    @Test
    public void test1407() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1407");
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
        org.mockito.asm.ByteVector byteVector24 = byteVector20.putShort(10);
        org.mockito.asm.ByteVector byteVector25 = new org.mockito.asm.ByteVector();
        org.mockito.asm.ByteVector byteVector27 = byteVector25.putUTF8("hi!");
        org.mockito.asm.ByteVector byteVector29 = byteVector25.putLong((long) ' ');
        org.mockito.asm.ByteVector byteVector31 = byteVector29.putByte((int) 'a');
        org.mockito.asm.ByteVector byteVector33 = byteVector29.putByte((int) (short) -1);
        org.mockito.asm.ByteVector byteVector35 = byteVector29.putLong(0L);
        org.mockito.asm.ByteVector byteVector37 = byteVector29.putUTF8("hi!");
        org.mockito.asm.ByteVector byteVector39 = byteVector37.putUTF8("");
        org.mockito.asm.ByteVector byteVector41 = byteVector39.putLong((long) (byte) 10);
        org.mockito.asm.ByteVector byteVector43 = byteVector39.putLong((long) (short) 100);
        byte[] byteArray48 = new byte[] { (byte) 1, (byte) 0, (byte) 0, (byte) -1 };
        org.mockito.asm.ByteVector byteVector51 = byteVector39.putByteArray(byteArray48, 0, 0);
        // The following exception was thrown during execution in test generation
        try {
            org.mockito.asm.ByteVector byteVector54 = byteVector20.putByteArray(byteArray48, (int) (short) 10, 100);
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
        org.junit.Assert.assertNotNull(byteArray48);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray48), "[1, 0, 0, -1]");
        org.junit.Assert.assertNotNull(byteVector51);
    }

    @Test
    public void test1408() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1408");
        org.mockito.asm.ByteVector byteVector0 = new org.mockito.asm.ByteVector();
        org.mockito.asm.ByteVector byteVector2 = byteVector0.putUTF8("hi!");
        org.mockito.asm.ByteVector byteVector4 = byteVector0.putLong((long) ' ');
        org.mockito.asm.ByteVector byteVector6 = byteVector4.putByte((int) 'a');
        org.mockito.asm.ByteVector byteVector8 = byteVector6.putInt((int) (short) 0);
        org.mockito.asm.ByteVector byteVector10 = byteVector8.putByte((int) (short) 0);
        org.mockito.asm.ByteVector byteVector12 = byteVector8.putInt((int) (short) -1);
        org.mockito.asm.ByteVector byteVector14 = byteVector12.putByte(0);
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
    public void test1409() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1409");
        org.mockito.asm.ByteVector byteVector0 = new org.mockito.asm.ByteVector();
        org.mockito.asm.ByteVector byteVector2 = byteVector0.putUTF8("hi!");
        org.mockito.asm.ByteVector byteVector4 = byteVector0.putLong((long) ' ');
        org.mockito.asm.ByteVector byteVector6 = byteVector4.putByte((int) 'a');
        org.mockito.asm.ByteVector byteVector8 = byteVector4.putByte((int) (short) -1);
        org.mockito.asm.ByteVector byteVector10 = byteVector4.putLong(0L);
        org.mockito.asm.ByteVector byteVector12 = byteVector10.putByte(0);
        org.mockito.asm.ByteVector byteVector14 = byteVector10.putShort((int) (byte) -1);
        org.mockito.asm.ByteVector byteVector16 = byteVector14.putUTF8("hi!");
        org.mockito.asm.ByteVector byteVector18 = byteVector14.putInt(100);
        org.mockito.asm.ByteVector byteVector20 = byteVector14.putByte((int) (short) 10);
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
    public void test1410() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1410");
        org.mockito.asm.ByteVector byteVector1 = new org.mockito.asm.ByteVector((int) (short) 1);
        org.mockito.asm.ByteVector byteVector3 = byteVector1.putLong((long) (byte) 1);
        org.mockito.asm.ByteVector byteVector5 = byteVector1.putInt(1);
        org.mockito.asm.ByteVector byteVector7 = byteVector1.putInt(100);
        org.mockito.asm.ByteVector byteVector9 = byteVector1.putInt((int) (short) -1);
        org.mockito.asm.ByteVector byteVector11 = byteVector9.putShort((int) (byte) 100);
        org.junit.Assert.assertNotNull(byteVector3);
        org.junit.Assert.assertNotNull(byteVector5);
        org.junit.Assert.assertNotNull(byteVector7);
        org.junit.Assert.assertNotNull(byteVector9);
        org.junit.Assert.assertNotNull(byteVector11);
    }

    @Test
    public void test1411() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1411");
        org.mockito.asm.ByteVector byteVector0 = new org.mockito.asm.ByteVector();
        org.mockito.asm.ByteVector byteVector2 = byteVector0.putUTF8("hi!");
        org.mockito.asm.ByteVector byteVector4 = byteVector2.putInt((int) (byte) 10);
        org.mockito.asm.ByteVector byteVector6 = byteVector4.putByte((int) (short) 100);
        org.mockito.asm.ByteVector byteVector8 = byteVector4.putInt((int) '4');
        org.mockito.asm.ByteVector byteVector10 = byteVector8.putInt((int) (short) 100);
        org.mockito.asm.ByteVector byteVector12 = byteVector8.putByte((int) (short) 1);
        org.junit.Assert.assertNotNull(byteVector2);
        org.junit.Assert.assertNotNull(byteVector4);
        org.junit.Assert.assertNotNull(byteVector6);
        org.junit.Assert.assertNotNull(byteVector8);
        org.junit.Assert.assertNotNull(byteVector10);
        org.junit.Assert.assertNotNull(byteVector12);
    }

    @Test
    public void test1412() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1412");
        org.mockito.asm.ByteVector byteVector1 = new org.mockito.asm.ByteVector((int) (byte) 10);
        org.mockito.asm.ByteVector byteVector3 = byteVector1.putByte((int) '4');
        org.mockito.asm.ByteVector byteVector5 = byteVector1.putLong((long) 'a');
        org.mockito.asm.ByteVector byteVector7 = byteVector1.putUTF8("");
        org.mockito.asm.ByteVector byteVector9 = byteVector1.putUTF8("");
        org.mockito.asm.ByteVector byteVector11 = byteVector1.putShort(0);
        org.mockito.asm.ByteVector byteVector13 = byteVector1.putByte((int) (short) 10);
        org.mockito.asm.ByteVector byteVector15 = byteVector13.putUTF8("");
        org.junit.Assert.assertNotNull(byteVector3);
        org.junit.Assert.assertNotNull(byteVector5);
        org.junit.Assert.assertNotNull(byteVector7);
        org.junit.Assert.assertNotNull(byteVector9);
        org.junit.Assert.assertNotNull(byteVector11);
        org.junit.Assert.assertNotNull(byteVector13);
        org.junit.Assert.assertNotNull(byteVector15);
    }

    @Test
    public void test1413() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1413");
        org.mockito.asm.ByteVector byteVector1 = new org.mockito.asm.ByteVector((int) '#');
        org.mockito.asm.ByteVector byteVector3 = byteVector1.putLong(100L);
        org.mockito.asm.ByteVector byteVector5 = byteVector1.putUTF8("");
        org.mockito.asm.ByteVector byteVector7 = byteVector1.putUTF8("hi!");
        org.mockito.asm.ByteVector byteVector9 = byteVector7.putLong((long) (short) 0);
        org.mockito.asm.ByteVector byteVector11 = byteVector9.putShort((int) (byte) 10);
        org.mockito.asm.ByteVector byteVector13 = byteVector9.putByte((int) (short) 0);
        org.junit.Assert.assertNotNull(byteVector3);
        org.junit.Assert.assertNotNull(byteVector5);
        org.junit.Assert.assertNotNull(byteVector7);
        org.junit.Assert.assertNotNull(byteVector9);
        org.junit.Assert.assertNotNull(byteVector11);
        org.junit.Assert.assertNotNull(byteVector13);
    }

    @Test
    public void test1414() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1414");
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
        org.mockito.asm.ByteVector byteVector20 = byteVector18.putShort((int) (short) 1);
        org.mockito.asm.ByteVector byteVector21 = new org.mockito.asm.ByteVector();
        org.mockito.asm.ByteVector byteVector23 = byteVector21.putUTF8("hi!");
        org.mockito.asm.ByteVector byteVector25 = byteVector21.putShort((int) (short) -1);
        org.mockito.asm.ByteVector byteVector27 = byteVector21.putInt((int) (byte) 10);
        org.mockito.asm.ByteVector byteVector29 = byteVector27.putUTF8("hi!");
        org.mockito.asm.ByteVector byteVector31 = byteVector29.putByte((int) (byte) 1);
        org.mockito.asm.ByteVector byteVector33 = byteVector29.putInt((int) (byte) -1);
        org.mockito.asm.ByteVector byteVector34 = new org.mockito.asm.ByteVector();
        org.mockito.asm.ByteVector byteVector36 = byteVector34.putUTF8("hi!");
        org.mockito.asm.ByteVector byteVector38 = byteVector34.putLong((long) ' ');
        org.mockito.asm.ByteVector byteVector40 = byteVector38.putByte((int) 'a');
        org.mockito.asm.ByteVector byteVector42 = byteVector38.putByte((int) (short) -1);
        org.mockito.asm.ByteVector byteVector44 = byteVector38.putLong(0L);
        org.mockito.asm.ByteVector byteVector46 = byteVector38.putUTF8("hi!");
        org.mockito.asm.ByteVector byteVector48 = byteVector46.putUTF8("");
        org.mockito.asm.ByteVector byteVector50 = byteVector46.putInt((int) (byte) 10);
        org.mockito.asm.ByteVector byteVector52 = byteVector50.putLong((long) (short) -1);
        org.mockito.asm.ByteVector byteVector54 = byteVector50.putByte(0);
        org.mockito.asm.ByteVector byteVector55 = new org.mockito.asm.ByteVector();
        org.mockito.asm.ByteVector byteVector57 = byteVector55.putUTF8("hi!");
        org.mockito.asm.ByteVector byteVector59 = byteVector57.putInt(0);
        org.mockito.asm.ByteVector byteVector61 = byteVector57.putByte((int) (byte) 10);
        org.mockito.asm.ByteVector byteVector63 = byteVector61.putLong((-1L));
        org.mockito.asm.ByteVector byteVector65 = byteVector61.putInt((int) (byte) 100);
        org.mockito.asm.ByteVector byteVector66 = new org.mockito.asm.ByteVector();
        org.mockito.asm.ByteVector byteVector68 = byteVector66.putUTF8("hi!");
        org.mockito.asm.ByteVector byteVector70 = byteVector66.putInt(0);
        org.mockito.asm.ByteVector byteVector72 = byteVector70.putInt((int) ' ');
        org.mockito.asm.ByteVector byteVector74 = byteVector72.putLong(100L);
        byte[] byteArray78 = new byte[] { (byte) 0, (byte) 10, (byte) 1 };
        org.mockito.asm.ByteVector byteVector81 = byteVector72.putByteArray(byteArray78, 0, 0);
        org.mockito.asm.ByteVector byteVector84 = byteVector61.putByteArray(byteArray78, (int) (byte) 1, 0);
        org.mockito.asm.ByteVector byteVector87 = byteVector54.putByteArray(byteArray78, 1, 0);
        org.mockito.asm.ByteVector byteVector90 = byteVector29.putByteArray(byteArray78, 1, (int) (byte) 1);
        org.mockito.asm.ByteVector byteVector93 = byteVector18.putByteArray(byteArray78, 0, (int) (short) 1);
        java.lang.Class<?> wildcardClass94 = byteVector18.getClass();
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
        org.junit.Assert.assertNotNull(byteVector36);
        org.junit.Assert.assertNotNull(byteVector38);
        org.junit.Assert.assertNotNull(byteVector40);
        org.junit.Assert.assertNotNull(byteVector42);
        org.junit.Assert.assertNotNull(byteVector44);
        org.junit.Assert.assertNotNull(byteVector46);
        org.junit.Assert.assertNotNull(byteVector48);
        org.junit.Assert.assertNotNull(byteVector50);
        org.junit.Assert.assertNotNull(byteVector52);
        org.junit.Assert.assertNotNull(byteVector54);
        org.junit.Assert.assertNotNull(byteVector57);
        org.junit.Assert.assertNotNull(byteVector59);
        org.junit.Assert.assertNotNull(byteVector61);
        org.junit.Assert.assertNotNull(byteVector63);
        org.junit.Assert.assertNotNull(byteVector65);
        org.junit.Assert.assertNotNull(byteVector68);
        org.junit.Assert.assertNotNull(byteVector70);
        org.junit.Assert.assertNotNull(byteVector72);
        org.junit.Assert.assertNotNull(byteVector74);
        org.junit.Assert.assertNotNull(byteArray78);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray78), "[0, 10, 1]");
        org.junit.Assert.assertNotNull(byteVector81);
        org.junit.Assert.assertNotNull(byteVector84);
        org.junit.Assert.assertNotNull(byteVector87);
        org.junit.Assert.assertNotNull(byteVector90);
        org.junit.Assert.assertNotNull(byteVector93);
        org.junit.Assert.assertNotNull(wildcardClass94);
    }

    @Test
    public void test1415() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1415");
        org.mockito.asm.ByteVector byteVector0 = new org.mockito.asm.ByteVector();
        org.mockito.asm.ByteVector byteVector2 = byteVector0.putUTF8("hi!");
        org.mockito.asm.ByteVector byteVector4 = byteVector2.putInt(0);
        org.mockito.asm.ByteVector byteVector6 = byteVector4.putByte((int) (byte) 1);
        org.mockito.asm.ByteVector byteVector8 = byteVector6.putShort((int) '4');
        org.mockito.asm.ByteVector byteVector10 = byteVector8.putUTF8("hi!");
        org.mockito.asm.ByteVector byteVector12 = byteVector10.putInt((int) (short) 100);
        org.junit.Assert.assertNotNull(byteVector2);
        org.junit.Assert.assertNotNull(byteVector4);
        org.junit.Assert.assertNotNull(byteVector6);
        org.junit.Assert.assertNotNull(byteVector8);
        org.junit.Assert.assertNotNull(byteVector10);
        org.junit.Assert.assertNotNull(byteVector12);
    }

    @Test
    public void test1416() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1416");
        org.mockito.asm.ByteVector byteVector1 = new org.mockito.asm.ByteVector((int) '#');
        org.mockito.asm.ByteVector byteVector3 = byteVector1.putLong(100L);
        org.mockito.asm.ByteVector byteVector5 = byteVector3.putLong(1L);
        org.mockito.asm.ByteVector byteVector7 = byteVector5.putUTF8("hi!");
        org.mockito.asm.ByteVector byteVector9 = byteVector5.putLong((long) (byte) 1);
        org.mockito.asm.ByteVector byteVector11 = byteVector9.putByte(0);
        org.mockito.asm.ByteVector byteVector13 = byteVector11.putInt((int) ' ');
        org.junit.Assert.assertNotNull(byteVector3);
        org.junit.Assert.assertNotNull(byteVector5);
        org.junit.Assert.assertNotNull(byteVector7);
        org.junit.Assert.assertNotNull(byteVector9);
        org.junit.Assert.assertNotNull(byteVector11);
        org.junit.Assert.assertNotNull(byteVector13);
    }

    @Test
    public void test1417() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1417");
        org.mockito.asm.ByteVector byteVector0 = new org.mockito.asm.ByteVector();
        org.mockito.asm.ByteVector byteVector2 = byteVector0.putUTF8("hi!");
        org.mockito.asm.ByteVector byteVector4 = byteVector2.putLong((long) (byte) 10);
        org.mockito.asm.ByteVector byteVector6 = byteVector4.putUTF8("hi!");
        org.mockito.asm.ByteVector byteVector8 = byteVector4.putLong((long) 10);
        org.mockito.asm.ByteVector byteVector10 = byteVector8.putLong(0L);
        org.mockito.asm.ByteVector byteVector12 = byteVector10.putUTF8("hi!");
        org.mockito.asm.ByteVector byteVector14 = byteVector10.putShort(1);
        org.mockito.asm.ByteVector byteVector16 = byteVector10.putLong((long) (short) 0);
        org.mockito.asm.ByteVector byteVector18 = byteVector10.putLong(10L);
        org.mockito.asm.ByteVector byteVector20 = byteVector10.putInt((int) (byte) 100);
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
    public void test1418() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1418");
        org.mockito.asm.ByteVector byteVector1 = new org.mockito.asm.ByteVector((int) '#');
        org.mockito.asm.ByteVector byteVector3 = byteVector1.putLong(100L);
        org.mockito.asm.ByteVector byteVector5 = byteVector3.putLong(1L);
        org.mockito.asm.ByteVector byteVector7 = byteVector5.putUTF8("hi!");
        org.mockito.asm.ByteVector byteVector9 = byteVector5.putUTF8("hi!");
        org.mockito.asm.ByteVector byteVector11 = byteVector9.putByte(10);
        org.mockito.asm.ByteVector byteVector13 = byteVector9.putShort((int) (short) -1);
        org.junit.Assert.assertNotNull(byteVector3);
        org.junit.Assert.assertNotNull(byteVector5);
        org.junit.Assert.assertNotNull(byteVector7);
        org.junit.Assert.assertNotNull(byteVector9);
        org.junit.Assert.assertNotNull(byteVector11);
        org.junit.Assert.assertNotNull(byteVector13);
    }

    @Test
    public void test1419() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1419");
        org.mockito.asm.ByteVector byteVector0 = new org.mockito.asm.ByteVector();
        org.mockito.asm.ByteVector byteVector2 = byteVector0.putUTF8("hi!");
        org.mockito.asm.ByteVector byteVector4 = byteVector2.putInt((int) (byte) 10);
        org.mockito.asm.ByteVector byteVector6 = byteVector4.putUTF8("");
        org.mockito.asm.ByteVector byteVector8 = byteVector4.putLong((long) '#');
        org.mockito.asm.ByteVector byteVector10 = byteVector8.putLong((long) (short) 100);
        org.mockito.asm.ByteVector byteVector11 = new org.mockito.asm.ByteVector();
        org.mockito.asm.ByteVector byteVector13 = byteVector11.putUTF8("hi!");
        org.mockito.asm.ByteVector byteVector15 = byteVector11.putInt(0);
        org.mockito.asm.ByteVector byteVector17 = byteVector15.putInt((int) ' ');
        org.mockito.asm.ByteVector byteVector19 = byteVector17.putLong((long) (short) 10);
        org.mockito.asm.ByteVector byteVector21 = byteVector19.putUTF8("hi!");
        org.mockito.asm.ByteVector byteVector23 = byteVector19.putByte(0);
        org.mockito.asm.ByteVector byteVector25 = byteVector23.putInt((int) (short) 1);
        org.mockito.asm.ByteVector byteVector27 = byteVector23.putLong((long) (short) 0);
        org.mockito.asm.ByteVector byteVector28 = new org.mockito.asm.ByteVector();
        org.mockito.asm.ByteVector byteVector30 = byteVector28.putUTF8("hi!");
        org.mockito.asm.ByteVector byteVector32 = byteVector30.putLong((long) (byte) 10);
        org.mockito.asm.ByteVector byteVector34 = byteVector32.putUTF8("hi!");
        org.mockito.asm.ByteVector byteVector36 = byteVector32.putLong((long) 10);
        org.mockito.asm.ByteVector byteVector38 = byteVector36.putLong(0L);
        org.mockito.asm.ByteVector byteVector40 = byteVector38.putUTF8("hi!");
        org.mockito.asm.ByteVector byteVector41 = new org.mockito.asm.ByteVector();
        org.mockito.asm.ByteVector byteVector43 = byteVector41.putUTF8("hi!");
        org.mockito.asm.ByteVector byteVector45 = byteVector43.putInt(0);
        org.mockito.asm.ByteVector byteVector47 = byteVector43.putByte((int) (byte) 10);
        org.mockito.asm.ByteVector byteVector49 = byteVector47.putLong((-1L));
        org.mockito.asm.ByteVector byteVector51 = byteVector47.putInt((int) (byte) 100);
        org.mockito.asm.ByteVector byteVector52 = new org.mockito.asm.ByteVector();
        org.mockito.asm.ByteVector byteVector54 = byteVector52.putUTF8("hi!");
        org.mockito.asm.ByteVector byteVector56 = byteVector52.putInt(0);
        org.mockito.asm.ByteVector byteVector58 = byteVector56.putInt((int) ' ');
        org.mockito.asm.ByteVector byteVector60 = byteVector58.putLong(100L);
        byte[] byteArray64 = new byte[] { (byte) 0, (byte) 10, (byte) 1 };
        org.mockito.asm.ByteVector byteVector67 = byteVector58.putByteArray(byteArray64, 0, 0);
        org.mockito.asm.ByteVector byteVector70 = byteVector47.putByteArray(byteArray64, (int) (byte) 1, 0);
        org.mockito.asm.ByteVector byteVector73 = byteVector40.putByteArray(byteArray64, (int) (byte) 0, 0);
        org.mockito.asm.ByteVector byteVector76 = byteVector23.putByteArray(byteArray64, 0, (int) (byte) 1);
        // The following exception was thrown during execution in test generation
        try {
            org.mockito.asm.ByteVector byteVector79 = byteVector8.putByteArray(byteArray64, (int) '#', (int) (short) 100);
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
        org.junit.Assert.assertNotNull(byteVector51);
        org.junit.Assert.assertNotNull(byteVector54);
        org.junit.Assert.assertNotNull(byteVector56);
        org.junit.Assert.assertNotNull(byteVector58);
        org.junit.Assert.assertNotNull(byteVector60);
        org.junit.Assert.assertNotNull(byteArray64);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray64), "[0, 10, 1]");
        org.junit.Assert.assertNotNull(byteVector67);
        org.junit.Assert.assertNotNull(byteVector70);
        org.junit.Assert.assertNotNull(byteVector73);
        org.junit.Assert.assertNotNull(byteVector76);
    }

    @Test
    public void test1420() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1420");
        org.mockito.asm.ByteVector byteVector0 = new org.mockito.asm.ByteVector();
        org.mockito.asm.ByteVector byteVector2 = byteVector0.putUTF8("hi!");
        org.mockito.asm.ByteVector byteVector4 = byteVector0.putLong((long) (short) 1);
        org.mockito.asm.ByteVector byteVector6 = byteVector4.putShort((int) (byte) -1);
        org.mockito.asm.ByteVector byteVector8 = byteVector4.putUTF8("hi!");
        org.mockito.asm.ByteVector byteVector10 = byteVector4.putShort((int) (short) -1);
        org.junit.Assert.assertNotNull(byteVector2);
        org.junit.Assert.assertNotNull(byteVector4);
        org.junit.Assert.assertNotNull(byteVector6);
        org.junit.Assert.assertNotNull(byteVector8);
        org.junit.Assert.assertNotNull(byteVector10);
    }

    @Test
    public void test1421() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1421");
        org.mockito.asm.ByteVector byteVector1 = new org.mockito.asm.ByteVector((int) '#');
        org.mockito.asm.ByteVector byteVector3 = byteVector1.putLong(100L);
        org.mockito.asm.ByteVector byteVector5 = byteVector1.putUTF8("");
        org.mockito.asm.ByteVector byteVector7 = byteVector5.putInt((int) (byte) 10);
        org.mockito.asm.ByteVector byteVector9 = byteVector7.putByte((int) '#');
        org.mockito.asm.ByteVector byteVector11 = byteVector9.putInt((int) (short) 0);
        org.mockito.asm.ByteVector byteVector13 = byteVector11.putInt((int) (byte) 0);
        org.mockito.asm.ByteVector byteVector15 = byteVector11.putInt(100);
        org.mockito.asm.ByteVector byteVector17 = byteVector15.putByte((int) (byte) 10);
        org.mockito.asm.ByteVector byteVector19 = byteVector15.putUTF8("");
        org.junit.Assert.assertNotNull(byteVector3);
        org.junit.Assert.assertNotNull(byteVector5);
        org.junit.Assert.assertNotNull(byteVector7);
        org.junit.Assert.assertNotNull(byteVector9);
        org.junit.Assert.assertNotNull(byteVector11);
        org.junit.Assert.assertNotNull(byteVector13);
        org.junit.Assert.assertNotNull(byteVector15);
        org.junit.Assert.assertNotNull(byteVector17);
        org.junit.Assert.assertNotNull(byteVector19);
    }

    @Test
    public void test1422() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1422");
        org.mockito.asm.ByteVector byteVector1 = new org.mockito.asm.ByteVector((int) '#');
        org.mockito.asm.ByteVector byteVector3 = byteVector1.putLong(100L);
        org.mockito.asm.ByteVector byteVector5 = byteVector3.putShort(1);
        org.mockito.asm.ByteVector byteVector7 = byteVector5.putShort(10);
        org.junit.Assert.assertNotNull(byteVector3);
        org.junit.Assert.assertNotNull(byteVector5);
        org.junit.Assert.assertNotNull(byteVector7);
    }

    @Test
    public void test1423() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1423");
        org.mockito.asm.ByteVector byteVector1 = new org.mockito.asm.ByteVector((int) '#');
        org.mockito.asm.ByteVector byteVector3 = byteVector1.putUTF8("hi!");
        org.mockito.asm.ByteVector byteVector5 = byteVector1.putUTF8("");
        org.mockito.asm.ByteVector byteVector7 = byteVector5.putUTF8("hi!");
        org.mockito.asm.ByteVector byteVector9 = byteVector7.putShort(0);
        org.mockito.asm.ByteVector byteVector11 = byteVector9.putShort((int) (short) -1);
        org.junit.Assert.assertNotNull(byteVector3);
        org.junit.Assert.assertNotNull(byteVector5);
        org.junit.Assert.assertNotNull(byteVector7);
        org.junit.Assert.assertNotNull(byteVector9);
        org.junit.Assert.assertNotNull(byteVector11);
    }

    @Test
    public void test1424() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1424");
        org.mockito.asm.ByteVector byteVector0 = new org.mockito.asm.ByteVector();
        org.mockito.asm.ByteVector byteVector2 = byteVector0.putUTF8("hi!");
        org.mockito.asm.ByteVector byteVector4 = byteVector0.putShort((int) (short) -1);
        org.mockito.asm.ByteVector byteVector6 = byteVector0.putInt((int) (byte) 10);
        org.mockito.asm.ByteVector byteVector8 = byteVector6.putUTF8("hi!");
        org.mockito.asm.ByteVector byteVector10 = byteVector8.putByte((int) (byte) 1);
        org.mockito.asm.ByteVector byteVector12 = byteVector10.putUTF8("hi!");
        org.mockito.asm.ByteVector byteVector14 = byteVector10.putInt((int) '4');
        org.mockito.asm.ByteVector byteVector16 = byteVector14.putUTF8("hi!");
        org.mockito.asm.ByteVector byteVector18 = new org.mockito.asm.ByteVector((int) (byte) 10);
        org.mockito.asm.ByteVector byteVector20 = byteVector18.putByte((int) '4');
        org.mockito.asm.ByteVector byteVector22 = byteVector18.putLong((long) 'a');
        org.mockito.asm.ByteVector byteVector24 = byteVector18.putUTF8("");
        org.mockito.asm.ByteVector byteVector26 = byteVector18.putUTF8("");
        org.mockito.asm.ByteVector byteVector28 = byteVector26.putShort((int) (short) -1);
        org.mockito.asm.ByteVector byteVector29 = new org.mockito.asm.ByteVector();
        org.mockito.asm.ByteVector byteVector31 = byteVector29.putUTF8("hi!");
        org.mockito.asm.ByteVector byteVector33 = byteVector31.putInt(0);
        org.mockito.asm.ByteVector byteVector35 = byteVector33.putByte((int) (short) 0);
        org.mockito.asm.ByteVector byteVector37 = byteVector33.putUTF8("");
        org.mockito.asm.ByteVector byteVector38 = new org.mockito.asm.ByteVector();
        org.mockito.asm.ByteVector byteVector40 = byteVector38.putUTF8("hi!");
        org.mockito.asm.ByteVector byteVector42 = byteVector38.putInt(0);
        org.mockito.asm.ByteVector byteVector44 = byteVector38.putShort((int) '4');
        org.mockito.asm.ByteVector byteVector46 = byteVector38.putByte(100);
        org.mockito.asm.ByteVector byteVector48 = byteVector46.putInt((int) (byte) 10);
        org.mockito.asm.ByteVector byteVector50 = byteVector46.putInt((int) (byte) 10);
        org.mockito.asm.ByteVector byteVector52 = byteVector50.putByte(100);
        org.mockito.asm.ByteVector byteVector53 = new org.mockito.asm.ByteVector();
        org.mockito.asm.ByteVector byteVector55 = byteVector53.putUTF8("hi!");
        org.mockito.asm.ByteVector byteVector57 = byteVector53.putInt(0);
        org.mockito.asm.ByteVector byteVector59 = byteVector57.putInt((int) ' ');
        org.mockito.asm.ByteVector byteVector61 = byteVector59.putLong(100L);
        byte[] byteArray65 = new byte[] { (byte) 0, (byte) 10, (byte) 1 };
        org.mockito.asm.ByteVector byteVector68 = byteVector59.putByteArray(byteArray65, 0, 0);
        org.mockito.asm.ByteVector byteVector71 = byteVector52.putByteArray(byteArray65, (int) (byte) 1, (int) (byte) 0);
        org.mockito.asm.ByteVector byteVector74 = byteVector33.putByteArray(byteArray65, (int) (short) 0, 0);
        org.mockito.asm.ByteVector byteVector77 = byteVector28.putByteArray(byteArray65, (int) (byte) 1, 0);
        // The following exception was thrown during execution in test generation
        try {
            org.mockito.asm.ByteVector byteVector80 = byteVector16.putByteArray(byteArray65, (int) (short) -1, (int) '#');
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
        org.junit.Assert.assertNotNull(byteVector20);
        org.junit.Assert.assertNotNull(byteVector22);
        org.junit.Assert.assertNotNull(byteVector24);
        org.junit.Assert.assertNotNull(byteVector26);
        org.junit.Assert.assertNotNull(byteVector28);
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
        org.junit.Assert.assertNotNull(byteVector55);
        org.junit.Assert.assertNotNull(byteVector57);
        org.junit.Assert.assertNotNull(byteVector59);
        org.junit.Assert.assertNotNull(byteVector61);
        org.junit.Assert.assertNotNull(byteArray65);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray65), "[0, 10, 1]");
        org.junit.Assert.assertNotNull(byteVector68);
        org.junit.Assert.assertNotNull(byteVector71);
        org.junit.Assert.assertNotNull(byteVector74);
        org.junit.Assert.assertNotNull(byteVector77);
    }

    @Test
    public void test1425() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1425");
        org.mockito.asm.ByteVector byteVector0 = new org.mockito.asm.ByteVector();
        org.mockito.asm.ByteVector byteVector2 = byteVector0.putUTF8("hi!");
        org.mockito.asm.ByteVector byteVector4 = byteVector0.putInt(0);
        org.mockito.asm.ByteVector byteVector6 = byteVector0.putInt(1);
        org.mockito.asm.ByteVector byteVector8 = byteVector6.putByte((int) (short) 10);
        org.mockito.asm.ByteVector byteVector10 = byteVector6.putShort((int) (byte) 100);
        java.lang.Class<?> wildcardClass11 = byteVector6.getClass();
        org.junit.Assert.assertNotNull(byteVector2);
        org.junit.Assert.assertNotNull(byteVector4);
        org.junit.Assert.assertNotNull(byteVector6);
        org.junit.Assert.assertNotNull(byteVector8);
        org.junit.Assert.assertNotNull(byteVector10);
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test1426() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1426");
        org.mockito.asm.ByteVector byteVector0 = new org.mockito.asm.ByteVector();
        org.mockito.asm.ByteVector byteVector2 = byteVector0.putUTF8("hi!");
        org.mockito.asm.ByteVector byteVector4 = byteVector0.putInt(0);
        org.mockito.asm.ByteVector byteVector6 = byteVector0.putShort(10);
        org.mockito.asm.ByteVector byteVector8 = byteVector0.putUTF8("");
        org.mockito.asm.ByteVector byteVector10 = byteVector8.putByte(0);
        org.mockito.asm.ByteVector byteVector12 = byteVector8.putInt((int) '#');
        org.mockito.asm.ByteVector byteVector13 = new org.mockito.asm.ByteVector();
        org.mockito.asm.ByteVector byteVector15 = byteVector13.putUTF8("hi!");
        org.mockito.asm.ByteVector byteVector17 = byteVector15.putLong((long) (byte) 10);
        org.mockito.asm.ByteVector byteVector19 = byteVector17.putUTF8("hi!");
        org.mockito.asm.ByteVector byteVector21 = byteVector17.putLong((long) 10);
        org.mockito.asm.ByteVector byteVector23 = byteVector21.putLong(0L);
        org.mockito.asm.ByteVector byteVector25 = byteVector23.putShort((int) (byte) -1);
        org.mockito.asm.ByteVector byteVector27 = byteVector23.putInt((-1));
        org.mockito.asm.ByteVector byteVector29 = byteVector23.putByte((int) (byte) 100);
        org.mockito.asm.ByteVector byteVector31 = new org.mockito.asm.ByteVector((int) '#');
        org.mockito.asm.ByteVector byteVector33 = byteVector31.putInt(100);
        org.mockito.asm.ByteVector byteVector35 = byteVector31.putUTF8("");
        org.mockito.asm.ByteVector byteVector36 = new org.mockito.asm.ByteVector();
        org.mockito.asm.ByteVector byteVector38 = byteVector36.putUTF8("hi!");
        org.mockito.asm.ByteVector byteVector40 = byteVector38.putInt(0);
        org.mockito.asm.ByteVector byteVector42 = byteVector40.putByte((int) (short) 0);
        org.mockito.asm.ByteVector byteVector44 = byteVector40.putUTF8("");
        org.mockito.asm.ByteVector byteVector45 = new org.mockito.asm.ByteVector();
        org.mockito.asm.ByteVector byteVector47 = byteVector45.putUTF8("hi!");
        org.mockito.asm.ByteVector byteVector49 = byteVector45.putInt(0);
        org.mockito.asm.ByteVector byteVector51 = byteVector45.putShort((int) '4');
        org.mockito.asm.ByteVector byteVector53 = byteVector45.putByte(100);
        org.mockito.asm.ByteVector byteVector55 = byteVector53.putInt((int) (byte) 10);
        org.mockito.asm.ByteVector byteVector57 = byteVector53.putInt((int) (byte) 10);
        org.mockito.asm.ByteVector byteVector59 = byteVector57.putByte(100);
        org.mockito.asm.ByteVector byteVector60 = new org.mockito.asm.ByteVector();
        org.mockito.asm.ByteVector byteVector62 = byteVector60.putUTF8("hi!");
        org.mockito.asm.ByteVector byteVector64 = byteVector60.putInt(0);
        org.mockito.asm.ByteVector byteVector66 = byteVector64.putInt((int) ' ');
        org.mockito.asm.ByteVector byteVector68 = byteVector66.putLong(100L);
        byte[] byteArray72 = new byte[] { (byte) 0, (byte) 10, (byte) 1 };
        org.mockito.asm.ByteVector byteVector75 = byteVector66.putByteArray(byteArray72, 0, 0);
        org.mockito.asm.ByteVector byteVector78 = byteVector59.putByteArray(byteArray72, (int) (byte) 1, (int) (byte) 0);
        org.mockito.asm.ByteVector byteVector81 = byteVector40.putByteArray(byteArray72, (int) (short) 0, 0);
        org.mockito.asm.ByteVector byteVector84 = byteVector35.putByteArray(byteArray72, (int) (byte) 0, (int) (short) 1);
        org.mockito.asm.ByteVector byteVector87 = byteVector23.putByteArray(byteArray72, (int) (byte) 1, (int) (byte) 0);
        org.mockito.asm.ByteVector byteVector90 = byteVector8.putByteArray(byteArray72, 0, (int) (byte) 0);
        org.mockito.asm.ByteVector byteVector92 = byteVector90.putInt((int) (short) 10);
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
        org.junit.Assert.assertNotNull(byteVector33);
        org.junit.Assert.assertNotNull(byteVector35);
        org.junit.Assert.assertNotNull(byteVector38);
        org.junit.Assert.assertNotNull(byteVector40);
        org.junit.Assert.assertNotNull(byteVector42);
        org.junit.Assert.assertNotNull(byteVector44);
        org.junit.Assert.assertNotNull(byteVector47);
        org.junit.Assert.assertNotNull(byteVector49);
        org.junit.Assert.assertNotNull(byteVector51);
        org.junit.Assert.assertNotNull(byteVector53);
        org.junit.Assert.assertNotNull(byteVector55);
        org.junit.Assert.assertNotNull(byteVector57);
        org.junit.Assert.assertNotNull(byteVector59);
        org.junit.Assert.assertNotNull(byteVector62);
        org.junit.Assert.assertNotNull(byteVector64);
        org.junit.Assert.assertNotNull(byteVector66);
        org.junit.Assert.assertNotNull(byteVector68);
        org.junit.Assert.assertNotNull(byteArray72);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray72), "[0, 10, 1]");
        org.junit.Assert.assertNotNull(byteVector75);
        org.junit.Assert.assertNotNull(byteVector78);
        org.junit.Assert.assertNotNull(byteVector81);
        org.junit.Assert.assertNotNull(byteVector84);
        org.junit.Assert.assertNotNull(byteVector87);
        org.junit.Assert.assertNotNull(byteVector90);
        org.junit.Assert.assertNotNull(byteVector92);
    }

    @Test
    public void test1427() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1427");
        org.mockito.asm.ByteVector byteVector0 = new org.mockito.asm.ByteVector();
        org.mockito.asm.ByteVector byteVector2 = byteVector0.putUTF8("hi!");
        org.mockito.asm.ByteVector byteVector4 = byteVector0.putInt(0);
        org.mockito.asm.ByteVector byteVector6 = byteVector0.putShort((int) '4');
        org.mockito.asm.ByteVector byteVector8 = byteVector0.putByte(100);
        org.mockito.asm.ByteVector byteVector10 = byteVector8.putInt((int) (byte) 10);
        org.mockito.asm.ByteVector byteVector12 = byteVector10.putByte((int) (byte) 1);
        org.mockito.asm.ByteVector byteVector14 = byteVector10.putShort((int) (short) 0);
        org.mockito.asm.ByteVector byteVector16 = byteVector10.putInt((int) (short) 1);
        org.mockito.asm.ByteVector byteVector18 = byteVector10.putUTF8("hi!");
        org.mockito.asm.ByteVector byteVector20 = byteVector10.putShort((int) 'a');
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
    public void test1428() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1428");
        org.mockito.asm.ByteVector byteVector1 = new org.mockito.asm.ByteVector((int) (byte) 10);
        org.mockito.asm.ByteVector byteVector3 = byteVector1.putByte((int) '4');
        org.mockito.asm.ByteVector byteVector5 = byteVector1.putLong((long) 'a');
        org.mockito.asm.ByteVector byteVector7 = byteVector1.putShort((int) (byte) 1);
        org.mockito.asm.ByteVector byteVector9 = byteVector1.putUTF8("hi!");
        org.junit.Assert.assertNotNull(byteVector3);
        org.junit.Assert.assertNotNull(byteVector5);
        org.junit.Assert.assertNotNull(byteVector7);
        org.junit.Assert.assertNotNull(byteVector9);
    }

    @Test
    public void test1429() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1429");
        org.mockito.asm.ByteVector byteVector0 = new org.mockito.asm.ByteVector();
        org.mockito.asm.ByteVector byteVector2 = byteVector0.putUTF8("hi!");
        org.mockito.asm.ByteVector byteVector4 = byteVector0.putLong((long) ' ');
        org.mockito.asm.ByteVector byteVector6 = byteVector4.putByte((int) 'a');
        org.mockito.asm.ByteVector byteVector8 = byteVector6.putInt((int) (short) 1);
        org.mockito.asm.ByteVector byteVector10 = byteVector6.putByte((int) (byte) -1);
        org.mockito.asm.ByteVector byteVector12 = byteVector6.putInt((int) (byte) -1);
        org.mockito.asm.ByteVector byteVector14 = byteVector6.putLong((long) '4');
        org.junit.Assert.assertNotNull(byteVector2);
        org.junit.Assert.assertNotNull(byteVector4);
        org.junit.Assert.assertNotNull(byteVector6);
        org.junit.Assert.assertNotNull(byteVector8);
        org.junit.Assert.assertNotNull(byteVector10);
        org.junit.Assert.assertNotNull(byteVector12);
        org.junit.Assert.assertNotNull(byteVector14);
    }

    @Test
    public void test1430() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1430");
        org.mockito.asm.ByteVector byteVector0 = new org.mockito.asm.ByteVector();
        org.mockito.asm.ByteVector byteVector2 = byteVector0.putUTF8("hi!");
        org.mockito.asm.ByteVector byteVector4 = byteVector0.putInt(0);
        org.mockito.asm.ByteVector byteVector6 = byteVector4.putInt((int) ' ');
        org.mockito.asm.ByteVector byteVector8 = byteVector6.putLong((long) (short) 10);
        org.mockito.asm.ByteVector byteVector10 = byteVector8.putUTF8("hi!");
        org.mockito.asm.ByteVector byteVector12 = byteVector8.putByte(0);
        org.mockito.asm.ByteVector byteVector14 = byteVector12.putInt((int) (short) 1);
        org.mockito.asm.ByteVector byteVector16 = byteVector14.putByte(0);
        org.mockito.asm.ByteVector byteVector18 = byteVector16.putInt((-1));
        org.mockito.asm.ByteVector byteVector20 = byteVector16.putShort((int) (short) 0);
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
    public void test1431() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1431");
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
        org.mockito.asm.ByteVector byteVector30 = byteVector26.putInt(1);
        org.mockito.asm.ByteVector byteVector32 = byteVector26.putShort((int) (byte) -1);
        org.mockito.asm.ByteVector byteVector34 = byteVector32.putShort((int) (short) 0);
        org.mockito.asm.ByteVector byteVector36 = byteVector32.putByte((int) 'a');
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
        org.junit.Assert.assertNotNull(byteVector30);
        org.junit.Assert.assertNotNull(byteVector32);
        org.junit.Assert.assertNotNull(byteVector34);
        org.junit.Assert.assertNotNull(byteVector36);
    }

    @Test
    public void test1432() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1432");
        org.mockito.asm.ByteVector byteVector0 = new org.mockito.asm.ByteVector();
        org.mockito.asm.ByteVector byteVector2 = byteVector0.putUTF8("hi!");
        org.mockito.asm.ByteVector byteVector4 = byteVector0.putLong((long) ' ');
        org.mockito.asm.ByteVector byteVector6 = byteVector4.putByte((int) 'a');
        org.mockito.asm.ByteVector byteVector8 = byteVector6.putInt((int) (short) 0);
        org.mockito.asm.ByteVector byteVector10 = byteVector8.putByte((int) (short) 0);
        org.mockito.asm.ByteVector byteVector12 = byteVector10.putUTF8("");
        org.mockito.asm.ByteVector byteVector14 = byteVector12.putUTF8("hi!");
        org.mockito.asm.ByteVector byteVector16 = byteVector14.putLong(10L);
        org.mockito.asm.ByteVector byteVector18 = byteVector16.putUTF8("");
        org.mockito.asm.ByteVector byteVector20 = byteVector18.putUTF8("");
        org.mockito.asm.ByteVector byteVector22 = byteVector20.putUTF8("hi!");
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
    public void test1433() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1433");
        org.mockito.asm.ByteVector byteVector1 = new org.mockito.asm.ByteVector((int) '#');
        org.mockito.asm.ByteVector byteVector3 = byteVector1.putLong(100L);
        org.mockito.asm.ByteVector byteVector5 = byteVector1.putUTF8("");
        org.mockito.asm.ByteVector byteVector7 = byteVector1.putUTF8("hi!");
        org.mockito.asm.ByteVector byteVector9 = byteVector7.putLong((long) (short) 0);
        org.mockito.asm.ByteVector byteVector11 = byteVector9.putLong((long) 1);
        org.mockito.asm.ByteVector byteVector13 = byteVector11.putUTF8("hi!");
        org.mockito.asm.ByteVector byteVector15 = byteVector13.putShort((int) (short) 1);
        org.mockito.asm.ByteVector byteVector17 = byteVector13.putShort((int) (short) 1);
        org.junit.Assert.assertNotNull(byteVector3);
        org.junit.Assert.assertNotNull(byteVector5);
        org.junit.Assert.assertNotNull(byteVector7);
        org.junit.Assert.assertNotNull(byteVector9);
        org.junit.Assert.assertNotNull(byteVector11);
        org.junit.Assert.assertNotNull(byteVector13);
        org.junit.Assert.assertNotNull(byteVector15);
        org.junit.Assert.assertNotNull(byteVector17);
    }

    @Test
    public void test1434() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1434");
        org.mockito.asm.ByteVector byteVector0 = new org.mockito.asm.ByteVector();
        org.mockito.asm.ByteVector byteVector2 = byteVector0.putUTF8("hi!");
        org.mockito.asm.ByteVector byteVector4 = byteVector0.putByte((int) (byte) 1);
        org.mockito.asm.ByteVector byteVector6 = byteVector0.putLong((long) (short) 1);
        org.mockito.asm.ByteVector byteVector8 = byteVector6.putUTF8("hi!");
        org.mockito.asm.ByteVector byteVector10 = byteVector8.putInt((int) '#');
        org.junit.Assert.assertNotNull(byteVector2);
        org.junit.Assert.assertNotNull(byteVector4);
        org.junit.Assert.assertNotNull(byteVector6);
        org.junit.Assert.assertNotNull(byteVector8);
        org.junit.Assert.assertNotNull(byteVector10);
    }

    @Test
    public void test1435() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1435");
        org.mockito.asm.ByteVector byteVector0 = new org.mockito.asm.ByteVector();
        org.mockito.asm.ByteVector byteVector2 = byteVector0.putUTF8("hi!");
        org.mockito.asm.ByteVector byteVector4 = byteVector2.putInt(0);
        org.mockito.asm.ByteVector byteVector6 = byteVector4.putByte((int) (byte) 1);
        org.mockito.asm.ByteVector byteVector8 = byteVector6.putLong(1L);
        org.mockito.asm.ByteVector byteVector9 = new org.mockito.asm.ByteVector();
        org.mockito.asm.ByteVector byteVector11 = byteVector9.putUTF8("hi!");
        org.mockito.asm.ByteVector byteVector13 = byteVector9.putInt(0);
        org.mockito.asm.ByteVector byteVector15 = byteVector13.putByte((int) (byte) -1);
        org.mockito.asm.ByteVector byteVector17 = byteVector13.putShort((int) '4');
        org.mockito.asm.ByteVector byteVector18 = new org.mockito.asm.ByteVector();
        org.mockito.asm.ByteVector byteVector20 = byteVector18.putUTF8("hi!");
        org.mockito.asm.ByteVector byteVector22 = byteVector18.putLong((long) ' ');
        org.mockito.asm.ByteVector byteVector24 = byteVector22.putByte((int) 'a');
        org.mockito.asm.ByteVector byteVector26 = byteVector22.putByte((int) (short) -1);
        org.mockito.asm.ByteVector byteVector28 = byteVector22.putLong(0L);
        org.mockito.asm.ByteVector byteVector30 = byteVector22.putUTF8("hi!");
        org.mockito.asm.ByteVector byteVector32 = byteVector30.putUTF8("");
        org.mockito.asm.ByteVector byteVector34 = byteVector32.putLong((long) (byte) 10);
        org.mockito.asm.ByteVector byteVector36 = byteVector32.putLong((long) (short) 100);
        byte[] byteArray41 = new byte[] { (byte) 1, (byte) 0, (byte) 0, (byte) -1 };
        org.mockito.asm.ByteVector byteVector44 = byteVector32.putByteArray(byteArray41, 0, 0);
        org.mockito.asm.ByteVector byteVector47 = byteVector17.putByteArray(byteArray41, (int) (byte) 0, (int) (short) 1);
        // The following exception was thrown during execution in test generation
        try {
            org.mockito.asm.ByteVector byteVector50 = byteVector6.putByteArray(byteArray41, (int) (byte) -1, (int) (short) 10);
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
        org.junit.Assert.assertNotNull(byteVector34);
        org.junit.Assert.assertNotNull(byteVector36);
        org.junit.Assert.assertNotNull(byteArray41);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray41), "[1, 0, 0, -1]");
        org.junit.Assert.assertNotNull(byteVector44);
        org.junit.Assert.assertNotNull(byteVector47);
    }

    @Test
    public void test1436() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1436");
        org.mockito.asm.ByteVector byteVector1 = new org.mockito.asm.ByteVector((int) (byte) 100);
        org.mockito.asm.ByteVector byteVector3 = byteVector1.putShort((int) (short) 100);
        org.mockito.asm.ByteVector byteVector5 = byteVector1.putByte((int) (byte) 10);
        org.mockito.asm.ByteVector byteVector7 = byteVector5.putByte((int) '4');
        org.mockito.asm.ByteVector byteVector9 = byteVector7.putUTF8("");
        org.junit.Assert.assertNotNull(byteVector3);
        org.junit.Assert.assertNotNull(byteVector5);
        org.junit.Assert.assertNotNull(byteVector7);
        org.junit.Assert.assertNotNull(byteVector9);
    }

    @Test
    public void test1437() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1437");
        org.mockito.asm.ByteVector byteVector0 = new org.mockito.asm.ByteVector();
        org.mockito.asm.ByteVector byteVector2 = byteVector0.putUTF8("hi!");
        org.mockito.asm.ByteVector byteVector4 = byteVector2.putLong((long) (byte) 10);
        org.mockito.asm.ByteVector byteVector6 = byteVector4.putUTF8("hi!");
        org.mockito.asm.ByteVector byteVector8 = byteVector4.putLong((long) 10);
        org.mockito.asm.ByteVector byteVector10 = byteVector8.putLong(0L);
        org.mockito.asm.ByteVector byteVector12 = byteVector8.putUTF8("hi!");
        org.junit.Assert.assertNotNull(byteVector2);
        org.junit.Assert.assertNotNull(byteVector4);
        org.junit.Assert.assertNotNull(byteVector6);
        org.junit.Assert.assertNotNull(byteVector8);
        org.junit.Assert.assertNotNull(byteVector10);
        org.junit.Assert.assertNotNull(byteVector12);
    }

    @Test
    public void test1438() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1438");
        org.mockito.asm.ByteVector byteVector0 = new org.mockito.asm.ByteVector();
        org.mockito.asm.ByteVector byteVector2 = byteVector0.putUTF8("hi!");
        org.mockito.asm.ByteVector byteVector4 = byteVector0.putLong((long) ' ');
        org.mockito.asm.ByteVector byteVector6 = byteVector4.putByte((int) 'a');
        org.mockito.asm.ByteVector byteVector8 = byteVector4.putByte((int) (short) -1);
        org.mockito.asm.ByteVector byteVector10 = byteVector4.putLong(0L);
        org.mockito.asm.ByteVector byteVector12 = byteVector4.putUTF8("hi!");
        org.mockito.asm.ByteVector byteVector14 = byteVector12.putUTF8("");
        org.mockito.asm.ByteVector byteVector16 = byteVector12.putLong((long) (byte) 10);
        org.mockito.asm.ByteVector byteVector18 = byteVector12.putLong((long) (byte) 100);
        org.mockito.asm.ByteVector byteVector20 = byteVector12.putLong((long) (byte) 1);
        org.mockito.asm.ByteVector byteVector22 = byteVector12.putInt((-1));
        org.mockito.asm.ByteVector byteVector24 = byteVector22.putShort(0);
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
    public void test1439() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1439");
        org.mockito.asm.ByteVector byteVector0 = new org.mockito.asm.ByteVector();
        org.mockito.asm.ByteVector byteVector2 = byteVector0.putUTF8("hi!");
        org.mockito.asm.ByteVector byteVector4 = byteVector0.putInt(0);
        org.mockito.asm.ByteVector byteVector6 = byteVector0.putShort((int) '4');
        org.mockito.asm.ByteVector byteVector8 = byteVector0.putByte(100);
        org.mockito.asm.ByteVector byteVector10 = byteVector8.putInt((int) (byte) 10);
        org.mockito.asm.ByteVector byteVector12 = byteVector8.putShort((int) '#');
        org.mockito.asm.ByteVector byteVector14 = byteVector8.putLong((long) (-1));
        org.mockito.asm.ByteVector byteVector16 = byteVector14.putShort((int) (short) 1);
        org.mockito.asm.ByteVector byteVector18 = byteVector14.putLong(1L);
        org.mockito.asm.ByteVector byteVector20 = byteVector14.putInt((int) (short) 100);
        org.mockito.asm.ByteVector byteVector22 = byteVector14.putUTF8("");
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
    public void test1440() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1440");
        org.mockito.asm.ByteVector byteVector1 = new org.mockito.asm.ByteVector((int) '#');
        org.mockito.asm.ByteVector byteVector3 = byteVector1.putShort(0);
        org.mockito.asm.ByteVector byteVector5 = byteVector1.putInt((int) (short) 1);
        org.mockito.asm.ByteVector byteVector7 = byteVector5.putShort((int) (short) 100);
        org.mockito.asm.ByteVector byteVector9 = new org.mockito.asm.ByteVector((int) '#');
        org.mockito.asm.ByteVector byteVector11 = byteVector9.putLong(100L);
        org.mockito.asm.ByteVector byteVector13 = byteVector11.putUTF8("");
        org.mockito.asm.ByteVector byteVector15 = byteVector11.putLong((-1L));
        org.mockito.asm.ByteVector byteVector17 = byteVector15.putLong((-1L));
        org.mockito.asm.ByteVector byteVector19 = byteVector17.putInt((int) (byte) 10);
        org.mockito.asm.ByteVector byteVector20 = new org.mockito.asm.ByteVector();
        org.mockito.asm.ByteVector byteVector22 = byteVector20.putUTF8("hi!");
        org.mockito.asm.ByteVector byteVector24 = byteVector20.putLong((long) ' ');
        org.mockito.asm.ByteVector byteVector26 = byteVector24.putByte((int) 'a');
        org.mockito.asm.ByteVector byteVector28 = byteVector24.putByte((int) (short) -1);
        org.mockito.asm.ByteVector byteVector30 = byteVector24.putLong(0L);
        org.mockito.asm.ByteVector byteVector32 = byteVector30.putByte(0);
        org.mockito.asm.ByteVector byteVector34 = byteVector32.putLong(1L);
        org.mockito.asm.ByteVector byteVector36 = byteVector34.putShort((int) 'a');
        org.mockito.asm.ByteVector byteVector38 = byteVector34.putLong((long) 10);
        org.mockito.asm.ByteVector byteVector40 = byteVector34.putUTF8("");
        org.mockito.asm.ByteVector byteVector41 = new org.mockito.asm.ByteVector();
        org.mockito.asm.ByteVector byteVector43 = byteVector41.putUTF8("hi!");
        org.mockito.asm.ByteVector byteVector45 = byteVector43.putLong((long) (byte) 10);
        org.mockito.asm.ByteVector byteVector47 = byteVector45.putUTF8("hi!");
        org.mockito.asm.ByteVector byteVector49 = byteVector45.putLong((long) (short) -1);
        org.mockito.asm.ByteVector byteVector51 = byteVector49.putInt(10);
        org.mockito.asm.ByteVector byteVector53 = byteVector49.putByte((int) (short) 1);
        org.mockito.asm.ByteVector byteVector55 = byteVector49.putInt((int) (short) -1);
        org.mockito.asm.ByteVector byteVector57 = byteVector49.putUTF8("hi!");
        org.mockito.asm.ByteVector byteVector58 = new org.mockito.asm.ByteVector();
        org.mockito.asm.ByteVector byteVector60 = byteVector58.putUTF8("hi!");
        org.mockito.asm.ByteVector byteVector62 = byteVector58.putLong((long) ' ');
        org.mockito.asm.ByteVector byteVector64 = byteVector62.putByte((int) 'a');
        org.mockito.asm.ByteVector byteVector66 = byteVector62.putByte((int) (short) -1);
        org.mockito.asm.ByteVector byteVector68 = byteVector62.putLong(0L);
        org.mockito.asm.ByteVector byteVector70 = byteVector62.putUTF8("hi!");
        org.mockito.asm.ByteVector byteVector72 = byteVector70.putUTF8("");
        org.mockito.asm.ByteVector byteVector74 = byteVector72.putLong((long) (byte) 10);
        org.mockito.asm.ByteVector byteVector76 = byteVector72.putLong((long) (short) 100);
        byte[] byteArray81 = new byte[] { (byte) 1, (byte) 0, (byte) 0, (byte) -1 };
        org.mockito.asm.ByteVector byteVector84 = byteVector72.putByteArray(byteArray81, 0, 0);
        org.mockito.asm.ByteVector byteVector87 = byteVector57.putByteArray(byteArray81, (int) (byte) 0, (int) (short) 1);
        org.mockito.asm.ByteVector byteVector90 = byteVector34.putByteArray(byteArray81, (int) (short) 0, (int) (short) 0);
        org.mockito.asm.ByteVector byteVector93 = byteVector19.putByteArray(byteArray81, 0, (int) (byte) 1);
        // The following exception was thrown during execution in test generation
        try {
            org.mockito.asm.ByteVector byteVector96 = byteVector7.putByteArray(byteArray81, (int) (short) 100, 0);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteVector3);
        org.junit.Assert.assertNotNull(byteVector5);
        org.junit.Assert.assertNotNull(byteVector7);
        org.junit.Assert.assertNotNull(byteVector11);
        org.junit.Assert.assertNotNull(byteVector13);
        org.junit.Assert.assertNotNull(byteVector15);
        org.junit.Assert.assertNotNull(byteVector17);
        org.junit.Assert.assertNotNull(byteVector19);
        org.junit.Assert.assertNotNull(byteVector22);
        org.junit.Assert.assertNotNull(byteVector24);
        org.junit.Assert.assertNotNull(byteVector26);
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
        org.junit.Assert.assertNotNull(byteVector51);
        org.junit.Assert.assertNotNull(byteVector53);
        org.junit.Assert.assertNotNull(byteVector55);
        org.junit.Assert.assertNotNull(byteVector57);
        org.junit.Assert.assertNotNull(byteVector60);
        org.junit.Assert.assertNotNull(byteVector62);
        org.junit.Assert.assertNotNull(byteVector64);
        org.junit.Assert.assertNotNull(byteVector66);
        org.junit.Assert.assertNotNull(byteVector68);
        org.junit.Assert.assertNotNull(byteVector70);
        org.junit.Assert.assertNotNull(byteVector72);
        org.junit.Assert.assertNotNull(byteVector74);
        org.junit.Assert.assertNotNull(byteVector76);
        org.junit.Assert.assertNotNull(byteArray81);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray81), "[1, 0, 0, -1]");
        org.junit.Assert.assertNotNull(byteVector84);
        org.junit.Assert.assertNotNull(byteVector87);
        org.junit.Assert.assertNotNull(byteVector90);
        org.junit.Assert.assertNotNull(byteVector93);
    }

    @Test
    public void test1441() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1441");
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
        org.mockito.asm.ByteVector byteVector20 = byteVector18.putUTF8("hi!");
        org.mockito.asm.ByteVector byteVector22 = byteVector20.putUTF8("");
        org.mockito.asm.ByteVector byteVector24 = byteVector20.putInt((int) (byte) 0);
        org.mockito.asm.ByteVector byteVector26 = byteVector24.putInt((int) 'a');
        org.mockito.asm.ByteVector byteVector28 = byteVector24.putUTF8("");
        org.mockito.asm.ByteVector byteVector30 = byteVector28.putByte((int) (short) -1);
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
        org.junit.Assert.assertNotNull(byteVector30);
    }

    @Test
    public void test1442() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1442");
        org.mockito.asm.ByteVector byteVector0 = new org.mockito.asm.ByteVector();
        org.mockito.asm.ByteVector byteVector2 = byteVector0.putUTF8("hi!");
        org.mockito.asm.ByteVector byteVector4 = byteVector2.putByte(100);
        org.mockito.asm.ByteVector byteVector6 = byteVector2.putLong((long) 10);
        org.mockito.asm.ByteVector byteVector8 = byteVector2.putShort((int) (short) -1);
        org.mockito.asm.ByteVector byteVector10 = byteVector2.putInt((int) (byte) 100);
        org.mockito.asm.ByteVector byteVector12 = byteVector10.putLong(1L);
        org.junit.Assert.assertNotNull(byteVector2);
        org.junit.Assert.assertNotNull(byteVector4);
        org.junit.Assert.assertNotNull(byteVector6);
        org.junit.Assert.assertNotNull(byteVector8);
        org.junit.Assert.assertNotNull(byteVector10);
        org.junit.Assert.assertNotNull(byteVector12);
    }

    @Test
    public void test1443() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1443");
        org.mockito.asm.ByteVector byteVector0 = new org.mockito.asm.ByteVector();
        org.mockito.asm.ByteVector byteVector2 = byteVector0.putUTF8("hi!");
        org.mockito.asm.ByteVector byteVector4 = byteVector0.putInt(0);
        org.mockito.asm.ByteVector byteVector6 = byteVector4.putInt((int) ' ');
        org.mockito.asm.ByteVector byteVector8 = byteVector6.putLong((long) (short) 10);
        org.mockito.asm.ByteVector byteVector10 = byteVector8.putUTF8("hi!");
        org.mockito.asm.ByteVector byteVector12 = byteVector10.putLong(1L);
        org.junit.Assert.assertNotNull(byteVector2);
        org.junit.Assert.assertNotNull(byteVector4);
        org.junit.Assert.assertNotNull(byteVector6);
        org.junit.Assert.assertNotNull(byteVector8);
        org.junit.Assert.assertNotNull(byteVector10);
        org.junit.Assert.assertNotNull(byteVector12);
    }

    @Test
    public void test1444() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1444");
        org.mockito.asm.ByteVector byteVector1 = new org.mockito.asm.ByteVector((int) (byte) 10);
        org.mockito.asm.ByteVector byteVector3 = byteVector1.putByte((int) '4');
        org.mockito.asm.ByteVector byteVector5 = byteVector1.putLong(0L);
        org.mockito.asm.ByteVector byteVector7 = byteVector1.putByte((int) (byte) 100);
        org.mockito.asm.ByteVector byteVector9 = byteVector1.putLong((long) ' ');
        org.mockito.asm.ByteVector byteVector11 = byteVector9.putInt((int) (short) -1);
        org.mockito.asm.ByteVector byteVector13 = byteVector11.putShort((int) (short) 0);
        org.junit.Assert.assertNotNull(byteVector3);
        org.junit.Assert.assertNotNull(byteVector5);
        org.junit.Assert.assertNotNull(byteVector7);
        org.junit.Assert.assertNotNull(byteVector9);
        org.junit.Assert.assertNotNull(byteVector11);
        org.junit.Assert.assertNotNull(byteVector13);
    }

    @Test
    public void test1445() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1445");
        org.mockito.asm.ByteVector byteVector0 = new org.mockito.asm.ByteVector();
        org.mockito.asm.ByteVector byteVector2 = byteVector0.putUTF8("hi!");
        org.mockito.asm.ByteVector byteVector4 = byteVector2.putInt(0);
        org.mockito.asm.ByteVector byteVector6 = byteVector4.putShort(1);
        org.mockito.asm.ByteVector byteVector8 = byteVector6.putByte((int) (byte) 1);
        org.mockito.asm.ByteVector byteVector10 = byteVector6.putLong((long) 10);
        org.mockito.asm.ByteVector byteVector12 = byteVector6.putUTF8("");
        org.mockito.asm.ByteVector byteVector13 = new org.mockito.asm.ByteVector();
        org.mockito.asm.ByteVector byteVector15 = byteVector13.putUTF8("hi!");
        org.mockito.asm.ByteVector byteVector17 = byteVector15.putLong((long) (byte) 10);
        org.mockito.asm.ByteVector byteVector19 = byteVector17.putUTF8("hi!");
        org.mockito.asm.ByteVector byteVector21 = byteVector17.putLong((-1L));
        org.mockito.asm.ByteVector byteVector23 = byteVector21.putInt(10);
        org.mockito.asm.ByteVector byteVector25 = byteVector23.putShort((int) '#');
        org.mockito.asm.ByteVector byteVector27 = new org.mockito.asm.ByteVector((int) (short) 0);
        org.mockito.asm.ByteVector byteVector28 = new org.mockito.asm.ByteVector();
        org.mockito.asm.ByteVector byteVector30 = byteVector28.putUTF8("hi!");
        org.mockito.asm.ByteVector byteVector32 = byteVector28.putInt(0);
        org.mockito.asm.ByteVector byteVector34 = byteVector32.putInt((int) ' ');
        org.mockito.asm.ByteVector byteVector36 = byteVector34.putLong(100L);
        byte[] byteArray40 = new byte[] { (byte) 0, (byte) 10, (byte) 1 };
        org.mockito.asm.ByteVector byteVector43 = byteVector34.putByteArray(byteArray40, 0, 0);
        org.mockito.asm.ByteVector byteVector46 = byteVector27.putByteArray(byteArray40, 1, (int) (short) 0);
        org.mockito.asm.ByteVector byteVector49 = byteVector23.putByteArray(byteArray40, (int) (short) 0, 0);
        // The following exception was thrown during execution in test generation
        try {
            org.mockito.asm.ByteVector byteVector52 = byteVector12.putByteArray(byteArray40, (int) (short) -1, (int) (byte) 0);
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
        org.junit.Assert.assertNotNull(byteVector30);
        org.junit.Assert.assertNotNull(byteVector32);
        org.junit.Assert.assertNotNull(byteVector34);
        org.junit.Assert.assertNotNull(byteVector36);
        org.junit.Assert.assertNotNull(byteArray40);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray40), "[0, 10, 1]");
        org.junit.Assert.assertNotNull(byteVector43);
        org.junit.Assert.assertNotNull(byteVector46);
        org.junit.Assert.assertNotNull(byteVector49);
    }

    @Test
    public void test1446() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1446");
        org.mockito.asm.ByteVector byteVector1 = new org.mockito.asm.ByteVector((int) '#');
        org.mockito.asm.ByteVector byteVector3 = byteVector1.putLong(100L);
        org.mockito.asm.ByteVector byteVector5 = byteVector3.putLong(1L);
        org.mockito.asm.ByteVector byteVector7 = byteVector5.putUTF8("hi!");
        org.mockito.asm.ByteVector byteVector9 = byteVector5.putUTF8("hi!");
        org.mockito.asm.ByteVector byteVector11 = byteVector9.putByte((int) (short) 0);
        org.mockito.asm.ByteVector byteVector13 = byteVector11.putInt((int) (short) 0);
        org.mockito.asm.ByteVector byteVector15 = byteVector13.putLong((long) (short) -1);
        org.junit.Assert.assertNotNull(byteVector3);
        org.junit.Assert.assertNotNull(byteVector5);
        org.junit.Assert.assertNotNull(byteVector7);
        org.junit.Assert.assertNotNull(byteVector9);
        org.junit.Assert.assertNotNull(byteVector11);
        org.junit.Assert.assertNotNull(byteVector13);
        org.junit.Assert.assertNotNull(byteVector15);
    }

    @Test
    public void test1447() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1447");
        org.mockito.asm.ByteVector byteVector0 = new org.mockito.asm.ByteVector();
        org.mockito.asm.ByteVector byteVector2 = byteVector0.putUTF8("hi!");
        org.mockito.asm.ByteVector byteVector4 = byteVector2.putInt(0);
        org.mockito.asm.ByteVector byteVector6 = byteVector4.putByte((int) (byte) 1);
        org.mockito.asm.ByteVector byteVector8 = byteVector6.putLong(1L);
        org.mockito.asm.ByteVector byteVector10 = byteVector8.putShort((int) '#');
        org.mockito.asm.ByteVector byteVector12 = byteVector8.putShort((int) (short) 10);
        org.junit.Assert.assertNotNull(byteVector2);
        org.junit.Assert.assertNotNull(byteVector4);
        org.junit.Assert.assertNotNull(byteVector6);
        org.junit.Assert.assertNotNull(byteVector8);
        org.junit.Assert.assertNotNull(byteVector10);
        org.junit.Assert.assertNotNull(byteVector12);
    }

    @Test
    public void test1448() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1448");
        org.mockito.asm.ByteVector byteVector1 = new org.mockito.asm.ByteVector((int) '#');
        org.mockito.asm.ByteVector byteVector3 = byteVector1.putInt(100);
        org.mockito.asm.ByteVector byteVector5 = byteVector3.putShort((int) (short) -1);
        org.mockito.asm.ByteVector byteVector7 = byteVector5.putShort((int) (short) 0);
        org.mockito.asm.ByteVector byteVector9 = byteVector5.putUTF8("");
        org.mockito.asm.ByteVector byteVector11 = byteVector9.putByte((int) (short) 100);
        org.mockito.asm.ByteVector byteVector13 = byteVector9.putLong((long) (byte) 0);
        org.mockito.asm.ByteVector byteVector14 = new org.mockito.asm.ByteVector();
        org.mockito.asm.ByteVector byteVector16 = byteVector14.putUTF8("hi!");
        org.mockito.asm.ByteVector byteVector18 = byteVector16.putLong((long) (byte) 10);
        org.mockito.asm.ByteVector byteVector20 = byteVector18.putUTF8("hi!");
        org.mockito.asm.ByteVector byteVector22 = byteVector18.putLong((-1L));
        org.mockito.asm.ByteVector byteVector24 = new org.mockito.asm.ByteVector((int) (short) 0);
        org.mockito.asm.ByteVector byteVector25 = new org.mockito.asm.ByteVector();
        org.mockito.asm.ByteVector byteVector27 = byteVector25.putUTF8("hi!");
        org.mockito.asm.ByteVector byteVector29 = byteVector25.putInt(0);
        org.mockito.asm.ByteVector byteVector31 = byteVector29.putInt((int) ' ');
        org.mockito.asm.ByteVector byteVector33 = byteVector31.putLong(100L);
        byte[] byteArray37 = new byte[] { (byte) 0, (byte) 10, (byte) 1 };
        org.mockito.asm.ByteVector byteVector40 = byteVector31.putByteArray(byteArray37, 0, 0);
        org.mockito.asm.ByteVector byteVector43 = byteVector24.putByteArray(byteArray37, 1, (int) (short) 0);
        org.mockito.asm.ByteVector byteVector46 = byteVector22.putByteArray(byteArray37, 0, (int) (byte) 1);
        // The following exception was thrown during execution in test generation
        try {
            org.mockito.asm.ByteVector byteVector49 = byteVector9.putByteArray(byteArray37, (-1), (int) (short) 1);
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
        org.junit.Assert.assertNotNull(byteVector16);
        org.junit.Assert.assertNotNull(byteVector18);
        org.junit.Assert.assertNotNull(byteVector20);
        org.junit.Assert.assertNotNull(byteVector22);
        org.junit.Assert.assertNotNull(byteVector27);
        org.junit.Assert.assertNotNull(byteVector29);
        org.junit.Assert.assertNotNull(byteVector31);
        org.junit.Assert.assertNotNull(byteVector33);
        org.junit.Assert.assertNotNull(byteArray37);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray37), "[0, 10, 1]");
        org.junit.Assert.assertNotNull(byteVector40);
        org.junit.Assert.assertNotNull(byteVector43);
        org.junit.Assert.assertNotNull(byteVector46);
    }

    @Test
    public void test1449() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1449");
        org.mockito.asm.ByteVector byteVector0 = new org.mockito.asm.ByteVector();
        org.mockito.asm.ByteVector byteVector2 = byteVector0.putUTF8("hi!");
        org.mockito.asm.ByteVector byteVector4 = byteVector0.putLong((long) ' ');
        org.mockito.asm.ByteVector byteVector6 = byteVector4.putByte((int) 'a');
        org.mockito.asm.ByteVector byteVector8 = byteVector6.putByte((int) (short) -1);
        byte[] byteArray9 = null;
        org.mockito.asm.ByteVector byteVector12 = byteVector6.putByteArray(byteArray9, (int) '#', 0);
        org.mockito.asm.ByteVector byteVector14 = byteVector6.putLong((long) '#');
        org.mockito.asm.ByteVector byteVector16 = byteVector14.putShort((int) (byte) 100);
        org.junit.Assert.assertNotNull(byteVector2);
        org.junit.Assert.assertNotNull(byteVector4);
        org.junit.Assert.assertNotNull(byteVector6);
        org.junit.Assert.assertNotNull(byteVector8);
        org.junit.Assert.assertNotNull(byteVector12);
        org.junit.Assert.assertNotNull(byteVector14);
        org.junit.Assert.assertNotNull(byteVector16);
    }

    @Test
    public void test1450() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1450");
        org.mockito.asm.ByteVector byteVector0 = new org.mockito.asm.ByteVector();
        org.mockito.asm.ByteVector byteVector2 = byteVector0.putUTF8("hi!");
        org.mockito.asm.ByteVector byteVector4 = byteVector2.putInt(0);
        org.mockito.asm.ByteVector byteVector6 = byteVector4.putShort((int) '4');
        org.mockito.asm.ByteVector byteVector8 = byteVector6.putByte(100);
        org.mockito.asm.ByteVector byteVector10 = byteVector6.putInt((int) (byte) 10);
        org.mockito.asm.ByteVector byteVector12 = byteVector10.putUTF8("");
        org.mockito.asm.ByteVector byteVector14 = byteVector10.putInt(1);
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
    public void test1451() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1451");
        org.mockito.asm.ByteVector byteVector1 = new org.mockito.asm.ByteVector((int) (byte) 100);
        org.mockito.asm.ByteVector byteVector3 = byteVector1.putInt(0);
        org.mockito.asm.ByteVector byteVector5 = byteVector3.putLong((long) (byte) 1);
        org.mockito.asm.ByteVector byteVector7 = byteVector3.putLong(0L);
        org.junit.Assert.assertNotNull(byteVector3);
        org.junit.Assert.assertNotNull(byteVector5);
        org.junit.Assert.assertNotNull(byteVector7);
    }

    @Test
    public void test1452() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1452");
        org.mockito.asm.ByteVector byteVector1 = new org.mockito.asm.ByteVector((int) '#');
        org.mockito.asm.ByteVector byteVector3 = byteVector1.putLong(100L);
        org.mockito.asm.ByteVector byteVector5 = byteVector3.putUTF8("");
        org.mockito.asm.ByteVector byteVector7 = byteVector5.putShort(0);
        org.mockito.asm.ByteVector byteVector9 = byteVector7.putByte((int) (byte) 0);
        org.junit.Assert.assertNotNull(byteVector3);
        org.junit.Assert.assertNotNull(byteVector5);
        org.junit.Assert.assertNotNull(byteVector7);
        org.junit.Assert.assertNotNull(byteVector9);
    }

    @Test
    public void test1453() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1453");
        org.mockito.asm.ByteVector byteVector0 = new org.mockito.asm.ByteVector();
        org.mockito.asm.ByteVector byteVector2 = byteVector0.putUTF8("hi!");
        org.mockito.asm.ByteVector byteVector4 = byteVector0.putShort((int) (short) -1);
        org.mockito.asm.ByteVector byteVector6 = byteVector0.putLong(0L);
        org.mockito.asm.ByteVector byteVector8 = byteVector0.putShort((int) (byte) -1);
        org.mockito.asm.ByteVector byteVector10 = byteVector0.putLong((long) (short) 0);
        org.junit.Assert.assertNotNull(byteVector2);
        org.junit.Assert.assertNotNull(byteVector4);
        org.junit.Assert.assertNotNull(byteVector6);
        org.junit.Assert.assertNotNull(byteVector8);
        org.junit.Assert.assertNotNull(byteVector10);
    }

    @Test
    public void test1454() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1454");
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
        org.mockito.asm.ByteVector byteVector24 = byteVector20.putByte((int) (short) 100);
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
    public void test1455() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1455");
        org.mockito.asm.ByteVector byteVector0 = new org.mockito.asm.ByteVector();
        org.mockito.asm.ByteVector byteVector2 = byteVector0.putUTF8("hi!");
        org.mockito.asm.ByteVector byteVector4 = byteVector0.putLong((long) ' ');
        org.mockito.asm.ByteVector byteVector6 = byteVector4.putByte((int) 'a');
        org.mockito.asm.ByteVector byteVector8 = byteVector4.putByte((int) (short) -1);
        org.mockito.asm.ByteVector byteVector10 = byteVector4.putLong(0L);
        org.mockito.asm.ByteVector byteVector12 = byteVector10.putByte((int) (short) -1);
        org.mockito.asm.ByteVector byteVector14 = byteVector12.putUTF8("");
        byte[] byteArray15 = null;
        org.mockito.asm.ByteVector byteVector18 = byteVector14.putByteArray(byteArray15, (int) (byte) -1, (int) (byte) 1);
        org.mockito.asm.ByteVector byteVector20 = byteVector18.putInt(100);
        org.junit.Assert.assertNotNull(byteVector2);
        org.junit.Assert.assertNotNull(byteVector4);
        org.junit.Assert.assertNotNull(byteVector6);
        org.junit.Assert.assertNotNull(byteVector8);
        org.junit.Assert.assertNotNull(byteVector10);
        org.junit.Assert.assertNotNull(byteVector12);
        org.junit.Assert.assertNotNull(byteVector14);
        org.junit.Assert.assertNotNull(byteVector18);
        org.junit.Assert.assertNotNull(byteVector20);
    }

    @Test
    public void test1456() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1456");
        org.mockito.asm.ByteVector byteVector1 = new org.mockito.asm.ByteVector((int) '#');
        org.mockito.asm.ByteVector byteVector3 = byteVector1.putLong(100L);
        org.mockito.asm.ByteVector byteVector5 = byteVector1.putUTF8("");
        org.mockito.asm.ByteVector byteVector7 = byteVector1.putUTF8("hi!");
        org.mockito.asm.ByteVector byteVector9 = byteVector7.putLong((long) (short) 0);
        org.mockito.asm.ByteVector byteVector11 = byteVector9.putLong((long) 1);
        org.mockito.asm.ByteVector byteVector13 = byteVector11.putUTF8("hi!");
        org.mockito.asm.ByteVector byteVector15 = byteVector13.putLong((-1L));
        org.junit.Assert.assertNotNull(byteVector3);
        org.junit.Assert.assertNotNull(byteVector5);
        org.junit.Assert.assertNotNull(byteVector7);
        org.junit.Assert.assertNotNull(byteVector9);
        org.junit.Assert.assertNotNull(byteVector11);
        org.junit.Assert.assertNotNull(byteVector13);
        org.junit.Assert.assertNotNull(byteVector15);
    }

    @Test
    public void test1457() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1457");
        org.mockito.asm.ByteVector byteVector0 = new org.mockito.asm.ByteVector();
        org.mockito.asm.ByteVector byteVector2 = byteVector0.putUTF8("hi!");
        org.mockito.asm.ByteVector byteVector4 = byteVector0.putShort((int) (short) -1);
        org.mockito.asm.ByteVector byteVector6 = byteVector0.putInt((int) (byte) 10);
        org.mockito.asm.ByteVector byteVector8 = byteVector0.putUTF8("");
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
    public void test1458() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1458");
        org.mockito.asm.ByteVector byteVector0 = new org.mockito.asm.ByteVector();
        org.mockito.asm.ByteVector byteVector2 = byteVector0.putUTF8("hi!");
        org.mockito.asm.ByteVector byteVector4 = byteVector2.putLong((long) (byte) 10);
        org.mockito.asm.ByteVector byteVector6 = byteVector4.putInt((int) 'a');
        org.mockito.asm.ByteVector byteVector8 = byteVector6.putShort((int) (byte) 0);
        org.mockito.asm.ByteVector byteVector10 = byteVector6.putShort(0);
        org.mockito.asm.ByteVector byteVector12 = byteVector10.putShort(10);
        org.mockito.asm.ByteVector byteVector14 = byteVector10.putByte((int) ' ');
        org.mockito.asm.ByteVector byteVector16 = byteVector14.putByte(10);
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
    public void test1459() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1459");
        org.mockito.asm.ByteVector byteVector0 = new org.mockito.asm.ByteVector();
        org.mockito.asm.ByteVector byteVector2 = byteVector0.putUTF8("hi!");
        org.mockito.asm.ByteVector byteVector4 = byteVector2.putInt(0);
        org.mockito.asm.ByteVector byteVector6 = byteVector4.putShort((int) '4');
        org.mockito.asm.ByteVector byteVector8 = byteVector6.putByte(100);
        org.mockito.asm.ByteVector byteVector10 = byteVector6.putInt((int) (byte) 10);
        org.mockito.asm.ByteVector byteVector12 = byteVector10.putUTF8("");
        org.mockito.asm.ByteVector byteVector14 = byteVector10.putInt(1);
        org.mockito.asm.ByteVector byteVector16 = byteVector14.putInt((int) (short) 10);
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
    public void test1460() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1460");
        org.mockito.asm.ByteVector byteVector0 = new org.mockito.asm.ByteVector();
        org.mockito.asm.ByteVector byteVector2 = byteVector0.putUTF8("hi!");
        org.mockito.asm.ByteVector byteVector4 = byteVector2.putLong((long) (byte) 10);
        org.mockito.asm.ByteVector byteVector6 = byteVector2.putInt((int) (short) 1);
        org.mockito.asm.ByteVector byteVector8 = byteVector2.putLong((long) (short) 10);
        org.mockito.asm.ByteVector byteVector10 = byteVector2.putShort(10);
        org.mockito.asm.ByteVector byteVector12 = byteVector10.putInt((int) (byte) 0);
        org.mockito.asm.ByteVector byteVector14 = byteVector12.putUTF8("");
        org.mockito.asm.ByteVector byteVector16 = byteVector14.putUTF8("hi!");
        org.mockito.asm.ByteVector byteVector18 = byteVector14.putLong((long) 1);
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
    public void test1461() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1461");
        org.mockito.asm.ByteVector byteVector0 = new org.mockito.asm.ByteVector();
        org.mockito.asm.ByteVector byteVector2 = byteVector0.putUTF8("hi!");
        org.mockito.asm.ByteVector byteVector4 = byteVector2.putInt((int) (byte) 10);
        org.mockito.asm.ByteVector byteVector6 = byteVector4.putByte((int) (short) 100);
        org.mockito.asm.ByteVector byteVector8 = byteVector4.putShort((int) (short) 10);
        org.mockito.asm.ByteVector byteVector10 = byteVector8.putShort(0);
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
            org.mockito.asm.ByteVector byteVector51 = byteVector8.putByteArray(byteArray42, (-1), (int) (short) -1);
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
    public void test1462() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1462");
        org.mockito.asm.ByteVector byteVector0 = new org.mockito.asm.ByteVector();
        org.mockito.asm.ByteVector byteVector2 = byteVector0.putUTF8("hi!");
        org.mockito.asm.ByteVector byteVector4 = byteVector0.putLong((long) ' ');
        org.mockito.asm.ByteVector byteVector6 = byteVector4.putByte((int) 'a');
        org.mockito.asm.ByteVector byteVector8 = byteVector4.putByte((int) (short) -1);
        org.mockito.asm.ByteVector byteVector10 = byteVector4.putLong(0L);
        org.mockito.asm.ByteVector byteVector12 = byteVector10.putByte(0);
        org.mockito.asm.ByteVector byteVector14 = byteVector10.putInt((int) (byte) 1);
        org.mockito.asm.ByteVector byteVector16 = byteVector14.putShort((-1));
        org.mockito.asm.ByteVector byteVector18 = byteVector14.putByte((int) (short) -1);
        org.mockito.asm.ByteVector byteVector20 = byteVector18.putInt(0);
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
    public void test1463() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1463");
        org.mockito.asm.ByteVector byteVector0 = new org.mockito.asm.ByteVector();
        org.mockito.asm.ByteVector byteVector2 = byteVector0.putUTF8("hi!");
        org.mockito.asm.ByteVector byteVector4 = byteVector0.putByte((int) (byte) 1);
        org.mockito.asm.ByteVector byteVector6 = byteVector0.putLong((long) (short) 1);
        org.mockito.asm.ByteVector byteVector8 = byteVector6.putUTF8("hi!");
        org.mockito.asm.ByteVector byteVector10 = byteVector8.putLong((long) 10);
        org.junit.Assert.assertNotNull(byteVector2);
        org.junit.Assert.assertNotNull(byteVector4);
        org.junit.Assert.assertNotNull(byteVector6);
        org.junit.Assert.assertNotNull(byteVector8);
        org.junit.Assert.assertNotNull(byteVector10);
    }

    @Test
    public void test1464() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1464");
        org.mockito.asm.ByteVector byteVector0 = new org.mockito.asm.ByteVector();
        org.mockito.asm.ByteVector byteVector2 = byteVector0.putUTF8("hi!");
        org.mockito.asm.ByteVector byteVector4 = byteVector2.putInt(0);
        org.mockito.asm.ByteVector byteVector6 = byteVector4.putByte((int) (byte) 1);
        org.mockito.asm.ByteVector byteVector8 = byteVector4.putByte(0);
        org.mockito.asm.ByteVector byteVector10 = byteVector8.putLong((long) (byte) 1);
        org.mockito.asm.ByteVector byteVector12 = byteVector8.putLong(0L);
        org.junit.Assert.assertNotNull(byteVector2);
        org.junit.Assert.assertNotNull(byteVector4);
        org.junit.Assert.assertNotNull(byteVector6);
        org.junit.Assert.assertNotNull(byteVector8);
        org.junit.Assert.assertNotNull(byteVector10);
        org.junit.Assert.assertNotNull(byteVector12);
    }

    @Test
    public void test1465() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1465");
        org.mockito.asm.ByteVector byteVector0 = new org.mockito.asm.ByteVector();
        org.mockito.asm.ByteVector byteVector2 = byteVector0.putUTF8("hi!");
        org.mockito.asm.ByteVector byteVector4 = byteVector0.putInt(0);
        org.mockito.asm.ByteVector byteVector6 = byteVector4.putInt((int) ' ');
        org.mockito.asm.ByteVector byteVector8 = byteVector6.putLong((long) (short) 10);
        org.mockito.asm.ByteVector byteVector10 = byteVector8.putUTF8("hi!");
        org.mockito.asm.ByteVector byteVector12 = byteVector8.putByte(0);
        org.mockito.asm.ByteVector byteVector14 = byteVector12.putInt((int) (short) 1);
        org.mockito.asm.ByteVector byteVector16 = byteVector12.putLong((-1L));
        org.mockito.asm.ByteVector byteVector18 = byteVector16.putUTF8("");
        org.mockito.asm.ByteVector byteVector20 = byteVector16.putLong(100L);
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
    public void test1466() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1466");
        org.mockito.asm.ByteVector byteVector0 = new org.mockito.asm.ByteVector();
        org.mockito.asm.ByteVector byteVector2 = byteVector0.putUTF8("hi!");
        org.mockito.asm.ByteVector byteVector4 = byteVector2.putLong((long) (byte) 10);
        org.mockito.asm.ByteVector byteVector6 = byteVector4.putInt((int) 'a');
        org.mockito.asm.ByteVector byteVector8 = byteVector6.putShort((int) (byte) 0);
        org.mockito.asm.ByteVector byteVector10 = byteVector8.putUTF8("");
        org.mockito.asm.ByteVector byteVector12 = byteVector10.putInt((int) '#');
        org.junit.Assert.assertNotNull(byteVector2);
        org.junit.Assert.assertNotNull(byteVector4);
        org.junit.Assert.assertNotNull(byteVector6);
        org.junit.Assert.assertNotNull(byteVector8);
        org.junit.Assert.assertNotNull(byteVector10);
        org.junit.Assert.assertNotNull(byteVector12);
    }

    @Test
    public void test1467() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1467");
        org.mockito.asm.ByteVector byteVector0 = new org.mockito.asm.ByteVector();
        org.mockito.asm.ByteVector byteVector2 = byteVector0.putUTF8("hi!");
        org.mockito.asm.ByteVector byteVector4 = byteVector0.putShort((int) (short) 100);
        org.mockito.asm.ByteVector byteVector6 = byteVector4.putUTF8("hi!");
        org.mockito.asm.ByteVector byteVector8 = byteVector6.putByte((int) '4');
        org.mockito.asm.ByteVector byteVector10 = byteVector8.putShort((int) (short) 10);
        org.mockito.asm.ByteVector byteVector12 = byteVector8.putShort(10);
        org.mockito.asm.ByteVector byteVector14 = byteVector8.putShort((int) (byte) 1);
        org.mockito.asm.ByteVector byteVector16 = byteVector14.putByte((int) (short) 10);
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
    public void test1468() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1468");
        org.mockito.asm.ByteVector byteVector0 = new org.mockito.asm.ByteVector();
        org.mockito.asm.ByteVector byteVector2 = byteVector0.putUTF8("hi!");
        org.mockito.asm.ByteVector byteVector4 = byteVector0.putInt(0);
        org.mockito.asm.ByteVector byteVector6 = byteVector0.putShort((int) '4');
        org.mockito.asm.ByteVector byteVector8 = byteVector0.putLong(1L);
        org.mockito.asm.ByteVector byteVector10 = byteVector0.putByte(10);
        org.mockito.asm.ByteVector byteVector12 = byteVector0.putLong((long) (short) -1);
        org.junit.Assert.assertNotNull(byteVector2);
        org.junit.Assert.assertNotNull(byteVector4);
        org.junit.Assert.assertNotNull(byteVector6);
        org.junit.Assert.assertNotNull(byteVector8);
        org.junit.Assert.assertNotNull(byteVector10);
        org.junit.Assert.assertNotNull(byteVector12);
    }

    @Test
    public void test1469() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1469");
        org.mockito.asm.ByteVector byteVector1 = new org.mockito.asm.ByteVector((int) '#');
        org.mockito.asm.ByteVector byteVector3 = byteVector1.putInt(100);
        org.mockito.asm.ByteVector byteVector5 = byteVector3.putShort((int) (short) -1);
        org.mockito.asm.ByteVector byteVector7 = byteVector3.putShort(10);
        org.mockito.asm.ByteVector byteVector9 = byteVector7.putUTF8("");
        org.mockito.asm.ByteVector byteVector11 = byteVector7.putUTF8("");
        org.mockito.asm.ByteVector byteVector13 = byteVector7.putInt((int) (byte) 10);
        java.lang.Class<?> wildcardClass14 = byteVector7.getClass();
        org.junit.Assert.assertNotNull(byteVector3);
        org.junit.Assert.assertNotNull(byteVector5);
        org.junit.Assert.assertNotNull(byteVector7);
        org.junit.Assert.assertNotNull(byteVector9);
        org.junit.Assert.assertNotNull(byteVector11);
        org.junit.Assert.assertNotNull(byteVector13);
        org.junit.Assert.assertNotNull(wildcardClass14);
    }

    @Test
    public void test1470() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1470");
        org.mockito.asm.ByteVector byteVector0 = new org.mockito.asm.ByteVector();
        org.mockito.asm.ByteVector byteVector2 = byteVector0.putUTF8("hi!");
        org.mockito.asm.ByteVector byteVector4 = byteVector2.putInt(0);
        org.mockito.asm.ByteVector byteVector6 = byteVector2.putShort((int) (byte) 10);
        org.mockito.asm.ByteVector byteVector8 = byteVector2.putUTF8("");
        org.mockito.asm.ByteVector byteVector10 = byteVector2.putByte((int) (byte) 1);
        org.mockito.asm.ByteVector byteVector12 = byteVector2.putShort((int) (short) 100);
        org.mockito.asm.ByteVector byteVector14 = byteVector12.putInt((int) (byte) 100);
        org.junit.Assert.assertNotNull(byteVector2);
        org.junit.Assert.assertNotNull(byteVector4);
        org.junit.Assert.assertNotNull(byteVector6);
        org.junit.Assert.assertNotNull(byteVector8);
        org.junit.Assert.assertNotNull(byteVector10);
        org.junit.Assert.assertNotNull(byteVector12);
        org.junit.Assert.assertNotNull(byteVector14);
    }

    @Test
    public void test1471() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1471");
        org.mockito.asm.ByteVector byteVector1 = new org.mockito.asm.ByteVector((int) '#');
        org.mockito.asm.ByteVector byteVector3 = byteVector1.putInt(100);
        org.mockito.asm.ByteVector byteVector5 = byteVector3.putShort((int) '#');
        org.mockito.asm.ByteVector byteVector6 = new org.mockito.asm.ByteVector();
        org.mockito.asm.ByteVector byteVector8 = byteVector6.putUTF8("hi!");
        org.mockito.asm.ByteVector byteVector10 = byteVector8.putInt(0);
        org.mockito.asm.ByteVector byteVector12 = byteVector10.putShort((int) '4');
        org.mockito.asm.ByteVector byteVector14 = byteVector12.putByte(100);
        org.mockito.asm.ByteVector byteVector16 = byteVector12.putInt((int) (byte) 10);
        org.mockito.asm.ByteVector byteVector18 = byteVector16.putUTF8("");
        org.mockito.asm.ByteVector byteVector20 = byteVector16.putInt(1);
        org.mockito.asm.ByteVector byteVector21 = new org.mockito.asm.ByteVector();
        org.mockito.asm.ByteVector byteVector23 = byteVector21.putUTF8("hi!");
        org.mockito.asm.ByteVector byteVector25 = byteVector23.putInt(0);
        org.mockito.asm.ByteVector byteVector27 = byteVector25.putByte((int) (short) 0);
        org.mockito.asm.ByteVector byteVector29 = byteVector25.putUTF8("");
        org.mockito.asm.ByteVector byteVector30 = new org.mockito.asm.ByteVector();
        org.mockito.asm.ByteVector byteVector32 = byteVector30.putUTF8("hi!");
        org.mockito.asm.ByteVector byteVector34 = byteVector30.putInt(0);
        org.mockito.asm.ByteVector byteVector36 = byteVector30.putShort((int) '4');
        org.mockito.asm.ByteVector byteVector38 = byteVector30.putByte(100);
        org.mockito.asm.ByteVector byteVector40 = byteVector38.putInt((int) (byte) 10);
        org.mockito.asm.ByteVector byteVector42 = byteVector38.putInt((int) (byte) 10);
        org.mockito.asm.ByteVector byteVector44 = byteVector42.putByte(100);
        org.mockito.asm.ByteVector byteVector45 = new org.mockito.asm.ByteVector();
        org.mockito.asm.ByteVector byteVector47 = byteVector45.putUTF8("hi!");
        org.mockito.asm.ByteVector byteVector49 = byteVector45.putInt(0);
        org.mockito.asm.ByteVector byteVector51 = byteVector49.putInt((int) ' ');
        org.mockito.asm.ByteVector byteVector53 = byteVector51.putLong(100L);
        byte[] byteArray57 = new byte[] { (byte) 0, (byte) 10, (byte) 1 };
        org.mockito.asm.ByteVector byteVector60 = byteVector51.putByteArray(byteArray57, 0, 0);
        org.mockito.asm.ByteVector byteVector63 = byteVector44.putByteArray(byteArray57, (int) (byte) 1, (int) (byte) 0);
        org.mockito.asm.ByteVector byteVector66 = byteVector25.putByteArray(byteArray57, (int) (short) 0, 0);
        org.mockito.asm.ByteVector byteVector69 = byteVector20.putByteArray(byteArray57, 0, 0);
        // The following exception was thrown during execution in test generation
        try {
            org.mockito.asm.ByteVector byteVector72 = byteVector3.putByteArray(byteArray57, (int) '4', (int) (short) 10);
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
        org.junit.Assert.assertNotNull(byteVector47);
        org.junit.Assert.assertNotNull(byteVector49);
        org.junit.Assert.assertNotNull(byteVector51);
        org.junit.Assert.assertNotNull(byteVector53);
        org.junit.Assert.assertNotNull(byteArray57);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray57), "[0, 10, 1]");
        org.junit.Assert.assertNotNull(byteVector60);
        org.junit.Assert.assertNotNull(byteVector63);
        org.junit.Assert.assertNotNull(byteVector66);
        org.junit.Assert.assertNotNull(byteVector69);
    }

    @Test
    public void test1472() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1472");
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
        org.mockito.asm.ByteVector byteVector20 = byteVector18.putLong((long) '#');
        org.mockito.asm.ByteVector byteVector21 = new org.mockito.asm.ByteVector();
        org.mockito.asm.ByteVector byteVector23 = byteVector21.putUTF8("hi!");
        org.mockito.asm.ByteVector byteVector25 = byteVector21.putInt(0);
        org.mockito.asm.ByteVector byteVector27 = byteVector25.putByte((int) (byte) -1);
        org.mockito.asm.ByteVector byteVector29 = byteVector25.putShort((int) '4');
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
            org.mockito.asm.ByteVector byteVector62 = byteVector18.putByteArray(byteArray53, (int) (byte) 1, (int) ' ');
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
    public void test1473() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1473");
        org.mockito.asm.ByteVector byteVector0 = new org.mockito.asm.ByteVector();
        org.mockito.asm.ByteVector byteVector2 = byteVector0.putUTF8("hi!");
        org.mockito.asm.ByteVector byteVector4 = byteVector2.putLong((long) (byte) 10);
        org.mockito.asm.ByteVector byteVector6 = byteVector4.putUTF8("hi!");
        org.mockito.asm.ByteVector byteVector8 = byteVector4.putLong((long) (short) -1);
        org.mockito.asm.ByteVector byteVector10 = byteVector8.putInt(10);
        org.mockito.asm.ByteVector byteVector12 = byteVector8.putByte((int) (short) 1);
        org.mockito.asm.ByteVector byteVector14 = byteVector12.putShort((int) (short) 100);
        org.mockito.asm.ByteVector byteVector16 = byteVector14.putByte(0);
        org.mockito.asm.ByteVector byteVector18 = byteVector16.putUTF8("hi!");
        org.mockito.asm.ByteVector byteVector20 = byteVector18.putByte((int) (short) -1);
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
    public void test1474() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1474");
        org.mockito.asm.ByteVector byteVector0 = new org.mockito.asm.ByteVector();
        org.mockito.asm.ByteVector byteVector2 = byteVector0.putUTF8("hi!");
        org.mockito.asm.ByteVector byteVector4 = byteVector0.putShort((int) (short) -1);
        org.mockito.asm.ByteVector byteVector6 = byteVector0.putLong(0L);
        org.mockito.asm.ByteVector byteVector8 = byteVector0.putShort((int) (byte) -1);
        org.mockito.asm.ByteVector byteVector10 = byteVector0.putShort((int) '4');
        org.mockito.asm.ByteVector byteVector12 = byteVector0.putLong(100L);
        org.mockito.asm.ByteVector byteVector14 = byteVector12.putInt((-1));
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
    public void test1475() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1475");
        org.mockito.asm.ByteVector byteVector1 = new org.mockito.asm.ByteVector((int) '#');
        org.mockito.asm.ByteVector byteVector3 = byteVector1.putLong(100L);
        org.mockito.asm.ByteVector byteVector5 = byteVector1.putUTF8("");
        org.mockito.asm.ByteVector byteVector7 = byteVector1.putUTF8("hi!");
        org.mockito.asm.ByteVector byteVector9 = byteVector7.putLong((long) (short) 0);
        org.mockito.asm.ByteVector byteVector11 = byteVector9.putLong((long) 1);
        org.mockito.asm.ByteVector byteVector13 = byteVector11.putInt(10);
        org.mockito.asm.ByteVector byteVector15 = byteVector13.putUTF8("");
        java.lang.Class<?> wildcardClass16 = byteVector15.getClass();
        org.junit.Assert.assertNotNull(byteVector3);
        org.junit.Assert.assertNotNull(byteVector5);
        org.junit.Assert.assertNotNull(byteVector7);
        org.junit.Assert.assertNotNull(byteVector9);
        org.junit.Assert.assertNotNull(byteVector11);
        org.junit.Assert.assertNotNull(byteVector13);
        org.junit.Assert.assertNotNull(byteVector15);
        org.junit.Assert.assertNotNull(wildcardClass16);
    }

    @Test
    public void test1476() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1476");
        org.mockito.asm.ByteVector byteVector0 = new org.mockito.asm.ByteVector();
        org.mockito.asm.ByteVector byteVector2 = byteVector0.putUTF8("hi!");
        org.mockito.asm.ByteVector byteVector4 = byteVector0.putShort((int) (short) -1);
        org.mockito.asm.ByteVector byteVector6 = byteVector0.putInt(0);
        org.mockito.asm.ByteVector byteVector8 = byteVector0.putUTF8("hi!");
        org.mockito.asm.ByteVector byteVector10 = byteVector0.putByte(100);
        org.mockito.asm.ByteVector byteVector12 = byteVector10.putUTF8("hi!");
        org.mockito.asm.ByteVector byteVector14 = byteVector10.putByte(0);
        org.mockito.asm.ByteVector byteVector15 = new org.mockito.asm.ByteVector();
        org.mockito.asm.ByteVector byteVector17 = byteVector15.putUTF8("hi!");
        org.mockito.asm.ByteVector byteVector19 = byteVector17.putByte(100);
        org.mockito.asm.ByteVector byteVector21 = byteVector17.putLong((long) 10);
        org.mockito.asm.ByteVector byteVector23 = byteVector17.putShort((int) (short) -1);
        org.mockito.asm.ByteVector byteVector24 = new org.mockito.asm.ByteVector();
        org.mockito.asm.ByteVector byteVector26 = byteVector24.putUTF8("hi!");
        org.mockito.asm.ByteVector byteVector28 = byteVector24.putLong((long) ' ');
        org.mockito.asm.ByteVector byteVector30 = byteVector28.putByte((int) 'a');
        org.mockito.asm.ByteVector byteVector32 = byteVector28.putByte((int) (short) -1);
        org.mockito.asm.ByteVector byteVector34 = byteVector28.putLong(0L);
        org.mockito.asm.ByteVector byteVector36 = byteVector34.putByte(0);
        org.mockito.asm.ByteVector byteVector38 = byteVector36.putByte(100);
        org.mockito.asm.ByteVector byteVector40 = byteVector36.putByte((int) '4');
        org.mockito.asm.ByteVector byteVector42 = byteVector40.putUTF8("hi!");
        org.mockito.asm.ByteVector byteVector44 = byteVector40.putShort(100);
        org.mockito.asm.ByteVector byteVector46 = byteVector40.putShort((int) (short) 100);
        org.mockito.asm.ByteVector byteVector47 = new org.mockito.asm.ByteVector();
        org.mockito.asm.ByteVector byteVector49 = byteVector47.putUTF8("hi!");
        org.mockito.asm.ByteVector byteVector51 = byteVector47.putInt(0);
        org.mockito.asm.ByteVector byteVector53 = byteVector47.putShort((int) '4');
        org.mockito.asm.ByteVector byteVector55 = byteVector47.putByte(100);
        org.mockito.asm.ByteVector byteVector57 = byteVector55.putInt((int) (byte) 10);
        org.mockito.asm.ByteVector byteVector59 = byteVector55.putInt((int) (byte) 10);
        org.mockito.asm.ByteVector byteVector61 = byteVector59.putByte(100);
        org.mockito.asm.ByteVector byteVector62 = new org.mockito.asm.ByteVector();
        org.mockito.asm.ByteVector byteVector64 = byteVector62.putUTF8("hi!");
        org.mockito.asm.ByteVector byteVector66 = byteVector62.putInt(0);
        org.mockito.asm.ByteVector byteVector68 = byteVector66.putInt((int) ' ');
        org.mockito.asm.ByteVector byteVector70 = byteVector68.putLong(100L);
        byte[] byteArray74 = new byte[] { (byte) 0, (byte) 10, (byte) 1 };
        org.mockito.asm.ByteVector byteVector77 = byteVector68.putByteArray(byteArray74, 0, 0);
        org.mockito.asm.ByteVector byteVector80 = byteVector61.putByteArray(byteArray74, (int) (byte) 1, (int) (byte) 0);
        org.mockito.asm.ByteVector byteVector83 = byteVector46.putByteArray(byteArray74, 1, (int) (byte) 1);
        org.mockito.asm.ByteVector byteVector86 = byteVector17.putByteArray(byteArray74, 1, 1);
        // The following exception was thrown during execution in test generation
        try {
            org.mockito.asm.ByteVector byteVector89 = byteVector14.putByteArray(byteArray74, 0, (int) (byte) 10);
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
        org.junit.Assert.assertNotNull(byteVector26);
        org.junit.Assert.assertNotNull(byteVector28);
        org.junit.Assert.assertNotNull(byteVector30);
        org.junit.Assert.assertNotNull(byteVector32);
        org.junit.Assert.assertNotNull(byteVector34);
        org.junit.Assert.assertNotNull(byteVector36);
        org.junit.Assert.assertNotNull(byteVector38);
        org.junit.Assert.assertNotNull(byteVector40);
        org.junit.Assert.assertNotNull(byteVector42);
        org.junit.Assert.assertNotNull(byteVector44);
        org.junit.Assert.assertNotNull(byteVector46);
        org.junit.Assert.assertNotNull(byteVector49);
        org.junit.Assert.assertNotNull(byteVector51);
        org.junit.Assert.assertNotNull(byteVector53);
        org.junit.Assert.assertNotNull(byteVector55);
        org.junit.Assert.assertNotNull(byteVector57);
        org.junit.Assert.assertNotNull(byteVector59);
        org.junit.Assert.assertNotNull(byteVector61);
        org.junit.Assert.assertNotNull(byteVector64);
        org.junit.Assert.assertNotNull(byteVector66);
        org.junit.Assert.assertNotNull(byteVector68);
        org.junit.Assert.assertNotNull(byteVector70);
        org.junit.Assert.assertNotNull(byteArray74);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray74), "[0, 10, 1]");
        org.junit.Assert.assertNotNull(byteVector77);
        org.junit.Assert.assertNotNull(byteVector80);
        org.junit.Assert.assertNotNull(byteVector83);
        org.junit.Assert.assertNotNull(byteVector86);
    }

    @Test
    public void test1477() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1477");
        org.mockito.asm.ByteVector byteVector1 = new org.mockito.asm.ByteVector((int) (byte) 100);
        org.mockito.asm.ByteVector byteVector3 = byteVector1.putInt(0);
        org.mockito.asm.ByteVector byteVector5 = byteVector1.putShort((int) (short) 10);
        org.mockito.asm.ByteVector byteVector7 = byteVector1.putShort((int) '#');
        java.lang.Class<?> wildcardClass8 = byteVector7.getClass();
        org.junit.Assert.assertNotNull(byteVector3);
        org.junit.Assert.assertNotNull(byteVector5);
        org.junit.Assert.assertNotNull(byteVector7);
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test1478() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1478");
        org.mockito.asm.ByteVector byteVector0 = new org.mockito.asm.ByteVector();
        org.mockito.asm.ByteVector byteVector2 = byteVector0.putUTF8("hi!");
        org.mockito.asm.ByteVector byteVector4 = byteVector2.putLong((long) (byte) 10);
        org.mockito.asm.ByteVector byteVector6 = byteVector4.putUTF8("hi!");
        org.mockito.asm.ByteVector byteVector8 = byteVector4.putLong((-1L));
        org.mockito.asm.ByteVector byteVector10 = byteVector8.putInt(10);
        org.mockito.asm.ByteVector byteVector12 = byteVector10.putShort((-1));
        org.mockito.asm.ByteVector byteVector14 = byteVector12.putInt((-1));
        org.mockito.asm.ByteVector byteVector16 = byteVector12.putLong((long) 100);
        org.mockito.asm.ByteVector byteVector18 = byteVector16.putByte((int) (byte) -1);
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
    public void test1479() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1479");
        org.mockito.asm.ByteVector byteVector0 = new org.mockito.asm.ByteVector();
        org.mockito.asm.ByteVector byteVector2 = byteVector0.putUTF8("hi!");
        org.mockito.asm.ByteVector byteVector4 = byteVector2.putInt(0);
        org.mockito.asm.ByteVector byteVector6 = byteVector2.putByte((int) (byte) 10);
        org.mockito.asm.ByteVector byteVector8 = byteVector6.putLong((-1L));
        org.mockito.asm.ByteVector byteVector10 = byteVector6.putInt((int) (byte) 100);
        org.mockito.asm.ByteVector byteVector12 = byteVector6.putUTF8("hi!");
        org.mockito.asm.ByteVector byteVector14 = byteVector12.putUTF8("hi!");
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
    public void test1480() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1480");
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
        org.mockito.asm.ByteVector byteVector52 = byteVector50.putShort((int) (byte) 1);
        org.mockito.asm.ByteVector byteVector54 = byteVector50.putLong((long) (byte) -1);
        org.mockito.asm.ByteVector byteVector56 = byteVector54.putUTF8("hi!");
        java.lang.Class<?> wildcardClass57 = byteVector56.getClass();
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
        org.junit.Assert.assertNotNull(byteVector52);
        org.junit.Assert.assertNotNull(byteVector54);
        org.junit.Assert.assertNotNull(byteVector56);
        org.junit.Assert.assertNotNull(wildcardClass57);
    }

    @Test
    public void test1481() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1481");
        org.mockito.asm.ByteVector byteVector1 = new org.mockito.asm.ByteVector((int) '#');
        org.mockito.asm.ByteVector byteVector3 = byteVector1.putInt(100);
        org.mockito.asm.ByteVector byteVector5 = byteVector3.putShort((int) (short) -1);
        org.mockito.asm.ByteVector byteVector7 = byteVector5.putShort((int) (short) 0);
        org.mockito.asm.ByteVector byteVector9 = byteVector5.putUTF8("");
        org.mockito.asm.ByteVector byteVector11 = byteVector5.putUTF8("");
        java.lang.Class<?> wildcardClass12 = byteVector5.getClass();
        org.junit.Assert.assertNotNull(byteVector3);
        org.junit.Assert.assertNotNull(byteVector5);
        org.junit.Assert.assertNotNull(byteVector7);
        org.junit.Assert.assertNotNull(byteVector9);
        org.junit.Assert.assertNotNull(byteVector11);
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test1482() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1482");
        org.mockito.asm.ByteVector byteVector0 = new org.mockito.asm.ByteVector();
        org.mockito.asm.ByteVector byteVector2 = byteVector0.putUTF8("hi!");
        org.mockito.asm.ByteVector byteVector4 = byteVector0.putLong((long) ' ');
        org.mockito.asm.ByteVector byteVector6 = byteVector4.putByte((int) 'a');
        org.mockito.asm.ByteVector byteVector8 = byteVector4.putByte((int) (short) -1);
        org.mockito.asm.ByteVector byteVector10 = byteVector4.putLong(0L);
        org.mockito.asm.ByteVector byteVector12 = byteVector10.putByte(0);
        org.mockito.asm.ByteVector byteVector14 = byteVector12.putByte(100);
        org.mockito.asm.ByteVector byteVector16 = byteVector14.putInt(100);
        org.mockito.asm.ByteVector byteVector18 = byteVector16.putByte(10);
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
    public void test1483() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1483");
        org.mockito.asm.ByteVector byteVector1 = new org.mockito.asm.ByteVector((int) '#');
        org.mockito.asm.ByteVector byteVector3 = byteVector1.putInt(100);
        org.mockito.asm.ByteVector byteVector5 = byteVector1.putInt((int) (byte) 1);
        org.mockito.asm.ByteVector byteVector7 = byteVector5.putLong(10L);
        org.mockito.asm.ByteVector byteVector9 = byteVector7.putByte((int) 'a');
        org.mockito.asm.ByteVector byteVector10 = new org.mockito.asm.ByteVector();
        org.mockito.asm.ByteVector byteVector12 = byteVector10.putUTF8("hi!");
        org.mockito.asm.ByteVector byteVector14 = byteVector12.putInt(0);
        org.mockito.asm.ByteVector byteVector16 = byteVector14.putShort(1);
        org.mockito.asm.ByteVector byteVector17 = new org.mockito.asm.ByteVector();
        org.mockito.asm.ByteVector byteVector19 = byteVector17.putUTF8("hi!");
        org.mockito.asm.ByteVector byteVector21 = byteVector17.putShort((int) (short) -1);
        org.mockito.asm.ByteVector byteVector23 = byteVector17.putLong(0L);
        org.mockito.asm.ByteVector byteVector25 = byteVector17.putShort((int) (byte) -1);
        org.mockito.asm.ByteVector byteVector27 = byteVector25.putByte((int) (byte) 0);
        org.mockito.asm.ByteVector byteVector28 = new org.mockito.asm.ByteVector();
        org.mockito.asm.ByteVector byteVector30 = byteVector28.putUTF8("hi!");
        org.mockito.asm.ByteVector byteVector32 = byteVector28.putLong((long) ' ');
        org.mockito.asm.ByteVector byteVector34 = byteVector32.putByte((int) 'a');
        org.mockito.asm.ByteVector byteVector36 = byteVector32.putByte((int) (short) -1);
        org.mockito.asm.ByteVector byteVector38 = byteVector32.putLong(0L);
        org.mockito.asm.ByteVector byteVector40 = byteVector38.putByte(0);
        org.mockito.asm.ByteVector byteVector42 = byteVector40.putByte(100);
        org.mockito.asm.ByteVector byteVector44 = byteVector40.putByte((int) '4');
        org.mockito.asm.ByteVector byteVector46 = byteVector44.putUTF8("hi!");
        org.mockito.asm.ByteVector byteVector48 = byteVector44.putShort(100);
        org.mockito.asm.ByteVector byteVector50 = byteVector44.putShort((int) (short) 100);
        org.mockito.asm.ByteVector byteVector51 = new org.mockito.asm.ByteVector();
        org.mockito.asm.ByteVector byteVector53 = byteVector51.putUTF8("hi!");
        org.mockito.asm.ByteVector byteVector55 = byteVector51.putInt(0);
        org.mockito.asm.ByteVector byteVector57 = byteVector51.putShort((int) '4');
        org.mockito.asm.ByteVector byteVector59 = byteVector51.putByte(100);
        org.mockito.asm.ByteVector byteVector61 = byteVector59.putInt((int) (byte) 10);
        org.mockito.asm.ByteVector byteVector63 = byteVector59.putInt((int) (byte) 10);
        org.mockito.asm.ByteVector byteVector65 = byteVector63.putByte(100);
        org.mockito.asm.ByteVector byteVector66 = new org.mockito.asm.ByteVector();
        org.mockito.asm.ByteVector byteVector68 = byteVector66.putUTF8("hi!");
        org.mockito.asm.ByteVector byteVector70 = byteVector66.putInt(0);
        org.mockito.asm.ByteVector byteVector72 = byteVector70.putInt((int) ' ');
        org.mockito.asm.ByteVector byteVector74 = byteVector72.putLong(100L);
        byte[] byteArray78 = new byte[] { (byte) 0, (byte) 10, (byte) 1 };
        org.mockito.asm.ByteVector byteVector81 = byteVector72.putByteArray(byteArray78, 0, 0);
        org.mockito.asm.ByteVector byteVector84 = byteVector65.putByteArray(byteArray78, (int) (byte) 1, (int) (byte) 0);
        org.mockito.asm.ByteVector byteVector87 = byteVector50.putByteArray(byteArray78, 1, (int) (byte) 1);
        org.mockito.asm.ByteVector byteVector90 = byteVector27.putByteArray(byteArray78, (int) (byte) 1, 0);
        org.mockito.asm.ByteVector byteVector93 = byteVector14.putByteArray(byteArray78, 0, (int) (short) 0);
        // The following exception was thrown during execution in test generation
        try {
            org.mockito.asm.ByteVector byteVector96 = byteVector9.putByteArray(byteArray78, (int) (short) -1, (int) (byte) -1);
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
        org.junit.Assert.assertNotNull(byteVector19);
        org.junit.Assert.assertNotNull(byteVector21);
        org.junit.Assert.assertNotNull(byteVector23);
        org.junit.Assert.assertNotNull(byteVector25);
        org.junit.Assert.assertNotNull(byteVector27);
        org.junit.Assert.assertNotNull(byteVector30);
        org.junit.Assert.assertNotNull(byteVector32);
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
        org.junit.Assert.assertNotNull(byteVector61);
        org.junit.Assert.assertNotNull(byteVector63);
        org.junit.Assert.assertNotNull(byteVector65);
        org.junit.Assert.assertNotNull(byteVector68);
        org.junit.Assert.assertNotNull(byteVector70);
        org.junit.Assert.assertNotNull(byteVector72);
        org.junit.Assert.assertNotNull(byteVector74);
        org.junit.Assert.assertNotNull(byteArray78);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray78), "[0, 10, 1]");
        org.junit.Assert.assertNotNull(byteVector81);
        org.junit.Assert.assertNotNull(byteVector84);
        org.junit.Assert.assertNotNull(byteVector87);
        org.junit.Assert.assertNotNull(byteVector90);
        org.junit.Assert.assertNotNull(byteVector93);
    }

    @Test
    public void test1484() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1484");
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
        org.mockito.asm.ByteVector byteVector20 = byteVector18.putUTF8("hi!");
        org.mockito.asm.ByteVector byteVector22 = byteVector20.putLong((long) (-1));
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
    public void test1485() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1485");
        org.mockito.asm.ByteVector byteVector0 = new org.mockito.asm.ByteVector();
        org.mockito.asm.ByteVector byteVector2 = byteVector0.putUTF8("hi!");
        org.mockito.asm.ByteVector byteVector4 = byteVector2.putLong((long) (byte) 10);
        org.mockito.asm.ByteVector byteVector6 = byteVector4.putUTF8("hi!");
        org.mockito.asm.ByteVector byteVector8 = byteVector4.putLong((long) (short) -1);
        org.mockito.asm.ByteVector byteVector10 = byteVector8.putInt(10);
        org.mockito.asm.ByteVector byteVector12 = byteVector8.putByte((int) (short) 1);
        org.mockito.asm.ByteVector byteVector14 = byteVector12.putShort((int) (short) 100);
        org.mockito.asm.ByteVector byteVector16 = byteVector14.putUTF8("hi!");
        org.mockito.asm.ByteVector byteVector18 = byteVector14.putByte((int) '#');
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
    public void test1486() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1486");
        org.mockito.asm.ByteVector byteVector1 = new org.mockito.asm.ByteVector((int) (byte) 1);
        org.mockito.asm.ByteVector byteVector3 = byteVector1.putByte((int) (byte) 10);
        org.mockito.asm.ByteVector byteVector5 = byteVector1.putLong(1L);
        org.mockito.asm.ByteVector byteVector7 = byteVector1.putByte((int) '#');
        org.mockito.asm.ByteVector byteVector9 = byteVector7.putShort(100);
        byte[] byteArray10 = null;
        org.mockito.asm.ByteVector byteVector13 = byteVector9.putByteArray(byteArray10, (-1), 10);
        org.mockito.asm.ByteVector byteVector15 = byteVector9.putShort((int) (byte) 100);
        org.mockito.asm.ByteVector byteVector17 = byteVector15.putLong((long) (byte) 1);
        org.junit.Assert.assertNotNull(byteVector3);
        org.junit.Assert.assertNotNull(byteVector5);
        org.junit.Assert.assertNotNull(byteVector7);
        org.junit.Assert.assertNotNull(byteVector9);
        org.junit.Assert.assertNotNull(byteVector13);
        org.junit.Assert.assertNotNull(byteVector15);
        org.junit.Assert.assertNotNull(byteVector17);
    }

    @Test
    public void test1487() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1487");
        org.mockito.asm.ByteVector byteVector0 = new org.mockito.asm.ByteVector();
        org.mockito.asm.ByteVector byteVector2 = byteVector0.putUTF8("hi!");
        org.mockito.asm.ByteVector byteVector4 = byteVector2.putInt(0);
        org.mockito.asm.ByteVector byteVector6 = byteVector4.putByte((int) (short) 0);
        org.mockito.asm.ByteVector byteVector8 = new org.mockito.asm.ByteVector((int) (byte) 10);
        org.mockito.asm.ByteVector byteVector10 = byteVector8.putByte((int) '4');
        org.mockito.asm.ByteVector byteVector12 = byteVector8.putLong(0L);
        org.mockito.asm.ByteVector byteVector14 = byteVector12.putByte(10);
        org.mockito.asm.ByteVector byteVector16 = byteVector12.putUTF8("hi!");
        org.mockito.asm.ByteVector byteVector18 = byteVector16.putLong((long) (byte) 0);
        byte[] byteArray19 = null;
        org.mockito.asm.ByteVector byteVector22 = byteVector18.putByteArray(byteArray19, (int) (short) 10, (int) '#');
        org.mockito.asm.ByteVector byteVector23 = new org.mockito.asm.ByteVector();
        org.mockito.asm.ByteVector byteVector25 = byteVector23.putUTF8("hi!");
        org.mockito.asm.ByteVector byteVector27 = byteVector23.putLong((long) ' ');
        org.mockito.asm.ByteVector byteVector29 = byteVector27.putByte((int) 'a');
        org.mockito.asm.ByteVector byteVector31 = byteVector27.putByte((int) (short) -1);
        org.mockito.asm.ByteVector byteVector33 = byteVector27.putLong(0L);
        org.mockito.asm.ByteVector byteVector35 = byteVector33.putByte(0);
        org.mockito.asm.ByteVector byteVector37 = byteVector35.putByte(100);
        org.mockito.asm.ByteVector byteVector39 = byteVector35.putByte((int) '4');
        org.mockito.asm.ByteVector byteVector41 = byteVector39.putUTF8("hi!");
        org.mockito.asm.ByteVector byteVector43 = byteVector39.putShort(100);
        org.mockito.asm.ByteVector byteVector45 = byteVector39.putShort((int) (short) 100);
        org.mockito.asm.ByteVector byteVector46 = new org.mockito.asm.ByteVector();
        org.mockito.asm.ByteVector byteVector48 = byteVector46.putUTF8("hi!");
        org.mockito.asm.ByteVector byteVector50 = byteVector46.putInt(0);
        org.mockito.asm.ByteVector byteVector52 = byteVector46.putShort((int) '4');
        org.mockito.asm.ByteVector byteVector54 = byteVector46.putByte(100);
        org.mockito.asm.ByteVector byteVector56 = byteVector54.putInt((int) (byte) 10);
        org.mockito.asm.ByteVector byteVector58 = byteVector54.putInt((int) (byte) 10);
        org.mockito.asm.ByteVector byteVector60 = byteVector58.putByte(100);
        org.mockito.asm.ByteVector byteVector61 = new org.mockito.asm.ByteVector();
        org.mockito.asm.ByteVector byteVector63 = byteVector61.putUTF8("hi!");
        org.mockito.asm.ByteVector byteVector65 = byteVector61.putInt(0);
        org.mockito.asm.ByteVector byteVector67 = byteVector65.putInt((int) ' ');
        org.mockito.asm.ByteVector byteVector69 = byteVector67.putLong(100L);
        byte[] byteArray73 = new byte[] { (byte) 0, (byte) 10, (byte) 1 };
        org.mockito.asm.ByteVector byteVector76 = byteVector67.putByteArray(byteArray73, 0, 0);
        org.mockito.asm.ByteVector byteVector79 = byteVector60.putByteArray(byteArray73, (int) (byte) 1, (int) (byte) 0);
        org.mockito.asm.ByteVector byteVector82 = byteVector45.putByteArray(byteArray73, 1, (int) (byte) 1);
        org.mockito.asm.ByteVector byteVector85 = byteVector18.putByteArray(byteArray73, 0, (int) (byte) 1);
        // The following exception was thrown during execution in test generation
        try {
            org.mockito.asm.ByteVector byteVector88 = byteVector4.putByteArray(byteArray73, 10, 10);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteVector2);
        org.junit.Assert.assertNotNull(byteVector4);
        org.junit.Assert.assertNotNull(byteVector6);
        org.junit.Assert.assertNotNull(byteVector10);
        org.junit.Assert.assertNotNull(byteVector12);
        org.junit.Assert.assertNotNull(byteVector14);
        org.junit.Assert.assertNotNull(byteVector16);
        org.junit.Assert.assertNotNull(byteVector18);
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
        org.junit.Assert.assertNotNull(byteVector43);
        org.junit.Assert.assertNotNull(byteVector45);
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
        org.junit.Assert.assertNotNull(byteVector85);
    }

    @Test
    public void test1488() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1488");
        org.mockito.asm.ByteVector byteVector0 = new org.mockito.asm.ByteVector();
        org.mockito.asm.ByteVector byteVector2 = byteVector0.putUTF8("hi!");
        org.mockito.asm.ByteVector byteVector4 = byteVector2.putInt(0);
        org.mockito.asm.ByteVector byteVector6 = byteVector2.putByte((int) (byte) 10);
        org.mockito.asm.ByteVector byteVector8 = byteVector6.putUTF8("hi!");
        org.mockito.asm.ByteVector byteVector10 = byteVector6.putShort((int) ' ');
        org.mockito.asm.ByteVector byteVector12 = byteVector10.putLong((long) (short) 1);
        org.mockito.asm.ByteVector byteVector14 = byteVector10.putInt((-1));
        org.junit.Assert.assertNotNull(byteVector2);
        org.junit.Assert.assertNotNull(byteVector4);
        org.junit.Assert.assertNotNull(byteVector6);
        org.junit.Assert.assertNotNull(byteVector8);
        org.junit.Assert.assertNotNull(byteVector10);
        org.junit.Assert.assertNotNull(byteVector12);
        org.junit.Assert.assertNotNull(byteVector14);
    }

    @Test
    public void test1489() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1489");
        org.mockito.asm.ByteVector byteVector0 = new org.mockito.asm.ByteVector();
        org.mockito.asm.ByteVector byteVector2 = byteVector0.putUTF8("hi!");
        org.mockito.asm.ByteVector byteVector4 = byteVector2.putLong((long) (byte) 10);
        org.mockito.asm.ByteVector byteVector6 = byteVector4.putUTF8("hi!");
        org.mockito.asm.ByteVector byteVector8 = byteVector4.putShort((int) '4');
        org.mockito.asm.ByteVector byteVector10 = byteVector4.putLong((long) 0);
        org.mockito.asm.ByteVector byteVector12 = byteVector4.putUTF8("");
        org.junit.Assert.assertNotNull(byteVector2);
        org.junit.Assert.assertNotNull(byteVector4);
        org.junit.Assert.assertNotNull(byteVector6);
        org.junit.Assert.assertNotNull(byteVector8);
        org.junit.Assert.assertNotNull(byteVector10);
        org.junit.Assert.assertNotNull(byteVector12);
    }

    @Test
    public void test1490() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1490");
        org.mockito.asm.ByteVector byteVector0 = new org.mockito.asm.ByteVector();
        org.mockito.asm.ByteVector byteVector2 = byteVector0.putUTF8("hi!");
        org.mockito.asm.ByteVector byteVector4 = byteVector2.putLong((long) (byte) 10);
        org.mockito.asm.ByteVector byteVector6 = byteVector4.putUTF8("hi!");
        org.mockito.asm.ByteVector byteVector8 = byteVector4.putInt((int) (byte) 100);
        org.mockito.asm.ByteVector byteVector10 = byteVector4.putUTF8("hi!");
        org.mockito.asm.ByteVector byteVector12 = byteVector10.putShort(0);
        org.mockito.asm.ByteVector byteVector14 = byteVector12.putInt((int) (byte) -1);
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
    public void test1491() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1491");
        org.mockito.asm.ByteVector byteVector0 = new org.mockito.asm.ByteVector();
        org.mockito.asm.ByteVector byteVector2 = byteVector0.putUTF8("hi!");
        org.mockito.asm.ByteVector byteVector4 = byteVector2.putInt(0);
        org.mockito.asm.ByteVector byteVector6 = byteVector2.putByte((int) (byte) 10);
        org.mockito.asm.ByteVector byteVector8 = byteVector6.putUTF8("hi!");
        org.mockito.asm.ByteVector byteVector10 = byteVector8.putShort(100);
        org.mockito.asm.ByteVector byteVector12 = byteVector8.putUTF8("");
        org.mockito.asm.ByteVector byteVector13 = new org.mockito.asm.ByteVector();
        org.mockito.asm.ByteVector byteVector15 = byteVector13.putUTF8("hi!");
        org.mockito.asm.ByteVector byteVector17 = byteVector15.putByte(100);
        org.mockito.asm.ByteVector byteVector19 = byteVector15.putLong((long) 10);
        org.mockito.asm.ByteVector byteVector21 = byteVector15.putShort((int) (short) -1);
        org.mockito.asm.ByteVector byteVector22 = new org.mockito.asm.ByteVector();
        org.mockito.asm.ByteVector byteVector24 = byteVector22.putUTF8("hi!");
        org.mockito.asm.ByteVector byteVector26 = byteVector22.putLong((long) ' ');
        org.mockito.asm.ByteVector byteVector28 = byteVector26.putByte((int) 'a');
        org.mockito.asm.ByteVector byteVector30 = byteVector26.putByte((int) (short) -1);
        org.mockito.asm.ByteVector byteVector32 = byteVector26.putLong(0L);
        org.mockito.asm.ByteVector byteVector34 = byteVector32.putByte(0);
        org.mockito.asm.ByteVector byteVector36 = byteVector34.putByte(100);
        org.mockito.asm.ByteVector byteVector38 = byteVector34.putByte((int) '4');
        org.mockito.asm.ByteVector byteVector40 = byteVector38.putUTF8("hi!");
        org.mockito.asm.ByteVector byteVector42 = byteVector38.putShort(100);
        org.mockito.asm.ByteVector byteVector44 = byteVector38.putShort((int) (short) 100);
        org.mockito.asm.ByteVector byteVector45 = new org.mockito.asm.ByteVector();
        org.mockito.asm.ByteVector byteVector47 = byteVector45.putUTF8("hi!");
        org.mockito.asm.ByteVector byteVector49 = byteVector45.putInt(0);
        org.mockito.asm.ByteVector byteVector51 = byteVector45.putShort((int) '4');
        org.mockito.asm.ByteVector byteVector53 = byteVector45.putByte(100);
        org.mockito.asm.ByteVector byteVector55 = byteVector53.putInt((int) (byte) 10);
        org.mockito.asm.ByteVector byteVector57 = byteVector53.putInt((int) (byte) 10);
        org.mockito.asm.ByteVector byteVector59 = byteVector57.putByte(100);
        org.mockito.asm.ByteVector byteVector60 = new org.mockito.asm.ByteVector();
        org.mockito.asm.ByteVector byteVector62 = byteVector60.putUTF8("hi!");
        org.mockito.asm.ByteVector byteVector64 = byteVector60.putInt(0);
        org.mockito.asm.ByteVector byteVector66 = byteVector64.putInt((int) ' ');
        org.mockito.asm.ByteVector byteVector68 = byteVector66.putLong(100L);
        byte[] byteArray72 = new byte[] { (byte) 0, (byte) 10, (byte) 1 };
        org.mockito.asm.ByteVector byteVector75 = byteVector66.putByteArray(byteArray72, 0, 0);
        org.mockito.asm.ByteVector byteVector78 = byteVector59.putByteArray(byteArray72, (int) (byte) 1, (int) (byte) 0);
        org.mockito.asm.ByteVector byteVector81 = byteVector44.putByteArray(byteArray72, 1, (int) (byte) 1);
        org.mockito.asm.ByteVector byteVector84 = byteVector15.putByteArray(byteArray72, 1, 1);
        // The following exception was thrown during execution in test generation
        try {
            org.mockito.asm.ByteVector byteVector87 = byteVector8.putByteArray(byteArray72, (int) 'a', 100);
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
        org.junit.Assert.assertNotNull(byteVector38);
        org.junit.Assert.assertNotNull(byteVector40);
        org.junit.Assert.assertNotNull(byteVector42);
        org.junit.Assert.assertNotNull(byteVector44);
        org.junit.Assert.assertNotNull(byteVector47);
        org.junit.Assert.assertNotNull(byteVector49);
        org.junit.Assert.assertNotNull(byteVector51);
        org.junit.Assert.assertNotNull(byteVector53);
        org.junit.Assert.assertNotNull(byteVector55);
        org.junit.Assert.assertNotNull(byteVector57);
        org.junit.Assert.assertNotNull(byteVector59);
        org.junit.Assert.assertNotNull(byteVector62);
        org.junit.Assert.assertNotNull(byteVector64);
        org.junit.Assert.assertNotNull(byteVector66);
        org.junit.Assert.assertNotNull(byteVector68);
        org.junit.Assert.assertNotNull(byteArray72);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray72), "[0, 10, 1]");
        org.junit.Assert.assertNotNull(byteVector75);
        org.junit.Assert.assertNotNull(byteVector78);
        org.junit.Assert.assertNotNull(byteVector81);
        org.junit.Assert.assertNotNull(byteVector84);
    }

    @Test
    public void test1492() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1492");
        org.mockito.asm.ByteVector byteVector0 = new org.mockito.asm.ByteVector();
        org.mockito.asm.ByteVector byteVector2 = byteVector0.putUTF8("hi!");
        org.mockito.asm.ByteVector byteVector4 = byteVector0.putInt(0);
        org.mockito.asm.ByteVector byteVector6 = byteVector0.putShort(10);
        java.lang.Class<?> wildcardClass7 = byteVector0.getClass();
        org.junit.Assert.assertNotNull(byteVector2);
        org.junit.Assert.assertNotNull(byteVector4);
        org.junit.Assert.assertNotNull(byteVector6);
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test1493() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1493");
        org.mockito.asm.ByteVector byteVector0 = new org.mockito.asm.ByteVector();
        org.mockito.asm.ByteVector byteVector2 = byteVector0.putUTF8("hi!");
        org.mockito.asm.ByteVector byteVector4 = byteVector0.putInt(0);
        org.mockito.asm.ByteVector byteVector6 = byteVector4.putInt((int) ' ');
        org.mockito.asm.ByteVector byteVector8 = byteVector6.putLong((long) (short) 10);
        org.mockito.asm.ByteVector byteVector10 = byteVector8.putUTF8("hi!");
        org.mockito.asm.ByteVector byteVector12 = byteVector8.putByte(0);
        org.mockito.asm.ByteVector byteVector14 = byteVector12.putInt((int) (short) 1);
        org.mockito.asm.ByteVector byteVector16 = byteVector12.putLong((-1L));
        org.mockito.asm.ByteVector byteVector18 = byteVector16.putUTF8("");
        org.mockito.asm.ByteVector byteVector20 = byteVector18.putInt(1);
        org.mockito.asm.ByteVector byteVector22 = byteVector20.putByte((int) (short) -1);
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
    public void test1494() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1494");
        org.mockito.asm.ByteVector byteVector0 = new org.mockito.asm.ByteVector();
        org.mockito.asm.ByteVector byteVector2 = byteVector0.putUTF8("hi!");
        org.mockito.asm.ByteVector byteVector4 = byteVector0.putByte((int) (byte) 1);
        org.mockito.asm.ByteVector byteVector6 = byteVector0.putLong((long) (short) 1);
        org.mockito.asm.ByteVector byteVector8 = byteVector0.putShort((int) (byte) 100);
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
        org.mockito.asm.ByteVector byteVector41 = byteVector8.putByteArray(byteArray32, 1, 1);
        org.mockito.asm.ByteVector byteVector43 = byteVector41.putByte(10);
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
    }

    @Test
    public void test1495() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1495");
        org.mockito.asm.ByteVector byteVector0 = new org.mockito.asm.ByteVector();
        org.mockito.asm.ByteVector byteVector2 = byteVector0.putUTF8("hi!");
        org.mockito.asm.ByteVector byteVector4 = byteVector0.putInt(0);
        org.mockito.asm.ByteVector byteVector6 = byteVector4.putInt((int) ' ');
        org.mockito.asm.ByteVector byteVector8 = byteVector6.putLong((long) (short) 10);
        org.mockito.asm.ByteVector byteVector10 = byteVector8.putLong((long) 'a');
        org.mockito.asm.ByteVector byteVector12 = byteVector10.putByte((int) '#');
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
    public void test1496() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1496");
        org.mockito.asm.ByteVector byteVector1 = new org.mockito.asm.ByteVector((int) '#');
        org.mockito.asm.ByteVector byteVector3 = byteVector1.putUTF8("hi!");
        org.mockito.asm.ByteVector byteVector5 = byteVector3.putShort((int) (byte) 1);
        org.mockito.asm.ByteVector byteVector7 = byteVector3.putByte((int) ' ');
        org.junit.Assert.assertNotNull(byteVector3);
        org.junit.Assert.assertNotNull(byteVector5);
        org.junit.Assert.assertNotNull(byteVector7);
    }

    @Test
    public void test1497() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1497");
        org.mockito.asm.ByteVector byteVector1 = new org.mockito.asm.ByteVector((int) '#');
        org.mockito.asm.ByteVector byteVector3 = byteVector1.putLong(100L);
        org.mockito.asm.ByteVector byteVector5 = byteVector1.putInt((int) ' ');
        org.mockito.asm.ByteVector byteVector7 = byteVector1.putInt((int) ' ');
        org.junit.Assert.assertNotNull(byteVector3);
        org.junit.Assert.assertNotNull(byteVector5);
        org.junit.Assert.assertNotNull(byteVector7);
    }

    @Test
    public void test1498() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1498");
        org.mockito.asm.ByteVector byteVector0 = new org.mockito.asm.ByteVector();
        org.mockito.asm.ByteVector byteVector2 = byteVector0.putUTF8("hi!");
        org.mockito.asm.ByteVector byteVector4 = byteVector0.putLong((long) ' ');
        org.mockito.asm.ByteVector byteVector6 = byteVector4.putByte((int) 'a');
        org.mockito.asm.ByteVector byteVector8 = byteVector6.putInt((int) (short) 0);
        org.mockito.asm.ByteVector byteVector10 = byteVector8.putUTF8("");
        org.mockito.asm.ByteVector byteVector12 = byteVector8.putUTF8("hi!");
        org.mockito.asm.ByteVector byteVector14 = byteVector8.putByte((int) (byte) 0);
        org.junit.Assert.assertNotNull(byteVector2);
        org.junit.Assert.assertNotNull(byteVector4);
        org.junit.Assert.assertNotNull(byteVector6);
        org.junit.Assert.assertNotNull(byteVector8);
        org.junit.Assert.assertNotNull(byteVector10);
        org.junit.Assert.assertNotNull(byteVector12);
        org.junit.Assert.assertNotNull(byteVector14);
    }

    @Test
    public void test1499() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1499");
        org.mockito.asm.ByteVector byteVector0 = new org.mockito.asm.ByteVector();
        org.mockito.asm.ByteVector byteVector2 = byteVector0.putUTF8("hi!");
        org.mockito.asm.ByteVector byteVector4 = byteVector0.putLong((long) ' ');
        org.mockito.asm.ByteVector byteVector6 = byteVector4.putByte((int) 'a');
        org.mockito.asm.ByteVector byteVector8 = byteVector4.putByte((int) (short) -1);
        org.mockito.asm.ByteVector byteVector10 = byteVector4.putLong(0L);
        org.mockito.asm.ByteVector byteVector12 = byteVector4.putUTF8("hi!");
        org.mockito.asm.ByteVector byteVector14 = byteVector12.putUTF8("hi!");
        org.mockito.asm.ByteVector byteVector16 = byteVector12.putLong(1L);
        byte[] byteArray17 = null;
        org.mockito.asm.ByteVector byteVector20 = byteVector12.putByteArray(byteArray17, 100, 0);
        org.junit.Assert.assertNotNull(byteVector2);
        org.junit.Assert.assertNotNull(byteVector4);
        org.junit.Assert.assertNotNull(byteVector6);
        org.junit.Assert.assertNotNull(byteVector8);
        org.junit.Assert.assertNotNull(byteVector10);
        org.junit.Assert.assertNotNull(byteVector12);
        org.junit.Assert.assertNotNull(byteVector14);
        org.junit.Assert.assertNotNull(byteVector16);
        org.junit.Assert.assertNotNull(byteVector20);
    }

    @Test
    public void test1500() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1500");
        org.mockito.asm.ByteVector byteVector1 = new org.mockito.asm.ByteVector((int) '4');
        org.mockito.asm.ByteVector byteVector3 = byteVector1.putByte((int) (short) 1);
        org.mockito.asm.ByteVector byteVector5 = byteVector1.putUTF8("");
        org.mockito.asm.ByteVector byteVector7 = byteVector1.putUTF8("");
        org.mockito.asm.ByteVector byteVector9 = byteVector7.putShort((int) (short) -1);
        org.junit.Assert.assertNotNull(byteVector3);
        org.junit.Assert.assertNotNull(byteVector5);
        org.junit.Assert.assertNotNull(byteVector7);
        org.junit.Assert.assertNotNull(byteVector9);
    }
}

