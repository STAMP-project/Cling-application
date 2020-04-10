/*

 * Tue Mar 03 14:30:25 GMT 2020
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
      ClassWriter classWriter0 = new ClassWriter(1398);
      MethodWriter methodWriter0 = null;
      try {
        methodWriter0 = new MethodWriter(classWriter0, 19, "-px*^a7;r;\";?gyte|", "java/lang/Throwable", "1!Signature", (String[]) null, true, true);
        fail("Expecting exception: StringIndexOutOfBoundsException");
      
      } catch(StringIndexOutOfBoundsException e) {
      }
  }

  @Test(timeout = 4000)
  public void test01()  throws Throwable  {
      int[] intArray0 = new int[1];
      intArray0[0] = 187;
      int int0 = MethodWriter.getNewOffset(intArray0, intArray0, 173, 187);
      assertEquals(201, int0);
  }

  @Test(timeout = 4000)
  public void test02()  throws Throwable  {
      ClassWriter classWriter0 = new ClassWriter((-1206));
      String[] stringArray0 = new String[1];
      stringArray0[0] = "v*i6uZN*>|JE ";
      MethodWriter methodWriter0 = new MethodWriter(classWriter0, 285212674, "v*i6uZN*>|JE ", "v*i6uZN*>|JE ", "Label offset position has not been resolved yet", stringArray0, false, false);
      MethodWriter methodWriter1 = new MethodWriter(classWriter0, 285212674, "v*i6uZN*>|JE ", "v*i6uZN*>|JE ", "Code", stringArray0, false, false);
      methodWriter0.visitIincInsn(16777226, 26);
      assertNotSame(methodWriter0, methodWriter1);
  }

  @Test(timeout = 4000)
  public void test03()  throws Throwable  {
      ClassWriter classWriter0 = new ClassWriter(1968);
      String[] stringArray0 = new String[1];
      stringArray0[0] = "ch,2a`c_$E&Wm";
      MethodWriter methodWriter0 = new MethodWriter(classWriter0, 2, "kzmy[i*gO* 1M_|n", "GUirCOEQ<|", "kzmy[i*gO* 1M_|n", stringArray0, false, false);
      Item item0 = classWriter0.newDouble(465);
      assertNotNull(item0);
  }

  @Test(timeout = 4000)
  public void test04()  throws Throwable  {
      ClassWriter classWriter0 = new ClassWriter((byte) (-89));
      classWriter0.newDouble(1.0);
      String[] stringArray0 = new String[0];
      MethodWriter methodWriter0 = new MethodWriter(classWriter0, (byte) (-89), "z", "5*Yr3:XyY-,Sh&", (String) null, stringArray0, false, false);
  }

  @Test(timeout = 4000)
  public void test05()  throws Throwable  {
      Label label0 = new Label();
      label0.status = (-1172);
      int[] intArray0 = new int[0];
      MethodWriter.getNewOffset(intArray0, intArray0, label0);
      assertEquals(0, intArray0.length);
  }

  @Test(timeout = 4000)
  public void test06()  throws Throwable  {
      ClassWriter classWriter0 = new ClassWriter(168);
      String[] stringArray0 = new String[1];
      stringArray0[0] = "7RPuf`:";
      MethodWriter methodWriter0 = new MethodWriter(classWriter0, 168, "7RPuf`:", "Code", "7RPuf`:", stringArray0, false, false);
      methodWriter0.visitFieldInsn(1, "", "-px*^a7;r;\";?gyte|", "7RPuf`:");
  }

  @Test(timeout = 4000)
  public void test07()  throws Throwable  {
      ClassWriter classWriter0 = new ClassWriter(55);
      MethodWriter methodWriter0 = new MethodWriter(classWriter0, (byte) (-1), "`{IJk;M ;VOy!f?", "`{IJk;M ;VOy!f?", "`{IJk;M ;VOy!f?", (String[]) null, false, false);
      methodWriter0.visitFieldInsn((byte) (-1), "CM*DKOI:-AtQmtjkh]", "N,xl", "`{IJk;M ;VOy!f?");
  }

  @Test(timeout = 4000)
  public void test08()  throws Throwable  {
      ClassWriter classWriter0 = new ClassWriter(17);
      MethodWriter methodWriter0 = new MethodWriter(classWriter0, 54, "", "<init>", "<init>", (String[]) null, false, false);
      methodWriter0.visitFrame(123, 1398, (Object[]) null, 31, (Object[]) null);
      methodWriter0.visitFrame(1398, 1, (Object[]) null, 1398, (Object[]) null);
  }

  @Test(timeout = 4000)
  public void test09()  throws Throwable  {
      int[] intArray0 = new int[1];
      MethodWriter.getNewOffset(intArray0, intArray0, 119, (-2384));
      ClassWriter classWriter0 = mock(ClassWriter.class, new ViolatedAssumptionAnswer());
      doReturn(0, 0).when(classWriter0).newUTF8(anyString());
      String[] stringArray0 = new String[0];
      MethodWriter methodWriter0 = null;
      try {
        methodWriter0 = new MethodWriter(classWriter0, 2, "5[6 9", "", (String) null, stringArray0, true, false);
        fail("Expecting exception: StringIndexOutOfBoundsException");
      
      } catch(StringIndexOutOfBoundsException e) {
      }
  }

  @Test(timeout = 4000)
  public void test10()  throws Throwable  {
      ClassWriter classWriter0 = mock(ClassWriter.class, new ViolatedAssumptionAnswer());
      doReturn(1968, 66, 66).when(classWriter0).newClass(anyString());
      doReturn(1968, 1968).when(classWriter0).newUTF8(anyString());
      String[] stringArray0 = new String[3];
      MethodWriter methodWriter0 = new MethodWriter(classWriter0, 66, "0f:NX)2+/,|?", "P[)*{(%=TH^uePcC@@Y", "int", stringArray0, true, true);
      methodWriter0.visitIincInsn(425, 425);
  }

  @Test(timeout = 4000)
  public void test11()  throws Throwable  {
      String[] stringArray0 = new String[0];
      ClassWriter classWriter0 = new ClassWriter(32);
      MethodWriter methodWriter0 = new MethodWriter(classWriter0, 35, "M=xLg+U", "xSU)?wNxMzws", "n8&bgPW6e)~&W{", stringArray0, false, true);
      // Undeclared exception!
      try { 
        methodWriter0.visitMaxs(1, 1075);
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // 12
         //
         verifyException("org.mockito.asm.Type", e);
      }
  }

  @Test(timeout = 4000)
  public void test12()  throws Throwable  {
      ClassWriter classWriter0 = new ClassWriter(18);
      String[] stringArray0 = new String[3];
      stringArray0[0] = "GUirCOEQ<|";
      stringArray0[1] = "$?q/Ig%UNnGL+;";
      stringArray0[2] = "9~4$&)V*V";
      MethodWriter methodWriter0 = new MethodWriter(classWriter0, 21, "GUirCOEQ<|", "9~4$&)V*V", (String) null, stringArray0, false, true);
      methodWriter0.visitFieldInsn((-209), "^X</SPpjhwz>e)zZ4", "int", "$?q/Ig%UNnGL+;");
  }

  @Test(timeout = 4000)
  public void test13()  throws Throwable  {
      ClassWriter classWriter0 = mock(ClassWriter.class, new ViolatedAssumptionAnswer());
      doReturn(0, 0, 0, 0, 0).when(classWriter0).newClass(anyString());
      doReturn((-3645), 1052).when(classWriter0).newUTF8(anyString());
      String[] stringArray0 = new String[7];
      MethodWriter methodWriter0 = new MethodWriter(classWriter0, (-473), "0f:NX)2+/,|?", "0f:NX)2+/,|?", "<c8,~sk@bxL", stringArray0, true, true);
      // Undeclared exception!
      try { 
        methodWriter0.visitMaxs((-397), (-3645));
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // 12
         //
         verifyException("org.mockito.asm.Type", e);
      }
  }

  @Test(timeout = 4000)
  public void test14()  throws Throwable  {
      ClassWriter classWriter0 = new ClassWriter(17);
      String[] stringArray0 = new String[5];
      stringArray0[0] = "E-cI/I+qf|H#SU$[";
      stringArray0[1] = "java/lang/String";
      stringArray0[2] = "java/lang/String";
      stringArray0[3] = "~4/";
      stringArray0[4] = "java/lang/String";
      MethodWriter methodWriter0 = new MethodWriter(classWriter0, (-1592), "java/lang/String", "6j", "6j", stringArray0, false, false);
      methodWriter0.visitFrame(2, 1643, stringArray0, 14, stringArray0);
      assertEquals(5, stringArray0.length);
  }

  @Test(timeout = 4000)
  public void test15()  throws Throwable  {
      ClassWriter classWriter0 = new ClassWriter(1982);
      String[] stringArray0 = new String[3];
      stringArray0[0] = "GUirCOEQ<|";
      stringArray0[1] = "CJ}K#tRY_ve1jCiC*X";
      stringArray0[2] = "9~4&)V*V";
      MethodWriter methodWriter0 = new MethodWriter(classWriter0, 1982, "n8&bgPW6e)~&W{", "9~4&)V*V", "Signature", stringArray0, true, false);
      // Undeclared exception!
      try { 
        methodWriter0.visitMethodInsn((-1271), "->^\"~O ", "[]", "GUirCOEQ<|");
        fail("Expecting exception: StringIndexOutOfBoundsException");
      
      } catch(StringIndexOutOfBoundsException e) {
      }
  }

  @Test(timeout = 4000)
  public void test16()  throws Throwable  {
      ClassWriter classWriter0 = new ClassWriter(1398);
      MethodWriter methodWriter0 = new MethodWriter(classWriter0, 7, "`SfJ|S", "GUirCOEQ<|", "Signature", (String[]) null, false, false);
      MethodWriter methodWriter1 = new MethodWriter(classWriter0, (-909), "`SfJ|S", "Ljava/lang/Synthetic;", "StackMap", (String[]) null, false, false);
      methodWriter0.visitVarInsn(1105, 1);
      assertNotSame(methodWriter0, methodWriter1);
  }

  @Test(timeout = 4000)
  public void test17()  throws Throwable  {
      ClassWriter classWriter0 = new ClassWriter(1968);
      String[] stringArray0 = new String[3];
      stringArray0[0] = "GUirCOEQ<|";
      stringArray0[1] = "int";
      stringArray0[2] = "9~4&)V*V";
      MethodWriter methodWriter0 = new MethodWriter(classWriter0, 1968, "ch,2a`c_$E&Wm", "ch,2a`c_$E&Wm", "int", stringArray0, false, false);
      Label label0 = new Label();
      MethodWriter methodWriter1 = new MethodWriter(classWriter0, (-642), "O2;w`w~", "int", "i`HigTGaP(b|f sOoV", stringArray0, false, false);
      int[] intArray0 = new int[5];
      intArray0[0] = 80;
      MethodWriter.getNewOffset(intArray0, intArray0, label0);
      assertEquals(5, intArray0.length);
  }

  @Test(timeout = 4000)
  public void test18()  throws Throwable  {
      ClassWriter classWriter0 = new ClassWriter(63);
      String[] stringArray0 = new String[1];
      stringArray0[0] = "7RPuf`:";
      MethodWriter methodWriter0 = new MethodWriter(classWriter0, 63, "7RPuf`:", "7RPuf`:", "7RPuf`:", stringArray0, false, false);
      methodWriter0.visitLdcInsn("org.mockito.asm.ClassWriter");
      String[] stringArray1 = new String[0];
      MethodWriter methodWriter1 = new MethodWriter(classWriter0, 3269, "#CHz@2{0N@@{If{`", "long", "7RPuf`:", stringArray1, false, false);
      assertFalse(methodWriter1.equals((Object)methodWriter0));
  }

  @Test(timeout = 4000)
  public void test19()  throws Throwable  {
      int[] intArray0 = new int[5];
      MethodWriter.getNewOffset(intArray0, intArray0, 5366, (-3));
      ClassWriter classWriter0 = new ClassWriter(5366);
      String[] stringArray0 = new String[5];
      stringArray0[0] = "StackMap";
      stringArray0[1] = "Ljava/lang/Synthetic;";
      stringArray0[2] = "Ljava/lang/Synthetic;";
      stringArray0[3] = "StackMap";
      stringArray0[4] = "Ljava/lang/Synthetic;";
      MethodWriter methodWriter0 = null;
      try {
        methodWriter0 = new MethodWriter(classWriter0, (-14328), "StackMap", "StackMap", "StackMap", stringArray0, true, true);
        fail("Expecting exception: StringIndexOutOfBoundsException");
      
      } catch(StringIndexOutOfBoundsException e) {
      }
  }

  @Test(timeout = 4000)
  public void test20()  throws Throwable  {
      String[] stringArray0 = new String[0];
      ByteVector byteVector0 = new ByteVector(1);
      byteVector0.putInt(197);
      ClassWriter classWriter0 = new ClassWriter(32);
      MethodWriter methodWriter0 = new MethodWriter(classWriter0, 35, "M=xLg+U", "xSU)?wNxMzws", "n8&bgPW6e)~&W{", stringArray0, false, true);
      MethodWriter methodWriter1 = new MethodWriter(classWriter0, 32, "M)+Kkrdsr:<", "xSU)?wNxMzws", "org.mockito.asm.ClassWriter", stringArray0, false, false);
      assertFalse(methodWriter1.equals((Object)methodWriter0));
  }

  @Test(timeout = 4000)
  public void test21()  throws Throwable  {
      String[] stringArray0 = new String[0];
      ByteVector byteVector0 = new ByteVector(1);
      byteVector0.put11(197, 197);
      ClassWriter classWriter0 = new ClassWriter(32);
      MethodWriter methodWriter0 = new MethodWriter(classWriter0, 35, "M=xLg+U", "xSU)?wNxMzws", "n8&bgPW6e)~&W{", stringArray0, false, true);
  }

  @Test(timeout = 4000)
  public void test22()  throws Throwable  {
      ClassWriter classWriter0 = mock(ClassWriter.class, new ViolatedAssumptionAnswer());
      doReturn((-1592), 35).when(classWriter0).newUTF8(anyString());
      String[] stringArray0 = new String[0];
      MethodWriter methodWriter0 = new MethodWriter(classWriter0, 2, "[]", "org.mockito.asm.Label", "[]", stringArray0, false, false);
      ByteVector byteVector0 = new ByteVector(1);
      ByteVector byteVector1 = byteVector0.put11(197, 197);
      assertSame(byteVector1, byteVector0);
  }

  @Test(timeout = 4000)
  public void test23()  throws Throwable  {
      ClassWriter classWriter0 = mock(ClassWriter.class, new ViolatedAssumptionAnswer());
      doReturn(76, (-2653)).when(classWriter0).newUTF8(anyString());
      String[] stringArray0 = new String[0];
      MethodWriter methodWriter0 = new MethodWriter(classWriter0, 2, "[]", "org.mockito.asm.Label", "[]", stringArray0, false, false);
      // Undeclared exception!
      try { 
        methodWriter0.visitFrame(1, 2, stringArray0, 4542, stringArray0);
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // 0
         //
         verifyException("org.mockito.asm.MethodWriter", e);
      }
  }

  @Test(timeout = 4000)
  public void test24()  throws Throwable  {
      ClassWriter classWriter0 = mock(ClassWriter.class, new ViolatedAssumptionAnswer());
      doReturn((-1592), 35).when(classWriter0).newUTF8(anyString());
      String[] stringArray0 = new String[0];
      MethodWriter methodWriter0 = new MethodWriter(classWriter0, 2, "[]", "org.mockit9.asm.Labe{", "[]", stringArray0, false, false);
      methodWriter0.visitFrame(1, (-262), stringArray0, 305, stringArray0);
      assertEquals(0, stringArray0.length);
  }

  @Test(timeout = 4000)
  public void test25()  throws Throwable  {
      ClassWriter classWriter0 = new ClassWriter(18);
      String[] stringArray0 = new String[2];
      stringArray0[0] = "4{9|hGfN";
      stringArray0[1] = "GUirCOEQ<|";
      MethodWriter methodWriter0 = new MethodWriter(classWriter0, 194, "GUirCOEQ<|", "c;h,{ac_$E&Wm", "4{9|hGfN", stringArray0, false, false);
      MethodWriter methodWriter1 = new MethodWriter(classWriter0, 202, "D,K|b6Ff^]B-/{(~", "cnjLATZ", "q8oLF!Ew!", stringArray0, false, false);
      methodWriter0.visitVarInsn(97, 1514);
      assertNotSame(methodWriter0, methodWriter1);
  }

  @Test(timeout = 4000)
  public void test26()  throws Throwable  {
      ClassWriter classWriter0 = mock(ClassWriter.class, new ViolatedAssumptionAnswer());
      doReturn((-1592), 35, 35, 35).when(classWriter0).newUTF8(anyString());
      String[] stringArray0 = new String[0];
      MethodWriter methodWriter0 = new MethodWriter(classWriter0, 2, "[]", "org.mockito.asm.Label", "[]", stringArray0, false, false);
      ByteVector byteVector0 = new ByteVector(1);
      methodWriter0.put(byteVector0);
      ClassReader classReader0 = new ClassReader("org.mockito.asm.Label");
      ClassWriter classWriter1 = new ClassWriter(classReader0, 4);
      Attribute[] attributeArray0 = new Attribute[0];
      classReader0.accept((ClassVisitor) classWriter1, attributeArray0, 184);
      assertEquals(2, ClassWriter.COMPUTE_FRAMES);
  }

  @Test(timeout = 4000)
  public void test27()  throws Throwable  {
      ClassWriter classWriter0 = mock(ClassWriter.class, new ViolatedAssumptionAnswer());
      doReturn(0, 0, 0).when(classWriter0).newClass(anyString());
      doReturn((-1592), 35).when(classWriter0).newUTF8(anyString());
      String[] stringArray0 = new String[3];
      MethodWriter methodWriter0 = null;
      try {
        methodWriter0 = new MethodWriter(classWriter0, (-1592), "M=xLg+U", "org.mockito.asm.Label", "cLsu[w&}h~N<-", stringArray0, true, true);
        fail("Expecting exception: StringIndexOutOfBoundsException");
      
      } catch(StringIndexOutOfBoundsException e) {
      }
  }

  @Test(timeout = 4000)
  public void test28()  throws Throwable  {
      ClassWriter classWriter0 = new ClassWriter(2888);
      String[] stringArray0 = new String[0];
      MethodWriter methodWriter0 = null;
      try {
        methodWriter0 = new MethodWriter(classWriter0, 1, "Ljava/lang/Synthetic;", "?Mj'LRk#lEF$", "Fet[", stringArray0, true, false);
        fail("Expecting exception: StringIndexOutOfBoundsException");
      
      } catch(StringIndexOutOfBoundsException e) {
      }
  }

  @Test(timeout = 4000)
  public void test29()  throws Throwable  {
      ClassWriter classWriter0 = new ClassWriter(63);
      String[] stringArray0 = new String[1];
      stringArray0[0] = "7RPuf`:";
      MethodWriter methodWriter0 = new MethodWriter(classWriter0, 63, "7RPuf`:", "7RPuf`:", "7RPuf`:", stringArray0, false, false);
      methodWriter0.getSize();
      String[] stringArray1 = new String[0];
      MethodWriter methodWriter1 = new MethodWriter(classWriter0, 3269, "#CHz@2{0N@@{If{`", "long", "7RPuf`:", stringArray1, false, false);
      assertFalse(methodWriter1.equals((Object)methodWriter0));
  }

  @Test(timeout = 4000)
  public void test30()  throws Throwable  {
      ClassWriter classWriter0 = new ClassWriter((-1206));
      String[] stringArray0 = new String[1];
      stringArray0[0] = "v*i6uZN*>|JE ";
      MethodWriter methodWriter0 = new MethodWriter(classWriter0, 285212674, "v*i6uZN*>|JE ", "v*i6uZN*>|JE ", "Label offset position has not been resolved yet", stringArray0, false, false);
      methodWriter0.visitInsn(110);
  }

  @Test(timeout = 4000)
  public void test31()  throws Throwable  {
      String[] stringArray0 = new String[0];
      int[] intArray0 = new int[8];
      intArray0[0] = 1;
      Label label0 = mock(Label.class, new ViolatedAssumptionAnswer());
      MethodWriter.getNewOffset(intArray0, intArray0, label0);
      ClassWriter classWriter0 = new ClassWriter((-716));
      MethodWriter methodWriter0 = null;
      try {
        methodWriter0 = new MethodWriter(classWriter0, 0, "GUirCOEQ;|", "", "Q~2p", stringArray0, false, true);
        fail("Expecting exception: StringIndexOutOfBoundsException");
      
      } catch(StringIndexOutOfBoundsException e) {
      }
  }

  @Test(timeout = 4000)
  public void test32()  throws Throwable  {
      ClassWriter classWriter0 = mock(ClassWriter.class, new ViolatedAssumptionAnswer());
      doReturn((-3645), 1052).when(classWriter0).newUTF8(anyString());
      String[] stringArray0 = new String[0];
      MethodWriter methodWriter0 = new MethodWriter(classWriter0, (-473), "0f:NX)2+/,|?", "0f:NX)2+/,|?", "<c8,~sk@bxL", stringArray0, true, true);
      methodWriter0.visitInsn(102);
  }

  @Test(timeout = 4000)
  public void test33()  throws Throwable  {
      ClassWriter classWriter0 = mock(ClassWriter.class, new ViolatedAssumptionAnswer());
      doReturn((-1592), 35).when(classWriter0).newUTF8(anyString());
      String[] stringArray0 = new String[0];
      MethodWriter methodWriter0 = new MethodWriter(classWriter0, 2, "[]", "org.mockito.asm.Label", "[]", stringArray0, false, false);
      methodWriter0.classReaderOffset = 79;
      ByteVector byteVector0 = new ByteVector(1);
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
  public void test34()  throws Throwable  {
      ClassWriter classWriter0 = new ClassWriter(35);
      String[] stringArray0 = new String[2];
      stringArray0[0] = "E$[fxPwf}N^$?bcGk";
      stringArray0[1] = "9~4&)V*V";
      MethodWriter methodWriter0 = new MethodWriter(classWriter0, (-1592), "9~4&)V*V", "RuntimeVisibleParameterAnnotations", "E$[fxPwf}N^$?bcGk", stringArray0, false, false);
      methodWriter0.visitMaxs(35, (-1));
  }

  @Test(timeout = 4000)
  public void test35()  throws Throwable  {
      ClassWriter classWriter0 = mock(ClassWriter.class, new ViolatedAssumptionAnswer());
      doReturn((-1592), 35).when(classWriter0).newUTF8(anyString());
      String[] stringArray0 = new String[0];
      MethodWriter methodWriter0 = new MethodWriter(classWriter0, (-1592), "org.mockito.asm.Label", "${lH1)!*", "7RPuf`:", stringArray0, true, false);
      // Undeclared exception!
      try { 
        methodWriter0.visitVarInsn((-1592), 35);
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // -1592
         //
         verifyException("org.mockito.asm.MethodWriter", e);
      }
  }

  @Test(timeout = 4000)
  public void test36()  throws Throwable  {
      ClassWriter classWriter0 = new ClassWriter(1969);
      String[] stringArray0 = new String[3];
      stringArray0[0] = "GUirCOEQ<|";
      stringArray0[1] = "$?q/Ig%UNnGL+;";
      stringArray0[2] = "9~4$&)V*V";
      MethodWriter methodWriter0 = new MethodWriter(classWriter0, (-1359), "c;h,{ac_$E&Wm", "0f:NX)2+/,|?", "0f:NX)2+/,|?", stringArray0, true, true);
      // Undeclared exception!
      try { 
        methodWriter0.visitInsn((-1359));
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.mockito.asm.Frame", e);
      }
  }

  @Test(timeout = 4000)
  public void test37()  throws Throwable  {
      ClassWriter classWriter0 = new ClassWriter(168);
      String[] stringArray0 = new String[1];
      stringArray0[0] = "7RPuf`:";
      MethodWriter methodWriter0 = new MethodWriter(classWriter0, 168, "7RPuf`:", "7RPuf`:", "7RPuf`:", stringArray0, false, false);
      MethodWriter methodWriter1 = new MethodWriter(classWriter0, 2, ".class", "7RPuf`:", ")V", stringArray0, false, false);
      methodWriter0.getSize();
      methodWriter0.visitMethodInsn(20, ";", "7RPuf`:", "~&");
      assertNotSame(methodWriter0, methodWriter1);
  }

  @Test(timeout = 4000)
  public void test38()  throws Throwable  {
      ClassWriter classWriter0 = mock(ClassWriter.class, new ViolatedAssumptionAnswer());
      doReturn((-1592), 35).when(classWriter0).newUTF8(anyString());
      String[] stringArray0 = new String[0];
      MethodWriter methodWriter0 = new MethodWriter(classWriter0, 2, "[]", "org.mockito.asm.Label", "[]", stringArray0, false, false);
      ByteVector byteVector0 = new ByteVector(1);
      ByteVector byteVector1 = byteVector0.put12((-321), 1);
      assertSame(byteVector0, byteVector1);
  }

  @Test(timeout = 4000)
  public void test39()  throws Throwable  {
      ClassWriter classWriter0 = mock(ClassWriter.class, new ViolatedAssumptionAnswer());
      doReturn(668).when(classWriter0).newClass(anyString());
      doReturn((-1592), 35, 35, 35, 871).when(classWriter0).newUTF8(anyString());
      String[] stringArray0 = new String[1];
      MethodWriter methodWriter0 = new MethodWriter(classWriter0, 2, "[]", "org.mockito.asm.Label", "[]", stringArray0, false, false);
      methodWriter0.visitAnnotation("org.mockito.asm.Label", false);
      ByteVector byteVector0 = new ByteVector();
      methodWriter0.put(byteVector0);
  }

  @Test(timeout = 4000)
  public void test40()  throws Throwable  {
      ClassWriter classWriter0 = mock(ClassWriter.class, new ViolatedAssumptionAnswer());
      doReturn((-1592), (-1592), (-1592), (-1592), 871).when(classWriter0).newUTF8(anyString());
      String[] stringArray0 = new String[0];
      MethodWriter methodWriter0 = new MethodWriter(classWriter0, 2, "[]", "org.mockito.asm.Label", "[]", stringArray0, false, false);
      methodWriter0.visitAnnotation("org.mockito.asm.Label", false);
      ByteVector byteVector0 = new ByteVector();
      methodWriter0.put(byteVector0);
  }

  @Test(timeout = 4000)
  public void test41()  throws Throwable  {
      ClassWriter classWriter0 = new ClassWriter(1398);
      MethodWriter methodWriter0 = new MethodWriter(classWriter0, 7, "`SfJ|S", "GUirCOEQ<|", "1!Signature", (String[]) null, false, false);
      classWriter0.newDouble(1398);
      MethodWriter methodWriter1 = null;
      try {
        methodWriter1 = new MethodWriter(classWriter0, 19, "-px*^a7;r;\";?gyte|", "java/lang/Throwable", "1!Signature", (String[]) null, true, true);
        fail("Expecting exception: StringIndexOutOfBoundsException");
      
      } catch(StringIndexOutOfBoundsException e) {
      }
  }

  @Test(timeout = 4000)
  public void test42()  throws Throwable  {
      ClassWriter classWriter0 = mock(ClassWriter.class, new ViolatedAssumptionAnswer());
      doReturn(668).when(classWriter0).newClass(anyString());
      doReturn((-1592), 35, 35, 35, 871).when(classWriter0).newUTF8(anyString());
      String[] stringArray0 = new String[1];
      MethodWriter methodWriter0 = new MethodWriter(classWriter0, 2, "[]", "org.mockito.asm.Label", "[]", stringArray0, false, false);
      methodWriter0.visitFrame(35, (-1592), stringArray0, 268435456, stringArray0);
      Label label0 = new Label();
      Label[] labelArray0 = new Label[0];
      methodWriter0.visitTableSwitchInsn(668, 255, label0, labelArray0);
      ByteVector byteVector0 = new ByteVector();
      methodWriter0.put(byteVector0);
  }

  @Test(timeout = 4000)
  public void test43()  throws Throwable  {
      ClassWriter classWriter0 = new ClassWriter((-1206));
      String[] stringArray0 = new String[1];
      stringArray0[0] = "v*i6uZN*>|JE ";
      MethodWriter methodWriter0 = new MethodWriter(classWriter0, 285212674, "v*i6uZN*>|JE ", "v*i6uZN*>|JE ", "Label offset position has not been resolved yet", stringArray0, false, false);
      MethodWriter methodWriter1 = new MethodWriter(classWriter0, 285212674, "v*i6uZN*>|JE ", "v*i6uZN*>|JE ", "Code", stringArray0, false, false);
      methodWriter0.visitVarInsn((-1788), 41);
      assertNotSame(methodWriter0, methodWriter1);
  }

  @Test(timeout = 4000)
  public void test44()  throws Throwable  {
      ClassWriter classWriter0 = mock(ClassWriter.class, new ViolatedAssumptionAnswer());
      doReturn(1968, 7, 7).when(classWriter0).newClass(anyString());
      doReturn(1968, 1968, 7, 7, 1968).when(classWriter0).newUTF8(anyString());
      String[] stringArray0 = new String[3];
      MethodWriter methodWriter0 = new MethodWriter(classWriter0, 1968, "int", "P[)*{(%=TH^uePcC@@Y", "int", stringArray0, true, true);
      ByteVector byteVector0 = new ByteVector(185);
      methodWriter0.put(byteVector0);
  }

  @Test(timeout = 4000)
  public void test45()  throws Throwable  {
      ClassWriter classWriter0 = mock(ClassWriter.class, new ViolatedAssumptionAnswer());
      doReturn((-3645), 0, 0, 0).when(classWriter0).newClass(anyString());
      doReturn((-3645), 1052).when(classWriter0).newUTF8(anyString());
      String[] stringArray0 = new String[4];
      MethodWriter methodWriter0 = new MethodWriter(classWriter0, 1379, "lbwMe", "lbwMe", "Kjw5x3qsn?;F8P#", stringArray0, false, false);
      // Undeclared exception!
      try { 
        methodWriter0.visitFrame(4, 1183, stringArray0, 54, stringArray0);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.mockito.asm.MethodWriter", e);
      }
  }

  @Test(timeout = 4000)
  public void test46()  throws Throwable  {
      ClassWriter classWriter0 = new ClassWriter(1398);
      MethodWriter methodWriter0 = new MethodWriter(classWriter0, 2, "`SfJ|S", "GUirCOEQ<|", "1!Signature", (String[]) null, false, false);
      MethodWriter methodWriter1 = null;
      try {
        methodWriter1 = new MethodWriter(classWriter0, 19, "-px*^a7;r;\";?gyte|", "cnjLATZ", "1!Signature", (String[]) null, false, true);
        fail("Expecting exception: StringIndexOutOfBoundsException");
      
      } catch(StringIndexOutOfBoundsException e) {
      }
  }

  @Test(timeout = 4000)
  public void test47()  throws Throwable  {
      ClassWriter classWriter0 = new ClassWriter(1398);
      MethodWriter methodWriter0 = new MethodWriter(classWriter0, 2, "`SfJ|S", "GUirCOEQ<|", "1!Signature", (String[]) null, false, false);
      methodWriter0.visitAnnotation("EFFFFFFFFGGFFFGGFFFEEFGFGFEEEEEEEEEEEEEEEEEEEEDEDEDDDDDCDCDEEEEEEEEEEEEEEEEEEEEBABABBBBDCFFFGGGEDCDCDCDCDCDCDCDCDCDCEEEEDDDDDDDCDCDCEFEFDDEEFFDEDEEEBDDBBDDDDDDCCCCCCCCEFEDDDCDCDEEEEEEEEEEFEEEEEEDDEEDDEE", true);
      classWriter0.toByteArray();
      MethodWriter methodWriter1 = null;
      try {
        methodWriter1 = new MethodWriter(classWriter0, 19, "-px*^a7;r;\";?gyte|", "cnjLATZ", "1!Signature", (String[]) null, false, true);
        fail("Expecting exception: StringIndexOutOfBoundsException");
      
      } catch(StringIndexOutOfBoundsException e) {
      }
  }

  @Test(timeout = 4000)
  public void test48()  throws Throwable  {
      ClassWriter classWriter0 = mock(ClassWriter.class, new ViolatedAssumptionAnswer());
      doReturn(1968, 66, 66).when(classWriter0).newClass(anyString());
      doReturn(1968, 1968, 7, 66, 799).when(classWriter0).newUTF8(anyString());
      String[] stringArray0 = new String[3];
      MethodWriter methodWriter0 = new MethodWriter(classWriter0, 66, "0f:NX)2+/,|?", "P[)*{(%=TH^uePcC@@Y", "int", stringArray0, true, true);
      methodWriter0.visitIntInsn(1, 49);
      int int0 = methodWriter0.getSize();
      assertEquals(50, int0);
  }

  @Test(timeout = 4000)
  public void test49()  throws Throwable  {
      String[] stringArray0 = new String[0];
      ClassWriter classWriter0 = new ClassWriter((-2725));
      MethodWriter methodWriter0 = new MethodWriter(classWriter0, 2, "|I)`fvM\"y;T9", "JrbcX", "JrbcX", stringArray0, false, false);
      methodWriter0.visitTypeInsn(50331648, "|I)`fvM\"y;T9");
      int int0 = methodWriter0.getSize();
      assertEquals(37, int0);
  }

  @Test(timeout = 4000)
  public void test50()  throws Throwable  {
      ClassWriter classWriter0 = new ClassWriter(1398);
      MethodWriter methodWriter0 = new MethodWriter(classWriter0, 7, "`SfJ|S", "GUirCOEQ<|", "Signature", (String[]) null, false, false);
      ByteVector byteVector0 = new ByteVector();
      methodWriter0.put(byteVector0);
      String[] stringArray0 = new String[2];
      MethodWriter methodWriter1 = null;
      try {
        methodWriter1 = new MethodWriter(classWriter0, 1, "-px*^a7;r;\";?gyte|", "Code", "Code", stringArray0, false, true);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
      }
  }

  @Test(timeout = 4000)
  public void test51()  throws Throwable  {
      ClassWriter classWriter0 = new ClassWriter(63);
      String[] stringArray0 = new String[1];
      stringArray0[0] = "7RPuf`:";
      MethodWriter methodWriter0 = new MethodWriter(classWriter0, 63, "7RPuf`:", "7RPuf`:", "7RPuf`:", stringArray0, false, false);
      String[] stringArray1 = new String[0];
      MethodWriter methodWriter1 = new MethodWriter(classWriter0, 3269, "#CHz@2{0N@@{If{`", "long", "7RPuf`:", stringArray1, false, false);
      ByteVector byteVector0 = new ByteVector(26);
      methodWriter0.put(byteVector0);
      assertNotSame(methodWriter0, methodWriter1);
  }

  @Test(timeout = 4000)
  public void test52()  throws Throwable  {
      ClassWriter classWriter0 = mock(ClassWriter.class, new ViolatedAssumptionAnswer());
      doReturn((-716), (-716), (-2187), (-716), (-716)).when(classWriter0).newUTF8(anyString());
      String[] stringArray0 = new String[0];
      MethodWriter methodWriter0 = new MethodWriter(classWriter0, (-716), "P[)*{(%=TH^uePcC@@Y", "P[)*{(%=TH^uePcC@@Y", "P[)*{(%=TH^uePcC@@Y", stringArray0, false, false);
      ByteVector byteVector0 = new ByteVector(1);
      methodWriter0.put(byteVector0);
      ClassWriter classWriter1 = new ClassWriter((-716));
      MethodWriter methodWriter1 = null;
      try {
        methodWriter1 = new MethodWriter(classWriter1, 0, "GUirCOEQ;|", "", "Q~2p", stringArray0, false, true);
        fail("Expecting exception: StringIndexOutOfBoundsException");
      
      } catch(StringIndexOutOfBoundsException e) {
      }
  }

  @Test(timeout = 4000)
  public void test53()  throws Throwable  {
      ClassWriter classWriter0 = mock(ClassWriter.class, new ViolatedAssumptionAnswer());
      doReturn((-1592), 35).when(classWriter0).newUTF8(anyString());
      String[] stringArray0 = new String[0];
      MethodWriter methodWriter0 = new MethodWriter(classWriter0, 2, "[]", "org.mockito.asm.Label", "[]", stringArray0, false, false);
      methodWriter0.visitIincInsn(52, 32);
  }

  @Test(timeout = 4000)
  public void test54()  throws Throwable  {
      ClassWriter classWriter0 = mock(ClassWriter.class, new ViolatedAssumptionAnswer());
      doReturn((-705), (-705), (-705), (-705), (-705)).when(classWriter0).newUTF8(anyString());
      String[] stringArray0 = new String[0];
      MethodWriter methodWriter0 = new MethodWriter(classWriter0, (-705), "P[)*{(%=TH^uePcC@@Y", "P[)*{(%=TH^uePcC@@Y", "P[)*{(%=TH^uePcC@@Y", stringArray0, false, false);
      Label label0 = new Label();
      methodWriter0.visitVarInsn(1024, 127);
      ByteVector byteVector0 = new ByteVector();
      methodWriter0.visitLineNumber((-705), label0);
      methodWriter0.put(byteVector0);
  }

  @Test(timeout = 4000)
  public void test55()  throws Throwable  {
      ClassWriter classWriter0 = new ClassWriter(18);
      String[] stringArray0 = new String[3];
      stringArray0[0] = "GUirCOEQ<|";
      stringArray0[1] = "$?q/Ig%UNnGL+;";
      stringArray0[2] = "9~4$&)V*V";
      MethodWriter methodWriter0 = new MethodWriter(classWriter0, 18, "c;h,{ac_$E&Wm", "$?q/Ig%UNnGL+;", "int", stringArray0, false, false);
      MethodWriter methodWriter1 = new MethodWriter(classWriter0, 21, "GUirCOEQ<|", "9~4$&)V*V", (String) null, stringArray0, false, true);
      assertFalse(methodWriter1.equals((Object)methodWriter0));
  }

  @Test(timeout = 4000)
  public void test56()  throws Throwable  {
      ClassWriter classWriter0 = new ClassWriter(1398);
      MethodWriter methodWriter0 = new MethodWriter(classWriter0, 7, "`SfJ|S", "GUirCOEQ<|", "1!Signature", (String[]) null, false, false);
      methodWriter0.visitMethodInsn(7, "`SfJ|S", "-px*^a7;r;\";?gyte|", "-px*^a7;r;\";?gyte|");
      Label label0 = new Label();
      methodWriter0.visitLocalVariable("-px*^a7;r;\";?gyte|", "Synthetic", "0r(VH/Ir", label0, label0, 1);
      classWriter0.toByteArray();
      MethodWriter methodWriter1 = null;
      try {
        methodWriter1 = new MethodWriter(classWriter0, 19, "-px*^a7;r;\";?gyte|", "java/lang/Throwable", "1!Signature", (String[]) null, true, true);
        fail("Expecting exception: StringIndexOutOfBoundsException");
      
      } catch(StringIndexOutOfBoundsException e) {
      }
  }

  @Test(timeout = 4000)
  public void test57()  throws Throwable  {
      ClassWriter classWriter0 = mock(ClassWriter.class, new ViolatedAssumptionAnswer());
      doReturn(249, 96, 249, 67, 67).when(classWriter0).newClass(anyString());
      doReturn(1877, 67).when(classWriter0).newUTF8(anyString());
      String[] stringArray0 = new String[5];
      MethodWriter methodWriter0 = new MethodWriter(classWriter0, 58, "InnerClasses", "Yr_#f|)@bs6Kvp$C", "InnerClasses", stringArray0, true, false);
      methodWriter0.visitVarInsn(73, 67);
  }

  @Test(timeout = 4000)
  public void test58()  throws Throwable  {
      ClassWriter classWriter0 = new ClassWriter(1398);
      MethodWriter methodWriter0 = new MethodWriter(classWriter0, 7, "`SfJ|S", "GUirCOEQ<|", "1!Signature", (String[]) null, false, false);
      methodWriter0.visitAnnotation("Code", false);
      classWriter0.toByteArray();
      MethodWriter methodWriter1 = null;
      try {
        methodWriter1 = new MethodWriter(classWriter0, 19, "-px*^a7;r;\";?gyte|", "java/lang/Throwable", "1!Signature", (String[]) null, true, true);
        fail("Expecting exception: StringIndexOutOfBoundsException");
      
      } catch(StringIndexOutOfBoundsException e) {
      }
  }

  @Test(timeout = 4000)
  public void test59()  throws Throwable  {
      ClassWriter classWriter0 = mock(ClassWriter.class, new ViolatedAssumptionAnswer());
      doReturn(0).when(classWriter0).newClass(anyString());
      doReturn((-1592), 35).when(classWriter0).newUTF8(anyString());
      String[] stringArray0 = new String[1];
      MethodWriter methodWriter0 = new MethodWriter(classWriter0, (-1592), "org.mockito.asm.Label", "${lH1)!*", ")V", stringArray0, true, false);
      methodWriter0.visitIincInsn((-1592), (-1592));
  }

  @Test(timeout = 4000)
  public void test60()  throws Throwable  {
      ClassWriter classWriter0 = mock(ClassWriter.class, new ViolatedAssumptionAnswer());
      doReturn((-1592), 35).when(classWriter0).newUTF8(anyString());
      String[] stringArray0 = new String[0];
      MethodWriter methodWriter0 = new MethodWriter(classWriter0, (-1592), "org.mockito.asm.Label", "${lH1)!*", "7RPuf`:", stringArray0, true, false);
      methodWriter0.visitIincInsn((-1592), (-1592));
  }

  @Test(timeout = 4000)
  public void test61()  throws Throwable  {
      ClassWriter classWriter0 = mock(ClassWriter.class, new ViolatedAssumptionAnswer());
      doReturn(1968, 66, 66).when(classWriter0).newClass(anyString());
      doReturn(1968, 1968, 7, 66, 799).when(classWriter0).newUTF8(anyString());
      String[] stringArray0 = new String[3];
      MethodWriter methodWriter0 = new MethodWriter(classWriter0, 1968, "ch,2a`c_$E&Wm", "$?q/Ig%UNnGL+;", "int", stringArray0, false, false);
      ByteVector byteVector0 = new ByteVector();
      Label label0 = new Label();
      methodWriter0.visitLocalVariable("GUirCOEQ<|", "GUirCOEQ<|", "O2;w`w~", label0, label0, 80);
      methodWriter0.visitVarInsn(2, 2);
      methodWriter0.put(byteVector0);
  }

  @Test(timeout = 4000)
  public void test62()  throws Throwable  {
      ClassWriter classWriter0 = mock(ClassWriter.class, new ViolatedAssumptionAnswer());
      doReturn(40, 40, 40, 40, 40).when(classWriter0).newUTF8(anyString());
      String[] stringArray0 = new String[0];
      MethodWriter methodWriter0 = new MethodWriter(classWriter0, 4096, "Fet[", "Fet[", "Fet[", stringArray0, false, false);
      methodWriter0.visitInsn(1);
      ByteVector byteVector0 = new ByteVector();
      methodWriter0.put(byteVector0);
  }

  @Test(timeout = 4000)
  public void test63()  throws Throwable  {
      ClassWriter classWriter0 = new ClassWriter(1398);
      MethodWriter methodWriter0 = new MethodWriter(classWriter0, 7, "`SfJ|S", "GUirCOEQ<|", "1!Signature", (String[]) null, false, false);
      methodWriter0.visitMethodInsn(7, "`SfJ|S", "-px*^a7;r;\";?gyte|", "-px*^a7;r;\";?gyte|");
      classWriter0.toByteArray();
      MethodWriter methodWriter1 = null;
      try {
        methodWriter1 = new MethodWriter(classWriter0, 19, "-px*^a7;r;\";?gyte|", "java/lang/Throwable", "1!Signature", (String[]) null, true, true);
        fail("Expecting exception: StringIndexOutOfBoundsException");
      
      } catch(StringIndexOutOfBoundsException e) {
      }
  }

  @Test(timeout = 4000)
  public void test64()  throws Throwable  {
      ClassWriter classWriter0 = mock(ClassWriter.class, new ViolatedAssumptionAnswer());
      doReturn(40, 40).when(classWriter0).newUTF8(anyString());
      String[] stringArray0 = new String[0];
      MethodWriter methodWriter0 = new MethodWriter(classWriter0, 4096, "Fet[", "Fet[", "Fet[", stringArray0, false, false);
      methodWriter0.visitMaxs((-376), 4096);
  }

  @Test(timeout = 4000)
  public void test65()  throws Throwable  {
      String[] stringArray0 = new String[0];
      ClassWriter classWriter0 = new ClassWriter(32);
      MethodWriter methodWriter0 = new MethodWriter(classWriter0, 35, "M=xLg+U", "xSU)?wNxMzws", "n8&bgPW6e)~&W{", stringArray0, false, true);
      methodWriter0.visitVarInsn(191, 191);
  }

  @Test(timeout = 4000)
  public void test66()  throws Throwable  {
      ClassWriter classWriter0 = new ClassWriter(1398);
      MethodWriter methodWriter0 = new MethodWriter(classWriter0, 2, "`SfJ|S", "GUirCOEQ<|", "1!Signature", (String[]) null, false, false);
      methodWriter0.visitAnnotation("EFFFFFFFFGGFFFGGFFFEEFGFGFEEEEEEEEEEEEEEEEEEEEDEDEDDDDDCDCDEEEEEEEEEEEEEEEEEEEEBABABBBBDCFFFGGGEDCDCDCDCDCDCDCDCDCDCEEEEDDDDDDDCDCDCEFEFDDEEFFDEDEEEBDDBBDDDDDDCCCCCCCCEFEDDDCDCDEEEEEEEEEEFEEEEEEDDEEDDEE", true);
      methodWriter0.visitMethodInsn(2, "`SfJ|S", "-px*^a7;r;\";?gyte|", "-px*^a7;r;\";?gyte|");
      MethodWriter methodWriter1 = null;
      try {
        methodWriter1 = new MethodWriter(classWriter0, 19, "-px*^a7;r;\";?gyte|", "cnjLATZ", "1!Signature", (String[]) null, false, true);
        fail("Expecting exception: StringIndexOutOfBoundsException");
      
      } catch(StringIndexOutOfBoundsException e) {
      }
  }

  @Test(timeout = 4000)
  public void test67()  throws Throwable  {
      ClassWriter classWriter0 = new ClassWriter(2057);
      String[] stringArray0 = new String[3];
      stringArray0[0] = "^*%@H:X^d6q8j7IZ~$";
      stringArray0[1] = "]Vu@(=!_[B,QM`";
      stringArray0[2] = "GUirCOEQ<|";
      MethodWriter methodWriter0 = new MethodWriter(classWriter0, (-10), "GUirCOEQ<|", "GUirCOEQ<|", "^*%@H:X^d6q8j7IZ~$", stringArray0, false, false);
      ByteVector byteVector0 = new ByteVector();
      methodWriter0.put(byteVector0);
      MethodWriter methodWriter1 = null;
      try {
        methodWriter1 = new MethodWriter(classWriter0, 2057, "^*%@H:X^d6q8j7IZ~$", (String) null, "6D\"&o", stringArray0, true, true);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
      }
  }

  @Test(timeout = 4000)
  public void test68()  throws Throwable  {
      ClassWriter classWriter0 = mock(ClassWriter.class, new ViolatedAssumptionAnswer());
      doReturn((-705), (-705), (-705), (-705), (-705)).when(classWriter0).newUTF8(anyString());
      String[] stringArray0 = new String[0];
      MethodWriter methodWriter0 = new MethodWriter(classWriter0, (-705), "P[)*{(%=TH^uePcC@@Y", "P[)*{(%=TH^uePcC@@Y", "P[)*{(%=TH^uePcC@@Y", stringArray0, false, false);
      Label label0 = new Label();
      methodWriter0.visitLocalVariable("P[)*{(%=TH^uePcC@@Y", "org.mockito.asm.Label", " A6Etn/WR<JU*h\"J", label0, label0, 127);
      methodWriter0.visitFrame(124, (-1172), stringArray0, (-1172), stringArray0);
      Label[] labelArray0 = new Label[2];
      labelArray0[0] = label0;
      labelArray0[1] = label0;
      methodWriter0.visitTableSwitchInsn(1129, 131072, label0, labelArray0);
      methodWriter0.visitTableSwitchInsn(1024, (-1172), label0, labelArray0);
      ByteVector byteVector0 = new ByteVector();
      methodWriter0.put(byteVector0);
  }

  @Test(timeout = 4000)
  public void test69()  throws Throwable  {
      ClassWriter classWriter0 = new ClassWriter(1398);
      String[] stringArray0 = new String[3];
      stringArray0[0] = "PtZNXQKm>*8!8iy6";
      stringArray0[1] = "]X0_z8x5t-)DL*Dw";
      stringArray0[2] = "]X0_z8x5t-)DL*Dw";
      MethodWriter methodWriter0 = new MethodWriter(classWriter0, 16777219, "HoiV7", "]X0_z8x5t-)DL*Dw", "org.mockito.asm.MethodWriter", stringArray0, true, false);
      methodWriter0.visitIincInsn(16777219, 1398);
  }

  @Test(timeout = 4000)
  public void test70()  throws Throwable  {
      ClassWriter classWriter0 = new ClassWriter((byte) (-89));
      String[] stringArray0 = new String[0];
      MethodWriter methodWriter0 = new MethodWriter(classWriter0, (byte) (-89), "z", "5*Yr3:XyY-,Sh&", (String) null, stringArray0, false, false);
      MethodWriter methodWriter1 = new MethodWriter(classWriter0, (byte)37, "kz:'vOs:Rnw^&J", "|)G", "z", stringArray0, true, true);
      methodWriter1.visitIincInsn((byte)37, (byte) (-89));
      assertNotSame(methodWriter1, methodWriter0);
  }

  @Test(timeout = 4000)
  public void test71()  throws Throwable  {
      ClassWriter classWriter0 = new ClassWriter(1968);
      String[] stringArray0 = new String[3];
      stringArray0[0] = "GUirCOEQ<|";
      stringArray0[1] = "int";
      stringArray0[2] = "9~4&)V*V";
      MethodWriter methodWriter0 = new MethodWriter(classWriter0, 1968, "ch,2a`c_$E&Wm", "ch,2a`c_$E&Wm", "int", stringArray0, false, false);
      methodWriter0.visitVarInsn(2, 2);
      MethodWriter methodWriter1 = new MethodWriter(classWriter0, (-642), "O2;w`w~", "int", "i`HigTGaP(b|f sOoV", stringArray0, false, false);
      assertFalse(methodWriter1.equals((Object)methodWriter0));
  }

  @Test(timeout = 4000)
  public void test72()  throws Throwable  {
      ClassReader classReader0 = new ClassReader("org.mockito.asm.Label");
      ClassWriter classWriter0 = new ClassWriter(classReader0, 100);
      String[] stringArray0 = new String[0];
      MethodWriter methodWriter0 = new MethodWriter(classWriter0, 3269, "#CHz@2{0N@@{If{`", "long", "7RPuf`:", stringArray0, false, false);
  }

  @Test(timeout = 4000)
  public void test73()  throws Throwable  {
      String[] stringArray0 = new String[1];
      ClassReader classReader0 = new ClassReader("org.mockito.asm.Label");
      ClassWriter classWriter0 = new ClassWriter(classReader0, 100);
      MethodWriter methodWriter0 = null;
      try {
        methodWriter0 = new MethodWriter(classWriter0, 3269, "#CHz@2{0N@@{If{`", "long", "7RPuf`:", stringArray0, false, false);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
      }
  }

  @Test(timeout = 4000)
  public void test74()  throws Throwable  {
      ClassWriter classWriter0 = new ClassWriter((byte)0);
      MethodWriter methodWriter0 = new MethodWriter(classWriter0, 2, "<init>", "", "char", (String[]) null, false, false);
      // Undeclared exception!
      try { 
        methodWriter0.visitFrame((byte)0, 983, (Object[]) null, (byte)0, (Object[]) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.mockito.asm.MethodWriter", e);
      }
  }
}
