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
        org.mockito.asm.ByteVector byteVector0 = new org.mockito.asm.ByteVector();
        org.mockito.asm.ByteVector byteVector2 = byteVector0.putUTF8("hi!");
        org.mockito.asm.ByteVector byteVector4 = byteVector2.putInt(0);
        org.mockito.asm.ByteVector byteVector6 = byteVector2.putByte((int) (byte) 10);
        org.mockito.asm.ByteVector byteVector8 = byteVector6.putUTF8("hi!");
        org.mockito.asm.ByteVector byteVector10 = byteVector8.putShort(100);
        org.mockito.asm.ByteVector byteVector12 = byteVector10.putInt((int) (byte) -1);
        org.mockito.asm.ByteVector byteVector14 = byteVector12.putByte(10);
        org.mockito.asm.ByteVector byteVector16 = byteVector14.putByte((int) (byte) 10);
        org.mockito.asm.ByteVector byteVector18 = byteVector14.putLong((long) (byte) -1);
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
    public void test2502() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2502");
        org.mockito.asm.ByteVector byteVector0 = new org.mockito.asm.ByteVector();
        org.mockito.asm.ByteVector byteVector2 = byteVector0.putUTF8("hi!");
        org.mockito.asm.ByteVector byteVector4 = byteVector2.putInt(0);
        org.mockito.asm.ByteVector byteVector6 = byteVector2.putByte((int) (byte) 10);
        org.mockito.asm.ByteVector byteVector8 = byteVector6.putUTF8("hi!");
        org.mockito.asm.ByteVector byteVector10 = byteVector8.putUTF8("hi!");
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
        // The following exception was thrown during execution in test generation
        try {
            org.mockito.asm.ByteVector byteVector92 = byteVector8.putByteArray(byteArray77, (int) ' ', (int) (short) 1);
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
    }

    @Test
    public void test2503() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2503");
        org.mockito.asm.ByteVector byteVector0 = new org.mockito.asm.ByteVector();
        org.mockito.asm.ByteVector byteVector2 = byteVector0.putUTF8("hi!");
        org.mockito.asm.ByteVector byteVector4 = byteVector2.putInt(0);
        org.mockito.asm.ByteVector byteVector6 = byteVector4.putShort((int) '4');
        org.mockito.asm.ByteVector byteVector8 = byteVector6.putByte(100);
        org.mockito.asm.ByteVector byteVector10 = byteVector6.putInt((int) (byte) 10);
        org.mockito.asm.ByteVector byteVector12 = byteVector6.putInt((int) (byte) -1);
        byte[] byteArray13 = null;
        org.mockito.asm.ByteVector byteVector16 = byteVector6.putByteArray(byteArray13, (int) (byte) -1, 0);
        org.junit.Assert.assertNotNull(byteVector2);
        org.junit.Assert.assertNotNull(byteVector4);
        org.junit.Assert.assertNotNull(byteVector6);
        org.junit.Assert.assertNotNull(byteVector8);
        org.junit.Assert.assertNotNull(byteVector10);
        org.junit.Assert.assertNotNull(byteVector12);
        org.junit.Assert.assertNotNull(byteVector16);
    }

    @Test
    public void test2504() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2504");
        org.mockito.asm.ByteVector byteVector0 = new org.mockito.asm.ByteVector();
        org.mockito.asm.ByteVector byteVector2 = byteVector0.putUTF8("hi!");
        org.mockito.asm.ByteVector byteVector4 = byteVector2.putInt(0);
        org.mockito.asm.ByteVector byteVector6 = byteVector2.putByte((int) (byte) 10);
        org.mockito.asm.ByteVector byteVector8 = byteVector6.putLong((-1L));
        org.mockito.asm.ByteVector byteVector10 = byteVector6.putInt((int) (byte) 100);
        org.mockito.asm.ByteVector byteVector12 = byteVector6.putUTF8("hi!");
        org.mockito.asm.ByteVector byteVector14 = byteVector12.putUTF8("hi!");
        org.mockito.asm.ByteVector byteVector16 = byteVector14.putShort((int) (byte) 0);
        org.mockito.asm.ByteVector byteVector18 = new org.mockito.asm.ByteVector((int) '#');
        org.mockito.asm.ByteVector byteVector20 = byteVector18.putLong(100L);
        org.mockito.asm.ByteVector byteVector22 = byteVector20.putLong(1L);
        org.mockito.asm.ByteVector byteVector24 = byteVector22.putUTF8("hi!");
        org.mockito.asm.ByteVector byteVector26 = byteVector22.putUTF8("hi!");
        org.mockito.asm.ByteVector byteVector28 = byteVector26.putByte((int) (short) 0);
        org.mockito.asm.ByteVector byteVector30 = byteVector26.putInt(1);
        org.mockito.asm.ByteVector byteVector31 = new org.mockito.asm.ByteVector();
        org.mockito.asm.ByteVector byteVector33 = byteVector31.putUTF8("hi!");
        org.mockito.asm.ByteVector byteVector35 = byteVector33.putByte(100);
        org.mockito.asm.ByteVector byteVector37 = byteVector33.putShort((int) 'a');
        org.mockito.asm.ByteVector byteVector39 = byteVector37.putShort((int) (short) 0);
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
        org.mockito.asm.ByteVector byteVector72 = byteVector37.putByteArray(byteArray63, (int) (byte) 1, (int) (short) 1);
        org.mockito.asm.ByteVector byteVector75 = byteVector26.putByteArray(byteArray63, (int) (short) 0, (int) (byte) 0);
        // The following exception was thrown during execution in test generation
        try {
            org.mockito.asm.ByteVector byteVector78 = byteVector14.putByteArray(byteArray63, (int) '4', (int) '#');
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
        org.junit.Assert.assertNotNull(byteVector30);
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
    public void test2505() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2505");
        org.mockito.asm.ByteVector byteVector1 = new org.mockito.asm.ByteVector((int) (short) 1);
        org.mockito.asm.ByteVector byteVector3 = byteVector1.putLong((long) (byte) 1);
        org.mockito.asm.ByteVector byteVector5 = byteVector1.putUTF8("");
        org.mockito.asm.ByteVector byteVector7 = byteVector5.putInt((int) '#');
        org.mockito.asm.ByteVector byteVector9 = byteVector5.putInt(1);
        org.junit.Assert.assertNotNull(byteVector3);
        org.junit.Assert.assertNotNull(byteVector5);
        org.junit.Assert.assertNotNull(byteVector7);
        org.junit.Assert.assertNotNull(byteVector9);
    }

    @Test
    public void test2506() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2506");
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
        org.mockito.asm.ByteVector byteVector61 = byteVector59.putShort((int) (byte) 1);
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
        org.junit.Assert.assertNotNull(byteVector61);
    }

    @Test
    public void test2507() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2507");
        org.mockito.asm.ByteVector byteVector0 = new org.mockito.asm.ByteVector();
        org.mockito.asm.ByteVector byteVector2 = byteVector0.putUTF8("hi!");
        org.mockito.asm.ByteVector byteVector4 = byteVector2.putInt(0);
        org.mockito.asm.ByteVector byteVector6 = byteVector2.putByte((int) (byte) 10);
        org.mockito.asm.ByteVector byteVector8 = byteVector6.putLong(0L);
        org.mockito.asm.ByteVector byteVector10 = byteVector8.putShort((int) 'a');
        org.mockito.asm.ByteVector byteVector12 = byteVector10.putLong(10L);
        org.mockito.asm.ByteVector byteVector14 = byteVector12.putUTF8("");
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
    public void test2508() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2508");
        org.mockito.asm.ByteVector byteVector0 = new org.mockito.asm.ByteVector();
        org.mockito.asm.ByteVector byteVector2 = byteVector0.putUTF8("hi!");
        org.mockito.asm.ByteVector byteVector4 = byteVector2.putInt(0);
        org.mockito.asm.ByteVector byteVector6 = byteVector4.putByte((int) (byte) 1);
        org.mockito.asm.ByteVector byteVector8 = byteVector6.putShort((int) '4');
        org.mockito.asm.ByteVector byteVector10 = byteVector6.putShort(10);
        org.mockito.asm.ByteVector byteVector11 = new org.mockito.asm.ByteVector();
        org.mockito.asm.ByteVector byteVector13 = byteVector11.putUTF8("hi!");
        org.mockito.asm.ByteVector byteVector15 = byteVector11.putLong((long) ' ');
        org.mockito.asm.ByteVector byteVector17 = byteVector15.putByte((int) 'a');
        org.mockito.asm.ByteVector byteVector19 = byteVector17.putByte((int) (short) -1);
        org.mockito.asm.ByteVector byteVector21 = byteVector19.putLong((long) (byte) -1);
        org.mockito.asm.ByteVector byteVector23 = byteVector19.putByte((int) '4');
        org.mockito.asm.ByteVector byteVector25 = byteVector23.putLong((long) (short) 10);
        org.mockito.asm.ByteVector byteVector27 = new org.mockito.asm.ByteVector((int) '#');
        org.mockito.asm.ByteVector byteVector29 = byteVector27.putInt(100);
        org.mockito.asm.ByteVector byteVector31 = byteVector29.putShort((int) (short) -1);
        org.mockito.asm.ByteVector byteVector33 = byteVector31.putShort((int) (short) 0);
        org.mockito.asm.ByteVector byteVector35 = byteVector31.putUTF8("");
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
        org.mockito.asm.ByteVector byteVector76 = byteVector31.putByteArray(byteArray67, 1, 1);
        org.mockito.asm.ByteVector byteVector79 = byteVector23.putByteArray(byteArray67, (int) (short) 0, 0);
        // The following exception was thrown during execution in test generation
        try {
            org.mockito.asm.ByteVector byteVector82 = byteVector10.putByteArray(byteArray67, (int) (short) 10, (int) (short) 100);
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
    public void test2509() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2509");
        org.mockito.asm.ByteVector byteVector0 = new org.mockito.asm.ByteVector();
        org.mockito.asm.ByteVector byteVector2 = byteVector0.putUTF8("hi!");
        org.mockito.asm.ByteVector byteVector4 = byteVector0.putShort((int) (short) -1);
        org.mockito.asm.ByteVector byteVector6 = byteVector0.putInt((int) (byte) 10);
        org.mockito.asm.ByteVector byteVector8 = byteVector6.putUTF8("hi!");
        org.mockito.asm.ByteVector byteVector10 = byteVector8.putByte((int) (byte) 1);
        org.mockito.asm.ByteVector byteVector12 = byteVector8.putInt((int) (byte) -1);
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
        org.mockito.asm.ByteVector byteVector69 = byteVector8.putByteArray(byteArray57, 1, (int) (byte) 1);
        org.mockito.asm.ByteVector byteVector71 = byteVector8.putByte((int) '#');
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
        org.junit.Assert.assertNotNull(byteVector69);
        org.junit.Assert.assertNotNull(byteVector71);
    }

    @Test
    public void test2510() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2510");
        org.mockito.asm.ByteVector byteVector0 = new org.mockito.asm.ByteVector();
        org.mockito.asm.ByteVector byteVector2 = byteVector0.putUTF8("hi!");
        org.mockito.asm.ByteVector byteVector4 = byteVector0.putLong((long) ' ');
        org.mockito.asm.ByteVector byteVector6 = byteVector4.putByte((int) 'a');
        org.mockito.asm.ByteVector byteVector8 = byteVector4.putByte((int) (short) -1);
        org.mockito.asm.ByteVector byteVector10 = byteVector4.putByte((int) (short) 10);
        org.mockito.asm.ByteVector byteVector12 = byteVector10.putLong(0L);
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
    public void test2511() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2511");
        org.mockito.asm.ByteVector byteVector0 = new org.mockito.asm.ByteVector();
        org.mockito.asm.ByteVector byteVector2 = byteVector0.putUTF8("hi!");
        org.mockito.asm.ByteVector byteVector4 = byteVector2.putInt(0);
        org.mockito.asm.ByteVector byteVector6 = byteVector4.putShort(1);
        org.mockito.asm.ByteVector byteVector8 = byteVector6.putByte((int) (byte) 1);
        org.mockito.asm.ByteVector byteVector10 = byteVector6.putLong((long) 10);
        org.mockito.asm.ByteVector byteVector12 = byteVector6.putUTF8("");
        org.mockito.asm.ByteVector byteVector14 = byteVector6.putByte((int) 'a');
        org.mockito.asm.ByteVector byteVector16 = byteVector6.putUTF8("hi!");
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
    public void test2512() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2512");
        org.mockito.asm.ByteVector byteVector0 = new org.mockito.asm.ByteVector();
        org.mockito.asm.ByteVector byteVector2 = byteVector0.putUTF8("hi!");
        org.mockito.asm.ByteVector byteVector4 = byteVector2.putInt(0);
        org.mockito.asm.ByteVector byteVector6 = byteVector2.putByte((int) (byte) 10);
        org.mockito.asm.ByteVector byteVector8 = byteVector6.putByte((int) (short) 1);
        org.mockito.asm.ByteVector byteVector10 = byteVector8.putUTF8("hi!");
        org.mockito.asm.ByteVector byteVector12 = byteVector8.putLong((long) 1);
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
    public void test2513() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2513");
        org.mockito.asm.ByteVector byteVector0 = new org.mockito.asm.ByteVector();
        org.mockito.asm.ByteVector byteVector2 = byteVector0.putUTF8("hi!");
        org.mockito.asm.ByteVector byteVector4 = byteVector0.putLong((long) ' ');
        org.mockito.asm.ByteVector byteVector6 = byteVector4.putByte((int) 'a');
        org.mockito.asm.ByteVector byteVector8 = byteVector6.putInt((int) (short) 0);
        org.mockito.asm.ByteVector byteVector10 = byteVector8.putByte((int) (short) 0);
        org.mockito.asm.ByteVector byteVector12 = byteVector10.putUTF8("");
        org.mockito.asm.ByteVector byteVector14 = byteVector12.putUTF8("hi!");
        org.mockito.asm.ByteVector byteVector16 = byteVector14.putLong(10L);
        org.mockito.asm.ByteVector byteVector18 = byteVector14.putInt((int) (byte) 10);
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
    public void test2514() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2514");
        org.mockito.asm.ByteVector byteVector1 = new org.mockito.asm.ByteVector((int) '#');
        org.mockito.asm.ByteVector byteVector3 = byteVector1.putLong(100L);
        org.mockito.asm.ByteVector byteVector5 = byteVector3.putUTF8("");
        org.mockito.asm.ByteVector byteVector7 = byteVector5.putUTF8("");
        org.mockito.asm.ByteVector byteVector9 = byteVector5.putLong((long) ' ');
        org.junit.Assert.assertNotNull(byteVector3);
        org.junit.Assert.assertNotNull(byteVector5);
        org.junit.Assert.assertNotNull(byteVector7);
        org.junit.Assert.assertNotNull(byteVector9);
    }

    @Test
    public void test2515() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2515");
        org.mockito.asm.ByteVector byteVector0 = new org.mockito.asm.ByteVector();
        org.mockito.asm.ByteVector byteVector2 = byteVector0.putUTF8("hi!");
        org.mockito.asm.ByteVector byteVector4 = byteVector2.putLong((long) (byte) 10);
        org.mockito.asm.ByteVector byteVector6 = byteVector4.putInt((int) 'a');
        org.mockito.asm.ByteVector byteVector8 = byteVector6.putUTF8("hi!");
        org.mockito.asm.ByteVector byteVector10 = byteVector8.putByte((-1));
        org.mockito.asm.ByteVector byteVector12 = byteVector8.putInt((int) '#');
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
    public void test2516() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2516");
        org.mockito.asm.ByteVector byteVector0 = new org.mockito.asm.ByteVector();
        org.mockito.asm.ByteVector byteVector2 = byteVector0.putUTF8("hi!");
        org.mockito.asm.ByteVector byteVector4 = byteVector2.putLong((long) (byte) 10);
        org.mockito.asm.ByteVector byteVector6 = byteVector4.putUTF8("hi!");
        org.mockito.asm.ByteVector byteVector8 = byteVector4.putLong((-1L));
        org.mockito.asm.ByteVector byteVector10 = byteVector8.putInt(10);
        org.mockito.asm.ByteVector byteVector12 = byteVector10.putInt((int) (byte) 10);
        org.mockito.asm.ByteVector byteVector14 = byteVector12.putLong((long) 10);
        org.mockito.asm.ByteVector byteVector16 = byteVector12.putInt((int) (byte) 1);
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
    public void test2517() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2517");
        org.mockito.asm.ByteVector byteVector0 = new org.mockito.asm.ByteVector();
        org.mockito.asm.ByteVector byteVector2 = byteVector0.putUTF8("hi!");
        org.mockito.asm.ByteVector byteVector4 = byteVector0.putInt(0);
        org.mockito.asm.ByteVector byteVector6 = byteVector0.putShort(10);
        org.mockito.asm.ByteVector byteVector8 = byteVector0.putUTF8("");
        org.mockito.asm.ByteVector byteVector10 = byteVector8.putByte(0);
        org.mockito.asm.ByteVector byteVector12 = byteVector8.putInt((int) '#');
        org.mockito.asm.ByteVector byteVector14 = byteVector12.putShort((int) '#');
        org.mockito.asm.ByteVector byteVector16 = byteVector12.putShort((int) 'a');
        org.junit.Assert.assertNotNull(byteVector2);
        org.junit.Assert.assertNotNull(byteVector4);
        org.junit.Assert.assertNotNull(byteVector6);
        org.junit.Assert.assertNotNull(byteVector8);
        org.junit.Assert.assertNotNull(byteVector10);
        org.junit.Assert.assertNotNull(byteVector12);
        org.junit.Assert.assertNotNull(byteVector14);
        org.junit.Assert.assertNotNull(byteVector16);
    }
}

