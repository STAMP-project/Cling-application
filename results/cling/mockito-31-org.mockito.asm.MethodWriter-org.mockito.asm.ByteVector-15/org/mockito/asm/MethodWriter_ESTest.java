/*

 * Tue Mar 03 14:30:39 GMT 2020
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
      ClassWriter classWriter0 = new ClassWriter(177);
      ByteVector byteVector0 = new ByteVector(1);
      byteVector0.putLong(177);
      String[] stringArray0 = new String[1];
      stringArray0[0] = ">W,";
      MethodWriter methodWriter0 = null;
      try {
        methodWriter0 = new MethodWriter(classWriter0, 16777219, "L=`HD:Wf_R", "L=`HD:Wf_R", "L=`HD:Wf_R", stringArray0, false, true);
        fail("Expecting exception: StringIndexOutOfBoundsException");
      
      } catch(StringIndexOutOfBoundsException e) {
      }
  }

  @Test(timeout = 4000)
  public void test01()  throws Throwable  {
      ClassWriter classWriter0 = new ClassWriter((-1182));
      String[] stringArray0 = new String[2];
      stringArray0[0] = "54[' 7;&[)1{t`d1";
      stringArray0[1] = "54[' 7;&[)1{t`d1";
      MethodWriter methodWriter0 = new MethodWriter(classWriter0, 0, "54[' 7;&[)1{t`d1", "54[' 7;&[)1{t`d1", "54[' 7;&[)1{t`d1", stringArray0, false, true);
      Label label0 = new Label();
      methodWriter0.visitJumpInsn(193, label0);
  }

  @Test(timeout = 4000)
  public void test02()  throws Throwable  {
      ClassWriter classWriter0 = new ClassWriter(128);
      String[] stringArray0 = new String[2];
      stringArray0[0] = "QtL+3f/G>E\"r";
      stringArray0[1] = "QtL+3f/G>E\"r";
      classWriter0.visitMethod(128, "IVm+M;:G?!%(ve_[A", "<init>", "IVm+M;:G?!%(ve_[A", stringArray0);
      MethodWriter methodWriter0 = new MethodWriter(classWriter0, 182, "QtL+3f/G>E\"r", "z4EGo)2?SD#", "RuntimeVisibleAnnotations", stringArray0, true, true);
      // Undeclared exception!
      try { 
        methodWriter0.visitMaxs(24, 63);
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // 11
         //
         verifyException("org.mockito.asm.Type", e);
      }
  }

  @Test(timeout = 4000)
  public void test03()  throws Throwable  {
      ClassWriter classWriter0 = new ClassWriter((-3454));
      MethodWriter methodWriter0 = new MethodWriter(classWriter0, (-702), "N5v,AUi", "9T/6AkCi>M:2jW", "p^t8WB/$mRX5E60_L", (String[]) null, false, false);
      methodWriter0.visitIincInsn(1905, 1905);
      MethodWriter methodWriter1 = null;
      try {
        methodWriter1 = new MethodWriter(classWriter0, 2294, "p^t8WB/$mRX5E60_L", "N5v,AUi", "y", (String[]) null, false, true);
        fail("Expecting exception: StringIndexOutOfBoundsException");
      
      } catch(StringIndexOutOfBoundsException e) {
      }
  }

  @Test(timeout = 4000)
  public void test04()  throws Throwable  {
      ClassWriter classWriter0 = new ClassWriter(22);
      String[] stringArray0 = new String[0];
      MethodWriter methodWriter0 = new MethodWriter(classWriter0, 22, "i", "i", "i", stringArray0, false, false);
      Item item0 = classWriter0.newLong(0L);
      assertNotNull(item0);
  }

  @Test(timeout = 4000)
  public void test05()  throws Throwable  {
      ClassWriter classWriter0 = new ClassWriter(308);
      MethodWriter methodWriter0 = new MethodWriter(classWriter0, 193, "p^t8WB/$mRX5E60_L", "z[F2Z`", "'L", (String[]) null, false, false);
      methodWriter0.visitMethodInsn((-1145), "z[F2Z`", "'L", "1T");
  }

  @Test(timeout = 4000)
  public void test06()  throws Throwable  {
      Label label0 = new Label();
      int[] intArray0 = new int[4];
      MethodWriter.getNewOffset(intArray0, intArray0, label0);
      MethodWriter.getNewOffset(intArray0, intArray0, label0);
      assertArrayEquals(new int[] {0, 0, 0, 0}, intArray0);
  }

  @Test(timeout = 4000)
  public void test07()  throws Throwable  {
      ClassWriter classWriter0 = new ClassWriter(64);
      String[] stringArray0 = new String[2];
      stringArray0[0] = "Y3[gD[S";
      stringArray0[1] = "AnnotationDefault";
      MethodWriter methodWriter0 = new MethodWriter(classWriter0, 2, "<uS~jnd)8f.ua50kl", "rUu'-,C,/^s", "long", stringArray0, false, false);
      methodWriter0.visitFieldInsn(64, "Y3[gD[S", "Y3[gD[S", "f[jyIY");
  }

  @Test(timeout = 4000)
  public void test08()  throws Throwable  {
      ClassWriter classWriter0 = new ClassWriter(170);
      MethodWriter methodWriter0 = new MethodWriter(classWriter0, 536, "@sG7<_gq|30++n#", "0?QHH#~gD3);8Y Z}[", "H3<-b{J", (String[]) null, false, false);
      methodWriter0.visitFieldInsn((-661), "", "Y3[gD[S", "G");
  }

  @Test(timeout = 4000)
  public void test09()  throws Throwable  {
      ClassWriter classWriter0 = new ClassWriter(177);
      String[] stringArray0 = new String[2];
      stringArray0[0] = "QtL+3f/G>E\"r";
      stringArray0[1] = "QtL+3f/G>E\"r";
      MethodWriter methodWriter0 = new MethodWriter(classWriter0, 184, "Rg(9+tq'qq|3oW", "p^t8WB/$mRX5E60_L", "p^t8WB/$mRX5E60_L", stringArray0, false, false);
      methodWriter0.visitFrame(1, 1, stringArray0, (-146), stringArray0);
      methodWriter0.visitFrame(184, 4096, stringArray0, 177, stringArray0);
      assertEquals(2, stringArray0.length);
  }

  @Test(timeout = 4000)
  public void test10()  throws Throwable  {
      ClassWriter classWriter0 = new ClassWriter(65);
      String[] stringArray0 = new String[2];
      stringArray0[0] = "Y3[gD[S";
      stringArray0[1] = "Y3[gD[S";
      MethodWriter methodWriter0 = new MethodWriter(classWriter0, 2, "<uS~jnd)8f.ua50kl", "Y3[gD[S", "long", stringArray0, false, false);
      MethodWriter methodWriter1 = new MethodWriter(classWriter0, (-2604), "long", "Y3[gD[S", "", stringArray0, false, false);
      methodWriter1.visitMethodInsn((-1705), "long", "Y3[gD[S", "");
      assertNotSame(methodWriter1, methodWriter0);
  }

  @Test(timeout = 4000)
  public void test11()  throws Throwable  {
      ClassWriter classWriter0 = new ClassWriter(22);
      String[] stringArray0 = new String[7];
      stringArray0[0] = "54[' 7;&[)1{9bt`1";
      stringArray0[1] = "";
      stringArray0[2] = "54[' 7;&[)1{9bt`1";
      stringArray0[3] = "";
      stringArray0[4] = "";
      stringArray0[5] = "";
      stringArray0[6] = "";
      MethodWriter methodWriter0 = new MethodWriter(classWriter0, (-766), "", "54[' 7;&[)1{9bt`1", "54[' 7;&[)1{9bt`1", stringArray0, true, false);
      methodWriter0.visitIincInsn(1564, 16777227);
  }

  @Test(timeout = 4000)
  public void test12()  throws Throwable  {
      ClassWriter classWriter0 = new ClassWriter((-2542));
      String[] stringArray0 = new String[1];
      stringArray0[0] = "6-i9[RG(z7TK?(^y{";
      MethodWriter methodWriter0 = new MethodWriter(classWriter0, 2, "6-i9[RG(z7TK?(^y{", "N:^ynne!XTk+", "6-i9[RG(z7TK?(^y{", stringArray0, false, false);
      MethodWriter methodWriter1 = new MethodWriter(classWriter0, 91, "6-i9[RG(z7TK?(^y{", "float", "e", stringArray0, false, false);
      methodWriter1.visitAnnotation("6-i9[RG(z7TK?(^y{", false);
      ByteVector byteVector0 = new ByteVector();
      methodWriter1.put(byteVector0);
      assertNotSame(methodWriter1, methodWriter0);
  }

  @Test(timeout = 4000)
  public void test13()  throws Throwable  {
      ClassWriter classWriter0 = new ClassWriter(177);
      String[] stringArray0 = new String[1];
      stringArray0[0] = "QtL+3f/G>E\"r";
      MethodWriter methodWriter0 = new MethodWriter(classWriter0, (byte) (-74), "z4EGo)2?SD#", "z4EGo)2?SD#", "RuntimeVisibleAnnotations", stringArray0, true, true);
      methodWriter0.visitMethodInsn(8, "QtL+3f/G>E\"r", "(%5Pe4", "RuntimeInvisibleParameterAnnotations");
  }

  @Test(timeout = 4000)
  public void test14()  throws Throwable  {
      ClassWriter classWriter0 = new ClassWriter(22);
      String[] stringArray0 = new String[0];
      MethodWriter methodWriter0 = new MethodWriter(classWriter0, 22, "i", "i", "i", stringArray0, false, false);
      methodWriter0.visitFrame(2, 213, stringArray0, 22, stringArray0);
      assertEquals(0, stringArray0.length);
  }

  @Test(timeout = 4000)
  public void test15()  throws Throwable  {
      ClassWriter classWriter0 = new ClassWriter(0);
      MethodWriter methodWriter0 = new MethodWriter(classWriter0, 196, "EFi<\"LBPkd|", "z4EGo)2?SD#", "3[gYD[S", (String[]) null, true, false);
      // Undeclared exception!
      try { 
        methodWriter0.visitMethodInsn(196, "fz>=", "3[gYD[S", "EFi<\"LBPkd|");
        fail("Expecting exception: StringIndexOutOfBoundsException");
      
      } catch(StringIndexOutOfBoundsException e) {
      }
  }

  @Test(timeout = 4000)
  public void test16()  throws Throwable  {
      ClassWriter classWriter0 = new ClassWriter(0);
      MethodWriter methodWriter0 = new MethodWriter(classWriter0, 196, "{2n=CYi", "z4EGo)2?SD#", "3[gYD[S", (String[]) null, true, true);
      methodWriter0.visitMethodInsn(2, "MGU.G2", "MGU.G2", "LocalVariableTypeTable");
      MethodWriter methodWriter1 = new MethodWriter(classWriter0, 2, "value ", "JuTXD*fC&9:/I\"L)Hu", "float", (String[]) null, false, false);
      assertFalse(methodWriter1.equals((Object)methodWriter0));
  }

  @Test(timeout = 4000)
  public void test17()  throws Throwable  {
      ClassWriter classWriter0 = new ClassWriter(65);
      String[] stringArray0 = new String[2];
      stringArray0[0] = "Y3[gD[S";
      stringArray0[1] = "Y3[gD[S";
      MethodWriter methodWriter0 = new MethodWriter(classWriter0, 2, "<uS~jnd)8f.ua50kl", "Y3[gD[S", "long", stringArray0, false, false);
      methodWriter0.visitVarInsn(0, 2);
      ByteVector byteVector0 = new ByteVector(1);
      methodWriter0.put(byteVector0);
  }

  @Test(timeout = 4000)
  public void test18()  throws Throwable  {
      ClassWriter classWriter0 = new ClassWriter(22);
      String[] stringArray0 = new String[0];
      MethodWriter methodWriter0 = new MethodWriter(classWriter0, 22, "i", "i", "i", stringArray0, false, false);
      Object[] objectArray0 = new Object[5];
      methodWriter0.visitFrame(1, (-29), objectArray0, 1973, stringArray0);
      assertEquals(5, objectArray0.length);
  }

  @Test(timeout = 4000)
  public void test19()  throws Throwable  {
      ClassWriter classWriter0 = new ClassWriter(22);
      String[] stringArray0 = new String[0];
      MethodWriter methodWriter0 = new MethodWriter(classWriter0, 22, "i", "i", "i", stringArray0, false, false);
      MethodWriter methodWriter1 = new MethodWriter(classWriter0, 1, "i", ".", "UK2h$m>;'k9", stringArray0, false, false);
      methodWriter1.visitVarInsn((-902), (-674));
      assertNotSame(methodWriter1, methodWriter0);
  }

  @Test(timeout = 4000)
  public void test20()  throws Throwable  {
      int[] intArray0 = new int[5];
      MethodWriter.getNewOffset(intArray0, intArray0, (-1068), 2539);
      ClassWriter classWriter0 = new ClassWriter(0);
      MethodWriter methodWriter0 = new MethodWriter(classWriter0, (-1348), "wA[)", "z4EGo)2?SD#", "EFi<\"LBPkd|", (String[]) null, true, true);
      MethodWriter methodWriter1 = null;
      try {
        methodWriter1 = new MethodWriter(classWriter0, 2, (String) null, ")=yHNMG^'M]dUj", "", (String[]) null, true, true);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
      }
  }

  @Test(timeout = 4000)
  public void test21()  throws Throwable  {
      ClassWriter classWriter0 = new ClassWriter(177);
      String[] stringArray0 = new String[1];
      stringArray0[0] = "QtL+3f/G>E\"r";
      MethodWriter methodWriter0 = new MethodWriter(classWriter0, (byte) (-74), "z4EGo)2?SD#", "z4EGo)2?SD#", "EFFFFFFFFGGFFFGGFFFEEFGFGFEEEEEEEEEEEEEEEEEEEEDEDEDDDDDCDCDEEEEEEEEEEEEEEEEEEEEBABABBBBDCFFFGGGEDCDCDCDCDCDCDCDCDCDCEEEEDDDDDDDCDCDCEFEFDDEEFFDEDEEEBDDBBDDDDDDCCCCCCCCEFEDDDCDCDEEEEEEEEEEFEEEEEEDDEEDDEE", stringArray0, false, true);
      Label label0 = new Label();
      methodWriter0.visitLocalVariable("QtL+3f/G>E\"r", "EFFFFFFFFGGFFFGGFFFEEFGFGFEEEEEEEEEEEEEEEEEEEEDEDEDDDDDCDCDEEEEEEEEEEEEEEEEEEEEBABABBBBDCFFFGGGEDCDCDCDCDCDCDCDCDCDCEEEEDDDDDDDCDCDCEFEFDDEEFFDEDEEEBDDBBDDDDDDCCCCCCCCEFEDDDCDCDEEEEEEEEEEFEEEEEEDDEEDDEE", "QtL+3f/G>E\"r", label0, label0, 2220);
  }

  @Test(timeout = 4000)
  public void test22()  throws Throwable  {
      String[] stringArray0 = new String[0];
      ClassWriter classWriter0 = new ClassWriter(2);
      MethodWriter methodWriter0 = new MethodWriter(classWriter0, (-301), "PygIvEZ", "Class not found", "NgFKOiM>", stringArray0, false, false);
      methodWriter0.visitVarInsn(2, 1897);
  }

  @Test(timeout = 4000)
  public void test23()  throws Throwable  {
      ClassWriter classWriter0 = new ClassWriter(177);
      ByteVector byteVector0 = new ByteVector(1);
      byteVector0.put11((-2153), 39);
      String[] stringArray0 = new String[1];
      stringArray0[0] = ">W,";
      MethodWriter methodWriter0 = null;
      try {
        methodWriter0 = new MethodWriter(classWriter0, 16777219, "L=`HD:Wf_R", "L=`HD:Wf_R", "L=`HD:Wf_R", stringArray0, false, true);
        fail("Expecting exception: StringIndexOutOfBoundsException");
      
      } catch(StringIndexOutOfBoundsException e) {
      }
  }

  @Test(timeout = 4000)
  public void test24()  throws Throwable  {
      ClassWriter classWriter0 = new ClassWriter(22);
      String[] stringArray0 = new String[0];
      MethodWriter methodWriter0 = new MethodWriter(classWriter0, 22, "i", "i", "i", stringArray0, false, false);
      ByteVector byteVector0 = new ByteVector(2);
      ByteVector byteVector1 = byteVector0.putByte(22);
      byteVector1.put11(28, 248);
      MethodWriter methodWriter1 = new MethodWriter(classWriter0, 2170, "i", "i", "UK2h$m>;'k9", stringArray0, false, false);
      assertFalse(methodWriter1.equals((Object)methodWriter0));
  }

  @Test(timeout = 4000)
  public void test25()  throws Throwable  {
      ClassWriter classWriter0 = new ClassWriter(65);
      String[] stringArray0 = new String[2];
      stringArray0[0] = "Y3[gD[S";
      stringArray0[1] = "Y3[gD[S";
      MethodWriter methodWriter0 = new MethodWriter(classWriter0, 2, "<uS~jnd)8f.ua50kl", "rUu'-,C,/^s", "long", stringArray0, false, false);
      Object[] objectArray0 = new Object[7];
      // Undeclared exception!
      try { 
        methodWriter0.visitFrame(1, 1, objectArray0, 10, stringArray0);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.mockito.asm.MethodWriter", e);
      }
  }

  @Test(timeout = 4000)
  public void test26()  throws Throwable  {
      ClassWriter classWriter0 = new ClassWriter(205);
      MethodWriter methodWriter0 = new MethodWriter(classWriter0, 1312, "EFi<\"LBPkd|", "z4EGo)2?SD#", "3[gYD[S", (String[]) null, true, false);
      Label label0 = new Label();
      methodWriter0.visitTryCatchBlock(label0, label0, label0, "LG6QB);/>y-o.");
      methodWriter0.visitMaxs(107, 2365);
  }

  @Test(timeout = 4000)
  public void test27()  throws Throwable  {
      ClassWriter classWriter0 = new ClassWriter(0);
      MethodWriter methodWriter0 = new MethodWriter(classWriter0, (-137), "wA[)", "z4EGo)2?SD#", "LineNumberTable", (String[]) null, true, true);
      MethodWriter methodWriter1 = new MethodWriter(classWriter0, 2539, "wA[)", "54[' 7;&[)1{9bt`1", "z4EGo)2?SD#", (String[]) null, true, false);
      ByteVector byteVector0 = new ByteVector(2);
      methodWriter1.put(byteVector0);
      assertNotSame(methodWriter1, methodWriter0);
  }

  @Test(timeout = 4000)
  public void test28()  throws Throwable  {
      ClassWriter classWriter0 = new ClassWriter(22);
      String[] stringArray0 = new String[0];
      MethodWriter methodWriter0 = null;
      try {
        methodWriter0 = new MethodWriter(classWriter0, 262144, "AnnotationDefault", "dLPWpgH9*Sc7^", "UK2h$m>;'k9", stringArray0, false, true);
        fail("Expecting exception: StringIndexOutOfBoundsException");
      
      } catch(StringIndexOutOfBoundsException e) {
      }
  }

  @Test(timeout = 4000)
  public void test29()  throws Throwable  {
      ClassWriter classWriter0 = mock(ClassWriter.class, new ViolatedAssumptionAnswer());
      doReturn(0, 0, 0, 0, 0).when(classWriter0).newClass(anyString());
      doReturn(0, 0).when(classWriter0).newUTF8(anyString());
      String[] stringArray0 = new String[8];
      MethodWriter methodWriter0 = new MethodWriter(classWriter0, 2, "EnclosingMethod", "EnclosingMethod", "EnclosingMethod", stringArray0, false, false);
      int[] intArray0 = new int[3];
      intArray0[0] = 40;
      Label label0 = mock(Label.class, new ViolatedAssumptionAnswer());
      MethodWriter.getNewOffset(intArray0, intArray0, label0);
      assertEquals(3, intArray0.length);
  }

  @Test(timeout = 4000)
  public void test30()  throws Throwable  {
      int[] intArray0 = new int[5];
      intArray0[1] = 205;
      Label label0 = new Label();
      MethodWriter.getNewOffset(intArray0, intArray0, label0);
      ClassWriter classWriter0 = new ClassWriter(205);
      String[] stringArray0 = new String[0];
      MethodWriter methodWriter0 = null;
      try {
        methodWriter0 = new MethodWriter(classWriter0, 9, "7zfj>{;,eI$^X3", "7zfj>{;,eI$^X3", "RuntimeVisibleAnnotations", stringArray0, true, true);
        fail("Expecting exception: StringIndexOutOfBoundsException");
      
      } catch(StringIndexOutOfBoundsException e) {
      }
  }

  @Test(timeout = 4000)
  public void test31()  throws Throwable  {
      ClassWriter classWriter0 = mock(ClassWriter.class, new ViolatedAssumptionAnswer());
      doReturn((-2549), (-2549), (-2549), (-2549), (-2549)).when(classWriter0).newClass(anyString());
      doReturn((-2549), 812, 812, 812, (-806)).when(classWriter0).newUTF8(anyString());
      String[] stringArray0 = new String[8];
      MethodWriter methodWriter0 = new MethodWriter(classWriter0, 2, "Ex\"D:miB*`3EN", "54[' 7;&[)1{9bt`1", "Ex\"D:miB*`3EN", stringArray0, true, true);
      methodWriter0.visitAnnotationDefault();
      ByteVector byteVector0 = new ByteVector();
      methodWriter0.put(byteVector0);
  }

  @Test(timeout = 4000)
  public void test32()  throws Throwable  {
      ClassWriter classWriter0 = new ClassWriter((-779));
      String[] stringArray0 = new String[0];
      MethodWriter methodWriter0 = new MethodWriter(classWriter0, (-296), "N5v,AUi", "N5v,AUi", "N5v,AUi", stringArray0, false, false);
      methodWriter0.visitAnnotationDefault();
      ByteVector byteVector0 = new ByteVector();
      methodWriter0.put(byteVector0);
  }

  @Test(timeout = 4000)
  public void test33()  throws Throwable  {
      ClassWriter classWriter0 = new ClassWriter(177);
      classWriter0.newLong((-4633));
      String[] stringArray0 = new String[1];
      stringArray0[0] = "QtL+3f/G>E\"r";
      MethodWriter methodWriter0 = new MethodWriter(classWriter0, 128, "z4EGo)2?SD#", "~=gJ^HeR%Yb!1@-KE ", "QtL+3f/G>E\"r", stringArray0, false, false);
      methodWriter0.visitTypeInsn((-4633), "z4EGo)2?SD#");
      MethodWriter methodWriter1 = null;
      try {
        methodWriter1 = new MethodWriter(classWriter0, (-4633), "int", "QtL+3f/G>E\"r", "QtL+3f/G>E\"r", stringArray0, false, true);
        fail("Expecting exception: StringIndexOutOfBoundsException");
      
      } catch(StringIndexOutOfBoundsException e) {
      }
  }

  @Test(timeout = 4000)
  public void test34()  throws Throwable  {
      ClassWriter classWriter0 = new ClassWriter((-3454));
      MethodWriter methodWriter0 = new MethodWriter(classWriter0, (-702), "N5v,AUi", "9T/6AkCi>M:2jW", "p^t8WB/$mRX5E60_L", (String[]) null, false, false);
      methodWriter0.visitAnnotationDefault();
      ByteVector byteVector0 = new ByteVector();
      methodWriter0.put(byteVector0);
      MethodWriter methodWriter1 = null;
      try {
        methodWriter1 = new MethodWriter(classWriter0, 2294, "p^t8WB/$mRX5E60_L", "N5v,AUi", "y", (String[]) null, false, true);
        fail("Expecting exception: StringIndexOutOfBoundsException");
      
      } catch(StringIndexOutOfBoundsException e) {
      }
  }

  @Test(timeout = 4000)
  public void test35()  throws Throwable  {
      ClassWriter classWriter0 = new ClassWriter((-1182));
      String[] stringArray0 = new String[2];
      stringArray0[0] = "54[' 7;&[)1{t`d1";
      stringArray0[1] = "54[' 7;&[)1{t`d1";
      MethodWriter methodWriter0 = new MethodWriter(classWriter0, 0, "54[' 7;&[)1{t`d1", "54[' 7;&[)1{t`d1", "54[' 7;&[)1{t`d1", stringArray0, false, true);
      // Undeclared exception!
      try { 
        methodWriter0.visitInsn((-609));
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.mockito.asm.Frame", e);
      }
  }

  @Test(timeout = 4000)
  public void test36()  throws Throwable  {
      ClassWriter classWriter0 = mock(ClassWriter.class, new ViolatedAssumptionAnswer());
      doReturn(0).when(classWriter0).newClass(anyString());
      doReturn(64, 64).when(classWriter0).newUTF8(anyString());
      String[] stringArray0 = new String[1];
      MethodWriter methodWriter0 = new MethodWriter(classWriter0, (-301), "RuntimeVisibleAnnotations", "RuntimeVisibleAnnotations", "RuntimeVisibleAnnotations", stringArray0, false, false);
      methodWriter0.visitInsn((-301));
  }

  @Test(timeout = 4000)
  public void test37()  throws Throwable  {
      ClassWriter classWriter0 = new ClassWriter(22);
      String[] stringArray0 = new String[0];
      MethodWriter methodWriter0 = new MethodWriter(classWriter0, 22, "i", "i", "i", stringArray0, false, false);
      methodWriter0.visitInsn(78);
  }

  @Test(timeout = 4000)
  public void test38()  throws Throwable  {
      ClassWriter classWriter0 = new ClassWriter(0);
      MethodWriter methodWriter0 = new MethodWriter(classWriter0, 196, "EFi<\"LBPkd|", "z4EGo)2?SD#", "EFi<\"LBPkd|", (String[]) null, true, false);
      methodWriter0.visitInsn(55);
  }

  @Test(timeout = 4000)
  public void test39()  throws Throwable  {
      ClassWriter classWriter0 = mock(ClassWriter.class, new ViolatedAssumptionAnswer());
      doReturn(0).when(classWriter0).newClass(anyString());
      doReturn(64, 64).when(classWriter0).newUTF8(anyString());
      String[] stringArray0 = new String[1];
      MethodWriter methodWriter0 = new MethodWriter(classWriter0, (-301), "RuntimeVisibleAnnotations", "RuntimeVisibleAnnotations", "RuntimeVisibleAnnotations", stringArray0, false, false);
      methodWriter0.visitMaxs(91, (-301));
  }

  @Test(timeout = 4000)
  public void test40()  throws Throwable  {
      String[] stringArray0 = new String[0];
      ClassWriter classWriter0 = new ClassWriter(2);
      MethodWriter methodWriter0 = new MethodWriter(classWriter0, (-301), "PygIvEZ", "Class not found", "NgFKOiM>", stringArray0, false, false);
      methodWriter0.visitMaxs((-1674), 2);
  }

  @Test(timeout = 4000)
  public void test41()  throws Throwable  {
      ClassReader classReader0 = new ClassReader("java/lang/Throwable");
      ClassWriter classWriter0 = new ClassWriter(classReader0, 29);
      classReader0.accept((ClassVisitor) classWriter0, 1);
      MethodWriter methodWriter0 = classWriter0.firstMethod;
      methodWriter0.visitVarInsn(4, 8);
  }

  @Test(timeout = 4000)
  public void test42()  throws Throwable  {
      ClassWriter classWriter0 = new ClassWriter(22);
      String[] stringArray0 = new String[0];
      MethodWriter methodWriter0 = new MethodWriter(classWriter0, 22, "i", "i", "i", stringArray0, false, false);
      methodWriter0.visitAnnotation("{:^I:sM^uKE}0sp", false);
      ByteVector byteVector0 = new ByteVector();
      methodWriter0.put(byteVector0);
  }

  @Test(timeout = 4000)
  public void test43()  throws Throwable  {
      ClassWriter classWriter0 = new ClassWriter(177);
      ByteVector byteVector0 = new ByteVector(1);
      byteVector0.put12(172, 172);
      String[] stringArray0 = new String[0];
      MethodWriter methodWriter0 = new MethodWriter(classWriter0, 192, "LineNumberTable", "g9Ve", "g9Ve", stringArray0, false, false);
  }

  @Test(timeout = 4000)
  public void test44()  throws Throwable  {
      ClassWriter classWriter0 = new ClassWriter(22);
      String[] stringArray0 = new String[0];
      MethodWriter methodWriter0 = new MethodWriter(classWriter0, 22, "i", "i", "i", stringArray0, false, false);
      ByteVector byteVector0 = new ByteVector(2);
      byteVector0.putLong(2);
      MethodWriter methodWriter1 = new MethodWriter(classWriter0, 1, "i", ".", "UK2h$m>;'k9", stringArray0, false, false);
      assertFalse(methodWriter1.equals((Object)methodWriter0));
  }

  @Test(timeout = 4000)
  public void test45()  throws Throwable  {
      ClassWriter classWriter0 = new ClassWriter(205);
      MethodWriter methodWriter0 = new MethodWriter(classWriter0, 1312, "EFi<\"LBPkd|", "z4EGo)2?SD#", "3[gYD[S", (String[]) null, true, false);
      Label label0 = new Label();
      methodWriter0.visitTryCatchBlock(label0, label0, label0, "LG6QB);/>y-o.");
      methodWriter0.visitLdcInsn("EFi<\"LBPkd|");
      MethodWriter methodWriter1 = new MethodWriter(classWriter0, (-53), "3[gYD[S", "jI%UP\"[F0)lGI3f", "p`E1I<<}J/^I@YC", (String[]) null, false, false);
      byte[] byteArray0 = classWriter0.toByteArray();
      assertEquals(236, byteArray0.length);
  }

  @Test(timeout = 4000)
  public void test46()  throws Throwable  {
      ClassWriter classWriter0 = new ClassWriter((-2542));
      String[] stringArray0 = new String[1];
      stringArray0[0] = "6-i9[RG(z7TK?(^y{";
      MethodWriter methodWriter0 = new MethodWriter(classWriter0, 2, "6-i9[RG(z7TK?(^y{", "N:^ynne!XTk+", "6-i9[RG(z7TK?(^y{", stringArray0, false, false);
      methodWriter0.visitVarInsn(16777225, 16777225);
      MethodWriter methodWriter1 = new MethodWriter(classWriter0, 91, "6-i9[RG(z7TK?(^y{", "float", "e", stringArray0, false, false);
      assertFalse(methodWriter1.equals((Object)methodWriter0));
  }

  @Test(timeout = 4000)
  public void test47()  throws Throwable  {
      ClassWriter classWriter0 = new ClassWriter(0);
      MethodWriter methodWriter0 = new MethodWriter(classWriter0, (-137), "wA[)", "z4EGo)2?SD#", "LineNumberTable", (String[]) null, true, true);
      methodWriter0.visitInsn(193);
      MethodWriter methodWriter1 = new MethodWriter(classWriter0, 2539, "wA[)", "54[' 7;&[)1{9bt`1", "z4EGo)2?SD#", (String[]) null, true, false);
      assertFalse(methodWriter1.equals((Object)methodWriter0));
  }

  @Test(timeout = 4000)
  public void test48()  throws Throwable  {
      ClassWriter classWriter0 = mock(ClassWriter.class, new ViolatedAssumptionAnswer());
      doReturn((-2549), (-2549), (-2549), (-2549), (-2549)).when(classWriter0).newClass(anyString());
      doReturn((-2549), 812).when(classWriter0).newUTF8(anyString());
      String[] stringArray0 = new String[8];
      MethodWriter methodWriter0 = new MethodWriter(classWriter0, 2, "Ex\"D:miB*`3EN", "54[' 7;&[)1{9bt`1", "Ex\"D:miB*`3EN", stringArray0, true, true);
      methodWriter0.visitVarInsn(24, 2);
  }

  @Test(timeout = 4000)
  public void test49()  throws Throwable  {
      ClassWriter classWriter0 = new ClassWriter(177);
      String[] stringArray0 = new String[1];
      stringArray0[0] = "QtL+3f/G>E\"r";
      MethodWriter methodWriter0 = new MethodWriter(classWriter0, (byte) (-74), "z4EGo)2?SD#", "z4EGo)2?SD#", "EFFFFFFFFGGFFFGGFFFEEFGFGFEEEEEEEEEEEEEEEEEEEEDEDEDDDDDCDCDEEEEEEEEEEEEEEEEEEEEBABABBBBDCFFFGGGEDCDCDCDCDCDCDCDCDCDCEEEEDDDDDDDCDCDCEFEFDDEEFFDEDEEEBDDBBDDDDDDCCCCCCCCEFEDDDCDCDEEEEEEEEEEFEEEEEEDDEEDDEE", stringArray0, false, true);
      MethodWriter methodWriter1 = new MethodWriter(classWriter0, (-2939), "QtL+3f/G>E\"r", "z4EGo)2?SD#", "22f", stringArray0, true, true);
      methodWriter0.visitVarInsn(128, (byte) (-74));
      assertNotSame(methodWriter0, methodWriter1);
  }

  @Test(timeout = 4000)
  public void test50()  throws Throwable  {
      ClassWriter classWriter0 = new ClassWriter(22);
      String[] stringArray0 = new String[0];
      MethodWriter methodWriter0 = new MethodWriter(classWriter0, 22, "i", "i", "i", stringArray0, false, false);
      Label label0 = new Label();
      ByteVector byteVector0 = new ByteVector(2);
      ByteVector byteVector1 = byteVector0.putByte(22);
      label0.put(methodWriter0, byteVector0, 2, false);
      assertSame(byteVector0, byteVector1);
  }

  @Test(timeout = 4000)
  public void test51()  throws Throwable  {
      ClassWriter classWriter0 = new ClassWriter(167);
      MethodWriter methodWriter0 = new MethodWriter(classWriter0, (-12), "~7qO{AX\"7", "~7qO{AX\"7", "ConstantValue", (String[]) null, false, false);
      Label label0 = new Label();
      // Undeclared exception!
      try { 
        methodWriter0.visitLocalVariable("", (String) null, "~7qO{AX\"7", label0, label0, 26);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
      }
  }

  @Test(timeout = 4000)
  public void test52()  throws Throwable  {
      ClassWriter classWriter0 = new ClassWriter(65);
      String[] stringArray0 = new String[2];
      stringArray0[0] = "Y3[gD[S";
      stringArray0[1] = "Y3[gD[S";
      MethodWriter methodWriter0 = new MethodWriter(classWriter0, 2, "<uS~jnd)8f.ua50kl", "Y3[gD[S", "long", stringArray0, false, false);
      Attribute attribute0 = new Attribute("Y3[gD[S");
      methodWriter0.visitAttribute(attribute0);
      ByteVector byteVector0 = new ByteVector(1);
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
  public void test53()  throws Throwable  {
      ClassWriter classWriter0 = new ClassWriter(0);
      MethodWriter methodWriter0 = new MethodWriter(classWriter0, (-1348), "wA[)", "z4EGo)2?SD#", "EFi<\"LBPkd|", (String[]) null, true, true);
      methodWriter0.visitLdcInsn("W(Pk[o9E>)");
      methodWriter0.getSize();
      String[] stringArray0 = new String[0];
      MethodWriter methodWriter1 = null;
      try {
        methodWriter1 = new MethodWriter(classWriter0, 1, "o9k_T", "RuntimeInvisibleAnnotations", "wA[)", stringArray0, true, true);
        fail("Expecting exception: StringIndexOutOfBoundsException");
      
      } catch(StringIndexOutOfBoundsException e) {
      }
  }

  @Test(timeout = 4000)
  public void test54()  throws Throwable  {
      ClassWriter classWriter0 = new ClassWriter(177);
      String[] stringArray0 = new String[1];
      stringArray0[0] = "QtL+3f/G>E\"r";
      MethodWriter methodWriter0 = new MethodWriter(classWriter0, 128, "z4EGo)2?SD#", "~=gJ^HeR%Yb!1@-KE ", "QtL+3f/G>E\"r", stringArray0, false, false);
      methodWriter0.visitIincInsn(1, 191);
  }

  @Test(timeout = 4000)
  public void test55()  throws Throwable  {
      ClassWriter classWriter0 = new ClassWriter(177);
      String[] stringArray0 = new String[0];
      MethodWriter methodWriter0 = new MethodWriter(classWriter0, 76, "Bf;J<tyDTW", "ssJmS", "org.mockito.asm.ClassWriter", stringArray0, false, false);
      methodWriter0.visitIincInsn(35, 3871);
  }

  @Test(timeout = 4000)
  public void test56()  throws Throwable  {
      ClassWriter classWriter0 = new ClassWriter(0);
      MethodWriter methodWriter0 = new MethodWriter(classWriter0, (-1348), "wA[)", "z4EGo)2?SD#", "EFi<\"LBPkd|", (String[]) null, true, true);
      methodWriter0.visitAnnotation("<1", false);
      ByteVector byteVector0 = new ByteVector();
      methodWriter0.put(byteVector0);
  }

  @Test(timeout = 4000)
  public void test57()  throws Throwable  {
      ClassWriter classWriter0 = mock(ClassWriter.class, new ViolatedAssumptionAnswer());
      doReturn((-2549), 287, 97, 287, 287).when(classWriter0).newClass(anyString());
      doReturn((-2549), 812).when(classWriter0).newUTF8(anyString());
      String[] stringArray0 = new String[8];
      MethodWriter methodWriter0 = new MethodWriter(classWriter0, 2, "Ex\"D:miB*`3EN", "54[' 7;&[)1{9bt`1", "Ex\"D:miB*`3EN", stringArray0, true, true);
      methodWriter0.visitIincInsn(2, 812);
  }

  @Test(timeout = 4000)
  public void test58()  throws Throwable  {
      ClassWriter classWriter0 = new ClassWriter(0);
      MethodWriter methodWriter0 = new MethodWriter(classWriter0, (-1348), "wA[)", "z4EGo)2?SD#", "EFi<\"LBPkd|", (String[]) null, true, true);
      methodWriter0.visitLdcInsn("W(Pk[o9E>)");
      ByteVector byteVector0 = classWriter0.pool;
      methodWriter0.put(byteVector0);
      String[] stringArray0 = new String[0];
      MethodWriter methodWriter1 = null;
      try {
        methodWriter1 = new MethodWriter(classWriter0, 1, "o9k_T", "RuntimeInvisibleAnnotations", "wA[)", stringArray0, true, true);
        fail("Expecting exception: StringIndexOutOfBoundsException");
      
      } catch(StringIndexOutOfBoundsException e) {
      }
  }

  @Test(timeout = 4000)
  public void test59()  throws Throwable  {
      ClassWriter classWriter0 = new ClassWriter(205);
      MethodWriter methodWriter0 = new MethodWriter(classWriter0, 1312, "EFi<\"LBPkd|", "z4EGo)2?SD#", "3[gYD[S", (String[]) null, true, false);
      methodWriter0.visitMaxs(60, 205);
      MethodWriter methodWriter1 = new MethodWriter(classWriter0, (-53), "3[gYD[S", "jI%UP\"[F0)lGI3f", "p`E1I<<}J/^I@YC", (String[]) null, false, false);
      assertFalse(methodWriter1.equals((Object)methodWriter0));
  }

  @Test(timeout = 4000)
  public void test60()  throws Throwable  {
      ClassWriter classWriter0 = new ClassWriter(0);
      MethodWriter methodWriter0 = new MethodWriter(classWriter0, 196, "EFi<\"LBPkd|", "z4EGo)2?SD#", "3[gYD[S", (String[]) null, true, false);
      methodWriter0.visitVarInsn(57, 36);
  }

  @Test(timeout = 4000)
  public void test61()  throws Throwable  {
      ClassWriter classWriter0 = new ClassWriter(177);
      String[] stringArray0 = new String[1];
      stringArray0[0] = "QtL+3f/G>E\"r";
      MethodWriter methodWriter0 = new MethodWriter(classWriter0, (byte) (-74), "z4EGo)2?SD#", "z4EGo)2?SD#", "EFFFFFFFFGGFFFGGFFFEEFGFGFEEEEEEEEEEEEEEEEEEEEDEDEDDDDDCDCDEEEEEEEEEEEEEEEEEEEEBABABBBBDCFFFGGGEDCDCDCDCDCDCDCDCDCDCEEEEDDDDDDDCDCDCEFEFDDEEFFDEDEEEBDDBBDDDDDDCCCCCCCCEFEDDDCDCDEEEEEEEEEEFEEEEEEDDEEDDEE", stringArray0, false, true);
      methodWriter0.visitFieldInsn(50, "EFFFFFFFFGGFFFGGFFFEEFGFGFEEEEEEEEEEEEEEEEEEEEDEDEDDDDDCDCDEEEEEEEEEEEEEEEEEEEEBABABBBBDCFFFGGGEDCDCDCDCDCDCDCDCDCDCEEEEDDDDDDDCDCDCEFEFDDEEFFDEDEEEBDDBBDDDDDDCCCCCCCCEFEDDDCDCDEEEEEEEEEEFEEEEEEDDEEDDEE", " NG@#N ;Wio", "GTASP");
  }

  @Test(timeout = 4000)
  public void test62()  throws Throwable  {
      ClassWriter classWriter0 = new ClassWriter(177);
      String[] stringArray0 = new String[1];
      stringArray0[0] = "QtL+3f/G>E\"r";
      MethodWriter methodWriter0 = new MethodWriter(classWriter0, (byte) (-74), "z4EGo)2?SD#", "z4EGo)2?SD#", "RuntimeVisibleAnnotations", stringArray0, true, true);
      methodWriter0.visitAnnotation("6Y+PN2IV'qT^d1mWe", true);
      ByteVector byteVector0 = new ByteVector();
      methodWriter0.put(byteVector0);
      MethodWriter methodWriter1 = null;
      try {
        methodWriter1 = new MethodWriter(classWriter0, 127, ":SFBQ25qM", "Code", "Signature", stringArray0, true, false);
        fail("Expecting exception: StringIndexOutOfBoundsException");
      
      } catch(StringIndexOutOfBoundsException e) {
      }
  }

  @Test(timeout = 4000)
  public void test63()  throws Throwable  {
      ClassWriter classWriter0 = mock(ClassWriter.class, new ViolatedAssumptionAnswer());
      doReturn(0, 0, 0, 0, 0).when(classWriter0).newClass(anyString());
      doReturn(0, 0, 0, 0, 0).when(classWriter0).newUTF8(anyString());
      String[] stringArray0 = new String[8];
      MethodWriter methodWriter0 = new MethodWriter(classWriter0, 2, "EnclosingMethod", "EnclosingMethod", "EnclosingMethod", stringArray0, false, false);
      Label label0 = mock(Label.class, new ViolatedAssumptionAnswer());
      methodWriter0.visitLocalVariable("&eQh1]k<F'w", "EnclosingMethod", "EnclosingMethod", label0, label0, 45);
  }

  @Test(timeout = 4000)
  public void test64()  throws Throwable  {
      ClassWriter classWriter0 = new ClassWriter((-1182));
      String[] stringArray0 = new String[2];
      stringArray0[0] = "54[' 7;&[)1{t`d1";
      stringArray0[1] = "54[' 7;&[)1{t`d1";
      MethodWriter methodWriter0 = new MethodWriter(classWriter0, 0, "54[' 7;&[)1{t`d1", "54[' 7;&[)1{t`d1", "54[' 7;&[)1{t`d1", stringArray0, false, true);
      MethodWriter methodWriter1 = new MethodWriter(classWriter0, 2, "54[' 7;&[)1{t`d1", "hR.qMro%t", "54[' 7;&[)1{t`d1", stringArray0, false, false);
      methodWriter0.visitIincInsn(69, (-442));
      assertNotSame(methodWriter0, methodWriter1);
  }

  @Test(timeout = 4000)
  public void test65()  throws Throwable  {
      ClassWriter classWriter0 = new ClassWriter(0);
      MethodWriter methodWriter0 = new MethodWriter(classWriter0, (-137), "wA[)", "z4EGo)2?SD#", "LineNumberTable", (String[]) null, true, true);
      MethodWriter methodWriter1 = new MethodWriter(classWriter0, 2539, "wA[)", "54[' 7;&[)1{9bt`1", "z4EGo)2?SD#", (String[]) null, true, false);
      methodWriter1.visitIincInsn(2539, 2539);
      assertNotSame(methodWriter1, methodWriter0);
  }

  @Test(timeout = 4000)
  public void test66()  throws Throwable  {
      ClassWriter classWriter0 = new ClassWriter(22);
      String[] stringArray0 = new String[0];
      MethodWriter methodWriter0 = new MethodWriter(classWriter0, 22, "i", "i", "i", stringArray0, false, false);
      MethodWriter methodWriter1 = new MethodWriter(classWriter0, (-674), "jI%UP\"[F0)lGI3f", "Class not found", "AAAAAAAAAAAAAAAABCKLLDDDDDEEEEEEEEEEEEEEEEEEEEAAAAAAAADDDDDEEEEEEEEEEEEEEEEEEEEAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAMAAAAAAAAAAAAAAAAAAAAIIIIIIIIIIIIIIIIDNOAAAAAAGGGGGGGHAFBFAAFFAAQPIIJJIIIIIIIIIIIIIIIIII", stringArray0, false, false);
      byte[] byteArray0 = classWriter0.toByteArray();
      assertEquals(368, byteArray0.length);
  }

  @Test(timeout = 4000)
  public void test67()  throws Throwable  {
      ClassWriter classWriter0 = new ClassWriter(177);
      String[] stringArray0 = new String[2];
      stringArray0[0] = "QtL+3f/G>E\"r";
      stringArray0[1] = "QtL+3f/G>E\"r";
      MethodWriter methodWriter0 = new MethodWriter(classWriter0, 184, "QtL+3f/G>E\"r", "p^t8WB/$mRX5E60_L", "p^t8WB/$mRX5E60_L", stringArray0, false, false);
      methodWriter0.visitFrame(1, 1, stringArray0, (-146), stringArray0);
      methodWriter0.visitVarInsn(184, (-146));
      byte[] byteArray0 = classWriter0.toByteArray();
      assertEquals(166, byteArray0.length);
  }

  @Test(timeout = 4000)
  public void test68()  throws Throwable  {
      int[] intArray0 = new int[1];
      MethodWriter.getNewOffset(intArray0, intArray0, 3, (-4633));
      ClassWriter classWriter0 = new ClassWriter((-3454));
      MethodWriter methodWriter0 = new MethodWriter(classWriter0, (-702), "N5v,AUi", "9T/6AkCi>M:2jW", "p^t8WB/$mRX5E60_L", (String[]) null, false, false);
      MethodWriter methodWriter1 = null;
      try {
        methodWriter1 = new MethodWriter(classWriter0, 2294, "p^t8WB/$mRX5E60_L", "N5v,AUi", "y", (String[]) null, false, true);
        fail("Expecting exception: StringIndexOutOfBoundsException");
      
      } catch(StringIndexOutOfBoundsException e) {
      }
  }

  @Test(timeout = 4000)
  public void test69()  throws Throwable  {
      ClassWriter classWriter0 = new ClassWriter(177);
      String[] stringArray0 = new String[1];
      stringArray0[0] = "QtL+3f/G>E\"r";
      MethodWriter methodWriter0 = new MethodWriter(classWriter0, (byte) (-74), "z4EGo)2?SD#", "z4EGo)2?SD#", "EFFFFFFFFGGFFFGGFFFEEFGFGFEEEEEEEEEEEEEEEEEEEEDEDEDDDDDCDCDEEEEEEEEEEEEEEEEEEEEBABABBBBDCFFFGGGEDCDCDCDCDCDCDCDCDCDCEEEEDDDDDDDCDCDCEFEFDDEEFFDEDEEEBDDBBDDDDDDCCCCCCCCEFEDDDCDCDEEEEEEEEEEFEEEEEEDDEEDDEE", stringArray0, false, true);
      classWriter0.toByteArray();
      methodWriter0.visitLdcInsn("3[gYD[S");
  }
}
