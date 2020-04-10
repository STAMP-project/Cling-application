/*

 * Tue Mar 03 14:30:00 GMT 2020
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
import org.mockito.asm.MethodWriter;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = false, useJEE = true) 
public class MethodWriter_ESTest extends MethodWriter_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test00()  throws Throwable  {
      ClassWriter classWriter0 = new ClassWriter((-2365));
      classWriter0.newLong((-2365));
      String[] stringArray0 = new String[0];
      MethodWriter methodWriter0 = null;
      try {
        methodWriter0 = new MethodWriter(classWriter0, 1, "<init>", "EFFFFFFFFGGFFFGGFFFEEFGFGFEEEEEEEEEEEEEEEEEEEEDEDEDDDDDCDCDEEEEEEEEEEEEEEEEEEEEBABABBBBDCFFFGGGEDCDCDCDCDCDCDCDCDCDCEEEEDDDDDDDCDCDCEFEFDDEEFFDEDEEEBDDBBDDDDDDCCCCCCCCEFEDDDCDCDEEEEEEEEEEFEEEEEEDDEEDDEE", "JSR/RET are not supported with computeFrames option", stringArray0, true, true);
        fail("Expecting exception: StringIndexOutOfBoundsException");
      
      } catch(StringIndexOutOfBoundsException e) {
      }
  }

  @Test(timeout = 4000)
  public void test01()  throws Throwable  {
      ClassWriter classWriter0 = new ClassWriter((-988));
      MethodWriter methodWriter0 = new MethodWriter(classWriter0, (-988), "Signature", "Signature", "08pCl\tJ(1ms<6h", (String[]) null, false, false);
      MethodWriter methodWriter1 = new MethodWriter(classWriter0, 1, "$H0r.", "^')PJ;\",z>4A", "^')PJ;\",z>4A", (String[]) null, true, false);
      ByteVector byteVector0 = new ByteVector(1);
      ByteVector byteVector1 = byteVector0.put11(176, (-635));
      assertSame(byteVector0, byteVector1);
  }

  @Test(timeout = 4000)
  public void test02()  throws Throwable  {
      ClassWriter classWriter0 = new ClassWriter(59);
      MethodWriter methodWriter0 = new MethodWriter(classWriter0, (-1900), "[]", "3Gj)OuC0", "3Gj)OuC0", (String[]) null, true, false);
      methodWriter0.visitFieldInsn(1, "Ljava/lang/Synthetic;", "]rp", "Ht79B:m-");
  }

  @Test(timeout = 4000)
  public void test03()  throws Throwable  {
      ClassWriter classWriter0 = new ClassWriter((-1983));
      String[] stringArray0 = new String[4];
      stringArray0[0] = ":s*_]%7.?-";
      stringArray0[1] = ":s*_]%7.?-";
      stringArray0[2] = ":s*_]%7.?-";
      stringArray0[3] = "?hPE)]{vKa";
      MethodWriter methodWriter0 = new MethodWriter(classWriter0, 1, ":s*_]%7.?-", "?hPE)]{vKa", "dUU[f:Of", stringArray0, true, false);
      // Undeclared exception!
      try { 
        methodWriter0.visitMethodInsn(72, "?hPE)]{vKa", "PL9Wlm", ":s*_]%7.?-");
        fail("Expecting exception: StringIndexOutOfBoundsException");
      
      } catch(StringIndexOutOfBoundsException e) {
      }
  }

  @Test(timeout = 4000)
  public void test04()  throws Throwable  {
      ClassWriter classWriter0 = mock(ClassWriter.class, new ViolatedAssumptionAnswer());
      doReturn(0, 0).when(classWriter0).newClass(anyString());
      doReturn(378, 378).when(classWriter0).newUTF8(anyString());
      String[] stringArray0 = new String[2];
      MethodWriter methodWriter0 = new MethodWriter(classWriter0, 2, "", "", "", stringArray0, false, false);
      ByteVector byteVector0 = new ByteVector();
      ByteVector byteVector1 = byteVector0.putLong(378);
      assertSame(byteVector0, byteVector1);
  }

  @Test(timeout = 4000)
  public void test05()  throws Throwable  {
      ClassWriter classWriter0 = mock(ClassWriter.class, new ViolatedAssumptionAnswer());
      doReturn(16, 16).when(classWriter0).newClass(anyString());
      doReturn(378, 378).when(classWriter0).newUTF8(anyString());
      String[] stringArray0 = new String[2];
      MethodWriter methodWriter0 = new MethodWriter(classWriter0, 2, "", "", "", stringArray0, false, false);
      ByteVector byteVector0 = new ByteVector(1);
      ByteVector byteVector1 = byteVector0.putLong(378);
      assertSame(byteVector1, byteVector0);
  }

  @Test(timeout = 4000)
  public void test06()  throws Throwable  {
      ClassWriter classWriter0 = new ClassWriter(115);
      String[] stringArray0 = new String[1];
      stringArray0[0] = "JSR/RET are not supported with computeFrames option";
      MethodWriter methodWriter0 = new MethodWriter(classWriter0, 1, "JSR/RET are not supported with computeFrames option", "JSR/RET are not supported with computeFrames option", "JSR/RET are not supported with computeFrames option", stringArray0, false, false);
      methodWriter0.visitMethodInsn(2, " ^ /nTM_iW", "JSR/RET are not supported with computeFrames option", "JSR/RET are not supported with computeFrames option");
  }

  @Test(timeout = 4000)
  public void test07()  throws Throwable  {
      ClassWriter classWriter0 = new ClassWriter((-921));
      String[] stringArray0 = new String[0];
      MethodWriter methodWriter0 = new MethodWriter(classWriter0, (-921), "X.|", "X.|", "SourceDebugExtension", stringArray0, false, false);
      methodWriter0.visitFrame(167, 12, stringArray0, (-487), stringArray0);
      assertEquals(0, stringArray0.length);
  }

  @Test(timeout = 4000)
  public void test08()  throws Throwable  {
      ClassWriter classWriter0 = new ClassWriter(4);
      String[] stringArray0 = new String[2];
      stringArray0[0] = "ku\u0005i";
      stringArray0[1] = "RuntimeInvisibleParameterAnnotations";
      MethodWriter methodWriter0 = new MethodWriter(classWriter0, 13, "RuntimeInvisibleParameterAnnotations", "RuntimeInvisibleParameterAnnotations", "org.mockito.asm.ClassReader", stringArray0, false, false);
      methodWriter0.visitFieldInsn((-1864), "LSC=k&xfhuBLv4", "[Y3dZj2]4?*3_", "RuntimeInvisibleParameterAnnotations");
  }

  @Test(timeout = 4000)
  public void test09()  throws Throwable  {
      ClassWriter classWriter0 = new ClassWriter((-988));
      MethodWriter methodWriter0 = new MethodWriter(classWriter0, (-988), "Signature", "Signature", "08pCl\tJ(1ms<6h", (String[]) null, false, false);
      methodWriter0.visitFieldInsn((-988), "a~[m?C@D!]_F", "a~[m?C@D!]_F", "08pCl\tJ(1ms<6h");
  }

  @Test(timeout = 4000)
  public void test10()  throws Throwable  {
      ClassWriter classWriter0 = new ClassWriter((-1978));
      String[] stringArray0 = new String[1];
      stringArray0[0] = "org.mockito.asm.Edge";
      MethodWriter methodWriter0 = new MethodWriter(classWriter0, 72, ":s*_]%7.?-", "?hPE)]{vKa", "org.mockito.asm.Edge", stringArray0, true, true);
      MethodWriter methodWriter1 = new MethodWriter(classWriter0, 54, "vT6`}^?\"Ih3o@8?'$90", "2i,t*)Th#", "2i,t*)Th#", stringArray0, true, false);
      methodWriter1.classReaderOffset = 4;
      // Undeclared exception!
      try { 
        classWriter0.toByteArray();
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.mockito.asm.MethodWriter", e);
      }
  }

  @Test(timeout = 4000)
  public void test11()  throws Throwable  {
      Label label0 = mock(Label.class, new ViolatedAssumptionAnswer());
      ClassWriter classWriter0 = new ClassWriter((-988));
      MethodWriter methodWriter0 = new MethodWriter(classWriter0, 1, "$H0r.", "^')PJ;\",z>4z", "^')PJ;\",z>4z", (String[]) null, false, false);
      methodWriter0.visitLocalVariable("Ig2S", "08pCl\tJ(1ms<6h", "di_dY=~tDND5M]fR", label0, label0, 90);
  }

  @Test(timeout = 4000)
  public void test12()  throws Throwable  {
      ClassWriter classWriter0 = new ClassWriter((-921));
      String[] stringArray0 = new String[0];
      MethodWriter methodWriter0 = new MethodWriter(classWriter0, (-921), "LineNumberTable", "LineNumberTable", "SourceDebugExtension", stringArray0, false, false);
      methodWriter0.visitFrame(2, (-3570), stringArray0, 2, stringArray0);
      methodWriter0.visitFrame(2, 2, stringArray0, (-3570), stringArray0);
      assertEquals(0, stringArray0.length);
  }

  @Test(timeout = 4000)
  public void test13()  throws Throwable  {
      ClassWriter classWriter0 = new ClassWriter((-988));
      MethodWriter methodWriter0 = new MethodWriter(classWriter0, (-988), "Signature", "Signature", "08pCl\tJ(1ms<6h", (String[]) null, false, false);
      MethodWriter methodWriter1 = new MethodWriter(classWriter0, 1, "$H0r.", "^')PJ;\",z>4A", "^')PJ;\",z>4A", (String[]) null, true, false);
      methodWriter0.visitMethodInsn(2, "Ljava/lang/Synthetic;", "Ljava/lang/Synthetic;", "");
      assertFalse(methodWriter0.equals((Object)methodWriter1));
  }

  @Test(timeout = 4000)
  public void test14()  throws Throwable  {
      ClassWriter classWriter0 = mock(ClassWriter.class, new ViolatedAssumptionAnswer());
      doReturn(16777216, 16777216, 68).when(classWriter0).newClass(anyString());
      doReturn(16777216, 41).when(classWriter0).newUTF8(anyString());
      String[] stringArray0 = new String[3];
      MethodWriter methodWriter0 = new MethodWriter(classWriter0, 91, "byte", "byte", "org.mockito.asm.Frame", stringArray0, false, false);
      int[] intArray0 = new int[6];
      intArray0[2] = 16777216;
      int int0 = MethodWriter.getNewOffset(intArray0, intArray0, 16777216, 683);
      assertEquals((-33553749), int0);
  }

  @Test(timeout = 4000)
  public void test15()  throws Throwable  {
      ClassWriter classWriter0 = new ClassWriter((-1978));
      String[] stringArray0 = new String[1];
      stringArray0[0] = "value ";
      MethodWriter methodWriter0 = new MethodWriter(classWriter0, 1, "?hPE)]{vKa", "?hPE)]{vKa", "value ", stringArray0, true, false);
      MethodWriter methodWriter1 = new MethodWriter(classWriter0, 98, "?hPE)]{vKa", "?hPE)]{vKa", "org.mockito.asm.Frame", stringArray0, true, false);
      methodWriter1.visitInsn(58);
      assertFalse(methodWriter1.equals((Object)methodWriter0));
  }

  @Test(timeout = 4000)
  public void test16()  throws Throwable  {
      ClassWriter classWriter0 = new ClassWriter((-988));
      MethodWriter methodWriter0 = new MethodWriter(classWriter0, (-988), "Signature", "Signature", "08pCl\tJ(1ms<6h", (String[]) null, false, false);
      MethodWriter methodWriter1 = new MethodWriter(classWriter0, 1, "$H0r.", "^')PJ;\",z>4A", "^')PJ;\",z>4A", (String[]) null, false, false);
      methodWriter1.visitAnnotation(":sA<:_^/u+", false);
      byte[] byteArray0 = classWriter0.toByteArray();
      assertEquals(200, byteArray0.length);
  }

  @Test(timeout = 4000)
  public void test17()  throws Throwable  {
      ClassWriter classWriter0 = new ClassWriter((-1978));
      ByteVector byteVector0 = new ByteVector(2);
      ByteVector byteVector1 = byteVector0.putInt(247);
      byteVector1.put11(196, 247);
      String[] stringArray0 = new String[6];
      MethodWriter methodWriter0 = null;
      try {
        methodWriter0 = new MethodWriter(classWriter0, 196, "RuntimeVisibleParameterAnnotations", "RuntimeVisibleParameterAnnotations", "RuntimeVisibleParameterAnnotations", stringArray0, true, false);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
      }
  }

  @Test(timeout = 4000)
  public void test18()  throws Throwable  {
      ClassWriter classWriter0 = new ClassWriter((-1978));
      String[] stringArray0 = new String[1];
      stringArray0[0] = "org.mockito.asm.Edge";
      MethodWriter methodWriter0 = new MethodWriter(classWriter0, 72, ":s*_]%7.?-", "?hPE)]{vKa", "org.mockito.asm.Edge", stringArray0, true, true);
      methodWriter0.visitMethodInsn((-1786), "4AGC", ":s*_]%7.?-", "org.mockito.asm.Edge");
      MethodWriter methodWriter1 = null;
      try {
        methodWriter1 = new MethodWriter(classWriter0, (-1978), "?hPE)]{vKa", ":s*%7.?-", (String) null, stringArray0, true, false);
        fail("Expecting exception: StringIndexOutOfBoundsException");
      
      } catch(StringIndexOutOfBoundsException e) {
      }
  }

  @Test(timeout = 4000)
  public void test19()  throws Throwable  {
      ClassWriter classWriter0 = mock(ClassWriter.class, new ViolatedAssumptionAnswer());
      doReturn((-3373), 19, 3315, 196, 5).when(classWriter0).newClass(anyString());
      doReturn((-1885), 91).when(classWriter0).newUTF8(anyString());
      String[] stringArray0 = new String[5];
      MethodWriter methodWriter0 = new MethodWriter(classWriter0, 111, "UuMpG6", "UuMpG6", "UuMpG6", stringArray0, false, false);
      methodWriter0.visitFrame(1, (-3), stringArray0, (-1864), stringArray0);
      assertEquals(5, stringArray0.length);
  }

  @Test(timeout = 4000)
  public void test20()  throws Throwable  {
      ClassWriter classWriter0 = new ClassWriter(197);
      String[] stringArray0 = new String[2];
      stringArray0[0] = "ku$\u0005i";
      stringArray0[1] = "59OnT+%8FmJ@";
      MethodWriter methodWriter0 = new MethodWriter(classWriter0, 197, "59OnT+%8FmJ@", "59OnT+%8FmJ@", "ku$\u0005i", stringArray0, false, false);
      methodWriter0.visitVarInsn(197, (-2827));
      MethodWriter methodWriter1 = null;
      try {
        methodWriter1 = new MethodWriter(classWriter0, (-315), "|&", "ku$\u0005i", "C4pz jGa![h3E", stringArray0, true, true);
        fail("Expecting exception: StringIndexOutOfBoundsException");
      
      } catch(StringIndexOutOfBoundsException e) {
      }
  }

  @Test(timeout = 4000)
  public void test21()  throws Throwable  {
      ClassWriter classWriter0 = new ClassWriter(59);
      String[] stringArray0 = new String[0];
      MethodWriter methodWriter0 = new MethodWriter(classWriter0, 3651, "emP!{;xy3dBn", "emP!{;xy3dBn", "emP!{;xy3dBn", stringArray0, false, false);
      MethodWriter methodWriter1 = new MethodWriter(classWriter0, (-2274), "emP!{;xy3dBn", "emP!{;xy3dBn", "vl5", stringArray0, false, false);
      Label label0 = new Label();
      int[] intArray0 = new int[1];
      intArray0[0] = 59;
      MethodWriter.getNewOffset(intArray0, intArray0, label0);
      assertEquals(1, intArray0.length);
  }

  @Test(timeout = 4000)
  public void test22()  throws Throwable  {
      ClassWriter classWriter0 = mock(ClassWriter.class, new ViolatedAssumptionAnswer());
      doReturn(72).when(classWriter0).newClass(anyString());
      doReturn(72, 70, 70, 72, 72).when(classWriter0).newUTF8(anyString());
      String[] stringArray0 = new String[1];
      MethodWriter methodWriter0 = new MethodWriter(classWriter0, 1, "2i,t*)Th#", "2i,t*)Th#", "2i,t*)Th#", stringArray0, true, true);
      Label label0 = mock(Label.class, new ViolatedAssumptionAnswer());
      methodWriter0.visitLocalVariable("x", "2i,t*)Th#", "2i,t*)Th#", label0, label0, 1);
  }

  @Test(timeout = 4000)
  public void test23()  throws Throwable  {
      ClassWriter classWriter0 = new ClassWriter((-1983));
      String[] stringArray0 = new String[4];
      stringArray0[0] = ":s*%7.?-";
      stringArray0[1] = ":s*%7.?-";
      stringArray0[2] = ":s*%7.?-";
      stringArray0[3] = "?hPE)]{vKa";
      MethodWriter methodWriter0 = new MethodWriter(classWriter0, 1, ":s*%7.?-", "?hPE)]{vKa", ":s*%7.?-", stringArray0, true, false);
      methodWriter0.visitFieldInsn((-857), "?hPE)]{vKa", "?hPE)]{vKa", ":s*%7.?-");
      MethodWriter methodWriter1 = null;
      try {
        methodWriter1 = new MethodWriter(classWriter0, 3341, "MLuo!gT)d", "Signature", "_b+&Sk^", stringArray0, true, false);
        fail("Expecting exception: StringIndexOutOfBoundsException");
      
      } catch(StringIndexOutOfBoundsException e) {
      }
  }

  @Test(timeout = 4000)
  public void test24()  throws Throwable  {
      ClassWriter classWriter0 = new ClassWriter((-921));
      String[] stringArray0 = new String[0];
      MethodWriter methodWriter0 = new MethodWriter(classWriter0, (-921), "X.|", "X.|", "SourceDebugExtension", stringArray0, false, false);
      classWriter0.newFieldItem("X.|", "n-N}'1FMgT:", "n-N}'1FMgT:");
      MethodWriter methodWriter1 = new MethodWriter(classWriter0, 167, "?hPE)]{vKa", "L\"\u0002Y{e}@&&<P+", "AnnotationDefault", stringArray0, false, false);
      ByteVector byteVector0 = classWriter0.pool;
      ByteVector byteVector1 = byteVector0.putInt(1);
      assertSame(byteVector0, byteVector1);
  }

  @Test(timeout = 4000)
  public void test25()  throws Throwable  {
      ClassWriter classWriter0 = new ClassWriter((-921));
      String[] stringArray0 = new String[0];
      MethodWriter methodWriter0 = new MethodWriter(classWriter0, (-921), "X.|", "X.|", "SourceDebugExtension", stringArray0, false, false);
      methodWriter0.visitVarInsn((-693), 63);
  }

  @Test(timeout = 4000)
  public void test26()  throws Throwable  {
      ClassWriter classWriter0 = new ClassWriter((-988));
      MethodWriter methodWriter0 = new MethodWriter(classWriter0, (-988), "Signature", "Signature", "08pCl\tJ(1ms<6h", (String[]) null, false, false);
      Object[] objectArray0 = new Object[8];
      // Undeclared exception!
      try { 
        methodWriter0.visitFrame(4, 2, objectArray0, 248, objectArray0);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.mockito.asm.MethodWriter", e);
      }
  }

  @Test(timeout = 4000)
  public void test27()  throws Throwable  {
      ClassWriter classWriter0 = new ClassWriter((-1978));
      String[] stringArray0 = new String[2];
      stringArray0[0] = "org.mockito.asm.Edge";
      stringArray0[1] = ":s*_]%7.?-";
      MethodWriter methodWriter0 = new MethodWriter(classWriter0, 72, ":s*_]%7.?-", "?hPE)]{vKa", "org.mockito.asm.Edge", stringArray0, false, false);
      // Undeclared exception!
      try { 
        methodWriter0.visitFrame(1, 4, stringArray0, 17, stringArray0);
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // 2
         //
         verifyException("org.mockito.asm.MethodWriter", e);
      }
  }

  @Test(timeout = 4000)
  public void test28()  throws Throwable  {
      ClassWriter classWriter0 = new ClassWriter((-921));
      String[] stringArray0 = new String[0];
      MethodWriter methodWriter0 = new MethodWriter(classWriter0, (-921), "X.|", "X.|", "SourceDebugExtension", stringArray0, false, false);
      methodWriter0.visitFrame(1, (-1321), stringArray0, 692, stringArray0);
      assertEquals(0, stringArray0.length);
  }

  @Test(timeout = 4000)
  public void test29()  throws Throwable  {
      ClassWriter classWriter0 = new ClassWriter((-921));
      String[] stringArray0 = new String[0];
      MethodWriter methodWriter0 = new MethodWriter(classWriter0, (-921), "X.|", "X.|", "SourceDebugExtension", stringArray0, false, false);
      MethodWriter methodWriter1 = new MethodWriter(classWriter0, 167, "?hPE)]{vKa", "L\"\u0002Y{e}@&&<P+", "AnnotationDefault", stringArray0, false, false);
      ByteVector byteVector0 = classWriter0.pool;
      classWriter0.version = (-470);
      methodWriter0.put(byteVector0);
      assertFalse(methodWriter0.equals((Object)methodWriter1));
  }

  @Test(timeout = 4000)
  public void test30()  throws Throwable  {
      ClassWriter classWriter0 = new ClassWriter((-988));
      MethodWriter methodWriter0 = new MethodWriter(classWriter0, (-988), "Signature", "BKdU{1+", "08pCl\tJ(1ms<6h", (String[]) null, false, false);
      MethodWriter methodWriter1 = new MethodWriter(classWriter0, 14, "org.mockito.asm.Edge", "a", "08pCl\tJ(1ms<6h", (String[]) null, false, false);
      methodWriter0.visitVarInsn(14, 1488);
      assertFalse(methodWriter0.equals((Object)methodWriter1));
  }

  @Test(timeout = 4000)
  public void test31()  throws Throwable  {
      ClassWriter classWriter0 = new ClassWriter((-921));
      String[] stringArray0 = new String[0];
      MethodWriter methodWriter0 = new MethodWriter(classWriter0, (-921), ".", ".", "SourceDebugExtension", stringArray0, false, false);
      ClassWriter classWriter1 = new ClassWriter(1);
      classWriter1.newFieldItem(".", "n-N}'1FMgT:", "n-N}'1FMgT:");
      MethodWriter methodWriter1 = new MethodWriter(classWriter0, 167, "?hPE)]{vKa", "L\"\u0002Y{e}@&&<P+", "AnnotationDefault", stringArray0, false, false);
      ByteVector byteVector0 = classWriter1.pool;
      ByteVector byteVector1 = byteVector0.put12((-2120), 15);
      ByteVector byteVector2 = byteVector1.putInt(1);
      methodWriter0.put(byteVector0);
      assertSame(byteVector0, byteVector2);
  }

  @Test(timeout = 4000)
  public void test32()  throws Throwable  {
      ClassWriter classWriter0 = new ClassWriter((-988));
      MethodWriter methodWriter0 = new MethodWriter(classWriter0, (-988), "Signature", "Signature", "08pCl\tJ(1ms<6h", (String[]) null, false, false);
      MethodWriter methodWriter1 = new MethodWriter(classWriter0, 1, "$H0r.", "^')PJ;\",z>4A", "^')PJ;\",z>4A", (String[]) null, true, false);
      methodWriter0.visitAnnotationDefault();
      byte[] byteArray0 = classWriter0.toByteArray();
      assertEquals(171, byteArray0.length);
  }

  @Test(timeout = 4000)
  public void test33()  throws Throwable  {
      ClassWriter classWriter0 = mock(ClassWriter.class, new ViolatedAssumptionAnswer());
      doReturn(0, 0).when(classWriter0).newUTF8(anyString());
      String[] stringArray0 = new String[0];
      MethodWriter methodWriter0 = null;
      try {
        methodWriter0 = new MethodWriter(classWriter0, 1, "?hPE)]{vKa", "}Q^,<k=LkE]", "}Q^,<k=LkE]", stringArray0, true, true);
        fail("Expecting exception: StringIndexOutOfBoundsException");
      
      } catch(StringIndexOutOfBoundsException e) {
      }
  }

  @Test(timeout = 4000)
  public void test34()  throws Throwable  {
      ClassWriter classWriter0 = new ClassWriter(0);
      String[] stringArray0 = new String[2];
      int[] intArray0 = new int[1];
      intArray0[0] = 2;
      MethodWriter.getNewOffset(intArray0, intArray0, 1, 734);
      MethodWriter methodWriter0 = null;
      try {
        methodWriter0 = new MethodWriter(classWriter0, (-1072), "ku\u0005i", "Z6|", "vl5", stringArray0, false, false);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
      }
  }

  @Test(timeout = 4000)
  public void test35()  throws Throwable  {
      ClassWriter classWriter0 = new ClassWriter(197);
      String[] stringArray0 = new String[2];
      stringArray0[0] = "ku\u0005i";
      stringArray0[1] = "RuntimeInvisibleParameterAnnotations";
      MethodWriter methodWriter0 = new MethodWriter(classWriter0, 197, "RuntimeInvisibleParameterAnnotations", "RuntimeInvisibleParameterAnnotations", "ku\u0005i", stringArray0, false, false);
      ByteVector byteVector0 = new ByteVector();
      methodWriter0.visitAnnotationDefault();
      methodWriter0.put(byteVector0);
  }

  @Test(timeout = 4000)
  public void test36()  throws Throwable  {
      ClassWriter classWriter0 = new ClassWriter((-1978));
      String[] stringArray0 = new String[2];
      stringArray0[0] = "org.mockito.asm.Edge";
      stringArray0[1] = ":s*_]%7.?-";
      MethodWriter methodWriter0 = null;
      try {
        methodWriter0 = new MethodWriter(classWriter0, 16, "EFFFFFFFFGGFFFGGFFFEEFGFGFEEEEEEEEEEEEEEEEEEEEDEDEDDDDDCDCDEEEEEEEEEEEEEEEEEEEEBABABBBBDCFFFGGGEDCDCDCDCDCDCDCDCDCDCEEEEDDDDDDDCDCDCEFEFDDEEFFDEDEEEBDDBBDDDDDDCCCCCCCCEFEDDDCDCDEEEEEEEEEEFEEEEEEDDEEDDEE", "UuMpG6", "org.mockito.asm.Edge", stringArray0, true, true);
        fail("Expecting exception: StringIndexOutOfBoundsException");
      
      } catch(StringIndexOutOfBoundsException e) {
      }
  }

  @Test(timeout = 4000)
  public void test37()  throws Throwable  {
      ClassWriter classWriter0 = new ClassWriter(0);
      String[] stringArray0 = new String[2];
      stringArray0[0] = "ku\u0005i";
      stringArray0[1] = "RuntimeInvisibleParameterAnnotations";
      MethodWriter methodWriter0 = new MethodWriter(classWriter0, 0, "RuntimeInvisibleParameterAnnotations", "RuntimeInvisibleParameterAnnotations", "7", stringArray0, false, false);
      methodWriter0.visitFrame(0, (-715), stringArray0, 0, stringArray0);
      assertEquals(2, stringArray0.length);
  }

  @Test(timeout = 4000)
  public void test38()  throws Throwable  {
      ClassWriter classWriter0 = new ClassWriter(0);
      String[] stringArray0 = new String[2];
      stringArray0[0] = "ku\u0005i";
      stringArray0[1] = "RuntimeInvisibleParameterAnnotations";
      MethodWriter methodWriter0 = new MethodWriter(classWriter0, 0, "RuntimeInvisibleParameterAnnotations", "RuntimeInvisibleParameterAnnotations", "7", stringArray0, false, false);
      methodWriter0.visitInsn(314);
  }

  @Test(timeout = 4000)
  public void test39()  throws Throwable  {
      ClassWriter classWriter0 = new ClassWriter(78);
      String[] stringArray0 = new String[0];
      MethodWriter methodWriter0 = new MethodWriter(classWriter0, (-1827), "emP!{;xy3dBn", "emP!{;xy3dBn", "emP!{;xy3dBn", stringArray0, false, false);
      methodWriter0.visitInsn(1);
  }

  @Test(timeout = 4000)
  public void test40()  throws Throwable  {
      int[] intArray0 = new int[4];
      MethodWriter.getNewOffset(intArray0, intArray0, 60, (-1025));
      ClassWriter classWriter0 = mock(ClassWriter.class, new ViolatedAssumptionAnswer());
      doReturn(0, 0).when(classWriter0).newClass(anyString());
      doReturn(0, 0).when(classWriter0).newUTF8(anyString());
      String[] stringArray0 = new String[2];
      MethodWriter methodWriter0 = null;
      try {
        methodWriter0 = new MethodWriter(classWriter0, 0, "vl5", (String) null, (String) null, stringArray0, false, true);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.mockito.asm.MethodWriter", e);
      }
  }

  @Test(timeout = 4000)
  public void test41()  throws Throwable  {
      ClassWriter classWriter0 = new ClassWriter((-988));
      MethodWriter methodWriter0 = new MethodWriter(classWriter0, 1, "$H0r.", "^')PJ;\",z>4z", "^')PJ;\",z>4z", (String[]) null, true, false);
      methodWriter0.visitVarInsn(90, 73);
  }

  @Test(timeout = 4000)
  public void test42()  throws Throwable  {
      ClassWriter classWriter0 = new ClassWriter(78);
      String[] stringArray0 = new String[0];
      MethodWriter methodWriter0 = new MethodWriter(classWriter0, (-1827), "emP!{;xy3dBn", "emP!{;xy3dBn", "emP!{;xy3dBn", stringArray0, false, false);
      methodWriter0.classReaderOffset = (-481);
      // Undeclared exception!
      try { 
        classWriter0.toByteArray();
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.mockito.asm.MethodWriter", e);
      }
  }

  @Test(timeout = 4000)
  public void test43()  throws Throwable  {
      ClassWriter classWriter0 = new ClassWriter((-1978));
      String[] stringArray0 = new String[4];
      stringArray0[0] = "Ljava/lang/Synthetic;";
      stringArray0[1] = "dUU[f:Of";
      stringArray0[2] = "`";
      stringArray0[3] = "?hPE)]{vKa";
      MethodWriter methodWriter0 = new MethodWriter(classWriter0, 1, "`", "?hPE)]{vKa", "dUU[f:Of", stringArray0, true, false);
      methodWriter0.visitVarInsn(84, 173);
  }

  @Test(timeout = 4000)
  public void test44()  throws Throwable  {
      ClassWriter classWriter0 = new ClassWriter((-1978));
      String[] stringArray0 = new String[4];
      stringArray0[0] = ":s*_]%7.?-";
      stringArray0[1] = ":s*_]%7.?-";
      stringArray0[2] = ":s*_]%7.?-";
      stringArray0[3] = "?hPE)]{vKa";
      MethodWriter methodWriter0 = new MethodWriter(classWriter0, 1, ":s*_]%7.?-", "?hPE)]{vKa", "dUU[f:Of", stringArray0, true, false);
      methodWriter0.visitLdcInsn("?hPE)]{vKa");
  }

  @Test(timeout = 4000)
  public void test45()  throws Throwable  {
      ClassWriter classWriter0 = new ClassWriter((-2365));
      String[] stringArray0 = new String[1];
      stringArray0[0] = "Deprecate";
      MethodWriter methodWriter0 = new MethodWriter(classWriter0, 1, "JSR/RET are not supported with computeFrames option", "Deprecate", "JSR/RET are not supported with computeFrames option", stringArray0, false, false);
      methodWriter0.visitFrame(3, 3537, stringArray0, 2, stringArray0);
      assertEquals(1, stringArray0.length);
  }

  @Test(timeout = 4000)
  public void test46()  throws Throwable  {
      ClassWriter classWriter0 = new ClassWriter(4);
      String[] stringArray0 = new String[2];
      stringArray0[0] = "ku\u0005i";
      stringArray0[1] = "RuntimeInvisibleParameterAnnotations";
      MethodWriter methodWriter0 = new MethodWriter(classWriter0, 13, "RuntimeInvisibleParameterAnnotations", "RuntimeInvisibleParameterAnnotations", (String) null, stringArray0, false, false);
      ByteVector byteVector0 = new ByteVector();
      methodWriter0.put(byteVector0);
      MethodWriter methodWriter1 = null;
      try {
        methodWriter1 = new MethodWriter(classWriter0, 13, "java/lang/String", "4~@L1#S.y,FVa", "RuntimeInvisibleParameterAnnotations", stringArray0, false, true);
        fail("Expecting exception: StringIndexOutOfBoundsException");
      
      } catch(StringIndexOutOfBoundsException e) {
      }
  }

  @Test(timeout = 4000)
  public void test47()  throws Throwable  {
      ClassWriter classWriter0 = new ClassWriter((-1978));
      String[] stringArray0 = new String[2];
      stringArray0[0] = "org.mockito.asm.Edge";
      stringArray0[1] = ":s*_]%7.?-";
      MethodWriter methodWriter0 = new MethodWriter(classWriter0, 334, ",Q/d:0%5,>*Wo{u3Rn", "6)V:6#j-tQ.uv0:A3", ":s*_]%7.?-", stringArray0, false, false);
      methodWriter0.visitMaxs((-889275714), 63);
  }

  @Test(timeout = 4000)
  public void test48()  throws Throwable  {
      ClassWriter classWriter0 = new ClassWriter((-921));
      String[] stringArray0 = new String[0];
      MethodWriter methodWriter0 = new MethodWriter(classWriter0, (-921), "X.|", "X.|", "SourceDebugExtension", stringArray0, false, false);
      methodWriter0.visitMaxs(1, 63);
  }

  @Test(timeout = 4000)
  public void test49()  throws Throwable  {
      ClassWriter classWriter0 = new ClassWriter((-1978));
      String[] stringArray0 = new String[1];
      stringArray0[0] = "org.mockito.asm.Edge";
      MethodWriter methodWriter0 = new MethodWriter(classWriter0, 72, ":s*_]%7.?-", "?hPE)]{vKa", "org.mockito.asm.Edge", stringArray0, true, true);
      methodWriter0.visitVarInsn(2, (-1978));
  }

  @Test(timeout = 4000)
  public void test50()  throws Throwable  {
      ClassWriter classWriter0 = new ClassWriter(59);
      String[] stringArray0 = new String[0];
      MethodWriter methodWriter0 = new MethodWriter(classWriter0, 3651, "emP!{;xy3dBn", "emP!{;xy3dBn", "emP!{;xy3dBn", stringArray0, false, false);
      int int0 = methodWriter0.getSize();
      assertEquals(16, int0);
      
      methodWriter0.visitLdcInsn("emP!{;xy3dBn");
      int int1 = classWriter0.newMethod("emP!{;xy3dBn", "Ljava/lang/Synthetic;", "emP!{;xy3dBn", false);
      assertEquals(7, int1);
  }

  @Test(timeout = 4000)
  public void test51()  throws Throwable  {
      ClassWriter classWriter0 = new ClassWriter(78);
      String[] stringArray0 = new String[0];
      MethodWriter methodWriter0 = new MethodWriter(classWriter0, (-1827), "emP!{;xy3dBn", "emP!{;xy3dBn", "emP!{;xy3dBn", stringArray0, false, false);
      classWriter0.newLong((-1827));
      MethodWriter methodWriter1 = new MethodWriter(classWriter0, 91, "{7pl %S!f0Pmr", "Fg/E*]y@Qpu", "{7pl %S!f0Pmr", stringArray0, false, false);
      assertFalse(methodWriter1.equals((Object)methodWriter0));
  }

  @Test(timeout = 4000)
  public void test52()  throws Throwable  {
      ClassWriter classWriter0 = new ClassWriter(59);
      String[] stringArray0 = new String[0];
      MethodWriter methodWriter0 = new MethodWriter(classWriter0, 3651, "emP!{;xy3dBn", "emP!{;xy3dBn", "emP!{;xy3dBn", stringArray0, false, false);
      ByteVector byteVector0 = new ByteVector(1);
      byteVector0.putLong(3651);
      MethodWriter methodWriter1 = null;
      try {
        methodWriter1 = new MethodWriter(classWriter0, 3651, "?hPE)]{vKa", "I", "Ljava/lang/Synthetic;", stringArray0, true, true);
        fail("Expecting exception: StringIndexOutOfBoundsException");
      
      } catch(StringIndexOutOfBoundsException e) {
      }
  }

  @Test(timeout = 4000)
  public void test53()  throws Throwable  {
      ClassWriter classWriter0 = new ClassWriter((-1978));
      String[] stringArray0 = new String[4];
      stringArray0[0] = ":s*_]%7.?-";
      stringArray0[1] = ":s*_]%7.?-";
      stringArray0[2] = ":s*_]%7.?-";
      stringArray0[3] = "?hPE)]{vKa";
      MethodWriter methodWriter0 = new MethodWriter(classWriter0, 1, ":s*_]%7.?-", "?hPE)]{vKa", "dUU[f:Of", stringArray0, true, false);
      Label label0 = new Label();
      methodWriter0.visitLabel(label0);
      MethodWriter methodWriter1 = new MethodWriter(classWriter0, 1, "AVg=z<z7r&jy-\"4", "?hPE)]{vKa", "a+&m8O+`9B\u0006C", stringArray0, true, true);
      methodWriter0.visitMaxs(1, 72);
      assertFalse(methodWriter0.equals((Object)methodWriter1));
  }

  @Test(timeout = 4000)
  public void test54()  throws Throwable  {
      ClassWriter classWriter0 = new ClassWriter((-988));
      MethodWriter methodWriter0 = new MethodWriter(classWriter0, (-988), "Signature", "Signature", "08pCl\tJ(1ms<6h", (String[]) null, false, false);
      MethodWriter methodWriter1 = new MethodWriter(classWriter0, 1, "$H0r.", "^')PJ;\",z>4A", "^')PJ;\",z>4A", (String[]) null, true, false);
      methodWriter0.visitVarInsn((-1988), 41);
      assertFalse(methodWriter0.equals((Object)methodWriter1));
  }

  @Test(timeout = 4000)
  public void test55()  throws Throwable  {
      ClassWriter classWriter0 = new ClassWriter((-1978));
      String[] stringArray0 = new String[4];
      stringArray0[0] = ":s*_]%7.?-";
      stringArray0[1] = ":s*_]%7.?-";
      stringArray0[2] = ":s*_]%7.?-";
      stringArray0[3] = "?hPE)]{vKa";
      MethodWriter methodWriter0 = new MethodWriter(classWriter0, 1, ":s*_]%7.?-", "?hPE)]{vKa", "dUU[f:Of", stringArray0, true, false);
      methodWriter0.visitFrame(4, 4, stringArray0, 2764, stringArray0);
      assertEquals(4, stringArray0.length);
  }

  @Test(timeout = 4000)
  public void test56()  throws Throwable  {
      ClassWriter classWriter0 = new ClassWriter((-988));
      MethodWriter methodWriter0 = new MethodWriter(classWriter0, (-988), "Signature", "Signature", "08pCl\tJ(1ms<6h", (String[]) null, false, false);
      MethodWriter methodWriter1 = new MethodWriter(classWriter0, 1, "$H0r.", "^')PJ;\",z>4A", "^')PJ;\",z>4A", (String[]) null, true, false);
      methodWriter1.visitVarInsn(37, (-988));
      assertFalse(methodWriter1.equals((Object)methodWriter0));
  }

  @Test(timeout = 4000)
  public void test57()  throws Throwable  {
      ClassWriter classWriter0 = new ClassWriter((-1983));
      String[] stringArray0 = new String[4];
      stringArray0[0] = ":s*%7.?-";
      stringArray0[1] = ":s*%7.?-";
      stringArray0[2] = ":s*%7.?-";
      stringArray0[3] = "?hPE)]{vKa";
      MethodWriter methodWriter0 = new MethodWriter(classWriter0, 1, ":s*%7.?-", "?hPE)]{vKa", ":s*%7.?-", stringArray0, true, false);
      methodWriter0.visitFieldInsn((-857), "?hPE)]{vKa", "?hPE)]{vKa", ":s*%7.?-");
      byte[] byteArray0 = classWriter0.toByteArray();
      assertEquals(149, byteArray0.length);
  }

  @Test(timeout = 4000)
  public void test58()  throws Throwable  {
      ClassWriter classWriter0 = new ClassWriter((-1978));
      String[] stringArray0 = new String[1];
      stringArray0[0] = "org.mockito.asm.Edge";
      MethodWriter methodWriter0 = new MethodWriter(classWriter0, 72, ":s*_]%7.?-", "?hPE)]{vKa", "org.mockito.asm.Edge", stringArray0, true, true);
      MethodWriter methodWriter1 = new MethodWriter(classWriter0, 1024, "Exceptions", "n-N}'1FMgT:", "vT6`}^?\"Ih3o@8?'$90", (String[]) null, false, false);
      byte[] byteArray0 = classWriter0.toByteArray();
      assertEquals(179, byteArray0.length);
  }

  @Test(timeout = 4000)
  public void test59()  throws Throwable  {
      ClassWriter classWriter0 = new ClassWriter(4);
      String[] stringArray0 = new String[2];
      stringArray0[0] = "ku\u0005i";
      stringArray0[1] = "RuntimeInvisibleParameterAnnotations";
      MethodWriter methodWriter0 = new MethodWriter(classWriter0, 13, "RuntimeInvisibleParameterAnnotations", "RuntimeInvisibleParameterAnnotations", "org.mockito.asm.ClassReader", stringArray0, false, false);
      ByteVector byteVector0 = new ByteVector();
      methodWriter0.put(byteVector0);
      String[] stringArray1 = new String[0];
      MethodWriter methodWriter1 = new MethodWriter(classWriter0, 1, "YkIaEHcJ|;uV", "MPr}I*By_O+s", "org.mockito.asm.ClassReader", stringArray1, false, false);
      assertFalse(methodWriter1.equals((Object)methodWriter0));
  }

  @Test(timeout = 4000)
  public void test60()  throws Throwable  {
      ClassWriter classWriter0 = new ClassWriter((-1978));
      ByteVector byteVector0 = new ByteVector(2);
      byteVector0.putInt(247);
      String[] stringArray0 = new String[8];
      stringArray0[0] = "ku\u0005i";
      stringArray0[1] = "ku\u0005i";
      stringArray0[2] = "`axRzLizH)Q";
      stringArray0[3] = "ku\u0005i";
      stringArray0[4] = "[]";
      stringArray0[5] = "ku\u0005i";
      stringArray0[6] = "[]";
      stringArray0[7] = "ku\u0005i";
      MethodWriter methodWriter0 = null;
      try {
        methodWriter0 = new MethodWriter(classWriter0, 247, "ku\u0005i", "[]", "[]", stringArray0, false, true);
        fail("Expecting exception: StringIndexOutOfBoundsException");
      
      } catch(StringIndexOutOfBoundsException e) {
      }
  }

  @Test(timeout = 4000)
  public void test61()  throws Throwable  {
      ClassWriter classWriter0 = new ClassWriter((-1978));
      String[] stringArray0 = new String[2];
      stringArray0[0] = "org.mockito.asm.Edge";
      stringArray0[1] = ":s*_]%7.?-";
      MethodWriter methodWriter0 = new MethodWriter(classWriter0, (-513), ",Q/d:0%5,>*Wo{u3Rn", "6)V:6#j-tQ.uv0:A3", ":s*_]%7.?-", stringArray0, false, true);
      MethodWriter methodWriter1 = new MethodWriter(classWriter0, 334, ",Q/d:0%5,>*Wo{u3Rn", "6)V:6#j-tQ.uv0:A3", ":s*_]%7.?-", stringArray0, false, false);
      methodWriter0.visitMaxs(76, 166);
      assertFalse(methodWriter0.equals((Object)methodWriter1));
  }

  @Test(timeout = 4000)
  public void test62()  throws Throwable  {
      ClassWriter classWriter0 = new ClassWriter(59);
      String[] stringArray0 = new String[2];
      stringArray0[0] = "PUr";
      stringArray0[1] = "PUr";
      MethodWriter methodWriter0 = new MethodWriter(classWriter0, 3, "PUr", "PUr", "PUr", stringArray0, false, false);
      methodWriter0.visitIincInsn(1, (-4700));
  }

  @Test(timeout = 4000)
  public void test63()  throws Throwable  {
      ClassWriter classWriter0 = new ClassWriter((-1983));
      String[] stringArray0 = new String[4];
      stringArray0[0] = ":s*%7.?-";
      stringArray0[1] = ":s*%7.?-";
      stringArray0[2] = ":s*%7.?-";
      stringArray0[3] = "?hPE)]{vKa";
      MethodWriter methodWriter0 = new MethodWriter(classWriter0, 1, ":s*%7.?-", "?hPE)]{vKa", ":s*%7.?-", stringArray0, true, false);
      methodWriter0.visitIincInsn((-1983), 3341);
  }

  @Test(timeout = 4000)
  public void test64()  throws Throwable  {
      ClassWriter classWriter0 = new ClassWriter(78);
      String[] stringArray0 = new String[0];
      MethodWriter methodWriter0 = new MethodWriter(classWriter0, 1, "", "6)V:6#j-tQ.uv0:A3", "~c='t:=4z'", stringArray0, true, false);
      methodWriter0.visitIincInsn(66, (-513));
  }

  @Test(timeout = 4000)
  public void test65()  throws Throwable  {
      ClassWriter classWriter0 = new ClassWriter(197);
      String[] stringArray0 = new String[2];
      stringArray0[0] = "ku\u0005i";
      stringArray0[1] = "RuntimeInvisibleParameterAnnotations";
      MethodWriter methodWriter0 = new MethodWriter(classWriter0, 197, "RuntimeInvisibleParameterAnnotations", "RuntimeInvisibleParameterAnnotations", "ku\u0005i", stringArray0, false, false);
      Label label0 = new Label();
      methodWriter0.visitJumpInsn(197, label0);
      methodWriter0.visitLocalVariable("3[#(5", "ku\u0005i", "RuntimeVisibleParameterAnnotations", label0, label0, 197);
      ByteVector byteVector0 = new ByteVector();
      methodWriter0.put(byteVector0);
  }

  @Test(timeout = 4000)
  public void test66()  throws Throwable  {
      ClassWriter classWriter0 = new ClassWriter(78);
      String[] stringArray0 = new String[0];
      MethodWriter methodWriter0 = new MethodWriter(classWriter0, (-1827), "emP!{;xy3dBn", "emP!{;xy3dBn", "emP!{;xy3dBn", stringArray0, false, false);
      methodWriter0.visitIincInsn(1, 2);
      classWriter0.toByteArray();
      MethodWriter methodWriter1 = null;
      try {
        methodWriter1 = new MethodWriter(classWriter0, 1, "emP!{;xy3dBn", "emP!{;xy3dBn", "emP!{;xy3dBn", stringArray0, false, true);
        fail("Expecting exception: StringIndexOutOfBoundsException");
      
      } catch(StringIndexOutOfBoundsException e) {
      }
  }

  @Test(timeout = 4000)
  public void test67()  throws Throwable  {
      ClassWriter classWriter0 = new ClassWriter((-921));
      String[] stringArray0 = new String[0];
      MethodWriter methodWriter0 = new MethodWriter(classWriter0, (-921), "X.|", "X.|", "SourceDebugExtension", stringArray0, false, false);
      int int0 = MethodWriter.getArgumentsAndReturnSizes("?hPE)]{vKa");
      assertEquals(17, int0);
  }

  @Test(timeout = 4000)
  public void test68()  throws Throwable  {
      ClassWriter classWriter0 = new ClassWriter((-988));
      MethodWriter methodWriter0 = new MethodWriter(classWriter0, (-988), "Signature", "Signature", "08pCl\tJ(1ms<6h", (String[]) null, false, false);
      MethodWriter methodWriter1 = new MethodWriter(classWriter0, 1, "$H0r.", "^')PJ;\",z>4A", "^')PJ;\",z>4A", (String[]) null, true, false);
      methodWriter1.visitAnnotation(":sA<:_^/u+", true);
      classWriter0.toByteArray();
      // Undeclared exception!
      try { 
        methodWriter1.visitMethodInsn(823, "08pCl\tJ(1ms<6h", "Signature", ":sA<:_^/u+");
        fail("Expecting exception: StringIndexOutOfBoundsException");
      
      } catch(StringIndexOutOfBoundsException e) {
      }
  }

  @Test(timeout = 4000)
  public void test69()  throws Throwable  {
      ClassWriter classWriter0 = mock(ClassWriter.class, new ViolatedAssumptionAnswer());
      doReturn(16, 16, 8).when(classWriter0).newClass(anyString());
      doReturn(378, 378, 8, 16, 30).when(classWriter0).newUTF8(anyString());
      String[] stringArray0 = new String[2];
      MethodWriter methodWriter0 = new MethodWriter(classWriter0, 2, "", "", "", stringArray0, false, false);
      Label label0 = mock(Label.class, new ViolatedAssumptionAnswer());
      methodWriter0.visitTryCatchBlock(label0, label0, label0, "");
      Label label1 = mock(Label.class, new ViolatedAssumptionAnswer());
      methodWriter0.visitJumpInsn(0, label1);
      ByteVector byteVector0 = new ByteVector();
      methodWriter0.put(byteVector0);
  }

  @Test(timeout = 4000)
  public void test70()  throws Throwable  {
      ClassWriter classWriter0 = new ClassWriter((-1978));
      String[] stringArray0 = new String[2];
      stringArray0[0] = "org.mockito.asm.Edge";
      stringArray0[1] = ":s*_]%7.?-";
      MethodWriter methodWriter0 = new MethodWriter(classWriter0, (-513), ",Q/d:0%5,>*Wo{u3Rn", "6)V:6#j-tQ.uv0:A3", ":s*_]%7.?-", stringArray0, false, true);
      MethodWriter methodWriter1 = new MethodWriter(classWriter0, 334, ",Q/d:0%5,>*Wo{u3Rn", "6)V:6#j-tQ.uv0:A3", ":s*_]%7.?-", stringArray0, false, false);
      methodWriter0.visitIincInsn(1, 63);
      assertFalse(methodWriter0.equals((Object)methodWriter1));
  }

  @Test(timeout = 4000)
  public void test71()  throws Throwable  {
      ClassWriter classWriter0 = new ClassWriter((-988));
      MethodWriter methodWriter0 = new MethodWriter(classWriter0, (-988), "Signature", "Signature", "08pCl\tJ(1ms<6h", (String[]) null, false, false);
      MethodWriter methodWriter1 = new MethodWriter(classWriter0, 1, "$H0r.", "^')PJ;\",z>4A", "^')PJ;\",z>4A", (String[]) null, true, false);
      methodWriter1.visitIincInsn(101, 268435455);
      methodWriter1.visitIincInsn(9, 19);
      assertFalse(methodWriter1.equals((Object)methodWriter0));
  }

  @Test(timeout = 4000)
  public void test72()  throws Throwable  {
      ClassWriter classWriter0 = new ClassWriter((-921));
      String[] stringArray0 = new String[0];
      MethodWriter methodWriter0 = new MethodWriter(classWriter0, (-921), ".", ".", "SourceDebugExtension", stringArray0, false, false);
      classWriter0.toByteArray();
      MethodWriter methodWriter1 = new MethodWriter(classWriter0, 167, "?hPE)]{vKa", "L\"\u0002Y{e}@&&<P+", "AnnotationDefault", stringArray0, false, false);
      assertFalse(methodWriter1.equals((Object)methodWriter0));
  }

  @Test(timeout = 4000)
  public void test73()  throws Throwable  {
      ClassWriter classWriter0 = new ClassWriter((-1978));
      classWriter0.newFieldItem("RuntimeInvisibleParameterAnnotations", ":s*_]%7.?-", ":s*_]%7.?-");
      String[] stringArray0 = new String[8];
      stringArray0[0] = "RuntimeInvisibleParameterAnnotations";
      stringArray0[1] = "RuntimeInvisibleParameterAnnotations";
      stringArray0[2] = "0:";
      stringArray0[3] = ":s*_]%7.?-";
      stringArray0[4] = ":s*_]%7.?-";
      stringArray0[5] = "org.mockito.asm.Edge";
      stringArray0[6] = "org.mockito.asm.Edge";
      stringArray0[7] = "org.mockito.asm.Edge";
      MethodWriter methodWriter0 = null;
      try {
        methodWriter0 = new MethodWriter(classWriter0, 72, "RuntimeInvisibleParameterAnnotations", ":s*_]%7.?-", "hXN+#.l*J;(V(~~", stringArray0, true, true);
        fail("Expecting exception: StringIndexOutOfBoundsException");
      
      } catch(StringIndexOutOfBoundsException e) {
      }
  }

  @Test(timeout = 4000)
  public void test74()  throws Throwable  {
      ClassWriter classWriter0 = new ClassWriter((-921));
      String[] stringArray0 = new String[0];
      MethodWriter methodWriter0 = new MethodWriter(classWriter0, (-921), "X.|", "X.|", "SourceDebugExtension", stringArray0, false, false);
      // Undeclared exception!
      try { 
        methodWriter0.visitFrame(0, 1, stringArray0, 256, stringArray0);
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // 0
         //
         verifyException("org.mockito.asm.MethodWriter", e);
      }
  }

  @Test(timeout = 4000)
  public void test75()  throws Throwable  {
      ClassWriter classWriter0 = new ClassWriter((-1978));
      String[] stringArray0 = new String[2];
      stringArray0[0] = "org.mockito.asm.Edge";
      stringArray0[1] = ":s*_]%7.?-";
      MethodWriter methodWriter0 = new MethodWriter(classWriter0, (-513), ",Q/d:0%5,>*Wo{u3Rn", "6)V:6#j-tQ.uv0:A3", ":s*_]%7.?-", stringArray0, false, true);
      byte[] byteArray0 = classWriter0.toByteArray();
      assertEquals(198, byteArray0.length);
  }
}
