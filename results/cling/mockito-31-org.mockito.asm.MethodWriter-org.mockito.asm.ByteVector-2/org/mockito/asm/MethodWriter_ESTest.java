/*

 * Tue Mar 03 14:29:34 GMT 2020
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
import org.mockito.asm.Item;
import org.mockito.asm.Label;
import org.mockito.asm.MethodWriter;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = false, useJEE = true) 
public class MethodWriter_ESTest extends MethodWriter_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test00()  throws Throwable  {
      int[] intArray0 = new int[4];
      int int0 = MethodWriter.getNewOffset(intArray0, intArray0, (-1213), 2270);
      assertEquals(3483, int0);
  }

  @Test(timeout = 4000)
  public void test01()  throws Throwable  {
      ClassWriter classWriter0 = mock(ClassWriter.class, new ViolatedAssumptionAnswer());
      doReturn(2844, 2844, 2844, 2844, 2844).when(classWriter0).newClass(anyString());
      doReturn(2844, 2844).when(classWriter0).newUTF8(anyString());
      String[] stringArray0 = new String[9];
      MethodWriter methodWriter0 = new MethodWriter(classWriter0, 2, "rvz?),Ofk@ O/Y3", "rvz?),Ofk@ O/Y3", "rvz?),Ofk@ O/Y3", stringArray0, true, true);
      methodWriter0.visitVarInsn(2, 59);
      Label label0 = new Label();
      methodWriter0.visitLabel(label0);
  }

  @Test(timeout = 4000)
  public void test02()  throws Throwable  {
      ClassWriter classWriter0 = new ClassWriter(2270);
      MethodWriter methodWriter0 = new MethodWriter(classWriter0, 2357, "Ljava/lang/Synthetic;", "rvz?),Ofk@ O/Y3", "rvz?),Ofk@ O/Y3", (String[]) null, true, true);
      MethodWriter methodWriter1 = new MethodWriter(classWriter0, 1, "YT=xXr'bU69#C", "m_j5?JV/^Gm:vS)V", "m_j5?JV/^Gm:vS)V", (String[]) null, false, false);
      // Undeclared exception!
      try { 
        methodWriter0.visitMaxs(2357, 1);
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // 15
         //
         verifyException("org.mockito.asm.Type", e);
      }
  }

  @Test(timeout = 4000)
  public void test03()  throws Throwable  {
      ClassWriter classWriter0 = new ClassWriter(2357);
      String[] stringArray0 = new String[0];
      MethodWriter methodWriter0 = new MethodWriter(classWriter0, 81, "Ljava/lang/Synthetic;", "Ljava/lang/Synthetic;", "Ljava/lang/Synthetic;", stringArray0, false, false);
      methodWriter0.classReaderOffset = 1573;
      MethodWriter methodWriter1 = new MethodWriter(classWriter0, 1573, "[", "java/lang/Object", "java/lang/Object", stringArray0, false, false);
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
  public void test04()  throws Throwable  {
      ClassWriter classWriter0 = new ClassWriter(2270);
      MethodWriter methodWriter0 = new MethodWriter(classWriter0, 2357, "Ljava/lang/Synthetic;", "rvz?),Ofk@ O/Y3", "LocalVariableTable", (String[]) null, true, true);
      methodWriter0.visitIincInsn(1, 2270);
  }

  @Test(timeout = 4000)
  public void test05()  throws Throwable  {
      ClassWriter classWriter0 = mock(ClassWriter.class, new ViolatedAssumptionAnswer());
      doReturn(0, 0, 0, 0, 0).when(classWriter0).newClass(anyString());
      doReturn(1163, 1163).when(classWriter0).newUTF8(anyString());
      String[] stringArray0 = new String[9];
      MethodWriter methodWriter0 = new MethodWriter(classWriter0, 2, "rvz?),Ofk@ O/Y3", "rvz?),Ofk@ O/Y3", "rvz?),Ofk@ O/Y3", stringArray0, true, true);
      ClassWriter classWriter1 = new ClassWriter((-54));
      Item item0 = classWriter1.newLong(16777228);
      assertNotNull(item0);
  }

  @Test(timeout = 4000)
  public void test06()  throws Throwable  {
      String[] stringArray0 = new String[0];
      ClassWriter classWriter0 = new ClassWriter(3102);
      MethodWriter methodWriter0 = new MethodWriter(classWriter0, (-1298), "]t:^0GA|&Dl9hL-X;", "sJ{v5QqYqT[;s", "sJ{v5QqYqT[;s", stringArray0, false, false);
      Item item0 = classWriter0.newLong((-1298));
      assertNotNull(item0);
  }

  @Test(timeout = 4000)
  public void test07()  throws Throwable  {
      int[] intArray0 = new int[6];
      Label label0 = new Label();
      MethodWriter.getNewOffset(intArray0, intArray0, label0);
      MethodWriter.getNewOffset(intArray0, intArray0, label0);
      assertArrayEquals(new int[] {0, 0, 0, 0, 0, 0}, intArray0);
  }

  @Test(timeout = 4000)
  public void test08()  throws Throwable  {
      ClassWriter classWriter0 = new ClassWriter(2357);
      MethodWriter methodWriter0 = new MethodWriter(classWriter0, 2357, "Ljava/lang/Synthetic;", "rvz?),Ofk@ O/Y3", "LocalVariableTable", (String[]) null, true, true);
      String[] stringArray0 = new String[6];
      stringArray0[0] = "3B\"Pld]V6";
      stringArray0[1] = "Ljava/lang/Synthetic;";
      stringArray0[2] = "LocalVariableTable";
      stringArray0[3] = "LocalVariableTable";
      stringArray0[4] = "LocalVariableTable";
      stringArray0[5] = "3B\"Pld]V6";
      MethodWriter methodWriter1 = new MethodWriter(classWriter0, 1, "rvz?),Ofk@ O/Y3", "rvz?),Ofk@ O/Y3", "3B\"Pld]V6", stringArray0, true, false);
      methodWriter0.visitLdcInsn("LocalVariableTable");
      assertNotSame(methodWriter0, methodWriter1);
  }

  @Test(timeout = 4000)
  public void test09()  throws Throwable  {
      ClassWriter classWriter0 = new ClassWriter(2357);
      MethodWriter methodWriter0 = new MethodWriter(classWriter0, 1544, "Ljava/lang/Synthetic;", "LocalVariableTable", "%+P M\u0007,-8`/W WI1Y(", (String[]) null, false, false);
      methodWriter0.visitFieldInsn(2357, "AwYLwtgH]&myD VW", "AwYLwtgH]&myD VW", "Ljava/lang/Synthetic;");
  }

  @Test(timeout = 4000)
  public void test10()  throws Throwable  {
      Label label0 = mock(Label.class, new ViolatedAssumptionAnswer());
      ClassWriter classWriter0 = new ClassWriter(2270);
      String[] stringArray0 = new String[4];
      stringArray0[0] = "float";
      stringArray0[1] = "7m";
      stringArray0[2] = "Ljava/lang/Synthetic;";
      stringArray0[3] = "7m";
      MethodWriter methodWriter0 = new MethodWriter(classWriter0, 2357, "7m", "rvz?),Ofk@ O/Y3", "Ljava/lang/Synthetic;", stringArray0, false, false);
      methodWriter0.visitLocalVariable("VR1Kx1H'\"]kt'", "float", "#k, 6veA", label0, label0, 2);
  }

  @Test(timeout = 4000)
  public void test11()  throws Throwable  {
      String[] stringArray0 = new String[0];
      ClassWriter classWriter0 = new ClassWriter(3102);
      MethodWriter methodWriter0 = new MethodWriter(classWriter0, (-1275), "]t:^0GA|4&Dl9hL-;", "sJ{v5QqYqT[;s", "Co", stringArray0, false, false);
      methodWriter0.visitFrame(1009, 10, stringArray0, 268, stringArray0);
      methodWriter0.visitFrame((-426), 10, stringArray0, 10, stringArray0);
      assertEquals(0, stringArray0.length);
  }

  @Test(timeout = 4000)
  public void test12()  throws Throwable  {
      ClassWriter classWriter0 = new ClassWriter(2357);
      String[] stringArray0 = new String[0];
      MethodWriter methodWriter0 = new MethodWriter(classWriter0, 81, "Ljava/lang/Synthetic;", "Ljava/lang/Synthetic;", "Ljava/lang/Synthetic;", stringArray0, false, false);
      methodWriter0.visitMultiANewArrayInsn("java/lang/Object", 47);
      MethodWriter methodWriter1 = new MethodWriter(classWriter0, 1573, "[", "java/lang/Object", "java/lang/Object", stringArray0, false, false);
      byte[] byteArray0 = classWriter0.toByteArray();
      assertEquals(147, byteArray0.length);
  }

  @Test(timeout = 4000)
  public void test13()  throws Throwable  {
      ClassWriter classWriter0 = mock(ClassWriter.class, new ViolatedAssumptionAnswer());
      doReturn(0, 0, 0, 0, 0).when(classWriter0).newClass(anyString());
      doReturn(0, 0).when(classWriter0).newUTF8(anyString());
      String[] stringArray0 = new String[8];
      MethodWriter methodWriter0 = new MethodWriter(classWriter0, 2, "6F!l", "m_j5?JV/^Gm:vS)V", "m_j5?JV/^Gm:vS)V", stringArray0, true, true);
  }

  @Test(timeout = 4000)
  public void test14()  throws Throwable  {
      ClassWriter classWriter0 = new ClassWriter(2270);
      MethodWriter methodWriter0 = new MethodWriter(classWriter0, 2357, "Ljava/lang/Synthetic;", "rvz?),Ofk@ O/Y3", "LocalVariableTable", (String[]) null, true, true);
      int[] intArray0 = new int[8];
      intArray0[2] = 2270;
      int int0 = MethodWriter.getNewOffset(intArray0, intArray0, 25165824, 2);
      assertEquals((-25168092), int0);
  }

  @Test(timeout = 4000)
  public void test15()  throws Throwable  {
      String[] stringArray0 = new String[0];
      ClassWriter classWriter0 = new ClassWriter(92);
      MethodWriter methodWriter0 = new MethodWriter(classWriter0, 575, "java/lang/Throwable", "%+P M\u0007,-8`/W WI1Y(", "LocalVariableTable", stringArray0, false, false);
      int[] intArray0 = new int[7];
      int int0 = MethodWriter.getNewOffset(intArray0, intArray0, 92, (-3776));
      assertEquals((-3868), int0);
  }

  @Test(timeout = 4000)
  public void test16()  throws Throwable  {
      ClassWriter classWriter0 = new ClassWriter(2357);
      String[] stringArray0 = new String[0];
      MethodWriter methodWriter0 = new MethodWriter(classWriter0, 2, "`U#&e:Gx", "m_j5?V/^Gm:vS)V", "%+P M\u0007,-8`/W WI1Y(", stringArray0, true, true);
      // Undeclared exception!
      try { 
        methodWriter0.visitMaxs(2357, 2357);
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // 16
         //
         verifyException("org.mockito.asm.Type", e);
      }
  }

  @Test(timeout = 4000)
  public void test17()  throws Throwable  {
      ClassWriter classWriter0 = mock(ClassWriter.class, new ViolatedAssumptionAnswer());
      doReturn(2844, 1163, 2844, 1163, 2844).when(classWriter0).newClass(anyString());
      doReturn(1163, 1163).when(classWriter0).newUTF8(anyString());
      String[] stringArray0 = new String[9];
      MethodWriter methodWriter0 = new MethodWriter(classWriter0, 2, "rvz?),Ofk@ O/Y3", "rvz?),Ofk@ O/Y3", "rvz?),Ofk@ O/Y3", stringArray0, true, true);
      methodWriter0.visitVarInsn(2, 59);
      methodWriter0.visitVarInsn(2, 59);
  }

  @Test(timeout = 4000)
  public void test18()  throws Throwable  {
      ClassWriter classWriter0 = mock(ClassWriter.class, new ViolatedAssumptionAnswer());
      doReturn(2844, 2844, 2253, 2844, 2253).when(classWriter0).newClass(anyString());
      doReturn(2844, 2844).when(classWriter0).newUTF8(anyString());
      String[] stringArray0 = new String[9];
      MethodWriter methodWriter0 = new MethodWriter(classWriter0, 2, "rvz?),Ofk@ O/Y3", "rvz?),Ofk@ O/Y3", "rvz?),Ofk@ O/Y3", stringArray0, true, true);
      // Undeclared exception!
      try { 
        methodWriter0.visitMaxs(2253, 2253);
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // 15
         //
         verifyException("org.mockito.asm.Type", e);
      }
  }

  @Test(timeout = 4000)
  public void test19()  throws Throwable  {
      ClassWriter classWriter0 = new ClassWriter(2357);
      MethodWriter methodWriter0 = new MethodWriter(classWriter0, 1544, "Ljava/lang/Synthetic;", "LocalVariableTable", "%+P M\u0007,-8`/W WI1Y(", (String[]) null, false, false);
      MethodWriter methodWriter1 = new MethodWriter(classWriter0, 1544, "%+P M\u0007,-8`/W WI1Y(", "dt3O)1@Xjs3W", "@dzxe(", (String[]) null, false, true);
      methodWriter1.visitMethodInsn(14, "Rl;_G\"F\u0007[", "java/lang/Throwable", "");
      assertNotSame(methodWriter1, methodWriter0);
  }

  @Test(timeout = 4000)
  public void test20()  throws Throwable  {
      ClassWriter classWriter0 = new ClassWriter(2357);
      String[] stringArray0 = new String[0];
      MethodWriter methodWriter0 = new MethodWriter(classWriter0, 81, "%+P M\u0007,-8`/W WI1Y(", "Ljava/lang/Synthetic;", "Ljava/lang/Synthetic;", stringArray0, false, false);
      MethodWriter methodWriter1 = new MethodWriter(classWriter0, 2, "`U#&:Gx", "m_j5?V/^Gm:vS)V", "%+P M\u0007,-8`/W WI1Y(", stringArray0, true, false);
      methodWriter0.visitVarInsn(1829, 1);
      assertNotSame(methodWriter0, methodWriter1);
  }

  @Test(timeout = 4000)
  public void test21()  throws Throwable  {
      String[] stringArray0 = new String[0];
      ClassWriter classWriter0 = new ClassWriter(3102);
      MethodWriter methodWriter0 = new MethodWriter(classWriter0, (-1275), "]t:^0GA|&Dl9hL-X;", "sJ{v5QqYqT[;s", "sJ{v5QqYqT[;s", stringArray0, false, false);
      ByteVector byteVector0 = classWriter0.pool;
      byteVector0.putByte((-1466));
      methodWriter0.put(byteVector0);
      MethodWriter methodWriter1 = null;
      try {
        methodWriter1 = new MethodWriter(classWriter0, (-1275), "RuntimeVisibleParameterAnnotations", "]t:^0GA|&Dl9hL-X;", "sJ{v5QqYqT[;s", stringArray0, true, true);
        fail("Expecting exception: StringIndexOutOfBoundsException");
      
      } catch(StringIndexOutOfBoundsException e) {
      }
  }

  @Test(timeout = 4000)
  public void test22()  throws Throwable  {
      ClassWriter classWriter0 = new ClassWriter(2357);
      MethodWriter methodWriter0 = new MethodWriter(classWriter0, 2357, "Ljava/lang/Synthetic;", "rvz?),Ofk@ O/Y3", "LocalVariableTable", (String[]) null, true, true);
      String[] stringArray0 = new String[6];
      stringArray0[0] = "3B\"Pld]V6";
      stringArray0[1] = "Ljava/lang/Synthetic;";
      stringArray0[2] = "LocalVariableTable";
      stringArray0[3] = "LocalVariableTable";
      stringArray0[4] = "LocalVariableTable";
      stringArray0[5] = "3B\"Pld]V6";
      MethodWriter methodWriter1 = new MethodWriter(classWriter0, 1, "rvz?),Ofk@ O/Y3", "rvz?),Ofk@ O/Y3", "3B\"Pld]V6", stringArray0, true, false);
      methodWriter1.visitFieldInsn(2357, "<init>", "[9@!t>bG:a|TY)&", "&U<Ne7Ov#eMnr");
      assertNotSame(methodWriter1, methodWriter0);
  }

  @Test(timeout = 4000)
  public void test23()  throws Throwable  {
      ClassWriter classWriter0 = new ClassWriter(3234);
      String[] stringArray0 = new String[0];
      MethodWriter methodWriter0 = new MethodWriter(classWriter0, 1, "RuntimeInvisibleParameterAnnotations", "!", "RuntimeInvisibleParameterAnnotations", stringArray0, false, false);
      ByteVector byteVector0 = new ByteVector(2);
      MethodWriter methodWriter1 = new MethodWriter(classWriter0, (-1455), "", "[D\u0002<)tO/,]0A}4)S", "RuntimeInvisibleParameterAnnotations", stringArray0, false, false);
      methodWriter1.put(byteVector0);
      assertNotSame(methodWriter1, methodWriter0);
  }

  @Test(timeout = 4000)
  public void test24()  throws Throwable  {
      ClassWriter classWriter0 = new ClassWriter(2357);
      String[] stringArray0 = new String[0];
      MethodWriter methodWriter0 = new MethodWriter(classWriter0, 81, "%+P M\u0007,-8`/W WI1Y(", "Ljava/lang/Synthetic;", "Ljava/lang/Synthetic;", stringArray0, false, false);
      // Undeclared exception!
      try { 
        methodWriter0.visitFrame(1, 2357, stringArray0, (-2031), stringArray0);
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // 0
         //
         verifyException("org.mockito.asm.MethodWriter", e);
      }
  }

  @Test(timeout = 4000)
  public void test25()  throws Throwable  {
      ClassWriter classWriter0 = new ClassWriter(2270);
      MethodWriter methodWriter0 = new MethodWriter(classWriter0, 1, "YT=xXr'bU69#C", "m_j5?V/^Gm:vS)V", "m_j5?V/^Gm:vS)V", (String[]) null, false, false);
      methodWriter0.visitFrame(1, (-826), (Object[]) null, 2, (Object[]) null);
  }

  @Test(timeout = 4000)
  public void test26()  throws Throwable  {
      ClassWriter classWriter0 = new ClassWriter(3234);
      String[] stringArray0 = new String[0];
      MethodWriter methodWriter0 = new MethodWriter(classWriter0, 4055, "nB;)rD", "nB;)rD", "nB;)rD", stringArray0, true, true);
      methodWriter0.visitVarInsn(2, 182);
      MethodWriter methodWriter1 = new MethodWriter(classWriter0, 62, "(>(<'85fc}.", "nB;)rD", "(-!.a{w=J{XO.K;", stringArray0, false, true);
      assertFalse(methodWriter1.equals((Object)methodWriter0));
  }

  @Test(timeout = 4000)
  public void test27()  throws Throwable  {
      ClassWriter classWriter0 = new ClassWriter(2270);
      String[] stringArray0 = new String[1];
      stringArray0[0] = "ZzqVoQ5iMc76}%l";
      MethodWriter methodWriter0 = new MethodWriter(classWriter0, 218, "ZzqVoQ5iMc76}%l", "=.wH", "Ljava/lag/Synthetic;", stringArray0, false, false);
      MethodWriter methodWriter1 = new MethodWriter(classWriter0, 82, ",OFn%tSl<wL#)id_]ab", "Exceptions", "=.wH", stringArray0, false, false);
      ByteVector byteVector0 = classWriter0.pool;
      methodWriter0.put(byteVector0);
      assertNotSame(methodWriter0, methodWriter1);
  }

  @Test(timeout = 4000)
  public void test28()  throws Throwable  {
      ClassWriter classWriter0 = new ClassWriter(3234);
      MethodWriter methodWriter0 = new MethodWriter(classWriter0, 2, ")[ p^B V", "`u(c&l[jM*~Ye\"8CZ^", (String) null, (String[]) null, false, false);
      ByteVector byteVector0 = classWriter0.pool;
      methodWriter0.put(byteVector0);
      MethodWriter methodWriter1 = null;
      try {
        methodWriter1 = new MethodWriter(classWriter0, (-3119), "RuntimeVisibleParameterAnnotations", ")[ p^B V", ")[ p^B V", (String[]) null, false, true);
        fail("Expecting exception: StringIndexOutOfBoundsException");
      
      } catch(StringIndexOutOfBoundsException e) {
      }
  }

  @Test(timeout = 4000)
  public void test29()  throws Throwable  {
      ClassWriter classWriter0 = new ClassWriter((-1439));
      String[] stringArray0 = new String[2];
      stringArray0[0] = "[]";
      stringArray0[1] = "rvz?),Ofk@ O/Y3";
      MethodWriter methodWriter0 = null;
      try {
        methodWriter0 = new MethodWriter(classWriter0, 125, "rvz?),Ofk@ O/Y3", "AAAAAAAAAAAAAAAABCKLLDDDDDEEEEEEEEEEEEEEEEEEEEAAAAAAAADDDDDEEEEEEEEEEEEEEEEEEEEAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAMAAAAAAAAAAAAAAAAAAAAIIIIIIIIIIIIIIIIDNOAAAAAAGGGGGGGHAFBFAAFFAAQPIIJJIIIIIIIIIIIIIIIIII", "@gOFe", stringArray0, true, true);
        fail("Expecting exception: StringIndexOutOfBoundsException");
      
      } catch(StringIndexOutOfBoundsException e) {
      }
  }

  @Test(timeout = 4000)
  public void test30()  throws Throwable  {
      int[] intArray0 = new int[1];
      intArray0[0] = 2357;
      ClassWriter classWriter0 = new ClassWriter(2357);
      String[] stringArray0 = new String[4];
      stringArray0[0] = "rvz?),Ofk@ O/Y3";
      stringArray0[1] = "";
      stringArray0[2] = "Ljava/lag/Synthetic;";
      stringArray0[3] = "";
      MethodWriter methodWriter0 = new MethodWriter(classWriter0, 2357, "", "rvz?),Ofk@ O/Y3", "Ljava/lag/Synthetic;", stringArray0, false, false);
      int int0 = MethodWriter.getNewOffset(intArray0, intArray0, 70, 70);
      assertEquals(0, int0);
  }

  @Test(timeout = 4000)
  public void test31()  throws Throwable  {
      String[] stringArray0 = new String[0];
      int[] intArray0 = new int[6];
      intArray0[0] = 2899;
      Label label0 = new Label();
      MethodWriter.getNewOffset(intArray0, intArray0, label0);
      ClassWriter classWriter0 = new ClassWriter(0);
      MethodWriter methodWriter0 = new MethodWriter(classWriter0, 1, "<init>", "rvz?),Ofk@ O/Y3", "nB;)rD", stringArray0, true, false);
  }

  @Test(timeout = 4000)
  public void test32()  throws Throwable  {
      ClassWriter classWriter0 = new ClassWriter(3234);
      String[] stringArray0 = new String[0];
      MethodWriter methodWriter0 = new MethodWriter(classWriter0, 1, "RuntimenvisibleParameterAnnoations", "!", "RuntimenvisibleParameterAnnoations", stringArray0, false, false);
      methodWriter0.visitAnnotationDefault();
      ByteVector byteVector0 = new ByteVector();
      methodWriter0.put(byteVector0);
      MethodWriter methodWriter1 = null;
      try {
        methodWriter1 = new MethodWriter(classWriter0, (-1455), "RuntimenvisibleParameterAnnoations", "!", "vG", stringArray0, true, true);
        fail("Expecting exception: StringIndexOutOfBoundsException");
      
      } catch(StringIndexOutOfBoundsException e) {
      }
  }

  @Test(timeout = 4000)
  public void test33()  throws Throwable  {
      ClassWriter classWriter0 = new ClassWriter(2357);
      MethodWriter methodWriter0 = new MethodWriter(classWriter0, 2357, "Ljava/lang/Synthetic;", "rvz?),Ofk@ O/Y3", "LocalVariableTable", (String[]) null, true, true);
      methodWriter0.visitInsn(2);
      String[] stringArray0 = new String[0];
      MethodWriter methodWriter1 = new MethodWriter(classWriter0, 16, "LocalVariableTable", "YTxr'bU69#C", "RuntimeInvisibleParameterAnnotations", stringArray0, false, false);
      assertFalse(methodWriter1.equals((Object)methodWriter0));
  }

  @Test(timeout = 4000)
  public void test34()  throws Throwable  {
      String[] stringArray0 = new String[0];
      ClassWriter classWriter0 = new ClassWriter(92);
      MethodWriter methodWriter0 = new MethodWriter(classWriter0, 575, "%+P M\u0007,-8`/W WI1Y(", "%+P M\u0007,-8`/W WI1Y(", "LocalVariableTable", stringArray0, false, false);
      methodWriter0.visitInsn(2);
  }

  @Test(timeout = 4000)
  public void test35()  throws Throwable  {
      int[] intArray0 = new int[1];
      intArray0[0] = 2357;
      Label label0 = mock(Label.class, new ViolatedAssumptionAnswer());
      ClassWriter classWriter0 = new ClassWriter(2357);
      MethodWriter methodWriter0 = new MethodWriter(classWriter0, 1544, "Ljava/lang/Synthetic;", "LocalVariableTable", "%+P M\u0007,-8`/W WI1Y(", (String[]) null, false, false);
      MethodWriter.getNewOffset(intArray0, intArray0, label0);
      MethodWriter methodWriter1 = new MethodWriter(classWriter0, 1544, "%+P M\u0007,-8`/W WI1Y(", "dt3O)1@Xjs3W", "@dzxe(", (String[]) null, false, true);
      assertFalse(methodWriter1.equals((Object)methodWriter0));
  }

  @Test(timeout = 4000)
  public void test36()  throws Throwable  {
      ClassWriter classWriter0 = new ClassWriter(2351);
      MethodWriter methodWriter0 = new MethodWriter(classWriter0, 2351, "Ljava/lang/Synthetic;", "rvz?),Ofk@ O/Y3", "LocalVariableTable", (String[]) null, true, true);
      methodWriter0.visitVarInsn(125, 2);
  }

  @Test(timeout = 4000)
  public void test37()  throws Throwable  {
      String[] stringArray0 = new String[0];
      ClassWriter classWriter0 = new ClassWriter(0);
      MethodWriter methodWriter0 = new MethodWriter(classWriter0, 1, "<init>", "rvz?),Ofk@ O/Y3", "nB;)rD", stringArray0, true, false);
      methodWriter0.visitLdcInsn("]Y[");
      MethodWriter methodWriter1 = new MethodWriter(classWriter0, 20, "rvz?),Ofk@ O/Y3", "nB;)rD", "rvz?),Ofk@ O/Y3", stringArray0, false, false);
      assertFalse(methodWriter1.equals((Object)methodWriter0));
  }

  @Test(timeout = 4000)
  public void test38()  throws Throwable  {
      ClassWriter classWriter0 = new ClassWriter(2357);
      String[] stringArray0 = new String[0];
      MethodWriter methodWriter0 = new MethodWriter(classWriter0, 16, "LocalVariableTable", "YTxr'bU69#C", "RuntimeInvisibleParameterAnnotations", stringArray0, false, false);
      methodWriter0.visitMaxs(1, 123);
  }

  @Test(timeout = 4000)
  public void test39()  throws Throwable  {
      ClassWriter classWriter0 = new ClassWriter(2357);
      String[] stringArray0 = new String[0];
      MethodWriter methodWriter0 = new MethodWriter(classWriter0, 2, "`U#&:Gx", "m_j5?V/^Gm:vS)V", "%+P M\u0007,-8`/W WI1Y(", stringArray0, true, false);
      // Undeclared exception!
      try { 
        methodWriter0.visitVarInsn((-4977), 1050);
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // -4977
         //
         verifyException("org.mockito.asm.MethodWriter", e);
      }
  }

  @Test(timeout = 4000)
  public void test40()  throws Throwable  {
      ClassWriter classWriter0 = mock(ClassWriter.class, new ViolatedAssumptionAnswer());
      doReturn(Integer.MAX_VALUE, Integer.MAX_VALUE, 2357).when(classWriter0).newClass(anyString());
      doReturn(1544, 2510).when(classWriter0).newUTF8(anyString());
      String[] stringArray0 = new String[3];
      MethodWriter methodWriter0 = new MethodWriter(classWriter0, 0, "YT=xXr'bU69#C", "Ljava/lang/Synthetic;", "YT=xXr'bU69#C", stringArray0, false, false);
      methodWriter0.visitInsn(1544);
  }

  @Test(timeout = 4000)
  public void test41()  throws Throwable  {
      ClassWriter classWriter0 = new ClassWriter((-1133));
      String[] stringArray0 = new String[9];
      stringArray0[0] = "Q/j?A>RKO";
      stringArray0[1] = "Signature";
      stringArray0[2] = "";
      stringArray0[3] = "Signature";
      stringArray0[4] = "";
      stringArray0[5] = "";
      stringArray0[6] = "Q/j?A>RKO";
      stringArray0[7] = "Q/j?A>RKO";
      stringArray0[8] = "Q/j?A>RKO";
      MethodWriter methodWriter0 = new MethodWriter(classWriter0, 20, "", "Signature", "Q/j?A>RKO", (String[]) null, false, false);
      methodWriter0.visitMethodInsn(267386880, "AAAAAAAAAAAAAAAABCKLLDDDDDEEEEEEEEEEEEEEEEEEEEAAAAAAAADDDDDEEEEEEEEEEEEEEEEEEEEAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAMAAAAAAAAAAAAAAAAAAAAIIIIIIIIIIIIIIIIDNOAAAAAAGGGGGGGHAFBFAAFFAAQPIIJJIIIIIIIIIIIIIIIIII", "Signature", "AAAAAAAAAAAAAAAABCKLLDDDDDEEEEEEEEEEEEEEEEEEEEAAAAAAAADDDDDEEEEEEEEEEEEEEEEEEEEAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAMAAAAAAAAAAAAAAAAAAAAIIIIIIIIIIIIIIIIDNOAAAAAAGGGGGGGHAFBFAAFFAAQPIIJJIIIIIIIIIIIIIIIIII");
      MethodWriter methodWriter1 = null;
      try {
        methodWriter1 = new MethodWriter(classWriter0, 2, "Signature", "Signature", "AAAAAAAAAAAAAAAABCKLLDDDDDEEEEEEEEEEEEEEEEEEEEAAAAAAAADDDDDEEEEEEEEEEEEEEEEEEEEAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAMAAAAAAAAAAAAAAAAAAAAIIIIIIIIIIIIIIIIDNOAAAAAAGGGGGGGHAFBFAAFFAAQPIIJJIIIIIIIIIIIIIIIIII", stringArray0, false, true);
        fail("Expecting exception: StringIndexOutOfBoundsException");
      
      } catch(StringIndexOutOfBoundsException e) {
      }
  }

  @Test(timeout = 4000)
  public void test42()  throws Throwable  {
      ClassWriter classWriter0 = new ClassWriter(3234);
      MethodWriter methodWriter0 = new MethodWriter(classWriter0, 2, ")[ p^B V", "`u(c&l[jM*~Ye\"8CZ^", (String) null, (String[]) null, false, false);
      classWriter0.newLong(1);
      MethodWriter methodWriter1 = null;
      try {
        methodWriter1 = new MethodWriter(classWriter0, 9, "LocalVariableTable", "LocalVariableTable", "`u(c&l[jM*~Ye\"8CZ^", (String[]) null, true, false);
        fail("Expecting exception: StringIndexOutOfBoundsException");
      
      } catch(StringIndexOutOfBoundsException e) {
      }
  }

  @Test(timeout = 4000)
  public void test43()  throws Throwable  {
      ClassWriter classWriter0 = new ClassWriter(2357);
      MethodWriter methodWriter0 = new MethodWriter(classWriter0, 2357, "Ljava/lang/Synthetic;", "rvz?),Ofk@ O/Y3", "LocalVariableTable", (String[]) null, true, true);
      String[] stringArray0 = new String[6];
      stringArray0[0] = "3B\"Pld]V6";
      stringArray0[1] = "Ljava/lang/Synthetic;";
      stringArray0[2] = "LocalVariableTable";
      stringArray0[3] = "LocalVariableTable";
      stringArray0[4] = "LocalVariableTable";
      stringArray0[5] = "3B\"Pld]V6";
      MethodWriter methodWriter1 = new MethodWriter(classWriter0, 1, "rvz?),Ofk@ O/Y3", "rvz?),Ofk@ O/Y3", "3B\"Pld]V6", stringArray0, true, false);
      methodWriter1.visitMaxs(84, 2357);
      assertNotSame(methodWriter1, methodWriter0);
  }

  @Test(timeout = 4000)
  public void test44()  throws Throwable  {
      String[] stringArray0 = new String[0];
      ClassWriter classWriter0 = new ClassWriter(247);
      MethodWriter methodWriter0 = new MethodWriter(classWriter0, 2, "RuntimeInvisibleAnnotations", "[]", "[]", stringArray0, false, false);
      methodWriter0.visitFrame(2197, 286, stringArray0, (-1275), stringArray0);
      methodWriter0.visitMethodInsn(2197, "java/lang/Throwable", "[]", "5i>R%&n`&GsfQRQ");
      ByteVector byteVector0 = classWriter0.pool;
      methodWriter0.put(byteVector0);
  }

  @Test(timeout = 4000)
  public void test45()  throws Throwable  {
      ClassWriter classWriter0 = new ClassWriter((-2048));
      String[] stringArray0 = new String[3];
      stringArray0[0] = "";
      stringArray0[1] = "";
      stringArray0[2] = "java/lang/Object";
      MethodWriter methodWriter0 = new MethodWriter(classWriter0, 2, "java/lang/Object", "].^EY@c<uw}IQMr:C{", "].^EY@c<uw}IQMr:C{", stringArray0, false, false);
      methodWriter0.visitFrame(4, (-2048), stringArray0, 4651, stringArray0);
      assertEquals(3, stringArray0.length);
  }

  @Test(timeout = 4000)
  public void test46()  throws Throwable  {
      ClassWriter classWriter0 = new ClassWriter(2357);
      MethodWriter methodWriter0 = new MethodWriter(classWriter0, 2357, "Ljava/lang/Synthetic;", "rvz?),Ofk@ O/Y3", "LocalVariableTable", (String[]) null, true, true);
      String[] stringArray0 = new String[0];
      MethodWriter methodWriter1 = new MethodWriter(classWriter0, 16, "LocalVariableTable", "YTxr'bU69#C", "RuntimeInvisibleParameterAnnotations", stringArray0, false, false);
      methodWriter0.visitVarInsn(12, 2357);
      assertNotSame(methodWriter0, methodWriter1);
  }

  @Test(timeout = 4000)
  public void test47()  throws Throwable  {
      ClassWriter classWriter0 = mock(ClassWriter.class, new ViolatedAssumptionAnswer());
      doReturn(2833, (-146), 2985, 47, 2833).when(classWriter0).newUTF8(anyString());
      MethodWriter methodWriter0 = new MethodWriter(classWriter0, 2985, "float", "float", "RuntimeVisibleParameterAnnotations", (String[]) null, false, false);
      Label label0 = mock(Label.class, new ViolatedAssumptionAnswer());
      methodWriter0.visitLocalVariable("float", "RuntimeVisibleParameterAnnotations", "float", label0, label0, 2833);
  }

  @Test(timeout = 4000)
  public void test48()  throws Throwable  {
      ClassWriter classWriter0 = mock(ClassWriter.class, new ViolatedAssumptionAnswer());
      doReturn(2844, 1163, 2844, 1163, 2844).when(classWriter0).newClass(anyString());
      doReturn(1163, 1163, 2844, 2844, 2844).when(classWriter0).newUTF8(anyString());
      String[] stringArray0 = new String[9];
      MethodWriter methodWriter0 = new MethodWriter(classWriter0, 2, "rvz?),Ofk@ O/Y3", "rvz?),Ofk@ O/Y3", "rvz?),Ofk@ O/Y3", stringArray0, true, true);
      methodWriter0.visitVarInsn(2, 59);
      int int0 = methodWriter0.getSize();
      assertEquals(62, int0);
  }

  @Test(timeout = 4000)
  public void test49()  throws Throwable  {
      ClassWriter classWriter0 = new ClassWriter((-1133));
      String[] stringArray0 = new String[9];
      MethodWriter methodWriter0 = new MethodWriter(classWriter0, 20, "", "Signature", "Q/j?A>RKO", (String[]) null, false, false);
      ByteVector byteVector0 = classWriter0.pool;
      methodWriter0.put(byteVector0);
      MethodWriter methodWriter1 = null;
      try {
        methodWriter1 = new MethodWriter(classWriter0, 2, "Signature", "Signature", "AAAAAAAAAAAAAAAABCKLLDDDDDEEEEEEEEEEEEEEEEEEEEAAAAAAAADDDDDEEEEEEEEEEEEEEEEEEEEAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAMAAAAAAAAAAAAAAAAAAAAIIIIIIIIIIIIIIIIDNOAAAAAAGGGGGGGHAFBFAAFFAAQPIIJJIIIIIIIIIIIIIIIIII", stringArray0, false, true);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
      }
  }

  @Test(timeout = 4000)
  public void test50()  throws Throwable  {
      ClassWriter classWriter0 = new ClassWriter(2270);
      String[] stringArray0 = new String[2];
      stringArray0[0] = "Eh";
      stringArray0[1] = "Eh";
      MethodWriter methodWriter0 = new MethodWriter(classWriter0, 293, "Eh", "Eh", "Eh", stringArray0, false, false);
      methodWriter0.visitIincInsn(1609, 2357);
  }

  @Test(timeout = 4000)
  public void test51()  throws Throwable  {
      ClassWriter classWriter0 = new ClassWriter(2357);
      String[] stringArray0 = new String[0];
      MethodWriter methodWriter0 = new MethodWriter(classWriter0, 81, "%+P M\u0007,-8`/W WI1Y(", "Ljava/lang/Synthetic;", "Ljava/lang/Synthetic;", stringArray0, false, false);
      MethodWriter methodWriter1 = new MethodWriter(classWriter0, 2, "`U#&:Gx", "m_j5?V/^Gm:vS)V", "%+P M\u0007,-8`/W WI1Y(", stringArray0, true, false);
      // Undeclared exception!
      try { 
        methodWriter1.visitVarInsn((-4977), 1050);
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // -4977
         //
         verifyException("org.mockito.asm.MethodWriter", e);
      }
  }

  @Test(timeout = 4000)
  public void test52()  throws Throwable  {
      ClassWriter classWriter0 = new ClassWriter(3234);
      String[] stringArray0 = new String[0];
      MethodWriter methodWriter0 = new MethodWriter(classWriter0, 1, "RuntimeInvisibleParameterAnnotations", "!", "RuntimeInvisibleParameterAnnotations", stringArray0, false, false);
      methodWriter0.visitIincInsn(114, (-1455));
      ByteVector byteVector0 = classWriter0.pool;
      methodWriter0.put(byteVector0);
      MethodWriter methodWriter1 = new MethodWriter(classWriter0, (-1455), "", "[D\u0002<)tO/,]0A}4)S", "RuntimeInvisibleParameterAnnotations", stringArray0, false, false);
      assertFalse(methodWriter1.equals((Object)methodWriter0));
  }

  @Test(timeout = 4000)
  public void test53()  throws Throwable  {
      ClassWriter classWriter0 = mock(ClassWriter.class, new ViolatedAssumptionAnswer());
      doReturn(2844, 1163, 2844, 1163, 2844).when(classWriter0).newClass(anyString());
      doReturn(1163, 1163).when(classWriter0).newUTF8(anyString());
      String[] stringArray0 = new String[9];
      MethodWriter methodWriter0 = new MethodWriter(classWriter0, 2, "rvz?),Ofk@ O/Y3", "rvz?),Ofk@ O/Y3", "rvz?),Ofk@ O/Y3", stringArray0, true, false);
      methodWriter0.visitVarInsn(2, 59);
  }

  @Test(timeout = 4000)
  public void test54()  throws Throwable  {
      ClassWriter classWriter0 = new ClassWriter(0);
      String[] stringArray0 = new String[9];
      stringArray0[0] = "rvz?),Ofk@ O/Y3";
      stringArray0[1] = "rvz?),Ofk@ O/Y3";
      stringArray0[2] = "rvz?),Ofk@ O/Y3";
      stringArray0[3] = "rvz?),Ofk@ O/Y3";
      stringArray0[4] = "rvz?),Ofk@ O/Y3";
      stringArray0[5] = "rvz?),Ofk@ O/Y3";
      stringArray0[6] = "org.mockito.asm.Frame";
      stringArray0[7] = "org.mockito.asm.Frame";
      stringArray0[8] = "org.mockito.asm.Frame";
      MethodWriter methodWriter0 = new MethodWriter(classWriter0, 0, "org.mockito.asm.Frame", "org.mockito.asm.Frame", "? ~^pdSb .^x%-ge:<", stringArray0, false, false);
      methodWriter0.visitAnnotation("? ~^pdSb .^x%-ge:<", false);
      ByteVector byteVector0 = new ByteVector(87);
      methodWriter0.put(byteVector0);
  }

  @Test(timeout = 4000)
  public void test55()  throws Throwable  {
      ClassWriter classWriter0 = new ClassWriter(3234);
      String[] stringArray0 = new String[0];
      MethodWriter methodWriter0 = new MethodWriter(classWriter0, 4055, "nB;)rD", "nB;)rD", "nB;)rD", stringArray0, true, true);
      methodWriter0.visitIincInsn(103, 116);
  }

  @Test(timeout = 4000)
  public void test56()  throws Throwable  {
      ClassWriter classWriter0 = new ClassWriter((-2039));
      String[] stringArray0 = new String[3];
      stringArray0[0] = "";
      stringArray0[1] = "1>bS9e-o";
      stringArray0[2] = "java/lang/Object";
      MethodWriter methodWriter0 = new MethodWriter(classWriter0, 2, "java/lang/Object", "].^EY@c<uw}IQMr:C{", "].^EY@c<uw}IQMr:C{", stringArray0, false, false);
      methodWriter0.visitVarInsn(1, 182);
      methodWriter0.visitFrame(2, 10, stringArray0, 196, stringArray0);
      ByteVector byteVector0 = classWriter0.pool;
      methodWriter0.put(byteVector0);
  }

  @Test(timeout = 4000)
  public void test57()  throws Throwable  {
      ClassWriter classWriter0 = new ClassWriter(3102);
      String[] stringArray0 = new String[8];
      stringArray0[0] = "evfW]r;";
      stringArray0[1] = "]t:^0GA|&Dl9hL-X;";
      stringArray0[2] = "evfW]r;";
      stringArray0[3] = "evfW]r;";
      stringArray0[4] = "J{v5QqYqT[;s";
      stringArray0[5] = "evfW]r;";
      stringArray0[6] = "evfW]r;";
      stringArray0[7] = "]t:^0GA|&Dl9hL-X;";
      MethodWriter methodWriter0 = new MethodWriter(classWriter0, (-1298), "evfW]r;", "J{v5QqYqT[;s", "J{v5QqYqT[;s", stringArray0, false, false);
      methodWriter0.visitMaxs(75, 4284);
  }

  @Test(timeout = 4000)
  public void test58()  throws Throwable  {
      ClassWriter classWriter0 = new ClassWriter(2357);
      String[] stringArray0 = new String[0];
      MethodWriter methodWriter0 = new MethodWriter(classWriter0, 2, "`U#&e:Gx", "m_j5?V/^Gm:vS)V", "%+P M\u0007,-8`/W WI1Y(", stringArray0, true, false);
      methodWriter0.visitMaxs(2357, 2357);
  }

  @Test(timeout = 4000)
  public void test59()  throws Throwable  {
      ClassWriter classWriter0 = mock(ClassWriter.class, new ViolatedAssumptionAnswer());
      doReturn(2844, 1163, 2844, 1163, 2844).when(classWriter0).newClass(anyString());
      doReturn(1163, 1163).when(classWriter0).newUTF8(anyString());
      String[] stringArray0 = new String[9];
      MethodWriter methodWriter0 = new MethodWriter(classWriter0, 2, "rvz?),Ofk@ O/Y3", "rvz?),Ofk@ O/Y3", "rvz?),Ofk@ O/Y3", stringArray0, true, false);
      methodWriter0.visitInsn(0);
  }

  @Test(timeout = 4000)
  public void test60()  throws Throwable  {
      ClassWriter classWriter0 = mock(ClassWriter.class, new ViolatedAssumptionAnswer());
      doReturn(2844, 1163, 2844, 1163, 2844).when(classWriter0).newClass(anyString());
      doReturn(1163, 1163, 2844, 2844, 2844).when(classWriter0).newUTF8(anyString());
      String[] stringArray0 = new String[9];
      MethodWriter methodWriter0 = new MethodWriter(classWriter0, 2, "rvz?),Ofk@ O/Y3", "rvz?),Ofk@ O/Y3", "rvz?),Ofk@ O/Y3", stringArray0, true, true);
      methodWriter0.visitVarInsn(2, 59);
      methodWriter0.visitIincInsn(16777228, 0);
      ByteVector byteVector0 = new ByteVector();
      methodWriter0.put(byteVector0);
  }

  @Test(timeout = 4000)
  public void test61()  throws Throwable  {
      ClassWriter classWriter0 = new ClassWriter(2355);
      MethodWriter methodWriter0 = new MethodWriter(classWriter0, (-1614), "rvz?),Ofk@ O/Y3", "gfl)Jt=ED[|1B'", "rvz?),Ofk@ O/Y3", (String[]) null, true, false);
      methodWriter0.visitIincInsn(2355, 192);
  }

  @Test(timeout = 4000)
  public void test62()  throws Throwable  {
      ClassWriter classWriter0 = new ClassWriter(2357);
      MethodWriter methodWriter0 = new MethodWriter(classWriter0, 2357, "Ljava/lang/Synthetic;", "rvz?),Ofk@ O/Y3", "LocalVariableTable", (String[]) null, true, true);
      MethodWriter methodWriter1 = new MethodWriter(classWriter0, 2, "rvz?),Ofk@ O/Y3", "m_j5?JV/^Gm:vS)V", "LocalVariableTable", (String[]) null, false, false);
      methodWriter0.visitIincInsn(303, 16);
      assertNotSame(methodWriter0, methodWriter1);
  }

  @Test(timeout = 4000)
  public void test63()  throws Throwable  {
      ClassWriter classWriter0 = new ClassWriter(2357);
      MethodWriter methodWriter0 = new MethodWriter(classWriter0, 2357, "Ljava/lang/Synthetic;", "rvz?),Ofk@ O/Y3", "LocalVariableTable", (String[]) null, true, true);
      String[] stringArray0 = new String[0];
      MethodWriter methodWriter1 = new MethodWriter(classWriter0, 16, "LocalVariableTable", "YTxr'bU69#C", "RuntimeInvisibleParameterAnnotations", stringArray0, false, false);
      methodWriter1.visitVarInsn((-7), (-7));
      assertNotSame(methodWriter1, methodWriter0);
  }

  @Test(timeout = 4000)
  public void test64()  throws Throwable  {
      Label label0 = mock(Label.class, new ViolatedAssumptionAnswer());
      ClassWriter classWriter0 = new ClassWriter(2270);
      String[] stringArray0 = new String[4];
      stringArray0[0] = "float";
      stringArray0[1] = "7m";
      stringArray0[2] = "Ljava/lang/Synthetic;";
      stringArray0[3] = "7m";
      MethodWriter methodWriter0 = new MethodWriter(classWriter0, 2357, "7m", "rvz?),Ofk@ O/Y3", "Ljava/lang/Synthetic;", stringArray0, false, true);
      methodWriter0.visitLocalVariable("VR1Kx1H'\"]kt'", "float", "#k, 6veA", label0, label0, 2);
  }

  @Test(timeout = 4000)
  public void test65()  throws Throwable  {
      ClassWriter classWriter0 = new ClassWriter(2357);
      String[] stringArray0 = new String[0];
      MethodWriter methodWriter0 = new MethodWriter(classWriter0, 81, "%+P M\u0007,-8`/W WI1Y(", "Ljava/lang/Synthetic;", "Ljava/lang/Synthetic;", stringArray0, false, false);
      methodWriter0.visitIincInsn((-54), 390);
      ByteVector byteVector0 = classWriter0.pool;
      methodWriter0.put(byteVector0);
      methodWriter0.visitFieldInsn(64, "Ljava/lang/Synthetic;", "&@t;~JGQyRe5xKulO", "&@t;~JGQyRe5xKulO");
  }

  @Test(timeout = 4000)
  public void test66()  throws Throwable  {
      ClassWriter classWriter0 = new ClassWriter(2357);
      MethodWriter methodWriter0 = new MethodWriter(classWriter0, 2357, "Ljava/lang/Synthetic;", "rvz?),Ofk@ O/Y3", "LocalVariableTable", (String[]) null, true, true);
      methodWriter0.getSize();
      Item item0 = classWriter0.newFieldItem("", "RuntimeInvisibleParameterAnnotations", "Ljava/lang/Synthetic;");
      assertNotNull(item0);
  }

  @Test(timeout = 4000)
  public void test67()  throws Throwable  {
      ClassWriter classWriter0 = new ClassWriter(3102);
      String[] stringArray0 = new String[8];
      stringArray0[0] = "evfW]r;";
      stringArray0[1] = "]t:^0GA|&Dl9hL-X;";
      stringArray0[2] = "evfW]r;";
      stringArray0[3] = "evfW]r;";
      stringArray0[4] = "J{v5QqYqT[;s";
      stringArray0[5] = "evfW]r;";
      stringArray0[6] = "evfW]r;";
      stringArray0[7] = "]t:^0GA|&Dl9hL-X;";
      MethodWriter methodWriter0 = new MethodWriter(classWriter0, (-1298), "evfW]r;", "J{v5QqYqT[;s", "J{v5QqYqT[;s", stringArray0, false, false);
      byte[] byteArray0 = classWriter0.toByteArray();
      assertEquals(181, byteArray0.length);
  }
}
