/*

 * Tue Mar 03 14:33:38 GMT 2020
 */

package org.mockito.asm;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.runner.RunWith;
import org.mockito.asm.ClassWriter;
import org.mockito.asm.Label;
import org.mockito.asm.MethodWriter;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = false, useJEE = true) 
public class MethodWriter_ESTest extends MethodWriter_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test00()  throws Throwable  {
      ClassWriter classWriter0 = new ClassWriter((-840));
      MethodWriter methodWriter0 = new MethodWriter(classWriter0, 4067, "bS[H}7&-py..W^Yv8mM", "bS[H}7&-py..W^Yv8mM", "bS[H}7&-py..W^Yv8mM", (String[]) null, false, false);
      methodWriter0.visitVarInsn(4067, (-840));
  }

  @Test(timeout = 4000)
  public void test01()  throws Throwable  {
      ClassWriter classWriter0 = new ClassWriter((-843));
      String[] stringArray0 = new String[1];
      stringArray0[0] = "bS[H}7&-py..W^Yv8mM";
      MethodWriter methodWriter0 = new MethodWriter(classWriter0, 2, "bS[H}7&-py..W^Yv8mM", "bS[H}7&-py..W^Yv8mM", "bS[H}7&-py..W^Yv8mM", stringArray0, false, false);
      Label label0 = new Label();
      methodWriter0.visitFieldInsn((-354), "Z:.3C6=wHkK>ml9P", "Z:.3C6=wHkK>ml9P", "Z:.3C6=wHkK>ml9P");
      methodWriter0.visitLabel(label0);
  }

  @Test(timeout = 4000)
  public void test02()  throws Throwable  {
      ClassWriter classWriter0 = new ClassWriter((-679));
      MethodWriter methodWriter0 = new MethodWriter(classWriter0, 2, "RuntimeVisibleAnnotations", "i%nt", "{", (String[]) null, false, false);
      methodWriter0.visitVarInsn(1, 2879);
  }

  @Test(timeout = 4000)
  public void test03()  throws Throwable  {
      ClassWriter classWriter0 = new ClassWriter(251);
      MethodWriter methodWriter0 = new MethodWriter(classWriter0, 2, "long", "StackMap", "", (String[]) null, false, false);
      methodWriter0.visitMaxs(1219, 125);
      methodWriter0.visitVarInsn(1, 2);
  }

  @Test(timeout = 4000)
  public void test04()  throws Throwable  {
      ClassWriter classWriter0 = new ClassWriter(251);
      MethodWriter methodWriter0 = new MethodWriter(classWriter0, 2, "long", "tckMap", "", (String[]) null, false, false);
      methodWriter0.visitMaxs(1, 125);
      methodWriter0.visitVarInsn(1836, 125);
  }

  @Test(timeout = 4000)
  public void test05()  throws Throwable  {
      ClassWriter classWriter0 = new ClassWriter((-840));
      MethodWriter methodWriter0 = new MethodWriter(classWriter0, 4067, "AtK\")q=Jnu", "AtK\")q=Jnu", "?:%5+", (String[]) null, false, true);
      methodWriter0.visitTypeInsn(41, "?:%5+");
  }

  @Test(timeout = 4000)
  public void test06()  throws Throwable  {
      ClassWriter classWriter0 = new ClassWriter((-679));
      MethodWriter methodWriter0 = new MethodWriter(classWriter0, (-679), "RuntimeVisibleAnnotations", "RuntimeVisibleAnnotations", "i%nt", (String[]) null, false, false);
      methodWriter0.visitTypeInsn((-434), "IHGR./|T ");
  }

  @Test(timeout = 4000)
  public void test07()  throws Throwable  {
      ClassWriter classWriter0 = new ClassWriter((-840));
      MethodWriter methodWriter0 = new MethodWriter(classWriter0, 0, "bS[H}7&-py..W^Yv8mM", "bS[H}7&-py..W^Yv8mM", "bS[H}7&-py..W^Yv8mM", (String[]) null, false, false);
      Label label0 = new Label();
      methodWriter0.visitFieldInsn(63, "}4JW)QBvjJ", "}4JW)QBvjJ", "}4JW)QBvjJ");
      methodWriter0.visitJumpInsn(0, label0);
  }

  @Test(timeout = 4000)
  public void test08()  throws Throwable  {
      ClassWriter classWriter0 = new ClassWriter((-679));
      MethodWriter methodWriter0 = new MethodWriter(classWriter0, 2, "RuntimeVisibleAnnotations", "tT[j,I6U-\"F\"9)D@ein", "tT[j,I6U-\"F\"9)D@ein", (String[]) null, true, false);
      methodWriter0.visitIntInsn((-573), 132);
  }

  @Test(timeout = 4000)
  public void test09()  throws Throwable  {
      ClassWriter classWriter0 = new ClassWriter((-679));
      MethodWriter methodWriter0 = new MethodWriter(classWriter0, 3158, "int", "tT[j,I6U-\"F\"9)D@ein", "RuntimeVisibleAnnotations", (String[]) null, false, true);
      methodWriter0.visitIntInsn(9, 3158);
  }

  @Test(timeout = 4000)
  public void test10()  throws Throwable  {
      ClassWriter classWriter0 = new ClassWriter((-679));
      MethodWriter methodWriter0 = new MethodWriter(classWriter0, 3184, "int", "tT[j,I6U-\"F\"9)D@ein", "RuntimeVisibleAnnotations", (String[]) null, false, true);
      classWriter0.addUninitializedType("java/lang/Object", 4114);
      methodWriter0.visitVarInsn(4, 74);
  }

  @Test(timeout = 4000)
  public void test11()  throws Throwable  {
      ClassWriter classWriter0 = new ClassWriter((-679));
      MethodWriter methodWriter0 = new MethodWriter(classWriter0, 3184, "int", "tT[j,I6U-\"F\"9)D@ein", "RuntimeVisibleAnnotations", (String[]) null, false, true);
      methodWriter0.visitLdcInsn("RuntimeVisibleAnnotations");
      methodWriter0.visitVarInsn(4, 74);
  }

  @Test(timeout = 4000)
  public void test12()  throws Throwable  {
      ClassWriter classWriter0 = new ClassWriter((-679));
      MethodWriter methodWriter0 = new MethodWriter(classWriter0, 3184, "int", "tT[j,I6U-\"F\"9)D@ein", "RuntimeVisibleAnnotations", (String[]) null, false, true);
      methodWriter0.visitVarInsn(4, 74);
      // Undeclared exception!
      try { 
        methodWriter0.visitMaxs(112, 1887);
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // 19
         //
         verifyException("org.mockito.asm.Type", e);
      }
  }

  @Test(timeout = 4000)
  public void test13()  throws Throwable  {
      ClassWriter classWriter0 = new ClassWriter((-679));
      MethodWriter methodWriter0 = new MethodWriter(classWriter0, 2, "RuntimeVisibleAnnotations", "tT[j,I6U-\"F\"9)D@ein", "tT[j,I6U-\"F\"9)D@ein", (String[]) null, true, false);
      methodWriter0.visitFieldInsn(2, "tT[j,I6U-\"F\"9)D@ein", "", "tT[j,I6U-\"F\"9)D@ein");
  }
}
