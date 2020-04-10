/*

 * Tue Mar 03 14:29:58 GMT 2020
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
import org.mockito.asm.MethodWriter;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = false, useJEE = true) 
public class MethodWriter_ESTest extends MethodWriter_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test00()  throws Throwable  {
      ClassWriter classWriter0 = new ClassWriter(267386880);
      ByteVector byteVector0 = new ByteVector(2);
      byteVector0.putLong(4075L);
      MethodWriter methodWriter0 = null;
      try {
        methodWriter0 = new MethodWriter(classWriter0, 200, ",2ck/6NxjF~7", "'$'7muebY", "-\tPquq", (String[]) null, true, true);
        fail("Expecting exception: StringIndexOutOfBoundsException");
      
      } catch(StringIndexOutOfBoundsException e) {
      }
  }

  @Test(timeout = 4000)
  public void test01()  throws Throwable  {
      ClassWriter classWriter0 = new ClassWriter(0);
      MethodWriter methodWriter0 = new MethodWriter(classWriter0, (-2351), "8+?", "B>5t!ua_R7Jr=vUD>iX", "Class not found", (String[]) null, false, false);
      // Undeclared exception!
      try { 
        methodWriter0.visitFrame(0, 0, (Object[]) null, 235, (Object[]) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.mockito.asm.MethodWriter", e);
      }
  }

  @Test(timeout = 4000)
  public void test02()  throws Throwable  {
      ClassWriter classWriter0 = new ClassWriter(267386878);
      String[] stringArray0 = new String[0];
      MethodWriter methodWriter0 = new MethodWriter(classWriter0, (-1023), "RuntimeVisibleAnnotations", "RrG.gcRY1Z(_Pl4qG", "RuntimeInvisibleAnnotations", stringArray0, false, false);
      ByteVector byteVector0 = new ByteVector(1);
      byteVector0.put11((-1023), 2);
      String[] stringArray1 = new String[3];
      MethodWriter methodWriter1 = null;
      try {
        methodWriter1 = new MethodWriter(classWriter0, 1, "RuntimeVisibleAnnotations", "AnnotationDefault", "value ", stringArray1, true, true);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
      }
  }

  @Test(timeout = 4000)
  public void test03()  throws Throwable  {
      ClassWriter classWriter0 = new ClassWriter((-275));
      String[] stringArray0 = new String[0];
      MethodWriter methodWriter0 = new MethodWriter(classWriter0, 1, "r'Z*hLU$'?", "_G*Yn", "Fw)Nc6i2", stringArray0, false, false);
      methodWriter0.visitVarInsn((-1706), 248);
  }

  @Test(timeout = 4000)
  public void test04()  throws Throwable  {
      String[] stringArray0 = new String[4];
      stringArray0[0] = "f!z1N1%";
      stringArray0[1] = "f!z1N1%";
      stringArray0[2] = "f!z1N1%";
      stringArray0[3] = ";:PH";
      Label label0 = new Label();
      ClassWriter classWriter0 = new ClassWriter(86);
      MethodWriter methodWriter0 = new MethodWriter(classWriter0, 86, ";:PH", "Ljava/lang/Synthetic;", "f!z1N1%", stringArray0, false, false);
      methodWriter0.visitLocalVariable("3$G", "Ljava/lang/Synthetic;", "C+vx)+_@~P3&", label0, label0, 55);
  }

  @Test(timeout = 4000)
  public void test05()  throws Throwable  {
      ClassWriter classWriter0 = new ClassWriter((-258));
      String[] stringArray0 = new String[0];
      MethodWriter methodWriter0 = new MethodWriter(classWriter0, 50331648, "Fw)Nc6i2", "Fw)Nc6i2", "Fw)Nc6i2", stringArray0, false, false);
      MethodWriter methodWriter1 = new MethodWriter(classWriter0, 2, "LineNumberTable", "X-(Hy", "Fw)Nc6i2", stringArray0, false, false);
      methodWriter0.visitIincInsn(560, 2);
      assertNotSame(methodWriter0, methodWriter1);
  }

  @Test(timeout = 4000)
  public void test06()  throws Throwable  {
      ClassWriter classWriter0 = new ClassWriter((-258));
      classWriter0.newDouble(34);
      String[] stringArray0 = new String[0];
      MethodWriter methodWriter0 = new MethodWriter(classWriter0, 34, "", "", "", stringArray0, false, false);
  }

  @Test(timeout = 4000)
  public void test07()  throws Throwable  {
      ClassWriter classWriter0 = new ClassWriter((-275));
      String[] stringArray0 = new String[0];
      MethodWriter methodWriter0 = new MethodWriter(classWriter0, 1, "", "", "", stringArray0, false, false);
      ByteVector byteVector0 = new ByteVector(1);
      ByteVector byteVector1 = byteVector0.putLong(1);
      assertSame(byteVector0, byteVector1);
  }

  @Test(timeout = 4000)
  public void test08()  throws Throwable  {
      int[] intArray0 = new int[17];
      Label label0 = new Label();
      MethodWriter.getNewOffset(intArray0, intArray0, label0);
      MethodWriter.getNewOffset(intArray0, intArray0, label0);
      assertEquals(17, intArray0.length);
  }

  @Test(timeout = 4000)
  public void test09()  throws Throwable  {
      ClassWriter classWriter0 = new ClassWriter((-257));
      String[] stringArray0 = new String[1];
      stringArray0[0] = "I;~G,BDd 8)MAb@k77";
      MethodWriter methodWriter0 = new MethodWriter(classWriter0, 2, "?6 eo", "I;~G,BDd 8)MAb@k77", "", stringArray0, true, true);
      methodWriter0.visitLdcInsn("I;~G,BDd 8)MAb@k77");
  }

  @Test(timeout = 4000)
  public void test10()  throws Throwable  {
      ClassWriter classWriter0 = new ClassWriter(267386878);
      String[] stringArray0 = new String[0];
      MethodWriter methodWriter0 = new MethodWriter(classWriter0, (-1023), "RuntimeVisibleAnnotations", "RrG.gcRY1Z(_Pl4qG", "RuntimeInvisibleAnnotations", stringArray0, false, false);
      methodWriter0.visitLdcInsn("RuntimeVisibleAnnotations");
  }

  @Test(timeout = 4000)
  public void test11()  throws Throwable  {
      ClassWriter classWriter0 = new ClassWriter((-254));
      MethodWriter methodWriter0 = new MethodWriter(classWriter0, (-539), "Synthetic", ":l0to0}a<E", ":l0to0}a<E", (String[]) null, false, false);
      methodWriter0.visitFieldInsn((-1264), ":l0to0}a<E", "Synthetic", "Synthetic");
  }

  @Test(timeout = 4000)
  public void test12()  throws Throwable  {
      String[] stringArray0 = new String[1];
      stringArray0[0] = ")";
      ClassWriter classWriter0 = new ClassWriter(0);
      MethodWriter methodWriter0 = new MethodWriter(classWriter0, 14, "O7k#N&Ep](W8LEq", "", "O7k#N&Ep](W8LEq", stringArray0, false, false);
      MethodWriter methodWriter1 = new MethodWriter(classWriter0, 0, "O7k#N&Ep](W8LEq", "O7k#N&Ep](W8LEq", ")", stringArray0, false, false);
      methodWriter0.classReaderOffset = 1239;
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
  public void test13()  throws Throwable  {
      ClassWriter classWriter0 = new ClassWriter((-258));
      MethodWriter methodWriter0 = new MethodWriter(classWriter0, (-258), "%g*9hNVj", "_kv2j;", "_kv2j;", (String[]) null, false, false);
      methodWriter0.visitIntInsn(21, (-1128));
      methodWriter0.visitFrame((-5438), 74, (Object[]) null, 0, (Object[]) null);
      classWriter0.toByteArray();
      MethodWriter methodWriter1 = new MethodWriter(classWriter0, 126, "_kv2j;", "%g*9hNVj", "#82s(ECP~0c^N", (String[]) null, false, false);
      assertFalse(methodWriter1.equals((Object)methodWriter0));
  }

  @Test(timeout = 4000)
  public void test14()  throws Throwable  {
      ClassWriter classWriter0 = new ClassWriter((-258));
      String[] stringArray0 = new String[0];
      MethodWriter methodWriter0 = new MethodWriter(classWriter0, 50331648, "Fw)Nc6i2", "Fw)Nc6i2", "Fw)Nc6i2", stringArray0, false, false);
      MethodWriter methodWriter1 = new MethodWriter(classWriter0, 2, "LineNumberTable", "X-(Hy", "Fw)Nc6i2", stringArray0, false, false);
      methodWriter1.visitMethodInsn((-258), "Fw)Nc6i2", "L/I#3gM_/hG", "Fw)Nc6i2");
      assertNotSame(methodWriter1, methodWriter0);
  }

  @Test(timeout = 4000)
  public void test15()  throws Throwable  {
      int[] intArray0 = new int[17];
      intArray0[15] = 1214;
      ClassWriter classWriter0 = new ClassWriter(0);
      MethodWriter methodWriter0 = new MethodWriter(classWriter0, 1214, "<G0* X{eM]%'U1w", "LocalVariableTypeTable", (String) null, (String[]) null, false, false);
      int int0 = MethodWriter.getNewOffset(intArray0, intArray0, 2488, 1);
      assertEquals((-3701), int0);
  }

  @Test(timeout = 4000)
  public void test16()  throws Throwable  {
      ClassWriter classWriter0 = new ClassWriter((-258));
      String[] stringArray0 = new String[0];
      MethodWriter methodWriter0 = new MethodWriter(classWriter0, 1, "J", "Fw)Nc6i2", ")W$i_RV7>jO", stringArray0, false, true);
      // Undeclared exception!
      try { 
        methodWriter0.visitMaxs((-4095), (-4095));
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // 8
         //
         verifyException("org.mockito.asm.Type", e);
      }
  }

  @Test(timeout = 4000)
  public void test17()  throws Throwable  {
      ClassWriter classWriter0 = new ClassWriter((-257));
      String[] stringArray0 = new String[1];
      stringArray0[0] = "I;~G,BDd 8)MAb@k77";
      MethodWriter methodWriter0 = new MethodWriter(classWriter0, 2, "?6 eo", "I;~G,BDd 8)MAb@k77", "", stringArray0, true, true);
      methodWriter0.visitFieldInsn(16777217, "RuntimeInvisibleAnnotations", "?6 eo", "I;~G,BDd 8)MAb@k77");
  }

  @Test(timeout = 4000)
  public void test18()  throws Throwable  {
      ClassWriter classWriter0 = new ClassWriter((-257));
      String[] stringArray0 = new String[1];
      stringArray0[0] = "I;~G,BDd 8)MAb@k77";
      MethodWriter methodWriter0 = new MethodWriter(classWriter0, 2, "?6 eo", "I;~G,BDd 8)MAb@k77", "", stringArray0, true, true);
      // Undeclared exception!
      try { 
        methodWriter0.visitMaxs((-1437847809), 2);
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // 18
         //
         verifyException("org.mockito.asm.Type", e);
      }
  }

  @Test(timeout = 4000)
  public void test19()  throws Throwable  {
      String[] stringArray0 = new String[1];
      stringArray0[0] = ")";
      ClassWriter classWriter0 = new ClassWriter(0);
      MethodWriter methodWriter0 = new MethodWriter(classWriter0, 14, "O7k#N&Ep](W8LEq", "", "O7k#N&Ep](W8LEq", stringArray0, false, false);
      // Undeclared exception!
      try { 
        methodWriter0.visitMethodInsn(185, "K8\"rj;HC$3;y", "", "-6");
        fail("Expecting exception: StringIndexOutOfBoundsException");
      
      } catch(StringIndexOutOfBoundsException e) {
      }
  }

  @Test(timeout = 4000)
  public void test20()  throws Throwable  {
      String[] stringArray0 = new String[1];
      stringArray0[0] = ")";
      ClassWriter classWriter0 = new ClassWriter(0);
      MethodWriter methodWriter0 = new MethodWriter(classWriter0, 14, "O7k#N&Ep](W8LEq", "", "O7k#N&Ep](W8LEq", stringArray0, false, false);
      methodWriter0.visitFrame(2, 285212681, stringArray0, 5, stringArray0);
      assertEquals(1, stringArray0.length);
  }

  @Test(timeout = 4000)
  public void test21()  throws Throwable  {
      ClassWriter classWriter0 = new ClassWriter(267386880);
      MethodWriter methodWriter0 = new MethodWriter(classWriter0, 61, "ETT*Fr{l526(!IN*", "H$d)^A7wn", "LocalVariableTypeTable", (String[]) null, true, true);
      methodWriter0.visitMethodInsn(1, "=SE`QwW-Ab!=u", "LocalVariableTypeTable", "H$d)^A7wn");
      MethodWriter methodWriter1 = null;
      try {
        methodWriter1 = new MethodWriter(classWriter0, (-567), "O7k#N&Ep](W8LEq", "=SE`QwW-Ab!=u", "upc`&", (String[]) null, true, false);
        fail("Expecting exception: StringIndexOutOfBoundsException");
      
      } catch(StringIndexOutOfBoundsException e) {
      }
  }

  @Test(timeout = 4000)
  public void test22()  throws Throwable  {
      ClassWriter classWriter0 = new ClassWriter((-275));
      String[] stringArray0 = new String[0];
      MethodWriter methodWriter0 = new MethodWriter(classWriter0, (-1616), "", "Fw)Nc6i2", "Fw)Nc6i2", stringArray0, true, false);
      MethodWriter methodWriter1 = new MethodWriter(classWriter0, 20, "%g*9hNVj", ":OXQR,zjOORd4U", "_Fv4j;", stringArray0, false, false);
      // Undeclared exception!
      try { 
        methodWriter0.visitMethodInsn(3944, "AnnotationDefault", "g2=:-'L+=c.k", "AnnotationDefault");
        fail("Expecting exception: StringIndexOutOfBoundsException");
      
      } catch(StringIndexOutOfBoundsException e) {
      }
  }

  @Test(timeout = 4000)
  public void test23()  throws Throwable  {
      ClassWriter classWriter0 = new ClassWriter(0);
      String[] stringArray0 = new String[5];
      stringArray0[0] = "^Am";
      stringArray0[1] = "H$d)^A7wn";
      stringArray0[2] = "t'R*3v(n9VD=F,d'";
      stringArray0[3] = "H$d)^A7wn";
      stringArray0[4] = "t'R*3v(n9VD=F,d'";
      MethodWriter methodWriter0 = new MethodWriter(classWriter0, 2, "H$d)^A7wn", "H$d)^A7wn", "H$d)^A7wn", stringArray0, false, false);
      methodWriter0.visitFrame(1, (-3068), stringArray0, 80, stringArray0);
      assertEquals(5, stringArray0.length);
  }

  @Test(timeout = 4000)
  public void test24()  throws Throwable  {
      String[] stringArray0 = new String[1];
      stringArray0[0] = ")";
      ClassWriter classWriter0 = new ClassWriter(14);
      MethodWriter methodWriter0 = new MethodWriter(classWriter0, 14, ")", ")", "", stringArray0, false, false);
      methodWriter0.visitVarInsn(2, 2);
      MethodWriter methodWriter1 = new MethodWriter(classWriter0, 2, "vkrqgwho8=", ")", "m(M", stringArray0, false, false);
      assertFalse(methodWriter1.equals((Object)methodWriter0));
  }

  @Test(timeout = 4000)
  public void test25()  throws Throwable  {
      ClassWriter classWriter0 = new ClassWriter((-275));
      String[] stringArray0 = new String[0];
      MethodWriter methodWriter0 = new MethodWriter(classWriter0, (-1616), "", "Fw)Nc6i2", "Fw)Nc6i2", stringArray0, true, false);
      MethodWriter methodWriter1 = new MethodWriter(classWriter0, 20, "%g*9hNVj", ":OXQR,zjOORd4U", "_Fv4j;", stringArray0, false, false);
      int[] intArray0 = new int[5];
      intArray0[0] = 3077;
      Label label0 = new Label();
      MethodWriter.getNewOffset(intArray0, intArray0, label0);
      assertArrayEquals(new int[] {3077, 0, 0, 0, 0}, intArray0);
  }

  @Test(timeout = 4000)
  public void test26()  throws Throwable  {
      ClassWriter classWriter0 = new ClassWriter((-275));
      String[] stringArray0 = new String[0];
      MethodWriter methodWriter0 = new MethodWriter(classWriter0, (-1616), "", "Fw)Nc6i2", "Fw)Nc6i2", stringArray0, true, false);
      methodWriter0.visitFieldInsn((-275), "", "XXvkY?gNTSmG:k:", "]Qb`B:$IFTqR4\"T|S");
      MethodWriter methodWriter1 = null;
      try {
        methodWriter1 = new MethodWriter(classWriter0, 3101, "E&]p[Po@DY", "", "_}RfZl`Dz<;ycoh$", (String[]) null, true, false);
        fail("Expecting exception: StringIndexOutOfBoundsException");
      
      } catch(StringIndexOutOfBoundsException e) {
      }
  }

  @Test(timeout = 4000)
  public void test27()  throws Throwable  {
      ClassWriter classWriter0 = new ClassWriter(267386878);
      ByteVector byteVector0 = new ByteVector(1);
      byteVector0.put11((-1023), 2);
      String[] stringArray0 = new String[3];
      stringArray0[0] = "value ";
      stringArray0[1] = "Signature";
      stringArray0[2] = "{c|[";
      MethodWriter methodWriter0 = null;
      try {
        methodWriter0 = new MethodWriter(classWriter0, 1, "RuntimeVisibleAnnotations", "AnnotationDefault", "value ", stringArray0, true, true);
        fail("Expecting exception: StringIndexOutOfBoundsException");
      
      } catch(StringIndexOutOfBoundsException e) {
      }
  }

  @Test(timeout = 4000)
  public void test28()  throws Throwable  {
      ClassWriter classWriter0 = new ClassWriter((-258));
      MethodWriter methodWriter0 = new MethodWriter(classWriter0, (-539), "Synthetic", ":l0to0}a<E", ":l0to0}a<E", (String[]) null, false, false);
      // Undeclared exception!
      try { 
        methodWriter0.visitFrame(1, 67, (Object[]) null, 2, (Object[]) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.mockito.asm.MethodWriter", e);
      }
  }

  @Test(timeout = 4000)
  public void test29()  throws Throwable  {
      ClassWriter classWriter0 = new ClassWriter((-275));
      String[] stringArray0 = new String[0];
      MethodWriter methodWriter0 = new MethodWriter(classWriter0, (-1616), "", "Fw)Nc6i2", "Fw)Nc6i2", stringArray0, true, false);
      methodWriter0.visitFrame(1, (-1315), stringArray0, 20, stringArray0);
      methodWriter0.visitFrame(59, 171, stringArray0, 4096, stringArray0);
      assertEquals(0, stringArray0.length);
  }

  @Test(timeout = 4000)
  public void test30()  throws Throwable  {
      ClassWriter classWriter0 = new ClassWriter(50);
      String[] stringArray0 = new String[4];
      stringArray0[0] = "SourceFile";
      stringArray0[1] = "Fw)Nc6i2";
      stringArray0[2] = "SourceFile";
      stringArray0[3] = "SourceFile";
      MethodWriter methodWriter0 = new MethodWriter(classWriter0, 1, "Fw)Nc6i2", "Fw)Nc6i2", "SourceFile", stringArray0, false, false);
      methodWriter0.visitVarInsn((-1662), 50);
      MethodWriter methodWriter1 = new MethodWriter(classWriter0, 50, " %SWp&g\"c.@", "Fw)Nc6i2", "A\"%", stringArray0, false, false);
      assertFalse(methodWriter1.equals((Object)methodWriter0));
  }

  @Test(timeout = 4000)
  public void test31()  throws Throwable  {
      ClassWriter classWriter0 = new ClassWriter(50);
      String[] stringArray0 = new String[4];
      stringArray0[0] = "SourceFile";
      stringArray0[1] = "Fw)Nc6i2";
      stringArray0[2] = "SourceFile";
      stringArray0[3] = "SourceFile";
      MethodWriter methodWriter0 = new MethodWriter(classWriter0, 1, "Fw)Nc6i2", "Fw)Nc6i2", "SourceFile", stringArray0, false, false);
      MethodWriter methodWriter1 = new MethodWriter(classWriter0, 50, " %SWp&g\"c.@", "Fw)Nc6i2", "A\"%", stringArray0, false, false);
      methodWriter0.visitAnnotationDefault();
      ByteVector byteVector0 = new ByteVector(5);
      methodWriter0.put(byteVector0);
      assertNotSame(methodWriter0, methodWriter1);
  }

  @Test(timeout = 4000)
  public void test32()  throws Throwable  {
      ClassWriter classWriter0 = new ClassWriter((-257));
      String[] stringArray0 = new String[1];
      stringArray0[0] = "I;~G,BDd 8)MAb@k77";
      MethodWriter methodWriter0 = new MethodWriter(classWriter0, 2, "?6 eo", "I;~G,BDd 8)MAb@k77", "", stringArray0, true, true);
      int int0 = methodWriter0.getSize();
      assertEquals(26, int0);
  }

  @Test(timeout = 4000)
  public void test33()  throws Throwable  {
      ClassWriter classWriter0 = new ClassWriter((-257));
      String[] stringArray0 = new String[1];
      stringArray0[0] = "?6 eo";
      MethodWriter methodWriter0 = null;
      try {
        methodWriter0 = new MethodWriter(classWriter0, (-1661), "I;~G,BDd 8)MAb@k77", "org.mockito.asm.Label", "org.mockito.asm.Label", stringArray0, true, true);
        fail("Expecting exception: StringIndexOutOfBoundsException");
      
      } catch(StringIndexOutOfBoundsException e) {
      }
  }

  @Test(timeout = 4000)
  public void test34()  throws Throwable  {
      ClassWriter classWriter0 = new ClassWriter((-258));
      String[] stringArray0 = new String[0];
      MethodWriter methodWriter0 = new MethodWriter(classWriter0, 50331648, "Fw)Nc6i2", "", "", stringArray0, false, false);
      int[] intArray0 = new int[5];
      int int0 = MethodWriter.getNewOffset(intArray0, intArray0, (-258), 52);
      assertEquals(310, int0);
  }

  @Test(timeout = 4000)
  public void test35()  throws Throwable  {
      ClassWriter classWriter0 = new ClassWriter(267386878);
      String[] stringArray0 = new String[0];
      MethodWriter methodWriter0 = new MethodWriter(classWriter0, (-1012), "RuntimeVisibleAnnotations", "RrG.gcRY1Z(_Pl4qG", "RuntimeInvisibleAnnotations", stringArray0, false, false);
      methodWriter0.visitAnnotationDefault();
      ByteVector byteVector0 = new ByteVector(1);
      methodWriter0.put(byteVector0);
  }

  @Test(timeout = 4000)
  public void test36()  throws Throwable  {
      ClassWriter classWriter0 = new ClassWriter((-258));
      String[] stringArray0 = new String[0];
      MethodWriter methodWriter0 = new MethodWriter(classWriter0, 50331648, "Fw)Nc6i2", "", "", stringArray0, false, false);
      byte[] byteArray0 = classWriter0.toByteArray();
      assertEquals(66, byteArray0.length);
  }

  @Test(timeout = 4000)
  public void test37()  throws Throwable  {
      ClassWriter classWriter0 = new ClassWriter(267386878);
      String[] stringArray0 = new String[0];
      MethodWriter methodWriter0 = new MethodWriter(classWriter0, (-1023), "RuntimeVisibleAnnotations", "RrG.gcRY1Z(_Pl4qG", "RuntimeInvisibleAnnotations", stringArray0, false, false);
      methodWriter0.visitMultiANewArrayInsn("+eo", 2);
      methodWriter0.visitFieldInsn(50, "cJ8MO\u0000(nO}t_P", "n$#B ~66efBO7UMnR", "RuntimeVisibleAnnotations");
  }

  @Test(timeout = 4000)
  public void test38()  throws Throwable  {
      ClassWriter classWriter0 = new ClassWriter((-257));
      classWriter0.newDouble((-257));
      String[] stringArray0 = new String[1];
      stringArray0[0] = "I;~G,BDd 8)MAb@k77";
      MethodWriter methodWriter0 = new MethodWriter(classWriter0, 2, "?66", "I;~G,BDd 8)MAb@k77", "", stringArray0, true, true);
      ByteVector byteVector0 = new ByteVector();
      methodWriter0.put(byteVector0);
  }

  @Test(timeout = 4000)
  public void test39()  throws Throwable  {
      ClassWriter classWriter0 = mock(ClassWriter.class, new ViolatedAssumptionAnswer());
      doReturn((-1058), 5151, (-1058), 285212681, 13).when(classWriter0).newClass(anyString());
      doReturn(61, (-1058)).when(classWriter0).newUTF8(anyString());
      String[] stringArray0 = new String[4];
      stringArray0[0] = "f!z1N1%";
      stringArray0[1] = "f!z1N1%";
      stringArray0[2] = "f!z1N1%";
      stringArray0[3] = ";:PH";
      MethodWriter methodWriter0 = new MethodWriter(classWriter0, 2, "f!z1N1%", "f!z1N1%", ";:PH", stringArray0, false, false);
      methodWriter0.visitFrame(0, 4, stringArray0, (-562), stringArray0);
      assertEquals(4, stringArray0.length);
  }

  @Test(timeout = 4000)
  public void test40()  throws Throwable  {
      ClassWriter classWriter0 = new ClassWriter((-258));
      String[] stringArray0 = new String[0];
      MethodWriter methodWriter0 = new MethodWriter(classWriter0, 50331648, "Fw)Nc6i2", "D", "SourceDebugExtension", stringArray0, false, false);
      methodWriter0.visitFrame(0, 0, stringArray0, 0, stringArray0);
      assertEquals(0, stringArray0.length);
  }

  @Test(timeout = 4000)
  public void test41()  throws Throwable  {
      ClassWriter classWriter0 = new ClassWriter((-257));
      String[] stringArray0 = new String[1];
      stringArray0[0] = "I;~G,BDd 8)MAb@k77";
      MethodWriter methodWriter0 = new MethodWriter(classWriter0, 2, "?66", "I;~G,BDd 8)MAb@k77", "", stringArray0, true, true);
      methodWriter0.visitAnnotationDefault();
      ByteVector byteVector0 = new ByteVector(3066);
      methodWriter0.put(byteVector0);
  }

  @Test(timeout = 4000)
  public void test42()  throws Throwable  {
      ClassWriter classWriter0 = new ClassWriter(109);
      String[] stringArray0 = new String[1];
      stringArray0[0] = ")";
      MethodWriter methodWriter0 = new MethodWriter(classWriter0, 2, ")", "", "", stringArray0, false, false);
      methodWriter0.visitInsn(0);
  }

  @Test(timeout = 4000)
  public void test43()  throws Throwable  {
      ClassWriter classWriter0 = new ClassWriter((-258));
      String[] stringArray0 = new String[0];
      MethodWriter methodWriter0 = new MethodWriter(classWriter0, 7, "Fw)Nc6i2", "Fw)Nc6i2", ")Au#li4u_'O_H", stringArray0, false, true);
      methodWriter0.visitInsn(22);
  }

  @Test(timeout = 4000)
  public void test44()  throws Throwable  {
      ClassWriter classWriter0 = new ClassWriter((-258));
      String[] stringArray0 = new String[0];
      MethodWriter methodWriter0 = new MethodWriter(classWriter0, 50331648, "Fw)Nc6i2", "Fw)Nc6i2", "Fw)Nc6i2", stringArray0, false, false);
      methodWriter0.visitInsn(4);
  }

  @Test(timeout = 4000)
  public void test45()  throws Throwable  {
      int[] intArray0 = new int[1];
      intArray0[0] = 4028;
      Label label0 = mock(Label.class, new ViolatedAssumptionAnswer());
      MethodWriter.getNewOffset(intArray0, intArray0, label0);
      ClassWriter classWriter0 = mock(ClassWriter.class, new ViolatedAssumptionAnswer());
      doReturn(0, 0, 0).when(classWriter0).newClass(anyString());
      doReturn(0, 0).when(classWriter0).newUTF8(anyString());
      String[] stringArray0 = new String[3];
      MethodWriter methodWriter0 = new MethodWriter(classWriter0, 75, "", "'<)*+c!)}vv@L{sb", "|i4xV6dpF", stringArray0, true, true);
  }

  @Test(timeout = 4000)
  public void test46()  throws Throwable  {
      ClassWriter classWriter0 = new ClassWriter((-275));
      String[] stringArray0 = new String[0];
      MethodWriter methodWriter0 = new MethodWriter(classWriter0, (-1616), "", "Fw)Nc6i2", "Fw)Nc6i2", stringArray0, true, false);
      methodWriter0.visitVarInsn(2, 2);
  }

  @Test(timeout = 4000)
  public void test47()  throws Throwable  {
      ClassWriter classWriter0 = new ClassWriter(0);
      MethodWriter methodWriter0 = new MethodWriter(classWriter0, 1214, "<G0* X{eM]%'U1w", "LocalVariableTypeTable", (String) null, (String[]) null, false, false);
      ByteVector byteVector0 = classWriter0.pool;
      methodWriter0.put(byteVector0);
  }

  @Test(timeout = 4000)
  public void test48()  throws Throwable  {
      ClassWriter classWriter0 = new ClassWriter(33554432);
      String[] stringArray0 = new String[4];
      stringArray0[0] = "<init>";
      stringArray0[1] = "";
      stringArray0[2] = "<init>";
      stringArray0[3] = "<init>";
      MethodWriter methodWriter0 = new MethodWriter(classWriter0, 1214, "", "<init>", "", stringArray0, false, false);
      methodWriter0.visitMaxs(26, 90);
  }

  @Test(timeout = 4000)
  public void test49()  throws Throwable  {
      ClassWriter classWriter0 = new ClassWriter((-258));
      String[] stringArray0 = new String[0];
      MethodWriter methodWriter0 = new MethodWriter(classWriter0, 3254, "VxNXM;IFMT%e0Nr$$!H", "mPQUZvet|:", "StackMap", stringArray0, false, false);
      methodWriter0.visitMaxs(28, 533);
  }

  @Test(timeout = 4000)
  public void test50()  throws Throwable  {
      ClassWriter classWriter0 = new ClassWriter(267386878);
      String[] stringArray0 = new String[0];
      MethodWriter methodWriter0 = new MethodWriter(classWriter0, (-1012), "RuntimeVisibleAnnotations", "RrG.gcRY1Z(_Pl4qG", "RuntimeInvisibleAnnotations", stringArray0, false, false);
      ByteVector byteVector0 = new ByteVector(1);
      Attribute attribute0 = new Attribute("SourceFile");
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
  public void test51()  throws Throwable  {
      ClassWriter classWriter0 = new ClassWriter((-257));
      String[] stringArray0 = new String[1];
      stringArray0[0] = "?6 eo";
      MethodWriter methodWriter0 = new MethodWriter(classWriter0, 2, "?6 eo", "I;~G,BDd 8)MAb@k77", "", stringArray0, true, true);
      methodWriter0.visitVarInsn(55, 1528);
  }

  @Test(timeout = 4000)
  public void test52()  throws Throwable  {
      ClassWriter classWriter0 = new ClassWriter((-257));
      classWriter0.newDouble((-257));
      String[] stringArray0 = new String[1];
      stringArray0[0] = "I;~G,BDd 8)MAb@k77";
      MethodWriter methodWriter0 = new MethodWriter(classWriter0, 2, "?6 eo", "I;~G,BDd 8)MAb@k77", "", stringArray0, true, true);
      MethodWriter methodWriter1 = null;
      try {
        methodWriter1 = new MethodWriter(classWriter0, 127, "8tM", "StackMapTable", "", stringArray0, true, true);
        fail("Expecting exception: StringIndexOutOfBoundsException");
      
      } catch(StringIndexOutOfBoundsException e) {
      }
  }

  @Test(timeout = 4000)
  public void test53()  throws Throwable  {
      ClassWriter classWriter0 = new ClassWriter(109);
      String[] stringArray0 = new String[1];
      stringArray0[0] = ")";
      MethodWriter methodWriter0 = new MethodWriter(classWriter0, 2, ")", "", "", stringArray0, false, false);
      MethodWriter methodWriter1 = new MethodWriter(classWriter0, (-150), "LocalVariableTable", "}Mikf!NC~NuEbcvkJ+N", "u5$cd%c^b)", stringArray0, false, false);
      ByteVector byteVector0 = new ByteVector(1);
      ByteVector byteVector1 = byteVector0.putLong((-2767L));
      assertSame(byteVector1, byteVector0);
  }

  @Test(timeout = 4000)
  public void test54()  throws Throwable  {
      ClassWriter classWriter0 = new ClassWriter((-2486));
      String[] stringArray0 = new String[5];
      stringArray0[0] = "";
      stringArray0[1] = "java/lang/String";
      stringArray0[2] = "";
      stringArray0[3] = "Deprecated";
      stringArray0[4] = "Deprecated";
      MethodWriter methodWriter0 = new MethodWriter(classWriter0, 1, "k8\"Ufd", "", "Deprecated", stringArray0, false, false);
      methodWriter0.visitFrame(3, (-3994), stringArray0, (-3068), stringArray0);
      assertEquals(5, stringArray0.length);
  }

  @Test(timeout = 4000)
  public void test55()  throws Throwable  {
      ClassWriter classWriter0 = new ClassWriter((-275));
      String[] stringArray0 = new String[0];
      MethodWriter methodWriter0 = new MethodWriter(classWriter0, (-1616), "", "Fw)Nc6i2", "Fw)Nc6i2", stringArray0, true, false);
      methodWriter0.visitMaxs((-4095), 20);
      MethodWriter methodWriter1 = null;
      try {
        methodWriter1 = new MethodWriter(classWriter0, (-1616), "", (String) null, "JSR/RET are not supported with computeFrames option", stringArray0, true, false);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
      }
  }

  @Test(timeout = 4000)
  public void test56()  throws Throwable  {
      ClassWriter classWriter0 = mock(ClassWriter.class, new ViolatedAssumptionAnswer());
      doReturn(0, 0, 0, 0).when(classWriter0).newClass(anyString());
      doReturn(0, 0).when(classWriter0).newUTF8(anyString());
      String[] stringArray0 = new String[4];
      MethodWriter methodWriter0 = new MethodWriter(classWriter0, 2, "f!z1N1%", "f!z1N1%", ";:PH", stringArray0, false, false);
      // Undeclared exception!
      try { 
        methodWriter0.visitFrame(4, 55, stringArray0, 2203, stringArray0);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.mockito.asm.MethodWriter", e);
      }
  }

  @Test(timeout = 4000)
  public void test57()  throws Throwable  {
      ClassWriter classWriter0 = new ClassWriter((-257));
      String[] stringArray0 = new String[1];
      stringArray0[0] = "I;~G,BDd 8)MAb@k77";
      MethodWriter methodWriter0 = new MethodWriter(classWriter0, 2, "?6 eo", "I;~G,BDd 8)MAb@k77", "", stringArray0, true, true);
      methodWriter0.visitVarInsn(97, (-1720));
      MethodWriter methodWriter1 = null;
      try {
        methodWriter1 = new MethodWriter(classWriter0, 127, "8tM", "StackMapTable", "", stringArray0, true, true);
        fail("Expecting exception: StringIndexOutOfBoundsException");
      
      } catch(StringIndexOutOfBoundsException e) {
      }
  }

  @Test(timeout = 4000)
  public void test58()  throws Throwable  {
      ClassWriter classWriter0 = new ClassWriter((-258));
      String[] stringArray0 = new String[0];
      MethodWriter methodWriter0 = new MethodWriter(classWriter0, 34, "", "Fw)Nc6i2", "Fw)Nc6i2", stringArray0, false, false);
      MethodWriter methodWriter1 = null;
      try {
        methodWriter1 = new MethodWriter(classWriter0, (-32795), "RuntimeVisibleAnnotations", "}ML_hNrM+='", "RuntimeVisibleParameterAnnotations", stringArray0, true, true);
        fail("Expecting exception: StringIndexOutOfBoundsException");
      
      } catch(StringIndexOutOfBoundsException e) {
      }
  }

  @Test(timeout = 4000)
  public void test59()  throws Throwable  {
      ClassWriter classWriter0 = new ClassWriter(267386878);
      String[] stringArray0 = new String[0];
      MethodWriter methodWriter0 = new MethodWriter(classWriter0, (-1023), "RuntimeVisibleAnnotations", "RrG.gcRY1Z(_Pl4qG", "RuntimeInvisibleAnnotations", stringArray0, false, false);
      ByteVector byteVector0 = new ByteVector(1);
      methodWriter0.put(byteVector0);
      String[] stringArray1 = new String[3];
      stringArray1[0] = "value ";
      stringArray1[1] = "Signature";
      stringArray1[2] = "{c|[";
      MethodWriter methodWriter1 = null;
      try {
        methodWriter1 = new MethodWriter(classWriter0, 1, "RuntimeVisibleAnnotations", "AnnotationDefault", "value ", stringArray1, true, true);
        fail("Expecting exception: StringIndexOutOfBoundsException");
      
      } catch(StringIndexOutOfBoundsException e) {
      }
  }

  @Test(timeout = 4000)
  public void test60()  throws Throwable  {
      ClassWriter classWriter0 = new ClassWriter((-257));
      String[] stringArray0 = new String[1];
      stringArray0[0] = "I;~G,BDd 8)MAb@k77";
      MethodWriter methodWriter0 = new MethodWriter(classWriter0, 2, "?66", "I;~G,BDd 8)MAb@k77", "", stringArray0, true, true);
      Attribute attribute0 = new Attribute("");
      ByteVector byteVector0 = new ByteVector(3066);
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
  public void test61()  throws Throwable  {
      ClassWriter classWriter0 = mock(ClassWriter.class, new ViolatedAssumptionAnswer());
      doReturn(101).when(classWriter0).newClass(anyString());
      doReturn(1824, 1824, 1824, 1824, 16777215).when(classWriter0).newUTF8(anyString());
      String[] stringArray0 = new String[1];
      MethodWriter methodWriter0 = new MethodWriter(classWriter0, 2, ")", "", "", stringArray0, false, false);
      methodWriter0.visitVarInsn(16, 0);
      int int0 = methodWriter0.getSize();
      assertEquals(45, int0);
  }

  @Test(timeout = 4000)
  public void test62()  throws Throwable  {
      String[] stringArray0 = new String[1];
      stringArray0[0] = ")";
      ClassWriter classWriter0 = new ClassWriter(0);
      MethodWriter methodWriter0 = new MethodWriter(classWriter0, 14, "O7k#N&Ep](W8LEq", "", "O7k#N&Ep](W8LEq", stringArray0, false, false);
      methodWriter0.visitIincInsn(31, 31);
  }

  @Test(timeout = 4000)
  public void test63()  throws Throwable  {
      ClassWriter classWriter0 = new ClassWriter(61);
      MethodWriter methodWriter0 = new MethodWriter(classWriter0, 61, "ETT*Fr{l526(!IN*", "", "LocalVariableTypeTable", (String[]) null, false, false);
      Label label0 = new Label();
      methodWriter0.visitLocalVariable("8+?", "", ">ODw,B=_yOTV/", label0, label0, 1);
      methodWriter0.visitMethodInsn(164, "LocalVariableTypeTable", "V[v]wG^a{", "");
      ByteVector byteVector0 = new ByteVector(61);
      methodWriter0.put(byteVector0);
  }

  @Test(timeout = 4000)
  public void test64()  throws Throwable  {
      ClassWriter classWriter0 = new ClassWriter((-258));
      MethodWriter methodWriter0 = new MethodWriter(classWriter0, (-258), "%g*9hNVj", "_kv2j;", "_kv2j;", (String[]) null, false, false);
      methodWriter0.visitIntInsn(21, (-1128));
      classWriter0.toByteArray();
      MethodWriter methodWriter1 = new MethodWriter(classWriter0, 126, "_kv2j;", "%g*9hNVj", "#82s(ECP~0c^N", (String[]) null, false, false);
      assertFalse(methodWriter1.equals((Object)methodWriter0));
  }

  @Test(timeout = 4000)
  public void test65()  throws Throwable  {
      ClassWriter classWriter0 = new ClassWriter(0);
      MethodWriter methodWriter0 = new MethodWriter(classWriter0, (-2351), "8+?", "B>5t!ua_R7Jr=vUD>iX", "Class not found", (String[]) null, false, false);
      ByteVector byteVector0 = new ByteVector();
      methodWriter0.visitAnnotation("B>5t!ua_R7Jr=vUD>iX", false);
      methodWriter0.put(byteVector0);
  }

  @Test(timeout = 4000)
  public void test66()  throws Throwable  {
      ClassWriter classWriter0 = new ClassWriter((-257));
      String[] stringArray0 = new String[1];
      stringArray0[0] = "I;~G,BDd 8)MAb@k77";
      MethodWriter methodWriter0 = new MethodWriter(classWriter0, 2, "?6 eo", "I;~G,BDd 8)MAb@k77", "", stringArray0, true, true);
      methodWriter0.visitIincInsn(1291, 2);
  }

  @Test(timeout = 4000)
  public void test67()  throws Throwable  {
      ClassWriter classWriter0 = new ClassWriter((-257));
      String[] stringArray0 = new String[1];
      stringArray0[0] = "I;~G,BDd 8)MAb@k77";
      MethodWriter methodWriter0 = new MethodWriter(classWriter0, 2, "?6 eo", "I;~G,BDd 8)MAb@k77", "", stringArray0, true, true);
      methodWriter0.visitIincInsn(1, (-3860));
  }

  @Test(timeout = 4000)
  public void test68()  throws Throwable  {
      ClassWriter classWriter0 = new ClassWriter((-275));
      String[] stringArray0 = new String[0];
      MethodWriter methodWriter0 = new MethodWriter(classWriter0, (-1616), "", "Fw)Nc6i2", "Fw)Nc6i2", stringArray0, true, false);
      methodWriter0.visitIincInsn(83, (-4073));
  }

  @Test(timeout = 4000)
  public void test69()  throws Throwable  {
      ClassWriter classWriter0 = new ClassWriter((-258));
      String[] stringArray0 = new String[0];
      MethodWriter methodWriter0 = new MethodWriter(classWriter0, 50331648, "Fw)Nc6i2", "", "SourceDebugExtension", stringArray0, false, false);
      methodWriter0.visitIntInsn(3448, 50331648);
      ByteVector byteVector0 = new ByteVector();
      methodWriter0.put(byteVector0);
  }

  @Test(timeout = 4000)
  public void test70()  throws Throwable  {
      ClassWriter classWriter0 = new ClassWriter((-257));
      String[] stringArray0 = new String[1];
      stringArray0[0] = "I;~G,BDd 8)MAb@k77";
      MethodWriter methodWriter0 = new MethodWriter(classWriter0, 2, "?6 eo", "I;~G,BDd 8)MAb@k77", "", stringArray0, true, true);
      methodWriter0.visitMethodInsn(2, "I;~G,BDd 8)MAb@k77", "RuntimeInvisibleAnnotations", "StackMapTable");
      ByteVector byteVector0 = classWriter0.pool;
      methodWriter0.put(byteVector0);
  }

  @Test(timeout = 4000)
  public void test71()  throws Throwable  {
      ClassWriter classWriter0 = new ClassWriter((-254));
      MethodWriter methodWriter0 = new MethodWriter(classWriter0, (-539), "Synthetic", ":l0to0}a<E", ":l0to0}a<E", (String[]) null, false, false);
      methodWriter0.visitVarInsn(67, 1);
      methodWriter0.visitFrame(53, (-1261), (Object[]) null, (-254), (Object[]) null);
      ByteVector byteVector0 = new ByteVector();
      methodWriter0.put(byteVector0);
  }

  @Test(timeout = 4000)
  public void test72()  throws Throwable  {
      ClassWriter classWriter0 = mock(ClassWriter.class, new ViolatedAssumptionAnswer());
      doReturn((-4297)).when(classWriter0).newClass(anyString());
      doReturn((-4297), (-4297)).when(classWriter0).newUTF8(anyString());
      String[] stringArray0 = new String[1];
      MethodWriter methodWriter0 = new MethodWriter(classWriter0, 74, "RuntimeVisibleAnnotations", "Fw)Nc6i2", "RuntimeVisibleAnnotations", stringArray0, true, false);
      methodWriter0.visitMaxs((-550), (-1551));
  }

  @Test(timeout = 4000)
  public void test73()  throws Throwable  {
      ClassWriter classWriter0 = new ClassWriter((-275));
      String[] stringArray0 = new String[0];
      MethodWriter methodWriter0 = new MethodWriter(classWriter0, (-1616), "", "Fw)Nc6i2", "Fw)Nc6i2", stringArray0, true, false);
      methodWriter0.visitVarInsn(57, 9);
  }

  @Test(timeout = 4000)
  public void test74()  throws Throwable  {
      ClassWriter classWriter0 = new ClassWriter((-254));
      MethodWriter methodWriter0 = new MethodWriter(classWriter0, (-539), "Synthetic", ":l0to0}a<E", ":l0to0}a<E", (String[]) null, false, false);
      methodWriter0.visitVarInsn(67, 1);
      Label label0 = new Label();
      methodWriter0.visitTryCatchBlock(label0, label0, label0, "Synthetic");
      ByteVector byteVector0 = new ByteVector();
      methodWriter0.put(byteVector0);
  }

  @Test(timeout = 4000)
  public void test75()  throws Throwable  {
      ClassWriter classWriter0 = new ClassWriter((-257));
      String[] stringArray0 = new String[1];
      stringArray0[0] = "I;~G,BDd 8)MAb@k77";
      MethodWriter methodWriter0 = new MethodWriter(classWriter0, 2, "?6 eo", "I;~G,BDd 8)MAb@k77", "", stringArray0, true, true);
      Label label0 = new Label();
      methodWriter0.visitLocalVariable("_@b*k~M`w-Evq7YR*i", "I;~G,BDd 8)MAb@k77", (String) null, label0, label0, 69);
  }

  @Test(timeout = 4000)
  public void test76()  throws Throwable  {
      ClassWriter classWriter0 = mock(ClassWriter.class, new ViolatedAssumptionAnswer());
      doReturn(169, (-1048576), 16777220).when(classWriter0).newClass(anyString());
      doReturn((-1048576), (-863)).when(classWriter0).newUTF8(anyString());
      String[] stringArray0 = new String[3];
      MethodWriter methodWriter0 = new MethodWriter(classWriter0, 1, "Fw)Nc6i2", "Fw)Nc6i2", "ConstantValue", stringArray0, true, false);
      methodWriter0.visitInsn(74);
  }

  @Test(timeout = 4000)
  public void test77()  throws Throwable  {
      ClassWriter classWriter0 = new ClassWriter(267386880);
      MethodWriter methodWriter0 = new MethodWriter(classWriter0, 61, "ETT*Fr{l526(!IN*", "H$d)^A7wn", "LocalVariableTypeTable", (String[]) null, true, true);
      methodWriter0.visitIincInsn(131072, 131072);
      MethodWriter methodWriter1 = null;
      try {
        methodWriter1 = new MethodWriter(classWriter0, (-567), "O7k#N&Ep](W8LEq", "=SE`QwW-Ab!=u", "upc`&", (String[]) null, true, false);
        fail("Expecting exception: StringIndexOutOfBoundsException");
      
      } catch(StringIndexOutOfBoundsException e) {
      }
  }

  @Test(timeout = 4000)
  public void test78()  throws Throwable  {
      ClassWriter classWriter0 = new ClassWriter((-275));
      String[] stringArray0 = new String[0];
      MethodWriter methodWriter0 = new MethodWriter(classWriter0, (-1616), "", "Fw)Nc6i2", "Fw)Nc6i2", stringArray0, true, false);
      methodWriter0.visitIincInsn(1, 1);
      MethodWriter methodWriter1 = null;
      try {
        methodWriter1 = new MethodWriter(classWriter0, (-1616), "", (String) null, "JSR/RET are not supported with computeFrames option", stringArray0, true, false);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
      }
  }

  @Test(timeout = 4000)
  public void test79()  throws Throwable  {
      ClassWriter classWriter0 = new ClassWriter(33554432);
      String[] stringArray0 = new String[4];
      stringArray0[0] = "<init>";
      stringArray0[1] = "";
      stringArray0[2] = "<init>";
      stringArray0[3] = "<init>";
      MethodWriter methodWriter0 = new MethodWriter(classWriter0, 1214, "", "<init>", "", stringArray0, false, false);
      methodWriter0.visitVarInsn(1214, 1214);
      MethodWriter methodWriter1 = new MethodWriter(classWriter0, (-521), "<init>", "HkO/31", "java/lang/String", stringArray0, false, false);
      assertFalse(methodWriter1.equals((Object)methodWriter0));
  }

  @Test(timeout = 4000)
  public void test80()  throws Throwable  {
      ClassWriter classWriter0 = new ClassWriter((-4273));
      String[] stringArray0 = new String[1];
      stringArray0[0] = "RuntimeVisibleAnnotations";
      MethodWriter methodWriter0 = new MethodWriter(classWriter0, 13, "Fw)Nc6i2", "b:$!^R(o:W)$eX3&N7", "b:$!^R(o:W)$eX3&N7", stringArray0, false, false);
      classWriter0.toByteArray();
      MethodWriter methodWriter1 = null;
      try {
        methodWriter1 = new MethodWriter(classWriter0, 13, (String) null, "mPQUZvet|:", "mPQUZvet|:", stringArray0, true, false);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
      }
  }

  @Test(timeout = 4000)
  public void test81()  throws Throwable  {
      ClassWriter classWriter0 = new ClassWriter((-258));
      String[] stringArray0 = new String[0];
      MethodWriter methodWriter0 = new MethodWriter(classWriter0, 2, "LineNumberTable", "X-(Hy", "Fw)Nc6i2", stringArray0, false, false);
      methodWriter0.visitMethodInsn((-258), "Fw)Nc6i2", "L/I#3gM_/hG", "Fw)Nc6i2");
      int int0 = methodWriter0.getSize();
      assertEquals(37, int0);
  }

  @Test(timeout = 4000)
  public void test82()  throws Throwable  {
      ClassWriter classWriter0 = new ClassWriter(267386878);
      String[] stringArray0 = new String[0];
      MethodWriter methodWriter0 = new MethodWriter(classWriter0, (-1023), "RuntimeVisibleAnnotations", "RrG.gcRY1Z(_Pl4qG", "RuntimeInvisibleAnnotations", stringArray0, false, false);
      methodWriter0.visitFieldInsn(50, "cJ8MO\u0000(nO}t_P", "n$#B ~66efBO7UMnR", "RuntimeVisibleAnnotations");
  }
}
