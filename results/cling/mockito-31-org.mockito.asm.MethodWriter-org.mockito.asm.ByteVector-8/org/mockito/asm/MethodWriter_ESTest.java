/*

 * Tue Mar 03 14:30:02 GMT 2020
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
      String[] stringArray0 = new String[0];
      ClassWriter classWriter0 = new ClassWriter(15);
      MethodWriter methodWriter0 = new MethodWriter(classWriter0, 285212676, "&1w9[)K*[0", "&1w9[)K*[0", "lpm{J<$|%nX^-U5", stringArray0, true, false);
  }

  @Test(timeout = 4000)
  public void test01()  throws Throwable  {
      ClassWriter classWriter0 = new ClassWriter(64);
      String[] stringArray0 = new String[0];
      MethodWriter methodWriter0 = new MethodWriter(classWriter0, 2, "?=n^\"*HgQ", "?=n^\"*HgQ", "?=n^\"*HgQ", stringArray0, false, false);
      ClassWriter classWriter1 = new ClassWriter(2);
      Label label0 = new Label();
      methodWriter0.visitTryCatchBlock(label0, label0, label0, "LocalVariableTable");
      methodWriter0.visitFieldInsn(2433, "LocalVariableTable", "?=n^\"*HgQ", "StackMap");
      classWriter0.toByteArray();
      // Undeclared exception!
      try { 
        classWriter1.visitMethod(272, " 1=", "k", "?=n^\"*HgQ", stringArray0);
        fail("Expecting exception: StringIndexOutOfBoundsException");
      
      } catch(StringIndexOutOfBoundsException e) {
      }
  }

  @Test(timeout = 4000)
  public void test02()  throws Throwable  {
      ClassWriter classWriter0 = new ClassWriter(64);
      String[] stringArray0 = new String[0];
      MethodWriter methodWriter0 = new MethodWriter(classWriter0, 2, "?=n^\"*HgQ", "?=n^\"*HgQ", "?=n^\"*HgQ", stringArray0, false, false);
      ByteVector byteVector0 = new ByteVector(1);
      byteVector0.put11(2, 1);
      MethodWriter methodWriter1 = new MethodWriter(classWriter0, 2, "sH", "0_o4L2", "?=n^\"*HgQ", stringArray0, false, false);
      assertFalse(methodWriter1.equals((Object)methodWriter0));
  }

  @Test(timeout = 4000)
  public void test03()  throws Throwable  {
      ClassWriter classWriter0 = new ClassWriter((-868));
      String[] stringArray0 = new String[1];
      stringArray0[0] = "";
      MethodWriter methodWriter0 = new MethodWriter(classWriter0, 1, ">G", "3)`]LLp$FCoM;A", "", stringArray0, false, true);
      methodWriter0.visitMethodInsn((-868), "RuntimeVisibleAnnotations", "", "");
  }

  @Test(timeout = 4000)
  public void test04()  throws Throwable  {
      String[] stringArray0 = new String[0];
      ClassWriter classWriter0 = new ClassWriter(15);
      MethodWriter methodWriter0 = new MethodWriter(classWriter0, 1, "J*{<Xe3)phz>>\"", "J*{<Xe3)phz>>\"", "", stringArray0, false, false);
      String[] stringArray1 = new String[3];
      stringArray1[0] = "J*{<Xe3)phz>>\"";
      stringArray1[1] = "";
      stringArray1[2] = "J*{<Xe3)phz>>\"";
      MethodWriter methodWriter1 = new MethodWriter(classWriter0, 1, "J*{<Xe3)phz>>\"", "J*{<Xe3)phz>>\"", "", stringArray1, false, false);
      Label label0 = new Label();
      methodWriter0.visitLocalVariable("J*{<Xe3)phz>>\"", "OFe$G", (String) null, label0, label0, 3749);
      assertNotSame(methodWriter0, methodWriter1);
  }

  @Test(timeout = 4000)
  public void test05()  throws Throwable  {
      ClassWriter classWriter0 = new ClassWriter(15);
      String[] stringArray0 = new String[6];
      classWriter0.newDouble(15);
      MethodWriter methodWriter0 = null;
      try {
        methodWriter0 = new MethodWriter(classWriter0, 15, "J*{<Xe3)phz>>\"", "J*{<Xe3)phz>>\"", "Code", stringArray0, true, false);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
      }
  }

  @Test(timeout = 4000)
  public void test06()  throws Throwable  {
      ClassWriter classWriter0 = new ClassWriter(650);
      String[] stringArray0 = new String[4];
      stringArray0[0] = "%+";
      stringArray0[1] = "byte";
      stringArray0[2] = "+!7:{)D;9[v\"";
      stringArray0[3] = "byte";
      MethodWriter methodWriter0 = new MethodWriter(classWriter0, (-2013), "+!7:{)D;9[v\"", "+!7:{)D;9[v\"", "byte", stringArray0, true, true);
      ByteVector byteVector0 = new ByteVector(2);
      ByteVector byteVector1 = byteVector0.putLong((-593L));
      assertSame(byteVector0, byteVector1);
  }

  @Test(timeout = 4000)
  public void test07()  throws Throwable  {
      ClassWriter classWriter0 = new ClassWriter(64);
      MethodWriter methodWriter0 = new MethodWriter(classWriter0, 16, "J*{<Xe3)phz>>\"", "J*{<Xe3)phz>>\"", "/Q~Ij", (String[]) null, true, true);
      methodWriter0.visitMethodInsn(16, "E<6WIzDevb;'}}HLe}", "Jg <X>3)\"hz>>\"", "E<6WIzDevb;'}}HLe}");
  }

  @Test(timeout = 4000)
  public void test08()  throws Throwable  {
      ClassWriter classWriter0 = new ClassWriter((-868));
      String[] stringArray0 = new String[1];
      stringArray0[0] = "";
      MethodWriter methodWriter0 = new MethodWriter(classWriter0, 1, ">G", "org.mockito.asm.MethodWriter", "", stringArray0, false, false);
      methodWriter0.visitMethodInsn((-868), "RuntimeVisibleAnnotations", "", "");
  }

  @Test(timeout = 4000)
  public void test09()  throws Throwable  {
      Label label0 = new Label();
      int[] intArray0 = new int[3];
      MethodWriter.getNewOffset(intArray0, intArray0, label0);
      MethodWriter.getNewOffset(intArray0, intArray0, label0);
      assertEquals(3, intArray0.length);
  }

  @Test(timeout = 4000)
  public void test10()  throws Throwable  {
      ClassWriter classWriter0 = new ClassWriter(650);
      MethodWriter methodWriter0 = new MethodWriter(classWriter0, 1, "0r`#Fkc,8]F_<csp)", "0r`#Fkc,8]F_<csp)", "0r`#Fkc,8]F_<csp)", (String[]) null, false, false);
      methodWriter0.visitFieldInsn(2, "&1w9[)K*[0", "java/lang/String", "java/lang/Object");
  }

  @Test(timeout = 4000)
  public void test11()  throws Throwable  {
      ClassWriter classWriter0 = new ClassWriter(64);
      MethodWriter methodWriter0 = new MethodWriter(classWriter0, 1, "F9Dx%E[Zumk", ":,L#y*T9WLU^Xm>b", "Code", (String[]) null, false, false);
      Label label0 = new Label();
      methodWriter0.visitLocalVariable("h$3)oQ\"mW^mxIMW?gv", "int", "h$3)oQ\"mW^mxIMW?gv", label0, label0, 150);
  }

  @Test(timeout = 4000)
  public void test12()  throws Throwable  {
      ClassWriter classWriter0 = new ClassWriter((-868));
      String[] stringArray0 = new String[1];
      stringArray0[0] = "";
      MethodWriter methodWriter0 = new MethodWriter(classWriter0, 53, "", "", "\u0006s5Y}N87'Q8?|<W", stringArray0, false, false);
      methodWriter0.visitFrame(1, (-868), stringArray0, (-868), stringArray0);
      methodWriter0.visitFrame(1358, (-889275714), stringArray0, (-889275714), stringArray0);
      assertEquals(1, stringArray0.length);
  }

  @Test(timeout = 4000)
  public void test13()  throws Throwable  {
      ClassWriter classWriter0 = new ClassWriter(15);
      String[] stringArray0 = new String[6];
      stringArray0[0] = "J*{<Xe3)phz>>\"";
      stringArray0[1] = "Code";
      stringArray0[2] = "Signature";
      stringArray0[3] = "+'}@F#~>fP";
      stringArray0[4] = "Signature";
      stringArray0[5] = "Signature";
      MethodWriter methodWriter0 = new MethodWriter(classWriter0, 15, "J*{<Xe3)phz>>\"", "J*{<Xe3)phz>>\"", "Code", stringArray0, true, false);
      // Undeclared exception!
      try { 
        methodWriter0.visitMethodInsn(1, "java/lang/Throwable", "J*{<Xe3)phz>>\"", "Code");
        fail("Expecting exception: StringIndexOutOfBoundsException");
      
      } catch(StringIndexOutOfBoundsException e) {
      }
  }

  @Test(timeout = 4000)
  public void test14()  throws Throwable  {
      ClassWriter classWriter0 = new ClassWriter(650);
      MethodWriter methodWriter0 = new MethodWriter(classWriter0, 1, "0r`#Fkc,8]F_<csp)", "0r`#Fkc,8]F_<csp)", "0r`#Fkc,8]F_<csp)", (String[]) null, false, false);
      MethodWriter methodWriter1 = new MethodWriter(classWriter0, 1, "0r`#Fkc,8]F_<csp)", "_oue", "StackMapTable", (String[]) null, false, false);
      methodWriter0.visitMethodInsn(1, "5kg$?|S", "0r`#Fkc,8]F_<csp)", "StackMapTable");
      assertNotSame(methodWriter0, methodWriter1);
  }

  @Test(timeout = 4000)
  public void test15()  throws Throwable  {
      ClassWriter classWriter0 = new ClassWriter(64);
      String[] stringArray0 = new String[0];
      MethodWriter methodWriter0 = new MethodWriter(classWriter0, 2, "?=n^\"*HgQ", "?=n^\"*HgQ", "?=n^\"*HgQ", stringArray0, false, false);
      int[] intArray0 = new int[2];
      intArray0[0] = 2;
      int int0 = MethodWriter.getNewOffset(intArray0, intArray0, 128, 1);
      assertEquals((-129), int0);
  }

  @Test(timeout = 4000)
  public void test16()  throws Throwable  {
      String[] stringArray0 = new String[0];
      ClassWriter classWriter0 = new ClassWriter(15);
      MethodWriter methodWriter0 = new MethodWriter(classWriter0, 1, "J*{<Xe3)phz>>\"", "J*{<Xe3)phz>>\"", "", stringArray0, true, true);
      // Undeclared exception!
      try { 
        methodWriter0.visitMaxs(2, 1);
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // 14
         //
         verifyException("org.mockito.asm.Type", e);
      }
  }

  @Test(timeout = 4000)
  public void test17()  throws Throwable  {
      ClassWriter classWriter0 = new ClassWriter(15);
      String[] stringArray0 = new String[6];
      stringArray0[0] = "J*{<Xe3)phz>>\"";
      stringArray0[1] = "Code";
      stringArray0[2] = "Signature";
      stringArray0[3] = "+'}@F#~>fP";
      stringArray0[4] = "Signature";
      stringArray0[5] = "Signature";
      MethodWriter methodWriter0 = new MethodWriter(classWriter0, 15, "J*{<Xe3)phz>>\"", "J*{<Xe3)phz>>\"", "Code", stringArray0, true, false);
      methodWriter0.visitFieldInsn(2, "+'}@F#~>fP", "Ljava/lang/Synthetic;", "Code");
  }

  @Test(timeout = 4000)
  public void test18()  throws Throwable  {
      ClassWriter classWriter0 = new ClassWriter(650);
      String[] stringArray0 = new String[4];
      stringArray0[0] = "%+";
      stringArray0[1] = "yt";
      stringArray0[2] = "+!7:{)D;9[v\"";
      stringArray0[3] = "yt";
      MethodWriter methodWriter0 = new MethodWriter(classWriter0, (-2013), "+!7:{)D;9[v\"", "+!7:{)D;9[v\"", "yt", stringArray0, false, true);
      // Undeclared exception!
      try { 
        methodWriter0.visitMaxs(74, (-2013));
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // 12
         //
         verifyException("org.mockito.asm.Type", e);
      }
  }

  @Test(timeout = 4000)
  public void test19()  throws Throwable  {
      ClassWriter classWriter0 = mock(ClassWriter.class, new ViolatedAssumptionAnswer());
      doReturn(26).when(classWriter0).newClass(anyString());
      doReturn(3749, 3749).when(classWriter0).newUTF8(anyString());
      String[] stringArray0 = new String[1];
      MethodWriter methodWriter0 = new MethodWriter(classWriter0, 1, "<", "<", "<", stringArray0, false, false);
      methodWriter0.visitFrame(2, (-585), stringArray0, 104, stringArray0);
      assertEquals(1, stringArray0.length);
  }

  @Test(timeout = 4000)
  public void test20()  throws Throwable  {
      ClassWriter classWriter0 = new ClassWriter(64);
      String[] stringArray0 = new String[0];
      MethodWriter methodWriter0 = new MethodWriter(classWriter0, 2, "Jg <X>3)\"hz>>\"", "Jg <X>3)\"hz>>\"", "Jg <X>3)\"hz>>\"", stringArray0, false, false);
      MethodWriter methodWriter1 = new MethodWriter(classWriter0, 16, "Jg <X>3)\"hz>>\"", "Jg <X>3)\"hz>>\"", "Exceptions", stringArray0, true, true);
      methodWriter1.visitMethodInsn((-784), "Jg <X>3)\"hz>>\"", "Exceptions", "D/[tX-I");
      assertNotSame(methodWriter1, methodWriter0);
  }

  @Test(timeout = 4000)
  public void test21()  throws Throwable  {
      ClassWriter classWriter0 = new ClassWriter(64);
      String[] stringArray0 = new String[0];
      MethodWriter methodWriter0 = new MethodWriter(classWriter0, 2, "?=n^\"*HgQ", "?=n^\"*HgQ", "?=n^\"*HgQ", stringArray0, false, false);
      MethodWriter methodWriter1 = new MethodWriter(classWriter0, 1, "?=n^\"*HgQ", "?=n^\"*HgQ", "?=n^\"*HgQ", stringArray0, false, false);
      methodWriter1.visitVarInsn(64, 1);
      assertNotSame(methodWriter1, methodWriter0);
  }

  @Test(timeout = 4000)
  public void test22()  throws Throwable  {
      String[] stringArray0 = new String[0];
      ClassWriter classWriter0 = new ClassWriter(15);
      MethodWriter methodWriter0 = new MethodWriter(classWriter0, 1, "J*{<Xe3)phz>>\"", "J*{<Xe3)phz>>\"", "", stringArray0, true, true);
      String[] stringArray1 = new String[3];
      stringArray1[0] = "J*{<Xe3)phz>>\"";
      stringArray1[1] = "";
      stringArray1[2] = "J*{<Xe3)phz>>\"";
      MethodWriter methodWriter1 = new MethodWriter(classWriter0, 1, "J*{<Xe3)phz>>\"", "J*{<Xe3)phz>>\"", "", stringArray1, true, false);
      classWriter0.visit(15, 15, "Code", "RuntimeVisibleAnnotations", "-}@uv&qvq.i<|v^z2B", stringArray1);
      assertEquals(1, ClassWriter.COMPUTE_MAXS);
  }

  @Test(timeout = 4000)
  public void test23()  throws Throwable  {
      ClassWriter classWriter0 = new ClassWriter(64);
      String[] stringArray0 = new String[0];
      MethodWriter methodWriter0 = new MethodWriter(classWriter0, 2, "?=n\"*HgQ", "?=n\"*HgQ", "?=n\"*HgQ", stringArray0, false, false);
      MethodWriter methodWriter1 = new MethodWriter(classWriter0, 64, "UZQ`Ez^Xo3Di8*%!T", "UZQ`Ez^Xo3Di8*%!T", "G|6Yc3!C", (String[]) null, false, false);
      int[] intArray0 = new int[1];
      intArray0[0] = 748;
      int int0 = MethodWriter.getNewOffset(intArray0, intArray0, 2, 748);
      assertEquals(1494, int0);
  }

  @Test(timeout = 4000)
  public void test24()  throws Throwable  {
      ClassWriter classWriter0 = new ClassWriter(3220);
      String[] stringArray0 = new String[0];
      MethodWriter methodWriter0 = new MethodWriter(classWriter0, 92, "prUe|?wRMQYd`yV", "+!7:{)D;9[v\"", "?=n\"*Hg[", stringArray0, true, true);
  }

  @Test(timeout = 4000)
  public void test25()  throws Throwable  {
      ClassWriter classWriter0 = new ClassWriter(650);
      String[] stringArray0 = new String[4];
      stringArray0[0] = "%+";
      stringArray0[1] = "yt";
      stringArray0[2] = "+!7:{)D;9[v\"";
      stringArray0[3] = "yt";
      MethodWriter methodWriter0 = new MethodWriter(classWriter0, (-2013), "+!7:{)D;9[v\"", "+!7:{)D;9[v\"", "yt", stringArray0, false, true);
      ByteVector byteVector0 = new ByteVector(2);
      byteVector0.put12(166, 2);
      ByteVector byteVector1 = byteVector0.put11(2, 166);
      assertSame(byteVector1, byteVector0);
  }

  @Test(timeout = 4000)
  public void test26()  throws Throwable  {
      ClassWriter classWriter0 = new ClassWriter(64);
      String[] stringArray0 = new String[0];
      MethodWriter methodWriter0 = new MethodWriter(classWriter0, 2, "oHAtS!md#>+", "oHAtS!md#>+", "oHAtS!md#>+", stringArray0, false, false);
      Object[] objectArray0 = new Object[4];
      MethodWriter methodWriter1 = new MethodWriter(classWriter0, 1850, "AR", "?=n^\"*HgQ", "mj_s`35A9L", stringArray0, false, false);
      // Undeclared exception!
      try { 
        methodWriter1.visitFrame(4, 1, stringArray0, 1080, objectArray0);
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
      ClassWriter classWriter0 = new ClassWriter(64);
      String[] stringArray0 = new String[0];
      MethodWriter methodWriter0 = new MethodWriter(classWriter0, 2, "?=n^\"*HgQ", "?=n^\"*HgQ", "?=n^\"*HgQ", stringArray0, false, false);
      methodWriter0.visitVarInsn((-701), 1);
      MethodWriter methodWriter1 = null;
      try {
        methodWriter1 = new MethodWriter(classWriter0, 76, "?=n^\"*HgQ", "prUe|?wRMQYd`yV", "prUe|?wRMQYd`yV", stringArray0, true, false);
        fail("Expecting exception: StringIndexOutOfBoundsException");
      
      } catch(StringIndexOutOfBoundsException e) {
      }
  }

  @Test(timeout = 4000)
  public void test28()  throws Throwable  {
      String[] stringArray0 = new String[0];
      ClassWriter classWriter0 = new ClassWriter(15);
      MethodWriter methodWriter0 = new MethodWriter(classWriter0, (-2433), "J*{<Xe3)phz>>\"", "J*{<Xe3)phz>>\"", "", stringArray0, true, true);
      methodWriter0.visitTryCatchBlock((Label) null, (Label) null, (Label) null, "g");
      methodWriter0.visitFieldInsn(1, "E<6WIzDevb;'}}HLe}", "", ";1P%.9wQ0xZ");
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
  public void test29()  throws Throwable  {
      ClassWriter classWriter0 = new ClassWriter(64);
      String[] stringArray0 = new String[1];
      stringArray0[0] = "";
      MethodWriter methodWriter0 = new MethodWriter(classWriter0, 64, "", "", "\u0006s5Y}N87'Q8?|<W", stringArray0, false, false);
      // Undeclared exception!
      try { 
        methodWriter0.visitFrame(1, 64, stringArray0, 64, stringArray0);
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // 1
         //
         verifyException("org.mockito.asm.MethodWriter", e);
      }
  }

  @Test(timeout = 4000)
  public void test30()  throws Throwable  {
      ClassWriter classWriter0 = new ClassWriter(64);
      String[] stringArray0 = new String[0];
      MethodWriter methodWriter0 = new MethodWriter(classWriter0, 2, "oHAtS!md#>+", "oHAtS!md#>+", "oHAtS!md#>+", stringArray0, false, false);
      MethodWriter methodWriter1 = new MethodWriter(classWriter0, 1850, "Al", "?=n^\"*HgQ", "mj_s`35A9L", stringArray0, false, false);
      methodWriter1.visitAnnotation("Al", true);
      byte[] byteArray0 = classWriter0.toByteArray();
      assertEquals(152, byteArray0.length);
  }

  @Test(timeout = 4000)
  public void test31()  throws Throwable  {
      String[] stringArray0 = new String[0];
      ClassWriter classWriter0 = new ClassWriter(15);
      MethodWriter methodWriter0 = new MethodWriter(classWriter0, 1, "J*{<Xe3)phz>>\"", "J*{<Xe3)phz>>\"", "", stringArray0, false, false);
      String[] stringArray1 = new String[3];
      stringArray1[0] = "J*{<Xe3)phz>>\"";
      stringArray1[1] = "";
      stringArray1[2] = "J*{<Xe3)phz>>\"";
      MethodWriter methodWriter1 = new MethodWriter(classWriter0, 1, "J*{<Xe3)phz>>\"", "J*{<Xe3)phz>>\"", "", stringArray1, false, false);
      ByteVector byteVector0 = new ByteVector(15);
      methodWriter1.visitAnnotationDefault();
      methodWriter1.put(byteVector0);
      assertNotSame(methodWriter1, methodWriter0);
  }

  @Test(timeout = 4000)
  public void test32()  throws Throwable  {
      ClassWriter classWriter0 = new ClassWriter(108);
      String[] stringArray0 = new String[7];
      stringArray0[0] = "e&XP]7vidln";
      stringArray0[1] = "8p:%qO'f4F+5M'yZ^U";
      stringArray0[2] = "@Mi*i$(H`NL[W^{mxX$";
      stringArray0[3] = "@Mi*i$(H`NL[W^{mxX$";
      stringArray0[4] = "@Mi*i$(H`NL[W^{mxX$";
      stringArray0[5] = "5o~MWIJ";
      stringArray0[6] = "@Mi*i$(H`NL[W^{mxX$";
      MethodWriter methodWriter0 = null;
      try {
        methodWriter0 = new MethodWriter(classWriter0, 2, "8p:%qO'f4F+5M'yZ^U", "@Mi*i$(H`NL[W^{mxX$", "e&XP]7vidln", stringArray0, false, true);
        fail("Expecting exception: StringIndexOutOfBoundsException");
      
      } catch(StringIndexOutOfBoundsException e) {
      }
  }

  @Test(timeout = 4000)
  public void test33()  throws Throwable  {
      ClassWriter classWriter0 = new ClassWriter(64);
      String[] stringArray0 = new String[0];
      MethodWriter methodWriter0 = new MethodWriter(classWriter0, 2, "?=n^\"*HgQ", "?=n^\"*HgQ", "?=n^\"*HgQ", stringArray0, false, false);
      // Undeclared exception!
      try { 
        MethodWriter.getArgumentsAndReturnSizes("8vLq1dKh");
        fail("Expecting exception: StringIndexOutOfBoundsException");
      
      } catch(StringIndexOutOfBoundsException e) {
      }
  }

  @Test(timeout = 4000)
  public void test34()  throws Throwable  {
      ClassWriter classWriter0 = new ClassWriter(64);
      String[] stringArray0 = new String[0];
      MethodWriter methodWriter0 = new MethodWriter(classWriter0, 2, "?=n^\"*HgQ", "?=n^\"*HgQ", "?=n^\"*HgQ", stringArray0, false, false);
      Label label0 = new Label();
      int[] intArray0 = new int[4];
      intArray0[0] = 1;
      MethodWriter.getNewOffset(intArray0, intArray0, label0);
      assertEquals(4, intArray0.length);
  }

  @Test(timeout = 4000)
  public void test35()  throws Throwable  {
      ClassWriter classWriter0 = new ClassWriter(64);
      String[] stringArray0 = new String[0];
      MethodWriter methodWriter0 = new MethodWriter(classWriter0, 2, "?=n^\"*HgQ", "?=n^\"*HgQ", "?=n^\"*HgQ", stringArray0, false, false);
      ClassWriter classWriter1 = new ClassWriter(2);
      methodWriter0.visitFieldInsn(2433, "LocalVariableTable", "?=n^\"*HgQ", "StackMap");
      classWriter0.toByteArray();
      // Undeclared exception!
      try { 
        classWriter1.visitMethod(272, " 1=", "k", "?=n^\"*HgQ", stringArray0);
        fail("Expecting exception: StringIndexOutOfBoundsException");
      
      } catch(StringIndexOutOfBoundsException e) {
      }
  }

  @Test(timeout = 4000)
  public void test36()  throws Throwable  {
      ClassWriter classWriter0 = new ClassWriter((-399));
      String[] stringArray0 = new String[5];
      stringArray0[0] = "RuntimeInvisibleAnnotations";
      stringArray0[1] = "eqP{7vqlnl";
      stringArray0[2] = "@Mi*i(H`NL[W^{mxX$";
      stringArray0[3] = "RuntimeVisibleParameterAnnotations";
      stringArray0[4] = "eqP{7vqlnl";
      MethodWriter methodWriter0 = new MethodWriter(classWriter0, (-2257), "@Mi*i(H`NL[W^{mxX$", "eqP{7vqlnl", "eqP{7vqlnl", stringArray0, false, false);
      Attribute attribute0 = new Attribute("RuntimeInvisibleAnnotations");
      methodWriter0.visitAttribute(attribute0);
      // Undeclared exception!
      try { 
        methodWriter0.getSize();
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.mockito.asm.Attribute", e);
      }
  }

  @Test(timeout = 4000)
  public void test37()  throws Throwable  {
      ClassWriter classWriter0 = new ClassWriter(650);
      String[] stringArray0 = new String[4];
      stringArray0[0] = "%+";
      stringArray0[1] = "yt";
      stringArray0[2] = "+!7:{)D;9[v\"";
      stringArray0[3] = "yt";
      MethodWriter methodWriter0 = new MethodWriter(classWriter0, (-2013), "+!7:{)D;9[v\"", "+!7:{)D;9[v\"", "yt", stringArray0, false, true);
      methodWriter0.visitAnnotationDefault();
      ByteVector byteVector0 = new ByteVector(2);
      methodWriter0.put(byteVector0);
  }

  @Test(timeout = 4000)
  public void test38()  throws Throwable  {
      String[] stringArray0 = new String[0];
      ClassWriter classWriter0 = new ClassWriter(15);
      MethodWriter methodWriter0 = new MethodWriter(classWriter0, 1, "J*{<Xe3)phz>>\"", "J*{<Xe3)phz>>\"", "", stringArray0, false, false);
      String[] stringArray1 = new String[3];
      stringArray1[0] = "J*{<Xe3)phz>>\"";
      stringArray1[1] = "";
      stringArray1[2] = "J*{<Xe3)phz>>\"";
      MethodWriter methodWriter1 = new MethodWriter(classWriter0, 1, "J*{<Xe3)phz>>\"", "J*{<Xe3)phz>>\"", "", stringArray1, false, false);
      methodWriter0.visitInsn((-1683));
      assertNotSame(methodWriter0, methodWriter1);
  }

  @Test(timeout = 4000)
  public void test39()  throws Throwable  {
      String[] stringArray0 = new String[0];
      ClassWriter classWriter0 = new ClassWriter(15);
      MethodWriter methodWriter0 = new MethodWriter(classWriter0, 1, "J*{<Xe3)phz>>\"", "J*{<Xe3)phz>>\"", "", stringArray0, true, true);
      // Undeclared exception!
      try { 
        methodWriter0.visitInsn(76);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.mockito.asm.Frame", e);
      }
  }

  @Test(timeout = 4000)
  public void test40()  throws Throwable  {
      int[] intArray0 = new int[1];
      intArray0[0] = 1528;
      MethodWriter.getNewOffset(intArray0, intArray0, 131072, 67);
      ClassWriter classWriter0 = mock(ClassWriter.class, new ViolatedAssumptionAnswer());
      doReturn(83, 10, 67, 10, 1091).when(classWriter0).newClass(anyString());
      doReturn(48, 53).when(classWriter0).newUTF8(anyString());
      String[] stringArray0 = new String[5];
      MethodWriter methodWriter0 = null;
      try {
        methodWriter0 = new MethodWriter(classWriter0, 131072, "", "", "CY.r_evH0q_c|;W", stringArray0, true, true);
        fail("Expecting exception: StringIndexOutOfBoundsException");
      
      } catch(StringIndexOutOfBoundsException e) {
      }
  }

  @Test(timeout = 4000)
  public void test41()  throws Throwable  {
      ClassWriter classWriter0 = new ClassWriter((-868));
      String[] stringArray0 = new String[1];
      stringArray0[0] = "";
      MethodWriter methodWriter0 = new MethodWriter(classWriter0, 64, "", "", "\u0006s5Y}N87'Q8?|<W", stringArray0, false, false);
      int[] intArray0 = new int[7];
      intArray0[0] = 1;
      Label label0 = new Label();
      MethodWriter.getNewOffset(intArray0, intArray0, label0);
      assertArrayEquals(new int[] {1, 0, 0, 0, 0, 0, 0}, intArray0);
  }

  @Test(timeout = 4000)
  public void test42()  throws Throwable  {
      String[] stringArray0 = new String[0];
      ClassWriter classWriter0 = new ClassWriter(15);
      MethodWriter methodWriter0 = new MethodWriter(classWriter0, 1, "J*{<Xe3)phz>>\"", "J*{<Xe3)phz>>\"", "", stringArray0, true, true);
      String[] stringArray1 = new String[3];
      stringArray1[0] = "J*{<Xe3)phz>>\"";
      stringArray1[1] = "";
      stringArray1[2] = "J*{<Xe3)phz>>\"";
      MethodWriter methodWriter1 = new MethodWriter(classWriter0, 1, "J*{<Xe3)phz>>\"", "J*{<Xe3)phz>>\"", "", stringArray1, true, false);
      methodWriter1.visitLdcInsn("J*{<Xe3)phz>>\"");
      assertNotSame(methodWriter1, methodWriter0);
  }

  @Test(timeout = 4000)
  public void test43()  throws Throwable  {
      ClassWriter classWriter0 = new ClassWriter((-868));
      String[] stringArray0 = new String[1];
      stringArray0[0] = "";
      MethodWriter methodWriter0 = new MethodWriter(classWriter0, 64, "", "", "\u0006s5Y}N87'Q8?|<W", stringArray0, false, false);
      methodWriter0.visitMaxs(227, 227);
  }

  @Test(timeout = 4000)
  public void test44()  throws Throwable  {
      ClassWriter classWriter0 = new ClassWriter(64);
      String[] stringArray0 = new String[0];
      MethodWriter methodWriter0 = new MethodWriter(classWriter0, 2, "?=n\"*HgQ", "?=n\"*HgQ", "?=n\"*HgQ", stringArray0, false, false);
      methodWriter0.visitMaxs(748, 285212682);
  }

  @Test(timeout = 4000)
  public void test45()  throws Throwable  {
      ClassWriter classWriter0 = new ClassWriter(64);
      String[] stringArray0 = new String[0];
      MethodWriter methodWriter0 = new MethodWriter(classWriter0, 2, "oHAtS!md#>+", "oHAtS!md#>+", "oHAtS!md#>+", stringArray0, false, false);
      MethodWriter methodWriter1 = new MethodWriter(classWriter0, 1850, "Al", "?=n^\"*HgQ", "mj_s`35A9L", stringArray0, false, false);
      Attribute attribute0 = new Attribute("mj_s`35A9L");
      methodWriter1.visitAttribute(attribute0);
      // Undeclared exception!
      try { 
        classWriter0.toByteArray();
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.mockito.asm.Attribute", e);
      }
  }

  @Test(timeout = 4000)
  public void test46()  throws Throwable  {
      ClassWriter classWriter0 = new ClassWriter(15);
      String[] stringArray0 = new String[2];
      stringArray0[0] = "";
      stringArray0[1] = "J*{<Xe3)phz>>\"";
      MethodWriter methodWriter0 = new MethodWriter(classWriter0, 9, "J*{<Xe3)phz>>\"", "J*{<Xe3)phz>>\"", "<", stringArray0, true, false);
      methodWriter0.visitVarInsn(9, 86);
      MethodWriter methodWriter1 = null;
      try {
        methodWriter1 = new MethodWriter(classWriter0, 77, "WT1", "e4 @yhN", "Code", stringArray0, true, false);
        fail("Expecting exception: StringIndexOutOfBoundsException");
      
      } catch(StringIndexOutOfBoundsException e) {
      }
  }

  @Test(timeout = 4000)
  public void test47()  throws Throwable  {
      String[] stringArray0 = new String[0];
      ClassWriter classWriter0 = new ClassWriter(15);
      MethodWriter methodWriter0 = new MethodWriter(classWriter0, (-2433), "J*{<Xe3)phz>>\"", "J*{<Xe3)phz>>\"", "", stringArray0, true, true);
      ClassWriter classWriter1 = new ClassWriter(22);
      ByteVector byteVector0 = classWriter1.pool;
      methodWriter0.put(byteVector0);
      methodWriter0.visitFieldInsn(33, "&1w9[)K*[0", "lpm{J<$|%nX^-U5", "java/lang/Class");
      classWriter0.newDouble(91);
      MethodWriter methodWriter1 = new MethodWriter(classWriter0, 285212676, "&1w9[)K*[0", "&1w9[)K*[0", "lpm{J<$|%nX^-U5", stringArray0, true, false);
      methodWriter1.visitFieldInsn(91, "java/lang/Class", "Ljava/lang/Synthetic;", "LocalVariableTable");
      assertNotSame(methodWriter1, methodWriter0);
  }

  @Test(timeout = 4000)
  public void test48()  throws Throwable  {
      String[] stringArray0 = new String[0];
      ClassWriter classWriter0 = new ClassWriter(15);
      MethodWriter methodWriter0 = new MethodWriter(classWriter0, (-2433), "J*{<Xe3)phz>>\"", "J*{<Xe3)phz>>\"", "", stringArray0, true, true);
      MethodWriter methodWriter1 = new MethodWriter(classWriter0, 285212676, "&1w9[)K*[0", "&1w9[)K*[0", "lpm{J<$|%nX^-U5", stringArray0, true, false);
      // Undeclared exception!
      try { 
        methodWriter1.visitMethodInsn(6, "", "java/lang/Class", "vW~");
        fail("Expecting exception: StringIndexOutOfBoundsException");
      
      } catch(StringIndexOutOfBoundsException e) {
      }
  }

  @Test(timeout = 4000)
  public void test49()  throws Throwable  {
      ClassWriter classWriter0 = new ClassWriter(64);
      String[] stringArray0 = new String[0];
      MethodWriter methodWriter0 = new MethodWriter(classWriter0, 2, "?=n^\"*HgQ", "?=n^\"*HgQ", "?=n^\"*HgQ", stringArray0, false, false);
      Label label0 = new Label();
      methodWriter0.visitTryCatchBlock(label0, label0, label0, "LocalVariableTable");
      methodWriter0.visitFieldInsn(2433, "LocalVariableTable", "g", "StackMap");
      classWriter0.toByteArray();
      MethodWriter methodWriter1 = null;
      try {
        methodWriter1 = new MethodWriter(classWriter0, 2433, "g", "StackMap", "Code", stringArray0, true, false);
        fail("Expecting exception: StringIndexOutOfBoundsException");
      
      } catch(StringIndexOutOfBoundsException e) {
      }
  }

  @Test(timeout = 4000)
  public void test50()  throws Throwable  {
      ClassWriter classWriter0 = new ClassWriter(64);
      String[] stringArray0 = new String[0];
      MethodWriter methodWriter0 = new MethodWriter(classWriter0, 2, "oHAtS!md#>+", "oHAtS!md#>+", "oHAtS!md#>+", stringArray0, false, false);
      Object[] objectArray0 = new Object[4];
      methodWriter0.visitFrame(55, 6, objectArray0, 4, objectArray0);
      classWriter0.visit(70, 285212675, "?=n^\"*HgQ", "?=n^\"*HgQ", "?=n^\"*HgQ", stringArray0);
      methodWriter0.visitFieldInsn(55, "?=n^\"*HgQ", "double", "JSR/RET are not supported with computeFrames option");
      byte[] byteArray0 = classWriter0.toByteArray();
      assertEquals(214, byteArray0.length);
  }

  @Test(timeout = 4000)
  public void test51()  throws Throwable  {
      ClassWriter classWriter0 = new ClassWriter(64);
      String[] stringArray0 = new String[0];
      MethodWriter methodWriter0 = new MethodWriter(classWriter0, 2, "?=n^\"*HgQ", "?=n^\"*HgQ", "?=n^\"*HgQ", stringArray0, false, false);
      methodWriter0.visitFrame(449, 1, stringArray0, 64, stringArray0);
      methodWriter0.visitIincInsn((-3507), 115);
      byte[] byteArray0 = classWriter0.toByteArray();
      assertEquals(111, byteArray0.length);
  }

  @Test(timeout = 4000)
  public void test52()  throws Throwable  {
      ClassWriter classWriter0 = new ClassWriter(64);
      String[] stringArray0 = new String[0];
      MethodWriter methodWriter0 = new MethodWriter(classWriter0, 2, "Jg <X>3)\"hz>>\"", "Jg <X>3)\"hz>>\"", "Jg <X>3)\"hz>>\"", stringArray0, false, false);
      MethodWriter methodWriter1 = new MethodWriter(classWriter0, 16, "Jg <X>3)\"hz>>\"", "Jg <X>3)\"hz>>\"", "Exceptions", stringArray0, true, true);
      methodWriter1.visitVarInsn(1, 16);
      assertNotSame(methodWriter1, methodWriter0);
  }

  @Test(timeout = 4000)
  public void test53()  throws Throwable  {
      ClassWriter classWriter0 = new ClassWriter(1);
      MethodWriter methodWriter0 = new MethodWriter(classWriter0, 994, "0r`#Fkc,8]F_<csp)", "", "rWUKN<1W(Qnz<@>", (String[]) null, false, false);
      MethodWriter methodWriter1 = null;
      try {
        methodWriter1 = new MethodWriter(classWriter0, 1, "org.mockito.asm.Label", "org.mockito.asm.Label", (String) null, (String[]) null, true, true);
        fail("Expecting exception: StringIndexOutOfBoundsException");
      
      } catch(StringIndexOutOfBoundsException e) {
      }
  }

  @Test(timeout = 4000)
  public void test54()  throws Throwable  {
      String[] stringArray0 = new String[0];
      ClassWriter classWriter0 = new ClassWriter(15);
      MethodWriter methodWriter0 = new MethodWriter(classWriter0, 1, "J*{<Xe3)phz>>\"", "J*{<Xe3)phz>>\"", "", stringArray0, false, false);
      String[] stringArray1 = new String[3];
      stringArray1[0] = "J*{<Xe3)phz>>\"";
      stringArray1[1] = "";
      stringArray1[2] = "J*{<Xe3)phz>>\"";
      MethodWriter methodWriter1 = new MethodWriter(classWriter0, 1, "J*{<Xe3)phz>>\"", "J*{<Xe3)phz>>\"", "", stringArray1, false, false);
      byte[] byteArray0 = classWriter0.toByteArray();
      assertEquals(121, byteArray0.length);
  }

  @Test(timeout = 4000)
  public void test55()  throws Throwable  {
      ClassWriter classWriter0 = new ClassWriter(650);
      MethodWriter methodWriter0 = new MethodWriter(classWriter0, 1, "0r`#Fkc,8]F_<csp)", "0r`#Fkc,8]F_<csp)", "0r`#Fkc,8]F_<csp)", (String[]) null, false, false);
      methodWriter0.visitIincInsn(185, 2);
      ByteVector byteVector0 = new ByteVector(2);
      methodWriter0.put(byteVector0);
      MethodWriter methodWriter1 = new MethodWriter(classWriter0, 1, "0r`#Fkc,8]F_<csp)", "_oue", "StackMapTable", (String[]) null, false, false);
      assertFalse(methodWriter1.equals((Object)methodWriter0));
  }

  @Test(timeout = 4000)
  public void test56()  throws Throwable  {
      ClassWriter classWriter0 = mock(ClassWriter.class, new ViolatedAssumptionAnswer());
      doReturn(26).when(classWriter0).newClass(anyString());
      doReturn(3749, 3749).when(classWriter0).newUTF8(anyString());
      String[] stringArray0 = new String[1];
      MethodWriter methodWriter0 = new MethodWriter(classWriter0, 1, "<", "<", "<", stringArray0, false, false);
      methodWriter0.visitIincInsn(50, 811);
  }

  @Test(timeout = 4000)
  public void test57()  throws Throwable  {
      ClassWriter classWriter0 = new ClassWriter(650);
      String[] stringArray0 = new String[4];
      stringArray0[0] = "%+";
      stringArray0[1] = "yt";
      stringArray0[2] = "+!7:{)D;9[v\"";
      stringArray0[3] = "yt";
      MethodWriter methodWriter0 = new MethodWriter(classWriter0, (-2013), "+!7:{)D;9[v\"", "+!7:{)D;9[v\"", "yt", stringArray0, false, true);
      methodWriter0.visitIincInsn(1, (-2013));
      Label label0 = new Label();
      methodWriter0.visitLocalVariable("w<a?Q", "w<a?Q", "%+", label0, label0, 11);
      ByteVector byteVector0 = new ByteVector();
      methodWriter0.put(byteVector0);
  }

  @Test(timeout = 4000)
  public void test58()  throws Throwable  {
      ClassWriter classWriter0 = new ClassWriter(64);
      String[] stringArray0 = new String[0];
      MethodWriter methodWriter0 = new MethodWriter(classWriter0, 2, "?=n^\"*HgQ", "?=n^\"*HgQ", "?=n^\"*HgQ", stringArray0, false, false);
      Label label0 = new Label();
      methodWriter0.visitLocalVariable("?=n^\"*HgQ", "QGa*2<CH*R9g7]hC", "LocalVariableTanble", label0, label0, 45);
      methodWriter0.visitMethodInsn(1, "RuntimeVisibleAnnotations", "StackMap", "?=n^\"*HgQ");
      ByteVector byteVector0 = new ByteVector();
      methodWriter0.put(byteVector0);
  }

  @Test(timeout = 4000)
  public void test59()  throws Throwable  {
      ClassWriter classWriter0 = new ClassWriter(650);
      MethodWriter methodWriter0 = new MethodWriter(classWriter0, 1, "0r`#Fkc,8]F_<csp)", "0r`#Fkc,8]F_<csp)", "0r`#Fkc,8]F_<csp)", (String[]) null, false, false);
      methodWriter0.visitFrame(650, (-1340), (Object[]) null, (-3654), (Object[]) null);
      methodWriter0.visitIincInsn(185, 2);
      ByteVector byteVector0 = classWriter0.pool;
      methodWriter0.put(byteVector0);
      MethodWriter methodWriter1 = null;
      try {
        methodWriter1 = new MethodWriter(classWriter0, 32, "0r`#Fkc,8]F_<csp)", "@", "org.mockito.asm.ClassReader", (String[]) null, false, true);
        fail("Expecting exception: StringIndexOutOfBoundsException");
      
      } catch(StringIndexOutOfBoundsException e) {
      }
  }

  @Test(timeout = 4000)
  public void test60()  throws Throwable  {
      String[] stringArray0 = new String[0];
      ClassWriter classWriter0 = new ClassWriter(15);
      MethodWriter methodWriter0 = new MethodWriter(classWriter0, 1, "J*{<Xe3)phz>>\"", "J*{<Xe3)phz>>\"", "", stringArray0, true, true);
      String[] stringArray1 = new String[3];
      stringArray1[0] = "J*{<Xe3)phz>>\"";
      stringArray1[1] = "";
      stringArray1[2] = "J*{<Xe3)phz>>\"";
      MethodWriter methodWriter1 = new MethodWriter(classWriter0, 1, "J*{<Xe3)phz>>\"", "J*{<Xe3)phz>>\"", "", stringArray1, true, false);
      methodWriter1.visitMaxs(41, 32);
      assertNotSame(methodWriter1, methodWriter0);
  }

  @Test(timeout = 4000)
  public void test61()  throws Throwable  {
      ClassWriter classWriter0 = new ClassWriter(650);
      String[] stringArray0 = new String[4];
      stringArray0[0] = "%+";
      stringArray0[1] = "yt";
      stringArray0[2] = "+!7:{)D;9[v\"";
      stringArray0[3] = "yt";
      MethodWriter methodWriter0 = new MethodWriter(classWriter0, (-2013), "+!7:{)D;9[v\"", "+!7:{)D;9[v\"", "yt", stringArray0, false, true);
      MethodWriter methodWriter1 = null;
      try {
        methodWriter1 = new MethodWriter(classWriter0, 13, "+!7:{)D;9[v\"", "yt", "%+", stringArray0, false, true);
        fail("Expecting exception: StringIndexOutOfBoundsException");
      
      } catch(StringIndexOutOfBoundsException e) {
      }
  }

  @Test(timeout = 4000)
  public void test62()  throws Throwable  {
      ClassWriter classWriter0 = new ClassWriter((-868));
      String[] stringArray0 = new String[1];
      stringArray0[0] = "";
      MethodWriter methodWriter0 = new MethodWriter(classWriter0, 64, "", "", "\u0006s5Y}N87'Q8?|<W", stringArray0, false, false);
      Label label0 = new Label();
      methodWriter0.visitTryCatchBlock(label0, label0, label0, "");
      methodWriter0.visitFieldInsn(0, "\u0006s5Y}N87'Q8?|<W", "StackMap", "StackMap");
      byte[] byteArray0 = classWriter0.toByteArray();
      assertEquals(160, byteArray0.length);
  }

  @Test(timeout = 4000)
  public void test63()  throws Throwable  {
      ClassWriter classWriter0 = new ClassWriter(650);
      String[] stringArray0 = new String[4];
      stringArray0[0] = "%+";
      stringArray0[1] = "byte";
      stringArray0[2] = "0r`#Fkc,8]F_<csp)";
      stringArray0[3] = "byte";
      MethodWriter methodWriter0 = new MethodWriter(classWriter0, (-2013), "0r`#Fkc,8]F_<csp)", "0r`#Fkc,8]F_<csp)", "byte", stringArray0, true, false);
      methodWriter0.visitInsn(106);
  }

  @Test(timeout = 4000)
  public void test64()  throws Throwable  {
      String[] stringArray0 = new String[0];
      ClassWriter classWriter0 = new ClassWriter(15);
      MethodWriter methodWriter0 = new MethodWriter(classWriter0, 1, "J*{<Xe3)phz>>\"", "J*{<Xe3)phz>>\"", "", stringArray0, true, true);
      ByteVector byteVector0 = new ByteVector(15);
      ByteVector byteVector1 = byteVector0.put11(2, (-3839));
      methodWriter0.put(byteVector0);
      assertSame(byteVector0, byteVector1);
  }

  @Test(timeout = 4000)
  public void test65()  throws Throwable  {
      String[] stringArray0 = new String[0];
      ClassWriter classWriter0 = new ClassWriter(15);
      MethodWriter methodWriter0 = new MethodWriter(classWriter0, 1, "J*{<Xe3)phz>>\"", "J*{<Xe3)phz>>\"", "", stringArray0, false, false);
      MethodWriter methodWriter1 = new MethodWriter(classWriter0, 1, "", "J*{<Xe3)phz>>\"", (String) null, stringArray0, false, true);
      methodWriter1.visitIincInsn(3, (-359));
      assertNotSame(methodWriter1, methodWriter0);
  }

  @Test(timeout = 4000)
  public void test66()  throws Throwable  {
      String[] stringArray0 = new String[0];
      ClassWriter classWriter0 = new ClassWriter(15);
      MethodWriter methodWriter0 = new MethodWriter(classWriter0, 1, "J*{<Xe3)phz>>\"", "J*{<Xe3)phz>>\"", "", stringArray0, true, true);
      String[] stringArray1 = new String[3];
      stringArray1[0] = "J*{<Xe3)phz>>\"";
      stringArray1[1] = "";
      stringArray1[2] = "J*{<Xe3)phz>>\"";
      MethodWriter methodWriter1 = new MethodWriter(classWriter0, 1, "J*{<Xe3)phz>>\"", "J*{<Xe3)phz>>\"", "", stringArray1, true, false);
      methodWriter1.visitIincInsn(868, 1);
      assertNotSame(methodWriter1, methodWriter0);
  }

  @Test(timeout = 4000)
  public void test67()  throws Throwable  {
      String[] stringArray0 = new String[0];
      ClassWriter classWriter0 = new ClassWriter(15);
      MethodWriter methodWriter0 = new MethodWriter(classWriter0, 1, "J*{<Xe3)phz>>\"", "J*{<Xe3)phz>>\"", "", stringArray0, false, false);
      String[] stringArray1 = new String[3];
      stringArray1[0] = "J*{<Xe3)phz>>\"";
      stringArray1[1] = "";
      stringArray1[2] = "J*{<Xe3)phz>>\"";
      MethodWriter methodWriter1 = new MethodWriter(classWriter0, 1, "J*{<Xe3)phz>>\"", "J*{<Xe3)phz>>\"", "", stringArray1, false, false);
      methodWriter0.visitVarInsn(2, 3749);
      assertNotSame(methodWriter0, methodWriter1);
  }

  @Test(timeout = 4000)
  public void test68()  throws Throwable  {
      ClassWriter classWriter0 = new ClassWriter((-868));
      String[] stringArray0 = new String[1];
      stringArray0[0] = "";
      MethodWriter methodWriter0 = new MethodWriter(classWriter0, 64, "", "", "\u0006s5Y}N87'Q8?|<W", stringArray0, false, false);
      methodWriter0.visitFrame(1, (-868), stringArray0, (-868), stringArray0);
      methodWriter0.visitFieldInsn(0, "\u0006s5Y}N87'Q8?|<W", "StackMap", "StackMap");
      byte[] byteArray0 = classWriter0.toByteArray();
      assertEquals(163, byteArray0.length);
  }
}
