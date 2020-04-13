/*

 * Tue Mar 03 14:33:11 GMT 2020
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
import org.mockito.asm.ClassWriter;
import org.mockito.asm.Label;
import org.mockito.asm.MethodWriter;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = false, useJEE = true) 
public class MethodWriter_ESTest extends MethodWriter_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test00()  throws Throwable  {
      String[] stringArray0 = new String[5];
      stringArray0[0] = "~y\"'9EI)l#";
      stringArray0[1] = "AinZkg#Zd{8~<";
      stringArray0[2] = "~y\"'9EI)l#";
      stringArray0[3] = "~y\"'9EI)l#";
      stringArray0[4] = "AinZkg#Zd{8~<";
      ClassWriter classWriter0 = new ClassWriter((-2));
      MethodWriter methodWriter0 = new MethodWriter(classWriter0, (-587), "AinZkg#Zd{8~<", "~y\"'9EI)l#", "~y\"'9EI)l#", stringArray0, true, true);
      methodWriter0.visitTypeInsn(2, "~3I{ape'");
  }

  @Test(timeout = 4000)
  public void test01()  throws Throwable  {
      String[] stringArray0 = new String[5];
      stringArray0[0] = "~y\"'9EI)l#";
      stringArray0[1] = "AinZkg#Zd{8~<";
      stringArray0[2] = "~y\"'9EI)l#";
      stringArray0[3] = "~y\"'9EI)l#";
      stringArray0[4] = "AinZkg#Zd{8~<";
      ClassWriter classWriter0 = new ClassWriter((-2));
      MethodWriter methodWriter0 = new MethodWriter(classWriter0, (-587), "AinZkg#Zd{8~<", "~y\"'9EI)l#", "~y\"'9EI)l#", stringArray0, true, true);
      methodWriter0.visitIntInsn(1, 1);
  }

  @Test(timeout = 4000)
  public void test02()  throws Throwable  {
      ClassWriter classWriter0 = new ClassWriter(2014);
      String[] stringArray0 = new String[2];
      stringArray0[0] = "fX6E@^J*9?mR!#";
      stringArray0[1] = "fX6E@^J*9?mR!#";
      MethodWriter methodWriter0 = new MethodWriter(classWriter0, 2, "fX6E@^J*9?mR!#", "fX6E@^J*9?mR!#", "fX6E@^J*9?mR!#", stringArray0, false, false);
      methodWriter0.visitMaxs(2014, (-295));
      MethodWriter methodWriter1 = new MethodWriter(classWriter0, (-2236), "~\"4HJo", "Bt)I@u?", "fX6E@^J*9?mR!#", stringArray0, true, false);
      methodWriter1.visitTypeInsn(2, "'RZ?/cXl");
      assertFalse(methodWriter1.equals((Object)methodWriter0));
  }

  @Test(timeout = 4000)
  public void test03()  throws Throwable  {
      ClassWriter classWriter0 = new ClassWriter(2014);
      String[] stringArray0 = new String[2];
      stringArray0[0] = "fX6E@^J*9?mR!#";
      stringArray0[1] = "fX6E@^J*9?mR!#";
      MethodWriter methodWriter0 = new MethodWriter(classWriter0, 2, "fX6E@^J*9?mR!#", "fX6E@^J*9?mR!#", "fX6E@^J*9?mR!#", stringArray0, false, false);
      methodWriter0.visitVarInsn(2, (-2656));
  }

  @Test(timeout = 4000)
  public void test04()  throws Throwable  {
      ClassWriter classWriter0 = new ClassWriter((-2103));
      String[] stringArray0 = new String[4];
      stringArray0[0] = "4,>wYdYps&EO#L2T4";
      stringArray0[1] = "4,>wYdYps&EO#L2T4";
      stringArray0[2] = "4,>wYdYps&EO#L2T4";
      stringArray0[3] = "4,>wYdYps&EO#L2T4";
      MethodWriter methodWriter0 = new MethodWriter(classWriter0, 2, "4,>wYdYps&EO#L2T4", "4,>wYdYps&EO#L2T4", "4,>wYdYps&EO#L2T4", stringArray0, false, false);
      methodWriter0.visitVarInsn(65535, 83);
  }

  @Test(timeout = 4000)
  public void test05()  throws Throwable  {
      ClassWriter classWriter0 = mock(ClassWriter.class, new ViolatedAssumptionAnswer());
      doReturn(2, 2, 2, (-956), 2).when(classWriter0).newClass(anyString());
      doReturn((-956), (-956)).when(classWriter0).newUTF8(anyString());
      String[] stringArray0 = new String[5];
      MethodWriter methodWriter0 = new MethodWriter(classWriter0, 566, stringArray0[1], "~y\"'9EI)l#", ".class", stringArray0, true, false);
      methodWriter0.visitVarInsn(101, 16777226);
  }

  @Test(timeout = 4000)
  public void test06()  throws Throwable  {
      ClassWriter classWriter0 = new ClassWriter(19);
      String[] stringArray0 = new String[0];
      MethodWriter methodWriter0 = new MethodWriter(classWriter0, (-1048576), ".class", ".class", "}", stringArray0, false, false);
      methodWriter0.visitMaxs(566, 2);
      methodWriter0.visitVarInsn(566, (-1967));
  }

  @Test(timeout = 4000)
  public void test07()  throws Throwable  {
      ClassWriter classWriter0 = mock(ClassWriter.class, new ViolatedAssumptionAnswer());
      doReturn((-29), (-29), 0, 0, 0).when(classWriter0).newClass(anyString());
      doReturn((-946), (-946)).when(classWriter0).newUTF8(anyString());
      String[] stringArray0 = new String[5];
      MethodWriter methodWriter0 = new MethodWriter(classWriter0, 2, "~y\"'9EI)l#", "", "QG0.cp=}<i", stringArray0, false, false);
      methodWriter0.visitMaxs(2, (-1025));
      methodWriter0.visitVarInsn((-1025), 1076);
  }

  @Test(timeout = 4000)
  public void test08()  throws Throwable  {
      ClassWriter classWriter0 = new ClassWriter(2014);
      String[] stringArray0 = new String[1];
      stringArray0[0] = "fX6E@^J*9?mR!#";
      MethodWriter methodWriter0 = new MethodWriter(classWriter0, 1, "", "fX6E@^J*9?mR!#", "fX6E@^J*9?mR!#", stringArray0, false, false);
      methodWriter0.visitTypeInsn(1, "p\";*fPU _ .R'3&B");
  }

  @Test(timeout = 4000)
  public void test09()  throws Throwable  {
      ClassWriter classWriter0 = new ClassWriter((-2103));
      String[] stringArray0 = new String[4];
      stringArray0[0] = "4,>wYdYps&EO#L2T4";
      stringArray0[1] = "4,>wYdYps&EO#L2T4";
      stringArray0[2] = "4,>wYdYps&EO#L2T4";
      stringArray0[3] = "4,>wYdYps&EO#L2T4";
      MethodWriter methodWriter0 = new MethodWriter(classWriter0, 1, "", "", "4,>wYdYps&EO#L2T4", stringArray0, false, false);
      methodWriter0.visitFieldInsn(184, "QM$Z:2T6]WgD>", "4,>wYdYps&EO#L2T4", "UH}:N@9!9=]");
      Label label0 = new Label();
      methodWriter0.visitJumpInsn(16, label0);
  }

  @Test(timeout = 4000)
  public void test10()  throws Throwable  {
      ClassWriter classWriter0 = mock(ClassWriter.class, new ViolatedAssumptionAnswer());
      doReturn((-29), (-29), (-29), (-946), (-29)).when(classWriter0).newClass(anyString());
      doReturn((-946), (-946)).when(classWriter0).newUTF8(anyString());
      String[] stringArray0 = new String[5];
      MethodWriter methodWriter0 = new MethodWriter(classWriter0, 566, stringArray0[1], "~y\"'9EI)l#", ".class", stringArray0, true, false);
      methodWriter0.visitIntInsn(57, 34);
  }

  @Test(timeout = 4000)
  public void test11()  throws Throwable  {
      ClassWriter classWriter0 = new ClassWriter((-450));
      String[] stringArray0 = new String[7];
      stringArray0[0] = "~y\"'9EI)l#";
      stringArray0[1] = "c;-s";
      stringArray0[2] = "c;-s";
      stringArray0[3] = "LocalVariableTable";
      stringArray0[4] = "~y\"'9EI)l#";
      stringArray0[5] = "c;-s";
      stringArray0[6] = "~y\"'9EI)l#";
      MethodWriter methodWriter0 = new MethodWriter(classWriter0, (-450), "~y\"'9EI)l#", "~y\"'9EI)l#", "~y\"'9EI)l#", stringArray0, true, true);
      methodWriter0.visitFieldInsn(1, "n'IM+", "~y\"'9EI)l#", "qj+Ghk#WT|");
  }

  @Test(timeout = 4000)
  public void test12()  throws Throwable  {
      ClassWriter classWriter0 = mock(ClassWriter.class, new ViolatedAssumptionAnswer());
      doReturn(2, 2, 2, (-951), 2).when(classWriter0).newClass(anyString());
      doReturn((-951), (-951)).when(classWriter0).newUTF8(anyString());
      String[] stringArray0 = new String[5];
      MethodWriter methodWriter0 = new MethodWriter(classWriter0, 566, stringArray0[1], "~y\"'9EI)l#", ".class", stringArray0, true, false);
      methodWriter0.visitVarInsn(1, 1076);
      ClassWriter classWriter1 = new ClassWriter(Integer.MAX_VALUE);
      // Undeclared exception!
      try { 
        classWriter1.getMergedType((-1292), Integer.MAX_VALUE);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.mockito.asm.ClassWriter", e);
      }
  }

  @Test(timeout = 4000)
  public void test13()  throws Throwable  {
      ClassWriter classWriter0 = mock(ClassWriter.class, new ViolatedAssumptionAnswer());
      doReturn(2, 2, 2, (-951), 2).when(classWriter0).newClass(anyString());
      doReturn((-951), (-951)).when(classWriter0).newUTF8(anyString());
      String[] stringArray0 = new String[5];
      MethodWriter methodWriter0 = new MethodWriter(classWriter0, 566, stringArray0[1], "~y\"'9EI)l#", ".class", stringArray0, true, false);
      methodWriter0.visitMaxs((-776), (-776));
      methodWriter0.visitVarInsn(1, 1076);
  }
}
