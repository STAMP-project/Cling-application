/*

 * Tue Mar 03 14:34:52 GMT 2020
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
import org.mockito.asm.Item;
import org.mockito.asm.Label;
import org.mockito.asm.MethodWriter;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = false, useJEE = true) 
public class MethodWriter_ESTest extends MethodWriter_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test00()  throws Throwable  {
      ClassWriter classWriter0 = mock(ClassWriter.class, new ViolatedAssumptionAnswer());
      doReturn(92, 92).when(classWriter0).newUTF8(anyString());
      MethodWriter methodWriter0 = new MethodWriter(classWriter0, 183, "Jn#X|)Ejzi(f2*s>B", "Jn#X|)Ejzi(f2*s>B", "Jn#X|)Ejzi(f2*s>B", (String[]) null, false, false);
      ClassWriter classWriter1 = new ClassWriter((-4666));
      MethodWriter methodWriter1 = new MethodWriter(classWriter1, 1483, "Jn#X|)Ejzi(f2*s>B", "Jn#X|)Ejzi(f2*s>B", "g", (String[]) null, true, true);
      methodWriter1.visitMethodInsn(91, "E`FY8r!V?1!#yA4.Kz=", "g", "g");
      Item item0 = classWriter1.newDouble(183);
      assertNotNull(item0);
  }

  @Test(timeout = 4000)
  public void test01()  throws Throwable  {
      ClassWriter classWriter0 = new ClassWriter(606);
      String[] stringArray0 = new String[0];
      MethodWriter methodWriter0 = new MethodWriter(classWriter0, (-260), "Deprecated", "8e)w)LzEy_.N&?S;]", "Deprecated", stringArray0, true, true);
      methodWriter0.visitMethodInsn(2, "iN]Yu[A3@,vUr=f", "iN]Yu[A3@,vUr=f", "Deprecated");
  }

  @Test(timeout = 4000)
  public void test02()  throws Throwable  {
      ClassWriter classWriter0 = mock(ClassWriter.class, new ViolatedAssumptionAnswer());
      doReturn(27, 27).when(classWriter0).newUTF8(anyString());
      String[] stringArray0 = new String[0];
      MethodWriter methodWriter0 = new MethodWriter(classWriter0, 27, "AnnotationDefault", "AnnotationDefault", "AnnotationDefault", stringArray0, false, false);
      methodWriter0.visitFrame((-2034934978), 268435456, stringArray0, 2, stringArray0);
      assertEquals(0, stringArray0.length);
  }

  @Test(timeout = 4000)
  public void test03()  throws Throwable  {
      ClassWriter classWriter0 = mock(ClassWriter.class, new ViolatedAssumptionAnswer());
      doReturn(99, 99, 99, (-559), 99).when(classWriter0).newClass(anyString());
      doReturn(99, (-1255)).when(classWriter0).newUTF8(anyString());
      String[] stringArray0 = new String[7];
      MethodWriter methodWriter0 = new MethodWriter(classWriter0, 1, "", "RuntimeVisibleParameterAnnotations", "RuntimeVisibleParameterAnnotations", stringArray0, false, false);
      methodWriter0.classReaderOffset = 99;
      int int0 = methodWriter0.getSize();
      assertEquals(6, int0);
  }

  @Test(timeout = 4000)
  public void test04()  throws Throwable  {
      ClassWriter classWriter0 = mock(ClassWriter.class, new ViolatedAssumptionAnswer());
      doReturn(92, 92).when(classWriter0).newUTF8(anyString());
      MethodWriter methodWriter0 = new MethodWriter(classWriter0, 183, "Jn#X|)Ejzi(f2*s>B", "Jn#X|)Ejzi(f2*s>B", "Jn#X|)Ejzi(f2*s>B", (String[]) null, false, false);
      int[] intArray0 = new int[9];
      intArray0[3] = 183;
      int int0 = MethodWriter.getNewOffset(intArray0, intArray0, 183, 131);
      assertEquals((-235), int0);
  }

  @Test(timeout = 4000)
  public void test05()  throws Throwable  {
      ClassWriter classWriter0 = new ClassWriter((-4805));
      MethodWriter methodWriter0 = new MethodWriter(classWriter0, 3, "Jn#X|)Ejzi(f2*s>B", "Jn#X|)Ejzi(f2*s>B", "Jn#X|)Ejzi(f2*s>B", (String[]) null, false, false);
      MethodWriter methodWriter1 = new MethodWriter(classWriter0, 821, "d]C)L0#`D", "Jn#X|)Ejzi(f2*s>B", "d]C)L0#`D", (String[]) null, true, false);
      // Undeclared exception!
      try { 
        methodWriter1.visitMethodInsn(92, "Jn#X|)Ejzi(f2*s>B", "Jn#X|)Ejzi(f2*s>B", ",w:=FI-Y/-5");
        fail("Expecting exception: StringIndexOutOfBoundsException");
      
      } catch(StringIndexOutOfBoundsException e) {
      }
  }

  @Test(timeout = 4000)
  public void test06()  throws Throwable  {
      String[] stringArray0 = new String[2];
      stringArray0[0] = " ";
      stringArray0[1] = "!";
      int[] intArray0 = new int[2];
      intArray0[1] = 2;
      Label label0 = mock(Label.class, new ViolatedAssumptionAnswer());
      MethodWriter.getNewOffset(intArray0, intArray0, label0);
      ClassWriter classWriter0 = new ClassWriter(2);
      MethodWriter methodWriter0 = new MethodWriter(classWriter0, (-2880), "1gLA+-Ts-fE+O5%7Jy[", "jx9ClO1QGs+b", "6!", stringArray0, false, false);
      MethodWriter methodWriter1 = new MethodWriter(classWriter0, 2, "6!", "StackMap", "!", stringArray0, false, false);
      assertFalse(methodWriter1.equals((Object)methodWriter0));
  }

  @Test(timeout = 4000)
  public void test07()  throws Throwable  {
      ClassWriter classWriter0 = new ClassWriter(15);
      String[] stringArray0 = new String[0];
      MethodWriter methodWriter0 = new MethodWriter(classWriter0, 1, "java/lang/String", "6IIr", "LineNumberTable", stringArray0, false, false);
      methodWriter0.visitMethodInsn(91, "LocalVariableTable", "LocalVariableTypeTable", "LineNumberTable");
  }

  @Test(timeout = 4000)
  public void test08()  throws Throwable  {
      ClassWriter classWriter0 = new ClassWriter(15);
      String[] stringArray0 = new String[5];
      stringArray0[0] = "LineNumberTable";
      stringArray0[1] = "LineNumberTable";
      stringArray0[2] = "LineNumberTable";
      stringArray0[3] = "LineNumberTable";
      stringArray0[4] = "LineNumberTable";
      MethodWriter methodWriter0 = new MethodWriter(classWriter0, 15, "LineNumberTable", "Up/fuH#7Ch", "LineNumberTable", stringArray0, false, false);
      // Undeclared exception!
      try { 
        methodWriter0.visitFrame(1, 412, stringArray0, (-2034934978), stringArray0);
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // 5
         //
         verifyException("org.mockito.asm.MethodWriter", e);
      }
  }

  @Test(timeout = 4000)
  public void test09()  throws Throwable  {
      ClassWriter classWriter0 = mock(ClassWriter.class, new ViolatedAssumptionAnswer());
      doReturn(92, 92, 92, 87).when(classWriter0).newUTF8(anyString());
      MethodWriter methodWriter0 = new MethodWriter(classWriter0, 183, "Jn#X|)Ejzi(f2*s>B", "Jn#X|)Ejzi(f2*s>B", "Jn#X|)Ejzi(f2*s>B", (String[]) null, false, false);
      methodWriter0.getSize();
      ClassWriter classWriter1 = new ClassWriter((-4666));
      MethodWriter methodWriter1 = new MethodWriter(classWriter1, 1483, "Jn#X|)Ejzi(f2*s>B", "Jn#X|)Ejzi(f2*s>B", "g", (String[]) null, true, true);
      assertFalse(methodWriter1.equals((Object)methodWriter0));
  }

  @Test(timeout = 4000)
  public void test10()  throws Throwable  {
      ClassWriter classWriter0 = new ClassWriter(74);
      String[] stringArray0 = new String[0];
      MethodWriter methodWriter0 = new MethodWriter(classWriter0, 2, "*1X^EO={k&mm}fb,5", "*1X^EO={k&mm}fb,5", "*1X^EO={k&mm}fb,5", stringArray0, false, false);
      int int0 = methodWriter0.getSize();
      assertEquals(16, int0);
  }

  @Test(timeout = 4000)
  public void test11()  throws Throwable  {
      ClassWriter classWriter0 = mock(ClassWriter.class, new ViolatedAssumptionAnswer());
      doReturn(27, 27, 177, 27, 0).when(classWriter0).newUTF8(anyString());
      String[] stringArray0 = new String[0];
      MethodWriter methodWriter0 = new MethodWriter(classWriter0, 27, "AnnotationDefault", "AnnotationDefault", "AnnotationDefault", stringArray0, false, false);
      methodWriter0.visitAnnotationDefault();
      ByteVector byteVector0 = new ByteVector(53);
      methodWriter0.put(byteVector0);
  }

  @Test(timeout = 4000)
  public void test12()  throws Throwable  {
      ClassWriter classWriter0 = new ClassWriter(15);
      String[] stringArray0 = new String[0];
      MethodWriter methodWriter0 = new MethodWriter(classWriter0, 1, "java/lang/String", "6IIr", "LineNumberTable", stringArray0, false, false);
      methodWriter0.visitInsn(15);
  }

  @Test(timeout = 4000)
  public void test13()  throws Throwable  {
      int[] intArray0 = new int[1];
      intArray0[0] = 32;
      Label label0 = mock(Label.class, new ViolatedAssumptionAnswer());
      MethodWriter.getNewOffset(intArray0, intArray0, label0);
      ClassWriter classWriter0 = mock(ClassWriter.class, new ViolatedAssumptionAnswer());
      doReturn(0, 0, 0, 0, 0).when(classWriter0).newClass(anyString());
      doReturn(32, 32).when(classWriter0).newUTF8(anyString());
      String[] stringArray0 = new String[7];
      MethodWriter methodWriter0 = null;
      try {
        methodWriter0 = new MethodWriter(classWriter0, 2, (String) null, (String) null, (String) null, stringArray0, true, true);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.mockito.asm.MethodWriter", e);
      }
  }

  @Test(timeout = 4000)
  public void test14()  throws Throwable  {
      ClassWriter classWriter0 = new ClassWriter(15);
      String[] stringArray0 = new String[0];
      MethodWriter methodWriter0 = new MethodWriter(classWriter0, 1, "java/lang/String", "6IIr", "LineNumberTable", stringArray0, false, false);
      int[] intArray0 = new int[8];
      intArray0[1] = 48;
      int int0 = MethodWriter.getNewOffset(intArray0, intArray0, 2, 15);
      assertEquals(13, int0);
  }

  @Test(timeout = 4000)
  public void test15()  throws Throwable  {
      ClassWriter classWriter0 = mock(ClassWriter.class, new ViolatedAssumptionAnswer());
      doReturn(27, 27).when(classWriter0).newUTF8(anyString());
      String[] stringArray0 = new String[0];
      MethodWriter methodWriter0 = new MethodWriter(classWriter0, 27, "AnnotationDefault", "AnnotationDefault", "AnnotationDefault", stringArray0, false, false);
      methodWriter0.visitMaxs(116, 27);
  }

  @Test(timeout = 4000)
  public void test16()  throws Throwable  {
      ClassWriter classWriter0 = new ClassWriter(220);
      String[] stringArray0 = new String[3];
      stringArray0[0] = "";
      stringArray0[1] = "";
      stringArray0[2] = "";
      MethodWriter methodWriter0 = new MethodWriter(classWriter0, 2, "", "", "", stringArray0, false, false);
      MethodWriter methodWriter1 = new MethodWriter(classWriter0, 103, "", "", (String) null, stringArray0, false, false);
      int int0 = methodWriter1.getSize();
      assertEquals(22, int0);
  }

  @Test(timeout = 4000)
  public void test17()  throws Throwable  {
      ClassWriter classWriter0 = mock(ClassWriter.class, new ViolatedAssumptionAnswer());
      doReturn(92, 92).when(classWriter0).newUTF8(anyString());
      MethodWriter methodWriter0 = new MethodWriter(classWriter0, 3, "Jn#X|)Ejzi(f2*s>B", "Jn#X|)Ejzi(f2*s>B", "Jn#X|)Ejzi(f2*s>B", (String[]) null, true, true);
      // Undeclared exception!
      try { 
        methodWriter0.visitInsn((-4805));
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
      }
  }

  @Test(timeout = 4000)
  public void test18()  throws Throwable  {
      ClassWriter classWriter0 = new ClassWriter(15);
      String[] stringArray0 = new String[0];
      MethodWriter methodWriter0 = new MethodWriter(classWriter0, 1, "java/lang/String", "6IIr", "LineNumberTable", stringArray0, false, false);
      methodWriter0.visitVarInsn(2437, 1048575);
  }

  @Test(timeout = 4000)
  public void test19()  throws Throwable  {
      ClassWriter classWriter0 = new ClassWriter((-4805));
      MethodWriter methodWriter0 = new MethodWriter(classWriter0, 3, "Jn#X|)Ejzi(f2*s>B", "Jn#X|)Ejzi(f2*s>B", "Jn#X|)Ejzi(f2*s>B", (String[]) null, false, false);
      MethodWriter methodWriter1 = new MethodWriter(classWriter0, 821, "d]C)L0#`D", "Jn#X|)Ejzi(f2*s>B", "d]C)L0#`D", (String[]) null, true, false);
      methodWriter1.visitVarInsn(2, 102);
      assertFalse(methodWriter1.equals((Object)methodWriter0));
  }

  @Test(timeout = 4000)
  public void test20()  throws Throwable  {
      ClassWriter classWriter0 = new ClassWriter(606);
      String[] stringArray0 = new String[5];
      stringArray0[0] = "1gLA+-Ts-fE+O5%7Jy[";
      stringArray0[1] = "1gLA+-Ts-fE+O5%7Jy[";
      stringArray0[2] = "1gLA+-Ts-fE+O5%7Jy[";
      stringArray0[3] = "1gLA+-Ts-fE+O5%7Jy[";
      stringArray0[4] = "1gLA+-Ts-fE+O5%7Jy[";
      MethodWriter methodWriter0 = null;
      try {
        methodWriter0 = new MethodWriter(classWriter0, 1048575, "1gLA+-Ts-fE+O5%7Jy[", "1gLA+-Ts-fE+O5%7Jy[", "1gLA+-Ts-fE+O5%7Jy[", stringArray0, true, true);
        fail("Expecting exception: StringIndexOutOfBoundsException");
      
      } catch(StringIndexOutOfBoundsException e) {
      }
  }

  @Test(timeout = 4000)
  public void test21()  throws Throwable  {
      ClassWriter classWriter0 = new ClassWriter(15);
      String[] stringArray0 = new String[5];
      stringArray0[0] = "LineNumberTable";
      stringArray0[1] = "v";
      stringArray0[2] = "LineNumberTable";
      stringArray0[3] = "v";
      stringArray0[4] = "LineNumberTable";
      MethodWriter methodWriter0 = new MethodWriter(classWriter0, (-2177), "LineNumberTable", "LineNumberTable", "LineNumberTable", stringArray0, false, false);
      ByteVector byteVector0 = new ByteVector();
      methodWriter0.put(byteVector0);
  }

  @Test(timeout = 4000)
  public void test22()  throws Throwable  {
      ClassWriter classWriter0 = new ClassWriter(15);
      String[] stringArray0 = new String[5];
      stringArray0[0] = "LineNumberTable";
      stringArray0[1] = "v";
      stringArray0[2] = "LineNumberTable";
      stringArray0[3] = "v";
      stringArray0[4] = "LineNumberTable";
      MethodWriter methodWriter0 = new MethodWriter(classWriter0, (-2177), "LineNumberTable", "LineNumberTable", "LineNumberTable", stringArray0, false, false);
      ByteVector byteVector0 = new ByteVector();
      classWriter0.version = (-283);
      methodWriter0.put(byteVector0);
  }

  @Test(timeout = 4000)
  public void test23()  throws Throwable  {
      ClassWriter classWriter0 = new ClassWriter(32);
      String[] stringArray0 = new String[3];
      stringArray0[0] = "Up/fuH#7Ch";
      stringArray0[1] = "RuntimeVisibleParameterAnnotations";
      stringArray0[2] = "RuntimeVisibleParameterAnnotations";
      MethodWriter methodWriter0 = new MethodWriter(classWriter0, 11, "RuntimeVisibleParameterAnnotations", "Up/fuH#7Ch", ">6]%", stringArray0, false, false);
      methodWriter0.visitVarInsn(25165824, 32);
      methodWriter0.getSize();
      MethodWriter methodWriter1 = new MethodWriter(classWriter0, 25165824, "#VU)kK.w", "#VU)kK.w", "iw=QoxZy", stringArray0, true, true);
      assertFalse(methodWriter1.equals((Object)methodWriter0));
  }

  @Test(timeout = 4000)
  public void test24()  throws Throwable  {
      ClassReader classReader0 = new ClassReader("org.mockito.asm.MethodWriter");
      ClassWriter classWriter0 = new ClassWriter(4);
      classReader0.accept((ClassVisitor) classWriter0, 256);
      String[] stringArray0 = new String[1];
      stringArray0[0] = "org.mockito.asm.MethodWriter";
      MethodWriter methodWriter0 = null;
      try {
        methodWriter0 = new MethodWriter(classWriter0, 2, "org.mockito.asm.MethodWriter", "v-S{&I~?JzPD,", "org.mockito.asm.MethodWriter", stringArray0, false, true);
        fail("Expecting exception: StringIndexOutOfBoundsException");
      
      } catch(StringIndexOutOfBoundsException e) {
      }
  }

  @Test(timeout = 4000)
  public void test25()  throws Throwable  {
      ClassWriter classWriter0 = mock(ClassWriter.class, new ViolatedAssumptionAnswer());
      doReturn(27, 27).when(classWriter0).newUTF8(anyString());
      String[] stringArray0 = new String[0];
      MethodWriter methodWriter0 = new MethodWriter(classWriter0, 27, "AnnotationDefault", "AnnotationDefault", "AnnotationDefault", stringArray0, false, false);
      methodWriter0.visitIincInsn((-1695), 27);
  }

  @Test(timeout = 4000)
  public void test26()  throws Throwable  {
      ClassWriter classWriter0 = new ClassWriter(15);
      String[] stringArray0 = new String[0];
      MethodWriter methodWriter0 = new MethodWriter(classWriter0, 1, "java/lang/String", "6IIr", "LineNumberTable", stringArray0, false, false);
      Label label0 = new Label();
      Label[] labelArray0 = new Label[7];
      labelArray0[0] = label0;
      labelArray0[1] = label0;
      labelArray0[2] = label0;
      labelArray0[3] = label0;
      labelArray0[4] = label0;
      labelArray0[5] = label0;
      labelArray0[6] = label0;
      methodWriter0.visitTableSwitchInsn(2, 3717, label0, labelArray0);
      methodWriter0.visitLineNumber(15, label0);
      ByteVector byteVector0 = new ByteVector(8);
      methodWriter0.put(byteVector0);
  }

  @Test(timeout = 4000)
  public void test27()  throws Throwable  {
      ClassWriter classWriter0 = new ClassWriter(220);
      String[] stringArray0 = new String[3];
      stringArray0[0] = "";
      stringArray0[1] = "";
      stringArray0[2] = "";
      MethodWriter methodWriter0 = new MethodWriter(classWriter0, 2, "", "", "", stringArray0, false, false);
      MethodWriter methodWriter1 = new MethodWriter(classWriter0, 103, "", "", (String) null, stringArray0, false, false);
      methodWriter0.visitIntInsn(34, 131072);
      ByteVector byteVector0 = new ByteVector(307);
      methodWriter0.put(byteVector0);
      assertFalse(methodWriter0.equals((Object)methodWriter1));
  }

  @Test(timeout = 4000)
  public void test28()  throws Throwable  {
      ClassWriter classWriter0 = mock(ClassWriter.class, new ViolatedAssumptionAnswer());
      doReturn((-647), 46, (-1791095628), 76, 47).when(classWriter0).newClass(anyString());
      doReturn(47, (-1791095628), 172, 76, (-647)).when(classWriter0).newUTF8(anyString());
      String[] stringArray0 = new String[7];
      MethodWriter methodWriter0 = new MethodWriter(classWriter0, 47, "", "RuntimeVisibleParameterAnnotations", "RuntimeVisibleParameterAnnotations", stringArray0, false, false);
      Label label0 = mock(Label.class, new ViolatedAssumptionAnswer());
      Label[] labelArray0 = new Label[5];
      labelArray0[0] = label0;
      labelArray0[1] = label0;
      labelArray0[2] = label0;
      labelArray0[3] = label0;
      labelArray0[4] = label0;
      methodWriter0.visitTableSwitchInsn(0, (-1150), label0, labelArray0);
      ByteVector byteVector0 = new ByteVector(46);
      methodWriter0.visitLocalVariable("", "", "qM1r ", label0, label0, 77);
      methodWriter0.put(byteVector0);
  }

  @Test(timeout = 4000)
  public void test29()  throws Throwable  {
      ClassWriter classWriter0 = new ClassWriter(15);
      String[] stringArray0 = new String[0];
      MethodWriter methodWriter0 = new MethodWriter(classWriter0, 1, "java/lang/String", "6IIr", "LineNumberTable", stringArray0, false, false);
      Label label0 = new Label();
      Label[] labelArray0 = new Label[4];
      labelArray0[0] = label0;
      labelArray0[1] = label0;
      labelArray0[2] = label0;
      labelArray0[3] = label0;
      methodWriter0.visitTableSwitchInsn(1, 15, label0, labelArray0);
      ByteVector byteVector0 = new ByteVector(7);
      methodWriter0.put(byteVector0);
  }

  @Test(timeout = 4000)
  public void test30()  throws Throwable  {
      ClassWriter classWriter0 = new ClassWriter(606);
      String[] stringArray0 = new String[0];
      MethodWriter methodWriter0 = new MethodWriter(classWriter0, (-260), "Deprecated", "8e)w)LzEy_.N&?S;]", "Deprecated", stringArray0, true, true);
      // Undeclared exception!
      try { 
        methodWriter0.visitMaxs(69, 69);
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // 17
         //
         verifyException("org.mockito.asm.Type", e);
      }
  }

  @Test(timeout = 4000)
  public void test31()  throws Throwable  {
      ClassWriter classWriter0 = mock(ClassWriter.class, new ViolatedAssumptionAnswer());
      doReturn(92, 92).when(classWriter0).newUTF8(anyString());
      MethodWriter methodWriter0 = new MethodWriter(classWriter0, 3, "Jn#X|)Ejzi(f2*s>B", "Jn#X|)Ejzi(f2*s>B", "Jn#X|)Ejzi(f2*s>B", (String[]) null, true, true);
      methodWriter0.visitVarInsn(2, 1);
  }

  @Test(timeout = 4000)
  public void test32()  throws Throwable  {
      int[] intArray0 = new int[8];
      intArray0[0] = 8;
      int int0 = MethodWriter.getNewOffset(intArray0, intArray0, 2, 15);
      assertEquals(21, int0);
  }

  @Test(timeout = 4000)
  public void test33()  throws Throwable  {
      ClassWriter classWriter0 = new ClassWriter(220);
      String[] stringArray0 = new String[3];
      stringArray0[0] = "";
      stringArray0[1] = "";
      stringArray0[2] = "";
      MethodWriter methodWriter0 = new MethodWriter(classWriter0, 2, "", "", "", stringArray0, false, false);
      MethodWriter methodWriter1 = new MethodWriter(classWriter0, 103, "", "", (String) null, stringArray0, false, false);
      ByteVector byteVector0 = new ByteVector(307);
      methodWriter1.put(byteVector0);
      assertFalse(methodWriter1.equals((Object)methodWriter0));
  }

  @Test(timeout = 4000)
  public void test34()  throws Throwable  {
      Label label0 = mock(Label.class, new ViolatedAssumptionAnswer());
      ClassWriter classWriter0 = new ClassWriter(32);
      String[] stringArray0 = new String[3];
      stringArray0[0] = "Up/fuH#7Ch";
      stringArray0[1] = "RuntimeVisibleParameterAnnotations";
      stringArray0[2] = "Up/fuH#7Ch";
      MethodWriter methodWriter0 = new MethodWriter(classWriter0, 32, "RuntimeVisibleParameterAnnotations", "LocalVariableTable", ">6]%", stringArray0, false, false);
      methodWriter0.visitIntInsn(307, 131072);
      methodWriter0.visitLineNumber(32, label0);
      ByteVector byteVector0 = new ByteVector(56);
      methodWriter0.put(byteVector0);
  }

  @Test(timeout = 4000)
  public void test35()  throws Throwable  {
      ClassWriter classWriter0 = new ClassWriter(15);
      String[] stringArray0 = new String[0];
      MethodWriter methodWriter0 = new MethodWriter(classWriter0, 1, "java/lang/String", "6IIr", "LineNumberTable", stringArray0, false, false);
      ByteVector byteVector0 = new ByteVector(7);
      ByteVector byteVector1 = byteVector0.putByte(1);
      methodWriter0.put(byteVector1);
      assertSame(byteVector0, byteVector1);
  }

  @Test(timeout = 4000)
  public void test36()  throws Throwable  {
      ClassWriter classWriter0 = mock(ClassWriter.class, new ViolatedAssumptionAnswer());
      doReturn(92, 92, 92, 92, (-4805)).when(classWriter0).newUTF8(anyString());
      MethodWriter methodWriter0 = new MethodWriter(classWriter0, 3, "Jn#X|)Ejzi(f2*s>B", "Jn#X|)Ejzi(f2*s>B", "Jn#X|)Ejzi(f2*s>B", (String[]) null, true, true);
      methodWriter0.visitIntInsn(1, 1313);
      ByteVector byteVector0 = new ByteVector(54);
      ByteVector byteVector1 = byteVector0.putUTF8("Jn#X|)Ejzi(f2*s>B");
      methodWriter0.put(byteVector1);
      assertSame(byteVector0, byteVector1);
  }

  @Test(timeout = 4000)
  public void test37()  throws Throwable  {
      ClassWriter classWriter0 = new ClassWriter(220);
      String[] stringArray0 = new String[3];
      stringArray0[0] = "";
      stringArray0[1] = "";
      stringArray0[2] = "";
      MethodWriter methodWriter0 = new MethodWriter(classWriter0, 2, "", "", "", stringArray0, false, false);
      methodWriter0.visitAnnotation("LocalVariableTable", false);
      methodWriter0.visitIntInsn(42, 131072);
      ByteVector byteVector0 = new ByteVector();
      ByteVector byteVector1 = byteVector0.putUTF8("R+N$v}*!Ky");
      methodWriter0.put(byteVector1);
      assertSame(byteVector0, byteVector1);
  }

  @Test(timeout = 4000)
  public void test38()  throws Throwable  {
      ClassWriter classWriter0 = new ClassWriter(15);
      String[] stringArray0 = new String[5];
      stringArray0[0] = "LineNumberTable";
      stringArray0[1] = "LineNumberTable";
      stringArray0[2] = "LineNumberTable";
      stringArray0[3] = "LineNumberTable";
      stringArray0[4] = "LineNumberTable";
      MethodWriter methodWriter0 = new MethodWriter(classWriter0, 15, "LineNumberTable", "Up/fuH#7Ch", "LineNumberTable", stringArray0, false, false);
      Label[] labelArray0 = new Label[1];
      methodWriter0.visitFrame(2, (-999), stringArray0, 116, labelArray0);
      assertEquals(5, stringArray0.length);
  }

  @Test(timeout = 4000)
  public void test39()  throws Throwable  {
      ClassWriter classWriter0 = mock(ClassWriter.class, new ViolatedAssumptionAnswer());
      doReturn(92, 92, 92, 0).when(classWriter0).newUTF8(anyString());
      MethodWriter methodWriter0 = new MethodWriter(classWriter0, 3, "Jn#X|)Ejzi(f2*s>B", "Jn#X|)Ejzi(f2*s>B", "Jn#X|)Ejzi(f2*s>B", (String[]) null, true, true);
      ByteVector byteVector0 = new ByteVector();
      methodWriter0.put(byteVector0);
  }
}
