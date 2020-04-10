/*

 * Tue Mar 03 14:39:41 GMT 2020
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
import org.mockito.asm.ClassReader;
import org.mockito.asm.ClassVisitor;
import org.mockito.asm.ClassWriter;
import org.mockito.asm.Label;
import org.mockito.asm.MethodVisitor;
import org.mockito.asm.MethodWriter;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = false, useJEE = true) 
public class MethodWriter_ESTest extends MethodWriter_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test00()  throws Throwable  {
      ClassWriter classWriter0 = new ClassWriter((-670));
      MethodWriter methodWriter0 = new MethodWriter(classWriter0, (-2896), "KpIx", "/[})_5ha/-fO}G7", "5,-@:", (String[]) null, true, true);
      methodWriter0.visitIincInsn(2937, (-670));
      MethodWriter methodWriter1 = new MethodWriter(classWriter0, 2478, "", "KpIx", "org.mockqto.asm.Label", (String[]) null, false, false);
      assertFalse(methodWriter1.equals((Object)methodWriter0));
  }

  @Test(timeout = 4000)
  public void test01()  throws Throwable  {
      ClassWriter classWriter0 = new ClassWriter(32767);
      String[] stringArray0 = new String[2];
      stringArray0[0] = "<76$il";
      stringArray0[1] = "<76$il";
      MethodWriter methodWriter0 = new MethodWriter(classWriter0, 2, "HLc%z0b`#", "HLc%z0b`#", "<76$il", stringArray0, false, false);
      ByteVector byteVector0 = new ByteVector(1199);
      ByteVector byteVector1 = byteVector0.putLong((-1L));
      assertSame(byteVector0, byteVector1);
  }

  @Test(timeout = 4000)
  public void test02()  throws Throwable  {
      ByteVector byteVector0 = new ByteVector(91);
      byteVector0.putLong(2023L);
      ClassWriter classWriter0 = new ClassWriter((-3535));
      String[] stringArray0 = new String[0];
      MethodWriter methodWriter0 = new MethodWriter(classWriter0, (-1670), "3aCl9F\"gVj", "RuntimeVisibleAnnotations", "", stringArray0, false, false);
  }

  @Test(timeout = 4000)
  public void test03()  throws Throwable  {
      String[] stringArray0 = new String[0];
      ClassWriter classWriter0 = new ClassWriter(2);
      MethodWriter methodWriter0 = new MethodWriter(classWriter0, 2, "getClassName", "^", "getClassName", stringArray0, false, false);
      ByteVector byteVector0 = new ByteVector(2);
      ByteVector byteVector1 = byteVector0.putLong((-1L));
      assertSame(byteVector0, byteVector1);
  }

  @Test(timeout = 4000)
  public void test04()  throws Throwable  {
      ClassReader classReader0 = new ClassReader("org.mockito.asm.Type");
      ClassWriter classWriter0 = new ClassWriter(8);
      classReader0.accept((ClassVisitor) classWriter0, (-5846));
      String[] stringArray0 = new String[4];
      stringArray0[0] = "Class not found";
      stringArray0[1] = "org.mockito.asm.Type";
      stringArray0[2] = "StackMap";
      stringArray0[3] = "StackMap";
      MethodWriter methodWriter0 = null;
      try {
        methodWriter0 = new MethodWriter(classWriter0, 2070, "org.mockito.asm.Type", "org.mockito.asm.MethodWriter", "StackMap", stringArray0, true, true);
        fail("Expecting exception: StringIndexOutOfBoundsException");
      
      } catch(StringIndexOutOfBoundsException e) {
      }
  }

  @Test(timeout = 4000)
  public void test05()  throws Throwable  {
      int[] intArray0 = new int[4];
      Label label0 = mock(Label.class, new ViolatedAssumptionAnswer());
      MethodWriter.getNewOffset(intArray0, intArray0, label0);
      MethodWriter.getNewOffset((int[]) null, intArray0, label0);
      assertArrayEquals(new int[] {0, 0, 0, 0}, intArray0);
  }

  @Test(timeout = 4000)
  public void test06()  throws Throwable  {
      String[] stringArray0 = new String[0];
      ClassWriter classWriter0 = new ClassWriter(2);
      MethodWriter methodWriter0 = new MethodWriter(classWriter0, 2, "getClassName", "^", "getClassName", stringArray0, false, false);
      Object[] objectArray0 = new Object[8];
      methodWriter0.visitFrame((-1349), 2, stringArray0, 1, objectArray0);
      methodWriter0.visitFrame(16777220, 16777220, objectArray0, 1, objectArray0);
      assertEquals(8, objectArray0.length);
  }

  @Test(timeout = 4000)
  public void test07()  throws Throwable  {
      String[] stringArray0 = new String[0];
      ClassWriter classWriter0 = new ClassWriter(2822);
      MethodWriter methodWriter0 = new MethodWriter(classWriter0, 1, "t", "t", "t", stringArray0, false, false);
      methodWriter0.visitFrame(2, 15, stringArray0, 1, stringArray0);
      assertEquals(0, stringArray0.length);
  }

  @Test(timeout = 4000)
  public void test08()  throws Throwable  {
      ClassWriter classWriter0 = new ClassWriter(267386880);
      String[] stringArray0 = new String[0];
      MethodWriter methodWriter0 = new MethodWriter(classWriter0, 267386880, "4)Q", ";Pk)T|]iQRgFobow9", "Label offset position has not been resolved yet", stringArray0, false, false);
      ByteVector byteVector0 = new ByteVector(1);
      ByteVector byteVector1 = byteVector0.put11(267386880, 1308);
      assertSame(byteVector0, byteVector1);
  }

  @Test(timeout = 4000)
  public void test09()  throws Throwable  {
      ClassWriter classWriter0 = new ClassWriter(267386880);
      String[] stringArray0 = new String[4];
      stringArray0[0] = ".class";
      stringArray0[1] = ".class";
      stringArray0[2] = "^";
      stringArray0[3] = ".class";
      MethodWriter methodWriter0 = new MethodWriter(classWriter0, 40, "^", ".class", ".class", stringArray0, false, false);
      ByteVector byteVector0 = new ByteVector();
      methodWriter0.visitFieldInsn(40, "Exceptions", "Exceptions", "Signature");
      methodWriter0.put(byteVector0);
  }

  @Test(timeout = 4000)
  public void test10()  throws Throwable  {
      int[] intArray0 = new int[4];
      intArray0[3] = 3829;
      Label label0 = mock(Label.class, new ViolatedAssumptionAnswer());
      MethodWriter.getNewOffset(intArray0, intArray0, label0);
      ClassWriter classWriter0 = new ClassWriter((-821));
      MethodWriter methodWriter0 = new MethodWriter(classWriter0, 33, "&^nW5{m6C", "&^nW5{m6C", "&^nW5{m6C", (String[]) null, false, false);
      MethodWriter methodWriter1 = new MethodWriter(classWriter0, 66, "&^nW5{m6C", "Exceptions", "rqSZR2Mv\"gzN,fm}o", (String[]) null, false, false);
      assertFalse(methodWriter1.equals((Object)methodWriter0));
  }

  @Test(timeout = 4000)
  public void test11()  throws Throwable  {
      ClassWriter classWriter0 = new ClassWriter(47);
      String[] stringArray0 = new String[0];
      MethodWriter methodWriter0 = new MethodWriter(classWriter0, 168, "JSR/RET are not supportedMwith computeFrames option", "JSR/RET are not supportedMwith computeFrames option", "org.mockito.asm.Label", stringArray0, false, false);
      methodWriter0.visitVarInsn(1, 47);
  }

  @Test(timeout = 4000)
  public void test12()  throws Throwable  {
      ClassWriter classWriter0 = mock(ClassWriter.class, new ViolatedAssumptionAnswer());
      doReturn(15, (-918), (-1333), 15, (-918)).when(classWriter0).newClass(anyString());
      doReturn((-1333), (-1333)).when(classWriter0).newUTF8(anyString());
      String[] stringArray0 = new String[5];
      MethodWriter methodWriter0 = new MethodWriter(classWriter0, (-1333), "Synthetic", "Synthetic", "Synthetic", stringArray0, false, false);
      // Undeclared exception!
      try { 
        methodWriter0.visitFrame(1, 21, stringArray0, 90, stringArray0);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.mockito.asm.MethodWriter", e);
      }
  }

  @Test(timeout = 4000)
  public void test13()  throws Throwable  {
      ClassWriter classWriter0 = new ClassWriter((-3144));
      String[] stringArray0 = new String[8];
      stringArray0[0] = "";
      stringArray0[1] = "Synthetic";
      stringArray0[2] = "byte";
      stringArray0[3] = "byte";
      stringArray0[4] = "Synthetic";
      stringArray0[5] = "";
      stringArray0[6] = "Synthetic";
      stringArray0[7] = "byte";
      MethodWriter methodWriter0 = new MethodWriter(classWriter0, 1, "byte", "byte", "byte", stringArray0, false, false);
      methodWriter0.visitFrame(1, (-413), stringArray0, 285212676, stringArray0);
      assertEquals(8, stringArray0.length);
  }

  @Test(timeout = 4000)
  public void test14()  throws Throwable  {
      ClassReader classReader0 = new ClassReader("org.mockito.asm.Type");
      ClassWriter classWriter0 = new ClassWriter(classReader0, 1);
      classReader0.accept((ClassVisitor) classWriter0, 3143);
      MethodWriter methodWriter0 = classWriter0.firstMethod;
      methodWriter0.visitVarInsn(1, 3672);
  }

  @Test(timeout = 4000)
  public void test15()  throws Throwable  {
      ClassWriter classWriter0 = new ClassWriter(32767);
      String[] stringArray0 = new String[2];
      stringArray0[0] = "<76$il";
      stringArray0[1] = "<76$il";
      MethodWriter methodWriter0 = new MethodWriter(classWriter0, 2, "HLc%z0b`#", "HLc%z0b`#", "<76$il", stringArray0, false, false);
      ByteVector byteVector0 = new ByteVector(1);
      methodWriter0.put(byteVector0);
      MethodWriter methodWriter1 = null;
      try {
        methodWriter1 = new MethodWriter(classWriter0, (-845), "HLc%z0b`#", "Y|ns", "y5L", stringArray0, false, true);
        fail("Expecting exception: StringIndexOutOfBoundsException");
      
      } catch(StringIndexOutOfBoundsException e) {
      }
  }

  @Test(timeout = 4000)
  public void test16()  throws Throwable  {
      ClassWriter classWriter0 = new ClassWriter((-649));
      MethodWriter methodWriter0 = new MethodWriter(classWriter0, (-2888), "G\"e{xQEq3y]WXK", "/[})_5ha/-fO}G7", "5,-@:", (String[]) null, true, true);
      ByteVector byteVector0 = new ByteVector();
      methodWriter0.visitAnnotation("5,-@:", true);
      methodWriter0.put(byteVector0);
      MethodWriter methodWriter1 = new MethodWriter(classWriter0, 64, "RuntimeInvisibleParameterAnnotations", "<76$il", "StackMap", (String[]) null, false, false);
      assertFalse(methodWriter1.equals((Object)methodWriter0));
  }

  @Test(timeout = 4000)
  public void test17()  throws Throwable  {
      ClassWriter classWriter0 = new ClassWriter((-1333));
      MethodWriter methodWriter0 = new MethodWriter(classWriter0, (-32768), "org.mockito.asm.Label", "5,-@:", "E|2R[T8TIWT P,", (String[]) null, false, false);
      methodWriter0.getSize();
      MethodWriter methodWriter1 = new MethodWriter(classWriter0, (-1609), "1?hYMCc6x fL:&L", "/4{hm1|)", "P9v-0@", (String[]) null, false, false);
      assertFalse(methodWriter1.equals((Object)methodWriter0));
  }

  @Test(timeout = 4000)
  public void test18()  throws Throwable  {
      ClassWriter classWriter0 = new ClassWriter((-649));
      MethodWriter methodWriter0 = new MethodWriter(classWriter0, (-2888), "G\"e{xQEq3y]WXK", "/[})_5ha/-fO}G7", "5,-@:", (String[]) null, true, true);
      int int0 = methodWriter0.getSize();
      assertEquals(28, int0);
  }

  @Test(timeout = 4000)
  public void test19()  throws Throwable  {
      ClassWriter classWriter0 = new ClassWriter(267386880);
      String[] stringArray0 = new String[0];
      MethodWriter methodWriter0 = null;
      try {
        methodWriter0 = new MethodWriter(classWriter0, 4, "Label offset position has not been resolved yet", "9`^uLktp|ZkvgN4", ";Pk)T|]iQRgFobow9", stringArray0, true, true);
        fail("Expecting exception: StringIndexOutOfBoundsException");
      
      } catch(StringIndexOutOfBoundsException e) {
      }
  }

  @Test(timeout = 4000)
  public void test20()  throws Throwable  {
      ClassWriter classWriter0 = mock(ClassWriter.class, new ViolatedAssumptionAnswer());
      doReturn(2226, 2226).when(classWriter0).newUTF8(anyString());
      String[] stringArray0 = new String[0];
      MethodWriter methodWriter0 = new MethodWriter(classWriter0, (-1), "", "", "", stringArray0, false, false);
      int[] intArray0 = new int[1];
      intArray0[0] = 2226;
      int int0 = MethodWriter.getNewOffset(intArray0, intArray0, 2, 2822);
      assertEquals(5046, int0);
  }

  @Test(timeout = 4000)
  public void test21()  throws Throwable  {
      ClassWriter classWriter0 = new ClassWriter((-649));
      MethodWriter methodWriter0 = new MethodWriter(classWriter0, (-2888), "5,-@:", "/[})_5ha/-fO}G7", "5,-@:", (String[]) null, true, true);
      Label label0 = new Label();
      ByteVector byteVector0 = new ByteVector();
      methodWriter0.visitLineNumber((-649), label0);
      ClassWriter classWriter1 = new ClassWriter((-2888));
      MethodVisitor methodVisitor0 = classWriter1.visitMethod(2, "5,-@:", "5,-@:", "XF-]0n])#|e", (String[]) null);
      methodWriter0.visitMultiANewArrayInsn("TlJ2z@V$Vvlt_gEm*", (-649));
      methodWriter0.put(byteVector0);
      assertFalse(methodWriter0.equals((Object)methodVisitor0));
  }

  @Test(timeout = 4000)
  public void test22()  throws Throwable  {
      ClassWriter classWriter0 = mock(ClassWriter.class, new ViolatedAssumptionAnswer());
      doReturn((-713)).when(classWriter0).newClass(anyString());
      doReturn(512, 50, (-1369), (-817), 1382).when(classWriter0).newUTF8(anyString());
      String[] stringArray0 = new String[1];
      MethodWriter methodWriter0 = new MethodWriter(classWriter0, 53, "+M-z5Pb", "<init>", "<init>", stringArray0, false, false);
      methodWriter0.visitAnnotationDefault();
      ByteVector byteVector0 = new ByteVector(2284);
      methodWriter0.put(byteVector0);
  }

  @Test(timeout = 4000)
  public void test23()  throws Throwable  {
      ClassWriter classWriter0 = mock(ClassWriter.class, new ViolatedAssumptionAnswer());
      doReturn(1175, (-3535), 1175).when(classWriter0).newClass(anyString());
      doReturn(2226, 2226, 2226, 2226, 1175).when(classWriter0).newUTF8(anyString());
      String[] stringArray0 = new String[3];
      MethodWriter methodWriter0 = new MethodWriter(classWriter0, 87, "", "RuntimeVisibleAnnotations", "", stringArray0, false, false);
      int int0 = methodWriter0.getSize();
      assertEquals(30, int0);
  }

  @Test(timeout = 4000)
  public void test24()  throws Throwable  {
      String[] stringArray0 = new String[0];
      ClassWriter classWriter0 = new ClassWriter(2);
      MethodWriter methodWriter0 = new MethodWriter(classWriter0, 2, "getClassName", "^", "getClassName", stringArray0, false, false);
      ByteVector byteVector0 = new ByteVector();
      methodWriter0.visitAnnotationDefault();
      methodWriter0.put(byteVector0);
  }

  @Test(timeout = 4000)
  public void test25()  throws Throwable  {
      ClassWriter classWriter0 = new ClassWriter(267386880);
      String[] stringArray0 = new String[0];
      MethodWriter methodWriter0 = new MethodWriter(classWriter0, 267386880, "4)Q", ";Pk)T|]iQRgFobow9", "Label offset position has not been resolved yet", stringArray0, true, false);
      // Undeclared exception!
      try { 
        methodWriter0.visitInsn(669);
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // 669
         //
         verifyException("org.mockito.asm.MethodWriter", e);
      }
  }

  @Test(timeout = 4000)
  public void test26()  throws Throwable  {
      ClassWriter classWriter0 = new ClassWriter(267386880);
      String[] stringArray0 = new String[0];
      MethodWriter methodWriter0 = new MethodWriter(classWriter0, 267386880, "4)Q", "4)Q", "Label offset position has not been resolved yet", stringArray0, false, false);
      methodWriter0.visitInsn(267386880);
  }

  @Test(timeout = 4000)
  public void test27()  throws Throwable  {
      ClassReader classReader0 = new ClassReader("org.mockito.asm.Type");
      ClassWriter classWriter0 = new ClassWriter(classReader0, 1);
      int[] intArray0 = new int[2];
      MethodWriter.getNewOffset(intArray0, intArray0, 143, (-32768));
      String[] stringArray0 = new String[0];
      MethodWriter methodWriter0 = null;
      try {
        methodWriter0 = new MethodWriter(classWriter0, 3097, "org.mockito.asm.Type", "org.mockito.asm.Type", "org.mockito.asm.Type", stringArray0, true, true);
        fail("Expecting exception: StringIndexOutOfBoundsException");
      
      } catch(StringIndexOutOfBoundsException e) {
      }
  }

  @Test(timeout = 4000)
  public void test28()  throws Throwable  {
      int[] intArray0 = new int[6];
      MethodWriter.getNewOffset(intArray0, intArray0, 990, (-1360));
      ClassWriter classWriter0 = mock(ClassWriter.class, new ViolatedAssumptionAnswer());
      doReturn((-713)).when(classWriter0).newClass(anyString());
      doReturn(512, 50).when(classWriter0).newUTF8(anyString());
      String[] stringArray0 = new String[1];
      MethodWriter methodWriter0 = new MethodWriter(classWriter0, 53, "+M-z5Pb", "<init>", "<init>", stringArray0, false, false);
  }

  @Test(timeout = 4000)
  public void test29()  throws Throwable  {
      ClassReader classReader0 = new ClassReader("org.mockito.asm.Type");
      ClassWriter classWriter0 = new ClassWriter(2);
      String[] stringArray0 = new String[7];
      stringArray0[0] = "org.mockito.asm.Type";
      stringArray0[1] = "org.mockito.asm.Type";
      stringArray0[2] = "=8]rrUM(";
      stringArray0[3] = "org.mockito.asm.Type";
      stringArray0[4] = "org.mockito.asm.Type";
      classReader0.accept((ClassVisitor) classWriter0, 2);
      stringArray0[5] = ")Y$%ZTho%Zbf";
      stringArray0[6] = "L<LocalVariableTable";
      MethodWriter methodWriter0 = new MethodWriter(classWriter0, 4, "L<LocalVariableTable", ")Y$%ZTho%Zbf", ")Y$%ZTho%Zbf", stringArray0, false, false);
  }

  @Test(timeout = 4000)
  public void test30()  throws Throwable  {
      ClassWriter classWriter0 = new ClassWriter((-649));
      MethodWriter methodWriter0 = new MethodWriter(classWriter0, (-2888), "5,-@:", "/[})_5ha/-fO}G7", "5,-@:", (String[]) null, true, true);
      ByteVector byteVector0 = new ByteVector();
      MethodWriter methodWriter1 = classWriter0.firstMethod;
      methodWriter1.classReaderOffset = 1;
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
  public void test31()  throws Throwable  {
      String[] stringArray0 = new String[0];
      ClassWriter classWriter0 = new ClassWriter(2);
      MethodWriter methodWriter0 = new MethodWriter(classWriter0, 2, "getClassName", "^", "getClassName", stringArray0, false, false);
      methodWriter0.visitMaxs(2, (-852));
  }

  @Test(timeout = 4000)
  public void test32()  throws Throwable  {
      ClassReader classReader0 = new ClassReader("org.mockito.asm.Type");
      ClassWriter classWriter0 = new ClassWriter(8);
      classReader0.accept((ClassVisitor) classWriter0, (-5846));
      MethodWriter methodWriter0 = classWriter0.firstMethod;
      int int0 = methodWriter0.getSize();
      assertEquals(35, int0);
  }

  @Test(timeout = 4000)
  public void test33()  throws Throwable  {
      String[] stringArray0 = new String[0];
      ClassWriter classWriter0 = new ClassWriter(121);
      MethodWriter methodWriter0 = new MethodWriter(classWriter0, 809, "+|d[3ws@n[GG8..1T", "", "_}?&ty(U,`", stringArray0, false, false);
      methodWriter0.visitFieldInsn(2226, "O", "6^pl:^wQTW3k", "_}?&ty(U,`");
  }

  @Test(timeout = 4000)
  public void test34()  throws Throwable  {
      ClassWriter classWriter0 = new ClassWriter(32767);
      String[] stringArray0 = new String[2];
      stringArray0[0] = "<76$il";
      stringArray0[1] = "<76$il";
      MethodWriter methodWriter0 = new MethodWriter(classWriter0, 2, "HLc%z0b`#", "HLc%z0b`#", "<76$il", stringArray0, false, false);
      ByteVector byteVector0 = new ByteVector(1);
      byteVector0.putLong(32767);
      MethodWriter methodWriter1 = null;
      try {
        methodWriter1 = new MethodWriter(classWriter0, (-845), "HLc%z0b`#", "Y|ns", "y5L", stringArray0, false, true);
        fail("Expecting exception: StringIndexOutOfBoundsException");
      
      } catch(StringIndexOutOfBoundsException e) {
      }
  }

  @Test(timeout = 4000)
  public void test35()  throws Throwable  {
      String[] stringArray0 = new String[0];
      ClassWriter classWriter0 = new ClassWriter(2);
      MethodWriter methodWriter0 = new MethodWriter(classWriter0, 2, "getClassName", "^", "getClassName", stringArray0, false, false);
      methodWriter0.visitFieldInsn(1, "k@iC2.()i!diPBTO", ";}gn/M", "^");
      ByteVector byteVector0 = new ByteVector();
      Object[] objectArray0 = new Object[8];
      methodWriter0.visitFrame((-1349), 2, stringArray0, 1, objectArray0);
      methodWriter0.put(byteVector0);
  }

  @Test(timeout = 4000)
  public void test36()  throws Throwable  {
      ClassWriter classWriter0 = new ClassWriter((-649));
      MethodWriter methodWriter0 = new MethodWriter(classWriter0, (-649), "p5]jNT mr$;Q;/63F", "[)c,XAih.-^Y.)", "i[A", (String[]) null, false, false);
      Label label0 = new Label();
      methodWriter0.visitLocalVariable("[)c,XAih.-^Y.)", "Yygi_hbMK]", ":ET80&K{P2z;KlK", label0, label0, (-649));
  }

  @Test(timeout = 4000)
  public void test37()  throws Throwable  {
      ClassWriter classWriter0 = mock(ClassWriter.class, new ViolatedAssumptionAnswer());
      doReturn(2226, 2226, 2226, 2226, 0).when(classWriter0).newUTF8(anyString());
      String[] stringArray0 = new String[0];
      MethodWriter methodWriter0 = new MethodWriter(classWriter0, (-1), "", "", "", stringArray0, false, false);
      ByteVector byteVector0 = new ByteVector(2);
      methodWriter0.put(byteVector0);
  }

  @Test(timeout = 4000)
  public void test38()  throws Throwable  {
      ClassReader classReader0 = new ClassReader("org.mockito.asm.Type");
      ClassWriter classWriter0 = new ClassWriter(classReader0, 1);
      String[] stringArray0 = new String[3];
      stringArray0[0] = "*Yxs}W Z@>kpTc$cu`";
      stringArray0[1] = "org.mockito.asm.Type";
      stringArray0[2] = "";
      MethodWriter methodWriter0 = new MethodWriter(classWriter0, 8, "", "*Yxs}W Z@>kpTc$cu`", "value ", stringArray0, false, false);
      methodWriter0.visitFieldInsn(112, "*Yxs}W Z@>kpTc$cu`", "Deprecated", "");
      int int0 = methodWriter0.getSize();
      assertEquals(51, int0);
  }

  @Test(timeout = 4000)
  public void test39()  throws Throwable  {
      ClassWriter classWriter0 = new ClassWriter(267386880);
      String[] stringArray0 = new String[0];
      MethodWriter methodWriter0 = new MethodWriter(classWriter0, 267386880, "4)Q", "4)Q", "Label offset position has not been resolved yet", stringArray0, false, false);
      Label label0 = new Label();
      methodWriter0.visitJumpInsn(501, label0);
      int int0 = methodWriter0.getSize();
      assertEquals(37, int0);
  }

  @Test(timeout = 4000)
  public void test40()  throws Throwable  {
      ClassWriter classWriter0 = mock(ClassWriter.class, new ViolatedAssumptionAnswer());
      doReturn(1175, (-3535), 1175).when(classWriter0).newClass(anyString());
      doReturn(2226, 2226, 2226, 2226, 1175).when(classWriter0).newUTF8(anyString());
      ByteVector byteVector0 = new ByteVector(91);
      String[] stringArray0 = new String[3];
      MethodWriter methodWriter0 = new MethodWriter(classWriter0, 87, "", "RuntimeVisibleAnnotations", "", stringArray0, false, false);
      methodWriter0.put(byteVector0);
      ClassWriter classWriter1 = new ClassWriter((-3535));
      String[] stringArray1 = new String[0];
      MethodWriter methodWriter1 = new MethodWriter(classWriter1, (-1670), "3aCl9F\"gVj", "RuntimeVisibleAnnotations", "", stringArray1, false, false);
      assertFalse(methodWriter1.equals((Object)methodWriter0));
  }

  @Test(timeout = 4000)
  public void test41()  throws Throwable  {
      ClassWriter classWriter0 = new ClassWriter(267386880);
      String[] stringArray0 = new String[0];
      MethodWriter methodWriter0 = new MethodWriter(classWriter0, 267386880, "4)Q", "4)Q", "Label offset position has not been resolved yet", stringArray0, false, false);
      methodWriter0.visitIincInsn((-1038), (-986));
  }

  @Test(timeout = 4000)
  public void test42()  throws Throwable  {
      ClassWriter classWriter0 = mock(ClassWriter.class, new ViolatedAssumptionAnswer());
      doReturn(1175, (-3535), 1175).when(classWriter0).newClass(anyString());
      doReturn(2226, 2226, 2226, 2226, 1175).when(classWriter0).newUTF8(anyString());
      ByteVector byteVector0 = new ByteVector(91);
      String[] stringArray0 = new String[3];
      stringArray0[0] = "";
      stringArray0[1] = "";
      stringArray0[2] = "RuntimeVisibleAnnotations";
      MethodWriter methodWriter0 = new MethodWriter(classWriter0, 87, "", "RuntimeVisibleAnnotations", "", stringArray0, false, false);
      methodWriter0.visitAnnotation("cis(3@Xu6Qd", false);
      methodWriter0.put(byteVector0);
      ClassWriter classWriter1 = new ClassWriter(11);
      MethodWriter methodWriter1 = null;
      try {
        methodWriter1 = new MethodWriter(classWriter1, 11, "Q\"}KCFI+(nk3", "[M~o:??6wlw|kcL", "[M~o:??6wlw|kcL", stringArray0, false, true);
        fail("Expecting exception: StringIndexOutOfBoundsException");
      
      } catch(StringIndexOutOfBoundsException e) {
      }
  }

  @Test(timeout = 4000)
  public void test43()  throws Throwable  {
      ClassWriter classWriter0 = mock(ClassWriter.class, new ViolatedAssumptionAnswer());
      doReturn(1175, (-3535), 1175).when(classWriter0).newClass(anyString());
      doReturn(2226, 2226, 2226, 2226, 1175).when(classWriter0).newUTF8(anyString());
      ByteVector byteVector0 = new ByteVector(91);
      String[] stringArray0 = new String[3];
      MethodWriter methodWriter0 = new MethodWriter(classWriter0, 87, "", "RuntimeVisibleAnnotations", "", stringArray0, false, false);
      methodWriter0.visitAnnotation("cis(3@Xu6Qd", false);
      methodWriter0.put(byteVector0);
      ClassWriter classWriter1 = new ClassWriter((-3535));
      String[] stringArray1 = new String[0];
      MethodWriter methodWriter1 = new MethodWriter(classWriter1, (-1670), "3aCl9F\"gVj", "RuntimeVisibleAnnotations", "", stringArray1, false, false);
      assertFalse(methodWriter1.equals((Object)methodWriter0));
  }

  @Test(timeout = 4000)
  public void test44()  throws Throwable  {
      ClassWriter classWriter0 = new ClassWriter(32767);
      String[] stringArray0 = new String[8];
      stringArray0[0] = "E";
      stringArray0[1] = "org.mockito.asm.ClassWriter";
      stringArray0[2] = "E";
      stringArray0[3] = "NKLP&;).[LK!L";
      stringArray0[4] = "NKLP&;).[LK!L";
      stringArray0[5] = "E";
      stringArray0[6] = "NKLP&;).[LK!L";
      stringArray0[7] = "NKLP&;).[LK!L";
      MethodVisitor methodVisitor0 = classWriter0.visitMethod(2, "E", "NKLP&;).[LK!L", "l^:fRv\"fQO", stringArray0);
      methodVisitor0.visitIincInsn(441, (-2320));
  }

  @Test(timeout = 4000)
  public void test45()  throws Throwable  {
      String[] stringArray0 = new String[0];
      ClassWriter classWriter0 = new ClassWriter(2);
      MethodWriter methodWriter0 = new MethodWriter(classWriter0, 2, "getClassName", "^", "getClassName", stringArray0, false, false);
      ByteVector byteVector0 = new ByteVector(2);
      methodWriter0.visitLdcInsn("^");
      methodWriter0.put(byteVector0);
  }

  @Test(timeout = 4000)
  public void test46()  throws Throwable  {
      ClassWriter classWriter0 = new ClassWriter(32767);
      String[] stringArray0 = new String[2];
      stringArray0[0] = "<76$il";
      stringArray0[1] = "<76$il";
      MethodWriter methodWriter0 = new MethodWriter(classWriter0, 2, "HLc%z0b`#", "HLc%z0b`#", "<76$il", stringArray0, false, false);
      ByteVector byteVector0 = new ByteVector(1199);
      methodWriter0.visitLdcInsn("<76$il");
      methodWriter0.visitFrame(12, 1053, stringArray0, 12, stringArray0);
      methodWriter0.put(byteVector0);
  }

  @Test(timeout = 4000)
  public void test47()  throws Throwable  {
      ClassWriter classWriter0 = new ClassWriter(267386880);
      String[] stringArray0 = new String[0];
      MethodWriter methodWriter0 = new MethodWriter(classWriter0, 267386880, "4)Q", ";Pk)T|]iQRgFobow9", "Label offset position has not been resolved yet", stringArray0, false, false);
      ByteVector byteVector0 = classWriter0.pool;
      methodWriter0.visitAnnotation("_^r;}z9h", true);
      methodWriter0.put(byteVector0);
  }

  @Test(timeout = 4000)
  public void test48()  throws Throwable  {
      ClassWriter classWriter0 = new ClassWriter(32767);
      String[] stringArray0 = new String[2];
      stringArray0[0] = "<76$il";
      stringArray0[1] = "<76$il";
      MethodWriter methodWriter0 = new MethodWriter(classWriter0, 2, "HLc%z0b`#", "HLc%z0b`#", "<76$il", stringArray0, false, false);
      ByteVector byteVector0 = new ByteVector(1199);
      methodWriter0.visitLdcInsn("<76$il");
      methodWriter0.visitTryCatchBlock((Label) null, (Label) null, (Label) null, "<76$il");
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
  public void test49()  throws Throwable  {
      int[] intArray0 = new int[6];
      intArray0[1] = 2284;
      MethodWriter.getNewOffset(intArray0, intArray0, 990, (-1360));
      ClassWriter classWriter0 = mock(ClassWriter.class, new ViolatedAssumptionAnswer());
      doReturn((-713)).when(classWriter0).newClass(anyString());
      doReturn(512, 50).when(classWriter0).newUTF8(anyString());
      String[] stringArray0 = new String[1];
      MethodWriter methodWriter0 = new MethodWriter(classWriter0, 53, "+M-z5Pb", "<init>", "<init>", stringArray0, false, false);
  }

  @Test(timeout = 4000)
  public void test50()  throws Throwable  {
      ClassWriter classWriter0 = new ClassWriter(16777216);
      String[] stringArray0 = new String[5];
      stringArray0[0] = "SourceDebugExtension";
      stringArray0[1] = "org.mockito.asm.Label";
      stringArray0[2] = "N.";
      stringArray0[3] = "N.";
      stringArray0[4] = "org.mockito.asm.Label";
      MethodWriter methodWriter0 = new MethodWriter(classWriter0, (-1557), "org.mockito.asm.Label", "void", "q+WmP@0b-}'J3+M!;", stringArray0, false, false);
      Label label0 = new Label();
      methodWriter0.visitLocalVariable("KpIx", "org.mockito.asm.Label", "org.mockito.asm.Label", label0, label0, 2);
  }

  @Test(timeout = 4000)
  public void test51()  throws Throwable  {
      ClassReader classReader0 = new ClassReader("org.mockito.asm.MethodWriter");
      ClassWriter classWriter0 = new ClassWriter(2);
      // Undeclared exception!
      classReader0.accept((ClassVisitor) classWriter0, 2);
  }

  @Test(timeout = 4000)
  public void test52()  throws Throwable  {
      String[] stringArray0 = new String[0];
      ClassWriter classWriter0 = new ClassWriter(2822);
      MethodWriter methodWriter0 = new MethodWriter(classWriter0, 2822, "hyL?#Z#H(&x%z", "AAAAAAAAAAAAAAAABCKLLDDDDDEEEEEEEEEEEEEEEEEEEEAAAAAAAADDDDDEEEEEEEEEEEEEEEEEEEEAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAMAAAAAAAAAAAAAAAAAAAAIIIIIIIIIIIIIIIIDNOAAAAAAGGGGGGGHAFBFAAFFAAQPIIJJIIIIIIIIIIIIIIIIII", "`8?z&K%!z ", stringArray0, false, false);
      int int0 = methodWriter0.getSize();
      assertEquals(16, int0);
  }

  @Test(timeout = 4000)
  public void test53()  throws Throwable  {
      ClassWriter classWriter0 = new ClassWriter((-649));
      MethodWriter methodWriter0 = new MethodWriter(classWriter0, (-2888), "5,-@:", "/[})_5ha/-fO}G7", "5,-@:", (String[]) null, true, true);
      ByteVector byteVector0 = new ByteVector();
      methodWriter0.put(byteVector0);
      methodWriter0.visitMultiANewArrayInsn("TlJ2z@V$Vvlt_gEm*", (-649));
      methodWriter0.put(byteVector0);
  }

  @Test(timeout = 4000)
  public void test54()  throws Throwable  {
      ClassReader classReader0 = new ClassReader("org.mockito.asm.Type");
      ClassWriter classWriter0 = new ClassWriter(8);
      classReader0.accept((ClassVisitor) classWriter0, (-5846));
      MethodWriter methodWriter0 = classWriter0.firstMethod;
      ByteVector byteVector0 = new ByteVector();
      methodWriter0.put(byteVector0);
  }
}
