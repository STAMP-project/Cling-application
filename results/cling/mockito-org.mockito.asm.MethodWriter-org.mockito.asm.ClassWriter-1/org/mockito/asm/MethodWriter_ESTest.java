/*

 * Tue Mar 03 14:29:42 GMT 2020
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
      ClassWriter classWriter0 = new ClassWriter(7);
      String[] stringArray0 = new String[1];
      stringArray0[0] = "b";
      MethodWriter methodWriter0 = new MethodWriter(classWriter0, 0, "b", "b", "~f+V@ksUS@x", stringArray0, false, false);
      Label label0 = new Label();
      methodWriter0.visitFieldInsn(7, "7qKoN`", "38e6kCW ", ";<b]~e/[");
      methodWriter0.visitLabel(label0);
  }

  @Test(timeout = 4000)
  public void test01()  throws Throwable  {
      ClassWriter classWriter0 = new ClassWriter(7);
      String[] stringArray0 = new String[1];
      stringArray0[0] = "b";
      MethodWriter methodWriter0 = new MethodWriter(classWriter0, 119, "~f+V@ksUS@x", "1'Z/Yp*|K@Bwx}2", "b", stringArray0, false, false);
      methodWriter0.visitVarInsn(184, 119);
  }

  @Test(timeout = 4000)
  public void test02()  throws Throwable  {
      ClassWriter classWriter0 = new ClassWriter(1683);
      MethodWriter methodWriter0 = new MethodWriter(classWriter0, 2917, ");3CG~#m", "Signature", (String) null, (String[]) null, false, false);
      methodWriter0.visitVarInsn(2917, 2);
      methodWriter0.visitMaxs(126, 54);
  }

  @Test(timeout = 4000)
  public void test03()  throws Throwable  {
      ClassWriter classWriter0 = new ClassWriter(1683);
      MethodWriter methodWriter0 = new MethodWriter(classWriter0, 2917, ");3CG~#m", "Signature", (String) null, (String[]) null, false, false);
      methodWriter0.visitVarInsn(1, 430);
      methodWriter0.visitMaxs(1, (-3205));
  }

  @Test(timeout = 4000)
  public void test04()  throws Throwable  {
      ClassWriter classWriter0 = new ClassWriter(62);
      String[] stringArray0 = new String[6];
      stringArray0[0] = "[);3CG~s%#m";
      stringArray0[1] = "[);3CG~s%#m";
      stringArray0[2] = "[);3CG~s%#m";
      stringArray0[3] = "[);3CG~s%#m";
      stringArray0[4] = "[);3CG~s%#m";
      stringArray0[5] = "[);3CG~s%#m";
      MethodWriter methodWriter0 = new MethodWriter(classWriter0, (-1617), "[);3CG~s%#m", "[);3CG~s%#m", "hmC#nlR>3qr=q00A", stringArray0, false, false);
      methodWriter0.visitTypeInsn(2, "org.mockito.asm.ClassReader");
  }

  @Test(timeout = 4000)
  public void test05()  throws Throwable  {
      ClassWriter classWriter0 = new ClassWriter(30);
      classWriter0.addType("=Yi?_@2lHb");
      classWriter0.addType("[);3sXCG~s%#m");
      String[] stringArray0 = new String[2];
      stringArray0[0] = "<init>";
      stringArray0[1] = "=Yi?_@2lHb";
      MethodWriter methodWriter0 = new MethodWriter(classWriter0, 1, "[);3sXCG~s%#m", "[);3sXCG~s%#m", "[);3sXCG~s%#m", stringArray0, true, true);
      methodWriter0.visitVarInsn(2, 1105);
  }

  @Test(timeout = 4000)
  public void test06()  throws Throwable  {
      ClassWriter classWriter0 = new ClassWriter(30);
      String[] stringArray0 = new String[2];
      stringArray0[0] = "<init>";
      stringArray0[1] = "[);3sXCG~s%#m";
      MethodWriter methodWriter0 = new MethodWriter(classWriter0, 1, "[);3sXCG~s%#m", "[);3sXCG~s%#m", "[);3sXCG~s%#m", stringArray0, true, true);
      methodWriter0.visitVarInsn(2, 1105);
      methodWriter0.visitLdcInsn("[);3sXCG~s%#m");
  }

  @Test(timeout = 4000)
  public void test07()  throws Throwable  {
      ClassWriter classWriter0 = new ClassWriter(7);
      String[] stringArray0 = new String[1];
      stringArray0[0] = "b";
      MethodWriter methodWriter0 = new MethodWriter(classWriter0, 0, "b", "b", "~f+V@ksUS@x", stringArray0, false, false);
      Label label0 = new Label();
      methodWriter0.visitJumpInsn(2, label0);
      methodWriter0.visitFieldInsn(7, "7qKoN`", "38e6kCW ", ";<b]~e/[");
  }

  @Test(timeout = 4000)
  public void test08()  throws Throwable  {
      ClassWriter classWriter0 = new ClassWriter(30);
      String[] stringArray0 = new String[2];
      stringArray0[0] = "<init>";
      stringArray0[1] = "=Yi?_@2lHb";
      MethodWriter methodWriter0 = new MethodWriter(classWriter0, 1, "[);3sXCG~s%#m", "[);3sXCG~s%#m", "[);3sXCG~s%#m", stringArray0, true, true);
      methodWriter0.visitVarInsn(2, 1105);
      methodWriter0.visitTryCatchBlock((Label) null, (Label) null, (Label) null, "=Yi?_@2lHb");
      // Undeclared exception!
      try { 
        methodWriter0.visitMaxs((-3), 1516);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.mockito.asm.MethodWriter", e);
      }
  }

  @Test(timeout = 4000)
  public void test09()  throws Throwable  {
      ClassWriter classWriter0 = mock(ClassWriter.class, new ViolatedAssumptionAnswer());
      doReturn(285212679, 285212679, 995, 995, 995).when(classWriter0).newClass(anyString());
      doReturn(285212679, 285212679).when(classWriter0).newUTF8(anyString());
      String[] stringArray0 = new String[5];
      MethodWriter methodWriter0 = new MethodWriter(classWriter0, 2, "oFBPXT(&_}O{Y4DE", "_*VIBb#j)WS7p+Fs", "Ec4}d9j5", stringArray0, true, false);
      methodWriter0.visitIntInsn(1, 13);
  }

  @Test(timeout = 4000)
  public void test10()  throws Throwable  {
      ClassWriter classWriter0 = new ClassWriter(30);
      String[] stringArray0 = new String[2];
      stringArray0[0] = "<init>";
      stringArray0[1] = ");3CG~s#m";
      MethodWriter methodWriter0 = new MethodWriter(classWriter0, 30, ");3CG~s#m", "[);3CG~s%#m", "<init>", stringArray0, true, true);
      methodWriter0.visitIntInsn(2, 1120);
  }

  @Test(timeout = 4000)
  public void test11()  throws Throwable  {
      ClassWriter classWriter0 = new ClassWriter(1683);
      MethodWriter methodWriter0 = new MethodWriter(classWriter0, 2912, ");3CG~#m", "Signature", (String) null, (String[]) null, false, false);
      MethodWriter methodWriter1 = new MethodWriter(classWriter0, 303, "c`M)T_iJpyQ", "c`M)T_iJpyQ", "c`M)T_iJpyQ", (String[]) null, true, true);
      Label label0 = new Label();
      methodWriter0.visitLabel(label0);
      methodWriter1.visitVarInsn(1, (-366));
      assertNotSame(methodWriter1, methodWriter0);
  }

  @Test(timeout = 4000)
  public void test12()  throws Throwable  {
      ClassWriter classWriter0 = mock(ClassWriter.class, new ViolatedAssumptionAnswer());
      doReturn(285212679, 285212679, 995, 995, 995).when(classWriter0).newClass(anyString());
      doReturn(285212679, 285212679).when(classWriter0).newUTF8(anyString());
      String[] stringArray0 = new String[5];
      MethodWriter methodWriter0 = new MethodWriter(classWriter0, 2, "oFBPXT(&_}O{Y4DE", "_*VIBb#j)WS7p+Fs", "Ec4}d9j5", stringArray0, true, false);
      // Undeclared exception!
      try { 
        methodWriter0.visitVarInsn(16777226, 285212679);
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // 16777226
         //
         verifyException("org.mockito.asm.MethodWriter", e);
      }
  }

  @Test(timeout = 4000)
  public void test13()  throws Throwable  {
      ClassWriter classWriter0 = new ClassWriter(30);
      String[] stringArray0 = new String[2];
      stringArray0[0] = "<init>";
      stringArray0[1] = "[);3sXCG~s%#m";
      MethodWriter methodWriter0 = new MethodWriter(classWriter0, 1, "[);3sXCG~s%#m", "[);3sXCG~s%#m", "[);3sXCG~s%#m", stringArray0, true, true);
      methodWriter0.visitFieldInsn(1, "ConstantValue", "Code", "[);3sXCG~s%#m");
      methodWriter0.visitVarInsn(2, 2);
  }

  @Test(timeout = 4000)
  public void test14()  throws Throwable  {
      ClassWriter classWriter0 = new ClassWriter(30);
      String[] stringArray0 = new String[6];
      stringArray0[0] = "[);3CG~s%#m";
      stringArray0[1] = "@!w+dm/8Z&hSg";
      stringArray0[2] = "[2V{E$y+&C!r";
      stringArray0[3] = "[2V{E$y+&C!r";
      stringArray0[4] = "[2V{E$y+&C!r";
      stringArray0[5] = "[);3CG~s%#m";
      MethodWriter methodWriter0 = new MethodWriter(classWriter0, 30, "[2V{E$y+&C!r", "[);3CG~s%#m", "[2V{E$y+&C!r", stringArray0, false, true);
      methodWriter0.visitMultiANewArrayInsn("StackMap", 2);
      methodWriter0.visitTypeInsn(1, "");
      methodWriter0.visitMaxs(2, 5027);
  }

  @Test(timeout = 4000)
  public void test15()  throws Throwable  {
      ClassWriter classWriter0 = new ClassWriter(30);
      String[] stringArray0 = new String[6];
      stringArray0[0] = "[);3CG~s%#m";
      stringArray0[1] = "@!w+dm/8Z&hSg";
      stringArray0[2] = "[2V{E$y+&C!r";
      stringArray0[3] = "[2V{E$y+&C!r";
      stringArray0[4] = "[2V{E$y+&C!r";
      stringArray0[5] = "[);3CG~s%#m";
      MethodWriter methodWriter0 = new MethodWriter(classWriter0, 30, "[2V{E$y+&C!r", "[);3CG~s%#m", "[2V{E$y+&C!r", stringArray0, false, true);
      methodWriter0.visitTypeInsn(1, "");
      methodWriter0.visitMaxs(2, 5027);
  }

  @Test(timeout = 4000)
  public void test16()  throws Throwable  {
      ClassWriter classWriter0 = new ClassWriter(30);
      String[] stringArray0 = new String[2];
      stringArray0[0] = "<init>";
      stringArray0[1] = "[);3sXCG~s%#m";
      MethodWriter methodWriter0 = new MethodWriter(classWriter0, 1, "[);3sXCG~s%#m", "[);3sXCG~s%#m", "[);3sXCG~s%#m", stringArray0, true, true);
      methodWriter0.visitLdcInsn(classWriter0.COMPUTE_FRAMES);
      methodWriter0.visitVarInsn(2, 1105);
  }

  @Test(timeout = 4000)
  public void test17()  throws Throwable  {
      ClassWriter classWriter0 = new ClassWriter(1702);
      MethodWriter methodWriter0 = new MethodWriter(classWriter0, 2, "RuntimeInvisibleAnnotations", "PkHT>)89pK>k][", ");3CG~s#m", (String[]) null, true, true);
      methodWriter0.visitLdcInsn(classWriter0.COMPUTE_MAXS);
      methodWriter0.visitVarInsn(4, 1);
  }

  @Test(timeout = 4000)
  public void test18()  throws Throwable  {
      ClassWriter classWriter0 = new ClassWriter(30);
      String[] stringArray0 = new String[2];
      stringArray0[0] = "<init>";
      stringArray0[1] = "=Yi?_@2lHb";
      MethodWriter methodWriter0 = new MethodWriter(classWriter0, 1, "[);3sXCG~s%#m", "[);3sXCG~s%#m", "[);3sXCG~s%#m", stringArray0, true, true);
      methodWriter0.visitVarInsn(2, 1105);
      // Undeclared exception!
      try { 
        methodWriter0.visitMaxs((-3), 1516);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
      }
  }

  @Test(timeout = 4000)
  public void test19()  throws Throwable  {
      ClassWriter classWriter0 = new ClassWriter(30);
      classWriter0.addType("[);3sXCG~s%#m");
      classWriter0.addType("[);3sXCG~s%#m");
      String[] stringArray0 = new String[2];
      stringArray0[0] = "<init>";
      stringArray0[1] = "[);3sXCG~s%#m";
      MethodWriter methodWriter0 = new MethodWriter(classWriter0, 1, "[);3sXCG~s%#m", "[);3sXCG~s%#m", "[);3sXCG~s%#m", stringArray0, true, true);
      methodWriter0.visitVarInsn(2, 1105);
  }

  @Test(timeout = 4000)
  public void test20()  throws Throwable  {
      ClassWriter classWriter0 = new ClassWriter(30);
      String[] stringArray0 = new String[2];
      stringArray0[0] = "<init>";
      stringArray0[1] = "[);3sXCG~s%#m";
      MethodWriter methodWriter0 = new MethodWriter(classWriter0, 1, "[);3sXCG~s%#m", "[);3sXCG~s%#m", "[);3sXCG~s%#m", stringArray0, true, true);
      methodWriter0.visitVarInsn(2, 1105);
      ByteVector byteVector0 = new ByteVector(2913);
      methodWriter0.put(byteVector0);
  }

  @Test(timeout = 4000)
  public void test21()  throws Throwable  {
      ClassWriter classWriter0 = new ClassWriter(1702);
      MethodWriter methodWriter0 = new MethodWriter(classWriter0, 2, "RuntimeInvisibleAnnotations", "PkHT>)89pK>k][", ");3CG~s#m", (String[]) null, true, true);
      methodWriter0.visitMethodInsn(1702, "byte", "Synthetic", "byte");
      methodWriter0.visitVarInsn(4, 1);
  }
}
