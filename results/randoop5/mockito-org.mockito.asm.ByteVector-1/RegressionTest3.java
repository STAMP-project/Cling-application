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
        org.mockito.asm.ByteVector byteVector0 = new org.mockito.asm.ByteVector();
        org.mockito.asm.ByteVector byteVector2 = byteVector0.putUTF8("hi!");
        org.mockito.asm.ByteVector byteVector4 = byteVector2.putLong((long) (byte) 10);
        org.mockito.asm.ByteVector byteVector6 = byteVector4.putUTF8("hi!");
        org.mockito.asm.ByteVector byteVector8 = byteVector4.putLong((long) (short) -1);
        org.mockito.asm.ByteVector byteVector10 = byteVector8.putInt(10);
        org.mockito.asm.ByteVector byteVector12 = byteVector8.putByte((int) (short) 1);
        org.mockito.asm.ByteVector byteVector14 = byteVector8.putInt((int) (short) -1);
        org.mockito.asm.ByteVector byteVector16 = byteVector8.putUTF8("hi!");
        org.mockito.asm.ByteVector byteVector18 = byteVector8.putLong((-1L));
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
    public void test1502() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1502");
        org.mockito.asm.ByteVector byteVector0 = new org.mockito.asm.ByteVector();
        org.mockito.asm.ByteVector byteVector2 = byteVector0.putUTF8("hi!");
        org.mockito.asm.ByteVector byteVector4 = byteVector0.putInt(0);
        org.mockito.asm.ByteVector byteVector6 = byteVector0.putShort((int) '4');
        org.mockito.asm.ByteVector byteVector8 = byteVector6.putInt((int) (short) 0);
        org.mockito.asm.ByteVector byteVector10 = byteVector8.putShort((int) (byte) 0);
        org.mockito.asm.ByteVector byteVector12 = byteVector10.putShort(100);
        org.junit.Assert.assertNotNull(byteVector2);
        org.junit.Assert.assertNotNull(byteVector4);
        org.junit.Assert.assertNotNull(byteVector6);
        org.junit.Assert.assertNotNull(byteVector8);
        org.junit.Assert.assertNotNull(byteVector10);
        org.junit.Assert.assertNotNull(byteVector12);
    }

    @Test
    public void test1503() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1503");
        org.mockito.asm.ByteVector byteVector1 = new org.mockito.asm.ByteVector((int) (byte) 1);
        org.mockito.asm.ByteVector byteVector3 = byteVector1.putByte((int) (byte) 10);
        org.mockito.asm.ByteVector byteVector5 = byteVector3.putShort((int) (short) 10);
        org.mockito.asm.ByteVector byteVector7 = byteVector5.putShort((int) (byte) 1);
        org.mockito.asm.ByteVector byteVector9 = byteVector7.putShort((int) (byte) 10);
        org.mockito.asm.ByteVector byteVector11 = byteVector9.putInt((int) '4');
        org.mockito.asm.ByteVector byteVector13 = byteVector11.putShort(10);
        org.mockito.asm.ByteVector byteVector15 = byteVector13.putByte((int) 'a');
        org.junit.Assert.assertNotNull(byteVector3);
        org.junit.Assert.assertNotNull(byteVector5);
        org.junit.Assert.assertNotNull(byteVector7);
        org.junit.Assert.assertNotNull(byteVector9);
        org.junit.Assert.assertNotNull(byteVector11);
        org.junit.Assert.assertNotNull(byteVector13);
        org.junit.Assert.assertNotNull(byteVector15);
    }

    @Test
    public void test1504() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1504");
        org.mockito.asm.ByteVector byteVector0 = new org.mockito.asm.ByteVector();
        org.mockito.asm.ByteVector byteVector2 = byteVector0.putUTF8("hi!");
        org.mockito.asm.ByteVector byteVector4 = byteVector2.putLong((long) (byte) 10);
        org.mockito.asm.ByteVector byteVector6 = byteVector4.putUTF8("hi!");
        org.mockito.asm.ByteVector byteVector8 = byteVector4.putLong((-1L));
        org.mockito.asm.ByteVector byteVector10 = byteVector8.putInt(10);
        org.mockito.asm.ByteVector byteVector12 = byteVector10.putShort((-1));
        org.mockito.asm.ByteVector byteVector14 = byteVector12.putLong((long) (byte) 10);
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
    public void test1505() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1505");
        org.mockito.asm.ByteVector byteVector1 = new org.mockito.asm.ByteVector((int) '#');
        org.mockito.asm.ByteVector byteVector3 = byteVector1.putUTF8("hi!");
        org.mockito.asm.ByteVector byteVector5 = byteVector1.putUTF8("");
        org.mockito.asm.ByteVector byteVector7 = byteVector5.putUTF8("hi!");
        org.mockito.asm.ByteVector byteVector9 = byteVector7.putByte((int) '4');
        org.junit.Assert.assertNotNull(byteVector3);
        org.junit.Assert.assertNotNull(byteVector5);
        org.junit.Assert.assertNotNull(byteVector7);
        org.junit.Assert.assertNotNull(byteVector9);
    }

    @Test
    public void test1506() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1506");
        org.mockito.asm.ByteVector byteVector0 = new org.mockito.asm.ByteVector();
        org.mockito.asm.ByteVector byteVector2 = byteVector0.putUTF8("hi!");
        org.mockito.asm.ByteVector byteVector4 = byteVector2.putInt((int) (byte) 10);
        org.mockito.asm.ByteVector byteVector6 = byteVector4.putUTF8("");
        org.mockito.asm.ByteVector byteVector8 = byteVector6.putUTF8("hi!");
        org.mockito.asm.ByteVector byteVector10 = byteVector6.putInt((int) (byte) 1);
        org.mockito.asm.ByteVector byteVector12 = byteVector6.putUTF8("");
        org.mockito.asm.ByteVector byteVector14 = byteVector6.putInt(1);
        org.mockito.asm.ByteVector byteVector16 = byteVector14.putShort((int) '4');
        org.mockito.asm.ByteVector byteVector18 = byteVector16.putLong((long) '#');
        org.mockito.asm.ByteVector byteVector20 = byteVector16.putLong((long) (byte) 0);
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
    public void test1507() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1507");
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
        org.mockito.asm.ByteVector byteVector22 = byteVector18.putInt((int) (short) 0);
        org.mockito.asm.ByteVector byteVector23 = new org.mockito.asm.ByteVector();
        org.mockito.asm.ByteVector byteVector25 = byteVector23.putUTF8("hi!");
        org.mockito.asm.ByteVector byteVector27 = byteVector25.putInt(0);
        org.mockito.asm.ByteVector byteVector29 = byteVector27.putByte((int) (short) 0);
        org.mockito.asm.ByteVector byteVector31 = byteVector27.putUTF8("");
        org.mockito.asm.ByteVector byteVector32 = new org.mockito.asm.ByteVector();
        org.mockito.asm.ByteVector byteVector34 = byteVector32.putUTF8("hi!");
        org.mockito.asm.ByteVector byteVector36 = byteVector32.putInt(0);
        org.mockito.asm.ByteVector byteVector38 = byteVector32.putShort((int) '4');
        org.mockito.asm.ByteVector byteVector40 = byteVector32.putByte(100);
        org.mockito.asm.ByteVector byteVector42 = byteVector40.putInt((int) (byte) 10);
        org.mockito.asm.ByteVector byteVector44 = byteVector40.putInt((int) (byte) 10);
        org.mockito.asm.ByteVector byteVector46 = byteVector44.putByte(100);
        org.mockito.asm.ByteVector byteVector47 = new org.mockito.asm.ByteVector();
        org.mockito.asm.ByteVector byteVector49 = byteVector47.putUTF8("hi!");
        org.mockito.asm.ByteVector byteVector51 = byteVector47.putInt(0);
        org.mockito.asm.ByteVector byteVector53 = byteVector51.putInt((int) ' ');
        org.mockito.asm.ByteVector byteVector55 = byteVector53.putLong(100L);
        byte[] byteArray59 = new byte[] { (byte) 0, (byte) 10, (byte) 1 };
        org.mockito.asm.ByteVector byteVector62 = byteVector53.putByteArray(byteArray59, 0, 0);
        org.mockito.asm.ByteVector byteVector65 = byteVector46.putByteArray(byteArray59, (int) (byte) 1, (int) (byte) 0);
        org.mockito.asm.ByteVector byteVector68 = byteVector27.putByteArray(byteArray59, (int) (short) 0, 0);
        // The following exception was thrown during execution in test generation
        try {
            org.mockito.asm.ByteVector byteVector71 = byteVector22.putByteArray(byteArray59, (int) (byte) 1, (int) (byte) 10);
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
        org.junit.Assert.assertNotNull(byteArray59);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray59), "[0, 10, 1]");
        org.junit.Assert.assertNotNull(byteVector62);
        org.junit.Assert.assertNotNull(byteVector65);
        org.junit.Assert.assertNotNull(byteVector68);
    }

    @Test
    public void test1508() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1508");
        org.mockito.asm.ByteVector byteVector0 = new org.mockito.asm.ByteVector();
        org.mockito.asm.ByteVector byteVector2 = byteVector0.putUTF8("hi!");
        org.mockito.asm.ByteVector byteVector4 = byteVector2.putInt((int) (byte) 10);
        org.mockito.asm.ByteVector byteVector6 = byteVector2.putLong((long) 10);
        org.mockito.asm.ByteVector byteVector8 = byteVector2.putUTF8("");
        java.lang.Class<?> wildcardClass9 = byteVector8.getClass();
        org.junit.Assert.assertNotNull(byteVector2);
        org.junit.Assert.assertNotNull(byteVector4);
        org.junit.Assert.assertNotNull(byteVector6);
        org.junit.Assert.assertNotNull(byteVector8);
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test1509() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1509");
        org.mockito.asm.ByteVector byteVector0 = new org.mockito.asm.ByteVector();
        org.mockito.asm.ByteVector byteVector2 = byteVector0.putUTF8("hi!");
        org.mockito.asm.ByteVector byteVector4 = byteVector2.putInt(0);
        org.mockito.asm.ByteVector byteVector6 = byteVector2.putByte((int) (byte) 10);
        org.mockito.asm.ByteVector byteVector8 = byteVector6.putUTF8("hi!");
        org.mockito.asm.ByteVector byteVector10 = byteVector8.putUTF8("hi!");
        org.mockito.asm.ByteVector byteVector12 = byteVector10.putByte((int) (short) -1);
        org.mockito.asm.ByteVector byteVector14 = byteVector12.putLong((long) (short) 10);
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
    public void test1510() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1510");
        org.mockito.asm.ByteVector byteVector0 = new org.mockito.asm.ByteVector();
        org.mockito.asm.ByteVector byteVector2 = byteVector0.putUTF8("hi!");
        org.mockito.asm.ByteVector byteVector4 = byteVector2.putByte(100);
        org.mockito.asm.ByteVector byteVector6 = byteVector2.putShort((int) 'a');
        org.mockito.asm.ByteVector byteVector8 = byteVector6.putByte((int) (short) 1);
        org.mockito.asm.ByteVector byteVector10 = byteVector8.putLong((long) 0);
        org.mockito.asm.ByteVector byteVector12 = byteVector10.putLong((long) (byte) -1);
        org.mockito.asm.ByteVector byteVector14 = byteVector10.putByte((int) 'a');
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
    public void test1511() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1511");
        org.mockito.asm.ByteVector byteVector0 = new org.mockito.asm.ByteVector();
        org.mockito.asm.ByteVector byteVector2 = byteVector0.putUTF8("hi!");
        org.mockito.asm.ByteVector byteVector4 = byteVector0.putByte((int) (byte) 1);
        org.mockito.asm.ByteVector byteVector6 = byteVector0.putLong((long) (short) 1);
        org.mockito.asm.ByteVector byteVector8 = byteVector0.putLong((long) ' ');
        org.mockito.asm.ByteVector byteVector10 = byteVector0.putUTF8("");
        org.mockito.asm.ByteVector byteVector12 = byteVector10.putInt((int) ' ');
        org.mockito.asm.ByteVector byteVector14 = byteVector10.putByte((int) (short) 0);
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
    public void test1512() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1512");
        org.mockito.asm.ByteVector byteVector1 = new org.mockito.asm.ByteVector((int) '#');
        org.mockito.asm.ByteVector byteVector3 = byteVector1.putUTF8("hi!");
        org.mockito.asm.ByteVector byteVector5 = byteVector1.putUTF8("");
        org.mockito.asm.ByteVector byteVector7 = byteVector5.putUTF8("hi!");
        org.mockito.asm.ByteVector byteVector9 = byteVector5.putLong(1L);
        org.mockito.asm.ByteVector byteVector11 = byteVector5.putInt(1);
        org.junit.Assert.assertNotNull(byteVector3);
        org.junit.Assert.assertNotNull(byteVector5);
        org.junit.Assert.assertNotNull(byteVector7);
        org.junit.Assert.assertNotNull(byteVector9);
        org.junit.Assert.assertNotNull(byteVector11);
    }

    @Test
    public void test1513() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1513");
        org.mockito.asm.ByteVector byteVector0 = new org.mockito.asm.ByteVector();
        org.mockito.asm.ByteVector byteVector2 = byteVector0.putUTF8("hi!");
        org.mockito.asm.ByteVector byteVector4 = byteVector0.putInt(0);
        org.mockito.asm.ByteVector byteVector6 = byteVector4.putInt((int) ' ');
        org.mockito.asm.ByteVector byteVector8 = byteVector6.putLong((long) (short) 10);
        org.mockito.asm.ByteVector byteVector10 = byteVector8.putUTF8("hi!");
        org.mockito.asm.ByteVector byteVector12 = byteVector8.putByte(0);
        org.mockito.asm.ByteVector byteVector14 = byteVector12.putInt((int) (short) 1);
        org.mockito.asm.ByteVector byteVector16 = byteVector12.putInt((-1));
        org.mockito.asm.ByteVector byteVector18 = byteVector12.putLong((long) (short) 1);
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
    public void test1514() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1514");
        org.mockito.asm.ByteVector byteVector0 = new org.mockito.asm.ByteVector();
        org.mockito.asm.ByteVector byteVector2 = byteVector0.putUTF8("hi!");
        org.mockito.asm.ByteVector byteVector4 = byteVector2.putInt(0);
        org.mockito.asm.ByteVector byteVector6 = byteVector2.putByte((int) (byte) 10);
        org.mockito.asm.ByteVector byteVector8 = byteVector6.putLong(0L);
        org.mockito.asm.ByteVector byteVector10 = byteVector8.putShort((int) 'a');
        org.mockito.asm.ByteVector byteVector12 = byteVector8.putInt((int) (byte) 1);
        org.mockito.asm.ByteVector byteVector14 = byteVector12.putInt((-1));
        org.junit.Assert.assertNotNull(byteVector2);
        org.junit.Assert.assertNotNull(byteVector4);
        org.junit.Assert.assertNotNull(byteVector6);
        org.junit.Assert.assertNotNull(byteVector8);
        org.junit.Assert.assertNotNull(byteVector10);
        org.junit.Assert.assertNotNull(byteVector12);
        org.junit.Assert.assertNotNull(byteVector14);
    }

    @Test
    public void test1515() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1515");
        org.mockito.asm.ByteVector byteVector0 = new org.mockito.asm.ByteVector();
        org.mockito.asm.ByteVector byteVector2 = byteVector0.putUTF8("hi!");
        org.mockito.asm.ByteVector byteVector4 = byteVector2.putLong((long) (byte) 10);
        org.mockito.asm.ByteVector byteVector6 = byteVector4.putUTF8("hi!");
        org.mockito.asm.ByteVector byteVector8 = byteVector4.putLong((-1L));
        org.mockito.asm.ByteVector byteVector10 = byteVector8.putInt(10);
        org.mockito.asm.ByteVector byteVector12 = byteVector8.putShort((int) (byte) 0);
        org.mockito.asm.ByteVector byteVector14 = byteVector12.putUTF8("hi!");
        org.mockito.asm.ByteVector byteVector16 = byteVector14.putByte((int) (byte) 1);
        org.mockito.asm.ByteVector byteVector18 = byteVector14.putLong((long) (short) 0);
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
    public void test1516() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1516");
        org.mockito.asm.ByteVector byteVector0 = new org.mockito.asm.ByteVector();
        org.mockito.asm.ByteVector byteVector2 = byteVector0.putUTF8("hi!");
        org.mockito.asm.ByteVector byteVector4 = byteVector0.putInt(0);
        org.mockito.asm.ByteVector byteVector6 = byteVector4.putInt((int) ' ');
        org.mockito.asm.ByteVector byteVector8 = byteVector6.putLong((long) (short) 10);
        org.mockito.asm.ByteVector byteVector10 = byteVector8.putLong((long) 'a');
        org.mockito.asm.ByteVector byteVector12 = byteVector10.putByte((int) (short) 10);
        org.mockito.asm.ByteVector byteVector14 = byteVector10.putInt(10);
        org.mockito.asm.ByteVector byteVector16 = byteVector10.putShort((int) (byte) -1);
        org.mockito.asm.ByteVector byteVector18 = new org.mockito.asm.ByteVector((int) (byte) 10);
        org.mockito.asm.ByteVector byteVector20 = byteVector18.putByte((int) '4');
        org.mockito.asm.ByteVector byteVector22 = byteVector18.putLong(0L);
        org.mockito.asm.ByteVector byteVector24 = byteVector22.putByte(10);
        org.mockito.asm.ByteVector byteVector26 = byteVector22.putUTF8("hi!");
        org.mockito.asm.ByteVector byteVector28 = byteVector26.putLong((long) (byte) 0);
        byte[] byteArray29 = null;
        org.mockito.asm.ByteVector byteVector32 = byteVector28.putByteArray(byteArray29, (int) (short) 10, (int) '#');
        org.mockito.asm.ByteVector byteVector33 = new org.mockito.asm.ByteVector();
        org.mockito.asm.ByteVector byteVector35 = byteVector33.putUTF8("hi!");
        org.mockito.asm.ByteVector byteVector37 = byteVector33.putLong((long) ' ');
        org.mockito.asm.ByteVector byteVector39 = byteVector37.putByte((int) 'a');
        org.mockito.asm.ByteVector byteVector41 = byteVector37.putByte((int) (short) -1);
        org.mockito.asm.ByteVector byteVector43 = byteVector37.putLong(0L);
        org.mockito.asm.ByteVector byteVector45 = byteVector43.putByte(0);
        org.mockito.asm.ByteVector byteVector47 = byteVector45.putByte(100);
        org.mockito.asm.ByteVector byteVector49 = byteVector45.putByte((int) '4');
        org.mockito.asm.ByteVector byteVector51 = byteVector49.putUTF8("hi!");
        org.mockito.asm.ByteVector byteVector53 = byteVector49.putShort(100);
        org.mockito.asm.ByteVector byteVector55 = byteVector49.putShort((int) (short) 100);
        org.mockito.asm.ByteVector byteVector56 = new org.mockito.asm.ByteVector();
        org.mockito.asm.ByteVector byteVector58 = byteVector56.putUTF8("hi!");
        org.mockito.asm.ByteVector byteVector60 = byteVector56.putInt(0);
        org.mockito.asm.ByteVector byteVector62 = byteVector56.putShort((int) '4');
        org.mockito.asm.ByteVector byteVector64 = byteVector56.putByte(100);
        org.mockito.asm.ByteVector byteVector66 = byteVector64.putInt((int) (byte) 10);
        org.mockito.asm.ByteVector byteVector68 = byteVector64.putInt((int) (byte) 10);
        org.mockito.asm.ByteVector byteVector70 = byteVector68.putByte(100);
        org.mockito.asm.ByteVector byteVector71 = new org.mockito.asm.ByteVector();
        org.mockito.asm.ByteVector byteVector73 = byteVector71.putUTF8("hi!");
        org.mockito.asm.ByteVector byteVector75 = byteVector71.putInt(0);
        org.mockito.asm.ByteVector byteVector77 = byteVector75.putInt((int) ' ');
        org.mockito.asm.ByteVector byteVector79 = byteVector77.putLong(100L);
        byte[] byteArray83 = new byte[] { (byte) 0, (byte) 10, (byte) 1 };
        org.mockito.asm.ByteVector byteVector86 = byteVector77.putByteArray(byteArray83, 0, 0);
        org.mockito.asm.ByteVector byteVector89 = byteVector70.putByteArray(byteArray83, (int) (byte) 1, (int) (byte) 0);
        org.mockito.asm.ByteVector byteVector92 = byteVector55.putByteArray(byteArray83, 1, (int) (byte) 1);
        org.mockito.asm.ByteVector byteVector95 = byteVector28.putByteArray(byteArray83, 0, (int) (byte) 1);
        // The following exception was thrown during execution in test generation
        try {
            org.mockito.asm.ByteVector byteVector98 = byteVector16.putByteArray(byteArray83, 0, (int) '4');
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
        org.junit.Assert.assertNotNull(byteVector32);
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
        org.junit.Assert.assertNotNull(byteVector55);
        org.junit.Assert.assertNotNull(byteVector58);
        org.junit.Assert.assertNotNull(byteVector60);
        org.junit.Assert.assertNotNull(byteVector62);
        org.junit.Assert.assertNotNull(byteVector64);
        org.junit.Assert.assertNotNull(byteVector66);
        org.junit.Assert.assertNotNull(byteVector68);
        org.junit.Assert.assertNotNull(byteVector70);
        org.junit.Assert.assertNotNull(byteVector73);
        org.junit.Assert.assertNotNull(byteVector75);
        org.junit.Assert.assertNotNull(byteVector77);
        org.junit.Assert.assertNotNull(byteVector79);
        org.junit.Assert.assertNotNull(byteArray83);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray83), "[0, 10, 1]");
        org.junit.Assert.assertNotNull(byteVector86);
        org.junit.Assert.assertNotNull(byteVector89);
        org.junit.Assert.assertNotNull(byteVector92);
        org.junit.Assert.assertNotNull(byteVector95);
    }

    @Test
    public void test1517() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1517");
        org.mockito.asm.ByteVector byteVector0 = new org.mockito.asm.ByteVector();
        org.mockito.asm.ByteVector byteVector2 = byteVector0.putUTF8("hi!");
        org.mockito.asm.ByteVector byteVector4 = byteVector2.putLong((long) (byte) 10);
        org.mockito.asm.ByteVector byteVector6 = byteVector4.putUTF8("hi!");
        org.mockito.asm.ByteVector byteVector8 = byteVector4.putInt((int) (byte) 100);
        org.mockito.asm.ByteVector byteVector10 = byteVector4.putUTF8("hi!");
        org.mockito.asm.ByteVector byteVector12 = byteVector10.putShort(0);
        org.mockito.asm.ByteVector byteVector14 = byteVector12.putLong((long) (byte) 1);
        org.mockito.asm.ByteVector byteVector16 = byteVector14.putInt(0);
        org.mockito.asm.ByteVector byteVector18 = byteVector16.putUTF8("hi!");
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
    public void test1518() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1518");
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
    public void test1519() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1519");
        org.mockito.asm.ByteVector byteVector1 = new org.mockito.asm.ByteVector((int) (byte) 100);
        org.mockito.asm.ByteVector byteVector3 = byteVector1.putShort((int) (short) 100);
        org.mockito.asm.ByteVector byteVector5 = byteVector1.putByte((int) (byte) 10);
        org.mockito.asm.ByteVector byteVector7 = byteVector5.putByte((int) '4');
        org.mockito.asm.ByteVector byteVector9 = byteVector5.putLong((long) 'a');
        org.mockito.asm.ByteVector byteVector11 = byteVector9.putInt((int) (byte) 10);
        org.junit.Assert.assertNotNull(byteVector3);
        org.junit.Assert.assertNotNull(byteVector5);
        org.junit.Assert.assertNotNull(byteVector7);
        org.junit.Assert.assertNotNull(byteVector9);
        org.junit.Assert.assertNotNull(byteVector11);
    }

    @Test
    public void test1520() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1520");
        org.mockito.asm.ByteVector byteVector1 = new org.mockito.asm.ByteVector((int) '#');
        org.mockito.asm.ByteVector byteVector3 = byteVector1.putLong(100L);
        org.mockito.asm.ByteVector byteVector5 = byteVector3.putLong(1L);
        org.mockito.asm.ByteVector byteVector7 = byteVector5.putUTF8("hi!");
        org.mockito.asm.ByteVector byteVector9 = byteVector7.putUTF8("");
        org.mockito.asm.ByteVector byteVector11 = byteVector7.putInt((int) (short) 1);
        org.mockito.asm.ByteVector byteVector13 = byteVector11.putUTF8("hi!");
        org.mockito.asm.ByteVector byteVector15 = byteVector11.putUTF8("");
        org.mockito.asm.ByteVector byteVector17 = byteVector15.putInt((int) (short) 1);
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
    public void test1521() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1521");
        org.mockito.asm.ByteVector byteVector1 = new org.mockito.asm.ByteVector((int) '#');
        org.mockito.asm.ByteVector byteVector3 = byteVector1.putInt(100);
        org.mockito.asm.ByteVector byteVector5 = byteVector1.putUTF8("");
        org.mockito.asm.ByteVector byteVector7 = byteVector5.putShort(0);
        org.junit.Assert.assertNotNull(byteVector3);
        org.junit.Assert.assertNotNull(byteVector5);
        org.junit.Assert.assertNotNull(byteVector7);
    }

    @Test
    public void test1522() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1522");
        org.mockito.asm.ByteVector byteVector0 = new org.mockito.asm.ByteVector();
        org.mockito.asm.ByteVector byteVector2 = byteVector0.putUTF8("hi!");
        org.mockito.asm.ByteVector byteVector4 = byteVector0.putLong((long) ' ');
        org.mockito.asm.ByteVector byteVector6 = byteVector4.putByte((int) 'a');
        org.mockito.asm.ByteVector byteVector8 = byteVector4.putByte((int) (short) -1);
        org.mockito.asm.ByteVector byteVector10 = byteVector4.putLong(0L);
        org.mockito.asm.ByteVector byteVector12 = byteVector10.putByte(0);
        org.mockito.asm.ByteVector byteVector14 = byteVector12.putLong(1L);
        org.mockito.asm.ByteVector byteVector16 = byteVector14.putUTF8("");
        org.mockito.asm.ByteVector byteVector18 = byteVector16.putLong((long) (short) 1);
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
    public void test1523() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1523");
        org.mockito.asm.ByteVector byteVector0 = new org.mockito.asm.ByteVector();
        org.mockito.asm.ByteVector byteVector2 = byteVector0.putUTF8("hi!");
        org.mockito.asm.ByteVector byteVector4 = byteVector2.putInt(0);
        org.mockito.asm.ByteVector byteVector6 = byteVector2.putByte((int) (byte) 10);
        org.mockito.asm.ByteVector byteVector8 = byteVector6.putUTF8("hi!");
        org.mockito.asm.ByteVector byteVector10 = byteVector8.putUTF8("hi!");
        org.mockito.asm.ByteVector byteVector12 = byteVector10.putByte((int) (short) -1);
        org.mockito.asm.ByteVector byteVector14 = byteVector10.putLong((long) 1);
        org.mockito.asm.ByteVector byteVector16 = byteVector10.putLong(100L);
        org.mockito.asm.ByteVector byteVector18 = byteVector10.putInt((int) '#');
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
    public void test1524() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1524");
        org.mockito.asm.ByteVector byteVector1 = new org.mockito.asm.ByteVector((int) '#');
        org.mockito.asm.ByteVector byteVector3 = byteVector1.putInt(100);
        org.mockito.asm.ByteVector byteVector5 = byteVector1.putInt((int) (byte) 1);
        org.mockito.asm.ByteVector byteVector7 = byteVector1.putInt((-1));
        org.mockito.asm.ByteVector byteVector9 = byteVector1.putByte((int) '#');
        org.mockito.asm.ByteVector byteVector11 = byteVector1.putLong((long) 100);
        org.mockito.asm.ByteVector byteVector12 = new org.mockito.asm.ByteVector();
        org.mockito.asm.ByteVector byteVector14 = byteVector12.putUTF8("hi!");
        org.mockito.asm.ByteVector byteVector16 = byteVector12.putLong((long) ' ');
        org.mockito.asm.ByteVector byteVector18 = byteVector16.putByte((int) 'a');
        org.mockito.asm.ByteVector byteVector20 = byteVector16.putByte((int) (short) -1);
        org.mockito.asm.ByteVector byteVector22 = byteVector16.putLong(0L);
        org.mockito.asm.ByteVector byteVector24 = byteVector22.putByte(0);
        org.mockito.asm.ByteVector byteVector26 = byteVector24.putByte(100);
        org.mockito.asm.ByteVector byteVector28 = byteVector24.putByte((int) '4');
        org.mockito.asm.ByteVector byteVector30 = byteVector28.putUTF8("hi!");
        org.mockito.asm.ByteVector byteVector32 = byteVector28.putShort(100);
        org.mockito.asm.ByteVector byteVector34 = byteVector28.putShort((int) (short) 100);
        org.mockito.asm.ByteVector byteVector35 = new org.mockito.asm.ByteVector();
        org.mockito.asm.ByteVector byteVector37 = byteVector35.putUTF8("hi!");
        org.mockito.asm.ByteVector byteVector39 = byteVector35.putInt(0);
        org.mockito.asm.ByteVector byteVector41 = byteVector35.putShort((int) '4');
        org.mockito.asm.ByteVector byteVector43 = byteVector35.putByte(100);
        org.mockito.asm.ByteVector byteVector45 = byteVector43.putInt((int) (byte) 10);
        org.mockito.asm.ByteVector byteVector47 = byteVector43.putInt((int) (byte) 10);
        org.mockito.asm.ByteVector byteVector49 = byteVector47.putByte(100);
        org.mockito.asm.ByteVector byteVector50 = new org.mockito.asm.ByteVector();
        org.mockito.asm.ByteVector byteVector52 = byteVector50.putUTF8("hi!");
        org.mockito.asm.ByteVector byteVector54 = byteVector50.putInt(0);
        org.mockito.asm.ByteVector byteVector56 = byteVector54.putInt((int) ' ');
        org.mockito.asm.ByteVector byteVector58 = byteVector56.putLong(100L);
        byte[] byteArray62 = new byte[] { (byte) 0, (byte) 10, (byte) 1 };
        org.mockito.asm.ByteVector byteVector65 = byteVector56.putByteArray(byteArray62, 0, 0);
        org.mockito.asm.ByteVector byteVector68 = byteVector49.putByteArray(byteArray62, (int) (byte) 1, (int) (byte) 0);
        org.mockito.asm.ByteVector byteVector71 = byteVector34.putByteArray(byteArray62, 1, (int) (byte) 1);
        // The following exception was thrown during execution in test generation
        try {
            org.mockito.asm.ByteVector byteVector74 = byteVector1.putByteArray(byteArray62, (int) (short) 100, (int) '4');
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
        org.junit.Assert.assertNotNull(byteVector52);
        org.junit.Assert.assertNotNull(byteVector54);
        org.junit.Assert.assertNotNull(byteVector56);
        org.junit.Assert.assertNotNull(byteVector58);
        org.junit.Assert.assertNotNull(byteArray62);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray62), "[0, 10, 1]");
        org.junit.Assert.assertNotNull(byteVector65);
        org.junit.Assert.assertNotNull(byteVector68);
        org.junit.Assert.assertNotNull(byteVector71);
    }

    @Test
    public void test1525() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1525");
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
        org.mockito.asm.ByteVector byteVector20 = byteVector10.putInt((int) (byte) 10);
        org.mockito.asm.ByteVector byteVector22 = byteVector10.putInt((int) (short) 100);
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
    public void test1526() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1526");
        org.mockito.asm.ByteVector byteVector1 = new org.mockito.asm.ByteVector((int) '#');
        org.mockito.asm.ByteVector byteVector3 = byteVector1.putLong(100L);
        org.mockito.asm.ByteVector byteVector5 = byteVector3.putLong(1L);
        org.mockito.asm.ByteVector byteVector7 = byteVector5.putUTF8("hi!");
        org.mockito.asm.ByteVector byteVector9 = byteVector7.putInt(10);
        org.mockito.asm.ByteVector byteVector11 = byteVector9.putByte((int) '4');
        org.junit.Assert.assertNotNull(byteVector3);
        org.junit.Assert.assertNotNull(byteVector5);
        org.junit.Assert.assertNotNull(byteVector7);
        org.junit.Assert.assertNotNull(byteVector9);
        org.junit.Assert.assertNotNull(byteVector11);
    }

    @Test
    public void test1527() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1527");
        org.mockito.asm.ByteVector byteVector0 = new org.mockito.asm.ByteVector();
        org.mockito.asm.ByteVector byteVector2 = byteVector0.putUTF8("hi!");
        org.mockito.asm.ByteVector byteVector4 = byteVector0.putLong((long) ' ');
        org.mockito.asm.ByteVector byteVector6 = byteVector4.putInt((int) (short) 100);
        org.mockito.asm.ByteVector byteVector8 = byteVector6.putShort((int) (byte) 1);
        org.mockito.asm.ByteVector byteVector10 = byteVector8.putShort((-1));
        org.mockito.asm.ByteVector byteVector12 = byteVector10.putShort((int) '#');
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
    public void test1528() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1528");
        org.mockito.asm.ByteVector byteVector0 = new org.mockito.asm.ByteVector();
        org.mockito.asm.ByteVector byteVector2 = byteVector0.putUTF8("hi!");
        org.mockito.asm.ByteVector byteVector4 = byteVector0.putInt(0);
        org.mockito.asm.ByteVector byteVector6 = byteVector4.putInt((int) ' ');
        org.mockito.asm.ByteVector byteVector8 = byteVector6.putLong((long) (short) 10);
        org.mockito.asm.ByteVector byteVector10 = byteVector8.putUTF8("hi!");
        org.mockito.asm.ByteVector byteVector12 = byteVector8.putByte(0);
        org.mockito.asm.ByteVector byteVector14 = byteVector12.putInt((int) (short) 1);
        org.mockito.asm.ByteVector byteVector16 = byteVector12.putShort((int) '4');
        org.mockito.asm.ByteVector byteVector18 = byteVector16.putByte((int) ' ');
        org.mockito.asm.ByteVector byteVector20 = byteVector16.putLong((long) 0);
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
    public void test1529() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1529");
        org.mockito.asm.ByteVector byteVector1 = new org.mockito.asm.ByteVector((int) '#');
        org.mockito.asm.ByteVector byteVector3 = byteVector1.putLong(100L);
        org.mockito.asm.ByteVector byteVector5 = byteVector3.putLong(1L);
        org.mockito.asm.ByteVector byteVector7 = byteVector3.putUTF8("");
        java.lang.Class<?> wildcardClass8 = byteVector7.getClass();
        org.junit.Assert.assertNotNull(byteVector3);
        org.junit.Assert.assertNotNull(byteVector5);
        org.junit.Assert.assertNotNull(byteVector7);
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test1530() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1530");
        org.mockito.asm.ByteVector byteVector0 = new org.mockito.asm.ByteVector();
        org.mockito.asm.ByteVector byteVector2 = byteVector0.putUTF8("hi!");
        org.mockito.asm.ByteVector byteVector4 = byteVector2.putLong((long) (byte) 10);
        org.mockito.asm.ByteVector byteVector6 = byteVector4.putInt((int) 'a');
        org.mockito.asm.ByteVector byteVector8 = byteVector6.putShort((int) (byte) 0);
        org.mockito.asm.ByteVector byteVector10 = byteVector6.putShort(0);
        org.mockito.asm.ByteVector byteVector12 = byteVector10.putShort(10);
        org.mockito.asm.ByteVector byteVector14 = byteVector12.putInt((int) (byte) 0);
        org.mockito.asm.ByteVector byteVector16 = byteVector14.putUTF8("");
        org.mockito.asm.ByteVector byteVector18 = byteVector14.putInt((int) (short) -1);
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
    public void test1531() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1531");
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
        org.mockito.asm.ByteVector byteVector20 = byteVector12.putShort((int) (short) 1);
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
    public void test1532() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1532");
        org.mockito.asm.ByteVector byteVector0 = new org.mockito.asm.ByteVector();
        org.mockito.asm.ByteVector byteVector2 = byteVector0.putUTF8("hi!");
        org.mockito.asm.ByteVector byteVector4 = byteVector2.putLong((long) (byte) 10);
        org.mockito.asm.ByteVector byteVector6 = byteVector4.putUTF8("hi!");
        org.mockito.asm.ByteVector byteVector8 = byteVector4.putLong((-1L));
        org.mockito.asm.ByteVector byteVector10 = byteVector8.putInt(10);
        org.mockito.asm.ByteVector byteVector12 = byteVector8.putShort((int) (byte) 0);
        org.mockito.asm.ByteVector byteVector14 = byteVector12.putShort(1);
        org.junit.Assert.assertNotNull(byteVector2);
        org.junit.Assert.assertNotNull(byteVector4);
        org.junit.Assert.assertNotNull(byteVector6);
        org.junit.Assert.assertNotNull(byteVector8);
        org.junit.Assert.assertNotNull(byteVector10);
        org.junit.Assert.assertNotNull(byteVector12);
        org.junit.Assert.assertNotNull(byteVector14);
    }

    @Test
    public void test1533() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1533");
        org.mockito.asm.ByteVector byteVector0 = new org.mockito.asm.ByteVector();
        org.mockito.asm.ByteVector byteVector2 = byteVector0.putUTF8("hi!");
        org.mockito.asm.ByteVector byteVector4 = byteVector2.putLong((long) (byte) 10);
        org.mockito.asm.ByteVector byteVector6 = byteVector4.putUTF8("hi!");
        org.mockito.asm.ByteVector byteVector8 = byteVector4.putShort((int) '4');
        org.mockito.asm.ByteVector byteVector10 = byteVector8.putLong((long) (short) 100);
        org.mockito.asm.ByteVector byteVector12 = byteVector8.putInt((int) (short) 10);
        org.junit.Assert.assertNotNull(byteVector2);
        org.junit.Assert.assertNotNull(byteVector4);
        org.junit.Assert.assertNotNull(byteVector6);
        org.junit.Assert.assertNotNull(byteVector8);
        org.junit.Assert.assertNotNull(byteVector10);
        org.junit.Assert.assertNotNull(byteVector12);
    }

    @Test
    public void test1534() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1534");
        org.mockito.asm.ByteVector byteVector1 = new org.mockito.asm.ByteVector((int) '#');
        org.mockito.asm.ByteVector byteVector3 = byteVector1.putLong(100L);
        org.mockito.asm.ByteVector byteVector5 = byteVector3.putLong(1L);
        org.mockito.asm.ByteVector byteVector7 = byteVector5.putUTF8("hi!");
        org.mockito.asm.ByteVector byteVector9 = byteVector5.putUTF8("hi!");
        org.mockito.asm.ByteVector byteVector11 = byteVector9.putByte(10);
        org.mockito.asm.ByteVector byteVector13 = byteVector11.putInt(0);
        org.mockito.asm.ByteVector byteVector15 = byteVector11.putInt((int) ' ');
        org.junit.Assert.assertNotNull(byteVector3);
        org.junit.Assert.assertNotNull(byteVector5);
        org.junit.Assert.assertNotNull(byteVector7);
        org.junit.Assert.assertNotNull(byteVector9);
        org.junit.Assert.assertNotNull(byteVector11);
        org.junit.Assert.assertNotNull(byteVector13);
        org.junit.Assert.assertNotNull(byteVector15);
    }

    @Test
    public void test1535() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1535");
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
        org.mockito.asm.ByteVector byteVector26 = byteVector24.putByte((int) (short) 10);
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
    public void test1536() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1536");
        org.mockito.asm.ByteVector byteVector0 = new org.mockito.asm.ByteVector();
        org.mockito.asm.ByteVector byteVector2 = byteVector0.putUTF8("hi!");
        org.mockito.asm.ByteVector byteVector4 = byteVector2.putInt((int) (byte) 10);
        org.mockito.asm.ByteVector byteVector6 = byteVector2.putLong((long) 0);
        org.mockito.asm.ByteVector byteVector8 = byteVector6.putShort((int) (short) -1);
        org.mockito.asm.ByteVector byteVector9 = new org.mockito.asm.ByteVector();
        org.mockito.asm.ByteVector byteVector11 = byteVector9.putUTF8("hi!");
        org.mockito.asm.ByteVector byteVector13 = byteVector9.putLong((long) ' ');
        org.mockito.asm.ByteVector byteVector15 = byteVector13.putByte((int) 'a');
        org.mockito.asm.ByteVector byteVector17 = byteVector15.putByte((int) (short) -1);
        org.mockito.asm.ByteVector byteVector19 = byteVector17.putLong((long) (byte) -1);
        org.mockito.asm.ByteVector byteVector21 = byteVector17.putByte((int) '4');
        org.mockito.asm.ByteVector byteVector23 = byteVector21.putLong((long) (short) 10);
        org.mockito.asm.ByteVector byteVector25 = new org.mockito.asm.ByteVector((int) '#');
        org.mockito.asm.ByteVector byteVector27 = byteVector25.putInt(100);
        org.mockito.asm.ByteVector byteVector29 = byteVector27.putShort((int) (short) -1);
        org.mockito.asm.ByteVector byteVector31 = byteVector29.putShort((int) (short) 0);
        org.mockito.asm.ByteVector byteVector33 = byteVector29.putUTF8("");
        org.mockito.asm.ByteVector byteVector34 = new org.mockito.asm.ByteVector();
        org.mockito.asm.ByteVector byteVector36 = byteVector34.putUTF8("hi!");
        org.mockito.asm.ByteVector byteVector38 = byteVector34.putLong((long) ' ');
        org.mockito.asm.ByteVector byteVector40 = byteVector38.putByte((int) 'a');
        org.mockito.asm.ByteVector byteVector42 = byteVector38.putByte((int) (short) -1);
        org.mockito.asm.ByteVector byteVector44 = byteVector38.putLong(0L);
        org.mockito.asm.ByteVector byteVector46 = byteVector38.putUTF8("hi!");
        org.mockito.asm.ByteVector byteVector48 = byteVector46.putUTF8("");
        org.mockito.asm.ByteVector byteVector50 = byteVector46.putInt((int) (byte) 10);
        org.mockito.asm.ByteVector byteVector52 = byteVector46.putByte(0);
        org.mockito.asm.ByteVector byteVector53 = new org.mockito.asm.ByteVector();
        org.mockito.asm.ByteVector byteVector55 = byteVector53.putUTF8("hi!");
        org.mockito.asm.ByteVector byteVector57 = byteVector53.putInt(0);
        org.mockito.asm.ByteVector byteVector59 = byteVector57.putInt((int) ' ');
        org.mockito.asm.ByteVector byteVector61 = byteVector59.putLong(100L);
        byte[] byteArray65 = new byte[] { (byte) 0, (byte) 10, (byte) 1 };
        org.mockito.asm.ByteVector byteVector68 = byteVector59.putByteArray(byteArray65, 0, 0);
        org.mockito.asm.ByteVector byteVector71 = byteVector52.putByteArray(byteArray65, (int) (short) 1, 0);
        org.mockito.asm.ByteVector byteVector74 = byteVector29.putByteArray(byteArray65, 1, 1);
        org.mockito.asm.ByteVector byteVector77 = byteVector21.putByteArray(byteArray65, (int) (short) 0, 0);
        // The following exception was thrown during execution in test generation
        try {
            org.mockito.asm.ByteVector byteVector80 = byteVector6.putByteArray(byteArray65, 10, (int) (short) 0);
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
    public void test1537() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1537");
        org.mockito.asm.ByteVector byteVector0 = new org.mockito.asm.ByteVector();
        org.mockito.asm.ByteVector byteVector2 = byteVector0.putUTF8("hi!");
        org.mockito.asm.ByteVector byteVector4 = byteVector0.putLong((long) ' ');
        org.mockito.asm.ByteVector byteVector6 = byteVector4.putByte((int) 'a');
        org.mockito.asm.ByteVector byteVector8 = byteVector6.putByte((int) (short) -1);
        org.mockito.asm.ByteVector byteVector10 = byteVector8.putLong((long) (byte) -1);
        org.mockito.asm.ByteVector byteVector12 = byteVector8.putByte((int) '4');
        org.mockito.asm.ByteVector byteVector14 = byteVector12.putUTF8("");
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
    public void test1538() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1538");
        org.mockito.asm.ByteVector byteVector0 = new org.mockito.asm.ByteVector();
        org.mockito.asm.ByteVector byteVector2 = byteVector0.putUTF8("hi!");
        org.mockito.asm.ByteVector byteVector4 = byteVector0.putShort((int) (short) -1);
        org.mockito.asm.ByteVector byteVector6 = byteVector0.putInt((int) (byte) 10);
        org.mockito.asm.ByteVector byteVector8 = byteVector6.putUTF8("hi!");
        org.mockito.asm.ByteVector byteVector10 = byteVector8.putShort(0);
        org.mockito.asm.ByteVector byteVector12 = byteVector10.putShort((int) (byte) 1);
        org.mockito.asm.ByteVector byteVector14 = byteVector12.putByte((int) (short) 10);
        org.mockito.asm.ByteVector byteVector16 = byteVector12.putUTF8("");
        org.mockito.asm.ByteVector byteVector18 = byteVector16.putShort((int) (short) 0);
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
    public void test1539() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1539");
        org.mockito.asm.ByteVector byteVector0 = new org.mockito.asm.ByteVector();
        org.mockito.asm.ByteVector byteVector2 = byteVector0.putUTF8("hi!");
        org.mockito.asm.ByteVector byteVector4 = byteVector0.putShort((int) (short) -1);
        org.mockito.asm.ByteVector byteVector6 = byteVector0.putByte((-1));
        org.mockito.asm.ByteVector byteVector7 = new org.mockito.asm.ByteVector();
        org.mockito.asm.ByteVector byteVector9 = byteVector7.putUTF8("hi!");
        org.mockito.asm.ByteVector byteVector11 = byteVector7.putLong((long) (short) 1);
        org.mockito.asm.ByteVector byteVector13 = byteVector11.putUTF8("");
        org.mockito.asm.ByteVector byteVector15 = byteVector13.putShort((int) (short) 0);
        org.mockito.asm.ByteVector byteVector17 = byteVector15.putByte((int) 'a');
        org.mockito.asm.ByteVector byteVector19 = new org.mockito.asm.ByteVector((int) '#');
        org.mockito.asm.ByteVector byteVector21 = byteVector19.putLong(100L);
        org.mockito.asm.ByteVector byteVector23 = byteVector21.putLong(1L);
        org.mockito.asm.ByteVector byteVector25 = byteVector23.putUTF8("hi!");
        org.mockito.asm.ByteVector byteVector27 = byteVector23.putUTF8("hi!");
        org.mockito.asm.ByteVector byteVector29 = byteVector27.putByte((int) (short) 0);
        org.mockito.asm.ByteVector byteVector31 = byteVector27.putInt(1);
        org.mockito.asm.ByteVector byteVector32 = new org.mockito.asm.ByteVector();
        org.mockito.asm.ByteVector byteVector34 = byteVector32.putUTF8("hi!");
        org.mockito.asm.ByteVector byteVector36 = byteVector34.putByte(100);
        org.mockito.asm.ByteVector byteVector38 = byteVector34.putShort((int) 'a');
        org.mockito.asm.ByteVector byteVector40 = byteVector38.putShort((int) (short) 0);
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
        org.mockito.asm.ByteVector byteVector73 = byteVector38.putByteArray(byteArray64, (int) (byte) 1, (int) (short) 1);
        org.mockito.asm.ByteVector byteVector76 = byteVector27.putByteArray(byteArray64, (int) (short) 0, (int) (byte) 0);
        org.mockito.asm.ByteVector byteVector79 = byteVector17.putByteArray(byteArray64, 0, (int) (short) 1);
        // The following exception was thrown during execution in test generation
        try {
            org.mockito.asm.ByteVector byteVector82 = byteVector0.putByteArray(byteArray64, (int) '#', 0);
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
    public void test1540() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1540");
        org.mockito.asm.ByteVector byteVector0 = new org.mockito.asm.ByteVector();
        org.mockito.asm.ByteVector byteVector2 = byteVector0.putUTF8("hi!");
        org.mockito.asm.ByteVector byteVector4 = byteVector0.putShort((int) (short) -1);
        org.mockito.asm.ByteVector byteVector6 = byteVector0.putLong(0L);
        org.mockito.asm.ByteVector byteVector8 = byteVector0.putShort((int) (byte) -1);
        org.mockito.asm.ByteVector byteVector10 = byteVector0.putInt((int) (byte) 0);
        org.mockito.asm.ByteVector byteVector12 = byteVector0.putInt((int) (byte) 1);
        org.mockito.asm.ByteVector byteVector14 = byteVector12.putShort((int) (short) 100);
        byte[] byteArray15 = null;
        org.mockito.asm.ByteVector byteVector18 = byteVector12.putByteArray(byteArray15, (int) '#', (int) 'a');
        org.junit.Assert.assertNotNull(byteVector2);
        org.junit.Assert.assertNotNull(byteVector4);
        org.junit.Assert.assertNotNull(byteVector6);
        org.junit.Assert.assertNotNull(byteVector8);
        org.junit.Assert.assertNotNull(byteVector10);
        org.junit.Assert.assertNotNull(byteVector12);
        org.junit.Assert.assertNotNull(byteVector14);
        org.junit.Assert.assertNotNull(byteVector18);
    }

    @Test
    public void test1541() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1541");
        org.mockito.asm.ByteVector byteVector0 = new org.mockito.asm.ByteVector();
        org.mockito.asm.ByteVector byteVector2 = byteVector0.putUTF8("hi!");
        org.mockito.asm.ByteVector byteVector4 = byteVector2.putLong((long) (byte) 10);
        org.mockito.asm.ByteVector byteVector6 = byteVector4.putUTF8("hi!");
        org.mockito.asm.ByteVector byteVector8 = byteVector4.putLong((long) (short) -1);
        org.mockito.asm.ByteVector byteVector10 = byteVector8.putInt(10);
        org.mockito.asm.ByteVector byteVector12 = byteVector8.putByte((int) (short) 1);
        org.mockito.asm.ByteVector byteVector14 = byteVector12.putShort((int) (short) 100);
        org.mockito.asm.ByteVector byteVector16 = byteVector14.putByte(0);
        org.mockito.asm.ByteVector byteVector18 = byteVector14.putByte((int) '4');
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
    public void test1542() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1542");
        org.mockito.asm.ByteVector byteVector0 = new org.mockito.asm.ByteVector();
        org.mockito.asm.ByteVector byteVector2 = byteVector0.putUTF8("hi!");
        org.mockito.asm.ByteVector byteVector4 = byteVector2.putInt(0);
        org.mockito.asm.ByteVector byteVector6 = byteVector4.putShort(1);
        org.mockito.asm.ByteVector byteVector8 = byteVector6.putByte((int) (byte) 1);
        org.mockito.asm.ByteVector byteVector10 = byteVector6.putLong((long) 10);
        java.lang.Class<?> wildcardClass11 = byteVector10.getClass();
        org.junit.Assert.assertNotNull(byteVector2);
        org.junit.Assert.assertNotNull(byteVector4);
        org.junit.Assert.assertNotNull(byteVector6);
        org.junit.Assert.assertNotNull(byteVector8);
        org.junit.Assert.assertNotNull(byteVector10);
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test1543() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1543");
        org.mockito.asm.ByteVector byteVector0 = new org.mockito.asm.ByteVector();
        org.mockito.asm.ByteVector byteVector2 = byteVector0.putUTF8("hi!");
        org.mockito.asm.ByteVector byteVector4 = byteVector0.putInt(0);
        org.mockito.asm.ByteVector byteVector6 = byteVector0.putShort(10);
        org.mockito.asm.ByteVector byteVector8 = byteVector0.putLong((long) (short) 1);
        org.mockito.asm.ByteVector byteVector10 = byteVector8.putByte(0);
        org.mockito.asm.ByteVector byteVector12 = byteVector8.putShort((int) (byte) 0);
        org.mockito.asm.ByteVector byteVector14 = byteVector8.putByte((int) (short) 100);
        org.junit.Assert.assertNotNull(byteVector2);
        org.junit.Assert.assertNotNull(byteVector4);
        org.junit.Assert.assertNotNull(byteVector6);
        org.junit.Assert.assertNotNull(byteVector8);
        org.junit.Assert.assertNotNull(byteVector10);
        org.junit.Assert.assertNotNull(byteVector12);
        org.junit.Assert.assertNotNull(byteVector14);
    }

    @Test
    public void test1544() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1544");
        org.mockito.asm.ByteVector byteVector0 = new org.mockito.asm.ByteVector();
        org.mockito.asm.ByteVector byteVector2 = byteVector0.putUTF8("hi!");
        org.mockito.asm.ByteVector byteVector4 = byteVector0.putLong((long) ' ');
        org.mockito.asm.ByteVector byteVector6 = byteVector4.putByte((int) 'a');
        org.mockito.asm.ByteVector byteVector8 = byteVector4.putByte((int) (short) -1);
        org.mockito.asm.ByteVector byteVector10 = byteVector4.putLong(0L);
        org.mockito.asm.ByteVector byteVector12 = byteVector10.putInt((int) (short) -1);
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
    public void test1545() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1545");
        org.mockito.asm.ByteVector byteVector0 = new org.mockito.asm.ByteVector();
        org.mockito.asm.ByteVector byteVector2 = byteVector0.putUTF8("hi!");
        org.mockito.asm.ByteVector byteVector4 = byteVector0.putLong((long) ' ');
        org.mockito.asm.ByteVector byteVector6 = byteVector4.putByte((int) 'a');
        org.mockito.asm.ByteVector byteVector8 = byteVector6.putByte((int) (short) -1);
        byte[] byteArray9 = null;
        org.mockito.asm.ByteVector byteVector12 = byteVector6.putByteArray(byteArray9, (int) '#', 0);
        org.mockito.asm.ByteVector byteVector14 = byteVector6.putLong((long) '#');
        org.mockito.asm.ByteVector byteVector16 = byteVector14.putShort((int) (short) -1);
        org.mockito.asm.ByteVector byteVector18 = byteVector14.putShort((-1));
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
    public void test1546() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1546");
        org.mockito.asm.ByteVector byteVector1 = new org.mockito.asm.ByteVector((int) (byte) 1);
        org.mockito.asm.ByteVector byteVector3 = byteVector1.putByte((int) (byte) 10);
        org.mockito.asm.ByteVector byteVector5 = byteVector3.putLong((long) (byte) 10);
        org.mockito.asm.ByteVector byteVector7 = byteVector3.putUTF8("");
        org.mockito.asm.ByteVector byteVector9 = byteVector7.putShort((-1));
        org.junit.Assert.assertNotNull(byteVector3);
        org.junit.Assert.assertNotNull(byteVector5);
        org.junit.Assert.assertNotNull(byteVector7);
        org.junit.Assert.assertNotNull(byteVector9);
    }

    @Test
    public void test1547() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1547");
        org.mockito.asm.ByteVector byteVector0 = new org.mockito.asm.ByteVector();
        org.mockito.asm.ByteVector byteVector2 = byteVector0.putUTF8("hi!");
        org.mockito.asm.ByteVector byteVector4 = byteVector2.putLong((long) (byte) 10);
        org.mockito.asm.ByteVector byteVector6 = byteVector2.putInt((int) (short) 1);
        org.mockito.asm.ByteVector byteVector8 = byteVector2.putLong((long) (short) 10);
        org.mockito.asm.ByteVector byteVector10 = byteVector8.putShort((int) (byte) 0);
        org.mockito.asm.ByteVector byteVector12 = byteVector10.putUTF8("hi!");
        org.mockito.asm.ByteVector byteVector14 = byteVector12.putShort((int) (short) 0);
        org.junit.Assert.assertNotNull(byteVector2);
        org.junit.Assert.assertNotNull(byteVector4);
        org.junit.Assert.assertNotNull(byteVector6);
        org.junit.Assert.assertNotNull(byteVector8);
        org.junit.Assert.assertNotNull(byteVector10);
        org.junit.Assert.assertNotNull(byteVector12);
        org.junit.Assert.assertNotNull(byteVector14);
    }

    @Test
    public void test1548() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1548");
        org.mockito.asm.ByteVector byteVector0 = new org.mockito.asm.ByteVector();
        org.mockito.asm.ByteVector byteVector2 = byteVector0.putUTF8("hi!");
        org.mockito.asm.ByteVector byteVector4 = byteVector0.putInt(0);
        org.mockito.asm.ByteVector byteVector6 = byteVector0.putShort((int) '4');
        org.mockito.asm.ByteVector byteVector8 = byteVector0.putUTF8("hi!");
        org.mockito.asm.ByteVector byteVector10 = byteVector8.putLong((long) 10);
        org.junit.Assert.assertNotNull(byteVector2);
        org.junit.Assert.assertNotNull(byteVector4);
        org.junit.Assert.assertNotNull(byteVector6);
        org.junit.Assert.assertNotNull(byteVector8);
        org.junit.Assert.assertNotNull(byteVector10);
    }

    @Test
    public void test1549() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1549");
        org.mockito.asm.ByteVector byteVector1 = new org.mockito.asm.ByteVector((int) '#');
        org.mockito.asm.ByteVector byteVector3 = byteVector1.putLong(100L);
        org.mockito.asm.ByteVector byteVector5 = byteVector1.putLong((long) (byte) -1);
        org.mockito.asm.ByteVector byteVector7 = byteVector5.putUTF8("hi!");
        org.junit.Assert.assertNotNull(byteVector3);
        org.junit.Assert.assertNotNull(byteVector5);
        org.junit.Assert.assertNotNull(byteVector7);
    }

    @Test
    public void test1550() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1550");
        org.mockito.asm.ByteVector byteVector1 = new org.mockito.asm.ByteVector((int) (byte) 10);
        org.mockito.asm.ByteVector byteVector3 = byteVector1.putByte((int) '4');
        org.mockito.asm.ByteVector byteVector5 = byteVector1.putLong(0L);
        org.mockito.asm.ByteVector byteVector7 = byteVector5.putByte(10);
        org.mockito.asm.ByteVector byteVector9 = byteVector5.putUTF8("hi!");
        org.mockito.asm.ByteVector byteVector11 = byteVector5.putUTF8("hi!");
        org.mockito.asm.ByteVector byteVector13 = byteVector11.putByte((int) (short) 0);
        org.junit.Assert.assertNotNull(byteVector3);
        org.junit.Assert.assertNotNull(byteVector5);
        org.junit.Assert.assertNotNull(byteVector7);
        org.junit.Assert.assertNotNull(byteVector9);
        org.junit.Assert.assertNotNull(byteVector11);
        org.junit.Assert.assertNotNull(byteVector13);
    }

    @Test
    public void test1551() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1551");
        org.mockito.asm.ByteVector byteVector1 = new org.mockito.asm.ByteVector((int) (byte) 100);
        org.mockito.asm.ByteVector byteVector3 = byteVector1.putShort((int) (short) 100);
        org.mockito.asm.ByteVector byteVector5 = byteVector1.putLong((long) (short) 10);
        org.mockito.asm.ByteVector byteVector7 = byteVector5.putByte((int) (byte) 0);
        org.mockito.asm.ByteVector byteVector9 = byteVector5.putByte((int) (short) 0);
        java.lang.Class<?> wildcardClass10 = byteVector5.getClass();
        org.junit.Assert.assertNotNull(byteVector3);
        org.junit.Assert.assertNotNull(byteVector5);
        org.junit.Assert.assertNotNull(byteVector7);
        org.junit.Assert.assertNotNull(byteVector9);
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test1552() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1552");
        org.mockito.asm.ByteVector byteVector0 = new org.mockito.asm.ByteVector();
        org.mockito.asm.ByteVector byteVector2 = byteVector0.putUTF8("hi!");
        org.mockito.asm.ByteVector byteVector4 = byteVector0.putLong((long) ' ');
        org.mockito.asm.ByteVector byteVector6 = byteVector4.putByte((int) 'a');
        org.mockito.asm.ByteVector byteVector8 = byteVector6.putByte((int) (short) -1);
        byte[] byteArray9 = null;
        org.mockito.asm.ByteVector byteVector12 = byteVector6.putByteArray(byteArray9, (int) '#', 0);
        org.mockito.asm.ByteVector byteVector14 = byteVector6.putUTF8("hi!");
        org.junit.Assert.assertNotNull(byteVector2);
        org.junit.Assert.assertNotNull(byteVector4);
        org.junit.Assert.assertNotNull(byteVector6);
        org.junit.Assert.assertNotNull(byteVector8);
        org.junit.Assert.assertNotNull(byteVector12);
        org.junit.Assert.assertNotNull(byteVector14);
    }

    @Test
    public void test1553() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1553");
        org.mockito.asm.ByteVector byteVector0 = new org.mockito.asm.ByteVector();
        org.mockito.asm.ByteVector byteVector2 = byteVector0.putUTF8("hi!");
        org.mockito.asm.ByteVector byteVector4 = byteVector2.putByte(100);
        org.mockito.asm.ByteVector byteVector6 = byteVector2.putShort((int) 'a');
        org.mockito.asm.ByteVector byteVector7 = new org.mockito.asm.ByteVector();
        org.mockito.asm.ByteVector byteVector9 = byteVector7.putUTF8("hi!");
        org.mockito.asm.ByteVector byteVector11 = byteVector9.putLong((long) (byte) 10);
        org.mockito.asm.ByteVector byteVector13 = byteVector11.putUTF8("hi!");
        org.mockito.asm.ByteVector byteVector15 = byteVector11.putLong((long) 10);
        org.mockito.asm.ByteVector byteVector17 = byteVector15.putLong(0L);
        org.mockito.asm.ByteVector byteVector19 = byteVector17.putUTF8("hi!");
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
        org.mockito.asm.ByteVector byteVector52 = byteVector19.putByteArray(byteArray43, (int) (byte) 0, 0);
        // The following exception was thrown during execution in test generation
        try {
            org.mockito.asm.ByteVector byteVector55 = byteVector6.putByteArray(byteArray43, (int) 'a', 100);
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
    public void test1554() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1554");
        org.mockito.asm.ByteVector byteVector0 = new org.mockito.asm.ByteVector();
        org.mockito.asm.ByteVector byteVector2 = byteVector0.putUTF8("hi!");
        org.mockito.asm.ByteVector byteVector4 = byteVector2.putInt((int) (byte) 10);
        org.mockito.asm.ByteVector byteVector6 = byteVector2.putLong((long) 0);
        org.mockito.asm.ByteVector byteVector8 = byteVector2.putUTF8("hi!");
        org.mockito.asm.ByteVector byteVector10 = byteVector8.putByte(100);
        org.mockito.asm.ByteVector byteVector12 = byteVector8.putInt((-1));
        org.junit.Assert.assertNotNull(byteVector2);
        org.junit.Assert.assertNotNull(byteVector4);
        org.junit.Assert.assertNotNull(byteVector6);
        org.junit.Assert.assertNotNull(byteVector8);
        org.junit.Assert.assertNotNull(byteVector10);
        org.junit.Assert.assertNotNull(byteVector12);
    }

    @Test
    public void test1555() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1555");
        org.mockito.asm.ByteVector byteVector0 = new org.mockito.asm.ByteVector();
        org.mockito.asm.ByteVector byteVector2 = byteVector0.putUTF8("hi!");
        org.mockito.asm.ByteVector byteVector4 = byteVector0.putLong((long) ' ');
        org.mockito.asm.ByteVector byteVector6 = byteVector4.putByte((int) 'a');
        org.mockito.asm.ByteVector byteVector8 = byteVector4.putByte((int) (short) -1);
        org.mockito.asm.ByteVector byteVector10 = byteVector4.putLong(0L);
        org.mockito.asm.ByteVector byteVector12 = byteVector10.putInt((int) (short) -1);
        org.mockito.asm.ByteVector byteVector14 = byteVector12.putShort((int) (byte) 1);
        org.mockito.asm.ByteVector byteVector16 = byteVector14.putInt((int) (short) 0);
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
    public void test1556() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1556");
        org.mockito.asm.ByteVector byteVector0 = new org.mockito.asm.ByteVector();
        org.mockito.asm.ByteVector byteVector2 = byteVector0.putUTF8("hi!");
        org.mockito.asm.ByteVector byteVector4 = byteVector2.putLong((long) (byte) 10);
        org.mockito.asm.ByteVector byteVector6 = byteVector4.putUTF8("hi!");
        org.mockito.asm.ByteVector byteVector8 = byteVector4.putLong((long) (short) -1);
        org.mockito.asm.ByteVector byteVector10 = byteVector8.putInt(10);
        org.mockito.asm.ByteVector byteVector12 = byteVector8.putByte((int) (short) 1);
        org.mockito.asm.ByteVector byteVector14 = byteVector12.putShort((int) '4');
        org.mockito.asm.ByteVector byteVector16 = byteVector12.putInt((int) 'a');
        org.mockito.asm.ByteVector byteVector18 = byteVector12.putShort((int) ' ');
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
    public void test1557() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1557");
        org.mockito.asm.ByteVector byteVector1 = new org.mockito.asm.ByteVector((int) (short) 1);
        org.mockito.asm.ByteVector byteVector3 = byteVector1.putLong((long) (byte) 1);
        org.mockito.asm.ByteVector byteVector5 = byteVector1.putUTF8("");
        org.mockito.asm.ByteVector byteVector7 = byteVector5.putInt((int) '#');
        org.mockito.asm.ByteVector byteVector9 = byteVector5.putByte((int) (byte) 100);
        org.mockito.asm.ByteVector byteVector11 = byteVector9.putUTF8("hi!");
        org.mockito.asm.ByteVector byteVector13 = byteVector9.putByte((int) (byte) 1);
        org.mockito.asm.ByteVector byteVector15 = byteVector9.putLong((long) (byte) -1);
        org.junit.Assert.assertNotNull(byteVector3);
        org.junit.Assert.assertNotNull(byteVector5);
        org.junit.Assert.assertNotNull(byteVector7);
        org.junit.Assert.assertNotNull(byteVector9);
        org.junit.Assert.assertNotNull(byteVector11);
        org.junit.Assert.assertNotNull(byteVector13);
        org.junit.Assert.assertNotNull(byteVector15);
    }

    @Test
    public void test1558() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1558");
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
        org.mockito.asm.ByteVector byteVector20 = byteVector12.putLong((long) (short) 100);
        org.mockito.asm.ByteVector byteVector22 = byteVector20.putShort((int) (short) 1);
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
    public void test1559() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1559");
        org.mockito.asm.ByteVector byteVector1 = new org.mockito.asm.ByteVector((int) (byte) 10);
        org.mockito.asm.ByteVector byteVector3 = byteVector1.putByte((int) '4');
        org.mockito.asm.ByteVector byteVector5 = byteVector1.putLong((long) 'a');
        org.mockito.asm.ByteVector byteVector7 = byteVector1.putByte((int) '4');
        org.junit.Assert.assertNotNull(byteVector3);
        org.junit.Assert.assertNotNull(byteVector5);
        org.junit.Assert.assertNotNull(byteVector7);
    }

    @Test
    public void test1560() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1560");
        org.mockito.asm.ByteVector byteVector1 = new org.mockito.asm.ByteVector((int) '#');
        org.mockito.asm.ByteVector byteVector3 = byteVector1.putInt(100);
        org.mockito.asm.ByteVector byteVector5 = byteVector1.putInt((int) (byte) 1);
        org.mockito.asm.ByteVector byteVector7 = byteVector1.putInt((-1));
        org.mockito.asm.ByteVector byteVector9 = byteVector1.putByte((int) '#');
        org.mockito.asm.ByteVector byteVector11 = byteVector1.putLong((long) 100);
        org.mockito.asm.ByteVector byteVector13 = byteVector1.putLong((long) (byte) 0);
        org.junit.Assert.assertNotNull(byteVector3);
        org.junit.Assert.assertNotNull(byteVector5);
        org.junit.Assert.assertNotNull(byteVector7);
        org.junit.Assert.assertNotNull(byteVector9);
        org.junit.Assert.assertNotNull(byteVector11);
        org.junit.Assert.assertNotNull(byteVector13);
    }

    @Test
    public void test1561() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1561");
        org.mockito.asm.ByteVector byteVector0 = new org.mockito.asm.ByteVector();
        org.mockito.asm.ByteVector byteVector2 = byteVector0.putUTF8("hi!");
        org.mockito.asm.ByteVector byteVector4 = byteVector0.putLong((long) ' ');
        org.mockito.asm.ByteVector byteVector6 = byteVector4.putByte((int) 'a');
        org.mockito.asm.ByteVector byteVector8 = byteVector4.putByte((int) (short) -1);
        org.mockito.asm.ByteVector byteVector10 = byteVector4.putLong(0L);
        org.mockito.asm.ByteVector byteVector12 = byteVector10.putByte(0);
        org.mockito.asm.ByteVector byteVector14 = byteVector10.putShort((int) (byte) -1);
        org.mockito.asm.ByteVector byteVector16 = byteVector14.putLong((long) ' ');
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
    public void test1562() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1562");
        org.mockito.asm.ByteVector byteVector1 = new org.mockito.asm.ByteVector((int) (byte) 1);
        org.mockito.asm.ByteVector byteVector3 = byteVector1.putByte((int) (byte) 10);
        org.mockito.asm.ByteVector byteVector5 = byteVector3.putShort((int) (short) 10);
        org.mockito.asm.ByteVector byteVector7 = byteVector3.putUTF8("");
        org.mockito.asm.ByteVector byteVector9 = byteVector7.putLong((long) 'a');
        org.mockito.asm.ByteVector byteVector11 = byteVector7.putByte(100);
        org.mockito.asm.ByteVector byteVector13 = byteVector7.putByte(0);
        org.junit.Assert.assertNotNull(byteVector3);
        org.junit.Assert.assertNotNull(byteVector5);
        org.junit.Assert.assertNotNull(byteVector7);
        org.junit.Assert.assertNotNull(byteVector9);
        org.junit.Assert.assertNotNull(byteVector11);
        org.junit.Assert.assertNotNull(byteVector13);
    }

    @Test
    public void test1563() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1563");
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
        org.mockito.asm.ByteVector byteVector39 = byteVector37.putInt((int) (byte) 1);
        org.mockito.asm.ByteVector byteVector41 = byteVector37.putByte(0);
        org.mockito.asm.ByteVector byteVector43 = byteVector41.putInt((int) (short) 10);
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
        org.junit.Assert.assertNotNull(byteVector39);
        org.junit.Assert.assertNotNull(byteVector41);
        org.junit.Assert.assertNotNull(byteVector43);
    }

    @Test
    public void test1564() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1564");
        org.mockito.asm.ByteVector byteVector1 = new org.mockito.asm.ByteVector((int) '#');
        org.mockito.asm.ByteVector byteVector3 = byteVector1.putUTF8("hi!");
        org.mockito.asm.ByteVector byteVector5 = byteVector1.putUTF8("");
        org.mockito.asm.ByteVector byteVector7 = byteVector5.putInt(0);
        org.mockito.asm.ByteVector byteVector9 = byteVector5.putByte((int) (byte) -1);
        org.junit.Assert.assertNotNull(byteVector3);
        org.junit.Assert.assertNotNull(byteVector5);
        org.junit.Assert.assertNotNull(byteVector7);
        org.junit.Assert.assertNotNull(byteVector9);
    }

    @Test
    public void test1565() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1565");
        org.mockito.asm.ByteVector byteVector0 = new org.mockito.asm.ByteVector();
        org.mockito.asm.ByteVector byteVector2 = byteVector0.putUTF8("hi!");
        org.mockito.asm.ByteVector byteVector4 = byteVector2.putLong((long) (byte) 10);
        org.mockito.asm.ByteVector byteVector6 = byteVector4.putUTF8("hi!");
        org.mockito.asm.ByteVector byteVector8 = byteVector4.putLong((long) 10);
        org.mockito.asm.ByteVector byteVector10 = byteVector8.putUTF8("");
        org.mockito.asm.ByteVector byteVector12 = byteVector8.putLong(10L);
        org.mockito.asm.ByteVector byteVector14 = byteVector12.putLong((long) ' ');
        org.mockito.asm.ByteVector byteVector16 = byteVector12.putLong((long) 'a');
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
    public void test1566() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1566");
        org.mockito.asm.ByteVector byteVector0 = new org.mockito.asm.ByteVector();
        org.mockito.asm.ByteVector byteVector2 = byteVector0.putUTF8("hi!");
        org.mockito.asm.ByteVector byteVector4 = byteVector2.putInt(0);
        org.mockito.asm.ByteVector byteVector6 = byteVector4.putShort((int) '4');
        org.mockito.asm.ByteVector byteVector8 = byteVector6.putByte(100);
        org.mockito.asm.ByteVector byteVector10 = byteVector6.putUTF8("");
        org.mockito.asm.ByteVector byteVector12 = byteVector6.putUTF8("hi!");
        org.mockito.asm.ByteVector byteVector14 = byteVector6.putUTF8("");
        org.mockito.asm.ByteVector byteVector16 = byteVector14.putInt((int) (short) 0);
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
    public void test1567() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1567");
        org.mockito.asm.ByteVector byteVector1 = new org.mockito.asm.ByteVector((int) (byte) 1);
        org.mockito.asm.ByteVector byteVector3 = byteVector1.putByte((int) (byte) 10);
        org.mockito.asm.ByteVector byteVector5 = byteVector3.putShort((int) (short) 10);
        org.mockito.asm.ByteVector byteVector7 = byteVector3.putUTF8("");
        org.mockito.asm.ByteVector byteVector9 = byteVector7.putLong((long) 'a');
        org.mockito.asm.ByteVector byteVector11 = byteVector9.putLong((long) (byte) 100);
        org.junit.Assert.assertNotNull(byteVector3);
        org.junit.Assert.assertNotNull(byteVector5);
        org.junit.Assert.assertNotNull(byteVector7);
        org.junit.Assert.assertNotNull(byteVector9);
        org.junit.Assert.assertNotNull(byteVector11);
    }

    @Test
    public void test1568() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1568");
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
        org.mockito.asm.ByteVector byteVector22 = byteVector14.putInt((int) (short) 0);
        org.mockito.asm.ByteVector byteVector24 = byteVector14.putByte(0);
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
    public void test1569() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1569");
        org.mockito.asm.ByteVector byteVector0 = new org.mockito.asm.ByteVector();
        org.mockito.asm.ByteVector byteVector2 = byteVector0.putUTF8("hi!");
        org.mockito.asm.ByteVector byteVector4 = byteVector0.putLong((long) ' ');
        org.mockito.asm.ByteVector byteVector6 = byteVector4.putByte((int) 'a');
        org.mockito.asm.ByteVector byteVector8 = byteVector4.putByte((int) (short) -1);
        org.mockito.asm.ByteVector byteVector10 = byteVector4.putLong(0L);
        org.mockito.asm.ByteVector byteVector12 = byteVector4.putUTF8("hi!");
        org.mockito.asm.ByteVector byteVector14 = byteVector12.putLong((long) '4');
        org.mockito.asm.ByteVector byteVector16 = byteVector12.putShort((int) (byte) 100);
        org.mockito.asm.ByteVector byteVector18 = byteVector12.putShort(100);
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
    public void test1570() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1570");
        org.mockito.asm.ByteVector byteVector0 = new org.mockito.asm.ByteVector();
        org.mockito.asm.ByteVector byteVector2 = byteVector0.putUTF8("hi!");
        org.mockito.asm.ByteVector byteVector4 = byteVector0.putLong((long) ' ');
        org.mockito.asm.ByteVector byteVector6 = byteVector4.putByte((int) 'a');
        org.mockito.asm.ByteVector byteVector8 = byteVector6.putByte((int) (short) -1);
        org.mockito.asm.ByteVector byteVector10 = byteVector8.putLong((long) (byte) -1);
        org.mockito.asm.ByteVector byteVector12 = byteVector8.putByte((int) '4');
        org.mockito.asm.ByteVector byteVector14 = byteVector12.putUTF8("");
        org.mockito.asm.ByteVector byteVector16 = byteVector14.putByte((int) (byte) 100);
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
            org.mockito.asm.ByteVector byteVector80 = byteVector14.putByteArray(byteArray65, (int) 'a', (int) (byte) 10);
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
    public void test1571() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1571");
        org.mockito.asm.ByteVector byteVector1 = new org.mockito.asm.ByteVector((int) '#');
        org.mockito.asm.ByteVector byteVector3 = byteVector1.putLong(100L);
        org.mockito.asm.ByteVector byteVector5 = byteVector3.putLong(1L);
        org.mockito.asm.ByteVector byteVector7 = byteVector5.putUTF8("hi!");
        org.mockito.asm.ByteVector byteVector9 = byteVector7.putUTF8("");
        org.mockito.asm.ByteVector byteVector11 = byteVector9.putShort((int) (byte) -1);
        org.mockito.asm.ByteVector byteVector13 = byteVector9.putShort(0);
        org.mockito.asm.ByteVector byteVector15 = byteVector9.putUTF8("");
        org.mockito.asm.ByteVector byteVector17 = byteVector15.putByte((int) 'a');
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
    public void test1572() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1572");
        org.mockito.asm.ByteVector byteVector0 = new org.mockito.asm.ByteVector();
        org.mockito.asm.ByteVector byteVector2 = byteVector0.putUTF8("hi!");
        org.mockito.asm.ByteVector byteVector4 = byteVector2.putInt(0);
        org.mockito.asm.ByteVector byteVector6 = byteVector4.putByte((int) (byte) 1);
        org.mockito.asm.ByteVector byteVector8 = byteVector6.putUTF8("hi!");
        org.mockito.asm.ByteVector byteVector10 = byteVector6.putByte((int) (short) 0);
        org.mockito.asm.ByteVector byteVector12 = byteVector6.putLong((long) (byte) 0);
        org.mockito.asm.ByteVector byteVector14 = byteVector6.putInt((int) (byte) 100);
        org.mockito.asm.ByteVector byteVector16 = byteVector6.putInt((int) (short) 10);
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
    public void test1573() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1573");
        org.mockito.asm.ByteVector byteVector0 = new org.mockito.asm.ByteVector();
        org.mockito.asm.ByteVector byteVector2 = byteVector0.putUTF8("hi!");
        org.mockito.asm.ByteVector byteVector4 = byteVector0.putLong((long) ' ');
        org.mockito.asm.ByteVector byteVector6 = byteVector4.putByte((int) 'a');
        org.mockito.asm.ByteVector byteVector8 = byteVector6.putByte((int) (short) -1);
        org.mockito.asm.ByteVector byteVector10 = byteVector8.putLong((long) (byte) -1);
        org.mockito.asm.ByteVector byteVector12 = byteVector8.putByte((int) '4');
        org.mockito.asm.ByteVector byteVector14 = byteVector12.putLong((long) (short) 10);
        org.mockito.asm.ByteVector byteVector16 = byteVector14.putShort((int) (short) 0);
        org.mockito.asm.ByteVector byteVector18 = byteVector14.putShort((int) '4');
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
    public void test1574() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1574");
        org.mockito.asm.ByteVector byteVector0 = new org.mockito.asm.ByteVector();
        org.mockito.asm.ByteVector byteVector2 = byteVector0.putUTF8("hi!");
        org.mockito.asm.ByteVector byteVector4 = byteVector0.putLong((long) ' ');
        org.mockito.asm.ByteVector byteVector6 = byteVector4.putByte((int) 'a');
        org.mockito.asm.ByteVector byteVector8 = byteVector6.putByte((int) (short) -1);
        org.mockito.asm.ByteVector byteVector10 = byteVector8.putLong((long) (byte) -1);
        org.mockito.asm.ByteVector byteVector12 = byteVector8.putByte((int) '4');
        org.mockito.asm.ByteVector byteVector14 = byteVector12.putLong((long) (short) 10);
        org.mockito.asm.ByteVector byteVector16 = byteVector14.putByte((int) 'a');
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
    public void test1575() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1575");
        org.mockito.asm.ByteVector byteVector0 = new org.mockito.asm.ByteVector();
        org.mockito.asm.ByteVector byteVector2 = byteVector0.putUTF8("hi!");
        org.mockito.asm.ByteVector byteVector4 = byteVector0.putLong((long) (short) 1);
        org.mockito.asm.ByteVector byteVector6 = byteVector4.putUTF8("");
        org.mockito.asm.ByteVector byteVector8 = byteVector6.putShort((int) (short) 0);
        org.mockito.asm.ByteVector byteVector10 = byteVector6.putByte((int) ' ');
        org.mockito.asm.ByteVector byteVector12 = byteVector6.putShort(100);
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
        // The following exception was thrown during execution in test generation
        try {
            org.mockito.asm.ByteVector byteVector90 = byteVector12.putByteArray(byteArray72, (-1), (int) (byte) 10);
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
    }

    @Test
    public void test1576() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1576");
        org.mockito.asm.ByteVector byteVector0 = new org.mockito.asm.ByteVector();
        org.mockito.asm.ByteVector byteVector2 = byteVector0.putUTF8("hi!");
        org.mockito.asm.ByteVector byteVector4 = byteVector0.putShort((int) (short) -1);
        org.mockito.asm.ByteVector byteVector6 = byteVector0.putInt(0);
        org.mockito.asm.ByteVector byteVector8 = byteVector6.putByte(0);
        org.junit.Assert.assertNotNull(byteVector2);
        org.junit.Assert.assertNotNull(byteVector4);
        org.junit.Assert.assertNotNull(byteVector6);
        org.junit.Assert.assertNotNull(byteVector8);
    }

    @Test
    public void test1577() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1577");
        org.mockito.asm.ByteVector byteVector0 = new org.mockito.asm.ByteVector();
        org.mockito.asm.ByteVector byteVector2 = byteVector0.putUTF8("hi!");
        org.mockito.asm.ByteVector byteVector4 = byteVector2.putLong((long) (byte) 10);
        org.mockito.asm.ByteVector byteVector6 = byteVector4.putUTF8("hi!");
        org.mockito.asm.ByteVector byteVector8 = byteVector4.putLong((long) (short) -1);
        org.mockito.asm.ByteVector byteVector10 = byteVector8.putUTF8("hi!");
        org.mockito.asm.ByteVector byteVector12 = byteVector8.putByte((int) (byte) 1);
        org.mockito.asm.ByteVector byteVector14 = byteVector8.putUTF8("hi!");
        org.junit.Assert.assertNotNull(byteVector2);
        org.junit.Assert.assertNotNull(byteVector4);
        org.junit.Assert.assertNotNull(byteVector6);
        org.junit.Assert.assertNotNull(byteVector8);
        org.junit.Assert.assertNotNull(byteVector10);
        org.junit.Assert.assertNotNull(byteVector12);
        org.junit.Assert.assertNotNull(byteVector14);
    }

    @Test
    public void test1578() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1578");
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
            org.mockito.asm.ByteVector byteVector61 = byteVector16.putByteArray(byteArray49, (int) 'a', (int) (byte) -1);
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
    public void test1579() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1579");
        org.mockito.asm.ByteVector byteVector0 = new org.mockito.asm.ByteVector();
        org.mockito.asm.ByteVector byteVector2 = byteVector0.putUTF8("hi!");
        org.mockito.asm.ByteVector byteVector4 = byteVector2.putLong((long) (byte) 10);
        org.mockito.asm.ByteVector byteVector6 = byteVector4.putInt((int) 'a');
        org.mockito.asm.ByteVector byteVector8 = byteVector6.putUTF8("hi!");
        org.mockito.asm.ByteVector byteVector10 = byteVector8.putByte((-1));
        org.mockito.asm.ByteVector byteVector12 = byteVector8.putLong((long) (short) -1);
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
    public void test1580() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1580");
        org.mockito.asm.ByteVector byteVector1 = new org.mockito.asm.ByteVector((int) (short) 1);
        org.mockito.asm.ByteVector byteVector3 = byteVector1.putLong((long) (byte) 1);
        org.mockito.asm.ByteVector byteVector5 = byteVector1.putUTF8("");
        org.mockito.asm.ByteVector byteVector7 = byteVector5.putInt((int) '#');
        org.mockito.asm.ByteVector byteVector9 = byteVector5.putByte(1);
        org.mockito.asm.ByteVector byteVector11 = byteVector9.putLong(10L);
        org.mockito.asm.ByteVector byteVector13 = byteVector9.putLong(0L);
        org.junit.Assert.assertNotNull(byteVector3);
        org.junit.Assert.assertNotNull(byteVector5);
        org.junit.Assert.assertNotNull(byteVector7);
        org.junit.Assert.assertNotNull(byteVector9);
        org.junit.Assert.assertNotNull(byteVector11);
        org.junit.Assert.assertNotNull(byteVector13);
    }

    @Test
    public void test1581() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1581");
        org.mockito.asm.ByteVector byteVector1 = new org.mockito.asm.ByteVector((int) (byte) 10);
        org.mockito.asm.ByteVector byteVector3 = byteVector1.putByte((int) '4');
        org.mockito.asm.ByteVector byteVector5 = byteVector1.putLong((long) 'a');
        org.mockito.asm.ByteVector byteVector7 = byteVector5.putInt((int) (short) 10);
        org.mockito.asm.ByteVector byteVector9 = byteVector7.putUTF8("hi!");
        org.mockito.asm.ByteVector byteVector11 = byteVector7.putByte((int) '#');
        java.lang.Class<?> wildcardClass12 = byteVector7.getClass();
        org.junit.Assert.assertNotNull(byteVector3);
        org.junit.Assert.assertNotNull(byteVector5);
        org.junit.Assert.assertNotNull(byteVector7);
        org.junit.Assert.assertNotNull(byteVector9);
        org.junit.Assert.assertNotNull(byteVector11);
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test1582() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1582");
        org.mockito.asm.ByteVector byteVector0 = new org.mockito.asm.ByteVector();
        org.mockito.asm.ByteVector byteVector2 = byteVector0.putUTF8("hi!");
        org.mockito.asm.ByteVector byteVector4 = byteVector0.putShort((int) (short) -1);
        org.mockito.asm.ByteVector byteVector6 = byteVector0.putByte((-1));
        org.mockito.asm.ByteVector byteVector8 = byteVector0.putShort(0);
        org.junit.Assert.assertNotNull(byteVector2);
        org.junit.Assert.assertNotNull(byteVector4);
        org.junit.Assert.assertNotNull(byteVector6);
        org.junit.Assert.assertNotNull(byteVector8);
    }

    @Test
    public void test1583() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1583");
        org.mockito.asm.ByteVector byteVector0 = new org.mockito.asm.ByteVector();
        org.mockito.asm.ByteVector byteVector2 = byteVector0.putUTF8("hi!");
        org.mockito.asm.ByteVector byteVector4 = byteVector0.putLong((long) ' ');
        org.mockito.asm.ByteVector byteVector6 = byteVector4.putByte((int) 'a');
        org.mockito.asm.ByteVector byteVector8 = byteVector4.putByte((int) (short) -1);
        org.mockito.asm.ByteVector byteVector10 = byteVector4.putLong(0L);
        org.mockito.asm.ByteVector byteVector12 = byteVector10.putByte(0);
        org.mockito.asm.ByteVector byteVector14 = byteVector10.putShort((int) (byte) -1);
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
    public void test1584() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1584");
        org.mockito.asm.ByteVector byteVector1 = new org.mockito.asm.ByteVector((int) '#');
        org.mockito.asm.ByteVector byteVector3 = byteVector1.putLong(100L);
        org.mockito.asm.ByteVector byteVector5 = byteVector3.putUTF8("");
        org.mockito.asm.ByteVector byteVector7 = byteVector5.putShort(0);
        org.mockito.asm.ByteVector byteVector9 = byteVector7.putByte((int) '#');
        org.junit.Assert.assertNotNull(byteVector3);
        org.junit.Assert.assertNotNull(byteVector5);
        org.junit.Assert.assertNotNull(byteVector7);
        org.junit.Assert.assertNotNull(byteVector9);
    }

    @Test
    public void test1585() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1585");
        org.mockito.asm.ByteVector byteVector1 = new org.mockito.asm.ByteVector((int) (byte) 100);
        org.mockito.asm.ByteVector byteVector3 = byteVector1.putShort((int) (short) 100);
        org.mockito.asm.ByteVector byteVector5 = byteVector3.putShort((int) (byte) -1);
        org.mockito.asm.ByteVector byteVector7 = byteVector3.putLong((long) (short) 10);
        org.mockito.asm.ByteVector byteVector9 = byteVector3.putInt((int) (short) 0);
        org.mockito.asm.ByteVector byteVector11 = byteVector3.putLong((long) (byte) 0);
        org.junit.Assert.assertNotNull(byteVector3);
        org.junit.Assert.assertNotNull(byteVector5);
        org.junit.Assert.assertNotNull(byteVector7);
        org.junit.Assert.assertNotNull(byteVector9);
        org.junit.Assert.assertNotNull(byteVector11);
    }

    @Test
    public void test1586() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1586");
        org.mockito.asm.ByteVector byteVector0 = new org.mockito.asm.ByteVector();
        org.mockito.asm.ByteVector byteVector2 = byteVector0.putUTF8("hi!");
        org.mockito.asm.ByteVector byteVector4 = byteVector2.putInt(0);
        org.mockito.asm.ByteVector byteVector6 = byteVector2.putByte((int) (byte) 10);
        org.mockito.asm.ByteVector byteVector8 = byteVector6.putLong((-1L));
        org.mockito.asm.ByteVector byteVector10 = byteVector6.putInt((int) (byte) 100);
        org.mockito.asm.ByteVector byteVector12 = byteVector6.putShort(10);
        org.mockito.asm.ByteVector byteVector14 = byteVector12.putInt((int) (short) -1);
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
    public void test1587() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1587");
        org.mockito.asm.ByteVector byteVector1 = new org.mockito.asm.ByteVector((int) (byte) 100);
        org.mockito.asm.ByteVector byteVector3 = byteVector1.putInt(0);
        org.mockito.asm.ByteVector byteVector5 = byteVector3.putLong((long) (byte) 1);
        org.mockito.asm.ByteVector byteVector7 = byteVector5.putInt((int) (short) 0);
        org.junit.Assert.assertNotNull(byteVector3);
        org.junit.Assert.assertNotNull(byteVector5);
        org.junit.Assert.assertNotNull(byteVector7);
    }

    @Test
    public void test1588() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1588");
        org.mockito.asm.ByteVector byteVector0 = new org.mockito.asm.ByteVector();
        org.mockito.asm.ByteVector byteVector2 = byteVector0.putUTF8("hi!");
        org.mockito.asm.ByteVector byteVector4 = byteVector0.putShort((int) (short) -1);
        org.mockito.asm.ByteVector byteVector6 = byteVector0.putLong(0L);
        org.mockito.asm.ByteVector byteVector8 = byteVector0.putShort((int) (byte) -1);
        org.mockito.asm.ByteVector byteVector10 = byteVector8.putByte((int) (byte) 0);
        org.mockito.asm.ByteVector byteVector12 = byteVector10.putUTF8("hi!");
        org.mockito.asm.ByteVector byteVector14 = byteVector10.putShort((-1));
        org.mockito.asm.ByteVector byteVector16 = byteVector10.putUTF8("hi!");
        org.mockito.asm.ByteVector byteVector18 = byteVector16.putUTF8("");
        org.mockito.asm.ByteVector byteVector19 = new org.mockito.asm.ByteVector();
        org.mockito.asm.ByteVector byteVector21 = byteVector19.putUTF8("hi!");
        org.mockito.asm.ByteVector byteVector23 = byteVector19.putInt(0);
        org.mockito.asm.ByteVector byteVector25 = byteVector23.putByte((int) (byte) -1);
        org.mockito.asm.ByteVector byteVector27 = byteVector23.putShort((int) '4');
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
            org.mockito.asm.ByteVector byteVector60 = byteVector18.putByteArray(byteArray51, 1, 100);
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
        org.junit.Assert.assertNotNull(byteArray51);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray51), "[1, 0, 0, -1]");
        org.junit.Assert.assertNotNull(byteVector54);
        org.junit.Assert.assertNotNull(byteVector57);
    }

    @Test
    public void test1589() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1589");
        org.mockito.asm.ByteVector byteVector0 = new org.mockito.asm.ByteVector();
        org.mockito.asm.ByteVector byteVector2 = byteVector0.putUTF8("hi!");
        org.mockito.asm.ByteVector byteVector4 = byteVector2.putInt(0);
        org.mockito.asm.ByteVector byteVector6 = byteVector4.putByte((int) (byte) 1);
        org.mockito.asm.ByteVector byteVector8 = byteVector6.putLong(1L);
        org.mockito.asm.ByteVector byteVector10 = byteVector8.putShort((int) ' ');
        org.junit.Assert.assertNotNull(byteVector2);
        org.junit.Assert.assertNotNull(byteVector4);
        org.junit.Assert.assertNotNull(byteVector6);
        org.junit.Assert.assertNotNull(byteVector8);
        org.junit.Assert.assertNotNull(byteVector10);
    }

    @Test
    public void test1590() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1590");
        org.mockito.asm.ByteVector byteVector0 = new org.mockito.asm.ByteVector();
        org.mockito.asm.ByteVector byteVector2 = byteVector0.putUTF8("hi!");
        org.mockito.asm.ByteVector byteVector4 = byteVector0.putLong((long) ' ');
        org.mockito.asm.ByteVector byteVector6 = byteVector4.putByte((int) 'a');
        org.mockito.asm.ByteVector byteVector8 = byteVector4.putByte((int) (short) -1);
        org.mockito.asm.ByteVector byteVector10 = byteVector8.putByte((-1));
        org.mockito.asm.ByteVector byteVector12 = byteVector10.putShort((int) (short) -1);
        org.mockito.asm.ByteVector byteVector14 = byteVector10.putLong((long) (short) 0);
        org.mockito.asm.ByteVector byteVector16 = byteVector10.putShort((int) (short) 10);
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
    public void test1591() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1591");
        org.mockito.asm.ByteVector byteVector0 = new org.mockito.asm.ByteVector();
        org.mockito.asm.ByteVector byteVector2 = byteVector0.putUTF8("hi!");
        org.mockito.asm.ByteVector byteVector4 = byteVector0.putLong((long) ' ');
        org.mockito.asm.ByteVector byteVector6 = byteVector4.putByte((int) 'a');
        org.mockito.asm.ByteVector byteVector8 = byteVector6.putInt((int) (short) 0);
        org.mockito.asm.ByteVector byteVector10 = byteVector6.putInt((int) (short) 1);
        org.mockito.asm.ByteVector byteVector12 = byteVector6.putShort((int) (short) 100);
        org.junit.Assert.assertNotNull(byteVector2);
        org.junit.Assert.assertNotNull(byteVector4);
        org.junit.Assert.assertNotNull(byteVector6);
        org.junit.Assert.assertNotNull(byteVector8);
        org.junit.Assert.assertNotNull(byteVector10);
        org.junit.Assert.assertNotNull(byteVector12);
    }

    @Test
    public void test1592() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1592");
        org.mockito.asm.ByteVector byteVector0 = new org.mockito.asm.ByteVector();
        org.mockito.asm.ByteVector byteVector2 = byteVector0.putUTF8("hi!");
        org.mockito.asm.ByteVector byteVector4 = byteVector0.putShort((int) (short) -1);
        org.mockito.asm.ByteVector byteVector6 = byteVector0.putInt((int) (byte) 10);
        org.mockito.asm.ByteVector byteVector8 = byteVector6.putUTF8("hi!");
        org.mockito.asm.ByteVector byteVector10 = byteVector6.putLong((long) '#');
        org.mockito.asm.ByteVector byteVector12 = byteVector10.putShort(0);
        org.mockito.asm.ByteVector byteVector14 = byteVector12.putShort((int) (short) 1);
        org.mockito.asm.ByteVector byteVector16 = byteVector12.putShort(10);
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
            org.mockito.asm.ByteVector byteVector46 = byteVector16.putByteArray(byteArray40, 0, (int) (short) 10);
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
    public void test1593() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1593");
        org.mockito.asm.ByteVector byteVector0 = new org.mockito.asm.ByteVector();
        org.mockito.asm.ByteVector byteVector2 = byteVector0.putUTF8("hi!");
        org.mockito.asm.ByteVector byteVector4 = byteVector0.putShort((int) (short) -1);
        org.mockito.asm.ByteVector byteVector6 = byteVector0.putInt((int) (byte) 10);
        org.mockito.asm.ByteVector byteVector8 = byteVector0.putLong((long) (byte) 0);
        org.mockito.asm.ByteVector byteVector10 = byteVector0.putLong((long) (byte) 100);
        org.mockito.asm.ByteVector byteVector12 = byteVector0.putUTF8("");
        org.mockito.asm.ByteVector byteVector14 = byteVector0.putLong((long) 1);
        org.junit.Assert.assertNotNull(byteVector2);
        org.junit.Assert.assertNotNull(byteVector4);
        org.junit.Assert.assertNotNull(byteVector6);
        org.junit.Assert.assertNotNull(byteVector8);
        org.junit.Assert.assertNotNull(byteVector10);
        org.junit.Assert.assertNotNull(byteVector12);
        org.junit.Assert.assertNotNull(byteVector14);
    }

    @Test
    public void test1594() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1594");
        org.mockito.asm.ByteVector byteVector1 = new org.mockito.asm.ByteVector((int) (short) 1);
        org.mockito.asm.ByteVector byteVector3 = byteVector1.putLong((long) (byte) 1);
        org.mockito.asm.ByteVector byteVector5 = byteVector1.putInt(1);
        org.mockito.asm.ByteVector byteVector7 = byteVector1.putInt(100);
        org.mockito.asm.ByteVector byteVector9 = byteVector1.putInt((int) (short) -1);
        org.mockito.asm.ByteVector byteVector11 = byteVector9.putShort((int) (byte) 1);
        org.junit.Assert.assertNotNull(byteVector3);
        org.junit.Assert.assertNotNull(byteVector5);
        org.junit.Assert.assertNotNull(byteVector7);
        org.junit.Assert.assertNotNull(byteVector9);
        org.junit.Assert.assertNotNull(byteVector11);
    }

    @Test
    public void test1595() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1595");
        org.mockito.asm.ByteVector byteVector0 = new org.mockito.asm.ByteVector();
        org.mockito.asm.ByteVector byteVector2 = byteVector0.putUTF8("hi!");
        org.mockito.asm.ByteVector byteVector4 = byteVector2.putLong((long) (byte) 10);
        org.mockito.asm.ByteVector byteVector6 = byteVector4.putUTF8("hi!");
        org.mockito.asm.ByteVector byteVector8 = byteVector4.putLong((long) (short) -1);
        java.lang.Class<?> wildcardClass9 = byteVector8.getClass();
        org.junit.Assert.assertNotNull(byteVector2);
        org.junit.Assert.assertNotNull(byteVector4);
        org.junit.Assert.assertNotNull(byteVector6);
        org.junit.Assert.assertNotNull(byteVector8);
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test1596() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1596");
        org.mockito.asm.ByteVector byteVector0 = new org.mockito.asm.ByteVector();
        org.mockito.asm.ByteVector byteVector2 = byteVector0.putUTF8("hi!");
        org.mockito.asm.ByteVector byteVector4 = byteVector2.putInt(0);
        org.mockito.asm.ByteVector byteVector6 = byteVector2.putByte((int) (byte) 10);
        org.mockito.asm.ByteVector byteVector8 = byteVector6.putByte((int) (short) 1);
        org.mockito.asm.ByteVector byteVector10 = byteVector8.putLong(100L);
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
            org.mockito.asm.ByteVector byteVector73 = byteVector10.putByteArray(byteArray61, (int) (short) -1, (int) ' ');
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
    public void test1597() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1597");
        org.mockito.asm.ByteVector byteVector1 = new org.mockito.asm.ByteVector((int) '#');
        org.mockito.asm.ByteVector byteVector3 = byteVector1.putLong(100L);
        org.mockito.asm.ByteVector byteVector5 = byteVector1.putUTF8("");
        org.mockito.asm.ByteVector byteVector7 = byteVector5.putInt((int) (byte) 10);
        org.mockito.asm.ByteVector byteVector9 = byteVector7.putByte((int) '#');
        org.mockito.asm.ByteVector byteVector11 = byteVector9.putInt((int) (short) 0);
        org.mockito.asm.ByteVector byteVector13 = byteVector11.putShort((int) (short) 100);
        org.mockito.asm.ByteVector byteVector15 = byteVector11.putShort((int) (short) 100);
        org.junit.Assert.assertNotNull(byteVector3);
        org.junit.Assert.assertNotNull(byteVector5);
        org.junit.Assert.assertNotNull(byteVector7);
        org.junit.Assert.assertNotNull(byteVector9);
        org.junit.Assert.assertNotNull(byteVector11);
        org.junit.Assert.assertNotNull(byteVector13);
        org.junit.Assert.assertNotNull(byteVector15);
    }

    @Test
    public void test1598() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1598");
        org.mockito.asm.ByteVector byteVector1 = new org.mockito.asm.ByteVector((int) '#');
        org.mockito.asm.ByteVector byteVector3 = byteVector1.putLong(100L);
        org.mockito.asm.ByteVector byteVector5 = byteVector1.putUTF8("");
        org.mockito.asm.ByteVector byteVector7 = byteVector1.putUTF8("");
        org.mockito.asm.ByteVector byteVector9 = byteVector7.putShort((int) 'a');
        org.junit.Assert.assertNotNull(byteVector3);
        org.junit.Assert.assertNotNull(byteVector5);
        org.junit.Assert.assertNotNull(byteVector7);
        org.junit.Assert.assertNotNull(byteVector9);
    }

    @Test
    public void test1599() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1599");
        org.mockito.asm.ByteVector byteVector1 = new org.mockito.asm.ByteVector((int) '#');
        org.mockito.asm.ByteVector byteVector3 = byteVector1.putInt(100);
        org.mockito.asm.ByteVector byteVector5 = byteVector3.putShort((int) (short) -1);
        org.mockito.asm.ByteVector byteVector7 = byteVector3.putShort(10);
        org.mockito.asm.ByteVector byteVector9 = byteVector7.putUTF8("");
        org.mockito.asm.ByteVector byteVector11 = byteVector9.putLong((long) (short) 10);
        org.junit.Assert.assertNotNull(byteVector3);
        org.junit.Assert.assertNotNull(byteVector5);
        org.junit.Assert.assertNotNull(byteVector7);
        org.junit.Assert.assertNotNull(byteVector9);
        org.junit.Assert.assertNotNull(byteVector11);
    }

    @Test
    public void test1600() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1600");
        org.mockito.asm.ByteVector byteVector0 = new org.mockito.asm.ByteVector();
        org.mockito.asm.ByteVector byteVector2 = byteVector0.putUTF8("hi!");
        org.mockito.asm.ByteVector byteVector4 = byteVector2.putLong((long) (byte) 10);
        org.mockito.asm.ByteVector byteVector6 = byteVector4.putUTF8("hi!");
        org.mockito.asm.ByteVector byteVector8 = byteVector4.putLong((-1L));
        org.mockito.asm.ByteVector byteVector10 = byteVector8.putInt(10);
        org.mockito.asm.ByteVector byteVector12 = byteVector10.putShort((-1));
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
    public void test1601() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1601");
        org.mockito.asm.ByteVector byteVector1 = new org.mockito.asm.ByteVector((int) '#');
        org.mockito.asm.ByteVector byteVector3 = byteVector1.putInt(100);
        org.mockito.asm.ByteVector byteVector5 = byteVector3.putShort((int) (short) -1);
        org.mockito.asm.ByteVector byteVector7 = byteVector3.putUTF8("hi!");
        org.mockito.asm.ByteVector byteVector9 = byteVector7.putShort((int) '#');
        org.junit.Assert.assertNotNull(byteVector3);
        org.junit.Assert.assertNotNull(byteVector5);
        org.junit.Assert.assertNotNull(byteVector7);
        org.junit.Assert.assertNotNull(byteVector9);
    }

    @Test
    public void test1602() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1602");
        org.mockito.asm.ByteVector byteVector1 = new org.mockito.asm.ByteVector((int) '#');
        org.mockito.asm.ByteVector byteVector3 = byteVector1.putShort(0);
        org.mockito.asm.ByteVector byteVector4 = new org.mockito.asm.ByteVector();
        org.mockito.asm.ByteVector byteVector6 = byteVector4.putUTF8("hi!");
        org.mockito.asm.ByteVector byteVector8 = byteVector6.putInt(0);
        org.mockito.asm.ByteVector byteVector10 = byteVector8.putByte((int) (short) 0);
        org.mockito.asm.ByteVector byteVector12 = byteVector8.putUTF8("");
        org.mockito.asm.ByteVector byteVector13 = new org.mockito.asm.ByteVector();
        org.mockito.asm.ByteVector byteVector15 = byteVector13.putUTF8("hi!");
        org.mockito.asm.ByteVector byteVector17 = byteVector13.putInt(0);
        org.mockito.asm.ByteVector byteVector19 = byteVector13.putShort((int) '4');
        org.mockito.asm.ByteVector byteVector21 = byteVector13.putByte(100);
        org.mockito.asm.ByteVector byteVector23 = byteVector21.putInt((int) (byte) 10);
        org.mockito.asm.ByteVector byteVector25 = byteVector21.putInt((int) (byte) 10);
        org.mockito.asm.ByteVector byteVector27 = byteVector25.putByte(100);
        org.mockito.asm.ByteVector byteVector28 = new org.mockito.asm.ByteVector();
        org.mockito.asm.ByteVector byteVector30 = byteVector28.putUTF8("hi!");
        org.mockito.asm.ByteVector byteVector32 = byteVector28.putInt(0);
        org.mockito.asm.ByteVector byteVector34 = byteVector32.putInt((int) ' ');
        org.mockito.asm.ByteVector byteVector36 = byteVector34.putLong(100L);
        byte[] byteArray40 = new byte[] { (byte) 0, (byte) 10, (byte) 1 };
        org.mockito.asm.ByteVector byteVector43 = byteVector34.putByteArray(byteArray40, 0, 0);
        org.mockito.asm.ByteVector byteVector46 = byteVector27.putByteArray(byteArray40, (int) (byte) 1, (int) (byte) 0);
        org.mockito.asm.ByteVector byteVector49 = byteVector8.putByteArray(byteArray40, (int) (short) 0, 0);
        // The following exception was thrown during execution in test generation
        try {
            org.mockito.asm.ByteVector byteVector52 = byteVector1.putByteArray(byteArray40, 100, (int) (short) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteVector3);
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
    public void test1603() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1603");
        org.mockito.asm.ByteVector byteVector1 = new org.mockito.asm.ByteVector((int) (byte) 1);
        org.mockito.asm.ByteVector byteVector3 = byteVector1.putByte((int) (byte) 10);
        org.mockito.asm.ByteVector byteVector5 = byteVector3.putShort((int) (short) 10);
        org.mockito.asm.ByteVector byteVector7 = byteVector3.putUTF8("");
        org.mockito.asm.ByteVector byteVector9 = byteVector7.putLong((long) 'a');
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
    public void test1604() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1604");
        org.mockito.asm.ByteVector byteVector0 = new org.mockito.asm.ByteVector();
        org.mockito.asm.ByteVector byteVector2 = byteVector0.putUTF8("hi!");
        org.mockito.asm.ByteVector byteVector4 = byteVector0.putInt(0);
        org.mockito.asm.ByteVector byteVector6 = byteVector0.putShort(10);
        org.mockito.asm.ByteVector byteVector8 = byteVector0.putLong((long) '#');
        org.mockito.asm.ByteVector byteVector10 = byteVector8.putShort((int) (byte) 0);
        org.mockito.asm.ByteVector byteVector12 = byteVector10.putShort((int) (byte) 1);
        org.junit.Assert.assertNotNull(byteVector2);
        org.junit.Assert.assertNotNull(byteVector4);
        org.junit.Assert.assertNotNull(byteVector6);
        org.junit.Assert.assertNotNull(byteVector8);
        org.junit.Assert.assertNotNull(byteVector10);
        org.junit.Assert.assertNotNull(byteVector12);
    }

    @Test
    public void test1605() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1605");
        org.mockito.asm.ByteVector byteVector0 = new org.mockito.asm.ByteVector();
        org.mockito.asm.ByteVector byteVector2 = byteVector0.putUTF8("hi!");
        org.mockito.asm.ByteVector byteVector4 = byteVector0.putLong((long) ' ');
        org.mockito.asm.ByteVector byteVector6 = byteVector4.putByte((int) 'a');
        org.mockito.asm.ByteVector byteVector8 = byteVector4.putByte((int) (short) -1);
        org.mockito.asm.ByteVector byteVector10 = byteVector4.putLong(0L);
        org.mockito.asm.ByteVector byteVector12 = byteVector10.putByte(0);
        org.mockito.asm.ByteVector byteVector14 = byteVector12.putByte(100);
        org.mockito.asm.ByteVector byteVector16 = byteVector14.putUTF8("hi!");
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
    public void test1606() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1606");
        org.mockito.asm.ByteVector byteVector0 = new org.mockito.asm.ByteVector();
        org.mockito.asm.ByteVector byteVector2 = byteVector0.putUTF8("hi!");
        org.mockito.asm.ByteVector byteVector4 = byteVector0.putLong((long) (short) 1);
        org.mockito.asm.ByteVector byteVector6 = byteVector4.putUTF8("");
        org.mockito.asm.ByteVector byteVector8 = byteVector6.putShort((int) (short) 0);
        org.mockito.asm.ByteVector byteVector10 = byteVector6.putByte((int) ' ');
        org.mockito.asm.ByteVector byteVector12 = byteVector6.putShort(100);
        org.mockito.asm.ByteVector byteVector14 = byteVector12.putLong((long) 1);
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
    public void test1607() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1607");
        org.mockito.asm.ByteVector byteVector1 = new org.mockito.asm.ByteVector((int) '#');
        org.mockito.asm.ByteVector byteVector3 = byteVector1.putLong(100L);
        org.mockito.asm.ByteVector byteVector5 = byteVector3.putByte((int) (byte) 0);
        org.mockito.asm.ByteVector byteVector7 = new org.mockito.asm.ByteVector((int) (byte) 1);
        org.mockito.asm.ByteVector byteVector9 = byteVector7.putByte((int) (short) 1);
        org.mockito.asm.ByteVector byteVector11 = byteVector7.putShort((int) (byte) 1);
        org.mockito.asm.ByteVector byteVector13 = new org.mockito.asm.ByteVector((int) (byte) 100);
        org.mockito.asm.ByteVector byteVector15 = byteVector13.putShort((int) (short) 100);
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
        org.mockito.asm.ByteVector byteVector56 = byteVector13.putByteArray(byteArray47, 0, (int) (byte) 1);
        org.mockito.asm.ByteVector byteVector59 = byteVector11.putByteArray(byteArray47, 0, 0);
        // The following exception was thrown during execution in test generation
        try {
            org.mockito.asm.ByteVector byteVector62 = byteVector3.putByteArray(byteArray47, (int) '#', 10);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteVector3);
        org.junit.Assert.assertNotNull(byteVector5);
        org.junit.Assert.assertNotNull(byteVector9);
        org.junit.Assert.assertNotNull(byteVector11);
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
        org.junit.Assert.assertNotNull(byteVector59);
    }

    @Test
    public void test1608() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1608");
        org.mockito.asm.ByteVector byteVector1 = new org.mockito.asm.ByteVector((int) '#');
        org.mockito.asm.ByteVector byteVector3 = byteVector1.putInt(100);
        org.mockito.asm.ByteVector byteVector5 = byteVector3.putUTF8("hi!");
        org.mockito.asm.ByteVector byteVector7 = byteVector3.putByte((int) '#');
        java.lang.Class<?> wildcardClass8 = byteVector3.getClass();
        org.junit.Assert.assertNotNull(byteVector3);
        org.junit.Assert.assertNotNull(byteVector5);
        org.junit.Assert.assertNotNull(byteVector7);
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test1609() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1609");
        org.mockito.asm.ByteVector byteVector0 = new org.mockito.asm.ByteVector();
        org.mockito.asm.ByteVector byteVector2 = byteVector0.putUTF8("hi!");
        org.mockito.asm.ByteVector byteVector4 = byteVector0.putShort((int) (short) -1);
        org.mockito.asm.ByteVector byteVector6 = byteVector0.putInt((int) (byte) 10);
        org.mockito.asm.ByteVector byteVector8 = byteVector0.putUTF8("hi!");
        org.mockito.asm.ByteVector byteVector10 = byteVector0.putInt((int) ' ');
        org.junit.Assert.assertNotNull(byteVector2);
        org.junit.Assert.assertNotNull(byteVector4);
        org.junit.Assert.assertNotNull(byteVector6);
        org.junit.Assert.assertNotNull(byteVector8);
        org.junit.Assert.assertNotNull(byteVector10);
    }

    @Test
    public void test1610() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1610");
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
        org.mockito.asm.ByteVector byteVector27 = new org.mockito.asm.ByteVector();
        org.mockito.asm.ByteVector byteVector29 = byteVector27.putUTF8("hi!");
        org.mockito.asm.ByteVector byteVector31 = byteVector27.putLong((long) ' ');
        org.mockito.asm.ByteVector byteVector33 = byteVector31.putByte((int) 'a');
        org.mockito.asm.ByteVector byteVector35 = byteVector33.putByte((int) (short) -1);
        org.mockito.asm.ByteVector byteVector37 = byteVector35.putLong((long) (byte) -1);
        org.mockito.asm.ByteVector byteVector39 = byteVector35.putByte((int) '4');
        org.mockito.asm.ByteVector byteVector41 = byteVector39.putLong((long) (short) 10);
        org.mockito.asm.ByteVector byteVector43 = new org.mockito.asm.ByteVector((int) '#');
        org.mockito.asm.ByteVector byteVector45 = byteVector43.putInt(100);
        org.mockito.asm.ByteVector byteVector47 = byteVector45.putShort((int) (short) -1);
        org.mockito.asm.ByteVector byteVector49 = byteVector47.putShort((int) (short) 0);
        org.mockito.asm.ByteVector byteVector51 = byteVector47.putUTF8("");
        org.mockito.asm.ByteVector byteVector52 = new org.mockito.asm.ByteVector();
        org.mockito.asm.ByteVector byteVector54 = byteVector52.putUTF8("hi!");
        org.mockito.asm.ByteVector byteVector56 = byteVector52.putLong((long) ' ');
        org.mockito.asm.ByteVector byteVector58 = byteVector56.putByte((int) 'a');
        org.mockito.asm.ByteVector byteVector60 = byteVector56.putByte((int) (short) -1);
        org.mockito.asm.ByteVector byteVector62 = byteVector56.putLong(0L);
        org.mockito.asm.ByteVector byteVector64 = byteVector56.putUTF8("hi!");
        org.mockito.asm.ByteVector byteVector66 = byteVector64.putUTF8("");
        org.mockito.asm.ByteVector byteVector68 = byteVector64.putInt((int) (byte) 10);
        org.mockito.asm.ByteVector byteVector70 = byteVector64.putByte(0);
        org.mockito.asm.ByteVector byteVector71 = new org.mockito.asm.ByteVector();
        org.mockito.asm.ByteVector byteVector73 = byteVector71.putUTF8("hi!");
        org.mockito.asm.ByteVector byteVector75 = byteVector71.putInt(0);
        org.mockito.asm.ByteVector byteVector77 = byteVector75.putInt((int) ' ');
        org.mockito.asm.ByteVector byteVector79 = byteVector77.putLong(100L);
        byte[] byteArray83 = new byte[] { (byte) 0, (byte) 10, (byte) 1 };
        org.mockito.asm.ByteVector byteVector86 = byteVector77.putByteArray(byteArray83, 0, 0);
        org.mockito.asm.ByteVector byteVector89 = byteVector70.putByteArray(byteArray83, (int) (short) 1, 0);
        org.mockito.asm.ByteVector byteVector92 = byteVector47.putByteArray(byteArray83, 1, 1);
        org.mockito.asm.ByteVector byteVector95 = byteVector39.putByteArray(byteArray83, (int) (short) 0, 0);
        // The following exception was thrown during execution in test generation
        try {
            org.mockito.asm.ByteVector byteVector98 = byteVector26.putByteArray(byteArray83, (int) (short) 100, (int) (byte) 10);
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
        org.junit.Assert.assertNotNull(byteVector26);
        org.junit.Assert.assertNotNull(byteVector29);
        org.junit.Assert.assertNotNull(byteVector31);
        org.junit.Assert.assertNotNull(byteVector33);
        org.junit.Assert.assertNotNull(byteVector35);
        org.junit.Assert.assertNotNull(byteVector37);
        org.junit.Assert.assertNotNull(byteVector39);
        org.junit.Assert.assertNotNull(byteVector41);
        org.junit.Assert.assertNotNull(byteVector45);
        org.junit.Assert.assertNotNull(byteVector47);
        org.junit.Assert.assertNotNull(byteVector49);
        org.junit.Assert.assertNotNull(byteVector51);
        org.junit.Assert.assertNotNull(byteVector54);
        org.junit.Assert.assertNotNull(byteVector56);
        org.junit.Assert.assertNotNull(byteVector58);
        org.junit.Assert.assertNotNull(byteVector60);
        org.junit.Assert.assertNotNull(byteVector62);
        org.junit.Assert.assertNotNull(byteVector64);
        org.junit.Assert.assertNotNull(byteVector66);
        org.junit.Assert.assertNotNull(byteVector68);
        org.junit.Assert.assertNotNull(byteVector70);
        org.junit.Assert.assertNotNull(byteVector73);
        org.junit.Assert.assertNotNull(byteVector75);
        org.junit.Assert.assertNotNull(byteVector77);
        org.junit.Assert.assertNotNull(byteVector79);
        org.junit.Assert.assertNotNull(byteArray83);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray83), "[0, 10, 1]");
        org.junit.Assert.assertNotNull(byteVector86);
        org.junit.Assert.assertNotNull(byteVector89);
        org.junit.Assert.assertNotNull(byteVector92);
        org.junit.Assert.assertNotNull(byteVector95);
    }

    @Test
    public void test1611() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1611");
        org.mockito.asm.ByteVector byteVector1 = new org.mockito.asm.ByteVector((int) '#');
        org.mockito.asm.ByteVector byteVector3 = byteVector1.putInt(100);
        org.mockito.asm.ByteVector byteVector5 = byteVector3.putShort((int) (short) -1);
        org.mockito.asm.ByteVector byteVector7 = byteVector5.putShort((int) (short) 0);
        org.mockito.asm.ByteVector byteVector9 = byteVector7.putShort(0);
        org.mockito.asm.ByteVector byteVector11 = byteVector9.putInt((int) (byte) -1);
        org.mockito.asm.ByteVector byteVector13 = byteVector9.putInt((int) (short) 100);
        org.junit.Assert.assertNotNull(byteVector3);
        org.junit.Assert.assertNotNull(byteVector5);
        org.junit.Assert.assertNotNull(byteVector7);
        org.junit.Assert.assertNotNull(byteVector9);
        org.junit.Assert.assertNotNull(byteVector11);
        org.junit.Assert.assertNotNull(byteVector13);
    }

    @Test
    public void test1612() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1612");
        org.mockito.asm.ByteVector byteVector0 = new org.mockito.asm.ByteVector();
        org.mockito.asm.ByteVector byteVector2 = byteVector0.putUTF8("hi!");
        org.mockito.asm.ByteVector byteVector4 = byteVector0.putLong((long) ' ');
        org.mockito.asm.ByteVector byteVector6 = byteVector4.putByte((int) 'a');
        org.mockito.asm.ByteVector byteVector8 = byteVector6.putInt((int) (short) 0);
        org.mockito.asm.ByteVector byteVector10 = byteVector8.putByte((int) (short) 0);
        org.mockito.asm.ByteVector byteVector12 = byteVector10.putUTF8("");
        org.mockito.asm.ByteVector byteVector14 = byteVector12.putUTF8("hi!");
        byte[] byteArray15 = null;
        org.mockito.asm.ByteVector byteVector18 = byteVector14.putByteArray(byteArray15, (int) (short) 1, 10);
        org.mockito.asm.ByteVector byteVector20 = byteVector14.putLong((long) '4');
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
    public void test1613() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1613");
        org.mockito.asm.ByteVector byteVector0 = new org.mockito.asm.ByteVector();
        org.mockito.asm.ByteVector byteVector2 = byteVector0.putUTF8("hi!");
        org.mockito.asm.ByteVector byteVector4 = byteVector2.putInt(0);
        org.mockito.asm.ByteVector byteVector6 = byteVector2.putByte((int) (byte) 10);
        org.mockito.asm.ByteVector byteVector8 = byteVector6.putUTF8("hi!");
        org.mockito.asm.ByteVector byteVector10 = byteVector8.putUTF8("hi!");
        org.mockito.asm.ByteVector byteVector12 = byteVector10.putByte((int) (short) -1);
        org.mockito.asm.ByteVector byteVector14 = byteVector10.putLong((long) 1);
        org.mockito.asm.ByteVector byteVector16 = byteVector14.putUTF8("hi!");
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
    public void test1614() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1614");
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
    public void test1615() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1615");
        org.mockito.asm.ByteVector byteVector0 = new org.mockito.asm.ByteVector();
        org.mockito.asm.ByteVector byteVector2 = byteVector0.putUTF8("hi!");
        org.mockito.asm.ByteVector byteVector4 = byteVector0.putLong((long) ' ');
        org.mockito.asm.ByteVector byteVector6 = byteVector4.putByte((int) 'a');
        org.mockito.asm.ByteVector byteVector8 = byteVector6.putInt((int) (short) 0);
        org.mockito.asm.ByteVector byteVector10 = byteVector8.putByte((int) (short) 0);
        org.mockito.asm.ByteVector byteVector12 = byteVector10.putUTF8("");
        org.mockito.asm.ByteVector byteVector14 = byteVector12.putUTF8("hi!");
        byte[] byteArray15 = null;
        org.mockito.asm.ByteVector byteVector18 = byteVector14.putByteArray(byteArray15, (int) (short) 1, 10);
        org.mockito.asm.ByteVector byteVector20 = byteVector14.putLong((long) (short) -1);
        org.mockito.asm.ByteVector byteVector22 = byteVector14.putLong(0L);
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
    }

    @Test
    public void test1616() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1616");
        org.mockito.asm.ByteVector byteVector0 = new org.mockito.asm.ByteVector();
        org.mockito.asm.ByteVector byteVector2 = byteVector0.putUTF8("hi!");
        org.mockito.asm.ByteVector byteVector4 = byteVector0.putInt(0);
        org.mockito.asm.ByteVector byteVector6 = byteVector0.putShort((int) '4');
        org.mockito.asm.ByteVector byteVector8 = byteVector0.putByte(100);
        org.mockito.asm.ByteVector byteVector10 = byteVector8.putInt((int) (byte) 10);
        org.mockito.asm.ByteVector byteVector12 = byteVector10.putByte((int) (byte) 1);
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
    public void test1617() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1617");
        org.mockito.asm.ByteVector byteVector0 = new org.mockito.asm.ByteVector();
        org.mockito.asm.ByteVector byteVector2 = byteVector0.putUTF8("hi!");
        org.mockito.asm.ByteVector byteVector4 = byteVector0.putLong((long) ' ');
        org.mockito.asm.ByteVector byteVector6 = byteVector4.putByte((int) 'a');
        org.mockito.asm.ByteVector byteVector8 = byteVector6.putByte((int) (short) -1);
        byte[] byteArray9 = null;
        org.mockito.asm.ByteVector byteVector12 = byteVector6.putByteArray(byteArray9, (int) '#', 0);
        org.mockito.asm.ByteVector byteVector14 = byteVector6.putByte((int) (byte) 1);
        org.mockito.asm.ByteVector byteVector16 = byteVector6.putByte((int) '4');
        org.mockito.asm.ByteVector byteVector18 = byteVector6.putUTF8("hi!");
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
    public void test1618() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1618");
        org.mockito.asm.ByteVector byteVector0 = new org.mockito.asm.ByteVector();
        org.mockito.asm.ByteVector byteVector2 = byteVector0.putUTF8("hi!");
        org.mockito.asm.ByteVector byteVector4 = byteVector0.putInt(0);
        org.mockito.asm.ByteVector byteVector6 = byteVector0.putShort(10);
        org.mockito.asm.ByteVector byteVector8 = byteVector6.putLong((long) '4');
        org.mockito.asm.ByteVector byteVector10 = byteVector6.putShort((int) ' ');
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
    public void test1619() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1619");
        org.mockito.asm.ByteVector byteVector0 = new org.mockito.asm.ByteVector();
        org.mockito.asm.ByteVector byteVector2 = byteVector0.putUTF8("hi!");
        org.mockito.asm.ByteVector byteVector4 = byteVector2.putInt((int) (byte) 10);
        org.mockito.asm.ByteVector byteVector6 = byteVector4.putUTF8("");
        org.mockito.asm.ByteVector byteVector8 = byteVector4.putByte((int) 'a');
        org.mockito.asm.ByteVector byteVector10 = byteVector8.putLong((long) (byte) 0);
        org.mockito.asm.ByteVector byteVector12 = byteVector10.putInt((int) (byte) 10);
        org.mockito.asm.ByteVector byteVector14 = byteVector10.putInt((int) (byte) 100);
        org.junit.Assert.assertNotNull(byteVector2);
        org.junit.Assert.assertNotNull(byteVector4);
        org.junit.Assert.assertNotNull(byteVector6);
        org.junit.Assert.assertNotNull(byteVector8);
        org.junit.Assert.assertNotNull(byteVector10);
        org.junit.Assert.assertNotNull(byteVector12);
        org.junit.Assert.assertNotNull(byteVector14);
    }

    @Test
    public void test1620() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1620");
        org.mockito.asm.ByteVector byteVector0 = new org.mockito.asm.ByteVector();
        org.mockito.asm.ByteVector byteVector2 = byteVector0.putUTF8("hi!");
        org.mockito.asm.ByteVector byteVector4 = byteVector2.putLong((long) (byte) 10);
        org.mockito.asm.ByteVector byteVector6 = byteVector4.putUTF8("hi!");
        org.mockito.asm.ByteVector byteVector8 = byteVector4.putLong((long) 10);
        org.mockito.asm.ByteVector byteVector10 = byteVector8.putLong(0L);
        org.mockito.asm.ByteVector byteVector12 = byteVector10.putUTF8("hi!");
        org.mockito.asm.ByteVector byteVector14 = byteVector12.putInt(1);
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
    public void test1621() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1621");
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
    public void test1622() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1622");
        org.mockito.asm.ByteVector byteVector1 = new org.mockito.asm.ByteVector((int) '4');
        org.mockito.asm.ByteVector byteVector3 = byteVector1.putByte((int) (short) 1);
        org.mockito.asm.ByteVector byteVector5 = byteVector1.putUTF8("");
        org.mockito.asm.ByteVector byteVector7 = byteVector1.putInt((int) '#');
        java.lang.Class<?> wildcardClass8 = byteVector1.getClass();
        org.junit.Assert.assertNotNull(byteVector3);
        org.junit.Assert.assertNotNull(byteVector5);
        org.junit.Assert.assertNotNull(byteVector7);
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test1623() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1623");
        org.mockito.asm.ByteVector byteVector1 = new org.mockito.asm.ByteVector((int) '#');
        org.mockito.asm.ByteVector byteVector3 = byteVector1.putInt(100);
        org.mockito.asm.ByteVector byteVector5 = byteVector1.putInt(0);
        org.mockito.asm.ByteVector byteVector7 = byteVector5.putShort((int) (byte) 100);
        org.mockito.asm.ByteVector byteVector9 = byteVector5.putLong((-1L));
        org.mockito.asm.ByteVector byteVector11 = byteVector9.putLong((long) (byte) 10);
        org.junit.Assert.assertNotNull(byteVector3);
        org.junit.Assert.assertNotNull(byteVector5);
        org.junit.Assert.assertNotNull(byteVector7);
        org.junit.Assert.assertNotNull(byteVector9);
        org.junit.Assert.assertNotNull(byteVector11);
    }

    @Test
    public void test1624() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1624");
        org.mockito.asm.ByteVector byteVector0 = new org.mockito.asm.ByteVector();
        org.mockito.asm.ByteVector byteVector2 = byteVector0.putUTF8("hi!");
        org.mockito.asm.ByteVector byteVector4 = byteVector0.putShort((int) (short) -1);
        org.mockito.asm.ByteVector byteVector6 = byteVector0.putInt(0);
        org.mockito.asm.ByteVector byteVector8 = byteVector0.putUTF8("hi!");
        org.mockito.asm.ByteVector byteVector10 = byteVector0.putByte(100);
        org.mockito.asm.ByteVector byteVector12 = byteVector0.putInt((int) (short) 1);
        org.junit.Assert.assertNotNull(byteVector2);
        org.junit.Assert.assertNotNull(byteVector4);
        org.junit.Assert.assertNotNull(byteVector6);
        org.junit.Assert.assertNotNull(byteVector8);
        org.junit.Assert.assertNotNull(byteVector10);
        org.junit.Assert.assertNotNull(byteVector12);
    }

    @Test
    public void test1625() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1625");
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
        org.mockito.asm.ByteVector byteVector22 = byteVector20.putByte((int) (byte) 10);
        org.mockito.asm.ByteVector byteVector24 = byteVector20.putShort((int) (short) 100);
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
    public void test1626() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1626");
        org.mockito.asm.ByteVector byteVector1 = new org.mockito.asm.ByteVector((int) '#');
        org.mockito.asm.ByteVector byteVector3 = byteVector1.putInt(100);
        org.mockito.asm.ByteVector byteVector5 = byteVector1.putInt((int) (byte) 1);
        org.mockito.asm.ByteVector byteVector7 = byteVector1.putShort((int) (short) 1);
        org.mockito.asm.ByteVector byteVector9 = byteVector1.putShort(100);
        org.junit.Assert.assertNotNull(byteVector3);
        org.junit.Assert.assertNotNull(byteVector5);
        org.junit.Assert.assertNotNull(byteVector7);
        org.junit.Assert.assertNotNull(byteVector9);
    }

    @Test
    public void test1627() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1627");
        org.mockito.asm.ByteVector byteVector0 = new org.mockito.asm.ByteVector();
        org.mockito.asm.ByteVector byteVector2 = byteVector0.putUTF8("hi!");
        org.mockito.asm.ByteVector byteVector4 = byteVector0.putShort((int) (short) -1);
        org.mockito.asm.ByteVector byteVector6 = byteVector0.putInt(0);
        org.mockito.asm.ByteVector byteVector8 = byteVector0.putUTF8("hi!");
        org.mockito.asm.ByteVector byteVector10 = byteVector0.putByte(100);
        org.mockito.asm.ByteVector byteVector12 = byteVector0.putInt((int) ' ');
        org.mockito.asm.ByteVector byteVector14 = byteVector12.putShort((int) (byte) -1);
        org.mockito.asm.ByteVector byteVector16 = byteVector12.putByte((int) (short) -1);
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
    public void test1628() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1628");
        org.mockito.asm.ByteVector byteVector0 = new org.mockito.asm.ByteVector();
        org.mockito.asm.ByteVector byteVector2 = byteVector0.putUTF8("hi!");
        org.mockito.asm.ByteVector byteVector4 = byteVector0.putInt(0);
        org.mockito.asm.ByteVector byteVector6 = byteVector4.putByte((int) (byte) -1);
        org.mockito.asm.ByteVector byteVector8 = byteVector4.putShort((int) '4');
        java.lang.Class<?> wildcardClass9 = byteVector4.getClass();
        org.junit.Assert.assertNotNull(byteVector2);
        org.junit.Assert.assertNotNull(byteVector4);
        org.junit.Assert.assertNotNull(byteVector6);
        org.junit.Assert.assertNotNull(byteVector8);
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test1629() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1629");
        org.mockito.asm.ByteVector byteVector1 = new org.mockito.asm.ByteVector((int) (byte) 10);
        org.mockito.asm.ByteVector byteVector3 = byteVector1.putByte((int) '4');
        org.mockito.asm.ByteVector byteVector5 = byteVector1.putLong((long) 'a');
        org.mockito.asm.ByteVector byteVector7 = byteVector5.putUTF8("");
        org.mockito.asm.ByteVector byteVector9 = byteVector7.putShort((int) (byte) 10);
        org.junit.Assert.assertNotNull(byteVector3);
        org.junit.Assert.assertNotNull(byteVector5);
        org.junit.Assert.assertNotNull(byteVector7);
        org.junit.Assert.assertNotNull(byteVector9);
    }

    @Test
    public void test1630() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1630");
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
        org.mockito.asm.ByteVector byteVector47 = byteVector45.putLong(0L);
        org.mockito.asm.ByteVector byteVector49 = byteVector45.putLong((long) 100);
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
        org.junit.Assert.assertNotNull(byteVector49);
    }

    @Test
    public void test1631() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1631");
        org.mockito.asm.ByteVector byteVector0 = new org.mockito.asm.ByteVector();
        org.mockito.asm.ByteVector byteVector2 = byteVector0.putUTF8("hi!");
        org.mockito.asm.ByteVector byteVector4 = byteVector2.putLong((long) (byte) 10);
        org.mockito.asm.ByteVector byteVector6 = byteVector4.putUTF8("hi!");
        org.mockito.asm.ByteVector byteVector8 = byteVector4.putLong((-1L));
        org.mockito.asm.ByteVector byteVector10 = byteVector8.putInt(10);
        org.mockito.asm.ByteVector byteVector12 = byteVector10.putShort((int) '#');
        org.mockito.asm.ByteVector byteVector14 = byteVector10.putShort((int) (byte) 100);
        org.mockito.asm.ByteVector byteVector16 = byteVector10.putUTF8("");
        org.mockito.asm.ByteVector byteVector18 = byteVector10.putUTF8("hi!");
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
    public void test1632() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1632");
        org.mockito.asm.ByteVector byteVector0 = new org.mockito.asm.ByteVector();
        org.mockito.asm.ByteVector byteVector2 = byteVector0.putUTF8("hi!");
        org.mockito.asm.ByteVector byteVector4 = byteVector2.putLong((long) (byte) 10);
        org.mockito.asm.ByteVector byteVector6 = byteVector4.putUTF8("hi!");
        org.mockito.asm.ByteVector byteVector8 = byteVector4.putLong((long) 10);
        org.mockito.asm.ByteVector byteVector10 = byteVector8.putByte((int) '4');
        org.mockito.asm.ByteVector byteVector12 = byteVector8.putLong((long) (short) 100);
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
    public void test1633() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1633");
        org.mockito.asm.ByteVector byteVector0 = new org.mockito.asm.ByteVector();
        org.mockito.asm.ByteVector byteVector2 = byteVector0.putUTF8("hi!");
        org.mockito.asm.ByteVector byteVector4 = byteVector2.putLong((long) (byte) 10);
        org.mockito.asm.ByteVector byteVector6 = byteVector4.putUTF8("hi!");
        org.mockito.asm.ByteVector byteVector8 = byteVector4.putLong((long) (short) -1);
        org.mockito.asm.ByteVector byteVector10 = byteVector8.putShort((int) '#');
        org.mockito.asm.ByteVector byteVector12 = byteVector10.putByte((int) (byte) 10);
        org.mockito.asm.ByteVector byteVector14 = byteVector10.putShort((int) (byte) 1);
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
            org.mockito.asm.ByteVector byteVector81 = byteVector10.putByteArray(byteArray66, (int) (short) 10, (int) (short) 100);
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
    public void test1634() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1634");
        org.mockito.asm.ByteVector byteVector0 = new org.mockito.asm.ByteVector();
        org.mockito.asm.ByteVector byteVector2 = byteVector0.putUTF8("hi!");
        org.mockito.asm.ByteVector byteVector4 = byteVector0.putLong((long) ' ');
        org.mockito.asm.ByteVector byteVector6 = byteVector4.putByte((int) 'a');
        org.mockito.asm.ByteVector byteVector8 = byteVector6.putInt((int) (short) 1);
        org.mockito.asm.ByteVector byteVector10 = byteVector6.putByte((int) (byte) -1);
        org.mockito.asm.ByteVector byteVector12 = byteVector6.putByte((int) (short) 100);
        org.mockito.asm.ByteVector byteVector14 = byteVector12.putShort((int) ' ');
        org.junit.Assert.assertNotNull(byteVector2);
        org.junit.Assert.assertNotNull(byteVector4);
        org.junit.Assert.assertNotNull(byteVector6);
        org.junit.Assert.assertNotNull(byteVector8);
        org.junit.Assert.assertNotNull(byteVector10);
        org.junit.Assert.assertNotNull(byteVector12);
        org.junit.Assert.assertNotNull(byteVector14);
    }

    @Test
    public void test1635() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1635");
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
        org.mockito.asm.ByteVector byteVector20 = byteVector18.putInt((int) '#');
        org.mockito.asm.ByteVector byteVector22 = byteVector20.putInt((int) (short) 1);
        org.mockito.asm.ByteVector byteVector24 = byteVector20.putUTF8("");
        org.mockito.asm.ByteVector byteVector26 = byteVector20.putShort(1);
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
    public void test1636() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1636");
        org.mockito.asm.ByteVector byteVector1 = new org.mockito.asm.ByteVector((int) '#');
        org.mockito.asm.ByteVector byteVector3 = byteVector1.putLong(100L);
        org.mockito.asm.ByteVector byteVector5 = byteVector1.putInt((int) ' ');
        org.mockito.asm.ByteVector byteVector7 = byteVector1.putInt((int) (short) 0);
        org.mockito.asm.ByteVector byteVector9 = byteVector1.putInt((int) (byte) 1);
        org.mockito.asm.ByteVector byteVector11 = byteVector9.putByte((int) ' ');
        org.mockito.asm.ByteVector byteVector13 = new org.mockito.asm.ByteVector((int) (byte) 10);
        org.mockito.asm.ByteVector byteVector15 = byteVector13.putByte((int) '4');
        org.mockito.asm.ByteVector byteVector17 = byteVector13.putLong((long) 'a');
        org.mockito.asm.ByteVector byteVector18 = new org.mockito.asm.ByteVector();
        org.mockito.asm.ByteVector byteVector20 = byteVector18.putUTF8("hi!");
        org.mockito.asm.ByteVector byteVector22 = byteVector18.putLong((long) ' ');
        org.mockito.asm.ByteVector byteVector24 = byteVector22.putByte((int) 'a');
        org.mockito.asm.ByteVector byteVector26 = byteVector22.putByte((int) (short) -1);
        org.mockito.asm.ByteVector byteVector28 = byteVector22.putLong(0L);
        org.mockito.asm.ByteVector byteVector30 = byteVector22.putUTF8("hi!");
        org.mockito.asm.ByteVector byteVector32 = byteVector30.putUTF8("");
        org.mockito.asm.ByteVector byteVector34 = byteVector30.putInt((int) (byte) 10);
        org.mockito.asm.ByteVector byteVector36 = byteVector30.putByte(0);
        org.mockito.asm.ByteVector byteVector37 = new org.mockito.asm.ByteVector();
        org.mockito.asm.ByteVector byteVector39 = byteVector37.putUTF8("hi!");
        org.mockito.asm.ByteVector byteVector41 = byteVector37.putInt(0);
        org.mockito.asm.ByteVector byteVector43 = byteVector41.putInt((int) ' ');
        org.mockito.asm.ByteVector byteVector45 = byteVector43.putLong(100L);
        byte[] byteArray49 = new byte[] { (byte) 0, (byte) 10, (byte) 1 };
        org.mockito.asm.ByteVector byteVector52 = byteVector43.putByteArray(byteArray49, 0, 0);
        org.mockito.asm.ByteVector byteVector55 = byteVector36.putByteArray(byteArray49, (int) (short) 1, 0);
        org.mockito.asm.ByteVector byteVector58 = byteVector17.putByteArray(byteArray49, 0, 0);
        // The following exception was thrown during execution in test generation
        try {
            org.mockito.asm.ByteVector byteVector61 = byteVector11.putByteArray(byteArray49, (int) 'a', 1);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteVector3);
        org.junit.Assert.assertNotNull(byteVector5);
        org.junit.Assert.assertNotNull(byteVector7);
        org.junit.Assert.assertNotNull(byteVector9);
        org.junit.Assert.assertNotNull(byteVector11);
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
    public void test1637() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1637");
        org.mockito.asm.ByteVector byteVector1 = new org.mockito.asm.ByteVector((int) '#');
        org.mockito.asm.ByteVector byteVector3 = byteVector1.putLong(100L);
        org.mockito.asm.ByteVector byteVector5 = byteVector1.putUTF8("");
        org.mockito.asm.ByteVector byteVector7 = byteVector1.putUTF8("hi!");
        org.mockito.asm.ByteVector byteVector9 = byteVector7.putLong((long) (short) 0);
        org.mockito.asm.ByteVector byteVector11 = byteVector7.putLong((long) (byte) -1);
        org.mockito.asm.ByteVector byteVector13 = byteVector11.putUTF8("hi!");
        org.mockito.asm.ByteVector byteVector15 = byteVector11.putShort((int) (short) 1);
        org.junit.Assert.assertNotNull(byteVector3);
        org.junit.Assert.assertNotNull(byteVector5);
        org.junit.Assert.assertNotNull(byteVector7);
        org.junit.Assert.assertNotNull(byteVector9);
        org.junit.Assert.assertNotNull(byteVector11);
        org.junit.Assert.assertNotNull(byteVector13);
        org.junit.Assert.assertNotNull(byteVector15);
    }

    @Test
    public void test1638() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1638");
        org.mockito.asm.ByteVector byteVector0 = new org.mockito.asm.ByteVector();
        org.mockito.asm.ByteVector byteVector2 = byteVector0.putUTF8("hi!");
        org.mockito.asm.ByteVector byteVector4 = byteVector0.putInt(0);
        org.mockito.asm.ByteVector byteVector6 = byteVector0.putShort((int) '4');
        org.mockito.asm.ByteVector byteVector8 = byteVector0.putLong(1L);
        org.mockito.asm.ByteVector byteVector10 = byteVector0.putInt((int) '#');
        org.junit.Assert.assertNotNull(byteVector2);
        org.junit.Assert.assertNotNull(byteVector4);
        org.junit.Assert.assertNotNull(byteVector6);
        org.junit.Assert.assertNotNull(byteVector8);
        org.junit.Assert.assertNotNull(byteVector10);
    }

    @Test
    public void test1639() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1639");
        org.mockito.asm.ByteVector byteVector1 = new org.mockito.asm.ByteVector((int) '#');
        org.mockito.asm.ByteVector byteVector3 = byteVector1.putLong(100L);
        org.mockito.asm.ByteVector byteVector5 = byteVector3.putLong(1L);
        org.mockito.asm.ByteVector byteVector7 = byteVector5.putUTF8("hi!");
        org.mockito.asm.ByteVector byteVector9 = byteVector5.putUTF8("hi!");
        org.mockito.asm.ByteVector byteVector11 = byteVector9.putInt((int) (byte) 10);
        org.mockito.asm.ByteVector byteVector13 = byteVector11.putInt((int) (byte) 1);
        org.mockito.asm.ByteVector byteVector15 = byteVector13.putLong(10L);
        org.junit.Assert.assertNotNull(byteVector3);
        org.junit.Assert.assertNotNull(byteVector5);
        org.junit.Assert.assertNotNull(byteVector7);
        org.junit.Assert.assertNotNull(byteVector9);
        org.junit.Assert.assertNotNull(byteVector11);
        org.junit.Assert.assertNotNull(byteVector13);
        org.junit.Assert.assertNotNull(byteVector15);
    }

    @Test
    public void test1640() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1640");
        org.mockito.asm.ByteVector byteVector0 = new org.mockito.asm.ByteVector();
        org.mockito.asm.ByteVector byteVector2 = byteVector0.putUTF8("hi!");
        org.mockito.asm.ByteVector byteVector4 = byteVector0.putInt(0);
        org.mockito.asm.ByteVector byteVector6 = byteVector0.putShort(10);
        org.mockito.asm.ByteVector byteVector8 = byteVector0.putUTF8("");
        org.mockito.asm.ByteVector byteVector10 = byteVector8.putUTF8("hi!");
        org.mockito.asm.ByteVector byteVector12 = byteVector10.putLong((long) (byte) 0);
        org.mockito.asm.ByteVector byteVector14 = byteVector10.putShort((int) '4');
        org.mockito.asm.ByteVector byteVector16 = byteVector10.putLong((long) (byte) 0);
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
    public void test1641() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1641");
        org.mockito.asm.ByteVector byteVector0 = new org.mockito.asm.ByteVector();
        org.mockito.asm.ByteVector byteVector2 = byteVector0.putUTF8("hi!");
        org.mockito.asm.ByteVector byteVector4 = byteVector2.putLong((long) (byte) 10);
        org.mockito.asm.ByteVector byteVector6 = byteVector4.putUTF8("hi!");
        org.mockito.asm.ByteVector byteVector8 = byteVector4.putLong((long) (short) -1);
        org.mockito.asm.ByteVector byteVector10 = byteVector8.putInt(10);
        org.mockito.asm.ByteVector byteVector12 = byteVector10.putByte((int) (byte) 0);
        org.mockito.asm.ByteVector byteVector14 = byteVector10.putInt(0);
        org.junit.Assert.assertNotNull(byteVector2);
        org.junit.Assert.assertNotNull(byteVector4);
        org.junit.Assert.assertNotNull(byteVector6);
        org.junit.Assert.assertNotNull(byteVector8);
        org.junit.Assert.assertNotNull(byteVector10);
        org.junit.Assert.assertNotNull(byteVector12);
        org.junit.Assert.assertNotNull(byteVector14);
    }

    @Test
    public void test1642() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1642");
        org.mockito.asm.ByteVector byteVector0 = new org.mockito.asm.ByteVector();
        org.mockito.asm.ByteVector byteVector2 = byteVector0.putUTF8("");
        org.junit.Assert.assertNotNull(byteVector2);
    }

    @Test
    public void test1643() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1643");
        org.mockito.asm.ByteVector byteVector0 = new org.mockito.asm.ByteVector();
        org.mockito.asm.ByteVector byteVector2 = byteVector0.putUTF8("hi!");
        org.mockito.asm.ByteVector byteVector4 = byteVector0.putShort((int) (short) -1);
        org.mockito.asm.ByteVector byteVector6 = byteVector0.putInt(0);
        org.mockito.asm.ByteVector byteVector8 = byteVector0.putUTF8("hi!");
        org.mockito.asm.ByteVector byteVector10 = byteVector8.putInt((int) (short) 0);
        org.mockito.asm.ByteVector byteVector12 = byteVector8.putByte(0);
        org.mockito.asm.ByteVector byteVector14 = byteVector12.putUTF8("");
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
    public void test1644() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1644");
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
        org.mockito.asm.ByteVector byteVector93 = byteVector18.putByteArray(byteArray78, 0, (int) (short) 0);
        org.mockito.asm.ByteVector byteVector95 = byteVector93.putLong((long) (short) 100);
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
        org.junit.Assert.assertNotNull(byteVector93);
        org.junit.Assert.assertNotNull(byteVector95);
    }

    @Test
    public void test1645() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1645");
        org.mockito.asm.ByteVector byteVector0 = new org.mockito.asm.ByteVector();
        org.mockito.asm.ByteVector byteVector2 = byteVector0.putUTF8("hi!");
        org.mockito.asm.ByteVector byteVector4 = byteVector2.putLong((long) (byte) 10);
        org.mockito.asm.ByteVector byteVector6 = byteVector4.putUTF8("hi!");
        org.mockito.asm.ByteVector byteVector8 = byteVector4.putLong((long) 10);
        org.mockito.asm.ByteVector byteVector10 = byteVector8.putUTF8("");
        org.mockito.asm.ByteVector byteVector12 = byteVector8.putLong(10L);
        org.mockito.asm.ByteVector byteVector14 = byteVector12.putLong((long) ' ');
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
    public void test1646() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1646");
        org.mockito.asm.ByteVector byteVector0 = new org.mockito.asm.ByteVector();
        org.mockito.asm.ByteVector byteVector2 = byteVector0.putUTF8("hi!");
        org.mockito.asm.ByteVector byteVector4 = byteVector0.putInt(0);
        org.mockito.asm.ByteVector byteVector6 = byteVector0.putShort((-1));
        org.mockito.asm.ByteVector byteVector8 = byteVector0.putInt((int) ' ');
        org.junit.Assert.assertNotNull(byteVector2);
        org.junit.Assert.assertNotNull(byteVector4);
        org.junit.Assert.assertNotNull(byteVector6);
        org.junit.Assert.assertNotNull(byteVector8);
    }

    @Test
    public void test1647() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1647");
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
        org.mockito.asm.ByteVector byteVector24 = byteVector16.putUTF8("");
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
    public void test1648() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1648");
        org.mockito.asm.ByteVector byteVector1 = new org.mockito.asm.ByteVector((int) '#');
        org.mockito.asm.ByteVector byteVector3 = byteVector1.putLong(100L);
        org.mockito.asm.ByteVector byteVector5 = byteVector3.putLong(1L);
        org.mockito.asm.ByteVector byteVector7 = byteVector5.putUTF8("hi!");
        org.mockito.asm.ByteVector byteVector9 = byteVector5.putLong((long) 1);
        org.mockito.asm.ByteVector byteVector11 = byteVector5.putShort((int) '#');
        org.mockito.asm.ByteVector byteVector13 = byteVector11.putByte(100);
        org.junit.Assert.assertNotNull(byteVector3);
        org.junit.Assert.assertNotNull(byteVector5);
        org.junit.Assert.assertNotNull(byteVector7);
        org.junit.Assert.assertNotNull(byteVector9);
        org.junit.Assert.assertNotNull(byteVector11);
        org.junit.Assert.assertNotNull(byteVector13);
    }

    @Test
    public void test1649() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1649");
        org.mockito.asm.ByteVector byteVector0 = new org.mockito.asm.ByteVector();
        org.mockito.asm.ByteVector byteVector2 = byteVector0.putUTF8("hi!");
        org.mockito.asm.ByteVector byteVector4 = byteVector0.putShort((int) (short) -1);
        org.mockito.asm.ByteVector byteVector6 = byteVector4.putInt((int) (byte) 100);
        org.mockito.asm.ByteVector byteVector8 = byteVector6.putUTF8("hi!");
        org.mockito.asm.ByteVector byteVector9 = new org.mockito.asm.ByteVector();
        org.mockito.asm.ByteVector byteVector11 = byteVector9.putUTF8("hi!");
        org.mockito.asm.ByteVector byteVector13 = byteVector9.putLong((long) ' ');
        org.mockito.asm.ByteVector byteVector15 = byteVector13.putByte((int) 'a');
        org.mockito.asm.ByteVector byteVector17 = byteVector13.putByte((int) (short) -1);
        org.mockito.asm.ByteVector byteVector19 = byteVector13.putLong(0L);
        org.mockito.asm.ByteVector byteVector21 = new org.mockito.asm.ByteVector((int) '#');
        org.mockito.asm.ByteVector byteVector23 = byteVector21.putInt(100);
        org.mockito.asm.ByteVector byteVector25 = byteVector21.putUTF8("");
        org.mockito.asm.ByteVector byteVector26 = new org.mockito.asm.ByteVector();
        org.mockito.asm.ByteVector byteVector28 = byteVector26.putUTF8("hi!");
        org.mockito.asm.ByteVector byteVector30 = byteVector28.putInt(0);
        org.mockito.asm.ByteVector byteVector32 = byteVector30.putByte((int) (short) 0);
        org.mockito.asm.ByteVector byteVector34 = byteVector30.putUTF8("");
        org.mockito.asm.ByteVector byteVector35 = new org.mockito.asm.ByteVector();
        org.mockito.asm.ByteVector byteVector37 = byteVector35.putUTF8("hi!");
        org.mockito.asm.ByteVector byteVector39 = byteVector35.putInt(0);
        org.mockito.asm.ByteVector byteVector41 = byteVector35.putShort((int) '4');
        org.mockito.asm.ByteVector byteVector43 = byteVector35.putByte(100);
        org.mockito.asm.ByteVector byteVector45 = byteVector43.putInt((int) (byte) 10);
        org.mockito.asm.ByteVector byteVector47 = byteVector43.putInt((int) (byte) 10);
        org.mockito.asm.ByteVector byteVector49 = byteVector47.putByte(100);
        org.mockito.asm.ByteVector byteVector50 = new org.mockito.asm.ByteVector();
        org.mockito.asm.ByteVector byteVector52 = byteVector50.putUTF8("hi!");
        org.mockito.asm.ByteVector byteVector54 = byteVector50.putInt(0);
        org.mockito.asm.ByteVector byteVector56 = byteVector54.putInt((int) ' ');
        org.mockito.asm.ByteVector byteVector58 = byteVector56.putLong(100L);
        byte[] byteArray62 = new byte[] { (byte) 0, (byte) 10, (byte) 1 };
        org.mockito.asm.ByteVector byteVector65 = byteVector56.putByteArray(byteArray62, 0, 0);
        org.mockito.asm.ByteVector byteVector68 = byteVector49.putByteArray(byteArray62, (int) (byte) 1, (int) (byte) 0);
        org.mockito.asm.ByteVector byteVector71 = byteVector30.putByteArray(byteArray62, (int) (short) 0, 0);
        org.mockito.asm.ByteVector byteVector74 = byteVector25.putByteArray(byteArray62, (int) (byte) 0, (int) (short) 1);
        org.mockito.asm.ByteVector byteVector77 = byteVector19.putByteArray(byteArray62, 0, (int) (byte) 0);
        // The following exception was thrown during execution in test generation
        try {
            org.mockito.asm.ByteVector byteVector80 = byteVector6.putByteArray(byteArray62, (int) (byte) 100, (int) (byte) 100);
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
        org.junit.Assert.assertNotNull(byteVector23);
        org.junit.Assert.assertNotNull(byteVector25);
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
        org.junit.Assert.assertNotNull(byteVector52);
        org.junit.Assert.assertNotNull(byteVector54);
        org.junit.Assert.assertNotNull(byteVector56);
        org.junit.Assert.assertNotNull(byteVector58);
        org.junit.Assert.assertNotNull(byteArray62);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray62), "[0, 10, 1]");
        org.junit.Assert.assertNotNull(byteVector65);
        org.junit.Assert.assertNotNull(byteVector68);
        org.junit.Assert.assertNotNull(byteVector71);
        org.junit.Assert.assertNotNull(byteVector74);
        org.junit.Assert.assertNotNull(byteVector77);
    }

    @Test
    public void test1650() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1650");
        org.mockito.asm.ByteVector byteVector0 = new org.mockito.asm.ByteVector();
        org.mockito.asm.ByteVector byteVector2 = byteVector0.putUTF8("hi!");
        org.mockito.asm.ByteVector byteVector4 = byteVector0.putShort((int) (short) -1);
        org.mockito.asm.ByteVector byteVector6 = byteVector0.putLong(0L);
        org.mockito.asm.ByteVector byteVector8 = byteVector0.putShort((int) (byte) -1);
        org.mockito.asm.ByteVector byteVector10 = byteVector0.putShort((int) (short) -1);
        org.mockito.asm.ByteVector byteVector12 = byteVector10.putShort((int) ' ');
        org.mockito.asm.ByteVector byteVector14 = byteVector10.putInt((int) (byte) 10);
        org.junit.Assert.assertNotNull(byteVector2);
        org.junit.Assert.assertNotNull(byteVector4);
        org.junit.Assert.assertNotNull(byteVector6);
        org.junit.Assert.assertNotNull(byteVector8);
        org.junit.Assert.assertNotNull(byteVector10);
        org.junit.Assert.assertNotNull(byteVector12);
        org.junit.Assert.assertNotNull(byteVector14);
    }

    @Test
    public void test1651() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1651");
        org.mockito.asm.ByteVector byteVector1 = new org.mockito.asm.ByteVector((int) '#');
        org.mockito.asm.ByteVector byteVector3 = byteVector1.putLong(100L);
        org.mockito.asm.ByteVector byteVector5 = byteVector3.putUTF8("");
        org.mockito.asm.ByteVector byteVector7 = byteVector3.putLong((-1L));
        org.mockito.asm.ByteVector byteVector9 = byteVector3.putInt((int) '#');
        org.mockito.asm.ByteVector byteVector11 = byteVector9.putUTF8("");
        org.mockito.asm.ByteVector byteVector13 = byteVector9.putShort((int) (short) 100);
        org.mockito.asm.ByteVector byteVector15 = byteVector13.putInt(0);
        org.mockito.asm.ByteVector byteVector17 = byteVector15.putLong(0L);
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
    public void test1652() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1652");
        org.mockito.asm.ByteVector byteVector0 = new org.mockito.asm.ByteVector();
        org.mockito.asm.ByteVector byteVector2 = byteVector0.putUTF8("hi!");
        org.mockito.asm.ByteVector byteVector4 = byteVector0.putLong((long) ' ');
        org.mockito.asm.ByteVector byteVector6 = byteVector4.putByte((int) 'a');
        org.mockito.asm.ByteVector byteVector8 = byteVector4.putByte((int) (short) -1);
        org.mockito.asm.ByteVector byteVector10 = byteVector4.putLong(0L);
        org.mockito.asm.ByteVector byteVector12 = byteVector4.putUTF8("hi!");
        org.mockito.asm.ByteVector byteVector14 = byteVector12.putLong((-1L));
        org.mockito.asm.ByteVector byteVector16 = byteVector12.putByte((int) (byte) 1);
        org.mockito.asm.ByteVector byteVector18 = byteVector12.putShort((int) (byte) -1);
        org.mockito.asm.ByteVector byteVector20 = byteVector18.putUTF8("hi!");
        org.mockito.asm.ByteVector byteVector22 = byteVector18.putByte(0);
        org.mockito.asm.ByteVector byteVector24 = byteVector22.putShort((int) (byte) -1);
        org.mockito.asm.ByteVector byteVector26 = byteVector24.putShort(10);
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
    public void test1653() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1653");
        org.mockito.asm.ByteVector byteVector0 = new org.mockito.asm.ByteVector();
        org.mockito.asm.ByteVector byteVector2 = byteVector0.putUTF8("hi!");
        org.mockito.asm.ByteVector byteVector4 = byteVector2.putInt((int) (byte) 10);
        org.mockito.asm.ByteVector byteVector6 = byteVector4.putUTF8("");
        org.mockito.asm.ByteVector byteVector8 = byteVector6.putUTF8("hi!");
        org.mockito.asm.ByteVector byteVector10 = byteVector6.putShort((int) (short) 0);
        org.mockito.asm.ByteVector byteVector12 = byteVector6.putShort((-1));
        org.junit.Assert.assertNotNull(byteVector2);
        org.junit.Assert.assertNotNull(byteVector4);
        org.junit.Assert.assertNotNull(byteVector6);
        org.junit.Assert.assertNotNull(byteVector8);
        org.junit.Assert.assertNotNull(byteVector10);
        org.junit.Assert.assertNotNull(byteVector12);
    }

    @Test
    public void test1654() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1654");
        org.mockito.asm.ByteVector byteVector0 = new org.mockito.asm.ByteVector();
        org.mockito.asm.ByteVector byteVector2 = byteVector0.putUTF8("hi!");
        org.mockito.asm.ByteVector byteVector4 = byteVector2.putInt((int) (byte) 10);
        org.mockito.asm.ByteVector byteVector6 = byteVector2.putUTF8("hi!");
        java.lang.Class<?> wildcardClass7 = byteVector6.getClass();
        org.junit.Assert.assertNotNull(byteVector2);
        org.junit.Assert.assertNotNull(byteVector4);
        org.junit.Assert.assertNotNull(byteVector6);
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test1655() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1655");
        org.mockito.asm.ByteVector byteVector0 = new org.mockito.asm.ByteVector();
        org.mockito.asm.ByteVector byteVector2 = byteVector0.putUTF8("hi!");
        org.mockito.asm.ByteVector byteVector4 = byteVector0.putShort((int) (short) -1);
        org.mockito.asm.ByteVector byteVector6 = byteVector0.putByte((int) ' ');
        org.mockito.asm.ByteVector byteVector8 = byteVector0.putInt(100);
        java.lang.Class<?> wildcardClass9 = byteVector0.getClass();
        org.junit.Assert.assertNotNull(byteVector2);
        org.junit.Assert.assertNotNull(byteVector4);
        org.junit.Assert.assertNotNull(byteVector6);
        org.junit.Assert.assertNotNull(byteVector8);
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test1656() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1656");
        org.mockito.asm.ByteVector byteVector0 = new org.mockito.asm.ByteVector();
        org.mockito.asm.ByteVector byteVector2 = byteVector0.putUTF8("hi!");
        org.mockito.asm.ByteVector byteVector4 = byteVector2.putLong((long) (byte) 10);
        org.mockito.asm.ByteVector byteVector6 = byteVector4.putUTF8("hi!");
        org.mockito.asm.ByteVector byteVector8 = byteVector4.putLong((-1L));
        org.mockito.asm.ByteVector byteVector10 = byteVector8.putInt(10);
        org.mockito.asm.ByteVector byteVector12 = byteVector10.putShort((int) '#');
        org.mockito.asm.ByteVector byteVector14 = byteVector12.putShort((int) (short) -1);
        org.mockito.asm.ByteVector byteVector16 = byteVector14.putUTF8("hi!");
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
    public void test1657() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1657");
        org.mockito.asm.ByteVector byteVector0 = new org.mockito.asm.ByteVector();
        org.mockito.asm.ByteVector byteVector2 = byteVector0.putUTF8("hi!");
        org.mockito.asm.ByteVector byteVector4 = byteVector2.putLong((long) (byte) 10);
        org.mockito.asm.ByteVector byteVector6 = byteVector4.putUTF8("hi!");
        org.mockito.asm.ByteVector byteVector8 = byteVector4.putLong((-1L));
        org.mockito.asm.ByteVector byteVector10 = byteVector8.putInt(10);
        org.mockito.asm.ByteVector byteVector12 = byteVector8.putShort((int) (byte) 0);
        org.mockito.asm.ByteVector byteVector14 = byteVector8.putShort((int) 'a');
        org.mockito.asm.ByteVector byteVector16 = byteVector14.putByte((int) (short) 10);
        org.mockito.asm.ByteVector byteVector18 = byteVector16.putShort((int) (byte) 10);
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
    public void test1658() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1658");
        org.mockito.asm.ByteVector byteVector0 = new org.mockito.asm.ByteVector();
        org.mockito.asm.ByteVector byteVector2 = byteVector0.putUTF8("hi!");
        org.mockito.asm.ByteVector byteVector4 = byteVector0.putShort((int) (short) -1);
        org.mockito.asm.ByteVector byteVector6 = byteVector0.putLong(0L);
        org.mockito.asm.ByteVector byteVector8 = byteVector0.putShort((int) (byte) -1);
        org.mockito.asm.ByteVector byteVector10 = byteVector0.putInt((int) (byte) 0);
        org.mockito.asm.ByteVector byteVector12 = byteVector10.putLong((long) 'a');
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
    public void test1659() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1659");
        org.mockito.asm.ByteVector byteVector1 = new org.mockito.asm.ByteVector((int) (byte) 100);
        org.mockito.asm.ByteVector byteVector3 = byteVector1.putShort((int) (short) 100);
        org.mockito.asm.ByteVector byteVector5 = byteVector1.putLong((long) (short) 10);
        org.mockito.asm.ByteVector byteVector7 = byteVector5.putUTF8("");
        org.mockito.asm.ByteVector byteVector9 = byteVector5.putShort((int) 'a');
        org.junit.Assert.assertNotNull(byteVector3);
        org.junit.Assert.assertNotNull(byteVector5);
        org.junit.Assert.assertNotNull(byteVector7);
        org.junit.Assert.assertNotNull(byteVector9);
    }

    @Test
    public void test1660() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1660");
        org.mockito.asm.ByteVector byteVector1 = new org.mockito.asm.ByteVector((int) (short) 1);
        org.mockito.asm.ByteVector byteVector3 = byteVector1.putLong((long) (byte) 1);
        org.mockito.asm.ByteVector byteVector5 = byteVector3.putShort((int) '#');
        org.mockito.asm.ByteVector byteVector7 = byteVector3.putInt(0);
        org.mockito.asm.ByteVector byteVector9 = byteVector7.putShort((int) (byte) 10);
        org.junit.Assert.assertNotNull(byteVector3);
        org.junit.Assert.assertNotNull(byteVector5);
        org.junit.Assert.assertNotNull(byteVector7);
        org.junit.Assert.assertNotNull(byteVector9);
    }

    @Test
    public void test1661() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1661");
        org.mockito.asm.ByteVector byteVector0 = new org.mockito.asm.ByteVector();
        org.mockito.asm.ByteVector byteVector2 = byteVector0.putUTF8("hi!");
        org.mockito.asm.ByteVector byteVector4 = byteVector2.putLong((long) (byte) 10);
        org.mockito.asm.ByteVector byteVector6 = byteVector4.putUTF8("hi!");
        org.mockito.asm.ByteVector byteVector8 = byteVector4.putLong((long) 10);
        org.mockito.asm.ByteVector byteVector10 = byteVector8.putByte((int) '4');
        org.mockito.asm.ByteVector byteVector12 = byteVector8.putLong((long) (short) 100);
        byte[] byteArray13 = null;
        org.mockito.asm.ByteVector byteVector16 = byteVector12.putByteArray(byteArray13, (int) (short) 10, 0);
        org.mockito.asm.ByteVector byteVector18 = byteVector12.putLong((long) (short) 0);
        org.junit.Assert.assertNotNull(byteVector2);
        org.junit.Assert.assertNotNull(byteVector4);
        org.junit.Assert.assertNotNull(byteVector6);
        org.junit.Assert.assertNotNull(byteVector8);
        org.junit.Assert.assertNotNull(byteVector10);
        org.junit.Assert.assertNotNull(byteVector12);
        org.junit.Assert.assertNotNull(byteVector16);
        org.junit.Assert.assertNotNull(byteVector18);
    }

    @Test
    public void test1662() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1662");
        org.mockito.asm.ByteVector byteVector0 = new org.mockito.asm.ByteVector();
        org.mockito.asm.ByteVector byteVector2 = byteVector0.putUTF8("hi!");
        org.mockito.asm.ByteVector byteVector4 = byteVector0.putLong((long) ' ');
        org.mockito.asm.ByteVector byteVector6 = byteVector4.putByte((int) (short) 1);
        org.mockito.asm.ByteVector byteVector8 = byteVector4.putInt(0);
        java.lang.Class<?> wildcardClass9 = byteVector8.getClass();
        org.junit.Assert.assertNotNull(byteVector2);
        org.junit.Assert.assertNotNull(byteVector4);
        org.junit.Assert.assertNotNull(byteVector6);
        org.junit.Assert.assertNotNull(byteVector8);
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test1663() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1663");
        org.mockito.asm.ByteVector byteVector0 = new org.mockito.asm.ByteVector();
        org.mockito.asm.ByteVector byteVector2 = byteVector0.putUTF8("hi!");
        org.mockito.asm.ByteVector byteVector4 = byteVector0.putInt(0);
        org.mockito.asm.ByteVector byteVector6 = byteVector0.putShort((int) '4');
        org.mockito.asm.ByteVector byteVector8 = byteVector0.putByte(100);
        org.mockito.asm.ByteVector byteVector10 = byteVector8.putInt((int) (byte) 10);
        org.mockito.asm.ByteVector byteVector12 = byteVector8.putShort((int) '#');
        org.mockito.asm.ByteVector byteVector14 = byteVector8.putLong((long) (-1));
        org.mockito.asm.ByteVector byteVector16 = byteVector8.putInt((int) '4');
        org.mockito.asm.ByteVector byteVector18 = byteVector16.putByte(100);
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
    public void test1664() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1664");
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
        org.mockito.asm.ByteVector byteVector20 = byteVector18.putInt((int) '#');
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
    public void test1665() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1665");
        org.mockito.asm.ByteVector byteVector0 = new org.mockito.asm.ByteVector();
        org.mockito.asm.ByteVector byteVector2 = byteVector0.putUTF8("hi!");
        org.mockito.asm.ByteVector byteVector4 = byteVector0.putLong((long) (short) 1);
        org.mockito.asm.ByteVector byteVector6 = byteVector4.putUTF8("");
        org.mockito.asm.ByteVector byteVector8 = byteVector6.putShort((int) (short) 0);
        org.mockito.asm.ByteVector byteVector10 = byteVector8.putLong((long) (short) 100);
        org.mockito.asm.ByteVector byteVector12 = byteVector8.putInt((int) (byte) 1);
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
    public void test1666() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1666");
        org.mockito.asm.ByteVector byteVector0 = new org.mockito.asm.ByteVector();
        org.mockito.asm.ByteVector byteVector2 = byteVector0.putUTF8("hi!");
        org.mockito.asm.ByteVector byteVector4 = byteVector0.putShort((int) (short) -1);
        org.mockito.asm.ByteVector byteVector6 = byteVector0.putLong(0L);
        org.mockito.asm.ByteVector byteVector8 = byteVector0.putShort((int) (byte) -1);
        org.mockito.asm.ByteVector byteVector10 = byteVector8.putByte((int) (byte) 0);
        org.mockito.asm.ByteVector byteVector12 = byteVector10.putUTF8("hi!");
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
            org.mockito.asm.ByteVector byteVector62 = byteVector10.putByteArray(byteArray50, (-1), (int) (byte) 1);
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
    public void test1667() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1667");
        org.mockito.asm.ByteVector byteVector1 = new org.mockito.asm.ByteVector((int) '#');
        org.mockito.asm.ByteVector byteVector3 = byteVector1.putLong(100L);
        org.mockito.asm.ByteVector byteVector5 = byteVector1.putUTF8("");
        org.mockito.asm.ByteVector byteVector7 = byteVector5.putInt((int) (byte) 10);
        org.mockito.asm.ByteVector byteVector9 = byteVector7.putByte((int) '#');
        org.mockito.asm.ByteVector byteVector11 = byteVector9.putShort((int) (byte) 100);
        org.mockito.asm.ByteVector byteVector13 = byteVector9.putShort((int) '4');
        org.mockito.asm.ByteVector byteVector15 = byteVector13.putInt((int) (byte) 10);
        org.junit.Assert.assertNotNull(byteVector3);
        org.junit.Assert.assertNotNull(byteVector5);
        org.junit.Assert.assertNotNull(byteVector7);
        org.junit.Assert.assertNotNull(byteVector9);
        org.junit.Assert.assertNotNull(byteVector11);
        org.junit.Assert.assertNotNull(byteVector13);
        org.junit.Assert.assertNotNull(byteVector15);
    }

    @Test
    public void test1668() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1668");
        org.mockito.asm.ByteVector byteVector0 = new org.mockito.asm.ByteVector();
        org.mockito.asm.ByteVector byteVector2 = byteVector0.putUTF8("hi!");
        org.mockito.asm.ByteVector byteVector4 = byteVector0.putLong((long) (short) 1);
        org.mockito.asm.ByteVector byteVector6 = byteVector4.putShort((int) (byte) -1);
        org.mockito.asm.ByteVector byteVector8 = byteVector4.putUTF8("");
        org.mockito.asm.ByteVector byteVector10 = byteVector4.putShort((int) (byte) -1);
        org.junit.Assert.assertNotNull(byteVector2);
        org.junit.Assert.assertNotNull(byteVector4);
        org.junit.Assert.assertNotNull(byteVector6);
        org.junit.Assert.assertNotNull(byteVector8);
        org.junit.Assert.assertNotNull(byteVector10);
    }

    @Test
    public void test1669() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1669");
        org.mockito.asm.ByteVector byteVector0 = new org.mockito.asm.ByteVector();
        org.mockito.asm.ByteVector byteVector2 = byteVector0.putUTF8("hi!");
        org.mockito.asm.ByteVector byteVector4 = byteVector0.putInt(0);
        org.mockito.asm.ByteVector byteVector6 = byteVector4.putByte((int) (byte) -1);
        org.mockito.asm.ByteVector byteVector8 = byteVector4.putShort((int) '4');
        org.mockito.asm.ByteVector byteVector10 = byteVector8.putByte((int) (short) 10);
        org.mockito.asm.ByteVector byteVector12 = byteVector8.putInt(10);
        org.junit.Assert.assertNotNull(byteVector2);
        org.junit.Assert.assertNotNull(byteVector4);
        org.junit.Assert.assertNotNull(byteVector6);
        org.junit.Assert.assertNotNull(byteVector8);
        org.junit.Assert.assertNotNull(byteVector10);
        org.junit.Assert.assertNotNull(byteVector12);
    }

    @Test
    public void test1670() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1670");
        org.mockito.asm.ByteVector byteVector1 = new org.mockito.asm.ByteVector((int) '#');
        org.mockito.asm.ByteVector byteVector3 = byteVector1.putLong(100L);
        org.mockito.asm.ByteVector byteVector5 = byteVector1.putShort((int) (byte) 100);
        org.mockito.asm.ByteVector byteVector7 = byteVector1.putShort((int) (byte) 100);
        org.mockito.asm.ByteVector byteVector9 = byteVector7.putByte((int) (short) 10);
        org.junit.Assert.assertNotNull(byteVector3);
        org.junit.Assert.assertNotNull(byteVector5);
        org.junit.Assert.assertNotNull(byteVector7);
        org.junit.Assert.assertNotNull(byteVector9);
    }

    @Test
    public void test1671() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1671");
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
        org.mockito.asm.ByteVector byteVector20 = byteVector10.putInt((int) (byte) 10);
        org.mockito.asm.ByteVector byteVector22 = byteVector10.putInt((int) (byte) 0);
        org.mockito.asm.ByteVector byteVector24 = byteVector22.putByte((-1));
        org.mockito.asm.ByteVector byteVector26 = byteVector24.putLong((-1L));
        org.mockito.asm.ByteVector byteVector28 = byteVector26.putByte((int) (byte) 100);
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
    public void test1672() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1672");
        org.mockito.asm.ByteVector byteVector0 = new org.mockito.asm.ByteVector();
        org.mockito.asm.ByteVector byteVector2 = byteVector0.putUTF8("hi!");
        org.mockito.asm.ByteVector byteVector4 = byteVector2.putLong((long) (byte) 10);
        org.mockito.asm.ByteVector byteVector6 = byteVector4.putUTF8("hi!");
        org.mockito.asm.ByteVector byteVector8 = byteVector4.putLong((long) 10);
        org.mockito.asm.ByteVector byteVector10 = byteVector8.putLong(0L);
        org.mockito.asm.ByteVector byteVector12 = byteVector10.putUTF8("hi!");
        org.mockito.asm.ByteVector byteVector14 = byteVector10.putLong((long) (short) 100);
        org.mockito.asm.ByteVector byteVector16 = byteVector14.putShort((-1));
        org.mockito.asm.ByteVector byteVector18 = byteVector14.putLong((long) ' ');
        org.mockito.asm.ByteVector byteVector20 = byteVector14.putShort((int) '#');
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
    public void test1673() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1673");
        org.mockito.asm.ByteVector byteVector0 = new org.mockito.asm.ByteVector();
        org.mockito.asm.ByteVector byteVector2 = byteVector0.putUTF8("hi!");
        org.mockito.asm.ByteVector byteVector4 = byteVector0.putInt(0);
        org.mockito.asm.ByteVector byteVector6 = byteVector4.putUTF8("");
        org.junit.Assert.assertNotNull(byteVector2);
        org.junit.Assert.assertNotNull(byteVector4);
        org.junit.Assert.assertNotNull(byteVector6);
    }

    @Test
    public void test1674() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1674");
        org.mockito.asm.ByteVector byteVector0 = new org.mockito.asm.ByteVector();
        org.mockito.asm.ByteVector byteVector2 = byteVector0.putUTF8("hi!");
        org.mockito.asm.ByteVector byteVector4 = byteVector2.putInt((int) (byte) 10);
        org.mockito.asm.ByteVector byteVector6 = byteVector4.putUTF8("");
        org.mockito.asm.ByteVector byteVector8 = byteVector4.putLong(0L);
        org.mockito.asm.ByteVector byteVector10 = byteVector8.putShort(100);
        org.mockito.asm.ByteVector byteVector12 = byteVector10.putUTF8("hi!");
        org.junit.Assert.assertNotNull(byteVector2);
        org.junit.Assert.assertNotNull(byteVector4);
        org.junit.Assert.assertNotNull(byteVector6);
        org.junit.Assert.assertNotNull(byteVector8);
        org.junit.Assert.assertNotNull(byteVector10);
        org.junit.Assert.assertNotNull(byteVector12);
    }

    @Test
    public void test1675() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1675");
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
        java.lang.Class<?> wildcardClass71 = byteArray61.getClass();
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
        org.junit.Assert.assertNotNull(wildcardClass71);
    }

    @Test
    public void test1676() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1676");
        org.mockito.asm.ByteVector byteVector1 = new org.mockito.asm.ByteVector((int) '#');
        org.mockito.asm.ByteVector byteVector3 = byteVector1.putInt(100);
        org.mockito.asm.ByteVector byteVector5 = byteVector3.putShort((int) (short) -1);
        org.mockito.asm.ByteVector byteVector7 = byteVector3.putUTF8("hi!");
        org.mockito.asm.ByteVector byteVector9 = byteVector7.putByte((int) (short) 10);
        org.mockito.asm.ByteVector byteVector11 = byteVector7.putByte((int) ' ');
        org.mockito.asm.ByteVector byteVector13 = byteVector11.putUTF8("hi!");
        org.mockito.asm.ByteVector byteVector15 = byteVector11.putByte((int) (short) -1);
        org.junit.Assert.assertNotNull(byteVector3);
        org.junit.Assert.assertNotNull(byteVector5);
        org.junit.Assert.assertNotNull(byteVector7);
        org.junit.Assert.assertNotNull(byteVector9);
        org.junit.Assert.assertNotNull(byteVector11);
        org.junit.Assert.assertNotNull(byteVector13);
        org.junit.Assert.assertNotNull(byteVector15);
    }

    @Test
    public void test1677() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1677");
        org.mockito.asm.ByteVector byteVector0 = new org.mockito.asm.ByteVector();
        org.mockito.asm.ByteVector byteVector2 = byteVector0.putUTF8("hi!");
        org.mockito.asm.ByteVector byteVector4 = byteVector2.putLong((long) (byte) 10);
        org.mockito.asm.ByteVector byteVector6 = byteVector4.putInt((int) 'a');
        org.mockito.asm.ByteVector byteVector8 = byteVector6.putUTF8("hi!");
        org.mockito.asm.ByteVector byteVector10 = byteVector8.putByte((-1));
        org.mockito.asm.ByteVector byteVector12 = byteVector8.putInt((int) '#');
        org.mockito.asm.ByteVector byteVector14 = byteVector12.putUTF8("hi!");
        org.mockito.asm.ByteVector byteVector16 = byteVector14.putShort(10);
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
    public void test1678() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1678");
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
        org.mockito.asm.ByteVector byteVector20 = byteVector18.putInt((int) '#');
        org.mockito.asm.ByteVector byteVector22 = byteVector20.putInt((int) (short) 1);
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
    public void test1679() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1679");
        org.mockito.asm.ByteVector byteVector0 = new org.mockito.asm.ByteVector();
        org.mockito.asm.ByteVector byteVector2 = byteVector0.putUTF8("hi!");
        org.mockito.asm.ByteVector byteVector4 = byteVector2.putLong((long) (byte) 10);
        org.mockito.asm.ByteVector byteVector6 = byteVector4.putUTF8("hi!");
        org.mockito.asm.ByteVector byteVector8 = byteVector4.putLong((long) (short) -1);
        byte[] byteArray9 = null;
        org.mockito.asm.ByteVector byteVector12 = byteVector4.putByteArray(byteArray9, (int) (short) -1, (int) '4');
        org.mockito.asm.ByteVector byteVector14 = byteVector12.putByte(1);
        org.mockito.asm.ByteVector byteVector16 = byteVector14.putInt(100);
        org.mockito.asm.ByteVector byteVector18 = byteVector14.putByte((int) '4');
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
    public void test1680() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1680");
        org.mockito.asm.ByteVector byteVector1 = new org.mockito.asm.ByteVector((int) (byte) 1);
        org.mockito.asm.ByteVector byteVector3 = byteVector1.putByte((int) (byte) 10);
        org.mockito.asm.ByteVector byteVector5 = byteVector3.putShort((int) (short) 10);
        org.mockito.asm.ByteVector byteVector7 = byteVector5.putShort((int) (byte) 1);
        org.mockito.asm.ByteVector byteVector9 = byteVector5.putUTF8("");
        org.junit.Assert.assertNotNull(byteVector3);
        org.junit.Assert.assertNotNull(byteVector5);
        org.junit.Assert.assertNotNull(byteVector7);
        org.junit.Assert.assertNotNull(byteVector9);
    }

    @Test
    public void test1681() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1681");
        org.mockito.asm.ByteVector byteVector0 = new org.mockito.asm.ByteVector();
        org.mockito.asm.ByteVector byteVector2 = byteVector0.putUTF8("hi!");
        org.mockito.asm.ByteVector byteVector4 = byteVector0.putInt(0);
        org.mockito.asm.ByteVector byteVector6 = byteVector4.putInt((int) ' ');
        org.mockito.asm.ByteVector byteVector8 = byteVector6.putLong((long) (short) 10);
        org.mockito.asm.ByteVector byteVector10 = byteVector8.putLong((long) 'a');
        org.mockito.asm.ByteVector byteVector12 = byteVector10.putByte((int) '#');
        org.mockito.asm.ByteVector byteVector14 = byteVector12.putInt((int) ' ');
        org.mockito.asm.ByteVector byteVector16 = byteVector14.putShort((int) (short) 10);
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
    public void test1682() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1682");
        org.mockito.asm.ByteVector byteVector0 = new org.mockito.asm.ByteVector();
        org.mockito.asm.ByteVector byteVector2 = byteVector0.putUTF8("hi!");
        org.mockito.asm.ByteVector byteVector4 = byteVector2.putInt(0);
        org.mockito.asm.ByteVector byteVector6 = byteVector2.putByte((int) (byte) 10);
        org.mockito.asm.ByteVector byteVector8 = byteVector6.putLong(0L);
        org.mockito.asm.ByteVector byteVector10 = byteVector8.putShort((int) 'a');
        org.mockito.asm.ByteVector byteVector12 = byteVector10.putLong((long) '4');
        org.mockito.asm.ByteVector byteVector14 = byteVector10.putInt((int) (byte) -1);
        org.mockito.asm.ByteVector byteVector16 = byteVector10.putByte((int) (byte) -1);
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
    public void test1683() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1683");
        org.mockito.asm.ByteVector byteVector0 = new org.mockito.asm.ByteVector();
        org.mockito.asm.ByteVector byteVector2 = byteVector0.putUTF8("hi!");
        org.mockito.asm.ByteVector byteVector4 = byteVector0.putShort((int) (short) -1);
        org.mockito.asm.ByteVector byteVector6 = byteVector0.putInt((int) (byte) 10);
        org.mockito.asm.ByteVector byteVector8 = byteVector6.putUTF8("hi!");
        org.mockito.asm.ByteVector byteVector10 = byteVector6.putLong((long) '#');
        org.mockito.asm.ByteVector byteVector12 = byteVector10.putShort(0);
        org.mockito.asm.ByteVector byteVector14 = byteVector12.putShort((int) (short) 1);
        org.mockito.asm.ByteVector byteVector16 = byteVector12.putByte(10);
        org.mockito.asm.ByteVector byteVector18 = byteVector12.putUTF8("hi!");
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
    public void test1684() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1684");
        org.mockito.asm.ByteVector byteVector0 = new org.mockito.asm.ByteVector();
        org.mockito.asm.ByteVector byteVector2 = byteVector0.putUTF8("hi!");
        org.mockito.asm.ByteVector byteVector4 = byteVector0.putInt(0);
        org.mockito.asm.ByteVector byteVector6 = byteVector4.putInt((int) ' ');
        org.mockito.asm.ByteVector byteVector8 = byteVector6.putLong((long) (short) 10);
        org.mockito.asm.ByteVector byteVector10 = byteVector6.putInt((int) '4');
        org.mockito.asm.ByteVector byteVector11 = new org.mockito.asm.ByteVector();
        org.mockito.asm.ByteVector byteVector13 = byteVector11.putUTF8("hi!");
        org.mockito.asm.ByteVector byteVector15 = byteVector11.putShort((int) (short) -1);
        org.mockito.asm.ByteVector byteVector17 = byteVector11.putInt((int) (byte) 10);
        org.mockito.asm.ByteVector byteVector19 = byteVector17.putUTF8("hi!");
        org.mockito.asm.ByteVector byteVector21 = byteVector19.putByte((int) (byte) 1);
        org.mockito.asm.ByteVector byteVector23 = byteVector21.putUTF8("hi!");
        org.mockito.asm.ByteVector byteVector25 = byteVector23.putByte((int) (byte) 10);
        byte[] byteArray28 = new byte[] { (byte) 10, (byte) 0 };
        org.mockito.asm.ByteVector byteVector31 = byteVector25.putByteArray(byteArray28, 0, (int) (short) 0);
        // The following exception was thrown during execution in test generation
        try {
            org.mockito.asm.ByteVector byteVector34 = byteVector6.putByteArray(byteArray28, (int) (byte) 100, (-1));
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
        org.junit.Assert.assertNotNull(byteArray28);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray28), "[10, 0]");
        org.junit.Assert.assertNotNull(byteVector31);
    }

    @Test
    public void test1685() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1685");
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
        org.mockito.asm.ByteVector byteVector26 = byteVector20.putInt((int) (byte) -1);
        org.mockito.asm.ByteVector byteVector28 = byteVector26.putLong((long) 'a');
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
    public void test1686() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1686");
        org.mockito.asm.ByteVector byteVector0 = new org.mockito.asm.ByteVector();
        org.mockito.asm.ByteVector byteVector2 = byteVector0.putUTF8("hi!");
        org.mockito.asm.ByteVector byteVector4 = byteVector2.putLong((long) (byte) 10);
        org.mockito.asm.ByteVector byteVector6 = byteVector4.putUTF8("hi!");
        org.mockito.asm.ByteVector byteVector8 = byteVector4.putLong((long) (short) -1);
        org.mockito.asm.ByteVector byteVector10 = byteVector8.putUTF8("hi!");
        org.mockito.asm.ByteVector byteVector12 = byteVector8.putByte((-1));
        org.mockito.asm.ByteVector byteVector14 = byteVector8.putByte(10);
        org.mockito.asm.ByteVector byteVector15 = new org.mockito.asm.ByteVector();
        org.mockito.asm.ByteVector byteVector17 = byteVector15.putUTF8("hi!");
        org.mockito.asm.ByteVector byteVector19 = byteVector15.putLong((long) ' ');
        org.mockito.asm.ByteVector byteVector21 = byteVector19.putByte((int) 'a');
        org.mockito.asm.ByteVector byteVector23 = byteVector19.putByte((int) (short) -1);
        org.mockito.asm.ByteVector byteVector25 = byteVector19.putLong(0L);
        org.mockito.asm.ByteVector byteVector27 = byteVector19.putUTF8("hi!");
        org.mockito.asm.ByteVector byteVector29 = byteVector27.putUTF8("hi!");
        org.mockito.asm.ByteVector byteVector31 = byteVector27.putByte((int) (byte) -1);
        org.mockito.asm.ByteVector byteVector33 = byteVector27.putLong((long) (-1));
        org.mockito.asm.ByteVector byteVector35 = byteVector33.putByte((int) (byte) 1);
        org.mockito.asm.ByteVector byteVector37 = byteVector33.putUTF8("hi!");
        org.mockito.asm.ByteVector byteVector39 = byteVector33.putLong((long) (byte) 1);
        org.mockito.asm.ByteVector byteVector41 = byteVector33.putByte((int) 'a');
        org.mockito.asm.ByteVector byteVector42 = new org.mockito.asm.ByteVector();
        org.mockito.asm.ByteVector byteVector44 = byteVector42.putUTF8("hi!");
        org.mockito.asm.ByteVector byteVector46 = byteVector42.putInt(0);
        org.mockito.asm.ByteVector byteVector48 = byteVector42.putInt(1);
        org.mockito.asm.ByteVector byteVector50 = byteVector42.putUTF8("");
        org.mockito.asm.ByteVector byteVector52 = byteVector50.putLong(10L);
        org.mockito.asm.ByteVector byteVector53 = new org.mockito.asm.ByteVector();
        org.mockito.asm.ByteVector byteVector55 = byteVector53.putUTF8("hi!");
        org.mockito.asm.ByteVector byteVector57 = byteVector55.putLong((long) (byte) 10);
        org.mockito.asm.ByteVector byteVector59 = byteVector57.putUTF8("hi!");
        org.mockito.asm.ByteVector byteVector61 = byteVector57.putLong((-1L));
        org.mockito.asm.ByteVector byteVector63 = new org.mockito.asm.ByteVector((int) (short) 0);
        org.mockito.asm.ByteVector byteVector64 = new org.mockito.asm.ByteVector();
        org.mockito.asm.ByteVector byteVector66 = byteVector64.putUTF8("hi!");
        org.mockito.asm.ByteVector byteVector68 = byteVector64.putInt(0);
        org.mockito.asm.ByteVector byteVector70 = byteVector68.putInt((int) ' ');
        org.mockito.asm.ByteVector byteVector72 = byteVector70.putLong(100L);
        byte[] byteArray76 = new byte[] { (byte) 0, (byte) 10, (byte) 1 };
        org.mockito.asm.ByteVector byteVector79 = byteVector70.putByteArray(byteArray76, 0, 0);
        org.mockito.asm.ByteVector byteVector82 = byteVector63.putByteArray(byteArray76, 1, (int) (short) 0);
        org.mockito.asm.ByteVector byteVector85 = byteVector61.putByteArray(byteArray76, 0, (int) (byte) 1);
        org.mockito.asm.ByteVector byteVector88 = byteVector50.putByteArray(byteArray76, 0, (int) (short) 1);
        org.mockito.asm.ByteVector byteVector91 = byteVector41.putByteArray(byteArray76, 0, (int) (byte) 1);
        // The following exception was thrown during execution in test generation
        try {
            org.mockito.asm.ByteVector byteVector94 = byteVector14.putByteArray(byteArray76, 100, (int) (byte) 10);
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
    public void test1687() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1687");
        org.mockito.asm.ByteVector byteVector0 = new org.mockito.asm.ByteVector();
        org.mockito.asm.ByteVector byteVector2 = byteVector0.putUTF8("hi!");
        org.mockito.asm.ByteVector byteVector4 = byteVector0.putLong((long) ' ');
        org.mockito.asm.ByteVector byteVector6 = byteVector4.putByte((int) 'a');
        org.mockito.asm.ByteVector byteVector8 = byteVector4.putShort(100);
        org.mockito.asm.ByteVector byteVector10 = byteVector8.putByte((int) (byte) 1);
        org.junit.Assert.assertNotNull(byteVector2);
        org.junit.Assert.assertNotNull(byteVector4);
        org.junit.Assert.assertNotNull(byteVector6);
        org.junit.Assert.assertNotNull(byteVector8);
        org.junit.Assert.assertNotNull(byteVector10);
    }

    @Test
    public void test1688() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1688");
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
        org.mockito.asm.ByteVector byteVector48 = byteVector16.putLong((long) (byte) 10);
        org.mockito.asm.ByteVector byteVector50 = byteVector48.putLong(0L);
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
    public void test1689() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1689");
        org.mockito.asm.ByteVector byteVector0 = new org.mockito.asm.ByteVector();
        org.mockito.asm.ByteVector byteVector2 = byteVector0.putUTF8("hi!");
        org.mockito.asm.ByteVector byteVector4 = byteVector0.putInt(0);
        org.mockito.asm.ByteVector byteVector6 = byteVector4.putInt((int) ' ');
        org.mockito.asm.ByteVector byteVector8 = byteVector6.putLong((long) (short) 10);
        org.mockito.asm.ByteVector byteVector10 = byteVector8.putUTF8("hi!");
        org.mockito.asm.ByteVector byteVector12 = byteVector8.putByte(0);
        org.mockito.asm.ByteVector byteVector14 = byteVector12.putInt((int) (short) 1);
        org.mockito.asm.ByteVector byteVector16 = byteVector14.putByte(0);
        org.mockito.asm.ByteVector byteVector18 = byteVector14.putInt(0);
        org.mockito.asm.ByteVector byteVector20 = byteVector18.putByte(0);
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
    public void test1690() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1690");
        org.mockito.asm.ByteVector byteVector0 = new org.mockito.asm.ByteVector();
        org.mockito.asm.ByteVector byteVector2 = byteVector0.putUTF8("hi!");
        org.mockito.asm.ByteVector byteVector4 = byteVector0.putLong((long) ' ');
        org.mockito.asm.ByteVector byteVector6 = byteVector4.putByte((int) 'a');
        org.mockito.asm.ByteVector byteVector8 = byteVector6.putByte((int) (short) -1);
        byte[] byteArray9 = null;
        org.mockito.asm.ByteVector byteVector12 = byteVector6.putByteArray(byteArray9, (int) '#', 0);
        org.mockito.asm.ByteVector byteVector14 = byteVector6.putUTF8("");
        org.mockito.asm.ByteVector byteVector16 = byteVector6.putInt((int) '4');
        org.mockito.asm.ByteVector byteVector18 = byteVector6.putInt((int) (byte) 1);
        org.mockito.asm.ByteVector byteVector20 = byteVector18.putByte((int) (short) -1);
        org.mockito.asm.ByteVector byteVector22 = byteVector18.putLong((long) ' ');
        org.mockito.asm.ByteVector byteVector24 = byteVector22.putShort((int) (short) 0);
        org.junit.Assert.assertNotNull(byteVector2);
        org.junit.Assert.assertNotNull(byteVector4);
        org.junit.Assert.assertNotNull(byteVector6);
        org.junit.Assert.assertNotNull(byteVector8);
        org.junit.Assert.assertNotNull(byteVector12);
        org.junit.Assert.assertNotNull(byteVector14);
        org.junit.Assert.assertNotNull(byteVector16);
        org.junit.Assert.assertNotNull(byteVector18);
        org.junit.Assert.assertNotNull(byteVector20);
        org.junit.Assert.assertNotNull(byteVector22);
        org.junit.Assert.assertNotNull(byteVector24);
    }

    @Test
    public void test1691() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1691");
        org.mockito.asm.ByteVector byteVector0 = new org.mockito.asm.ByteVector();
        org.mockito.asm.ByteVector byteVector2 = byteVector0.putUTF8("hi!");
        org.mockito.asm.ByteVector byteVector4 = byteVector2.putInt((int) (byte) 10);
        org.mockito.asm.ByteVector byteVector6 = byteVector4.putUTF8("");
        org.mockito.asm.ByteVector byteVector8 = byteVector6.putUTF8("hi!");
        org.mockito.asm.ByteVector byteVector10 = byteVector6.putInt((int) (byte) 1);
        org.mockito.asm.ByteVector byteVector12 = byteVector6.putUTF8("");
        org.mockito.asm.ByteVector byteVector14 = byteVector6.putInt(1);
        org.mockito.asm.ByteVector byteVector16 = byteVector6.putLong((long) (short) -1);
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
    public void test1692() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1692");
        org.mockito.asm.ByteVector byteVector0 = new org.mockito.asm.ByteVector();
        org.mockito.asm.ByteVector byteVector2 = byteVector0.putUTF8("hi!");
        org.mockito.asm.ByteVector byteVector4 = byteVector2.putLong((long) (byte) 10);
        org.mockito.asm.ByteVector byteVector6 = byteVector4.putUTF8("hi!");
        org.mockito.asm.ByteVector byteVector8 = byteVector4.putLong((long) 10);
        org.mockito.asm.ByteVector byteVector10 = byteVector8.putByte((int) '4');
        org.mockito.asm.ByteVector byteVector12 = byteVector10.putLong(10L);
        org.mockito.asm.ByteVector byteVector14 = byteVector12.putLong((long) (short) 100);
        org.junit.Assert.assertNotNull(byteVector2);
        org.junit.Assert.assertNotNull(byteVector4);
        org.junit.Assert.assertNotNull(byteVector6);
        org.junit.Assert.assertNotNull(byteVector8);
        org.junit.Assert.assertNotNull(byteVector10);
        org.junit.Assert.assertNotNull(byteVector12);
        org.junit.Assert.assertNotNull(byteVector14);
    }

    @Test
    public void test1693() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1693");
        org.mockito.asm.ByteVector byteVector1 = new org.mockito.asm.ByteVector((int) (byte) 10);
        org.mockito.asm.ByteVector byteVector3 = byteVector1.putByte((int) '4');
        org.mockito.asm.ByteVector byteVector5 = byteVector1.putLong(0L);
        org.mockito.asm.ByteVector byteVector7 = byteVector5.putUTF8("");
        org.mockito.asm.ByteVector byteVector9 = byteVector5.putShort((int) ' ');
        org.mockito.asm.ByteVector byteVector11 = byteVector9.putUTF8("");
        java.lang.Class<?> wildcardClass12 = byteVector9.getClass();
        org.junit.Assert.assertNotNull(byteVector3);
        org.junit.Assert.assertNotNull(byteVector5);
        org.junit.Assert.assertNotNull(byteVector7);
        org.junit.Assert.assertNotNull(byteVector9);
        org.junit.Assert.assertNotNull(byteVector11);
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test1694() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1694");
        org.mockito.asm.ByteVector byteVector1 = new org.mockito.asm.ByteVector((int) (short) 0);
        org.mockito.asm.ByteVector byteVector2 = new org.mockito.asm.ByteVector();
        org.mockito.asm.ByteVector byteVector4 = byteVector2.putUTF8("hi!");
        org.mockito.asm.ByteVector byteVector6 = byteVector2.putInt(0);
        org.mockito.asm.ByteVector byteVector8 = byteVector6.putInt((int) ' ');
        org.mockito.asm.ByteVector byteVector10 = byteVector8.putLong(100L);
        byte[] byteArray14 = new byte[] { (byte) 0, (byte) 10, (byte) 1 };
        org.mockito.asm.ByteVector byteVector17 = byteVector8.putByteArray(byteArray14, 0, 0);
        org.mockito.asm.ByteVector byteVector20 = byteVector1.putByteArray(byteArray14, 1, (int) (short) 0);
        org.mockito.asm.ByteVector byteVector22 = byteVector1.putLong((long) 10);
        org.mockito.asm.ByteVector byteVector24 = byteVector22.putByte(0);
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
    public void test1695() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1695");
        org.mockito.asm.ByteVector byteVector0 = new org.mockito.asm.ByteVector();
        org.mockito.asm.ByteVector byteVector2 = byteVector0.putUTF8("hi!");
        org.mockito.asm.ByteVector byteVector4 = byteVector2.putLong((long) (byte) 10);
        org.mockito.asm.ByteVector byteVector6 = byteVector2.putInt((int) (short) 1);
        org.mockito.asm.ByteVector byteVector8 = byteVector2.putLong((long) (short) 10);
        org.mockito.asm.ByteVector byteVector10 = byteVector2.putShort(10);
        org.mockito.asm.ByteVector byteVector12 = byteVector10.putInt((int) (byte) 0);
        org.mockito.asm.ByteVector byteVector14 = byteVector12.putUTF8("");
        org.mockito.asm.ByteVector byteVector16 = byteVector14.putUTF8("hi!");
        org.mockito.asm.ByteVector byteVector18 = new org.mockito.asm.ByteVector((int) '#');
        org.mockito.asm.ByteVector byteVector20 = byteVector18.putInt(100);
        org.mockito.asm.ByteVector byteVector22 = byteVector18.putUTF8("");
        org.mockito.asm.ByteVector byteVector23 = new org.mockito.asm.ByteVector();
        org.mockito.asm.ByteVector byteVector25 = byteVector23.putUTF8("hi!");
        org.mockito.asm.ByteVector byteVector27 = byteVector25.putInt(0);
        org.mockito.asm.ByteVector byteVector29 = byteVector27.putByte((int) (short) 0);
        org.mockito.asm.ByteVector byteVector31 = byteVector27.putUTF8("");
        org.mockito.asm.ByteVector byteVector32 = new org.mockito.asm.ByteVector();
        org.mockito.asm.ByteVector byteVector34 = byteVector32.putUTF8("hi!");
        org.mockito.asm.ByteVector byteVector36 = byteVector32.putInt(0);
        org.mockito.asm.ByteVector byteVector38 = byteVector32.putShort((int) '4');
        org.mockito.asm.ByteVector byteVector40 = byteVector32.putByte(100);
        org.mockito.asm.ByteVector byteVector42 = byteVector40.putInt((int) (byte) 10);
        org.mockito.asm.ByteVector byteVector44 = byteVector40.putInt((int) (byte) 10);
        org.mockito.asm.ByteVector byteVector46 = byteVector44.putByte(100);
        org.mockito.asm.ByteVector byteVector47 = new org.mockito.asm.ByteVector();
        org.mockito.asm.ByteVector byteVector49 = byteVector47.putUTF8("hi!");
        org.mockito.asm.ByteVector byteVector51 = byteVector47.putInt(0);
        org.mockito.asm.ByteVector byteVector53 = byteVector51.putInt((int) ' ');
        org.mockito.asm.ByteVector byteVector55 = byteVector53.putLong(100L);
        byte[] byteArray59 = new byte[] { (byte) 0, (byte) 10, (byte) 1 };
        org.mockito.asm.ByteVector byteVector62 = byteVector53.putByteArray(byteArray59, 0, 0);
        org.mockito.asm.ByteVector byteVector65 = byteVector46.putByteArray(byteArray59, (int) (byte) 1, (int) (byte) 0);
        org.mockito.asm.ByteVector byteVector68 = byteVector27.putByteArray(byteArray59, (int) (short) 0, 0);
        org.mockito.asm.ByteVector byteVector71 = byteVector22.putByteArray(byteArray59, (int) (byte) 0, (int) (short) 1);
        // The following exception was thrown during execution in test generation
        try {
            org.mockito.asm.ByteVector byteVector74 = byteVector14.putByteArray(byteArray59, (int) (byte) 0, (int) ' ');
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
        org.junit.Assert.assertNotNull(byteArray59);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray59), "[0, 10, 1]");
        org.junit.Assert.assertNotNull(byteVector62);
        org.junit.Assert.assertNotNull(byteVector65);
        org.junit.Assert.assertNotNull(byteVector68);
        org.junit.Assert.assertNotNull(byteVector71);
    }

    @Test
    public void test1696() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1696");
        org.mockito.asm.ByteVector byteVector1 = new org.mockito.asm.ByteVector((int) (byte) 10);
        org.mockito.asm.ByteVector byteVector3 = byteVector1.putByte((int) '4');
        org.mockito.asm.ByteVector byteVector5 = byteVector1.putLong(0L);
        org.mockito.asm.ByteVector byteVector7 = byteVector1.putUTF8("");
        org.mockito.asm.ByteVector byteVector9 = byteVector7.putLong(10L);
        org.mockito.asm.ByteVector byteVector10 = new org.mockito.asm.ByteVector();
        org.mockito.asm.ByteVector byteVector12 = byteVector10.putUTF8("hi!");
        org.mockito.asm.ByteVector byteVector14 = byteVector12.putByte(100);
        org.mockito.asm.ByteVector byteVector16 = byteVector12.putLong((long) 10);
        org.mockito.asm.ByteVector byteVector18 = byteVector12.putShort((int) (short) -1);
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
        org.mockito.asm.ByteVector byteVector81 = byteVector12.putByteArray(byteArray69, 1, 1);
        // The following exception was thrown during execution in test generation
        try {
            org.mockito.asm.ByteVector byteVector84 = byteVector7.putByteArray(byteArray69, 100, (int) '#');
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
    }

    @Test
    public void test1697() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1697");
        org.mockito.asm.ByteVector byteVector0 = new org.mockito.asm.ByteVector();
        org.mockito.asm.ByteVector byteVector2 = byteVector0.putUTF8("hi!");
        org.mockito.asm.ByteVector byteVector4 = byteVector0.putShort((int) (short) -1);
        org.mockito.asm.ByteVector byteVector6 = byteVector0.putInt(0);
        org.mockito.asm.ByteVector byteVector8 = byteVector0.putShort(0);
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
    public void test1698() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1698");
        org.mockito.asm.ByteVector byteVector0 = new org.mockito.asm.ByteVector();
        org.mockito.asm.ByteVector byteVector2 = byteVector0.putUTF8("hi!");
        org.mockito.asm.ByteVector byteVector4 = byteVector2.putInt((int) (byte) 10);
        org.mockito.asm.ByteVector byteVector6 = byteVector4.putUTF8("");
        org.mockito.asm.ByteVector byteVector8 = byteVector6.putUTF8("hi!");
        org.mockito.asm.ByteVector byteVector10 = byteVector6.putInt((int) '#');
        org.mockito.asm.ByteVector byteVector12 = byteVector10.putInt((int) (byte) 100);
        org.mockito.asm.ByteVector byteVector14 = byteVector10.putInt((int) (byte) 100);
        org.junit.Assert.assertNotNull(byteVector2);
        org.junit.Assert.assertNotNull(byteVector4);
        org.junit.Assert.assertNotNull(byteVector6);
        org.junit.Assert.assertNotNull(byteVector8);
        org.junit.Assert.assertNotNull(byteVector10);
        org.junit.Assert.assertNotNull(byteVector12);
        org.junit.Assert.assertNotNull(byteVector14);
    }

    @Test
    public void test1699() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1699");
        org.mockito.asm.ByteVector byteVector0 = new org.mockito.asm.ByteVector();
        org.mockito.asm.ByteVector byteVector2 = byteVector0.putUTF8("hi!");
        org.mockito.asm.ByteVector byteVector4 = byteVector0.putInt(0);
        org.mockito.asm.ByteVector byteVector6 = byteVector4.putInt((int) ' ');
        org.mockito.asm.ByteVector byteVector8 = byteVector6.putLong((long) (short) 10);
        org.mockito.asm.ByteVector byteVector10 = byteVector8.putUTF8("hi!");
        org.mockito.asm.ByteVector byteVector12 = byteVector8.putByte(0);
        org.mockito.asm.ByteVector byteVector14 = byteVector12.putInt((int) (short) 1);
        org.mockito.asm.ByteVector byteVector16 = byteVector14.putByte(0);
        org.mockito.asm.ByteVector byteVector18 = byteVector14.putInt(0);
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
    public void test1700() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1700");
        org.mockito.asm.ByteVector byteVector0 = new org.mockito.asm.ByteVector();
        org.mockito.asm.ByteVector byteVector2 = byteVector0.putUTF8("hi!");
        org.mockito.asm.ByteVector byteVector4 = byteVector2.putInt((int) (byte) 10);
        org.mockito.asm.ByteVector byteVector6 = byteVector4.putUTF8("");
        org.mockito.asm.ByteVector byteVector8 = byteVector4.putLong(0L);
        org.mockito.asm.ByteVector byteVector10 = byteVector4.putInt((-1));
        org.mockito.asm.ByteVector byteVector12 = byteVector10.putShort((int) (byte) 1);
        org.junit.Assert.assertNotNull(byteVector2);
        org.junit.Assert.assertNotNull(byteVector4);
        org.junit.Assert.assertNotNull(byteVector6);
        org.junit.Assert.assertNotNull(byteVector8);
        org.junit.Assert.assertNotNull(byteVector10);
        org.junit.Assert.assertNotNull(byteVector12);
    }

    @Test
    public void test1701() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1701");
        org.mockito.asm.ByteVector byteVector0 = new org.mockito.asm.ByteVector();
        org.mockito.asm.ByteVector byteVector2 = byteVector0.putUTF8("hi!");
        org.mockito.asm.ByteVector byteVector4 = byteVector2.putInt((int) (byte) 10);
        org.mockito.asm.ByteVector byteVector6 = byteVector2.putLong((long) 10);
        org.mockito.asm.ByteVector byteVector8 = byteVector2.putByte((int) (short) -1);
        org.mockito.asm.ByteVector byteVector10 = byteVector8.putUTF8("");
        org.junit.Assert.assertNotNull(byteVector2);
        org.junit.Assert.assertNotNull(byteVector4);
        org.junit.Assert.assertNotNull(byteVector6);
        org.junit.Assert.assertNotNull(byteVector8);
        org.junit.Assert.assertNotNull(byteVector10);
    }

    @Test
    public void test1702() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1702");
        org.mockito.asm.ByteVector byteVector0 = new org.mockito.asm.ByteVector();
        org.mockito.asm.ByteVector byteVector2 = byteVector0.putUTF8("hi!");
        org.mockito.asm.ByteVector byteVector4 = byteVector0.putByte((int) (byte) 1);
        org.mockito.asm.ByteVector byteVector6 = byteVector0.putLong((long) (short) 1);
        org.mockito.asm.ByteVector byteVector8 = byteVector0.putShort((int) (byte) 100);
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
    public void test1703() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1703");
        org.mockito.asm.ByteVector byteVector1 = new org.mockito.asm.ByteVector((int) '#');
        org.mockito.asm.ByteVector byteVector3 = byteVector1.putLong(100L);
        org.mockito.asm.ByteVector byteVector5 = byteVector3.putUTF8("");
        org.mockito.asm.ByteVector byteVector7 = byteVector3.putLong((long) '#');
        org.mockito.asm.ByteVector byteVector9 = byteVector7.putByte((int) ' ');
        org.mockito.asm.ByteVector byteVector10 = new org.mockito.asm.ByteVector();
        org.mockito.asm.ByteVector byteVector12 = byteVector10.putUTF8("hi!");
        org.mockito.asm.ByteVector byteVector14 = byteVector10.putLong((long) ' ');
        org.mockito.asm.ByteVector byteVector16 = byteVector14.putByte((int) 'a');
        org.mockito.asm.ByteVector byteVector18 = byteVector14.putByte((int) (short) -1);
        org.mockito.asm.ByteVector byteVector20 = byteVector14.putLong(0L);
        org.mockito.asm.ByteVector byteVector22 = byteVector14.putUTF8("hi!");
        org.mockito.asm.ByteVector byteVector24 = byteVector22.putUTF8("hi!");
        org.mockito.asm.ByteVector byteVector26 = byteVector22.putByte((int) (byte) -1);
        org.mockito.asm.ByteVector byteVector28 = byteVector22.putLong((long) (-1));
        org.mockito.asm.ByteVector byteVector30 = byteVector28.putByte((int) (byte) 1);
        org.mockito.asm.ByteVector byteVector32 = byteVector28.putUTF8("hi!");
        org.mockito.asm.ByteVector byteVector34 = byteVector28.putLong((long) (byte) 1);
        org.mockito.asm.ByteVector byteVector36 = byteVector28.putByte((int) 'a');
        org.mockito.asm.ByteVector byteVector37 = new org.mockito.asm.ByteVector();
        org.mockito.asm.ByteVector byteVector39 = byteVector37.putUTF8("hi!");
        org.mockito.asm.ByteVector byteVector41 = byteVector37.putInt(0);
        org.mockito.asm.ByteVector byteVector43 = byteVector37.putInt(1);
        org.mockito.asm.ByteVector byteVector45 = byteVector37.putUTF8("");
        org.mockito.asm.ByteVector byteVector47 = byteVector45.putLong(10L);
        org.mockito.asm.ByteVector byteVector48 = new org.mockito.asm.ByteVector();
        org.mockito.asm.ByteVector byteVector50 = byteVector48.putUTF8("hi!");
        org.mockito.asm.ByteVector byteVector52 = byteVector50.putLong((long) (byte) 10);
        org.mockito.asm.ByteVector byteVector54 = byteVector52.putUTF8("hi!");
        org.mockito.asm.ByteVector byteVector56 = byteVector52.putLong((-1L));
        org.mockito.asm.ByteVector byteVector58 = new org.mockito.asm.ByteVector((int) (short) 0);
        org.mockito.asm.ByteVector byteVector59 = new org.mockito.asm.ByteVector();
        org.mockito.asm.ByteVector byteVector61 = byteVector59.putUTF8("hi!");
        org.mockito.asm.ByteVector byteVector63 = byteVector59.putInt(0);
        org.mockito.asm.ByteVector byteVector65 = byteVector63.putInt((int) ' ');
        org.mockito.asm.ByteVector byteVector67 = byteVector65.putLong(100L);
        byte[] byteArray71 = new byte[] { (byte) 0, (byte) 10, (byte) 1 };
        org.mockito.asm.ByteVector byteVector74 = byteVector65.putByteArray(byteArray71, 0, 0);
        org.mockito.asm.ByteVector byteVector77 = byteVector58.putByteArray(byteArray71, 1, (int) (short) 0);
        org.mockito.asm.ByteVector byteVector80 = byteVector56.putByteArray(byteArray71, 0, (int) (byte) 1);
        org.mockito.asm.ByteVector byteVector83 = byteVector45.putByteArray(byteArray71, 0, (int) (short) 1);
        org.mockito.asm.ByteVector byteVector86 = byteVector36.putByteArray(byteArray71, 0, (int) (byte) 1);
        // The following exception was thrown during execution in test generation
        try {
            org.mockito.asm.ByteVector byteVector89 = byteVector9.putByteArray(byteArray71, (int) (short) 100, 0);
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
        org.junit.Assert.assertNotNull(byteVector30);
        org.junit.Assert.assertNotNull(byteVector32);
        org.junit.Assert.assertNotNull(byteVector34);
        org.junit.Assert.assertNotNull(byteVector36);
        org.junit.Assert.assertNotNull(byteVector39);
        org.junit.Assert.assertNotNull(byteVector41);
        org.junit.Assert.assertNotNull(byteVector43);
        org.junit.Assert.assertNotNull(byteVector45);
        org.junit.Assert.assertNotNull(byteVector47);
        org.junit.Assert.assertNotNull(byteVector50);
        org.junit.Assert.assertNotNull(byteVector52);
        org.junit.Assert.assertNotNull(byteVector54);
        org.junit.Assert.assertNotNull(byteVector56);
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
    public void test1704() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1704");
        org.mockito.asm.ByteVector byteVector1 = new org.mockito.asm.ByteVector(0);
        org.mockito.asm.ByteVector byteVector3 = byteVector1.putUTF8("hi!");
        org.mockito.asm.ByteVector byteVector5 = byteVector3.putShort((int) (short) 1);
        org.junit.Assert.assertNotNull(byteVector3);
        org.junit.Assert.assertNotNull(byteVector5);
    }

    @Test
    public void test1705() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1705");
        org.mockito.asm.ByteVector byteVector1 = new org.mockito.asm.ByteVector((int) '#');
        org.mockito.asm.ByteVector byteVector3 = byteVector1.putLong(100L);
        org.mockito.asm.ByteVector byteVector5 = byteVector1.putUTF8("");
        org.mockito.asm.ByteVector byteVector7 = byteVector1.putUTF8("hi!");
        org.mockito.asm.ByteVector byteVector9 = byteVector7.putLong((long) (short) 0);
        org.mockito.asm.ByteVector byteVector11 = byteVector9.putLong((long) 1);
        org.mockito.asm.ByteVector byteVector13 = byteVector11.putUTF8("hi!");
        org.mockito.asm.ByteVector byteVector15 = byteVector13.putInt((int) (byte) -1);
        org.mockito.asm.ByteVector byteVector17 = byteVector13.putInt((int) (short) 100);
        org.mockito.asm.ByteVector byteVector19 = byteVector13.putByte(0);
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
    public void test1706() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1706");
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
        byte[] byteArray21 = null;
        org.mockito.asm.ByteVector byteVector24 = byteVector14.putByteArray(byteArray21, (int) 'a', 1);
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
        org.junit.Assert.assertNotNull(byteVector24);
    }

    @Test
    public void test1707() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1707");
        org.mockito.asm.ByteVector byteVector1 = new org.mockito.asm.ByteVector((int) (short) 100);
        java.lang.Class<?> wildcardClass2 = byteVector1.getClass();
        org.junit.Assert.assertNotNull(wildcardClass2);
    }

    @Test
    public void test1708() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1708");
        org.mockito.asm.ByteVector byteVector0 = new org.mockito.asm.ByteVector();
        org.mockito.asm.ByteVector byteVector2 = byteVector0.putUTF8("hi!");
        org.mockito.asm.ByteVector byteVector4 = byteVector2.putInt((int) (byte) 10);
        org.mockito.asm.ByteVector byteVector6 = byteVector4.putUTF8("");
        org.mockito.asm.ByteVector byteVector8 = byteVector6.putUTF8("hi!");
        org.mockito.asm.ByteVector byteVector10 = byteVector6.putInt((int) '#');
        org.mockito.asm.ByteVector byteVector12 = byteVector6.putUTF8("hi!");
        org.mockito.asm.ByteVector byteVector14 = byteVector12.putByte((-1));
        org.mockito.asm.ByteVector byteVector16 = byteVector14.putLong((long) 10);
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
    public void test1709() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1709");
        org.mockito.asm.ByteVector byteVector0 = new org.mockito.asm.ByteVector();
        org.mockito.asm.ByteVector byteVector2 = byteVector0.putUTF8("hi!");
        org.mockito.asm.ByteVector byteVector4 = byteVector2.putByte(100);
        org.mockito.asm.ByteVector byteVector6 = byteVector2.putLong((long) (short) 100);
        org.mockito.asm.ByteVector byteVector8 = byteVector6.putShort((int) (short) 100);
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
            org.mockito.asm.ByteVector byteVector66 = byteVector8.putByteArray(byteArray51, (int) ' ', 1);
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
    public void test1710() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1710");
        org.mockito.asm.ByteVector byteVector0 = new org.mockito.asm.ByteVector();
        org.mockito.asm.ByteVector byteVector2 = byteVector0.putUTF8("hi!");
        org.mockito.asm.ByteVector byteVector4 = byteVector0.putLong((long) ' ');
        org.mockito.asm.ByteVector byteVector6 = byteVector4.putByte((int) 'a');
        org.mockito.asm.ByteVector byteVector8 = byteVector4.putByte((int) (short) -1);
        org.mockito.asm.ByteVector byteVector10 = byteVector4.putLong(0L);
        org.mockito.asm.ByteVector byteVector12 = byteVector10.putInt((int) (short) -1);
        org.mockito.asm.ByteVector byteVector14 = byteVector12.putLong((long) (byte) -1);
        org.mockito.asm.ByteVector byteVector16 = byteVector12.putInt((int) (short) 1);
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
    public void test1711() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1711");
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
        org.mockito.asm.ByteVector byteVector22 = byteVector14.putInt((int) (short) 0);
        java.lang.Class<?> wildcardClass23 = byteVector14.getClass();
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
    public void test1712() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1712");
        org.mockito.asm.ByteVector byteVector0 = new org.mockito.asm.ByteVector();
        org.mockito.asm.ByteVector byteVector2 = byteVector0.putUTF8("hi!");
        org.mockito.asm.ByteVector byteVector4 = byteVector0.putInt(0);
        org.mockito.asm.ByteVector byteVector6 = byteVector0.putShort(10);
        org.mockito.asm.ByteVector byteVector8 = byteVector6.putLong((long) '4');
        org.mockito.asm.ByteVector byteVector10 = byteVector6.putShort((int) ' ');
        org.mockito.asm.ByteVector byteVector12 = byteVector6.putInt((int) (byte) -1);
        org.mockito.asm.ByteVector byteVector14 = byteVector6.putByte((int) (byte) -1);
        org.mockito.asm.ByteVector byteVector16 = byteVector6.putInt((int) (byte) 1);
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
    public void test1713() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1713");
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
        org.mockito.asm.ByteVector byteVector22 = byteVector18.putUTF8("hi!");
        org.mockito.asm.ByteVector byteVector24 = byteVector18.putLong((long) (byte) 1);
        org.mockito.asm.ByteVector byteVector26 = byteVector18.putByte((int) (short) 10);
        org.mockito.asm.ByteVector byteVector28 = byteVector18.putByte((int) (short) 100);
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
    public void test1714() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1714");
        org.mockito.asm.ByteVector byteVector1 = new org.mockito.asm.ByteVector((int) (short) 1);
        org.mockito.asm.ByteVector byteVector3 = byteVector1.putLong((long) (byte) 1);
        org.mockito.asm.ByteVector byteVector5 = byteVector1.putInt(1);
        org.mockito.asm.ByteVector byteVector7 = byteVector1.putInt(100);
        org.mockito.asm.ByteVector byteVector9 = byteVector7.putShort(1);
        org.junit.Assert.assertNotNull(byteVector3);
        org.junit.Assert.assertNotNull(byteVector5);
        org.junit.Assert.assertNotNull(byteVector7);
        org.junit.Assert.assertNotNull(byteVector9);
    }

    @Test
    public void test1715() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1715");
        org.mockito.asm.ByteVector byteVector0 = new org.mockito.asm.ByteVector();
        org.mockito.asm.ByteVector byteVector2 = byteVector0.putUTF8("hi!");
        org.mockito.asm.ByteVector byteVector4 = byteVector0.putLong((long) ' ');
        org.mockito.asm.ByteVector byteVector6 = byteVector4.putByte((int) 'a');
        org.mockito.asm.ByteVector byteVector8 = byteVector6.putByte((int) (short) -1);
        byte[] byteArray9 = null;
        org.mockito.asm.ByteVector byteVector12 = byteVector6.putByteArray(byteArray9, (int) '#', 0);
        org.mockito.asm.ByteVector byteVector14 = byteVector6.putUTF8("");
        org.mockito.asm.ByteVector byteVector16 = byteVector6.putInt((int) '4');
        org.mockito.asm.ByteVector byteVector18 = byteVector6.putInt((int) (byte) 1);
        org.mockito.asm.ByteVector byteVector20 = byteVector18.putByte((int) (short) -1);
        org.mockito.asm.ByteVector byteVector22 = byteVector18.putUTF8("hi!");
        org.mockito.asm.ByteVector byteVector24 = byteVector22.putShort(0);
        org.mockito.asm.ByteVector byteVector26 = byteVector22.putShort((int) 'a');
        org.junit.Assert.assertNotNull(byteVector2);
        org.junit.Assert.assertNotNull(byteVector4);
        org.junit.Assert.assertNotNull(byteVector6);
        org.junit.Assert.assertNotNull(byteVector8);
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
    public void test1716() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1716");
        org.mockito.asm.ByteVector byteVector0 = new org.mockito.asm.ByteVector();
        org.mockito.asm.ByteVector byteVector2 = byteVector0.putUTF8("hi!");
        org.mockito.asm.ByteVector byteVector4 = byteVector2.putLong((long) (byte) 10);
        org.mockito.asm.ByteVector byteVector6 = byteVector4.putUTF8("hi!");
        org.mockito.asm.ByteVector byteVector8 = byteVector4.putLong((long) 10);
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
    public void test1717() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1717");
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
        org.mockito.asm.ByteVector byteVector31 = byteVector29.putUTF8("hi!");
        org.mockito.asm.ByteVector byteVector33 = byteVector29.putByte((int) (byte) -1);
        org.mockito.asm.ByteVector byteVector35 = byteVector29.putLong((long) (-1));
        org.mockito.asm.ByteVector byteVector37 = byteVector35.putByte((int) (byte) 1);
        org.mockito.asm.ByteVector byteVector39 = byteVector35.putUTF8("hi!");
        org.mockito.asm.ByteVector byteVector41 = byteVector35.putLong((long) (byte) 1);
        org.mockito.asm.ByteVector byteVector43 = byteVector35.putByte((int) 'a');
        org.mockito.asm.ByteVector byteVector44 = new org.mockito.asm.ByteVector();
        org.mockito.asm.ByteVector byteVector46 = byteVector44.putUTF8("hi!");
        org.mockito.asm.ByteVector byteVector48 = byteVector44.putInt(0);
        org.mockito.asm.ByteVector byteVector50 = byteVector44.putInt(1);
        org.mockito.asm.ByteVector byteVector52 = byteVector44.putUTF8("");
        org.mockito.asm.ByteVector byteVector54 = byteVector52.putLong(10L);
        org.mockito.asm.ByteVector byteVector55 = new org.mockito.asm.ByteVector();
        org.mockito.asm.ByteVector byteVector57 = byteVector55.putUTF8("hi!");
        org.mockito.asm.ByteVector byteVector59 = byteVector57.putLong((long) (byte) 10);
        org.mockito.asm.ByteVector byteVector61 = byteVector59.putUTF8("hi!");
        org.mockito.asm.ByteVector byteVector63 = byteVector59.putLong((-1L));
        org.mockito.asm.ByteVector byteVector65 = new org.mockito.asm.ByteVector((int) (short) 0);
        org.mockito.asm.ByteVector byteVector66 = new org.mockito.asm.ByteVector();
        org.mockito.asm.ByteVector byteVector68 = byteVector66.putUTF8("hi!");
        org.mockito.asm.ByteVector byteVector70 = byteVector66.putInt(0);
        org.mockito.asm.ByteVector byteVector72 = byteVector70.putInt((int) ' ');
        org.mockito.asm.ByteVector byteVector74 = byteVector72.putLong(100L);
        byte[] byteArray78 = new byte[] { (byte) 0, (byte) 10, (byte) 1 };
        org.mockito.asm.ByteVector byteVector81 = byteVector72.putByteArray(byteArray78, 0, 0);
        org.mockito.asm.ByteVector byteVector84 = byteVector65.putByteArray(byteArray78, 1, (int) (short) 0);
        org.mockito.asm.ByteVector byteVector87 = byteVector63.putByteArray(byteArray78, 0, (int) (byte) 1);
        org.mockito.asm.ByteVector byteVector90 = byteVector52.putByteArray(byteArray78, 0, (int) (short) 1);
        org.mockito.asm.ByteVector byteVector93 = byteVector43.putByteArray(byteArray78, 0, (int) (byte) 1);
        // The following exception was thrown during execution in test generation
        try {
            org.mockito.asm.ByteVector byteVector96 = byteVector16.putByteArray(byteArray78, (int) (byte) 10, (int) '4');
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
        org.junit.Assert.assertNotNull(byteVector39);
        org.junit.Assert.assertNotNull(byteVector41);
        org.junit.Assert.assertNotNull(byteVector43);
        org.junit.Assert.assertNotNull(byteVector46);
        org.junit.Assert.assertNotNull(byteVector48);
        org.junit.Assert.assertNotNull(byteVector50);
        org.junit.Assert.assertNotNull(byteVector52);
        org.junit.Assert.assertNotNull(byteVector54);
        org.junit.Assert.assertNotNull(byteVector57);
        org.junit.Assert.assertNotNull(byteVector59);
        org.junit.Assert.assertNotNull(byteVector61);
        org.junit.Assert.assertNotNull(byteVector63);
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
    public void test1718() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1718");
        org.mockito.asm.ByteVector byteVector0 = new org.mockito.asm.ByteVector();
        org.mockito.asm.ByteVector byteVector2 = byteVector0.putUTF8("hi!");
        org.mockito.asm.ByteVector byteVector4 = byteVector2.putLong((long) (byte) 10);
        org.mockito.asm.ByteVector byteVector6 = byteVector4.putUTF8("hi!");
        org.mockito.asm.ByteVector byteVector8 = byteVector4.putLong((long) 10);
        org.mockito.asm.ByteVector byteVector10 = byteVector8.putLong(0L);
        org.mockito.asm.ByteVector byteVector12 = byteVector10.putShort((int) (byte) -1);
        org.mockito.asm.ByteVector byteVector14 = byteVector10.putInt((-1));
        org.mockito.asm.ByteVector byteVector16 = byteVector10.putByte((int) (byte) 100);
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
    public void test1719() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1719");
        org.mockito.asm.ByteVector byteVector0 = new org.mockito.asm.ByteVector();
        org.mockito.asm.ByteVector byteVector2 = byteVector0.putUTF8("hi!");
        org.mockito.asm.ByteVector byteVector4 = byteVector0.putShort((int) (short) -1);
        org.mockito.asm.ByteVector byteVector6 = byteVector0.putLong(0L);
        org.mockito.asm.ByteVector byteVector8 = byteVector0.putShort((int) (byte) -1);
        org.mockito.asm.ByteVector byteVector10 = byteVector0.putInt((int) (byte) 0);
        org.mockito.asm.ByteVector byteVector12 = byteVector10.putLong((long) 'a');
        org.mockito.asm.ByteVector byteVector14 = byteVector10.putByte(1);
        org.mockito.asm.ByteVector byteVector16 = byteVector14.putUTF8("hi!");
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
    public void test1720() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1720");
        org.mockito.asm.ByteVector byteVector0 = new org.mockito.asm.ByteVector();
        org.mockito.asm.ByteVector byteVector2 = byteVector0.putUTF8("hi!");
        org.mockito.asm.ByteVector byteVector4 = byteVector2.putInt(0);
        org.mockito.asm.ByteVector byteVector6 = byteVector2.putShort((int) (byte) 10);
        org.mockito.asm.ByteVector byteVector8 = byteVector2.putUTF8("");
        org.mockito.asm.ByteVector byteVector10 = byteVector8.putByte((int) (byte) 1);
        org.mockito.asm.ByteVector byteVector12 = byteVector10.putShort(0);
        org.junit.Assert.assertNotNull(byteVector2);
        org.junit.Assert.assertNotNull(byteVector4);
        org.junit.Assert.assertNotNull(byteVector6);
        org.junit.Assert.assertNotNull(byteVector8);
        org.junit.Assert.assertNotNull(byteVector10);
        org.junit.Assert.assertNotNull(byteVector12);
    }

    @Test
    public void test1721() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1721");
        org.mockito.asm.ByteVector byteVector0 = new org.mockito.asm.ByteVector();
        org.mockito.asm.ByteVector byteVector2 = byteVector0.putUTF8("hi!");
        org.mockito.asm.ByteVector byteVector4 = byteVector0.putLong((long) (short) 1);
        org.mockito.asm.ByteVector byteVector6 = byteVector4.putUTF8("");
        org.mockito.asm.ByteVector byteVector8 = byteVector6.putShort((int) (short) 0);
        org.mockito.asm.ByteVector byteVector10 = byteVector6.putByte((int) ' ');
        org.mockito.asm.ByteVector byteVector12 = byteVector6.putShort(100);
        org.mockito.asm.ByteVector byteVector14 = byteVector12.putLong((long) 1);
        org.mockito.asm.ByteVector byteVector16 = byteVector14.putLong(1L);
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
    public void test1722() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1722");
        org.mockito.asm.ByteVector byteVector0 = new org.mockito.asm.ByteVector();
        org.mockito.asm.ByteVector byteVector2 = byteVector0.putUTF8("hi!");
        org.mockito.asm.ByteVector byteVector4 = byteVector0.putByte((int) (byte) 1);
        org.mockito.asm.ByteVector byteVector6 = byteVector0.putLong((long) (short) 1);
        org.mockito.asm.ByteVector byteVector8 = byteVector0.putUTF8("");
        org.mockito.asm.ByteVector byteVector10 = byteVector8.putByte((int) (byte) 100);
        org.junit.Assert.assertNotNull(byteVector2);
        org.junit.Assert.assertNotNull(byteVector4);
        org.junit.Assert.assertNotNull(byteVector6);
        org.junit.Assert.assertNotNull(byteVector8);
        org.junit.Assert.assertNotNull(byteVector10);
    }

    @Test
    public void test1723() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1723");
        org.mockito.asm.ByteVector byteVector0 = new org.mockito.asm.ByteVector();
        org.mockito.asm.ByteVector byteVector2 = byteVector0.putUTF8("hi!");
        org.mockito.asm.ByteVector byteVector4 = byteVector2.putLong((long) (byte) 10);
        org.mockito.asm.ByteVector byteVector6 = byteVector4.putUTF8("hi!");
        org.mockito.asm.ByteVector byteVector8 = byteVector4.putLong((long) 10);
        org.mockito.asm.ByteVector byteVector10 = byteVector8.putLong(0L);
        org.mockito.asm.ByteVector byteVector12 = byteVector10.putShort((int) (byte) -1);
        org.mockito.asm.ByteVector byteVector14 = byteVector10.putInt((-1));
        org.mockito.asm.ByteVector byteVector16 = byteVector10.putByte((int) (byte) 100);
        org.mockito.asm.ByteVector byteVector18 = byteVector10.putUTF8("");
        org.mockito.asm.ByteVector byteVector20 = byteVector18.putByte(0);
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
    public void test1724() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1724");
        org.mockito.asm.ByteVector byteVector0 = new org.mockito.asm.ByteVector();
        org.mockito.asm.ByteVector byteVector2 = byteVector0.putUTF8("hi!");
        org.mockito.asm.ByteVector byteVector4 = byteVector0.putShort((int) (short) 100);
        org.mockito.asm.ByteVector byteVector6 = byteVector4.putUTF8("hi!");
        org.mockito.asm.ByteVector byteVector8 = byteVector6.putByte((int) '4');
        org.mockito.asm.ByteVector byteVector10 = byteVector6.putShort(1);
        org.mockito.asm.ByteVector byteVector12 = byteVector10.putInt(10);
        org.mockito.asm.ByteVector byteVector14 = byteVector10.putByte((int) (short) 1);
        org.junit.Assert.assertNotNull(byteVector2);
        org.junit.Assert.assertNotNull(byteVector4);
        org.junit.Assert.assertNotNull(byteVector6);
        org.junit.Assert.assertNotNull(byteVector8);
        org.junit.Assert.assertNotNull(byteVector10);
        org.junit.Assert.assertNotNull(byteVector12);
        org.junit.Assert.assertNotNull(byteVector14);
    }

    @Test
    public void test1725() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1725");
        org.mockito.asm.ByteVector byteVector1 = new org.mockito.asm.ByteVector((int) '4');
        org.mockito.asm.ByteVector byteVector3 = byteVector1.putByte((int) (short) 1);
        org.mockito.asm.ByteVector byteVector5 = byteVector1.putUTF8("");
        org.mockito.asm.ByteVector byteVector7 = byteVector1.putInt((int) '#');
        org.mockito.asm.ByteVector byteVector9 = byteVector1.putInt(10);
        org.mockito.asm.ByteVector byteVector11 = byteVector9.putShort(10);
        org.junit.Assert.assertNotNull(byteVector3);
        org.junit.Assert.assertNotNull(byteVector5);
        org.junit.Assert.assertNotNull(byteVector7);
        org.junit.Assert.assertNotNull(byteVector9);
        org.junit.Assert.assertNotNull(byteVector11);
    }

    @Test
    public void test1726() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1726");
        org.mockito.asm.ByteVector byteVector0 = new org.mockito.asm.ByteVector();
        org.mockito.asm.ByteVector byteVector2 = byteVector0.putUTF8("hi!");
        org.mockito.asm.ByteVector byteVector4 = byteVector0.putLong((long) ' ');
        org.mockito.asm.ByteVector byteVector6 = byteVector4.putByte((int) 'a');
        org.mockito.asm.ByteVector byteVector8 = byteVector4.putByte((int) (short) -1);
        org.mockito.asm.ByteVector byteVector10 = byteVector8.putByte((-1));
        org.mockito.asm.ByteVector byteVector12 = byteVector10.putShort((int) (short) -1);
        org.mockito.asm.ByteVector byteVector14 = byteVector12.putShort(100);
        org.mockito.asm.ByteVector byteVector16 = byteVector12.putInt((int) '#');
        org.mockito.asm.ByteVector byteVector18 = byteVector16.putShort((int) (byte) 0);
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
    public void test1727() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1727");
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
        org.mockito.asm.ByteVector byteVector70 = byteVector68.putShort(1);
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
    }

    @Test
    public void test1728() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1728");
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
        byte[] byteArray19 = null;
        org.mockito.asm.ByteVector byteVector22 = byteVector16.putByteArray(byteArray19, (int) (short) 10, (int) 'a');
        org.mockito.asm.ByteVector byteVector24 = byteVector16.putShort((int) (byte) 10);
        java.lang.Class<?> wildcardClass25 = byteVector24.getClass();
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
        org.junit.Assert.assertNotNull(wildcardClass25);
    }

    @Test
    public void test1729() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1729");
        org.mockito.asm.ByteVector byteVector0 = new org.mockito.asm.ByteVector();
        org.mockito.asm.ByteVector byteVector2 = byteVector0.putUTF8("hi!");
        org.mockito.asm.ByteVector byteVector4 = byteVector0.putShort((int) (short) -1);
        org.mockito.asm.ByteVector byteVector6 = byteVector0.putInt((int) (byte) 10);
        org.mockito.asm.ByteVector byteVector8 = byteVector6.putUTF8("hi!");
        org.mockito.asm.ByteVector byteVector10 = byteVector6.putLong((long) '#');
        org.mockito.asm.ByteVector byteVector12 = byteVector10.putShort(0);
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
    public void test1730() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1730");
        org.mockito.asm.ByteVector byteVector1 = new org.mockito.asm.ByteVector((int) (byte) 100);
        org.mockito.asm.ByteVector byteVector3 = byteVector1.putShort((int) (short) 100);
        org.mockito.asm.ByteVector byteVector5 = byteVector3.putShort((int) (byte) -1);
        org.mockito.asm.ByteVector byteVector7 = byteVector3.putLong((long) (short) 10);
        org.mockito.asm.ByteVector byteVector9 = byteVector3.putInt((int) (byte) 1);
        org.mockito.asm.ByteVector byteVector11 = byteVector9.putUTF8("hi!");
        org.junit.Assert.assertNotNull(byteVector3);
        org.junit.Assert.assertNotNull(byteVector5);
        org.junit.Assert.assertNotNull(byteVector7);
        org.junit.Assert.assertNotNull(byteVector9);
        org.junit.Assert.assertNotNull(byteVector11);
    }

    @Test
    public void test1731() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1731");
        org.mockito.asm.ByteVector byteVector1 = new org.mockito.asm.ByteVector((int) '#');
        org.mockito.asm.ByteVector byteVector3 = byteVector1.putInt(100);
        org.mockito.asm.ByteVector byteVector5 = byteVector3.putShort((int) (short) -1);
        org.mockito.asm.ByteVector byteVector7 = byteVector5.putShort((int) (short) 0);
        org.mockito.asm.ByteVector byteVector9 = byteVector5.putUTF8("");
        java.lang.Class<?> wildcardClass10 = byteVector9.getClass();
        org.junit.Assert.assertNotNull(byteVector3);
        org.junit.Assert.assertNotNull(byteVector5);
        org.junit.Assert.assertNotNull(byteVector7);
        org.junit.Assert.assertNotNull(byteVector9);
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test1732() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1732");
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
        java.lang.Class<?> wildcardClass19 = byteVector14.getClass();
        org.junit.Assert.assertNotNull(byteVector2);
        org.junit.Assert.assertNotNull(byteVector4);
        org.junit.Assert.assertNotNull(byteVector6);
        org.junit.Assert.assertNotNull(byteVector8);
        org.junit.Assert.assertNotNull(byteVector10);
        org.junit.Assert.assertNotNull(byteVector12);
        org.junit.Assert.assertNotNull(byteVector14);
        org.junit.Assert.assertNotNull(byteVector18);
        org.junit.Assert.assertNotNull(wildcardClass19);
    }

    @Test
    public void test1733() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1733");
        org.mockito.asm.ByteVector byteVector0 = new org.mockito.asm.ByteVector();
        org.mockito.asm.ByteVector byteVector2 = byteVector0.putUTF8("hi!");
        org.mockito.asm.ByteVector byteVector4 = byteVector0.putInt(0);
        org.mockito.asm.ByteVector byteVector6 = byteVector4.putInt((int) ' ');
        org.mockito.asm.ByteVector byteVector8 = byteVector6.putLong((long) (short) 10);
        org.mockito.asm.ByteVector byteVector10 = byteVector8.putLong((long) 'a');
        org.mockito.asm.ByteVector byteVector12 = byteVector10.putByte((int) '#');
        org.mockito.asm.ByteVector byteVector14 = byteVector12.putInt((int) ' ');
        org.mockito.asm.ByteVector byteVector16 = byteVector12.putUTF8("");
        org.mockito.asm.ByteVector byteVector18 = new org.mockito.asm.ByteVector((int) '#');
        org.mockito.asm.ByteVector byteVector20 = byteVector18.putUTF8("hi!");
        org.mockito.asm.ByteVector byteVector22 = byteVector18.putUTF8("");
        org.mockito.asm.ByteVector byteVector23 = new org.mockito.asm.ByteVector();
        org.mockito.asm.ByteVector byteVector25 = byteVector23.putUTF8("hi!");
        org.mockito.asm.ByteVector byteVector27 = byteVector25.putLong((long) (byte) 10);
        org.mockito.asm.ByteVector byteVector29 = byteVector27.putUTF8("hi!");
        org.mockito.asm.ByteVector byteVector31 = byteVector27.putLong((-1L));
        org.mockito.asm.ByteVector byteVector33 = byteVector31.putInt(10);
        org.mockito.asm.ByteVector byteVector35 = byteVector33.putShort((int) '#');
        org.mockito.asm.ByteVector byteVector37 = new org.mockito.asm.ByteVector((int) (short) 0);
        org.mockito.asm.ByteVector byteVector38 = new org.mockito.asm.ByteVector();
        org.mockito.asm.ByteVector byteVector40 = byteVector38.putUTF8("hi!");
        org.mockito.asm.ByteVector byteVector42 = byteVector38.putInt(0);
        org.mockito.asm.ByteVector byteVector44 = byteVector42.putInt((int) ' ');
        org.mockito.asm.ByteVector byteVector46 = byteVector44.putLong(100L);
        byte[] byteArray50 = new byte[] { (byte) 0, (byte) 10, (byte) 1 };
        org.mockito.asm.ByteVector byteVector53 = byteVector44.putByteArray(byteArray50, 0, 0);
        org.mockito.asm.ByteVector byteVector56 = byteVector37.putByteArray(byteArray50, 1, (int) (short) 0);
        org.mockito.asm.ByteVector byteVector59 = byteVector33.putByteArray(byteArray50, (int) (short) 0, 0);
        org.mockito.asm.ByteVector byteVector62 = byteVector18.putByteArray(byteArray50, (int) (short) 1, 1);
        // The following exception was thrown during execution in test generation
        try {
            org.mockito.asm.ByteVector byteVector65 = byteVector16.putByteArray(byteArray50, (int) 'a', (int) (byte) -1);
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
    }

    @Test
    public void test1734() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1734");
        org.mockito.asm.ByteVector byteVector1 = new org.mockito.asm.ByteVector((int) '4');
        org.mockito.asm.ByteVector byteVector3 = byteVector1.putByte((int) (short) 1);
        org.mockito.asm.ByteVector byteVector5 = byteVector1.putUTF8("");
        org.mockito.asm.ByteVector byteVector7 = byteVector5.putUTF8("hi!");
        org.junit.Assert.assertNotNull(byteVector3);
        org.junit.Assert.assertNotNull(byteVector5);
        org.junit.Assert.assertNotNull(byteVector7);
    }

    @Test
    public void test1735() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1735");
        org.mockito.asm.ByteVector byteVector0 = new org.mockito.asm.ByteVector();
        org.mockito.asm.ByteVector byteVector2 = byteVector0.putUTF8("hi!");
        org.mockito.asm.ByteVector byteVector4 = byteVector0.putLong((long) ' ');
        org.mockito.asm.ByteVector byteVector6 = byteVector4.putByte((int) 'a');
        org.mockito.asm.ByteVector byteVector8 = byteVector6.putByte((int) (short) -1);
        org.mockito.asm.ByteVector byteVector10 = byteVector8.putLong((long) (byte) -1);
        org.mockito.asm.ByteVector byteVector12 = byteVector8.putByte((int) '4');
        org.mockito.asm.ByteVector byteVector14 = byteVector12.putUTF8("");
        org.mockito.asm.ByteVector byteVector16 = byteVector14.putUTF8("");
        org.mockito.asm.ByteVector byteVector18 = byteVector16.putLong(0L);
        org.mockito.asm.ByteVector byteVector20 = byteVector18.putByte(0);
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
    public void test1736() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1736");
        org.mockito.asm.ByteVector byteVector0 = new org.mockito.asm.ByteVector();
        org.mockito.asm.ByteVector byteVector2 = byteVector0.putUTF8("hi!");
        org.mockito.asm.ByteVector byteVector4 = byteVector0.putLong((long) ' ');
        org.mockito.asm.ByteVector byteVector6 = byteVector4.putByte((int) 'a');
        org.mockito.asm.ByteVector byteVector8 = byteVector6.putInt((int) (short) 1);
        org.mockito.asm.ByteVector byteVector10 = byteVector6.putByte((int) (byte) -1);
        org.mockito.asm.ByteVector byteVector12 = byteVector6.putByte((int) (short) 100);
        org.mockito.asm.ByteVector byteVector14 = byteVector6.putInt((int) (short) 1);
        org.junit.Assert.assertNotNull(byteVector2);
        org.junit.Assert.assertNotNull(byteVector4);
        org.junit.Assert.assertNotNull(byteVector6);
        org.junit.Assert.assertNotNull(byteVector8);
        org.junit.Assert.assertNotNull(byteVector10);
        org.junit.Assert.assertNotNull(byteVector12);
        org.junit.Assert.assertNotNull(byteVector14);
    }

    @Test
    public void test1737() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1737");
        org.mockito.asm.ByteVector byteVector0 = new org.mockito.asm.ByteVector();
        org.mockito.asm.ByteVector byteVector2 = byteVector0.putUTF8("hi!");
        org.mockito.asm.ByteVector byteVector4 = byteVector2.putLong((long) (byte) 10);
        org.mockito.asm.ByteVector byteVector6 = byteVector2.putInt((int) (short) 1);
        org.mockito.asm.ByteVector byteVector8 = byteVector2.putShort((-1));
        org.mockito.asm.ByteVector byteVector10 = byteVector8.putUTF8("");
        org.mockito.asm.ByteVector byteVector12 = byteVector8.putLong(0L);
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
    public void test1738() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1738");
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
        org.mockito.asm.ByteVector byteVector22 = byteVector14.putInt((int) (byte) 100);
        org.mockito.asm.ByteVector byteVector24 = byteVector22.putInt((int) '4');
        org.mockito.asm.ByteVector byteVector26 = byteVector22.putUTF8("");
        org.mockito.asm.ByteVector byteVector28 = byteVector22.putByte(100);
        java.lang.Class<?> wildcardClass29 = byteVector22.getClass();
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
    public void test1739() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1739");
        org.mockito.asm.ByteVector byteVector1 = new org.mockito.asm.ByteVector((int) '#');
        org.mockito.asm.ByteVector byteVector3 = byteVector1.putUTF8("hi!");
        org.mockito.asm.ByteVector byteVector5 = byteVector1.putUTF8("");
        org.mockito.asm.ByteVector byteVector6 = new org.mockito.asm.ByteVector();
        org.mockito.asm.ByteVector byteVector8 = byteVector6.putUTF8("hi!");
        org.mockito.asm.ByteVector byteVector10 = byteVector8.putLong((long) (byte) 10);
        org.mockito.asm.ByteVector byteVector12 = byteVector10.putUTF8("hi!");
        org.mockito.asm.ByteVector byteVector14 = byteVector10.putLong((-1L));
        org.mockito.asm.ByteVector byteVector16 = byteVector14.putInt(10);
        org.mockito.asm.ByteVector byteVector18 = byteVector16.putShort((int) '#');
        org.mockito.asm.ByteVector byteVector20 = new org.mockito.asm.ByteVector((int) (short) 0);
        org.mockito.asm.ByteVector byteVector21 = new org.mockito.asm.ByteVector();
        org.mockito.asm.ByteVector byteVector23 = byteVector21.putUTF8("hi!");
        org.mockito.asm.ByteVector byteVector25 = byteVector21.putInt(0);
        org.mockito.asm.ByteVector byteVector27 = byteVector25.putInt((int) ' ');
        org.mockito.asm.ByteVector byteVector29 = byteVector27.putLong(100L);
        byte[] byteArray33 = new byte[] { (byte) 0, (byte) 10, (byte) 1 };
        org.mockito.asm.ByteVector byteVector36 = byteVector27.putByteArray(byteArray33, 0, 0);
        org.mockito.asm.ByteVector byteVector39 = byteVector20.putByteArray(byteArray33, 1, (int) (short) 0);
        org.mockito.asm.ByteVector byteVector42 = byteVector16.putByteArray(byteArray33, (int) (short) 0, 0);
        org.mockito.asm.ByteVector byteVector45 = byteVector1.putByteArray(byteArray33, (int) (short) 1, 1);
        org.mockito.asm.ByteVector byteVector47 = byteVector45.putInt((int) '4');
        org.junit.Assert.assertNotNull(byteVector3);
        org.junit.Assert.assertNotNull(byteVector5);
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
        org.junit.Assert.assertNotNull(byteVector42);
        org.junit.Assert.assertNotNull(byteVector45);
        org.junit.Assert.assertNotNull(byteVector47);
    }

    @Test
    public void test1740() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1740");
        org.mockito.asm.ByteVector byteVector1 = new org.mockito.asm.ByteVector((int) '4');
        org.mockito.asm.ByteVector byteVector3 = byteVector1.putByte((int) (short) 1);
        org.mockito.asm.ByteVector byteVector5 = byteVector1.putUTF8("");
        org.mockito.asm.ByteVector byteVector7 = byteVector1.putUTF8("");
        org.mockito.asm.ByteVector byteVector9 = byteVector7.putLong(1L);
        org.junit.Assert.assertNotNull(byteVector3);
        org.junit.Assert.assertNotNull(byteVector5);
        org.junit.Assert.assertNotNull(byteVector7);
        org.junit.Assert.assertNotNull(byteVector9);
    }

    @Test
    public void test1741() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1741");
        org.mockito.asm.ByteVector byteVector0 = new org.mockito.asm.ByteVector();
        org.mockito.asm.ByteVector byteVector2 = byteVector0.putUTF8("hi!");
        org.mockito.asm.ByteVector byteVector4 = byteVector0.putInt(0);
        org.mockito.asm.ByteVector byteVector6 = byteVector4.putInt((int) ' ');
        org.mockito.asm.ByteVector byteVector8 = byteVector6.putLong((long) (short) 10);
        org.mockito.asm.ByteVector byteVector10 = byteVector8.putUTF8("hi!");
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
    public void test1742() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1742");
        org.mockito.asm.ByteVector byteVector0 = new org.mockito.asm.ByteVector();
        org.mockito.asm.ByteVector byteVector2 = byteVector0.putUTF8("hi!");
        org.mockito.asm.ByteVector byteVector4 = byteVector2.putInt(0);
        org.mockito.asm.ByteVector byteVector6 = byteVector2.putByte((int) (byte) 10);
        org.mockito.asm.ByteVector byteVector8 = byteVector6.putLong(0L);
        org.mockito.asm.ByteVector byteVector10 = byteVector8.putShort((int) 'a');
        org.mockito.asm.ByteVector byteVector12 = byteVector10.putByte((int) '#');
        org.mockito.asm.ByteVector byteVector14 = new org.mockito.asm.ByteVector((int) '#');
        org.mockito.asm.ByteVector byteVector16 = byteVector14.putLong(100L);
        org.mockito.asm.ByteVector byteVector18 = byteVector16.putLong(1L);
        org.mockito.asm.ByteVector byteVector20 = byteVector18.putUTF8("hi!");
        org.mockito.asm.ByteVector byteVector22 = byteVector18.putUTF8("hi!");
        org.mockito.asm.ByteVector byteVector24 = byteVector22.putByte((int) (short) 0);
        org.mockito.asm.ByteVector byteVector26 = byteVector22.putInt(1);
        org.mockito.asm.ByteVector byteVector27 = new org.mockito.asm.ByteVector();
        org.mockito.asm.ByteVector byteVector29 = byteVector27.putUTF8("hi!");
        org.mockito.asm.ByteVector byteVector31 = byteVector29.putByte(100);
        org.mockito.asm.ByteVector byteVector33 = byteVector29.putShort((int) 'a');
        org.mockito.asm.ByteVector byteVector35 = byteVector33.putShort((int) (short) 0);
        org.mockito.asm.ByteVector byteVector36 = new org.mockito.asm.ByteVector();
        org.mockito.asm.ByteVector byteVector38 = byteVector36.putUTF8("hi!");
        org.mockito.asm.ByteVector byteVector40 = byteVector38.putInt(0);
        org.mockito.asm.ByteVector byteVector42 = byteVector38.putByte((int) (byte) 10);
        org.mockito.asm.ByteVector byteVector44 = byteVector42.putLong((-1L));
        org.mockito.asm.ByteVector byteVector46 = byteVector42.putInt((int) (byte) 100);
        org.mockito.asm.ByteVector byteVector47 = new org.mockito.asm.ByteVector();
        org.mockito.asm.ByteVector byteVector49 = byteVector47.putUTF8("hi!");
        org.mockito.asm.ByteVector byteVector51 = byteVector47.putInt(0);
        org.mockito.asm.ByteVector byteVector53 = byteVector51.putInt((int) ' ');
        org.mockito.asm.ByteVector byteVector55 = byteVector53.putLong(100L);
        byte[] byteArray59 = new byte[] { (byte) 0, (byte) 10, (byte) 1 };
        org.mockito.asm.ByteVector byteVector62 = byteVector53.putByteArray(byteArray59, 0, 0);
        org.mockito.asm.ByteVector byteVector65 = byteVector42.putByteArray(byteArray59, (int) (byte) 1, 0);
        org.mockito.asm.ByteVector byteVector68 = byteVector33.putByteArray(byteArray59, (int) (byte) 1, (int) (short) 1);
        org.mockito.asm.ByteVector byteVector71 = byteVector22.putByteArray(byteArray59, (int) (short) 0, (int) (byte) 0);
        // The following exception was thrown during execution in test generation
        try {
            org.mockito.asm.ByteVector byteVector74 = byteVector12.putByteArray(byteArray59, (int) (byte) 1, (int) ' ');
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
        org.junit.Assert.assertNotNull(byteVector24);
        org.junit.Assert.assertNotNull(byteVector26);
        org.junit.Assert.assertNotNull(byteVector29);
        org.junit.Assert.assertNotNull(byteVector31);
        org.junit.Assert.assertNotNull(byteVector33);
        org.junit.Assert.assertNotNull(byteVector35);
        org.junit.Assert.assertNotNull(byteVector38);
        org.junit.Assert.assertNotNull(byteVector40);
        org.junit.Assert.assertNotNull(byteVector42);
        org.junit.Assert.assertNotNull(byteVector44);
        org.junit.Assert.assertNotNull(byteVector46);
        org.junit.Assert.assertNotNull(byteVector49);
        org.junit.Assert.assertNotNull(byteVector51);
        org.junit.Assert.assertNotNull(byteVector53);
        org.junit.Assert.assertNotNull(byteVector55);
        org.junit.Assert.assertNotNull(byteArray59);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray59), "[0, 10, 1]");
        org.junit.Assert.assertNotNull(byteVector62);
        org.junit.Assert.assertNotNull(byteVector65);
        org.junit.Assert.assertNotNull(byteVector68);
        org.junit.Assert.assertNotNull(byteVector71);
    }

    @Test
    public void test1743() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1743");
        org.mockito.asm.ByteVector byteVector1 = new org.mockito.asm.ByteVector((int) (byte) 10);
        org.mockito.asm.ByteVector byteVector3 = byteVector1.putByte((int) '4');
        org.mockito.asm.ByteVector byteVector5 = byteVector1.putLong(0L);
        org.mockito.asm.ByteVector byteVector7 = byteVector5.putUTF8("");
        org.mockito.asm.ByteVector byteVector9 = byteVector7.putLong((long) (-1));
        org.mockito.asm.ByteVector byteVector11 = byteVector7.putInt((int) (short) 10);
        java.lang.Class<?> wildcardClass12 = byteVector11.getClass();
        org.junit.Assert.assertNotNull(byteVector3);
        org.junit.Assert.assertNotNull(byteVector5);
        org.junit.Assert.assertNotNull(byteVector7);
        org.junit.Assert.assertNotNull(byteVector9);
        org.junit.Assert.assertNotNull(byteVector11);
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test1744() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1744");
        org.mockito.asm.ByteVector byteVector0 = new org.mockito.asm.ByteVector();
        org.mockito.asm.ByteVector byteVector2 = byteVector0.putUTF8("hi!");
        org.mockito.asm.ByteVector byteVector4 = byteVector0.putInt(0);
        org.mockito.asm.ByteVector byteVector6 = byteVector4.putInt((int) ' ');
        org.mockito.asm.ByteVector byteVector8 = byteVector6.putLong((long) (short) 10);
        org.mockito.asm.ByteVector byteVector10 = byteVector8.putUTF8("hi!");
        org.mockito.asm.ByteVector byteVector12 = byteVector8.putUTF8("");
        org.mockito.asm.ByteVector byteVector14 = byteVector8.putShort((-1));
        org.mockito.asm.ByteVector byteVector16 = byteVector8.putInt((int) (short) 100);
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
    public void test1745() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1745");
        org.mockito.asm.ByteVector byteVector1 = new org.mockito.asm.ByteVector((int) '#');
        org.mockito.asm.ByteVector byteVector3 = byteVector1.putLong(100L);
        org.mockito.asm.ByteVector byteVector5 = byteVector1.putInt((int) ' ');
        org.mockito.asm.ByteVector byteVector7 = byteVector1.putInt((int) (short) 0);
        org.mockito.asm.ByteVector byteVector9 = byteVector1.putInt((int) (byte) 1);
        org.mockito.asm.ByteVector byteVector11 = byteVector1.putByte((int) '4');
        org.junit.Assert.assertNotNull(byteVector3);
        org.junit.Assert.assertNotNull(byteVector5);
        org.junit.Assert.assertNotNull(byteVector7);
        org.junit.Assert.assertNotNull(byteVector9);
        org.junit.Assert.assertNotNull(byteVector11);
    }

    @Test
    public void test1746() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1746");
        org.mockito.asm.ByteVector byteVector0 = new org.mockito.asm.ByteVector();
        org.mockito.asm.ByteVector byteVector2 = byteVector0.putUTF8("hi!");
        org.mockito.asm.ByteVector byteVector4 = byteVector2.putLong((long) (byte) 10);
        org.mockito.asm.ByteVector byteVector6 = byteVector4.putUTF8("hi!");
        org.mockito.asm.ByteVector byteVector8 = byteVector4.putLong((long) 10);
        org.mockito.asm.ByteVector byteVector10 = byteVector8.putLong(0L);
        org.mockito.asm.ByteVector byteVector12 = byteVector10.putUTF8("");
        org.mockito.asm.ByteVector byteVector14 = byteVector12.putLong((long) ' ');
        org.junit.Assert.assertNotNull(byteVector2);
        org.junit.Assert.assertNotNull(byteVector4);
        org.junit.Assert.assertNotNull(byteVector6);
        org.junit.Assert.assertNotNull(byteVector8);
        org.junit.Assert.assertNotNull(byteVector10);
        org.junit.Assert.assertNotNull(byteVector12);
        org.junit.Assert.assertNotNull(byteVector14);
    }

    @Test
    public void test1747() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1747");
        org.mockito.asm.ByteVector byteVector0 = new org.mockito.asm.ByteVector();
        org.mockito.asm.ByteVector byteVector2 = byteVector0.putUTF8("hi!");
        org.mockito.asm.ByteVector byteVector4 = byteVector2.putInt(0);
        org.mockito.asm.ByteVector byteVector6 = byteVector2.putByte((int) (byte) 10);
        org.mockito.asm.ByteVector byteVector8 = byteVector6.putLong(0L);
        org.mockito.asm.ByteVector byteVector10 = byteVector8.putByte((int) (byte) -1);
        org.junit.Assert.assertNotNull(byteVector2);
        org.junit.Assert.assertNotNull(byteVector4);
        org.junit.Assert.assertNotNull(byteVector6);
        org.junit.Assert.assertNotNull(byteVector8);
        org.junit.Assert.assertNotNull(byteVector10);
    }

    @Test
    public void test1748() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1748");
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
        org.mockito.asm.ByteVector byteVector22 = byteVector14.putShort((int) (byte) 100);
        org.mockito.asm.ByteVector byteVector24 = byteVector22.putLong((long) (byte) 100);
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
    public void test1749() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1749");
        org.mockito.asm.ByteVector byteVector0 = new org.mockito.asm.ByteVector();
        org.mockito.asm.ByteVector byteVector2 = byteVector0.putUTF8("hi!");
        org.mockito.asm.ByteVector byteVector4 = byteVector0.putLong((long) ' ');
        org.mockito.asm.ByteVector byteVector6 = byteVector4.putByte((int) 'a');
        org.mockito.asm.ByteVector byteVector8 = byteVector6.putInt((int) (short) 0);
        org.mockito.asm.ByteVector byteVector10 = byteVector8.putUTF8("");
        org.mockito.asm.ByteVector byteVector12 = byteVector8.putUTF8("hi!");
        org.mockito.asm.ByteVector byteVector14 = new org.mockito.asm.ByteVector((int) (byte) 1);
        org.mockito.asm.ByteVector byteVector16 = byteVector14.putByte((int) (byte) 10);
        org.mockito.asm.ByteVector byteVector18 = byteVector16.putShort((int) (short) 10);
        org.mockito.asm.ByteVector byteVector20 = byteVector18.putShort((int) (byte) 1);
        org.mockito.asm.ByteVector byteVector22 = byteVector20.putInt((int) (byte) -1);
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
        org.mockito.asm.ByteVector byteVector96 = byteVector20.putByteArray(byteArray84, 0, (int) (byte) 1);
        // The following exception was thrown during execution in test generation
        try {
            org.mockito.asm.ByteVector byteVector99 = byteVector8.putByteArray(byteArray84, (int) (byte) 100, 0);
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
    }

    @Test
    public void test1750() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1750");
        org.mockito.asm.ByteVector byteVector0 = new org.mockito.asm.ByteVector();
        org.mockito.asm.ByteVector byteVector2 = byteVector0.putInt((int) (byte) 10);
        org.mockito.asm.ByteVector byteVector4 = byteVector2.putByte(0);
        org.mockito.asm.ByteVector byteVector6 = byteVector4.putShort((int) (short) 0);
        org.junit.Assert.assertNotNull(byteVector2);
        org.junit.Assert.assertNotNull(byteVector4);
        org.junit.Assert.assertNotNull(byteVector6);
    }

    @Test
    public void test1751() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1751");
        org.mockito.asm.ByteVector byteVector0 = new org.mockito.asm.ByteVector();
        org.mockito.asm.ByteVector byteVector2 = byteVector0.putUTF8("hi!");
        org.mockito.asm.ByteVector byteVector4 = byteVector0.putByte((int) (byte) 1);
        org.mockito.asm.ByteVector byteVector6 = byteVector4.putShort((int) (short) 1);
        org.mockito.asm.ByteVector byteVector8 = byteVector6.putByte((int) 'a');
        org.mockito.asm.ByteVector byteVector10 = byteVector6.putUTF8("");
        org.junit.Assert.assertNotNull(byteVector2);
        org.junit.Assert.assertNotNull(byteVector4);
        org.junit.Assert.assertNotNull(byteVector6);
        org.junit.Assert.assertNotNull(byteVector8);
        org.junit.Assert.assertNotNull(byteVector10);
    }

    @Test
    public void test1752() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1752");
        org.mockito.asm.ByteVector byteVector1 = new org.mockito.asm.ByteVector((int) '#');
        org.mockito.asm.ByteVector byteVector3 = byteVector1.putInt(100);
        org.mockito.asm.ByteVector byteVector5 = byteVector1.putInt(0);
        org.mockito.asm.ByteVector byteVector7 = byteVector5.putShort((int) (short) 10);
        org.mockito.asm.ByteVector byteVector8 = new org.mockito.asm.ByteVector();
        org.mockito.asm.ByteVector byteVector10 = byteVector8.putUTF8("hi!");
        org.mockito.asm.ByteVector byteVector12 = byteVector8.putShort((int) (short) -1);
        org.mockito.asm.ByteVector byteVector14 = byteVector8.putInt((int) (byte) 10);
        org.mockito.asm.ByteVector byteVector16 = byteVector14.putUTF8("hi!");
        org.mockito.asm.ByteVector byteVector18 = byteVector16.putByte((int) (byte) 1);
        org.mockito.asm.ByteVector byteVector20 = byteVector16.putInt((int) (byte) -1);
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
        org.mockito.asm.ByteVector byteVector77 = byteVector16.putByteArray(byteArray65, 1, (int) (byte) 1);
        // The following exception was thrown during execution in test generation
        try {
            org.mockito.asm.ByteVector byteVector80 = byteVector5.putByteArray(byteArray65, (int) (short) 10, (int) (byte) 1);
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
        org.junit.Assert.assertNotNull(byteVector77);
    }

    @Test
    public void test1753() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1753");
        org.mockito.asm.ByteVector byteVector0 = new org.mockito.asm.ByteVector();
        org.mockito.asm.ByteVector byteVector2 = byteVector0.putUTF8("hi!");
        org.mockito.asm.ByteVector byteVector4 = byteVector0.putInt(0);
        org.mockito.asm.ByteVector byteVector6 = byteVector0.putInt(1);
        org.mockito.asm.ByteVector byteVector8 = byteVector0.putUTF8("");
        org.mockito.asm.ByteVector byteVector10 = byteVector8.putLong(10L);
        org.mockito.asm.ByteVector byteVector12 = byteVector8.putShort((int) (byte) 100);
        org.mockito.asm.ByteVector byteVector14 = byteVector8.putShort((int) (short) 1);
        org.mockito.asm.ByteVector byteVector16 = byteVector8.putUTF8("hi!");
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
    public void test1754() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1754");
        org.mockito.asm.ByteVector byteVector1 = new org.mockito.asm.ByteVector((int) '#');
        org.mockito.asm.ByteVector byteVector3 = byteVector1.putLong(100L);
        org.mockito.asm.ByteVector byteVector5 = byteVector3.putUTF8("");
        org.mockito.asm.ByteVector byteVector7 = byteVector3.putLong((-1L));
        org.mockito.asm.ByteVector byteVector9 = byteVector3.putInt((int) '#');
        org.mockito.asm.ByteVector byteVector11 = byteVector3.putByte((int) '#');
        org.mockito.asm.ByteVector byteVector13 = byteVector3.putShort((int) (byte) -1);
        org.mockito.asm.ByteVector byteVector15 = byteVector3.putByte((int) '#');
        org.junit.Assert.assertNotNull(byteVector3);
        org.junit.Assert.assertNotNull(byteVector5);
        org.junit.Assert.assertNotNull(byteVector7);
        org.junit.Assert.assertNotNull(byteVector9);
        org.junit.Assert.assertNotNull(byteVector11);
        org.junit.Assert.assertNotNull(byteVector13);
        org.junit.Assert.assertNotNull(byteVector15);
    }

    @Test
    public void test1755() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1755");
        org.mockito.asm.ByteVector byteVector0 = new org.mockito.asm.ByteVector();
        org.mockito.asm.ByteVector byteVector2 = byteVector0.putUTF8("hi!");
        org.mockito.asm.ByteVector byteVector4 = byteVector0.putLong((long) ' ');
        org.mockito.asm.ByteVector byteVector6 = byteVector4.putByte((int) 'a');
        org.mockito.asm.ByteVector byteVector8 = byteVector6.putInt((int) (short) 1);
        org.mockito.asm.ByteVector byteVector10 = byteVector8.putShort((int) (byte) 100);
        org.mockito.asm.ByteVector byteVector12 = byteVector10.putUTF8("hi!");
        org.mockito.asm.ByteVector byteVector14 = byteVector10.putByte((int) (byte) -1);
        org.junit.Assert.assertNotNull(byteVector2);
        org.junit.Assert.assertNotNull(byteVector4);
        org.junit.Assert.assertNotNull(byteVector6);
        org.junit.Assert.assertNotNull(byteVector8);
        org.junit.Assert.assertNotNull(byteVector10);
        org.junit.Assert.assertNotNull(byteVector12);
        org.junit.Assert.assertNotNull(byteVector14);
    }

    @Test
    public void test1756() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1756");
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
    public void test1757() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1757");
        org.mockito.asm.ByteVector byteVector0 = new org.mockito.asm.ByteVector();
        org.mockito.asm.ByteVector byteVector2 = byteVector0.putUTF8("hi!");
        org.mockito.asm.ByteVector byteVector4 = byteVector0.putLong((long) (short) 1);
        org.mockito.asm.ByteVector byteVector6 = byteVector4.putShort((int) (byte) -1);
        org.mockito.asm.ByteVector byteVector8 = byteVector4.putUTF8("hi!");
        org.mockito.asm.ByteVector byteVector10 = byteVector4.putShort((int) (byte) 1);
        org.junit.Assert.assertNotNull(byteVector2);
        org.junit.Assert.assertNotNull(byteVector4);
        org.junit.Assert.assertNotNull(byteVector6);
        org.junit.Assert.assertNotNull(byteVector8);
        org.junit.Assert.assertNotNull(byteVector10);
    }

    @Test
    public void test1758() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1758");
        org.mockito.asm.ByteVector byteVector0 = new org.mockito.asm.ByteVector();
        org.mockito.asm.ByteVector byteVector2 = byteVector0.putUTF8("hi!");
        org.mockito.asm.ByteVector byteVector4 = byteVector2.putInt((int) (byte) 10);
        org.mockito.asm.ByteVector byteVector6 = byteVector4.putUTF8("");
        org.mockito.asm.ByteVector byteVector8 = byteVector6.putUTF8("hi!");
        org.mockito.asm.ByteVector byteVector10 = byteVector6.putInt((int) '#');
        org.mockito.asm.ByteVector byteVector12 = byteVector10.putInt((int) (byte) 100);
        org.mockito.asm.ByteVector byteVector14 = byteVector12.putShort((int) (short) 0);
        org.junit.Assert.assertNotNull(byteVector2);
        org.junit.Assert.assertNotNull(byteVector4);
        org.junit.Assert.assertNotNull(byteVector6);
        org.junit.Assert.assertNotNull(byteVector8);
        org.junit.Assert.assertNotNull(byteVector10);
        org.junit.Assert.assertNotNull(byteVector12);
        org.junit.Assert.assertNotNull(byteVector14);
    }

    @Test
    public void test1759() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1759");
        org.mockito.asm.ByteVector byteVector0 = new org.mockito.asm.ByteVector();
        org.mockito.asm.ByteVector byteVector2 = byteVector0.putUTF8("hi!");
        org.mockito.asm.ByteVector byteVector4 = byteVector2.putLong((long) (byte) 10);
        org.mockito.asm.ByteVector byteVector6 = byteVector4.putInt((int) 'a');
        org.mockito.asm.ByteVector byteVector8 = byteVector6.putShort((int) (byte) 0);
        org.mockito.asm.ByteVector byteVector10 = byteVector8.putUTF8("");
        org.mockito.asm.ByteVector byteVector12 = byteVector8.putUTF8("");
        org.mockito.asm.ByteVector byteVector14 = byteVector8.putByte(0);
        org.junit.Assert.assertNotNull(byteVector2);
        org.junit.Assert.assertNotNull(byteVector4);
        org.junit.Assert.assertNotNull(byteVector6);
        org.junit.Assert.assertNotNull(byteVector8);
        org.junit.Assert.assertNotNull(byteVector10);
        org.junit.Assert.assertNotNull(byteVector12);
        org.junit.Assert.assertNotNull(byteVector14);
    }

    @Test
    public void test1760() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1760");
        org.mockito.asm.ByteVector byteVector0 = new org.mockito.asm.ByteVector();
        org.mockito.asm.ByteVector byteVector2 = byteVector0.putUTF8("hi!");
        org.mockito.asm.ByteVector byteVector4 = byteVector2.putLong((long) (byte) 10);
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
    public void test1761() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1761");
        org.mockito.asm.ByteVector byteVector0 = new org.mockito.asm.ByteVector();
        org.mockito.asm.ByteVector byteVector2 = byteVector0.putUTF8("hi!");
        org.mockito.asm.ByteVector byteVector4 = byteVector2.putLong((long) (byte) 10);
        org.mockito.asm.ByteVector byteVector6 = byteVector4.putInt((int) 'a');
        org.mockito.asm.ByteVector byteVector8 = byteVector4.putInt((int) (short) -1);
        org.junit.Assert.assertNotNull(byteVector2);
        org.junit.Assert.assertNotNull(byteVector4);
        org.junit.Assert.assertNotNull(byteVector6);
        org.junit.Assert.assertNotNull(byteVector8);
    }

    @Test
    public void test1762() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1762");
        org.mockito.asm.ByteVector byteVector0 = new org.mockito.asm.ByteVector();
        org.mockito.asm.ByteVector byteVector2 = byteVector0.putUTF8("hi!");
        org.mockito.asm.ByteVector byteVector4 = byteVector2.putLong((long) (byte) 10);
        org.mockito.asm.ByteVector byteVector6 = byteVector4.putUTF8("hi!");
        org.mockito.asm.ByteVector byteVector8 = byteVector4.putLong((long) 10);
        org.mockito.asm.ByteVector byteVector10 = byteVector8.putInt((int) (short) 0);
        org.mockito.asm.ByteVector byteVector12 = byteVector10.putLong((long) 'a');
        org.mockito.asm.ByteVector byteVector14 = byteVector12.putShort((-1));
        org.junit.Assert.assertNotNull(byteVector2);
        org.junit.Assert.assertNotNull(byteVector4);
        org.junit.Assert.assertNotNull(byteVector6);
        org.junit.Assert.assertNotNull(byteVector8);
        org.junit.Assert.assertNotNull(byteVector10);
        org.junit.Assert.assertNotNull(byteVector12);
        org.junit.Assert.assertNotNull(byteVector14);
    }

    @Test
    public void test1763() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1763");
        org.mockito.asm.ByteVector byteVector1 = new org.mockito.asm.ByteVector((int) '#');
        org.mockito.asm.ByteVector byteVector3 = byteVector1.putLong(100L);
        org.mockito.asm.ByteVector byteVector5 = byteVector3.putLong(1L);
        org.mockito.asm.ByteVector byteVector7 = byteVector5.putUTF8("hi!");
        org.mockito.asm.ByteVector byteVector9 = byteVector7.putUTF8("");
        org.mockito.asm.ByteVector byteVector11 = byteVector9.putShort((int) (byte) -1);
        org.mockito.asm.ByteVector byteVector13 = byteVector9.putShort(0);
        org.mockito.asm.ByteVector byteVector15 = byteVector9.putUTF8("");
        org.mockito.asm.ByteVector byteVector17 = byteVector9.putInt((int) (short) 1);
        org.mockito.asm.ByteVector byteVector19 = byteVector17.putLong((-1L));
        java.lang.Class<?> wildcardClass20 = byteVector19.getClass();
        org.junit.Assert.assertNotNull(byteVector3);
        org.junit.Assert.assertNotNull(byteVector5);
        org.junit.Assert.assertNotNull(byteVector7);
        org.junit.Assert.assertNotNull(byteVector9);
        org.junit.Assert.assertNotNull(byteVector11);
        org.junit.Assert.assertNotNull(byteVector13);
        org.junit.Assert.assertNotNull(byteVector15);
        org.junit.Assert.assertNotNull(byteVector17);
        org.junit.Assert.assertNotNull(byteVector19);
        org.junit.Assert.assertNotNull(wildcardClass20);
    }

    @Test
    public void test1764() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1764");
        org.mockito.asm.ByteVector byteVector0 = new org.mockito.asm.ByteVector();
        org.mockito.asm.ByteVector byteVector2 = byteVector0.putUTF8("hi!");
        org.mockito.asm.ByteVector byteVector4 = byteVector0.putLong((long) ' ');
        org.mockito.asm.ByteVector byteVector6 = byteVector4.putInt((int) (short) 100);
        org.mockito.asm.ByteVector byteVector8 = byteVector6.putShort((int) (byte) 1);
        org.mockito.asm.ByteVector byteVector10 = byteVector8.putShort((-1));
        org.mockito.asm.ByteVector byteVector12 = byteVector10.putShort((int) '#');
        org.mockito.asm.ByteVector byteVector14 = byteVector10.putShort((int) '#');
        org.mockito.asm.ByteVector byteVector16 = byteVector10.putInt((int) '#');
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
    public void test1765() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1765");
        org.mockito.asm.ByteVector byteVector0 = new org.mockito.asm.ByteVector();
        org.mockito.asm.ByteVector byteVector2 = byteVector0.putUTF8("hi!");
        org.mockito.asm.ByteVector byteVector4 = byteVector2.putByte(100);
        org.mockito.asm.ByteVector byteVector6 = byteVector2.putShort((int) 'a');
        org.mockito.asm.ByteVector byteVector8 = byteVector6.putByte((int) (short) 1);
        org.mockito.asm.ByteVector byteVector10 = byteVector8.putLong((long) 0);
        org.mockito.asm.ByteVector byteVector12 = byteVector10.putLong((long) (byte) -1);
        org.mockito.asm.ByteVector byteVector14 = byteVector10.putByte((int) 'a');
        org.mockito.asm.ByteVector byteVector16 = byteVector14.putByte((int) 'a');
        org.mockito.asm.ByteVector byteVector18 = byteVector14.putByte((int) '4');
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
    public void test1766() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1766");
        org.mockito.asm.ByteVector byteVector0 = new org.mockito.asm.ByteVector();
        org.mockito.asm.ByteVector byteVector2 = byteVector0.putUTF8("hi!");
        org.mockito.asm.ByteVector byteVector4 = byteVector2.putInt(0);
        org.mockito.asm.ByteVector byteVector6 = byteVector4.putShort(1);
        org.mockito.asm.ByteVector byteVector8 = byteVector6.putByte((int) (byte) 1);
        org.mockito.asm.ByteVector byteVector10 = byteVector6.putLong((long) 10);
        org.mockito.asm.ByteVector byteVector12 = byteVector6.putShort((int) (byte) 10);
        org.junit.Assert.assertNotNull(byteVector2);
        org.junit.Assert.assertNotNull(byteVector4);
        org.junit.Assert.assertNotNull(byteVector6);
        org.junit.Assert.assertNotNull(byteVector8);
        org.junit.Assert.assertNotNull(byteVector10);
        org.junit.Assert.assertNotNull(byteVector12);
    }

    @Test
    public void test1767() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1767");
        org.mockito.asm.ByteVector byteVector0 = new org.mockito.asm.ByteVector();
        org.mockito.asm.ByteVector byteVector2 = byteVector0.putUTF8("hi!");
        org.mockito.asm.ByteVector byteVector4 = byteVector2.putLong((long) (byte) 10);
        org.mockito.asm.ByteVector byteVector6 = byteVector4.putUTF8("hi!");
        org.mockito.asm.ByteVector byteVector8 = byteVector4.putLong((long) 10);
        org.mockito.asm.ByteVector byteVector10 = byteVector8.putLong(0L);
        org.mockito.asm.ByteVector byteVector12 = byteVector10.putShort((int) (byte) -1);
        org.mockito.asm.ByteVector byteVector14 = byteVector10.putInt((-1));
        org.mockito.asm.ByteVector byteVector16 = byteVector10.putByte((int) (byte) 100);
        org.mockito.asm.ByteVector byteVector18 = new org.mockito.asm.ByteVector((int) '#');
        org.mockito.asm.ByteVector byteVector20 = byteVector18.putInt(100);
        org.mockito.asm.ByteVector byteVector22 = byteVector18.putUTF8("");
        org.mockito.asm.ByteVector byteVector23 = new org.mockito.asm.ByteVector();
        org.mockito.asm.ByteVector byteVector25 = byteVector23.putUTF8("hi!");
        org.mockito.asm.ByteVector byteVector27 = byteVector25.putInt(0);
        org.mockito.asm.ByteVector byteVector29 = byteVector27.putByte((int) (short) 0);
        org.mockito.asm.ByteVector byteVector31 = byteVector27.putUTF8("");
        org.mockito.asm.ByteVector byteVector32 = new org.mockito.asm.ByteVector();
        org.mockito.asm.ByteVector byteVector34 = byteVector32.putUTF8("hi!");
        org.mockito.asm.ByteVector byteVector36 = byteVector32.putInt(0);
        org.mockito.asm.ByteVector byteVector38 = byteVector32.putShort((int) '4');
        org.mockito.asm.ByteVector byteVector40 = byteVector32.putByte(100);
        org.mockito.asm.ByteVector byteVector42 = byteVector40.putInt((int) (byte) 10);
        org.mockito.asm.ByteVector byteVector44 = byteVector40.putInt((int) (byte) 10);
        org.mockito.asm.ByteVector byteVector46 = byteVector44.putByte(100);
        org.mockito.asm.ByteVector byteVector47 = new org.mockito.asm.ByteVector();
        org.mockito.asm.ByteVector byteVector49 = byteVector47.putUTF8("hi!");
        org.mockito.asm.ByteVector byteVector51 = byteVector47.putInt(0);
        org.mockito.asm.ByteVector byteVector53 = byteVector51.putInt((int) ' ');
        org.mockito.asm.ByteVector byteVector55 = byteVector53.putLong(100L);
        byte[] byteArray59 = new byte[] { (byte) 0, (byte) 10, (byte) 1 };
        org.mockito.asm.ByteVector byteVector62 = byteVector53.putByteArray(byteArray59, 0, 0);
        org.mockito.asm.ByteVector byteVector65 = byteVector46.putByteArray(byteArray59, (int) (byte) 1, (int) (byte) 0);
        org.mockito.asm.ByteVector byteVector68 = byteVector27.putByteArray(byteArray59, (int) (short) 0, 0);
        org.mockito.asm.ByteVector byteVector71 = byteVector22.putByteArray(byteArray59, (int) (byte) 0, (int) (short) 1);
        org.mockito.asm.ByteVector byteVector74 = byteVector10.putByteArray(byteArray59, (int) (byte) 1, (int) (byte) 0);
        org.mockito.asm.ByteVector byteVector76 = byteVector10.putUTF8("hi!");
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
        org.junit.Assert.assertNotNull(byteArray59);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray59), "[0, 10, 1]");
        org.junit.Assert.assertNotNull(byteVector62);
        org.junit.Assert.assertNotNull(byteVector65);
        org.junit.Assert.assertNotNull(byteVector68);
        org.junit.Assert.assertNotNull(byteVector71);
        org.junit.Assert.assertNotNull(byteVector74);
        org.junit.Assert.assertNotNull(byteVector76);
    }

    @Test
    public void test1768() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1768");
        org.mockito.asm.ByteVector byteVector0 = new org.mockito.asm.ByteVector();
        org.mockito.asm.ByteVector byteVector2 = byteVector0.putUTF8("hi!");
        org.mockito.asm.ByteVector byteVector4 = byteVector0.putInt(0);
        org.mockito.asm.ByteVector byteVector6 = byteVector4.putInt((int) ' ');
        org.mockito.asm.ByteVector byteVector8 = byteVector6.putLong((long) (short) 10);
        org.mockito.asm.ByteVector byteVector10 = byteVector6.putInt((int) '4');
        org.mockito.asm.ByteVector byteVector12 = byteVector10.putUTF8("hi!");
        org.mockito.asm.ByteVector byteVector14 = byteVector10.putLong((long) 10);
        org.junit.Assert.assertNotNull(byteVector2);
        org.junit.Assert.assertNotNull(byteVector4);
        org.junit.Assert.assertNotNull(byteVector6);
        org.junit.Assert.assertNotNull(byteVector8);
        org.junit.Assert.assertNotNull(byteVector10);
        org.junit.Assert.assertNotNull(byteVector12);
        org.junit.Assert.assertNotNull(byteVector14);
    }

    @Test
    public void test1769() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1769");
        org.mockito.asm.ByteVector byteVector0 = new org.mockito.asm.ByteVector();
        org.mockito.asm.ByteVector byteVector2 = byteVector0.putUTF8("hi!");
        org.mockito.asm.ByteVector byteVector4 = byteVector0.putLong((long) ' ');
        org.mockito.asm.ByteVector byteVector6 = byteVector4.putByte((int) 'a');
        org.mockito.asm.ByteVector byteVector8 = byteVector4.putByte((int) (short) -1);
        org.mockito.asm.ByteVector byteVector10 = byteVector4.putLong(0L);
        org.mockito.asm.ByteVector byteVector12 = byteVector10.putByte(0);
        org.mockito.asm.ByteVector byteVector14 = byteVector12.putLong(1L);
        org.mockito.asm.ByteVector byteVector16 = byteVector14.putUTF8("");
        org.mockito.asm.ByteVector byteVector18 = byteVector14.putInt((int) (short) 10);
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
    public void test1770() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1770");
        org.mockito.asm.ByteVector byteVector0 = new org.mockito.asm.ByteVector();
        org.mockito.asm.ByteVector byteVector2 = byteVector0.putUTF8("hi!");
        org.mockito.asm.ByteVector byteVector4 = byteVector0.putInt(0);
        org.mockito.asm.ByteVector byteVector6 = byteVector0.putShort(10);
        org.mockito.asm.ByteVector byteVector8 = byteVector6.putLong((long) '4');
        org.mockito.asm.ByteVector byteVector10 = byteVector6.putShort((int) ' ');
        org.mockito.asm.ByteVector byteVector12 = byteVector6.putInt((int) (byte) -1);
        org.mockito.asm.ByteVector byteVector14 = byteVector6.putShort((int) (byte) -1);
        org.mockito.asm.ByteVector byteVector16 = byteVector14.putInt((int) (byte) 0);
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
    public void test1771() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1771");
        org.mockito.asm.ByteVector byteVector0 = new org.mockito.asm.ByteVector();
        org.mockito.asm.ByteVector byteVector2 = byteVector0.putUTF8("hi!");
        org.mockito.asm.ByteVector byteVector4 = byteVector0.putShort((int) (short) 100);
        org.mockito.asm.ByteVector byteVector6 = byteVector4.putLong((long) (byte) -1);
        org.mockito.asm.ByteVector byteVector8 = byteVector4.putInt((int) ' ');
        org.junit.Assert.assertNotNull(byteVector2);
        org.junit.Assert.assertNotNull(byteVector4);
        org.junit.Assert.assertNotNull(byteVector6);
        org.junit.Assert.assertNotNull(byteVector8);
    }

    @Test
    public void test1772() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1772");
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
        org.mockito.asm.ByteVector byteVector39 = byteVector18.putInt((int) (short) 1);
        org.mockito.asm.ByteVector byteVector41 = byteVector18.putInt(10);
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
        org.junit.Assert.assertNotNull(byteVector39);
        org.junit.Assert.assertNotNull(byteVector41);
    }

    @Test
    public void test1773() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1773");
        org.mockito.asm.ByteVector byteVector1 = new org.mockito.asm.ByteVector((int) '#');
        org.mockito.asm.ByteVector byteVector3 = byteVector1.putInt(100);
        org.mockito.asm.ByteVector byteVector5 = byteVector1.putInt(0);
        org.mockito.asm.ByteVector byteVector7 = byteVector5.putShort((int) (short) 10);
        org.mockito.asm.ByteVector byteVector9 = byteVector7.putByte((int) (short) 1);
        org.junit.Assert.assertNotNull(byteVector3);
        org.junit.Assert.assertNotNull(byteVector5);
        org.junit.Assert.assertNotNull(byteVector7);
        org.junit.Assert.assertNotNull(byteVector9);
    }

    @Test
    public void test1774() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1774");
        org.mockito.asm.ByteVector byteVector0 = new org.mockito.asm.ByteVector();
        org.mockito.asm.ByteVector byteVector2 = byteVector0.putUTF8("hi!");
        org.mockito.asm.ByteVector byteVector4 = byteVector0.putShort((int) (short) -1);
        org.mockito.asm.ByteVector byteVector6 = byteVector0.putInt((int) (byte) 10);
        org.mockito.asm.ByteVector byteVector8 = byteVector6.putInt((int) (short) 100);
        org.mockito.asm.ByteVector byteVector10 = byteVector8.putByte(100);
        org.junit.Assert.assertNotNull(byteVector2);
        org.junit.Assert.assertNotNull(byteVector4);
        org.junit.Assert.assertNotNull(byteVector6);
        org.junit.Assert.assertNotNull(byteVector8);
        org.junit.Assert.assertNotNull(byteVector10);
    }

    @Test
    public void test1775() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1775");
        org.mockito.asm.ByteVector byteVector0 = new org.mockito.asm.ByteVector();
        org.mockito.asm.ByteVector byteVector2 = byteVector0.putUTF8("hi!");
        org.mockito.asm.ByteVector byteVector4 = byteVector2.putInt((int) (byte) 10);
        org.mockito.asm.ByteVector byteVector6 = byteVector4.putUTF8("");
        org.mockito.asm.ByteVector byteVector8 = byteVector6.putUTF8("hi!");
        org.mockito.asm.ByteVector byteVector10 = byteVector6.putInt((int) (byte) 1);
        org.mockito.asm.ByteVector byteVector12 = byteVector10.putLong((long) 1);
        org.mockito.asm.ByteVector byteVector14 = byteVector12.putUTF8("");
        org.mockito.asm.ByteVector byteVector16 = byteVector14.putShort((int) (byte) 1);
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
    public void test1776() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1776");
        org.mockito.asm.ByteVector byteVector1 = new org.mockito.asm.ByteVector((int) ' ');
        org.mockito.asm.ByteVector byteVector3 = byteVector1.putInt((int) '4');
        org.mockito.asm.ByteVector byteVector4 = new org.mockito.asm.ByteVector();
        org.mockito.asm.ByteVector byteVector6 = byteVector4.putUTF8("hi!");
        org.mockito.asm.ByteVector byteVector8 = byteVector6.putInt((int) (byte) 10);
        org.mockito.asm.ByteVector byteVector10 = byteVector8.putUTF8("");
        org.mockito.asm.ByteVector byteVector12 = byteVector10.putUTF8("hi!");
        org.mockito.asm.ByteVector byteVector14 = byteVector10.putInt((int) (byte) 1);
        org.mockito.asm.ByteVector byteVector16 = byteVector10.putShort((int) (byte) -1);
        org.mockito.asm.ByteVector byteVector17 = new org.mockito.asm.ByteVector();
        org.mockito.asm.ByteVector byteVector19 = byteVector17.putUTF8("hi!");
        org.mockito.asm.ByteVector byteVector21 = byteVector19.putLong((long) (byte) 10);
        org.mockito.asm.ByteVector byteVector23 = byteVector21.putUTF8("hi!");
        org.mockito.asm.ByteVector byteVector25 = byteVector21.putLong((-1L));
        org.mockito.asm.ByteVector byteVector27 = byteVector25.putInt(10);
        org.mockito.asm.ByteVector byteVector29 = byteVector27.putShort((int) '#');
        org.mockito.asm.ByteVector byteVector31 = new org.mockito.asm.ByteVector((int) (short) 0);
        org.mockito.asm.ByteVector byteVector32 = new org.mockito.asm.ByteVector();
        org.mockito.asm.ByteVector byteVector34 = byteVector32.putUTF8("hi!");
        org.mockito.asm.ByteVector byteVector36 = byteVector32.putInt(0);
        org.mockito.asm.ByteVector byteVector38 = byteVector36.putInt((int) ' ');
        org.mockito.asm.ByteVector byteVector40 = byteVector38.putLong(100L);
        byte[] byteArray44 = new byte[] { (byte) 0, (byte) 10, (byte) 1 };
        org.mockito.asm.ByteVector byteVector47 = byteVector38.putByteArray(byteArray44, 0, 0);
        org.mockito.asm.ByteVector byteVector50 = byteVector31.putByteArray(byteArray44, 1, (int) (short) 0);
        org.mockito.asm.ByteVector byteVector53 = byteVector27.putByteArray(byteArray44, (int) (short) 0, 0);
        org.mockito.asm.ByteVector byteVector56 = byteVector10.putByteArray(byteArray44, (int) (byte) 0, (int) (byte) 1);
        // The following exception was thrown during execution in test generation
        try {
            org.mockito.asm.ByteVector byteVector59 = byteVector1.putByteArray(byteArray44, (int) ' ', 10);
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
        org.junit.Assert.assertNotNull(byteVector19);
        org.junit.Assert.assertNotNull(byteVector21);
        org.junit.Assert.assertNotNull(byteVector23);
        org.junit.Assert.assertNotNull(byteVector25);
        org.junit.Assert.assertNotNull(byteVector27);
        org.junit.Assert.assertNotNull(byteVector29);
        org.junit.Assert.assertNotNull(byteVector34);
        org.junit.Assert.assertNotNull(byteVector36);
        org.junit.Assert.assertNotNull(byteVector38);
        org.junit.Assert.assertNotNull(byteVector40);
        org.junit.Assert.assertNotNull(byteArray44);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray44), "[0, 10, 1]");
        org.junit.Assert.assertNotNull(byteVector47);
        org.junit.Assert.assertNotNull(byteVector50);
        org.junit.Assert.assertNotNull(byteVector53);
        org.junit.Assert.assertNotNull(byteVector56);
    }

    @Test
    public void test1777() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1777");
        org.mockito.asm.ByteVector byteVector0 = new org.mockito.asm.ByteVector();
        org.mockito.asm.ByteVector byteVector2 = byteVector0.putUTF8("hi!");
        org.mockito.asm.ByteVector byteVector4 = byteVector0.putInt(0);
        org.mockito.asm.ByteVector byteVector6 = byteVector0.putShort(10);
        org.mockito.asm.ByteVector byteVector8 = byteVector0.putLong((long) (short) 1);
        org.mockito.asm.ByteVector byteVector10 = byteVector0.putShort(100);
        org.mockito.asm.ByteVector byteVector12 = byteVector0.putLong((long) 'a');
        java.lang.Class<?> wildcardClass13 = byteVector0.getClass();
        org.junit.Assert.assertNotNull(byteVector2);
        org.junit.Assert.assertNotNull(byteVector4);
        org.junit.Assert.assertNotNull(byteVector6);
        org.junit.Assert.assertNotNull(byteVector8);
        org.junit.Assert.assertNotNull(byteVector10);
        org.junit.Assert.assertNotNull(byteVector12);
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test1778() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1778");
        org.mockito.asm.ByteVector byteVector0 = new org.mockito.asm.ByteVector();
        org.mockito.asm.ByteVector byteVector2 = byteVector0.putUTF8("hi!");
        org.mockito.asm.ByteVector byteVector4 = byteVector0.putShort((int) (short) -1);
        org.mockito.asm.ByteVector byteVector6 = byteVector0.putInt((int) (byte) 10);
        org.mockito.asm.ByteVector byteVector8 = byteVector6.putUTF8("hi!");
        org.mockito.asm.ByteVector byteVector10 = byteVector6.putLong((long) '#');
        org.mockito.asm.ByteVector byteVector12 = byteVector10.putShort(0);
        org.mockito.asm.ByteVector byteVector14 = byteVector12.putShort((int) (short) 1);
        org.mockito.asm.ByteVector byteVector16 = byteVector12.putByte((int) '4');
        org.mockito.asm.ByteVector byteVector18 = byteVector16.putLong((long) (byte) 0);
        org.mockito.asm.ByteVector byteVector20 = byteVector18.putByte((int) (byte) 0);
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
    public void test1779() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1779");
        org.mockito.asm.ByteVector byteVector0 = new org.mockito.asm.ByteVector();
        org.mockito.asm.ByteVector byteVector2 = byteVector0.putUTF8("hi!");
        org.mockito.asm.ByteVector byteVector4 = byteVector0.putInt(0);
        org.mockito.asm.ByteVector byteVector6 = byteVector4.putInt((int) ' ');
        org.mockito.asm.ByteVector byteVector8 = byteVector6.putLong(100L);
        org.mockito.asm.ByteVector byteVector10 = byteVector6.putByte((int) (short) 100);
        java.lang.Class<?> wildcardClass11 = byteVector6.getClass();
        org.junit.Assert.assertNotNull(byteVector2);
        org.junit.Assert.assertNotNull(byteVector4);
        org.junit.Assert.assertNotNull(byteVector6);
        org.junit.Assert.assertNotNull(byteVector8);
        org.junit.Assert.assertNotNull(byteVector10);
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test1780() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1780");
        org.mockito.asm.ByteVector byteVector0 = new org.mockito.asm.ByteVector();
        org.mockito.asm.ByteVector byteVector2 = byteVector0.putUTF8("hi!");
        org.mockito.asm.ByteVector byteVector4 = byteVector2.putInt((int) (byte) 10);
        org.mockito.asm.ByteVector byteVector6 = byteVector4.putUTF8("");
        org.mockito.asm.ByteVector byteVector8 = byteVector6.putUTF8("hi!");
        org.mockito.asm.ByteVector byteVector10 = byteVector6.putShort(0);
        org.mockito.asm.ByteVector byteVector12 = byteVector6.putInt((-1));
        org.mockito.asm.ByteVector byteVector14 = byteVector12.putLong((long) (byte) -1);
        org.mockito.asm.ByteVector byteVector16 = byteVector14.putLong((long) ' ');
        org.mockito.asm.ByteVector byteVector18 = byteVector16.putInt((int) '4');
        org.mockito.asm.ByteVector byteVector20 = byteVector16.putShort((int) (short) 1);
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
    public void test1781() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1781");
        org.mockito.asm.ByteVector byteVector0 = new org.mockito.asm.ByteVector();
        org.mockito.asm.ByteVector byteVector2 = byteVector0.putUTF8("hi!");
        org.mockito.asm.ByteVector byteVector4 = byteVector2.putInt((int) (byte) 10);
        org.mockito.asm.ByteVector byteVector6 = byteVector4.putUTF8("");
        org.mockito.asm.ByteVector byteVector8 = byteVector4.putLong((long) '#');
        org.mockito.asm.ByteVector byteVector10 = byteVector8.putLong((long) (short) 100);
        org.mockito.asm.ByteVector byteVector12 = byteVector8.putByte(1);
        org.mockito.asm.ByteVector byteVector14 = byteVector8.putUTF8("hi!");
        org.mockito.asm.ByteVector byteVector16 = byteVector14.putShort((int) 'a');
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
    public void test1782() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1782");
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
        org.mockito.asm.ByteVector byteVector20 = byteVector10.putInt((int) (byte) 10);
        org.mockito.asm.ByteVector byteVector22 = byteVector10.putInt((int) (byte) 0);
        org.mockito.asm.ByteVector byteVector24 = byteVector22.putByte((-1));
        org.mockito.asm.ByteVector byteVector26 = byteVector24.putLong((-1L));
        org.mockito.asm.ByteVector byteVector28 = byteVector26.putLong((long) (short) 1);
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
    public void test1783() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1783");
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
        org.mockito.asm.ByteVector byteVector22 = byteVector16.putInt((int) '#');
        org.mockito.asm.ByteVector byteVector24 = byteVector22.putInt((int) ' ');
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
    public void test1784() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1784");
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
        java.lang.Class<?> wildcardClass38 = byteVector18.getClass();
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
    public void test1785() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1785");
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
        org.mockito.asm.ByteVector byteVector24 = byteVector22.putLong((long) 1);
        org.mockito.asm.ByteVector byteVector26 = byteVector24.putByte((int) (short) 0);
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
    public void test1786() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1786");
        org.mockito.asm.ByteVector byteVector0 = new org.mockito.asm.ByteVector();
        org.mockito.asm.ByteVector byteVector2 = byteVector0.putUTF8("hi!");
        org.mockito.asm.ByteVector byteVector4 = byteVector0.putLong((long) ' ');
        org.mockito.asm.ByteVector byteVector6 = byteVector4.putByte((int) 'a');
        org.mockito.asm.ByteVector byteVector8 = byteVector6.putInt((int) (short) 0);
        org.mockito.asm.ByteVector byteVector10 = byteVector8.putByte((int) (short) 0);
        org.mockito.asm.ByteVector byteVector12 = byteVector10.putUTF8("");
        org.mockito.asm.ByteVector byteVector14 = byteVector12.putUTF8("hi!");
        byte[] byteArray15 = null;
        org.mockito.asm.ByteVector byteVector18 = byteVector14.putByteArray(byteArray15, (int) (short) 1, 10);
        org.mockito.asm.ByteVector byteVector20 = byteVector14.putLong((long) (short) -1);
        org.mockito.asm.ByteVector byteVector22 = byteVector20.putByte(0);
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
    }

    @Test
    public void test1787() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1787");
        org.mockito.asm.ByteVector byteVector0 = new org.mockito.asm.ByteVector();
        org.mockito.asm.ByteVector byteVector2 = byteVector0.putUTF8("hi!");
        org.mockito.asm.ByteVector byteVector4 = byteVector0.putLong((long) ' ');
        org.mockito.asm.ByteVector byteVector6 = byteVector4.putByte((int) 'a');
        org.mockito.asm.ByteVector byteVector8 = byteVector6.putByte((int) (short) -1);
        byte[] byteArray9 = null;
        org.mockito.asm.ByteVector byteVector12 = byteVector6.putByteArray(byteArray9, (int) '#', 0);
        org.mockito.asm.ByteVector byteVector14 = byteVector6.putUTF8("");
        org.mockito.asm.ByteVector byteVector16 = byteVector6.putInt((int) '4');
        org.mockito.asm.ByteVector byteVector18 = byteVector6.putShort((int) (short) 100);
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
    public void test1788() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1788");
        org.mockito.asm.ByteVector byteVector0 = new org.mockito.asm.ByteVector();
        org.mockito.asm.ByteVector byteVector2 = byteVector0.putUTF8("hi!");
        org.mockito.asm.ByteVector byteVector4 = byteVector0.putInt(0);
        org.mockito.asm.ByteVector byteVector6 = byteVector0.putInt(1);
        org.mockito.asm.ByteVector byteVector8 = byteVector0.putUTF8("");
        org.mockito.asm.ByteVector byteVector10 = byteVector8.putLong(10L);
        org.mockito.asm.ByteVector byteVector12 = byteVector8.putShort((int) (byte) 100);
        org.mockito.asm.ByteVector byteVector14 = byteVector8.putShort((int) (short) 1);
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
    public void test1789() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1789");
        org.mockito.asm.ByteVector byteVector0 = new org.mockito.asm.ByteVector();
        org.mockito.asm.ByteVector byteVector2 = byteVector0.putUTF8("hi!");
        org.mockito.asm.ByteVector byteVector4 = byteVector0.putShort((int) (short) 100);
        org.mockito.asm.ByteVector byteVector6 = byteVector4.putLong((long) (byte) -1);
        org.mockito.asm.ByteVector byteVector8 = byteVector4.putByte((int) (byte) 10);
        org.mockito.asm.ByteVector byteVector10 = byteVector4.putInt((int) (short) 1);
        org.mockito.asm.ByteVector byteVector12 = byteVector10.putUTF8("");
        org.junit.Assert.assertNotNull(byteVector2);
        org.junit.Assert.assertNotNull(byteVector4);
        org.junit.Assert.assertNotNull(byteVector6);
        org.junit.Assert.assertNotNull(byteVector8);
        org.junit.Assert.assertNotNull(byteVector10);
        org.junit.Assert.assertNotNull(byteVector12);
    }

    @Test
    public void test1790() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1790");
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
    public void test1791() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1791");
        org.mockito.asm.ByteVector byteVector0 = new org.mockito.asm.ByteVector();
        org.mockito.asm.ByteVector byteVector2 = byteVector0.putUTF8("hi!");
        org.mockito.asm.ByteVector byteVector4 = byteVector2.putInt(0);
        org.mockito.asm.ByteVector byteVector6 = byteVector4.putByte((int) (short) 0);
        org.mockito.asm.ByteVector byteVector8 = byteVector6.putLong((long) (byte) 100);
        org.junit.Assert.assertNotNull(byteVector2);
        org.junit.Assert.assertNotNull(byteVector4);
        org.junit.Assert.assertNotNull(byteVector6);
        org.junit.Assert.assertNotNull(byteVector8);
    }

    @Test
    public void test1792() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1792");
        org.mockito.asm.ByteVector byteVector0 = new org.mockito.asm.ByteVector();
        org.mockito.asm.ByteVector byteVector2 = byteVector0.putUTF8("hi!");
        org.mockito.asm.ByteVector byteVector4 = byteVector2.putByte(100);
        org.mockito.asm.ByteVector byteVector6 = byteVector4.putInt(1);
        org.mockito.asm.ByteVector byteVector8 = byteVector4.putInt((int) (short) 0);
        org.junit.Assert.assertNotNull(byteVector2);
        org.junit.Assert.assertNotNull(byteVector4);
        org.junit.Assert.assertNotNull(byteVector6);
        org.junit.Assert.assertNotNull(byteVector8);
    }

    @Test
    public void test1793() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1793");
        org.mockito.asm.ByteVector byteVector0 = new org.mockito.asm.ByteVector();
        org.mockito.asm.ByteVector byteVector2 = byteVector0.putUTF8("hi!");
        org.mockito.asm.ByteVector byteVector4 = byteVector2.putInt(0);
        org.mockito.asm.ByteVector byteVector6 = byteVector2.putByte((int) (byte) 10);
        org.mockito.asm.ByteVector byteVector8 = byteVector6.putLong(0L);
        org.mockito.asm.ByteVector byteVector10 = byteVector8.putShort((int) 'a');
        org.mockito.asm.ByteVector byteVector12 = byteVector10.putByte((int) ' ');
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
    public void test1794() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1794");
        org.mockito.asm.ByteVector byteVector1 = new org.mockito.asm.ByteVector((int) '#');
        org.mockito.asm.ByteVector byteVector3 = byteVector1.putInt(100);
        org.mockito.asm.ByteVector byteVector5 = byteVector1.putInt(0);
        org.mockito.asm.ByteVector byteVector7 = byteVector5.putShort((int) (byte) 100);
        org.mockito.asm.ByteVector byteVector9 = byteVector5.putUTF8("hi!");
        org.mockito.asm.ByteVector byteVector11 = byteVector9.putByte((int) 'a');
        org.junit.Assert.assertNotNull(byteVector3);
        org.junit.Assert.assertNotNull(byteVector5);
        org.junit.Assert.assertNotNull(byteVector7);
        org.junit.Assert.assertNotNull(byteVector9);
        org.junit.Assert.assertNotNull(byteVector11);
    }

    @Test
    public void test1795() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1795");
        org.mockito.asm.ByteVector byteVector0 = new org.mockito.asm.ByteVector();
        org.mockito.asm.ByteVector byteVector2 = byteVector0.putUTF8("hi!");
        org.mockito.asm.ByteVector byteVector4 = byteVector0.putShort((int) (short) -1);
        org.mockito.asm.ByteVector byteVector6 = byteVector0.putInt(0);
        org.mockito.asm.ByteVector byteVector8 = byteVector0.putUTF8("hi!");
        org.mockito.asm.ByteVector byteVector10 = byteVector8.putInt(100);
        org.mockito.asm.ByteVector byteVector12 = byteVector10.putInt((int) (byte) 100);
        org.mockito.asm.ByteVector byteVector14 = byteVector10.putByte((int) '4');
        org.junit.Assert.assertNotNull(byteVector2);
        org.junit.Assert.assertNotNull(byteVector4);
        org.junit.Assert.assertNotNull(byteVector6);
        org.junit.Assert.assertNotNull(byteVector8);
        org.junit.Assert.assertNotNull(byteVector10);
        org.junit.Assert.assertNotNull(byteVector12);
        org.junit.Assert.assertNotNull(byteVector14);
    }

    @Test
    public void test1796() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1796");
        org.mockito.asm.ByteVector byteVector0 = new org.mockito.asm.ByteVector();
        org.mockito.asm.ByteVector byteVector2 = byteVector0.putUTF8("hi!");
        org.mockito.asm.ByteVector byteVector4 = byteVector2.putInt((int) (byte) 10);
        org.mockito.asm.ByteVector byteVector6 = byteVector4.putUTF8("");
        org.mockito.asm.ByteVector byteVector8 = byteVector6.putUTF8("hi!");
        org.mockito.asm.ByteVector byteVector10 = byteVector6.putShort((int) (short) 0);
        org.mockito.asm.ByteVector byteVector12 = byteVector10.putLong((long) (short) 100);
        org.mockito.asm.ByteVector byteVector14 = byteVector10.putLong((long) (short) -1);
        org.junit.Assert.assertNotNull(byteVector2);
        org.junit.Assert.assertNotNull(byteVector4);
        org.junit.Assert.assertNotNull(byteVector6);
        org.junit.Assert.assertNotNull(byteVector8);
        org.junit.Assert.assertNotNull(byteVector10);
        org.junit.Assert.assertNotNull(byteVector12);
        org.junit.Assert.assertNotNull(byteVector14);
    }

    @Test
    public void test1797() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1797");
        org.mockito.asm.ByteVector byteVector0 = new org.mockito.asm.ByteVector();
        org.mockito.asm.ByteVector byteVector2 = byteVector0.putUTF8("hi!");
        org.mockito.asm.ByteVector byteVector4 = byteVector0.putShort((int) (short) -1);
        org.mockito.asm.ByteVector byteVector6 = byteVector4.putUTF8("hi!");
        org.mockito.asm.ByteVector byteVector8 = byteVector6.putLong(0L);
        org.mockito.asm.ByteVector byteVector10 = byteVector8.putByte((int) (byte) 100);
        org.mockito.asm.ByteVector byteVector12 = byteVector10.putInt((int) 'a');
        org.junit.Assert.assertNotNull(byteVector2);
        org.junit.Assert.assertNotNull(byteVector4);
        org.junit.Assert.assertNotNull(byteVector6);
        org.junit.Assert.assertNotNull(byteVector8);
        org.junit.Assert.assertNotNull(byteVector10);
        org.junit.Assert.assertNotNull(byteVector12);
    }

    @Test
    public void test1798() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1798");
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
        org.mockito.asm.ByteVector byteVector22 = byteVector20.putShort((int) (short) 100);
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
    public void test1799() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1799");
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
        org.mockito.asm.ByteVector byteVector22 = byteVector20.putLong((long) (byte) -1);
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
    public void test1800() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1800");
        org.mockito.asm.ByteVector byteVector1 = new org.mockito.asm.ByteVector((int) '#');
        org.mockito.asm.ByteVector byteVector3 = byteVector1.putLong(100L);
        org.mockito.asm.ByteVector byteVector5 = byteVector1.putUTF8("");
        org.mockito.asm.ByteVector byteVector7 = byteVector1.putUTF8("hi!");
        org.mockito.asm.ByteVector byteVector9 = byteVector7.putLong((long) (short) 0);
        org.mockito.asm.ByteVector byteVector11 = byteVector9.putShort((int) (byte) 10);
        org.mockito.asm.ByteVector byteVector13 = byteVector11.putShort(100);
        org.mockito.asm.ByteVector byteVector15 = byteVector11.putShort((int) '#');
        org.mockito.asm.ByteVector byteVector17 = byteVector11.putLong((long) 10);
        org.mockito.asm.ByteVector byteVector19 = byteVector11.putByte((int) (short) 100);
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
    public void test1801() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1801");
        org.mockito.asm.ByteVector byteVector0 = new org.mockito.asm.ByteVector();
        org.mockito.asm.ByteVector byteVector2 = byteVector0.putUTF8("hi!");
        org.mockito.asm.ByteVector byteVector4 = byteVector2.putLong((long) (byte) 10);
        org.mockito.asm.ByteVector byteVector6 = byteVector2.putInt((int) (short) 1);
        org.mockito.asm.ByteVector byteVector8 = byteVector2.putLong((long) (short) 10);
        org.mockito.asm.ByteVector byteVector10 = byteVector2.putShort(10);
        org.mockito.asm.ByteVector byteVector12 = byteVector2.putByte((int) (short) 0);
        org.junit.Assert.assertNotNull(byteVector2);
        org.junit.Assert.assertNotNull(byteVector4);
        org.junit.Assert.assertNotNull(byteVector6);
        org.junit.Assert.assertNotNull(byteVector8);
        org.junit.Assert.assertNotNull(byteVector10);
        org.junit.Assert.assertNotNull(byteVector12);
    }

    @Test
    public void test1802() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1802");
        org.mockito.asm.ByteVector byteVector1 = new org.mockito.asm.ByteVector((int) '#');
        org.mockito.asm.ByteVector byteVector3 = byteVector1.putLong(100L);
        org.mockito.asm.ByteVector byteVector5 = byteVector1.putUTF8("");
        org.mockito.asm.ByteVector byteVector7 = byteVector1.putUTF8("hi!");
        org.mockito.asm.ByteVector byteVector9 = byteVector7.putLong((long) (short) 0);
        org.mockito.asm.ByteVector byteVector11 = byteVector7.putLong((long) (byte) -1);
        org.mockito.asm.ByteVector byteVector13 = byteVector7.putLong((long) 0);
        org.mockito.asm.ByteVector byteVector15 = byteVector13.putByte(0);
        org.mockito.asm.ByteVector byteVector17 = byteVector13.putLong((-1L));
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
    public void test1803() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1803");
        org.mockito.asm.ByteVector byteVector0 = new org.mockito.asm.ByteVector();
        org.mockito.asm.ByteVector byteVector2 = byteVector0.putUTF8("hi!");
        org.mockito.asm.ByteVector byteVector4 = byteVector2.putLong((long) (byte) 10);
        org.mockito.asm.ByteVector byteVector6 = byteVector4.putInt((int) 'a');
        org.mockito.asm.ByteVector byteVector8 = byteVector6.putShort((int) (byte) 0);
        org.mockito.asm.ByteVector byteVector10 = byteVector6.putShort(0);
        org.mockito.asm.ByteVector byteVector12 = byteVector10.putShort(10);
        org.mockito.asm.ByteVector byteVector14 = byteVector10.putInt((int) (byte) 1);
        org.mockito.asm.ByteVector byteVector16 = byteVector14.putShort((int) (short) -1);
        org.mockito.asm.ByteVector byteVector18 = byteVector16.putInt((int) (short) 10);
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
    public void test1804() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1804");
        org.mockito.asm.ByteVector byteVector0 = new org.mockito.asm.ByteVector();
        org.mockito.asm.ByteVector byteVector2 = byteVector0.putUTF8("hi!");
        org.mockito.asm.ByteVector byteVector4 = byteVector0.putShort((int) (short) -1);
        org.mockito.asm.ByteVector byteVector6 = byteVector0.putInt((int) (byte) 10);
        org.mockito.asm.ByteVector byteVector8 = byteVector6.putUTF8("hi!");
        org.mockito.asm.ByteVector byteVector10 = byteVector8.putShort((int) (short) 1);
        org.mockito.asm.ByteVector byteVector12 = byteVector10.putUTF8("hi!");
        org.mockito.asm.ByteVector byteVector14 = byteVector12.putInt((int) (short) -1);
        org.junit.Assert.assertNotNull(byteVector2);
        org.junit.Assert.assertNotNull(byteVector4);
        org.junit.Assert.assertNotNull(byteVector6);
        org.junit.Assert.assertNotNull(byteVector8);
        org.junit.Assert.assertNotNull(byteVector10);
        org.junit.Assert.assertNotNull(byteVector12);
        org.junit.Assert.assertNotNull(byteVector14);
    }

    @Test
    public void test1805() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1805");
        org.mockito.asm.ByteVector byteVector1 = new org.mockito.asm.ByteVector((int) '#');
        org.mockito.asm.ByteVector byteVector3 = byteVector1.putInt(100);
        org.mockito.asm.ByteVector byteVector5 = byteVector3.putShort((int) (short) -1);
        org.mockito.asm.ByteVector byteVector7 = byteVector3.putShort(10);
        org.mockito.asm.ByteVector byteVector9 = byteVector7.putUTF8("");
        java.lang.Class<?> wildcardClass10 = byteVector7.getClass();
        org.junit.Assert.assertNotNull(byteVector3);
        org.junit.Assert.assertNotNull(byteVector5);
        org.junit.Assert.assertNotNull(byteVector7);
        org.junit.Assert.assertNotNull(byteVector9);
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test1806() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1806");
        org.mockito.asm.ByteVector byteVector0 = new org.mockito.asm.ByteVector();
        org.mockito.asm.ByteVector byteVector2 = byteVector0.putUTF8("hi!");
        org.mockito.asm.ByteVector byteVector4 = byteVector0.putInt(0);
        org.mockito.asm.ByteVector byteVector6 = byteVector4.putByte((int) (byte) -1);
        java.lang.Class<?> wildcardClass7 = byteVector6.getClass();
        org.junit.Assert.assertNotNull(byteVector2);
        org.junit.Assert.assertNotNull(byteVector4);
        org.junit.Assert.assertNotNull(byteVector6);
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test1807() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1807");
        org.mockito.asm.ByteVector byteVector0 = new org.mockito.asm.ByteVector();
        org.mockito.asm.ByteVector byteVector2 = byteVector0.putUTF8("hi!");
        org.mockito.asm.ByteVector byteVector4 = byteVector2.putInt((int) (byte) 10);
        org.mockito.asm.ByteVector byteVector6 = byteVector4.putUTF8("");
        org.mockito.asm.ByteVector byteVector8 = byteVector6.putUTF8("hi!");
        org.mockito.asm.ByteVector byteVector10 = byteVector6.putInt((int) '#');
        org.mockito.asm.ByteVector byteVector12 = byteVector10.putInt((int) (short) 0);
        org.mockito.asm.ByteVector byteVector14 = byteVector10.putShort((int) (short) 10);
        org.mockito.asm.ByteVector byteVector16 = byteVector14.putLong((long) 'a');
        org.mockito.asm.ByteVector byteVector18 = byteVector16.putShort((int) '#');
        org.mockito.asm.ByteVector byteVector20 = byteVector16.putByte((int) (byte) 0);
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
    public void test1808() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1808");
        org.mockito.asm.ByteVector byteVector0 = new org.mockito.asm.ByteVector();
        org.mockito.asm.ByteVector byteVector2 = byteVector0.putUTF8("hi!");
        org.mockito.asm.ByteVector byteVector4 = byteVector2.putLong((long) (byte) 10);
        org.mockito.asm.ByteVector byteVector6 = byteVector4.putUTF8("hi!");
        org.mockito.asm.ByteVector byteVector8 = byteVector4.putLong((long) 10);
        org.mockito.asm.ByteVector byteVector10 = byteVector8.putLong(0L);
        org.mockito.asm.ByteVector byteVector12 = byteVector10.putShort((int) (byte) -1);
        org.mockito.asm.ByteVector byteVector14 = byteVector10.putInt((-1));
        org.mockito.asm.ByteVector byteVector16 = byteVector10.putByte((int) (byte) 100);
        org.mockito.asm.ByteVector byteVector18 = byteVector10.putShort((int) (byte) 1);
        org.mockito.asm.ByteVector byteVector20 = byteVector10.putShort((int) (byte) 100);
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
    public void test1809() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1809");
        org.mockito.asm.ByteVector byteVector0 = new org.mockito.asm.ByteVector();
        org.mockito.asm.ByteVector byteVector2 = byteVector0.putUTF8("hi!");
        org.mockito.asm.ByteVector byteVector4 = byteVector2.putInt((int) (byte) 10);
        org.mockito.asm.ByteVector byteVector6 = byteVector2.putUTF8("hi!");
        org.mockito.asm.ByteVector byteVector8 = byteVector6.putLong((long) 10);
        org.mockito.asm.ByteVector byteVector10 = byteVector6.putShort((int) ' ');
        org.junit.Assert.assertNotNull(byteVector2);
        org.junit.Assert.assertNotNull(byteVector4);
        org.junit.Assert.assertNotNull(byteVector6);
        org.junit.Assert.assertNotNull(byteVector8);
        org.junit.Assert.assertNotNull(byteVector10);
    }

    @Test
    public void test1810() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1810");
        org.mockito.asm.ByteVector byteVector0 = new org.mockito.asm.ByteVector();
        org.mockito.asm.ByteVector byteVector2 = byteVector0.putUTF8("hi!");
        org.mockito.asm.ByteVector byteVector4 = byteVector2.putInt(0);
        org.mockito.asm.ByteVector byteVector6 = byteVector2.putByte((int) (byte) 10);
        org.mockito.asm.ByteVector byteVector8 = byteVector6.putUTF8("hi!");
        org.mockito.asm.ByteVector byteVector10 = byteVector8.putUTF8("hi!");
        org.mockito.asm.ByteVector byteVector12 = byteVector10.putByte((int) (short) -1);
        org.mockito.asm.ByteVector byteVector14 = byteVector10.putLong((long) 1);
        org.mockito.asm.ByteVector byteVector16 = byteVector10.putLong(100L);
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
    public void test1811() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1811");
        org.mockito.asm.ByteVector byteVector0 = new org.mockito.asm.ByteVector();
        org.mockito.asm.ByteVector byteVector2 = byteVector0.putUTF8("hi!");
        org.mockito.asm.ByteVector byteVector4 = byteVector0.putInt(0);
        org.mockito.asm.ByteVector byteVector6 = byteVector0.putShort(10);
        org.mockito.asm.ByteVector byteVector8 = byteVector6.putUTF8("");
        org.mockito.asm.ByteVector byteVector10 = byteVector8.putInt(1);
        org.mockito.asm.ByteVector byteVector11 = new org.mockito.asm.ByteVector();
        org.mockito.asm.ByteVector byteVector13 = byteVector11.putUTF8("hi!");
        org.mockito.asm.ByteVector byteVector15 = byteVector11.putLong((long) ' ');
        org.mockito.asm.ByteVector byteVector17 = byteVector15.putByte((int) 'a');
        org.mockito.asm.ByteVector byteVector19 = byteVector15.putByte((int) (short) -1);
        org.mockito.asm.ByteVector byteVector21 = byteVector15.putLong(0L);
        org.mockito.asm.ByteVector byteVector23 = byteVector15.putUTF8("hi!");
        org.mockito.asm.ByteVector byteVector25 = byteVector23.putUTF8("");
        org.mockito.asm.ByteVector byteVector27 = byteVector23.putInt((int) (byte) 10);
        org.mockito.asm.ByteVector byteVector29 = byteVector27.putLong((long) (short) -1);
        org.mockito.asm.ByteVector byteVector31 = byteVector27.putByte(0);
        org.mockito.asm.ByteVector byteVector32 = new org.mockito.asm.ByteVector();
        org.mockito.asm.ByteVector byteVector34 = byteVector32.putUTF8("hi!");
        org.mockito.asm.ByteVector byteVector36 = byteVector34.putInt(0);
        org.mockito.asm.ByteVector byteVector38 = byteVector34.putByte((int) (byte) 10);
        org.mockito.asm.ByteVector byteVector40 = byteVector38.putLong((-1L));
        org.mockito.asm.ByteVector byteVector42 = byteVector38.putInt((int) (byte) 100);
        org.mockito.asm.ByteVector byteVector43 = new org.mockito.asm.ByteVector();
        org.mockito.asm.ByteVector byteVector45 = byteVector43.putUTF8("hi!");
        org.mockito.asm.ByteVector byteVector47 = byteVector43.putInt(0);
        org.mockito.asm.ByteVector byteVector49 = byteVector47.putInt((int) ' ');
        org.mockito.asm.ByteVector byteVector51 = byteVector49.putLong(100L);
        byte[] byteArray55 = new byte[] { (byte) 0, (byte) 10, (byte) 1 };
        org.mockito.asm.ByteVector byteVector58 = byteVector49.putByteArray(byteArray55, 0, 0);
        org.mockito.asm.ByteVector byteVector61 = byteVector38.putByteArray(byteArray55, (int) (byte) 1, 0);
        org.mockito.asm.ByteVector byteVector64 = byteVector31.putByteArray(byteArray55, 1, 0);
        // The following exception was thrown during execution in test generation
        try {
            org.mockito.asm.ByteVector byteVector67 = byteVector10.putByteArray(byteArray55, (int) (byte) 0, 100);
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
        org.junit.Assert.assertNotNull(byteVector45);
        org.junit.Assert.assertNotNull(byteVector47);
        org.junit.Assert.assertNotNull(byteVector49);
        org.junit.Assert.assertNotNull(byteVector51);
        org.junit.Assert.assertNotNull(byteArray55);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray55), "[0, 10, 1]");
        org.junit.Assert.assertNotNull(byteVector58);
        org.junit.Assert.assertNotNull(byteVector61);
        org.junit.Assert.assertNotNull(byteVector64);
    }

    @Test
    public void test1812() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1812");
        org.mockito.asm.ByteVector byteVector0 = new org.mockito.asm.ByteVector();
        org.mockito.asm.ByteVector byteVector2 = byteVector0.putUTF8("hi!");
        org.mockito.asm.ByteVector byteVector4 = byteVector2.putInt((int) (byte) 10);
        org.mockito.asm.ByteVector byteVector6 = byteVector4.putUTF8("");
        org.mockito.asm.ByteVector byteVector8 = byteVector4.putInt((int) (short) 10);
        java.lang.Class<?> wildcardClass9 = byteVector4.getClass();
        org.junit.Assert.assertNotNull(byteVector2);
        org.junit.Assert.assertNotNull(byteVector4);
        org.junit.Assert.assertNotNull(byteVector6);
        org.junit.Assert.assertNotNull(byteVector8);
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test1813() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1813");
        org.mockito.asm.ByteVector byteVector0 = new org.mockito.asm.ByteVector();
        org.mockito.asm.ByteVector byteVector2 = byteVector0.putUTF8("hi!");
        org.mockito.asm.ByteVector byteVector4 = byteVector2.putInt(0);
        org.mockito.asm.ByteVector byteVector6 = byteVector2.putByte((int) (byte) 10);
        org.mockito.asm.ByteVector byteVector8 = byteVector6.putLong((-1L));
        org.mockito.asm.ByteVector byteVector10 = byteVector6.putInt((int) (byte) 100);
        org.mockito.asm.ByteVector byteVector11 = new org.mockito.asm.ByteVector();
        org.mockito.asm.ByteVector byteVector13 = byteVector11.putUTF8("hi!");
        org.mockito.asm.ByteVector byteVector15 = byteVector11.putInt(0);
        org.mockito.asm.ByteVector byteVector17 = byteVector15.putInt((int) ' ');
        org.mockito.asm.ByteVector byteVector19 = byteVector17.putLong(100L);
        byte[] byteArray23 = new byte[] { (byte) 0, (byte) 10, (byte) 1 };
        org.mockito.asm.ByteVector byteVector26 = byteVector17.putByteArray(byteArray23, 0, 0);
        org.mockito.asm.ByteVector byteVector29 = byteVector6.putByteArray(byteArray23, (int) (byte) 1, 0);
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
        // The following exception was thrown during execution in test generation
        try {
            org.mockito.asm.ByteVector byteVector70 = byteVector29.putByteArray(byteArray61, (int) (short) 10, (int) ' ');
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
    }

    @Test
    public void test1814() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1814");
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
        org.mockito.asm.ByteVector byteVector60 = byteVector58.putInt(10);
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
    public void test1815() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1815");
        org.mockito.asm.ByteVector byteVector0 = new org.mockito.asm.ByteVector();
        org.mockito.asm.ByteVector byteVector2 = byteVector0.putUTF8("hi!");
        org.mockito.asm.ByteVector byteVector4 = byteVector0.putInt(0);
        org.mockito.asm.ByteVector byteVector6 = byteVector0.putInt(1);
        org.mockito.asm.ByteVector byteVector8 = byteVector0.putUTF8("");
        org.mockito.asm.ByteVector byteVector10 = byteVector0.putShort((int) (byte) 10);
        org.mockito.asm.ByteVector byteVector12 = byteVector0.putShort(1);
        org.mockito.asm.ByteVector byteVector14 = byteVector0.putShort((-1));
        org.junit.Assert.assertNotNull(byteVector2);
        org.junit.Assert.assertNotNull(byteVector4);
        org.junit.Assert.assertNotNull(byteVector6);
        org.junit.Assert.assertNotNull(byteVector8);
        org.junit.Assert.assertNotNull(byteVector10);
        org.junit.Assert.assertNotNull(byteVector12);
        org.junit.Assert.assertNotNull(byteVector14);
    }

    @Test
    public void test1816() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1816");
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
    public void test1817() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1817");
        org.mockito.asm.ByteVector byteVector1 = new org.mockito.asm.ByteVector((int) '#');
        org.mockito.asm.ByteVector byteVector3 = byteVector1.putLong(100L);
        org.mockito.asm.ByteVector byteVector5 = byteVector1.putUTF8("");
        org.mockito.asm.ByteVector byteVector7 = byteVector5.putInt((int) (byte) 10);
        org.mockito.asm.ByteVector byteVector9 = byteVector7.putByte(0);
        org.mockito.asm.ByteVector byteVector11 = byteVector9.putInt(100);
        org.mockito.asm.ByteVector byteVector13 = byteVector11.putShort((int) '4');
        org.mockito.asm.ByteVector byteVector15 = new org.mockito.asm.ByteVector((int) (byte) 100);
        org.mockito.asm.ByteVector byteVector17 = byteVector15.putShort((int) (short) 100);
        org.mockito.asm.ByteVector byteVector18 = new org.mockito.asm.ByteVector();
        org.mockito.asm.ByteVector byteVector20 = byteVector18.putUTF8("hi!");
        org.mockito.asm.ByteVector byteVector22 = byteVector18.putLong((long) ' ');
        org.mockito.asm.ByteVector byteVector24 = byteVector22.putByte((int) 'a');
        org.mockito.asm.ByteVector byteVector26 = byteVector22.putByte((int) (short) -1);
        org.mockito.asm.ByteVector byteVector28 = byteVector22.putLong(0L);
        org.mockito.asm.ByteVector byteVector30 = byteVector22.putUTF8("hi!");
        org.mockito.asm.ByteVector byteVector32 = byteVector30.putUTF8("");
        org.mockito.asm.ByteVector byteVector34 = byteVector30.putInt((int) (byte) 10);
        org.mockito.asm.ByteVector byteVector36 = byteVector30.putByte(0);
        org.mockito.asm.ByteVector byteVector37 = new org.mockito.asm.ByteVector();
        org.mockito.asm.ByteVector byteVector39 = byteVector37.putUTF8("hi!");
        org.mockito.asm.ByteVector byteVector41 = byteVector37.putInt(0);
        org.mockito.asm.ByteVector byteVector43 = byteVector41.putInt((int) ' ');
        org.mockito.asm.ByteVector byteVector45 = byteVector43.putLong(100L);
        byte[] byteArray49 = new byte[] { (byte) 0, (byte) 10, (byte) 1 };
        org.mockito.asm.ByteVector byteVector52 = byteVector43.putByteArray(byteArray49, 0, 0);
        org.mockito.asm.ByteVector byteVector55 = byteVector36.putByteArray(byteArray49, (int) (short) 1, 0);
        org.mockito.asm.ByteVector byteVector58 = byteVector15.putByteArray(byteArray49, 0, (int) (byte) 1);
        // The following exception was thrown during execution in test generation
        try {
            org.mockito.asm.ByteVector byteVector61 = byteVector13.putByteArray(byteArray49, (int) (byte) 100, (int) (byte) 0);
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
        org.junit.Assert.assertNotNull(byteVector20);
        org.junit.Assert.assertNotNull(byteVector22);
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
    public void test1818() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1818");
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
        org.mockito.asm.ByteVector byteVector20 = byteVector16.putInt((int) (short) 100);
        org.mockito.asm.ByteVector byteVector22 = byteVector16.putByte(100);
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
    public void test1819() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1819");
        org.mockito.asm.ByteVector byteVector1 = new org.mockito.asm.ByteVector((int) '#');
        org.mockito.asm.ByteVector byteVector3 = byteVector1.putLong(100L);
        org.mockito.asm.ByteVector byteVector5 = byteVector3.putLong(1L);
        org.mockito.asm.ByteVector byteVector7 = byteVector5.putUTF8("hi!");
        org.mockito.asm.ByteVector byteVector9 = byteVector5.putUTF8("hi!");
        org.mockito.asm.ByteVector byteVector11 = byteVector9.putByte((int) (short) 0);
        org.mockito.asm.ByteVector byteVector13 = byteVector9.putShort((int) (byte) 10);
        org.mockito.asm.ByteVector byteVector15 = byteVector9.putInt((-1));
        org.junit.Assert.assertNotNull(byteVector3);
        org.junit.Assert.assertNotNull(byteVector5);
        org.junit.Assert.assertNotNull(byteVector7);
        org.junit.Assert.assertNotNull(byteVector9);
        org.junit.Assert.assertNotNull(byteVector11);
        org.junit.Assert.assertNotNull(byteVector13);
        org.junit.Assert.assertNotNull(byteVector15);
    }

    @Test
    public void test1820() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1820");
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
        org.mockito.asm.ByteVector byteVector24 = byteVector22.putUTF8("hi!");
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
    public void test1821() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1821");
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
        org.mockito.asm.ByteVector byteVector26 = byteVector20.putInt((int) (short) 1);
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
    public void test1822() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1822");
        org.mockito.asm.ByteVector byteVector0 = new org.mockito.asm.ByteVector();
        org.mockito.asm.ByteVector byteVector2 = byteVector0.putUTF8("hi!");
        org.mockito.asm.ByteVector byteVector4 = byteVector0.putLong((long) ' ');
        org.mockito.asm.ByteVector byteVector6 = byteVector4.putByte((int) 'a');
        org.mockito.asm.ByteVector byteVector8 = byteVector4.putByte((int) (short) -1);
        org.mockito.asm.ByteVector byteVector10 = byteVector4.putLong(0L);
        org.mockito.asm.ByteVector byteVector12 = byteVector10.putByte(0);
        org.mockito.asm.ByteVector byteVector14 = byteVector12.putInt((int) (short) 0);
        org.mockito.asm.ByteVector byteVector16 = byteVector14.putInt(10);
        org.mockito.asm.ByteVector byteVector18 = byteVector14.putShort((int) (short) 0);
        org.mockito.asm.ByteVector byteVector20 = byteVector14.putUTF8("hi!");
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
    public void test1823() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1823");
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
        org.mockito.asm.ByteVector byteVector22 = byteVector20.putByte((int) (short) 1);
        org.mockito.asm.ByteVector byteVector24 = byteVector22.putShort((-1));
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
    public void test1824() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1824");
        org.mockito.asm.ByteVector byteVector1 = new org.mockito.asm.ByteVector((int) (byte) 1);
        org.mockito.asm.ByteVector byteVector3 = byteVector1.putByte((int) (byte) 10);
        org.mockito.asm.ByteVector byteVector5 = byteVector3.putShort((int) (short) 10);
        org.mockito.asm.ByteVector byteVector7 = byteVector5.putShort((int) (byte) 1);
        org.mockito.asm.ByteVector byteVector9 = byteVector7.putInt((int) (byte) -1);
        org.mockito.asm.ByteVector byteVector10 = new org.mockito.asm.ByteVector();
        org.mockito.asm.ByteVector byteVector12 = byteVector10.putUTF8("hi!");
        org.mockito.asm.ByteVector byteVector14 = byteVector10.putLong((long) ' ');
        org.mockito.asm.ByteVector byteVector16 = byteVector14.putByte((int) 'a');
        org.mockito.asm.ByteVector byteVector18 = byteVector14.putByte((int) (short) -1);
        org.mockito.asm.ByteVector byteVector20 = byteVector14.putLong(0L);
        org.mockito.asm.ByteVector byteVector22 = byteVector20.putByte(0);
        org.mockito.asm.ByteVector byteVector24 = byteVector22.putLong(1L);
        org.mockito.asm.ByteVector byteVector26 = byteVector24.putShort((int) 'a');
        org.mockito.asm.ByteVector byteVector28 = byteVector24.putLong((long) 10);
        org.mockito.asm.ByteVector byteVector30 = byteVector24.putUTF8("");
        org.mockito.asm.ByteVector byteVector31 = new org.mockito.asm.ByteVector();
        org.mockito.asm.ByteVector byteVector33 = byteVector31.putUTF8("hi!");
        org.mockito.asm.ByteVector byteVector35 = byteVector33.putLong((long) (byte) 10);
        org.mockito.asm.ByteVector byteVector37 = byteVector35.putUTF8("hi!");
        org.mockito.asm.ByteVector byteVector39 = byteVector35.putLong((long) (short) -1);
        org.mockito.asm.ByteVector byteVector41 = byteVector39.putInt(10);
        org.mockito.asm.ByteVector byteVector43 = byteVector39.putByte((int) (short) 1);
        org.mockito.asm.ByteVector byteVector45 = byteVector39.putInt((int) (short) -1);
        org.mockito.asm.ByteVector byteVector47 = byteVector39.putUTF8("hi!");
        org.mockito.asm.ByteVector byteVector48 = new org.mockito.asm.ByteVector();
        org.mockito.asm.ByteVector byteVector50 = byteVector48.putUTF8("hi!");
        org.mockito.asm.ByteVector byteVector52 = byteVector48.putLong((long) ' ');
        org.mockito.asm.ByteVector byteVector54 = byteVector52.putByte((int) 'a');
        org.mockito.asm.ByteVector byteVector56 = byteVector52.putByte((int) (short) -1);
        org.mockito.asm.ByteVector byteVector58 = byteVector52.putLong(0L);
        org.mockito.asm.ByteVector byteVector60 = byteVector52.putUTF8("hi!");
        org.mockito.asm.ByteVector byteVector62 = byteVector60.putUTF8("");
        org.mockito.asm.ByteVector byteVector64 = byteVector62.putLong((long) (byte) 10);
        org.mockito.asm.ByteVector byteVector66 = byteVector62.putLong((long) (short) 100);
        byte[] byteArray71 = new byte[] { (byte) 1, (byte) 0, (byte) 0, (byte) -1 };
        org.mockito.asm.ByteVector byteVector74 = byteVector62.putByteArray(byteArray71, 0, 0);
        org.mockito.asm.ByteVector byteVector77 = byteVector47.putByteArray(byteArray71, (int) (byte) 0, (int) (short) 1);
        org.mockito.asm.ByteVector byteVector80 = byteVector24.putByteArray(byteArray71, (int) (short) 0, (int) (short) 0);
        org.mockito.asm.ByteVector byteVector83 = byteVector7.putByteArray(byteArray71, 0, (int) (byte) 1);
        java.lang.Class<?> wildcardClass84 = byteArray71.getClass();
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
        org.junit.Assert.assertNotNull(byteVector30);
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
        org.junit.Assert.assertNotNull(byteVector64);
        org.junit.Assert.assertNotNull(byteVector66);
        org.junit.Assert.assertNotNull(byteArray71);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray71), "[1, 0, 0, -1]");
        org.junit.Assert.assertNotNull(byteVector74);
        org.junit.Assert.assertNotNull(byteVector77);
        org.junit.Assert.assertNotNull(byteVector80);
        org.junit.Assert.assertNotNull(byteVector83);
        org.junit.Assert.assertNotNull(wildcardClass84);
    }

    @Test
    public void test1825() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1825");
        org.mockito.asm.ByteVector byteVector0 = new org.mockito.asm.ByteVector();
        org.mockito.asm.ByteVector byteVector2 = byteVector0.putUTF8("hi!");
        org.mockito.asm.ByteVector byteVector4 = byteVector2.putLong((long) (byte) 10);
        org.mockito.asm.ByteVector byteVector6 = byteVector4.putUTF8("hi!");
        org.mockito.asm.ByteVector byteVector8 = byteVector4.putLong((-1L));
        org.mockito.asm.ByteVector byteVector10 = byteVector8.putInt(10);
        org.mockito.asm.ByteVector byteVector12 = byteVector10.putShort((int) '#');
        org.mockito.asm.ByteVector byteVector14 = byteVector10.putShort((int) (byte) 100);
        org.mockito.asm.ByteVector byteVector16 = byteVector10.putUTF8("");
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
    public void test1826() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1826");
        org.mockito.asm.ByteVector byteVector0 = new org.mockito.asm.ByteVector();
        org.mockito.asm.ByteVector byteVector2 = byteVector0.putUTF8("hi!");
        org.mockito.asm.ByteVector byteVector4 = byteVector2.putLong((long) (byte) 10);
        org.mockito.asm.ByteVector byteVector6 = byteVector4.putInt((int) 'a');
        org.mockito.asm.ByteVector byteVector8 = byteVector6.putShort((int) (byte) 0);
        org.mockito.asm.ByteVector byteVector10 = byteVector6.putShort(0);
        org.mockito.asm.ByteVector byteVector12 = byteVector10.putShort(10);
        org.mockito.asm.ByteVector byteVector14 = byteVector10.putByte((int) ' ');
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
    public void test1827() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1827");
        org.mockito.asm.ByteVector byteVector0 = new org.mockito.asm.ByteVector();
        org.mockito.asm.ByteVector byteVector2 = byteVector0.putUTF8("hi!");
        org.mockito.asm.ByteVector byteVector4 = byteVector0.putShort((int) (short) -1);
        org.mockito.asm.ByteVector byteVector6 = byteVector0.putInt((int) (byte) 10);
        org.mockito.asm.ByteVector byteVector8 = byteVector6.putUTF8("hi!");
        org.mockito.asm.ByteVector byteVector10 = byteVector8.putByte((int) (byte) 1);
        org.mockito.asm.ByteVector byteVector12 = byteVector10.putUTF8("hi!");
        org.mockito.asm.ByteVector byteVector14 = byteVector12.putByte((int) (byte) 10);
        org.mockito.asm.ByteVector byteVector16 = byteVector12.putLong((long) ' ');
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
    public void test1828() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1828");
        org.mockito.asm.ByteVector byteVector1 = new org.mockito.asm.ByteVector((int) (byte) 100);
        org.mockito.asm.ByteVector byteVector3 = byteVector1.putShort((int) (short) 100);
        org.mockito.asm.ByteVector byteVector5 = byteVector1.putLong((long) (short) 10);
        org.mockito.asm.ByteVector byteVector7 = byteVector5.putUTF8("");
        org.mockito.asm.ByteVector byteVector9 = byteVector5.putByte((int) (byte) 0);
        org.mockito.asm.ByteVector byteVector11 = byteVector5.putLong((-1L));
        org.junit.Assert.assertNotNull(byteVector3);
        org.junit.Assert.assertNotNull(byteVector5);
        org.junit.Assert.assertNotNull(byteVector7);
        org.junit.Assert.assertNotNull(byteVector9);
        org.junit.Assert.assertNotNull(byteVector11);
    }

    @Test
    public void test1829() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1829");
        org.mockito.asm.ByteVector byteVector0 = new org.mockito.asm.ByteVector();
        org.mockito.asm.ByteVector byteVector2 = byteVector0.putUTF8("hi!");
        org.mockito.asm.ByteVector byteVector4 = byteVector2.putLong((long) (byte) 10);
        org.mockito.asm.ByteVector byteVector6 = byteVector4.putUTF8("hi!");
        org.mockito.asm.ByteVector byteVector8 = byteVector4.putInt((int) (byte) 100);
        org.mockito.asm.ByteVector byteVector10 = byteVector4.putUTF8("hi!");
        org.mockito.asm.ByteVector byteVector12 = byteVector10.putLong(0L);
        org.mockito.asm.ByteVector byteVector14 = byteVector12.putLong((long) ' ');
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
    public void test1830() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1830");
        org.mockito.asm.ByteVector byteVector0 = new org.mockito.asm.ByteVector();
        org.mockito.asm.ByteVector byteVector2 = byteVector0.putUTF8("hi!");
        org.mockito.asm.ByteVector byteVector4 = byteVector0.putLong((long) ' ');
        org.mockito.asm.ByteVector byteVector6 = byteVector4.putByte((int) 'a');
        org.mockito.asm.ByteVector byteVector8 = byteVector6.putInt((int) (short) 1);
        org.mockito.asm.ByteVector byteVector10 = byteVector6.putByte((int) (byte) -1);
        org.mockito.asm.ByteVector byteVector12 = byteVector6.putByte((int) (short) 100);
        org.mockito.asm.ByteVector byteVector14 = byteVector12.putInt(0);
        org.junit.Assert.assertNotNull(byteVector2);
        org.junit.Assert.assertNotNull(byteVector4);
        org.junit.Assert.assertNotNull(byteVector6);
        org.junit.Assert.assertNotNull(byteVector8);
        org.junit.Assert.assertNotNull(byteVector10);
        org.junit.Assert.assertNotNull(byteVector12);
        org.junit.Assert.assertNotNull(byteVector14);
    }

    @Test
    public void test1831() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1831");
        org.mockito.asm.ByteVector byteVector1 = new org.mockito.asm.ByteVector((int) (short) 1);
        org.mockito.asm.ByteVector byteVector3 = byteVector1.putLong((long) (byte) 1);
        org.mockito.asm.ByteVector byteVector5 = byteVector1.putUTF8("");
        org.mockito.asm.ByteVector byteVector7 = byteVector5.putInt((int) '#');
        org.mockito.asm.ByteVector byteVector9 = byteVector5.putByte(1);
        org.mockito.asm.ByteVector byteVector11 = byteVector5.putInt(100);
        org.mockito.asm.ByteVector byteVector13 = byteVector11.putShort((int) (short) 10);
        org.junit.Assert.assertNotNull(byteVector3);
        org.junit.Assert.assertNotNull(byteVector5);
        org.junit.Assert.assertNotNull(byteVector7);
        org.junit.Assert.assertNotNull(byteVector9);
        org.junit.Assert.assertNotNull(byteVector11);
        org.junit.Assert.assertNotNull(byteVector13);
    }

    @Test
    public void test1832() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1832");
        org.mockito.asm.ByteVector byteVector1 = new org.mockito.asm.ByteVector((int) (byte) 10);
        org.mockito.asm.ByteVector byteVector3 = byteVector1.putByte((int) '4');
        org.mockito.asm.ByteVector byteVector5 = byteVector1.putLong(0L);
        org.mockito.asm.ByteVector byteVector7 = byteVector5.putByte(10);
        org.mockito.asm.ByteVector byteVector9 = byteVector7.putShort(10);
        org.mockito.asm.ByteVector byteVector11 = byteVector9.putByte((int) 'a');
        java.lang.Class<?> wildcardClass12 = byteVector9.getClass();
        org.junit.Assert.assertNotNull(byteVector3);
        org.junit.Assert.assertNotNull(byteVector5);
        org.junit.Assert.assertNotNull(byteVector7);
        org.junit.Assert.assertNotNull(byteVector9);
        org.junit.Assert.assertNotNull(byteVector11);
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test1833() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1833");
        org.mockito.asm.ByteVector byteVector0 = new org.mockito.asm.ByteVector();
        org.mockito.asm.ByteVector byteVector2 = byteVector0.putUTF8("hi!");
        org.mockito.asm.ByteVector byteVector4 = byteVector0.putShort((int) (short) -1);
        org.mockito.asm.ByteVector byteVector6 = byteVector0.putLong(0L);
        org.mockito.asm.ByteVector byteVector8 = byteVector0.putShort((int) (byte) -1);
        org.mockito.asm.ByteVector byteVector10 = byteVector8.putByte((int) (byte) 0);
        org.mockito.asm.ByteVector byteVector12 = byteVector10.putByte(100);
        org.mockito.asm.ByteVector byteVector14 = byteVector10.putUTF8("hi!");
        org.mockito.asm.ByteVector byteVector16 = byteVector10.putLong((long) 1);
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
    public void test1834() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1834");
        org.mockito.asm.ByteVector byteVector1 = new org.mockito.asm.ByteVector((int) '#');
        org.mockito.asm.ByteVector byteVector3 = byteVector1.putLong(100L);
        org.mockito.asm.ByteVector byteVector5 = byteVector3.putLong(1L);
        org.mockito.asm.ByteVector byteVector7 = byteVector5.putUTF8("hi!");
        org.mockito.asm.ByteVector byteVector9 = byteVector7.putInt(10);
        org.mockito.asm.ByteVector byteVector11 = byteVector9.putLong((long) (short) -1);
        org.mockito.asm.ByteVector byteVector13 = byteVector11.putUTF8("hi!");
        org.mockito.asm.ByteVector byteVector15 = byteVector11.putByte((int) (short) 1);
        org.junit.Assert.assertNotNull(byteVector3);
        org.junit.Assert.assertNotNull(byteVector5);
        org.junit.Assert.assertNotNull(byteVector7);
        org.junit.Assert.assertNotNull(byteVector9);
        org.junit.Assert.assertNotNull(byteVector11);
        org.junit.Assert.assertNotNull(byteVector13);
        org.junit.Assert.assertNotNull(byteVector15);
    }

    @Test
    public void test1835() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1835");
        org.mockito.asm.ByteVector byteVector0 = new org.mockito.asm.ByteVector();
        org.mockito.asm.ByteVector byteVector2 = byteVector0.putUTF8("hi!");
        org.mockito.asm.ByteVector byteVector4 = byteVector2.putInt(0);
        org.mockito.asm.ByteVector byteVector6 = byteVector4.putByte((int) (short) 0);
        org.mockito.asm.ByteVector byteVector8 = byteVector4.putUTF8("");
        org.mockito.asm.ByteVector byteVector10 = byteVector4.putInt((int) ' ');
        org.mockito.asm.ByteVector byteVector12 = byteVector4.putByte((int) (byte) 100);
        org.mockito.asm.ByteVector byteVector14 = byteVector12.putByte((int) (byte) 100);
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
    public void test1836() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1836");
        org.mockito.asm.ByteVector byteVector1 = new org.mockito.asm.ByteVector((int) '#');
        org.mockito.asm.ByteVector byteVector3 = byteVector1.putLong(100L);
        org.mockito.asm.ByteVector byteVector5 = byteVector3.putLong(1L);
        org.mockito.asm.ByteVector byteVector7 = byteVector5.putUTF8("hi!");
        org.mockito.asm.ByteVector byteVector9 = byteVector5.putUTF8("hi!");
        org.mockito.asm.ByteVector byteVector11 = byteVector9.putByte(10);
        org.mockito.asm.ByteVector byteVector13 = byteVector11.putInt(0);
        org.mockito.asm.ByteVector byteVector15 = byteVector13.putShort((int) '#');
        org.junit.Assert.assertNotNull(byteVector3);
        org.junit.Assert.assertNotNull(byteVector5);
        org.junit.Assert.assertNotNull(byteVector7);
        org.junit.Assert.assertNotNull(byteVector9);
        org.junit.Assert.assertNotNull(byteVector11);
        org.junit.Assert.assertNotNull(byteVector13);
        org.junit.Assert.assertNotNull(byteVector15);
    }

    @Test
    public void test1837() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1837");
        org.mockito.asm.ByteVector byteVector0 = new org.mockito.asm.ByteVector();
        org.mockito.asm.ByteVector byteVector2 = byteVector0.putUTF8("hi!");
        org.mockito.asm.ByteVector byteVector4 = byteVector2.putLong((long) (byte) 10);
        org.mockito.asm.ByteVector byteVector6 = byteVector4.putUTF8("hi!");
        org.mockito.asm.ByteVector byteVector8 = byteVector4.putLong((-1L));
        org.mockito.asm.ByteVector byteVector10 = byteVector8.putInt(10);
        org.mockito.asm.ByteVector byteVector12 = byteVector8.putShort((int) (byte) 0);
        org.mockito.asm.ByteVector byteVector14 = byteVector8.putShort((int) 'a');
        org.mockito.asm.ByteVector byteVector16 = byteVector14.putByte((int) (short) 10);
        org.mockito.asm.ByteVector byteVector18 = byteVector16.putInt((int) '#');
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
    public void test1838() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1838");
        org.mockito.asm.ByteVector byteVector1 = new org.mockito.asm.ByteVector((int) '#');
        org.mockito.asm.ByteVector byteVector3 = byteVector1.putLong(100L);
        org.mockito.asm.ByteVector byteVector5 = byteVector1.putUTF8("");
        org.mockito.asm.ByteVector byteVector7 = byteVector5.putInt((int) (byte) 10);
        org.mockito.asm.ByteVector byteVector9 = byteVector7.putByte(0);
        org.mockito.asm.ByteVector byteVector11 = byteVector7.putLong((long) '4');
        org.junit.Assert.assertNotNull(byteVector3);
        org.junit.Assert.assertNotNull(byteVector5);
        org.junit.Assert.assertNotNull(byteVector7);
        org.junit.Assert.assertNotNull(byteVector9);
        org.junit.Assert.assertNotNull(byteVector11);
    }

    @Test
    public void test1839() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1839");
        org.mockito.asm.ByteVector byteVector1 = new org.mockito.asm.ByteVector((int) (byte) 10);
        org.mockito.asm.ByteVector byteVector3 = byteVector1.putByte((int) '4');
        org.mockito.asm.ByteVector byteVector5 = byteVector1.putLong((long) 'a');
        org.mockito.asm.ByteVector byteVector7 = byteVector1.putUTF8("");
        org.mockito.asm.ByteVector byteVector9 = byteVector1.putUTF8("");
        org.mockito.asm.ByteVector byteVector11 = byteVector9.putShort((int) (short) -1);
        org.mockito.asm.ByteVector byteVector12 = new org.mockito.asm.ByteVector();
        org.mockito.asm.ByteVector byteVector14 = byteVector12.putUTF8("hi!");
        org.mockito.asm.ByteVector byteVector16 = byteVector14.putInt(0);
        org.mockito.asm.ByteVector byteVector18 = byteVector16.putByte((int) (short) 0);
        org.mockito.asm.ByteVector byteVector20 = byteVector16.putUTF8("");
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
        org.mockito.asm.ByteVector byteVector57 = byteVector16.putByteArray(byteArray48, (int) (short) 0, 0);
        org.mockito.asm.ByteVector byteVector60 = byteVector11.putByteArray(byteArray48, (int) (byte) 1, 0);
        org.mockito.asm.ByteVector byteVector62 = byteVector60.putByte(100);
        org.junit.Assert.assertNotNull(byteVector3);
        org.junit.Assert.assertNotNull(byteVector5);
        org.junit.Assert.assertNotNull(byteVector7);
        org.junit.Assert.assertNotNull(byteVector9);
        org.junit.Assert.assertNotNull(byteVector11);
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
        org.junit.Assert.assertNotNull(byteVector57);
        org.junit.Assert.assertNotNull(byteVector60);
        org.junit.Assert.assertNotNull(byteVector62);
    }

    @Test
    public void test1840() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1840");
        org.mockito.asm.ByteVector byteVector0 = new org.mockito.asm.ByteVector();
        org.mockito.asm.ByteVector byteVector2 = byteVector0.putUTF8("hi!");
        org.mockito.asm.ByteVector byteVector4 = byteVector0.putShort((int) (short) -1);
        org.mockito.asm.ByteVector byteVector6 = byteVector4.putLong(1L);
        java.lang.Class<?> wildcardClass7 = byteVector4.getClass();
        org.junit.Assert.assertNotNull(byteVector2);
        org.junit.Assert.assertNotNull(byteVector4);
        org.junit.Assert.assertNotNull(byteVector6);
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test1841() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1841");
        org.mockito.asm.ByteVector byteVector1 = new org.mockito.asm.ByteVector((int) (short) 1);
        org.mockito.asm.ByteVector byteVector3 = byteVector1.putLong((long) (byte) 1);
        org.mockito.asm.ByteVector byteVector5 = byteVector3.putShort((int) '#');
        org.mockito.asm.ByteVector byteVector7 = byteVector3.putByte((int) 'a');
        org.junit.Assert.assertNotNull(byteVector3);
        org.junit.Assert.assertNotNull(byteVector5);
        org.junit.Assert.assertNotNull(byteVector7);
    }

    @Test
    public void test1842() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1842");
        org.mockito.asm.ByteVector byteVector0 = new org.mockito.asm.ByteVector();
        org.mockito.asm.ByteVector byteVector2 = byteVector0.putUTF8("hi!");
        org.mockito.asm.ByteVector byteVector4 = byteVector0.putShort((int) (short) -1);
        org.mockito.asm.ByteVector byteVector6 = byteVector0.putInt(0);
        org.mockito.asm.ByteVector byteVector8 = byteVector0.putUTF8("hi!");
        org.mockito.asm.ByteVector byteVector10 = byteVector0.putByte(100);
        org.mockito.asm.ByteVector byteVector12 = byteVector10.putUTF8("hi!");
        org.mockito.asm.ByteVector byteVector14 = byteVector10.putUTF8("hi!");
        org.mockito.asm.ByteVector byteVector16 = byteVector14.putShort((int) 'a');
        org.mockito.asm.ByteVector byteVector18 = byteVector14.putByte(0);
        org.mockito.asm.ByteVector byteVector20 = byteVector18.putByte((int) (byte) 100);
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
        // The following exception was thrown during execution in test generation
        try {
            org.mockito.asm.ByteVector byteVector61 = byteVector20.putByteArray(byteArray52, (int) (byte) 1, (-1));
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
        org.junit.Assert.assertNotNull(byteArray52);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray52), "[0, 10, 1]");
        org.junit.Assert.assertNotNull(byteVector55);
        org.junit.Assert.assertNotNull(byteVector58);
    }

    @Test
    public void test1843() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1843");
        org.mockito.asm.ByteVector byteVector0 = new org.mockito.asm.ByteVector();
        org.mockito.asm.ByteVector byteVector2 = byteVector0.putUTF8("hi!");
        org.mockito.asm.ByteVector byteVector4 = byteVector0.putShort((int) (short) -1);
        org.mockito.asm.ByteVector byteVector6 = byteVector0.putLong(0L);
        org.mockito.asm.ByteVector byteVector8 = byteVector0.putShort((int) (byte) -1);
        org.mockito.asm.ByteVector byteVector10 = byteVector8.putByte((int) (byte) 0);
        org.mockito.asm.ByteVector byteVector12 = byteVector10.putByte(100);
        org.mockito.asm.ByteVector byteVector14 = byteVector12.putByte(1);
        org.mockito.asm.ByteVector byteVector16 = byteVector12.putInt((int) (short) 1);
        org.mockito.asm.ByteVector byteVector18 = byteVector12.putUTF8("");
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
    public void test1844() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1844");
        org.mockito.asm.ByteVector byteVector0 = new org.mockito.asm.ByteVector();
        org.mockito.asm.ByteVector byteVector2 = byteVector0.putUTF8("hi!");
        org.mockito.asm.ByteVector byteVector4 = byteVector0.putShort((int) (short) 100);
        org.mockito.asm.ByteVector byteVector6 = byteVector4.putUTF8("hi!");
        org.mockito.asm.ByteVector byteVector8 = byteVector6.putByte((int) '4');
        org.mockito.asm.ByteVector byteVector10 = byteVector6.putShort(1);
        org.mockito.asm.ByteVector byteVector12 = byteVector10.putLong(0L);
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
    public void test1845() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1845");
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
        java.lang.Class<?> wildcardClass29 = byteVector24.getClass();
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
    public void test1846() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1846");
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
        org.mockito.asm.ByteVector byteVector75 = byteVector73.putByte((int) (short) 10);
        org.mockito.asm.ByteVector byteVector77 = byteVector73.putLong((long) (short) 10);
        java.lang.Class<?> wildcardClass78 = byteVector77.getClass();
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
        org.junit.Assert.assertNotNull(byteVector77);
        org.junit.Assert.assertNotNull(wildcardClass78);
    }

    @Test
    public void test1847() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1847");
        org.mockito.asm.ByteVector byteVector1 = new org.mockito.asm.ByteVector((int) '#');
        org.mockito.asm.ByteVector byteVector3 = byteVector1.putLong(100L);
        org.mockito.asm.ByteVector byteVector5 = byteVector1.putUTF8("");
        org.mockito.asm.ByteVector byteVector7 = byteVector1.putUTF8("hi!");
        org.mockito.asm.ByteVector byteVector9 = byteVector7.putLong((long) (short) 0);
        org.mockito.asm.ByteVector byteVector11 = byteVector7.putLong((long) (byte) -1);
        org.mockito.asm.ByteVector byteVector13 = byteVector7.putLong((long) 0);
        org.mockito.asm.ByteVector byteVector15 = byteVector7.putShort(100);
        org.mockito.asm.ByteVector byteVector17 = byteVector7.putInt(0);
        java.lang.Class<?> wildcardClass18 = byteVector7.getClass();
        org.junit.Assert.assertNotNull(byteVector3);
        org.junit.Assert.assertNotNull(byteVector5);
        org.junit.Assert.assertNotNull(byteVector7);
        org.junit.Assert.assertNotNull(byteVector9);
        org.junit.Assert.assertNotNull(byteVector11);
        org.junit.Assert.assertNotNull(byteVector13);
        org.junit.Assert.assertNotNull(byteVector15);
        org.junit.Assert.assertNotNull(byteVector17);
        org.junit.Assert.assertNotNull(wildcardClass18);
    }

    @Test
    public void test1848() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1848");
        org.mockito.asm.ByteVector byteVector1 = new org.mockito.asm.ByteVector((int) (byte) 10);
        org.mockito.asm.ByteVector byteVector3 = byteVector1.putByte((int) '4');
        org.mockito.asm.ByteVector byteVector5 = byteVector1.putLong(0L);
        org.mockito.asm.ByteVector byteVector7 = byteVector5.putByte(10);
        org.mockito.asm.ByteVector byteVector9 = byteVector5.putUTF8("hi!");
        org.mockito.asm.ByteVector byteVector11 = byteVector9.putLong((long) (byte) 0);
        org.mockito.asm.ByteVector byteVector13 = byteVector11.putInt((int) ' ');
        org.mockito.asm.ByteVector byteVector15 = byteVector13.putInt(0);
        org.junit.Assert.assertNotNull(byteVector3);
        org.junit.Assert.assertNotNull(byteVector5);
        org.junit.Assert.assertNotNull(byteVector7);
        org.junit.Assert.assertNotNull(byteVector9);
        org.junit.Assert.assertNotNull(byteVector11);
        org.junit.Assert.assertNotNull(byteVector13);
        org.junit.Assert.assertNotNull(byteVector15);
    }

    @Test
    public void test1849() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1849");
        org.mockito.asm.ByteVector byteVector1 = new org.mockito.asm.ByteVector((int) (byte) 10);
        org.mockito.asm.ByteVector byteVector3 = byteVector1.putByte((int) '4');
        org.mockito.asm.ByteVector byteVector5 = byteVector1.putLong(0L);
        org.mockito.asm.ByteVector byteVector7 = byteVector5.putLong((long) (short) 100);
        org.mockito.asm.ByteVector byteVector9 = byteVector7.putByte(1);
        java.lang.Class<?> wildcardClass10 = byteVector7.getClass();
        org.junit.Assert.assertNotNull(byteVector3);
        org.junit.Assert.assertNotNull(byteVector5);
        org.junit.Assert.assertNotNull(byteVector7);
        org.junit.Assert.assertNotNull(byteVector9);
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test1850() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1850");
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
        org.mockito.asm.ByteVector byteVector24 = byteVector22.putInt((int) ' ');
        org.mockito.asm.ByteVector byteVector26 = byteVector24.putLong((long) (short) 0);
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
    public void test1851() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1851");
        org.mockito.asm.ByteVector byteVector0 = new org.mockito.asm.ByteVector();
        org.mockito.asm.ByteVector byteVector2 = byteVector0.putUTF8("hi!");
        org.mockito.asm.ByteVector byteVector4 = byteVector2.putInt((int) (byte) 10);
        org.mockito.asm.ByteVector byteVector6 = byteVector2.putLong((long) 10);
        org.mockito.asm.ByteVector byteVector8 = byteVector2.putByte((int) (short) -1);
        org.mockito.asm.ByteVector byteVector10 = byteVector8.putShort((int) (byte) 10);
        java.lang.Class<?> wildcardClass11 = byteVector10.getClass();
        org.junit.Assert.assertNotNull(byteVector2);
        org.junit.Assert.assertNotNull(byteVector4);
        org.junit.Assert.assertNotNull(byteVector6);
        org.junit.Assert.assertNotNull(byteVector8);
        org.junit.Assert.assertNotNull(byteVector10);
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test1852() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1852");
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
        org.mockito.asm.ByteVector byteVector26 = byteVector16.putUTF8("");
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
    public void test1853() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1853");
        org.mockito.asm.ByteVector byteVector0 = new org.mockito.asm.ByteVector();
        org.mockito.asm.ByteVector byteVector2 = byteVector0.putUTF8("hi!");
        org.mockito.asm.ByteVector byteVector4 = byteVector0.putInt(0);
        org.mockito.asm.ByteVector byteVector6 = byteVector0.putShort(10);
        org.mockito.asm.ByteVector byteVector8 = byteVector6.putLong((long) '4');
        org.mockito.asm.ByteVector byteVector10 = byteVector6.putShort((int) ' ');
        org.mockito.asm.ByteVector byteVector12 = byteVector6.putInt((int) (byte) -1);
        org.mockito.asm.ByteVector byteVector14 = byteVector6.putShort((int) (byte) -1);
        org.mockito.asm.ByteVector byteVector16 = byteVector14.putInt(100);
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
    public void test1854() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1854");
        org.mockito.asm.ByteVector byteVector0 = new org.mockito.asm.ByteVector();
        org.mockito.asm.ByteVector byteVector2 = byteVector0.putUTF8("hi!");
        org.mockito.asm.ByteVector byteVector4 = byteVector0.putShort((int) (short) -1);
        org.mockito.asm.ByteVector byteVector6 = byteVector0.putInt(0);
        org.mockito.asm.ByteVector byteVector8 = byteVector0.putUTF8("hi!");
        org.mockito.asm.ByteVector byteVector10 = byteVector0.putUTF8("hi!");
        org.mockito.asm.ByteVector byteVector12 = byteVector10.putShort((int) (byte) 10);
        org.mockito.asm.ByteVector byteVector14 = byteVector12.putByte((int) (short) 100);
        org.junit.Assert.assertNotNull(byteVector2);
        org.junit.Assert.assertNotNull(byteVector4);
        org.junit.Assert.assertNotNull(byteVector6);
        org.junit.Assert.assertNotNull(byteVector8);
        org.junit.Assert.assertNotNull(byteVector10);
        org.junit.Assert.assertNotNull(byteVector12);
        org.junit.Assert.assertNotNull(byteVector14);
    }

    @Test
    public void test1855() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1855");
        org.mockito.asm.ByteVector byteVector0 = new org.mockito.asm.ByteVector();
        org.mockito.asm.ByteVector byteVector2 = byteVector0.putUTF8("hi!");
        org.mockito.asm.ByteVector byteVector4 = byteVector2.putInt(0);
        org.mockito.asm.ByteVector byteVector6 = byteVector4.putByte((int) (byte) 1);
        org.mockito.asm.ByteVector byteVector8 = byteVector6.putUTF8("hi!");
        org.mockito.asm.ByteVector byteVector10 = byteVector6.putByte((int) (short) 0);
        org.mockito.asm.ByteVector byteVector12 = byteVector6.putUTF8("");
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
    public void test1856() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1856");
        org.mockito.asm.ByteVector byteVector1 = new org.mockito.asm.ByteVector((int) '#');
        org.mockito.asm.ByteVector byteVector3 = byteVector1.putLong(100L);
        org.mockito.asm.ByteVector byteVector5 = byteVector3.putLong(1L);
        org.mockito.asm.ByteVector byteVector7 = byteVector5.putUTF8("hi!");
        org.mockito.asm.ByteVector byteVector9 = byteVector7.putUTF8("");
        org.mockito.asm.ByteVector byteVector11 = byteVector7.putInt((int) (short) 100);
        org.mockito.asm.ByteVector byteVector13 = byteVector11.putByte((int) (byte) 100);
        org.mockito.asm.ByteVector byteVector15 = byteVector11.putInt((int) (short) -1);
        org.mockito.asm.ByteVector byteVector17 = byteVector15.putUTF8("hi!");
        org.mockito.asm.ByteVector byteVector19 = byteVector15.putInt(1);
        org.mockito.asm.ByteVector byteVector21 = byteVector15.putInt((int) (short) -1);
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
    }

    @Test
    public void test1857() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1857");
        org.mockito.asm.ByteVector byteVector0 = new org.mockito.asm.ByteVector();
        org.mockito.asm.ByteVector byteVector2 = byteVector0.putUTF8("hi!");
        org.mockito.asm.ByteVector byteVector4 = byteVector2.putInt((int) (byte) 10);
        org.mockito.asm.ByteVector byteVector6 = byteVector4.putUTF8("");
        org.mockito.asm.ByteVector byteVector8 = byteVector6.putUTF8("hi!");
        org.mockito.asm.ByteVector byteVector10 = byteVector6.putInt((int) (byte) 1);
        org.mockito.asm.ByteVector byteVector12 = byteVector6.putUTF8("");
        org.mockito.asm.ByteVector byteVector14 = byteVector6.putInt(1);
        org.mockito.asm.ByteVector byteVector16 = byteVector6.putUTF8("");
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
    public void test1858() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1858");
        org.mockito.asm.ByteVector byteVector1 = new org.mockito.asm.ByteVector((int) '#');
        org.mockito.asm.ByteVector byteVector3 = byteVector1.putLong(100L);
        org.mockito.asm.ByteVector byteVector5 = byteVector3.putLong(1L);
        org.mockito.asm.ByteVector byteVector7 = byteVector5.putUTF8("hi!");
        org.mockito.asm.ByteVector byteVector9 = byteVector5.putLong((long) (byte) 1);
        org.mockito.asm.ByteVector byteVector11 = byteVector9.putByte(0);
        org.mockito.asm.ByteVector byteVector13 = byteVector11.putInt((int) (byte) 10);
        org.junit.Assert.assertNotNull(byteVector3);
        org.junit.Assert.assertNotNull(byteVector5);
        org.junit.Assert.assertNotNull(byteVector7);
        org.junit.Assert.assertNotNull(byteVector9);
        org.junit.Assert.assertNotNull(byteVector11);
        org.junit.Assert.assertNotNull(byteVector13);
    }

    @Test
    public void test1859() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1859");
        org.mockito.asm.ByteVector byteVector0 = new org.mockito.asm.ByteVector();
        org.mockito.asm.ByteVector byteVector2 = byteVector0.putUTF8("hi!");
        org.mockito.asm.ByteVector byteVector4 = byteVector0.putShort((int) (short) 100);
        org.mockito.asm.ByteVector byteVector6 = byteVector4.putLong((long) (byte) -1);
        org.mockito.asm.ByteVector byteVector8 = byteVector6.putByte((int) (byte) 0);
        org.mockito.asm.ByteVector byteVector10 = byteVector6.putShort((int) ' ');
        org.mockito.asm.ByteVector byteVector12 = byteVector6.putInt((int) (short) 1);
        org.mockito.asm.ByteVector byteVector13 = new org.mockito.asm.ByteVector();
        org.mockito.asm.ByteVector byteVector15 = byteVector13.putUTF8("hi!");
        org.mockito.asm.ByteVector byteVector17 = byteVector13.putLong((long) ' ');
        org.mockito.asm.ByteVector byteVector19 = byteVector17.putByte((int) 'a');
        org.mockito.asm.ByteVector byteVector21 = byteVector17.putByte((int) (short) -1);
        org.mockito.asm.ByteVector byteVector23 = byteVector17.putLong(0L);
        org.mockito.asm.ByteVector byteVector25 = new org.mockito.asm.ByteVector((int) '#');
        org.mockito.asm.ByteVector byteVector27 = byteVector25.putInt(100);
        org.mockito.asm.ByteVector byteVector29 = byteVector25.putUTF8("");
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
        org.mockito.asm.ByteVector byteVector78 = byteVector29.putByteArray(byteArray66, (int) (byte) 0, (int) (short) 1);
        org.mockito.asm.ByteVector byteVector81 = byteVector23.putByteArray(byteArray66, 0, (int) (byte) 0);
        // The following exception was thrown during execution in test generation
        try {
            org.mockito.asm.ByteVector byteVector84 = byteVector6.putByteArray(byteArray66, (int) '#', (int) (byte) 10);
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
        org.junit.Assert.assertNotNull(byteVector81);
    }

    @Test
    public void test1860() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1860");
        org.mockito.asm.ByteVector byteVector0 = new org.mockito.asm.ByteVector();
        org.mockito.asm.ByteVector byteVector2 = byteVector0.putUTF8("hi!");
        org.mockito.asm.ByteVector byteVector4 = byteVector2.putInt(0);
        org.mockito.asm.ByteVector byteVector6 = byteVector2.putShort((int) (byte) 10);
        org.mockito.asm.ByteVector byteVector8 = byteVector2.putUTF8("");
        org.mockito.asm.ByteVector byteVector10 = byteVector2.putUTF8("hi!");
        org.mockito.asm.ByteVector byteVector12 = byteVector2.putByte((int) 'a');
        org.mockito.asm.ByteVector byteVector14 = byteVector2.putLong((long) (short) 1);
        org.mockito.asm.ByteVector byteVector16 = byteVector14.putUTF8("hi!");
        org.mockito.asm.ByteVector byteVector18 = byteVector14.putInt(0);
        org.mockito.asm.ByteVector byteVector20 = byteVector14.putByte((int) (byte) 1);
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
    public void test1861() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1861");
        org.mockito.asm.ByteVector byteVector0 = new org.mockito.asm.ByteVector();
        org.mockito.asm.ByteVector byteVector2 = byteVector0.putUTF8("hi!");
        org.mockito.asm.ByteVector byteVector4 = byteVector0.putShort((int) (short) -1);
        org.mockito.asm.ByteVector byteVector6 = byteVector0.putByte((int) ' ');
        org.mockito.asm.ByteVector byteVector8 = byteVector0.putLong((long) (byte) 0);
        org.mockito.asm.ByteVector byteVector10 = byteVector8.putInt((int) (short) 0);
        org.junit.Assert.assertNotNull(byteVector2);
        org.junit.Assert.assertNotNull(byteVector4);
        org.junit.Assert.assertNotNull(byteVector6);
        org.junit.Assert.assertNotNull(byteVector8);
        org.junit.Assert.assertNotNull(byteVector10);
    }

    @Test
    public void test1862() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1862");
        org.mockito.asm.ByteVector byteVector0 = new org.mockito.asm.ByteVector();
        org.mockito.asm.ByteVector byteVector2 = byteVector0.putUTF8("hi!");
        org.mockito.asm.ByteVector byteVector4 = byteVector0.putShort((int) (short) 100);
        org.mockito.asm.ByteVector byteVector6 = byteVector4.putLong((long) (byte) -1);
        org.mockito.asm.ByteVector byteVector8 = byteVector4.putByte((int) (byte) 10);
        org.mockito.asm.ByteVector byteVector10 = byteVector8.putUTF8("");
        org.mockito.asm.ByteVector byteVector12 = byteVector10.putInt((int) '4');
        org.mockito.asm.ByteVector byteVector14 = byteVector12.putByte((int) (byte) 0);
        org.mockito.asm.ByteVector byteVector16 = byteVector14.putInt(100);
        org.mockito.asm.ByteVector byteVector18 = byteVector14.putByte((int) (short) 0);
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
    public void test1863() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1863");
        org.mockito.asm.ByteVector byteVector0 = new org.mockito.asm.ByteVector();
        org.mockito.asm.ByteVector byteVector2 = byteVector0.putUTF8("hi!");
        org.mockito.asm.ByteVector byteVector4 = byteVector2.putLong((long) (byte) 10);
        org.mockito.asm.ByteVector byteVector6 = byteVector4.putInt((int) 'a');
        org.mockito.asm.ByteVector byteVector8 = byteVector6.putUTF8("");
        org.junit.Assert.assertNotNull(byteVector2);
        org.junit.Assert.assertNotNull(byteVector4);
        org.junit.Assert.assertNotNull(byteVector6);
        org.junit.Assert.assertNotNull(byteVector8);
    }

    @Test
    public void test1864() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1864");
        org.mockito.asm.ByteVector byteVector0 = new org.mockito.asm.ByteVector();
        org.mockito.asm.ByteVector byteVector2 = byteVector0.putUTF8("hi!");
        org.mockito.asm.ByteVector byteVector4 = byteVector2.putLong((long) (byte) 10);
        org.mockito.asm.ByteVector byteVector6 = byteVector4.putUTF8("hi!");
        org.mockito.asm.ByteVector byteVector8 = byteVector4.putLong((long) 10);
        org.mockito.asm.ByteVector byteVector10 = byteVector8.putUTF8("");
        org.mockito.asm.ByteVector byteVector12 = byteVector8.putLong(10L);
        org.mockito.asm.ByteVector byteVector14 = byteVector12.putLong((long) ' ');
        org.mockito.asm.ByteVector byteVector16 = byteVector14.putByte((int) (short) -1);
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
    public void test1865() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1865");
        org.mockito.asm.ByteVector byteVector0 = new org.mockito.asm.ByteVector();
        org.mockito.asm.ByteVector byteVector2 = byteVector0.putUTF8("hi!");
        org.mockito.asm.ByteVector byteVector4 = byteVector0.putInt(0);
        org.mockito.asm.ByteVector byteVector6 = byteVector0.putShort((int) '4');
        org.mockito.asm.ByteVector byteVector8 = byteVector0.putByte(100);
        org.mockito.asm.ByteVector byteVector10 = byteVector8.putInt((int) (byte) 10);
        org.mockito.asm.ByteVector byteVector12 = byteVector10.putByte((int) (byte) 1);
        org.mockito.asm.ByteVector byteVector14 = byteVector10.putUTF8("hi!");
        org.mockito.asm.ByteVector byteVector16 = byteVector14.putByte((int) (byte) 0);
        org.mockito.asm.ByteVector byteVector18 = byteVector16.putShort((int) ' ');
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
    public void test1866() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1866");
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
        org.mockito.asm.ByteVector byteVector20 = byteVector18.putUTF8("");
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
    public void test1867() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1867");
        org.mockito.asm.ByteVector byteVector0 = new org.mockito.asm.ByteVector();
        org.mockito.asm.ByteVector byteVector2 = byteVector0.putUTF8("hi!");
        org.mockito.asm.ByteVector byteVector4 = byteVector0.putInt(0);
        org.mockito.asm.ByteVector byteVector6 = byteVector0.putShort((int) '4');
        org.mockito.asm.ByteVector byteVector8 = byteVector0.putByte(100);
        org.mockito.asm.ByteVector byteVector10 = byteVector8.putInt((int) (byte) 10);
        org.mockito.asm.ByteVector byteVector12 = byteVector8.putInt((int) (byte) 10);
        org.mockito.asm.ByteVector byteVector14 = byteVector12.putByte(100);
        org.mockito.asm.ByteVector byteVector16 = byteVector14.putInt((int) '#');
        org.mockito.asm.ByteVector byteVector18 = byteVector14.putByte((int) (short) 10);
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
    public void test1868() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1868");
        org.mockito.asm.ByteVector byteVector0 = new org.mockito.asm.ByteVector();
        org.mockito.asm.ByteVector byteVector2 = byteVector0.putUTF8("hi!");
        org.mockito.asm.ByteVector byteVector4 = byteVector2.putByte(100);
        org.mockito.asm.ByteVector byteVector6 = byteVector2.putShort((int) 'a');
        org.mockito.asm.ByteVector byteVector8 = byteVector6.putByte((int) (short) 1);
        org.mockito.asm.ByteVector byteVector10 = byteVector8.putInt(0);
        org.mockito.asm.ByteVector byteVector12 = byteVector10.putByte(0);
        org.junit.Assert.assertNotNull(byteVector2);
        org.junit.Assert.assertNotNull(byteVector4);
        org.junit.Assert.assertNotNull(byteVector6);
        org.junit.Assert.assertNotNull(byteVector8);
        org.junit.Assert.assertNotNull(byteVector10);
        org.junit.Assert.assertNotNull(byteVector12);
    }

    @Test
    public void test1869() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1869");
        org.mockito.asm.ByteVector byteVector0 = new org.mockito.asm.ByteVector();
        org.mockito.asm.ByteVector byteVector2 = byteVector0.putUTF8("hi!");
        org.mockito.asm.ByteVector byteVector4 = byteVector2.putInt(0);
        org.mockito.asm.ByteVector byteVector6 = byteVector2.putByte((int) (byte) 10);
        org.mockito.asm.ByteVector byteVector8 = byteVector6.putLong((-1L));
        org.mockito.asm.ByteVector byteVector10 = byteVector6.putInt((int) (byte) 100);
        org.mockito.asm.ByteVector byteVector12 = byteVector6.putUTF8("hi!");
        org.mockito.asm.ByteVector byteVector14 = byteVector12.putUTF8("hi!");
        org.mockito.asm.ByteVector byteVector16 = byteVector12.putShort((int) (short) 10);
        org.mockito.asm.ByteVector byteVector18 = byteVector12.putInt((int) (byte) -1);
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
    public void test1870() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1870");
        org.mockito.asm.ByteVector byteVector0 = new org.mockito.asm.ByteVector();
        org.mockito.asm.ByteVector byteVector2 = byteVector0.putUTF8("hi!");
        org.mockito.asm.ByteVector byteVector4 = byteVector0.putShort((int) (short) -1);
        org.mockito.asm.ByteVector byteVector6 = byteVector0.putInt((int) (byte) 10);
        org.mockito.asm.ByteVector byteVector8 = byteVector6.putUTF8("hi!");
        org.mockito.asm.ByteVector byteVector10 = byteVector8.putByte((int) (byte) 1);
        org.mockito.asm.ByteVector byteVector12 = byteVector10.putUTF8("hi!");
        org.mockito.asm.ByteVector byteVector14 = byteVector10.putInt(0);
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
    public void test1871() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1871");
        org.mockito.asm.ByteVector byteVector0 = new org.mockito.asm.ByteVector();
        org.mockito.asm.ByteVector byteVector2 = byteVector0.putUTF8("hi!");
        org.mockito.asm.ByteVector byteVector4 = byteVector2.putInt((int) (byte) 10);
        org.mockito.asm.ByteVector byteVector6 = byteVector4.putUTF8("");
        org.mockito.asm.ByteVector byteVector8 = byteVector6.putUTF8("hi!");
        org.mockito.asm.ByteVector byteVector10 = byteVector6.putShort(0);
        org.mockito.asm.ByteVector byteVector12 = byteVector6.putInt((-1));
        org.mockito.asm.ByteVector byteVector14 = byteVector12.putLong((long) (byte) -1);
        org.mockito.asm.ByteVector byteVector16 = byteVector14.putLong((long) ' ');
        org.mockito.asm.ByteVector byteVector18 = byteVector14.putLong((long) (short) -1);
        org.mockito.asm.ByteVector byteVector20 = byteVector14.putInt(1);
        org.mockito.asm.ByteVector byteVector22 = byteVector20.putLong((long) 100);
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
    public void test1872() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1872");
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
        org.mockito.asm.ByteVector byteVector22 = byteVector14.putLong((long) '4');
        java.lang.Class<?> wildcardClass23 = byteVector14.getClass();
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
    public void test1873() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1873");
        org.mockito.asm.ByteVector byteVector0 = new org.mockito.asm.ByteVector();
        org.mockito.asm.ByteVector byteVector2 = byteVector0.putUTF8("hi!");
        org.mockito.asm.ByteVector byteVector4 = byteVector0.putShort((int) (short) 100);
        org.mockito.asm.ByteVector byteVector6 = byteVector4.putUTF8("hi!");
        org.mockito.asm.ByteVector byteVector8 = byteVector6.putByte((int) '4');
        org.mockito.asm.ByteVector byteVector10 = byteVector6.putShort(1);
        org.mockito.asm.ByteVector byteVector12 = byteVector10.putInt(10);
        org.mockito.asm.ByteVector byteVector14 = byteVector12.putShort(10);
        org.mockito.asm.ByteVector byteVector16 = byteVector12.putInt((int) (byte) -1);
        org.mockito.asm.ByteVector byteVector18 = byteVector12.putByte((int) (byte) 1);
        org.mockito.asm.ByteVector byteVector20 = byteVector18.putByte((int) (short) 10);
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
    public void test1874() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1874");
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
        org.mockito.asm.ByteVector byteVector20 = byteVector14.putUTF8("hi!");
        org.mockito.asm.ByteVector byteVector22 = byteVector20.putByte((-1));
        org.mockito.asm.ByteVector byteVector24 = byteVector20.putUTF8("hi!");
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
    public void test1875() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1875");
        org.mockito.asm.ByteVector byteVector0 = new org.mockito.asm.ByteVector();
        org.mockito.asm.ByteVector byteVector2 = byteVector0.putUTF8("hi!");
        org.mockito.asm.ByteVector byteVector4 = byteVector2.putLong((long) (byte) 10);
        org.mockito.asm.ByteVector byteVector6 = byteVector2.putInt((int) (short) 1);
        org.mockito.asm.ByteVector byteVector8 = byteVector2.putLong((long) (short) 10);
        org.mockito.asm.ByteVector byteVector10 = byteVector2.putShort(10);
        org.mockito.asm.ByteVector byteVector12 = byteVector10.putInt((int) (byte) 0);
        org.mockito.asm.ByteVector byteVector14 = byteVector10.putInt((int) (short) 1);
        org.mockito.asm.ByteVector byteVector16 = byteVector10.putShort((int) (byte) 1);
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
    public void test1876() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1876");
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
        org.mockito.asm.ByteVector byteVector26 = byteVector22.putByte((int) (byte) 0);
        org.mockito.asm.ByteVector byteVector28 = byteVector26.putUTF8("");
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
    public void test1877() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1877");
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
        org.mockito.asm.ByteVector byteVector30 = byteVector26.putInt(10);
        java.lang.Class<?> wildcardClass31 = byteVector30.getClass();
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
        org.junit.Assert.assertNotNull(wildcardClass31);
    }

    @Test
    public void test1878() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1878");
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
        org.mockito.asm.ByteVector byteVector70 = byteVector12.putByte((int) (byte) 100);
        org.mockito.asm.ByteVector byteVector72 = byteVector70.putByte((int) 'a');
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
        org.junit.Assert.assertNotNull(byteVector72);
    }

    @Test
    public void test1879() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1879");
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
        org.mockito.asm.ByteVector byteVector20 = byteVector14.putInt(10);
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
    public void test1880() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1880");
        org.mockito.asm.ByteVector byteVector0 = new org.mockito.asm.ByteVector();
        org.mockito.asm.ByteVector byteVector2 = byteVector0.putUTF8("hi!");
        org.mockito.asm.ByteVector byteVector4 = byteVector0.putLong((long) ' ');
        org.mockito.asm.ByteVector byteVector6 = byteVector4.putByte((int) 'a');
        org.mockito.asm.ByteVector byteVector8 = byteVector6.putByte((int) (short) -1);
        org.mockito.asm.ByteVector byteVector10 = byteVector8.putLong((long) (byte) -1);
        org.mockito.asm.ByteVector byteVector12 = byteVector10.putInt((int) '4');
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
    public void test1881() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1881");
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
        java.lang.Class<?> wildcardClass27 = byteVector20.getClass();
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
        org.junit.Assert.assertNotNull(wildcardClass27);
    }

    @Test
    public void test1882() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1882");
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
        org.mockito.asm.ByteVector byteVector20 = byteVector18.putShort((int) '4');
        org.mockito.asm.ByteVector byteVector22 = byteVector18.putLong((long) '4');
        org.mockito.asm.ByteVector byteVector24 = byteVector22.putInt((int) (byte) 100);
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
    public void test1883() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1883");
        org.mockito.asm.ByteVector byteVector1 = new org.mockito.asm.ByteVector((int) (byte) 10);
        org.mockito.asm.ByteVector byteVector3 = byteVector1.putByte((int) '4');
        org.mockito.asm.ByteVector byteVector5 = byteVector1.putLong(0L);
        org.mockito.asm.ByteVector byteVector7 = byteVector5.putByte(10);
        org.mockito.asm.ByteVector byteVector9 = byteVector7.putShort(10);
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
            org.mockito.asm.ByteVector byteVector66 = byteVector9.putByteArray(byteArray51, 10, (int) (byte) -1);
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
    public void test1884() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1884");
        org.mockito.asm.ByteVector byteVector0 = new org.mockito.asm.ByteVector();
        org.mockito.asm.ByteVector byteVector2 = byteVector0.putUTF8("hi!");
        org.mockito.asm.ByteVector byteVector4 = byteVector0.putLong((long) (short) 1);
        org.mockito.asm.ByteVector byteVector6 = byteVector4.putUTF8("");
        org.mockito.asm.ByteVector byteVector8 = byteVector6.putShort((int) (short) 0);
        org.mockito.asm.ByteVector byteVector10 = byteVector6.putLong((long) (byte) 10);
        byte[] byteArray11 = null;
        org.mockito.asm.ByteVector byteVector14 = byteVector10.putByteArray(byteArray11, (int) (short) 0, (int) '4');
        org.junit.Assert.assertNotNull(byteVector2);
        org.junit.Assert.assertNotNull(byteVector4);
        org.junit.Assert.assertNotNull(byteVector6);
        org.junit.Assert.assertNotNull(byteVector8);
        org.junit.Assert.assertNotNull(byteVector10);
        org.junit.Assert.assertNotNull(byteVector14);
    }

    @Test
    public void test1885() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1885");
        org.mockito.asm.ByteVector byteVector0 = new org.mockito.asm.ByteVector();
        org.mockito.asm.ByteVector byteVector2 = byteVector0.putUTF8("hi!");
        org.mockito.asm.ByteVector byteVector4 = byteVector2.putInt((int) (byte) 10);
        org.mockito.asm.ByteVector byteVector6 = byteVector4.putUTF8("");
        org.mockito.asm.ByteVector byteVector8 = byteVector6.putUTF8("hi!");
        org.mockito.asm.ByteVector byteVector10 = byteVector6.putInt((int) '#');
        org.mockito.asm.ByteVector byteVector12 = byteVector10.putByte((int) '4');
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
    public void test1886() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1886");
        org.mockito.asm.ByteVector byteVector0 = new org.mockito.asm.ByteVector();
        org.mockito.asm.ByteVector byteVector2 = byteVector0.putInt((int) (byte) 10);
        org.mockito.asm.ByteVector byteVector4 = byteVector0.putUTF8("");
        org.mockito.asm.ByteVector byteVector6 = byteVector0.putInt((int) (short) -1);
        org.mockito.asm.ByteVector byteVector8 = byteVector0.putInt((int) (short) 10);
        org.mockito.asm.ByteVector byteVector10 = new org.mockito.asm.ByteVector((int) '#');
        org.mockito.asm.ByteVector byteVector12 = byteVector10.putLong(100L);
        org.mockito.asm.ByteVector byteVector14 = byteVector12.putLong(1L);
        org.mockito.asm.ByteVector byteVector16 = byteVector14.putUTF8("hi!");
        org.mockito.asm.ByteVector byteVector18 = byteVector14.putUTF8("hi!");
        org.mockito.asm.ByteVector byteVector20 = byteVector18.putByte((int) (short) 0);
        org.mockito.asm.ByteVector byteVector22 = byteVector18.putInt(1);
        org.mockito.asm.ByteVector byteVector23 = new org.mockito.asm.ByteVector();
        org.mockito.asm.ByteVector byteVector25 = byteVector23.putUTF8("hi!");
        org.mockito.asm.ByteVector byteVector27 = byteVector25.putByte(100);
        org.mockito.asm.ByteVector byteVector29 = byteVector25.putShort((int) 'a');
        org.mockito.asm.ByteVector byteVector31 = byteVector29.putShort((int) (short) 0);
        org.mockito.asm.ByteVector byteVector32 = new org.mockito.asm.ByteVector();
        org.mockito.asm.ByteVector byteVector34 = byteVector32.putUTF8("hi!");
        org.mockito.asm.ByteVector byteVector36 = byteVector34.putInt(0);
        org.mockito.asm.ByteVector byteVector38 = byteVector34.putByte((int) (byte) 10);
        org.mockito.asm.ByteVector byteVector40 = byteVector38.putLong((-1L));
        org.mockito.asm.ByteVector byteVector42 = byteVector38.putInt((int) (byte) 100);
        org.mockito.asm.ByteVector byteVector43 = new org.mockito.asm.ByteVector();
        org.mockito.asm.ByteVector byteVector45 = byteVector43.putUTF8("hi!");
        org.mockito.asm.ByteVector byteVector47 = byteVector43.putInt(0);
        org.mockito.asm.ByteVector byteVector49 = byteVector47.putInt((int) ' ');
        org.mockito.asm.ByteVector byteVector51 = byteVector49.putLong(100L);
        byte[] byteArray55 = new byte[] { (byte) 0, (byte) 10, (byte) 1 };
        org.mockito.asm.ByteVector byteVector58 = byteVector49.putByteArray(byteArray55, 0, 0);
        org.mockito.asm.ByteVector byteVector61 = byteVector38.putByteArray(byteArray55, (int) (byte) 1, 0);
        org.mockito.asm.ByteVector byteVector64 = byteVector29.putByteArray(byteArray55, (int) (byte) 1, (int) (short) 1);
        org.mockito.asm.ByteVector byteVector67 = byteVector18.putByteArray(byteArray55, (int) (short) 0, (int) (byte) 0);
        // The following exception was thrown during execution in test generation
        try {
            org.mockito.asm.ByteVector byteVector70 = byteVector0.putByteArray(byteArray55, 0, (int) 'a');
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
        org.junit.Assert.assertNotNull(byteVector20);
        org.junit.Assert.assertNotNull(byteVector22);
        org.junit.Assert.assertNotNull(byteVector25);
        org.junit.Assert.assertNotNull(byteVector27);
        org.junit.Assert.assertNotNull(byteVector29);
        org.junit.Assert.assertNotNull(byteVector31);
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
    public void test1887() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1887");
        org.mockito.asm.ByteVector byteVector0 = new org.mockito.asm.ByteVector();
        org.mockito.asm.ByteVector byteVector2 = byteVector0.putUTF8("hi!");
        org.mockito.asm.ByteVector byteVector4 = byteVector2.putLong((long) (byte) 10);
        org.mockito.asm.ByteVector byteVector6 = byteVector4.putUTF8("hi!");
        org.mockito.asm.ByteVector byteVector8 = byteVector4.putLong((-1L));
        org.mockito.asm.ByteVector byteVector10 = byteVector4.putLong((long) (-1));
        org.mockito.asm.ByteVector byteVector12 = byteVector10.putLong((-1L));
        org.junit.Assert.assertNotNull(byteVector2);
        org.junit.Assert.assertNotNull(byteVector4);
        org.junit.Assert.assertNotNull(byteVector6);
        org.junit.Assert.assertNotNull(byteVector8);
        org.junit.Assert.assertNotNull(byteVector10);
        org.junit.Assert.assertNotNull(byteVector12);
    }

    @Test
    public void test1888() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1888");
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
        org.mockito.asm.ByteVector byteVector26 = byteVector20.putInt((int) (short) 1);
        org.mockito.asm.ByteVector byteVector28 = byteVector20.putUTF8("");
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
    public void test1889() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1889");
        org.mockito.asm.ByteVector byteVector0 = new org.mockito.asm.ByteVector();
        org.mockito.asm.ByteVector byteVector2 = byteVector0.putUTF8("hi!");
        org.mockito.asm.ByteVector byteVector4 = byteVector0.putLong((long) ' ');
        org.mockito.asm.ByteVector byteVector6 = byteVector4.putByte((int) 'a');
        org.mockito.asm.ByteVector byteVector8 = byteVector4.putByte((int) (short) -1);
        org.mockito.asm.ByteVector byteVector10 = byteVector4.putLong(0L);
        org.mockito.asm.ByteVector byteVector12 = byteVector4.putUTF8("hi!");
        org.mockito.asm.ByteVector byteVector14 = byteVector12.putLong((long) '4');
        org.mockito.asm.ByteVector byteVector16 = byteVector12.putShort((int) (byte) 100);
        org.mockito.asm.ByteVector byteVector18 = byteVector12.putInt((int) (byte) 0);
        org.mockito.asm.ByteVector byteVector20 = byteVector12.putLong(0L);
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
    public void test1890() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1890");
        org.mockito.asm.ByteVector byteVector0 = new org.mockito.asm.ByteVector();
        org.mockito.asm.ByteVector byteVector2 = byteVector0.putUTF8("hi!");
        org.mockito.asm.ByteVector byteVector4 = byteVector2.putInt((int) (byte) 10);
        org.mockito.asm.ByteVector byteVector6 = byteVector4.putUTF8("");
        org.mockito.asm.ByteVector byteVector8 = byteVector4.putLong((long) '#');
        org.mockito.asm.ByteVector byteVector10 = byteVector8.putLong((long) (short) 100);
        org.mockito.asm.ByteVector byteVector12 = byteVector8.putByte(1);
        org.mockito.asm.ByteVector byteVector14 = byteVector8.putUTF8("hi!");
        org.mockito.asm.ByteVector byteVector16 = byteVector8.putByte(100);
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
    public void test1891() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1891");
        org.mockito.asm.ByteVector byteVector0 = new org.mockito.asm.ByteVector();
        org.mockito.asm.ByteVector byteVector2 = byteVector0.putUTF8("hi!");
        org.mockito.asm.ByteVector byteVector4 = byteVector0.putLong((long) ' ');
        org.mockito.asm.ByteVector byteVector6 = byteVector4.putByte((int) 'a');
        org.mockito.asm.ByteVector byteVector8 = byteVector6.putByte((int) (short) -1);
        org.mockito.asm.ByteVector byteVector10 = byteVector8.putLong((long) (byte) -1);
        org.mockito.asm.ByteVector byteVector12 = byteVector8.putByte((int) '4');
        org.mockito.asm.ByteVector byteVector14 = byteVector12.putLong((long) (short) 10);
        org.mockito.asm.ByteVector byteVector16 = byteVector14.putShort((int) (short) 0);
        org.mockito.asm.ByteVector byteVector18 = byteVector16.putUTF8("");
        org.mockito.asm.ByteVector byteVector19 = new org.mockito.asm.ByteVector();
        org.mockito.asm.ByteVector byteVector21 = byteVector19.putUTF8("hi!");
        org.mockito.asm.ByteVector byteVector23 = byteVector19.putInt(0);
        org.mockito.asm.ByteVector byteVector25 = byteVector23.putByte((int) (byte) -1);
        org.mockito.asm.ByteVector byteVector27 = byteVector23.putShort((int) '4');
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
            org.mockito.asm.ByteVector byteVector60 = byteVector18.putByteArray(byteArray51, 0, (int) (byte) 100);
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
        org.junit.Assert.assertNotNull(byteArray51);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray51), "[1, 0, 0, -1]");
        org.junit.Assert.assertNotNull(byteVector54);
        org.junit.Assert.assertNotNull(byteVector57);
    }

    @Test
    public void test1892() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1892");
        org.mockito.asm.ByteVector byteVector1 = new org.mockito.asm.ByteVector((int) (byte) 1);
        org.mockito.asm.ByteVector byteVector3 = byteVector1.putByte((int) (byte) 10);
        org.mockito.asm.ByteVector byteVector5 = byteVector3.putShort((int) (short) 10);
        org.mockito.asm.ByteVector byteVector7 = byteVector3.putUTF8("");
        org.mockito.asm.ByteVector byteVector9 = byteVector7.putShort(0);
        org.mockito.asm.ByteVector byteVector11 = byteVector7.putShort((int) (short) -1);
        org.mockito.asm.ByteVector byteVector13 = byteVector7.putByte((int) (short) 1);
        org.mockito.asm.ByteVector byteVector15 = byteVector13.putLong((long) '#');
        org.junit.Assert.assertNotNull(byteVector3);
        org.junit.Assert.assertNotNull(byteVector5);
        org.junit.Assert.assertNotNull(byteVector7);
        org.junit.Assert.assertNotNull(byteVector9);
        org.junit.Assert.assertNotNull(byteVector11);
        org.junit.Assert.assertNotNull(byteVector13);
        org.junit.Assert.assertNotNull(byteVector15);
    }

    @Test
    public void test1893() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1893");
        org.mockito.asm.ByteVector byteVector0 = new org.mockito.asm.ByteVector();
        org.mockito.asm.ByteVector byteVector2 = byteVector0.putUTF8("hi!");
        org.mockito.asm.ByteVector byteVector4 = byteVector0.putLong((long) ' ');
        org.mockito.asm.ByteVector byteVector6 = byteVector4.putByte((int) 'a');
        org.mockito.asm.ByteVector byteVector8 = byteVector4.putByte((int) (short) -1);
        org.mockito.asm.ByteVector byteVector10 = byteVector8.putByte((-1));
        org.mockito.asm.ByteVector byteVector12 = byteVector8.putInt((int) '#');
        org.mockito.asm.ByteVector byteVector14 = byteVector12.putLong((-1L));
        org.mockito.asm.ByteVector byteVector15 = new org.mockito.asm.ByteVector();
        org.mockito.asm.ByteVector byteVector17 = byteVector15.putUTF8("hi!");
        org.mockito.asm.ByteVector byteVector19 = byteVector17.putLong((long) (byte) 10);
        org.mockito.asm.ByteVector byteVector21 = byteVector19.putUTF8("hi!");
        org.mockito.asm.ByteVector byteVector23 = byteVector19.putLong((long) 10);
        org.mockito.asm.ByteVector byteVector25 = byteVector23.putLong(0L);
        org.mockito.asm.ByteVector byteVector27 = byteVector25.putShort((int) (byte) -1);
        org.mockito.asm.ByteVector byteVector29 = byteVector25.putInt((-1));
        org.mockito.asm.ByteVector byteVector31 = byteVector25.putByte((int) (byte) 100);
        org.mockito.asm.ByteVector byteVector33 = new org.mockito.asm.ByteVector((int) '#');
        org.mockito.asm.ByteVector byteVector35 = byteVector33.putInt(100);
        org.mockito.asm.ByteVector byteVector37 = byteVector33.putUTF8("");
        org.mockito.asm.ByteVector byteVector38 = new org.mockito.asm.ByteVector();
        org.mockito.asm.ByteVector byteVector40 = byteVector38.putUTF8("hi!");
        org.mockito.asm.ByteVector byteVector42 = byteVector40.putInt(0);
        org.mockito.asm.ByteVector byteVector44 = byteVector42.putByte((int) (short) 0);
        org.mockito.asm.ByteVector byteVector46 = byteVector42.putUTF8("");
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
        org.mockito.asm.ByteVector byteVector83 = byteVector42.putByteArray(byteArray74, (int) (short) 0, 0);
        org.mockito.asm.ByteVector byteVector86 = byteVector37.putByteArray(byteArray74, (int) (byte) 0, (int) (short) 1);
        org.mockito.asm.ByteVector byteVector89 = byteVector25.putByteArray(byteArray74, (int) (byte) 1, (int) (byte) 0);
        // The following exception was thrown during execution in test generation
        try {
            org.mockito.asm.ByteVector byteVector92 = byteVector12.putByteArray(byteArray74, (int) (byte) 100, (int) '#');
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
        org.junit.Assert.assertNotNull(byteVector35);
        org.junit.Assert.assertNotNull(byteVector37);
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
        org.junit.Assert.assertNotNull(byteVector89);
    }

    @Test
    public void test1894() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1894");
        org.mockito.asm.ByteVector byteVector1 = new org.mockito.asm.ByteVector((int) '#');
        org.mockito.asm.ByteVector byteVector3 = byteVector1.putInt(100);
        org.mockito.asm.ByteVector byteVector5 = byteVector3.putByte((int) (byte) 100);
        org.mockito.asm.ByteVector byteVector7 = byteVector5.putByte((int) (byte) 10);
        org.mockito.asm.ByteVector byteVector9 = byteVector5.putByte((int) (short) 0);
        org.mockito.asm.ByteVector byteVector11 = byteVector9.putInt(0);
        org.junit.Assert.assertNotNull(byteVector3);
        org.junit.Assert.assertNotNull(byteVector5);
        org.junit.Assert.assertNotNull(byteVector7);
        org.junit.Assert.assertNotNull(byteVector9);
        org.junit.Assert.assertNotNull(byteVector11);
    }

    @Test
    public void test1895() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1895");
        org.mockito.asm.ByteVector byteVector0 = new org.mockito.asm.ByteVector();
        org.mockito.asm.ByteVector byteVector2 = byteVector0.putUTF8("hi!");
        org.mockito.asm.ByteVector byteVector4 = byteVector0.putInt(0);
        org.mockito.asm.ByteVector byteVector6 = byteVector0.putShort(10);
        org.mockito.asm.ByteVector byteVector8 = byteVector0.putLong((long) (short) 1);
        org.mockito.asm.ByteVector byteVector10 = byteVector8.putUTF8("hi!");
        org.mockito.asm.ByteVector byteVector12 = new org.mockito.asm.ByteVector((int) '#');
        org.mockito.asm.ByteVector byteVector14 = byteVector12.putInt(100);
        org.mockito.asm.ByteVector byteVector16 = byteVector12.putUTF8("");
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
        org.mockito.asm.ByteVector byteVector65 = byteVector16.putByteArray(byteArray53, (int) (byte) 0, (int) (short) 1);
        // The following exception was thrown during execution in test generation
        try {
            org.mockito.asm.ByteVector byteVector68 = byteVector10.putByteArray(byteArray53, (int) (short) 1, 10);
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
        org.junit.Assert.assertNotNull(byteVector65);
    }

    @Test
    public void test1896() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1896");
        org.mockito.asm.ByteVector byteVector0 = new org.mockito.asm.ByteVector();
        org.mockito.asm.ByteVector byteVector2 = byteVector0.putUTF8("hi!");
        org.mockito.asm.ByteVector byteVector4 = byteVector2.putInt(0);
        org.mockito.asm.ByteVector byteVector6 = byteVector4.putShort(1);
        org.mockito.asm.ByteVector byteVector8 = byteVector6.putByte((int) (byte) 1);
        org.mockito.asm.ByteVector byteVector10 = byteVector6.putShort(10);
        org.junit.Assert.assertNotNull(byteVector2);
        org.junit.Assert.assertNotNull(byteVector4);
        org.junit.Assert.assertNotNull(byteVector6);
        org.junit.Assert.assertNotNull(byteVector8);
        org.junit.Assert.assertNotNull(byteVector10);
    }

    @Test
    public void test1897() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1897");
        org.mockito.asm.ByteVector byteVector0 = new org.mockito.asm.ByteVector();
        org.mockito.asm.ByteVector byteVector2 = byteVector0.putUTF8("hi!");
        org.mockito.asm.ByteVector byteVector4 = byteVector2.putInt((int) (byte) 10);
        org.mockito.asm.ByteVector byteVector6 = byteVector2.putLong((long) 0);
        org.mockito.asm.ByteVector byteVector8 = byteVector2.putUTF8("hi!");
        org.mockito.asm.ByteVector byteVector10 = byteVector2.putInt((int) (short) 100);
        org.mockito.asm.ByteVector byteVector12 = byteVector10.putByte((int) (short) 0);
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
    public void test1898() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1898");
        org.mockito.asm.ByteVector byteVector0 = new org.mockito.asm.ByteVector();
        org.mockito.asm.ByteVector byteVector2 = byteVector0.putUTF8("hi!");
        org.mockito.asm.ByteVector byteVector4 = byteVector0.putLong((long) ' ');
        org.mockito.asm.ByteVector byteVector6 = byteVector4.putByte((int) 'a');
        org.mockito.asm.ByteVector byteVector8 = byteVector6.putByte((int) (short) -1);
        org.mockito.asm.ByteVector byteVector10 = byteVector8.putLong((long) (byte) -1);
        org.mockito.asm.ByteVector byteVector12 = byteVector8.putByte((int) '4');
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
    public void test1899() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1899");
        org.mockito.asm.ByteVector byteVector1 = new org.mockito.asm.ByteVector((int) '#');
        org.mockito.asm.ByteVector byteVector3 = byteVector1.putUTF8("hi!");
        org.mockito.asm.ByteVector byteVector5 = byteVector1.putUTF8("");
        org.mockito.asm.ByteVector byteVector7 = byteVector5.putUTF8("hi!");
        org.mockito.asm.ByteVector byteVector9 = byteVector7.putShort(0);
        org.mockito.asm.ByteVector byteVector11 = byteVector7.putShort((int) (byte) 10);
        org.mockito.asm.ByteVector byteVector13 = byteVector7.putInt((int) 'a');
        org.mockito.asm.ByteVector byteVector15 = byteVector13.putByte(100);
        org.junit.Assert.assertNotNull(byteVector3);
        org.junit.Assert.assertNotNull(byteVector5);
        org.junit.Assert.assertNotNull(byteVector7);
        org.junit.Assert.assertNotNull(byteVector9);
        org.junit.Assert.assertNotNull(byteVector11);
        org.junit.Assert.assertNotNull(byteVector13);
        org.junit.Assert.assertNotNull(byteVector15);
    }

    @Test
    public void test1900() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1900");
        org.mockito.asm.ByteVector byteVector1 = new org.mockito.asm.ByteVector((int) (byte) 1);
        org.mockito.asm.ByteVector byteVector3 = byteVector1.putByte((int) (byte) 10);
        org.mockito.asm.ByteVector byteVector5 = byteVector1.putLong(1L);
        org.mockito.asm.ByteVector byteVector7 = byteVector1.putInt((int) (short) 0);
        org.mockito.asm.ByteVector byteVector9 = byteVector1.putInt(0);
        org.junit.Assert.assertNotNull(byteVector3);
        org.junit.Assert.assertNotNull(byteVector5);
        org.junit.Assert.assertNotNull(byteVector7);
        org.junit.Assert.assertNotNull(byteVector9);
    }

    @Test
    public void test1901() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1901");
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
        org.mockito.asm.ByteVector byteVector22 = byteVector20.putByte((int) (byte) 0);
        org.mockito.asm.ByteVector byteVector23 = new org.mockito.asm.ByteVector();
        org.mockito.asm.ByteVector byteVector25 = byteVector23.putUTF8("hi!");
        org.mockito.asm.ByteVector byteVector27 = byteVector23.putByte((int) (byte) 1);
        org.mockito.asm.ByteVector byteVector29 = byteVector23.putLong((long) (short) 1);
        org.mockito.asm.ByteVector byteVector31 = byteVector23.putShort((int) (byte) 100);
        org.mockito.asm.ByteVector byteVector32 = new org.mockito.asm.ByteVector();
        org.mockito.asm.ByteVector byteVector34 = byteVector32.putUTF8("hi!");
        org.mockito.asm.ByteVector byteVector36 = byteVector34.putInt(0);
        org.mockito.asm.ByteVector byteVector38 = byteVector34.putByte((int) (byte) 10);
        org.mockito.asm.ByteVector byteVector40 = byteVector38.putLong((-1L));
        org.mockito.asm.ByteVector byteVector42 = byteVector38.putInt((int) (byte) 100);
        org.mockito.asm.ByteVector byteVector43 = new org.mockito.asm.ByteVector();
        org.mockito.asm.ByteVector byteVector45 = byteVector43.putUTF8("hi!");
        org.mockito.asm.ByteVector byteVector47 = byteVector43.putInt(0);
        org.mockito.asm.ByteVector byteVector49 = byteVector47.putInt((int) ' ');
        org.mockito.asm.ByteVector byteVector51 = byteVector49.putLong(100L);
        byte[] byteArray55 = new byte[] { (byte) 0, (byte) 10, (byte) 1 };
        org.mockito.asm.ByteVector byteVector58 = byteVector49.putByteArray(byteArray55, 0, 0);
        org.mockito.asm.ByteVector byteVector61 = byteVector38.putByteArray(byteArray55, (int) (byte) 1, 0);
        org.mockito.asm.ByteVector byteVector64 = byteVector31.putByteArray(byteArray55, 1, 1);
        // The following exception was thrown during execution in test generation
        try {
            org.mockito.asm.ByteVector byteVector67 = byteVector20.putByteArray(byteArray55, (int) (short) 10, (int) (byte) 10);
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
    }

    @Test
    public void test1902() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1902");
        org.mockito.asm.ByteVector byteVector0 = new org.mockito.asm.ByteVector();
        org.mockito.asm.ByteVector byteVector2 = byteVector0.putUTF8("hi!");
        org.mockito.asm.ByteVector byteVector4 = byteVector0.putShort((int) (short) 100);
        org.mockito.asm.ByteVector byteVector6 = byteVector4.putLong((long) (byte) -1);
        org.mockito.asm.ByteVector byteVector8 = byteVector6.putByte((int) (byte) 0);
        org.mockito.asm.ByteVector byteVector10 = byteVector6.putUTF8("hi!");
        org.mockito.asm.ByteVector byteVector12 = byteVector6.putLong((long) '4');
        org.mockito.asm.ByteVector byteVector13 = new org.mockito.asm.ByteVector();
        org.mockito.asm.ByteVector byteVector15 = byteVector13.putUTF8("hi!");
        org.mockito.asm.ByteVector byteVector17 = byteVector15.putInt(0);
        org.mockito.asm.ByteVector byteVector19 = byteVector17.putShort((int) '4');
        org.mockito.asm.ByteVector byteVector21 = byteVector19.putByte(100);
        org.mockito.asm.ByteVector byteVector23 = byteVector19.putInt((int) (byte) 10);
        org.mockito.asm.ByteVector byteVector25 = byteVector23.putUTF8("");
        org.mockito.asm.ByteVector byteVector27 = byteVector23.putInt(1);
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
        org.mockito.asm.ByteVector byteVector76 = byteVector27.putByteArray(byteArray64, 0, 0);
        // The following exception was thrown during execution in test generation
        try {
            org.mockito.asm.ByteVector byteVector79 = byteVector6.putByteArray(byteArray64, (int) (byte) -1, (int) (byte) 10);
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
    }

    @Test
    public void test1903() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1903");
        org.mockito.asm.ByteVector byteVector0 = new org.mockito.asm.ByteVector();
        org.mockito.asm.ByteVector byteVector2 = byteVector0.putUTF8("hi!");
        org.mockito.asm.ByteVector byteVector4 = byteVector0.putInt(0);
        org.mockito.asm.ByteVector byteVector6 = byteVector4.putInt((int) ' ');
        org.mockito.asm.ByteVector byteVector8 = byteVector6.putLong((long) (short) 10);
        org.mockito.asm.ByteVector byteVector10 = byteVector8.putLong((long) 'a');
        org.mockito.asm.ByteVector byteVector12 = byteVector10.putByte((int) '#');
        org.mockito.asm.ByteVector byteVector14 = byteVector12.putInt((int) ' ');
        org.mockito.asm.ByteVector byteVector16 = byteVector12.putUTF8("");
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
    public void test1904() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1904");
        org.mockito.asm.ByteVector byteVector1 = new org.mockito.asm.ByteVector((int) '#');
        org.mockito.asm.ByteVector byteVector3 = byteVector1.putLong(100L);
        org.mockito.asm.ByteVector byteVector5 = byteVector3.putLong(1L);
        org.mockito.asm.ByteVector byteVector7 = byteVector5.putUTF8("hi!");
        org.mockito.asm.ByteVector byteVector9 = byteVector7.putUTF8("");
        org.mockito.asm.ByteVector byteVector11 = byteVector7.putInt((int) (short) 100);
        org.mockito.asm.ByteVector byteVector13 = byteVector11.putByte((int) (byte) 100);
        org.mockito.asm.ByteVector byteVector15 = byteVector13.putByte((int) (byte) 100);
        org.mockito.asm.ByteVector byteVector17 = byteVector13.putUTF8("hi!");
        org.mockito.asm.ByteVector byteVector19 = byteVector13.putByte(100);
        org.mockito.asm.ByteVector byteVector21 = byteVector19.putLong(100L);
        org.mockito.asm.ByteVector byteVector23 = byteVector21.putLong(100L);
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
        org.junit.Assert.assertNotNull(byteVector23);
    }

    @Test
    public void test1905() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1905");
        org.mockito.asm.ByteVector byteVector0 = new org.mockito.asm.ByteVector();
        org.mockito.asm.ByteVector byteVector2 = byteVector0.putUTF8("hi!");
        org.mockito.asm.ByteVector byteVector4 = byteVector2.putInt(0);
        org.mockito.asm.ByteVector byteVector6 = byteVector4.putByte((int) (byte) 1);
        org.mockito.asm.ByteVector byteVector8 = byteVector4.putByte(0);
        org.mockito.asm.ByteVector byteVector10 = byteVector8.putUTF8("");
        org.junit.Assert.assertNotNull(byteVector2);
        org.junit.Assert.assertNotNull(byteVector4);
        org.junit.Assert.assertNotNull(byteVector6);
        org.junit.Assert.assertNotNull(byteVector8);
        org.junit.Assert.assertNotNull(byteVector10);
    }

    @Test
    public void test1906() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1906");
        org.mockito.asm.ByteVector byteVector0 = new org.mockito.asm.ByteVector();
        org.mockito.asm.ByteVector byteVector2 = byteVector0.putUTF8("hi!");
        org.mockito.asm.ByteVector byteVector4 = byteVector0.putShort((int) (short) -1);
        org.mockito.asm.ByteVector byteVector6 = byteVector0.putByte((int) ' ');
        org.mockito.asm.ByteVector byteVector8 = byteVector0.putLong((long) (byte) 0);
        org.mockito.asm.ByteVector byteVector10 = byteVector8.putUTF8("");
        org.mockito.asm.ByteVector byteVector12 = byteVector10.putUTF8("");
        org.junit.Assert.assertNotNull(byteVector2);
        org.junit.Assert.assertNotNull(byteVector4);
        org.junit.Assert.assertNotNull(byteVector6);
        org.junit.Assert.assertNotNull(byteVector8);
        org.junit.Assert.assertNotNull(byteVector10);
        org.junit.Assert.assertNotNull(byteVector12);
    }

    @Test
    public void test1907() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1907");
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
        org.mockito.asm.ByteVector byteVector20 = byteVector18.putInt((int) '#');
        org.mockito.asm.ByteVector byteVector22 = byteVector20.putInt((int) (short) 1);
        org.mockito.asm.ByteVector byteVector24 = byteVector20.putUTF8("hi!");
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
    public void test1908() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1908");
        org.mockito.asm.ByteVector byteVector0 = new org.mockito.asm.ByteVector();
        org.mockito.asm.ByteVector byteVector2 = byteVector0.putUTF8("hi!");
        org.mockito.asm.ByteVector byteVector4 = byteVector0.putInt(0);
        org.mockito.asm.ByteVector byteVector6 = byteVector0.putShort(10);
        org.mockito.asm.ByteVector byteVector8 = byteVector0.putUTF8("");
        org.mockito.asm.ByteVector byteVector10 = byteVector8.putUTF8("hi!");
        org.mockito.asm.ByteVector byteVector12 = byteVector10.putLong((long) (byte) 0);
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
    public void test1909() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1909");
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
        org.mockito.asm.ByteVector byteVector48 = byteVector46.putInt((-1));
        org.mockito.asm.ByteVector byteVector50 = byteVector46.putLong((long) (byte) 100);
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
        org.junit.Assert.assertNotNull(byteVector48);
        org.junit.Assert.assertNotNull(byteVector50);
    }

    @Test
    public void test1910() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1910");
        org.mockito.asm.ByteVector byteVector0 = new org.mockito.asm.ByteVector();
        org.mockito.asm.ByteVector byteVector2 = byteVector0.putUTF8("hi!");
        org.mockito.asm.ByteVector byteVector4 = byteVector2.putLong((long) (byte) 10);
        org.mockito.asm.ByteVector byteVector6 = byteVector4.putUTF8("hi!");
        org.mockito.asm.ByteVector byteVector8 = byteVector4.putInt((int) (byte) 100);
        org.mockito.asm.ByteVector byteVector10 = byteVector4.putUTF8("hi!");
        org.mockito.asm.ByteVector byteVector12 = byteVector10.putUTF8("");
        org.mockito.asm.ByteVector byteVector14 = byteVector12.putUTF8("");
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
    public void test1911() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1911");
        org.mockito.asm.ByteVector byteVector0 = new org.mockito.asm.ByteVector();
        org.mockito.asm.ByteVector byteVector2 = byteVector0.putUTF8("hi!");
        org.mockito.asm.ByteVector byteVector4 = byteVector2.putInt((int) (byte) 10);
        org.mockito.asm.ByteVector byteVector6 = byteVector4.putUTF8("");
        org.mockito.asm.ByteVector byteVector8 = byteVector6.putUTF8("hi!");
        org.mockito.asm.ByteVector byteVector10 = byteVector6.putInt((int) (byte) 1);
        org.mockito.asm.ByteVector byteVector12 = byteVector6.putUTF8("");
        org.mockito.asm.ByteVector byteVector14 = byteVector6.putInt(1);
        org.mockito.asm.ByteVector byteVector16 = byteVector14.putShort((int) '4');
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
    public void test1912() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1912");
        org.mockito.asm.ByteVector byteVector1 = new org.mockito.asm.ByteVector((int) (byte) 100);
        org.mockito.asm.ByteVector byteVector3 = byteVector1.putShort((int) (short) 100);
        org.mockito.asm.ByteVector byteVector5 = byteVector1.putByte((int) (byte) 10);
        org.mockito.asm.ByteVector byteVector7 = byteVector5.putByte((int) '4');
        org.mockito.asm.ByteVector byteVector9 = byteVector5.putLong((long) 'a');
        org.mockito.asm.ByteVector byteVector11 = byteVector5.putUTF8("");
        org.junit.Assert.assertNotNull(byteVector3);
        org.junit.Assert.assertNotNull(byteVector5);
        org.junit.Assert.assertNotNull(byteVector7);
        org.junit.Assert.assertNotNull(byteVector9);
        org.junit.Assert.assertNotNull(byteVector11);
    }

    @Test
    public void test1913() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1913");
        org.mockito.asm.ByteVector byteVector0 = new org.mockito.asm.ByteVector();
        org.mockito.asm.ByteVector byteVector2 = byteVector0.putUTF8("hi!");
        org.mockito.asm.ByteVector byteVector4 = byteVector2.putInt(0);
        org.mockito.asm.ByteVector byteVector6 = byteVector4.putShort((int) '4');
        org.mockito.asm.ByteVector byteVector8 = byteVector6.putByte(100);
        org.mockito.asm.ByteVector byteVector10 = byteVector6.putInt((int) (byte) 10);
        org.mockito.asm.ByteVector byteVector12 = byteVector10.putUTF8("");
        org.mockito.asm.ByteVector byteVector14 = byteVector10.putUTF8("hi!");
        org.mockito.asm.ByteVector byteVector16 = byteVector14.putShort(0);
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
    public void test1914() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1914");
        org.mockito.asm.ByteVector byteVector0 = new org.mockito.asm.ByteVector();
        org.mockito.asm.ByteVector byteVector2 = byteVector0.putUTF8("hi!");
        org.mockito.asm.ByteVector byteVector4 = byteVector0.putInt(0);
        org.mockito.asm.ByteVector byteVector6 = byteVector4.putInt((int) ' ');
        org.mockito.asm.ByteVector byteVector8 = byteVector6.putLong((long) (short) 10);
        org.mockito.asm.ByteVector byteVector10 = byteVector6.putInt((int) '4');
        org.mockito.asm.ByteVector byteVector12 = byteVector6.putShort((int) (short) 100);
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
    public void test1915() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1915");
        org.mockito.asm.ByteVector byteVector0 = new org.mockito.asm.ByteVector();
        org.mockito.asm.ByteVector byteVector2 = byteVector0.putUTF8("hi!");
        org.mockito.asm.ByteVector byteVector4 = byteVector0.putShort((int) (short) -1);
        org.mockito.asm.ByteVector byteVector6 = byteVector0.putLong(0L);
        org.mockito.asm.ByteVector byteVector8 = byteVector0.putShort((int) (byte) -1);
        org.mockito.asm.ByteVector byteVector10 = byteVector8.putByte((int) (byte) 0);
        org.mockito.asm.ByteVector byteVector12 = byteVector10.putByte(100);
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
    public void test1916() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1916");
        org.mockito.asm.ByteVector byteVector0 = new org.mockito.asm.ByteVector();
        org.mockito.asm.ByteVector byteVector2 = byteVector0.putUTF8("hi!");
        org.mockito.asm.ByteVector byteVector4 = byteVector0.putShort((int) (short) -1);
        org.mockito.asm.ByteVector byteVector6 = byteVector0.putInt((int) (byte) 10);
        org.mockito.asm.ByteVector byteVector8 = byteVector6.putUTF8("hi!");
        org.mockito.asm.ByteVector byteVector10 = byteVector6.putLong((long) '#');
        org.mockito.asm.ByteVector byteVector12 = byteVector10.putShort(0);
        org.mockito.asm.ByteVector byteVector14 = byteVector12.putShort((int) (short) 1);
        org.mockito.asm.ByteVector byteVector16 = byteVector12.putByte((int) '4');
        org.mockito.asm.ByteVector byteVector18 = byteVector16.putLong((long) (byte) 0);
        org.mockito.asm.ByteVector byteVector20 = byteVector16.putShort((int) (byte) 10);
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
    public void test1917() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1917");
        org.mockito.asm.ByteVector byteVector0 = new org.mockito.asm.ByteVector();
        org.mockito.asm.ByteVector byteVector2 = byteVector0.putUTF8("hi!");
        org.mockito.asm.ByteVector byteVector4 = byteVector0.putShort((int) (short) -1);
        org.mockito.asm.ByteVector byteVector6 = byteVector0.putLong(0L);
        org.mockito.asm.ByteVector byteVector8 = byteVector0.putShort((int) (byte) -1);
        org.mockito.asm.ByteVector byteVector10 = byteVector8.putUTF8("");
        org.mockito.asm.ByteVector byteVector12 = byteVector8.putByte(10);
        org.mockito.asm.ByteVector byteVector14 = byteVector12.putInt((int) (byte) 10);
        org.mockito.asm.ByteVector byteVector16 = byteVector14.putShort((int) (byte) 0);
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
    public void test1918() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1918");
        org.mockito.asm.ByteVector byteVector1 = new org.mockito.asm.ByteVector((int) (byte) 10);
        org.mockito.asm.ByteVector byteVector3 = byteVector1.putByte((int) '4');
        org.mockito.asm.ByteVector byteVector5 = byteVector1.putLong(0L);
        org.mockito.asm.ByteVector byteVector7 = byteVector5.putByte(10);
        org.mockito.asm.ByteVector byteVector9 = byteVector5.putShort(0);
        java.lang.Class<?> wildcardClass10 = byteVector9.getClass();
        org.junit.Assert.assertNotNull(byteVector3);
        org.junit.Assert.assertNotNull(byteVector5);
        org.junit.Assert.assertNotNull(byteVector7);
        org.junit.Assert.assertNotNull(byteVector9);
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test1919() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1919");
        org.mockito.asm.ByteVector byteVector1 = new org.mockito.asm.ByteVector((int) (byte) 10);
        org.mockito.asm.ByteVector byteVector3 = byteVector1.putByte((int) '4');
        org.mockito.asm.ByteVector byteVector5 = byteVector1.putLong((long) 'a');
        org.mockito.asm.ByteVector byteVector6 = new org.mockito.asm.ByteVector();
        org.mockito.asm.ByteVector byteVector8 = byteVector6.putUTF8("hi!");
        org.mockito.asm.ByteVector byteVector10 = byteVector8.putInt(0);
        org.mockito.asm.ByteVector byteVector12 = byteVector8.putByte((int) (byte) 10);
        org.mockito.asm.ByteVector byteVector14 = byteVector12.putLong((-1L));
        org.mockito.asm.ByteVector byteVector16 = byteVector12.putInt((int) (byte) 100);
        org.mockito.asm.ByteVector byteVector17 = new org.mockito.asm.ByteVector();
        org.mockito.asm.ByteVector byteVector19 = byteVector17.putUTF8("hi!");
        org.mockito.asm.ByteVector byteVector21 = byteVector17.putInt(0);
        org.mockito.asm.ByteVector byteVector23 = byteVector21.putInt((int) ' ');
        org.mockito.asm.ByteVector byteVector25 = byteVector23.putLong(100L);
        byte[] byteArray29 = new byte[] { (byte) 0, (byte) 10, (byte) 1 };
        org.mockito.asm.ByteVector byteVector32 = byteVector23.putByteArray(byteArray29, 0, 0);
        org.mockito.asm.ByteVector byteVector35 = byteVector12.putByteArray(byteArray29, (int) (byte) 1, 0);
        // The following exception was thrown during execution in test generation
        try {
            org.mockito.asm.ByteVector byteVector38 = byteVector5.putByteArray(byteArray29, (int) (byte) 100, (int) (short) 100);
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
    public void test1920() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1920");
        org.mockito.asm.ByteVector byteVector0 = new org.mockito.asm.ByteVector();
        org.mockito.asm.ByteVector byteVector2 = byteVector0.putUTF8("hi!");
        org.mockito.asm.ByteVector byteVector4 = byteVector2.putLong((long) (byte) 10);
        org.mockito.asm.ByteVector byteVector6 = byteVector2.putInt((int) (short) 1);
        org.mockito.asm.ByteVector byteVector8 = byteVector6.putByte((int) (byte) 0);
        org.mockito.asm.ByteVector byteVector10 = byteVector6.putByte((int) (byte) 100);
        org.mockito.asm.ByteVector byteVector12 = byteVector10.putInt((int) '#');
        org.junit.Assert.assertNotNull(byteVector2);
        org.junit.Assert.assertNotNull(byteVector4);
        org.junit.Assert.assertNotNull(byteVector6);
        org.junit.Assert.assertNotNull(byteVector8);
        org.junit.Assert.assertNotNull(byteVector10);
        org.junit.Assert.assertNotNull(byteVector12);
    }

    @Test
    public void test1921() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1921");
        org.mockito.asm.ByteVector byteVector0 = new org.mockito.asm.ByteVector();
        org.mockito.asm.ByteVector byteVector2 = byteVector0.putUTF8("hi!");
        org.mockito.asm.ByteVector byteVector4 = byteVector0.putInt(0);
        org.mockito.asm.ByteVector byteVector6 = byteVector4.putInt((int) ' ');
        org.mockito.asm.ByteVector byteVector8 = byteVector6.putLong((long) (short) 10);
        org.mockito.asm.ByteVector byteVector10 = byteVector8.putUTF8("hi!");
        org.mockito.asm.ByteVector byteVector12 = byteVector8.putByte(0);
        org.mockito.asm.ByteVector byteVector14 = byteVector12.putByte((int) (short) 1);
        org.mockito.asm.ByteVector byteVector16 = byteVector12.putShort((int) '#');
        org.mockito.asm.ByteVector byteVector18 = byteVector16.putLong((long) 0);
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
    public void test1922() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1922");
        org.mockito.asm.ByteVector byteVector0 = new org.mockito.asm.ByteVector();
        org.mockito.asm.ByteVector byteVector2 = byteVector0.putUTF8("hi!");
        org.mockito.asm.ByteVector byteVector4 = byteVector0.putShort((int) (byte) 100);
        org.mockito.asm.ByteVector byteVector6 = byteVector4.putLong((long) 10);
        org.mockito.asm.ByteVector byteVector8 = byteVector6.putInt(0);
        org.junit.Assert.assertNotNull(byteVector2);
        org.junit.Assert.assertNotNull(byteVector4);
        org.junit.Assert.assertNotNull(byteVector6);
        org.junit.Assert.assertNotNull(byteVector8);
    }

    @Test
    public void test1923() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1923");
        org.mockito.asm.ByteVector byteVector1 = new org.mockito.asm.ByteVector((int) (byte) 100);
        org.mockito.asm.ByteVector byteVector3 = byteVector1.putInt(0);
        org.mockito.asm.ByteVector byteVector5 = byteVector3.putLong((long) (short) 100);
        org.mockito.asm.ByteVector byteVector7 = byteVector5.putUTF8("hi!");
        org.mockito.asm.ByteVector byteVector9 = byteVector7.putUTF8("");
        org.mockito.asm.ByteVector byteVector11 = byteVector7.putInt(1);
        org.junit.Assert.assertNotNull(byteVector3);
        org.junit.Assert.assertNotNull(byteVector5);
        org.junit.Assert.assertNotNull(byteVector7);
        org.junit.Assert.assertNotNull(byteVector9);
        org.junit.Assert.assertNotNull(byteVector11);
    }

    @Test
    public void test1924() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1924");
        org.mockito.asm.ByteVector byteVector0 = new org.mockito.asm.ByteVector();
        org.mockito.asm.ByteVector byteVector2 = byteVector0.putUTF8("hi!");
        org.mockito.asm.ByteVector byteVector4 = byteVector2.putLong((long) (byte) 10);
        org.mockito.asm.ByteVector byteVector6 = byteVector4.putUTF8("hi!");
        org.mockito.asm.ByteVector byteVector8 = byteVector4.putLong((long) 10);
        org.mockito.asm.ByteVector byteVector10 = byteVector8.putInt((int) (short) 0);
        org.mockito.asm.ByteVector byteVector12 = byteVector10.putShort((int) (short) 1);
        org.mockito.asm.ByteVector byteVector14 = byteVector12.putUTF8("hi!");
        org.mockito.asm.ByteVector byteVector16 = byteVector12.putLong((long) (byte) 10);
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
    public void test1925() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1925");
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
        org.mockito.asm.ByteVector byteVector26 = byteVector24.putLong((long) (byte) 10);
        org.mockito.asm.ByteVector byteVector27 = new org.mockito.asm.ByteVector();
        org.mockito.asm.ByteVector byteVector29 = byteVector27.putUTF8("hi!");
        org.mockito.asm.ByteVector byteVector31 = byteVector27.putInt(0);
        org.mockito.asm.ByteVector byteVector33 = byteVector31.putInt((int) ' ');
        org.mockito.asm.ByteVector byteVector35 = byteVector33.putLong(100L);
        byte[] byteArray39 = new byte[] { (byte) 0, (byte) 10, (byte) 1 };
        org.mockito.asm.ByteVector byteVector42 = byteVector33.putByteArray(byteArray39, 0, 0);
        // The following exception was thrown during execution in test generation
        try {
            org.mockito.asm.ByteVector byteVector45 = byteVector24.putByteArray(byteArray39, (int) (short) 0, (int) 'a');
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
        org.junit.Assert.assertNotNull(byteVector26);
        org.junit.Assert.assertNotNull(byteVector29);
        org.junit.Assert.assertNotNull(byteVector31);
        org.junit.Assert.assertNotNull(byteVector33);
        org.junit.Assert.assertNotNull(byteVector35);
        org.junit.Assert.assertNotNull(byteArray39);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray39), "[0, 10, 1]");
        org.junit.Assert.assertNotNull(byteVector42);
    }

    @Test
    public void test1926() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1926");
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
        org.mockito.asm.ByteVector byteVector22 = new org.mockito.asm.ByteVector((int) (byte) 1);
        org.mockito.asm.ByteVector byteVector24 = byteVector22.putByte((int) (short) 1);
        org.mockito.asm.ByteVector byteVector26 = byteVector22.putShort((int) (byte) 1);
        org.mockito.asm.ByteVector byteVector28 = new org.mockito.asm.ByteVector((int) (byte) 100);
        org.mockito.asm.ByteVector byteVector30 = byteVector28.putShort((int) (short) 100);
        org.mockito.asm.ByteVector byteVector31 = new org.mockito.asm.ByteVector();
        org.mockito.asm.ByteVector byteVector33 = byteVector31.putUTF8("hi!");
        org.mockito.asm.ByteVector byteVector35 = byteVector31.putLong((long) ' ');
        org.mockito.asm.ByteVector byteVector37 = byteVector35.putByte((int) 'a');
        org.mockito.asm.ByteVector byteVector39 = byteVector35.putByte((int) (short) -1);
        org.mockito.asm.ByteVector byteVector41 = byteVector35.putLong(0L);
        org.mockito.asm.ByteVector byteVector43 = byteVector35.putUTF8("hi!");
        org.mockito.asm.ByteVector byteVector45 = byteVector43.putUTF8("");
        org.mockito.asm.ByteVector byteVector47 = byteVector43.putInt((int) (byte) 10);
        org.mockito.asm.ByteVector byteVector49 = byteVector43.putByte(0);
        org.mockito.asm.ByteVector byteVector50 = new org.mockito.asm.ByteVector();
        org.mockito.asm.ByteVector byteVector52 = byteVector50.putUTF8("hi!");
        org.mockito.asm.ByteVector byteVector54 = byteVector50.putInt(0);
        org.mockito.asm.ByteVector byteVector56 = byteVector54.putInt((int) ' ');
        org.mockito.asm.ByteVector byteVector58 = byteVector56.putLong(100L);
        byte[] byteArray62 = new byte[] { (byte) 0, (byte) 10, (byte) 1 };
        org.mockito.asm.ByteVector byteVector65 = byteVector56.putByteArray(byteArray62, 0, 0);
        org.mockito.asm.ByteVector byteVector68 = byteVector49.putByteArray(byteArray62, (int) (short) 1, 0);
        org.mockito.asm.ByteVector byteVector71 = byteVector28.putByteArray(byteArray62, 0, (int) (byte) 1);
        org.mockito.asm.ByteVector byteVector74 = byteVector26.putByteArray(byteArray62, 0, 0);
        // The following exception was thrown during execution in test generation
        try {
            org.mockito.asm.ByteVector byteVector77 = byteVector18.putByteArray(byteArray62, (int) (short) 10, (int) (short) 0);
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
        org.junit.Assert.assertNotNull(byteVector24);
        org.junit.Assert.assertNotNull(byteVector26);
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
        org.junit.Assert.assertNotNull(byteVector52);
        org.junit.Assert.assertNotNull(byteVector54);
        org.junit.Assert.assertNotNull(byteVector56);
        org.junit.Assert.assertNotNull(byteVector58);
        org.junit.Assert.assertNotNull(byteArray62);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray62), "[0, 10, 1]");
        org.junit.Assert.assertNotNull(byteVector65);
        org.junit.Assert.assertNotNull(byteVector68);
        org.junit.Assert.assertNotNull(byteVector71);
        org.junit.Assert.assertNotNull(byteVector74);
    }

    @Test
    public void test1927() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1927");
        org.mockito.asm.ByteVector byteVector1 = new org.mockito.asm.ByteVector((int) '#');
        org.mockito.asm.ByteVector byteVector3 = byteVector1.putUTF8("hi!");
        org.mockito.asm.ByteVector byteVector5 = byteVector1.putUTF8("");
        org.mockito.asm.ByteVector byteVector7 = byteVector5.putInt(0);
        org.mockito.asm.ByteVector byteVector9 = byteVector7.putByte(10);
        org.junit.Assert.assertNotNull(byteVector3);
        org.junit.Assert.assertNotNull(byteVector5);
        org.junit.Assert.assertNotNull(byteVector7);
        org.junit.Assert.assertNotNull(byteVector9);
    }

    @Test
    public void test1928() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1928");
        org.mockito.asm.ByteVector byteVector1 = new org.mockito.asm.ByteVector((int) '#');
        org.mockito.asm.ByteVector byteVector3 = byteVector1.putInt(100);
        org.mockito.asm.ByteVector byteVector5 = byteVector3.putShort((int) (short) -1);
        org.mockito.asm.ByteVector byteVector7 = byteVector5.putShort((int) (short) 0);
        org.mockito.asm.ByteVector byteVector9 = byteVector7.putInt((int) (byte) -1);
        org.mockito.asm.ByteVector byteVector11 = byteVector9.putInt(100);
        org.junit.Assert.assertNotNull(byteVector3);
        org.junit.Assert.assertNotNull(byteVector5);
        org.junit.Assert.assertNotNull(byteVector7);
        org.junit.Assert.assertNotNull(byteVector9);
        org.junit.Assert.assertNotNull(byteVector11);
    }

    @Test
    public void test1929() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1929");
        org.mockito.asm.ByteVector byteVector0 = new org.mockito.asm.ByteVector();
        org.mockito.asm.ByteVector byteVector2 = byteVector0.putUTF8("hi!");
        org.mockito.asm.ByteVector byteVector4 = byteVector0.putLong((long) ' ');
        org.mockito.asm.ByteVector byteVector6 = byteVector4.putByte((int) 'a');
        org.mockito.asm.ByteVector byteVector8 = byteVector6.putByte((int) (short) -1);
        byte[] byteArray9 = null;
        org.mockito.asm.ByteVector byteVector12 = byteVector6.putByteArray(byteArray9, (int) '#', 0);
        org.mockito.asm.ByteVector byteVector14 = byteVector6.putUTF8("");
        org.mockito.asm.ByteVector byteVector16 = byteVector6.putInt((int) '4');
        org.mockito.asm.ByteVector byteVector18 = byteVector6.putInt((int) (byte) 1);
        org.mockito.asm.ByteVector byteVector20 = byteVector18.putByte((int) (short) -1);
        org.mockito.asm.ByteVector byteVector22 = byteVector18.putUTF8("hi!");
        java.lang.Class<?> wildcardClass23 = byteVector18.getClass();
        org.junit.Assert.assertNotNull(byteVector2);
        org.junit.Assert.assertNotNull(byteVector4);
        org.junit.Assert.assertNotNull(byteVector6);
        org.junit.Assert.assertNotNull(byteVector8);
        org.junit.Assert.assertNotNull(byteVector12);
        org.junit.Assert.assertNotNull(byteVector14);
        org.junit.Assert.assertNotNull(byteVector16);
        org.junit.Assert.assertNotNull(byteVector18);
        org.junit.Assert.assertNotNull(byteVector20);
        org.junit.Assert.assertNotNull(byteVector22);
        org.junit.Assert.assertNotNull(wildcardClass23);
    }

    @Test
    public void test1930() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1930");
        org.mockito.asm.ByteVector byteVector0 = new org.mockito.asm.ByteVector();
        org.mockito.asm.ByteVector byteVector2 = byteVector0.putUTF8("hi!");
        org.mockito.asm.ByteVector byteVector4 = byteVector0.putInt(0);
        org.mockito.asm.ByteVector byteVector6 = byteVector4.putInt((int) ' ');
        org.mockito.asm.ByteVector byteVector8 = byteVector6.putLong((long) (short) 10);
        org.mockito.asm.ByteVector byteVector10 = byteVector8.putUTF8("hi!");
        org.mockito.asm.ByteVector byteVector12 = byteVector8.putByte(0);
        org.mockito.asm.ByteVector byteVector14 = byteVector12.putInt((int) (short) 1);
        org.mockito.asm.ByteVector byteVector16 = byteVector14.putByte(0);
        org.mockito.asm.ByteVector byteVector18 = byteVector14.putInt(1);
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
    public void test1931() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1931");
        org.mockito.asm.ByteVector byteVector0 = new org.mockito.asm.ByteVector();
        org.mockito.asm.ByteVector byteVector2 = byteVector0.putUTF8("hi!");
        org.mockito.asm.ByteVector byteVector4 = byteVector0.putShort((int) (short) -1);
        org.mockito.asm.ByteVector byteVector6 = byteVector0.putLong(0L);
        org.mockito.asm.ByteVector byteVector8 = byteVector0.putShort((int) (byte) -1);
        org.mockito.asm.ByteVector byteVector10 = byteVector0.putInt((int) (byte) 0);
        org.mockito.asm.ByteVector byteVector12 = byteVector0.putInt((int) (byte) 1);
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
    public void test1932() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1932");
        org.mockito.asm.ByteVector byteVector0 = new org.mockito.asm.ByteVector();
        org.mockito.asm.ByteVector byteVector2 = byteVector0.putUTF8("hi!");
        org.mockito.asm.ByteVector byteVector4 = byteVector2.putLong((long) (byte) 10);
        org.mockito.asm.ByteVector byteVector6 = byteVector4.putInt((int) 'a');
        org.mockito.asm.ByteVector byteVector8 = byteVector6.putUTF8("hi!");
        org.mockito.asm.ByteVector byteVector10 = byteVector8.putByte((-1));
        org.mockito.asm.ByteVector byteVector12 = byteVector8.putInt((int) '#');
        org.mockito.asm.ByteVector byteVector14 = byteVector12.putByte((int) '#');
        org.junit.Assert.assertNotNull(byteVector2);
        org.junit.Assert.assertNotNull(byteVector4);
        org.junit.Assert.assertNotNull(byteVector6);
        org.junit.Assert.assertNotNull(byteVector8);
        org.junit.Assert.assertNotNull(byteVector10);
        org.junit.Assert.assertNotNull(byteVector12);
        org.junit.Assert.assertNotNull(byteVector14);
    }

    @Test
    public void test1933() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1933");
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
        org.mockito.asm.ByteVector byteVector21 = new org.mockito.asm.ByteVector();
        org.mockito.asm.ByteVector byteVector23 = byteVector21.putUTF8("hi!");
        org.mockito.asm.ByteVector byteVector25 = byteVector23.putInt(0);
        org.mockito.asm.ByteVector byteVector27 = byteVector23.putByte((int) (byte) 10);
        org.mockito.asm.ByteVector byteVector29 = byteVector27.putLong((-1L));
        org.mockito.asm.ByteVector byteVector31 = byteVector27.putInt((int) (byte) 100);
        org.mockito.asm.ByteVector byteVector32 = new org.mockito.asm.ByteVector();
        org.mockito.asm.ByteVector byteVector34 = byteVector32.putUTF8("hi!");
        org.mockito.asm.ByteVector byteVector36 = byteVector32.putInt(0);
        org.mockito.asm.ByteVector byteVector38 = byteVector36.putInt((int) ' ');
        org.mockito.asm.ByteVector byteVector40 = byteVector38.putLong(100L);
        byte[] byteArray44 = new byte[] { (byte) 0, (byte) 10, (byte) 1 };
        org.mockito.asm.ByteVector byteVector47 = byteVector38.putByteArray(byteArray44, 0, 0);
        org.mockito.asm.ByteVector byteVector50 = byteVector27.putByteArray(byteArray44, (int) (byte) 1, 0);
        org.mockito.asm.ByteVector byteVector53 = byteVector20.putByteArray(byteArray44, 1, 0);
        java.lang.Class<?> wildcardClass54 = byteVector20.getClass();
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
        org.junit.Assert.assertNotNull(byteVector34);
        org.junit.Assert.assertNotNull(byteVector36);
        org.junit.Assert.assertNotNull(byteVector38);
        org.junit.Assert.assertNotNull(byteVector40);
        org.junit.Assert.assertNotNull(byteArray44);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray44), "[0, 10, 1]");
        org.junit.Assert.assertNotNull(byteVector47);
        org.junit.Assert.assertNotNull(byteVector50);
        org.junit.Assert.assertNotNull(byteVector53);
        org.junit.Assert.assertNotNull(wildcardClass54);
    }

    @Test
    public void test1934() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1934");
        org.mockito.asm.ByteVector byteVector1 = new org.mockito.asm.ByteVector((int) (short) 1);
        org.mockito.asm.ByteVector byteVector3 = byteVector1.putLong((long) (byte) 1);
        org.mockito.asm.ByteVector byteVector5 = byteVector3.putShort((int) '4');
        org.mockito.asm.ByteVector byteVector7 = byteVector3.putInt((int) (byte) 10);
        java.lang.Class<?> wildcardClass8 = byteVector3.getClass();
        org.junit.Assert.assertNotNull(byteVector3);
        org.junit.Assert.assertNotNull(byteVector5);
        org.junit.Assert.assertNotNull(byteVector7);
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test1935() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1935");
        org.mockito.asm.ByteVector byteVector1 = new org.mockito.asm.ByteVector((int) (byte) 100);
        org.mockito.asm.ByteVector byteVector3 = byteVector1.putShort((int) (short) 100);
        org.mockito.asm.ByteVector byteVector5 = byteVector1.putLong((long) (short) 10);
        org.mockito.asm.ByteVector byteVector7 = byteVector5.putUTF8("");
        org.mockito.asm.ByteVector byteVector9 = byteVector5.putByte((int) (short) 10);
        org.mockito.asm.ByteVector byteVector11 = byteVector9.putShort((int) (short) 100);
        java.lang.Class<?> wildcardClass12 = byteVector9.getClass();
        org.junit.Assert.assertNotNull(byteVector3);
        org.junit.Assert.assertNotNull(byteVector5);
        org.junit.Assert.assertNotNull(byteVector7);
        org.junit.Assert.assertNotNull(byteVector9);
        org.junit.Assert.assertNotNull(byteVector11);
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test1936() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1936");
        org.mockito.asm.ByteVector byteVector0 = new org.mockito.asm.ByteVector();
        org.mockito.asm.ByteVector byteVector2 = byteVector0.putUTF8("hi!");
        org.mockito.asm.ByteVector byteVector4 = byteVector0.putShort((int) (short) -1);
        org.mockito.asm.ByteVector byteVector6 = byteVector0.putLong(0L);
        org.mockito.asm.ByteVector byteVector8 = byteVector6.putByte((int) (byte) 100);
        org.junit.Assert.assertNotNull(byteVector2);
        org.junit.Assert.assertNotNull(byteVector4);
        org.junit.Assert.assertNotNull(byteVector6);
        org.junit.Assert.assertNotNull(byteVector8);
    }

    @Test
    public void test1937() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1937");
        org.mockito.asm.ByteVector byteVector0 = new org.mockito.asm.ByteVector();
        org.mockito.asm.ByteVector byteVector2 = byteVector0.putUTF8("hi!");
        org.mockito.asm.ByteVector byteVector4 = byteVector2.putLong((long) (byte) 10);
        org.mockito.asm.ByteVector byteVector6 = byteVector2.putInt((int) (short) 1);
        org.mockito.asm.ByteVector byteVector8 = byteVector2.putLong((long) (short) 10);
        org.mockito.asm.ByteVector byteVector10 = byteVector2.putShort(10);
        org.mockito.asm.ByteVector byteVector12 = byteVector10.putInt((int) (byte) 0);
        org.mockito.asm.ByteVector byteVector14 = byteVector12.putUTF8("");
        org.mockito.asm.ByteVector byteVector16 = byteVector14.putShort((int) (byte) 100);
        org.mockito.asm.ByteVector byteVector18 = byteVector14.putByte((int) (short) 10);
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
    public void test1938() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1938");
        org.mockito.asm.ByteVector byteVector1 = new org.mockito.asm.ByteVector((int) '#');
        org.mockito.asm.ByteVector byteVector3 = byteVector1.putInt(100);
        org.mockito.asm.ByteVector byteVector5 = byteVector3.putUTF8("hi!");
        org.mockito.asm.ByteVector byteVector7 = byteVector3.putInt((int) (short) -1);
        org.mockito.asm.ByteVector byteVector9 = byteVector3.putUTF8("hi!");
        org.mockito.asm.ByteVector byteVector11 = byteVector9.putByte((int) (short) -1);
        org.junit.Assert.assertNotNull(byteVector3);
        org.junit.Assert.assertNotNull(byteVector5);
        org.junit.Assert.assertNotNull(byteVector7);
        org.junit.Assert.assertNotNull(byteVector9);
        org.junit.Assert.assertNotNull(byteVector11);
    }

    @Test
    public void test1939() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1939");
        org.mockito.asm.ByteVector byteVector0 = new org.mockito.asm.ByteVector();
        org.mockito.asm.ByteVector byteVector2 = byteVector0.putUTF8("hi!");
        org.mockito.asm.ByteVector byteVector4 = byteVector0.putShort((int) (short) -1);
        org.mockito.asm.ByteVector byteVector6 = byteVector4.putUTF8("");
        org.mockito.asm.ByteVector byteVector8 = byteVector4.putUTF8("hi!");
        org.mockito.asm.ByteVector byteVector10 = byteVector4.putLong((long) 1);
        org.mockito.asm.ByteVector byteVector12 = byteVector10.putInt(100);
        org.mockito.asm.ByteVector byteVector14 = byteVector10.putLong((long) (short) 0);
        org.junit.Assert.assertNotNull(byteVector2);
        org.junit.Assert.assertNotNull(byteVector4);
        org.junit.Assert.assertNotNull(byteVector6);
        org.junit.Assert.assertNotNull(byteVector8);
        org.junit.Assert.assertNotNull(byteVector10);
        org.junit.Assert.assertNotNull(byteVector12);
        org.junit.Assert.assertNotNull(byteVector14);
    }

    @Test
    public void test1940() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1940");
        org.mockito.asm.ByteVector byteVector0 = new org.mockito.asm.ByteVector();
        org.mockito.asm.ByteVector byteVector2 = byteVector0.putUTF8("hi!");
        org.mockito.asm.ByteVector byteVector4 = byteVector2.putInt((int) (byte) 10);
        org.mockito.asm.ByteVector byteVector6 = byteVector2.putLong((long) 10);
        org.mockito.asm.ByteVector byteVector8 = byteVector2.putUTF8("");
        org.mockito.asm.ByteVector byteVector10 = byteVector2.putShort(0);
        org.mockito.asm.ByteVector byteVector12 = byteVector10.putByte((int) (byte) 10);
        org.junit.Assert.assertNotNull(byteVector2);
        org.junit.Assert.assertNotNull(byteVector4);
        org.junit.Assert.assertNotNull(byteVector6);
        org.junit.Assert.assertNotNull(byteVector8);
        org.junit.Assert.assertNotNull(byteVector10);
        org.junit.Assert.assertNotNull(byteVector12);
    }

    @Test
    public void test1941() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1941");
        org.mockito.asm.ByteVector byteVector0 = new org.mockito.asm.ByteVector();
        org.mockito.asm.ByteVector byteVector2 = byteVector0.putUTF8("hi!");
        org.mockito.asm.ByteVector byteVector4 = byteVector0.putLong((long) (short) 1);
        org.mockito.asm.ByteVector byteVector6 = byteVector4.putUTF8("");
        org.mockito.asm.ByteVector byteVector8 = byteVector6.putShort((int) (short) 0);
        org.mockito.asm.ByteVector byteVector10 = byteVector8.putLong((long) (short) 100);
        byte[] byteArray11 = null;
        org.mockito.asm.ByteVector byteVector14 = byteVector10.putByteArray(byteArray11, 10, (-1));
        org.junit.Assert.assertNotNull(byteVector2);
        org.junit.Assert.assertNotNull(byteVector4);
        org.junit.Assert.assertNotNull(byteVector6);
        org.junit.Assert.assertNotNull(byteVector8);
        org.junit.Assert.assertNotNull(byteVector10);
        org.junit.Assert.assertNotNull(byteVector14);
    }

    @Test
    public void test1942() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1942");
        org.mockito.asm.ByteVector byteVector0 = new org.mockito.asm.ByteVector();
        org.mockito.asm.ByteVector byteVector2 = byteVector0.putUTF8("hi!");
        org.mockito.asm.ByteVector byteVector4 = byteVector0.putByte((int) (byte) 1);
        org.mockito.asm.ByteVector byteVector6 = byteVector0.putLong((long) (short) 1);
        org.mockito.asm.ByteVector byteVector8 = byteVector0.putLong((long) ' ');
        org.mockito.asm.ByteVector byteVector10 = byteVector0.putUTF8("");
        org.mockito.asm.ByteVector byteVector12 = byteVector10.putInt((int) ' ');
        org.mockito.asm.ByteVector byteVector14 = byteVector12.putInt(10);
        org.junit.Assert.assertNotNull(byteVector2);
        org.junit.Assert.assertNotNull(byteVector4);
        org.junit.Assert.assertNotNull(byteVector6);
        org.junit.Assert.assertNotNull(byteVector8);
        org.junit.Assert.assertNotNull(byteVector10);
        org.junit.Assert.assertNotNull(byteVector12);
        org.junit.Assert.assertNotNull(byteVector14);
    }

    @Test
    public void test1943() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1943");
        org.mockito.asm.ByteVector byteVector0 = new org.mockito.asm.ByteVector();
        org.mockito.asm.ByteVector byteVector2 = byteVector0.putUTF8("hi!");
        org.mockito.asm.ByteVector byteVector4 = byteVector0.putInt(0);
        org.mockito.asm.ByteVector byteVector6 = byteVector4.putInt((int) ' ');
        org.mockito.asm.ByteVector byteVector8 = byteVector6.putLong((long) (short) 10);
        org.mockito.asm.ByteVector byteVector10 = byteVector6.putInt((int) '4');
        org.mockito.asm.ByteVector byteVector12 = byteVector10.putShort((int) ' ');
        org.junit.Assert.assertNotNull(byteVector2);
        org.junit.Assert.assertNotNull(byteVector4);
        org.junit.Assert.assertNotNull(byteVector6);
        org.junit.Assert.assertNotNull(byteVector8);
        org.junit.Assert.assertNotNull(byteVector10);
        org.junit.Assert.assertNotNull(byteVector12);
    }

    @Test
    public void test1944() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1944");
        org.mockito.asm.ByteVector byteVector0 = new org.mockito.asm.ByteVector();
        org.mockito.asm.ByteVector byteVector2 = byteVector0.putUTF8("hi!");
        org.mockito.asm.ByteVector byteVector4 = byteVector2.putInt(0);
        org.mockito.asm.ByteVector byteVector6 = byteVector4.putByte((int) (byte) 1);
        org.mockito.asm.ByteVector byteVector8 = byteVector6.putShort((int) (byte) 10);
        org.mockito.asm.ByteVector byteVector10 = byteVector6.putByte(0);
        org.junit.Assert.assertNotNull(byteVector2);
        org.junit.Assert.assertNotNull(byteVector4);
        org.junit.Assert.assertNotNull(byteVector6);
        org.junit.Assert.assertNotNull(byteVector8);
        org.junit.Assert.assertNotNull(byteVector10);
    }

    @Test
    public void test1945() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1945");
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
        org.mockito.asm.ByteVector byteVector30 = byteVector26.putInt(10);
        org.mockito.asm.ByteVector byteVector32 = byteVector30.putUTF8("");
        org.mockito.asm.ByteVector byteVector34 = byteVector32.putInt((int) (byte) -1);
        org.mockito.asm.ByteVector byteVector36 = byteVector34.putInt(0);
        java.lang.Class<?> wildcardClass37 = byteVector36.getClass();
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
        org.junit.Assert.assertNotNull(wildcardClass37);
    }

    @Test
    public void test1946() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1946");
        org.mockito.asm.ByteVector byteVector0 = new org.mockito.asm.ByteVector();
        org.mockito.asm.ByteVector byteVector2 = byteVector0.putUTF8("hi!");
        org.mockito.asm.ByteVector byteVector4 = byteVector0.putShort((int) (short) -1);
        org.mockito.asm.ByteVector byteVector6 = byteVector0.putInt((int) (byte) 10);
        org.mockito.asm.ByteVector byteVector8 = byteVector6.putUTF8("hi!");
        org.mockito.asm.ByteVector byteVector10 = byteVector8.putByte((int) (byte) 1);
        org.mockito.asm.ByteVector byteVector12 = byteVector10.putUTF8("hi!");
        org.mockito.asm.ByteVector byteVector14 = byteVector10.putInt(0);
        org.mockito.asm.ByteVector byteVector16 = byteVector10.putInt((int) '#');
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
    public void test1947() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1947");
        org.mockito.asm.ByteVector byteVector1 = new org.mockito.asm.ByteVector((int) '#');
        org.mockito.asm.ByteVector byteVector3 = byteVector1.putInt(100);
        org.mockito.asm.ByteVector byteVector5 = byteVector3.putShort((int) (short) -1);
        org.mockito.asm.ByteVector byteVector7 = byteVector5.putShort((int) (short) 0);
        org.mockito.asm.ByteVector byteVector9 = byteVector5.putUTF8("");
        org.mockito.asm.ByteVector byteVector11 = byteVector9.putUTF8("hi!");
        org.mockito.asm.ByteVector byteVector13 = byteVector11.putShort((int) (short) 1);
        org.junit.Assert.assertNotNull(byteVector3);
        org.junit.Assert.assertNotNull(byteVector5);
        org.junit.Assert.assertNotNull(byteVector7);
        org.junit.Assert.assertNotNull(byteVector9);
        org.junit.Assert.assertNotNull(byteVector11);
        org.junit.Assert.assertNotNull(byteVector13);
    }

    @Test
    public void test1948() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1948");
        org.mockito.asm.ByteVector byteVector0 = new org.mockito.asm.ByteVector();
        org.mockito.asm.ByteVector byteVector2 = byteVector0.putUTF8("hi!");
        org.mockito.asm.ByteVector byteVector4 = byteVector0.putLong((long) ' ');
        org.mockito.asm.ByteVector byteVector6 = byteVector4.putByte((int) 'a');
        org.mockito.asm.ByteVector byteVector8 = byteVector6.putInt((int) (short) 1);
        org.mockito.asm.ByteVector byteVector10 = byteVector8.putShort((int) (byte) 100);
        org.mockito.asm.ByteVector byteVector12 = byteVector10.putInt((int) '#');
        org.mockito.asm.ByteVector byteVector14 = byteVector10.putLong((long) '4');
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
            org.mockito.asm.ByteVector byteVector64 = byteVector10.putByteArray(byteArray52, (int) ' ', (int) '#');
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
    public void test1949() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1949");
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
        org.mockito.asm.ByteVector byteVector72 = byteVector14.putLong((long) 'a');
        org.mockito.asm.ByteVector byteVector74 = byteVector72.putUTF8("");
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
        org.junit.Assert.assertNotNull(byteVector74);
    }

    @Test
    public void test1950() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1950");
        org.mockito.asm.ByteVector byteVector0 = new org.mockito.asm.ByteVector();
        org.mockito.asm.ByteVector byteVector2 = byteVector0.putUTF8("hi!");
        org.mockito.asm.ByteVector byteVector4 = byteVector2.putInt((int) (byte) 10);
        org.mockito.asm.ByteVector byteVector6 = byteVector4.putUTF8("");
        org.mockito.asm.ByteVector byteVector8 = byteVector4.putInt((int) (short) 100);
        org.mockito.asm.ByteVector byteVector10 = byteVector8.putInt((-1));
        org.junit.Assert.assertNotNull(byteVector2);
        org.junit.Assert.assertNotNull(byteVector4);
        org.junit.Assert.assertNotNull(byteVector6);
        org.junit.Assert.assertNotNull(byteVector8);
        org.junit.Assert.assertNotNull(byteVector10);
    }

    @Test
    public void test1951() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1951");
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
        org.mockito.asm.ByteVector byteVector75 = byteVector10.putLong(0L);
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
    public void test1952() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1952");
        org.mockito.asm.ByteVector byteVector0 = new org.mockito.asm.ByteVector();
        org.mockito.asm.ByteVector byteVector2 = byteVector0.putUTF8("hi!");
        org.mockito.asm.ByteVector byteVector4 = byteVector0.putShort((int) (short) -1);
        org.mockito.asm.ByteVector byteVector6 = byteVector0.putLong(0L);
        org.mockito.asm.ByteVector byteVector8 = byteVector0.putShort((int) (byte) -1);
        org.mockito.asm.ByteVector byteVector10 = byteVector0.putInt((int) (short) 100);
        org.mockito.asm.ByteVector byteVector12 = byteVector10.putLong((long) 1);
        org.junit.Assert.assertNotNull(byteVector2);
        org.junit.Assert.assertNotNull(byteVector4);
        org.junit.Assert.assertNotNull(byteVector6);
        org.junit.Assert.assertNotNull(byteVector8);
        org.junit.Assert.assertNotNull(byteVector10);
        org.junit.Assert.assertNotNull(byteVector12);
    }

    @Test
    public void test1953() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1953");
        org.mockito.asm.ByteVector byteVector0 = new org.mockito.asm.ByteVector();
        org.mockito.asm.ByteVector byteVector2 = byteVector0.putUTF8("hi!");
        org.mockito.asm.ByteVector byteVector4 = byteVector0.putShort((int) (short) -1);
        org.mockito.asm.ByteVector byteVector6 = byteVector0.putInt((int) (byte) 10);
        org.mockito.asm.ByteVector byteVector8 = byteVector6.putUTF8("hi!");
        org.mockito.asm.ByteVector byteVector10 = byteVector8.putByte((int) (byte) 1);
        org.mockito.asm.ByteVector byteVector12 = byteVector10.putUTF8("hi!");
        org.mockito.asm.ByteVector byteVector14 = byteVector12.putByte((int) (byte) 10);
        org.mockito.asm.ByteVector byteVector16 = byteVector12.putLong((long) ' ');
        org.mockito.asm.ByteVector byteVector18 = byteVector16.putInt((int) ' ');
        org.mockito.asm.ByteVector byteVector20 = byteVector16.putInt((int) '#');
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
    public void test1954() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1954");
        org.mockito.asm.ByteVector byteVector0 = new org.mockito.asm.ByteVector();
        org.mockito.asm.ByteVector byteVector2 = byteVector0.putUTF8("hi!");
        org.mockito.asm.ByteVector byteVector4 = byteVector2.putLong((long) (byte) 10);
        org.mockito.asm.ByteVector byteVector6 = byteVector4.putUTF8("hi!");
        org.mockito.asm.ByteVector byteVector8 = byteVector4.putLong((-1L));
        org.mockito.asm.ByteVector byteVector10 = byteVector8.putInt(10);
        org.mockito.asm.ByteVector byteVector12 = byteVector10.putShort((-1));
        org.mockito.asm.ByteVector byteVector14 = byteVector12.putInt((-1));
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
    public void test1955() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1955");
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
        org.mockito.asm.ByteVector byteVector24 = byteVector20.putLong((long) (short) 100);
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
    public void test1956() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1956");
        org.mockito.asm.ByteVector byteVector0 = new org.mockito.asm.ByteVector();
        org.mockito.asm.ByteVector byteVector2 = byteVector0.putUTF8("hi!");
        org.mockito.asm.ByteVector byteVector4 = byteVector2.putInt(0);
        org.mockito.asm.ByteVector byteVector6 = byteVector2.putByte((int) (byte) 10);
        org.mockito.asm.ByteVector byteVector8 = byteVector6.putLong(0L);
        org.mockito.asm.ByteVector byteVector10 = byteVector8.putShort((int) 'a');
        org.mockito.asm.ByteVector byteVector12 = byteVector10.putByte((int) ' ');
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
    public void test1957() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1957");
        org.mockito.asm.ByteVector byteVector1 = new org.mockito.asm.ByteVector((int) '#');
        org.mockito.asm.ByteVector byteVector3 = byteVector1.putInt(100);
        org.mockito.asm.ByteVector byteVector5 = byteVector1.putInt((int) (byte) 1);
        org.mockito.asm.ByteVector byteVector7 = byteVector5.putLong(10L);
        org.mockito.asm.ByteVector byteVector9 = byteVector5.putInt((-1));
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
    public void test1958() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1958");
        org.mockito.asm.ByteVector byteVector0 = new org.mockito.asm.ByteVector();
        org.mockito.asm.ByteVector byteVector2 = byteVector0.putUTF8("hi!");
        org.mockito.asm.ByteVector byteVector4 = byteVector2.putLong((long) (byte) 10);
        org.mockito.asm.ByteVector byteVector6 = byteVector4.putUTF8("hi!");
        org.mockito.asm.ByteVector byteVector8 = byteVector4.putLong((-1L));
        org.mockito.asm.ByteVector byteVector10 = byteVector8.putInt(10);
        org.mockito.asm.ByteVector byteVector12 = byteVector8.putShort((int) (byte) 0);
        org.mockito.asm.ByteVector byteVector14 = byteVector12.putShort(0);
        org.junit.Assert.assertNotNull(byteVector2);
        org.junit.Assert.assertNotNull(byteVector4);
        org.junit.Assert.assertNotNull(byteVector6);
        org.junit.Assert.assertNotNull(byteVector8);
        org.junit.Assert.assertNotNull(byteVector10);
        org.junit.Assert.assertNotNull(byteVector12);
        org.junit.Assert.assertNotNull(byteVector14);
    }

    @Test
    public void test1959() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1959");
        org.mockito.asm.ByteVector byteVector1 = new org.mockito.asm.ByteVector((int) '#');
        org.mockito.asm.ByteVector byteVector3 = byteVector1.putInt(100);
        org.mockito.asm.ByteVector byteVector5 = byteVector1.putInt((int) (byte) 1);
        org.mockito.asm.ByteVector byteVector7 = byteVector5.putLong(10L);
        org.mockito.asm.ByteVector byteVector9 = byteVector5.putInt((-1));
        org.mockito.asm.ByteVector byteVector11 = byteVector9.putUTF8("hi!");
        org.mockito.asm.ByteVector byteVector13 = byteVector11.putUTF8("");
        org.mockito.asm.ByteVector byteVector15 = byteVector13.putByte((int) (short) 0);
        org.junit.Assert.assertNotNull(byteVector3);
        org.junit.Assert.assertNotNull(byteVector5);
        org.junit.Assert.assertNotNull(byteVector7);
        org.junit.Assert.assertNotNull(byteVector9);
        org.junit.Assert.assertNotNull(byteVector11);
        org.junit.Assert.assertNotNull(byteVector13);
        org.junit.Assert.assertNotNull(byteVector15);
    }

    @Test
    public void test1960() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1960");
        org.mockito.asm.ByteVector byteVector0 = new org.mockito.asm.ByteVector();
        org.mockito.asm.ByteVector byteVector2 = byteVector0.putUTF8("hi!");
        org.mockito.asm.ByteVector byteVector4 = byteVector2.putInt(0);
        org.mockito.asm.ByteVector byteVector6 = byteVector2.putByte((int) (byte) 10);
        org.mockito.asm.ByteVector byteVector8 = byteVector6.putLong(0L);
        org.mockito.asm.ByteVector byteVector10 = byteVector6.putInt((int) (short) 1);
        org.mockito.asm.ByteVector byteVector12 = byteVector10.putLong((long) 0);
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
    public void test1961() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1961");
        org.mockito.asm.ByteVector byteVector1 = new org.mockito.asm.ByteVector((int) '#');
        org.mockito.asm.ByteVector byteVector3 = byteVector1.putInt(100);
        org.mockito.asm.ByteVector byteVector5 = byteVector3.putByte((-1));
        org.mockito.asm.ByteVector byteVector7 = byteVector5.putInt((int) 'a');
        org.mockito.asm.ByteVector byteVector9 = byteVector7.putLong(100L);
        org.mockito.asm.ByteVector byteVector11 = byteVector7.putInt((int) ' ');
        org.junit.Assert.assertNotNull(byteVector3);
        org.junit.Assert.assertNotNull(byteVector5);
        org.junit.Assert.assertNotNull(byteVector7);
        org.junit.Assert.assertNotNull(byteVector9);
        org.junit.Assert.assertNotNull(byteVector11);
    }

    @Test
    public void test1962() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1962");
        org.mockito.asm.ByteVector byteVector1 = new org.mockito.asm.ByteVector((int) '#');
        org.mockito.asm.ByteVector byteVector3 = byteVector1.putInt(100);
        org.mockito.asm.ByteVector byteVector5 = byteVector1.putInt((int) (byte) 1);
        org.mockito.asm.ByteVector byteVector7 = byteVector5.putLong(10L);
        org.mockito.asm.ByteVector byteVector9 = byteVector5.putInt((-1));
        org.mockito.asm.ByteVector byteVector11 = byteVector9.putUTF8("hi!");
        org.mockito.asm.ByteVector byteVector13 = byteVector11.putUTF8("");
        org.mockito.asm.ByteVector byteVector15 = byteVector11.putInt((int) (short) 10);
        org.junit.Assert.assertNotNull(byteVector3);
        org.junit.Assert.assertNotNull(byteVector5);
        org.junit.Assert.assertNotNull(byteVector7);
        org.junit.Assert.assertNotNull(byteVector9);
        org.junit.Assert.assertNotNull(byteVector11);
        org.junit.Assert.assertNotNull(byteVector13);
        org.junit.Assert.assertNotNull(byteVector15);
    }

    @Test
    public void test1963() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1963");
        org.mockito.asm.ByteVector byteVector0 = new org.mockito.asm.ByteVector();
        org.mockito.asm.ByteVector byteVector2 = byteVector0.putUTF8("hi!");
        org.mockito.asm.ByteVector byteVector4 = byteVector0.putShort((int) (short) 100);
        org.mockito.asm.ByteVector byteVector6 = byteVector4.putLong((long) (byte) -1);
        org.mockito.asm.ByteVector byteVector8 = byteVector6.putByte((int) (byte) 0);
        org.mockito.asm.ByteVector byteVector10 = byteVector6.putShort((int) ' ');
        org.mockito.asm.ByteVector byteVector12 = byteVector6.putUTF8("");
        org.mockito.asm.ByteVector byteVector14 = byteVector12.putLong((long) '4');
        org.junit.Assert.assertNotNull(byteVector2);
        org.junit.Assert.assertNotNull(byteVector4);
        org.junit.Assert.assertNotNull(byteVector6);
        org.junit.Assert.assertNotNull(byteVector8);
        org.junit.Assert.assertNotNull(byteVector10);
        org.junit.Assert.assertNotNull(byteVector12);
        org.junit.Assert.assertNotNull(byteVector14);
    }

    @Test
    public void test1964() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1964");
        org.mockito.asm.ByteVector byteVector0 = new org.mockito.asm.ByteVector();
        org.mockito.asm.ByteVector byteVector2 = byteVector0.putUTF8("hi!");
        org.mockito.asm.ByteVector byteVector4 = byteVector2.putInt(0);
        org.mockito.asm.ByteVector byteVector6 = byteVector2.putByte((int) (byte) 10);
        org.mockito.asm.ByteVector byteVector8 = byteVector6.putUTF8("hi!");
        org.mockito.asm.ByteVector byteVector10 = byteVector8.putShort(0);
        org.mockito.asm.ByteVector byteVector12 = byteVector10.putUTF8("");
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
            org.mockito.asm.ByteVector byteVector62 = byteVector10.putByteArray(byteArray50, (int) (short) 10, 1);
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
    public void test1965() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1965");
        org.mockito.asm.ByteVector byteVector0 = new org.mockito.asm.ByteVector();
        org.mockito.asm.ByteVector byteVector2 = byteVector0.putUTF8("hi!");
        org.mockito.asm.ByteVector byteVector4 = byteVector0.putShort((int) (short) -1);
        org.mockito.asm.ByteVector byteVector6 = byteVector0.putInt(0);
        org.mockito.asm.ByteVector byteVector8 = byteVector0.putUTF8("hi!");
        org.mockito.asm.ByteVector byteVector10 = byteVector0.putByte(100);
        org.mockito.asm.ByteVector byteVector12 = byteVector0.putInt((int) ' ');
        org.mockito.asm.ByteVector byteVector14 = byteVector12.putByte((int) (short) 1);
        org.mockito.asm.ByteVector byteVector16 = byteVector12.putLong((long) (byte) -1);
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
    public void test1966() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1966");
        org.mockito.asm.ByteVector byteVector0 = new org.mockito.asm.ByteVector();
        org.mockito.asm.ByteVector byteVector2 = byteVector0.putUTF8("hi!");
        org.mockito.asm.ByteVector byteVector4 = byteVector0.putLong((long) ' ');
        org.mockito.asm.ByteVector byteVector6 = byteVector4.putByte((int) 'a');
        org.mockito.asm.ByteVector byteVector8 = byteVector4.putInt(1);
        org.junit.Assert.assertNotNull(byteVector2);
        org.junit.Assert.assertNotNull(byteVector4);
        org.junit.Assert.assertNotNull(byteVector6);
        org.junit.Assert.assertNotNull(byteVector8);
    }

    @Test
    public void test1967() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1967");
        org.mockito.asm.ByteVector byteVector0 = new org.mockito.asm.ByteVector();
        org.mockito.asm.ByteVector byteVector2 = byteVector0.putUTF8("hi!");
        org.mockito.asm.ByteVector byteVector4 = byteVector0.putLong((long) (short) 1);
        org.mockito.asm.ByteVector byteVector6 = byteVector4.putShort((int) (byte) -1);
        org.mockito.asm.ByteVector byteVector8 = byteVector4.putUTF8("");
        org.mockito.asm.ByteVector byteVector10 = byteVector8.putShort((int) (short) -1);
        org.mockito.asm.ByteVector byteVector12 = byteVector8.putUTF8("");
        org.junit.Assert.assertNotNull(byteVector2);
        org.junit.Assert.assertNotNull(byteVector4);
        org.junit.Assert.assertNotNull(byteVector6);
        org.junit.Assert.assertNotNull(byteVector8);
        org.junit.Assert.assertNotNull(byteVector10);
        org.junit.Assert.assertNotNull(byteVector12);
    }

    @Test
    public void test1968() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1968");
        org.mockito.asm.ByteVector byteVector0 = new org.mockito.asm.ByteVector();
        org.mockito.asm.ByteVector byteVector2 = byteVector0.putUTF8("hi!");
        org.mockito.asm.ByteVector byteVector4 = byteVector0.putShort((int) (short) 100);
        org.mockito.asm.ByteVector byteVector6 = byteVector4.putLong((long) (byte) -1);
        org.mockito.asm.ByteVector byteVector8 = byteVector6.putByte((int) (byte) 0);
        org.mockito.asm.ByteVector byteVector10 = byteVector6.putShort((int) ' ');
        org.mockito.asm.ByteVector byteVector12 = byteVector6.putLong((-1L));
        org.junit.Assert.assertNotNull(byteVector2);
        org.junit.Assert.assertNotNull(byteVector4);
        org.junit.Assert.assertNotNull(byteVector6);
        org.junit.Assert.assertNotNull(byteVector8);
        org.junit.Assert.assertNotNull(byteVector10);
        org.junit.Assert.assertNotNull(byteVector12);
    }

    @Test
    public void test1969() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1969");
        org.mockito.asm.ByteVector byteVector0 = new org.mockito.asm.ByteVector();
        org.mockito.asm.ByteVector byteVector2 = byteVector0.putUTF8("hi!");
        org.mockito.asm.ByteVector byteVector4 = byteVector2.putInt(0);
        org.mockito.asm.ByteVector byteVector6 = byteVector4.putByte((int) (byte) 1);
        org.mockito.asm.ByteVector byteVector8 = byteVector6.putLong((long) (-1));
        org.mockito.asm.ByteVector byteVector10 = byteVector8.putByte((int) '#');
        org.junit.Assert.assertNotNull(byteVector2);
        org.junit.Assert.assertNotNull(byteVector4);
        org.junit.Assert.assertNotNull(byteVector6);
        org.junit.Assert.assertNotNull(byteVector8);
        org.junit.Assert.assertNotNull(byteVector10);
    }

    @Test
    public void test1970() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1970");
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
        org.mockito.asm.ByteVector byteVector20 = byteVector10.putInt((int) (byte) 10);
        org.mockito.asm.ByteVector byteVector22 = byteVector10.putInt((int) (byte) 0);
        org.mockito.asm.ByteVector byteVector24 = byteVector22.putByte((-1));
        org.mockito.asm.ByteVector byteVector26 = byteVector22.putLong((-1L));
        org.mockito.asm.ByteVector byteVector28 = byteVector26.putInt((int) '#');
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
        org.junit.Assert.assertNotNull(byteVector20);
        org.junit.Assert.assertNotNull(byteVector22);
        org.junit.Assert.assertNotNull(byteVector24);
        org.junit.Assert.assertNotNull(byteVector26);
        org.junit.Assert.assertNotNull(byteVector28);
        org.junit.Assert.assertNotNull(wildcardClass29);
    }

    @Test
    public void test1971() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1971");
        org.mockito.asm.ByteVector byteVector0 = new org.mockito.asm.ByteVector();
        org.mockito.asm.ByteVector byteVector2 = byteVector0.putUTF8("hi!");
        org.mockito.asm.ByteVector byteVector4 = byteVector0.putInt(0);
        org.mockito.asm.ByteVector byteVector6 = byteVector0.putShort(10);
        org.mockito.asm.ByteVector byteVector8 = byteVector0.putUTF8("");
        org.mockito.asm.ByteVector byteVector10 = byteVector8.putByte(0);
        org.mockito.asm.ByteVector byteVector12 = byteVector8.putInt((int) '#');
        org.mockito.asm.ByteVector byteVector14 = byteVector12.putShort((int) '#');
        org.mockito.asm.ByteVector byteVector16 = byteVector14.putLong((long) 'a');
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
    public void test1972() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1972");
        org.mockito.asm.ByteVector byteVector0 = new org.mockito.asm.ByteVector();
        org.mockito.asm.ByteVector byteVector2 = byteVector0.putUTF8("hi!");
        org.mockito.asm.ByteVector byteVector4 = byteVector2.putByte(100);
        org.mockito.asm.ByteVector byteVector6 = byteVector2.putLong((long) 10);
        org.mockito.asm.ByteVector byteVector8 = byteVector2.putShort((int) (short) -1);
        org.mockito.asm.ByteVector byteVector10 = byteVector2.putInt((int) (byte) 100);
        java.lang.Class<?> wildcardClass11 = byteVector2.getClass();
        org.junit.Assert.assertNotNull(byteVector2);
        org.junit.Assert.assertNotNull(byteVector4);
        org.junit.Assert.assertNotNull(byteVector6);
        org.junit.Assert.assertNotNull(byteVector8);
        org.junit.Assert.assertNotNull(byteVector10);
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test1973() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1973");
        org.mockito.asm.ByteVector byteVector0 = new org.mockito.asm.ByteVector();
        org.mockito.asm.ByteVector byteVector2 = byteVector0.putUTF8("hi!");
        org.mockito.asm.ByteVector byteVector4 = byteVector0.putInt(0);
        org.mockito.asm.ByteVector byteVector6 = byteVector0.putShort((int) '4');
        org.mockito.asm.ByteVector byteVector8 = byteVector0.putByte(100);
        org.mockito.asm.ByteVector byteVector10 = byteVector8.putInt((int) (byte) 10);
        org.mockito.asm.ByteVector byteVector12 = byteVector8.putInt((int) (byte) 10);
        org.mockito.asm.ByteVector byteVector14 = byteVector12.putByte(100);
        org.mockito.asm.ByteVector byteVector16 = byteVector12.putInt((int) (byte) 1);
        org.mockito.asm.ByteVector byteVector18 = byteVector12.putShort((int) (short) 10);
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
    public void test1974() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1974");
        org.mockito.asm.ByteVector byteVector1 = new org.mockito.asm.ByteVector((int) '#');
        org.mockito.asm.ByteVector byteVector3 = byteVector1.putLong(100L);
        org.mockito.asm.ByteVector byteVector5 = byteVector3.putLong(1L);
        org.mockito.asm.ByteVector byteVector7 = byteVector5.putUTF8("hi!");
        org.mockito.asm.ByteVector byteVector9 = byteVector7.putUTF8("");
        org.mockito.asm.ByteVector byteVector11 = byteVector9.putShort((int) (byte) -1);
        org.mockito.asm.ByteVector byteVector13 = byteVector9.putLong((long) (short) -1);
        org.mockito.asm.ByteVector byteVector14 = new org.mockito.asm.ByteVector();
        org.mockito.asm.ByteVector byteVector16 = byteVector14.putUTF8("hi!");
        org.mockito.asm.ByteVector byteVector18 = byteVector14.putLong((long) ' ');
        org.mockito.asm.ByteVector byteVector20 = byteVector18.putByte((int) 'a');
        org.mockito.asm.ByteVector byteVector22 = byteVector18.putByte((int) (short) -1);
        org.mockito.asm.ByteVector byteVector24 = byteVector18.putLong(0L);
        org.mockito.asm.ByteVector byteVector26 = byteVector24.putByte(0);
        org.mockito.asm.ByteVector byteVector28 = byteVector26.putLong(1L);
        org.mockito.asm.ByteVector byteVector30 = byteVector28.putShort((int) 'a');
        org.mockito.asm.ByteVector byteVector32 = byteVector28.putLong((long) 10);
        org.mockito.asm.ByteVector byteVector34 = byteVector28.putUTF8("");
        org.mockito.asm.ByteVector byteVector35 = new org.mockito.asm.ByteVector();
        org.mockito.asm.ByteVector byteVector37 = byteVector35.putUTF8("hi!");
        org.mockito.asm.ByteVector byteVector39 = byteVector37.putLong((long) (byte) 10);
        org.mockito.asm.ByteVector byteVector41 = byteVector39.putUTF8("hi!");
        org.mockito.asm.ByteVector byteVector43 = byteVector39.putLong((long) (short) -1);
        org.mockito.asm.ByteVector byteVector45 = byteVector43.putInt(10);
        org.mockito.asm.ByteVector byteVector47 = byteVector43.putByte((int) (short) 1);
        org.mockito.asm.ByteVector byteVector49 = byteVector43.putInt((int) (short) -1);
        org.mockito.asm.ByteVector byteVector51 = byteVector43.putUTF8("hi!");
        org.mockito.asm.ByteVector byteVector52 = new org.mockito.asm.ByteVector();
        org.mockito.asm.ByteVector byteVector54 = byteVector52.putUTF8("hi!");
        org.mockito.asm.ByteVector byteVector56 = byteVector52.putLong((long) ' ');
        org.mockito.asm.ByteVector byteVector58 = byteVector56.putByte((int) 'a');
        org.mockito.asm.ByteVector byteVector60 = byteVector56.putByte((int) (short) -1);
        org.mockito.asm.ByteVector byteVector62 = byteVector56.putLong(0L);
        org.mockito.asm.ByteVector byteVector64 = byteVector56.putUTF8("hi!");
        org.mockito.asm.ByteVector byteVector66 = byteVector64.putUTF8("");
        org.mockito.asm.ByteVector byteVector68 = byteVector66.putLong((long) (byte) 10);
        org.mockito.asm.ByteVector byteVector70 = byteVector66.putLong((long) (short) 100);
        byte[] byteArray75 = new byte[] { (byte) 1, (byte) 0, (byte) 0, (byte) -1 };
        org.mockito.asm.ByteVector byteVector78 = byteVector66.putByteArray(byteArray75, 0, 0);
        org.mockito.asm.ByteVector byteVector81 = byteVector51.putByteArray(byteArray75, (int) (byte) 0, (int) (short) 1);
        org.mockito.asm.ByteVector byteVector84 = byteVector28.putByteArray(byteArray75, (int) (short) 0, (int) (short) 0);
        // The following exception was thrown during execution in test generation
        try {
            org.mockito.asm.ByteVector byteVector87 = byteVector9.putByteArray(byteArray75, (int) 'a', (int) (byte) 10);
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
        org.junit.Assert.assertNotNull(byteVector54);
        org.junit.Assert.assertNotNull(byteVector56);
        org.junit.Assert.assertNotNull(byteVector58);
        org.junit.Assert.assertNotNull(byteVector60);
        org.junit.Assert.assertNotNull(byteVector62);
        org.junit.Assert.assertNotNull(byteVector64);
        org.junit.Assert.assertNotNull(byteVector66);
        org.junit.Assert.assertNotNull(byteVector68);
        org.junit.Assert.assertNotNull(byteVector70);
        org.junit.Assert.assertNotNull(byteArray75);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray75), "[1, 0, 0, -1]");
        org.junit.Assert.assertNotNull(byteVector78);
        org.junit.Assert.assertNotNull(byteVector81);
        org.junit.Assert.assertNotNull(byteVector84);
    }

    @Test
    public void test1975() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1975");
        org.mockito.asm.ByteVector byteVector0 = new org.mockito.asm.ByteVector();
        org.mockito.asm.ByteVector byteVector2 = byteVector0.putUTF8("hi!");
        org.mockito.asm.ByteVector byteVector4 = byteVector2.putInt(0);
        org.mockito.asm.ByteVector byteVector6 = byteVector2.putByte((int) (byte) 10);
        org.mockito.asm.ByteVector byteVector8 = byteVector6.putLong((-1L));
        org.mockito.asm.ByteVector byteVector10 = new org.mockito.asm.ByteVector((int) (byte) 10);
        org.mockito.asm.ByteVector byteVector12 = byteVector10.putByte((int) '4');
        org.mockito.asm.ByteVector byteVector14 = byteVector10.putLong(0L);
        org.mockito.asm.ByteVector byteVector16 = byteVector14.putByte(10);
        org.mockito.asm.ByteVector byteVector18 = byteVector14.putUTF8("hi!");
        org.mockito.asm.ByteVector byteVector20 = byteVector18.putLong((long) (byte) 0);
        byte[] byteArray21 = null;
        org.mockito.asm.ByteVector byteVector24 = byteVector20.putByteArray(byteArray21, (int) (short) 10, (int) '#');
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
        org.mockito.asm.ByteVector byteVector87 = byteVector20.putByteArray(byteArray75, 0, (int) (byte) 1);
        // The following exception was thrown during execution in test generation
        try {
            org.mockito.asm.ByteVector byteVector90 = byteVector8.putByteArray(byteArray75, (int) (byte) 0, (-1));
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
        org.junit.Assert.assertNotNull(byteVector20);
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
        org.junit.Assert.assertNotNull(byteVector87);
    }

    @Test
    public void test1976() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1976");
        org.mockito.asm.ByteVector byteVector1 = new org.mockito.asm.ByteVector((int) '#');
        org.mockito.asm.ByteVector byteVector3 = byteVector1.putLong(100L);
        org.mockito.asm.ByteVector byteVector5 = byteVector3.putLong(1L);
        org.mockito.asm.ByteVector byteVector7 = byteVector5.putUTF8("hi!");
        org.mockito.asm.ByteVector byteVector9 = byteVector5.putLong((long) (byte) 1);
        org.mockito.asm.ByteVector byteVector11 = byteVector5.putLong(100L);
        org.mockito.asm.ByteVector byteVector13 = byteVector11.putShort((int) (byte) 0);
        org.junit.Assert.assertNotNull(byteVector3);
        org.junit.Assert.assertNotNull(byteVector5);
        org.junit.Assert.assertNotNull(byteVector7);
        org.junit.Assert.assertNotNull(byteVector9);
        org.junit.Assert.assertNotNull(byteVector11);
        org.junit.Assert.assertNotNull(byteVector13);
    }

    @Test
    public void test1977() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1977");
        org.mockito.asm.ByteVector byteVector0 = new org.mockito.asm.ByteVector();
        org.mockito.asm.ByteVector byteVector2 = byteVector0.putUTF8("hi!");
        org.mockito.asm.ByteVector byteVector4 = byteVector0.putInt(0);
        org.mockito.asm.ByteVector byteVector6 = byteVector0.putShort((int) '4');
        org.mockito.asm.ByteVector byteVector8 = byteVector0.putByte(100);
        org.mockito.asm.ByteVector byteVector10 = byteVector8.putInt((int) (byte) 10);
        org.mockito.asm.ByteVector byteVector12 = byteVector10.putByte((int) (byte) 1);
        org.mockito.asm.ByteVector byteVector14 = byteVector12.putUTF8("hi!");
        org.mockito.asm.ByteVector byteVector16 = byteVector14.putInt((int) (byte) 0);
        org.mockito.asm.ByteVector byteVector18 = byteVector16.putInt((int) (byte) 0);
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
    public void test1978() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1978");
        org.mockito.asm.ByteVector byteVector1 = new org.mockito.asm.ByteVector((int) '#');
        org.mockito.asm.ByteVector byteVector3 = byteVector1.putLong(100L);
        org.mockito.asm.ByteVector byteVector5 = byteVector3.putLong(1L);
        org.mockito.asm.ByteVector byteVector7 = byteVector5.putUTF8("hi!");
        org.mockito.asm.ByteVector byteVector9 = byteVector5.putLong((long) (byte) 1);
        org.mockito.asm.ByteVector byteVector11 = byteVector5.putLong(100L);
        java.lang.Class<?> wildcardClass12 = byteVector5.getClass();
        org.junit.Assert.assertNotNull(byteVector3);
        org.junit.Assert.assertNotNull(byteVector5);
        org.junit.Assert.assertNotNull(byteVector7);
        org.junit.Assert.assertNotNull(byteVector9);
        org.junit.Assert.assertNotNull(byteVector11);
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test1979() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1979");
        org.mockito.asm.ByteVector byteVector1 = new org.mockito.asm.ByteVector((int) '#');
        org.mockito.asm.ByteVector byteVector3 = byteVector1.putLong(100L);
        org.mockito.asm.ByteVector byteVector5 = byteVector1.putUTF8("");
        org.mockito.asm.ByteVector byteVector7 = byteVector1.putUTF8("hi!");
        org.mockito.asm.ByteVector byteVector9 = byteVector7.putLong((long) (short) 0);
        org.mockito.asm.ByteVector byteVector11 = byteVector9.putLong((long) 1);
        org.mockito.asm.ByteVector byteVector13 = byteVector11.putInt(10);
        org.mockito.asm.ByteVector byteVector15 = byteVector13.putUTF8("");
        org.mockito.asm.ByteVector byteVector17 = byteVector15.putByte((int) ' ');
        org.mockito.asm.ByteVector byteVector19 = byteVector15.putByte((int) (byte) 1);
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
    public void test1980() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1980");
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
        org.mockito.asm.ByteVector byteVector64 = byteVector14.putLong(0L);
        java.lang.Class<?> wildcardClass65 = byteVector14.getClass();
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
        org.junit.Assert.assertNotNull(wildcardClass65);
    }

    @Test
    public void test1981() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1981");
        org.mockito.asm.ByteVector byteVector0 = new org.mockito.asm.ByteVector();
        org.mockito.asm.ByteVector byteVector2 = byteVector0.putUTF8("hi!");
        org.mockito.asm.ByteVector byteVector4 = byteVector0.putByte((int) (byte) 1);
        org.mockito.asm.ByteVector byteVector6 = byteVector4.putShort((int) (byte) 1);
        org.mockito.asm.ByteVector byteVector8 = byteVector4.putShort((-1));
        java.lang.Class<?> wildcardClass9 = byteVector8.getClass();
        org.junit.Assert.assertNotNull(byteVector2);
        org.junit.Assert.assertNotNull(byteVector4);
        org.junit.Assert.assertNotNull(byteVector6);
        org.junit.Assert.assertNotNull(byteVector8);
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test1982() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1982");
        org.mockito.asm.ByteVector byteVector1 = new org.mockito.asm.ByteVector((int) (byte) 10);
        org.mockito.asm.ByteVector byteVector3 = byteVector1.putByte((int) '4');
        org.mockito.asm.ByteVector byteVector5 = byteVector1.putLong((long) 'a');
        org.mockito.asm.ByteVector byteVector7 = byteVector5.putUTF8("");
        org.mockito.asm.ByteVector byteVector9 = byteVector7.putInt((int) (short) -1);
        org.mockito.asm.ByteVector byteVector11 = byteVector9.putInt(1);
        org.junit.Assert.assertNotNull(byteVector3);
        org.junit.Assert.assertNotNull(byteVector5);
        org.junit.Assert.assertNotNull(byteVector7);
        org.junit.Assert.assertNotNull(byteVector9);
        org.junit.Assert.assertNotNull(byteVector11);
    }

    @Test
    public void test1983() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1983");
        org.mockito.asm.ByteVector byteVector0 = new org.mockito.asm.ByteVector();
        org.mockito.asm.ByteVector byteVector2 = byteVector0.putUTF8("hi!");
        org.mockito.asm.ByteVector byteVector4 = byteVector0.putInt(0);
        org.mockito.asm.ByteVector byteVector6 = byteVector0.putShort((-1));
        org.mockito.asm.ByteVector byteVector8 = byteVector0.putLong((long) (short) -1);
        org.mockito.asm.ByteVector byteVector10 = byteVector0.putLong((long) (short) 1);
        org.mockito.asm.ByteVector byteVector12 = byteVector10.putLong((long) 0);
        org.junit.Assert.assertNotNull(byteVector2);
        org.junit.Assert.assertNotNull(byteVector4);
        org.junit.Assert.assertNotNull(byteVector6);
        org.junit.Assert.assertNotNull(byteVector8);
        org.junit.Assert.assertNotNull(byteVector10);
        org.junit.Assert.assertNotNull(byteVector12);
    }

    @Test
    public void test1984() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1984");
        org.mockito.asm.ByteVector byteVector1 = new org.mockito.asm.ByteVector((int) '#');
        org.mockito.asm.ByteVector byteVector3 = byteVector1.putInt(100);
        org.mockito.asm.ByteVector byteVector5 = byteVector3.putByte((-1));
        org.mockito.asm.ByteVector byteVector7 = byteVector5.putInt((int) 'a');
        org.mockito.asm.ByteVector byteVector9 = byteVector7.putByte((int) (short) 1);
        org.mockito.asm.ByteVector byteVector11 = byteVector7.putByte((int) (short) 0);
        org.mockito.asm.ByteVector byteVector13 = byteVector7.putInt((-1));
        org.mockito.asm.ByteVector byteVector15 = byteVector13.putUTF8("");
        org.mockito.asm.ByteVector byteVector17 = byteVector13.putByte((int) (short) 0);
        byte[] byteArray18 = null;
        org.mockito.asm.ByteVector byteVector21 = byteVector17.putByteArray(byteArray18, (-1), (int) (byte) 10);
        org.mockito.asm.ByteVector byteVector23 = byteVector21.putShort((int) '4');
        org.junit.Assert.assertNotNull(byteVector3);
        org.junit.Assert.assertNotNull(byteVector5);
        org.junit.Assert.assertNotNull(byteVector7);
        org.junit.Assert.assertNotNull(byteVector9);
        org.junit.Assert.assertNotNull(byteVector11);
        org.junit.Assert.assertNotNull(byteVector13);
        org.junit.Assert.assertNotNull(byteVector15);
        org.junit.Assert.assertNotNull(byteVector17);
        org.junit.Assert.assertNotNull(byteVector21);
        org.junit.Assert.assertNotNull(byteVector23);
    }

    @Test
    public void test1985() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1985");
        org.mockito.asm.ByteVector byteVector0 = new org.mockito.asm.ByteVector();
        org.mockito.asm.ByteVector byteVector2 = byteVector0.putUTF8("hi!");
        org.mockito.asm.ByteVector byteVector4 = byteVector0.putInt(0);
        org.mockito.asm.ByteVector byteVector6 = byteVector0.putShort((int) '4');
        org.mockito.asm.ByteVector byteVector8 = byteVector6.putShort((int) (byte) -1);
        org.mockito.asm.ByteVector byteVector10 = byteVector8.putLong(0L);
        org.mockito.asm.ByteVector byteVector12 = byteVector8.putInt(1);
        org.mockito.asm.ByteVector byteVector14 = byteVector8.putInt((int) ' ');
        org.mockito.asm.ByteVector byteVector16 = byteVector14.putByte((int) 'a');
        org.mockito.asm.ByteVector byteVector18 = byteVector14.putByte(100);
        org.mockito.asm.ByteVector byteVector19 = new org.mockito.asm.ByteVector();
        org.mockito.asm.ByteVector byteVector21 = byteVector19.putUTF8("hi!");
        org.mockito.asm.ByteVector byteVector23 = byteVector19.putShort((int) (short) -1);
        org.mockito.asm.ByteVector byteVector25 = byteVector19.putInt((int) (byte) 10);
        org.mockito.asm.ByteVector byteVector27 = byteVector25.putUTF8("hi!");
        org.mockito.asm.ByteVector byteVector29 = byteVector27.putShort(0);
        org.mockito.asm.ByteVector byteVector31 = byteVector29.putShort((int) (byte) 1);
        org.mockito.asm.ByteVector byteVector33 = new org.mockito.asm.ByteVector((int) (short) 0);
        org.mockito.asm.ByteVector byteVector34 = new org.mockito.asm.ByteVector();
        org.mockito.asm.ByteVector byteVector36 = byteVector34.putUTF8("hi!");
        org.mockito.asm.ByteVector byteVector38 = byteVector34.putInt(0);
        org.mockito.asm.ByteVector byteVector40 = byteVector38.putInt((int) ' ');
        org.mockito.asm.ByteVector byteVector42 = byteVector40.putLong(100L);
        byte[] byteArray46 = new byte[] { (byte) 0, (byte) 10, (byte) 1 };
        org.mockito.asm.ByteVector byteVector49 = byteVector40.putByteArray(byteArray46, 0, 0);
        org.mockito.asm.ByteVector byteVector52 = byteVector33.putByteArray(byteArray46, 1, (int) (short) 0);
        org.mockito.asm.ByteVector byteVector55 = byteVector29.putByteArray(byteArray46, 0, (int) (byte) 1);
        // The following exception was thrown during execution in test generation
        try {
            org.mockito.asm.ByteVector byteVector58 = byteVector14.putByteArray(byteArray46, (int) (byte) 0, (int) (byte) -1);
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
    public void test1986() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1986");
        org.mockito.asm.ByteVector byteVector0 = new org.mockito.asm.ByteVector();
        org.mockito.asm.ByteVector byteVector2 = byteVector0.putUTF8("hi!");
        org.mockito.asm.ByteVector byteVector4 = byteVector0.putLong((long) ' ');
        org.mockito.asm.ByteVector byteVector6 = byteVector4.putByte((int) 'a');
        org.mockito.asm.ByteVector byteVector8 = byteVector6.putInt((int) (short) 1);
        org.mockito.asm.ByteVector byteVector10 = byteVector8.putInt((int) (byte) 100);
        org.mockito.asm.ByteVector byteVector11 = new org.mockito.asm.ByteVector();
        org.mockito.asm.ByteVector byteVector13 = byteVector11.putUTF8("hi!");
        org.mockito.asm.ByteVector byteVector15 = byteVector11.putInt(0);
        org.mockito.asm.ByteVector byteVector17 = byteVector15.putByte((int) (byte) -1);
        org.mockito.asm.ByteVector byteVector19 = byteVector15.putShort((int) '4');
        org.mockito.asm.ByteVector byteVector20 = new org.mockito.asm.ByteVector();
        org.mockito.asm.ByteVector byteVector22 = byteVector20.putUTF8("hi!");
        org.mockito.asm.ByteVector byteVector24 = byteVector20.putLong((long) ' ');
        org.mockito.asm.ByteVector byteVector26 = byteVector24.putByte((int) 'a');
        org.mockito.asm.ByteVector byteVector28 = byteVector24.putByte((int) (short) -1);
        org.mockito.asm.ByteVector byteVector30 = byteVector24.putLong(0L);
        org.mockito.asm.ByteVector byteVector32 = byteVector24.putUTF8("hi!");
        org.mockito.asm.ByteVector byteVector34 = byteVector32.putUTF8("");
        org.mockito.asm.ByteVector byteVector36 = byteVector34.putLong((long) (byte) 10);
        org.mockito.asm.ByteVector byteVector38 = byteVector34.putLong((long) (short) 100);
        byte[] byteArray43 = new byte[] { (byte) 1, (byte) 0, (byte) 0, (byte) -1 };
        org.mockito.asm.ByteVector byteVector46 = byteVector34.putByteArray(byteArray43, 0, 0);
        org.mockito.asm.ByteVector byteVector49 = byteVector19.putByteArray(byteArray43, (int) (byte) 0, (int) (short) 1);
        // The following exception was thrown during execution in test generation
        try {
            org.mockito.asm.ByteVector byteVector52 = byteVector10.putByteArray(byteArray43, (int) (byte) 0, (int) (short) 100);
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
        org.junit.Assert.assertNotNull(byteVector32);
        org.junit.Assert.assertNotNull(byteVector34);
        org.junit.Assert.assertNotNull(byteVector36);
        org.junit.Assert.assertNotNull(byteVector38);
        org.junit.Assert.assertNotNull(byteArray43);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray43), "[1, 0, 0, -1]");
        org.junit.Assert.assertNotNull(byteVector46);
        org.junit.Assert.assertNotNull(byteVector49);
    }

    @Test
    public void test1987() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1987");
        org.mockito.asm.ByteVector byteVector0 = new org.mockito.asm.ByteVector();
        org.mockito.asm.ByteVector byteVector2 = byteVector0.putUTF8("hi!");
        org.mockito.asm.ByteVector byteVector4 = byteVector2.putInt((int) (byte) 10);
        org.mockito.asm.ByteVector byteVector6 = byteVector4.putUTF8("");
        org.mockito.asm.ByteVector byteVector8 = byteVector6.putUTF8("hi!");
        org.mockito.asm.ByteVector byteVector10 = byteVector6.putShort(0);
        org.mockito.asm.ByteVector byteVector12 = byteVector6.putInt((-1));
        org.mockito.asm.ByteVector byteVector14 = byteVector12.putLong((long) (byte) -1);
        org.mockito.asm.ByteVector byteVector16 = byteVector12.putLong((long) (short) 0);
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
    public void test1988() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1988");
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
        org.mockito.asm.ByteVector byteVector20 = byteVector16.putShort((int) (short) -1);
        org.mockito.asm.ByteVector byteVector22 = byteVector16.putLong((long) (byte) -1);
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
    public void test1989() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1989");
        org.mockito.asm.ByteVector byteVector0 = new org.mockito.asm.ByteVector();
        org.mockito.asm.ByteVector byteVector2 = byteVector0.putUTF8("hi!");
        org.mockito.asm.ByteVector byteVector4 = byteVector0.putLong((long) ' ');
        org.mockito.asm.ByteVector byteVector6 = byteVector4.putByte((int) 'a');
        org.mockito.asm.ByteVector byteVector8 = byteVector4.putByte((int) (short) -1);
        org.mockito.asm.ByteVector byteVector10 = byteVector4.putLong(0L);
        org.mockito.asm.ByteVector byteVector12 = byteVector4.putUTF8("hi!");
        org.mockito.asm.ByteVector byteVector14 = byteVector12.putLong((-1L));
        org.mockito.asm.ByteVector byteVector16 = byteVector12.putByte((int) (byte) 1);
        org.mockito.asm.ByteVector byteVector18 = byteVector12.putShort((int) (byte) -1);
        org.mockito.asm.ByteVector byteVector20 = byteVector18.putUTF8("hi!");
        org.mockito.asm.ByteVector byteVector22 = byteVector18.putLong((long) 'a');
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
    public void test1990() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1990");
        org.mockito.asm.ByteVector byteVector1 = new org.mockito.asm.ByteVector((int) ' ');
        org.mockito.asm.ByteVector byteVector3 = byteVector1.putInt((int) '4');
        org.mockito.asm.ByteVector byteVector5 = byteVector3.putUTF8("");
        org.mockito.asm.ByteVector byteVector7 = byteVector5.putInt(0);
        org.mockito.asm.ByteVector byteVector9 = byteVector5.putShort((int) (short) -1);
        org.mockito.asm.ByteVector byteVector10 = new org.mockito.asm.ByteVector();
        org.mockito.asm.ByteVector byteVector12 = byteVector10.putUTF8("hi!");
        org.mockito.asm.ByteVector byteVector14 = byteVector12.putLong((long) (byte) 10);
        org.mockito.asm.ByteVector byteVector16 = byteVector14.putUTF8("hi!");
        org.mockito.asm.ByteVector byteVector18 = byteVector14.putLong((-1L));
        org.mockito.asm.ByteVector byteVector20 = byteVector18.putInt(10);
        org.mockito.asm.ByteVector byteVector22 = byteVector20.putShort((int) '#');
        org.mockito.asm.ByteVector byteVector24 = byteVector22.putShort((int) (short) -1);
        org.mockito.asm.ByteVector byteVector26 = new org.mockito.asm.ByteVector((int) (byte) 100);
        org.mockito.asm.ByteVector byteVector28 = byteVector26.putShort((int) (short) 100);
        org.mockito.asm.ByteVector byteVector29 = new org.mockito.asm.ByteVector();
        org.mockito.asm.ByteVector byteVector31 = byteVector29.putUTF8("hi!");
        org.mockito.asm.ByteVector byteVector33 = byteVector29.putLong((long) ' ');
        org.mockito.asm.ByteVector byteVector35 = byteVector33.putByte((int) 'a');
        org.mockito.asm.ByteVector byteVector37 = byteVector33.putByte((int) (short) -1);
        org.mockito.asm.ByteVector byteVector39 = byteVector33.putLong(0L);
        org.mockito.asm.ByteVector byteVector41 = byteVector33.putUTF8("hi!");
        org.mockito.asm.ByteVector byteVector43 = byteVector41.putUTF8("");
        org.mockito.asm.ByteVector byteVector45 = byteVector41.putInt((int) (byte) 10);
        org.mockito.asm.ByteVector byteVector47 = byteVector41.putByte(0);
        org.mockito.asm.ByteVector byteVector48 = new org.mockito.asm.ByteVector();
        org.mockito.asm.ByteVector byteVector50 = byteVector48.putUTF8("hi!");
        org.mockito.asm.ByteVector byteVector52 = byteVector48.putInt(0);
        org.mockito.asm.ByteVector byteVector54 = byteVector52.putInt((int) ' ');
        org.mockito.asm.ByteVector byteVector56 = byteVector54.putLong(100L);
        byte[] byteArray60 = new byte[] { (byte) 0, (byte) 10, (byte) 1 };
        org.mockito.asm.ByteVector byteVector63 = byteVector54.putByteArray(byteArray60, 0, 0);
        org.mockito.asm.ByteVector byteVector66 = byteVector47.putByteArray(byteArray60, (int) (short) 1, 0);
        org.mockito.asm.ByteVector byteVector69 = byteVector26.putByteArray(byteArray60, 0, (int) (byte) 1);
        org.mockito.asm.ByteVector byteVector72 = byteVector24.putByteArray(byteArray60, (int) (byte) 0, (int) (short) 0);
        // The following exception was thrown during execution in test generation
        try {
            org.mockito.asm.ByteVector byteVector75 = byteVector5.putByteArray(byteArray60, (int) (byte) 10, (int) (byte) 100);
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
        org.junit.Assert.assertNotNull(byteVector28);
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
        org.junit.Assert.assertNotNull(byteArray60);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray60), "[0, 10, 1]");
        org.junit.Assert.assertNotNull(byteVector63);
        org.junit.Assert.assertNotNull(byteVector66);
        org.junit.Assert.assertNotNull(byteVector69);
        org.junit.Assert.assertNotNull(byteVector72);
    }

    @Test
    public void test1991() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1991");
        org.mockito.asm.ByteVector byteVector1 = new org.mockito.asm.ByteVector((int) '#');
        org.mockito.asm.ByteVector byteVector3 = byteVector1.putLong(100L);
        org.mockito.asm.ByteVector byteVector5 = byteVector1.putUTF8("");
        org.mockito.asm.ByteVector byteVector7 = byteVector1.putUTF8("hi!");
        org.mockito.asm.ByteVector byteVector9 = byteVector7.putLong((long) (short) 0);
        org.mockito.asm.ByteVector byteVector11 = byteVector9.putLong((long) 1);
        org.mockito.asm.ByteVector byteVector13 = byteVector11.putInt(10);
        org.mockito.asm.ByteVector byteVector15 = byteVector11.putInt((int) 'a');
        org.mockito.asm.ByteVector byteVector17 = byteVector15.putUTF8("hi!");
        org.mockito.asm.ByteVector byteVector19 = byteVector17.putLong((long) (short) -1);
        org.mockito.asm.ByteVector byteVector21 = byteVector19.putInt((int) 'a');
        org.mockito.asm.ByteVector byteVector23 = byteVector19.putLong((long) (short) -1);
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
        org.junit.Assert.assertNotNull(byteVector23);
    }

    @Test
    public void test1992() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1992");
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
        org.mockito.asm.ByteVector byteVector24 = byteVector20.putShort((-1));
        org.mockito.asm.ByteVector byteVector26 = byteVector20.putByte((int) '#');
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
    public void test1993() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1993");
        org.mockito.asm.ByteVector byteVector1 = new org.mockito.asm.ByteVector((int) (byte) 1);
        org.mockito.asm.ByteVector byteVector3 = byteVector1.putByte((int) (byte) 10);
        org.mockito.asm.ByteVector byteVector5 = byteVector3.putShort((int) (short) 10);
        org.mockito.asm.ByteVector byteVector7 = byteVector3.putUTF8("");
        org.mockito.asm.ByteVector byteVector9 = byteVector7.putLong((long) 'a');
        org.mockito.asm.ByteVector byteVector11 = byteVector7.putByte(100);
        org.mockito.asm.ByteVector byteVector13 = byteVector11.putUTF8("hi!");
        org.junit.Assert.assertNotNull(byteVector3);
        org.junit.Assert.assertNotNull(byteVector5);
        org.junit.Assert.assertNotNull(byteVector7);
        org.junit.Assert.assertNotNull(byteVector9);
        org.junit.Assert.assertNotNull(byteVector11);
        org.junit.Assert.assertNotNull(byteVector13);
    }

    @Test
    public void test1994() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1994");
        org.mockito.asm.ByteVector byteVector0 = new org.mockito.asm.ByteVector();
        org.mockito.asm.ByteVector byteVector2 = byteVector0.putUTF8("hi!");
        org.mockito.asm.ByteVector byteVector4 = byteVector0.putLong((long) ' ');
        org.mockito.asm.ByteVector byteVector6 = byteVector4.putByte((int) 'a');
        org.mockito.asm.ByteVector byteVector8 = byteVector4.putByte((int) (short) -1);
        org.mockito.asm.ByteVector byteVector10 = byteVector4.putByte((int) (short) 10);
        java.lang.Class<?> wildcardClass11 = byteVector4.getClass();
        org.junit.Assert.assertNotNull(byteVector2);
        org.junit.Assert.assertNotNull(byteVector4);
        org.junit.Assert.assertNotNull(byteVector6);
        org.junit.Assert.assertNotNull(byteVector8);
        org.junit.Assert.assertNotNull(byteVector10);
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test1995() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1995");
        org.mockito.asm.ByteVector byteVector0 = new org.mockito.asm.ByteVector();
        org.mockito.asm.ByteVector byteVector2 = byteVector0.putUTF8("hi!");
        org.mockito.asm.ByteVector byteVector4 = byteVector2.putLong((long) (byte) 10);
        org.mockito.asm.ByteVector byteVector6 = byteVector4.putUTF8("hi!");
        org.mockito.asm.ByteVector byteVector8 = byteVector4.putLong((-1L));
        org.mockito.asm.ByteVector byteVector10 = byteVector8.putInt(10);
        org.mockito.asm.ByteVector byteVector12 = byteVector8.putShort((int) (byte) 0);
        org.mockito.asm.ByteVector byteVector14 = byteVector8.putShort((int) 'a');
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
    public void test1996() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1996");
        org.mockito.asm.ByteVector byteVector0 = new org.mockito.asm.ByteVector();
        org.mockito.asm.ByteVector byteVector2 = byteVector0.putUTF8("hi!");
        org.mockito.asm.ByteVector byteVector4 = byteVector2.putLong((long) (byte) 10);
        org.mockito.asm.ByteVector byteVector6 = byteVector4.putUTF8("hi!");
        org.mockito.asm.ByteVector byteVector8 = byteVector4.putLong((long) 10);
        org.mockito.asm.ByteVector byteVector10 = byteVector8.putLong(0L);
        org.mockito.asm.ByteVector byteVector12 = byteVector10.putUTF8("hi!");
        org.mockito.asm.ByteVector byteVector14 = byteVector10.putShort(1);
        org.mockito.asm.ByteVector byteVector16 = byteVector10.putInt((int) (byte) 0);
        org.mockito.asm.ByteVector byteVector18 = byteVector16.putShort((int) (short) 100);
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
    public void test1997() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1997");
        org.mockito.asm.ByteVector byteVector1 = new org.mockito.asm.ByteVector((int) '#');
        org.mockito.asm.ByteVector byteVector3 = byteVector1.putLong(100L);
        org.mockito.asm.ByteVector byteVector5 = byteVector1.putUTF8("");
        org.mockito.asm.ByteVector byteVector7 = byteVector5.putInt((int) (byte) 10);
        org.mockito.asm.ByteVector byteVector9 = byteVector7.putByte(0);
        org.mockito.asm.ByteVector byteVector11 = byteVector9.putUTF8("hi!");
        org.mockito.asm.ByteVector byteVector13 = byteVector9.putLong((long) ' ');
        org.junit.Assert.assertNotNull(byteVector3);
        org.junit.Assert.assertNotNull(byteVector5);
        org.junit.Assert.assertNotNull(byteVector7);
        org.junit.Assert.assertNotNull(byteVector9);
        org.junit.Assert.assertNotNull(byteVector11);
        org.junit.Assert.assertNotNull(byteVector13);
    }

    @Test
    public void test1998() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1998");
        org.mockito.asm.ByteVector byteVector1 = new org.mockito.asm.ByteVector((int) (byte) 1);
        org.mockito.asm.ByteVector byteVector3 = byteVector1.putByte((int) (short) 1);
        org.mockito.asm.ByteVector byteVector5 = byteVector3.putLong((long) (-1));
        org.mockito.asm.ByteVector byteVector7 = byteVector3.putByte((int) '#');
        org.mockito.asm.ByteVector byteVector9 = byteVector7.putShort(0);
        org.junit.Assert.assertNotNull(byteVector3);
        org.junit.Assert.assertNotNull(byteVector5);
        org.junit.Assert.assertNotNull(byteVector7);
        org.junit.Assert.assertNotNull(byteVector9);
    }

    @Test
    public void test1999() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1999");
        org.mockito.asm.ByteVector byteVector0 = new org.mockito.asm.ByteVector();
        org.mockito.asm.ByteVector byteVector2 = byteVector0.putUTF8("hi!");
        org.mockito.asm.ByteVector byteVector4 = byteVector0.putShort((int) (short) -1);
        org.mockito.asm.ByteVector byteVector6 = byteVector0.putInt(0);
        org.mockito.asm.ByteVector byteVector8 = byteVector0.putUTF8("hi!");
        org.mockito.asm.ByteVector byteVector10 = byteVector0.putByte(100);
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
    public void test2000() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test2000");
        org.mockito.asm.ByteVector byteVector0 = new org.mockito.asm.ByteVector();
        org.mockito.asm.ByteVector byteVector2 = byteVector0.putInt((int) (byte) 10);
        org.mockito.asm.ByteVector byteVector4 = byteVector2.putByte(0);
        org.mockito.asm.ByteVector byteVector6 = byteVector2.putShort(0);
        org.mockito.asm.ByteVector byteVector8 = byteVector6.putUTF8("hi!");
        org.mockito.asm.ByteVector byteVector10 = byteVector8.putInt((int) ' ');
        org.junit.Assert.assertNotNull(byteVector2);
        org.junit.Assert.assertNotNull(byteVector4);
        org.junit.Assert.assertNotNull(byteVector6);
        org.junit.Assert.assertNotNull(byteVector8);
        org.junit.Assert.assertNotNull(byteVector10);
    }
}

