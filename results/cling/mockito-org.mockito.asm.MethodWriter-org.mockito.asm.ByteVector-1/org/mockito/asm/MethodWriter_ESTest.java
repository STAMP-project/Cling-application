/*

 * Tue Mar 03 14:29:36 GMT 2020
 */

package org.mockito.asm;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.shaded.org.mockito.Mockito.*;
import static org.evosuite.runtime.EvoAssertions.*;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.evosuite.runtime.ViolatedAssumptionAnswer;
import org.junit.runner.RunWith;
import org.mockito.asm.Attribute;
import org.mockito.asm.ByteVector;
import org.mockito.asm.ClassWriter;
import org.mockito.asm.Label;
import org.mockito.asm.MethodVisitor;
import org.mockito.asm.MethodWriter;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = false, useJEE = true) 
public class MethodWriter_ESTest extends MethodWriter_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test00()  throws Throwable  {
      ClassWriter classWriter0 = new ClassWriter(70);
      MethodWriter methodWriter0 = new MethodWriter(classWriter0, 2, "#d;&3J;<7b-F", "G})X4_t", "#d;&3J;<7b-F", (String[]) null, true, true);
      Label label0 = new Label();
      int[] intArray0 = new int[2];
      Label[] labelArray0 = new Label[1];
      labelArray0[0] = label0;
      methodWriter0.visitLookupSwitchInsn(label0, intArray0, labelArray0);
      methodWriter0.visitLabel(label0);
  }

  @Test(timeout = 4000)
  public void test01()  throws Throwable  {
      ClassWriter classWriter0 = new ClassWriter(252);
      String[] stringArray0 = new String[0];
      MethodWriter methodWriter0 = new MethodWriter(classWriter0, 131, "Signature", "Signature", "Signature", stringArray0, false, false);
      ByteVector byteVector0 = new ByteVector();
      byteVector0.putByteArray((byte[]) null, 2, 131);
      byteVector0.put11(1, 16777243);
      MethodWriter methodWriter1 = new MethodWriter(classWriter0, 16777243, "qinhz)", "fv.-#g v#CD53$&", "qinhz)", stringArray0, false, false);
      assertFalse(methodWriter1.equals((Object)methodWriter0));
  }

  @Test(timeout = 4000)
  public void test02()  throws Throwable  {
      ClassWriter classWriter0 = new ClassWriter((-79));
      String[] stringArray0 = new String[6];
      stringArray0[0] = "v#b)y}.1ku0";
      stringArray0[1] = "BoSj)?";
      stringArray0[2] = "BoSj)?";
      stringArray0[3] = "v#b)y}.1ku0";
      stringArray0[4] = "v#b)y}.1ku0";
      stringArray0[5] = "v#b)y}.1ku0";
      MethodWriter methodWriter0 = new MethodWriter(classWriter0, (-125), "BoSj)?", "v#b)y}.1ku0", "i:>p6IO4ht/.X'KNb", stringArray0, true, true);
      methodWriter0.visitMethodInsn((-79), "v#b)y}.1ku0", "Iw{C~5RNT", "v#b)y}.1ku0");
  }

  @Test(timeout = 4000)
  public void test03()  throws Throwable  {
      ClassWriter classWriter0 = new ClassWriter(70);
      MethodWriter methodWriter0 = new MethodWriter(classWriter0, 2, "#d;&3J;<7b-F", "k2)X4_t", "#d;&3J;<7b-F", (String[]) null, true, true);
      MethodWriter methodWriter1 = new MethodWriter(classWriter0, 1, "k2)X4_t", "k2)X4_t", (String) null, (String[]) null, false, true);
      // Undeclared exception!
      try { 
        methodWriter0.visitMaxs(485, (-283));
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // 7
         //
         verifyException("org.mockito.asm.Type", e);
      }
  }

  @Test(timeout = 4000)
  public void test04()  throws Throwable  {
      ClassWriter classWriter0 = new ClassWriter(252);
      String[] stringArray0 = new String[5];
      stringArray0[0] = "Signature";
      stringArray0[1] = "'";
      stringArray0[2] = "'";
      stringArray0[3] = "Signature";
      stringArray0[4] = "Signature";
      MethodWriter methodWriter0 = new MethodWriter(classWriter0, 1, "Signature", "'", "'", stringArray0, false, false);
      methodWriter0.visitVarInsn(54, (-3));
  }

  @Test(timeout = 4000)
  public void test05()  throws Throwable  {
      ClassWriter classWriter0 = new ClassWriter(262144);
      MethodWriter methodWriter0 = new MethodWriter(classWriter0, 2, "#d;&3J;<7b-F", "k2)X4_t", "#d;&3J;<7b-F", (String[]) null, false, false);
      MethodWriter methodWriter1 = new MethodWriter(classWriter0, 1, "k2)X4_t", "k2)X4_t", "k2)X4_t", (String[]) null, false, true);
      methodWriter0.visitIincInsn(2, 1);
      assertFalse(methodWriter0.equals((Object)methodWriter1));
  }

  @Test(timeout = 4000)
  public void test06()  throws Throwable  {
      ClassWriter classWriter0 = new ClassWriter(252);
      String[] stringArray0 = new String[0];
      MethodWriter methodWriter0 = new MethodWriter(classWriter0, (-688), "Signature", "Deprecated", "RZntimeInvisibleParameterAnnutat>ons", stringArray0, false, false);
      ByteVector byteVector0 = new ByteVector();
      ByteVector byteVector1 = byteVector0.putLong(2);
      assertSame(byteVector0, byteVector1);
  }

  @Test(timeout = 4000)
  public void test07()  throws Throwable  {
      ClassWriter classWriter0 = new ClassWriter(70);
      classWriter0.newMethodItem("-^", "-^", "yAp%<Z?cDbvS", true);
      String[] stringArray0 = new String[3];
      stringArray0[0] = "NCaTRZk &";
      stringArray0[1] = "<init>";
      stringArray0[2] = "-^";
      MethodWriter methodWriter0 = new MethodWriter(classWriter0, 3, "NCaTRZk &", "<init>", "-^", stringArray0, false, false);
      ByteVector byteVector0 = classWriter0.pool;
      ByteVector byteVector1 = byteVector0.putLong(0L);
      assertSame(byteVector1, byteVector0);
  }

  @Test(timeout = 4000)
  public void test08()  throws Throwable  {
      ClassWriter classWriter0 = new ClassWriter(252);
      String[] stringArray0 = new String[0];
      MethodWriter methodWriter0 = new MethodWriter(classWriter0, 131, "Signature", "Signature", "Signature", stringArray0, false, false);
      ByteVector byteVector0 = new ByteVector();
      ByteVector byteVector1 = byteVector0.putByteArray((byte[]) null, 2, 131);
      ByteVector byteVector2 = byteVector1.putLong(2328L);
      assertSame(byteVector0, byteVector2);
  }

  @Test(timeout = 4000)
  public void test09()  throws Throwable  {
      ClassWriter classWriter0 = new ClassWriter(1755);
      String[] stringArray0 = new String[3];
      stringArray0[0] = "B'Ie5EWJ";
      stringArray0[1] = "B'Ie5EWJ";
      stringArray0[2] = "B'Ie5EWJ";
      MethodWriter methodWriter0 = new MethodWriter(classWriter0, 1755, "B'Ie5EWJ", "B'Ie5EWJ", "B'Ie5EWJ", stringArray0, false, false);
      methodWriter0.visitMethodInsn(262144, "int", "B'Ie5EWJ", "Op ");
  }

  @Test(timeout = 4000)
  public void test10()  throws Throwable  {
      int[] intArray0 = new int[1];
      Label label0 = new Label();
      MethodWriter.getNewOffset(intArray0, intArray0, label0);
      MethodWriter.getNewOffset(intArray0, intArray0, label0);
      assertArrayEquals(new int[] {0}, intArray0);
  }

  @Test(timeout = 4000)
  public void test11()  throws Throwable  {
      ClassWriter classWriter0 = new ClassWriter(70);
      MethodWriter methodWriter0 = new MethodWriter(classWriter0, 2, "#d;&3J;<7b-F", "G})X4_t", "#d;&3J;<7b-F", (String[]) null, true, true);
      MethodWriter methodWriter1 = new MethodWriter(classWriter0, 1, "G})X4_t", "G})X4_t", (String) null, (String[]) null, false, false);
      // Undeclared exception!
      try { 
        methodWriter0.visitMethodInsn(185, "G})X4_t", "&F#-D~/?|lQ/", "&lf|~`X_]B");
        fail("Expecting exception: StringIndexOutOfBoundsException");
      
      } catch(StringIndexOutOfBoundsException e) {
      }
  }

  @Test(timeout = 4000)
  public void test12()  throws Throwable  {
      ClassWriter classWriter0 = new ClassWriter((-79));
      String[] stringArray0 = new String[6];
      stringArray0[0] = "v#b)y}.1ku0";
      stringArray0[1] = "BoSj)?";
      stringArray0[2] = "BoSj)?";
      stringArray0[3] = "v#b)y}.1ku0";
      stringArray0[4] = "v#b)y}.1ku0";
      stringArray0[5] = "v#b)y}.1ku0";
      MethodWriter methodWriter0 = new MethodWriter(classWriter0, (-125), "BoSj)?", "v#b)y}.1ku0", "BoSj)?", stringArray0, true, false);
      methodWriter0.visitLdcInsn("BoSj)?");
  }

  @Test(timeout = 4000)
  public void test13()  throws Throwable  {
      ClassWriter classWriter0 = new ClassWriter(70);
      MethodWriter methodWriter0 = new MethodWriter(classWriter0, 1, "G})X4_t", "G})X4_t", (String) null, (String[]) null, false, false);
      methodWriter0.visitFieldInsn((-1867), "org.mockito.asm.Type", "org.mockito.asm.Type", "~!H,:CrkcP&F#<o");
  }

  @Test(timeout = 4000)
  public void test14()  throws Throwable  {
      ClassWriter classWriter0 = new ClassWriter(70);
      MethodWriter methodWriter0 = new MethodWriter(classWriter0, 2, "#d;&3J;<7b-F", "G})X4_t", "#d;&3J;<7b-F", (String[]) null, false, false);
      Label label0 = new Label();
      methodWriter0.visitLocalVariable("G})X4_t", "&fe+P-=7`", "G})X4_t", label0, label0, 179);
  }

  @Test(timeout = 4000)
  public void test15()  throws Throwable  {
      ClassWriter classWriter0 = new ClassWriter(252);
      String[] stringArray0 = new String[0];
      MethodWriter methodWriter0 = new MethodWriter(classWriter0, 141, "Signature", "Signature", "Signature", stringArray0, false, false);
      methodWriter0.visitFrame(115, 115, stringArray0, 1259, stringArray0);
      methodWriter0.visitFrame(16, 1259, stringArray0, 1734, stringArray0);
      assertEquals(0, stringArray0.length);
  }

  @Test(timeout = 4000)
  public void test16()  throws Throwable  {
      ClassWriter classWriter0 = new ClassWriter(262144);
      MethodWriter methodWriter0 = new MethodWriter(classWriter0, 2, "#d;&3J;<7b-F", "k2)X4_t", "#d;&3J;<7b-F", (String[]) null, false, false);
      methodWriter0.visitMethodInsn(1, "k2)X4_t", "k2)X4_t", "#d;&3J;<7b-F");
      MethodWriter methodWriter1 = new MethodWriter(classWriter0, 1, "k2)X4_t", "k2)X4_t", (String) null, (String[]) null, false, true);
      int int0 = methodWriter0.getSize();
      assertEquals(37, int0);
  }

  @Test(timeout = 4000)
  public void test17()  throws Throwable  {
      int[] intArray0 = new int[7];
      intArray0[1] = 57;
      MethodWriter.getNewOffset(intArray0, intArray0, 1181, 0);
      ClassWriter classWriter0 = new ClassWriter((-2121));
      MethodWriter methodWriter0 = null;
      try {
        methodWriter0 = new MethodWriter(classWriter0, 15, "", "RuntimeInvisibleParameterAnnotations", "XC].ZogAT$] >", (String[]) null, false, true);
        fail("Expecting exception: StringIndexOutOfBoundsException");
      
      } catch(StringIndexOutOfBoundsException e) {
      }
  }

  @Test(timeout = 4000)
  public void test18()  throws Throwable  {
      ClassWriter classWriter0 = new ClassWriter((-79));
      String[] stringArray0 = new String[0];
      MethodWriter methodWriter0 = new MethodWriter(classWriter0, 12, "Label offset position has not been resolved yet", "v#b)y}.1ku0", "Label offset position has not been resolved yet", stringArray0, true, true);
      // Undeclared exception!
      try { 
        methodWriter0.visitMaxs((-1263), (-1826));
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // 11
         //
         verifyException("org.mockito.asm.Type", e);
      }
  }

  @Test(timeout = 4000)
  public void test19()  throws Throwable  {
      ClassWriter classWriter0 = new ClassWriter((-79));
      String[] stringArray0 = new String[6];
      stringArray0[0] = "BoSj)?";
      stringArray0[1] = "BoSj)?";
      stringArray0[2] = "BoSj)?";
      stringArray0[3] = "BoSj)?";
      stringArray0[4] = "BoSj)?";
      stringArray0[5] = "BoSj)?";
      MethodWriter methodWriter0 = new MethodWriter(classWriter0, (-125), "BoSj)?", "BoSj)?", "BoSj)?", stringArray0, true, false);
      methodWriter0.visitFieldInsn(50, "BoSj)?", "RuntimeVisibleAnnotations", "PXxOn}QR\"w$['WE9");
  }

  @Test(timeout = 4000)
  public void test20()  throws Throwable  {
      ClassWriter classWriter0 = new ClassWriter((-79));
      String[] stringArray0 = new String[6];
      stringArray0[0] = "v#b)y}.1ku0";
      stringArray0[1] = "BoSj)?";
      stringArray0[2] = "BoSj)?";
      stringArray0[3] = "v#b)y}.1ku0";
      stringArray0[4] = "v#b)y}.1ku0";
      stringArray0[5] = "v#b)y}.1ku0";
      MethodWriter methodWriter0 = new MethodWriter(classWriter0, (-125), "BoSj)?", "v#b)y}.1ku0", "i:>p6IO4ht/.X'KNb", stringArray0, true, true);
      // Undeclared exception!
      try { 
        methodWriter0.visitMaxs(2, 2219);
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // 11
         //
         verifyException("org.mockito.asm.Type", e);
      }
  }

  @Test(timeout = 4000)
  public void test21()  throws Throwable  {
      ClassWriter classWriter0 = new ClassWriter((-79));
      MethodVisitor methodVisitor0 = classWriter0.visitMethod((-1805), "BoSj)?", "v#b)y}.1ku0", "RuntimeVisibleParameterAnnotations", (String[]) null);
      methodVisitor0.visitInsn(51);
  }

  @Test(timeout = 4000)
  public void test22()  throws Throwable  {
      ClassWriter classWriter0 = new ClassWriter(70);
      MethodWriter methodWriter0 = new MethodWriter(classWriter0, 1, "O__*xenOK5hYw{Q5t/[", "pX[ft7", "pX[ft7", (String[]) null, false, false);
      methodWriter0.visitFrame(2, 4545, (Object[]) null, 4545, (Object[]) null);
  }

  @Test(timeout = 4000)
  public void test23()  throws Throwable  {
      ClassWriter classWriter0 = new ClassWriter((-3098));
      MethodWriter methodWriter0 = new MethodWriter(classWriter0, 2, "G})X4_t", "G})X4_t", "G})X4_t", (String[]) null, true, false);
      MethodWriter methodWriter1 = new MethodWriter(classWriter0, (-1985), "G})X4_t", "G})X4_t", "G})X4_t", (String[]) null, true, false);
      methodWriter1.visitMethodInsn(2323, "RuntimeVisibleParameterAnnotations", "G})X4_t", "G})X4_t");
      assertFalse(methodWriter1.equals((Object)methodWriter0));
  }

  @Test(timeout = 4000)
  public void test24()  throws Throwable  {
      ClassWriter classWriter0 = new ClassWriter(252);
      String[] stringArray0 = new String[0];
      MethodWriter methodWriter0 = new MethodWriter(classWriter0, 141, "Signature", "Signature", "Signature", stringArray0, false, false);
      MethodWriter methodWriter1 = new MethodWriter(classWriter0, 252, "Signature", "fv.-#g v#CD53$&", "fv.-#g v#CD53$&", stringArray0, false, false);
      methodWriter1.visitVarInsn(141, (-1));
      assertFalse(methodWriter1.equals((Object)methodWriter0));
  }

  @Test(timeout = 4000)
  public void test25()  throws Throwable  {
      ClassWriter classWriter0 = new ClassWriter(262144);
      String[] stringArray0 = new String[6];
      stringArray0[0] = "";
      stringArray0[1] = "s3[Akj}3";
      stringArray0[2] = "";
      stringArray0[3] = "";
      stringArray0[4] = "";
      stringArray0[5] = "s3[Akj}3";
      MethodWriter methodWriter0 = new MethodWriter(classWriter0, (-688), "s3[Akj}3", "", "", stringArray0, false, false);
      ByteVector byteVector0 = new ByteVector();
      methodWriter0.put(byteVector0);
  }

  @Test(timeout = 4000)
  public void test26()  throws Throwable  {
      ClassWriter classWriter0 = new ClassWriter(70);
      int[] intArray0 = new int[22];
      intArray0[1] = 2;
      MethodWriter.getNewOffset(intArray0, intArray0, 1, 448);
      MethodWriter methodWriter0 = new MethodWriter(classWriter0, 1, "O__*xenOK5hYw{Q5t/[", "pX[ft7", "pX[ft7", (String[]) null, false, false);
      MethodWriter methodWriter1 = null;
      try {
        methodWriter1 = new MethodWriter(classWriter0, 1, "S)&^}GlfIT{@", "O__*xenOK5hYw{Q5t/[", "G})X4_t", (String[]) null, true, true);
        fail("Expecting exception: StringIndexOutOfBoundsException");
      
      } catch(StringIndexOutOfBoundsException e) {
      }
  }

  @Test(timeout = 4000)
  public void test27()  throws Throwable  {
      ClassWriter classWriter0 = new ClassWriter((-3098));
      MethodWriter methodWriter0 = new MethodWriter(classWriter0, 2, "_#)AF!.", "_#)AF!.", "G})X4_t", (String[]) null, true, false);
      methodWriter0.visitFieldInsn((-3098), "+,:C:E/+:\"~kIKik}.", "+,:C:E/+:\"~kIKik}.", ",PAkxY");
      MethodWriter methodWriter1 = null;
      try {
        methodWriter1 = new MethodWriter(classWriter0, 168, "s3[Akj}3", "W5,'%l", "G})X4_t", (String[]) null, true, true);
        fail("Expecting exception: StringIndexOutOfBoundsException");
      
      } catch(StringIndexOutOfBoundsException e) {
      }
  }

  @Test(timeout = 4000)
  public void test28()  throws Throwable  {
      ClassWriter classWriter0 = new ClassWriter(252);
      String[] stringArray0 = new String[0];
      MethodWriter methodWriter0 = new MethodWriter(classWriter0, 1798, "Exceptions", "Exceptions", "?4\"JBQ", stringArray0, false, false);
      methodWriter0.visitVarInsn(107, 285212675);
  }

  @Test(timeout = 4000)
  public void test29()  throws Throwable  {
      ClassWriter classWriter0 = new ClassWriter(252);
      String[] stringArray0 = new String[0];
      ByteVector byteVector0 = new ByteVector(1);
      byteVector0.put11(252, 2);
      MethodWriter methodWriter0 = null;
      try {
        methodWriter0 = new MethodWriter(classWriter0, 110, ";tgWzR9ot\r1A[+-|", "", "Signature", stringArray0, true, true);
        fail("Expecting exception: StringIndexOutOfBoundsException");
      
      } catch(StringIndexOutOfBoundsException e) {
      }
  }

  @Test(timeout = 4000)
  public void test30()  throws Throwable  {
      ClassWriter classWriter0 = new ClassWriter(262144);
      MethodWriter methodWriter0 = new MethodWriter(classWriter0, 2, "#d;&3J;<7b-F", "f]ox|~^]=v?", "#d;&3J;<7b-F", (String[]) null, false, false);
      MethodWriter methodWriter1 = new MethodWriter(classWriter0, 4, "]>fwqtnXzDG\"#0", "/yHnWm|", "ft", (String[]) null, false, false);
      Object[] objectArray0 = new Object[6];
      // Undeclared exception!
      try { 
        methodWriter1.visitFrame(1, 88, objectArray0, 2, (Object[]) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.mockito.asm.MethodWriter", e);
      }
  }

  @Test(timeout = 4000)
  public void test31()  throws Throwable  {
      ClassWriter classWriter0 = new ClassWriter(252);
      String[] stringArray0 = new String[0];
      MethodWriter methodWriter0 = new MethodWriter(classWriter0, 141, "Signature", "Signature", "Signature", stringArray0, false, false);
      // Undeclared exception!
      try { 
        methodWriter0.visitFrame(1, 1, stringArray0, 70, stringArray0);
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // 0
         //
         verifyException("org.mockito.asm.MethodWriter", e);
      }
  }

  @Test(timeout = 4000)
  public void test32()  throws Throwable  {
      ClassWriter classWriter0 = mock(ClassWriter.class, new ViolatedAssumptionAnswer());
      doReturn(0, 0, 0, 0, 0).when(classWriter0).newClass(anyString());
      doReturn(16777217, 1100).when(classWriter0).newUTF8(anyString());
      String[] stringArray0 = new String[5];
      MethodWriter methodWriter0 = new MethodWriter(classWriter0, 481, "EujfmH7^<shh^XKRXL{", "EujfmH7^<shh^XKRXL{", "EujfmH7^<shh^XKRXL{", stringArray0, false, false);
      methodWriter0.visitFrame(1, (-2570), stringArray0, 1100, stringArray0);
      assertEquals(5, stringArray0.length);
  }

  @Test(timeout = 4000)
  public void test33()  throws Throwable  {
      ClassWriter classWriter0 = new ClassWriter(267386880);
      String[] stringArray0 = new String[2];
      stringArray0[0] = "?zf&1GITV' Tgo*";
      stringArray0[1] = "?zf&1GITV' Tgo*";
      MethodWriter methodWriter0 = null;
      try {
        methodWriter0 = new MethodWriter(classWriter0, 267386880, "?zf&1GITV' Tgo*", "EujfmH7^<shh^XKRXL{", "?zf&1GITV' Tgo*", stringArray0, true, true);
        fail("Expecting exception: StringIndexOutOfBoundsException");
      
      } catch(StringIndexOutOfBoundsException e) {
      }
  }

  @Test(timeout = 4000)
  public void test34()  throws Throwable  {
      int[] intArray0 = new int[1];
      intArray0[0] = 8;
      Label label0 = mock(Label.class, new ViolatedAssumptionAnswer());
      MethodWriter.getNewOffset(intArray0, intArray0, label0);
      ClassWriter classWriter0 = mock(ClassWriter.class, new ViolatedAssumptionAnswer());
      doReturn(0).when(classWriter0).newClass(anyString());
      doReturn(0, 0).when(classWriter0).newUTF8(anyString());
      String[] stringArray0 = new String[1];
      MethodWriter methodWriter0 = null;
      try {
        methodWriter0 = new MethodWriter(classWriter0, 49, "~8MvcPT~c&_}yJVGd^7", "pJu", "#d;&3J;<.b-F", stringArray0, false, true);
        fail("Expecting exception: StringIndexOutOfBoundsException");
      
      } catch(StringIndexOutOfBoundsException e) {
      }
  }

  @Test(timeout = 4000)
  public void test35()  throws Throwable  {
      ClassWriter classWriter0 = new ClassWriter(70);
      int[] intArray0 = new int[22];
      intArray0[1] = 2;
      MethodWriter.getNewOffset(intArray0, intArray0, 1, 448);
      String[] stringArray0 = new String[0];
      MethodWriter methodWriter0 = new MethodWriter(classWriter0, 18, "AAAAAAAAAAAAAAAABCKLLDDDDDEEEEEEEEEEEEEEEEEEEEAAAAAAAADDDDDEEEEEEEEEEEEEEEEEEEEAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAMAAAAAAAAAAAAAAAAAAAAIIIIIIIIIIIIIIIIDNOAAAAAAGGGGGGGHAFBFAAFFAAQP&IJJIIIIIIIIIIIIIIIIII", "G})X4_t", "G})X4_t", stringArray0, false, false);
  }

  @Test(timeout = 4000)
  public void test36()  throws Throwable  {
      ClassWriter classWriter0 = new ClassWriter(117);
      String[] stringArray0 = new String[4];
      stringArray0[0] = "RuntimeInvisibleParameterAnnotations";
      stringArray0[1] = "r!%04j\"Y@jAtC*-";
      stringArray0[2] = "RuntimeInvisibleParameterAnnotations";
      stringArray0[3] = "RuntimeInvisibleParameterAnnotations";
      MethodWriter methodWriter0 = new MethodWriter(classWriter0, 1141, "RuntimeInvisibleParameterAnnotations", "RuntimeInvisibleParameterAnnotations", "RuntimeInvisibleParameterAnnotations", stringArray0, false, false);
      int int0 = methodWriter0.getSize();
      assertEquals(32, int0);
  }

  @Test(timeout = 4000)
  public void test37()  throws Throwable  {
      Label label0 = new Label();
      ClassWriter classWriter0 = new ClassWriter(252);
      String[] stringArray0 = new String[0];
      MethodWriter methodWriter0 = new MethodWriter(classWriter0, 141, "Signature", "Signature", "Signature", stringArray0, false, false);
      MethodWriter methodWriter1 = new MethodWriter(classWriter0, 252, "Signature", "fv.-#g v#CD53$&", "fv.-#g v#CD53$&", stringArray0, false, false);
      methodWriter1.visitFieldInsn(141, "", "fv.-#g v#CD53$&", "fv.-#g v#CD53$&");
      methodWriter0.visitTryCatchBlock(label0, label0, label0, "`C`n:'(x|<mjh");
      assertFalse(methodWriter0.equals((Object)methodWriter1));
  }

  @Test(timeout = 4000)
  public void test38()  throws Throwable  {
      ClassWriter classWriter0 = new ClassWriter(70);
      MethodWriter methodWriter0 = new MethodWriter(classWriter0, 2, "#d;&3J;<7Nb-F", "G})X4_t", "#d;&3J;<7Nb-F", (String[]) null, true, true);
      ByteVector byteVector0 = classWriter0.pool;
      methodWriter0.visitAnnotationDefault();
      methodWriter0.put(byteVector0);
  }

  @Test(timeout = 4000)
  public void test39()  throws Throwable  {
      ClassWriter classWriter0 = new ClassWriter(242);
      String[] stringArray0 = new String[2];
      stringArray0[0] = "6W3qJ-B+Km";
      stringArray0[1] = "6W3qJ-B+Km";
      MethodWriter methodWriter0 = new MethodWriter(classWriter0, 115, "6W3qJ-B+Km", "Exceptions", "6W3qJ-B+Km", stringArray0, false, false);
      methodWriter0.visitAnnotationDefault();
      ByteVector byteVector0 = classWriter0.pool;
      methodWriter0.put(byteVector0);
      MethodWriter methodWriter1 = null;
      try {
        methodWriter1 = new MethodWriter(classWriter0, 41, "6W3qJ-B+Km", "Exceptions", "java/lang/Class", stringArray0, true, true);
        fail("Expecting exception: StringIndexOutOfBoundsException");
      
      } catch(StringIndexOutOfBoundsException e) {
      }
  }

  @Test(timeout = 4000)
  public void test40()  throws Throwable  {
      ClassWriter classWriter0 = new ClassWriter(83);
      String[] stringArray0 = new String[3];
      stringArray0[0] = "NCaTRZk &";
      stringArray0[1] = "<ini>";
      stringArray0[2] = "-^";
      MethodWriter methodWriter0 = new MethodWriter(classWriter0, 3, "NCaTRZk &", "<ini>", "-^", stringArray0, false, false);
      methodWriter0.visitInsn(558);
  }

  @Test(timeout = 4000)
  public void test41()  throws Throwable  {
      ClassWriter classWriter0 = new ClassWriter(262121);
      MethodWriter methodWriter0 = new MethodWriter(classWriter0, 2, "#d;&3J;<7b-F", "k2)X4_t", "#d;&3J;<7b-F", (String[]) null, true, true);
      methodWriter0.visitInsn(2);
      String[] stringArray0 = new String[0];
      MethodWriter methodWriter1 = null;
      try {
        methodWriter1 = new MethodWriter(classWriter0, 20, "#d;&3J;<7b-F", "wRlxJ}d2SFL", "k2)X4_t", stringArray0, true, false);
        fail("Expecting exception: StringIndexOutOfBoundsException");
      
      } catch(StringIndexOutOfBoundsException e) {
      }
  }

  @Test(timeout = 4000)
  public void test42()  throws Throwable  {
      ClassWriter classWriter0 = new ClassWriter(252);
      String[] stringArray0 = new String[0];
      MethodWriter methodWriter0 = new MethodWriter(classWriter0, 131, "Signature", "Signature", "Signature", stringArray0, false, false);
      methodWriter0.visitInsn(1);
  }

  @Test(timeout = 4000)
  public void test43()  throws Throwable  {
      ClassWriter classWriter0 = new ClassWriter((-3098));
      MethodWriter methodWriter0 = new MethodWriter(classWriter0, 2, "G})X4_t", "G})X4_t", "G})X4_t", (String[]) null, true, false);
      methodWriter0.visitVarInsn(88, 84);
      MethodWriter methodWriter1 = new MethodWriter(classWriter0, (-2940), "A29gs@hS|3]X=T*", "FV&=>\"Ef#m%", "]p&dWbpO3M>dm!;y Q", (String[]) null, false, false);
      assertFalse(methodWriter1.equals((Object)methodWriter0));
  }

  @Test(timeout = 4000)
  public void test44()  throws Throwable  {
      ClassWriter classWriter0 = new ClassWriter(262144);
      MethodWriter methodWriter0 = new MethodWriter(classWriter0, 2, "#d;&3J;<7b-F", "S)&^}GlfIT{@", "#d;&3J;<7b-F", (String[]) null, true, true);
      methodWriter0.visitVarInsn(110, 262144);
      MethodWriter methodWriter1 = null;
      try {
        methodWriter1 = new MethodWriter(classWriter0, 2488, "#d;&3J;<7b-F", "#d;&3J;<7b-F", "S)&^}GlfIT{@", (String[]) null, true, false);
        fail("Expecting exception: StringIndexOutOfBoundsException");
      
      } catch(StringIndexOutOfBoundsException e) {
      }
  }

  @Test(timeout = 4000)
  public void test45()  throws Throwable  {
      ClassWriter classWriter0 = new ClassWriter(262144);
      MethodWriter methodWriter0 = new MethodWriter(classWriter0, 2, "`{B(Jk", "`{B(Jk", "k2)X4_t", (String[]) null, false, false);
      int[] intArray0 = new int[4];
      int int0 = MethodWriter.getNewOffset(intArray0, intArray0, 262144, (-255));
      assertEquals((-262399), int0);
  }

  @Test(timeout = 4000)
  public void test46()  throws Throwable  {
      ClassWriter classWriter0 = new ClassWriter((-79));
      String[] stringArray0 = new String[6];
      stringArray0[0] = "BoSj)?";
      stringArray0[1] = "BoSj)?";
      stringArray0[2] = "BoSj)?";
      stringArray0[3] = "BoSj)?";
      stringArray0[4] = "BoSj)?";
      stringArray0[5] = "BoSj)?";
      MethodWriter methodWriter0 = new MethodWriter(classWriter0, (-125), "BoSj)?", "BoSj)?", "BoSj)?", stringArray0, true, false);
      methodWriter0.visitMethodInsn((-79), "BoSj)?", "BoSj)?", "BoSj)?");
      methodWriter0.visitVarInsn(1, 125);
  }

  @Test(timeout = 4000)
  public void test47()  throws Throwable  {
      ClassWriter classWriter0 = new ClassWriter((-79));
      String[] stringArray0 = new String[6];
      stringArray0[0] = "v#b)y}.1ku0";
      stringArray0[1] = "Label offset position has not been resolved yet";
      stringArray0[2] = "BoSj)?";
      stringArray0[3] = "v#b)y}.1ku0";
      stringArray0[4] = "v#b)y}.1ku0";
      stringArray0[5] = "v#b)y}.1ku0";
      MethodWriter methodWriter0 = new MethodWriter(classWriter0, (-125), "BoSj)?", "v#b)y}.1ku0", "i:>p6IO4ht/.X'KNb", stringArray0, true, true);
      methodWriter0.visitVarInsn(2, (-125));
  }

  @Test(timeout = 4000)
  public void test48()  throws Throwable  {
      ClassWriter classWriter0 = new ClassWriter(262144);
      MethodWriter methodWriter0 = new MethodWriter(classWriter0, 2, "#d;&3J;<7b-F", "k2)X4_t", "#d;&3J;<7b-F", (String[]) null, true, false);
      methodWriter0.visitLdcInsn("#d;&3J;<7b-F");
      MethodWriter methodWriter1 = null;
      try {
        methodWriter1 = new MethodWriter(classWriter0, 2, "Signature", "q", "q", (String[]) null, true, false);
        fail("Expecting exception: StringIndexOutOfBoundsException");
      
      } catch(StringIndexOutOfBoundsException e) {
      }
  }

  @Test(timeout = 4000)
  public void test49()  throws Throwable  {
      ClassWriter classWriter0 = new ClassWriter(70);
      MethodWriter methodWriter0 = new MethodWriter(classWriter0, 2, "#d;&3J;<7b-F", "G})X4_t", "#d;&3J;<7b-F", (String[]) null, true, true);
      ByteVector byteVector0 = classWriter0.pool;
      MethodWriter methodWriter1 = new MethodWriter(classWriter0, 1, "G})X4_t", "G})X4_t", (String) null, (String[]) null, false, false);
      methodWriter1.put(byteVector0);
      assertFalse(methodWriter1.equals((Object)methodWriter0));
  }

  @Test(timeout = 4000)
  public void test50()  throws Throwable  {
      ClassWriter classWriter0 = new ClassWriter(1755);
      String[] stringArray0 = new String[3];
      stringArray0[0] = "B'Ie5EWJ";
      stringArray0[1] = "B'Ie5EWJ";
      stringArray0[2] = "B'Ie5EWJ";
      MethodWriter methodWriter0 = new MethodWriter(classWriter0, 1755, "B'Ie5EWJ", "B'Ie5EWJ", "B'Ie5EWJ", stringArray0, false, false);
      methodWriter0.visitMaxs(2142, 31);
  }

  @Test(timeout = 4000)
  public void test51()  throws Throwable  {
      ClassWriter classWriter0 = new ClassWriter(262144);
      MethodWriter methodWriter0 = new MethodWriter(classWriter0, 2, "#d;&3J;<7b-F", "k2)X4_t", "#d;&3J;<7b-F", (String[]) null, false, false);
      MethodWriter methodWriter1 = new MethodWriter(classWriter0, 1, "k2)X4_t", "k2)X4_t", (String) null, (String[]) null, false, true);
      int int0 = methodWriter0.getSize();
      assertEquals(16, int0);
  }

  @Test(timeout = 4000)
  public void test52()  throws Throwable  {
      ClassWriter classWriter0 = new ClassWriter(252);
      String[] stringArray0 = new String[5];
      stringArray0[0] = "Signature";
      stringArray0[1] = "'";
      stringArray0[2] = "'";
      stringArray0[3] = "Signature";
      stringArray0[4] = "Signature";
      MethodWriter methodWriter0 = new MethodWriter(classWriter0, 1, "Signature", "'", "'", stringArray0, false, false);
      methodWriter0.visitAnnotation("Signature", false);
      ByteVector byteVector0 = new ByteVector(100);
      methodWriter0.put(byteVector0);
  }

  @Test(timeout = 4000)
  public void test53()  throws Throwable  {
      ClassWriter classWriter0 = new ClassWriter(83);
      String[] stringArray0 = new String[3];
      stringArray0[0] = "NCaTRZk &";
      stringArray0[1] = "<ini>";
      stringArray0[2] = "-^";
      MethodWriter methodWriter0 = new MethodWriter(classWriter0, 3, "NCaTRZk &", "<ini>", "-^", stringArray0, false, false);
      ByteVector byteVector0 = classWriter0.pool;
      byteVector0.putLong(0L);
      methodWriter0.visitFieldInsn(211, "<ini>", "`8$E5L(_*P8Os;'9P-\"", "`8$E5L(_*P8Os;'9P-\"");
  }

  @Test(timeout = 4000)
  public void test54()  throws Throwable  {
      ClassWriter classWriter0 = new ClassWriter(242);
      String[] stringArray0 = new String[2];
      stringArray0[0] = "6W3qJ-B+Km";
      stringArray0[1] = "6W3qJ-B+Km";
      MethodWriter methodWriter0 = new MethodWriter(classWriter0, 115, "6W3qJ-B+Km", "Exceptions", "6W3qJ-B+Km", stringArray0, false, false);
      ByteVector byteVector0 = classWriter0.pool;
      byteVector0.putLong(0L);
      MethodWriter methodWriter1 = null;
      try {
        methodWriter1 = new MethodWriter(classWriter0, 41, "6W3qJ-B+Km", "Exceptions", "java/lang/Class", stringArray0, true, true);
        fail("Expecting exception: StringIndexOutOfBoundsException");
      
      } catch(StringIndexOutOfBoundsException e) {
      }
  }

  @Test(timeout = 4000)
  public void test55()  throws Throwable  {
      ClassWriter classWriter0 = new ClassWriter(70);
      MethodWriter methodWriter0 = new MethodWriter(classWriter0, 2, "#d;&3J;<7b-F", "G})X4_t", "#d;&3J;<7b-F", (String[]) null, true, true);
      methodWriter0.visitMethodInsn(1, "G})X4_t", "G})X4_t", "#d;&3J;<7b-F");
      ByteVector byteVector0 = classWriter0.pool;
      MethodWriter methodWriter1 = new MethodWriter(classWriter0, 2, "G})X4_t", "Ljava/lang/Synthetic;", "G})X4_t", (String[]) null, false, false);
      ByteVector byteVector1 = byteVector0.putLong(0L);
      assertSame(byteVector0, byteVector1);
  }

  @Test(timeout = 4000)
  public void test56()  throws Throwable  {
      ClassWriter classWriter0 = new ClassWriter(41);
      MethodWriter methodWriter0 = new MethodWriter(classWriter0, 2, "Synthetic", "-%S,F`rPr=g?,4H", (String) null, (String[]) null, false, false);
      methodWriter0.visitFrame(3, 16777219, (Object[]) null, 1931, (Object[]) null);
  }

  @Test(timeout = 4000)
  public void test57()  throws Throwable  {
      ClassWriter classWriter0 = new ClassWriter(70);
      MethodWriter methodWriter0 = new MethodWriter(classWriter0, 2, "#d;&3J;<7b-F", "G})X4_t", "#d;&3J;<7b-F", (String[]) null, true, true);
      methodWriter0.visitMethodInsn(1, "G})X4_t", "G})X4_t", "#d;&3J;<7b-F");
      ByteVector byteVector0 = classWriter0.pool;
      MethodWriter methodWriter1 = new MethodWriter(classWriter0, 1, "G})X4_t", "G})X4_t", (String) null, (String[]) null, false, false);
      Label label0 = new Label();
      methodWriter0.visitLineNumber(70, label0);
      methodWriter0.put(byteVector0);
      assertFalse(methodWriter0.equals((Object)methodWriter1));
  }

  @Test(timeout = 4000)
  public void test58()  throws Throwable  {
      ClassWriter classWriter0 = mock(ClassWriter.class, new ViolatedAssumptionAnswer());
      doReturn(0, 0, 0, 0, 0).when(classWriter0).newClass(anyString());
      doReturn(16777217, 1100).when(classWriter0).newUTF8(anyString());
      String[] stringArray0 = new String[5];
      MethodWriter methodWriter0 = new MethodWriter(classWriter0, 481, "EujfmH7^<shh^XKRXL{", "EujfmH7^<shh^XKRXL{", "EujfmH7^<shh^XKRXL{", stringArray0, false, false);
      // Undeclared exception!
      try { 
        methodWriter0.visitFrame(4, 4, stringArray0, 1733, stringArray0);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.mockito.asm.MethodWriter", e);
      }
  }

  @Test(timeout = 4000)
  public void test59()  throws Throwable  {
      ClassWriter classWriter0 = new ClassWriter(70);
      MethodWriter methodWriter0 = new MethodWriter(classWriter0, 2, "#d;&3J;<7Nb-F", "G})X4_t", "#d;&3J;<7Nb-F", (String[]) null, true, true);
      MethodWriter methodWriter1 = new MethodWriter(classWriter0, (-3227), "b8)Ikm?0*c<ave[i5", "#d;&3J;<7Nb-F", "float", (String[]) null, false, false);
      methodWriter0.visitAnnotation("#d;&3J;<7Nb-F", true);
      ByteVector byteVector0 = classWriter0.pool;
      methodWriter0.put(byteVector0);
      assertFalse(methodWriter0.equals((Object)methodWriter1));
  }

  @Test(timeout = 4000)
  public void test60()  throws Throwable  {
      ClassWriter classWriter0 = new ClassWriter((-3098));
      MethodWriter methodWriter0 = new MethodWriter(classWriter0, 2, "2c-)X4_t", "2c-)X4_t", "2c-)X4_t", (String[]) null, true, false);
      methodWriter0.visitVarInsn(1, 84);
      MethodWriter methodWriter1 = new MethodWriter(classWriter0, (-2940), "A29gs@hS|3]X=T*", "FV&=>\"Ef#m%", "]p&dWbpO3M>dm!;y Q", (String[]) null, false, false);
      assertFalse(methodWriter1.equals((Object)methodWriter0));
  }

  @Test(timeout = 4000)
  public void test61()  throws Throwable  {
      ClassWriter classWriter0 = new ClassWriter(262144);
      MethodWriter methodWriter0 = new MethodWriter(classWriter0, 268435455, "8", "k2)X4_t", "RuntimeInvisibleAnnotations", (String[]) null, true, true);
      ByteVector byteVector0 = new ByteVector();
      methodWriter0.put(byteVector0);
  }

  @Test(timeout = 4000)
  public void test62()  throws Throwable  {
      ClassWriter classWriter0 = new ClassWriter(252);
      String[] stringArray0 = new String[0];
      MethodWriter methodWriter0 = new MethodWriter(classWriter0, (-688), "Signature", "Deprecated", "RZntimeInvisibleParameterAnnutat>ons", stringArray0, false, false);
      ByteVector byteVector0 = new ByteVector();
      methodWriter0.put(byteVector0);
  }

  @Test(timeout = 4000)
  public void test63()  throws Throwable  {
      ClassWriter classWriter0 = new ClassWriter(262144);
      MethodWriter methodWriter0 = new MethodWriter(classWriter0, 65555, "`{B8Jk", "`{B8Jk", "k2)X4_t", (String[]) null, false, false);
      ByteVector byteVector0 = new ByteVector();
      Attribute attribute0 = new Attribute("-^");
      methodWriter0.visitAttribute(attribute0);
      // Undeclared exception!
      try { 
        methodWriter0.put(byteVector0);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.mockito.asm.Attribute", e);
      }
  }

  @Test(timeout = 4000)
  public void test64()  throws Throwable  {
      ClassWriter classWriter0 = new ClassWriter(262144);
      MethodWriter methodWriter0 = new MethodWriter(classWriter0, 2, "#d;&3J;<7b-F", "k2)X4_t", "#d;&3J;<7b-F", (String[]) null, false, false);
      String[] stringArray0 = new String[2];
      stringArray0[0] = "Exceptions";
      stringArray0[1] = "k2)X4_t";
      MethodWriter methodWriter1 = new MethodWriter(classWriter0, 21, "arq8", "@dFs-_}5", "arq8", stringArray0, false, false);
      ByteVector byteVector0 = classWriter0.pool;
      methodWriter0.put(byteVector0);
      assertFalse(methodWriter0.equals((Object)methodWriter1));
  }

  @Test(timeout = 4000)
  public void test65()  throws Throwable  {
      ClassWriter classWriter0 = new ClassWriter(70);
      MethodWriter methodWriter0 = new MethodWriter(classWriter0, 2, "#d;&3J;<7b-F", "G})X4_t", "#d;&3J;<7b-F", (String[]) null, true, true);
      methodWriter0.visitMethodInsn(1, "G})X4_t", "G})X4_t", "#d;&3J;<7b-F");
      ByteVector byteVector0 = classWriter0.pool;
      methodWriter0.put(byteVector0);
  }

  @Test(timeout = 4000)
  public void test66()  throws Throwable  {
      ClassWriter classWriter0 = new ClassWriter(117);
      String[] stringArray0 = new String[4];
      stringArray0[0] = "RuntimeInvisibleParameterAnnotations";
      stringArray0[1] = "r!%04j\"Y@jAtC*-";
      stringArray0[2] = "RuntimeInvisibleParameterAnnotations";
      stringArray0[3] = "RuntimeInvisibleParameterAnnotations";
      MethodWriter methodWriter0 = new MethodWriter(classWriter0, (-1254), "RuntimeInvisibleParameterAnnotations", "RuntimeInvisibleParameterAnnotations", "RuntimeInvisibleParameterAnnotations", stringArray0, false, false);
      methodWriter0.visitIincInsn(117, (-1254));
      int int0 = methodWriter0.getSize();
      assertEquals(68, int0);
  }

  @Test(timeout = 4000)
  public void test67()  throws Throwable  {
      ClassWriter classWriter0 = new ClassWriter(70);
      MethodWriter methodWriter0 = new MethodWriter(classWriter0, 2, "#d;&3J;<7b-F", "G})X4_t", "#d;&3J;<7b-F", (String[]) null, true, true);
      methodWriter0.visitMethodInsn(1, "G})X4_t", "G})X4_t", "#d;&3J;<7b-F");
      ByteVector byteVector0 = classWriter0.pool;
      MethodWriter methodWriter1 = new MethodWriter(classWriter0, 1, "G})X4_t", "G})X4_t", (String) null, (String[]) null, false, false);
      Label label0 = new Label();
      methodWriter0.visitLocalVariable("G})X4_t", "&fe+P-=7`", "G})X4_t", label0, label0, 179);
      methodWriter0.put(byteVector0);
      assertFalse(methodWriter0.equals((Object)methodWriter1));
  }

  @Test(timeout = 4000)
  public void test68()  throws Throwable  {
      ClassWriter classWriter0 = new ClassWriter(252);
      String[] stringArray0 = new String[0];
      MethodWriter methodWriter0 = new MethodWriter(classWriter0, 141, "Signature", "Signature", "Signature", stringArray0, false, false);
      methodWriter0.visitAnnotation("Signature", false);
      ByteVector byteVector0 = new ByteVector(1);
      methodWriter0.put(byteVector0);
      MethodWriter methodWriter1 = null;
      try {
        methodWriter1 = new MethodWriter(classWriter0, 110, ";tgWzR9ot\r1A[+-|", "", "Signature", stringArray0, true, true);
        fail("Expecting exception: StringIndexOutOfBoundsException");
      
      } catch(StringIndexOutOfBoundsException e) {
      }
  }

  @Test(timeout = 4000)
  public void test69()  throws Throwable  {
      ClassWriter classWriter0 = new ClassWriter(242);
      String[] stringArray0 = new String[2];
      stringArray0[0] = "6W3qJ-B+Km";
      stringArray0[1] = "6W3qJ-B+Km";
      MethodWriter methodWriter0 = new MethodWriter(classWriter0, 115, "6W3qJ-B+Km", "Exceptions", "6W3qJ-B+Km", stringArray0, false, false);
      methodWriter0.visitTypeInsn(242, "k3L^N2m:K");
      ByteVector byteVector0 = classWriter0.pool;
      methodWriter0.put(byteVector0);
  }

  @Test(timeout = 4000)
  public void test70()  throws Throwable  {
      ClassWriter classWriter0 = new ClassWriter(252);
      String[] stringArray0 = new String[0];
      MethodWriter methodWriter0 = new MethodWriter(classWriter0, 141, "Signature", "Signature", "Signature", stringArray0, false, false);
      methodWriter0.visitMethodInsn(141, "Synthetic", "XC].ZogAT$] >", "Iw{C~5RNT");
      methodWriter0.visitFrame(103, 103, stringArray0, 1259, stringArray0);
      byte[] byteArray0 = classWriter0.toByteArray();
      assertEquals(152, byteArray0.length);
  }

  @Test(timeout = 4000)
  public void test71()  throws Throwable  {
      ClassWriter classWriter0 = new ClassWriter((-79));
      String[] stringArray0 = new String[0];
      MethodWriter methodWriter0 = new MethodWriter(classWriter0, 12, "Label offset position has not been resolved yet", "v#b)y}.1ku0", "Label offset position has not been resolved yet", stringArray0, true, true);
      methodWriter0.visitIincInsn(2, 2);
  }

  @Test(timeout = 4000)
  public void test72()  throws Throwable  {
      ClassWriter classWriter0 = new ClassWriter(252);
      String[] stringArray0 = new String[0];
      MethodWriter methodWriter0 = new MethodWriter(classWriter0, 141, "Signature", "Signature", "Signature", stringArray0, false, false);
      methodWriter0.visitMaxs(574, 252);
  }

  @Test(timeout = 4000)
  public void test73()  throws Throwable  {
      ClassWriter classWriter0 = new ClassWriter((-79));
      String[] stringArray0 = new String[6];
      stringArray0[0] = "BoSj)?";
      stringArray0[1] = "BoSj)?";
      stringArray0[2] = "BoSj)?";
      stringArray0[3] = "BoSj)?";
      stringArray0[4] = "BoSj)?";
      stringArray0[5] = "BoSj)?";
      MethodWriter methodWriter0 = new MethodWriter(classWriter0, (-125), "BoSj)?", "BoSj)?", "BoSj)?", stringArray0, true, false);
      methodWriter0.visitMaxs(2, 2180);
  }

  @Test(timeout = 4000)
  public void test74()  throws Throwable  {
      ClassWriter classWriter0 = new ClassWriter(18);
      String[] stringArray0 = new String[1];
      stringArray0[0] = "";
      MethodWriter methodWriter0 = new MethodWriter(classWriter0, 1, "", "@ZSC~em)J\">=Vb&8", "@ZSC~em)J\">=Vb&8", stringArray0, true, false);
      MethodWriter methodWriter1 = null;
      try {
        methodWriter1 = new MethodWriter(classWriter0, 73, "", "", "", stringArray0, true, false);
        fail("Expecting exception: StringIndexOutOfBoundsException");
      
      } catch(StringIndexOutOfBoundsException e) {
      }
  }

  @Test(timeout = 4000)
  public void test75()  throws Throwable  {
      ClassWriter classWriter0 = new ClassWriter(262144);
      String[] stringArray0 = new String[6];
      stringArray0[0] = "";
      stringArray0[1] = "s3[Akj}3";
      stringArray0[2] = "";
      stringArray0[3] = "";
      stringArray0[4] = "";
      stringArray0[5] = "s3[Akj}3";
      MethodWriter methodWriter0 = new MethodWriter(classWriter0, (-688), "s3[Akj}3", "", "", stringArray0, false, false);
      methodWriter0.visitTryCatchBlock((Label) null, (Label) null, (Label) null, "s3[Akj}3");
      methodWriter0.visitFieldInsn(2, "s3[Akj}3", "", "SourceFile");
      ByteVector byteVector0 = new ByteVector();
      // Undeclared exception!
      try { 
        methodWriter0.put(byteVector0);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.mockito.asm.MethodWriter", e);
      }
  }

  @Test(timeout = 4000)
  public void test76()  throws Throwable  {
      ClassWriter classWriter0 = new ClassWriter(262144);
      MethodWriter methodWriter0 = new MethodWriter(classWriter0, 168, "#d;&3J;<7b-F", "#d;&3J;<7b-F", "#d;&3J;<7b-F", (String[]) null, false, false);
      MethodWriter methodWriter1 = new MethodWriter(classWriter0, (-1715), "N}Ar7q(Wlw&1", "k}<", ".class", (String[]) null, false, false);
      ByteVector byteVector0 = classWriter0.pool;
      methodWriter1.put(byteVector0);
      assertFalse(methodWriter1.equals((Object)methodWriter0));
  }

  @Test(timeout = 4000)
  public void test77()  throws Throwable  {
      Label label0 = new Label();
      ClassWriter classWriter0 = new ClassWriter(252);
      String[] stringArray0 = new String[5];
      stringArray0[0] = "Signature";
      stringArray0[1] = "'";
      stringArray0[2] = "'";
      stringArray0[3] = "Signature";
      stringArray0[4] = "Signature";
      MethodWriter methodWriter0 = new MethodWriter(classWriter0, 1, "Signature", "'", "'", stringArray0, false, false);
      methodWriter0.visitLocalVariable("^TQ.~Iim4%V6", ")yf]Ox5ZEgqr8yoRM", "G})X4_t", label0, label0, 303);
  }

  @Test(timeout = 4000)
  public void test78()  throws Throwable  {
      Label label0 = new Label();
      ClassWriter classWriter0 = new ClassWriter(252);
      String[] stringArray0 = new String[0];
      MethodWriter methodWriter0 = new MethodWriter(classWriter0, 1798, "Exceptions", "Exceptions", "?4\"JBQ", stringArray0, false, false);
      methodWriter0.visitLocalVariable("Exceptions", "Exceptions", "Exceptions", label0, label0, 2);
      methodWriter0.visitIincInsn(1798, 942);
      ByteVector byteVector0 = new ByteVector(54);
      methodWriter0.put(byteVector0);
  }

  @Test(timeout = 4000)
  public void test79()  throws Throwable  {
      ClassWriter classWriter0 = new ClassWriter((-79));
      String[] stringArray0 = new String[6];
      stringArray0[0] = "v#b)y}.1ku0";
      stringArray0[1] = "Label offset position has not been resolved yet";
      stringArray0[2] = "BoSj)?";
      stringArray0[3] = "v#b)y}.1ku0";
      stringArray0[4] = "v#b)y}.1ku0";
      stringArray0[5] = "v#b)y}.1ku0";
      MethodWriter methodWriter0 = new MethodWriter(classWriter0, (-125), "BoSj)?", "v#b)y}.1ku0", "i:>p6IO4ht/.X'KNb", stringArray0, true, false);
      MethodWriter methodWriter1 = new MethodWriter(classWriter0, 1, "7M#{myQo0aFY", "v#b)y}.1ku0", "BoSj)?", stringArray0, false, true);
      methodWriter1.visitIincInsn(60, (-753));
      assertFalse(methodWriter1.equals((Object)methodWriter0));
  }

  @Test(timeout = 4000)
  public void test80()  throws Throwable  {
      ClassWriter classWriter0 = new ClassWriter((-3098));
      MethodWriter methodWriter0 = new MethodWriter(classWriter0, 2, "G})X4_t", "G})X4_t", "G})X4_t", (String[]) null, true, false);
      methodWriter0.visitIincInsn(262144, 128);
      MethodWriter methodWriter1 = new MethodWriter(classWriter0, (-1985), "G})X4_t", "G})X4_t", "G})X4_t", (String[]) null, true, false);
      methodWriter0.visitIincInsn(48, (-384));
      assertFalse(methodWriter0.equals((Object)methodWriter1));
  }

  @Test(timeout = 4000)
  public void test81()  throws Throwable  {
      ClassWriter classWriter0 = new ClassWriter(70);
      MethodWriter methodWriter0 = new MethodWriter(classWriter0, 2, "#d;&3J;<7b-F", "G})X4_t", "#d;&3J;<7b-F", (String[]) null, true, true);
      MethodWriter methodWriter1 = new MethodWriter(classWriter0, 1, "G})X4_t", "G})X4_t", (String) null, (String[]) null, false, false);
      methodWriter1.visitVarInsn(2, 2);
      assertFalse(methodWriter1.equals((Object)methodWriter0));
  }

  @Test(timeout = 4000)
  public void test82()  throws Throwable  {
      ClassWriter classWriter0 = new ClassWriter(107);
      String[] stringArray0 = new String[1];
      MethodWriter methodWriter0 = null;
      try {
        methodWriter0 = new MethodWriter(classWriter0, 18, "AAAAAAAAAAAAAAAABCKLLDDDDDEEEEEEEEEEEEEEEEEEEEAAAAAAAADDDDDEEEEEEEEEEEEEEEEEEEEAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAMAAAAAAAAAAAAAAAAAAAAIIIIIIIIIIIIIIIIDNOAAAAAAGGGGGGGHAFBFAAFFAAQPIIJJIIIIIIIIIIIIIIIIII", "G})X4_t", "G})X4_t", stringArray0, false, false);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
      }
  }

  @Test(timeout = 4000)
  public void test83()  throws Throwable  {
      ClassWriter classWriter0 = new ClassWriter(83);
      String[] stringArray0 = new String[0];
      MethodWriter methodWriter0 = new MethodWriter(classWriter0, 18, "AAAAAAAAAAAAAAAABCKLLDDDDDEEEEEEEEEEEEEEEEEEEEAAAAAAAADDDDDEEEEEEEEEEEEEEEEEEEEAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAMAAAAAAAAAAAAAAAAAAAAIIIIIIIIIIIIIIIIDNOAAAAAAGGGGGGGHAFBFAAFFAAQPIIJJIIIIIIIIIIIIIIIIII", "G})X4_t", "G})X4_t", stringArray0, false, false);
      methodWriter0.visitLdcInsn("G})X4_t");
  }

  @Test(timeout = 4000)
  public void test84()  throws Throwable  {
      ClassWriter classWriter0 = new ClassWriter(252);
      String[] stringArray0 = new String[0];
      MethodWriter methodWriter0 = new MethodWriter(classWriter0, 141, "Signature", "Signature", "Signature", stringArray0, false, false);
      byte[] byteArray0 = classWriter0.toByteArray();
      assertEquals(52, byteArray0.length);
  }
}
