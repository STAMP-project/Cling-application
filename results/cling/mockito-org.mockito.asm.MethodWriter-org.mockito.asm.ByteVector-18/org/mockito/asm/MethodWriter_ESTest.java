/*

 * Tue Mar 03 14:31:10 GMT 2020
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
import org.mockito.asm.ByteVector;
import org.mockito.asm.ClassWriter;
import org.mockito.asm.Label;
import org.mockito.asm.MethodVisitor;
import org.mockito.asm.MethodWriter;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = false, useJEE = true) 
public class MethodWriter_ESTest extends MethodWriter_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test00()  throws Throwable  {
      ClassWriter classWriter0 = new ClassWriter(16777217);
      String[] stringArray0 = new String[0];
      ByteVector byteVector0 = new ByteVector(1);
      byteVector0.putLong(16777217);
      MethodWriter methodWriter0 = null;
      try {
        methodWriter0 = new MethodWriter(classWriter0, (-1870), "lyL}yP5oe9<", "lyL}yP5oe9<", "KfBdIh$FpEsA", stringArray0, false, true);
        fail("Expecting exception: StringIndexOutOfBoundsException");
      
      } catch(StringIndexOutOfBoundsException e) {
      }
  }

  @Test(timeout = 4000)
  public void test01()  throws Throwable  {
      ClassWriter classWriter0 = new ClassWriter(16777217);
      String[] stringArray0 = new String[0];
      ByteVector byteVector0 = classWriter0.pool;
      byteVector0.putLong(1L);
      MethodWriter methodWriter0 = null;
      try {
        methodWriter0 = new MethodWriter(classWriter0, (-1870), "lyL}yP5oe9<", "lyL}yP5oe9<", "KfBdIh$FpEsA", stringArray0, false, true);
        fail("Expecting exception: StringIndexOutOfBoundsException");
      
      } catch(StringIndexOutOfBoundsException e) {
      }
  }

  @Test(timeout = 4000)
  public void test02()  throws Throwable  {
      int[] intArray0 = new int[24];
      intArray0[0] = 115;
      int int0 = MethodWriter.getNewOffset(intArray0, intArray0, 9, 1400);
      assertEquals(1506, int0);
  }

  @Test(timeout = 4000)
  public void test03()  throws Throwable  {
      ClassWriter classWriter0 = new ClassWriter(1);
      MethodWriter methodWriter0 = new MethodWriter(classWriter0, 1, "5)z;*2 _", "5)z;*2 _", "{~vG6C|],E=WY;G~=", (String[]) null, false, false);
      ByteVector byteVector0 = new ByteVector(1);
      MethodWriter methodWriter1 = new MethodWriter(classWriter0, 2, "{~vG6C|],E=WY;G~=", "dJ", "{~vG6C|],E=WY;G~=", (String[]) null, false, false);
      ByteVector byteVector1 = byteVector0.put11((-4195), 2);
      assertSame(byteVector0, byteVector1);
  }

  @Test(timeout = 4000)
  public void test04()  throws Throwable  {
      ClassWriter classWriter0 = new ClassWriter(16777217);
      String[] stringArray0 = new String[0];
      MethodWriter methodWriter0 = new MethodWriter(classWriter0, 2, "O0I&!=7{", "O0I&!=7{", "O0I&!=7{", stringArray0, false, false);
      methodWriter0.visitVarInsn(936, 1);
      String[] stringArray1 = new String[4];
      MethodWriter methodWriter1 = null;
      try {
        methodWriter1 = new MethodWriter(classWriter0, 2357, "O0I&!=7{", "", ">?F<42I3d@6R/}Q8edO", stringArray1, false, false);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
      }
  }

  @Test(timeout = 4000)
  public void test05()  throws Throwable  {
      ClassWriter classWriter0 = new ClassWriter(16777217);
      String[] stringArray0 = new String[0];
      MethodWriter methodWriter0 = new MethodWriter(classWriter0, 2, "O0I&7Q0{", "O0I&7Q0{", "Label offset position has not been resolved yet", stringArray0, false, false);
      MethodWriter methodWriter1 = new MethodWriter(classWriter0, 1, "O0I&7Q0{", "UsRiV#xt*9]@z^%bT", "Label offset position has not been resolved yet", stringArray0, false, false);
      ByteVector byteVector0 = new ByteVector();
      methodWriter1.classReaderOffset = 217;
      // Undeclared exception!
      try { 
        methodWriter1.put(byteVector0);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.mockito.asm.MethodWriter", e);
      }
  }

  @Test(timeout = 4000)
  public void test06()  throws Throwable  {
      ClassWriter classWriter0 = new ClassWriter(1);
      MethodWriter methodWriter0 = new MethodWriter(classWriter0, 1, "C$i|MN", "5)z;*2 _", "Code", (String[]) null, true, false);
      methodWriter0.visitVarInsn(2, 1);
      MethodWriter methodWriter1 = new MethodWriter(classWriter0, (-4297), "5)z;*2 _", "Class not found", "C$i|MN", (String[]) null, false, false);
      methodWriter0.visitIincInsn(1, 849);
      assertFalse(methodWriter0.equals((Object)methodWriter1));
  }

  @Test(timeout = 4000)
  public void test07()  throws Throwable  {
      ClassWriter classWriter0 = new ClassWriter(16777217);
      String[] stringArray0 = new String[0];
      MethodWriter methodWriter0 = new MethodWriter(classWriter0, 2, "O0I&7Q0{", "O0I&7Q0{", "Label offset position has not been resolved yet", stringArray0, false, false);
      MethodWriter methodWriter1 = new MethodWriter(classWriter0, 1, "O0I&7Q0{", "UsRiV#xt*9]@z^%bT", "Label offset position has not been resolved yet", stringArray0, false, false);
      methodWriter1.visitIincInsn(16777217, 90);
      assertFalse(methodWriter1.equals((Object)methodWriter0));
  }

  @Test(timeout = 4000)
  public void test08()  throws Throwable  {
      ClassWriter classWriter0 = new ClassWriter(16777215);
      ByteVector byteVector0 = classWriter0.pool;
      byte[] byteArray0 = new byte[1];
      byteVector0.data = byteArray0;
      byteVector0.putLong(1L);
      String[] stringArray0 = new String[6];
      MethodWriter methodWriter0 = null;
      try {
        methodWriter0 = new MethodWriter(classWriter0, 3117, "O0I&7Q0{", "O0I&7Q0{", "O0I&7Q0{", stringArray0, true, true);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
      }
  }

  @Test(timeout = 4000)
  public void test09()  throws Throwable  {
      ClassWriter classWriter0 = new ClassWriter(16777217);
      String[] stringArray0 = new String[0];
      MethodWriter methodWriter0 = new MethodWriter(classWriter0, 2, "O0I&!=7{", "O0I&!=7{", "Label offset position has not been resolved yet", stringArray0, false, false);
      ByteVector byteVector0 = classWriter0.pool;
      byteVector0.putUTF8("Label offset position has not been resolved yet");
      ByteVector byteVector1 = byteVector0.putLong(34);
      assertSame(byteVector1, byteVector0);
  }

  @Test(timeout = 4000)
  public void test10()  throws Throwable  {
      ClassWriter classWriter0 = new ClassWriter(1);
      MethodWriter methodWriter0 = new MethodWriter(classWriter0, 1, "C$i|MN", "5)z;2 _", "Code", (String[]) null, true, true);
      methodWriter0.visitMethodInsn(2816, "C$i|MN", "i9yj", "java/lang/Class");
      String[] stringArray0 = new String[7];
      stringArray0[0] = "Code";
      stringArray0[1] = "PYVc~H";
      stringArray0[2] = "5)z;2 _";
      stringArray0[3] = "s";
      stringArray0[4] = "s";
      stringArray0[5] = "i9yj";
      stringArray0[6] = "RuntimeInvisibleAnnotations";
      MethodWriter methodWriter1 = null;
      try {
        methodWriter1 = new MethodWriter(classWriter0, 1765, "s", "java/lang/Class", "5)z;2 _", stringArray0, true, true);
        fail("Expecting exception: StringIndexOutOfBoundsException");
      
      } catch(StringIndexOutOfBoundsException e) {
      }
  }

  @Test(timeout = 4000)
  public void test11()  throws Throwable  {
      ClassWriter classWriter0 = mock(ClassWriter.class, new ViolatedAssumptionAnswer());
      doReturn(2032, 2032, 54, 54).when(classWriter0).newClass(anyString());
      doReturn(2032, 54).when(classWriter0).newUTF8(anyString());
      String[] stringArray0 = new String[4];
      MethodWriter methodWriter0 = new MethodWriter(classWriter0, (-38), "7vz;2!_", "7vz;2!_", "7vz;2!_", stringArray0, false, false);
      // Undeclared exception!
      try { 
        methodWriter0.visitFrame(1, 54, stringArray0, 2032, stringArray0);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.mockito.asm.MethodWriter", e);
      }
  }

  @Test(timeout = 4000)
  public void test12()  throws Throwable  {
      ClassWriter classWriter0 = new ClassWriter(115);
      String[] stringArray0 = new String[4];
      stringArray0[0] = "5)z;2 _";
      stringArray0[1] = "5)z;2 _";
      stringArray0[2] = "5)z;2 _";
      stringArray0[3] = "5)z;2 _";
      MethodWriter methodWriter0 = new MethodWriter(classWriter0, (-38), "5)z;2 _", "5)z;2 _", "5)z;2 _", stringArray0, false, true);
      methodWriter0.visitLdcInsn(classWriter0.COMPUTE_FRAMES);
      assertEquals(1, ClassWriter.COMPUTE_MAXS);
  }

  @Test(timeout = 4000)
  public void test13()  throws Throwable  {
      ClassWriter classWriter0 = new ClassWriter(16777217);
      String[] stringArray0 = new String[0];
      MethodWriter methodWriter0 = new MethodWriter(classWriter0, 2, "O0I&7Q0{", "O0I&7Q0{", "Label offset position has not been resolved yet", stringArray0, false, false);
      methodWriter0.visitLdcInsn("O0I&7Q0{");
  }

  @Test(timeout = 4000)
  public void test14()  throws Throwable  {
      ClassWriter classWriter0 = new ClassWriter(16777217);
      String[] stringArray0 = new String[0];
      MethodWriter methodWriter0 = new MethodWriter(classWriter0, 2, "O0I&!=7{", "O0I&!=7{", "Label offset position has not been resolved yet", stringArray0, false, false);
      methodWriter0.visitFieldInsn(2, "Code", "Code", "Label offset position has not been resolved yet");
      MethodWriter methodWriter1 = null;
      try {
        methodWriter1 = new MethodWriter(classWriter0, 83, "Code", "AAAAAAAAAAAAAAAABCKLLDDDDDEEEEEEEEEEEEEEEEEEEEAAAAAAAADDDDDEEEEEEEEEEEEEEEEEEEEAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAMAAAAAAAAAAAAAAAAAAAAIIIIIIIIIIIIIIIIDNOAAAAAAGGGGGGGHAFBFAAFFAAQPIIJJIIIIIIIIIIIIIIIIII", (String) null, (String[]) null, false, true);
        fail("Expecting exception: StringIndexOutOfBoundsException");
      
      } catch(StringIndexOutOfBoundsException e) {
      }
  }

  @Test(timeout = 4000)
  public void test15()  throws Throwable  {
      ClassWriter classWriter0 = mock(ClassWriter.class, new ViolatedAssumptionAnswer());
      doReturn(220, 220, 2335, (-1534)).when(classWriter0).newClass(anyString());
      doReturn(2335, (-1534)).when(classWriter0).newUTF8(anyString());
      String[] stringArray0 = new String[4];
      MethodWriter methodWriter0 = new MethodWriter(classWriter0, (-38), "5)z;2 _", "5)z;2 _", "5)z;2 _", stringArray0, false, true);
      methodWriter0.classReaderOffset = 2;
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
  public void test16()  throws Throwable  {
      ClassWriter classWriter0 = mock(ClassWriter.class, new ViolatedAssumptionAnswer());
      doReturn(110, 110).when(classWriter0).newClass(anyString());
      doReturn(110, 110, 110, 110, 110).when(classWriter0).newUTF8(anyString());
      String[] stringArray0 = new String[2];
      MethodWriter methodWriter0 = new MethodWriter(classWriter0, 2357, "mg_5r27r ^u%hn1,", "", "", stringArray0, false, false);
      Label label0 = new Label();
      methodWriter0.visitLocalVariable("mg_5r27r ^u%hn1,", "B*>^4G&(?<xz6", "mg_5r27r ^u%hn1,", label0, label0, 110);
  }

  @Test(timeout = 4000)
  public void test17()  throws Throwable  {
      ClassWriter classWriter0 = new ClassWriter(121);
      String[] stringArray0 = new String[0];
      MethodWriter methodWriter0 = new MethodWriter(classWriter0, 4567, "O0I&!=7{", "Label offset position has not been resolved yet", "YdJ", stringArray0, false, false);
      Object[] objectArray0 = new Object[1];
      methodWriter0.visitFrame(1, (-210), stringArray0, 2, objectArray0);
      methodWriter0.visitFrame(4567, 646, objectArray0, (-288), objectArray0);
      assertEquals(1, objectArray0.length);
  }

  @Test(timeout = 4000)
  public void test18()  throws Throwable  {
      int[] intArray0 = new int[24];
      intArray0[1] = 2690;
      MethodWriter.getNewOffset(intArray0, intArray0, 2690, 256);
      ClassWriter classWriter0 = new ClassWriter(115);
      MethodWriter methodWriter0 = null;
      try {
        methodWriter0 = new MethodWriter(classWriter0, 2690, "RuntimeVisibleAnnotations", "RuntimeVisibleAnnotations", "RuntimeVisibleAnnotations", (String[]) null, true, true);
        fail("Expecting exception: StringIndexOutOfBoundsException");
      
      } catch(StringIndexOutOfBoundsException e) {
      }
  }

  @Test(timeout = 4000)
  public void test19()  throws Throwable  {
      ClassWriter classWriter0 = new ClassWriter(16777217);
      String[] stringArray0 = new String[0];
      MethodWriter methodWriter0 = new MethodWriter(classWriter0, 2, "O0I&!=7{", "O0I&!=7{", "Label offset position has not been resolved yet", stringArray0, false, false);
      int[] intArray0 = new int[9];
      intArray0[4] = 47;
      int int0 = MethodWriter.getNewOffset(intArray0, intArray0, 832, 2);
      assertEquals((-877), int0);
  }

  @Test(timeout = 4000)
  public void test20()  throws Throwable  {
      ClassWriter classWriter0 = mock(ClassWriter.class, new ViolatedAssumptionAnswer());
      doReturn((-1457), (-1457), 26).when(classWriter0).newClass(anyString());
      doReturn((-27), 26).when(classWriter0).newUTF8(anyString());
      String[] stringArray0 = new String[3];
      MethodWriter methodWriter0 = new MethodWriter(classWriter0, (-38), "5)z;2 _", "5)z;2 _", "5)z;2 _", stringArray0, true, true);
      // Undeclared exception!
      try { 
        methodWriter0.visitIincInsn((-38), 50);
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // -38
         //
         verifyException("org.mockito.asm.Frame", e);
      }
  }

  @Test(timeout = 4000)
  public void test21()  throws Throwable  {
      ClassWriter classWriter0 = new ClassWriter(1);
      String[] stringArray0 = new String[3];
      stringArray0[0] = "org.mockito.asm.ClassReader";
      stringArray0[1] = "Code";
      stringArray0[2] = "org.mockito.asm.ClassReader";
      MethodWriter methodWriter0 = new MethodWriter(classWriter0, 350, "Code", "5)z;*2 _", "Code", stringArray0, false, true);
      methodWriter0.visitFieldInsn(1115, "Deprecated", "Signature", "tQ<w~W(n!:sk9");
  }

  @Test(timeout = 4000)
  public void test22()  throws Throwable  {
      ClassWriter classWriter0 = mock(ClassWriter.class, new ViolatedAssumptionAnswer());
      doReturn(52, 52, 52, (-1659)).when(classWriter0).newClass(anyString());
      doReturn((-1659), 224).when(classWriter0).newUTF8(anyString());
      Label label0 = new Label();
      String[] stringArray0 = new String[4];
      MethodWriter methodWriter0 = new MethodWriter(classWriter0, 26, "5)z;2 _", "5)z;2 _", "5)z;2 _", stringArray0, true, false);
      Label[] labelArray0 = new Label[0];
      methodWriter0.visitTableSwitchInsn(1000, 224, label0, labelArray0);
      methodWriter0.visitIincInsn(3255, 1395);
      methodWriter0.visitVarInsn((-1659), 1649);
  }

  @Test(timeout = 4000)
  public void test23()  throws Throwable  {
      ClassWriter classWriter0 = new ClassWriter(1);
      MethodWriter methodWriter0 = new MethodWriter(classWriter0, 1, "S_enVZ)8^", "5)z;*2 _", "{~vG6C|],E=WY;G~=", (String[]) null, true, true);
      methodWriter0.visitVarInsn(2, 1);
      methodWriter0.visitVarInsn(174, 1);
      String[] stringArray0 = new String[0];
      MethodWriter methodWriter1 = null;
      try {
        methodWriter1 = new MethodWriter(classWriter0, 57, "S_enVZ)8^", ".eJPJjz~ ", ",7CVJvz95gF9\".s", stringArray0, true, true);
        fail("Expecting exception: StringIndexOutOfBoundsException");
      
      } catch(StringIndexOutOfBoundsException e) {
      }
  }

  @Test(timeout = 4000)
  public void test24()  throws Throwable  {
      ClassWriter classWriter0 = new ClassWriter(1);
      MethodWriter methodWriter0 = new MethodWriter(classWriter0, 1, "C$i|MN", "5)z;2 _", "Code", (String[]) null, true, false);
      methodWriter0.visitFieldInsn(609, "RuntimeInvisibleAnnotations", "9#,0aS$hqm]N", "C$i|MN");
      MethodWriter methodWriter1 = new MethodWriter(classWriter0, 27, "RuntimeInvisibleAnnotations", "5)z;2 _", "RuntimeInvisibleAnnotations", (String[]) null, false, true);
      methodWriter0.visitInsn(1);
      assertFalse(methodWriter0.equals((Object)methodWriter1));
  }

  @Test(timeout = 4000)
  public void test25()  throws Throwable  {
      ClassWriter classWriter0 = new ClassWriter(1);
      MethodWriter methodWriter0 = new MethodWriter(classWriter0, 1, "C$i|MN", "5)z;*2 _", "5)z;*2 _", (String[]) null, true, true);
      Label label0 = new Label();
      methodWriter0.visitLocalVariable(" R8", "JSR/RET are not supported with computeFrames option", "5)z;*2 _", label0, label0, (-3540));
  }

  @Test(timeout = 4000)
  public void test26()  throws Throwable  {
      ClassWriter classWriter0 = mock(ClassWriter.class, new ViolatedAssumptionAnswer());
      doReturn(0, 0, 0, 0, 0).when(classWriter0).newClass(anyString());
      doReturn(0, 0).when(classWriter0).newUTF8(anyString());
      String[] stringArray0 = new String[5];
      MethodWriter methodWriter0 = new MethodWriter(classWriter0, 2, "1AX_]d{,3", "1AX_]d{,3", "1AX_]d{,3", stringArray0, false, false);
      methodWriter0.visitFrame(2, 2, stringArray0, 2, stringArray0);
      assertEquals(5, stringArray0.length);
  }

  @Test(timeout = 4000)
  public void test27()  throws Throwable  {
      ClassWriter classWriter0 = new ClassWriter(16777215);
      ByteVector byteVector0 = classWriter0.pool;
      byte[] byteArray0 = new byte[4];
      byteVector0.data = byteArray0;
      byteVector0.put12(34, 2);
      byteVector0.put11(16777215, (byte)34);
      String[] stringArray0 = new String[4];
      MethodWriter methodWriter0 = null;
      try {
        methodWriter0 = new MethodWriter(classWriter0, (short)8290, "Label offset position has not been resolved yet", "Label offset position has not been resolved yet", "[FtH)%]T8YT", stringArray0, false, false);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
      }
  }

  @Test(timeout = 4000)
  public void test28()  throws Throwable  {
      ClassWriter classWriter0 = new ClassWriter(1);
      MethodWriter methodWriter0 = new MethodWriter(classWriter0, 1, "C$i|MN", "5)z;*2 _", "Code", (String[]) null, true, false);
      MethodWriter methodWriter1 = new MethodWriter(classWriter0, (-4297), "5)z;*2 _", "Class not found", "C$i|MN", (String[]) null, false, false);
      // Undeclared exception!
      try { 
        methodWriter0.visitMethodInsn(1, "RuntimeInvisibleParameterAnnotations", "Y%uMcKk", "Code");
        fail("Expecting exception: StringIndexOutOfBoundsException");
      
      } catch(StringIndexOutOfBoundsException e) {
      }
  }

  @Test(timeout = 4000)
  public void test29()  throws Throwable  {
      ClassWriter classWriter0 = new ClassWriter(1);
      String[] stringArray0 = new String[3];
      stringArray0[0] = "org.mockito.asm.ClassReader";
      stringArray0[1] = "Code";
      stringArray0[2] = "org.mockito.asm.ClassReader";
      MethodVisitor methodVisitor0 = classWriter0.visitMethod(2, ".ATS6hqC^ar[J_$R&", "5)z;*2 _", "org.mockito.asm.ClassReader", stringArray0);
      MethodWriter methodWriter0 = new MethodWriter(classWriter0, 2, "Z:Rdv(ikZpae_W", "Code", (String) null, stringArray0, false, false);
      assertFalse(methodWriter0.equals((Object)methodVisitor0));
  }

  @Test(timeout = 4000)
  public void test30()  throws Throwable  {
      ClassWriter classWriter0 = new ClassWriter(1);
      MethodWriter methodWriter0 = new MethodWriter(classWriter0, 1, "C$i|MN", "5)z;2 _", "o{", (String[]) null, false, true);
      MethodWriter methodWriter1 = new MethodWriter(classWriter0, 7, "RuntimeInvisibleAnnotations", "5)z;2 _", "RuntimeInvisibleAnnotations", (String[]) null, false, false);
      int[] intArray0 = new int[4];
      intArray0[1] = 2;
      int int0 = MethodWriter.getNewOffset(intArray0, intArray0, 1, 1);
      assertEquals(0, int0);
  }

  @Test(timeout = 4000)
  public void test31()  throws Throwable  {
      ClassWriter classWriter0 = new ClassWriter(1);
      MethodWriter methodWriter0 = new MethodWriter(classWriter0, 1, "C$i|MN", "5)z;*2 _", "{~vG6C|],E=WY;G~=", (String[]) null, true, false);
      methodWriter0.visitVarInsn(2, 1);
      ByteVector byteVector0 = new ByteVector(2);
      MethodWriter methodWriter1 = new MethodWriter(classWriter0, 614, "2^ Tef`_gy*", "H:()Jiyp{nGR=~(", "C$i|MN", (String[]) null, true, false);
      methodWriter0.put(byteVector0);
      assertFalse(methodWriter0.equals((Object)methodWriter1));
  }

  @Test(timeout = 4000)
  public void test32()  throws Throwable  {
      ClassWriter classWriter0 = new ClassWriter(3349);
      String[] stringArray0 = new String[0];
      MethodWriter methodWriter0 = new MethodWriter(classWriter0, (-973), "*V46", "*V46", "UsRiV#xt*9]@z^%bT", stringArray0, false, false);
      byte[] byteArray0 = classWriter0.toByteArray();
      assertEquals(116, byteArray0.length);
  }

  @Test(timeout = 4000)
  public void test33()  throws Throwable  {
      ClassWriter classWriter0 = new ClassWriter(16777217);
      String[] stringArray0 = new String[0];
      ByteVector byteVector0 = new ByteVector(1);
      byteVector0.put11(2, 2047);
      MethodWriter methodWriter0 = null;
      try {
        methodWriter0 = new MethodWriter(classWriter0, (-1870), "lyL}yP5oe9<", "lyL}yP5oe9<", "KfBdIh$FpEsA", stringArray0, false, true);
        fail("Expecting exception: StringIndexOutOfBoundsException");
      
      } catch(StringIndexOutOfBoundsException e) {
      }
  }

  @Test(timeout = 4000)
  public void test34()  throws Throwable  {
      ClassWriter classWriter0 = new ClassWriter(1);
      MethodWriter methodWriter0 = new MethodWriter(classWriter0, 1, "C$i|MN", "5)z;*2 _", "Code", (String[]) null, true, false);
      Label[] labelArray0 = new Label[6];
      MethodWriter methodWriter1 = new MethodWriter(classWriter0, (-4297), "*q", "Class not found", "C$i|MN", (String[]) null, false, false);
      // Undeclared exception!
      try { 
        methodWriter1.visitFrame(0, 13, labelArray0, 95, (Object[]) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.mockito.asm.MethodWriter", e);
      }
  }

  @Test(timeout = 4000)
  public void test35()  throws Throwable  {
      ClassWriter classWriter0 = new ClassWriter(16777217);
      String[] stringArray0 = new String[0];
      MethodWriter methodWriter0 = new MethodWriter(classWriter0, 2, "O0I&!=7{", "O0I&!=7{", "Label offset position has not been resolved yet", stringArray0, false, false);
      Object[] objectArray0 = new Object[5];
      // Undeclared exception!
      try { 
        methodWriter0.visitFrame(1, 101, objectArray0, (-288), objectArray0);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.mockito.asm.MethodWriter", e);
      }
  }

  @Test(timeout = 4000)
  public void test36()  throws Throwable  {
      ClassWriter classWriter0 = new ClassWriter(16777217);
      String[] stringArray0 = new String[0];
      MethodWriter methodWriter0 = new MethodWriter(classWriter0, 2, "O0I&!=7{", "O0I&!=7{", "Label offset position has not been resolved yet", stringArray0, false, false);
      MethodWriter methodWriter1 = new MethodWriter(classWriter0, 91, "O0I&!=7{", "M:Ou", (String) null, stringArray0, false, false);
      methodWriter0.visitVarInsn(1217, 16777217);
      assertFalse(methodWriter0.equals((Object)methodWriter1));
  }

  @Test(timeout = 4000)
  public void test37()  throws Throwable  {
      ClassWriter classWriter0 = new ClassWriter(1);
      MethodWriter methodWriter0 = new MethodWriter(classWriter0, 1, "C$i|MN", "5)z;*2 _", "{~vG6C|],E=WY;G~=", (String[]) null, false, false);
      MethodWriter methodWriter1 = new MethodWriter(classWriter0, 1, "W4w@c[", "AnnotationDefault", "5)z;*2 _", (String[]) null, false, false);
      methodWriter0.visitAnnotation("4e;0#kT8`75it@Bv", true);
      ByteVector byteVector0 = new ByteVector();
      methodWriter0.put(byteVector0);
      assertFalse(methodWriter0.equals((Object)methodWriter1));
  }

  @Test(timeout = 4000)
  public void test38()  throws Throwable  {
      ClassWriter classWriter0 = new ClassWriter(16777217);
      String[] stringArray0 = new String[0];
      MethodWriter methodWriter0 = new MethodWriter(classWriter0, 2, "O0I&7Q0{", "O0I&7Q0{", "Label offset position has not been resolved yet", stringArray0, false, false);
      methodWriter0.visitAnnotationDefault();
      MethodWriter methodWriter1 = new MethodWriter(classWriter0, 1, "O0I&7Q0{", "UsRiV#xt*9]@z^%bT", "Label offset position has not been resolved yet", stringArray0, false, false);
      ByteVector byteVector0 = new ByteVector(1);
      methodWriter0.put(byteVector0);
      assertFalse(methodWriter0.equals((Object)methodWriter1));
  }

  @Test(timeout = 4000)
  public void test39()  throws Throwable  {
      ClassWriter classWriter0 = new ClassWriter(29);
      String[] stringArray0 = new String[2];
      stringArray0[0] = "O'0[iL2x.{do>^~";
      stringArray0[1] = "O'0[iL2x.{do>^~";
      MethodWriter methodWriter0 = null;
      try {
        methodWriter0 = new MethodWriter(classWriter0, 16, "", "O'0[iL2x.{do>^~", "O'0[iL2x.{do>^~", stringArray0, true, true);
        fail("Expecting exception: StringIndexOutOfBoundsException");
      
      } catch(StringIndexOutOfBoundsException e) {
      }
  }

  @Test(timeout = 4000)
  public void test40()  throws Throwable  {
      String[] stringArray0 = new String[3];
      stringArray0[0] = "org.mockito.asm.ClassReader";
      stringArray0[1] = "Code";
      stringArray0[2] = "org.mockito.asm.ClassReader";
      ClassWriter classWriter0 = new ClassWriter(2);
      MethodVisitor methodVisitor0 = classWriter0.visitMethod(2, ".ATS6hqC^ar[J_$R&", "5)z;*2 _", "org.mockito.asm.ClassReader", stringArray0);
      assertNotNull(methodVisitor0);
  }

  @Test(timeout = 4000)
  public void test41()  throws Throwable  {
      ClassWriter classWriter0 = mock(ClassWriter.class, new ViolatedAssumptionAnswer());
      doReturn(0, 0, 0, 0).when(classWriter0).newClass(anyString());
      doReturn((-1659), 224).when(classWriter0).newUTF8(anyString());
      String[] stringArray0 = new String[4];
      MethodWriter methodWriter0 = new MethodWriter(classWriter0, (-38), "5)z;2 _", "5)z;2 _", "5)z;2 _", stringArray0, false, true);
      methodWriter0.visitInsn(55);
  }

  @Test(timeout = 4000)
  public void test42()  throws Throwable  {
      ClassWriter classWriter0 = mock(ClassWriter.class, new ViolatedAssumptionAnswer());
      doReturn(110, 110).when(classWriter0).newClass(anyString());
      doReturn(110, 110).when(classWriter0).newUTF8(anyString());
      String[] stringArray0 = new String[2];
      MethodWriter methodWriter0 = new MethodWriter(classWriter0, 2357, "mg_5r27r ^u%hn01,$", "mg_5r27r ^u%hn01,$", "mg_5r27r ^u%hn01,$", stringArray0, false, false);
      methodWriter0.visitInsn(128);
  }

  @Test(timeout = 4000)
  public void test43()  throws Throwable  {
      ClassWriter classWriter0 = new ClassWriter(1);
      MethodWriter methodWriter0 = new MethodWriter(classWriter0, 1, "C$i|MN", "5)z;*2 _", "Code", (String[]) null, true, false);
      methodWriter0.visitVarInsn(42, 1);
      MethodWriter methodWriter1 = new MethodWriter(classWriter0, 121, "C$i|MN", "C$i|MN", (String) null, (String[]) null, false, false);
      assertFalse(methodWriter1.equals((Object)methodWriter0));
  }

  @Test(timeout = 4000)
  public void test44()  throws Throwable  {
      ClassWriter classWriter0 = new ClassWriter(16777217);
      String[] stringArray0 = new String[0];
      MethodWriter methodWriter0 = new MethodWriter(classWriter0, 91, "O0I&!=7{", "M:Ou", (String) null, stringArray0, false, false);
      byte[] byteArray0 = classWriter0.toByteArray();
      assertEquals(50, byteArray0.length);
  }

  @Test(timeout = 4000)
  public void test45()  throws Throwable  {
      ClassWriter classWriter0 = new ClassWriter(1);
      String[] stringArray0 = new String[3];
      stringArray0[0] = "org.mockito.asm.ClassReader";
      stringArray0[1] = "Code";
      stringArray0[2] = "org.mockito.asm.ClassReader";
      MethodWriter methodWriter0 = new MethodWriter(classWriter0, 350, "Code", "5)z;*2 _", "Code", stringArray0, false, true);
      Label label0 = new Label();
      int[] intArray0 = new int[6];
      intArray0[0] = 2;
      MethodWriter.getNewOffset(intArray0, intArray0, label0);
      assertEquals(6, intArray0.length);
  }

  @Test(timeout = 4000)
  public void test46()  throws Throwable  {
      ClassWriter classWriter0 = new ClassWriter(16777217);
      String[] stringArray0 = new String[0];
      MethodWriter methodWriter0 = new MethodWriter(classWriter0, 2, "O0I&!=7{", "O0I&!=7{", "Label offset position has not been resolved yet", stringArray0, false, false);
      int[] intArray0 = new int[9];
      intArray0[0] = 2047;
      int int0 = MethodWriter.getNewOffset(intArray0, intArray0, 832, 2);
      assertEquals((-830), int0);
  }

  @Test(timeout = 4000)
  public void test47()  throws Throwable  {
      ClassWriter classWriter0 = new ClassWriter(1);
      MethodWriter methodWriter0 = new MethodWriter(classWriter0, 1, "5)z;*2 _", "5)z;*2 _", "Code", (String[]) null, true, false);
      MethodWriter methodWriter1 = new MethodWriter(classWriter0, 39, "RuntimeVisibleParameterAnnotations", "5)z;*2 _", "C$i|MN", (String[]) null, false, true);
      methodWriter0.visitLdcInsn("RuntimeVisibleParameterAnnotations");
      assertFalse(methodWriter0.equals((Object)methodWriter1));
  }

  @Test(timeout = 4000)
  public void test48()  throws Throwable  {
      ClassWriter classWriter0 = mock(ClassWriter.class, new ViolatedAssumptionAnswer());
      doReturn(0, 0, 0, 0, 0).when(classWriter0).newClass(anyString());
      doReturn(0, 0).when(classWriter0).newUTF8(anyString());
      String[] stringArray0 = new String[5];
      MethodWriter methodWriter0 = new MethodWriter(classWriter0, 2, "1AX_]d{,3", "1AX_]d{,3", "1AX_]d{,3", stringArray0, false, false);
      methodWriter0.visitMaxs(22, 1);
  }

  @Test(timeout = 4000)
  public void test49()  throws Throwable  {
      ClassWriter classWriter0 = new ClassWriter(16777217);
      String[] stringArray0 = new String[0];
      MethodWriter methodWriter0 = new MethodWriter(classWriter0, 2, "OI&=7{", "OI&=7{", "Label offset position has not been resolved yet", stringArray0, false, false);
      methodWriter0.visitMaxs(111, 16777217);
  }

  @Test(timeout = 4000)
  public void test50()  throws Throwable  {
      ClassWriter classWriter0 = mock(ClassWriter.class, new ViolatedAssumptionAnswer());
      doReturn(52, 52, 52, (-1659)).when(classWriter0).newClass(anyString());
      doReturn((-1659), 224).when(classWriter0).newUTF8(anyString());
      String[] stringArray0 = new String[4];
      MethodWriter methodWriter0 = new MethodWriter(classWriter0, 26, "5)z;2 _", "5)z;2 _", "5)z;2 _", stringArray0, true, false);
      // Undeclared exception!
      try { 
        methodWriter0.visitVarInsn((-1659), 1649);
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // -1659
         //
         verifyException("org.mockito.asm.MethodWriter", e);
      }
  }

  @Test(timeout = 4000)
  public void test51()  throws Throwable  {
      ClassWriter classWriter0 = new ClassWriter(1);
      MethodWriter methodWriter0 = new MethodWriter(classWriter0, 1, "C$i|MN", "5)z;*2 _", "{~vG6C|],E=WY;G~=", (String[]) null, true, false);
      methodWriter0.visitVarInsn(2, 1);
      String[] stringArray0 = new String[0];
      MethodWriter methodWriter1 = null;
      try {
        methodWriter1 = new MethodWriter(classWriter0, 2, "C$i|MN", "C$i|MN", "C$i|MN", stringArray0, true, true);
        fail("Expecting exception: StringIndexOutOfBoundsException");
      
      } catch(StringIndexOutOfBoundsException e) {
      }
  }

  @Test(timeout = 4000)
  public void test52()  throws Throwable  {
      ClassWriter classWriter0 = new ClassWriter(3349);
      String[] stringArray0 = new String[0];
      MethodWriter methodWriter0 = new MethodWriter(classWriter0, (-973), "*V46", "*V46", "UsRiV#xt*9]@z^%bT", stringArray0, false, false);
      methodWriter0.visitInsn(2335);
  }

  @Test(timeout = 4000)
  public void test53()  throws Throwable  {
      ClassWriter classWriter0 = new ClassWriter(16777217);
      String[] stringArray0 = new String[0];
      MethodWriter methodWriter0 = new MethodWriter(classWriter0, 2, "O0I&!=7{", "O0I&!=7{", "Label offset position has not been resolved yet", stringArray0, false, false);
      methodWriter0.visitFieldInsn(2, "O0I&!=7{", "O0I&!=7{", "Label offset position has not been resolved yet");
  }

  @Test(timeout = 4000)
  public void test54()  throws Throwable  {
      ClassWriter classWriter0 = new ClassWriter(1);
      MethodWriter methodWriter0 = new MethodWriter(classWriter0, 1, "C$i|MN", "5)z;*2 _", "Code", (String[]) null, true, false);
      MethodWriter methodWriter1 = new MethodWriter(classWriter0, (-4297), "*q", "Class not found", "C$i|MN", (String[]) null, false, false);
      methodWriter1.visitMethodInsn((-4297), "Code", "Class not found", "Class not found");
      methodWriter0.visitMultiANewArrayInsn("*q", 2);
      assertFalse(methodWriter0.equals((Object)methodWriter1));
  }

  @Test(timeout = 4000)
  public void test55()  throws Throwable  {
      ClassWriter classWriter0 = new ClassWriter(16777217);
      String[] stringArray0 = new String[0];
      MethodWriter methodWriter0 = new MethodWriter(classWriter0, 2, "O0I&!=7{", "O0I&!=7{", "O0I&!=7{", stringArray0, false, false);
      ByteVector byteVector0 = new ByteVector();
      byteVector0.putLong(2);
      String[] stringArray1 = new String[4];
      MethodWriter methodWriter1 = null;
      try {
        methodWriter1 = new MethodWriter(classWriter0, 2357, "O0I&!=7{", "", ">?F<42I3d@6R/}Q8edO", stringArray1, false, false);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
      }
  }

  @Test(timeout = 4000)
  public void test56()  throws Throwable  {
      ClassWriter classWriter0 = new ClassWriter(1);
      MethodWriter methodWriter0 = new MethodWriter(classWriter0, 1, "C$i|MN", "5)z;*2 _", "Code", (String[]) null, true, false);
      MethodWriter methodWriter1 = new MethodWriter(classWriter0, (-4297), "5)z;*2 _", "Class not found", "C$i|MN", (String[]) null, false, false);
      ByteVector byteVector0 = new ByteVector(1);
      ByteVector byteVector1 = byteVector0.putLong(1);
      assertSame(byteVector0, byteVector1);
  }

  @Test(timeout = 4000)
  public void test57()  throws Throwable  {
      ClassWriter classWriter0 = new ClassWriter(1);
      MethodWriter methodWriter0 = new MethodWriter(classWriter0, 1, "C$i|MN", "5)z;*2 _", "Code", (String[]) null, true, false);
      Label label0 = new Label();
      methodWriter0.visitJumpInsn(2, label0);
      MethodWriter methodWriter1 = new MethodWriter(classWriter0, (-4297), "*q", "Class not found", "C$i|MN", (String[]) null, false, false);
      methodWriter0.visitMaxs(115, 47);
      assertFalse(methodWriter0.equals((Object)methodWriter1));
  }

  @Test(timeout = 4000)
  public void test58()  throws Throwable  {
      ClassWriter classWriter0 = new ClassWriter((-316));
      String string0 = "cp~}mRS\\u";
      String[] stringArray0 = new String[5];
      stringArray0[0] = string0;
      stringArray0[1] = "5-3jV*']";
      stringArray0[2] = "5-3jV*']";
      stringArray0[3] = string0;
      stringArray0[4] = "5-3jV*']";
      MethodVisitor methodVisitor0 = classWriter0.visitMethod((-316), string0, "5-3jV*']", "5-3jV*']", stringArray0);
      methodVisitor0.visitMethodInsn(1, "[s/;|[.XB'e", "Exceptions", "[s/;|[.XB'e");
  }

  @Test(timeout = 4000)
  public void test59()  throws Throwable  {
      ClassWriter classWriter0 = mock(ClassWriter.class, new ViolatedAssumptionAnswer());
      doReturn(0, 0, 0, 0, 0).when(classWriter0).newUTF8(anyString());
      MethodWriter methodWriter0 = new MethodWriter(classWriter0, 64, "D@", "D@", ",+<s'%/'x3oS", (String[]) null, false, false);
      Label label0 = mock(Label.class, new ViolatedAssumptionAnswer());
      methodWriter0.visitLocalVariable(".~3>|tlbFzf", ",+<s'%/'x3oS", ".~3>|tlbFzf", label0, label0, 108);
  }

  @Test(timeout = 4000)
  public void test60()  throws Throwable  {
      ClassWriter classWriter0 = new ClassWriter(16777217);
      String[] stringArray0 = new String[0];
      ByteVector byteVector0 = new ByteVector(1);
      byteVector0.putInt(2);
      MethodWriter methodWriter0 = null;
      try {
        methodWriter0 = new MethodWriter(classWriter0, (-1870), "lyL}yP5oe9<", "lyL}yP5oe9<", "KfBdIh$FpEsA", stringArray0, false, true);
        fail("Expecting exception: StringIndexOutOfBoundsException");
      
      } catch(StringIndexOutOfBoundsException e) {
      }
  }

  @Test(timeout = 4000)
  public void test61()  throws Throwable  {
      ClassWriter classWriter0 = new ClassWriter(1);
      MethodWriter methodWriter0 = new MethodWriter(classWriter0, 1, "C$i|MN", "5)z;*2 _", "{~vG6C|],E=WY;G~=", (String[]) null, true, false);
      methodWriter0.visitFieldInsn(6, "RuntimeVisibleAnnotations", "{~vG6C|],E=WY;G~=", "Dr@'yCTp;bNCx>T");
  }

  @Test(timeout = 4000)
  public void test62()  throws Throwable  {
      ClassWriter classWriter0 = new ClassWriter(1);
      String[] stringArray0 = new String[3];
      stringArray0[0] = "org.mockito.asm.ClassReader";
      stringArray0[1] = "Code";
      stringArray0[2] = "org.mockito.asm.ClassReader";
      MethodWriter methodWriter0 = new MethodWriter(classWriter0, 350, "Code", "5)z;*2 _", "Code", stringArray0, false, true);
      methodWriter0.visitMaxs(1564, 1);
      MethodVisitor methodVisitor0 = classWriter0.visitMethod(2, ".ATS6hqC^ar[J_$R&", "5)z;*2 _", "org.mockito.asm.ClassReader", stringArray0);
      assertFalse(methodVisitor0.equals((Object)methodWriter0));
  }

  @Test(timeout = 4000)
  public void test63()  throws Throwable  {
      ClassWriter classWriter0 = new ClassWriter(68);
      String[] stringArray0 = new String[1];
      stringArray0[0] = "LocalVariableTable";
      MethodWriter methodWriter0 = new MethodWriter(classWriter0, 68, "p;wtPEE", "/W", "LocalVariableTable", stringArray0, false, false);
      methodWriter0.visitIincInsn(2, 68);
  }

  @Test(timeout = 4000)
  public void test64()  throws Throwable  {
      ClassWriter classWriter0 = new ClassWriter(1);
      MethodWriter methodWriter0 = new MethodWriter(classWriter0, 1, "C$i|MN", "5)z;2 _", "Code", (String[]) null, true, true);
      Label label0 = new Label();
      methodWriter0.visitLineNumber(2, label0);
      methodWriter0.visitIntInsn(2, 1);
      classWriter0.toByteArray();
      String[] stringArray0 = new String[7];
      MethodWriter methodWriter1 = null;
      try {
        methodWriter1 = new MethodWriter(classWriter0, 1765, "s", "java/lang/Class", "5)z;2 _", stringArray0, true, true);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
      }
  }

  @Test(timeout = 4000)
  public void test65()  throws Throwable  {
      ClassWriter classWriter0 = new ClassWriter(16777217);
      String[] stringArray0 = new String[0];
      MethodWriter methodWriter0 = new MethodWriter(classWriter0, 2, "O0I&!=7{", "O0I&!=7{", "Label offset position has not been resolved yet", stringArray0, false, false);
      methodWriter0.visitVarInsn(1, 2047);
      Label label0 = new Label();
      methodWriter0.visitLineNumber(2, label0);
      ByteVector byteVector0 = new ByteVector(1);
      methodWriter0.put(byteVector0);
  }

  @Test(timeout = 4000)
  public void test66()  throws Throwable  {
      ClassWriter classWriter0 = new ClassWriter(1);
      String[] stringArray0 = new String[3];
      stringArray0[0] = "org.mockito.asm.ClassReader";
      stringArray0[1] = "Code";
      stringArray0[2] = "org.mockito.asm.ClassReader";
      MethodWriter methodWriter0 = new MethodWriter(classWriter0, 350, "Code", "5)z;*2 _", "Code", stringArray0, false, true);
      methodWriter0.visitAnnotation("A@E#", false);
      byte[] byteArray0 = classWriter0.toByteArray();
      assertEquals(182, byteArray0.length);
  }

  @Test(timeout = 4000)
  public void test67()  throws Throwable  {
      ClassWriter classWriter0 = new ClassWriter(121);
      String[] stringArray0 = new String[0];
      MethodWriter methodWriter0 = new MethodWriter(classWriter0, 4567, "O0I&!=7{", "Label offset position has not been resolved yet", "YdJ", stringArray0, false, false);
      methodWriter0.visitAnnotation("*N8{5i&dItMt@Et0sfb", false);
      classWriter0.toByteArray();
      MethodWriter methodWriter1 = null;
      try {
        methodWriter1 = new MethodWriter(classWriter0, 4567, ".RF@i/4vV6", "D", "YdJ", stringArray0, true, true);
        fail("Expecting exception: StringIndexOutOfBoundsException");
      
      } catch(StringIndexOutOfBoundsException e) {
      }
  }

  @Test(timeout = 4000)
  public void test68()  throws Throwable  {
      ClassWriter classWriter0 = mock(ClassWriter.class, new ViolatedAssumptionAnswer());
      doReturn(52, 52, 52, (-1659)).when(classWriter0).newClass(anyString());
      doReturn((-1659), 224).when(classWriter0).newUTF8(anyString());
      String[] stringArray0 = new String[4];
      MethodWriter methodWriter0 = new MethodWriter(classWriter0, 26, "5)z;2 _", "5)z;2 _", "5)z;2 _", stringArray0, true, false);
      methodWriter0.visitIincInsn(3255, 1395);
  }

  @Test(timeout = 4000)
  public void test69()  throws Throwable  {
      ClassWriter classWriter0 = mock(ClassWriter.class, new ViolatedAssumptionAnswer());
      doReturn(0, 0, 0).when(classWriter0).newClass(anyString());
      doReturn((-27), 26).when(classWriter0).newUTF8(anyString());
      String[] stringArray0 = new String[3];
      MethodWriter methodWriter0 = new MethodWriter(classWriter0, (-38), "5)z;2 _", "5)z;2 _", "5)z;2 _", stringArray0, true, false);
      methodWriter0.visitIincInsn((-38), 50);
  }

  @Test(timeout = 4000)
  public void test70()  throws Throwable  {
      ClassWriter classWriter0 = new ClassWriter(1);
      String[] stringArray0 = new String[3];
      stringArray0[0] = "org.mockito.asm.ClassReader";
      stringArray0[1] = "Code";
      stringArray0[2] = "org.mockito.asm.ClassReader";
      MethodWriter methodWriter0 = new MethodWriter(classWriter0, 350, "Code", "5)z;*2 _", "Code", stringArray0, false, true);
      methodWriter0.visitVarInsn(119, 168);
      MethodWriter methodWriter1 = new MethodWriter(classWriter0, 2, "Z:Rdv(ikZpae_W", "Code", (String) null, stringArray0, false, false);
      byte[] byteArray0 = classWriter0.toByteArray();
      assertEquals(192, byteArray0.length);
  }

  @Test(timeout = 4000)
  public void test71()  throws Throwable  {
      ClassWriter classWriter0 = new ClassWriter(1);
      MethodWriter methodWriter0 = new MethodWriter(classWriter0, 7, "RuntimeInvisibleAnnotations", "5)z;2 _", "RuntimeInvisibleAnnotations", (String[]) null, true, true);
      methodWriter0.visitMethodInsn(2816, "C$i|MN", "i9yj", "java/lang/Class");
      classWriter0.toByteArray();
      String[] stringArray0 = new String[7];
      stringArray0[0] = "Code";
      stringArray0[1] = "PYVc~H";
      stringArray0[2] = "5)z;2 _";
      stringArray0[3] = "s";
      MethodWriter methodWriter1 = null;
      try {
        methodWriter1 = new MethodWriter(classWriter0, 1765, "s", "java/lang/Class", "5)z;2 _", stringArray0, true, true);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
      }
  }

  @Test(timeout = 4000)
  public void test72()  throws Throwable  {
      ClassWriter classWriter0 = new ClassWriter(1);
      MethodWriter methodWriter0 = new MethodWriter(classWriter0, 1, "org.mockito.asm.Label", "5)z;2 _", "Code", (String[]) null, true, false);
      methodWriter0.visitIntInsn(17, 2);
  }

  @Test(timeout = 4000)
  public void test73()  throws Throwable  {
      ClassWriter classWriter0 = mock(ClassWriter.class, new ViolatedAssumptionAnswer());
      doReturn(220, 220, 2335, (-1534)).when(classWriter0).newClass(anyString());
      doReturn(2335, (-1534), 0, 0, 0).when(classWriter0).newUTF8(anyString());
      String[] stringArray0 = new String[4];
      MethodWriter methodWriter0 = new MethodWriter(classWriter0, (-38), "5)z;2 _", "5)z;2 _", "5)z;2 _", stringArray0, false, true);
      methodWriter0.visitAnnotation("JSR/RET are not supported with computeFrames option", true);
      ByteVector byteVector0 = new ByteVector();
      methodWriter0.put(byteVector0);
  }

  @Test(timeout = 4000)
  public void test74()  throws Throwable  {
      ClassWriter classWriter0 = new ClassWriter(1);
      MethodWriter methodWriter0 = new MethodWriter(classWriter0, (-231), "5)z;*2 _", "5)z;*2 _", "5)z;*2 _", (String[]) null, false, false);
      classWriter0.toByteArray();
      MethodWriter methodWriter1 = null;
      try {
        methodWriter1 = new MethodWriter(classWriter0, 1, "5)z;*2 _", "<wwf'$9TdF<-=5+,#I:", "Synthetic", (String[]) null, false, true);
        fail("Expecting exception: StringIndexOutOfBoundsException");
      
      } catch(StringIndexOutOfBoundsException e) {
      }
  }

  @Test(timeout = 4000)
  public void test75()  throws Throwable  {
      ClassWriter classWriter0 = mock(ClassWriter.class, new ViolatedAssumptionAnswer());
      doReturn(2069, 2069, 54, 54).when(classWriter0).newClass(anyString());
      doReturn(2069, 54, 0, 0, 0).when(classWriter0).newUTF8(anyString());
      Label label0 = new Label();
      String[] stringArray0 = new String[4];
      MethodWriter methodWriter0 = new MethodWriter(classWriter0, (-38), "5)z;2 _", "5)z;2 _", "5)z;2 _", stringArray0, false, true);
      methodWriter0.visitLocalVariable("Y\"4BTj8I%", "Deprecated", "B*>^4G&(?<xz6", label0, label0, (-4043));
  }

  @Test(timeout = 4000)
  public void test76()  throws Throwable  {
      ClassWriter classWriter0 = new ClassWriter(44);
      String[] stringArray0 = new String[1];
      stringArray0[0] = "O0I&!=7{";
      MethodWriter methodWriter0 = new MethodWriter(classWriter0, 2, "O0I&!=7{", "O0I&!=7{", "O0I&!=7{", stringArray0, false, false);
      ByteVector byteVector0 = classWriter0.pool;
      ByteVector byteVector1 = byteVector0.putInt(1);
      methodWriter0.put(byteVector1);
      assertSame(byteVector0, byteVector1);
  }

  @Test(timeout = 4000)
  public void test77()  throws Throwable  {
      ClassWriter classWriter0 = new ClassWriter(1);
      MethodWriter methodWriter0 = new MethodWriter(classWriter0, 1, "C$i|MN", "5)z;2 _", "o{", (String[]) null, false, true);
      methodWriter0.visitIincInsn(2, 1);
      MethodWriter methodWriter1 = new MethodWriter(classWriter0, 7, "RuntimeInvisibleAnnotations", "5)z;2 _", "RuntimeInvisibleAnnotations", (String[]) null, false, false);
      assertFalse(methodWriter1.equals((Object)methodWriter0));
  }

  @Test(timeout = 4000)
  public void test78()  throws Throwable  {
      ClassWriter classWriter0 = new ClassWriter(16777217);
      String[] stringArray0 = new String[0];
      MethodWriter methodWriter0 = new MethodWriter(classWriter0, 2, "O0I&7Q0{", "O0I&7Q0{", "Label offset position has not been resolved yet", stringArray0, false, false);
      ByteVector byteVector0 = new ByteVector(1);
      ByteVector byteVector1 = byteVector0.putInt(16777217);
      ByteVector byteVector2 = byteVector1.putByte(18);
      assertSame(byteVector0, byteVector2);
  }

  @Test(timeout = 4000)
  public void test79()  throws Throwable  {
      ClassWriter classWriter0 = new ClassWriter(16777217);
      classWriter0.newMethodItem("L", "RuntimeInvisibleParameterAnnotations", "C$i|MN", true);
      MethodWriter methodWriter0 = null;
      try {
        methodWriter0 = new MethodWriter(classWriter0, 177, "o{", ",EOgtG", "RuntimeInvisibleParameterAnnotations", (String[]) null, true, true);
        fail("Expecting exception: StringIndexOutOfBoundsException");
      
      } catch(StringIndexOutOfBoundsException e) {
      }
  }

  @Test(timeout = 4000)
  public void test80()  throws Throwable  {
      ClassWriter classWriter0 = new ClassWriter(121);
      String[] stringArray0 = new String[0];
      MethodWriter methodWriter0 = new MethodWriter(classWriter0, 4567, "O0I&!=7{", "Label offset position has not been resolved yet", "YdJ", stringArray0, false, false);
      Object[] objectArray0 = new Object[1];
      methodWriter0.visitFrame(1, (-210), stringArray0, 2, objectArray0);
      methodWriter0.visitMultiANewArrayInsn("Deprecated", 2807);
      classWriter0.toByteArray();
      MethodWriter methodWriter1 = null;
      try {
        methodWriter1 = new MethodWriter(classWriter0, 4567, ".RF@i/4vV6", "D", "YdJ", stringArray0, true, true);
        fail("Expecting exception: StringIndexOutOfBoundsException");
      
      } catch(StringIndexOutOfBoundsException e) {
      }
  }
}
